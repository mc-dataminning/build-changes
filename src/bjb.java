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

public abstract class bjb extends bil implements bij {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final bkf bA = new bkf(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, bkf.a.c);
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
   protected static final aec<Byte> t = aef.a(bjb.class, aee.a);
   private static final aec<Float> bH = aef.a(bjb.class, aee.d);
   private static final aec<Integer> bI = aef.a(bjb.class, aee.b);
   private static final aec<Boolean> bJ = aef.a(bjb.class, aee.k);
   private static final aec<Integer> bK = aef.a(bjb.class, aee.b);
   private static final aec<Integer> bL = aef.a(bjb.class, aee.b);
   private static final aec<Optional<gw>> bM = aef.a(bjb.class, aee.o);
   protected static final float u = 1.74F;
   protected static final bim v = bim.c(0.2F, 0.2F);
   public static final float aE = 0.5F;
   private static final int bN = 50;
   private final bke bO;
   private final bhg bP = new bhg(this);
   private final Map<bhw, bhy> bQ = Maps.newHashMap();
   private final hp<cja> bR = hp.a(2, cja.b);
   private final hp<cja> bS = hp.a(4, cja.b);
   public boolean aF;
   private boolean bT = false;
   public bgs aG;
   public int aH;
   public int aI;
   public int aJ;
   public int aK;
   public int aL;
   public int aM;
   public float aN;
   public float aO;
   protected int aP;
   public final bka aQ = new bka();
   public final int aR = 20;
   public final float aS;
   public final float aT;
   public float aU;
   public float aV;
   public float aW;
   public float aX;
   @Nullable
   protected cbp aY;
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
   private bjb bV;
   private int bW;
   private bjb bX;
   private int bY;
   private float bZ;
   private int ca;
   private float cb;
   protected cja bv = cja.b;
   protected int bw;
   protected int bx;
   private gw cc;
   private Optional<gw> cd = Optional.empty();
   @Nullable
   private bhj ce;
   private long cf;
   protected int by;
   private float cg;
   private float ch;
   protected bkb<?> bz;
   private boolean ci;

   protected bjb(bip<? extends bjb> $$0, cpq $$1) {
      super($$0, $$1);
      this.bO = new bke(bki.a($$0));
      this.c(this.eK());
      this.I = true;
      this.aT = (float)((Math.random() + 1.0) * 0.01F);
      this.ap();
      this.aS = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.aW = this.dA();
      this.t(0.6F);
      rf $$2 = rf.a;
      this.bz = this.a(new Dynamic($$2, (rn)$$2.createMap(ImmutableMap.of($$2.a("memories"), (rn)$$2.emptyMap()))));
   }

   public bkb<?> dM() {
      return this.bz;
   }

   protected bkb.b<?> dN() {
      return bkb.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bkb<?> a(Dynamic<?> $$0) {
      return this.dN().a($$0);
   }

   @Override
   public void aj() {
      this.a(this.dL().w(), Float.MAX_VALUE);
   }

   public boolean a(bip<?> $$0) {
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

   public static bkg.a dO() {
      return bkg.a().a(bkh.a).a(bkh.c).a(bkh.d).a(bkh.i).a(bkh.j).a(bkh.l);
   }

   @Override
   protected void a(double $$0, boolean $$1, dfe $$2, gw $$3) {
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
         gw $$7 = this.dk();
         if ($$3.u() != $$7.u() || $$3.w() != $$7.w()) {
            double $$8 = $$4 - (double)$$3.u() - 0.5;
            double $$9 = $$6 - (double)$$3.w() - 0.5;
            double $$10 = Math.max(Math.abs($$8), Math.abs($$9));
            $$4 = (double)$$3.u() + 0.5 + $$8 / $$10 * 0.5;
            $$6 = (double)$$3.w() + 0.5 + $$9 / $$10 * 0.5;
         }

         float $$11 = (float)ars.f(this.ab - 3.0F);
         double $$12 = Math.min((double)(0.2F + $$11 / 15.0F), 2.5);
         int $$13 = (int)(150.0 * $$12);
         ((akn)this.dK()).a(new ip(ix.c, $$2), $$4, $$5, $$6, $$13, 0.0, 0.0, 0.0, 0.15F);
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cd = Optional.empty();
      }
   }

   public boolean dP() {
      return this.eQ() == bjg.b;
   }

   public float a(float $$0) {
      return ars.i($$0, this.ch, this.cg);
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
         boolean $$0 = this instanceof cbp;
         if (!this.dK().B) {
            if (this.bw()) {
               this.a(this.dL().f(), 1.0F);
            } else if ($$0 && !this.dK().w_().a(this.cG())) {
               double $$1 = this.dK().w_().a(this) + this.dK().w_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dK().w_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dL().v(), (float)Math.max(1, ars.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(apt.a) && !this.dK().a_(gw.a(this.dp(), this.dt(), this.dv())).a(csr.nd)) {
            boolean $$3 = !this.dP() && !bhz.c(this) && (!$$0 || !((cbp)this).fR().a);
            if ($$3) {
               this.j(this.m(this.ch()));
               if (this.ch() == -20) {
                  this.j(0);
                  ehi $$4 = this.dn();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.ag.j() - this.ag.j();
                     double $$7 = this.ag.j() - this.ag.j();
                     double $$8 = this.ag.j() - this.ag.j();
                     this.dK().a(ix.e, this.dp() + $$6, this.dr() + $$7, this.dv() + $$8, $$4.c, $$4.d, $$4.e);
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
            gw $$9 = this.dk();
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

      if (this.al > 0 && !(this instanceof ako)) {
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
      return this.ah % 5 == 0 && this.dn().c != 0.0 && this.dn().e != 0.0 && !this.G_() && cnl.k(this) && this.dS();
   }

   protected void dR() {
      ehi $$0 = this.dn();
      this.dK()
         .a(
            ix.I,
            this.dp() + (this.ag.j() - 0.5) * (double)this.df(),
            this.dr() + 0.1,
            this.dv() + (this.ag.j() - 0.5) * (double)this.df(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.ag.i() * 0.4F + this.ag.i() > 0.9F ? 0.6F : 0.0F;
      this.a(aoz.wd, $$1, 0.6F + this.ag.i() * 0.4F);
   }

   protected boolean dS() {
      return this.dK().a_(this.aG()).a(apo.aM);
   }

   @Override
   protected float aJ() {
      return this.dS() && cnl.a(cnn.l, this) > 0 ? 1.0F : super.aJ();
   }

   @Override
   protected boolean c(dfe $$0) {
      return !$$0.i() || this.fu();
   }

   protected void dT() {
      bkd $$0 = this.a(bkh.d);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void dU() {
      if (!this.bh().i()) {
         int $$0 = cnl.a(cnn.l, this);
         if ($$0 > 0 && this.dS()) {
            bkd $$1 = this.a(bkh.d);
            if ($$1 == null) {
               return;
            }

            $$1.b(new bkf(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), bkf.a.a));
            if (this.ee().i() < 0.04F) {
               cja $$2 = this.c(biq.c);
               $$2.a(1, this, $$0x -> $$0x.d(biq.c));
            }
         }
      }
   }

   protected void dV() {
      bkd $$0 = this.a(bkh.d);
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
            bkd $$1 = this.a(bkh.d);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cj();
            $$1.b(new bkf(e, "Powder snow slow", (double)$$2, bkf.a.a));
         }
      }
   }

   protected void c(gw $$0) {
      int $$1 = cnl.a(cnn.j, this);
      if ($$1 > 0) {
         cnq.a(this, this.dK(), $$0, $$1);
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
         this.a(bil.c.a);
      }
   }

   public boolean ea() {
      return !this.i_();
   }

   protected boolean eb() {
      return !this.i_();
   }

   protected int m(int $$0) {
      int $$1 = cnl.e(this);
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

   public arx ee() {
      return this.ag;
   }

   @Nullable
   public bjb ef() {
      return this.bV;
   }

   @Override
   public bjb M_() {
      return this.ef();
   }

   public int eg() {
      return this.bW;
   }

   public void c(@Nullable cbp $$0) {
      this.aY = $$0;
      this.aZ = this.ah;
   }

   public void a(@Nullable bjb $$0) {
      this.bV = $$0;
      this.bW = this.ah;
   }

   @Nullable
   public bjb eh() {
      return this.bX;
   }

   public int ei() {
      return this.bY;
   }

   public void A(bil $$0) {
      if ($$0 instanceof bjb) {
         this.bX = (bjb)$$0;
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

   protected boolean a(biq $$0) {
      return true;
   }

   public void a(biq $$0, cja $$1, cja $$2) {
      boolean $$3 = $$2.b() && $$1.b();
      if (!$$3 && !cja.c($$1, $$2) && !this.am) {
         cib $$4 = cib.c_($$2);
         if (!this.dK().r_() && !this.G_()) {
            if (!this.aS() && $$4 != null && $$4.g() == $$0) {
               this.dK().a(null, this.dp(), this.dr(), this.dv(), $$4.aj_(), this.da(), 1.0F, 1.0F);
            }

            if (this.a($$0)) {
               this.a($$4 != null ? djo.v : djo.S);
            }
         }
      }
   }

   @Override
   public void a(bil.c $$0) {
      super.a($$0);
      this.bz.a();
   }

   @Override
   public void b(qu $$0) {
      $$0.a("Health", this.et());
      $$0.a("HurtTime", (short)this.aK);
      $$0.a("HurtByTimestamp", this.bW);
      $$0.a("DeathTime", (short)this.aM);
      $$0.a("AbsorptionAmount", this.fi());
      $$0.a("Attributes", this.eP().c());
      if (!this.bQ.isEmpty()) {
         ra $$1 = new ra();

         for (bhy $$2 : this.bQ.values()) {
            $$1.add($$2.a(new qu()));
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fu());
      this.fz().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<rn> $$3 = this.bz.a(rf.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(qu $$0) {
      this.z($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dK() != null && !this.dK().B) {
         this.eP().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         ra $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            qu $$3 = $$1.a($$2);
            bhy $$4 = bhy.b($$3);
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
         eif $$6 = this.dK().I().d($$5);
         boolean $$7 = $$6 != null && this.dK().I().a(this.cw(), $$6);
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
         this.an.b(as, bjn.c);
         if (!this.am) {
            this.a($$8);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bz = this.a(new Dynamic(rf.a, $$0.c("Brain")));
      }
   }

   protected void el() {
      Iterator<bhw> $$0 = this.bQ.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            bhw $$1 = $$0.next();
            bhy $$2 = this.bQ.get($$1);
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
            this.dK().a($$4 ? ix.a : ix.v, this.d(0.5), this.ds(), this.g(0.5), $$7, $$8, $$9);
         }
      }
   }

   protected void G() {
      if (this.bQ.isEmpty()) {
         this.eo();
         this.j(false);
      } else {
         Collection<bhy> $$0 = this.bQ.values();
         this.an.b(bJ, c($$0));
         this.an.b(bI, ckz.a($$0));
         this.j(this.a(bia.n));
      }
   }

   private void p() {
      boolean $$0 = this.cc();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable bil $$0) {
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
         cja $$3 = this.c(biq.f);
         bip<?> $$4 = $$0.ag();
         if ($$4 == bip.aJ && $$3.a(cjd.tr)
            || $$4 == bip.bp && $$3.a(cjd.tu)
            || $$4 == bip.aw && $$3.a(cjd.tx)
            || $$4 == bip.ax && $$3.a(cjd.tx)
            || $$4 == bip.u && $$3.a(cjd.tv)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bjb $$0) {
      return $$0 instanceof cbp && this.dK().ai() == bgq.a ? false : $$0.em();
   }

   public boolean a(bjb $$0, btn $$1) {
      return $$1.a(this, $$0);
   }

   public boolean em() {
      return !this.cq() && this.en();
   }

   public boolean en() {
      return !this.G_() && this.bv();
   }

   public static boolean c(Collection<bhy> $$0) {
      for (bhy $$1 : $$0) {
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
         Iterator<bhy> $$0 = this.bQ.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<bhy> eq() {
      return this.bQ.values();
   }

   public Map<bhw, bhy> er() {
      return this.bQ;
   }

   public boolean a(bhw $$0) {
      return this.bQ.containsKey($$0);
   }

   @Nullable
   public bhy b(bhw $$0) {
      return this.bQ.get($$0);
   }

   public final boolean b(bhy $$0) {
      return this.b($$0, null);
   }

   public boolean b(bhy $$0, @Nullable bil $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         bhy $$2 = this.bQ.get($$0.c());
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

   public boolean c(bhy $$0) {
      if (this.eQ() == bjg.b) {
         bhw $$1 = $$0.c();
         if ($$1 == bia.j || $$1 == bia.s) {
            return false;
         }
      }

      return true;
   }

   public void c(bhy $$0, @Nullable bil $$1) {
      if (this.c($$0)) {
         bhy $$2 = this.bQ.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean es() {
      return this.eQ() == bjg.b;
   }

   @Nullable
   public bhy c(@Nullable bhw $$0) {
      return this.bQ.remove($$0);
   }

   public boolean d(bhw $$0) {
      bhy $$1 = this.c($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(bhy $$0, @Nullable bil $$1) {
      this.bU = true;
      if (!this.dK().B) {
         $$0.c().a(this.eP(), $$0.e());
         this.d($$0);
      }
   }

   public void d(bhy $$0) {
      for (bil $$1 : this.cP()) {
         if ($$1 instanceof ako $$2) {
            $$2.c.b(new aau(this.ah(), $$0));
         }
      }
   }

   protected void a(bhy $$0, boolean $$1, @Nullable bil $$2) {
      this.bU = true;
      if ($$1 && !this.dK().B) {
         bhw $$3 = $$0.c();
         $$3.a(this.eP());
         $$3.a(this.eP(), $$0.e());
         this.r();
      }

      if (!this.dK().B) {
         this.d($$0);
      }
   }

   protected void a(bhy $$0) {
      this.bU = true;
      if (!this.dK().B) {
         $$0.c().a(this.eP());
         this.r();

         for (bil $$1 : this.cP()) {
            if ($$1 instanceof ako $$2) {
               $$2.c.b(new zc(this.ah(), $$0.c()));
            }
         }
      }
   }

   private void r() {
      for (bkd $$0 : this.eP().a()) {
         this.d($$0.a());
      }
   }

   private void d(bkc $$0) {
      if ($$0 == bkh.a) {
         float $$1 = this.eK();
         if (this.et() > $$1) {
            this.c($$1);
         }
      } else if ($$0 == bkh.l) {
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
      this.an.b(bH, ars.a($$0, 0.0F, this.eK()));
   }

   public boolean eu() {
      return this.et() <= 0.0F;
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dK().B) {
         return false;
      } else if (this.eu()) {
         return false;
      } else if ($$0.a(apq.i) && this.a(bia.l)) {
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
            if (!$$0.a(apq.j) && $$0.c() instanceof bjb $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(apq.o) && this.ag().a(apr.j)) {
            $$1 *= 5.0F;
         }

         this.aQ.a(1.5F);
         boolean $$7 = true;
         if ((float)this.al > 10.0F && !$$0.a(apq.e)) {
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

         if ($$0.a(apq.a) && !this.c(biq.f).b()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         bil $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof bjb $$9 && !$$0.a(apq.q)) {
               this.a($$9);
            }

            if ($$8 instanceof cbp $$10) {
               this.aZ = 100;
               this.aY = $$10;
            } else if ($$8 instanceof bvp $$11 && $$11.p()) {
               this.aZ = 100;
               if ($$11.I_() instanceof cbp $$12) {
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

            if (!$$0.a(apq.r) && (!$$3 || $$1 > 0.0F)) {
               this.bo();
            }

            if ($$8 != null && !$$0.a(apq.z)) {
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
               aoy $$15 = this.h_();
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

         if (this instanceof ako) {
            al.h.a((ako)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((ako)this).a(apj.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof ako) {
            al.g.a((ako)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$16;
      }
   }

   protected void d(bjb $$0) {
      $$0.e(this);
   }

   protected void e(bjb $$0) {
      $$0.q(0.5, $$0.dp() - this.dp(), $$0.dv() - this.dv());
   }

   private boolean h(bhj $$0) {
      if ($$0.a(apq.d)) {
         return false;
      } else {
         cja $$1 = null;

         for (bgs $$2 : bgs.values()) {
            cja $$3 = this.b($$2);
            if ($$3.a(cjd.uz)) {
               $$1 = $$3.p();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof ako $$4) {
               $$4.b(apj.c.b(cjd.uz));
               al.B.a($$4, $$1);
               this.a(djo.C);
            }

            this.c(1.0F);
            this.ep();
            this.b(new bhy(bia.j, 900, 1));
            this.b(new bhy(bia.v, 100, 1));
            this.b(new bhy(bia.l, 800, 0));
            this.dK().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bhj ev() {
      if (this.dK().V() - this.cf > 40L) {
         this.ce = null;
      }

      return this.ce;
   }

   protected void e(bhj $$0) {
      aoy $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eU(), this.eV());
      }
   }

   public boolean f(bhj $$0) {
      bil $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cbv $$3 && $$3.w() > 0) {
         $$2 = true;
      }

      if (!$$0.a(apq.c) && this.fs() && !$$2) {
         ehi $$4 = $$0.h();
         if ($$4 != null) {
            ehi $$5 = this.f(1.0F);
            ehi $$6 = $$4.a(this.di()).d();
            $$6 = new ehi($$6.c, 0.0, $$6.e);
            if ($$6.b($$5) < 0.0) {
               return true;
            }
         }
      }

      return false;
   }

   private void i(cja $$0) {
      if (!$$0.b()) {
         if (!this.aS()) {
            this.dK().a(this.dp(), this.dr(), this.dv(), aoz.lZ, this.da(), 0.8F, 0.8F + this.dK().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bhj $$0) {
      if (!this.dF() && !this.ba) {
         bil $$1 = $$0.d();
         bjb $$2 = this.eJ();
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
         if (this.dK() instanceof akn $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(djo.p);
               this.g($$0);
               this.f($$2);
            }

            this.dK().a(this, (byte)3);
         }

         this.b(bjn.h);
      }
   }

   protected void f(@Nullable bjb $$0) {
      if (!this.dK().B) {
         boolean $$1 = false;
         if ($$0 instanceof bxw) {
            if (this.dK().X().b(cpm.c)) {
               gw $$2 = this.dk();
               dfe $$3 = csr.cd.n();
               if (this.dK().a_($$2).i() && $$3.a((cpt)this.dK(), $$2)) {
                  this.dK().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               byi $$4 = new byi(this.dK(), this.dp(), this.dr(), this.dv(), new cja(cjd.da));
               this.dK().b($$4);
            }
         }
      }
   }

   protected void g(bhj $$0) {
      bil $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof cbp) {
         $$2 = cnl.h((bjb)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.aZ > 0;
      if (this.eb() && this.dK().X().b(cpm.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.ew();
      this.ex();
   }

   protected void ew() {
   }

   protected void ex() {
      if (this.dK() instanceof akn && !this.eB() && (this.ed() || this.aZ > 0 && this.ea() && this.dK().X().b(cpm.f))) {
         bir.a((akn)this.dK(), this.di(), this.ec());
      }
   }

   protected void a(bhj $$0, int $$1, boolean $$2) {
   }

   public aeu ey() {
      return this.ag().j();
   }

   public long ez() {
      return 0L;
   }

   protected void a(bhj $$0, boolean $$1) {
      aeu $$2 = this.ey();
      ect $$3 = this.dK().n().aH().getLootTable($$2);
      ecr.a $$4 = new ecr.a((akn)this.dK()).a(eew.a, this).a(eew.f, this.di()).a(eew.c, $$0).b(eew.d, $$0.d()).b(eew.e, $$0.c());
      if ($$1 && this.aY != null) {
         $$4 = $$4.a(eew.b, this.aY).a(this.aY.gm());
      }

      ecr $$5 = $$4.a(eev.g);
      $$3.a($$5, this.ez(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.b(bkh.c);
      if (!($$0 <= 0.0)) {
         this.au = true;
         ehi $$3 = this.dn();
         ehi $$4 = new ehi($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aA() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected aoy d(bhj $$0) {
      return aoz.iZ;
   }

   @Nullable
   protected aoy h_() {
      return aoz.iU;
   }

   private aoy d(int $$0) {
      return $$0 > 4 ? this.eE().b() : this.eE().a();
   }

   public void eA() {
      this.ci = true;
   }

   public boolean eB() {
      return this.ci;
   }

   public float eC() {
      return 0.0F;
   }

   protected ehd eD() {
      ehd $$0 = this.cG();
      bil $$1 = this.cY();
      if ($$1 != null) {
         ehi $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public bjb.a eE() {
      return new bjb.a(aoz.ja, aoz.iS);
   }

   protected aoy c(cja $$0) {
      return $$0.N();
   }

   public aoy d(cja $$0) {
      return $$0.O();
   }

   public Optional<gw> eF() {
      return this.cd;
   }

   public boolean j_() {
      if (this.G_()) {
         return false;
      } else {
         gw $$0 = this.dk();
         dfe $$1 = this.dl();
         if ($$1.a(apo.aO)) {
            this.cd = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dbd && this.c($$0, $$1)) {
            this.cd = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(gw $$0, dfe $$1) {
      if ($$1.c(dbd.a)) {
         dfe $$2 = this.dK().a_($$0.d());
         if ($$2.a(csr.cO) && $$2.c(cwt.a) == $$1.c(dbd.aC)) {
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
   public boolean a(float $$0, float $$1, bhj $$2) {
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
      if (this.ag().a(apr.l)) {
         return 0;
      } else {
         bhy $$2 = this.b(bia.h);
         float $$3 = $$2 == null ? 0.0F : (float)($$2.e() + 1);
         return ars.f(($$0 - 3.0F - $$3) * $$1);
      }
   }

   protected void eG() {
      if (!this.aS()) {
         int $$0 = ars.a(this.dp());
         int $$1 = ars.a(this.dr() - 0.2F);
         int $$2 = ars.a(this.dv());
         dfe $$3 = this.dK().a_(new gw($$0, $$1, $$2));
         if (!$$3.i()) {
            dad $$4 = $$3.w();
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
      return ars.a(this.b(bkh.i));
   }

   protected void b(bhj $$0, float $$1) {
   }

   protected void c(bhj $$0, float $$1) {
   }

   protected void u(float $$0) {
   }

   protected float d(bhj $$0, float $$1) {
      if (!$$0.a(apq.b)) {
         this.b($$0, $$1);
         $$1 = bhf.a($$1, (float)this.eH(), (float)this.b(bkh.j));
      }

      return $$1;
   }

   protected float e(bhj $$0, float $$1) {
      if ($$0.a(apq.f)) {
         return $$1;
      } else {
         if (this.a(bia.k) && !$$0.a(apq.g)) {
            int $$2 = (this.b(bia.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof ako) {
                  ((ako)this).a(apj.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof ako) {
                  ((ako)$$0.d()).a(apj.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(apq.h)) {
            return $$1;
         } else {
            int $$7 = cnl.a(this.bK(), $$0);
            if ($$7 > 0) {
               $$1 = bhf.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bhj $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fi(), 0.0F);
         this.y(this.fi() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof ako $$4) {
            $$4.a(apj.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eI().a($$0, var9);
            this.c(this.et() - var9);
            this.y(this.fi() - var9);
            this.a(djo.o);
         }
      }
   }

   public bhg eI() {
      return this.bP;
   }

   @Nullable
   public bjb eJ() {
      if (this.aY != null) {
         return this.aY;
      } else {
         return this.bV != null ? this.bV : null;
      }
   }

   public final float eK() {
      return (float)this.b(bkh.a);
   }

   public final float eL() {
      return (float)this.b(bkh.l);
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
      if (bhz.a(this)) {
         return 6 - (1 + bhz.b(this));
      } else {
         return this.a(bia.d) ? 6 + (1 + this.b(bia.d).e()) * 2 : 6;
      }
   }

   public void a(bgs $$0) {
      this.a($$0, false);
   }

   public void a(bgs $$0, boolean $$1) {
      if (!this.aF || this.aH >= this.w() / 2 || this.aH < 0) {
         this.aH = -1;
         this.aF = true;
         this.aG = $$0;
         if (this.dK() instanceof akn) {
            ww $$2 = new ww(this, $$0 == bgs.a ? 0 : 3);
            akl $$3 = ((akn)this.dK()).k();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bhj $$0) {
      this.aQ.a(1.5F);
      this.al = 20;
      this.aL = 10;
      this.aK = this.aL;
      aoy $$1 = this.d($$0);
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
            aoy $$1 = this.h_();
            if ($$1 != null) {
               this.a($$1, this.eU(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cbp)) {
               this.c(0.0F);
               this.a(this.dL().n());
            }
            break;
         case 29:
            this.a(aoz.uQ, 1.0F, 0.8F + this.dK().z.i() * 0.4F);
            break;
         case 30:
            this.a(aoz.uR, 0.8F, 0.8F + this.dK().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ag.i() - 0.5F) * 0.2F;
               float $$6 = (this.ag.i() - 0.5F) * 0.2F;
               float $$7 = (this.ag.i() - 0.5F) * 0.2F;
               double $$8 = ars.d($$4, this.K, this.dp()) + (this.ag.j() - 0.5) * (double)this.df() * 2.0;
               double $$9 = ars.d($$4, this.L, this.dr()) + this.ag.j() * (double)this.dg();
               double $$10 = ars.d($$4, this.M, this.dv()) + (this.ag.j() - 0.5) * (double)this.df() * 2.0;
               this.dK().a(ix.X, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.c(biq.a));
            break;
         case 48:
            this.i(this.c(biq.b));
            break;
         case 49:
            this.i(this.c(biq.f));
            break;
         case 50:
            this.i(this.c(biq.e));
            break;
         case 51:
            this.i(this.c(biq.d));
            break;
         case 52:
            this.i(this.c(biq.c));
            break;
         case 54:
            cwh.b(this);
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
         this.dK().a(ix.W, this.d(1.0), this.ds(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void y() {
      cja $$0 = this.c(biq.b);
      this.a(biq.b, this.c(biq.a));
      this.a(biq.a, $$0);
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
   public bkd a(bkc $$0) {
      return this.eP().a($$0);
   }

   public double a(hg<bkc> $$0) {
      return this.b($$0.a());
   }

   public double b(bkc $$0) {
      return this.eP().c($$0);
   }

   public double b(hg<bkc> $$0) {
      return this.c($$0.a());
   }

   public double c(bkc $$0) {
      return this.eP().d($$0);
   }

   public bke eP() {
      return this.bO;
   }

   public bjg eQ() {
      return bjg.a;
   }

   public cja eR() {
      return this.c(biq.a);
   }

   public cja eS() {
      return this.c(biq.b);
   }

   public boolean b(civ $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cja> $$0) {
      return $$0.test(this.eR()) || $$0.test(this.eS());
   }

   public cja b(bgs $$0) {
      if ($$0 == bgs.a) {
         return this.c(biq.a);
      } else if ($$0 == bgs.b) {
         return this.c(biq.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bgs $$0, cja $$1) {
      if ($$0 == bgs.a) {
         this.a(biq.a, $$1);
      } else {
         if ($$0 != bgs.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(biq.b, $$1);
      }
   }

   public boolean b(biq $$0) {
      return !this.c($$0).b();
   }

   @Override
   public abstract Iterable<cja> bK();

   public abstract cja c(biq var1);

   @Override
   public abstract void a(biq var1, cja var2);

   protected void e(cja $$0) {
      qu $$1 = $$0.v();
      if ($$1 != null) {
         $$0.d().b($$1);
      }
   }

   public float eT() {
      Iterable<cja> $$0 = this.bK();
      int $$1 = 0;
      int $$2 = 0;

      for (cja $$3 : $$0) {
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
      bkd $$1 = this.a(bkh.d);
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
   public void g(bil $$0) {
      if (!this.fB()) {
         super.g($$0);
      }
   }

   private void a(bil $$0) {
      ehi $$1;
      if (this.dF()) {
         $$1 = this.di();
      } else if (!$$0.dF() && !this.dK().a_($$0.dk()).a(apo.aI)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dr(), $$0.dr());
         $$1 = new ehi(this.dp(), $$2, this.dv());
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
      return this.a(bia.h) ? 0.1F * ((float)this.b(bia.h).e() + 1.0F) : 0.0F;
   }

   protected void eZ() {
      ehi $$0 = this.dn();
      this.o($$0.c, (double)this.eX(), $$0.e);
      if (this.bX()) {
         float $$1 = this.dA() * (float) (Math.PI / 180.0);
         this.f(this.dn().b((double)(-ars.a($$1) * 0.2F), 0.0, (double)(ars.b($$1) * 0.2F)));
      }

      this.au = true;
   }

   protected void fa() {
      this.f(this.dn().b(0.0, -0.04F, 0.0));
   }

   protected void c(aqd<eag> $$0) {
      this.f(this.dn().b(0.0, 0.04F, 0.0));
   }

   protected float fb() {
      return 0.8F;
   }

   public boolean a(eah $$0) {
      return false;
   }

   public void h(ehi $$0) {
      if (this.cW()) {
         double $$1 = 0.08;
         boolean $$2 = this.dn().d <= 0.0;
         if ($$2 && this.a(bia.B)) {
            $$1 = 0.01;
         }

         eah $$3 = this.dK().b_(this.dk());
         if (this.aX() && this.dY() && !this.a($$3)) {
            double $$4 = this.dr();
            float $$5 = this.bX() ? 0.9F : this.fb();
            float $$6 = 0.02F;
            float $$7 = (float)cnl.f(this);
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

            if (this.a(bia.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(bjh.a, this.dn());
            ehi $$8 = this.dn();
            if (this.P && this.j_()) {
               $$8 = new ehi($$8.c, 0.2, $$8.e);
            }

            this.f($$8.d((double)$$5, 0.8F, (double)$$5));
            ehi $$9 = this.a($$1, $$2, this.dn());
            this.f($$9);
            if (this.P && this.g($$9.c, $$9.d + 0.6F - this.dr() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bl() && this.dY() && !this.a($$3)) {
            double $$10 = this.dr();
            this.a(0.02F, $$0);
            this.a(bjh.a, this.dn());
            if (this.b(apt.b) <= this.de()) {
               this.f(this.dn().d(0.5, 0.8F, 0.5));
               ehi $$11 = this.a($$1, $$2, this.dn());
               this.f($$11);
            } else {
               this.f(this.dn().a(0.5));
            }

            if (!this.aT()) {
               this.f(this.dn().b(0.0, -$$1 / 4.0, 0.0));
            }

            ehi $$12 = this.dn();
            if (this.P && this.g($$12.c, $$12.d + 0.6F - this.dr() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fu()) {
            this.cm();
            ehi $$13 = this.dn();
            ehi $$14 = this.bE();
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
               double $$21 = $$17 * (double)(-ars.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.f($$13.d(0.99F, 0.98F, 0.99F));
            this.a(bjh.a, this.dn());
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
            gw $$25 = this.aG();
            float $$26 = this.dK().a_($$25).b().h();
            float $$27 = this.aA() ? $$26 * 0.91F : 0.91F;
            ehi $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.a(bia.y)) {
               $$29 += (0.05 * (double)(this.b(bia.y).e() + 1) - $$28.d) * 0.2;
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

      this.q(this instanceof buv);
   }

   private void c(cbp $$0, ehi $$1) {
      ehi $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.cW()) {
         this.w(this.e($$0));
         this.h($$2);
      } else {
         this.q(false);
         this.f(ehi.b);
         this.aB();
      }
   }

   protected void a(cbp $$0, ehi $$1) {
   }

   protected ehi b(cbp $$0, ehi $$1) {
      return $$1;
   }

   protected float e(cbp $$0) {
      return this.fd();
   }

   public void q(boolean $$0) {
      float $$1 = (float)ars.g(this.dp() - this.K, $$0 ? this.dr() - this.L : 0.0, this.dv() - this.M);
      this.v($$1);
   }

   protected void v(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aQ.a($$1, 0.4F);
   }

   public ehi a(ehi $$0, float $$1) {
      this.a(this.A($$1), $$0);
      this.f(this.j(this.dn()));
      this.a(bjh.a, this.dn());
      ehi $$2 = this.dn();
      if ((this.P || this.bj) && (this.j_() || this.dl().a(csr.qC) && cyi.a(this))) {
         $$2 = new ehi($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public ehi a(double $$0, boolean $$1, ehi $$2) {
      if (!this.aT() && !this.bX()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new ehi($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private ehi j(ehi $$0) {
      if (this.j_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = ars.a($$0.c, -0.15F, 0.15F);
         double $$3 = ars.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dl().a(csr.nS) && this.ft() && this instanceof cbp) {
            $$4 = 0.0;
         }

         $$0 = new ehi($$2, $$4, $$3);
      }

      return $$0;
   }

   private float A(float $$0) {
      return this.aA() ? this.fd() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fc();
   }

   protected float fc() {
      return this.cN() instanceof cbp ? this.fd() * 0.1F : 0.02F;
   }

   public float fd() {
      return this.bZ;
   }

   public void w(float $$0) {
      this.bZ = $$0;
   }

   public boolean C(bil $$0) {
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
         float $$8 = (float)ars.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = ars.e(ars.g(this.dA()) - $$8);
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
      Map<biq, cja> $$0 = this.A();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<biq, cja> A() {
      Map<biq, cja> $$0 = null;

      for (biq $$1 : biq.values()) {
         cja $$2;
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

         cja $$5 = this.c($$1);
         if (this.a($$2, $$5)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(biq.class);
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

   public boolean a(cja $$0, cja $$1) {
      return !cja.a($$1, $$0);
   }

   private void a(Map<biq, cja> $$0) {
      cja $$1 = $$0.get(biq.a);
      cja $$2 = $$0.get(biq.b);
      if ($$1 != null && $$2 != null && cja.a($$1, this.f(biq.b)) && cja.a($$2, this.f(biq.a))) {
         ((akn)this.dK()).k().b(this, new xv(this, (byte)55));
         $$0.remove(biq.a);
         $$0.remove(biq.b);
         this.c(biq.a, $$1.p());
         this.c(biq.b, $$2.p());
      }
   }

   private void b(Map<biq, cja> $$0) {
      List<Pair<biq, cja>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cja $$3 = $$2.p();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
         }
      });
      ((akn)this.dK()).k().b(this, new zx(this.ah(), $$1));
   }

   private cja e(biq $$0) {
      return this.bS.get($$0.b());
   }

   private void b(biq $$0, cja $$1) {
      this.bS.set($$0.b(), $$1);
   }

   private cja f(biq $$0) {
      return this.bR.get($$0.b());
   }

   private void c(biq $$0, cja $$1) {
      this.bR.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = ars.g($$0 - this.aU);
      this.aU += $$2 * 0.3F;
      float $$3 = ars.g(this.dA() - this.aU);
      if (Math.abs($$3) > 50.0F) {
         this.aU = this.aU + ($$3 - (float)(ars.j((double)$$3) * 50));
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

      ehi $$0 = this.dn();
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
            $$4 = this.b(apt.b);
         } else {
            $$4 = this.b(apt.a);
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
               this.c(apt.b);
            }
         } else {
            this.c(apt.a);
         }
      } else {
         this.ca = 0;
      }

      this.dK().ad().c();
      this.dK().ad().a("travel");
      this.bk *= 0.98F;
      this.bm *= 0.98F;
      this.B();
      ehd $$8 = this.cG();
      ehi $$9 = new ehi((double)this.bk, (double)this.bl, (double)this.bm);
      if (this.a(bia.B) || this.a(bia.y)) {
         this.n();
      }

      label104: {
         if (this.cN() instanceof cbp $$10 && this.bv()) {
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
      if ($$0 && !this.aA() && !this.bN() && !this.a(bia.y)) {
         cja $$1 = this.c(biq.e);
         if ($$1.a(cjd.nh) && chu.d($$1)) {
            $$0 = true;
            int $$2 = this.bx + 1;
            if (!this.dK().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, $$0x -> $$0x.d(biq.e));
               }

               this.a(djo.n);
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
         this.dK().a(djc.a(cbp.class), this.cG(), bio.a(this)).forEach(this::D);
      } else {
         List<bil> $$0 = this.dK().a(this, this.cG(), bio.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dK().X().c(cpm.t);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ag.a(4) == 0) {
               int $$2 = 0;

               for (bil $$3 : $$0) {
                  if (!$$3.bN()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dL().g(), 6.0F);
               }
            }

            for (bil $$4 : $$0) {
               this.D($$4);
            }
         }
      }
   }

   protected void a(ehd $$0, ehd $$1) {
      ehd $$2 = $$0.b($$1);
      List<bil> $$3 = this.dK().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bil $$4 : $$3) {
            if ($$4 instanceof bjb) {
               this.g((bjb)$$4);
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

   protected void D(bil $$0) {
      $$0.g(this);
   }

   protected void g(bjb $$0) {
   }

   public boolean fh() {
      return (this.an.b(t) & 4) != 0;
   }

   @Override
   public void aa() {
      bil $$0 = this.cY();
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

   public void a(byi $$0) {
      bil $$1 = $$0.v();
      if ($$1 instanceof ako) {
         al.O.a((ako)$$1, $$0.j(), this);
      }
   }

   public void a(bil $$0, int $$1) {
      if (!$$0.dF() && !this.dK().B && ($$0 instanceof byi || $$0 instanceof cbv || $$0 instanceof bir)) {
         ((akn)this.dK()).k().b($$0, new aaq($$0.ah(), this.ah(), $$1));
      }
   }

   public boolean E(bil $$0) {
      if ($$0.dK() != this.dK()) {
         return false;
      } else {
         ehi $$1 = new ehi(this.dp(), this.dt(), this.dv());
         ehi $$2 = new ehi($$0.dp(), $$0.dt(), $$0.dv());
         return $$2.f($$1) > 128.0 ? false : this.dK().a(new coz($$1, $$2, coz.a.a, coz.b.a, this)).c() == ehg.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.aW : ars.i($$0, this.aX, this.aW);
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
   protected ehi a(hc.a $$0, l.a $$1) {
      return i(super.a($$0, $$1));
   }

   public static ehi i(ehi $$0) {
      return new ehi($$0.c, $$0.d, 0.0);
   }

   public float fi() {
      return this.cb;
   }

   public final void y(float $$0) {
      this.z(ars.a($$0, 0.0F, this.eL()));
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

   public abstract biv fk();

   public boolean fl() {
      return (this.an.b(t) & 1) > 0;
   }

   public bgs fm() {
      return (this.an.b(t) & 2) > 0 ? bgs.b : bgs.a;
   }

   private void D() {
      if (this.fl()) {
         if (cja.b(this.b(this.fm()), this.bv)) {
            this.bv = this.b(this.fm());
            this.a(this.bv);
         } else {
            this.fr();
         }
      }
   }

   protected void a(cja $$0) {
      $$0.b(this.dK(), this, this.fo());
      if (this.E()) {
         this.b($$0, 5);
      }

      if (--this.bw == 0 && !this.dK().B && !$$0.t()) {
         this.Y_();
      }
   }

   private boolean E() {
      int $$0 = this.fo();
      ced $$1 = this.bv.d().v();
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

   public void c(bgs $$0) {
      cja $$1 = this.b($$0);
      if (!$$1.b() && !this.fl()) {
         this.bv = $$1;
         this.bw = $$1.r();
         if (!this.dK().B) {
            this.c(1, true);
            this.c(2, $$0 == bgs.b);
            this.a(djo.D);
         }
      }
   }

   @Override
   public void a(aec<?> $$0) {
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
            this.bv = cja.b;
            this.bw = 0;
         }
      }
   }

   @Override
   public void a(ed.a $$0, ehi $$1) {
      super.a($$0, $$1);
      this.aX = this.aW;
      this.aU = this.aW;
      this.aV = this.aU;
   }

   protected void b(cja $$0, int $$1) {
      if (!$$0.b() && this.fl()) {
         if ($$0.s() == ckt.c) {
            this.a(this.c($$0), 0.5F, this.dK().z.i() * 0.1F + 0.9F);
         }

         if ($$0.s() == ckt.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(cja $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ehi $$3 = new ehi(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dC() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dA() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ag.i()) * 0.6 - 0.3;
         ehi $$5 = new ehi(((double)this.ag.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dC() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dA() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dp(), this.dt(), this.dv());
         this.dK().a(new it(ix.O, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void Y_() {
      if (!this.dK().B || this.fl()) {
         bgs $$0 = this.fm();
         if (!this.bv.equals(this.b($$0))) {
            this.fq();
         } else {
            if (!this.bv.b() && this.fl()) {
               this.b(this.bv, 16);
               cja $$1 = this.bv.a(this.dK(), this);
               if ($$1 != this.bv) {
                  this.a($$0, $$1);
               }

               this.fr();
            }
         }
      }
   }

   public cja fn() {
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
            this.a(djo.C);
         }
      }

      this.bv = cja.b;
      this.bw = 0;
   }

   public boolean fs() {
      if (this.fl() && !this.bv.b()) {
         civ $$0 = this.bv.d();
         return $$0.c(this.bv) != ckt.d ? false : $$0.b(this.bv) - this.bw >= 5;
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
      return super.bZ() || !this.fu() && this.c(bjn.b);
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
      gw $$9 = gw.a($$0, $$1, $$2);
      cpq $$10 = this.dK();
      if ($$10.A($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.C_()) {
            gw $$12 = $$9.d();
            dfe $$13 = $$10.a_($$12);
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

         if (this instanceof bjk) {
            ((bjk)this).H().n();
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

   public void a(gw $$0, boolean $$1) {
   }

   public boolean f(cja $$0) {
      return false;
   }

   @Override
   public bim a(bjn $$0) {
      return $$0 == bjn.c ? v : super.a($$0).a(this.dX());
   }

   public ImmutableList<bjn> fy() {
      return ImmutableList.of(bjn.a);
   }

   public ehd e(bjn $$0) {
      bim $$1 = this.a($$0);
      return new ehd((double)(-$$1.a / 2.0F), 0.0, (double)(-$$1.a / 2.0F), (double)($$1.a / 2.0F), (double)$$1.b, (double)($$1.a / 2.0F));
   }

   protected boolean f(bjn $$0) {
      ehd $$1 = this.a($$0).a(this.di());
      return this.dK().b(this, $$1);
   }

   @Override
   public boolean cs() {
      return super.cs() && !this.fB();
   }

   public Optional<gw> fz() {
      return this.an.b(bM);
   }

   public void g(gw $$0) {
      this.an.b(bM, Optional.of($$0));
   }

   public void fA() {
      this.an.b(bM, Optional.empty());
   }

   public boolean fB() {
      return this.fz().isPresent();
   }

   public void b(gw $$0) {
      if (this.bN()) {
         this.aa();
      }

      dfe $$1 = this.dK().a_($$0);
      if ($$1.b() instanceof csj) {
         this.dK().a($$0, $$1.a(csj.b, Boolean.valueOf(true)), 3);
      }

      this.b(bjn.c);
      this.a($$0);
      this.g($$0);
      this.f(ehi.b);
      this.au = true;
   }

   private void a(gw $$0) {
      this.e((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean H() {
      return this.fz().map($$0 -> this.dK().a_($$0).b() instanceof csj).orElse(false);
   }

   public void fC() {
      this.fz().filter(this.dK()::A).ifPresent($$0x -> {
         dfe $$1 = this.dK().a_($$0x);
         if ($$1.b() instanceof csj) {
            hc $$2 = $$1.c(csj.aC);
            this.dK().a($$0x, $$1.a(csj.b, Boolean.valueOf(false)), 3);
            ehi $$3 = csj.a(this.ag(), this.dK(), $$0x, $$2, this.dA()).orElseGet(() -> {
               gw $$1x = $$0x.c();
               return new ehi((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            ehi $$4 = ehi.c($$0x).d($$3).d();
            float $$5 = (float)ars.d(ars.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.e($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      ehi $$0 = this.di();
      this.b(bjn.a);
      this.e($$0.c, $$0.d, $$0.e);
      this.fA();
   }

   @Nullable
   public hc fD() {
      gw $$0 = this.fz().orElse(null);
      return $$0 != null ? csj.a(this.dK(), $$0) : null;
   }

   @Override
   public boolean bw() {
      return !this.fB() && super.bw();
   }

   @Override
   protected final float a(bjn $$0, bim $$1) {
      return $$0 == bjn.c ? 0.2F : this.b($$0, $$1);
   }

   protected float b(bjn $$0, bim $$1) {
      return super.a($$0, $$1);
   }

   public cja g(cja $$0) {
      return cja.b;
   }

   public cja a(cpq $$0, cja $$1) {
      if ($$1.M()) {
         $$0.a(null, this.dp(), this.dr(), this.dv(), this.d($$1), apa.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$1, $$0, this);
         if (!(this instanceof cbp) || !((cbp)this).fR().d) {
            $$1.h(1);
         }

         this.a(djo.m);
      }

      return $$1;
   }

   private void a(cja $$0, cpq $$1, bjb $$2) {
      civ $$3 = $$0.d();
      if ($$3.u()) {
         for (Pair<bhy, Float> $$5 : $$3.v().f()) {
            if (!$$1.B && $$5.getFirst() != null && $$1.z.i() < (Float)$$5.getSecond()) {
               $$2.b(new bhy((bhy)$$5.getFirst()));
            }
         }
      }
   }

   private static byte g(biq $$0) {
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

   public void d(biq $$0) {
      this.dK().a(this, g($$0));
   }

   public void d(bgs $$0) {
      this.d($$0 == bgs.a ? biq.a : biq.b);
   }

   @Override
   public ehd k_() {
      if (this.c(biq.f).a(cjd.tw)) {
         float $$0 = 0.5F;
         return this.cG().c(0.5, 0.5, 0.5);
      } else {
         return super.k_();
      }
   }

   public static biq h(cja $$0) {
      cib $$1 = cib.c_($$0);
      return $$1 != null ? $$1.g() : biq.a;
   }

   private static bjt a(bjb $$0, biq $$1) {
      return $$1 != biq.f && $$1 != biq.a && $$1 != biq.b ? bjt.a($$0, $$1, $$1x -> $$1x.b() || bjd.h($$1x) == $$1) : bjt.a($$0, $$1);
   }

   @Nullable
   private static biq r(int $$0) {
      if ($$0 == 100 + biq.f.b()) {
         return biq.f;
      } else if ($$0 == 100 + biq.e.b()) {
         return biq.e;
      } else if ($$0 == 100 + biq.d.b()) {
         return biq.d;
      } else if ($$0 == 100 + biq.c.b()) {
         return biq.c;
      } else if ($$0 == 98) {
         return biq.a;
      } else {
         return $$0 == 99 ? biq.b : null;
      }
   }

   @Override
   public bjt a_(int $$0) {
      biq $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dy() {
      if (this.G_()) {
         return false;
      } else {
         boolean $$0 = !this.c(biq.f).a(apw.az) && !this.c(biq.e).a(apw.az) && !this.c(biq.d).a(apw.az) && !this.c(biq.c).a(apw.az);
         return $$0 && super.dy();
      }
   }

   @Override
   public boolean cc() {
      return !this.dK().r_() && this.a(bia.x) || super.cc();
   }

   @Override
   public float dB() {
      return this.aU;
   }

   @Override
   public void a(wt $$0) {
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
      return this.eR().d() instanceof cgp;
   }

   @Override
   public float dE() {
      float $$0 = super.dE();
      return this.cN() instanceof cbp ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public ehi m(bil $$0) {
      return new ehi(this.a($$0, this.a(this.an()), this.dX()).rotateY(-this.aU * (float) (Math.PI / 180.0))).e(this.di());
   }

   @Override
   public float k(bil $$0) {
      return this.l($$0) * this.dX();
   }

   protected void a(int $$0, double $$1) {
      this.aW = (float)ars.e(1.0 / (double)$$0, (double)this.aW, $$1);
   }

   public static record a(aoy a, aoy b) {
   }
}
