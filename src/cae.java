import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class cae extends bzd {
   protected static final aec<Boolean> b = aef.a(cae.class, aee.k);
   protected static final int c = 300;
   protected static final float d = 1.79F;
   protected int e;

   public cae(bip<? extends cae> $$0, cpq $$1) {
      super($$0, $$1);
      this.s(true);
      this.t();
      this.a(eas.n, 16.0F);
      this.a(eas.o, -1.0F);
   }

   private void t() {
      if (bts.a(this)) {
         ((bsj)this.H()).b(true);
      }
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return 1.79F;
   }

   @Override
   protected float l(bil $$0) {
      return -0.7F;
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
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
   public void b(qu $$0) {
      super.b($$0);
      if (this.q()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.e);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.e = $$0.h("TimeInOverworld");
   }

   @Override
   protected void V() {
      super.V();
      if (this.ga()) {
         this.e++;
      } else {
         this.e = 0;
      }

      if (this.e > 300) {
         this.ge();
         this.c((akn)this.dK());
      }
   }

   public boolean ga() {
      return !this.dK().x_().b() && !this.q() && !this.fQ();
   }

   protected void c(akn $$0) {
      bzy $$1 = this.a(bip.bs, true);
      if ($$1 != null) {
         $$1.b(new bhy(bia.i, 200, 0));
      }
   }

   public boolean gb() {
      return !this.i_();
   }

   public abstract cah gc();

   @Nullable
   @Override
   public bjb j() {
      return this.bz.c(bsc.o).orElse(null);
   }

   protected boolean gd() {
      return this.eR().d() instanceof cko;
   }

   @Override
   public void M() {
      if (cag.d(this)) {
         super.M();
      }
   }

   @Override
   protected void T() {
      super.T();
      aay.a(this);
   }

   protected abstract void ge();
}
