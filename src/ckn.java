import javax.annotation.Nullable;

public abstract class ckn extends cjd {
   protected static final ajy<Boolean> b = akc.a(ckn.class, aka.k);
   protected static final int c = 300;
   protected int d;

   public ckn(bsb<? extends ckn> $$0, dca $$1) {
      super($$0, $$1);
      this.a_(true);
      this.x();
      this.a(epv.n, 16.0F);
      this.a(epv.o, -1.0F);
   }

   private void x() {
      if (cdj.a(this)) {
         ((cby)this.J()).b(true);
      }
   }

   protected abstract boolean r();

   public void w(boolean $$0) {
      this.ap().a(b, $$0);
   }

   protected boolean t() {
      return this.ap().a(b);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (this.t()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.d = $$0.h("TimeInOverworld");
   }

   @Override
   protected void Y() {
      super.Y();
      if (this.gy()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gC();
         this.a((aqt)this.dU());
      }
   }

   public boolean gy() {
      return !this.dU().E_().b() && !this.t() && !this.go();
   }

   protected void a(aqt $$0) {
      cjz $$1 = this.a(bsb.bC, true);
      if ($$1 != null) {
         $$1.b(new brh(brj.i, 200, 0));
      }
   }

   public boolean gz() {
      return !this.o_();
   }

   public abstract ckq gA();

   @Nullable
   @Override
   public bso p() {
      return this.bO.c(cbr.o).orElse(null);
   }

   protected boolean gB() {
      return this.fg().f() instanceof cwf;
   }

   @Override
   public void P() {
      if (ckp.d(this)) {
         super.P();
      }
   }

   @Override
   protected void X() {
      super.X();
      agi.a(this);
   }

   protected abstract void gC();
}
