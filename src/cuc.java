import javax.annotation.Nullable;

public class cuc extends csq {
   private final csq a;

   public cuc(csq $$0, dfd.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.a.n(), 2);
      }
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.y_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(cow $$0, gw $$1) {
      for (hc $$2 : hc.values()) {
         eah $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(apt.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().y_().a(40));
      }

      return this.n();
   }
}
