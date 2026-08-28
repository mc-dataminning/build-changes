import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cle extends ciz {
   public static final bwl bG = bwl.b(0.9F, 1.3F).a(0.7F);
   private static final int bN = 2;
   private static final int bO = 1;
   protected static final ImmutableList<chs<? extends chr<? super cle>>> bH = ImmutableList.of(chs.c, chs.d, chs.b, chs.o, chs.f, chs.r);
   protected static final ImmutableList<cgl<?>> bI = ImmutableList.of(
      cgl.o, cgl.h, cgl.n, cgl.F, cgl.u, cgl.aw, cgl.s, cgl.T, cgl.U, cgl.P, cgl.L, cgl.Q, new cgl[]{cgl.S, cgl.W, cgl.X, cgl.aa}
   );
   public static final int bK = 10;
   public static final double bL = 0.02;
   public static final double bM = 0.1F;
   private static final akj<Boolean> bP = akn.a(cle.class, akl.k);
   private static final akj<Boolean> bQ = akn.a(cle.class, akl.k);
   private static final akj<Boolean> bR = akn.a(cle.class, akl.k);
   private boolean bS;
   private int bT;

   public cle(bwr<? extends cle> $$0, djm $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.a(exr.f, -1.0F);
      this.a(exr.g, -1.0F);
   }

   public czn q() {
      azv $$0 = azv.a((long)this.cF().hashCode());
      axr<czg> $$1 = this.gF() ? axj.b : axj.a;
      return this.dU().F_().f(mh.aU).a($$1, $$0).map($$0x -> czh.a(czr.xt, $$0x)).orElseGet(() -> new czn(czr.xt));
   }

   @Override
   protected byj.b<cle> ec() {
      return byj.a(bI, bH);
   }

   @Override
   protected byj<?> a(Dynamic<?> $$0) {
      return clf.a(this.ec().a($$0));
   }

   public static byo.a t() {
      return ciz.gy().a(byp.s, 10.0).a(byp.v, 0.2F).a(byp.c, 2.0);
   }

   @Override
   protected void j() {
      if (this.n_()) {
         this.g(byp.c).a(1.0);
         this.gx();
      } else {
         this.g(byp.c).a(2.0);
         this.gw();
      }
   }

   @Override
   protected int a(double $$0, float $$1) {
      return super.a($$0, $$1) - 10;
   }

   @Override
   protected awm u() {
      return this.gF() ? awn.lx : awn.lo;
   }

   @Override
   protected awm e(bux $$0) {
      return this.gF() ? awn.lA : awn.lr;
   }

   @Override
   protected awm l_() {
      return this.gF() ? awn.ly : awn.lp;
   }

   @Override
   protected void b(iv $$0, eat $$1) {
      this.a(awn.lF, 0.15F, 1.0F);
   }

   protected awm x() {
      return this.gF() ? awn.lC : awn.lt;
   }

   @Nullable
   public cle b(arq $$0, bvy $$1) {
      cle $$2 = bwr.ah.a($$0, bwq.e);
      if ($$2 != null) {
         clf.a($$2, $$0.C_());
         bvy $$3 = (bvy)($$0.C_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cle $$4 && $$4.gF() || $$0.C_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public byj<cle> eb() {
      return (byj<cle>)super.eb();
   }

   @Override
   protected void a(arq $$0) {
      bqq $$1 = bqp.a();
      $$1.a("goatBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("goatActivityUpdate");
      clf.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public int af() {
      return 15;
   }

   @Override
   public void r(float $$0) {
      int $$1 = this.af();
      float $$2 = azm.c(this.aV, $$0);
      float $$3 = azm.a($$2, (float)(-$$1), (float)$$1);
      super.r(this.aV + $$3);
   }

   @Override
   protected void gz() {
      this.dU().a(null, this, this.gF() ? awn.lz : awn.lq, awo.g, 1.0F, azm.b(this.dU().A, 0.8F, 1.2F));
   }

   @Override
   public boolean i(czn $$0) {
      return $$0.a(axk.af);
   }

   @Override
   public bug b(crm $$0, buf $$1) {
      czn $$2 = $$0.b($$1);
      if ($$2.a(czr.ro) && !this.n_()) {
         $$0.a(this.x(), 1.0F, 1.0F);
         czn $$3 = czq.a($$2, $$0, czr.ru.m());
         $$0.a($$1, $$3);
         return bug.a;
      } else {
         bug $$4 = super.b($$0, $$1);
         if ($$4.a() && this.i($$2)) {
            this.gz();
         }

         return $$4;
      }
   }

   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      azv $$4 = $$0.C_();
      clf.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.j();
      if (!this.n_() && (double)$$4.i() < 0.1F) {
         akj<Boolean> $$5 = $$4.h() ? bQ : bR;
         this.al.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void ac() {
      super.ac();
      agm.a(this);
   }

   @Override
   public bwl e(bxv $$0) {
      return $$0 == bxv.g ? bG.a(this.ej()) : super.e($$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gF());
      $$0.a("HasLeftHorn", this.gt());
      $$0.a("HasRightHorn", this.gu());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.o("IsScreamingGoat"));
      this.al.a(bQ, $$0.o("HasLeftHorn"));
      this.al.a(bR, $$0.o("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.bS = true;
      } else if ($$0 == 59) {
         this.bS = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void k_() {
      if (this.bS) {
         this.bT++;
      } else {
         this.bT -= 2;
      }

      this.bT = azm.a(this.bT, 0, 20);
      super.k_();
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bP, false);
      $$0.a(bQ, true);
      $$0.a(bR, true);
   }

   public boolean gt() {
      return this.al.a(bQ);
   }

   public boolean gu() {
      return this.al.a(bR);
   }

   public boolean gv() {
      boolean $$0 = this.gt();
      boolean $$1 = this.gu();
      if (!$$0 && !$$1) {
         return false;
      } else {
         akj<Boolean> $$2;
         if (!$$0) {
            $$2 = bR;
         } else if (!$$1) {
            $$2 = bQ;
         } else {
            $$2 = this.ae.h() ? bQ : bR;
         }

         this.al.a($$2, false);
         ffc $$5 = this.ds();
         czn $$6 = this.q();
         double $$7 = (double)azm.b(this.ae, -0.2F, 0.2F);
         double $$8 = (double)azm.b(this.ae, 0.3F, 0.7F);
         double $$9 = (double)azm.b(this.ae, -0.2F, 0.2F);
         cnr $$10 = new cnr(this.dU(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dU().b($$10);
         return true;
      }
   }

   public void gw() {
      this.al.a(bQ, true);
      this.al.a(bR, true);
   }

   public void gx() {
      this.al.a(bQ, false);
      this.al.a(bR, false);
   }

   public boolean gF() {
      return this.al.a(bP);
   }

   public void w(boolean $$0) {
      this.al.a(bP, $$0);
   }

   public float gG() {
      return (float)this.bT / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bwr<? extends ciz> $$0, djn $$1, bwq $$2, iv $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.cd) && a($$1, $$3);
   }
}
