import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class cok extends cmx {
   protected static final alc<Boolean> a = alg.a(cok.class, ale.k);
   public static final int b = 300;
   protected int c;

   public cok(bvr<? extends cok> $$0, dhi $$1) {
      super($$0, $$1);
      this.a_(true);
      this.t();
      this.a(euo.n, 16.0F);
      this.a(euo.o, -1.0F);
   }

   private void t() {
      if (chc.a(this)) {
         ((cfr)this.L()).b(true);
      }
   }

   protected abstract boolean m();

   public void x(boolean $$0) {
      this.au().a(a, $$0);
   }

   protected boolean p() {
      return this.au().a(a);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      if (this.p()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.c);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.c = $$0.h("TimeInOverworld");
   }

   @Override
   protected void a(ash $$0) {
      super.a($$0);
      if (this.x()) {
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

   public boolean x() {
      return !this.dW().G_().b() && !this.p() && !this.gb();
   }

   protected void g(ash $$0) {
      this.a(bvr.bR, bvf.a(this, true, true), $$0x -> $$0x.a(new bup(bur.i, 200, 0)));
   }

   public boolean go() {
      return !this.e_();
   }

   public abstract coo gp();

   @Nullable
   @Override
   public bwg O_() {
      return this.O();
   }

   protected boolean gq() {
      return this.eZ().b(ku.B);
   }

   @Override
   public void R() {
      if (com.c(this)) {
         super.R();
      }
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   protected abstract void gr();
}
