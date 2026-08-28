public enum buh {
   a(true) {
      @Override
      void a(bvj $$0, bvj $$1, bug $$2) {
         bul $$3 = $$0.cZ();
         $$1.w($$0);
         $$1.i($$0.dy());
         if ($$3 != null) {
            $$3.ae();
            $$3.J = 0;

            for (bul $$4 : $$1.cY()) {
               $$4.ae();
               $$4.a(bul.d.b);
            }

            $$3.n($$1);
         }

         bul $$5 = $$0.dk();
         if ($$5 != null) {
            $$0.ae();
            $$1.n($$5);
         }

         if ($$2.b()) {
            for (but $$6 : but.i) {
               cwp $$7 = $$0.a($$6);
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
         bul $$8 = $$0.D();
         if ($$8 != null) {
            $$1.b($$8, true);
         }

         this.b($$0, $$1, $$2);
      }
   },
   b(false) {
      @Override
      void a(bvj $$0, bvj $$1, bug $$2) {
         bul $$3 = $$0.cZ();
         if ($$3 != null) {
            $$3.ae();
         }

         bul $$4 = $$0.D();
         if ($$4 != null) {
            $$0.z();
         }

         this.b($$0, $$1, $$2);
      }
   };

   private final boolean c;

   buh(final boolean $$0) {
      this.c = $$0;
   }

   public boolean a() {
      return this.c;
   }

   abstract void a(bvj var1, bvj var2, bug var3);

   void b(bvj $$0, bvj $$1, bug $$2) {
      $$1.E($$0.fw());

      for (btq $$3 : $$0.eA()) {
         $$1.a(new btq($$3));
      }

      if ($$0.e_()) {
         $$1.a(true);
      }

      if ($$0 instanceof buc $$4 && $$1 instanceof buc $$5) {
         $$5.c_($$4.Y_());
         $$5.c = $$4.c;
         $$5.d = $$4.d;
      }

      bwj<?> $$6 = $$0.eb();
      bwj<?> $$7 = $$1.eb();
      if ($$6.a(cel.ab, cem.c) && $$6.a(cel.ab)) {
         $$7.a(cel.ab, $$6.c(cel.ab));
      }

      if ($$2.c()) {
         $$1.a_($$0.fN());
      }

      $$1.v($$0.gg());
      $$1.u($$0.gf());
      if ($$0.fZ()) {
         $$1.fY();
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
         fcf $$8 = $$1.dV().R();
         $$8.a($$1.cH(), $$2.d());
         if ($$0.cr() != null && $$0.cr() == $$2.d()) {
            $$8.b($$0.cH(), $$0.cr());
         }
      }

      if ($$0 instanceof cmr $$9 && $$9.gz() && $$1 instanceof cmr $$10) {
         $$10.y(true);
      }
   }
}
