import java.util.function.Consumer;

public class cun extends cwj {
   public cun(cwj.a $$0) {
      super($$0);
   }

   @Override
   public bsi a(dag $$0) {
      jn $$1 = $$0.k();
      if ($$1 == jn.a) {
         return bsi.d;
      } else {
         dgg $$2 = $$0.q();
         dae $$3 = new dae($$0);
         ji $$4 = $$3.a();
         cwn $$5 = $$0.n();
         fay $$6 = fay.c($$4);
         fat $$7 = buq.f.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof arc $$8) {
               Consumer<ckp> $$9 = buq.a($$8, $$5, $$0.o());
               ckp $$10 = buq.f.b($$8, $$9, $$4, bup.m, true, true);
               if ($$10 == null) {
                  return bsi.d;
               }

               float $$11 = (float)ayy.d((ayy.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dB(), $$10.dD(), $$10.dH(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dB(), $$10.dD(), $$10.dH(), avz.aD, awa.e, 0.75F, 0.8F);
               $$10.a(ebr.t, $$0.o());
            }

            $$5.h(1);
            return bsi.a;
         } else {
            return bsi.d;
         }
      }
   }
}
