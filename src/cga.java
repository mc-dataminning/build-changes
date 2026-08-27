import javax.annotation.Nullable;

public abstract class cga extends cer {
   protected static final aie<Boolean> b = aih.a(cga.class, aig.k);
   protected static final int c = 300;
   protected int d;

   public cga(bnw<? extends cga> $$0, cvr $$1) {
      super($$0, $$1);
      this.s(true);
      this.A();
      this.a(ehh.n, 16.0F);
      this.a(ehh.o, -1.0F);
   }

   private void A() {
      if (bzd.a(this)) {
         ((bxs)this.N()).b(true);
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
         this.c((aow)this.dM());
      }
   }

   public boolean gg() {
      return !this.dM().E_().b() && !this.w() && !this.fW();
   }

   protected void c(aow $$0) {
      cfm $$1 = this.a(bnw.bv, true);
      if ($$1 != null) {
         $$1.b(new bnd(bnf.i, 200, 0));
      }
   }

   public boolean gh() {
      return !this.o_();
   }

   public abstract cgd gi();

   @Nullable
   @Override
   public boi q() {
      return this.bz.c(bxl.o).orElse(null);
   }

   protected boolean gj() {
      return this.eT().d() instanceof cqr;
   }

   @Override
   public void R() {
      if (cgc.d(this)) {
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
