import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cjx extends chx {
   public static final bvn bZ = bvn.b(0.9F, 1.3F).a(0.7F);
   private static final int cg = 2;
   private static final int ch = 1;
   protected static final ImmutableList<cgr<? extends cgq<? super cjx>>> ca = ImmutableList.of(cgr.c, cgr.d, cgr.b, cgr.o, cgr.f, cgr.r);
   protected static final ImmutableList<cfk<?>> cb = ImmutableList.of(
      cfk.n, cfk.h, cfk.m, cfk.E, cfk.t, cfk.av, cfk.r, cfk.S, cfk.T, cfk.O, cfk.K, cfk.P, new cfk[]{cfk.R, cfk.V, cfk.W, cfk.Z}
   );
   public static final int cd = 10;
   public static final double ce = 0.02;
   public static final double cf = 0.1F;
   private static final alc<Boolean> ci = alg.a(cjx.class, ale.k);
   private static final alc<Boolean> cj = alg.a(cjx.class, ale.k);
   private static final alc<Boolean> ck = alg.a(cjx.class, ale.k);
   private boolean cl;
   private int cm;

   public cjx(bvr<? extends cjx> $$0, dhi $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.a(euo.f, -1.0F);
      this.a(euo.g, -1.0F);
   }

   public cxp p() {
      bam $$0 = bam.a((long)this.cG().hashCode());
      ayk<cxi> $$1 = this.gA() ? ayc.b : ayc.a;
      return this.dW().K_().e(mb.I).a($$1, $$0).map($$0x -> cxj.a(cxt.wY, $$0x)).orElseGet(() -> new cxp(cxt.wY));
   }

   @Override
   protected bxi.b<cjx> ed() {
      return bxi.a(cb, ca);
   }

   @Override
   protected bxi<?> a(Dynamic<?> $$0) {
      return cjy.a(this.ed().a($$0));
   }

   public static bxn.a t() {
      return chx.gt().a(bxo.s, 10.0).a(bxo.v, 0.2F).a(bxo.c, 2.0);
   }

   @Override
   protected void i() {
      if (this.e_()) {
         this.g(bxo.c).a(1.0);
         this.gs();
      } else {
         this.g(bxo.c).a(2.0);
         this.gr();
      }
   }

   @Override
   protected int f(float $$0, float $$1) {
      return super.f($$0, $$1) - 10;
   }

   @Override
   protected axe u() {
      return this.gA() ? axf.ln : axf.le;
   }

   @Override
   protected axe e(bua $$0) {
      return this.gA() ? axf.lq : axf.lh;
   }

   @Override
   protected axe o_() {
      return this.gA() ? axf.lo : axf.lf;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(axf.lv, 0.15F, 1.0F);
   }

   protected axe x() {
      return this.gA() ? axf.ls : axf.lj;
   }

   @Nullable
   public cjx b(ash $$0, bvb $$1) {
      cjx $$2 = bvr.ai.a($$0, bvq.e);
      if ($$2 != null) {
         cjy.a($$2, $$0.H_());
         bvb $$3 = (bvb)($$0.H_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cjx $$4 && $$4.gA() || $$0.H_().j() < 0.02;
         $$2.x($$5);
      }

      return $$2;
   }

   @Override
   public bxi<cjx> ec() {
      return (bxi<cjx>)super.ec();
   }

   @Override
   protected void a(ash $$0) {
      bpt $$1 = bps.a();
      $$1.a("goatBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("goatActivityUpdate");
      cjy.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public int aa() {
      return 15;
   }

   @Override
   public void q(float $$0) {
      int $$1 = this.aa();
      float $$2 = bae.c(this.aX, $$0);
      float $$3 = bae.a($$2, (float)(-$$1), (float)$$1);
      super.q(this.aX + $$3);
   }

   @Override
   protected void gu() {
      this.dW().a(null, this, this.gA() ? axf.lp : axf.lg, axg.g, 1.0F, bae.b(this.dW().A, 0.8F, 1.2F));
   }

   @Override
   public boolean j(cxp $$0) {
      return $$0.a(ayd.ag);
   }

   @Override
   public btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      if ($$2.a(cxt.qW) && !this.e_()) {
         $$0.a(this.x(), 1.0F, 1.0F);
         cxp $$3 = cxs.a($$2, $$0, cxt.rc.n());
         $$0.a($$1, $$3);
         return btj.a;
      } else {
         btj $$4 = super.b($$0, $$1);
         if ($$4.a() && this.j($$2)) {
            this.gu();
         }

         return $$4;
      }
   }

   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      bam $$4 = $$0.H_();
      cjy.a(this, $$4);
      this.x($$4.j() < 0.02);
      this.i();
      if (!this.e_() && (double)$$4.i() < 0.1F) {
         alc<Boolean> $$5 = $$4.h() ? cj : ck;
         this.al.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   @Override
   public bvn e(bws $$0) {
      return $$0 == bws.g ? bZ.a(this.ej()) : super.e($$0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gA());
      $$0.a("HasLeftHorn", this.go());
      $$0.a("HasRightHorn", this.gp());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.x($$0.q("IsScreamingGoat"));
      this.al.a(cj, $$0.q("HasLeftHorn"));
      this.al.a(ck, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.cl = true;
      } else if ($$0 == 59) {
         this.cl = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void d_() {
      if (this.cl) {
         this.cm++;
      } else {
         this.cm -= 2;
      }

      this.cm = bae.a(this.cm, 0, 20);
      super.d_();
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(ci, false);
      $$0.a(cj, true);
      $$0.a(ck, true);
   }

   public boolean go() {
      return this.al.a(cj);
   }

   public boolean gp() {
      return this.al.a(ck);
   }

   public boolean gq() {
      boolean $$0 = this.go();
      boolean $$1 = this.gp();
      if (!$$0 && !$$1) {
         return false;
      } else {
         alc<Boolean> $$2;
         if (!$$0) {
            $$2 = ck;
         } else if (!$$1) {
            $$2 = cj;
         } else {
            $$2 = this.ae.h() ? cj : ck;
         }

         this.al.a($$2, false);
         fby $$5 = this.du();
         cxp $$6 = this.p();
         double $$7 = (double)bae.b(this.ae, -0.2F, 0.2F);
         double $$8 = (double)bae.b(this.ae, 0.3F, 0.7F);
         double $$9 = (double)bae.b(this.ae, -0.2F, 0.2F);
         cmb $$10 = new cmb(this.dW(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dW().b($$10);
         return true;
      }
   }

   public void gr() {
      this.al.a(cj, true);
      this.al.a(ck, true);
   }

   public void gs() {
      this.al.a(cj, false);
      this.al.a(ck, false);
   }

   public boolean gA() {
      return this.al.a(ci);
   }

   public void x(boolean $$0) {
      this.al.a(ci, $$0);
   }

   public float gB() {
      return (float)this.cm / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bvr<? extends chx> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.cb) && a($$1, $$3);
   }
}
