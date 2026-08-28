import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.math.IntMath;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class crx extends bxu {
   public static final bxl bu = bxl.b;
   public static final int bv = 0;
   public static final int bw = 20;
   public static final int bx = 100;
   public static final int by = 10;
   public static final int bz = 200;
   public static final int bA = 499;
   public static final int bB = 500;
   public static final float bC = 4.5F;
   public static final float bD = 3.0F;
   public static final float bE = 1.5F;
   public static final float bF = 0.6F;
   public static final float bG = 0.6F;
   public static final float bH = 1.62F;
   private static final int a = 40;
   public static final ffq bI = new ffq(0.0, 0.6, 0.0);
   public static final bww bJ = bww.b(0.6F, 1.8F).b(1.62F).a(bwv.a().a(bwu.b, bI));
   private static final Map<byg, bww> b = ImmutableMap.builder()
      .put(byg.a, bJ)
      .put(byg.c, aD)
      .put(byg.b, bww.b(0.6F, 0.6F).b(0.4F))
      .put(byg.d, bww.b(0.6F, 0.6F).b(0.4F))
      .put(byg.e, bww.b(0.6F, 0.6F).b(0.4F))
      .put(byg.f, bww.b(0.6F, 1.5F).b(1.27F).a(bwv.a().a(bwu.b, bI)))
      .put(byg.h, bww.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final akl<Float> c = akp.a(crx.class, akn.d);
   private static final akl<Integer> d = akp.a(crx.class, akn.b);
   protected static final akl<Byte> bK = akp.a(crx.class, akn.a);
   protected static final akl<Byte> bL = akp.a(crx.class, akn.a);
   protected static final akl<tz> bM = akp.a(crx.class, akn.t);
   protected static final akl<tz> bN = akp.a(crx.class, akn.t);
   public static final int bO = 60;
   private static final short e = 0;
   private static final float f = 0.0F;
   private static final int g = 0;
   private static final int h = 0;
   private static final int i = 0;
   private static final int j = 0;
   private static final int k = 0;
   private static final boolean cq = false;
   private static final int cr = 0;
   private long cs;
   final crw ct;
   protected cxe bP = new cxe();
   public final cwt bQ;
   public cvq bR;
   protected cvm bS = new cvm();
   protected int bT;
   private boolean cu = false;
   protected int bU = 60;
   public float bV;
   public float bW;
   public int bX;
   public double bY;
   public double bZ;
   public double ca;
   public double cb;
   public double cc;
   public double cd;
   private int cv = 0;
   protected boolean ce;
   private final crt cw = new crt();
   public int cf = 0;
   public int cg = 0;
   public float ch = 0.0F;
   protected int ci = 0;
   protected final float cj = 0.02F;
   private int cx;
   private final GameProfile cy;
   private boolean cz;
   private czy cA = czy.k;
   private final czv cB = this.g();
   private Optional<je> cC = Optional.empty();
   @Nullable
   public cso ck;
   protected float cl;
   @Nullable
   public ffq cm;
   @Nullable
   public bwt cn;
   private boolean cD = false;
   private int cE = 0;

   public crx(djx $$0, iv $$1, float $$2, GameProfile $$3) {
      super(bxc.bT, $$0);
      this.a_($$3.getId());
      this.cy = $$3;
      this.ct = new crw(this, this.bt);
      this.bQ = new cwt(this.ct, !$$0.C, this);
      this.bR = this.bQ;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
   }

   @Override
   protected bwx eb() {
      return new cry(this);
   }

   public boolean a(djx $$0, iv $$1, dju $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dju.d) {
         return true;
      } else if (this.gw()) {
         return false;
      } else {
         czy $$3 = this.fb();
         return $$3.f() || !$$3.b(new ebi($$0, $$1, false));
      }
   }

   public static byz.a fX() {
      return bxu.ee().a(bza.c, 1.0).a(bza.v, 0.1F).a(bza.e).a(bza.q).a(bza.g, 4.5).a(bza.j, 3.0).a(bza.f).a(bza.C).a(bza.z).a(bza.t).a(bza.D);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(c, 0.0F);
      $$0.a(d, 0);
      $$0.a(bK, (byte)0);
      $$0.a(bL, (byte)bu.b());
      $$0.a(bM, new tz());
      $$0.a(bN, new tz());
   }

   @Override
   public void h() {
      this.ad = this.Z_();
      if (this.Z_() || this.bY()) {
         this.d(false);
      }

      if (this.bX > 0) {
         this.bX--;
      }

      if (this.fR()) {
         this.cv++;
         if (this.cv > 100) {
            this.cv = 100;
         }

         if (!this.dV().C && this.dV().V()) {
            this.a(false, true);
         }
      } else if (this.cv > 0) {
         this.cv++;
         if (this.cv >= 110) {
            this.cv = 0;
         }
      }

      this.gb();
      super.h();
      if (!this.dV().C && this.bR != null && !this.bR.b(this)) {
         this.p();
         this.bR = this.bQ;
      }

      this.n();
      if (this instanceof art $$0) {
         this.bS.a($$0);
         this.a(awz.k);
         this.a(awz.l);
         if (this.bJ()) {
            this.a(awz.m);
         }

         if (this.cf()) {
            this.a(awz.o);
         }

         if (!this.fR()) {
            this.a(awz.n);
         }
      }

      int $$1 = 29999999;
      double $$2 = azo.a(this.dA(), -2.9999999E7, 2.9999999E7);
      double $$3 = azo.a(this.dG(), -2.9999999E7, 2.9999999E7);
      if ($$2 != this.dA() || $$3 != this.dG()) {
         this.a_($$2, this.dC(), $$3);
      }

      this.aS++;
      czy $$4 = this.fb();
      if (!czy.a(this.cA, $$4)) {
         if (!czy.b(this.cA, $$4)) {
            this.gE();
         }

         this.cA = $$4.v();
      }

      if (!this.a(axj.a) && this.c(dac.pc)) {
         this.m();
      }

      this.cB.a();
      this.gc();
      if (this.cE > 0) {
         this.cE--;
      }
   }

   @Override
   protected float fp() {
      return this.fG() ? 15.0F : super.fp();
   }

   public boolean fY() {
      return this.cc();
   }

   protected boolean fZ() {
      return this.cc();
   }

   protected boolean ga() {
      return this.cc();
   }

   protected boolean gb() {
      this.ce = this.a(axj.a);
      return this.ce;
   }

   @Override
   public void a(boolean $$0, iv $$1) {
      if (!this.gk().b) {
         super.a($$0, $$1);
      }
   }

   @Override
   public void l(boolean $$0) {
      if (!this.gk().b) {
         super.l($$0);
      }
   }

   private void m() {
      this.a(new bvx(bvz.m, 200, 0, false, false, true));
   }

   private boolean c(czu $$0) {
      for (bxd $$1 : bxd.j) {
         czy $$2 = this.a($$1);
         dih $$3 = $$2.a(kk.D);
         if ($$2.a($$0) && $$3 != null && $$3.b() == $$1) {
            return true;
         }
      }

      return false;
   }

   protected czv g() {
      return new czv();
   }

   private void n() {
      this.bY = this.cb;
      this.bZ = this.cc;
      this.ca = this.cd;
      double $$0 = this.dA() - this.cb;
      double $$1 = this.dC() - this.cc;
      double $$2 = this.dG() - this.cd;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cb = this.dA();
         this.bY = this.cb;
      }

      if ($$2 > 10.0) {
         this.cd = this.dG();
         this.ca = this.cd;
      }

      if ($$1 > 10.0) {
         this.cc = this.dC();
         this.bZ = this.cc;
      }

      if ($$0 < -10.0) {
         this.cb = this.dA();
         this.bY = this.cb;
      }

      if ($$2 < -10.0) {
         this.cd = this.dG();
         this.ca = this.cd;
      }

      if ($$1 < -10.0) {
         this.cc = this.dC();
         this.bZ = this.cc;
      }

      this.cb += $$0 * 0.25;
      this.cd += $$2 * 0.25;
      this.cc += $$1 * 0.25;
   }

   protected void gc() {
      if (this.h(byg.d)) {
         byg $$0 = this.t();
         byg $$1;
         if (this.Z_() || this.bY() || this.h($$0)) {
            $$1 = $$0;
         } else if (this.h(byg.f)) {
            $$1 = byg.f;
         } else {
            $$1 = byg.d;
         }

         this.b($$1);
      }
   }

   private byg t() {
      if (this.fR()) {
         return byg.c;
      } else if (this.cj()) {
         return byg.d;
      } else if (this.fJ()) {
         return byg.b;
      } else if (this.fv()) {
         return byg.e;
      } else {
         return this.cc() && !this.cw.b ? byg.f : byg.a;
      }
   }

   protected boolean h(byg $$0) {
      return this.dV().a(this, this.a($$0).a(this.dt()).h(1.0E-7));
   }

   @Override
   protected awo aU() {
      return awp.vi;
   }

   @Override
   protected awo aV() {
      return awp.vg;
   }

   @Override
   protected awo aW() {
      return awp.vh;
   }

   @Override
   public int bW() {
      return 10;
   }

   @Override
   public void a(awo $$0, float $$1, float $$2) {
      this.dV().a(this, this.dA(), this.dC(), this.dG(), $$0, this.dm(), $$1, $$2);
   }

   public void a(awo $$0, awq $$1, float $$2, float $$3) {
   }

   @Override
   public awq dm() {
      return awq.h;
   }

   @Override
   protected int dn() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.O_();
      } else if ($$0 == 23) {
         this.cz = false;
      } else if ($$0 == 22) {
         this.cz = true;
      } else {
         super.b($$0);
      }
   }

   protected void p() {
      this.bR = this.bQ;
   }

   @Override
   protected void q() {
   }

   @Override
   public void r() {
      if (!this.dV().C && this.fZ() && this.bY()) {
         this.bO();
         this.g(false);
      } else {
         super.r();
         this.bV = this.bW;
         this.bW = 0.0F;
      }
   }

   @Override
   public void k_() {
      if (this.bT > 0) {
         this.bT--;
      }

      this.j();
      this.ct.l();
      this.bV = this.bW;
      if (this.cw.b && !this.bY()) {
         this.k();
      }

      super.k_();
      this.eZ();
      this.aX = this.dL();
      this.B((float)this.h(bza.v));
      float $$1;
      if (this.aH() && !this.eH() && !this.cj()) {
         $$1 = Math.min(0.1F, (float)this.dy().i());
      } else {
         $$1 = 0.0F;
      }

      this.bW = this.bW + ($$1 - this.bW) * 0.4F;
      if (this.eG() > 0.0F && !this.Z_()) {
         ffl $$2;
         if (this.bY() && !this.dk().dQ()) {
            $$2 = this.cR().b(this.dk().cR()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cR().c(1.0, 0.5, 1.0);
         }

         List<bwt> $$4 = this.dV().a_(this, $$2);
         List<bwt> $$5 = Lists.newArrayList();

         for (bwt $$6 : $$4) {
            if ($$6.an() == bxc.W) {
               $$5.add($$6);
            } else if (!$$6.dQ()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ag.a($$5, this.ae));
         }
      }

      this.c(this.gB());
      this.c(this.gC());
      if (!this.dV().C && (this.Z > 0.5 || this.bi()) || this.cw.b || this.fR() || this.av) {
         this.gy();
      }
   }

   @Override
   protected void j() {
   }

   private void c(tz $$0) {
      if (!$$0.j() && !$$0.b("Silent", false)) {
         if (this.dV().A.a(200) == 0) {
            bxc<?> $$1 = $$0.<bxc<?>>a("id", bxc.a).orElse(null);
            if ($$1 == bxc.aP && !cke.a(this.dV(), this)) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), cke.a(this.dV(), this.dV().A), this.dm(), 1.0F, cke.a(this.dV().A));
            }
         }
      }
   }

   private void d(bwt $$0) {
      $$0.a_(this);
   }

   public int gd() {
      return this.al.a(d);
   }

   public void q(int $$0) {
      this.al.a(d, $$0);
   }

   public void r(int $$0) {
      int $$1 = this.gd();
      this.al.a(d, $$1 + $$0);
   }

   public void a(int $$0, float $$1, czy $$2) {
      this.bp = $$0;
      this.bq = $$1;
      this.br = $$2;
      if (!this.dV().C) {
         this.gy();
         this.c(4, true);
      }
   }

   @Nonnull
   @Override
   public czy dZ() {
      return this.fv() && this.br != null ? this.br : super.dZ();
   }

   @Override
   public void a(bvi $$0) {
      super.a($$0);
      this.av();
      if (!this.Z_() && this.dV() instanceof ars $$1) {
         this.b($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-azo.b((this.eM() + this.dL()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-azo.a((this.eM() + this.dL()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(awz.N);
      this.a(awz.i.b(awz.m));
      this.a(awz.i.b(awz.n));
      this.aF();
      this.c(false);
      this.a(Optional.of(je.a(this.dV().aj(), this.dv())));
   }

   @Override
   protected void f(ars $$0) {
      super.f($$0);
      if (!$$0.O().c(djt.e)) {
         this.ge();
         this.ct.m();
      }
   }

   protected void ge() {
      for (int $$0 = 0; $$0 < this.ct.b(); $$0++) {
         czy $$1 = this.ct.a($$0);
         if (!$$1.f() && dgn.a($$1, dgm.D)) {
            this.ct.b($$0);
         }
      }
   }

   @Override
   protected awo e(bvi $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected awo l_() {
      return awp.uY;
   }

   @Override
   public void g(czy $$0) {
   }

   @Nullable
   public coc a(czy $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   public float c(ebe $$0) {
      float $$1 = this.ct.g().a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(bza.t);
      }

      if (bvy.a(this)) {
         $$1 *= 1.0F + (float)(bvy.b(this) + 1) * 0.2F;
      }

      if (this.b(bvz.d)) {
         float $$2 = switch (this.c(bvz.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.h(bza.f);
      if (this.a(axj.a)) {
         $$1 *= (float)this.g(bza.C).g();
      }

      if (!this.aH()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(ebe $$0) {
      return !$$0.C() || this.ct.g().b($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a_(this.cy.getId());
      uf $$1 = $$0.p("Inventory");
      this.ct.b($$1);
      this.ct.c($$0.b("SelectedItemSlot", 0));
      this.cv = $$0.b("SleepTimer", (short)0);
      this.ch = $$0.b("XpP", 0.0F);
      this.cf = $$0.b("XpLevel", 0);
      this.cg = $$0.b("XpTotal", 0);
      this.ci = $$0.b("XpSeed", 0);
      if (this.ci == 0) {
         this.ci = this.ae.f();
      }

      this.q($$0.b("Score", 0));
      this.bS.a($$0);
      this.cw.b($$0);
      this.g(bza.v).a((double)this.cw.b());
      $$0.o("EnderItems").ifPresent($$0x -> this.bP.a($$0x, this.dX()));
      this.k($$0.n("ShoulderEntityLeft"));
      this.l($$0.n("ShoulderEntityRight"));
      this.a($$0.a("LastDeathLocation", je.b));
      this.cm = $$0.<ffq>a("current_explosion_impact_pos", ffq.a).orElse(null);
      this.cD = $$0.b("ignore_fall_damage_from_current_explosion", false);
      this.cE = $$0.b("current_impulse_context_reset_grace_time", 0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      uo.e($$0);
      $$0.a("Inventory", this.ct.a(new uf()));
      $$0.a("SelectedItemSlot", this.ct.f());
      $$0.a("SleepTimer", (short)this.cv);
      $$0.a("XpP", this.ch);
      $$0.a("XpLevel", this.cf);
      $$0.a("XpTotal", this.cg);
      $$0.a("XpSeed", this.ci);
      $$0.a("Score", this.gd());
      this.bS.b($$0);
      this.cw.a($$0);
      $$0.a("EnderItems", this.bP.a(this.dX()));
      if (!this.gB().j()) {
         $$0.a("ShoulderEntityLeft", this.gB());
      }

      if (!this.gC().j()) {
         $$0.a("ShoulderEntityRight", this.gC());
      }

      this.cC.ifPresent($$1 -> $$0.a("LastDeathLocation", je.b, $$1));
      $$0.b("current_explosion_impact_pos", ffq.a, this.cm);
      $$0.a("ignore_fall_damage_from_current_explosion", this.cD);
      $$0.a("current_impulse_context_reset_grace_time", this.cE);
   }

   @Override
   public boolean a(ars $$0, bvi $$1) {
      if (super.a($$0, $$1)) {
         return true;
      } else if ($$1.a(axf.n)) {
         return !$$0.O().c(djt.I);
      } else if ($$1.a(axf.m)) {
         return !$$0.O().c(djt.J);
      } else if ($$1.a(axf.i)) {
         return !$$0.O().c(djt.K);
      } else {
         return $$1.a(axf.o) ? !$$0.O().c(djt.L) : false;
      }
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.cw.a && !$$1.a(axf.d)) {
         return false;
      } else {
         this.bd = 0;
         if (this.eH()) {
            return false;
         } else {
            this.gy();
            if ($$1.g()) {
               if ($$0.an() == buo.a) {
                  $$2 = 0.0F;
               }

               if ($$0.an() == buo.b) {
                  $$2 = Math.min($$2 / 2.0F + 1.0F, $$2);
               }

               if ($$0.an() == buo.d) {
                  $$2 = $$2 * 3.0F / 2.0F;
               }
            }

            return $$2 == 0.0F ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void b(ars $$0, bxu $$1) {
      super.b($$0, $$1);
      czy $$2 = this.fH();
      dbz $$3 = $$2 != null ? $$2.a(kk.I) : null;
      float $$4 = $$1.fU();
      if ($$4 > 0.0F && $$3 != null) {
         $$3.a($$0, this, $$4, $$2);
      }
   }

   @Override
   public boolean ez() {
      return !this.gk().a && super.ez();
   }

   public boolean a(crx $$0) {
      fgx $$1 = this.cq();
      fgx $$2 = $$0.cq();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.i();
      }
   }

   @Override
   protected void c(bvi $$0, float $$1) {
      this.a($$0, $$1, new bxd[]{bxd.c, bxd.d, bxd.e, bxd.f});
   }

   @Override
   protected void d(bvi $$0, float $$1) {
      this.a($$0, $$1, new bxd[]{bxd.f});
   }

   @Override
   protected void c(ars $$0, bvi $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var8 = Math.max($$2 - this.fw(), 0.0F);
         this.E(this.fw() - ($$2 - var8));
         float $$4 = $$2 - var8;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
            this.a(awz.L, Math.round($$4 * 10.0F));
         }

         if (var8 != 0.0F) {
            this.G($$1.a());
            this.eS().a($$1, var8);
            this.d(this.eG() - var8);
            if (var8 < 3.4028235E37F) {
               this.a(awz.J, Math.round(var8 * 10.0F));
            }

            this.a(ege.o);
         }
      }
   }

   public boolean X() {
      return false;
   }

   public void a(dzq $$0, boolean $$1) {
   }

   public void a(diw $$0) {
   }

   public void a(dyn $$0) {
   }

   public void a(dzv $$0) {
   }

   public void a(dzw $$0) {
   }

   public void a(dzx $$0) {
   }

   public void a(dzg $$0) {
   }

   public void a(clt $$0, buk $$1) {
   }

   public OptionalInt a(@Nullable but $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, diu $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(czy $$0, buq $$1) {
   }

   public bur a(bwt $$0, buq $$1) {
      if (this.Z_()) {
         if ($$0 instanceof but) {
            this.a((but)$$0);
         }

         return bur.e;
      } else {
         czy $$2 = this.b($$1);
         czy $$3 = $$2.v();
         bur $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.fV() && $$2 == this.b($$1) && $$2.M() < $$3.M()) {
               $$2.e($$3.M());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof bxu) {
               if (this.fV()) {
                  $$2 = $$3;
               }

               bur $$5 = $$2.a(this, (bxu)$$0, $$1);
               if ($$5.a()) {
                  this.dV().a(ege.r, $$0.dt(), ege.a.a(this));
                  if ($$2.f() && !this.fV()) {
                     this.a($$1, czy.k);
                  }

                  return $$5;
               }
            }

            return bur.e;
         }
      }
   }

   @Override
   public void ab() {
      super.ab();
      this.J = 0;
   }

   @Override
   protected boolean fg() {
      return super.fg() || this.fR();
   }

   @Override
   public boolean em() {
      return !this.cw.b;
   }

   @Override
   protected ffq a(ffq $$0, bxy $$1) {
      float $$2 = this.dP();
      if (!this.cw.b && !($$0.e > 0.0) && ($$1 == bxy.a || $$1 == bxy.b) && this.ga() && this.I($$2)) {
         double $$3 = $$0.d;
         double $$4 = $$0.f;
         double $$5 = 0.05;
         double $$6 = Math.signum($$3) * 0.05;

         double $$7;
         for ($$7 = Math.signum($$4) * 0.05; $$3 != 0.0 && this.q($$3, 0.0, (double)$$2); $$3 -= $$6) {
            if (Math.abs($$3) <= 0.05) {
               $$3 = 0.0;
               break;
            }
         }

         while ($$4 != 0.0 && this.q(0.0, $$4, (double)$$2)) {
            if (Math.abs($$4) <= 0.05) {
               $$4 = 0.0;
               break;
            }

            $$4 -= $$7;
         }

         while ($$3 != 0.0 && $$4 != 0.0 && this.q($$3, $$4, (double)$$2)) {
            if (Math.abs($$3) <= 0.05) {
               $$3 = 0.0;
            } else {
               $$3 -= $$6;
            }

            if (Math.abs($$4) <= 0.05) {
               $$4 = 0.0;
            } else {
               $$4 -= $$7;
            }
         }

         return new ffq($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean I(float $$0) {
      return this.aH() || this.Z < (double)$$0 && !this.q(0.0, 0.0, (double)$$0 - this.Z);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      ffl $$3 = this.cR();
      return this.dV().a(this, new ffl($$3.a + 1.0E-7 + $$0, $$3.b - $$2 - 1.0E-7, $$3.c + 1.0E-7 + $$1, $$3.d - 1.0E-7 + $$0, $$3.b, $$3.f - 1.0E-7 + $$1));
   }

   public void e(bwt $$0) {
      if ($$0.cB()) {
         if (!$$0.v(this)) {
            float $$1 = this.fv() ? this.bq : (float)this.h(bza.c);
            czy $$2 = this.dZ();
            bvi $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.dW().a(this));
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.H(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gE();
            if ($$0.an().a(axh.H) && $$0 instanceof css $$6 && $$6.a(cst.c, this, this, true)) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), awp.uR, this.dm());
               return;
            }

            if ($$1 > 0.0F || $$4 > 0.0F) {
               boolean $$7 = $$5 > 0.9F;
               boolean $$8;
               if (this.ci() && $$7) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awp.uQ, this.dm(), 1.0F, 1.0F);
                  $$8 = true;
               } else {
                  $$8 = false;
               }

               $$1 += $$2.h().a($$0, $$1, $$3);
               boolean $$10 = $$7 && this.Z > 0.0 && !this.aH() && !this.d_() && !this.bi() && !this.b(bvz.o) && !this.bY() && $$0 instanceof bxu && !this.ci();
               if ($$10) {
                  $$1 *= 1.5F;
               }

               float $$11 = $$1 + $$4;
               boolean $$12 = false;
               if ($$7 && !$$10 && !$$8 && this.aH()) {
                  double $$13 = this.ae().j();
                  double $$14 = (double)this.fo() * 2.5;
                  if ($$13 < azo.k($$14) && this.b(buq.a).a(axm.bH)) {
                     $$12 = true;
                  }
               }

               float $$15 = 0.0F;
               if ($$0 instanceof bxu $$16) {
                  $$15 = $$16.eG();
               }

               ffq $$17 = $$0.dy();
               boolean $$18 = $$0.b($$3, $$11);
               if ($$18) {
                  float $$19 = this.b($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                  if ($$19 > 0.0F) {
                     if ($$0 instanceof bxu $$20) {
                        $$20.p(
                           (double)($$19 * 0.5F), (double)azo.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azo.b(this.dL() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.i(
                           (double)(-azo.a(this.dL() * (float) (Math.PI / 180.0)) * $$19 * 0.5F),
                           0.1,
                           (double)(azo.b(this.dL() * (float) (Math.PI / 180.0)) * $$19 * 0.5F)
                        );
                     }

                     this.i(this.dy().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$12) {
                     float $$21 = 1.0F + (float)this.h(bza.D) * $$1;

                     for (bxu $$23 : this.dV().a(bxu.class, $$0.cR().c(1.0, 0.25, 1.0))) {
                        if ($$23 != this && $$23 != $$0 && !this.s($$23)) {
                           if ($$23 instanceof cnr) {
                              cnr $$24 = (cnr)$$23;
                              if ($$24.t()) {
                                 continue;
                              }
                           }

                           if (this.g($$23) < 9.0) {
                              float $$25 = this.a($$23, $$21, $$3) * $$5;
                              djx var22 = this.dV();
                              if (var22 instanceof ars) {
                                 ars $$26 = (ars)var22;
                                 if ($$23.a($$26, $$3, $$25)) {
                                    $$23.p(0.4F, (double)azo.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azo.b(this.dL() * (float) (Math.PI / 180.0))));
                                    dgn.a($$26, (bwt)$$23, $$3);
                                 }
                              }
                           }
                        }
                     }

                     this.dV().a(null, this.dA(), this.dC(), this.dG(), awp.uT, this.dm(), 1.0F, 1.0F);
                     this.gf();
                  }

                  if ($$0 instanceof art && $$0.T) {
                     ((art)$$0).f.b(new afh($$0));
                     $$0.T = false;
                     $$0.i($$17);
                  }

                  if ($$10) {
                     this.dV().a(null, this.dA(), this.dC(), this.dG(), awp.uP, this.dm(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$10 && !$$12) {
                     if ($$7) {
                        this.dV().a(null, this.dA(), this.dC(), this.dG(), awp.uS, this.dm(), 1.0F, 1.0F);
                     } else {
                        this.dV().a(null, this.dA(), this.dC(), this.dG(), awp.uU, this.dm(), 1.0F, 1.0F);
                     }
                  }

                  if ($$4 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  bwt $$27 = $$0;
                  if ($$0 instanceof cms) {
                     $$27 = ((cms)$$0).a;
                  }

                  boolean $$28 = false;
                  if (this.dV() instanceof ars $$29) {
                     if ($$27 instanceof bxu $$30) {
                        $$28 = $$2.a($$30, this);
                     }

                     dgn.a($$29, $$0, $$3);
                  }

                  if (!this.dV().C && !$$2.f() && $$27 instanceof bxu) {
                     if ($$28) {
                        $$2.b((bxu)$$27, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.fb()) {
                           this.a(buq.a, czy.k);
                        } else {
                           this.a(buq.b, czy.k);
                        }
                     }
                  }

                  if ($$0 instanceof bxu) {
                     float $$31 = $$15 - ((bxu)$$0).eG();
                     this.a(awz.G, Math.round($$31 * 10.0F));
                     if (this.dV() instanceof ars && $$31 > 2.0F) {
                        int $$32 = (int)((double)$$31 * 0.5);
                        ((ars)this.dV()).a(ly.g, $$0.dA(), $$0.e(0.5), $$0.dG(), $$32, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.G(0.1F);
               } else {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awp.uR, this.dm(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(bwt $$0, float $$1, bvi $$2) {
      return $$1;
   }

   @Override
   protected void f(bxu $$0) {
      this.e($$0);
   }

   public void b(bwt $$0) {
   }

   @Override
   public void c(bwt $$0) {
   }

   public void gf() {
      double $$0 = (double)(-azo.a(this.dL() * (float) (Math.PI / 180.0)));
      double $$1 = (double)azo.b(this.dL() * (float) (Math.PI / 180.0));
      if (this.dV() instanceof ars) {
         ((ars)this.dV()).a(ly.am, this.dA() + $$0, this.e(0.5), this.dG() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void gg() {
   }

   @Override
   public void a(bwt.d $$0) {
      super.a($$0);
      this.bQ.a(this);
      if (this.bR != null && this.gm()) {
         this.q();
      }
   }

   @Override
   public boolean P_() {
      return true;
   }

   @Override
   protected boolean dh() {
      return this.gh();
   }

   public boolean gh() {
      return false;
   }

   @Override
   public boolean di() {
      return !this.dV().C || this.gh();
   }

   @Override
   public boolean dj() {
      return !this.dV().C || this.gh();
   }

   public GameProfile gi() {
      return this.cy;
   }

   public crw gj() {
      return this.ct;
   }

   public crt gk() {
      return this.cw;
   }

   @Override
   public boolean fV() {
      return this.cw.d;
   }

   public boolean gl() {
      return this.cw.d;
   }

   public void a(czy $$0, czy $$1, cwa $$2) {
   }

   public boolean gm() {
      return this.bR != this.bQ;
   }

   public boolean gn() {
      return true;
   }

   public Either<crx.a, baw> a(iv $$0) {
      this.b($$0);
      this.cv = 0;
      return Either.right(baw.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fS();
      if (this.dV() instanceof ars && $$1) {
         ((ars)this.dV()).f();
      }

      this.cv = $$0 ? 0 : 100;
   }

   @Override
   public void fS() {
      this.a(true, true);
   }

   public boolean go() {
      return this.fR() && this.cv >= 100;
   }

   public int gp() {
      return this.cv;
   }

   public void a(xa $$0, boolean $$1) {
   }

   public void a(ali $$0) {
      this.b(awz.i.b($$0));
   }

   public void a(ali $$0, int $$1) {
      this.a(awz.i.b($$0), $$1);
   }

   public void b(aww<?> $$0) {
      this.a($$0, 1);
   }

   public void a(aww<?> $$0, int $$1) {
   }

   public void a(aww<?> $$0) {
   }

   public int a(Collection<deu<?>> $$0) {
      return 0;
   }

   public void a(deu<?> $$0, List<czy> $$1) {
   }

   @Override
   public void b(List<alh<dep<?>>> $$0) {
   }

   public int b(Collection<deu<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(ffq $$0) {
      if (this.bY()) {
         super.a_($$0);
      } else {
         if (this.cj()) {
            double $$1 = this.bS().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bf || !this.dV().b_(iv.a(this.dA(), this.dC() + 1.0 - 0.1, this.dG())).c()) {
               ffq $$3 = this.dy();
               this.i($$3.b(0.0, ($$1 - $$3.e) * $$2, 0.0));
            }
         }

         if (this.gk().b) {
            double $$4 = this.dy().e;
            super.a_($$0);
            this.i(this.dy().a(jb.a.b, $$4 * 0.6));
         } else {
            super.a_($$0);
         }
      }
   }

   @Override
   protected boolean ft() {
      return !this.cw.b && super.ft();
   }

   @Override
   public void bn() {
      if (this.cw.b) {
         this.i(false);
      } else {
         super.bn();
      }
   }

   protected boolean h(iv $$0) {
      return !this.dV().a_($$0).j(this.dV(), $$0);
   }

   @Override
   public float fo() {
      return (float)this.h(bza.v);
   }

   @Override
   public boolean a(double $$0, float $$1, bvi $$2) {
      if (this.cw.c) {
         return false;
      } else {
         if ($$0 >= 2.0) {
            this.a(awz.t, (int)Math.round($$0 * 100.0));
         }

         boolean $$3 = this.cm != null && this.cD;
         double $$4;
         if ($$3) {
            $$4 = Math.min($$0, this.cm.e - this.dC());
            boolean $$5 = $$4 <= 0.0;
            if ($$5) {
               this.gP();
            } else {
               this.gO();
            }
         } else {
            $$4 = $$0;
         }

         if ($$4 > 0.0 && super.a($$4, $$1, $$2)) {
            this.gP();
            return true;
         } else {
            this.b($$0, $$1, $$2);
            return false;
         }
      }
   }

   public boolean gq() {
      if (!this.fJ() && this.ft() && !this.bi()) {
         this.gr();
         return true;
      } else {
         return false;
      }
   }

   public void gr() {
      this.b(7, true);
   }

   @Override
   protected void bq() {
      if (!this.Z_()) {
         super.bq();
      }
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      if (this.bi()) {
         this.aX();
         this.b($$1);
      } else {
         iv $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            ebe $$3 = this.dV().a_($$2);
            if ($$3.a(axe.br)) {
               this.a($$3, $$1);
            } else {
               super.b($$2, $$3);
            }
         } else {
            super.b($$0, $$1);
         }
      }
   }

   @Override
   public bxu.a eO() {
      return new bxu.a(awp.vf, awp.uV);
   }

   @Override
   public boolean a(ars $$0, bxu $$1) {
      this.b(awz.g.b($$1.an()));
      return true;
   }

   @Override
   public void a(ebe $$0, ffq $$1) {
      if (!this.cw.b) {
         super.a($$0, $$1);
      }

      this.gO();
   }

   public void d(int $$0) {
      this.r($$0);
      this.ch = this.ch + (float)$$0 / (float)this.gt();
      this.cg = azo.a(this.cg + $$0, 0, Integer.MAX_VALUE);

      while (this.ch < 0.0F) {
         float $$1 = this.ch * (float)this.gt();
         if (this.cf > 0) {
            this.c(-1);
            this.ch = 1.0F + $$1 / (float)this.gt();
         } else {
            this.c(-1);
            this.ch = 0.0F;
         }
      }

      while (this.ch >= 1.0F) {
         this.ch = (this.ch - 1.0F) * (float)this.gt();
         this.c(1);
         this.ch = this.ch / (float)this.gt();
      }
   }

   public int gs() {
      return this.ci;
   }

   public void a(czy $$0, int $$1) {
      this.cf -= $$1;
      if (this.cf < 0) {
         this.cf = 0;
         this.ch = 0.0F;
         this.cg = 0;
      }

      this.ci = this.ae.f();
   }

   public void c(int $$0) {
      this.cf = IntMath.saturatedAdd(this.cf, $$0);
      if (this.cf < 0) {
         this.cf = 0;
         this.ch = 0.0F;
         this.cg = 0;
      }

      if ($$0 > 0 && this.cf % 5 == 0 && (float)this.cx < (float)this.af - 100.0F) {
         float $$1 = this.cf > 30 ? 1.0F : (float)this.cf / 30.0F;
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awp.ve, this.dm(), $$1 * 0.75F, 1.0F);
         this.cx = this.af;
      }
   }

   public int gt() {
      if (this.cf >= 30) {
         return 112 + (this.cf - 30) * 9;
      } else {
         return this.cf >= 15 ? 37 + (this.cf - 15) * 5 : 7 + this.cf * 2;
      }
   }

   public void G(float $$0) {
      if (!this.cw.a) {
         if (!this.dV().C) {
            this.bS.a($$0);
         }
      }
   }

   public Optional<crc> Z() {
      return Optional.empty();
   }

   public cvm gu() {
      return this.bS;
   }

   public boolean t(boolean $$0) {
      return this.cw.a || $$0 || this.bS.b();
   }

   public boolean gv() {
      return this.eG() > 0.0F && this.eG() < this.eU();
   }

   public boolean gw() {
      return this.cw.e;
   }

   public boolean a(iv $$0, jb $$1, czy $$2) {
      if (this.cw.e) {
         return true;
      } else {
         iv $$3 = $$0.a($$1.g());
         ebi $$4 = new ebi(this.dV(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int e(ars $$0) {
      return !$$0.O().c(djt.e) && !this.Z_() ? Math.min(this.cf * 7, 100) : 0;
   }

   @Override
   protected boolean eq() {
      return true;
   }

   @Override
   public boolean cM() {
      return true;
   }

   @Override
   protected bwt.c bf() {
      return this.cw.b || this.aH() && this.cf() ? bwt.c.a : bwt.c.d;
   }

   public void x() {
   }

   @Override
   public xa ai() {
      return xa.b(this.cy.getName());
   }

   public cxe gx() {
      return this.bP;
   }

   @Override
   protected boolean b(bxd $$0) {
      return $$0.a() == bxd.a.b;
   }

   public boolean h(czy $$0) {
      return this.ct.g($$0);
   }

   public boolean j(tz $$0) {
      if (this.bY() || !this.aH() || this.bi() || this.av) {
         return false;
      } else if (this.gB().j()) {
         this.k($$0);
         this.cs = this.dV().ae();
         return true;
      } else if (this.gC().j()) {
         this.l($$0);
         this.cs = this.dV().ae();
         return true;
      } else {
         return false;
      }
   }

   protected void gy() {
      if (this.cs + 20L < this.dV().ae()) {
         this.d(this.gB());
         this.k(new tz());
         this.d(this.gC());
         this.l(new tz());
      }
   }

   private void d(tz $$0) {
      if (!this.dV().C && !$$0.j()) {
         bxc.a($$0, this.dV(), bxb.r).ifPresent($$0x -> {
            if ($$0x instanceof byq $$1) {
               $$1.i(this);
            }

            $$0x.a_(this.dA(), this.dC() + 0.7F, this.dG());
            ((ars)this.dV()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean Z_();

   @Override
   public boolean bE() {
      return !this.Z_() && super.bE();
   }

   @Override
   public boolean cj() {
      return !this.cw.b && !this.Z_() && super.cj();
   }

   public abstract boolean b();

   @Override
   public boolean cJ() {
      return !this.cw.b;
   }

   public fgv gz() {
      return this.dV().R();
   }

   @Override
   public xa m_() {
      xo $$0 = fgq.a(this.cq(), this.ai());
      return this.a($$0);
   }

   private xo a(xo $$0) {
      String $$1 = this.gi().getName();
      return $$0.a($$1x -> $$1x.a(new wy.g("/tell " + $$1 + " ")).a(this.cQ()).a($$1));
   }

   @Override
   public String cI() {
      return this.gi().getName();
   }

   @Override
   protected void F(float $$0) {
      this.ar().a(c, $$0);
   }

   @Override
   public float fw() {
      return this.ar().a(c);
   }

   public boolean a(crz $$0) {
      return (this.ar().a(bK) & $$0.a()) == $$0.a();
   }

   @Override
   public byl a_(int $$0) {
      if ($$0 == 499) {
         return new byl() {
            @Override
            public czy a() {
               return crx.this.bR.g();
            }

            @Override
            public boolean a(czy $$0) {
               crx.this.bR.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new byl() {
               @Override
               public czy a() {
                  return crx.this.bQ.r().a($$1);
               }

               @Override
               public boolean a(czy $$0) {
                  crx.this.bQ.r().a($$1, $$0);
                  crx.this.bQ.a(crx.this.ct);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.ct.i().size()) {
            return byl.a(this.ct, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.bP.b() ? byl.a(this.bP, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gA() {
      return this.cz;
   }

   public void u(boolean $$0) {
      this.cz = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.cw.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bxl fy() {
      return this.al.a(bL) == 0 ? bxl.a : bxl.b;
   }

   public void b(bxl $$0) {
      this.al.a(bL, (byte)($$0 == bxl.a ? 0 : 1));
   }

   public tz gB() {
      return this.al.a(bM);
   }

   protected void k(tz $$0) {
      this.al.a(bM, $$0);
   }

   public tz gC() {
      return this.al.a(bN);
   }

   protected void l(tz $$0) {
      this.al.a(bN, $$0);
   }

   public float gD() {
      return (float)(1.0 / this.h(bza.e) * 20.0);
   }

   public float H(float $$0) {
      return azo.a(((float)this.aS + $$0) / this.gD(), 0.0F, 1.0F);
   }

   public void gE() {
      this.aS = 0;
   }

   public czv gF() {
      return this.cB;
   }

   @Override
   protected float aS() {
      return !this.cw.b && !this.fJ() ? super.aS() : 1.0F;
   }

   @Override
   public float eh() {
      return (float)this.h(bza.q);
   }

   public boolean gG() {
      return this.cw.d && this.G() >= 2;
   }

   public int G() {
      return 0;
   }

   public boolean s(int $$0) {
      return this.G() >= $$0;
   }

   @Override
   public bww e(byg $$0) {
      return b.getOrDefault($$0, bJ);
   }

   @Override
   public ImmutableList<byg> fO() {
      return ImmutableList.of(byg.a, byg.f, byg.d);
   }

   @Override
   public czy d(czy $$0) {
      if (!($$0.h() instanceof dat)) {
         return czy.k;
      } else {
         Predicate<czy> $$1 = ((dat)$$0.h()).c();
         czy $$2 = dat.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((dat)$$0.h()).a();

            for (int $$3 = 0; $$3 < this.ct.b(); $$3++) {
               czy $$4 = this.ct.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.fV() ? new czy(dac.pk) : czy.k;
         }
      }
   }

   @Override
   public ffq v(float $$0) {
      double $$1 = 0.22 * (this.fy() == bxl.b ? -1.0 : 1.0);
      float $$2 = azo.h($$0 * 0.5F, this.dN(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = azo.h($$0, this.aW, this.aV) * (float) (Math.PI / 180.0);
      if (this.fJ() || this.fv()) {
         ffq $$4 = this.h($$0);
         ffq $$5 = this.dy();
         double $$6 = $$5.j();
         double $$7 = $$4.j();
         float $$10;
         if ($$6 > 0.0 && $$7 > 0.0) {
            double $$8 = ($$5.d * $$4.d + $$5.f * $$4.f) / Math.sqrt($$6 * $$7);
            double $$9 = $$5.d * $$4.f - $$5.f * $$4.d;
            $$10 = (float)(Math.signum($$9) * Math.acos($$8));
         } else {
            $$10 = 0.0F;
         }

         return this.p($$0).e(new ffq($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.ck()) {
         return this.p($$0).e(new ffq($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cR().c() - 1.0;
         double $$13 = this.ch() ? -0.2 : 0.07;
         return this.p($$0).e(new ffq($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dU() {
      return true;
   }

   public boolean gH() {
      return this.fz() && this.fB().a(dac.sf);
   }

   @Override
   public boolean dT() {
      return false;
   }

   public Optional<je> gI() {
      return this.cC;
   }

   public void a(Optional<je> $$0) {
      this.cC = $$0;
   }

   @Override
   public float eM() {
      return this.cl;
   }

   @Override
   public void q(float $$0) {
      super.q($$0);
      this.cl = $$0;
   }

   @Override
   public boolean dO() {
      return true;
   }

   @Override
   protected float fn() {
      if (this.cw.b && !this.bY()) {
         return this.ci() ? this.cw.a() * 2.0F : this.cw.a();
      } else {
         return this.ci() ? 0.025999999F : 0.02F;
      }
   }

   public boolean gJ() {
      return this.cu || this.bU <= 0;
   }

   public void gK() {
      if (!this.cu) {
         this.bU--;
      }
   }

   public void v(boolean $$0) {
      this.cu = $$0;
      if (!this.cu) {
         this.bU = 60;
      }
   }

   public double gL() {
      return this.h(bza.g);
   }

   public double gM() {
      return this.h(bza.j);
   }

   public boolean b(bwt $$0, double $$1) {
      return $$0.dQ() ? false : this.a($$0.cR(), $$1);
   }

   public boolean a(ffl $$0, double $$1) {
      double $$2 = this.gM() + $$1;
      return $$0.e(this.bD()) < $$2 * $$2;
   }

   public boolean a(iv $$0, double $$1) {
      double $$2 = this.gL() + $$1;
      return new ffl($$0).e(this.bD()) < $$2 * $$2;
   }

   public void w(boolean $$0) {
      this.cD = $$0;
      if ($$0) {
         this.cE = 40;
      } else {
         this.cE = 0;
      }
   }

   public boolean gN() {
      return this.cD;
   }

   public void gO() {
      if (this.cE == 0) {
         this.gP();
      }
   }

   public void gP() {
      this.cE = 0;
      this.cn = null;
      this.cm = null;
      this.cD = false;
   }

   public boolean gQ() {
      return false;
   }

   @Override
   public boolean d_() {
      return this.cw.b ? false : super.d_();
   }

   public static enum a {
      a,
      b(xa.c("block.minecraft.bed.no_sleep")),
      c(xa.c("block.minecraft.bed.too_far_away")),
      d(xa.c("block.minecraft.bed.obstructed")),
      e,
      f(xa.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final xa g;

      private a() {
         this.g = null;
      }

      private a(final xa $$0) {
         this.g = $$0;
      }

      @Nullable
      public xa a() {
         return this.g;
      }
   }
}
