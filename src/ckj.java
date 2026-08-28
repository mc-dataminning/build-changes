import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ckj extends cig {
   public static final bvv bE = bvv.b(0.9F, 1.3F).a(0.7F);
   private static final int bL = 2;
   private static final int bM = 1;
   protected static final ImmutableList<cha<? extends cgz<? super ckj>>> bF = ImmutableList.of(cha.c, cha.d, cha.b, cha.o, cha.f, cha.r);
   protected static final ImmutableList<cft<?>> bG = ImmutableList.of(
      cft.o, cft.h, cft.n, cft.F, cft.u, cft.aw, cft.s, cft.T, cft.U, cft.P, cft.L, cft.Q, new cft[]{cft.S, cft.W, cft.X, cft.aa}
   );
   public static final int bI = 10;
   public static final double bJ = 0.02;
   public static final double bK = 0.1F;
   private static final akg<Boolean> bN = akk.a(ckj.class, aki.k);
   private static final akg<Boolean> bO = akk.a(ckj.class, aki.k);
   private static final akg<Boolean> bP = akk.a(ckj.class, aki.k);
   private boolean bQ;
   private int bR;

   public ckj(bwb<? extends ckj> $$0, dhp $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.a(evk.f, -1.0F);
      this.a(evk.g, -1.0F);
   }

   public cxy q() {
      azs $$0 = azs.a((long)this.cG().hashCode());
      axp<cxr> $$1 = this.gC() ? axh.b : axh.a;
      return this.dV().F_().f(me.I).a($$1, $$0).map($$0x -> cxs.a(cyc.xm, $$0x)).orElseGet(() -> new cxy(cyc.xm));
   }

   @Override
   protected bxr.b<ckj> ec() {
      return bxr.a(bG, bF);
   }

   @Override
   protected bxr<?> a(Dynamic<?> $$0) {
      return ckk.a(this.ec().a($$0));
   }

   public static bxw.a t() {
      return cig.gv().a(bxx.s, 10.0).a(bxx.v, 0.2F).a(bxx.c, 2.0);
   }

   @Override
   protected void j() {
      if (this.n_()) {
         this.g(bxx.c).a(1.0);
         this.gu();
      } else {
         this.g(bxx.c).a(2.0);
         this.gt();
      }
   }

   @Override
   protected int a(double $$0, float $$1) {
      return super.a($$0, $$1) - 10;
   }

   @Override
   protected awj u() {
      return this.gC() ? awk.lt : awk.lk;
   }

   @Override
   protected awj e(buh $$0) {
      return this.gC() ? awk.lw : awk.ln;
   }

   @Override
   protected awj l_() {
      return this.gC() ? awk.lu : awk.ll;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.lB, 0.15F, 1.0F);
   }

   protected awj x() {
      return this.gC() ? awk.ly : awk.lp;
   }

   @Nullable
   public ckj b(arn $$0, bvi $$1) {
      ckj $$2 = bwb.ah.a($$0, bwa.e);
      if ($$2 != null) {
         ckk.a($$2, $$0.C_());
         bvi $$3 = (bvi)($$0.C_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof ckj $$4 && $$4.gC() || $$0.C_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bxr<ckj> eb() {
      return (bxr<ckj>)super.eb();
   }

   @Override
   protected void a(arn $$0) {
      bqb $$1 = bqa.a();
      $$1.a("goatBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("goatActivityUpdate");
      ckk.a(this);
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
      float $$2 = azk.c(this.aU, $$0);
      float $$3 = azk.a($$2, (float)(-$$1), (float)$$1);
      super.r(this.aU + $$3);
   }

   @Override
   protected void gw() {
      this.dV().a(null, this, this.gC() ? awk.lv : awk.lm, awl.g, 1.0F, azk.b(this.dV().A, 0.8F, 1.2F));
   }

   @Override
   public boolean k(cxy $$0) {
      return $$0.a(axi.ae);
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if ($$2.a(cyc.rj) && !this.n_()) {
         $$0.a(this.x(), 1.0F, 1.0F);
         cxy $$3 = cyb.a($$2, $$0, cyc.rp.n());
         $$0.a($$1, $$3);
         return btq.a;
      } else {
         btq $$4 = super.b($$0, $$1);
         if ($$4.a() && this.k($$2)) {
            this.gw();
         }

         return $$4;
      }
   }

   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      azs $$4 = $$0.C_();
      ckk.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.j();
      if (!this.n_() && (double)$$4.i() < 0.1F) {
         akg<Boolean> $$5 = $$4.h() ? bO : bP;
         this.al.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void ab() {
      super.ab();
      agj.a(this);
   }

   @Override
   public bvv e(bxd $$0) {
      return $$0 == bxd.g ? bE.a(this.ej()) : super.e($$0);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gC());
      $$0.a("HasLeftHorn", this.gq());
      $$0.a("HasRightHorn", this.gr());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.al.a(bO, $$0.q("HasLeftHorn"));
      this.al.a(bP, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.bQ = true;
      } else if ($$0 == 59) {
         this.bQ = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void k_() {
      if (this.bQ) {
         this.bR++;
      } else {
         this.bR -= 2;
      }

      this.bR = azk.a(this.bR, 0, 20);
      super.k_();
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bN, false);
      $$0.a(bO, true);
      $$0.a(bP, true);
   }

   public boolean gq() {
      return this.al.a(bO);
   }

   public boolean gr() {
      return this.al.a(bP);
   }

   public boolean gs() {
      boolean $$0 = this.gq();
      boolean $$1 = this.gr();
      if (!$$0 && !$$1) {
         return false;
      } else {
         akg<Boolean> $$2;
         if (!$$0) {
            $$2 = bP;
         } else if (!$$1) {
            $$2 = bO;
         } else {
            $$2 = this.ae.h() ? bO : bP;
         }

         this.al.a($$2, false);
         fcu $$5 = this.dt();
         cxy $$6 = this.q();
         double $$7 = (double)azk.b(this.ae, -0.2F, 0.2F);
         double $$8 = (double)azk.b(this.ae, 0.3F, 0.7F);
         double $$9 = (double)azk.b(this.ae, -0.2F, 0.2F);
         cmn $$10 = new cmn(this.dV(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dV().b($$10);
         return true;
      }
   }

   public void gt() {
      this.al.a(bO, true);
      this.al.a(bP, true);
   }

   public void gu() {
      this.al.a(bO, false);
      this.al.a(bP, false);
   }

   public boolean gC() {
      return this.al.a(bN);
   }

   public void w(boolean $$0) {
      this.al.a(bN, $$0);
   }

   public float gD() {
      return (float)this.bR / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bwb<? extends cig> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return $$1.a_($$3.e()).a(awz.cc) && a($$1, $$3);
   }
}
