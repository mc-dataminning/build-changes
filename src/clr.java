import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clr extends cjm {
   public static final bwy bI = bwy.b(0.9F, 1.3F).a(0.7F);
   private static final int bP = 2;
   private static final int bQ = 1;
   protected static final ImmutableList<cif<? extends cie<? super clr>>> bJ = ImmutableList.of(cif.c, cif.d, cif.b, cif.o, cif.f, cif.r);
   protected static final ImmutableList<cgy<?>> bK = ImmutableList.of(
      cgy.o, cgy.h, cgy.n, cgy.F, cgy.u, cgy.aw, cgy.s, cgy.T, cgy.U, cgy.P, cgy.L, cgy.Q, new cgy[]{cgy.S, cgy.W, cgy.X, cgy.aa}
   );
   public static final int bM = 10;
   public static final double bN = 0.02;
   public static final double bO = 0.1F;
   private static final akn<Boolean> bR = akr.a(clr.class, akp.k);
   private static final akn<Boolean> bS = akr.a(clr.class, akp.k);
   private static final akn<Boolean> bT = akr.a(clr.class, akp.k);
   private static final boolean bU = false;
   private static final boolean bV = true;
   private static final boolean bW = true;
   private boolean bX;
   private int bY;

   public clr(bxe<? extends clr> $$0, djz $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.a(eyh.f, -1.0F);
      this.a(eyh.g, -1.0F);
   }

   public daa q() {
      azz $$0 = azz.a((long)this.cG().hashCode());
      axv<czt> $$1 = this.gG() ? axn.b : axn.a;
      return this.dV().J_().f(mi.aU).a($$1, $$0).map($$0x -> czu.a(dae.xt, $$0x)).orElseGet(() -> new daa(dae.xt));
   }

   @Override
   protected byw.b<clr> ed() {
      return byw.a(bK, bJ);
   }

   @Override
   protected byw<?> a(Dynamic<?> $$0) {
      return cls.a(this.ed().a($$0));
   }

   public static bzb.a t() {
      return cjm.gz().a(bzc.s, 10.0).a(bzc.v, 0.2F).a(bzc.c, 2.0);
   }

   @Override
   protected void j() {
      if (this.n_()) {
         this.g(bzc.c).a(1.0);
         this.gy();
      } else {
         this.g(bzc.c).a(2.0);
         this.gx();
      }
   }

   @Override
   protected int a(double $$0, float $$1) {
      return super.a($$0, $$1) - 10;
   }

   @Override
   protected awq u() {
      return this.gG() ? awr.lx : awr.lo;
   }

   @Override
   protected awq e(bvk $$0) {
      return this.gG() ? awr.lA : awr.lr;
   }

   @Override
   protected awq l_() {
      return this.gG() ? awr.ly : awr.lp;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.lF, 0.15F, 1.0F);
   }

   protected awq x() {
      return this.gG() ? awr.lC : awr.lt;
   }

   @Nullable
   public clr b(aru $$0, bwl $$1) {
      clr $$2 = bxe.ai.a($$0, bxd.e);
      if ($$2 != null) {
         cls.a($$2, $$0.G_());
         bwl $$3 = (bwl)($$0.G_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof clr $$4 && $$4.gG() || $$0.G_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public byw<clr> ec() {
      return (byw<clr>)super.ec();
   }

   @Override
   protected void a(aru $$0) {
      brd $$1 = brc.a();
      $$1.a("goatBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("goatActivityUpdate");
      cls.a(this);
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
      float $$2 = azq.c(this.aV, $$0);
      float $$3 = azq.a($$2, (float)(-$$1), (float)$$1);
      super.r(this.aV + $$3);
   }

   @Override
   protected void gA() {
      this.dV().a(null, this, this.gG() ? awr.lz : awr.lq, aws.g, 1.0F, azq.b(this.dV().A, 0.8F, 1.2F));
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.ag);
   }

   @Override
   public but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if ($$2.a(dae.ro) && !this.n_()) {
         $$0.a(this.x(), 1.0F, 1.0F);
         daa $$3 = dad.a($$2, $$0, dae.ru.m());
         $$0.a($$1, $$3);
         return but.a;
      } else {
         but $$4 = super.b($$0, $$1);
         if ($$4.a() && this.i($$2)) {
            this.gA();
         }

         return $$4;
      }
   }

   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      azz $$4 = $$0.G_();
      cls.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.j();
      if (!this.n_() && (double)$$4.i() < 0.1F) {
         akn<Boolean> $$5 = $$4.h() ? bS : bT;
         this.al.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void ac() {
      super.ac();
      agq.a(this);
   }

   @Override
   public bwy e(byi $$0) {
      return $$0 == byi.g ? bI.a(this.ek()) : super.e($$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gG());
      $$0.a("HasLeftHorn", this.gu());
      $$0.a("HasRightHorn", this.gv());
   }

   @Override
   public void a(ua $$0) {
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

      this.bY = azq.a(this.bY, 0, 20);
      super.k_();
   }

   @Override
   protected void a(akr.a $$0) {
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
         akn<Boolean> $$2;
         if (!$$0) {
            $$2 = bT;
         } else if (!$$1) {
            $$2 = bS;
         } else {
            $$2 = this.ae.h() ? bS : bT;
         }

         this.al.a($$2, false);
         ffs $$5 = this.dt();
         daa $$6 = this.q();
         double $$7 = (double)azq.b(this.ae, -0.2F, 0.2F);
         double $$8 = (double)azq.b(this.ae, 0.3F, 0.7F);
         double $$9 = (double)azq.b(this.ae, -0.2F, 0.2F);
         coe $$10 = new coe(this.dV(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
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

   public static boolean c(bxe<? extends cjm> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      return $$1.a_($$3.e()).a(axg.cd) && a($$1, $$3);
   }
}
