import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cid extends cgd {
   public static final btu bY = btu.b(0.9F, 1.3F).a(0.7F);
   private static final int cf = 2;
   private static final int cg = 1;
   protected static final ImmutableList<cex<? extends cew<? super cid>>> bZ = ImmutableList.of(cex.c, cex.d, cex.b, cex.o, cex.f, cex.r);
   protected static final ImmutableList<cdq<?>> ca = ImmutableList.of(
      cdq.n, cdq.h, cdq.m, cdq.E, cdq.t, cdq.av, cdq.r, cdq.S, cdq.T, cdq.O, cdq.K, cdq.P, new cdq[]{cdq.R, cdq.V, cdq.W, cdq.Z}
   );
   public static final int cc = 10;
   public static final double cd = 0.02;
   public static final double ce = 0.1F;
   private static final akh<Boolean> ch = akl.a(cid.class, akj.k);
   private static final akh<Boolean> ci = akl.a(cid.class, akj.k);
   private static final akh<Boolean> cj = akl.a(cid.class, akj.k);
   private boolean ck;
   private int cl;

   public cid(bty<? extends cid> $$0, dej $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.a(erk.f, -1.0F);
      this.a(erk.g, -1.0F);
   }

   public cvs q() {
      azn $$0 = azn.a((long)this.cD().hashCode());
      axl<cvk> $$1 = this.gA() ? axd.b : axd.a;
      return this.dS().G_().e(lw.I).a($$1, $$0).map($$0x -> cvl.a(cvw.wk, $$0x)).orElseGet(() -> new cvs(cvw.wk));
   }

   @Override
   protected bvo.b<cid> dZ() {
      return bvo.a(ca, bZ);
   }

   @Override
   protected bvo<?> a(Dynamic<?> $$0) {
      return cie.a(this.dZ().a($$0));
   }

   public static bvt.a t() {
      return cgd.gt().a(bvu.s, 10.0).a(bvu.v, 0.2F).a(bvu.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.g(bvu.c).a(1.0);
         this.gs();
      } else {
         this.g(bvu.c).a(2.0);
         this.gr();
      }
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 10;
   }

   @Override
   protected awf w() {
      return this.gA() ? awg.kV : awg.kL;
   }

   @Override
   protected awf d(bsj $$0) {
      return this.gA() ? awg.kY : awg.kO;
   }

   @Override
   protected awf o_() {
      return this.gA() ? awg.kW : awg.kM;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.le, 0.15F, 1.0F);
   }

   protected awf y() {
      return this.gA() ? awg.la : awg.kQ;
   }

   @Nullable
   public cid b(arj $$0, btk $$1) {
      cid $$2 = bty.X.a($$0, btx.e);
      if ($$2 != null) {
         cie.a($$2, $$0.D_());
         btk $$3 = (btk)($$0.D_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cid $$4 && $$4.gA() || $$0.D_().j() < 0.02;
         $$2.x($$5);
      }

      return $$2;
   }

   @Override
   public bvo<cid> dY() {
      return (bvo<cid>)super.dY();
   }

   @Override
   protected void ac() {
      this.dS().ah().a("goatBrain");
      this.dY().a((arj)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("goatActivityUpdate");
      cie.a(this);
      this.dS().ah().c();
      super.ac();
   }

   @Override
   public int ae() {
      return 15;
   }

   @Override
   public void q(float $$0) {
      int $$1 = this.ae();
      float $$2 = azf.c(this.aT, $$0);
      float $$3 = azf.a($$2, (float)(-$$1), (float)$$1);
      super.q(this.aT + $$3);
   }

   @Override
   protected void gu() {
      this.dS().a(null, this, this.gA() ? awg.kX : awg.kN, awh.g, 1.0F, azf.b(this.dS().z, 0.8F, 1.2F));
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.ab);
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if ($$2.a(cvw.qz) && !this.p_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         cvs $$3 = cvv.a($$2, $$0, cvw.qF.v());
         $$0.a($$1, $$3);
         return brs.a;
      } else {
         brs $$4 = super.b($$0, $$1);
         if ($$4.a() && this.n($$2)) {
            this.gu();
         }

         return $$4;
      }
   }

   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      azn $$4 = $$0.D_();
      cie.a(this, $$4);
      this.x($$4.j() < 0.02);
      this.k();
      if (!this.p_() && (double)$$4.i() < 0.1F) {
         akh<Boolean> $$5 = $$4.h() ? ci : cj;
         this.am.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void ab() {
      super.ab();
      ago.a(this);
   }

   @Override
   public btu e(buz $$0) {
      return $$0 == buz.g ? bY.a(this.ef()) : super.e($$0);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gA());
      $$0.a("HasLeftHorn", this.go());
      $$0.a("HasRightHorn", this.gp());
   }

   @Override
   public void a(ug $$0) {
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

      this.cl = azf.a(this.cl, 0, 20);
      super.n_();
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(ch, false);
      $$0.a(ci, true);
      $$0.a(cj, true);
   }

   public boolean go() {
      return this.am.a(ci);
   }

   public boolean gp() {
      return this.am.a(cj);
   }

   public boolean gq() {
      boolean $$0 = this.go();
      boolean $$1 = this.gp();
      if (!$$0 && !$$1) {
         return false;
      } else {
         akh<Boolean> $$2;
         if (!$$0) {
            $$2 = cj;
         } else if (!$$1) {
            $$2 = ci;
         } else {
            $$2 = this.af.h() ? ci : cj;
         }

         this.am.a($$2, false);
         eyw $$5 = this.dq();
         cvs $$6 = this.q();
         double $$7 = (double)azf.b(this.af, -0.2F, 0.2F);
         double $$8 = (double)azf.b(this.af, 0.3F, 0.7F);
         double $$9 = (double)azf.b(this.af, -0.2F, 0.2F);
         ckh $$10 = new ckh(this.dS(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dS().b($$10);
         return true;
      }
   }

   public void gr() {
      this.am.a(ci, true);
      this.am.a(cj, true);
   }

   public void gs() {
      this.am.a(ci, false);
      this.am.a(cj, false);
   }

   public boolean gA() {
      return this.am.a(ch);
   }

   public void x(boolean $$0) {
      this.am.a(ch, $$0);
   }

   public float gB() {
      return (float)this.cl / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bty<? extends cgd> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      return $$1.a_($$3.e()).a(awv.ca) && a($$1, $$3);
   }
}
