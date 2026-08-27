public class csb extends crn {
   private static final jz a = new jy() {
      private final jy c = new jy();

      @Override
      public crs a(jw $$0, crs $$1) {
         ij $$2 = $$0.d().c(dem.b);
         apu $$3 = $$0.b();
         esj $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         id $$8 = $$0.c().a($$2);
         dpi $$9 = $$3.a_($$8);
         dqm $$10 = $$9.b() instanceof dbw ? $$9.c(((dbw)$$9.b()).c()) : dqm.a;
         double $$11;
         if ($$9.a(ave.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(ave.N)) {
               return this.c.dispense($$0, $$1);
            }

            dpi $$13 = $$3.a_($$8.d());
            dqm $$14 = $$13.b() instanceof dbw ? $$13.c(((dbw)$$13.b()).c()) : dqm.a;
            if ($$2 != ij.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         clv $$18 = clv.a($$3, $$5, $$6 + $$11, $$7, ((csb)$$1.f()).b, $$1, null);
         $$3.b($$18);
         $$1.g(1);
         return $$1;
      }

      @Override
      protected void a(jw $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final clv.a b;

   public csb(clv.a $$0, crn.a $$1) {
      super($$1);
      this.b = $$0;
      dem.a(this, a);
   }

   @Override
   public bof a(cuz $$0) {
      czg $$1 = $$0.q();
      id $$2 = $$0.a();
      dpi $$3 = $$1.a_($$2);
      if (!$$3.a(ave.N)) {
         return bof.e;
      } else {
         crs $$4 = $$0.n();
         if ($$1 instanceof apu $$5) {
            dqm $$6 = $$3.b() instanceof dbw ? $$3.c(((dbw)$$3.b()).c()) : dqm.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            clv $$8 = clv.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dub.t, $$2, dub.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.g(1);
         return bof.a($$1.B);
      }
   }
}
