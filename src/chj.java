import javax.annotation.Nullable;

public abstract class chj extends cga {
   protected static final aim<Boolean> b = aiq.a(chj.class, aio.k);
   protected static final int c = 300;
   protected int d;

   public chj(bpd<? extends chj> $$0, cxb $$1) {
      super($$0, $$1);
      this.s(true);
      this.y();
      this.a(ejg.n, 16.0F);
      this.a(ejg.o, -1.0F);
   }

   private void y() {
      if (cak.a(this)) {
         ((byz)this.K()).b(true);
      }
   }

   protected abstract boolean r();

   public void w(boolean $$0) {
      this.an().a(b, $$0);
   }

   protected boolean s() {
      return this.an().a(b);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      if (this.s()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public void a(ta $$0) {
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
         this.c((apf)this.dM());
      }
   }

   public boolean gn() {
      return !this.dM().D_().b() && !this.s() && !this.gd();
   }

   protected void c(apf $$0) {
      cgv $$1 = this.a(bpd.bx, true);
      if ($$1 != null) {
         $$1.b(new bok(bom.i, 200, 0));
      }
   }

   public boolean go() {
      return !this.o_();
   }

   public abstract chm gp();

   @Nullable
   @Override
   public bpp p() {
      return this.bC.c(bys.o).orElse(null);
   }

   protected boolean gq() {
      return this.eU().d() instanceof csa;
   }

   @Override
   public void P() {
      if (chl.d(this)) {
         super.P();
      }
   }

   @Override
   protected void X() {
      super.X();
      aew.a(this);
   }

   protected abstract void gr();
}
