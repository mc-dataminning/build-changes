import com.google.common.base.MoreObjects;
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

public abstract class csi extends byf {
   public static final bxw bu = bxw.b;
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
   public static final fgc bI = new fgc(0.0, 0.6, 0.0);
   public static final bxh bJ = bxh.b(0.6F, 1.8F).b(1.62F).a(bxg.a().a(bxf.b, bI));
   private static final Map<byr, bxh> b = ImmutableMap.builder()
      .put(byr.a, bJ)
      .put(byr.c, aD)
      .put(byr.b, bxh.b(0.6F, 0.6F).b(0.4F))
      .put(byr.d, bxh.b(0.6F, 0.6F).b(0.4F))
      .put(byr.e, bxh.b(0.6F, 0.6F).b(0.4F))
      .put(byr.f, bxh.b(0.6F, 1.5F).b(1.27F).a(bxg.a().a(bxf.b, bI)))
      .put(byr.h, bxh.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final aku<Float> c = aky.a(csi.class, akw.d);
   private static final aku<Integer> d = aky.a(csi.class, akw.b);
   protected static final aku<Byte> bK = aky.a(csi.class, akw.a);
   protected static final aku<Byte> bL = aky.a(csi.class, akw.a);
   protected static final aku<ua> bM = aky.a(csi.class, akw.t);
   protected static final aku<ua> bN = aky.a(csi.class, akw.t);
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
   final csh ct;
   protected cxp bP = new cxp();
   public final cxe bQ;
   public cwb bR;
   protected cvx bS = new cvx();
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
   private final cse cw = new cse();
   public int cf = 0;
   public int cg = 0;
   public float ch = 0.0F;
   protected int ci = 0;
   protected final float cj = 0.02F;
   private int cx;
   private final GameProfile cy;
   private boolean cz;
   private dak cA = dak.l;
   private final dah cB = this.f();
   private Optional<jf> cC = Optional.empty();
   @Nullable
   public csz ck;
   protected float cl;
   @Nullable
   public fgc cm;
   @Nullable
   public bxe cn;
   private boolean cD = false;
   private int cE = 0;

   public csi(dkj $$0, iw $$1, float $$2, GameProfile $$3) {
      super(bxn.bT, $$0);
      this.a_($$3.getId());
      this.cy = $$3;
      this.ct = new csh(this, this.bt);
      this.bQ = new cxe(this.ct, !$$0.C, this);
      this.bR = this.bQ;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
   }

   @Override
   protected bxi eb() {
      return new csj(this);
   }

   public boolean a(dkj $$0, iw $$1, dkg $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dkg.d) {
         return true;
      } else if (this.gw()) {
         return false;
      } else {
         dak $$3 = this.fb();
         return $$3.f() || !$$3.b(new ebu($$0, $$1, false));
      }
   }

   public static bzk.a fX() {
      return byf.ee().a(bzl.c, 1.0).a(bzl.v, 0.1F).a(bzl.e).a(bzl.q).a(bzl.g, 4.5).a(bzl.j, 3.0).a(bzl.f).a(bzl.C).a(bzl.z).a(bzl.t).a(bzl.D);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(c, 0.0F);
      $$0.a(d, 0);
      $$0.a(bK, (byte)0);
      $$0.a(bL, (byte)bu.b());
      $$0.a(bM, new ua());
      $$0.a(bN, new ua());
   }

   @Override
   public void g() {
      this.ad = this.ak();
      if (this.ak() || this.bY()) {
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
      super.g();
      if (!this.dV().C && this.bR != null && !this.bR.b(this)) {
         this.o();
         this.bR = this.bQ;
      }

      this.s();
      if (this instanceof asc $$0) {
         this.bS.a($$0);
         this.a(axi.k);
         this.a(axi.l);
         if (this.bJ()) {
            this.a(axi.m);
         }

         if (this.cf()) {
            this.a(axi.o);
         }

         if (!this.fR()) {
            this.a(axi.n);
         }
      }

      int $$1 = 29999999;
      double $$2 = azz.a(this.dA(), -2.9999999E7, 2.9999999E7);
      double $$3 = azz.a(this.dG(), -2.9999999E7, 2.9999999E7);
      if ($$2 != this.dA() || $$3 != this.dG()) {
         this.a_($$2, this.dC(), $$3);
      }

      this.aS++;
      dak $$4 = this.fb();
      if (!dak.a(this.cA, $$4)) {
         if (!dak.b(this.cA, $$4)) {
            this.gF();
         }

         this.cA = $$4.v();
      }

      if (!this.a(axs.a) && this.c(dao.pc)) {
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
      this.ce = this.a(axs.a);
      return this.ce;
   }

   @Override
   public void a(boolean $$0, iw $$1) {
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
      this.a(new bwi(bwk.m, 200, 0, false, false, true));
   }

   private boolean c(dag $$0) {
      for (bxo $$1 : bxo.j) {
         dak $$2 = this.a($$1);
         dit $$3 = $$2.a(kl.D);
         if ($$2.a($$0) && $$3 != null && $$3.b() == $$1) {
            return true;
         }
      }

      return false;
   }

   protected dah f() {
      return new dah();
   }

   private void s() {
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
      if (this.h(byr.d)) {
         byr $$0 = this.u();
         byr $$1;
         if (this.ak() || this.bY() || this.h($$0)) {
            $$1 = $$0;
         } else if (this.h(byr.f)) {
            $$1 = byr.f;
         } else {
            $$1 = byr.d;
         }

         this.b($$1);
      }
   }

   private byr u() {
      if (this.fR()) {
         return byr.c;
      } else if (this.cj()) {
         return byr.d;
      } else if (this.fJ()) {
         return byr.b;
      } else if (this.fv()) {
         return byr.e;
      } else {
         return this.cc() && !this.cw.b ? byr.f : byr.a;
      }
   }

   protected boolean h(byr $$0) {
      return this.dV().a(this, this.a($$0).a(this.dt()).h(1.0E-7));
   }

   @Override
   protected awx aU() {
      return awy.vi;
   }

   @Override
   protected awx aV() {
      return awy.vg;
   }

   @Override
   protected awx aW() {
      return awy.vh;
   }

   @Override
   public int bW() {
      return 10;
   }

   @Override
   public void a(awx $$0, float $$1, float $$2) {
      this.dV().a(this, this.dA(), this.dC(), this.dG(), $$0, this.dm(), $$1, $$2);
   }

   public void a(awx $$0, awz $$1, float $$2, float $$3) {
   }

   @Override
   public awz dm() {
      return awz.h;
   }

   @Override
   protected int dn() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.v();
      } else if ($$0 == 23) {
         this.cz = false;
      } else if ($$0 == 22) {
         this.cz = true;
      } else {
         super.b($$0);
      }
   }

   protected void o() {
      this.bR = this.bQ;
   }

   protected void p() {
   }

   @Override
   public void q() {
      if (!this.dV().C && this.fZ() && this.bY()) {
         this.bO();
         this.g(false);
      } else {
         super.q();
         this.bV = this.bW;
         this.bW = 0.0F;
      }
   }

   @Override
   public void d_() {
      if (this.bT > 0) {
         this.bT--;
      }

      this.i();
      this.ct.l();
      this.bV = this.bW;
      if (this.cw.b && !this.bY()) {
         this.j();
      }

      super.d_();
      this.eZ();
      this.aX = this.dL();
      this.B((float)this.h(bzl.v));
      float $$1;
      if (this.aH() && !this.eH() && !this.cj()) {
         $$1 = Math.min(0.1F, (float)this.dy().i());
      } else {
         $$1 = 0.0F;
      }

      this.bW = this.bW + ($$1 - this.bW) * 0.4F;
      if (this.eG() > 0.0F && !this.ak()) {
         ffx $$2;
         if (this.bY() && !this.dk().dQ()) {
            $$2 = this.cR().b(this.dk().cR()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cR().c(1.0, 0.5, 1.0);
         }

         List<bxe> $$4 = this.dV().a_(this, $$2);
         List<bxe> $$5 = Lists.newArrayList();

         for (bxe $$6 : $$4) {
            if ($$6.an() == bxn.W) {
               $$5.add($$6);
            } else if (!$$6.dQ()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ag.a($$5, this.ae));
         }
      }

      this.c(this.gC());
      this.c(this.gD());
      if (!this.dV().C && (this.Z > 0.5 || this.bi()) || this.cw.b || this.fR() || this.av) {
         this.gy();
      }
   }

   protected void i() {
   }

   private void c(ua $$0) {
      if (!$$0.j() && !$$0.b("Silent", false)) {
         if (this.dV().A.a(200) == 0) {
            bxn<?> $$1 = $$0.<bxn<?>>a("id", bxn.a).orElse(null);
            if ($$1 == bxn.aP && !ckp.a(this.dV(), this)) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), ckp.a(this.dV(), this.dV().A), this.dm(), 1.0F, ckp.a(this.dV().A));
            }
         }
      }
   }

   private void d(bxe $$0) {
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

   public void a(int $$0, float $$1, dak $$2) {
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
   public dak dZ() {
      return this.fv() && this.br != null ? this.br : super.dZ();
   }

   @Override
   public void a(bvt $$0) {
      super.a($$0);
      this.av();
      if (!this.ak() && this.dV() instanceof asb $$1) {
         this.b($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-azz.b((this.eM() + this.dL()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-azz.a((this.eM() + this.dL()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(axi.N);
      this.a(axi.i.b(axi.m));
      this.a(axi.i.b(axi.n));
      this.aF();
      this.c(false);
      this.a(Optional.of(jf.a(this.dV().aj(), this.dv())));
   }

   @Override
   protected void f(asb $$0) {
      super.f($$0);
      if (!$$0.O().c(dkf.e)) {
         this.ge();
         this.ct.m();
      }
   }

   protected void ge() {
      for (int $$0 = 0; $$0 < this.ct.b(); $$0++) {
         dak $$1 = this.ct.a($$0);
         if (!$$1.f() && dgz.a($$1, dgy.D)) {
            this.ct.b($$0);
         }
      }
   }

   @Override
   protected awx e(bvt $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected awx j_() {
      return awy.uY;
   }

   @Override
   public void g(dak $$0) {
   }

   @Nullable
   public coo a(dak $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   public float c(ebq $$0) {
      float $$1 = this.ct.g().a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(bzl.t);
      }

      if (bwj.a(this)) {
         $$1 *= 1.0F + (float)(bwj.b(this) + 1) * 0.2F;
      }

      if (this.b(bwk.d)) {
         float $$2 = switch (this.c(bwk.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.h(bzl.f);
      if (this.a(axs.a)) {
         $$1 *= (float)this.g(bzl.C).g();
      }

      if (!this.aH()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(ebq $$0) {
      return !$$0.C() || this.ct.g().b($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a_(this.cy.getId());
      ug $$1 = $$0.p("Inventory");
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
      this.g(bzl.v).a((double)this.cw.b());
      $$0.o("EnderItems").ifPresent($$0x -> this.bP.a($$0x, this.dX()));
      this.k($$0.n("ShoulderEntityLeft"));
      this.l($$0.n("ShoulderEntityRight"));
      this.a($$0.a("LastDeathLocation", jf.b));
      this.cm = $$0.<fgc>a("current_explosion_impact_pos", fgc.a).orElse(null);
      this.cD = $$0.b("ignore_fall_damage_from_current_explosion", false);
      this.cE = $$0.b("current_impulse_context_reset_grace_time", 0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      up.e($$0);
      $$0.a("Inventory", this.ct.a(new ug()));
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
      if (!this.gC().j()) {
         $$0.a("ShoulderEntityLeft", this.gC());
      }

      if (!this.gD().j()) {
         $$0.a("ShoulderEntityRight", this.gD());
      }

      this.cC.ifPresent($$1 -> $$0.a("LastDeathLocation", jf.b, $$1));
      $$0.b("current_explosion_impact_pos", fgc.a, this.cm);
      $$0.a("ignore_fall_damage_from_current_explosion", this.cD);
      $$0.a("current_impulse_context_reset_grace_time", this.cE);
   }

   @Override
   public boolean a(asb $$0, bvt $$1) {
      if (super.a($$0, $$1)) {
         return true;
      } else if ($$1.a(axo.n)) {
         return !$$0.O().c(dkf.I);
      } else if ($$1.a(axo.m)) {
         return !$$0.O().c(dkf.J);
      } else if ($$1.a(axo.i)) {
         return !$$0.O().c(dkf.K);
      } else {
         return $$1.a(axo.o) ? !$$0.O().c(dkf.L) : false;
      }
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.cw.a && !$$1.a(axo.d)) {
         return false;
      } else {
         this.bd = 0;
         if (this.eH()) {
            return false;
         } else {
            this.gy();
            if ($$1.g()) {
               if ($$0.an() == buz.a) {
                  $$2 = 0.0F;
               }

               if ($$0.an() == buz.b) {
                  $$2 = Math.min($$2 / 2.0F + 1.0F, $$2);
               }

               if ($$0.an() == buz.d) {
                  $$2 = $$2 * 3.0F / 2.0F;
               }
            }

            return $$2 == 0.0F ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void b(asb $$0, byf $$1) {
      super.b($$0, $$1);
      dak $$2 = this.fH();
      dcl $$3 = $$2 != null ? $$2.a(kl.I) : null;
      float $$4 = $$1.fU();
      if ($$4 > 0.0F && $$3 != null) {
         $$3.a($$0, this, $$4, $$2);
      }
   }

   @Override
   public boolean ez() {
      return !this.gk().a && super.ez();
   }

   public boolean a(csi $$0) {
      fhj $$1 = this.cq();
      fhj $$2 = $$0.cq();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.i();
      }
   }

   @Override
   protected void c(bvt $$0, float $$1) {
      this.a($$0, $$1, new bxo[]{bxo.c, bxo.d, bxo.e, bxo.f});
   }

   @Override
   protected void d(bvt $$0, float $$1) {
      this.a($$0, $$1, new bxo[]{bxo.f});
   }

   @Override
   protected void c(asb $$0, bvt $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var8 = Math.max($$2 - this.fw(), 0.0F);
         this.E(this.fw() - ($$2 - var8));
         float $$4 = $$2 - var8;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
            this.a(axi.L, Math.round($$4 * 10.0F));
         }

         if (var8 != 0.0F) {
            this.G($$1.a());
            this.eS().a($$1, var8);
            this.d(this.eG() - var8);
            if (var8 < 3.4028235E37F) {
               this.a(axi.J, Math.round(var8 * 10.0F));
            }

            this.a(egq.o);
         }
      }
   }

   public boolean W() {
      return false;
   }

   public void a(eac $$0, boolean $$1) {
   }

   public void a(dji $$0) {
   }

   public void a(dyz $$0) {
   }

   public void a(eah $$0) {
   }

   public void a(eai $$0) {
   }

   public void a(eaj $$0) {
   }

   public void a(dzs $$0) {
   }

   public void a(cme $$0, buv $$1) {
   }

   public OptionalInt a(@Nullable bve $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, djg $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(dak $$0, bvb $$1) {
   }

   public bvc a(bxe $$0, bvb $$1) {
      if (this.ak()) {
         if ($$0 instanceof bve) {
            this.a((bve)$$0);
         }

         return bvc.e;
      } else {
         dak $$2 = this.b($$1);
         dak $$3 = $$2.v();
         bvc $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.fV() && $$2 == this.b($$1) && $$2.M() < $$3.M()) {
               $$2.e($$3.M());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof byf) {
               if (this.fV()) {
                  $$2 = $$3;
               }

               bvc $$5 = $$2.a(this, (byf)$$0, $$1);
               if ($$5.a()) {
                  this.dV().a(egq.r, $$0.dt(), egq.a.a(this));
                  if ($$2.f() && !this.fV()) {
                     this.a($$1, dak.l);
                  }

                  return $$5;
               }
            }

            return bvc.e;
         }
      }
   }

   @Override
   public void aa() {
      super.aa();
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
   protected fgc a(fgc $$0, byj $$1) {
      float $$2 = this.dP();
      if (!this.cw.b && !($$0.e > 0.0) && ($$1 == byj.a || $$1 == byj.b) && this.ga() && this.I($$2)) {
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

         return new fgc($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean I(float $$0) {
      return this.aH() || this.Z < (double)$$0 && !this.q(0.0, 0.0, (double)$$0 - this.Z);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      ffx $$3 = this.cR();
      return this.dV().a(this, new ffx($$3.a + 1.0E-7 + $$0, $$3.b - $$2 - 1.0E-7, $$3.c + 1.0E-7 + $$1, $$3.d - 1.0E-7 + $$0, $$3.b, $$3.f - 1.0E-7 + $$1));
   }

   public void e(bxe $$0) {
      if ($$0.cB()) {
         if (!$$0.v(this)) {
            float $$1 = this.fv() ? this.bq : (float)this.h(bzl.c);
            dak $$2 = this.dZ();
            bvt $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.dW().a(this));
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.H(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gF();
            if ($$0.an().a(axq.H) && $$0 instanceof ctd $$6 && $$6.a(cte.c, this, this, true)) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), awy.uR, this.dm());
               return;
            }

            if ($$1 > 0.0F || $$4 > 0.0F) {
               boolean $$7 = $$5 > 0.9F;
               boolean $$8;
               if (this.ci() && $$7) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awy.uQ, this.dm(), 1.0F, 1.0F);
                  $$8 = true;
               } else {
                  $$8 = false;
               }

               $$1 += $$2.h().a($$0, $$1, $$3);
               boolean $$10 = $$7 && this.Z > 0.0 && !this.aH() && !this.k_() && !this.bi() && !this.b(bwk.o) && !this.bY() && $$0 instanceof byf && !this.ci();
               if ($$10) {
                  $$1 *= 1.5F;
               }

               float $$11 = $$1 + $$4;
               boolean $$12 = false;
               if ($$7 && !$$10 && !$$8 && this.aH()) {
                  double $$13 = this.ad().j();
                  double $$14 = (double)this.fo() * 2.5;
                  if ($$13 < azz.k($$14) && this.b(bvb.a).a(axv.bI)) {
                     $$12 = true;
                  }
               }

               float $$15 = 0.0F;
               if ($$0 instanceof byf $$16) {
                  $$15 = $$16.eG();
               }

               fgc $$17 = $$0.dy();
               boolean $$18 = $$0.b($$3, $$11);
               if ($$18) {
                  float $$19 = this.b($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                  if ($$19 > 0.0F) {
                     if ($$0 instanceof byf $$20) {
                        $$20.p(
                           (double)($$19 * 0.5F), (double)azz.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azz.b(this.dL() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.i(
                           (double)(-azz.a(this.dL() * (float) (Math.PI / 180.0)) * $$19 * 0.5F),
                           0.1,
                           (double)(azz.b(this.dL() * (float) (Math.PI / 180.0)) * $$19 * 0.5F)
                        );
                     }

                     this.i(this.dy().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$12) {
                     float $$21 = 1.0F + (float)this.h(bzl.D) * $$1;

                     for (byf $$23 : this.dV().a(byf.class, $$0.cR().c(1.0, 0.25, 1.0))) {
                        if ($$23 != this && $$23 != $$0 && !this.s($$23)) {
                           if ($$23 instanceof coc) {
                              coc $$24 = (coc)$$23;
                              if ($$24.w()) {
                                 continue;
                              }
                           }

                           if (this.g($$23) < 9.0) {
                              float $$25 = this.a($$23, $$21, $$3) * $$5;
                              dkj var22 = this.dV();
                              if (var22 instanceof asb) {
                                 asb $$26 = (asb)var22;
                                 if ($$23.a($$26, $$3, $$25)) {
                                    $$23.p(0.4F, (double)azz.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azz.b(this.dL() * (float) (Math.PI / 180.0))));
                                    dgz.a($$26, (bxe)$$23, $$3);
                                 }
                              }
                           }
                        }
                     }

                     this.dV().a(null, this.dA(), this.dC(), this.dG(), awy.uT, this.dm(), 1.0F, 1.0F);
                     this.gf();
                  }

                  if ($$0 instanceof asc && $$0.T) {
                     ((asc)$$0).f.b(new afq($$0));
                     $$0.T = false;
                     $$0.i($$17);
                  }

                  if ($$10) {
                     this.dV().a(null, this.dA(), this.dC(), this.dG(), awy.uP, this.dm(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$10 && !$$12) {
                     if ($$7) {
                        this.dV().a(null, this.dA(), this.dC(), this.dG(), awy.uS, this.dm(), 1.0F, 1.0F);
                     } else {
                        this.dV().a(null, this.dA(), this.dC(), this.dG(), awy.uU, this.dm(), 1.0F, 1.0F);
                     }
                  }

                  if ($$4 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  bxe $$27 = $$0;
                  if ($$0 instanceof cnd) {
                     $$27 = ((cnd)$$0).a;
                  }

                  boolean $$28 = false;
                  if (this.dV() instanceof asb $$29) {
                     if ($$27 instanceof byf $$30) {
                        $$28 = $$2.a($$30, this);
                     }

                     dgz.a($$29, $$0, $$3);
                  }

                  if (!this.dV().C && !$$2.f() && $$27 instanceof byf) {
                     if ($$28) {
                        $$2.b((byf)$$27, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.fb()) {
                           this.a(bvb.a, dak.l);
                        } else {
                           this.a(bvb.b, dak.l);
                        }
                     }
                  }

                  if ($$0 instanceof byf) {
                     float $$31 = $$15 - ((byf)$$0).eG();
                     this.a(axi.G, Math.round($$31 * 10.0F));
                     if (this.dV() instanceof asb && $$31 > 2.0F) {
                        int $$32 = (int)((double)$$31 * 0.5);
                        ((asb)this.dV()).a(lz.g, $$0.dA(), $$0.e(0.5), $$0.dG(), $$32, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.G(0.1F);
               } else {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awy.uR, this.dm(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(bxe $$0, float $$1, bvt $$2) {
      return $$1;
   }

   @Override
   protected void f(byf $$0) {
      this.e($$0);
   }

   public void b(bxe $$0) {
   }

   @Override
   public void c(bxe $$0) {
   }

   public void gf() {
      double $$0 = (double)(-azz.a(this.dL() * (float) (Math.PI / 180.0)));
      double $$1 = (double)azz.b(this.dL() * (float) (Math.PI / 180.0));
      if (this.dV() instanceof asb) {
         ((asb)this.dV()).a(lz.am, this.dA() + $$0, this.e(0.5), this.dG() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void gg() {
   }

   @Override
   public void a(bxe.d $$0) {
      super.a($$0);
      this.bQ.a(this);
      if (this.bR != null && this.gm()) {
         this.p();
      }
   }

   @Override
   public boolean Z_() {
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

   public csh gj() {
      return this.ct;
   }

   public cse gk() {
      return this.cw;
   }

   @Override
   public boolean fV() {
      return this.cw.d;
   }

   public boolean gl() {
      return this.cw.d;
   }

   public void a(dak $$0, dak $$1, cwl $$2) {
   }

   public boolean gm() {
      return this.bR != this.bQ;
   }

   public boolean gn() {
      return true;
   }

   public Either<csi.a, bbh> a(iw $$0) {
      this.b($$0);
      this.cv = 0;
      return Either.right(bbh.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fS();
      if (this.dV() instanceof asb && $$1) {
         ((asb)this.dV()).f();
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

   public void a(xg $$0, boolean $$1) {
   }

   public void a(alr $$0) {
      this.b(axi.i.b($$0));
   }

   public void a(alr $$0, int $$1) {
      this.a(axi.i.b($$0), $$1);
   }

   public void b(axf<?> $$0) {
      this.a($$0, 1);
   }

   public void a(axf<?> $$0, int $$1) {
   }

   public void a(axf<?> $$0) {
   }

   public int a(Collection<dfg<?>> $$0) {
      return 0;
   }

   public void a(dfg<?> $$0, List<dak> $$1) {
   }

   @Override
   public void b(List<alq<dfb<?>>> $$0) {
   }

   public int b(Collection<dfg<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(fgc $$0) {
      if (this.bY()) {
         super.a_($$0);
      } else {
         if (this.cj()) {
            double $$1 = this.bS().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bf || !this.dV().b_(iw.a(this.dA(), this.dC() + 1.0 - 0.1, this.dG())).c()) {
               fgc $$3 = this.dy();
               this.i($$3.b(0.0, ($$1 - $$3.e) * $$2, 0.0));
            }
         }

         if (this.gk().b) {
            double $$4 = this.dy().e;
            super.a_($$0);
            this.i(this.dy().a(jc.a.b, $$4 * 0.6));
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

   protected boolean h(iw $$0) {
      return !this.dV().a_($$0).j(this.dV(), $$0);
   }

   @Override
   public float fo() {
      return (float)this.h(bzl.v);
   }

   @Override
   public boolean a(double $$0, float $$1, bvt $$2) {
      if (this.cw.c) {
         return false;
      } else {
         if ($$0 >= 2.0) {
            this.a(axi.t, (int)Math.round($$0 * 100.0));
         }

         boolean $$3 = this.cm != null && this.cD;
         double $$4;
         if ($$3) {
            $$4 = Math.min($$0, this.cm.e - this.dC());
            boolean $$5 = $$4 <= 0.0;
            if ($$5) {
               this.gQ();
            } else {
               this.gP();
            }
         } else {
            $$4 = $$0;
         }

         if ($$4 > 0.0 && super.a($$4, $$1, $$2)) {
            this.gQ();
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
      if (!this.ak()) {
         super.bq();
      }
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      if (this.bi()) {
         this.aX();
         this.b($$1);
      } else {
         iw $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            ebq $$3 = this.dV().a_($$2);
            if ($$3.a(axn.br)) {
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
   public byf.a eO() {
      return new byf.a(awy.vf, awy.uV);
   }

   @Override
   public boolean a(asb $$0, byf $$1) {
      this.b(axi.g.b($$1.an()));
      return true;
   }

   @Override
   public void a(ebq $$0, fgc $$1) {
      if (!this.cw.b) {
         super.a($$0, $$1);
      }

      this.gP();
   }

   public void d(int $$0) {
      this.r($$0);
      this.ch = this.ch + (float)$$0 / (float)this.gt();
      this.cg = azz.a(this.cg + $$0, 0, Integer.MAX_VALUE);

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

   public void a(dak $$0, int $$1) {
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
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awy.ve, this.dm(), $$1 * 0.75F, 1.0F);
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

   public Optional<crn> Y() {
      return Optional.empty();
   }

   public cvx gu() {
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

   public boolean a(iw $$0, jc $$1, dak $$2) {
      if (this.cw.e) {
         return true;
      } else {
         iw $$3 = $$0.a($$1.g());
         ebu $$4 = new ebu(this.dV(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int e(asb $$0) {
      return !$$0.O().c(dkf.e) && !this.ak() ? Math.min(this.cf * 7, 100) : 0;
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
   protected bxe.c bf() {
      return this.cw.b || this.aH() && this.cf() ? bxe.c.a : bxe.c.d;
   }

   public void w() {
   }

   @Override
   public xg ah() {
      return xg.b(this.cy.getName());
   }

   public cxp gx() {
      return this.bP;
   }

   @Override
   protected boolean b(bxo $$0) {
      return $$0.a() == bxo.a.b;
   }

   public boolean h(dak $$0) {
      return this.ct.g($$0);
   }

   public boolean j(ua $$0) {
      if (this.bY() || !this.aH() || this.bi() || this.av) {
         return false;
      } else if (this.gC().j()) {
         this.k($$0);
         this.cs = this.dV().ae();
         return true;
      } else if (this.gD().j()) {
         this.l($$0);
         this.cs = this.dV().ae();
         return true;
      } else {
         return false;
      }
   }

   protected void gy() {
      if (this.cs + 20L < this.dV().ae()) {
         this.d(this.gC());
         this.k(new ua());
         this.d(this.gD());
         this.l(new ua());
      }
   }

   private void d(ua $$0) {
      if (!this.dV().C && !$$0.j()) {
         bxn.a($$0, this.dV(), bxm.r).ifPresent($$0x -> {
            if ($$0x instanceof bzb $$1) {
               $$1.i(this);
            }

            $$0x.a_(this.dA(), this.dC() + 0.7F, this.dG());
            ((asb)this.dV()).c($$0x);
         });
      }
   }

   @Nullable
   public abstract dkg a();

   @Override
   public boolean ak() {
      return this.a() == dkg.d;
   }

   @Override
   public boolean bE() {
      return !this.ak() && super.bE();
   }

   @Override
   public boolean cj() {
      return !this.cw.b && !this.ak() && super.cj();
   }

   public boolean gz() {
      return this.a() == dkg.b;
   }

   @Override
   public boolean cJ() {
      return !this.cw.b;
   }

   public fhh gA() {
      return this.dV().R();
   }

   @Override
   public xg P_() {
      xu $$0 = fhc.a(this.cq(), this.ah());
      return this.a($$0);
   }

   private xu a(xu $$0) {
      String $$1 = this.gi().getName();
      return $$0.a($$1x -> $$1x.a(new xe.g("/tell " + $$1 + " ")).a(this.cQ()).a($$1));
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

   public boolean a(csk $$0) {
      return (this.ar().a(bK) & $$0.a()) == $$0.a();
   }

   @Override
   public byw a_(int $$0) {
      if ($$0 == 499) {
         return new byw() {
            @Override
            public dak a() {
               return csi.this.bR.g();
            }

            @Override
            public boolean a(dak $$0) {
               csi.this.bR.a($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new byw() {
               @Override
               public dak a() {
                  return csi.this.bQ.r().a($$1);
               }

               @Override
               public boolean a(dak $$0) {
                  csi.this.bQ.r().a($$1, $$0);
                  csi.this.bQ.a(csi.this.ct);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.ct.i().size()) {
            return byw.a(this.ct, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.bP.b() ? byw.a(this.bP, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gB() {
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
   public bxw fy() {
      return this.al.a(bL) == 0 ? bxw.a : bxw.b;
   }

   public void b(bxw $$0) {
      this.al.a(bL, (byte)($$0 == bxw.a ? 0 : 1));
   }

   public ua gC() {
      return this.al.a(bM);
   }

   protected void k(ua $$0) {
      this.al.a(bM, $$0);
   }

   public ua gD() {
      return this.al.a(bN);
   }

   protected void l(ua $$0) {
      this.al.a(bN, $$0);
   }

   public float gE() {
      return (float)(1.0 / this.h(bzl.e) * 20.0);
   }

   public float H(float $$0) {
      return azz.a(((float)this.aS + $$0) / this.gE(), 0.0F, 1.0F);
   }

   public void gF() {
      this.aS = 0;
   }

   public dah gG() {
      return this.cB;
   }

   @Override
   protected float aS() {
      return !this.cw.b && !this.fJ() ? super.aS() : 1.0F;
   }

   @Override
   public float eh() {
      return (float)this.h(bzl.q);
   }

   public boolean gH() {
      return this.cw.d && this.F() >= 2;
   }

   public int F() {
      return 0;
   }

   public boolean s(int $$0) {
      return this.F() >= $$0;
   }

   @Override
   public bxh e(byr $$0) {
      return b.getOrDefault($$0, bJ);
   }

   @Override
   public ImmutableList<byr> fO() {
      return ImmutableList.of(byr.a, byr.f, byr.d);
   }

   @Override
   public dak d(dak $$0) {
      if (!($$0.h() instanceof dbf)) {
         return dak.l;
      } else {
         Predicate<dak> $$1 = ((dbf)$$0.h()).c();
         dak $$2 = dbf.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((dbf)$$0.h()).a();

            for (int $$3 = 0; $$3 < this.ct.b(); $$3++) {
               dak $$4 = this.ct.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.fV() ? new dak(dao.pk) : dak.l;
         }
      }
   }

   @Override
   public fgc v(float $$0) {
      double $$1 = 0.22 * (this.fy() == bxw.b ? -1.0 : 1.0);
      float $$2 = azz.h($$0 * 0.5F, this.dN(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = azz.h($$0, this.aW, this.aV) * (float) (Math.PI / 180.0);
      if (this.fJ() || this.fv()) {
         fgc $$4 = this.h($$0);
         fgc $$5 = this.dy();
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

         return this.p($$0).e(new fgc($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.ck()) {
         return this.p($$0).e(new fgc($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cR().c() - 1.0;
         double $$13 = this.ch() ? -0.2 : 0.07;
         return this.p($$0).e(new fgc($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dU() {
      return true;
   }

   public boolean gI() {
      return this.fz() && this.fB().a(dao.sf);
   }

   @Override
   public boolean dT() {
      return false;
   }

   public Optional<jf> gJ() {
      return this.cC;
   }

   public void a(Optional<jf> $$0) {
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

   public boolean gK() {
      return this.cu || this.bU <= 0;
   }

   public void gL() {
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

   public double gM() {
      return this.h(bzl.g);
   }

   public double gN() {
      return this.h(bzl.j);
   }

   public boolean b(bxe $$0, double $$1) {
      return $$0.dQ() ? false : this.a($$0.cR(), $$1);
   }

   public boolean a(ffx $$0, double $$1) {
      double $$2 = this.gN() + $$1;
      return $$0.e(this.bD()) < $$2 * $$2;
   }

   public boolean a(iw $$0, double $$1) {
      double $$2 = this.gM() + $$1;
      return new ffx($$0).e(this.bD()) < $$2 * $$2;
   }

   public void w(boolean $$0) {
      this.cD = $$0;
      if ($$0) {
         this.cE = 40;
      } else {
         this.cE = 0;
      }
   }

   public boolean gO() {
      return this.cD;
   }

   public void gP() {
      if (this.cE == 0) {
         this.gQ();
      }
   }

   public void gQ() {
      this.cE = 0;
      this.cn = null;
      this.cm = null;
      this.cD = false;
   }

   public boolean gR() {
      return false;
   }

   @Override
   public boolean k_() {
      return this.cw.b ? false : super.k_();
   }

   public String gS() {
      return MoreObjects.toStringHelper(this)
         .add("name", this.ah().getString())
         .add("id", this.ao())
         .add("pos", this.dt())
         .add("mode", this.a())
         .add("permission", this.F())
         .toString();
   }

   public static enum a {
      a,
      b(xg.c("block.minecraft.bed.no_sleep")),
      c(xg.c("block.minecraft.bed.too_far_away")),
      d(xg.c("block.minecraft.bed.obstructed")),
      e,
      f(xg.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final xg g;

      private a() {
         this.g = null;
      }

      private a(final xg $$0) {
         this.g = $$0;
      }

      @Nullable
      public xg a() {
         return this.g;
      }
   }
}
