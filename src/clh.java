import javax.annotation.Nullable;

public abstract class clh extends cjy {
   protected static final akg<Boolean> b = akk.a(clh.class, aki.k);
   protected static final int c = 300;
   protected int d;

   public clh(bsv<? extends clh> $$0, dbt $$1) {
      super($$0, $$1);
      this.a_(true);
      this.y();
      this.a(eoh.n, 16.0F);
      this.a(eoh.o, -1.0F);
   }

   private void y() {
      if (ceg.a(this)) {
         ((ccv)this.K()).b(true);
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
   protected void a(akk.a $$0) {
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
         this.c((arb)this.dP());
      }
   }

   public boolean gq() {
      return !this.dP().D_().b() && !this.u() && !this.gg();
   }

   protected void c(arb $$0) {
      ckt $$1 = this.a(bsv.bx, true);
      if ($$1 != null) {
         $$1.b(new brx(brz.i, 200, 0));
      }
   }

   public boolean gr() {
      return !this.p_();
   }

   public abstract clk gs();

   @Nullable
   @Override
   public btk p() {
      return this.N();
   }

   protected boolean gt() {
      return this.eX().g() instanceof cwa;
   }

   @Override
   public void Q() {
      if (clj.d(this)) {
         super.Q();
      }
   }

   @Override
   protected void Y() {
      super.Y();
      agp.a(this);
   }

   protected abstract void gu();
}
