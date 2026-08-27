import javax.annotation.Nullable;

public abstract class cfw extends cen {
   protected static final aie<Boolean> b = aih.a(cfw.class, aig.k);
   protected static final int c = 300;
   protected int d;

   public cfw(bnu<? extends cfw> $$0, cvn $$1) {
      super($$0, $$1);
      this.s(true);
      this.A();
      this.a(eha.n, 16.0F);
      this.a(eha.o, -1.0F);
   }

   private void A() {
      if (byz.a(this)) {
         ((bxo)this.N()).b(true);
      }
   }

   @Override
   protected abstract boolean u();

   public void w(boolean $$0) {
      this.an().b(b, $$0);
   }

   protected boolean w() {
      return this.an().b(b);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(b, false);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      if (this.w()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.d = $$0.h("TimeInOverworld");
   }

   @Override
   protected void aa() {
      super.aa();
      if (this.gg()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gk();
         this.c((aov)this.dM());
      }
   }

   public boolean gg() {
      return !this.dM().E_().b() && !this.w() && !this.fW();
   }

   protected void c(aov $$0) {
      cfi $$1 = this.a(bnu.bv, true);
      if ($$1 != null) {
         $$1.b(new bnb(bnd.i, 200, 0));
      }
   }

   public boolean gh() {
      return !this.o_();
   }

   public abstract cfz gi();

   @Nullable
   @Override
   public bog q() {
      return this.bz.c(bxh.o).orElse(null);
   }

   protected boolean gj() {
      return this.eT().d() instanceof cqn;
   }

   @Override
   public void R() {
      if (cfy.d(this)) {
         super.R();
      }
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   protected abstract void gk();
}
