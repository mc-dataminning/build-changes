import com.mojang.serialization.Codec;

public class dom extends doo<dqz> {
   public dom(Codec<dqz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doq<dqz> $$0) {
      crt $$1 = $$0.b();
      ate $$2 = $$0.d();
      ht $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = asy.d(-$$4); $$6 <= asy.f($$4); $$6++) {
            for (int $$7 = asy.d(-$$4); $$7 <= asy.f($$4); $$7++) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), cuc.fz.o());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
