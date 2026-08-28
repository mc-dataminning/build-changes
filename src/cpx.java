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

public abstract class cpx extends bwg {
   private static final Logger a = LogUtils.getLogger();
   public static final bwa bH = bwa.b;
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
   public static final fby bV = new fby(0.0, 0.6, 0.0);
   public static final bvn bW = bvn.b(0.6F, 1.8F).b(1.62F).a(bvm.a().a(bvl.b, bV));
   private static final Map<bws, bvn> c = ImmutableMap.builder()
      .put(bws.a, bW)
      .put(bws.c, aD)
      .put(bws.b, bvn.b(0.6F, 0.6F).b(0.4F))
      .put(bws.d, bvn.b(0.6F, 0.6F).b(0.4F))
      .put(bws.e, bvn.b(0.6F, 0.6F).b(0.4F))
      .put(bws.f, bvn.b(0.6F, 1.5F).b(1.27F).a(bvm.a().a(bvl.b, bV)))
      .put(bws.h, bvn.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final alc<Float> d = alg.a(cpx.class, ale.d);
   private static final alc<Integer> e = alg.a(cpx.class, ale.b);
   protected static final alc<Byte> bX = alg.a(cpx.class, ale.a);
   protected static final alc<Byte> bY = alg.a(cpx.class, ale.a);
   protected static final alc<ux> bZ = alg.a(cpx.class, ale.t);
   protected static final alc<ux> ca = alg.a(cpx.class, ale.t);
   private long f;
   final cpw g = new cpw(this);
   protected cuq cb = new cuq();
   public final cuf cc;
   public ctc cd;
   protected csy ce = new csy();
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
   private final cpt i = new cpt();
   public int cq;
   public int cr;
   public float cs;
   protected int ct;
   protected final float cu = 0.02F;
   private int j;
   private final GameProfile k;
   private boolean cz;
   private cxp cC = cxp.j;
   private final cxm cD = this.g();
   private Optional<jp> cE = Optional.empty();
   @Nullable
   public cqm cv;
   protected float cw;
   @Nullable
   public fby cx;
   @Nullable
   public bvk cy;
   private boolean cF;
   private int cG;

   public cpx(dhi $$0, jh $$1, float $$2, GameProfile $$3) {
      super(bvr.bS, $$0);
      this.a_($$3.getId());
      this.k = $$3;
      this.cc = new cuf(this.g, !$$0.C, this);
      this.cd = this.cc;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bk = 180.0F;
   }

   public boolean a(dhi $$0, jh $$1, dhf $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dhf.d) {
         return true;
      } else if (this.gv()) {
         return false;
      } else {
         cxp $$3 = this.eZ();
         return $$3.f() || !$$3.b(new dxz($$0, $$1, false));
      }
   }

   public static bxn.a fX() {
      return bwg.ee().a(bxo.c, 1.0).a(bxo.v, 0.1F).a(bxo.e).a(bxo.q).a(bxo.g, 4.5).a(bxo.j, 3.0).a(bxo.f).a(bxo.C).a(bxo.z).a(bxo.t).a(bxo.D);
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

      if (this.fR()) {
         this.h++;
         if (this.h > 100) {
            this.h = 100;
         }

         if (!this.dW().C && this.dW().U()) {
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
      if (!this.dW().C && this.cd != null && !this.cd.b(this)) {
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

         if (!this.fR()) {
            this.a(axp.n);
         }
      }

      int $$1 = 29999999;
      double $$2 = bae.a(this.dB(), -2.9999999E7, 2.9999999E7);
      double $$3 = bae.a(this.dH(), -2.9999999E7, 2.9999999E7);
      if ($$2 != this.dB() || $$3 != this.dH()) {
         this.a_($$2, this.dD(), $$3);
      }

      this.aS++;
      cxp $$4 = this.eZ();
      if (!cxp.a(this.cC, $$4)) {
         if (!cxp.b(this.cC, $$4)) {
            this.gD();
         }

         this.cC = $$4.v();
      }

      if (!this.a(aya.a) && this.c(cxt.oK)) {
         this.m();
      }

      this.cD.a();
      this.gc();
      if (this.cG > 0) {
         this.cG--;
      }
   }

   @Override
   protected float fq() {
      return this.fG() ? 15.0F : super.fq();
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
      this.cp = this.a(aya.a);
      return this.cp;
   }

   @Override
   public void l(boolean $$0) {
      if (!this.gj().b) {
         super.l($$0);
      }
   }

   @Override
   public void m(boolean $$0) {
      if (!this.gj().b) {
         super.m($$0);
      }
   }

   private void m() {
      this.a(new bup(bur.m, 200, 0, false, false, true));
   }

   private boolean c(cxl $$0) {
      for (bvs $$1 : bvs.i) {
         cxp $$2 = this.a($$1);
         dfu $$3 = $$2.a(ku.D);
         if ($$2.a($$0) && $$3 != null && $$3.a() == $$1) {
            return true;
         }
      }

      return false;
   }

   protected cxm g() {
      return new cxm();
   }

   private void t() {
      this.cj = this.cm;
      this.ck = this.cn;
      this.cl = this.co;
      double $$0 = this.dB() - this.cm;
      double $$1 = this.dD() - this.cn;
      double $$2 = this.dH() - this.co;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cm = this.dB();
         this.cj = this.cm;
      }

      if ($$2 > 10.0) {
         this.co = this.dH();
         this.cl = this.co;
      }

      if ($$1 > 10.0) {
         this.cn = this.dD();
         this.ck = this.cn;
      }

      if ($$0 < -10.0) {
         this.cm = this.dB();
         this.cj = this.cm;
      }

      if ($$2 < -10.0) {
         this.co = this.dH();
         this.cl = this.co;
      }

      if ($$1 < -10.0) {
         this.cn = this.dD();
         this.ck = this.cn;
      }

      this.cm += $$0 * 0.25;
      this.co += $$2 * 0.25;
      this.cn += $$1 * 0.25;
   }

   protected void gc() {
      if (this.h(bws.d)) {
         bws $$0;
         if (this.fJ()) {
            $$0 = bws.b;
         } else if (this.fR()) {
            $$0 = bws.c;
         } else if (this.ck()) {
            $$0 = bws.d;
         } else if (this.fv()) {
            $$0 = bws.e;
         } else if (this.cd() && !this.i.b) {
            $$0 = bws.f;
         } else {
            $$0 = bws.a;
         }

         bws $$6;
         if (this.aa_() || this.bZ() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bws.f)) {
            $$6 = bws.f;
         } else {
            $$6 = bws.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bws $$0) {
      return this.dW().a(this, this.a($$0).a(this.du()).h(1.0E-7));
   }

   @Override
   protected axe aV() {
      return axf.uO;
   }

   @Override
   protected axe aW() {
      return axf.uM;
   }

   @Override
   protected axe aX() {
      return axf.uN;
   }

   @Override
   public int bX() {
      return 10;
   }

   @Override
   public void a(axe $$0, float $$1, float $$2) {
      this.dW().a(this, this.dB(), this.dD(), this.dH(), $$0, this.dn(), $$1, $$2);
   }

   public void a(axe $$0, axg $$1, float $$2, float $$3) {
   }

   @Override
   public axg dn() {
      return axg.h;
   }

   @Override
   protected int do() {
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
      if (!this.dW().C && this.fZ() && this.bZ()) {
         this.ae();
         this.g(false);
      } else {
         super.r();
         this.cg = this.ch;
         this.ch = 0.0F;
      }
   }

   @Override
   protected void fu() {
      super.fu();
      this.eX();
      this.aZ = this.dM();
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
      this.C((float)this.h(bxo.v));
      float $$1;
      if (this.aJ() && !this.eF() && !this.ck()) {
         $$1 = Math.min(0.1F, (float)this.dz().i());
      } else {
         $$1 = 0.0F;
      }

      this.ch = this.ch + ($$1 - this.ch) * 0.4F;
      if (this.eE() > 0.0F && !this.aa_()) {
         fbt $$2;
         if (this.bZ() && !this.dl().dR()) {
            $$2 = this.cR().b(this.dl().cR()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cR().c(1.0, 0.5, 1.0);
         }

         List<bvk> $$4 = this.dW().a_(this, $$2);
         List<bvk> $$5 = Lists.newArrayList();

         for (bvk $$6 : $$4) {
            if ($$6.aq() == bvr.W) {
               $$5.add($$6);
            } else if (!$$6.dR()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ae.a($$5, this.ae));
         }
      }

      this.c(this.gA());
      this.c(this.gB());
      if (!this.dW().C && (this.Z > 0.5F || this.bj()) || this.i.b || this.fR() || this.av) {
         this.gx();
      }
   }

   protected void j() {
   }

   private void c(@Nullable ux $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dW().A.a(200) == 0) {
         String $$1 = $$0.l("id");
         bvr.a($$1).filter($$0x -> $$0x == bvr.aP).ifPresent($$0x -> {
            if (!cin.a(this.dW(), this)) {
               this.dW().a(null, this.dB(), this.dD(), this.dH(), cin.a(this.dW(), this.dW().A), this.dn(), 1.0F, cin.a(this.dW().A));
            }
         });
      }
   }

   private void d(bvk $$0) {
      $$0.a_(this);
   }

   public int gd() {
      return this.al.a(e);
   }

   public void q(int $$0) {
      this.al.a(e, $$0);
   }

   public void r(int $$0) {
      int $$1 = this.gd();
      this.al.a(e, $$1 + $$0);
   }

   public void a(int $$0, float $$1, cxp $$2) {
      this.bC = $$0;
      this.bD = $$1;
      this.bE = $$2;
      if (!this.dW().C) {
         this.gx();
         this.c(4, true);
      }
   }

   @Nonnull
   @Override
   public cxp ea() {
      return this.fv() && this.bE != null ? this.bE : super.ea();
   }

   @Override
   public void a(bua $$0) {
      super.a($$0);
      this.ay();
      if (!this.aa_() && this.dW() instanceof ash $$1) {
         this.b($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-bae.b((this.eK() + this.dM()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-bae.a((this.eK() + this.dM()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(axp.N);
      this.a(axp.i.b(axp.m));
      this.a(axp.i.b(axp.n));
      this.aH();
      this.c(false);
      this.c(Optional.of(jp.a(this.dW().ah(), this.dw())));
   }

   @Override
   protected void f(ash $$0) {
      super.f($$0);
      if (!$$0.N().b(dhe.d)) {
         this.ge();
         this.g.k();
      }
   }

   protected void ge() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cxp $$1 = this.g.a($$0);
         if (!$$1.f() && deb.a($$1, dea.D)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected axe e(bua $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected axe o_() {
      return axf.uE;
   }

   @Override
   public void g(cxp $$0) {
   }

   @Nullable
   public cmb a(cxp $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cmb a(cxp $$0, boolean $$1, boolean $$2) {
      if (!$$0.f() && this.dW().C) {
         this.a(bti.a);
      }

      return null;
   }

   public float c(dxv $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(bxo.t);
      }

      if (buq.a(this)) {
         $$1 *= 1.0F + (float)(buq.b(this) + 1) * 0.2F;
      }

      if (this.b(bur.d)) {
         float $$2 = switch (this.c(bur.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.h(bxo.f);
      if (this.a(aya.a)) {
         $$1 *= (float)this.g(bxo.C).g();
      }

      if (!this.aJ()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dxv $$0) {
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
      this.g(bxo.v).a((double)this.i.b());
      if ($$0.b("EnderItems", 9)) {
         this.cb.a($$0.c("EnderItems", 10), this.dY());
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
         fby.a.parse(vl.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(a::error).ifPresent($$0x -> this.cx = $$0x);
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
      $$0.a("Score", this.gd());
      this.ce.b($$0);
      this.i.a($$0);
      $$0.a("EnderItems", this.cb.a(this.dY()));
      if (!this.gA().g()) {
         $$0.a("ShoulderEntityLeft", this.gA());
      }

      if (!this.gB().g()) {
         $$0.a("ShoulderEntityRight", this.gB());
      }

      this.gI().flatMap($$0x -> jp.b.encodeStart(vl.a, $$0x).resultOrPartial(a::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cx != null) {
         $$0.a("current_explosion_impact_pos", (vu)fby.a.encodeStart(vl.a, this.cx).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cF);
      $$0.a("current_impulse_context_reset_grace_time", this.cG);
   }

   @Override
   public boolean a(ash $$0, bua $$1) {
      if (super.a($$0, $$1)) {
         return true;
      } else if ($$1.a(axw.n)) {
         return !$$0.N().b(dhe.H);
      } else if ($$1.a(axw.m)) {
         return !$$0.N().b(dhe.I);
      } else if ($$1.a(axw.i)) {
         return !$$0.N().b(dhe.J);
      } else {
         return $$1.a(axw.o) ? !$$0.N().b(dhe.K) : false;
      }
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.i.a && !$$1.a(axw.d)) {
         return false;
      } else {
         this.bf = 0;
         if (this.eF()) {
            return false;
         } else {
            this.gx();
            if ($$1.g()) {
               if ($$0.al() == btg.a) {
                  $$2 = 0.0F;
               }

               if ($$0.al() == btg.b) {
                  $$2 = Math.min($$2 / 2.0F + 1.0F, $$2);
               }

               if ($$0.al() == btg.d) {
                  $$2 = $$2 * 3.0F / 2.0F;
               }
            }

            return $$2 == 0.0F ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void d(bwg $$0) {
      super.d($$0);
      cxp $$1 = this.fH();
      if ($$0.fU() && $$1 != null) {
         this.h($$1);
      }
   }

   @Override
   public boolean ex() {
      return !this.gj().a && super.ex();
   }

   public boolean a(cpx $$0) {
      fdf $$1 = this.cr();
      fdf $$2 = $$0.cr();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void c(bua $$0, float $$1) {
      this.a($$0, $$1, new bvs[]{bvs.c, bvs.d, bvs.e, bvs.f});
   }

   @Override
   protected void d(bua $$0, float $$1) {
      this.a($$0, $$1, new bvs[]{bvs.f});
   }

   @Override
   protected void z(float $$0) {
      if (this.bz.a(cxt.wi)) {
         if (!this.dW().C) {
            this.b(axp.c.b(this.bz.h()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + bae.d($$0);
            bti $$2 = this.fA();
            this.bz.a($$1, this, d($$2));
            if (this.bz.f()) {
               if ($$2 == bti.a) {
                  this.a(bvs.a, cxp.j);
               } else {
                  this.a(bvs.b, cxp.j);
               }

               this.bz = cxp.j;
               this.a(axf.wY, 0.8F, 0.8F + this.dW().A.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void b(ash $$0, bua $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var8 = Math.max($$2 - this.fw(), 0.0F);
         this.E(this.fw() - ($$2 - var8));
         float $$4 = $$2 - var8;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
            this.a(axp.L, Math.round($$4 * 10.0F));
         }

         if (var8 != 0.0F) {
            this.G($$1.a());
            this.eQ().a($$1, var8);
            this.x(this.eE() - var8);
            if (var8 < 3.4028235E37F) {
               this.a(axp.J, Math.round(var8 * 10.0F));
            }

            this.a(ecr.o);
         }
      }
   }

   public boolean aa() {
      return false;
   }

   public void a(dwk $$0, boolean $$1) {
   }

   public void a(dgi $$0) {
   }

   public void a(dvh $$0) {
   }

   public void a(dwp $$0) {
   }

   public void a(dwa $$0) {
   }

   public void a(ckb $$0, btc $$1) {
   }

   public OptionalInt a(@Nullable btl $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dgg $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cxp $$0, bti $$1) {
   }

   public btj a(bvk $$0, bti $$1) {
      if (this.aa_()) {
         if ($$0 instanceof btl) {
            this.a((btl)$$0);
         }

         return btj.e;
      } else {
         cxp $$2 = this.b($$1);
         cxp $$3 = $$2.v();
         btj $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.i.d && $$2 == this.b($$1) && $$2.L() < $$3.L()) {
               $$2.e($$3.L());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof bwg) {
               if (this.i.d) {
                  $$2 = $$3;
               }

               btj $$5 = $$2.a(this, (bwg)$$0, $$1);
               if ($$5.a()) {
                  this.dW().a(ecr.r, $$0.du(), ecr.a.a(this));
                  if ($$2.f() && !this.i.d) {
                     this.a($$1, cxp.j);
                  }

                  return $$5;
               }
            }

            return btj.e;
         }
      }
   }

   @Override
   public void bQ() {
      super.bQ();
      this.J = 0;
   }

   @Override
   protected boolean fi() {
      return super.fi() || this.fR();
   }

   @Override
   public boolean el() {
      return !this.i.b;
   }

   @Override
   protected fby a(fby $$0, bwk $$1) {
      float $$2 = this.dQ();
      if (!this.i.b && !($$0.e > 0.0) && ($$1 == bwk.a || $$1 == bwk.b) && this.ga() && this.I($$2)) {
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

         return new fby($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean I(float $$0) {
      return this.aJ() || this.Z < $$0 && !this.b(0.0, 0.0, $$0 - this.Z);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      fbt $$3 = this.cR();
      return this.dW().a(this, new fbt($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(bvk $$0) {
      if ($$0.cB()) {
         if (!$$0.v(this)) {
            float $$1 = this.fv() ? this.bD : (float)this.h(bxo.c);
            cxp $$2 = this.ea();
            bua $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.dX().a(this));
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.H(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gD();
            if ($$0.aq().a(axy.H) && $$0 instanceof cqq $$6 && $$6.a(cqr.c, this, this, true)) {
               this.dW().a(null, this.dB(), this.dD(), this.dH(), axf.ux, this.dn());
               return;
            }

            if ($$1 > 0.0F || $$4 > 0.0F) {
               boolean $$7 = $$5 > 0.9F;
               boolean $$8;
               if (this.cj() && $$7) {
                  this.dW().a(null, this.dB(), this.dD(), this.dH(), axf.uw, this.dn(), 1.0F, 1.0F);
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
                  && !this.b(bur.o)
                  && !this.bZ()
                  && $$0 instanceof bwg
                  && !this.cj();
               if ($$10) {
                  $$1 *= 1.5F;
               }

               float $$11 = $$1 + $$4;
               boolean $$12 = false;
               if ($$7 && !$$10 && !$$8 && this.aJ()) {
                  double $$13 = this.ah().j();
                  double $$14 = (double)this.fp() * 2.5;
                  if ($$13 < bae.k($$14) && this.b(bti.a).a(ayd.bJ)) {
                     $$12 = true;
                  }
               }

               float $$15 = 0.0F;
               if ($$0 instanceof bwg $$16) {
                  $$15 = $$16.eE();
               }

               fby $$17 = $$0.dz();
               boolean $$18 = $$0.b($$3, $$11);
               if ($$18) {
                  float $$19 = this.a($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                  if ($$19 > 0.0F) {
                     if ($$0 instanceof bwg $$20) {
                        $$20.p(
                           (double)($$19 * 0.5F), (double)bae.a(this.dM() * (float) (Math.PI / 180.0)), (double)(-bae.b(this.dM() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.j(
                           (double)(-bae.a(this.dM() * (float) (Math.PI / 180.0)) * $$19 * 0.5F),
                           0.1,
                           (double)(bae.b(this.dM() * (float) (Math.PI / 180.0)) * $$19 * 0.5F)
                        );
                     }

                     this.h(this.dz().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$12) {
                     float $$21 = 1.0F + (float)this.h(bxo.D) * $$1;

                     for (bwg $$23 : this.dW().a(bwg.class, $$0.cR().c(1.0, 0.25, 1.0))) {
                        if ($$23 != this && $$23 != $$0 && !this.s($$23) && (!($$23 instanceof clq) || !((clq)$$23).x()) && this.g((bvk)$$23) < 9.0) {
                           float $$24 = this.a($$23, $$21, $$3) * $$5;
                           $$23.p(0.4F, (double)bae.a(this.dM() * (float) (Math.PI / 180.0)), (double)(-bae.b(this.dM() * (float) (Math.PI / 180.0))));
                           $$23.a($$3, $$24);
                           if (this.dW() instanceof ash $$25) {
                              deb.a($$25, (bvk)$$23, $$3);
                           }
                        }
                     }

                     this.dW().a(null, this.dB(), this.dD(), this.dH(), axf.uz, this.dn(), 1.0F, 1.0F);
                     this.gf();
                  }

                  if ($$0 instanceof asi && $$0.T) {
                     ((asi)$$0).f.b(new agd($$0));
                     $$0.T = false;
                     $$0.h($$17);
                  }

                  if ($$10) {
                     this.dW().a(null, this.dB(), this.dD(), this.dH(), axf.uv, this.dn(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$10 && !$$12) {
                     if ($$7) {
                        this.dW().a(null, this.dB(), this.dD(), this.dH(), axf.uy, this.dn(), 1.0F, 1.0F);
                     } else {
                        this.dW().a(null, this.dB(), this.dD(), this.dH(), axf.uA, this.dn(), 1.0F, 1.0F);
                     }
                  }

                  if ($$4 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  bvk $$26 = $$0;
                  if ($$0 instanceof ckr) {
                     $$26 = ((ckr)$$0).a;
                  }

                  boolean $$27 = false;
                  if (this.dW() instanceof ash $$28) {
                     if ($$26 instanceof bwg $$29) {
                        $$27 = $$2.a($$29, this);
                     }

                     deb.a($$28, $$0, $$3);
                  }

                  if (!this.dW().C && !$$2.f() && $$26 instanceof bwg) {
                     if ($$27) {
                        $$2.b((bwg)$$26, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.eZ()) {
                           this.a(bti.a, cxp.j);
                        } else {
                           this.a(bti.b, cxp.j);
                        }
                     }
                  }

                  if ($$0 instanceof bwg) {
                     float $$30 = $$15 - ((bwg)$$0).eE();
                     this.a(axp.G, Math.round($$30 * 10.0F));
                     if (this.dW() instanceof ash && $$30 > 2.0F) {
                        int $$31 = (int)((double)$$30 * 0.5);
                        ((ash)this.dW()).a(ls.g, $$0.dB(), $$0.e(0.5), $$0.dH(), $$31, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.G(0.1F);
               } else {
                  this.dW().a(null, this.dB(), this.dD(), this.dH(), axf.ux, this.dn(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(bvk $$0, float $$1, bua $$2) {
      return $$1;
   }

   @Override
   protected void g(bwg $$0) {
      this.e($$0);
   }

   public void h(cxp $$0) {
      this.gE().a($$0, 100);
      this.fF();
      this.dW().a(this, (byte)30);
   }

   public void b(bvk $$0) {
   }

   @Override
   public void c(bvk $$0) {
   }

   public void gf() {
      double $$0 = (double)(-bae.a(this.dM() * (float) (Math.PI / 180.0)));
      double $$1 = (double)bae.b(this.dM() * (float) (Math.PI / 180.0));
      if (this.dW() instanceof ash) {
         ((ash)this.dW()).a(ls.ak, this.dB() + $$0, this.e(0.5), this.dH() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void gg() {
   }

   @Override
   public void a(bvk.d $$0) {
      super.a($$0);
      this.cc.a(this);
      if (this.cd != null && this.gk()) {
         this.q();
      }
   }

   public boolean c() {
      return false;
   }

   public GameProfile gh() {
      return this.k;
   }

   public cpw gi() {
      return this.g;
   }

   public cpt gj() {
      return this.i;
   }

   @Override
   public boolean fV() {
      return this.i.d;
   }

   public void a(cxp $$0, cxp $$1, ctm $$2) {
   }

   public boolean gk() {
      return this.cd != this.cc;
   }

   public boolean gl() {
      return true;
   }

   public Either<cpx.a, bbk> a(jh $$0) {
      this.b($$0);
      this.h = 0;
      return Either.right(bbk.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fS();
      if (this.dW() instanceof ash && $$1) {
         ((ash)this.dW()).f();
      }

      this.h = $$0 ? 0 : 100;
   }

   @Override
   public void fS() {
      this.a(true, true);
   }

   public boolean gm() {
      return this.fR() && this.h >= 100;
   }

   public int gn() {
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

   public int a(Collection<dcj<?>> $$0) {
      return 0;
   }

   public void a(dcj<?> $$0, List<cxp> $$1) {
   }

   public void b(List<aly<dce<?>>> $$0) {
   }

   public int b(Collection<dcj<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(fby $$0) {
      if (this.bZ()) {
         super.a_($$0);
      } else {
         if (this.ck()) {
            double $$1 = this.bT().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bn || !this.dW().b_(jh.a(this.dB(), this.dD() + 1.0 - 0.1, this.dH())).c()) {
               fby $$3 = this.dz();
               this.h($$3.b(0.0, ($$1 - $$3.e) * $$2, 0.0));
            }
         }

         if (this.gj().b) {
            double $$4 = this.dz().e;
            super.a_($$0);
            this.h(this.dz().a(jm.a.b, $$4 * 0.6));
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
   public void bp() {
      if (this.i.b) {
         this.i(false);
      } else {
         super.bp();
      }
   }

   protected boolean h(jh $$0) {
      return !this.dW().a_($$0).j(this.dW(), $$0);
   }

   @Override
   public float fp() {
      return (float)this.h(bxo.v);
   }

   @Override
   public boolean a(float $$0, float $$1, bua $$2) {
      if (this.i.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(axp.t, (int)Math.round((double)$$0 * 100.0));
         }

         boolean $$3 = this.cx != null && this.cF;
         float $$4;
         if ($$3) {
            $$4 = Math.min($$0, (float)(this.cx.e - this.dD()));
            boolean $$5 = $$4 <= 0.0F;
            if ($$5) {
               this.gN();
            } else {
               this.gM();
            }
         } else {
            $$4 = $$0;
         }

         if ($$4 > 0.0F && super.a($$4, $$1, $$2)) {
            this.gN();
            return true;
         } else {
            return false;
         }
      }
   }

   public boolean go() {
      if (!this.fJ() && this.ft() && !this.bj()) {
         this.gp();
         return true;
      } else {
         return false;
      }
   }

   public void gp() {
      this.b(7, true);
   }

   public void gq() {
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
   protected void b(jh $$0, dxv $$1) {
      if (this.bj()) {
         this.aY();
         this.b($$1);
      } else {
         jh $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dxv $$3 = this.dW().a_($$2);
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
   public bwg.a eM() {
      return new bwg.a(axf.uL, axf.uB);
   }

   @Override
   public boolean a(ash $$0, bwg $$1) {
      this.b(axp.g.b($$1.aq()));
      return true;
   }

   @Override
   public void a(dxv $$0, fby $$1) {
      if (!this.i.b) {
         super.a($$0, $$1);
      }

      this.gM();
   }

   public void d(int $$0) {
      this.r($$0);
      this.cs = this.cs + (float)$$0 / (float)this.gs();
      this.cr = bae.a(this.cr + $$0, 0, Integer.MAX_VALUE);

      while (this.cs < 0.0F) {
         float $$1 = this.cs * (float)this.gs();
         if (this.cq > 0) {
            this.c(-1);
            this.cs = 1.0F + $$1 / (float)this.gs();
         } else {
            this.c(-1);
            this.cs = 0.0F;
         }
      }

      while (this.cs >= 1.0F) {
         this.cs = (this.cs - 1.0F) * (float)this.gs();
         this.c(1);
         this.cs = this.cs / (float)this.gs();
      }
   }

   public int gr() {
      return this.ct;
   }

   public void a(cxp $$0, int $$1) {
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
         this.dW().a(null, this.dB(), this.dD(), this.dH(), axf.uK, this.dn(), $$1 * 0.75F, 1.0F);
         this.j = this.af;
      }
   }

   public int gs() {
      if (this.cq >= 30) {
         return 112 + (this.cq - 30) * 9;
      } else {
         return this.cq >= 15 ? 37 + (this.cq - 15) * 5 : 7 + this.cq * 2;
      }
   }

   public void G(float $$0) {
      if (!this.i.a) {
         if (!this.dW().C) {
            this.ce.a($$0);
         }
      }
   }

   public Optional<cpc> ac() {
      return Optional.empty();
   }

   public csy gt() {
      return this.ce;
   }

   public boolean u(boolean $$0) {
      return this.i.a || $$0 || this.ce.b();
   }

   public boolean gu() {
      return this.eE() > 0.0F && this.eE() < this.eS();
   }

   public boolean gv() {
      return this.i.e;
   }

   public boolean a(jh $$0, jm $$1, cxp $$2) {
      if (this.i.e) {
         return true;
      } else {
         jh $$3 = $$0.a($$1.g());
         dxz $$4 = new dxz(this.dW(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int e(ash $$0) {
      return !$$0.N().b(dhe.d) && !this.aa_() ? Math.min(this.cq * 7, 100) : 0;
   }

   @Override
   protected boolean ep() {
      return true;
   }

   @Override
   public boolean cM() {
      return true;
   }

   @Override
   protected bvk.c bg() {
      return this.i.b || this.aJ() && this.cg() ? bvk.c.a : bvk.c.d;
   }

   public void x() {
   }

   @Override
   public xv al() {
      return xv.b(this.k.getName());
   }

   public cuq gw() {
      return this.cb;
   }

   @Override
   public cxp a(bvs $$0) {
      if ($$0 == bvs.a) {
         return this.g.f();
      } else if ($$0 == bvs.b) {
         return this.g.i.getFirst();
      } else {
         return $$0.a() == bvs.a.b ? this.g.h.get($$0.b()) : cxp.j;
      }
   }

   @Override
   protected boolean b(bvs $$0) {
      return $$0.a() == bvs.a.b;
   }

   @Override
   public void a(bvs $$0, cxp $$1) {
      this.c($$1);
      if ($$0 == bvs.a) {
         this.a($$0, this.g.g.set(this.g.j, $$1), $$1);
      } else if ($$0 == bvs.b) {
         this.a($$0, this.g.i.set(0, $$1), $$1);
      } else if ($$0.a() == bvs.a.b) {
         this.a($$0, this.g.h.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cxp $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<cxp> fc() {
      return Lists.newArrayList(new cxp[]{this.eZ(), this.fa()});
   }

   @Override
   public Iterable<cxp> fb() {
      return this.g.h;
   }

   @Override
   public boolean e(bvs $$0) {
      return $$0 != bvs.g;
   }

   public boolean h(ux $$0) {
      if (this.bZ() || !this.aJ() || this.bj() || this.av) {
         return false;
      } else if (this.gA().g()) {
         this.i($$0);
         this.f = this.dW().ac();
         return true;
      } else if (this.gB().g()) {
         this.j($$0);
         this.f = this.dW().ac();
         return true;
      } else {
         return false;
      }
   }

   protected void gx() {
      if (this.f + 20L < this.dW().ac()) {
         this.k(this.gA());
         this.i(new ux());
         this.k(this.gB());
         this.j(new ux());
      }
   }

   private void k(ux $$0) {
      if (!this.dW().C && !$$0.g()) {
         bvr.a($$0, this.dW(), bvq.r).ifPresent($$0x -> {
            if ($$0x instanceof bxd) {
               ((bxd)$$0x).b(this.at);
            }

            $$0x.a_(this.dB(), this.dD() + 0.7F, this.dH());
            ((ash)this.dW()).c($$0x);
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

   public fdd gy() {
      return this.dW().Q();
   }

   @Override
   public xv p_() {
      yj $$0 = fcy.a(this.cr(), this.al());
      return this.a($$0);
   }

   private yj a(yj $$0) {
      String $$1 = this.gh().getName();
      return $$0.a($$1x -> $$1x.a(new xt(xt.a.d, "/tell " + $$1 + " ")).a(this.cQ()).a($$1));
   }

   @Override
   public String cI() {
      return this.gh().getName();
   }

   @Override
   protected void F(float $$0) {
      this.au().a(d, $$0);
   }

   @Override
   public float fw() {
      return this.au().a(d);
   }

   public boolean a(cpy $$0) {
      return (this.au().a(bX) & $$0.a()) == $$0.a();
   }

   @Override
   public bwy a_(int $$0) {
      if ($$0 == 499) {
         return new bwy() {
            @Override
            public cxp a() {
               return cpx.this.cd.g();
            }

            @Override
            public boolean a(cxp $$0) {
               cpx.this.cd.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bwy() {
               @Override
               public cxp a() {
                  return cpx.this.cc.r().a($$1);
               }

               @Override
               public boolean a(cxp $$0) {
                  cpx.this.cc.r().a($$1, $$0);
                  cpx.this.cc.a(cpx.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.g.size()) {
            return bwy.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.cb.b() ? bwy.a(this.cb, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gz() {
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
   public bwa fy() {
      return this.al.a(bY) == 0 ? bwa.a : bwa.b;
   }

   public void b(bwa $$0) {
      this.al.a(bY, (byte)($$0 == bwa.a ? 0 : 1));
   }

   public ux gA() {
      return this.al.a(bZ);
   }

   protected void i(ux $$0) {
      this.al.a(bZ, $$0);
   }

   public ux gB() {
      return this.al.a(ca);
   }

   protected void j(ux $$0) {
      this.al.a(ca, $$0);
   }

   public float gC() {
      return (float)(1.0 / this.h(bxo.e) * 20.0);
   }

   public float H(float $$0) {
      return bae.a(((float)this.aS + $$0) / this.gC(), 0.0F, 1.0F);
   }

   public void gD() {
      this.aS = 0;
   }

   public cxm gE() {
      return this.cD;
   }

   @Override
   protected float aT() {
      return !this.i.b && !this.fJ() ? super.aT() : 1.0F;
   }

   public float gF() {
      return (float)this.h(bxo.q);
   }

   public boolean gG() {
      return this.i.d && this.G() >= 2;
   }

   protected int G() {
      return 0;
   }

   public boolean s(int $$0) {
      return this.G() >= $$0;
   }

   @Override
   public bvn e(bws $$0) {
      return c.getOrDefault($$0, bW);
   }

   @Override
   public ImmutableList<bws> fO() {
      return ImmutableList.of(bws.a, bws.f, bws.d);
   }

   @Override
   public cxp d(cxp $$0) {
      if (!($$0.h() instanceof cyl)) {
         return cxp.j;
      } else {
         Predicate<cxp> $$1 = ((cyl)$$0.h()).d();
         cxp $$2 = cyl.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((cyl)$$0.h()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cxp $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.i.d ? new cxp(cxt.oS) : cxp.j;
         }
      }
   }

   @Override
   public fby u(float $$0) {
      double $$1 = 0.22 * (this.fy() == bwa.b ? -1.0 : 1.0);
      float $$2 = bae.h($$0 * 0.5F, this.dO(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = bae.h($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      if (this.fJ() || this.fv()) {
         fby $$4 = this.g($$0);
         fby $$5 = this.dz();
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

         return this.o($$0).e(new fby($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cl()) {
         return this.o($$0).e(new fby($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cR().c() - 1.0;
         double $$13 = this.ci() ? -0.2 : 0.07;
         return this.o($$0).e(new fby($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dV() {
      return true;
   }

   public boolean gH() {
      return this.fz() && this.fB().a(cxt.rL);
   }

   @Override
   public boolean dU() {
      return false;
   }

   public Optional<jp> gI() {
      return this.cE;
   }

   public void c(Optional<jp> $$0) {
      this.cE = $$0;
   }

   @Override
   public float eK() {
      return this.cw;
   }

   @Override
   public void p(float $$0) {
      super.p($$0);
      this.cw = $$0;
   }

   @Override
   public boolean dP() {
      return true;
   }

   @Override
   protected float fo() {
      if (this.i.b && !this.bZ()) {
         return this.cj() ? this.i.a() * 2.0F : this.i.a();
      } else {
         return this.cj() ? 0.025999999F : 0.02F;
      }
   }

   public double gJ() {
      return this.h(bxo.g);
   }

   public double gK() {
      return this.h(bxo.j);
   }

   public boolean b(bvk $$0, double $$1) {
      return $$0.dR() ? false : this.a($$0.cR(), $$1);
   }

   public boolean a(fbt $$0, double $$1) {
      double $$2 = this.gK() + $$1;
      return $$0.e(this.bF()) < $$2 * $$2;
   }

   public boolean a(jh $$0, double $$1) {
      double $$2 = this.gJ() + $$1;
      return new fbt($$0).e(this.bF()) < $$2 * $$2;
   }

   public void w(boolean $$0) {
      this.cF = $$0;
      if ($$0) {
         this.cG = 40;
      } else {
         this.cG = 0;
      }
   }

   public boolean gL() {
      return this.cF;
   }

   public void gM() {
      if (this.cG == 0) {
         this.gN();
      }
   }

   public void gN() {
      this.cG = 0;
      this.cy = null;
      this.cx = null;
      this.cF = false;
   }

   public boolean gO() {
      return false;
   }

   @Override
   public boolean dj() {
      return true;
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
