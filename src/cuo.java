import java.util.function.Consumer;

public class cuo extends cwk {
   public cuo(cwk.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dah $$0) {
      jn $$1 = $$0.k();
      if ($$1 == jn.a) {
         return bsj.d;
      } else {
         dgh $$2 = $$0.q();
         daf $$3 = new daf($$0);
         ji $$4 = $$3.a();
         cwo $$5 = $$0.n();
         faz $$6 = faz.c($$4);
         fau $$7 = bur.f.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof ard $$8) {
               Consumer<ckq> $$9 = bur.a($$8, $$5, $$0.o());
               ckq $$10 = bur.f.b($$8, $$9, $$4, buq.m, true, true);
               if ($$10 == null) {
                  return bsj.d;
               }

               float $$11 = (float)ayz.d((ayz.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dA(), $$10.dC(), $$10.dG(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dA(), $$10.dC(), $$10.dG(), awa.aD, awb.e, 0.75F, 0.8F);
               $$10.a(ebs.t, $$0.o());
            }

            $$5.h(1);
            return bsj.a;
         } else {
            return bsj.d;
         }
      }
   }
}
