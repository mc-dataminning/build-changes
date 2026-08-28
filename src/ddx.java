import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ddx extends ddk {
   public static final MapCodec<ddx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aki.d(ddn.ah), aki.d(ddn.ai), aki.d(ddn.aj), aki.d(ddn.ak), aki.d(ddn.al)).apply($$0, $$0.stable(ddx::new))
   );
   private final jj<ddg> c;
   private final jj<ddg> d;
   private final jj<ddg> e;
   private final jj<ddg> f;
   private final jj<ddg> g;

   public static ddx a(jk<ddg> $$0) {
      return new ddx($$0.b(ddn.ah), $$0.b(ddn.ai), $$0.b(ddn.aj), $$0.b(ddn.ak), $$0.b(ddn.al));
   }

   private ddx(jj<ddg> $$0, jj<ddg> $$1, jj<ddg> $$2, jj<ddg> $$3, jj<ddg> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jj<ddg>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends ddk> a() {
      return b;
   }

   @Override
   public jj<ddg> getNoiseBiome(int $$0, int $$1, int $$2, ddp.f $$3) {
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
         double $$11 = $$3.e().a(new dxz.e($$9, $$5, $$10));
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
