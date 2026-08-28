import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cjs extends chp {
   public static final bvd bF = bvd.b(0.9F, 1.3F).a(0.7F);
   private static final int bM = 2;
   private static final int bN = 1;
   protected static final ImmutableList<cgj<? extends cgi<? super cjs>>> bG = ImmutableList.of(cgj.c, cgj.d, cgj.b, cgj.o, cgj.f, cgj.r);
   protected static final ImmutableList<cfc<?>> bH = ImmutableList.of(
      cfc.n, cfc.h, cfc.m, cfc.E, cfc.t, cfc.av, cfc.r, cfc.S, cfc.T, cfc.O, cfc.K, cfc.P, new cfc[]{cfc.R, cfc.V, cfc.W, cfc.Z}
   );
   public static final int bJ = 10;
   public static final double bK = 0.02;
   public static final double bL = 0.1F;
   private static final ajx<Boolean> bO = akb.a(cjs.class, ajz.k);
   private static final ajx<Boolean> bP = akb.a(cjs.class, ajz.k);
   private static final ajx<Boolean> bQ = akb.a(cjs.class, ajz.k);
   private boolean bR;
   private int bS;

   public cjs(bvi<? extends cjs> $$0, dgz $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.a(eun.f, -1.0F);
      this.a(eun.g, -1.0F);
   }

   public cxh q() {
      azh $$0 = azh.a((long)this.cF().hashCode());
      axf<cxa> $$1 = this.gE() ? awx.b : awx.a;
      return this.dU().F_().e(mc.I).a($$1, $$0).map($$0x -> cxb.a(cxl.xk, $$0x)).orElseGet(() -> new cxh(cxl.xk));
   }

   @Override
   protected bxa.b<cjs> eb() {
      return bxa.a(bH, bG);
   }

   @Override
   protected bxa<?> a(Dynamic<?> $$0) {
      return cjt.a(this.eb().a($$0));
   }

   public static bxf.a t() {
      return chp.gx().a(bxg.s, 10.0).a(bxg.v, 0.2F).a(bxg.c, 2.0);
   }

   @Override
   protected void X_() {
      if (this.n_()) {
         this.g(bxg.c).a(1.0);
         this.gw();
      } else {
         this.g(bxg.c).a(2.0);
         this.gv();
      }
   }

   @Override
   protected int f(float $$0, float $$1) {
      return super.f($$0, $$1) - 10;
   }

   @Override
   protected avz u() {
      return this.gE() ? awa.lt : awa.lk;
   }

   @Override
   protected avz e(btp $$0) {
      return this.gE() ? awa.lw : awa.ln;
   }

   @Override
   protected avz l_() {
      return this.gE() ? awa.lu : awa.ll;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.lB, 0.15F, 1.0F);
   }

   protected avz x() {
      return this.gE() ? awa.ly : awa.lp;
   }

   @Nullable
   public cjs b(ard $$0, buq $$1) {
      cjs $$2 = bvi.ah.a($$0, bvh.e);
      if ($$2 != null) {
         cjt.a($$2, $$0.C_());
         buq $$3 = (buq)($$0.C_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cjs $$4 && $$4.gE() || $$0.C_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bxa<cjs> ea() {
      return (bxa<cjs>)super.ea();
   }

   @Override
   protected void a(ard $$0) {
      bpj $$1 = bpi.a();
      $$1.a("goatBrain");
      this.ea().a($$0, this);
      $$1.c();
      $$1.a("goatActivityUpdate");
      cjt.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public int ad() {
      return 15;
   }

   @Override
   public void r(float $$0) {
      int $$1 = this.ad();
      float $$2 = ayz.c(this.aV, $$0);
      float $$3 = ayz.a($$2, (float)(-$$1), (float)$$1);
      super.r(this.aV + $$3);
   }

   @Override
   protected void gy() {
      this.dU().a(null, this, this.gE() ? awa.lv : awa.lm, awb.g, 1.0F, ayz.b(this.dU().A, 0.8F, 1.2F));
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.ae);
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if ($$2.a(cxl.rh) && !this.n_()) {
         $$0.a(this.x(), 1.0F, 1.0F);
         cxh $$3 = cxk.a($$2, $$0, cxl.rn.n());
         $$0.a($$1, $$3);
         return bsy.a;
      } else {
         bsy $$4 = super.b($$0, $$1);
         if ($$4.a() && this.j($$2)) {
            this.gy();
         }

         return $$4;
      }
   }

   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      azh $$4 = $$0.C_();
      cjt.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.X_();
      if (!this.n_() && (double)$$4.i() < 0.1F) {
         ajx<Boolean> $$5 = $$4.h() ? bP : bQ;
         this.al.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void ab() {
      super.ab();
      agc.a(this);
   }

   @Override
   public bvd e(bwk $$0) {
      return $$0 == bwk.g ? bF.a(this.ei()) : super.e($$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gE());
      $$0.a("HasLeftHorn", this.gs());
      $$0.a("HasRightHorn", this.gt());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.al.a(bP, $$0.q("HasLeftHorn"));
      this.al.a(bQ, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.bR = true;
      } else if ($$0 == 59) {
         this.bR = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void k_() {
      if (this.bR) {
         this.bS++;
      } else {
         this.bS -= 2;
      }

      this.bS = ayz.a(this.bS, 0, 20);
      super.k_();
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bO, false);
      $$0.a(bP, true);
      $$0.a(bQ, true);
   }

   public boolean gs() {
      return this.al.a(bP);
   }

   public boolean gt() {
      return this.al.a(bQ);
   }

   public boolean gu() {
      boolean $$0 = this.gs();
      boolean $$1 = this.gt();
      if (!$$0 && !$$1) {
         return false;
      } else {
         ajx<Boolean> $$2;
         if (!$$0) {
            $$2 = bQ;
         } else if (!$$1) {
            $$2 = bP;
         } else {
            $$2 = this.ae.h() ? bP : bQ;
         }

         this.al.a($$2, false);
         fbx $$5 = this.ds();
         cxh $$6 = this.q();
         double $$7 = (double)ayz.b(this.ae, -0.2F, 0.2F);
         double $$8 = (double)ayz.b(this.ae, 0.3F, 0.7F);
         double $$9 = (double)ayz.b(this.ae, -0.2F, 0.2F);
         clw $$10 = new clw(this.dU(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dU().b($$10);
         return true;
      }
   }

   public void gv() {
      this.al.a(bP, true);
      this.al.a(bQ, true);
   }

   public void gw() {
      this.al.a(bP, false);
      this.al.a(bQ, false);
   }

   public boolean gE() {
      return this.al.a(bO);
   }

   public void w(boolean $$0) {
      this.al.a(bO, $$0);
   }

   public float gF() {
      return (float)this.bS / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bvi<? extends chp> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.cc) && a($$1, $$3);
   }
}
