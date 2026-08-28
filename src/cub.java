import java.util.function.Consumer;

public class cub extends cvx {
   public cub(cvx.a $$0) {
      super($$0);
   }

   @Override
   public bsd a(czu $$0) {
      jm $$1 = $$0.k();
      if ($$1 == jm.a) {
         return bsd.d;
      } else {
         dfb $$2 = $$0.q();
         czs $$3 = new czs($$0);
         jh $$4 = $$3.a();
         cwb $$5 = $$0.n();
         ezn $$6 = ezn.c($$4);
         ezi $$7 = bul.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof arn $$8) {
               Consumer<ckk> $$9 = bul.a($$8, $$5, $$0.o());
               ckk $$10 = bul.d.b($$8, $$9, $$4, buk.m, true, true);
               if ($$10 == null) {
                  return bsd.d;
               }

               float $$11 = (float)azk.d((azk.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dC(), $$10.dE(), $$10.dI(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dC(), $$10.dE(), $$10.dI(), awl.aD, awm.e, 0.75F, 0.8F);
               $$10.a(eag.t, $$0.o());
            }

            $$5.h(1);
            return bsd.a;
         } else {
            return bsd.d;
         }
      }
   }
}
