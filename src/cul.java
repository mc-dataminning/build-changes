public class cul extends csi {
   private final csx d;
   protected static final float a = 6.0F;
   protected static final eii b = csx.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   protected cul(csx $$0, dfk.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      this.a($$0, (cpy)$$1, $$2);
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.d.n().a(c, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$1 == hc.a && !$$0.a($$3, $$4)) {
         return csy.a.n();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(c)) {
            $$3.a($$4, eap.c, eap.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return b;
   }
}
