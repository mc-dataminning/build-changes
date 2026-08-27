import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxn extends bxi {
   private static final cpi cb = cpi.a(cmk.ps, cmk.rW, cmk.rV, cmk.ve, cmk.vb, cmk.vc);
   public float bT;
   public float bU;
   public float bW;
   public float bX;
   public float bY = 1.0F;
   private float cc = 1.0F;
   public int bZ = this.ag.a(6000) + 6000;
   public boolean ca;

   public bxn(blj<? extends bxn> $$0, csy $$1) {
      super($$0, $$1);
      this.a(eek.j, 0.0F);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsl(this));
      this.bO.a(1, new btk(this, 1.4));
      this.bO.a(2, new bsd(this, 1.0));
      this.bO.a(3, new btz(this, 1.0, cb, false));
      this.bO.a(4, new bsq(this, 1.1));
      this.bO.a(5, new bue(this, 1.0));
      this.bO.a(6, new bsz(this, cer.class, 6.0F));
      this.bO.a(7, new btm(this));
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return this.o_() ? $$1.b * 0.85F : $$1.b * 0.92F;
   }

   public static bna.a u() {
      return blx.C().a(bnb.l, 4.0).a(bnb.m, 0.25);
   }

   @Override
   public void d_() {
      super.d_();
      this.bX = this.bT;
      this.bW = this.bU;
      this.bU = this.bU + (this.aC() ? -1.0F : 4.0F) * 0.3F;
      this.bU = aty.a(this.bU, 0.0F, 1.0F);
      if (!this.aC() && this.bY < 1.0F) {
         this.bY = 1.0F;
      }

      this.bY *= 0.9F;
      elb $$0 = this.dp();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bT = this.bT + this.bY * 2.0F;
      if (!this.dM().B && this.bx() && !this.o_() && !this.w() && --this.bZ <= 0) {
         this.a(arc.ev, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         this.a(cmk.qO);
         this.a(dmz.t);
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
   protected arb y() {
      return arc.et;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.ew;
   }

   @Override
   protected arb n_() {
      return arc.eu;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.ex, 0.15F, 1.0F);
   }

   @Nullable
   public bxn b(amp $$0, bla $$1) {
      return blj.r.a((csy)$$0);
   }

   @Override
   public boolean m(cmh $$0) {
      return cb.a($$0);
   }

   @Override
   public int ee() {
      return this.w() ? 10 : super.ee();
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.ca = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.bZ = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.ca);
      $$0.a("EggLayTime", this.bZ);
   }

   @Override
   public boolean h(double $$0) {
      return this.w();
   }

   @Override
   protected void a(blf $$0, blf.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof blv) {
         ((blv)$$0).aU = this.aU;
      }
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, -0.1F * $$2);
   }

   public boolean w() {
      return this.ca;
   }

   public void w(boolean $$0) {
      this.ca = $$0;
   }
}
