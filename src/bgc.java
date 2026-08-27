import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordingFile;

public class bgc {
   private Instant a = Instant.EPOCH;
   private Instant b = Instant.EPOCH;
   private final List<bgh> c = Lists.newArrayList();
   private final List<bgi> d = Lists.newArrayList();
   private final Map<bgl.b, bgc.a> e = Maps.newHashMap();
   private final Map<bgl.b, bgc.a> f = Maps.newHashMap();
   private final List<bgj> g = Lists.newArrayList();
   private final List<bgj> h = Lists.newArrayList();
   private int i;
   private Duration j = Duration.ZERO;
   private final List<bgk> k = Lists.newArrayList();
   private final List<bgm> l = Lists.newArrayList();
   private final List<bgn> m = Lists.newArrayList();
   @Nullable
   private Duration n = null;

   private bgc(Stream<RecordedEvent> $$0) {
      this.a($$0);
   }

   public static bgd a(Path $$0) {
      try {
         bgd var4;
         try (final RecordingFile $$1 = new RecordingFile($$0)) {
            Iterator<RecordedEvent> $$2 = new Iterator<RecordedEvent>() {
               @Override
               public boolean hasNext() {
                  return $$1.hasMoreEvents();
               }

               public RecordedEvent a() {
                  if (!this.hasNext()) {
                     throw new NoSuchElementException();
                  } else {
                     try {
                        return $$1.readEvent();
                     } catch (IOException var2) {
                        throw new UncheckedIOException(var2);
                     }
                  }
               }
            };
            Stream<RecordedEvent> $$3 = StreamSupport.stream(Spliterators.spliteratorUnknownSize($$2, 1297), false);
            var4 = new bgc($$3).a();
         }

         return var4;
      } catch (IOException var7) {
         throw new UncheckedIOException(var7);
      }
   }

   private bgd a() {
      Duration $$0 = Duration.between(this.a, this.b);
      return new bgd(
         this.a,
         this.b,
         $$0,
         this.n,
         this.m,
         this.d,
         bgk.a($$0, this.k, this.j, this.i),
         bgm.a(this.l),
         a($$0, this.e),
         a($$0, this.f),
         bgj.a($$0, this.g),
         bgj.a($$0, this.h),
         this.c
      );
   }

   private void a(Stream<RecordedEvent> $$0) {
      $$0.forEach($$0x -> {
         if ($$0x.getEndTime().isAfter(this.b) || this.b.equals(Instant.EPOCH)) {
            this.b = $$0x.getEndTime();
         }

         if ($$0x.getStartTime().isBefore(this.a) || this.a.equals(Instant.EPOCH)) {
            this.a = $$0x.getStartTime();
         }

         String var2 = $$0x.getEventType().getName();
         switch (var2) {
            case "minecraft.ChunkGeneration":
               this.c.add(bgh.a($$0x));
               break;
            case "minecraft.LoadWorld":
               this.n = $$0x.getDuration();
               break;
            case "minecraft.ServerTickTime":
               this.m.add(bgn.a($$0x));
               break;
            case "minecraft.PacketReceived":
               this.a($$0x, $$0x.getInt("bytes"), this.e);
               break;
            case "minecraft.PacketSent":
               this.a($$0x, $$0x.getInt("bytes"), this.f);
               break;
            case "jdk.ThreadAllocationStatistics":
               this.l.add(bgm.a($$0x));
               break;
            case "jdk.GCHeapSummary":
               this.k.add(bgk.a($$0x));
               break;
            case "jdk.CPULoad":
               this.d.add(bgi.a($$0x));
               break;
            case "jdk.FileWrite":
               this.a($$0x, this.g, "bytesWritten");
               break;
            case "jdk.FileRead":
               this.a($$0x, this.h, "bytesRead");
               break;
            case "jdk.GarbageCollection":
               this.i++;
               this.j = this.j.plus($$0x.getDuration());
         }
      });
   }

   private void a(RecordedEvent $$0, int $$1, Map<bgl.b, bgc.a> $$2) {
      $$2.computeIfAbsent(bgl.b.a($$0), $$0x -> new bgc.a()).a($$1);
   }

   private void a(RecordedEvent $$0, List<bgj> $$1, String $$2) {
      $$1.add(new bgj($$0.getDuration(), $$0.getString("path"), $$0.getLong($$2)));
   }

   private static bgl a(Duration $$0, Map<bgl.b, bgc.a> $$1) {
      List<Pair<bgl.b, bgl.a>> $$2 = $$1.entrySet().stream().map($$0x -> Pair.of((bgl.b)$$0x.getKey(), ((bgc.a)$$0x.getValue()).a())).toList();
      return new bgl($$0, $$2);
   }

   public static final class a {
      private long a;
      private long b;

      public void a(int $$0) {
         this.b += (long)$$0;
         this.a++;
      }

      public bgl.a a() {
         return new bgl.a(this.a, this.b);
      }
   }
}
