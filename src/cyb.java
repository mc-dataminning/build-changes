import java.util.function.Consumer;

public class cyb extends czu {
   public cyb(czu.a $$0) {
      super($$0);
   }

   @Override
   public bur a(ddt $$0) {
      jb $$1 = $$0.k();
      if ($$1 == jb.a) {
         return bur.d;
      } else {
         djx $$2 = $$0.q();
         ddr $$3 = new ddr($$0);
         iv $$4 = $$3.a();
         czy $$5 = $$0.n();
         ffq $$6 = ffq.c($$4);
         ffl $$7 = bxc.g.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof ars $$8) {
               Consumer<cnr> $$9 = bxc.a($$8, $$5, $$0.o());
               cnr $$10 = bxc.g.b($$8, $$9, $$4, bxb.m, true, true);
               if ($$10 == null) {
                  return bur.d;
               }

               float $$11 = (float)azo.d((azo.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dA(), $$10.dC(), $$10.dG(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dA(), $$10.dC(), $$10.dG(), awp.aD, awq.e, 0.75F, 0.8F);
               $$10.a(ege.t, $$0.o());
            }

            $$5.h(1);
            return bur.a;
         } else {
            return bur.d;
         }
      }
   }
}
