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

public class cgz extends cgy implements bvm, chh {
   public static final float bY = 120.32113F;
   public static final int bZ = azm.f(1.4959966F);
   private static final akm<Byte> ci = akq.a(cgz.class, ako.a);
   private static final akm<Integer> cj = akq.a(cgz.class, ako.b);
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
   private static final int cB = 20;
   public static final String ca = "CropsGrownSincePollination";
   public static final String cc = "CannotEnterHiveTicks";
   public static final String cd = "TicksSincePollination";
   public static final String ce = "HasStung";
   public static final String cf = "HasNectar";
   public static final String cg = "flower_pos";
   public static final String ch = "hive_pos";
   private static final brv cC = bao.a(20, 39);
   @Nullable
   private UUID cD;
   private float cE;
   private float cF;
   private int cG;
   int cH;
   private int cI;
   private int cJ;
   private static final int cK = 200;
   int cL;
   private static final int cM = 200;
   private static final int cN = 20;
   private static final int cO = 60;
   int cP = azm.a(this.ae, 20, 60);
   @Nullable
   jh cQ;
   @Nullable
   jh cR;
   cgz.k cS;
   cgz.e cT;
   private cgz.f cU;
   private int cV;

   public cgz(bus<? extends cgz> $$0, dfm $$1) {
      super($$0, $$1);
      this.bP = new cbf(this, 20, true);
      this.bO = new cgz.j(this);
      this.a(esm.n, -1.0F);
      this.a(esm.j, -1.0F);
      this.a(esm.k, 16.0F);
      this.a(esm.x, -1.0F);
      this.a(esm.h, -1.0F);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(ci, (byte)0);
      $$0.a(cj, 0);
   }

   @Override
   public float a(jh $$0, dfp $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void B() {
      this.bS.a(0, new cgz.b(this, 1.4F, true));
      this.bS.a(1, new cgz.d());
      this.bS.a(2, new cbr(this, 1.0));
      this.bS.a(3, new cdn(this, 1.25, $$0 -> $$0.a(axl.an), false));
      this.bS.a(3, new cgz.n());
      this.bS.a(3, new cgz.m());
      this.cS = new cgz.k();
      this.bS.a(4, this.cS);
      this.bS.a(5, new cce(this, 1.25));
      this.bS.a(5, new cgz.i());
      this.cT = new cgz.e();
      this.bS.a(5, this.cT);
      this.cU = new cgz.f();
      this.bS.a(6, this.cU);
      this.bS.a(7, new cgz.g());
      this.bS.a(8, new cgz.l());
      this.bS.a(9, new cbz(this));
      this.bT.a(1, new cgz.h(this).a(new Class[0]));
      this.bT.a(2, new cgz.c(this));
      this.bT.a(3, new cee<>(this, true));
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      if (this.go()) {
         $$0.a("hive_pos", va.a(this.gp()));
      }

      if (this.q()) {
         $$0.a("flower_pos", va.a(this.n()));
      }

      $$0.a("HasNectar", this.gy());
      $$0.a("HasStung", this.gz());
      $$0.a("TicksSincePollination", this.cH);
      $$0.a("CannotEnterHiveTicks", this.cI);
      $$0.a("CropsGrownSincePollination", this.cJ);
      this.a_($$0);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.x($$0.q("HasNectar"));
      this.y($$0.q("HasStung"));
      this.cH = $$0.h("TicksSincePollination");
      this.cI = $$0.h("CannotEnterHiveTicks");
      this.cJ = $$0.h("CropsGrownSincePollination");
      this.cR = va.a($$0, "hive_pos").orElse(null);
      this.cQ = va.a($$0, "flower_pos").orElse(null);
      this.a(this.dV(), $$0);
   }

   @Override
   public boolean c(arp $$0, bul $$1) {
      btb $$2 = this.dW().a((bvh)this);
      boolean $$3 = $$1.a($$0, $$2, (float)((int)this.h(bwp.c)));
      if ($$3) {
         dcf.a($$0, $$1, $$2);
         if ($$1 instanceof bvh $$4) {
            $$4.p($$4.eU() + 1);
            int $$5 = 0;
            if (this.dV().ak() == bsh.c) {
               $$5 = 10;
            } else if (this.dV().ak() == bsh.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new btq(bts.s, $$5 * 20, 0), this);
            }
         }

         this.y(true);
         this.ae_();
         this.a(awn.bS, 1.0F, 1.0F);
      }

      return $$3;
   }

   @Override
   public void h() {
      super.h();
      if (this.gy() && this.gJ() < 10 && this.ae.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ae.a(2) + 1; $$0++) {
            this.a(this.dV(), this.dA() - 0.3F, this.dA() + 0.3F, this.dG() - 0.3F, this.dG() + 0.3F, this.e(0.5), ls.ay);
         }
      }

      this.gH();
   }

   private void a(dfm $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lq $$6) {
      $$0.a($$6, azm.d($$0.A.j(), $$1, $$2), $$5, azm.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(jh $$0) {
      ezy $$1 = ezy.c($$0);
      int $$2 = 0;
      jh $$3 = this.dv();
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

      ezy $$8 = cgb.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bR.b(0.5F);
         this.bR.a($$8.d, $$8.e, $$8.f, 1.0);
      }
   }

   @Nullable
   public jh n() {
      return this.cQ;
   }

   public boolean q() {
      return this.cQ != null;
   }

   public void h(jh $$0) {
      this.cQ = $$0;
   }

   @bat
   public int v() {
      return Math.max(this.cT.d, this.cU.d);
   }

   @bat
   public List<jh> gm() {
      return this.cT.f;
   }

   private boolean gD() {
      return this.cH > 3600;
   }

   void gE() {
      this.cR = null;
      this.cL = 200;
   }

   void gF() {
      this.cQ = null;
      this.cP = azm.a(this.ae, 20, 60);
   }

   boolean gG() {
      if (this.cI <= 0 && !this.cS.l() && !this.gz() && this.aa_() == null) {
         boolean $$0 = this.gD() || c(this.dV()) || this.gy();
         return $$0 && !this.gI();
      } else {
         return false;
      }
   }

   public static boolean c(dfm $$0) {
      return $$0.F_().g() && ($$0.U() || $$0.ae());
   }

   public void s(int $$0) {
      this.cI = $$0;
   }

   public float J(float $$0) {
      return azm.h($$0, this.cF, this.cE);
   }

   private void gH() {
      this.cF = this.cE;
      if (this.gN()) {
         this.cE = Math.min(1.0F, this.cE + 0.2F);
      } else {
         this.cE = Math.max(0.0F, this.cE - 0.24F);
      }
   }

   @Override
   protected void a(arp $$0) {
      boolean $$1 = this.gz();
      if (this.bm()) {
         this.cV++;
      } else {
         this.cV = 0;
      }

      if (this.cV > 20) {
         this.a($$0, this.dW().i(), 1.0F);
      }

      if ($$1) {
         this.cG++;
         if (this.cG % 5 == 0 && this.ae.a(azm.a(1200 - this.cG, 1, 1200)) == 0) {
            this.a($$0, this.dW().p(), this.eD());
         }
      }

      if (!this.gy()) {
         this.cH++;
      }

      this.a($$0, false);
   }

   public void gn() {
      this.cH = 0;
   }

   private boolean gI() {
      if (this.cR == null) {
         return false;
      } else {
         dsy $$0 = this.dV().c_(this.cR);
         return $$0 instanceof dsv && ((dsv)$$0).b();
      }
   }

   @Override
   public int a() {
      return this.al.a(cj);
   }

   @Override
   public void a(int $$0) {
      this.al.a(cj, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cD;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cD = $$0;
   }

   @Override
   public void c() {
      this.a(cC.a(this.ae));
   }

   private boolean k(jh $$0) {
      dsy $$1 = this.dV().c_($$0);
      return $$1 instanceof dsv ? !((dsv)$$1).d() : false;
   }

   @bat
   public boolean go() {
      return this.cR != null;
   }

   @Nullable
   @bat
   public jh gp() {
      return this.cR;
   }

   @bat
   public ccg gq() {
      return this.bS;
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   int gJ() {
      return this.cJ;
   }

   private void gK() {
      this.cJ = 0;
   }

   void gL() {
      this.cJ++;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C) {
         if (this.cI > 0) {
            this.cI--;
         }

         if (this.cL > 0) {
            this.cL--;
         }

         if (this.cP > 0) {
            this.cP--;
         }

         boolean $$0 = this.ac_() && !this.gz() && this.aa_() != null && this.aa_().g(this) < 4.0;
         this.z($$0);
         if (this.af % 20 == 0 && !this.gM()) {
            this.cR = null;
         }
      }
   }

   boolean gM() {
      if (!this.go()) {
         return false;
      } else if (this.l(this.cR)) {
         return false;
      } else {
         dsy $$0 = this.dV().c_(this.cR);
         return $$0 != null && $$0.q() == dta.H;
      }
   }

   public boolean gy() {
      return this.t(8);
   }

   void x(boolean $$0) {
      if ($$0) {
         this.gn();
      }

      this.d(8, $$0);
   }

   public boolean gz() {
      return this.t(4);
   }

   private void y(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gN() {
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
         this.al.a(ci, (byte)(this.al.a(ci) | $$0));
      } else {
         this.al.a(ci, (byte)(this.al.a(ci) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.al.a(ci) & $$0) != 0;
   }

   public static bwo.a gA() {
      return cgy.gr().a(bwp.s, 10.0).a(bwp.l, 0.6F).a(bwp.v, 0.3F).a(bwp.c, 2.0);
   }

   @Override
   protected cet b(dfm $$0) {
      cer $$1 = new cer(this, $$0) {
         @Override
         public boolean a(jh $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!cgz.this.cS.l()) {
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
   public boolean j(cwm $$0) {
      return $$0.a(axl.an);
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
   }

   @Override
   protected awm t() {
      return null;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.bP;
   }

   @Override
   protected awm n_() {
      return awn.bO;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Nullable
   public cgz b(arp $$0, buc $$1) {
      return bus.l.a($$0, bur.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvv $$2, jh $$3) {
   }

   @Override
   public boolean ba() {
      return this.gB() && this.af % bZ == 0;
   }

   @Override
   public boolean gB() {
      return !this.aJ();
   }

   public void gC() {
      this.x(false);
      this.gK();
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.cS.m();
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(axs<eru> $$0) {
      this.h(this.dy().b(0.0, 0.01, 0.0));
   }

   @Override
   public ezy cT() {
      return new ezy(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.2F));
   }

   boolean b(jh $$0, int $$1) {
      return $$0.a(this.dv(), (double)$$1);
   }

   public void i(jh $$0) {
      this.cR = $$0;
   }

   abstract class a extends ccf {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cgz.this.ac_();
      }

      @Override
      public boolean c() {
         return this.i() && !cgz.this.ac_();
      }
   }

   class b extends ccp {
      b(final bvp $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cgz.this.ac_() && !cgz.this.gz();
      }

      @Override
      public boolean c() {
         return super.c() && cgz.this.ac_() && !cgz.this.gz();
      }
   }

   static class c extends cdy<cou> {
      c(cgz $$0) {
         super($$0, cou.class, 10, true, false, $$0::a);
      }

      @Override
      public boolean b() {
         return this.i() && super.b();
      }

      @Override
      public boolean c() {
         boolean $$0 = this.i();
         if ($$0 && this.e.aa_() != null) {
            return super.c();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         cgz $$0 = (cgz)this.e;
         return $$0.ac_() && !$$0.gz();
      }
   }

   class d extends cgz.a {
      @Override
      public boolean h() {
         if (cgz.this.go() && cgz.this.gG() && cgz.this.cR.a(cgz.this.dt(), 2.0) && cgz.this.dV().c_(cgz.this.cR) instanceof dsv $$1) {
            if (!$$1.d()) {
               return true;
            }

            cgz.this.cR = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         if (cgz.this.dV().c_(cgz.this.cR) instanceof dsv $$1) {
            $$1.a(cgz.this);
         }
      }
   }

   @bat
   public class e extends cgz.a {
      public static final int b = 2400;
      int d = cgz.this.dV().A.a(10);
      private static final int e = 3;
      final List<jh> f = Lists.newArrayList();
      @Nullable
      private esj g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean h() {
         return cgz.this.cR != null && !cgz.this.fY() && cgz.this.gG() && !this.d(cgz.this.cR) && cgz.this.dV().a_(cgz.this.cR).a(axc.aI);
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
         cgz.this.bR.o();
         cgz.this.bR.h();
      }

      @Override
      public void a() {
         if (cgz.this.cR != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!cgz.this.bR.n()) {
               if (!cgz.this.b(cgz.this.cR, 16)) {
                  if (cgz.this.l(cgz.this.cR)) {
                     cgz.this.gE();
                  } else {
                     cgz.this.j(cgz.this.cR);
                  }
               } else {
                  boolean $$0 = this.a(cgz.this.cR);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cgz.this.bR.k().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        cgz.this.gE();
                        this.i = 0;
                     }
                  } else {
                     this.g = cgz.this.bR.k();
                  }
               }
            }
         }
      }

      private boolean a(jh $$0) {
         int $$1 = cgz.this.b(cgz.this.cR, 3) ? 1 : 2;
         cgz.this.bR.b(10.0F);
         cgz.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return cgz.this.bR.k() != null && cgz.this.bR.k().j();
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
         if (cgz.this.cR != null) {
            this.c(cgz.this.cR);
         }

         cgz.this.gE();
      }

      private boolean d(jh $$0) {
         if (cgz.this.b($$0, 2)) {
            return true;
         } else {
            esj $$1 = cgz.this.bR.k();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cgz.a {
      private static final int c = 2400;
      int d = cgz.this.dV().A.a(10);

      f() {
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean h() {
         return cgz.this.cQ != null && !cgz.this.fY() && this.k() && !cgz.this.b(cgz.this.cQ, 2);
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
         cgz.this.bR.o();
         cgz.this.bR.h();
      }

      @Override
      public void a() {
         if (cgz.this.cQ != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               cgz.this.gF();
            } else if (!cgz.this.bR.n()) {
               if (cgz.this.l(cgz.this.cQ)) {
                  cgz.this.gF();
               } else {
                  cgz.this.j(cgz.this.cQ);
               }
            }
         }
      }

      private boolean k() {
         return cgz.this.cH > 600;
      }
   }

   class g extends cgz.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cgz.this.gJ() >= 10) {
            return false;
         } else {
            return cgz.this.ae.i() < 0.3F ? false : cgz.this.gy() && cgz.this.gM();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cgz.this.ae.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               jh $$1 = cgz.this.dv().c($$0);
               dvv $$2 = cgz.this.dV().a_($$1);
               diq $$3 = $$2.b();
               dvv $$4 = null;
               if ($$2.a(axc.aK)) {
                  if ($$3 instanceof dkl) {
                     dkl $$5 = (dkl)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dqm) {
                     int $$6 = $$2.c(dqm.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dqm.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dis.oi)) {
                     int $$7 = $$2.c(dqt.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dqt.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dis.sv) || $$2.a(dis.sw)) {
                     dit $$8 = (dit)$$2.b();
                     if ($$8.b(cgz.this.dV(), $$1, $$2)) {
                        $$8.a((arp)cgz.this.dV(), cgz.this.ae, $$1, $$2);
                        $$4 = cgz.this.dV().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cgz.this.dV().c(2011, $$1, 15);
                     cgz.this.dV().b($$1, $$4);
                     cgz.this.gL();
                  }
               }
            }
         }
      }
   }

   class h extends cdx {
      h(final cgz $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cgz.this.ac_() && super.c();
      }

      @Override
      protected void a(bvj $$0, bvh $$1) {
         if ($$0 instanceof cgz && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cgz.a {
      @Override
      public boolean h() {
         return cgz.this.cL == 0 && !cgz.this.go() && cgz.this.gG();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cgz.this.cL = 200;
         List<jh> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (jh $$1 : $$0) {
               if (!cgz.this.cT.b($$1)) {
                  cgz.this.cR = $$1;
                  return;
               }
            }

            cgz.this.cT.k();
            cgz.this.cR = $$0.get(0);
         }
      }

      private List<jh> k() {
         jh $$0 = cgz.this.dv();
         cgl $$1 = ((arp)cgz.this.dV()).z();
         Stream<cgm> $$2 = $$1.c($$0x -> $$0x.a(axn.c), $$0, 20, cgl.b.c);
         return $$2.map(cgm::g).filter(cgz.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends cbh {
      j(final bvj $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cgz.this.ac_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cgz.this.cS.l();
      }
   }

   class k extends cgz.a {
      private static final int c = 400;
      private final Predicate<dvv> d = $$0 -> {
         if ($$0.b(dwl.C) && $$0.c(dwl.C)) {
            return false;
         } else if ($$0.a(axc.V)) {
            return $$0.a(dis.iD) ? $$0.c(dky.b) == dwq.a : true;
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
      private ezy n;
      private int o;
      private static final int p = 600;
      private Long2LongOpenHashMap q = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean h() {
         if (cgz.this.cP > 0) {
            return false;
         } else if (cgz.this.gy()) {
            return false;
         } else if (cgz.this.dV().ae()) {
            return false;
         } else {
            Optional<jh> $$0 = this.p();
            if ($$0.isPresent()) {
               cgz.this.cQ = $$0.get();
               cgz.this.bR.a((double)cgz.this.cQ.u() + 0.5, (double)cgz.this.cQ.v() + 0.5, (double)cgz.this.cQ.w() + 0.5, 1.2F);
               return true;
            } else {
               cgz.this.cP = azm.a(cgz.this.ae, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.m) {
            return false;
         } else if (!cgz.this.q()) {
            return false;
         } else if (cgz.this.dV().ae()) {
            return false;
         } else {
            return this.k() ? cgz.this.ae.i() < 0.2F : true;
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
         cgz.this.gn();
      }

      @Override
      public void e() {
         if (this.k()) {
            cgz.this.x(true);
         }

         this.m = false;
         cgz.this.bR.o();
         cgz.this.cP = 200;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         if (cgz.this.q()) {
            this.o++;
            if (this.o > 600) {
               cgz.this.gF();
               this.m = false;
               cgz.this.cP = 200;
            } else {
               ezy $$0 = ezy.c(cgz.this.cQ).b(0.0, 0.6F, 0.0);
               if ($$0.f(cgz.this.dt()) > 1.0) {
                  this.n = $$0;
                  this.n();
               } else {
                  if (this.n == null) {
                     this.n = $$0;
                  }

                  boolean $$1 = cgz.this.dt().f(this.n) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.o > 600) {
                     cgz.this.gF();
                  } else {
                     if ($$1) {
                        boolean $$3 = cgz.this.ae.a(25) == 0;
                        if ($$3) {
                           this.n = new ezy($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           cgz.this.bR.o();
                        } else {
                           $$2 = false;
                        }

                        cgz.this.H().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.k++;
                     if (cgz.this.ae.i() < 0.05F && this.k > this.l + 60) {
                        this.l = this.k;
                        cgz.this.a(awn.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         cgz.this.I().a(this.n.a(), this.n.b(), this.n.c(), 0.35F);
      }

      private float o() {
         return (cgz.this.ae.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<jh> p() {
         Iterable<jh> $$0 = jh.a(cgz.this.dv(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (jh $$2 : $$0) {
            long $$3 = this.q.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cgz.this.dV().ab() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (this.d.test(cgz.this.dV().a_($$2))) {
               esj $$4 = cgz.this.bR.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cgz.this.dV().ab() + 600L);
            }
         }

         this.q = $$1;
         return Optional.empty();
      }
   }

   class l extends ccf {
      l() {
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean b() {
         return cgz.this.bR.m() && cgz.this.ae.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cgz.this.bR.n();
      }

      @Override
      public void d() {
         ezy $$0 = this.h();
         if ($$0 != null) {
            cgz.this.bR.a(cgz.this.bR.a(jh.a((ka)$$0), 1), 1.0);
         }
      }

      @Nullable
      private ezy h() {
         ezy $$1;
         if (cgz.this.gM() && !cgz.this.b(cgz.this.cR, this.i())) {
            ezy $$0 = ezy.b(cgz.this.cR);
            $$1 = $$0.d(cgz.this.dt()).d();
         } else {
            $$1 = cgz.this.g(0.0F);
         }

         int $$3 = 8;
         ezy $$4 = cge.a(cgz.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cga.a(cgz.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cgz.this.go() && !cgz.this.q() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cgz.a {
      private final int c = azm.a(cgz.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cgz.this.cQ != null && cgz.this.dV().p(cgz.this.cQ) && !this.a(cgz.this.cQ)) {
            cgz.this.gF();
         }

         this.d = cgz.this.dV().ab();
      }

      @Override
      public boolean h() {
         return cgz.this.dV().ab() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(jh $$0) {
         return cgz.this.dV().a_($$0).a(axc.V);
      }
   }

   class n extends cgz.a {
      private final int c = azm.a(cgz.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cgz.this.cR != null && cgz.this.dV().p(cgz.this.cR) && !cgz.this.gM()) {
            cgz.this.gE();
         }

         this.d = cgz.this.dV().ab();
      }

      @Override
      public boolean h() {
         return cgz.this.dV().ab() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
