import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dmd extends dlq {
   public static final MapCodec<dmd> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alp.d(dlt.ai), alp.d(dlt.aj), alp.d(dlt.ak), alp.d(dlt.al), alp.d(dlt.am)).apply($$0, $$0.stable(dmd::new))
   );
   private final jg<dlm> c;
   private final jg<dlm> d;
   private final jg<dlm> e;
   private final jg<dlm> f;
   private final jg<dlm> g;

   public static dmd a(jh<dlm> $$0) {
      return new dmd($$0.b(dlt.ai), $$0.b(dlt.aj), $$0.b(dlt.ak), $$0.b(dlt.al), $$0.b(dlt.am));
   }

   private dmd(jg<dlm> $$0, jg<dlm> $$1, jg<dlm> $$2, jg<dlm> $$3, jg<dlm> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jg<dlm>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dlq> a() {
      return b;
   }

   @Override
   public jg<dlm> getNoiseBiome(int $$0, int $$1, int $$2, dlv.f $$3) {
      int $$4 = jr.c($$0);
      int $$5 = jr.c($$1);
      int $$6 = jr.c($$2);
      int $$7 = jz.a($$4);
      int $$8 = jz.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (jz.a($$4) * 2 + 1) * 8;
         int $$10 = (jz.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new ehi.e($$9, $$5, $$10));
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
