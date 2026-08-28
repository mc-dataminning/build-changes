import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.BitSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public final class egt {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<eee> e = mh.l
      .q()
      .comapFlatMap($$0 -> $$0 == eee.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<egt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(egt::a),
               d.lenientOptionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, egt::new)
   );
   private static final Set<alj<dlc>> f = Set.of(dlj.ab, dlj.aa, dlj.ac);
   public static final dkb b = new dkb() {
      @Override
      public int L_() {
         return 64;
      }

      @Override
      public int K_() {
         return -64;
      }
   };
   private final eee g;
   private final BitSet h;

   private egt(eee $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   public static void a(edx $$0) {
      int $$1 = 4;
      iw.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(dng.I)) {
            $$0.a($$1x, dng.tt.m());
         }
      });
   }

   public void b(edx $$0) {
      dkb $$1 = $$0.B();
      int $$2 = $$1.K_();
      int $$3 = $$1.ao();

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               iw.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, dng.a.m()));
            }
         }
      }
   }

   public eee a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static dlf a(dlf $$0, edd $$1) {
      if (!$$1.A()) {
         return $$0;
      } else {
         Predicate<alj<dlc>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            jg<dlc> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
