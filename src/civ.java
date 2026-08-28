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

public class civ extends ciu implements bxj, cji {
   public static final float bG = 120.32113F;
   public static final int bH = azm.f(1.4959966F);
   private static final akj<Byte> bQ = akn.a(civ.class, akl.a);
   private static final akj<Integer> bR = akn.a(civ.class, akl.b);
   private static final int bS = 2;
   private static final int bT = 4;
   private static final int bU = 8;
   private static final int bV = 1200;
   private static final int bW = 600;
   private static final int bX = 3600;
   private static final int bY = 4;
   private static final int bZ = 10;
   private static final int ca = 10;
   private static final int cb = 18;
   private static final int cc = 48;
   private static final int cd = 2;
   private static final int ce = 24;
   private static final int cf = 16;
   private static final int cg = 16;
   private static final int ch = 20;
   public static final String bI = "CropsGrownSincePollination";
   public static final String bK = "CannotEnterHiveTicks";
   public static final String bL = "TicksSincePollination";
   public static final String bM = "HasStung";
   public static final String bN = "HasNectar";
   public static final String bO = "flower_pos";
   public static final String bP = "hive_pos";
   private static final bto ci = baq.a(20, 39);
   @Nullable
   private UUID cj;
   private float ck;
   private float cl;
   private int cm;
   int cn;
   private int cq;
   private int cr;
   private static final int cs = 200;
   int ct;
   private static final int cu = 200;
   private static final int cv = 20;
   private static final int cw = 60;
   int cx = azm.a(this.ae, 20, 60);
   @Nullable
   iu cy;
   @Nullable
   iu cz;
   civ.k cA;
   civ.e cB;
   private civ.f cC;
   private int cD;

   public civ(bwo<? extends civ> $$0, dja $$1) {
      super($$0, $$1);
      this.bA = new cda(this, 20, true);
      this.bz = new civ.j(this);
      this.a(exf.n, -1.0F);
      this.a(exf.j, -1.0F);
      this.a(exf.k, 16.0F);
      this.a(exf.x, -1.0F);
      this.a(exf.h, -1.0F);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bQ, (byte)0);
      $$0.a(bR, 0);
   }

   @Override
   public float a(iu $$0, djd $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void D() {
      this.bD.a(0, new civ.b(this, 1.4F, true));
      this.bD.a(1, new civ.d());
      this.bD.a(2, new cdm(this, 1.0));
      this.bD.a(3, new cfi(this, 1.25, $$0 -> $$0.a(axk.an), false));
      this.bD.a(3, new civ.n());
      this.bD.a(3, new civ.m());
      this.cA = new civ.k();
      this.bD.a(4, this.cA);
      this.bD.a(5, new cdz(this, 1.25));
      this.bD.a(5, new civ.i());
      this.cB = new civ.e();
      this.bD.a(5, this.cB);
      this.cC = new civ.f();
      this.bD.a(6, this.cC);
      this.bD.a(7, new civ.g());
      this.bD.a(8, new civ.l());
      this.bD.a(9, new cdu(this));
      this.bE.a(1, new civ.h(this).a(new Class[0]));
      this.bE.a(2, new civ.c(this));
      this.bE.a(3, new cfz<>(this, true));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (this.gt()) {
         $$0.a("hive_pos", uo.a(this.gu()));
      }

      if (this.t()) {
         $$0.a("flower_pos", uo.a(this.q()));
      }

      $$0.a("HasNectar", this.gD());
      $$0.a("HasStung", this.gE());
      $$0.a("TicksSincePollination", this.cn);
      $$0.a("CannotEnterHiveTicks", this.cq);
      $$0.a("CropsGrownSincePollination", this.cr);
      this.a_($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cn = $$0.h("TicksSincePollination");
      this.cq = $$0.h("CannotEnterHiveTicks");
      this.cr = $$0.h("CropsGrownSincePollination");
      this.cz = uo.a($$0, "hive_pos").orElse(null);
      this.cy = uo.a($$0, "flower_pos").orElse(null);
      this.a(this.dV(), $$0);
   }

   @Override
   public boolean c(arq $$0, bwf $$1) {
      buu $$2 = this.dW().a((bxe)this);
      boolean $$3 = $$1.a($$0, $$2, (float)((int)this.h(byk.c)));
      if ($$3) {
         dfs.a($$0, $$1, $$2);
         if ($$1 instanceof bxe $$4) {
            $$4.p($$4.eX() + 1);
            int $$5 = 0;
            if (this.dV().an() == bua.c) {
               $$5 = 10;
            } else if (this.dV().an() == bua.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new bvj(bvl.s, $$5 * 20, 0), this);
            }
         }

         this.x(true);
         this.W_();
         this.a(awn.bS, 1.0F, 1.0F);
      }

      return $$3;
   }

   @Override
   public void h() {
      super.h();
      if (this.gD() && this.gO() < 10 && this.ae.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ae.a(2) + 1; $$0++) {
            this.a(this.dV(), this.dA() - 0.3F, this.dA() + 0.3F, this.dG() - 0.3F, this.dG() + 0.3F, this.e(0.5), lx.aB);
         }
      }

      this.gM();
   }

   private void a(dja $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lv $$6) {
      $$0.a($$6, azm.d($$0.A.j(), $$1, $$2), $$5, azm.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(iu $$0) {
      feq $$1 = feq.c($$0);
      int $$2 = 0;
      iu $$3 = this.dv();
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

      feq $$8 = chw.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bC.b(0.5F);
         this.bC.a($$8.d, $$8.e, $$8.f, 1.0);
      }
   }

   @Nullable
   public iu q() {
      return this.cy;
   }

   public boolean t() {
      return this.cy != null;
   }

   public void h(iu $$0) {
      this.cy = $$0;
   }

   @bav
   public int x() {
      return Math.max(this.cB.d, this.cC.d);
   }

   @bav
   public List<iu> gr() {
      return this.cB.f;
   }

   private boolean gI() {
      return this.cn > 3600;
   }

   void gJ() {
      this.cz = null;
      this.ct = 200;
   }

   void gK() {
      this.cy = null;
      this.cx = azm.a(this.ae, 20, 60);
   }

   boolean gL() {
      if (this.cq <= 0 && !this.cA.l() && !this.gE() && this.f() == null) {
         boolean $$0 = this.gI() || c(this.dV()) || this.gD();
         return $$0 && !this.gN();
      } else {
         return false;
      }
   }

   public static boolean c(dja $$0) {
      return $$0.B_().g() && ($$0.W() || $$0.ah());
   }

   public void s(int $$0) {
      this.cq = $$0;
   }

   public float J(float $$0) {
      return azm.h($$0, this.cl, this.ck);
   }

   private void gM() {
      this.cl = this.ck;
      if (this.gT()) {
         this.ck = Math.min(1.0F, this.ck + 0.2F);
      } else {
         this.ck = Math.max(0.0F, this.ck - 0.24F);
      }
   }

   @Override
   protected void a(arq $$0) {
      boolean $$1 = this.gE();
      if (this.bj()) {
         this.cD++;
      } else {
         this.cD = 0;
      }

      if (this.cD > 20) {
         this.a($$0, this.dW().i(), 1.0F);
      }

      if ($$1) {
         this.cm++;
         if (this.cm % 5 == 0 && this.ae.a(azm.a(1200 - this.cm, 1, 1200)) == 0) {
            this.a($$0, this.dW().p(), this.eG());
         }
      }

      if (!this.gD()) {
         this.cn++;
      }

      this.a($$0, false);
   }

   public void gs() {
      this.cn = 0;
   }

   private boolean gN() {
      dxc $$0 = this.gR();
      return $$0 != null && $$0.a();
   }

   @Override
   public int a() {
      return this.al.a(bR);
   }

   @Override
   public void a(int $$0) {
      this.al.a(bR, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cj;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cj = $$0;
   }

   @Override
   public void c() {
      this.a(ci.a(this.ae));
   }

   private boolean k(iu $$0) {
      dxf $$1 = this.dV().c_($$0);
      return $$1 instanceof dxc ? !((dxc)$$1).d() : false;
   }

   @bav
   public boolean gt() {
      return this.cz != null;
   }

   @Nullable
   @bav
   public iu gu() {
      return this.cz;
   }

   @bav
   public ceb gv() {
      return this.bD;
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   int gO() {
      return this.cr;
   }

   private void gP() {
      this.cr = 0;
   }

   void gQ() {
      this.cr++;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C) {
         if (this.cq > 0) {
            this.cq--;
         }

         if (this.ct > 0) {
            this.ct--;
         }

         if (this.cx > 0) {
            this.cx--;
         }

         boolean $$0 = this.X_() && !this.gE() && this.f() != null && this.f().g(this) < 4.0;
         this.y($$0);
         if (this.af % 20 == 0 && !this.gS()) {
            this.cz = null;
         }
      }
   }

   @Nullable
   dxc gR() {
      if (this.cz == null) {
         return null;
      } else {
         return this.l(this.cz) ? null : this.dV().a(this.cz, dxh.I).orElse(null);
      }
   }

   boolean gS() {
      return this.gR() != null;
   }

   public boolean gD() {
      return this.t(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gs();
      }

      this.d(8, $$0);
   }

   public boolean gE() {
      return this.t(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gT() {
      return this.t(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(iu $$0) {
      return !this.b($$0, 48);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.al.a(bQ, (byte)(this.al.a(bQ) | $$0));
      } else {
         this.al.a(bQ, (byte)(this.al.a(bQ) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.al.a(bQ) & $$0) != 0;
   }

   public static byj.a gF() {
      return ciu.gw().a(byk.s, 10.0).a(byk.l, 0.6F).a(byk.v, 0.3F).a(byk.c, 2.0);
   }

   @Override
   protected cgo b(dja $$0) {
      cgm $$1 = new cgm(this, $$0) {
         @Override
         public boolean a(iu $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!civ.this.cA.l()) {
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
   public bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if (this.i($$2) && $$2.h() instanceof cxl $$3 && $$3.c() instanceof dpl $$4) {
         bvj $$5 = $$4.b();
         if ($$5 != null) {
            this.a($$0, $$1, $$2);
            if (!this.dV().C) {
               this.a($$5);
            }

            return bud.a;
         }
      }

      return super.b($$0, $$1);
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.an);
   }

   @Override
   protected void b(iu $$0, eah $$1) {
   }

   @Override
   protected awm u() {
      return null;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.bP;
   }

   @Override
   protected awm l_() {
      return awn.bO;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Nullable
   public civ b(arq $$0, bvv $$1) {
      return bwo.l.a($$0, bwn.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, eah $$2, iu $$3) {
   }

   @Override
   public boolean ba() {
      return this.gG() && this.af % bH == 0;
   }

   @Override
   public boolean gG() {
      return !this.aJ();
   }

   public void gH() {
      this.w(false);
      this.gP();
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.cA.m();
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(axr<ewn> $$0) {
      this.i(this.dy().b(0.0, 0.01, 0.0));
   }

   @Override
   public feq cT() {
      return new feq(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.2F));
   }

   boolean b(iu $$0, int $$1) {
      return $$0.a(this.dv(), (double)$$1);
   }

   public void i(iu $$0) {
      this.cz = $$0;
   }

   public static boolean c(eah $$0) {
      if ($$0.a(axc.W)) {
         if ($$0.a(eax.I, Boolean.valueOf(false))) {
            return false;
         } else {
            return $$0.a(dmh.jf) ? $$0.c(doo.b) == ebd.a : true;
         }
      } else {
         return false;
      }
   }

   abstract class a extends cea {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !civ.this.X_();
      }

      @Override
      public boolean c() {
         return this.i() && !civ.this.X_();
      }
   }

   class b extends cek {
      b(final bxm $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && civ.this.X_() && !civ.this.gE();
      }

      @Override
      public boolean c() {
         return super.c() && civ.this.X_() && !civ.this.gE();
      }
   }

   static class c extends cft<crc> {
      c(civ $$0) {
         super($$0, crc.class, 10, true, false, $$0::a);
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
         civ $$0 = (civ)this.e;
         return $$0.X_() && !$$0.gE();
      }
   }

   class d extends civ.a {
      @Override
      public boolean h() {
         if (civ.this.cz != null && civ.this.gL() && civ.this.cz.a(civ.this.dt(), 2.0)) {
            dxc $$0 = civ.this.gR();
            if ($$0 != null) {
               if (!$$0.d()) {
                  return true;
               }

               civ.this.cz = null;
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
         dxc $$0 = civ.this.gR();
         if ($$0 != null) {
            $$0.a(civ.this);
         }
      }
   }

   @bav
   public class e extends civ.a {
      public static final int b = 2400;
      int d = civ.this.dV().A.a(10);
      private static final int e = 3;
      final List<iu> f = Lists.newArrayList();
      @Nullable
      private exc g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(cea.a.a));
      }

      @Override
      public boolean h() {
         return civ.this.cz != null
            && !civ.this.l(civ.this.cz)
            && !civ.this.gf()
            && civ.this.gL()
            && !this.d(civ.this.cz)
            && civ.this.dV().a_(civ.this.cz).a(axc.aJ);
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
         civ.this.bC.m();
         civ.this.bC.f();
      }

      @Override
      public void a() {
         if (civ.this.cz != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!civ.this.bC.l()) {
               if (!civ.this.b(civ.this.cz, 16)) {
                  if (civ.this.l(civ.this.cz)) {
                     civ.this.gJ();
                  } else {
                     civ.this.j(civ.this.cz);
                  }
               } else {
                  boolean $$0 = this.a(civ.this.cz);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && civ.this.bC.i().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        civ.this.gJ();
                        this.i = 0;
                     }
                  } else {
                     this.g = civ.this.bC.i();
                  }
               }
            }
         }
      }

      private boolean a(iu $$0) {
         int $$1 = civ.this.b($$0, 3) ? 1 : 2;
         civ.this.bC.b(10.0F);
         civ.this.bC.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return civ.this.bC.i() != null && civ.this.bC.i().j();
      }

      boolean b(iu $$0) {
         return this.f.contains($$0);
      }

      private void c(iu $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (civ.this.cz != null) {
            this.c(civ.this.cz);
         }

         civ.this.gJ();
      }

      private boolean d(iu $$0) {
         if (civ.this.b($$0, 2)) {
            return true;
         } else {
            exc $$1 = civ.this.bC.i();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends civ.a {
      private static final int c = 2400;
      int d = civ.this.dV().A.a(10);

      f() {
         this.a(EnumSet.of(cea.a.a));
      }

      @Override
      public boolean h() {
         return civ.this.cy != null && !civ.this.gf() && this.k() && !civ.this.b(civ.this.cy, 2);
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
         civ.this.bC.m();
         civ.this.bC.f();
      }

      @Override
      public void a() {
         if (civ.this.cy != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               civ.this.gK();
            } else if (!civ.this.bC.l()) {
               if (civ.this.l(civ.this.cy)) {
                  civ.this.gK();
               } else {
                  civ.this.j(civ.this.cy);
               }
            }
         }
      }

      private boolean k() {
         return civ.this.cn > 600;
      }
   }

   class g extends civ.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (civ.this.gO() >= 10) {
            return false;
         } else {
            return civ.this.ae.i() < 0.3F ? false : civ.this.gD() && civ.this.gS();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (civ.this.ae.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               iu $$1 = civ.this.dv().c($$0);
               eah $$2 = civ.this.dV().a_($$1);
               dmf $$3 = $$2.b();
               eah $$4 = null;
               if ($$2.a(axc.aL)) {
                  if ($$3 instanceof doc) {
                     doc $$5 = (doc)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dul) {
                     int $$6 = $$2.c(dul.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dul.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dmh.oO)) {
                     int $$7 = $$2.c(dus.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dus.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dmh.td) || $$2.a(dmh.te)) {
                     dmi $$8 = (dmi)$$2.b();
                     if ($$8.a((djd)civ.this.dV(), $$1, $$2)) {
                        $$8.a((arq)civ.this.dV(), civ.this.ae, $$1, $$2);
                        $$4 = civ.this.dV().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     civ.this.dV().c(2011, $$1, 15);
                     civ.this.dV().b($$1, $$4);
                     civ.this.gQ();
                  }
               }
            }
         }
      }
   }

   class h extends cfs {
      h(final civ $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return civ.this.X_() && super.c();
      }

      @Override
      protected void a(bxg $$0, bxe $$1) {
         if ($$0 instanceof civ && this.e.E($$1)) {
            $$0.g($$1);
         }
      }
   }

   class i extends civ.a {
      @Override
      public boolean h() {
         return civ.this.ct == 0 && !civ.this.gt() && civ.this.gL();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         civ.this.ct = 200;
         List<iu> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (iu $$1 : $$0) {
               if (!civ.this.cB.b($$1)) {
                  civ.this.cz = $$1;
                  return;
               }
            }

            civ.this.cB.k();
            civ.this.cz = $$0.get(0);
         }
      }

      private List<iu> k() {
         iu $$0 = civ.this.dv();
         cig $$1 = ((arq)civ.this.dV()).A();
         Stream<cih> $$2 = $$1.c($$0x -> $$0x.a(axm.c), $$0, 20, cig.b.c);
         return $$2.map(cih::g).filter(civ.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends cdc {
      j(final bxg $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!civ.this.X_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !civ.this.cA.l();
      }
   }

   class k extends civ.a {
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
      private feq m;
      private int n;
      private static final int o = 600;
      private Long2LongOpenHashMap p = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(cea.a.a));
      }

      @Override
      public boolean h() {
         if (civ.this.cx > 0) {
            return false;
         } else if (civ.this.gD()) {
            return false;
         } else if (civ.this.dV().ah()) {
            return false;
         } else {
            Optional<iu> $$0 = this.p();
            if ($$0.isPresent()) {
               civ.this.cy = $$0.get();
               civ.this.bC.a((double)civ.this.cy.u() + 0.5, (double)civ.this.cy.v() + 0.5, (double)civ.this.cy.w() + 0.5, 1.2F);
               return true;
            } else {
               civ.this.cx = azm.a(civ.this.ae, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.l) {
            return false;
         } else if (!civ.this.t()) {
            return false;
         } else if (civ.this.dV().ah()) {
            return false;
         } else {
            return this.k() ? civ.this.ae.i() < 0.2F : true;
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
         civ.this.gs();
      }

      @Override
      public void e() {
         if (this.k()) {
            civ.this.w(true);
         }

         this.l = false;
         civ.this.bC.m();
         civ.this.cx = 200;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         if (civ.this.t()) {
            this.n++;
            if (this.n > 600) {
               civ.this.gK();
               this.l = false;
               civ.this.cx = 200;
            } else {
               feq $$0 = feq.c(civ.this.cy).b(0.0, 0.6F, 0.0);
               if ($$0.f(civ.this.dt()) > 1.0) {
                  this.m = $$0;
                  this.n();
               } else {
                  if (this.m == null) {
                     this.m = $$0;
                  }

                  boolean $$1 = civ.this.dt().f(this.m) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.n > 600) {
                     civ.this.gK();
                  } else {
                     if ($$1) {
                        boolean $$3 = civ.this.ae.a(25) == 0;
                        if ($$3) {
                           this.m = new feq($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           civ.this.bC.m();
                        } else {
                           $$2 = false;
                        }

                        civ.this.J().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.j++;
                     if (civ.this.ae.i() < 0.05F && this.j > this.k + 60) {
                        this.k = this.j;
                        civ.this.a(awn.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         civ.this.L().a(this.m.a(), this.m.b(), this.m.c(), 0.35F);
      }

      private float o() {
         return (civ.this.ae.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<iu> p() {
         Iterable<iu> $$0 = iu.a(civ.this.dv(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (iu $$2 : $$0) {
            long $$3 = this.p.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (civ.this.dV().ae() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (civ.c(civ.this.dV().a_($$2))) {
               exc $$4 = civ.this.bC.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), civ.this.dV().ae() + 600L);
            }
         }

         this.p = $$1;
         return Optional.empty();
      }
   }

   class l extends cea {
      l() {
         this.a(EnumSet.of(cea.a.a));
      }

      @Override
      public boolean b() {
         return civ.this.bC.k() && civ.this.ae.a(10) == 0;
      }

      @Override
      public boolean c() {
         return civ.this.bC.l();
      }

      @Override
      public void d() {
         feq $$0 = this.h();
         if ($$0 != null) {
            civ.this.bC.a(civ.this.bC.a(iu.a((jo)$$0), 1), 1.0);
         }
      }

      @Nullable
      private feq h() {
         feq $$1;
         if (civ.this.gS() && !civ.this.b(civ.this.cz, this.i())) {
            feq $$0 = feq.b(civ.this.cz);
            $$1 = $$0.d(civ.this.dt()).d();
         } else {
            $$1 = civ.this.h(0.0F);
         }

         int $$3 = 8;
         feq $$4 = chz.a(civ.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : chv.a(civ.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !civ.this.gt() && !civ.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends civ.a {
      private final int c = azm.a(civ.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (civ.this.cy != null && civ.this.dV().p(civ.this.cy) && !this.a(civ.this.cy)) {
            civ.this.gK();
         }

         this.d = civ.this.dV().ae();
      }

      @Override
      public boolean h() {
         return civ.this.dV().ae() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(iu $$0) {
         return civ.c(civ.this.dV().a_($$0));
      }
   }

   class n extends civ.a {
      private final int c = azm.a(civ.this.ae, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (civ.this.cz != null && civ.this.dV().p(civ.this.cz) && !civ.this.gS()) {
            civ.this.gJ();
         }

         this.d = civ.this.dV().ae();
      }

      @Override
      public boolean h() {
         return civ.this.dV().ae() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
