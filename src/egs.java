import com.mojang.serialization.Codec;

public class egs extends egv<ejg> {
   public egs(Codec<ejg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egx<ejg> $$0) {
      dif $$1 = $$0.b();
      bam $$2 = $$0.d();
      jh $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = bae.d(-$$4); $$6 <= bae.f($$4); $$6++) {
            for (int $$7 = bae.d(-$$4); $$7 <= bae.f($$4); $$7++) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), dkn.fN.m());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
