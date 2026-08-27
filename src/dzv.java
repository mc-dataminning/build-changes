import com.mojang.serialization.Codec;

public class dzv extends dzx<eci> {
   public dzv(Codec<eci> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<eci> $$0) {
      dbs $$1 = $$0.b();
      ayk $$2 = $$0.d();
      io $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = ayd.d(-$$4); $$6 <= ayd.f($$4); $$6++) {
            for (int $$7 = ayd.d(-$$4); $$7 <= ayd.f($$4); $$7++) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), dea.fz.n());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
