import javax.annotation.Nullable;

public abstract class cla extends cjr {
   protected static final ajp<Boolean> b = ajt.a(cla.class, ajr.k);
   protected static final int c = 300;
   protected int d;

   public cla(bsn<? extends cla> $$0, dcg $$1) {
      super($$0, $$1);
      this.a_(true);
      this.x();
      this.a(epa.n, 16.0F);
      this.a(epa.o, -1.0F);
   }

   private void x() {
      if (cdy.a(this)) {
         ((ccn)this.J()).b(true);
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
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.t()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.d = $$0.h("TimeInOverworld");
   }

   @Override
   protected void Z() {
      super.Z();
      if (this.gn()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gr();
         this.b((aqm)this.dR());
      }
   }

   public boolean gn() {
      return !this.dR().D_().b() && !this.t() && !this.gc();
   }

   protected void b(aqm $$0) {
      ckm $$1 = this.a(bsn.bx, true);
      if ($$1 != null) {
         $$1.b(new brp(brr.i, 200, 0));
      }
   }

   public boolean go() {
      return !this.o_();
   }

   public abstract cld gp();

   @Nullable
   @Override
   public btc p() {
      return this.N();
   }

   protected boolean gq() {
      return this.eV().g() instanceof cvt;
   }

   @Override
   public void Q() {
      if (clc.d(this)) {
         super.Q();
      }
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   protected abstract void gr();
}
