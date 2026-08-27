import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class ccb extends cba {
   protected static final afm<Boolean> b = afp.a(ccb.class, afo.k);
   protected static final int c = 300;
   protected static final float d = 1.79F;
   protected int e;

   public ccb(bkm<? extends ccb> $$0, crs $$1) {
      super($$0, $$1);
      this.s(true);
      this.y();
      this.a(ecr.n, 16.0F);
      this.a(ecr.o, -1.0F);
   }

   private void y() {
      if (bvp.a(this)) {
         ((bug)this.L()).b(true);
      }
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return 1.79F;
   }

   @Override
   protected float l(bki $$0) {
      return -0.7F;
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   protected abstract boolean s();

   public void w(boolean $$0) {
      this.al().b(b, $$0);
   }

   protected boolean t() {
      return this.al().b(b);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, false);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      if (this.t()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.e);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.e = $$0.h("TimeInOverworld");
   }

   @Override
   protected void X() {
      super.X();
      if (this.ge()) {
         this.e++;
      } else {
         this.e = 0;
      }

      if (this.e > 300) {
         this.gi();
         this.c((ama)this.dL());
      }
   }

   public boolean ge() {
      return !this.dL().D_().b() && !this.t() && !this.fU();
   }

   protected void c(ama $$0) {
      cbv $$1 = this.a(bkm.bs, true);
      if ($$1 != null) {
         $$1.b(new bjv(bjx.i, 200, 0));
      }
   }

   public boolean gf() {
      return !this.n_();
   }

   public abstract cce gg();

   @Nullable
   @Override
   public bky q() {
      return this.bz.c(btz.o).orElse(null);
   }

   protected boolean gh() {
      return this.eS().d() instanceof cmp;
   }

   @Override
   public void P() {
      if (ccd.d(this)) {
         super.P();
      }
   }

   @Override
   protected void W() {
      super.W();
      aci.a(this);
   }

   protected abstract void gi();
}
