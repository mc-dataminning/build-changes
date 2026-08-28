import javax.annotation.Nullable;

public abstract class clk extends ckb {
   protected static final akj<Boolean> b = akn.a(clk.class, akl.k);
   protected static final int c = 300;
   protected int d;

   public clk(bsy<? extends clk> $$0, dbw $$1) {
      super($$0, $$1);
      this.a_(true);
      this.y();
      this.a(eok.n, 16.0F);
      this.a(eok.o, -1.0F);
   }

   private void y() {
      if (cej.a(this)) {
         ((ccy)this.K()).b(true);
      }
   }

   protected abstract boolean s();

   public void w(boolean $$0) {
      this.ap().a(b, $$0);
   }

   protected boolean u() {
      return this.ap().a(b);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      if (this.u()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.d = $$0.h("TimeInOverworld");
   }

   @Override
   protected void Z() {
      super.Z();
      if (this.gq()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gu();
         this.c((are)this.dP());
      }
   }

   public boolean gq() {
      return !this.dP().D_().b() && !this.u() && !this.gg();
   }

   protected void c(are $$0) {
      ckw $$1 = this.a(bsy.bx, true);
      if ($$1 != null) {
         $$1.b(new bsa(bsc.i, 200, 0));
      }
   }

   public boolean gr() {
      return !this.p_();
   }

   public abstract cln gs();

   @Nullable
   @Override
   public btn p() {
      return this.N();
   }

   protected boolean gt() {
      return this.eX().g() instanceof cwd;
   }

   @Override
   public void Q() {
      if (clm.d(this)) {
         super.Q();
      }
   }

   @Override
   protected void Y() {
      super.Y();
      ags.a(this);
   }

   protected abstract void gu();
}
