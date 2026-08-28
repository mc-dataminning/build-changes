import javax.annotation.Nullable;

public class cks extends cjj {
   public cks(bsw<? extends cks> $$0, dcu $$1) {
      super($$0, $$1);
      this.a(epp.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bV.a(3, new ccd<>(this, clk.class, true));
      super.z();
   }

   @Override
   protected avn v() {
      return avo.CD;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.CF;
   }

   @Override
   protected avn n_() {
      return avo.CE;
   }

   @Override
   avn t() {
      return avo.CG;
   }

   @Override
   protected void a(aqt $$0, brj $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cjn $$4 && $$4.gn()) {
         $$4.go();
         this.a((dct)cur.um);
      }
   }

   @Override
   protected void a(ayv $$0, bqo $$1) {
      this.a(bsx.a, new cuo(cur.oR));
   }

   @Override
   protected void a(ddj $$0, ayv $$1, bqo $$2) {
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      buf $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(buu.c).a(4.0);
      this.x();
      return $$4;
   }

   @Override
   public boolean D(bsq $$0) {
      if (!super.D($$0)) {
         return false;
      } else {
         if ($$0 instanceof btl) {
            ((btl)$$0).b(new bry(bsa.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cnb a(cuo $$0, float $$1, @Nullable cuo $$2) {
      cnb $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean c(bry $$0) {
      return $$0.a(bsa.t) ? false : super.c($$0);
   }
}
