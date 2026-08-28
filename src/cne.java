import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class cne extends clv {
   protected static final ako<Boolean> b = aks.a(cne.class, akq.k);
   public static final int c = 300;
   protected int d;

   public cne(bup<? extends cne> $$0, dff $$1) {
      super($$0, $$1);
      this.a_(true);
      this.y();
      this.a(esf.n, 16.0F);
      this.a(esf.o, -1.0F);
   }

   private void y() {
      if (cga.a(this)) {
         ((cep)this.P()).b(true);
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
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      if (this.t()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.d);
   }

   @Override
   public void a(un $$0) {
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
         this.a((arq)this.dY());
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.d = $$0;
   }

   public boolean gv() {
      return !this.dY().D_().b() && !this.t() && !this.gi();
   }

   protected void a(arq $$0) {
      this.a(bup.bx, bud.a(this, true, true), $$0x -> $$0x.a(new btn(btp.i, 200, 0)));
   }

   public boolean gw() {
      return !this.p_();
   }

   public abstract cnh gx();

   @Nullable
   @Override
   public bve m() {
      return this.R();
   }

   protected boolean gy() {
      return this.fc().b(ku.B);
   }

   @Override
   public void U() {
      if (cng.d(this)) {
         super.U();
      }
   }

   @Override
   protected void ab() {
      super.ab();
      agv.a(this);
   }

   protected abstract void gz();
}
