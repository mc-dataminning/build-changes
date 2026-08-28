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

public abstract class cnp extends buf {
   private static final Logger b = LogUtils.getLogger();
   public static final btz bE = btz.b;
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
   public static final eye bS = new eye(0.0, 0.6, 0.0);
   public static final btm bT = btm.b(0.6F, 1.8F).b(1.62F).a(btl.a().a(btk.b, bS));
   private static final Map<bur, btm> d = ImmutableMap.builder()
      .put(bur.a, bT)
      .put(bur.c, aB)
      .put(bur.b, btm.b(0.6F, 0.6F).b(0.4F))
      .put(bur.d, btm.b(0.6F, 0.6F).b(0.4F))
      .put(bur.e, btm.b(0.6F, 0.6F).b(0.4F))
      .put(bur.f, btm.b(0.6F, 1.5F).b(1.27F).a(btl.a().a(btk.b, bS)))
      .put(bur.h, btm.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final akg<Float> e = akk.a(cnp.class, aki.d);
   private static final akg<Integer> f = akk.a(cnp.class, aki.b);
   protected static final akg<Byte> bU = akk.a(cnp.class, aki.a);
   protected static final akg<Byte> bV = akk.a(cnp.class, aki.a);
   protected static final akg<uf> bW = akk.a(cnp.class, aki.t);
   protected static final akg<uf> bX = akk.a(cnp.class, aki.t);
   private long g;
   final cno h = new cno(this);
   protected cse bY = new cse();
   public final crt bZ;
   public cqq ca;
   protected cqm cb = new cqm();
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
   private int cw;
   protected boolean cm;
   private final cnm cx = new cnm();
   public int cn;
   public int co;
   public float cp;
   protected int cq;
   protected final float cr = 0.02F;
   private int cy;
   private final GameProfile cz;
   private boolean cB;
   private cvl cC = cvl.k;
   private final cvh cD = this.k();
   private Optional<jm> cE = Optional.empty();
   @Nullable
   public coe cs;
   protected float ct;
   @Nullable
   public eye cu;
   @Nullable
   public btj cv;
   private boolean cF;
   private int cG;

   public cnp(dds $$0, je $$1, float $$2, GameProfile $$3) {
      super(btq.by, $$0);
      this.a_($$3.getId());
      this.cz = $$3;
      this.bZ = new crt(this.h, !$$0.B, this);
      this.ca = this.bZ;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bh = 180.0F;
   }

   public boolean a(dds $$0, je $$1, ddp $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == ddp.d) {
         return true;
      } else if (this.go()) {
         return false;
      } else {
         cvl $$3 = this.eW();
         return $$3.f() || !$$3.b(new due($$0, $$1, false));
      }
   }

   public static bvl.a fQ() {
      return buf.dZ().a(bvm.c, 1.0).a(bvm.v, 0.1F).a(bvm.e).a(bvm.q).a(bvm.g, 4.5).a(bvm.j, 3.0).a(bvm.f).a(bvm.C).a(bvm.z).a(bvm.t).a(bvm.D);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(e, 0.0F);
      $$0.a(f, 0);
      $$0.a(bU, (byte)0);
      $$0.a(bV, (byte)bE.b());
      $$0.a(bW, new uf());
      $$0.a(bX, new uf());
   }

   @Override
   public void l() {
      this.ae = this.P_();
      if (this.P_()) {
         this.d(false);
      }

      if (this.cf > 0) {
         this.cf--;
      }

      if (this.fL()) {
         this.cw++;
         if (this.cw > 100) {
            this.cw = 100;
         }

         if (!this.dS().B && this.dS().S()) {
            this.a(false, true);
         }
      } else if (this.cw > 0) {
         this.cw++;
         if (this.cw >= 110) {
            this.cw = 0;
         }
      }

      this.fU();
      super.l();
      if (!this.dS().B && this.ca != null && !this.ca.b(this)) {
         this.s();
         this.ca = this.bZ;
      }

      this.w();
      if (!this.dS().B) {
         this.cb.a(this);
         this.a(awn.k);
         this.a(awn.l);
         if (this.bI()) {
            this.a(awn.m);
         }

         if (this.cd()) {
            this.a(awn.o);
         }

         if (!this.fL()) {
            this.a(awn.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = azc.a(this.dx(), -2.9999999E7, 2.9999999E7);
      double $$2 = azc.a(this.dD(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dx() || $$2 != this.dD()) {
         this.a_($$1, this.dz(), $$2);
      }

      this.aP++;
      cvl $$3 = this.eW();
      if (!cvl.a(this.cC, $$3)) {
         if (!cvl.b(this.cC, $$3)) {
            this.gw();
         }

         this.cC = $$3.u();
      }

      this.q();
      this.cD.a();
      this.fV();
      if (this.cG > 0) {
         this.cG--;
      }
   }

   @Override
   protected float fn() {
      return this.fC() ? 15.0F : super.fn();
   }

   public boolean fR() {
      return this.ca();
   }

   protected boolean fS() {
      return this.ca();
   }

   protected boolean fT() {
      return this.ca();
   }

   protected boolean fU() {
      this.cm = this.a(awy.a);
      return this.cm;
   }

   private void q() {
      cvl $$0 = this.a(btr.f);
      if ($$0.a(cvo.op) && !this.a(awy.a)) {
         this.b(new bsq(bss.m, 200, 0, false, false, true));
      }
   }

   protected cvh k() {
      return new cvh();
   }

   private void w() {
      this.cg = this.cj;
      this.ch = this.ck;
      this.ci = this.cl;
      double $$0 = this.dx() - this.cj;
      double $$1 = this.dz() - this.ck;
      double $$2 = this.dD() - this.cl;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cj = this.dx();
         this.cg = this.cj;
      }

      if ($$2 > 10.0) {
         this.cl = this.dD();
         this.ci = this.cl;
      }

      if ($$1 > 10.0) {
         this.ck = this.dz();
         this.ch = this.ck;
      }

      if ($$0 < -10.0) {
         this.cj = this.dx();
         this.cg = this.cj;
      }

      if ($$2 < -10.0) {
         this.cl = this.dD();
         this.ci = this.cl;
      }

      if ($$1 < -10.0) {
         this.ck = this.dz();
         this.ch = this.ck;
      }

      this.cj += $$0 * 0.25;
      this.cl += $$2 * 0.25;
      this.ck += $$1 * 0.25;
   }

   protected void fV() {
      if (this.h(bur.d)) {
         bur $$0;
         if (this.fE()) {
            $$0 = bur.b;
         } else if (this.fL()) {
            $$0 = bur.c;
         } else if (this.ch()) {
            $$0 = bur.d;
         } else if (this.fr()) {
            $$0 = bur.e;
         } else if (this.ca() && !this.cx.b) {
            $$0 = bur.f;
         } else {
            $$0 = bur.a;
         }

         bur $$6;
         if (this.P_() || this.bW() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bur.f)) {
            $$6 = bur.f;
         } else {
            $$6 = bur.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bur $$0) {
      return this.dS().a(this, this.a($$0).a(this.dq()).h(1.0E-7));
   }

   @Override
   protected awc aT() {
      return awd.uv;
   }

   @Override
   protected awc aU() {
      return awd.ut;
   }

   @Override
   protected awc aV() {
      return awd.uu;
   }

   @Override
   public int bU() {
      return 10;
   }

   @Override
   public void a(awc $$0, float $$1, float $$2) {
      this.dS().a(this, this.dx(), this.dz(), this.dD(), $$0, this.di(), $$1, $$2);
   }

   public void a(awc $$0, awe $$1, float $$2, float $$3) {
   }

   @Override
   public awe di() {
      return awe.h;
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
         this.cB = false;
      } else if ($$0 == 22) {
         this.cB = true;
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
      if (!this.dS().B && this.fS() && this.bW()) {
         this.af();
         this.g(false);
      } else {
         super.u();
         this.cd = this.ce;
         this.ce = 0.0F;
      }
   }

   @Override
   protected void fq() {
      super.fq();
      this.eU();
      this.aW = this.dI();
   }

   @Override
   public void m_() {
      if (this.cc > 0) {
         this.cc--;
      }

      if (this.dS().am() == brh.a && this.dS().ac().b(ddo.k)) {
         if (this.eA() < this.eQ() && this.ag % 20 == 0) {
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
      if (this.cx.b && !this.bW()) {
         this.n();
      }

      super.m_();
      this.C((float)this.h(bvm.v));
      float $$1;
      if (this.aH() && !this.eB() && !this.ch()) {
         $$1 = Math.min(0.1F, (float)this.dv().i());
      } else {
         $$1 = 0.0F;
      }

      this.ce = this.ce + ($$1 - this.ce) * 0.4F;
      if (this.eA() > 0.0F && !this.P_()) {
         exz $$2;
         if (this.bW() && !this.dg().dN()) {
            $$2 = this.cO().b(this.dg().cO()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cO().c(1.0, 0.5, 1.0);
         }

         List<btj> $$4 = this.dS().a_(this, $$2);
         List<btj> $$5 = Lists.newArrayList();

         for (btj $$6 : $$4) {
            if ($$6.ao() == btq.M) {
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
      if (!this.dS().B && (this.aa > 0.5F || this.bi()) || this.cx.b || this.fL() || this.aw) {
         this.gq();
      }
   }

   private void c(@Nullable uf $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dS().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         btq.a($$1).filter($$0x -> $$0x == btq.ax).ifPresent($$0x -> {
            if (!cgl.a(this.dS(), this)) {
               this.dS().a(null, this.dx(), this.dz(), this.dD(), cgl.a(this.dS(), this.dS().z), this.di(), 1.0F, cgl.a(this.dS().z));
            }
         });
      }
   }

   private void d(btj $$0) {
      $$0.b_(this);
   }

   public int fW() {
      return this.am.a(f);
   }

   public void r(int $$0) {
      this.am.a(f, $$0);
   }

   public void s(int $$0) {
      int $$1 = this.fW();
      this.am.a(f, $$1 + $$0);
   }

   public void a(int $$0, float $$1, cvl $$2) {
      this.bz = $$0;
      this.bA = $$1;
      this.bB = $$2;
      if (!this.dS().B) {
         this.gq();
         this.c(4, true);
      }
   }

   @Nonnull
   @Override
   public cvl dW() {
      return this.fr() && this.bB != null ? this.bB : super.dW();
   }

   @Override
   public void a(bsb $$0) {
      super.a($$0);
      this.ax();
      if (!this.P_() && this.dS() instanceof arg $$1) {
         this.a($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-azc.b((this.eI() + this.dI()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-azc.a((this.eI() + this.dI()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(awn.N);
      this.a(awn.i.b(awn.m));
      this.a(awn.i.b(awn.n));
      this.aF();
      this.c(false);
      this.a(Optional.of(jm.a(this.dS().ag(), this.ds())));
   }

   @Override
   protected void eD() {
      super.eD();
      if (!this.dS().ac().b(ddo.d)) {
         this.fX();
         this.h.k();
      }
   }

   protected void fX() {
      for (int $$0 = 0; $$0 < this.h.b(); $$0++) {
         cvl $$1 = this.h.a($$0);
         if (!$$1.f() && day.a($$1, dax.D)) {
            this.h.b($$0);
         }
      }
   }

   @Override
   protected awc d(bsb $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected awc n_() {
      return awd.ul;
   }

   @Override
   public void j(cvl $$0) {
   }

   @Nullable
   public cjz a(cvl $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cjz a(cvl $$0, boolean $$1, boolean $$2) {
      if (!$$0.f() && this.dS().B) {
         this.a(brj.a);
      }

      return null;
   }

   public float c(dua $$0) {
      float $$1 = this.h.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(bvm.t);
      }

      if (bsr.a(this)) {
         $$1 *= 1.0F + (float)(bsr.b(this) + 1) * 0.2F;
      }

      if (this.b(bss.d)) {
         $$1 *= switch (this.c(bss.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.h(bvm.f);
      if (this.a(awy.a)) {
         $$1 *= (float)this.g(bvm.C).g();
      }

      if (!this.aH()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dua $$0) {
      return !$$0.C() || this.h.f().b($$0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a_(this.cz.getId());
      ul $$1 = $$0.c("Inventory", 10);
      this.h.b($$1);
      this.h.j = $$0.h("SelectedItemSlot");
      this.cw = $$0.g("SleepTimer");
      this.cp = $$0.j("XpP");
      this.cn = $$0.h("XpLevel");
      this.co = $$0.h("XpTotal");
      this.cq = $$0.h("XpSeed");
      if (this.cq == 0) {
         this.cq = this.af.f();
      }

      this.r($$0.h("Score"));
      this.cb.a($$0);
      this.cx.b($$0);
      this.g(bvm.v).a((double)this.cx.b());
      if ($$0.b("EnderItems", 9)) {
         this.bY.a($$0.c("EnderItems", 10), this.dU());
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
         eye.a.parse(ut.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.cu = $$0x);
      }

      this.cF = $$0.q("ignore_fall_damage_from_current_explosion");
      this.cG = $$0.h("current_impulse_context_reset_grace_time");
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      uu.e($$0);
      $$0.a("Inventory", this.h.a(new ul()));
      $$0.a("SelectedItemSlot", this.h.j);
      $$0.a("SleepTimer", (short)this.cw);
      $$0.a("XpP", this.cp);
      $$0.a("XpLevel", this.cn);
      $$0.a("XpTotal", this.co);
      $$0.a("XpSeed", this.cq);
      $$0.a("Score", this.fW());
      this.cb.b($$0);
      this.cx.a($$0);
      $$0.a("EnderItems", this.bY.a(this.dU()));
      if (!this.gt().g()) {
         $$0.a("ShoulderEntityLeft", this.gt());
      }

      if (!this.gu().g()) {
         $$0.a("ShoulderEntityRight", this.gu());
      }

      this.gB().flatMap($$0x -> jm.b.encodeStart(ut.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cu != null) {
         $$0.a("current_explosion_impact_pos", (vc)eye.a.encodeStart(ut.a, this.cu).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cF);
      $$0.a("current_impulse_context_reset_grace_time", this.cG);
   }

   @Override
   public boolean b(bsb $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(awu.n)) {
         return !this.dS().ac().b(ddo.G);
      } else if ($$0.a(awu.m)) {
         return !this.dS().ac().b(ddo.H);
      } else if ($$0.a(awu.i)) {
         return !this.dS().ac().b(ddo.I);
      } else {
         return $$0.a(awu.o) ? !this.dS().ac().b(ddo.J) : false;
      }
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cx.a && !$$0.a(awu.d)) {
         return false;
      } else {
         this.bc = 0;
         if (this.eB()) {
            return false;
         } else {
            if (!this.dS().B) {
               this.gq();
            }

            if ($$0.g()) {
               if (this.dS().am() == brh.a) {
                  $$1 = 0.0F;
               }

               if (this.dS().am() == brh.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dS().am() == brh.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(buf $$0) {
      super.d($$0);
      if ($$0.fO()) {
         this.fY();
      }
   }

   @Override
   public boolean et() {
      return !this.gd().a && super.et();
   }

   public boolean a(cnp $$0) {
      ezk $$1 = this.co();
      ezk $$2 = $$0.co();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bsb $$0, float $$1) {
      this.a($$0, $$1, new btr[]{btr.c, btr.d, btr.e, btr.f});
   }

   @Override
   protected void c(bsb $$0, float $$1) {
      this.a($$0, $$1, new btr[]{btr.f});
   }

   @Override
   protected void z(float $$0) {
      if (this.bw.a(cvo.vu)) {
         if (!this.dS().B) {
            this.b(awn.c.b(this.bw.h()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + azc.d($$0);
            brj $$2 = this.fw();
            this.bw.a($$1, this, d($$2));
            if (this.bw.f()) {
               if ($$2 == brj.a) {
                  this.a(btr.a, cvl.k);
               } else {
                  this.a(btr.b, cvl.k);
               }

               this.bw = cvl.k;
               this.a(awd.wF, 0.8F, 0.8F + this.dS().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bsb $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fs(), 0.0F);
         this.E(this.fs() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(awn.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.G($$0.a());
            this.eO().a($$0, var7);
            this.x(this.eA() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(awn.J, Math.round(var7 * 10.0F));
            }

            this.a(dyx.o);
         }
      }
   }

   public boolean ab() {
      return false;
   }

   public void a(dsq $$0, boolean $$1) {
   }

   public void a(dcs $$0) {
   }

   public void a(dro $$0) {
   }

   public void a(dsv $$0) {
   }

   public void a(dsg $$0) {
   }

   public void a(chz $$0, brd $$1) {
   }

   public OptionalInt a(@Nullable brm $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dcq $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cvl $$0, brj $$1) {
   }

   public brk a(btj $$0, brj $$1) {
      if (this.P_()) {
         if ($$0 instanceof brm) {
            this.a((brm)$$0);
         }

         return brk.e;
      } else {
         cvl $$2 = this.b($$1);
         cvl $$3 = $$2.u();
         brk $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cx.d && $$2 == this.b($$1) && $$2.J() < $$3.J()) {
               $$2.e($$3.J());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof buf) {
               if (this.cx.d) {
                  $$2 = $$3;
               }

               brk $$5 = $$2.a(this, (buf)$$0, $$1);
               if ($$5.a()) {
                  this.dS().a(dyx.r, $$0.dq(), dyx.a.a(this));
                  if ($$2.f() && !this.cx.d) {
                     this.a($$1, cvl.k);
                  }

                  return $$5;
               }
            }

            return brk.e;
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
      return super.ff() || this.fL();
   }

   @Override
   public boolean eg() {
      return !this.cx.b;
   }

   @Override
   protected eye a(eye $$0, buj $$1) {
      float $$2 = this.dM();
      if (!this.cx.b && !($$0.e > 0.0) && ($$1 == buj.a || $$1 == buj.b) && this.fT() && this.I($$2)) {
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

         return new eye($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean I(float $$0) {
      return this.aH() || this.aa < $$0 && !this.b(0.0, 0.0, $$0 - this.aa);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      exz $$3 = this.cO();
      return this.dS().a(this, new exz($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(btj $$0) {
      if ($$0.cy()) {
         if (!$$0.v(this)) {
            float $$1 = this.fr() ? this.bA : (float)this.h(bvm.c);
            cvl $$2 = this.dW();
            bsb $$3;
            if ($$2.h() == cvo.ud && cvw.a(this)) {
               $$3 = this.dT().f(this);
            } else {
               $$3 = this.dT().a(this);
            }

            float $$5 = this.a($$0, $$1, $$3) - $$1;
            float $$6 = this.H(0.5F);
            $$1 *= 0.2F + $$6 * $$6 * 0.8F;
            $$5 *= $$6;
            this.gw();
            if ($$0.ao().a(aww.H) && $$0 instanceof coi $$7 && $$7.a(coj.c, this, this, true)) {
               this.dS().a(null, this.dx(), this.dz(), this.dD(), awd.ue, this.di());
               return;
            }

            if ($$1 > 0.0F || $$5 > 0.0F) {
               boolean $$8 = $$6 > 0.9F;
               boolean $$9;
               if (this.cg() && $$8) {
                  this.dS().a(null, this.dx(), this.dz(), this.dD(), awd.ud, this.di(), 1.0F, 1.0F);
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
                  && !this.b(bss.o)
                  && !this.bW()
                  && $$0 instanceof buf
                  && !this.cg();
               if ($$11) {
                  $$1 *= 1.5F;
               }

               float $$12 = $$1 + $$5;
               boolean $$13 = false;
               if ($$8 && !$$11 && !$$9 && this.aH()) {
                  double $$14 = this.ai().j();
                  double $$15 = (double)this.fm() * 2.5;
                  if ($$14 < azc.k($$15) && this.b(brj.a).a(axb.bv)) {
                     $$13 = true;
                  }
               }

               float $$16 = 0.0F;
               if ($$0 instanceof buf $$17) {
                  $$16 = $$17.eA();
               }

               eye $$18 = $$0.dv();
               boolean $$19 = $$0.a($$3, $$12);
               if ($$19) {
                  float $$20 = this.a($$0, $$3) + ($$9 ? 1.0F : 0.0F);
                  if ($$20 > 0.0F) {
                     if ($$0 instanceof buf $$21) {
                        $$21.p(
                           (double)($$20 * 0.5F), (double)azc.a(this.dI() * (float) (Math.PI / 180.0)), (double)(-azc.b(this.dI() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.j(
                           (double)(-azc.a(this.dI() * (float) (Math.PI / 180.0)) * $$20 * 0.5F),
                           0.1,
                           (double)(azc.b(this.dI() * (float) (Math.PI / 180.0)) * $$20 * 0.5F)
                        );
                     }

                     this.h(this.dv().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$13) {
                     float $$22 = 1.0F + (float)this.h(bvm.D) * $$1;

                     for (buf $$24 : this.dS().a(buf.class, $$0.cO().c(1.0, 0.25, 1.0))) {
                        if ($$24 != this && $$24 != $$0 && !this.s($$24) && (!($$24 instanceof cjo) || !((cjo)$$24).A()) && this.g((btj)$$24) < 9.0) {
                           float $$25 = this.a($$24, $$22, $$3) * $$6;
                           $$24.p(0.4F, (double)azc.a(this.dI() * (float) (Math.PI / 180.0)), (double)(-azc.b(this.dI() * (float) (Math.PI / 180.0))));
                           $$24.a($$3, $$25);
                           if (this.dS() instanceof arg $$26) {
                              day.a($$26, (btj)$$24, $$3);
                           }
                        }
                     }

                     this.dS().a(null, this.dx(), this.dz(), this.dD(), awd.ug, this.di(), 1.0F, 1.0F);
                     this.fZ();
                  }

                  if ($$0 instanceof arh && $$0.U) {
                     ((arh)$$0).c.b(new afh($$0));
                     $$0.U = false;
                     $$0.h($$18);
                  }

                  if ($$11) {
                     this.dS().a(null, this.dx(), this.dz(), this.dD(), awd.uc, this.di(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$11 && !$$13) {
                     if ($$8) {
                        this.dS().a(null, this.dx(), this.dz(), this.dD(), awd.uf, this.di(), 1.0F, 1.0F);
                     } else {
                        this.dS().a(null, this.dx(), this.dz(), this.dD(), awd.uh, this.di(), 1.0F, 1.0F);
                     }
                  }

                  if ($$5 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  btj $$27 = $$0;
                  if ($$0 instanceof cip) {
                     $$27 = ((cip)$$0).b;
                  }

                  boolean $$28 = false;
                  if (this.dS() instanceof arg $$29) {
                     if ($$27 instanceof buf $$30) {
                        $$28 = $$2.a($$30, this);
                     }

                     day.a($$29, $$0, $$3);
                  }

                  if (!this.dS().B && !$$2.f() && $$27 instanceof buf) {
                     if ($$28) {
                        $$2.b((buf)$$27, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.eW()) {
                           this.a(brj.a, cvl.k);
                        } else {
                           this.a(brj.b, cvl.k);
                        }
                     }
                  }

                  if ($$0 instanceof buf) {
                     float $$31 = $$16 - ((buf)$$0).eA();
                     this.a(awn.G, Math.round($$31 * 10.0F));
                     if (this.dS() instanceof arg && $$31 > 2.0F) {
                        int $$32 = (int)((double)$$31 * 0.5);
                        ((arg)this.dS()).a(ln.g, $$0.dx(), $$0.e(0.5), $$0.dD(), $$32, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.G(0.1F);
               } else {
                  this.dS().a(null, this.dx(), this.dz(), this.dD(), awd.ue, this.di(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(btj $$0, float $$1, bsb $$2) {
      return $$1;
   }

   @Override
   protected void g(buf $$0) {
      this.e($$0);
   }

   public void fY() {
      this.gx().a(cvo.vu, 100);
      this.fB();
      this.dS().a(this, (byte)30);
   }

   public void b(btj $$0) {
   }

   public void c(btj $$0) {
   }

   public void fZ() {
      double $$0 = (double)(-azc.a(this.dI() * (float) (Math.PI / 180.0)));
      double $$1 = (double)azc.b(this.dI() * (float) (Math.PI / 180.0));
      if (this.dS() instanceof arg) {
         ((arg)this.dS()).a(ln.aj, this.dx() + $$0, this.e(0.5), this.dD() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void ga() {
   }

   @Override
   public void a(btj.c $$0) {
      super.a($$0);
      this.bZ.a(this);
      if (this.ca != null && this.ge()) {
         this.t();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile gb() {
      return this.cz;
   }

   public cno gc() {
      return this.h;
   }

   public cnm gd() {
      return this.cx;
   }

   @Override
   public boolean fP() {
      return this.cx.d;
   }

   public void a(cvl $$0, cvl $$1, cra $$2) {
   }

   public boolean ge() {
      return this.ca != this.bZ;
   }

   public Either<cnp.a, bah> a(je $$0) {
      this.b($$0);
      this.cw = 0;
      return Either.right(bah.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fM();
      if (this.dS() instanceof arg && $$1) {
         ((arg)this.dS()).e();
      }

      this.cw = $$0 ? 0 : 100;
   }

   @Override
   public void fM() {
      this.a(true, true);
   }

   public boolean gf() {
      return this.fL() && this.cw >= 100;
   }

   public int gg() {
      return this.cw;
   }

   public void a(xd $$0, boolean $$1) {
   }

   public void a(alb $$0) {
      this.b(awn.i.b($$0));
   }

   public void a(alb $$0, int $$1) {
      this.a(awn.i.b($$0), $$1);
   }

   public void b(awk<?> $$0) {
      this.a($$0, 1);
   }

   public void a(awk<?> $$0, int $$1) {
   }

   public void a(awk<?> $$0) {
   }

   public int a(Collection<czv<?>> $$0) {
      return 0;
   }

   public void a(czv<?> $$0, List<cvl> $$1) {
   }

   public void b(List<alb> $$0) {
   }

   public int b(Collection<czv<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(eye $$0) {
      if (this.bW()) {
         super.a_($$0);
      } else {
         if (this.ch()) {
            double $$1 = this.bQ().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bk || !this.dS().b_(je.a(this.dx(), this.dz() + 1.0 - 0.1, this.dD())).c()) {
               eye $$3 = this.dv();
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
   protected boolean f(cvl $$0) {
      return !this.cx.b && super.f($$0);
   }

   @Override
   public void bo() {
      if (this.cx.b) {
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
      return (float)this.h(bvm.v);
   }

   @Override
   public boolean a(float $$0, float $$1, bsb $$2) {
      if (this.cx.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(awn.t, (int)Math.round((double)$$0 * 100.0));
         }

         boolean $$3 = this.cu != null && this.cF;
         float $$4;
         if ($$3) {
            $$4 = Math.min($$0, (float)(this.cu.e - this.dz()));
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
      if (!this.aH() && !this.fE() && !this.bi() && !this.b(bss.y)) {
         cvl $$0 = this.a(btr.e);
         if ($$0.a(cvo.nU) && cui.h($$0)) {
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
   protected void b(je $$0, dua $$1) {
      if (this.bi()) {
         this.aX();
         this.b($$1);
      } else {
         je $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dua $$3 = this.dS().a_($$2);
            if ($$3.a(aws.bp)) {
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
   public buf.a eK() {
      return new buf.a(awd.us, awd.ui);
   }

   @Override
   public boolean a(arg $$0, buf $$1) {
      this.b(awn.g.b($$1.ao()));
      return true;
   }

   @Override
   public void a(dua $$0, eye $$1) {
      if (!this.cx.b) {
         super.a($$0, $$1);
      }

      this.gF();
   }

   public void d(int $$0) {
      this.s($$0);
      this.cp = this.cp + (float)$$0 / (float)this.gl();
      this.co = azc.a(this.co + $$0, 0, Integer.MAX_VALUE);

      while (this.cp < 0.0F) {
         float $$1 = this.cp * (float)this.gl();
         if (this.cn > 0) {
            this.c(-1);
            this.cp = 1.0F + $$1 / (float)this.gl();
         } else {
            this.c(-1);
            this.cp = 0.0F;
         }
      }

      while (this.cp >= 1.0F) {
         this.cp = (this.cp - 1.0F) * (float)this.gl();
         this.c(1);
         this.cp = this.cp / (float)this.gl();
      }
   }

   public int gk() {
      return this.cq;
   }

   @Override
   public void a(cvl $$0, int $$1) {
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

      if ($$0 > 0 && this.cn % 5 == 0 && (float)this.cy < (float)this.ag - 100.0F) {
         float $$1 = this.cn > 30 ? 1.0F : (float)this.cn / 30.0F;
         this.dS().a(null, this.dx(), this.dz(), this.dD(), awd.ur, this.di(), $$1 * 0.75F, 1.0F);
         this.cy = this.ag;
      }
   }

   public int gl() {
      if (this.cn >= 30) {
         return 112 + (this.cn - 30) * 9;
      } else {
         return this.cn >= 15 ? 37 + (this.cn - 15) * 5 : 7 + this.cn * 2;
      }
   }

   public void G(float $$0) {
      if (!this.cx.a) {
         if (!this.dS().B) {
            this.cb.a($$0);
         }
      }
   }

   public Optional<cmv> ad() {
      return Optional.empty();
   }

   public cqm gm() {
      return this.cb;
   }

   public boolean u(boolean $$0) {
      return this.cx.a || $$0 || this.cb.c();
   }

   public boolean gn() {
      return this.eA() > 0.0F && this.eA() < this.eQ();
   }

   public boolean go() {
      return this.cx.e;
   }

   public boolean a(je $$0, jj $$1, cvl $$2) {
      if (this.cx.e) {
         return true;
      } else {
         je $$3 = $$0.a($$1.g());
         due $$4 = new due(this.dS(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int ek() {
      if (!this.dS().ac().b(ddo.d) && !this.P_()) {
         int $$0 = this.cn * 7;
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
   protected btj.b bf() {
      return this.cx.b || this.aH() && this.cd() ? btj.b.a : btj.b.d;
   }

   public void A() {
   }

   @Override
   public xd aj() {
      return xd.b(this.cz.getName());
   }

   public cse gp() {
      return this.bY;
   }

   @Override
   public cvl a(btr $$0) {
      if ($$0 == btr.a) {
         return this.h.f();
      } else if ($$0 == btr.b) {
         return this.h.i.get(0);
      } else {
         return $$0.a() == btr.a.b ? this.h.h.get($$0.b()) : cvl.k;
      }
   }

   @Override
   protected boolean b(btr $$0) {
      return $$0.a() == btr.a.b;
   }

   @Override
   public void a(btr $$0, cvl $$1) {
      this.e($$1);
      if ($$0 == btr.a) {
         this.a($$0, this.h.g.set(this.h.j, $$1), $$1);
      } else if ($$0 == btr.b) {
         this.a($$0, this.h.i.set(0, $$1), $$1);
      } else if ($$0.a() == btr.a.b) {
         this.a($$0, this.h.h.set($$0.b(), $$1), $$1);
      }
   }

   public boolean k(cvl $$0) {
      return this.h.f($$0);
   }

   @Override
   public Iterable<cvl> eZ() {
      return Lists.newArrayList(new cvl[]{this.eW(), this.eX()});
   }

   @Override
   public Iterable<cvl> eY() {
      return this.h.h;
   }

   @Override
   public boolean e(btr $$0) {
      return $$0 != btr.g;
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
         btq.a($$0, this.dS(), btp.r).ifPresent($$0x -> {
            if ($$0x instanceof bvb) {
               ((bvb)$$0x).b(this.au);
            }

            $$0x.a_(this.dx(), this.dz() + 0.7F, this.dD());
            ((arg)this.dS()).c($$0x);
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
      return !this.cx.b && !this.P_() && super.ch();
   }

   public abstract boolean f();

   @Override
   public boolean cG() {
      return !this.cx.b;
   }

   public ezi gr() {
      return this.dS().O();
   }

   @Override
   public xd Q_() {
      xr $$0 = ezd.a(this.co(), this.aj());
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

   public boolean a(cnq $$0) {
      return (this.at().a(bU) & $$0.a()) == $$0.a();
   }

   @Override
   public buw a_(int $$0) {
      if ($$0 == 499) {
         return new buw() {
            @Override
            public cvl a() {
               return cnp.this.ca.g();
            }

            @Override
            public boolean a(cvl $$0) {
               cnp.this.ca.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new buw() {
               @Override
               public cvl a() {
                  return cnp.this.bZ.r().a($$1);
               }

               @Override
               public boolean a(cvl $$0) {
                  cnp.this.bZ.r().a($$1, $$0);
                  cnp.this.bZ.a(cnp.this.h);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.h.g.size()) {
            return buw.a(this.h, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.bY.b() ? buw.a(this.bY, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gs() {
      return this.cB;
   }

   public void v(boolean $$0) {
      this.cB = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.cx.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public btz fu() {
      return this.am.a(bV) == 0 ? btz.a : btz.b;
   }

   public void b(btz $$0) {
      this.am.a(bV, (byte)($$0 == btz.a ? 0 : 1));
   }

   public uf gt() {
      return this.am.a(bW);
   }

   protected void i(uf $$0) {
      this.am.a(bW, $$0);
   }

   public uf gu() {
      return this.am.a(bX);
   }

   protected void j(uf $$0) {
      this.am.a(bX, $$0);
   }

   public float gv() {
      return (float)(1.0 / this.h(bvm.e) * 20.0);
   }

   public float H(float $$0) {
      return azc.a(((float)this.aP + $$0) / this.gv(), 0.0F, 1.0F);
   }

   public void gw() {
      this.aP = 0;
   }

   public cvh gx() {
      return this.cD;
   }

   @Override
   protected float aR() {
      return !this.cx.b && !this.fE() ? super.aR() : 1.0F;
   }

   public float gy() {
      return (float)this.h(bvm.q);
   }

   public boolean gz() {
      return this.cx.d && this.H() >= 2;
   }

   @Override
   public boolean g(cvl $$0) {
      btr $$1 = this.i($$0);
      return this.a($$1).f();
   }

   @Override
   public btm e(bur $$0) {
      return d.getOrDefault($$0, bT);
   }

   @Override
   public ImmutableList<bur> fI() {
      return ImmutableList.of(bur.a, bur.f, bur.d);
   }

   @Override
   public cvl h(cvl $$0) {
      if (!($$0.h() instanceof cwi)) {
         return cvl.k;
      } else {
         Predicate<cvl> $$1 = ((cwi)$$0.h()).d();
         cvl $$2 = cwi.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((cwi)$$0.h()).b();

            for (int $$3 = 0; $$3 < this.h.b(); $$3++) {
               cvl $$4 = this.h.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cx.d ? new cvl(cvo.ox) : cvl.k;
         }
      }
   }

   @Override
   public cvl a(dds $$0, cvl $$1, cqn $$2) {
      this.gm().a($$2);
      this.b(awn.c.b($$1.h()));
      $$0.a(null, this.dx(), this.dz(), this.dD(), awd.uk, awe.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof arh) {
         an.A.a((arh)this, $$1);
      }

      cvl $$3 = super.a($$0, $$1, $$2);
      Optional<cvl> $$4 = $$2.f();
      if ($$4.isPresent() && !this.fP()) {
         if ($$3.f()) {
            return $$4.get().u();
         }

         if (!this.dS().w_()) {
            this.gc().f($$4.get().u());
         }
      }

      return $$3;
   }

   @Override
   public eye u(float $$0) {
      double $$1 = 0.22 * (this.fu() == btz.b ? -1.0 : 1.0);
      float $$2 = azc.h($$0 * 0.5F, this.dK(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = azc.h($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      if (this.fE() || this.fr()) {
         eye $$4 = this.g($$0);
         eye $$5 = this.dv();
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

         return this.o($$0).e(new eye($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.ci()) {
         return this.o($$0).e(new eye($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cO().c() - 1.0;
         double $$13 = this.cf() ? -0.2 : 0.07;
         return this.o($$0).e(new eye($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dR() {
      return true;
   }

   public boolean gA() {
      return this.fv() && this.fx().a(cvo.qY);
   }

   @Override
   public boolean dQ() {
      return false;
   }

   public Optional<jm> gB() {
      return this.cE;
   }

   public void a(Optional<jm> $$0) {
      this.cE = $$0;
   }

   @Override
   public float eI() {
      return this.ct;
   }

   @Override
   public void p(float $$0) {
      super.p($$0);
      this.ct = $$0;
   }

   @Override
   public boolean dL() {
      return true;
   }

   @Override
   protected float fl() {
      if (this.cx.b && !this.bW()) {
         return this.cg() ? this.cx.a() * 2.0F : this.cx.a();
      } else {
         return this.cg() ? 0.025999999F : 0.02F;
      }
   }

   public double gC() {
      return this.h(bvm.g);
   }

   public double gD() {
      return this.h(bvm.j);
   }

   public boolean b(btj $$0, double $$1) {
      return $$0.dN() ? false : this.a($$0.cO(), $$1);
   }

   public boolean a(exz $$0, double $$1) {
      double $$2 = this.gD() + $$1;
      return $$0.e(this.bC()) < $$2 * $$2;
   }

   public boolean a(je $$0, double $$1) {
      double $$2 = this.gC() + $$1;
      return new exz($$0).e(this.bC()) < $$2 * $$2;
   }

   public void w(boolean $$0) {
      this.cF = $$0;
      if ($$0) {
         this.cG = 40;
      } else {
         this.cG = 0;
      }
   }

   public boolean gE() {
      return this.cF;
   }

   public void gF() {
      if (this.cG == 0) {
         this.gG();
      }
   }

   public void gG() {
      this.cG = 0;
      this.cv = null;
      this.cu = null;
      this.cF = false;
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
