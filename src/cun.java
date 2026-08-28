public class cun extends cty {
   private static final ku a = new kt() {
      private final kt c = new kt();

      @Override
      public cud a(kr $$0, cud $$1) {
         jf $$2 = $$0.d().c(dhn.b);
         aqm $$3 = $$0.b();
         ewh $$4 = $$0.a();
         double $$5 = $$4.a() + (double)$$2.j() * 1.125;
         double $$6 = Math.floor($$4.b()) + (double)$$2.k();
         double $$7 = $$4.c() + (double)$$2.l() * 1.125;
         ja $$8 = $$0.c().a($$2);
         dsl $$9 = $$3.a_($$8);
         dtp $$10 = $$9.b() instanceof dex ? $$9.c(((dex)$$9.b()).c()) : dtp.a;
         double $$11;
         if ($$9.a(avw.N)) {
            if ($$10.b()) {
               $$11 = 0.6;
            } else {
               $$11 = 0.1;
            }
         } else {
            if (!$$9.i() || !$$3.a_($$8.d()).a(avw.N)) {
               return this.c.dispense($$0, $$1);
            }

            dsl $$13 = $$3.a_($$8.d());
            dtp $$14 = $$13.b() instanceof dex ? $$13.c(((dex)$$13.b()).c()) : dtp.a;
            if ($$2 != jf.a && $$14.b()) {
               $$11 = -0.4;
            } else {
               $$11 = -0.9;
            }
         }

         cog $$18 = cog.a($$3, $$5, $$6 + $$11, $$7, ((cun)$$1.g()).b, $$1, null);
         $$3.b($$18);
         $$1.h(1);
         return $$1;
      }

      @Override
      protected void a(kr $$0) {
         $$0.b().c(1000, $$0.c(), 0);
      }
   };
   final cog.a b;

   public cun(cog.a $$0, cty.a $$1) {
      super($$1);
      this.b = $$0;
      dhn.a(this, a);
   }

   @Override
   public bqh a(cxp $$0) {
      dcg $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsl $$3 = $$1.a_($$2);
      if (!$$3.a(avw.N)) {
         return bqh.f;
      } else {
         cud $$4 = $$0.n();
         if ($$1 instanceof aqm $$5) {
            dtp $$6 = $$3.b() instanceof dex ? $$3.c(((dex)$$3.b()).c()) : dtp.a;
            double $$7 = 0.0;
            if ($$6.b()) {
               $$7 = 0.5;
            }

            cog $$8 = cog.a($$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.0625 + $$7, (double)$$2.w() + 0.5, this.b, $$4, $$0.o());
            $$5.b($$8);
            $$5.a(dxh.t, $$2, dxh.a.a($$0.o(), $$5.a_($$2.d())));
         }

         $$4.h(1);
         return bqh.a($$1.B);
      }
   }
}
