import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cih extends cig implements bww, cip {
   public static final float bE = 120.32113F;
   public static final int bF = azk.f(1.4959966F);
   private static final akg<Byte> bO = akk.a(cih.class, aki.a);
   private static final akg<Integer> bP = akk.a(cih.class, aki.b);
   private static final int bQ = 2;
   private static final int bR = 4;
   private static final int bS = 8;
   private static final int bT = 1200;
   private static final int bU = 600;
   private static final int bV = 3600;
   private static final int bW = 4;
   private static final int bX = 10;
   private static final int bY = 10;
   private static final int bZ = 18;
   private static final int ca = 48;
   private static final int cb = 2;
   private static final int cc = 24;
   private static final int cd = 16;
   private static final int ce = 16;
   private static final int cf = 20;
   public static final String bG = "CropsGrownSincePollination";
   public static final String bI = "CannotEnterHiveTicks";
   public static final String bJ = "TicksSincePollination";
   public static final String bK = "HasStung";
   public static final String bL = "HasNectar";
   public static final String bM = "flower_pos";
   public static final String bN = "hive_pos";
   private static final btb cg = bam.a(20, 39);
   @Nullable
   private UUID ch;
   private float ci;
   private float cj;
   private int ck;
   int cl;
   private int co;
   private int cp;
   private static final int cq = 200;
   int cr;
   private static final int cs = 200;
   private static final int ct = 20;
   private static final int cu = 60;
   int cv = azk.a(this.ae, 20, 60);
   @Nullable
   jj cw;
   @Nullable
   jj cx;
   cih.k cy;
   cih.e cz;
   private cih.f cA;
   private int cB;

   public cih(bwb<? extends cih> $$0, dhp $$1) {
      super($$0, $$1);
      this.by = new ccn(this, 20, true);
      this.bx = new cih.j(this);
      this.a(evk.n, -1.0F);
      this.a(evk.j, -1.0F);
      this.a(evk.k, 16.0F);
      this.a(evk.x, -1.0F);
      this.a(evk.h, -1.0F);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bO, (byte)0);
      $$0.a(bP, 0);
   }

   @Override
   public float a(jj $$0, dhs $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void D() {
      this.bB.a(0, new cih.b(this, 1.4F, true));
      this.bB.a(1, new cih.d());
      this.bB.a(2, new ccz(this, 1.0));
      this.bB.a(3, new cev(this, 1.25, $$0 -> $$0.a(axi.am), false));
      this.bB.a(3, new cih.n());
      this.bB.a(3, new cih.m());
      this.cy = new cih.k();
      this.bB.a(4, this.cy);
      this.bB.a(5, new cdm(this, 1.25));
      this.bB.a(5, new cih.i());
      this.cz = new cih.e();
      this.bB.a(5, this.cz);
      this.cA = new cih.f();
      this.bB.a(6, this.cA);
      this.bB.a(7, new cih.g());
      this.bB.a(8, new cih.l());
      this.bB.a(9, new cdh(this));
      this.bC.a(1, new cih.h(this).a(new Class[0]));
      this.bC.a(2, new cih.c(this));
      this.bC.a(3, new cfm<>(this, true));
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      if (this.gs()) {
         $$0.a("hive_pos", ul.a(this.gt()));
      }

      if (this.t()) {
         $$0.a("flower_pos", ul.a(this.q()));
      }

      $$0.a("HasNectar", this.gC());
      $$0.a("HasStung", this.gD());
      $$0.a("TicksSincePollination", this.cl);
      $$0.a("CannotEnterHiveTicks", this.co);
      $$0.a("CropsGrownSincePollination", this.cp);
      this.a_($$0);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cl = $$0.h("TicksSincePollination");
      this.co = $$0.h("CannotEnterHiveTicks");
      this.cp = $$0.h("CropsGrownSincePollination");
      this.cx = ul.a($$0, "hive_pos").orElse(null);
      this.cw = ul.a($$0, "flower_pos").orElse(null);
      this.a(this.dV(), $$0);
   }

   @Override
   public boolean c(arn $$0, bvs $$1) {
      buh $$2 = this.dW().a((bwr)this);
      boolean $$3 = $$1.a($$0, $$2, (float)((int)this.h(bxx.c)));
      if ($$3) {
         dej.a($$0, $$1, $$2);
         if ($$1 instanceof bwr $$4) {
            $$4.p($$4.eW() + 1);
            int $$5 = 0;
            if (this.dV().an() == btn.c) {
               $$5 = 10;
            } else if (this.dV().an() == btn.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new buw(buy.s, $$5 * 20, 0), this);
            }
         }

         this.x(true);
         this.V_();
         this.a(awk.bS, 1.0F, 1.0F);
      }

      return $$3;
   }

   @Override
   public void h() {
      super.h();
      if (this.gC() && this.gN() < 10 && this.ae.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ae.a(2) + 1; $$0++) {
            this.a(this.dV(), this.dA() - 0.3F, this.dA() + 0.3F, this.dG() - 0.3F, this.dG() + 0.3F, this.e(0.5), lv.aB);
         }
      }

      this.gL();
   }

   private void a(dhp $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lt $$6) {
      $$0.a($$6, azk.d($$0.A.j(), $$1, $$2), $$5, azk.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void k(jj $$0) {
      fcu $$1 = fcu.c($$0);
      int $$2 = 0;
      jj $$3 = this.dv();
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

      fcu $$8 = chj.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bA.b(0.5F);
         this.bA.a($$8.d, $$8.e, $$8.f, 1.0);
      }
   }

   @Nullable
   public jj q() {
      return this.cw;
   }

   public boolean t() {
      return this.cw != null;
   }

   public void i(jj $$0) {
      this.cw = $$0;
   }

   @bar
   public int x() {
      return Math.max(this.cz.d, this.cA.d);
   }

   @bar
   public List<jj> gq() {
      return this.cz.f;
   }

   private boolean gH() {
      return this.cl > 3600;
   }

   void gI() {
      this.cx = null;
      this.cr = 200;
   }

   void gJ() {
      this.cw = null;
      this.cv = azk.a(this.ae, 20, 60);
   }

   boolean gK() {
      if (this.co <= 0 && !this.cy.l() && !this.gD() && this.f() == null) {
         boolean $$0 = this.gH() || c(this.dV()) || this.gC();
         return $$0 && !this.gM();
      } else {
         return false;
      }
   }

   public static boolean c(dhp $$0) {
      return $$0.B_().g() && ($$0.W() || $$0.ah());
   }

   public void s(int $$0) {
      this.co = $$0;
   }

   public float K(float $$0) {
      return azk.h($$0, this.cj, this.ci);
   }

   private void gL() {
      this.cj = this.ci;
      if (this.gS()) {
         this.ci = Math.min(1.0F, this.ci + 0.2F);
      } else {
         this.ci = Math.max(0.0F, this.ci - 0.24F);
      }
   }

   @Override
   protected void a(arn $$0) {
      boolean $$1 = this.gD();
      if (this.bj()) {
         this.cB++;
      } else {
         this.cB = 0;
      }

      if (this.cB > 20) {
         this.a($$0, this.dW().i(), 1.0F);
      }

      if ($$1) {
         this.ck++;
         if (this.ck % 5 == 0 && this.ae.a(azk.a(1200 - this.ck, 1, 1200)) == 0) {
            this.a($$0, this.dW().p(), this.eF());
         }
      }

      if (!this.gC()) {
         this.cl++;
      }

      this.a($$0, false);
   }

   public void gr() {
      this.cl = 0;
   }

   private boolean gM() {
      dvi $$0 = this.gQ();
      return $$0 != null && $$0.a();
   }

   @Override
   public int a() {
      return this.al.a(bP);
   }

   @Override
   public void a(int $$0) {
      this.al.a(bP, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ch;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ch = $$0;
   }

   @Override
   public void c() {
      this.a(cg.a(this.ae));
   }

   private boolean l(jj $$0) {
      dvl $$1 = this.dV().c_($$0);
      return $$1 instanceof dvi ? !((dvi)$$1).d() : false;
   }

   @bar
   public boolean gs() {
      return this.cx != null;
   }

   @Nullable
   @bar
   public jj gt() {
      return this.cx;
   }

   @bar
   public cdo gu() {
      return this.bB;
   }

   @Override
   protected void ab() {
      super.ab();
      agj.a(this);
   }

   int gN() {
      return this.cp;
   }

   private void gO() {
      this.cp = 0;
   }

   void gP() {
      this.cp++;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C) {
         if (this.co > 0) {
            this.co--;
         }

         if (this.cr > 0) {
            this.cr--;
         }

         if (this.cv > 0) {
            this.cv--;
         }

         boolean $$0 = this.W_() && !this.gD() && this.f() != null && this.f().g(this) < 4.0;
         this.y($$0);
         if (this.af % 20 == 0 && !this.gR()) {
            this.cx = null;
         }
      }
   }

   @Nullable
   dvi gQ() {
      if (this.cx == null) {
         return null;
      } else {
         return this.m(this.cx) ? null : this.dV().a(this.cx, dvn.I).orElse(null);
      }
   }

   boolean gR() {
      return this.gQ() != null;
   }

   public boolean gC() {
      return this.t(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gr();
      }

      this.d(8, $$0);
   }

   public boolean gD() {
      return this.t(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gS() {
      return this.t(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean m(jj $$0) {
      return !this.b($$0, 48);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.al.a(bO, (byte)(this.al.a(bO) | $$0));
      } else {
         this.al.a(bO, (byte)(this.al.a(bO) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.al.a(bO) & $$0) != 0;
   }

   public static bxw.a gE() {
      return cig.gv().a(bxx.s, 10.0).a(bxx.l, 0.6F).a(bxx.v, 0.3F).a(bxx.c, 2.0);
   }

   @Override
   protected cgb b(dhp $$0) {
      cfz $$1 = new cfz(this, $$0) {
         @Override
         public boolean a(jj $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!cih.this.cy.l()) {
               super.c();
            }
         }
      };
      $$1.b(false);
      $$1.a(false);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if (this.k($$2) && $$2.h() instanceof cwf $$3 && $$3.d() instanceof dny $$4) {
         buw $$5 = $$4.b();
         if ($$5 != null) {
            this.a($$0, $$1, $$2);
            if (!this.dV().C) {
               this.a($$5);
            }

            return btq.a;
         }
      }

      return super.b($$0, $$1);
   }

   @Override
   public boolean k(cxy $$0) {
      return $$0.a(axi.am);
   }

   @Override
   protected void b(jj $$0, dym $$1) {
   }

   @Override
   protected awj u() {
      return null;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.bP;
   }

   @Override
   protected awj l_() {
      return awk.bO;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Nullable
   public cih b(arn $$0, bvi $$1) {
      return bwb.l.a($$0, bwa.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, dym $$2, jj $$3) {
   }

   @Override
   public boolean ba() {
      return this.gF() && this.af % bF == 0;
   }

   @Override
   public boolean gF() {
      return !this.aJ();
   }

   public void gG() {
      this.w(false);
      this.gO();
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.cy.m();
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(axp<eus> $$0) {
      this.i(this.dy().b(0.0, 0.01, 0.0));
   }

   @Override
   public fcu cT() {
      return new fcu(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.2F));
   }

   boolean b(jj $$0, int $$1) {
      return $$0.a(this.dv(), (double)$$1);
   }

   public void j(jj $$0) {
      this.cx = $$0;
   }

   public static boolean c(dym $$0) {
      if ($$0.a(awz.W)) {
         if ($$0.a(dzc.I, Boolean.valueOf(false))) {
            return false;
         } else {
            return $$0.a(dkw.jb) ? $$0.c(dnd.b) == dzi.a : true;
         }
      } else {
         return false;
      }
   }

   abstract class a extends cdn {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cih.this.W_();
      }

      @Override
      public boolean c() {
         return this.i() && !cih.this.W_();
      }
   }

   class b extends cdx {
      b(final bwz $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cih.this.W_() && !cih.this.gD();
      }

      @Override
      public boolean c() {
         return super.c() && cih.this.W_() && !cih.this.gD();
      }
   }

   static class c extends cfg<cqi> {
      c(cih $$0) {
         super($$0, cqi.class, 10, true, false, $$0::a);
      }

      @Override
      public boolean b() {
         return this.i() && super.b();
      }

      @Override
      public boolean c() {
         boolean $$0 = this.i();
         if ($$0 && this.e.f() != null) {
            return super.c();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         cih $$0 = (cih)this.e;
         return $$0.W_() && !$$0.gD();
      }
   }

   class d extends cih.a {
      @Override
      public boolean h() {
         if (cih.this.cx != null && cih.this.gK() && cih.this.cx.a(cih.this.dt(), 2.0)) {
            dvi $$0 = cih.this.gQ();
            if ($$0 != null) {
               if (!$$0.d()) {
                  return true;
               }

               cih.this.cx = null;
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
         dvi $$0 = cih.this.gQ();
         if ($$0 != null) {
            $$0.a(cih.this);
         }
      }
   }

   @bar
   public class e extends cih.a {
      public static final int b = 2400;
      int d = cih.this.dV().A.a(10);
      private static final int e = 3;
      final List<jj> f = Lists.newArrayList();
      @Nullable
      private evh g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(cdn.a.a));
      }

      @Override
      public boolean h() {
         return cih.this.cx != null
            && !cih.this.m(cih.this.cx)
            && !cih.this.ge()
            && cih.this.gK()
            && !this.d(cih.this.cx)
            && cih.this.dV().a_(cih.this.cx).a(awz.aJ);
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
         cih.this.bA.m();
         cih.this.bA.f();
      }

      @Override
      public void a() {
         if (cih.this.cx != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!cih.this.bA.l()) {
               if (!cih.this.b(cih.this.cx, 16)) {
                  if (cih.this.m(cih.this.cx)) {
                     cih.this.gI();
                  } else {
                     cih.this.k(cih.this.cx);
                  }
               } else {
                  boolean $$0 = this.a(cih.this.cx);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cih.this.bA.i().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        cih.this.gI();
                        this.i = 0;
                     }
                  } else {
                     this.g = cih.this.bA.i();
                  }
               }
            }
         }
      }

      private boolean a(jj $$0) {
         int $$1 = cih.this.b($$0, 3) ? 1 : 2;
         cih.this.bA.b(10.0F);
         cih.this.bA.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return cih.this.bA.i() != null && cih.this.bA.i().j();
      }

      boolean b(jj $$0) {
         return this.f.contains($$0);
      }

      private void c(jj $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cih.this.cx != null) {
            this.c(cih.this.cx);
         }

         cih.this.gI();
      }

      private boolean d(jj $$0) {
         if (cih.this.b($$0, 2)) {
            return true;
         } else {
            evh $$1 = cih.this.bA.i();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cih.a {
      private static final int c = 2400;
      int d = cih.this.dV().A.a(10);

      f() {
         this.a(EnumSet.of(cdn.a.a));
      }

      @Override
      public boolean h() {
         return cih.this.cw != null && !cih.this.ge() && this.k() && !cih.this.b(cih.this.cw, 2);
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
         cih.this.bA.m();
         cih.this.bA.f();
      }

      @Override
      public void a() {
         if (cih.this.cw != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               cih.this.gJ();
            } else if (!cih.this.bA.l()) {
               if (cih.this.m(cih.this.cw)) {
                  cih.this.gJ();
               } else {
                  cih.this.k(cih.this.cw);
               }
            }
         }
      }

      private boolean k() {
         return cih.this.cl > 600;
      }
   }

   class g extends cih.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cih.this.gN() >= 10) {
            return false;
         } else {
            return cih.this.ae.i() < 0.3F ? false : cih.this.gC() && cih.this.gR();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cih.this.ae.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               jj $$1 = cih.this.dv().c($$0);
               dym $$2 = cih.this.dV().a_($$1);
               dku $$3 = $$2.b();
               dym $$4 = null;
               if ($$2.a(awz.aL)) {
                  if ($$3 instanceof dmq) {
                     dmq $$5 = (dmq)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dsw) {
                     int $$6 = $$2.c(dsw.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dsw.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dkw.oK)) {
                     int $$7 = $$2.c(dtd.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dtd.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dkw.sZ) || $$2.a(dkw.ta)) {
                     dkx $$8 = (dkx)$$2.b();
                     if ($$8.a(cih.this.dV(), $$1, $$2)) {
                        $$8.a((arn)cih.this.dV(), cih.this.ae, $$1, $$2);
                        $$4 = cih.this.dV().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cih.this.dV().c(2011, $$1, 15);
                     cih.this.dV().b($$1, $$4);
                     cih.this.gP();
                  }
               }
            }
         }
      }
   }

   class h extends cff {
      h(final cih $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cih.this.W_() && super.c();
      }

      @Override
      protected void a(bwt $$0, bwr $$1) {
         if ($$0 instanceof cih && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cih.a {
      @Override
      public boolean h() {
         return cih.this.cr == 0 && !cih.this.gs() && cih.this.gK();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cih.this.cr = 200;
         List<jj> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (jj $$1 : $$0) {
               if (!cih.this.cz.b($$1)) {
                  cih.this.cx = $$1;
                  return;
               }
            }

            cih.this.cz.k();
            cih.this.cx = $$0.get(0);
         }
      }

      private List<jj> k() {
         jj $$0 = cih.this.dv();
         cht $$1 = ((arn)cih.this.dV()).A();
         Stream<chu> $$2 = $$1.c($$0x -> $$0x.a(axk.c), $$0, 20, cht.b.c);
         return $$2.map(chu::g).filter(cih.this::l).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends ccp {
      j(final bwt $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cih.this.W_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cih.this.cy.l();
      }
   }

   class k extends cih.a {
      private static final int c = 400;
      private static final double d = 0.1;
      private static final int e = 25;
      private static final float f = 0.35F;
      private static final float g = 0.6F;
      private static final float h = 0.33333334F;
      private static final int i = 5;
      private int j;
      private int k;
      private boolean l;
      @Nullable
      private fcu m;
      private int n;
      private static final int o = 600;
      private Long2LongOpenHashMap p = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(cdn.a.a));
      }

      @Override
      public boolean h() {
         if (cih.this.cv > 0) {
            return false;
         } else if (cih.this.gC()) {
            return false;
         } else if (cih.this.dV().ah()) {
            return false;
         } else {
            Optional<jj> $$0 = this.p();
            if ($$0.isPresent()) {
               cih.this.cw = $$0.get();
               cih.this.bA.a((double)cih.this.cw.u() + 0.5, (double)cih.this.cw.v() + 0.5, (double)cih.this.cw.w() + 0.5, 1.2F);
               return true;
            } else {
               cih.this.cv = azk.a(cih.this.ae, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.l) {
            return false;
         } else if (!cih.this.t()) {
            return false;
         } else if (cih.this.dV().ah()) {
            return false;
         } else {
            return this.k() ? cih.this.ae.i() < 0.2F : true;
         }
      }

      private boolean k() {
         return this.j > 400;
      }

      boolean l() {
         return this.l;
      }

      void m() {
         this.l = false;
      }

      @Override
      public void d() {
         this.j = 0;
         this.n = 0;
         this.k = 0;
         this.l = true;
         cih.this.gr();
      }

      @Override
      public void e() {
         if (this.k()) {
            cih.this.w(true);
         }

         this.l = false;
         cih.this.bA.m();
         cih.this.cv = 200;
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         if (cih.this.t()) {
            this.n++;
            if (this.n > 600) {
               cih.this.gJ();
               this.l = false;
               cih.this.cv = 200;
            } else {
               fcu $$0 = fcu.c(cih.this.cw).b(0.0, 0.6F, 0.0);
               if ($$0.f(cih.this.dt()) > 1.0) {
                  this.m = $$0;
                  this.n();
               } else {
                  if (this.m == null) {
                     this.m = $$0;
                  }

                  boolean $$1 = cih.this.dt().f(this.m) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.n > 600) {
                     cih.this.gJ();
                  } else {
                     if ($$1) {
                        boolean $$3 = cih.this.ae.a(25) == 0;
                        if ($$3) {
                           this.m = new fcu($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           cih.this.bA.m();
                        } else {
                           $$2 = false;
                        }

                        cih.this.J().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.j++;
                     if (cih.this.ae.i() < 0.05F && this.j > this.k + 60) {
                        this.k = this.j;
                        cih.this.a(awk.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         cih.this.L().a(this.m.a(), this.m.b(), this.m.c(), 0.35F);
      }

      private float o() {
         return (cih.this.ae.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<jj> p() {
         Iterable<jj> $$0 = jj.a(cih.this.dv(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (jj $$2 : $$0) {
            long $$3 = this.p.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cih.this.dV().ae() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (cih.c(cih.this.dV().a_($$2))) {
               evh $$4 = cih.this.bA.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cih.this.dV().ae() + 600L);
            }
         }

         this.p = $$1;
         return Optional.empty();
      }
   }

   class l extends cdn {
      l() {
         this.a(EnumSet.of(cdn.a.a));
      }

      @Override
      public boolean b() {
         return cih.this.bA.k() && cih.this.ae.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cih.this.bA.l();
      }

      @Override
      public void d() {
         fcu $$0 = this.h();
         if ($$0 != null) {
            cih.this.bA.a(cih.this.bA.a(jj.a((kc)$$0), 1), 1.0);
         }
      }

      @Nullable
      private fcu h() {
         fcu $$1;
         if (cih.this.gR() && !cih.this.b(cih.this.cx, this.i())) {
            fcu $$0 = fcu.b(cih.this.cx);
            $$1 = $$0.d(cih.this.dt()).d();
         } else {
            $$1 = cih.this.h(0.0F);
         }

         int $$3 = 8;
         fcu $$4 = chm.a(cih.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : chi.a(cih.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cih.this.gs() && !cih.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cih.a {
      private final int c = azk.a(cih.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cih.this.cw != null && cih.this.dV().p(cih.this.cw) && !this.a(cih.this.cw)) {
            cih.this.gJ();
         }

         this.d = cih.this.dV().ae();
      }

      @Override
      public boolean h() {
         return cih.this.dV().ae() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(jj $$0) {
         return cih.c(cih.this.dV().a_($$0));
      }
   }

   class n extends cih.a {
      private final int c = azk.a(cih.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cih.this.cx != null && cih.this.dV().p(cih.this.cx) && !cih.this.gR()) {
            cih.this.gI();
         }

         this.d = cih.this.dV().ae();
      }

      @Override
      public boolean h() {
         return cih.this.dV().ae() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
