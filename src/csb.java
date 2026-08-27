public class csb extends csx implements csz {
   protected static final float a = 4.0F;
   protected static final eii b = csx.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   public csb(dfk.d $$0) {
      super($$0);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      ehp $$4 = $$0.n($$1, $$2);
      return b.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$3.a(3) == 0 && $$1.t($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return $$1.a_($$2.d()).a(apu.at);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if (!$$0.a($$3, $$4)) {
         return csy.a.n();
      } else {
         if ($$1 == hc.b && $$2.a(csy.mZ)) {
            $$3.a($$4, csy.mZ.n(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      return new cjh(cjk.dv);
   }

   @Override
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return true;
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      this.a($$0, $$2);
   }

   @Override
   public float a(dfl $$0, cbw $$1, cpd $$2, gw $$3) {
      return $$1.eS().d() instanceof cks ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(cpx $$0, gw $$1) {
      $$0.a($$1.c(), csy.mZ.n().a(csc.h, dfx.b), 3);
   }
}
