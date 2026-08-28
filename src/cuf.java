import java.util.function.Consumer;

public class cuf extends cwb {
   public cuf(cwb.a $$0) {
      super($$0);
   }

   @Override
   public bsh a(czy $$0) {
      jm $$1 = $$0.k();
      if ($$1 == jm.a) {
         return bsh.d;
      } else {
         dff $$2 = $$0.q();
         czw $$3 = new czw($$0);
         jh $$4 = $$3.a();
         cwf $$5 = $$0.n();
         ezr $$6 = ezr.c($$4);
         ezm $$7 = bup.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof arq $$8) {
               Consumer<cko> $$9 = bup.a($$8, $$5, $$0.o());
               cko $$10 = bup.d.b($$8, $$9, $$4, buo.m, true, true);
               if ($$10 == null) {
                  return bsh.d;
               }

               float $$11 = (float)azn.d((azn.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dD(), $$10.dF(), $$10.dJ(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dD(), $$10.dF(), $$10.dJ(), awo.aD, awp.e, 0.75F, 0.8F);
               $$10.a(eak.t, $$0.o());
            }

            $$5.h(1);
            return bsh.a;
         } else {
            return bsh.d;
         }
      }
   }
}
