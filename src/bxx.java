import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxx extends bxs {
   private static final cps cb = cps.a(cmu.ps, cmu.rW, cmu.rV, cmu.ve, cmu.vb, cmu.vc);
   public float bT;
   public float bU;
   public float bW;
   public float bX;
   public float bY = 1.0F;
   private float cc = 1.0F;
   public int bZ = this.ag.a(6000) + 6000;
   public boolean ca;

   public bxx(blt<? extends bxx> $$0, cti $$1) {
      super($$0, $$1);
      this.a(eev.j, 0.0F);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsv(this));
      this.bO.a(1, new btu(this, 1.4));
      this.bO.a(2, new bsn(this, 1.0));
      this.bO.a(3, new buj(this, 1.0, cb, false));
      this.bO.a(4, new bta(this, 1.1));
      this.bO.a(5, new buo(this, 1.0));
      this.bO.a(6, new btj(this, cfb.class, 6.0F));
      this.bO.a(7, new btw(this));
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return this.o_() ? $$1.b * 0.85F : $$1.b * 0.92F;
   }

   public static bnk.a u() {
      return bmh.C().a(bnl.l, 4.0).a(bnl.m, 0.25);
   }

   @Override
   public void d_() {
      super.d_();
      this.bX = this.bT;
      this.bW = this.bU;
      this.bU = this.bU + (this.aC() ? -1.0F : 4.0F) * 0.3F;
      this.bU = aui.a(this.bU, 0.0F, 1.0F);
      if (!this.aC() && this.bY < 1.0F) {
         this.bY = 1.0F;
      }

      this.bY *= 0.9F;
      elm $$0 = this.dp();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bT = this.bT + this.bY * 2.0F;
      if (!this.dM().B && this.bx() && !this.o_() && !this.w() && --this.bZ <= 0) {
         this.a(arm.ev, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         this.a(cmu.qO);
         this.a(dnk.t);
         this.bZ = this.ag.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aT() {
      return this.aa > this.cc;
   }

   @Override
   protected void aS() {
      this.cc = this.aa + this.bU / 2.0F;
   }

   @Override
   protected arl y() {
      return arm.et;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.ew;
   }

   @Override
   protected arl n_() {
      return arm.eu;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.ex, 0.15F, 1.0F);
   }

   @Nullable
   public bxx b(amz $$0, blk $$1) {
      return blt.r.a((cti)$$0);
   }

   @Override
   public boolean m(cmr $$0) {
      return cb.a($$0);
   }

   @Override
   public int ee() {
      return this.w() ? 10 : super.ee();
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.ca = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.bZ = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.ca);
      $$0.a("EggLayTime", this.bZ);
   }

   @Override
   public boolean h(double $$0) {
      return this.w();
   }

   @Override
   protected void a(blp $$0, blp.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bmf) {
         ((bmf)$$0).aU = this.aU;
      }
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, -0.1F * $$2);
   }

   public boolean w() {
      return this.ca;
   }

   public void w(boolean $$0) {
      this.ca = $$0;
   }
}
