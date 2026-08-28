import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cke extends bya implements bxj {
   private static final akj<Boolean> bM = akn.a(cke.class, akl.k);
   private static final akj<Integer> bN = akn.a(cke.class, akl.b);
   private static final akj<Integer> bO = akn.a(cke.class, akl.b);
   private static final akj<je<ckf>> bP = akn.a(cke.class, akl.A);
   public static final cht.a bK = ($$0, $$1) -> {
      bwo<?> $$2 = $$0.aq();
      return $$2 == bwo.bb || $$2 == bwo.aY || $$2 == bwo.aa;
   };
   private static final float bQ = 8.0F;
   private static final float bR = 40.0F;
   private static final float bS = 0.125F;
   public static final float bL = (float) (Math.PI / 5);
   private float bT;
   private float bU;
   private boolean bV;
   private boolean bW;
   private float bX;
   private float bY;
   private static final bto bZ = baq.a(20, 39);
   @Nullable
   private UUID ca;

   public cke(bwo<? extends cke> $$0, dja $$1) {
      super($$0, $$1);
      this.a(false, false);
      this.a(exf.f, -1.0F);
      this.a(exf.g, -1.0F);
   }

   @Override
   protected void D() {
      this.bD.a(1, new cdu(this));
      this.bD.a(1, new bya.a(1.5, axd.G));
      this.bD.a(2, new cff(this));
      this.bD.a(3, new cke.a<>(this, clk.class, 24.0F, 1.5, 1.5));
      this.bD.a(4, new ceg(this, 0.4F));
      this.bD.a(5, new cek(this, 1.0, true));
      this.bD.a(6, new cdy(this, 1.0, 10.0F, 2.0F));
      this.bD.a(7, new cdm(this, 1.0));
      this.bD.a(8, new cfn(this, 1.0));
      this.bD.a(9, new cdi(this, 8.0F));
      this.bD.a(10, new cei(this, crc.class, 8.0F));
      this.bD.a(10, new cev(this));
      this.bE.a(1, new cfx(this));
      this.bE.a(2, new cfy(this));
      this.bE.a(3, new cfs(this).a());
      this.bE.a(4, new cft<>(this, crc.class, 10, true, false, this::a));
      this.bE.a(5, new cfw<>(this, ciu.class, false, bK));
      this.bE.a(6, new cfw<>(this, ckc.class, false, ckc.bG));
      this.bE.a(7, new cft<>(this, cnl.class, false));
      this.bE.a(8, new cfz<>(this, true));
   }

   public alg gD() {
      ckf $$0 = this.gI().a();
      if (this.q()) {
         return $$0.b().b().b();
      } else {
         return this.X_() ? $$0.b().c().b() : $$0.b().a().b();
      }
   }

   private je<ckf> gI() {
      return this.al.a(bP);
   }

   private void j(je<ckf> $$0) {
      this.al.a(bP, $$0);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      if ($$0 == kj.aw) {
         return c((ki<T>)$$0, this.gI());
      } else {
         return $$0 == kj.ax ? c((ki<T>)$$0, this.gG()) : super.a($$0);
      }
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aw);
      this.a($$0, kj.ax);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aw) {
         this.j(c(kj.aw, $$1));
         return true;
      } else if ($$0 == kj.ax) {
         this.a(c(kj.ax, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public static byj.a gE() {
      return ciu.gw().a(byk.v, 0.3F).a(byk.s, 8.0).a(byk.c, 4.0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bP, ctl.a(this.dX(), ckg.j));
      $$0.a(bM, false);
      $$0.a(bN, cyb.o.a());
      $$0.a(bO, 0);
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.DX, 0.15F, 1.0F);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gG().a());
      ctl.a($$0, this.gI());
      this.a_($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ctl.a($$0, this.dX(), mg.bm).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cyb.a($$0.h("CollarColor")));
      }

      this.a(this.dV(), $$0);
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      if ($$3 instanceof cke.b $$4) {
         this.j($$4.a);
      } else {
         Optional<? extends je<ckf>> $$5 = ckg.a(this.ae, this.dX(), cti.a($$0, this.dv()));
         if ($$5.isPresent()) {
            this.j((je<ckf>)$$5.get());
            $$3 = new cke.b((je<ckf>)$$5.get());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected awm u() {
      if (this.X_()) {
         return awn.DS;
      } else if (this.ae.a(3) == 0) {
         return this.q() && this.eG() < 20.0F ? awn.DY : awn.DV;
      } else {
         return awn.DQ;
      }
   }

   @Override
   protected awm e(buu $$0) {
      return this.i($$0) ? awn.DO : awn.DU;
   }

   @Override
   protected awm l_() {
      return awn.DR;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C && this.bV && !this.bW && !this.gn() && this.aJ()) {
         this.bW = true;
         this.bX = 0.0F;
         this.bY = 0.0F;
         this.dV().a(this, (byte)8);
      }

      if (!this.dV().C) {
         this.a((arq)this.dV(), true);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.bK()) {
         this.bU = this.bT;
         if (this.gH()) {
            this.bT = this.bT + (1.0F - this.bT) * 0.4F;
         } else {
            this.bT = this.bT + (0.0F - this.bT) * 0.4F;
         }

         if (this.bl()) {
            this.bV = true;
            if (this.bW && !this.dV().C) {
               this.dV().a(this, (byte)56);
               this.gJ();
            }
         } else if ((this.bV || this.bW) && this.bW) {
            if (this.bX == 0.0F) {
               this.a(awn.DW, this.fe(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
               this.a(efh.u);
            }

            this.bY = this.bX;
            this.bX += 0.05F;
            if (this.bY >= 2.0F) {
               this.bV = false;
               this.bW = false;
               this.bY = 0.0F;
               this.bX = 0.0F;
            }

            if (this.bX > 0.4F) {
               float $$0 = (float)this.dC();
               int $$1 = (int)(azm.a((this.bX - 0.4F) * (float) Math.PI) * 7.0F);
               feq $$2 = this.dy();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ae.i() * 2.0F - 1.0F) * this.dq() * 0.5F;
                  float $$5 = (this.ae.i() * 2.0F - 1.0F) * this.dq() * 0.5F;
                  this.dV().a(lx.ap, this.dA() + (double)$$4, (double)($$0 + 0.8F), this.dG() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gJ() {
      this.bW = false;
      this.bX = 0.0F;
      this.bY = 0.0F;
   }

   @Override
   public void a(buu $$0) {
      this.bV = false;
      this.bW = false;
      this.bY = 0.0F;
      this.bX = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.bV ? 1.0F : Math.min(0.75F + azm.h($$0, this.bY, this.bX) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return azm.h($$0, this.bY, this.bX);
   }

   public float L(float $$0) {
      return azm.h($$0, this.bU, this.bT) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ac() {
      return this.x() ? 20 : super.ac();
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.y(false);
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(arq $$0, buu $$1, float $$2) {
      if (!this.i($$1)) {
         super.c($$0, $$1, $$2);
      } else {
         czd $$3 = this.aj();
         int $$4 = $$3.o();
         int $$5 = $$3.p();
         $$3.a(azm.f($$2), this, bwp.g);
         if (bwb.b.a($$4, $$5) != bwb.b.a(this.aj())) {
            this.a(awn.DN);
            $$0.a(new lt(lx.U, czh.pe.m()), this.dA(), this.dC() + 1.0, this.dG(), 20, 0.2, 0.1, 0.2, 0.1);
         }
      }
   }

   private boolean i(buu $$0) {
      return this.aj().a(czh.pf) && !$$0.a(axd.C);
   }

   @Override
   protected void t() {
      if (this.q()) {
         this.g(byk.s).a(40.0);
         this.d(40.0F);
      } else {
         this.g(byk.s).a(8.0);
      }
   }

   @Override
   protected void c(buu $$0, float $$1) {
      this.a($$0, $$1, new bwp[]{bwp.g});
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      cyz $$3 = $$2.h();
      if (this.q()) {
         if (this.i($$2) && this.eG() < this.eU()) {
            this.a($$0, $$1, $$2);
            cus $$4 = $$2.a(kj.v);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return bud.a;
         } else {
            if ($$3 instanceof cyc $$6 && this.j($$0)) {
               cyb $$7 = $$6.a();
               if ($$7 != this.gG()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return bud.a;
               }

               return super.b($$0, $$1);
            }

            if (this.a($$2, bwp.g) && !this.fX() && this.j($$0) && !this.n_()) {
               this.h($$2.c(1));
               $$2.a(1, $$0);
               return bud.a;
            } else if ($$2.a(czh.td) && this.j($$0) && this.fX() && (!dfs.a(this.aj(), dfr.E) || $$0.b())) {
               $$2.a(1, $$0, d($$1));
               this.a(awn.az);
               czd $$8 = this.aj();
               this.h(czd.k);
               if (this.dV() instanceof arq $$9) {
                  this.a($$9, $$8);
               }

               return bud.a;
            } else if (this.x() && this.fX() && this.j($$0) && this.aj().n() && this.aj().c($$2)) {
               $$2.h(1);
               this.a(awn.DP);
               czd $$10 = this.aj();
               int $$11 = (int)((float)$$10.p() * 0.125F);
               $$10.b(Math.max(0, $$10.o() - $$11));
               return bud.a;
            } else {
               bud $$12 = super.b($$0, $$1);
               if (!$$12.a() && this.j($$0)) {
                  this.y(!this.gr());
                  this.bf = false;
                  this.bC.m();
                  this.g(null);
                  return bud.a.b();
               } else {
                  return $$12;
               }
            }
         }
      } else if (!this.dV().C && $$2.a(czh.sH) && !this.X_()) {
         $$2.a(1, $$0);
         this.f($$0);
         return bud.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void f(crc $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.bC.m();
         this.g(null);
         this.y(true);
         this.dV().a(this, (byte)7);
      } else {
         this.dV().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.bW = true;
         this.bX = 0.0F;
         this.bY = 0.0F;
      } else if ($$0 == 56) {
         this.gJ();
      } else {
         super.b($$0);
      }
   }

   public float gF() {
      if (this.X_()) {
         return 1.5393804F;
      } else if (this.q()) {
         float $$0 = this.eU();
         float $$1 = ($$0 - this.eG()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.ah);
   }

   @Override
   public int ai() {
      return 8;
   }

   @Override
   public int a() {
      return this.al.a(bO);
   }

   @Override
   public void a(int $$0) {
      this.al.a(bO, $$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ae));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ca;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ca = $$0;
   }

   public cyb gG() {
      return cyb.a(this.al.a(bN));
   }

   private void a(cyb $$0) {
      this.al.a(bN, $$0.a());
   }

   @Nullable
   public cke b(arq $$0, bvv $$1) {
      cke $$2 = bwo.bM.a($$0, bwn.e);
      if ($$2 != null && $$1 instanceof cke $$3) {
         if (this.ae.h()) {
            $$2.j(this.gI());
         } else {
            $$2.j($$3.gI());
         }

         if (this.q()) {
            $$2.a(this.d());
            $$2.a(true, true);
            cyb $$4 = this.gG();
            cyb $$5 = $$3.gG();
            $$2.a(cyb.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   public void z(boolean $$0) {
      this.al.a(bM, $$0);
   }

   @Override
   public boolean a(ciu $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.q()) {
         return false;
      } else if (!($$0 instanceof cke $$1)) {
         return false;
      } else if (!$$1.q()) {
         return false;
      } else {
         return $$1.x() ? false : this.gB() && $$1.gB();
      }
   }

   public boolean gH() {
      return this.al.a(bM);
   }

   @Override
   public boolean a(bxe $$0, bxe $$1) {
      if ($$0 instanceof cnp || $$0 instanceof cnx || $$0 instanceof cmw) {
         return false;
      } else if ($$0 instanceof cke $$2) {
         return !$$2.q() || $$2.e() != $$1;
      } else {
         if ($$0 instanceof crc $$3 && $$1 instanceof crc $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof clh $$5 && $$5.gI()) {
            return false;
         }

         if ($$0 instanceof bya $$6 && $$6.q()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean w() {
      return !this.X_();
   }

   @Override
   public feq cT() {
      return new feq(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   public static boolean c(bwo<cke> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.cj) && a($$1, $$3);
   }

   class a<T extends bxe> extends cdh<T> {
      private final cke j;

      public a(final cke $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof clk ? !this.j.q() && this.a((clk)this.b) : false;
      }

      private boolean a(clk $$0) {
         return $$0.gv() >= cke.this.ae.a(5);
      }

      @Override
      public void d() {
         cke.this.g(null);
         super.d();
      }

      @Override
      public void a() {
         cke.this.g(null);
         super.a();
      }
   }

   public static class b extends bvv.a {
      public final je<ckf> a;

      public b(je<ckf> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
