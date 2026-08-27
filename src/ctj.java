public class ctj extends csu {
   private static final ki a = new kh() {
      private final kh c = new kh();

      @Override
      public csz a(kf $$0, csz $$1) {
         is $$2 = $$0.d().c(dfj.b);
         aqh $$3 = $$0.b();
         etp $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         in $$8 = $$0.c().a($$2);
         dqh $$9 = $$3.a_($$8);
         drl $$10 = $$9.b() instanceof dct ? $$9.c(((dct)$$9.b()).c()) : drl.a;
         double $$11;
         if ($$9.a(avr.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(avr.N)) {
               return this.c.dispense($$0, $$1);
            }

            dqh $$13 = $$3.a_($$8.d());
            drl $$14 = $$13.b() instanceof dct ? $$13.c(((dct)$$13.b()).c()) : drl.a;
            if ($$2 != is.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cnc $$18 = cnc.a($$3, $$5, $$6 + $$11, $$7, ((ctj)$$1.f()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(kf $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cnc.a b;

   public ctj(cnc.a $$0, csu.a $$1) {
      super($$1);
      this.b = $$0;
      dfj.a(this, a);
   }

   @Override
   public bpm a(cwk $$0) {
      dad $$1 = $$0.q();
      in $$2 = $$0.a();
      dqh $$3 = $$1.a_($$2);
      if (!$$3.a(avr.N)) {
         return bpm.e;
      } else {
         csz $$4 = $$0.n();
         if ($$1 instanceof aqh $$5) {
            drl $$6 = $$3.b() instanceof dct ? $$3.c(((dct)$$3.b()).c()) : drl.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cnc $$8 = cnc.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dva.t, $$2, dva.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bpm.a($$1.B);
      }
   }
}
