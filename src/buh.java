public enum buh {
   a(true) {
      @Override
      void a(bvj $$0, bvj $$1, bug $$2) {
         bul $$3 = $$0.da();
         $$1.w($$0);
         $$1.h($$0.dy());
         if ($$3 != null) {
            $$3.ae();
            $$3.J = 0;

            for (bul $$4 : $$1.cZ()) {
               $$4.ae();
               $$4.a(bul.c.b);
            }

            $$3.n($$1);
         }

         if ($$2.b()) {
            for (but $$5 : but.i) {
               cwm $$6 = $$0.a($$5);
               if (!$$6.f()) {
                  $$1.a($$5, $$6.g());
                  $$1.a($$5, $$0.h($$5));
               }
            }
         }

         $$1.Z = $$0.Z;
         $$1.b(7, $$0.fH());
         $$1.bc = $$0.bc;
         $$1.aM = $$0.aM;
         $$1.aW = $$0.aW;
         $$1.d($$0.aJ());
         $$0.fN().ifPresent($$1::g);
         bul $$7 = $$0.A();
         if ($$7 != null) {
            $$1.b($$7, true);
         }

         this.b($$0, $$1, $$2);
      }
   },
   b(false) {
      @Override
      void a(bvj $$0, bvj $$1, bug $$2) {
         bul $$3 = $$0.da();
         if ($$3 != null) {
            $$3.ae();
         }

         bul $$4 = $$0.A();
         if ($$4 != null) {
            $$0.a(true, true);
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
      $$1.E($$0.fu());

      for (btq $$3 : $$0.eA()) {
         $$1.a(new btq($$3));
      }

      if ($$0.e_()) {
         $$1.a(true);
      }

      if ($$0 instanceof buc $$4 && $$1 instanceof buc $$5) {
         $$5.c_($$4.X_());
         $$5.c = $$4.c;
         $$5.d = $$4.d;
      }

      bwj<?> $$6 = $$0.eb();
      bwj<?> $$7 = $$1.eb();
      if ($$6.a(cel.ab, cem.c) && $$6.a(cel.ab)) {
         $$7.a(cel.ab, $$6.c(cel.ab));
      }

      if ($$2.c()) {
         $$1.a_($$0.fL());
      }

      $$1.v($$0.ga());
      $$1.u($$0.fZ());
      if ($$0.aj()) {
         $$1.ai();
      }

      if ($$0.k_()) {
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
         fbd $$8 = $$1.dV().P();
         $$8.a($$1.cH(), $$2.d());
         if ($$0.cr() != null && $$0.cr() == $$2.d()) {
            $$8.b($$0.cH(), $$0.cr());
         }
      }

      if ($$0 instanceof cmr $$9 && $$9.gu() && $$1 instanceof cmr $$10) {
         $$10.y(true);
      }
   }
}
