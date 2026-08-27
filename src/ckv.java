import java.util.List;

public class ckv extends cmt {
   public ckv(cmt.a $$0) {
      super($$0);
   }

   @Override
   public bkc<cmy> a(ctp $$0, cfi $$1, bka $$2) {
      List<bls> $$3 = $$0.a(bls.class, $$1.cH().g(2.0), $$0x -> $$0x != null && $$0x.bx() && $$0x.s() instanceof cao);
      cmy $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bls $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), ars.cj, art.g, 1.0F, 1.0F);
         $$0.a($$1, dnr.y, $$1.dk());
         if ($$1 instanceof ane $$6) {
            am.R.a($$6, $$4, $$5);
         }

         return bkc.a(this.a($$4, $$1, new cmy(cnb.vg)), $$0.y_());
      } else {
         elp $$7 = a($$0, $$1, csy.b.b);
         if ($$7.c() == elr.a.a) {
            return bkc.c($$4);
         } else {
            if ($$7.c() == elr.a.b) {
               hx $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bkc.c($$4);
               }

               if ($$0.b_($$8).a(asm.a)) {
                  $$0.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), ars.ci, art.g, 1.0F, 1.0F);
                  $$0.a($$1, dnr.y, $$8);
                  return bkc.a(this.a($$4, $$1, coy.a(new cmy(cnb.sh), coz.c)), $$0.y_());
               }
            }

            return bkc.c($$4);
         }
      }
   }

   protected cmy a(cmy $$0, cfi $$1, cmy $$2) {
      $$1.b(asc.c.b(this));
      return cna.a($$0, $$1, $$2);
   }
}
