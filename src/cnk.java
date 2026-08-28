import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class cnk extends clx {
   protected static final ajx<Boolean> a = akb.a(cnk.class, ajz.k);
   public static final int b = 300;
   protected int c;

   public cnk(bur<? extends cnk> $$0, dgi $$1) {
      super($$0, $$1);
      this.a_(true);
      this.t();
      this.a(etq.n, 16.0F);
      this.a(etq.o, -1.0F);
   }

   private void t() {
      if (cgc.a(this)) {
         ((cer)this.L()).b(true);
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
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.p()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.c);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.c = $$0.h("TimeInOverworld");
   }

   @Override
   protected void a(arc $$0) {
      super.a($$0);
      if (this.x()) {
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

   public boolean x() {
      return !this.dW().G_().b() && !this.p() && !this.gc();
   }

   protected void g(arc $$0) {
      this.a(bur.bR, buf.a(this, true, true), $$0x -> $$0x.a(new btp(btr.i, 200, 0)));
   }

   public boolean gp() {
      return !this.e_();
   }

   public abstract cnn gq();

   @Nullable
   @Override
   public bvg O_() {
      return this.O();
   }

   protected boolean gr() {
      return this.eZ().b(kv.B);
   }

   @Override
   public void R() {
      if (cnm.c(this)) {
         super.R();
      }
   }

   @Override
   protected void Z() {
      super.Z();
      agc.a(this);
   }

   protected abstract void gs();
}
