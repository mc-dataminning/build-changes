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

public abstract class cmw extends bto {
   private static final Logger b = LogUtils.getLogger();
   public static final bti bF = bti.b;
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
   public static final evq bT = new evq(0.0, 0.6, 0.0);
   public static final bsw bU = bsw.b(0.6F, 1.8F).b(1.62F).a(bsv.a().a(bsu.b, bT));
   private static final Map<bua, bsw> c = ImmutableMap.builder()
      .put(bua.a, bU)
      .put(bua.c, aG)
      .put(bua.b, bsw.b(0.6F, 0.6F).b(0.4F))
      .put(bua.d, bsw.b(0.6F, 0.6F).b(0.4F))
      .put(bua.e, bsw.b(0.6F, 0.6F).b(0.4F))
      .put(bua.f, bsw.b(0.6F, 1.5F).b(1.27F).a(bsv.a().a(bsu.b, bT)))
      .put(bua.h, bsw.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final akj<Float> d = akn.a(cmw.class, akl.d);
   private static final akj<Integer> e = akn.a(cmw.class, akl.b);
   protected static final akj<Byte> bV = akn.a(cmw.class, akl.a);
   protected static final akj<Byte> bW = akn.a(cmw.class, akl.a);
   protected static final akj<ur> bX = akn.a(cmw.class, akl.t);
   protected static final akj<ur> bY = akn.a(cmw.class, akl.t);
   private long f;
   final cmv g = new cmv(this);
   protected crf bZ = new crf();
   public final cqu ca;
   public cpt cb;
   protected cpp cc = new cpp();
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
   private final cmt cA = new cmt();
   public int co;
   public int cp;
   public float cq;
   protected int cr;
   protected final float cs = 0.02F;
   private int cB;
   private final GameProfile cC;
   private boolean cD;
   private cuo cE = cuo.l;
   private final cuk cF = this.k();
   private Optional<jh> cG = Optional.empty();
   @Nullable
   public cnk ct;
   protected float cu;
   @Nullable
   public evq cv;
   @Nullable
   public bst cw;
   public boolean cx;

   public cmw(dbx $$0, iz $$1, float $$2, GameProfile $$3) {
      super(bsz.by, $$0);
      this.a_($$3.getId());
      this.cC = $$3;
      this.ca = new cqu(this.g, !$$0.B, this);
      this.cb = this.ca;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bk = 180.0F;
   }

   public boolean a(dbx $$0, iz $$1, dbu $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dbu.d) {
         return true;
      } else if (this.go()) {
         return false;
      } else {
         cuo $$3 = this.eX();
         return $$3.e() || !$$3.b(new dsf($$0, $$1, false));
      }
   }

   public static buv.a fQ() {
      return bto.dU().a(buw.c, 1.0).a(buw.r, 0.1F).a(buw.e).a(buw.o).a(buw.g, 4.5).a(buw.h, 3.0).a(buw.f);
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
      double $$1 = ayy.a(this.du(), -2.9999999E7, 2.9999999E7);
      double $$2 = ayy.a(this.dA(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.du() || $$2 != this.dA()) {
         this.a_($$1, this.dw(), $$2);
      }

      this.aT++;
      cuo $$3 = this.eX();
      if (!cuo.a(this.cE, $$3)) {
         if (!cuo.b(this.cE, $$3)) {
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
      cuo $$0 = this.a(bta.f);
      if ($$0.a(cur.oo) && !this.a(awu.a)) {
         this.b(new bsb(bsd.m, 200, 0, false, false, true));
      }
   }

   protected cuk k() {
      return new cuk();
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
      if (this.h(bua.d)) {
         bua $$0;
         if (this.fE()) {
            $$0 = bua.b;
         } else if (this.fL()) {
            $$0 = bua.c;
         } else if (this.cc()) {
            $$0 = bua.d;
         } else if (this.fr()) {
            $$0 = bua.e;
         } else if (this.bV() && !this.cA.b) {
            $$0 = bua.f;
         } else {
            $$0 = bua.a;
         }

         bua $$6;
         if (this.N_() || this.bR() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bua.f)) {
            $$6 = bua.f;
         } else {
            $$6 = bua.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bua $$0) {
      return this.dP().a(this, this.a($$0).a(this.dn()).h(1.0E-7));
   }

   @Override
   public int az() {
      return Math.max(1, this.dP().ab().c(this.cA.a ? dbt.F : dbt.E));
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

      if (this.dP().al() == bqq.a && this.dP().ab().b(dbt.k)) {
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
      this.y((float)this.g(buw.r));
      float $$1;
      if (this.aE() && !this.eB() && !this.cc()) {
         $$1 = Math.min(0.1F, (float)this.ds().h());
      } else {
         $$1 = 0.0F;
      }

      this.cf = this.cf + ($$1 - this.cf) * 0.4F;
      if (this.eA() > 0.0F && !this.N_()) {
         evl $$2;
         if (this.bR() && !this.dc().dK()) {
            $$2 = this.cK().b(this.dc().cK()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cK().c(1.0, 0.5, 1.0);
         }

         List<bst> $$4 = this.dP().a_(this, $$2);
         List<bst> $$5 = Lists.newArrayList();

         for (bst $$6 : $$4) {
            if ($$6.ak() == bsz.M) {
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
         bsz.a($$1).filter($$0x -> $$0x == bsz.ax).ifPresent($$0x -> {
            if (!cfu.a(this.dP(), this)) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), cfu.a(this.dP(), this.dP().z), this.de(), 1.0F, cfu.a(this.dP().z));
            }
         });
      }
   }

   private void d(bst $$0) {
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
   public void a(brm $$0) {
      super.a($$0);
      this.at();
      if (!this.N_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-ayy.b((this.eJ() + this.dF()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-ayy.a((this.eJ() + this.dF()) * (float) (Math.PI / 180.0)) * 0.1F)
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
      if (!this.dP().ab().b(dbt.d)) {
         this.fX();
         this.g.k();
      }
   }

   protected void fX() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cuo $$1 = this.g.a($$0);
         if (!$$1.e() && daa.g($$1)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected avy d(brm $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected avy o_() {
      return avz.uh;
   }

   @Nullable
   public cjg a(cuo $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cjg a(cuo $$0, boolean $$1, boolean $$2) {
      if ($$0.e()) {
         return null;
      } else {
         if (this.dP().B) {
            this.a(bqs.a);
         }

         double $$3 = this.dy() - 0.3F;
         cjg $$4 = new cjg(this.dP(), this.du(), $$3, this.dA(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ah.i() * 0.5F;
            float $$6 = this.ah.i() * (float) (Math.PI * 2);
            $$4.o((double)(-ayy.a($$6) * $$5), 0.2F, (double)(ayy.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = ayy.a(this.dH() * (float) (Math.PI / 180.0));
            float $$9 = ayy.b(this.dH() * (float) (Math.PI / 180.0));
            float $$10 = ayy.a(this.dF() * (float) (Math.PI / 180.0));
            float $$11 = ayy.b(this.dF() * (float) (Math.PI / 180.0));
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

   public float d(dsb $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = daa.g(this);
         cuo $$3 = this.eX();
         if ($$2 > 0 && !$$3.e()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bsc.a(this)) {
         $$1 *= 1.0F + (float)(bsc.b(this) + 1) * 0.2F;
      }

      if (this.b(bsd.d)) {
         $$1 *= switch (this.c(bsd.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.g(buw.f);
      if (this.a(awu.a) && !daa.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aE()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dsb $$0) {
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
      this.f(buw.r).a((double)this.cA.b());
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
         evq.a.parse(vf.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.cv = $$0x);
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
         $$0.a("current_explosion_impact_pos", (vo)evq.a.encodeStart(vf.a, this.cv).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cx);
   }

   @Override
   public boolean b(brm $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(awq.o)) {
         return !this.dP().ab().b(dbt.G);
      } else if ($$0.a(awq.n)) {
         return !this.dP().ab().b(dbt.H);
      } else if ($$0.a(awq.j)) {
         return !this.dP().ab().b(dbt.I);
      } else {
         return $$0.a(awq.p) ? !this.dP().ab().b(dbt.J) : false;
      }
   }

   @Override
   public boolean a(brm $$0, float $$1) {
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
               if (this.dP().al() == bqq.a) {
                  $$1 = 0.0F;
               }

               if (this.dP().al() == bqq.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dP().al() == bqq.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bto $$0) {
      super.d($$0);
      if ($$0.fO()) {
         this.fY();
      }
   }

   @Override
   public boolean et() {
      return !this.gd().a && super.et();
   }

   public boolean a(cmw $$0) {
      eww $$1 = this.cj();
      eww $$2 = $$0.cj();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(brm $$0, float $$1) {
      this.a($$0, $$1, new bta[]{bta.c, bta.d, bta.e, bta.f});
   }

   @Override
   protected void c(brm $$0, float $$1) {
      this.a($$0, $$1, new bta[]{bta.f});
   }

   @Override
   protected void v(float $$0) {
      if (this.bz.a(cur.vs)) {
         if (!this.dP().B) {
            this.b(awj.c.b(this.bz.g()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + ayy.d($$0);
            bqs $$2 = this.fw();
            this.bz.a($$1, this, d($$2));
            if (this.bz.e()) {
               if ($$2 == bqs.a) {
                  this.a(bta.a, cuo.l);
               } else {
                  this.a(bta.b, cuo.l);
               }

               this.bz = cuo.l;
               this.a(avz.wB, 0.8F, 0.8F + this.dP().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(brm $$0, float $$1) {
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

            this.a(dwu.o);
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

   public void a(dqq $$0, boolean $$1) {
   }

   public void a(day $$0) {
   }

   public void a(dpq $$0) {
   }

   public void a(dqv $$0) {
   }

   public void a(dqg $$0) {
   }

   public void a(chi $$0, bqm $$1) {
   }

   public OptionalInt a(@Nullable bqx $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, daw $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cuo $$0, bqs $$1) {
   }

   public bqt a(bst $$0, bqs $$1) {
      if (this.N_()) {
         if ($$0 instanceof bqx) {
            this.a((bqx)$$0);
         }

         return bqt.e;
      } else {
         cuo $$2 = this.b($$1);
         cuo $$3 = $$2.s();
         bqt $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cA.d && $$2 == this.b($$1) && $$2.I() < $$3.I()) {
               $$2.e($$3.I());
            }

            return $$4;
         } else {
            if (!$$2.e() && $$0 instanceof bto) {
               if (this.cA.d) {
                  $$2 = $$3;
               }

               bqt $$5 = $$2.a(this, (bto)$$0, $$1);
               if ($$5.a()) {
                  this.dP().a(dwu.r, $$0.dn(), dwu.a.a(this));
                  if ($$2.e() && !this.cA.d) {
                     this.a($$1, cuo.l);
                  }

                  return $$5;
               }
            }

            return bqt.e;
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
   protected evq a(evq $$0, btt $$1) {
      float $$2 = this.dJ();
      if (!this.cA.b && !($$0.d > 0.0) && ($$1 == btt.a || $$1 == btt.b) && this.fT() && this.E($$2)) {
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

         return new evq($$3, $$0.d, $$4);
      } else {
         return $$0;
      }
   }

   private boolean E(float $$0) {
      return this.aE() || this.ac < $$0 && !this.b(0.0, 0.0, $$0 - this.ac);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      evl $$3 = this.cK();
      return this.dP().a(this, new evl($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(bst $$0) {
      if ($$0.ct()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.g(buw.c);
            float $$2 = daa.a(this.eX(), $$0.ak());
            float $$3 = this.D(0.5F);
            $$1 *= 0.2F + $$3 * $$3 * 0.8F;
            $$2 *= $$3;
            this.gw();
            if ($$0.ak().a(aws.H) && $$0 instanceof cno $$4) {
               $$4.a(cnp.c, this, this, true);
            } else {
               if ($$1 > 0.0F || $$2 > 0.0F) {
                  boolean $$5 = $$3 > 0.9F;
                  boolean $$6 = false;
                  int $$7 = 0;
                  $$7 += daa.c(this);
                  if (this.cb() && $$5) {
                     this.dP().a(null, this.du(), this.dw(), this.dA(), avz.tZ, this.de(), 1.0F, 1.0F);
                     $$7++;
                     $$6 = true;
                  }

                  $$1 += this.b(bqs.a).g().a(this, $$1);
                  boolean $$8 = $$5
                     && this.ac > 0.0F
                     && !this.aE()
                     && !this.q_()
                     && !this.be()
                     && !this.b(bsd.o)
                     && !this.bR()
                     && $$0 instanceof bto
                     && !this.cb();
                  if ($$8) {
                     $$1 *= 1.5F;
                  }

                  $$1 += $$2;
                  boolean $$9 = false;
                  double $$10 = (double)(this.Z - this.Y);
                  if ($$5 && !$$8 && !$$6 && this.aE() && $$10 < (double)this.fn()) {
                     cuo $$11 = this.b(bqs.a);
                     if ($$11.g() instanceof cwb) {
                        $$9 = true;
                     }
                  }

                  float $$12 = 0.0F;
                  boolean $$13 = false;
                  int $$14 = daa.d(this);
                  if ($$0 instanceof bto) {
                     $$12 = ((bto)$$0).eA();
                     if ($$14 > 0 && !$$0.bQ()) {
                        $$13 = true;
                        $$0.g(1);
                     }
                  }

                  evq $$15 = $$0.ds();
                  boolean $$16 = $$0.a(this.dQ().a(this), $$1);
                  if ($$16) {
                     if ($$7 > 0) {
                        if ($$0 instanceof bto) {
                           ((bto)$$0)
                              .q(
                                 (double)((float)$$7 * 0.5F),
                                 (double)ayy.a(this.dF() * (float) (Math.PI / 180.0)),
                                 (double)(-ayy.b(this.dF() * (float) (Math.PI / 180.0)))
                              );
                        } else {
                           $$0.j(
                              (double)(-ayy.a(this.dF() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F),
                              0.1,
                              (double)(ayy.b(this.dF() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F)
                           );
                        }

                        this.h(this.ds().d(0.6, 1.0, 0.6));
                        this.h(false);
                     }

                     if ($$9) {
                        float $$17 = 1.0F + daa.a(this) * $$1;

                        for (bto $$19 : this.dP().a(bto.class, $$0.cK().c(1.0, 0.25, 1.0))) {
                           if ($$19 != this && $$19 != $$0 && !this.s($$19) && (!($$19 instanceof ciw) || !((ciw)$$19).z()) && this.g((bst)$$19) < 9.0) {
                              $$19.q(0.4F, (double)ayy.a(this.dF() * (float) (Math.PI / 180.0)), (double)(-ayy.b(this.dF() * (float) (Math.PI / 180.0))));
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
                     if ($$0 instanceof bto) {
                        daa.a((bto)$$0, this);
                     }

                     daa.b(this, $$0);
                     cuo $$20 = this.eX();
                     bst $$21 = $$0;
                     if ($$0 instanceof chy) {
                        $$21 = ((chy)$$0).b;
                     }

                     if (!this.dP().B && !$$20.e() && $$21 instanceof bto) {
                        $$20.a((bto)$$21, this);
                        if ($$20.e()) {
                           this.a(bqs.a, cuo.l);
                        }
                     }

                     if ($$0 instanceof bto) {
                        float $$22 = $$12 - ((bto)$$0).eA();
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
   protected void g(bto $$0) {
      this.e($$0);
   }

   public void fY() {
      this.gx().a(cur.vs, 100);
      this.fB();
      this.dP().a(this, (byte)30);
   }

   @Override
   public void b(bst $$0) {
   }

   public void c(bst $$0) {
   }

   public void fZ() {
      double $$0 = (double)(-ayy.a(this.dF() * (float) (Math.PI / 180.0)));
      double $$1 = (double)ayy.b(this.dF() * (float) (Math.PI / 180.0));
      if (this.dP() instanceof are) {
         ((are)this.dP()).a(li.aj, this.du() + $$0, this.e(0.5), this.dA() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void ga() {
   }

   @Override
   public void a(bst.c $$0) {
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

   public cmv gc() {
      return this.g;
   }

   public cmt gd() {
      return this.cA;
   }

   @Override
   public boolean fP() {
      return this.cA.d;
   }

   public void a(cuo $$0, cuo $$1, cqb $$2) {
   }

   public boolean ge() {
      return this.cb != this.ca;
   }

   public Either<cmw.a, bab> a(iz $$0) {
      this.b($$0);
      this.cz = 0;
      return Either.right(bab.a);
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

   public static Optional<evq> a(are $$0, iz $$1, float $$2, boolean $$3, boolean $$4) {
      dsb $$5 = $$0.a_($$1);
      dey $$6 = $$5.b();
      if ($$6 instanceof dlg && ($$3 || $$5.c(dlg.d) > 0) && dlg.a($$0)) {
         Optional<evq> $$7 = dlg.a(bsz.by, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dlg.d, Integer.valueOf($$5.c(dlg.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof der && der.a($$0)) {
         return der.a(bsz.by, $$0, $$1, $$5.c(der.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dsb $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new evq((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
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

   public int a(Collection<cyw<?>> $$0) {
      return 0;
   }

   public void a(cyw<?> $$0, List<cuo> $$1) {
   }

   public void b(List<ale> $$0) {
   }

   public int b(Collection<cyw<?>> $$0) {
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
   public void a(evq $$0) {
      if (this.cc() && !this.bR()) {
         double $$1 = this.bL().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bn || !this.dP().a_(iz.a(this.du(), this.dw() + 1.0 - 0.1, this.dA())).u().c()) {
            evq $$3 = this.ds();
            this.h($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cA.b && !this.bR()) {
         double $$4 = this.ds().d;
         super.a($$0);
         evq $$5 = this.ds();
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
      return (float)this.g(buw.r);
   }

   @Override
   public boolean a(float $$0, float $$1, brm $$2) {
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
      if (!this.aE() && !this.fE() && !this.be() && !this.b(bsd.y)) {
         cuo $$0 = this.a(bta.e);
         if ($$0.a(cur.nT) && ctk.j($$0)) {
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
   protected void b(iz $$0, dsb $$1) {
      if (this.be()) {
         this.aT();
         this.b($$1);
      } else {
         iz $$2 = this.f($$0);
         if (!$$0.equals($$2)) {
            dsb $$3 = this.dP().a_($$2);
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
   public bto.a eL() {
      return new bto.a(avz.uo, avz.ue);
   }

   @Override
   public boolean a(are $$0, bto $$1) {
      this.b(awj.g.b($$1.ak()));
      return true;
   }

   @Override
   public void a(dsb $$0, evq $$1) {
      if (!this.cA.b) {
         super.a($$0, $$1);
      }

      this.gE();
   }

   public void d(int $$0) {
      this.t($$0);
      this.cq = this.cq + (float)$$0 / (float)this.gl();
      this.cp = ayy.a(this.cp + $$0, 0, Integer.MAX_VALUE);

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
   public void a(cuo $$0, int $$1) {
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

   public Optional<cmc> aa() {
      return Optional.empty();
   }

   public cpp gm() {
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

   public boolean a(iz $$0, je $$1, cuo $$2) {
      if (this.cA.e) {
         return true;
      } else {
         iz $$3 = $$0.a($$1.g());
         dsf $$4 = new dsf(this.dP(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   public int ej() {
      if (!this.dP().ab().b(dbt.d) && !this.N_()) {
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
   protected bst.b bb() {
      return this.cA.b || this.aE() && this.bY() ? bst.b.a : bst.b.d;
   }

   public void y() {
   }

   @Override
   public xo af() {
      return xo.b(this.cC.getName());
   }

   public crf gp() {
      return this.bZ;
   }

   @Override
   public cuo a(bta $$0) {
      if ($$0 == bta.a) {
         return this.g.f();
      } else if ($$0 == bta.b) {
         return this.g.j.get(0);
      } else {
         return $$0.a() == bta.a.b ? this.g.i.get($$0.b()) : cuo.l;
      }
   }

   @Override
   protected boolean b(bta $$0) {
      return $$0.a() == bta.a.b;
   }

   @Override
   public void a(bta $$0, cuo $$1) {
      this.e($$1);
      if ($$0 == bta.a) {
         this.a($$0, this.g.h.set(this.g.k, $$1), $$1);
      } else if ($$0 == bta.b) {
         this.a($$0, this.g.j.set(0, $$1), $$1);
      } else if ($$0.a() == bta.a.b) {
         this.a($$0, this.g.i.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cuo $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<cuo> fa() {
      return Lists.newArrayList(new cuo[]{this.eX(), this.eY()});
   }

   @Override
   public Iterable<cuo> eZ() {
      return this.g.i;
   }

   @Override
   public boolean d(bta $$0) {
      return $$0 != bta.g;
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
         bsz.a($$0, this.dP()).ifPresent($$0x -> {
            if ($$0x instanceof bul) {
               ((bul)$$0x).b(this.az);
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

   public ewu gr() {
      return this.dP().M();
   }

   @Override
   public xo O_() {
      yc $$0 = ewp.a(this.cj(), this.af());
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

   public boolean a(cmx $$0) {
      return (this.ap().a(bV) & $$0.a()) == $$0.a();
   }

   @Override
   public bug a_(int $$0) {
      if ($$0 == 499) {
         return new bug() {
            @Override
            public cuo a() {
               return cmw.this.cb.g();
            }

            @Override
            public boolean a(cuo $$0) {
               cmw.this.cb.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bug() {
               @Override
               public cuo a() {
                  return cmw.this.ca.q().a($$1);
               }

               @Override
               public boolean a(cuo $$0) {
                  cmw.this.ca.q().a($$1, $$0);
                  cmw.this.ca.a(cmw.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.h.size()) {
            return bug.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.bZ.b() ? bug.a(this.bZ, $$2) : super.a_($$0);
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
   public bti fu() {
      return this.ao.a(bW) == 0 ? bti.a : bti.b;
   }

   public void a(bti $$0) {
      this.ao.a(bW, (byte)($$0 == bti.a ? 0 : 1));
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
      return (float)(1.0 / this.g(buw.e) * 20.0);
   }

   public float D(float $$0) {
      return ayy.a(((float)this.aT + $$0) / this.gv(), 0.0F, 1.0F);
   }

   public void gw() {
      this.aT = 0;
   }

   public cuk gx() {
      return this.cF;
   }

   @Override
   protected float aN() {
      return !this.cA.b && !this.fE() ? super.aN() : 1.0F;
   }

   public float gy() {
      return (float)this.g(buw.o);
   }

   public boolean gz() {
      return this.cA.d && this.F() >= 2;
   }

   @Override
   public boolean f(cuo $$0) {
      bta $$1 = btq.h($$0);
      return this.a($$1).e();
   }

   @Override
   public bsw e(bua $$0) {
      return c.getOrDefault($$0, bU);
   }

   @Override
   public ImmutableList<bua> fI() {
      return ImmutableList.of(bua.a, bua.f, bua.d);
   }

   @Override
   public cuo g(cuo $$0) {
      if (!($$0.g() instanceof cvh)) {
         return cuo.l;
      } else {
         Predicate<cuo> $$1 = ((cvh)$$0.g()).d();
         cuo $$2 = cvh.a(this, $$1);
         if (!$$2.e()) {
            return $$2;
         } else {
            $$1 = ((cvh)$$0.g()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cuo $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cA.d ? new cuo(cur.ov) : cuo.l;
         }
      }
   }

   @Override
   public cuo a(dbx $$0, cuo $$1) {
      this.gm().a($$1);
      this.b(awj.c.b($$1.g()));
      $$0.a(null, this.du(), this.dw(), this.dA(), avz.ug, awa.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof arf) {
         am.A.a((arf)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dsb $$0) {
      return this.cA.b || super.c($$0);
   }

   @Override
   public evq q(float $$0) {
      double $$1 = 0.22 * (this.fu() == bti.b ? -1.0 : 1.0);
      float $$2 = ayy.i($$0 * 0.5F, this.dH(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = ayy.i($$0, this.aZ, this.aY) * (float) (Math.PI / 180.0);
      if (this.fE() || this.fr()) {
         evq $$4 = this.f($$0);
         evq $$5 = this.ds();
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

         return this.l($$0).e(new evq($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cd()) {
         return this.l($$0).e(new evq($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cK().c() - 1.0;
         double $$13 = this.ca() ? -0.2 : 0.07;
         return this.l($$0).e(new evq($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dO() {
      return true;
   }

   public boolean gA() {
      return this.fv() && this.fx().a(cur.qX);
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
      return this.g(buw.g);
   }

   public double gD() {
      return this.g(buw.h);
   }

   public boolean b(bst $$0, double $$1) {
      return $$0.dK() ? false : this.a($$0.cK(), $$1);
   }

   public boolean a(evl $$0, double $$1) {
      double $$2 = this.gD() + $$1;
      return $$0.e(this.bx()) < $$2 * $$2;
   }

   public boolean a(iz $$0, double $$1) {
      double $$2 = this.gC() + $$1;
      return new evl($$0).e(this.bx()) < $$2 * $$2;
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
