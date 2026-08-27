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

public class cbf extends cbe implements bpv, cbn {
   public static final float bX = 120.32113F;
   public static final int bY = aww.f(1.4959966F);
   private static final aim<Byte> ch = aiq.a(cbf.class, aio.a);
   private static final aim<Integer> ci = aiq.a(cbf.class, aio.b);
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
   private static final bmo cx = axv.a(20, 39);
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
   int cJ = aww.a(this.ag, 20, 60);
   @Nullable
   ib cK;
   @Nullable
   ib cL;
   cbf.k cM;
   cbf.e cN;
   private cbf.f cO;
   private int cP;

   public cbf(bpd<? extends cbf> $$0, cxb $$1) {
      super($$0, $$1);
      this.bO = new bvm(this, 20, true);
      this.bN = new cbf.j(this);
      this.a(ejg.n, -1.0F);
      this.a(ejg.j, -1.0F);
      this.a(ejg.k, 16.0F);
      this.a(ejg.x, -1.0F);
      this.a(ejg.h, -1.0F);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(ch, (byte)0);
      $$0.a(ci, 0);
   }

   @Override
   public float a(ib $$0, cxe $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void z() {
      this.bR.a(0, new cbf.b(this, 1.4F, true));
      this.bR.a(1, new cbf.d());
      this.bR.a(2, new bvy(this, 1.0));
      this.bR.a(3, new bxu(this, 1.25, ctm.a(auv.S), false));
      this.cM = new cbf.k();
      this.bR.a(4, this.cM);
      this.bR.a(5, new bwl(this, 1.25));
      this.bR.a(5, new cbf.i());
      this.cN = new cbf.e();
      this.bR.a(5, this.cN);
      this.cO = new cbf.f();
      this.bR.a(6, this.cO);
      this.bR.a(7, new cbf.g());
      this.bR.a(8, new cbf.l());
      this.bR.a(9, new bwg(this));
      this.bS.a(1, new cbf.h(this).a(new Class[0]));
      this.bS.a(2, new cbf.c(this));
      this.bS.a(3, new byl<>(this, true));
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      if (this.gu()) {
         $$0.a("hive_pos", tp.a(this.gv()));
      }

      if (this.s()) {
         $$0.a("flower_pos", tp.a(this.r()));
      }

      $$0.a("HasNectar", this.gx());
      $$0.a("HasStung", this.gy());
      $$0.a("TicksSincePollination", this.cD);
      $$0.a("CannotEnterHiveTicks", this.cE);
      $$0.a("CropsGrownSincePollination", this.cF);
      this.c($$0);
   }

   @Override
   public void a(ta $$0) {
      this.cL = tp.a($$0, "hive_pos").orElse(null);
      this.cK = tp.a($$0, "flower_pos").orElse(null);
      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cD = $$0.h("TicksSincePollination");
      this.cE = $$0.h("CannotEnterHiveTicks");
      this.cF = $$0.h("CropsGrownSincePollination");
      this.a(this.dM(), $$0);
   }

   @Override
   public boolean C(box $$0) {
      boolean $$1 = $$0.a(this.dN().a((bpp)this), (float)((int)this.g(bqw.c)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof bpp) {
            ((bpp)$$0).r(((bpp)$$0).eR() + 1);
            int $$2 = 0;
            if (this.dM().aj() == bna.c) {
               $$2 = 10;
            } else if (this.dM().aj() == bna.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((bpp)$$0).b(new bok(bom.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.V_();
         this.a(aty.bS, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.gx() && this.gG() < 10 && this.ag.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ag.a(2) + 1; $$0++) {
            this.a(this.dM(), this.dr() - 0.3F, this.dr() + 0.3F, this.dx() - 0.3F, this.dx() + 0.3F, this.e(0.5), kc.aw);
         }
      }

      this.gE();
   }

   private void a(cxb $$0, double $$1, double $$2, double $$3, double $$4, double $$5, ka $$6) {
      $$0.a($$6, aww.d($$0.z.j(), $$1, $$2), $$5, aww.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(ib $$0) {
      ept $$1 = ept.c($$0);
      int $$2 = 0;
      ib $$3 = this.dm();
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

      ept $$8 = cai.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bQ.a(0.5F);
         this.bQ.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public ib r() {
      return this.cK;
   }

   public boolean s() {
      return this.cK != null;
   }

   public void i(ib $$0) {
      this.cK = $$0;
   }

   @axz
   public int y() {
      return Math.max(this.cN.d, this.cO.d);
   }

   @axz
   public List<ib> gn() {
      return this.cN.f;
   }

   private boolean gC() {
      return this.cD > 3600;
   }

   boolean gD() {
      if (this.cE <= 0 && !this.cM.l() && !this.gy() && this.p() == null) {
         boolean $$0 = this.gC() || this.dM().ab() || this.dM().Q() || this.gx();
         return $$0 && !this.gF();
      } else {
         return false;
      }
   }

   public void u(int $$0) {
      this.cE = $$0;
   }

   public float G(float $$0) {
      return aww.i($$0, this.cB, this.cA);
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
         if (this.cC % 5 == 0 && this.ag.a(aww.a(1200 - this.cC, 1, 1200)) == 0) {
            this.a(this.dN().n(), this.ex());
         }
      }

      if (!this.gx()) {
         this.cD++;
      }

      if (!this.dM().B) {
         this.a((apf)this.dM(), false);
      }
   }

   public void gt() {
      this.cD = 0;
   }

   private boolean gF() {
      if (this.cL == null) {
         return false;
      } else {
         dki $$0 = this.dM().c_(this.cL);
         return $$0 instanceof dkf && ((dkf)$$0).b();
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

   private boolean k(ib $$0) {
      dki $$1 = this.dM().c_($$0);
      return $$1 instanceof dkf ? !((dkf)$$1).d() : false;
   }

   @axz
   public boolean gu() {
      return this.cL != null;
   }

   @Nullable
   @axz
   public ib gv() {
      return this.cL;
   }

   @axz
   public bwn gw() {
      return this.bR;
   }

   @Override
   protected void X() {
      super.X();
      aew.a(this);
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
   public void m_() {
      super.m_();
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

         boolean $$0 = this.Y_() && !this.gy() && this.p() != null && this.p().g(this) < 4.0;
         this.y($$0);
         if (this.ah % 20 == 0 && !this.gJ()) {
            this.cL = null;
         }
      }
   }

   boolean gJ() {
      if (!this.gu()) {
         return false;
      } else if (this.l(this.cL)) {
         return false;
      } else {
         dki $$0 = this.dM().c_(this.cL);
         return $$0 != null && $$0.r() == dkk.H;
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

   boolean l(ib $$0) {
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

   public static bqv.a gz() {
      return bpr.A().a(bqw.q, 10.0).a(bqw.j, 0.6F).a(bqw.r, 0.3F).a(bqw.c, 2.0).a(bqw.k, 48.0);
   }

   @Override
   protected bza b(cxb $$0) {
      byy $$1 = new byy(this, $$0) {
         @Override
         public boolean a(ib $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!cbf.this.cM.l()) {
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
   public boolean o(cqm $$0) {
      return $$0.a(auv.S);
   }

   boolean m(ib $$0) {
      return this.dM().p($$0) && this.dM().a_($$0).a(aun.U);
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
   }

   @Override
   protected atx v() {
      return null;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.bP;
   }

   @Override
   protected atx n_() {
      return aty.bO;
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Nullable
   public cbf b(apf $$0, bos $$1) {
      return bpd.i.a((cxb)$$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dnb $$2, ib $$3) {
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
   public boolean a(bnw $$0, float $$1) {
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
   protected void c(avd<eio> $$0) {
      this.g(this.dp().b(0.0, 0.01, 0.0));
   }

   @Override
   public ept cJ() {
      return new ept(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.2F));
   }

   boolean b(ib $$0, int $$1) {
      return $$0.a(this.dm(), (double)$$1);
   }

   abstract class a extends bwm {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !cbf.this.Y_();
      }

      @Override
      public boolean b() {
         return this.i() && !cbf.this.Y_();
      }
   }

   class b extends bww {
      b(bpx $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && cbf.this.Y_() && !cbf.this.gy();
      }

      @Override
      public boolean b() {
         return super.b() && cbf.this.Y_() && !cbf.this.gy();
      }
   }

   static class c extends byf<ciu> {
      c(cbf $$0) {
         super($$0, ciu.class, 10, true, false, $$0::a_);
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
         cbf $$0 = (cbf)this.e;
         return $$0.Y_() && !$$0.gy();
      }
   }

   class d extends cbf.a {
      @Override
      public boolean h() {
         if (cbf.this.gu() && cbf.this.gD() && cbf.this.cL.a(cbf.this.dk(), 2.0) && cbf.this.dM().c_(cbf.this.cL) instanceof dkf $$1) {
            if (!$$1.d()) {
               return true;
            }

            cbf.this.cL = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (cbf.this.dM().c_(cbf.this.cL) instanceof dkf $$1) {
            $$1.a(cbf.this, cbf.this.gx());
         }
      }
   }

   @axz
   public class e extends cbf.a {
      public static final int b = 600;
      int d = cbf.this.dM().z.a(10);
      private static final int e = 3;
      final List<ib> f = Lists.newArrayList();
      @Nullable
      private ejd g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bwm.a.a));
      }

      @Override
      public boolean h() {
         return cbf.this.cL != null && !cbf.this.fZ() && cbf.this.gD() && !this.d(cbf.this.cL) && cbf.this.dM().a_(cbf.this.cL).a(aun.aG);
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
         cbf.this.bQ.n();
         cbf.this.bQ.g();
      }

      @Override
      public void e() {
         if (cbf.this.cL != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!cbf.this.bQ.m()) {
               if (!cbf.this.b(cbf.this.cL, 16)) {
                  if (cbf.this.l(cbf.this.cL)) {
                     this.m();
                  } else {
                     cbf.this.j(cbf.this.cL);
                  }
               } else {
                  boolean $$0 = this.a(cbf.this.cL);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cbf.this.bQ.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = cbf.this.bQ.j();
                  }
               }
            }
         }
      }

      private boolean a(ib $$0) {
         cbf.this.bQ.a(10.0F);
         cbf.this.bQ.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return cbf.this.bQ.j() != null && cbf.this.bQ.j().j();
      }

      boolean b(ib $$0) {
         return this.f.contains($$0);
      }

      private void c(ib $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cbf.this.cL != null) {
            this.c(cbf.this.cL);
         }

         this.m();
      }

      private void m() {
         cbf.this.cL = null;
         cbf.this.cH = 200;
      }

      private boolean d(ib $$0) {
         if (cbf.this.b($$0, 2)) {
            return true;
         } else {
            ejd $$1 = cbf.this.bQ.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cbf.a {
      private static final int c = 600;
      int d = cbf.this.dM().z.a(10);

      f() {
         this.a(EnumSet.of(bwm.a.a));
      }

      @Override
      public boolean h() {
         return cbf.this.cK != null && !cbf.this.fZ() && this.k() && cbf.this.m(cbf.this.cK) && !cbf.this.b(cbf.this.cK, 2);
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
         cbf.this.bQ.n();
         cbf.this.bQ.g();
      }

      @Override
      public void e() {
         if (cbf.this.cK != null) {
            this.d++;
            if (this.d > this.a(600)) {
               cbf.this.cK = null;
            } else if (!cbf.this.bQ.m()) {
               if (cbf.this.l(cbf.this.cK)) {
                  cbf.this.cK = null;
               } else {
                  cbf.this.j(cbf.this.cK);
               }
            }
         }
      }

      private boolean k() {
         return cbf.this.cD > 2400;
      }
   }

   class g extends cbf.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cbf.this.gG() >= 10) {
            return false;
         } else {
            return cbf.this.ag.i() < 0.3F ? false : cbf.this.gx() && cbf.this.gJ();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (cbf.this.ag.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               ib $$1 = cbf.this.dm().c($$0);
               dnb $$2 = cbf.this.dM().a_($$1);
               dac $$3 = $$2.b();
               dnb $$4 = null;
               if ($$2.a(aun.aI)) {
                  if ($$3 instanceof dbx) {
                     dbx $$5 = (dbx)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dhx) {
                     int $$6 = $$2.c(dhx.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dhx.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dae.oi)) {
                     int $$7 = $$2.c(die.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(die.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dae.sv) || $$2.a(dae.sw)) {
                     ((daf)$$2.b()).a((apf)cbf.this.dM(), cbf.this.ag, $$1, $$2);
                  }

                  if ($$4 != null) {
                     cbf.this.dM().c(2011, $$1, 15);
                     cbf.this.dM().b($$1, $$4);
                     cbf.this.gI();
                  }
               }
            }
         }
      }
   }

   class h extends bye {
      h(cbf $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return cbf.this.Y_() && super.b();
      }

      @Override
      protected void a(bpr $$0, bpp $$1) {
         if ($$0 instanceof cbf && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cbf.a {
      @Override
      public boolean h() {
         return cbf.this.cH == 0 && !cbf.this.gu() && cbf.this.gD();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         cbf.this.cH = 200;
         List<ib> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (ib $$1 : $$0) {
               if (!cbf.this.cN.b($$1)) {
                  cbf.this.cL = $$1;
                  return;
               }
            }

            cbf.this.cN.k();
            cbf.this.cL = $$0.get(0);
         }
      }

      private List<ib> k() {
         ib $$0 = cbf.this.dm();
         cas $$1 = ((apf)cbf.this.dM()).y();
         Stream<cat> $$2 = $$1.c($$0x -> $$0x.a(auy.c), $$0, 20, cas.b.c);
         return $$2.map(cat::f).filter(cbf.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bvo {
      j(bpr $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cbf.this.Y_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cbf.this.cM.l();
      }
   }

   class k extends cbf.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dnb> f = $$0 -> {
         if ($$0.b(dnr.C) && $$0.c(dnr.C)) {
            return false;
         } else if ($$0.a(aun.U)) {
            return $$0.a(dae.iD) ? $$0.c(dck.b) == dnx.a : true;
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
      private ept o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bwm.a.a));
      }

      @Override
      public boolean h() {
         if (cbf.this.cJ > 0) {
            return false;
         } else if (cbf.this.gx()) {
            return false;
         } else if (cbf.this.dM().ab()) {
            return false;
         } else {
            Optional<ib> $$0 = this.p();
            if ($$0.isPresent()) {
               cbf.this.cK = $$0.get();
               cbf.this.bQ.a((double)cbf.this.cK.u() + 0.5, (double)cbf.this.cK.v() + 0.5, (double)cbf.this.cK.w() + 0.5, 1.2F);
               return true;
            } else {
               cbf.this.cJ = aww.a(cbf.this.ag, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!cbf.this.s()) {
            return false;
         } else if (cbf.this.dM().ab()) {
            return false;
         } else if (this.k()) {
            return cbf.this.ag.i() < 0.2F;
         } else if (cbf.this.ah % 20 == 0 && !cbf.this.m(cbf.this.cK)) {
            cbf.this.cK = null;
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
         cbf.this.gt();
      }

      @Override
      public void d() {
         if (this.k()) {
            cbf.this.w(true);
         }

         this.n = false;
         cbf.this.bQ.n();
         cbf.this.cJ = 200;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            cbf.this.cK = null;
         } else {
            ept $$0 = ept.c(cbf.this.cK).b(0.0, 0.6F, 0.0);
            if ($$0.f(cbf.this.dk()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = cbf.this.dk().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  cbf.this.cK = null;
               } else {
                  if ($$1) {
                     boolean $$3 = cbf.this.ag.a(25) == 0;
                     if ($$3) {
                        this.o = new ept($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        cbf.this.bQ.n();
                     } else {
                        $$2 = false;
                     }

                     cbf.this.G().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (cbf.this.ag.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     cbf.this.a(aty.bT, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         cbf.this.H().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (cbf.this.ag.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<ib> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<ib> a(Predicate<dnb> $$0, double $$1) {
         ib $$2 = cbf.this.dm();
         ib.a $$3 = new ib.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(cbf.this.dM().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bwm {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bwm.a.a));
      }

      @Override
      public boolean a() {
         return cbf.this.bQ.l() && cbf.this.ag.a(10) == 0;
      }

      @Override
      public boolean b() {
         return cbf.this.bQ.m();
      }

      @Override
      public void c() {
         ept $$0 = this.h();
         if ($$0 != null) {
            cbf.this.bQ.a(cbf.this.bQ.a(ib.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private ept h() {
         ept $$1;
         if (cbf.this.gJ() && !cbf.this.b(cbf.this.cL, 22)) {
            ept $$0 = ept.b(cbf.this.cL);
            $$1 = $$0.d(cbf.this.dk()).d();
         } else {
            $$1 = cbf.this.f(0.0F);
         }

         int $$3 = 8;
         ept $$4 = cal.a(cbf.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cah.a(cbf.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
