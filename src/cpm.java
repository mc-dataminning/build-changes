import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class cpm extends cnz {
   protected static final akj<Boolean> a = akn.a(cpm.class, akl.k);
   public static final int b = 300;
   protected int c;

   public cpm(bwm<? extends cpm> $$0, div $$1) {
      super($$0, $$1);
      this.a_(true);
      this.n();
      this.a(ewx.n, 16.0F);
      this.a(ewx.o, -1.0F);
   }

   private void n() {
      if (chw.a(this)) {
         ((cgl)this.O()).b(true);
      }
   }

   protected abstract boolean j();

   public void w(boolean $$0) {
      this.au().a(a, $$0);
   }

   protected boolean m() {
      return this.au().a(a);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (this.m()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.c);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if (!$$0.e("CanPickUpLoot")) {
         this.a_(true);
      }

      this.w($$0.q("IsImmuneToZombification"));
      this.c = $$0.h("TimeInOverworld");
   }

   @Override
   protected void a(arq $$0) {
      super.a($$0);
      if (this.q()) {
         this.c++;
      } else {
         this.c = 0;
      }

      if (this.c > 300) {
         this.gr();
         this.g($$0);
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.c = $$0;
   }

   public boolean q() {
      return !this.dV().B_().b() && !this.m() && !this.gf();
   }

   protected void g(arq $$0) {
      this.a(bwm.bR, bvx.a(this, true, true), $$0x -> $$0x.a(new bvh(bvj.i, 200, 0)));
   }

   public boolean t() {
      return !this.n_();
   }

   public abstract cpp x();

   @Nullable
   @Override
   public bxc f() {
      return this.Q();
   }

   protected boolean gq() {
      return this.fa().c(kj.A);
   }

   @Override
   public void T() {
      if (cpo.c(this)) {
         super.T();
      }
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   protected abstract void gr();
}
