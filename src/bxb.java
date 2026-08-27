import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxb extends bww {
   private static final coq cb = coq.a(clr.ps, clr.rW, clr.rV, clr.vd, clr.va, clr.vb);
   public float bT;
   public float bU;
   public float bW;
   public float bX;
   public float bY = 1.0F;
   private float cc = 1.0F;
   public int bZ = this.ag.a(6000) + 6000;
   public boolean ca;

   public bxb(bkz<? extends bxb> $$0, csf $$1) {
      super($$0, $$1);
      this.a(edi.j, 0.0F);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsa(this));
      this.bO.a(1, new bsz(this, 1.4));
      this.bO.a(2, new brs(this, 1.0));
      this.bO.a(3, new bto(this, 1.0, cb, false));
      this.bO.a(4, new bsf(this, 1.1));
      this.bO.a(5, new btt(this, 1.0));
      this.bO.a(6, new bso(this, cdz.class, 6.0F));
      this.bO.a(7, new btb(this));
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return this.o_() ? $$1.b * 0.85F : $$1.b * 0.92F;
   }

   public static bmq.a u() {
      return bln.C().a(bmr.l, 4.0).a(bmr.m, 0.25);
   }

   @Override
   public void d_() {
      super.d_();
      this.bX = this.bT;
      this.bW = this.bU;
      this.bU = this.bU + (this.aC() ? -1.0F : 4.0F) * 0.3F;
      this.bU = atq.a(this.bU, 0.0F, 1.0F);
      if (!this.aC() && this.bY < 1.0F) {
         this.bY = 1.0F;
      }

      this.bY *= 0.9F;
      ejz $$0 = this.dq();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bT = this.bT + this.bY * 2.0F;
      if (!this.dN().B && this.bx() && !this.o_() && !this.w() && --this.bZ <= 0) {
         this.a(aqv.em, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         this.a(clr.qO);
         this.a(dlx.t);
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
   protected aqu y() {
      return aqv.ek;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.en;
   }

   @Override
   protected aqu n_() {
      return aqv.el;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.eo, 0.15F, 1.0F);
   }

   @Nullable
   public bxb b(ami $$0, bkq $$1) {
      return bkz.q.a((csf)$$0);
   }

   @Override
   public boolean m(clo $$0) {
      return cb.a($$0);
   }

   @Override
   public int ef() {
      return this.w() ? 10 : super.ef();
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.ca = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.bZ = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.ca);
      $$0.a("EggLayTime", this.bZ);
   }

   @Override
   public boolean h(double $$0) {
      return this.w();
   }

   @Override
   protected void a(bkv $$0, bkv.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bll) {
         ((bll)$$0).aU = this.aU;
      }
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, -0.1F * $$2);
   }

   public boolean w() {
      return this.ca;
   }

   public void w(boolean $$0) {
      this.ca = $$0;
   }
}
