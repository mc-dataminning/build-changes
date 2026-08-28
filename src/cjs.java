import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cjs extends chs {
   public static final bvi bZ = bvi.b(0.9F, 1.3F).a(0.7F);
   private static final int cg = 2;
   private static final int ch = 1;
   protected static final ImmutableList<cgm<? extends cgl<? super cjs>>> ca = ImmutableList.of(cgm.c, cgm.d, cgm.b, cgm.o, cgm.f, cgm.r);
   protected static final ImmutableList<cff<?>> cb = ImmutableList.of(
      cff.n, cff.h, cff.m, cff.E, cff.t, cff.av, cff.r, cff.S, cff.T, cff.O, cff.K, cff.P, new cff[]{cff.R, cff.V, cff.W, cff.Z}
   );
   public static final int cd = 10;
   public static final double ce = 0.02;
   public static final double cf = 0.1F;
   private static final alc<Boolean> ci = alg.a(cjs.class, ale.k);
   private static final alc<Boolean> cj = alg.a(cjs.class, ale.k);
   private static final alc<Boolean> ck = alg.a(cjs.class, ale.k);
   private boolean cl;
   private int cm;

   public cjs(bvm<? extends cjs> $$0, dha $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.a(eug.f, -1.0F);
      this.a(eug.g, -1.0F);
   }

   public cxk p() {
      bam $$0 = bam.a((long)this.cG().hashCode());
      ayk<cxd> $$1 = this.gy() ? ayc.b : ayc.a;
      return this.dV().K_().e(mb.I).a($$1, $$0).map($$0x -> cxe.a(cxo.wY, $$0x)).orElseGet(() -> new cxk(cxo.wY));
   }

   @Override
   protected bxd.b<cjs> ec() {
      return bxd.a(cb, ca);
   }

   @Override
   protected bxd<?> a(Dynamic<?> $$0) {
      return cjt.a(this.ec().a($$0));
   }

   public static bxi.a t() {
      return chs.gr().a(bxj.s, 10.0).a(bxj.v, 0.2F).a(bxj.c, 2.0);
   }

   @Override
   protected void i() {
      if (this.e_()) {
         this.g(bxj.c).a(1.0);
         this.gq();
      } else {
         this.g(bxj.c).a(2.0);
         this.gp();
      }
   }

   @Override
   protected int f(float $$0, float $$1) {
      return super.f($$0, $$1) - 10;
   }

   @Override
   protected axe u() {
      return this.gy() ? axf.lm : axf.ld;
   }

   @Override
   protected axe e(btv $$0) {
      return this.gy() ? axf.lp : axf.lg;
   }

   @Override
   protected axe o_() {
      return this.gy() ? axf.ln : axf.le;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.lu, 0.15F, 1.0F);
   }

   protected axe x() {
      return this.gy() ? axf.lr : axf.li;
   }

   @Nullable
   public cjs b(ash $$0, buw $$1) {
      cjs $$2 = bvm.ai.a($$0, bvl.e);
      if ($$2 != null) {
         cjt.a($$2, $$0.H_());
         buw $$3 = (buw)($$0.H_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cjs $$4 && $$4.gy() || $$0.H_().j() < 0.02;
         $$2.x($$5);
      }

      return $$2;
   }

   @Override
   public bxd<cjs> eb() {
      return (bxd<cjs>)super.eb();
   }

   @Override
   protected void a(ash $$0) {
      bpo $$1 = bpn.a();
      $$1.a("goatBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("goatActivityUpdate");
      cjt.a(this);
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
      this.dV().a(null, this, this.gy() ? axf.lo : axf.lf, axg.g, 1.0F, bae.b(this.dV().A, 0.8F, 1.2F));
   }

   @Override
   public boolean j(cxk $$0) {
      return $$0.a(ayd.ag);
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if ($$2.a(cxo.qW) && !this.e_()) {
         $$0.a(this.x(), 1.0F, 1.0F);
         cxk $$3 = cxn.a($$2, $$0, cxo.rc.n());
         $$0.a($$1, $$3);
         return bte.a;
      } else {
         bte $$4 = super.b($$0, $$1);
         if ($$4.a() && this.j($$2)) {
            this.gs();
         }

         return $$4;
      }
   }

   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      bam $$4 = $$0.H_();
      cjt.a(this, $$4);
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
   public bvi e(bwn $$0) {
      return $$0 == bwn.g ? bZ.a(this.ei()) : super.e($$0);
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
         fbs $$5 = this.dt();
         cxk $$6 = this.p();
         double $$7 = (double)bae.b(this.ae, -0.2F, 0.2F);
         double $$8 = (double)bae.b(this.ae, 0.3F, 0.7F);
         double $$9 = (double)bae.b(this.ae, -0.2F, 0.2F);
         clw $$10 = new clw(this.dV(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
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

   public static boolean c(bvm<? extends chs> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.cb) && a($$1, $$3);
   }
}
