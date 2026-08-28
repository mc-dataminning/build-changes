public enum bwd {
   a(true) {
      @Override
      void a(bxl $$0, bxl $$1, bwc $$2) {
         bwi $$3 = $$0.cY();
         $$1.w($$0);
         $$1.i($$0.dx());
         if ($$3 != null) {
            $$3.bN();
            $$3.J = 0;

            for (bwi $$4 : $$1.cX()) {
               $$4.bN();
               $$4.a(bwi.d.b);
            }

            $$3.n($$1);
         }

         bwi $$5 = $$0.dj();
         if ($$5 != null) {
            $$0.bN();
            $$1.n($$5);
         }

         if ($$2.b()) {
            for (bws $$6 : bws.j) {
               czk $$7 = $$0.a($$6);
               if (!$$7.f()) {
                  $$1.a($$6, $$7.g());
                  $$1.a($$6, $$0.ga().b($$6));
               }
            }
         }

         $$1.Z = $$0.Z;
         $$1.b(7, $$0.fI());
         $$1.bb = $$0.bb;
         $$1.aN = $$0.aN;
         $$1.aV = $$0.aV;
         $$1.d($$0.aH());
         $$0.fO().ifPresent($$1::g);
         bwi $$8 = $$0.C();
         if ($$8 != null) {
            $$1.a_($$8, true);
         }

         this.b($$0, $$1, $$2);
      }
   },
   b(false) {
      @Override
      void a(bxl $$0, bxl $$1, bwc $$2) {
         bwi $$3 = $$0.cY();
         if ($$3 != null) {
            $$3.bN();
         }

         bwi $$4 = $$0.C();
         if ($$4 != null) {
            $$0.y();
         }

         this.b($$0, $$1, $$2);
      }
   };

   private final boolean c;

   bwd(final boolean $$0) {
      this.c = $$0;
   }

   public boolean a() {
      return this.c;
   }

   abstract void a(bxl var1, bxl var2, bwc var3);

   void b(bxl $$0, bxl $$1, bwc $$2) {
      $$1.E($$0.fv());

      for (bvm $$3 : $$0.eC()) {
         $$1.a(new bvm($$3));
      }

      if ($$0.n_()) {
         $$1.a(true);
      }

      if ($$0 instanceof bvy $$4 && $$1 instanceof bvy $$5) {
         $$5.c_($$4.g());
         $$5.c = $$4.c;
         $$5.d = $$4.d;
      }

      byj<?> $$6 = $$0.eb();
      byj<?> $$7 = $$1.eb();
      if ($$6.a(cgl.ac, cgm.c) && $$6.a(cgl.ac)) {
         $$7.a(cgl.ac, $$6.c(cgl.ac));
      }

      if ($$2.c()) {
         $$1.a_($$0.fM());
      }

      $$1.u($$0.gj());
      $$1.t($$0.gi());
      if ($$0.gc()) {
         $$1.gb();
      }

      if ($$0.h_()) {
         $$1.b($$0.ak());
         $$1.o($$0.cK());
      }

      $$1.c($$0.bW());
      $$1.m($$0.cB());
      $$1.f($$0.ba());
      $$1.f($$0.az());
      $$1.e($$0.aZ());
      $$0.ap().forEach($$1::a);
      if ($$2.d() != null) {
         fgc $$8 = $$1.dU().R();
         $$8.a($$1.cG(), $$2.d());
         if ($$0.cp() != null && $$0.cp() == $$2.d()) {
            $$8.b($$0.cG(), $$0.cp());
         }
      }

      if ($$0 instanceof cpe $$9 && $$9.gy() && $$1 instanceof cpe $$10) {
         $$10.x(true);
      }
   }
}
