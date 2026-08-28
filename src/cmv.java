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

public abstract class cmv extends btn {
   private static final Logger b = LogUtils.getLogger();
   public static final bth bF = bth.b;
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
   public static final evp bT = new evp(0.0, 0.6, 0.0);
   public static final bsv bU = bsv.b(0.6F, 1.8F).b(1.62F).a(bsu.a().a(bst.b, bT));
   private static final Map<btz, bsv> c = ImmutableMap.builder()
      .put(btz.a, bU)
      .put(btz.c, aG)
      .put(btz.b, bsv.b(0.6F, 0.6F).b(0.4F))
      .put(btz.d, bsv.b(0.6F, 0.6F).b(0.4F))
      .put(btz.e, bsv.b(0.6F, 0.6F).b(0.4F))
      .put(btz.f, bsv.b(0.6F, 1.5F).b(1.27F).a(bsu.a().a(bst.b, bT)))
      .put(btz.h, bsv.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final akj<Float> d = akn.a(cmv.class, akl.d);
   private static final akj<Integer> e = akn.a(cmv.class, akl.b);
   protected static final akj<Byte> bV = akn.a(cmv.class, akl.a);
   protected static final akj<Byte> bW = akn.a(cmv.class, akl.a);
   protected static final akj<ur> bX = akn.a(cmv.class, akl.t);
   protected static final akj<ur> bY = akn.a(cmv.class, akl.t);
   private long f;
   final cmu g = new cmu(this);
   protected cre bZ = new cre();
   public final cqt ca;
   public cps cb;
   protected cpo cc = new cpo();
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
   private final cms cA = new cms();
   public int co;
   public int cp;
   public float cq;
   protected int cr;
   protected final float cs = 0.02F;
   private int cB;
   private final GameProfile cC;
   private boolean cD;
   private cun cE = cun.l;
   private final cuj cF = this.k();
   private Optional<jh> cG = Optional.empty();
   @Nullable
   public cnj ct;
   protected float cu;
   @Nullable
   public evp cv;
   @Nullable
   public bss cw;
   public boolean cx;

   public cmv(dbw $$0, iz $$1, float $$2, GameProfile $$3) {
      super(bsy.by, $$0);
      this.a_($$3.getId());
      this.cC = $$3;
      this.ca = new cqt(this.g, !$$0.B, this);
      this.cb = this.ca;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bk = 180.0F;
   }

   public boolean a(dbw $$0, iz $$1, dbt $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dbt.d) {
         return true;
      } else if (this.go()) {
         return false;
      } else {
         cun $$3 = this.eX();
         return $$3.e() || !$$3.b(new dse($$0, $$1, false));
      }
   }

   public static buu.a fQ() {
      return btn.dU().a(buv.c, 1.0).a(buv.r, 0.1F).a(buv.e).a(buv.o).a(buv.g, 4.5).a(buv.h, 3.0).a(buv.f);
   }

   @Override
   protected void a(akn.a $$0) {
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
         this.a(awj.k);
         this.a(awj.l);
         if (this.bD()) {
            this.a(awj.m);
         }

         if (this.bY()) {
            this.a(awj.o);
         }

         if (!this.fL()) {
            this.a(awj.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = ayx.a(this.du(), -2.9999999E7, 2.9999999E7);
      double $$2 = ayx.a(this.dA(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.du() || $$2 != this.dA()) {
         this.a_($$1, this.dw(), $$2);
      }

      this.aT++;
      cun $$3 = this.eX();
      if (!cun.a(this.cE, $$3)) {
         if (!cun.b(this.cE, $$3)) {
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
      this.cn = this.a(awu.a);
      return this.cn;
   }

   private void u() {
      cun $$0 = this.a(bsz.f);
      if ($$0.a(cuq.oo) && !this.a(awu.a)) {
         this.b(new bsa(bsc.m, 200, 0, false, false, true));
      }
   }

   protected cuj k() {
      return new cuj();
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
      if (this.h(btz.d)) {
         btz $$0;
         if (this.fE()) {
            $$0 = btz.b;
         } else if (this.fL()) {
            $$0 = btz.c;
         } else if (this.cc()) {
            $$0 = btz.d;
         } else if (this.fr()) {
            $$0 = btz.e;
         } else if (this.bV() && !this.cA.b) {
            $$0 = btz.f;
         } else {
            $$0 = btz.a;
         }

         btz $$6;
         if (this.N_() || this.bR() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(btz.f)) {
            $$6 = btz.f;
         } else {
            $$6 = btz.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(btz $$0) {
      return this.dP().a(this, this.a($$0).a(this.dn()).h(1.0E-7));
   }

   @Override
   public int az() {
      return Math.max(1, this.dP().ab().c(this.cA.a ? dbs.F : dbs.E));
   }

   @Override
   protected avy aP() {
      return avz.ur;
   }

   @Override
   protected avy aQ() {
      return avz.up;
   }

   @Override
   protected avy aR() {
      return avz.uq;
   }

   @Override
   public int bP() {
      return 10;
   }

   @Override
   public void a(avy $$0, float $$1, float $$2) {
      this.dP().a(this, this.du(), this.dw(), this.dA(), $$0, this.de(), $$1, $$2);
   }

   public void a(avy $$0, awa $$1, float $$2, float $$3) {
   }

   @Override
   public awa de() {
      return awa.h;
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

      if (this.dP().al() == bqp.a && this.dP().ab().b(dbs.k)) {
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
      this.y((float)this.g(buv.r));
      float $$1;
      if (this.aE() && !this.eB() && !this.cc()) {
         $$1 = Math.min(0.1F, (float)this.ds().h());
      } else {
         $$1 = 0.0F;
      }

      this.cf = this.cf + ($$1 - this.cf) * 0.4F;
      if (this.eA() > 0.0F && !this.N_()) {
         evk $$2;
         if (this.bR() && !this.dc().dK()) {
            $$2 = this.cK().b(this.dc().cK()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cK().c(1.0, 0.5, 1.0);
         }

         List<bss> $$4 = this.dP().a_(this, $$2);
         List<bss> $$5 = Lists.newArrayList();

         for (bss $$6 : $$4) {
            if ($$6.ak() == bsy.M) {
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
         bsy.a($$1).filter($$0x -> $$0x == bsy.ax).ifPresent($$0x -> {
            if (!cft.a(this.dP(), this)) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), cft.a(this.dP(), this.dP().z), this.de(), 1.0F, cft.a(this.dP().z));
            }
         });
      }
   }

   private void d(bss $$0) {
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
   public void a(brl $$0) {
      super.a($$0);
      this.at();
      if (!this.N_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-ayx.b((this.eJ() + this.dF()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-ayx.a((this.eJ() + this.dF()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(awj.N);
      this.a(awj.i.b(awj.m));
      this.a(awj.i.b(awj.n));
      this.aC();
      this.c(false);
      this.a(Optional.of(jh.a(this.dP().af(), this.dp())));
   }

   @Override
   protected void eD() {
      super.eD();
      if (!this.dP().ab().b(dbs.d)) {
         this.fX();
         this.g.k();
      }
   }

   protected void fX() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cun $$1 = this.g.a($$0);
         if (!$$1.e() && czz.g($$1)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected avy d(brl $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected avy o_() {
      return avz.uh;
   }

   @Nullable
   public cjf a(cun $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cjf a(cun $$0, boolean $$1, boolean $$2) {
      if ($$0.e()) {
         return null;
      } else {
         if (this.dP().B) {
            this.a(bqr.a);
         }

         double $$3 = this.dy() - 0.3F;
         cjf $$4 = new cjf(this.dP(), this.du(), $$3, this.dA(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ah.i() * 0.5F;
            float $$6 = this.ah.i() * (float) (Math.PI * 2);
            $$4.o((double)(-ayx.a($$6) * $$5), 0.2F, (double)(ayx.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = ayx.a(this.dH() * (float) (Math.PI / 180.0));
            float $$9 = ayx.b(this.dH() * (float) (Math.PI / 180.0));
            float $$10 = ayx.a(this.dF() * (float) (Math.PI / 180.0));
            float $$11 = ayx.b(this.dF() * (float) (Math.PI / 180.0));
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

   public float d(dsa $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = czz.g(this);
         cun $$3 = this.eX();
         if ($$2 > 0 && !$$3.e()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bsb.a(this)) {
         $$1 *= 1.0F + (float)(bsb.b(this) + 1) * 0.2F;
      }

      if (this.b(bsc.d)) {
         $$1 *= switch (this.c(bsc.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.g(buv.f);
      if (this.a(awu.a) && !czz.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aE()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dsa $$0) {
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
      this.f(buv.r).a((double)this.cA.b());
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
         evp.a.parse(vf.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.cv = $$0x);
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
         $$0.a("current_explosion_impact_pos", (vo)evp.a.encodeStart(vf.a, this.cv).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cx);
   }

   @Override
   public boolean b(brl $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(awq.o)) {
         return !this.dP().ab().b(dbs.G);
      } else if ($$0.a(awq.n)) {
         return !this.dP().ab().b(dbs.H);
      } else if ($$0.a(awq.j)) {
         return !this.dP().ab().b(dbs.I);
      } else {
         return $$0.a(awq.p) ? !this.dP().ab().b(dbs.J) : false;
      }
   }

   @Override
   public boolean a(brl $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cA.a && !$$0.a(awq.e)) {
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
               if (this.dP().al() == bqp.a) {
                  $$1 = 0.0F;
               }

               if (this.dP().al() == bqp.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dP().al() == bqp.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(btn $$0) {
      super.d($$0);
      if ($$0.fO()) {
         this.fY();
      }
   }

   @Override
   public boolean et() {
      return !this.gd().a && super.et();
   }

   public boolean a(cmv $$0) {
      ewv $$1 = this.cj();
      ewv $$2 = $$0.cj();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(brl $$0, float $$1) {
      this.a($$0, $$1, new bsz[]{bsz.c, bsz.d, bsz.e, bsz.f});
   }

   @Override
   protected void c(brl $$0, float $$1) {
      this.a($$0, $$1, new bsz[]{bsz.f});
   }

   @Override
   protected void v(float $$0) {
      if (this.bz.a(cuq.vs)) {
         if (!this.dP().B) {
            this.b(awj.c.b(this.bz.g()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + ayx.d($$0);
            bqr $$2 = this.fw();
            this.bz.a($$1, this, d($$2));
            if (this.bz.e()) {
               if ($$2 == bqr.a) {
                  this.a(bsz.a, cun.l);
               } else {
                  this.a(bsz.b, cun.l);
               }

               this.bz = cun.l;
               this.a(avz.wB, 0.8F, 0.8F + this.dP().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(brl $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fs(), 0.0F);
         this.A(this.fs() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(awj.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.C($$0.a());
            this.eP().a($$0, var7);
            this.t(this.eA() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(awj.J, Math.round(var7 * 10.0F));
            }

            this.a(dwt.o);
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

   public void a(dqp $$0, boolean $$1) {
   }

   public void a(dax $$0) {
   }

   public void a(dpp $$0) {
   }

   public void a(dqu $$0) {
   }

   public void a(dqf $$0) {
   }

   public void a(chh $$0, bql $$1) {
   }

   public OptionalInt a(@Nullable bqw $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dav $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cun $$0, bqr $$1) {
   }

   public bqs a(bss $$0, bqr $$1) {
      if (this.N_()) {
         if ($$0 instanceof bqw) {
            this.a((bqw)$$0);
         }

         return bqs.e;
      } else {
         cun $$2 = this.b($$1);
         cun $$3 = $$2.s();
         bqs $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cA.d && $$2 == this.b($$1) && $$2.I() < $$3.I()) {
               $$2.e($$3.I());
            }

            return $$4;
         } else {
            if (!$$2.e() && $$0 instanceof btn) {
               if (this.cA.d) {
                  $$2 = $$3;
               }

               bqs $$5 = $$2.a(this, (btn)$$0, $$1);
               if ($$5.a()) {
                  this.dP().a(dwt.r, $$0.dn(), dwt.a.a(this));
                  if ($$2.e() && !this.cA.d) {
                     this.a($$1, cun.l);
                  }

                  return $$5;
               }
            }

            return bqs.e;
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
   protected evp a(evp $$0, bts $$1) {
      float $$2 = this.dJ();
      if (!this.cA.b && !($$0.d > 0.0) && ($$1 == bts.a || $$1 == bts.b) && this.fT() && this.E($$2)) {
         double $$3 = $$0.c;
         double $$4 = $$0.e;
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

         return new evp($$3, $$0.d, $$4);
      } else {
         return $$0;
      }
   }

   private boolean E(float $$0) {
      return this.aE() || this.ac < $$0 && !this.b(0.0, 0.0, $$0 - this.ac);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      evk $$3 = this.cK();
      return this.dP().a(this, new evk($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(bss $$0) {
      if ($$0.ct()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.g(buv.c);
            float $$2 = czz.a(this.eX(), $$0.ak());
            float $$3 = this.D(0.5F);
            $$1 *= 0.2F + $$3 * $$3 * 0.8F;
            $$2 *= $$3;
            this.gw();
            if ($$0.ak().a(aws.H) && $$0 instanceof cnn $$4) {
               $$4.a(this.dQ().a(this));
            } else {
               if ($$1 > 0.0F || $$2 > 0.0F) {
                  boolean $$5 = $$3 > 0.9F;
                  boolean $$6 = false;
                  int $$7 = 0;
                  $$7 += czz.c(this);
                  if (this.cb() && $$5) {
                     this.dP().a(null, this.du(), this.dw(), this.dA(), avz.tZ, this.de(), 1.0F, 1.0F);
                     $$7++;
                     $$6 = true;
                  }

                  $$1 += this.b(bqr.a).g().a(this, $$1);
                  boolean $$8 = $$5
                     && this.ac > 0.0F
                     && !this.aE()
                     && !this.q_()
                     && !this.be()
                     && !this.b(bsc.o)
                     && !this.bR()
                     && $$0 instanceof btn
                     && !this.cb();
                  if ($$8) {
                     $$1 *= 1.5F;
                  }

                  $$1 += $$2;
                  boolean $$9 = false;
                  double $$10 = (double)(this.Z - this.Y);
                  if ($$5 && !$$8 && !$$6 && this.aE() && $$10 < (double)this.fn()) {
                     cun $$11 = this.b(bqr.a);
                     if ($$11.g() instanceof cwa) {
                        $$9 = true;
                     }
                  }

                  float $$12 = 0.0F;
                  boolean $$13 = false;
                  int $$14 = czz.d(this);
                  if ($$0 instanceof btn) {
                     $$12 = ((btn)$$0).eA();
                     if ($$14 > 0 && !$$0.bQ()) {
                        $$13 = true;
                        $$0.g(1);
                     }
                  }

                  evp $$15 = $$0.ds();
                  boolean $$16 = $$0.a(this.dQ().a(this), $$1);
                  if ($$16) {
                     if ($$7 > 0) {
                        if ($$0 instanceof btn) {
                           ((btn)$$0)
                              .q(
                                 (double)((float)$$7 * 0.5F),
                                 (double)ayx.a(this.dF() * (float) (Math.PI / 180.0)),
                                 (double)(-ayx.b(this.dF() * (float) (Math.PI / 180.0)))
                              );
                        } else {
                           $$0.j(
                              (double)(-ayx.a(this.dF() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F),
                              0.1,
                              (double)(ayx.b(this.dF() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F)
                           );
                        }

                        this.h(this.ds().d(0.6, 1.0, 0.6));
                        this.h(false);
                     }

                     if ($$9) {
                        float $$17 = 1.0F + czz.a(this) * $$1;

                        for (btn $$19 : this.dP().a(btn.class, $$0.cK().c(1.0, 0.25, 1.0))) {
                           if ($$19 != this && $$19 != $$0 && !this.s($$19) && (!($$19 instanceof civ) || !((civ)$$19).z()) && this.g((bss)$$19) < 9.0) {
                              $$19.q(0.4F, (double)ayx.a(this.dF() * (float) (Math.PI / 180.0)), (double)(-ayx.b(this.dF() * (float) (Math.PI / 180.0))));
                              $$19.a(this.dQ().a(this), $$17);
                           }
                        }

                        this.dP().a(null, this.du(), this.dw(), this.dA(), avz.uc, this.de(), 1.0F, 1.0F);
                        this.fZ();
                     }

                     if ($$0 instanceof arf && $$0.U) {
                        ((arf)$$0).c.b(new afo($$0));
                        $$0.U = false;
                        $$0.h($$15);
                     }

                     if ($$8) {
                        this.dP().a(null, this.du(), this.dw(), this.dA(), avz.tY, this.de(), 1.0F, 1.0F);
                        this.b($$0);
                     }

                     if (!$$8 && !$$9) {
                        if ($$5) {
                           this.dP().a(null, this.du(), this.dw(), this.dA(), avz.ub, this.de(), 1.0F, 1.0F);
                        } else {
                           this.dP().a(null, this.du(), this.dw(), this.dA(), avz.ud, this.de(), 1.0F, 1.0F);
                        }
                     }

                     if ($$2 > 0.0F) {
                        this.c($$0);
                     }

                     this.A($$0);
                     if ($$0 instanceof btn) {
                        czz.a((btn)$$0, this);
                     }

                     czz.b(this, $$0);
                     cun $$20 = this.eX();
                     bss $$21 = $$0;
                     if ($$0 instanceof chx) {
                        $$21 = ((chx)$$0).b;
                     }

                     if (!this.dP().B && !$$20.e() && $$21 instanceof btn) {
                        $$20.a((btn)$$21, this);
                        if ($$20.e()) {
                           this.a(bqr.a, cun.l);
                        }
                     }

                     if ($$0 instanceof btn) {
                        float $$22 = $$12 - ((btn)$$0).eA();
                        this.a(awj.G, Math.round($$22 * 10.0F));
                        if ($$14 > 0) {
                           $$0.g($$14 * 4);
                        }

                        if (this.dP() instanceof are && $$22 > 2.0F) {
                           int $$23 = (int)((double)$$22 * 0.5);
                           ((are)this.dP()).a(li.g, $$0.du(), $$0.e(0.5), $$0.dA(), $$23, 0.1, 0.0, 0.1, 0.2);
                        }
                     }

                     this.C(0.1F);
                  } else {
                     this.dP().a(null, this.du(), this.dw(), this.dA(), avz.ua, this.de(), 1.0F, 1.0F);
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
   protected void g(btn $$0) {
      this.e($$0);
   }

   public void fY() {
      this.gx().a(cuq.vs, 100);
      this.fB();
      this.dP().a(this, (byte)30);
   }

   @Override
   public void b(bss $$0) {
   }

   public void c(bss $$0) {
   }

   public void fZ() {
      double $$0 = (double)(-ayx.a(this.dF() * (float) (Math.PI / 180.0)));
      double $$1 = (double)ayx.b(this.dF() * (float) (Math.PI / 180.0));
      if (this.dP() instanceof are) {
         ((are)this.dP()).a(li.aj, this.du() + $$0, this.e(0.5), this.dA() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void ga() {
   }

   @Override
   public void a(bss.c $$0) {
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

   public cmu gc() {
      return this.g;
   }

   public cms gd() {
      return this.cA;
   }

   @Override
   public boolean fP() {
      return this.cA.d;
   }

   public void a(cun $$0, cun $$1, cqa $$2) {
   }

   public boolean ge() {
      return this.cb != this.ca;
   }

   public Either<cmv.a, baa> a(iz $$0) {
      this.b($$0);
      this.cz = 0;
      return Either.right(baa.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fM();
      if (this.dP() instanceof are && $$1) {
         ((are)this.dP()).e();
      }

      this.cz = $$0 ? 0 : 100;
   }

   @Override
   public void fM() {
      this.a(true, true);
   }

   public static Optional<evp> a(are $$0, iz $$1, float $$2, boolean $$3, boolean $$4) {
      dsa $$5 = $$0.a_($$1);
      dex $$6 = $$5.b();
      if ($$6 instanceof dlf && ($$3 || $$5.c(dlf.d) > 0) && dlf.a($$0)) {
         Optional<evp> $$7 = dlf.a(bsy.by, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dlf.d, Integer.valueOf($$5.c(dlf.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof deq && deq.a($$0)) {
         return deq.a(bsy.by, $$0, $$1, $$5.c(deq.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dsa $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new evp((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean gf() {
      return this.fL() && this.cz >= 100;
   }

   public int gg() {
      return this.cz;
   }

   public void a(xo $$0, boolean $$1) {
   }

   public void a(ale $$0) {
      this.b(awj.i.b($$0));
   }

   public void a(ale $$0, int $$1) {
      this.a(awj.i.b($$0), $$1);
   }

   public void b(awg<?> $$0) {
      this.a($$0, 1);
   }

   public void a(awg<?> $$0, int $$1) {
   }

   public void a(awg<?> $$0) {
   }

   public int a(Collection<cyv<?>> $$0) {
      return 0;
   }

   public void a(cyv<?> $$0, List<cun> $$1) {
   }

   public void b(List<ale> $$0) {
   }

   public int b(Collection<cyv<?>> $$0) {
      return 0;
   }

   @Override
   public void fj() {
      super.fj();
      this.a(awj.E);
      if (this.cb()) {
         this.C(0.2F);
      } else {
         this.C(0.05F);
      }
   }

   @Override
   public void a(evp $$0) {
      if (this.cc() && !this.bR()) {
         double $$1 = this.bL().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bn || !this.dP().a_(iz.a(this.du(), this.dw() + 1.0 - 0.1, this.dA())).u().c()) {
            evp $$3 = this.ds();
            this.h($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cA.b && !this.bR()) {
         double $$4 = this.ds().d;
         super.a($$0);
         evp $$5 = this.ds();
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
      return (float)this.g(buv.r);
   }

   @Override
   public boolean a(float $$0, float $$1, brl $$2) {
      if (this.cA.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(awj.t, (int)Math.round((double)$$0 * 100.0));
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
      if (!this.aE() && !this.fE() && !this.be() && !this.b(bsc.y)) {
         cun $$0 = this.a(bsz.e);
         if ($$0.a(cuq.nT) && ctj.j($$0)) {
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
   protected void b(iz $$0, dsa $$1) {
      if (this.be()) {
         this.aT();
         this.b($$1);
      } else {
         iz $$2 = this.f($$0);
         if (!$$0.equals($$2)) {
            dsa $$3 = this.dP().a_($$2);
            if ($$3.a(awo.bo)) {
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
   public btn.a eL() {
      return new btn.a(avz.uo, avz.ue);
   }

   @Override
   public boolean a(are $$0, btn $$1) {
      this.b(awj.g.b($$1.ak()));
      return true;
   }

   @Override
   public void a(dsa $$0, evp $$1) {
      if (!this.cA.b) {
         super.a($$0, $$1);
      }

      this.gE();
   }

   public void d(int $$0) {
      this.t($$0);
      this.cq = this.cq + (float)$$0 / (float)this.gl();
      this.cp = ayx.a(this.cp + $$0, 0, Integer.MAX_VALUE);

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
   public void a(cun $$0, int $$1) {
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
         this.dP().a(null, this.du(), this.dw(), this.dA(), avz.un, this.de(), $$1 * 0.75F, 1.0F);
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

   public Optional<cmb> aa() {
      return Optional.empty();
   }

   public cpo gm() {
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

   public boolean a(iz $$0, je $$1, cun $$2) {
      if (this.cA.e) {
         return true;
      } else {
         iz $$3 = $$0.a($$1.g());
         dse $$4 = new dse(this.dP(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   public int ej() {
      if (!this.dP().ab().b(dbs.d) && !this.N_()) {
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
   protected bss.b bb() {
      return this.cA.b || this.aE() && this.bY() ? bss.b.a : bss.b.d;
   }

   public void y() {
   }

   @Override
   public xo af() {
      return xo.b(this.cC.getName());
   }

   public cre gp() {
      return this.bZ;
   }

   @Override
   public cun a(bsz $$0) {
      if ($$0 == bsz.a) {
         return this.g.f();
      } else if ($$0 == bsz.b) {
         return this.g.j.get(0);
      } else {
         return $$0.a() == bsz.a.b ? this.g.i.get($$0.b()) : cun.l;
      }
   }

   @Override
   protected boolean b(bsz $$0) {
      return $$0.a() == bsz.a.b;
   }

   @Override
   public void a(bsz $$0, cun $$1) {
      this.e($$1);
      if ($$0 == bsz.a) {
         this.a($$0, this.g.h.set(this.g.k, $$1), $$1);
      } else if ($$0 == bsz.b) {
         this.a($$0, this.g.j.set(0, $$1), $$1);
      } else if ($$0.a() == bsz.a.b) {
         this.a($$0, this.g.i.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cun $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<cun> fa() {
      return Lists.newArrayList(new cun[]{this.eX(), this.eY()});
   }

   @Override
   public Iterable<cun> eZ() {
      return this.g.i;
   }

   @Override
   public boolean d(bsz $$0) {
      return $$0 != bsz.g;
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
         bsy.a($$0, this.dP()).ifPresent($$0x -> {
            if ($$0x instanceof buk) {
               ((buk)$$0x).b(this.az);
            }

            $$0x.a_(this.du(), this.dw() + 0.7F, this.dA());
            ((are)this.dP()).c($$0x);
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

   public ewt gr() {
      return this.dP().M();
   }

   @Override
   public xo O_() {
      yc $$0 = ewo.a(this.cj(), this.af());
      return this.a($$0);
   }

   private yc a(yc $$0) {
      String $$1 = this.gb().getName();
      return $$0.a($$1x -> $$1x.a(new xm(xm.a.d, "/tell " + $$1 + " ")).a(this.cJ()).a($$1));
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

   public boolean a(cmw $$0) {
      return (this.ap().a(bV) & $$0.a()) == $$0.a();
   }

   @Override
   public buf a_(int $$0) {
      if ($$0 == 499) {
         return new buf() {
            @Override
            public cun a() {
               return cmv.this.cb.g();
            }

            @Override
            public boolean a(cun $$0) {
               cmv.this.cb.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new buf() {
               @Override
               public cun a() {
                  return cmv.this.ca.q().a($$1);
               }

               @Override
               public boolean a(cun $$0) {
                  cmv.this.ca.q().a($$1, $$0);
                  cmv.this.ca.a(cmv.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.h.size()) {
            return buf.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.bZ.b() ? buf.a(this.bZ, $$2) : super.a_($$0);
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
   public bth fu() {
      return this.ao.a(bW) == 0 ? bth.a : bth.b;
   }

   public void a(bth $$0) {
      this.ao.a(bW, (byte)($$0 == bth.a ? 0 : 1));
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
      return (float)(1.0 / this.g(buv.e) * 20.0);
   }

   public float D(float $$0) {
      return ayx.a(((float)this.aT + $$0) / this.gv(), 0.0F, 1.0F);
   }

   public void gw() {
      this.aT = 0;
   }

   public cuj gx() {
      return this.cF;
   }

   @Override
   protected float aN() {
      return !this.cA.b && !this.fE() ? super.aN() : 1.0F;
   }

   public float gy() {
      return (float)this.g(buv.o);
   }

   public boolean gz() {
      return this.cA.d && this.F() >= 2;
   }

   @Override
   public boolean f(cun $$0) {
      bsz $$1 = btp.h($$0);
      return this.a($$1).e();
   }

   @Override
   public bsv e(btz $$0) {
      return c.getOrDefault($$0, bU);
   }

   @Override
   public ImmutableList<btz> fI() {
      return ImmutableList.of(btz.a, btz.f, btz.d);
   }

   @Override
   public cun g(cun $$0) {
      if (!($$0.g() instanceof cvg)) {
         return cun.l;
      } else {
         Predicate<cun> $$1 = ((cvg)$$0.g()).d();
         cun $$2 = cvg.a(this, $$1);
         if (!$$2.e()) {
            return $$2;
         } else {
            $$1 = ((cvg)$$0.g()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cun $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cA.d ? new cun(cuq.ov) : cun.l;
         }
      }
   }

   @Override
   public cun a(dbw $$0, cun $$1) {
      this.gm().a($$1);
      this.b(awj.c.b($$1.g()));
      $$0.a(null, this.du(), this.dw(), this.dA(), avz.ug, awa.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof arf) {
         am.A.a((arf)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dsa $$0) {
      return this.cA.b || super.c($$0);
   }

   @Override
   public evp q(float $$0) {
      double $$1 = 0.22 * (this.fu() == bth.b ? -1.0 : 1.0);
      float $$2 = ayx.i($$0 * 0.5F, this.dH(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = ayx.i($$0, this.aZ, this.aY) * (float) (Math.PI / 180.0);
      if (this.fE() || this.fr()) {
         evp $$4 = this.f($$0);
         evp $$5 = this.ds();
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

         return this.l($$0).e(new evp($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cd()) {
         return this.l($$0).e(new evp($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cK().c() - 1.0;
         double $$13 = this.ca() ? -0.2 : 0.07;
         return this.l($$0).e(new evp($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dO() {
      return true;
   }

   public boolean gA() {
      return this.fv() && this.fx().a(cuq.qX);
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
      return this.g(buv.g);
   }

   public double gD() {
      return this.g(buv.h);
   }

   public boolean b(bss $$0, double $$1) {
      return $$0.dK() ? false : this.a($$0.cK(), $$1);
   }

   public boolean a(evk $$0, double $$1) {
      double $$2 = this.gD() + $$1;
      return $$0.e(this.bx()) < $$2 * $$2;
   }

   public boolean a(iz $$0, double $$1) {
      double $$2 = this.gC() + $$1;
      return new evk($$0).e(this.bx()) < $$2 * $$2;
   }

   public void gE() {
      this.cw = null;
      this.cv = null;
      this.cx = false;
   }

   public static enum a {
      a,
      b(xo.c("block.minecraft.bed.no_sleep")),
      c(xo.c("block.minecraft.bed.too_far_away")),
      d(xo.c("block.minecraft.bed.obstructed")),
      e,
      f(xo.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final xo g;

      private a() {
         this.g = null;
      }

      private a(final xo $$0) {
         this.g = $$0;
      }

      @Nullable
      public xo a() {
         return this.g;
      }
   }
}
