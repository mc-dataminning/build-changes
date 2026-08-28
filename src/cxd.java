public class cxd extends cwl {
   private final bur<? extends cqw> a;

   public cxd(bur<? extends cqw> $$0, cwl.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsj a(dai $$0) {
      dgi $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwx $$3 = $$1.a_($$2);
      if (!$$3.a(awp.P)) {
         return bsj.d;
      } else {
         cwp $$4 = $$0.n();
         dya $$5 = $$3.b() instanceof djb ? $$3.c(((djb)$$3.b()).c()) : dya.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         fba $$7 = new fba((double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$6, (double)$$2.w() + 0.5);
         cqw $$8 = cqw.a($$1, $$7.d, $$7.e, $$7.f, this.a, buq.o, $$4, $$0.o());
         if ($$8 == null) {
            return bsj.d;
         } else {
            if (cqw.b($$1)) {
               for (buk $$10 : $$1.a_(null, $$8.cR())) {
                  if ($$10 instanceof cqw) {
                     return bsj.d;
                  }
               }
            }

            if ($$1 instanceof arc $$11) {
               $$11.b($$8);
               $$11.a(ebt.t, $$2, ebt.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return bsj.a;
         }
      }
   }
}
