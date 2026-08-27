import java.util.function.Consumer;

public class cri extends ctl {
   public cri(ctl.a $$0) {
      super($$0);
   }

   @Override
   public bpw a(cxd $$0) {
      it $$1 = $$0.k();
      if ($$1 == it.a) {
         return bpw.e;
      } else {
         daz $$2 = $$0.q();
         cxb $$3 = new cxb($$0);
         io $$4 = $$3.a();
         ctq $$5 = $$0.n();
         eum $$6 = eum.c($$4);
         euh $$7 = bsc.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof aqn $$8) {
               Consumer<chy> $$9 = bsc.a($$8, $$5, $$0.o());
               chy $$10 = bsc.d.b($$8, $$9, $$4, bsu.m, true, true);
               if ($$10 == null) {
                  return bpw.e;
               }

               float $$11 = (float)ayf.d((ayf.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.du(), $$10.dw(), $$10.dA(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.du(), $$10.dw(), $$10.dA(), avi.aD, avj.e, 0.75F, 0.8F);
               $$10.a(dvw.t, $$0.o());
            }

            $$5.h(1);
            return bpw.a($$2.B);
         } else {
            return bpw.e;
         }
      }
   }
}
