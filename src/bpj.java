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

public class bpj {
   private Instant a = Instant.EPOCH;
   private Instant b = Instant.EPOCH;
   private final List<bpo> c = Lists.newArrayList();
   private final List<bpv> d = Lists.newArrayList();
   private final List<bpq> e = Lists.newArrayList();
   private final Map<bpu, bpj.a> f = Maps.newHashMap();
   private final Map<bpu, bpj.a> g = Maps.newHashMap();
   private final Map<bpp, bpj.a> h = Maps.newHashMap();
   private final Map<bpp, bpj.a> i = Maps.newHashMap();
   private final List<bpr> j = Lists.newArrayList();
   private final List<bpr> k = Lists.newArrayList();
   private int l;
   private Duration m = Duration.ZERO;
   private final List<bps> n = Lists.newArrayList();
   private final List<bpw> o = Lists.newArrayList();
   private final List<bpx> p = Lists.newArrayList();
   @Nullable
   private Duration q = null;

   private bpj(Stream<RecordedEvent> $$0) {
      this.a($$0);
   }

   public static bpk a(Path $$0) {
      try {
         bpk var4;
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
            var4 = new bpj($$3).a();
         }

         return var4;
      } catch (IOException var7) {
         throw new UncheckedIOException(var7);
      }
   }

   private bpk a() {
      Duration $$0 = Duration.between(this.a, this.b);
      return new bpk(
         this.a,
         this.b,
         $$0,
         this.q,
         this.p,
         this.e,
         bps.a($$0, this.n, this.m, this.l),
         bpw.a(this.o),
         a($$0, this.f),
         a($$0, this.g),
         a($$0, this.i),
         a($$0, this.h),
         bpr.a($$0, this.j),
         bpr.a($$0, this.k),
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
               this.c.add(bpo.a($$0x));
               break;
            case "minecraft.StructureGeneration":
               this.d.add(bpv.a($$0x));
               break;
            case "minecraft.LoadWorld":
               this.q = $$0x.getDuration();
               break;
            case "minecraft.ServerTickTime":
               this.p.add(bpx.a($$0x));
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
               this.o.add(bpw.a($$0x));
               break;
            case "jdk.GCHeapSummary":
               this.n.add(bps.a($$0x));
               break;
            case "jdk.CPULoad":
               this.e.add(bpq.a($$0x));
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

   private void a(RecordedEvent $$0, int $$1, Map<bpu, bpj.a> $$2) {
      $$2.computeIfAbsent(bpu.a($$0), $$0x -> new bpj.a()).a($$1);
   }

   private void b(RecordedEvent $$0, int $$1, Map<bpp, bpj.a> $$2) {
      $$2.computeIfAbsent(bpp.a($$0), $$0x -> new bpj.a()).a($$1);
   }

   private void a(RecordedEvent $$0, List<bpr> $$1, String $$2) {
      $$1.add(new bpr($$0.getDuration(), $$0.getString("path"), $$0.getLong($$2)));
   }

   private static <T> bpt<T> a(Duration $$0, Map<T, bpj.a> $$1) {
      List<Pair<T, bpt.a>> $$2 = $$1.entrySet().stream().map($$0x -> Pair.of($$0x.getKey(), ((bpj.a)$$0x.getValue()).a())).toList();
      return new bpt<>($$0, $$2);
   }

   public static final class a {
      private long a;
      private long b;

      public void a(int $$0) {
         this.b += (long)$$0;
         this.a++;
      }

      public bpt.a a() {
         return new bpt.a(this.a, this.b);
      }
   }
}
