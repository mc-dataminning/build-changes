import javax.annotation.Nullable;

public class cuj extends csx {
   private final csx a;

   public cuj(csx $$0, dfk.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.a.n(), 2);
      }
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.D_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(cpd $$0, gw $$1) {
      for (hc $$2 : hc.values()) {
         eao $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(apz.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().D_().a(40));
      }

      return this.n();
   }
}
