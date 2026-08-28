public enum btv {
   a(true) {
      @Override
      void a(bux $$0, bux $$1, btu $$2) {
         btz $$3 = $$0.db();
         if ($$3 != null) {
            $$3.af();
            $$3.K = 0;
            $$3.n($$1);
         }

         if ($$2.b()) {
            for (buh $$4 : buh.i) {
               cvx $$5 = $$0.a($$4);
               if (!$$5.f()) {
                  $$1.a($$4, $$5.g());
                  $$1.a($$4, $$0.h($$4));
               }
            }
         }

         $$1.fa().a($$0.fa());
         $$1.aa = $$0.aa;
         $$1.b(7, $$0.fL());
         float $$6 = $$0.eG() / $$0.eV();
         $$1.x($$1.eV() * $$6);
         $$1.ba = $$0.ba;
         $$1.aK = $$0.aK;
         $$1.aU = $$0.aU;
         $$1.w($$0);
         $$1.h($$0.dA());
         $$1.d($$0.aJ());
         $$0.fR().ifPresent($$1::g);
         btz $$7 = $$0.C();
         if ($$7 != null) {
            $$1.b($$7, true);
         }

         this.b($$0, $$1, $$2);
      }
   },
   b(false) {
      @Override
      void a(bux $$0, bux $$1, btu $$2) {
         btz $$3 = $$0.db();
         if ($$3 != null) {
            $$3.af();
         }

         btz $$4 = $$0.C();
         if ($$4 != null) {
            $$0.a(true, true);
         }

         this.b($$0, $$1, $$2);
      }
   };

   private final boolean c;

   btv(final boolean $$0) {
      this.c = $$0;
   }

   public boolean a() {
      return this.c;
   }

   abstract void a(bux var1, bux var2, btu var3);

   void b(bux $$0, bux $$1, btu $$2) {
      $$1.E($$0.fy());

      for (bte $$3 : $$0.eD()) {
         $$1.a($$3);
      }

      if ($$0.p_()) {
         $$1.a(true);
      }

      if ($$0 instanceof btq $$4 && $$1 instanceof btq $$5) {
         $$5.c_($$4.g());
         $$5.d = $$4.d;
         $$5.e = $$4.e;
      }

      bvx<?> $$6 = $$0.ed();
      bvx<?> $$7 = $$1.ed();
      if ($$6.a(cdz.ab, cea.c) && $$6.a(cdz.ab)) {
         $$7.a(cdz.ab, $$6.c(cdz.ab));
      }

      if ($$2.c()) {
         $$1.a_($$0.fP());
      }

      $$1.v($$0.gj());
      $$1.u($$0.gi());
      if ($$0.gc()) {
         $$1.gb();
      }

      $$1.a($$0.ec());
      $$1.a($$0.eK());
      if ($$0.am()) {
         $$1.b($$0.an());
         $$1.p($$0.cM());
      }

      $$1.c($$0.bZ());
      $$1.n($$0.cD());
      $$1.f($$0.bd());
      $$1.f($$0.aD());
      $$1.e($$0.bc());
      $$0.as().forEach($$1::a);
      if ($$2.d() != null) {
         fam $$8 = $$1.dX().O();
         $$8.a($$1.cI(), $$2.d());
         if ($$0.cs() != null && $$0.cs() == $$2.d()) {
            $$8.b($$0.cI(), $$0.cs());
         }
      }
   }
}
