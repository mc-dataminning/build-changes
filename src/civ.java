import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class civ extends bwv implements bwd, bwy<jr<ciw>> {
   private static final ajx<Boolean> bL = akb.a(civ.class, ajz.k);
   private static final ajx<Integer> bM = akb.a(civ.class, ajz.b);
   private static final ajx<Integer> bN = akb.a(civ.class, ajz.b);
   private static final ajx<jr<ciw>> bO = akb.a(civ.class, ajz.y);
   public static final cgp.a bJ = ($$0, $$1) -> {
      bvi<?> $$2 = $$0.aq();
      return $$2 == bvi.ba || $$2 == bvi.aX || $$2 == bvi.aa;
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
   private static final bsj bY = bab.a(20, 39);
   @Nullable
   private UUID bZ;

   public civ(bvi<? extends civ> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(false, false);
      this.a(eun.f, -1.0F);
      this.a(eun.g, -1.0F);
   }

   @Override
   protected void D() {
      this.bC.a(1, new ccq(this));
      this.bC.a(1, new bwv.a(1.5, awr.G));
      this.bC.a(2, new ceb(this));
      this.bC.a(3, new civ.a<>(this, cjz.class, 24.0F, 1.5, 1.5));
      this.bC.a(4, new cdc(this, 0.4F));
      this.bC.a(5, new cdg(this, 1.0, true));
      this.bC.a(6, new ccu(this, 1.0, 10.0F, 2.0F));
      this.bC.a(7, new cci(this, 1.0));
      this.bC.a(8, new cej(this, 1.0));
      this.bC.a(9, new cce(this, 8.0F));
      this.bC.a(10, new cde(this, cpr.class, 8.0F));
      this.bC.a(10, new cdr(this));
      this.bD.a(1, new cet(this));
      this.bD.a(2, new ceu(this));
      this.bD.a(3, new ceo(this).a());
      this.bD.a(4, new cep<>(this, cpr.class, 10, true, false, this::a));
      this.bD.a(5, new ces<>(this, chp.class, false, bJ));
      this.bD.a(6, new ces<>(this, cit.class, false, cit.bF));
      this.bD.a(7, new cep<>(this, cma.class, false));
      this.bD.a(8, new cev<>(this, true));
   }

   public aku gE() {
      ciw $$0 = this.gF().a();
      if (this.q()) {
         return $$0.b();
      } else {
         return this.Z_() ? $$0.c() : $$0.a();
      }
   }

   public jr<ciw> gF() {
      return this.al.a(bO);
   }

   public void j(jr<ciw> $$0) {
      this.al.a(bO, $$0);
   }

   public static bxf.a gG() {
      return chp.gx().a(bxg.v, 0.3F).a(bxg.s, 8.0).a(bxg.c, 4.0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      kf $$1 = this.dW();
      ke<ciw> $$2 = $$1.e(mc.m);
      $$0.a(bO, $$2.a(cix.j).or($$2::a).orElseThrow());
      $$0.a(bL, false);
      $$0.a(bM, cwe.o.a());
      $$0.a(bN, 0);
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.DR, 0.15F, 1.0F);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gI().a());
      this.gF().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.a_($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      Optional.ofNullable(aku.c($$0.l("variant"))).map($$0x -> akt.a(mc.m, $$0x)).flatMap($$0x -> this.dW().e(mc.m).a($$0x)).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cwe.a($$0.h("CollarColor")));
      }

      this.a(this.dU(), $$0);
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      jr<dic> $$4 = $$0.t(this.du());
      jr<ciw> $$6;
      if ($$3 instanceof civ.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cix.a(this.dW(), $$4);
         $$3 = new civ.b($$6);
      }

      this.j($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected avz u() {
      if (this.Z_()) {
         return awa.DM;
      } else if (this.ae.a(3) == 0) {
         return this.q() && this.eE() < 20.0F ? awa.DS : awa.DP;
      } else {
         return awa.DK;
      }
   }

   @Override
   protected avz e(btp $$0) {
      return this.j($$0) ? awa.DI : awa.DO;
   }

   @Override
   protected avz l_() {
      return awa.DL;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dU().C && this.bU && !this.bV && !this.go() && this.aJ()) {
         this.bV = true;
         this.bW = 0.0F;
         this.bX = 0.0F;
         this.dU().a(this, (byte)8);
      }

      if (!this.dU().C) {
         this.a((ard)this.dU(), true);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.bJ()) {
         this.bT = this.bS;
         if (this.gJ()) {
            this.bS = this.bS + (1.0F - this.bS) * 0.4F;
         } else {
            this.bS = this.bS + (0.0F - this.bS) * 0.4F;
         }

         if (this.bk()) {
            this.bU = true;
            if (this.bV && !this.dU().C) {
               this.dU().a(this, (byte)56);
               this.gK();
            }
         } else if ((this.bU || this.bV) && this.bV) {
            if (this.bW == 0.0F) {
               this.a(awa.DQ, this.fg(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
               this.a(ecp.u);
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
               float $$0 = (float)this.dB();
               int $$1 = (int)(ayz.a((this.bW - 0.4F) * (float) Math.PI) * 7.0F);
               fbx $$2 = this.dx();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ae.i() * 2.0F - 1.0F) * this.dp() * 0.5F;
                  float $$5 = (this.ae.i() * 2.0F - 1.0F) * this.dp() * 0.5F;
                  this.dU().a(lt.ap, this.dz() + (double)$$4, (double)($$0 + 0.8F), this.dF() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gK() {
      this.bV = false;
      this.bW = 0.0F;
      this.bX = 0.0F;
   }

   @Override
   public void a(btp $$0) {
      this.bU = false;
      this.bV = false;
      this.bX = 0.0F;
      this.bW = 0.0F;
      super.a($$0);
   }

   public float K(float $$0) {
      return !this.bU ? 1.0F : Math.min(0.75F + ayz.h($$0, this.bX, this.bW) / 2.0F * 0.25F, 1.0F);
   }

   public float L(float $$0) {
      return ayz.h($$0, this.bX, this.bW);
   }

   public float M(float $$0) {
      return ayz.h($$0, this.bT, this.bS) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ac() {
      return this.x() ? 20 : super.ac();
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.y(false);
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean e(bvj $$0) {
      return true;
   }

   @Override
   protected void b(ard $$0, btp $$1, float $$2) {
      if (!this.j($$1)) {
         super.b($$0, $$1, $$2);
      } else {
         cxh $$3 = this.aj();
         int $$4 = $$3.o();
         int $$5 = $$3.p();
         $$3.a(ayz.f($$2), this, bvj.g);
         if (buw.b.a($$4, $$5) != buw.b.a(this.aj())) {
            this.a(awa.DH);
            $$0.a(new lp(lt.U, cxl.oX.n()), this.dz(), this.dB() + 1.0, this.dF(), 20, 0.2, 0.1, 0.2, 0.1);
         }
      }
   }

   private boolean j(btp $$0) {
      return this.aj().a(cxl.oY) && !$$0.a(awr.C);
   }

   @Override
   protected void t() {
      if (this.q()) {
         this.g(bxg.s).a(40.0);
         this.d(40.0F);
      } else {
         this.g(bxg.s).a(8.0);
      }
   }

   @Override
   protected void c(btp $$0, float $$1) {
      this.a($$0, $$1, new bvj[]{bvj.g});
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      cxd $$3 = $$2.h();
      if (this.q()) {
         if (this.j($$2) && this.eE() < this.eS()) {
            this.a($$0, $$1, $$2);
            cst $$4 = $$2.a(kv.w);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return bsy.a;
         } else {
            if ($$3 instanceof cwf $$6 && this.k($$0)) {
               cwe $$7 = $$6.b();
               if ($$7 != this.gI()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return bsy.a;
               }

               return super.b($$0, $$1);
            }

            if (this.a($$2, bvj.g) && !this.ak() && this.k($$0) && !this.n_()) {
               this.h($$2.c(1));
               $$2.a(1, $$0);
               return bsy.a;
            } else if ($$2.a(cxl.sU) && this.k($$0) && this.ak() && (!ddt.a(this.aj(), dds.E) || $$0.b())) {
               $$2.a(1, $$0, d($$1));
               this.a(awa.az);
               cxh $$8 = this.aj();
               this.h(cxh.k);
               if (this.dU() instanceof ard $$9) {
                  this.a($$9, $$8);
               }

               return bsy.a;
            } else if (this.x() && this.ak() && this.k($$0) && this.aj().n() && this.aj().c($$2)) {
               $$2.h(1);
               this.a(awa.DJ);
               cxh $$10 = this.aj();
               int $$11 = (int)((float)$$10.p() * 0.125F);
               $$10.b(Math.max(0, $$10.o() - $$11));
               return bsy.a;
            } else {
               bsy $$12 = super.b($$0, $$1);
               if (!$$12.a() && this.k($$0)) {
                  this.y(!this.gs());
                  this.bf = false;
                  this.bB.m();
                  this.h(null);
                  return bsy.a.b();
               } else {
                  return $$12;
               }
            }
         }
      } else if (!this.dU().C && $$2.a(cxl.sy) && !this.Z_()) {
         $$2.a(1, $$0);
         this.f($$0);
         return bsy.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void f(cpr $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.bB.m();
         this.h(null);
         this.y(true);
         this.dU().a(this, (byte)7);
      } else {
         this.dU().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.bV = true;
         this.bW = 0.0F;
         this.bX = 0.0F;
      } else if ($$0 == 56) {
         this.gK();
      } else {
         super.b($$0);
      }
   }

   public float gH() {
      if (this.Z_()) {
         return 1.5393804F;
      } else if (this.q()) {
         float $$0 = this.eS();
         float $$1 = ($$0 - this.eE()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.ag);
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

   public cwe gI() {
      return cwe.a(this.al.a(bM));
   }

   private void a(cwe $$0) {
      this.al.a(bM, $$0.a());
   }

   @Nullable
   public civ b(ard $$0, buq $$1) {
      civ $$2 = bvi.bL.a($$0, bvh.e);
      if ($$2 != null && $$1 instanceof civ $$3) {
         if (this.ae.h()) {
            $$2.j(this.gF());
         } else {
            $$2.j($$3.gF());
         }

         if (this.q()) {
            $$2.a(this.W_());
            $$2.a(true, true);
            cwe $$4 = this.gI();
            cwe $$5 = $$3.gI();
            $$2.a(cwe.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   public void z(boolean $$0) {
      this.al.a(bL, $$0);
   }

   @Override
   public boolean a(chp $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.q()) {
         return false;
      } else if (!($$0 instanceof civ $$1)) {
         return false;
      } else if (!$$1.q()) {
         return false;
      } else {
         return $$1.x() ? false : this.gC() && $$1.gC();
      }
   }

   public boolean gJ() {
      return this.al.a(bL);
   }

   @Override
   public boolean a(bvy $$0, bvy $$1) {
      if ($$0 instanceof cme || $$0 instanceof cmm || $$0 instanceof cll) {
         return false;
      } else if ($$0 instanceof civ $$2) {
         return !$$2.q() || $$2.ae_() != $$1;
      } else {
         if ($$0 instanceof cpr $$3 && $$1 instanceof cpr $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cjw $$5 && $$5.gJ()) {
            return false;
         }

         if ($$0 instanceof bwv $$6 && $$6.q()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean w() {
      return !this.Z_();
   }

   @Override
   public fbx cS() {
      return new fbx(0.0, (double)(0.6F * this.cR()), (double)(this.dp() * 0.4F));
   }

   public static boolean c(bvi<civ> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.ci) && a($$1, $$3);
   }

   class a<T extends bvy> extends ccd<T> {
      private final civ j;

      public a(final civ $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof cjz ? !this.j.q() && this.a((cjz)this.b) : false;
      }

      private boolean a(cjz $$0) {
         return $$0.gw() >= civ.this.ae.a(5);
      }

      @Override
      public void d() {
         civ.this.h(null);
         super.d();
      }

      @Override
      public void a() {
         civ.this.h(null);
         super.a();
      }
   }

   public static class b extends buq.a {
      public final jr<ciw> a;

      public b(jr<ciw> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
