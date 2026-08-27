import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ccj extends cci implements bqz, ccr {
   public static final float bX = 120.32113F;
   public static final int bY = axm.f(1.4959966F);
   private static final aja<Byte> ch = aje.a(ccj.class, ajc.a);
   private static final aja<Integer> ci = aje.a(ccj.class, ajc.b);
   private static final int cj = 2;
   private static final int ck = 4;
   private static final int cl = 8;
   private static final int cm = 1200;
   private static final int cn = 2400;
   private static final int co = 3600;
   private static final int cp = 4;
   private static final int cq = 10;
   private static final int cr = 10;
   private static final int cs = 18;
   private static final int ct = 32;
   private static final int cu = 2;
   private static final int cv = 16;
   private static final int cw = 20;
   public static final String ca = "CropsGrownSincePollination";
   public static final String cb = "CannotEnterHiveTicks";
   public static final String cc = "TicksSincePollination";
   public static final String cd = "HasStung";
   public static final String ce = "HasNectar";
   public static final String cf = "flower_pos";
   public static final String cg = "hive_pos";
   private static final bnq cx = ayl.a(20, 39);
   @Nullable
   private UUID cz;
   private float cA;
   private float cB;
   private int cC;
   int cD;
   private int cE;
   private int cF;
   private static final int cG = 200;
   int cH;
   private static final int cI = 200;
   int cJ = axm.a(this.ag, 20, 60);
   @Nullable
   id cK;
   @Nullable
   id cL;
   ccj.k cM;
   ccj.e cN;
   private ccj.f cO;
   private int cP;

   public ccj(bqg<? extends ccj> $$0, czg $$1) {
      super($$0, $$1);
      this.bO = new bwq(this, 20, true);
      this.bN = new ccj.j(this);
      this.a(els.n, -1.0F);
      this.a(els.j, -1.0F);
      this.a(els.k, 16.0F);
      this.a(els.x, -1.0F);
      this.a(els.h, -1.0F);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(ch, (byte)0);
      $$0.a(ci, 0);
   }

   @Override
   public float a(id $$0, czj $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void z() {
      this.bR.a(0, new ccj.b(this, 1.4F, true));
      this.bR.a(1, new ccj.d());
      this.bR.a(2, new bxc(this, 1.0));
      this.bR.a(3, new byy(this, 1.25, cvp.a(avm.S), false));
      this.cM = new ccj.k();
      this.bR.a(4, this.cM);
      this.bR.a(5, new bxp(this, 1.25));
      this.bR.a(5, new ccj.i());
      this.cN = new ccj.e();
      this.bR.a(5, this.cN);
      this.cO = new ccj.f();
      this.bR.a(6, this.cO);
      this.bR.a(7, new ccj.g());
      this.bR.a(8, new ccj.l());
      this.bR.a(9, new bxk(this));
      this.bS.a(1, new ccj.h(this).a(new Class[0]));
      this.bS.a(2, new ccj.c(this));
      this.bS.a(3, new bzp<>(this, true));
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      if (this.gu()) {
         $$0.a("hive_pos", ud.a(this.gv()));
      }

      if (this.u()) {
         $$0.a("flower_pos", ud.a(this.r()));
      }

      $$0.a("HasNectar", this.gx());
      $$0.a("HasStung", this.gy());
      $$0.a("TicksSincePollination", this.cD);
      $$0.a("CannotEnterHiveTicks", this.cE);
      $$0.a("CropsGrownSincePollination", this.cF);
      this.c($$0);
   }

   @Override
   public void a(to $$0) {
      this.cL = ud.a($$0, "hive_pos").orElse(null);
      this.cK = ud.a($$0, "flower_pos").orElse(null);
      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cD = $$0.h("TicksSincePollination");
      this.cE = $$0.h("CannotEnterHiveTicks");
      this.cF = $$0.h("CropsGrownSincePollination");
      this.a(this.dM(), $$0);
   }

   @Override
   public boolean C(bqa $$0) {
      boolean $$1 = $$0.a(this.dN().a((bqt)this), (float)((int)this.g(bsa.c)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof bqt) {
            ((bqt)$$0).r(((bqt)$$0).eR() + 1);
            int $$2 = 0;
            if (this.dM().ak() == boc.c) {
               $$2 = 10;
            } else if (this.dM().ak() == boc.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((bqt)$$0).b(new bpm(bpo.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.V_();
         this.a(auo.bS, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.gx() && this.gG() < 10 && this.ag.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ag.a(2) + 1; $$0++) {
            this.a(this.dM(), this.dr() - 0.3F, this.dr() + 0.3F, this.dx() - 0.3F, this.dx() + 0.3F, this.e(0.5), kn.aw);
         }
      }

      this.gE();
   }

   private void a(czg $$0, double $$1, double $$2, double $$3, double $$4, double $$5, kl $$6) {
      $$0.a($$6, axm.d($$0.z.j(), $$1, $$2), $$5, axm.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void k(id $$0) {
      esj $$1 = esj.c($$0);
      int $$2 = 0;
      id $$3 = this.dm();
      int $$4 = (int)$$1.d - $$3.v();
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

      esj $$8 = cbm.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bQ.a(0.5F);
         this.bQ.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public id r() {
      return this.cK;
   }

   public boolean u() {
      return this.cK != null;
   }

   public void i(id $$0) {
      this.cK = $$0;
   }

   @ayp
   public int y() {
      return Math.max(this.cN.d, this.cO.d);
   }

   @ayp
   public List<id> gn() {
      return this.cN.f;
   }

   private boolean gC() {
      return this.cD > 3600;
   }

   boolean gD() {
      if (this.cE <= 0 && !this.cM.l() && !this.gy() && this.p() == null) {
         boolean $$0 = this.gC() || this.dM().ac() || this.dM().R() || this.gx();
         return $$0 && !this.gF();
      } else {
         return false;
      }
   }

   public void u(int $$0) {
      this.cE = $$0;
   }

   public float G(float $$0) {
      return axm.i($$0, this.cB, this.cA);
   }

   private void gE() {
      this.cB = this.cA;
      if (this.gK()) {
         this.cA = Math.min(1.0F, this.cA + 0.2F);
      } else {
         this.cA = Math.max(0.0F, this.cA - 0.24F);
      }
   }

   @Override
   protected void Y() {
      boolean $$0 = this.gy();
      if (this.bf()) {
         this.cP++;
      } else {
         this.cP = 0;
      }

      if (this.cP > 20) {
         this.a(this.dN().h(), 1.0F);
      }

      if ($$0) {
         this.cC++;
         if (this.cC % 5 == 0 && this.ag.a(axm.a(1200 - this.cC, 1, 1200)) == 0) {
            this.a(this.dN().n(), this.ex());
         }
      }

      if (!this.gx()) {
         this.cD++;
      }

      if (!this.dM().B) {
         this.a((apu)this.dM(), false);
      }
   }

   public void gt() {
      this.cD = 0;
   }

   private boolean gF() {
      if (this.cL == null) {
         return false;
      } else {
         dmo $$0 = this.dM().c_(this.cL);
         return $$0 instanceof dml && ((dml)$$0).b();
      }
   }

   @Override
   public int a() {
      return this.an.a(ci);
   }

   @Override
   public void a(int $$0) {
      this.an.a(ci, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cz;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cz = $$0;
   }

   @Override
   public void c() {
      this.a(cx.a(this.ag));
   }

   private boolean l(id $$0) {
      dmo $$1 = this.dM().c_($$0);
      return $$1 instanceof dml ? !((dml)$$1).d() : false;
   }

   @ayp
   public boolean gu() {
      return this.cL != null;
   }

   @Nullable
   @ayp
   public id gv() {
      return this.cL;
   }

   @ayp
   public bxr gw() {
      return this.bR;
   }

   @Override
   protected void X() {
      super.X();
      afk.a(this);
   }

   int gG() {
      return this.cF;
   }

   private void gH() {
      this.cF = 0;
   }

   void gI() {
      this.cF++;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dM().B) {
         if (this.cE > 0) {
            this.cE--;
         }

         if (this.cH > 0) {
            this.cH--;
         }

         if (this.cJ > 0) {
            this.cJ--;
         }

         boolean $$0 = this.Z_() && !this.gy() && this.p() != null && this.p().g(this) < 4.0;
         this.y($$0);
         if (this.ah % 20 == 0 && !this.gJ()) {
            this.cL = null;
         }
      }
   }

   boolean gJ() {
      if (!this.gu()) {
         return false;
      } else if (this.m(this.cL)) {
         return false;
      } else {
         dmo $$0 = this.dM().c_(this.cL);
         return $$0 != null && $$0.r() == dmq.H;
      }
   }

   public boolean gx() {
      return this.v(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gt();
      }

      this.d(8, $$0);
   }

   public boolean gy() {
      return this.v(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gK() {
      return this.v(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean m(id $$0) {
      return !this.b($$0, 32);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.an.a(ch, (byte)(this.an.a(ch) | $$0));
      } else {
         this.an.a(ch, (byte)(this.an.a(ch) & ~$$0));
      }
   }

   private boolean v(int $$0) {
      return (this.an.a(ch) & $$0) != 0;
   }

   public static brz.a gz() {
      return bqv.A().a(bsa.q, 10.0).a(bsa.j, 0.6F).a(bsa.r, 0.3F).a(bsa.c, 2.0).a(bsa.k, 48.0);
   }

   @Override
   protected cae b(czg $$0) {
      cac $$1 = new cac(this, $$0) {
         @Override
         public boolean a(id $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!ccj.this.cM.l()) {
               super.c();
            }
         }
      };
      $$1.b(false);
      $$1.a(false);
      $$1.c(true);
      return $$1;
   }

   @Override
   public boolean o(crs $$0) {
      return $$0.a(avm.S);
   }

   boolean n(id $$0) {
      return this.dM().p($$0) && this.dM().a_($$0).a(ave.U);
   }

   @Override
   protected void b(id $$0, dpi $$1) {
   }

   @Override
   protected aun v() {
      return null;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.bP;
   }

   @Override
   protected aun o_() {
      return auo.bO;
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Nullable
   public ccj b(apu $$0, bpu $$1) {
      return bqg.h.a((czg)$$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dpi $$2, id $$3) {
   }

   @Override
   public boolean aT() {
      return this.gA() && this.ah % bY == 0;
   }

   @Override
   public boolean gA() {
      return !this.aC();
   }

   public void gB() {
      this.w(false);
      this.gH();
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dM().B) {
            this.cM.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void c(avt<ela> $$0) {
      this.g(this.dp().b(0.0, 0.01, 0.0));
   }

   @Override
   public esj cJ() {
      return new esj(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.2F));
   }

   boolean b(id $$0, int $$1) {
      return $$0.a(this.dm(), (double)$$1);
   }

   public void j(id $$0) {
      this.cL = $$0;
   }

   abstract class a extends bxq {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !ccj.this.Z_();
      }

      @Override
      public boolean b() {
         return this.i() && !ccj.this.Z_();
      }
   }

   class b extends bya {
      b(brb $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && ccj.this.Z_() && !ccj.this.gy();
      }

      @Override
      public boolean b() {
         return super.b() && ccj.this.Z_() && !ccj.this.gy();
      }
   }

   static class c extends bzj<cka> {
      c(ccj $$0) {
         super($$0, cka.class, 10, true, false, $$0::a_);
      }

      @Override
      public boolean a() {
         return this.i() && super.a();
      }

      @Override
      public boolean b() {
         boolean $$0 = this.i();
         if ($$0 && this.e.p() != null) {
            return super.b();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         ccj $$0 = (ccj)this.e;
         return $$0.Z_() && !$$0.gy();
      }
   }

   class d extends ccj.a {
      @Override
      public boolean h() {
         if (ccj.this.gu() && ccj.this.gD() && ccj.this.cL.a(ccj.this.dk(), 2.0) && ccj.this.dM().c_(ccj.this.cL) instanceof dml $$1) {
            if (!$$1.d()) {
               return true;
            }

            ccj.this.cL = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (ccj.this.dM().c_(ccj.this.cL) instanceof dml $$1) {
            $$1.a(ccj.this);
         }
      }
   }

   @ayp
   public class e extends ccj.a {
      public static final int b = 600;
      int d = ccj.this.dM().z.a(10);
      private static final int e = 3;
      final List<id> f = Lists.newArrayList();
      @Nullable
      private elp g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bxq.a.a));
      }

      @Override
      public boolean h() {
         return ccj.this.cL != null && !ccj.this.fZ() && ccj.this.gD() && !this.d(ccj.this.cL) && ccj.this.dM().a_(ccj.this.cL).a(ave.aG);
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void c() {
         this.d = 0;
         this.i = 0;
         super.c();
      }

      @Override
      public void d() {
         this.d = 0;
         this.i = 0;
         ccj.this.bQ.n();
         ccj.this.bQ.g();
      }

      @Override
      public void e() {
         if (ccj.this.cL != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!ccj.this.bQ.m()) {
               if (!ccj.this.b(ccj.this.cL, 16)) {
                  if (ccj.this.m(ccj.this.cL)) {
                     this.m();
                  } else {
                     ccj.this.k(ccj.this.cL);
                  }
               } else {
                  boolean $$0 = this.a(ccj.this.cL);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && ccj.this.bQ.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = ccj.this.bQ.j();
                  }
               }
            }
         }
      }

      private boolean a(id $$0) {
         ccj.this.bQ.a(10.0F);
         ccj.this.bQ.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return ccj.this.bQ.j() != null && ccj.this.bQ.j().j();
      }

      boolean b(id $$0) {
         return this.f.contains($$0);
      }

      private void c(id $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (ccj.this.cL != null) {
            this.c(ccj.this.cL);
         }

         this.m();
      }

      private void m() {
         ccj.this.cL = null;
         ccj.this.cH = 200;
      }

      private boolean d(id $$0) {
         if (ccj.this.b($$0, 2)) {
            return true;
         } else {
            elp $$1 = ccj.this.bQ.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends ccj.a {
      private static final int c = 600;
      int d = ccj.this.dM().z.a(10);

      f() {
         this.a(EnumSet.of(bxq.a.a));
      }

      @Override
      public boolean h() {
         return ccj.this.cK != null && !ccj.this.fZ() && this.k() && ccj.this.n(ccj.this.cK) && !ccj.this.b(ccj.this.cK, 2);
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void c() {
         this.d = 0;
         super.c();
      }

      @Override
      public void d() {
         this.d = 0;
         ccj.this.bQ.n();
         ccj.this.bQ.g();
      }

      @Override
      public void e() {
         if (ccj.this.cK != null) {
            this.d++;
            if (this.d > this.a(600)) {
               ccj.this.cK = null;
            } else if (!ccj.this.bQ.m()) {
               if (ccj.this.m(ccj.this.cK)) {
                  ccj.this.cK = null;
               } else {
                  ccj.this.k(ccj.this.cK);
               }
            }
         }
      }

      private boolean k() {
         return ccj.this.cD > 2400;
      }
   }

   class g extends ccj.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (ccj.this.gG() >= 10) {
            return false;
         } else {
            return ccj.this.ag.i() < 0.3F ? false : ccj.this.gx() && ccj.this.gJ();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (ccj.this.ag.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               id $$1 = ccj.this.dm().c($$0);
               dpi $$2 = ccj.this.dM().a_($$1);
               dch $$3 = $$2.b();
               dpi $$4 = null;
               if ($$2.a(ave.aI)) {
                  if ($$3 instanceof dec) {
                     dec $$5 = (dec)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dkc) {
                     int $$6 = $$2.c(dkc.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dkc.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dcj.oi)) {
                     int $$7 = $$2.c(dkj.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dkj.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dcj.sv) || $$2.a(dcj.sw)) {
                     ((dck)$$2.b()).a((apu)ccj.this.dM(), ccj.this.ag, $$1, $$2);
                  }

                  if ($$4 != null) {
                     ccj.this.dM().c(2011, $$1, 15);
                     ccj.this.dM().b($$1, $$4);
                     ccj.this.gI();
                  }
               }
            }
         }
      }
   }

   class h extends bzi {
      h(ccj $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return ccj.this.Z_() && super.b();
      }

      @Override
      protected void a(bqv $$0, bqt $$1) {
         if ($$0 instanceof ccj && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends ccj.a {
      @Override
      public boolean h() {
         return ccj.this.cH == 0 && !ccj.this.gu() && ccj.this.gD();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         ccj.this.cH = 200;
         List<id> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (id $$1 : $$0) {
               if (!ccj.this.cN.b($$1)) {
                  ccj.this.cL = $$1;
                  return;
               }
            }

            ccj.this.cN.k();
            ccj.this.cL = $$0.get(0);
         }
      }

      private List<id> k() {
         id $$0 = ccj.this.dm();
         cbw $$1 = ((apu)ccj.this.dM()).y();
         Stream<cbx> $$2 = $$1.c($$0x -> $$0x.a(avo.c), $$0, 20, cbw.b.c);
         return $$2.map(cbx::f).filter(ccj.this::l).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bws {
      j(bqv $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!ccj.this.Z_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !ccj.this.cM.l();
      }
   }

   class k extends ccj.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dpi> f = $$0 -> {
         if ($$0.b(dpy.C) && $$0.c(dpy.C)) {
            return false;
         } else if ($$0.a(ave.U)) {
            return $$0.a(dcj.iD) ? $$0.c(dep.b) == dqe.a : true;
         } else {
            return false;
         }
      };
      private static final double g = 0.1;
      private static final int h = 25;
      private static final float i = 0.35F;
      private static final float j = 0.6F;
      private static final float k = 0.33333334F;
      private int l;
      private int m;
      private boolean n;
      @Nullable
      private esj o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bxq.a.a));
      }

      @Override
      public boolean h() {
         if (ccj.this.cJ > 0) {
            return false;
         } else if (ccj.this.gx()) {
            return false;
         } else if (ccj.this.dM().ac()) {
            return false;
         } else {
            Optional<id> $$0 = this.p();
            if ($$0.isPresent()) {
               ccj.this.cK = $$0.get();
               ccj.this.bQ.a((double)ccj.this.cK.u() + 0.5, (double)ccj.this.cK.v() + 0.5, (double)ccj.this.cK.w() + 0.5, 1.2F);
               return true;
            } else {
               ccj.this.cJ = axm.a(ccj.this.ag, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!ccj.this.u()) {
            return false;
         } else if (ccj.this.dM().ac()) {
            return false;
         } else if (this.k()) {
            return ccj.this.ag.i() < 0.2F;
         } else if (ccj.this.ah % 20 == 0 && !ccj.this.n(ccj.this.cK)) {
            ccj.this.cK = null;
            return false;
         } else {
            return true;
         }
      }

      private boolean k() {
         return this.l > 400;
      }

      boolean l() {
         return this.n;
      }

      void m() {
         this.n = false;
      }

      @Override
      public void c() {
         this.l = 0;
         this.p = 0;
         this.m = 0;
         this.n = true;
         ccj.this.gt();
      }

      @Override
      public void d() {
         if (this.k()) {
            ccj.this.w(true);
         }

         this.n = false;
         ccj.this.bQ.n();
         ccj.this.cJ = 200;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            ccj.this.cK = null;
         } else {
            esj $$0 = esj.c(ccj.this.cK).b(0.0, 0.6F, 0.0);
            if ($$0.f(ccj.this.dk()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = ccj.this.dk().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  ccj.this.cK = null;
               } else {
                  if ($$1) {
                     boolean $$3 = ccj.this.ag.a(25) == 0;
                     if ($$3) {
                        this.o = new esj($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        ccj.this.bQ.n();
                     } else {
                        $$2 = false;
                     }

                     ccj.this.G().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (ccj.this.ag.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     ccj.this.a(auo.bT, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         ccj.this.H().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (ccj.this.ag.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<id> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<id> a(Predicate<dpi> $$0, double $$1) {
         id $$2 = ccj.this.dm();
         id.a $$3 = new id.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(ccj.this.dM().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bxq {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bxq.a.a));
      }

      @Override
      public boolean a() {
         return ccj.this.bQ.l() && ccj.this.ag.a(10) == 0;
      }

      @Override
      public boolean b() {
         return ccj.this.bQ.m();
      }

      @Override
      public void c() {
         esj $$0 = this.h();
         if ($$0 != null) {
            ccj.this.bQ.a(ccj.this.bQ.a(id.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private esj h() {
         esj $$1;
         if (ccj.this.gJ() && !ccj.this.b(ccj.this.cL, 22)) {
            esj $$0 = esj.b(ccj.this.cL);
            $$1 = $$0.d(ccj.this.dk()).d();
         } else {
            $$1 = ccj.this.f(0.0F);
         }

         int $$3 = 8;
         esj $$4 = cbp.a(ccj.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cbl.a(ccj.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
