import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.BitSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public final class egr {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<eec> e = mg.l
      .q()
      .comapFlatMap($$0 -> $$0 == eec.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<egr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(egr::a),
               d.lenientOptionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, egr::new)
   );
   private static final Set<alh<dla>> f = Set.of(dlh.ab, dlh.aa, dlh.ac);
   public static final djz b = new djz() {
      @Override
      public int L_() {
         return 64;
      }

      @Override
      public int K_() {
         return -64;
      }
   };
   private final eec g;
   private final BitSet h;

   private egr(eec $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   public static void a(edv $$0) {
      int $$1 = 4;
      iv.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(dne.I)) {
            $$0.a($$1x, dne.tt.m());
         }
      });
   }

   public void b(edv $$0) {
      djz $$1 = $$0.B();
      int $$2 = $$1.K_();
      int $$3 = $$1.ao();

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               iv.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, dne.a.m()));
            }
         }
      }
   }

   public eec a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static dld a(dld $$0, edb $$1) {
      if (!$$1.A()) {
         return $$0;
      } else {
         Predicate<alh<dla>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            jf<dla> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
