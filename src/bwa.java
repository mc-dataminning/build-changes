public enum bwa {
   a(true) {
      @Override
      void a(bxg $$0, bxg $$1, bvz $$2) {
         bwf $$3 = $$0.cZ();
         $$1.w($$0);
         $$1.i($$0.dy());
         if ($$3 != null) {
            $$3.bP();
            $$3.J = 0;

            for (bwf $$4 : $$1.cY()) {
               $$4.bP();
               $$4.a(bwf.e.b);
            }

            $$3.n($$1);
         }

         bwf $$5 = $$0.dk();
         if ($$5 != null) {
            $$0.bP();
            $$1.n($$5);
         }

         if ($$2.b()) {
            for (bwp $$6 : bwp.j) {
               czd $$7 = $$0.a($$6);
               if (!$$7.f()) {
                  $$1.a($$6, $$7.g());
                  $$1.a($$6, $$0.fY().b($$6));
               }
            }
         }

         $$1.Z = $$0.Z;
         $$1.b(7, $$0.fJ());
         $$1.bb = $$0.bb;
         $$1.aN = $$0.aN;
         $$1.aV = $$0.aV;
         $$1.d($$0.aJ());
         $$0.fP().ifPresent($$1::g);
         bwf $$8 = $$0.C();
         if ($$8 != null) {
            $$1.a_($$8, true);
         }

         this.b($$0, $$1, $$2);
      }
   },
   b(false) {
      @Override
      void a(bxg $$0, bxg $$1, bvz $$2) {
         bwf $$3 = $$0.cZ();
         if ($$3 != null) {
            $$3.bP();
         }

         bwf $$4 = $$0.C();
         if ($$4 != null) {
            $$0.y();
         }

         this.b($$0, $$1, $$2);
      }
   };

   private final boolean c;

   bwa(final boolean $$0) {
      this.c = $$0;
   }

   public boolean a() {
      return this.c;
   }

   abstract void a(bxg var1, bxg var2, bvz var3);

   void b(bxg $$0, bxg $$1, bvz $$2) {
      $$1.E($$0.fw());

      for (bvj $$3 : $$0.eD()) {
         $$1.a(new bvj($$3));
      }

      if ($$0.n_()) {
         $$1.a(true);
      }

      if ($$0 instanceof bvv $$4 && $$1 instanceof bvv $$5) {
         $$5.c_($$4.g());
         $$5.c = $$4.c;
         $$5.d = $$4.d;
      }

      bye<?> $$6 = $$0.ec();
      bye<?> $$7 = $$1.ec();
      if ($$6.a(cgg.ac, cgh.c) && $$6.a(cgg.ac)) {
         $$7.a(cgg.ac, $$6.c(cgg.ac));
      }

      if ($$2.c()) {
         $$1.a_($$0.fN());
      }

      $$1.u($$0.gh());
      $$1.t($$0.gg());
      if ($$0.ga()) {
         $$1.fZ();
      }

      if ($$0.h_()) {
         $$1.b($$0.an());
         $$1.o($$0.cL());
      }

      $$1.c($$0.bY());
      $$1.m($$0.cC());
      $$1.f($$0.bc());
      $$1.f($$0.aC());
      $$1.e($$0.bb());
      $$0.as().forEach($$1::a);
      if ($$2.d() != null) {
         ffv $$8 = $$1.dV().R();
         $$8.a($$1.cH(), $$2.d());
         if ($$0.cr() != null && $$0.cr() == $$2.d()) {
            $$8.b($$0.cH(), $$0.cr());
         }
      }

      if ($$0 instanceof cox $$9 && $$9.gw() && $$1 instanceof cox $$10) {
         $$10.x(true);
      }
   }
}
