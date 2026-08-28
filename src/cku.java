import javax.annotation.Nullable;

public class cku extends cjl {
   public cku(bta<? extends cku> $$0, dby $$1) {
      super($$0, $$1);
      this.a(eom.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bT.a(3, new ccg<>(this, clm.class, true));
      super.z();
   }

   @Override
   protected avz v() {
      return awa.Cz;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.CB;
   }

   @Override
   protected avz o_() {
      return awa.CA;
   }

   @Override
   avz u() {
      return awa.CC;
   }

   @Override
   protected void a(brn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cjp $$4 && $$4.gr()) {
         $$4.gs();
         this.a((dbx)cus.um);
      }
   }

   @Override
   protected void a(azh $$0, bqs $$1) {
      this.a(btb.a, new cup(cus.oQ));
   }

   @Override
   protected void b(azh $$0, bqs $$1) {
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      bui $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(bux.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean C(bsu $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof btp) {
            ((btp)$$0).b(new bsc(bse.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cnd b(cup $$0, float $$1) {
      cnd $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bsc $$0) {
      return $$0.a(bse.t) ? false : super.c($$0);
   }
}
