import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class coj extends cmw {
   protected static final alc<Boolean> a = alg.a(coj.class, ale.k);
   public static final int b = 300;
   protected int c;

   public coj(bvq<? extends coj> $$0, dhh $$1) {
      super($$0, $$1);
      this.a_(true);
      this.t();
      this.a(eun.n, 16.0F);
      this.a(eun.o, -1.0F);
   }

   private void t() {
      if (chb.a(this)) {
         ((cfq)this.L()).b(true);
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
         this.gp();
         this.g($$0);
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.c = $$0;
   }

   public boolean x() {
      return !this.dV().G_().b() && !this.p() && !this.fZ();
   }

   protected void g(ash $$0) {
      this.a(bvq.bR, bve.a(this, true, true), $$0x -> $$0x.a(new buo(buq.i, 200, 0)));
   }

   public boolean gm() {
      return !this.e_();
   }

   public abstract com gn();

   @Nullable
   @Override
   public bwf O_() {
      return this.O();
   }

   protected boolean go() {
      return this.eX().b(ku.B);
   }

   @Override
   public void R() {
      if (col.c(this)) {
         super.R();
      }
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   protected abstract void gp();
}
