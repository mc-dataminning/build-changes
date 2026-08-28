import java.util.Collection;
import javax.annotation.Nullable;

public class cme extends cms {
   private static final ajx<Integer> a = akb.a(cme.class, ajz.b);
   private static final ajx<Boolean> b = akb.a(cme.class, ajz.k);
   private static final ajx<Boolean> c = akb.a(cme.class, ajz.k);
   private int d;
   private int bF;
   private int bG = 30;
   private int bH = 3;
   private int bI;

   public cme(bvi<? extends cme> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(1, new ccq(this));
      this.bC.a(2, new ced(this));
      this.bC.a(3, new ccd<>(this, cid.class, 6.0F, 1.0, 1.2));
      this.bC.a(3, new ccd<>(this, chs.class, 6.0F, 1.0, 1.2));
      this.bC.a(4, new cdg(this, 1.0, false));
      this.bC.a(5, new cej(this, 0.8));
      this.bC.a(6, new cde(this, cpr.class, 8.0F));
      this.bC.a(6, new cdr(this));
      this.bD.a(1, new cep<>(this, cpr.class, true));
      this.bD.a(2, new ceo(this));
   }

   public static bxf.a j() {
      return cms.gv().a(bxg.v, 0.25);
   }

   @Override
   public int cD() {
      return this.f() == null ? this.y(0.0F) : this.y(this.eE() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, btp $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bF += (int)($$0 * 1.5F);
      if (this.bF > this.bG - 5) {
         this.bF = this.bG - 5;
      }

      return $$3;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, -1);
      $$0.a(b, false);
      $$0.a(c, false);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.al.a(b)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bG);
      $$0.a("ExplosionRadius", (byte)this.bH);
      $$0.a("ignited", this.q());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.al.a(b, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bG = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.bH = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.t();
      }
   }

   @Override
   public void h() {
      if (this.bJ()) {
         this.d = this.bF;
         if (this.q()) {
            this.b(1);
         }

         int $$0 = this.n();
         if ($$0 > 0 && this.bF == 0) {
            this.a(awa.gF, 1.0F, 0.5F);
            this.a(ecp.I);
         }

         this.bF += $$0;
         if (this.bF < 0) {
            this.bF = 0;
         }

         if (this.bF >= this.bG) {
            this.bF = this.bG;
            this.gt();
         }
      }

      super.h();
   }

   @Override
   public void h(@Nullable bvy $$0) {
      if (!($$0 instanceof cjs)) {
         super.h($$0);
      }
   }

   @Override
   protected avz e(btp $$0) {
      return awa.gE;
   }

   @Override
   protected avz l_() {
      return awa.gD;
   }

   @Override
   protected void a(ard $$0, btp $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bva $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof cme $$4 && $$4.x()) {
         $$4.gs();
         this.a($$0, cxl.vq);
      }
   }

   @Override
   public boolean c(ard $$0, bva $$1) {
      return true;
   }

   public boolean m() {
      return this.al.a(b);
   }

   public float K(float $$0) {
      return ayz.h($$0, (float)this.d, (float)this.bF) / (float)(this.bG - 2);
   }

   public int n() {
      return this.al.a(a);
   }

   public void b(int $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(ard $$0, bvx $$1) {
      super.a($$0, $$1);
      this.al.a(b, true);
   }

   @Override
   protected bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if ($$2.a(awy.bv)) {
         avz $$3 = $$2.a(cxl.uX) ? awa.jk : awa.jz;
         this.dU().a($$0, this.dz(), this.dB(), this.dF(), $$3, this.dl(), 1.0F, this.ae.i() * 0.4F + 0.8F);
         if (!this.dU().C) {
            this.t();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bsy.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gt() {
      if (this.dU() instanceof ard $$0) {
         float $$1 = this.m() ? 2.0F : 1.0F;
         this.bc = true;
         $$0.a(this, this.dz(), this.dB(), this.dF(), (float)this.bH * $$1, dgz.a.c);
         this.gw();
         this.a($$0, bva.d.a);
         this.at();
      }
   }

   private void gw() {
      Collection<bue> $$0 = this.eB();
      if (!$$0.isEmpty()) {
         bus $$1 = new bus(this.dU(), this.dz(), this.dB(), this.dF());
         $$1.a(2.5F);
         $$1.c(-0.5F);
         $$1.c(10);
         $$1.a($$1.i() / 2);
         $$1.b(0.25F);
         $$1.d(-$$1.e() / (float)$$1.i());

         for (bue $$2 : $$0) {
            $$1.a(new bue($$2));
         }

         this.dU().b($$1);
      }
   }

   public boolean q() {
      return this.al.a(c);
   }

   public void t() {
      this.al.a(c, true);
   }

   public boolean x() {
      return this.m() && this.bI < 1;
   }

   public void gs() {
      this.bI++;
   }
}
