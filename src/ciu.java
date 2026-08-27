import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class ciu extends bpp {
   private static final Logger b = LogUtils.getLogger();
   public static final int bE = 16;
   public static final bpj bF = bpj.b;
   public static final int bG = 0;
   public static final int bH = 20;
   public static final int bI = 100;
   public static final int bJ = 10;
   public static final int bK = 200;
   public static final float bL = 4.5F;
   public static final float bM = 3.0F;
   public static final float bN = 1.5F;
   public static final float bO = 0.6F;
   public static final float bP = 0.6F;
   public static final float bQ = 1.62F;
   public static final ept bR = new ept(0.0, 0.6, 0.0);
   public static final bpa bS = bpa.b(0.6F, 1.8F).b(1.62F).a(boz.a().a(boy.b, bR));
   private static final Map<bqa, bpa> c = ImmutableMap.builder()
      .put(bqa.a, bS)
      .put(bqa.c, aF)
      .put(bqa.b, bpa.b(0.6F, 0.6F).b(0.4F))
      .put(bqa.d, bpa.b(0.6F, 0.6F).b(0.4F))
      .put(bqa.e, bpa.b(0.6F, 0.6F).b(0.4F))
      .put(bqa.f, bpa.b(0.6F, 1.5F).b(1.27F).a(boz.a().a(boy.b, bR)))
      .put(bqa.h, bpa.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final aim<Float> d = aiq.a(ciu.class, aio.d);
   private static final aim<Integer> e = aiq.a(ciu.class, aio.b);
   protected static final aim<Byte> bT = aiq.a(ciu.class, aio.a);
   protected static final aim<Byte> bU = aiq.a(ciu.class, aio.a);
   protected static final aim<ta> bV = aiq.a(ciu.class, aio.s);
   protected static final aim<ta> bW = aiq.a(ciu.class, aio.s);
   private long f;
   private final cit g = new cit(this);
   protected cnc bX = new cnc();
   public final cmr bY;
   public clq bZ;
   protected clm ca = new clm();
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
   private int cu;
   protected boolean cl;
   private final cir cv = new cir();
   public int cm;
   public int cn;
   public float co;
   protected int cp;
   protected final float cq = 0.02F;
   private int cw;
   private final GameProfile cx;
   private boolean cz;
   private cqm cA = cqm.h;
   private final cqi cB = this.k();
   private Optional<ik> cC = Optional.empty();
   @Nullable
   public cji cr;
   protected float cs;
   @Nullable
   public Double ct;

   public ciu(cxb $$0, ib $$1, float $$2, GameProfile $$3) {
      super(bpd.by, $$0);
      this.a_($$3.getId());
      this.cx = $$3;
      this.bY = new cmr(this.g, !$$0.B, this);
      this.bZ = this.bY;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bj = 180.0F;
   }

   public boolean a(cxb $$0, ib $$1, cwy $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == cwy.d) {
         return true;
      } else if (this.gl()) {
         return false;
      } else {
         cqm $$3 = this.eU();
         return $$3.b() || !$$3.b($$0.H_().d(kj.f), new dnf($$0, $$1, false));
      }
   }

   public static bqv.a fN() {
      return bpp.dR().a(bqw.c, 1.0).a(bqw.r, 0.1F).a(bqw.e).a(bqw.o).a(bqw.g, 4.5).a(bqw.h, 3.0).a(bqw.f);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(bT, (byte)0);
      $$0.a(bU, (byte)bF.a());
      $$0.a(bV, new ta());
      $$0.a(bW, new ta());
   }

   @Override
   public void l() {
      this.af = this.N_();
      if (this.N_()) {
         this.c(false);
      }

      if (this.ce > 0) {
         this.ce--;
      }

      if (this.fI()) {
         this.cu++;
         if (this.cu > 100) {
            this.cu = 100;
         }

         if (!this.dM().B && this.dM().P()) {
            this.a(false, true);
         }
      } else if (this.cu > 0) {
         this.cu++;
         if (this.cu >= 110) {
            this.cu = 0;
         }
      }

      this.fR();
      super.l();
      if (!this.dM().B && this.bZ != null && !this.bZ.a(this)) {
         this.r();
         this.bZ = this.bY;
      }

      this.z();
      if (!this.dM().B) {
         this.ca.a(this);
         this.a(aui.k);
         this.a(aui.l);
         if (this.bA()) {
            this.a(aui.m);
         }

         if (this.bV()) {
            this.a(aui.o);
         }

         if (!this.fI()) {
            this.a(aui.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = aww.a(this.dr(), -2.9999999E7, 2.9999999E7);
      double $$2 = aww.a(this.dx(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dr() || $$2 != this.dx()) {
         this.a_($$1, this.dt(), $$2);
      }

      this.aS++;
      cqm $$3 = this.eU();
      if (!cqm.a(this.cA, $$3)) {
         if (!cqm.b(this.cA, $$3)) {
            this.gt();
         }

         this.cA = $$3.q();
      }

      this.v();
      this.cB.a();
      this.fS();
   }

   @Override
   protected float fl() {
      return this.fz() ? 15.0F : super.fl();
   }

   public boolean fO() {
      return this.bS();
   }

   protected boolean fP() {
      return this.bS();
   }

   protected boolean fQ() {
      return this.bS();
   }

   protected boolean fR() {
      this.cl = this.a(aus.a);
      return this.cl;
   }

   private void v() {
      cqm $$0 = this.d(bpe.f);
      if ($$0.a(cqp.on) && !this.a(aus.a)) {
         this.b(new bok(bom.m, 200, 0, false, false, true));
      }
   }

   protected cqi k() {
      return new cqi();
   }

   private void z() {
      this.cf = this.ci;
      this.cg = this.cj;
      this.ch = this.ck;
      double $$0 = this.dr() - this.ci;
      double $$1 = this.dt() - this.cj;
      double $$2 = this.dx() - this.ck;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.ci = this.dr();
         this.cf = this.ci;
      }

      if ($$2 > 10.0) {
         this.ck = this.dx();
         this.ch = this.ck;
      }

      if ($$1 > 10.0) {
         this.cj = this.dt();
         this.cg = this.cj;
      }

      if ($$0 < -10.0) {
         this.ci = this.dr();
         this.cf = this.ci;
      }

      if ($$2 < -10.0) {
         this.ck = this.dx();
         this.ch = this.ck;
      }

      if ($$1 < -10.0) {
         this.cj = this.dt();
         this.cg = this.cj;
      }

      this.ci += $$0 * 0.25;
      this.ck += $$2 * 0.25;
      this.cj += $$1 * 0.25;
   }

   protected void fS() {
      if (this.h(bqa.d)) {
         bqa $$0;
         if (this.fB()) {
            $$0 = bqa.b;
         } else if (this.fI()) {
            $$0 = bqa.c;
         } else if (this.bZ()) {
            $$0 = bqa.d;
         } else if (this.fo()) {
            $$0 = bqa.e;
         } else if (this.bS() && !this.cv.b) {
            $$0 = bqa.f;
         } else {
            $$0 = bqa.a;
         }

         bqa $$6;
         if (this.N_() || this.bO() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bqa.f)) {
            $$6 = bqa.f;
         } else {
            $$6 = bqa.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bqa $$0) {
      return this.dM().a(this, this.a($$0).a(this.dk()).h(1.0E-7));
   }

   @Override
   public int ax() {
      return Math.max(1, this.dM().Z().c(this.cv.a ? cwx.F : cwx.E));
   }

   @Override
   protected atx aN() {
      return aty.tV;
   }

   @Override
   protected atx aO() {
      return aty.tT;
   }

   @Override
   protected atx aP() {
      return aty.tU;
   }

   @Override
   public int bM() {
      return 10;
   }

   @Override
   public void a(atx $$0, float $$1, float $$2) {
      this.dM().a(this, this.dr(), this.dt(), this.dx(), $$0, this.db(), $$1, $$2);
   }

   public void a(atx $$0, atz $$1, float $$2, float $$3) {
   }

   @Override
   public atz db() {
      return atz.h;
   }

   @Override
   protected int dc() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.x();
      } else if ($$0 == 23) {
         this.cz = false;
      } else if ($$0 == 22) {
         this.cz = true;
      } else if ($$0 == 43) {
         this.a(kc.f);
      } else {
         super.b($$0);
      }
   }

   private void a(ka $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dM().a($$0, this.d(1.0), this.du() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected void r() {
      this.bZ = this.bY;
   }

   protected void s() {
   }

   @Override
   public void t() {
      if (!this.dM().B && this.fP() && this.bO()) {
         this.ac();
         this.f(false);
      } else {
         super.t();
         this.cc = this.cd;
         this.cd = 0.0F;
      }
   }

   @Override
   protected void fn() {
      super.fn();
      this.eS();
      this.aZ = this.dC();
   }

   @Override
   public void m_() {
      if (this.cb > 0) {
         this.cb--;
      }

      if (this.dM().aj() == bna.a && this.dM().Z().b(cwx.k)) {
         if (this.ex() < this.eO() && this.ah % 20 == 0) {
            this.c(1.0F);
         }

         if (this.ca.c() && this.ah % 10 == 0) {
            this.ca.a(this.ca.a() + 1);
         }
      }

      this.g.j();
      this.cc = this.cd;
      super.m_();
      this.y((float)this.g(bqw.r));
      float $$1;
      if (this.aC() && !this.ey() && !this.bZ()) {
         $$1 = Math.min(0.1F, (float)this.dp().h());
      } else {
         $$1 = 0.0F;
      }

      this.cd = this.cd + ($$1 - this.cd) * 0.4F;
      if (this.ex() > 0.0F && !this.N_()) {
         epo $$2;
         if (this.bO() && !this.cZ().dH()) {
            $$2 = this.cH().b(this.cZ().cH()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cH().c(1.0, 0.5, 1.0);
         }

         List<box> $$4 = this.dM().a_(this, $$2);
         List<box> $$5 = Lists.newArrayList();

         for (box $$6 : $$4) {
            if ($$6.ai() == bpd.N) {
               $$5.add($$6);
            } else if (!$$6.dH()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ac.a($$5, this.ag));
         }
      }

      this.c(this.gq());
      this.c(this.gr());
      if (!this.dM().B && (this.ab > 0.5F || this.bc()) || this.cv.b || this.fI() || this.aA) {
         this.gn();
      }
   }

   private void c(@Nullable ta $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dM().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bpd.a($$1).filter($$0x -> $$0x == bpd.ax).ifPresent($$0x -> {
            if (!cbu.a(this.dM(), this)) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), cbu.a(this.dM(), this.dM().z), this.db(), 1.0F, cbu.a(this.dM().z));
            }
         });
      }
   }

   private void d(box $$0) {
      $$0.b_(this);
   }

   public int fT() {
      return this.an.a(e);
   }

   public void s(int $$0) {
      this.an.a(e, $$0);
   }

   public void t(int $$0) {
      int $$1 = this.fT();
      this.an.a(e, $$1 + $$0);
   }

   public void u(int $$0) {
      this.bB = $$0;
      if (!this.dM().B) {
         this.gn();
         this.c(4, true);
      }
   }

   @Override
   public void a(bnw $$0) {
      super.a($$0);
      this.ar();
      if (!this.N_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-aww.b((this.eG() + this.dC()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-aww.a((this.eG() + this.dC()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(aui.N);
      this.a(aui.i.b(aui.m));
      this.a(aui.i.b(aui.n));
      this.aA();
      this.a_(false);
      this.a(Optional.of(ik.a(this.dM().ad(), this.dm())));
   }

   @Override
   protected void eA() {
      super.eA();
      if (!this.dM().Z().b(cwx.d)) {
         this.fU();
         this.g.k();
      }
   }

   protected void fU() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cqm $$1 = this.g.a($$0);
         if (!$$1.b() && cux.e($$1)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected atx d(bnw $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected atx n_() {
      return aty.tL;
   }

   @Nullable
   public cfe a(cqm $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cfe a(cqm $$0, boolean $$1, boolean $$2) {
      if ($$0.b()) {
         return null;
      } else {
         if (this.dM().B) {
            this.a(bnc.a);
         }

         double $$3 = this.dv() - 0.3F;
         cfe $$4 = new cfe(this.dM(), this.dr(), $$3, this.dx(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ag.i() * 0.5F;
            float $$6 = this.ag.i() * (float) (Math.PI * 2);
            $$4.o((double)(-aww.a($$6) * $$5), 0.2F, (double)(aww.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = aww.a(this.dE() * (float) (Math.PI / 180.0));
            float $$9 = aww.b(this.dE() * (float) (Math.PI / 180.0));
            float $$10 = aww.a(this.dC() * (float) (Math.PI / 180.0));
            float $$11 = aww.b(this.dC() * (float) (Math.PI / 180.0));
            float $$12 = this.ag.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.ag.i();
            $$4.o(
               (double)(-$$10 * $$9 * 0.3F) + Math.cos((double)$$12) * (double)$$13,
               (double)(-$$8 * 0.3F + 0.1F + (this.ag.i() - this.ag.i()) * 0.1F),
               (double)($$11 * $$9 * 0.3F) + Math.sin((double)$$12) * (double)$$13
            );
         }

         return $$4;
      }
   }

   public float d(dnb $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = cux.g(this);
         cqm $$3 = this.eU();
         if ($$2 > 0 && !$$3.b()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bol.a(this)) {
         $$1 *= 1.0F + (float)(bol.b(this) + 1) * 0.2F;
      }

      if (this.a(bom.d)) {
         $$1 *= switch (this.c(bom.d).d()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.g(bqw.f);
      if (this.a(aus.a) && !cux.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aC()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dnb $$0) {
      return !$$0.y() || this.g.f().b($$0);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.a_(this.cx.getId());
      tg $$1 = $$0.c("Inventory", 10);
      this.g.b($$1);
      this.g.l = $$0.h("SelectedItemSlot");
      this.cu = $$0.g("SleepTimer");
      this.co = $$0.j("XpP");
      this.cm = $$0.h("XpLevel");
      this.cn = $$0.h("XpTotal");
      this.cp = $$0.h("XpSeed");
      if (this.cp == 0) {
         this.cp = this.ag.f();
      }

      this.s($$0.h("Score"));
      this.ca.a($$0);
      this.cv.b($$0);
      this.f(bqw.r).a((double)this.cv.b());
      if ($$0.b("EnderItems", 9)) {
         this.bX.a($$0.c("EnderItems", 10));
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(ik.a.parse(to.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

      if ($$0.b("ignore_fall_damage_above_y", 6)) {
         this.ct = $$0.k("ignore_fall_damage_above_y");
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      tp.f($$0);
      $$0.a("Inventory", this.g.a(new tg()));
      $$0.a("SelectedItemSlot", this.g.l);
      $$0.a("SleepTimer", (short)this.cu);
      $$0.a("XpP", this.co);
      $$0.a("XpLevel", this.cm);
      $$0.a("XpTotal", this.cn);
      $$0.a("XpSeed", this.cp);
      $$0.a("Score", this.fT());
      this.ca.b($$0);
      this.cv.a($$0);
      $$0.a("EnderItems", this.bX.g());
      if (!this.gq().g()) {
         $$0.a("ShoulderEntityLeft", this.gq());
      }

      if (!this.gr().g()) {
         $$0.a("ShoulderEntityRight", this.gr());
      }

      this.gy().flatMap($$0x -> ik.a.encodeStart(to.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.ct != null) {
         $$0.a("ignore_fall_damage_above_y", this.ct);
      }
   }

   @Override
   public boolean b(bnw $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(aup.o)) {
         return !this.dM().Z().b(cwx.G);
      } else if ($$0.a(aup.n)) {
         return !this.dM().Z().b(cwx.H);
      } else if ($$0.a(aup.j)) {
         return !this.dM().Z().b(cwx.I);
      } else {
         return $$0.a(aup.p) ? !this.dM().Z().b(cwx.J) : false;
      }
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cv.a && !$$0.a(aup.e)) {
         return false;
      } else {
         this.be = 0;
         if (this.ey()) {
            return false;
         } else {
            if (!this.dM().B) {
               this.gn();
            }

            if ($$0.f()) {
               if (this.dM().aj() == bna.a) {
                  $$1 = 0.0F;
               }

               if (this.dM().aj() == bna.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dM().aj() == bna.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bpp $$0) {
      super.d($$0);
      if ($$0.fL()) {
         this.fV();
      }
   }

   @Override
   public boolean eq() {
      return !this.ga().a && super.eq();
   }

   public boolean a(ciu $$0) {
      eqz $$1 = this.cg();
      eqz $$2 = $$0.cg();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bnw $$0, float $$1) {
      this.g.a($$0, $$1, cit.g);
   }

   @Override
   protected void c(bnw $$0, float $$1) {
      this.g.a($$0, $$1, cit.h);
   }

   @Override
   protected void v(float $$0) {
      if (this.by.a(cqp.vq)) {
         if (!this.dM().B) {
            this.b(aui.c.b(this.by.d()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + aww.d($$0);
            bnc $$2 = this.ft();
            this.by.a($$1, this, d($$2));
            if (this.by.b()) {
               if ($$2 == bnc.a) {
                  this.a(bpe.a, cqm.h);
               } else {
                  this.a(bpe.b, cqm.h);
               }

               this.by = cqm.h;
               this.a(aty.wf, 0.8F, 0.8F + this.dM().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bnw $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fp(), 0.0F);
         this.A(this.fp() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(aui.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.C($$0.a());
            this.eM().a($$0, var7);
            this.t(this.ex() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(aui.J, Math.round(var7 * 10.0F));
            }

            this.b(drp.o);
         }
      }
   }

   @Override
   protected boolean dV() {
      return !this.cv.b && super.dV();
   }

   public boolean Y() {
      return false;
   }

   public void a(dlr $$0, boolean $$1) {
   }

   public void a(cwc $$0) {
   }

   public void a(dks $$0) {
   }

   public void a(dlw $$0) {
   }

   public void a(dli $$0) {
   }

   public void a(cdg $$0, bmw $$1) {
   }

   public OptionalInt a(@Nullable bnh $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, cwa $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cqm $$0, bnc $$1) {
   }

   public bnd a(box $$0, bnc $$1) {
      if (this.N_()) {
         if ($$0 instanceof bnh) {
            this.a((bnh)$$0);
         }

         return bnd.d;
      } else {
         cqm $$2 = this.b($$1);
         cqm $$3 = $$2.q();
         bnd $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cv.d && $$2 == this.b($$1) && $$2.M() < $$3.M()) {
               $$2.f($$3.M());
            }

            return $$4;
         } else {
            if (!$$2.b() && $$0 instanceof bpp) {
               if (this.cv.d) {
                  $$2 = $$3;
               }

               bnd $$5 = $$2.a(this, (bpp)$$0, $$1);
               if ($$5.a()) {
                  this.dM().a(drp.r, $$0.dk(), drp.a.a(this));
                  if ($$2.b() && !this.cv.d) {
                     this.a($$1, cqm.h);
                  }

                  return $$5;
               }
            }

            return bnd.d;
         }
      }
   }

   @Override
   public void bF() {
      super.bF();
      this.J = 0;
   }

   @Override
   protected boolean fd() {
      return super.fd() || this.fI();
   }

   @Override
   public boolean ec() {
      return !this.cv.b;
   }

   @Override
   protected ept a(ept $$0, bpu $$1) {
      if (!this.cv.b && $$0.d <= 0.0 && ($$1 == bpu.a || $$1 == bpu.b) && this.fQ() && this.A()) {
         double $$2 = $$0.c;
         double $$3 = $$0.e;
         double $$4 = 0.05;

         while ($$2 != 0.0 && this.dM().a(this, this.cH().d($$2, (double)(-this.dG()), 0.0))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }
         }

         while ($$3 != 0.0 && this.dM().a(this, this.cH().d(0.0, (double)(-this.dG()), $$3))) {
            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         while ($$2 != 0.0 && $$3 != 0.0 && this.dM().a(this, this.cH().d($$2, (double)(-this.dG()), $$3))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }

            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         $$0 = new ept($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean A() {
      return this.aC() || this.ab < this.dG() && !this.dM().a(this, this.cH().d(0.0, (double)(this.ab - this.dG()), 0.0));
   }

   public void e(box $$0) {
      if ($$0.cq()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.g(bqw.c);
            float $$2 = cux.a(this.eU(), $$0.ai());
            float $$3 = this.D(0.5F);
            $$1 *= 0.2F + $$3 * $$3 * 0.8F;
            $$2 *= $$3;
            this.gt();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$4 = $$3 > 0.9F;
               boolean $$5 = false;
               int $$6 = 0;
               $$6 += cux.c(this);
               if (this.bY() && $$4) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.tD, this.db(), 1.0F, 1.0F);
                  $$6++;
                  $$5 = true;
               }

               boolean $$7 = $$4 && this.ab > 0.0F && !this.aC() && !this.p_() && !this.bc() && !this.a(bom.o) && !this.bO() && $$0 instanceof bpp;
               $$7 = $$7 && !this.bY();
               if ($$7) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$8 = false;
               double $$9 = (double)(this.Y - this.X);
               if ($$4 && !$$7 && !$$5 && this.aC() && $$9 < (double)this.fk()) {
                  cqm $$10 = this.b(bnc.a);
                  if ($$10.d() instanceof crx) {
                     $$8 = true;
                  }
               }

               float $$11 = 0.0F;
               boolean $$12 = false;
               int $$13 = cux.d(this);
               if ($$0 instanceof bpp) {
                  $$11 = ((bpp)$$0).ex();
                  if ($$13 > 0 && !$$0.bN()) {
                     $$12 = true;
                     $$0.g(1);
                  }
               }

               ept $$14 = $$0.dp();
               boolean $$15 = $$0.a(this.dN().a(this), $$1);
               if ($$15) {
                  if ($$6 > 0) {
                     if ($$0 instanceof bpp) {
                        ((bpp)$$0)
                           .q(
                              (double)((float)$$6 * 0.5F),
                              (double)aww.a(this.dC() * (float) (Math.PI / 180.0)),
                              (double)(-aww.b(this.dC() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-aww.a(this.dC() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F),
                           0.1,
                           (double)(aww.b(this.dC() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F)
                        );
                     }

                     this.g(this.dp().d(0.6, 1.0, 0.6));
                     this.g(false);
                  }

                  if ($$8) {
                     float $$16 = 1.0F + cux.a(this) * $$1;

                     for (bpp $$18 : this.dM().a(bpp.class, $$0.cH().c(1.0, 0.25, 1.0))) {
                        if ($$18 != this && $$18 != $$0 && !this.s($$18) && (!($$18 instanceof ceu) || !((ceu)$$18).z()) && this.g((box)$$18) < 9.0) {
                           $$18.q(0.4F, (double)aww.a(this.dC() * (float) (Math.PI / 180.0)), (double)(-aww.b(this.dC() * (float) (Math.PI / 180.0))));
                           $$18.a(this.dN().a(this), $$16);
                        }
                     }

                     this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.tG, this.db(), 1.0F, 1.0F);
                     this.fW();
                  }

                  if ($$0 instanceof apg && $$0.T) {
                     ((apg)$$0).d.b(new ads($$0));
                     $$0.T = false;
                     $$0.g($$14);
                  }

                  if ($$7) {
                     this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.tC, this.db(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$7 && !$$8) {
                     if ($$4) {
                        this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.tF, this.db(), 1.0F, 1.0F);
                     } else {
                        this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.tH, this.db(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.c($$0);
                  }

                  this.A($$0);
                  if ($$0 instanceof bpp) {
                     cux.a((bpp)$$0, this);
                  }

                  cux.b(this, $$0);
                  cqm $$19 = this.eU();
                  box $$20 = $$0;
                  if ($$0 instanceof cdw) {
                     $$20 = ((cdw)$$0).b;
                  }

                  if (!this.dM().B && !$$19.b() && $$20 instanceof bpp) {
                     $$19.a((bpp)$$20, this);
                     if ($$19.b()) {
                        this.a(bnc.a, cqm.h);
                     }
                  }

                  if ($$0 instanceof bpp) {
                     float $$21 = $$11 - ((bpp)$$0).ex();
                     this.a(aui.G, Math.round($$21 * 10.0F));
                     if ($$13 > 0) {
                        $$0.g($$13 * 4);
                     }

                     if (this.dM() instanceof apf && $$21 > 2.0F) {
                        int $$22 = (int)((double)$$21 * 0.5);
                        ((apf)this.dM()).a(kc.h, $$0.dr(), $$0.e(0.5), $$0.dx(), $$22, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.C(0.1F);
               } else {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.tE, this.db(), 1.0F, 1.0F);
                  if ($$12) {
                     $$0.aA();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(bpp $$0) {
      this.e($$0);
   }

   public void fV() {
      this.gu().a(cqp.vq, 100);
      this.fy();
      this.dM().a(this, (byte)30);
   }

   @Override
   public void b(box $$0) {
   }

   public void c(box $$0) {
   }

   public void fW() {
      double $$0 = (double)(-aww.a(this.dC() * (float) (Math.PI / 180.0)));
      double $$1 = (double)aww.b(this.dC() * (float) (Math.PI / 180.0));
      if (this.dM() instanceof apf) {
         ((apf)this.dM()).a(kc.ah, this.dr() + $$0, this.e(0.5), this.dx() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fX() {
   }

   @Override
   public void a(box.c $$0) {
      super.a($$0);
      this.bY.b(this);
      if (this.bZ != null && this.gb()) {
         this.s();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile fY() {
      return this.cx;
   }

   public cit fZ() {
      return this.g;
   }

   public cir ga() {
      return this.cv;
   }

   @Override
   public boolean fM() {
      return this.cv.d;
   }

   public void a(cqm $$0, cqm $$1, cly $$2) {
   }

   public boolean gb() {
      return this.bZ != this.bY;
   }

   public Either<ciu.a, axy> a(ib $$0) {
      this.b($$0);
      this.cu = 0;
      return Either.right(axy.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fJ();
      if (this.dM() instanceof apf && $$1) {
         ((apf)this.dM()).e();
      }

      this.cu = $$0 ? 0 : 100;
   }

   @Override
   public void fJ() {
      this.a(true, true);
   }

   public static Optional<ept> a(apf $$0, ib $$1, float $$2, boolean $$3, boolean $$4) {
      dnb $$5 = $$0.a_($$1);
      dac $$6 = $$5.b();
      if ($$6 instanceof dgj && ($$3 || $$5.c(dgj.d) > 0) && dgj.a($$0)) {
         Optional<ept> $$7 = dgj.a(bpd.by, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dgj.d, Integer.valueOf($$5.c(dgj.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof czv && czv.a($$0)) {
         return czv.a(bpd.by, $$0, $$1, $$5.c(czv.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dnb $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new ept((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean gc() {
      return this.fI() && this.cu >= 100;
   }

   public int gd() {
      return this.cu;
   }

   public void a(vu $$0, boolean $$1) {
   }

   public void a(ajh $$0) {
      this.b(aui.i.b($$0));
   }

   public void a(ajh $$0, int $$1) {
      this.a(aui.i.b($$0), $$1);
   }

   public void b(auf<?> $$0) {
      this.a($$0, 1);
   }

   public void a(auf<?> $$0, int $$1) {
   }

   public void a(auf<?> $$0) {
   }

   public int a(Collection<ctr<?>> $$0) {
      return 0;
   }

   public void a(ctr<?> $$0, List<cqm> $$1) {
   }

   public void b(List<ajh> $$0) {
   }

   public int b(Collection<ctr<?>> $$0) {
      return 0;
   }

   @Override
   public void fg() {
      super.fg();
      this.a(aui.E);
      if (this.bY()) {
         this.C(0.2F);
      } else {
         this.C(0.05F);
      }
   }

   @Override
   public void a(ept $$0) {
      if (this.bZ() && !this.bO()) {
         double $$1 = this.bI().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bm || !this.dM().a_(ib.a(this.dr(), this.dt() + 1.0 - 0.1, this.dx())).u().c()) {
            ept $$3 = this.dp();
            this.g($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cv.b && !this.bO()) {
         double $$4 = this.dp().d;
         super.a($$0);
         ept $$5 = this.dp();
         this.o($$5.c, $$4 * 0.6, $$5.e);
         this.n();
         this.b(7, false);
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bi() {
      if (this.cv.b) {
         this.h(false);
      } else {
         super.bi();
      }
   }

   protected boolean h(ib $$0) {
      return !this.dM().a_($$0).o(this.dM(), $$0);
   }

   @Override
   public float fk() {
      return (float)this.g(bqw.r);
   }

   @Override
   public boolean a(float $$0, float $$1, bnw $$2) {
      if (this.cv.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(aui.t, (int)Math.round((double)$$0 * 100.0));
         }

         if (this.ct != null) {
            float $$3 = this.ct.floatValue();
            this.ct = null;
            return (double)$$3 < this.dt() ? false : super.a($$3 - (float)this.dt(), $$1, $$2);
         } else {
            return super.a($$0, $$1, $$2);
         }
      }
   }

   public boolean ge() {
      if (!this.aC() && !this.fB() && !this.bc() && !this.a(bom.y)) {
         cqm $$0 = this.d(bpe.e);
         if ($$0.a(cqp.nS) && cph.d($$0)) {
            this.gf();
            this.ct = null;
            return true;
         }
      }

      return false;
   }

   public void gf() {
      this.b(7, true);
   }

   public void gg() {
      this.b(7, true);
      this.b(7, false);
   }

   @Override
   protected void bl() {
      if (!this.N_()) {
         super.bl();
      }
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      if (this.bc()) {
         this.aR();
         this.b($$1);
      } else {
         ib $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dnb $$3 = this.dM().a_($$2);
            if ($$3.a(aun.bo)) {
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
   public bpp.a eI() {
      return new bpp.a(aty.tS, aty.tI);
   }

   @Override
   public boolean a(apf $$0, bpp $$1) {
      this.b(aui.g.b($$1.ai()));
      return true;
   }

   @Override
   public void a(dnb $$0, ept $$1) {
      if (!this.cv.b) {
         super.a($$0, $$1);
      }
   }

   public void d(int $$0) {
      this.t($$0);
      this.co = this.co + (float)$$0 / (float)this.gi();
      this.cn = aww.a(this.cn + $$0, 0, Integer.MAX_VALUE);

      while (this.co < 0.0F) {
         float $$1 = this.co * (float)this.gi();
         if (this.cm > 0) {
            this.c(-1);
            this.co = 1.0F + $$1 / (float)this.gi();
         } else {
            this.c(-1);
            this.co = 0.0F;
         }
      }

      while (this.co >= 1.0F) {
         this.co = (this.co - 1.0F) * (float)this.gi();
         this.c(1);
         this.co = this.co / (float)this.gi();
      }
   }

   public int gh() {
      return this.cp;
   }

   @Override
   public void a(cqm $$0, int $$1) {
      this.cm -= $$1;
      if (this.cm < 0) {
         this.cm = 0;
         this.co = 0.0F;
         this.cn = 0;
      }

      this.cp = this.ag.f();
   }

   public void c(int $$0) {
      this.cm += $$0;
      if (this.cm < 0) {
         this.cm = 0;
         this.co = 0.0F;
         this.cn = 0;
      }

      if ($$0 > 0 && this.cm % 5 == 0 && (float)this.cw < (float)this.ah - 100.0F) {
         float $$1 = this.cm > 30 ? 1.0F : (float)this.cm / 30.0F;
         this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.tR, this.db(), $$1 * 0.75F, 1.0F);
         this.cw = this.ah;
      }
   }

   public int gi() {
      if (this.cm >= 30) {
         return 112 + (this.cm - 30) * 9;
      } else {
         return this.cm >= 15 ? 37 + (this.cm - 15) * 5 : 7 + this.cm * 2;
      }
   }

   public void C(float $$0) {
      if (!this.cv.a) {
         if (!this.dM().B) {
            this.ca.a($$0);
         }
      }
   }

   public Optional<cia> aa() {
      return Optional.empty();
   }

   public clm gj() {
      return this.ca;
   }

   public boolean s(boolean $$0) {
      return this.cv.a || $$0 || this.ca.c();
   }

   public boolean gk() {
      return this.ex() > 0.0F && this.ex() < this.eO();
   }

   public boolean gl() {
      return this.cv.e;
   }

   public boolean a(ib $$0, ih $$1, cqm $$2) {
      if (this.cv.e) {
         return true;
      } else {
         ib $$3 = $$0.a($$1.g());
         dnf $$4 = new dnf(this.dM(), $$3, false);
         return $$2.a(this.dM().H_().d(kj.f), $$4);
      }
   }

   @Override
   public int eg() {
      if (!this.dM().Z().b(cwx.d) && !this.N_()) {
         int $$0 = this.cm * 7;
         return $$0 > 100 ? 100 : $$0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean eh() {
      return true;
   }

   @Override
   public boolean cC() {
      return true;
   }

   @Override
   protected box.b aZ() {
      return this.cv.b || this.aC() && this.bV() ? box.b.a : box.b.d;
   }

   public void y() {
   }

   @Override
   public vu ad() {
      return vu.b(this.cx.getName());
   }

   public cnc gm() {
      return this.bX;
   }

   @Override
   public cqm d(bpe $$0) {
      if ($$0 == bpe.a) {
         return this.g.f();
      } else if ($$0 == bpe.b) {
         return this.g.k.get(0);
      } else {
         return $$0.a() == bpe.a.b ? this.g.j.get($$0.b()) : cqm.h;
      }
   }

   @Override
   protected boolean a(bpe $$0) {
      return $$0.a() == bpe.a.b;
   }

   @Override
   public void a(bpe $$0, cqm $$1) {
      this.e($$1);
      if ($$0 == bpe.a) {
         this.a($$0, this.g.i.set(this.g.l, $$1), $$1);
      } else if ($$0 == bpe.b) {
         this.a($$0, this.g.k.set(0, $$1), $$1);
      } else if ($$0.a() == bpe.a.b) {
         this.a($$0, this.g.j.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cqm $$0) {
      return this.g.e($$0);
   }

   @Override
   public Iterable<cqm> eX() {
      return Lists.newArrayList(new cqm[]{this.eU(), this.eV()});
   }

   @Override
   public Iterable<cqm> eW() {
      return this.g.j;
   }

   @Override
   public boolean c(bpe $$0) {
      return $$0 != bpe.g;
   }

   public boolean h(ta $$0) {
      if (this.bO() || !this.aC() || this.bc() || this.aA) {
         return false;
      } else if (this.gq().g()) {
         this.i($$0);
         this.f = this.dM().X();
         return true;
      } else if (this.gr().g()) {
         this.j($$0);
         this.f = this.dM().X();
         return true;
      } else {
         return false;
      }
   }

   protected void gn() {
      if (this.f + 20L < this.dM().X()) {
         this.k(this.gq());
         this.i(new ta());
         this.k(this.gr());
         this.j(new ta());
      }
   }

   private void k(ta $$0) {
      if (!this.dM().B && !$$0.g()) {
         bpd.a($$0, this.dM()).ifPresent($$0x -> {
            if ($$0x instanceof bql) {
               ((bql)$$0x).b(this.ay);
            }

            $$0x.a_(this.dr(), this.dt() + 0.7F, this.dx());
            ((apf)this.dM()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean N_();

   @Override
   public boolean bv() {
      return !this.N_() && super.bv();
   }

   @Override
   public boolean bZ() {
      return !this.cv.b && !this.N_() && super.bZ();
   }

   public abstract boolean f();

   @Override
   public boolean cz() {
      return !this.cv.b;
   }

   public eqx go() {
      return this.dM().K();
   }

   @Override
   public vu O_() {
      wi $$0 = eqs.a(this.cg(), this.ad());
      return this.a($$0);
   }

   private wi a(wi $$0) {
      String $$1 = this.fY().getName();
      return $$0.a($$1x -> $$1x.a(new vs(vs.a.d, "/tell " + $$1 + " ")).a(this.cG()).a($$1));
   }

   @Override
   public String cy() {
      return this.fY().getName();
   }

   @Override
   protected void B(float $$0) {
      this.an().a(d, $$0);
   }

   @Override
   public float fp() {
      return this.an().a(d);
   }

   public boolean a(civ $$0) {
      return (this.an().a(bT) & $$0.a()) == $$0.a();
   }

   @Override
   public bqg a_(int $$0) {
      if ($$0 >= 0 && $$0 < this.g.i.size()) {
         return bqg.a(this.g, $$0);
      } else {
         int $$1 = $$0 - 200;
         return $$1 >= 0 && $$1 < this.bX.b() ? bqg.a(this.bX, $$1) : super.a_($$0);
      }
   }

   public boolean gp() {
      return this.cz;
   }

   public void t(boolean $$0) {
      this.cz = $$0;
   }

   @Override
   public void i(int $$0) {
      super.i(this.cv.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bpj fr() {
      return this.an.a(bU) == 0 ? bpj.a : bpj.b;
   }

   public void a(bpj $$0) {
      this.an.a(bU, (byte)($$0 == bpj.a ? 0 : 1));
   }

   public ta gq() {
      return this.an.a(bV);
   }

   protected void i(ta $$0) {
      this.an.a(bV, $$0);
   }

   public ta gr() {
      return this.an.a(bW);
   }

   protected void j(ta $$0) {
      this.an.a(bW, $$0);
   }

   public float gs() {
      return (float)(1.0 / this.g(bqw.e) * 20.0);
   }

   public float D(float $$0) {
      return aww.a(((float)this.aS + $$0) / this.gs(), 0.0F, 1.0F);
   }

   public void gt() {
      this.aS = 0;
   }

   public cqi gu() {
      return this.cB;
   }

   @Override
   protected float aL() {
      return !this.cv.b && !this.fB() ? super.aL() : 1.0F;
   }

   public float gv() {
      return (float)this.g(bqw.o);
   }

   public boolean gw() {
      return this.cv.d && this.F() >= 2;
   }

   @Override
   public boolean f(cqm $$0) {
      bpe $$1 = bpr.h($$0);
      return this.d($$1).b();
   }

   @Override
   public bpa e(bqa $$0) {
      return c.getOrDefault($$0, bS);
   }

   @Override
   public ImmutableList<bqa> fF() {
      return ImmutableList.of(bqa.a, bqa.f, bqa.d);
   }

   @Override
   public cqm g(cqm $$0) {
      if (!($$0.d() instanceof crc)) {
         return cqm.h;
      } else {
         Predicate<cqm> $$1 = ((crc)$$0.d()).d();
         cqm $$2 = crc.a(this, $$1);
         if (!$$2.b()) {
            return $$2;
         } else {
            $$1 = ((crc)$$0.d()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cqm $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cv.d ? new cqm(cqp.ou) : cqm.h;
         }
      }
   }

   @Override
   public cqm a(cxb $$0, cqm $$1) {
      this.gj().a($$1.d(), $$1);
      this.b(aui.c.b($$1.d()));
      $$0.a(null, this.dr(), this.dt(), this.dx(), aty.tK, atz.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof apg) {
         am.A.a((apg)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dnb $$0) {
      return this.cv.b || super.c($$0);
   }

   @Override
   public ept q(float $$0) {
      double $$1 = 0.22 * (this.fr() == bpj.b ? -1.0 : 1.0);
      float $$2 = aww.i($$0 * 0.5F, this.dE(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = aww.i($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      if (this.fB() || this.fo()) {
         ept $$4 = this.f($$0);
         ept $$5 = this.dp();
         double $$6 = $$5.i();
         double $$7 = $$4.i();
         float $$10;
         if ($$6 > 0.0 && $$7 > 0.0) {
            double $$8 = ($$5.c * $$4.c + $$5.e * $$4.e) / Math.sqrt($$6 * $$7);
            double $$9 = $$5.c * $$4.e - $$5.e * $$4.c;
            $$10 = (float)(Math.signum($$9) * Math.acos($$8));
         } else {
            $$10 = 0.0F;
         }

         return this.l($$0).e(new ept($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.ca()) {
         return this.l($$0).e(new ept($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cH().c() - 1.0;
         double $$13 = this.bX() ? -0.2 : 0.07;
         return this.l($$0).e(new ept($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dL() {
      return true;
   }

   public boolean gx() {
      return this.fs() && this.fu().a(cqp.qW);
   }

   @Override
   public boolean dK() {
      return false;
   }

   @Override
   public void n() {
      super.n();
      this.ct = null;
   }

   public Optional<ik> gy() {
      return this.cC;
   }

   public void a(Optional<ik> $$0) {
      this.cC = $$0;
   }

   @Override
   public float eG() {
      return this.cs;
   }

   @Override
   public void m(float $$0) {
      super.m($$0);
      this.cs = $$0;
   }

   @Override
   public boolean dF() {
      return true;
   }

   @Override
   protected float fj() {
      if (this.cv.b && !this.bO()) {
         return this.bY() ? this.cv.a() * 2.0F : this.cv.a();
      } else {
         return this.bY() ? 0.025999999F : 0.02F;
      }
   }

   public static boolean c(String $$0) {
      return $$0.length() > 16 ? false : $$0.chars().filter($$0x -> $$0x <= 32 || $$0x >= 127).findAny().isEmpty();
   }

   public double gz() {
      return this.g(bqw.g);
   }

   public double gA() {
      return this.g(bqw.h);
   }

   public boolean b(box $$0, double $$1) {
      return $$0.dH() ? false : this.a($$0.cH(), $$1);
   }

   public boolean a(epo $$0, double $$1) {
      double $$2 = this.gA() + $$1;
      return $$0.e(this.bu()) < $$2 * $$2;
   }

   public boolean a(ib $$0, double $$1) {
      double $$2 = this.gz() + $$1;
      return new epo($$0).e(this.bu()) < $$2 * $$2;
   }

   public static enum a {
      a,
      b(vu.c("block.minecraft.bed.no_sleep")),
      c(vu.c("block.minecraft.bed.too_far_away")),
      d(vu.c("block.minecraft.bed.obstructed")),
      e,
      f(vu.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final vu g;

      private a() {
         this.g = null;
      }

      private a(vu $$0) {
         this.g = $$0;
      }

      @Nullable
      public vu a() {
         return this.g;
      }
   }
}
