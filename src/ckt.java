import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ckt extends cio {
   public static final bwd bF = bwd.b(0.9F, 1.3F).a(0.7F);
   private static final int bM = 2;
   private static final int bN = 1;
   protected static final ImmutableList<chi<? extends chh<? super ckt>>> bG = ImmutableList.of(chi.c, chi.d, chi.b, chi.o, chi.f, chi.r);
   protected static final ImmutableList<cgb<?>> bH = ImmutableList.of(
      cgb.o, cgb.h, cgb.n, cgb.F, cgb.u, cgb.aw, cgb.s, cgb.T, cgb.U, cgb.P, cgb.L, cgb.Q, new cgb[]{cgb.S, cgb.W, cgb.X, cgb.aa}
   );
   public static final int bJ = 10;
   public static final double bK = 0.02;
   public static final double bL = 0.1F;
   private static final akh<Boolean> bO = akl.a(ckt.class, akj.k);
   private static final akh<Boolean> bP = akl.a(ckt.class, akj.k);
   private static final akh<Boolean> bQ = akl.a(ckt.class, akj.k);
   private boolean bR;
   private int bS;

   public ckt(bwj<? extends ckt> $$0, dip $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.a(ewm.f, -1.0F);
      this.a(ewm.g, -1.0F);
   }

   public cys q() {
      azt $$0 = azt.a((long)this.cG().hashCode());
      axp<cyl> $$1 = this.gC() ? axh.b : axh.a;
      return this.dV().F_().f(mg.aS).a($$1, $$0).map($$0x -> cym.a(cyw.xm, $$0x)).orElseGet(() -> new cys(cyw.xm));
   }

   @Override
   protected bxz.b<ckt> ec() {
      return bxz.a(bH, bG);
   }

   @Override
   protected bxz<?> a(Dynamic<?> $$0) {
      return cku.a(this.ec().a($$0));
   }

   public static bye.a t() {
      return cio.gv().a(byf.s, 10.0).a(byf.v, 0.2F).a(byf.c, 2.0);
   }

   @Override
   protected void j() {
      if (this.n_()) {
         this.g(byf.c).a(1.0);
         this.gu();
      } else {
         this.g(byf.c).a(2.0);
         this.gt();
      }
   }

   @Override
   protected int a(double $$0, float $$1) {
      return super.a($$0, $$1) - 10;
   }

   @Override
   protected awk u() {
      return this.gC() ? awl.lt : awl.lk;
   }

   @Override
   protected awk e(bup $$0) {
      return this.gC() ? awl.lw : awl.ln;
   }

   @Override
   protected awk l_() {
      return this.gC() ? awl.lu : awl.ll;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.lB, 0.15F, 1.0F);
   }

   protected awk x() {
      return this.gC() ? awl.ly : awl.lp;
   }

   @Nullable
   public ckt b(aro $$0, bvq $$1) {
      ckt $$2 = bwj.ah.a($$0, bwi.e);
      if ($$2 != null) {
         cku.a($$2, $$0.C_());
         bvq $$3 = (bvq)($$0.C_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof ckt $$4 && $$4.gC() || $$0.C_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bxz<ckt> eb() {
      return (bxz<ckt>)super.eb();
   }

   @Override
   protected void a(aro $$0) {
      bqj $$1 = bqi.a();
      $$1.a("goatBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("goatActivityUpdate");
      cku.a(this);
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
      float $$2 = azk.c(this.aV, $$0);
      float $$3 = azk.a($$2, (float)(-$$1), (float)$$1);
      super.r(this.aV + $$3);
   }

   @Override
   protected void gw() {
      this.dV().a(null, this, this.gC() ? awl.lv : awl.lm, awm.g, 1.0F, azk.b(this.dV().A, 0.8F, 1.2F));
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.ae);
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if ($$2.a(cyw.rj) && !this.n_()) {
         $$0.a(this.x(), 1.0F, 1.0F);
         cys $$3 = cyv.a($$2, $$0, cyw.rp.m());
         $$0.a($$1, $$3);
         return bty.a;
      } else {
         bty $$4 = super.b($$0, $$1);
         if ($$4.a() && this.k($$2)) {
            this.gw();
         }

         return $$4;
      }
   }

   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      azt $$4 = $$0.C_();
      cku.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.j();
      if (!this.n_() && (double)$$4.i() < 0.1F) {
         akh<Boolean> $$5 = $$4.h() ? bP : bQ;
         this.al.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void ab() {
      super.ab();
      agk.a(this);
   }

   @Override
   public bwd e(bxl $$0) {
      return $$0 == bxl.g ? bF.a(this.ej()) : super.e($$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gC());
      $$0.a("HasLeftHorn", this.gq());
      $$0.a("HasRightHorn", this.gr());
   }

   @Override
   public void a(tx $$0) {
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

      this.bS = azk.a(this.bS, 0, 20);
      super.k_();
   }

   @Override
   protected void a(akl.a $$0) {
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
         akh<Boolean> $$2;
         if (!$$0) {
            $$2 = bQ;
         } else if (!$$1) {
            $$2 = bP;
         } else {
            $$2 = this.ae.h() ? bP : bQ;
         }

         this.al.a($$2, false);
         fdw $$5 = this.dt();
         cys $$6 = this.q();
         double $$7 = (double)azk.b(this.ae, -0.2F, 0.2F);
         double $$8 = (double)azk.b(this.ae, 0.3F, 0.7F);
         double $$9 = (double)azk.b(this.ae, -0.2F, 0.2F);
         cmx $$10 = new cmx(this.dV(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
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

   public static boolean c(bwj<? extends cio> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      return $$1.a_($$3.e()).a(axa.cc) && a($$1, $$3);
   }
}
