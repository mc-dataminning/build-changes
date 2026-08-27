import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class cac extends bzb {
   protected static final adz<Boolean> b = aec.a(cac.class, aeb.k);
   protected static final int c = 300;
   protected static final float d = 1.79F;
   protected int e;

   public cac(bim<? extends cac> $$0, cpm $$1) {
      super($$0, $$1);
      this.s(true);
      this.t();
      this.a(eao.n, 16.0F);
      this.a(eao.o, -1.0F);
   }

   private void t() {
      if (btq.a(this)) {
         ((bsh)this.H()).b(true);
      }
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return 1.79F;
   }

   @Override
   protected float l(bii $$0) {
      return -0.7F;
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected abstract boolean p();

   public void w(boolean $$0) {
      this.al().b(b, $$0);
   }

   protected boolean q() {
      return this.al().b(b);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, false);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (this.q()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.e);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.e = $$0.h("TimeInOverworld");
   }

   @Override
   protected void V() {
      super.V();
      if (this.fZ()) {
         this.e++;
      } else {
         this.e = 0;
      }

      if (this.e > 300) {
         this.gd();
         this.c((akk)this.dK());
      }
   }

   public boolean fZ() {
      return !this.dK().x_().b() && !this.q() && !this.fQ();
   }

   protected void c(akk $$0) {
      bzw $$1 = this.a(bim.bs, true);
      if ($$1 != null) {
         $$1.b(new bhv(bhx.i, 200, 0));
      }
   }

   public boolean ga() {
      return !this.i_();
   }

   public abstract caf gb();

   @Nullable
   @Override
   public biy j() {
      return this.bz.c(bsa.o).orElse(null);
   }

   protected boolean gc() {
      return this.eR().d() instanceof ckm;
   }

   @Override
   public void M() {
      if (cae.d(this)) {
         super.M();
      }
   }

   @Override
   protected void T() {
      super.T();
      aav.a(this);
   }

   protected abstract void gd();
}
