import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class chx extends chw implements bwk, cif {
   public static final float bZ = 120.32113F;
   public static final int ca = bae.f(1.4959966F);
   private static final alc<Byte> cj = alg.a(chx.class, ale.a);
   private static final alc<Integer> ck = alg.a(chx.class, ale.b);
   private static final int cl = 2;
   private static final int cm = 4;
   private static final int cn = 8;
   private static final int co = 1200;
   private static final int cp = 600;
   private static final int cq = 3600;
   private static final int cr = 4;
   private static final int cs = 10;
   private static final int ct = 10;
   private static final int cu = 18;
   private static final int cv = 48;
   private static final int cw = 2;
   private static final int cx = 24;
   private static final int cy = 16;
   private static final int cz = 16;
   private static final int cC = 20;
   public static final String cb = "CropsGrownSincePollination";
   public static final String cd = "CannotEnterHiveTicks";
   public static final String ce = "TicksSincePollination";
   public static final String cf = "HasStung";
   public static final String cg = "HasNectar";
   public static final String ch = "flower_pos";
   public static final String ci = "hive_pos";
   private static final bst cD = bbg.a(20, 39);
   @Nullable
   private UUID cE;
   private float cF;
   private float cG;
   private int cH;
   int cI;
   private int cJ;
   private int cK;
   private static final int cL = 200;
   int cM;
   private static final int cN = 200;
   private static final int cO = 20;
   private static final int cP = 60;
   int cQ = bae.a(this.ae, 20, 60);
   @Nullable
   jh cR;
   @Nullable
   jh cS;
   chx.k cT;
   chx.e cU;
   private chx.f cV;
   private int cW;

   public chx(bvq<? extends chx> $$0, dhh $$1) {
      super($$0, $$1);
      this.bQ = new ccd(this, 20, true);
      this.bP = new chx.j(this);
      this.a(eun.n, -1.0F);
      this.a(eun.j, -1.0F);
      this.a(eun.k, 16.0F);
      this.a(eun.x, -1.0F);
      this.a(eun.h, -1.0F);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cj, (byte)0);
      $$0.a(ck, 0);
   }

   @Override
   public float a(jh $$0, dhk $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void B() {
      this.bT.a(0, new chx.b(this, 1.4F, true));
      this.bT.a(1, new chx.d());
      this.bT.a(2, new ccp(this, 1.0));
      this.bT.a(3, new cel(this, 1.25, $$0 -> $$0.a(ayd.ao), false));
      this.bT.a(3, new chx.n());
      this.bT.a(3, new chx.m());
      this.cT = new chx.k();
      this.bT.a(4, this.cT);
      this.bT.a(5, new cdc(this, 1.25));
      this.bT.a(5, new chx.i());
      this.cU = new chx.e();
      this.bT.a(5, this.cU);
      this.cV = new chx.f();
      this.bT.a(6, this.cV);
      this.bT.a(7, new chx.g());
      this.bT.a(8, new chx.l());
      this.bT.a(9, new ccx(this));
      this.bU.a(1, new chx.h(this).a(new Class[0]));
      this.bU.a(2, new chx.c(this));
      this.bU.a(3, new cfc<>(this, true));
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      if (this.gq()) {
         $$0.a("hive_pos", vm.a(this.gr()));
      }

      if (this.t()) {
         $$0.a("flower_pos", vm.a(this.p()));
      }

      $$0.a("HasNectar", this.gA());
      $$0.a("HasStung", this.gB());
      $$0.a("TicksSincePollination", this.cI);
      $$0.a("CannotEnterHiveTicks", this.cJ);
      $$0.a("CropsGrownSincePollination", this.cK);
      this.a_($$0);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.x($$0.q("HasNectar"));
      this.y($$0.q("HasStung"));
      this.cI = $$0.h("TicksSincePollination");
      this.cJ = $$0.h("CannotEnterHiveTicks");
      this.cK = $$0.h("CropsGrownSincePollination");
      this.cS = vm.a($$0, "hive_pos").orElse(null);
      this.cR = vm.a($$0, "flower_pos").orElse(null);
      this.a(this.dW(), $$0);
   }

   @Override
   public boolean c(ash $$0, bvj $$1) {
      btz $$2 = this.dX().a((bwf)this);
      boolean $$3 = $$1.a($$0, $$2, (float)((int)this.h(bxn.c)));
      if ($$3) {
         dea.a($$0, $$1, $$2);
         if ($$1 instanceof bwf $$4) {
            $$4.p($$4.eV() + 1);
            int $$5 = 0;
            if (this.dW().al() == btf.c) {
               $$5 = 10;
            } else if (this.dW().al() == btf.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new buo(buq.s, $$5 * 20, 0), this);
            }
         }

         this.y(true);
         this.af_();
         this.a(axf.bS, 1.0F, 1.0F);
      }

      return $$3;
   }

   @Override
   public void h() {
      super.h();
      if (this.gA() && this.gL() < 10 && this.ae.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ae.a(2) + 1; $$0++) {
            this.a(this.dW(), this.dB() - 0.3F, this.dB() + 0.3F, this.dH() - 0.3F, this.dH() + 0.3F, this.e(0.5), ls.az);
         }
      }

      this.gJ();
   }

   private void a(dhh $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lq $$6) {
      $$0.a($$6, bae.d($$0.A.j(), $$1, $$2), $$5, bae.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(jh $$0) {
      fbx $$1 = fbx.c($$0);
      int $$2 = 0;
      jh $$3 = this.dw();
      int $$4 = (int)$$1.e - $$3.v();
      if ($$4 > 2) {
         $$2 = 4;
      } else if ($$4 < -2) {
         $$2 = -4;
      }

      int $$5 = 6;
      int $$6 = 8;
      int $$7 = $$3.k($$0);
      if ($$7 < 15) {
         $$5 = $$7 / 2;
         $$6 = $$7 / 2;
      }

      fbx $$8 = cgz.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bS.b(0.5F);
         this.bS.a($$8.d, $$8.e, $$8.f, 1.0);
      }
   }

   @Nullable
   public jh p() {
      return this.cR;
   }

   public boolean t() {
      return this.cR != null;
   }

   public void h(jh $$0) {
      this.cR = $$0;
   }

   @bbl
   public int x() {
      return Math.max(this.cU.d, this.cV.d);
   }

   @bbl
   public List<jh> go() {
      return this.cU.f;
   }

   private boolean gF() {
      return this.cI > 3600;
   }

   void gG() {
      this.cS = null;
      this.cM = 200;
   }

   void gH() {
      this.cR = null;
      this.cQ = bae.a(this.ae, 20, 60);
   }

   boolean gI() {
      if (this.cJ <= 0 && !this.cT.l() && !this.gB() && this.O_() == null) {
         boolean $$0 = this.gF() || c(this.dW()) || this.gA();
         return $$0 && !this.gK();
      } else {
         return false;
      }
   }

   public static boolean c(dhh $$0) {
      return $$0.G_().g() && ($$0.V() || $$0.af());
   }

   public void s(int $$0) {
      this.cJ = $$0;
   }

   public float J(float $$0) {
      return bae.h($$0, this.cG, this.cF);
   }

   private void gJ() {
      this.cG = this.cF;
      if (this.gP()) {
         this.cF = Math.min(1.0F, this.cF + 0.2F);
      } else {
         this.cF = Math.max(0.0F, this.cF - 0.24F);
      }
   }

   @Override
   protected void a(ash $$0) {
      boolean $$1 = this.gB();
      if (this.bm()) {
         this.cW++;
      } else {
         this.cW = 0;
      }

      if (this.cW > 20) {
         this.a($$0, this.dX().i(), 1.0F);
      }

      if ($$1) {
         this.cH++;
         if (this.cH % 5 == 0 && this.ae.a(bae.a(1200 - this.cH, 1, 1200)) == 0) {
            this.a($$0, this.dX().p(), this.eE());
         }
      }

      if (!this.gA()) {
         this.cI++;
      }

      this.a($$0, false);
   }

   public void gp() {
      this.cI = 0;
   }

   private boolean gK() {
      if (this.cS == null) {
         return false;
      } else {
         duw $$0 = this.dW().c_(this.cS);
         return $$0 instanceof dut && ((dut)$$0).b();
      }
   }

   @Override
   public int a() {
      return this.al.a(ck);
   }

   @Override
   public void a(int $$0) {
      this.al.a(ck, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cE;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cE = $$0;
   }

   @Override
   public void c() {
      this.a(cD.a(this.ae));
   }

   private boolean k(jh $$0) {
      duw $$1 = this.dW().c_($$0);
      return $$1 instanceof dut ? !((dut)$$1).d() : false;
   }

   @bbl
   public boolean gq() {
      return this.cS != null;
   }

   @Nullable
   @bbl
   public jh gr() {
      return this.cS;
   }

   @bbl
   public cde gs() {
      return this.bT;
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   int gL() {
      return this.cK;
   }

   private void gM() {
      this.cK = 0;
   }

   void gN() {
      this.cK++;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dW().C) {
         if (this.cJ > 0) {
            this.cJ--;
         }

         if (this.cM > 0) {
            this.cM--;
         }

         if (this.cQ > 0) {
            this.cQ--;
         }

         boolean $$0 = this.ad_() && !this.gB() && this.O_() != null && this.O_().g(this) < 4.0;
         this.z($$0);
         if (this.af % 20 == 0 && !this.gO()) {
            this.cS = null;
         }
      }
   }

   boolean gO() {
      if (!this.gq()) {
         return false;
      } else if (this.l(this.cS)) {
         return false;
      } else {
         duw $$0 = this.dW().c_(this.cS);
         return $$0 != null && $$0.q() == duy.I;
      }
   }

   public boolean gA() {
      return this.t(8);
   }

   void x(boolean $$0) {
      if ($$0) {
         this.gp();
      }

      this.d(8, $$0);
   }

   public boolean gB() {
      return this.t(4);
   }

   private void y(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gP() {
      return this.t(2);
   }

   private void z(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(jh $$0) {
      return !this.b($$0, 48);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.al.a(cj, (byte)(this.al.a(cj) | $$0));
      } else {
         this.al.a(cj, (byte)(this.al.a(cj) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.al.a(cj) & $$0) != 0;
   }

   public static bxm.a gC() {
      return chw.gt().a(bxn.s, 10.0).a(bxn.l, 0.6F).a(bxn.v, 0.3F).a(bxn.c, 2.0);
   }

   @Override
   protected cfr b(dhh $$0) {
      cfp $$1 = new cfp(this, $$0) {
         @Override
         public boolean a(jh $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!chx.this.cT.l()) {
               super.c();
            }
         }
      };
      $$1.b(false);
      $$1.a(false);
      $$1.c(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   public boolean j(cxo $$0) {
      return $$0.a(ayd.ao);
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
   }

   @Override
   protected axe u() {
      return null;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.bP;
   }

   @Override
   protected axe o_() {
      return axf.bO;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Nullable
   public chx b(ash $$0, bva $$1) {
      return bvq.l.a($$0, bvp.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxu $$2, jh $$3) {
   }

   @Override
   public boolean ba() {
      return this.gD() && this.af % ca == 0;
   }

   @Override
   public boolean gD() {
      return !this.aJ();
   }

   public void gE() {
      this.x(false);
      this.gM();
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.cT.m();
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(ayk<etv> $$0) {
      this.h(this.dz().b(0.0, 0.01, 0.0));
   }

   @Override
   public fbx cT() {
      return new fbx(0.0, (double)(0.5F * this.cS()), (double)(this.dr() * 0.2F));
   }

   boolean b(jh $$0, int $$1) {
      return $$0.a(this.dw(), (double)$$1);
   }

   public void i(jh $$0) {
      this.cS = $$0;
   }

   abstract class a extends cdd {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !chx.this.ad_();
      }

      @Override
      public boolean c() {
         return this.i() && !chx.this.ad_();
      }
   }

   class b extends cdn {
      b(final bwn $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && chx.this.ad_() && !chx.this.gB();
      }

      @Override
      public boolean c() {
         return super.c() && chx.this.ad_() && !chx.this.gB();
      }
   }

   static class c extends cew<cpw> {
      c(chx $$0) {
         super($$0, cpw.class, 10, true, false, $$0::a);
      }

      @Override
      public boolean b() {
         return this.i() && super.b();
      }

      @Override
      public boolean c() {
         boolean $$0 = this.i();
         if ($$0 && this.e.O_() != null) {
            return super.c();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         chx $$0 = (chx)this.e;
         return $$0.ad_() && !$$0.gB();
      }
   }

   class d extends chx.a {
      @Override
      public boolean h() {
         if (chx.this.gq() && chx.this.gI() && chx.this.cS.a(chx.this.du(), 2.0) && chx.this.dW().c_(chx.this.cS) instanceof dut $$1) {
            if (!$$1.d()) {
               return true;
            }

            chx.this.cS = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         if (chx.this.dW().c_(chx.this.cS) instanceof dut $$1) {
            $$1.a(chx.this);
         }
      }
   }

   @bbl
   public class e extends chx.a {
      public static final int b = 2400;
      int d = chx.this.dW().A.a(10);
      private static final int e = 3;
      final List<jh> f = Lists.newArrayList();
      @Nullable
      private euk g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(cdd.a.a));
      }

      @Override
      public boolean h() {
         return chx.this.cS != null && !chx.this.ga() && chx.this.gI() && !this.d(chx.this.cS) && chx.this.dW().a_(chx.this.cS).a(axu.aJ);
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void d() {
         this.d = 0;
         this.i = 0;
         super.d();
      }

      @Override
      public void e() {
         this.d = 0;
         this.i = 0;
         chx.this.bS.o();
         chx.this.bS.h();
      }

      @Override
      public void a() {
         if (chx.this.cS != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!chx.this.bS.n()) {
               if (!chx.this.b(chx.this.cS, 16)) {
                  if (chx.this.l(chx.this.cS)) {
                     chx.this.gG();
                  } else {
                     chx.this.j(chx.this.cS);
                  }
               } else {
                  boolean $$0 = this.a(chx.this.cS);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && chx.this.bS.k().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        chx.this.gG();
                        this.i = 0;
                     }
                  } else {
                     this.g = chx.this.bS.k();
                  }
               }
            }
         }
      }

      private boolean a(jh $$0) {
         int $$1 = chx.this.b(chx.this.cS, 3) ? 1 : 2;
         chx.this.bS.b(10.0F);
         chx.this.bS.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return chx.this.bS.k() != null && chx.this.bS.k().j();
      }

      boolean b(jh $$0) {
         return this.f.contains($$0);
      }

      private void c(jh $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (chx.this.cS != null) {
            this.c(chx.this.cS);
         }

         chx.this.gG();
      }

      private boolean d(jh $$0) {
         if (chx.this.b($$0, 2)) {
            return true;
         } else {
            euk $$1 = chx.this.bS.k();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends chx.a {
      private static final int c = 2400;
      int d = chx.this.dW().A.a(10);

      f() {
         this.a(EnumSet.of(cdd.a.a));
      }

      @Override
      public boolean h() {
         return chx.this.cR != null && !chx.this.ga() && this.k() && !chx.this.b(chx.this.cR, 2);
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void d() {
         this.d = 0;
         super.d();
      }

      @Override
      public void e() {
         this.d = 0;
         chx.this.bS.o();
         chx.this.bS.h();
      }

      @Override
      public void a() {
         if (chx.this.cR != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               chx.this.gH();
            } else if (!chx.this.bS.n()) {
               if (chx.this.l(chx.this.cR)) {
                  chx.this.gH();
               } else {
                  chx.this.j(chx.this.cR);
               }
            }
         }
      }

      private boolean k() {
         return chx.this.cI > 600;
      }
   }

   class g extends chx.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (chx.this.gL() >= 10) {
            return false;
         } else {
            return chx.this.ae.i() < 0.3F ? false : chx.this.gA() && chx.this.gO();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (chx.this.ae.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               jh $$1 = chx.this.dw().c($$0);
               dxu $$2 = chx.this.dW().a_($$1);
               dkl $$3 = $$2.b();
               dxu $$4 = null;
               if ($$2.a(axu.aL)) {
                  if ($$3 instanceof dmi) {
                     dmi $$5 = (dmi)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dsk) {
                     int $$6 = $$2.c(dsk.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dsk.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dkn.oD)) {
                     int $$7 = $$2.c(dsr.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dsr.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dkn.sQ) || $$2.a(dkn.sR)) {
                     dko $$8 = (dko)$$2.b();
                     if ($$8.b(chx.this.dW(), $$1, $$2)) {
                        $$8.a((ash)chx.this.dW(), chx.this.ae, $$1, $$2);
                        $$4 = chx.this.dW().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     chx.this.dW().c(2011, $$1, 15);
                     chx.this.dW().b($$1, $$4);
                     chx.this.gN();
                  }
               }
            }
         }
      }
   }

   class h extends cev {
      h(final chx $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return chx.this.ad_() && super.c();
      }

      @Override
      protected void a(bwh $$0, bwf $$1) {
         if ($$0 instanceof chx && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends chx.a {
      @Override
      public boolean h() {
         return chx.this.cM == 0 && !chx.this.gq() && chx.this.gI();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         chx.this.cM = 200;
         List<jh> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (jh $$1 : $$0) {
               if (!chx.this.cU.b($$1)) {
                  chx.this.cS = $$1;
                  return;
               }
            }

            chx.this.cU.k();
            chx.this.cS = $$0.get(0);
         }
      }

      private List<jh> k() {
         jh $$0 = chx.this.dw();
         chj $$1 = ((ash)chx.this.dW()).z();
         Stream<chk> $$2 = $$1.c($$0x -> $$0x.a(ayf.c), $$0, 20, chj.b.c);
         return $$2.map(chk::g).filter(chx.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends ccf {
      j(final bwh $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!chx.this.ad_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !chx.this.cT.l();
      }
   }

   class k extends chx.a {
      private static final int c = 400;
      private final Predicate<dxu> d = $$0 -> {
         if ($$0.b(dyk.D) && $$0.c(dyk.D)) {
            return false;
         } else if ($$0.a(axu.W)) {
            return $$0.a(dkn.iU) ? $$0.c(dmv.b) == dyp.a : true;
         } else {
            return false;
         }
      };
      private static final double e = 0.1;
      private static final int f = 25;
      private static final float g = 0.35F;
      private static final float h = 0.6F;
      private static final float i = 0.33333334F;
      private static final int j = 5;
      private int k;
      private int l;
      private boolean m;
      @Nullable
      private fbx n;
      private int o;
      private static final int p = 600;
      private Long2LongOpenHashMap q = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(cdd.a.a));
      }

      @Override
      public boolean h() {
         if (chx.this.cQ > 0) {
            return false;
         } else if (chx.this.gA()) {
            return false;
         } else if (chx.this.dW().af()) {
            return false;
         } else {
            Optional<jh> $$0 = this.p();
            if ($$0.isPresent()) {
               chx.this.cR = $$0.get();
               chx.this.bS.a((double)chx.this.cR.u() + 0.5, (double)chx.this.cR.v() + 0.5, (double)chx.this.cR.w() + 0.5, 1.2F);
               return true;
            } else {
               chx.this.cQ = bae.a(chx.this.ae, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.m) {
            return false;
         } else if (!chx.this.t()) {
            return false;
         } else if (chx.this.dW().af()) {
            return false;
         } else {
            return this.k() ? chx.this.ae.i() < 0.2F : true;
         }
      }

      private boolean k() {
         return this.k > 400;
      }

      boolean l() {
         return this.m;
      }

      void m() {
         this.m = false;
      }

      @Override
      public void d() {
         this.k = 0;
         this.o = 0;
         this.l = 0;
         this.m = true;
         chx.this.gp();
      }

      @Override
      public void e() {
         if (this.k()) {
            chx.this.x(true);
         }

         this.m = false;
         chx.this.bS.o();
         chx.this.cQ = 200;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (chx.this.t()) {
            this.o++;
            if (this.o > 600) {
               chx.this.gH();
               this.m = false;
               chx.this.cQ = 200;
            } else {
               fbx $$0 = fbx.c(chx.this.cR).b(0.0, 0.6F, 0.0);
               if ($$0.f(chx.this.du()) > 1.0) {
                  this.n = $$0;
                  this.n();
               } else {
                  if (this.n == null) {
                     this.n = $$0;
                  }

                  boolean $$1 = chx.this.du().f(this.n) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.o > 600) {
                     chx.this.gH();
                  } else {
                     if ($$1) {
                        boolean $$3 = chx.this.ae.a(25) == 0;
                        if ($$3) {
                           this.n = new fbx($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           chx.this.bS.o();
                        } else {
                           $$2 = false;
                        }

                        chx.this.H().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.k++;
                     if (chx.this.ae.i() < 0.05F && this.k > this.l + 60) {
                        this.l = this.k;
                        chx.this.a(axf.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         chx.this.I().a(this.n.a(), this.n.b(), this.n.c(), 0.35F);
      }

      private float o() {
         return (chx.this.ae.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<jh> p() {
         Iterable<jh> $$0 = jh.a(chx.this.dw(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (jh $$2 : $$0) {
            long $$3 = this.q.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (chx.this.dW().ac() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (this.d.test(chx.this.dW().a_($$2))) {
               euk $$4 = chx.this.bS.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), chx.this.dW().ac() + 600L);
            }
         }

         this.q = $$1;
         return Optional.empty();
      }
   }

   class l extends cdd {
      l() {
         this.a(EnumSet.of(cdd.a.a));
      }

      @Override
      public boolean b() {
         return chx.this.bS.m() && chx.this.ae.a(10) == 0;
      }

      @Override
      public boolean c() {
         return chx.this.bS.n();
      }

      @Override
      public void d() {
         fbx $$0 = this.h();
         if ($$0 != null) {
            chx.this.bS.a(chx.this.bS.a(jh.a((ka)$$0), 1), 1.0);
         }
      }

      @Nullable
      private fbx h() {
         fbx $$1;
         if (chx.this.gO() && !chx.this.b(chx.this.cS, this.i())) {
            fbx $$0 = fbx.b(chx.this.cS);
            $$1 = $$0.d(chx.this.du()).d();
         } else {
            $$1 = chx.this.g(0.0F);
         }

         int $$3 = 8;
         fbx $$4 = chc.a(chx.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cgy.a(chx.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !chx.this.gq() && !chx.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends chx.a {
      private final int c = bae.a(chx.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (chx.this.cR != null && chx.this.dW().p(chx.this.cR) && !this.a(chx.this.cR)) {
            chx.this.gH();
         }

         this.d = chx.this.dW().ac();
      }

      @Override
      public boolean h() {
         return chx.this.dW().ac() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(jh $$0) {
         return chx.this.dW().a_($$0).a(axu.W);
      }
   }

   class n extends chx.a {
      private final int c = bae.a(chx.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (chx.this.cS != null && chx.this.dW().p(chx.this.cS) && !chx.this.gO()) {
            chx.this.gG();
         }

         this.d = chx.this.dW().ac();
      }

      @Override
      public boolean h() {
         return chx.this.dW().ac() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
