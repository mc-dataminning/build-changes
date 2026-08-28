public enum buv {
   a(true) {
      @Override
      void a(bwa $$0, bwa $$1, buu $$2) {
         bva $$3 = $$0.cY();
         $$1.w($$0);
         $$1.i($$0.dx());
         if ($$3 != null) {
            $$3.bO();
            $$3.J = 0;

            for (bva $$4 : $$1.cX()) {
               $$4.bO();
               $$4.a(bva.d.b);
            }

            $$3.n($$1);
         }

         bva $$5 = $$0.dj();
         if ($$5 != null) {
            $$0.bO();
            $$1.n($$5);
         }

         if ($$2.b()) {
            for (bvj $$6 : bvj.i) {
               cxh $$7 = $$0.a($$6);
               if (!$$7.f()) {
                  $$1.a($$6, $$7.g());
                  $$1.a($$6, $$0.fZ().b($$6));
               }
            }
         }

         $$1.Z = $$0.Z;
         $$1.b(7, $$0.fL());
         $$1.bb = $$0.bb;
         $$1.aN = $$0.aN;
         $$1.aV = $$0.aV;
         $$1.d($$0.aJ());
         $$0.fR().ifPresent($$1::h);
         bva $$8 = $$0.C();
         if ($$8 != null) {
            $$1.b($$8, true);
         }

         this.b($$0, $$1, $$2);
      }
   },
   b(false) {
      @Override
      void a(bwa $$0, bwa $$1, buu $$2) {
         bva $$3 = $$0.cY();
         if ($$3 != null) {
            $$3.bO();
         }

         bva $$4 = $$0.C();
         if ($$4 != null) {
            $$0.y();
         }

         this.b($$0, $$1, $$2);
      }
   };

   private final boolean c;

   buv(final boolean $$0) {
      this.c = $$0;
   }

   public boolean a() {
      return this.c;
   }

   abstract void a(bwa var1, bwa var2, buu var3);

   void b(bwa $$0, bwa $$1, buu $$2) {
      $$1.F($$0.fy());

      for (bue $$3 : $$0.eB()) {
         $$1.a(new bue($$3));
      }

      if ($$0.n_()) {
         $$1.a(true);
      }

      if ($$0 instanceof buq $$4 && $$1 instanceof buq $$5) {
         $$5.c_($$4.g());
         $$5.c = $$4.c;
         $$5.d = $$4.d;
      }

      bxa<?> $$6 = $$0.ea();
      bxa<?> $$7 = $$1.ea();
      if ($$6.a(cfc.ab, cfd.c) && $$6.a(cfc.ab)) {
         $$7.a(cfc.ab, $$6.c(cfc.ab));
      }

      if ($$2.c()) {
         $$1.a_($$0.fP());
      }

      $$1.u($$0.gi());
      $$1.t($$0.gh());
      if ($$0.gb()) {
         $$1.ga();
      }

      if ($$0.h_()) {
         $$1.b($$0.an());
         $$1.o($$0.cK());
      }

      $$1.c($$0.bX());
      $$1.m($$0.cB());
      $$1.f($$0.bc());
      $$1.f($$0.aC());
      $$1.e($$0.bb());
      $$0.as().forEach($$1::a);
      if ($$2.d() != null) {
         fdc $$8 = $$1.dU().R();
         $$8.a($$1.cG(), $$2.d());
         if ($$0.cq() != null && $$0.cq() == $$2.d()) {
            $$8.b($$0.cG(), $$0.cq());
         }
      }

      if ($$0 instanceof cnl $$9 && $$9.gx() && $$1 instanceof cnl $$10) {
         $$10.x(true);
      }
   }
}
