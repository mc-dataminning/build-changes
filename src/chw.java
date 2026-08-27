import java.util.function.Consumer;

public class chw extends cke {
   public chw(cke.a $$0) {
      super($$0);
   }

   @Override
   public bib a(cmt $$0) {
      hx $$1 = $$0.k();
      if ($$1 == hx.a) {
         return bib.e;
      } else {
         cqz $$2 = $$0.q();
         cmr $$3 = new cmr($$0);
         ht $$4 = $$3.a();
         ckj $$5 = $$0.n();
         eif $$6 = eif.c($$4);
         eia $$7 = bjx.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof alq $$8) {
               Consumer<bzg> $$9 = bjx.a($$8, $$5, $$0.o());
               bzg $$10 = bjx.d.b($$8, $$5.v(), $$9, $$4, bkn.m, true, true);
               if ($$10 == null) {
                  return bib.e;
               }

               float $$11 = (float)asy.d((asy.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dq(), $$10.ds(), $$10.dw(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dq(), $$10.ds(), $$10.dw(), aqd.ao, aqe.e, 0.75F, 0.8F);
               $$10.a(dkl.t, $$0.o());
            }

            $$5.h(1);
            return bib.a($$2.B);
         } else {
            return bib.e;
         }
      }
   }
}
