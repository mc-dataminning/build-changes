import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.SocketAddress;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;
import jdk.jfr.Configuration;
import jdk.jfr.Event;
import jdk.jfr.FlightRecorder;
import jdk.jfr.FlightRecorderListener;
import jdk.jfr.Recording;
import jdk.jfr.RecordingState;
import net.minecraft.util.profiling.jfr.event.ChunkGenerationEvent;
import net.minecraft.util.profiling.jfr.event.ChunkRegionReadEvent;
import net.minecraft.util.profiling.jfr.event.ChunkRegionWriteEvent;
import net.minecraft.util.profiling.jfr.event.NetworkSummaryEvent;
import net.minecraft.util.profiling.jfr.event.PacketReceivedEvent;
import net.minecraft.util.profiling.jfr.event.PacketSentEvent;
import net.minecraft.util.profiling.jfr.event.ServerTickTimeEvent;
import net.minecraft.util.profiling.jfr.event.WorldLoadFinishedEvent;
import org.slf4j.Logger;

public class bod implements boe {
   private static final Logger g = LogUtils.getLogger();
   public static final String a = "Minecraft";
   public static final String b = "World Generation";
   public static final String c = "Ticking";
   public static final String d = "Network";
   public static final String e = "Storage";
   private static final List<Class<? extends Event>> h = List.of(
      ChunkGenerationEvent.class,
      ChunkRegionReadEvent.class,
      ChunkRegionWriteEvent.class,
      PacketReceivedEvent.class,
      PacketSentEvent.class,
      NetworkSummaryEvent.class,
      ServerTickTimeEvent.class,
      WorldLoadFinishedEvent.class
   );
   private static final String i = "/flightrecorder-config.jfc";
   private static final DateTimeFormatter j = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd-HHmmss").toFormatter().withZone(ZoneId.systemDefault());
   private static final bod k = new bod();
   @Nullable
   Recording l;
   private float m;
   private final Map<String, NetworkSummaryEvent.b> n = new ConcurrentHashMap<>();

   private bod() {
      h.forEach(FlightRecorder::register);
      FlightRecorder.addPeriodicEvent(ServerTickTimeEvent.class, () -> new ServerTickTimeEvent(this.m).commit());
      FlightRecorder.addPeriodicEvent(NetworkSummaryEvent.class, () -> {
         Iterator<NetworkSummaryEvent.b> $$0 = this.n.values().iterator();

         while ($$0.hasNext()) {
            $$0.next().a();
            $$0.remove();
         }
      });
   }

   public static bod a() {
      return k;
   }

   @Override
   public boolean a(boc $$0) {
      URL $$1 = bod.class.getResource("/flightrecorder-config.jfc");
      if ($$1 == null) {
         g.warn("Could not find default flight recorder config at {}", "/flightrecorder-config.jfc");
         return false;
      } else {
         try {
            boolean var4;
            try (BufferedReader $$2 = new BufferedReader(new InputStreamReader($$1.openStream()))) {
               var4 = this.a($$2, $$0);
            }

            return var4;
         } catch (IOException var8) {
            g.warn("Failed to start flight recorder using configuration at {}", $$1, var8);
            return false;
         }
      }
   }

   @Override
   public Path b() {
      if (this.l == null) {
         throw new IllegalStateException("Not currently profiling");
      } else {
         this.n.clear();
         Path $$0 = this.l.getDestination();
         this.l.stop();
         return $$0;
      }
   }

   @Override
   public boolean c() {
      return this.l != null;
   }

   @Override
   public boolean d() {
      return FlightRecorder.isAvailable();
   }

   private boolean a(Reader $$0, boc $$1) {
      if (this.c()) {
         g.warn("Profiling already in progress");
         return false;
      } else {
         try {
            Configuration $$2 = Configuration.create($$0);
            String $$3 = j.format(Instant.now());
            this.l = ad.a(new Recording($$2), $$2x -> {
               h.forEach($$2x::enable);
               $$2x.setDumpOnExit(true);
               $$2x.setToDisk(true);
               $$2x.setName(String.format(Locale.ROOT, "%s-%s-%s", $$1.a(), ab.b().c(), $$3));
            });
            Path $$4 = Paths.get(String.format(Locale.ROOT, "debug/%s-%s.jfr", $$1.a(), $$3));
            v.c($$4.getParent());
            this.l.setDestination($$4);
            this.l.start();
            this.f();
         } catch (ParseException | IOException var6) {
            g.warn("Failed to start jfr profiling", var6);
            return false;
         }

         g.info(
            "Started flight recorder profiling id({}):name({}) - will dump to {} on exit or stop command",
            new Object[]{this.l.getId(), this.l.getName(), this.l.getDestination()}
         );
         return true;
      }
   }

   private void f() {
      FlightRecorder.addListener(new FlightRecorderListener() {
         final bog a = new bog(() -> bod.this.l = null);

         @Override
         public void recordingStateChanged(Recording $$0) {
            if ($$0 == bod.this.l && $$0.getState() == RecordingState.STOPPED) {
               this.a.a($$0.getDestination());
               FlightRecorder.removeListener(this);
            }
         }
      });
   }

   @Override
   public void a(float $$0) {
      if (ServerTickTimeEvent.TYPE.isEnabled()) {
         this.m = $$0;
      }
   }

   @Override
   public void a(vy $$0, zm<?> $$1, SocketAddress $$2, int $$3) {
      if (PacketReceivedEvent.TYPE.isEnabled()) {
         new PacketReceivedEvent($$0.a(), $$1.a().b(), $$1.b().toString(), $$2, $$3).commit();
      }

      if (NetworkSummaryEvent.TYPE.isEnabled()) {
         this.a($$2).b($$3);
      }
   }

   @Override
   public void b(vy $$0, zm<?> $$1, SocketAddress $$2, int $$3) {
      if (PacketSentEvent.TYPE.isEnabled()) {
         new PacketSentEvent($$0.a(), $$1.a().b(), $$1.b().toString(), $$2, $$3).commit();
      }

      if (NetworkSummaryEvent.TYPE.isEnabled()) {
         this.a($$2).a($$3);
      }
   }

   private NetworkSummaryEvent.b a(SocketAddress $$0) {
      return this.n.computeIfAbsent($$0.toString(), NetworkSummaryEvent.b::new);
   }

   @Override
   public void a(dxp $$0, dcy $$1, dxo $$2, int $$3) {
      if (ChunkRegionReadEvent.TYPE.isEnabled()) {
         new ChunkRegionReadEvent($$0, $$1, $$2, $$3).commit();
      }
   }

   @Override
   public void b(dxp $$0, dcy $$1, dxo $$2, int $$3) {
      if (ChunkRegionWriteEvent.TYPE.isEnabled()) {
         new ChunkRegionWriteEvent($$0, $$1, $$2, $$3).commit();
      }
   }

   @Nullable
   @Override
   public boh e() {
      if (!WorldLoadFinishedEvent.TYPE.isEnabled()) {
         return null;
      } else {
         WorldLoadFinishedEvent $$0 = new WorldLoadFinishedEvent();
         $$0.begin();
         return $$0::commit;
      }
   }

   @Nullable
   @Override
   public boh a(dcy $$0, ala<dds> $$1, String $$2) {
      if (!ChunkGenerationEvent.TYPE.isEnabled()) {
         return null;
      } else {
         ChunkGenerationEvent $$3 = new ChunkGenerationEvent($$0, $$1, $$2);
         $$3.begin();
         return $$3::commit;
      }
   }
}
