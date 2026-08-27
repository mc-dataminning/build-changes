import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class ccj extends cbi {
   protected static final afo<Boolean> b = afr.a(ccj.class, afq.k);
   protected static final int c = 300;
   protected static final float d = 1.79F;
   protected int e;

   public ccj(bku<? extends ccj> $$0, csa $$1) {
      super($$0, $$1);
      this.s(true);
      this.A();
      this.a(edd.n, 16.0F);
      this.a(edd.o, -1.0F);
   }

   private void A() {
      if (bvx.a(this)) {
         ((buo)this.N()).b(true);
      }
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return 1.79F;
   }

   @Override
   protected float l(bkq $$0) {
      return -0.7F;
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
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
   protected void b_() {
      super.b_();
      this.an.a(b, false);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      if (this.w()) {
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
   protected void Z() {
      super.Z();
      if (this.gf()) {
         this.e++;
      } else {
         this.e = 0;
      }

      if (this.e > 300) {
         this.gj();
         this.c((ame)this.dN());
      }
   }

   public boolean gf() {
      return !this.dN().D_().b() && !this.w() && !this.fV();
   }

   protected void c(ame $$0) {
      ccd $$1 = this.a(bku.bs, true);
      if ($$1 != null) {
         $$1.b(new bkd(bkf.i, 200, 0));
      }
   }

   public boolean gg() {
      return !this.n_();
   }

   public abstract ccm gh();

   @Nullable
   @Override
   public blg q() {
      return this.bz.c(buh.o).orElse(null);
   }

   protected boolean gi() {
      return this.eU().d() instanceof cmx;
   }

   @Override
   public void R() {
      if (ccl.d(this)) {
         super.R();
      }
   }

   @Override
   protected void Y() {
      super.Y();
      ack.a(this);
   }

   protected abstract void gj();
}
