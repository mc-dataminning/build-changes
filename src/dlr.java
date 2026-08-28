import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dlr extends dle {
   public static final MapCodec<dlr> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alg.d(dlh.ai), alg.d(dlh.aj), alg.d(dlh.ak), alg.d(dlh.al), alg.d(dlh.am)).apply($$0, $$0.stable(dlr::new))
   );
   private final jf<dla> c;
   private final jf<dla> d;
   private final jf<dla> e;
   private final jf<dla> f;
   private final jf<dla> g;

   public static dlr a(jg<dla> $$0) {
      return new dlr($$0.b(dlh.ai), $$0.b(dlh.aj), $$0.b(dlh.ak), $$0.b(dlh.al), $$0.b(dlh.am));
   }

   private dlr(jf<dla> $$0, jf<dla> $$1, jf<dla> $$2, jf<dla> $$3, jf<dla> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jf<dla>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dle> a() {
      return b;
   }

   @Override
   public jf<dla> getNoiseBiome(int $$0, int $$1, int $$2, dlj.f $$3) {
      int $$4 = jq.c($$0);
      int $$5 = jq.c($$1);
      int $$6 = jq.c($$2);
      int $$7 = jy.a($$4);
      int $$8 = jy.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (jy.a($$4) * 2 + 1) * 8;
         int $$10 = (jy.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new egw.e($$9, $$5, $$10));
         if ($$11 > 0.25) {
            return this.d;
         } else if ($$11 >= -0.0625) {
            return this.e;
         } else {
            return $$11 < -0.21875 ? this.f : this.g;
         }
      }
   }
}
