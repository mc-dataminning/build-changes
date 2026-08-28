import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class cpq extends cod {
   protected static final akj<Boolean> a = akn.a(cpq.class, akl.k);
   public static final int b = 300;
   protected int c;

   public cpq(bwo<? extends cpq> $$0, dja $$1) {
      super($$0, $$1);
      this.a_(true);
      this.n();
      this.a(exf.n, 16.0F);
      this.a(exf.o, -1.0F);
   }

   private void n() {
      if (chy.a(this)) {
         ((cgn)this.O()).b(true);
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
         this.gs();
         this.g($$0);
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.c = $$0;
   }

   public boolean q() {
      return !this.dV().B_().b() && !this.m() && !this.gg();
   }

   protected void g(arq $$0) {
      this.a(bwo.bR, bvz.a(this, true, true), $$0x -> $$0x.a(new bvj(bvl.i, 200, 0)));
   }

   public boolean t() {
      return !this.n_();
   }

   public abstract cpt x();

   @Nullable
   @Override
   public bxe f() {
      return this.Q();
   }

   protected boolean gr() {
      return this.fb().c(kj.A);
   }

   @Override
   public void T() {
      if (cps.c(this)) {
         super.T();
      }
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   protected abstract void gs();
}
