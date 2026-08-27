import com.mojang.serialization.Codec;

public class dnk extends dnm<dpx> {
   public dnk(Codec<dpx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dno<dpx> $$0) {
      cqf $$1 = $$0.b();
      aru $$2 = $$0.d();
      gu $$3 = $$0.e();
      float $$4 = (float)$$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = arp.d(-$$4); $$6 <= arp.f($$4); $$6++) {
            for (int $$7 = arp.d(-$$4); $$7 <= arp.f($$4); $$7++) {
               if ((float)($$6 * $$6 + $$7 * $$7) <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), csm.fz.n());
               }
            }
         }

         $$4 -= (float)$$2.a(2) + 0.5F;
      }

      return true;
   }
}
