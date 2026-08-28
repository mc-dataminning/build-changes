public enum bue {
   a(true) {
      @Override
      void a(bvg $$0, bvg $$1, bud $$2) {
         bui $$3 = $$0.dc();
         $$1.w($$0);
         $$1.h($$0.dB());
         if ($$3 != null) {
            $$3.af();
            $$3.K = 0;

            for (bui $$4 : $$1.db()) {
               $$4.af();
               $$4.a(bui.c.b);
            }

            $$3.n($$1);
         }

         if ($$2.b()) {
            for (buq $$5 : buq.i) {
               cwf $$6 = $$0.a($$5);
               if (!$$6.f()) {
                  $$1.a($$5, $$6.g());
                  $$1.a($$5, $$0.h($$5));
               }
            }
         }

         $$1.aa = $$0.aa;
         $$1.b(7, $$0.fM());
         $$1.bd = $$0.bd;
         $$1.aN = $$0.aN;
         $$1.aX = $$0.aX;
         $$1.d($$0.aL());
         $$0.fS().ifPresent($$1::g);
         bui $$7 = $$0.C();
         if ($$7 != null) {
            $$1.b($$7, true);
         }

         this.b($$0, $$1, $$2);
      }
   },
   b(false) {
      @Override
      void a(bvg $$0, bvg $$1, bud $$2) {
         bui $$3 = $$0.dc();
         if ($$3 != null) {
            $$3.af();
         }

         bui $$4 = $$0.C();
         if ($$4 != null) {
            $$0.a(true, true);
         }

         this.b($$0, $$1, $$2);
      }
   };

   private final boolean c;

   bue(final boolean $$0) {
      this.c = $$0;
   }

   public boolean a() {
      return this.c;
   }

   abstract void a(bvg var1, bvg var2, bud var3);

   void b(bvg $$0, bvg $$1, bud $$2) {
      $$1.E($$0.fz());

      for (btn $$3 : $$0.eE()) {
         $$1.a($$3);
      }

      if ($$0.p_()) {
         $$1.a(true);
      }

      if ($$0 instanceof btz $$4 && $$1 instanceof btz $$5) {
         $$5.c_($$4.g());
         $$5.d = $$4.d;
         $$5.e = $$4.e;
      }

      bwg<?> $$6 = $$0.ee();
      bwg<?> $$7 = $$1.ee();
      if ($$6.a(cei.ab, cej.c) && $$6.a(cei.ab)) {
         $$7.a(cei.ab, $$6.c(cei.ab));
      }

      if ($$2.c()) {
         $$1.a_($$0.fQ());
      }

      $$1.v($$0.gj());
      $$1.u($$0.gi());
      if ($$0.gc()) {
         $$1.gb();
      }

      if ($$0.an()) {
         $$1.b($$0.ao());
         $$1.p($$0.cN());
      }

      $$1.c($$0.ca());
      $$1.n($$0.cE());
      $$1.f($$0.be());
      $$1.f($$0.aE());
      $$1.e($$0.bd());
      $$0.at().forEach($$1::a);
      if ($$2.d() != null) {
         faw $$8 = $$1.dY().O();
         $$8.a($$1.cJ(), $$2.d());
         if ($$0.ct() != null && $$0.ct() == $$2.d()) {
            $$8.b($$0.cJ(), $$0.ct());
         }
      }
   }
}
