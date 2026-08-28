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

public class chp extends cho implements bwc, chx {
   public static final float bZ = 120.32113F;
   public static final int ca = azu.f(1.4959966F);
   private static final aks<Byte> cj = akw.a(chp.class, aku.a);
   private static final aks<Integer> ck = akw.a(chp.class, aku.b);
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
   private static final bsl cD = baw.a(20, 39);
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
   int cQ = azu.a(this.ae, 20, 60);
   @Nullable
   jh cR;
   @Nullable
   jh cS;
   chp.k cT;
   chp.e cU;
   private chp.f cV;
   private int cW;

   public chp(bvi<? extends chp> $$0, dgz $$1) {
      super($$0, $$1);
      this.bQ = new cbv(this, 20, true);
      this.bP = new chp.j(this);
      this.a(euh.n, -1.0F);
      this.a(euh.j, -1.0F);
      this.a(euh.k, 16.0F);
      this.a(euh.x, -1.0F);
      this.a(euh.h, -1.0F);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(cj, (byte)0);
      $$0.a(ck, 0);
   }

   @Override
   public float a(jh $$0, dhc $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void B() {
      this.bT.a(0, new chp.b(this, 1.4F, true));
      this.bT.a(1, new chp.d());
      this.bT.a(2, new cch(this, 1.0));
      this.bT.a(3, new ced(this, 1.25, $$0 -> $$0.a(axt.ao), false));
      this.bT.a(3, new chp.n());
      this.bT.a(3, new chp.m());
      this.cT = new chp.k();
      this.bT.a(4, this.cT);
      this.bT.a(5, new ccu(this, 1.25));
      this.bT.a(5, new chp.i());
      this.cU = new chp.e();
      this.bT.a(5, this.cU);
      this.cV = new chp.f();
      this.bT.a(6, this.cV);
      this.bT.a(7, new chp.g());
      this.bT.a(8, new chp.l());
      this.bT.a(9, new ccp(this));
      this.bU.a(1, new chp.h(this).a(new Class[0]));
      this.bU.a(2, new chp.c(this));
      this.bU.a(3, new ceu<>(this, true));
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      if (this.gq()) {
         $$0.a("hive_pos", vb.a(this.gr()));
      }

      if (this.t()) {
         $$0.a("flower_pos", vb.a(this.p()));
      }

      $$0.a("HasNectar", this.gA());
      $$0.a("HasStung", this.gB());
      $$0.a("TicksSincePollination", this.cI);
      $$0.a("CannotEnterHiveTicks", this.cJ);
      $$0.a("CropsGrownSincePollination", this.cK);
      this.a_($$0);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.x($$0.q("HasNectar"));
      this.y($$0.q("HasStung"));
      this.cI = $$0.h("TicksSincePollination");
      this.cJ = $$0.h("CannotEnterHiveTicks");
      this.cK = $$0.h("CropsGrownSincePollination");
      this.cS = vb.a($$0, "hive_pos").orElse(null);
      this.cR = vb.a($$0, "flower_pos").orElse(null);
      this.a(this.dW(), $$0);
   }

   @Override
   public boolean c(arx $$0, bvb $$1) {
      btr $$2 = this.dX().a((bvx)this);
      boolean $$3 = $$1.a($$0, $$2, (float)((int)this.h(bxf.c)));
      if ($$3) {
         dds.a($$0, $$1, $$2);
         if ($$1 instanceof bvx $$4) {
            $$4.p($$4.eV() + 1);
            int $$5 = 0;
            if (this.dW().am() == bsx.c) {
               $$5 = 10;
            } else if (this.dW().am() == bsx.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new bug(bui.s, $$5 * 20, 0), this);
            }
         }

         this.y(true);
         this.af_();
         this.a(awv.bS, 1.0F, 1.0F);
      }

      return $$3;
   }

   @Override
   public void h() {
      super.h();
      if (this.gA() && this.gL() < 10 && this.ae.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ae.a(2) + 1; $$0++) {
            this.a(this.dW(), this.dB() - 0.3F, this.dB() + 0.3F, this.dH() - 0.3F, this.dH() + 0.3F, this.e(0.5), ls.aA);
         }
      }

      this.gJ();
   }

   private void a(dgz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lq $$6) {
      $$0.a($$6, azu.d($$0.A.j(), $$1, $$2), $$5, azu.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(jh $$0) {
      fbr $$1 = fbr.c($$0);
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

      fbr $$8 = cgr.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
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

   @bbb
   public int x() {
      return Math.max(this.cU.d, this.cV.d);
   }

   @bbb
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
      this.cQ = azu.a(this.ae, 20, 60);
   }

   boolean gI() {
      if (this.cJ <= 0 && !this.cT.l() && !this.gB() && this.O_() == null) {
         boolean $$0 = this.gF() || c(this.dW()) || this.gA();
         return $$0 && !this.gK();
      } else {
         return false;
      }
   }

   public static boolean c(dgz $$0) {
      return $$0.G_().g() && ($$0.W() || $$0.ag());
   }

   public void s(int $$0) {
      this.cJ = $$0;
   }

   public float J(float $$0) {
      return azu.h($$0, this.cG, this.cF);
   }

   private void gJ() {
      this.cG = this.cF;
      if (this.gQ()) {
         this.cF = Math.min(1.0F, this.cF + 0.2F);
      } else {
         this.cF = Math.max(0.0F, this.cF - 0.24F);
      }
   }

   @Override
   protected void a(arx $$0) {
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
         if (this.cH % 5 == 0 && this.ae.a(azu.a(1200 - this.cH, 1, 1200)) == 0) {
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
      dun $$0 = this.gO();
      return $$0 != null && $$0.b();
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
      duq $$1 = this.dW().c_($$0);
      return $$1 instanceof dun ? !((dun)$$1).d() : false;
   }

   @bbb
   public boolean gq() {
      return this.cS != null;
   }

   @Nullable
   @bbb
   public jh gr() {
      return this.cS;
   }

   @bbb
   public ccw gs() {
      return this.bT;
   }

   @Override
   protected void Y() {
      super.Y();
      agy.a(this);
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
         if (this.af % 20 == 0 && !this.gP()) {
            this.cS = null;
         }
      }
   }

   @Nullable
   dun gO() {
      if (this.cS == null) {
         return null;
      } else {
         return this.l(this.cS) ? null : this.dW().a(this.cS, dus.I).orElse(null);
      }
   }

   boolean gP() {
      return this.gO() != null;
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

   private boolean gQ() {
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

   public static bxe.a gC() {
      return cho.gt().a(bxf.s, 10.0).a(bxf.l, 0.6F).a(bxf.v, 0.3F).a(bxf.c, 2.0);
   }

   @Override
   protected cfj b(dgz $$0) {
      cfh $$1 = new cfh(this, $$0) {
         @Override
         public boolean a(jh $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!chp.this.cT.l()) {
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
   public bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      if ($$2.h() instanceof cvm $$3 && $$3.d() instanceof dng $$4) {
         bug $$5 = $$4.b();
         if ($$5 != null) {
            this.a($$0, $$1, $$2);
            if (!this.dW().C) {
               this.a($$5);
            }

            return bta.a;
         }
      }

      return super.b($$0, $$1);
   }

   @Override
   public boolean j(cxg $$0) {
      return $$0.a(axt.ao);
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
   }

   @Override
   protected awu u() {
      return null;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.bP;
   }

   @Override
   protected awu o_() {
      return awv.bO;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Nullable
   public chp b(arx $$0, bus $$1) {
      return bvi.l.a($$0, bvh.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxo $$2, jh $$3) {
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
   public boolean a(arx $$0, btr $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.cT.m();
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(aya<etp> $$0) {
      this.h(this.dz().b(0.0, 0.01, 0.0));
   }

   @Override
   public fbr cT() {
      return new fbr(0.0, (double)(0.5F * this.cS()), (double)(this.dr() * 0.2F));
   }

   boolean b(jh $$0, int $$1) {
      return $$0.a(this.dw(), (double)$$1);
   }

   public void i(jh $$0) {
      this.cS = $$0;
   }

   abstract class a extends ccv {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !chp.this.ad_();
      }

      @Override
      public boolean c() {
         return this.i() && !chp.this.ad_();
      }
   }

   class b extends cdf {
      b(final bwf $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && chp.this.ad_() && !chp.this.gB();
      }

      @Override
      public boolean c() {
         return super.c() && chp.this.ad_() && !chp.this.gB();
      }
   }

   static class c extends ceo<cpo> {
      c(chp $$0) {
         super($$0, cpo.class, 10, true, false, $$0::a);
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
         chp $$0 = (chp)this.e;
         return $$0.ad_() && !$$0.gB();
      }
   }

   class d extends chp.a {
      @Override
      public boolean h() {
         if (chp.this.cS != null && chp.this.gI() && chp.this.cS.a(chp.this.du(), 2.0)) {
            dun $$0 = chp.this.gO();
            if ($$0 != null) {
               if (!$$0.d()) {
                  return true;
               }

               chp.this.cS = null;
            }
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         dun $$0 = chp.this.gO();
         if ($$0 != null) {
            $$0.a(chp.this);
         }
      }
   }

   @bbb
   public class e extends chp.a {
      public static final int b = 2400;
      int d = chp.this.dW().A.a(10);
      private static final int e = 3;
      final List<jh> f = Lists.newArrayList();
      @Nullable
      private eue g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(ccv.a.a));
      }

      @Override
      public boolean h() {
         return chp.this.cS != null
            && !chp.this.l(chp.this.cS)
            && !chp.this.ga()
            && chp.this.gI()
            && !this.d(chp.this.cS)
            && chp.this.dW().a_(chp.this.cS).a(axk.aJ);
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
         chp.this.bS.o();
         chp.this.bS.h();
      }

      @Override
      public void a() {
         if (chp.this.cS != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!chp.this.bS.n()) {
               if (!chp.this.b(chp.this.cS, 16)) {
                  if (chp.this.l(chp.this.cS)) {
                     chp.this.gG();
                  } else {
                     chp.this.j(chp.this.cS);
                  }
               } else {
                  boolean $$0 = this.a(chp.this.cS);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && chp.this.bS.k().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        chp.this.gG();
                        this.i = 0;
                     }
                  } else {
                     this.g = chp.this.bS.k();
                  }
               }
            }
         }
      }

      private boolean a(jh $$0) {
         int $$1 = chp.this.b($$0, 3) ? 1 : 2;
         chp.this.bS.b(10.0F);
         chp.this.bS.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return chp.this.bS.k() != null && chp.this.bS.k().j();
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
         if (chp.this.cS != null) {
            this.c(chp.this.cS);
         }

         chp.this.gG();
      }

      private boolean d(jh $$0) {
         if (chp.this.b($$0, 2)) {
            return true;
         } else {
            eue $$1 = chp.this.bS.k();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends chp.a {
      private static final int c = 2400;
      int d = chp.this.dW().A.a(10);

      f() {
         this.a(EnumSet.of(ccv.a.a));
      }

      @Override
      public boolean h() {
         return chp.this.cR != null && !chp.this.ga() && this.k() && !chp.this.b(chp.this.cR, 2);
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
         chp.this.bS.o();
         chp.this.bS.h();
      }

      @Override
      public void a() {
         if (chp.this.cR != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               chp.this.gH();
            } else if (!chp.this.bS.n()) {
               if (chp.this.l(chp.this.cR)) {
                  chp.this.gH();
               } else {
                  chp.this.j(chp.this.cR);
               }
            }
         }
      }

      private boolean k() {
         return chp.this.cI > 600;
      }
   }

   class g extends chp.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (chp.this.gL() >= 10) {
            return false;
         } else {
            return chp.this.ae.i() < 0.3F ? false : chp.this.gA() && chp.this.gP();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (chp.this.ae.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               jh $$1 = chp.this.dw().c($$0);
               dxo $$2 = chp.this.dW().a_($$1);
               dkd $$3 = $$2.b();
               dxo $$4 = null;
               if ($$2.a(axk.aL)) {
                  if ($$3 instanceof dlz) {
                     dlz $$5 = (dlz)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dse) {
                     int $$6 = $$2.c(dse.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dse.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dkf.oK)) {
                     int $$7 = $$2.c(dsl.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dsl.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dkf.sX) || $$2.a(dkf.sY)) {
                     dkg $$8 = (dkg)$$2.b();
                     if ($$8.b(chp.this.dW(), $$1, $$2)) {
                        $$8.a((arx)chp.this.dW(), chp.this.ae, $$1, $$2);
                        $$4 = chp.this.dW().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     chp.this.dW().c(2011, $$1, 15);
                     chp.this.dW().b($$1, $$4);
                     chp.this.gN();
                  }
               }
            }
         }
      }
   }

   class h extends cen {
      h(final chp $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return chp.this.ad_() && super.c();
      }

      @Override
      protected void a(bvz $$0, bvx $$1) {
         if ($$0 instanceof chp && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends chp.a {
      @Override
      public boolean h() {
         return chp.this.cM == 0 && !chp.this.gq() && chp.this.gI();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         chp.this.cM = 200;
         List<jh> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (jh $$1 : $$0) {
               if (!chp.this.cU.b($$1)) {
                  chp.this.cS = $$1;
                  return;
               }
            }

            chp.this.cU.k();
            chp.this.cS = $$0.get(0);
         }
      }

      private List<jh> k() {
         jh $$0 = chp.this.dw();
         chb $$1 = ((arx)chp.this.dW()).A();
         Stream<chc> $$2 = $$1.c($$0x -> $$0x.a(axv.c), $$0, 20, chb.b.c);
         return $$2.map(chc::g).filter(chp.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends cbx {
      j(final bvz $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!chp.this.ad_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !chp.this.cT.l();
      }
   }

   class k extends chp.a {
      private static final int c = 400;
      private final Predicate<dxo> d = $$0 -> {
         if ($$0.b(dye.J) && $$0.c(dye.J)) {
            return false;
         } else if ($$0.a(axk.W)) {
            return $$0.a(dkf.jb) ? $$0.c(dmm.b) == dyj.a : true;
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
      private fbr n;
      private int o;
      private static final int p = 600;
      private Long2LongOpenHashMap q = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(ccv.a.a));
      }

      @Override
      public boolean h() {
         if (chp.this.cQ > 0) {
            return false;
         } else if (chp.this.gA()) {
            return false;
         } else if (chp.this.dW().ag()) {
            return false;
         } else {
            Optional<jh> $$0 = this.p();
            if ($$0.isPresent()) {
               chp.this.cR = $$0.get();
               chp.this.bS.a((double)chp.this.cR.u() + 0.5, (double)chp.this.cR.v() + 0.5, (double)chp.this.cR.w() + 0.5, 1.2F);
               return true;
            } else {
               chp.this.cQ = azu.a(chp.this.ae, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.m) {
            return false;
         } else if (!chp.this.t()) {
            return false;
         } else if (chp.this.dW().ag()) {
            return false;
         } else {
            return this.k() ? chp.this.ae.i() < 0.2F : true;
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
         chp.this.gp();
      }

      @Override
      public void e() {
         if (this.k()) {
            chp.this.x(true);
         }

         this.m = false;
         chp.this.bS.o();
         chp.this.cQ = 200;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (chp.this.t()) {
            this.o++;
            if (this.o > 600) {
               chp.this.gH();
               this.m = false;
               chp.this.cQ = 200;
            } else {
               fbr $$0 = fbr.c(chp.this.cR).b(0.0, 0.6F, 0.0);
               if ($$0.f(chp.this.du()) > 1.0) {
                  this.n = $$0;
                  this.n();
               } else {
                  if (this.n == null) {
                     this.n = $$0;
                  }

                  boolean $$1 = chp.this.du().f(this.n) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.o > 600) {
                     chp.this.gH();
                  } else {
                     if ($$1) {
                        boolean $$3 = chp.this.ae.a(25) == 0;
                        if ($$3) {
                           this.n = new fbr($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           chp.this.bS.o();
                        } else {
                           $$2 = false;
                        }

                        chp.this.H().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.k++;
                     if (chp.this.ae.i() < 0.05F && this.k > this.l + 60) {
                        this.l = this.k;
                        chp.this.a(awv.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         chp.this.I().a(this.n.a(), this.n.b(), this.n.c(), 0.35F);
      }

      private float o() {
         return (chp.this.ae.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<jh> p() {
         Iterable<jh> $$0 = jh.a(chp.this.dw(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (jh $$2 : $$0) {
            long $$3 = this.q.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (chp.this.dW().ad() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (this.d.test(chp.this.dW().a_($$2))) {
               eue $$4 = chp.this.bS.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), chp.this.dW().ad() + 600L);
            }
         }

         this.q = $$1;
         return Optional.empty();
      }
   }

   class l extends ccv {
      l() {
         this.a(EnumSet.of(ccv.a.a));
      }

      @Override
      public boolean b() {
         return chp.this.bS.m() && chp.this.ae.a(10) == 0;
      }

      @Override
      public boolean c() {
         return chp.this.bS.n();
      }

      @Override
      public void d() {
         fbr $$0 = this.h();
         if ($$0 != null) {
            chp.this.bS.a(chp.this.bS.a(jh.a((ka)$$0), 1), 1.0);
         }
      }

      @Nullable
      private fbr h() {
         fbr $$1;
         if (chp.this.gP() && !chp.this.b(chp.this.cS, this.i())) {
            fbr $$0 = fbr.b(chp.this.cS);
            $$1 = $$0.d(chp.this.du()).d();
         } else {
            $$1 = chp.this.g(0.0F);
         }

         int $$3 = 8;
         fbr $$4 = cgu.a(chp.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cgq.a(chp.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !chp.this.gq() && !chp.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends chp.a {
      private final int c = azu.a(chp.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (chp.this.cR != null && chp.this.dW().p(chp.this.cR) && !this.a(chp.this.cR)) {
            chp.this.gH();
         }

         this.d = chp.this.dW().ad();
      }

      @Override
      public boolean h() {
         return chp.this.dW().ad() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(jh $$0) {
         return chp.this.dW().a_($$0).a(axk.W);
      }
   }

   class n extends chp.a {
      private final int c = azu.a(chp.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (chp.this.cS != null && chp.this.dW().p(chp.this.cS) && !chp.this.gP()) {
            chp.this.gG();
         }

         this.d = chp.this.dW().ad();
      }

      @Override
      public boolean h() {
         return chp.this.dW().ad() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
