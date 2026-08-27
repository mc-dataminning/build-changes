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

public class bwx extends bww implements bls, bxf {
   public static final float bT = 120.32113F;
   public static final int bU = atq.f(1.4959966F);
   private static final afs<Byte> cd = afv.a(bwx.class, afu.a);
   private static final afs<Integer> ce = afv.a(bwx.class, afu.b);
   private static final int cf = 2;
   private static final int cg = 4;
   private static final int ch = 8;
   private static final int ci = 1200;
   private static final int cj = 2400;
   private static final int ck = 3600;
   private static final int cl = 4;
   private static final int cm = 10;
   private static final int cn = 10;
   private static final int co = 18;
   private static final int cp = 32;
   private static final int cq = 2;
   private static final int cr = 16;
   private static final int cs = 20;
   public static final String bW = "CropsGrownSincePollination";
   public static final String bX = "CannotEnterHiveTicks";
   public static final String bY = "TicksSincePollination";
   public static final String bZ = "HasStung";
   public static final String ca = "HasNectar";
   public static final String cb = "FlowerPos";
   public static final String cc = "HivePos";
   private static final bim ct = aup.a(20, 39);
   @Nullable
   private UUID cu;
   private float cv;
   private float cw;
   private int cx;
   int cy;
   private int cz;
   private int cA;
   private static final int cB = 200;
   int cC;
   private static final int cD = 200;
   int cE = atq.a(this.ag, 20, 60);
   @Nullable
   hx cF;
   @Nullable
   hx cG;
   bwx.k cH;
   bwx.e cI;
   private bwx.f cJ;
   private int cK;

   public bwx(bkz<? extends bwx> $$0, csf $$1) {
      super($$0, $$1);
      this.bL = new brg(this, 20, true);
      this.bK = new bwx.j(this);
      this.a(edi.n, -1.0F);
      this.a(edi.j, -1.0F);
      this.a(edi.k, 16.0F);
      this.a(edi.x, -1.0F);
      this.a(edi.h, -1.0F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cd, (byte)0);
      this.an.a(ce, 0);
   }

   @Override
   public float a(hx $$0, csi $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void B() {
      this.bO.a(0, new bwx.b(this, 1.4F, true));
      this.bO.a(1, new bwx.d());
      this.bO.a(2, new brs(this, 1.0));
      this.bO.a(3, new bto(this, 1.25, coq.a(ars.S), false));
      this.cH = new bwx.k();
      this.bO.a(4, this.cH);
      this.bO.a(5, new bsf(this, 1.25));
      this.bO.a(5, new bwx.i());
      this.cI = new bwx.e();
      this.bO.a(5, this.cI);
      this.cJ = new bwx.f();
      this.bO.a(6, this.cJ);
      this.bO.a(7, new bwx.g());
      this.bO.a(8, new bwx.l());
      this.bO.a(9, new bsa(this));
      this.bP.a(1, new bwx.h(this).a(new Class[0]));
      this.bP.a(2, new bwx.c(this));
      this.bP.a(3, new buf<>(this, true));
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      if (this.gm()) {
         $$0.a("HivePos", ss.a(this.gn()));
      }

      if (this.w()) {
         $$0.a("FlowerPos", ss.a(this.u()));
      }

      $$0.a("HasNectar", this.gp());
      $$0.a("HasStung", this.gq());
      $$0.a("TicksSincePollination", this.cy);
      $$0.a("CannotEnterHiveTicks", this.cz);
      $$0.a("CropsGrownSincePollination", this.cA);
      this.c($$0);
   }

   @Override
   public void a(sd $$0) {
      this.cG = null;
      if ($$0.e("HivePos")) {
         this.cG = ss.b($$0.p("HivePos"));
      }

      this.cF = null;
      if ($$0.e("FlowerPos")) {
         this.cF = ss.b($$0.p("FlowerPos"));
      }

      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cy = $$0.h("TicksSincePollination");
      this.cz = $$0.h("CannotEnterHiveTicks");
      this.cA = $$0.h("CropsGrownSincePollination");
      this.a(this.dN(), $$0);
   }

   @Override
   public boolean C(bkv $$0) {
      boolean $$1 = $$0.a(this.dO().a((bll)this), (float)((int)this.b(bmr.c)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof bll) {
            ((bll)$$0).q(((bll)$$0).eQ() + 1);
            int $$2 = 0;
            if (this.dN().aj() == biy.c) {
               $$2 = 10;
            } else if (this.dN().aj() == biy.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((bll)$$0).b(new bki(bkk.s, $$2 * 20, 0), this);
            }
         }

         this.x(true);
         this.X_();
         this.a(aqv.bD, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void l() {
      super.l();
      if (this.gp() && this.gy() < 10 && this.ag.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ag.a(2) + 1; $$0++) {
            this.a(this.dN(), this.ds() - 0.3F, this.ds() + 0.3F, this.dy() - 0.3F, this.dy() + 0.3F, this.e(0.5), jw.at);
         }
      }

      this.gw();
   }

   private void a(csf $$0, double $$1, double $$2, double $$3, double $$4, double $$5, ju $$6) {
      $$0.a($$6, atq.d($$0.z.j(), $$1, $$2), $$5, atq.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(hx $$0) {
      ejz $$1 = ejz.c($$0);
      int $$2 = 0;
      hx $$3 = this.dn();
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

      ejz $$8 = bwa.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bN.a(0.5F);
         this.bN.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public hx u() {
      return this.cF;
   }

   public boolean w() {
      return this.cF != null;
   }

   public void i(hx $$0) {
      this.cF = $$0;
   }

   @aut
   public int A() {
      return Math.max(this.cI.d, this.cJ.d);
   }

   @aut
   public List<hx> gf() {
      return this.cI.f;
   }

   private boolean gu() {
      return this.cy > 3600;
   }

   boolean gv() {
      if (this.cz <= 0 && !this.cH.l() && !this.gq() && this.q() == null) {
         boolean $$0 = this.gu() || this.dN().aa() || this.dN().P() || this.gp();
         return $$0 && !this.gx();
      } else {
         return false;
      }
   }

   public void t(int $$0) {
      this.cz = $$0;
   }

   public float E(float $$0) {
      return atq.i($$0, this.cw, this.cv);
   }

   private void gw() {
      this.cw = this.cv;
      if (this.gC()) {
         this.cv = Math.min(1.0F, this.cv + 0.2F);
      } else {
         this.cv = Math.max(0.0F, this.cv - 0.24F);
      }
   }

   @Override
   protected void Z() {
      boolean $$0 = this.gq();
      if (this.bc()) {
         this.cK++;
      } else {
         this.cK = 0;
      }

      if (this.cK > 20) {
         this.a(this.dO().h(), 1.0F);
      }

      if ($$0) {
         this.cx++;
         if (this.cx % 5 == 0 && this.ag.a(atq.a(1200 - this.cx, 1, 1200)) == 0) {
            this.a(this.dO().n(), this.ew());
         }
      }

      if (!this.gp()) {
         this.cy++;
      }

      if (!this.dN().B) {
         this.a((ami)this.dN(), false);
      }
   }

   public void gl() {
      this.cy = 0;
   }

   private boolean gx() {
      if (this.cG == null) {
         return false;
      } else {
         dfi $$0 = this.dN().c_(this.cG);
         return $$0 instanceof dff && ((dff)$$0).c();
      }
   }

   @Override
   public int a() {
      return this.an.b(ce);
   }

   @Override
   public void a(int $$0) {
      this.an.b(ce, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cu;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cu = $$0;
   }

   @Override
   public void c() {
      this.a(ct.a(this.ag));
   }

   private boolean k(hx $$0) {
      dfi $$1 = this.dN().c_($$0);
      return $$1 instanceof dff ? !((dff)$$1).f() : false;
   }

   @aut
   public boolean gm() {
      return this.cG != null;
   }

   @Nullable
   @aut
   public hx gn() {
      return this.cG;
   }

   @aut
   public bsh go() {
      return this.bO;
   }

   @Override
   protected void Y() {
      super.Y();
      aco.a(this);
   }

   int gy() {
      return this.cA;
   }

   private void gz() {
      this.cA = 0;
   }

   void gA() {
      this.cA++;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dN().B) {
         if (this.cz > 0) {
            this.cz--;
         }

         if (this.cC > 0) {
            this.cC--;
         }

         if (this.cE > 0) {
            this.cE--;
         }

         boolean $$0 = this.aa_() && !this.gq() && this.q() != null && this.q().f(this) < 4.0;
         this.y($$0);
         if (this.ah % 20 == 0 && !this.gB()) {
            this.cG = null;
         }
      }
   }

   boolean gB() {
      if (!this.gm()) {
         return false;
      } else if (this.l(this.cG)) {
         return false;
      } else {
         dfi $$0 = this.dN().c_(this.cG);
         return $$0 != null && $$0.v() == dfk.H;
      }
   }

   public boolean gp() {
      return this.u(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gl();
      }

      this.d(8, $$0);
   }

   public boolean gq() {
      return this.u(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gC() {
      return this.u(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(hx $$0) {
      return !this.b($$0, 32);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.an.b(cd, (byte)(this.an.b(cd) | $$0));
      } else {
         this.an.b(cd, (byte)(this.an.b(cd) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.an.b(cd) & $$0) != 0;
   }

   public static bmq.a gr() {
      return bln.C().a(bmr.l, 10.0).a(bmr.f, 0.6F).a(bmr.m, 0.3F).a(bmr.c, 2.0).a(bmr.g, 48.0);
   }

   @Override
   protected buu b(csf $$0) {
      bus $$1 = new bus(this, $$0) {
         @Override
         public boolean a(hx $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!bwx.this.cH.l()) {
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
   public boolean m(clo $$0) {
      return $$0.a(ars.S);
   }

   boolean m(hx $$0) {
      return this.dN().o($$0) && this.dN().a_($$0).a(ark.U);
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
   }

   @Override
   protected aqu y() {
      return null;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.bA;
   }

   @Override
   protected aqu n_() {
      return aqv.bz;
   }

   @Override
   protected float eX() {
      return 0.4F;
   }

   @Nullable
   public bwx b(ami $$0, bkq $$1) {
      return bkz.h.a((csf)$$0);
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return this.o_() ? $$1.b * 0.5F : $$1.b * 0.5F;
   }

   @Override
   protected void a(double $$0, boolean $$1, dhn $$2, hx $$3) {
   }

   @Override
   public boolean aT() {
      return this.gs() && this.ah % bU == 0;
   }

   @Override
   public boolean gs() {
      return !this.aC();
   }

   public void gt() {
      this.w(false);
      this.gz();
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dN().B) {
            this.cH.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public blq eT() {
      return blq.c;
   }

   @Override
   protected void c(arz<ecw> $$0) {
      this.g(this.dq().b(0.0, 0.01, 0.0));
   }

   @Override
   public ejz cJ() {
      return new ejz(0.0, (double)(0.5F * this.cI()), (double)(this.dh() * 0.2F));
   }

   boolean b(hx $$0, int $$1) {
      return $$0.a(this.dn(), (double)$$1);
   }

   abstract class a extends bsg {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !bwx.this.aa_();
      }

      @Override
      public boolean b() {
         return this.i() && !bwx.this.aa_();
      }
   }

   class b extends bsq {
      b(blu $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && bwx.this.aa_() && !bwx.this.gq();
      }

      @Override
      public boolean b() {
         return super.b() && bwx.this.aa_() && !bwx.this.gq();
      }
   }

   static class c extends btz<cdz> {
      c(bwx $$0) {
         super($$0, cdz.class, 10, true, false, $$0::a_);
      }

      @Override
      public boolean a() {
         return this.i() && super.a();
      }

      @Override
      public boolean b() {
         boolean $$0 = this.i();
         if ($$0 && this.e.q() != null) {
            return super.b();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         bwx $$0 = (bwx)this.e;
         return $$0.aa_() && !$$0.gq();
      }
   }

   class d extends bwx.a {
      @Override
      public boolean h() {
         if (bwx.this.gm() && bwx.this.gv() && bwx.this.cG.a(bwx.this.dl(), 2.0) && bwx.this.dN().c_(bwx.this.cG) instanceof dff $$1) {
            if (!$$1.f()) {
               return true;
            }

            bwx.this.cG = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (bwx.this.dN().c_(bwx.this.cG) instanceof dff $$1) {
            $$1.a(bwx.this, bwx.this.gp());
         }
      }
   }

   @aut
   public class e extends bwx.a {
      public static final int b = 600;
      int d = bwx.this.dN().z.a(10);
      private static final int e = 3;
      final List<hx> f = Lists.newArrayList();
      @Nullable
      private edm g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bsg.a.a));
      }

      @Override
      public boolean h() {
         return bwx.this.cG != null && !bwx.this.fR() && bwx.this.gv() && !this.d(bwx.this.cG) && bwx.this.dN().a_(bwx.this.cG).a(ark.aF);
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
         bwx.this.bN.n();
         bwx.this.bN.g();
      }

      @Override
      public void e() {
         if (bwx.this.cG != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!bwx.this.bN.m()) {
               if (!bwx.this.b(bwx.this.cG, 16)) {
                  if (bwx.this.l(bwx.this.cG)) {
                     this.m();
                  } else {
                     bwx.this.j(bwx.this.cG);
                  }
               } else {
                  boolean $$0 = this.a(bwx.this.cG);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && bwx.this.bN.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = bwx.this.bN.j();
                  }
               }
            }
         }
      }

      private boolean a(hx $$0) {
         bwx.this.bN.a(10.0F);
         bwx.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return bwx.this.bN.j() != null && bwx.this.bN.j().j();
      }

      boolean b(hx $$0) {
         return this.f.contains($$0);
      }

      private void c(hx $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (bwx.this.cG != null) {
            this.c(bwx.this.cG);
         }

         this.m();
      }

      private void m() {
         bwx.this.cG = null;
         bwx.this.cC = 200;
      }

      private boolean d(hx $$0) {
         if (bwx.this.b($$0, 2)) {
            return true;
         } else {
            edm $$1 = bwx.this.bN.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends bwx.a {
      private static final int c = 600;
      int d = bwx.this.dN().z.a(10);

      f() {
         this.a(EnumSet.of(bsg.a.a));
      }

      @Override
      public boolean h() {
         return bwx.this.cF != null && !bwx.this.fR() && this.k() && bwx.this.m(bwx.this.cF) && !bwx.this.b(bwx.this.cF, 2);
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
         bwx.this.bN.n();
         bwx.this.bN.g();
      }

      @Override
      public void e() {
         if (bwx.this.cF != null) {
            this.d++;
            if (this.d > this.a(600)) {
               bwx.this.cF = null;
            } else if (!bwx.this.bN.m()) {
               if (bwx.this.l(bwx.this.cF)) {
                  bwx.this.cF = null;
               } else {
                  bwx.this.j(bwx.this.cF);
               }
            }
         }
      }

      private boolean k() {
         return bwx.this.cy > 2400;
      }
   }

   class g extends bwx.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (bwx.this.gy() >= 10) {
            return false;
         } else {
            return bwx.this.ag.i() < 0.3F ? false : bwx.this.gp() && bwx.this.gB();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (bwx.this.ag.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               hx $$1 = bwx.this.dn().c($$0);
               dhn $$2 = bwx.this.dN().a_($$1);
               cvf $$3 = $$2.b();
               dhn $$4 = null;
               if ($$2.a(ark.aH)) {
                  if ($$3 instanceof cxa) {
                     cxa $$5 = (cxa)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dda) {
                     int $$6 = $$2.c(dda.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dda.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(cvh.oi)) {
                     int $$7 = $$2.c(ddh.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(ddh.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(cvh.sv) || $$2.a(cvh.sw)) {
                     ((cvi)$$2.b()).a((ami)bwx.this.dN(), bwx.this.ag, $$1, $$2);
                  }

                  if ($$4 != null) {
                     bwx.this.dN().c(2005, $$1, 0);
                     bwx.this.dN().b($$1, $$4);
                     bwx.this.gA();
                  }
               }
            }
         }
      }
   }

   class h extends bty {
      h(bwx $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return bwx.this.aa_() && super.b();
      }

      @Override
      protected void a(bln $$0, bll $$1) {
         if ($$0 instanceof bwx && this.e.E($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends bwx.a {
      @Override
      public boolean h() {
         return bwx.this.cC == 0 && !bwx.this.gm() && bwx.this.gv();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         bwx.this.cC = 200;
         List<hx> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (hx $$1 : $$0) {
               if (!bwx.this.cI.b($$1)) {
                  bwx.this.cG = $$1;
                  return;
               }
            }

            bwx.this.cI.k();
            bwx.this.cG = $$0.get(0);
         }
      }

      private List<hx> k() {
         hx $$0 = bwx.this.dn();
         bwk $$1 = ((ami)bwx.this.dN()).x();
         Stream<bwl> $$2 = $$1.c($$0x -> $$0x.a(aru.c), $$0, 20, bwk.b.c);
         return $$2.map(bwl::f).filter(bwx.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bri {
      j(bln $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!bwx.this.aa_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bwx.this.cH.l();
      }
   }

   class k extends bwx.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dhn> f = $$0 -> {
         if ($$0.b(did.C) && $$0.c(did.C)) {
            return false;
         } else if ($$0.a(ark.U)) {
            return $$0.a(cvh.iD) ? $$0.c(cxn.b) == dij.a : true;
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
      private ejz o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bsg.a.a));
      }

      @Override
      public boolean h() {
         if (bwx.this.cE > 0) {
            return false;
         } else if (bwx.this.gp()) {
            return false;
         } else if (bwx.this.dN().aa()) {
            return false;
         } else {
            Optional<hx> $$0 = this.p();
            if ($$0.isPresent()) {
               bwx.this.cF = $$0.get();
               bwx.this.bN.a((double)bwx.this.cF.u() + 0.5, (double)bwx.this.cF.v() + 0.5, (double)bwx.this.cF.w() + 0.5, 1.2F);
               return true;
            } else {
               bwx.this.cE = atq.a(bwx.this.ag, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!bwx.this.w()) {
            return false;
         } else if (bwx.this.dN().aa()) {
            return false;
         } else if (this.k()) {
            return bwx.this.ag.i() < 0.2F;
         } else if (bwx.this.ah % 20 == 0 && !bwx.this.m(bwx.this.cF)) {
            bwx.this.cF = null;
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
         bwx.this.gl();
      }

      @Override
      public void d() {
         if (this.k()) {
            bwx.this.w(true);
         }

         this.n = false;
         bwx.this.bN.n();
         bwx.this.cE = 200;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            bwx.this.cF = null;
         } else {
            ejz $$0 = ejz.c(bwx.this.cF).b(0.0, 0.6F, 0.0);
            if ($$0.f(bwx.this.dl()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = bwx.this.dl().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  bwx.this.cF = null;
               } else {
                  if ($$1) {
                     boolean $$3 = bwx.this.ag.a(25) == 0;
                     if ($$3) {
                        this.o = new ejz($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        bwx.this.bN.n();
                     } else {
                        $$2 = false;
                     }

                     bwx.this.I().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (bwx.this.ag.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     bwx.this.a(aqv.bE, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         bwx.this.K().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (bwx.this.ag.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<hx> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<hx> a(Predicate<dhn> $$0, double $$1) {
         hx $$2 = bwx.this.dn();
         hx.a $$3 = new hx.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(bwx.this.dN().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bsg {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bsg.a.a));
      }

      @Override
      public boolean a() {
         return bwx.this.bN.l() && bwx.this.ag.a(10) == 0;
      }

      @Override
      public boolean b() {
         return bwx.this.bN.m();
      }

      @Override
      public void c() {
         ejz $$0 = this.h();
         if ($$0 != null) {
            bwx.this.bN.a(bwx.this.bN.a(hx.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private ejz h() {
         ejz $$1;
         if (bwx.this.gB() && !bwx.this.b(bwx.this.cG, 22)) {
            ejz $$0 = ejz.b(bwx.this.cG);
            $$1 = $$0.d(bwx.this.dl()).d();
         } else {
            $$1 = bwx.this.f(0.0F);
         }

         int $$3 = 8;
         ejz $$4 = bwd.a(bwx.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : bvz.a(bwx.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
