import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class cob extends cmo {
   protected static final aks<Boolean> a = akw.a(cob.class, aku.k);
   public static final int b = 300;
   protected int c;

   public cob(bvi<? extends cob> $$0, dgz $$1) {
      super($$0, $$1);
      this.a_(true);
      this.t();
      this.a(euh.n, 16.0F);
      this.a(euh.o, -1.0F);
   }

   private void t() {
      if (cgt.a(this)) {
         ((cfi)this.L()).b(true);
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
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      if (this.p()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.c);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.c = $$0.h("TimeInOverworld");
   }

   @Override
   protected void a(arx $$0) {
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

   protected void g(arx $$0) {
      this.a(bvi.bR, buw.a(this, true, true), $$0x -> $$0x.a(new bug(bui.i, 200, 0)));
   }

   public boolean go() {
      return !this.e_();
   }

   public abstract coe gp();

   @Nullable
   @Override
   public bvx O_() {
      return this.O();
   }

   protected boolean gq() {
      return this.eZ().b(ku.B);
   }

   @Override
   public void R() {
      if (cod.c(this)) {
         super.R();
      }
   }

   @Override
   protected void Y() {
      super.Y();
      agy.a(this);
   }

   protected abstract void gr();
}
