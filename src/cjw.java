import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cjw extends chw {
   public static final bvm bZ = bvm.b(0.9F, 1.3F).a(0.7F);
   private static final int cg = 2;
   private static final int ch = 1;
   protected static final ImmutableList<cgq<? extends cgp<? super cjw>>> ca = ImmutableList.of(cgq.c, cgq.d, cgq.b, cgq.o, cgq.f, cgq.r);
   protected static final ImmutableList<cfj<?>> cb = ImmutableList.of(
      cfj.n, cfj.h, cfj.m, cfj.E, cfj.t, cfj.av, cfj.r, cfj.S, cfj.T, cfj.O, cfj.K, cfj.P, new cfj[]{cfj.R, cfj.V, cfj.W, cfj.Z}
   );
   public static final int cd = 10;
   public static final double ce = 0.02;
   public static final double cf = 0.1F;
   private static final alc<Boolean> ci = alg.a(cjw.class, ale.k);
   private static final alc<Boolean> cj = alg.a(cjw.class, ale.k);
   private static final alc<Boolean> ck = alg.a(cjw.class, ale.k);
   private boolean cl;
   private int cm;

   public cjw(bvq<? extends cjw> $$0, dhh $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.a(eun.f, -1.0F);
      this.a(eun.g, -1.0F);
   }

   public cxo p() {
      bam $$0 = bam.a((long)this.cG().hashCode());
      ayk<cxh> $$1 = this.gy() ? ayc.b : ayc.a;
      return this.dV().K_().e(mb.I).a($$1, $$0).map($$0x -> cxi.a(cxs.wY, $$0x)).orElseGet(() -> new cxo(cxs.wY));
   }

   @Override
   protected bxh.b<cjw> ec() {
      return bxh.a(cb, ca);
   }

   @Override
   protected bxh<?> a(Dynamic<?> $$0) {
      return cjx.a(this.ec().a($$0));
   }

   public static bxm.a t() {
      return chw.gr().a(bxn.s, 10.0).a(bxn.v, 0.2F).a(bxn.c, 2.0);
   }

   @Override
   protected void i() {
      if (this.e_()) {
         this.g(bxn.c).a(1.0);
         this.gq();
      } else {
         this.g(bxn.c).a(2.0);
         this.gp();
      }
   }

   @Override
   protected int f(float $$0, float $$1) {
      return super.f($$0, $$1) - 10;
   }

   @Override
   protected axe u() {
      return this.gy() ? axf.ln : axf.le;
   }

   @Override
   protected axe e(btz $$0) {
      return this.gy() ? axf.lq : axf.lh;
   }

   @Override
   protected axe o_() {
      return this.gy() ? axf.lo : axf.lf;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.lv, 0.15F, 1.0F);
   }

   protected axe x() {
      return this.gy() ? axf.ls : axf.lj;
   }

   @Nullable
   public cjw b(ash $$0, bva $$1) {
      cjw $$2 = bvq.ai.a($$0, bvp.e);
      if ($$2 != null) {
         cjx.a($$2, $$0.H_());
         bva $$3 = (bva)($$0.H_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cjw $$4 && $$4.gy() || $$0.H_().j() < 0.02;
         $$2.x($$5);
      }

      return $$2;
   }

   @Override
   public bxh<cjw> eb() {
      return (bxh<cjw>)super.eb();
   }

   @Override
   protected void a(ash $$0) {
      bps $$1 = bpr.a();
      $$1.a("goatBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("goatActivityUpdate");
      cjx.a(this);
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
   protected void gs() {
      this.dV().a(null, this, this.gy() ? axf.lp : axf.lg, axg.g, 1.0F, bae.b(this.dV().A, 0.8F, 1.2F));
   }

   @Override
   public boolean j(cxo $$0) {
      return $$0.a(ayd.ag);
   }

   @Override
   public bti b(cpw $$0, bth $$1) {
      cxo $$2 = $$0.b($$1);
      if ($$2.a(cxs.qW) && !this.e_()) {
         $$0.a(this.x(), 1.0F, 1.0F);
         cxo $$3 = cxr.a($$2, $$0, cxs.rc.n());
         $$0.a($$1, $$3);
         return bti.a;
      } else {
         bti $$4 = super.b($$0, $$1);
         if ($$4.a() && this.j($$2)) {
            this.gs();
         }

         return $$4;
      }
   }

   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      bam $$4 = $$0.H_();
      cjx.a(this, $$4);
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
   public bvm e(bwr $$0) {
      return $$0 == bwr.g ? bZ.a(this.ei()) : super.e($$0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gy());
      $$0.a("HasLeftHorn", this.gm());
      $$0.a("HasRightHorn", this.gn());
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

   public boolean gm() {
      return this.al.a(cj);
   }

   public boolean gn() {
      return this.al.a(ck);
   }

   public boolean go() {
      boolean $$0 = this.gm();
      boolean $$1 = this.gn();
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
         fbx $$5 = this.dt();
         cxo $$6 = this.p();
         double $$7 = (double)bae.b(this.ae, -0.2F, 0.2F);
         double $$8 = (double)bae.b(this.ae, 0.3F, 0.7F);
         double $$9 = (double)bae.b(this.ae, -0.2F, 0.2F);
         cma $$10 = new cma(this.dV(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dV().b($$10);
         return true;
      }
   }

   public void gp() {
      this.al.a(cj, true);
      this.al.a(ck, true);
   }

   public void gq() {
      this.al.a(cj, false);
      this.al.a(ck, false);
   }

   public boolean gy() {
      return this.al.a(ci);
   }

   public void x(boolean $$0) {
      this.al.a(ci, $$0);
   }

   public float gz() {
      return (float)this.cm / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bvq<? extends chw> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.cb) && a($$1, $$3);
   }
}
