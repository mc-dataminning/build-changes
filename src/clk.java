import javax.annotation.Nullable;

public abstract class clk extends ckb {
   protected static final ajv<Boolean> b = ajz.a(clk.class, ajx.k);
   protected static final int c = 300;
   protected int d;

   public clk(bsw<? extends clk> $$0, dcu $$1) {
      super($$0, $$1);
      this.a_(true);
      this.x();
      this.a(epp.n, 16.0F);
      this.a(epp.o, -1.0F);
   }

   private void x() {
      if (cei.a(this)) {
         ((ccx)this.J()).b(true);
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
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (this.t()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.d = $$0.h("TimeInOverworld");
   }

   @Override
   protected void Z() {
      super.Z();
      if (this.gm()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gq();
         this.a((aqt)this.dQ());
      }
   }

   public boolean gm() {
      return !this.dQ().D_().b() && !this.t() && !this.gb();
   }

   protected void a(aqt $$0) {
      ckw $$1 = this.a(bsw.bx, true);
      if ($$1 != null) {
         $$1.b(new bry(bsa.i, 200, 0));
      }
   }

   public boolean gn() {
      return !this.o_();
   }

   public abstract cln go();

   @Nullable
   @Override
   public btl p() {
      return this.N();
   }

   protected boolean gp() {
      return this.eU().g() instanceof cwh;
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
      age.a(this);
   }

   protected abstract void gq();
}
