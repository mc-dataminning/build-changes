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

public abstract class cpw extends bwf {
   private static final Logger a = LogUtils.getLogger();
   public static final bvz bH = bvz.b;
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
   public static final fbx bV = new fbx(0.0, 0.6, 0.0);
   public static final bvm bW = bvm.b(0.6F, 1.8F).b(1.62F).a(bvl.a().a(bvk.b, bV));
   private static final Map<bwr, bvm> c = ImmutableMap.builder()
      .put(bwr.a, bW)
      .put(bwr.c, aD)
      .put(bwr.b, bvm.b(0.6F, 0.6F).b(0.4F))
      .put(bwr.d, bvm.b(0.6F, 0.6F).b(0.4F))
      .put(bwr.e, bvm.b(0.6F, 0.6F).b(0.4F))
      .put(bwr.f, bvm.b(0.6F, 1.5F).b(1.27F).a(bvl.a().a(bvk.b, bV)))
      .put(bwr.h, bvm.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final alc<Float> d = alg.a(cpw.class, ale.d);
   private static final alc<Integer> e = alg.a(cpw.class, ale.b);
   protected static final alc<Byte> bX = alg.a(cpw.class, ale.a);
   protected static final alc<Byte> bY = alg.a(cpw.class, ale.a);
   protected static final alc<ux> bZ = alg.a(cpw.class, ale.t);
   protected static final alc<ux> ca = alg.a(cpw.class, ale.t);
   private long f;
   final cpv g = new cpv(this);
   protected cup cb = new cup();
   public final cue cc;
   public ctb cd;
   protected csx ce = new csx();
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
   private final cps i = new cps();
   public int cq;
   public int cr;
   public float cs;
   protected int ct;
   protected final float cu = 0.02F;
   private int j;
   private final GameProfile k;
   private boolean cz;
   private cxo cC = cxo.j;
   private final cxl cD = this.g();
   private Optional<jp> cE = Optional.empty();
   @Nullable
   public cql cv;
   protected float cw;
   @Nullable
   public fbx cx;
   @Nullable
   public bvj cy;
   private boolean cF;
   private int cG;

   public cpw(dhh $$0, jh $$1, float $$2, GameProfile $$3) {
      super(bvq.bS, $$0);
      this.a_($$3.getId());
      this.k = $$3;
      this.cc = new cue(this.g, !$$0.C, this);
      this.cd = this.cc;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bk = 180.0F;
   }

   public boolean a(dhh $$0, jh $$1, dhe $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dhe.d) {
         return true;
      } else if (this.gv()) {
         return false;
      } else {
         cxo $$3 = this.eZ();
         return $$3.f() || !$$3.b(new dxy($$0, $$1, false));
      }
   }

   public static bxm.a fX() {
      return bwf.ee().a(bxn.c, 1.0).a(bxn.v, 0.1F).a(bxn.e).a(bxn.q).a(bxn.g, 4.5).a(bxn.j, 3.0).a(bxn.f).a(bxn.C).a(bxn.z).a(bxn.t).a(bxn.D);
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
      cxo $$4 = this.eZ();
      if (!cxo.a(this.cC, $$4)) {
         if (!cxo.b(this.cC, $$4)) {
            this.gD();
         }

         this.cC = $$4.v();
      }

      if (!this.a(aya.a) && this.c(cxs.oK)) {
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
      this.a(new buo(buq.m, 200, 0, false, false, true));
   }

   private boolean c(cxk $$0) {
      for (bvr $$1 : bvr.i) {
         cxo $$2 = this.a($$1);
         dft $$3 = $$2.a(ku.D);
         if ($$2.a($$0) && $$3 != null && $$3.a() == $$1) {
            return true;
         }
      }

      return false;
   }

   protected cxl g() {
      return new cxl();
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
      if (this.h(bwr.d)) {
         bwr $$0;
         if (this.fJ()) {
            $$0 = bwr.b;
         } else if (this.fR()) {
            $$0 = bwr.c;
         } else if (this.ck()) {
            $$0 = bwr.d;
         } else if (this.fv()) {
            $$0 = bwr.e;
         } else if (this.cd() && !this.i.b) {
            $$0 = bwr.f;
         } else {
            $$0 = bwr.a;
         }

         bwr $$6;
         if (this.aa_() || this.bZ() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bwr.f)) {
            $$6 = bwr.f;
         } else {
            $$6 = bwr.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bwr $$0) {
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
      this.C((float)this.h(bxn.v));
      float $$1;
      if (this.aJ() && !this.eF() && !this.ck()) {
         $$1 = Math.min(0.1F, (float)this.dz().i());
      } else {
         $$1 = 0.0F;
      }

      this.ch = this.ch + ($$1 - this.ch) * 0.4F;
      if (this.eE() > 0.0F && !this.aa_()) {
         fbs $$2;
         if (this.bZ() && !this.dl().dR()) {
            $$2 = this.cR().b(this.dl().cR()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cR().c(1.0, 0.5, 1.0);
         }

         List<bvj> $$4 = this.dW().a_(this, $$2);
         List<bvj> $$5 = Lists.newArrayList();

         for (bvj $$6 : $$4) {
            if ($$6.aq() == bvq.W) {
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
         bvq.a($$1).filter($$0x -> $$0x == bvq.aP).ifPresent($$0x -> {
            if (!cim.a(this.dW(), this)) {
               this.dW().a(null, this.dB(), this.dD(), this.dH(), cim.a(this.dW(), this.dW().A), this.dn(), 1.0F, cim.a(this.dW().A));
            }
         });
      }
   }

   private void d(bvj $$0) {
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

   public void a(int $$0, float $$1, cxo $$2) {
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
   public cxo ea() {
      return this.fv() && this.bE != null ? this.bE : super.ea();
   }

   @Override
   public void a(btz $$0) {
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
      if (!$$0.N().b(dhd.d)) {
         this.ge();
         this.g.k();
      }
   }

   protected void ge() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cxo $$1 = this.g.a($$0);
         if (!$$1.f() && dea.a($$1, ddz.D)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected axe e(btz $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected axe o_() {
      return axf.uE;
   }

   @Override
   public void g(cxo $$0) {
   }

   @Nullable
   public cma a(cxo $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cma a(cxo $$0, boolean $$1, boolean $$2) {
      if (!$$0.f() && this.dW().C) {
         this.a(bth.a);
      }

      return null;
   }

   public float c(dxu $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(bxn.t);
      }

      if (bup.a(this)) {
         $$1 *= 1.0F + (float)(bup.b(this) + 1) * 0.2F;
      }

      if (this.b(buq.d)) {
         float $$2 = switch (this.c(buq.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.h(bxn.f);
      if (this.a(aya.a)) {
         $$1 *= (float)this.g(bxn.C).g();
      }

      if (!this.aJ()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dxu $$0) {
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
      this.g(bxn.v).a((double)this.i.b());
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
         fbx.a.parse(vl.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(a::error).ifPresent($$0x -> this.cx = $$0x);
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
         $$0.a("current_explosion_impact_pos", (vu)fbx.a.encodeStart(vl.a, this.cx).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cF);
      $$0.a("current_impulse_context_reset_grace_time", this.cG);
   }

   @Override
   public boolean a(ash $$0, btz $$1) {
      if (super.a($$0, $$1)) {
         return true;
      } else if ($$1.a(axw.n)) {
         return !$$0.N().b(dhd.H);
      } else if ($$1.a(axw.m)) {
         return !$$0.N().b(dhd.I);
      } else if ($$1.a(axw.i)) {
         return !$$0.N().b(dhd.J);
      } else {
         return $$1.a(axw.o) ? !$$0.N().b(dhd.K) : false;
      }
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
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
               if ($$0.al() == btf.a) {
                  $$2 = 0.0F;
               }

               if ($$0.al() == btf.b) {
                  $$2 = Math.min($$2 / 2.0F + 1.0F, $$2);
               }

               if ($$0.al() == btf.d) {
                  $$2 = $$2 * 3.0F / 2.0F;
               }
            }

            return $$2 == 0.0F ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void d(bwf $$0) {
      super.d($$0);
      cxo $$1 = this.fH();
      if ($$0.fU() && $$1 != null) {
         this.h($$1);
      }
   }

   @Override
   public boolean ex() {
      return !this.gj().a && super.ex();
   }

   public boolean a(cpw $$0) {
      fde $$1 = this.cr();
      fde $$2 = $$0.cr();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void c(btz $$0, float $$1) {
      this.a($$0, $$1, new bvr[]{bvr.c, bvr.d, bvr.e, bvr.f});
   }

   @Override
   protected void d(btz $$0, float $$1) {
      this.a($$0, $$1, new bvr[]{bvr.f});
   }

   @Override
   protected void z(float $$0) {
      if (this.bz.a(cxs.wi)) {
         if (!this.dW().C) {
            this.b(axp.c.b(this.bz.h()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + bae.d($$0);
            bth $$2 = this.fA();
            this.bz.a($$1, this, d($$2));
            if (this.bz.f()) {
               if ($$2 == bth.a) {
                  this.a(bvr.a, cxo.j);
               } else {
                  this.a(bvr.b, cxo.j);
               }

               this.bz = cxo.j;
               this.a(axf.wY, 0.8F, 0.8F + this.dW().A.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void b(ash $$0, btz $$1, float $$2) {
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

            this.a(ecq.o);
         }
      }
   }

   public boolean aa() {
      return false;
   }

   public void a(dwj $$0, boolean $$1) {
   }

   public void a(dgh $$0) {
   }

   public void a(dvg $$0) {
   }

   public void a(dwo $$0) {
   }

   public void a(dvz $$0) {
   }

   public void a(cka $$0, btb $$1) {
   }

   public OptionalInt a(@Nullable btk $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dgf $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cxo $$0, bth $$1) {
   }

   public bti a(bvj $$0, bth $$1) {
      if (this.aa_()) {
         if ($$0 instanceof btk) {
            this.a((btk)$$0);
         }

         return bti.e;
      } else {
         cxo $$2 = this.b($$1);
         cxo $$3 = $$2.v();
         bti $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.i.d && $$2 == this.b($$1) && $$2.L() < $$3.L()) {
               $$2.e($$3.L());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof bwf) {
               if (this.i.d) {
                  $$2 = $$3;
               }

               bti $$5 = $$2.a(this, (bwf)$$0, $$1);
               if ($$5.a()) {
                  this.dW().a(ecq.r, $$0.du(), ecq.a.a(this));
                  if ($$2.f() && !this.i.d) {
                     this.a($$1, cxo.j);
                  }

                  return $$5;
               }
            }

            return bti.e;
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
   protected fbx a(fbx $$0, bwj $$1) {
      float $$2 = this.dQ();
      if (!this.i.b && !($$0.e > 0.0) && ($$1 == bwj.a || $$1 == bwj.b) && this.ga() && this.I($$2)) {
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

         return new fbx($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean I(float $$0) {
      return this.aJ() || this.Z < $$0 && !this.b(0.0, 0.0, $$0 - this.Z);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      fbs $$3 = this.cR();
      return this.dW().a(this, new fbs($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(bvj $$0) {
      if ($$0.cB()) {
         if (!$$0.v(this)) {
            float $$1 = this.fv() ? this.bD : (float)this.h(bxn.c);
            cxo $$2 = this.ea();
            btz $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.dX().a(this));
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.H(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gD();
            if ($$0.aq().a(axy.H) && $$0 instanceof cqp $$6 && $$6.a(cqq.c, this, this, true)) {
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
                  && !this.b(buq.o)
                  && !this.bZ()
                  && $$0 instanceof bwf
                  && !this.cj();
               if ($$10) {
                  $$1 *= 1.5F;
               }

               float $$11 = $$1 + $$4;
               boolean $$12 = false;
               if ($$7 && !$$10 && !$$8 && this.aJ()) {
                  double $$13 = this.ah().j();
                  double $$14 = (double)this.fp() * 2.5;
                  if ($$13 < bae.k($$14) && this.b(bth.a).a(ayd.bJ)) {
                     $$12 = true;
                  }
               }

               float $$15 = 0.0F;
               if ($$0 instanceof bwf $$16) {
                  $$15 = $$16.eE();
               }

               fbx $$17 = $$0.dz();
               boolean $$18 = $$0.b($$3, $$11);
               if ($$18) {
                  float $$19 = this.a($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                  if ($$19 > 0.0F) {
                     if ($$0 instanceof bwf $$20) {
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
                     float $$21 = 1.0F + (float)this.h(bxn.D) * $$1;

                     for (bwf $$23 : this.dW().a(bwf.class, $$0.cR().c(1.0, 0.25, 1.0))) {
                        if ($$23 != this && $$23 != $$0 && !this.s($$23) && (!($$23 instanceof clp) || !((clp)$$23).x()) && this.g((bvj)$$23) < 9.0) {
                           float $$24 = this.a($$23, $$21, $$3) * $$5;
                           $$23.p(0.4F, (double)bae.a(this.dM() * (float) (Math.PI / 180.0)), (double)(-bae.b(this.dM() * (float) (Math.PI / 180.0))));
                           $$23.a($$3, $$24);
                           if (this.dW() instanceof ash $$25) {
                              dea.a($$25, (bvj)$$23, $$3);
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
                  bvj $$26 = $$0;
                  if ($$0 instanceof ckq) {
                     $$26 = ((ckq)$$0).a;
                  }

                  boolean $$27 = false;
                  if (this.dW() instanceof ash $$28) {
                     if ($$26 instanceof bwf $$29) {
                        $$27 = $$2.a($$29, this);
                     }

                     dea.a($$28, $$0, $$3);
                  }

                  if (!this.dW().C && !$$2.f() && $$26 instanceof bwf) {
                     if ($$27) {
                        $$2.b((bwf)$$26, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.eZ()) {
                           this.a(bth.a, cxo.j);
                        } else {
                           this.a(bth.b, cxo.j);
                        }
                     }
                  }

                  if ($$0 instanceof bwf) {
                     float $$30 = $$15 - ((bwf)$$0).eE();
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

   protected float a(bvj $$0, float $$1, btz $$2) {
      return $$1;
   }

   @Override
   protected void g(bwf $$0) {
      this.e($$0);
   }

   public void h(cxo $$0) {
      this.gE().a($$0, 100);
      this.fF();
      this.dW().a(this, (byte)30);
   }

   public void b(bvj $$0) {
   }

   @Override
   public void c(bvj $$0) {
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
   public void a(bvj.d $$0) {
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

   public cpv gi() {
      return this.g;
   }

   public cps gj() {
      return this.i;
   }

   @Override
   public boolean fV() {
      return this.i.d;
   }

   public void a(cxo $$0, cxo $$1, ctl $$2) {
   }

   public boolean gk() {
      return this.cd != this.cc;
   }

   public boolean gl() {
      return true;
   }

   public Either<cpw.a, bbk> a(jh $$0) {
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

   public int a(Collection<dci<?>> $$0) {
      return 0;
   }

   public void a(dci<?> $$0, List<cxo> $$1) {
   }

   public void b(List<aly<dcd<?>>> $$0) {
   }

   public int b(Collection<dci<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(fbx $$0) {
      if (this.bZ()) {
         super.a_($$0);
      } else {
         if (this.ck()) {
            double $$1 = this.bT().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bn || !this.dW().b_(jh.a(this.dB(), this.dD() + 1.0 - 0.1, this.dH())).c()) {
               fbx $$3 = this.dz();
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
      return (float)this.h(bxn.v);
   }

   @Override
   public boolean a(float $$0, float $$1, btz $$2) {
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
   protected void b(jh $$0, dxu $$1) {
      if (this.bj()) {
         this.aY();
         this.b($$1);
      } else {
         jh $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dxu $$3 = this.dW().a_($$2);
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
   public bwf.a eM() {
      return new bwf.a(axf.uL, axf.uB);
   }

   @Override
   public boolean a(ash $$0, bwf $$1) {
      this.b(axp.g.b($$1.aq()));
      return true;
   }

   @Override
   public void a(dxu $$0, fbx $$1) {
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

   public void a(cxo $$0, int $$1) {
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

   public Optional<cpb> ac() {
      return Optional.empty();
   }

   public csx gt() {
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

   public boolean a(jh $$0, jm $$1, cxo $$2) {
      if (this.i.e) {
         return true;
      } else {
         jh $$3 = $$0.a($$1.g());
         dxy $$4 = new dxy(this.dW(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int e(ash $$0) {
      return !$$0.N().b(dhd.d) && !this.aa_() ? Math.min(this.cq * 7, 100) : 0;
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
   protected bvj.c bg() {
      return this.i.b || this.aJ() && this.cg() ? bvj.c.a : bvj.c.d;
   }

   public void x() {
   }

   @Override
   public xv al() {
      return xv.b(this.k.getName());
   }

   public cup gw() {
      return this.cb;
   }

   @Override
   public cxo a(bvr $$0) {
      if ($$0 == bvr.a) {
         return this.g.f();
      } else if ($$0 == bvr.b) {
         return this.g.i.getFirst();
      } else {
         return $$0.a() == bvr.a.b ? this.g.h.get($$0.b()) : cxo.j;
      }
   }

   @Override
   protected boolean b(bvr $$0) {
      return $$0.a() == bvr.a.b;
   }

   @Override
   public void a(bvr $$0, cxo $$1) {
      this.c($$1);
      if ($$0 == bvr.a) {
         this.a($$0, this.g.g.set(this.g.j, $$1), $$1);
      } else if ($$0 == bvr.b) {
         this.a($$0, this.g.i.set(0, $$1), $$1);
      } else if ($$0.a() == bvr.a.b) {
         this.a($$0, this.g.h.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cxo $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<cxo> fc() {
      return Lists.newArrayList(new cxo[]{this.eZ(), this.fa()});
   }

   @Override
   public Iterable<cxo> fb() {
      return this.g.h;
   }

   @Override
   public boolean e(bvr $$0) {
      return $$0 != bvr.g;
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
         bvq.a($$0, this.dW(), bvp.r).ifPresent($$0x -> {
            if ($$0x instanceof bxc) {
               ((bxc)$$0x).b(this.at);
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

   public fdc gy() {
      return this.dW().Q();
   }

   @Override
   public xv p_() {
      yj $$0 = fcx.a(this.cr(), this.al());
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

   public boolean a(cpx $$0) {
      return (this.au().a(bX) & $$0.a()) == $$0.a();
   }

   @Override
   public bwx a_(int $$0) {
      if ($$0 == 499) {
         return new bwx() {
            @Override
            public cxo a() {
               return cpw.this.cd.g();
            }

            @Override
            public boolean a(cxo $$0) {
               cpw.this.cd.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bwx() {
               @Override
               public cxo a() {
                  return cpw.this.cc.r().a($$1);
               }

               @Override
               public boolean a(cxo $$0) {
                  cpw.this.cc.r().a($$1, $$0);
                  cpw.this.cc.a(cpw.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.g.size()) {
            return bwx.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.cb.b() ? bwx.a(this.cb, $$2) : super.a_($$0);
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
   public bvz fy() {
      return this.al.a(bY) == 0 ? bvz.a : bvz.b;
   }

   public void b(bvz $$0) {
      this.al.a(bY, (byte)($$0 == bvz.a ? 0 : 1));
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
      return (float)(1.0 / this.h(bxn.e) * 20.0);
   }

   public float H(float $$0) {
      return bae.a(((float)this.aS + $$0) / this.gC(), 0.0F, 1.0F);
   }

   public void gD() {
      this.aS = 0;
   }

   public cxl gE() {
      return this.cD;
   }

   @Override
   protected float aT() {
      return !this.i.b && !this.fJ() ? super.aT() : 1.0F;
   }

   public float gF() {
      return (float)this.h(bxn.q);
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
   public bvm e(bwr $$0) {
      return c.getOrDefault($$0, bW);
   }

   @Override
   public ImmutableList<bwr> fO() {
      return ImmutableList.of(bwr.a, bwr.f, bwr.d);
   }

   @Override
   public cxo d(cxo $$0) {
      if (!($$0.h() instanceof cyk)) {
         return cxo.j;
      } else {
         Predicate<cxo> $$1 = ((cyk)$$0.h()).d();
         cxo $$2 = cyk.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((cyk)$$0.h()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cxo $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.i.d ? new cxo(cxs.oS) : cxo.j;
         }
      }
   }

   @Override
   public fbx u(float $$0) {
      double $$1 = 0.22 * (this.fy() == bvz.b ? -1.0 : 1.0);
      float $$2 = bae.h($$0 * 0.5F, this.dO(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = bae.h($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      if (this.fJ() || this.fv()) {
         fbx $$4 = this.g($$0);
         fbx $$5 = this.dz();
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

         return this.o($$0).e(new fbx($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cl()) {
         return this.o($$0).e(new fbx($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cR().c() - 1.0;
         double $$13 = this.ci() ? -0.2 : 0.07;
         return this.o($$0).e(new fbx($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dV() {
      return true;
   }

   public boolean gH() {
      return this.fz() && this.fB().a(cxs.rL);
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
      return this.h(bxn.g);
   }

   public double gK() {
      return this.h(bxn.j);
   }

   public boolean b(bvj $$0, double $$1) {
      return $$0.dR() ? false : this.a($$0.cR(), $$1);
   }

   public boolean a(fbs $$0, double $$1) {
      double $$2 = this.gK() + $$1;
      return $$0.e(this.bF()) < $$2 * $$2;
   }

   public boolean a(jh $$0, double $$1) {
      double $$2 = this.gJ() + $$1;
      return new fbs($$0).e(this.bF()) < $$2 * $$2;
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
