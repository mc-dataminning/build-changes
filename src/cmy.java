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

public abstract class cmy extends btq {
   private static final Logger b = LogUtils.getLogger();
   public static final btk bF = btk.b;
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
   public static final evs bT = new evs(0.0, 0.6, 0.0);
   public static final bsy bU = bsy.b(0.6F, 1.8F).b(1.62F).a(bsx.a().a(bsw.b, bT));
   private static final Map<buc, bsy> c = ImmutableMap.builder()
      .put(buc.a, bU)
      .put(buc.c, aG)
      .put(buc.b, bsy.b(0.6F, 0.6F).b(0.4F))
      .put(buc.d, bsy.b(0.6F, 0.6F).b(0.4F))
      .put(buc.e, bsy.b(0.6F, 0.6F).b(0.4F))
      .put(buc.f, bsy.b(0.6F, 1.5F).b(1.27F).a(bsx.a().a(bsw.b, bT)))
      .put(buc.h, bsy.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final akk<Float> d = ako.a(cmy.class, akm.d);
   private static final akk<Integer> e = ako.a(cmy.class, akm.b);
   protected static final akk<Byte> bV = ako.a(cmy.class, akm.a);
   protected static final akk<Byte> bW = ako.a(cmy.class, akm.a);
   protected static final akk<us> bX = ako.a(cmy.class, akm.t);
   protected static final akk<us> bY = ako.a(cmy.class, akm.t);
   private long f;
   final cmx g = new cmx(this);
   protected crh bZ = new crh();
   public final cqw ca;
   public cpv cb;
   protected cpr cc = new cpr();
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
   private final cmv cA = new cmv();
   public int co;
   public int cp;
   public float cq;
   protected int cr;
   protected final float cs = 0.02F;
   private int cB;
   private final GameProfile cC;
   private boolean cD;
   private cuq cE = cuq.l;
   private final cum cF = this.k();
   private Optional<jh> cG = Optional.empty();
   @Nullable
   public cnm ct;
   protected float cu;
   @Nullable
   public evs cv;
   @Nullable
   public bsv cw;
   public boolean cx;

   public cmy(dbz $$0, iz $$1, float $$2, GameProfile $$3) {
      super(btb.by, $$0);
      this.a_($$3.getId());
      this.cC = $$3;
      this.ca = new cqw(this.g, !$$0.B, this);
      this.cb = this.ca;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bk = 180.0F;
   }

   public boolean a(dbz $$0, iz $$1, dbw $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dbw.d) {
         return true;
      } else if (this.go()) {
         return false;
      } else {
         cuq $$3 = this.eX();
         return $$3.e() || !$$3.b(new dsh($$0, $$1, false));
      }
   }

   public static bux.a fQ() {
      return btq.dU().a(buy.c, 1.0).a(buy.r, 0.1F).a(buy.e).a(buy.o).a(buy.g, 4.5).a(buy.h, 3.0).a(buy.f);
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
      cuq $$3 = this.eX();
      if (!cuq.a(this.cE, $$3)) {
         if (!cuq.b(this.cE, $$3)) {
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
      cuq $$0 = this.a(btc.f);
      if ($$0.a(cut.oo) && !this.a(awv.a)) {
         this.b(new bsd(bsf.m, 200, 0, false, false, true));
      }
   }

   protected cum k() {
      return new cum();
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
      if (this.h(buc.d)) {
         buc $$0;
         if (this.fE()) {
            $$0 = buc.b;
         } else if (this.fL()) {
            $$0 = buc.c;
         } else if (this.cc()) {
            $$0 = buc.d;
         } else if (this.fr()) {
            $$0 = buc.e;
         } else if (this.bV() && !this.cA.b) {
            $$0 = buc.f;
         } else {
            $$0 = buc.a;
         }

         buc $$6;
         if (this.N_() || this.bR() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(buc.f)) {
            $$6 = buc.f;
         } else {
            $$6 = buc.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(buc $$0) {
      return this.dP().a(this, this.a($$0).a(this.dn()).h(1.0E-7));
   }

   @Override
   public int az() {
      return Math.max(1, this.dP().ab().c(this.cA.a ? dbv.F : dbv.E));
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

      if (this.dP().al() == bqs.a && this.dP().ab().b(dbv.k)) {
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
      this.y((float)this.g(buy.r));
      float $$1;
      if (this.aE() && !this.eB() && !this.cc()) {
         $$1 = Math.min(0.1F, (float)this.ds().h());
      } else {
         $$1 = 0.0F;
      }

      this.cf = this.cf + ($$1 - this.cf) * 0.4F;
      if (this.eA() > 0.0F && !this.N_()) {
         evn $$2;
         if (this.bR() && !this.dc().dK()) {
            $$2 = this.cK().b(this.dc().cK()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cK().c(1.0, 0.5, 1.0);
         }

         List<bsv> $$4 = this.dP().a_(this, $$2);
         List<bsv> $$5 = Lists.newArrayList();

         for (bsv $$6 : $$4) {
            if ($$6.ak() == btb.M) {
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
         btb.a($$1).filter($$0x -> $$0x == btb.ax).ifPresent($$0x -> {
            if (!cfw.a(this.dP(), this)) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), cfw.a(this.dP(), this.dP().z), this.de(), 1.0F, cfw.a(this.dP().z));
            }
         });
      }
   }

   private void d(bsv $$0) {
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
   public void a(bro $$0) {
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
      if (!this.dP().ab().b(dbv.d)) {
         this.fX();
         this.g.k();
      }
   }

   protected void fX() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cuq $$1 = this.g.a($$0);
         if (!$$1.e() && dac.g($$1)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected avz d(bro $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected avz o_() {
      return awa.uh;
   }

   @Nullable
   public cji a(cuq $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cji a(cuq $$0, boolean $$1, boolean $$2) {
      if ($$0.e()) {
         return null;
      } else {
         if (this.dP().B) {
            this.a(bqu.a);
         }

         double $$3 = this.dy() - 0.3F;
         cji $$4 = new cji(this.dP(), this.du(), $$3, this.dA(), $$0);
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

   public float d(dsd $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = dac.g(this);
         cuq $$3 = this.eX();
         if ($$2 > 0 && !$$3.e()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bse.a(this)) {
         $$1 *= 1.0F + (float)(bse.b(this) + 1) * 0.2F;
      }

      if (this.b(bsf.d)) {
         $$1 *= switch (this.c(bsf.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.g(buy.f);
      if (this.a(awv.a) && !dac.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aE()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dsd $$0) {
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
      this.f(buy.r).a((double)this.cA.b());
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
         evs.a.parse(vg.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.cv = $$0x);
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
         $$0.a("current_explosion_impact_pos", (vp)evs.a.encodeStart(vg.a, this.cv).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cx);
   }

   @Override
   public boolean b(bro $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(awr.o)) {
         return !this.dP().ab().b(dbv.G);
      } else if ($$0.a(awr.n)) {
         return !this.dP().ab().b(dbv.H);
      } else if ($$0.a(awr.j)) {
         return !this.dP().ab().b(dbv.I);
      } else {
         return $$0.a(awr.p) ? !this.dP().ab().b(dbv.J) : false;
      }
   }

   @Override
   public boolean a(bro $$0, float $$1) {
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
               if (this.dP().al() == bqs.a) {
                  $$1 = 0.0F;
               }

               if (this.dP().al() == bqs.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dP().al() == bqs.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(btq $$0) {
      super.d($$0);
      if ($$0.fO()) {
         this.fY();
      }
   }

   @Override
   public boolean et() {
      return !this.gd().a && super.et();
   }

   public boolean a(cmy $$0) {
      ewy $$1 = this.cj();
      ewy $$2 = $$0.cj();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bro $$0, float $$1) {
      this.a($$0, $$1, new btc[]{btc.c, btc.d, btc.e, btc.f});
   }

   @Override
   protected void c(bro $$0, float $$1) {
      this.a($$0, $$1, new btc[]{btc.f});
   }

   @Override
   protected void v(float $$0) {
      if (this.bz.a(cut.vs)) {
         if (!this.dP().B) {
            this.b(awk.c.b(this.bz.g()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + ayz.d($$0);
            bqu $$2 = this.fw();
            this.bz.a($$1, this, d($$2));
            if (this.bz.e()) {
               if ($$2 == bqu.a) {
                  this.a(btc.a, cuq.l);
               } else {
                  this.a(btc.b, cuq.l);
               }

               this.bz = cuq.l;
               this.a(awa.wB, 0.8F, 0.8F + this.dP().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bro $$0, float $$1) {
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

            this.a(dww.o);
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

   public void a(dqs $$0, boolean $$1) {
   }

   public void a(dba $$0) {
   }

   public void a(dps $$0) {
   }

   public void a(dqx $$0) {
   }

   public void a(dqi $$0) {
   }

   public void a(chk $$0, bqo $$1) {
   }

   public OptionalInt a(@Nullable bqz $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, day $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cuq $$0, bqu $$1) {
   }

   public bqv a(bsv $$0, bqu $$1) {
      if (this.N_()) {
         if ($$0 instanceof bqz) {
            this.a((bqz)$$0);
         }

         return bqv.e;
      } else {
         cuq $$2 = this.b($$1);
         cuq $$3 = $$2.s();
         bqv $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cA.d && $$2 == this.b($$1) && $$2.I() < $$3.I()) {
               $$2.e($$3.I());
            }

            return $$4;
         } else {
            if (!$$2.e() && $$0 instanceof btq) {
               if (this.cA.d) {
                  $$2 = $$3;
               }

               bqv $$5 = $$2.a(this, (btq)$$0, $$1);
               if ($$5.a()) {
                  this.dP().a(dww.r, $$0.dn(), dww.a.a(this));
                  if ($$2.e() && !this.cA.d) {
                     this.a($$1, cuq.l);
                  }

                  return $$5;
               }
            }

            return bqv.e;
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
   protected evs a(evs $$0, btv $$1) {
      float $$2 = this.dJ();
      if (!this.cA.b && !($$0.d > 0.0) && ($$1 == btv.a || $$1 == btv.b) && this.fT() && this.E($$2)) {
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

         return new evs($$3, $$0.d, $$4);
      } else {
         return $$0;
      }
   }

   private boolean E(float $$0) {
      return this.aE() || this.ac < $$0 && !this.b(0.0, 0.0, $$0 - this.ac);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      evn $$3 = this.cK();
      return this.dP().a(this, new evn($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(bsv $$0) {
      if ($$0.ct()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.g(buy.c);
            float $$2 = dac.a(this.eX(), $$0.ak());
            float $$3 = this.D(0.5F);
            $$1 *= 0.2F + $$3 * $$3 * 0.8F;
            $$2 *= $$3;
            this.gw();
            if ($$0.ak().a(awt.H) && $$0 instanceof cnq $$4) {
               $$4.a(cnr.c, this, this, true);
            } else {
               if ($$1 > 0.0F || $$2 > 0.0F) {
                  boolean $$5 = $$3 > 0.9F;
                  boolean $$6 = false;
                  int $$7 = 0;
                  $$7 += dac.c(this);
                  if (this.cb() && $$5) {
                     this.dP().a(null, this.du(), this.dw(), this.dA(), awa.tZ, this.de(), 1.0F, 1.0F);
                     $$7++;
                     $$6 = true;
                  }

                  $$1 += this.b(bqu.a).g().a(this, $$1);
                  boolean $$8 = $$5
                     && this.ac > 0.0F
                     && !this.aE()
                     && !this.q_()
                     && !this.be()
                     && !this.b(bsf.o)
                     && !this.bR()
                     && $$0 instanceof btq
                     && !this.cb();
                  if ($$8) {
                     $$1 *= 1.5F;
                  }

                  $$1 += $$2;
                  boolean $$9 = false;
                  double $$10 = (double)(this.Z - this.Y);
                  if ($$5 && !$$8 && !$$6 && this.aE() && $$10 < (double)this.fn()) {
                     cuq $$11 = this.b(bqu.a);
                     if ($$11.g() instanceof cwd) {
                        $$9 = true;
                     }
                  }

                  float $$12 = 0.0F;
                  boolean $$13 = false;
                  int $$14 = dac.d(this);
                  if ($$0 instanceof btq) {
                     $$12 = ((btq)$$0).eA();
                     if ($$14 > 0 && !$$0.bQ()) {
                        $$13 = true;
                        $$0.g(1);
                     }
                  }

                  evs $$15 = $$0.ds();
                  boolean $$16 = $$0.a(this.dQ().a(this), $$1);
                  if ($$16) {
                     if ($$7 > 0) {
                        if ($$0 instanceof btq) {
                           ((btq)$$0)
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
                        float $$17 = 1.0F + dac.a(this) * $$1;

                        for (btq $$19 : this.dP().a(btq.class, $$0.cK().c(1.0, 0.25, 1.0))) {
                           if ($$19 != this && $$19 != $$0 && !this.s($$19) && (!($$19 instanceof ciy) || !((ciy)$$19).z()) && this.g((bsv)$$19) < 9.0) {
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
                     if ($$0 instanceof btq) {
                        dac.a((btq)$$0, this);
                     }

                     dac.b(this, $$0);
                     cuq $$20 = this.eX();
                     bsv $$21 = $$0;
                     if ($$0 instanceof cia) {
                        $$21 = ((cia)$$0).b;
                     }

                     if (!this.dP().B && !$$20.e() && $$21 instanceof btq) {
                        $$20.a((btq)$$21, this);
                        if ($$20.e()) {
                           this.a(bqu.a, cuq.l);
                        }
                     }

                     if ($$0 instanceof btq) {
                        float $$22 = $$12 - ((btq)$$0).eA();
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
   protected void g(btq $$0) {
      this.e($$0);
   }

   public void fY() {
      this.gx().a(cut.vs, 100);
      this.fB();
      this.dP().a(this, (byte)30);
   }

   @Override
   public void b(bsv $$0) {
   }

   public void c(bsv $$0) {
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
   public void a(bsv.c $$0) {
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

   public cmx gc() {
      return this.g;
   }

   public cmv gd() {
      return this.cA;
   }

   @Override
   public boolean fP() {
      return this.cA.d;
   }

   public void a(cuq $$0, cuq $$1, cqd $$2) {
   }

   public boolean ge() {
      return this.cb != this.ca;
   }

   public Either<cmy.a, bac> a(iz $$0) {
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

   public static Optional<evs> a(arf $$0, iz $$1, float $$2, boolean $$3, boolean $$4) {
      dsd $$5 = $$0.a_($$1);
      dfa $$6 = $$5.b();
      if ($$6 instanceof dli && ($$3 || $$5.c(dli.d) > 0) && dli.a($$0)) {
         Optional<evs> $$7 = dli.a(btb.by, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dli.d, Integer.valueOf($$5.c(dli.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof det && det.a($$0)) {
         return det.a(btb.by, $$0, $$1, $$5.c(det.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dsd $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new evs((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
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

   public int a(Collection<cyy<?>> $$0) {
      return 0;
   }

   public void a(cyy<?> $$0, List<cuq> $$1) {
   }

   public void b(List<alf> $$0) {
   }

   public int b(Collection<cyy<?>> $$0) {
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
   public void a(evs $$0) {
      if (this.cc() && !this.bR()) {
         double $$1 = this.bL().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bn || !this.dP().a_(iz.a(this.du(), this.dw() + 1.0 - 0.1, this.dA())).u().c()) {
            evs $$3 = this.ds();
            this.h($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cA.b && !this.bR()) {
         double $$4 = this.ds().d;
         super.a($$0);
         evs $$5 = this.ds();
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
      return (float)this.g(buy.r);
   }

   @Override
   public boolean a(float $$0, float $$1, bro $$2) {
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
      if (!this.aE() && !this.fE() && !this.be() && !this.b(bsf.y)) {
         cuq $$0 = this.a(btc.e);
         if ($$0.a(cut.nT) && ctm.j($$0)) {
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
   protected void b(iz $$0, dsd $$1) {
      if (this.be()) {
         this.aT();
         this.b($$1);
      } else {
         iz $$2 = this.f($$0);
         if (!$$0.equals($$2)) {
            dsd $$3 = this.dP().a_($$2);
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
   public btq.a eL() {
      return new btq.a(awa.uo, awa.ue);
   }

   @Override
   public boolean a(arf $$0, btq $$1) {
      this.b(awk.g.b($$1.ak()));
      return true;
   }

   @Override
   public void a(dsd $$0, evs $$1) {
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
   public void a(cuq $$0, int $$1) {
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

   public Optional<cme> aa() {
      return Optional.empty();
   }

   public cpr gm() {
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

   public boolean a(iz $$0, je $$1, cuq $$2) {
      if (this.cA.e) {
         return true;
      } else {
         iz $$3 = $$0.a($$1.g());
         dsh $$4 = new dsh(this.dP(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   public int ej() {
      if (!this.dP().ab().b(dbv.d) && !this.N_()) {
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
   protected bsv.b bb() {
      return this.cA.b || this.aE() && this.bY() ? bsv.b.a : bsv.b.d;
   }

   public void y() {
   }

   @Override
   public xp af() {
      return xp.b(this.cC.getName());
   }

   public crh gp() {
      return this.bZ;
   }

   @Override
   public cuq a(btc $$0) {
      if ($$0 == btc.a) {
         return this.g.f();
      } else if ($$0 == btc.b) {
         return this.g.j.get(0);
      } else {
         return $$0.a() == btc.a.b ? this.g.i.get($$0.b()) : cuq.l;
      }
   }

   @Override
   protected boolean b(btc $$0) {
      return $$0.a() == btc.a.b;
   }

   @Override
   public void a(btc $$0, cuq $$1) {
      this.e($$1);
      if ($$0 == btc.a) {
         this.a($$0, this.g.h.set(this.g.k, $$1), $$1);
      } else if ($$0 == btc.b) {
         this.a($$0, this.g.j.set(0, $$1), $$1);
      } else if ($$0.a() == btc.a.b) {
         this.a($$0, this.g.i.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cuq $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<cuq> fa() {
      return Lists.newArrayList(new cuq[]{this.eX(), this.eY()});
   }

   @Override
   public Iterable<cuq> eZ() {
      return this.g.i;
   }

   @Override
   public boolean d(btc $$0) {
      return $$0 != btc.g;
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
         btb.a($$0, this.dP()).ifPresent($$0x -> {
            if ($$0x instanceof bun) {
               ((bun)$$0x).b(this.az);
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

   public eww gr() {
      return this.dP().M();
   }

   @Override
   public xp O_() {
      yd $$0 = ewr.a(this.cj(), this.af());
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

   public boolean a(cmz $$0) {
      return (this.ap().a(bV) & $$0.a()) == $$0.a();
   }

   @Override
   public bui a_(int $$0) {
      if ($$0 == 499) {
         return new bui() {
            @Override
            public cuq a() {
               return cmy.this.cb.g();
            }

            @Override
            public boolean a(cuq $$0) {
               cmy.this.cb.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bui() {
               @Override
               public cuq a() {
                  return cmy.this.ca.q().a($$1);
               }

               @Override
               public boolean a(cuq $$0) {
                  cmy.this.ca.q().a($$1, $$0);
                  cmy.this.ca.a(cmy.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.h.size()) {
            return bui.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.bZ.b() ? bui.a(this.bZ, $$2) : super.a_($$0);
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
   public btk fu() {
      return this.ao.a(bW) == 0 ? btk.a : btk.b;
   }

   public void a(btk $$0) {
      this.ao.a(bW, (byte)($$0 == btk.a ? 0 : 1));
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
      return (float)(1.0 / this.g(buy.e) * 20.0);
   }

   public float D(float $$0) {
      return ayz.a(((float)this.aT + $$0) / this.gv(), 0.0F, 1.0F);
   }

   public void gw() {
      this.aT = 0;
   }

   public cum gx() {
      return this.cF;
   }

   @Override
   protected float aN() {
      return !this.cA.b && !this.fE() ? super.aN() : 1.0F;
   }

   public float gy() {
      return (float)this.g(buy.o);
   }

   public boolean gz() {
      return this.cA.d && this.F() >= 2;
   }

   @Override
   public boolean f(cuq $$0) {
      btc $$1 = bts.h($$0);
      return this.a($$1).e();
   }

   @Override
   public bsy e(buc $$0) {
      return c.getOrDefault($$0, bU);
   }

   @Override
   public ImmutableList<buc> fI() {
      return ImmutableList.of(buc.a, buc.f, buc.d);
   }

   @Override
   public cuq g(cuq $$0) {
      if (!($$0.g() instanceof cvj)) {
         return cuq.l;
      } else {
         Predicate<cuq> $$1 = ((cvj)$$0.g()).d();
         cuq $$2 = cvj.a(this, $$1);
         if (!$$2.e()) {
            return $$2;
         } else {
            $$1 = ((cvj)$$0.g()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cuq $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cA.d ? new cuq(cut.ov) : cuq.l;
         }
      }
   }

   @Override
   public cuq a(dbz $$0, cuq $$1) {
      this.gm().a($$1);
      this.b(awk.c.b($$1.g()));
      $$0.a(null, this.du(), this.dw(), this.dA(), awa.ug, awb.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof arg) {
         am.A.a((arg)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dsd $$0) {
      return this.cA.b || super.c($$0);
   }

   @Override
   public evs q(float $$0) {
      double $$1 = 0.22 * (this.fu() == btk.b ? -1.0 : 1.0);
      float $$2 = ayz.i($$0 * 0.5F, this.dH(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = ayz.i($$0, this.aZ, this.aY) * (float) (Math.PI / 180.0);
      if (this.fE() || this.fr()) {
         evs $$4 = this.f($$0);
         evs $$5 = this.ds();
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

         return this.l($$0).e(new evs($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cd()) {
         return this.l($$0).e(new evs($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cK().c() - 1.0;
         double $$13 = this.ca() ? -0.2 : 0.07;
         return this.l($$0).e(new evs($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dO() {
      return true;
   }

   public boolean gA() {
      return this.fv() && this.fx().a(cut.qX);
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
      return this.g(buy.g);
   }

   public double gD() {
      return this.g(buy.h);
   }

   public boolean b(bsv $$0, double $$1) {
      return $$0.dK() ? false : this.a($$0.cK(), $$1);
   }

   public boolean a(evn $$0, double $$1) {
      double $$2 = this.gD() + $$1;
      return $$0.e(this.bx()) < $$2 * $$2;
   }

   public boolean a(iz $$0, double $$1) {
      double $$2 = this.gC() + $$1;
      return new evn($$0).e(this.bx()) < $$2 * $$2;
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
