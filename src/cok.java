import java.util.Collection;
import javax.annotation.Nullable;

public class cok extends coz {
   private static final akl<Integer> a = akp.a(cok.class, akn.b);
   private static final akl<Boolean> b = akp.a(cok.class, akn.k);
   private static final akl<Boolean> c = akp.a(cok.class, akn.k);
   private static final boolean d = false;
   private static final boolean e = false;
   private static final short f = 30;
   private static final byte bI = 3;
   private int bJ;
   private int bK;
   private int bL = 30;
   private int bM = 3;
   private int bN;

   public cok(bxc<? extends cok> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cek(this));
      this.bF.a(2, new cfx(this));
      this.bF.a(3, new cdx<>(this, ckc.class, 6.0F, 1.0, 1.2));
      this.bF.a(3, new cdx<>(this, cjn.class, 6.0F, 1.0, 1.2));
      this.bF.a(4, new cfa(this, 1.0, false));
      this.bF.a(5, new cgd(this, 0.8));
      this.bF.a(6, new cey(this, crx.class, 8.0F));
      this.bF.a(6, new cfl(this));
      this.bG.a(1, new cgj<>(this, crx.class, true));
      this.bG.a(2, new cgi(this));
   }

   public static byz.a j() {
      return coz.gx().a(bza.v, 0.25);
   }

   @Override
   public int cE() {
      return this.f() == null ? this.y(0.0F) : this.y(this.eG() - 1.0F);
   }

   @Override
   public boolean a(double $$0, float $$1, bvi $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bK += (int)($$0 * 1.5);
      if (this.bK > this.bL - 5) {
         this.bK = this.bL - 5;
      }

      return $$3;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(a, -1);
      $$0.a(b, false);
      $$0.a(c, false);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("powered", this.m());
      $$0.a("Fuse", (short)this.bL);
      $$0.a("ExplosionRadius", (byte)this.bM);
      $$0.a("ignited", this.q());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.al.a(b, $$0.b("powered", false));
      this.bL = $$0.b("Fuse", (short)30);
      this.bM = $$0.b("ExplosionRadius", (byte)3);
      if ($$0.b("ignited", false)) {
         this.t();
      }
   }

   @Override
   public void h() {
      if (this.bJ()) {
         this.bJ = this.bK;
         if (this.q()) {
            this.b(1);
         }

         int $$0 = this.n();
         if ($$0 > 0 && this.bK == 0) {
            this.a(awp.gH, 1.0F, 0.5F);
            this.a(ege.I);
         }

         this.bK += $$0;
         if (this.bK < 0) {
            this.bK = 0;
         }

         if (this.bK >= this.bL) {
            this.bK = this.bL;
            this.gv();
         }
      }

      super.h();
   }

   @Override
   public void g(@Nullable bxu $$0) {
      if (!($$0 instanceof clp)) {
         super.g($$0);
      }
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.gG;
   }

   @Override
   protected awo l_() {
      return awp.gF;
   }

   @Override
   protected void a(ars $$0, bvi $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bwt $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof cok $$4 && $$4.x()) {
         $$4.gu();
         this.a($$0, dac.vz);
      }
   }

   @Override
   public boolean c(ars $$0, bwt $$1) {
      return true;
   }

   public boolean m() {
      return this.al.a(b);
   }

   public float J(float $$0) {
      return azo.h($$0, (float)this.bJ, (float)this.bK) / (float)(this.bL - 2);
   }

   public int n() {
      return this.al.a(a);
   }

   public void b(int $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(ars $$0, bxt $$1) {
      super.a($$0, $$1);
      this.al.a(b, true);
   }

   @Override
   protected bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if ($$2.a(axm.bw)) {
         awo $$3 = $$2.a(dac.vg) ? awp.jn : awp.jD;
         this.dV().a($$0, this.dA(), this.dC(), this.dG(), $$3, this.dm(), 1.0F, this.ae.i() * 0.4F + 0.8F);
         if (!this.dV().C) {
            this.t();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bur.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gv() {
      if (this.dV() instanceof ars $$0) {
         float $$1 = this.m() ? 2.0F : 1.0F;
         this.bc = true;
         $$0.a(this, this.dA(), this.dC(), this.dG(), (float)this.bM * $$1, djx.a.c);
         this.gy();
         this.a($$0, bwt.d.a);
         this.aq();
      }
   }

   private void gy() {
      Collection<bvx> $$0 = this.eD();
      if (!$$0.isEmpty()) {
         bwl $$1 = new bwl(this.dV(), this.dA(), this.dC(), this.dG());
         $$1.a(2.5F);
         $$1.c(-0.5F);
         $$1.c(10);
         $$1.a(300);
         $$1.b(0.25F);
         $$1.d(-$$1.e() / (float)$$1.i());

         for (bvx $$2 : $$0) {
            $$1.a(new bvx($$2));
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
      return this.m() && this.bN < 1;
   }

   public void gu() {
      this.bN++;
   }
}
