import javax.annotation.Nullable;

public abstract class ckz extends cjq {
   protected static final ajp<Boolean> b = ajt.a(ckz.class, ajr.k);
   protected static final int c = 300;
   protected int d;

   public ckz(bsm<? extends ckz> $$0, dcf $$1) {
      super($$0, $$1);
      this.a_(true);
      this.y();
      this.a(eoy.n, 16.0F);
      this.a(eoy.o, -1.0F);
   }

   private void y() {
      if (cdx.a(this)) {
         ((ccm)this.K()).b(true);
      }
   }

   protected abstract boolean s();

   public void w(boolean $$0) {
      this.aq().a(b, $$0);
   }

   protected boolean u() {
      return this.aq().a(b);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.u()) {
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
      if (this.go()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gs();
         this.c((aqm)this.dQ());
      }
   }

   public boolean go() {
      return !this.dQ().D_().b() && !this.u() && !this.gd();
   }

   protected void c(aqm $$0) {
      ckl $$1 = this.a(bsm.bx, true);
      if ($$1 != null) {
         $$1.b(new bro(brq.i, 200, 0));
      }
   }

   public boolean gp() {
      return !this.p_();
   }

   public abstract clc gq();

   @Nullable
   @Override
   public btb p() {
      return this.N();
   }

   protected boolean gr() {
      return this.eU().g() instanceof cvs;
   }

   @Override
   public void Q() {
      if (clb.d(this)) {
         super.Q();
      }
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   protected abstract void gs();
}
