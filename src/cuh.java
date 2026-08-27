import javax.annotation.Nullable;

public class cuh extends csv {
   private final csv a;

   public cuh(csv $$0, dfi.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.a.n(), 2);
      }
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.D_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(cpb $$0, gw $$1) {
      for (ha $$2 : ha.values()) {
         eam $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(apx.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().D_().a(40));
      }

      return this.n();
   }
}
