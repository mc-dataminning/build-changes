import java.util.Collection;
import javax.annotation.Nullable;

public class cnp extends cod {
   private static final akj<Integer> a = akn.a(cnp.class, akl.b);
   private static final akj<Boolean> b = akn.a(cnp.class, akl.k);
   private static final akj<Boolean> c = akn.a(cnp.class, akl.k);
   private int d;
   private int bG;
   private int bH = 30;
   private int bI = 3;
   private int bJ;

   public cnp(bwo<? extends cnp> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bD.a(1, new cdu(this));
      this.bD.a(2, new cfh(this));
      this.bD.a(3, new cdh<>(this, cjm.class, 6.0F, 1.0, 1.2));
      this.bD.a(3, new cdh<>(this, cix.class, 6.0F, 1.0, 1.2));
      this.bD.a(4, new cek(this, 1.0, false));
      this.bD.a(5, new cfn(this, 0.8));
      this.bD.a(6, new cei(this, crc.class, 8.0F));
      this.bD.a(6, new cev(this));
      this.bE.a(1, new cft<>(this, crc.class, true));
      this.bE.a(2, new cfs(this));
   }

   public static byj.a j() {
      return cod.gu().a(byk.v, 0.25);
   }

   @Override
   public int cE() {
      return this.f() == null ? this.y(0.0F) : this.y(this.eG() - 1.0F);
   }

   @Override
   public boolean a(double $$0, float $$1, buu $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bG += (int)($$0 * 1.5);
      if (this.bG > this.bH - 5) {
         this.bG = this.bH - 5;
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

      $$0.a("Fuse", (short)this.bH);
      $$0.a("ExplosionRadius", (byte)this.bI);
      $$0.a("ignited", this.q());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.al.a(b, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bH = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.bI = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.t();
      }
   }

   @Override
   public void h() {
      if (this.bK()) {
         this.d = this.bG;
         if (this.q()) {
            this.b(1);
         }

         int $$0 = this.n();
         if ($$0 > 0 && this.bG == 0) {
            this.a(awn.gH, 1.0F, 0.5F);
            this.a(efh.I);
         }

         this.bG += $$0;
         if (this.bG < 0) {
            this.bG = 0;
         }

         if (this.bG >= this.bH) {
            this.bG = this.bH;
            this.gs();
         }
      }

      super.h();
   }

   @Override
   public void g(@Nullable bxe $$0) {
      if (!($$0 instanceof cld)) {
         super.g($$0);
      }
   }

   @Override
   protected awm e(buu $$0) {
      return awn.gG;
   }

   @Override
   protected awm l_() {
      return awn.gF;
   }

   @Override
   protected void a(arq $$0, buu $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bwf $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof cnp $$4 && $$4.x()) {
         $$4.gr();
         this.a($$0, czh.vz);
      }
   }

   @Override
   public boolean c(arq $$0, bwf $$1) {
      return true;
   }

   public boolean m() {
      return this.al.a(b);
   }

   public float J(float $$0) {
      return azm.h($$0, (float)this.d, (float)this.bG) / (float)(this.bH - 2);
   }

   public int n() {
      return this.al.a(a);
   }

   public void b(int $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(arq $$0, bxd $$1) {
      super.a($$0, $$1);
      this.al.a(b, true);
   }

   @Override
   protected bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if ($$2.a(axk.bw)) {
         awm $$3 = $$2.a(czh.vg) ? awn.jn : awn.jD;
         this.dV().a($$0, this.dA(), this.dC(), this.dG(), $$3, this.dm(), 1.0F, this.ae.i() * 0.4F + 0.8F);
         if (!this.dV().C) {
            this.t();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bud.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gs() {
      if (this.dV() instanceof arq $$0) {
         float $$1 = this.m() ? 2.0F : 1.0F;
         this.bc = true;
         $$0.a(this, this.dA(), this.dC(), this.dG(), (float)this.bI * $$1, dja.a.c);
         this.gv();
         this.a($$0, bwf.e.a);
         this.at();
      }
   }

   private void gv() {
      Collection<bvj> $$0 = this.eD();
      if (!$$0.isEmpty()) {
         bvx $$1 = new bvx(this.dV(), this.dA(), this.dC(), this.dG());
         $$1.a(2.5F);
         $$1.c(-0.5F);
         $$1.c(10);
         $$1.a($$1.i() / 2);
         $$1.b(0.25F);
         $$1.d(-$$1.e() / (float)$$1.i());

         for (bvj $$2 : $$0) {
            $$1.a(new bvj($$2));
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
      return this.m() && this.bJ < 1;
   }

   public void gr() {
      this.bJ++;
   }
}
