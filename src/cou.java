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

public abstract class cou extends bvh {
   private static final Logger a = LogUtils.getLogger();
   public static final bvb bG = bvb.b;
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
   public static final ezy bU = new ezy(0.0, 0.6, 0.0);
   public static final buo bV = buo.b(0.6F, 1.8F).b(1.62F).a(bun.a().a(bum.b, bU));
   private static final Map<bvt, buo> c = ImmutableMap.builder()
      .put(bvt.a, bV)
      .put(bvt.c, aD)
      .put(bvt.b, buo.b(0.6F, 0.6F).b(0.4F))
      .put(bvt.d, buo.b(0.6F, 0.6F).b(0.4F))
      .put(bvt.e, buo.b(0.6F, 0.6F).b(0.4F))
      .put(bvt.f, buo.b(0.6F, 1.5F).b(1.27F).a(bun.a().a(bum.b, bU)))
      .put(bvt.h, buo.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final akm<Float> d = akq.a(cou.class, ako.d);
   private static final akm<Integer> e = akq.a(cou.class, ako.b);
   protected static final akm<Byte> bW = akq.a(cou.class, ako.a);
   protected static final akm<Byte> bX = akq.a(cou.class, ako.a);
   protected static final akm<ul> bY = akq.a(cou.class, ako.t);
   protected static final akm<ul> bZ = akq.a(cou.class, ako.t);
   private long f;
   final cot g = new cot(this);
   protected ctn ca = new ctn();
   public final ctc cb;
   public crz cc;
   protected crv cd = new crv();
   protected int ce;
   public float cf;
   public float cg;
   public int ch;
   public double ci;
   public double cj;
   public double ck;
   public double cl;
   public double cm;
   public double cn;
   private int h;
   protected boolean co;
   private final coq i = new coq();
   public int cp;
   public int cq;
   public float cr;
   protected int cs;
   protected final float ct = 0.02F;
   private int j;
   private final GameProfile k;
   private boolean cy;
   private cwm cB = cwm.k;
   private final cwj cC = this.g();
   private Optional<jp> cD = Optional.empty();
   @Nullable
   public cpj cu;
   protected float cv;
   @Nullable
   public ezy cw;
   @Nullable
   public bul cx;
   private boolean cE;
   private int cF;

   public cou(dfm $$0, jh $$1, float $$2, GameProfile $$3) {
      super(bus.bO, $$0);
      this.a_($$3.getId());
      this.k = $$3;
      this.cb = new ctc(this.g, !$$0.C, this);
      this.cc = this.cb;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bj = 180.0F;
   }

   public boolean a(dfm $$0, jh $$1, dfj $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dfj.d) {
         return true;
      } else if (this.gt()) {
         return false;
      } else {
         cwm $$3 = this.eX();
         return $$3.f() || !$$3.b(new dvz($$0, $$1, false));
      }
   }

   public static bwo.a fV() {
      return bvh.ed().a(bwp.c, 1.0).a(bwp.v, 0.1F).a(bwp.e).a(bwp.q).a(bwp.g, 4.5).a(bwp.j, 3.0).a(bwp.f).a(bwp.C).a(bwp.z).a(bwp.t).a(bwp.D);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(bW, (byte)0);
      $$0.a(bX, (byte)bG.b());
      $$0.a(bY, new ul());
      $$0.a(bZ, new ul());
   }

   @Override
   public void h() {
      this.ad = this.Y_();
      if (this.Y_()) {
         this.d(false);
      }

      if (this.ch > 0) {
         this.ch--;
      }

      if (this.fP()) {
         this.h++;
         if (this.h > 100) {
            this.h = 100;
         }

         if (!this.dV().C && this.dV().T()) {
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
      if (!this.dV().C && this.cc != null && !this.cc.b(this)) {
         this.p();
         this.cc = this.cb;
      }

      this.t();
      if (this instanceof arq $$0) {
         this.cd.a($$0);
         this.a(awx.k);
         this.a(awx.l);
         if (this.bL()) {
            this.a(awx.m);
         }

         if (this.cg()) {
            this.a(awx.o);
         }

         if (!this.fP()) {
            this.a(awx.n);
         }
      }

      int $$1 = 29999999;
      double $$2 = azm.a(this.dA(), -2.9999999E7, 2.9999999E7);
      double $$3 = azm.a(this.dG(), -2.9999999E7, 2.9999999E7);
      if ($$2 != this.dA() || $$3 != this.dG()) {
         this.a_($$2, this.dC(), $$3);
      }

      this.aR++;
      cwm $$4 = this.eX();
      if (!cwm.a(this.cB, $$4)) {
         if (!cwm.b(this.cB, $$4)) {
            this.gB();
         }

         this.cB = $$4.v();
      }

      if (!this.a(axi.a) && this.c(cwq.op)) {
         this.n();
      }

      this.cC.a();
      this.ga();
      if (this.cF > 0) {
         this.cF--;
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
      this.co = this.a(axi.a);
      return this.co;
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

   private void n() {
      this.a(new btq(bts.m, 200, 0, false, false, true));
   }

   private boolean c(cwi $$0) {
      for (but $$1 : but.i) {
         cwm $$2 = this.a($$1);
         ddy $$3 = $$2.a(ku.D);
         if ($$2.a($$0) && $$3 != null && $$3.a() == $$1) {
            return true;
         }
      }

      return false;
   }

   protected cwj g() {
      return new cwj();
   }

   private void t() {
      this.ci = this.cl;
      this.cj = this.cm;
      this.ck = this.cn;
      double $$0 = this.dA() - this.cl;
      double $$1 = this.dC() - this.cm;
      double $$2 = this.dG() - this.cn;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cl = this.dA();
         this.ci = this.cl;
      }

      if ($$2 > 10.0) {
         this.cn = this.dG();
         this.ck = this.cn;
      }

      if ($$1 > 10.0) {
         this.cm = this.dC();
         this.cj = this.cm;
      }

      if ($$0 < -10.0) {
         this.cl = this.dA();
         this.ci = this.cl;
      }

      if ($$2 < -10.0) {
         this.cn = this.dG();
         this.ck = this.cn;
      }

      if ($$1 < -10.0) {
         this.cm = this.dC();
         this.cj = this.cm;
      }

      this.cl += $$0 * 0.25;
      this.cn += $$2 * 0.25;
      this.cm += $$1 * 0.25;
   }

   protected void ga() {
      if (this.h(bvt.d)) {
         bvt $$0;
         if (this.fH()) {
            $$0 = bvt.b;
         } else if (this.fP()) {
            $$0 = bvt.c;
         } else if (this.ck()) {
            $$0 = bvt.d;
         } else if (this.ft()) {
            $$0 = bvt.e;
         } else if (this.cd() && !this.i.b) {
            $$0 = bvt.f;
         } else {
            $$0 = bvt.a;
         }

         bvt $$6;
         if (this.Y_() || this.bZ() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bvt.f)) {
            $$6 = bvt.f;
         } else {
            $$6 = bvt.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bvt $$0) {
      return this.dV().a(this, this.a($$0).a(this.dt()).h(1.0E-7));
   }

   @Override
   protected awm aV() {
      return awn.ut;
   }

   @Override
   protected awm aW() {
      return awn.ur;
   }

   @Override
   protected awm aX() {
      return awn.us;
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
         this.w();
      } else if ($$0 == 23) {
         this.cy = false;
      } else if ($$0 == 22) {
         this.cy = true;
      } else {
         super.b($$0);
      }
   }

   protected void p() {
      this.cc = this.cb;
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
         this.cf = this.cg;
         this.cg = 0.0F;
      }
   }

   @Override
   protected void fs() {
      super.fs();
      this.eV();
      this.aY = this.dL();
   }

   @Override
   public void d_() {
      if (this.ce > 0) {
         this.ce--;
      }

      this.j();
      this.g.j();
      this.cf = this.cg;
      if (this.i.b && !this.bZ()) {
         this.k();
      }

      super.d_();
      this.C((float)this.h(bwp.v));
      float $$1;
      if (this.aJ() && !this.eE() && !this.ck()) {
         $$1 = Math.min(0.1F, (float)this.dy().i());
      } else {
         $$1 = 0.0F;
      }

      this.cg = this.cg + ($$1 - this.cg) * 0.4F;
      if (this.eD() > 0.0F && !this.Y_()) {
         ezt $$2;
         if (this.bZ() && !this.dk().dQ()) {
            $$2 = this.cR().b(this.dk().cR()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cR().c(1.0, 0.5, 1.0);
         }

         List<bul> $$4 = this.dV().a_(this, $$2);
         List<bul> $$5 = Lists.newArrayList();

         for (bul $$6 : $$4) {
            if ($$6.aq() == bus.U) {
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

   private void c(@Nullable ul $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dV().A.a(200) == 0) {
         String $$1 = $$0.l("id");
         bus.a($$1).filter($$0x -> $$0x == bus.aL).ifPresent($$0x -> {
            if (!cho.a(this.dV(), this)) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), cho.a(this.dV(), this.dV().A), this.dm(), 1.0F, cho.a(this.dV().A));
            }
         });
      }
   }

   private void d(bul $$0) {
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

   public void a(int $$0, float $$1, cwm $$2) {
      this.bB = $$0;
      this.bC = $$1;
      this.bD = $$2;
      if (!this.dV().C) {
         this.gv();
         this.c(4, true);
      }
   }

   @Nonnull
   @Override
   public cwm dZ() {
      return this.ft() && this.bD != null ? this.bD : super.dZ();
   }

   @Override
   public void a(btb $$0) {
      super.a($$0);
      this.ay();
      if (!this.Y_() && this.dV() instanceof arp $$1) {
         this.b($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-azm.b((this.eJ() + this.dL()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-azm.a((this.eJ() + this.dL()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(awx.N);
      this.a(awx.i.b(awx.m));
      this.a(awx.i.b(awx.n));
      this.aH();
      this.c(false);
      this.c(Optional.of(jp.a(this.dV().ag(), this.dv())));
   }

   @Override
   protected void f(arp $$0) {
      super.f($$0);
      if (!$$0.N().b(dfi.d)) {
         this.gc();
         this.g.k();
      }
   }

   protected void gc() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cwm $$1 = this.g.a($$0);
         if (!$$1.f() && dcf.a($$1, dce.D)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected awm e(btb $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected awm n_() {
      return awn.uj;
   }

   @Override
   public void g(cwm $$0) {
   }

   @Nullable
   public clc a(cwm $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public clc a(cwm $$0, boolean $$1, boolean $$2) {
      if (!$$0.f() && this.dV().C) {
         this.a(bsj.a);
      }

      return null;
   }

   public float c(dvv $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(bwp.t);
      }

      if (btr.a(this)) {
         $$1 *= 1.0F + (float)(btr.b(this) + 1) * 0.2F;
      }

      if (this.b(bts.d)) {
         float $$2 = switch (this.c(bts.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.h(bwp.f);
      if (this.a(axi.a)) {
         $$1 *= (float)this.g(bwp.C).g();
      }

      if (!this.aJ()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dvv $$0) {
      return !$$0.C() || this.g.f().b($$0);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.a_(this.k.getId());
      ur $$1 = $$0.c("Inventory", 10);
      this.g.b($$1);
      this.g.j = $$0.h("SelectedItemSlot");
      this.h = $$0.g("SleepTimer");
      this.cr = $$0.j("XpP");
      this.cp = $$0.h("XpLevel");
      this.cq = $$0.h("XpTotal");
      this.cs = $$0.h("XpSeed");
      if (this.cs == 0) {
         this.cs = this.ae.f();
      }

      this.q($$0.h("Score"));
      this.cd.a($$0);
      this.i.b($$0);
      this.g(bwp.v).a((double)this.i.b());
      if ($$0.b("EnderItems", 9)) {
         this.ca.a($$0.c("EnderItems", 10), this.dX());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.c(jp.b.parse(uz.a, $$0.c("LastDeathLocation")).resultOrPartial(a::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         ezy.a.parse(uz.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(a::error).ifPresent($$0x -> this.cw = $$0x);
      }

      this.cE = $$0.q("ignore_fall_damage_from_current_explosion");
      this.cF = $$0.h("current_impulse_context_reset_grace_time");
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      va.e($$0);
      $$0.a("Inventory", this.g.a(new ur()));
      $$0.a("SelectedItemSlot", this.g.j);
      $$0.a("SleepTimer", (short)this.h);
      $$0.a("XpP", this.cr);
      $$0.a("XpLevel", this.cp);
      $$0.a("XpTotal", this.cq);
      $$0.a("XpSeed", this.cs);
      $$0.a("Score", this.gb());
      this.cd.b($$0);
      this.i.a($$0);
      $$0.a("EnderItems", this.ca.a(this.dX()));
      if (!this.gy().g()) {
         $$0.a("ShoulderEntityLeft", this.gy());
      }

      if (!this.gz().g()) {
         $$0.a("ShoulderEntityRight", this.gz());
      }

      this.gG().flatMap($$0x -> jp.b.encodeStart(uz.a, $$0x).resultOrPartial(a::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cw != null) {
         $$0.a("current_explosion_impact_pos", (vi)ezy.a.encodeStart(uz.a, this.cw).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cE);
      $$0.a("current_impulse_context_reset_grace_time", this.cF);
   }

   @Override
   public boolean a(arp $$0, btb $$1) {
      if (super.a($$0, $$1)) {
         return true;
      } else if ($$1.a(axe.n)) {
         return !$$0.N().b(dfi.G);
      } else if ($$1.a(axe.m)) {
         return !$$0.N().b(dfi.H);
      } else if ($$1.a(axe.i)) {
         return !$$0.N().b(dfi.I);
      } else {
         return $$1.a(axe.o) ? !$$0.N().b(dfi.J) : false;
      }
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.i.a && !$$1.a(axe.d)) {
         return false;
      } else {
         this.be = 0;
         if (this.eE()) {
            return false;
         } else {
            this.gv();
            if ($$1.g()) {
               if ($$0.ak() == bsh.a) {
                  $$2 = 0.0F;
               }

               if ($$0.ak() == bsh.b) {
                  $$2 = Math.min($$2 / 2.0F + 1.0F, $$2);
               }

               if ($$0.ak() == bsh.d) {
                  $$2 = $$2 * 3.0F / 2.0F;
               }
            }

            return $$2 == 0.0F ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void d(bvh $$0) {
      super.d($$0);
      cwm $$1 = this.fF();
      if ($$0.fS() && $$1 != null) {
         this.h($$1);
      }
   }

   @Override
   public boolean ew() {
      return !this.gh().a && super.ew();
   }

   public boolean a(cou $$0) {
      fbf $$1 = this.cr();
      fbf $$2 = $$0.cr();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void c(btb $$0, float $$1) {
      this.a($$0, $$1, new but[]{but.c, but.d, but.e, but.f});
   }

   @Override
   protected void d(btb $$0, float $$1) {
      this.a($$0, $$1, new but[]{but.f});
   }

   @Override
   protected void z(float $$0) {
      if (this.by.a(cwq.vK)) {
         if (!this.dV().C) {
            this.b(awx.c.b(this.by.h()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + azm.d($$0);
            bsj $$2 = this.fy();
            this.by.a($$1, this, d($$2));
            if (this.by.f()) {
               if ($$2 == bsj.a) {
                  this.a(but.a, cwm.k);
               } else {
                  this.a(but.b, cwm.k);
               }

               this.by = cwm.k;
               this.a(awn.wD, 0.8F, 0.8F + this.dV().A.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void b(arp $$0, btb $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var8 = Math.max($$2 - this.fu(), 0.0F);
         this.E(this.fu() - ($$2 - var8));
         float $$4 = $$2 - var8;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
            this.a(awx.L, Math.round($$4 * 10.0F));
         }

         if (var8 != 0.0F) {
            this.G($$1.a());
            this.eP().a($$1, var8);
            this.x(this.eD() - var8);
            if (var8 < 3.4028235E37F) {
               this.a(awx.J, Math.round(var8 * 10.0F));
            }

            this.a(ear.o);
         }
      }
   }

   public boolean aa() {
      return false;
   }

   public void a(duk $$0, boolean $$1) {
   }

   public void a(dem $$0) {
   }

   public void a(dti $$0) {
   }

   public void a(dup $$0) {
   }

   public void a(dua $$0) {
   }

   public void a(cjc $$0, bsd $$1) {
   }

   public OptionalInt a(@Nullable bsm $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dek $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cwm $$0, bsj $$1) {
   }

   public bsk a(bul $$0, bsj $$1) {
      if (this.Y_()) {
         if ($$0 instanceof bsm) {
            this.a((bsm)$$0);
         }

         return bsk.e;
      } else {
         cwm $$2 = this.b($$1);
         cwm $$3 = $$2.v();
         bsk $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.i.d && $$2 == this.b($$1) && $$2.L() < $$3.L()) {
               $$2.e($$3.L());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof bvh) {
               if (this.i.d) {
                  $$2 = $$3;
               }

               bsk $$5 = $$2.a(this, (bvh)$$0, $$1);
               if ($$5.a()) {
                  this.dV().a(ear.r, $$0.dt(), ear.a.a(this));
                  if ($$2.f() && !this.i.d) {
                     this.a($$1, cwm.k);
                  }

                  return $$5;
               }
            }

            return bsk.e;
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
   protected ezy a(ezy $$0, bvl $$1) {
      float $$2 = this.dP();
      if (!this.i.b && !($$0.e > 0.0) && ($$1 == bvl.a || $$1 == bvl.b) && this.fY() && this.I($$2)) {
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

         return new ezy($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean I(float $$0) {
      return this.aJ() || this.Z < $$0 && !this.b(0.0, 0.0, $$0 - this.Z);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      ezt $$3 = this.cR();
      return this.dV().a(this, new ezt($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(bul $$0) {
      if ($$0.cB()) {
         if (!$$0.v(this)) {
            float $$1 = this.ft() ? this.bC : (float)this.h(bwp.c);
            cwm $$2 = this.dZ();
            btb $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.dW().a(this));
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.H(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gB();
            if ($$0.aq().a(axg.H) && $$0 instanceof cpn $$6 && $$6.a(cpo.c, this, this, true)) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.uc, this.dm());
               return;
            }

            if ($$1 > 0.0F || $$4 > 0.0F) {
               boolean $$7 = $$5 > 0.9F;
               boolean $$8;
               if (this.cj() && $$7) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.ub, this.dm(), 1.0F, 1.0F);
                  $$8 = true;
               } else {
                  $$8 = false;
               }

               $$1 += $$2.h().a($$0, $$1, $$3);
               boolean $$10 = $$7
                  && this.Z > 0.0F
                  && !this.aJ()
                  && !this.p_()
                  && !this.bj()
                  && !this.b(bts.o)
                  && !this.bZ()
                  && $$0 instanceof bvh
                  && !this.cj();
               if ($$10) {
                  $$1 *= 1.5F;
               }

               float $$11 = $$1 + $$4;
               boolean $$12 = false;
               if ($$7 && !$$10 && !$$8 && this.aJ()) {
                  double $$13 = this.ah().j();
                  double $$14 = (double)this.fn() * 2.5;
                  if ($$13 < azm.k($$14) && this.b(bsj.a).a(axl.bI)) {
                     $$12 = true;
                  }
               }

               float $$15 = 0.0F;
               if ($$0 instanceof bvh $$16) {
                  $$15 = $$16.eD();
               }

               ezy $$17 = $$0.dy();
               boolean $$18 = $$0.b($$3, $$11);
               if ($$18) {
                  float $$19 = this.a($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                  if ($$19 > 0.0F) {
                     if ($$0 instanceof bvh $$20) {
                        $$20.p(
                           (double)($$19 * 0.5F), (double)azm.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azm.b(this.dL() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.j(
                           (double)(-azm.a(this.dL() * (float) (Math.PI / 180.0)) * $$19 * 0.5F),
                           0.1,
                           (double)(azm.b(this.dL() * (float) (Math.PI / 180.0)) * $$19 * 0.5F)
                        );
                     }

                     this.h(this.dy().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$12) {
                     float $$21 = 1.0F + (float)this.h(bwp.D) * $$1;

                     for (bvh $$23 : this.dV().a(bvh.class, $$0.cR().c(1.0, 0.25, 1.0))) {
                        if ($$23 != this && $$23 != $$0 && !this.s($$23) && (!($$23 instanceof ckr) || !((ckr)$$23).x()) && this.g((bul)$$23) < 9.0) {
                           float $$24 = this.a($$23, $$21, $$3) * $$5;
                           $$23.p(0.4F, (double)azm.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azm.b(this.dL() * (float) (Math.PI / 180.0))));
                           $$23.a($$3, $$24);
                           if (this.dV() instanceof arp $$25) {
                              dcf.a($$25, (bul)$$23, $$3);
                           }
                        }
                     }

                     this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.ue, this.dm(), 1.0F, 1.0F);
                     this.gd();
                  }

                  if ($$0 instanceof arq && $$0.T) {
                     ((arq)$$0).f.b(new afn($$0));
                     $$0.T = false;
                     $$0.h($$17);
                  }

                  if ($$10) {
                     this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.ua, this.dm(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$10 && !$$12) {
                     if ($$7) {
                        this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.ud, this.dm(), 1.0F, 1.0F);
                     } else {
                        this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.uf, this.dm(), 1.0F, 1.0F);
                     }
                  }

                  if ($$4 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  bul $$26 = $$0;
                  if ($$0 instanceof cjs) {
                     $$26 = ((cjs)$$0).a;
                  }

                  boolean $$27 = false;
                  if (this.dV() instanceof arp $$28) {
                     if ($$26 instanceof bvh $$29) {
                        $$27 = $$2.a($$29, this);
                     }

                     dcf.a($$28, $$0, $$3);
                  }

                  if (!this.dV().C && !$$2.f() && $$26 instanceof bvh) {
                     if ($$27) {
                        $$2.b((bvh)$$26, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.eX()) {
                           this.a(bsj.a, cwm.k);
                        } else {
                           this.a(bsj.b, cwm.k);
                        }
                     }
                  }

                  if ($$0 instanceof bvh) {
                     float $$30 = $$15 - ((bvh)$$0).eD();
                     this.a(awx.G, Math.round($$30 * 10.0F));
                     if (this.dV() instanceof arp && $$30 > 2.0F) {
                        int $$31 = (int)((double)$$30 * 0.5);
                        ((arp)this.dV()).a(ls.g, $$0.dA(), $$0.e(0.5), $$0.dG(), $$31, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.G(0.1F);
               } else {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.uc, this.dm(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(bul $$0, float $$1, btb $$2) {
      return $$1;
   }

   @Override
   protected void g(bvh $$0) {
      this.e($$0);
   }

   public void h(cwm $$0) {
      this.gC().a($$0, 100);
      this.fD();
      this.dV().a(this, (byte)30);
   }

   public void b(bul $$0) {
   }

   @Override
   public void c(bul $$0) {
   }

   public void gd() {
      double $$0 = (double)(-azm.a(this.dL() * (float) (Math.PI / 180.0)));
      double $$1 = (double)azm.b(this.dL() * (float) (Math.PI / 180.0));
      if (this.dV() instanceof arp) {
         ((arp)this.dV()).a(ls.aj, this.dA() + $$0, this.e(0.5), this.dG() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void ge() {
   }

   @Override
   public void a(bul.c $$0) {
      super.a($$0);
      this.cb.a(this);
      if (this.cc != null && this.gi()) {
         this.q();
      }
   }

   public boolean c() {
      return false;
   }

   public GameProfile gf() {
      return this.k;
   }

   public cot gg() {
      return this.g;
   }

   public coq gh() {
      return this.i;
   }

   @Override
   public boolean fT() {
      return this.i.d;
   }

   public void a(cwm $$0, cwm $$1, csj $$2) {
   }

   public boolean gi() {
      return this.cc != this.cb;
   }

   public boolean gj() {
      return true;
   }

   public Either<cou.a, bas> a(jh $$0) {
      this.b($$0);
      this.h = 0;
      return Either.right(bas.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fQ();
      if (this.dV() instanceof arp && $$1) {
         ((arp)this.dV()).f();
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

   public void a(xj $$0, boolean $$1) {
   }

   public void a(alj $$0) {
      this.b(awx.i.b($$0));
   }

   public void a(alj $$0, int $$1) {
      this.a(awx.i.b($$0), $$1);
   }

   public void b(awu<?> $$0) {
      this.a($$0, 1);
   }

   public void a(awu<?> $$0, int $$1) {
   }

   public void a(awu<?> $$0) {
   }

   public int a(Collection<dbc<?>> $$0) {
      return 0;
   }

   public void a(dbc<?> $$0, List<cwm> $$1) {
   }

   public void b(List<alj> $$0) {
   }

   public int b(Collection<dbc<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(ezy $$0) {
      if (this.bZ()) {
         super.a_($$0);
      } else {
         if (this.ck()) {
            double $$1 = this.bT().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bm || !this.dV().b_(jh.a(this.dA(), this.dC() + 1.0 - 0.1, this.dG())).c()) {
               ezy $$3 = this.dy();
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
      return (float)this.h(bwp.v);
   }

   @Override
   public boolean a(float $$0, float $$1, btb $$2) {
      if (this.i.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(awx.t, (int)Math.round((double)$$0 * 100.0));
         }

         boolean $$3 = this.cw != null && this.cE;
         float $$4;
         if ($$3) {
            $$4 = Math.min($$0, (float)(this.cw.e - this.dC()));
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
      if (!this.Y_()) {
         super.bs();
      }
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      if (this.bj()) {
         this.aY();
         this.b($$1);
      } else {
         jh $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dvv $$3 = this.dV().a_($$2);
            if ($$3.a(axc.bp)) {
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
   public bvh.a eL() {
      return new bvh.a(awn.uq, awn.ug);
   }

   @Override
   public boolean a(arp $$0, bvh $$1) {
      this.b(awx.g.b($$1.aq()));
      return true;
   }

   @Override
   public void a(dvv $$0, ezy $$1) {
      if (!this.i.b) {
         super.a($$0, $$1);
      }

      this.gK();
   }

   public void d(int $$0) {
      this.r($$0);
      this.cr = this.cr + (float)$$0 / (float)this.gq();
      this.cq = azm.a(this.cq + $$0, 0, Integer.MAX_VALUE);

      while (this.cr < 0.0F) {
         float $$1 = this.cr * (float)this.gq();
         if (this.cp > 0) {
            this.c(-1);
            this.cr = 1.0F + $$1 / (float)this.gq();
         } else {
            this.c(-1);
            this.cr = 0.0F;
         }
      }

      while (this.cr >= 1.0F) {
         this.cr = (this.cr - 1.0F) * (float)this.gq();
         this.c(1);
         this.cr = this.cr / (float)this.gq();
      }
   }

   public int gp() {
      return this.cs;
   }

   public void a(cwm $$0, int $$1) {
      this.cp -= $$1;
      if (this.cp < 0) {
         this.cp = 0;
         this.cr = 0.0F;
         this.cq = 0;
      }

      this.cs = this.ae.f();
   }

   public void c(int $$0) {
      this.cp = IntMath.saturatedAdd(this.cp, $$0);
      if (this.cp < 0) {
         this.cp = 0;
         this.cr = 0.0F;
         this.cq = 0;
      }

      if ($$0 > 0 && this.cp % 5 == 0 && (float)this.j < (float)this.af - 100.0F) {
         float $$1 = this.cp > 30 ? 1.0F : (float)this.cp / 30.0F;
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.up, this.dm(), $$1 * 0.75F, 1.0F);
         this.j = this.af;
      }
   }

   public int gq() {
      if (this.cp >= 30) {
         return 112 + (this.cp - 30) * 9;
      } else {
         return this.cp >= 15 ? 37 + (this.cp - 15) * 5 : 7 + this.cp * 2;
      }
   }

   public void G(float $$0) {
      if (!this.i.a) {
         if (!this.dV().C) {
            this.cd.a($$0);
         }
      }
   }

   public Optional<cny> ac() {
      return Optional.empty();
   }

   public crv gr() {
      return this.cd;
   }

   public boolean u(boolean $$0) {
      return this.i.a || $$0 || this.cd.b();
   }

   public boolean gs() {
      return this.eD() > 0.0F && this.eD() < this.eR();
   }

   public boolean gt() {
      return this.i.e;
   }

   public boolean a(jh $$0, jm $$1, cwm $$2) {
      if (this.i.e) {
         return true;
      } else {
         jh $$3 = $$0.a($$1.g());
         dvz $$4 = new dvz(this.dV(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int e(arp $$0) {
      return !$$0.N().b(dfi.d) && !this.Y_() ? Math.min(this.cp * 7, 100) : 0;
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
   protected bul.b bg() {
      return this.i.b || this.aJ() && this.cg() ? bul.b.a : bul.b.d;
   }

   public void x() {
   }

   @Override
   public xj al() {
      return xj.b(this.k.getName());
   }

   public ctn gu() {
      return this.ca;
   }

   @Override
   public cwm a(but $$0) {
      if ($$0 == but.a) {
         return this.g.f();
      } else if ($$0 == but.b) {
         return this.g.i.getFirst();
      } else {
         return $$0.a() == but.a.b ? this.g.h.get($$0.b()) : cwm.k;
      }
   }

   @Override
   protected boolean b(but $$0) {
      return $$0.a() == but.a.b;
   }

   @Override
   public void a(but $$0, cwm $$1) {
      this.c($$1);
      if ($$0 == but.a) {
         this.a($$0, this.g.g.set(this.g.j, $$1), $$1);
      } else if ($$0 == but.b) {
         this.a($$0, this.g.i.set(0, $$1), $$1);
      } else if ($$0.a() == but.a.b) {
         this.a($$0, this.g.h.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cwm $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<cwm> fa() {
      return Lists.newArrayList(new cwm[]{this.eX(), this.eY()});
   }

   @Override
   public Iterable<cwm> eZ() {
      return this.g.h;
   }

   @Override
   public boolean e(but $$0) {
      return $$0 != but.g;
   }

   public boolean h(ul $$0) {
      if (this.bZ() || !this.aJ() || this.bj() || this.av) {
         return false;
      } else if (this.gy().g()) {
         this.i($$0);
         this.f = this.dV().ab();
         return true;
      } else if (this.gz().g()) {
         this.j($$0);
         this.f = this.dV().ab();
         return true;
      } else {
         return false;
      }
   }

   protected void gv() {
      if (this.f + 20L < this.dV().ab()) {
         this.k(this.gy());
         this.i(new ul());
         this.k(this.gz());
         this.j(new ul());
      }
   }

   private void k(ul $$0) {
      if (!this.dV().C && !$$0.g()) {
         bus.a($$0, this.dV(), bur.r).ifPresent($$0x -> {
            if ($$0x instanceof bwe) {
               ((bwe)$$0x).b(this.at);
            }

            $$0x.a_(this.dA(), this.dC() + 0.7F, this.dG());
            ((arp)this.dV()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean Y_();

   @Override
   public boolean bG() {
      return !this.Y_() && super.bG();
   }

   @Override
   public boolean ck() {
      return !this.i.b && !this.Y_() && super.ck();
   }

   public abstract boolean b();

   @Override
   public boolean cJ() {
      return !this.i.b;
   }

   public fbd gw() {
      return this.dV().P();
   }

   @Override
   public xj o_() {
      xx $$0 = fay.a(this.cr(), this.al());
      return this.a($$0);
   }

   private xx a(xx $$0) {
      String $$1 = this.gf().getName();
      return $$0.a($$1x -> $$1x.a(new xh(xh.a.d, "/tell " + $$1 + " ")).a(this.cQ()).a($$1));
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

   public boolean a(cov $$0) {
      return (this.au().a(bW) & $$0.a()) == $$0.a();
   }

   @Override
   public bvz a_(int $$0) {
      if ($$0 == 499) {
         return new bvz() {
            @Override
            public cwm a() {
               return cou.this.cc.g();
            }

            @Override
            public boolean a(cwm $$0) {
               cou.this.cc.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bvz() {
               @Override
               public cwm a() {
                  return cou.this.cb.r().a($$1);
               }

               @Override
               public boolean a(cwm $$0) {
                  cou.this.cb.r().a($$1, $$0);
                  cou.this.cb.a(cou.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.g.size()) {
            return bvz.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.ca.b() ? bvz.a(this.ca, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gx() {
      return this.cy;
   }

   public void v(boolean $$0) {
      this.cy = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.i.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bvb fw() {
      return this.al.a(bX) == 0 ? bvb.a : bvb.b;
   }

   public void b(bvb $$0) {
      this.al.a(bX, (byte)($$0 == bvb.a ? 0 : 1));
   }

   public ul gy() {
      return this.al.a(bY);
   }

   protected void i(ul $$0) {
      this.al.a(bY, $$0);
   }

   public ul gz() {
      return this.al.a(bZ);
   }

   protected void j(ul $$0) {
      this.al.a(bZ, $$0);
   }

   public float gA() {
      return (float)(1.0 / this.h(bwp.e) * 20.0);
   }

   public float H(float $$0) {
      return azm.a(((float)this.aR + $$0) / this.gA(), 0.0F, 1.0F);
   }

   public void gB() {
      this.aR = 0;
   }

   public cwj gC() {
      return this.cC;
   }

   @Override
   protected float aT() {
      return !this.i.b && !this.fH() ? super.aT() : 1.0F;
   }

   public float gD() {
      return (float)this.h(bwp.q);
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
   public buo e(bvt $$0) {
      return c.getOrDefault($$0, bV);
   }

   @Override
   public ImmutableList<bvt> fM() {
      return ImmutableList.of(bvt.a, bvt.f, bvt.d);
   }

   @Override
   public cwm d(cwm $$0) {
      if (!($$0.h() instanceof cxi)) {
         return cwm.k;
      } else {
         Predicate<cwm> $$1 = ((cxi)$$0.h()).d();
         cwm $$2 = cxi.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((cxi)$$0.h()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cwm $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.i.d ? new cwm(cwq.ox) : cwm.k;
         }
      }
   }

   @Override
   public ezy u(float $$0) {
      double $$1 = 0.22 * (this.fw() == bvb.b ? -1.0 : 1.0);
      float $$2 = azm.h($$0 * 0.5F, this.dN(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = azm.h($$0, this.aX, this.aW) * (float) (Math.PI / 180.0);
      if (this.fH() || this.ft()) {
         ezy $$4 = this.g($$0);
         ezy $$5 = this.dy();
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

         return this.o($$0).e(new ezy($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cl()) {
         return this.o($$0).e(new ezy($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cR().c() - 1.0;
         double $$13 = this.ci() ? -0.2 : 0.07;
         return this.o($$0).e(new ezy($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dU() {
      return true;
   }

   public boolean gF() {
      return this.fx() && this.fz().a(cwq.ro);
   }

   @Override
   public boolean dT() {
      return false;
   }

   public Optional<jp> gG() {
      return this.cD;
   }

   public void c(Optional<jp> $$0) {
      this.cD = $$0;
   }

   @Override
   public float eJ() {
      return this.cv;
   }

   @Override
   public void p(float $$0) {
      super.p($$0);
      this.cv = $$0;
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
      return this.h(bwp.g);
   }

   public double gI() {
      return this.h(bwp.j);
   }

   public boolean b(bul $$0, double $$1) {
      return $$0.dQ() ? false : this.a($$0.cR(), $$1);
   }

   public boolean a(ezt $$0, double $$1) {
      double $$2 = this.gI() + $$1;
      return $$0.e(this.bF()) < $$2 * $$2;
   }

   public boolean a(jh $$0, double $$1) {
      double $$2 = this.gH() + $$1;
      return new ezt($$0).e(this.bF()) < $$2 * $$2;
   }

   public void w(boolean $$0) {
      this.cE = $$0;
      if ($$0) {
         this.cF = 40;
      } else {
         this.cF = 0;
      }
   }

   public boolean gJ() {
      return this.cE;
   }

   public void gK() {
      if (this.cF == 0) {
         this.gL();
      }
   }

   public void gL() {
      this.cF = 0;
      this.cx = null;
      this.cw = null;
      this.cE = false;
   }

   public boolean gM() {
      return false;
   }

   public static enum a {
      a,
      b(xj.c("block.minecraft.bed.no_sleep")),
      c(xj.c("block.minecraft.bed.too_far_away")),
      d(xj.c("block.minecraft.bed.obstructed")),
      e,
      f(xj.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final xj g;

      private a() {
         this.g = null;
      }

      private a(final xj $$0) {
         this.g = $$0;
      }

      @Nullable
      public xj a() {
         return this.g;
      }
   }
}
