import javax.annotation.Nullable;

public abstract class chh extends cfy {
   protected static final aim<Boolean> b = aiq.a(chh.class, aio.k);
   protected static final int c = 300;
   protected int d;

   public chh(bpc<? extends chh> $$0, cwz $$1) {
      super($$0, $$1);
      this.s(true);
      this.y();
      this.a(eiy.n, 16.0F);
      this.a(eiy.o, -1.0F);
   }

   private void y() {
      if (caj.a(this)) {
         ((byy)this.K()).b(true);
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
      cgt $$1 = this.a(bpc.bw, true);
      if ($$1 != null) {
         $$1.b(new boj(bol.i, 200, 0));
      }
   }

   public boolean go() {
      return !this.o_();
   }

   public abstract chk gp();

   @Nullable
   @Override
   public bpo p() {
      return this.bC.c(byr.o).orElse(null);
   }

   protected boolean gq() {
      return this.eU().d() instanceof cry;
   }

   @Override
   public void P() {
      if (chj.d(this)) {
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
