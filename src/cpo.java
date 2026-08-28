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

public abstract class cpo extends bvx {
   private static final Logger a = LogUtils.getLogger();
   public static final bvr bH = bvr.b;
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
   public static final fbr bV = new fbr(0.0, 0.6, 0.0);
   public static final bve bW = bve.b(0.6F, 1.8F).b(1.62F).a(bvd.a().a(bvc.b, bV));
   private static final Map<bwj, bve> c = ImmutableMap.builder()
      .put(bwj.a, bW)
      .put(bwj.c, aD)
      .put(bwj.b, bve.b(0.6F, 0.6F).b(0.4F))
      .put(bwj.d, bve.b(0.6F, 0.6F).b(0.4F))
      .put(bwj.e, bve.b(0.6F, 0.6F).b(0.4F))
      .put(bwj.f, bve.b(0.6F, 1.5F).b(1.27F).a(bvd.a().a(bvc.b, bV)))
      .put(bwj.h, bve.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final aks<Float> d = akw.a(cpo.class, aku.d);
   private static final aks<Integer> e = akw.a(cpo.class, aku.b);
   protected static final aks<Byte> bX = akw.a(cpo.class, aku.a);
   protected static final aks<Byte> bY = akw.a(cpo.class, aku.a);
   protected static final aks<um> bZ = akw.a(cpo.class, aku.t);
   protected static final aks<um> ca = akw.a(cpo.class, aku.t);
   private long f;
   final cpn g = new cpn(this);
   protected cuh cb = new cuh();
   public final ctw cc;
   public cst cd;
   protected csp ce = new csp();
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
   private final cpk i = new cpk();
   public int cq;
   public int cr;
   public float cs;
   protected int ct;
   protected final float cu = 0.02F;
   private int j;
   private final GameProfile k;
   private boolean cz;
   private cxg cC = cxg.j;
   private final cxd cD = this.g();
   private Optional<jp> cE = Optional.empty();
   @Nullable
   public cqd cv;
   protected float cw;
   @Nullable
   public fbr cx;
   @Nullable
   public bvb cy;
   private boolean cF;
   private int cG;

   public cpo(dgz $$0, jh $$1, float $$2, GameProfile $$3) {
      super(bvi.bS, $$0);
      this.a_($$3.getId());
      this.k = $$3;
      this.cc = new ctw(this.g, !$$0.C, this);
      this.cd = this.cc;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bk = 180.0F;
   }

   public boolean a(dgz $$0, jh $$1, dgw $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dgw.d) {
         return true;
      } else if (this.gv()) {
         return false;
      } else {
         cxg $$3 = this.eZ();
         return $$3.f() || !$$3.b(new dxs($$0, $$1, false));
      }
   }

   public static bxe.a fX() {
      return bvx.ee().a(bxf.c, 1.0).a(bxf.v, 0.1F).a(bxf.e).a(bxf.q).a(bxf.g, 4.5).a(bxf.j, 3.0).a(bxf.f).a(bxf.C).a(bxf.z).a(bxf.t).a(bxf.D);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(bX, (byte)0);
      $$0.a(bY, (byte)bH.b());
      $$0.a(bZ, new um());
      $$0.a(ca, new um());
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

         if (!this.dW().C && this.dW().V()) {
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
      if (this instanceof ary $$0) {
         this.ce.a($$0);
         this.a(axf.k);
         this.a(axf.l);
         if (this.bL()) {
            this.a(axf.m);
         }

         if (this.cg()) {
            this.a(axf.o);
         }

         if (!this.fR()) {
            this.a(axf.n);
         }
      }

      int $$1 = 29999999;
      double $$2 = azu.a(this.dB(), -2.9999999E7, 2.9999999E7);
      double $$3 = azu.a(this.dH(), -2.9999999E7, 2.9999999E7);
      if ($$2 != this.dB() || $$3 != this.dH()) {
         this.a_($$2, this.dD(), $$3);
      }

      this.aS++;
      cxg $$4 = this.eZ();
      if (!cxg.a(this.cC, $$4)) {
         if (!cxg.b(this.cC, $$4)) {
            this.gD();
         }

         this.cC = $$4.v();
      }

      if (!this.a(axq.a) && this.c(cxk.oT)) {
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
      this.cp = this.a(axq.a);
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
      this.a(new bug(bui.m, 200, 0, false, false, true));
   }

   private boolean c(cxc $$0) {
      for (bvj $$1 : bvj.i) {
         cxg $$2 = this.a($$1);
         dfl $$3 = $$2.a(ku.D);
         if ($$2.a($$0) && $$3 != null && $$3.a() == $$1) {
            return true;
         }
      }

      return false;
   }

   protected cxd g() {
      return new cxd();
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
      if (this.h(bwj.d)) {
         bwj $$0;
         if (this.fJ()) {
            $$0 = bwj.b;
         } else if (this.fR()) {
            $$0 = bwj.c;
         } else if (this.ck()) {
            $$0 = bwj.d;
         } else if (this.fv()) {
            $$0 = bwj.e;
         } else if (this.cd() && !this.i.b) {
            $$0 = bwj.f;
         } else {
            $$0 = bwj.a;
         }

         bwj $$6;
         if (this.aa_() || this.bZ() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bwj.f)) {
            $$6 = bwj.f;
         } else {
            $$6 = bwj.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bwj $$0) {
      return this.dW().a(this, this.a($$0).a(this.du()).h(1.0E-7));
   }

   @Override
   protected awu aV() {
      return awv.uU;
   }

   @Override
   protected awu aW() {
      return awv.uS;
   }

   @Override
   protected awu aX() {
      return awv.uT;
   }

   @Override
   public int bX() {
      return 10;
   }

   @Override
   public void a(awu $$0, float $$1, float $$2) {
      this.dW().a(this, this.dB(), this.dD(), this.dH(), $$0, this.dn(), $$1, $$2);
   }

   public void a(awu $$0, aww $$1, float $$2, float $$3) {
   }

   @Override
   public aww dn() {
      return aww.h;
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
      this.C((float)this.h(bxf.v));
      float $$1;
      if (this.aJ() && !this.eF() && !this.ck()) {
         $$1 = Math.min(0.1F, (float)this.dz().i());
      } else {
         $$1 = 0.0F;
      }

      this.ch = this.ch + ($$1 - this.ch) * 0.4F;
      if (this.eE() > 0.0F && !this.aa_()) {
         fbm $$2;
         if (this.bZ() && !this.dl().dR()) {
            $$2 = this.cR().b(this.dl().cR()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cR().c(1.0, 0.5, 1.0);
         }

         List<bvb> $$4 = this.dW().a_(this, $$2);
         List<bvb> $$5 = Lists.newArrayList();

         for (bvb $$6 : $$4) {
            if ($$6.aq() == bvi.W) {
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

   private void c(@Nullable um $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dW().A.a(200) == 0) {
         String $$1 = $$0.l("id");
         bvi.a($$1).filter($$0x -> $$0x == bvi.aP).ifPresent($$0x -> {
            if (!cie.a(this.dW(), this)) {
               this.dW().a(null, this.dB(), this.dD(), this.dH(), cie.a(this.dW(), this.dW().A), this.dn(), 1.0F, cie.a(this.dW().A));
            }
         });
      }
   }

   private void d(bvb $$0) {
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

   public void a(int $$0, float $$1, cxg $$2) {
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
   public cxg ea() {
      return this.fv() && this.bE != null ? this.bE : super.ea();
   }

   @Override
   public void a(btr $$0) {
      super.a($$0);
      this.ay();
      if (!this.aa_() && this.dW() instanceof arx $$1) {
         this.b($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-azu.b((this.eK() + this.dM()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-azu.a((this.eK() + this.dM()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(axf.N);
      this.a(axf.i.b(axf.m));
      this.a(axf.i.b(axf.n));
      this.aH();
      this.c(false);
      this.c(Optional.of(jp.a(this.dW().ai(), this.dw())));
   }

   @Override
   protected void f(arx $$0) {
      super.f($$0);
      if (!$$0.O().b(dgv.d)) {
         this.ge();
         this.g.k();
      }
   }

   protected void ge() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cxg $$1 = this.g.a($$0);
         if (!$$1.f() && dds.a($$1, ddr.D)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected awu e(btr $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected awu o_() {
      return awv.uK;
   }

   @Override
   public void g(cxg $$0) {
   }

   @Nullable
   public cls a(cxg $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cls a(cxg $$0, boolean $$1, boolean $$2) {
      if (!$$0.f() && this.dW().C) {
         this.a(bsz.a);
      }

      return null;
   }

   public float c(dxo $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(bxf.t);
      }

      if (buh.a(this)) {
         $$1 *= 1.0F + (float)(buh.b(this) + 1) * 0.2F;
      }

      if (this.b(bui.d)) {
         float $$2 = switch (this.c(bui.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.h(bxf.f);
      if (this.a(axq.a)) {
         $$1 *= (float)this.g(bxf.C).g();
      }

      if (!this.aJ()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dxo $$0) {
      return !$$0.C() || this.g.f().b($$0);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.a_(this.k.getId());
      us $$1 = $$0.c("Inventory", 10);
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
      this.g(bxf.v).a((double)this.i.b());
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
         this.c(jp.b.parse(va.a, $$0.c("LastDeathLocation")).resultOrPartial(a::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         fbr.a.parse(va.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(a::error).ifPresent($$0x -> this.cx = $$0x);
      }

      this.cF = $$0.q("ignore_fall_damage_from_current_explosion");
      this.cG = $$0.h("current_impulse_context_reset_grace_time");
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      vb.e($$0);
      $$0.a("Inventory", this.g.a(new us()));
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

      this.gI().flatMap($$0x -> jp.b.encodeStart(va.a, $$0x).resultOrPartial(a::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cx != null) {
         $$0.a("current_explosion_impact_pos", (vj)fbr.a.encodeStart(va.a, this.cx).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cF);
      $$0.a("current_impulse_context_reset_grace_time", this.cG);
   }

   @Override
   public boolean a(arx $$0, btr $$1) {
      if (super.a($$0, $$1)) {
         return true;
      } else if ($$1.a(axm.n)) {
         return !$$0.O().b(dgv.H);
      } else if ($$1.a(axm.m)) {
         return !$$0.O().b(dgv.I);
      } else if ($$1.a(axm.i)) {
         return !$$0.O().b(dgv.J);
      } else {
         return $$1.a(axm.o) ? !$$0.O().b(dgv.K) : false;
      }
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.i.a && !$$1.a(axm.d)) {
         return false;
      } else {
         this.bf = 0;
         if (this.eF()) {
            return false;
         } else {
            this.gx();
            if ($$1.g()) {
               if ($$0.am() == bsx.a) {
                  $$2 = 0.0F;
               }

               if ($$0.am() == bsx.b) {
                  $$2 = Math.min($$2 / 2.0F + 1.0F, $$2);
               }

               if ($$0.am() == bsx.d) {
                  $$2 = $$2 * 3.0F / 2.0F;
               }
            }

            return $$2 == 0.0F ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void d(bvx $$0) {
      super.d($$0);
      cxg $$1 = this.fH();
      if ($$0.fU() && $$1 != null) {
         this.h($$1);
      }
   }

   @Override
   public boolean ex() {
      return !this.gj().a && super.ex();
   }

   public boolean a(cpo $$0) {
      fcy $$1 = this.cr();
      fcy $$2 = $$0.cr();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void c(btr $$0, float $$1) {
      this.a($$0, $$1, new bvj[]{bvj.c, bvj.d, bvj.e, bvj.f});
   }

   @Override
   protected void d(btr $$0, float $$1) {
      this.a($$0, $$1, new bvj[]{bvj.f});
   }

   @Override
   protected void z(float $$0) {
      if (this.bz.a(cxk.ws)) {
         if (!this.dW().C) {
            this.b(axf.c.b(this.bz.h()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + azu.d($$0);
            bsz $$2 = this.fA();
            this.bz.a($$1, this, d($$2));
            if (this.bz.f()) {
               if ($$2 == bsz.a) {
                  this.a(bvj.a, cxg.j);
               } else {
                  this.a(bvj.b, cxg.j);
               }

               this.bz = cxg.j;
               this.a(awv.xe, 0.8F, 0.8F + this.dW().A.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void b(arx $$0, btr $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var8 = Math.max($$2 - this.fw(), 0.0F);
         this.E(this.fw() - ($$2 - var8));
         float $$4 = $$2 - var8;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
            this.a(axf.L, Math.round($$4 * 10.0F));
         }

         if (var8 != 0.0F) {
            this.G($$1.a());
            this.eQ().a($$1, var8);
            this.x(this.eE() - var8);
            if (var8 < 3.4028235E37F) {
               this.a(axf.J, Math.round(var8 * 10.0F));
            }

            this.a(eck.o);
         }
      }
   }

   public boolean aa() {
      return false;
   }

   public void a(dwd $$0, boolean $$1) {
   }

   public void a(dfz $$0) {
   }

   public void a(dva $$0) {
   }

   public void a(dwi $$0) {
   }

   public void a(dvt $$0) {
   }

   public void a(cjs $$0, bst $$1) {
   }

   public OptionalInt a(@Nullable btc $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dfx $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cxg $$0, bsz $$1) {
   }

   public bta a(bvb $$0, bsz $$1) {
      if (this.aa_()) {
         if ($$0 instanceof btc) {
            this.a((btc)$$0);
         }

         return bta.e;
      } else {
         cxg $$2 = this.b($$1);
         cxg $$3 = $$2.v();
         bta $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.i.d && $$2 == this.b($$1) && $$2.M() < $$3.M()) {
               $$2.e($$3.M());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof bvx) {
               if (this.i.d) {
                  $$2 = $$3;
               }

               bta $$5 = $$2.a(this, (bvx)$$0, $$1);
               if ($$5.a()) {
                  this.dW().a(eck.r, $$0.du(), eck.a.a(this));
                  if ($$2.f() && !this.i.d) {
                     this.a($$1, cxg.j);
                  }

                  return $$5;
               }
            }

            return bta.e;
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
   protected fbr a(fbr $$0, bwb $$1) {
      float $$2 = this.dQ();
      if (!this.i.b && !($$0.e > 0.0) && ($$1 == bwb.a || $$1 == bwb.b) && this.ga() && this.I($$2)) {
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

         return new fbr($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean I(float $$0) {
      return this.aJ() || this.Z < $$0 && !this.b(0.0, 0.0, $$0 - this.Z);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      fbm $$3 = this.cR();
      return this.dW().a(this, new fbm($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(bvb $$0) {
      if ($$0.cB()) {
         if (!$$0.v(this)) {
            float $$1 = this.fv() ? this.bD : (float)this.h(bxf.c);
            cxg $$2 = this.ea();
            btr $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.dX().a(this));
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.H(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gD();
            if ($$0.aq().a(axo.H) && $$0 instanceof cqh $$6 && $$6.a(cqi.c, this, this, true)) {
               this.dW().a(null, this.dB(), this.dD(), this.dH(), awv.uD, this.dn());
               return;
            }

            if ($$1 > 0.0F || $$4 > 0.0F) {
               boolean $$7 = $$5 > 0.9F;
               boolean $$8;
               if (this.cj() && $$7) {
                  this.dW().a(null, this.dB(), this.dD(), this.dH(), awv.uC, this.dn(), 1.0F, 1.0F);
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
                  && !this.b(bui.o)
                  && !this.bZ()
                  && $$0 instanceof bvx
                  && !this.cj();
               if ($$10) {
                  $$1 *= 1.5F;
               }

               float $$11 = $$1 + $$4;
               boolean $$12 = false;
               if ($$7 && !$$10 && !$$8 && this.aJ()) {
                  double $$13 = this.ah().j();
                  double $$14 = (double)this.fp() * 2.5;
                  if ($$13 < azu.k($$14) && this.b(bsz.a).a(axt.bJ)) {
                     $$12 = true;
                  }
               }

               float $$15 = 0.0F;
               if ($$0 instanceof bvx $$16) {
                  $$15 = $$16.eE();
               }

               fbr $$17 = $$0.dz();
               boolean $$18 = $$0.b($$3, $$11);
               if ($$18) {
                  float $$19 = this.a($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                  if ($$19 > 0.0F) {
                     if ($$0 instanceof bvx $$20) {
                        $$20.p(
                           (double)($$19 * 0.5F), (double)azu.a(this.dM() * (float) (Math.PI / 180.0)), (double)(-azu.b(this.dM() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.j(
                           (double)(-azu.a(this.dM() * (float) (Math.PI / 180.0)) * $$19 * 0.5F),
                           0.1,
                           (double)(azu.b(this.dM() * (float) (Math.PI / 180.0)) * $$19 * 0.5F)
                        );
                     }

                     this.h(this.dz().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$12) {
                     float $$21 = 1.0F + (float)this.h(bxf.D) * $$1;

                     for (bvx $$23 : this.dW().a(bvx.class, $$0.cR().c(1.0, 0.25, 1.0))) {
                        if ($$23 != this && $$23 != $$0 && !this.s($$23) && (!($$23 instanceof clh) || !((clh)$$23).x()) && this.g((bvb)$$23) < 9.0) {
                           float $$24 = this.a($$23, $$21, $$3) * $$5;
                           $$23.p(0.4F, (double)azu.a(this.dM() * (float) (Math.PI / 180.0)), (double)(-azu.b(this.dM() * (float) (Math.PI / 180.0))));
                           $$23.a($$3, $$24);
                           if (this.dW() instanceof arx $$25) {
                              dds.a($$25, (bvb)$$23, $$3);
                           }
                        }
                     }

                     this.dW().a(null, this.dB(), this.dD(), this.dH(), awv.uF, this.dn(), 1.0F, 1.0F);
                     this.gf();
                  }

                  if ($$0 instanceof ary && $$0.T) {
                     ((ary)$$0).f.b(new afs($$0));
                     $$0.T = false;
                     $$0.h($$17);
                  }

                  if ($$10) {
                     this.dW().a(null, this.dB(), this.dD(), this.dH(), awv.uB, this.dn(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$10 && !$$12) {
                     if ($$7) {
                        this.dW().a(null, this.dB(), this.dD(), this.dH(), awv.uE, this.dn(), 1.0F, 1.0F);
                     } else {
                        this.dW().a(null, this.dB(), this.dD(), this.dH(), awv.uG, this.dn(), 1.0F, 1.0F);
                     }
                  }

                  if ($$4 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  bvb $$26 = $$0;
                  if ($$0 instanceof cki) {
                     $$26 = ((cki)$$0).a;
                  }

                  boolean $$27 = false;
                  if (this.dW() instanceof arx $$28) {
                     if ($$26 instanceof bvx $$29) {
                        $$27 = $$2.a($$29, this);
                     }

                     dds.a($$28, $$0, $$3);
                  }

                  if (!this.dW().C && !$$2.f() && $$26 instanceof bvx) {
                     if ($$27) {
                        $$2.b((bvx)$$26, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.eZ()) {
                           this.a(bsz.a, cxg.j);
                        } else {
                           this.a(bsz.b, cxg.j);
                        }
                     }
                  }

                  if ($$0 instanceof bvx) {
                     float $$30 = $$15 - ((bvx)$$0).eE();
                     this.a(axf.G, Math.round($$30 * 10.0F));
                     if (this.dW() instanceof arx && $$30 > 2.0F) {
                        int $$31 = (int)((double)$$30 * 0.5);
                        ((arx)this.dW()).a(ls.g, $$0.dB(), $$0.e(0.5), $$0.dH(), $$31, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.G(0.1F);
               } else {
                  this.dW().a(null, this.dB(), this.dD(), this.dH(), awv.uD, this.dn(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(bvb $$0, float $$1, btr $$2) {
      return $$1;
   }

   @Override
   protected void g(bvx $$0) {
      this.e($$0);
   }

   public void h(cxg $$0) {
      this.gE().a($$0, 100);
      this.fF();
      this.dW().a(this, (byte)30);
   }

   public void b(bvb $$0) {
   }

   @Override
   public void c(bvb $$0) {
   }

   public void gf() {
      double $$0 = (double)(-azu.a(this.dM() * (float) (Math.PI / 180.0)));
      double $$1 = (double)azu.b(this.dM() * (float) (Math.PI / 180.0));
      if (this.dW() instanceof arx) {
         ((arx)this.dW()).a(ls.al, this.dB() + $$0, this.e(0.5), this.dH() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void gg() {
   }

   @Override
   public void a(bvb.d $$0) {
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

   public cpn gi() {
      return this.g;
   }

   public cpk gj() {
      return this.i;
   }

   @Override
   public boolean fV() {
      return this.i.d;
   }

   public void a(cxg $$0, cxg $$1, ctd $$2) {
   }

   public boolean gk() {
      return this.cd != this.cc;
   }

   public boolean gl() {
      return true;
   }

   public Either<cpo.a, bba> a(jh $$0) {
      this.b($$0);
      this.h = 0;
      return Either.right(bba.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fS();
      if (this.dW() instanceof arx && $$1) {
         ((arx)this.dW()).f();
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

   public void a(xk $$0, boolean $$1) {
   }

   public void a(alp $$0) {
      this.b(axf.i.b($$0));
   }

   public void a(alp $$0, int $$1) {
      this.a(axf.i.b($$0), $$1);
   }

   public void b(axc<?> $$0) {
      this.a($$0, 1);
   }

   public void a(axc<?> $$0, int $$1) {
   }

   public void a(axc<?> $$0) {
   }

   public int a(Collection<dca<?>> $$0) {
      return 0;
   }

   public void a(dca<?> $$0, List<cxg> $$1) {
   }

   public void b(List<alo<dbv<?>>> $$0) {
   }

   public int b(Collection<dca<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(fbr $$0) {
      if (this.bZ()) {
         super.a_($$0);
      } else {
         if (this.ck()) {
            double $$1 = this.bT().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bn || !this.dW().b_(jh.a(this.dB(), this.dD() + 1.0 - 0.1, this.dH())).c()) {
               fbr $$3 = this.dz();
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
      return (float)this.h(bxf.v);
   }

   @Override
   public boolean a(float $$0, float $$1, btr $$2) {
      if (this.i.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(axf.t, (int)Math.round((double)$$0 * 100.0));
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
   protected void b(jh $$0, dxo $$1) {
      if (this.bj()) {
         this.aY();
         this.b($$1);
      } else {
         jh $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dxo $$3 = this.dW().a_($$2);
            if ($$3.a(axk.bq)) {
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
   public bvx.a eM() {
      return new bvx.a(awv.uR, awv.uH);
   }

   @Override
   public boolean a(arx $$0, bvx $$1) {
      this.b(axf.g.b($$1.aq()));
      return true;
   }

   @Override
   public void a(dxo $$0, fbr $$1) {
      if (!this.i.b) {
         super.a($$0, $$1);
      }

      this.gM();
   }

   public void d(int $$0) {
      this.r($$0);
      this.cs = this.cs + (float)$$0 / (float)this.gs();
      this.cr = azu.a(this.cr + $$0, 0, Integer.MAX_VALUE);

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

   public void a(cxg $$0, int $$1) {
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
         this.dW().a(null, this.dB(), this.dD(), this.dH(), awv.uQ, this.dn(), $$1 * 0.75F, 1.0F);
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

   public Optional<cot> ac() {
      return Optional.empty();
   }

   public csp gt() {
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

   public boolean a(jh $$0, jm $$1, cxg $$2) {
      if (this.i.e) {
         return true;
      } else {
         jh $$3 = $$0.a($$1.g());
         dxs $$4 = new dxs(this.dW(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int e(arx $$0) {
      return !$$0.O().b(dgv.d) && !this.aa_() ? Math.min(this.cq * 7, 100) : 0;
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
   protected bvb.c bg() {
      return this.i.b || this.aJ() && this.cg() ? bvb.c.a : bvb.c.d;
   }

   public void x() {
   }

   @Override
   public xk al() {
      return xk.b(this.k.getName());
   }

   public cuh gw() {
      return this.cb;
   }

   @Override
   public cxg a(bvj $$0) {
      if ($$0 == bvj.a) {
         return this.g.f();
      } else if ($$0 == bvj.b) {
         return this.g.i.getFirst();
      } else {
         return $$0.a() == bvj.a.b ? this.g.h.get($$0.b()) : cxg.j;
      }
   }

   @Override
   protected boolean b(bvj $$0) {
      return $$0.a() == bvj.a.b;
   }

   @Override
   public void a(bvj $$0, cxg $$1) {
      this.c($$1);
      if ($$0 == bvj.a) {
         this.a($$0, this.g.g.set(this.g.j, $$1), $$1);
      } else if ($$0 == bvj.b) {
         this.a($$0, this.g.i.set(0, $$1), $$1);
      } else if ($$0.a() == bvj.a.b) {
         this.a($$0, this.g.h.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cxg $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<cxg> fc() {
      return Lists.newArrayList(new cxg[]{this.eZ(), this.fa()});
   }

   @Override
   public Iterable<cxg> fb() {
      return this.g.h;
   }

   @Override
   public boolean e(bvj $$0) {
      return $$0 != bvj.g;
   }

   public boolean h(um $$0) {
      if (this.bZ() || !this.aJ() || this.bj() || this.av) {
         return false;
      } else if (this.gA().g()) {
         this.i($$0);
         this.f = this.dW().ad();
         return true;
      } else if (this.gB().g()) {
         this.j($$0);
         this.f = this.dW().ad();
         return true;
      } else {
         return false;
      }
   }

   protected void gx() {
      if (this.f + 20L < this.dW().ad()) {
         this.k(this.gA());
         this.i(new um());
         this.k(this.gB());
         this.j(new um());
      }
   }

   private void k(um $$0) {
      if (!this.dW().C && !$$0.g()) {
         bvi.a($$0, this.dW(), bvh.r).ifPresent($$0x -> {
            if ($$0x instanceof bwu) {
               ((bwu)$$0x).b(this.at);
            }

            $$0x.a_(this.dB(), this.dD() + 0.7F, this.dH());
            ((arx)this.dW()).c($$0x);
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

   public fcw gy() {
      return this.dW().R();
   }

   @Override
   public xk p_() {
      xy $$0 = fcr.a(this.cr(), this.al());
      return this.a($$0);
   }

   private xy a(xy $$0) {
      String $$1 = this.gh().getName();
      return $$0.a($$1x -> $$1x.a(new xi(xi.a.d, "/tell " + $$1 + " ")).a(this.cQ()).a($$1));
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

   public boolean a(cpp $$0) {
      return (this.au().a(bX) & $$0.a()) == $$0.a();
   }

   @Override
   public bwp a_(int $$0) {
      if ($$0 == 499) {
         return new bwp() {
            @Override
            public cxg a() {
               return cpo.this.cd.g();
            }

            @Override
            public boolean a(cxg $$0) {
               cpo.this.cd.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bwp() {
               @Override
               public cxg a() {
                  return cpo.this.cc.r().a($$1);
               }

               @Override
               public boolean a(cxg $$0) {
                  cpo.this.cc.r().a($$1, $$0);
                  cpo.this.cc.a(cpo.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.g.size()) {
            return bwp.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.cb.b() ? bwp.a(this.cb, $$2) : super.a_($$0);
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
   public bvr fy() {
      return this.al.a(bY) == 0 ? bvr.a : bvr.b;
   }

   public void b(bvr $$0) {
      this.al.a(bY, (byte)($$0 == bvr.a ? 0 : 1));
   }

   public um gA() {
      return this.al.a(bZ);
   }

   protected void i(um $$0) {
      this.al.a(bZ, $$0);
   }

   public um gB() {
      return this.al.a(ca);
   }

   protected void j(um $$0) {
      this.al.a(ca, $$0);
   }

   public float gC() {
      return (float)(1.0 / this.h(bxf.e) * 20.0);
   }

   public float H(float $$0) {
      return azu.a(((float)this.aS + $$0) / this.gC(), 0.0F, 1.0F);
   }

   public void gD() {
      this.aS = 0;
   }

   public cxd gE() {
      return this.cD;
   }

   @Override
   protected float aT() {
      return !this.i.b && !this.fJ() ? super.aT() : 1.0F;
   }

   public float gF() {
      return (float)this.h(bxf.q);
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
   public bve e(bwj $$0) {
      return c.getOrDefault($$0, bW);
   }

   @Override
   public ImmutableList<bwj> fO() {
      return ImmutableList.of(bwj.a, bwj.f, bwj.d);
   }

   @Override
   public cxg d(cxg $$0) {
      if (!($$0.h() instanceof cyc)) {
         return cxg.j;
      } else {
         Predicate<cxg> $$1 = ((cyc)$$0.h()).d();
         cxg $$2 = cyc.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((cyc)$$0.h()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cxg $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.i.d ? new cxg(cxk.pb) : cxg.j;
         }
      }
   }

   @Override
   public fbr u(float $$0) {
      double $$1 = 0.22 * (this.fy() == bvr.b ? -1.0 : 1.0);
      float $$2 = azu.h($$0 * 0.5F, this.dO(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = azu.h($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      if (this.fJ() || this.fv()) {
         fbr $$4 = this.g($$0);
         fbr $$5 = this.dz();
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

         return this.o($$0).e(new fbr($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cl()) {
         return this.o($$0).e(new fbr($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cR().c() - 1.0;
         double $$13 = this.ci() ? -0.2 : 0.07;
         return this.o($$0).e(new fbr($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dV() {
      return true;
   }

   public boolean gH() {
      return this.fz() && this.fB().a(cxk.rU);
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
      return this.h(bxf.g);
   }

   public double gK() {
      return this.h(bxf.j);
   }

   public boolean b(bvb $$0, double $$1) {
      return $$0.dR() ? false : this.a($$0.cR(), $$1);
   }

   public boolean a(fbm $$0, double $$1) {
      double $$2 = this.gK() + $$1;
      return $$0.e(this.bF()) < $$2 * $$2;
   }

   public boolean a(jh $$0, double $$1) {
      double $$2 = this.gJ() + $$1;
      return new fbm($$0).e(this.bF()) < $$2 * $$2;
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

   @Override
   public boolean q_() {
      return this.i.b ? false : super.q_();
   }

   public static enum a {
      a,
      b(xk.c("block.minecraft.bed.no_sleep")),
      c(xk.c("block.minecraft.bed.too_far_away")),
      d(xk.c("block.minecraft.bed.obstructed")),
      e,
      f(xk.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final xk g;

      private a() {
         this.g = null;
      }

      private a(final xk $$0) {
         this.g = $$0;
      }

      @Nullable
      public xk a() {
         return this.g;
      }
   }
}
