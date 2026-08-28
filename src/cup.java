import java.util.function.Consumer;

public class cup extends cwl {
   public cup(cwl.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dai $$0) {
      jn $$1 = $$0.k();
      if ($$1 == jn.a) {
         return bsj.d;
      } else {
         dgi $$2 = $$0.q();
         dag $$3 = new dag($$0);
         ji $$4 = $$3.a();
         cwp $$5 = $$0.n();
         fba $$6 = fba.c($$4);
         fav $$7 = bur.f.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof arc $$8) {
               Consumer<ckq> $$9 = bur.a($$8, $$5, $$0.o());
               ckq $$10 = bur.f.b($$8, $$9, $$4, buq.m, true, true);
               if ($$10 == null) {
                  return bsj.d;
               }

               float $$11 = (float)ayz.d((ayz.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dB(), $$10.dD(), $$10.dH(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dB(), $$10.dD(), $$10.dH(), awa.aD, awb.e, 0.75F, 0.8F);
               $$10.a(ebt.t, $$0.o());
            }

            $$5.h(1);
            return bsj.a;
         } else {
            return bsj.d;
         }
      }
   }
}
