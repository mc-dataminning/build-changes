import javax.annotation.Nullable;

public abstract class ckw extends cjn {
   protected static final ajp<Boolean> b = ajt.a(ckw.class, ajr.k);
   protected static final int c = 300;
   protected int d;

   public ckw(bsj<? extends ckw> $$0, dcd $$1) {
      super($$0, $$1);
      this.a_(true);
      this.y();
      this.a(eos.n, 16.0F);
      this.a(eos.o, -1.0F);
   }

   private void y() {
      if (cdu.a(this)) {
         ((ccj)this.K()).b(true);
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
      if (this.gn()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gr();
         this.c((aqk)this.dP());
      }
   }

   public boolean gn() {
      return !this.dP().D_().b() && !this.u() && !this.gc();
   }

   protected void c(aqk $$0) {
      cki $$1 = this.a(bsj.bx, true);
      if ($$1 != null) {
         $$1.b(new brl(brn.i, 200, 0));
      }
   }

   public boolean go() {
      return !this.p_();
   }

   public abstract ckz gp();

   @Nullable
   @Override
   public bsy p() {
      return this.N();
   }

   protected boolean gq() {
      return this.eT().g() instanceof cvq;
   }

   @Override
   public void Q() {
      if (cky.d(this)) {
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
