public enum bvn {
   a(true) {
      @Override
      void a(bwt $$0, bwt $$1, bvm $$2) {
         bvs $$3 = $$0.cZ();
         $$1.w($$0);
         $$1.i($$0.dy());
         if ($$3 != null) {
            $$3.bP();
            $$3.J = 0;

            for (bvs $$4 : $$1.cY()) {
               $$4.bP();
               $$4.a(bvs.e.b);
            }

            $$3.n($$1);
         }

         bvs $$5 = $$0.dk();
         if ($$5 != null) {
            $$0.bP();
            $$1.n($$5);
         }

         if ($$2.b()) {
            for (bwc $$6 : bwc.j) {
               cxy $$7 = $$0.a($$6);
               if (!$$7.f()) {
                  $$1.a($$6, $$7.g());
                  $$1.a($$6, $$0.fX().b($$6));
               }
            }
         }

         $$1.Z = $$0.Z;
         $$1.b(7, $$0.fI());
         $$1.ba = $$0.ba;
         $$1.aM = $$0.aM;
         $$1.aU = $$0.aU;
         $$1.d($$0.aJ());
         $$0.fO().ifPresent($$1::h);
         bvs $$8 = $$0.C();
         if ($$8 != null) {
            $$1.b($$8, true);
         }

         this.b($$0, $$1, $$2);
      }
   },
   b(false) {
      @Override
      void a(bwt $$0, bwt $$1, bvm $$2) {
         bvs $$3 = $$0.cZ();
         if ($$3 != null) {
            $$3.bP();
         }

         bvs $$4 = $$0.C();
         if ($$4 != null) {
            $$0.y();
         }

         this.b($$0, $$1, $$2);
      }
   };

   private final boolean c;

   bvn(final boolean $$0) {
      this.c = $$0;
   }

   public boolean a() {
      return this.c;
   }

   abstract void a(bwt var1, bwt var2, bvm var3);

   void b(bwt $$0, bwt $$1, bvm $$2) {
      $$1.F($$0.fv());

      for (buw $$3 : $$0.eC()) {
         $$1.a(new buw($$3));
      }

      if ($$0.n_()) {
         $$1.a(true);
      }

      if ($$0 instanceof bvi $$4 && $$1 instanceof bvi $$5) {
         $$5.c_($$4.g());
         $$5.c = $$4.c;
         $$5.d = $$4.d;
      }

      bxr<?> $$6 = $$0.eb();
      bxr<?> $$7 = $$1.eb();
      if ($$6.a(cft.ac, cfu.c) && $$6.a(cft.ac)) {
         $$7.a(cft.ac, $$6.c(cft.ac));
      }

      if ($$2.c()) {
         $$1.a_($$0.fM());
      }

      $$1.u($$0.gg());
      $$1.t($$0.gf());
      if ($$0.fZ()) {
         $$1.fY();
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
         fdz $$8 = $$1.dV().R();
         $$8.a($$1.cH(), $$2.d());
         if ($$0.cr() != null && $$0.cr() == $$2.d()) {
            $$8.b($$0.cH(), $$0.cr());
         }
      }

      if ($$0 instanceof coc $$9 && $$9.gv() && $$1 instanceof coc $$10) {
         $$10.x(true);
      }
   }
}
