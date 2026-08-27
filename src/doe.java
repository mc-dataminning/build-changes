import com.mojang.serialization.Codec;

public class doe extends dnq<dqb> {
   public doe(Codec<dqb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dns<dqb> $$0) {
      int $$1 = 0;
      cqv $$2 = $$0.b();
      gw $$3 = $$0.e();
      ash $$4 = $$0.d();
      int $$5 = $$2.a(dkm.a.d, $$3.u(), $$3.w());
      gw $$6 = new gw($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(cte.G)) {
         dfd $$7 = cte.mc.o();
         dfd $$8 = cte.md.o();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(cte.G) && $$2.a_($$6.c()).a(cte.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(cxe.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               gw $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(cte.mc)) {
                  $$2.a($$11, $$7.a(cxe.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               }
               break;
            }

            $$6 = $$6.c();
         }
      }

      return $$1 > 0;
   }
}
