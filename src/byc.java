import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byc extends bxx {
   private static final cpy cb = cpy.a(cna.ps, cna.rW, cna.rV, cna.ve, cna.vb, cna.vc);
   public float bT;
   public float bU;
   public float bW;
   public float bX;
   public float bY = 1.0F;
   private float cc = 1.0F;
   public int bZ = this.ag.a(6000) + 6000;
   public boolean ca;

   public byc(bly<? extends byc> $$0, cto $$1) {
      super($$0, $$1);
      this.a(efb.j, 0.0F);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bta(this));
      this.bO.a(1, new btz(this, 1.4));
      this.bO.a(2, new bss(this, 1.0));
      this.bO.a(3, new buo(this, 1.0, cb, false));
      this.bO.a(4, new btf(this, 1.1));
      this.bO.a(5, new but(this, 1.0));
      this.bO.a(6, new bto(this, cfh.class, 6.0F));
      this.bO.a(7, new bub(this));
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return this.o_() ? $$1.b * 0.85F : $$1.b * 0.92F;
   }

   public static bnp.a u() {
      return bmm.C().a(bnq.l, 4.0).a(bnq.m, 0.25);
   }

   @Override
   public void d_() {
      super.d_();
      this.bX = this.bT;
      this.bW = this.bU;
      this.bU = this.bU + (this.aC() ? -1.0F : 4.0F) * 0.3F;
      this.bU = aun.a(this.bU, 0.0F, 1.0F);
      if (!this.aC() && this.bY < 1.0F) {
         this.bY = 1.0F;
      }

      this.bY *= 0.9F;
      els $$0 = this.dp();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bT = this.bT + this.bY * 2.0F;
      if (!this.dM().B && this.bx() && !this.o_() && !this.w() && --this.bZ <= 0) {
         this.a(arr.ev, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         this.a(cna.qO);
         this.a(dnq.t);
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
   protected arq y() {
      return arr.et;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.ew;
   }

   @Override
   protected arq n_() {
      return arr.eu;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(arr.ex, 0.15F, 1.0F);
   }

   @Nullable
   public byc b(and $$0, blp $$1) {
      return bly.r.a((cto)$$0);
   }

   @Override
   public boolean m(cmx $$0) {
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
   protected void a(blu $$0, blu.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bmk) {
         ((bmk)$$0).aU = this.aU;
      }
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, -0.1F * $$2);
   }

   public boolean w() {
      return this.ca;
   }

   public void w(boolean $$0) {
      this.ca = $$0;
   }
}
