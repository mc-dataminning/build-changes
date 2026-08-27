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

public class bfg {
   private Instant a = Instant.EPOCH;
   private Instant b = Instant.EPOCH;
   private final List<bfl> c = Lists.newArrayList();
   private final List<bfm> d = Lists.newArrayList();
   private final Map<bfp.b, bfg.a> e = Maps.newHashMap();
   private final Map<bfp.b, bfg.a> f = Maps.newHashMap();
   private final List<bfn> g = Lists.newArrayList();
   private final List<bfn> h = Lists.newArrayList();
   private int i;
   private Duration j = Duration.ZERO;
   private final List<bfo> k = Lists.newArrayList();
   private final List<bfq> l = Lists.newArrayList();
   private final List<bfr> m = Lists.newArrayList();
   @Nullable
   private Duration n = null;

   private bfg(Stream<RecordedEvent> $$0) {
      this.a($$0);
   }

   public static bfh a(Path $$0) {
      try {
         bfh var4;
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
            var4 = new bfg($$3).a();
         }

         return var4;
      } catch (IOException var7) {
         throw new UncheckedIOException(var7);
      }
   }

   private bfh a() {
      Duration $$0 = Duration.between(this.a, this.b);
      return new bfh(
         this.a,
         this.b,
         $$0,
         this.n,
         this.m,
         this.d,
         bfo.a($$0, this.k, this.j, this.i),
         bfq.a(this.l),
         a($$0, this.e),
         a($$0, this.f),
         bfn.a($$0, this.g),
         bfn.a($$0, this.h),
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
               this.c.add(bfl.a($$0x));
               break;
            case "minecraft.LoadWorld":
               this.n = $$0x.getDuration();
               break;
            case "minecraft.ServerTickTime":
               this.m.add(bfr.a($$0x));
               break;
            case "minecraft.PacketReceived":
               this.a($$0x, $$0x.getInt("bytes"), this.e);
               break;
            case "minecraft.PacketSent":
               this.a($$0x, $$0x.getInt("bytes"), this.f);
               break;
            case "jdk.ThreadAllocationStatistics":
               this.l.add(bfq.a($$0x));
               break;
            case "jdk.GCHeapSummary":
               this.k.add(bfo.a($$0x));
               break;
            case "jdk.CPULoad":
               this.d.add(bfm.a($$0x));
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

   private void a(RecordedEvent $$0, int $$1, Map<bfp.b, bfg.a> $$2) {
      $$2.computeIfAbsent(bfp.b.a($$0), $$0x -> new bfg.a()).a($$1);
   }

   private void a(RecordedEvent $$0, List<bfn> $$1, String $$2) {
      $$1.add(new bfn($$0.getDuration(), $$0.getString("path"), $$0.getLong($$2)));
   }

   private static bfp a(Duration $$0, Map<bfp.b, bfg.a> $$1) {
      List<Pair<bfp.b, bfp.a>> $$2 = $$1.entrySet().stream().map($$0x -> Pair.of((bfp.b)$$0x.getKey(), ((bfg.a)$$0x.getValue()).a())).toList();
      return new bfp($$0, $$2);
   }

   public static final class a {
      private long a;
      private long b;

      public void a(int $$0) {
         this.b += (long)$$0;
         this.a++;
      }

      public bfp.a a() {
         return new bfp.a(this.a, this.b);
      }
   }
}
