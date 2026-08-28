public enum bwo {
   a(true) {
      @Override
      void a(bxw $$0, bxw $$1, bwn $$2) {
         bwt $$3 = $$0.cZ();
         $$1.w($$0);
         $$1.i($$0.dy());
         if ($$3 != null) {
            $$3.bO();
            $$3.J = 0;

            for (bwt $$4 : $$1.cY()) {
               $$4.bO();
               $$4.a(bwt.d.b);
            }

            $$3.n($$1);
         }

         bwt $$5 = $$0.dk();
         if ($$5 != null) {
            $$0.bO();
            $$1.n($$5);
         }

         if ($$2.b()) {
            for (bxd $$6 : bxd.j) {
               czy $$7 = $$0.a($$6);
               if (!$$7.f()) {
                  $$1.a($$6, $$7.g());
                  $$1.a($$6, $$0.gb().b($$6));
               }
            }
         }

         $$1.Z = $$0.Z;
         $$1.b(7, $$0.fJ());
         $$1.bb = $$0.bb;
         $$1.aN = $$0.aN;
         $$1.aV = $$0.aV;
         $$1.d($$0.aH());
         $$0.fP().ifPresent($$1::g);
         bwt $$8 = $$0.C();
         if ($$8 != null) {
            $$1.a_($$8, true);
         }

         this.b($$0, $$1, $$2);
      }
   },
   b(false) {
      @Override
      void a(bxw $$0, bxw $$1, bwn $$2) {
         bwt $$3 = $$0.cZ();
         if ($$3 != null) {
            $$3.bO();
         }

         bwt $$4 = $$0.C();
         if ($$4 != null) {
            $$0.y();
         }

         this.b($$0, $$1, $$2);
      }
   };

   private final boolean c;

   bwo(final boolean $$0) {
      this.c = $$0;
   }

   public boolean a() {
      return this.c;
   }

   abstract void a(bxw var1, bxw var2, bwn var3);

   void b(bxw $$0, bxw $$1, bwn $$2) {
      $$1.E($$0.fw());

      for (bvx $$3 : $$0.eD()) {
         $$1.a(new bvx($$3));
      }

      if ($$0.n_()) {
         $$1.a(true);
      }

      if ($$0 instanceof bwj $$4 && $$1 instanceof bwj $$5) {
         $$5.c_($$4.g());
         $$5.e = $$4.e;
         $$5.f = $$4.f;
      }

      byu<?> $$6 = $$0.ec();
      byu<?> $$7 = $$1.ec();
      if ($$6.a(cgw.ac, cgx.c) && $$6.a(cgw.ac)) {
         $$7.a(cgw.ac, $$6.c(cgw.ac));
      }

      if ($$2.c()) {
         $$1.a_($$0.fN());
      }

      $$1.u($$0.gk());
      $$1.t($$0.gj());
      if ($$0.gd()) {
         $$1.gc();
      }

      if ($$0.h_()) {
         $$1.b($$0.ak());
         $$1.o($$0.cL());
      }

      $$1.c($$0.bX());
      $$1.m($$0.cC());
      $$1.f($$0.bb());
      $$1.f($$0.az());
      $$1.e($$0.ba());
      $$0.ap().forEach($$1::a);
      if ($$2.d() != null) {
         fgv $$8 = $$1.dV().R();
         $$8.a($$1.cH(), $$2.d());
         if ($$0.cq() != null && $$0.cq() == $$2.d()) {
            $$8.b($$0.cH(), $$0.cq());
         }
      }

      if ($$0 instanceof cps $$9 && $$9.gz() && $$1 instanceof cps $$10) {
         $$10.x(true);
      }
   }
}
