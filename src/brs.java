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

public class brs {
   private Instant a = Instant.EPOCH;
   private Instant b = Instant.EPOCH;
   private final List<brx> c = Lists.newArrayList();
   private final List<bse> d = Lists.newArrayList();
   private final List<brz> e = Lists.newArrayList();
   private final Map<bsd, brs.a> f = Maps.newHashMap();
   private final Map<bsd, brs.a> g = Maps.newHashMap();
   private final Map<bry, brs.a> h = Maps.newHashMap();
   private final Map<bry, brs.a> i = Maps.newHashMap();
   private final List<bsa> j = Lists.newArrayList();
   private final List<bsa> k = Lists.newArrayList();
   private int l;
   private Duration m = Duration.ZERO;
   private final List<bsb> n = Lists.newArrayList();
   private final List<bsf> o = Lists.newArrayList();
   private final List<bsg> p = Lists.newArrayList();
   @Nullable
   private Duration q = null;

   private brs(Stream<RecordedEvent> $$0) {
      this.a($$0);
   }

   public static brt a(Path $$0) {
      try {
         brt var4;
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
            var4 = new brs($$3).a();
         }

         return var4;
      } catch (IOException var7) {
         throw new UncheckedIOException(var7);
      }
   }

   private brt a() {
      Duration $$0 = Duration.between(this.a, this.b);
      return new brt(
         this.a,
         this.b,
         $$0,
         this.q,
         this.p,
         this.e,
         bsb.a($$0, this.n, this.m, this.l),
         bsf.a(this.o),
         a($$0, this.f),
         a($$0, this.g),
         a($$0, this.i),
         a($$0, this.h),
         bsa.a($$0, this.j),
         bsa.a($$0, this.k),
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
               this.c.add(brx.a($$0x));
               break;
            case "minecraft.StructureGeneration":
               this.d.add(bse.a($$0x));
               break;
            case "minecraft.LoadWorld":
               this.q = $$0x.getDuration();
               break;
            case "minecraft.ServerTickTime":
               this.p.add(bsg.a($$0x));
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
               this.o.add(bsf.a($$0x));
               break;
            case "jdk.GCHeapSummary":
               this.n.add(bsb.a($$0x));
               break;
            case "jdk.CPULoad":
               this.e.add(brz.a($$0x));
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

   private void a(RecordedEvent $$0, int $$1, Map<bsd, brs.a> $$2) {
      $$2.computeIfAbsent(bsd.a($$0), $$0x -> new brs.a()).a($$1);
   }

   private void b(RecordedEvent $$0, int $$1, Map<bry, brs.a> $$2) {
      $$2.computeIfAbsent(bry.a($$0), $$0x -> new brs.a()).a($$1);
   }

   private void a(RecordedEvent $$0, List<bsa> $$1, String $$2) {
      $$1.add(new bsa($$0.getDuration(), $$0.getString("path"), $$0.getLong($$2)));
   }

   private static <T> bsc<T> a(Duration $$0, Map<T, brs.a> $$1) {
      List<Pair<T, bsc.a>> $$2 = $$1.entrySet().stream().map($$0x -> Pair.of($$0x.getKey(), ((brs.a)$$0x.getValue()).a())).toList();
      return new bsc<>($$0, $$2);
   }

   public static final class a {
      private long a;
      private long b;

      public void a(int $$0) {
         this.b += (long)$$0;
         this.a++;
      }

      public bsc.a a() {
         return new bsc.a(this.a, this.b);
      }
   }
}
