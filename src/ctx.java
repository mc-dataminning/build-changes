import javax.annotation.Nullable;

public class ctx extends csl {
   private final csl a;

   public ctx(csl $$0, dey.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.a.n(), 2);
      }
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.y_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(cor $$0, gu $$1) {
      for (ha $$2 : ha.values()) {
         eac $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(apq.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().y_().a(40));
      }

      return this.n();
   }
}
