import com.mojang.serialization.Codec;

public class eec extends eef<egq> {
   public eec(Codec<egq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egq> $$0) {
      dfs $$1 = $$0.b();
      azr $$2 = $$0.d();
      jg $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = azj.d(-$$4); $$6 <= azj.f($$4); $$6++) {
            for (int $$7 = azj.d(-$$4); $$7 <= azj.f($$4); $$7++) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), dia.fz.m());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
