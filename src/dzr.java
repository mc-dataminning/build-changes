import com.mojang.serialization.Codec;

public class dzr extends dzd<ebo> {
   public dzr(Codec<ebo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebo> $$0) {
      int $$1 = 0;
      day $$2 = $$0.b();
      in $$3 = $$0.e();
      ayg $$4 = $$0.d();
      int $$5 = $$2.a(dvz.a.d, $$3.u(), $$3.w());
      in $$6 = new in($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(ddg.G)) {
         dqh $$7 = ddg.mc.n();
         dqh $$8 = ddg.md.n();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(ddg.G) && $$2.a_($$6.c()).a(ddg.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.a(dhi.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               in $$11 = $$6.d();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.d()).a(ddg.mc)) {
                  $$2.a($$11, $$7.a(dhi.e, Integer.valueOf($$4.a(4) + 20)), 2);
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
