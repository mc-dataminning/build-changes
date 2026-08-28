import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class cqa extends coo {
   protected static final akj<Boolean> a = akn.a(cqa.class, akl.k);
   public static final int b = 300;
   protected int c;

   public cqa(bwr<? extends cqa> $$0, djm $$1) {
      super($$0, $$1);
      this.a_(true);
      this.n();
      this.a(exr.n, 16.0F);
      this.a(exr.o, -1.0F);
   }

   private void n() {
      if (cid.a(this)) {
         ((cgs)this.O()).b(true);
      }
   }

   protected abstract boolean j();

   public void w(boolean $$0) {
      this.ar().a(a, $$0);
   }

   protected boolean m() {
      return this.ar().a(a);
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
      if (!$$0.c("CanPickUpLoot")) {
         this.a_(true);
      }

      this.w($$0.o("IsImmuneToZombification"));
      this.c = $$0.f("TimeInOverworld");
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
         this.gu();
         this.g($$0);
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.c = $$0;
   }

   public boolean q() {
      return !this.dU().B_().b() && !this.m() && !this.gi();
   }

   protected void g(arq $$0) {
      this.a(bwr.bR, bwc.a(this, true, true), $$0x -> $$0x.a(new bvm(bvo.i, 200, 0)));
   }

   public boolean t() {
      return !this.n_();
   }

   public abstract cqd x();

   @Nullable
   @Override
   public bxj f() {
      return this.Q();
   }

   protected boolean gt() {
      return this.fa().c(kk.A);
   }

   @Override
   public void T() {
      if (cqc.c(this)) {
         super.T();
      }
   }

   @Override
   protected void ac() {
      super.ac();
      agm.a(this);
   }

   protected abstract void gu();
}
