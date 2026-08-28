import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cka extends bxy implements bxh {
   private static final akj<Boolean> bL = akn.a(cka.class, akl.k);
   private static final akj<Integer> bM = akn.a(cka.class, akl.b);
   private static final akj<Integer> bN = akn.a(cka.class, akl.b);
   private static final akj<je<ckb>> bO = akn.a(cka.class, akl.z);
   public static final chr.a bJ = ($$0, $$1) -> {
      bwm<?> $$2 = $$0.aq();
      return $$2 == bwm.bb || $$2 == bwm.aY || $$2 == bwm.aa;
   };
   private static final float bP = 8.0F;
   private static final float bQ = 40.0F;
   private static final float bR = 0.125F;
   public static final float bK = (float) (Math.PI / 5);
   private float bS;
   private float bT;
   private boolean bU;
   private boolean bV;
   private float bW;
   private float bX;
   private static final btm bY = baq.a(20, 39);
   @Nullable
   private UUID bZ;

   public cka(bwm<? extends cka> $$0, div $$1) {
      super($$0, $$1);
      this.a(false, false);
      this.a(ewx.f, -1.0F);
      this.a(ewx.g, -1.0F);
   }

   @Override
   protected void D() {
      this.bC.a(1, new cds(this));
      this.bC.a(1, new bxy.a(1.5, axd.G));
      this.bC.a(2, new cfd(this));
      this.bC.a(3, new cka.a<>(this, clg.class, 24.0F, 1.5, 1.5));
      this.bC.a(4, new cee(this, 0.4F));
      this.bC.a(5, new cei(this, 1.0, true));
      this.bC.a(6, new cdw(this, 1.0, 10.0F, 2.0F));
      this.bC.a(7, new cdk(this, 1.0));
      this.bC.a(8, new cfl(this, 1.0));
      this.bC.a(9, new cdg(this, 8.0F));
      this.bC.a(10, new ceg(this, cqy.class, 8.0F));
      this.bC.a(10, new cet(this));
      this.bD.a(1, new cfv(this));
      this.bD.a(2, new cfw(this));
      this.bD.a(3, new cfq(this).a());
      this.bD.a(4, new cfr<>(this, cqy.class, 10, true, false, this::a));
      this.bD.a(5, new cfu<>(this, cis.class, false, bJ));
      this.bD.a(6, new cfu<>(this, cjy.class, false, cjy.bF));
      this.bD.a(7, new cfr<>(this, cnh.class, false));
      this.bD.a(8, new cfx<>(this, true));
   }

   public alg gC() {
      ckb $$0 = this.gH().a();
      if (this.q()) {
         return $$0.b().b().b();
      } else {
         return this.W_() ? $$0.b().c().b() : $$0.b().a().b();
      }
   }

   private je<ckb> gH() {
      return this.al.a(bO);
   }

   private void j(je<ckb> $$0) {
      this.al.a(bO, $$0);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      if ($$0 == kj.aw) {
         return c((ki<T>)$$0, this.gH());
      } else {
         return $$0 == kj.ax ? c((ki<T>)$$0, this.gF()) : super.a($$0);
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

   public static byh.a gD() {
      return cis.gv().a(byi.v, 0.3F).a(byi.s, 8.0).a(byi.c, 4.0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bO, ctg.a(this.dX(), ckc.j));
      $$0.a(bL, false);
      $$0.a(bM, cxw.o.a());
      $$0.a(bN, 0);
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.DU, 0.15F, 1.0F);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gF().a());
      ctg.a($$0, this.gH());
      this.a_($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ctg.a($$0, this.dX(), mg.bl).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cxw.a($$0.h("CollarColor")));
      }

      this.a(this.dV(), $$0);
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      if ($$3 instanceof cka.b $$4) {
         this.j($$4.a);
      } else {
         Optional<? extends je<ckb>> $$5 = ckc.a(this.ae, this.dX(), ctd.a($$0, this.dv()));
         if ($$5.isPresent()) {
            this.j((je<ckb>)$$5.get());
            $$3 = new cka.b((je<ckb>)$$5.get());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected awm u() {
      if (this.W_()) {
         return awn.DP;
      } else if (this.ae.a(3) == 0) {
         return this.q() && this.eF() < 20.0F ? awn.DV : awn.DS;
      } else {
         return awn.DN;
      }
   }

   @Override
   protected awm e(bus $$0) {
      return this.i($$0) ? awn.DL : awn.DR;
   }

   @Override
   protected awm l_() {
      return awn.DO;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C && this.bU && !this.bV && !this.gm() && this.aJ()) {
         this.bV = true;
         this.bW = 0.0F;
         this.bX = 0.0F;
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
         this.bT = this.bS;
         if (this.gG()) {
            this.bS = this.bS + (1.0F - this.bS) * 0.4F;
         } else {
            this.bS = this.bS + (0.0F - this.bS) * 0.4F;
         }

         if (this.bl()) {
            this.bU = true;
            if (this.bV && !this.dV().C) {
               this.dV().a(this, (byte)56);
               this.gI();
            }
         } else if ((this.bU || this.bV) && this.bV) {
            if (this.bW == 0.0F) {
               this.a(awn.DT, this.fd(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
               this.a(eez.u);
            }

            this.bX = this.bW;
            this.bW += 0.05F;
            if (this.bX >= 2.0F) {
               this.bU = false;
               this.bV = false;
               this.bX = 0.0F;
               this.bW = 0.0F;
            }

            if (this.bW > 0.4F) {
               float $$0 = (float)this.dC();
               int $$1 = (int)(azm.a((this.bW - 0.4F) * (float) Math.PI) * 7.0F);
               fei $$2 = this.dy();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ae.i() * 2.0F - 1.0F) * this.dq() * 0.5F;
                  float $$5 = (this.ae.i() * 2.0F - 1.0F) * this.dq() * 0.5F;
                  this.dV().a(lx.ap, this.dA() + (double)$$4, (double)($$0 + 0.8F), this.dG() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gI() {
      this.bV = false;
      this.bW = 0.0F;
      this.bX = 0.0F;
   }

   @Override
   public void a(bus $$0) {
      this.bU = false;
      this.bV = false;
      this.bX = 0.0F;
      this.bW = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.bU ? 1.0F : Math.min(0.75F + azm.h($$0, this.bX, this.bW) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return azm.h($$0, this.bX, this.bW);
   }

   public float L(float $$0) {
      return azm.h($$0, this.bT, this.bS) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ac() {
      return this.x() ? 20 : super.ac();
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.y(false);
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(arq $$0, bus $$1, float $$2) {
      if (!this.i($$1)) {
         super.c($$0, $$1, $$2);
      } else {
         cyy $$3 = this.aj();
         int $$4 = $$3.o();
         int $$5 = $$3.p();
         $$3.a(azm.f($$2), this, bwn.g);
         if (bvz.b.a($$4, $$5) != bvz.b.a(this.aj())) {
            this.a(awn.DK);
            $$0.a(new lt(lx.U, czc.pb.m()), this.dA(), this.dC() + 1.0, this.dG(), 20, 0.2, 0.1, 0.2, 0.1);
         }
      }
   }

   private boolean i(bus $$0) {
      return this.aj().a(czc.pc) && !$$0.a(axd.C);
   }

   @Override
   protected void t() {
      if (this.q()) {
         this.g(byi.s).a(40.0);
         this.d(40.0F);
      } else {
         this.g(byi.s).a(8.0);
      }
   }

   @Override
   protected void c(bus $$0, float $$1) {
      this.a($$0, $$1, new bwn[]{bwn.g});
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      cyu $$3 = $$2.h();
      if (this.q()) {
         if (this.j($$2) && this.eF() < this.eT()) {
            this.a($$0, $$1, $$2);
            cun $$4 = $$2.a(kj.v);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return bub.a;
         } else {
            if ($$3 instanceof cxx $$6 && this.j($$0)) {
               cxw $$7 = $$6.a();
               if ($$7 != this.gF()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return bub.a;
               }

               return super.b($$0, $$1);
            }

            if (this.a($$2, bwn.g) && !this.fW() && this.j($$0) && !this.n_()) {
               this.i($$2.c(1));
               $$2.a(1, $$0);
               return bub.a;
            } else if ($$2.a(czc.sY) && this.j($$0) && this.fW() && (!dfn.a(this.aj(), dfm.E) || $$0.b())) {
               $$2.a(1, $$0, d($$1));
               this.a(awn.az);
               cyy $$8 = this.aj();
               this.i(cyy.k);
               if (this.dV() instanceof arq $$9) {
                  this.a($$9, $$8);
               }

               return bub.a;
            } else if (this.x() && this.fW() && this.j($$0) && this.aj().n() && this.aj().c($$2)) {
               $$2.h(1);
               this.a(awn.DM);
               cyy $$10 = this.aj();
               int $$11 = (int)((float)$$10.p() * 0.125F);
               $$10.b(Math.max(0, $$10.o() - $$11));
               return bub.a;
            } else {
               bub $$12 = super.b($$0, $$1);
               if (!$$12.a() && this.j($$0)) {
                  this.y(!this.gq());
                  this.bf = false;
                  this.bB.m();
                  this.g(null);
                  return bub.a.b();
               } else {
                  return $$12;
               }
            }
         }
      } else if (!this.dV().C && $$2.a(czc.sC) && !this.W_()) {
         $$2.a(1, $$0);
         this.f($$0);
         return bub.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void f(cqy $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.bB.m();
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
         this.bV = true;
         this.bW = 0.0F;
         this.bX = 0.0F;
      } else if ($$0 == 56) {
         this.gI();
      } else {
         super.b($$0);
      }
   }

   public float gE() {
      if (this.W_()) {
         return 1.5393804F;
      } else if (this.q()) {
         float $$0 = this.eT();
         float $$1 = ($$0 - this.eF()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean j(cyy $$0) {
      return $$0.a(axk.ag);
   }

   @Override
   public int ai() {
      return 8;
   }

   @Override
   public int a() {
      return this.al.a(bN);
   }

   @Override
   public void a(int $$0) {
      this.al.a(bN, $$0);
   }

   @Override
   public void c() {
      this.a(bY.a(this.ae));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bZ;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bZ = $$0;
   }

   public cxw gF() {
      return cxw.a(this.al.a(bM));
   }

   private void a(cxw $$0) {
      this.al.a(bM, $$0.a());
   }

   @Nullable
   public cka b(arq $$0, bvt $$1) {
      cka $$2 = bwm.bM.a($$0, bwl.e);
      if ($$2 != null && $$1 instanceof cka $$3) {
         if (this.ae.h()) {
            $$2.j(this.gH());
         } else {
            $$2.j($$3.gH());
         }

         if (this.q()) {
            $$2.a(this.d());
            $$2.a(true, true);
            cxw $$4 = this.gF();
            cxw $$5 = $$3.gF();
            $$2.a(cxw.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   public void z(boolean $$0) {
      this.al.a(bL, $$0);
   }

   @Override
   public boolean a(cis $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.q()) {
         return false;
      } else if (!($$0 instanceof cka $$1)) {
         return false;
      } else if (!$$1.q()) {
         return false;
      } else {
         return $$1.x() ? false : this.gA() && $$1.gA();
      }
   }

   public boolean gG() {
      return this.al.a(bL);
   }

   @Override
   public boolean a(bxc $$0, bxc $$1) {
      if ($$0 instanceof cnl || $$0 instanceof cnt || $$0 instanceof cms) {
         return false;
      } else if ($$0 instanceof cka $$2) {
         return !$$2.q() || $$2.e() != $$1;
      } else {
         if ($$0 instanceof cqy $$3 && $$1 instanceof cqy $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cld $$5 && $$5.gH()) {
            return false;
         }

         if ($$0 instanceof bxy $$6 && $$6.q()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean w() {
      return !this.W_();
   }

   @Override
   public fei cT() {
      return new fei(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   public static boolean c(bwm<cka> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.ci) && a($$1, $$3);
   }

   class a<T extends bxc> extends cdf<T> {
      private final cka j;

      public a(final cka $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof clg ? !this.j.q() && this.a((clg)this.b) : false;
      }

      private boolean a(clg $$0) {
         return $$0.gu() >= cka.this.ae.a(5);
      }

      @Override
      public void d() {
         cka.this.g(null);
         super.d();
      }

      @Override
      public void a() {
         cka.this.g(null);
         super.a();
      }
   }

   public static class b extends bvt.a {
      public final je<ckb> a;

      public b(je<ckb> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
