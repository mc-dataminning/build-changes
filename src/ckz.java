import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ckz extends cis {
   public static final bwg bF = bwg.b(0.9F, 1.3F).a(0.7F);
   private static final int bM = 2;
   private static final int bN = 1;
   protected static final ImmutableList<chl<? extends chk<? super ckz>>> bG = ImmutableList.of(chl.c, chl.d, chl.b, chl.o, chl.f, chl.r);
   protected static final ImmutableList<cge<?>> bH = ImmutableList.of(
      cge.o, cge.h, cge.n, cge.F, cge.u, cge.aw, cge.s, cge.T, cge.U, cge.P, cge.L, cge.Q, new cge[]{cge.S, cge.W, cge.X, cge.aa}
   );
   public static final int bJ = 10;
   public static final double bK = 0.02;
   public static final double bL = 0.1F;
   private static final akj<Boolean> bO = akn.a(ckz.class, akl.k);
   private static final akj<Boolean> bP = akn.a(ckz.class, akl.k);
   private static final akj<Boolean> bQ = akn.a(ckz.class, akl.k);
   private boolean bR;
   private int bS;

   public ckz(bwm<? extends ckz> $$0, div $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.a(ewx.f, -1.0F);
      this.a(ewx.g, -1.0F);
   }

   public cyy q() {
      azv $$0 = azv.a((long)this.cG().hashCode());
      axr<cyr> $$1 = this.gC() ? axj.b : axj.a;
      return this.dV().F_().f(mg.aT).a($$1, $$0).map($$0x -> cys.a(czc.xo, $$0x)).orElseGet(() -> new cyy(czc.xo));
   }

   @Override
   protected byc.b<ckz> ec() {
      return byc.a(bH, bG);
   }

   @Override
   protected byc<?> a(Dynamic<?> $$0) {
      return cla.a(this.ec().a($$0));
   }

   public static byh.a t() {
      return cis.gv().a(byi.s, 10.0).a(byi.v, 0.2F).a(byi.c, 2.0);
   }

   @Override
   protected void j() {
      if (this.n_()) {
         this.g(byi.c).a(1.0);
         this.gu();
      } else {
         this.g(byi.c).a(2.0);
         this.gt();
      }
   }

   @Override
   protected int a(double $$0, float $$1) {
      return super.a($$0, $$1) - 10;
   }

   @Override
   protected awm u() {
      return this.gC() ? awn.lu : awn.ll;
   }

   @Override
   protected awm e(bus $$0) {
      return this.gC() ? awn.lx : awn.lo;
   }

   @Override
   protected awm l_() {
      return this.gC() ? awn.lv : awn.lm;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.lC, 0.15F, 1.0F);
   }

   protected awm x() {
      return this.gC() ? awn.lz : awn.lq;
   }

   @Nullable
   public ckz b(arq $$0, bvt $$1) {
      ckz $$2 = bwm.ah.a($$0, bwl.e);
      if ($$2 != null) {
         cla.a($$2, $$0.C_());
         bvt $$3 = (bvt)($$0.C_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof ckz $$4 && $$4.gC() || $$0.C_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public byc<ckz> eb() {
      return (byc<ckz>)super.eb();
   }

   @Override
   protected void a(arq $$0) {
      bqm $$1 = bql.a();
      $$1.a("goatBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("goatActivityUpdate");
      cla.a(this);
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
      float $$2 = azm.c(this.aV, $$0);
      float $$3 = azm.a($$2, (float)(-$$1), (float)$$1);
      super.r(this.aV + $$3);
   }

   @Override
   protected void gw() {
      this.dV().a(null, this, this.gC() ? awn.lw : awn.ln, awo.g, 1.0F, azm.b(this.dV().A, 0.8F, 1.2F));
   }

   @Override
   public boolean j(cyy $$0) {
      return $$0.a(axk.ae);
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      if ($$2.a(czc.rl) && !this.n_()) {
         $$0.a(this.x(), 1.0F, 1.0F);
         cyy $$3 = czb.a($$2, $$0, czc.rr.m());
         $$0.a($$1, $$3);
         return bub.a;
      } else {
         bub $$4 = super.b($$0, $$1);
         if ($$4.a() && this.j($$2)) {
            this.gw();
         }

         return $$4;
      }
   }

   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      azv $$4 = $$0.C_();
      cla.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.j();
      if (!this.n_() && (double)$$4.i() < 0.1F) {
         akj<Boolean> $$5 = $$4.h() ? bP : bQ;
         this.al.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   @Override
   public bwg e(bxo $$0) {
      return $$0 == bxo.g ? bF.a(this.ej()) : super.e($$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gC());
      $$0.a("HasLeftHorn", this.gq());
      $$0.a("HasRightHorn", this.gr());
   }

   @Override
   public void a(tz $$0) {
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

      this.bS = azm.a(this.bS, 0, 20);
      super.k_();
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bO, false);
      $$0.a(bP, true);
      $$0.a(bQ, true);
   }

   public boolean gq() {
      return this.al.a(bP);
   }

   public boolean gr() {
      return this.al.a(bQ);
   }

   public boolean gs() {
      boolean $$0 = this.gq();
      boolean $$1 = this.gr();
      if (!$$0 && !$$1) {
         return false;
      } else {
         akj<Boolean> $$2;
         if (!$$0) {
            $$2 = bQ;
         } else if (!$$1) {
            $$2 = bP;
         } else {
            $$2 = this.ae.h() ? bP : bQ;
         }

         this.al.a($$2, false);
         fei $$5 = this.dt();
         cyy $$6 = this.q();
         double $$7 = (double)azm.b(this.ae, -0.2F, 0.2F);
         double $$8 = (double)azm.b(this.ae, 0.3F, 0.7F);
         double $$9 = (double)azm.b(this.ae, -0.2F, 0.2F);
         cnd $$10 = new cnd(this.dV(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dV().b($$10);
         return true;
      }
   }

   public void gt() {
      this.al.a(bP, true);
      this.al.a(bQ, true);
   }

   public void gu() {
      this.al.a(bP, false);
      this.al.a(bQ, false);
   }

   public boolean gC() {
      return this.al.a(bO);
   }

   public void w(boolean $$0) {
      this.al.a(bO, $$0);
   }

   public float gD() {
      return (float)this.bS / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bwm<? extends cis> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.cc) && a($$1, $$3);
   }
}
