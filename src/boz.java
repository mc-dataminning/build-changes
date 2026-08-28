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

public class boz {
   private Instant a = Instant.EPOCH;
   private Instant b = Instant.EPOCH;
   private final List<bpe> c = Lists.newArrayList();
   private final List<bpg> d = Lists.newArrayList();
   private final Map<bpk, boz.a> e = Maps.newHashMap();
   private final Map<bpk, boz.a> f = Maps.newHashMap();
   private final Map<bpf, boz.a> g = Maps.newHashMap();
   private final Map<bpf, boz.a> h = Maps.newHashMap();
   private final List<bph> i = Lists.newArrayList();
   private final List<bph> j = Lists.newArrayList();
   private int k;
   private Duration l = Duration.ZERO;
   private final List<bpi> m = Lists.newArrayList();
   private final List<bpl> n = Lists.newArrayList();
   private final List<bpm> o = Lists.newArrayList();
   @Nullable
   private Duration p = null;

   private boz(Stream<RecordedEvent> $$0) {
      this.a($$0);
   }

   public static bpa a(Path $$0) {
      try {
         bpa var4;
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
            var4 = new boz($$3).a();
         }

         return var4;
      } catch (IOException var7) {
         throw new UncheckedIOException(var7);
      }
   }

   private bpa a() {
      Duration $$0 = Duration.between(this.a, this.b);
      return new bpa(
         this.a,
         this.b,
         $$0,
         this.p,
         this.o,
         this.d,
         bpi.a($$0, this.m, this.l, this.k),
         bpl.a(this.n),
         a($$0, this.e),
         a($$0, this.f),
         a($$0, this.h),
         a($$0, this.g),
         bph.a($$0, this.i),
         bph.a($$0, this.j),
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
               this.c.add(bpe.a($$0x));
               break;
            case "minecraft.LoadWorld":
               this.p = $$0x.getDuration();
               break;
            case "minecraft.ServerTickTime":
               this.o.add(bpm.a($$0x));
               break;
            case "minecraft.PacketReceived":
               this.a($$0x, $$0x.getInt("bytes"), this.e);
               break;
            case "minecraft.PacketSent":
               this.a($$0x, $$0x.getInt("bytes"), this.f);
               break;
            case "minecraft.ChunkRegionRead":
               this.b($$0x, $$0x.getInt("bytes"), this.g);
               break;
            case "minecraft.ChunkRegionWrite":
               this.b($$0x, $$0x.getInt("bytes"), this.h);
               break;
            case "jdk.ThreadAllocationStatistics":
               this.n.add(bpl.a($$0x));
               break;
            case "jdk.GCHeapSummary":
               this.m.add(bpi.a($$0x));
               break;
            case "jdk.CPULoad":
               this.d.add(bpg.a($$0x));
               break;
            case "jdk.FileWrite":
               this.a($$0x, this.i, "bytesWritten");
               break;
            case "jdk.FileRead":
               this.a($$0x, this.j, "bytesRead");
               break;
            case "jdk.GarbageCollection":
               this.k++;
               this.l = this.l.plus($$0x.getDuration());
         }
      });
   }

   private void a(RecordedEvent $$0, int $$1, Map<bpk, boz.a> $$2) {
      $$2.computeIfAbsent(bpk.a($$0), $$0x -> new boz.a()).a($$1);
   }

   private void b(RecordedEvent $$0, int $$1, Map<bpf, boz.a> $$2) {
      $$2.computeIfAbsent(bpf.a($$0), $$0x -> new boz.a()).a($$1);
   }

   private void a(RecordedEvent $$0, List<bph> $$1, String $$2) {
      $$1.add(new bph($$0.getDuration(), $$0.getString("path"), $$0.getLong($$2)));
   }

   private static <T> bpj<T> a(Duration $$0, Map<T, boz.a> $$1) {
      List<Pair<T, bpj.a>> $$2 = $$1.entrySet().stream().map($$0x -> Pair.of($$0x.getKey(), ((boz.a)$$0x.getValue()).a())).toList();
      return new bpj<>($$0, $$2);
   }

   public static final class a {
      private long a;
      private long b;

      public void a(int $$0) {
         this.b += (long)$$0;
         this.a++;
      }

      public bpj.a a() {
         return new bpj.a(this.a, this.b);
      }
   }
}
