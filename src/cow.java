import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class cow extends cnj {
   protected static final akg<Boolean> a = akk.a(cow.class, aki.k);
   public static final int b = 300;
   protected int c;

   public cow(bwb<? extends cow> $$0, dhp $$1) {
      super($$0, $$1);
      this.a_(true);
      this.n();
      this.a(evk.n, 16.0F);
      this.a(evk.o, -1.0F);
   }

   private void n() {
      if (chl.a(this)) {
         ((cga)this.O()).b(true);
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
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      if (this.m()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.c);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.c = $$0.h("TimeInOverworld");
   }

   @Override
   protected void a(arn $$0) {
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

   protected void g(arn $$0) {
      this.a(bwb.bQ, bvm.a(this, true, true), $$0x -> $$0x.a(new buw(buy.i, 200, 0)));
   }

   public boolean t() {
      return !this.n_();
   }

   public abstract coz x();

   @Nullable
   @Override
   public bwr f() {
      return this.Q();
   }

   protected boolean gq() {
      return this.fa().c(kx.B);
   }

   @Override
   public void T() {
      if (coy.c(this)) {
         super.T();
      }
   }

   @Override
   protected void ab() {
      super.ab();
      agj.a(this);
   }

   protected abstract void gr();
}
