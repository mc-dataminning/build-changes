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

public abstract class cov extends bvf {
   private static final Logger a = LogUtils.getLogger();
   public static final buz bG = buz.b;
   public static final int bH = 0;
   public static final int bI = 20;
   public static final int bJ = 100;
   public static final int bK = 10;
   public static final int bL = 200;
   public static final int bM = 499;
   public static final int bN = 500;
   public static final float bO = 4.5F;
   public static final float bP = 3.0F;
   public static final float bQ = 1.5F;
   public static final float bR = 0.6F;
   public static final float bS = 0.6F;
   public static final float bT = 1.62F;
   private static final int b = 40;
   public static final fay bU = new fay(0.0, 0.6, 0.0);
   public static final bum bV = bum.b(0.6F, 1.8F).b(1.62F).a(bul.a().a(buk.b, bU));
   private static final Map<bvr, bum> c = ImmutableMap.builder()
      .put(bvr.a, bV)
      .put(bvr.c, aD)
      .put(bvr.b, bum.b(0.6F, 0.6F).b(0.4F))
      .put(bvr.d, bum.b(0.6F, 0.6F).b(0.4F))
      .put(bvr.e, bum.b(0.6F, 0.6F).b(0.4F))
      .put(bvr.f, bum.b(0.6F, 1.5F).b(1.27F).a(bul.a().a(buk.b, bU)))
      .put(bvr.h, bum.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final ajx<Float> d = akb.a(cov.class, ajz.d);
   private static final ajx<Integer> e = akb.a(cov.class, ajz.b);
   protected static final ajx<Byte> bW = akb.a(cov.class, ajz.a);
   protected static final ajx<Byte> bX = akb.a(cov.class, ajz.a);
   protected static final ajx<tq> bY = akb.a(cov.class, ajz.t);
   protected static final ajx<tq> bZ = akb.a(cov.class, ajz.t);
   public static final int ca = 60;
   private long f;
   final cou g = new cou(this);
   protected cto cb = new cto();
   public final ctd cc;
   public csa cd;
   protected crw ce = new crw();
   protected int cf;
   private boolean h = false;
   protected int cg = 60;
   public float ch;
   public float ci;
   public int cj;
   public double ck;
   public double cl;
   public double cm;
   public double cn;
   public double co;
   public double cp;
   private int i;
   protected boolean cq;
   private final cor j = new cor();
   public int cr;
   public int cs;
   public float ct;
   protected int cu;
   protected final float cv = 0.02F;
   private int k;
   private final GameProfile cC;
   private boolean cD;
   private cwn cE = cwn.j;
   private final cwk cF = this.g();
   private Optional<jq> cG = Optional.empty();
   @Nullable
   public cpk cw;
   protected float cx;
   @Nullable
   public fay cy;
   @Nullable
   public buj cz;
   private boolean cH;
   private int cI;

   public cov(dgg $$0, ji $$1, float $$2, GameProfile $$3) {
      super(buq.bR, $$0);
      this.a_($$3.getId());
      this.cC = $$3;
      this.cc = new ctd(this.g, !$$0.C, this);
      this.cd = this.cc;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bk = 180.0F;
   }

   public boolean a(dgg $$0, ji $$1, dgd $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dgd.d) {
         return true;
      } else if (this.gv()) {
         return false;
      } else {
         cwn $$3 = this.eZ();
         return $$3.f() || !$$3.b(new dwz($$0, $$1, false));
      }
   }

   public static bwm.a fX() {
      return bvf.ee().a(bwn.c, 1.0).a(bwn.v, 0.1F).a(bwn.e).a(bwn.q).a(bwn.g, 4.5).a(bwn.j, 3.0).a(bwn.f).a(bwn.C).a(bwn.z).a(bwn.t).a(bwn.D);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(bW, (byte)0);
      $$0.a(bX, (byte)bG.b());
      $$0.a(bY, new tq());
      $$0.a(bZ, new tq());
   }

   @Override
   public void h() {
      this.ad = this.Z_();
      if (this.Z_() || this.bZ()) {
         this.d(false);
      }

      if (this.cj > 0) {
         this.cj--;
      }

      if (this.fR()) {
         this.i++;
         if (this.i > 100) {
            this.i = 100;
         }

         if (!this.dW().C && this.dW().V()) {
            this.a(false, true);
         }
      } else if (this.i > 0) {
         this.i++;
         if (this.i >= 110) {
            this.i = 0;
         }
      }

      this.gb();
      super.h();
      if (!this.dW().C && this.cd != null && !this.cd.b(this)) {
         this.p();
         this.cd = this.cc;
      }

      this.t();
      if (this instanceof ard $$0) {
         this.ce.a($$0);
         this.a(awj.k);
         this.a(awj.l);
         if (this.bL()) {
            this.a(awj.m);
         }

         if (this.cg()) {
            this.a(awj.o);
         }

         if (!this.fR()) {
            this.a(awj.n);
         }
      }

      int $$1 = 29999999;
      double $$2 = ayy.a(this.dB(), -2.9999999E7, 2.9999999E7);
      double $$3 = ayy.a(this.dH(), -2.9999999E7, 2.9999999E7);
      if ($$2 != this.dB() || $$3 != this.dH()) {
         this.a_($$2, this.dD(), $$3);
      }

      this.aS++;
      cwn $$4 = this.eZ();
      if (!cwn.a(this.cE, $$4)) {
         if (!cwn.b(this.cE, $$4)) {
            this.gD();
         }

         this.cE = $$4.v();
      }

      if (!this.a(awu.a) && this.c(cwr.oT)) {
         this.m();
      }

      this.cF.a();
      this.gc();
      if (this.cI > 0) {
         this.cI--;
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
      this.cq = this.a(awu.a);
      return this.cq;
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
      this.a(new bto(btq.m, 200, 0, false, false, true));
   }

   private boolean c(cwj $$0) {
      for (bur $$1 : bur.i) {
         cwn $$2 = this.a($$1);
         des $$3 = $$2.a(kv.D);
         if ($$2.a($$0) && $$3 != null && $$3.a() == $$1) {
            return true;
         }
      }

      return false;
   }

   protected cwk g() {
      return new cwk();
   }

   private void t() {
      this.ck = this.cn;
      this.cl = this.co;
      this.cm = this.cp;
      double $$0 = this.dB() - this.cn;
      double $$1 = this.dD() - this.co;
      double $$2 = this.dH() - this.cp;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cn = this.dB();
         this.ck = this.cn;
      }

      if ($$2 > 10.0) {
         this.cp = this.dH();
         this.cm = this.cp;
      }

      if ($$1 > 10.0) {
         this.co = this.dD();
         this.cl = this.co;
      }

      if ($$0 < -10.0) {
         this.cn = this.dB();
         this.ck = this.cn;
      }

      if ($$2 < -10.0) {
         this.cp = this.dH();
         this.cm = this.cp;
      }

      if ($$1 < -10.0) {
         this.co = this.dD();
         this.cl = this.co;
      }

      this.cn += $$0 * 0.25;
      this.cp += $$2 * 0.25;
      this.co += $$1 * 0.25;
   }

   protected void gc() {
      if (this.h(bvr.d)) {
         bvr $$0;
         if (this.fJ()) {
            $$0 = bvr.b;
         } else if (this.fR()) {
            $$0 = bvr.c;
         } else if (this.ck()) {
            $$0 = bvr.d;
         } else if (this.fv()) {
            $$0 = bvr.e;
         } else if (this.cd() && !this.j.b) {
            $$0 = bvr.f;
         } else {
            $$0 = bvr.a;
         }

         bvr $$6;
         if (this.Z_() || this.bZ() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bvr.f)) {
            $$6 = bvr.f;
         } else {
            $$6 = bvr.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bvr $$0) {
      return this.dW().a(this, this.a($$0).a(this.du()).h(1.0E-7));
   }

   @Override
   protected avy aV() {
      return avz.uU;
   }

   @Override
   protected avy aW() {
      return avz.uS;
   }

   @Override
   protected avy aX() {
      return avz.uT;
   }

   @Override
   public int bX() {
      return 10;
   }

   @Override
   public void a(avy $$0, float $$1, float $$2) {
      this.dW().a(this, this.dB(), this.dD(), this.dH(), $$0, this.dn(), $$1, $$2);
   }

   public void a(avy $$0, awa $$1, float $$2, float $$3) {
   }

   @Override
   public awa dn() {
      return awa.h;
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
         this.cD = false;
      } else if ($$0 == 22) {
         this.cD = true;
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
         this.ch = this.ci;
         this.ci = 0.0F;
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
      this.ch = this.ci;
      if (this.j.b && !this.bZ()) {
         this.k();
      }

      super.d_();
      this.C((float)this.h(bwn.v));
      float $$1;
      if (this.aJ() && !this.eF() && !this.ck()) {
         $$1 = Math.min(0.1F, (float)this.dz().i());
      } else {
         $$1 = 0.0F;
      }

      this.ci = this.ci + ($$1 - this.ci) * 0.4F;
      if (this.eE() > 0.0F && !this.Z_()) {
         fat $$2;
         if (this.bZ() && !this.dl().dR()) {
            $$2 = this.cR().b(this.dl().cR()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cR().c(1.0, 0.5, 1.0);
         }

         List<buj> $$4 = this.dW().a_(this, $$2);
         List<buj> $$5 = Lists.newArrayList();

         for (buj $$6 : $$4) {
            if ($$6.aq() == buq.V) {
               $$5.add($$6);
            } else if (!$$6.dR()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(af.a($$5, this.ae));
         }
      }

      this.c(this.gA());
      this.c(this.gB());
      if (!this.dW().C && (this.Z > 0.5F || this.bj()) || this.j.b || this.fR() || this.av) {
         this.gx();
      }
   }

   protected void j() {
   }

   private void c(@Nullable tq $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dW().A.a(200) == 0) {
         String $$1 = $$0.l("id");
         buq.a($$1).filter($$0x -> $$0x == buq.aO).ifPresent($$0x -> {
            if (!chm.a(this.dW(), this)) {
               this.dW().a(null, this.dB(), this.dD(), this.dH(), chm.a(this.dW(), this.dW().A), this.dn(), 1.0F, chm.a(this.dW().A));
            }
         });
      }
   }

   private void d(buj $$0) {
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

   public void a(int $$0, float $$1, cwn $$2) {
      this.bB = $$0;
      this.bC = $$1;
      this.bD = $$2;
      if (!this.dW().C) {
         this.gx();
         this.c(4, true);
      }
   }

   @Nonnull
   @Override
   public cwn ea() {
      return this.fv() && this.bD != null ? this.bD : super.ea();
   }

   @Override
   public void a(bsz $$0) {
      super.a($$0);
      this.ay();
      if (!this.Z_() && this.dW() instanceof arc $$1) {
         this.b($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-ayy.b((this.eK() + this.dM()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-ayy.a((this.eK() + this.dM()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(awj.N);
      this.a(awj.i.b(awj.m));
      this.a(awj.i.b(awj.n));
      this.aH();
      this.c(false);
      this.c(Optional.of(jq.a(this.dW().ai(), this.dw())));
   }

   @Override
   protected void f(arc $$0) {
      super.f($$0);
      if (!$$0.O().b(dgc.d)) {
         this.ge();
         this.g.k();
      }
   }

   protected void ge() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cwn $$1 = this.g.a($$0);
         if (!$$1.f() && dcz.a($$1, dcy.D)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected avy e(bsz $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected avy o_() {
      return avz.uK;
   }

   @Override
   public void g(cwn $$0) {
   }

   @Nullable
   public cla a(cwn $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cla a(cwn $$0, boolean $$1, boolean $$2) {
      if (!$$0.f() && this.dW().C) {
         this.a(bsh.a);
      }

      return null;
   }

   public float c(dwv $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(bwn.t);
      }

      if (btp.a(this)) {
         $$1 *= 1.0F + (float)(btp.b(this) + 1) * 0.2F;
      }

      if (this.b(btq.d)) {
         float $$2 = switch (this.c(btq.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.h(bwn.f);
      if (this.a(awu.a)) {
         $$1 *= (float)this.g(bwn.C).g();
      }

      if (!this.aJ()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dwv $$0) {
      return !$$0.C() || this.g.f().b($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a_(this.cC.getId());
      tw $$1 = $$0.c("Inventory", 10);
      this.g.b($$1);
      this.g.j = $$0.h("SelectedItemSlot");
      this.i = $$0.g("SleepTimer");
      this.ct = $$0.j("XpP");
      this.cr = $$0.h("XpLevel");
      this.cs = $$0.h("XpTotal");
      this.cu = $$0.h("XpSeed");
      if (this.cu == 0) {
         this.cu = this.ae.f();
      }

      this.q($$0.h("Score"));
      this.ce.a($$0);
      this.j.b($$0);
      this.g(bwn.v).a((double)this.j.b());
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
         this.c(jq.b.parse(ue.a, $$0.c("LastDeathLocation")).resultOrPartial(a::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         fay.a.parse(ue.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(a::error).ifPresent($$0x -> this.cy = $$0x);
      }

      this.cH = $$0.q("ignore_fall_damage_from_current_explosion");
      this.cI = $$0.h("current_impulse_context_reset_grace_time");
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      uf.e($$0);
      $$0.a("Inventory", this.g.a(new tw()));
      $$0.a("SelectedItemSlot", this.g.j);
      $$0.a("SleepTimer", (short)this.i);
      $$0.a("XpP", this.ct);
      $$0.a("XpLevel", this.cr);
      $$0.a("XpTotal", this.cs);
      $$0.a("XpSeed", this.cu);
      $$0.a("Score", this.gd());
      this.ce.b($$0);
      this.j.a($$0);
      $$0.a("EnderItems", this.cb.a(this.dY()));
      if (!this.gA().g()) {
         $$0.a("ShoulderEntityLeft", this.gA());
      }

      if (!this.gB().g()) {
         $$0.a("ShoulderEntityRight", this.gB());
      }

      this.gI().flatMap($$0x -> jq.b.encodeStart(ue.a, $$0x).resultOrPartial(a::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cy != null) {
         $$0.a("current_explosion_impact_pos", (un)fay.a.encodeStart(ue.a, this.cy).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cH);
      $$0.a("current_impulse_context_reset_grace_time", this.cI);
   }

   @Override
   public boolean a(arc $$0, bsz $$1) {
      if (super.a($$0, $$1)) {
         return true;
      } else if ($$1.a(awq.n)) {
         return !$$0.O().b(dgc.H);
      } else if ($$1.a(awq.m)) {
         return !$$0.O().b(dgc.I);
      } else if ($$1.a(awq.i)) {
         return !$$0.O().b(dgc.J);
      } else {
         return $$1.a(awq.o) ? !$$0.O().b(dgc.K) : false;
      }
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.j.a && !$$1.a(awq.d)) {
         return false;
      } else {
         this.bf = 0;
         if (this.eF()) {
            return false;
         } else {
            this.gx();
            if ($$1.g()) {
               if ($$0.am() == bsf.a) {
                  $$2 = 0.0F;
               }

               if ($$0.am() == bsf.b) {
                  $$2 = Math.min($$2 / 2.0F + 1.0F, $$2);
               }

               if ($$0.am() == bsf.d) {
                  $$2 = $$2 * 3.0F / 2.0F;
               }
            }

            return $$2 == 0.0F ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void d(bvf $$0) {
      super.d($$0);
      cwn $$1 = this.fH();
      if ($$0.fU() && $$1 != null) {
         this.h($$1);
      }
   }

   @Override
   public boolean ex() {
      return !this.gj().a && super.ex();
   }

   public boolean a(cov $$0) {
      fcf $$1 = this.cr();
      fcf $$2 = $$0.cr();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void c(bsz $$0, float $$1) {
      this.a($$0, $$1, new bur[]{bur.c, bur.d, bur.e, bur.f});
   }

   @Override
   protected void d(bsz $$0, float $$1) {
      this.a($$0, $$1, new bur[]{bur.f});
   }

   @Override
   protected void z(float $$0) {
      if (this.by.a(cwr.ws)) {
         if (!this.dW().C) {
            this.b(awj.c.b(this.by.h()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + ayy.d($$0);
            bsh $$2 = this.fA();
            this.by.a($$1, this, d($$2));
            if (this.by.f()) {
               if ($$2 == bsh.a) {
                  this.a(bur.a, cwn.j);
               } else {
                  this.a(bur.b, cwn.j);
               }

               this.by = cwn.j;
               this.a(avz.xe, 0.8F, 0.8F + this.dW().A.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void b(arc $$0, bsz $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var8 = Math.max($$2 - this.fw(), 0.0F);
         this.E(this.fw() - ($$2 - var8));
         float $$4 = $$2 - var8;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
            this.a(awj.L, Math.round($$4 * 10.0F));
         }

         if (var8 != 0.0F) {
            this.G($$1.a());
            this.eQ().a($$1, var8);
            this.x(this.eE() - var8);
            if (var8 < 3.4028235E37F) {
               this.a(awj.J, Math.round(var8 * 10.0F));
            }

            this.a(ebr.o);
         }
      }
   }

   public boolean aa() {
      return false;
   }

   public void a(dvk $$0, boolean $$1) {
   }

   public void a(dfg $$0) {
   }

   public void a(duh $$0) {
   }

   public void a(dvp $$0) {
   }

   public void a(dva $$0) {
   }

   public void a(cja $$0, bsb $$1) {
   }

   public OptionalInt a(@Nullable bsk $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dfe $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cwn $$0, bsh $$1) {
   }

   public bsi a(buj $$0, bsh $$1) {
      if (this.Z_()) {
         if ($$0 instanceof bsk) {
            this.a((bsk)$$0);
         }

         return bsi.e;
      } else {
         cwn $$2 = this.b($$1);
         cwn $$3 = $$2.v();
         bsi $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.j.d && $$2 == this.b($$1) && $$2.M() < $$3.M()) {
               $$2.e($$3.M());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof bvf) {
               if (this.j.d) {
                  $$2 = $$3;
               }

               bsi $$5 = $$2.a(this, (bvf)$$0, $$1);
               if ($$5.a()) {
                  this.dW().a(ebr.r, $$0.du(), ebr.a.a(this));
                  if ($$2.f() && !this.j.d) {
                     this.a($$1, cwn.j);
                  }

                  return $$5;
               }
            }

            return bsi.e;
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
      return !this.j.b;
   }

   @Override
   protected fay a(fay $$0, bvj $$1) {
      float $$2 = this.dQ();
      if (!this.j.b && !($$0.e > 0.0) && ($$1 == bvj.a || $$1 == bvj.b) && this.ga() && this.I($$2)) {
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

         return new fay($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean I(float $$0) {
      return this.aJ() || this.Z < $$0 && !this.b(0.0, 0.0, $$0 - this.Z);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      fat $$3 = this.cR();
      return this.dW().a(this, new fat($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(buj $$0) {
      if ($$0.cB()) {
         if (!$$0.v(this)) {
            float $$1 = this.fv() ? this.bC : (float)this.h(bwn.c);
            cwn $$2 = this.ea();
            bsz $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.dX().a(this));
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.H(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gD();
            if ($$0.aq().a(aws.H) && $$0 instanceof cpo $$6 && $$6.a(cpp.c, this, this, true)) {
               this.dW().a(null, this.dB(), this.dD(), this.dH(), avz.uD, this.dn());
               return;
            }

            if ($$1 > 0.0F || $$4 > 0.0F) {
               boolean $$7 = $$5 > 0.9F;
               boolean $$8;
               if (this.cj() && $$7) {
                  this.dW().a(null, this.dB(), this.dD(), this.dH(), avz.uC, this.dn(), 1.0F, 1.0F);
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
                  && !this.b(btq.o)
                  && !this.bZ()
                  && $$0 instanceof bvf
                  && !this.cj();
               if ($$10) {
                  $$1 *= 1.5F;
               }

               float $$11 = $$1 + $$4;
               boolean $$12 = false;
               if ($$7 && !$$10 && !$$8 && this.aJ()) {
                  double $$13 = this.ah().j();
                  double $$14 = (double)this.fp() * 2.5;
                  if ($$13 < ayy.k($$14) && this.b(bsh.a).a(awx.bG)) {
                     $$12 = true;
                  }
               }

               float $$15 = 0.0F;
               if ($$0 instanceof bvf $$16) {
                  $$15 = $$16.eE();
               }

               fay $$17 = $$0.dz();
               boolean $$18 = $$0.b($$3, $$11);
               if ($$18) {
                  float $$19 = this.b($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                  if ($$19 > 0.0F) {
                     if ($$0 instanceof bvf $$20) {
                        $$20.p(
                           (double)($$19 * 0.5F), (double)ayy.a(this.dM() * (float) (Math.PI / 180.0)), (double)(-ayy.b(this.dM() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.j(
                           (double)(-ayy.a(this.dM() * (float) (Math.PI / 180.0)) * $$19 * 0.5F),
                           0.1,
                           (double)(ayy.b(this.dM() * (float) (Math.PI / 180.0)) * $$19 * 0.5F)
                        );
                     }

                     this.h(this.dz().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$12) {
                     float $$21 = 1.0F + (float)this.h(bwn.D) * $$1;

                     for (bvf $$23 : this.dW().a(bvf.class, $$0.cR().c(1.0, 0.25, 1.0))) {
                        if ($$23 != this && $$23 != $$0 && !this.s($$23) && (!($$23 instanceof ckp) || !((ckp)$$23).x()) && this.g((buj)$$23) < 9.0) {
                           float $$24 = this.a($$23, $$21, $$3) * $$5;
                           $$23.p(0.4F, (double)ayy.a(this.dM() * (float) (Math.PI / 180.0)), (double)(-ayy.b(this.dM() * (float) (Math.PI / 180.0))));
                           $$23.a($$3, $$24);
                           if (this.dW() instanceof arc $$25) {
                              dcz.a($$25, (buj)$$23, $$3);
                           }
                        }
                     }

                     this.dW().a(null, this.dB(), this.dD(), this.dH(), avz.uF, this.dn(), 1.0F, 1.0F);
                     this.gf();
                  }

                  if ($$0 instanceof ard && $$0.T) {
                     ((ard)$$0).f.b(new aew($$0));
                     $$0.T = false;
                     $$0.h($$17);
                  }

                  if ($$10) {
                     this.dW().a(null, this.dB(), this.dD(), this.dH(), avz.uB, this.dn(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$10 && !$$12) {
                     if ($$7) {
                        this.dW().a(null, this.dB(), this.dD(), this.dH(), avz.uE, this.dn(), 1.0F, 1.0F);
                     } else {
                        this.dW().a(null, this.dB(), this.dD(), this.dH(), avz.uG, this.dn(), 1.0F, 1.0F);
                     }
                  }

                  if ($$4 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  buj $$26 = $$0;
                  if ($$0 instanceof cjq) {
                     $$26 = ((cjq)$$0).a;
                  }

                  boolean $$27 = false;
                  if (this.dW() instanceof arc $$28) {
                     if ($$26 instanceof bvf $$29) {
                        $$27 = $$2.a($$29, this);
                     }

                     dcz.a($$28, $$0, $$3);
                  }

                  if (!this.dW().C && !$$2.f() && $$26 instanceof bvf) {
                     if ($$27) {
                        $$2.b((bvf)$$26, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.eZ()) {
                           this.a(bsh.a, cwn.j);
                        } else {
                           this.a(bsh.b, cwn.j);
                        }
                     }
                  }

                  if ($$0 instanceof bvf) {
                     float $$30 = $$15 - ((bvf)$$0).eE();
                     this.a(awj.G, Math.round($$30 * 10.0F));
                     if (this.dW() instanceof arc && $$30 > 2.0F) {
                        int $$31 = (int)((double)$$30 * 0.5);
                        ((arc)this.dW()).a(lt.g, $$0.dB(), $$0.e(0.5), $$0.dH(), $$31, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.G(0.1F);
               } else {
                  this.dW().a(null, this.dB(), this.dD(), this.dH(), avz.uD, this.dn(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(buj $$0, float $$1, bsz $$2) {
      return $$1;
   }

   @Override
   protected void g(bvf $$0) {
      this.e($$0);
   }

   public void h(cwn $$0) {
      this.gE().a($$0, 100);
      this.fF();
      this.dW().a(this, (byte)30);
   }

   public void b(buj $$0) {
   }

   @Override
   public void c(buj $$0) {
   }

   public void gf() {
      double $$0 = (double)(-ayy.a(this.dM() * (float) (Math.PI / 180.0)));
      double $$1 = (double)ayy.b(this.dM() * (float) (Math.PI / 180.0));
      if (this.dW() instanceof arc) {
         ((arc)this.dW()).a(lt.al, this.dB() + $$0, this.e(0.5), this.dH() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void gg() {
   }

   @Override
   public void a(buj.d $$0) {
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
      return this.cC;
   }

   public cou gi() {
      return this.g;
   }

   public cor gj() {
      return this.j;
   }

   @Override
   public boolean fV() {
      return this.j.d;
   }

   public void a(cwn $$0, cwn $$1, csk $$2) {
   }

   public boolean gk() {
      return this.cd != this.cc;
   }

   public boolean gl() {
      return true;
   }

   public Either<cov.a, bae> a(ji $$0) {
      this.b($$0);
      this.i = 0;
      return Either.right(bae.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fS();
      if (this.dW() instanceof arc && $$1) {
         ((arc)this.dW()).f();
      }

      this.i = $$0 ? 0 : 100;
   }

   @Override
   public void fS() {
      this.a(true, true);
   }

   public boolean gm() {
      return this.fR() && this.i >= 100;
   }

   public int gn() {
      return this.i;
   }

   public void a(wo $$0, boolean $$1) {
   }

   public void a(aku $$0) {
      this.b(awj.i.b($$0));
   }

   public void a(aku $$0, int $$1) {
      this.a(awj.i.b($$0), $$1);
   }

   public void b(awg<?> $$0) {
      this.a($$0, 1);
   }

   public void a(awg<?> $$0, int $$1) {
   }

   public void a(awg<?> $$0) {
   }

   public int a(Collection<dbh<?>> $$0) {
      return 0;
   }

   public void a(dbh<?> $$0, List<cwn> $$1) {
   }

   public void b(List<akt<dbc<?>>> $$0) {
   }

   public int b(Collection<dbh<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(fay $$0) {
      if (this.bZ()) {
         super.a_($$0);
      } else {
         if (this.ck()) {
            double $$1 = this.bT().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bm || !this.dW().b_(ji.a(this.dB(), this.dD() + 1.0 - 0.1, this.dH())).c()) {
               fay $$3 = this.dz();
               this.h($$3.b(0.0, ($$1 - $$3.e) * $$2, 0.0));
            }
         }

         if (this.gj().b) {
            double $$4 = this.dz().e;
            super.a_($$0);
            this.h(this.dz().a(jn.a.b, $$4 * 0.6));
         } else {
            super.a_($$0);
         }
      }
   }

   @Override
   protected boolean ft() {
      return !this.j.b && super.ft();
   }

   @Override
   public void bp() {
      if (this.j.b) {
         this.i(false);
      } else {
         super.bp();
      }
   }

   protected boolean h(ji $$0) {
      return !this.dW().a_($$0).j(this.dW(), $$0);
   }

   @Override
   public float fp() {
      return (float)this.h(bwn.v);
   }

   @Override
   public boolean a(float $$0, float $$1, bsz $$2) {
      if (this.j.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(awj.t, (int)Math.round((double)$$0 * 100.0));
         }

         boolean $$3 = this.cy != null && this.cH;
         float $$4;
         if ($$3) {
            $$4 = Math.min($$0, (float)(this.cy.e - this.dD()));
            boolean $$5 = $$4 <= 0.0F;
            if ($$5) {
               this.gP();
            } else {
               this.gO();
            }
         } else {
            $$4 = $$0;
         }

         if ($$4 > 0.0F && super.a($$4, $$1, $$2)) {
            this.gP();
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
      if (!this.Z_()) {
         super.bs();
      }
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      if (this.bj()) {
         this.aY();
         this.b($$1);
      } else {
         ji $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dwv $$3 = this.dW().a_($$2);
            if ($$3.a(awo.bq)) {
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
   public bvf.a eM() {
      return new bvf.a(avz.uR, avz.uH);
   }

   @Override
   public boolean a(arc $$0, bvf $$1) {
      this.b(awj.g.b($$1.aq()));
      return true;
   }

   @Override
   public void a(dwv $$0, fay $$1) {
      if (!this.j.b) {
         super.a($$0, $$1);
      }

      this.gO();
   }

   public void d(int $$0) {
      this.r($$0);
      this.ct = this.ct + (float)$$0 / (float)this.gs();
      this.cs = ayy.a(this.cs + $$0, 0, Integer.MAX_VALUE);

      while (this.ct < 0.0F) {
         float $$1 = this.ct * (float)this.gs();
         if (this.cr > 0) {
            this.c(-1);
            this.ct = 1.0F + $$1 / (float)this.gs();
         } else {
            this.c(-1);
            this.ct = 0.0F;
         }
      }

      while (this.ct >= 1.0F) {
         this.ct = (this.ct - 1.0F) * (float)this.gs();
         this.c(1);
         this.ct = this.ct / (float)this.gs();
      }
   }

   public int gr() {
      return this.cu;
   }

   public void a(cwn $$0, int $$1) {
      this.cr -= $$1;
      if (this.cr < 0) {
         this.cr = 0;
         this.ct = 0.0F;
         this.cs = 0;
      }

      this.cu = this.ae.f();
   }

   public void c(int $$0) {
      this.cr = IntMath.saturatedAdd(this.cr, $$0);
      if (this.cr < 0) {
         this.cr = 0;
         this.ct = 0.0F;
         this.cs = 0;
      }

      if ($$0 > 0 && this.cr % 5 == 0 && (float)this.k < (float)this.af - 100.0F) {
         float $$1 = this.cr > 30 ? 1.0F : (float)this.cr / 30.0F;
         this.dW().a(null, this.dB(), this.dD(), this.dH(), avz.uQ, this.dn(), $$1 * 0.75F, 1.0F);
         this.k = this.af;
      }
   }

   public int gs() {
      if (this.cr >= 30) {
         return 112 + (this.cr - 30) * 9;
      } else {
         return this.cr >= 15 ? 37 + (this.cr - 15) * 5 : 7 + this.cr * 2;
      }
   }

   public void G(float $$0) {
      if (!this.j.a) {
         if (!this.dW().C) {
            this.ce.a($$0);
         }
      }
   }

   public Optional<cnz> ac() {
      return Optional.empty();
   }

   public crw gt() {
      return this.ce;
   }

   public boolean u(boolean $$0) {
      return this.j.a || $$0 || this.ce.b();
   }

   public boolean gu() {
      return this.eE() > 0.0F && this.eE() < this.eS();
   }

   public boolean gv() {
      return this.j.e;
   }

   public boolean a(ji $$0, jn $$1, cwn $$2) {
      if (this.j.e) {
         return true;
      } else {
         ji $$3 = $$0.a($$1.g());
         dwz $$4 = new dwz(this.dW(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int e(arc $$0) {
      return !$$0.O().b(dgc.d) && !this.Z_() ? Math.min(this.cr * 7, 100) : 0;
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
   protected buj.c bg() {
      return this.j.b || this.aJ() && this.cg() ? buj.c.a : buj.c.d;
   }

   public void x() {
   }

   @Override
   public wo al() {
      return wo.b(this.cC.getName());
   }

   public cto gw() {
      return this.cb;
   }

   @Override
   public cwn a(bur $$0) {
      if ($$0 == bur.a) {
         return this.g.f();
      } else if ($$0 == bur.b) {
         return this.g.i.getFirst();
      } else {
         return $$0.a() == bur.a.b ? this.g.h.get($$0.b()) : cwn.j;
      }
   }

   @Override
   protected boolean b(bur $$0) {
      return $$0.a() == bur.a.b;
   }

   @Override
   public void a(bur $$0, cwn $$1) {
      this.c($$1);
      if ($$0 == bur.a) {
         this.a($$0, this.g.g.set(this.g.j, $$1), $$1);
      } else if ($$0 == bur.b) {
         this.a($$0, this.g.i.set(0, $$1), $$1);
      } else if ($$0.a() == bur.a.b) {
         this.a($$0, this.g.h.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cwn $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<cwn> fc() {
      return Lists.newArrayList(new cwn[]{this.eZ(), this.fa()});
   }

   @Override
   public Iterable<cwn> fb() {
      return this.g.h;
   }

   @Override
   public boolean e(bur $$0) {
      return $$0 != bur.g;
   }

   public boolean h(tq $$0) {
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
         this.i(new tq());
         this.k(this.gB());
         this.j(new tq());
      }
   }

   private void k(tq $$0) {
      if (!this.dW().C && !$$0.g()) {
         buq.a($$0, this.dW(), bup.r).ifPresent($$0x -> {
            if ($$0x instanceof bwc) {
               ((bwc)$$0x).b(this.at);
            }

            $$0x.a_(this.dB(), this.dD() + 0.7F, this.dH());
            ((arc)this.dW()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean Z_();

   @Override
   public boolean bG() {
      return !this.Z_() && super.bG();
   }

   @Override
   public boolean ck() {
      return !this.j.b && !this.Z_() && super.ck();
   }

   public abstract boolean b();

   @Override
   public boolean cJ() {
      return !this.j.b;
   }

   public fcd gy() {
      return this.dW().R();
   }

   @Override
   public wo p_() {
      xc $$0 = fby.a(this.cr(), this.al());
      return this.a($$0);
   }

   private xc a(xc $$0) {
      String $$1 = this.gh().getName();
      return $$0.a($$1x -> $$1x.a(new wm(wm.a.d, "/tell " + $$1 + " ")).a(this.cQ()).a($$1));
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

   public boolean a(cow $$0) {
      return (this.au().a(bW) & $$0.a()) == $$0.a();
   }

   @Override
   public bvx a_(int $$0) {
      if ($$0 == 499) {
         return new bvx() {
            @Override
            public cwn a() {
               return cov.this.cd.g();
            }

            @Override
            public boolean a(cwn $$0) {
               cov.this.cd.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bvx() {
               @Override
               public cwn a() {
                  return cov.this.cc.r().a($$1);
               }

               @Override
               public boolean a(cwn $$0) {
                  cov.this.cc.r().a($$1, $$0);
                  cov.this.cc.a(cov.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.g.size()) {
            return bvx.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.cb.b() ? bvx.a(this.cb, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gz() {
      return this.cD;
   }

   public void v(boolean $$0) {
      this.cD = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.j.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public buz fy() {
      return this.al.a(bX) == 0 ? buz.a : buz.b;
   }

   public void b(buz $$0) {
      this.al.a(bX, (byte)($$0 == buz.a ? 0 : 1));
   }

   public tq gA() {
      return this.al.a(bY);
   }

   protected void i(tq $$0) {
      this.al.a(bY, $$0);
   }

   public tq gB() {
      return this.al.a(bZ);
   }

   protected void j(tq $$0) {
      this.al.a(bZ, $$0);
   }

   public float gC() {
      return (float)(1.0 / this.h(bwn.e) * 20.0);
   }

   public float H(float $$0) {
      return ayy.a(((float)this.aS + $$0) / this.gC(), 0.0F, 1.0F);
   }

   public void gD() {
      this.aS = 0;
   }

   public cwk gE() {
      return this.cF;
   }

   @Override
   protected float aT() {
      return !this.j.b && !this.fJ() ? super.aT() : 1.0F;
   }

   public float gF() {
      return (float)this.h(bwn.q);
   }

   public boolean gG() {
      return this.j.d && this.G() >= 2;
   }

   public int G() {
      return 0;
   }

   public boolean s(int $$0) {
      return this.G() >= $$0;
   }

   @Override
   public bum e(bvr $$0) {
      return c.getOrDefault($$0, bV);
   }

   @Override
   public ImmutableList<bvr> fO() {
      return ImmutableList.of(bvr.a, bvr.f, bvr.d);
   }

   @Override
   public cwn d(cwn $$0) {
      if (!($$0.h() instanceof cxj)) {
         return cwn.j;
      } else {
         Predicate<cwn> $$1 = ((cxj)$$0.h()).d();
         cwn $$2 = cxj.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((cxj)$$0.h()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cwn $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.j.d ? new cwn(cwr.pb) : cwn.j;
         }
      }
   }

   @Override
   public fay u(float $$0) {
      double $$1 = 0.22 * (this.fy() == buz.b ? -1.0 : 1.0);
      float $$2 = ayy.h($$0 * 0.5F, this.dO(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = ayy.h($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      if (this.fJ() || this.fv()) {
         fay $$4 = this.g($$0);
         fay $$5 = this.dz();
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

         return this.o($$0).e(new fay($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cl()) {
         return this.o($$0).e(new fay($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cR().c() - 1.0;
         double $$13 = this.ci() ? -0.2 : 0.07;
         return this.o($$0).e(new fay($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dV() {
      return true;
   }

   public boolean gH() {
      return this.fz() && this.fB().a(cwr.rU);
   }

   @Override
   public boolean dU() {
      return false;
   }

   public Optional<jq> gI() {
      return this.cG;
   }

   public void c(Optional<jq> $$0) {
      this.cG = $$0;
   }

   @Override
   public float eK() {
      return this.cx;
   }

   @Override
   public void p(float $$0) {
      super.p($$0);
      this.cx = $$0;
   }

   @Override
   public boolean dP() {
      return true;
   }

   @Override
   protected float fo() {
      if (this.j.b && !this.bZ()) {
         return this.cj() ? this.j.a() * 2.0F : this.j.a();
      } else {
         return this.cj() ? 0.025999999F : 0.02F;
      }
   }

   public boolean gJ() {
      return this.h || this.cg <= 0;
   }

   public void gK() {
      if (!this.h) {
         this.cg--;
      }
   }

   public void w(boolean $$0) {
      this.h = $$0;
      if (!this.h) {
         this.cg = 60;
      }
   }

   public double gL() {
      return this.h(bwn.g);
   }

   public double gM() {
      return this.h(bwn.j);
   }

   public boolean b(buj $$0, double $$1) {
      return $$0.dR() ? false : this.a($$0.cR(), $$1);
   }

   public boolean a(fat $$0, double $$1) {
      double $$2 = this.gM() + $$1;
      return $$0.e(this.bF()) < $$2 * $$2;
   }

   public boolean a(ji $$0, double $$1) {
      double $$2 = this.gL() + $$1;
      return new fat($$0).e(this.bF()) < $$2 * $$2;
   }

   public void x(boolean $$0) {
      this.cH = $$0;
      if ($$0) {
         this.cI = 40;
      } else {
         this.cI = 0;
      }
   }

   public boolean gN() {
      return this.cH;
   }

   public void gO() {
      if (this.cI == 0) {
         this.gP();
      }
   }

   public void gP() {
      this.cI = 0;
      this.cz = null;
      this.cy = null;
      this.cH = false;
   }

   public boolean gQ() {
      return false;
   }

   @Override
   public boolean dj() {
      return true;
   }

   @Override
   public boolean q_() {
      return this.j.b ? false : super.q_();
   }

   public static enum a {
      a,
      b(wo.c("block.minecraft.bed.no_sleep")),
      c(wo.c("block.minecraft.bed.too_far_away")),
      d(wo.c("block.minecraft.bed.obstructed")),
      e,
      f(wo.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final wo g;

      private a() {
         this.g = null;
      }

      private a(final wo $$0) {
         this.g = $$0;
      }

      @Nullable
      public wo a() {
         return this.g;
      }
   }
}
