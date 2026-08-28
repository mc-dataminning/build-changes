import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cir extends cgr {
   public static final buh bY = buh.b(0.9F, 1.3F).a(0.7F);
   private static final int cf = 2;
   private static final int cg = 1;
   protected static final ImmutableList<cfl<? extends cfk<? super cir>>> bZ = ImmutableList.of(cfl.c, cfl.d, cfl.b, cfl.o, cfl.f, cfl.r);
   protected static final ImmutableList<cee<?>> ca = ImmutableList.of(
      cee.n, cee.h, cee.m, cee.E, cee.t, cee.av, cee.r, cee.S, cee.T, cee.O, cee.K, cee.P, new cee[]{cee.R, cee.V, cee.W, cee.Z}
   );
   public static final int cc = 10;
   public static final double cd = 0.02;
   public static final double ce = 0.1F;
   private static final akl<Boolean> ch = akp.a(cir.class, akn.k);
   private static final akl<Boolean> ci = akp.a(cir.class, akn.k);
   private static final akl<Boolean> cj = akp.a(cir.class, akn.k);
   private boolean ck;
   private int cl;

   public cir(bul<? extends cir> $$0, dfb $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.a(esb.f, -1.0F);
      this.a(esb.g, -1.0F);
   }

   public cwb q() {
      azs $$0 = azs.a((long)this.cH().hashCode());
      axq<cvu> $$1 = this.gG() ? axi.b : axi.a;
      return this.dX().H_().e(lz.I).a($$1, $$0).map($$0x -> cvv.a(cwf.wk, $$0x)).orElseGet(() -> new cwb(cwf.wk));
   }

   @Override
   protected bwc.b<cir> ee() {
      return bwc.a(ca, bZ);
   }

   @Override
   protected bwc<?> a(Dynamic<?> $$0) {
      return cis.a(this.ee().a($$0));
   }

   public static bwh.a t() {
      return cgr.gz().a(bwi.s, 10.0).a(bwi.v, 0.2F).a(bwi.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.g(bwi.c).a(1.0);
         this.gy();
      } else {
         this.g(bwi.c).a(2.0);
         this.gx();
      }
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 10;
   }

   @Override
   protected awk w() {
      return this.gG() ? awl.kU : awl.kL;
   }

   @Override
   protected awk d(bsu $$0) {
      return this.gG() ? awl.kX : awl.kO;
   }

   @Override
   protected awk o_() {
      return this.gG() ? awl.kV : awl.kM;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.lc, 0.15F, 1.0F);
   }

   protected awk y() {
      return this.gG() ? awl.kZ : awl.kQ;
   }

   @Nullable
   public cir b(arn $$0, btv $$1) {
      cir $$2 = bul.X.a($$0, buk.e);
      if ($$2 != null) {
         cis.a($$2, $$0.E_());
         btv $$3 = (btv)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cir $$4 && $$4.gG() || $$0.E_().j() < 0.02;
         $$2.x($$5);
      }

      return $$2;
   }

   @Override
   public bwc<cir> ed() {
      return (bwc<cir>)super.ed();
   }

   @Override
   protected void ac() {
      bon $$0 = bom.a();
      $$0.a("goatBrain");
      this.ed().a((arn)this.dX(), this);
      $$0.c();
      $$0.a("goatActivityUpdate");
      cis.a(this);
      $$0.c();
      super.ac();
   }

   @Override
   public int ae() {
      return 15;
   }

   @Override
   public void q(float $$0) {
      int $$1 = this.ae();
      float $$2 = azk.c(this.aX, $$0);
      float $$3 = azk.a($$2, (float)(-$$1), (float)$$1);
      super.q(this.aX + $$3);
   }

   @Override
   protected void gA() {
      this.dX().a(null, this, this.gG() ? awl.kW : awl.kN, awm.g, 1.0F, azk.b(this.dX().A, 0.8F, 1.2F));
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.ae);
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if ($$2.a(cwf.qz) && !this.p_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         cwb $$3 = cwe.a($$2, $$0, cwf.qF.o());
         $$0.a($$1, $$3);
         return bsd.a;
      } else {
         bsd $$4 = super.b($$0, $$1);
         if ($$4.a() && this.l($$2)) {
            this.gA();
         }

         return $$4;
      }
   }

   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      azs $$4 = $$0.E_();
      cis.a(this, $$4);
      this.x($$4.j() < 0.02);
      this.k();
      if (!this.p_() && (double)$$4.i() < 0.1F) {
         akl<Boolean> $$5 = $$4.h() ? ci : cj;
         this.am.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void ab() {
      super.ab();
      ags.a(this);
   }

   @Override
   public buh e(bvm $$0) {
      return $$0 == bvm.g ? bY.a(this.ek()) : super.e($$0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gG());
      $$0.a("HasLeftHorn", this.gu());
      $$0.a("HasRightHorn", this.gv());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.x($$0.q("IsScreamingGoat"));
      this.am.a(ci, $$0.q("HasLeftHorn"));
      this.am.a(cj, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.ck = true;
      } else if ($$0 == 59) {
         this.ck = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void n_() {
      if (this.ck) {
         this.cl++;
      } else {
         this.cl -= 2;
      }

      this.cl = azk.a(this.cl, 0, 20);
      super.n_();
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(ch, false);
      $$0.a(ci, true);
      $$0.a(cj, true);
   }

   public boolean gu() {
      return this.am.a(ci);
   }

   public boolean gv() {
      return this.am.a(cj);
   }

   public boolean gw() {
      boolean $$0 = this.gu();
      boolean $$1 = this.gv();
      if (!$$0 && !$$1) {
         return false;
      } else {
         akl<Boolean> $$2;
         if (!$$0) {
            $$2 = cj;
         } else if (!$$1) {
            $$2 = ci;
         } else {
            $$2 = this.af.h() ? ci : cj;
         }

         this.am.a($$2, false);
         ezn $$5 = this.dv();
         cwb $$6 = this.q();
         double $$7 = (double)azk.b(this.af, -0.2F, 0.2F);
         double $$8 = (double)azk.b(this.af, 0.3F, 0.7F);
         double $$9 = (double)azk.b(this.af, -0.2F, 0.2F);
         ckv $$10 = new ckv(this.dX(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dX().b($$10);
         return true;
      }
   }

   public void gx() {
      this.am.a(ci, true);
      this.am.a(cj, true);
   }

   public void gy() {
      this.am.a(ci, false);
      this.am.a(cj, false);
   }

   public boolean gG() {
      return this.am.a(ch);
   }

   public void x(boolean $$0) {
      this.am.a(ch, $$0);
   }

   public float gH() {
      return (float)this.cl / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bul<? extends cgr> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      return $$1.a_($$3.e()).a(axa.ca) && a($$1, $$3);
   }
}
