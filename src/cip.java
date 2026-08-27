import javax.annotation.Nullable;

public abstract class cip extends chg {
   protected static final aja<Boolean> b = aje.a(cip.class, ajc.k);
   protected static final int c = 300;
   protected int d;

   public cip(bqg<? extends cip> $$0, czg $$1) {
      super($$0, $$1);
      this.s(true);
      this.y();
      this.a(els.n, 16.0F);
      this.a(els.o, -1.0F);
   }

   private void y() {
      if (cbo.a(this)) {
         ((cad)this.K()).b(true);
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
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      if (this.u()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.d = $$0.h("TimeInOverworld");
   }

   @Override
   protected void Y() {
      super.Y();
      if (this.gn()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gr();
         this.c((apu)this.dM());
      }
   }

   public boolean gn() {
      return !this.dM().D_().b() && !this.u() && !this.gd();
   }

   protected void c(apu $$0) {
      cib $$1 = this.a(bqg.bw, true);
      if ($$1 != null) {
         $$1.b(new bpm(bpo.i, 200, 0));
      }
   }

   public boolean go() {
      return !this.p_();
   }

   public abstract cis gp();

   @Nullable
   @Override
   public bqt p() {
      return this.bC.c(bzw.o).orElse(null);
   }

   protected boolean gq() {
      return this.eU().f() instanceof ctf;
   }

   @Override
   public void P() {
      if (cir.d(this)) {
         super.P();
      }
   }

   @Override
   protected void X() {
      super.X();
      afk.a(this);
   }

   protected abstract void gr();
}
