import javax.annotation.Nullable;

public abstract class cjw extends cin {
   protected static final ajm<Boolean> b = ajq.a(cjw.class, ajo.k);
   protected static final int c = 300;
   protected int d;

   public cjw(brn<? extends cjw> $$0, dad $$1) {
      super($$0, $$1);
      this.a_(true);
      this.y();
      this.a(emr.n, 16.0F);
      this.a(emr.o, -1.0F);
   }

   private void y() {
      if (ccv.a(this)) {
         ((cbk)this.K()).b(true);
      }
   }

   protected abstract boolean r();

   public void w(boolean $$0) {
      this.an().a(b, $$0);
   }

   protected boolean u() {
      return this.an().a(b);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (this.u()) {
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
   protected void Y() {
      super.Y();
      if (this.gp()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gt();
         this.c((aqh)this.dN());
      }
   }

   public boolean gp() {
      return !this.dN().D_().b() && !this.u() && !this.gf();
   }

   protected void c(aqh $$0) {
      cji $$1 = this.a(brn.bw, true);
      if ($$1 != null) {
         $$1.b(new bqt(bqv.i, 200, 0));
      }
   }

   public boolean gq() {
      return !this.p_();
   }

   public abstract cjz gr();

   @Nullable
   @Override
   public bsa p() {
      return this.bE.c(cbd.o).orElse(null);
   }

   protected boolean gs() {
      return this.eV().f() instanceof cun;
   }

   @Override
   public void P() {
      if (cjy.d(this)) {
         super.P();
      }
   }

   @Override
   protected void X() {
      super.X();
      afw.a(this);
   }

   protected abstract void gt();
}
