import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class coe extends cms {
   protected static final ajx<Boolean> a = akb.a(coe.class, ajz.k);
   public static final int b = 300;
   protected int c;

   public coe(bvi<? extends coe> $$0, dgz $$1) {
      super($$0, $$1);
      this.a_(true);
      this.n();
      this.a(eun.n, 16.0F);
      this.a(eun.o, -1.0F);
   }

   private void n() {
      if (cgu.a(this)) {
         ((cfj)this.O()).b(true);
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
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.m()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.c);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.c = $$0.h("TimeInOverworld");
   }

   @Override
   protected void a(ard $$0) {
      super.a($$0);
      if (this.q()) {
         this.c++;
      } else {
         this.c = 0;
      }

      if (this.c > 300) {
         this.gt();
         this.g($$0);
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.c = $$0;
   }

   public boolean q() {
      return !this.dU().B_().b() && !this.m() && !this.gh();
   }

   protected void g(ard $$0) {
      this.a(bvi.bQ, buu.a(this, true, true), $$0x -> $$0x.a(new bue(bug.i, 200, 0)));
   }

   public boolean t() {
      return !this.n_();
   }

   public abstract coh x();

   @Nullable
   @Override
   public bvy f() {
      return this.Q();
   }

   protected boolean gs() {
      return this.eZ().b(kv.B);
   }

   @Override
   public void T() {
      if (cog.c(this)) {
         super.T();
      }
   }

   @Override
   protected void ab() {
      super.ab();
      agc.a(this);
   }

   protected abstract void gt();
}
