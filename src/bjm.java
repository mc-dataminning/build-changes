import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class bjm extends biw implements biu {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final bkq bA = new bkq(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, bkq.a.c);
   public static final int g = 2;
   public static final int h = 4;
   public static final int i = 98;
   public static final int j = 100;
   public static final int k = 6;
   public static final int l = 100;
   private static final int bB = 40;
   public static final double m = 0.003;
   public static final double n = 0.08;
   public static final int o = 20;
   private static final int bC = 7;
   private static final int bD = 10;
   private static final int bE = 2;
   public static final int p = 4;
   private static final float bF = 0.42F;
   private static final double bG = 128.0;
   protected static final int q = 1;
   protected static final int r = 2;
   protected static final int s = 4;
   protected static final aef<Byte> t = aei.a(bjm.class, aeh.a);
   private static final aef<Float> bH = aei.a(bjm.class, aeh.d);
   private static final aef<Integer> bI = aei.a(bjm.class, aeh.b);
   private static final aef<Boolean> bJ = aei.a(bjm.class, aeh.k);
   private static final aef<Integer> bK = aei.a(bjm.class, aeh.b);
   private static final aef<Integer> bL = aei.a(bjm.class, aeh.b);
   private static final aef<Optional<gw>> bM = aei.a(bjm.class, aeh.o);
   protected static final float u = 1.74F;
   protected static final bix v = bix.c(0.2F, 0.2F);
   public static final float aE = 0.5F;
   private final bkp bN;
   private final bhr bO = new bhr(this);
   private final Map<bih, bij> bP = Maps.newHashMap();
   private final hn<cjl> bQ = hn.a(2, cjl.b);
   private final hn<cjl> bR = hn.a(4, cjl.b);
   public boolean aF;
   private boolean bS = false;
   public bhd aG;
   public int aH;
   public int aI;
   public int aJ;
   public int aK;
   public int aL;
   public int aM;
   public float aN;
   public float aO;
   protected int aP;
   public final bkl aQ = new bkl();
   public final int aR = 20;
   public final float aS;
   public final float aT;
   public float aU;
   public float aV;
   public float aW;
   public float aX;
   @Nullable
   protected cca aY;
   protected int aZ;
   protected boolean ba;
   protected int bb;
   protected float bc;
   protected float bd;
   protected float be;
   protected float bf;
   protected float bg;
   protected int bh;
   protected float bi;
   protected boolean bj;
   public float bk;
   public float bl;
   public float bm;
   protected int bn;
   protected double bo;
   protected double bp;
   protected double bq;
   protected double br;
   protected double bs;
   protected double bt;
   protected int bu;
   private boolean bT = true;
   @Nullable
   private bjm bU;
   private int bV;
   private bjm bW;
   private int bX;
   private float bY;
   private int bZ;
   private float ca;
   protected cjl bv = cjl.b;
   protected int bw;
   protected int bx;
   private gw cb;
   private Optional<gw> cc = Optional.empty();
   @Nullable
   private bhu cd;
   private long ce;
   protected int by;
   private float cf;
   private float cg;
   protected bkm<?> bz;
   private boolean ch;

   protected bjm(bja<? extends bjm> $$0, cqb $$1) {
      super($$0, $$1);
      this.bN = new bkp(bkt.a($$0));
      this.c(this.eL());
      this.I = true;
      this.aT = (float)((Math.random() + 1.0) * 0.01F);
      this.ap();
      this.aS = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.aW = this.dB();
      this.t(0.6F);
      ri $$2 = ri.a;
      this.bz = this.a(new Dynamic($$2, (rq)$$2.createMap(ImmutableMap.of($$2.a("memories"), (rq)$$2.emptyMap()))));
   }

   public bkm<?> dN() {
      return this.bz;
   }

   protected bkm.b<?> dO() {
      return bkm.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bkm<?> a(Dynamic<?> $$0) {
      return this.dO().a($$0);
   }

   @Override
   public void aj() {
      this.a(this.dM().w(), Float.MAX_VALUE);
   }

   public boolean a(bja<?> $$0) {
      return true;
   }

   @Override
   protected void a_() {
      this.an.a(t, (byte)0);
      this.an.a(bI, 0);
      this.an.a(bJ, false);
      this.an.a(bK, 0);
      this.an.a(bL, 0);
      this.an.a(bH, 1.0F);
      this.an.a(bM, Optional.empty());
   }

   public static bkr.a dP() {
      return bkr.a().a(bks.l).a(bks.i).a(bks.m).a(bks.a).a(bks.b).a(bks.k);
   }

   @Override
   protected void a(double $$0, boolean $$1, dfd $$2, gw $$3) {
      if (!this.aX()) {
         this.bf();
      }

      if (!this.dL().B && $$1 && this.ab > 0.0F) {
         this.dU();
         this.dV();
      }

      if (!this.dL().B && this.ab > 3.0F && $$1 && !$$2.i()) {
         double $$4 = this.dq();
         double $$5 = this.ds();
         double $$6 = this.dw();
         gw $$7 = this.dl();
         if ($$3.u() != $$7.u() || $$3.w() != $$7.w()) {
            double $$8 = $$4 - (double)$$3.u() - 0.5;
            double $$9 = $$6 - (double)$$3.w() - 0.5;
            double $$10 = Math.max(Math.abs($$8), Math.abs($$9));
            $$4 = (double)$$3.u() + 0.5 + $$8 / $$10 * 0.5;
            $$6 = (double)$$3.w() + 0.5 + $$9 / $$10 * 0.5;
         }

         float $$11 = (float)asb.f(this.ab - 3.0F);
         double $$12 = Math.min((double)(0.2F + $$11 / 15.0F), 2.5);
         int $$13 = (int)(150.0 * $$12);
         ((akt)this.dL()).a(new in(iv.c, $$2), $$4, $$5, $$6, $$13, 0.0, 0.0, 0.0, 0.15F);
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cc = Optional.empty();
      }
   }

   public final boolean dQ() {
      return this.ag().a(apy.m);
   }

   public float a(float $$0) {
      return asb.i($$0, this.cg, this.cf);
   }

   @Override
   public void aq() {
      this.aN = this.aO;
      if (this.am) {
         this.fB().ifPresent(this::a);
      }

      if (this.dR()) {
         this.dS();
      }

      super.aq();
      this.dL().ad().a("livingEntityBaseTick");
      if (this.aW() || this.dL().B) {
         this.ay();
      }

      if (this.bv()) {
         boolean $$0 = this instanceof cca;
         if (!this.dL().B) {
            if (this.bw()) {
               this.a(this.dM().f(), 1.0F);
            } else if ($$0 && !this.dL().B_().a(this.cG())) {
               double $$1 = this.dL().B_().a(this) + this.dL().B_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dL().B_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dM().v(), (float)Math.max(1, asb.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(aqa.a) && !this.dL().a_(gw.a(this.dq(), this.du(), this.dw())).a(cte.nd)) {
            boolean $$3 = !this.dQ() && !bik.c(this) && (!$$0 || !((cca)this).fT().a);
            if ($$3) {
               this.j(this.m(this.ch()));
               if (this.ch() == -20) {
                  this.j(0);
                  ehh $$4 = this.do();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.ag.j() - this.ag.j();
                     double $$7 = this.ag.j() - this.ag.j();
                     double $$8 = this.ag.j() - this.ag.j();
                     this.dL().a(iv.e, this.dq() + $$6, this.ds() + $$7, this.dw() + $$8, $$4.c, $$4.d, $$4.e);
                  }

                  this.a(this.dM().h(), 2.0F);
               }
            }

            if (!this.dL().B && this.bN() && this.cY() != null && this.cY().bP()) {
               this.aa();
            }
         } else if (this.ch() < this.cg()) {
            this.j(this.n(this.ch()));
         }

         if (!this.dL().B) {
            gw $$9 = this.dl();
            if (!Objects.equal(this.cb, $$9)) {
               this.cb = $$9;
               this.c($$9);
            }
         }
      }

      if (this.bv() && (this.aZ() || this.aA)) {
         this.aD();
      }

      if (this.aK > 0) {
         this.aK--;
      }

      if (this.al > 0 && !(this instanceof aku)) {
         this.al--;
      }

      if (this.ev() && this.dL().h(this)) {
         this.ea();
      }

      if (this.aZ > 0) {
         this.aZ--;
      } else {
         this.aY = null;
      }

      if (this.bW != null && !this.bW.bv()) {
         this.bW = null;
      }

      if (this.bU != null) {
         if (!this.bU.bv()) {
            this.a(null);
         } else if (this.ah - this.bV > 100) {
            this.a(null);
         }
      }

      this.em();
      this.bf = this.be;
      this.aV = this.aU;
      this.aX = this.aW;
      this.N = this.dB();
      this.O = this.dD();
      this.dL().ad().c();
   }

   public boolean dR() {
      return this.ah % 5 == 0 && this.do().c != 0.0 && this.do().e != 0.0 && !this.M_() && cnw.k(this) && this.dT();
   }

   protected void dS() {
      ehh $$0 = this.do();
      this.dL()
         .a(
            iv.I,
            this.dq() + (this.ag.j() - 0.5) * (double)this.df(),
            this.ds() + 0.1,
            this.dw() + (this.ag.j() - 0.5) * (double)this.df(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.ag.i() * 0.4F + this.ag.i() > 0.9F ? 0.6F : 0.0F;
      this.a(apg.wd, $$1, 0.6F + this.ag.i() * 0.4F);
   }

   protected boolean dT() {
      return this.dL().a_(this.aG()).a(apv.aM);
   }

   @Override
   protected float aJ() {
      return this.dT() && cnw.a(cny.l, this) > 0 ? 1.0F : super.aJ();
   }

   @Override
   protected boolean c(dfd $$0) {
      return !$$0.i() || this.fw();
   }

   protected void dU() {
      bko $$0 = this.a(bks.m);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void dV() {
      if (!this.bh().i()) {
         int $$0 = cnw.a(cny.l, this);
         if ($$0 > 0 && this.dT()) {
            bko $$1 = this.a(bks.m);
            if ($$1 == null) {
               return;
            }

            $$1.b(new bkq(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), bkq.a.a));
            if (this.ef().i() < 0.04F) {
               cjl $$2 = this.c(bjb.c);
               $$2.a(1, this, $$0x -> $$0x.d(bjb.c));
            }
         }
      }
   }

   protected void dW() {
      bko $$0 = this.a(bks.m);
      if ($$0 != null) {
         if ($$0.a(e) != null) {
            $$0.b(e);
         }
      }
   }

   protected void dX() {
      if (!this.bh().i()) {
         int $$0 = this.ci();
         if ($$0 > 0) {
            bko $$1 = this.a(bks.m);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cj();
            $$1.b(new bkq(e, "Powder snow slow", (double)$$2, bkq.a.a));
         }
      }
   }

   protected void c(gw $$0) {
      int $$1 = cnw.a(cny.j, this);
      if ($$1 > 0) {
         cob.a(this, this.dL(), $$0, $$1);
      }

      if (this.c(this.bh())) {
         this.dU();
      }

      this.dV();
   }

   public boolean m_() {
      return false;
   }

   public float dY() {
      return this.m_() ? 0.5F : 1.0F;
   }

   protected boolean dZ() {
      return true;
   }

   protected void ea() {
      this.aM++;
      if (this.aM >= 20 && !this.dL().w_() && !this.dG()) {
         this.dL().a(this, (byte)60);
         this.a(biw.c.a);
      }
   }

   public boolean eb() {
      return !this.m_();
   }

   protected boolean ec() {
      return !this.m_();
   }

   protected int m(int $$0) {
      int $$1 = cnw.e(this);
      return $$1 > 0 && this.ag.a($$1 + 1) > 0 ? $$0 : $$0 - 1;
   }

   protected int n(int $$0) {
      return Math.min($$0 + 4, this.cg());
   }

   public int ed() {
      return 0;
   }

   protected boolean ee() {
      return false;
   }

   public ash ef() {
      return this.ag;
   }

   @Nullable
   public bjm eg() {
      return this.bU;
   }

   @Override
   public bjm S_() {
      return this.eg();
   }

   public int eh() {
      return this.bV;
   }

   public void c(@Nullable cca $$0) {
      this.aY = $$0;
      this.aZ = this.ah;
   }

   public void a(@Nullable bjm $$0) {
      this.bU = $$0;
      this.bV = this.ah;
   }

   @Nullable
   public bjm ei() {
      return this.bW;
   }

   public int ej() {
      return this.bX;
   }

   public void A(biw $$0) {
      if ($$0 instanceof bjm) {
         this.bW = (bjm)$$0;
      } else {
         this.bW = null;
      }

      this.bX = this.ah;
   }

   public int ek() {
      return this.bb;
   }

   public void o(int $$0) {
      this.bb = $$0;
   }

   public boolean el() {
      return this.bS;
   }

   public void p(boolean $$0) {
      this.bS = $$0;
   }

   protected boolean a(bjb $$0) {
      return true;
   }

   public void a(bjb $$0, cjl $$1, cjl $$2) {
      boolean $$3 = $$2.b() && $$1.b();
      if (!$$3 && !cjl.c($$1, $$2) && !this.am) {
         cim $$4 = cim.c_($$2);
         if (!this.dL().w_() && !this.M_()) {
            if (!this.aS() && $$4 != null && $$4.g() == $$0) {
               this.dL().a(null, this.dq(), this.ds(), this.dw(), $$4.ao_(), this.da(), 1.0F, 1.0F);
            }

            if (this.a($$0)) {
               this.a($$4 != null ? djn.v : djn.S);
            }
         }
      }
   }

   @Override
   public void a(biw.c $$0) {
      super.a($$0);
      this.bz.a();
   }

   @Override
   public void b(qw $$0) {
      $$0.a("Health", this.eu());
      $$0.a("HurtTime", (short)this.aK);
      $$0.a("HurtByTimestamp", this.bV);
      $$0.a("DeathTime", (short)this.aM);
      $$0.a("AbsorptionAmount", this.fk());
      $$0.a("Attributes", this.eQ().c());
      if (!this.bP.isEmpty()) {
         rc $$1 = new rc();

         for (bij $$2 : this.bP.values()) {
            $$1.add($$2.a(new qw()));
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fw());
      this.fB().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<rq> $$3 = this.bz.a(ri.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(qw $$0) {
      this.z($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dL() != null && !this.dL().B) {
         this.eQ().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         rc $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            qw $$3 = $$1.a($$2);
            bij $$4 = bij.b($$3);
            if ($$4 != null) {
               this.bP.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.c($$0.j("Health"));
      }

      this.aK = $$0.g("HurtTime");
      this.aM = $$0.g("DeathTime");
      this.bV = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         eie $$6 = this.dL().I().d($$5);
         boolean $$7 = $$6 != null && this.dL().I().a(this.cw(), $$6);
         if (!$$7) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         gw $$8 = new gw($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$8);
         this.an.b(as, bjy.c);
         if (!this.am) {
            this.a($$8);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bz = this.a(new Dynamic(ri.a, $$0.c("Brain")));
      }
   }

   protected void em() {
      Iterator<bih> $$0 = this.bP.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            bih $$1 = $$0.next();
            bij $$2 = this.bP.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dL().B) {
                  $$0.remove();
                  this.a($$2);
               }
            } else if ($$2.d() % 600 == 0) {
               this.a($$2, false, null);
            }
         }
      } catch (ConcurrentModificationException var11) {
      }

      if (this.bT) {
         if (!this.dL().B) {
            this.H();
            this.s();
         }

         this.bT = false;
      }

      int $$3 = this.an.b(bI);
      boolean $$4 = this.an.b(bJ);
      if ($$3 > 0) {
         boolean $$5;
         if (this.cd()) {
            $$5 = this.ag.a(15) == 0;
         } else {
            $$5 = this.ag.h();
         }

         if ($$4) {
            $$5 &= this.ag.a(5) == 0;
         }

         if ($$5 && $$3 > 0) {
            double $$7 = (double)($$3 >> 16 & 0xFF) / 255.0;
            double $$8 = (double)($$3 >> 8 & 0xFF) / 255.0;
            double $$9 = (double)($$3 >> 0 & 0xFF) / 255.0;
            this.dL().a($$4 ? iv.a : iv.v, this.d(0.5), this.dt(), this.g(0.5), $$7, $$8, $$9);
         }
      }
   }

   protected void H() {
      if (this.bP.isEmpty()) {
         this.ep();
         this.j(false);
      } else {
         Collection<bij> $$0 = this.bP.values();
         this.an.b(bJ, c($$0));
         this.an.b(bI, clk.a($$0));
         this.j(this.a(bil.n));
      }
   }

   private void s() {
      boolean $$0 = this.cc();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable biw $$0) {
      double $$1 = 1.0;
      if (this.bU()) {
         $$1 *= 0.8;
      }

      if (this.cd()) {
         float $$2 = this.eU();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cjl $$3 = this.c(bjb.f);
         bja<?> $$4 = $$0.ag();
         if ($$4 == bja.aJ && $$3.a(cjo.tr)
            || $$4 == bja.bp && $$3.a(cjo.tu)
            || $$4 == bja.aw && $$3.a(cjo.tx)
            || $$4 == bja.ax && $$3.a(cjo.tx)
            || $$4 == bja.u && $$3.a(cjo.tv)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bjm $$0) {
      return $$0 instanceof cca && this.dL().ai() == bhb.a ? false : $$0.en();
   }

   public boolean a(bjm $$0, bty $$1) {
      return $$1.a(this, $$0);
   }

   public boolean en() {
      return !this.cq() && this.eo();
   }

   public boolean eo() {
      return !this.M_() && this.bv();
   }

   public static boolean c(Collection<bij> $$0) {
      for (bij $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void ep() {
      this.an.b(bJ, false);
      this.an.b(bI, 0);
   }

   public boolean eq() {
      if (this.dL().B) {
         return false;
      } else {
         Iterator<bij> $$0 = this.bP.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<bij> er() {
      return this.bP.values();
   }

   public Map<bih, bij> es() {
      return this.bP;
   }

   public boolean a(bih $$0) {
      return this.bP.containsKey($$0);
   }

   @Nullable
   public bij b(bih $$0) {
      return this.bP.get($$0);
   }

   public final boolean b(bij $$0) {
      return this.b($$0, null);
   }

   public boolean b(bij $$0, @Nullable biw $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         bij $$2 = this.bP.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bP.put($$0.c(), $$0);
            this.a($$0, $$1);
            $$3 = true;
         } else if ($$2.b($$0)) {
            this.a($$2, true, $$1);
            $$3 = true;
         }

         $$0.a(this);
         return $$3;
      }
   }

   public boolean c(bij $$0) {
      if (this.eR() == bjr.b) {
         bih $$1 = $$0.c();
         if ($$1 == bil.j || $$1 == bil.s) {
            return false;
         }
      }

      return true;
   }

   public void c(bij $$0, @Nullable biw $$1) {
      if (this.c($$0)) {
         bij $$2 = this.bP.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean et() {
      return this.eR() == bjr.b;
   }

   @Nullable
   public bij c(@Nullable bih $$0) {
      return this.bP.remove($$0);
   }

   public boolean d(bih $$0) {
      bij $$1 = this.c($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(bij $$0, @Nullable biw $$1) {
      this.bT = true;
      if (!this.dL().B) {
         $$0.c().a(this.eQ(), $$0.e());
         this.d($$0);
      }
   }

   public void d(bij $$0) {
      for (biw $$1 : this.cP()) {
         if ($$1 instanceof aku $$2) {
            $$2.c.b(new aay(this.ah(), $$0));
         }
      }
   }

   protected void a(bij $$0, boolean $$1, @Nullable biw $$2) {
      this.bT = true;
      if ($$1 && !this.dL().B) {
         bih $$3 = $$0.c();
         $$3.a(this.eQ());
         $$3.a(this.eQ(), $$0.e());
         this.w();
      }

      if (!this.dL().B) {
         this.d($$0);
      }
   }

   protected void a(bij $$0) {
      this.bT = true;
      if (!this.dL().B) {
         $$0.c().a(this.eQ());
         this.w();

         for (biw $$1 : this.cP()) {
            if ($$1 instanceof aku $$2) {
               $$2.c.b(new zg(this.ah(), $$0.c()));
            }
         }
      }
   }

   private void w() {
      for (bko $$0 : this.eQ().a()) {
         this.d($$0.a());
      }
   }

   private void d(bkn $$0) {
      if ($$0 == bks.l) {
         float $$1 = this.eL();
         if (this.eu() > $$1) {
            this.c($$1);
         }
      } else if ($$0 == bks.k) {
         float $$2 = this.eM();
         if (this.fk() > $$2) {
            this.y($$2);
         }
      }
   }

   public void b(float $$0) {
      float $$1 = this.eu();
      if ($$1 > 0.0F) {
         this.c($$1 + $$0);
      }
   }

   public float eu() {
      return this.an.b(bH);
   }

   public void c(float $$0) {
      this.an.b(bH, asb.a($$0, 0.0F, this.eL()));
   }

   public boolean ev() {
      return this.eu() <= 0.0F;
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dL().B) {
         return false;
      } else if (this.ev()) {
         return false;
      } else if ($$0.a(apx.i) && this.a(bil.l)) {
         return false;
      } else {
         if (this.fD() && !this.dL().B) {
            this.fE();
         }

         this.bb = 0;
         float $$2 = $$1;
         boolean $$3 = false;
         float $$4 = 0.0F;
         if ($$1 > 0.0F && this.f($$0)) {
            this.u($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.a(apx.j) && $$0.c() instanceof bjm $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(apx.o) && this.ag().a(apy.l)) {
            $$1 *= 5.0F;
         }

         this.aQ.a(1.5F);
         boolean $$7 = true;
         if ((float)this.al > 10.0F && !$$0.a(apx.e)) {
            if ($$1 <= this.bi) {
               return false;
            }

            this.f($$0, $$1 - this.bi);
            this.bi = $$1;
            $$7 = false;
         } else {
            this.bi = $$1;
            this.al = 20;
            this.f($$0, $$1);
            this.aL = 10;
            this.aK = this.aL;
         }

         if ($$0.a(apx.a) && !this.c(bjb.f).b()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         biw $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof bjm $$9 && !$$0.a(apx.q)) {
               this.a($$9);
            }

            if ($$8 instanceof cca $$10) {
               this.aZ = 100;
               this.aY = $$10;
            } else if ($$8 instanceof bwa $$11 && $$11.s()) {
               this.aZ = 100;
               if ($$11.O_() instanceof cca $$12) {
                  this.aY = $$12;
               } else {
                  this.aY = null;
               }
            }
         }

         if ($$7) {
            if ($$3) {
               this.dL().a(this, (byte)29);
            } else {
               this.dL().a(this, $$0);
            }

            if (!$$0.a(apx.r) && (!$$3 || $$1 > 0.0F)) {
               this.bo();
            }

            if ($$8 != null && !$$0.a(apx.z)) {
               double $$13 = $$8.dq() - this.dq();

               double $$14;
               for ($$14 = $$8.dw() - this.dw(); $$13 * $$13 + $$14 * $$14 < 1.0E-4; $$14 = (Math.random() - Math.random()) * 0.01) {
                  $$13 = (Math.random() - Math.random()) * 0.01;
               }

               this.q(0.4F, $$13, $$14);
               if (!$$3) {
                  this.a($$13, $$14);
               }
            }
         }

         if (this.ev()) {
            if (!this.h($$0)) {
               apf $$15 = this.l_();
               if ($$7 && $$15 != null) {
                  this.a($$15, this.eV(), this.eW());
               }

               this.a($$0);
            }
         } else if ($$7) {
            this.e($$0);
         }

         boolean $$16 = !$$3 || $$1 > 0.0F;
         if ($$16) {
            this.cd = $$0;
            this.ce = this.dL().V();
         }

         if (this instanceof aku) {
            al.h.a((aku)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((aku)this).a(apq.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof aku) {
            al.g.a((aku)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$16;
      }
   }

   protected void d(bjm $$0) {
      $$0.e(this);
   }

   protected void e(bjm $$0) {
      $$0.q(0.5, $$0.dq() - this.dq(), $$0.dw() - this.dw());
   }

   private boolean h(bhu $$0) {
      if ($$0.a(apx.d)) {
         return false;
      } else {
         cjl $$1 = null;

         for (bhd $$2 : bhd.values()) {
            cjl $$3 = this.b($$2);
            if ($$3.a(cjo.uz)) {
               $$1 = $$3.p();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof aku $$4) {
               $$4.b(apq.c.b(cjo.uz));
               al.B.a($$4, $$1);
               this.a(djn.C);
            }

            this.c(1.0F);
            this.eq();
            this.b(new bij(bil.j, 900, 1));
            this.b(new bij(bil.v, 100, 1));
            this.b(new bij(bil.l, 800, 0));
            this.dL().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bhu ew() {
      if (this.dL().V() - this.ce > 40L) {
         this.cd = null;
      }

      return this.cd;
   }

   protected void e(bhu $$0) {
      apf $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eV(), this.eW());
      }
   }

   public boolean f(bhu $$0) {
      biw $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof ccg $$3 && $$3.B() > 0) {
         $$2 = true;
      }

      if (!$$0.a(apx.c) && this.fu() && !$$2) {
         ehh $$4 = $$0.h();
         if ($$4 != null) {
            ehh $$5 = this.b(0.0F, this.co());
            ehh $$6 = $$4.a(this.dj());
            $$6 = new ehh($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(cjl $$0) {
      if (!$$0.b()) {
         if (!this.aS()) {
            this.dL().a(this.dq(), this.ds(), this.dw(), apg.lZ, this.da(), 0.8F, 0.8F + this.dL().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bhu $$0) {
      if (!this.dG() && !this.ba) {
         biw $$1 = $$0.d();
         bjm $$2 = this.eK();
         if (this.bh >= 0 && $$2 != null) {
            $$2.a(this, this.bh, $$0);
         }

         if (this.fD()) {
            this.fE();
         }

         if (!this.dL().B && this.ac()) {
            b.info("Named entity {} died: {}", this, this.eJ().a().getString());
         }

         this.ba = true;
         this.eJ().c();
         if (this.dL() instanceof akt $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(djn.p);
               this.g($$0);
               this.f($$2);
            }

            this.dL().a(this, (byte)3);
         }

         this.b(bjy.h);
      }
   }

   protected void f(@Nullable bjm $$0) {
      if (!this.dL().B) {
         boolean $$1 = false;
         if ($$0 instanceof byh) {
            if (this.dL().X().b(cpx.c)) {
               gw $$2 = this.dl();
               dfd $$3 = cte.cd.o();
               if (this.dL().a_($$2).i() && $$3.a((cqe)this.dL(), $$2)) {
                  this.dL().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               byt $$4 = new byt(this.dL(), this.dq(), this.ds(), this.dw(), new cjl(cjo.da));
               this.dL().b($$4);
            }
         }
      }
   }

   protected void g(bhu $$0) {
      biw $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof cca) {
         $$2 = cnw.h((bjm)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.aZ > 0;
      if (this.ec() && this.dL().X().b(cpx.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.ex();
      this.ey();
   }

   protected void ex() {
   }

   protected void ey() {
      if (this.dL() instanceof akt && !this.eC() && (this.ee() || this.aZ > 0 && this.eb() && this.dL().X().b(cpx.f))) {
         bjc.a((akt)this.dL(), this.dj(), this.ed());
      }
   }

   protected void a(bhu $$0, int $$1, boolean $$2) {
   }

   public aez ez() {
      return this.ag().j();
   }

   public long eA() {
      return 0L;
   }

   protected void a(bhu $$0, boolean $$1) {
      aez $$2 = this.ez();
      ecs $$3 = this.dL().n().aH().getLootTable($$2);
      ecq.a $$4 = new ecq.a((akt)this.dL()).a(eev.a, this).a(eev.f, this.dj()).a(eev.c, $$0).b(eev.d, $$0.d()).b(eev.e, $$0.c());
      if ($$1 && this.aY != null) {
         $$4 = $$4.a(eev.b, this.aY).a(this.aY.go());
      }

      ecq $$5 = $$4.a(eeu.g);
      $$3.a($$5, this.eA(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.b(bks.i);
      if (!($$0 <= 0.0)) {
         this.au = true;
         ehh $$3 = this.do();
         ehh $$4 = new ehh($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aA() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected apf d(bhu $$0) {
      return apg.iZ;
   }

   @Nullable
   protected apf l_() {
      return apg.iU;
   }

   private apf d(int $$0) {
      return $$0 > 4 ? this.eF().b() : this.eF().a();
   }

   public void eB() {
      this.ch = true;
   }

   public boolean eC() {
      return this.ch;
   }

   public float eD() {
      return 0.0F;
   }

   protected ehc eE() {
      ehc $$0 = this.cG();
      biw $$1 = this.cY();
      if ($$1 != null) {
         ehh $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public bjm.a eF() {
      return new bjm.a(apg.ja, apg.iS);
   }

   protected apf c(cjl $$0) {
      return $$0.N();
   }

   public apf d(cjl $$0) {
      return $$0.O();
   }

   public Optional<gw> eG() {
      return this.cc;
   }

   public boolean c_() {
      if (this.M_()) {
         return false;
      } else {
         gw $$0 = this.dl();
         dfd $$1 = this.dm();
         if ($$1.a(apv.aO)) {
            this.cc = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dbm && this.c($$0, $$1)) {
            this.cc = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(gw $$0, dfd $$1) {
      if ($$1.c(dbm.b)) {
         dfd $$2 = this.dL().a_($$0.d());
         if ($$2.a(cte.cO) && $$2.c(cxg.b) == $$1.c(dbm.aE)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean bv() {
      return !this.dG() && this.eu() > 0.0F;
   }

   @Override
   public boolean a(float $$0, float $$1, bhu $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.d($$0, $$1);
      if ($$4 > 0) {
         this.a(this.d($$4), 1.0F, 1.0F);
         this.eH();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int d(float $$0, float $$1) {
      if (this.ag().a(apy.o)) {
         return 0;
      } else {
         bij $$2 = this.b(bil.h);
         float $$3 = $$2 == null ? 0.0F : (float)($$2.e() + 1);
         return asb.f(($$0 - 3.0F - $$3) * $$1);
      }
   }

   protected void eH() {
      if (!this.aS()) {
         int $$0 = asb.a(this.dq());
         int $$1 = asb.a(this.ds() - 0.2F);
         int $$2 = asb.a(this.dw());
         dfd $$3 = this.dL().a_(new gw($$0, $$1, $$2));
         if (!$$3.i()) {
            dan $$4 = $$3.w();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void m(float $$0) {
      this.aL = 10;
      this.aK = this.aL;
   }

   public int eI() {
      return asb.a(this.b(bks.a));
   }

   protected void b(bhu $$0, float $$1) {
   }

   protected void c(bhu $$0, float $$1) {
   }

   protected void u(float $$0) {
   }

   protected float d(bhu $$0, float $$1) {
      if (!$$0.a(apx.b)) {
         this.b($$0, $$1);
         $$1 = bhq.a($$1, (float)this.eI(), (float)this.b(bks.b));
      }

      return $$1;
   }

   protected float e(bhu $$0, float $$1) {
      if ($$0.a(apx.f)) {
         return $$1;
      } else {
         if (this.a(bil.k) && !$$0.a(apx.g)) {
            int $$2 = (this.b(bil.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof aku) {
                  ((aku)this).a(apq.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof aku) {
                  ((aku)$$0.d()).a(apq.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(apx.h)) {
            return $$1;
         } else {
            int $$7 = cnw.a(this.bK(), $$0);
            if ($$7 > 0) {
               $$1 = bhq.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bhu $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fk(), 0.0F);
         this.y(this.fk() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof aku $$4) {
            $$4.a(apq.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eJ().a($$0, var9);
            this.c(this.eu() - var9);
            this.y(this.fk() - var9);
            this.a(djn.o);
         }
      }
   }

   public bhr eJ() {
      return this.bO;
   }

   @Nullable
   public bjm eK() {
      if (this.aY != null) {
         return this.aY;
      } else {
         return this.bU != null ? this.bU : null;
      }
   }

   public final float eL() {
      return (float)this.b(bks.l);
   }

   public final float eM() {
      return (float)this.b(bks.k);
   }

   public final int eN() {
      return this.an.b(bK);
   }

   public final void p(int $$0) {
      this.an.b(bK, $$0);
   }

   public final int eO() {
      return this.an.b(bL);
   }

   public final void q(int $$0) {
      this.an.b(bL, $$0);
   }

   private int z() {
      if (bik.a(this)) {
         return 6 - (1 + bik.b(this));
      } else {
         return this.a(bil.d) ? 6 + (1 + this.b(bil.d).e()) * 2 : 6;
      }
   }

   public void a(bhd $$0) {
      this.a($$0, false);
   }

   public void a(bhd $$0, boolean $$1) {
      if (!this.aF || this.aH >= this.z() / 2 || this.aH < 0) {
         this.aH = -1;
         this.aF = true;
         this.aG = $$0;
         if (this.dL() instanceof akt) {
            xa $$2 = new xa(this, $$0 == bhd.a ? 0 : 3);
            akr $$3 = ((akt)this.dL()).k();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bhu $$0) {
      this.aQ.a(1.5F);
      this.al = 20;
      this.aL = 10;
      this.aK = this.aL;
      apf $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eV(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
      }

      this.a(this.dM().n(), 0.0F);
      this.cd = $$0;
      this.ce = this.dL().V();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            apf $$1 = this.l_();
            if ($$1 != null) {
               this.a($$1, this.eV(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cca)) {
               this.c(0.0F);
               this.a(this.dM().n());
            }
            break;
         case 29:
            this.a(apg.uQ, 1.0F, 0.8F + this.dL().z.i() * 0.4F);
            break;
         case 30:
            this.a(apg.uR, 0.8F, 0.8F + this.dL().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ag.i() - 0.5F) * 0.2F;
               float $$6 = (this.ag.i() - 0.5F) * 0.2F;
               float $$7 = (this.ag.i() - 0.5F) * 0.2F;
               double $$8 = asb.d($$4, this.K, this.dq()) + (this.ag.j() - 0.5) * (double)this.df() * 2.0;
               double $$9 = asb.d($$4, this.L, this.ds()) + this.ag.j() * (double)this.dg();
               double $$10 = asb.d($$4, this.M, this.dw()) + (this.ag.j() - 0.5) * (double)this.df() * 2.0;
               this.dL().a(iv.X, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.c(bjb.a));
            break;
         case 48:
            this.i(this.c(bjb.b));
            break;
         case 49:
            this.i(this.c(bjb.f));
            break;
         case 50:
            this.i(this.c(bjb.e));
            break;
         case 51:
            this.i(this.c(bjb.d));
            break;
         case 52:
            this.i(this.c(bjb.c));
            break;
         case 54:
            cwu.b(this);
            break;
         case 55:
            this.B();
            break;
         case 60:
            this.A();
            break;
         default:
            super.b($$0);
      }
   }

   private void A() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.ag.k() * 0.02;
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         this.dL().a(iv.W, this.d(1.0), this.dt(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void B() {
      cjl $$0 = this.c(bjb.b);
      this.a(bjb.b, this.c(bjb.a));
      this.a(bjb.a, $$0);
   }

   @Override
   protected void az() {
      this.a(this.dM().m(), 4.0F);
   }

   protected void eP() {
      int $$0 = this.z();
      if (this.aF) {
         this.aH++;
         if (this.aH >= $$0) {
            this.aH = 0;
            this.aF = false;
         }
      } else {
         this.aH = 0;
      }

      this.aO = (float)this.aH / (float)$$0;
   }

   @Nullable
   public bko a(bkn $$0) {
      return this.eQ().a($$0);
   }

   public double a(he<bkn> $$0) {
      return this.b($$0.a());
   }

   public double b(bkn $$0) {
      return this.eQ().c($$0);
   }

   public double b(he<bkn> $$0) {
      return this.c($$0.a());
   }

   public double c(bkn $$0) {
      return this.eQ().d($$0);
   }

   public bkp eQ() {
      return this.bN;
   }

   public bjr eR() {
      return bjr.a;
   }

   public cjl eS() {
      return this.c(bjb.a);
   }

   public cjl eT() {
      return this.c(bjb.b);
   }

   public boolean b(cjg $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cjl> $$0) {
      return $$0.test(this.eS()) || $$0.test(this.eT());
   }

   public cjl b(bhd $$0) {
      if ($$0 == bhd.a) {
         return this.c(bjb.a);
      } else if ($$0 == bhd.b) {
         return this.c(bjb.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bhd $$0, cjl $$1) {
      if ($$0 == bhd.a) {
         this.a(bjb.a, $$1);
      } else {
         if ($$0 != bhd.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bjb.b, $$1);
      }
   }

   public boolean b(bjb $$0) {
      return !this.c($$0).b();
   }

   @Override
   public abstract Iterable<cjl> bK();

   public abstract cjl c(bjb var1);

   @Override
   public abstract void a(bjb var1, cjl var2);

   protected void e(cjl $$0) {
      qw $$1 = $$0.v();
      if ($$1 != null) {
         $$0.d().b($$1);
      }
   }

   public float eU() {
      Iterable<cjl> $$0 = this.bK();
      int $$1 = 0;
      int $$2 = 0;

      for (cjl $$3 : $$0) {
         if (!$$3.b()) {
            $$2++;
         }

         $$1++;
      }

      return $$1 > 0 ? (float)$$2 / (float)$$1 : 0.0F;
   }

   @Override
   public void g(boolean $$0) {
      super.g($$0);
      bko $$1 = this.a(bks.m);
      $$1.b(bA.a());
      if ($$0) {
         $$1.b(bA);
      }
   }

   protected float eV() {
      return 1.0F;
   }

   public float eW() {
      return this.m_() ? (this.ag.i() - this.ag.i()) * 0.2F + 1.5F : (this.ag.i() - this.ag.i()) * 0.2F + 1.0F;
   }

   protected boolean eX() {
      return this.ev();
   }

   @Override
   public void g(biw $$0) {
      if (!this.fD()) {
         super.g($$0);
      }
   }

   private void a(biw $$0) {
      ehh $$1;
      if (this.dG()) {
         $$1 = this.dj();
      } else if (!$$0.dG() && !this.dL().a_($$0.dl()).a(apv.aI)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.ds(), $$0.ds());
         $$1 = new ehh(this.dq(), $$2, this.dw());
      }

      this.a($$1.c, $$1.d, $$1.e);
   }

   @Override
   public boolean cB() {
      return this.cA();
   }

   protected float eY() {
      return 0.42F * this.aI() + this.eZ();
   }

   public float eZ() {
      return this.a(bil.h) ? 0.1F * ((float)this.b(bil.h).e() + 1.0F) : 0.0F;
   }

   protected void fa() {
      ehh $$0 = this.do();
      this.o($$0.c, (double)this.eY(), $$0.e);
      if (this.bX()) {
         float $$1 = this.dB() * (float) (Math.PI / 180.0);
         this.f(this.do().b((double)(-asb.a($$1) * 0.2F), 0.0, (double)(asb.b($$1) * 0.2F)));
      }

      this.au = true;
   }

   protected void fb() {
      this.f(this.do().b(0.0, -0.04F, 0.0));
   }

   protected void c(aqk<eaf> $$0) {
      this.f(this.do().b(0.0, 0.04F, 0.0));
   }

   protected float fc() {
      return 0.8F;
   }

   public boolean a(eag $$0) {
      return false;
   }

   public void h(ehh $$0) {
      if (this.cW()) {
         double $$1 = 0.08;
         boolean $$2 = this.do().d <= 0.0;
         if ($$2 && this.a(bil.B)) {
            $$1 = 0.01;
         }

         eag $$3 = this.dL().b_(this.dl());
         if (this.aX() && this.dZ() && !this.a($$3)) {
            double $$4 = this.ds();
            float $$5 = this.bX() ? 0.9F : this.fc();
            float $$6 = 0.02F;
            float $$7 = (float)cnw.f(this);
            if ($$7 > 3.0F) {
               $$7 = 3.0F;
            }

            if (!this.aA()) {
               $$7 *= 0.5F;
            }

            if ($$7 > 0.0F) {
               $$5 += (0.54600006F - $$5) * $$7 / 3.0F;
               $$6 += (this.fe() - $$6) * $$7 / 3.0F;
            }

            if (this.a(bil.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(bjs.a, this.do());
            ehh $$8 = this.do();
            if (this.P && this.c_()) {
               $$8 = new ehh($$8.c, 0.2, $$8.e);
            }

            this.f($$8.d((double)$$5, 0.8F, (double)$$5));
            ehh $$9 = this.a($$1, $$2, this.do());
            this.f($$9);
            if (this.P && this.g($$9.c, $$9.d + 0.6F - this.ds() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bl() && this.dZ() && !this.a($$3)) {
            double $$10 = this.ds();
            this.a(0.02F, $$0);
            this.a(bjs.a, this.do());
            if (this.b(aqa.b) <= this.de()) {
               this.f(this.do().d(0.5, 0.8F, 0.5));
               ehh $$11 = this.a($$1, $$2, this.do());
               this.f($$11);
            } else {
               this.f(this.do().a(0.5));
            }

            if (!this.aT()) {
               this.f(this.do().b(0.0, -$$1 / 4.0, 0.0));
            }

            ehh $$12 = this.do();
            if (this.P && this.g($$12.c, $$12.d + 0.6F - this.ds() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fw()) {
            this.cm();
            ehh $$13 = this.do();
            ehh $$14 = this.bE();
            float $$15 = this.dD() * (float) (Math.PI / 180.0);
            double $$16 = Math.sqrt($$14.c * $$14.c + $$14.e * $$14.e);
            double $$17 = $$13.h();
            double $$18 = $$14.f();
            double $$19 = Math.cos((double)$$15);
            $$19 = $$19 * $$19 * Math.min(1.0, $$18 / 0.4);
            $$13 = this.do().b(0.0, $$1 * (-1.0 + $$19 * 0.75), 0.0);
            if ($$13.d < 0.0 && $$16 > 0.0) {
               double $$20 = $$13.d * -0.1 * $$19;
               $$13 = $$13.b($$14.c * $$20 / $$16, $$20, $$14.e * $$20 / $$16);
            }

            if ($$15 < 0.0F && $$16 > 0.0) {
               double $$21 = $$17 * (double)(-asb.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.f($$13.d(0.99F, 0.98F, 0.99F));
            this.a(bjs.a, this.do());
            if (this.P && !this.dL().B) {
               double $$22 = this.do().h();
               double $$23 = $$17 - $$22;
               float $$24 = (float)($$23 * 10.0 - 3.0);
               if ($$24 > 0.0F) {
                  this.a(this.d((int)$$24), 1.0F, 1.0F);
                  this.a(this.dM().l(), $$24);
               }
            }

            if (this.aA() && !this.dL().B) {
               this.b(7, false);
            }
         } else {
            gw $$25 = this.aG();
            float $$26 = this.dL().a_($$25).b().i();
            float $$27 = this.aA() ? $$26 * 0.91F : 0.91F;
            ehh $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.a(bil.y)) {
               $$29 += (0.05 * (double)(this.b(bil.y).e() + 1) - $$28.d) * 0.2;
            } else if (this.dL().B && !this.dL().A($$25)) {
               if (this.ds() > (double)this.dL().H_()) {
                  $$29 = -0.1;
               } else {
                  $$29 = 0.0;
               }
            } else if (!this.aT()) {
               $$29 -= $$1;
            }

            if (this.el()) {
               this.o($$28.c, $$29, $$28.e);
            } else {
               this.o($$28.c * (double)$$27, $$29 * 0.98F, $$28.e * (double)$$27);
            }
         }
      }

      this.q(this instanceof bvg);
   }

   private void c(cca $$0, ehh $$1) {
      ehh $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.cW()) {
         this.w(this.e($$0));
         this.h($$2);
      } else {
         this.q(false);
         this.f(ehh.b);
         this.aB();
      }
   }

   protected void a(cca $$0, ehh $$1) {
   }

   protected ehh b(cca $$0, ehh $$1) {
      return $$1;
   }

   protected float e(cca $$0) {
      return this.fe();
   }

   public void q(boolean $$0) {
      float $$1 = (float)asb.g(this.dq() - this.K, $$0 ? this.ds() - this.L : 0.0, this.dw() - this.M);
      this.v($$1);
   }

   protected void v(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aQ.a($$1, 0.4F);
   }

   public ehh a(ehh $$0, float $$1) {
      this.a(this.A($$1), $$0);
      this.f(this.j(this.do()));
      this.a(bjs.a, this.do());
      ehh $$2 = this.do();
      if ((this.P || this.bj) && (this.c_() || this.dm().a(cte.qC) && cyu.a(this))) {
         $$2 = new ehh($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public ehh a(double $$0, boolean $$1, ehh $$2) {
      if (!this.aT() && !this.bX()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new ehh($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private ehh j(ehh $$0) {
      if (this.c_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = asb.a($$0.c, -0.15F, 0.15F);
         double $$3 = asb.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dm().a(cte.nS) && this.fv() && this instanceof cca) {
            $$4 = 0.0;
         }

         $$0 = new ehh($$2, $$4, $$3);
      }

      return $$0;
   }

   private float A(float $$0) {
      return this.aA() ? this.fe() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fd();
   }

   protected float fd() {
      return this.cN() instanceof cca ? this.fe() * 0.1F : 0.02F;
   }

   public float fe() {
      return this.bY;
   }

   public void w(float $$0) {
      this.bY = $$0;
   }

   public boolean C(biw $$0) {
      this.A($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.G();
      this.K();
      if (!this.dL().B) {
         int $$0 = this.eN();
         if ($$0 > 0) {
            if (this.aI <= 0) {
               this.aI = 20 * (30 - $$0);
            }

            this.aI--;
            if (this.aI <= 0) {
               this.p($$0 - 1);
            }
         }

         int $$1 = this.eO();
         if ($$1 > 0) {
            if (this.aJ <= 0) {
               this.aJ = 20 * (30 - $$1);
            }

            this.aJ--;
            if (this.aJ <= 0) {
               this.q($$1 - 1);
            }
         }

         this.C();
         if (this.ah % 20 == 0) {
            this.eJ().c();
         }

         if (this.fD() && !this.L()) {
            this.fE();
         }
      }

      if (!this.dG()) {
         this.b_();
      }

      double $$2 = this.dq() - this.K;
      double $$3 = this.dw() - this.M;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aU;
      float $$6 = 0.0F;
      this.bc = this.bd;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)asb.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = asb.e(asb.g(this.dB()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aO > 0.0F) {
         $$5 = this.dB();
      }

      if (!this.aA()) {
         $$7 = 0.0F;
      }

      this.bd = this.bd + ($$7 - this.bd) * 0.3F;
      this.dL().ad().a("headTurn");
      $$6 = this.e($$5, $$6);
      this.dL().ad().c();
      this.dL().ad().a("rangeChecks");

      while (this.dB() - this.N < -180.0F) {
         this.N -= 360.0F;
      }

      while (this.dB() - this.N >= 180.0F) {
         this.N += 360.0F;
      }

      while (this.aU - this.aV < -180.0F) {
         this.aV -= 360.0F;
      }

      while (this.aU - this.aV >= 180.0F) {
         this.aV += 360.0F;
      }

      while (this.dD() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dD() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aW - this.aX < -180.0F) {
         this.aX -= 360.0F;
      }

      while (this.aW - this.aX >= 180.0F) {
         this.aX += 360.0F;
      }

      this.dL().ad().c();
      this.be += $$6;
      if (this.fw()) {
         this.bx++;
      } else {
         this.bx = 0;
      }

      if (this.fD()) {
         this.s(0.0F);
      }

      this.w();
   }

   private void C() {
      Map<bjb, cjl> $$0 = this.E();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bjb, cjl> E() {
      Map<bjb, cjl> $$0 = null;

      for (bjb $$1 : bjb.values()) {
         cjl $$2;
         switch ($$1.a()) {
            case a:
               $$2 = this.f($$1);
               break;
            case b:
               $$2 = this.e($$1);
               break;
            default:
               continue;
         }

         cjl $$5 = this.c($$1);
         if (this.a($$2, $$5)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bjb.class);
            }

            $$0.put($$1, $$5);
            if (!$$2.b()) {
               this.eQ().a($$2.a($$1));
            }

            if (!$$5.b()) {
               this.eQ().b($$5.a($$1));
            }
         }
      }

      return $$0;
   }

   public boolean a(cjl $$0, cjl $$1) {
      return !cjl.a($$1, $$0);
   }

   private void a(Map<bjb, cjl> $$0) {
      cjl $$1 = $$0.get(bjb.a);
      cjl $$2 = $$0.get(bjb.b);
      if ($$1 != null && $$2 != null && cjl.a($$1, this.f(bjb.b)) && cjl.a($$2, this.f(bjb.a))) {
         ((akt)this.dL()).k().b(this, new xz(this, (byte)55));
         $$0.remove(bjb.a);
         $$0.remove(bjb.b);
         this.c(bjb.a, $$1.p());
         this.c(bjb.b, $$2.p());
      }
   }

   private void b(Map<bjb, cjl> $$0) {
      List<Pair<bjb, cjl>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cjl $$3 = $$2.p();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
         }
      });
      ((akt)this.dL()).k().b(this, new aab(this.ah(), $$1));
   }

   private cjl e(bjb $$0) {
      return this.bR.get($$0.b());
   }

   private void b(bjb $$0, cjl $$1) {
      this.bR.set($$0.b(), $$1);
   }

   private cjl f(bjb $$0) {
      return this.bQ.get($$0.b());
   }

   private void c(bjb $$0, cjl $$1) {
      this.bQ.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = asb.g($$0 - this.aU);
      this.aU += $$2 * 0.3F;
      float $$3 = asb.g(this.dB() - this.aU);
      float $$4 = this.ff();
      if (Math.abs($$3) > $$4) {
         this.aU = this.aU + ($$3 - (float)asb.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float ff() {
      return 50.0F;
   }

   public void b_() {
      if (this.bZ > 0) {
         this.bZ--;
      }

      if (this.cW()) {
         this.bn = 0;
         this.f(this.dq(), this.ds(), this.dw());
      }

      if (this.bn > 0) {
         this.a(this.bn, this.bo, this.bp, this.bq, this.br, this.bs);
         this.bn--;
      } else if (!this.cX()) {
         this.f(this.do().a(0.98));
      }

      if (this.bu > 0) {
         this.a(this.bu, this.bt);
         this.bu--;
      }

      ehh $$0 = this.do();
      double $$1 = $$0.c;
      double $$2 = $$0.d;
      double $$3 = $$0.e;
      if (Math.abs($$0.c) < 0.003) {
         $$1 = 0.0;
      }

      if (Math.abs($$0.d) < 0.003) {
         $$2 = 0.0;
      }

      if (Math.abs($$0.e) < 0.003) {
         $$3 = 0.0;
      }

      this.o($$1, $$2, $$3);
      this.dL().ad().a("ai");
      if (this.eX()) {
         this.bj = false;
         this.bk = 0.0F;
         this.bm = 0.0F;
      } else if (this.cX()) {
         this.dL().ad().a("newAi");
         this.fh();
         this.dL().ad().c();
      }

      this.dL().ad().c();
      this.dL().ad().a("jump");
      if (this.bj && this.dZ()) {
         double $$4;
         if (this.bl()) {
            $$4 = this.b(aqa.b);
         } else {
            $$4 = this.b(aqa.a);
         }

         boolean $$6 = this.aX() && $$4 > 0.0;
         double $$7 = this.de();
         if (!$$6 || this.aA() && !($$4 > $$7)) {
            if (!this.bl() || this.aA() && !($$4 > $$7)) {
               if ((this.aA() || $$6 && $$4 <= $$7) && this.bZ == 0) {
                  this.fa();
                  this.bZ = 10;
               }
            } else {
               this.c(aqa.b);
            }
         } else {
            this.c(aqa.a);
         }
      } else {
         this.bZ = 0;
      }

      this.dL().ad().c();
      this.dL().ad().a("travel");
      this.bk *= 0.98F;
      this.bm *= 0.98F;
      this.F();
      ehc $$8 = this.cG();
      ehh $$9 = new ehh((double)this.bk, (double)this.bl, (double)this.bm);
      if (this.a(bil.B) || this.a(bil.y)) {
         this.n();
      }

      label104: {
         if (this.cN() instanceof cca $$10 && this.bv()) {
            this.c($$10, $$9);
            break label104;
         }

         this.h($$9);
      }

      this.dL().ad().c();
      this.dL().ad().a("freezing");
      if (!this.dL().B && !this.ev()) {
         int $$11 = this.ci();
         if (this.aA && this.dz()) {
            this.k(Math.min(this.cl(), $$11 + 1));
         } else {
            this.k(Math.max(0, $$11 - 2));
         }
      }

      this.dW();
      this.dX();
      if (!this.dL().B && this.ah % 40 == 0 && this.ck() && this.dz()) {
         this.a(this.dM().t(), 1.0F);
      }

      this.dL().ad().c();
      this.dL().ad().a("push");
      if (this.by > 0) {
         this.by--;
         this.a($$8, this.cG());
      }

      this.fi();
      this.dL().ad().c();
      if (!this.dL().B && this.fg() && this.aZ()) {
         this.a(this.dM().h(), 1.0F);
      }
   }

   public boolean fg() {
      return false;
   }

   private void F() {
      boolean $$0 = this.i(7);
      if ($$0 && !this.aA() && !this.bN() && !this.a(bil.y)) {
         cjl $$1 = this.c(bjb.e);
         if ($$1.a(cjo.nh) && cif.d($$1)) {
            $$0 = true;
            int $$2 = this.bx + 1;
            if (!this.dL().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, $$0x -> $$0x.d(bjb.e));
               }

               this.a(djn.n);
            }
         } else {
            $$0 = false;
         }
      } else {
         $$0 = false;
      }

      if (!this.dL().B) {
         this.b(7, $$0);
      }
   }

   protected void fh() {
   }

   protected void fi() {
      if (this.dL().w_()) {
         this.dL().a(djb.a(cca.class), this.cG(), biz.a(this)).forEach(this::D);
      } else {
         List<biw> $$0 = this.dL().a(this, this.cG(), biz.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dL().X().c(cpx.t);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ag.a(4) == 0) {
               int $$2 = 0;

               for (biw $$3 : $$0) {
                  if (!$$3.bN()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dM().g(), 6.0F);
               }
            }

            for (biw $$4 : $$0) {
               this.D($$4);
            }
         }
      }
   }

   protected void a(ehc $$0, ehc $$1) {
      ehc $$2 = $$0.b($$1);
      List<biw> $$3 = this.dL().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (biw $$4 : $$3) {
            if ($$4 instanceof bjm) {
               this.g((bjm)$$4);
               this.by = 0;
               this.f(this.do().a(-0.2));
               break;
            }
         }
      } else if (this.P) {
         this.by = 0;
      }

      if (!this.dL().B && this.by <= 0) {
         this.c(4, false);
      }
   }

   protected void D(biw $$0) {
      $$0.g(this);
   }

   protected void g(bjm $$0) {
   }

   public boolean fj() {
      return (this.an.b(t) & 4) != 0;
   }

   @Override
   public void aa() {
      biw $$0 = this.cY();
      super.aa();
      if ($$0 != null && $$0 != this.cY() && !this.dL().B) {
         this.a($$0);
      }
   }

   @Override
   public void by() {
      super.by();
      this.bc = this.bd;
      this.bd = 0.0F;
      this.n();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.bo = $$0;
      this.bp = $$1;
      this.bq = $$2;
      this.br = (double)$$3;
      this.bs = (double)$$4;
      this.bn = $$5;
   }

   @Override
   public double n_() {
      return this.bn > 0 ? this.bo : this.dq();
   }

   @Override
   public double K_() {
      return this.bn > 0 ? this.bp : this.ds();
   }

   @Override
   public double L_() {
      return this.bn > 0 ? this.bq : this.dw();
   }

   @Override
   public float d_() {
      return this.bn > 0 ? (float)this.bs : this.dD();
   }

   @Override
   public float o_() {
      return this.bn > 0 ? (float)this.br : this.dB();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bt = (double)$$0;
      this.bu = $$1;
   }

   public void r(boolean $$0) {
      this.bj = $$0;
   }

   public void a(byt $$0) {
      biw $$1 = $$0.v();
      if ($$1 instanceof aku) {
         al.O.a((aku)$$1, $$0.q(), this);
      }
   }

   public void a(biw $$0, int $$1) {
      if (!$$0.dG() && !this.dL().B && ($$0 instanceof byt || $$0 instanceof ccg || $$0 instanceof bjc)) {
         ((akt)this.dL()).k().b($$0, new aau($$0.ah(), this.ah(), $$1));
      }
   }

   public boolean E(biw $$0) {
      if ($$0.dL() != this.dL()) {
         return false;
      } else {
         ehh $$1 = new ehh(this.dq(), this.du(), this.dw());
         ehh $$2 = new ehh($$0.dq(), $$0.du(), $$0.dw());
         return $$2.f($$1) > 128.0 ? false : this.dL().a(new cpk($$1, $$2, cpk.a.a, cpk.b.a, this)).c() == ehf.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.aW : asb.i($$0, this.aX, this.aW);
   }

   public float x(float $$0) {
      float $$1 = this.aO - this.aN;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aN + $$1 * $$0;
   }

   @Override
   public boolean br() {
      return !this.dG();
   }

   @Override
   public boolean bs() {
      return this.bv() && !this.M_() && !this.c_();
   }

   @Override
   public float co() {
      return this.aW;
   }

   @Override
   public void n(float $$0) {
      this.aW = $$0;
   }

   @Override
   public void o(float $$0) {
      this.aU = $$0;
   }

   @Override
   protected ehh a(ha.a $$0, l.a $$1) {
      return i(super.a($$0, $$1));
   }

   public static ehh i(ehh $$0) {
      return new ehh($$0.c, $$0.d, 0.0);
   }

   public float fk() {
      return this.ca;
   }

   public final void y(float $$0) {
      this.z(asb.a($$0, 0.0F, this.eM()));
   }

   protected void z(float $$0) {
      this.ca = $$0;
   }

   public void e_() {
   }

   public void f_() {
   }

   protected void fl() {
      this.bT = true;
   }

   public abstract bjg fm();

   public boolean fn() {
      return (this.an.b(t) & 1) > 0;
   }

   public bhd fo() {
      return (this.an.b(t) & 2) > 0 ? bhd.b : bhd.a;
   }

   private void G() {
      if (this.fn()) {
         if (cjl.b(this.b(this.fo()), this.bv)) {
            this.bv = this.b(this.fo());
            this.a(this.bv);
         } else {
            this.ft();
         }
      }
   }

   protected void a(cjl $$0) {
      $$0.b(this.dL(), this, this.fq());
      if (this.I()) {
         this.b($$0, 5);
      }

      if (--this.bw == 0 && !this.dL().B && !$$0.t()) {
         this.ad_();
      }
   }

   private boolean I() {
      int $$0 = this.fq();
      ceo $$1 = this.bv.d().v();
      boolean $$2 = $$1 != null && $$1.e();
      $$2 |= $$0 <= this.bv.r() - 7;
      return $$2 && $$0 % 4 == 0;
   }

   private void K() {
      this.cg = this.cf;
      if (this.bZ()) {
         this.cf = Math.min(1.0F, this.cf + 0.09F);
      } else {
         this.cf = Math.max(0.0F, this.cf - 0.09F);
      }
   }

   protected void c(int $$0, boolean $$1) {
      int $$2 = this.an.b(t);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.an.b(t, (byte)$$2);
   }

   public void c(bhd $$0) {
      cjl $$1 = this.b($$0);
      if (!$$1.b() && !this.fn()) {
         this.bv = $$1;
         this.bw = $$1.r();
         if (!this.dL().B) {
            this.c(1, true);
            this.c(2, $$0 == bhd.b);
            this.a(djn.D);
         }
      }
   }

   @Override
   public void a(aef<?> $$0) {
      super.a($$0);
      if (bM.equals($$0)) {
         if (this.dL().B) {
            this.fB().ifPresent(this::a);
         }
      } else if (t.equals($$0) && this.dL().B) {
         if (this.fn() && this.bv.b()) {
            this.bv = this.b(this.fo());
            if (!this.bv.b()) {
               this.bw = this.bv.r();
            }
         } else if (!this.fn() && !this.bv.b()) {
            this.bv = cjl.b;
            this.bw = 0;
         }
      }
   }

   @Override
   public void a(ed.a $$0, ehh $$1) {
      super.a($$0, $$1);
      this.aX = this.aW;
      this.aU = this.aW;
      this.aV = this.aU;
   }

   protected void b(cjl $$0, int $$1) {
      if (!$$0.b() && this.fn()) {
         if ($$0.s() == cle.c) {
            this.a(this.c($$0), 0.5F, this.dL().z.i() * 0.1F + 0.9F);
         }

         if ($$0.s() == cle.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(cjl $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ehh $$3 = new ehh(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dD() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dB() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ag.i()) * 0.6 - 0.3;
         ehh $$5 = new ehh(((double)this.ag.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dD() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dB() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dq(), this.du(), this.dw());
         this.dL().a(new ir(iv.O, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void ad_() {
      if (!this.dL().B || this.fn()) {
         bhd $$0 = this.fo();
         if (!this.bv.equals(this.b($$0))) {
            this.fs();
         } else {
            if (!this.bv.b() && this.fn()) {
               this.b(this.bv, 16);
               cjl $$1 = this.bv.a(this.dL(), this);
               if ($$1 != this.bv) {
                  this.a($$0, $$1);
               }

               this.ft();
            }
         }
      }
   }

   public cjl fp() {
      return this.bv;
   }

   public int fq() {
      return this.bw;
   }

   public int fr() {
      return this.fn() ? this.bv.r() - this.fq() : 0;
   }

   public void fs() {
      if (!this.bv.b()) {
         this.bv.a(this.dL(), this, this.fq());
         if (this.bv.t()) {
            this.G();
         }
      }

      this.ft();
   }

   public void ft() {
      if (!this.dL().B) {
         boolean $$0 = this.fn();
         this.c(1, false);
         if ($$0) {
            this.a(djn.C);
         }
      }

      this.bv = cjl.b;
      this.bw = 0;
   }

   public boolean fu() {
      if (this.fn() && !this.bv.b()) {
         cjg $$0 = this.bv.d();
         return $$0.c(this.bv) != cle.d ? false : $$0.b(this.bv) - this.bw >= 5;
      } else {
         return false;
      }
   }

   public boolean fv() {
      return this.bR();
   }

   public boolean fw() {
      return this.i(7);
   }

   @Override
   public boolean bZ() {
      return super.bZ() || !this.fw() && this.c(bjy.b);
   }

   public int fx() {
      return this.bx;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dq();
      double $$5 = this.ds();
      double $$6 = this.dw();
      double $$7 = $$1;
      boolean $$8 = false;
      gw $$9 = gw.a($$0, $$1, $$2);
      cqb $$10 = this.dL();
      if ($$10.A($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.H_()) {
            gw $$12 = $$9.d();
            dfd $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.b($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cG())) {
               $$8 = true;
            }
         }
      }

      if (!$$8) {
         this.b($$4, $$5, $$6);
         return false;
      } else {
         if ($$3) {
            $$10.a(this, (byte)46);
         }

         if (this instanceof bjv) {
            ((bjv)this).L().n();
         }

         return true;
      }
   }

   public boolean fy() {
      return !this.ev();
   }

   public boolean fz() {
      return true;
   }

   public void a(gw $$0, boolean $$1) {
   }

   public boolean f(cjl $$0) {
      return false;
   }

   @Override
   public bix a(bjy $$0) {
      return $$0 == bjy.c ? v : super.a($$0).a(this.dY());
   }

   public ImmutableList<bjy> fA() {
      return ImmutableList.of(bjy.a);
   }

   public ehc e(bjy $$0) {
      bix $$1 = this.a($$0);
      return new ehc((double)(-$$1.a / 2.0F), 0.0, (double)(-$$1.a / 2.0F), (double)($$1.a / 2.0F), (double)$$1.b, (double)($$1.a / 2.0F));
   }

   protected boolean f(bjy $$0) {
      ehc $$1 = this.a($$0).a(this.dj());
      return this.dL().b(this, $$1);
   }

   @Override
   public boolean cs() {
      return super.cs() && !this.fD();
   }

   public Optional<gw> fB() {
      return this.an.b(bM);
   }

   public void g(gw $$0) {
      this.an.b(bM, Optional.of($$0));
   }

   public void fC() {
      this.an.b(bM, Optional.empty());
   }

   public boolean fD() {
      return this.fB().isPresent();
   }

   public void b(gw $$0) {
      if (this.bN()) {
         this.aa();
      }

      dfd $$1 = this.dL().a_($$0);
      if ($$1.b() instanceof csv) {
         this.dL().a($$0, $$1.a(csv.c, Boolean.valueOf(true)), 3);
      }

      this.b(bjy.c);
      this.a($$0);
      this.g($$0);
      this.f(ehh.b);
      this.au = true;
   }

   private void a(gw $$0) {
      this.e((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean L() {
      return this.fB().map($$0 -> this.dL().a_($$0).b() instanceof csv).orElse(false);
   }

   public void fE() {
      this.fB().filter(this.dL()::A).ifPresent($$0x -> {
         dfd $$1 = this.dL().a_($$0x);
         if ($$1.b() instanceof csv) {
            ha $$2 = $$1.c(csv.aE);
            this.dL().a($$0x, $$1.a(csv.c, Boolean.valueOf(false)), 3);
            ehh $$3 = csv.a(this.ag(), this.dL(), $$0x, $$2, this.dB()).orElseGet(() -> {
               gw $$1x = $$0x.c();
               return new ehh((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            ehh $$4 = ehh.c($$0x).d($$3).d();
            float $$5 = (float)asb.d(asb.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.e($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      ehh $$0 = this.dj();
      this.b(bjy.a);
      this.e($$0.c, $$0.d, $$0.e);
      this.fC();
   }

   @Nullable
   public ha fF() {
      gw $$0 = this.fB().orElse(null);
      return $$0 != null ? csv.a(this.dL(), $$0) : null;
   }

   @Override
   public boolean bw() {
      return !this.fD() && super.bw();
   }

   @Override
   protected final float a(bjy $$0, bix $$1) {
      return $$0 == bjy.c ? 0.2F : this.b($$0, $$1);
   }

   protected float b(bjy $$0, bix $$1) {
      return super.a($$0, $$1);
   }

   public cjl g(cjl $$0) {
      return cjl.b;
   }

   public cjl a(cqb $$0, cjl $$1) {
      if ($$1.M()) {
         $$0.a(null, this.dq(), this.ds(), this.dw(), this.d($$1), aph.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$1, $$0, this);
         if (!(this instanceof cca) || !((cca)this).fT().d) {
            $$1.h(1);
         }

         this.a(djn.m);
      }

      return $$1;
   }

   private void a(cjl $$0, cqb $$1, bjm $$2) {
      cjg $$3 = $$0.d();
      if ($$3.u()) {
         for (Pair<bij, Float> $$5 : $$3.v().f()) {
            if (!$$1.B && $$5.getFirst() != null && $$1.z.i() < (Float)$$5.getSecond()) {
               $$2.b(new bij((bij)$$5.getFirst()));
            }
         }
      }
   }

   private static byte g(bjb $$0) {
      switch ($$0) {
         case a:
            return 47;
         case b:
            return 48;
         case f:
            return 49;
         case e:
            return 50;
         case c:
            return 52;
         case d:
            return 51;
         default:
            return 47;
      }
   }

   public void d(bjb $$0) {
      this.dL().a(this, g($$0));
   }

   public void d(bhd $$0) {
      this.d($$0 == bhd.a ? bjb.a : bjb.b);
   }

   @Override
   public ehc g_() {
      if (this.c(bjb.f).a(cjo.tw)) {
         float $$0 = 0.5F;
         return this.cG().c(0.5, 0.5, 0.5);
      } else {
         return super.g_();
      }
   }

   public static bjb h(cjl $$0) {
      cim $$1 = cim.c_($$0);
      return $$1 != null ? $$1.g() : bjb.a;
   }

   private static bke a(bjm $$0, bjb $$1) {
      return $$1 != bjb.f && $$1 != bjb.a && $$1 != bjb.b ? bke.a($$0, $$1, $$1x -> $$1x.b() || bjo.h($$1x) == $$1) : bke.a($$0, $$1);
   }

   @Nullable
   private static bjb r(int $$0) {
      if ($$0 == 100 + bjb.f.b()) {
         return bjb.f;
      } else if ($$0 == 100 + bjb.e.b()) {
         return bjb.e;
      } else if ($$0 == 100 + bjb.d.b()) {
         return bjb.d;
      } else if ($$0 == 100 + bjb.c.b()) {
         return bjb.c;
      } else if ($$0 == 98) {
         return bjb.a;
      } else {
         return $$0 == 99 ? bjb.b : null;
      }
   }

   @Override
   public bke a_(int $$0) {
      bjb $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dz() {
      if (this.M_()) {
         return false;
      } else {
         boolean $$0 = !this.c(bjb.f).a(aqd.az) && !this.c(bjb.e).a(aqd.az) && !this.c(bjb.d).a(aqd.az) && !this.c(bjb.c).a(aqd.az);
         return $$0 && super.dz();
      }
   }

   @Override
   public boolean cc() {
      return !this.dL().w_() && this.a(bil.x) || super.cc();
   }

   @Override
   public float dC() {
      return this.aU;
   }

   @Override
   public void a(wy $$0) {
      double $$1 = $$0.f();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      float $$4 = $$0.m();
      float $$5 = $$0.l();
      this.f($$1, $$2, $$3);
      this.aU = $$0.n();
      this.aW = $$0.n();
      this.aV = this.aU;
      this.aX = this.aW;
      this.e($$0.a());
      this.a_($$0.d());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.o($$0.i(), $$0.j(), $$0.k());
   }

   public boolean fG() {
      return this.eS().d() instanceof cha;
   }

   @Override
   public float dF() {
      float $$0 = super.dF();
      return this.cN() instanceof cca ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public ehh m(biw $$0) {
      return new ehh(this.a($$0, this.a(this.an()), this.dY()).rotateY(-this.aU * (float) (Math.PI / 180.0))).e(this.dj());
   }

   @Override
   public float k(biw $$0) {
      return this.l($$0) * this.dY();
   }

   protected void a(int $$0, double $$1) {
      this.aW = (float)asb.e(1.0 / (double)$$0, (double)this.aW, $$1);
   }

   public static record a(apf a, apf b) {
   }
}
