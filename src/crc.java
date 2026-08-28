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

public abstract class crc extends bxe {
   public static final bwx bu = bwx.b;
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
   public static final feq bI = new feq(0.0, 0.6, 0.0);
   public static final bwi bJ = bwi.b(0.6F, 1.8F).b(1.62F).a(bwh.a().a(bwg.b, bI));
   private static final Map<bxq, bwi> b = ImmutableMap.builder()
      .put(bxq.a, bJ)
      .put(bxq.c, aD)
      .put(bxq.b, bwi.b(0.6F, 0.6F).b(0.4F))
      .put(bxq.d, bwi.b(0.6F, 0.6F).b(0.4F))
      .put(bxq.e, bwi.b(0.6F, 0.6F).b(0.4F))
      .put(bxq.f, bwi.b(0.6F, 1.5F).b(1.27F).a(bwh.a().a(bwg.b, bI)))
      .put(bxq.h, bwi.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final akj<Float> c = akn.a(crc.class, akl.d);
   private static final akj<Integer> d = akn.a(crc.class, akl.b);
   protected static final akj<Byte> bK = akn.a(crc.class, akl.a);
   protected static final akj<Byte> bL = akn.a(crc.class, akl.a);
   protected static final akj<tz> bM = akn.a(crc.class, akl.t);
   protected static final akj<tz> bN = akn.a(crc.class, akl.t);
   public static final int bO = 60;
   private long e;
   final crb f;
   protected cwj bP = new cwj();
   public final cvy bQ;
   public cuv bR;
   protected cur bS = new cur();
   protected int bT;
   private boolean g = false;
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
   private int h;
   protected boolean ce;
   private final cqy i = new cqy();
   public int cf;
   public int cg;
   public float ch;
   protected int ci;
   protected final float cj = 0.02F;
   private int j;
   private final GameProfile k;
   private boolean cq;
   private czd cr = czd.k;
   private final cza cs = this.g();
   private Optional<jd> ct = Optional.empty();
   @Nullable
   public crt ck;
   protected float cl;
   @Nullable
   public feq cm;
   @Nullable
   public bwf cn;
   private boolean cu;
   private int cv;

   public crc(dja $$0, iu $$1, float $$2, GameProfile $$3) {
      super(bwo.bS, $$0);
      this.a_($$3.getId());
      this.k = $$3;
      this.f = new crb(this, this.bt);
      this.bQ = new cvy(this.f, !$$0.C, this);
      this.bR = this.bQ;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
   }

   @Override
   protected bwj eb() {
      return new crd(this);
   }

   public boolean a(dja $$0, iu $$1, dix $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dix.d) {
         return true;
      } else if (this.gw()) {
         return false;
      } else {
         czd $$3 = this.fb();
         return $$3.f() || !$$3.b(new eal($$0, $$1, false));
      }
   }

   public static byj.a fX() {
      return bxe.ee().a(byk.c, 1.0).a(byk.v, 0.1F).a(byk.e).a(byk.q).a(byk.g, 4.5).a(byk.j, 3.0).a(byk.f).a(byk.C).a(byk.z).a(byk.t).a(byk.D);
   }

   @Override
   protected void a(akn.a $$0) {
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
      this.ad = this.V_();
      if (this.V_() || this.bZ()) {
         this.d(false);
      }

      if (this.bX > 0) {
         this.bX--;
      }

      if (this.fR()) {
         this.h++;
         if (this.h > 100) {
            this.h = 100;
         }

         if (!this.dV().C && this.dV().V()) {
            this.a(false, true);
         }
      } else if (this.h > 0) {
         this.h++;
         if (this.h >= 110) {
            this.h = 0;
         }
      }

      this.gb();
      super.h();
      if (!this.dV().C && this.bR != null && !this.bR.b(this)) {
         this.p();
         this.bR = this.bQ;
      }

      this.n();
      if (this instanceof arr $$0) {
         this.bS.a($$0);
         this.a(awx.k);
         this.a(awx.l);
         if (this.bK()) {
            this.a(awx.m);
         }

         if (this.cg()) {
            this.a(awx.o);
         }

         if (!this.fR()) {
            this.a(awx.n);
         }
      }

      int $$1 = 29999999;
      double $$2 = azm.a(this.dA(), -2.9999999E7, 2.9999999E7);
      double $$3 = azm.a(this.dG(), -2.9999999E7, 2.9999999E7);
      if ($$2 != this.dA() || $$3 != this.dG()) {
         this.a_($$2, this.dC(), $$3);
      }

      this.aS++;
      czd $$4 = this.fb();
      if (!czd.a(this.cr, $$4)) {
         if (!czd.b(this.cr, $$4)) {
            this.gE();
         }

         this.cr = $$4.v();
      }

      if (!this.a(axh.a) && this.c(czh.pc)) {
         this.m();
      }

      this.cs.a();
      this.gc();
      if (this.cv > 0) {
         this.cv--;
      }
   }

   @Override
   protected float fp() {
      return this.fG() ? 15.0F : super.fp();
   }

   public boolean fY() {
      return this.cd();
   }

   protected boolean fZ() {
      return this.cd();
   }

   protected boolean ga() {
      return this.cd();
   }

   protected boolean gb() {
      this.ce = this.a(axh.a);
      return this.ce;
   }

   @Override
   public void a(boolean $$0, iu $$1) {
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
      this.a(new bvj(bvl.m, 200, 0, false, false, true));
   }

   private boolean c(cyz $$0) {
      for (bwp $$1 : bwp.j) {
         czd $$2 = this.a($$1);
         dhm $$3 = $$2.a(kj.D);
         if ($$2.a($$0) && $$3 != null && $$3.b() == $$1) {
            return true;
         }
      }

      return false;
   }

   protected cza g() {
      return new cza();
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
      if (this.h(bxq.d)) {
         bxq $$0 = this.t();
         bxq $$1;
         if (this.V_() || this.bZ() || this.h($$0)) {
            $$1 = $$0;
         } else if (this.h(bxq.f)) {
            $$1 = bxq.f;
         } else {
            $$1 = bxq.d;
         }

         this.b($$1);
      }
   }

   private bxq t() {
      if (this.fR()) {
         return bxq.c;
      } else if (this.ck()) {
         return bxq.d;
      } else if (this.fJ()) {
         return bxq.b;
      } else if (this.fv()) {
         return bxq.e;
      } else {
         return this.cd() && !this.i.b ? bxq.f : bxq.a;
      }
   }

   protected boolean h(bxq $$0) {
      return this.dV().a(this, this.a($$0).a(this.dt()).h(1.0E-7));
   }

   @Override
   protected awm aV() {
      return awn.vi;
   }

   @Override
   protected awm aW() {
      return awn.vg;
   }

   @Override
   protected awm aX() {
      return awn.vh;
   }

   @Override
   public int bX() {
      return 10;
   }

   @Override
   public void a(awm $$0, float $$1, float $$2) {
      this.dV().a(this, this.dA(), this.dC(), this.dG(), $$0, this.dm(), $$1, $$2);
   }

   public void a(awm $$0, awo $$1, float $$2, float $$3) {
   }

   @Override
   public awo dm() {
      return awo.h;
   }

   @Override
   protected int dn() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.K_();
      } else if ($$0 == 23) {
         this.cq = false;
      } else if ($$0 == 22) {
         this.cq = true;
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
      if (!this.dV().C && this.fZ() && this.bZ()) {
         this.bP();
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
      this.f.l();
      this.bV = this.bW;
      if (this.i.b && !this.bZ()) {
         this.k();
      }

      super.k_();
      this.eZ();
      this.aX = this.dL();
      this.B((float)this.h(byk.v));
      float $$1;
      if (this.aJ() && !this.eH() && !this.ck()) {
         $$1 = Math.min(0.1F, (float)this.dy().i());
      } else {
         $$1 = 0.0F;
      }

      this.bW = this.bW + ($$1 - this.bW) * 0.4F;
      if (this.eG() > 0.0F && !this.V_()) {
         fel $$2;
         if (this.bZ() && !this.dk().dQ()) {
            $$2 = this.cR().b(this.dk().cR()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cR().c(1.0, 0.5, 1.0);
         }

         List<bwf> $$4 = this.dV().a_(this, $$2);
         List<bwf> $$5 = Lists.newArrayList();

         for (bwf $$6 : $$4) {
            if ($$6.aq() == bwo.V) {
               $$5.add($$6);
            } else if (!$$6.dQ()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(af.a($$5, this.ae));
         }
      }

      this.c(this.gB());
      this.c(this.gC());
      if (!this.dV().C && (this.Z > 0.5 || this.bj()) || this.i.b || this.fR() || this.av) {
         this.gy();
      }
   }

   @Override
   protected void j() {
   }

   private void c(@Nullable tz $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dV().A.a(200) == 0) {
         String $$1 = $$0.l("id");
         bwo.a($$1).filter($$0x -> $$0x == bwo.aO).ifPresent($$0x -> {
            if (!cjo.a(this.dV(), this)) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), cjo.a(this.dV(), this.dV().A), this.dm(), 1.0F, cjo.a(this.dV().A));
            }
         });
      }
   }

   private void d(bwf $$0) {
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

   public void a(int $$0, float $$1, czd $$2) {
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
   public czd dZ() {
      return this.fv() && this.br != null ? this.br : super.dZ();
   }

   @Override
   public void a(buu $$0) {
      super.a($$0);
      this.ay();
      if (!this.V_() && this.dV() instanceof arq $$1) {
         this.b($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-azm.b((this.eM() + this.dL()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-azm.a((this.eM() + this.dL()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(awx.N);
      this.a(awx.i.b(awx.m));
      this.a(awx.i.b(awx.n));
      this.aH();
      this.c(false);
      this.c(Optional.of(jd.a(this.dV().aj(), this.dv())));
   }

   @Override
   protected void f(arq $$0) {
      super.f($$0);
      if (!$$0.O().c(diw.e)) {
         this.ge();
         this.f.m();
      }
   }

   protected void ge() {
      for (int $$0 = 0; $$0 < this.f.b(); $$0++) {
         czd $$1 = this.f.a($$0);
         if (!$$1.f() && dfs.a($$1, dfr.D)) {
            this.f.b($$0);
         }
      }
   }

   @Override
   protected awm e(buu $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected awm l_() {
      return awn.uY;
   }

   @Override
   public void g(czd $$0) {
   }

   @Nullable
   public cnh a(czd $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   public float c(eah $$0) {
      float $$1 = this.f.g().a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(byk.t);
      }

      if (bvk.a(this)) {
         $$1 *= 1.0F + (float)(bvk.b(this) + 1) * 0.2F;
      }

      if (this.b(bvl.d)) {
         float $$2 = switch (this.c(bvl.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.h(byk.f);
      if (this.a(axh.a)) {
         $$1 *= (float)this.g(byk.C).g();
      }

      if (!this.aJ()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(eah $$0) {
      return !$$0.C() || this.f.g().b($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a_(this.k.getId());
      uf $$1 = $$0.c("Inventory", 10);
      this.f.b($$1);
      this.f.c($$0.h("SelectedItemSlot"));
      this.h = $$0.g("SleepTimer");
      this.ch = $$0.j("XpP");
      this.cf = $$0.h("XpLevel");
      this.cg = $$0.h("XpTotal");
      this.ci = $$0.h("XpSeed");
      if (this.ci == 0) {
         this.ci = this.ae.f();
      }

      this.q($$0.h("Score"));
      this.bS.a($$0);
      this.i.b($$0);
      this.g(byk.v).a((double)this.i.b());
      if ($$0.b("EnderItems", 9)) {
         this.bP.a($$0.c("EnderItems", 10), this.dX());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      this.c($$0.a("LastDeathLocation", jd.b));
      this.cm = $$0.<feq>a("current_explosion_impact_pos", feq.a).orElse(null);
      this.cu = $$0.q("ignore_fall_damage_from_current_explosion");
      this.cv = $$0.h("current_impulse_context_reset_grace_time");
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      uo.e($$0);
      $$0.a("Inventory", this.f.a(new uf()));
      $$0.a("SelectedItemSlot", this.f.f());
      $$0.a("SleepTimer", (short)this.h);
      $$0.a("XpP", this.ch);
      $$0.a("XpLevel", this.cf);
      $$0.a("XpTotal", this.cg);
      $$0.a("XpSeed", this.ci);
      $$0.a("Score", this.gd());
      this.bS.b($$0);
      this.i.a($$0);
      $$0.a("EnderItems", this.bP.a(this.dX()));
      if (!this.gB().g()) {
         $$0.a("ShoulderEntityLeft", this.gB());
      }

      if (!this.gC().g()) {
         $$0.a("ShoulderEntityRight", this.gC());
      }

      this.ct.ifPresent($$1 -> $$0.a("LastDeathLocation", jd.b, $$1));
      if (this.cm != null) {
         $$0.a("current_explosion_impact_pos", feq.a, this.cm);
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cu);
      $$0.a("current_impulse_context_reset_grace_time", this.cv);
   }

   @Override
   public boolean a(arq $$0, buu $$1) {
      if (super.a($$0, $$1)) {
         return true;
      } else if ($$1.a(axd.n)) {
         return !$$0.O().c(diw.I);
      } else if ($$1.a(axd.m)) {
         return !$$0.O().c(diw.J);
      } else if ($$1.a(axd.i)) {
         return !$$0.O().c(diw.K);
      } else {
         return $$1.a(axd.o) ? !$$0.O().c(diw.L) : false;
      }
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.i.a && !$$1.a(axd.d)) {
         return false;
      } else {
         this.bd = 0;
         if (this.eH()) {
            return false;
         } else {
            this.gy();
            if ($$1.g()) {
               if ($$0.an() == bua.a) {
                  $$2 = 0.0F;
               }

               if ($$0.an() == bua.b) {
                  $$2 = Math.min($$2 / 2.0F + 1.0F, $$2);
               }

               if ($$0.an() == bua.d) {
                  $$2 = $$2 * 3.0F / 2.0F;
               }
            }

            return $$2 == 0.0F ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void b(arq $$0, bxe $$1) {
      super.b($$0, $$1);
      czd $$2 = this.fH();
      dbe $$3 = $$2 != null ? $$2.a(kj.I) : null;
      float $$4 = $$1.fU();
      if ($$4 > 0.0F && $$3 != null) {
         $$3.a($$0, this, $$4, $$2);
      }
   }

   @Override
   public boolean ez() {
      return !this.gk().a && super.ez();
   }

   public boolean a(crc $$0) {
      ffx $$1 = this.cr();
      ffx $$2 = $$0.cr();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.i();
      }
   }

   @Override
   protected void c(buu $$0, float $$1) {
      this.a($$0, $$1, new bwp[]{bwp.c, bwp.d, bwp.e, bwp.f});
   }

   @Override
   protected void d(buu $$0, float $$1) {
      this.a($$0, $$1, new bwp[]{bwp.f});
   }

   @Override
   protected void c(arq $$0, buu $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var8 = Math.max($$2 - this.fw(), 0.0F);
         this.E(this.fw() - ($$2 - var8));
         float $$4 = $$2 - var8;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
            this.a(awx.L, Math.round($$4 * 10.0F));
         }

         if (var8 != 0.0F) {
            this.G($$1.a());
            this.eS().a($$1, var8);
            this.d(this.eG() - var8);
            if (var8 < 3.4028235E37F) {
               this.a(awx.J, Math.round(var8 * 10.0F));
            }

            this.a(efh.o);
         }
      }
   }

   public boolean aa() {
      return false;
   }

   public void a(dyt $$0, boolean $$1) {
   }

   public void a(dib $$0) {
   }

   public void a(dxq $$0) {
   }

   public void a(dyy $$0) {
   }

   public void a(dyz $$0) {
   }

   public void a(dza $$0) {
   }

   public void a(dyj $$0) {
   }

   public void a(clh $$0, btw $$1) {
   }

   public OptionalInt a(@Nullable buf $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dhz $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(czd $$0, buc $$1) {
   }

   public bud a(bwf $$0, buc $$1) {
      if (this.V_()) {
         if ($$0 instanceof buf) {
            this.a((buf)$$0);
         }

         return bud.e;
      } else {
         czd $$2 = this.b($$1);
         czd $$3 = $$2.v();
         bud $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.fV() && $$2 == this.b($$1) && $$2.M() < $$3.M()) {
               $$2.e($$3.M());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof bxe) {
               if (this.fV()) {
                  $$2 = $$3;
               }

               bud $$5 = $$2.a(this, (bxe)$$0, $$1);
               if ($$5.a()) {
                  this.dV().a(efh.r, $$0.dt(), efh.a.a(this));
                  if ($$2.f() && !this.fV()) {
                     this.a($$1, czd.k);
                  }

                  return $$5;
               }
            }

            return bud.e;
         }
      }
   }

   @Override
   public void ae() {
      super.ae();
      this.J = 0;
   }

   @Override
   protected boolean fg() {
      return super.fg() || this.fR();
   }

   @Override
   public boolean em() {
      return !this.i.b;
   }

   @Override
   protected feq a(feq $$0, bxi $$1) {
      float $$2 = this.dP();
      if (!this.i.b && !($$0.e > 0.0) && ($$1 == bxi.a || $$1 == bxi.b) && this.ga() && this.I($$2)) {
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

         return new feq($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean I(float $$0) {
      return this.aJ() || this.Z < (double)$$0 && !this.q(0.0, 0.0, (double)$$0 - this.Z);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      fel $$3 = this.cR();
      return this.dV().a(this, new fel($$3.a + 1.0E-7 + $$0, $$3.b - $$2 - 1.0E-7, $$3.c + 1.0E-7 + $$1, $$3.d - 1.0E-7 + $$0, $$3.b, $$3.f - 1.0E-7 + $$1));
   }

   public void e(bwf $$0) {
      if ($$0.cB()) {
         if (!$$0.v(this)) {
            float $$1 = this.fv() ? this.bq : (float)this.h(byk.c);
            czd $$2 = this.dZ();
            buu $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.dW().a(this));
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.H(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gE();
            if ($$0.aq().a(axf.H) && $$0 instanceof crx $$6 && $$6.a(cry.c, this, this, true)) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.uR, this.dm());
               return;
            }

            if ($$1 > 0.0F || $$4 > 0.0F) {
               boolean $$7 = $$5 > 0.9F;
               boolean $$8;
               if (this.cj() && $$7) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.uQ, this.dm(), 1.0F, 1.0F);
                  $$8 = true;
               } else {
                  $$8 = false;
               }

               $$1 += $$2.h().a($$0, $$1, $$3);
               boolean $$10 = $$7 && this.Z > 0.0 && !this.aJ() && !this.d_() && !this.bj() && !this.b(bvl.o) && !this.bZ() && $$0 instanceof bxe && !this.cj();
               if ($$10) {
                  $$1 *= 1.5F;
               }

               float $$11 = $$1 + $$4;
               boolean $$12 = false;
               if ($$7 && !$$10 && !$$8 && this.aJ()) {
                  double $$13 = this.ah().j();
                  double $$14 = (double)this.fo() * 2.5;
                  if ($$13 < azm.k($$14) && this.b(buc.a).a(axk.bH)) {
                     $$12 = true;
                  }
               }

               float $$15 = 0.0F;
               if ($$0 instanceof bxe $$16) {
                  $$15 = $$16.eG();
               }

               feq $$17 = $$0.dy();
               boolean $$18 = $$0.b($$3, $$11);
               if ($$18) {
                  float $$19 = this.b($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                  if ($$19 > 0.0F) {
                     if ($$0 instanceof bxe $$20) {
                        $$20.p(
                           (double)($$19 * 0.5F), (double)azm.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azm.b(this.dL() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.i(
                           (double)(-azm.a(this.dL() * (float) (Math.PI / 180.0)) * $$19 * 0.5F),
                           0.1,
                           (double)(azm.b(this.dL() * (float) (Math.PI / 180.0)) * $$19 * 0.5F)
                        );
                     }

                     this.i(this.dy().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$12) {
                     float $$21 = 1.0F + (float)this.h(byk.D) * $$1;

                     for (bxe $$23 : this.dV().a(bxe.class, $$0.cR().c(1.0, 0.25, 1.0))) {
                        if ($$23 != this && $$23 != $$0 && !this.s($$23)) {
                           if ($$23 instanceof cmw) {
                              cmw $$24 = (cmw)$$23;
                              if ($$24.t()) {
                                 continue;
                              }
                           }

                           if (this.g($$23) < 9.0) {
                              float $$25 = this.a($$23, $$21, $$3) * $$5;
                              dja var22 = this.dV();
                              if (var22 instanceof arq) {
                                 arq $$26 = (arq)var22;
                                 if ($$23.a($$26, $$3, $$25)) {
                                    $$23.p(0.4F, (double)azm.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azm.b(this.dL() * (float) (Math.PI / 180.0))));
                                    dfs.a($$26, (bwf)$$23, $$3);
                                 }
                              }
                           }
                        }
                     }

                     this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.uT, this.dm(), 1.0F, 1.0F);
                     this.gf();
                  }

                  if ($$0 instanceof arr && $$0.T) {
                     ((arr)$$0).f.b(new aff($$0));
                     $$0.T = false;
                     $$0.i($$17);
                  }

                  if ($$10) {
                     this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.uP, this.dm(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$10 && !$$12) {
                     if ($$7) {
                        this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.uS, this.dm(), 1.0F, 1.0F);
                     } else {
                        this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.uU, this.dm(), 1.0F, 1.0F);
                     }
                  }

                  if ($$4 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  bwf $$27 = $$0;
                  if ($$0 instanceof clx) {
                     $$27 = ((clx)$$0).a;
                  }

                  boolean $$28 = false;
                  if (this.dV() instanceof arq $$29) {
                     if ($$27 instanceof bxe $$30) {
                        $$28 = $$2.a($$30, this);
                     }

                     dfs.a($$29, $$0, $$3);
                  }

                  if (!this.dV().C && !$$2.f() && $$27 instanceof bxe) {
                     if ($$28) {
                        $$2.b((bxe)$$27, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.fb()) {
                           this.a(buc.a, czd.k);
                        } else {
                           this.a(buc.b, czd.k);
                        }
                     }
                  }

                  if ($$0 instanceof bxe) {
                     float $$31 = $$15 - ((bxe)$$0).eG();
                     this.a(awx.G, Math.round($$31 * 10.0F));
                     if (this.dV() instanceof arq && $$31 > 2.0F) {
                        int $$32 = (int)((double)$$31 * 0.5);
                        ((arq)this.dV()).a(lx.g, $$0.dA(), $$0.e(0.5), $$0.dG(), $$32, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.G(0.1F);
               } else {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.uR, this.dm(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(bwf $$0, float $$1, buu $$2) {
      return $$1;
   }

   @Override
   protected void f(bxe $$0) {
      this.e($$0);
   }

   public void b(bwf $$0) {
   }

   @Override
   public void c(bwf $$0) {
   }

   public void gf() {
      double $$0 = (double)(-azm.a(this.dL() * (float) (Math.PI / 180.0)));
      double $$1 = (double)azm.b(this.dL() * (float) (Math.PI / 180.0));
      if (this.dV() instanceof arq) {
         ((arq)this.dV()).a(lx.am, this.dA() + $$0, this.e(0.5), this.dG() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void gg() {
   }

   @Override
   public void a(bwf.e $$0) {
      super.a($$0);
      this.bQ.a(this);
      if (this.bR != null && this.gm()) {
         this.q();
      }
   }

   @Override
   public boolean L_() {
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
      return this.k;
   }

   public crb gj() {
      return this.f;
   }

   public cqy gk() {
      return this.i;
   }

   @Override
   public boolean fV() {
      return this.i.d;
   }

   public boolean gl() {
      return this.i.d;
   }

   public void a(czd $$0, czd $$1, cvf $$2) {
   }

   public boolean gm() {
      return this.bR != this.bQ;
   }

   public boolean gn() {
      return true;
   }

   public Either<crc.a, bau> a(iu $$0) {
      this.b($$0);
      this.h = 0;
      return Either.right(bau.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fS();
      if (this.dV() instanceof arq && $$1) {
         ((arq)this.dV()).f();
      }

      this.h = $$0 ? 0 : 100;
   }

   @Override
   public void fS() {
      this.a(true, true);
   }

   public boolean go() {
      return this.fR() && this.h >= 100;
   }

   public int gp() {
      return this.h;
   }

   public void a(wy $$0, boolean $$1) {
   }

   public void a(alg $$0) {
      this.b(awx.i.b($$0));
   }

   public void a(alg $$0, int $$1) {
      this.a(awx.i.b($$0), $$1);
   }

   public void b(awu<?> $$0) {
      this.a($$0, 1);
   }

   public void a(awu<?> $$0, int $$1) {
   }

   public void a(awu<?> $$0) {
   }

   public int a(Collection<ddz<?>> $$0) {
      return 0;
   }

   public void a(ddz<?> $$0, List<czd> $$1) {
   }

   public void b(List<alf<ddu<?>>> $$0) {
   }

   public int b(Collection<ddz<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(feq $$0) {
      if (this.bZ()) {
         super.a_($$0);
      } else {
         if (this.ck()) {
            double $$1 = this.bT().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bf || !this.dV().b_(iu.a(this.dA(), this.dC() + 1.0 - 0.1, this.dG())).c()) {
               feq $$3 = this.dy();
               this.i($$3.b(0.0, ($$1 - $$3.e) * $$2, 0.0));
            }
         }

         if (this.gk().b) {
            double $$4 = this.dy().e;
            super.a_($$0);
            this.i(this.dy().a(ja.a.b, $$4 * 0.6));
         } else {
            super.a_($$0);
         }
      }
   }

   @Override
   protected boolean ft() {
      return !this.i.b && super.ft();
   }

   @Override
   public void bo() {
      if (this.i.b) {
         this.i(false);
      } else {
         super.bo();
      }
   }

   protected boolean h(iu $$0) {
      return !this.dV().a_($$0).j(this.dV(), $$0);
   }

   @Override
   public float fo() {
      return (float)this.h(byk.v);
   }

   @Override
   public boolean a(double $$0, float $$1, buu $$2) {
      if (this.i.c) {
         return false;
      } else {
         if ($$0 >= 2.0) {
            this.a(awx.t, (int)Math.round($$0 * 100.0));
         }

         boolean $$3 = this.cm != null && this.cu;
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
      if (!this.fJ() && this.ft() && !this.bj()) {
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
   protected void br() {
      if (!this.V_()) {
         super.br();
      }
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      if (this.bj()) {
         this.aY();
         this.b($$1);
      } else {
         iu $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            eah $$3 = this.dV().a_($$2);
            if ($$3.a(axc.br)) {
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
   public bxe.a eO() {
      return new bxe.a(awn.vf, awn.uV);
   }

   @Override
   public boolean a(arq $$0, bxe $$1) {
      this.b(awx.g.b($$1.aq()));
      return true;
   }

   @Override
   public void a(eah $$0, feq $$1) {
      if (!this.i.b) {
         super.a($$0, $$1);
      }

      this.gO();
   }

   public void d(int $$0) {
      this.r($$0);
      this.ch = this.ch + (float)$$0 / (float)this.gt();
      this.cg = azm.a(this.cg + $$0, 0, Integer.MAX_VALUE);

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

   public void a(czd $$0, int $$1) {
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

      if ($$0 > 0 && this.cf % 5 == 0 && (float)this.j < (float)this.af - 100.0F) {
         float $$1 = this.cf > 30 ? 1.0F : (float)this.cf / 30.0F;
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.ve, this.dm(), $$1 * 0.75F, 1.0F);
         this.j = this.af;
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
      if (!this.i.a) {
         if (!this.dV().C) {
            this.bS.a($$0);
         }
      }
   }

   public Optional<cqh> ac() {
      return Optional.empty();
   }

   public cur gu() {
      return this.bS;
   }

   public boolean t(boolean $$0) {
      return this.i.a || $$0 || this.bS.b();
   }

   public boolean gv() {
      return this.eG() > 0.0F && this.eG() < this.eU();
   }

   public boolean gw() {
      return this.i.e;
   }

   public boolean a(iu $$0, ja $$1, czd $$2) {
      if (this.i.e) {
         return true;
      } else {
         iu $$3 = $$0.a($$1.g());
         eal $$4 = new eal(this.dV(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int e(arq $$0) {
      return !$$0.O().c(diw.e) && !this.V_() ? Math.min(this.cf * 7, 100) : 0;
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
   protected bwf.d bg() {
      return this.i.b || this.aJ() && this.cg() ? bwf.d.a : bwf.d.d;
   }

   public void x() {
   }

   @Override
   public wy al() {
      return wy.b(this.k.getName());
   }

   public cwj gx() {
      return this.bP;
   }

   @Override
   protected boolean b(bwp $$0) {
      return $$0.a() == bwp.a.b;
   }

   public boolean h(czd $$0) {
      return this.f.g($$0);
   }

   public boolean h(tz $$0) {
      if (this.bZ() || !this.aJ() || this.bj() || this.av) {
         return false;
      } else if (this.gB().g()) {
         this.i($$0);
         this.e = this.dV().ae();
         return true;
      } else if (this.gC().g()) {
         this.j($$0);
         this.e = this.dV().ae();
         return true;
      } else {
         return false;
      }
   }

   protected void gy() {
      if (this.e + 20L < this.dV().ae()) {
         this.k(this.gB());
         this.i(new tz());
         this.k(this.gC());
         this.j(new tz());
      }
   }

   private void k(tz $$0) {
      if (!this.dV().C && !$$0.g()) {
         bwo.a($$0, this.dV(), bwn.r).ifPresent($$0x -> {
            if ($$0x instanceof bya $$1) {
               $$1.i(this);
            }

            $$0x.a_(this.dA(), this.dC() + 0.7F, this.dG());
            ((arq)this.dV()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean V_();

   @Override
   public boolean bF() {
      return !this.V_() && super.bF();
   }

   @Override
   public boolean ck() {
      return !this.i.b && !this.V_() && super.ck();
   }

   public abstract boolean b();

   @Override
   public boolean cJ() {
      return !this.i.b;
   }

   public ffv gz() {
      return this.dV().R();
   }

   @Override
   public wy m_() {
      xm $$0 = ffq.a(this.cr(), this.al());
      return this.a($$0);
   }

   private xm a(xm $$0) {
      String $$1 = this.gi().getName();
      return $$0.a($$1x -> $$1x.a(new ww.g("/tell " + $$1 + " ")).a(this.cQ()).a($$1));
   }

   @Override
   public String cI() {
      return this.gi().getName();
   }

   @Override
   protected void F(float $$0) {
      this.au().a(c, $$0);
   }

   @Override
   public float fw() {
      return this.au().a(c);
   }

   public boolean a(cre $$0) {
      return (this.au().a(bK) & $$0.a()) == $$0.a();
   }

   @Override
   public bxv a_(int $$0) {
      if ($$0 == 499) {
         return new bxv() {
            @Override
            public czd a() {
               return crc.this.bR.g();
            }

            @Override
            public boolean a(czd $$0) {
               crc.this.bR.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bxv() {
               @Override
               public czd a() {
                  return crc.this.bQ.r().a($$1);
               }

               @Override
               public boolean a(czd $$0) {
                  crc.this.bQ.r().a($$1, $$0);
                  crc.this.bQ.a(crc.this.f);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.f.i().size()) {
            return bxv.a(this.f, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.bP.b() ? bxv.a(this.bP, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gA() {
      return this.cq;
   }

   public void u(boolean $$0) {
      this.cq = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.i.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bwx fy() {
      return this.al.a(bL) == 0 ? bwx.a : bwx.b;
   }

   public void b(bwx $$0) {
      this.al.a(bL, (byte)($$0 == bwx.a ? 0 : 1));
   }

   public tz gB() {
      return this.al.a(bM);
   }

   protected void i(tz $$0) {
      this.al.a(bM, $$0);
   }

   public tz gC() {
      return this.al.a(bN);
   }

   protected void j(tz $$0) {
      this.al.a(bN, $$0);
   }

   public float gD() {
      return (float)(1.0 / this.h(byk.e) * 20.0);
   }

   public float H(float $$0) {
      return azm.a(((float)this.aS + $$0) / this.gD(), 0.0F, 1.0F);
   }

   public void gE() {
      this.aS = 0;
   }

   public cza gF() {
      return this.cs;
   }

   @Override
   protected float aT() {
      return !this.i.b && !this.fJ() ? super.aT() : 1.0F;
   }

   @Override
   public float eh() {
      return (float)this.h(byk.q);
   }

   public boolean gG() {
      return this.i.d && this.G() >= 2;
   }

   public int G() {
      return 0;
   }

   public boolean s(int $$0) {
      return this.G() >= $$0;
   }

   @Override
   public bwi e(bxq $$0) {
      return b.getOrDefault($$0, bJ);
   }

   @Override
   public ImmutableList<bxq> fO() {
      return ImmutableList.of(bxq.a, bxq.f, bxq.d);
   }

   @Override
   public czd d(czd $$0) {
      if (!($$0.h() instanceof czy)) {
         return czd.k;
      } else {
         Predicate<czd> $$1 = ((czy)$$0.h()).c();
         czd $$2 = czy.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((czy)$$0.h()).a();

            for (int $$3 = 0; $$3 < this.f.b(); $$3++) {
               czd $$4 = this.f.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.fV() ? new czd(czh.pk) : czd.k;
         }
      }
   }

   @Override
   public feq v(float $$0) {
      double $$1 = 0.22 * (this.fy() == bwx.b ? -1.0 : 1.0);
      float $$2 = azm.h($$0 * 0.5F, this.dN(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = azm.h($$0, this.aW, this.aV) * (float) (Math.PI / 180.0);
      if (this.fJ() || this.fv()) {
         feq $$4 = this.h($$0);
         feq $$5 = this.dy();
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

         return this.p($$0).e(new feq($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cl()) {
         return this.p($$0).e(new feq($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cR().c() - 1.0;
         double $$13 = this.ci() ? -0.2 : 0.07;
         return this.p($$0).e(new feq($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dU() {
      return true;
   }

   public boolean gH() {
      return this.fz() && this.fB().a(czh.sf);
   }

   @Override
   public boolean dT() {
      return false;
   }

   public Optional<jd> gI() {
      return this.ct;
   }

   public void c(Optional<jd> $$0) {
      this.ct = $$0;
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
      if (this.i.b && !this.bZ()) {
         return this.cj() ? this.i.a() * 2.0F : this.i.a();
      } else {
         return this.cj() ? 0.025999999F : 0.02F;
      }
   }

   public boolean gJ() {
      return this.g || this.bU <= 0;
   }

   public void gK() {
      if (!this.g) {
         this.bU--;
      }
   }

   public void v(boolean $$0) {
      this.g = $$0;
      if (!this.g) {
         this.bU = 60;
      }
   }

   public double gL() {
      return this.h(byk.g);
   }

   public double gM() {
      return this.h(byk.j);
   }

   public boolean b(bwf $$0, double $$1) {
      return $$0.dQ() ? false : this.a($$0.cR(), $$1);
   }

   public boolean a(fel $$0, double $$1) {
      double $$2 = this.gM() + $$1;
      return $$0.e(this.bE()) < $$2 * $$2;
   }

   public boolean a(iu $$0, double $$1) {
      double $$2 = this.gL() + $$1;
      return new fel($$0).e(this.bE()) < $$2 * $$2;
   }

   public void w(boolean $$0) {
      this.cu = $$0;
      if ($$0) {
         this.cv = 40;
      } else {
         this.cv = 0;
      }
   }

   public boolean gN() {
      return this.cu;
   }

   public void gO() {
      if (this.cv == 0) {
         this.gP();
      }
   }

   public void gP() {
      this.cv = 0;
      this.cn = null;
      this.cm = null;
      this.cu = false;
   }

   public boolean gQ() {
      return false;
   }

   @Override
   public boolean d_() {
      return this.i.b ? false : super.d_();
   }

   public static enum a {
      a,
      b(wy.c("block.minecraft.bed.no_sleep")),
      c(wy.c("block.minecraft.bed.too_far_away")),
      d(wy.c("block.minecraft.bed.obstructed")),
      e,
      f(wy.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final wy g;

      private a() {
         this.g = null;
      }

      private a(final wy $$0) {
         this.g = $$0;
      }

      @Nullable
      public wy a() {
         return this.g;
      }
   }
}
