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

public abstract class coh extends buv {
   private static final Logger b = LogUtils.getLogger();
   public static final bup bE = bup.b;
   public static final int bF = 0;
   public static final int bG = 20;
   public static final int bH = 100;
   public static final int bI = 10;
   public static final int bJ = 200;
   public static final int bK = 499;
   public static final int bL = 500;
   public static final float bM = 4.5F;
   public static final float bN = 3.0F;
   public static final float bO = 1.5F;
   public static final float bP = 0.6F;
   public static final float bQ = 0.6F;
   public static final float bR = 1.62F;
   private static final int c = 40;
   public static final ezh bS = new ezh(0.0, 0.6, 0.0);
   public static final buc bT = buc.b(0.6F, 1.8F).b(1.62F).a(bub.a().a(bua.b, bS));
   private static final Map<bvh, buc> d = ImmutableMap.builder()
      .put(bvh.a, bT)
      .put(bvh.c, aB)
      .put(bvh.b, buc.b(0.6F, 0.6F).b(0.4F))
      .put(bvh.d, buc.b(0.6F, 0.6F).b(0.4F))
      .put(bvh.e, buc.b(0.6F, 0.6F).b(0.4F))
      .put(bvh.f, buc.b(0.6F, 1.5F).b(1.27F).a(bub.a().a(bua.b, bS)))
      .put(bvh.h, buc.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final akk<Float> e = ako.a(coh.class, akm.d);
   private static final akk<Integer> f = ako.a(coh.class, akm.b);
   protected static final akk<Byte> bU = ako.a(coh.class, akm.a);
   protected static final akk<Byte> bV = ako.a(coh.class, akm.a);
   protected static final akk<uj> bW = ako.a(coh.class, akm.t);
   protected static final akk<uj> bX = ako.a(coh.class, akm.t);
   private long g;
   final cog h = new cog(this);
   protected csx bY = new csx();
   public final csm bZ;
   public crj ca;
   protected crf cb = new crf();
   protected int cc;
   public float cd;
   public float ce;
   public int cf;
   public double cg;
   public double ch;
   public double ci;
   public double cj;
   public double ck;
   public double cl;
   private int i;
   protected boolean cm;
   private final cod cw = new cod();
   public int cn;
   public int co;
   public float cp;
   protected int cq;
   protected final float cr = 0.02F;
   private int cx;
   private final GameProfile cy;
   private boolean cA;
   private cvx cB = cvx.k;
   private final cvu cC = this.k();
   private Optional<jo> cD = Optional.empty();
   @Nullable
   public cox cs;
   protected float ct;
   @Nullable
   public ezh cu;
   @Nullable
   public btz cv;
   private boolean cE;
   private int cF;

   public coh(dev $$0, jg $$1, float $$2, GameProfile $$3) {
      super(bug.by, $$0);
      this.a_($$3.getId());
      this.cy = $$3;
      this.bZ = new csm(this.h, !$$0.C, this);
      this.ca = this.bZ;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bh = 180.0F;
   }

   public boolean a(dev $$0, jg $$1, des $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == des.d) {
         return true;
      } else if (this.gw()) {
         return false;
      } else {
         cvx $$3 = this.fb();
         return $$3.f() || !$$3.b(new dvh($$0, $$1, false));
      }
   }

   public static bwc.a fZ() {
      return buv.ef().a(bwd.c, 1.0).a(bwd.v, 0.1F).a(bwd.e).a(bwd.q).a(bwd.g, 4.5).a(bwd.j, 3.0).a(bwd.f).a(bwd.C).a(bwd.z).a(bwd.t).a(bwd.D);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(e, 0.0F);
      $$0.a(f, 0);
      $$0.a(bU, (byte)0);
      $$0.a(bV, (byte)bE.b());
      $$0.a(bW, new uj());
      $$0.a(bX, new uj());
   }

   @Override
   public void l() {
      this.ae = this.R_();
      if (this.R_()) {
         this.d(false);
      }

      if (this.cf > 0) {
         this.cf--;
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
      if (!this.dX().C && this.ca != null && !this.ca.b(this)) {
         this.s();
         this.ca = this.bZ;
      }

      this.w();
      if (!this.dX().C) {
         this.cb.a(this);
         this.a(awu.k);
         this.a(awu.l);
         if (this.bM()) {
            this.a(awu.m);
         }

         if (this.ch()) {
            this.a(awu.o);
         }

         if (!this.fT()) {
            this.a(awu.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = azj.a(this.dC(), -2.9999999E7, 2.9999999E7);
      double $$2 = azj.a(this.dI(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dC() || $$2 != this.dI()) {
         this.a_($$1, this.dE(), $$2);
      }

      this.aP++;
      cvx $$3 = this.fb();
      if (!cvx.a(this.cB, $$3)) {
         if (!cvx.b(this.cB, $$3)) {
            this.gE();
         }

         this.cB = $$3.v();
      }

      this.q();
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
      this.cm = this.a(axf.a);
      return this.cm;
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
      cvx $$0 = this.a(buh.f);
      if ($$0.a(cwb.op) && !this.a(axf.a)) {
         this.a(new bte(btg.m, 200, 0, false, false, true));
      }
   }

   protected cvu k() {
      return new cvu();
   }

   private void w() {
      this.cg = this.cj;
      this.ch = this.ck;
      this.ci = this.cl;
      double $$0 = this.dC() - this.cj;
      double $$1 = this.dE() - this.ck;
      double $$2 = this.dI() - this.cl;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cj = this.dC();
         this.cg = this.cj;
      }

      if ($$2 > 10.0) {
         this.cl = this.dI();
         this.ci = this.cl;
      }

      if ($$1 > 10.0) {
         this.ck = this.dE();
         this.ch = this.ck;
      }

      if ($$0 < -10.0) {
         this.cj = this.dC();
         this.cg = this.cj;
      }

      if ($$2 < -10.0) {
         this.cl = this.dI();
         this.ci = this.cl;
      }

      if ($$1 < -10.0) {
         this.ck = this.dE();
         this.ch = this.ck;
      }

      this.cj += $$0 * 0.25;
      this.cl += $$2 * 0.25;
      this.ck += $$1 * 0.25;
   }

   protected void ge() {
      if (this.h(bvh.d)) {
         bvh $$0;
         if (this.fL()) {
            $$0 = bvh.b;
         } else if (this.fT()) {
            $$0 = bvh.c;
         } else if (this.cl()) {
            $$0 = bvh.d;
         } else if (this.fx()) {
            $$0 = bvh.e;
         } else if (this.ce() && !this.cw.b) {
            $$0 = bvh.f;
         } else {
            $$0 = bvh.a;
         }

         bvh $$6;
         if (this.R_() || this.ca() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bvh.f)) {
            $$6 = bvh.f;
         } else {
            $$6 = bvh.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bvh $$0) {
      return this.dX().a(this, this.a($$0).a(this.dv()).h(1.0E-7));
   }

   @Override
   protected awj aV() {
      return awk.ut;
   }

   @Override
   protected awj aW() {
      return awk.ur;
   }

   @Override
   protected awj aX() {
      return awk.us;
   }

   @Override
   public int bY() {
      return 10;
   }

   @Override
   public void a(awj $$0, float $$1, float $$2) {
      this.dX().a(this, this.dC(), this.dE(), this.dI(), $$0, this.dn(), $$1, $$2);
   }

   public void a(awj $$0, awl $$1, float $$2, float $$3) {
   }

   @Override
   public awl dn() {
      return awl.h;
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
      this.ca = this.bZ;
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
         this.cd = this.ce;
         this.ce = 0.0F;
      }
   }

   @Override
   protected void fw() {
      super.fw();
      this.eZ();
      this.aW = this.dN();
   }

   @Override
   public void n_() {
      if (this.cc > 0) {
         this.cc--;
      }

      if (this.dX().am() == brv.a && this.dX().ac().b(der.k)) {
         if (this.eG() < this.eV() && this.ag % 20 == 0) {
            this.c(1.0F);
         }

         if (this.cb.e() < 20.0F && this.ag % 20 == 0) {
            this.cb.b(this.cb.e() + 1.0F);
         }

         if (this.cb.c() && this.ag % 10 == 0) {
            this.cb.a(this.cb.a() + 1);
         }
      }

      this.h.j();
      this.cd = this.ce;
      if (this.cw.b && !this.ca()) {
         this.n();
      }

      super.n_();
      this.C((float)this.h(bwd.v));
      float $$1;
      if (this.aJ() && !this.eH() && !this.cl()) {
         $$1 = Math.min(0.1F, (float)this.dA().i());
      } else {
         $$1 = 0.0F;
      }

      this.ce = this.ce + ($$1 - this.ce) * 0.4F;
      if (this.eG() > 0.0F && !this.R_()) {
         ezc $$2;
         if (this.ca() && !this.dl().dS()) {
            $$2 = this.cS().b(this.dl().cS()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cS().c(1.0, 0.5, 1.0);
         }

         List<btz> $$4 = this.dX().a_(this, $$2);
         List<btz> $$5 = Lists.newArrayList();

         for (btz $$6 : $$4) {
            if ($$6.aq() == bug.M) {
               $$5.add($$6);
            } else if (!$$6.dS()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ad.a($$5, this.af));
         }
      }

      this.c(this.gB());
      this.c(this.gC());
      if (!this.dX().C && (this.aa > 0.5F || this.bk()) || this.cw.b || this.fT() || this.aw) {
         this.gy();
      }
   }

   private void c(@Nullable uj $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dX().A.a(200) == 0) {
         String $$1 = $$0.l("id");
         bug.a($$1).filter($$0x -> $$0x == bug.ax).ifPresent($$0x -> {
            if (!chc.a(this.dX(), this)) {
               this.dX().a(null, this.dC(), this.dE(), this.dI(), chc.a(this.dX(), this.dX().A), this.dn(), 1.0F, chc.a(this.dX().A));
            }
         });
      }
   }

   private void d(btz $$0) {
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

   public void a(int $$0, float $$1, cvx $$2) {
      this.bz = $$0;
      this.bA = $$1;
      this.bB = $$2;
      if (!this.dX().C) {
         this.gy();
         this.c(4, true);
      }
   }

   @Nonnull
   @Override
   public cvx eb() {
      return this.fx() && this.bB != null ? this.bB : super.eb();
   }

   @Override
   public void a(bsp $$0) {
      super.a($$0);
      this.az();
      if (!this.R_() && this.dX() instanceof arm $$1) {
         this.a($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-azj.b((this.eN() + this.dN()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-azj.a((this.eN() + this.dN()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(awu.N);
      this.a(awu.i.b(awu.m));
      this.a(awu.i.b(awu.n));
      this.aH();
      this.c(false);
      this.a(Optional.of(jo.a(this.dX().ag(), this.dx())));
   }

   @Override
   protected void eJ() {
      super.eJ();
      if (!this.dX().ac().b(der.d)) {
         this.gg();
         this.h.k();
      }
   }

   protected void gg() {
      for (int $$0 = 0; $$0 < this.h.b(); $$0++) {
         cvx $$1 = this.h.a($$0);
         if (!$$1.f() && dbo.a($$1, dbn.D)) {
            this.h.b($$0);
         }
      }
   }

   @Override
   protected awj d(bsp $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected awj o_() {
      return awk.uj;
   }

   @Override
   public void g(cvx $$0) {
   }

   @Nullable
   public ckq a(cvx $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public ckq a(cvx $$0, boolean $$1, boolean $$2) {
      if (!$$0.f() && this.dX().C) {
         this.a(brx.a);
      }

      return null;
   }

   public float c(dvd $$0) {
      float $$1 = this.h.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(bwd.t);
      }

      if (btf.a(this)) {
         $$1 *= 1.0F + (float)(btf.b(this) + 1) * 0.2F;
      }

      if (this.b(btg.d)) {
         float $$2 = switch (this.c(btg.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.h(bwd.f);
      if (this.a(axf.a)) {
         $$1 *= (float)this.g(bwd.C).g();
      }

      if (!this.aJ()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dvd $$0) {
      return !$$0.C() || this.h.f().b($$0);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.a_(this.cy.getId());
      up $$1 = $$0.c("Inventory", 10);
      this.h.b($$1);
      this.h.j = $$0.h("SelectedItemSlot");
      this.i = $$0.g("SleepTimer");
      this.cp = $$0.j("XpP");
      this.cn = $$0.h("XpLevel");
      this.co = $$0.h("XpTotal");
      this.cq = $$0.h("XpSeed");
      if (this.cq == 0) {
         this.cq = this.af.f();
      }

      this.r($$0.h("Score"));
      this.cb.a($$0);
      this.cw.b($$0);
      this.g(bwd.v).a((double)this.cw.b());
      if ($$0.b("EnderItems", 9)) {
         this.bY.a($$0.c("EnderItems", 10), this.dZ());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(jo.b.parse(ux.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         ezh.a.parse(ux.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.cu = $$0x);
      }

      this.cE = $$0.q("ignore_fall_damage_from_current_explosion");
      this.cF = $$0.h("current_impulse_context_reset_grace_time");
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      uy.e($$0);
      $$0.a("Inventory", this.h.a(new up()));
      $$0.a("SelectedItemSlot", this.h.j);
      $$0.a("SleepTimer", (short)this.i);
      $$0.a("XpP", this.cp);
      $$0.a("XpLevel", this.cn);
      $$0.a("XpTotal", this.co);
      $$0.a("XpSeed", this.cq);
      $$0.a("Score", this.gf());
      this.cb.b($$0);
      this.cw.a($$0);
      $$0.a("EnderItems", this.bY.a(this.dZ()));
      if (!this.gB().g()) {
         $$0.a("ShoulderEntityLeft", this.gB());
      }

      if (!this.gC().g()) {
         $$0.a("ShoulderEntityRight", this.gC());
      }

      this.gJ().flatMap($$0x -> jo.b.encodeStart(ux.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cu != null) {
         $$0.a("current_explosion_impact_pos", (vg)ezh.a.encodeStart(ux.a, this.cu).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cE);
      $$0.a("current_impulse_context_reset_grace_time", this.cF);
   }

   @Override
   public boolean b(bsp $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(axb.n)) {
         return !this.dX().ac().b(der.G);
      } else if ($$0.a(axb.m)) {
         return !this.dX().ac().b(der.H);
      } else if ($$0.a(axb.i)) {
         return !this.dX().ac().b(der.I);
      } else {
         return $$0.a(axb.o) ? !this.dX().ac().b(der.J) : false;
      }
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cw.a && !$$0.a(axb.d)) {
         return false;
      } else {
         this.bc = 0;
         if (this.eH()) {
            return false;
         } else {
            if (!this.dX().C) {
               this.gy();
            }

            if ($$0.g()) {
               if (this.dX().am() == brv.a) {
                  $$1 = 0.0F;
               }

               if (this.dX().am() == brv.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dX().am() == brv.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(buv $$0) {
      super.d($$0);
      cvx $$1 = this.fJ();
      if ($$0.fW() && $$1 != null) {
         this.h($$1);
      }
   }

   @Override
   public boolean ez() {
      return !this.gl().a && super.ez();
   }

   public boolean a(coh $$0) {
      fao $$1 = this.cs();
      fao $$2 = $$0.cs();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bsp $$0, float $$1) {
      this.a($$0, $$1, new buh[]{buh.c, buh.d, buh.e, buh.f});
   }

   @Override
   protected void c(bsp $$0, float $$1) {
      this.a($$0, $$1, new buh[]{buh.f});
   }

   @Override
   protected void z(float $$0) {
      if (this.bw.a(cwb.vu)) {
         if (!this.dX().C) {
            this.b(awu.c.b(this.bw.h()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + azj.d($$0);
            brx $$2 = this.fC();
            this.bw.a($$1, this, d($$2));
            if (this.bw.f()) {
               if ($$2 == brx.a) {
                  this.a(buh.a, cvx.k);
               } else {
                  this.a(buh.b, cvx.k);
               }

               this.bw = cvx.k;
               this.a(awk.wD, 0.8F, 0.8F + this.dX().A.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bsp $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fy(), 0.0F);
         this.E(this.fy() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(awu.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.G($$0.a());
            this.eT().a($$0, var7);
            this.x(this.eG() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(awu.J, Math.round(var7 * 10.0F));
            }

            this.a(eaa.o);
         }
      }
   }

   public boolean ab() {
      return false;
   }

   public void a(dts $$0, boolean $$1) {
   }

   public void a(ddv $$0) {
   }

   public void a(dsq $$0) {
   }

   public void a(dtx $$0) {
   }

   public void a(dti $$0) {
   }

   public void a(ciq $$0, brr $$1) {
   }

   public OptionalInt a(@Nullable bsa $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, ddt $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cvx $$0, brx $$1) {
   }

   public bry a(btz $$0, brx $$1) {
      if (this.R_()) {
         if ($$0 instanceof bsa) {
            this.a((bsa)$$0);
         }

         return bry.e;
      } else {
         cvx $$2 = this.b($$1);
         cvx $$3 = $$2.v();
         bry $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cw.d && $$2 == this.b($$1) && $$2.L() < $$3.L()) {
               $$2.e($$3.L());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof buv) {
               if (this.cw.d) {
                  $$2 = $$3;
               }

               bry $$5 = $$2.a(this, (buv)$$0, $$1);
               if ($$5.a()) {
                  this.dX().a(eaa.r, $$0.dv(), eaa.a.a(this));
                  if ($$2.f() && !this.cw.d) {
                     this.a($$1, cvx.k);
                  }

                  return $$5;
               }
            }

            return bry.e;
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
      return !this.cw.b;
   }

   @Override
   protected ezh a(ezh $$0, buz $$1) {
      float $$2 = this.dR();
      if (!this.cw.b && !($$0.e > 0.0) && ($$1 == buz.a || $$1 == buz.b) && this.gc() && this.I($$2)) {
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

         return new ezh($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean I(float $$0) {
      return this.aJ() || this.aa < $$0 && !this.b(0.0, 0.0, $$0 - this.aa);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      ezc $$3 = this.cS();
      return this.dX().a(this, new ezc($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(btz $$0) {
      if ($$0.cC()) {
         if (!$$0.v(this)) {
            float $$1 = this.fx() ? this.bA : (float)this.h(bwd.c);
            cvx $$2 = this.eb();
            bsp $$3;
            if ($$2.h() == cwb.ud && cwj.a(this)) {
               $$3 = this.dY().f(this);
            } else {
               $$3 = this.dY().a(this);
            }

            float $$5 = this.a($$0, $$1, $$3) - $$1;
            float $$6 = this.H(0.5F);
            $$1 *= 0.2F + $$6 * $$6 * 0.8F;
            $$5 *= $$6;
            this.gE();
            if ($$0.aq().a(axd.H) && $$0 instanceof cpb $$7 && $$7.a(cpc.c, this, this, true)) {
               this.dX().a(null, this.dC(), this.dE(), this.dI(), awk.uc, this.dn());
               return;
            }

            if ($$1 > 0.0F || $$5 > 0.0F) {
               boolean $$8 = $$6 > 0.9F;
               boolean $$9;
               if (this.ck() && $$8) {
                  this.dX().a(null, this.dC(), this.dE(), this.dI(), awk.ub, this.dn(), 1.0F, 1.0F);
                  $$9 = true;
               } else {
                  $$9 = false;
               }

               $$1 += $$2.h().a($$0, $$1, $$3);
               boolean $$11 = $$8
                  && this.aa > 0.0F
                  && !this.aJ()
                  && !this.q_()
                  && !this.bk()
                  && !this.b(btg.o)
                  && !this.ca()
                  && $$0 instanceof buv
                  && !this.ck();
               if ($$11) {
                  $$1 *= 1.5F;
               }

               float $$12 = $$1 + $$5;
               boolean $$13 = false;
               if ($$8 && !$$11 && !$$9 && this.aJ()) {
                  double $$14 = this.ai().j();
                  double $$15 = (double)this.fr() * 2.5;
                  if ($$14 < azj.k($$15) && this.b(brx.a).a(axi.bE)) {
                     $$13 = true;
                  }
               }

               float $$16 = 0.0F;
               if ($$0 instanceof buv $$17) {
                  $$16 = $$17.eG();
               }

               ezh $$18 = $$0.dA();
               boolean $$19 = $$0.a($$3, $$12);
               if ($$19) {
                  float $$20 = this.a($$0, $$3) + ($$9 ? 1.0F : 0.0F);
                  if ($$20 > 0.0F) {
                     if ($$0 instanceof buv $$21) {
                        $$21.p(
                           (double)($$20 * 0.5F), (double)azj.a(this.dN() * (float) (Math.PI / 180.0)), (double)(-azj.b(this.dN() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.j(
                           (double)(-azj.a(this.dN() * (float) (Math.PI / 180.0)) * $$20 * 0.5F),
                           0.1,
                           (double)(azj.b(this.dN() * (float) (Math.PI / 180.0)) * $$20 * 0.5F)
                        );
                     }

                     this.h(this.dA().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$13) {
                     float $$22 = 1.0F + (float)this.h(bwd.D) * $$1;

                     for (buv $$24 : this.dX().a(buv.class, $$0.cS().c(1.0, 0.25, 1.0))) {
                        if ($$24 != this && $$24 != $$0 && !this.s($$24) && (!($$24 instanceof ckf) || !((ckf)$$24).A()) && this.g((btz)$$24) < 9.0) {
                           float $$25 = this.a($$24, $$22, $$3) * $$6;
                           $$24.p(0.4F, (double)azj.a(this.dN() * (float) (Math.PI / 180.0)), (double)(-azj.b(this.dN() * (float) (Math.PI / 180.0))));
                           $$24.a($$3, $$25);
                           if (this.dX() instanceof arm $$26) {
                              dbo.a($$26, (btz)$$24, $$3);
                           }
                        }
                     }

                     this.dX().a(null, this.dC(), this.dE(), this.dI(), awk.ue, this.dn(), 1.0F, 1.0F);
                     this.gh();
                  }

                  if ($$0 instanceof arn && $$0.U) {
                     ((arn)$$0).d.b(new afl($$0));
                     $$0.U = false;
                     $$0.h($$18);
                  }

                  if ($$11) {
                     this.dX().a(null, this.dC(), this.dE(), this.dI(), awk.ua, this.dn(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$11 && !$$13) {
                     if ($$8) {
                        this.dX().a(null, this.dC(), this.dE(), this.dI(), awk.ud, this.dn(), 1.0F, 1.0F);
                     } else {
                        this.dX().a(null, this.dC(), this.dE(), this.dI(), awk.uf, this.dn(), 1.0F, 1.0F);
                     }
                  }

                  if ($$5 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  btz $$27 = $$0;
                  if ($$0 instanceof cjg) {
                     $$27 = ((cjg)$$0).b;
                  }

                  boolean $$28 = false;
                  if (this.dX() instanceof arm $$29) {
                     if ($$27 instanceof buv $$30) {
                        $$28 = $$2.a($$30, this);
                     }

                     dbo.a($$29, $$0, $$3);
                  }

                  if (!this.dX().C && !$$2.f() && $$27 instanceof buv) {
                     if ($$28) {
                        $$2.b((buv)$$27, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.fb()) {
                           this.a(brx.a, cvx.k);
                        } else {
                           this.a(brx.b, cvx.k);
                        }
                     }
                  }

                  if ($$0 instanceof buv) {
                     float $$31 = $$16 - ((buv)$$0).eG();
                     this.a(awu.G, Math.round($$31 * 10.0F));
                     if (this.dX() instanceof arm && $$31 > 2.0F) {
                        int $$32 = (int)((double)$$31 * 0.5);
                        ((arm)this.dX()).a(lq.g, $$0.dC(), $$0.e(0.5), $$0.dI(), $$32, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.G(0.1F);
               } else {
                  this.dX().a(null, this.dC(), this.dE(), this.dI(), awk.uc, this.dn(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(btz $$0, float $$1, bsp $$2) {
      return $$1;
   }

   @Override
   protected void g(buv $$0) {
      this.e($$0);
   }

   public void h(cvx $$0) {
      this.gF().a($$0, 100);
      this.fH();
      this.dX().a(this, (byte)30);
   }

   public void b(btz $$0) {
   }

   public void c(btz $$0) {
   }

   public void gh() {
      double $$0 = (double)(-azj.a(this.dN() * (float) (Math.PI / 180.0)));
      double $$1 = (double)azj.b(this.dN() * (float) (Math.PI / 180.0));
      if (this.dX() instanceof arm) {
         ((arm)this.dX()).a(lq.aj, this.dC() + $$0, this.e(0.5), this.dI() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void gi() {
   }

   @Override
   public void a(btz.c $$0) {
      super.a($$0);
      this.bZ.a(this);
      if (this.ca != null && this.gm()) {
         this.t();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile gj() {
      return this.cy;
   }

   public cog gk() {
      return this.h;
   }

   public cod gl() {
      return this.cw;
   }

   @Override
   public boolean fX() {
      return this.cw.d;
   }

   public void a(cvx $$0, cvx $$1, crt $$2) {
   }

   public boolean gm() {
      return this.ca != this.bZ;
   }

   public Either<coh.a, bao> a(jg $$0) {
      this.b($$0);
      this.i = 0;
      return Either.right(bao.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fU();
      if (this.dX() instanceof arm && $$1) {
         ((arm)this.dX()).e();
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

   public void a(xh $$0, boolean $$1) {
   }

   public void a(alh $$0) {
      this.b(awu.i.b($$0));
   }

   public void a(alh $$0, int $$1) {
      this.a(awu.i.b($$0), $$1);
   }

   public void b(awr<?> $$0) {
      this.a($$0, 1);
   }

   public void a(awr<?> $$0, int $$1) {
   }

   public void a(awr<?> $$0) {
   }

   public int a(Collection<dal<?>> $$0) {
      return 0;
   }

   public void a(dal<?> $$0, List<cvx> $$1) {
   }

   public void b(List<alh> $$0) {
   }

   public int b(Collection<dal<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(ezh $$0) {
      if (this.ca()) {
         super.a_($$0);
      } else {
         if (this.cl()) {
            double $$1 = this.bU().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bk || !this.dX().b_(jg.a(this.dC(), this.dE() + 1.0 - 0.1, this.dI())).c()) {
               ezh $$3 = this.dA();
               this.h($$3.b(0.0, ($$1 - $$3.e) * $$2, 0.0));
            }
         }

         if (this.gl().b) {
            double $$4 = this.dA().e;
            super.a_($$0);
            this.h(this.dA().a(jl.a.b, $$4 * 0.6));
         } else {
            super.a_($$0);
         }
      }
   }

   @Override
   protected boolean fv() {
      return !this.cw.b && super.fv();
   }

   @Override
   public void bq() {
      if (this.cw.b) {
         this.i(false);
      } else {
         super.bq();
      }
   }

   protected boolean h(jg $$0) {
      return !this.dX().a_($$0).j(this.dX(), $$0);
   }

   @Override
   public float fr() {
      return (float)this.h(bwd.v);
   }

   @Override
   public boolean a(float $$0, float $$1, bsp $$2) {
      if (this.cw.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(awu.t, (int)Math.round((double)$$0 * 100.0));
         }

         boolean $$3 = this.cu != null && this.cE;
         float $$4;
         if ($$3) {
            $$4 = Math.min($$0, (float)(this.cu.e - this.dE()));
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
   protected void b(jg $$0, dvd $$1) {
      if (this.bk()) {
         this.aZ();
         this.b($$1);
      } else {
         jg $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dvd $$3 = this.dX().a_($$2);
            if ($$3.a(awz.bp)) {
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
   public buv.a eP() {
      return new buv.a(awk.uq, awk.ug);
   }

   @Override
   public boolean a(arm $$0, buv $$1) {
      this.b(awu.g.b($$1.aq()));
      return true;
   }

   @Override
   public void a(dvd $$0, ezh $$1) {
      if (!this.cw.b) {
         super.a($$0, $$1);
      }

      this.gN();
   }

   public void d(int $$0) {
      this.s($$0);
      this.cp = this.cp + (float)$$0 / (float)this.gt();
      this.co = azj.a(this.co + $$0, 0, Integer.MAX_VALUE);

      while (this.cp < 0.0F) {
         float $$1 = this.cp * (float)this.gt();
         if (this.cn > 0) {
            this.c(-1);
            this.cp = 1.0F + $$1 / (float)this.gt();
         } else {
            this.c(-1);
            this.cp = 0.0F;
         }
      }

      while (this.cp >= 1.0F) {
         this.cp = (this.cp - 1.0F) * (float)this.gt();
         this.c(1);
         this.cp = this.cp / (float)this.gt();
      }
   }

   public int gs() {
      return this.cq;
   }

   public void a(cvx $$0, int $$1) {
      this.cn -= $$1;
      if (this.cn < 0) {
         this.cn = 0;
         this.cp = 0.0F;
         this.co = 0;
      }

      this.cq = this.af.f();
   }

   public void c(int $$0) {
      this.cn = IntMath.saturatedAdd(this.cn, $$0);
      if (this.cn < 0) {
         this.cn = 0;
         this.cp = 0.0F;
         this.co = 0;
      }

      if ($$0 > 0 && this.cn % 5 == 0 && (float)this.cx < (float)this.ag - 100.0F) {
         float $$1 = this.cn > 30 ? 1.0F : (float)this.cn / 30.0F;
         this.dX().a(null, this.dC(), this.dE(), this.dI(), awk.up, this.dn(), $$1 * 0.75F, 1.0F);
         this.cx = this.ag;
      }
   }

   public int gt() {
      if (this.cn >= 30) {
         return 112 + (this.cn - 30) * 9;
      } else {
         return this.cn >= 15 ? 37 + (this.cn - 15) * 5 : 7 + this.cn * 2;
      }
   }

   public void G(float $$0) {
      if (!this.cw.a) {
         if (!this.dX().C) {
            this.cb.a($$0);
         }
      }
   }

   public Optional<cnm> ad() {
      return Optional.empty();
   }

   public crf gu() {
      return this.cb;
   }

   public boolean u(boolean $$0) {
      return this.cw.a || $$0 || this.cb.c();
   }

   public boolean gv() {
      return this.eG() > 0.0F && this.eG() < this.eV();
   }

   public boolean gw() {
      return this.cw.e;
   }

   public boolean a(jg $$0, jl $$1, cvx $$2) {
      if (this.cw.e) {
         return true;
      } else {
         jg $$3 = $$0.a($$1.g());
         dvh $$4 = new dvh(this.dX(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int eq() {
      return !this.dX().ac().b(der.d) && !this.R_() ? Math.min(this.cn * 7, 100) : 0;
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
   protected btz.b bh() {
      return this.cw.b || this.aJ() && this.ch() ? btz.b.a : btz.b.d;
   }

   public void A() {
   }

   @Override
   public xh al() {
      return xh.b(this.cy.getName());
   }

   public csx gx() {
      return this.bY;
   }

   @Override
   public cvx a(buh $$0) {
      if ($$0 == buh.a) {
         return this.h.f();
      } else if ($$0 == buh.b) {
         return this.h.i.getFirst();
      } else {
         return $$0.a() == buh.a.b ? this.h.h.get($$0.b()) : cvx.k;
      }
   }

   @Override
   protected boolean b(buh $$0) {
      return $$0.a() == buh.a.b;
   }

   @Override
   public void a(buh $$0, cvx $$1) {
      this.c($$1);
      if ($$0 == buh.a) {
         this.a($$0, this.h.g.set(this.h.j, $$1), $$1);
      } else if ($$0 == buh.b) {
         this.a($$0, this.h.i.set(0, $$1), $$1);
      } else if ($$0.a() == buh.a.b) {
         this.a($$0, this.h.h.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cvx $$0) {
      return this.h.f($$0);
   }

   @Override
   public Iterable<cvx> fe() {
      return Lists.newArrayList(new cvx[]{this.fb(), this.fc()});
   }

   @Override
   public Iterable<cvx> fd() {
      return this.h.h;
   }

   @Override
   public boolean e(buh $$0) {
      return $$0 != buh.g;
   }

   public boolean h(uj $$0) {
      if (this.ca() || !this.aJ() || this.bk() || this.aw) {
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
         this.i(new uj());
         this.k(this.gC());
         this.j(new uj());
      }
   }

   private void k(uj $$0) {
      if (!this.dX().C && !$$0.g()) {
         bug.a($$0, this.dX(), buf.r).ifPresent($$0x -> {
            if ($$0x instanceof bvs) {
               ((bvs)$$0x).b(this.au);
            }

            $$0x.a_(this.dC(), this.dE() + 0.7F, this.dI());
            ((arm)this.dX()).c($$0x);
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
      return !this.cw.b && !this.R_() && super.cl();
   }

   public abstract boolean f();

   @Override
   public boolean cK() {
      return !this.cw.b;
   }

   public fam gz() {
      return this.dX().O();
   }

   @Override
   public xh S_() {
      xv $$0 = fah.a(this.cs(), this.al());
      return this.a($$0);
   }

   private xv a(xv $$0) {
      String $$1 = this.gj().getName();
      return $$0.a($$1x -> $$1x.a(new xf(xf.a.d, "/tell " + $$1 + " ")).a(this.cR()).a($$1));
   }

   @Override
   public String cJ() {
      return this.gj().getName();
   }

   @Override
   protected void F(float $$0) {
      this.av().a(e, $$0);
   }

   @Override
   public float fy() {
      return this.av().a(e);
   }

   public boolean a(coi $$0) {
      return (this.av().a(bU) & $$0.a()) == $$0.a();
   }

   @Override
   public bvn a_(int $$0) {
      if ($$0 == 499) {
         return new bvn() {
            @Override
            public cvx a() {
               return coh.this.ca.g();
            }

            @Override
            public boolean a(cvx $$0) {
               coh.this.ca.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bvn() {
               @Override
               public cvx a() {
                  return coh.this.bZ.r().a($$1);
               }

               @Override
               public boolean a(cvx $$0) {
                  coh.this.bZ.r().a($$1, $$0);
                  coh.this.bZ.a(coh.this.h);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.h.g.size()) {
            return bvn.a(this.h, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.bY.b() ? bvn.a(this.bY, $$2) : super.a_($$0);
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
      super.h(this.cw.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bup fA() {
      return this.am.a(bV) == 0 ? bup.a : bup.b;
   }

   public void b(bup $$0) {
      this.am.a(bV, (byte)($$0 == bup.a ? 0 : 1));
   }

   public uj gB() {
      return this.am.a(bW);
   }

   protected void i(uj $$0) {
      this.am.a(bW, $$0);
   }

   public uj gC() {
      return this.am.a(bX);
   }

   protected void j(uj $$0) {
      this.am.a(bX, $$0);
   }

   public float gD() {
      return (float)(1.0 / this.h(bwd.e) * 20.0);
   }

   public float H(float $$0) {
      return azj.a(((float)this.aP + $$0) / this.gD(), 0.0F, 1.0F);
   }

   public void gE() {
      this.aP = 0;
   }

   public cvu gF() {
      return this.cC;
   }

   @Override
   protected float aT() {
      return !this.cw.b && !this.fL() ? super.aT() : 1.0F;
   }

   public float gG() {
      return (float)this.h(bwd.q);
   }

   public boolean gH() {
      return this.cw.d && this.H() >= 2;
   }

   @Override
   public buc e(bvh $$0) {
      return d.getOrDefault($$0, bT);
   }

   @Override
   public ImmutableList<bvh> fQ() {
      return ImmutableList.of(bvh.a, bvh.f, bvh.d);
   }

   @Override
   public cvx d(cvx $$0) {
      if (!($$0.h() instanceof cwt)) {
         return cvx.k;
      } else {
         Predicate<cvx> $$1 = ((cwt)$$0.h()).d();
         cvx $$2 = cwt.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((cwt)$$0.h()).b();

            for (int $$3 = 0; $$3 < this.h.b(); $$3++) {
               cvx $$4 = this.h.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cw.d ? new cvx(cwb.ox) : cvx.k;
         }
      }
   }

   @Override
   public ezh u(float $$0) {
      double $$1 = 0.22 * (this.fA() == bup.b ? -1.0 : 1.0);
      float $$2 = azj.h($$0 * 0.5F, this.dP(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = azj.h($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      if (this.fL() || this.fx()) {
         ezh $$4 = this.g($$0);
         ezh $$5 = this.dA();
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

         return this.o($$0).e(new ezh($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cm()) {
         return this.o($$0).e(new ezh($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cS().c() - 1.0;
         double $$13 = this.cj() ? -0.2 : 0.07;
         return this.o($$0).e(new ezh($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dW() {
      return true;
   }

   public boolean gI() {
      return this.fB() && this.fD().a(cwb.qY);
   }

   @Override
   public boolean dV() {
      return false;
   }

   public Optional<jo> gJ() {
      return this.cD;
   }

   public void a(Optional<jo> $$0) {
      this.cD = $$0;
   }

   @Override
   public float eN() {
      return this.ct;
   }

   @Override
   public void p(float $$0) {
      super.p($$0);
      this.ct = $$0;
   }

   @Override
   public boolean dQ() {
      return true;
   }

   @Override
   protected float fq() {
      if (this.cw.b && !this.ca()) {
         return this.ck() ? this.cw.a() * 2.0F : this.cw.a();
      } else {
         return this.ck() ? 0.025999999F : 0.02F;
      }
   }

   public double gK() {
      return this.h(bwd.g);
   }

   public double gL() {
      return this.h(bwd.j);
   }

   public boolean b(btz $$0, double $$1) {
      return $$0.dS() ? false : this.a($$0.cS(), $$1);
   }

   public boolean a(ezc $$0, double $$1) {
      double $$2 = this.gL() + $$1;
      return $$0.e(this.bG()) < $$2 * $$2;
   }

   public boolean a(jg $$0, double $$1) {
      double $$2 = this.gK() + $$1;
      return new ezc($$0).e(this.bG()) < $$2 * $$2;
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
      this.cv = null;
      this.cu = null;
      this.cE = false;
   }

   public boolean gP() {
      return false;
   }

   public static enum a {
      a,
      b(xh.c("block.minecraft.bed.no_sleep")),
      c(xh.c("block.minecraft.bed.too_far_away")),
      d(xh.c("block.minecraft.bed.obstructed")),
      e,
      f(xh.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final xh g;

      private a() {
         this.g = null;
      }

      private a(final xh $$0) {
         this.g = $$0;
      }

      @Nullable
      public xh a() {
         return this.g;
      }
   }
}
