public enum bua {
   a(true) {
      @Override
      void a(bvc $$0, bvc $$1, btz $$2) {
         bue $$3 = $$0.db();
         $$1.w($$0);
         $$1.h($$0.dA());
         if ($$3 != null) {
            $$3.af();
            $$3.K = 0;

            for (bue $$4 : $$1.da()) {
               $$4.af();
               $$4.a(bue.c.b);
            }

            $$3.n($$1);
         }

         if ($$2.b()) {
            for (bum $$5 : bum.i) {
               cwb $$6 = $$0.a($$5);
               if (!$$6.f()) {
                  $$1.a($$5, $$6.g());
                  $$1.a($$5, $$0.h($$5));
               }
            }
         }

         $$1.aa = $$0.aa;
         $$1.b(7, $$0.fL());
         $$1.bd = $$0.bd;
         $$1.aN = $$0.aN;
         $$1.aX = $$0.aX;
         $$1.d($$0.aK());
         $$0.fR().ifPresent($$1::g);
         bue $$7 = $$0.C();
         if ($$7 != null) {
            $$1.b($$7, true);
         }

         this.b($$0, $$1, $$2);
      }
   },
   b(false) {
      @Override
      void a(bvc $$0, bvc $$1, btz $$2) {
         bue $$3 = $$0.db();
         if ($$3 != null) {
            $$3.af();
         }

         bue $$4 = $$0.C();
         if ($$4 != null) {
            $$0.a(true, true);
         }

         this.b($$0, $$1, $$2);
      }
   };

   private final boolean c;

   bua(final boolean $$0) {
      this.c = $$0;
   }

   public boolean a() {
      return this.c;
   }

   abstract void a(bvc var1, bvc var2, btz var3);

   void b(bvc $$0, bvc $$1, btz $$2) {
      $$1.E($$0.fy());

      for (btj $$3 : $$0.eD()) {
         $$1.a($$3);
      }

      if ($$0.p_()) {
         $$1.a(true);
      }

      if ($$0 instanceof btv $$4 && $$1 instanceof btv $$5) {
         $$5.c_($$4.g());
         $$5.d = $$4.d;
         $$5.e = $$4.e;
      }

      bwc<?> $$6 = $$0.ed();
      bwc<?> $$7 = $$1.ed();
      if ($$6.a(cee.ab, cef.c) && $$6.a(cee.ab)) {
         $$7.a(cee.ab, $$6.c(cee.ab));
      }

      if ($$2.c()) {
         $$1.a_($$0.fP());
      }

      $$1.v($$0.gi());
      $$1.u($$0.gh());
      if ($$0.gb()) {
         $$1.ga();
      }

      if ($$0.an()) {
         $$1.b($$0.ao());
         $$1.p($$0.cM());
      }

      $$1.c($$0.bZ());
      $$1.n($$0.cD());
      $$1.f($$0.bd());
      $$1.f($$0.aE());
      $$1.e($$0.bc());
      $$0.at().forEach($$1::a);
      if ($$2.d() != null) {
         fas $$8 = $$1.dX().O();
         $$8.a($$1.cI(), $$2.d());
         if ($$0.cs() != null && $$0.cs() == $$2.d()) {
            $$8.b($$0.cI(), $$0.cs());
         }
      }
   }
}
