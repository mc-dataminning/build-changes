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

public final class edd {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<eaq> e = ma.l
      .q()
      .comapFlatMap($$0 -> $$0 == eaq.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<edd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(edd::a),
               d.lenientOptionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, edd::new)
   );
   private static final Set<aly<dij>> f = Set.of(diq.aa, diq.Z, diq.ab);
   public static final dhj b = new dhj() {
      @Override
      public int M_() {
         return 64;
      }

      @Override
      public int L_() {
         return -64;
      }
   };
   private final eaq g;
   private final BitSet h;

   private edd(eaq $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   @Nullable
   public static edd a(ux $$0) {
      eaq $$1 = eaq.a($$0.l("target_status"));
      return $$1 == eaq.c ? null : new edd($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
   }

   public static void a(eaj $$0) {
      int $$1 = 4;
      jh.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(dkn.I)) {
            $$0.a($$1x, dkn.te.m(), false);
         }
      });
   }

   public void b(eaj $$0) {
      dhj $$1 = $$0.y();
      int $$2 = $$1.L_();
      int $$3 = $$1.am();

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               jh.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, dkn.a.m(), false));
            }
         }
      }
   }

   public eaq a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static dim a(dim $$0, dzp $$1) {
      if (!$$1.x()) {
         return $$0;
      } else {
         Predicate<aly<dij>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            jq<dij> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
