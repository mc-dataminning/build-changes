public class cty extends ctj {
   private static final ki a = new kh() {
      private final kh c = new kh();

      @Override
      public cto a(kf $$0, cto $$1) {
         it $$2 = $$0.d().c(dgd.b);
         aqm $$3 = $$0.b();
         euk $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         io $$8 = $$0.c().a($$2);
         drb $$9 = $$3.a_($$8);
         dsf $$10 = $$9.b() instanceof ddn ? $$9.c(((ddn)$$9.b()).c()) : dsf.a;
         double $$11;
         if ($$9.a(avw.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(avw.N)) {
               return this.c.dispense($$0, $$1);
            }

            drb $$13 = $$3.a_($$8.d());
            dsf $$14 = $$13.b() instanceof ddn ? $$13.c(((ddn)$$13.b()).c()) : dsf.a;
            if ($$2 != it.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cnr $$18 = cnr.a($$3, $$5, $$6 + $$11, $$7, ((cty)$$1.g()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(kf $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cnr.a b;

   public cty(cnr.a $$0, ctj.a $$1) {
      super($$1);
      this.b = $$0;
      dgd.a(this, a);
   }

   @Override
   public bpu a(cxb $$0) {
      dax $$1 = $$0.q();
      io $$2 = $$0.a();
      drb $$3 = $$1.a_($$2);
      if (!$$3.a(avw.N)) {
         return bpu.e;
      } else {
         cto $$4 = $$0.n();
         if ($$1 instanceof aqm $$5) {
            dsf $$6 = $$3.b() instanceof ddn ? $$3.c(((ddn)$$3.b()).c()) : dsf.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cnr $$8 = cnr.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dvu.t, $$2, dvu.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bpu.a($$1.B);
      }
   }
}
