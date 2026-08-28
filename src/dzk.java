import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.BitSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.LongStream;
import javax.annotation.Nullable;

public final class dzk {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<dwx> e = lu.l
      .q()
      .comapFlatMap($$0 -> $$0 == dwx.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<dzk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(dzk::a),
               d.lenientOptionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, dzk::new)
   );
   private static final Set<ala<det>> f = Set.of(dfa.aa, dfa.Z, dfa.ab);
   public static final ddu b = new ddu() {
      @Override
      public int H_() {
         return 64;
      }

      @Override
      public int G_() {
         return -64;
      }
   };
   private final dwx g;
   private final BitSet h;

   private dzk(dwx $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   @Nullable
   public static dzk a(uf $$0) {
      dwx $$1 = dwx.a($$0.l("target_status"));
      return $$1 == dwx.c ? null : new dzk($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
   }

   public static void a(dwq $$0) {
      int $$1 = 4;
      je.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(dgx.F)) {
            $$0.a($$1x, dgx.sJ.o(), false);
         }
      });
   }

   public void b(dwq $$0) {
      ddu $$1 = $$0.y();
      int $$2 = $$1.G_();
      int $$3 = $$1.an() - 1;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               je.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, dgx.a.o(), false));
            }
         }
      }
   }

   public dwx a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static dew a(dew $$0, dvw $$1) {
      if (!$$1.x()) {
         return $$0;
      } else {
         Predicate<ala<det>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            jn<det> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
