import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class cdw extends cco {
   protected static final agm<Boolean> b = agp.a(cdw.class, ago.k);
   protected static final int c = 300;
   protected static final float d = 1.79F;
   protected int e;

   public cdw(bly<? extends cdw> $$0, cto $$1) {
      super($$0, $$1);
      this.s(true);
      this.A();
      this.a(efb.n, 16.0F);
      this.a(efb.o, -1.0F);
   }

   private void A() {
      if (bxd.a(this)) {
         ((bvt)this.N()).b(true);
      }
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return 1.79F;
   }

   @Override
   protected float l(blu $$0) {
      return -0.7F;
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
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
   public void b(sn $$0) {
      super.b($$0);
      if (this.w()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.e);
   }

   @Override
   public void a(sn $$0) {
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
         this.c((and)this.dM());
      }
   }

   public boolean ge() {
      return !this.dM().E_().b() && !this.w() && !this.fU();
   }

   protected void c(and $$0) {
      cdj $$1 = this.a(bly.bu, true);
      if ($$1 != null) {
         $$1.b(new blh(blj.i, 200, 0));
      }
   }

   public boolean gf() {
      return !this.o_();
   }

   public abstract cdz gg();

   @Nullable
   @Override
   public bmk q() {
      return this.bz.c(bvm.o).orElse(null);
   }

   protected boolean gh() {
      return this.eT().d() instanceof col;
   }

   @Override
   public void R() {
      if (cdy.d(this)) {
         super.R();
      }
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a(this);
   }

   protected abstract void gi();
}
