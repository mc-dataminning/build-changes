import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class caa extends byz {
   protected static final adx<Boolean> b = aea.a(caa.class, adz.k);
   protected static final int c = 300;
   protected static final float d = 1.79F;
   protected int e;

   public caa(bik<? extends caa> $$0, cpk $$1) {
      super($$0, $$1);
      this.s(true);
      this.t();
      this.a(eam.n, 16.0F);
      this.a(eam.o, -1.0F);
   }

   private void t() {
      if (bto.a(this)) {
         ((bsf)this.H()).b(true);
      }
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return 1.79F;
   }

   @Override
   protected float l(big $$0) {
      return -0.7F;
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
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
   public void b(qs $$0) {
      super.b($$0);
      if (this.q()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.e);
   }

   @Override
   public void a(qs $$0) {
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
         this.c((aki)this.dK());
      }
   }

   public boolean fZ() {
      return !this.dK().x_().b() && !this.q() && !this.fQ();
   }

   protected void c(aki $$0) {
      bzu $$1 = this.a(bik.bs, true);
      if ($$1 != null) {
         $$1.b(new bht(bhv.i, 200, 0));
      }
   }

   public boolean ga() {
      return !this.i_();
   }

   public abstract cad gb();

   @Nullable
   @Override
   public biw j() {
      return this.bz.c(bry.o).orElse(null);
   }

   protected boolean gc() {
      return this.eR().d() instanceof ckk;
   }

   @Override
   public void M() {
      if (cac.d(this)) {
         super.M();
      }
   }

   @Override
   protected void T() {
      super.T();
      aau.a(this);
   }

   protected abstract void gd();
}
