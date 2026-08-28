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

public abstract class cmx extends btp {
   private static final Logger b = LogUtils.getLogger();
   public static final btj bF = btj.b;
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
   public static final evr bT = new evr(0.0, 0.6, 0.0);
   public static final bsx bU = bsx.b(0.6F, 1.8F).b(1.62F).a(bsw.a().a(bsv.b, bT));
   private static final Map<bub, bsx> c = ImmutableMap.builder()
      .put(bub.a, bU)
      .put(bub.c, aG)
      .put(bub.b, bsx.b(0.6F, 0.6F).b(0.4F))
      .put(bub.d, bsx.b(0.6F, 0.6F).b(0.4F))
      .put(bub.e, bsx.b(0.6F, 0.6F).b(0.4F))
      .put(bub.f, bsx.b(0.6F, 1.5F).b(1.27F).a(bsw.a().a(bsv.b, bT)))
      .put(bub.h, bsx.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final akk<Float> d = ako.a(cmx.class, akm.d);
   private static final akk<Integer> e = ako.a(cmx.class, akm.b);
   protected static final akk<Byte> bV = ako.a(cmx.class, akm.a);
   protected static final akk<Byte> bW = ako.a(cmx.class, akm.a);
   protected static final akk<us> bX = ako.a(cmx.class, akm.t);
   protected static final akk<us> bY = ako.a(cmx.class, akm.t);
   private long f;
   final cmw g = new cmw(this);
   protected crg bZ = new crg();
   public final cqv ca;
   public cpu cb;
   protected cpq cc = new cpq();
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
   private final cmu cA = new cmu();
   public int co;
   public int cp;
   public float cq;
   protected int cr;
   protected final float cs = 0.02F;
   private int cB;
   private final GameProfile cC;
   private boolean cD;
   private cup cE = cup.l;
   private final cul cF = this.k();
   private Optional<jh> cG = Optional.empty();
   @Nullable
   public cnl ct;
   protected float cu;
   @Nullable
   public evr cv;
   @Nullable
   public bsu cw;
   public boolean cx;

   public cmx(dby $$0, iz $$1, float $$2, GameProfile $$3) {
      super(bta.by, $$0);
      this.a_($$3.getId());
      this.cC = $$3;
      this.ca = new cqv(this.g, !$$0.B, this);
      this.cb = this.ca;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bk = 180.0F;
   }

   public boolean a(dby $$0, iz $$1, dbv $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dbv.d) {
         return true;
      } else if (this.go()) {
         return false;
      } else {
         cup $$3 = this.eX();
         return $$3.e() || !$$3.b(new dsg($$0, $$1, false));
      }
   }

   public static buw.a fQ() {
      return btp.dU().a(bux.c, 1.0).a(bux.r, 0.1F).a(bux.e).a(bux.o).a(bux.g, 4.5).a(bux.h, 3.0).a(bux.f);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(bV, (byte)0);
      $$0.a(bW, (byte)bF.a());
      $$0.a(bX, new us());
      $$0.a(bY, new us());
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
         this.a(awk.k);
         this.a(awk.l);
         if (this.bD()) {
            this.a(awk.m);
         }

         if (this.bY()) {
            this.a(awk.o);
         }

         if (!this.fL()) {
            this.a(awk.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = ayz.a(this.du(), -2.9999999E7, 2.9999999E7);
      double $$2 = ayz.a(this.dA(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.du() || $$2 != this.dA()) {
         this.a_($$1, this.dw(), $$2);
      }

      this.aT++;
      cup $$3 = this.eX();
      if (!cup.a(this.cE, $$3)) {
         if (!cup.b(this.cE, $$3)) {
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
      this.cn = this.a(awv.a);
      return this.cn;
   }

   private void u() {
      cup $$0 = this.a(btb.f);
      if ($$0.a(cus.oo) && !this.a(awv.a)) {
         this.b(new bsc(bse.m, 200, 0, false, false, true));
      }
   }

   protected cul k() {
      return new cul();
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
      if (this.h(bub.d)) {
         bub $$0;
         if (this.fE()) {
            $$0 = bub.b;
         } else if (this.fL()) {
            $$0 = bub.c;
         } else if (this.cc()) {
            $$0 = bub.d;
         } else if (this.fr()) {
            $$0 = bub.e;
         } else if (this.bV() && !this.cA.b) {
            $$0 = bub.f;
         } else {
            $$0 = bub.a;
         }

         bub $$6;
         if (this.N_() || this.bR() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bub.f)) {
            $$6 = bub.f;
         } else {
            $$6 = bub.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bub $$0) {
      return this.dP().a(this, this.a($$0).a(this.dn()).h(1.0E-7));
   }

   @Override
   public int az() {
      return Math.max(1, this.dP().ab().c(this.cA.a ? dbu.F : dbu.E));
   }

   @Override
   protected avz aP() {
      return awa.ur;
   }

   @Override
   protected avz aQ() {
      return awa.up;
   }

   @Override
   protected avz aR() {
      return awa.uq;
   }

   @Override
   public int bP() {
      return 10;
   }

   @Override
   public void a(avz $$0, float $$1, float $$2) {
      this.dP().a(this, this.du(), this.dw(), this.dA(), $$0, this.de(), $$1, $$2);
   }

   public void a(avz $$0, awb $$1, float $$2, float $$3) {
   }

   @Override
   public awb de() {
      return awb.h;
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

      if (this.dP().al() == bqr.a && this.dP().ab().b(dbu.k)) {
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
      this.y((float)this.g(bux.r));
      float $$1;
      if (this.aE() && !this.eB() && !this.cc()) {
         $$1 = Math.min(0.1F, (float)this.ds().h());
      } else {
         $$1 = 0.0F;
      }

      this.cf = this.cf + ($$1 - this.cf) * 0.4F;
      if (this.eA() > 0.0F && !this.N_()) {
         evm $$2;
         if (this.bR() && !this.dc().dK()) {
            $$2 = this.cK().b(this.dc().cK()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cK().c(1.0, 0.5, 1.0);
         }

         List<bsu> $$4 = this.dP().a_(this, $$2);
         List<bsu> $$5 = Lists.newArrayList();

         for (bsu $$6 : $$4) {
            if ($$6.ak() == bta.M) {
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

   private void c(@Nullable us $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dP().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bta.a($$1).filter($$0x -> $$0x == bta.ax).ifPresent($$0x -> {
            if (!cfv.a(this.dP(), this)) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), cfv.a(this.dP(), this.dP().z), this.de(), 1.0F, cfv.a(this.dP().z));
            }
         });
      }
   }

   private void d(bsu $$0) {
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
   public void a(brn $$0) {
      super.a($$0);
      this.at();
      if (!this.N_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-ayz.b((this.eJ() + this.dF()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-ayz.a((this.eJ() + this.dF()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(awk.N);
      this.a(awk.i.b(awk.m));
      this.a(awk.i.b(awk.n));
      this.aC();
      this.c(false);
      this.a(Optional.of(jh.a(this.dP().af(), this.dp())));
   }

   @Override
   protected void eD() {
      super.eD();
      if (!this.dP().ab().b(dbu.d)) {
         this.fX();
         this.g.k();
      }
   }

   protected void fX() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cup $$1 = this.g.a($$0);
         if (!$$1.e() && dab.g($$1)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected avz d(brn $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected avz o_() {
      return awa.uh;
   }

   @Nullable
   public cjh a(cup $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cjh a(cup $$0, boolean $$1, boolean $$2) {
      if ($$0.e()) {
         return null;
      } else {
         if (this.dP().B) {
            this.a(bqt.a);
         }

         double $$3 = this.dy() - 0.3F;
         cjh $$4 = new cjh(this.dP(), this.du(), $$3, this.dA(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ah.i() * 0.5F;
            float $$6 = this.ah.i() * (float) (Math.PI * 2);
            $$4.o((double)(-ayz.a($$6) * $$5), 0.2F, (double)(ayz.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = ayz.a(this.dH() * (float) (Math.PI / 180.0));
            float $$9 = ayz.b(this.dH() * (float) (Math.PI / 180.0));
            float $$10 = ayz.a(this.dF() * (float) (Math.PI / 180.0));
            float $$11 = ayz.b(this.dF() * (float) (Math.PI / 180.0));
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

   public float d(dsc $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = dab.g(this);
         cup $$3 = this.eX();
         if ($$2 > 0 && !$$3.e()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bsd.a(this)) {
         $$1 *= 1.0F + (float)(bsd.b(this) + 1) * 0.2F;
      }

      if (this.b(bse.d)) {
         $$1 *= switch (this.c(bse.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.g(bux.f);
      if (this.a(awv.a) && !dab.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aE()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dsc $$0) {
      return !$$0.y() || this.g.f().b($$0);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a_(this.cC.getId());
      uy $$1 = $$0.c("Inventory", 10);
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
      this.f(bux.r).a((double)this.cA.b());
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
         this.a(jh.b.parse(vg.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         evr.a.parse(vg.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.cv = $$0x);
      }

      this.cx = $$0.q("ignore_fall_damage_from_current_explosion");
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      vh.e($$0);
      $$0.a("Inventory", this.g.a(new uy()));
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

      this.gB().flatMap($$0x -> jh.b.encodeStart(vg.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cv != null) {
         $$0.a("current_explosion_impact_pos", (vp)evr.a.encodeStart(vg.a, this.cv).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cx);
   }

   @Override
   public boolean b(brn $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(awr.o)) {
         return !this.dP().ab().b(dbu.G);
      } else if ($$0.a(awr.n)) {
         return !this.dP().ab().b(dbu.H);
      } else if ($$0.a(awr.j)) {
         return !this.dP().ab().b(dbu.I);
      } else {
         return $$0.a(awr.p) ? !this.dP().ab().b(dbu.J) : false;
      }
   }

   @Override
   public boolean a(brn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cA.a && !$$0.a(awr.e)) {
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
               if (this.dP().al() == bqr.a) {
                  $$1 = 0.0F;
               }

               if (this.dP().al() == bqr.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dP().al() == bqr.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(btp $$0) {
      super.d($$0);
      if ($$0.fO()) {
         this.fY();
      }
   }

   @Override
   public boolean et() {
      return !this.gd().a && super.et();
   }

   public boolean a(cmx $$0) {
      ewx $$1 = this.cj();
      ewx $$2 = $$0.cj();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(brn $$0, float $$1) {
      this.a($$0, $$1, new btb[]{btb.c, btb.d, btb.e, btb.f});
   }

   @Override
   protected void c(brn $$0, float $$1) {
      this.a($$0, $$1, new btb[]{btb.f});
   }

   @Override
   protected void v(float $$0) {
      if (this.bz.a(cus.vs)) {
         if (!this.dP().B) {
            this.b(awk.c.b(this.bz.g()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + ayz.d($$0);
            bqt $$2 = this.fw();
            this.bz.a($$1, this, d($$2));
            if (this.bz.e()) {
               if ($$2 == bqt.a) {
                  this.a(btb.a, cup.l);
               } else {
                  this.a(btb.b, cup.l);
               }

               this.bz = cup.l;
               this.a(awa.wB, 0.8F, 0.8F + this.dP().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(brn $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fs(), 0.0F);
         this.A(this.fs() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(awk.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.C($$0.a());
            this.eP().a($$0, var7);
            this.t(this.eA() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(awk.J, Math.round(var7 * 10.0F));
            }

            this.a(dwv.o);
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

   public void a(dqr $$0, boolean $$1) {
   }

   public void a(daz $$0) {
   }

   public void a(dpr $$0) {
   }

   public void a(dqw $$0) {
   }

   public void a(dqh $$0) {
   }

   public void a(chj $$0, bqn $$1) {
   }

   public OptionalInt a(@Nullable bqy $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dax $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cup $$0, bqt $$1) {
   }

   public bqu a(bsu $$0, bqt $$1) {
      if (this.N_()) {
         if ($$0 instanceof bqy) {
            this.a((bqy)$$0);
         }

         return bqu.e;
      } else {
         cup $$2 = this.b($$1);
         cup $$3 = $$2.s();
         bqu $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cA.d && $$2 == this.b($$1) && $$2.I() < $$3.I()) {
               $$2.e($$3.I());
            }

            return $$4;
         } else {
            if (!$$2.e() && $$0 instanceof btp) {
               if (this.cA.d) {
                  $$2 = $$3;
               }

               bqu $$5 = $$2.a(this, (btp)$$0, $$1);
               if ($$5.a()) {
                  this.dP().a(dwv.r, $$0.dn(), dwv.a.a(this));
                  if ($$2.e() && !this.cA.d) {
                     this.a($$1, cup.l);
                  }

                  return $$5;
               }
            }

            return bqu.e;
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
   protected evr a(evr $$0, btu $$1) {
      float $$2 = this.dJ();
      if (!this.cA.b && !($$0.d > 0.0) && ($$1 == btu.a || $$1 == btu.b) && this.fT() && this.E($$2)) {
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

         return new evr($$3, $$0.d, $$4);
      } else {
         return $$0;
      }
   }

   private boolean E(float $$0) {
      return this.aE() || this.ac < $$0 && !this.b(0.0, 0.0, $$0 - this.ac);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      evm $$3 = this.cK();
      return this.dP().a(this, new evm($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(bsu $$0) {
      if ($$0.ct()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.g(bux.c);
            float $$2 = dab.a(this.eX(), $$0.ak());
            float $$3 = this.D(0.5F);
            $$1 *= 0.2F + $$3 * $$3 * 0.8F;
            $$2 *= $$3;
            this.gw();
            if ($$0.ak().a(awt.H) && $$0 instanceof cnp $$4) {
               $$4.a(cnq.c, this, this, true);
            } else {
               if ($$1 > 0.0F || $$2 > 0.0F) {
                  boolean $$5 = $$3 > 0.9F;
                  boolean $$6 = false;
                  int $$7 = 0;
                  $$7 += dab.c(this);
                  if (this.cb() && $$5) {
                     this.dP().a(null, this.du(), this.dw(), this.dA(), awa.tZ, this.de(), 1.0F, 1.0F);
                     $$7++;
                     $$6 = true;
                  }

                  $$1 += this.b(bqt.a).g().a(this, $$1);
                  boolean $$8 = $$5
                     && this.ac > 0.0F
                     && !this.aE()
                     && !this.q_()
                     && !this.be()
                     && !this.b(bse.o)
                     && !this.bR()
                     && $$0 instanceof btp
                     && !this.cb();
                  if ($$8) {
                     $$1 *= 1.5F;
                  }

                  $$1 += $$2;
                  boolean $$9 = false;
                  double $$10 = (double)(this.Z - this.Y);
                  if ($$5 && !$$8 && !$$6 && this.aE() && $$10 < (double)this.fn()) {
                     cup $$11 = this.b(bqt.a);
                     if ($$11.g() instanceof cwc) {
                        $$9 = true;
                     }
                  }

                  float $$12 = 0.0F;
                  boolean $$13 = false;
                  int $$14 = dab.d(this);
                  if ($$0 instanceof btp) {
                     $$12 = ((btp)$$0).eA();
                     if ($$14 > 0 && !$$0.bQ()) {
                        $$13 = true;
                        $$0.g(1);
                     }
                  }

                  evr $$15 = $$0.ds();
                  boolean $$16 = $$0.a(this.dQ().a(this), $$1);
                  if ($$16) {
                     if ($$7 > 0) {
                        if ($$0 instanceof btp) {
                           ((btp)$$0)
                              .q(
                                 (double)((float)$$7 * 0.5F),
                                 (double)ayz.a(this.dF() * (float) (Math.PI / 180.0)),
                                 (double)(-ayz.b(this.dF() * (float) (Math.PI / 180.0)))
                              );
                        } else {
                           $$0.j(
                              (double)(-ayz.a(this.dF() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F),
                              0.1,
                              (double)(ayz.b(this.dF() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F)
                           );
                        }

                        this.h(this.ds().d(0.6, 1.0, 0.6));
                        this.h(false);
                     }

                     if ($$9) {
                        float $$17 = 1.0F + dab.a(this) * $$1;

                        for (btp $$19 : this.dP().a(btp.class, $$0.cK().c(1.0, 0.25, 1.0))) {
                           if ($$19 != this && $$19 != $$0 && !this.s($$19) && (!($$19 instanceof cix) || !((cix)$$19).z()) && this.g((bsu)$$19) < 9.0) {
                              $$19.q(0.4F, (double)ayz.a(this.dF() * (float) (Math.PI / 180.0)), (double)(-ayz.b(this.dF() * (float) (Math.PI / 180.0))));
                              $$19.a(this.dQ().a(this), $$17);
                           }
                        }

                        this.dP().a(null, this.du(), this.dw(), this.dA(), awa.uc, this.de(), 1.0F, 1.0F);
                        this.fZ();
                     }

                     if ($$0 instanceof arg && $$0.U) {
                        ((arg)$$0).c.b(new afp($$0));
                        $$0.U = false;
                        $$0.h($$15);
                     }

                     if ($$8) {
                        this.dP().a(null, this.du(), this.dw(), this.dA(), awa.tY, this.de(), 1.0F, 1.0F);
                        this.b($$0);
                     }

                     if (!$$8 && !$$9) {
                        if ($$5) {
                           this.dP().a(null, this.du(), this.dw(), this.dA(), awa.ub, this.de(), 1.0F, 1.0F);
                        } else {
                           this.dP().a(null, this.du(), this.dw(), this.dA(), awa.ud, this.de(), 1.0F, 1.0F);
                        }
                     }

                     if ($$2 > 0.0F) {
                        this.c($$0);
                     }

                     this.A($$0);
                     if ($$0 instanceof btp) {
                        dab.a((btp)$$0, this);
                     }

                     dab.b(this, $$0);
                     cup $$20 = this.eX();
                     bsu $$21 = $$0;
                     if ($$0 instanceof chz) {
                        $$21 = ((chz)$$0).b;
                     }

                     if (!this.dP().B && !$$20.e() && $$21 instanceof btp) {
                        $$20.a((btp)$$21, this);
                        if ($$20.e()) {
                           this.a(bqt.a, cup.l);
                        }
                     }

                     if ($$0 instanceof btp) {
                        float $$22 = $$12 - ((btp)$$0).eA();
                        this.a(awk.G, Math.round($$22 * 10.0F));
                        if ($$14 > 0) {
                           $$0.g($$14 * 4);
                        }

                        if (this.dP() instanceof arf && $$22 > 2.0F) {
                           int $$23 = (int)((double)$$22 * 0.5);
                           ((arf)this.dP()).a(li.g, $$0.du(), $$0.e(0.5), $$0.dA(), $$23, 0.1, 0.0, 0.1, 0.2);
                        }
                     }

                     this.C(0.1F);
                  } else {
                     this.dP().a(null, this.du(), this.dw(), this.dA(), awa.ua, this.de(), 1.0F, 1.0F);
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
   protected void g(btp $$0) {
      this.e($$0);
   }

   public void fY() {
      this.gx().a(cus.vs, 100);
      this.fB();
      this.dP().a(this, (byte)30);
   }

   @Override
   public void b(bsu $$0) {
   }

   public void c(bsu $$0) {
   }

   public void fZ() {
      double $$0 = (double)(-ayz.a(this.dF() * (float) (Math.PI / 180.0)));
      double $$1 = (double)ayz.b(this.dF() * (float) (Math.PI / 180.0));
      if (this.dP() instanceof arf) {
         ((arf)this.dP()).a(li.aj, this.du() + $$0, this.e(0.5), this.dA() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void ga() {
   }

   @Override
   public void a(bsu.c $$0) {
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

   public cmw gc() {
      return this.g;
   }

   public cmu gd() {
      return this.cA;
   }

   @Override
   public boolean fP() {
      return this.cA.d;
   }

   public void a(cup $$0, cup $$1, cqc $$2) {
   }

   public boolean ge() {
      return this.cb != this.ca;
   }

   public Either<cmx.a, bac> a(iz $$0) {
      this.b($$0);
      this.cz = 0;
      return Either.right(bac.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fM();
      if (this.dP() instanceof arf && $$1) {
         ((arf)this.dP()).e();
      }

      this.cz = $$0 ? 0 : 100;
   }

   @Override
   public void fM() {
      this.a(true, true);
   }

   public static Optional<evr> a(arf $$0, iz $$1, float $$2, boolean $$3, boolean $$4) {
      dsc $$5 = $$0.a_($$1);
      dez $$6 = $$5.b();
      if ($$6 instanceof dlh && ($$3 || $$5.c(dlh.d) > 0) && dlh.a($$0)) {
         Optional<evr> $$7 = dlh.a(bta.by, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dlh.d, Integer.valueOf($$5.c(dlh.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof des && des.a($$0)) {
         return des.a(bta.by, $$0, $$1, $$5.c(des.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dsc $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new evr((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean gf() {
      return this.fL() && this.cz >= 100;
   }

   public int gg() {
      return this.cz;
   }

   public void a(xp $$0, boolean $$1) {
   }

   public void a(alf $$0) {
      this.b(awk.i.b($$0));
   }

   public void a(alf $$0, int $$1) {
      this.a(awk.i.b($$0), $$1);
   }

   public void b(awh<?> $$0) {
      this.a($$0, 1);
   }

   public void a(awh<?> $$0, int $$1) {
   }

   public void a(awh<?> $$0) {
   }

   public int a(Collection<cyx<?>> $$0) {
      return 0;
   }

   public void a(cyx<?> $$0, List<cup> $$1) {
   }

   public void b(List<alf> $$0) {
   }

   public int b(Collection<cyx<?>> $$0) {
      return 0;
   }

   @Override
   public void fj() {
      super.fj();
      this.a(awk.E);
      if (this.cb()) {
         this.C(0.2F);
      } else {
         this.C(0.05F);
      }
   }

   @Override
   public void a(evr $$0) {
      if (this.cc() && !this.bR()) {
         double $$1 = this.bL().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bn || !this.dP().a_(iz.a(this.du(), this.dw() + 1.0 - 0.1, this.dA())).u().c()) {
            evr $$3 = this.ds();
            this.h($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cA.b && !this.bR()) {
         double $$4 = this.ds().d;
         super.a($$0);
         evr $$5 = this.ds();
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
      return (float)this.g(bux.r);
   }

   @Override
   public boolean a(float $$0, float $$1, brn $$2) {
      if (this.cA.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(awk.t, (int)Math.round((double)$$0 * 100.0));
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
      if (!this.aE() && !this.fE() && !this.be() && !this.b(bse.y)) {
         cup $$0 = this.a(btb.e);
         if ($$0.a(cus.nT) && ctl.j($$0)) {
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
   protected void b(iz $$0, dsc $$1) {
      if (this.be()) {
         this.aT();
         this.b($$1);
      } else {
         iz $$2 = this.f($$0);
         if (!$$0.equals($$2)) {
            dsc $$3 = this.dP().a_($$2);
            if ($$3.a(awp.bo)) {
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
   public btp.a eL() {
      return new btp.a(awa.uo, awa.ue);
   }

   @Override
   public boolean a(arf $$0, btp $$1) {
      this.b(awk.g.b($$1.ak()));
      return true;
   }

   @Override
   public void a(dsc $$0, evr $$1) {
      if (!this.cA.b) {
         super.a($$0, $$1);
      }

      this.gE();
   }

   public void d(int $$0) {
      this.t($$0);
      this.cq = this.cq + (float)$$0 / (float)this.gl();
      this.cp = ayz.a(this.cp + $$0, 0, Integer.MAX_VALUE);

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
   public void a(cup $$0, int $$1) {
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
         this.dP().a(null, this.du(), this.dw(), this.dA(), awa.un, this.de(), $$1 * 0.75F, 1.0F);
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

   public Optional<cmd> aa() {
      return Optional.empty();
   }

   public cpq gm() {
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

   public boolean a(iz $$0, je $$1, cup $$2) {
      if (this.cA.e) {
         return true;
      } else {
         iz $$3 = $$0.a($$1.g());
         dsg $$4 = new dsg(this.dP(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   public int ej() {
      if (!this.dP().ab().b(dbu.d) && !this.N_()) {
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
   protected bsu.b bb() {
      return this.cA.b || this.aE() && this.bY() ? bsu.b.a : bsu.b.d;
   }

   public void y() {
   }

   @Override
   public xp af() {
      return xp.b(this.cC.getName());
   }

   public crg gp() {
      return this.bZ;
   }

   @Override
   public cup a(btb $$0) {
      if ($$0 == btb.a) {
         return this.g.f();
      } else if ($$0 == btb.b) {
         return this.g.j.get(0);
      } else {
         return $$0.a() == btb.a.b ? this.g.i.get($$0.b()) : cup.l;
      }
   }

   @Override
   protected boolean b(btb $$0) {
      return $$0.a() == btb.a.b;
   }

   @Override
   public void a(btb $$0, cup $$1) {
      this.e($$1);
      if ($$0 == btb.a) {
         this.a($$0, this.g.h.set(this.g.k, $$1), $$1);
      } else if ($$0 == btb.b) {
         this.a($$0, this.g.j.set(0, $$1), $$1);
      } else if ($$0.a() == btb.a.b) {
         this.a($$0, this.g.i.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cup $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<cup> fa() {
      return Lists.newArrayList(new cup[]{this.eX(), this.eY()});
   }

   @Override
   public Iterable<cup> eZ() {
      return this.g.i;
   }

   @Override
   public boolean d(btb $$0) {
      return $$0 != btb.g;
   }

   public boolean h(us $$0) {
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
         this.i(new us());
         this.k(this.gu());
         this.j(new us());
      }
   }

   private void k(us $$0) {
      if (!this.dP().B && !$$0.g()) {
         bta.a($$0, this.dP()).ifPresent($$0x -> {
            if ($$0x instanceof bum) {
               ((bum)$$0x).b(this.az);
            }

            $$0x.a_(this.du(), this.dw() + 0.7F, this.dA());
            ((arf)this.dP()).c($$0x);
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

   public ewv gr() {
      return this.dP().M();
   }

   @Override
   public xp O_() {
      yd $$0 = ewq.a(this.cj(), this.af());
      return this.a($$0);
   }

   private yd a(yd $$0) {
      String $$1 = this.gb().getName();
      return $$0.a($$1x -> $$1x.a(new xn(xn.a.d, "/tell " + $$1 + " ")).a(this.cJ()).a($$1));
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

   public boolean a(cmy $$0) {
      return (this.ap().a(bV) & $$0.a()) == $$0.a();
   }

   @Override
   public buh a_(int $$0) {
      if ($$0 == 499) {
         return new buh() {
            @Override
            public cup a() {
               return cmx.this.cb.g();
            }

            @Override
            public boolean a(cup $$0) {
               cmx.this.cb.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new buh() {
               @Override
               public cup a() {
                  return cmx.this.ca.q().a($$1);
               }

               @Override
               public boolean a(cup $$0) {
                  cmx.this.ca.q().a($$1, $$0);
                  cmx.this.ca.a(cmx.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.h.size()) {
            return buh.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.bZ.b() ? buh.a(this.bZ, $$2) : super.a_($$0);
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
   public btj fu() {
      return this.ao.a(bW) == 0 ? btj.a : btj.b;
   }

   public void a(btj $$0) {
      this.ao.a(bW, (byte)($$0 == btj.a ? 0 : 1));
   }

   public us gt() {
      return this.ao.a(bX);
   }

   protected void i(us $$0) {
      this.ao.a(bX, $$0);
   }

   public us gu() {
      return this.ao.a(bY);
   }

   protected void j(us $$0) {
      this.ao.a(bY, $$0);
   }

   public float gv() {
      return (float)(1.0 / this.g(bux.e) * 20.0);
   }

   public float D(float $$0) {
      return ayz.a(((float)this.aT + $$0) / this.gv(), 0.0F, 1.0F);
   }

   public void gw() {
      this.aT = 0;
   }

   public cul gx() {
      return this.cF;
   }

   @Override
   protected float aN() {
      return !this.cA.b && !this.fE() ? super.aN() : 1.0F;
   }

   public float gy() {
      return (float)this.g(bux.o);
   }

   public boolean gz() {
      return this.cA.d && this.F() >= 2;
   }

   @Override
   public boolean f(cup $$0) {
      btb $$1 = btr.h($$0);
      return this.a($$1).e();
   }

   @Override
   public bsx e(bub $$0) {
      return c.getOrDefault($$0, bU);
   }

   @Override
   public ImmutableList<bub> fI() {
      return ImmutableList.of(bub.a, bub.f, bub.d);
   }

   @Override
   public cup g(cup $$0) {
      if (!($$0.g() instanceof cvi)) {
         return cup.l;
      } else {
         Predicate<cup> $$1 = ((cvi)$$0.g()).d();
         cup $$2 = cvi.a(this, $$1);
         if (!$$2.e()) {
            return $$2;
         } else {
            $$1 = ((cvi)$$0.g()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cup $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cA.d ? new cup(cus.ov) : cup.l;
         }
      }
   }

   @Override
   public cup a(dby $$0, cup $$1) {
      this.gm().a($$1);
      this.b(awk.c.b($$1.g()));
      $$0.a(null, this.du(), this.dw(), this.dA(), awa.ug, awb.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof arg) {
         am.A.a((arg)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dsc $$0) {
      return this.cA.b || super.c($$0);
   }

   @Override
   public evr q(float $$0) {
      double $$1 = 0.22 * (this.fu() == btj.b ? -1.0 : 1.0);
      float $$2 = ayz.i($$0 * 0.5F, this.dH(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = ayz.i($$0, this.aZ, this.aY) * (float) (Math.PI / 180.0);
      if (this.fE() || this.fr()) {
         evr $$4 = this.f($$0);
         evr $$5 = this.ds();
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

         return this.l($$0).e(new evr($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cd()) {
         return this.l($$0).e(new evr($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cK().c() - 1.0;
         double $$13 = this.ca() ? -0.2 : 0.07;
         return this.l($$0).e(new evr($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dO() {
      return true;
   }

   public boolean gA() {
      return this.fv() && this.fx().a(cus.qX);
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
      return this.g(bux.g);
   }

   public double gD() {
      return this.g(bux.h);
   }

   public boolean b(bsu $$0, double $$1) {
      return $$0.dK() ? false : this.a($$0.cK(), $$1);
   }

   public boolean a(evm $$0, double $$1) {
      double $$2 = this.gD() + $$1;
      return $$0.e(this.bx()) < $$2 * $$2;
   }

   public boolean a(iz $$0, double $$1) {
      double $$2 = this.gC() + $$1;
      return new evm($$0).e(this.bx()) < $$2 * $$2;
   }

   public void gE() {
      this.cw = null;
      this.cv = null;
      this.cx = false;
   }

   public static enum a {
      a,
      b(xp.c("block.minecraft.bed.no_sleep")),
      c(xp.c("block.minecraft.bed.too_far_away")),
      d(xp.c("block.minecraft.bed.obstructed")),
      e,
      f(xp.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final xp g;

      private a() {
         this.g = null;
      }

      private a(final xp $$0) {
         this.g = $$0;
      }

      @Nullable
      public xp a() {
         return this.g;
      }
   }
}
