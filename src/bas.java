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
import net.minecraft.util.profiling.jfr.event.NetworkSummaryEvent;
import net.minecraft.util.profiling.jfr.event.PacketReceivedEvent;
import net.minecraft.util.profiling.jfr.event.PacketSentEvent;
import net.minecraft.util.profiling.jfr.event.ServerTickTimeEvent;
import net.minecraft.util.profiling.jfr.event.WorldLoadFinishedEvent;
import org.slf4j.Logger;

public class bas implements bat {
   private static final Logger f = LogUtils.getLogger();
   public static final String a = "Minecraft";
   public static final String b = "World Generation";
   public static final String c = "Ticking";
   public static final String d = "Network";
   private static final List<Class<? extends Event>> g = List.of(
      ChunkGenerationEvent.class,
      PacketReceivedEvent.class,
      PacketSentEvent.class,
      NetworkSummaryEvent.class,
      ServerTickTimeEvent.class,
      WorldLoadFinishedEvent.class
   );
   private static final String h = "/flightrecorder-config.jfc";
   private static final DateTimeFormatter i = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd-HHmmss").toFormatter().withZone(ZoneId.systemDefault());
   private static final bas j = new bas();
   @Nullable
   Recording k;
   private float l;
   private final Map<String, NetworkSummaryEvent.b> m = new ConcurrentHashMap<>();

   private bas() {
      g.forEach(FlightRecorder::register);
      FlightRecorder.addPeriodicEvent(ServerTickTimeEvent.class, () -> new ServerTickTimeEvent(this.l).commit());
      FlightRecorder.addPeriodicEvent(NetworkSummaryEvent.class, () -> {
         Iterator<NetworkSummaryEvent.b> $$0 = this.m.values().iterator();

         while ($$0.hasNext()) {
            $$0.next().a();
            $$0.remove();
         }
      });
   }

   public static bas a() {
      return j;
   }

   @Override
   public boolean a(bar $$0) {
      URL $$1 = bas.class.getResource("/flightrecorder-config.jfc");
      if ($$1 == null) {
         f.warn("Could not find default flight recorder config at {}", "/flightrecorder-config.jfc");
         return false;
      } else {
         try {
            boolean var4;
            try (BufferedReader $$2 = new BufferedReader(new InputStreamReader($$1.openStream()))) {
               var4 = this.a($$2, $$0);
            }

            return var4;
         } catch (IOException var8) {
            f.warn("Failed to start flight recorder using configuration at {}", $$1, var8);
            return false;
         }
      }
   }

   @Override
   public Path b() {
      if (this.k == null) {
         throw new IllegalStateException("Not currently profiling");
      } else {
         this.m.clear();
         Path $$0 = this.k.getDestination();
         this.k.stop();
         return $$0;
      }
   }

   @Override
   public boolean c() {
      return this.k != null;
   }

   @Override
   public boolean d() {
      return FlightRecorder.isAvailable();
   }

   private boolean a(Reader $$0, bar $$1) {
      if (this.c()) {
         f.warn("Profiling already in progress");
         return false;
      } else {
         try {
            Configuration $$2 = Configuration.create($$0);
            String $$3 = i.format(Instant.now());
            this.k = ac.a(new Recording($$2), $$2x -> {
               g.forEach($$2x::enable);
               $$2x.setDumpOnExit(true);
               $$2x.setToDisk(true);
               $$2x.setName(String.format(Locale.ROOT, "%s-%s-%s", $$1.a(), aa.b().c(), $$3));
            });
            Path $$4 = Paths.get(String.format(Locale.ROOT, "debug/%s-%s.jfr", $$1.a(), $$3));
            v.c($$4.getParent());
            this.k.setDestination($$4);
            this.k.start();
            this.f();
         } catch (ParseException | IOException var6) {
            f.warn("Failed to start jfr profiling", var6);
            return false;
         }

         f.info(
            "Started flight recorder profiling id({}):name({}) - will dump to {} on exit or stop command",
            new Object[]{this.k.getId(), this.k.getName(), this.k.getDestination()}
         );
         return true;
      }
   }

   private void f() {
      FlightRecorder.addListener(new FlightRecorderListener() {
         final bav a = new bav(() -> bas.this.k = null);

         @Override
         public void recordingStateChanged(Recording $$0) {
            if ($$0 == bas.this.k && $$0.getState() == RecordingState.STOPPED) {
               this.a.a($$0.getDestination());
               FlightRecorder.removeListener(this);
            }
         }
      });
   }

   @Override
   public void a(float $$0) {
      if (ServerTickTimeEvent.TYPE.isEnabled()) {
         this.l = $$0;
      }
   }

   @Override
   public void a(int $$0, int $$1, SocketAddress $$2, int $$3) {
      if (PacketReceivedEvent.TYPE.isEnabled()) {
         new PacketReceivedEvent($$0, $$1, $$2, $$3).commit();
      }

      if (NetworkSummaryEvent.TYPE.isEnabled()) {
         this.a($$2).b($$3);
      }
   }

   @Override
   public void b(int $$0, int $$1, SocketAddress $$2, int $$3) {
      if (PacketSentEvent.TYPE.isEnabled()) {
         new PacketSentEvent($$0, $$1, $$2, $$3).commit();
      }

      if (NetworkSummaryEvent.TYPE.isEnabled()) {
         this.a($$2).a($$3);
      }
   }

   private NetworkSummaryEvent.b a(SocketAddress $$0) {
      return this.m.computeIfAbsent($$0.toString(), NetworkSummaryEvent.b::new);
   }

   @Nullable
   @Override
   public baw e() {
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
   public baw a(clt $$0, acp<cmm> $$1, String $$2) {
      if (!ChunkGenerationEvent.TYPE.isEnabled()) {
         return null;
      } else {
         ChunkGenerationEvent $$3 = new ChunkGenerationEvent($$0, $$1, $$2);
         $$3.begin();
         return $$3::commit;
      }
   }
}
