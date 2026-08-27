import java.util.function.Consumer;

public class crg extends ctj {
   public crg(ctj.a $$0) {
      super($$0);
   }

   @Override
   public bpu a(cxb $$0) {
      it $$1 = $$0.k();
      if ($$1 == it.a) {
         return bpu.e;
      } else {
         dax $$2 = $$0.q();
         cwz $$3 = new cwz($$0);
         io $$4 = $$3.a();
         cto $$5 = $$0.n();
         euk $$6 = euk.c($$4);
         euf $$7 = bsa.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof aqm $$8) {
               Consumer<chw> $$9 = bsa.a($$8, $$5, $$0.o());
               chw $$10 = bsa.d.b($$8, $$9, $$4, bss.m, true, true);
               if ($$10 == null) {
                  return bpu.e;
               }

               float $$11 = (float)ayd.d((ayd.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.du(), $$10.dw(), $$10.dA(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.du(), $$10.dw(), $$10.dA(), avh.aD, avi.e, 0.75F, 0.8F);
               $$10.a(dvu.t, $$0.o());
            }

            $$5.h(1);
            return bpu.a($$2.B);
         } else {
            return bpu.e;
         }
      }
   }
}
