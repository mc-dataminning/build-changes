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

public abstract class coy extends bvi {
   private static final Logger a = LogUtils.getLogger();
   public static final bvc bG = bvc.b;
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
   public static final fbb bU = new fbb(0.0, 0.6, 0.0);
   public static final bup bV = bup.b(0.6F, 1.8F).b(1.62F).a(buo.a().a(bun.b, bU));
   private static final Map<bvu, bup> c = ImmutableMap.builder()
      .put(bvu.a, bV)
      .put(bvu.c, aD)
      .put(bvu.b, bup.b(0.6F, 0.6F).b(0.4F))
      .put(bvu.d, bup.b(0.6F, 0.6F).b(0.4F))
      .put(bvu.e, bup.b(0.6F, 0.6F).b(0.4F))
      .put(bvu.f, bup.b(0.6F, 1.5F).b(1.27F).a(buo.a().a(bun.b, bU)))
      .put(bvu.h, bup.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final ajy<Float> d = akc.a(coy.class, aka.d);
   private static final ajy<Integer> e = akc.a(coy.class, aka.b);
   protected static final ajy<Byte> bW = akc.a(coy.class, aka.a);
   protected static final ajy<Byte> bX = akc.a(coy.class, aka.a);
   protected static final ajy<tq> bY = akc.a(coy.class, aka.t);
   protected static final ajy<tq> bZ = akc.a(coy.class, aka.t);
   public static final int ca = 60;
   private long f;
   final cox g = new cox(this);
   protected ctr cb = new ctr();
   public final ctg cc;
   public csd cd;
   protected crz ce = new crz();
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
   private final cou j = new cou();
   public int cr;
   public int cs;
   public float ct;
   protected int cu;
   protected final float cv = 0.02F;
   private int k;
   private final GameProfile cC;
   private boolean cD;
   private cwq cE = cwq.j;
   private final cwn cF = this.g();
   private Optional<jq> cG = Optional.empty();
   @Nullable
   public cpn cw;
   protected float cx;
   @Nullable
   public fbb cy;
   @Nullable
   public bum cz;
   private boolean cH;
   private int cI;

   public coy(dgj $$0, ji $$1, float $$2, GameProfile $$3) {
      super(but.bR, $$0);
      this.a_($$3.getId());
      this.cC = $$3;
      this.cc = new ctg(this.g, !$$0.C, this);
      this.cd = this.cc;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bk = 180.0F;
   }

   public boolean a(dgj $$0, ji $$1, dgg $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dgg.d) {
         return true;
      } else if (this.gv()) {
         return false;
      } else {
         cwq $$3 = this.eZ();
         return $$3.f() || !$$3.b(new dxc($$0, $$1, false));
      }
   }

   public static bwp.a fX() {
      return bvi.ed().a(bwq.c, 1.0).a(bwq.v, 0.1F).a(bwq.e).a(bwq.q).a(bwq.g, 4.5).a(bwq.j, 3.0).a(bwq.f).a(bwq.C).a(bwq.z).a(bwq.t).a(bwq.D);
   }

   @Override
   protected void a(akc.a $$0) {
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

         if (!this.dV().C && this.dV().V()) {
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
      if (!this.dV().C && this.cd != null && !this.cd.b(this)) {
         this.p();
         this.cd = this.cc;
      }

      this.t();
      if (this instanceof are $$0) {
         this.ce.a($$0);
         this.a(awk.k);
         this.a(awk.l);
         if (this.bL()) {
            this.a(awk.m);
         }

         if (this.cg()) {
            this.a(awk.o);
         }

         if (!this.fR()) {
            this.a(awk.n);
         }
      }

      int $$1 = 29999999;
      double $$2 = ayz.a(this.dA(), -2.9999999E7, 2.9999999E7);
      double $$3 = ayz.a(this.dG(), -2.9999999E7, 2.9999999E7);
      if ($$2 != this.dA() || $$3 != this.dG()) {
         this.a_($$2, this.dC(), $$3);
      }

      this.aS++;
      cwq $$4 = this.eZ();
      if (!cwq.a(this.cE, $$4)) {
         if (!cwq.b(this.cE, $$4)) {
            this.gD();
         }

         this.cE = $$4.v();
      }

      if (!this.a(awv.a) && this.c(cwu.oT)) {
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
      this.cq = this.a(awv.a);
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
      this.a(new btr(btt.m, 200, 0, false, false, true));
   }

   private boolean c(cwm $$0) {
      for (buu $$1 : buu.i) {
         cwq $$2 = this.a($$1);
         dev $$3 = $$2.a(kv.D);
         if ($$2.a($$0) && $$3 != null && $$3.a() == $$1) {
            return true;
         }
      }

      return false;
   }

   protected cwn g() {
      return new cwn();
   }

   private void t() {
      this.ck = this.cn;
      this.cl = this.co;
      this.cm = this.cp;
      double $$0 = this.dA() - this.cn;
      double $$1 = this.dC() - this.co;
      double $$2 = this.dG() - this.cp;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cn = this.dA();
         this.ck = this.cn;
      }

      if ($$2 > 10.0) {
         this.cp = this.dG();
         this.cm = this.cp;
      }

      if ($$1 > 10.0) {
         this.co = this.dC();
         this.cl = this.co;
      }

      if ($$0 < -10.0) {
         this.cn = this.dA();
         this.ck = this.cn;
      }

      if ($$2 < -10.0) {
         this.cp = this.dG();
         this.cm = this.cp;
      }

      if ($$1 < -10.0) {
         this.co = this.dC();
         this.cl = this.co;
      }

      this.cn += $$0 * 0.25;
      this.cp += $$2 * 0.25;
      this.co += $$1 * 0.25;
   }

   protected void gc() {
      if (this.h(bvu.d)) {
         bvu $$0;
         if (this.fJ()) {
            $$0 = bvu.b;
         } else if (this.fR()) {
            $$0 = bvu.c;
         } else if (this.ck()) {
            $$0 = bvu.d;
         } else if (this.fv()) {
            $$0 = bvu.e;
         } else if (this.cd() && !this.j.b) {
            $$0 = bvu.f;
         } else {
            $$0 = bvu.a;
         }

         bvu $$6;
         if (this.Z_() || this.bZ() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bvu.f)) {
            $$6 = bvu.f;
         } else {
            $$6 = bvu.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bvu $$0) {
      return this.dV().a(this, this.a($$0).a(this.dt()).h(1.0E-7));
   }

   @Override
   protected avz aV() {
      return awa.uU;
   }

   @Override
   protected avz aW() {
      return awa.uS;
   }

   @Override
   protected avz aX() {
      return awa.uT;
   }

   @Override
   public int bX() {
      return 10;
   }

   @Override
   public void a(avz $$0, float $$1, float $$2) {
      this.dV().a(this, this.dA(), this.dC(), this.dG(), $$0, this.dm(), $$1, $$2);
   }

   public void a(avz $$0, awb $$1, float $$2, float $$3) {
   }

   @Override
   public awb dm() {
      return awb.h;
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
      if (!this.dV().C && this.fZ() && this.bZ()) {
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
      this.aZ = this.dL();
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
      this.C((float)this.h(bwq.v));
      float $$1;
      if (this.aJ() && !this.eE() && !this.ck()) {
         $$1 = Math.min(0.1F, (float)this.dy().i());
      } else {
         $$1 = 0.0F;
      }

      this.ci = this.ci + ($$1 - this.ci) * 0.4F;
      if (this.eD() > 0.0F && !this.Z_()) {
         faw $$2;
         if (this.bZ() && !this.dk().dQ()) {
            $$2 = this.cR().b(this.dk().cR()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cR().c(1.0, 0.5, 1.0);
         }

         List<bum> $$4 = this.dV().a_(this, $$2);
         List<bum> $$5 = Lists.newArrayList();

         for (bum $$6 : $$4) {
            if ($$6.aq() == but.V) {
               $$5.add($$6);
            } else if (!$$6.dQ()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(af.a($$5, this.ae));
         }
      }

      this.c(this.gA());
      this.c(this.gB());
      if (!this.dV().C && (this.Z > 0.5F || this.bj()) || this.j.b || this.fR() || this.av) {
         this.gx();
      }
   }

   protected void j() {
   }

   private void c(@Nullable tq $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dV().A.a(200) == 0) {
         String $$1 = $$0.l("id");
         but.a($$1).filter($$0x -> $$0x == but.aO).ifPresent($$0x -> {
            if (!chp.a(this.dV(), this)) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), chp.a(this.dV(), this.dV().A), this.dm(), 1.0F, chp.a(this.dV().A));
            }
         });
      }
   }

   private void d(bum $$0) {
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

   public void a(int $$0, float $$1, cwq $$2) {
      this.bB = $$0;
      this.bC = $$1;
      this.bD = $$2;
      if (!this.dV().C) {
         this.gx();
         this.c(4, true);
      }
   }

   @Nonnull
   @Override
   public cwq dZ() {
      return this.fv() && this.bD != null ? this.bD : super.dZ();
   }

   @Override
   public void a(btc $$0) {
      super.a($$0);
      this.ay();
      if (!this.Z_() && this.dV() instanceof ard $$1) {
         this.b($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-ayz.b((this.eJ() + this.dL()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-ayz.a((this.eJ() + this.dL()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(awk.N);
      this.a(awk.i.b(awk.m));
      this.a(awk.i.b(awk.n));
      this.aH();
      this.c(false);
      this.c(Optional.of(jq.a(this.dV().ai(), this.dv())));
   }

   @Override
   protected void f(ard $$0) {
      super.f($$0);
      if (!$$0.O().b(dgf.d)) {
         this.ge();
         this.g.k();
      }
   }

   protected void ge() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cwq $$1 = this.g.a($$0);
         if (!$$1.f() && ddc.a($$1, ddb.D)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected avz e(btc $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected avz o_() {
      return awa.uK;
   }

   @Override
   public void g(cwq $$0) {
   }

   @Nullable
   public cld a(cwq $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cld a(cwq $$0, boolean $$1, boolean $$2) {
      if (!$$0.f() && this.dV().C) {
         this.a(bsk.a);
      }

      return null;
   }

   public float c(dwy $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(bwq.t);
      }

      if (bts.a(this)) {
         $$1 *= 1.0F + (float)(bts.b(this) + 1) * 0.2F;
      }

      if (this.b(btt.d)) {
         float $$2 = switch (this.c(btt.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.h(bwq.f);
      if (this.a(awv.a)) {
         $$1 *= (float)this.g(bwq.C).g();
      }

      if (!this.aJ()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dwy $$0) {
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
      this.g(bwq.v).a((double)this.j.b());
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
         this.c(jq.b.parse(ue.a, $$0.c("LastDeathLocation")).resultOrPartial(a::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         fbb.a.parse(ue.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(a::error).ifPresent($$0x -> this.cy = $$0x);
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
      $$0.a("EnderItems", this.cb.a(this.dX()));
      if (!this.gA().g()) {
         $$0.a("ShoulderEntityLeft", this.gA());
      }

      if (!this.gB().g()) {
         $$0.a("ShoulderEntityRight", this.gB());
      }

      this.gI().flatMap($$0x -> jq.b.encodeStart(ue.a, $$0x).resultOrPartial(a::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cy != null) {
         $$0.a("current_explosion_impact_pos", (un)fbb.a.encodeStart(ue.a, this.cy).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cH);
      $$0.a("current_impulse_context_reset_grace_time", this.cI);
   }

   @Override
   public boolean a(ard $$0, btc $$1) {
      if (super.a($$0, $$1)) {
         return true;
      } else if ($$1.a(awr.n)) {
         return !$$0.O().b(dgf.H);
      } else if ($$1.a(awr.m)) {
         return !$$0.O().b(dgf.I);
      } else if ($$1.a(awr.i)) {
         return !$$0.O().b(dgf.J);
      } else {
         return $$1.a(awr.o) ? !$$0.O().b(dgf.K) : false;
      }
   }

   @Override
   public boolean a(ard $$0, btc $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.j.a && !$$1.a(awr.d)) {
         return false;
      } else {
         this.bf = 0;
         if (this.eE()) {
            return false;
         } else {
            this.gx();
            if ($$1.g()) {
               if ($$0.am() == bsi.a) {
                  $$2 = 0.0F;
               }

               if ($$0.am() == bsi.b) {
                  $$2 = Math.min($$2 / 2.0F + 1.0F, $$2);
               }

               if ($$0.am() == bsi.d) {
                  $$2 = $$2 * 3.0F / 2.0F;
               }
            }

            return $$2 == 0.0F ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void d(bvi $$0) {
      super.d($$0);
      cwq $$1 = this.fH();
      if ($$0.fU() && $$1 != null) {
         this.h($$1);
      }
   }

   @Override
   public boolean ew() {
      return !this.gj().a && super.ew();
   }

   public boolean a(coy $$0) {
      fci $$1 = this.cr();
      fci $$2 = $$0.cr();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void c(btc $$0, float $$1) {
      this.a($$0, $$1, new buu[]{buu.c, buu.d, buu.e, buu.f});
   }

   @Override
   protected void d(btc $$0, float $$1) {
      this.a($$0, $$1, new buu[]{buu.f});
   }

   @Override
   protected void z(float $$0) {
      if (this.by.a(cwu.ws)) {
         if (!this.dV().C) {
            this.b(awk.c.b(this.by.h()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + ayz.d($$0);
            bsk $$2 = this.fA();
            this.by.a($$1, this, d($$2));
            if (this.by.f()) {
               if ($$2 == bsk.a) {
                  this.a(buu.a, cwq.j);
               } else {
                  this.a(buu.b, cwq.j);
               }

               this.by = cwq.j;
               this.a(awa.xe, 0.8F, 0.8F + this.dV().A.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void b(ard $$0, btc $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var8 = Math.max($$2 - this.fw(), 0.0F);
         this.E(this.fw() - ($$2 - var8));
         float $$4 = $$2 - var8;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
            this.a(awk.L, Math.round($$4 * 10.0F));
         }

         if (var8 != 0.0F) {
            this.G($$1.a());
            this.eQ().a($$1, var8);
            this.x(this.eD() - var8);
            if (var8 < 3.4028235E37F) {
               this.a(awk.J, Math.round(var8 * 10.0F));
            }

            this.a(ebu.o);
         }
      }
   }

   public boolean aa() {
      return false;
   }

   public void a(dvn $$0, boolean $$1) {
   }

   public void a(dfj $$0) {
   }

   public void a(duk $$0) {
   }

   public void a(dvs $$0) {
   }

   public void a(dvd $$0) {
   }

   public void a(cjd $$0, bse $$1) {
   }

   public OptionalInt a(@Nullable bsn $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dfh $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cwq $$0, bsk $$1) {
   }

   public bsl a(bum $$0, bsk $$1) {
      if (this.Z_()) {
         if ($$0 instanceof bsn) {
            this.a((bsn)$$0);
         }

         return bsl.e;
      } else {
         cwq $$2 = this.b($$1);
         cwq $$3 = $$2.v();
         bsl $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.j.d && $$2 == this.b($$1) && $$2.M() < $$3.M()) {
               $$2.e($$3.M());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof bvi) {
               if (this.j.d) {
                  $$2 = $$3;
               }

               bsl $$5 = $$2.a(this, (bvi)$$0, $$1);
               if ($$5.a()) {
                  this.dV().a(ebu.r, $$0.dt(), ebu.a.a(this));
                  if ($$2.f() && !this.j.d) {
                     this.a($$1, cwq.j);
                  }

                  return $$5;
               }
            }

            return bsl.e;
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
   public boolean ek() {
      return !this.j.b;
   }

   @Override
   protected fbb a(fbb $$0, bvm $$1) {
      float $$2 = this.dP();
      if (!this.j.b && !($$0.e > 0.0) && ($$1 == bvm.a || $$1 == bvm.b) && this.ga() && this.I($$2)) {
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

         return new fbb($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean I(float $$0) {
      return this.aJ() || this.Z < $$0 && !this.b(0.0, 0.0, $$0 - this.Z);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      faw $$3 = this.cR();
      return this.dV().a(this, new faw($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(bum $$0) {
      if ($$0.cB()) {
         if (!$$0.v(this)) {
            float $$1 = this.fv() ? this.bC : (float)this.h(bwq.c);
            cwq $$2 = this.dZ();
            btc $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.dW().a(this));
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.H(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gD();
            if ($$0.aq().a(awt.H) && $$0 instanceof cpr $$6 && $$6.a(cps.c, this, this, true)) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), awa.uD, this.dm());
               return;
            }

            if ($$1 > 0.0F || $$4 > 0.0F) {
               boolean $$7 = $$5 > 0.9F;
               boolean $$8;
               if (this.cj() && $$7) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awa.uC, this.dm(), 1.0F, 1.0F);
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
                  && !this.b(btt.o)
                  && !this.bZ()
                  && $$0 instanceof bvi
                  && !this.cj();
               if ($$10) {
                  $$1 *= 1.5F;
               }

               float $$11 = $$1 + $$4;
               boolean $$12 = false;
               if ($$7 && !$$10 && !$$8 && this.aJ()) {
                  double $$13 = this.ah().j();
                  double $$14 = (double)this.fp() * 2.5;
                  if ($$13 < ayz.k($$14) && this.b(bsk.a).a(awy.bG)) {
                     $$12 = true;
                  }
               }

               float $$15 = 0.0F;
               if ($$0 instanceof bvi $$16) {
                  $$15 = $$16.eD();
               }

               fbb $$17 = $$0.dy();
               boolean $$18 = $$0.b($$3, $$11);
               if ($$18) {
                  float $$19 = this.b($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                  if ($$19 > 0.0F) {
                     if ($$0 instanceof bvi $$20) {
                        $$20.p(
                           (double)($$19 * 0.5F), (double)ayz.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-ayz.b(this.dL() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.j(
                           (double)(-ayz.a(this.dL() * (float) (Math.PI / 180.0)) * $$19 * 0.5F),
                           0.1,
                           (double)(ayz.b(this.dL() * (float) (Math.PI / 180.0)) * $$19 * 0.5F)
                        );
                     }

                     this.i(this.dy().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$12) {
                     float $$21 = 1.0F + (float)this.h(bwq.D) * $$1;

                     for (bvi $$23 : this.dV().a(bvi.class, $$0.cR().c(1.0, 0.25, 1.0))) {
                        if ($$23 != this && $$23 != $$0 && !this.s($$23) && (!($$23 instanceof cks) || !((cks)$$23).x()) && this.g((bum)$$23) < 9.0) {
                           float $$24 = this.a($$23, $$21, $$3) * $$5;
                           $$23.p(0.4F, (double)ayz.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-ayz.b(this.dL() * (float) (Math.PI / 180.0))));
                           $$23.a($$3, $$24);
                           if (this.dV() instanceof ard $$25) {
                              ddc.a($$25, (bum)$$23, $$3);
                           }
                        }
                     }

                     this.dV().a(null, this.dA(), this.dC(), this.dG(), awa.uF, this.dm(), 1.0F, 1.0F);
                     this.gf();
                  }

                  if ($$0 instanceof are && $$0.T) {
                     ((are)$$0).f.b(new aex($$0));
                     $$0.T = false;
                     $$0.i($$17);
                  }

                  if ($$10) {
                     this.dV().a(null, this.dA(), this.dC(), this.dG(), awa.uB, this.dm(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$10 && !$$12) {
                     if ($$7) {
                        this.dV().a(null, this.dA(), this.dC(), this.dG(), awa.uE, this.dm(), 1.0F, 1.0F);
                     } else {
                        this.dV().a(null, this.dA(), this.dC(), this.dG(), awa.uG, this.dm(), 1.0F, 1.0F);
                     }
                  }

                  if ($$4 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  bum $$26 = $$0;
                  if ($$0 instanceof cjt) {
                     $$26 = ((cjt)$$0).a;
                  }

                  boolean $$27 = false;
                  if (this.dV() instanceof ard $$28) {
                     if ($$26 instanceof bvi $$29) {
                        $$27 = $$2.a($$29, this);
                     }

                     ddc.a($$28, $$0, $$3);
                  }

                  if (!this.dV().C && !$$2.f() && $$26 instanceof bvi) {
                     if ($$27) {
                        $$2.b((bvi)$$26, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.eZ()) {
                           this.a(bsk.a, cwq.j);
                        } else {
                           this.a(bsk.b, cwq.j);
                        }
                     }
                  }

                  if ($$0 instanceof bvi) {
                     float $$30 = $$15 - ((bvi)$$0).eD();
                     this.a(awk.G, Math.round($$30 * 10.0F));
                     if (this.dV() instanceof ard && $$30 > 2.0F) {
                        int $$31 = (int)((double)$$30 * 0.5);
                        ((ard)this.dV()).a(lt.g, $$0.dA(), $$0.e(0.5), $$0.dG(), $$31, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.G(0.1F);
               } else {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awa.uD, this.dm(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(bum $$0, float $$1, btc $$2) {
      return $$1;
   }

   @Override
   protected void g(bvi $$0) {
      this.e($$0);
   }

   public void h(cwq $$0) {
      this.gE().a($$0, 100);
      this.fF();
      this.dV().a(this, (byte)30);
   }

   public void b(bum $$0) {
   }

   @Override
   public void c(bum $$0) {
   }

   public void gf() {
      double $$0 = (double)(-ayz.a(this.dL() * (float) (Math.PI / 180.0)));
      double $$1 = (double)ayz.b(this.dL() * (float) (Math.PI / 180.0));
      if (this.dV() instanceof ard) {
         ((ard)this.dV()).a(lt.al, this.dA() + $$0, this.e(0.5), this.dG() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void gg() {
   }

   @Override
   public void a(bum.d $$0) {
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

   public cox gi() {
      return this.g;
   }

   public cou gj() {
      return this.j;
   }

   @Override
   public boolean fV() {
      return this.j.d;
   }

   public void a(cwq $$0, cwq $$1, csn $$2) {
   }

   public boolean gk() {
      return this.cd != this.cc;
   }

   public boolean gl() {
      return true;
   }

   public Either<coy.a, baf> a(ji $$0) {
      this.b($$0);
      this.i = 0;
      return Either.right(baf.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fS();
      if (this.dV() instanceof ard && $$1) {
         ((ard)this.dV()).f();
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

   public void a(wp $$0, boolean $$1) {
   }

   public void a(akv $$0) {
      this.b(awk.i.b($$0));
   }

   public void a(akv $$0, int $$1) {
      this.a(awk.i.b($$0), $$1);
   }

   public void b(awh<?> $$0) {
      this.a($$0, 1);
   }

   public void a(awh<?> $$0, int $$1) {
   }

   public void a(awh<?> $$0) {
   }

   public int a(Collection<dbk<?>> $$0) {
      return 0;
   }

   public void a(dbk<?> $$0, List<cwq> $$1) {
   }

   public void b(List<aku<dbf<?>>> $$0) {
   }

   public int b(Collection<dbk<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(fbb $$0) {
      if (this.bZ()) {
         super.a_($$0);
      } else {
         if (this.ck()) {
            double $$1 = this.bT().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bm || !this.dV().b_(ji.a(this.dA(), this.dC() + 1.0 - 0.1, this.dG())).c()) {
               fbb $$3 = this.dy();
               this.i($$3.b(0.0, ($$1 - $$3.e) * $$2, 0.0));
            }
         }

         if (this.gj().b) {
            double $$4 = this.dy().e;
            super.a_($$0);
            this.i(this.dy().a(jn.a.b, $$4 * 0.6));
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
      return !this.dV().a_($$0).j(this.dV(), $$0);
   }

   @Override
   public float fp() {
      return (float)this.h(bwq.v);
   }

   @Override
   public boolean a(float $$0, float $$1, btc $$2) {
      if (this.j.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(awk.t, (int)Math.round((double)$$0 * 100.0));
         }

         boolean $$3 = this.cy != null && this.cH;
         float $$4;
         if ($$3) {
            $$4 = Math.min($$0, (float)(this.cy.e - this.dC()));
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
   protected void b(ji $$0, dwy $$1) {
      if (this.bj()) {
         this.aY();
         this.b($$1);
      } else {
         ji $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dwy $$3 = this.dV().a_($$2);
            if ($$3.a(awp.bq)) {
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
   public bvi.a eM() {
      return new bvi.a(awa.uR, awa.uH);
   }

   @Override
   public boolean a(ard $$0, bvi $$1) {
      this.b(awk.g.b($$1.aq()));
      return true;
   }

   @Override
   public void a(dwy $$0, fbb $$1) {
      if (!this.j.b) {
         super.a($$0, $$1);
      }

      this.gO();
   }

   public void d(int $$0) {
      this.r($$0);
      this.ct = this.ct + (float)$$0 / (float)this.gs();
      this.cs = ayz.a(this.cs + $$0, 0, Integer.MAX_VALUE);

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

   public void a(cwq $$0, int $$1) {
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
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awa.uQ, this.dm(), $$1 * 0.75F, 1.0F);
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
         if (!this.dV().C) {
            this.ce.a($$0);
         }
      }
   }

   public Optional<coc> ac() {
      return Optional.empty();
   }

   public crz gt() {
      return this.ce;
   }

   public boolean u(boolean $$0) {
      return this.j.a || $$0 || this.ce.b();
   }

   public boolean gu() {
      return this.eD() > 0.0F && this.eD() < this.eS();
   }

   public boolean gv() {
      return this.j.e;
   }

   public boolean a(ji $$0, jn $$1, cwq $$2) {
      if (this.j.e) {
         return true;
      } else {
         ji $$3 = $$0.a($$1.g());
         dxc $$4 = new dxc(this.dV(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int e(ard $$0) {
      return !$$0.O().b(dgf.d) && !this.Z_() ? Math.min(this.cr * 7, 100) : 0;
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
   protected bum.c bg() {
      return this.j.b || this.aJ() && this.cg() ? bum.c.a : bum.c.d;
   }

   public void x() {
   }

   @Override
   public wp al() {
      return wp.b(this.cC.getName());
   }

   public ctr gw() {
      return this.cb;
   }

   @Override
   public cwq a(buu $$0) {
      if ($$0 == buu.a) {
         return this.g.f();
      } else if ($$0 == buu.b) {
         return this.g.i.getFirst();
      } else {
         return $$0.a() == buu.a.b ? this.g.h.get($$0.b()) : cwq.j;
      }
   }

   @Override
   protected boolean b(buu $$0) {
      return $$0.a() == buu.a.b;
   }

   @Override
   public void a(buu $$0, cwq $$1) {
      this.c($$1);
      if ($$0 == buu.a) {
         this.a($$0, this.g.g.set(this.g.j, $$1), $$1);
      } else if ($$0 == buu.b) {
         this.a($$0, this.g.i.set(0, $$1), $$1);
      } else if ($$0.a() == buu.a.b) {
         this.a($$0, this.g.h.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cwq $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<cwq> fc() {
      return Lists.newArrayList(new cwq[]{this.eZ(), this.fa()});
   }

   @Override
   public Iterable<cwq> fb() {
      return this.g.h;
   }

   @Override
   public boolean e(buu $$0) {
      return $$0 != buu.g;
   }

   public boolean h(tq $$0) {
      if (this.bZ() || !this.aJ() || this.bj() || this.av) {
         return false;
      } else if (this.gA().g()) {
         this.i($$0);
         this.f = this.dV().ad();
         return true;
      } else if (this.gB().g()) {
         this.j($$0);
         this.f = this.dV().ad();
         return true;
      } else {
         return false;
      }
   }

   protected void gx() {
      if (this.f + 20L < this.dV().ad()) {
         this.k(this.gA());
         this.i(new tq());
         this.k(this.gB());
         this.j(new tq());
      }
   }

   private void k(tq $$0) {
      if (!this.dV().C && !$$0.g()) {
         but.a($$0, this.dV(), bus.r).ifPresent($$0x -> {
            if ($$0x instanceof bwf) {
               ((bwf)$$0x).b(this.at);
            }

            $$0x.a_(this.dA(), this.dC() + 0.7F, this.dG());
            ((ard)this.dV()).c($$0x);
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

   public fcg gy() {
      return this.dV().R();
   }

   @Override
   public wp p_() {
      xd $$0 = fcb.a(this.cr(), this.al());
      return this.a($$0);
   }

   private xd a(xd $$0) {
      String $$1 = this.gh().getName();
      return $$0.a($$1x -> $$1x.a(new wn(wn.a.d, "/tell " + $$1 + " ")).a(this.cQ()).a($$1));
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

   public boolean a(coz $$0) {
      return (this.au().a(bW) & $$0.a()) == $$0.a();
   }

   @Override
   public bwa a_(int $$0) {
      if ($$0 == 499) {
         return new bwa() {
            @Override
            public cwq a() {
               return coy.this.cd.g();
            }

            @Override
            public boolean a(cwq $$0) {
               coy.this.cd.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bwa() {
               @Override
               public cwq a() {
                  return coy.this.cc.r().a($$1);
               }

               @Override
               public boolean a(cwq $$0) {
                  coy.this.cc.r().a($$1, $$0);
                  coy.this.cc.a(coy.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.g.size()) {
            return bwa.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.cb.b() ? bwa.a(this.cb, $$2) : super.a_($$0);
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
   public bvc fy() {
      return this.al.a(bX) == 0 ? bvc.a : bvc.b;
   }

   public void b(bvc $$0) {
      this.al.a(bX, (byte)($$0 == bvc.a ? 0 : 1));
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
      return (float)(1.0 / this.h(bwq.e) * 20.0);
   }

   public float H(float $$0) {
      return ayz.a(((float)this.aS + $$0) / this.gC(), 0.0F, 1.0F);
   }

   public void gD() {
      this.aS = 0;
   }

   public cwn gE() {
      return this.cF;
   }

   @Override
   protected float aT() {
      return !this.j.b && !this.fJ() ? super.aT() : 1.0F;
   }

   public float gF() {
      return (float)this.h(bwq.q);
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
   public bup e(bvu $$0) {
      return c.getOrDefault($$0, bV);
   }

   @Override
   public ImmutableList<bvu> fO() {
      return ImmutableList.of(bvu.a, bvu.f, bvu.d);
   }

   @Override
   public cwq d(cwq $$0) {
      if (!($$0.h() instanceof cxm)) {
         return cwq.j;
      } else {
         Predicate<cwq> $$1 = ((cxm)$$0.h()).d();
         cwq $$2 = cxm.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((cxm)$$0.h()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cwq $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.j.d ? new cwq(cwu.pb) : cwq.j;
         }
      }
   }

   @Override
   public fbb u(float $$0) {
      double $$1 = 0.22 * (this.fy() == bvc.b ? -1.0 : 1.0);
      float $$2 = ayz.h($$0 * 0.5F, this.dN(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = ayz.h($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      if (this.fJ() || this.fv()) {
         fbb $$4 = this.g($$0);
         fbb $$5 = this.dy();
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

         return this.o($$0).e(new fbb($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cl()) {
         return this.o($$0).e(new fbb($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cR().c() - 1.0;
         double $$13 = this.ci() ? -0.2 : 0.07;
         return this.o($$0).e(new fbb($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dU() {
      return true;
   }

   public boolean gH() {
      return this.fz() && this.fB().a(cwu.rU);
   }

   @Override
   public boolean dT() {
      return false;
   }

   public Optional<jq> gI() {
      return this.cG;
   }

   public void c(Optional<jq> $$0) {
      this.cG = $$0;
   }

   @Override
   public float eJ() {
      return this.cx;
   }

   @Override
   public void p(float $$0) {
      super.p($$0);
      this.cx = $$0;
   }

   @Override
   public boolean dO() {
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
      return this.h(bwq.g);
   }

   public double gM() {
      return this.h(bwq.j);
   }

   public boolean b(bum $$0, double $$1) {
      return $$0.dQ() ? false : this.a($$0.cR(), $$1);
   }

   public boolean a(faw $$0, double $$1) {
      double $$2 = this.gM() + $$1;
      return $$0.e(this.bF()) < $$2 * $$2;
   }

   public boolean a(ji $$0, double $$1) {
      double $$2 = this.gL() + $$1;
      return new faw($$0).e(this.bF()) < $$2 * $$2;
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
   public boolean di() {
      return true;
   }

   @Override
   public boolean q_() {
      return this.j.b ? false : super.q_();
   }

   public static enum a {
      a,
      b(wp.c("block.minecraft.bed.no_sleep")),
      c(wp.c("block.minecraft.bed.too_far_away")),
      d(wp.c("block.minecraft.bed.obstructed")),
      e,
      f(wp.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final wp g;

      private a() {
         this.g = null;
      }

      private a(final wp $$0) {
         this.g = $$0;
      }

      @Nullable
      public wp a() {
         return this.g;
      }
   }
}
