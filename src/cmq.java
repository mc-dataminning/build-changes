public class cmq extends cmc {
   private static final jh a = new jg() {
      private final jg c = new jg();

      @Override
      public cmh a(je $$0, cmh $$1) {
         ia $$2 = $$0.d().c(cye.b);
         amp $$3 = $$0.b();
         elb $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         hv $$8 = $$0.c().a($$2);
         dip $$9 = $$3.a_($$8);
         djt $$10 = $$9.b() instanceof cvo ? $$9.c(((cvo)$$9.b()).c()) : djt.a;
         double $$11;
         if ($$9.a(arr.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(arr.N)) {
               return this.c.dispense($$0, $$1);
            }

            dip $$13 = $$3.a_($$8.d());
            djt $$14 = $$13.b() instanceof cvo ? $$13.c(((cvo)$$13.b()).c()) : djt.a;
            if ($$2 != ia.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cgj $$18 = cgj.a($$3, $$5, $$6 + $$11, $$7, ((cmq)$$1.d()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(je $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cgj.a b;

   public cmq(cgj.a $$0, cmc.a $$1) {
      super($$1);
      this.b = $$0;
      cye.a(this, a);
   }

   @Override
   public bjl a(cos $$0) {
      csy $$1 = $$0.q();
      hv $$2 = $$0.a();
      dip $$3 = $$1.a_($$2);
      if (!$$3.a(arr.N)) {
         return bjl.e;
      } else {
         cmh $$4 = $$0.n();
         if ($$1 instanceof amp $$5) {
            djt $$6 = $$3.b() instanceof cvo ? $$3.c(((cvo)$$3.b()).c()) : djt.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cgj $$8 = cgj.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dmz.t, $$2, dmz.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bjl.a($$1.B);
      }
   }
}
