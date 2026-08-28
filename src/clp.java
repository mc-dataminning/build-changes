import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clp extends cjk {
   public static final bww bI = bww.b(0.9F, 1.3F).a(0.7F);
   private static final int bP = 2;
   private static final int bQ = 1;
   protected static final ImmutableList<cid<? extends cic<? super clp>>> bJ = ImmutableList.of(cid.c, cid.d, cid.b, cid.o, cid.f, cid.r);
   protected static final ImmutableList<cgw<?>> bK = ImmutableList.of(
      cgw.o, cgw.h, cgw.n, cgw.F, cgw.u, cgw.aw, cgw.s, cgw.T, cgw.U, cgw.P, cgw.L, cgw.Q, new cgw[]{cgw.S, cgw.W, cgw.X, cgw.aa}
   );
   public static final int bM = 10;
   public static final double bN = 0.02;
   public static final double bO = 0.1F;
   private static final akl<Boolean> bR = akp.a(clp.class, akn.k);
   private static final akl<Boolean> bS = akp.a(clp.class, akn.k);
   private static final akl<Boolean> bT = akp.a(clp.class, akn.k);
   private static final boolean bU = false;
   private static final boolean bV = true;
   private static final boolean bW = true;
   private boolean bX;
   private int bY;

   public clp(bxc<? extends clp> $$0, djx $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.a(eyf.f, -1.0F);
      this.a(eyf.g, -1.0F);
   }

   public czy q() {
      azx $$0 = azx.a((long)this.cG().hashCode());
      axt<czr> $$1 = this.gG() ? axl.b : axl.a;
      return this.dV().J_().f(mh.aU).a($$1, $$0).map($$0x -> czs.a(dac.xt, $$0x)).orElseGet(() -> new czy(dac.xt));
   }

   @Override
   protected byu.b<clp> ed() {
      return byu.a(bK, bJ);
   }

   @Override
   protected byu<?> a(Dynamic<?> $$0) {
      return clq.a(this.ed().a($$0));
   }

   public static byz.a t() {
      return cjk.gz().a(bza.s, 10.0).a(bza.v, 0.2F).a(bza.c, 2.0);
   }

   @Override
   protected void j() {
      if (this.n_()) {
         this.g(bza.c).a(1.0);
         this.gy();
      } else {
         this.g(bza.c).a(2.0);
         this.gx();
      }
   }

   @Override
   protected int a(double $$0, float $$1) {
      return super.a($$0, $$1) - 10;
   }

   @Override
   protected awo u() {
      return this.gG() ? awp.lx : awp.lo;
   }

   @Override
   protected awo e(bvi $$0) {
      return this.gG() ? awp.lA : awp.lr;
   }

   @Override
   protected awo l_() {
      return this.gG() ? awp.ly : awp.lp;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.lF, 0.15F, 1.0F);
   }

   protected awo x() {
      return this.gG() ? awp.lC : awp.lt;
   }

   @Nullable
   public clp b(ars $$0, bwj $$1) {
      clp $$2 = bxc.ai.a($$0, bxb.e);
      if ($$2 != null) {
         clq.a($$2, $$0.G_());
         bwj $$3 = (bwj)($$0.G_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof clp $$4 && $$4.gG() || $$0.G_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public byu<clp> ec() {
      return (byu<clp>)super.ec();
   }

   @Override
   protected void a(ars $$0) {
      brb $$1 = bra.a();
      $$1.a("goatBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("goatActivityUpdate");
      clq.a(this);
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
      float $$2 = azo.c(this.aV, $$0);
      float $$3 = azo.a($$2, (float)(-$$1), (float)$$1);
      super.r(this.aV + $$3);
   }

   @Override
   protected void gA() {
      this.dV().a(null, this, this.gG() ? awp.lz : awp.lq, awq.g, 1.0F, azo.b(this.dV().A, 0.8F, 1.2F));
   }

   @Override
   public boolean i(czy $$0) {
      return $$0.a(axm.af);
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if ($$2.a(dac.ro) && !this.n_()) {
         $$0.a(this.x(), 1.0F, 1.0F);
         czy $$3 = dab.a($$2, $$0, dac.ru.m());
         $$0.a($$1, $$3);
         return bur.a;
      } else {
         bur $$4 = super.b($$0, $$1);
         if ($$4.a() && this.i($$2)) {
            this.gA();
         }

         return $$4;
      }
   }

   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      azx $$4 = $$0.G_();
      clq.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.j();
      if (!this.n_() && (double)$$4.i() < 0.1F) {
         akl<Boolean> $$5 = $$4.h() ? bS : bT;
         this.al.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void ac() {
      super.ac();
      ago.a(this);
   }

   @Override
   public bww e(byg $$0) {
      return $$0 == byg.g ? bI.a(this.ek()) : super.e($$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gG());
      $$0.a("HasLeftHorn", this.gu());
      $$0.a("HasRightHorn", this.gv());
   }

   @Override
   public void a(tz $$0) {
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
   public void k_() {
      if (this.bX) {
         this.bY++;
      } else {
         this.bY -= 2;
      }

      this.bY = azo.a(this.bY, 0, 20);
      super.k_();
   }

   @Override
   protected void a(akp.a $$0) {
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
         akl<Boolean> $$2;
         if (!$$0) {
            $$2 = bT;
         } else if (!$$1) {
            $$2 = bS;
         } else {
            $$2 = this.ae.h() ? bS : bT;
         }

         this.al.a($$2, false);
         ffq $$5 = this.dt();
         czy $$6 = this.q();
         double $$7 = (double)azo.b(this.ae, -0.2F, 0.2F);
         double $$8 = (double)azo.b(this.ae, 0.3F, 0.7F);
         double $$9 = (double)azo.b(this.ae, -0.2F, 0.2F);
         coc $$10 = new coc(this.dV(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
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

   public static boolean c(bxc<? extends cjk> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return $$1.a_($$3.e()).a(axe.cd) && a($$1, $$3);
   }
}
