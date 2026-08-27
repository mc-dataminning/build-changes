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

public abstract class cka extends bqt {
   private static final Logger b = LogUtils.getLogger();
   public static final bqn bE = bqn.b;
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
   public static final esj bS = new esj(0.0, 0.6, 0.0);
   public static final bqd bT = bqd.b(0.6F, 1.8F).b(1.62F).a(bqc.a().a(bqb.b, bS));
   private static final Map<bre, bqd> c = ImmutableMap.builder()
      .put(bre.a, bT)
      .put(bre.c, aF)
      .put(bre.b, bqd.b(0.6F, 0.6F).b(0.4F))
      .put(bre.d, bqd.b(0.6F, 0.6F).b(0.4F))
      .put(bre.e, bqd.b(0.6F, 0.6F).b(0.4F))
      .put(bre.f, bqd.b(0.6F, 1.5F).b(1.27F).a(bqc.a().a(bqb.b, bS)))
      .put(bre.h, bqd.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final aja<Float> d = aje.a(cka.class, ajc.d);
   private static final aja<Integer> e = aje.a(cka.class, ajc.b);
   protected static final aja<Byte> bU = aje.a(cka.class, ajc.a);
   protected static final aja<Byte> bV = aje.a(cka.class, ajc.a);
   protected static final aja<to> bW = aje.a(cka.class, ajc.s);
   protected static final aja<to> bX = aje.a(cka.class, ajc.s);
   private long f;
   final cjz g = new cjz(this);
   protected coi bY = new coi();
   public final cnx bZ;
   public cmw ca;
   protected cms cb = new cms();
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
   private int cv;
   protected boolean cm;
   private final cjx cw = new cjx();
   public int cn;
   public int co;
   public float cp;
   protected int cq;
   protected final float cr = 0.02F;
   private int cx;
   private final GameProfile cz;
   private boolean cA;
   private crs cB = crs.i;
   private final cro cC = this.k();
   private Optional<im> cD = Optional.empty();
   @Nullable
   public cko cs;
   protected float ct;
   @Nullable
   public Double cu;

   public cka(czg $$0, id $$1, float $$2, GameProfile $$3) {
      super(bqg.bx, $$0);
      this.a_($$3.getId());
      this.cz = $$3;
      this.bZ = new cnx(this.g, !$$0.B, this);
      this.ca = this.bZ;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bj = 180.0F;
   }

   public boolean a(czg $$0, id $$1, czd $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == czd.d) {
         return true;
      } else if (this.gl()) {
         return false;
      } else {
         crs $$3 = this.eU();
         return $$3.d() || !$$3.b(new dpm($$0, $$1, false));
      }
   }

   public static brz.a fN() {
      return bqt.dR().a(bsa.c, 1.0).a(bsa.r, 0.1F).a(bsa.e).a(bsa.o).a(bsa.g, 4.5).a(bsa.h, 3.0).a(bsa.f);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(bU, (byte)0);
      $$0.a(bV, (byte)bE.a());
      $$0.a(bW, new to());
      $$0.a(bX, new to());
   }

   @Override
   public void l() {
      this.af = this.N_();
      if (this.N_()) {
         this.c(false);
      }

      if (this.cf > 0) {
         this.cf--;
      }

      if (this.fI()) {
         this.cv++;
         if (this.cv > 100) {
            this.cv = 100;
         }

         if (!this.dM().B && this.dM().Q()) {
            this.a(false, true);
         }
      } else if (this.cv > 0) {
         this.cv++;
         if (this.cv >= 110) {
            this.cv = 0;
         }
      }

      this.fR();
      super.l();
      if (!this.dM().B && this.ca != null && !this.ca.a(this)) {
         this.r();
         this.ca = this.bZ;
      }

      this.v();
      if (!this.dM().B) {
         this.cb.a(this);
         this.a(auz.k);
         this.a(auz.l);
         if (this.bA()) {
            this.a(auz.m);
         }

         if (this.bV()) {
            this.a(auz.o);
         }

         if (!this.fI()) {
            this.a(auz.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = axm.a(this.dr(), -2.9999999E7, 2.9999999E7);
      double $$2 = axm.a(this.dx(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dr() || $$2 != this.dx()) {
         this.a_($$1, this.dt(), $$2);
      }

      this.aS++;
      crs $$3 = this.eU();
      if (!crs.a(this.cB, $$3)) {
         if (!crs.b(this.cB, $$3)) {
            this.gt();
         }

         this.cB = $$3.r();
      }

      this.u();
      this.cC.a();
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
      this.cm = this.a(avj.a);
      return this.cm;
   }

   private void u() {
      crs $$0 = this.d(bqh.f);
      if ($$0.a(crv.on) && !this.a(avj.a)) {
         this.b(new bpm(bpo.m, 200, 0, false, false, true));
      }
   }

   protected cro k() {
      return new cro();
   }

   private void v() {
      this.cg = this.cj;
      this.ch = this.ck;
      this.ci = this.cl;
      double $$0 = this.dr() - this.cj;
      double $$1 = this.dt() - this.ck;
      double $$2 = this.dx() - this.cl;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cj = this.dr();
         this.cg = this.cj;
      }

      if ($$2 > 10.0) {
         this.cl = this.dx();
         this.ci = this.cl;
      }

      if ($$1 > 10.0) {
         this.ck = this.dt();
         this.ch = this.ck;
      }

      if ($$0 < -10.0) {
         this.cj = this.dr();
         this.cg = this.cj;
      }

      if ($$2 < -10.0) {
         this.cl = this.dx();
         this.ci = this.cl;
      }

      if ($$1 < -10.0) {
         this.ck = this.dt();
         this.ch = this.ck;
      }

      this.cj += $$0 * 0.25;
      this.cl += $$2 * 0.25;
      this.ck += $$1 * 0.25;
   }

   protected void fS() {
      if (this.h(bre.d)) {
         bre $$0;
         if (this.fB()) {
            $$0 = bre.b;
         } else if (this.fI()) {
            $$0 = bre.c;
         } else if (this.bZ()) {
            $$0 = bre.d;
         } else if (this.fo()) {
            $$0 = bre.e;
         } else if (this.bS() && !this.cw.b) {
            $$0 = bre.f;
         } else {
            $$0 = bre.a;
         }

         bre $$6;
         if (this.N_() || this.bO() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bre.f)) {
            $$6 = bre.f;
         } else {
            $$6 = bre.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bre $$0) {
      return this.dM().a(this, this.a($$0).a(this.dk()).h(1.0E-7));
   }

   @Override
   public int ax() {
      return Math.max(1, this.dM().aa().c(this.cw.a ? czc.F : czc.E));
   }

   @Override
   protected aun aN() {
      return auo.tY;
   }

   @Override
   protected aun aO() {
      return auo.tW;
   }

   @Override
   protected aun aP() {
      return auo.tX;
   }

   @Override
   public int bM() {
      return 10;
   }

   @Override
   public void a(aun $$0, float $$1, float $$2) {
      this.dM().a(this, this.dr(), this.dt(), this.dx(), $$0, this.db(), $$1, $$2);
   }

   public void a(aun $$0, aup $$1, float $$2, float $$3) {
   }

   @Override
   public aup db() {
      return aup.h;
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
         this.cA = false;
      } else if ($$0 == 22) {
         this.cA = true;
      } else if ($$0 == 43) {
         this.a(kn.f);
      } else {
         super.b($$0);
      }
   }

   private void a(kl $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dM().a($$0, this.d(1.0), this.du() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected void r() {
      this.ca = this.bZ;
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
         this.cd = this.ce;
         this.ce = 0.0F;
      }
   }

   @Override
   protected void fn() {
      super.fn();
      this.eS();
      this.aZ = this.dC();
   }

   @Override
   public void n_() {
      if (this.cc > 0) {
         this.cc--;
      }

      if (this.dM().ak() == boc.a && this.dM().aa().b(czc.k)) {
         if (this.ex() < this.eO() && this.ah % 20 == 0) {
            this.c(1.0F);
         }

         if (this.cb.c() && this.ah % 10 == 0) {
            this.cb.a(this.cb.a() + 1);
         }
      }

      this.g.j();
      this.cd = this.ce;
      super.n_();
      this.y((float)this.g(bsa.r));
      float $$1;
      if (this.aC() && !this.ey() && !this.bZ()) {
         $$1 = Math.min(0.1F, (float)this.dp().h());
      } else {
         $$1 = 0.0F;
      }

      this.ce = this.ce + ($$1 - this.ce) * 0.4F;
      if (this.ex() > 0.0F && !this.N_()) {
         ese $$2;
         if (this.bO() && !this.cZ().dH()) {
            $$2 = this.cH().b(this.cZ().cH()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cH().c(1.0, 0.5, 1.0);
         }

         List<bqa> $$4 = this.dM().a_(this, $$2);
         List<bqa> $$5 = Lists.newArrayList();

         for (bqa $$6 : $$4) {
            if ($$6.ai() == bqg.M) {
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
      if (!this.dM().B && (this.ab > 0.5F || this.bc()) || this.cw.b || this.fI() || this.aA) {
         this.gn();
      }
   }

   private void c(@Nullable to $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dM().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bqg.a($$1).filter($$0x -> $$0x == bqg.aw).ifPresent($$0x -> {
            if (!ccy.a(this.dM(), this)) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), ccy.a(this.dM(), this.dM().z), this.db(), 1.0F, ccy.a(this.dM().z));
            }
         });
      }
   }

   private void d(bqa $$0) {
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
   public void a(boy $$0) {
      super.a($$0);
      this.ar();
      if (!this.N_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-axm.b((this.eG() + this.dC()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-axm.a((this.eG() + this.dC()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(auz.N);
      this.a(auz.i.b(auz.m));
      this.a(auz.i.b(auz.n));
      this.aA();
      this.a_(false);
      this.a(Optional.of(im.a(this.dM().ae(), this.dm())));
   }

   @Override
   protected void eA() {
      super.eA();
      if (!this.dM().aa().b(czc.d)) {
         this.fU();
         this.g.k();
      }
   }

   protected void fU() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         crs $$1 = this.g.a($$0);
         if (!$$1.d() && cxa.g($$1)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected aun d(boy $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected aun o_() {
      return auo.tO;
   }

   @Nullable
   public cgk a(crs $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cgk a(crs $$0, boolean $$1, boolean $$2) {
      if ($$0.d()) {
         return null;
      } else {
         if (this.dM().B) {
            this.a(boe.a);
         }

         double $$3 = this.dv() - 0.3F;
         cgk $$4 = new cgk(this.dM(), this.dr(), $$3, this.dx(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ag.i() * 0.5F;
            float $$6 = this.ag.i() * (float) (Math.PI * 2);
            $$4.o((double)(-axm.a($$6) * $$5), 0.2F, (double)(axm.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = axm.a(this.dE() * (float) (Math.PI / 180.0));
            float $$9 = axm.b(this.dE() * (float) (Math.PI / 180.0));
            float $$10 = axm.a(this.dC() * (float) (Math.PI / 180.0));
            float $$11 = axm.b(this.dC() * (float) (Math.PI / 180.0));
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

   public float d(dpi $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = cxa.g(this);
         crs $$3 = this.eU();
         if ($$2 > 0 && !$$3.d()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bpn.a(this)) {
         $$1 *= 1.0F + (float)(bpn.b(this) + 1) * 0.2F;
      }

      if (this.b(bpo.d)) {
         $$1 *= switch (this.c(bpo.d).d()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.g(bsa.f);
      if (this.a(avj.a) && !cxa.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aC()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dpi $$0) {
      return !$$0.y() || this.g.f().b($$0);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.a_(this.cz.getId());
      tu $$1 = $$0.c("Inventory", 10);
      this.g.b($$1);
      this.g.l = $$0.h("SelectedItemSlot");
      this.cv = $$0.g("SleepTimer");
      this.cp = $$0.j("XpP");
      this.cn = $$0.h("XpLevel");
      this.co = $$0.h("XpTotal");
      this.cq = $$0.h("XpSeed");
      if (this.cq == 0) {
         this.cq = this.ag.f();
      }

      this.s($$0.h("Score"));
      this.cb.a($$0);
      this.cw.b($$0);
      this.f(bsa.r).a((double)this.cw.b());
      if ($$0.b("EnderItems", 9)) {
         this.bY.a($$0.c("EnderItems", 10), this.dO());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(im.b.parse(uc.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

      if ($$0.b("ignore_fall_damage_above_y", 6)) {
         this.cu = $$0.k("ignore_fall_damage_above_y");
      }
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      ud.e($$0);
      $$0.a("Inventory", this.g.a(new tu()));
      $$0.a("SelectedItemSlot", this.g.l);
      $$0.a("SleepTimer", (short)this.cv);
      $$0.a("XpP", this.cp);
      $$0.a("XpLevel", this.cn);
      $$0.a("XpTotal", this.co);
      $$0.a("XpSeed", this.cq);
      $$0.a("Score", this.fT());
      this.cb.b($$0);
      this.cw.a($$0);
      $$0.a("EnderItems", this.bY.a(this.dO()));
      if (!this.gq().g()) {
         $$0.a("ShoulderEntityLeft", this.gq());
      }

      if (!this.gr().g()) {
         $$0.a("ShoulderEntityRight", this.gr());
      }

      this.gy().flatMap($$0x -> im.b.encodeStart(uc.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cu != null) {
         $$0.a("ignore_fall_damage_above_y", this.cu);
      }
   }

   @Override
   public boolean b(boy $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(avg.o)) {
         return !this.dM().aa().b(czc.G);
      } else if ($$0.a(avg.n)) {
         return !this.dM().aa().b(czc.H);
      } else if ($$0.a(avg.j)) {
         return !this.dM().aa().b(czc.I);
      } else {
         return $$0.a(avg.p) ? !this.dM().aa().b(czc.J) : false;
      }
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cw.a && !$$0.a(avg.e)) {
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
               if (this.dM().ak() == boc.a) {
                  $$1 = 0.0F;
               }

               if (this.dM().ak() == boc.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dM().ak() == boc.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bqt $$0) {
      super.d($$0);
      if ($$0.fL()) {
         this.fV();
      }
   }

   @Override
   public boolean eq() {
      return !this.ga().a && super.eq();
   }

   public boolean a(cka $$0) {
      etp $$1 = this.cg();
      etp $$2 = $$0.cg();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(boy $$0, float $$1) {
      this.a($$0, $$1, new bqh[]{bqh.c, bqh.d, bqh.e, bqh.f});
   }

   @Override
   protected void c(boy $$0, float $$1) {
      this.a($$0, $$1, new bqh[]{bqh.f});
   }

   @Override
   protected void v(float $$0) {
      if (this.by.a(crv.vq)) {
         if (!this.dM().B) {
            this.b(auz.c.b(this.by.f()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + axm.d($$0);
            boe $$2 = this.ft();
            this.by.a($$1, this, d($$2));
            if (this.by.d()) {
               if ($$2 == boe.a) {
                  this.a(bqh.a, crs.i);
               } else {
                  this.a(bqh.b, crs.i);
               }

               this.by = crs.i;
               this.a(auo.wi, 0.8F, 0.8F + this.dM().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(boy $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fp(), 0.0F);
         this.A(this.fp() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(auz.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.C($$0.a());
            this.eM().a($$0, var7);
            this.t(this.ex() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(auz.J, Math.round(var7 * 10.0F));
            }

            this.a(dub.o);
         }
      }
   }

   @Override
   protected boolean dV() {
      return !this.cw.b && super.dV();
   }

   public boolean Y() {
      return false;
   }

   public void a(dny $$0, boolean $$1) {
   }

   public void a(cyh $$0) {
   }

   public void a(dmy $$0) {
   }

   public void a(dod $$0) {
   }

   public void a(dno $$0) {
   }

   public void a(cem $$0, bny $$1) {
   }

   public OptionalInt a(@Nullable boj $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, cyf $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(crs $$0, boe $$1) {
   }

   public bof a(bqa $$0, boe $$1) {
      if (this.N_()) {
         if ($$0 instanceof boj) {
            this.a((boj)$$0);
         }

         return bof.d;
      } else {
         crs $$2 = this.b($$1);
         crs $$3 = $$2.r();
         bof $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cw.d && $$2 == this.b($$1) && $$2.G() < $$3.G()) {
               $$2.e($$3.G());
            }

            return $$4;
         } else {
            if (!$$2.d() && $$0 instanceof bqt) {
               if (this.cw.d) {
                  $$2 = $$3;
               }

               bof $$5 = $$2.a(this, (bqt)$$0, $$1);
               if ($$5.a()) {
                  this.dM().a(dub.r, $$0.dk(), dub.a.a(this));
                  if ($$2.d() && !this.cw.d) {
                     this.a($$1, crs.i);
                  }

                  return $$5;
               }
            }

            return bof.d;
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
      return !this.cw.b;
   }

   @Override
   protected esj a(esj $$0, bqy $$1) {
      if (!this.cw.b && $$0.d <= 0.0 && ($$1 == bqy.a || $$1 == bqy.b) && this.fQ() && this.z()) {
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

         $$0 = new esj($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean z() {
      return this.aC() || this.ab < this.dG() && !this.dM().a(this, this.cH().d(0.0, (double)(this.ab - this.dG()), 0.0));
   }

   public void e(bqa $$0) {
      if ($$0.cq()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.g(bsa.c);
            float $$2 = cxa.a(this.eU(), $$0.ai());
            float $$3 = this.D(0.5F);
            $$1 *= 0.2F + $$3 * $$3 * 0.8F;
            $$2 *= $$3;
            this.gt();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$4 = $$3 > 0.9F;
               boolean $$5 = false;
               int $$6 = 0;
               $$6 += cxa.c(this);
               if (this.bY() && $$4) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), auo.tG, this.db(), 1.0F, 1.0F);
                  $$6++;
                  $$5 = true;
               }

               boolean $$7 = $$4 && this.ab > 0.0F && !this.aC() && !this.q_() && !this.bc() && !this.b(bpo.o) && !this.bO() && $$0 instanceof bqt;
               $$7 = $$7 && !this.bY();
               if ($$7) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$8 = false;
               double $$9 = (double)(this.Y - this.X);
               if ($$4 && !$$7 && !$$5 && this.aC() && $$9 < (double)this.fk()) {
                  crs $$10 = this.b(boe.a);
                  if ($$10.f() instanceof ctc) {
                     $$8 = true;
                  }
               }

               float $$11 = 0.0F;
               boolean $$12 = false;
               int $$13 = cxa.d(this);
               if ($$0 instanceof bqt) {
                  $$11 = ((bqt)$$0).ex();
                  if ($$13 > 0 && !$$0.bN()) {
                     $$12 = true;
                     $$0.g(1);
                  }
               }

               esj $$14 = $$0.dp();
               boolean $$15 = $$0.a(this.dN().a(this), $$1);
               if ($$15) {
                  if ($$6 > 0) {
                     if ($$0 instanceof bqt) {
                        ((bqt)$$0)
                           .q(
                              (double)((float)$$6 * 0.5F),
                              (double)axm.a(this.dC() * (float) (Math.PI / 180.0)),
                              (double)(-axm.b(this.dC() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-axm.a(this.dC() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F),
                           0.1,
                           (double)(axm.b(this.dC() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F)
                        );
                     }

                     this.g(this.dp().d(0.6, 1.0, 0.6));
                     this.g(false);
                  }

                  if ($$8) {
                     float $$16 = 1.0F + cxa.a(this) * $$1;

                     for (bqt $$18 : this.dM().a(bqt.class, $$0.cH().c(1.0, 0.25, 1.0))) {
                        if ($$18 != this && $$18 != $$0 && !this.s($$18) && (!($$18 instanceof cga) || !((cga)$$18).z()) && this.g((bqa)$$18) < 9.0) {
                           $$18.q(0.4F, (double)axm.a(this.dC() * (float) (Math.PI / 180.0)), (double)(-axm.b(this.dC() * (float) (Math.PI / 180.0))));
                           $$18.a(this.dN().a(this), $$16);
                        }
                     }

                     this.dM().a(null, this.dr(), this.dt(), this.dx(), auo.tJ, this.db(), 1.0F, 1.0F);
                     this.fW();
                  }

                  if ($$0 instanceof apv && $$0.T) {
                     ((apv)$$0).d.b(new aeg($$0));
                     $$0.T = false;
                     $$0.g($$14);
                  }

                  if ($$7) {
                     this.dM().a(null, this.dr(), this.dt(), this.dx(), auo.tF, this.db(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$7 && !$$8) {
                     if ($$4) {
                        this.dM().a(null, this.dr(), this.dt(), this.dx(), auo.tI, this.db(), 1.0F, 1.0F);
                     } else {
                        this.dM().a(null, this.dr(), this.dt(), this.dx(), auo.tK, this.db(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.c($$0);
                  }

                  this.A($$0);
                  if ($$0 instanceof bqt) {
                     cxa.a((bqt)$$0, this);
                  }

                  cxa.b(this, $$0);
                  crs $$19 = this.eU();
                  bqa $$20 = $$0;
                  if ($$0 instanceof cfc) {
                     $$20 = ((cfc)$$0).b;
                  }

                  if (!this.dM().B && !$$19.d() && $$20 instanceof bqt) {
                     $$19.a((bqt)$$20, this);
                     if ($$19.d()) {
                        this.a(boe.a, crs.i);
                     }
                  }

                  if ($$0 instanceof bqt) {
                     float $$21 = $$11 - ((bqt)$$0).ex();
                     this.a(auz.G, Math.round($$21 * 10.0F));
                     if ($$13 > 0) {
                        $$0.g($$13 * 4);
                     }

                     if (this.dM() instanceof apu && $$21 > 2.0F) {
                        int $$22 = (int)((double)$$21 * 0.5);
                        ((apu)this.dM()).a(kn.h, $$0.dr(), $$0.e(0.5), $$0.dx(), $$22, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.C(0.1F);
               } else {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), auo.tH, this.db(), 1.0F, 1.0F);
                  if ($$12) {
                     $$0.aA();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(bqt $$0) {
      this.e($$0);
   }

   public void fV() {
      this.gu().a(crv.vq, 100);
      this.fy();
      this.dM().a(this, (byte)30);
   }

   @Override
   public void b(bqa $$0) {
   }

   public void c(bqa $$0) {
   }

   public void fW() {
      double $$0 = (double)(-axm.a(this.dC() * (float) (Math.PI / 180.0)));
      double $$1 = (double)axm.b(this.dC() * (float) (Math.PI / 180.0));
      if (this.dM() instanceof apu) {
         ((apu)this.dM()).a(kn.ah, this.dr() + $$0, this.e(0.5), this.dx() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fX() {
   }

   @Override
   public void a(bqa.c $$0) {
      super.a($$0);
      this.bZ.b(this);
      if (this.ca != null && this.gb()) {
         this.s();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile fY() {
      return this.cz;
   }

   public cjz fZ() {
      return this.g;
   }

   public cjx ga() {
      return this.cw;
   }

   @Override
   public boolean fM() {
      return this.cw.d;
   }

   public void a(crs $$0, crs $$1, cne $$2) {
   }

   public boolean gb() {
      return this.ca != this.bZ;
   }

   public Either<cka.a, ayo> a(id $$0) {
      this.b($$0);
      this.cv = 0;
      return Either.right(ayo.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fJ();
      if (this.dM() instanceof apu && $$1) {
         ((apu)this.dM()).e();
      }

      this.cv = $$0 ? 0 : 100;
   }

   @Override
   public void fJ() {
      this.a(true, true);
   }

   public static Optional<esj> a(apu $$0, id $$1, float $$2, boolean $$3, boolean $$4) {
      dpi $$5 = $$0.a_($$1);
      dch $$6 = $$5.b();
      if ($$6 instanceof dio && ($$3 || $$5.c(dio.d) > 0) && dio.a($$0)) {
         Optional<esj> $$7 = dio.a(bqg.bx, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dio.d, Integer.valueOf($$5.c(dio.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof dca && dca.a($$0)) {
         return dca.a(bqg.bx, $$0, $$1, $$5.c(dca.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dpi $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new esj((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean gc() {
      return this.fI() && this.cv >= 100;
   }

   public int gd() {
      return this.cv;
   }

   public void a(wi $$0, boolean $$1) {
   }

   public void a(ajv $$0) {
      this.b(auz.i.b($$0));
   }

   public void a(ajv $$0, int $$1) {
      this.a(auz.i.b($$0), $$1);
   }

   public void b(auv<?> $$0) {
      this.a($$0, 1);
   }

   public void a(auv<?> $$0, int $$1) {
   }

   public void a(auv<?> $$0) {
   }

   public int a(Collection<cvu<?>> $$0) {
      return 0;
   }

   public void a(cvu<?> $$0, List<crs> $$1) {
   }

   public void b(List<ajv> $$0) {
   }

   public int b(Collection<cvu<?>> $$0) {
      return 0;
   }

   @Override
   public void fg() {
      super.fg();
      this.a(auz.E);
      if (this.bY()) {
         this.C(0.2F);
      } else {
         this.C(0.05F);
      }
   }

   @Override
   public void a(esj $$0) {
      if (this.bZ() && !this.bO()) {
         double $$1 = this.bI().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bm || !this.dM().a_(id.a(this.dr(), this.dt() + 1.0 - 0.1, this.dx())).u().c()) {
            esj $$3 = this.dp();
            this.g($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cw.b && !this.bO()) {
         double $$4 = this.dp().d;
         super.a($$0);
         esj $$5 = this.dp();
         this.o($$5.c, $$4 * 0.6, $$5.e);
         this.n();
         this.b(7, false);
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bi() {
      if (this.cw.b) {
         this.h(false);
      } else {
         super.bi();
      }
   }

   protected boolean h(id $$0) {
      return !this.dM().a_($$0).o(this.dM(), $$0);
   }

   @Override
   public float fk() {
      return (float)this.g(bsa.r);
   }

   @Override
   public boolean a(float $$0, float $$1, boy $$2) {
      if (this.cw.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(auz.t, (int)Math.round((double)$$0 * 100.0));
         }

         if (this.cu != null) {
            float $$3 = this.cu.floatValue();
            this.cu = null;
            return (double)$$3 < this.dt() ? false : super.a($$3 - (float)this.dt(), $$1, $$2);
         } else {
            return super.a($$0, $$1, $$2);
         }
      }
   }

   public boolean ge() {
      if (!this.aC() && !this.fB() && !this.bc() && !this.b(bpo.y)) {
         crs $$0 = this.d(bqh.e);
         if ($$0.a(crv.nS) && cqo.j($$0)) {
            this.gf();
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
   protected void b(id $$0, dpi $$1) {
      if (this.bc()) {
         this.aR();
         this.b($$1);
      } else {
         id $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dpi $$3 = this.dM().a_($$2);
            if ($$3.a(ave.bo)) {
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
   public bqt.a eI() {
      return new bqt.a(auo.tV, auo.tL);
   }

   @Override
   public boolean a(apu $$0, bqt $$1) {
      this.b(auz.g.b($$1.ai()));
      return true;
   }

   @Override
   public void a(dpi $$0, esj $$1) {
      if (!this.cw.b) {
         super.a($$0, $$1);
      }

      this.cu = null;
   }

   public void d(int $$0) {
      this.t($$0);
      this.cp = this.cp + (float)$$0 / (float)this.gi();
      this.co = axm.a(this.co + $$0, 0, Integer.MAX_VALUE);

      while (this.cp < 0.0F) {
         float $$1 = this.cp * (float)this.gi();
         if (this.cn > 0) {
            this.c(-1);
            this.cp = 1.0F + $$1 / (float)this.gi();
         } else {
            this.c(-1);
            this.cp = 0.0F;
         }
      }

      while (this.cp >= 1.0F) {
         this.cp = (this.cp - 1.0F) * (float)this.gi();
         this.c(1);
         this.cp = this.cp / (float)this.gi();
      }
   }

   public int gh() {
      return this.cq;
   }

   @Override
   public void a(crs $$0, int $$1) {
      this.cn -= $$1;
      if (this.cn < 0) {
         this.cn = 0;
         this.cp = 0.0F;
         this.co = 0;
      }

      this.cq = this.ag.f();
   }

   public void c(int $$0) {
      this.cn += $$0;
      if (this.cn < 0) {
         this.cn = 0;
         this.cp = 0.0F;
         this.co = 0;
      }

      if ($$0 > 0 && this.cn % 5 == 0 && (float)this.cx < (float)this.ah - 100.0F) {
         float $$1 = this.cn > 30 ? 1.0F : (float)this.cn / 30.0F;
         this.dM().a(null, this.dr(), this.dt(), this.dx(), auo.tU, this.db(), $$1 * 0.75F, 1.0F);
         this.cx = this.ah;
      }
   }

   public int gi() {
      if (this.cn >= 30) {
         return 112 + (this.cn - 30) * 9;
      } else {
         return this.cn >= 15 ? 37 + (this.cn - 15) * 5 : 7 + this.cn * 2;
      }
   }

   public void C(float $$0) {
      if (!this.cw.a) {
         if (!this.dM().B) {
            this.cb.a($$0);
         }
      }
   }

   public Optional<cjg> aa() {
      return Optional.empty();
   }

   public cms gj() {
      return this.cb;
   }

   public boolean s(boolean $$0) {
      return this.cw.a || $$0 || this.cb.c();
   }

   public boolean gk() {
      return this.ex() > 0.0F && this.ex() < this.eO();
   }

   public boolean gl() {
      return this.cw.e;
   }

   public boolean a(id $$0, ij $$1, crs $$2) {
      if (this.cw.e) {
         return true;
      } else {
         id $$3 = $$0.a($$1.g());
         dpm $$4 = new dpm(this.dM(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   public int eg() {
      if (!this.dM().aa().b(czc.d) && !this.N_()) {
         int $$0 = this.cn * 7;
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
   protected bqa.b aZ() {
      return this.cw.b || this.aC() && this.bV() ? bqa.b.a : bqa.b.d;
   }

   public void y() {
   }

   @Override
   public wi ad() {
      return wi.b(this.cz.getName());
   }

   public coi gm() {
      return this.bY;
   }

   @Override
   public crs d(bqh $$0) {
      if ($$0 == bqh.a) {
         return this.g.f();
      } else if ($$0 == bqh.b) {
         return this.g.k.get(0);
      } else {
         return $$0.a() == bqh.a.b ? this.g.j.get($$0.b()) : crs.i;
      }
   }

   @Override
   protected boolean a(bqh $$0) {
      return $$0.a() == bqh.a.b;
   }

   @Override
   public void a(bqh $$0, crs $$1) {
      this.e($$1);
      if ($$0 == bqh.a) {
         this.a($$0, this.g.i.set(this.g.l, $$1), $$1);
      } else if ($$0 == bqh.b) {
         this.a($$0, this.g.k.set(0, $$1), $$1);
      } else if ($$0.a() == bqh.a.b) {
         this.a($$0, this.g.j.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(crs $$0) {
      return this.g.e($$0);
   }

   @Override
   public Iterable<crs> eX() {
      return Lists.newArrayList(new crs[]{this.eU(), this.eV()});
   }

   @Override
   public Iterable<crs> eW() {
      return this.g.j;
   }

   @Override
   public boolean c(bqh $$0) {
      return $$0 != bqh.g;
   }

   public boolean h(to $$0) {
      if (this.bO() || !this.aC() || this.bc() || this.aA) {
         return false;
      } else if (this.gq().g()) {
         this.i($$0);
         this.f = this.dM().Y();
         return true;
      } else if (this.gr().g()) {
         this.j($$0);
         this.f = this.dM().Y();
         return true;
      } else {
         return false;
      }
   }

   protected void gn() {
      if (this.f + 20L < this.dM().Y()) {
         this.k(this.gq());
         this.i(new to());
         this.k(this.gr());
         this.j(new to());
      }
   }

   private void k(to $$0) {
      if (!this.dM().B && !$$0.g()) {
         bqg.a($$0, this.dM()).ifPresent($$0x -> {
            if ($$0x instanceof brp) {
               ((brp)$$0x).b(this.ay);
            }

            $$0x.a_(this.dr(), this.dt() + 0.7F, this.dx());
            ((apu)this.dM()).c($$0x);
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
      return !this.cw.b && !this.N_() && super.bZ();
   }

   public abstract boolean f();

   @Override
   public boolean cz() {
      return !this.cw.b;
   }

   public etn go() {
      return this.dM().L();
   }

   @Override
   public wi O_() {
      ww $$0 = eti.a(this.cg(), this.ad());
      return this.a($$0);
   }

   private ww a(ww $$0) {
      String $$1 = this.fY().getName();
      return $$0.a($$1x -> $$1x.a(new wg(wg.a.d, "/tell " + $$1 + " ")).a(this.cG()).a($$1));
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

   public boolean a(ckb $$0) {
      return (this.an().a(bU) & $$0.a()) == $$0.a();
   }

   @Override
   public brk a_(int $$0) {
      if ($$0 == 499) {
         return new brk() {
            @Override
            public crs a() {
               return cka.this.ca.g();
            }

            @Override
            public boolean a(crs $$0) {
               cka.this.ca.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new brk() {
               @Override
               public crs a() {
                  return cka.this.bZ.q().a($$1);
               }

               @Override
               public boolean a(crs $$0) {
                  cka.this.bZ.q().a($$1, $$0);
                  cka.this.bZ.a(cka.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.i.size()) {
            return brk.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.bY.b() ? brk.a(this.bY, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gp() {
      return this.cA;
   }

   public void t(boolean $$0) {
      this.cA = $$0;
   }

   @Override
   public void i(int $$0) {
      super.i(this.cw.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bqn fr() {
      return this.an.a(bV) == 0 ? bqn.a : bqn.b;
   }

   public void a(bqn $$0) {
      this.an.a(bV, (byte)($$0 == bqn.a ? 0 : 1));
   }

   public to gq() {
      return this.an.a(bW);
   }

   protected void i(to $$0) {
      this.an.a(bW, $$0);
   }

   public to gr() {
      return this.an.a(bX);
   }

   protected void j(to $$0) {
      this.an.a(bX, $$0);
   }

   public float gs() {
      return (float)(1.0 / this.g(bsa.e) * 20.0);
   }

   public float D(float $$0) {
      return axm.a(((float)this.aS + $$0) / this.gs(), 0.0F, 1.0F);
   }

   public void gt() {
      this.aS = 0;
   }

   public cro gu() {
      return this.cC;
   }

   @Override
   protected float aL() {
      return !this.cw.b && !this.fB() ? super.aL() : 1.0F;
   }

   public float gv() {
      return (float)this.g(bsa.o);
   }

   public boolean gw() {
      return this.cw.d && this.F() >= 2;
   }

   @Override
   public boolean f(crs $$0) {
      bqh $$1 = bqv.h($$0);
      return this.d($$1).d();
   }

   @Override
   public bqd e(bre $$0) {
      return c.getOrDefault($$0, bT);
   }

   @Override
   public ImmutableList<bre> fF() {
      return ImmutableList.of(bre.a, bre.f, bre.d);
   }

   @Override
   public crs g(crs $$0) {
      if (!($$0.f() instanceof csi)) {
         return crs.i;
      } else {
         Predicate<crs> $$1 = ((csi)$$0.f()).d();
         crs $$2 = csi.a(this, $$1);
         if (!$$2.d()) {
            return $$2;
         } else {
            $$1 = ((csi)$$0.f()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               crs $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cw.d ? new crs(crv.ou) : crs.i;
         }
      }
   }

   @Override
   public crs a(czg $$0, crs $$1) {
      this.gj().a($$1.f(), $$1);
      this.b(auz.c.b($$1.f()));
      $$0.a(null, this.dr(), this.dt(), this.dx(), auo.tN, aup.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof apv) {
         am.A.a((apv)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dpi $$0) {
      return this.cw.b || super.c($$0);
   }

   @Override
   public esj q(float $$0) {
      double $$1 = 0.22 * (this.fr() == bqn.b ? -1.0 : 1.0);
      float $$2 = axm.i($$0 * 0.5F, this.dE(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = axm.i($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      if (this.fB() || this.fo()) {
         esj $$4 = this.f($$0);
         esj $$5 = this.dp();
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

         return this.l($$0).e(new esj($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.ca()) {
         return this.l($$0).e(new esj($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cH().c() - 1.0;
         double $$13 = this.bX() ? -0.2 : 0.07;
         return this.l($$0).e(new esj($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dL() {
      return true;
   }

   public boolean gx() {
      return this.fs() && this.fu().a(crv.qW);
   }

   @Override
   public boolean dK() {
      return false;
   }

   public Optional<im> gy() {
      return this.cD;
   }

   public void a(Optional<im> $$0) {
      this.cD = $$0;
   }

   @Override
   public float eG() {
      return this.ct;
   }

   @Override
   public void m(float $$0) {
      super.m($$0);
      this.ct = $$0;
   }

   @Override
   public boolean dF() {
      return true;
   }

   @Override
   protected float fj() {
      if (this.cw.b && !this.bO()) {
         return this.bY() ? this.cw.a() * 2.0F : this.cw.a();
      } else {
         return this.bY() ? 0.025999999F : 0.02F;
      }
   }

   public double gz() {
      return this.g(bsa.g);
   }

   public double gA() {
      return this.g(bsa.h);
   }

   public boolean b(bqa $$0, double $$1) {
      return $$0.dH() ? false : this.a($$0.cH(), $$1);
   }

   public boolean a(ese $$0, double $$1) {
      double $$2 = this.gA() + $$1;
      return $$0.e(this.bu()) < $$2 * $$2;
   }

   public boolean a(id $$0, double $$1) {
      double $$2 = this.gz() + $$1;
      return new ese($$0).e(this.bu()) < $$2 * $$2;
   }

   public static enum a {
      a,
      b(wi.c("block.minecraft.bed.no_sleep")),
      c(wi.c("block.minecraft.bed.too_far_away")),
      d(wi.c("block.minecraft.bed.obstructed")),
      e,
      f(wi.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final wi g;

      private a() {
         this.g = null;
      }

      private a(wi $$0) {
         this.g = $$0;
      }

      @Nullable
      public wi a() {
         return this.g;
      }
   }
}
