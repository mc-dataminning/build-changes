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

public abstract class cmh extends bsy {
   private static final Logger b = LogUtils.getLogger();
   public static final bss bH = bss.b;
   public static final int bI = 0;
   public static final int bJ = 20;
   public static final int bK = 100;
   public static final int bL = 10;
   public static final int bM = 200;
   public static final int bN = 499;
   public static final int bO = 500;
   public static final float bP = 4.5F;
   public static final float bQ = 3.0F;
   public static final float bR = 1.5F;
   public static final float bS = 0.6F;
   public static final float bT = 0.6F;
   public static final float bU = 1.62F;
   public static final evz bV = new evz(0.0, 0.6, 0.0);
   public static final bsg bW = bsg.b(0.6F, 1.8F).b(1.62F).a(bsf.a().a(bse.b, bV));
   private static final Map<btk, bsg> c = ImmutableMap.builder()
      .put(btk.a, bW)
      .put(btk.c, aG)
      .put(btk.b, bsg.b(0.6F, 0.6F).b(0.4F))
      .put(btk.d, bsg.b(0.6F, 0.6F).b(0.4F))
      .put(btk.e, bsg.b(0.6F, 0.6F).b(0.4F))
      .put(btk.f, bsg.b(0.6F, 1.5F).b(1.27F).a(bsf.a().a(bse.b, bV)))
      .put(btk.h, bsg.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final ajp<Float> d = ajt.a(cmh.class, ajr.d);
   private static final ajp<Integer> e = ajt.a(cmh.class, ajr.b);
   protected static final ajp<Byte> bX = ajt.a(cmh.class, ajr.a);
   protected static final ajp<Byte> bY = ajt.a(cmh.class, ajr.a);
   protected static final ajp<tx> bZ = ajt.a(cmh.class, ajr.t);
   protected static final ajp<tx> ca = ajt.a(cmh.class, ajr.t);
   private long f;
   final cmg g = new cmg(this);
   protected cqr cb = new cqr();
   public final cqg cc;
   public cpe cd;
   protected cpa ce = new cpa();
   protected int cf;
   public float cg;
   public float ch;
   public int ci;
   public double cj;
   public double ck;
   public double cl;
   public double cm;
   public double cn;
   public double co;
   private int cB;
   protected boolean cp;
   private final cme cC = new cme();
   public int cq;
   public int cr;
   public float cs;
   protected int ct;
   protected final float cu = 0.02F;
   private int cD;
   private final GameProfile cE;
   private boolean cF;
   private cua cG = cua.l;
   private final ctw cH = this.k();
   private Optional<ji> cI = Optional.empty();
   @Nullable
   public cmv cv;
   protected float cw;
   @Nullable
   public evz cx;
   @Nullable
   public bsd cy;
   public boolean cz;

   public cmh(dcd $$0, ja $$1, float $$2, GameProfile $$3) {
      super(bsj.by, $$0);
      this.a_($$3.getId());
      this.cE = $$3;
      this.cc = new cqg(this.g, !$$0.B, this);
      this.cd = this.cc;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bk = 180.0F;
   }

   public boolean a(dcd $$0, ja $$1, dca $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dca.d) {
         return true;
      } else if (this.gk()) {
         return false;
      } else {
         cua $$3 = this.eT();
         return $$3.e() || !$$3.b(new dsl($$0, $$1, false));
      }
   }

   public static buf.a fM() {
      return bsy.dV().a(bug.c, 1.0).a(bug.v, 0.1F).a(bug.e).a(bug.q).a(bug.g, 4.5).a(bug.j, 3.0).a(bug.f).a(bug.C).a(bug.z).a(bug.t).a(bug.D);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(bX, (byte)0);
      $$0.a(bY, (byte)bH.a());
      $$0.a(bZ, new tx());
      $$0.a(ca, new tx());
   }

   @Override
   public void l() {
      this.ag = this.N_();
      if (this.N_()) {
         this.d(false);
      }

      if (this.ci > 0) {
         this.ci--;
      }

      if (this.fH()) {
         this.cB++;
         if (this.cB > 100) {
            this.cB = 100;
         }

         if (!this.dP().B && this.dP().R()) {
            this.a(false, true);
         }
      } else if (this.cB > 0) {
         this.cB++;
         if (this.cB >= 110) {
            this.cB = 0;
         }
      }

      this.fQ();
      super.l();
      if (!this.dP().B && this.cd != null && !this.cd.b(this)) {
         this.r();
         this.cd = this.cc;
      }

      this.v();
      if (!this.dP().B) {
         this.ce.a(this);
         this.a(avp.k);
         this.a(avp.l);
         if (this.bD()) {
            this.a(avp.m);
         }

         if (this.bY()) {
            this.a(avp.o);
         }

         if (!this.fH()) {
            this.a(avp.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = aye.a(this.du(), -2.9999999E7, 2.9999999E7);
      double $$2 = aye.a(this.dA(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.du() || $$2 != this.dA()) {
         this.a_($$1, this.dw(), $$2);
      }

      this.aT++;
      cua $$3 = this.eT();
      if (!cua.a(this.cG, $$3)) {
         if (!cua.b(this.cG, $$3)) {
            this.gs();
         }

         this.cG = $$3.s();
      }

      this.u();
      this.cH.a();
      this.fR();
   }

   @Override
   protected float fk() {
      return this.fy() ? 15.0F : super.fk();
   }

   public boolean fN() {
      return this.bV();
   }

   protected boolean fO() {
      return this.bV();
   }

   protected boolean fP() {
      return this.bV();
   }

   protected boolean fQ() {
      this.cp = this.a(awa.a);
      return this.cp;
   }

   private void u() {
      cua $$0 = this.a(bsk.f);
      if ($$0.a(cud.oo) && !this.a(awa.a)) {
         this.b(new brl(brn.m, 200, 0, false, false, true));
      }
   }

   protected ctw k() {
      return new ctw();
   }

   private void v() {
      this.cj = this.cm;
      this.ck = this.cn;
      this.cl = this.co;
      double $$0 = this.du() - this.cm;
      double $$1 = this.dw() - this.cn;
      double $$2 = this.dA() - this.co;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cm = this.du();
         this.cj = this.cm;
      }

      if ($$2 > 10.0) {
         this.co = this.dA();
         this.cl = this.co;
      }

      if ($$1 > 10.0) {
         this.cn = this.dw();
         this.ck = this.cn;
      }

      if ($$0 < -10.0) {
         this.cm = this.du();
         this.cj = this.cm;
      }

      if ($$2 < -10.0) {
         this.co = this.dA();
         this.cl = this.co;
      }

      if ($$1 < -10.0) {
         this.cn = this.dw();
         this.ck = this.cn;
      }

      this.cm += $$0 * 0.25;
      this.co += $$2 * 0.25;
      this.cn += $$1 * 0.25;
   }

   protected void fR() {
      if (this.h(btk.d)) {
         btk $$0;
         if (this.fA()) {
            $$0 = btk.b;
         } else if (this.fH()) {
            $$0 = btk.c;
         } else if (this.cc()) {
            $$0 = btk.d;
         } else if (this.fn()) {
            $$0 = btk.e;
         } else if (this.bV() && !this.cC.b) {
            $$0 = btk.f;
         } else {
            $$0 = btk.a;
         }

         btk $$6;
         if (this.N_() || this.bR() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(btk.f)) {
            $$6 = btk.f;
         } else {
            $$6 = btk.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(btk $$0) {
      return this.dP().a(this, this.a($$0).a(this.dn()).h(1.0E-7));
   }

   @Override
   public int az() {
      return Math.max(1, this.dP().ab().c(this.cC.a ? dbz.F : dbz.E));
   }

   @Override
   protected ave aP() {
      return avf.uu;
   }

   @Override
   protected ave aQ() {
      return avf.us;
   }

   @Override
   protected ave aR() {
      return avf.ut;
   }

   @Override
   public int bP() {
      return 10;
   }

   @Override
   public void a(ave $$0, float $$1, float $$2) {
      this.dP().a(this, this.du(), this.dw(), this.dA(), $$0, this.de(), $$1, $$2);
   }

   public void a(ave $$0, avg $$1, float $$2, float $$3) {
   }

   @Override
   public avg de() {
      return avg.h;
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
         this.cF = false;
      } else if ($$0 == 22) {
         this.cF = true;
      } else {
         super.b($$0);
      }
   }

   protected void r() {
      this.cd = this.cc;
   }

   @Override
   protected void s() {
   }

   @Override
   public void t() {
      if (!this.dP().B && this.fO() && this.bR()) {
         this.ac();
         this.g(false);
      } else {
         super.t();
         this.cg = this.ch;
         this.ch = 0.0F;
      }
   }

   @Override
   protected void fm() {
      super.fm();
      this.eR();
      this.ba = this.dF();
   }

   @Override
   public void n_() {
      if (this.cf > 0) {
         this.cf--;
      }

      if (this.dP().al() == bqa.a && this.dP().ab().b(dbz.k)) {
         if (this.ew() < this.eN() && this.ai % 20 == 0) {
            this.c(1.0F);
         }

         if (this.ce.c() && this.ai % 10 == 0) {
            this.ce.a(this.ce.a() + 1);
         }
      }

      this.g.j();
      this.cg = this.ch;
      super.n_();
      this.z((float)this.g(bug.v));
      float $$1;
      if (this.aE() && !this.ex() && !this.cc()) {
         $$1 = Math.min(0.1F, (float)this.ds().h());
      } else {
         $$1 = 0.0F;
      }

      this.ch = this.ch + ($$1 - this.ch) * 0.4F;
      if (this.ew() > 0.0F && !this.N_()) {
         evu $$2;
         if (this.bR() && !this.dc().dK()) {
            $$2 = this.cK().b(this.dc().cK()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cK().c(1.0, 0.5, 1.0);
         }

         List<bsd> $$4 = this.dP().a_(this, $$2);
         List<bsd> $$5 = Lists.newArrayList();

         for (bsd $$6 : $$4) {
            if ($$6.ak() == bsj.M) {
               $$5.add($$6);
            } else if (!$$6.dK()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ac.a($$5, this.ah));
         }
      }

      this.c(this.gp());
      this.c(this.gq());
      if (!this.dP().B && (this.ac > 0.5F || this.be()) || this.cC.b || this.fH() || this.aB) {
         this.gm();
      }
   }

   private void c(@Nullable tx $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dP().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bsj.a($$1).filter($$0x -> $$0x == bsj.ax).ifPresent($$0x -> {
            if (!cfe.a(this.dP(), this)) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), cfe.a(this.dP(), this.dP().z), this.de(), 1.0F, cfe.a(this.dP().z));
            }
         });
      }
   }

   private void d(bsd $$0) {
      $$0.b_(this);
   }

   public int fS() {
      return this.ao.a(e);
   }

   public void r(int $$0) {
      this.ao.a(e, $$0);
   }

   public void s(int $$0) {
      int $$1 = this.fS();
      this.ao.a(e, $$1 + $$0);
   }

   public void a(int $$0, float $$1, cua $$2) {
      this.bC = $$0;
      this.bD = $$1;
      this.bE = $$2;
      if (!this.dP().B) {
         this.gm();
         this.c(4, true);
      }
   }

   private cua z() {
      return this.fn() && this.bE != null ? this.bE : this.eT();
   }

   @Override
   public void a(bqw $$0) {
      super.a($$0);
      this.at();
      if (!this.N_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-aye.b((this.eE() + this.dF()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-aye.a((this.eE() + this.dF()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(avp.N);
      this.a(avp.i.b(avp.m));
      this.a(avp.i.b(avp.n));
      this.aC();
      this.c(false);
      this.a(Optional.of(ji.a(this.dP().af(), this.dp())));
   }

   @Override
   protected void ez() {
      super.ez();
      if (!this.dP().ab().b(dbz.d)) {
         this.fT();
         this.g.k();
      }
   }

   protected void fT() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cua $$1 = this.g.a($$0);
         if (!$$1.e() && czl.a($$1, czk.E)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected ave d(bqw $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected ave o_() {
      return avf.uk;
   }

   @Nullable
   public cir a(cua $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cir a(cua $$0, boolean $$1, boolean $$2) {
      if ($$0.e()) {
         return null;
      } else {
         if (this.dP().B) {
            this.a(bqc.a);
         }

         double $$3 = this.dy() - 0.3F;
         cir $$4 = new cir(this.dP(), this.du(), $$3, this.dA(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ah.i() * 0.5F;
            float $$6 = this.ah.i() * (float) (Math.PI * 2);
            $$4.o((double)(-aye.a($$6) * $$5), 0.2F, (double)(aye.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = aye.a(this.dH() * (float) (Math.PI / 180.0));
            float $$9 = aye.b(this.dH() * (float) (Math.PI / 180.0));
            float $$10 = aye.a(this.dF() * (float) (Math.PI / 180.0));
            float $$11 = aye.b(this.dF() * (float) (Math.PI / 180.0));
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

   public float c(dsh $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.g(bug.t);
      }

      if (brm.a(this)) {
         $$1 *= 1.0F + (float)(brm.b(this) + 1) * 0.2F;
      }

      if (this.b(brn.d)) {
         $$1 *= switch (this.c(brn.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.g(bug.f);
      if (this.a(awa.a)) {
         $$1 *= (float)this.f(bug.C).f();
      }

      if (!this.aE()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dsh $$0) {
      return !$$0.y() || this.g.f().b($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a_(this.cE.getId());
      ud $$1 = $$0.c("Inventory", 10);
      this.g.b($$1);
      this.g.k = $$0.h("SelectedItemSlot");
      this.cB = $$0.g("SleepTimer");
      this.cs = $$0.j("XpP");
      this.cq = $$0.h("XpLevel");
      this.cr = $$0.h("XpTotal");
      this.ct = $$0.h("XpSeed");
      if (this.ct == 0) {
         this.ct = this.ah.f();
      }

      this.r($$0.h("Score"));
      this.ce.a($$0);
      this.cC.b($$0);
      this.f(bug.v).a((double)this.cC.b());
      if ($$0.b("EnderItems", 9)) {
         this.cb.a($$0.c("EnderItems", 10), this.dR());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(ji.b.parse(ul.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         evz.a.parse(ul.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.cx = $$0x);
      }

      this.cz = $$0.q("ignore_fall_damage_from_current_explosion");
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      um.e($$0);
      $$0.a("Inventory", this.g.a(new ud()));
      $$0.a("SelectedItemSlot", this.g.k);
      $$0.a("SleepTimer", (short)this.cB);
      $$0.a("XpP", this.cs);
      $$0.a("XpLevel", this.cq);
      $$0.a("XpTotal", this.cr);
      $$0.a("XpSeed", this.ct);
      $$0.a("Score", this.fS());
      this.ce.b($$0);
      this.cC.a($$0);
      $$0.a("EnderItems", this.cb.a(this.dR()));
      if (!this.gp().g()) {
         $$0.a("ShoulderEntityLeft", this.gp());
      }

      if (!this.gq().g()) {
         $$0.a("ShoulderEntityRight", this.gq());
      }

      this.gx().flatMap($$0x -> ji.b.encodeStart(ul.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cx != null) {
         $$0.a("current_explosion_impact_pos", (uu)evz.a.encodeStart(ul.a, this.cx).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cz);
   }

   @Override
   public boolean b(bqw $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(avw.o)) {
         return !this.dP().ab().b(dbz.G);
      } else if ($$0.a(avw.n)) {
         return !this.dP().ab().b(dbz.H);
      } else if ($$0.a(avw.j)) {
         return !this.dP().ab().b(dbz.I);
      } else {
         return $$0.a(avw.p) ? !this.dP().ab().b(dbz.J) : false;
      }
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cC.a && !$$0.a(avw.e)) {
         return false;
      } else {
         this.bf = 0;
         if (this.ex()) {
            return false;
         } else {
            if (!this.dP().B) {
               this.gm();
            }

            if ($$0.f()) {
               if (this.dP().al() == bqa.a) {
                  $$1 = 0.0F;
               }

               if (this.dP().al() == bqa.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dP().al() == bqa.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bsy $$0) {
      super.d($$0);
      if ($$0.fK()) {
         this.fU();
      }
   }

   @Override
   public boolean ep() {
      return !this.fZ().a && super.ep();
   }

   public boolean a(cmh $$0) {
      exf $$1 = this.cj();
      exf $$2 = $$0.cj();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bqw $$0, float $$1) {
      this.a($$0, $$1, new bsk[]{bsk.c, bsk.d, bsk.e, bsk.f});
   }

   @Override
   protected void c(bqw $$0, float $$1) {
      this.a($$0, $$1, new bsk[]{bsk.f});
   }

   @Override
   protected void w(float $$0) {
      if (this.bz.a(cud.vs)) {
         if (!this.dP().B) {
            this.b(avp.c.b(this.bz.g()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + aye.d($$0);
            bqc $$2 = this.fs();
            this.bz.a($$1, this, d($$2));
            if (this.bz.e()) {
               if ($$2 == bqc.a) {
                  this.a(bsk.a, cua.l);
               } else {
                  this.a(bsk.b, cua.l);
               }

               this.bz = cua.l;
               this.a(avf.wE, 0.8F, 0.8F + this.dP().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bqw $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fo(), 0.0F);
         this.B(this.fo() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(avp.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.D($$0.a());
            this.eL().a($$0, var7);
            this.u(this.ew() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(avp.J, Math.round(var7 * 10.0F));
            }

            this.a(dxa.o);
         }
      }
   }

   public boolean Y() {
      return false;
   }

   public void a(dqx $$0, boolean $$1) {
   }

   public void a(dbe $$0) {
   }

   public void a(dpx $$0) {
   }

   public void a(drc $$0) {
   }

   public void a(dqn $$0) {
   }

   public void a(cgs $$0, bpw $$1) {
   }

   public OptionalInt a(@Nullable bqh $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dbc $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cua $$0, bqc $$1) {
   }

   public bqd a(bsd $$0, bqc $$1) {
      if (this.N_()) {
         if ($$0 instanceof bqh) {
            this.a((bqh)$$0);
         }

         return bqd.e;
      } else {
         cua $$2 = this.b($$1);
         cua $$3 = $$2.s();
         bqd $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cC.d && $$2 == this.b($$1) && $$2.H() < $$3.H()) {
               $$2.e($$3.H());
            }

            return $$4;
         } else {
            if (!$$2.e() && $$0 instanceof bsy) {
               if (this.cC.d) {
                  $$2 = $$3;
               }

               bqd $$5 = $$2.a(this, (bsy)$$0, $$1);
               if ($$5.a()) {
                  this.dP().a(dxa.r, $$0.dn(), dxa.a.a(this));
                  if ($$2.e() && !this.cC.d) {
                     this.a($$1, cua.l);
                  }

                  return $$5;
               }
            }

            return bqd.e;
         }
      }
   }

   @Override
   public void bI() {
      super.bI();
      this.K = 0;
   }

   @Override
   protected boolean fc() {
      return super.fc() || this.fH();
   }

   @Override
   public boolean ec() {
      return !this.cC.b;
   }

   @Override
   protected evz a(evz $$0, btd $$1) {
      float $$2 = this.dJ();
      if (!this.cC.b && !($$0.d > 0.0) && ($$1 == btd.a || $$1 == btd.b) && this.fP() && this.F($$2)) {
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

         return new evz($$3, $$0.d, $$4);
      } else {
         return $$0;
      }
   }

   private boolean F(float $$0) {
      return this.aE() || this.ac < $$0 && !this.b(0.0, 0.0, $$0 - this.ac);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      evu $$3 = this.cK();
      return this.dP().a(this, new evu($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(bsd $$0) {
      if ($$0.ct()) {
         if (!$$0.u(this)) {
            float $$1 = this.fn() ? this.bD : (float)this.g(bug.c);
            cua $$2 = this.z();
            bqw $$3 = this.dQ().a(this);
            float $$4 = $$1 - this.a($$0, $$1, $$3);
            float $$5 = this.E(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gs();
            if ($$0.ak().a(avy.H) && $$0 instanceof cmz $$6) {
               $$6.a(cna.c, this, this, true);
               this.dP().a(null, this.du(), this.dw(), this.dA(), avf.ud, this.de());
            } else {
               if ($$1 > 0.0F || $$4 > 0.0F) {
                  boolean $$7 = $$5 > 0.9F;
                  boolean $$8;
                  if (this.cb() && $$7) {
                     this.dP().a(null, this.du(), this.dw(), this.dA(), avf.uc, this.de(), 1.0F, 1.0F);
                     $$8 = true;
                  } else {
                     $$8 = false;
                  }

                  $$1 += $$2.g().a($$0, $$1, $$3);
                  boolean $$10 = $$7
                     && this.ac > 0.0F
                     && !this.aE()
                     && !this.q_()
                     && !this.be()
                     && !this.b(brn.o)
                     && !this.bR()
                     && $$0 instanceof bsy
                     && !this.cb();
                  if ($$10) {
                     $$1 *= 1.5F;
                  }

                  float $$12 = $$1 + $$4;
                  boolean $$13 = false;
                  double $$14 = (double)(this.Z - this.Y);
                  if ($$7 && !$$10 && !$$8 && this.aE() && $$14 < (double)this.fj()) {
                     cua $$15 = this.b(bqc.a);
                     if ($$15.g() instanceof cvn) {
                        $$13 = true;
                     }
                  }

                  float $$16 = 0.0F;
                  if ($$0 instanceof bsy $$17) {
                     $$16 = $$17.ew();
                  }

                  evz $$18 = $$0.ds();
                  boolean $$19 = $$0.a($$3, $$12);
                  if ($$19) {
                     float $$20 = this.a($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                     if ($$20 > 0.0F) {
                        if ($$0 instanceof bsy $$21) {
                           $$21.q(
                              (double)($$20 * 0.5F),
                              (double)aye.a(this.dF() * (float) (Math.PI / 180.0)),
                              (double)(-aye.b(this.dF() * (float) (Math.PI / 180.0)))
                           );
                        } else {
                           $$0.j(
                              (double)(-aye.a(this.dF() * (float) (Math.PI / 180.0)) * $$20 * 0.5F),
                              0.1,
                              (double)(aye.b(this.dF() * (float) (Math.PI / 180.0)) * $$20 * 0.5F)
                           );
                        }

                        this.h(this.ds().d(0.6, 1.0, 0.6));
                        this.h(false);
                     }

                     if ($$13) {
                        float $$22 = 1.0F + (float)this.g(bug.D) * $$1;

                        for (bsy $$24 : this.dP().a(bsy.class, $$0.cK().c(1.0, 0.25, 1.0))) {
                           if ($$24 != this && $$24 != $$0 && !this.s($$24) && (!($$24 instanceof cig) || !((cig)$$24).z()) && this.g((bsd)$$24) < 9.0) {
                              float $$25 = this.a($$24, $$22, $$3) * $$5;
                              $$24.q(0.4F, (double)aye.a(this.dF() * (float) (Math.PI / 180.0)), (double)(-aye.b(this.dF() * (float) (Math.PI / 180.0))));
                              $$24.a($$3, $$25);
                              if (this.dP() instanceof aqk $$26) {
                                 czl.a($$26, (bsd)$$24, $$3);
                              }
                           }
                        }

                        this.dP().a(null, this.du(), this.dw(), this.dA(), avf.uf, this.de(), 1.0F, 1.0F);
                        this.fV();
                     }

                     if ($$0 instanceof aql && $$0.U) {
                        ((aql)$$0).c.b(new aeu($$0));
                        $$0.U = false;
                        $$0.h($$18);
                     }

                     if ($$10) {
                        this.dP().a(null, this.du(), this.dw(), this.dA(), avf.ub, this.de(), 1.0F, 1.0F);
                        this.b($$0);
                     }

                     if (!$$10 && !$$13) {
                        if ($$7) {
                           this.dP().a(null, this.du(), this.dw(), this.dA(), avf.ue, this.de(), 1.0F, 1.0F);
                        } else {
                           this.dP().a(null, this.du(), this.dw(), this.dA(), avf.ug, this.de(), 1.0F, 1.0F);
                        }
                     }

                     if ($$4 > 0.0F) {
                        this.c($$0);
                     }

                     this.A($$0);
                     bsd $$27 = $$0;
                     if ($$0 instanceof chi) {
                        $$27 = ((chi)$$0).b;
                     }

                     boolean $$28 = false;
                     if (this.dP() instanceof aqk $$29) {
                        if ($$27 instanceof bsy $$30) {
                           $$28 = $$2.a($$30, this);
                        }

                        czl.a($$29, $$0, $$3);
                     }

                     if (!this.dP().B && !$$2.e() && $$27 instanceof bsy) {
                        if ($$28) {
                           $$2.b((bsy)$$27, this);
                        }

                        if ($$2.e()) {
                           if ($$2 == this.eT()) {
                              this.a(bqc.a, cua.l);
                           } else {
                              this.a(bqc.b, cua.l);
                           }
                        }
                     }

                     if ($$0 instanceof bsy) {
                        float $$31 = $$16 - ((bsy)$$0).ew();
                        this.a(avp.G, Math.round($$31 * 10.0F));
                        if (this.dP() instanceof aqk && $$31 > 2.0F) {
                           int $$32 = (int)((double)$$31 * 0.5);
                           ((aqk)this.dP()).a(lj.g, $$0.du(), $$0.e(0.5), $$0.dA(), $$32, 0.1, 0.0, 0.1, 0.2);
                        }
                     }

                     this.D(0.1F);
                  } else {
                     this.dP().a(null, this.du(), this.dw(), this.dA(), avf.ud, this.de(), 1.0F, 1.0F);
                  }
               }
            }
         }
      }
   }

   protected float a(bsd $$0, float $$1, bqw $$2) {
      return $$1;
   }

   @Override
   protected void g(bsy $$0) {
      this.e($$0);
   }

   public void fU() {
      this.gt().a(cud.vs, 100);
      this.fx();
      this.dP().a(this, (byte)30);
   }

   @Override
   public void b(bsd $$0) {
   }

   public void c(bsd $$0) {
   }

   public void fV() {
      double $$0 = (double)(-aye.a(this.dF() * (float) (Math.PI / 180.0)));
      double $$1 = (double)aye.b(this.dF() * (float) (Math.PI / 180.0));
      if (this.dP() instanceof aqk) {
         ((aqk)this.dP()).a(lj.aj, this.du() + $$0, this.e(0.5), this.dA() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fW() {
   }

   @Override
   public void a(bsd.c $$0) {
      super.a($$0);
      this.cc.a(this);
      if (this.cd != null && this.ga()) {
         this.s();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile fX() {
      return this.cE;
   }

   public cmg fY() {
      return this.g;
   }

   public cme fZ() {
      return this.cC;
   }

   @Override
   public boolean fL() {
      return this.cC.d;
   }

   public void a(cua $$0, cua $$1, cpn $$2) {
   }

   public boolean ga() {
      return this.cd != this.cc;
   }

   public Either<cmh.a, azh> a(ja $$0) {
      this.b($$0);
      this.cB = 0;
      return Either.right(azh.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fI();
      if (this.dP() instanceof aqk && $$1) {
         ((aqk)this.dP()).e();
      }

      this.cB = $$0 ? 0 : 100;
   }

   @Override
   public void fI() {
      this.a(true, true);
   }

   public static Optional<evz> a(aqk $$0, ja $$1, float $$2, boolean $$3, boolean $$4) {
      dsh $$5 = $$0.a_($$1);
      dff $$6 = $$5.b();
      if ($$6 instanceof dln && ($$3 || $$5.c(dln.d) > 0) && dln.a($$0)) {
         Optional<evz> $$7 = dln.a(bsj.by, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dln.d, Integer.valueOf($$5.c(dln.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof dey && dey.a($$0)) {
         return dey.a(bsj.by, $$0, $$1, $$5.c(dey.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dsh $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new evz((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean gb() {
      return this.fH() && this.cB >= 100;
   }

   public int gc() {
      return this.cB;
   }

   public void a(wu $$0, boolean $$1) {
   }

   public void a(akk $$0) {
      this.b(avp.i.b($$0));
   }

   public void a(akk $$0, int $$1) {
      this.a(avp.i.b($$0), $$1);
   }

   public void b(avm<?> $$0) {
      this.a($$0, 1);
   }

   public void a(avm<?> $$0, int $$1) {
   }

   public void a(avm<?> $$0) {
   }

   public int a(Collection<cyi<?>> $$0) {
      return 0;
   }

   public void a(cyi<?> $$0, List<cua> $$1) {
   }

   public void b(List<akk> $$0) {
   }

   public int b(Collection<cyi<?>> $$0) {
      return 0;
   }

   @Override
   public void ff() {
      super.ff();
      this.a(avp.E);
      if (this.cb()) {
         this.D(0.2F);
      } else {
         this.D(0.05F);
      }
   }

   @Override
   public void a(evz $$0) {
      if (this.cc() && !this.bR()) {
         double $$1 = this.bL().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bn || !this.dP().a_(ja.a(this.du(), this.dw() + 1.0 - 0.1, this.dA())).u().c()) {
            evz $$3 = this.ds();
            this.h($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cC.b && !this.bR()) {
         double $$4 = this.ds().d;
         super.a($$0);
         evz $$5 = this.ds();
         this.o($$5.c, $$4 * 0.6, $$5.e);
         this.n();
         this.b(7, false);
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bk() {
      if (this.cC.b) {
         this.i(false);
      } else {
         super.bk();
      }
   }

   protected boolean h(ja $$0) {
      return !this.dP().a_($$0).o(this.dP(), $$0);
   }

   @Override
   public float fj() {
      return (float)this.g(bug.v);
   }

   @Override
   public boolean a(float $$0, float $$1, bqw $$2) {
      if (this.cC.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(avp.t, (int)Math.round((double)$$0 * 100.0));
         }

         if (this.cz && this.cx != null) {
            double $$3 = this.cx.d;
            this.gA();
            return $$3 < this.dw() ? false : super.a((float)($$3 - this.dw()), $$1, $$2);
         } else {
            return super.a($$0, $$1, $$2);
         }
      }
   }

   public boolean gd() {
      if (!this.aE() && !this.fA() && !this.be() && !this.b(brn.y)) {
         cua $$0 = this.a(bsk.e);
         if ($$0.a(cud.nT) && csw.i($$0)) {
            this.ge();
            return true;
         }
      }

      return false;
   }

   public void ge() {
      this.b(7, true);
   }

   public void gf() {
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
   protected void b(ja $$0, dsh $$1) {
      if (this.be()) {
         this.aT();
         this.b($$1);
      } else {
         ja $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dsh $$3 = this.dP().a_($$2);
            if ($$3.a(avu.bo)) {
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
   public bsy.a eH() {
      return new bsy.a(avf.ur, avf.uh);
   }

   @Override
   public boolean a(aqk $$0, bsy $$1) {
      this.b(avp.g.b($$1.ak()));
      return true;
   }

   @Override
   public void a(dsh $$0, evz $$1) {
      if (!this.cC.b) {
         super.a($$0, $$1);
      }

      this.gA();
   }

   public void d(int $$0) {
      this.s($$0);
      this.cs = this.cs + (float)$$0 / (float)this.gh();
      this.cr = aye.a(this.cr + $$0, 0, Integer.MAX_VALUE);

      while (this.cs < 0.0F) {
         float $$1 = this.cs * (float)this.gh();
         if (this.cq > 0) {
            this.c(-1);
            this.cs = 1.0F + $$1 / (float)this.gh();
         } else {
            this.c(-1);
            this.cs = 0.0F;
         }
      }

      while (this.cs >= 1.0F) {
         this.cs = (this.cs - 1.0F) * (float)this.gh();
         this.c(1);
         this.cs = this.cs / (float)this.gh();
      }
   }

   public int gg() {
      return this.ct;
   }

   @Override
   public void a(cua $$0, int $$1) {
      this.cq -= $$1;
      if (this.cq < 0) {
         this.cq = 0;
         this.cs = 0.0F;
         this.cr = 0;
      }

      this.ct = this.ah.f();
   }

   public void c(int $$0) {
      this.cq += $$0;
      if (this.cq < 0) {
         this.cq = 0;
         this.cs = 0.0F;
         this.cr = 0;
      }

      if ($$0 > 0 && this.cq % 5 == 0 && (float)this.cD < (float)this.ai - 100.0F) {
         float $$1 = this.cq > 30 ? 1.0F : (float)this.cq / 30.0F;
         this.dP().a(null, this.du(), this.dw(), this.dA(), avf.uq, this.de(), $$1 * 0.75F, 1.0F);
         this.cD = this.ai;
      }
   }

   public int gh() {
      if (this.cq >= 30) {
         return 112 + (this.cq - 30) * 9;
      } else {
         return this.cq >= 15 ? 37 + (this.cq - 15) * 5 : 7 + this.cq * 2;
      }
   }

   public void D(float $$0) {
      if (!this.cC.a) {
         if (!this.dP().B) {
            this.ce.a($$0);
         }
      }
   }

   public Optional<cln> aa() {
      return Optional.empty();
   }

   public cpa gi() {
      return this.ce;
   }

   public boolean t(boolean $$0) {
      return this.cC.a || $$0 || this.ce.c();
   }

   public boolean gj() {
      return this.ew() > 0.0F && this.ew() < this.eN();
   }

   public boolean gk() {
      return this.cC.e;
   }

   public boolean a(ja $$0, jf $$1, cua $$2) {
      if (this.cC.e) {
         return true;
      } else {
         ja $$3 = $$0.a($$1.g());
         dsl $$4 = new dsl(this.dP(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int eg() {
      if (!this.dP().ab().b(dbz.d) && !this.N_()) {
         int $$0 = this.cq * 7;
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
   public boolean cF() {
      return true;
   }

   @Override
   protected bsd.b bb() {
      return this.cC.b || this.aE() && this.bY() ? bsd.b.a : bsd.b.d;
   }

   public void y() {
   }

   @Override
   public wu af() {
      return wu.b(this.cE.getName());
   }

   public cqr gl() {
      return this.cb;
   }

   @Override
   public cua a(bsk $$0) {
      if ($$0 == bsk.a) {
         return this.g.f();
      } else if ($$0 == bsk.b) {
         return this.g.j.get(0);
      } else {
         return $$0.a() == bsk.a.b ? this.g.i.get($$0.b()) : cua.l;
      }
   }

   @Override
   protected boolean b(bsk $$0) {
      return $$0.a() == bsk.a.b;
   }

   @Override
   public void a(bsk $$0, cua $$1) {
      this.e($$1);
      if ($$0 == bsk.a) {
         this.a($$0, this.g.h.set(this.g.k, $$1), $$1);
      } else if ($$0 == bsk.b) {
         this.a($$0, this.g.j.set(0, $$1), $$1);
      } else if ($$0.a() == bsk.a.b) {
         this.a($$0, this.g.i.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cua $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<cua> eW() {
      return Lists.newArrayList(new cua[]{this.eT(), this.eU()});
   }

   @Override
   public Iterable<cua> eV() {
      return this.g.i;
   }

   @Override
   public boolean d(bsk $$0) {
      return $$0 != bsk.g;
   }

   public boolean h(tx $$0) {
      if (this.bR() || !this.aE() || this.be() || this.aB) {
         return false;
      } else if (this.gp().g()) {
         this.i($$0);
         this.f = this.dP().Z();
         return true;
      } else if (this.gq().g()) {
         this.j($$0);
         this.f = this.dP().Z();
         return true;
      } else {
         return false;
      }
   }

   protected void gm() {
      if (this.f + 20L < this.dP().Z()) {
         this.k(this.gp());
         this.i(new tx());
         this.k(this.gq());
         this.j(new tx());
      }
   }

   private void k(tx $$0) {
      if (!this.dP().B && !$$0.g()) {
         bsj.a($$0, this.dP()).ifPresent($$0x -> {
            if ($$0x instanceof btv) {
               ((btv)$$0x).b(this.az);
            }

            $$0x.a_(this.du(), this.dw() + 0.7F, this.dA());
            ((aqk)this.dP()).c($$0x);
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
      return !this.cC.b && !this.N_() && super.cc();
   }

   public abstract boolean f();

   @Override
   public boolean cC() {
      return !this.cC.b;
   }

   public exd gn() {
      return this.dP().M();
   }

   @Override
   public wu O_() {
      xi $$0 = ewy.a(this.cj(), this.af());
      return this.a($$0);
   }

   private xi a(xi $$0) {
      String $$1 = this.fX().getName();
      return $$0.a($$1x -> $$1x.a(new ws(ws.a.d, "/tell " + $$1 + " ")).a(this.cJ()).a($$1));
   }

   @Override
   public String cB() {
      return this.fX().getName();
   }

   @Override
   protected void C(float $$0) {
      this.ap().a(d, $$0);
   }

   @Override
   public float fo() {
      return this.ap().a(d);
   }

   public boolean a(cmi $$0) {
      return (this.ap().a(bX) & $$0.a()) == $$0.a();
   }

   @Override
   public btq a_(int $$0) {
      if ($$0 == 499) {
         return new btq() {
            @Override
            public cua a() {
               return cmh.this.cd.g();
            }

            @Override
            public boolean a(cua $$0) {
               cmh.this.cd.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new btq() {
               @Override
               public cua a() {
                  return cmh.this.cc.r().a($$1);
               }

               @Override
               public boolean a(cua $$0) {
                  cmh.this.cc.r().a($$1, $$0);
                  cmh.this.cc.a(cmh.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.h.size()) {
            return btq.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.cb.b() ? btq.a(this.cb, $$2) : super.a_($$0);
         }
      }
   }

   public boolean go() {
      return this.cF;
   }

   public void u(boolean $$0) {
      this.cF = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.cC.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bss fq() {
      return this.ao.a(bY) == 0 ? bss.a : bss.b;
   }

   public void a(bss $$0) {
      this.ao.a(bY, (byte)($$0 == bss.a ? 0 : 1));
   }

   public tx gp() {
      return this.ao.a(bZ);
   }

   protected void i(tx $$0) {
      this.ao.a(bZ, $$0);
   }

   public tx gq() {
      return this.ao.a(ca);
   }

   protected void j(tx $$0) {
      this.ao.a(ca, $$0);
   }

   public float gr() {
      return (float)(1.0 / this.g(bug.e) * 20.0);
   }

   public float E(float $$0) {
      return aye.a(((float)this.aT + $$0) / this.gr(), 0.0F, 1.0F);
   }

   public void gs() {
      this.aT = 0;
   }

   public ctw gt() {
      return this.cH;
   }

   @Override
   protected float aN() {
      return !this.cC.b && !this.fA() ? super.aN() : 1.0F;
   }

   public float gu() {
      return (float)this.g(bug.q);
   }

   public boolean gv() {
      return this.cC.d && this.F() >= 2;
   }

   @Override
   public boolean f(cua $$0) {
      bsk $$1 = bta.h($$0);
      return this.a($$1).e();
   }

   @Override
   public bsg e(btk $$0) {
      return c.getOrDefault($$0, bW);
   }

   @Override
   public ImmutableList<btk> fE() {
      return ImmutableList.of(btk.a, btk.f, btk.d);
   }

   @Override
   public cua g(cua $$0) {
      if (!($$0.g() instanceof cut)) {
         return cua.l;
      } else {
         Predicate<cua> $$1 = ((cut)$$0.g()).d();
         cua $$2 = cut.a(this, $$1);
         if (!$$2.e()) {
            return $$2;
         } else {
            $$1 = ((cut)$$0.g()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cua $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cC.d ? new cua(cud.ov) : cua.l;
         }
      }
   }

   @Override
   public cua a(dcd $$0, cua $$1) {
      this.gi().a($$1);
      this.b(avp.c.b($$1.g()));
      $$0.a(null, this.du(), this.dw(), this.dA(), avf.uj, avg.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof aql) {
         am.A.a((aql)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   public evz r(float $$0) {
      double $$1 = 0.22 * (this.fq() == bss.b ? -1.0 : 1.0);
      float $$2 = aye.i($$0 * 0.5F, this.dH(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = aye.i($$0, this.aZ, this.aY) * (float) (Math.PI / 180.0);
      if (this.fA() || this.fn()) {
         evz $$4 = this.g($$0);
         evz $$5 = this.ds();
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

         return this.m($$0).e(new evz($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cd()) {
         return this.m($$0).e(new evz($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cK().c() - 1.0;
         double $$13 = this.ca() ? -0.2 : 0.07;
         return this.m($$0).e(new evz($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dO() {
      return true;
   }

   public boolean gw() {
      return this.fr() && this.ft().a(cud.qX);
   }

   @Override
   public boolean dN() {
      return false;
   }

   public Optional<ji> gx() {
      return this.cI;
   }

   public void a(Optional<ji> $$0) {
      this.cI = $$0;
   }

   @Override
   public float eE() {
      return this.cw;
   }

   @Override
   public void n(float $$0) {
      super.n($$0);
      this.cw = $$0;
   }

   @Override
   public boolean dI() {
      return true;
   }

   @Override
   protected float fi() {
      if (this.cC.b && !this.bR()) {
         return this.cb() ? this.cC.a() * 2.0F : this.cC.a();
      } else {
         return this.cb() ? 0.025999999F : 0.02F;
      }
   }

   public double gy() {
      return this.g(bug.g);
   }

   public double gz() {
      return this.g(bug.j);
   }

   public boolean b(bsd $$0, double $$1) {
      return $$0.dK() ? false : this.a($$0.cK(), $$1);
   }

   public boolean a(evu $$0, double $$1) {
      double $$2 = this.gz() + $$1;
      return $$0.e(this.bx()) < $$2 * $$2;
   }

   public boolean a(ja $$0, double $$1) {
      double $$2 = this.gy() + $$1;
      return new evu($$0).e(this.bx()) < $$2 * $$2;
   }

   public void gA() {
      this.cy = null;
      this.cx = null;
      this.cz = false;
   }

   public static enum a {
      a,
      b(wu.c("block.minecraft.bed.no_sleep")),
      c(wu.c("block.minecraft.bed.too_far_away")),
      d(wu.c("block.minecraft.bed.obstructed")),
      e,
      f(wu.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final wu g;

      private a() {
         this.g = null;
      }

      private a(final wu $$0) {
         this.g = $$0;
      }

      @Nullable
      public wu a() {
         return this.g;
      }
   }
}
