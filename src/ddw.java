import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ddw extends ddj {
   public static final MapCodec<ddw> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aki.d(ddm.ah), aki.d(ddm.ai), aki.d(ddm.aj), aki.d(ddm.ak), aki.d(ddm.al)).apply($$0, $$0.stable(ddw::new))
   );
   private final jj<ddf> c;
   private final jj<ddf> d;
   private final jj<ddf> e;
   private final jj<ddf> f;
   private final jj<ddf> g;

   public static ddw a(jk<ddf> $$0) {
      return new ddw($$0.b(ddm.ah), $$0.b(ddm.ai), $$0.b(ddm.aj), $$0.b(ddm.ak), $$0.b(ddm.al));
   }

   private ddw(jj<ddf> $$0, jj<ddf> $$1, jj<ddf> $$2, jj<ddf> $$3, jj<ddf> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jj<ddf>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends ddj> a() {
      return b;
   }

   @Override
   public jj<ddf> getNoiseBiome(int $$0, int $$1, int $$2, ddo.f $$3) {
      int $$4 = ju.c($$0);
      int $$5 = ju.c($$1);
      int $$6 = ju.c($$2);
      int $$7 = kc.a($$4);
      int $$8 = kc.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (kc.a($$4) * 2 + 1) * 8;
         int $$10 = (kc.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dxy.e($$9, $$5, $$10));
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
