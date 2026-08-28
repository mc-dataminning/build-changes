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

public class cgb extends cga implements bup, cgj {
   public static final float bY = 120.32113F;
   public static final int bZ = azd.f(1.4959966F);
   private static final akg<Byte> ci = akk.a(cgb.class, aki.a);
   private static final akg<Integer> cj = akk.a(cgb.class, aki.b);
   private static final int ck = 2;
   private static final int cl = 4;
   private static final int cm = 8;
   private static final int cn = 1200;
   private static final int co = 600;
   private static final int cp = 3600;
   private static final int cq = 4;
   private static final int cr = 10;
   private static final int cs = 10;
   private static final int ct = 18;
   private static final int cu = 48;
   private static final int cv = 2;
   private static final int cw = 24;
   private static final int cx = 16;
   private static final int cy = 16;
   private static final int cA = 20;
   public static final String ca = "CropsGrownSincePollination";
   public static final String cc = "CannotEnterHiveTicks";
   public static final String cd = "TicksSincePollination";
   public static final String ce = "HasStung";
   public static final String cf = "HasNectar";
   public static final String cg = "flower_pos";
   public static final String ch = "hive_pos";
   private static final bra cB = bae.a(20, 39);
   @Nullable
   private UUID cC;
   private float cD;
   private float cE;
   private int cF;
   int cG;
   private int cH;
   private int cI;
   private static final int cJ = 200;
   int cK;
   private static final int cL = 200;
   private static final int cM = 20;
   private static final int cN = 60;
   int cO = azd.a(this.af, 20, 60);
   @Nullable
   je cP;
   @Nullable
   je cQ;
   cgb.k cR;
   cgb.e cS;
   private cgb.f cT;
   private int cU;

   public cgb(btv<? extends cgb> $$0, deg $$1) {
      super($$0, $$1);
      this.bP = new cah(this, 20, true);
      this.bO = new cgb.j(this);
      this.a(erg.n, -1.0F);
      this.a(erg.j, -1.0F);
      this.a(erg.k, 16.0F);
      this.a(erg.x, -1.0F);
      this.a(erg.h, -1.0F);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ci, (byte)0);
      $$0.a(cj, 0);
   }

   @Override
   public float a(je $$0, dej $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void D() {
      this.bS.a(0, new cgb.b(this, 1.4F, true));
      this.bS.a(1, new cgb.d());
      this.bS.a(2, new cat(this, 1.0));
      this.bS.a(3, new ccp(this, 1.25, $$0 -> $$0.a(axc.aj), false));
      this.bS.a(3, new cgb.n());
      this.bS.a(3, new cgb.m());
      this.cR = new cgb.k();
      this.bS.a(4, this.cR);
      this.bS.a(5, new cbg(this, 1.25));
      this.bS.a(5, new cgb.i());
      this.cS = new cgb.e();
      this.bS.a(5, this.cS);
      this.cT = new cgb.f();
      this.bS.a(6, this.cT);
      this.bS.a(7, new cgb.g());
      this.bS.a(8, new cgb.l());
      this.bS.a(9, new cbb(this));
      this.bT.a(1, new cgb.h(this).a(new Class[0]));
      this.bT.a(2, new cgb.c(this));
      this.bT.a(3, new cdg<>(this, true));
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      if (this.gr()) {
         $$0.a("hive_pos", uu.a(this.gs()));
      }

      if (this.t()) {
         $$0.a("flower_pos", uu.a(this.q()));
      }

      $$0.a("HasNectar", this.gB());
      $$0.a("HasStung", this.gC());
      $$0.a("TicksSincePollination", this.cG);
      $$0.a("CannotEnterHiveTicks", this.cH);
      $$0.a("CropsGrownSincePollination", this.cI);
      this.a_($$0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.x($$0.q("HasNectar"));
      this.y($$0.q("HasStung"));
      this.cG = $$0.h("TicksSincePollination");
      this.cH = $$0.h("CannotEnterHiveTicks");
      this.cI = $$0.h("CropsGrownSincePollination");
      this.cQ = uu.a($$0, "hive_pos").orElse(null);
      this.cP = uu.a($$0, "flower_pos").orElse(null);
      this.a(this.dS(), $$0);
   }

   @Override
   public boolean E(bto $$0) {
      bsg $$1 = this.dT().a((buk)this);
      boolean $$2 = $$0.a($$1, (float)((int)this.h(bvr.c)));
      if ($$2) {
         if (this.dS() instanceof arh $$3) {
            dbm.a($$3, $$0, $$1);
         }

         if ($$0 instanceof buk $$4) {
            $$4.q($$4.eT() + 1);
            int $$5 = 0;
            if (this.dS().am() == brm.c) {
               $$5 = 10;
            } else if (this.dS().am() == brm.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new bsv(bsx.s, $$5 * 20, 0), this);
            }
         }

         this.y(true);
         this.Y_();
         this.a(awe.bS, 1.0F, 1.0F);
      }

      return $$2;
   }

   @Override
   public void l() {
      super.l();
      if (this.gB() && this.gM() < 10 && this.af.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.af.a(2) + 1; $$0++) {
            this.a(this.dS(), this.dx() - 0.3F, this.dx() + 0.3F, this.dD() - 0.3F, this.dD() + 0.3F, this.e(0.5), ln.ay);
         }
      }

      this.gK();
   }

   private void a(deg $$0, double $$1, double $$2, double $$3, double $$4, double $$5, ll $$6) {
      $$0.a($$6, azd.d($$0.z.j(), $$1, $$2), $$5, azd.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(je $$0) {
      eys $$1 = eys.c($$0);
      int $$2 = 0;
      je $$3 = this.ds();
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

      eys $$8 = cfd.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bR.b(0.5F);
         this.bR.a($$8.d, $$8.e, $$8.f, 1.0);
      }
   }

   @Nullable
   public je q() {
      return this.cP;
   }

   public boolean t() {
      return this.cP != null;
   }

   public void h(je $$0) {
      this.cP = $$0;
   }

   @baj
   public int y() {
      return Math.max(this.cS.d, this.cT.d);
   }

   @baj
   public List<je> gp() {
      return this.cS.f;
   }

   private boolean gG() {
      return this.cG > 3600;
   }

   void gH() {
      this.cQ = null;
      this.cK = 200;
   }

   void gI() {
      this.cP = null;
      this.cO = azd.a(this.af, 20, 60);
   }

   boolean gJ() {
      if (this.cH <= 0 && !this.cR.l() && !this.gC() && this.m() == null) {
         boolean $$0 = this.gG() || this.dS().ae() || this.dS().T() || this.gB();
         return $$0 && !this.gL();
      } else {
         return false;
      }
   }

   public void t(int $$0) {
      this.cH = $$0;
   }

   public float J(float $$0) {
      return azd.h($$0, this.cE, this.cD);
   }

   private void gK() {
      this.cE = this.cD;
      if (this.gQ()) {
         this.cD = Math.min(1.0F, this.cD + 0.2F);
      } else {
         this.cD = Math.max(0.0F, this.cD - 0.24F);
      }
   }

   @Override
   protected void ad() {
      boolean $$0 = this.gC();
      if (this.bl()) {
         this.cU++;
      } else {
         this.cU = 0;
      }

      if (this.cU > 20) {
         this.a(this.dT().i(), 1.0F);
      }

      if ($$0) {
         this.cF++;
         if (this.cF % 5 == 0 && this.af.a(azd.a(1200 - this.cF, 1, 1200)) == 0) {
            this.a(this.dT().p(), this.eA());
         }
      }

      if (!this.gB()) {
         this.cG++;
      }

      if (!this.dS().B) {
         this.a((arh)this.dS(), false);
      }
   }

   public void gq() {
      this.cG = 0;
   }

   private boolean gL() {
      if (this.cQ == null) {
         return false;
      } else {
         drs $$0 = this.dS().c_(this.cQ);
         return $$0 instanceof drp && ((drp)$$0).b();
      }
   }

   @Override
   public int a() {
      return this.am.a(cj);
   }

   @Override
   public void a(int $$0) {
      this.am.a(cj, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cC;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cC = $$0;
   }

   @Override
   public void c() {
      this.a(cB.a(this.af));
   }

   private boolean k(je $$0) {
      drs $$1 = this.dS().c_($$0);
      return $$1 instanceof drp ? !((drp)$$1).d() : false;
   }

   @baj
   public boolean gr() {
      return this.cQ != null;
   }

   @Nullable
   @baj
   public je gs() {
      return this.cQ;
   }

   @baj
   public cbi gt() {
      return this.bS;
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   int gM() {
      return this.cI;
   }

   private void gN() {
      this.cI = 0;
   }

   void gO() {
      this.cI++;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dS().B) {
         if (this.cH > 0) {
            this.cH--;
         }

         if (this.cK > 0) {
            this.cK--;
         }

         if (this.cO > 0) {
            this.cO--;
         }

         boolean $$0 = this.ac_() && !this.gC() && this.m() != null && this.m().g(this) < 4.0;
         this.z($$0);
         if (this.ag % 20 == 0 && !this.gP()) {
            this.cQ = null;
         }
      }
   }

   boolean gP() {
      if (!this.gr()) {
         return false;
      } else if (this.l(this.cQ)) {
         return false;
      } else {
         drs $$0 = this.dS().c_(this.cQ);
         return $$0 != null && $$0.q() == dru.H;
      }
   }

   public boolean gB() {
      return this.u(8);
   }

   void x(boolean $$0) {
      if ($$0) {
         this.gq();
      }

      this.d(8, $$0);
   }

   public boolean gC() {
      return this.u(4);
   }

   private void y(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gQ() {
      return this.u(2);
   }

   private void z(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(je $$0) {
      return !this.b($$0, 48);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.am.a(ci, (byte)(this.am.a(ci) | $$0));
      } else {
         this.am.a(ci, (byte)(this.am.a(ci) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.am.a(ci) & $$0) != 0;
   }

   public static bvq.a gD() {
      return cga.gu().a(bvr.s, 10.0).a(bvr.l, 0.6F).a(bvr.v, 0.3F).a(bvr.c, 2.0);
   }

   @Override
   protected cdv b(deg $$0) {
      cdt $$1 = new cdt(this, $$0) {
         @Override
         public boolean a(je $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!cgb.this.cR.l()) {
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
   public boolean n(cvp $$0) {
      return $$0.a(axc.aj);
   }

   @Override
   protected void b(je $$0, duo $$1) {
   }

   @Override
   protected awd w() {
      return null;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.bP;
   }

   @Override
   protected awd n_() {
      return awe.bO;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Nullable
   public cgb b(arh $$0, bth $$1) {
      return btv.h.a($$0, btu.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, duo $$2, je $$3) {
   }

   @Override
   public boolean aZ() {
      return this.gE() && this.ag % bZ == 0;
   }

   @Override
   public boolean gE() {
      return !this.aH();
   }

   public void gF() {
      this.x(false);
      this.gN();
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dS().B) {
            this.cR.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void c(axj<eqo> $$0) {
      this.h(this.dv().b(0.0, 0.01, 0.0));
   }

   @Override
   public eys cQ() {
      return new eys(0.0, (double)(0.5F * this.cP()), (double)(this.dn() * 0.2F));
   }

   boolean b(je $$0, int $$1) {
      return $$0.a(this.ds(), (double)$$1);
   }

   public void i(je $$0) {
      this.cQ = $$0;
   }

   abstract class a extends cbh {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cgb.this.ac_();
      }

      @Override
      public boolean c() {
         return this.i() && !cgb.this.ac_();
      }
   }

   class b extends cbr {
      b(final bus $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cgb.this.ac_() && !cgb.this.gC();
      }

      @Override
      public boolean c() {
         return super.c() && cgb.this.ac_() && !cgb.this.gC();
      }
   }

   static class c extends cda<cnu> {
      c(cgb $$0) {
         super($$0, cnu.class, 10, true, false, $$0::a_);
      }

      @Override
      public boolean b() {
         return this.i() && super.b();
      }

      @Override
      public boolean c() {
         boolean $$0 = this.i();
         if ($$0 && this.e.m() != null) {
            return super.c();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         cgb $$0 = (cgb)this.e;
         return $$0.ac_() && !$$0.gC();
      }
   }

   class d extends cgb.a {
      @Override
      public boolean h() {
         if (cgb.this.gr() && cgb.this.gJ() && cgb.this.cQ.a(cgb.this.dq(), 2.0) && cgb.this.dS().c_(cgb.this.cQ) instanceof drp $$1) {
            if (!$$1.d()) {
               return true;
            }

            cgb.this.cQ = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         if (cgb.this.dS().c_(cgb.this.cQ) instanceof drp $$1) {
            $$1.a(cgb.this);
         }
      }
   }

   @baj
   public class e extends cgb.a {
      public static final int b = 2400;
      int d = cgb.this.dS().z.a(10);
      private static final int e = 3;
      final List<je> f = Lists.newArrayList();
      @Nullable
      private erd g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(cbh.a.a));
      }

      @Override
      public boolean h() {
         return cgb.this.cQ != null && !cgb.this.gd() && cgb.this.gJ() && !this.d(cgb.this.cQ) && cgb.this.dS().a_(cgb.this.cQ).a(awt.aH);
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
         cgb.this.bR.o();
         cgb.this.bR.h();
      }

      @Override
      public void a() {
         if (cgb.this.cQ != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!cgb.this.bR.n()) {
               if (!cgb.this.b(cgb.this.cQ, 16)) {
                  if (cgb.this.l(cgb.this.cQ)) {
                     cgb.this.gH();
                  } else {
                     cgb.this.j(cgb.this.cQ);
                  }
               } else {
                  boolean $$0 = this.a(cgb.this.cQ);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cgb.this.bR.k().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        cgb.this.gH();
                        this.i = 0;
                     }
                  } else {
                     this.g = cgb.this.bR.k();
                  }
               }
            }
         }
      }

      private boolean a(je $$0) {
         int $$1 = cgb.this.b(cgb.this.cQ, 3) ? 1 : 2;
         cgb.this.bR.b(10.0F);
         cgb.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return cgb.this.bR.k() != null && cgb.this.bR.k().j();
      }

      boolean b(je $$0) {
         return this.f.contains($$0);
      }

      private void c(je $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cgb.this.cQ != null) {
            this.c(cgb.this.cQ);
         }

         cgb.this.gH();
      }

      private boolean d(je $$0) {
         if (cgb.this.b($$0, 2)) {
            return true;
         } else {
            erd $$1 = cgb.this.bR.k();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cgb.a {
      private static final int c = 2400;
      int d = cgb.this.dS().z.a(10);

      f() {
         this.a(EnumSet.of(cbh.a.a));
      }

      @Override
      public boolean h() {
         return cgb.this.cP != null && !cgb.this.gd() && this.k() && !cgb.this.b(cgb.this.cP, 2);
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
         cgb.this.bR.o();
         cgb.this.bR.h();
      }

      @Override
      public void a() {
         if (cgb.this.cP != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               cgb.this.gI();
            } else if (!cgb.this.bR.n()) {
               if (cgb.this.l(cgb.this.cP)) {
                  cgb.this.gI();
               } else {
                  cgb.this.j(cgb.this.cP);
               }
            }
         }
      }

      private boolean k() {
         return cgb.this.cG > 600;
      }
   }

   class g extends cgb.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cgb.this.gM() >= 10) {
            return false;
         } else {
            return cgb.this.af.i() < 0.3F ? false : cgb.this.gB() && cgb.this.gP();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cgb.this.af.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               je $$1 = cgb.this.ds().c($$0);
               duo $$2 = cgb.this.dS().a_($$1);
               dhj $$3 = $$2.b();
               duo $$4 = null;
               if ($$2.a(awt.aJ)) {
                  if ($$3 instanceof dje) {
                     dje $$5 = (dje)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dpg) {
                     int $$6 = $$2.c(dpg.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dpg.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dhl.oi)) {
                     int $$7 = $$2.c(dpn.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dpn.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dhl.sv) || $$2.a(dhl.sw)) {
                     dhm $$8 = (dhm)$$2.b();
                     if ($$8.b(cgb.this.dS(), $$1, $$2)) {
                        $$8.a((arh)cgb.this.dS(), cgb.this.af, $$1, $$2);
                        $$4 = cgb.this.dS().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cgb.this.dS().c(2011, $$1, 15);
                     cgb.this.dS().b($$1, $$4);
                     cgb.this.gO();
                  }
               }
            }
         }
      }
   }

   class h extends ccz {
      h(final cgb $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cgb.this.ac_() && super.c();
      }

      @Override
      protected void a(bum $$0, buk $$1) {
         if ($$0 instanceof cgb && this.e.G($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cgb.a {
      @Override
      public boolean h() {
         return cgb.this.cK == 0 && !cgb.this.gr() && cgb.this.gJ();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cgb.this.cK = 200;
         List<je> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (je $$1 : $$0) {
               if (!cgb.this.cS.b($$1)) {
                  cgb.this.cQ = $$1;
                  return;
               }
            }

            cgb.this.cS.k();
            cgb.this.cQ = $$0.get(0);
         }
      }

      private List<je> k() {
         je $$0 = cgb.this.ds();
         cfn $$1 = ((arh)cgb.this.dS()).y();
         Stream<cfo> $$2 = $$1.c($$0x -> $$0x.a(axe.c), $$0, 20, cfn.b.c);
         return $$2.map(cfo::g).filter(cgb.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends caj {
      j(final bum $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cgb.this.ac_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cgb.this.cR.l();
      }
   }

   class k extends cgb.a {
      private static final int c = 400;
      private final Predicate<duo> d = $$0 -> {
         if ($$0.b(dve.C) && $$0.c(dve.C)) {
            return false;
         } else if ($$0.a(awt.V)) {
            return $$0.a(dhl.iD) ? $$0.c(djr.b) == dvk.a : true;
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
      private eys n;
      private int o;
      private static final int p = 600;
      private Long2LongOpenHashMap q = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(cbh.a.a));
      }

      @Override
      public boolean h() {
         if (cgb.this.cO > 0) {
            return false;
         } else if (cgb.this.gB()) {
            return false;
         } else if (cgb.this.dS().ae()) {
            return false;
         } else {
            Optional<je> $$0 = this.p();
            if ($$0.isPresent()) {
               cgb.this.cP = $$0.get();
               cgb.this.bR.a((double)cgb.this.cP.u() + 0.5, (double)cgb.this.cP.v() + 0.5, (double)cgb.this.cP.w() + 0.5, 1.2F);
               return true;
            } else {
               cgb.this.cO = azd.a(cgb.this.af, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.m) {
            return false;
         } else if (!cgb.this.t()) {
            return false;
         } else if (cgb.this.dS().ae()) {
            return false;
         } else {
            return this.k() ? cgb.this.af.i() < 0.2F : true;
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
         cgb.this.gq();
      }

      @Override
      public void e() {
         if (this.k()) {
            cgb.this.x(true);
         }

         this.m = false;
         cgb.this.bR.o();
         cgb.this.cO = 200;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         if (cgb.this.t()) {
            this.o++;
            if (this.o > 600) {
               cgb.this.gI();
               this.m = false;
               cgb.this.cO = 200;
            } else {
               eys $$0 = eys.c(cgb.this.cP).b(0.0, 0.6F, 0.0);
               if ($$0.f(cgb.this.dq()) > 1.0) {
                  this.n = $$0;
                  this.n();
               } else {
                  if (this.n == null) {
                     this.n = $$0;
                  }

                  boolean $$1 = cgb.this.dq().f(this.n) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.o > 600) {
                     cgb.this.gI();
                  } else {
                     if ($$1) {
                        boolean $$3 = cgb.this.af.a(25) == 0;
                        if ($$3) {
                           this.n = new eys($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           cgb.this.bR.o();
                        } else {
                           $$2 = false;
                        }

                        cgb.this.K().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.k++;
                     if (cgb.this.af.i() < 0.05F && this.k > this.l + 60) {
                        this.l = this.k;
                        cgb.this.a(awe.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         cgb.this.M().a(this.n.a(), this.n.b(), this.n.c(), 0.35F);
      }

      private float o() {
         return (cgb.this.af.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<je> p() {
         Iterable<je> $$0 = je.a(cgb.this.ds(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (je $$2 : $$0) {
            long $$3 = this.q.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cgb.this.dS().aa() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (this.d.test(cgb.this.dS().a_($$2))) {
               erd $$4 = cgb.this.bR.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cgb.this.dS().aa() + 600L);
            }
         }

         this.q = $$1;
         return Optional.empty();
      }
   }

   class l extends cbh {
      l() {
         this.a(EnumSet.of(cbh.a.a));
      }

      @Override
      public boolean b() {
         return cgb.this.bR.m() && cgb.this.af.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cgb.this.bR.n();
      }

      @Override
      public void d() {
         eys $$0 = this.h();
         if ($$0 != null) {
            cgb.this.bR.a(cgb.this.bR.a(je.a((jx)$$0), 1), 1.0);
         }
      }

      @Nullable
      private eys h() {
         eys $$1;
         if (cgb.this.gP() && !cgb.this.b(cgb.this.cQ, this.i())) {
            eys $$0 = eys.b(cgb.this.cQ);
            $$1 = $$0.d(cgb.this.dq()).d();
         } else {
            $$1 = cgb.this.g(0.0F);
         }

         int $$3 = 8;
         eys $$4 = cfg.a(cgb.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cfc.a(cgb.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cgb.this.gr() && !cgb.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cgb.a {
      private final int c = azd.a(cgb.this.af, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cgb.this.cP != null && cgb.this.dS().p(cgb.this.cP) && !this.a(cgb.this.cP)) {
            cgb.this.gI();
         }

         this.d = cgb.this.dS().aa();
      }

      @Override
      public boolean h() {
         return cgb.this.dS().aa() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(je $$0) {
         return cgb.this.dS().a_($$0).a(awt.V);
      }
   }

   class n extends cgb.a {
      private final int c = azd.a(cgb.this.af, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cgb.this.cQ != null && cgb.this.dS().p(cgb.this.cQ) && !cgb.this.gP()) {
            cgb.this.gH();
         }

         this.d = cgb.this.dS().aa();
      }

      @Override
      public boolean h() {
         return cgb.this.dS().aa() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
