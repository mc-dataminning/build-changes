public enum bvg {
   a(true) {
      @Override
      void a(bwi $$0, bwi $$1, bvf $$2) {
         bvk $$3 = $$0.da();
         $$1.w($$0);
         $$1.h($$0.dz());
         if ($$3 != null) {
            $$3.ae();
            $$3.J = 0;

            for (bvk $$4 : $$1.cZ()) {
               $$4.ae();
               $$4.a(bvk.d.b);
            }

            $$3.n($$1);
         }

         bvk $$5 = $$0.dl();
         if ($$5 != null) {
            $$0.ae();
            $$1.n($$5);
         }

         if ($$2.b()) {
            for (bvs $$6 : bvs.i) {
               cxp $$7 = $$0.a($$6);
               if (!$$7.f()) {
                  $$1.a($$6, $$7.g());
                  $$1.a($$6, $$0.h($$6));
               }
            }
         }

         $$1.Z = $$0.Z;
         $$1.b(7, $$0.fJ());
         $$1.bd = $$0.bd;
         $$1.aN = $$0.aN;
         $$1.aX = $$0.aX;
         $$1.d($$0.aJ());
         $$0.fP().ifPresent($$1::g);
         bvk $$8 = $$0.A();
         if ($$8 != null) {
            $$1.b($$8, true);
         }

         this.b($$0, $$1, $$2);
      }
   },
   b(false) {
      @Override
      void a(bwi $$0, bwi $$1, bvf $$2) {
         bvk $$3 = $$0.da();
         if ($$3 != null) {
            $$3.ae();
         }

         bvk $$4 = $$0.A();
         if ($$4 != null) {
            $$0.a(true, true);
         }

         this.b($$0, $$1, $$2);
      }
   };

   private final boolean c;

   bvg(final boolean $$0) {
      this.c = $$0;
   }

   public boolean a() {
      return this.c;
   }

   abstract void a(bwi var1, bwi var2, bvf var3);

   void b(bwi $$0, bwi $$1, bvf $$2) {
      $$1.E($$0.fw());

      for (bup $$3 : $$0.eB()) {
         $$1.a(new bup($$3));
      }

      if ($$0.e_()) {
         $$1.a(true);
      }

      if ($$0 instanceof bvb $$4 && $$1 instanceof bvb $$5) {
         $$5.c_($$4.Z_());
         $$5.c = $$4.c;
         $$5.d = $$4.d;
      }

      bxi<?> $$6 = $$0.ec();
      bxi<?> $$7 = $$1.ec();
      if ($$6.a(cfk.ab, cfl.c) && $$6.a(cfk.ab)) {
         $$7.a(cfk.ab, $$6.c(cfk.ab));
      }

      if ($$2.c()) {
         $$1.a_($$0.fN());
      }

      $$1.v($$0.gc());
      $$1.u($$0.gb());
      if ($$0.aj()) {
         $$1.ai();
      }

      if ($$0.l_()) {
         $$1.b($$0.an());
         $$1.p($$0.cL());
      }

      $$1.c($$0.bY());
      $$1.n($$0.cC());
      $$1.f($$0.bc());
      $$1.f($$0.aC());
      $$1.e($$0.bb());
      $$0.as().forEach($$1::a);
      if ($$2.d() != null) {
         fdd $$8 = $$1.dW().Q();
         $$8.a($$1.cH(), $$2.d());
         if ($$0.cr() != null && $$0.cr() == $$2.d()) {
            $$8.b($$0.cH(), $$0.cr());
         }
      }

      if ($$0 instanceof cnq $$9 && $$9.gv() && $$1 instanceof cnq $$10) {
         $$10.y(true);
      }
   }
}
