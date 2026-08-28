import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class cna extends clr {
   protected static final akl<Boolean> b = akp.a(cna.class, akn.k);
   public static final int c = 300;
   protected int d;

   public cna(bul<? extends cna> $$0, dfb $$1) {
      super($$0, $$1);
      this.a_(true);
      this.y();
      this.a(esb.n, 16.0F);
      this.a(esb.o, -1.0F);
   }

   private void y() {
      if (cfw.a(this)) {
         ((cel)this.P()).b(true);
      }
   }

   @Override
   protected abstract boolean q();

   public void x(boolean $$0) {
      this.aw().a(b, $$0);
   }

   protected boolean t() {
      return this.aw().a(b);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (this.t()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.d = $$0.h("TimeInOverworld");
   }

   @Override
   protected void ac() {
      super.ac();
      if (this.gu()) {
         this.d++;
      } else {
         this.d = 0;
      }

      if (this.d > 300) {
         this.gy();
         this.a((arn)this.dX());
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.d = $$0;
   }

   public boolean gu() {
      return !this.dX().D_().b() && !this.t() && !this.gh();
   }

   protected void a(arn $$0) {
      this.a(bul.bx, btz.a(this, true, true), $$0x -> $$0x.a(new btj(btl.i, 200, 0)));
   }

   public boolean gv() {
      return !this.p_();
   }

   public abstract cnd gw();

   @Nullable
   @Override
   public bva m() {
      return this.R();
   }

   protected boolean gx() {
      return this.fb().b(ku.B);
   }

   @Override
   public void U() {
      if (cnc.d(this)) {
         super.U();
      }
   }

   @Override
   protected void ab() {
      super.ab();
      ags.a(this);
   }

   protected abstract void gy();
}
