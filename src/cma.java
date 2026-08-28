import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cma extends cjv {
   public static final bxh bI = bxh.b(0.9F, 1.3F).a(0.7F);
   private static final int bP = 2;
   private static final int bQ = 1;
   protected static final ImmutableList<cio<? extends cin<? super cma>>> bJ = ImmutableList.of(cio.c, cio.d, cio.b, cio.o, cio.f, cio.r);
   protected static final ImmutableList<chh<?>> bK = ImmutableList.of(
      chh.o, chh.h, chh.n, chh.F, chh.u, chh.aw, chh.s, chh.T, chh.U, chh.P, chh.L, chh.Q, new chh[]{chh.S, chh.W, chh.X, chh.aa}
   );
   public static final int bM = 10;
   public static final double bN = 0.02;
   public static final double bO = 0.1F;
   private static final aku<Boolean> bR = aky.a(cma.class, akw.k);
   private static final aku<Boolean> bS = aky.a(cma.class, akw.k);
   private static final aku<Boolean> bT = aky.a(cma.class, akw.k);
   private static final boolean bU = false;
   private static final boolean bV = true;
   private static final boolean bW = true;
   private boolean bX;
   private int bY;

   public cma(bxn<? extends cma> $$0, dkj $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.a(eyr.f, -1.0F);
      this.a(eyr.g, -1.0F);
   }

   public dak m() {
      bai $$0 = bai.a((long)this.cG().hashCode());
      ayc<dad> $$1 = this.gG() ? axu.b : axu.a;
      return this.dV().J_().f(mi.aU).a($$1, $$0).map($$0x -> dae.a(dao.xt, $$0x)).orElseGet(() -> new dak(dao.xt));
   }

   @Override
   protected bzf.b<cma> ed() {
      return bzf.a(bK, bJ);
   }

   @Override
   protected bzf<?> a(Dynamic<?> $$0) {
      return cmb.a(this.ed().a($$0));
   }

   public static bzk.a p() {
      return cjv.gz().a(bzl.s, 10.0).a(bzl.v, 0.2F).a(bzl.c, 2.0);
   }

   @Override
   protected void h() {
      if (this.e_()) {
         this.g(bzl.c).a(1.0);
         this.gy();
      } else {
         this.g(bzl.c).a(2.0);
         this.gx();
      }
   }

   @Override
   protected int a(double $$0, float $$1) {
      return super.a($$0, $$1) - 10;
   }

   @Override
   protected awx s() {
      return this.gG() ? awy.lx : awy.lo;
   }

   @Override
   protected awx e(bvt $$0) {
      return this.gG() ? awy.lA : awy.lr;
   }

   @Override
   protected awx j_() {
      return this.gG() ? awy.ly : awy.lp;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.lF, 0.15F, 1.0F);
   }

   protected awx u() {
      return this.gG() ? awy.lC : awy.lt;
   }

   @Nullable
   public cma b(asb $$0, bwu $$1) {
      cma $$2 = bxn.ai.a($$0, bxm.e);
      if ($$2 != null) {
         cmb.a($$2, $$0.G_());
         bwu $$3 = (bwu)($$0.G_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cma $$4 && $$4.gG() || $$0.G_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bzf<cma> ec() {
      return (bzf<cma>)super.ec();
   }

   @Override
   protected void a(asb $$0) {
      brm $$1 = brl.a();
      $$1.a("goatBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("goatActivityUpdate");
      cmb.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public int ae() {
      return 15;
   }

   @Override
   public void r(float $$0) {
      int $$1 = this.ae();
      float $$2 = azz.c(this.aV, $$0);
      float $$3 = azz.a($$2, (float)(-$$1), (float)$$1);
      super.r(this.aV + $$3);
   }

   @Override
   protected void gA() {
      this.dV().a(null, this, this.gG() ? awy.lz : awy.lq, awz.g, 1.0F, azz.b(this.dV().A, 0.8F, 1.2F));
   }

   @Override
   public boolean i(dak $$0) {
      return $$0.a(axv.ag);
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if ($$2.a(dao.ro) && !this.e_()) {
         $$0.a(this.u(), 1.0F, 1.0F);
         dak $$3 = dan.a($$2, $$0, dao.ru.m());
         $$0.a($$1, $$3);
         return bvc.a;
      } else {
         bvc $$4 = super.b($$0, $$1);
         if ($$4.a() && this.i($$2)) {
            this.gA();
         }

         return $$4;
      }
   }

   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      bai $$4 = $$0.G_();
      cmb.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.h();
      if (!this.e_() && (double)$$4.i() < 0.1F) {
         aku<Boolean> $$5 = $$4.h() ? bS : bT;
         this.al.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void ab() {
      super.ab();
      agx.a(this);
   }

   @Override
   public bxh e(byr $$0) {
      return $$0 == byr.g ? bI.a(this.ek()) : super.e($$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gG());
      $$0.a("HasLeftHorn", this.gu());
      $$0.a("HasRightHorn", this.gv());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.b("IsScreamingGoat", false));
      this.al.a(bS, $$0.b("HasLeftHorn", true));
      this.al.a(bT, $$0.b("HasRightHorn", true));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.bX = true;
      } else if ($$0 == 59) {
         this.bX = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void d_() {
      if (this.bX) {
         this.bY++;
      } else {
         this.bY -= 2;
      }

      this.bY = azz.a(this.bY, 0, 20);
      super.d_();
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bR, false);
      $$0.a(bS, true);
      $$0.a(bT, true);
   }

   public boolean gu() {
      return this.al.a(bS);
   }

   public boolean gv() {
      return this.al.a(bT);
   }

   public boolean gw() {
      boolean $$0 = this.gu();
      boolean $$1 = this.gv();
      if (!$$0 && !$$1) {
         return false;
      } else {
         aku<Boolean> $$2;
         if (!$$0) {
            $$2 = bT;
         } else if (!$$1) {
            $$2 = bS;
         } else {
            $$2 = this.ae.h() ? bS : bT;
         }

         this.al.a($$2, false);
         fgc $$5 = this.dt();
         dak $$6 = this.m();
         double $$7 = (double)azz.b(this.ae, -0.2F, 0.2F);
         double $$8 = (double)azz.b(this.ae, 0.3F, 0.7F);
         double $$9 = (double)azz.b(this.ae, -0.2F, 0.2F);
         coo $$10 = new coo(this.dV(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dV().b($$10);
         return true;
      }
   }

   public void gx() {
      this.al.a(bS, true);
      this.al.a(bT, true);
   }

   public void gy() {
      this.al.a(bS, false);
      this.al.a(bT, false);
   }

   public boolean gG() {
      return this.al.a(bR);
   }

   public void w(boolean $$0) {
      this.al.a(bR, $$0);
   }

   public float gH() {
      return (float)this.bY / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bxn<? extends cjv> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return $$1.a_($$3.e()).a(axn.cd) && a($$1, $$3);
   }
}
