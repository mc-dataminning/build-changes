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

public abstract class cnx extends bun {
   private static final Logger b = LogUtils.getLogger();
   public static final buh bD = buh.b;
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
   public static final eyw bR = new eyw(0.0, 0.6, 0.0);
   public static final btu bS = btu.b(0.6F, 1.8F).b(1.62F).a(btt.a().a(bts.b, bR));
   private static final Map<buz, btu> d = ImmutableMap.builder()
      .put(buz.a, bS)
      .put(buz.c, aA)
      .put(buz.b, btu.b(0.6F, 0.6F).b(0.4F))
      .put(buz.d, btu.b(0.6F, 0.6F).b(0.4F))
      .put(buz.e, btu.b(0.6F, 0.6F).b(0.4F))
      .put(buz.f, btu.b(0.6F, 1.5F).b(1.27F).a(btt.a().a(bts.b, bR)))
      .put(buz.h, btu.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final akh<Float> e = akl.a(cnx.class, akj.d);
   private static final akh<Integer> f = akl.a(cnx.class, akj.b);
   protected static final akh<Byte> bT = akl.a(cnx.class, akj.a);
   protected static final akh<Byte> bU = akl.a(cnx.class, akj.a);
   protected static final akh<ug> bV = akl.a(cnx.class, akj.t);
   protected static final akh<ug> bW = akl.a(cnx.class, akj.t);
   private long g;
   final cnw h = new cnw(this);
   protected csn bX = new csn();
   public final csc bY;
   public cqz bZ;
   protected cqv ca = new cqv();
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
   private final cnu cw = new cnu();
   public int cm;
   public int cn;
   public float co;
   protected int cp;
   protected final float cq = 0.02F;
   private int cx;
   private final GameProfile cy;
   private boolean cA;
   private cvs cB = cvs.k;
   private final cvo cC = this.k();
   private Optional<jn> cD = Optional.empty();
   @Nullable
   public com cr;
   protected float cs;
   @Nullable
   public eyw ct;
   @Nullable
   public btr cu;
   private boolean cE;
   private int cF;

   public cnx(dej $$0, jf $$1, float $$2, GameProfile $$3) {
      super(bty.by, $$0);
      this.a_($$3.getId());
      this.cy = $$3;
      this.bY = new csc(this.h, !$$0.B, this);
      this.bZ = this.bY;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bg = 180.0F;
   }

   public boolean a(dej $$0, jf $$1, deg $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == deg.d) {
         return true;
      } else if (this.gp()) {
         return false;
      } else {
         cvs $$3 = this.eW();
         return $$3.f() || !$$3.b(new duw($$0, $$1, false));
      }
   }

   public static bvt.a fS() {
      return bun.ea().a(bvu.c, 1.0).a(bvu.v, 0.1F).a(bvu.e).a(bvu.q).a(bvu.g, 4.5).a(bvu.j, 3.0).a(bvu.f).a(bvu.C).a(bvu.z).a(bvu.t).a(bvu.D);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(e, 0.0F);
      $$0.a(f, 0);
      $$0.a(bT, (byte)0);
      $$0.a(bU, (byte)bD.b());
      $$0.a(bV, new ug());
      $$0.a(bW, new ug());
   }

   @Override
   public void l() {
      this.ae = this.Q_();
      if (this.Q_()) {
         this.d(false);
      }

      if (this.ce > 0) {
         this.ce--;
      }

      if (this.fN()) {
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

      this.fW();
      super.l();
      if (!this.dS().B && this.bZ != null && !this.bZ.b(this)) {
         this.s();
         this.bZ = this.bY;
      }

      this.w();
      if (!this.dS().B) {
         this.ca.a(this);
         this.a(awq.k);
         this.a(awq.l);
         if (this.bI()) {
            this.a(awq.m);
         }

         if (this.cd()) {
            this.a(awq.o);
         }

         if (!this.fN()) {
            this.a(awq.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = azf.a(this.dx(), -2.9999999E7, 2.9999999E7);
      double $$2 = azf.a(this.dD(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dx() || $$2 != this.dD()) {
         this.a_($$1, this.dz(), $$2);
      }

      this.aO++;
      cvs $$3 = this.eW();
      if (!cvs.a(this.cB, $$3)) {
         if (!cvs.b(this.cB, $$3)) {
            this.gx();
         }

         this.cB = $$3.u();
      }

      this.q();
      this.cC.a();
      this.fX();
      if (this.cF > 0) {
         this.cF--;
      }
   }

   @Override
   protected float fn() {
      return this.fC() ? 15.0F : super.fn();
   }

   public boolean fT() {
      return this.ca();
   }

   protected boolean fU() {
      return this.ca();
   }

   protected boolean fV() {
      return this.ca();
   }

   protected boolean fW() {
      this.cl = this.a(axb.a);
      return this.cl;
   }

   @Override
   public void l(boolean $$0) {
      if (!this.f()) {
         super.l($$0);
      }
   }

   @Override
   public void m(boolean $$0) {
      if (!this.f()) {
         super.m($$0);
      }
   }

   private void q() {
      cvs $$0 = this.a(btz.f);
      if ($$0.a(cvw.op) && !this.a(axb.a)) {
         this.a(new bsy(bta.m, 200, 0, false, false, true));
      }
   }

   protected cvo k() {
      return new cvo();
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

   protected void fX() {
      if (this.h(buz.d)) {
         buz $$0;
         if (this.fF()) {
            $$0 = buz.b;
         } else if (this.fN()) {
            $$0 = buz.c;
         } else if (this.ch()) {
            $$0 = buz.d;
         } else if (this.fr()) {
            $$0 = buz.e;
         } else if (this.ca() && !this.cw.b) {
            $$0 = buz.f;
         } else {
            $$0 = buz.a;
         }

         buz $$6;
         if (this.Q_() || this.bW() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(buz.f)) {
            $$6 = buz.f;
         } else {
            $$6 = buz.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(buz $$0) {
      return this.dS().a(this, this.a($$0).a(this.dq()).h(1.0E-7));
   }

   @Override
   protected awf aT() {
      return awg.uv;
   }

   @Override
   protected awf aU() {
      return awg.ut;
   }

   @Override
   protected awf aV() {
      return awg.uu;
   }

   @Override
   public int bU() {
      return 10;
   }

   @Override
   public void a(awf $$0, float $$1, float $$2) {
      this.dS().a(this, this.dx(), this.dz(), this.dD(), $$0, this.di(), $$1, $$2);
   }

   public void a(awf $$0, awh $$1, float $$2, float $$3) {
   }

   @Override
   public awh di() {
      return awh.h;
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
      if (!this.dS().B && this.fU() && this.bW()) {
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
   public void n_() {
      if (this.cb > 0) {
         this.cb--;
      }

      if (this.dS().am() == brp.a && this.dS().ac().b(def.k)) {
         if (this.eB() < this.eQ() && this.ag % 20 == 0) {
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

      super.n_();
      this.C((float)this.h(bvu.v));
      float $$1;
      if (this.aH() && !this.eC() && !this.ch()) {
         $$1 = Math.min(0.1F, (float)this.dv().i());
      } else {
         $$1 = 0.0F;
      }

      this.cd = this.cd + ($$1 - this.cd) * 0.4F;
      if (this.eB() > 0.0F && !this.Q_()) {
         eyr $$2;
         if (this.bW() && !this.dg().dN()) {
            $$2 = this.cO().b(this.dg().cO()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cO().c(1.0, 0.5, 1.0);
         }

         List<btr> $$4 = this.dS().a_(this, $$2);
         List<btr> $$5 = Lists.newArrayList();

         for (btr $$6 : $$4) {
            if ($$6.ao() == bty.M) {
               $$5.add($$6);
            } else if (!$$6.dN()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ad.a($$5, this.af));
         }
      }

      this.c(this.gu());
      this.c(this.gv());
      if (!this.dS().B && (this.aa > 0.5F || this.bi()) || this.cw.b || this.fN() || this.aw) {
         this.gr();
      }
   }

   private void c(@Nullable ug $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dS().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bty.a($$1).filter($$0x -> $$0x == bty.ax).ifPresent($$0x -> {
            if (!cgt.a(this.dS(), this)) {
               this.dS().a(null, this.dx(), this.dz(), this.dD(), cgt.a(this.dS(), this.dS().z), this.di(), 1.0F, cgt.a(this.dS().z));
            }
         });
      }
   }

   private void d(btr $$0) {
      $$0.b_(this);
   }

   public int fY() {
      return this.am.a(f);
   }

   public void r(int $$0) {
      this.am.a(f, $$0);
   }

   public void s(int $$0) {
      int $$1 = this.fY();
      this.am.a(f, $$1 + $$0);
   }

   public void a(int $$0, float $$1, cvs $$2) {
      this.by = $$0;
      this.bz = $$1;
      this.bA = $$2;
      if (!this.dS().B) {
         this.gr();
         this.c(4, true);
      }
   }

   @Nonnull
   @Override
   public cvs dW() {
      return this.fr() && this.bA != null ? this.bA : super.dW();
   }

   @Override
   public void a(bsj $$0) {
      super.a($$0);
      this.ax();
      if (!this.Q_() && this.dS() instanceof arj $$1) {
         this.a($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-azf.b((this.eI() + this.dI()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-azf.a((this.eI() + this.dI()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(awq.N);
      this.a(awq.i.b(awq.m));
      this.a(awq.i.b(awq.n));
      this.aF();
      this.c(false);
      this.a(Optional.of(jn.a(this.dS().ag(), this.ds())));
   }

   @Override
   protected void eE() {
      super.eE();
      if (!this.dS().ac().b(def.d)) {
         this.fZ();
         this.h.k();
      }
   }

   protected void fZ() {
      for (int $$0 = 0; $$0 < this.h.b(); $$0++) {
         cvs $$1 = this.h.a($$0);
         if (!$$1.f() && dbp.a($$1, dbo.D)) {
            this.h.b($$0);
         }
      }
   }

   @Override
   protected awf d(bsj $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected awf o_() {
      return awg.ul;
   }

   @Override
   public void h(cvs $$0) {
   }

   @Nullable
   public ckh a(cvs $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public ckh a(cvs $$0, boolean $$1, boolean $$2) {
      if (!$$0.f() && this.dS().B) {
         this.a(brr.a);
      }

      return null;
   }

   public float c(dus $$0) {
      float $$1 = this.h.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(bvu.t);
      }

      if (bsz.a(this)) {
         $$1 *= 1.0F + (float)(bsz.b(this) + 1) * 0.2F;
      }

      if (this.b(bta.d)) {
         float $$2 = switch (this.c(bta.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.h(bvu.f);
      if (this.a(axb.a)) {
         $$1 *= (float)this.g(bvu.C).g();
      }

      if (!this.aH()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dus $$0) {
      return !$$0.C() || this.h.f().b($$0);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.a_(this.cy.getId());
      um $$1 = $$0.c("Inventory", 10);
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
      this.g(bvu.v).a((double)this.cw.b());
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
         this.a(jn.b.parse(uu.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         eyw.a.parse(uu.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.ct = $$0x);
      }

      this.cE = $$0.q("ignore_fall_damage_from_current_explosion");
      this.cF = $$0.h("current_impulse_context_reset_grace_time");
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      uv.e($$0);
      $$0.a("Inventory", this.h.a(new um()));
      $$0.a("SelectedItemSlot", this.h.j);
      $$0.a("SleepTimer", (short)this.cv);
      $$0.a("XpP", this.co);
      $$0.a("XpLevel", this.cm);
      $$0.a("XpTotal", this.cn);
      $$0.a("XpSeed", this.cp);
      $$0.a("Score", this.fY());
      this.ca.b($$0);
      this.cw.a($$0);
      $$0.a("EnderItems", this.bX.a(this.dU()));
      if (!this.gu().g()) {
         $$0.a("ShoulderEntityLeft", this.gu());
      }

      if (!this.gv().g()) {
         $$0.a("ShoulderEntityRight", this.gv());
      }

      this.gC().flatMap($$0x -> jn.b.encodeStart(uu.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.ct != null) {
         $$0.a("current_explosion_impact_pos", (vd)eyw.a.encodeStart(uu.a, this.ct).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cE);
      $$0.a("current_impulse_context_reset_grace_time", this.cF);
   }

   @Override
   public boolean b(bsj $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(awx.n)) {
         return !this.dS().ac().b(def.G);
      } else if ($$0.a(awx.m)) {
         return !this.dS().ac().b(def.H);
      } else if ($$0.a(awx.i)) {
         return !this.dS().ac().b(def.I);
      } else {
         return $$0.a(awx.o) ? !this.dS().ac().b(def.J) : false;
      }
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cw.a && !$$0.a(awx.d)) {
         return false;
      } else {
         this.bb = 0;
         if (this.eC()) {
            return false;
         } else {
            if (!this.dS().B) {
               this.gr();
            }

            if ($$0.g()) {
               if (this.dS().am() == brp.a) {
                  $$1 = 0.0F;
               }

               if (this.dS().am() == brp.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dS().am() == brp.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bun $$0) {
      super.d($$0);
      cvs $$1 = this.fD();
      if ($$0.fQ() && $$1 != null) {
         this.i($$1);
      }
   }

   @Override
   public boolean eu() {
      return !this.ge().a && super.eu();
   }

   public boolean a(cnx $$0) {
      fad $$1 = this.co();
      fad $$2 = $$0.co();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bsj $$0, float $$1) {
      this.a($$0, $$1, new btz[]{btz.c, btz.d, btz.e, btz.f});
   }

   @Override
   protected void c(bsj $$0, float $$1) {
      this.a($$0, $$1, new btz[]{btz.f});
   }

   @Override
   protected void z(float $$0) {
      if (this.bv.a(cvw.vu)) {
         if (!this.dS().B) {
            this.b(awq.c.b(this.bv.h()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + azf.d($$0);
            brr $$2 = this.fw();
            this.bv.a($$1, this, d($$2));
            if (this.bv.f()) {
               if ($$2 == brr.a) {
                  this.a(btz.a, cvs.k);
               } else {
                  this.a(btz.b, cvs.k);
               }

               this.bv = cvs.k;
               this.a(awg.wF, 0.8F, 0.8F + this.dS().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bsj $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fs(), 0.0F);
         this.E(this.fs() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(awq.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.G($$0.a());
            this.eO().a($$0, var7);
            this.x(this.eB() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(awq.J, Math.round(var7 * 10.0F));
            }

            this.a(dzp.o);
         }
      }
   }

   public boolean ab() {
      return false;
   }

   public void a(dth $$0, boolean $$1) {
   }

   public void a(ddj $$0) {
   }

   public void a(dsf $$0) {
   }

   public void a(dtm $$0) {
   }

   public void a(dsx $$0) {
   }

   public void a(cih $$0, brl $$1) {
   }

   public OptionalInt a(@Nullable bru $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, ddh $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cvs $$0, brr $$1) {
   }

   public brs a(btr $$0, brr $$1) {
      if (this.Q_()) {
         if ($$0 instanceof bru) {
            this.a((bru)$$0);
         }

         return brs.e;
      } else {
         cvs $$2 = this.b($$1);
         cvs $$3 = $$2.u();
         brs $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cw.d && $$2 == this.b($$1) && $$2.K() < $$3.K()) {
               $$2.e($$3.K());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof bun) {
               if (this.cw.d) {
                  $$2 = $$3;
               }

               brs $$5 = $$2.a(this, (bun)$$0, $$1);
               if ($$5.a()) {
                  this.dS().a(dzp.r, $$0.dq(), dzp.a.a(this));
                  if ($$2.f() && !this.cw.d) {
                     this.a($$1, cvs.k);
                  }

                  return $$5;
               }
            }

            return brs.e;
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
      return super.ff() || this.fN();
   }

   @Override
   public boolean eh() {
      return !this.cw.b;
   }

   @Override
   protected eyw a(eyw $$0, bur $$1) {
      float $$2 = this.dM();
      if (!this.cw.b && !($$0.e > 0.0) && ($$1 == bur.a || $$1 == bur.b) && this.fV() && this.I($$2)) {
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

         return new eyw($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean I(float $$0) {
      return this.aH() || this.aa < $$0 && !this.b(0.0, 0.0, $$0 - this.aa);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      eyr $$3 = this.cO();
      return this.dS().a(this, new eyr($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(btr $$0) {
      if ($$0.cy()) {
         if (!$$0.v(this)) {
            float $$1 = this.fr() ? this.bz : (float)this.h(bvu.c);
            cvs $$2 = this.dW();
            bsj $$3;
            if ($$2.h() == cvw.ud && cwe.a(this)) {
               $$3 = this.dT().f(this);
            } else {
               $$3 = this.dT().a(this);
            }

            float $$5 = this.a($$0, $$1, $$3) - $$1;
            float $$6 = this.H(0.5F);
            $$1 *= 0.2F + $$6 * $$6 * 0.8F;
            $$5 *= $$6;
            this.gx();
            if ($$0.ao().a(awz.H) && $$0 instanceof cor $$7 && $$7.a(cos.c, this, this, true)) {
               this.dS().a(null, this.dx(), this.dz(), this.dD(), awg.ue, this.di());
               return;
            }

            if ($$1 > 0.0F || $$5 > 0.0F) {
               boolean $$8 = $$6 > 0.9F;
               boolean $$9;
               if (this.cg() && $$8) {
                  this.dS().a(null, this.dx(), this.dz(), this.dD(), awg.ud, this.di(), 1.0F, 1.0F);
                  $$9 = true;
               } else {
                  $$9 = false;
               }

               $$1 += $$2.h().a($$0, $$1, $$3);
               boolean $$11 = $$8
                  && this.aa > 0.0F
                  && !this.aH()
                  && !this.q_()
                  && !this.bi()
                  && !this.b(bta.o)
                  && !this.bW()
                  && $$0 instanceof bun
                  && !this.cg();
               if ($$11) {
                  $$1 *= 1.5F;
               }

               float $$12 = $$1 + $$5;
               boolean $$13 = false;
               if ($$8 && !$$11 && !$$9 && this.aH()) {
                  double $$14 = this.ai().j();
                  double $$15 = (double)this.fm() * 2.5;
                  if ($$14 < azf.k($$15) && this.b(brr.a).a(axe.bv)) {
                     $$13 = true;
                  }
               }

               float $$16 = 0.0F;
               if ($$0 instanceof bun $$17) {
                  $$16 = $$17.eB();
               }

               eyw $$18 = $$0.dv();
               boolean $$19 = $$0.a($$3, $$12);
               if ($$19) {
                  float $$20 = this.a($$0, $$3) + ($$9 ? 1.0F : 0.0F);
                  if ($$20 > 0.0F) {
                     if ($$0 instanceof bun $$21) {
                        $$21.p(
                           (double)($$20 * 0.5F), (double)azf.a(this.dI() * (float) (Math.PI / 180.0)), (double)(-azf.b(this.dI() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.j(
                           (double)(-azf.a(this.dI() * (float) (Math.PI / 180.0)) * $$20 * 0.5F),
                           0.1,
                           (double)(azf.b(this.dI() * (float) (Math.PI / 180.0)) * $$20 * 0.5F)
                        );
                     }

                     this.h(this.dv().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$13) {
                     float $$22 = 1.0F + (float)this.h(bvu.D) * $$1;

                     for (bun $$24 : this.dS().a(bun.class, $$0.cO().c(1.0, 0.25, 1.0))) {
                        if ($$24 != this && $$24 != $$0 && !this.s($$24) && (!($$24 instanceof cjw) || !((cjw)$$24).A()) && this.g($$24) < 9.0) {
                           float $$25 = this.a($$24, $$22, $$3) * $$6;
                           $$24.p(0.4F, (double)azf.a(this.dI() * (float) (Math.PI / 180.0)), (double)(-azf.b(this.dI() * (float) (Math.PI / 180.0))));
                           $$24.a($$3, $$25);
                           if (this.dS() instanceof arj $$26) {
                              dbp.a($$26, (btr)$$24, $$3);
                           }
                        }
                     }

                     this.dS().a(null, this.dx(), this.dz(), this.dD(), awg.ug, this.di(), 1.0F, 1.0F);
                     this.ga();
                  }

                  if ($$0 instanceof ark && $$0.U) {
                     ((ark)$$0).c.b(new afi($$0));
                     $$0.U = false;
                     $$0.h($$18);
                  }

                  if ($$11) {
                     this.dS().a(null, this.dx(), this.dz(), this.dD(), awg.uc, this.di(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$11 && !$$13) {
                     if ($$8) {
                        this.dS().a(null, this.dx(), this.dz(), this.dD(), awg.uf, this.di(), 1.0F, 1.0F);
                     } else {
                        this.dS().a(null, this.dx(), this.dz(), this.dD(), awg.uh, this.di(), 1.0F, 1.0F);
                     }
                  }

                  if ($$5 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  btr $$27 = $$0;
                  if ($$0 instanceof cix) {
                     $$27 = ((cix)$$0).b;
                  }

                  boolean $$28 = false;
                  if (this.dS() instanceof arj $$29) {
                     if ($$27 instanceof bun $$30) {
                        $$28 = $$2.a($$30, this);
                     }

                     dbp.a($$29, $$0, $$3);
                  }

                  if (!this.dS().B && !$$2.f() && $$27 instanceof bun) {
                     if ($$28) {
                        $$2.b((bun)$$27, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.eW()) {
                           this.a(brr.a, cvs.k);
                        } else {
                           this.a(brr.b, cvs.k);
                        }
                     }
                  }

                  if ($$0 instanceof bun) {
                     float $$31 = $$16 - ((bun)$$0).eB();
                     this.a(awq.G, Math.round($$31 * 10.0F));
                     if (this.dS() instanceof arj && $$31 > 2.0F) {
                        int $$32 = (int)((double)$$31 * 0.5);
                        ((arj)this.dS()).a(lo.g, $$0.dx(), $$0.e(0.5), $$0.dD(), $$32, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.G(0.1F);
               } else {
                  this.dS().a(null, this.dx(), this.dz(), this.dD(), awg.ue, this.di(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(btr $$0, float $$1, bsj $$2) {
      return $$1;
   }

   @Override
   protected void g(bun $$0) {
      this.e($$0);
   }

   public void i(cvs $$0) {
      this.gy().a($$0, 100);
      this.fB();
      this.dS().a(this, (byte)30);
   }

   public void b(btr $$0) {
   }

   public void c(btr $$0) {
   }

   public void ga() {
      double $$0 = (double)(-azf.a(this.dI() * (float) (Math.PI / 180.0)));
      double $$1 = (double)azf.b(this.dI() * (float) (Math.PI / 180.0));
      if (this.dS() instanceof arj) {
         ((arj)this.dS()).a(lo.aj, this.dx() + $$0, this.e(0.5), this.dD() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void gb() {
   }

   @Override
   public void a(btr.c $$0) {
      super.a($$0);
      this.bY.a(this);
      if (this.bZ != null && this.gf()) {
         this.t();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile gc() {
      return this.cy;
   }

   public cnw gd() {
      return this.h;
   }

   public cnu ge() {
      return this.cw;
   }

   @Override
   public boolean fR() {
      return this.cw.d;
   }

   public void a(cvs $$0, cvs $$1, crj $$2) {
   }

   public boolean gf() {
      return this.bZ != this.bY;
   }

   public Either<cnx.a, bak> a(jf $$0) {
      this.b($$0);
      this.cv = 0;
      return Either.right(bak.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fO();
      if (this.dS() instanceof arj && $$1) {
         ((arj)this.dS()).e();
      }

      this.cv = $$0 ? 0 : 100;
   }

   @Override
   public void fO() {
      this.a(true, true);
   }

   public boolean gg() {
      return this.fN() && this.cv >= 100;
   }

   public int gh() {
      return this.cv;
   }

   public void a(xe $$0, boolean $$1) {
   }

   public void a(ale $$0) {
      this.b(awq.i.b($$0));
   }

   public void a(ale $$0, int $$1) {
      this.a(awq.i.b($$0), $$1);
   }

   public void b(awn<?> $$0) {
      this.a($$0, 1);
   }

   public void a(awn<?> $$0, int $$1) {
   }

   public void a(awn<?> $$0) {
   }

   public int a(Collection<dam<?>> $$0) {
      return 0;
   }

   public void a(dam<?> $$0, List<cvs> $$1) {
   }

   public void b(List<ale> $$0) {
   }

   public int b(Collection<dam<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(eyw $$0) {
      if (this.bW()) {
         super.a_($$0);
      } else {
         if (this.ch()) {
            double $$1 = this.bQ().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bj || !this.dS().b_(jf.a(this.dx(), this.dz() + 1.0 - 0.1, this.dD())).c()) {
               eyw $$3 = this.dv();
               this.h($$3.b(0.0, ($$1 - $$3.e) * $$2, 0.0));
            }
         }

         if (this.ge().b) {
            double $$4 = this.dv().e;
            super.a_($$0);
            this.h(this.dv().a(jk.a.b, $$4 * 0.6));
         } else {
            super.a_($$0);
         }
      }
   }

   @Override
   protected boolean d(cvs $$0) {
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

   protected boolean h(jf $$0) {
      return !this.dS().a_($$0).j(this.dS(), $$0);
   }

   @Override
   public float fm() {
      return (float)this.h(bvu.v);
   }

   @Override
   public boolean a(float $$0, float $$1, bsj $$2) {
      if (this.cw.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(awq.t, (int)Math.round((double)$$0 * 100.0));
         }

         boolean $$3 = this.ct != null && this.cE;
         float $$4;
         if ($$3) {
            $$4 = Math.min($$0, (float)(this.ct.e - this.dz()));
            boolean $$5 = $$4 <= 0.0F;
            if ($$5) {
               this.gH();
            } else {
               this.gG();
            }
         } else {
            $$4 = $$0;
         }

         if ($$4 > 0.0F && super.a($$4, $$1, $$2)) {
            this.gH();
            return true;
         } else {
            return false;
         }
      }
   }

   public boolean gi() {
      if (!this.aH() && !this.fF() && !this.bi() && !this.b(bta.y)) {
         cvs $$0 = this.a(btz.e);
         if ($$0.a(cvw.nU) && cuq.g($$0)) {
            this.gj();
            return true;
         }
      }

      return false;
   }

   public void gj() {
      this.b(7, true);
   }

   public void gk() {
      this.b(7, true);
      this.b(7, false);
   }

   @Override
   protected void br() {
      if (!this.Q_()) {
         super.br();
      }
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      if (this.bi()) {
         this.aX();
         this.b($$1);
      } else {
         jf $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dus $$3 = this.dS().a_($$2);
            if ($$3.a(awv.bp)) {
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
   public bun.a eK() {
      return new bun.a(awg.us, awg.ui);
   }

   @Override
   public boolean a(arj $$0, bun $$1) {
      this.b(awq.g.b($$1.ao()));
      return true;
   }

   @Override
   public void a(dus $$0, eyw $$1) {
      if (!this.cw.b) {
         super.a($$0, $$1);
      }

      this.gG();
   }

   public void d(int $$0) {
      this.s($$0);
      this.co = this.co + (float)$$0 / (float)this.gm();
      this.cn = azf.a(this.cn + $$0, 0, Integer.MAX_VALUE);

      while (this.co < 0.0F) {
         float $$1 = this.co * (float)this.gm();
         if (this.cm > 0) {
            this.c(-1);
            this.co = 1.0F + $$1 / (float)this.gm();
         } else {
            this.c(-1);
            this.co = 0.0F;
         }
      }

      while (this.co >= 1.0F) {
         this.co = (this.co - 1.0F) * (float)this.gm();
         this.c(1);
         this.co = this.co / (float)this.gm();
      }
   }

   public int gl() {
      return this.cp;
   }

   public void a(cvs $$0, int $$1) {
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
         this.dS().a(null, this.dx(), this.dz(), this.dD(), awg.ur, this.di(), $$1 * 0.75F, 1.0F);
         this.cx = this.ag;
      }
   }

   public int gm() {
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

   public Optional<cnd> ad() {
      return Optional.empty();
   }

   public cqv gn() {
      return this.ca;
   }

   public boolean u(boolean $$0) {
      return this.cw.a || $$0 || this.ca.c();
   }

   public boolean go() {
      return this.eB() > 0.0F && this.eB() < this.eQ();
   }

   public boolean gp() {
      return this.cw.e;
   }

   public boolean a(jf $$0, jk $$1, cvs $$2) {
      if (this.cw.e) {
         return true;
      } else {
         jf $$3 = $$0.a($$1.g());
         duw $$4 = new duw(this.dS(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int el() {
      return !this.dS().ac().b(def.d) && !this.Q_() ? Math.min(this.cm * 7, 100) : 0;
   }

   @Override
   protected boolean em() {
      return true;
   }

   @Override
   public boolean cJ() {
      return true;
   }

   @Override
   protected btr.b bf() {
      return this.cw.b || this.aH() && this.cd() ? btr.b.a : btr.b.d;
   }

   public void A() {
   }

   @Override
   public xe aj() {
      return xe.b(this.cy.getName());
   }

   public csn gq() {
      return this.bX;
   }

   @Override
   public cvs a(btz $$0) {
      if ($$0 == btz.a) {
         return this.h.f();
      } else if ($$0 == btz.b) {
         return this.h.i.getFirst();
      } else {
         return $$0.a() == btz.a.b ? this.h.h.get($$0.b()) : cvs.k;
      }
   }

   @Override
   protected boolean b(btz $$0) {
      return $$0.a() == btz.a.b;
   }

   @Override
   public void a(btz $$0, cvs $$1) {
      this.c($$1);
      if ($$0 == btz.a) {
         this.a($$0, this.h.g.set(this.h.j, $$1), $$1);
      } else if ($$0 == btz.b) {
         this.a($$0, this.h.i.set(0, $$1), $$1);
      } else if ($$0.a() == btz.a.b) {
         this.a($$0, this.h.h.set($$0.b(), $$1), $$1);
      }
   }

   public boolean j(cvs $$0) {
      return this.h.f($$0);
   }

   @Override
   public Iterable<cvs> eZ() {
      return Lists.newArrayList(new cvs[]{this.eW(), this.eX()});
   }

   @Override
   public Iterable<cvs> eY() {
      return this.h.h;
   }

   @Override
   public boolean e(btz $$0) {
      return $$0 != btz.g;
   }

   public boolean h(ug $$0) {
      if (this.bW() || !this.aH() || this.bi() || this.aw) {
         return false;
      } else if (this.gu().g()) {
         this.i($$0);
         this.g = this.dS().aa();
         return true;
      } else if (this.gv().g()) {
         this.j($$0);
         this.g = this.dS().aa();
         return true;
      } else {
         return false;
      }
   }

   protected void gr() {
      if (this.g + 20L < this.dS().aa()) {
         this.k(this.gu());
         this.i(new ug());
         this.k(this.gv());
         this.j(new ug());
      }
   }

   private void k(ug $$0) {
      if (!this.dS().B && !$$0.g()) {
         bty.a($$0, this.dS(), btx.r).ifPresent($$0x -> {
            if ($$0x instanceof bvj) {
               ((bvj)$$0x).b(this.au);
            }

            $$0x.a_(this.dx(), this.dz() + 0.7F, this.dD());
            ((arj)this.dS()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean Q_();

   @Override
   public boolean bD() {
      return !this.Q_() && super.bD();
   }

   @Override
   public boolean ch() {
      return !this.cw.b && !this.Q_() && super.ch();
   }

   public abstract boolean f();

   @Override
   public boolean cG() {
      return !this.cw.b;
   }

   public fab gs() {
      return this.dS().O();
   }

   @Override
   public xe R_() {
      xs $$0 = ezw.a(this.co(), this.aj());
      return this.a($$0);
   }

   private xs a(xs $$0) {
      String $$1 = this.gc().getName();
      return $$0.a($$1x -> $$1x.a(new xc(xc.a.d, "/tell " + $$1 + " ")).a(this.cN()).a($$1));
   }

   @Override
   public String cF() {
      return this.gc().getName();
   }

   @Override
   protected void F(float $$0) {
      this.at().a(e, $$0);
   }

   @Override
   public float fs() {
      return this.at().a(e);
   }

   public boolean a(cny $$0) {
      return (this.at().a(bT) & $$0.a()) == $$0.a();
   }

   @Override
   public bve a_(int $$0) {
      if ($$0 == 499) {
         return new bve() {
            @Override
            public cvs a() {
               return cnx.this.bZ.g();
            }

            @Override
            public boolean a(cvs $$0) {
               cnx.this.bZ.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bve() {
               @Override
               public cvs a() {
                  return cnx.this.bY.r().a($$1);
               }

               @Override
               public boolean a(cvs $$0) {
                  cnx.this.bY.r().a($$1, $$0);
                  cnx.this.bY.a(cnx.this.h);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.h.g.size()) {
            return bve.a(this.h, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.bX.b() ? bve.a(this.bX, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gt() {
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
   public buh fu() {
      return this.am.a(bU) == 0 ? buh.a : buh.b;
   }

   public void b(buh $$0) {
      this.am.a(bU, (byte)($$0 == buh.a ? 0 : 1));
   }

   public ug gu() {
      return this.am.a(bV);
   }

   protected void i(ug $$0) {
      this.am.a(bV, $$0);
   }

   public ug gv() {
      return this.am.a(bW);
   }

   protected void j(ug $$0) {
      this.am.a(bW, $$0);
   }

   public float gw() {
      return (float)(1.0 / this.h(bvu.e) * 20.0);
   }

   public float H(float $$0) {
      return azf.a(((float)this.aO + $$0) / this.gw(), 0.0F, 1.0F);
   }

   public void gx() {
      this.aO = 0;
   }

   public cvo gy() {
      return this.cC;
   }

   @Override
   protected float aR() {
      return !this.cw.b && !this.fF() ? super.aR() : 1.0F;
   }

   public float gz() {
      return (float)this.h(bvu.q);
   }

   public boolean gA() {
      return this.cw.d && this.H() >= 2;
   }

   @Override
   public boolean e(cvs $$0) {
      btz $$1 = this.g($$0);
      return this.a($$1).f();
   }

   @Override
   public btu e(buz $$0) {
      return d.getOrDefault($$0, bS);
   }

   @Override
   public ImmutableList<buz> fK() {
      return ImmutableList.of(buz.a, buz.f, buz.d);
   }

   @Override
   public cvs f(cvs $$0) {
      if (!($$0.h() instanceof cwo)) {
         return cvs.k;
      } else {
         Predicate<cvs> $$1 = ((cwo)$$0.h()).d();
         cvs $$2 = cwo.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((cwo)$$0.h()).b();

            for (int $$3 = 0; $$3 < this.h.b(); $$3++) {
               cvs $$4 = this.h.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cw.d ? new cvs(cvw.ox) : cvs.k;
         }
      }
   }

   @Override
   public eyw u(float $$0) {
      double $$1 = 0.22 * (this.fu() == buh.b ? -1.0 : 1.0);
      float $$2 = azf.h($$0 * 0.5F, this.dK(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = azf.h($$0, this.aU, this.aT) * (float) (Math.PI / 180.0);
      if (this.fF() || this.fr()) {
         eyw $$4 = this.g($$0);
         eyw $$5 = this.dv();
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

         return this.o($$0).e(new eyw($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.ci()) {
         return this.o($$0).e(new eyw($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cO().c() - 1.0;
         double $$13 = this.cf() ? -0.2 : 0.07;
         return this.o($$0).e(new eyw($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dR() {
      return true;
   }

   public boolean gB() {
      return this.fv() && this.fx().a(cvw.qY);
   }

   @Override
   public boolean dQ() {
      return false;
   }

   public Optional<jn> gC() {
      return this.cD;
   }

   public void a(Optional<jn> $$0) {
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

   public double gD() {
      return this.h(bvu.g);
   }

   public double gE() {
      return this.h(bvu.j);
   }

   public boolean b(btr $$0, double $$1) {
      return $$0.dN() ? false : this.a($$0.cO(), $$1);
   }

   public boolean a(eyr $$0, double $$1) {
      double $$2 = this.gE() + $$1;
      return $$0.e(this.bC()) < $$2 * $$2;
   }

   public boolean a(jf $$0, double $$1) {
      double $$2 = this.gD() + $$1;
      return new eyr($$0).e(this.bC()) < $$2 * $$2;
   }

   public void w(boolean $$0) {
      this.cE = $$0;
      if ($$0) {
         this.cF = 40;
      } else {
         this.cF = 0;
      }
   }

   public boolean gF() {
      return this.cE;
   }

   public void gG() {
      if (this.cF == 0) {
         this.gH();
      }
   }

   public void gH() {
      this.cF = 0;
      this.cu = null;
      this.ct = null;
      this.cE = false;
   }

   public boolean gI() {
      return false;
   }

   public static enum a {
      a,
      b(xe.c("block.minecraft.bed.no_sleep")),
      c(xe.c("block.minecraft.bed.too_far_away")),
      d(xe.c("block.minecraft.bed.obstructed")),
      e,
      f(xe.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final xe g;

      private a() {
         this.g = null;
      }

      private a(final xe $$0) {
         this.g = $$0;
      }

      @Nullable
      public xe a() {
         return this.g;
      }
   }
}
