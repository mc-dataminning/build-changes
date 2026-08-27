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

public abstract class bjg extends biq implements bio {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final bkk bA = new bkk(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, bkk.a.c);
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
   protected static final aef<Byte> t = aei.a(bjg.class, aeh.a);
   private static final aef<Float> bH = aei.a(bjg.class, aeh.d);
   private static final aef<Integer> bI = aei.a(bjg.class, aeh.b);
   private static final aef<Boolean> bJ = aei.a(bjg.class, aeh.k);
   private static final aef<Integer> bK = aei.a(bjg.class, aeh.b);
   private static final aef<Integer> bL = aei.a(bjg.class, aeh.b);
   private static final aef<Optional<gw>> bM = aei.a(bjg.class, aeh.o);
   protected static final float u = 1.74F;
   protected static final bir v = bir.c(0.2F, 0.2F);
   public static final float aE = 0.5F;
   private static final int bN = 50;
   private final bkj bO;
   private final bhl bP = new bhl(this);
   private final Map<bib, bid> bQ = Maps.newHashMap();
   private final hp<cjf> bR = hp.a(2, cjf.b);
   private final hp<cjf> bS = hp.a(4, cjf.b);
   public boolean aF;
   private boolean bT = false;
   public bgx aG;
   public int aH;
   public int aI;
   public int aJ;
   public int aK;
   public int aL;
   public int aM;
   public float aN;
   public float aO;
   protected int aP;
   public final bkf aQ = new bkf();
   public final int aR = 20;
   public final float aS;
   public final float aT;
   public float aU;
   public float aV;
   public float aW;
   public float aX;
   @Nullable
   protected cbu aY;
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
   private bjg bV;
   private int bW;
   private bjg bX;
   private int bY;
   private float bZ;
   private int ca;
   private float cb;
   protected cjf bv = cjf.b;
   protected int bw;
   protected int bx;
   private gw cc;
   private Optional<gw> cd = Optional.empty();
   @Nullable
   private bho ce;
   private long cf;
   protected int by;
   private float cg;
   private float ch;
   protected bkg<?> bz;
   private boolean ci;

   protected bjg(biu<? extends bjg> $$0, cpv $$1) {
      super($$0, $$1);
      this.bO = new bkj(bkn.a($$0));
      this.c(this.eL());
      this.I = true;
      this.aT = (float)((Math.random() + 1.0) * 0.01F);
      this.aq();
      this.aS = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.aW = this.dB();
      this.t(0.6F);
      ri $$2 = ri.a;
      this.bz = this.a(new Dynamic($$2, (rq)$$2.createMap(ImmutableMap.of($$2.a("memories"), (rq)$$2.emptyMap()))));
   }

   public bkg<?> dN() {
      return this.bz;
   }

   protected bkg.b<?> dO() {
      return bkg.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bkg<?> a(Dynamic<?> $$0) {
      return this.dO().a($$0);
   }

   @Override
   public void ak() {
      this.a(this.dM().w(), Float.MAX_VALUE);
   }

   public boolean a(biu<?> $$0) {
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

   public static bkl.a dP() {
      return bkl.a().a(bkm.a).a(bkm.c).a(bkm.d).a(bkm.i).a(bkm.j).a(bkm.l);
   }

   @Override
   protected void a(double $$0, boolean $$1, dfj $$2, gw $$3) {
      if (!this.aY()) {
         this.bg();
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

         float $$11 = (float)arx.f(this.ab - 3.0F);
         double $$12 = Math.min((double)(0.2F + $$11 / 15.0F), 2.5);
         int $$13 = (int)(150.0 * $$12);
         ((akr)this.dL()).a(new ip(ix.c, $$2), $$4, $$5, $$6, $$13, 0.0, 0.0, 0.0, 0.15F);
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cd = Optional.empty();
      }
   }

   public boolean dQ() {
      return this.eR() == bjl.b;
   }

   public float a(float $$0) {
      return arx.i($$0, this.ch, this.cg);
   }

   @Override
   public void ar() {
      this.aN = this.aO;
      if (this.am) {
         this.fA().ifPresent(this::a);
      }

      if (this.dR()) {
         this.dS();
      }

      super.ar();
      this.dL().ad().a("livingEntityBaseTick");
      if (this.aX() || this.dL().B) {
         this.az();
      }

      if (this.bw()) {
         boolean $$0 = this instanceof cbu;
         if (!this.dL().B) {
            if (this.bx()) {
               this.a(this.dM().f(), 1.0F);
            } else if ($$0 && !this.dL().B_().a(this.cH())) {
               double $$1 = this.dL().B_().a(this) + this.dL().B_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dL().B_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dM().v(), (float)Math.max(1, arx.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(apy.a) && !this.dL().a_(gw.a(this.dq(), this.du(), this.dw())).a(csw.nd)) {
            boolean $$3 = !this.dQ() && !bie.c(this) && (!$$0 || !((cbu)this).fS().a);
            if ($$3) {
               this.j(this.m(this.ci()));
               if (this.ci() == -20) {
                  this.j(0);
                  ehn $$4 = this.do();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.ag.j() - this.ag.j();
                     double $$7 = this.ag.j() - this.ag.j();
                     double $$8 = this.ag.j() - this.ag.j();
                     this.dL().a(ix.e, this.dq() + $$6, this.ds() + $$7, this.dw() + $$8, $$4.c, $$4.d, $$4.e);
                  }

                  this.a(this.dM().h(), 2.0F);
               }
            }

            if (!this.dL().B && this.bO() && this.cZ() != null && this.cZ().bQ()) {
               this.ab();
            }
         } else if (this.ci() < this.ch()) {
            this.j(this.n(this.ci()));
         }

         if (!this.dL().B) {
            gw $$9 = this.dl();
            if (!Objects.equal(this.cc, $$9)) {
               this.cc = $$9;
               this.c($$9);
            }
         }
      }

      if (this.bw() && (this.ba() || this.aA)) {
         this.aE();
      }

      if (this.aK > 0) {
         this.aK--;
      }

      if (this.al > 0 && !(this instanceof aks)) {
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

      if (this.bX != null && !this.bX.bw()) {
         this.bX = null;
      }

      if (this.bV != null) {
         if (!this.bV.bw()) {
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
      return this.ah % 5 == 0 && this.do().c != 0.0 && this.do().e != 0.0 && !this.M_() && cnq.k(this) && this.dT();
   }

   protected void dS() {
      ehn $$0 = this.do();
      this.dL()
         .a(
            ix.I,
            this.dq() + (this.ag.j() - 0.5) * (double)this.dg(),
            this.ds() + 0.1,
            this.dw() + (this.ag.j() - 0.5) * (double)this.dg(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.ag.i() * 0.4F + this.ag.i() > 0.9F ? 0.6F : 0.0F;
      this.a(ape.wd, $$1, 0.6F + this.ag.i() * 0.4F);
   }

   protected boolean dT() {
      return this.dL().a_(this.aH()).a(apt.aM);
   }

   @Override
   protected float aK() {
      return this.dT() && cnq.a(cns.l, this) > 0 ? 1.0F : super.aK();
   }

   @Override
   protected boolean c(dfj $$0) {
      return !$$0.i() || this.fv();
   }

   protected void dU() {
      bki $$0 = this.a(bkm.d);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void dV() {
      if (!this.bi().i()) {
         int $$0 = cnq.a(cns.l, this);
         if ($$0 > 0 && this.dT()) {
            bki $$1 = this.a(bkm.d);
            if ($$1 == null) {
               return;
            }

            $$1.b(new bkk(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), bkk.a.a));
            if (this.ef().i() < 0.04F) {
               cjf $$2 = this.c(biv.c);
               $$2.a(1, this, $$0x -> $$0x.d(biv.c));
            }
         }
      }
   }

   protected void dW() {
      bki $$0 = this.a(bkm.d);
      if ($$0 != null) {
         if ($$0.a(e) != null) {
            $$0.b(e);
         }
      }
   }

   protected void dX() {
      if (!this.bi().i()) {
         int $$0 = this.cj();
         if ($$0 > 0) {
            bki $$1 = this.a(bkm.d);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.ck();
            $$1.b(new bkk(e, "Powder snow slow", (double)$$2, bkk.a.a));
         }
      }
   }

   protected void c(gw $$0) {
      int $$1 = cnq.a(cns.j, this);
      if ($$1 > 0) {
         cnv.a(this, this.dL(), $$0, $$1);
      }

      if (this.c(this.bi())) {
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
         this.a(biq.c.a);
      }
   }

   public boolean eb() {
      return !this.m_();
   }

   protected boolean ec() {
      return !this.m_();
   }

   protected int m(int $$0) {
      int $$1 = cnq.e(this);
      return $$1 > 0 && this.ag.a($$1 + 1) > 0 ? $$0 : $$0 - 1;
   }

   protected int n(int $$0) {
      return Math.min($$0 + 4, this.ch());
   }

   public int ed() {
      return 0;
   }

   protected boolean ee() {
      return false;
   }

   public asc ef() {
      return this.ag;
   }

   @Nullable
   public bjg eg() {
      return this.bV;
   }

   @Override
   public bjg S_() {
      return this.eg();
   }

   public int eh() {
      return this.bW;
   }

   public void c(@Nullable cbu $$0) {
      this.aY = $$0;
      this.aZ = this.ah;
   }

   public void a(@Nullable bjg $$0) {
      this.bV = $$0;
      this.bW = this.ah;
   }

   @Nullable
   public bjg ei() {
      return this.bX;
   }

   public int ej() {
      return this.bY;
   }

   public void A(biq $$0) {
      if ($$0 instanceof bjg) {
         this.bX = (bjg)$$0;
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

   protected boolean a(biv $$0) {
      return true;
   }

   public void a(biv $$0, cjf $$1, cjf $$2) {
      boolean $$3 = $$2.b() && $$1.b();
      if (!$$3 && !cjf.c($$1, $$2) && !this.am) {
         cig $$4 = cig.c_($$2);
         if (!this.dL().w_() && !this.M_()) {
            if (!this.aT() && $$4 != null && $$4.g() == $$0) {
               this.dL().a(null, this.dq(), this.ds(), this.dw(), $$4.ao_(), this.db(), 1.0F, 1.0F);
            }

            if (this.a($$0)) {
               this.a($$4 != null ? djt.v : djt.S);
            }
         }
      }
   }

   @Override
   public void a(biq.c $$0) {
      super.a($$0);
      this.bz.a();
   }

   @Override
   public void b(qx $$0) {
      $$0.a("Health", this.eu());
      $$0.a("HurtTime", (short)this.aK);
      $$0.a("HurtByTimestamp", this.bW);
      $$0.a("DeathTime", (short)this.aM);
      $$0.a("AbsorptionAmount", this.fj());
      $$0.a("Attributes", this.eQ().c());
      if (!this.bQ.isEmpty()) {
         rd $$1 = new rd();

         for (bid $$2 : this.bQ.values()) {
            $$1.add($$2.a(new qx()));
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fv());
      this.fA().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<rq> $$3 = this.bz.a(ri.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(qx $$0) {
      this.z($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dL() != null && !this.dL().B) {
         this.eQ().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         rd $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            qx $$3 = $$1.a($$2);
            bid $$4 = bid.b($$3);
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
         eik $$6 = this.dL().I().d($$5);
         boolean $$7 = $$6 != null && this.dL().I().a(this.cx(), $$6);
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
         this.an.b(as, bjs.c);
         if (!this.am) {
            this.a($$8);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bz = this.a(new Dynamic(ri.a, $$0.c("Brain")));
      }
   }

   protected void em() {
      Iterator<bib> $$0 = this.bQ.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            bib $$1 = $$0.next();
            bid $$2 = this.bQ.get($$1);
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
         if (this.ce()) {
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
         Collection<bid> $$0 = this.bQ.values();
         this.an.b(bJ, c($$0));
         this.an.b(bI, cle.a($$0));
         this.j(this.a(bif.n));
      }
   }

   private void s() {
      boolean $$0 = this.cd();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable biq $$0) {
      double $$1 = 1.0;
      if (this.bV()) {
         $$1 *= 0.8;
      }

      if (this.ce()) {
         float $$2 = this.eU();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cjf $$3 = this.c(biv.f);
         biu<?> $$4 = $$0.ah();
         if ($$4 == biu.aJ && $$3.a(cji.tr)
            || $$4 == biu.bp && $$3.a(cji.tu)
            || $$4 == biu.aw && $$3.a(cji.tx)
            || $$4 == biu.ax && $$3.a(cji.tx)
            || $$4 == biu.u && $$3.a(cji.tv)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bjg $$0) {
      return $$0 instanceof cbu && this.dL().ai() == bgv.a ? false : $$0.en();
   }

   public boolean a(bjg $$0, bts $$1) {
      return $$1.a(this, $$0);
   }

   public boolean en() {
      return !this.cr() && this.eo();
   }

   public boolean eo() {
      return !this.M_() && this.bw();
   }

   public static boolean c(Collection<bid> $$0) {
      for (bid $$1 : $$0) {
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
         Iterator<bid> $$0 = this.bQ.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<bid> er() {
      return this.bQ.values();
   }

   public Map<bib, bid> es() {
      return this.bQ;
   }

   public boolean a(bib $$0) {
      return this.bQ.containsKey($$0);
   }

   @Nullable
   public bid b(bib $$0) {
      return this.bQ.get($$0);
   }

   public final boolean b(bid $$0) {
      return this.b($$0, null);
   }

   public boolean b(bid $$0, @Nullable biq $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         bid $$2 = this.bQ.get($$0.c());
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

   public boolean c(bid $$0) {
      if (this.eR() == bjl.b) {
         bib $$1 = $$0.c();
         if ($$1 == bif.j || $$1 == bif.s) {
            return false;
         }
      }

      return true;
   }

   public void c(bid $$0, @Nullable biq $$1) {
      if (this.c($$0)) {
         bid $$2 = this.bQ.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean et() {
      return this.eR() == bjl.b;
   }

   @Nullable
   public bid c(@Nullable bib $$0) {
      return this.bQ.remove($$0);
   }

   public boolean d(bib $$0) {
      bid $$1 = this.c($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(bid $$0, @Nullable biq $$1) {
      this.bU = true;
      if (!this.dL().B) {
         $$0.c().a(this.eQ(), $$0.e());
         this.d($$0);
      }
   }

   public void d(bid $$0) {
      for (biq $$1 : this.cQ()) {
         if ($$1 instanceof aks $$2) {
            $$2.c.b(new aay(this.ai(), $$0));
         }
      }
   }

   protected void a(bid $$0, boolean $$1, @Nullable biq $$2) {
      this.bU = true;
      if ($$1 && !this.dL().B) {
         bib $$3 = $$0.c();
         $$3.a(this.eQ());
         $$3.a(this.eQ(), $$0.e());
         this.w();
      }

      if (!this.dL().B) {
         this.d($$0);
      }
   }

   protected void a(bid $$0) {
      this.bU = true;
      if (!this.dL().B) {
         $$0.c().a(this.eQ());
         this.w();

         for (biq $$1 : this.cQ()) {
            if ($$1 instanceof aks $$2) {
               $$2.c.b(new zg(this.ai(), $$0.c()));
            }
         }
      }
   }

   private void w() {
      for (bki $$0 : this.eQ().a()) {
         this.d($$0.a());
      }
   }

   private void d(bkh $$0) {
      if ($$0 == bkm.a) {
         float $$1 = this.eL();
         if (this.eu() > $$1) {
            this.c($$1);
         }
      } else if ($$0 == bkm.l) {
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
      this.an.b(bH, arx.a($$0, 0.0F, this.eL()));
   }

   public boolean ev() {
      return this.eu() <= 0.0F;
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dL().B) {
         return false;
      } else if (this.ev()) {
         return false;
      } else if ($$0.a(apv.i) && this.a(bif.l)) {
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
            if (!$$0.a(apv.j) && $$0.c() instanceof bjg $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(apv.o) && this.ah().a(apw.j)) {
            $$1 *= 5.0F;
         }

         this.aQ.a(1.5F);
         boolean $$7 = true;
         if ((float)this.al > 10.0F && !$$0.a(apv.e)) {
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

         if ($$0.a(apv.a) && !this.c(biv.f).b()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         biq $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof bjg $$9 && !$$0.a(apv.q)) {
               this.a($$9);
            }

            if ($$8 instanceof cbu $$10) {
               this.aZ = 100;
               this.aY = $$10;
            } else if ($$8 instanceof bvu $$11 && $$11.s()) {
               this.aZ = 100;
               if ($$11.O_() instanceof cbu $$12) {
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

            if (!$$0.a(apv.r) && (!$$3 || $$1 > 0.0F)) {
               this.bp();
            }

            if ($$8 != null && !$$0.a(apv.z)) {
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
               apd $$15 = this.l_();
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

         if (this instanceof aks) {
            al.h.a((aks)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((aks)this).a(apo.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof aks) {
            al.g.a((aks)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$16;
      }
   }

   protected void d(bjg $$0) {
      $$0.e(this);
   }

   protected void e(bjg $$0) {
      $$0.q(0.5, $$0.dq() - this.dq(), $$0.dw() - this.dw());
   }

   private boolean h(bho $$0) {
      if ($$0.a(apv.d)) {
         return false;
      } else {
         cjf $$1 = null;

         for (bgx $$2 : bgx.values()) {
            cjf $$3 = this.b($$2);
            if ($$3.a(cji.uz)) {
               $$1 = $$3.p();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof aks $$4) {
               $$4.b(apo.c.b(cji.uz));
               al.B.a($$4, $$1);
               this.a(djt.C);
            }

            this.c(1.0F);
            this.eq();
            this.b(new bid(bif.j, 900, 1));
            this.b(new bid(bif.v, 100, 1));
            this.b(new bid(bif.l, 800, 0));
            this.dL().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bho ew() {
      if (this.dL().V() - this.cf > 40L) {
         this.ce = null;
      }

      return this.ce;
   }

   protected void e(bho $$0) {
      apd $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eV(), this.eW());
      }
   }

   public boolean f(bho $$0) {
      biq $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cca $$3 && $$3.B() > 0) {
         $$2 = true;
      }

      if (!$$0.a(apv.c) && this.ft() && !$$2) {
         ehn $$4 = $$0.h();
         if ($$4 != null) {
            ehn $$5 = this.f(1.0F);
            ehn $$6 = $$4.a(this.dj()).d();
            $$6 = new ehn($$6.c, 0.0, $$6.e);
            if ($$6.b($$5) < 0.0) {
               return true;
            }
         }
      }

      return false;
   }

   private void i(cjf $$0) {
      if (!$$0.b()) {
         if (!this.aT()) {
            this.dL().a(this.dq(), this.ds(), this.dw(), ape.lZ, this.db(), 0.8F, 0.8F + this.dL().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bho $$0) {
      if (!this.dG() && !this.ba) {
         biq $$1 = $$0.d();
         bjg $$2 = this.eK();
         if (this.bh >= 0 && $$2 != null) {
            $$2.a(this, this.bh, $$0);
         }

         if (this.fC()) {
            this.fD();
         }

         if (!this.dL().B && this.ad()) {
            b.info("Named entity {} died: {}", this, this.eJ().a().getString());
         }

         this.ba = true;
         this.eJ().c();
         if (this.dL() instanceof akr $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(djt.p);
               this.g($$0);
               this.f($$2);
            }

            this.dL().a(this, (byte)3);
         }

         this.b(bjs.h);
      }
   }

   protected void f(@Nullable bjg $$0) {
      if (!this.dL().B) {
         boolean $$1 = false;
         if ($$0 instanceof byb) {
            if (this.dL().X().b(cpr.c)) {
               gw $$2 = this.dl();
               dfj $$3 = csw.cd.n();
               if (this.dL().a_($$2).i() && $$3.a((cpy)this.dL(), $$2)) {
                  this.dL().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               byn $$4 = new byn(this.dL(), this.dq(), this.ds(), this.dw(), new cjf(cji.da));
               this.dL().b($$4);
            }
         }
      }
   }

   protected void g(bho $$0) {
      biq $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof cbu) {
         $$2 = cnq.h((bjg)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.aZ > 0;
      if (this.ec() && this.dL().X().b(cpr.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.ex();
      this.ey();
   }

   protected void ex() {
   }

   protected void ey() {
      if (this.dL() instanceof akr && !this.eC() && (this.ee() || this.aZ > 0 && this.eb() && this.dL().X().b(cpr.f))) {
         biw.a((akr)this.dL(), this.dj(), this.ed());
      }
   }

   protected void a(bho $$0, int $$1, boolean $$2) {
   }

   public aex ez() {
      return this.ah().j();
   }

   public long eA() {
      return 0L;
   }

   protected void a(bho $$0, boolean $$1) {
      aex $$2 = this.ez();
      ecy $$3 = this.dL().n().aH().getLootTable($$2);
      ecw.a $$4 = new ecw.a((akr)this.dL()).a(efb.a, this).a(efb.f, this.dj()).a(efb.c, $$0).b(efb.d, $$0.d()).b(efb.e, $$0.c());
      if ($$1 && this.aY != null) {
         $$4 = $$4.a(efb.b, this.aY).a(this.aY.gn());
      }

      ecw $$5 = $$4.a(efa.g);
      $$3.a($$5, this.eA(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.b(bkm.c);
      if (!($$0 <= 0.0)) {
         this.au = true;
         ehn $$3 = this.do();
         ehn $$4 = new ehn($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aB() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected apd d(bho $$0) {
      return ape.iZ;
   }

   @Nullable
   protected apd l_() {
      return ape.iU;
   }

   private apd d(int $$0) {
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

   protected ehi eE() {
      ehi $$0 = this.cH();
      biq $$1 = this.cZ();
      if ($$1 != null) {
         ehn $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public bjg.a eF() {
      return new bjg.a(ape.ja, ape.iS);
   }

   protected apd c(cjf $$0) {
      return $$0.N();
   }

   public apd d(cjf $$0) {
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
         dfj $$1 = this.dm();
         if ($$1.a(apt.aO)) {
            this.cd = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dbi && this.c($$0, $$1)) {
            this.cd = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(gw $$0, dfj $$1) {
      if ($$1.c(dbi.a)) {
         dfj $$2 = this.dL().a_($$0.d());
         if ($$2.a(csw.cO) && $$2.c(cwy.a) == $$1.c(dbi.aC)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean bw() {
      return !this.dG() && this.eu() > 0.0F;
   }

   @Override
   public boolean a(float $$0, float $$1, bho $$2) {
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
      if (this.ah().a(apw.l)) {
         return 0;
      } else {
         bid $$2 = this.b(bif.h);
         float $$3 = $$2 == null ? 0.0F : (float)($$2.e() + 1);
         return arx.f(($$0 - 3.0F - $$3) * $$1);
      }
   }

   protected void eH() {
      if (!this.aT()) {
         int $$0 = arx.a(this.dq());
         int $$1 = arx.a(this.ds() - 0.2F);
         int $$2 = arx.a(this.dw());
         dfj $$3 = this.dL().a_(new gw($$0, $$1, $$2));
         if (!$$3.i()) {
            dai $$4 = $$3.w();
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
      return arx.a(this.b(bkm.i));
   }

   protected void b(bho $$0, float $$1) {
   }

   protected void c(bho $$0, float $$1) {
   }

   protected void u(float $$0) {
   }

   protected float d(bho $$0, float $$1) {
      if (!$$0.a(apv.b)) {
         this.b($$0, $$1);
         $$1 = bhk.a($$1, (float)this.eI(), (float)this.b(bkm.j));
      }

      return $$1;
   }

   protected float e(bho $$0, float $$1) {
      if ($$0.a(apv.f)) {
         return $$1;
      } else {
         if (this.a(bif.k) && !$$0.a(apv.g)) {
            int $$2 = (this.b(bif.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof aks) {
                  ((aks)this).a(apo.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof aks) {
                  ((aks)$$0.d()).a(apo.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(apv.h)) {
            return $$1;
         } else {
            int $$7 = cnq.a(this.bL(), $$0);
            if ($$7 > 0) {
               $$1 = bhk.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bho $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fj(), 0.0F);
         this.y(this.fj() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof aks $$4) {
            $$4.a(apo.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eJ().a($$0, var9);
            this.c(this.eu() - var9);
            this.y(this.fj() - var9);
            this.a(djt.o);
         }
      }
   }

   public bhl eJ() {
      return this.bP;
   }

   @Nullable
   public bjg eK() {
      if (this.aY != null) {
         return this.aY;
      } else {
         return this.bV != null ? this.bV : null;
      }
   }

   public final float eL() {
      return (float)this.b(bkm.a);
   }

   public final float eM() {
      return (float)this.b(bkm.l);
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
      if (bie.a(this)) {
         return 6 - (1 + bie.b(this));
      } else {
         return this.a(bif.d) ? 6 + (1 + this.b(bif.d).e()) * 2 : 6;
      }
   }

   public void a(bgx $$0) {
      this.a($$0, false);
   }

   public void a(bgx $$0, boolean $$1) {
      if (!this.aF || this.aH >= this.z() / 2 || this.aH < 0) {
         this.aH = -1;
         this.aF = true;
         this.aG = $$0;
         if (this.dL() instanceof akr) {
            xa $$2 = new xa(this, $$0 == bgx.a ? 0 : 3);
            akp $$3 = ((akr)this.dL()).k();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bho $$0) {
      this.aQ.a(1.5F);
      this.al = 20;
      this.aL = 10;
      this.aK = this.aL;
      apd $$1 = this.d($$0);
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
            apd $$1 = this.l_();
            if ($$1 != null) {
               this.a($$1, this.eV(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cbu)) {
               this.c(0.0F);
               this.a(this.dM().n());
            }
            break;
         case 29:
            this.a(ape.uQ, 1.0F, 0.8F + this.dL().z.i() * 0.4F);
            break;
         case 30:
            this.a(ape.uR, 0.8F, 0.8F + this.dL().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ag.i() - 0.5F) * 0.2F;
               float $$6 = (this.ag.i() - 0.5F) * 0.2F;
               float $$7 = (this.ag.i() - 0.5F) * 0.2F;
               double $$8 = arx.d($$4, this.K, this.dq()) + (this.ag.j() - 0.5) * (double)this.dg() * 2.0;
               double $$9 = arx.d($$4, this.L, this.ds()) + this.ag.j() * (double)this.dh();
               double $$10 = arx.d($$4, this.M, this.dw()) + (this.ag.j() - 0.5) * (double)this.dg() * 2.0;
               this.dL().a(ix.X, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.c(biv.a));
            break;
         case 48:
            this.i(this.c(biv.b));
            break;
         case 49:
            this.i(this.c(biv.f));
            break;
         case 50:
            this.i(this.c(biv.e));
            break;
         case 51:
            this.i(this.c(biv.d));
            break;
         case 52:
            this.i(this.c(biv.c));
            break;
         case 54:
            cwm.b(this);
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
      cjf $$0 = this.c(biv.b);
      this.a(biv.b, this.c(biv.a));
      this.a(biv.a, $$0);
   }

   @Override
   protected void aA() {
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
   public bki a(bkh $$0) {
      return this.eQ().a($$0);
   }

   public double a(hg<bkh> $$0) {
      return this.b($$0.a());
   }

   public double b(bkh $$0) {
      return this.eQ().c($$0);
   }

   public double b(hg<bkh> $$0) {
      return this.c($$0.a());
   }

   public double c(bkh $$0) {
      return this.eQ().d($$0);
   }

   public bkj eQ() {
      return this.bO;
   }

   public bjl eR() {
      return bjl.a;
   }

   public cjf eS() {
      return this.c(biv.a);
   }

   public cjf eT() {
      return this.c(biv.b);
   }

   public boolean b(cja $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cjf> $$0) {
      return $$0.test(this.eS()) || $$0.test(this.eT());
   }

   public cjf b(bgx $$0) {
      if ($$0 == bgx.a) {
         return this.c(biv.a);
      } else if ($$0 == bgx.b) {
         return this.c(biv.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bgx $$0, cjf $$1) {
      if ($$0 == bgx.a) {
         this.a(biv.a, $$1);
      } else {
         if ($$0 != bgx.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(biv.b, $$1);
      }
   }

   public boolean b(biv $$0) {
      return !this.c($$0).b();
   }

   @Override
   public abstract Iterable<cjf> bL();

   public abstract cjf c(biv var1);

   @Override
   public abstract void a(biv var1, cjf var2);

   protected void e(cjf $$0) {
      qx $$1 = $$0.v();
      if ($$1 != null) {
         $$0.d().b($$1);
      }
   }

   public float eU() {
      Iterable<cjf> $$0 = this.bL();
      int $$1 = 0;
      int $$2 = 0;

      for (cjf $$3 : $$0) {
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
      bki $$1 = this.a(bkm.d);
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
   public void g(biq $$0) {
      if (!this.fC()) {
         super.g($$0);
      }
   }

   private void a(biq $$0) {
      ehn $$1;
      if (this.dG()) {
         $$1 = this.dj();
      } else if (!$$0.dG() && !this.dL().a_($$0.dl()).a(apt.aI)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.ds(), $$0.ds());
         $$1 = new ehn(this.dq(), $$2, this.dw());
      }

      this.a($$1.c, $$1.d, $$1.e);
   }

   @Override
   public boolean cC() {
      return this.cB();
   }

   protected float eY() {
      return 0.42F * this.aJ() + this.eZ();
   }

   public float eZ() {
      return this.a(bif.h) ? 0.1F * ((float)this.b(bif.h).e() + 1.0F) : 0.0F;
   }

   protected void fa() {
      ehn $$0 = this.do();
      this.o($$0.c, (double)this.eY(), $$0.e);
      if (this.bY()) {
         float $$1 = this.dB() * (float) (Math.PI / 180.0);
         this.f(this.do().b((double)(-arx.a($$1) * 0.2F), 0.0, (double)(arx.b($$1) * 0.2F)));
      }

      this.au = true;
   }

   protected void fb() {
      this.f(this.do().b(0.0, -0.04F, 0.0));
   }

   protected void c(aqi<eal> $$0) {
      this.f(this.do().b(0.0, 0.04F, 0.0));
   }

   protected float fc() {
      return 0.8F;
   }

   public boolean a(eam $$0) {
      return false;
   }

   public void h(ehn $$0) {
      if (this.cX()) {
         double $$1 = 0.08;
         boolean $$2 = this.do().d <= 0.0;
         if ($$2 && this.a(bif.B)) {
            $$1 = 0.01;
         }

         eam $$3 = this.dL().b_(this.dl());
         if (this.aY() && this.dZ() && !this.a($$3)) {
            double $$4 = this.ds();
            float $$5 = this.bY() ? 0.9F : this.fc();
            float $$6 = 0.02F;
            float $$7 = (float)cnq.f(this);
            if ($$7 > 3.0F) {
               $$7 = 3.0F;
            }

            if (!this.aB()) {
               $$7 *= 0.5F;
            }

            if ($$7 > 0.0F) {
               $$5 += (0.54600006F - $$5) * $$7 / 3.0F;
               $$6 += (this.fe() - $$6) * $$7 / 3.0F;
            }

            if (this.a(bif.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(bjm.a, this.do());
            ehn $$8 = this.do();
            if (this.P && this.c_()) {
               $$8 = new ehn($$8.c, 0.2, $$8.e);
            }

            this.f($$8.d((double)$$5, 0.8F, (double)$$5));
            ehn $$9 = this.a($$1, $$2, this.do());
            this.f($$9);
            if (this.P && this.g($$9.c, $$9.d + 0.6F - this.ds() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bm() && this.dZ() && !this.a($$3)) {
            double $$10 = this.ds();
            this.a(0.02F, $$0);
            this.a(bjm.a, this.do());
            if (this.b(apy.b) <= this.df()) {
               this.f(this.do().d(0.5, 0.8F, 0.5));
               ehn $$11 = this.a($$1, $$2, this.do());
               this.f($$11);
            } else {
               this.f(this.do().a(0.5));
            }

            if (!this.aU()) {
               this.f(this.do().b(0.0, -$$1 / 4.0, 0.0));
            }

            ehn $$12 = this.do();
            if (this.P && this.g($$12.c, $$12.d + 0.6F - this.ds() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fv()) {
            this.cn();
            ehn $$13 = this.do();
            ehn $$14 = this.bF();
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
               double $$21 = $$17 * (double)(-arx.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.f($$13.d(0.99F, 0.98F, 0.99F));
            this.a(bjm.a, this.do());
            if (this.P && !this.dL().B) {
               double $$22 = this.do().h();
               double $$23 = $$17 - $$22;
               float $$24 = (float)($$23 * 10.0 - 3.0);
               if ($$24 > 0.0F) {
                  this.a(this.d((int)$$24), 1.0F, 1.0F);
                  this.a(this.dM().l(), $$24);
               }
            }

            if (this.aB() && !this.dL().B) {
               this.b(7, false);
            }
         } else {
            gw $$25 = this.aH();
            float $$26 = this.dL().a_($$25).b().h();
            float $$27 = this.aB() ? $$26 * 0.91F : 0.91F;
            ehn $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.a(bif.y)) {
               $$29 += (0.05 * (double)(this.b(bif.y).e() + 1) - $$28.d) * 0.2;
            } else if (this.dL().B && !this.dL().A($$25)) {
               if (this.ds() > (double)this.dL().H_()) {
                  $$29 = -0.1;
               } else {
                  $$29 = 0.0;
               }
            } else if (!this.aU()) {
               $$29 -= $$1;
            }

            if (this.el()) {
               this.o($$28.c, $$29, $$28.e);
            } else {
               this.o($$28.c * (double)$$27, $$29 * 0.98F, $$28.e * (double)$$27);
            }
         }
      }

      this.q(this instanceof bva);
   }

   private void c(cbu $$0, ehn $$1) {
      ehn $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.cX()) {
         this.w(this.e($$0));
         this.h($$2);
      } else {
         this.q(false);
         this.f(ehn.b);
         this.aC();
      }
   }

   protected void a(cbu $$0, ehn $$1) {
   }

   protected ehn b(cbu $$0, ehn $$1) {
      return $$1;
   }

   protected float e(cbu $$0) {
      return this.fe();
   }

   public void q(boolean $$0) {
      float $$1 = (float)arx.g(this.dq() - this.K, $$0 ? this.ds() - this.L : 0.0, this.dw() - this.M);
      this.v($$1);
   }

   protected void v(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aQ.a($$1, 0.4F);
   }

   public ehn a(ehn $$0, float $$1) {
      this.a(this.A($$1), $$0);
      this.f(this.j(this.do()));
      this.a(bjm.a, this.do());
      ehn $$2 = this.do();
      if ((this.P || this.bj) && (this.c_() || this.dm().a(csw.qC) && cyn.a(this))) {
         $$2 = new ehn($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public ehn a(double $$0, boolean $$1, ehn $$2) {
      if (!this.aU() && !this.bY()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new ehn($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private ehn j(ehn $$0) {
      if (this.c_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = arx.a($$0.c, -0.15F, 0.15F);
         double $$3 = arx.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dm().a(csw.nS) && this.fu() && this instanceof cbu) {
            $$4 = 0.0;
         }

         $$0 = new ehn($$2, $$4, $$3);
      }

      return $$0;
   }

   private float A(float $$0) {
      return this.aB() ? this.fe() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fd();
   }

   protected float fd() {
      return this.cO() instanceof cbu ? this.fe() * 0.1F : 0.02F;
   }

   public float fe() {
      return this.bZ;
   }

   public void w(float $$0) {
      this.bZ = $$0;
   }

   public boolean C(biq $$0) {
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
         float $$8 = (float)arx.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = arx.e(arx.g(this.dB()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aO > 0.0F) {
         $$5 = this.dB();
      }

      if (!this.aB()) {
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
      Map<biv, cjf> $$0 = this.E();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<biv, cjf> E() {
      Map<biv, cjf> $$0 = null;

      for (biv $$1 : biv.values()) {
         cjf $$2;
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

         cjf $$5 = this.c($$1);
         if (this.a($$2, $$5)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(biv.class);
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

   public boolean a(cjf $$0, cjf $$1) {
      return !cjf.a($$1, $$0);
   }

   private void a(Map<biv, cjf> $$0) {
      cjf $$1 = $$0.get(biv.a);
      cjf $$2 = $$0.get(biv.b);
      if ($$1 != null && $$2 != null && cjf.a($$1, this.f(biv.b)) && cjf.a($$2, this.f(biv.a))) {
         ((akr)this.dL()).k().b(this, new xz(this, (byte)55));
         $$0.remove(biv.a);
         $$0.remove(biv.b);
         this.c(biv.a, $$1.p());
         this.c(biv.b, $$2.p());
      }
   }

   private void b(Map<biv, cjf> $$0) {
      List<Pair<biv, cjf>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cjf $$3 = $$2.p();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
         }
      });
      ((akr)this.dL()).k().b(this, new aab(this.ai(), $$1));
   }

   private cjf e(biv $$0) {
      return this.bS.get($$0.b());
   }

   private void b(biv $$0, cjf $$1) {
      this.bS.set($$0.b(), $$1);
   }

   private cjf f(biv $$0) {
      return this.bR.get($$0.b());
   }

   private void c(biv $$0, cjf $$1) {
      this.bR.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = arx.g($$0 - this.aU);
      this.aU += $$2 * 0.3F;
      float $$3 = arx.g(this.dB() - this.aU);
      if (Math.abs($$3) > 50.0F) {
         this.aU = this.aU + ($$3 - (float)(arx.j((double)$$3) * 50));
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

      if (this.cX()) {
         this.bn = 0;
         this.f(this.dq(), this.ds(), this.dw());
      }

      if (this.bn > 0) {
         this.a(this.bn, this.bo, this.bp, this.bq, this.br, this.bs);
         this.bn--;
      } else if (!this.cY()) {
         this.f(this.do().a(0.98));
      }

      if (this.bu > 0) {
         this.a(this.bu, this.bt);
         this.bu--;
      }

      ehn $$0 = this.do();
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
      } else if (this.cY()) {
         this.dL().ad().a("newAi");
         this.fg();
         this.dL().ad().c();
      }

      this.dL().ad().c();
      this.dL().ad().a("jump");
      if (this.bj && this.dZ()) {
         double $$4;
         if (this.bm()) {
            $$4 = this.b(apy.b);
         } else {
            $$4 = this.b(apy.a);
         }

         boolean $$6 = this.aY() && $$4 > 0.0;
         double $$7 = this.df();
         if (!$$6 || this.aB() && !($$4 > $$7)) {
            if (!this.bm() || this.aB() && !($$4 > $$7)) {
               if ((this.aB() || $$6 && $$4 <= $$7) && this.ca == 0) {
                  this.fa();
                  this.ca = 10;
               }
            } else {
               this.c(apy.b);
            }
         } else {
            this.c(apy.a);
         }
      } else {
         this.ca = 0;
      }

      this.dL().ad().c();
      this.dL().ad().a("travel");
      this.bk *= 0.98F;
      this.bm *= 0.98F;
      this.F();
      ehi $$8 = this.cH();
      ehn $$9 = new ehn((double)this.bk, (double)this.bl, (double)this.bm);
      if (this.a(bif.B) || this.a(bif.y)) {
         this.n();
      }

      label104: {
         if (this.cO() instanceof cbu $$10 && this.bw()) {
            this.c($$10, $$9);
            break label104;
         }

         this.h($$9);
      }

      this.dL().ad().c();
      this.dL().ad().a("freezing");
      if (!this.dL().B && !this.ev()) {
         int $$11 = this.cj();
         if (this.aA && this.dz()) {
            this.k(Math.min(this.cm(), $$11 + 1));
         } else {
            this.k(Math.max(0, $$11 - 2));
         }
      }

      this.dW();
      this.dX();
      if (!this.dL().B && this.ah % 40 == 0 && this.cl() && this.dz()) {
         this.a(this.dM().t(), 1.0F);
      }

      this.dL().ad().c();
      this.dL().ad().a("push");
      if (this.by > 0) {
         this.by--;
         this.a($$8, this.cH());
      }

      this.fh();
      this.dL().ad().c();
      if (!this.dL().B && this.ff() && this.ba()) {
         this.a(this.dM().h(), 1.0F);
      }
   }

   public boolean ff() {
      return false;
   }

   private void F() {
      boolean $$0 = this.i(7);
      if ($$0 && !this.aB() && !this.bO() && !this.a(bif.y)) {
         cjf $$1 = this.c(biv.e);
         if ($$1.a(cji.nh) && chz.d($$1)) {
            $$0 = true;
            int $$2 = this.bx + 1;
            if (!this.dL().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, $$0x -> $$0x.d(biv.e));
               }

               this.a(djt.n);
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
         this.dL().a(djh.a(cbu.class), this.cH(), bit.a(this)).forEach(this::D);
      } else {
         List<biq> $$0 = this.dL().a(this, this.cH(), bit.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dL().X().c(cpr.t);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ag.a(4) == 0) {
               int $$2 = 0;

               for (biq $$3 : $$0) {
                  if (!$$3.bO()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dM().g(), 6.0F);
               }
            }

            for (biq $$4 : $$0) {
               this.D($$4);
            }
         }
      }
   }

   protected void a(ehi $$0, ehi $$1) {
      ehi $$2 = $$0.b($$1);
      List<biq> $$3 = this.dL().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (biq $$4 : $$3) {
            if ($$4 instanceof bjg) {
               this.g((bjg)$$4);
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

   protected void D(biq $$0) {
      $$0.g(this);
   }

   protected void g(bjg $$0) {
   }

   public boolean fi() {
      return (this.an.b(t) & 4) != 0;
   }

   @Override
   public void ab() {
      biq $$0 = this.cZ();
      super.ab();
      if ($$0 != null && $$0 != this.cZ() && !this.dL().B) {
         this.a($$0);
      }
   }

   @Override
   public void bz() {
      super.bz();
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
      return this.bo;
   }

   @Override
   public double K_() {
      return this.bp;
   }

   @Override
   public double L_() {
      return this.bq;
   }

   @Override
   public float d_() {
      return (float)this.bs;
   }

   @Override
   public float o_() {
      return (float)this.br;
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bt = (double)$$0;
      this.bu = $$1;
   }

   public void r(boolean $$0) {
      this.bj = $$0;
   }

   public void a(byn $$0) {
      biq $$1 = $$0.v();
      if ($$1 instanceof aks) {
         al.O.a((aks)$$1, $$0.q(), this);
      }
   }

   public void a(biq $$0, int $$1) {
      if (!$$0.dG() && !this.dL().B && ($$0 instanceof byn || $$0 instanceof cca || $$0 instanceof biw)) {
         ((akr)this.dL()).k().b($$0, new aau($$0.ai(), this.ai(), $$1));
      }
   }

   public boolean E(biq $$0) {
      if ($$0.dL() != this.dL()) {
         return false;
      } else {
         ehn $$1 = new ehn(this.dq(), this.du(), this.dw());
         ehn $$2 = new ehn($$0.dq(), $$0.du(), $$0.dw());
         return $$2.f($$1) > 128.0 ? false : this.dL().a(new cpe($$1, $$2, cpe.a.a, cpe.b.a, this)).c() == ehl.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.aW : arx.i($$0, this.aX, this.aW);
   }

   public float x(float $$0) {
      float $$1 = this.aO - this.aN;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aN + $$1 * $$0;
   }

   @Override
   public boolean bs() {
      return !this.dG();
   }

   @Override
   public boolean bt() {
      return this.bw() && !this.M_() && !this.c_();
   }

   @Override
   public float cp() {
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
   protected ehn a(hc.a $$0, l.a $$1) {
      return i(super.a($$0, $$1));
   }

   public static ehn i(ehn $$0) {
      return new ehn($$0.c, $$0.d, 0.0);
   }

   public float fj() {
      return this.cb;
   }

   public final void y(float $$0) {
      this.z(arx.a($$0, 0.0F, this.eM()));
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

   public abstract bja fl();

   public boolean fm() {
      return (this.an.b(t) & 1) > 0;
   }

   public bgx fn() {
      return (this.an.b(t) & 2) > 0 ? bgx.b : bgx.a;
   }

   private void G() {
      if (this.fm()) {
         if (cjf.b(this.b(this.fn()), this.bv)) {
            this.bv = this.b(this.fn());
            this.a(this.bv);
         } else {
            this.fs();
         }
      }
   }

   protected void a(cjf $$0) {
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
      cei $$1 = this.bv.d().v();
      boolean $$2 = $$1 != null && $$1.e();
      $$2 |= $$0 <= this.bv.r() - 7;
      return $$2 && $$0 % 4 == 0;
   }

   private void K() {
      this.ch = this.cg;
      if (this.ca()) {
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

   public void c(bgx $$0) {
      cjf $$1 = this.b($$0);
      if (!$$1.b() && !this.fm()) {
         this.bv = $$1;
         this.bw = $$1.r();
         if (!this.dL().B) {
            this.c(1, true);
            this.c(2, $$0 == bgx.b);
            this.a(djt.D);
         }
      }
   }

   @Override
   public void a(aef<?> $$0) {
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
            this.bv = cjf.b;
            this.bw = 0;
         }
      }
   }

   @Override
   public void a(ed.a $$0, ehn $$1) {
      super.a($$0, $$1);
      this.aX = this.aW;
      this.aU = this.aW;
      this.aV = this.aU;
   }

   protected void b(cjf $$0, int $$1) {
      if (!$$0.b() && this.fm()) {
         if ($$0.s() == cky.c) {
            this.a(this.c($$0), 0.5F, this.dL().z.i() * 0.1F + 0.9F);
         }

         if ($$0.s() == cky.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(cjf $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ehn $$3 = new ehn(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dD() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dB() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ag.i()) * 0.6 - 0.3;
         ehn $$5 = new ehn(((double)this.ag.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dD() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dB() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dq(), this.du(), this.dw());
         this.dL().a(new it(ix.O, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void ad_() {
      if (!this.dL().B || this.fm()) {
         bgx $$0 = this.fn();
         if (!this.bv.equals(this.b($$0))) {
            this.fr();
         } else {
            if (!this.bv.b() && this.fm()) {
               this.b(this.bv, 16);
               cjf $$1 = this.bv.a(this.dL(), this);
               if ($$1 != this.bv) {
                  this.a($$0, $$1);
               }

               this.fs();
            }
         }
      }
   }

   public cjf fo() {
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
            this.a(djt.C);
         }
      }

      this.bv = cjf.b;
      this.bw = 0;
   }

   public boolean ft() {
      if (this.fm() && !this.bv.b()) {
         cja $$0 = this.bv.d();
         return $$0.c(this.bv) != cky.d ? false : $$0.b(this.bv) - this.bw >= 5;
      } else {
         return false;
      }
   }

   public boolean fu() {
      return this.bS();
   }

   public boolean fv() {
      return this.i(7);
   }

   @Override
   public boolean ca() {
      return super.ca() || !this.fv() && this.c(bjs.b);
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
      cpv $$10 = this.dL();
      if ($$10.A($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.H_()) {
            gw $$12 = $$9.d();
            dfj $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.b($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cH())) {
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

         if (this instanceof bjp) {
            ((bjp)this).L().n();
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

   public boolean f(cjf $$0) {
      return false;
   }

   @Override
   public bir a(bjs $$0) {
      return $$0 == bjs.c ? v : super.a($$0).a(this.dY());
   }

   public ImmutableList<bjs> fz() {
      return ImmutableList.of(bjs.a);
   }

   public ehi e(bjs $$0) {
      bir $$1 = this.a($$0);
      return new ehi((double)(-$$1.a / 2.0F), 0.0, (double)(-$$1.a / 2.0F), (double)($$1.a / 2.0F), (double)$$1.b, (double)($$1.a / 2.0F));
   }

   protected boolean f(bjs $$0) {
      ehi $$1 = this.a($$0).a(this.dj());
      return this.dL().b(this, $$1);
   }

   @Override
   public boolean ct() {
      return super.ct() && !this.fC();
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
      if (this.bO()) {
         this.ab();
      }

      dfj $$1 = this.dL().a_($$0);
      if ($$1.b() instanceof cso) {
         this.dL().a($$0, $$1.a(cso.b, Boolean.valueOf(true)), 3);
      }

      this.b(bjs.c);
      this.a($$0);
      this.g($$0);
      this.f(ehn.b);
      this.au = true;
   }

   private void a(gw $$0) {
      this.e((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean L() {
      return this.fA().map($$0 -> this.dL().a_($$0).b() instanceof cso).orElse(false);
   }

   public void fD() {
      this.fA().filter(this.dL()::A).ifPresent($$0x -> {
         dfj $$1 = this.dL().a_($$0x);
         if ($$1.b() instanceof cso) {
            hc $$2 = $$1.c(cso.aC);
            this.dL().a($$0x, $$1.a(cso.b, Boolean.valueOf(false)), 3);
            ehn $$3 = cso.a(this.ah(), this.dL(), $$0x, $$2, this.dB()).orElseGet(() -> {
               gw $$1x = $$0x.c();
               return new ehn((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            ehn $$4 = ehn.c($$0x).d($$3).d();
            float $$5 = (float)arx.d(arx.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.e($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      ehn $$0 = this.dj();
      this.b(bjs.a);
      this.e($$0.c, $$0.d, $$0.e);
      this.fB();
   }

   @Nullable
   public hc fE() {
      gw $$0 = this.fA().orElse(null);
      return $$0 != null ? cso.a(this.dL(), $$0) : null;
   }

   @Override
   public boolean bx() {
      return !this.fC() && super.bx();
   }

   @Override
   protected final float a(bjs $$0, bir $$1) {
      return $$0 == bjs.c ? 0.2F : this.b($$0, $$1);
   }

   protected float b(bjs $$0, bir $$1) {
      return super.a($$0, $$1);
   }

   public cjf g(cjf $$0) {
      return cjf.b;
   }

   public cjf a(cpv $$0, cjf $$1) {
      if ($$1.M()) {
         $$0.a(null, this.dq(), this.ds(), this.dw(), this.d($$1), apf.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$1, $$0, this);
         if (!(this instanceof cbu) || !((cbu)this).fS().d) {
            $$1.h(1);
         }

         this.a(djt.m);
      }

      return $$1;
   }

   private void a(cjf $$0, cpv $$1, bjg $$2) {
      cja $$3 = $$0.d();
      if ($$3.u()) {
         for (Pair<bid, Float> $$5 : $$3.v().f()) {
            if (!$$1.B && $$5.getFirst() != null && $$1.z.i() < (Float)$$5.getSecond()) {
               $$2.b(new bid((bid)$$5.getFirst()));
            }
         }
      }
   }

   private static byte g(biv $$0) {
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

   public void d(biv $$0) {
      this.dL().a(this, g($$0));
   }

   public void d(bgx $$0) {
      this.d($$0 == bgx.a ? biv.a : biv.b);
   }

   @Override
   public ehi g_() {
      if (this.c(biv.f).a(cji.tw)) {
         float $$0 = 0.5F;
         return this.cH().c(0.5, 0.5, 0.5);
      } else {
         return super.g_();
      }
   }

   public static biv h(cjf $$0) {
      cig $$1 = cig.c_($$0);
      return $$1 != null ? $$1.g() : biv.a;
   }

   private static bjy a(bjg $$0, biv $$1) {
      return $$1 != biv.f && $$1 != biv.a && $$1 != biv.b ? bjy.a($$0, $$1, $$1x -> $$1x.b() || bji.h($$1x) == $$1) : bjy.a($$0, $$1);
   }

   @Nullable
   private static biv r(int $$0) {
      if ($$0 == 100 + biv.f.b()) {
         return biv.f;
      } else if ($$0 == 100 + biv.e.b()) {
         return biv.e;
      } else if ($$0 == 100 + biv.d.b()) {
         return biv.d;
      } else if ($$0 == 100 + biv.c.b()) {
         return biv.c;
      } else if ($$0 == 98) {
         return biv.a;
      } else {
         return $$0 == 99 ? biv.b : null;
      }
   }

   @Override
   public bjy a_(int $$0) {
      biv $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dz() {
      if (this.M_()) {
         return false;
      } else {
         boolean $$0 = !this.c(biv.f).a(aqb.az) && !this.c(biv.e).a(aqb.az) && !this.c(biv.d).a(aqb.az) && !this.c(biv.c).a(aqb.az);
         return $$0 && super.dz();
      }
   }

   @Override
   public boolean cd() {
      return !this.dL().w_() && this.a(bif.x) || super.cd();
   }

   @Override
   public float dC() {
      return this.aU;
   }

   @Override
   public void a(wx $$0) {
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
      return this.eS().d() instanceof cgu;
   }

   @Override
   public float dF() {
      float $$0 = super.dF();
      return this.cO() instanceof cbu ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public ehn m(biq $$0) {
      return new ehn(this.a($$0, this.a(this.ao()), this.dY()).rotateY(-this.aU * (float) (Math.PI / 180.0))).e(this.dj());
   }

   @Override
   public float k(biq $$0) {
      return this.l($$0) * this.dY();
   }

   protected void a(int $$0, double $$1) {
      this.aW = (float)arx.e(1.0 / (double)$$0, (double)this.aW, $$1);
   }

   public static record a(apd a, apd b) {
   }
}
