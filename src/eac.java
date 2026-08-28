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

public final class eac {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<dxp> e = lv.l
      .q()
      .comapFlatMap($$0 -> $$0 == dxp.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<eac> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(eac::a),
               d.lenientOptionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, eac::new)
   );
   private static final Set<ald<dfk>> f = Set.of(dfr.aa, dfr.Z, dfr.ab);
   public static final del b = new del() {
      @Override
      public int I_() {
         return 64;
      }

      @Override
      public int H_() {
         return -64;
      }
   };
   private final dxp g;
   private final BitSet h;

   private eac(dxp $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = $$1.orElse(c);
   }

   @Nullable
   public static eac a(ug $$0) {
      dxp $$1 = dxp.a($$0.l("target_status"));
      return $$1 == dxp.c ? null : new eac($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
   }

   public static void a(dxi $$0) {
      int $$1 = 4;
      jf.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(dho.F)) {
            $$0.a($$1x, dho.sJ.n(), false);
         }
      });
   }

   public void b(dxi $$0) {
      del $$1 = $$0.y();
      int $$2 = $$1.H_();
      int $$3 = $$1.an();

      for (int $$4 = 0; $$4 < 16; $$4++) {
         for (int $$5 = 0; $$5 < 16; $$5++) {
            if (this.a($$4, $$5)) {
               jf.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, dho.a.n(), false));
            }
         }
      }
   }

   public dxp a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static dfn a(dfn $$0, dwo $$1) {
      if (!$$1.x()) {
         return $$0;
      } else {
         Predicate<ald<dfk>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            jo<dfk> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
