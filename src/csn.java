public class csn extends cry {
   private static final kh a = new kg() {
      private final kg c = new kg();

      @Override
      public csd a(ke $$0, csd $$1) {
         ir $$2 = $$0.d().c(dfa.b);
         aqe $$3 = $$0.b();
         etf $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         im $$8 = $$0.c().a($$2);
         dpy $$9 = $$3.a_($$8);
         drc $$10 = $$9.b() instanceof dck ? $$9.c(((dck)$$9.b()).c()) : drc.a;
         double $$11;
         if ($$9.a(avo.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(avo.N)) {
               return this.c.dispense($$0, $$1);
            }

            dpy $$13 = $$3.a_($$8.d());
            drc $$14 = $$13.b() instanceof dck ? $$13.c(((dck)$$13.b()).c()) : drc.a;
            if ($$2 != ir.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cmg $$18 = cmg.a($$3, $$5, $$6 + $$11, $$7, ((csn)$$1.f()).b, $$1, null);
         $$3.b($$18);
         $$1.g(1);
         return $$1;
      }

      @Override
      protected void a(ke $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cmg.a b;

   public csn(cmg.a $$0, cry.a $$1) {
      super($$1);
      this.b = $$0;
      dfa.a(this, a);
   }

   @Override
   public boq a(cvn $$0) {
      czu $$1 = $$0.q();
      im $$2 = $$0.a();
      dpy $$3 = $$1.a_($$2);
      if (!$$3.a(avo.N)) {
         return boq.e;
      } else {
         csd $$4 = $$0.n();
         if ($$1 instanceof aqe $$5) {
            drc $$6 = $$3.b() instanceof dck ? $$3.c(((dck)$$3.b()).c()) : drc.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cmg $$8 = cmg.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dur.t, $$2, dur.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.g(1);
         return boq.a($$1.B);
      }
   }
}
