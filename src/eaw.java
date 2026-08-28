import com.mojang.serialization.Codec;

public class eaw extends eay<edj> {
   public eaw(Codec<edj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eba<edj> $$0) {
      dct $$1 = $$0.b();
      azh $$2 = $$0.d();
      iz $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = ayz.d(-$$4); $$6 <= ayz.f($$4); $$6++) {
            for (int $$7 = ayz.d(-$$4); $$7 <= ayz.f($$4); $$7++) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), dfb.fz.o());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
