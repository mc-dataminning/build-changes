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

public class bqs {
   private Instant a = Instant.EPOCH;
   private Instant b = Instant.EPOCH;
   private final List<bqx> c = Lists.newArrayList();
   private final List<bre> d = Lists.newArrayList();
   private final List<bqz> e = Lists.newArrayList();
   private final Map<brd, bqs.a> f = Maps.newHashMap();
   private final Map<brd, bqs.a> g = Maps.newHashMap();
   private final Map<bqy, bqs.a> h = Maps.newHashMap();
   private final Map<bqy, bqs.a> i = Maps.newHashMap();
   private final List<bra> j = Lists.newArrayList();
   private final List<bra> k = Lists.newArrayList();
   private int l;
   private Duration m = Duration.ZERO;
   private final List<brb> n = Lists.newArrayList();
   private final List<brf> o = Lists.newArrayList();
   private final List<brg> p = Lists.newArrayList();
   @Nullable
   private Duration q = null;

   private bqs(Stream<RecordedEvent> $$0) {
      this.a($$0);
   }

   public static bqt a(Path $$0) {
      try {
         bqt var4;
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
            var4 = new bqs($$3).a();
         }

         return var4;
      } catch (IOException var7) {
         throw new UncheckedIOException(var7);
      }
   }

   private bqt a() {
      Duration $$0 = Duration.between(this.a, this.b);
      return new bqt(
         this.a,
         this.b,
         $$0,
         this.q,
         this.p,
         this.e,
         brb.a($$0, this.n, this.m, this.l),
         brf.a(this.o),
         a($$0, this.f),
         a($$0, this.g),
         a($$0, this.i),
         a($$0, this.h),
         bra.a($$0, this.j),
         bra.a($$0, this.k),
         this.c,
         this.d
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
               this.c.add(bqx.a($$0x));
               break;
            case "minecraft.StructureGeneration":
               this.d.add(bre.a($$0x));
               break;
            case "minecraft.LoadWorld":
               this.q = $$0x.getDuration();
               break;
            case "minecraft.ServerTickTime":
               this.p.add(brg.a($$0x));
               break;
            case "minecraft.PacketReceived":
               this.a($$0x, $$0x.getInt("bytes"), this.f);
               break;
            case "minecraft.PacketSent":
               this.a($$0x, $$0x.getInt("bytes"), this.g);
               break;
            case "minecraft.ChunkRegionRead":
               this.b($$0x, $$0x.getInt("bytes"), this.h);
               break;
            case "minecraft.ChunkRegionWrite":
               this.b($$0x, $$0x.getInt("bytes"), this.i);
               break;
            case "jdk.ThreadAllocationStatistics":
               this.o.add(brf.a($$0x));
               break;
            case "jdk.GCHeapSummary":
               this.n.add(brb.a($$0x));
               break;
            case "jdk.CPULoad":
               this.e.add(bqz.a($$0x));
               break;
            case "jdk.FileWrite":
               this.a($$0x, this.j, "bytesWritten");
               break;
            case "jdk.FileRead":
               this.a($$0x, this.k, "bytesRead");
               break;
            case "jdk.GarbageCollection":
               this.l++;
               this.m = this.m.plus($$0x.getDuration());
         }
      });
   }

   private void a(RecordedEvent $$0, int $$1, Map<brd, bqs.a> $$2) {
      $$2.computeIfAbsent(brd.a($$0), $$0x -> new bqs.a()).a($$1);
   }

   private void b(RecordedEvent $$0, int $$1, Map<bqy, bqs.a> $$2) {
      $$2.computeIfAbsent(bqy.a($$0), $$0x -> new bqs.a()).a($$1);
   }

   private void a(RecordedEvent $$0, List<bra> $$1, String $$2) {
      $$1.add(new bra($$0.getDuration(), $$0.getString("path"), $$0.getLong($$2)));
   }

   private static <T> brc<T> a(Duration $$0, Map<T, bqs.a> $$1) {
      List<Pair<T, brc.a>> $$2 = $$1.entrySet().stream().map($$0x -> Pair.of($$0x.getKey(), ((bqs.a)$$0x.getValue()).a())).toList();
      return new brc<>($$0, $$2);
   }

   public static final class a {
      private long a;
      private long b;

      public void a(int $$0) {
         this.b += (long)$$0;
         this.a++;
      }

      public brc.a a() {
         return new brc.a(this.a, this.b);
      }
   }
}
