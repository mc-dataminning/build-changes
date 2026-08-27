import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byd extends bxy {
   private static final cpz cb = cpz.a(cnb.ps, cnb.rW, cnb.rV, cnb.ve, cnb.vb, cnb.vc);
   public float bT;
   public float bU;
   public float bW;
   public float bX;
   public float bY = 1.0F;
   private float cc = 1.0F;
   public int bZ = this.ag.a(6000) + 6000;
   public boolean ca;

   public byd(blz<? extends byd> $$0, ctp $$1) {
      super($$0, $$1);
      this.a(efc.j, 0.0F);
   }

   @Override
   protected void B() {
      this.bO.a(0, new btb(this));
      this.bO.a(1, new bua(this, 1.4));
      this.bO.a(2, new bst(this, 1.0));
      this.bO.a(3, new bup(this, 1.0, cb, false));
      this.bO.a(4, new btg(this, 1.1));
      this.bO.a(5, new buu(this, 1.0));
      this.bO.a(6, new btp(this, cfi.class, 6.0F));
      this.bO.a(7, new buc(this));
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return this.o_() ? $$1.b * 0.85F : $$1.b * 0.92F;
   }

   public static bnq.a u() {
      return bmn.C().a(bnr.l, 4.0).a(bnr.m, 0.25);
   }

   @Override
   public void d_() {
      super.d_();
      this.bX = this.bT;
      this.bW = this.bU;
      this.bU = this.bU + (this.aC() ? -1.0F : 4.0F) * 0.3F;
      this.bU = auo.a(this.bU, 0.0F, 1.0F);
      if (!this.aC() && this.bY < 1.0F) {
         this.bY = 1.0F;
      }

      this.bY *= 0.9F;
      elt $$0 = this.dp();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bT = this.bT + this.bY * 2.0F;
      if (!this.dM().B && this.bx() && !this.o_() && !this.w() && --this.bZ <= 0) {
         this.a(ars.ev, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         this.a(cnb.qO);
         this.a(dnr.t);
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
   protected arr y() {
      return ars.et;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.ew;
   }

   @Override
   protected arr n_() {
      return ars.eu;
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.ex, 0.15F, 1.0F);
   }

   @Nullable
   public byd b(and $$0, blq $$1) {
      return blz.r.a((ctp)$$0);
   }

   @Override
   public boolean m(cmy $$0) {
      return cb.a($$0);
   }

   @Override
   public int ee() {
      return this.w() ? 10 : super.ee();
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.ca = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.bZ = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.ca);
      $$0.a("EggLayTime", this.bZ);
   }

   @Override
   public boolean h(double $$0) {
      return this.w();
   }

   @Override
   protected void a(blv $$0, blv.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bml) {
         ((bml)$$0).aU = this.aU;
      }
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, -0.1F * $$2);
   }

   public boolean w() {
      return this.ca;
   }

   public void w(boolean $$0) {
      this.ca = $$0;
   }
}
