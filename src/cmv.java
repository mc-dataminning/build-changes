import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class cmv extends clm {
   protected static final akk<Boolean> b = ako.a(cmv.class, akm.k);
   public static final int c = 300;
   protected int d;

   public cmv(bug<? extends cmv> $$0, dev $$1) {
      super($$0, $$1);
      this.a_(true);
      this.y();
      this.a(erv.n, 16.0F);
      this.a(erv.o, -1.0F);
   }

   private void y() {
      if (cfr.a(this)) {
         ((ceg)this.P()).b(true);
      }
   }

   @Override
   protected abstract boolean q();

   public void x(boolean $$0) {
      this.av().a(b, $$0);
   }

   protected boolean t() {
      return this.av().a(b);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      if (this.t()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.d = $$0.h("TimeInOverworld");
   }

   @Override
   protected void ac() {
      super.ac();
      if (this.gv()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gz();
         this.a((arm)this.dX());
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.d = $$0;
   }

   public boolean gv() {
      return !this.dX().D_().b() && !this.t() && !this.gi();
   }

   protected void a(arm $$0) {
      this.a(bug.bx, btu.a(this, true, true), $$0x -> $$0x.a(new bte(btg.i, 200, 0)));
   }

   public boolean gw() {
      return !this.p_();
   }

   public abstract cmy gx();

   @Nullable
   @Override
   public buv m() {
      return this.R();
   }

   protected boolean gy() {
      return this.fb().b(kt.B);
   }

   @Override
   public void U() {
      if (cmx.d(this)) {
         super.U();
      }
   }

   @Override
   protected void ab() {
      super.ab();
      agr.a(this);
   }

   protected abstract void gz();
}
