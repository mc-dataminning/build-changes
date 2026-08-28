import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ddu extends ddh {
   public static final MapCodec<ddu> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aki.d(ddk.ah), aki.d(ddk.ai), aki.d(ddk.aj), aki.d(ddk.ak), aki.d(ddk.al)).apply($$0, $$0.stable(ddu::new))
   );
   private final jj<ddd> c;
   private final jj<ddd> d;
   private final jj<ddd> e;
   private final jj<ddd> f;
   private final jj<ddd> g;

   public static ddu a(jk<ddd> $$0) {
      return new ddu($$0.b(ddk.ah), $$0.b(ddk.ai), $$0.b(ddk.aj), $$0.b(ddk.ak), $$0.b(ddk.al));
   }

   private ddu(jj<ddd> $$0, jj<ddd> $$1, jj<ddd> $$2, jj<ddd> $$3, jj<ddd> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jj<ddd>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends ddh> a() {
      return b;
   }

   @Override
   public jj<ddd> getNoiseBiome(int $$0, int $$1, int $$2, ddm.f $$3) {
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
         double $$11 = $$3.e().a(new dxs.e($$9, $$5, $$10));
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
