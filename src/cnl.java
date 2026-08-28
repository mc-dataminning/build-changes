import java.util.Collection;
import javax.annotation.Nullable;

public class cnl extends cnz {
   private static final akj<Integer> a = akn.a(cnl.class, akl.b);
   private static final akj<Boolean> b = akn.a(cnl.class, akl.k);
   private static final akj<Boolean> c = akn.a(cnl.class, akl.k);
   private int d;
   private int bF;
   private int bG = 30;
   private int bH = 3;
   private int bI;

   public cnl(bwm<? extends cnl> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(1, new cds(this));
      this.bC.a(2, new cff(this));
      this.bC.a(3, new cdf<>(this, cji.class, 6.0F, 1.0, 1.2));
      this.bC.a(3, new cdf<>(this, civ.class, 6.0F, 1.0, 1.2));
      this.bC.a(4, new cei(this, 1.0, false));
      this.bC.a(5, new cfl(this, 0.8));
      this.bC.a(6, new ceg(this, cqy.class, 8.0F));
      this.bC.a(6, new cet(this));
      this.bD.a(1, new cfr<>(this, cqy.class, true));
      this.bD.a(2, new cfq(this));
   }

   public static byh.a j() {
      return cnz.gt().a(byi.v, 0.25);
   }

   @Override
   public int cE() {
      return this.f() == null ? this.y(0.0F) : this.y(this.eF() - 1.0F);
   }

   @Override
   public boolean a(double $$0, float $$1, bus $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bF += (int)($$0 * 1.5);
      if (this.bF > this.bG - 5) {
         this.bF = this.bG - 5;
      }

      return $$3;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, -1);
      $$0.a(b, false);
      $$0.a(c, false);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (this.al.a(b)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bG);
      $$0.a("ExplosionRadius", (byte)this.bH);
      $$0.a("ignited", this.q());
   }

   @Override
   public void a(tz $$0) {
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
      if (this.bK()) {
         this.d = this.bF;
         if (this.q()) {
            this.b(1);
         }

         int $$0 = this.n();
         if ($$0 > 0 && this.bF == 0) {
            this.a(awn.gF, 1.0F, 0.5F);
            this.a(eez.I);
         }

         this.bF += $$0;
         if (this.bF < 0) {
            this.bF = 0;
         }

         if (this.bF >= this.bG) {
            this.bF = this.bG;
            this.gr();
         }
      }

      super.h();
   }

   @Override
   public void g(@Nullable bxc $$0) {
      if (!($$0 instanceof ckz)) {
         super.g($$0);
      }
   }

   @Override
   protected awm e(bus $$0) {
      return awn.gE;
   }

   @Override
   protected awm l_() {
      return awn.gD;
   }

   @Override
   protected void a(arq $$0, bus $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bwd $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof cnl $$4 && $$4.x()) {
         $$4.gq();
         this.a($$0, czc.vu);
      }
   }

   @Override
   public boolean c(arq $$0, bwd $$1) {
      return true;
   }

   public boolean m() {
      return this.al.a(b);
   }

   public float J(float $$0) {
      return azm.h($$0, (float)this.d, (float)this.bF) / (float)(this.bG - 2);
   }

   public int n() {
      return this.al.a(a);
   }

   public void b(int $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(arq $$0, bxb $$1) {
      super.a($$0, $$1);
      this.al.a(b, true);
   }

   @Override
   protected bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      if ($$2.a(axk.bv)) {
         awm $$3 = $$2.a(czc.vb) ? awn.jl : awn.jA;
         this.dV().a($$0, this.dA(), this.dC(), this.dG(), $$3, this.dm(), 1.0F, this.ae.i() * 0.4F + 0.8F);
         if (!this.dV().C) {
            this.t();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bub.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gr() {
      if (this.dV() instanceof arq $$0) {
         float $$1 = this.m() ? 2.0F : 1.0F;
         this.bc = true;
         $$0.a(this, this.dA(), this.dC(), this.dG(), (float)this.bH * $$1, div.a.c);
         this.gu();
         this.a($$0, bwd.e.a);
         this.at();
      }
   }

   private void gu() {
      Collection<bvh> $$0 = this.eC();
      if (!$$0.isEmpty()) {
         bvv $$1 = new bvv(this.dV(), this.dA(), this.dC(), this.dG());
         $$1.a(2.5F);
         $$1.c(-0.5F);
         $$1.c(10);
         $$1.a($$1.i() / 2);
         $$1.b(0.25F);
         $$1.d(-$$1.e() / (float)$$1.i());

         for (bvh $$2 : $$0) {
            $$1.a(new bvh($$2));
         }

         this.dV().b($$1);
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

   public void gq() {
      this.bI++;
   }
}
