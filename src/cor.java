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

public abstract class cor extends bve {
   private static final Logger b = LogUtils.getLogger();
   public static final buy bH = buy.b;
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
   private static final int c = 40;
   public static final ezr bV = new ezr(0.0, 0.6, 0.0);
   public static final bul bW = bul.b(0.6F, 1.8F).b(1.62F).a(buk.a().a(buj.b, bV));
   private static final Map<bvq, bul> d = ImmutableMap.builder()
      .put(bvq.a, bW)
      .put(bvq.c, aE)
      .put(bvq.b, bul.b(0.6F, 0.6F).b(0.4F))
      .put(bvq.d, bul.b(0.6F, 0.6F).b(0.4F))
      .put(bvq.e, bul.b(0.6F, 0.6F).b(0.4F))
      .put(bvq.f, bul.b(0.6F, 1.5F).b(1.27F).a(buk.a().a(buj.b, bV)))
      .put(bvq.h, bul.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final ako<Float> e = aks.a(cor.class, akq.d);
   private static final ako<Integer> f = aks.a(cor.class, akq.b);
   protected static final ako<Byte> bX = aks.a(cor.class, akq.a);
   protected static final ako<Byte> bY = aks.a(cor.class, akq.a);
   protected static final ako<un> bZ = aks.a(cor.class, akq.t);
   protected static final ako<un> ca = aks.a(cor.class, akq.t);
   private long g;
   final coq h = new coq(this);
   protected ctg cb = new ctg();
   public final csv cc;
   public crs cd;
   protected cro ce = new cro();
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
   private int i;
   protected boolean cp;
   private final com j = new com();
   public int cq;
   public int cr;
   public float cs;
   protected int ct;
   protected final float cu = 0.02F;
   private int k;
   private final GameProfile l;
   private boolean cA;
   private cwf cB = cwf.k;
   private final cwc cC = this.k();
   private Optional<jp> cD = Optional.empty();
   @Nullable
   public cpg cv;
   protected float cw;
   @Nullable
   public ezr cx;
   @Nullable
   public bui cy;
   private boolean cE;
   private int cF;

   public cor(dff $$0, jh $$1, float $$2, GameProfile $$3) {
      super(bup.by, $$0);
      this.a_($$3.getId());
      this.l = $$3;
      this.cc = new csv(this.h, !$$0.C, this);
      this.cd = this.cc;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bk = 180.0F;
   }

   public boolean a(dff $$0, jh $$1, dfc $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dfc.d) {
         return true;
      } else if (this.gy()) {
         return false;
      } else {
         cwf $$3 = this.fc();
         return $$3.f() || !$$3.b(new dvs($$0, $$1, false));
      }
   }

   public static bwl.a ga() {
      return bve.eg().a(bwm.c, 1.0).a(bwm.v, 0.1F).a(bwm.e).a(bwm.q).a(bwm.g, 4.5).a(bwm.j, 3.0).a(bwm.f).a(bwm.C).a(bwm.z).a(bwm.t).a(bwm.D);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(e, 0.0F);
      $$0.a(f, 0);
      $$0.a(bX, (byte)0);
      $$0.a(bY, (byte)bH.b());
      $$0.a(bZ, new un());
      $$0.a(ca, new un());
   }

   @Override
   public void l() {
      this.ae = this.R_();
      if (this.R_()) {
         this.d(false);
      }

      if (this.ci > 0) {
         this.ci--;
      }

      if (this.fU()) {
         this.i++;
         if (this.i > 100) {
            this.i = 100;
         }

         if (!this.dY().C && this.dY().S()) {
            this.a(false, true);
         }
      } else if (this.i > 0) {
         this.i++;
         if (this.i >= 110) {
            this.i = 0;
         }
      }

      this.ge();
      super.l();
      if (!this.dY().C && this.cd != null && !this.cd.b(this)) {
         this.s();
         this.cd = this.cc;
      }

      this.w();
      if (!this.dY().C) {
         this.ce.a(this);
         this.a(awy.k);
         this.a(awy.l);
         if (this.bN()) {
            this.a(awy.m);
         }

         if (this.ci()) {
            this.a(awy.o);
         }

         if (!this.fU()) {
            this.a(awy.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = azn.a(this.dD(), -2.9999999E7, 2.9999999E7);
      double $$2 = azn.a(this.dJ(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dD() || $$2 != this.dJ()) {
         this.a_($$1, this.dF(), $$2);
      }

      this.aS++;
      cwf $$3 = this.fc();
      if (!cwf.a(this.cB, $$3)) {
         if (!cwf.b(this.cB, $$3)) {
            this.gG();
         }

         this.cB = $$3.v();
      }

      if (!this.a(axj.a) && this.c(cwj.op)) {
         this.q();
      }

      this.cC.a();
      this.gf();
      if (this.cF > 0) {
         this.cF--;
      }
   }

   @Override
   protected float ft() {
      return this.fJ() ? 15.0F : super.ft();
   }

   public boolean gb() {
      return this.cf();
   }

   protected boolean gc() {
      return this.cf();
   }

   protected boolean gd() {
      return this.cf();
   }

   protected boolean ge() {
      this.cp = this.a(axj.a);
      return this.cp;
   }

   @Override
   public void l(boolean $$0) {
      if (!this.gm().b) {
         super.l($$0);
      }
   }

   @Override
   public void m(boolean $$0) {
      if (!this.gm().b) {
         super.m($$0);
      }
   }

   private void q() {
      this.a(new btn(btp.m, 200, 0, false, false, true));
   }

   private boolean c(cwb $$0) {
      for (buq $$1 : buq.i) {
         cwf $$2 = this.a($$1);
         ddr $$3 = $$2.a(ku.D);
         if ($$2.a($$0) && $$3 != null && $$3.a() == $$1) {
            return true;
         }
      }

      return false;
   }

   protected cwc k() {
      return new cwc();
   }

   private void w() {
      this.cj = this.cm;
      this.ck = this.cn;
      this.cl = this.co;
      double $$0 = this.dD() - this.cm;
      double $$1 = this.dF() - this.cn;
      double $$2 = this.dJ() - this.co;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cm = this.dD();
         this.cj = this.cm;
      }

      if ($$2 > 10.0) {
         this.co = this.dJ();
         this.cl = this.co;
      }

      if ($$1 > 10.0) {
         this.cn = this.dF();
         this.ck = this.cn;
      }

      if ($$0 < -10.0) {
         this.cm = this.dD();
         this.cj = this.cm;
      }

      if ($$2 < -10.0) {
         this.co = this.dJ();
         this.cl = this.co;
      }

      if ($$1 < -10.0) {
         this.cn = this.dF();
         this.ck = this.cn;
      }

      this.cm += $$0 * 0.25;
      this.co += $$2 * 0.25;
      this.cn += $$1 * 0.25;
   }

   protected void gf() {
      if (this.h(bvq.d)) {
         bvq $$0;
         if (this.fM()) {
            $$0 = bvq.b;
         } else if (this.fU()) {
            $$0 = bvq.c;
         } else if (this.cm()) {
            $$0 = bvq.d;
         } else if (this.fy()) {
            $$0 = bvq.e;
         } else if (this.cf() && !this.j.b) {
            $$0 = bvq.f;
         } else {
            $$0 = bvq.a;
         }

         bvq $$6;
         if (this.R_() || this.cb() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bvq.f)) {
            $$6 = bvq.f;
         } else {
            $$6 = bvq.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bvq $$0) {
      return this.dY().a(this, this.a($$0).a(this.dw()).h(1.0E-7));
   }

   @Override
   protected awn aX() {
      return awo.ut;
   }

   @Override
   protected awn aY() {
      return awo.ur;
   }

   @Override
   protected awn aZ() {
      return awo.us;
   }

   @Override
   public int bZ() {
      return 10;
   }

   @Override
   public void a(awn $$0, float $$1, float $$2) {
      this.dY().a(this, this.dD(), this.dF(), this.dJ(), $$0, this.do(), $$1, $$2);
   }

   public void a(awn $$0, awp $$1, float $$2, float $$3) {
   }

   @Override
   public awp do() {
      return awp.h;
   }

   @Override
   protected int dp() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.z();
      } else if ($$0 == 23) {
         this.cA = false;
      } else if ($$0 == 22) {
         this.cA = true;
      } else {
         super.b($$0);
      }
   }

   protected void s() {
      this.cd = this.cc;
   }

   protected void t() {
   }

   @Override
   public void u() {
      if (!this.dY().C && this.gc() && this.cb()) {
         this.af();
         this.g(false);
      } else {
         super.u();
         this.cg = this.ch;
         this.ch = 0.0F;
      }
   }

   @Override
   protected void fx() {
      super.fx();
      this.fa();
      this.aZ = this.dO();
   }

   @Override
   public void n_() {
      if (this.cf > 0) {
         this.cf--;
      }

      if (this.dY().ak() == bse.a && this.dY().ac().b(dfb.k)) {
         if (this.eH() < this.eW() && this.ag % 20 == 0) {
            this.c(1.0F);
         }

         if (this.ce.e() < 20.0F && this.ag % 20 == 0) {
            this.ce.b(this.ce.e() + 1.0F);
         }

         if (this.ce.c() && this.ag % 10 == 0) {
            this.ce.a(this.ce.a() + 1);
         }
      }

      this.h.j();
      this.cg = this.ch;
      if (this.j.b && !this.cb()) {
         this.n();
      }

      super.n_();
      this.C((float)this.h(bwm.v));
      float $$1;
      if (this.aL() && !this.eI() && !this.cm()) {
         $$1 = Math.min(0.1F, (float)this.dB().i());
      } else {
         $$1 = 0.0F;
      }

      this.ch = this.ch + ($$1 - this.ch) * 0.4F;
      if (this.eH() > 0.0F && !this.R_()) {
         ezm $$2;
         if (this.cb() && !this.dm().dT()) {
            $$2 = this.cT().b(this.dm().cT()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cT().c(1.0, 0.5, 1.0);
         }

         List<bui> $$4 = this.dY().a_(this, $$2);
         List<bui> $$5 = Lists.newArrayList();

         for (bui $$6 : $$4) {
            if ($$6.ar() == bup.M) {
               $$5.add($$6);
            } else if (!$$6.dT()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ae.a($$5, this.af));
         }
      }

      this.c(this.gD());
      this.c(this.gE());
      if (!this.dY().C && (this.aa > 0.5F || this.bl()) || this.j.b || this.fU() || this.aw) {
         this.gA();
      }
   }

   private void c(@Nullable un $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dY().A.a(200) == 0) {
         String $$1 = $$0.l("id");
         bup.a($$1).filter($$0x -> $$0x == bup.ax).ifPresent($$0x -> {
            if (!chl.a(this.dY(), this)) {
               this.dY().a(null, this.dD(), this.dF(), this.dJ(), chl.a(this.dY(), this.dY().A), this.do(), 1.0F, chl.a(this.dY().A));
            }
         });
      }
   }

   private void d(bui $$0) {
      $$0.b_(this);
   }

   public int gg() {
      return this.am.a(f);
   }

   public void r(int $$0) {
      this.am.a(f, $$0);
   }

   public void s(int $$0) {
      int $$1 = this.gg();
      this.am.a(f, $$1 + $$0);
   }

   public void a(int $$0, float $$1, cwf $$2) {
      this.bC = $$0;
      this.bD = $$1;
      this.bE = $$2;
      if (!this.dY().C) {
         this.gA();
         this.c(4, true);
      }
   }

   @Nonnull
   @Override
   public cwf ec() {
      return this.fy() && this.bE != null ? this.bE : super.ec();
   }

   @Override
   public void a(bsy $$0) {
      super.a($$0);
      this.aA();
      if (!this.R_() && this.dY() instanceof arq $$1) {
         this.a($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-azn.b((this.eO() + this.dO()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-azn.a((this.eO() + this.dO()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(awy.N);
      this.a(awy.i.b(awy.m));
      this.a(awy.i.b(awy.n));
      this.aJ();
      this.c(false);
      this.c(Optional.of(jp.a(this.dY().ag(), this.dy())));
   }

   @Override
   protected void eK() {
      super.eK();
      if (!this.dY().ac().b(dfb.d)) {
         this.gh();
         this.h.k();
      }
   }

   protected void gh() {
      for (int $$0 = 0; $$0 < this.h.b(); $$0++) {
         cwf $$1 = this.h.a($$0);
         if (!$$1.f() && dby.a($$1, dbx.D)) {
            this.h.b($$0);
         }
      }
   }

   @Override
   protected awn d(bsy $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected awn o_() {
      return awo.uj;
   }

   @Override
   public void g(cwf $$0) {
   }

   @Nullable
   public ckz a(cwf $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public ckz a(cwf $$0, boolean $$1, boolean $$2) {
      if (!$$0.f() && this.dY().C) {
         this.a(bsg.a);
      }

      return null;
   }

   public float c(dvo $$0) {
      float $$1 = this.h.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(bwm.t);
      }

      if (bto.a(this)) {
         $$1 *= 1.0F + (float)(bto.b(this) + 1) * 0.2F;
      }

      if (this.b(btp.d)) {
         float $$2 = switch (this.c(btp.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.h(bwm.f);
      if (this.a(axj.a)) {
         $$1 *= (float)this.g(bwm.C).g();
      }

      if (!this.aL()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dvo $$0) {
      return !$$0.C() || this.h.f().b($$0);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.a_(this.l.getId());
      ut $$1 = $$0.c("Inventory", 10);
      this.h.b($$1);
      this.h.j = $$0.h("SelectedItemSlot");
      this.i = $$0.g("SleepTimer");
      this.cs = $$0.j("XpP");
      this.cq = $$0.h("XpLevel");
      this.cr = $$0.h("XpTotal");
      this.ct = $$0.h("XpSeed");
      if (this.ct == 0) {
         this.ct = this.af.f();
      }

      this.r($$0.h("Score"));
      this.ce.a($$0);
      this.j.b($$0);
      this.g(bwm.v).a((double)this.j.b());
      if ($$0.b("EnderItems", 9)) {
         this.cb.a($$0.c("EnderItems", 10), this.ea());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.c(jp.b.parse(vb.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         ezr.a.parse(vb.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.cx = $$0x);
      }

      this.cE = $$0.q("ignore_fall_damage_from_current_explosion");
      this.cF = $$0.h("current_impulse_context_reset_grace_time");
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      vc.e($$0);
      $$0.a("Inventory", this.h.a(new ut()));
      $$0.a("SelectedItemSlot", this.h.j);
      $$0.a("SleepTimer", (short)this.i);
      $$0.a("XpP", this.cs);
      $$0.a("XpLevel", this.cq);
      $$0.a("XpTotal", this.cr);
      $$0.a("XpSeed", this.ct);
      $$0.a("Score", this.gg());
      this.ce.b($$0);
      this.j.a($$0);
      $$0.a("EnderItems", this.cb.a(this.ea()));
      if (!this.gD().g()) {
         $$0.a("ShoulderEntityLeft", this.gD());
      }

      if (!this.gE().g()) {
         $$0.a("ShoulderEntityRight", this.gE());
      }

      this.gL().flatMap($$0x -> jp.b.encodeStart(vb.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cx != null) {
         $$0.a("current_explosion_impact_pos", (vk)ezr.a.encodeStart(vb.a, this.cx).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cE);
      $$0.a("current_impulse_context_reset_grace_time", this.cF);
   }

   @Override
   public boolean b(bsy $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(axf.n)) {
         return !this.dY().ac().b(dfb.G);
      } else if ($$0.a(axf.m)) {
         return !this.dY().ac().b(dfb.H);
      } else if ($$0.a(axf.i)) {
         return !this.dY().ac().b(dfb.I);
      } else {
         return $$0.a(axf.o) ? !this.dY().ac().b(dfb.J) : false;
      }
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.j.a && !$$0.a(axf.d)) {
         return false;
      } else {
         this.bf = 0;
         if (this.eI()) {
            return false;
         } else {
            if (!this.dY().C) {
               this.gA();
            }

            if ($$0.g()) {
               if (this.dY().ak() == bse.a) {
                  $$1 = 0.0F;
               }

               if (this.dY().ak() == bse.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dY().ak() == bse.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bve $$0) {
      super.d($$0);
      cwf $$1 = this.fK();
      if ($$0.fX() && $$1 != null) {
         this.h($$1);
      }
   }

   @Override
   public boolean eA() {
      return !this.gm().a && super.eA();
   }

   public boolean a(cor $$0) {
      fay $$1 = this.ct();
      fay $$2 = $$0.ct();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bsy $$0, float $$1) {
      this.a($$0, $$1, new buq[]{buq.c, buq.d, buq.e, buq.f});
   }

   @Override
   protected void c(bsy $$0, float $$1) {
      this.a($$0, $$1, new buq[]{buq.f});
   }

   @Override
   protected void z(float $$0) {
      if (this.bz.a(cwj.vK)) {
         if (!this.dY().C) {
            this.b(awy.c.b(this.bz.h()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + azn.d($$0);
            bsg $$2 = this.fD();
            this.bz.a($$1, this, d($$2));
            if (this.bz.f()) {
               if ($$2 == bsg.a) {
                  this.a(buq.a, cwf.k);
               } else {
                  this.a(buq.b, cwf.k);
               }

               this.bz = cwf.k;
               this.a(awo.wD, 0.8F, 0.8F + this.dY().A.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bsy $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fz(), 0.0F);
         this.E(this.fz() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(awy.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.G($$0.a());
            this.eU().a($$0, var7);
            this.x(this.eH() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(awy.J, Math.round(var7 * 10.0F));
            }

            this.a(eak.o);
         }
      }
   }

   public boolean ab() {
      return false;
   }

   public void a(dud $$0, boolean $$1) {
   }

   public void a(def $$0) {
   }

   public void a(dtb $$0) {
   }

   public void a(dui $$0) {
   }

   public void a(dtt $$0) {
   }

   public void a(ciz $$0, bsa $$1) {
   }

   public OptionalInt a(@Nullable bsj $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, ded $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cwf $$0, bsg $$1) {
   }

   public bsh a(bui $$0, bsg $$1) {
      if (this.R_()) {
         if ($$0 instanceof bsj) {
            this.a((bsj)$$0);
         }

         return bsh.e;
      } else {
         cwf $$2 = this.b($$1);
         cwf $$3 = $$2.v();
         bsh $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.j.d && $$2 == this.b($$1) && $$2.L() < $$3.L()) {
               $$2.e($$3.L());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof bve) {
               if (this.j.d) {
                  $$2 = $$3;
               }

               bsh $$5 = $$2.a(this, (bve)$$0, $$1);
               if ($$5.a()) {
                  this.dY().a(eak.r, $$0.dw(), eak.a.a(this));
                  if ($$2.f() && !this.j.d) {
                     this.a($$1, cwf.k);
                  }

                  return $$5;
               }
            }

            return bsh.e;
         }
      }
   }

   @Override
   public void bS() {
      super.bS();
      this.K = 0;
   }

   @Override
   protected boolean fl() {
      return super.fl() || this.fU();
   }

   @Override
   public boolean en() {
      return !this.j.b;
   }

   @Override
   protected ezr a(ezr $$0, bvi $$1) {
      float $$2 = this.dS();
      if (!this.j.b && !($$0.e > 0.0) && ($$1 == bvi.a || $$1 == bvi.b) && this.gd() && this.I($$2)) {
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

         return new ezr($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean I(float $$0) {
      return this.aL() || this.aa < $$0 && !this.b(0.0, 0.0, $$0 - this.aa);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      ezm $$3 = this.cT();
      return this.dY().a(this, new ezm($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(bui $$0) {
      if ($$0.cD()) {
         if (!$$0.v(this)) {
            float $$1 = this.fy() ? this.bD : (float)this.h(bwm.c);
            cwf $$2 = this.ec();
            bsy $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.dZ().a(this));
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.H(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gG();
            if ($$0.ar().a(axh.H) && $$0 instanceof cpk $$6 && $$6.a(cpl.c, this, this, true)) {
               this.dY().a(null, this.dD(), this.dF(), this.dJ(), awo.uc, this.do());
               return;
            }

            if ($$1 > 0.0F || $$4 > 0.0F) {
               boolean $$7 = $$5 > 0.9F;
               boolean $$8;
               if (this.cl() && $$7) {
                  this.dY().a(null, this.dD(), this.dF(), this.dJ(), awo.ub, this.do(), 1.0F, 1.0F);
                  $$8 = true;
               } else {
                  $$8 = false;
               }

               $$1 += $$2.h().a($$0, $$1, $$3);
               boolean $$10 = $$7
                  && this.aa > 0.0F
                  && !this.aL()
                  && !this.q_()
                  && !this.bl()
                  && !this.b(btp.o)
                  && !this.cb()
                  && $$0 instanceof bve
                  && !this.cl();
               if ($$10) {
                  $$1 *= 1.5F;
               }

               float $$11 = $$1 + $$4;
               boolean $$12 = false;
               if ($$7 && !$$10 && !$$8 && this.aL()) {
                  double $$13 = this.ai().j();
                  double $$14 = (double)this.fs() * 2.5;
                  if ($$13 < azn.k($$14) && this.b(bsg.a).a(axm.bI)) {
                     $$12 = true;
                  }
               }

               float $$15 = 0.0F;
               if ($$0 instanceof bve $$16) {
                  $$15 = $$16.eH();
               }

               ezr $$17 = $$0.dB();
               boolean $$18 = $$0.a($$3, $$11);
               if ($$18) {
                  float $$19 = this.a($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                  if ($$19 > 0.0F) {
                     if ($$0 instanceof bve $$20) {
                        $$20.p(
                           (double)($$19 * 0.5F), (double)azn.a(this.dO() * (float) (Math.PI / 180.0)), (double)(-azn.b(this.dO() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.j(
                           (double)(-azn.a(this.dO() * (float) (Math.PI / 180.0)) * $$19 * 0.5F),
                           0.1,
                           (double)(azn.b(this.dO() * (float) (Math.PI / 180.0)) * $$19 * 0.5F)
                        );
                     }

                     this.h(this.dB().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$12) {
                     float $$21 = 1.0F + (float)this.h(bwm.D) * $$1;

                     for (bve $$23 : this.dY().a(bve.class, $$0.cT().c(1.0, 0.25, 1.0))) {
                        if ($$23 != this && $$23 != $$0 && !this.s($$23) && (!($$23 instanceof cko) || !((cko)$$23).A()) && this.g((bui)$$23) < 9.0) {
                           float $$24 = this.a($$23, $$21, $$3) * $$5;
                           $$23.p(0.4F, (double)azn.a(this.dO() * (float) (Math.PI / 180.0)), (double)(-azn.b(this.dO() * (float) (Math.PI / 180.0))));
                           $$23.a($$3, $$24);
                           if (this.dY() instanceof arq $$25) {
                              dby.a($$25, (bui)$$23, $$3);
                           }
                        }
                     }

                     this.dY().a(null, this.dD(), this.dF(), this.dJ(), awo.ue, this.do(), 1.0F, 1.0F);
                     this.gi();
                  }

                  if ($$0 instanceof arr && $$0.U) {
                     ((arr)$$0).g.b(new afp($$0));
                     $$0.U = false;
                     $$0.h($$17);
                  }

                  if ($$10) {
                     this.dY().a(null, this.dD(), this.dF(), this.dJ(), awo.ua, this.do(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$10 && !$$12) {
                     if ($$7) {
                        this.dY().a(null, this.dD(), this.dF(), this.dJ(), awo.ud, this.do(), 1.0F, 1.0F);
                     } else {
                        this.dY().a(null, this.dD(), this.dF(), this.dJ(), awo.uf, this.do(), 1.0F, 1.0F);
                     }
                  }

                  if ($$4 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  bui $$26 = $$0;
                  if ($$0 instanceof cjp) {
                     $$26 = ((cjp)$$0).b;
                  }

                  boolean $$27 = false;
                  if (this.dY() instanceof arq $$28) {
                     if ($$26 instanceof bve $$29) {
                        $$27 = $$2.a($$29, this);
                     }

                     dby.a($$28, $$0, $$3);
                  }

                  if (!this.dY().C && !$$2.f() && $$26 instanceof bve) {
                     if ($$27) {
                        $$2.b((bve)$$26, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.fc()) {
                           this.a(bsg.a, cwf.k);
                        } else {
                           this.a(bsg.b, cwf.k);
                        }
                     }
                  }

                  if ($$0 instanceof bve) {
                     float $$30 = $$15 - ((bve)$$0).eH();
                     this.a(awy.G, Math.round($$30 * 10.0F));
                     if (this.dY() instanceof arq && $$30 > 2.0F) {
                        int $$31 = (int)((double)$$30 * 0.5);
                        ((arq)this.dY()).a(ls.g, $$0.dD(), $$0.e(0.5), $$0.dJ(), $$31, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.G(0.1F);
               } else {
                  this.dY().a(null, this.dD(), this.dF(), this.dJ(), awo.uc, this.do(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(bui $$0, float $$1, bsy $$2) {
      return $$1;
   }

   @Override
   protected void g(bve $$0) {
      this.e($$0);
   }

   public void h(cwf $$0) {
      this.gH().a($$0, 100);
      this.fI();
      this.dY().a(this, (byte)30);
   }

   public void b(bui $$0) {
   }

   public void c(bui $$0) {
   }

   public void gi() {
      double $$0 = (double)(-azn.a(this.dO() * (float) (Math.PI / 180.0)));
      double $$1 = (double)azn.b(this.dO() * (float) (Math.PI / 180.0));
      if (this.dY() instanceof arq) {
         ((arq)this.dY()).a(ls.aj, this.dD() + $$0, this.e(0.5), this.dJ() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void gj() {
   }

   @Override
   public void a(bui.c $$0) {
      super.a($$0);
      this.cc.a(this);
      if (this.cd != null && this.gn()) {
         this.t();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile gk() {
      return this.l;
   }

   public coq gl() {
      return this.h;
   }

   public com gm() {
      return this.j;
   }

   @Override
   public boolean fY() {
      return this.j.d;
   }

   public void a(cwf $$0, cwf $$1, csc $$2) {
   }

   public boolean gn() {
      return this.cd != this.cc;
   }

   public boolean go() {
      return true;
   }

   public Either<cor.a, bat> a(jh $$0) {
      this.b($$0);
      this.i = 0;
      return Either.right(bat.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fV();
      if (this.dY() instanceof arq && $$1) {
         ((arq)this.dY()).e();
      }

      this.i = $$0 ? 0 : 100;
   }

   @Override
   public void fV() {
      this.a(true, true);
   }

   public boolean gp() {
      return this.fU() && this.i >= 100;
   }

   public int gq() {
      return this.i;
   }

   public void a(xl $$0, boolean $$1) {
   }

   public void a(all $$0) {
      this.b(awy.i.b($$0));
   }

   public void a(all $$0, int $$1) {
      this.a(awy.i.b($$0), $$1);
   }

   public void b(awv<?> $$0) {
      this.a($$0, 1);
   }

   public void a(awv<?> $$0, int $$1) {
   }

   public void a(awv<?> $$0) {
   }

   public int a(Collection<dav<?>> $$0) {
      return 0;
   }

   public void a(dav<?> $$0, List<cwf> $$1) {
   }

   public void b(List<all> $$0) {
   }

   public int b(Collection<dav<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(ezr $$0) {
      if (this.cb()) {
         super.a_($$0);
      } else {
         if (this.cm()) {
            double $$1 = this.bV().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bn || !this.dY().b_(jh.a(this.dD(), this.dF() + 1.0 - 0.1, this.dJ())).c()) {
               ezr $$3 = this.dB();
               this.h($$3.b(0.0, ($$1 - $$3.e) * $$2, 0.0));
            }
         }

         if (this.gm().b) {
            double $$4 = this.dB().e;
            super.a_($$0);
            this.h(this.dB().a(jm.a.b, $$4 * 0.6));
         } else {
            super.a_($$0);
         }
      }
   }

   @Override
   protected boolean fw() {
      return !this.j.b && super.fw();
   }

   @Override
   public void br() {
      if (this.j.b) {
         this.i(false);
      } else {
         super.br();
      }
   }

   protected boolean h(jh $$0) {
      return !this.dY().a_($$0).j(this.dY(), $$0);
   }

   @Override
   public float fs() {
      return (float)this.h(bwm.v);
   }

   @Override
   public boolean a(float $$0, float $$1, bsy $$2) {
      if (this.j.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(awy.t, (int)Math.round((double)$$0 * 100.0));
         }

         boolean $$3 = this.cx != null && this.cE;
         float $$4;
         if ($$3) {
            $$4 = Math.min($$0, (float)(this.cx.e - this.dF()));
            boolean $$5 = $$4 <= 0.0F;
            if ($$5) {
               this.gQ();
            } else {
               this.gP();
            }
         } else {
            $$4 = $$0;
         }

         if ($$4 > 0.0F && super.a($$4, $$1, $$2)) {
            this.gQ();
            return true;
         } else {
            return false;
         }
      }
   }

   public boolean gr() {
      if (!this.fM() && this.fw() && !this.bl()) {
         this.gs();
         return true;
      } else {
         return false;
      }
   }

   public void gs() {
      this.b(7, true);
   }

   public void gt() {
      this.b(7, true);
      this.b(7, false);
   }

   @Override
   protected void bu() {
      if (!this.R_()) {
         super.bu();
      }
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      if (this.bl()) {
         this.ba();
         this.b($$1);
      } else {
         jh $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dvo $$3 = this.dY().a_($$2);
            if ($$3.a(axd.bp)) {
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
   public bve.a eQ() {
      return new bve.a(awo.uq, awo.ug);
   }

   @Override
   public boolean a(arq $$0, bve $$1) {
      this.b(awy.g.b($$1.ar()));
      return true;
   }

   @Override
   public void a(dvo $$0, ezr $$1) {
      if (!this.j.b) {
         super.a($$0, $$1);
      }

      this.gP();
   }

   public void d(int $$0) {
      this.s($$0);
      this.cs = this.cs + (float)$$0 / (float)this.gv();
      this.cr = azn.a(this.cr + $$0, 0, Integer.MAX_VALUE);

      while (this.cs < 0.0F) {
         float $$1 = this.cs * (float)this.gv();
         if (this.cq > 0) {
            this.c(-1);
            this.cs = 1.0F + $$1 / (float)this.gv();
         } else {
            this.c(-1);
            this.cs = 0.0F;
         }
      }

      while (this.cs >= 1.0F) {
         this.cs = (this.cs - 1.0F) * (float)this.gv();
         this.c(1);
         this.cs = this.cs / (float)this.gv();
      }
   }

   public int gu() {
      return this.ct;
   }

   public void a(cwf $$0, int $$1) {
      this.cq -= $$1;
      if (this.cq < 0) {
         this.cq = 0;
         this.cs = 0.0F;
         this.cr = 0;
      }

      this.ct = this.af.f();
   }

   public void c(int $$0) {
      this.cq = IntMath.saturatedAdd(this.cq, $$0);
      if (this.cq < 0) {
         this.cq = 0;
         this.cs = 0.0F;
         this.cr = 0;
      }

      if ($$0 > 0 && this.cq % 5 == 0 && (float)this.k < (float)this.ag - 100.0F) {
         float $$1 = this.cq > 30 ? 1.0F : (float)this.cq / 30.0F;
         this.dY().a(null, this.dD(), this.dF(), this.dJ(), awo.up, this.do(), $$1 * 0.75F, 1.0F);
         this.k = this.ag;
      }
   }

   public int gv() {
      if (this.cq >= 30) {
         return 112 + (this.cq - 30) * 9;
      } else {
         return this.cq >= 15 ? 37 + (this.cq - 15) * 5 : 7 + this.cq * 2;
      }
   }

   public void G(float $$0) {
      if (!this.j.a) {
         if (!this.dY().C) {
            this.ce.a($$0);
         }
      }
   }

   public Optional<cnv> ad() {
      return Optional.empty();
   }

   public cro gw() {
      return this.ce;
   }

   public boolean u(boolean $$0) {
      return this.j.a || $$0 || this.ce.c();
   }

   public boolean gx() {
      return this.eH() > 0.0F && this.eH() < this.eW();
   }

   public boolean gy() {
      return this.j.e;
   }

   public boolean a(jh $$0, jm $$1, cwf $$2) {
      if (this.j.e) {
         return true;
      } else {
         jh $$3 = $$0.a($$1.g());
         dvs $$4 = new dvs(this.dY(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int er() {
      return !this.dY().ac().b(dfb.d) && !this.R_() ? Math.min(this.cq * 7, 100) : 0;
   }

   @Override
   protected boolean es() {
      return true;
   }

   @Override
   public boolean cO() {
      return true;
   }

   @Override
   protected bui.b bi() {
      return this.j.b || this.aL() && this.ci() ? bui.b.a : bui.b.d;
   }

   public void A() {
   }

   @Override
   public xl am() {
      return xl.b(this.l.getName());
   }

   public ctg gz() {
      return this.cb;
   }

   @Override
   public cwf a(buq $$0) {
      if ($$0 == buq.a) {
         return this.h.f();
      } else if ($$0 == buq.b) {
         return this.h.i.getFirst();
      } else {
         return $$0.a() == buq.a.b ? this.h.h.get($$0.b()) : cwf.k;
      }
   }

   @Override
   protected boolean b(buq $$0) {
      return $$0.a() == buq.a.b;
   }

   @Override
   public void a(buq $$0, cwf $$1) {
      this.c($$1);
      if ($$0 == buq.a) {
         this.a($$0, this.h.g.set(this.h.j, $$1), $$1);
      } else if ($$0 == buq.b) {
         this.a($$0, this.h.i.set(0, $$1), $$1);
      } else if ($$0.a() == buq.a.b) {
         this.a($$0, this.h.h.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cwf $$0) {
      return this.h.f($$0);
   }

   @Override
   public Iterable<cwf> ff() {
      return Lists.newArrayList(new cwf[]{this.fc(), this.fd()});
   }

   @Override
   public Iterable<cwf> fe() {
      return this.h.h;
   }

   @Override
   public boolean e(buq $$0) {
      return $$0 != buq.g;
   }

   public boolean h(un $$0) {
      if (this.cb() || !this.aL() || this.bl() || this.aw) {
         return false;
      } else if (this.gD().g()) {
         this.i($$0);
         this.g = this.dY().aa();
         return true;
      } else if (this.gE().g()) {
         this.j($$0);
         this.g = this.dY().aa();
         return true;
      } else {
         return false;
      }
   }

   protected void gA() {
      if (this.g + 20L < this.dY().aa()) {
         this.k(this.gD());
         this.i(new un());
         this.k(this.gE());
         this.j(new un());
      }
   }

   private void k(un $$0) {
      if (!this.dY().C && !$$0.g()) {
         bup.a($$0, this.dY(), buo.r).ifPresent($$0x -> {
            if ($$0x instanceof bwb) {
               ((bwb)$$0x).b(this.au);
            }

            $$0x.a_(this.dD(), this.dF() + 0.7F, this.dJ());
            ((arq)this.dY()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean R_();

   @Override
   public boolean bI() {
      return !this.R_() && super.bI();
   }

   @Override
   public boolean cm() {
      return !this.j.b && !this.R_() && super.cm();
   }

   public abstract boolean f();

   @Override
   public boolean cL() {
      return !this.j.b;
   }

   public faw gB() {
      return this.dY().O();
   }

   @Override
   public xl S_() {
      xz $$0 = far.a(this.ct(), this.am());
      return this.a($$0);
   }

   private xz a(xz $$0) {
      String $$1 = this.gk().getName();
      return $$0.a($$1x -> $$1x.a(new xj(xj.a.d, "/tell " + $$1 + " ")).a(this.cS()).a($$1));
   }

   @Override
   public String cK() {
      return this.gk().getName();
   }

   @Override
   protected void F(float $$0) {
      this.aw().a(e, $$0);
   }

   @Override
   public float fz() {
      return this.aw().a(e);
   }

   public boolean a(cos $$0) {
      return (this.aw().a(bX) & $$0.a()) == $$0.a();
   }

   @Override
   public bvw a_(int $$0) {
      if ($$0 == 499) {
         return new bvw() {
            @Override
            public cwf a() {
               return cor.this.cd.g();
            }

            @Override
            public boolean a(cwf $$0) {
               cor.this.cd.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bvw() {
               @Override
               public cwf a() {
                  return cor.this.cc.r().a($$1);
               }

               @Override
               public boolean a(cwf $$0) {
                  cor.this.cc.r().a($$1, $$0);
                  cor.this.cc.a(cor.this.h);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.h.g.size()) {
            return bvw.a(this.h, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.cb.b() ? bvw.a(this.cb, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gC() {
      return this.cA;
   }

   public void v(boolean $$0) {
      this.cA = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.j.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public buy fB() {
      return this.am.a(bY) == 0 ? buy.a : buy.b;
   }

   public void b(buy $$0) {
      this.am.a(bY, (byte)($$0 == buy.a ? 0 : 1));
   }

   public un gD() {
      return this.am.a(bZ);
   }

   protected void i(un $$0) {
      this.am.a(bZ, $$0);
   }

   public un gE() {
      return this.am.a(ca);
   }

   protected void j(un $$0) {
      this.am.a(ca, $$0);
   }

   public float gF() {
      return (float)(1.0 / this.h(bwm.e) * 20.0);
   }

   public float H(float $$0) {
      return azn.a(((float)this.aS + $$0) / this.gF(), 0.0F, 1.0F);
   }

   public void gG() {
      this.aS = 0;
   }

   public cwc gH() {
      return this.cC;
   }

   @Override
   protected float aV() {
      return !this.j.b && !this.fM() ? super.aV() : 1.0F;
   }

   public float gI() {
      return (float)this.h(bwm.q);
   }

   public boolean gJ() {
      return this.j.d && this.H() >= 2;
   }

   @Override
   public bul e(bvq $$0) {
      return d.getOrDefault($$0, bW);
   }

   @Override
   public ImmutableList<bvq> fR() {
      return ImmutableList.of(bvq.a, bvq.f, bvq.d);
   }

   @Override
   public cwf d(cwf $$0) {
      if (!($$0.h() instanceof cxb)) {
         return cwf.k;
      } else {
         Predicate<cwf> $$1 = ((cxb)$$0.h()).d();
         cwf $$2 = cxb.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((cxb)$$0.h()).b();

            for (int $$3 = 0; $$3 < this.h.b(); $$3++) {
               cwf $$4 = this.h.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.j.d ? new cwf(cwj.ox) : cwf.k;
         }
      }
   }

   @Override
   public ezr u(float $$0) {
      double $$1 = 0.22 * (this.fB() == buy.b ? -1.0 : 1.0);
      float $$2 = azn.h($$0 * 0.5F, this.dQ(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = azn.h($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      if (this.fM() || this.fy()) {
         ezr $$4 = this.g($$0);
         ezr $$5 = this.dB();
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

         return this.o($$0).e(new ezr($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cn()) {
         return this.o($$0).e(new ezr($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cT().c() - 1.0;
         double $$13 = this.ck() ? -0.2 : 0.07;
         return this.o($$0).e(new ezr($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dX() {
      return true;
   }

   public boolean gK() {
      return this.fC() && this.fE().a(cwj.ro);
   }

   @Override
   public boolean dW() {
      return false;
   }

   public Optional<jp> gL() {
      return this.cD;
   }

   public void c(Optional<jp> $$0) {
      this.cD = $$0;
   }

   @Override
   public float eO() {
      return this.cw;
   }

   @Override
   public void p(float $$0) {
      super.p($$0);
      this.cw = $$0;
   }

   @Override
   public boolean dR() {
      return true;
   }

   @Override
   protected float fr() {
      if (this.j.b && !this.cb()) {
         return this.cl() ? this.j.a() * 2.0F : this.j.a();
      } else {
         return this.cl() ? 0.025999999F : 0.02F;
      }
   }

   public double gM() {
      return this.h(bwm.g);
   }

   public double gN() {
      return this.h(bwm.j);
   }

   public boolean b(bui $$0, double $$1) {
      return $$0.dT() ? false : this.a($$0.cT(), $$1);
   }

   public boolean a(ezm $$0, double $$1) {
      double $$2 = this.gN() + $$1;
      return $$0.e(this.bH()) < $$2 * $$2;
   }

   public boolean a(jh $$0, double $$1) {
      double $$2 = this.gM() + $$1;
      return new ezm($$0).e(this.bH()) < $$2 * $$2;
   }

   public void w(boolean $$0) {
      this.cE = $$0;
      if ($$0) {
         this.cF = 40;
      } else {
         this.cF = 0;
      }
   }

   public boolean gO() {
      return this.cE;
   }

   public void gP() {
      if (this.cF == 0) {
         this.gQ();
      }
   }

   public void gQ() {
      this.cF = 0;
      this.cy = null;
      this.cx = null;
      this.cE = false;
   }

   public boolean gR() {
      return false;
   }

   public static enum a {
      a,
      b(xl.c("block.minecraft.bed.no_sleep")),
      c(xl.c("block.minecraft.bed.too_far_away")),
      d(xl.c("block.minecraft.bed.obstructed")),
      e,
      f(xl.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final xl g;

      private a() {
         this.g = null;
      }

      private a(final xl $$0) {
         this.g = $$0;
      }

      @Nullable
      public xl a() {
         return this.g;
      }
   }
}
