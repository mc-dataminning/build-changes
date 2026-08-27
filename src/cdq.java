import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class cdq extends ccj {
   protected static final agj<Boolean> b = agm.a(cdq.class, agl.k);
   protected static final int c = 300;
   protected static final float d = 1.79F;
   protected int e;

   public cdq(blt<? extends cdq> $$0, cti $$1) {
      super($$0, $$1);
      this.s(true);
      this.A();
      this.a(eev.n, 16.0F);
      this.a(eev.o, -1.0F);
   }

   private void A() {
      if (bwy.a(this)) {
         ((bvo)this.N()).b(true);
      }
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return 1.79F;
   }

   @Override
   protected float l(blp $$0) {
      return -0.7F;
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.0625F * $$2, 0.0F);
   }

   @Override
   protected abstract boolean u();

   public void w(boolean $$0) {
      this.an().b(b, $$0);
   }

   protected boolean w() {
      return this.an().b(b);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, false);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      if (this.w()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.e);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.e = $$0.h("TimeInOverworld");
   }

   @Override
   protected void Z() {
      super.Z();
      if (this.ge()) {
         this.e++;
      } else {
         this.e = 0;
      }

      if (this.e > 300) {
         this.gi();
         this.c((amz)this.dM());
      }
   }

   public boolean ge() {
      return !this.dM().E_().b() && !this.w() && !this.fU();
   }

   protected void c(amz $$0) {
      cde $$1 = this.a(blt.bu, true);
      if ($$1 != null) {
         $$1.b(new blc(ble.i, 200, 0));
      }
   }

   public boolean gf() {
      return !this.o_();
   }

   public abstract cdt gg();

   @Nullable
   @Override
   public bmf q() {
      return this.bz.c(bvh.o).orElse(null);
   }

   protected boolean gh() {
      return this.eT().d() instanceof cof;
   }

   @Override
   public void R() {
      if (cds.d(this)) {
         super.R();
      }
   }

   @Override
   protected void Y() {
      super.Y();
      adf.a(this);
   }

   protected abstract void gi();
}
