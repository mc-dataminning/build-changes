import javax.annotation.Nullable;

public abstract class cja extends chr {
   protected static final ajk<Boolean> b = ajo.a(cja.class, ajm.k);
   protected static final int c = 300;
   protected int d;

   public cja(bqr<? extends cja> $$0, czu $$1) {
      super($$0, $$1);
      this.a_(true);
      this.y();
      this.a(emi.n, 16.0F);
      this.a(emi.o, -1.0F);
   }

   private void y() {
      if (cbz.a(this)) {
         ((cao)this.K()).b(true);
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
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      if (this.u()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public void a(ty $$0) {
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
         this.c((aqe)this.dN());
      }
   }

   public boolean gp() {
      return !this.dN().D_().b() && !this.u() && !this.gf();
   }

   protected void c(aqe $$0) {
      cim $$1 = this.a(bqr.bw, true);
      if ($$1 != null) {
         $$1.b(new bpx(bpz.i, 200, 0));
      }
   }

   public boolean gq() {
      return !this.p_();
   }

   public abstract cjd gr();

   @Nullable
   @Override
   public bre p() {
      return this.bE.c(cah.o).orElse(null);
   }

   protected boolean gs() {
      return this.eV().f() instanceof ctr;
   }

   @Override
   public void P() {
      if (cjc.d(this)) {
         super.P();
      }
   }

   @Override
   protected void X() {
      super.X();
      afu.a(this);
   }

   protected abstract void gt();
}
