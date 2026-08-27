public class crs extends cre {
   private static final jx a = new jw() {
      private final jw c = new jw();

      @Override
      public crj a(ju $$0, crj $$1) {
         ih $$2 = $$0.d().c(ded.b);
         aps $$3 = $$0.b();
         esa $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         ib $$8 = $$0.c().a($$2);
         doz $$9 = $$3.a_($$8);
         dqd $$10 = $$9.b() instanceof dbn ? $$9.c(((dbn)$$9.b()).c()) : dqd.a;
         double $$11;
         if ($$9.a(avc.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(avc.N)) {
               return this.c.dispense($$0, $$1);
            }

            doz $$13 = $$3.a_($$8.d());
            dqd $$14 = $$13.b() instanceof dbn ? $$13.c(((dbn)$$13.b()).c()) : dqd.a;
            if ($$2 != ih.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         clo $$18 = clo.a($$3, $$5, $$6 + $$11, $$7, ((crs)$$1.f()).b, $$1, null);
         $$3.b($$18);
         $$1.g(1);
         return $$1;
      }

      @Override
      protected void a(ju $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final clo.a b;

   public crs(clo.a $$0, cre.a $$1) {
      super($$1);
      this.b = $$0;
      ded.a(this, a);
   }

   @Override
   public boa a(cuq $$0) {
      cyx $$1 = $$0.q();
      ib $$2 = $$0.a();
      doz $$3 = $$1.a_($$2);
      if (!$$3.a(avc.N)) {
         return boa.e;
      } else {
         crj $$4 = $$0.n();
         if ($$1 instanceof aps $$5) {
            dqd $$6 = $$3.b() instanceof dbn ? $$3.c(((dbn)$$3.b()).c()) : dqd.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            clo $$8 = clo.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dts.t, $$2, dts.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.g(1);
         return boa.a($$1.B);
      }
   }
}
