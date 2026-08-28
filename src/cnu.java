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

public abstract class cnu extends buk {
   private static final Logger b = LogUtils.getLogger();
   public static final bue bD = bue.b;
   public static final int bE = 0;
   public static final int bF = 20;
   public static final int bG = 100;
   public static final int bH = 10;
   public static final int bI = 200;
   public static final int bJ = 499;
   public static final int bK = 500;
   public static final float bL = 4.5F;
   public static final float bM = 3.0F;
   public static final float bN = 1.5F;
   public static final float bO = 0.6F;
   public static final float bP = 0.6F;
   public static final float bQ = 1.62F;
   private static final int c = 40;
   public static final eys bR = new eys(0.0, 0.6, 0.0);
   public static final btr bS = btr.b(0.6F, 1.8F).b(1.62F).a(btq.a().a(btp.b, bR));
   private static final Map<buw, btr> d = ImmutableMap.builder()
      .put(buw.a, bS)
      .put(buw.c, aA)
      .put(buw.b, btr.b(0.6F, 0.6F).b(0.4F))
      .put(buw.d, btr.b(0.6F, 0.6F).b(0.4F))
      .put(buw.e, btr.b(0.6F, 0.6F).b(0.4F))
      .put(buw.f, btr.b(0.6F, 1.5F).b(1.27F).a(btq.a().a(btp.b, bR)))
      .put(buw.h, btr.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final akg<Float> e = akk.a(cnu.class, aki.d);
   private static final akg<Integer> f = akk.a(cnu.class, aki.b);
   protected static final akg<Byte> bT = akk.a(cnu.class, aki.a);
   protected static final akg<Byte> bU = akk.a(cnu.class, aki.a);
   protected static final akg<uf> bV = akk.a(cnu.class, aki.t);
   protected static final akg<uf> bW = akk.a(cnu.class, aki.t);
   private long g;
   final cnt h = new cnt(this);
   protected csk bX = new csk();
   public final crz bY;
   public cqw bZ;
   protected cqs ca = new cqs();
   protected int cb;
   public float cc;
   public float cd;
   public int ce;
   public double cf;
   public double cg;
   public double ch;
   public double ci;
   public double cj;
   public double ck;
   private int cv;
   protected boolean cl;
   private final cnr cw = new cnr();
   public int cm;
   public int cn;
   public float co;
   protected int cp;
   protected final float cq = 0.02F;
   private int cx;
   private final GameProfile cy;
   private boolean cA;
   private cvp cB = cvp.k;
   private final cvl cC = this.k();
   private Optional<jm> cD = Optional.empty();
   @Nullable
   public coj cr;
   protected float cs;
   @Nullable
   public eys ct;
   @Nullable
   public bto cu;
   private boolean cE;
   private int cF;

   public cnu(deg $$0, je $$1, float $$2, GameProfile $$3) {
      super(btv.by, $$0);
      this.a_($$3.getId());
      this.cy = $$3;
      this.bY = new crz(this.h, !$$0.B, this);
      this.bZ = this.bY;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bg = 180.0F;
   }

   public boolean a(deg $$0, je $$1, ded $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == ded.d) {
         return true;
      } else if (this.go()) {
         return false;
      } else {
         cvp $$3 = this.eW();
         return $$3.f() || !$$3.b(new dus($$0, $$1, false));
      }
   }

   public static bvq.a fR() {
      return buk.dZ().a(bvr.c, 1.0).a(bvr.v, 0.1F).a(bvr.e).a(bvr.q).a(bvr.g, 4.5).a(bvr.j, 3.0).a(bvr.f).a(bvr.C).a(bvr.z).a(bvr.t).a(bvr.D);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(e, 0.0F);
      $$0.a(f, 0);
      $$0.a(bT, (byte)0);
      $$0.a(bU, (byte)bD.b());
      $$0.a(bV, new uf());
      $$0.a(bW, new uf());
   }

   @Override
   public void l() {
      this.ae = this.P_();
      if (this.P_()) {
         this.d(false);
      }

      if (this.ce > 0) {
         this.ce--;
      }

      if (this.fM()) {
         this.cv++;
         if (this.cv > 100) {
            this.cv = 100;
         }

         if (!this.dS().B && this.dS().S()) {
            this.a(false, true);
         }
      } else if (this.cv > 0) {
         this.cv++;
         if (this.cv >= 110) {
            this.cv = 0;
         }
      }

      this.fV();
      super.l();
      if (!this.dS().B && this.bZ != null && !this.bZ.b(this)) {
         this.s();
         this.bZ = this.bY;
      }

      this.w();
      if (!this.dS().B) {
         this.ca.a(this);
         this.a(awo.k);
         this.a(awo.l);
         if (this.bI()) {
            this.a(awo.m);
         }

         if (this.cd()) {
            this.a(awo.o);
         }

         if (!this.fM()) {
            this.a(awo.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = azd.a(this.dx(), -2.9999999E7, 2.9999999E7);
      double $$2 = azd.a(this.dD(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dx() || $$2 != this.dD()) {
         this.a_($$1, this.dz(), $$2);
      }

      this.aO++;
      cvp $$3 = this.eW();
      if (!cvp.a(this.cB, $$3)) {
         if (!cvp.b(this.cB, $$3)) {
            this.gw();
         }

         this.cB = $$3.u();
      }

      this.q();
      this.cC.a();
      this.fW();
      if (this.cF > 0) {
         this.cF--;
      }
   }

   @Override
   protected float fn() {
      return this.fC() ? 15.0F : super.fn();
   }

   public boolean fS() {
      return this.ca();
   }

   protected boolean fT() {
      return this.ca();
   }

   protected boolean fU() {
      return this.ca();
   }

   protected boolean fV() {
      this.cl = this.a(awz.a);
      return this.cl;
   }

   private void q() {
      cvp $$0 = this.a(btw.f);
      if ($$0.a(cvt.op) && !this.a(awz.a)) {
         this.a(new bsv(bsx.m, 200, 0, false, false, true));
      }
   }

   protected cvl k() {
      return new cvl();
   }

   private void w() {
      this.cf = this.ci;
      this.cg = this.cj;
      this.ch = this.ck;
      double $$0 = this.dx() - this.ci;
      double $$1 = this.dz() - this.cj;
      double $$2 = this.dD() - this.ck;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.ci = this.dx();
         this.cf = this.ci;
      }

      if ($$2 > 10.0) {
         this.ck = this.dD();
         this.ch = this.ck;
      }

      if ($$1 > 10.0) {
         this.cj = this.dz();
         this.cg = this.cj;
      }

      if ($$0 < -10.0) {
         this.ci = this.dx();
         this.cf = this.ci;
      }

      if ($$2 < -10.0) {
         this.ck = this.dD();
         this.ch = this.ck;
      }

      if ($$1 < -10.0) {
         this.cj = this.dz();
         this.cg = this.cj;
      }

      this.ci += $$0 * 0.25;
      this.ck += $$2 * 0.25;
      this.cj += $$1 * 0.25;
   }

   protected void fW() {
      if (this.h(buw.d)) {
         buw $$0;
         if (this.fF()) {
            $$0 = buw.b;
         } else if (this.fM()) {
            $$0 = buw.c;
         } else if (this.ch()) {
            $$0 = buw.d;
         } else if (this.fr()) {
            $$0 = buw.e;
         } else if (this.ca() && !this.cw.b) {
            $$0 = buw.f;
         } else {
            $$0 = buw.a;
         }

         buw $$6;
         if (this.P_() || this.bW() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(buw.f)) {
            $$6 = buw.f;
         } else {
            $$6 = buw.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(buw $$0) {
      return this.dS().a(this, this.a($$0).a(this.dq()).h(1.0E-7));
   }

   @Override
   protected awd aT() {
      return awe.uv;
   }

   @Override
   protected awd aU() {
      return awe.ut;
   }

   @Override
   protected awd aV() {
      return awe.uu;
   }

   @Override
   public int bU() {
      return 10;
   }

   @Override
   public void a(awd $$0, float $$1, float $$2) {
      this.dS().a(this, this.dx(), this.dz(), this.dD(), $$0, this.di(), $$1, $$2);
   }

   public void a(awd $$0, awf $$1, float $$2, float $$3) {
   }

   @Override
   public awf di() {
      return awf.h;
   }

   @Override
   protected int dj() {
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
      this.bZ = this.bY;
   }

   protected void t() {
   }

   @Override
   public void u() {
      if (!this.dS().B && this.fT() && this.bW()) {
         this.af();
         this.g(false);
      } else {
         super.u();
         this.cc = this.cd;
         this.cd = 0.0F;
      }
   }

   @Override
   protected void fq() {
      super.fq();
      this.eU();
      this.aV = this.dI();
   }

   @Override
   public void m_() {
      if (this.cb > 0) {
         this.cb--;
      }

      if (this.dS().am() == brm.a && this.dS().ac().b(dec.k)) {
         if (this.eA() < this.eQ() && this.ag % 20 == 0) {
            this.c(1.0F);
         }

         if (this.ca.e() < 20.0F && this.ag % 20 == 0) {
            this.ca.b(this.ca.e() + 1.0F);
         }

         if (this.ca.c() && this.ag % 10 == 0) {
            this.ca.a(this.ca.a() + 1);
         }
      }

      this.h.j();
      this.cc = this.cd;
      if (this.cw.b && !this.bW()) {
         this.n();
      }

      super.m_();
      this.C((float)this.h(bvr.v));
      float $$1;
      if (this.aH() && !this.eB() && !this.ch()) {
         $$1 = Math.min(0.1F, (float)this.dv().i());
      } else {
         $$1 = 0.0F;
      }

      this.cd = this.cd + ($$1 - this.cd) * 0.4F;
      if (this.eA() > 0.0F && !this.P_()) {
         eyn $$2;
         if (this.bW() && !this.dg().dN()) {
            $$2 = this.cO().b(this.dg().cO()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cO().c(1.0, 0.5, 1.0);
         }

         List<bto> $$4 = this.dS().a_(this, $$2);
         List<bto> $$5 = Lists.newArrayList();

         for (bto $$6 : $$4) {
            if ($$6.ao() == btv.M) {
               $$5.add($$6);
            } else if (!$$6.dN()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ad.a($$5, this.af));
         }
      }

      this.c(this.gt());
      this.c(this.gu());
      if (!this.dS().B && (this.aa > 0.5F || this.bi()) || this.cw.b || this.fM() || this.aw) {
         this.gq();
      }
   }

   private void c(@Nullable uf $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dS().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         btv.a($$1).filter($$0x -> $$0x == btv.ax).ifPresent($$0x -> {
            if (!cgq.a(this.dS(), this)) {
               this.dS().a(null, this.dx(), this.dz(), this.dD(), cgq.a(this.dS(), this.dS().z), this.di(), 1.0F, cgq.a(this.dS().z));
            }
         });
      }
   }

   private void d(bto $$0) {
      $$0.b_(this);
   }

   public int fX() {
      return this.am.a(f);
   }

   public void r(int $$0) {
      this.am.a(f, $$0);
   }

   public void s(int $$0) {
      int $$1 = this.fX();
      this.am.a(f, $$1 + $$0);
   }

   public void a(int $$0, float $$1, cvp $$2) {
      this.by = $$0;
      this.bz = $$1;
      this.bA = $$2;
      if (!this.dS().B) {
         this.gq();
         this.c(4, true);
      }
   }

   @Nonnull
   @Override
   public cvp dW() {
      return this.fr() && this.bA != null ? this.bA : super.dW();
   }

   @Override
   public void a(bsg $$0) {
      super.a($$0);
      this.ax();
      if (!this.P_() && this.dS() instanceof arh $$1) {
         this.a($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-azd.b((this.eI() + this.dI()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-azd.a((this.eI() + this.dI()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(awo.N);
      this.a(awo.i.b(awo.m));
      this.a(awo.i.b(awo.n));
      this.aF();
      this.c(false);
      this.a(Optional.of(jm.a(this.dS().ag(), this.ds())));
   }

   @Override
   protected void eD() {
      super.eD();
      if (!this.dS().ac().b(dec.d)) {
         this.fY();
         this.h.k();
      }
   }

   protected void fY() {
      for (int $$0 = 0; $$0 < this.h.b(); $$0++) {
         cvp $$1 = this.h.a($$0);
         if (!$$1.f() && dbm.a($$1, dbl.D)) {
            this.h.b($$0);
         }
      }
   }

   @Override
   protected awd d(bsg $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected awd n_() {
      return awe.ul;
   }

   @Override
   public void h(cvp $$0) {
   }

   @Nullable
   public cke a(cvp $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cke a(cvp $$0, boolean $$1, boolean $$2) {
      if (!$$0.f() && this.dS().B) {
         this.a(bro.a);
      }

      return null;
   }

   public float c(duo $$0) {
      float $$1 = this.h.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(bvr.t);
      }

      if (bsw.a(this)) {
         $$1 *= 1.0F + (float)(bsw.b(this) + 1) * 0.2F;
      }

      if (this.b(bsx.d)) {
         $$1 *= switch (this.c(bsx.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.h(bvr.f);
      if (this.a(awz.a)) {
         $$1 *= (float)this.g(bvr.C).g();
      }

      if (!this.aH()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(duo $$0) {
      return !$$0.C() || this.h.f().b($$0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a_(this.cy.getId());
      ul $$1 = $$0.c("Inventory", 10);
      this.h.b($$1);
      this.h.j = $$0.h("SelectedItemSlot");
      this.cv = $$0.g("SleepTimer");
      this.co = $$0.j("XpP");
      this.cm = $$0.h("XpLevel");
      this.cn = $$0.h("XpTotal");
      this.cp = $$0.h("XpSeed");
      if (this.cp == 0) {
         this.cp = this.af.f();
      }

      this.r($$0.h("Score"));
      this.ca.a($$0);
      this.cw.b($$0);
      this.g(bvr.v).a((double)this.cw.b());
      if ($$0.b("EnderItems", 9)) {
         this.bX.a($$0.c("EnderItems", 10), this.dU());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(jm.b.parse(ut.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         eys.a.parse(ut.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.ct = $$0x);
      }

      this.cE = $$0.q("ignore_fall_damage_from_current_explosion");
      this.cF = $$0.h("current_impulse_context_reset_grace_time");
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      uu.e($$0);
      $$0.a("Inventory", this.h.a(new ul()));
      $$0.a("SelectedItemSlot", this.h.j);
      $$0.a("SleepTimer", (short)this.cv);
      $$0.a("XpP", this.co);
      $$0.a("XpLevel", this.cm);
      $$0.a("XpTotal", this.cn);
      $$0.a("XpSeed", this.cp);
      $$0.a("Score", this.fX());
      this.ca.b($$0);
      this.cw.a($$0);
      $$0.a("EnderItems", this.bX.a(this.dU()));
      if (!this.gt().g()) {
         $$0.a("ShoulderEntityLeft", this.gt());
      }

      if (!this.gu().g()) {
         $$0.a("ShoulderEntityRight", this.gu());
      }

      this.gB().flatMap($$0x -> jm.b.encodeStart(ut.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.ct != null) {
         $$0.a("current_explosion_impact_pos", (vc)eys.a.encodeStart(ut.a, this.ct).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cE);
      $$0.a("current_impulse_context_reset_grace_time", this.cF);
   }

   @Override
   public boolean b(bsg $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(awv.n)) {
         return !this.dS().ac().b(dec.G);
      } else if ($$0.a(awv.m)) {
         return !this.dS().ac().b(dec.H);
      } else if ($$0.a(awv.i)) {
         return !this.dS().ac().b(dec.I);
      } else {
         return $$0.a(awv.o) ? !this.dS().ac().b(dec.J) : false;
      }
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cw.a && !$$0.a(awv.d)) {
         return false;
      } else {
         this.bb = 0;
         if (this.eB()) {
            return false;
         } else {
            if (!this.dS().B) {
               this.gq();
            }

            if ($$0.g()) {
               if (this.dS().am() == brm.a) {
                  $$1 = 0.0F;
               }

               if (this.dS().am() == brm.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dS().am() == brm.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(buk $$0) {
      super.d($$0);
      cvp $$1 = this.fD();
      if ($$0.fP() && $$1 != null) {
         this.i($$1);
      }
   }

   @Override
   public boolean et() {
      return !this.gd().a && super.et();
   }

   public boolean a(cnu $$0) {
      ezz $$1 = this.co();
      ezz $$2 = $$0.co();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bsg $$0, float $$1) {
      this.a($$0, $$1, new btw[]{btw.c, btw.d, btw.e, btw.f});
   }

   @Override
   protected void c(bsg $$0, float $$1) {
      this.a($$0, $$1, new btw[]{btw.f});
   }

   @Override
   protected void z(float $$0) {
      if (this.bv.a(cvt.vu)) {
         if (!this.dS().B) {
            this.b(awo.c.b(this.bv.h()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + azd.d($$0);
            bro $$2 = this.fw();
            this.bv.a($$1, this, d($$2));
            if (this.bv.f()) {
               if ($$2 == bro.a) {
                  this.a(btw.a, cvp.k);
               } else {
                  this.a(btw.b, cvp.k);
               }

               this.bv = cvp.k;
               this.a(awe.wF, 0.8F, 0.8F + this.dS().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bsg $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fs(), 0.0F);
         this.E(this.fs() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(awo.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.G($$0.a());
            this.eO().a($$0, var7);
            this.x(this.eA() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(awo.J, Math.round(var7 * 10.0F));
            }

            this.a(dzl.o);
         }
      }
   }

   public boolean ab() {
      return false;
   }

   public void a(dte $$0, boolean $$1) {
   }

   public void a(ddg $$0) {
   }

   public void a(dsc $$0) {
   }

   public void a(dtj $$0) {
   }

   public void a(dsu $$0) {
   }

   public void a(cie $$0, bri $$1) {
   }

   public OptionalInt a(@Nullable brr $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dde $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cvp $$0, bro $$1) {
   }

   public brp a(bto $$0, bro $$1) {
      if (this.P_()) {
         if ($$0 instanceof brr) {
            this.a((brr)$$0);
         }

         return brp.e;
      } else {
         cvp $$2 = this.b($$1);
         cvp $$3 = $$2.u();
         brp $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cw.d && $$2 == this.b($$1) && $$2.J() < $$3.J()) {
               $$2.e($$3.J());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof buk) {
               if (this.cw.d) {
                  $$2 = $$3;
               }

               brp $$5 = $$2.a(this, (buk)$$0, $$1);
               if ($$5.a()) {
                  this.dS().a(dzl.r, $$0.dq(), dzl.a.a(this));
                  if ($$2.f() && !this.cw.d) {
                     this.a($$1, cvp.k);
                  }

                  return $$5;
               }
            }

            return brp.e;
         }
      }
   }

   @Override
   public void bN() {
      super.bN();
      this.K = 0;
   }

   @Override
   protected boolean ff() {
      return super.ff() || this.fM();
   }

   @Override
   public boolean eg() {
      return !this.cw.b;
   }

   @Override
   protected eys a(eys $$0, buo $$1) {
      float $$2 = this.dM();
      if (!this.cw.b && !($$0.e > 0.0) && ($$1 == buo.a || $$1 == buo.b) && this.fU() && this.I($$2)) {
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

         return new eys($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean I(float $$0) {
      return this.aH() || this.aa < $$0 && !this.b(0.0, 0.0, $$0 - this.aa);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      eyn $$3 = this.cO();
      return this.dS().a(this, new eyn($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(bto $$0) {
      if ($$0.cy()) {
         if (!$$0.v(this)) {
            float $$1 = this.fr() ? this.bz : (float)this.h(bvr.c);
            cvp $$2 = this.dW();
            bsg $$3;
            if ($$2.h() == cvt.ud && cwb.a(this)) {
               $$3 = this.dT().f(this);
            } else {
               $$3 = this.dT().a(this);
            }

            float $$5 = this.a($$0, $$1, $$3) - $$1;
            float $$6 = this.H(0.5F);
            $$1 *= 0.2F + $$6 * $$6 * 0.8F;
            $$5 *= $$6;
            this.gw();
            if ($$0.ao().a(awx.H) && $$0 instanceof coo $$7 && $$7.a(cop.c, this, this, true)) {
               this.dS().a(null, this.dx(), this.dz(), this.dD(), awe.ue, this.di());
               return;
            }

            if ($$1 > 0.0F || $$5 > 0.0F) {
               boolean $$8 = $$6 > 0.9F;
               boolean $$9;
               if (this.cg() && $$8) {
                  this.dS().a(null, this.dx(), this.dz(), this.dD(), awe.ud, this.di(), 1.0F, 1.0F);
                  $$9 = true;
               } else {
                  $$9 = false;
               }

               $$1 += $$2.h().a($$0, $$1, $$3);
               boolean $$11 = $$8
                  && this.aa > 0.0F
                  && !this.aH()
                  && !this.p_()
                  && !this.bi()
                  && !this.b(bsx.o)
                  && !this.bW()
                  && $$0 instanceof buk
                  && !this.cg();
               if ($$11) {
                  $$1 *= 1.5F;
               }

               float $$12 = $$1 + $$5;
               boolean $$13 = false;
               if ($$8 && !$$11 && !$$9 && this.aH()) {
                  double $$14 = this.ai().j();
                  double $$15 = (double)this.fm() * 2.5;
                  if ($$14 < azd.k($$15) && this.b(bro.a).a(axc.bv)) {
                     $$13 = true;
                  }
               }

               float $$16 = 0.0F;
               if ($$0 instanceof buk $$17) {
                  $$16 = $$17.eA();
               }

               eys $$18 = $$0.dv();
               boolean $$19 = $$0.a($$3, $$12);
               if ($$19) {
                  float $$20 = this.a($$0, $$3) + ($$9 ? 1.0F : 0.0F);
                  if ($$20 > 0.0F) {
                     if ($$0 instanceof buk $$21) {
                        $$21.p(
                           (double)($$20 * 0.5F), (double)azd.a(this.dI() * (float) (Math.PI / 180.0)), (double)(-azd.b(this.dI() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.j(
                           (double)(-azd.a(this.dI() * (float) (Math.PI / 180.0)) * $$20 * 0.5F),
                           0.1,
                           (double)(azd.b(this.dI() * (float) (Math.PI / 180.0)) * $$20 * 0.5F)
                        );
                     }

                     this.h(this.dv().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$13) {
                     float $$22 = 1.0F + (float)this.h(bvr.D) * $$1;

                     for (buk $$24 : this.dS().a(buk.class, $$0.cO().c(1.0, 0.25, 1.0))) {
                        if ($$24 != this && $$24 != $$0 && !this.s($$24) && (!($$24 instanceof cjt) || !((cjt)$$24).A()) && this.g($$24) < 9.0) {
                           float $$25 = this.a($$24, $$22, $$3) * $$6;
                           $$24.p(0.4F, (double)azd.a(this.dI() * (float) (Math.PI / 180.0)), (double)(-azd.b(this.dI() * (float) (Math.PI / 180.0))));
                           $$24.a($$3, $$25);
                           if (this.dS() instanceof arh $$26) {
                              dbm.a($$26, (bto)$$24, $$3);
                           }
                        }
                     }

                     this.dS().a(null, this.dx(), this.dz(), this.dD(), awe.ug, this.di(), 1.0F, 1.0F);
                     this.fZ();
                  }

                  if ($$0 instanceof ari && $$0.U) {
                     ((ari)$$0).c.b(new afh($$0));
                     $$0.U = false;
                     $$0.h($$18);
                  }

                  if ($$11) {
                     this.dS().a(null, this.dx(), this.dz(), this.dD(), awe.uc, this.di(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$11 && !$$13) {
                     if ($$8) {
                        this.dS().a(null, this.dx(), this.dz(), this.dD(), awe.uf, this.di(), 1.0F, 1.0F);
                     } else {
                        this.dS().a(null, this.dx(), this.dz(), this.dD(), awe.uh, this.di(), 1.0F, 1.0F);
                     }
                  }

                  if ($$5 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  bto $$27 = $$0;
                  if ($$0 instanceof ciu) {
                     $$27 = ((ciu)$$0).b;
                  }

                  boolean $$28 = false;
                  if (this.dS() instanceof arh $$29) {
                     if ($$27 instanceof buk $$30) {
                        $$28 = $$2.a($$30, this);
                     }

                     dbm.a($$29, $$0, $$3);
                  }

                  if (!this.dS().B && !$$2.f() && $$27 instanceof buk) {
                     if ($$28) {
                        $$2.b((buk)$$27, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.eW()) {
                           this.a(bro.a, cvp.k);
                        } else {
                           this.a(bro.b, cvp.k);
                        }
                     }
                  }

                  if ($$0 instanceof buk) {
                     float $$31 = $$16 - ((buk)$$0).eA();
                     this.a(awo.G, Math.round($$31 * 10.0F));
                     if (this.dS() instanceof arh && $$31 > 2.0F) {
                        int $$32 = (int)((double)$$31 * 0.5);
                        ((arh)this.dS()).a(ln.g, $$0.dx(), $$0.e(0.5), $$0.dD(), $$32, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.G(0.1F);
               } else {
                  this.dS().a(null, this.dx(), this.dz(), this.dD(), awe.ue, this.di(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(bto $$0, float $$1, bsg $$2) {
      return $$1;
   }

   @Override
   protected void g(buk $$0) {
      this.e($$0);
   }

   public void i(cvp $$0) {
      this.gx().a($$0, 100);
      this.fB();
      this.dS().a(this, (byte)30);
   }

   public void b(bto $$0) {
   }

   public void c(bto $$0) {
   }

   public void fZ() {
      double $$0 = (double)(-azd.a(this.dI() * (float) (Math.PI / 180.0)));
      double $$1 = (double)azd.b(this.dI() * (float) (Math.PI / 180.0));
      if (this.dS() instanceof arh) {
         ((arh)this.dS()).a(ln.aj, this.dx() + $$0, this.e(0.5), this.dD() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void ga() {
   }

   @Override
   public void a(bto.c $$0) {
      super.a($$0);
      this.bY.a(this);
      if (this.bZ != null && this.ge()) {
         this.t();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile gb() {
      return this.cy;
   }

   public cnt gc() {
      return this.h;
   }

   public cnr gd() {
      return this.cw;
   }

   @Override
   public boolean fQ() {
      return this.cw.d;
   }

   public void a(cvp $$0, cvp $$1, crg $$2) {
   }

   public boolean ge() {
      return this.bZ != this.bY;
   }

   public Either<cnu.a, bai> a(je $$0) {
      this.b($$0);
      this.cv = 0;
      return Either.right(bai.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fN();
      if (this.dS() instanceof arh && $$1) {
         ((arh)this.dS()).e();
      }

      this.cv = $$0 ? 0 : 100;
   }

   @Override
   public void fN() {
      this.a(true, true);
   }

   public boolean gf() {
      return this.fM() && this.cv >= 100;
   }

   public int gg() {
      return this.cv;
   }

   public void a(xd $$0, boolean $$1) {
   }

   public void a(alc $$0) {
      this.b(awo.i.b($$0));
   }

   public void a(alc $$0, int $$1) {
      this.a(awo.i.b($$0), $$1);
   }

   public void b(awl<?> $$0) {
      this.a($$0, 1);
   }

   public void a(awl<?> $$0, int $$1) {
   }

   public void a(awl<?> $$0) {
   }

   public int a(Collection<daj<?>> $$0) {
      return 0;
   }

   public void a(daj<?> $$0, List<cvp> $$1) {
   }

   public void b(List<alc> $$0) {
   }

   public int b(Collection<daj<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(eys $$0) {
      if (this.bW()) {
         super.a_($$0);
      } else {
         if (this.ch()) {
            double $$1 = this.bQ().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bj || !this.dS().b_(je.a(this.dx(), this.dz() + 1.0 - 0.1, this.dD())).c()) {
               eys $$3 = this.dv();
               this.h($$3.b(0.0, ($$1 - $$3.e) * $$2, 0.0));
            }
         }

         if (this.gd().b) {
            double $$4 = this.dv().e;
            super.a_($$0);
            this.h(this.dv().a(jj.a.b, $$4 * 0.6));
         } else {
            super.a_($$0);
         }
      }
   }

   @Override
   protected boolean d(cvp $$0) {
      return !this.cw.b && super.d($$0);
   }

   @Override
   public void bo() {
      if (this.cw.b) {
         this.i(false);
      } else {
         super.bo();
      }
   }

   protected boolean h(je $$0) {
      return !this.dS().a_($$0).j(this.dS(), $$0);
   }

   @Override
   public float fm() {
      return (float)this.h(bvr.v);
   }

   @Override
   public boolean a(float $$0, float $$1, bsg $$2) {
      if (this.cw.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(awo.t, (int)Math.round((double)$$0 * 100.0));
         }

         boolean $$3 = this.ct != null && this.cE;
         float $$4;
         if ($$3) {
            $$4 = Math.min($$0, (float)(this.ct.e - this.dz()));
            boolean $$5 = $$4 <= 0.0F;
            if ($$5) {
               this.gG();
            } else {
               this.gF();
            }
         } else {
            $$4 = $$0;
         }

         if ($$4 > 0.0F && super.a($$4, $$1, $$2)) {
            this.gG();
            return true;
         } else {
            return false;
         }
      }
   }

   public boolean gh() {
      if (!this.aH() && !this.fF() && !this.bi() && !this.b(bsx.y)) {
         cvp $$0 = this.a(btw.e);
         if ($$0.a(cvt.nU) && cun.g($$0)) {
            this.gi();
            return true;
         }
      }

      return false;
   }

   public void gi() {
      this.b(7, true);
   }

   public void gj() {
      this.b(7, true);
      this.b(7, false);
   }

   @Override
   protected void br() {
      if (!this.P_()) {
         super.br();
      }
   }

   @Override
   protected void b(je $$0, duo $$1) {
      if (this.bi()) {
         this.aX();
         this.b($$1);
      } else {
         je $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            duo $$3 = this.dS().a_($$2);
            if ($$3.a(awt.bp)) {
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
   public buk.a eK() {
      return new buk.a(awe.us, awe.ui);
   }

   @Override
   public boolean a(arh $$0, buk $$1) {
      this.b(awo.g.b($$1.ao()));
      return true;
   }

   @Override
   public void a(duo $$0, eys $$1) {
      if (!this.cw.b) {
         super.a($$0, $$1);
      }

      this.gF();
   }

   public void d(int $$0) {
      this.s($$0);
      this.co = this.co + (float)$$0 / (float)this.gl();
      this.cn = azd.a(this.cn + $$0, 0, Integer.MAX_VALUE);

      while (this.co < 0.0F) {
         float $$1 = this.co * (float)this.gl();
         if (this.cm > 0) {
            this.c(-1);
            this.co = 1.0F + $$1 / (float)this.gl();
         } else {
            this.c(-1);
            this.co = 0.0F;
         }
      }

      while (this.co >= 1.0F) {
         this.co = (this.co - 1.0F) * (float)this.gl();
         this.c(1);
         this.co = this.co / (float)this.gl();
      }
   }

   public int gk() {
      return this.cp;
   }

   public void a(cvp $$0, int $$1) {
      this.cm -= $$1;
      if (this.cm < 0) {
         this.cm = 0;
         this.co = 0.0F;
         this.cn = 0;
      }

      this.cp = this.af.f();
   }

   public void c(int $$0) {
      this.cm = IntMath.saturatedAdd(this.cm, $$0);
      if (this.cm < 0) {
         this.cm = 0;
         this.co = 0.0F;
         this.cn = 0;
      }

      if ($$0 > 0 && this.cm % 5 == 0 && (float)this.cx < (float)this.ag - 100.0F) {
         float $$1 = this.cm > 30 ? 1.0F : (float)this.cm / 30.0F;
         this.dS().a(null, this.dx(), this.dz(), this.dD(), awe.ur, this.di(), $$1 * 0.75F, 1.0F);
         this.cx = this.ag;
      }
   }

   public int gl() {
      if (this.cm >= 30) {
         return 112 + (this.cm - 30) * 9;
      } else {
         return this.cm >= 15 ? 37 + (this.cm - 15) * 5 : 7 + this.cm * 2;
      }
   }

   public void G(float $$0) {
      if (!this.cw.a) {
         if (!this.dS().B) {
            this.ca.a($$0);
         }
      }
   }

   public Optional<cna> ad() {
      return Optional.empty();
   }

   public cqs gm() {
      return this.ca;
   }

   public boolean u(boolean $$0) {
      return this.cw.a || $$0 || this.ca.c();
   }

   public boolean gn() {
      return this.eA() > 0.0F && this.eA() < this.eQ();
   }

   public boolean go() {
      return this.cw.e;
   }

   public boolean a(je $$0, jj $$1, cvp $$2) {
      if (this.cw.e) {
         return true;
      } else {
         je $$3 = $$0.a($$1.g());
         dus $$4 = new dus(this.dS(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int ek() {
      if (!this.dS().ac().b(dec.d) && !this.P_()) {
         int $$0 = this.cm * 7;
         return $$0 > 100 ? 100 : $$0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean el() {
      return true;
   }

   @Override
   public boolean cJ() {
      return true;
   }

   @Override
   protected bto.b bf() {
      return this.cw.b || this.aH() && this.cd() ? bto.b.a : bto.b.d;
   }

   public void A() {
   }

   @Override
   public xd aj() {
      return xd.b(this.cy.getName());
   }

   public csk gp() {
      return this.bX;
   }

   @Override
   public cvp a(btw $$0) {
      if ($$0 == btw.a) {
         return this.h.f();
      } else if ($$0 == btw.b) {
         return this.h.i.get(0);
      } else {
         return $$0.a() == btw.a.b ? this.h.h.get($$0.b()) : cvp.k;
      }
   }

   @Override
   protected boolean b(btw $$0) {
      return $$0.a() == btw.a.b;
   }

   @Override
   public void a(btw $$0, cvp $$1) {
      this.c($$1);
      if ($$0 == btw.a) {
         this.a($$0, this.h.g.set(this.h.j, $$1), $$1);
      } else if ($$0 == btw.b) {
         this.a($$0, this.h.i.set(0, $$1), $$1);
      } else if ($$0.a() == btw.a.b) {
         this.a($$0, this.h.h.set($$0.b(), $$1), $$1);
      }
   }

   public boolean j(cvp $$0) {
      return this.h.f($$0);
   }

   @Override
   public Iterable<cvp> eZ() {
      return Lists.newArrayList(new cvp[]{this.eW(), this.eX()});
   }

   @Override
   public Iterable<cvp> eY() {
      return this.h.h;
   }

   @Override
   public boolean e(btw $$0) {
      return $$0 != btw.g;
   }

   public boolean h(uf $$0) {
      if (this.bW() || !this.aH() || this.bi() || this.aw) {
         return false;
      } else if (this.gt().g()) {
         this.i($$0);
         this.g = this.dS().aa();
         return true;
      } else if (this.gu().g()) {
         this.j($$0);
         this.g = this.dS().aa();
         return true;
      } else {
         return false;
      }
   }

   protected void gq() {
      if (this.g + 20L < this.dS().aa()) {
         this.k(this.gt());
         this.i(new uf());
         this.k(this.gu());
         this.j(new uf());
      }
   }

   private void k(uf $$0) {
      if (!this.dS().B && !$$0.g()) {
         btv.a($$0, this.dS(), btu.r).ifPresent($$0x -> {
            if ($$0x instanceof bvg) {
               ((bvg)$$0x).b(this.au);
            }

            $$0x.a_(this.dx(), this.dz() + 0.7F, this.dD());
            ((arh)this.dS()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean P_();

   @Override
   public boolean bD() {
      return !this.P_() && super.bD();
   }

   @Override
   public boolean ch() {
      return !this.cw.b && !this.P_() && super.ch();
   }

   public abstract boolean f();

   @Override
   public boolean cG() {
      return !this.cw.b;
   }

   public ezx gr() {
      return this.dS().O();
   }

   @Override
   public xd Q_() {
      xr $$0 = ezs.a(this.co(), this.aj());
      return this.a($$0);
   }

   private xr a(xr $$0) {
      String $$1 = this.gb().getName();
      return $$0.a($$1x -> $$1x.a(new xb(xb.a.d, "/tell " + $$1 + " ")).a(this.cN()).a($$1));
   }

   @Override
   public String cF() {
      return this.gb().getName();
   }

   @Override
   protected void F(float $$0) {
      this.at().a(e, $$0);
   }

   @Override
   public float fs() {
      return this.at().a(e);
   }

   public boolean a(cnv $$0) {
      return (this.at().a(bT) & $$0.a()) == $$0.a();
   }

   @Override
   public bvb a_(int $$0) {
      if ($$0 == 499) {
         return new bvb() {
            @Override
            public cvp a() {
               return cnu.this.bZ.g();
            }

            @Override
            public boolean a(cvp $$0) {
               cnu.this.bZ.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bvb() {
               @Override
               public cvp a() {
                  return cnu.this.bY.r().a($$1);
               }

               @Override
               public boolean a(cvp $$0) {
                  cnu.this.bY.r().a($$1, $$0);
                  cnu.this.bY.a(cnu.this.h);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.h.g.size()) {
            return bvb.a(this.h, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.bX.b() ? bvb.a(this.bX, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gs() {
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
   public bue fu() {
      return this.am.a(bU) == 0 ? bue.a : bue.b;
   }

   public void b(bue $$0) {
      this.am.a(bU, (byte)($$0 == bue.a ? 0 : 1));
   }

   public uf gt() {
      return this.am.a(bV);
   }

   protected void i(uf $$0) {
      this.am.a(bV, $$0);
   }

   public uf gu() {
      return this.am.a(bW);
   }

   protected void j(uf $$0) {
      this.am.a(bW, $$0);
   }

   public float gv() {
      return (float)(1.0 / this.h(bvr.e) * 20.0);
   }

   public float H(float $$0) {
      return azd.a(((float)this.aO + $$0) / this.gv(), 0.0F, 1.0F);
   }

   public void gw() {
      this.aO = 0;
   }

   public cvl gx() {
      return this.cC;
   }

   @Override
   protected float aR() {
      return !this.cw.b && !this.fF() ? super.aR() : 1.0F;
   }

   public float gy() {
      return (float)this.h(bvr.q);
   }

   public boolean gz() {
      return this.cw.d && this.H() >= 2;
   }

   @Override
   public boolean e(cvp $$0) {
      btw $$1 = this.g($$0);
      return this.a($$1).f();
   }

   @Override
   public btr e(buw $$0) {
      return d.getOrDefault($$0, bS);
   }

   @Override
   public ImmutableList<buw> fJ() {
      return ImmutableList.of(buw.a, buw.f, buw.d);
   }

   @Override
   public cvp f(cvp $$0) {
      if (!($$0.h() instanceof cwl)) {
         return cvp.k;
      } else {
         Predicate<cvp> $$1 = ((cwl)$$0.h()).d();
         cvp $$2 = cwl.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((cwl)$$0.h()).b();

            for (int $$3 = 0; $$3 < this.h.b(); $$3++) {
               cvp $$4 = this.h.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cw.d ? new cvp(cvt.ox) : cvp.k;
         }
      }
   }

   @Override
   public eys u(float $$0) {
      double $$1 = 0.22 * (this.fu() == bue.b ? -1.0 : 1.0);
      float $$2 = azd.h($$0 * 0.5F, this.dK(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = azd.h($$0, this.aU, this.aT) * (float) (Math.PI / 180.0);
      if (this.fF() || this.fr()) {
         eys $$4 = this.g($$0);
         eys $$5 = this.dv();
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

         return this.o($$0).e(new eys($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.ci()) {
         return this.o($$0).e(new eys($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cO().c() - 1.0;
         double $$13 = this.cf() ? -0.2 : 0.07;
         return this.o($$0).e(new eys($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dR() {
      return true;
   }

   public boolean gA() {
      return this.fv() && this.fx().a(cvt.qY);
   }

   @Override
   public boolean dQ() {
      return false;
   }

   public Optional<jm> gB() {
      return this.cD;
   }

   public void a(Optional<jm> $$0) {
      this.cD = $$0;
   }

   @Override
   public float eI() {
      return this.cs;
   }

   @Override
   public void p(float $$0) {
      super.p($$0);
      this.cs = $$0;
   }

   @Override
   public boolean dL() {
      return true;
   }

   @Override
   protected float fl() {
      if (this.cw.b && !this.bW()) {
         return this.cg() ? this.cw.a() * 2.0F : this.cw.a();
      } else {
         return this.cg() ? 0.025999999F : 0.02F;
      }
   }

   public double gC() {
      return this.h(bvr.g);
   }

   public double gD() {
      return this.h(bvr.j);
   }

   public boolean b(bto $$0, double $$1) {
      return $$0.dN() ? false : this.a($$0.cO(), $$1);
   }

   public boolean a(eyn $$0, double $$1) {
      double $$2 = this.gD() + $$1;
      return $$0.e(this.bC()) < $$2 * $$2;
   }

   public boolean a(je $$0, double $$1) {
      double $$2 = this.gC() + $$1;
      return new eyn($$0).e(this.bC()) < $$2 * $$2;
   }

   public void w(boolean $$0) {
      this.cE = $$0;
      if ($$0) {
         this.cF = 40;
      } else {
         this.cF = 0;
      }
   }

   public boolean gE() {
      return this.cE;
   }

   public void gF() {
      if (this.cF == 0) {
         this.gG();
      }
   }

   public void gG() {
      this.cF = 0;
      this.cu = null;
      this.ct = null;
      this.cE = false;
   }

   public boolean gH() {
      return false;
   }

   public static enum a {
      a,
      b(xd.c("block.minecraft.bed.no_sleep")),
      c(xd.c("block.minecraft.bed.too_far_away")),
      d(xd.c("block.minecraft.bed.obstructed")),
      e,
      f(xd.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final xd g;

      private a() {
         this.g = null;
      }

      private a(final xd $$0) {
         this.g = $$0;
      }

      @Nullable
      public xd a() {
         return this.g;
      }
   }
}
