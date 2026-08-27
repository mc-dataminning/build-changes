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

public abstract class biy extends bii implements big {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final bkd bA = new bkd(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, bkd.a.c);
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
   protected static final adz<Byte> t = aec.a(biy.class, aeb.a);
   private static final adz<Float> bH = aec.a(biy.class, aeb.d);
   private static final adz<Integer> bI = aec.a(biy.class, aeb.b);
   private static final adz<Boolean> bJ = aec.a(biy.class, aeb.k);
   private static final adz<Integer> bK = aec.a(biy.class, aeb.b);
   private static final adz<Integer> bL = aec.a(biy.class, aeb.b);
   private static final adz<Optional<gu>> bM = aec.a(biy.class, aeb.o);
   protected static final float u = 1.74F;
   protected static final bij v = bij.c(0.2F, 0.2F);
   public static final float aE = 0.5F;
   private static final int bN = 50;
   private final bkc bO;
   private final bhd bP = new bhd(this);
   private final Map<bht, bhv> bQ = Maps.newHashMap();
   private final hn<ciy> bR = hn.a(2, ciy.b);
   private final hn<ciy> bS = hn.a(4, ciy.b);
   public boolean aF;
   private boolean bT = false;
   public bgp aG;
   public int aH;
   public int aI;
   public int aJ;
   public int aK;
   public int aL;
   public int aM;
   public float aN;
   public float aO;
   protected int aP;
   public final bjy aQ = new bjy();
   public final int aR = 20;
   public final float aS;
   public final float aT;
   public float aU;
   public float aV;
   public float aW;
   public float aX;
   @Nullable
   protected cbn aY;
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
   private biy bV;
   private int bW;
   private biy bX;
   private int bY;
   private float bZ;
   private int ca;
   private float cb;
   protected ciy bv = ciy.b;
   protected int bw;
   protected int bx;
   private gu cc;
   private Optional<gu> cd = Optional.empty();
   @Nullable
   private bhg ce;
   private long cf;
   protected int by;
   private float cg;
   private float ch;
   protected bjz<?> bz;
   private boolean ci;

   protected biy(bim<? extends biy> $$0, cpm $$1) {
      super($$0, $$1);
      this.bO = new bkc(bkg.a($$0));
      this.c(this.eK());
      this.I = true;
      this.aT = (float)((Math.random() + 1.0) * 0.01F);
      this.ap();
      this.aS = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.aW = this.dA();
      this.t(0.6F);
      rc $$2 = rc.a;
      this.bz = this.a(new Dynamic($$2, (rk)$$2.createMap(ImmutableMap.of($$2.a("memories"), (rk)$$2.emptyMap()))));
   }

   public bjz<?> dM() {
      return this.bz;
   }

   protected bjz.b<?> dN() {
      return bjz.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bjz<?> a(Dynamic<?> $$0) {
      return this.dN().a($$0);
   }

   @Override
   public void aj() {
      this.a(this.dL().w(), Float.MAX_VALUE);
   }

   public boolean a(bim<?> $$0) {
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

   public static bke.a dO() {
      return bke.a().a(bkf.a).a(bkf.c).a(bkf.d).a(bkf.i).a(bkf.j).a(bkf.l);
   }

   @Override
   protected void a(double $$0, boolean $$1, dfa $$2, gu $$3) {
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
         gu $$7 = this.dk();
         if ($$3.u() != $$7.u() || $$3.w() != $$7.w()) {
            double $$8 = $$4 - (double)$$3.u() - 0.5;
            double $$9 = $$6 - (double)$$3.w() - 0.5;
            double $$10 = Math.max(Math.abs($$8), Math.abs($$9));
            $$4 = (double)$$3.u() + 0.5 + $$8 / $$10 * 0.5;
            $$6 = (double)$$3.w() + 0.5 + $$9 / $$10 * 0.5;
         }

         float $$11 = (float)arp.f(this.ab - 3.0F);
         double $$12 = Math.min((double)(0.2F + $$11 / 15.0F), 2.5);
         int $$13 = (int)(150.0 * $$12);
         ((akk)this.dK()).a(new in(iv.c, $$2), $$4, $$5, $$6, $$13, 0.0, 0.0, 0.0, 0.15F);
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cd = Optional.empty();
      }
   }

   public boolean dP() {
      return this.eQ() == bjd.b;
   }

   public float a(float $$0) {
      return arp.i($$0, this.ch, this.cg);
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
         boolean $$0 = this instanceof cbn;
         if (!this.dK().B) {
            if (this.bw()) {
               this.a(this.dL().f(), 1.0F);
            } else if ($$0 && !this.dK().w_().a(this.cG())) {
               double $$1 = this.dK().w_().a(this) + this.dK().w_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dK().w_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dL().v(), (float)Math.max(1, arp.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(apq.a) && !this.dK().a_(gu.a(this.dp(), this.dt(), this.dv())).a(csn.nd)) {
            boolean $$3 = !this.dP() && !bhw.c(this) && (!$$0 || !((cbn)this).fR().a);
            if ($$3) {
               this.j(this.m(this.ch()));
               if (this.ch() == -20) {
                  this.j(0);
                  ehe $$4 = this.dn();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.ag.j() - this.ag.j();
                     double $$7 = this.ag.j() - this.ag.j();
                     double $$8 = this.ag.j() - this.ag.j();
                     this.dK().a(iv.e, this.dp() + $$6, this.dr() + $$7, this.dv() + $$8, $$4.c, $$4.d, $$4.e);
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
            gu $$9 = this.dk();
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

      if (this.al > 0 && !(this instanceof akl)) {
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

      this.el();
      this.bf = this.be;
      this.aV = this.aU;
      this.aX = this.aW;
      this.N = this.dA();
      this.O = this.dC();
      this.dK().ad().c();
   }

   public boolean dQ() {
      return this.ah % 5 == 0 && this.dn().c != 0.0 && this.dn().e != 0.0 && !this.G_() && cnh.k(this) && this.dS();
   }

   protected void dR() {
      ehe $$0 = this.dn();
      this.dK()
         .a(
            iv.I,
            this.dp() + (this.ag.j() - 0.5) * (double)this.df(),
            this.dr() + 0.1,
            this.dv() + (this.ag.j() - 0.5) * (double)this.df(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.ag.i() * 0.4F + this.ag.i() > 0.9F ? 0.6F : 0.0F;
      this.a(aow.wd, $$1, 0.6F + this.ag.i() * 0.4F);
   }

   protected boolean dS() {
      return this.dK().a_(this.aG()).a(apl.aM);
   }

   @Override
   protected float aJ() {
      return this.dS() && cnh.a(cnj.l, this) > 0 ? 1.0F : super.aJ();
   }

   @Override
   protected boolean c(dfa $$0) {
      return !$$0.i() || this.fu();
   }

   protected void dT() {
      bkb $$0 = this.a(bkf.d);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void dU() {
      if (!this.bh().i()) {
         int $$0 = cnh.a(cnj.l, this);
         if ($$0 > 0 && this.dS()) {
            bkb $$1 = this.a(bkf.d);
            if ($$1 == null) {
               return;
            }

            $$1.b(new bkd(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), bkd.a.a));
            if (this.ee().i() < 0.04F) {
               ciy $$2 = this.c(bin.c);
               $$2.a(1, this, $$0x -> $$0x.d(bin.c));
            }
         }
      }
   }

   protected void dV() {
      bkb $$0 = this.a(bkf.d);
      if ($$0 != null) {
         if ($$0.a(e) != null) {
            $$0.b(e);
         }
      }
   }

   protected void dW() {
      if (!this.bh().i()) {
         int $$0 = this.ci();
         if ($$0 > 0) {
            bkb $$1 = this.a(bkf.d);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cj();
            $$1.b(new bkd(e, "Powder snow slow", (double)$$2, bkd.a.a));
         }
      }
   }

   protected void c(gu $$0) {
      int $$1 = cnh.a(cnj.j, this);
      if ($$1 > 0) {
         cnm.a(this, this.dK(), $$0, $$1);
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
         this.a(bii.c.a);
      }
   }

   public boolean ea() {
      return !this.i_();
   }

   protected boolean eb() {
      return !this.i_();
   }

   protected int m(int $$0) {
      int $$1 = cnh.e(this);
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

   public aru ee() {
      return this.ag;
   }

   @Nullable
   public biy ef() {
      return this.bV;
   }

   @Override
   public biy M_() {
      return this.ef();
   }

   public int eg() {
      return this.bW;
   }

   public void c(@Nullable cbn $$0) {
      this.aY = $$0;
      this.aZ = this.ah;
   }

   public void a(@Nullable biy $$0) {
      this.bV = $$0;
      this.bW = this.ah;
   }

   @Nullable
   public biy eh() {
      return this.bX;
   }

   public int ei() {
      return this.bY;
   }

   public void A(bii $$0) {
      if ($$0 instanceof biy) {
         this.bX = (biy)$$0;
      } else {
         this.bX = null;
      }

      this.bY = this.ah;
   }

   public int ej() {
      return this.bb;
   }

   public void o(int $$0) {
      this.bb = $$0;
   }

   public boolean ek() {
      return this.bT;
   }

   public void p(boolean $$0) {
      this.bT = $$0;
   }

   protected boolean a(bin $$0) {
      return true;
   }

   public void a(bin $$0, ciy $$1, ciy $$2) {
      boolean $$3 = $$2.b() && $$1.b();
      if (!$$3 && !ciy.c($$1, $$2) && !this.am) {
         chz $$4 = chz.c_($$2);
         if (!this.dK().r_() && !this.G_()) {
            if (!this.aS() && $$4 != null && $$4.g() == $$0) {
               this.dK().a(null, this.dp(), this.dr(), this.dv(), $$4.ak_(), this.da(), 1.0F, 1.0F);
            }

            if (this.a($$0)) {
               this.a($$4 != null ? djk.v : djk.S);
            }
         }
      }
   }

   @Override
   public void a(bii.c $$0) {
      super.a($$0);
      this.bz.a();
   }

   @Override
   public void b(qr $$0) {
      $$0.a("Health", this.et());
      $$0.a("HurtTime", (short)this.aK);
      $$0.a("HurtByTimestamp", this.bW);
      $$0.a("DeathTime", (short)this.aM);
      $$0.a("AbsorptionAmount", this.fi());
      $$0.a("Attributes", this.eP().c());
      if (!this.bQ.isEmpty()) {
         qx $$1 = new qx();

         for (bhv $$2 : this.bQ.values()) {
            $$1.add($$2.a(new qr()));
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fu());
      this.fz().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<rk> $$3 = this.bz.a(rc.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(qr $$0) {
      this.y($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dK() != null && !this.dK().B) {
         this.eP().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         qx $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            qr $$3 = $$1.a($$2);
            bhv $$4 = bhv.b($$3);
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
         eib $$6 = this.dK().I().d($$5);
         boolean $$7 = $$6 != null && this.dK().I().a(this.cw(), $$6);
         if (!$$7) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         gu $$8 = new gu($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$8);
         this.an.b(as, bjk.c);
         if (!this.am) {
            this.a($$8);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bz = this.a(new Dynamic(rc.a, $$0.c("Brain")));
      }
   }

   protected void el() {
      Iterator<bht> $$0 = this.bQ.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            bht $$1 = $$0.next();
            bhv $$2 = this.bQ.get($$1);
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

      if (this.bU) {
         if (!this.dK().B) {
            this.G();
            this.p();
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
            this.dK().a($$4 ? iv.a : iv.v, this.d(0.5), this.ds(), this.g(0.5), $$7, $$8, $$9);
         }
      }
   }

   protected void G() {
      if (this.bQ.isEmpty()) {
         this.eo();
         this.j(false);
      } else {
         Collection<bhv> $$0 = this.bQ.values();
         this.an.b(bJ, c($$0));
         this.an.b(bI, ckx.a($$0));
         this.j(this.a(bhx.n));
      }
   }

   private void p() {
      boolean $$0 = this.cc();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable bii $$0) {
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
         ciy $$3 = this.c(bin.f);
         bim<?> $$4 = $$0.ag();
         if ($$4 == bim.aJ && $$3.a(cjb.tr)
            || $$4 == bim.bp && $$3.a(cjb.tu)
            || $$4 == bim.aw && $$3.a(cjb.tx)
            || $$4 == bim.ax && $$3.a(cjb.tx)
            || $$4 == bim.u && $$3.a(cjb.tv)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(biy $$0) {
      return $$0 instanceof cbn && this.dK().ai() == bgn.a ? false : $$0.em();
   }

   public boolean a(biy $$0, btl $$1) {
      return $$1.a(this, $$0);
   }

   public boolean em() {
      return !this.cq() && this.en();
   }

   public boolean en() {
      return !this.G_() && this.bv();
   }

   public static boolean c(Collection<bhv> $$0) {
      for (bhv $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void eo() {
      this.an.b(bJ, false);
      this.an.b(bI, 0);
   }

   public boolean ep() {
      if (this.dK().B) {
         return false;
      } else {
         Iterator<bhv> $$0 = this.bQ.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<bhv> eq() {
      return this.bQ.values();
   }

   public Map<bht, bhv> er() {
      return this.bQ;
   }

   public boolean a(bht $$0) {
      return this.bQ.containsKey($$0);
   }

   @Nullable
   public bhv b(bht $$0) {
      return this.bQ.get($$0);
   }

   public final boolean b(bhv $$0) {
      return this.b($$0, null);
   }

   public boolean b(bhv $$0, @Nullable bii $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         bhv $$2 = this.bQ.get($$0.c());
         if ($$2 == null) {
            this.bQ.put($$0.c(), $$0);
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

   public boolean c(bhv $$0) {
      if (this.eQ() == bjd.b) {
         bht $$1 = $$0.c();
         if ($$1 == bhx.j || $$1 == bhx.s) {
            return false;
         }
      }

      return true;
   }

   public void c(bhv $$0, @Nullable bii $$1) {
      if (this.c($$0)) {
         bhv $$2 = this.bQ.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean es() {
      return this.eQ() == bjd.b;
   }

   @Nullable
   public bhv c(@Nullable bht $$0) {
      return this.bQ.remove($$0);
   }

   public boolean d(bht $$0) {
      bhv $$1 = this.c($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(bhv $$0, @Nullable bii $$1) {
      this.bU = true;
      if (!this.dK().B) {
         $$0.c().a(this.eP(), $$0.e());
         this.d($$0);
      }
   }

   public void d(bhv $$0) {
      for (bii $$1 : this.cP()) {
         if ($$1 instanceof akl $$2) {
            $$2.c.b(new aar(this.ah(), $$0));
         }
      }
   }

   protected void a(bhv $$0, boolean $$1, @Nullable bii $$2) {
      this.bU = true;
      if ($$1 && !this.dK().B) {
         bht $$3 = $$0.c();
         $$3.a(this.eP());
         $$3.a(this.eP(), $$0.e());
         this.r();
      }

      if (!this.dK().B) {
         this.d($$0);
      }
   }

   protected void a(bhv $$0) {
      this.bU = true;
      if (!this.dK().B) {
         $$0.c().a(this.eP());
         this.r();

         for (bii $$1 : this.cP()) {
            if ($$1 instanceof akl $$2) {
               $$2.c.b(new yz(this.ah(), $$0.c()));
            }
         }
      }
   }

   private void r() {
      for (bkb $$0 : this.eP().a()) {
         this.d($$0.a());
      }
   }

   private void d(bka $$0) {
      if ($$0 == bkf.a) {
         float $$1 = this.eK();
         if (this.et() > $$1) {
            this.c($$1);
         }
      } else if ($$0 == bkf.l) {
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
      return this.an.b(bH);
   }

   public void c(float $$0) {
      this.an.b(bH, arp.a($$0, 0.0F, this.eK()));
   }

   public boolean eu() {
      return this.et() <= 0.0F;
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dK().B) {
         return false;
      } else if (this.eu()) {
         return false;
      } else if ($$0.a(apn.i) && this.a(bhx.l)) {
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
            if (!$$0.a(apn.j) && $$0.c() instanceof biy $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(apn.o) && this.ag().a(apo.j)) {
            $$1 *= 5.0F;
         }

         this.aQ.a(1.5F);
         boolean $$7 = true;
         if ((float)this.al > 10.0F && !$$0.a(apn.e)) {
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

         if ($$0.a(apn.a) && !this.c(bin.f).b()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         bii $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof biy $$9 && !$$0.a(apn.q)) {
               this.a($$9);
            }

            if ($$8 instanceof cbn $$10) {
               this.aZ = 100;
               this.aY = $$10;
            } else if ($$8 instanceof bvn $$11 && $$11.p()) {
               this.aZ = 100;
               if ($$11.I_() instanceof cbn $$12) {
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

            if (!$$0.a(apn.r) && (!$$3 || $$1 > 0.0F)) {
               this.bo();
            }

            if ($$8 != null && !$$0.a(apn.z)) {
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
               aov $$15 = this.h_();
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
            this.ce = $$0;
            this.cf = this.dK().V();
         }

         if (this instanceof akl) {
            ai.h.a((akl)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((akl)this).a(apg.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof akl) {
            ai.g.a((akl)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$16;
      }
   }

   protected void d(biy $$0) {
      $$0.e(this);
   }

   protected void e(biy $$0) {
      $$0.q(0.5, $$0.dp() - this.dp(), $$0.dv() - this.dv());
   }

   private boolean h(bhg $$0) {
      if ($$0.a(apn.d)) {
         return false;
      } else {
         ciy $$1 = null;

         for (bgp $$2 : bgp.values()) {
            ciy $$3 = this.b($$2);
            if ($$3.a(cjb.uz)) {
               $$1 = $$3.p();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof akl $$4) {
               $$4.b(apg.c.b(cjb.uz));
               ai.B.a($$4, $$1);
               this.a(djk.C);
            }

            this.c(1.0F);
            this.ep();
            this.b(new bhv(bhx.j, 900, 1));
            this.b(new bhv(bhx.v, 100, 1));
            this.b(new bhv(bhx.l, 800, 0));
            this.dK().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bhg ev() {
      if (this.dK().V() - this.cf > 40L) {
         this.ce = null;
      }

      return this.ce;
   }

   protected void e(bhg $$0) {
      aov $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eU(), this.eV());
      }
   }

   public boolean f(bhg $$0) {
      bii $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cbt $$3 && $$3.w() > 0) {
         $$2 = true;
      }

      if (!$$0.a(apn.c) && this.fs() && !$$2) {
         ehe $$4 = $$0.h();
         if ($$4 != null) {
            ehe $$5 = this.f(1.0F);
            ehe $$6 = $$4.a(this.di()).d();
            $$6 = new ehe($$6.c, 0.0, $$6.e);
            if ($$6.b($$5) < 0.0) {
               return true;
            }
         }
      }

      return false;
   }

   private void i(ciy $$0) {
      if (!$$0.b()) {
         if (!this.aS()) {
            this.dK().a(this.dp(), this.dr(), this.dv(), aow.lZ, this.da(), 0.8F, 0.8F + this.dK().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bhg $$0) {
      if (!this.dF() && !this.ba) {
         bii $$1 = $$0.d();
         biy $$2 = this.eJ();
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
         if (this.dK() instanceof akk $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(djk.p);
               this.g($$0);
               this.f($$2);
            }

            this.dK().a(this, (byte)3);
         }

         this.b(bjk.h);
      }
   }

   protected void f(@Nullable biy $$0) {
      if (!this.dK().B) {
         boolean $$1 = false;
         if ($$0 instanceof bxu) {
            if (this.dK().X().b(cpi.c)) {
               gu $$2 = this.dk();
               dfa $$3 = csn.cd.n();
               if (this.dK().a_($$2).i() && $$3.a((cpp)this.dK(), $$2)) {
                  this.dK().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               byg $$4 = new byg(this.dK(), this.dp(), this.dr(), this.dv(), new ciy(cjb.da));
               this.dK().b($$4);
            }
         }
      }
   }

   protected void g(bhg $$0) {
      bii $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof cbn) {
         $$2 = cnh.h((biy)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.aZ > 0;
      if (this.eb() && this.dK().X().b(cpi.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.ew();
      this.ex();
   }

   protected void ew() {
   }

   protected void ex() {
      if (this.dK() instanceof akk && !this.eB() && (this.ed() || this.aZ > 0 && this.ea() && this.dK().X().b(cpi.f))) {
         bio.a((akk)this.dK(), this.di(), this.ec());
      }
   }

   protected void a(bhg $$0, int $$1, boolean $$2) {
   }

   public aer ey() {
      return this.ag().j();
   }

   public long ez() {
      return 0L;
   }

   protected void a(bhg $$0, boolean $$1) {
      aer $$2 = this.ey();
      ecp $$3 = this.dK().n().aH().getLootTable($$2);
      ecn.a $$4 = new ecn.a((akk)this.dK()).a(ees.a, this).a(ees.f, this.di()).a(ees.c, $$0).b(ees.d, $$0.d()).b(ees.e, $$0.c());
      if ($$1 && this.aY != null) {
         $$4 = $$4.a(ees.b, this.aY).a(this.aY.gm());
      }

      ecn $$5 = $$4.a(eer.g);
      $$3.a($$5, this.ez(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.b(bkf.c);
      if (!($$0 <= 0.0)) {
         this.au = true;
         ehe $$3 = this.dn();
         ehe $$4 = new ehe($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aA() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected aov d(bhg $$0) {
      return aow.iZ;
   }

   @Nullable
   protected aov h_() {
      return aow.iU;
   }

   private aov d(int $$0) {
      return $$0 > 4 ? this.eE().b() : this.eE().a();
   }

   public void eA() {
      this.ci = true;
   }

   public boolean eB() {
      return this.ci;
   }

   protected ehe eC() {
      return this.cY() instanceof bjo $$0 ? this.di().b(0.0, $$0.d(), 0.0) : this.di();
   }

   public float eD() {
      return 0.0F;
   }

   public biy.a eE() {
      return new biy.a(aow.ja, aow.iS);
   }

   protected aov c(ciy $$0) {
      return $$0.N();
   }

   public aov d(ciy $$0) {
      return $$0.O();
   }

   public Optional<gu> eF() {
      return this.cd;
   }

   public boolean j_() {
      if (this.G_()) {
         return false;
      } else {
         gu $$0 = this.dk();
         dfa $$1 = this.dl();
         if ($$1.a(apl.aO)) {
            this.cd = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof daz && this.c($$0, $$1)) {
            this.cd = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(gu $$0, dfa $$1) {
      if ($$1.c(daz.a)) {
         dfa $$2 = this.dK().a_($$0.d());
         if ($$2.a(csn.cO) && $$2.c(cwp.a) == $$1.c(daz.aC)) {
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
   public boolean a(float $$0, float $$1, bhg $$2) {
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
      if (this.ag().a(apo.l)) {
         return 0;
      } else {
         bhv $$2 = this.b(bhx.h);
         float $$3 = $$2 == null ? 0.0F : (float)($$2.e() + 1);
         return arp.f(($$0 - 3.0F - $$3) * $$1);
      }
   }

   protected void eG() {
      if (!this.aS()) {
         int $$0 = arp.a(this.dp());
         int $$1 = arp.a(this.dr() - 0.2F);
         int $$2 = arp.a(this.dv());
         dfa $$3 = this.dK().a_(new gu($$0, $$1, $$2));
         if (!$$3.i()) {
            czz $$4 = $$3.w();
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
      return arp.a(this.b(bkf.i));
   }

   protected void b(bhg $$0, float $$1) {
   }

   protected void c(bhg $$0, float $$1) {
   }

   protected void u(float $$0) {
   }

   protected float d(bhg $$0, float $$1) {
      if (!$$0.a(apn.b)) {
         this.b($$0, $$1);
         $$1 = bhc.a($$1, (float)this.eH(), (float)this.b(bkf.j));
      }

      return $$1;
   }

   protected float e(bhg $$0, float $$1) {
      if ($$0.a(apn.f)) {
         return $$1;
      } else {
         if (this.a(bhx.k) && !$$0.a(apn.g)) {
            int $$2 = (this.b(bhx.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof akl) {
                  ((akl)this).a(apg.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof akl) {
                  ((akl)$$0.d()).a(apg.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(apn.h)) {
            return $$1;
         } else {
            int $$7 = cnh.a(this.bK(), $$0);
            if ($$7 > 0) {
               $$1 = bhc.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bhg $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fi(), 0.0F);
         this.y(this.fi() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof akl $$4) {
            $$4.a(apg.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eI().a($$0, var9);
            this.c(this.et() - var9);
            this.y(this.fi() - var9);
            this.a(djk.o);
         }
      }
   }

   public bhd eI() {
      return this.bP;
   }

   @Nullable
   public biy eJ() {
      if (this.aY != null) {
         return this.aY;
      } else {
         return this.bV != null ? this.bV : null;
      }
   }

   public final float eK() {
      return (float)this.b(bkf.a);
   }

   public final float eL() {
      return (float)this.b(bkf.l);
   }

   public final int eM() {
      return this.an.b(bK);
   }

   public final void p(int $$0) {
      this.an.b(bK, $$0);
   }

   public final int eN() {
      return this.an.b(bL);
   }

   public final void q(int $$0) {
      this.an.b(bL, $$0);
   }

   private int w() {
      if (bhw.a(this)) {
         return 6 - (1 + bhw.b(this));
      } else {
         return this.a(bhx.d) ? 6 + (1 + this.b(bhx.d).e()) * 2 : 6;
      }
   }

   public void a(bgp $$0) {
      this.a($$0, false);
   }

   public void a(bgp $$0, boolean $$1) {
      if (!this.aF || this.aH >= this.w() / 2 || this.aH < 0) {
         this.aH = -1;
         this.aF = true;
         this.aG = $$0;
         if (this.dK() instanceof akk) {
            wt $$2 = new wt(this, $$0 == bgp.a ? 0 : 3);
            aki $$3 = ((akk)this.dK()).k();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bhg $$0) {
      this.aQ.a(1.5F);
      this.al = 20;
      this.aL = 10;
      this.aK = this.aL;
      aov $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eU(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
      }

      this.a(this.dL().n(), 0.0F);
      this.ce = $$0;
      this.cf = this.dK().V();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            aov $$1 = this.h_();
            if ($$1 != null) {
               this.a($$1, this.eU(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cbn)) {
               this.c(0.0F);
               this.a(this.dL().n());
            }
            break;
         case 29:
            this.a(aow.uQ, 1.0F, 0.8F + this.dK().z.i() * 0.4F);
            break;
         case 30:
            this.a(aow.uR, 0.8F, 0.8F + this.dK().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ag.i() - 0.5F) * 0.2F;
               float $$6 = (this.ag.i() - 0.5F) * 0.2F;
               float $$7 = (this.ag.i() - 0.5F) * 0.2F;
               double $$8 = arp.d($$4, this.K, this.dp()) + (this.ag.j() - 0.5) * (double)this.df() * 2.0;
               double $$9 = arp.d($$4, this.L, this.dr()) + this.ag.j() * (double)this.dg();
               double $$10 = arp.d($$4, this.M, this.dv()) + (this.ag.j() - 0.5) * (double)this.df() * 2.0;
               this.dK().a(iv.X, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.c(bin.a));
            break;
         case 48:
            this.i(this.c(bin.b));
            break;
         case 49:
            this.i(this.c(bin.f));
            break;
         case 50:
            this.i(this.c(bin.e));
            break;
         case 51:
            this.i(this.c(bin.d));
            break;
         case 52:
            this.i(this.c(bin.c));
            break;
         case 54:
            cwd.b(this);
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
         this.dK().a(iv.W, this.d(1.0), this.ds(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void y() {
      ciy $$0 = this.c(bin.b);
      this.a(bin.b, this.c(bin.a));
      this.a(bin.a, $$0);
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
   public bkb a(bka $$0) {
      return this.eP().a($$0);
   }

   public double a(he<bka> $$0) {
      return this.b($$0.a());
   }

   public double b(bka $$0) {
      return this.eP().c($$0);
   }

   public double b(he<bka> $$0) {
      return this.c($$0.a());
   }

   public double c(bka $$0) {
      return this.eP().d($$0);
   }

   public bkc eP() {
      return this.bO;
   }

   public bjd eQ() {
      return bjd.a;
   }

   public ciy eR() {
      return this.c(bin.a);
   }

   public ciy eS() {
      return this.c(bin.b);
   }

   public boolean b(cit $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<ciy> $$0) {
      return $$0.test(this.eR()) || $$0.test(this.eS());
   }

   public ciy b(bgp $$0) {
      if ($$0 == bgp.a) {
         return this.c(bin.a);
      } else if ($$0 == bgp.b) {
         return this.c(bin.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bgp $$0, ciy $$1) {
      if ($$0 == bgp.a) {
         this.a(bin.a, $$1);
      } else {
         if ($$0 != bgp.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bin.b, $$1);
      }
   }

   public boolean b(bin $$0) {
      return !this.c($$0).b();
   }

   @Override
   public abstract Iterable<ciy> bK();

   public abstract ciy c(bin var1);

   @Override
   public abstract void a(bin var1, ciy var2);

   protected void e(ciy $$0) {
      qr $$1 = $$0.v();
      if ($$1 != null) {
         $$0.d().b($$1);
      }
   }

   public float eT() {
      Iterable<ciy> $$0 = this.bK();
      int $$1 = 0;
      int $$2 = 0;

      for (ciy $$3 : $$0) {
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
      bkb $$1 = this.a(bkf.d);
      $$1.b(bA.a());
      if ($$0) {
         $$1.b(bA);
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
   public void g(bii $$0) {
      if (!this.fB()) {
         super.g($$0);
      }
   }

   private void a(bii $$0) {
      ehe $$1;
      if (this.dF()) {
         $$1 = this.di();
      } else if (!$$0.dF() && !this.dK().a_($$0.dk()).a(apl.aI)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dr(), $$0.dr());
         $$1 = new ehe(this.dp(), $$2, this.dv());
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
      return this.a(bhx.h) ? 0.1F * ((float)this.b(bhx.h).e() + 1.0F) : 0.0F;
   }

   protected void eZ() {
      ehe $$0 = this.dn();
      this.o($$0.c, (double)this.eX(), $$0.e);
      if (this.bX()) {
         float $$1 = this.dA() * (float) (Math.PI / 180.0);
         this.f(this.dn().b((double)(-arp.a($$1) * 0.2F), 0.0, (double)(arp.b($$1) * 0.2F)));
      }

      this.au = true;
   }

   protected void fa() {
      this.f(this.dn().b(0.0, -0.04F, 0.0));
   }

   protected void c(aqa<eac> $$0) {
      this.f(this.dn().b(0.0, 0.04F, 0.0));
   }

   protected float fb() {
      return 0.8F;
   }

   public boolean a(ead $$0) {
      return false;
   }

   public void h(ehe $$0) {
      if (this.cW()) {
         double $$1 = 0.08;
         boolean $$2 = this.dn().d <= 0.0;
         if ($$2 && this.a(bhx.B)) {
            $$1 = 0.01;
         }

         ead $$3 = this.dK().b_(this.dk());
         if (this.aX() && this.dY() && !this.a($$3)) {
            double $$4 = this.dr();
            float $$5 = this.bX() ? 0.9F : this.fb();
            float $$6 = 0.02F;
            float $$7 = (float)cnh.f(this);
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

            if (this.a(bhx.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(bje.a, this.dn());
            ehe $$8 = this.dn();
            if (this.P && this.j_()) {
               $$8 = new ehe($$8.c, 0.2, $$8.e);
            }

            this.f($$8.d((double)$$5, 0.8F, (double)$$5));
            ehe $$9 = this.a($$1, $$2, this.dn());
            this.f($$9);
            if (this.P && this.g($$9.c, $$9.d + 0.6F - this.dr() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bl() && this.dY() && !this.a($$3)) {
            double $$10 = this.dr();
            this.a(0.02F, $$0);
            this.a(bje.a, this.dn());
            if (this.b(apq.b) <= this.de()) {
               this.f(this.dn().d(0.5, 0.8F, 0.5));
               ehe $$11 = this.a($$1, $$2, this.dn());
               this.f($$11);
            } else {
               this.f(this.dn().a(0.5));
            }

            if (!this.aT()) {
               this.f(this.dn().b(0.0, -$$1 / 4.0, 0.0));
            }

            ehe $$12 = this.dn();
            if (this.P && this.g($$12.c, $$12.d + 0.6F - this.dr() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fu()) {
            this.cm();
            ehe $$13 = this.dn();
            ehe $$14 = this.bE();
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
               double $$21 = $$17 * (double)(-arp.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.f($$13.d(0.99F, 0.98F, 0.99F));
            this.a(bje.a, this.dn());
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
            gu $$25 = this.aG();
            float $$26 = this.dK().a_($$25).b().h();
            float $$27 = this.aA() ? $$26 * 0.91F : 0.91F;
            ehe $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.a(bhx.y)) {
               $$29 += (0.05 * (double)(this.b(bhx.y).e() + 1) - $$28.d) * 0.2;
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

      this.q(this instanceof but);
   }

   private void c(cbn $$0, ehe $$1) {
      ehe $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.cW()) {
         this.w(this.e($$0));
         this.h($$2);
      } else {
         this.q(false);
         this.f(ehe.b);
         this.aB();
      }
   }

   protected void a(cbn $$0, ehe $$1) {
   }

   protected ehe b(cbn $$0, ehe $$1) {
      return $$1;
   }

   protected float e(cbn $$0) {
      return this.fd();
   }

   public void q(boolean $$0) {
      float $$1 = (float)arp.g(this.dp() - this.K, $$0 ? this.dr() - this.L : 0.0, this.dv() - this.M);
      this.v($$1);
   }

   protected void v(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aQ.a($$1, 0.4F);
   }

   public ehe a(ehe $$0, float $$1) {
      this.a(this.A($$1), $$0);
      this.f(this.j(this.dn()));
      this.a(bje.a, this.dn());
      ehe $$2 = this.dn();
      if ((this.P || this.bj) && (this.j_() || this.dl().a(csn.qC) && cye.a(this))) {
         $$2 = new ehe($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public ehe a(double $$0, boolean $$1, ehe $$2) {
      if (!this.aT() && !this.bX()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new ehe($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private ehe j(ehe $$0) {
      if (this.j_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = arp.a($$0.c, -0.15F, 0.15F);
         double $$3 = arp.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dl().a(csn.nS) && this.ft() && this instanceof cbn) {
            $$4 = 0.0;
         }

         $$0 = new ehe($$2, $$4, $$3);
      }

      return $$0;
   }

   private float A(float $$0) {
      return this.aA() ? this.fd() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fc();
   }

   protected float fc() {
      return this.cN() instanceof cbn ? this.fd() * 0.1F : 0.02F;
   }

   public float fd() {
      return this.bZ;
   }

   public void w(float $$0) {
      this.bZ = $$0;
   }

   public boolean C(bii $$0) {
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
         float $$8 = (float)arp.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = arp.e(arp.g(this.dA()) - $$8);
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
      Map<bin, ciy> $$0 = this.A();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bin, ciy> A() {
      Map<bin, ciy> $$0 = null;

      for (bin $$1 : bin.values()) {
         ciy $$2;
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

         ciy $$5 = this.c($$1);
         if (this.a($$2, $$5)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bin.class);
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

   public boolean a(ciy $$0, ciy $$1) {
      return !ciy.a($$1, $$0);
   }

   private void a(Map<bin, ciy> $$0) {
      ciy $$1 = $$0.get(bin.a);
      ciy $$2 = $$0.get(bin.b);
      if ($$1 != null && $$2 != null && ciy.a($$1, this.f(bin.b)) && ciy.a($$2, this.f(bin.a))) {
         ((akk)this.dK()).k().b(this, new xs(this, (byte)55));
         $$0.remove(bin.a);
         $$0.remove(bin.b);
         this.c(bin.a, $$1.p());
         this.c(bin.b, $$2.p());
      }
   }

   private void b(Map<bin, ciy> $$0) {
      List<Pair<bin, ciy>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         ciy $$3 = $$2.p();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
         }
      });
      ((akk)this.dK()).k().b(this, new zu(this.ah(), $$1));
   }

   private ciy e(bin $$0) {
      return this.bS.get($$0.b());
   }

   private void b(bin $$0, ciy $$1) {
      this.bS.set($$0.b(), $$1);
   }

   private ciy f(bin $$0) {
      return this.bR.get($$0.b());
   }

   private void c(bin $$0, ciy $$1) {
      this.bR.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = arp.g($$0 - this.aU);
      this.aU += $$2 * 0.3F;
      float $$3 = arp.g(this.dA() - this.aU);
      if (Math.abs($$3) > 50.0F) {
         this.aU = this.aU + ($$3 - (float)(arp.j((double)$$3) * 50));
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

      ehe $$0 = this.dn();
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
            $$4 = this.b(apq.b);
         } else {
            $$4 = this.b(apq.a);
         }

         boolean $$6 = this.aX() && $$4 > 0.0;
         double $$7 = this.de();
         if (!$$6 || this.aA() && !($$4 > $$7)) {
            if (!this.bl() || this.aA() && !($$4 > $$7)) {
               if ((this.aA() || $$6 && $$4 <= $$7) && this.ca == 0) {
                  this.eZ();
                  this.ca = 10;
               }
            } else {
               this.c(apq.b);
            }
         } else {
            this.c(apq.a);
         }
      } else {
         this.ca = 0;
      }

      this.dK().ad().c();
      this.dK().ad().a("travel");
      this.bk *= 0.98F;
      this.bm *= 0.98F;
      this.B();
      egz $$8 = this.cG();
      ehe $$9 = new ehe((double)this.bk, (double)this.bl, (double)this.bm);
      if (this.a(bhx.B) || this.a(bhx.y)) {
         this.n();
      }

      label104: {
         if (this.cN() instanceof cbn $$10 && this.bv()) {
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
      if ($$0 && !this.aA() && !this.bN() && !this.a(bhx.y)) {
         ciy $$1 = this.c(bin.e);
         if ($$1.a(cjb.nh) && chs.d($$1)) {
            $$0 = true;
            int $$2 = this.bx + 1;
            if (!this.dK().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, $$0x -> $$0x.d(bin.e));
               }

               this.a(djk.n);
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
         this.dK().a(diy.a(cbn.class), this.cG(), bil.a(this)).forEach(this::D);
      } else {
         List<bii> $$0 = this.dK().a(this, this.cG(), bil.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dK().X().c(cpi.t);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ag.a(4) == 0) {
               int $$2 = 0;

               for (bii $$3 : $$0) {
                  if (!$$3.bN()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dL().g(), 6.0F);
               }
            }

            for (bii $$4 : $$0) {
               this.D($$4);
            }
         }
      }
   }

   protected void a(egz $$0, egz $$1) {
      egz $$2 = $$0.b($$1);
      List<bii> $$3 = this.dK().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bii $$4 : $$3) {
            if ($$4 instanceof biy) {
               this.g((biy)$$4);
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

   protected void D(bii $$0) {
      $$0.g(this);
   }

   protected void g(biy $$0) {
   }

   public boolean fh() {
      return (this.an.b(t) & 4) != 0;
   }

   @Override
   public void aa() {
      bii $$0 = this.cY();
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

   public void a(byg $$0) {
      bii $$1 = $$0.v();
      if ($$1 instanceof akl) {
         ai.O.a((akl)$$1, $$0.j(), this);
      }
   }

   public void a(bii $$0, int $$1) {
      if (!$$0.dF() && !this.dK().B && ($$0 instanceof byg || $$0 instanceof cbt || $$0 instanceof bio)) {
         ((akk)this.dK()).k().b($$0, new aan($$0.ah(), this.ah(), $$1));
      }
   }

   public boolean E(bii $$0) {
      if ($$0.dK() != this.dK()) {
         return false;
      } else {
         ehe $$1 = new ehe(this.dp(), this.dt(), this.dv());
         ehe $$2 = new ehe($$0.dp(), $$0.dt(), $$0.dv());
         return $$2.f($$1) > 128.0 ? false : this.dK().a(new cov($$1, $$2, cov.a.a, cov.b.a, this)).c() == ehc.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.aW : arp.i($$0, this.aX, this.aW);
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
   protected ehe a(ha.a $$0, l.a $$1) {
      return i(super.a($$0, $$1));
   }

   public static ehe i(ehe $$0) {
      return new ehe($$0.c, $$0.d, 0.0);
   }

   public float fi() {
      return this.cb;
   }

   public final void y(float $$0) {
      this.z(arp.a($$0, 0.0F, this.eL()));
   }

   protected void z(float $$0) {
      this.cb = $$0;
   }

   public void Q_() {
   }

   public void F_() {
   }

   protected void fj() {
      this.bU = true;
   }

   public abstract bis fk();

   public boolean fl() {
      return (this.an.b(t) & 1) > 0;
   }

   public bgp fm() {
      return (this.an.b(t) & 2) > 0 ? bgp.b : bgp.a;
   }

   private void D() {
      if (this.fl()) {
         if (ciy.b(this.b(this.fm()), this.bv)) {
            this.bv = this.b(this.fm());
            this.a(this.bv);
         } else {
            this.fr();
         }
      }
   }

   protected void a(ciy $$0) {
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
      ceb $$1 = this.bv.d().v();
      boolean $$2 = $$1 != null && $$1.e();
      $$2 |= $$0 <= this.bv.r() - 7;
      return $$2 && $$0 % 4 == 0;
   }

   private void F() {
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

   public void c(bgp $$0) {
      ciy $$1 = this.b($$0);
      if (!$$1.b() && !this.fl()) {
         this.bv = $$1;
         this.bw = $$1.r();
         if (!this.dK().B) {
            this.c(1, true);
            this.c(2, $$0 == bgp.b);
            this.a(djk.D);
         }
      }
   }

   @Override
   public void a(adz<?> $$0) {
      super.a($$0);
      if (bM.equals($$0)) {
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
            this.bv = ciy.b;
            this.bw = 0;
         }
      }
   }

   @Override
   public void a(eb.a $$0, ehe $$1) {
      super.a($$0, $$1);
      this.aX = this.aW;
      this.aU = this.aW;
      this.aV = this.aU;
   }

   protected void b(ciy $$0, int $$1) {
      if (!$$0.b() && this.fl()) {
         if ($$0.s() == ckr.c) {
            this.a(this.c($$0), 0.5F, this.dK().z.i() * 0.1F + 0.9F);
         }

         if ($$0.s() == ckr.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(ciy $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ehe $$3 = new ehe(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dC() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dA() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ag.i()) * 0.6 - 0.3;
         ehe $$5 = new ehe(((double)this.ag.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dC() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dA() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dp(), this.dt(), this.dv());
         this.dK().a(new ir(iv.O, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void Z_() {
      if (!this.dK().B || this.fl()) {
         bgp $$0 = this.fm();
         if (!this.bv.equals(this.b($$0))) {
            this.fq();
         } else {
            if (!this.bv.b() && this.fl()) {
               this.b(this.bv, 16);
               ciy $$1 = this.bv.a(this.dK(), this);
               if ($$1 != this.bv) {
                  this.a($$0, $$1);
               }

               this.fr();
            }
         }
      }
   }

   public ciy fn() {
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
            this.a(djk.C);
         }
      }

      this.bv = ciy.b;
      this.bw = 0;
   }

   public boolean fs() {
      if (this.fl() && !this.bv.b()) {
         cit $$0 = this.bv.d();
         return $$0.c(this.bv) != ckr.d ? false : $$0.b(this.bv) - this.bw >= 5;
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
      return super.bZ() || !this.fu() && this.c(bjk.b);
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
      gu $$9 = gu.a($$0, $$1, $$2);
      cpm $$10 = this.dK();
      if ($$10.A($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.C_()) {
            gu $$12 = $$9.d();
            dfa $$13 = $$10.a_($$12);
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

         if (this instanceof bjh) {
            ((bjh)this).H().n();
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

   public void a(gu $$0, boolean $$1) {
   }

   public boolean f(ciy $$0) {
      return false;
   }

   @Override
   public bij a(bjk $$0) {
      return $$0 == bjk.c ? v : super.a($$0).a(this.dX());
   }

   public ImmutableList<bjk> fy() {
      return ImmutableList.of(bjk.a);
   }

   public egz e(bjk $$0) {
      bij $$1 = this.a($$0);
      return new egz((double)(-$$1.a / 2.0F), 0.0, (double)(-$$1.a / 2.0F), (double)($$1.a / 2.0F), (double)$$1.b, (double)($$1.a / 2.0F));
   }

   protected boolean f(bjk $$0) {
      egz $$1 = this.a($$0).a(this.di());
      return this.dK().b(this, $$1);
   }

   @Override
   public boolean cs() {
      return super.cs() && !this.fB();
   }

   public Optional<gu> fz() {
      return this.an.b(bM);
   }

   public void g(gu $$0) {
      this.an.b(bM, Optional.of($$0));
   }

   public void fA() {
      this.an.b(bM, Optional.empty());
   }

   public boolean fB() {
      return this.fz().isPresent();
   }

   public void b(gu $$0) {
      if (this.bN()) {
         this.aa();
      }

      dfa $$1 = this.dK().a_($$0);
      if ($$1.b() instanceof csf) {
         this.dK().a($$0, $$1.a(csf.b, Boolean.valueOf(true)), 3);
      }

      this.b(bjk.c);
      this.a($$0);
      this.g($$0);
      this.f(ehe.b);
      this.au = true;
   }

   private void a(gu $$0) {
      this.e((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean H() {
      return this.fz().map($$0 -> this.dK().a_($$0).b() instanceof csf).orElse(false);
   }

   public void fC() {
      this.fz().filter(this.dK()::A).ifPresent($$0x -> {
         dfa $$1 = this.dK().a_($$0x);
         if ($$1.b() instanceof csf) {
            ha $$2 = $$1.c(csf.aC);
            this.dK().a($$0x, $$1.a(csf.b, Boolean.valueOf(false)), 3);
            ehe $$3 = csf.a(this.ag(), this.dK(), $$0x, $$2, this.dA()).orElseGet(() -> {
               gu $$1x = $$0x.c();
               return new ehe((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            ehe $$4 = ehe.c($$0x).d($$3).d();
            float $$5 = (float)arp.d(arp.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.e($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      ehe $$0 = this.di();
      this.b(bjk.a);
      this.e($$0.c, $$0.d, $$0.e);
      this.fA();
   }

   @Nullable
   public ha fD() {
      gu $$0 = this.fz().orElse(null);
      return $$0 != null ? csf.a(this.dK(), $$0) : null;
   }

   @Override
   public boolean bw() {
      return !this.fB() && super.bw();
   }

   @Override
   protected final float a(bjk $$0, bij $$1) {
      return $$0 == bjk.c ? 0.2F : this.b($$0, $$1);
   }

   protected float b(bjk $$0, bij $$1) {
      return super.a($$0, $$1);
   }

   public ciy g(ciy $$0) {
      return ciy.b;
   }

   public ciy a(cpm $$0, ciy $$1) {
      if ($$1.M()) {
         $$0.a(null, this.dp(), this.dr(), this.dv(), this.d($$1), aox.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$1, $$0, this);
         if (!(this instanceof cbn) || !((cbn)this).fR().d) {
            $$1.h(1);
         }

         this.a(djk.m);
      }

      return $$1;
   }

   private void a(ciy $$0, cpm $$1, biy $$2) {
      cit $$3 = $$0.d();
      if ($$3.u()) {
         for (Pair<bhv, Float> $$5 : $$3.v().f()) {
            if (!$$1.B && $$5.getFirst() != null && $$1.z.i() < (Float)$$5.getSecond()) {
               $$2.b(new bhv((bhv)$$5.getFirst()));
            }
         }
      }
   }

   private static byte g(bin $$0) {
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

   public void d(bin $$0) {
      this.dK().a(this, g($$0));
   }

   public void d(bgp $$0) {
      this.d($$0 == bgp.a ? bin.a : bin.b);
   }

   @Override
   public egz k_() {
      if (this.c(bin.f).a(cjb.tw)) {
         float $$0 = 0.5F;
         return this.cG().c(0.5, 0.5, 0.5);
      } else {
         return super.k_();
      }
   }

   public static bin h(ciy $$0) {
      chz $$1 = chz.c_($$0);
      return $$1 != null ? $$1.g() : bin.a;
   }

   private static bjr a(biy $$0, bin $$1) {
      return $$1 != bin.f && $$1 != bin.a && $$1 != bin.b ? bjr.a($$0, $$1, $$1x -> $$1x.b() || bja.h($$1x) == $$1) : bjr.a($$0, $$1);
   }

   @Nullable
   private static bin r(int $$0) {
      if ($$0 == 100 + bin.f.b()) {
         return bin.f;
      } else if ($$0 == 100 + bin.e.b()) {
         return bin.e;
      } else if ($$0 == 100 + bin.d.b()) {
         return bin.d;
      } else if ($$0 == 100 + bin.c.b()) {
         return bin.c;
      } else if ($$0 == 98) {
         return bin.a;
      } else {
         return $$0 == 99 ? bin.b : null;
      }
   }

   @Override
   public bjr a_(int $$0) {
      bin $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dy() {
      if (this.G_()) {
         return false;
      } else {
         boolean $$0 = !this.c(bin.f).a(apt.az) && !this.c(bin.e).a(apt.az) && !this.c(bin.d).a(apt.az) && !this.c(bin.c).a(apt.az);
         return $$0 && super.dy();
      }
   }

   @Override
   public boolean cc() {
      return !this.dK().r_() && this.a(bhx.x) || super.cc();
   }

   @Override
   public float dB() {
      return this.aU;
   }

   @Override
   public void a(wq $$0) {
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
      return this.eR().d() instanceof cgn;
   }

   @Override
   public float dE() {
      float $$0 = super.dE();
      return this.cN() instanceof cbn ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public ehe m(bii $$0) {
      return new ehe(this.a($$0, this.a(this.an()), this.dX()).rotateY(-this.aU * (float) (Math.PI / 180.0))).e(this.di());
   }

   @Override
   public float k(bii $$0) {
      return this.l($$0) * this.dX();
   }

   protected void a(int $$0, double $$1) {
      this.aW = (float)arp.e(1.0 / (double)$$0, (double)this.aW, $$1);
   }

   public static record a(aov a, aov b) {
   }
}
