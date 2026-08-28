import java.util.function.Consumer;

public class cwv extends cyo {
   public cwv(cyo.a $$0) {
      super($$0);
   }

   @Override
   public bty a(dcn $$0) {
      ja $$1 = $$0.k();
      if ($$1 == ja.a) {
         return bty.d;
      } else {
         dip $$2 = $$0.q();
         dcl $$3 = new dcl($$0);
         iu $$4 = $$3.a();
         cys $$5 = $$0.n();
         fdw $$6 = fdw.c($$4);
         fdr $$7 = bwj.f.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof aro $$8) {
               Consumer<cmm> $$9 = bwj.a($$8, $$5, $$0.o());
               cmm $$10 = bwj.f.b($$8, $$9, $$4, bwi.m, true, true);
               if ($$10 == null) {
                  return bty.d;
               }

               float $$11 = (float)azk.d((azk.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dA(), $$10.dC(), $$10.dG(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dA(), $$10.dC(), $$10.dG(), awl.aD, awm.e, 0.75F, 0.8F);
               $$10.a(eeo.t, $$0.o());
            }

            $$5.h(1);
            return bty.a;
         } else {
            return bty.d;
         }
      }
   }
}
