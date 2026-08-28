import java.util.function.Consumer;

public class cxq extends czj {
   public cxq(czj.a $$0) {
      super($$0);
   }

   @Override
   public bug a(ddi $$0) {
      jb $$1 = $$0.k();
      if ($$1 == jb.a) {
         return bug.d;
      } else {
         djm $$2 = $$0.q();
         ddg $$3 = new ddg($$0);
         iv $$4 = $$3.a();
         czn $$5 = $$0.n();
         ffc $$6 = ffc.c($$4);
         fex $$7 = bwr.f.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof arq $$8) {
               Consumer<cng> $$9 = bwr.a($$8, $$5, $$0.o());
               cng $$10 = bwr.f.b($$8, $$9, $$4, bwq.m, true, true);
               if ($$10 == null) {
                  return bug.d;
               }

               float $$11 = (float)azm.d((azm.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dz(), $$10.dB(), $$10.dF(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dz(), $$10.dB(), $$10.dF(), awn.aD, awo.e, 0.75F, 0.8F);
               $$10.a(eft.t, $$0.o());
            }

            $$5.h(1);
            return bug.a;
         } else {
            return bug.d;
         }
      }
   }
}
