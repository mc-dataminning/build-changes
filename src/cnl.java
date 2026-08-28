import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class cnl extends clz {
   protected static final ajy<Boolean> a = akc.a(cnl.class, aka.k);
   public static final int b = 300;
   protected int c;

   public cnl(but<? extends cnl> $$0, dgj $$1) {
      super($$0, $$1);
      this.a_(true);
      this.t();
      this.a(etr.n, 16.0F);
      this.a(etr.o, -1.0F);
   }

   private void t() {
      if (cge.a(this)) {
         ((cet)this.P()).b(true);
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
   protected void a(akc.a $$0) {
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
   protected void a(ard $$0) {
      super.a($$0);
      if (this.x()) {
         this.c++;
      } else {
         this.c = 0;
      }

      if (this.c > 300) {
         this.gv();
         this.g($$0);
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.c = $$0;
   }

   public boolean x() {
      return !this.dV().G_().b() && !this.p() && !this.gf();
   }

   protected void g(ard $$0) {
      this.a(but.bQ, buh.a(this, true, true), $$0x -> $$0x.a(new btr(btt.i, 200, 0)));
   }

   public boolean gs() {
      return !this.e_();
   }

   public abstract cno gt();

   @Nullable
   @Override
   public bvi O_() {
      return this.R();
   }

   protected boolean gu() {
      return this.eZ().b(kv.B);
   }

   @Override
   public void U() {
      if (cnn.c(this)) {
         super.U();
      }
   }

   @Override
   protected void ac() {
      super.ac();
      agd.a(this);
   }

   protected abstract void gv();
}
