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

public abstract class biw extends big implements bie {
   private static final Logger b = LogUtils.getLogger();
   private static final UUID c = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID d = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final bkb e = new bkb(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, bkb.a.c);
   public static final int g = 2;
   public static final int h = 4;
   public static final int i = 98;
   public static final int j = 100;
   public static final int k = 6;
   public static final int l = 100;
   private static final int bA = 40;
   public static final double m = 0.003;
   public static final double n = 0.08;
   public static final int o = 20;
   private static final int bB = 7;
   private static final int bC = 10;
   private static final int bD = 2;
   public static final int p = 4;
   private static final float bE = 0.42F;
   private static final double bF = 128.0;
   protected static final int q = 1;
   protected static final int r = 2;
   protected static final int s = 4;
   protected static final adx<Byte> t = aea.a(biw.class, adz.a);
   private static final adx<Float> bG = aea.a(biw.class, adz.d);
   private static final adx<Integer> bH = aea.a(biw.class, adz.b);
   private static final adx<Boolean> bI = aea.a(biw.class, adz.k);
   private static final adx<Integer> bJ = aea.a(biw.class, adz.b);
   private static final adx<Integer> bK = aea.a(biw.class, adz.b);
   private static final adx<Optional<gv>> bL = aea.a(biw.class, adz.o);
   protected static final float u = 1.74F;
   protected static final bih v = bih.c(0.2F, 0.2F);
   public static final float aE = 0.5F;
   private static final int bM = 50;
   private final bka bN;
   private final bhb bO = new bhb(this);
   private final Map<bhr, bht> bP = Maps.newHashMap();
   private final ho<ciw> bQ = ho.a(2, ciw.b);
   private final ho<ciw> bR = ho.a(4, ciw.b);
   public boolean aF;
   private boolean bS = false;
   public bgn aG;
   public int aH;
   public int aI;
   public int aJ;
   public int aK;
   public int aL;
   public int aM;
   public float aN;
   public float aO;
   protected int aP;
   public final bjw aQ = new bjw();
   public final int aR = 20;
   public final float aS;
   public final float aT;
   public float aU;
   public float aV;
   public float aW;
   public float aX;
   @Nullable
   protected cbl aY;
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
   private biw bU;
   private int bV;
   private biw bW;
   private int bX;
   private float bY;
   private int bZ;
   private float ca;
   protected ciw bv = ciw.b;
   protected int bw;
   protected int bx;
   private gv cb;
   private Optional<gv> cc = Optional.empty();
   @Nullable
   private bhe cd;
   private long ce;
   protected int by;
   private float cf;
   private float cg;
   protected bjx<?> bz;
   private boolean ch;

   protected biw(bik<? extends biw> $$0, cpk $$1) {
      super($$0, $$1);
      this.bN = new bka(bke.a($$0));
      this.c(this.eK());
      this.I = true;
      this.aT = (float)((Math.random() + 1.0) * 0.01F);
      this.ap();
      this.aS = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.aW = this.dA();
      this.t(0.6F);
      rd $$2 = rd.a;
      this.bz = this.a(new Dynamic($$2, (rl)$$2.createMap(ImmutableMap.of($$2.a("memories"), (rl)$$2.emptyMap()))));
   }

   public bjx<?> dM() {
      return this.bz;
   }

   protected bjx.b<?> dN() {
      return bjx.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bjx<?> a(Dynamic<?> $$0) {
      return this.dN().a($$0);
   }

   @Override
   public void aj() {
      this.a(this.dL().w(), Float.MAX_VALUE);
   }

   public boolean a(bik<?> $$0) {
      return true;
   }

   @Override
   protected void a_() {
      this.an.a(t, (byte)0);
      this.an.a(bH, 0);
      this.an.a(bI, false);
      this.an.a(bJ, 0);
      this.an.a(bK, 0);
      this.an.a(bG, 1.0F);
      this.an.a(bL, Optional.empty());
   }

   public static bkc.a dO() {
      return bkc.a().a(bkd.a).a(bkd.c).a(bkd.d).a(bkd.i).a(bkd.j).a(bkd.l);
   }

   @Override
   protected void a(double $$0, boolean $$1, dey $$2, gv $$3) {
      if (!this.aX()) {
         this.bf();
      }

      if (!this.dK().B && $$1 && this.ab > 0.0F) {
         this.dT();
         this.dU();
      }

      if (!this.dK().B && this.ab > 3.0F && $$1 && !$$2.i()) {
         double $$4 = this.dp();
         double $$5 = this.dr();
         double $$6 = this.dv();
         gv $$7 = this.dk();
         if ($$3.u() != $$7.u() || $$3.w() != $$7.w()) {
            double $$8 = $$4 - (double)$$3.u() - 0.5;
            double $$9 = $$6 - (double)$$3.w() - 0.5;
            double $$10 = Math.max(Math.abs($$8), Math.abs($$9));
            $$4 = (double)$$3.u() + 0.5 + $$8 / $$10 * 0.5;
            $$6 = (double)$$3.w() + 0.5 + $$9 / $$10 * 0.5;
         }

         float $$11 = (float)aro.f(this.ab - 3.0F);
         double $$12 = Math.min((double)(0.2F + $$11 / 15.0F), 2.5);
         int $$13 = (int)(150.0 * $$12);
         ((aki)this.dK()).a(new io(iw.c, $$2), $$4, $$5, $$6, $$13, 0.0, 0.0, 0.0, 0.15F);
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cc = Optional.empty();
      }
   }

   public boolean dP() {
      return this.eQ() == bjb.b;
   }

   public float a(float $$0) {
      return aro.i($$0, this.cg, this.cf);
   }

   @Override
   public void aq() {
      this.aN = this.aO;
      if (this.am) {
         this.fz().ifPresent(this::a);
      }

      if (this.dQ()) {
         this.dR();
      }

      super.aq();
      this.dK().ad().a("livingEntityBaseTick");
      if (this.aW() || this.dK().B) {
         this.ay();
      }

      if (this.bv()) {
         boolean $$0 = this instanceof cbl;
         if (!this.dK().B) {
            if (this.bw()) {
               this.a(this.dL().f(), 1.0F);
            } else if ($$0 && !this.dK().w_().a(this.cG())) {
               double $$1 = this.dK().w_().a(this) + this.dK().w_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dK().w_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dL().v(), (float)Math.max(1, aro.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(apo.a) && !this.dK().a_(gv.a(this.dp(), this.dt(), this.dv())).a(csl.nd)) {
            boolean $$3 = !this.dP() && !bhu.c(this) && (!$$0 || !((cbl)this).fR().a);
            if ($$3) {
               this.j(this.m(this.ch()));
               if (this.ch() == -20) {
                  this.j(0);
                  ehf $$4 = this.dn();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.ag.j() - this.ag.j();
                     double $$7 = this.ag.j() - this.ag.j();
                     double $$8 = this.ag.j() - this.ag.j();
                     this.dK().a(iw.e, this.dp() + $$6, this.dr() + $$7, this.dv() + $$8, $$4.c, $$4.d, $$4.e);
                  }

                  this.a(this.dL().h(), 2.0F);
               }
            }

            if (!this.dK().B && this.bN() && this.cY() != null && this.cY().bP()) {
               this.aa();
            }
         } else if (this.ch() < this.cg()) {
            this.j(this.n(this.ch()));
         }

         if (!this.dK().B) {
            gv $$9 = this.dk();
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

      if (this.al > 0 && !(this instanceof akj)) {
         this.al--;
      }

      if (this.eu() && this.dK().h(this)) {
         this.dZ();
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

      this.el();
      this.bf = this.be;
      this.aV = this.aU;
      this.aX = this.aW;
      this.N = this.dA();
      this.O = this.dC();
      this.dK().ad().c();
   }

   public boolean dQ() {
      return this.ah % 5 == 0 && this.dn().c != 0.0 && this.dn().e != 0.0 && !this.G_() && cnf.k(this) && this.dS();
   }

   protected void dR() {
      ehf $$0 = this.dn();
      this.dK()
         .a(
            iw.I,
            this.dp() + (this.ag.j() - 0.5) * (double)this.df(),
            this.dr() + 0.1,
            this.dv() + (this.ag.j() - 0.5) * (double)this.df(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.ag.i() * 0.4F + this.ag.i() > 0.9F ? 0.6F : 0.0F;
      this.a(aou.wd, $$1, 0.6F + this.ag.i() * 0.4F);
   }

   protected boolean dS() {
      return this.dK().a_(this.aG()).a(apj.aM);
   }

   @Override
   protected float aJ() {
      return this.dS() && cnf.a(cnh.l, this) > 0 ? 1.0F : super.aJ();
   }

   @Override
   protected boolean c(dey $$0) {
      return !$$0.i() || this.fu();
   }

   protected void dT() {
      bjz $$0 = this.a(bkd.d);
      if ($$0 != null) {
         if ($$0.a(c) != null) {
            $$0.b(c);
         }
      }
   }

   protected void dU() {
      if (!this.bh().i()) {
         int $$0 = cnf.a(cnh.l, this);
         if ($$0 > 0 && this.dS()) {
            bjz $$1 = this.a(bkd.d);
            if ($$1 == null) {
               return;
            }

            $$1.b(new bkb(c, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), bkb.a.a));
            if (this.ee().i() < 0.04F) {
               ciw $$2 = this.c(bil.c);
               $$2.a(1, this, $$0x -> $$0x.d(bil.c));
            }
         }
      }
   }

   protected void dV() {
      bjz $$0 = this.a(bkd.d);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void dW() {
      if (!this.bh().i()) {
         int $$0 = this.ci();
         if ($$0 > 0) {
            bjz $$1 = this.a(bkd.d);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cj();
            $$1.b(new bkb(d, "Powder snow slow", (double)$$2, bkb.a.a));
         }
      }
   }

   protected void c(gv $$0) {
      int $$1 = cnf.a(cnh.j, this);
      if ($$1 > 0) {
         cnk.a(this, this.dK(), $$0, $$1);
      }

      if (this.c(this.bh())) {
         this.dT();
      }

      this.dU();
   }

   public boolean i_() {
      return false;
   }

   public float dX() {
      return this.i_() ? 0.5F : 1.0F;
   }

   protected boolean dY() {
      return true;
   }

   protected void dZ() {
      this.aM++;
      if (this.aM >= 20 && !this.dK().r_() && !this.dF()) {
         this.dK().a(this, (byte)60);
         this.a(big.c.a);
      }
   }

   public boolean ea() {
      return !this.i_();
   }

   protected boolean eb() {
      return !this.i_();
   }

   protected int m(int $$0) {
      int $$1 = cnf.e(this);
      return $$1 > 0 && this.ag.a($$1 + 1) > 0 ? $$0 : $$0 - 1;
   }

   protected int n(int $$0) {
      return Math.min($$0 + 4, this.cg());
   }

   public int ec() {
      return 0;
   }

   protected boolean ed() {
      return false;
   }

   public art ee() {
      return this.ag;
   }

   @Nullable
   public biw ef() {
      return this.bU;
   }

   @Override
   public biw M_() {
      return this.ef();
   }

   public int eg() {
      return this.bV;
   }

   public void c(@Nullable cbl $$0) {
      this.aY = $$0;
      this.aZ = this.ah;
   }

   public void a(@Nullable biw $$0) {
      this.bU = $$0;
      this.bV = this.ah;
   }

   @Nullable
   public biw eh() {
      return this.bW;
   }

   public int ei() {
      return this.bX;
   }

   public void A(big $$0) {
      if ($$0 instanceof biw) {
         this.bW = (biw)$$0;
      } else {
         this.bW = null;
      }

      this.bX = this.ah;
   }

   public int ej() {
      return this.bb;
   }

   public void o(int $$0) {
      this.bb = $$0;
   }

   public boolean ek() {
      return this.bS;
   }

   public void p(boolean $$0) {
      this.bS = $$0;
   }

   protected boolean a(bil $$0) {
      return true;
   }

   public void a(bil $$0, ciw $$1, ciw $$2) {
      boolean $$3 = $$2.b() && $$1.b();
      if (!$$3 && !ciw.c($$1, $$2) && !this.am) {
         chx $$4 = chx.c_($$2);
         if ($$4 != null && !this.G_() && $$4.g() == $$0) {
            if (!this.dK().r_() && !this.aS()) {
               this.dK().a(null, this.dp(), this.dr(), this.dv(), $$4.ak_(), this.da(), 1.0F, 1.0F);
            }

            if (this.a($$0)) {
               this.a(dji.v);
            }
         }
      }
   }

   @Override
   public void a(big.c $$0) {
      super.a($$0);
      this.bz.a();
   }

   @Override
   public void b(qs $$0) {
      $$0.a("Health", this.et());
      $$0.a("HurtTime", (short)this.aK);
      $$0.a("HurtByTimestamp", this.bV);
      $$0.a("DeathTime", (short)this.aM);
      $$0.a("AbsorptionAmount", this.fi());
      $$0.a("Attributes", this.eP().c());
      if (!this.bP.isEmpty()) {
         qy $$1 = new qy();

         for (bht $$2 : this.bP.values()) {
            $$1.add($$2.a(new qs()));
         }

         $$0.a("ActiveEffects", $$1);
      }

      $$0.a("FallFlying", this.fu());
      this.fz().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<rl> $$3 = this.bz.a(rd.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(qs $$0) {
      this.y($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dK() != null && !this.dK().B) {
         this.eP().a($$0.c("Attributes", 10));
      }

      if ($$0.b("ActiveEffects", 9)) {
         qy $$1 = $$0.c("ActiveEffects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            qs $$3 = $$1.a($$2);
            bht $$4 = bht.b($$3);
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
         eic $$6 = this.dK().I().d($$5);
         boolean $$7 = $$6 != null && this.dK().I().a(this.cw(), $$6);
         if (!$$7) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         gv $$8 = new gv($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$8);
         this.an.b(as, bji.c);
         if (!this.am) {
            this.a($$8);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bz = this.a(new Dynamic(rd.a, $$0.c("Brain")));
      }
   }

   protected void el() {
      Iterator<bhr> $$0 = this.bP.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            bhr $$1 = $$0.next();
            bht $$2 = this.bP.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dK().B) {
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
         if (!this.dK().B) {
            this.G();
            this.p();
         }

         this.bT = false;
      }

      int $$3 = this.an.b(bH);
      boolean $$4 = this.an.b(bI);
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
            this.dK().a($$4 ? iw.a : iw.v, this.d(0.5), this.ds(), this.g(0.5), $$7, $$8, $$9);
         }
      }
   }

   protected void G() {
      if (this.bP.isEmpty()) {
         this.eo();
         this.j(false);
      } else {
         Collection<bht> $$0 = this.bP.values();
         this.an.b(bI, c($$0));
         this.an.b(bH, ckv.a($$0));
         this.j(this.a(bhv.n));
      }
   }

   private void p() {
      boolean $$0 = this.cc();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable big $$0) {
      double $$1 = 1.0;
      if (this.bU()) {
         $$1 *= 0.8;
      }

      if (this.cd()) {
         float $$2 = this.eT();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         ciw $$3 = this.c(bil.f);
         bik<?> $$4 = $$0.ag();
         if ($$4 == bik.aJ && $$3.a(ciz.tr)
            || $$4 == bik.bp && $$3.a(ciz.tu)
            || $$4 == bik.aw && $$3.a(ciz.tx)
            || $$4 == bik.ax && $$3.a(ciz.tx)
            || $$4 == bik.u && $$3.a(ciz.tv)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(biw $$0) {
      return $$0 instanceof cbl && this.dK().ai() == bgl.a ? false : $$0.em();
   }

   public boolean a(biw $$0, btj $$1) {
      return $$1.a(this, $$0);
   }

   public boolean em() {
      return !this.cq() && this.en();
   }

   public boolean en() {
      return !this.G_() && this.bv();
   }

   public static boolean c(Collection<bht> $$0) {
      for (bht $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void eo() {
      this.an.b(bI, false);
      this.an.b(bH, 0);
   }

   public boolean ep() {
      if (this.dK().B) {
         return false;
      } else {
         Iterator<bht> $$0 = this.bP.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<bht> eq() {
      return this.bP.values();
   }

   public Map<bhr, bht> er() {
      return this.bP;
   }

   public boolean a(bhr $$0) {
      return this.bP.containsKey($$0);
   }

   @Nullable
   public bht b(bhr $$0) {
      return this.bP.get($$0);
   }

   public final boolean b(bht $$0) {
      return this.b($$0, null);
   }

   public boolean b(bht $$0, @Nullable big $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         bht $$2 = this.bP.get($$0.c());
         if ($$2 == null) {
            this.bP.put($$0.c(), $$0);
            this.a($$0, $$1);
            $$0.a(this);
            return true;
         } else if ($$2.b($$0)) {
            this.a($$2, true, $$1);
            $$0.a(this);
            return true;
         } else {
            return false;
         }
      }
   }

   public boolean c(bht $$0) {
      if (this.eQ() == bjb.b) {
         bhr $$1 = $$0.c();
         if ($$1 == bhv.j || $$1 == bhv.s) {
            return false;
         }
      }

      return true;
   }

   public void c(bht $$0, @Nullable big $$1) {
      if (this.c($$0)) {
         bht $$2 = this.bP.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean es() {
      return this.eQ() == bjb.b;
   }

   @Nullable
   public bht c(@Nullable bhr $$0) {
      return this.bP.remove($$0);
   }

   public boolean d(bhr $$0) {
      bht $$1 = this.c($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(bht $$0, @Nullable big $$1) {
      this.bT = true;
      if (!this.dK().B) {
         $$0.c().a(this.eP(), $$0.e());
         this.d($$0);
      }
   }

   public void d(bht $$0) {
      for (big $$1 : this.cP()) {
         if ($$1 instanceof akj $$2) {
            $$2.c.b(new aaq(this.ah(), $$0));
         }
      }
   }

   protected void a(bht $$0, boolean $$1, @Nullable big $$2) {
      this.bT = true;
      if ($$1 && !this.dK().B) {
         bhr $$3 = $$0.c();
         $$3.a(this.eP());
         $$3.a(this.eP(), $$0.e());
         this.r();
      }

      if (!this.dK().B) {
         this.d($$0);
      }
   }

   protected void a(bht $$0) {
      this.bT = true;
      if (!this.dK().B) {
         $$0.c().a(this.eP());
         this.r();

         for (big $$1 : this.cP()) {
            if ($$1 instanceof akj $$2) {
               $$2.c.b(new yy(this.ah(), $$0.c()));
            }
         }
      }
   }

   private void r() {
      for (bjz $$0 : this.eP().a()) {
         this.d($$0.a());
      }
   }

   private void d(bjy $$0) {
      if ($$0 == bkd.a) {
         float $$1 = this.eK();
         if (this.et() > $$1) {
            this.c($$1);
         }
      } else if ($$0 == bkd.l) {
         float $$2 = this.eL();
         if (this.fi() > $$2) {
            this.y($$2);
         }
      }
   }

   public void b(float $$0) {
      float $$1 = this.et();
      if ($$1 > 0.0F) {
         this.c($$1 + $$0);
      }
   }

   public float et() {
      return this.an.b(bG);
   }

   public void c(float $$0) {
      this.an.b(bG, aro.a($$0, 0.0F, this.eK()));
   }

   public boolean eu() {
      return this.et() <= 0.0F;
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dK().B) {
         return false;
      } else if (this.eu()) {
         return false;
      } else if ($$0.a(apl.i) && this.a(bhv.l)) {
         return false;
      } else {
         if (this.fB() && !this.dK().B) {
            this.fC();
         }

         this.bb = 0;
         float $$2 = $$1;
         boolean $$3 = false;
         float $$4 = 0.0F;
         if ($$1 > 0.0F && this.f($$0)) {
            this.u($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.a(apl.j) && $$0.c() instanceof biw $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(apl.o) && this.ag().a(apm.j)) {
            $$1 *= 5.0F;
         }

         this.aQ.a(1.5F);
         boolean $$7 = true;
         if ((float)this.al > 10.0F && !$$0.a(apl.e)) {
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

         if ($$0.a(apl.a) && !this.c(bil.f).b()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         big $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof biw $$9 && !$$0.a(apl.q)) {
               this.a($$9);
            }

            if ($$8 instanceof cbl $$10) {
               this.aZ = 100;
               this.aY = $$10;
            } else if ($$8 instanceof bvl $$11 && $$11.p()) {
               this.aZ = 100;
               if ($$11.I_() instanceof cbl $$12) {
                  this.aY = $$12;
               } else {
                  this.aY = null;
               }
            }
         }

         if ($$7) {
            if ($$3) {
               this.dK().a(this, (byte)29);
            } else {
               this.dK().a(this, $$0);
            }

            if (!$$0.a(apl.r) && (!$$3 || $$1 > 0.0F)) {
               this.bo();
            }

            if ($$8 != null && !$$0.a(apl.z)) {
               double $$13 = $$8.dp() - this.dp();

               double $$14;
               for ($$14 = $$8.dv() - this.dv(); $$13 * $$13 + $$14 * $$14 < 1.0E-4; $$14 = (Math.random() - Math.random()) * 0.01) {
                  $$13 = (Math.random() - Math.random()) * 0.01;
               }

               this.q(0.4F, $$13, $$14);
               if (!$$3) {
                  this.a($$13, $$14);
               }
            }
         }

         if (this.eu()) {
            if (!this.h($$0)) {
               aot $$15 = this.h_();
               if ($$7 && $$15 != null) {
                  this.a($$15, this.eU(), this.eV());
               }

               this.a($$0);
            }
         } else if ($$7) {
            this.e($$0);
         }

         boolean $$16 = !$$3 || $$1 > 0.0F;
         if ($$16) {
            this.cd = $$0;
            this.ce = this.dK().V();
         }

         if (this instanceof akj) {
            ai.h.a((akj)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((akj)this).a(ape.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof akj) {
            ai.g.a((akj)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$16;
      }
   }

   protected void d(biw $$0) {
      $$0.e(this);
   }

   protected void e(biw $$0) {
      $$0.q(0.5, $$0.dp() - this.dp(), $$0.dv() - this.dv());
   }

   private boolean h(bhe $$0) {
      if ($$0.a(apl.d)) {
         return false;
      } else {
         ciw $$1 = null;

         for (bgn $$2 : bgn.values()) {
            ciw $$3 = this.b($$2);
            if ($$3.a(ciz.uz)) {
               $$1 = $$3.p();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof akj $$4) {
               $$4.b(ape.c.b(ciz.uz));
               ai.B.a($$4, $$1);
               this.a(dji.C);
            }

            this.c(1.0F);
            this.ep();
            this.b(new bht(bhv.j, 900, 1));
            this.b(new bht(bhv.v, 100, 1));
            this.b(new bht(bhv.l, 800, 0));
            this.dK().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bhe ev() {
      if (this.dK().V() - this.ce > 40L) {
         this.cd = null;
      }

      return this.cd;
   }

   protected void e(bhe $$0) {
      aot $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eU(), this.eV());
      }
   }

   public boolean f(bhe $$0) {
      big $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cbr $$3 && $$3.w() > 0) {
         $$2 = true;
      }

      if (!$$0.a(apl.c) && this.fs() && !$$2) {
         ehf $$4 = $$0.h();
         if ($$4 != null) {
            ehf $$5 = this.f(1.0F);
            ehf $$6 = $$4.a(this.di()).d();
            $$6 = new ehf($$6.c, 0.0, $$6.e);
            if ($$6.b($$5) < 0.0) {
               return true;
            }
         }
      }

      return false;
   }

   private void i(ciw $$0) {
      if (!$$0.b()) {
         if (!this.aS()) {
            this.dK().a(this.dp(), this.dr(), this.dv(), aou.lZ, this.da(), 0.8F, 0.8F + this.dK().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bhe $$0) {
      if (!this.dF() && !this.ba) {
         big $$1 = $$0.d();
         biw $$2 = this.eJ();
         if (this.bh >= 0 && $$2 != null) {
            $$2.a(this, this.bh, $$0);
         }

         if (this.fB()) {
            this.fC();
         }

         if (!this.dK().B && this.ac()) {
            b.info("Named entity {} died: {}", this, this.eI().a().getString());
         }

         this.ba = true;
         this.eI().c();
         if (this.dK() instanceof aki $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(dji.p);
               this.g($$0);
               this.f($$2);
            }

            this.dK().a(this, (byte)3);
         }

         this.b(bji.h);
      }
   }

   protected void f(@Nullable biw $$0) {
      if (!this.dK().B) {
         boolean $$1 = false;
         if ($$0 instanceof bxs) {
            if (this.dK().X().b(cpg.c)) {
               gv $$2 = this.dk();
               dey $$3 = csl.cd.n();
               if (this.dK().a_($$2).i() && $$3.a((cpn)this.dK(), $$2)) {
                  this.dK().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               bye $$4 = new bye(this.dK(), this.dp(), this.dr(), this.dv(), new ciw(ciz.da));
               this.dK().b($$4);
            }
         }
      }
   }

   protected void g(bhe $$0) {
      big $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof cbl) {
         $$2 = cnf.h((biw)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.aZ > 0;
      if (this.eb() && this.dK().X().b(cpg.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.ew();
      this.ex();
   }

   protected void ew() {
   }

   protected void ex() {
      if (this.dK() instanceof aki && !this.eB() && (this.ed() || this.aZ > 0 && this.ea() && this.dK().X().b(cpg.f))) {
         bim.a((aki)this.dK(), this.di(), this.ec());
      }
   }

   protected void a(bhe $$0, int $$1, boolean $$2) {
   }

   public aep ey() {
      return this.ag().j();
   }

   public long ez() {
      return 0L;
   }

   protected void a(bhe $$0, boolean $$1) {
      aep $$2 = this.ey();
      ecp $$3 = this.dK().n().aH().getLootTable($$2);
      ecn.a $$4 = new ecn.a((aki)this.dK()).a(eet.a, this).a(eet.f, this.di()).a(eet.c, $$0).b(eet.d, $$0.d()).b(eet.e, $$0.c());
      if ($$1 && this.aY != null) {
         $$4 = $$4.a(eet.b, this.aY).a(this.aY.gm());
      }

      ecn $$5 = $$4.a(ees.f);
      $$3.a($$5, this.ez(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.b(bkd.c);
      if (!($$0 <= 0.0)) {
         this.au = true;
         ehf $$3 = this.dn();
         ehf $$4 = new ehf($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aA() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected aot d(bhe $$0) {
      return aou.iZ;
   }

   @Nullable
   protected aot h_() {
      return aou.iU;
   }

   private aot d(int $$0) {
      return $$0 > 4 ? this.eE().b() : this.eE().a();
   }

   public void eA() {
      this.ch = true;
   }

   public boolean eB() {
      return this.ch;
   }

   protected ehf eC() {
      return this.cY() instanceof bjm $$0 ? this.di().b(0.0, $$0.d(), 0.0) : this.di();
   }

   public float eD() {
      return 0.0F;
   }

   public biw.a eE() {
      return new biw.a(aou.ja, aou.iS);
   }

   protected aot c(ciw $$0) {
      return $$0.N();
   }

   public aot d(ciw $$0) {
      return $$0.O();
   }

   public Optional<gv> eF() {
      return this.cc;
   }

   public boolean j_() {
      if (this.G_()) {
         return false;
      } else {
         gv $$0 = this.dk();
         dey $$1 = this.dl();
         if ($$1.a(apj.aO)) {
            this.cc = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dax && this.c($$0, $$1)) {
            this.cc = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(gv $$0, dey $$1) {
      if ($$1.c(dax.a)) {
         dey $$2 = this.dK().a_($$0.d());
         if ($$2.a(csl.cO) && $$2.c(cwn.a) == $$1.c(dax.aC)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean bv() {
      return !this.dF() && this.et() > 0.0F;
   }

   @Override
   public boolean a(float $$0, float $$1, bhe $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.d($$0, $$1);
      if ($$4 > 0) {
         this.a(this.d($$4), 1.0F, 1.0F);
         this.eG();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int d(float $$0, float $$1) {
      if (this.ag().a(apm.l)) {
         return 0;
      } else {
         bht $$2 = this.b(bhv.h);
         float $$3 = $$2 == null ? 0.0F : (float)($$2.e() + 1);
         return aro.f(($$0 - 3.0F - $$3) * $$1);
      }
   }

   protected void eG() {
      if (!this.aS()) {
         int $$0 = aro.a(this.dp());
         int $$1 = aro.a(this.dr() - 0.2F);
         int $$2 = aro.a(this.dv());
         dey $$3 = this.dK().a_(new gv($$0, $$1, $$2));
         if (!$$3.i()) {
            czx $$4 = $$3.w();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void m(float $$0) {
      this.aL = 10;
      this.aK = this.aL;
   }

   public int eH() {
      return aro.a(this.b(bkd.i));
   }

   protected void b(bhe $$0, float $$1) {
   }

   protected void c(bhe $$0, float $$1) {
   }

   protected void u(float $$0) {
   }

   protected float d(bhe $$0, float $$1) {
      if (!$$0.a(apl.b)) {
         this.b($$0, $$1);
         $$1 = bha.a($$1, (float)this.eH(), (float)this.b(bkd.j));
      }

      return $$1;
   }

   protected float e(bhe $$0, float $$1) {
      if ($$0.a(apl.f)) {
         return $$1;
      } else {
         if (this.a(bhv.k) && !$$0.a(apl.g)) {
            int $$2 = (this.b(bhv.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof akj) {
                  ((akj)this).a(ape.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof akj) {
                  ((akj)$$0.d()).a(ape.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(apl.h)) {
            return $$1;
         } else {
            int $$7 = cnf.a(this.bK(), $$0);
            if ($$7 > 0) {
               $$1 = bha.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bhe $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fi(), 0.0F);
         this.y(this.fi() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof akj $$4) {
            $$4.a(ape.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eI().a($$0, var9);
            this.c(this.et() - var9);
            this.y(this.fi() - var9);
            this.a(dji.o);
         }
      }
   }

   public bhb eI() {
      return this.bO;
   }

   @Nullable
   public biw eJ() {
      if (this.aY != null) {
         return this.aY;
      } else {
         return this.bU != null ? this.bU : null;
      }
   }

   public final float eK() {
      return (float)this.b(bkd.a);
   }

   public final float eL() {
      return (float)this.b(bkd.l);
   }

   public final int eM() {
      return this.an.b(bJ);
   }

   public final void p(int $$0) {
      this.an.b(bJ, $$0);
   }

   public final int eN() {
      return this.an.b(bK);
   }

   public final void q(int $$0) {
      this.an.b(bK, $$0);
   }

   private int w() {
      if (bhu.a(this)) {
         return 6 - (1 + bhu.b(this));
      } else {
         return this.a(bhv.d) ? 6 + (1 + this.b(bhv.d).e()) * 2 : 6;
      }
   }

   public void a(bgn $$0) {
      this.a($$0, false);
   }

   public void a(bgn $$0, boolean $$1) {
      if (!this.aF || this.aH >= this.w() / 2 || this.aH < 0) {
         this.aH = -1;
         this.aF = true;
         this.aG = $$0;
         if (this.dK() instanceof aki) {
            ws $$2 = new ws(this, $$0 == bgn.a ? 0 : 3);
            akg $$3 = ((aki)this.dK()).k();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bhe $$0) {
      this.aQ.a(1.5F);
      this.al = 20;
      this.aL = 10;
      this.aK = this.aL;
      aot $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eU(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
      }

      this.a(this.dL().n(), 0.0F);
      this.cd = $$0;
      this.ce = this.dK().V();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            aot $$1 = this.h_();
            if ($$1 != null) {
               this.a($$1, this.eU(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cbl)) {
               this.c(0.0F);
               this.a(this.dL().n());
            }
            break;
         case 29:
            this.a(aou.uQ, 1.0F, 0.8F + this.dK().z.i() * 0.4F);
            break;
         case 30:
            this.a(aou.uR, 0.8F, 0.8F + this.dK().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ag.i() - 0.5F) * 0.2F;
               float $$6 = (this.ag.i() - 0.5F) * 0.2F;
               float $$7 = (this.ag.i() - 0.5F) * 0.2F;
               double $$8 = aro.d($$4, this.K, this.dp()) + (this.ag.j() - 0.5) * (double)this.df() * 2.0;
               double $$9 = aro.d($$4, this.L, this.dr()) + this.ag.j() * (double)this.dg();
               double $$10 = aro.d($$4, this.M, this.dv()) + (this.ag.j() - 0.5) * (double)this.df() * 2.0;
               this.dK().a(iw.X, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.c(bil.a));
            break;
         case 48:
            this.i(this.c(bil.b));
            break;
         case 49:
            this.i(this.c(bil.f));
            break;
         case 50:
            this.i(this.c(bil.e));
            break;
         case 51:
            this.i(this.c(bil.d));
            break;
         case 52:
            this.i(this.c(bil.c));
            break;
         case 54:
            cwb.b(this);
            break;
         case 55:
            this.y();
            break;
         case 60:
            this.x();
            break;
         default:
            super.b($$0);
      }
   }

   private void x() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.ag.k() * 0.02;
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         this.dK().a(iw.W, this.d(1.0), this.ds(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void y() {
      ciw $$0 = this.c(bil.b);
      this.a(bil.b, this.c(bil.a));
      this.a(bil.a, $$0);
   }

   @Override
   protected void az() {
      this.a(this.dL().m(), 4.0F);
   }

   protected void eO() {
      int $$0 = this.w();
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
   public bjz a(bjy $$0) {
      return this.eP().a($$0);
   }

   public double a(hf<bjy> $$0) {
      return this.b($$0.a());
   }

   public double b(bjy $$0) {
      return this.eP().c($$0);
   }

   public double b(hf<bjy> $$0) {
      return this.c($$0.a());
   }

   public double c(bjy $$0) {
      return this.eP().d($$0);
   }

   public bka eP() {
      return this.bN;
   }

   public bjb eQ() {
      return bjb.a;
   }

   public ciw eR() {
      return this.c(bil.a);
   }

   public ciw eS() {
      return this.c(bil.b);
   }

   public boolean b(cir $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<ciw> $$0) {
      return $$0.test(this.eR()) || $$0.test(this.eS());
   }

   public ciw b(bgn $$0) {
      if ($$0 == bgn.a) {
         return this.c(bil.a);
      } else if ($$0 == bgn.b) {
         return this.c(bil.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bgn $$0, ciw $$1) {
      if ($$0 == bgn.a) {
         this.a(bil.a, $$1);
      } else {
         if ($$0 != bgn.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bil.b, $$1);
      }
   }

   public boolean b(bil $$0) {
      return !this.c($$0).b();
   }

   @Override
   public abstract Iterable<ciw> bK();

   public abstract ciw c(bil var1);

   @Override
   public abstract void a(bil var1, ciw var2);

   protected void e(ciw $$0) {
      qs $$1 = $$0.v();
      if ($$1 != null) {
         $$0.d().b($$1);
      }
   }

   public float eT() {
      Iterable<ciw> $$0 = this.bK();
      int $$1 = 0;
      int $$2 = 0;

      for (ciw $$3 : $$0) {
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
      bjz $$1 = this.a(bkd.d);
      $$1.b(e.a());
      if ($$0) {
         $$1.b(e);
      }
   }

   protected float eU() {
      return 1.0F;
   }

   public float eV() {
      return this.i_() ? (this.ag.i() - this.ag.i()) * 0.2F + 1.5F : (this.ag.i() - this.ag.i()) * 0.2F + 1.0F;
   }

   protected boolean eW() {
      return this.eu();
   }

   @Override
   public void g(big $$0) {
      if (!this.fB()) {
         super.g($$0);
      }
   }

   private void a(big $$0) {
      ehf $$1;
      if (this.dF()) {
         $$1 = this.di();
      } else if (!$$0.dF() && !this.dK().a_($$0.dk()).a(apj.aI)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dr(), $$0.dr());
         $$1 = new ehf(this.dp(), $$2, this.dv());
      }

      this.a($$1.c, $$1.d, $$1.e);
   }

   @Override
   public boolean cB() {
      return this.cA();
   }

   protected float eX() {
      return 0.42F * this.aI() + this.eY();
   }

   public float eY() {
      return this.a(bhv.h) ? 0.1F * ((float)this.b(bhv.h).e() + 1.0F) : 0.0F;
   }

   protected void eZ() {
      ehf $$0 = this.dn();
      this.o($$0.c, (double)this.eX(), $$0.e);
      if (this.bX()) {
         float $$1 = this.dA() * (float) (Math.PI / 180.0);
         this.f(this.dn().b((double)(-aro.a($$1) * 0.2F), 0.0, (double)(aro.b($$1) * 0.2F)));
      }

      this.au = true;
   }

   protected void fa() {
      this.f(this.dn().b(0.0, -0.04F, 0.0));
   }

   protected void c(apy<eaa> $$0) {
      this.f(this.dn().b(0.0, 0.04F, 0.0));
   }

   protected float fb() {
      return 0.8F;
   }

   public boolean a(eab $$0) {
      return false;
   }

   public void h(ehf $$0) {
      if (this.cW()) {
         double $$1 = 0.08;
         boolean $$2 = this.dn().d <= 0.0;
         if ($$2 && this.a(bhv.B)) {
            $$1 = 0.01;
         }

         eab $$3 = this.dK().b_(this.dk());
         if (this.aX() && this.dY() && !this.a($$3)) {
            double $$4 = this.dr();
            float $$5 = this.bX() ? 0.9F : this.fb();
            float $$6 = 0.02F;
            float $$7 = (float)cnf.f(this);
            if ($$7 > 3.0F) {
               $$7 = 3.0F;
            }

            if (!this.aA()) {
               $$7 *= 0.5F;
            }

            if ($$7 > 0.0F) {
               $$5 += (0.54600006F - $$5) * $$7 / 3.0F;
               $$6 += (this.fd() - $$6) * $$7 / 3.0F;
            }

            if (this.a(bhv.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(bjc.a, this.dn());
            ehf $$8 = this.dn();
            if (this.P && this.j_()) {
               $$8 = new ehf($$8.c, 0.2, $$8.e);
            }

            this.f($$8.d((double)$$5, 0.8F, (double)$$5));
            ehf $$9 = this.a($$1, $$2, this.dn());
            this.f($$9);
            if (this.P && this.g($$9.c, $$9.d + 0.6F - this.dr() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bl() && this.dY() && !this.a($$3)) {
            double $$10 = this.dr();
            this.a(0.02F, $$0);
            this.a(bjc.a, this.dn());
            if (this.b(apo.b) <= this.de()) {
               this.f(this.dn().d(0.5, 0.8F, 0.5));
               ehf $$11 = this.a($$1, $$2, this.dn());
               this.f($$11);
            } else {
               this.f(this.dn().a(0.5));
            }

            if (!this.aT()) {
               this.f(this.dn().b(0.0, -$$1 / 4.0, 0.0));
            }

            ehf $$12 = this.dn();
            if (this.P && this.g($$12.c, $$12.d + 0.6F - this.dr() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fu()) {
            this.cm();
            ehf $$13 = this.dn();
            ehf $$14 = this.bE();
            float $$15 = this.dC() * (float) (Math.PI / 180.0);
            double $$16 = Math.sqrt($$14.c * $$14.c + $$14.e * $$14.e);
            double $$17 = $$13.h();
            double $$18 = $$14.f();
            double $$19 = Math.cos((double)$$15);
            $$19 = $$19 * $$19 * Math.min(1.0, $$18 / 0.4);
            $$13 = this.dn().b(0.0, $$1 * (-1.0 + $$19 * 0.75), 0.0);
            if ($$13.d < 0.0 && $$16 > 0.0) {
               double $$20 = $$13.d * -0.1 * $$19;
               $$13 = $$13.b($$14.c * $$20 / $$16, $$20, $$14.e * $$20 / $$16);
            }

            if ($$15 < 0.0F && $$16 > 0.0) {
               double $$21 = $$17 * (double)(-aro.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.f($$13.d(0.99F, 0.98F, 0.99F));
            this.a(bjc.a, this.dn());
            if (this.P && !this.dK().B) {
               double $$22 = this.dn().h();
               double $$23 = $$17 - $$22;
               float $$24 = (float)($$23 * 10.0 - 3.0);
               if ($$24 > 0.0F) {
                  this.a(this.d((int)$$24), 1.0F, 1.0F);
                  this.a(this.dL().l(), $$24);
               }
            }

            if (this.aA() && !this.dK().B) {
               this.b(7, false);
            }
         } else {
            gv $$25 = this.aG();
            float $$26 = this.dK().a_($$25).b().h();
            float $$27 = this.aA() ? $$26 * 0.91F : 0.91F;
            ehf $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.a(bhv.y)) {
               $$29 += (0.05 * (double)(this.b(bhv.y).e() + 1) - $$28.d) * 0.2;
            } else if (this.dK().B && !this.dK().A($$25)) {
               if (this.dr() > (double)this.dK().C_()) {
                  $$29 = -0.1;
               } else {
                  $$29 = 0.0;
               }
            } else if (!this.aT()) {
               $$29 -= $$1;
            }

            if (this.ek()) {
               this.o($$28.c, $$29, $$28.e);
            } else {
               this.o($$28.c * (double)$$27, $$29 * 0.98F, $$28.e * (double)$$27);
            }
         }
      }

      this.q(this instanceof bur);
   }

   private void c(cbl $$0, ehf $$1) {
      ehf $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.cW()) {
         this.w(this.e($$0));
         this.h($$2);
      } else {
         this.q(false);
         this.f(ehf.b);
         this.aB();
      }
   }

   protected void a(cbl $$0, ehf $$1) {
   }

   protected ehf b(cbl $$0, ehf $$1) {
      return $$1;
   }

   protected float e(cbl $$0) {
      return this.fd();
   }

   public void q(boolean $$0) {
      float $$1 = (float)aro.g(this.dp() - this.K, $$0 ? this.dr() - this.L : 0.0, this.dv() - this.M);
      this.v($$1);
   }

   protected void v(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aQ.a($$1, 0.4F);
   }

   public ehf a(ehf $$0, float $$1) {
      this.a(this.A($$1), $$0);
      this.f(this.j(this.dn()));
      this.a(bjc.a, this.dn());
      ehf $$2 = this.dn();
      if ((this.P || this.bj) && (this.j_() || this.dl().a(csl.qC) && cyc.a(this))) {
         $$2 = new ehf($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public ehf a(double $$0, boolean $$1, ehf $$2) {
      if (!this.aT() && !this.bX()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new ehf($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private ehf j(ehf $$0) {
      if (this.j_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = aro.a($$0.c, -0.15F, 0.15F);
         double $$3 = aro.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dl().a(csl.nS) && this.ft() && this instanceof cbl) {
            $$4 = 0.0;
         }

         $$0 = new ehf($$2, $$4, $$3);
      }

      return $$0;
   }

   private float A(float $$0) {
      return this.aA() ? this.fd() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fc();
   }

   protected float fc() {
      return this.cN() instanceof cbl ? this.fd() * 0.1F : 0.02F;
   }

   public float fd() {
      return this.bY;
   }

   public void w(float $$0) {
      this.bY = $$0;
   }

   public boolean C(big $$0) {
      this.A($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.D();
      this.F();
      if (!this.dK().B) {
         int $$0 = this.eM();
         if ($$0 > 0) {
            if (this.aI <= 0) {
               this.aI = 20 * (30 - $$0);
            }

            this.aI--;
            if (this.aI <= 0) {
               this.p($$0 - 1);
            }
         }

         int $$1 = this.eN();
         if ($$1 > 0) {
            if (this.aJ <= 0) {
               this.aJ = 20 * (30 - $$1);
            }

            this.aJ--;
            if (this.aJ <= 0) {
               this.q($$1 - 1);
            }
         }

         this.z();
         if (this.ah % 20 == 0) {
            this.eI().c();
         }

         if (this.fB() && !this.H()) {
            this.fC();
         }
      }

      if (!this.dF()) {
         this.b_();
      }

      double $$2 = this.dp() - this.K;
      double $$3 = this.dv() - this.M;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aU;
      float $$6 = 0.0F;
      this.bc = this.bd;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)aro.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = aro.e(aro.g(this.dA()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aO > 0.0F) {
         $$5 = this.dA();
      }

      if (!this.aA()) {
         $$7 = 0.0F;
      }

      this.bd = this.bd + ($$7 - this.bd) * 0.3F;
      this.dK().ad().a("headTurn");
      $$6 = this.e($$5, $$6);
      this.dK().ad().c();
      this.dK().ad().a("rangeChecks");

      while (this.dA() - this.N < -180.0F) {
         this.N -= 360.0F;
      }

      while (this.dA() - this.N >= 180.0F) {
         this.N += 360.0F;
      }

      while (this.aU - this.aV < -180.0F) {
         this.aV -= 360.0F;
      }

      while (this.aU - this.aV >= 180.0F) {
         this.aV += 360.0F;
      }

      while (this.dC() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dC() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aW - this.aX < -180.0F) {
         this.aX -= 360.0F;
      }

      while (this.aW - this.aX >= 180.0F) {
         this.aX += 360.0F;
      }

      this.dK().ad().c();
      this.be += $$6;
      if (this.fu()) {
         this.bx++;
      } else {
         this.bx = 0;
      }

      if (this.fB()) {
         this.s(0.0F);
      }

      this.r();
   }

   private void z() {
      Map<bil, ciw> $$0 = this.A();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bil, ciw> A() {
      Map<bil, ciw> $$0 = null;

      for (bil $$1 : bil.values()) {
         ciw $$2;
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

         ciw $$5 = this.c($$1);
         if (this.a($$2, $$5)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bil.class);
            }

            $$0.put($$1, $$5);
            if (!$$2.b()) {
               this.eP().a($$2.a($$1));
            }

            if (!$$5.b()) {
               this.eP().b($$5.a($$1));
            }
         }
      }

      return $$0;
   }

   public boolean a(ciw $$0, ciw $$1) {
      return !ciw.a($$1, $$0);
   }

   private void a(Map<bil, ciw> $$0) {
      ciw $$1 = $$0.get(bil.a);
      ciw $$2 = $$0.get(bil.b);
      if ($$1 != null && $$2 != null && ciw.a($$1, this.f(bil.b)) && ciw.a($$2, this.f(bil.a))) {
         ((aki)this.dK()).k().b(this, new xr(this, (byte)55));
         $$0.remove(bil.a);
         $$0.remove(bil.b);
         this.c(bil.a, $$1.p());
         this.c(bil.b, $$2.p());
      }
   }

   private void b(Map<bil, ciw> $$0) {
      List<Pair<bil, ciw>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         ciw $$3 = $$2.p();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
         }
      });
      ((aki)this.dK()).k().b(this, new zt(this.ah(), $$1));
   }

   private ciw e(bil $$0) {
      return this.bR.get($$0.b());
   }

   private void b(bil $$0, ciw $$1) {
      this.bR.set($$0.b(), $$1);
   }

   private ciw f(bil $$0) {
      return this.bQ.get($$0.b());
   }

   private void c(bil $$0, ciw $$1) {
      this.bQ.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = aro.g($$0 - this.aU);
      this.aU += $$2 * 0.3F;
      float $$3 = aro.g(this.dA() - this.aU);
      if (Math.abs($$3) > 50.0F) {
         this.aU = this.aU + ($$3 - (float)(aro.j((double)$$3) * 50));
      }

      boolean $$4 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$4) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   public void b_() {
      if (this.bZ > 0) {
         this.bZ--;
      }

      if (this.cW()) {
         this.bn = 0;
         this.f(this.dp(), this.dr(), this.dv());
      }

      if (this.bn > 0) {
         this.a(this.bn, this.bo, this.bp, this.bq, this.br, this.bs);
         this.bn--;
      } else if (!this.cX()) {
         this.f(this.dn().a(0.98));
      }

      if (this.bu > 0) {
         this.a(this.bu, this.bt);
         this.bu--;
      }

      ehf $$0 = this.dn();
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
      this.dK().ad().a("ai");
      if (this.eW()) {
         this.bj = false;
         this.bk = 0.0F;
         this.bm = 0.0F;
      } else if (this.cX()) {
         this.dK().ad().a("newAi");
         this.ff();
         this.dK().ad().c();
      }

      this.dK().ad().c();
      this.dK().ad().a("jump");
      if (this.bj && this.dY()) {
         double $$4;
         if (this.bl()) {
            $$4 = this.b(apo.b);
         } else {
            $$4 = this.b(apo.a);
         }

         boolean $$6 = this.aX() && $$4 > 0.0;
         double $$7 = this.de();
         if (!$$6 || this.aA() && !($$4 > $$7)) {
            if (!this.bl() || this.aA() && !($$4 > $$7)) {
               if ((this.aA() || $$6 && $$4 <= $$7) && this.bZ == 0) {
                  this.eZ();
                  this.bZ = 10;
               }
            } else {
               this.c(apo.b);
            }
         } else {
            this.c(apo.a);
         }
      } else {
         this.bZ = 0;
      }

      this.dK().ad().c();
      this.dK().ad().a("travel");
      this.bk *= 0.98F;
      this.bm *= 0.98F;
      this.B();
      eha $$8 = this.cG();
      ehf $$9 = new ehf((double)this.bk, (double)this.bl, (double)this.bm);
      if (this.a(bhv.B) || this.a(bhv.y)) {
         this.n();
      }

      label104: {
         if (this.cN() instanceof cbl $$10 && this.bv()) {
            this.c($$10, $$9);
            break label104;
         }

         this.h($$9);
      }

      this.dK().ad().c();
      this.dK().ad().a("freezing");
      if (!this.dK().B && !this.eu()) {
         int $$11 = this.ci();
         if (this.aA && this.dy()) {
            this.k(Math.min(this.cl(), $$11 + 1));
         } else {
            this.k(Math.max(0, $$11 - 2));
         }
      }

      this.dV();
      this.dW();
      if (!this.dK().B && this.ah % 40 == 0 && this.ck() && this.dy()) {
         this.a(this.dL().t(), 1.0F);
      }

      this.dK().ad().c();
      this.dK().ad().a("push");
      if (this.by > 0) {
         this.by--;
         this.a($$8, this.cG());
      }

      this.fg();
      this.dK().ad().c();
      if (!this.dK().B && this.fe() && this.aZ()) {
         this.a(this.dL().h(), 1.0F);
      }
   }

   public boolean fe() {
      return false;
   }

   private void B() {
      boolean $$0 = this.i(7);
      if ($$0 && !this.aA() && !this.bN() && !this.a(bhv.y)) {
         ciw $$1 = this.c(bil.e);
         if ($$1.a(ciz.nh) && chq.d($$1)) {
            $$0 = true;
            int $$2 = this.bx + 1;
            if (!this.dK().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, $$0x -> $$0x.d(bil.e));
               }

               this.a(dji.n);
            }
         } else {
            $$0 = false;
         }
      } else {
         $$0 = false;
      }

      if (!this.dK().B) {
         this.b(7, $$0);
      }
   }

   protected void ff() {
   }

   protected void fg() {
      if (this.dK().r_()) {
         this.dK().a(diw.a(cbl.class), this.cG(), bij.a(this)).forEach(this::D);
      } else {
         List<big> $$0 = this.dK().a(this, this.cG(), bij.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dK().X().c(cpg.t);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ag.a(4) == 0) {
               int $$2 = 0;

               for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
                  if (!$$0.get($$3).bN()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dL().g(), 6.0F);
               }
            }

            for (int $$4 = 0; $$4 < $$0.size(); $$4++) {
               big $$5 = $$0.get($$4);
               this.D($$5);
            }
         }
      }
   }

   protected void a(eha $$0, eha $$1) {
      eha $$2 = $$0.b($$1);
      List<big> $$3 = this.dK().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            big $$5 = $$3.get($$4);
            if ($$5 instanceof biw) {
               this.g((biw)$$5);
               this.by = 0;
               this.f(this.dn().a(-0.2));
               break;
            }
         }
      } else if (this.P) {
         this.by = 0;
      }

      if (!this.dK().B && this.by <= 0) {
         this.c(4, false);
      }
   }

   protected void D(big $$0) {
      $$0.g(this);
   }

   protected void g(biw $$0) {
   }

   public boolean fh() {
      return (this.an.b(t) & 4) != 0;
   }

   @Override
   public void aa() {
      big $$0 = this.cY();
      super.aa();
      if ($$0 != null && $$0 != this.cY() && !this.dK().B) {
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
   public void a(float $$0, int $$1) {
      this.bt = (double)$$0;
      this.bu = $$1;
   }

   public void r(boolean $$0) {
      this.bj = $$0;
   }

   public void a(bye $$0) {
      big $$1 = $$0.v();
      if ($$1 instanceof akj) {
         ai.O.a((akj)$$1, $$0.j(), this);
      }
   }

   public void a(big $$0, int $$1) {
      if (!$$0.dF() && !this.dK().B && ($$0 instanceof bye || $$0 instanceof cbr || $$0 instanceof bim)) {
         ((aki)this.dK()).k().b($$0, new aam($$0.ah(), this.ah(), $$1));
      }
   }

   public boolean E(big $$0) {
      if ($$0.dK() != this.dK()) {
         return false;
      } else {
         ehf $$1 = new ehf(this.dp(), this.dt(), this.dv());
         ehf $$2 = new ehf($$0.dp(), $$0.dt(), $$0.dv());
         return $$2.f($$1) > 128.0 ? false : this.dK().a(new cot($$1, $$2, cot.a.a, cot.b.a, this)).c() == ehd.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.aW : aro.i($$0, this.aX, this.aW);
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
      return !this.dF();
   }

   @Override
   public boolean bs() {
      return this.bv() && !this.G_() && !this.j_();
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
   protected ehf a(hb.a $$0, l.a $$1) {
      return i(super.a($$0, $$1));
   }

   public static ehf i(ehf $$0) {
      return new ehf($$0.c, $$0.d, 0.0);
   }

   public float fi() {
      return this.ca;
   }

   public final void y(float $$0) {
      this.z(aro.a($$0, 0.0F, this.eL()));
   }

   protected void z(float $$0) {
      this.ca = $$0;
   }

   public void Q_() {
   }

   public void F_() {
   }

   protected void fj() {
      this.bT = true;
   }

   public abstract biq fk();

   public boolean fl() {
      return (this.an.b(t) & 1) > 0;
   }

   public bgn fm() {
      return (this.an.b(t) & 2) > 0 ? bgn.b : bgn.a;
   }

   private void D() {
      if (this.fl()) {
         if (ciw.b(this.b(this.fm()), this.bv)) {
            this.bv = this.b(this.fm());
            this.a(this.bv);
         } else {
            this.fr();
         }
      }
   }

   protected void a(ciw $$0) {
      $$0.b(this.dK(), this, this.fo());
      if (this.E()) {
         this.b($$0, 5);
      }

      if (--this.bw == 0 && !this.dK().B && !$$0.t()) {
         this.Z_();
      }
   }

   private boolean E() {
      int $$0 = this.fo();
      cdz $$1 = this.bv.d().v();
      boolean $$2 = $$1 != null && $$1.e();
      $$2 |= $$0 <= this.bv.r() - 7;
      return $$2 && $$0 % 4 == 0;
   }

   private void F() {
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

   public void c(bgn $$0) {
      ciw $$1 = this.b($$0);
      if (!$$1.b() && !this.fl()) {
         this.bv = $$1;
         this.bw = $$1.r();
         if (!this.dK().B) {
            this.c(1, true);
            this.c(2, $$0 == bgn.b);
            this.a(dji.D);
         }
      }
   }

   @Override
   public void a(adx<?> $$0) {
      super.a($$0);
      if (bL.equals($$0)) {
         if (this.dK().B) {
            this.fz().ifPresent(this::a);
         }
      } else if (t.equals($$0) && this.dK().B) {
         if (this.fl() && this.bv.b()) {
            this.bv = this.b(this.fm());
            if (!this.bv.b()) {
               this.bw = this.bv.r();
            }
         } else if (!this.fl() && !this.bv.b()) {
            this.bv = ciw.b;
            this.bw = 0;
         }
      }
   }

   @Override
   public void a(ec.a $$0, ehf $$1) {
      super.a($$0, $$1);
      this.aX = this.aW;
      this.aU = this.aW;
      this.aV = this.aU;
   }

   protected void b(ciw $$0, int $$1) {
      if (!$$0.b() && this.fl()) {
         if ($$0.s() == ckp.c) {
            this.a(this.c($$0), 0.5F, this.dK().z.i() * 0.1F + 0.9F);
         }

         if ($$0.s() == ckp.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(ciw $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ehf $$3 = new ehf(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dC() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dA() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ag.i()) * 0.6 - 0.3;
         ehf $$5 = new ehf(((double)this.ag.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dC() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dA() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dp(), this.dt(), this.dv());
         this.dK().a(new is(iw.O, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void Z_() {
      if (!this.dK().B || this.fl()) {
         bgn $$0 = this.fm();
         if (!this.bv.equals(this.b($$0))) {
            this.fq();
         } else {
            if (!this.bv.b() && this.fl()) {
               this.b(this.bv, 16);
               ciw $$1 = this.bv.a(this.dK(), this);
               if ($$1 != this.bv) {
                  this.a($$0, $$1);
               }

               this.fr();
            }
         }
      }
   }

   public ciw fn() {
      return this.bv;
   }

   public int fo() {
      return this.bw;
   }

   public int fp() {
      return this.fl() ? this.bv.r() - this.fo() : 0;
   }

   public void fq() {
      if (!this.bv.b()) {
         this.bv.a(this.dK(), this, this.fo());
         if (this.bv.t()) {
            this.D();
         }
      }

      this.fr();
   }

   public void fr() {
      if (!this.dK().B) {
         boolean $$0 = this.fl();
         this.c(1, false);
         if ($$0) {
            this.a(dji.C);
         }
      }

      this.bv = ciw.b;
      this.bw = 0;
   }

   public boolean fs() {
      if (this.fl() && !this.bv.b()) {
         cir $$0 = this.bv.d();
         return $$0.c(this.bv) != ckp.d ? false : $$0.b(this.bv) - this.bw >= 5;
      } else {
         return false;
      }
   }

   public boolean ft() {
      return this.bR();
   }

   public boolean fu() {
      return this.i(7);
   }

   @Override
   public boolean bZ() {
      return super.bZ() || !this.fu() && this.c(bji.b);
   }

   public int fv() {
      return this.bx;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dp();
      double $$5 = this.dr();
      double $$6 = this.dv();
      double $$7 = $$1;
      boolean $$8 = false;
      gv $$9 = gv.a($$0, $$1, $$2);
      cpk $$10 = this.dK();
      if ($$10.A($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.C_()) {
            gv $$12 = $$9.d();
            dey $$13 = $$10.a_($$12);
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

         if (this instanceof bjf) {
            ((bjf)this).H().n();
         }

         return true;
      }
   }

   public boolean fw() {
      return true;
   }

   public boolean fx() {
      return true;
   }

   public void a(gv $$0, boolean $$1) {
   }

   public boolean f(ciw $$0) {
      return false;
   }

   @Override
   public bih a(bji $$0) {
      return $$0 == bji.c ? v : super.a($$0).a(this.dX());
   }

   public ImmutableList<bji> fy() {
      return ImmutableList.of(bji.a);
   }

   public eha e(bji $$0) {
      bih $$1 = this.a($$0);
      return new eha((double)(-$$1.a / 2.0F), 0.0, (double)(-$$1.a / 2.0F), (double)($$1.a / 2.0F), (double)$$1.b, (double)($$1.a / 2.0F));
   }

   protected boolean f(bji $$0) {
      eha $$1 = this.a($$0).a(this.di());
      return this.dK().b(this, $$1);
   }

   @Override
   public boolean cs() {
      return super.cs() && !this.fB();
   }

   public Optional<gv> fz() {
      return this.an.b(bL);
   }

   public void g(gv $$0) {
      this.an.b(bL, Optional.of($$0));
   }

   public void fA() {
      this.an.b(bL, Optional.empty());
   }

   public boolean fB() {
      return this.fz().isPresent();
   }

   public void b(gv $$0) {
      if (this.bN()) {
         this.aa();
      }

      dey $$1 = this.dK().a_($$0);
      if ($$1.b() instanceof csd) {
         this.dK().a($$0, $$1.a(csd.b, Boolean.valueOf(true)), 3);
      }

      this.b(bji.c);
      this.a($$0);
      this.g($$0);
      this.f(ehf.b);
      this.au = true;
   }

   private void a(gv $$0) {
      this.e((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean H() {
      return this.fz().map($$0 -> this.dK().a_($$0).b() instanceof csd).orElse(false);
   }

   public void fC() {
      this.fz().filter(this.dK()::A).ifPresent($$0x -> {
         dey $$1 = this.dK().a_($$0x);
         if ($$1.b() instanceof csd) {
            hb $$2 = $$1.c(csd.aC);
            this.dK().a($$0x, $$1.a(csd.b, Boolean.valueOf(false)), 3);
            ehf $$3 = csd.a(this.ag(), this.dK(), $$0x, $$2, this.dA()).orElseGet(() -> {
               gv $$1x = $$0x.c();
               return new ehf((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            ehf $$4 = ehf.c($$0x).d($$3).d();
            float $$5 = (float)aro.d(aro.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.e($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      ehf $$0 = this.di();
      this.b(bji.a);
      this.e($$0.c, $$0.d, $$0.e);
      this.fA();
   }

   @Nullable
   public hb fD() {
      gv $$0 = this.fz().orElse(null);
      return $$0 != null ? csd.a(this.dK(), $$0) : null;
   }

   @Override
   public boolean bw() {
      return !this.fB() && super.bw();
   }

   @Override
   protected final float a(bji $$0, bih $$1) {
      return $$0 == bji.c ? 0.2F : this.b($$0, $$1);
   }

   protected float b(bji $$0, bih $$1) {
      return super.a($$0, $$1);
   }

   public ciw g(ciw $$0) {
      return ciw.b;
   }

   public ciw a(cpk $$0, ciw $$1) {
      if ($$1.M()) {
         $$0.a(null, this.dp(), this.dr(), this.dv(), this.d($$1), aov.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$1, $$0, this);
         if (!(this instanceof cbl) || !((cbl)this).fR().d) {
            $$1.h(1);
         }

         this.a(dji.m);
      }

      return $$1;
   }

   private void a(ciw $$0, cpk $$1, biw $$2) {
      cir $$3 = $$0.d();
      if ($$3.u()) {
         for (Pair<bht, Float> $$5 : $$3.v().f()) {
            if (!$$1.B && $$5.getFirst() != null && $$1.z.i() < (Float)$$5.getSecond()) {
               $$2.b(new bht((bht)$$5.getFirst()));
            }
         }
      }
   }

   private static byte g(bil $$0) {
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

   public void d(bil $$0) {
      this.dK().a(this, g($$0));
   }

   public void d(bgn $$0) {
      this.d($$0 == bgn.a ? bil.a : bil.b);
   }

   @Override
   public eha k_() {
      if (this.c(bil.f).a(ciz.tw)) {
         float $$0 = 0.5F;
         return this.cG().c(0.5, 0.5, 0.5);
      } else {
         return super.k_();
      }
   }

   public static bil h(ciw $$0) {
      chx $$1 = chx.c_($$0);
      return $$1 != null ? $$1.g() : bil.a;
   }

   private static bjp a(biw $$0, bil $$1) {
      return $$1 != bil.f && $$1 != bil.a && $$1 != bil.b ? bjp.a($$0, $$1, $$1x -> $$1x.b() || biy.h($$1x) == $$1) : bjp.a($$0, $$1);
   }

   @Nullable
   private static bil r(int $$0) {
      if ($$0 == 100 + bil.f.b()) {
         return bil.f;
      } else if ($$0 == 100 + bil.e.b()) {
         return bil.e;
      } else if ($$0 == 100 + bil.d.b()) {
         return bil.d;
      } else if ($$0 == 100 + bil.c.b()) {
         return bil.c;
      } else if ($$0 == 98) {
         return bil.a;
      } else {
         return $$0 == 99 ? bil.b : null;
      }
   }

   @Override
   public bjp a_(int $$0) {
      bil $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dy() {
      if (this.G_()) {
         return false;
      } else {
         boolean $$0 = !this.c(bil.f).a(apr.az) && !this.c(bil.e).a(apr.az) && !this.c(bil.d).a(apr.az) && !this.c(bil.c).a(apr.az);
         return $$0 && super.dy();
      }
   }

   @Override
   public boolean cc() {
      return !this.dK().r_() && this.a(bhv.x) || super.cc();
   }

   @Override
   public float dB() {
      return this.aU;
   }

   @Override
   public void a(wp $$0) {
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

   public boolean fE() {
      return this.eR().d() instanceof cgl;
   }

   @Override
   public float dE() {
      float $$0 = super.dE();
      return this.cN() instanceof cbl ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public ehf m(big $$0) {
      return new ehf(this.a($$0, this.a(this.an()), this.dX()).rotateY(-this.aU * (float) (Math.PI / 180.0))).e(this.di());
   }

   @Override
   public float k(big $$0) {
      return this.l($$0) * this.dX();
   }

   protected void a(int $$0, double $$1) {
      this.aW = (float)aro.e(1.0 / (double)$$0, (double)this.aW, $$1);
   }

   public static record a(aot a, aot b) {
   }
}
