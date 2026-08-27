import javax.annotation.Nullable;

public class ctw extends csk {
   private final csk a;

   public ctw(csk $$0, dex.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.a.n(), 2);
      }
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.y_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(coq $$0, gv $$1) {
      for (hb $$2 : hb.values()) {
         eab $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(apo.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().y_().a(40));
      }

      return this.n();
   }
}
