import javax.annotation.Nullable;

public class cqz extends cpn {
   private final cpn a;

   public cqz(cpn $$0, dca.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.a.n(), 2);
      }
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.y_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(cls $$0, gu $$1) {
      for (ha $$2 : ha.values()) {
         dxe $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(anb.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().y_().a(40));
      }

      return this.n();
   }
}
