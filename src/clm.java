import javax.annotation.Nullable;

public abstract class clm extends ckd {
   protected static final ajw<Boolean> b = aka.a(clm.class, ajy.k);
   protected static final int c = 300;
   protected int d;

   public clm(bsx<? extends clm> $$0, dcw $$1) {
      super($$0, $$1);
      this.a_(true);
      this.x();
      this.a(ept.n, 16.0F);
      this.a(ept.o, -1.0F);
   }

   private void x() {
      if (cek.a(this)) {
         ((ccz)this.N()).b(true);
      }
   }

   protected abstract boolean s();

   public void w(boolean $$0) {
      this.ar().a(b, $$0);
   }

   protected boolean t() {
      return this.ar().a(b);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      if (this.t()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.d = $$0.h("TimeInOverworld");
   }

   @Override
   protected void ab() {
      super.ab();
      if (this.gl()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gp();
         this.a((aqu)this.dP());
      }
   }

   public boolean gl() {
      return !this.dP().D_().b() && !this.t() && !this.ga();
   }

   protected void a(aqu $$0) {
      cky $$1 = this.a(bsx.bx, true);
      if ($$1 != null) {
         $$1.b(new brz(bsb.i, 200, 0));
      }
   }

   public boolean gm() {
      return !this.o_();
   }

   public abstract clp gn();

   @Nullable
   @Override
   public btn p() {
      return this.P();
   }

   protected boolean go() {
      return this.eU().g() instanceof cwj;
   }

   @Override
   public void S() {
      if (clo.d(this)) {
         super.S();
      }
   }

   @Override
   protected void aa() {
      super.aa();
      agf.a(this);
   }

   protected abstract void gp();
}
