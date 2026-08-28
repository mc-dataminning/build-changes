public enum bvy {
   a(true) {
      @Override
      void a(bxe $$0, bxe $$1, bvx $$2) {
         bwd $$3 = $$0.cZ();
         $$1.w($$0);
         $$1.i($$0.dy());
         if ($$3 != null) {
            $$3.bP();
            $$3.J = 0;

            for (bwd $$4 : $$1.cY()) {
               $$4.bP();
               $$4.a(bwd.e.b);
            }

            $$3.n($$1);
         }

         bwd $$5 = $$0.dk();
         if ($$5 != null) {
            $$0.bP();
            $$1.n($$5);
         }

         if ($$2.b()) {
            for (bwn $$6 : bwn.j) {
               cyy $$7 = $$0.a($$6);
               if (!$$7.f()) {
                  $$1.a($$6, $$7.g());
                  $$1.a($$6, $$0.fX().b($$6));
               }
            }
         }

         $$1.Z = $$0.Z;
         $$1.b(7, $$0.fI());
         $$1.bb = $$0.bb;
         $$1.aN = $$0.aN;
         $$1.aV = $$0.aV;
         $$1.d($$0.aJ());
         $$0.fO().ifPresent($$1::g);
         bwd $$8 = $$0.C();
         if ($$8 != null) {
            $$1.a_($$8, true);
         }

         this.b($$0, $$1, $$2);
      }
   },
   b(false) {
      @Override
      void a(bxe $$0, bxe $$1, bvx $$2) {
         bwd $$3 = $$0.cZ();
         if ($$3 != null) {
            $$3.bP();
         }

         bwd $$4 = $$0.C();
         if ($$4 != null) {
            $$0.y();
         }

         this.b($$0, $$1, $$2);
      }
   };

   private final boolean c;

   bvy(final boolean $$0) {
      this.c = $$0;
   }

   public boolean a() {
      return this.c;
   }

   abstract void a(bxe var1, bxe var2, bvx var3);

   void b(bxe $$0, bxe $$1, bvx $$2) {
      $$1.E($$0.fv());

      for (bvh $$3 : $$0.eC()) {
         $$1.a(new bvh($$3));
      }

      if ($$0.n_()) {
         $$1.a(true);
      }

      if ($$0 instanceof bvt $$4 && $$1 instanceof bvt $$5) {
         $$5.c_($$4.g());
         $$5.c = $$4.c;
         $$5.d = $$4.d;
      }

      byc<?> $$6 = $$0.eb();
      byc<?> $$7 = $$1.eb();
      if ($$6.a(cge.ac, cgf.c) && $$6.a(cge.ac)) {
         $$7.a(cge.ac, $$6.c(cge.ac));
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
         ffn $$8 = $$1.dV().R();
         $$8.a($$1.cH(), $$2.d());
         if ($$0.cr() != null && $$0.cr() == $$2.d()) {
            $$8.b($$0.cH(), $$0.cr());
         }
      }

      if ($$0 instanceof cot $$9 && $$9.gv() && $$1 instanceof cot $$10) {
         $$10.x(true);
      }
   }
}
