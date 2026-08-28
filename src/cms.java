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

public abstract class cms extends btk {
   private static final Logger b = LogUtils.getLogger();
   public static final bte bF = bte.b;
   public static final int bG = 0;
   public static final int bH = 20;
   public static final int bI = 100;
   public static final int bJ = 10;
   public static final int bK = 200;
   public static final int bL = 499;
   public static final int bM = 500;
   public static final float bN = 4.5F;
   public static final float bO = 3.0F;
   public static final float bP = 1.5F;
   public static final float bQ = 0.6F;
   public static final float bR = 0.6F;
   public static final float bS = 1.62F;
   public static final evm bT = new evm(0.0, 0.6, 0.0);
   public static final bss bU = bss.b(0.6F, 1.8F).b(1.62F).a(bsr.a().a(bsq.b, bT));
   private static final Map<btw, bss> c = ImmutableMap.builder()
      .put(btw.a, bU)
      .put(btw.c, aG)
      .put(btw.b, bss.b(0.6F, 0.6F).b(0.4F))
      .put(btw.d, bss.b(0.6F, 0.6F).b(0.4F))
      .put(btw.e, bss.b(0.6F, 0.6F).b(0.4F))
      .put(btw.f, bss.b(0.6F, 1.5F).b(1.27F).a(bsr.a().a(bsq.b, bT)))
      .put(btw.h, bss.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final akg<Float> d = akk.a(cms.class, aki.d);
   private static final akg<Integer> e = akk.a(cms.class, aki.b);
   protected static final akg<Byte> bV = akk.a(cms.class, aki.a);
   protected static final akg<Byte> bW = akk.a(cms.class, aki.a);
   protected static final akg<ur> bX = akk.a(cms.class, aki.t);
   protected static final akg<ur> bY = akk.a(cms.class, aki.t);
   private long f;
   final cmr g = new cmr(this);
   protected crb bZ = new crb();
   public final cqq ca;
   public cpp cb;
   protected cpl cc = new cpl();
   protected int cd;
   public float ce;
   public float cf;
   public int cg;
   public double ch;
   public double ci;
   public double cj;
   public double ck;
   public double cl;
   public double cm;
   private int cz;
   protected boolean cn;
   private final cmp cA = new cmp();
   public int co;
   public int cp;
   public float cq;
   protected int cr;
   protected final float cs = 0.02F;
   private int cB;
   private final GameProfile cC;
   private boolean cD;
   private cuk cE = cuk.l;
   private final cug cF = this.k();
   private Optional<jh> cG = Optional.empty();
   @Nullable
   public cng ct;
   protected float cu;
   @Nullable
   public evm cv;
   @Nullable
   public bsp cw;
   public boolean cx;

   public cms(dbt $$0, iz $$1, float $$2, GameProfile $$3) {
      super(bsv.by, $$0);
      this.a_($$3.getId());
      this.cC = $$3;
      this.ca = new cqq(this.g, !$$0.B, this);
      this.cb = this.ca;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bk = 180.0F;
   }

   public boolean a(dbt $$0, iz $$1, dbq $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dbq.d) {
         return true;
      } else if (this.go()) {
         return false;
      } else {
         cuk $$3 = this.eX();
         return $$3.e() || !$$3.b(new dsb($$0, $$1, false));
      }
   }

   public static bur.a fQ() {
      return btk.dU().a(bus.c, 1.0).a(bus.r, 0.1F).a(bus.e).a(bus.o).a(bus.g, 4.5).a(bus.h, 3.0).a(bus.f);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(bV, (byte)0);
      $$0.a(bW, (byte)bF.a());
      $$0.a(bX, new ur());
      $$0.a(bY, new ur());
   }

   @Override
   public void l() {
      this.ag = this.N_();
      if (this.N_()) {
         this.d(false);
      }

      if (this.cg > 0) {
         this.cg--;
      }

      if (this.fL()) {
         this.cz++;
         if (this.cz > 100) {
            this.cz = 100;
         }

         if (!this.dP().B && this.dP().R()) {
            this.a(false, true);
         }
      } else if (this.cz > 0) {
         this.cz++;
         if (this.cz >= 110) {
            this.cz = 0;
         }
      }

      this.fU();
      super.l();
      if (!this.dP().B && this.cb != null && !this.cb.a(this)) {
         this.r();
         this.cb = this.ca;
      }

      this.v();
      if (!this.dP().B) {
         this.cc.a(this);
         this.a(awg.k);
         this.a(awg.l);
         if (this.bD()) {
            this.a(awg.m);
         }

         if (this.bY()) {
            this.a(awg.o);
         }

         if (!this.fL()) {
            this.a(awg.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = ayu.a(this.du(), -2.9999999E7, 2.9999999E7);
      double $$2 = ayu.a(this.dA(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.du() || $$2 != this.dA()) {
         this.a_($$1, this.dw(), $$2);
      }

      this.aT++;
      cuk $$3 = this.eX();
      if (!cuk.a(this.cE, $$3)) {
         if (!cuk.b(this.cE, $$3)) {
            this.gw();
         }

         this.cE = $$3.s();
      }

      this.u();
      this.cF.a();
      this.fV();
   }

   @Override
   protected float fo() {
      return this.fC() ? 15.0F : super.fo();
   }

   public boolean fR() {
      return this.bV();
   }

   protected boolean fS() {
      return this.bV();
   }

   protected boolean fT() {
      return this.bV();
   }

   protected boolean fU() {
      this.cn = this.a(awr.a);
      return this.cn;
   }

   private void u() {
      cuk $$0 = this.a(bsw.f);
      if ($$0.a(cun.oo) && !this.a(awr.a)) {
         this.b(new brx(brz.m, 200, 0, false, false, true));
      }
   }

   protected cug k() {
      return new cug();
   }

   private void v() {
      this.ch = this.ck;
      this.ci = this.cl;
      this.cj = this.cm;
      double $$0 = this.du() - this.ck;
      double $$1 = this.dw() - this.cl;
      double $$2 = this.dA() - this.cm;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.ck = this.du();
         this.ch = this.ck;
      }

      if ($$2 > 10.0) {
         this.cm = this.dA();
         this.cj = this.cm;
      }

      if ($$1 > 10.0) {
         this.cl = this.dw();
         this.ci = this.cl;
      }

      if ($$0 < -10.0) {
         this.ck = this.du();
         this.ch = this.ck;
      }

      if ($$2 < -10.0) {
         this.cm = this.dA();
         this.cj = this.cm;
      }

      if ($$1 < -10.0) {
         this.cl = this.dw();
         this.ci = this.cl;
      }

      this.ck += $$0 * 0.25;
      this.cm += $$2 * 0.25;
      this.cl += $$1 * 0.25;
   }

   protected void fV() {
      if (this.h(btw.d)) {
         btw $$0;
         if (this.fE()) {
            $$0 = btw.b;
         } else if (this.fL()) {
            $$0 = btw.c;
         } else if (this.cc()) {
            $$0 = btw.d;
         } else if (this.fr()) {
            $$0 = btw.e;
         } else if (this.bV() && !this.cA.b) {
            $$0 = btw.f;
         } else {
            $$0 = btw.a;
         }

         btw $$6;
         if (this.N_() || this.bR() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(btw.f)) {
            $$6 = btw.f;
         } else {
            $$6 = btw.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(btw $$0) {
      return this.dP().a(this, this.a($$0).a(this.dn()).h(1.0E-7));
   }

   @Override
   public int az() {
      return Math.max(1, this.dP().ab().c(this.cA.a ? dbp.F : dbp.E));
   }

   @Override
   protected avv aP() {
      return avw.ur;
   }

   @Override
   protected avv aQ() {
      return avw.up;
   }

   @Override
   protected avv aR() {
      return avw.uq;
   }

   @Override
   public int bP() {
      return 10;
   }

   @Override
   public void a(avv $$0, float $$1, float $$2) {
      this.dP().a(this, this.du(), this.dw(), this.dA(), $$0, this.de(), $$1, $$2);
   }

   public void a(avv $$0, avx $$1, float $$2, float $$3) {
   }

   @Override
   public avx de() {
      return avx.h;
   }

   @Override
   protected int df() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.x();
      } else if ($$0 == 23) {
         this.cD = false;
      } else if ($$0 == 22) {
         this.cD = true;
      } else {
         super.b($$0);
      }
   }

   protected void r() {
      this.cb = this.ca;
   }

   @Override
   protected void s() {
   }

   @Override
   public void t() {
      if (!this.dP().B && this.fS() && this.bR()) {
         this.ac();
         this.g(false);
      } else {
         super.t();
         this.ce = this.cf;
         this.cf = 0.0F;
      }
   }

   @Override
   protected void fq() {
      super.fq();
      this.eV();
      this.ba = this.dF();
   }

   @Override
   public void n_() {
      if (this.cd > 0) {
         this.cd--;
      }

      if (this.dP().al() == bqm.a && this.dP().ab().b(dbp.k)) {
         if (this.eA() < this.eR() && this.ai % 20 == 0) {
            this.c(1.0F);
         }

         if (this.cc.c() && this.ai % 10 == 0) {
            this.cc.a(this.cc.a() + 1);
         }
      }

      this.g.j();
      this.ce = this.cf;
      super.n_();
      this.y((float)this.g(bus.r));
      float $$1;
      if (this.aE() && !this.eB() && !this.cc()) {
         $$1 = Math.min(0.1F, (float)this.ds().h());
      } else {
         $$1 = 0.0F;
      }

      this.cf = this.cf + ($$1 - this.cf) * 0.4F;
      if (this.eA() > 0.0F && !this.N_()) {
         evh $$2;
         if (this.bR() && !this.dc().dK()) {
            $$2 = this.cK().b(this.dc().cK()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cK().c(1.0, 0.5, 1.0);
         }

         List<bsp> $$4 = this.dP().a_(this, $$2);
         List<bsp> $$5 = Lists.newArrayList();

         for (bsp $$6 : $$4) {
            if ($$6.ak() == bsv.M) {
               $$5.add($$6);
            } else if (!$$6.dK()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ac.a($$5, this.ah));
         }
      }

      this.c(this.gt());
      this.c(this.gu());
      if (!this.dP().B && (this.ac > 0.5F || this.be()) || this.cA.b || this.fL() || this.aB) {
         this.gq();
      }
   }

   private void c(@Nullable ur $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dP().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bsv.a($$1).filter($$0x -> $$0x == bsv.ax).ifPresent($$0x -> {
            if (!cfq.a(this.dP(), this)) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), cfq.a(this.dP(), this.dP().z), this.de(), 1.0F, cfq.a(this.dP().z));
            }
         });
      }
   }

   private void d(bsp $$0) {
      $$0.b_(this);
   }

   public int fW() {
      return this.ao.a(e);
   }

   public void s(int $$0) {
      this.ao.a(e, $$0);
   }

   public void t(int $$0) {
      int $$1 = this.fW();
      this.ao.a(e, $$1 + $$0);
   }

   public void u(int $$0) {
      this.bC = $$0;
      if (!this.dP().B) {
         this.gq();
         this.c(4, true);
      }
   }

   @Override
   public void a(bri $$0) {
      super.a($$0);
      this.at();
      if (!this.N_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-ayu.b((this.eJ() + this.dF()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-ayu.a((this.eJ() + this.dF()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(awg.N);
      this.a(awg.i.b(awg.m));
      this.a(awg.i.b(awg.n));
      this.aC();
      this.c(false);
      this.a(Optional.of(jh.a(this.dP().af(), this.dp())));
   }

   @Override
   protected void eD() {
      super.eD();
      if (!this.dP().ab().b(dbp.d)) {
         this.fX();
         this.g.k();
      }
   }

   protected void fX() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cuk $$1 = this.g.a($$0);
         if (!$$1.e() && czw.g($$1)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected avv d(bri $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected avv o_() {
      return avw.uh;
   }

   @Nullable
   public cjc a(cuk $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cjc a(cuk $$0, boolean $$1, boolean $$2) {
      if ($$0.e()) {
         return null;
      } else {
         if (this.dP().B) {
            this.a(bqo.a);
         }

         double $$3 = this.dy() - 0.3F;
         cjc $$4 = new cjc(this.dP(), this.du(), $$3, this.dA(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ah.i() * 0.5F;
            float $$6 = this.ah.i() * (float) (Math.PI * 2);
            $$4.o((double)(-ayu.a($$6) * $$5), 0.2F, (double)(ayu.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = ayu.a(this.dH() * (float) (Math.PI / 180.0));
            float $$9 = ayu.b(this.dH() * (float) (Math.PI / 180.0));
            float $$10 = ayu.a(this.dF() * (float) (Math.PI / 180.0));
            float $$11 = ayu.b(this.dF() * (float) (Math.PI / 180.0));
            float $$12 = this.ah.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.ah.i();
            $$4.o(
               (double)(-$$10 * $$9 * 0.3F) + Math.cos((double)$$12) * (double)$$13,
               (double)(-$$8 * 0.3F + 0.1F + (this.ah.i() - this.ah.i()) * 0.1F),
               (double)($$11 * $$9 * 0.3F) + Math.sin((double)$$12) * (double)$$13
            );
         }

         return $$4;
      }
   }

   public float d(drx $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = czw.g(this);
         cuk $$3 = this.eX();
         if ($$2 > 0 && !$$3.e()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bry.a(this)) {
         $$1 *= 1.0F + (float)(bry.b(this) + 1) * 0.2F;
      }

      if (this.b(brz.d)) {
         $$1 *= switch (this.c(brz.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.g(bus.f);
      if (this.a(awr.a) && !czw.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aE()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(drx $$0) {
      return !$$0.y() || this.g.f().b($$0);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a_(this.cC.getId());
      ux $$1 = $$0.c("Inventory", 10);
      this.g.b($$1);
      this.g.k = $$0.h("SelectedItemSlot");
      this.cz = $$0.g("SleepTimer");
      this.cq = $$0.j("XpP");
      this.co = $$0.h("XpLevel");
      this.cp = $$0.h("XpTotal");
      this.cr = $$0.h("XpSeed");
      if (this.cr == 0) {
         this.cr = this.ah.f();
      }

      this.s($$0.h("Score"));
      this.cc.a($$0);
      this.cA.b($$0);
      this.f(bus.r).a((double)this.cA.b());
      if ($$0.b("EnderItems", 9)) {
         this.bZ.a($$0.c("EnderItems", 10), this.dR());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(jh.b.parse(vf.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         evm.a.parse(vf.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.cv = $$0x);
      }

      this.cx = $$0.q("ignore_fall_damage_from_current_explosion");
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      vg.e($$0);
      $$0.a("Inventory", this.g.a(new ux()));
      $$0.a("SelectedItemSlot", this.g.k);
      $$0.a("SleepTimer", (short)this.cz);
      $$0.a("XpP", this.cq);
      $$0.a("XpLevel", this.co);
      $$0.a("XpTotal", this.cp);
      $$0.a("XpSeed", this.cr);
      $$0.a("Score", this.fW());
      this.cc.b($$0);
      this.cA.a($$0);
      $$0.a("EnderItems", this.bZ.a(this.dR()));
      if (!this.gt().g()) {
         $$0.a("ShoulderEntityLeft", this.gt());
      }

      if (!this.gu().g()) {
         $$0.a("ShoulderEntityRight", this.gu());
      }

      this.gB().flatMap($$0x -> jh.b.encodeStart(vf.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cv != null) {
         $$0.a("current_explosion_impact_pos", (vo)evm.a.encodeStart(vf.a, this.cv).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cx);
   }

   @Override
   public boolean b(bri $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(awn.o)) {
         return !this.dP().ab().b(dbp.G);
      } else if ($$0.a(awn.n)) {
         return !this.dP().ab().b(dbp.H);
      } else if ($$0.a(awn.j)) {
         return !this.dP().ab().b(dbp.I);
      } else {
         return $$0.a(awn.p) ? !this.dP().ab().b(dbp.J) : false;
      }
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cA.a && !$$0.a(awn.e)) {
         return false;
      } else {
         this.bf = 0;
         if (this.eB()) {
            return false;
         } else {
            if (!this.dP().B) {
               this.gq();
            }

            if ($$0.f()) {
               if (this.dP().al() == bqm.a) {
                  $$1 = 0.0F;
               }

               if (this.dP().al() == bqm.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dP().al() == bqm.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(btk $$0) {
      super.d($$0);
      if ($$0.fO()) {
         this.fY();
      }
   }

   @Override
   public boolean et() {
      return !this.gd().a && super.et();
   }

   public boolean a(cms $$0) {
      ews $$1 = this.cj();
      ews $$2 = $$0.cj();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bri $$0, float $$1) {
      this.a($$0, $$1, new bsw[]{bsw.c, bsw.d, bsw.e, bsw.f});
   }

   @Override
   protected void c(bri $$0, float $$1) {
      this.a($$0, $$1, new bsw[]{bsw.f});
   }

   @Override
   protected void v(float $$0) {
      if (this.bz.a(cun.vs)) {
         if (!this.dP().B) {
            this.b(awg.c.b(this.bz.g()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + ayu.d($$0);
            bqo $$2 = this.fw();
            this.bz.a($$1, this, d($$2));
            if (this.bz.e()) {
               if ($$2 == bqo.a) {
                  this.a(bsw.a, cuk.l);
               } else {
                  this.a(bsw.b, cuk.l);
               }

               this.bz = cuk.l;
               this.a(avw.wB, 0.8F, 0.8F + this.dP().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bri $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fs(), 0.0F);
         this.A(this.fs() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(awg.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.C($$0.a());
            this.eP().a($$0, var7);
            this.t(this.eA() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(awg.J, Math.round(var7 * 10.0F));
            }

            this.a(dwq.o);
         }
      }
   }

   @Override
   protected boolean dY() {
      return !this.cA.b && super.dY();
   }

   public boolean Y() {
      return false;
   }

   public void a(dqm $$0, boolean $$1) {
   }

   public void a(dau $$0) {
   }

   public void a(dpm $$0) {
   }

   public void a(dqr $$0) {
   }

   public void a(dqc $$0) {
   }

   public void a(che $$0, bqi $$1) {
   }

   public OptionalInt a(@Nullable bqt $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, das $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cuk $$0, bqo $$1) {
   }

   public bqp a(bsp $$0, bqo $$1) {
      if (this.N_()) {
         if ($$0 instanceof bqt) {
            this.a((bqt)$$0);
         }

         return bqp.e;
      } else {
         cuk $$2 = this.b($$1);
         cuk $$3 = $$2.s();
         bqp $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cA.d && $$2 == this.b($$1) && $$2.I() < $$3.I()) {
               $$2.e($$3.I());
            }

            return $$4;
         } else {
            if (!$$2.e() && $$0 instanceof btk) {
               if (this.cA.d) {
                  $$2 = $$3;
               }

               bqp $$5 = $$2.a(this, (btk)$$0, $$1);
               if ($$5.a()) {
                  this.dP().a(dwq.r, $$0.dn(), dwq.a.a(this));
                  if ($$2.e() && !this.cA.d) {
                     this.a($$1, cuk.l);
                  }

                  return $$5;
               }
            }

            return bqp.e;
         }
      }
   }

   @Override
   public void bI() {
      super.bI();
      this.K = 0;
   }

   @Override
   protected boolean fg() {
      return super.fg() || this.fL();
   }

   @Override
   public boolean ef() {
      return !this.cA.b;
   }

   @Override
   protected evm a(evm $$0, btp $$1) {
      if (!this.cA.b && $$0.d <= 0.0 && ($$1 == btp.a || $$1 == btp.b) && this.fT() && this.z()) {
         double $$2 = $$0.c;
         double $$3 = $$0.e;
         double $$4 = 0.05;

         while ($$2 != 0.0 && this.dP().a(this, this.cK().d($$2, (double)(-this.dJ()), 0.0))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }
         }

         while ($$3 != 0.0 && this.dP().a(this, this.cK().d(0.0, (double)(-this.dJ()), $$3))) {
            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         while ($$2 != 0.0 && $$3 != 0.0 && this.dP().a(this, this.cK().d($$2, (double)(-this.dJ()), $$3))) {
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

         $$0 = new evm($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean z() {
      return this.aE() || this.ac < this.dJ() && !this.dP().a(this, this.cK().d(0.0, (double)(this.ac - this.dJ()), 0.0));
   }

   public void e(bsp $$0) {
      if ($$0.ct()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.g(bus.c);
            float $$2 = czw.a(this.eX(), $$0.ak());
            float $$3 = this.D(0.5F);
            $$1 *= 0.2F + $$3 * $$3 * 0.8F;
            $$2 *= $$3;
            this.gw();
            if ($$0.ak().a(awp.H) && $$0 instanceof cnk $$4) {
               $$4.a(this.dQ().a(this));
            } else {
               if ($$1 > 0.0F || $$2 > 0.0F) {
                  boolean $$5 = $$3 > 0.9F;
                  boolean $$6 = false;
                  int $$7 = 0;
                  $$7 += czw.c(this);
                  if (this.cb() && $$5) {
                     this.dP().a(null, this.du(), this.dw(), this.dA(), avw.tZ, this.de(), 1.0F, 1.0F);
                     $$7++;
                     $$6 = true;
                  }

                  $$1 += this.b(bqo.a).g().a(this, $$1);
                  boolean $$8 = $$5
                     && this.ac > 0.0F
                     && !this.aE()
                     && !this.q_()
                     && !this.be()
                     && !this.b(brz.o)
                     && !this.bR()
                     && $$0 instanceof btk
                     && !this.cb();
                  if ($$8) {
                     $$1 *= 1.5F;
                  }

                  $$1 += $$2;
                  boolean $$9 = false;
                  double $$10 = (double)(this.Z - this.Y);
                  if ($$5 && !$$8 && !$$6 && this.aE() && $$10 < (double)this.fn()) {
                     cuk $$11 = this.b(bqo.a);
                     if ($$11.g() instanceof cvx) {
                        $$9 = true;
                     }
                  }

                  float $$12 = 0.0F;
                  boolean $$13 = false;
                  int $$14 = czw.d(this);
                  if ($$0 instanceof btk) {
                     $$12 = ((btk)$$0).eA();
                     if ($$14 > 0 && !$$0.bQ()) {
                        $$13 = true;
                        $$0.g(1);
                     }
                  }

                  evm $$15 = $$0.ds();
                  boolean $$16 = $$0.a(this.dQ().a(this), $$1);
                  if ($$16) {
                     if ($$7 > 0) {
                        if ($$0 instanceof btk) {
                           ((btk)$$0)
                              .q(
                                 (double)((float)$$7 * 0.5F),
                                 (double)ayu.a(this.dF() * (float) (Math.PI / 180.0)),
                                 (double)(-ayu.b(this.dF() * (float) (Math.PI / 180.0)))
                              );
                        } else {
                           $$0.j(
                              (double)(-ayu.a(this.dF() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F),
                              0.1,
                              (double)(ayu.b(this.dF() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F)
                           );
                        }

                        this.h(this.ds().d(0.6, 1.0, 0.6));
                        this.h(false);
                     }

                     if ($$9) {
                        float $$17 = 1.0F + czw.a(this) * $$1;

                        for (btk $$19 : this.dP().a(btk.class, $$0.cK().c(1.0, 0.25, 1.0))) {
                           if ($$19 != this && $$19 != $$0 && !this.s($$19) && (!($$19 instanceof cis) || !((cis)$$19).z()) && this.g((bsp)$$19) < 9.0) {
                              $$19.q(0.4F, (double)ayu.a(this.dF() * (float) (Math.PI / 180.0)), (double)(-ayu.b(this.dF() * (float) (Math.PI / 180.0))));
                              $$19.a(this.dQ().a(this), $$17);
                           }
                        }

                        this.dP().a(null, this.du(), this.dw(), this.dA(), avw.uc, this.de(), 1.0F, 1.0F);
                        this.fZ();
                     }

                     if ($$0 instanceof arc && $$0.U) {
                        ((arc)$$0).c.b(new afl($$0));
                        $$0.U = false;
                        $$0.h($$15);
                     }

                     if ($$8) {
                        this.dP().a(null, this.du(), this.dw(), this.dA(), avw.tY, this.de(), 1.0F, 1.0F);
                        this.b($$0);
                     }

                     if (!$$8 && !$$9) {
                        if ($$5) {
                           this.dP().a(null, this.du(), this.dw(), this.dA(), avw.ub, this.de(), 1.0F, 1.0F);
                        } else {
                           this.dP().a(null, this.du(), this.dw(), this.dA(), avw.ud, this.de(), 1.0F, 1.0F);
                        }
                     }

                     if ($$2 > 0.0F) {
                        this.c($$0);
                     }

                     this.A($$0);
                     if ($$0 instanceof btk) {
                        czw.a((btk)$$0, this);
                     }

                     czw.b(this, $$0);
                     cuk $$20 = this.eX();
                     bsp $$21 = $$0;
                     if ($$0 instanceof chu) {
                        $$21 = ((chu)$$0).b;
                     }

                     if (!this.dP().B && !$$20.e() && $$21 instanceof btk) {
                        $$20.a((btk)$$21, this);
                        if ($$20.e()) {
                           this.a(bqo.a, cuk.l);
                        }
                     }

                     if ($$0 instanceof btk) {
                        float $$22 = $$12 - ((btk)$$0).eA();
                        this.a(awg.G, Math.round($$22 * 10.0F));
                        if ($$14 > 0) {
                           $$0.g($$14 * 4);
                        }

                        if (this.dP() instanceof arb && $$22 > 2.0F) {
                           int $$23 = (int)((double)$$22 * 0.5);
                           ((arb)this.dP()).a(lj.g, $$0.du(), $$0.e(0.5), $$0.dA(), $$23, 0.1, 0.0, 0.1, 0.2);
                        }
                     }

                     this.C(0.1F);
                  } else {
                     this.dP().a(null, this.du(), this.dw(), this.dA(), avw.ua, this.de(), 1.0F, 1.0F);
                     if ($$13) {
                        $$0.aC();
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(btk $$0) {
      this.e($$0);
   }

   public void fY() {
      this.gx().a(cun.vs, 100);
      this.fB();
      this.dP().a(this, (byte)30);
   }

   @Override
   public void b(bsp $$0) {
   }

   public void c(bsp $$0) {
   }

   public void fZ() {
      double $$0 = (double)(-ayu.a(this.dF() * (float) (Math.PI / 180.0)));
      double $$1 = (double)ayu.b(this.dF() * (float) (Math.PI / 180.0));
      if (this.dP() instanceof arb) {
         ((arb)this.dP()).a(lj.aj, this.du() + $$0, this.e(0.5), this.dA() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void ga() {
   }

   @Override
   public void a(bsp.c $$0) {
      super.a($$0);
      this.ca.b(this);
      if (this.cb != null && this.ge()) {
         this.s();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile gb() {
      return this.cC;
   }

   public cmr gc() {
      return this.g;
   }

   public cmp gd() {
      return this.cA;
   }

   @Override
   public boolean fP() {
      return this.cA.d;
   }

   public void a(cuk $$0, cuk $$1, cpx $$2) {
   }

   public boolean ge() {
      return this.cb != this.ca;
   }

   public Either<cms.a, azx> a(iz $$0) {
      this.b($$0);
      this.cz = 0;
      return Either.right(azx.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fM();
      if (this.dP() instanceof arb && $$1) {
         ((arb)this.dP()).e();
      }

      this.cz = $$0 ? 0 : 100;
   }

   @Override
   public void fM() {
      this.a(true, true);
   }

   public static Optional<evm> a(arb $$0, iz $$1, float $$2, boolean $$3, boolean $$4) {
      drx $$5 = $$0.a_($$1);
      deu $$6 = $$5.b();
      if ($$6 instanceof dlc && ($$3 || $$5.c(dlc.d) > 0) && dlc.a($$0)) {
         Optional<evm> $$7 = dlc.a(bsv.by, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dlc.d, Integer.valueOf($$5.c(dlc.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof den && den.a($$0)) {
         return den.a(bsv.by, $$0, $$1, $$5.c(den.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         drx $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new evm((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean gf() {
      return this.fL() && this.cz >= 100;
   }

   public int gg() {
      return this.cz;
   }

   public void a(xl $$0, boolean $$1) {
   }

   public void a(alb $$0) {
      this.b(awg.i.b($$0));
   }

   public void a(alb $$0, int $$1) {
      this.a(awg.i.b($$0), $$1);
   }

   public void b(awd<?> $$0) {
      this.a($$0, 1);
   }

   public void a(awd<?> $$0, int $$1) {
   }

   public void a(awd<?> $$0) {
   }

   public int a(Collection<cys<?>> $$0) {
      return 0;
   }

   public void a(cys<?> $$0, List<cuk> $$1) {
   }

   public void b(List<alb> $$0) {
   }

   public int b(Collection<cys<?>> $$0) {
      return 0;
   }

   @Override
   public void fj() {
      super.fj();
      this.a(awg.E);
      if (this.cb()) {
         this.C(0.2F);
      } else {
         this.C(0.05F);
      }
   }

   @Override
   public void a(evm $$0) {
      if (this.cc() && !this.bR()) {
         double $$1 = this.bL().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bn || !this.dP().a_(iz.a(this.du(), this.dw() + 1.0 - 0.1, this.dA())).u().c()) {
            evm $$3 = this.ds();
            this.h($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cA.b && !this.bR()) {
         double $$4 = this.ds().d;
         super.a($$0);
         evm $$5 = this.ds();
         this.o($$5.c, $$4 * 0.6, $$5.e);
         this.n();
         this.b(7, false);
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bk() {
      if (this.cA.b) {
         this.i(false);
      } else {
         super.bk();
      }
   }

   protected boolean i(iz $$0) {
      return !this.dP().a_($$0).o(this.dP(), $$0);
   }

   @Override
   public float fn() {
      return (float)this.g(bus.r);
   }

   @Override
   public boolean a(float $$0, float $$1, bri $$2) {
      if (this.cA.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(awg.t, (int)Math.round((double)$$0 * 100.0));
         }

         if (this.cx && this.cv != null) {
            double $$3 = this.cv.d;
            this.gE();
            return $$3 < this.dw() ? false : super.a((float)($$3 - this.dw()), $$1, $$2);
         } else {
            return super.a($$0, $$1, $$2);
         }
      }
   }

   public boolean gh() {
      if (!this.aE() && !this.fE() && !this.be() && !this.b(brz.y)) {
         cuk $$0 = this.a(bsw.e);
         if ($$0.a(cun.nT) && ctg.j($$0)) {
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
   protected void bn() {
      if (!this.N_()) {
         super.bn();
      }
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      if (this.be()) {
         this.aT();
         this.b($$1);
      } else {
         iz $$2 = this.f($$0);
         if (!$$0.equals($$2)) {
            drx $$3 = this.dP().a_($$2);
            if ($$3.a(awl.bo)) {
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
   public btk.a eL() {
      return new btk.a(avw.uo, avw.ue);
   }

   @Override
   public boolean a(arb $$0, btk $$1) {
      this.b(awg.g.b($$1.ak()));
      return true;
   }

   @Override
   public void a(drx $$0, evm $$1) {
      if (!this.cA.b) {
         super.a($$0, $$1);
      }

      this.gE();
   }

   public void d(int $$0) {
      this.t($$0);
      this.cq = this.cq + (float)$$0 / (float)this.gl();
      this.cp = ayu.a(this.cp + $$0, 0, Integer.MAX_VALUE);

      while (this.cq < 0.0F) {
         float $$1 = this.cq * (float)this.gl();
         if (this.co > 0) {
            this.c(-1);
            this.cq = 1.0F + $$1 / (float)this.gl();
         } else {
            this.c(-1);
            this.cq = 0.0F;
         }
      }

      while (this.cq >= 1.0F) {
         this.cq = (this.cq - 1.0F) * (float)this.gl();
         this.c(1);
         this.cq = this.cq / (float)this.gl();
      }
   }

   public int gk() {
      return this.cr;
   }

   @Override
   public void a(cuk $$0, int $$1) {
      this.co -= $$1;
      if (this.co < 0) {
         this.co = 0;
         this.cq = 0.0F;
         this.cp = 0;
      }

      this.cr = this.ah.f();
   }

   public void c(int $$0) {
      this.co += $$0;
      if (this.co < 0) {
         this.co = 0;
         this.cq = 0.0F;
         this.cp = 0;
      }

      if ($$0 > 0 && this.co % 5 == 0 && (float)this.cB < (float)this.ai - 100.0F) {
         float $$1 = this.co > 30 ? 1.0F : (float)this.co / 30.0F;
         this.dP().a(null, this.du(), this.dw(), this.dA(), avw.un, this.de(), $$1 * 0.75F, 1.0F);
         this.cB = this.ai;
      }
   }

   public int gl() {
      if (this.co >= 30) {
         return 112 + (this.co - 30) * 9;
      } else {
         return this.co >= 15 ? 37 + (this.co - 15) * 5 : 7 + this.co * 2;
      }
   }

   public void C(float $$0) {
      if (!this.cA.a) {
         if (!this.dP().B) {
            this.cc.a($$0);
         }
      }
   }

   public Optional<cly> aa() {
      return Optional.empty();
   }

   public cpl gm() {
      return this.cc;
   }

   public boolean t(boolean $$0) {
      return this.cA.a || $$0 || this.cc.c();
   }

   public boolean gn() {
      return this.eA() > 0.0F && this.eA() < this.eR();
   }

   public boolean go() {
      return this.cA.e;
   }

   public boolean a(iz $$0, je $$1, cuk $$2) {
      if (this.cA.e) {
         return true;
      } else {
         iz $$3 = $$0.a($$1.g());
         dsb $$4 = new dsb(this.dP(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   public int ej() {
      if (!this.dP().ab().b(dbp.d) && !this.N_()) {
         int $$0 = this.co * 7;
         return $$0 > 100 ? 100 : $$0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean ek() {
      return true;
   }

   @Override
   public boolean cF() {
      return true;
   }

   @Override
   protected bsp.b bb() {
      return this.cA.b || this.aE() && this.bY() ? bsp.b.a : bsp.b.d;
   }

   public void y() {
   }

   @Override
   public xl af() {
      return xl.b(this.cC.getName());
   }

   public crb gp() {
      return this.bZ;
   }

   @Override
   public cuk a(bsw $$0) {
      if ($$0 == bsw.a) {
         return this.g.f();
      } else if ($$0 == bsw.b) {
         return this.g.j.get(0);
      } else {
         return $$0.a() == bsw.a.b ? this.g.i.get($$0.b()) : cuk.l;
      }
   }

   @Override
   protected boolean b(bsw $$0) {
      return $$0.a() == bsw.a.b;
   }

   @Override
   public void a(bsw $$0, cuk $$1) {
      this.e($$1);
      if ($$0 == bsw.a) {
         this.a($$0, this.g.h.set(this.g.k, $$1), $$1);
      } else if ($$0 == bsw.b) {
         this.a($$0, this.g.j.set(0, $$1), $$1);
      } else if ($$0.a() == bsw.a.b) {
         this.a($$0, this.g.i.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cuk $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<cuk> fa() {
      return Lists.newArrayList(new cuk[]{this.eX(), this.eY()});
   }

   @Override
   public Iterable<cuk> eZ() {
      return this.g.i;
   }

   @Override
   public boolean d(bsw $$0) {
      return $$0 != bsw.g;
   }

   public boolean h(ur $$0) {
      if (this.bR() || !this.aE() || this.be() || this.aB) {
         return false;
      } else if (this.gt().g()) {
         this.i($$0);
         this.f = this.dP().Z();
         return true;
      } else if (this.gu().g()) {
         this.j($$0);
         this.f = this.dP().Z();
         return true;
      } else {
         return false;
      }
   }

   protected void gq() {
      if (this.f + 20L < this.dP().Z()) {
         this.k(this.gt());
         this.i(new ur());
         this.k(this.gu());
         this.j(new ur());
      }
   }

   private void k(ur $$0) {
      if (!this.dP().B && !$$0.g()) {
         bsv.a($$0, this.dP()).ifPresent($$0x -> {
            if ($$0x instanceof buh) {
               ((buh)$$0x).b(this.az);
            }

            $$0x.a_(this.du(), this.dw() + 0.7F, this.dA());
            ((arb)this.dP()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean N_();

   @Override
   public boolean by() {
      return !this.N_() && super.by();
   }

   @Override
   public boolean cc() {
      return !this.cA.b && !this.N_() && super.cc();
   }

   public abstract boolean f();

   @Override
   public boolean cC() {
      return !this.cA.b;
   }

   public ewq gr() {
      return this.dP().M();
   }

   @Override
   public xl O_() {
      xz $$0 = ewl.a(this.cj(), this.af());
      return this.a($$0);
   }

   private xz a(xz $$0) {
      String $$1 = this.gb().getName();
      return $$0.a($$1x -> $$1x.a(new xj(xj.a.d, "/tell " + $$1 + " ")).a(this.cJ()).a($$1));
   }

   @Override
   public String cB() {
      return this.gb().getName();
   }

   @Override
   protected void B(float $$0) {
      this.ap().a(d, $$0);
   }

   @Override
   public float fs() {
      return this.ap().a(d);
   }

   public boolean a(cmt $$0) {
      return (this.ap().a(bV) & $$0.a()) == $$0.a();
   }

   @Override
   public buc a_(int $$0) {
      if ($$0 == 499) {
         return new buc() {
            @Override
            public cuk a() {
               return cms.this.cb.g();
            }

            @Override
            public boolean a(cuk $$0) {
               cms.this.cb.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new buc() {
               @Override
               public cuk a() {
                  return cms.this.ca.q().a($$1);
               }

               @Override
               public boolean a(cuk $$0) {
                  cms.this.ca.q().a($$1, $$0);
                  cms.this.ca.a(cms.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.h.size()) {
            return buc.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.bZ.b() ? buc.a(this.bZ, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gs() {
      return this.cD;
   }

   public void u(boolean $$0) {
      this.cD = $$0;
   }

   @Override
   public void i(int $$0) {
      super.i(this.cA.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bte fu() {
      return this.ao.a(bW) == 0 ? bte.a : bte.b;
   }

   public void a(bte $$0) {
      this.ao.a(bW, (byte)($$0 == bte.a ? 0 : 1));
   }

   public ur gt() {
      return this.ao.a(bX);
   }

   protected void i(ur $$0) {
      this.ao.a(bX, $$0);
   }

   public ur gu() {
      return this.ao.a(bY);
   }

   protected void j(ur $$0) {
      this.ao.a(bY, $$0);
   }

   public float gv() {
      return (float)(1.0 / this.g(bus.e) * 20.0);
   }

   public float D(float $$0) {
      return ayu.a(((float)this.aT + $$0) / this.gv(), 0.0F, 1.0F);
   }

   public void gw() {
      this.aT = 0;
   }

   public cug gx() {
      return this.cF;
   }

   @Override
   protected float aN() {
      return !this.cA.b && !this.fE() ? super.aN() : 1.0F;
   }

   public float gy() {
      return (float)this.g(bus.o);
   }

   public boolean gz() {
      return this.cA.d && this.F() >= 2;
   }

   @Override
   public boolean f(cuk $$0) {
      bsw $$1 = btm.h($$0);
      return this.a($$1).e();
   }

   @Override
   public bss e(btw $$0) {
      return c.getOrDefault($$0, bU);
   }

   @Override
   public ImmutableList<btw> fI() {
      return ImmutableList.of(btw.a, btw.f, btw.d);
   }

   @Override
   public cuk g(cuk $$0) {
      if (!($$0.g() instanceof cvd)) {
         return cuk.l;
      } else {
         Predicate<cuk> $$1 = ((cvd)$$0.g()).d();
         cuk $$2 = cvd.a(this, $$1);
         if (!$$2.e()) {
            return $$2;
         } else {
            $$1 = ((cvd)$$0.g()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cuk $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cA.d ? new cuk(cun.ov) : cuk.l;
         }
      }
   }

   @Override
   public cuk a(dbt $$0, cuk $$1) {
      this.gm().a($$1);
      this.b(awg.c.b($$1.g()));
      $$0.a(null, this.du(), this.dw(), this.dA(), avw.ug, avx.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof arc) {
         am.A.a((arc)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(drx $$0) {
      return this.cA.b || super.c($$0);
   }

   @Override
   public evm q(float $$0) {
      double $$1 = 0.22 * (this.fu() == bte.b ? -1.0 : 1.0);
      float $$2 = ayu.i($$0 * 0.5F, this.dH(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = ayu.i($$0, this.aZ, this.aY) * (float) (Math.PI / 180.0);
      if (this.fE() || this.fr()) {
         evm $$4 = this.f($$0);
         evm $$5 = this.ds();
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

         return this.l($$0).e(new evm($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cd()) {
         return this.l($$0).e(new evm($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cK().c() - 1.0;
         double $$13 = this.ca() ? -0.2 : 0.07;
         return this.l($$0).e(new evm($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dO() {
      return true;
   }

   public boolean gA() {
      return this.fv() && this.fx().a(cun.qX);
   }

   @Override
   public boolean dN() {
      return false;
   }

   public Optional<jh> gB() {
      return this.cG;
   }

   public void a(Optional<jh> $$0) {
      this.cG = $$0;
   }

   @Override
   public float eJ() {
      return this.cu;
   }

   @Override
   public void m(float $$0) {
      super.m($$0);
      this.cu = $$0;
   }

   @Override
   public boolean dI() {
      return true;
   }

   @Override
   protected float fm() {
      if (this.cA.b && !this.bR()) {
         return this.cb() ? this.cA.a() * 2.0F : this.cA.a();
      } else {
         return this.cb() ? 0.025999999F : 0.02F;
      }
   }

   public double gC() {
      return this.g(bus.g);
   }

   public double gD() {
      return this.g(bus.h);
   }

   public boolean b(bsp $$0, double $$1) {
      return $$0.dK() ? false : this.a($$0.cK(), $$1);
   }

   public boolean a(evh $$0, double $$1) {
      double $$2 = this.gD() + $$1;
      return $$0.e(this.bx()) < $$2 * $$2;
   }

   public boolean a(iz $$0, double $$1) {
      double $$2 = this.gC() + $$1;
      return new evh($$0).e(this.bx()) < $$2 * $$2;
   }

   public void gE() {
      this.cw = null;
      this.cv = null;
      this.cx = false;
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
