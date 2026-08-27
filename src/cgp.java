import javax.annotation.Nullable;

public abstract class cgp extends cfg {
   protected static final aii<Boolean> b = ail.a(cgp.class, aik.k);
   protected static final int c = 300;
   protected int d;

   public cgp(bol<? extends cgp> $$0, cwe $$1) {
      super($$0, $$1);
      this.s(true);
      this.A();
      this.a(eic.n, 16.0F);
      this.a(eic.o, -1.0F);
   }

   private void A() {
      if (bzs.a(this)) {
         ((byh)this.N()).b(true);
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
   public void b(sy $$0) {
      super.b($$0);
      if (this.w()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.d = $$0.h("TimeInOverworld");
   }

   @Override
   protected void aa() {
      super.aa();
      if (this.gl()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gp();
         this.c((apa)this.dJ());
      }
   }

   public boolean gl() {
      return !this.dJ().E_().b() && !this.w() && !this.gb();
   }

   protected void c(apa $$0) {
      cgb $$1 = this.a(bol.bv, true);
      if ($$1 != null) {
         $$1.b(new bns(bnu.i, 200, 0));
      }
   }

   public boolean gm() {
      return !this.o_();
   }

   public abstract cgs gn();

   @Nullable
   @Override
   public box q() {
      return this.bA.c(bya.o).orElse(null);
   }

   protected boolean go() {
      return this.eR().d() instanceof cre;
   }

   @Override
   public void R() {
      if (cgr.d(this)) {
         super.R();
      }
   }

   @Override
   protected void Z() {
      super.Z();
      aes.a(this);
   }

   protected abstract void gp();
}
