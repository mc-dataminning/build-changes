import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.math.IntMath;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cps extends bwb {
   private static final Logger a = LogUtils.getLogger();
   public static final bvv bH = bvv.b;
   public static final int bI = 0;
   public static final int bJ = 20;
   public static final int bK = 100;
   public static final int bL = 10;
   public static final int bM = 200;
   public static final int bN = 499;
   public static final int bO = 500;
   public static final float bP = 4.5F;
   public static final float bQ = 3.0F;
   public static final float bR = 1.5F;
   public static final float bS = 0.6F;
   public static final float bT = 0.6F;
   public static final float bU = 1.62F;
   private static final int b = 40;
   public static final fbs bV = new fbs(0.0, 0.6, 0.0);
   public static final bvi bW = bvi.b(0.6F, 1.8F).b(1.62F).a(bvh.a().a(bvg.b, bV));
   private static final Map<bwn, bvi> c = ImmutableMap.builder()
      .put(bwn.a, bW)
      .put(bwn.c, aD)
      .put(bwn.b, bvi.b(0.6F, 0.6F).b(0.4F))
      .put(bwn.d, bvi.b(0.6F, 0.6F).b(0.4F))
      .put(bwn.e, bvi.b(0.6F, 0.6F).b(0.4F))
      .put(bwn.f, bvi.b(0.6F, 1.5F).b(1.27F).a(bvh.a().a(bvg.b, bV)))
      .put(bwn.h, bvi.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final alc<Float> d = alg.a(cps.class, ale.d);
   private static final alc<Integer> e = alg.a(cps.class, ale.b);
   protected static final alc<Byte> bX = alg.a(cps.class, ale.a);
   protected static final alc<Byte> bY = alg.a(cps.class, ale.a);
   protected static final alc<ux> bZ = alg.a(cps.class, ale.t);
   protected static final alc<ux> ca = alg.a(cps.class, ale.t);
   private long f;
   final cpr g = new cpr(this);
   protected cul cb = new cul();
   public final cua cc;
   public csx cd;
   protected cst ce = new cst();
   protected int cf;
   public float cg;
   public float ch;
   public int ci;
   public double cj;
   public double ck;
   public double cl;
   public double cm;
   public double cn;
   public double co;
   private int h;
   protected boolean cp;
   private final cpo i = new cpo();
   public int cq;
   public int cr;
   public float cs;
   protected int ct;
   protected final float cu = 0.02F;
   private int j;
   private final GameProfile k;
   private boolean cz;
   private cxk cC = cxk.k;
   private final cxh cD = this.g();
   private Optional<jp> cE = Optional.empty();
   @Nullable
   public cqh cv;
   protected float cw;
   @Nullable
   public fbs cx;
   @Nullable
   public bvf cy;
   private boolean cF;
   private int cG;

   public cps(dha $$0, jh $$1, float $$2, GameProfile $$3) {
      super(bvm.bS, $$0);
      this.a_($$3.getId());
      this.k = $$3;
      this.cc = new cua(this.g, !$$0.C, this);
      this.cd = this.cc;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bk = 180.0F;
   }

   public boolean a(dha $$0, jh $$1, dgx $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dgx.d) {
         return true;
      } else if (this.gt()) {
         return false;
      } else {
         cxk $$3 = this.eX();
         return $$3.f() || !$$3.b(new dxr($$0, $$1, false));
      }
   }

   public static bxi.a fV() {
      return bwb.ed().a(bxj.c, 1.0).a(bxj.v, 0.1F).a(bxj.e).a(bxj.q).a(bxj.g, 4.5).a(bxj.j, 3.0).a(bxj.f).a(bxj.C).a(bxj.z).a(bxj.t).a(bxj.D);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(bX, (byte)0);
      $$0.a(bY, (byte)bH.b());
      $$0.a(bZ, new ux());
      $$0.a(ca, new ux());
   }

   @Override
   public void h() {
      this.ad = this.aa_();
      if (this.aa_()) {
         this.d(false);
      }

      if (this.ci > 0) {
         this.ci--;
      }

      if (this.fP()) {
         this.h++;
         if (this.h > 100) {
            this.h = 100;
         }

         if (!this.dV().C && this.dV().U()) {
            this.a(false, true);
         }
      } else if (this.h > 0) {
         this.h++;
         if (this.h >= 110) {
            this.h = 0;
         }
      }

      this.fZ();
      super.h();
      if (!this.dV().C && this.cd != null && !this.cd.b(this)) {
         this.p();
         this.cd = this.cc;
      }

      this.t();
      if (this instanceof asi $$0) {
         this.ce.a($$0);
         this.a(axp.k);
         this.a(axp.l);
         if (this.bL()) {
            this.a(axp.m);
         }

         if (this.cg()) {
            this.a(axp.o);
         }

         if (!this.fP()) {
            this.a(axp.n);
         }
      }

      int $$1 = 29999999;
      double $$2 = bae.a(this.dA(), -2.9999999E7, 2.9999999E7);
      double $$3 = bae.a(this.dG(), -2.9999999E7, 2.9999999E7);
      if ($$2 != this.dA() || $$3 != this.dG()) {
         this.a_($$2, this.dC(), $$3);
      }

      this.aS++;
      cxk $$4 = this.eX();
      if (!cxk.a(this.cC, $$4)) {
         if (!cxk.b(this.cC, $$4)) {
            this.gB();
         }

         this.cC = $$4.v();
      }

      if (!this.a(aya.a) && this.c(cxo.oK)) {
         this.m();
      }

      this.cD.a();
      this.ga();
      if (this.cG > 0) {
         this.cG--;
      }
   }

   @Override
   protected float fo() {
      return this.fE() ? 15.0F : super.fo();
   }

   public boolean fW() {
      return this.cd();
   }

   protected boolean fX() {
      return this.cd();
   }

   protected boolean fY() {
      return this.cd();
   }

   protected boolean fZ() {
      this.cp = this.a(aya.a);
      return this.cp;
   }

   @Override
   public void l(boolean $$0) {
      if (!this.gh().b) {
         super.l($$0);
      }
   }

   @Override
   public void m(boolean $$0) {
      if (!this.gh().b) {
         super.m($$0);
      }
   }

   private void m() {
      this.a(new buk(bum.m, 200, 0, false, false, true));
   }

   private boolean c(cxg $$0) {
      for (bvn $$1 : bvn.i) {
         cxk $$2 = this.a($$1);
         dfm $$3 = $$2.a(ku.D);
         if ($$2.a($$0) && $$3 != null && $$3.a() == $$1) {
            return true;
         }
      }

      return false;
   }

   protected cxh g() {
      return new cxh();
   }

   private void t() {
      this.cj = this.cm;
      this.ck = this.cn;
      this.cl = this.co;
      double $$0 = this.dA() - this.cm;
      double $$1 = this.dC() - this.cn;
      double $$2 = this.dG() - this.co;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cm = this.dA();
         this.cj = this.cm;
      }

      if ($$2 > 10.0) {
         this.co = this.dG();
         this.cl = this.co;
      }

      if ($$1 > 10.0) {
         this.cn = this.dC();
         this.ck = this.cn;
      }

      if ($$0 < -10.0) {
         this.cm = this.dA();
         this.cj = this.cm;
      }

      if ($$2 < -10.0) {
         this.co = this.dG();
         this.cl = this.co;
      }

      if ($$1 < -10.0) {
         this.cn = this.dC();
         this.ck = this.cn;
      }

      this.cm += $$0 * 0.25;
      this.co += $$2 * 0.25;
      this.cn += $$1 * 0.25;
   }

   protected void ga() {
      if (this.h(bwn.d)) {
         bwn $$0;
         if (this.fH()) {
            $$0 = bwn.b;
         } else if (this.fP()) {
            $$0 = bwn.c;
         } else if (this.ck()) {
            $$0 = bwn.d;
         } else if (this.ft()) {
            $$0 = bwn.e;
         } else if (this.cd() && !this.i.b) {
            $$0 = bwn.f;
         } else {
            $$0 = bwn.a;
         }

         bwn $$6;
         if (this.aa_() || this.bZ() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bwn.f)) {
            $$6 = bwn.f;
         } else {
            $$6 = bwn.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bwn $$0) {
      return this.dV().a(this, this.a($$0).a(this.dt()).h(1.0E-7));
   }

   @Override
   protected axe aV() {
      return axf.uN;
   }

   @Override
   protected axe aW() {
      return axf.uL;
   }

   @Override
   protected axe aX() {
      return axf.uM;
   }

   @Override
   public int bX() {
      return 10;
   }

   @Override
   public void a(axe $$0, float $$1, float $$2) {
      this.dV().a(this, this.dA(), this.dC(), this.dG(), $$0, this.dm(), $$1, $$2);
   }

   public void a(axe $$0, axg $$1, float $$2, float $$3) {
   }

   @Override
   public axg dm() {
      return axg.h;
   }

   @Override
   protected int dn() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.w();
      } else if ($$0 == 23) {
         this.cz = false;
      } else if ($$0 == 22) {
         this.cz = true;
      } else {
         super.b($$0);
      }
   }

   protected void p() {
      this.cd = this.cc;
   }

   protected void q() {
   }

   @Override
   public void r() {
      if (!this.dV().C && this.fX() && this.bZ()) {
         this.ae();
         this.g(false);
      } else {
         super.r();
         this.cg = this.ch;
         this.ch = 0.0F;
      }
   }

   @Override
   protected void fs() {
      super.fs();
      this.eV();
      this.aZ = this.dL();
   }

   @Override
   public void d_() {
      if (this.cf > 0) {
         this.cf--;
      }

      this.j();
      this.g.j();
      this.cg = this.ch;
      if (this.i.b && !this.bZ()) {
         this.k();
      }

      super.d_();
      this.C((float)this.h(bxj.v));
      float $$1;
      if (this.aJ() && !this.eE() && !this.ck()) {
         $$1 = Math.min(0.1F, (float)this.dy().i());
      } else {
         $$1 = 0.0F;
      }

      this.ch = this.ch + ($$1 - this.ch) * 0.4F;
      if (this.eD() > 0.0F && !this.aa_()) {
         fbn $$2;
         if (this.bZ() && !this.dk().dQ()) {
            $$2 = this.cR().b(this.dk().cR()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cR().c(1.0, 0.5, 1.0);
         }

         List<bvf> $$4 = this.dV().a_(this, $$2);
         List<bvf> $$5 = Lists.newArrayList();

         for (bvf $$6 : $$4) {
            if ($$6.aq() == bvm.W) {
               $$5.add($$6);
            } else if (!$$6.dQ()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ae.a($$5, this.ae));
         }
      }

      this.c(this.gy());
      this.c(this.gz());
      if (!this.dV().C && (this.Z > 0.5F || this.bj()) || this.i.b || this.fP() || this.av) {
         this.gv();
      }
   }

   protected void j() {
   }

   private void c(@Nullable ux $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dV().A.a(200) == 0) {
         String $$1 = $$0.l("id");
         bvm.a($$1).filter($$0x -> $$0x == bvm.aP).ifPresent($$0x -> {
            if (!cii.a(this.dV(), this)) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), cii.a(this.dV(), this.dV().A), this.dm(), 1.0F, cii.a(this.dV().A));
            }
         });
      }
   }

   private void d(bvf $$0) {
      $$0.a_(this);
   }

   public int gb() {
      return this.al.a(e);
   }

   public void q(int $$0) {
      this.al.a(e, $$0);
   }

   public void r(int $$0) {
      int $$1 = this.gb();
      this.al.a(e, $$1 + $$0);
   }

   public void a(int $$0, float $$1, cxk $$2) {
      this.bC = $$0;
      this.bD = $$1;
      this.bE = $$2;
      if (!this.dV().C) {
         this.gv();
         this.c(4, true);
      }
   }

   @Nonnull
   @Override
   public cxk dZ() {
      return this.ft() && this.bE != null ? this.bE : super.dZ();
   }

   @Override
   public void a(btv $$0) {
      super.a($$0);
      this.ay();
      if (!this.aa_() && this.dV() instanceof ash $$1) {
         this.b($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-bae.b((this.eJ() + this.dL()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-bae.a((this.eJ() + this.dL()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(axp.N);
      this.a(axp.i.b(axp.m));
      this.a(axp.i.b(axp.n));
      this.aH();
      this.c(false);
      this.c(Optional.of(jp.a(this.dV().ah(), this.dv())));
   }

   @Override
   protected void f(ash $$0) {
      super.f($$0);
      if (!$$0.N().b(dgw.d)) {
         this.gc();
         this.g.k();
      }
   }

   protected void gc() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cxk $$1 = this.g.a($$0);
         if (!$$1.f() && ddt.a($$1, dds.D)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected axe e(btv $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected axe o_() {
      return axf.uD;
   }

   @Override
   public void g(cxk $$0) {
   }

   @Nullable
   public clw a(cxk $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public clw a(cxk $$0, boolean $$1, boolean $$2) {
      if (!$$0.f() && this.dV().C) {
         this.a(btd.a);
      }

      return null;
   }

   public float c(dxn $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(bxj.t);
      }

      if (bul.a(this)) {
         $$1 *= 1.0F + (float)(bul.b(this) + 1) * 0.2F;
      }

      if (this.b(bum.d)) {
         float $$2 = switch (this.c(bum.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.h(bxj.f);
      if (this.a(aya.a)) {
         $$1 *= (float)this.g(bxj.C).g();
      }

      if (!this.aJ()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dxn $$0) {
      return !$$0.C() || this.g.f().b($$0);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a_(this.k.getId());
      vd $$1 = $$0.c("Inventory", 10);
      this.g.b($$1);
      this.g.j = $$0.h("SelectedItemSlot");
      this.h = $$0.g("SleepTimer");
      this.cs = $$0.j("XpP");
      this.cq = $$0.h("XpLevel");
      this.cr = $$0.h("XpTotal");
      this.ct = $$0.h("XpSeed");
      if (this.ct == 0) {
         this.ct = this.ae.f();
      }

      this.q($$0.h("Score"));
      this.ce.a($$0);
      this.i.b($$0);
      this.g(bxj.v).a((double)this.i.b());
      if ($$0.b("EnderItems", 9)) {
         this.cb.a($$0.c("EnderItems", 10), this.dX());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.c(jp.b.parse(vl.a, $$0.c("LastDeathLocation")).resultOrPartial(a::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         fbs.a.parse(vl.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(a::error).ifPresent($$0x -> this.cx = $$0x);
      }

      this.cF = $$0.q("ignore_fall_damage_from_current_explosion");
      this.cG = $$0.h("current_impulse_context_reset_grace_time");
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      vm.e($$0);
      $$0.a("Inventory", this.g.a(new vd()));
      $$0.a("SelectedItemSlot", this.g.j);
      $$0.a("SleepTimer", (short)this.h);
      $$0.a("XpP", this.cs);
      $$0.a("XpLevel", this.cq);
      $$0.a("XpTotal", this.cr);
      $$0.a("XpSeed", this.ct);
      $$0.a("Score", this.gb());
      this.ce.b($$0);
      this.i.a($$0);
      $$0.a("EnderItems", this.cb.a(this.dX()));
      if (!this.gy().g()) {
         $$0.a("ShoulderEntityLeft", this.gy());
      }

      if (!this.gz().g()) {
         $$0.a("ShoulderEntityRight", this.gz());
      }

      this.gG().flatMap($$0x -> jp.b.encodeStart(vl.a, $$0x).resultOrPartial(a::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cx != null) {
         $$0.a("current_explosion_impact_pos", (vu)fbs.a.encodeStart(vl.a, this.cx).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cF);
      $$0.a("current_impulse_context_reset_grace_time", this.cG);
   }

   @Override
   public boolean a(ash $$0, btv $$1) {
      if (super.a($$0, $$1)) {
         return true;
      } else if ($$1.a(axw.n)) {
         return !$$0.N().b(dgw.G);
      } else if ($$1.a(axw.m)) {
         return !$$0.N().b(dgw.H);
      } else if ($$1.a(axw.i)) {
         return !$$0.N().b(dgw.I);
      } else {
         return $$1.a(axw.o) ? !$$0.N().b(dgw.J) : false;
      }
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.i.a && !$$1.a(axw.d)) {
         return false;
      } else {
         this.bf = 0;
         if (this.eE()) {
            return false;
         } else {
            this.gv();
            if ($$1.g()) {
               if ($$0.al() == btb.a) {
                  $$2 = 0.0F;
               }

               if ($$0.al() == btb.b) {
                  $$2 = Math.min($$2 / 2.0F + 1.0F, $$2);
               }

               if ($$0.al() == btb.d) {
                  $$2 = $$2 * 3.0F / 2.0F;
               }
            }

            return $$2 == 0.0F ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void d(bwb $$0) {
      super.d($$0);
      cxk $$1 = this.fF();
      if ($$0.fS() && $$1 != null) {
         this.h($$1);
      }
   }

   @Override
   public boolean ew() {
      return !this.gh().a && super.ew();
   }

   public boolean a(cps $$0) {
      fcz $$1 = this.cr();
      fcz $$2 = $$0.cr();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void c(btv $$0, float $$1) {
      this.a($$0, $$1, new bvn[]{bvn.c, bvn.d, bvn.e, bvn.f});
   }

   @Override
   protected void d(btv $$0, float $$1) {
      this.a($$0, $$1, new bvn[]{bvn.f});
   }

   @Override
   protected void z(float $$0) {
      if (this.bz.a(cxo.wi)) {
         if (!this.dV().C) {
            this.b(axp.c.b(this.bz.h()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + bae.d($$0);
            btd $$2 = this.fy();
            this.bz.a($$1, this, d($$2));
            if (this.bz.f()) {
               if ($$2 == btd.a) {
                  this.a(bvn.a, cxk.k);
               } else {
                  this.a(bvn.b, cxk.k);
               }

               this.bz = cxk.k;
               this.a(axf.wX, 0.8F, 0.8F + this.dV().A.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void b(ash $$0, btv $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var8 = Math.max($$2 - this.fu(), 0.0F);
         this.E(this.fu() - ($$2 - var8));
         float $$4 = $$2 - var8;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
            this.a(axp.L, Math.round($$4 * 10.0F));
         }

         if (var8 != 0.0F) {
            this.G($$1.a());
            this.eP().a($$1, var8);
            this.x(this.eD() - var8);
            if (var8 < 3.4028235E37F) {
               this.a(axp.J, Math.round(var8 * 10.0F));
            }

            this.a(ecj.o);
         }
      }
   }

   public boolean aa() {
      return false;
   }

   public void a(dwc $$0, boolean $$1) {
   }

   public void a(dga $$0) {
   }

   public void a(duz $$0) {
   }

   public void a(dwh $$0) {
   }

   public void a(dvs $$0) {
   }

   public void a(cjw $$0, bsx $$1) {
   }

   public OptionalInt a(@Nullable btg $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dfy $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cxk $$0, btd $$1) {
   }

   public bte a(bvf $$0, btd $$1) {
      if (this.aa_()) {
         if ($$0 instanceof btg) {
            this.a((btg)$$0);
         }

         return bte.e;
      } else {
         cxk $$2 = this.b($$1);
         cxk $$3 = $$2.v();
         bte $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.i.d && $$2 == this.b($$1) && $$2.L() < $$3.L()) {
               $$2.e($$3.L());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof bwb) {
               if (this.i.d) {
                  $$2 = $$3;
               }

               bte $$5 = $$2.a(this, (bwb)$$0, $$1);
               if ($$5.a()) {
                  this.dV().a(ecj.r, $$0.dt(), ecj.a.a(this));
                  if ($$2.f() && !this.i.d) {
                     this.a($$1, cxk.k);
                  }

                  return $$5;
               }
            }

            return bte.e;
         }
      }
   }

   @Override
   public void bQ() {
      super.bQ();
      this.J = 0;
   }

   @Override
   protected boolean fg() {
      return super.fg() || this.fP();
   }

   @Override
   public boolean ek() {
      return !this.i.b;
   }

   @Override
   protected fbs a(fbs $$0, bwf $$1) {
      float $$2 = this.dP();
      if (!this.i.b && !($$0.e > 0.0) && ($$1 == bwf.a || $$1 == bwf.b) && this.fY() && this.I($$2)) {
         double $$3 = $$0.d;
         double $$4 = $$0.f;
         double $$5 = 0.05;
         double $$6 = Math.signum($$3) * 0.05;

         double $$7;
         for ($$7 = Math.signum($$4) * 0.05; $$3 != 0.0 && this.b($$3, 0.0, $$2); $$3 -= $$6) {
            if (Math.abs($$3) <= 0.05) {
               $$3 = 0.0;
               break;
            }
         }

         while ($$4 != 0.0 && this.b(0.0, $$4, $$2)) {
            if (Math.abs($$4) <= 0.05) {
               $$4 = 0.0;
               break;
            }

            $$4 -= $$7;
         }

         while ($$3 != 0.0 && $$4 != 0.0 && this.b($$3, $$4, $$2)) {
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

         return new fbs($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean I(float $$0) {
      return this.aJ() || this.Z < $$0 && !this.b(0.0, 0.0, $$0 - this.Z);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      fbn $$3 = this.cR();
      return this.dV().a(this, new fbn($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(bvf $$0) {
      if ($$0.cB()) {
         if (!$$0.v(this)) {
            float $$1 = this.ft() ? this.bD : (float)this.h(bxj.c);
            cxk $$2 = this.dZ();
            btv $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.dW().a(this));
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.H(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gB();
            if ($$0.aq().a(axy.H) && $$0 instanceof cql $$6 && $$6.a(cqm.c, this, this, true)) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), axf.uw, this.dm());
               return;
            }

            if ($$1 > 0.0F || $$4 > 0.0F) {
               boolean $$7 = $$5 > 0.9F;
               boolean $$8;
               if (this.cj() && $$7) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), axf.uv, this.dm(), 1.0F, 1.0F);
                  $$8 = true;
               } else {
                  $$8 = false;
               }

               $$1 += $$2.h().a($$0, $$1, $$3);
               boolean $$10 = $$7
                  && this.Z > 0.0F
                  && !this.aJ()
                  && !this.q_()
                  && !this.bj()
                  && !this.b(bum.o)
                  && !this.bZ()
                  && $$0 instanceof bwb
                  && !this.cj();
               if ($$10) {
                  $$1 *= 1.5F;
               }

               float $$11 = $$1 + $$4;
               boolean $$12 = false;
               if ($$7 && !$$10 && !$$8 && this.aJ()) {
                  double $$13 = this.ah().j();
                  double $$14 = (double)this.fn() * 2.5;
                  if ($$13 < bae.k($$14) && this.b(btd.a).a(ayd.bJ)) {
                     $$12 = true;
                  }
               }

               float $$15 = 0.0F;
               if ($$0 instanceof bwb $$16) {
                  $$15 = $$16.eD();
               }

               fbs $$17 = $$0.dy();
               boolean $$18 = $$0.b($$3, $$11);
               if ($$18) {
                  float $$19 = this.a($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                  if ($$19 > 0.0F) {
                     if ($$0 instanceof bwb $$20) {
                        $$20.p(
                           (double)($$19 * 0.5F), (double)bae.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-bae.b(this.dL() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.j(
                           (double)(-bae.a(this.dL() * (float) (Math.PI / 180.0)) * $$19 * 0.5F),
                           0.1,
                           (double)(bae.b(this.dL() * (float) (Math.PI / 180.0)) * $$19 * 0.5F)
                        );
                     }

                     this.h(this.dy().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$12) {
                     float $$21 = 1.0F + (float)this.h(bxj.D) * $$1;

                     for (bwb $$23 : this.dV().a(bwb.class, $$0.cR().c(1.0, 0.25, 1.0))) {
                        if ($$23 != this && $$23 != $$0 && !this.s($$23) && (!($$23 instanceof cll) || !((cll)$$23).x()) && this.g((bvf)$$23) < 9.0) {
                           float $$24 = this.a($$23, $$21, $$3) * $$5;
                           $$23.p(0.4F, (double)bae.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-bae.b(this.dL() * (float) (Math.PI / 180.0))));
                           $$23.a($$3, $$24);
                           if (this.dV() instanceof ash $$25) {
                              ddt.a($$25, (bvf)$$23, $$3);
                           }
                        }
                     }

                     this.dV().a(null, this.dA(), this.dC(), this.dG(), axf.uy, this.dm(), 1.0F, 1.0F);
                     this.gd();
                  }

                  if ($$0 instanceof asi && $$0.T) {
                     ((asi)$$0).f.b(new agd($$0));
                     $$0.T = false;
                     $$0.h($$17);
                  }

                  if ($$10) {
                     this.dV().a(null, this.dA(), this.dC(), this.dG(), axf.uu, this.dm(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$10 && !$$12) {
                     if ($$7) {
                        this.dV().a(null, this.dA(), this.dC(), this.dG(), axf.ux, this.dm(), 1.0F, 1.0F);
                     } else {
                        this.dV().a(null, this.dA(), this.dC(), this.dG(), axf.uz, this.dm(), 1.0F, 1.0F);
                     }
                  }

                  if ($$4 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  bvf $$26 = $$0;
                  if ($$0 instanceof ckm) {
                     $$26 = ((ckm)$$0).a;
                  }

                  boolean $$27 = false;
                  if (this.dV() instanceof ash $$28) {
                     if ($$26 instanceof bwb $$29) {
                        $$27 = $$2.a($$29, this);
                     }

                     ddt.a($$28, $$0, $$3);
                  }

                  if (!this.dV().C && !$$2.f() && $$26 instanceof bwb) {
                     if ($$27) {
                        $$2.b((bwb)$$26, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.eX()) {
                           this.a(btd.a, cxk.k);
                        } else {
                           this.a(btd.b, cxk.k);
                        }
                     }
                  }

                  if ($$0 instanceof bwb) {
                     float $$30 = $$15 - ((bwb)$$0).eD();
                     this.a(axp.G, Math.round($$30 * 10.0F));
                     if (this.dV() instanceof ash && $$30 > 2.0F) {
                        int $$31 = (int)((double)$$30 * 0.5);
                        ((ash)this.dV()).a(ls.g, $$0.dA(), $$0.e(0.5), $$0.dG(), $$31, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.G(0.1F);
               } else {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), axf.uw, this.dm(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(bvf $$0, float $$1, btv $$2) {
      return $$1;
   }

   @Override
   protected void g(bwb $$0) {
      this.e($$0);
   }

   public void h(cxk $$0) {
      this.gC().a($$0, 100);
      this.fD();
      this.dV().a(this, (byte)30);
   }

   public void b(bvf $$0) {
   }

   @Override
   public void c(bvf $$0) {
   }

   public void gd() {
      double $$0 = (double)(-bae.a(this.dL() * (float) (Math.PI / 180.0)));
      double $$1 = (double)bae.b(this.dL() * (float) (Math.PI / 180.0));
      if (this.dV() instanceof ash) {
         ((ash)this.dV()).a(ls.ak, this.dA() + $$0, this.e(0.5), this.dG() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void ge() {
   }

   @Override
   public void a(bvf.c $$0) {
      super.a($$0);
      this.cc.a(this);
      if (this.cd != null && this.gi()) {
         this.q();
      }
   }

   public boolean c() {
      return false;
   }

   public GameProfile gf() {
      return this.k;
   }

   public cpr gg() {
      return this.g;
   }

   public cpo gh() {
      return this.i;
   }

   @Override
   public boolean fT() {
      return this.i.d;
   }

   public void a(cxk $$0, cxk $$1, cth $$2) {
   }

   public boolean gi() {
      return this.cd != this.cc;
   }

   public boolean gj() {
      return true;
   }

   public Either<cps.a, bbk> a(jh $$0) {
      this.b($$0);
      this.h = 0;
      return Either.right(bbk.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fQ();
      if (this.dV() instanceof ash && $$1) {
         ((ash)this.dV()).f();
      }

      this.h = $$0 ? 0 : 100;
   }

   @Override
   public void fQ() {
      this.a(true, true);
   }

   public boolean gk() {
      return this.fP() && this.h >= 100;
   }

   public int gl() {
      return this.h;
   }

   public void a(xv $$0, boolean $$1) {
   }

   public void a(alz $$0) {
      this.b(axp.i.b($$0));
   }

   public void a(alz $$0, int $$1) {
      this.a(axp.i.b($$0), $$1);
   }

   public void b(axm<?> $$0) {
      this.a($$0, 1);
   }

   public void a(axm<?> $$0, int $$1) {
   }

   public void a(axm<?> $$0) {
   }

   public int a(Collection<dcd<?>> $$0) {
      return 0;
   }

   public void a(dcd<?> $$0, List<cxk> $$1) {
   }

   public void b(List<aly<dbz<?>>> $$0) {
   }

   public int b(Collection<dcd<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(fbs $$0) {
      if (this.bZ()) {
         super.a_($$0);
      } else {
         if (this.ck()) {
            double $$1 = this.bT().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bn || !this.dV().b_(jh.a(this.dA(), this.dC() + 1.0 - 0.1, this.dG())).c()) {
               fbs $$3 = this.dy();
               this.h($$3.b(0.0, ($$1 - $$3.e) * $$2, 0.0));
            }
         }

         if (this.gh().b) {
            double $$4 = this.dy().e;
            super.a_($$0);
            this.h(this.dy().a(jm.a.b, $$4 * 0.6));
         } else {
            super.a_($$0);
         }
      }
   }

   @Override
   protected boolean fr() {
      return !this.i.b && super.fr();
   }

   @Override
   public void bp() {
      if (this.i.b) {
         this.i(false);
      } else {
         super.bp();
      }
   }

   protected boolean h(jh $$0) {
      return !this.dV().a_($$0).j(this.dV(), $$0);
   }

   @Override
   public float fn() {
      return (float)this.h(bxj.v);
   }

   @Override
   public boolean a(float $$0, float $$1, btv $$2) {
      if (this.i.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(axp.t, (int)Math.round((double)$$0 * 100.0));
         }

         boolean $$3 = this.cx != null && this.cF;
         float $$4;
         if ($$3) {
            $$4 = Math.min($$0, (float)(this.cx.e - this.dC()));
            boolean $$5 = $$4 <= 0.0F;
            if ($$5) {
               this.gL();
            } else {
               this.gK();
            }
         } else {
            $$4 = $$0;
         }

         if ($$4 > 0.0F && super.a($$4, $$1, $$2)) {
            this.gL();
            return true;
         } else {
            return false;
         }
      }
   }

   public boolean gm() {
      if (!this.fH() && this.fr() && !this.bj()) {
         this.gn();
         return true;
      } else {
         return false;
      }
   }

   public void gn() {
      this.b(7, true);
   }

   public void go() {
      this.b(7, true);
      this.b(7, false);
   }

   @Override
   protected void bs() {
      if (!this.aa_()) {
         super.bs();
      }
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      if (this.bj()) {
         this.aY();
         this.b($$1);
      } else {
         jh $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dxn $$3 = this.dV().a_($$2);
            if ($$3.a(axu.bq)) {
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
   public bwb.a eL() {
      return new bwb.a(axf.uK, axf.uA);
   }

   @Override
   public boolean a(ash $$0, bwb $$1) {
      this.b(axp.g.b($$1.aq()));
      return true;
   }

   @Override
   public void a(dxn $$0, fbs $$1) {
      if (!this.i.b) {
         super.a($$0, $$1);
      }

      this.gK();
   }

   public void d(int $$0) {
      this.r($$0);
      this.cs = this.cs + (float)$$0 / (float)this.gq();
      this.cr = bae.a(this.cr + $$0, 0, Integer.MAX_VALUE);

      while (this.cs < 0.0F) {
         float $$1 = this.cs * (float)this.gq();
         if (this.cq > 0) {
            this.c(-1);
            this.cs = 1.0F + $$1 / (float)this.gq();
         } else {
            this.c(-1);
            this.cs = 0.0F;
         }
      }

      while (this.cs >= 1.0F) {
         this.cs = (this.cs - 1.0F) * (float)this.gq();
         this.c(1);
         this.cs = this.cs / (float)this.gq();
      }
   }

   public int gp() {
      return this.ct;
   }

   public void a(cxk $$0, int $$1) {
      this.cq -= $$1;
      if (this.cq < 0) {
         this.cq = 0;
         this.cs = 0.0F;
         this.cr = 0;
      }

      this.ct = this.ae.f();
   }

   public void c(int $$0) {
      this.cq = IntMath.saturatedAdd(this.cq, $$0);
      if (this.cq < 0) {
         this.cq = 0;
         this.cs = 0.0F;
         this.cr = 0;
      }

      if ($$0 > 0 && this.cq % 5 == 0 && (float)this.j < (float)this.af - 100.0F) {
         float $$1 = this.cq > 30 ? 1.0F : (float)this.cq / 30.0F;
         this.dV().a(null, this.dA(), this.dC(), this.dG(), axf.uJ, this.dm(), $$1 * 0.75F, 1.0F);
         this.j = this.af;
      }
   }

   public int gq() {
      if (this.cq >= 30) {
         return 112 + (this.cq - 30) * 9;
      } else {
         return this.cq >= 15 ? 37 + (this.cq - 15) * 5 : 7 + this.cq * 2;
      }
   }

   public void G(float $$0) {
      if (!this.i.a) {
         if (!this.dV().C) {
            this.ce.a($$0);
         }
      }
   }

   public Optional<cox> ac() {
      return Optional.empty();
   }

   public cst gr() {
      return this.ce;
   }

   public boolean u(boolean $$0) {
      return this.i.a || $$0 || this.ce.b();
   }

   public boolean gs() {
      return this.eD() > 0.0F && this.eD() < this.eR();
   }

   public boolean gt() {
      return this.i.e;
   }

   public boolean a(jh $$0, jm $$1, cxk $$2) {
      if (this.i.e) {
         return true;
      } else {
         jh $$3 = $$0.a($$1.g());
         dxr $$4 = new dxr(this.dV(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int e(ash $$0) {
      return !$$0.N().b(dgw.d) && !this.aa_() ? Math.min(this.cq * 7, 100) : 0;
   }

   @Override
   protected boolean eo() {
      return true;
   }

   @Override
   public boolean cM() {
      return true;
   }

   @Override
   protected bvf.b bg() {
      return this.i.b || this.aJ() && this.cg() ? bvf.b.a : bvf.b.d;
   }

   public void x() {
   }

   @Override
   public xv al() {
      return xv.b(this.k.getName());
   }

   public cul gu() {
      return this.cb;
   }

   @Override
   public cxk a(bvn $$0) {
      if ($$0 == bvn.a) {
         return this.g.f();
      } else if ($$0 == bvn.b) {
         return this.g.i.getFirst();
      } else {
         return $$0.a() == bvn.a.b ? this.g.h.get($$0.b()) : cxk.k;
      }
   }

   @Override
   protected boolean b(bvn $$0) {
      return $$0.a() == bvn.a.b;
   }

   @Override
   public void a(bvn $$0, cxk $$1) {
      this.c($$1);
      if ($$0 == bvn.a) {
         this.a($$0, this.g.g.set(this.g.j, $$1), $$1);
      } else if ($$0 == bvn.b) {
         this.a($$0, this.g.i.set(0, $$1), $$1);
      } else if ($$0.a() == bvn.a.b) {
         this.a($$0, this.g.h.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cxk $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<cxk> fa() {
      return Lists.newArrayList(new cxk[]{this.eX(), this.eY()});
   }

   @Override
   public Iterable<cxk> eZ() {
      return this.g.h;
   }

   @Override
   public boolean e(bvn $$0) {
      return $$0 != bvn.g;
   }

   public boolean h(ux $$0) {
      if (this.bZ() || !this.aJ() || this.bj() || this.av) {
         return false;
      } else if (this.gy().g()) {
         this.i($$0);
         this.f = this.dV().ac();
         return true;
      } else if (this.gz().g()) {
         this.j($$0);
         this.f = this.dV().ac();
         return true;
      } else {
         return false;
      }
   }

   protected void gv() {
      if (this.f + 20L < this.dV().ac()) {
         this.k(this.gy());
         this.i(new ux());
         this.k(this.gz());
         this.j(new ux());
      }
   }

   private void k(ux $$0) {
      if (!this.dV().C && !$$0.g()) {
         bvm.a($$0, this.dV(), bvl.r).ifPresent($$0x -> {
            if ($$0x instanceof bwy) {
               ((bwy)$$0x).b(this.at);
            }

            $$0x.a_(this.dA(), this.dC() + 0.7F, this.dG());
            ((ash)this.dV()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean aa_();

   @Override
   public boolean bG() {
      return !this.aa_() && super.bG();
   }

   @Override
   public boolean ck() {
      return !this.i.b && !this.aa_() && super.ck();
   }

   public abstract boolean b();

   @Override
   public boolean cJ() {
      return !this.i.b;
   }

   public fcx gw() {
      return this.dV().Q();
   }

   @Override
   public xv p_() {
      yj $$0 = fcs.a(this.cr(), this.al());
      return this.a($$0);
   }

   private yj a(yj $$0) {
      String $$1 = this.gf().getName();
      return $$0.a($$1x -> $$1x.a(new xt(xt.a.d, "/tell " + $$1 + " ")).a(this.cQ()).a($$1));
   }

   @Override
   public String cI() {
      return this.gf().getName();
   }

   @Override
   protected void F(float $$0) {
      this.au().a(d, $$0);
   }

   @Override
   public float fu() {
      return this.au().a(d);
   }

   public boolean a(cpt $$0) {
      return (this.au().a(bX) & $$0.a()) == $$0.a();
   }

   @Override
   public bwt a_(int $$0) {
      if ($$0 == 499) {
         return new bwt() {
            @Override
            public cxk a() {
               return cps.this.cd.g();
            }

            @Override
            public boolean a(cxk $$0) {
               cps.this.cd.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bwt() {
               @Override
               public cxk a() {
                  return cps.this.cc.r().a($$1);
               }

               @Override
               public boolean a(cxk $$0) {
                  cps.this.cc.r().a($$1, $$0);
                  cps.this.cc.a(cps.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.g.size()) {
            return bwt.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.cb.b() ? bwt.a(this.cb, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gx() {
      return this.cz;
   }

   public void v(boolean $$0) {
      this.cz = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.i.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bvv fw() {
      return this.al.a(bY) == 0 ? bvv.a : bvv.b;
   }

   public void b(bvv $$0) {
      this.al.a(bY, (byte)($$0 == bvv.a ? 0 : 1));
   }

   public ux gy() {
      return this.al.a(bZ);
   }

   protected void i(ux $$0) {
      this.al.a(bZ, $$0);
   }

   public ux gz() {
      return this.al.a(ca);
   }

   protected void j(ux $$0) {
      this.al.a(ca, $$0);
   }

   public float gA() {
      return (float)(1.0 / this.h(bxj.e) * 20.0);
   }

   public float H(float $$0) {
      return bae.a(((float)this.aS + $$0) / this.gA(), 0.0F, 1.0F);
   }

   public void gB() {
      this.aS = 0;
   }

   public cxh gC() {
      return this.cD;
   }

   @Override
   protected float aT() {
      return !this.i.b && !this.fH() ? super.aT() : 1.0F;
   }

   public float gD() {
      return (float)this.h(bxj.q);
   }

   public boolean gE() {
      return this.i.d && this.G() >= 2;
   }

   protected int G() {
      return 0;
   }

   public boolean s(int $$0) {
      return this.G() >= $$0;
   }

   @Override
   public bvi e(bwn $$0) {
      return c.getOrDefault($$0, bW);
   }

   @Override
   public ImmutableList<bwn> fM() {
      return ImmutableList.of(bwn.a, bwn.f, bwn.d);
   }

   @Override
   public cxk d(cxk $$0) {
      if (!($$0.h() instanceof cyg)) {
         return cxk.k;
      } else {
         Predicate<cxk> $$1 = ((cyg)$$0.h()).d();
         cxk $$2 = cyg.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((cyg)$$0.h()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cxk $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.i.d ? new cxk(cxo.oS) : cxk.k;
         }
      }
   }

   @Override
   public fbs u(float $$0) {
      double $$1 = 0.22 * (this.fw() == bvv.b ? -1.0 : 1.0);
      float $$2 = bae.h($$0 * 0.5F, this.dN(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = bae.h($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      if (this.fH() || this.ft()) {
         fbs $$4 = this.g($$0);
         fbs $$5 = this.dy();
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

         return this.o($$0).e(new fbs($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cl()) {
         return this.o($$0).e(new fbs($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cR().c() - 1.0;
         double $$13 = this.ci() ? -0.2 : 0.07;
         return this.o($$0).e(new fbs($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dU() {
      return true;
   }

   public boolean gF() {
      return this.fx() && this.fz().a(cxo.rL);
   }

   @Override
   public boolean dT() {
      return false;
   }

   public Optional<jp> gG() {
      return this.cE;
   }

   public void c(Optional<jp> $$0) {
      this.cE = $$0;
   }

   @Override
   public float eJ() {
      return this.cw;
   }

   @Override
   public void p(float $$0) {
      super.p($$0);
      this.cw = $$0;
   }

   @Override
   public boolean dO() {
      return true;
   }

   @Override
   protected float fm() {
      if (this.i.b && !this.bZ()) {
         return this.cj() ? this.i.a() * 2.0F : this.i.a();
      } else {
         return this.cj() ? 0.025999999F : 0.02F;
      }
   }

   public double gH() {
      return this.h(bxj.g);
   }

   public double gI() {
      return this.h(bxj.j);
   }

   public boolean b(bvf $$0, double $$1) {
      return $$0.dQ() ? false : this.a($$0.cR(), $$1);
   }

   public boolean a(fbn $$0, double $$1) {
      double $$2 = this.gI() + $$1;
      return $$0.e(this.bF()) < $$2 * $$2;
   }

   public boolean a(jh $$0, double $$1) {
      double $$2 = this.gH() + $$1;
      return new fbn($$0).e(this.bF()) < $$2 * $$2;
   }

   public void w(boolean $$0) {
      this.cF = $$0;
      if ($$0) {
         this.cG = 40;
      } else {
         this.cG = 0;
      }
   }

   public boolean gJ() {
      return this.cF;
   }

   public void gK() {
      if (this.cG == 0) {
         this.gL();
      }
   }

   public void gL() {
      this.cG = 0;
      this.cy = null;
      this.cx = null;
      this.cF = false;
   }

   public boolean gM() {
      return false;
   }

   public static enum a {
      a,
      b(xv.c("block.minecraft.bed.no_sleep")),
      c(xv.c("block.minecraft.bed.too_far_away")),
      d(xv.c("block.minecraft.bed.obstructed")),
      e,
      f(xv.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final xv g;

      private a() {
         this.g = null;
      }

      private a(final xv $$0) {
         this.g = $$0;
      }

      @Nullable
      public xv a() {
         return this.g;
      }
   }
}
