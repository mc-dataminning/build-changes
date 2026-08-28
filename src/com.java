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

public abstract class com extends bva {
   private static final Logger b = LogUtils.getLogger();
   public static final buu bH = buu.b;
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
   public static final ezn bV = new ezn(0.0, 0.6, 0.0);
   public static final buh bW = buh.b(0.6F, 1.8F).b(1.62F).a(bug.a().a(buf.b, bV));
   private static final Map<bvm, buh> d = ImmutableMap.builder()
      .put(bvm.a, bW)
      .put(bvm.c, aE)
      .put(bvm.b, buh.b(0.6F, 0.6F).b(0.4F))
      .put(bvm.d, buh.b(0.6F, 0.6F).b(0.4F))
      .put(bvm.e, buh.b(0.6F, 0.6F).b(0.4F))
      .put(bvm.f, buh.b(0.6F, 1.5F).b(1.27F).a(bug.a().a(buf.b, bV)))
      .put(bvm.h, buh.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final akl<Float> e = akp.a(com.class, akn.d);
   private static final akl<Integer> f = akp.a(com.class, akn.b);
   protected static final akl<Byte> bX = akp.a(com.class, akn.a);
   protected static final akl<Byte> bY = akp.a(com.class, akn.a);
   protected static final akl<uk> bZ = akp.a(com.class, akn.t);
   protected static final akl<uk> ca = akp.a(com.class, akn.t);
   private long g;
   final col h = new col(this);
   protected ctc cb = new ctc();
   public final csr cc;
   public cro cd;
   protected crk ce = new crk();
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
   private final coi j = new coi();
   public int cq;
   public int cr;
   public float cs;
   protected int ct;
   protected final float cu = 0.02F;
   private int k;
   private final GameProfile l;
   private boolean cA;
   private cwb cB = cwb.k;
   private final cvy cC = this.k();
   private Optional<jp> cD = Optional.empty();
   @Nullable
   public cpc cv;
   protected float cw;
   @Nullable
   public ezn cx;
   @Nullable
   public bue cy;
   private boolean cE;
   private int cF;

   public com(dfb $$0, jh $$1, float $$2, GameProfile $$3) {
      super(bul.by, $$0);
      this.a_($$3.getId());
      this.l = $$3;
      this.cc = new csr(this.h, !$$0.C, this);
      this.cd = this.cc;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bk = 180.0F;
   }

   public boolean a(dfb $$0, jh $$1, dey $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dey.d) {
         return true;
      } else if (this.gw()) {
         return false;
      } else {
         cwb $$3 = this.fb();
         return $$3.f() || !$$3.b(new dvn($$0, $$1, false));
      }
   }

   public static bwh.a fZ() {
      return bva.ef().a(bwi.c, 1.0).a(bwi.v, 0.1F).a(bwi.e).a(bwi.q).a(bwi.g, 4.5).a(bwi.j, 3.0).a(bwi.f).a(bwi.C).a(bwi.z).a(bwi.t).a(bwi.D);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(e, 0.0F);
      $$0.a(f, 0);
      $$0.a(bX, (byte)0);
      $$0.a(bY, (byte)bH.b());
      $$0.a(bZ, new uk());
      $$0.a(ca, new uk());
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

      if (this.fT()) {
         this.i++;
         if (this.i > 100) {
            this.i = 100;
         }

         if (!this.dX().C && this.dX().S()) {
            this.a(false, true);
         }
      } else if (this.i > 0) {
         this.i++;
         if (this.i >= 110) {
            this.i = 0;
         }
      }

      this.gd();
      super.l();
      if (!this.dX().C && this.cd != null && !this.cd.b(this)) {
         this.s();
         this.cd = this.cc;
      }

      this.w();
      if (!this.dX().C) {
         this.ce.a(this);
         this.a(awv.k);
         this.a(awv.l);
         if (this.bM()) {
            this.a(awv.m);
         }

         if (this.ch()) {
            this.a(awv.o);
         }

         if (!this.fT()) {
            this.a(awv.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = azk.a(this.dC(), -2.9999999E7, 2.9999999E7);
      double $$2 = azk.a(this.dI(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dC() || $$2 != this.dI()) {
         this.a_($$1, this.dE(), $$2);
      }

      this.aS++;
      cwb $$3 = this.fb();
      if (!cwb.a(this.cB, $$3)) {
         if (!cwb.b(this.cB, $$3)) {
            this.gE();
         }

         this.cB = $$3.v();
      }

      if (!this.a(axg.a) && this.c(cwf.op)) {
         this.q();
      }

      this.cC.a();
      this.ge();
      if (this.cF > 0) {
         this.cF--;
      }
   }

   @Override
   protected float fs() {
      return this.fI() ? 15.0F : super.fs();
   }

   public boolean ga() {
      return this.ce();
   }

   protected boolean gb() {
      return this.ce();
   }

   protected boolean gc() {
      return this.ce();
   }

   protected boolean gd() {
      this.cp = this.a(axg.a);
      return this.cp;
   }

   @Override
   public void l(boolean $$0) {
      if (!this.gl().b) {
         super.l($$0);
      }
   }

   @Override
   public void m(boolean $$0) {
      if (!this.gl().b) {
         super.m($$0);
      }
   }

   private void q() {
      this.a(new btj(btl.m, 200, 0, false, false, true));
   }

   private boolean c(cvx $$0) {
      for (bum $$1 : bum.i) {
         cwb $$2 = this.a($$1);
         ddn $$3 = $$2.a(ku.D);
         if ($$2.a($$0) && $$3 != null && $$3.a() == $$1) {
            return true;
         }
      }

      return false;
   }

   protected cvy k() {
      return new cvy();
   }

   private void w() {
      this.cj = this.cm;
      this.ck = this.cn;
      this.cl = this.co;
      double $$0 = this.dC() - this.cm;
      double $$1 = this.dE() - this.cn;
      double $$2 = this.dI() - this.co;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cm = this.dC();
         this.cj = this.cm;
      }

      if ($$2 > 10.0) {
         this.co = this.dI();
         this.cl = this.co;
      }

      if ($$1 > 10.0) {
         this.cn = this.dE();
         this.ck = this.cn;
      }

      if ($$0 < -10.0) {
         this.cm = this.dC();
         this.cj = this.cm;
      }

      if ($$2 < -10.0) {
         this.co = this.dI();
         this.cl = this.co;
      }

      if ($$1 < -10.0) {
         this.cn = this.dE();
         this.ck = this.cn;
      }

      this.cm += $$0 * 0.25;
      this.co += $$2 * 0.25;
      this.cn += $$1 * 0.25;
   }

   protected void ge() {
      if (this.h(bvm.d)) {
         bvm $$0;
         if (this.fL()) {
            $$0 = bvm.b;
         } else if (this.fT()) {
            $$0 = bvm.c;
         } else if (this.cl()) {
            $$0 = bvm.d;
         } else if (this.fx()) {
            $$0 = bvm.e;
         } else if (this.ce() && !this.j.b) {
            $$0 = bvm.f;
         } else {
            $$0 = bvm.a;
         }

         bvm $$6;
         if (this.R_() || this.ca() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bvm.f)) {
            $$6 = bvm.f;
         } else {
            $$6 = bvm.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bvm $$0) {
      return this.dX().a(this, this.a($$0).a(this.dv()).h(1.0E-7));
   }

   @Override
   protected awk aW() {
      return awl.ut;
   }

   @Override
   protected awk aX() {
      return awl.ur;
   }

   @Override
   protected awk aY() {
      return awl.us;
   }

   @Override
   public int bY() {
      return 10;
   }

   @Override
   public void a(awk $$0, float $$1, float $$2) {
      this.dX().a(this, this.dC(), this.dE(), this.dI(), $$0, this.dn(), $$1, $$2);
   }

   public void a(awk $$0, awm $$1, float $$2, float $$3) {
   }

   @Override
   public awm dn() {
      return awm.h;
   }

   @Override
   protected int do() {
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
      if (!this.dX().C && this.gb() && this.ca()) {
         this.af();
         this.g(false);
      } else {
         super.u();
         this.cg = this.ch;
         this.ch = 0.0F;
      }
   }

   @Override
   protected void fw() {
      super.fw();
      this.eZ();
      this.aZ = this.dN();
   }

   @Override
   public void n_() {
      if (this.cf > 0) {
         this.cf--;
      }

      if (this.dX().ak() == bsa.a && this.dX().ac().b(dex.k)) {
         if (this.eG() < this.eV() && this.ag % 20 == 0) {
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
      if (this.j.b && !this.ca()) {
         this.n();
      }

      super.n_();
      this.C((float)this.h(bwi.v));
      float $$1;
      if (this.aK() && !this.eH() && !this.cl()) {
         $$1 = Math.min(0.1F, (float)this.dA().i());
      } else {
         $$1 = 0.0F;
      }

      this.ch = this.ch + ($$1 - this.ch) * 0.4F;
      if (this.eG() > 0.0F && !this.R_()) {
         ezi $$2;
         if (this.ca() && !this.dl().dS()) {
            $$2 = this.cS().b(this.dl().cS()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cS().c(1.0, 0.5, 1.0);
         }

         List<bue> $$4 = this.dX().a_(this, $$2);
         List<bue> $$5 = Lists.newArrayList();

         for (bue $$6 : $$4) {
            if ($$6.ar() == bul.M) {
               $$5.add($$6);
            } else if (!$$6.dS()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ae.a($$5, this.af));
         }
      }

      this.c(this.gB());
      this.c(this.gC());
      if (!this.dX().C && (this.aa > 0.5F || this.bk()) || this.j.b || this.fT() || this.aw) {
         this.gy();
      }
   }

   private void c(@Nullable uk $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dX().A.a(200) == 0) {
         String $$1 = $$0.l("id");
         bul.a($$1).filter($$0x -> $$0x == bul.ax).ifPresent($$0x -> {
            if (!chh.a(this.dX(), this)) {
               this.dX().a(null, this.dC(), this.dE(), this.dI(), chh.a(this.dX(), this.dX().A), this.dn(), 1.0F, chh.a(this.dX().A));
            }
         });
      }
   }

   private void d(bue $$0) {
      $$0.b_(this);
   }

   public int gf() {
      return this.am.a(f);
   }

   public void r(int $$0) {
      this.am.a(f, $$0);
   }

   public void s(int $$0) {
      int $$1 = this.gf();
      this.am.a(f, $$1 + $$0);
   }

   public void a(int $$0, float $$1, cwb $$2) {
      this.bC = $$0;
      this.bD = $$1;
      this.bE = $$2;
      if (!this.dX().C) {
         this.gy();
         this.c(4, true);
      }
   }

   @Nonnull
   @Override
   public cwb eb() {
      return this.fx() && this.bE != null ? this.bE : super.eb();
   }

   @Override
   public void a(bsu $$0) {
      super.a($$0);
      this.aA();
      if (!this.R_() && this.dX() instanceof arn $$1) {
         this.a($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-azk.b((this.eN() + this.dN()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-azk.a((this.eN() + this.dN()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(awv.N);
      this.a(awv.i.b(awv.m));
      this.a(awv.i.b(awv.n));
      this.aI();
      this.c(false);
      this.c(Optional.of(jp.a(this.dX().ag(), this.dx())));
   }

   @Override
   protected void eJ() {
      super.eJ();
      if (!this.dX().ac().b(dex.d)) {
         this.gg();
         this.h.k();
      }
   }

   protected void gg() {
      for (int $$0 = 0; $$0 < this.h.b(); $$0++) {
         cwb $$1 = this.h.a($$0);
         if (!$$1.f() && dbu.a($$1, dbt.D)) {
            this.h.b($$0);
         }
      }
   }

   @Override
   protected awk d(bsu $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected awk o_() {
      return awl.uj;
   }

   @Override
   public void g(cwb $$0) {
   }

   @Nullable
   public ckv a(cwb $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public ckv a(cwb $$0, boolean $$1, boolean $$2) {
      if (!$$0.f() && this.dX().C) {
         this.a(bsc.a);
      }

      return null;
   }

   public float c(dvj $$0) {
      float $$1 = this.h.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(bwi.t);
      }

      if (btk.a(this)) {
         $$1 *= 1.0F + (float)(btk.b(this) + 1) * 0.2F;
      }

      if (this.b(btl.d)) {
         float $$2 = switch (this.c(btl.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.h(bwi.f);
      if (this.a(axg.a)) {
         $$1 *= (float)this.g(bwi.C).g();
      }

      if (!this.aK()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dvj $$0) {
      return !$$0.C() || this.h.f().b($$0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a_(this.l.getId());
      uq $$1 = $$0.c("Inventory", 10);
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
      this.g(bwi.v).a((double)this.j.b());
      if ($$0.b("EnderItems", 9)) {
         this.cb.a($$0.c("EnderItems", 10), this.dZ());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.c(jp.b.parse(uy.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         ezn.a.parse(uy.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.cx = $$0x);
      }

      this.cE = $$0.q("ignore_fall_damage_from_current_explosion");
      this.cF = $$0.h("current_impulse_context_reset_grace_time");
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      uz.e($$0);
      $$0.a("Inventory", this.h.a(new uq()));
      $$0.a("SelectedItemSlot", this.h.j);
      $$0.a("SleepTimer", (short)this.i);
      $$0.a("XpP", this.cs);
      $$0.a("XpLevel", this.cq);
      $$0.a("XpTotal", this.cr);
      $$0.a("XpSeed", this.ct);
      $$0.a("Score", this.gf());
      this.ce.b($$0);
      this.j.a($$0);
      $$0.a("EnderItems", this.cb.a(this.dZ()));
      if (!this.gB().g()) {
         $$0.a("ShoulderEntityLeft", this.gB());
      }

      if (!this.gC().g()) {
         $$0.a("ShoulderEntityRight", this.gC());
      }

      this.gJ().flatMap($$0x -> jp.b.encodeStart(uy.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cx != null) {
         $$0.a("current_explosion_impact_pos", (vh)ezn.a.encodeStart(uy.a, this.cx).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cE);
      $$0.a("current_impulse_context_reset_grace_time", this.cF);
   }

   @Override
   public boolean b(bsu $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(axc.n)) {
         return !this.dX().ac().b(dex.G);
      } else if ($$0.a(axc.m)) {
         return !this.dX().ac().b(dex.H);
      } else if ($$0.a(axc.i)) {
         return !this.dX().ac().b(dex.I);
      } else {
         return $$0.a(axc.o) ? !this.dX().ac().b(dex.J) : false;
      }
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.j.a && !$$0.a(axc.d)) {
         return false;
      } else {
         this.bf = 0;
         if (this.eH()) {
            return false;
         } else {
            if (!this.dX().C) {
               this.gy();
            }

            if ($$0.g()) {
               if (this.dX().ak() == bsa.a) {
                  $$1 = 0.0F;
               }

               if (this.dX().ak() == bsa.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dX().ak() == bsa.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bva $$0) {
      super.d($$0);
      cwb $$1 = this.fJ();
      if ($$0.fW() && $$1 != null) {
         this.h($$1);
      }
   }

   @Override
   public boolean ez() {
      return !this.gl().a && super.ez();
   }

   public boolean a(com $$0) {
      fau $$1 = this.cs();
      fau $$2 = $$0.cs();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bsu $$0, float $$1) {
      this.a($$0, $$1, new bum[]{bum.c, bum.d, bum.e, bum.f});
   }

   @Override
   protected void c(bsu $$0, float $$1) {
      this.a($$0, $$1, new bum[]{bum.f});
   }

   @Override
   protected void z(float $$0) {
      if (this.bz.a(cwf.vu)) {
         if (!this.dX().C) {
            this.b(awv.c.b(this.bz.h()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + azk.d($$0);
            bsc $$2 = this.fC();
            this.bz.a($$1, this, d($$2));
            if (this.bz.f()) {
               if ($$2 == bsc.a) {
                  this.a(bum.a, cwb.k);
               } else {
                  this.a(bum.b, cwb.k);
               }

               this.bz = cwb.k;
               this.a(awl.wD, 0.8F, 0.8F + this.dX().A.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bsu $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fy(), 0.0F);
         this.E(this.fy() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(awv.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.G($$0.a());
            this.eT().a($$0, var7);
            this.x(this.eG() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(awv.J, Math.round(var7 * 10.0F));
            }

            this.a(eag.o);
         }
      }
   }

   public boolean ab() {
      return false;
   }

   public void a(dty $$0, boolean $$1) {
   }

   public void a(deb $$0) {
   }

   public void a(dsw $$0) {
   }

   public void a(dud $$0) {
   }

   public void a(dto $$0) {
   }

   public void a(civ $$0, brw $$1) {
   }

   public OptionalInt a(@Nullable bsf $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, ddz $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cwb $$0, bsc $$1) {
   }

   public bsd a(bue $$0, bsc $$1) {
      if (this.R_()) {
         if ($$0 instanceof bsf) {
            this.a((bsf)$$0);
         }

         return bsd.e;
      } else {
         cwb $$2 = this.b($$1);
         cwb $$3 = $$2.v();
         bsd $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.j.d && $$2 == this.b($$1) && $$2.L() < $$3.L()) {
               $$2.e($$3.L());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof bva) {
               if (this.j.d) {
                  $$2 = $$3;
               }

               bsd $$5 = $$2.a(this, (bva)$$0, $$1);
               if ($$5.a()) {
                  this.dX().a(eag.r, $$0.dv(), eag.a.a(this));
                  if ($$2.f() && !this.j.d) {
                     this.a($$1, cwb.k);
                  }

                  return $$5;
               }
            }

            return bsd.e;
         }
      }
   }

   @Override
   public void bR() {
      super.bR();
      this.K = 0;
   }

   @Override
   protected boolean fk() {
      return super.fk() || this.fT();
   }

   @Override
   public boolean em() {
      return !this.j.b;
   }

   @Override
   protected ezn a(ezn $$0, bve $$1) {
      float $$2 = this.dR();
      if (!this.j.b && !($$0.e > 0.0) && ($$1 == bve.a || $$1 == bve.b) && this.gc() && this.I($$2)) {
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

         return new ezn($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean I(float $$0) {
      return this.aK() || this.aa < $$0 && !this.b(0.0, 0.0, $$0 - this.aa);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      ezi $$3 = this.cS();
      return this.dX().a(this, new ezi($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(bue $$0) {
      if ($$0.cC()) {
         if (!$$0.v(this)) {
            float $$1 = this.fx() ? this.bD : (float)this.h(bwi.c);
            cwb $$2 = this.eb();
            bsu $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.dY().a(this));
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.H(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gE();
            if ($$0.ar().a(axe.H) && $$0 instanceof cpg $$6 && $$6.a(cph.c, this, this, true)) {
               this.dX().a(null, this.dC(), this.dE(), this.dI(), awl.uc, this.dn());
               return;
            }

            if ($$1 > 0.0F || $$4 > 0.0F) {
               boolean $$7 = $$5 > 0.9F;
               boolean $$8;
               if (this.ck() && $$7) {
                  this.dX().a(null, this.dC(), this.dE(), this.dI(), awl.ub, this.dn(), 1.0F, 1.0F);
                  $$8 = true;
               } else {
                  $$8 = false;
               }

               $$1 += $$2.h().a($$0, $$1, $$3);
               boolean $$10 = $$7
                  && this.aa > 0.0F
                  && !this.aK()
                  && !this.q_()
                  && !this.bk()
                  && !this.b(btl.o)
                  && !this.ca()
                  && $$0 instanceof bva
                  && !this.ck();
               if ($$10) {
                  $$1 *= 1.5F;
               }

               float $$11 = $$1 + $$4;
               boolean $$12 = false;
               if ($$7 && !$$10 && !$$8 && this.aK()) {
                  double $$13 = this.ai().j();
                  double $$14 = (double)this.fr() * 2.5;
                  if ($$13 < azk.k($$14) && this.b(bsc.a).a(axj.bH)) {
                     $$12 = true;
                  }
               }

               float $$15 = 0.0F;
               if ($$0 instanceof bva $$16) {
                  $$15 = $$16.eG();
               }

               ezn $$17 = $$0.dA();
               boolean $$18 = $$0.a($$3, $$11);
               if ($$18) {
                  float $$19 = this.a($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                  if ($$19 > 0.0F) {
                     if ($$0 instanceof bva $$20) {
                        $$20.p(
                           (double)($$19 * 0.5F), (double)azk.a(this.dN() * (float) (Math.PI / 180.0)), (double)(-azk.b(this.dN() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.j(
                           (double)(-azk.a(this.dN() * (float) (Math.PI / 180.0)) * $$19 * 0.5F),
                           0.1,
                           (double)(azk.b(this.dN() * (float) (Math.PI / 180.0)) * $$19 * 0.5F)
                        );
                     }

                     this.h(this.dA().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$12) {
                     float $$21 = 1.0F + (float)this.h(bwi.D) * $$1;

                     for (bva $$23 : this.dX().a(bva.class, $$0.cS().c(1.0, 0.25, 1.0))) {
                        if ($$23 != this && $$23 != $$0 && !this.s($$23) && (!($$23 instanceof ckk) || !((ckk)$$23).A()) && this.g((bue)$$23) < 9.0) {
                           float $$24 = this.a($$23, $$21, $$3) * $$5;
                           $$23.p(0.4F, (double)azk.a(this.dN() * (float) (Math.PI / 180.0)), (double)(-azk.b(this.dN() * (float) (Math.PI / 180.0))));
                           $$23.a($$3, $$24);
                           if (this.dX() instanceof arn $$25) {
                              dbu.a($$25, (bue)$$23, $$3);
                           }
                        }
                     }

                     this.dX().a(null, this.dC(), this.dE(), this.dI(), awl.ue, this.dn(), 1.0F, 1.0F);
                     this.gh();
                  }

                  if ($$0 instanceof aro && $$0.U) {
                     ((aro)$$0).g.b(new afm($$0));
                     $$0.U = false;
                     $$0.h($$17);
                  }

                  if ($$10) {
                     this.dX().a(null, this.dC(), this.dE(), this.dI(), awl.ua, this.dn(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$10 && !$$12) {
                     if ($$7) {
                        this.dX().a(null, this.dC(), this.dE(), this.dI(), awl.ud, this.dn(), 1.0F, 1.0F);
                     } else {
                        this.dX().a(null, this.dC(), this.dE(), this.dI(), awl.uf, this.dn(), 1.0F, 1.0F);
                     }
                  }

                  if ($$4 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  bue $$26 = $$0;
                  if ($$0 instanceof cjl) {
                     $$26 = ((cjl)$$0).b;
                  }

                  boolean $$27 = false;
                  if (this.dX() instanceof arn $$28) {
                     if ($$26 instanceof bva $$29) {
                        $$27 = $$2.a($$29, this);
                     }

                     dbu.a($$28, $$0, $$3);
                  }

                  if (!this.dX().C && !$$2.f() && $$26 instanceof bva) {
                     if ($$27) {
                        $$2.b((bva)$$26, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.fb()) {
                           this.a(bsc.a, cwb.k);
                        } else {
                           this.a(bsc.b, cwb.k);
                        }
                     }
                  }

                  if ($$0 instanceof bva) {
                     float $$30 = $$15 - ((bva)$$0).eG();
                     this.a(awv.G, Math.round($$30 * 10.0F));
                     if (this.dX() instanceof arn && $$30 > 2.0F) {
                        int $$31 = (int)((double)$$30 * 0.5);
                        ((arn)this.dX()).a(lr.g, $$0.dC(), $$0.e(0.5), $$0.dI(), $$31, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.G(0.1F);
               } else {
                  this.dX().a(null, this.dC(), this.dE(), this.dI(), awl.uc, this.dn(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(bue $$0, float $$1, bsu $$2) {
      return $$1;
   }

   @Override
   protected void g(bva $$0) {
      this.e($$0);
   }

   public void h(cwb $$0) {
      this.gF().a($$0, 100);
      this.fH();
      this.dX().a(this, (byte)30);
   }

   public void b(bue $$0) {
   }

   public void c(bue $$0) {
   }

   public void gh() {
      double $$0 = (double)(-azk.a(this.dN() * (float) (Math.PI / 180.0)));
      double $$1 = (double)azk.b(this.dN() * (float) (Math.PI / 180.0));
      if (this.dX() instanceof arn) {
         ((arn)this.dX()).a(lr.aj, this.dC() + $$0, this.e(0.5), this.dI() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void gi() {
   }

   @Override
   public void a(bue.c $$0) {
      super.a($$0);
      this.cc.a(this);
      if (this.cd != null && this.gm()) {
         this.t();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile gj() {
      return this.l;
   }

   public col gk() {
      return this.h;
   }

   public coi gl() {
      return this.j;
   }

   @Override
   public boolean fX() {
      return this.j.d;
   }

   public void a(cwb $$0, cwb $$1, cry $$2) {
   }

   public boolean gm() {
      return this.cd != this.cc;
   }

   public Either<com.a, bap> a(jh $$0) {
      this.b($$0);
      this.i = 0;
      return Either.right(bap.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fU();
      if (this.dX() instanceof arn && $$1) {
         ((arn)this.dX()).e();
      }

      this.i = $$0 ? 0 : 100;
   }

   @Override
   public void fU() {
      this.a(true, true);
   }

   public boolean gn() {
      return this.fT() && this.i >= 100;
   }

   public int go() {
      return this.i;
   }

   public void a(xi $$0, boolean $$1) {
   }

   public void a(ali $$0) {
      this.b(awv.i.b($$0));
   }

   public void a(ali $$0, int $$1) {
      this.a(awv.i.b($$0), $$1);
   }

   public void b(aws<?> $$0) {
      this.a($$0, 1);
   }

   public void a(aws<?> $$0, int $$1) {
   }

   public void a(aws<?> $$0) {
   }

   public int a(Collection<dar<?>> $$0) {
      return 0;
   }

   public void a(dar<?> $$0, List<cwb> $$1) {
   }

   public void b(List<ali> $$0) {
   }

   public int b(Collection<dar<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(ezn $$0) {
      if (this.ca()) {
         super.a_($$0);
      } else {
         if (this.cl()) {
            double $$1 = this.bU().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bn || !this.dX().b_(jh.a(this.dC(), this.dE() + 1.0 - 0.1, this.dI())).c()) {
               ezn $$3 = this.dA();
               this.h($$3.b(0.0, ($$1 - $$3.e) * $$2, 0.0));
            }
         }

         if (this.gl().b) {
            double $$4 = this.dA().e;
            super.a_($$0);
            this.h(this.dA().a(jm.a.b, $$4 * 0.6));
         } else {
            super.a_($$0);
         }
      }
   }

   @Override
   protected boolean fv() {
      return !this.j.b && super.fv();
   }

   @Override
   public void bq() {
      if (this.j.b) {
         this.i(false);
      } else {
         super.bq();
      }
   }

   protected boolean h(jh $$0) {
      return !this.dX().a_($$0).j(this.dX(), $$0);
   }

   @Override
   public float fr() {
      return (float)this.h(bwi.v);
   }

   @Override
   public boolean a(float $$0, float $$1, bsu $$2) {
      if (this.j.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(awv.t, (int)Math.round((double)$$0 * 100.0));
         }

         boolean $$3 = this.cx != null && this.cE;
         float $$4;
         if ($$3) {
            $$4 = Math.min($$0, (float)(this.cx.e - this.dE()));
            boolean $$5 = $$4 <= 0.0F;
            if ($$5) {
               this.gO();
            } else {
               this.gN();
            }
         } else {
            $$4 = $$0;
         }

         if ($$4 > 0.0F && super.a($$4, $$1, $$2)) {
            this.gO();
            return true;
         } else {
            return false;
         }
      }
   }

   public boolean gp() {
      if (!this.fL() && this.fv() && !this.bk()) {
         this.gq();
         return true;
      } else {
         return false;
      }
   }

   public void gq() {
      this.b(7, true);
   }

   public void gr() {
      this.b(7, true);
      this.b(7, false);
   }

   @Override
   protected void bt() {
      if (!this.R_()) {
         super.bt();
      }
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      if (this.bk()) {
         this.aZ();
         this.b($$1);
      } else {
         jh $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dvj $$3 = this.dX().a_($$2);
            if ($$3.a(axa.bp)) {
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
   public bva.a eP() {
      return new bva.a(awl.uq, awl.ug);
   }

   @Override
   public boolean a(arn $$0, bva $$1) {
      this.b(awv.g.b($$1.ar()));
      return true;
   }

   @Override
   public void a(dvj $$0, ezn $$1) {
      if (!this.j.b) {
         super.a($$0, $$1);
      }

      this.gN();
   }

   public void d(int $$0) {
      this.s($$0);
      this.cs = this.cs + (float)$$0 / (float)this.gt();
      this.cr = azk.a(this.cr + $$0, 0, Integer.MAX_VALUE);

      while (this.cs < 0.0F) {
         float $$1 = this.cs * (float)this.gt();
         if (this.cq > 0) {
            this.c(-1);
            this.cs = 1.0F + $$1 / (float)this.gt();
         } else {
            this.c(-1);
            this.cs = 0.0F;
         }
      }

      while (this.cs >= 1.0F) {
         this.cs = (this.cs - 1.0F) * (float)this.gt();
         this.c(1);
         this.cs = this.cs / (float)this.gt();
      }
   }

   public int gs() {
      return this.ct;
   }

   public void a(cwb $$0, int $$1) {
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
         this.dX().a(null, this.dC(), this.dE(), this.dI(), awl.up, this.dn(), $$1 * 0.75F, 1.0F);
         this.k = this.ag;
      }
   }

   public int gt() {
      if (this.cq >= 30) {
         return 112 + (this.cq - 30) * 9;
      } else {
         return this.cq >= 15 ? 37 + (this.cq - 15) * 5 : 7 + this.cq * 2;
      }
   }

   public void G(float $$0) {
      if (!this.j.a) {
         if (!this.dX().C) {
            this.ce.a($$0);
         }
      }
   }

   public Optional<cnr> ad() {
      return Optional.empty();
   }

   public crk gu() {
      return this.ce;
   }

   public boolean u(boolean $$0) {
      return this.j.a || $$0 || this.ce.c();
   }

   public boolean gv() {
      return this.eG() > 0.0F && this.eG() < this.eV();
   }

   public boolean gw() {
      return this.j.e;
   }

   public boolean a(jh $$0, jm $$1, cwb $$2) {
      if (this.j.e) {
         return true;
      } else {
         jh $$3 = $$0.a($$1.g());
         dvn $$4 = new dvn(this.dX(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int eq() {
      return !this.dX().ac().b(dex.d) && !this.R_() ? Math.min(this.cq * 7, 100) : 0;
   }

   @Override
   protected boolean er() {
      return true;
   }

   @Override
   public boolean cN() {
      return true;
   }

   @Override
   protected bue.b bh() {
      return this.j.b || this.aK() && this.ch() ? bue.b.a : bue.b.d;
   }

   public void A() {
   }

   @Override
   public xi am() {
      return xi.b(this.l.getName());
   }

   public ctc gx() {
      return this.cb;
   }

   @Override
   public cwb a(bum $$0) {
      if ($$0 == bum.a) {
         return this.h.f();
      } else if ($$0 == bum.b) {
         return this.h.i.getFirst();
      } else {
         return $$0.a() == bum.a.b ? this.h.h.get($$0.b()) : cwb.k;
      }
   }

   @Override
   protected boolean b(bum $$0) {
      return $$0.a() == bum.a.b;
   }

   @Override
   public void a(bum $$0, cwb $$1) {
      this.c($$1);
      if ($$0 == bum.a) {
         this.a($$0, this.h.g.set(this.h.j, $$1), $$1);
      } else if ($$0 == bum.b) {
         this.a($$0, this.h.i.set(0, $$1), $$1);
      } else if ($$0.a() == bum.a.b) {
         this.a($$0, this.h.h.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cwb $$0) {
      return this.h.f($$0);
   }

   @Override
   public Iterable<cwb> fe() {
      return Lists.newArrayList(new cwb[]{this.fb(), this.fc()});
   }

   @Override
   public Iterable<cwb> fd() {
      return this.h.h;
   }

   @Override
   public boolean e(bum $$0) {
      return $$0 != bum.g;
   }

   public boolean h(uk $$0) {
      if (this.ca() || !this.aK() || this.bk() || this.aw) {
         return false;
      } else if (this.gB().g()) {
         this.i($$0);
         this.g = this.dX().aa();
         return true;
      } else if (this.gC().g()) {
         this.j($$0);
         this.g = this.dX().aa();
         return true;
      } else {
         return false;
      }
   }

   protected void gy() {
      if (this.g + 20L < this.dX().aa()) {
         this.k(this.gB());
         this.i(new uk());
         this.k(this.gC());
         this.j(new uk());
      }
   }

   private void k(uk $$0) {
      if (!this.dX().C && !$$0.g()) {
         bul.a($$0, this.dX(), buk.r).ifPresent($$0x -> {
            if ($$0x instanceof bvx) {
               ((bvx)$$0x).b(this.au);
            }

            $$0x.a_(this.dC(), this.dE() + 0.7F, this.dI());
            ((arn)this.dX()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean R_();

   @Override
   public boolean bH() {
      return !this.R_() && super.bH();
   }

   @Override
   public boolean cl() {
      return !this.j.b && !this.R_() && super.cl();
   }

   public abstract boolean f();

   @Override
   public boolean cK() {
      return !this.j.b;
   }

   public fas gz() {
      return this.dX().O();
   }

   @Override
   public xi S_() {
      xw $$0 = fan.a(this.cs(), this.am());
      return this.a($$0);
   }

   private xw a(xw $$0) {
      String $$1 = this.gj().getName();
      return $$0.a($$1x -> $$1x.a(new xg(xg.a.d, "/tell " + $$1 + " ")).a(this.cR()).a($$1));
   }

   @Override
   public String cJ() {
      return this.gj().getName();
   }

   @Override
   protected void F(float $$0) {
      this.aw().a(e, $$0);
   }

   @Override
   public float fy() {
      return this.aw().a(e);
   }

   public boolean a(coo $$0) {
      return (this.aw().a(bX) & $$0.a()) == $$0.a();
   }

   @Override
   public bvs a_(int $$0) {
      if ($$0 == 499) {
         return new bvs() {
            @Override
            public cwb a() {
               return com.this.cd.g();
            }

            @Override
            public boolean a(cwb $$0) {
               com.this.cd.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bvs() {
               @Override
               public cwb a() {
                  return com.this.cc.r().a($$1);
               }

               @Override
               public boolean a(cwb $$0) {
                  com.this.cc.r().a($$1, $$0);
                  com.this.cc.a(com.this.h);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.h.g.size()) {
            return bvs.a(this.h, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.cb.b() ? bvs.a(this.cb, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gA() {
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
   public buu fA() {
      return this.am.a(bY) == 0 ? buu.a : buu.b;
   }

   public void b(buu $$0) {
      this.am.a(bY, (byte)($$0 == buu.a ? 0 : 1));
   }

   public uk gB() {
      return this.am.a(bZ);
   }

   protected void i(uk $$0) {
      this.am.a(bZ, $$0);
   }

   public uk gC() {
      return this.am.a(ca);
   }

   protected void j(uk $$0) {
      this.am.a(ca, $$0);
   }

   public float gD() {
      return (float)(1.0 / this.h(bwi.e) * 20.0);
   }

   public float H(float $$0) {
      return azk.a(((float)this.aS + $$0) / this.gD(), 0.0F, 1.0F);
   }

   public void gE() {
      this.aS = 0;
   }

   public cvy gF() {
      return this.cC;
   }

   @Override
   protected float aU() {
      return !this.j.b && !this.fL() ? super.aU() : 1.0F;
   }

   public float gG() {
      return (float)this.h(bwi.q);
   }

   public boolean gH() {
      return this.j.d && this.H() >= 2;
   }

   @Override
   public buh e(bvm $$0) {
      return d.getOrDefault($$0, bW);
   }

   @Override
   public ImmutableList<bvm> fQ() {
      return ImmutableList.of(bvm.a, bvm.f, bvm.d);
   }

   @Override
   public cwb d(cwb $$0) {
      if (!($$0.h() instanceof cwx)) {
         return cwb.k;
      } else {
         Predicate<cwb> $$1 = ((cwx)$$0.h()).d();
         cwb $$2 = cwx.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((cwx)$$0.h()).b();

            for (int $$3 = 0; $$3 < this.h.b(); $$3++) {
               cwb $$4 = this.h.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.j.d ? new cwb(cwf.ox) : cwb.k;
         }
      }
   }

   @Override
   public ezn u(float $$0) {
      double $$1 = 0.22 * (this.fA() == buu.b ? -1.0 : 1.0);
      float $$2 = azk.h($$0 * 0.5F, this.dP(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = azk.h($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      if (this.fL() || this.fx()) {
         ezn $$4 = this.g($$0);
         ezn $$5 = this.dA();
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

         return this.o($$0).e(new ezn($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cm()) {
         return this.o($$0).e(new ezn($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cS().c() - 1.0;
         double $$13 = this.cj() ? -0.2 : 0.07;
         return this.o($$0).e(new ezn($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dW() {
      return true;
   }

   public boolean gI() {
      return this.fB() && this.fD().a(cwf.qY);
   }

   @Override
   public boolean dV() {
      return false;
   }

   public Optional<jp> gJ() {
      return this.cD;
   }

   public void c(Optional<jp> $$0) {
      this.cD = $$0;
   }

   @Override
   public float eN() {
      return this.cw;
   }

   @Override
   public void p(float $$0) {
      super.p($$0);
      this.cw = $$0;
   }

   @Override
   public boolean dQ() {
      return true;
   }

   @Override
   protected float fq() {
      if (this.j.b && !this.ca()) {
         return this.ck() ? this.j.a() * 2.0F : this.j.a();
      } else {
         return this.ck() ? 0.025999999F : 0.02F;
      }
   }

   public double gK() {
      return this.h(bwi.g);
   }

   public double gL() {
      return this.h(bwi.j);
   }

   public boolean b(bue $$0, double $$1) {
      return $$0.dS() ? false : this.a($$0.cS(), $$1);
   }

   public boolean a(ezi $$0, double $$1) {
      double $$2 = this.gL() + $$1;
      return $$0.e(this.bG()) < $$2 * $$2;
   }

   public boolean a(jh $$0, double $$1) {
      double $$2 = this.gK() + $$1;
      return new ezi($$0).e(this.bG()) < $$2 * $$2;
   }

   public void w(boolean $$0) {
      this.cE = $$0;
      if ($$0) {
         this.cF = 40;
      } else {
         this.cF = 0;
      }
   }

   public boolean gM() {
      return this.cE;
   }

   public void gN() {
      if (this.cF == 0) {
         this.gO();
      }
   }

   public void gO() {
      this.cF = 0;
      this.cy = null;
      this.cx = null;
      this.cE = false;
   }

   public boolean gP() {
      return false;
   }

   public static enum a {
      a,
      b(xi.c("block.minecraft.bed.no_sleep")),
      c(xi.c("block.minecraft.bed.too_far_away")),
      d(xi.c("block.minecraft.bed.obstructed")),
      e,
      f(xi.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final xi g;

      private a() {
         this.g = null;
      }

      private a(final xi $$0) {
         this.g = $$0;
      }

      @Nullable
      public xi a() {
         return this.g;
      }
   }
}
