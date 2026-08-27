import javax.annotation.Nullable;

public abstract class cef extends ccw {
   protected static final agn<Boolean> b = agq.a(cef.class, agp.k);
   protected static final int c = 300;
   protected int d;

   public cef(bmc<? extends cef> $$0, ctx $$1) {
      super($$0, $$1);
      this.s(true);
      this.A();
      this.a(efk.n, 16.0F);
      this.a(efk.o, -1.0F);
   }

   private void A() {
      if (bxi.a(this)) {
         ((bvx)this.N()).b(true);
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
      this.an.a(b, false);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      if (this.w()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.d = $$0.h("TimeInOverworld");
   }

   @Override
   protected void aa() {
      super.aa();
      if (this.gf()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gj();
         this.c((ane)this.dL());
      }
   }

   public boolean gf() {
      return !this.dL().E_().b() && !this.w() && !this.fV();
   }

   protected void c(ane $$0) {
      cdr $$1 = this.a(bmc.bv, true);
      if ($$1 != null) {
         $$1.b(new blj(bll.i, 200, 0));
      }
   }

   public boolean gg() {
      return !this.o_();
   }

   public abstract cei gh();

   @Nullable
   @Override
   public bmo q() {
      return this.bz.c(bvq.o).orElse(null);
   }

   protected boolean gi() {
      return this.eT().d() instanceof cov;
   }

   @Override
   public void R() {
      if (ceh.d(this)) {
         super.R();
      }
   }

   @Override
   protected void Z() {
      super.Z();
      adj.a(this);
   }

   protected abstract void gj();
}
