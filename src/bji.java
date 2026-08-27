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

public abstract class bji extends bis implements biq {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final bkm bA = new bkm(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, bkm.a.c);
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
   protected static final aeg<Byte> t = aej.a(bji.class, aei.a);
   private static final aeg<Float> bH = aej.a(bji.class, aei.d);
   private static final aeg<Integer> bI = aej.a(bji.class, aei.b);
   private static final aeg<Boolean> bJ = aej.a(bji.class, aei.k);
   private static final aeg<Integer> bK = aej.a(bji.class, aei.b);
   private static final aeg<Integer> bL = aej.a(bji.class, aei.b);
   private static final aeg<Optional<gw>> bM = aej.a(bji.class, aei.o);
   protected static final float u = 1.74F;
   protected static final bit v = bit.c(0.2F, 0.2F);
   public static final float aE = 0.5F;
   private static final int bN = 50;
   private final bkl bO;
   private final bhn bP = new bhn(this);
   private final Map<bid, bif> bQ = Maps.newHashMap();
   private final hp<cjh> bR = hp.a(2, cjh.b);
   private final hp<cjh> bS = hp.a(4, cjh.b);
   public boolean aF;
   private boolean bT = false;
   public bgz aG;
   public int aH;
   public int aI;
   public int aJ;
   public int aK;
   public int aL;
   public int aM;
   public float aN;
   public float aO;
   protected int aP;
   public final bkh aQ = new bkh();
   public final int aR = 20;
   public final float aS;
   public final float aT;
   public float aU;
   public float aV;
   public float aW;
   public float aX;
   @Nullable
   protected cbw aY;
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
   private boolean bU = true;
   @Nullable
   private bji bV;
   private int bW;
   private bji bX;
   private int bY;
   private float bZ;
   private int ca;
   private float cb;
   protected cjh bv = cjh.b;
   protected int bw;
   protected int bx;
   private gw cc;
   private Optional<gw> cd = Optional.empty();
   @Nullable
   private bhq ce;
   private long cf;
   protected int by;
   private float cg;
   private float ch;
   protected bki<?> bz;
   private boolean ci;

   protected bji(biw<? extends bji> $$0, cpx $$1) {
      super($$0, $$1);
      this.bO = new bkl(bkp.a($$0));
      this.c(this.eL());
      this.I = true;
      this.aT = (float)((Math.random() + 1.0) * 0.01F);
      this.ap();
      this.aS = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.aW = this.dB();
      this.t(0.6F);
      rk $$2 = rk.a;
      this.bz = this.a(new Dynamic($$2, (rs)$$2.createMap(ImmutableMap.of($$2.a("memories"), (rs)$$2.emptyMap()))));
   }

   public bki<?> dN() {
      return this.bz;
   }

   protected bki.b<?> dO() {
      return bki.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bki<?> a(Dynamic<?> $$0) {
      return this.dO().a($$0);
   }

   @Override
   public void aj() {
      this.a(this.dM().w(), Float.MAX_VALUE);
   }

   public boolean a(biw<?> $$0) {
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

   public static bkn.a dP() {
      return bkn.a().a(bko.a).a(bko.c).a(bko.d).a(bko.i).a(bko.j).a(bko.l);
   }

   @Override
   protected void a(double $$0, boolean $$1, dfl $$2, gw $$3) {
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

         float $$11 = (float)ary.f(this.ab - 3.0F);
         double $$12 = Math.min((double)(0.2F + $$11 / 15.0F), 2.5);
         int $$13 = (int)(150.0 * $$12);
         ((aks)this.dL()).a(new ip(ix.c, $$2), $$4, $$5, $$6, $$13, 0.0, 0.0, 0.0, 0.15F);
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cd = Optional.empty();
      }
   }

   public boolean dQ() {
      return this.eR() == bjn.b;
   }

   public float a(float $$0) {
      return ary.i($$0, this.ch, this.cg);
   }

   @Override
   public void aq() {
      this.aN = this.aO;
      if (this.am) {
         this.fA().ifPresent(this::a);
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
         boolean $$0 = this instanceof cbw;
         if (!this.dL().B) {
            if (this.bw()) {
               this.a(this.dM().f(), 1.0F);
            } else if ($$0 && !this.dL().B_().a(this.cG())) {
               double $$1 = this.dL().B_().a(this) + this.dL().B_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dL().B_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dM().v(), (float)Math.max(1, ary.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(apz.a) && !this.dL().a_(gw.a(this.dq(), this.du(), this.dw())).a(csy.nd)) {
            boolean $$3 = !this.dQ() && !big.c(this) && (!$$0 || !((cbw)this).fS().a);
            if ($$3) {
               this.j(this.m(this.ch()));
               if (this.ch() == -20) {
                  this.j(0);
                  ehp $$4 = this.do();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.ag.j() - this.ag.j();
                     double $$7 = this.ag.j() - this.ag.j();
                     double $$8 = this.ag.j() - this.ag.j();
                     this.dL().a(ix.e, this.dq() + $$6, this.ds() + $$7, this.dw() + $$8, $$4.c, $$4.d, $$4.e);
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
            if (!Objects.equal(this.cc, $$9)) {
               this.cc = $$9;
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

      if (this.al > 0 && !(this instanceof akt)) {
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

      if (this.bX != null && !this.bX.bv()) {
         this.bX = null;
      }

      if (this.bV != null) {
         if (!this.bV.bv()) {
            this.a(null);
         } else if (this.ah - this.bW > 100) {
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
      return this.ah % 5 == 0 && this.do().c != 0.0 && this.do().e != 0.0 && !this.M_() && cns.k(this) && this.dT();
   }

   protected void dS() {
      ehp $$0 = this.do();
      this.dL()
         .a(
            ix.I,
            this.dq() + (this.ag.j() - 0.5) * (double)this.df(),
            this.ds() + 0.1,
            this.dw() + (this.ag.j() - 0.5) * (double)this.df(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.ag.i() * 0.4F + this.ag.i() > 0.9F ? 0.6F : 0.0F;
      this.a(apf.wd, $$1, 0.6F + this.ag.i() * 0.4F);
   }

   protected boolean dT() {
      return this.dL().a_(this.aG()).a(apu.aM);
   }

   @Override
   protected float aJ() {
      return this.dT() && cns.a(cnu.l, this) > 0 ? 1.0F : super.aJ();
   }

   @Override
   protected boolean c(dfl $$0) {
      return !$$0.i() || this.fv();
   }

   protected void dU() {
      bkk $$0 = this.a(bko.d);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void dV() {
      if (!this.bh().i()) {
         int $$0 = cns.a(cnu.l, this);
         if ($$0 > 0 && this.dT()) {
            bkk $$1 = this.a(bko.d);
            if ($$1 == null) {
               return;
            }

            $$1.b(new bkm(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), bkm.a.a));
            if (this.ef().i() < 0.04F) {
               cjh $$2 = this.c(bix.c);
               $$2.a(1, this, $$0x -> $$0x.d(bix.c));
            }
         }
      }
   }

   protected void dW() {
      bkk $$0 = this.a(bko.d);
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
            bkk $$1 = this.a(bko.d);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cj();
            $$1.b(new bkm(e, "Powder snow slow", (double)$$2, bkm.a.a));
         }
      }
   }

   protected void c(gw $$0) {
      int $$1 = cns.a(cnu.j, this);
      if ($$1 > 0) {
         cnx.a(this, this.dL(), $$0, $$1);
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
         this.a(bis.c.a);
      }
   }

   public boolean eb() {
      return !this.m_();
   }

   protected boolean ec() {
      return !this.m_();
   }

   protected int m(int $$0) {
      int $$1 = cns.e(this);
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

   public ase ef() {
      return this.ag;
   }

   @Nullable
   public bji eg() {
      return this.bV;
   }

   @Override
   public bji S_() {
      return this.eg();
   }

   public int eh() {
      return this.bW;
   }

   public void c(@Nullable cbw $$0) {
      this.aY = $$0;
      this.aZ = this.ah;
   }

   public void a(@Nullable bji $$0) {
      this.bV = $$0;
      this.bW = this.ah;
   }

   @Nullable
   public bji ei() {
      return this.bX;
   }

   public int ej() {
      return this.bY;
   }

   public void A(bis $$0) {
      if ($$0 instanceof bji) {
         this.bX = (bji)$$0;
      } else {
         this.bX = null;
      }

      this.bY = this.ah;
   }

   public int ek() {
      return this.bb;
   }

   public void o(int $$0) {
      this.bb = $$0;
   }

   public boolean el() {
      return this.bT;
   }

   public void p(boolean $$0) {
      this.bT = $$0;
   }

   protected boolean a(bix $$0) {
      return true;
   }

   public void a(bix $$0, cjh $$1, cjh $$2) {
      boolean $$3 = $$2.b() && $$1.b();
      if (!$$3 && !cjh.c($$1, $$2) && !this.am) {
         cii $$4 = cii.c_($$2);
         if (!this.dL().w_() && !this.M_()) {
            if (!this.aS() && $$4 != null && $$4.g() == $$0) {
               this.dL().a(null, this.dq(), this.ds(), this.dw(), $$4.ao_(), this.da(), 1.0F, 1.0F);
            }

            if (this.a($$0)) {
               this.a($$4 != null ? djv.v : djv.S);
            }
         }
      }
   }

   @Override
   public void a(bis.c $$0) {
      super.a($$0);
      this.bz.a();
   }

   @Override
   public void b(qy $$0) {
      $$0.a("Health", this.eu());
      $$0.a("HurtTime", (short)this.aK);
      $$0.a("HurtByTimestamp", this.bW);
      $$0.a("DeathTime", (short)this.aM);
      $$0.a("AbsorptionAmount", this.fj());
      $$0.a("Attributes", this.eQ().c());
      if (!this.bQ.isEmpty()) {
         re $$1 = new re();

         for (bif $$2 : this.bQ.values()) {
            $$1.add($$2.a(new qy()));
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fv());
      this.fA().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<rs> $$3 = this.bz.a(rk.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(qy $$0) {
      this.z($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dL() != null && !this.dL().B) {
         this.eQ().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         re $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            qy $$3 = $$1.a($$2);
            bif $$4 = bif.b($$3);
            if ($$4 != null) {
               this.bQ.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.c($$0.j("Health"));
      }

      this.aK = $$0.g("HurtTime");
      this.aM = $$0.g("DeathTime");
      this.bW = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         eim $$6 = this.dL().I().d($$5);
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
         this.an.b(as, bju.c);
         if (!this.am) {
            this.a($$8);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bz = this.a(new Dynamic(rk.a, $$0.c("Brain")));
      }
   }

   protected void em() {
      Iterator<bid> $$0 = this.bQ.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            bid $$1 = $$0.next();
            bif $$2 = this.bQ.get($$1);
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

      if (this.bU) {
         if (!this.dL().B) {
            this.H();
            this.s();
         }

         this.bU = false;
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
            this.dL().a($$4 ? ix.a : ix.v, this.d(0.5), this.dt(), this.g(0.5), $$7, $$8, $$9);
         }
      }
   }

   protected void H() {
      if (this.bQ.isEmpty()) {
         this.ep();
         this.j(false);
      } else {
         Collection<bif> $$0 = this.bQ.values();
         this.an.b(bJ, c($$0));
         this.an.b(bI, clg.a($$0));
         this.j(this.a(bih.n));
      }
   }

   private void s() {
      boolean $$0 = this.cc();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable bis $$0) {
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
         cjh $$3 = this.c(bix.f);
         biw<?> $$4 = $$0.ag();
         if ($$4 == biw.aJ && $$3.a(cjk.tr)
            || $$4 == biw.bp && $$3.a(cjk.tu)
            || $$4 == biw.aw && $$3.a(cjk.tx)
            || $$4 == biw.ax && $$3.a(cjk.tx)
            || $$4 == biw.u && $$3.a(cjk.tv)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bji $$0) {
      return $$0 instanceof cbw && this.dL().ai() == bgx.a ? false : $$0.en();
   }

   public boolean a(bji $$0, btu $$1) {
      return $$1.a(this, $$0);
   }

   public boolean en() {
      return !this.cq() && this.eo();
   }

   public boolean eo() {
      return !this.M_() && this.bv();
   }

   public static boolean c(Collection<bif> $$0) {
      for (bif $$1 : $$0) {
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
         Iterator<bif> $$0 = this.bQ.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<bif> er() {
      return this.bQ.values();
   }

   public Map<bid, bif> es() {
      return this.bQ;
   }

   public boolean a(bid $$0) {
      return this.bQ.containsKey($$0);
   }

   @Nullable
   public bif b(bid $$0) {
      return this.bQ.get($$0);
   }

   public final boolean b(bif $$0) {
      return this.b($$0, null);
   }

   public boolean b(bif $$0, @Nullable bis $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         bif $$2 = this.bQ.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bQ.put($$0.c(), $$0);
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

   public boolean c(bif $$0) {
      if (this.eR() == bjn.b) {
         bid $$1 = $$0.c();
         if ($$1 == bih.j || $$1 == bih.s) {
            return false;
         }
      }

      return true;
   }

   public void c(bif $$0, @Nullable bis $$1) {
      if (this.c($$0)) {
         bif $$2 = this.bQ.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean et() {
      return this.eR() == bjn.b;
   }

   @Nullable
   public bif c(@Nullable bid $$0) {
      return this.bQ.remove($$0);
   }

   public boolean d(bid $$0) {
      bif $$1 = this.c($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(bif $$0, @Nullable bis $$1) {
      this.bU = true;
      if (!this.dL().B) {
         $$0.c().a(this.eQ(), $$0.e());
         this.d($$0);
      }
   }

   public void d(bif $$0) {
      for (bis $$1 : this.cP()) {
         if ($$1 instanceof akt $$2) {
            $$2.c.b(new aaz(this.ah(), $$0));
         }
      }
   }

   protected void a(bif $$0, boolean $$1, @Nullable bis $$2) {
      this.bU = true;
      if ($$1 && !this.dL().B) {
         bid $$3 = $$0.c();
         $$3.a(this.eQ());
         $$3.a(this.eQ(), $$0.e());
         this.w();
      }

      if (!this.dL().B) {
         this.d($$0);
      }
   }

   protected void a(bif $$0) {
      this.bU = true;
      if (!this.dL().B) {
         $$0.c().a(this.eQ());
         this.w();

         for (bis $$1 : this.cP()) {
            if ($$1 instanceof akt $$2) {
               $$2.c.b(new zh(this.ah(), $$0.c()));
            }
         }
      }
   }

   private void w() {
      for (bkk $$0 : this.eQ().a()) {
         this.d($$0.a());
      }
   }

   private void d(bkj $$0) {
      if ($$0 == bko.a) {
         float $$1 = this.eL();
         if (this.eu() > $$1) {
            this.c($$1);
         }
      } else if ($$0 == bko.l) {
         float $$2 = this.eM();
         if (this.fj() > $$2) {
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
      this.an.b(bH, ary.a($$0, 0.0F, this.eL()));
   }

   public boolean ev() {
      return this.eu() <= 0.0F;
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dL().B) {
         return false;
      } else if (this.ev()) {
         return false;
      } else if ($$0.a(apw.i) && this.a(bih.l)) {
         return false;
      } else {
         if (this.fC() && !this.dL().B) {
            this.fD();
         }

         this.bb = 0;
         float $$2 = $$1;
         boolean $$3 = false;
         float $$4 = 0.0F;
         if ($$1 > 0.0F && this.f($$0)) {
            this.u($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.a(apw.j) && $$0.c() instanceof bji $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(apw.o) && this.ag().a(apx.j)) {
            $$1 *= 5.0F;
         }

         this.aQ.a(1.5F);
         boolean $$7 = true;
         if ((float)this.al > 10.0F && !$$0.a(apw.e)) {
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

         if ($$0.a(apw.a) && !this.c(bix.f).b()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         bis $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof bji $$9 && !$$0.a(apw.q)) {
               this.a($$9);
            }

            if ($$8 instanceof cbw $$10) {
               this.aZ = 100;
               this.aY = $$10;
            } else if ($$8 instanceof bvw $$11 && $$11.s()) {
               this.aZ = 100;
               if ($$11.O_() instanceof cbw $$12) {
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

            if (!$$0.a(apw.r) && (!$$3 || $$1 > 0.0F)) {
               this.bo();
            }

            if ($$8 != null && !$$0.a(apw.z)) {
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
               ape $$15 = this.l_();
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
            this.ce = $$0;
            this.cf = this.dL().V();
         }

         if (this instanceof akt) {
            al.h.a((akt)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((akt)this).a(app.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof akt) {
            al.g.a((akt)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$16;
      }
   }

   protected void d(bji $$0) {
      $$0.e(this);
   }

   protected void e(bji $$0) {
      $$0.q(0.5, $$0.dq() - this.dq(), $$0.dw() - this.dw());
   }

   private boolean h(bhq $$0) {
      if ($$0.a(apw.d)) {
         return false;
      } else {
         cjh $$1 = null;

         for (bgz $$2 : bgz.values()) {
            cjh $$3 = this.b($$2);
            if ($$3.a(cjk.uz)) {
               $$1 = $$3.p();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof akt $$4) {
               $$4.b(app.c.b(cjk.uz));
               al.B.a($$4, $$1);
               this.a(djv.C);
            }

            this.c(1.0F);
            this.eq();
            this.b(new bif(bih.j, 900, 1));
            this.b(new bif(bih.v, 100, 1));
            this.b(new bif(bih.l, 800, 0));
            this.dL().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bhq ew() {
      if (this.dL().V() - this.cf > 40L) {
         this.ce = null;
      }

      return this.ce;
   }

   protected void e(bhq $$0) {
      ape $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eV(), this.eW());
      }
   }

   public boolean f(bhq $$0) {
      bis $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof ccc $$3 && $$3.B() > 0) {
         $$2 = true;
      }

      if (!$$0.a(apw.c) && this.ft() && !$$2) {
         ehp $$4 = $$0.h();
         if ($$4 != null) {
            ehp $$5 = this.f(1.0F);
            ehp $$6 = $$4.a(this.dj()).d();
            $$6 = new ehp($$6.c, 0.0, $$6.e);
            if ($$6.b($$5) < 0.0) {
               return true;
            }
         }
      }

      return false;
   }

   private void i(cjh $$0) {
      if (!$$0.b()) {
         if (!this.aS()) {
            this.dL().a(this.dq(), this.ds(), this.dw(), apf.lZ, this.da(), 0.8F, 0.8F + this.dL().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bhq $$0) {
      if (!this.dG() && !this.ba) {
         bis $$1 = $$0.d();
         bji $$2 = this.eK();
         if (this.bh >= 0 && $$2 != null) {
            $$2.a(this, this.bh, $$0);
         }

         if (this.fC()) {
            this.fD();
         }

         if (!this.dL().B && this.ac()) {
            b.info("Named entity {} died: {}", this, this.eJ().a().getString());
         }

         this.ba = true;
         this.eJ().c();
         if (this.dL() instanceof aks $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(djv.p);
               this.g($$0);
               this.f($$2);
            }

            this.dL().a(this, (byte)3);
         }

         this.b(bju.h);
      }
   }

   protected void f(@Nullable bji $$0) {
      if (!this.dL().B) {
         boolean $$1 = false;
         if ($$0 instanceof byd) {
            if (this.dL().X().b(cpt.c)) {
               gw $$2 = this.dl();
               dfl $$3 = csy.cd.n();
               if (this.dL().a_($$2).i() && $$3.a((cqa)this.dL(), $$2)) {
                  this.dL().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               byp $$4 = new byp(this.dL(), this.dq(), this.ds(), this.dw(), new cjh(cjk.da));
               this.dL().b($$4);
            }
         }
      }
   }

   protected void g(bhq $$0) {
      bis $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof cbw) {
         $$2 = cns.h((bji)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.aZ > 0;
      if (this.ec() && this.dL().X().b(cpt.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.ex();
      this.ey();
   }

   protected void ex() {
   }

   protected void ey() {
      if (this.dL() instanceof aks && !this.eC() && (this.ee() || this.aZ > 0 && this.eb() && this.dL().X().b(cpt.f))) {
         biy.a((aks)this.dL(), this.dj(), this.ed());
      }
   }

   protected void a(bhq $$0, int $$1, boolean $$2) {
   }

   public aey ez() {
      return this.ag().j();
   }

   public long eA() {
      return 0L;
   }

   protected void a(bhq $$0, boolean $$1) {
      aey $$2 = this.ez();
      eda $$3 = this.dL().n().aH().getLootTable($$2);
      ecy.a $$4 = new ecy.a((aks)this.dL()).a(efd.a, this).a(efd.f, this.dj()).a(efd.c, $$0).b(efd.d, $$0.d()).b(efd.e, $$0.c());
      if ($$1 && this.aY != null) {
         $$4 = $$4.a(efd.b, this.aY).a(this.aY.gn());
      }

      ecy $$5 = $$4.a(efc.g);
      $$3.a($$5, this.eA(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.b(bko.c);
      if (!($$0 <= 0.0)) {
         this.au = true;
         ehp $$3 = this.do();
         ehp $$4 = new ehp($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aA() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected ape d(bhq $$0) {
      return apf.iZ;
   }

   @Nullable
   protected ape l_() {
      return apf.iU;
   }

   private ape d(int $$0) {
      return $$0 > 4 ? this.eF().b() : this.eF().a();
   }

   public void eB() {
      this.ci = true;
   }

   public boolean eC() {
      return this.ci;
   }

   public float eD() {
      return 0.0F;
   }

   protected ehk eE() {
      ehk $$0 = this.cG();
      bis $$1 = this.cY();
      if ($$1 != null) {
         ehp $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public bji.a eF() {
      return new bji.a(apf.ja, apf.iS);
   }

   protected ape c(cjh $$0) {
      return $$0.N();
   }

   public ape d(cjh $$0) {
      return $$0.O();
   }

   public Optional<gw> eG() {
      return this.cd;
   }

   public boolean c_() {
      if (this.M_()) {
         return false;
      } else {
         gw $$0 = this.dl();
         dfl $$1 = this.dm();
         if ($$1.a(apu.aO)) {
            this.cd = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dbk && this.c($$0, $$1)) {
            this.cd = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(gw $$0, dfl $$1) {
      if ($$1.c(dbk.a)) {
         dfl $$2 = this.dL().a_($$0.d());
         if ($$2.a(csy.cO) && $$2.c(cxa.a) == $$1.c(dbk.aC)) {
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
   public boolean a(float $$0, float $$1, bhq $$2) {
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
      if (this.ag().a(apx.l)) {
         return 0;
      } else {
         bif $$2 = this.b(bih.h);
         float $$3 = $$2 == null ? 0.0F : (float)($$2.e() + 1);
         return ary.f(($$0 - 3.0F - $$3) * $$1);
      }
   }

   protected void eH() {
      if (!this.aS()) {
         int $$0 = ary.a(this.dq());
         int $$1 = ary.a(this.ds() - 0.2F);
         int $$2 = ary.a(this.dw());
         dfl $$3 = this.dL().a_(new gw($$0, $$1, $$2));
         if (!$$3.i()) {
            dak $$4 = $$3.w();
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
      return ary.a(this.b(bko.i));
   }

   protected void b(bhq $$0, float $$1) {
   }

   protected void c(bhq $$0, float $$1) {
   }

   protected void u(float $$0) {
   }

   protected float d(bhq $$0, float $$1) {
      if (!$$0.a(apw.b)) {
         this.b($$0, $$1);
         $$1 = bhm.a($$1, (float)this.eI(), (float)this.b(bko.j));
      }

      return $$1;
   }

   protected float e(bhq $$0, float $$1) {
      if ($$0.a(apw.f)) {
         return $$1;
      } else {
         if (this.a(bih.k) && !$$0.a(apw.g)) {
            int $$2 = (this.b(bih.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof akt) {
                  ((akt)this).a(app.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof akt) {
                  ((akt)$$0.d()).a(app.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(apw.h)) {
            return $$1;
         } else {
            int $$7 = cns.a(this.bK(), $$0);
            if ($$7 > 0) {
               $$1 = bhm.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bhq $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fj(), 0.0F);
         this.y(this.fj() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof akt $$4) {
            $$4.a(app.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eJ().a($$0, var9);
            this.c(this.eu() - var9);
            this.y(this.fj() - var9);
            this.a(djv.o);
         }
      }
   }

   public bhn eJ() {
      return this.bP;
   }

   @Nullable
   public bji eK() {
      if (this.aY != null) {
         return this.aY;
      } else {
         return this.bV != null ? this.bV : null;
      }
   }

   public final float eL() {
      return (float)this.b(bko.a);
   }

   public final float eM() {
      return (float)this.b(bko.l);
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
      if (big.a(this)) {
         return 6 - (1 + big.b(this));
      } else {
         return this.a(bih.d) ? 6 + (1 + this.b(bih.d).e()) * 2 : 6;
      }
   }

   public void a(bgz $$0) {
      this.a($$0, false);
   }

   public void a(bgz $$0, boolean $$1) {
      if (!this.aF || this.aH >= this.z() / 2 || this.aH < 0) {
         this.aH = -1;
         this.aF = true;
         this.aG = $$0;
         if (this.dL() instanceof aks) {
            xb $$2 = new xb(this, $$0 == bgz.a ? 0 : 3);
            akq $$3 = ((aks)this.dL()).k();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bhq $$0) {
      this.aQ.a(1.5F);
      this.al = 20;
      this.aL = 10;
      this.aK = this.aL;
      ape $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eV(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
      }

      this.a(this.dM().n(), 0.0F);
      this.ce = $$0;
      this.cf = this.dL().V();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            ape $$1 = this.l_();
            if ($$1 != null) {
               this.a($$1, this.eV(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cbw)) {
               this.c(0.0F);
               this.a(this.dM().n());
            }
            break;
         case 29:
            this.a(apf.uQ, 1.0F, 0.8F + this.dL().z.i() * 0.4F);
            break;
         case 30:
            this.a(apf.uR, 0.8F, 0.8F + this.dL().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ag.i() - 0.5F) * 0.2F;
               float $$6 = (this.ag.i() - 0.5F) * 0.2F;
               float $$7 = (this.ag.i() - 0.5F) * 0.2F;
               double $$8 = ary.d($$4, this.K, this.dq()) + (this.ag.j() - 0.5) * (double)this.df() * 2.0;
               double $$9 = ary.d($$4, this.L, this.ds()) + this.ag.j() * (double)this.dg();
               double $$10 = ary.d($$4, this.M, this.dw()) + (this.ag.j() - 0.5) * (double)this.df() * 2.0;
               this.dL().a(ix.X, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.c(bix.a));
            break;
         case 48:
            this.i(this.c(bix.b));
            break;
         case 49:
            this.i(this.c(bix.f));
            break;
         case 50:
            this.i(this.c(bix.e));
            break;
         case 51:
            this.i(this.c(bix.d));
            break;
         case 52:
            this.i(this.c(bix.c));
            break;
         case 54:
            cwo.b(this);
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
         this.dL().a(ix.W, this.d(1.0), this.dt(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void B() {
      cjh $$0 = this.c(bix.b);
      this.a(bix.b, this.c(bix.a));
      this.a(bix.a, $$0);
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
   public bkk a(bkj $$0) {
      return this.eQ().a($$0);
   }

   public double a(hg<bkj> $$0) {
      return this.b($$0.a());
   }

   public double b(bkj $$0) {
      return this.eQ().c($$0);
   }

   public double b(hg<bkj> $$0) {
      return this.c($$0.a());
   }

   public double c(bkj $$0) {
      return this.eQ().d($$0);
   }

   public bkl eQ() {
      return this.bO;
   }

   public bjn eR() {
      return bjn.a;
   }

   public cjh eS() {
      return this.c(bix.a);
   }

   public cjh eT() {
      return this.c(bix.b);
   }

   public boolean b(cjc $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cjh> $$0) {
      return $$0.test(this.eS()) || $$0.test(this.eT());
   }

   public cjh b(bgz $$0) {
      if ($$0 == bgz.a) {
         return this.c(bix.a);
      } else if ($$0 == bgz.b) {
         return this.c(bix.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bgz $$0, cjh $$1) {
      if ($$0 == bgz.a) {
         this.a(bix.a, $$1);
      } else {
         if ($$0 != bgz.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bix.b, $$1);
      }
   }

   public boolean b(bix $$0) {
      return !this.c($$0).b();
   }

   @Override
   public abstract Iterable<cjh> bK();

   public abstract cjh c(bix var1);

   @Override
   public abstract void a(bix var1, cjh var2);

   protected void e(cjh $$0) {
      qy $$1 = $$0.v();
      if ($$1 != null) {
         $$0.d().b($$1);
      }
   }

   public float eU() {
      Iterable<cjh> $$0 = this.bK();
      int $$1 = 0;
      int $$2 = 0;

      for (cjh $$3 : $$0) {
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
      bkk $$1 = this.a(bko.d);
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
   public void g(bis $$0) {
      if (!this.fC()) {
         super.g($$0);
      }
   }

   private void a(bis $$0) {
      ehp $$1;
      if (this.dG()) {
         $$1 = this.dj();
      } else if (!$$0.dG() && !this.dL().a_($$0.dl()).a(apu.aI)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.ds(), $$0.ds());
         $$1 = new ehp(this.dq(), $$2, this.dw());
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
      return this.a(bih.h) ? 0.1F * ((float)this.b(bih.h).e() + 1.0F) : 0.0F;
   }

   protected void fa() {
      ehp $$0 = this.do();
      this.o($$0.c, (double)this.eY(), $$0.e);
      if (this.bX()) {
         float $$1 = this.dB() * (float) (Math.PI / 180.0);
         this.f(this.do().b((double)(-ary.a($$1) * 0.2F), 0.0, (double)(ary.b($$1) * 0.2F)));
      }

      this.au = true;
   }

   protected void fb() {
      this.f(this.do().b(0.0, -0.04F, 0.0));
   }

   protected void c(aqj<ean> $$0) {
      this.f(this.do().b(0.0, 0.04F, 0.0));
   }

   protected float fc() {
      return 0.8F;
   }

   public boolean a(eao $$0) {
      return false;
   }

   public void h(ehp $$0) {
      if (this.cW()) {
         double $$1 = 0.08;
         boolean $$2 = this.do().d <= 0.0;
         if ($$2 && this.a(bih.B)) {
            $$1 = 0.01;
         }

         eao $$3 = this.dL().b_(this.dl());
         if (this.aX() && this.dZ() && !this.a($$3)) {
            double $$4 = this.ds();
            float $$5 = this.bX() ? 0.9F : this.fc();
            float $$6 = 0.02F;
            float $$7 = (float)cns.f(this);
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

            if (this.a(bih.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(bjo.a, this.do());
            ehp $$8 = this.do();
            if (this.P && this.c_()) {
               $$8 = new ehp($$8.c, 0.2, $$8.e);
            }

            this.f($$8.d((double)$$5, 0.8F, (double)$$5));
            ehp $$9 = this.a($$1, $$2, this.do());
            this.f($$9);
            if (this.P && this.g($$9.c, $$9.d + 0.6F - this.ds() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bl() && this.dZ() && !this.a($$3)) {
            double $$10 = this.ds();
            this.a(0.02F, $$0);
            this.a(bjo.a, this.do());
            if (this.b(apz.b) <= this.de()) {
               this.f(this.do().d(0.5, 0.8F, 0.5));
               ehp $$11 = this.a($$1, $$2, this.do());
               this.f($$11);
            } else {
               this.f(this.do().a(0.5));
            }

            if (!this.aT()) {
               this.f(this.do().b(0.0, -$$1 / 4.0, 0.0));
            }

            ehp $$12 = this.do();
            if (this.P && this.g($$12.c, $$12.d + 0.6F - this.ds() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fv()) {
            this.cm();
            ehp $$13 = this.do();
            ehp $$14 = this.bE();
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
               double $$21 = $$17 * (double)(-ary.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.f($$13.d(0.99F, 0.98F, 0.99F));
            this.a(bjo.a, this.do());
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
            float $$26 = this.dL().a_($$25).b().h();
            float $$27 = this.aA() ? $$26 * 0.91F : 0.91F;
            ehp $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.a(bih.y)) {
               $$29 += (0.05 * (double)(this.b(bih.y).e() + 1) - $$28.d) * 0.2;
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

      this.q(this instanceof bvc);
   }

   private void c(cbw $$0, ehp $$1) {
      ehp $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.cW()) {
         this.w(this.e($$0));
         this.h($$2);
      } else {
         this.q(false);
         this.f(ehp.b);
         this.aB();
      }
   }

   protected void a(cbw $$0, ehp $$1) {
   }

   protected ehp b(cbw $$0, ehp $$1) {
      return $$1;
   }

   protected float e(cbw $$0) {
      return this.fe();
   }

   public void q(boolean $$0) {
      float $$1 = (float)ary.g(this.dq() - this.K, $$0 ? this.ds() - this.L : 0.0, this.dw() - this.M);
      this.v($$1);
   }

   protected void v(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aQ.a($$1, 0.4F);
   }

   public ehp a(ehp $$0, float $$1) {
      this.a(this.A($$1), $$0);
      this.f(this.j(this.do()));
      this.a(bjo.a, this.do());
      ehp $$2 = this.do();
      if ((this.P || this.bj) && (this.c_() || this.dm().a(csy.qC) && cyp.a(this))) {
         $$2 = new ehp($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public ehp a(double $$0, boolean $$1, ehp $$2) {
      if (!this.aT() && !this.bX()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new ehp($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private ehp j(ehp $$0) {
      if (this.c_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = ary.a($$0.c, -0.15F, 0.15F);
         double $$3 = ary.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dm().a(csy.nS) && this.fu() && this instanceof cbw) {
            $$4 = 0.0;
         }

         $$0 = new ehp($$2, $$4, $$3);
      }

      return $$0;
   }

   private float A(float $$0) {
      return this.aA() ? this.fe() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fd();
   }

   protected float fd() {
      return this.cN() instanceof cbw ? this.fe() * 0.1F : 0.02F;
   }

   public float fe() {
      return this.bZ;
   }

   public void w(float $$0) {
      this.bZ = $$0;
   }

   public boolean C(bis $$0) {
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

         if (this.fC() && !this.L()) {
            this.fD();
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
         float $$8 = (float)ary.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = ary.e(ary.g(this.dB()) - $$8);
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
      if (this.fv()) {
         this.bx++;
      } else {
         this.bx = 0;
      }

      if (this.fC()) {
         this.s(0.0F);
      }

      this.w();
   }

   private void C() {
      Map<bix, cjh> $$0 = this.E();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bix, cjh> E() {
      Map<bix, cjh> $$0 = null;

      for (bix $$1 : bix.values()) {
         cjh $$2;
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

         cjh $$5 = this.c($$1);
         if (this.a($$2, $$5)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bix.class);
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

   public boolean a(cjh $$0, cjh $$1) {
      return !cjh.a($$1, $$0);
   }

   private void a(Map<bix, cjh> $$0) {
      cjh $$1 = $$0.get(bix.a);
      cjh $$2 = $$0.get(bix.b);
      if ($$1 != null && $$2 != null && cjh.a($$1, this.f(bix.b)) && cjh.a($$2, this.f(bix.a))) {
         ((aks)this.dL()).k().b(this, new ya(this, (byte)55));
         $$0.remove(bix.a);
         $$0.remove(bix.b);
         this.c(bix.a, $$1.p());
         this.c(bix.b, $$2.p());
      }
   }

   private void b(Map<bix, cjh> $$0) {
      List<Pair<bix, cjh>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cjh $$3 = $$2.p();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
         }
      });
      ((aks)this.dL()).k().b(this, new aac(this.ah(), $$1));
   }

   private cjh e(bix $$0) {
      return this.bS.get($$0.b());
   }

   private void b(bix $$0, cjh $$1) {
      this.bS.set($$0.b(), $$1);
   }

   private cjh f(bix $$0) {
      return this.bR.get($$0.b());
   }

   private void c(bix $$0, cjh $$1) {
      this.bR.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = ary.g($$0 - this.aU);
      this.aU += $$2 * 0.3F;
      float $$3 = ary.g(this.dB() - this.aU);
      if (Math.abs($$3) > 50.0F) {
         this.aU = this.aU + ($$3 - (float)(ary.j((double)$$3) * 50));
      }

      boolean $$4 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$4) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   public void b_() {
      if (this.ca > 0) {
         this.ca--;
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

      ehp $$0 = this.do();
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
         this.fg();
         this.dL().ad().c();
      }

      this.dL().ad().c();
      this.dL().ad().a("jump");
      if (this.bj && this.dZ()) {
         double $$4;
         if (this.bl()) {
            $$4 = this.b(apz.b);
         } else {
            $$4 = this.b(apz.a);
         }

         boolean $$6 = this.aX() && $$4 > 0.0;
         double $$7 = this.de();
         if (!$$6 || this.aA() && !($$4 > $$7)) {
            if (!this.bl() || this.aA() && !($$4 > $$7)) {
               if ((this.aA() || $$6 && $$4 <= $$7) && this.ca == 0) {
                  this.fa();
                  this.ca = 10;
               }
            } else {
               this.c(apz.b);
            }
         } else {
            this.c(apz.a);
         }
      } else {
         this.ca = 0;
      }

      this.dL().ad().c();
      this.dL().ad().a("travel");
      this.bk *= 0.98F;
      this.bm *= 0.98F;
      this.F();
      ehk $$8 = this.cG();
      ehp $$9 = new ehp((double)this.bk, (double)this.bl, (double)this.bm);
      if (this.a(bih.B) || this.a(bih.y)) {
         this.n();
      }

      label104: {
         if (this.cN() instanceof cbw $$10 && this.bv()) {
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

      this.fh();
      this.dL().ad().c();
      if (!this.dL().B && this.ff() && this.aZ()) {
         this.a(this.dM().h(), 1.0F);
      }
   }

   public boolean ff() {
      return false;
   }

   private void F() {
      boolean $$0 = this.i(7);
      if ($$0 && !this.aA() && !this.bN() && !this.a(bih.y)) {
         cjh $$1 = this.c(bix.e);
         if ($$1.a(cjk.nh) && cib.d($$1)) {
            $$0 = true;
            int $$2 = this.bx + 1;
            if (!this.dL().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, $$0x -> $$0x.d(bix.e));
               }

               this.a(djv.n);
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

   protected void fg() {
   }

   protected void fh() {
      if (this.dL().w_()) {
         this.dL().a(djj.a(cbw.class), this.cG(), biv.a(this)).forEach(this::D);
      } else {
         List<bis> $$0 = this.dL().a(this, this.cG(), biv.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dL().X().c(cpt.t);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ag.a(4) == 0) {
               int $$2 = 0;

               for (bis $$3 : $$0) {
                  if (!$$3.bN()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dM().g(), 6.0F);
               }
            }

            for (bis $$4 : $$0) {
               this.D($$4);
            }
         }
      }
   }

   protected void a(ehk $$0, ehk $$1) {
      ehk $$2 = $$0.b($$1);
      List<bis> $$3 = this.dL().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bis $$4 : $$3) {
            if ($$4 instanceof bji) {
               this.g((bji)$$4);
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

   protected void D(bis $$0) {
      $$0.g(this);
   }

   protected void g(bji $$0) {
   }

   public boolean fi() {
      return (this.an.b(t) & 4) != 0;
   }

   @Override
   public void aa() {
      bis $$0 = this.cY();
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

   public void a(byp $$0) {
      bis $$1 = $$0.v();
      if ($$1 instanceof akt) {
         al.O.a((akt)$$1, $$0.q(), this);
      }
   }

   public void a(bis $$0, int $$1) {
      if (!$$0.dG() && !this.dL().B && ($$0 instanceof byp || $$0 instanceof ccc || $$0 instanceof biy)) {
         ((aks)this.dL()).k().b($$0, new aav($$0.ah(), this.ah(), $$1));
      }
   }

   public boolean E(bis $$0) {
      if ($$0.dL() != this.dL()) {
         return false;
      } else {
         ehp $$1 = new ehp(this.dq(), this.du(), this.dw());
         ehp $$2 = new ehp($$0.dq(), $$0.du(), $$0.dw());
         return $$2.f($$1) > 128.0 ? false : this.dL().a(new cpg($$1, $$2, cpg.a.a, cpg.b.a, this)).c() == ehn.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.aW : ary.i($$0, this.aX, this.aW);
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
   protected ehp a(hc.a $$0, l.a $$1) {
      return i(super.a($$0, $$1));
   }

   public static ehp i(ehp $$0) {
      return new ehp($$0.c, $$0.d, 0.0);
   }

   public float fj() {
      return this.cb;
   }

   public final void y(float $$0) {
      this.z(ary.a($$0, 0.0F, this.eM()));
   }

   protected void z(float $$0) {
      this.cb = $$0;
   }

   public void e_() {
   }

   public void f_() {
   }

   protected void fk() {
      this.bU = true;
   }

   public abstract bjc fl();

   public boolean fm() {
      return (this.an.b(t) & 1) > 0;
   }

   public bgz fn() {
      return (this.an.b(t) & 2) > 0 ? bgz.b : bgz.a;
   }

   private void G() {
      if (this.fm()) {
         if (cjh.b(this.b(this.fn()), this.bv)) {
            this.bv = this.b(this.fn());
            this.a(this.bv);
         } else {
            this.fs();
         }
      }
   }

   protected void a(cjh $$0) {
      $$0.b(this.dL(), this, this.fp());
      if (this.I()) {
         this.b($$0, 5);
      }

      if (--this.bw == 0 && !this.dL().B && !$$0.t()) {
         this.ad_();
      }
   }

   private boolean I() {
      int $$0 = this.fp();
      cek $$1 = this.bv.d().v();
      boolean $$2 = $$1 != null && $$1.e();
      $$2 |= $$0 <= this.bv.r() - 7;
      return $$2 && $$0 % 4 == 0;
   }

   private void K() {
      this.ch = this.cg;
      if (this.bZ()) {
         this.cg = Math.min(1.0F, this.cg + 0.09F);
      } else {
         this.cg = Math.max(0.0F, this.cg - 0.09F);
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

   public void c(bgz $$0) {
      cjh $$1 = this.b($$0);
      if (!$$1.b() && !this.fm()) {
         this.bv = $$1;
         this.bw = $$1.r();
         if (!this.dL().B) {
            this.c(1, true);
            this.c(2, $$0 == bgz.b);
            this.a(djv.D);
         }
      }
   }

   @Override
   public void a(aeg<?> $$0) {
      super.a($$0);
      if (bM.equals($$0)) {
         if (this.dL().B) {
            this.fA().ifPresent(this::a);
         }
      } else if (t.equals($$0) && this.dL().B) {
         if (this.fm() && this.bv.b()) {
            this.bv = this.b(this.fn());
            if (!this.bv.b()) {
               this.bw = this.bv.r();
            }
         } else if (!this.fm() && !this.bv.b()) {
            this.bv = cjh.b;
            this.bw = 0;
         }
      }
   }

   @Override
   public void a(ed.a $$0, ehp $$1) {
      super.a($$0, $$1);
      this.aX = this.aW;
      this.aU = this.aW;
      this.aV = this.aU;
   }

   protected void b(cjh $$0, int $$1) {
      if (!$$0.b() && this.fm()) {
         if ($$0.s() == cla.c) {
            this.a(this.c($$0), 0.5F, this.dL().z.i() * 0.1F + 0.9F);
         }

         if ($$0.s() == cla.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(cjh $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ehp $$3 = new ehp(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dD() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dB() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ag.i()) * 0.6 - 0.3;
         ehp $$5 = new ehp(((double)this.ag.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dD() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dB() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dq(), this.du(), this.dw());
         this.dL().a(new it(ix.O, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void ad_() {
      if (!this.dL().B || this.fm()) {
         bgz $$0 = this.fn();
         if (!this.bv.equals(this.b($$0))) {
            this.fr();
         } else {
            if (!this.bv.b() && this.fm()) {
               this.b(this.bv, 16);
               cjh $$1 = this.bv.a(this.dL(), this);
               if ($$1 != this.bv) {
                  this.a($$0, $$1);
               }

               this.fs();
            }
         }
      }
   }

   public cjh fo() {
      return this.bv;
   }

   public int fp() {
      return this.bw;
   }

   public int fq() {
      return this.fm() ? this.bv.r() - this.fp() : 0;
   }

   public void fr() {
      if (!this.bv.b()) {
         this.bv.a(this.dL(), this, this.fp());
         if (this.bv.t()) {
            this.G();
         }
      }

      this.fs();
   }

   public void fs() {
      if (!this.dL().B) {
         boolean $$0 = this.fm();
         this.c(1, false);
         if ($$0) {
            this.a(djv.C);
         }
      }

      this.bv = cjh.b;
      this.bw = 0;
   }

   public boolean ft() {
      if (this.fm() && !this.bv.b()) {
         cjc $$0 = this.bv.d();
         return $$0.c(this.bv) != cla.d ? false : $$0.b(this.bv) - this.bw >= 5;
      } else {
         return false;
      }
   }

   public boolean fu() {
      return this.bR();
   }

   public boolean fv() {
      return this.i(7);
   }

   @Override
   public boolean bZ() {
      return super.bZ() || !this.fv() && this.c(bju.b);
   }

   public int fw() {
      return this.bx;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dq();
      double $$5 = this.ds();
      double $$6 = this.dw();
      double $$7 = $$1;
      boolean $$8 = false;
      gw $$9 = gw.a($$0, $$1, $$2);
      cpx $$10 = this.dL();
      if ($$10.A($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.H_()) {
            gw $$12 = $$9.d();
            dfl $$13 = $$10.a_($$12);
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

         if (this instanceof bjr) {
            ((bjr)this).L().n();
         }

         return true;
      }
   }

   public boolean fx() {
      return true;
   }

   public boolean fy() {
      return true;
   }

   public void a(gw $$0, boolean $$1) {
   }

   public boolean f(cjh $$0) {
      return false;
   }

   @Override
   public bit a(bju $$0) {
      return $$0 == bju.c ? v : super.a($$0).a(this.dY());
   }

   public ImmutableList<bju> fz() {
      return ImmutableList.of(bju.a);
   }

   public ehk e(bju $$0) {
      bit $$1 = this.a($$0);
      return new ehk((double)(-$$1.a / 2.0F), 0.0, (double)(-$$1.a / 2.0F), (double)($$1.a / 2.0F), (double)$$1.b, (double)($$1.a / 2.0F));
   }

   protected boolean f(bju $$0) {
      ehk $$1 = this.a($$0).a(this.dj());
      return this.dL().b(this, $$1);
   }

   @Override
   public boolean cs() {
      return super.cs() && !this.fC();
   }

   public Optional<gw> fA() {
      return this.an.b(bM);
   }

   public void g(gw $$0) {
      this.an.b(bM, Optional.of($$0));
   }

   public void fB() {
      this.an.b(bM, Optional.empty());
   }

   public boolean fC() {
      return this.fA().isPresent();
   }

   public void b(gw $$0) {
      if (this.bN()) {
         this.aa();
      }

      dfl $$1 = this.dL().a_($$0);
      if ($$1.b() instanceof csq) {
         this.dL().a($$0, $$1.a(csq.b, Boolean.valueOf(true)), 3);
      }

      this.b(bju.c);
      this.a($$0);
      this.g($$0);
      this.f(ehp.b);
      this.au = true;
   }

   private void a(gw $$0) {
      this.e((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean L() {
      return this.fA().map($$0 -> this.dL().a_($$0).b() instanceof csq).orElse(false);
   }

   public void fD() {
      this.fA().filter(this.dL()::A).ifPresent($$0x -> {
         dfl $$1 = this.dL().a_($$0x);
         if ($$1.b() instanceof csq) {
            hc $$2 = $$1.c(csq.aC);
            this.dL().a($$0x, $$1.a(csq.b, Boolean.valueOf(false)), 3);
            ehp $$3 = csq.a(this.ag(), this.dL(), $$0x, $$2, this.dB()).orElseGet(() -> {
               gw $$1x = $$0x.c();
               return new ehp((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            ehp $$4 = ehp.c($$0x).d($$3).d();
            float $$5 = (float)ary.d(ary.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.e($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      ehp $$0 = this.dj();
      this.b(bju.a);
      this.e($$0.c, $$0.d, $$0.e);
      this.fB();
   }

   @Nullable
   public hc fE() {
      gw $$0 = this.fA().orElse(null);
      return $$0 != null ? csq.a(this.dL(), $$0) : null;
   }

   @Override
   public boolean bw() {
      return !this.fC() && super.bw();
   }

   @Override
   protected final float a(bju $$0, bit $$1) {
      return $$0 == bju.c ? 0.2F : this.b($$0, $$1);
   }

   protected float b(bju $$0, bit $$1) {
      return super.a($$0, $$1);
   }

   public cjh g(cjh $$0) {
      return cjh.b;
   }

   public cjh a(cpx $$0, cjh $$1) {
      if ($$1.M()) {
         $$0.a(null, this.dq(), this.ds(), this.dw(), this.d($$1), apg.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$1, $$0, this);
         if (!(this instanceof cbw) || !((cbw)this).fS().d) {
            $$1.h(1);
         }

         this.a(djv.m);
      }

      return $$1;
   }

   private void a(cjh $$0, cpx $$1, bji $$2) {
      cjc $$3 = $$0.d();
      if ($$3.u()) {
         for (Pair<bif, Float> $$5 : $$3.v().f()) {
            if (!$$1.B && $$5.getFirst() != null && $$1.z.i() < (Float)$$5.getSecond()) {
               $$2.b(new bif((bif)$$5.getFirst()));
            }
         }
      }
   }

   private static byte g(bix $$0) {
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

   public void d(bix $$0) {
      this.dL().a(this, g($$0));
   }

   public void d(bgz $$0) {
      this.d($$0 == bgz.a ? bix.a : bix.b);
   }

   @Override
   public ehk g_() {
      if (this.c(bix.f).a(cjk.tw)) {
         float $$0 = 0.5F;
         return this.cG().c(0.5, 0.5, 0.5);
      } else {
         return super.g_();
      }
   }

   public static bix h(cjh $$0) {
      cii $$1 = cii.c_($$0);
      return $$1 != null ? $$1.g() : bix.a;
   }

   private static bka a(bji $$0, bix $$1) {
      return $$1 != bix.f && $$1 != bix.a && $$1 != bix.b ? bka.a($$0, $$1, $$1x -> $$1x.b() || bjk.h($$1x) == $$1) : bka.a($$0, $$1);
   }

   @Nullable
   private static bix r(int $$0) {
      if ($$0 == 100 + bix.f.b()) {
         return bix.f;
      } else if ($$0 == 100 + bix.e.b()) {
         return bix.e;
      } else if ($$0 == 100 + bix.d.b()) {
         return bix.d;
      } else if ($$0 == 100 + bix.c.b()) {
         return bix.c;
      } else if ($$0 == 98) {
         return bix.a;
      } else {
         return $$0 == 99 ? bix.b : null;
      }
   }

   @Override
   public bka a_(int $$0) {
      bix $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dz() {
      if (this.M_()) {
         return false;
      } else {
         boolean $$0 = !this.c(bix.f).a(aqc.az) && !this.c(bix.e).a(aqc.az) && !this.c(bix.d).a(aqc.az) && !this.c(bix.c).a(aqc.az);
         return $$0 && super.dz();
      }
   }

   @Override
   public boolean cc() {
      return !this.dL().w_() && this.a(bih.x) || super.cc();
   }

   @Override
   public float dC() {
      return this.aU;
   }

   @Override
   public void a(wz $$0) {
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

   public boolean fF() {
      return this.eS().d() instanceof cgw;
   }

   @Override
   public float dF() {
      float $$0 = super.dF();
      return this.cN() instanceof cbw ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public ehp m(bis $$0) {
      return new ehp(this.a($$0, this.a(this.an()), this.dY()).rotateY(-this.aU * (float) (Math.PI / 180.0))).e(this.dj());
   }

   @Override
   public float k(bis $$0) {
      return this.l($$0) * this.dY();
   }

   protected void a(int $$0, double $$1) {
      this.aW = (float)ary.e(1.0 / (double)$$0, (double)this.aW, $$1);
   }

   public static record a(ape a, ape b) {
   }
}
