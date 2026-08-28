import com.mojang.serialization.Codec;

public class ekg extends ekk<emw> {
   public ekg(Codec<emw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<emw> $$0) {
      dkw $$1 = $$0.b();
      azx $$2 = $$0.d();
      iv $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = azo.d(-$$4); $$6 <= azo.f($$4); $$6++) {
            for (int $$7 = azo.d(-$$4); $$7 <= azo.f($$4); $$7++) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), dne.fY.m());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
