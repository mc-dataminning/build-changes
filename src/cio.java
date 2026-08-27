import java.util.function.Consumer;

public class cio extends ckw {
   public cio(ckw.a $$0) {
      super($$0);
   }

   @Override
   public biq a(cnl $$0) {
      hx $$1 = $$0.k();
      if ($$1 == hx.a) {
         return biq.e;
      } else {
         crs $$2 = $$0.q();
         cnj $$3 = new cnj($$0);
         ht $$4 = $$3.a();
         clb $$5 = $$0.n();
         eji $$6 = eji.c($$4);
         ejd $$7 = bkm.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof ama $$8) {
               Consumer<bzv> $$9 = bkm.a($$8, $$5, $$0.o());
               bzv $$10 = bkm.d.b($$8, $$5.v(), $$9, $$4, blc.m, true, true);
               if ($$10 == null) {
                  return biq.e;
               }

               float $$11 = (float)ati.d((ati.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dq(), $$10.ds(), $$10.dw(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dq(), $$10.ds(), $$10.dw(), aqn.ao, aqo.e, 0.75F, 0.8F);
               $$10.a(dlg.t, $$0.o());
            }

            $$5.h(1);
            return biq.a($$2.B);
         } else {
            return biq.e;
         }
      }
   }
}
