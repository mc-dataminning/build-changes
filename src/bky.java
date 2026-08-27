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

public abstract class bky extends bki implements bkg {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final bmc bA = new bmc(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, bmc.a.c);
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
   protected static final afm<Byte> t = afp.a(bky.class, afo.a);
   private static final afm<Float> bH = afp.a(bky.class, afo.d);
   private static final afm<Integer> bI = afp.a(bky.class, afo.b);
   private static final afm<Boolean> bJ = afp.a(bky.class, afo.k);
   private static final afm<Integer> bK = afp.a(bky.class, afo.b);
   private static final afm<Integer> bL = afp.a(bky.class, afo.b);
   private static final afm<Optional<ht>> bM = afp.a(bky.class, afo.o);
   protected static final float u = 1.74F;
   protected static final bkj v = bkj.c(0.2F, 0.2F);
   public static final float aE = 0.5F;
   private final bmb bN;
   private final bjd bO = new bjd(this);
   private final Map<bjt, bjv> bP = Maps.newHashMap();
   private final il<clb> bQ = il.a(2, clb.b);
   private final il<clb> bR = il.a(4, clb.b);
   public boolean aF;
   private boolean bS = false;
   public bip aG;
   public int aH;
   public int aI;
   public int aJ;
   public int aK;
   public int aL;
   public int aM;
   public float aN;
   public float aO;
   protected int aP;
   public final blx aQ = new blx();
   public final int aR = 20;
   public final float aS;
   public final float aT;
   public float aU;
   public float aV;
   public float aW;
   public float aX;
   @Nullable
   protected cdm aY;
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
   private bky bU;
   private int bV;
   private bky bW;
   private int bX;
   private float bY;
   private int bZ;
   private float ca;
   protected clb bv = clb.b;
   protected int bw;
   protected int bx;
   private ht cb;
   private Optional<ht> cc = Optional.empty();
   @Nullable
   private bjg cd;
   private long ce;
   protected int by;
   private float cf;
   private float cg;
   protected bly<?> bz;
   private boolean ch;

   protected bky(bkm<? extends bky> $$0, crs $$1) {
      super($$0, $$1);
      this.bN = new bmb(bmf.a($$0));
      this.c(this.eL());
      this.I = true;
      this.aT = (float)((Math.random() + 1.0) * 0.01F);
      this.ap();
      this.aS = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.aW = this.dB();
      this.t(0.6F);
      sn $$2 = sn.a;
      this.bz = this.a(new Dynamic($$2, (sw)$$2.createMap(ImmutableMap.of($$2.a("memories"), (sw)$$2.emptyMap()))));
   }

   public bly<?> dN() {
      return this.bz;
   }

   protected bly.b<?> dO() {
      return bly.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bly<?> a(Dynamic<?> $$0) {
      return this.dO().a($$0);
   }

   @Override
   public void aj() {
      this.a(this.dM().w(), Float.MAX_VALUE);
   }

   public boolean a(bkm<?> $$0) {
      return true;
   }

   @Override
   protected void b_() {
      this.an.a(t, (byte)0);
      this.an.a(bI, 0);
      this.an.a(bJ, false);
      this.an.a(bK, 0);
      this.an.a(bL, 0);
      this.an.a(bH, 1.0F);
      this.an.a(bM, Optional.empty());
   }

   public static bmd.a dP() {
      return bmd.a().a(bme.l).a(bme.i).a(bme.m).a(bme.a).a(bme.b).a(bme.k);
   }

   @Override
   protected void a(double $$0, boolean $$1, dgw $$2, ht $$3) {
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
         ht $$7 = this.dl();
         if ($$3.u() != $$7.u() || $$3.w() != $$7.w()) {
            double $$8 = $$4 - (double)$$3.u() - 0.5;
            double $$9 = $$6 - (double)$$3.w() - 0.5;
            double $$10 = Math.max(Math.abs($$8), Math.abs($$9));
            $$4 = (double)$$3.u() + 0.5 + $$8 / $$10 * 0.5;
            $$6 = (double)$$3.w() + 0.5 + $$9 / $$10 * 0.5;
         }

         float $$11 = (float)ati.f(this.ab - 3.0F);
         double $$12 = Math.min((double)(0.2F + $$11 / 15.0F), 2.5);
         int $$13 = (int)(150.0 * $$12);
         ((ama)this.dL()).a(new jk(js.c, $$2), $$4, $$5, $$6, $$13, 0.0, 0.0, 0.0, 0.15F);
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cc = Optional.empty();
      }
   }

   public final boolean dQ() {
      return this.ag().a(arf.m);
   }

   public float a(float $$0) {
      return ati.i($$0, this.cg, this.cf);
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
         boolean $$0 = this instanceof cdm;
         if (!this.dL().B) {
            if (this.bw()) {
               this.a(this.dM().f(), 1.0F);
            } else if ($$0 && !this.dL().C_().a(this.cG())) {
               double $$1 = this.dL().C_().a(this) + this.dL().C_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dL().C_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dM().v(), (float)Math.max(1, ati.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(arh.a) && !this.dL().a_(ht.a(this.dq(), this.du(), this.dw())).a(cuv.nd)) {
            boolean $$3 = !this.dQ() && !bjw.c(this) && (!$$0 || !((cdm)this).fT().a);
            if ($$3) {
               this.j(this.m(this.ch()));
               if (this.ch() == -20) {
                  this.j(0);
                  eji $$4 = this.do();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.ag.j() - this.ag.j();
                     double $$7 = this.ag.j() - this.ag.j();
                     double $$8 = this.ag.j() - this.ag.j();
                     this.dL().a(js.e, this.dq() + $$6, this.ds() + $$7, this.dw() + $$8, $$4.c, $$4.d, $$4.e);
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
            ht $$9 = this.dl();
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

      if (this.al > 0 && !(this instanceof amb)) {
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
      return this.ah % 5 == 0 && this.do().c != 0.0 && this.do().e != 0.0 && !this.N_() && cpo.k(this) && this.dT();
   }

   protected void dS() {
      eji $$0 = this.do();
      this.dL()
         .a(
            js.I,
            this.dq() + (this.ag.j() - 0.5) * (double)this.df(),
            this.ds() + 0.1,
            this.dw() + (this.ag.j() - 0.5) * (double)this.df(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.ag.i() * 0.4F + this.ag.i() > 0.9F ? 0.6F : 0.0F;
      this.a(aqn.wh, $$1, 0.6F + this.ag.i() * 0.4F);
   }

   protected boolean dT() {
      return this.dL().a_(this.aG()).a(arc.aM);
   }

   @Override
   protected float aJ() {
      return this.dT() && cpo.a(cpq.l, this) > 0 ? 1.0F : super.aJ();
   }

   @Override
   protected boolean c(dgw $$0) {
      return !$$0.i() || this.fw();
   }

   protected void dU() {
      bma $$0 = this.a(bme.m);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void dV() {
      if (!this.bh().i()) {
         int $$0 = cpo.a(cpq.l, this);
         if ($$0 > 0 && this.dT()) {
            bma $$1 = this.a(bme.m);
            if ($$1 == null) {
               return;
            }

            $$1.b(new bmc(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), bmc.a.a));
            if (this.ef().i() < 0.04F) {
               clb $$2 = this.c(bkn.c);
               $$2.a(1, this, $$0x -> $$0x.d(bkn.c));
            }
         }
      }
   }

   protected void dW() {
      bma $$0 = this.a(bme.m);
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
            bma $$1 = this.a(bme.m);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cj();
            $$1.b(new bmc(e, "Powder snow slow", (double)$$2, bmc.a.a));
         }
      }
   }

   protected void c(ht $$0) {
      int $$1 = cpo.a(cpq.j, this);
      if ($$1 > 0) {
         cpt.a(this, this.dL(), $$0, $$1);
      }

      if (this.c(this.bh())) {
         this.dU();
      }

      this.dV();
   }

   public boolean n_() {
      return false;
   }

   public float dY() {
      return this.n_() ? 0.5F : 1.0F;
   }

   protected boolean dZ() {
      return true;
   }

   protected void ea() {
      this.aM++;
      if (this.aM >= 20 && !this.dL().x_() && !this.dG()) {
         this.dL().a(this, (byte)60);
         this.a(bki.c.a);
      }
   }

   public boolean eb() {
      return !this.n_();
   }

   protected boolean ec() {
      return !this.n_();
   }

   protected int m(int $$0) {
      int $$1 = cpo.e(this);
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

   public ato ef() {
      return this.ag;
   }

   @Nullable
   public bky eg() {
      return this.bU;
   }

   @Override
   public bky T_() {
      return this.eg();
   }

   public int eh() {
      return this.bV;
   }

   public void c(@Nullable cdm $$0) {
      this.aY = $$0;
      this.aZ = this.ah;
   }

   public void a(@Nullable bky $$0) {
      this.bU = $$0;
      this.bV = this.ah;
   }

   @Nullable
   public bky ei() {
      return this.bW;
   }

   public int ej() {
      return this.bX;
   }

   public void A(bki $$0) {
      if ($$0 instanceof bky) {
         this.bW = (bky)$$0;
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

   protected boolean a(bkn $$0) {
      return true;
   }

   public void a(bkn $$0, clb $$1, clb $$2) {
      boolean $$3 = $$2.b() && $$1.b();
      if (!$$3 && !clb.c($$1, $$2) && !this.am) {
         ckc $$4 = ckc.c_($$2);
         if (!this.dL().x_() && !this.N_()) {
            if (!this.aS() && $$4 != null && $$4.g() == $$0) {
               this.dL().a(null, this.dq(), this.ds(), this.dw(), $$4.ar_(), this.da(), 1.0F, 1.0F);
            }

            if (this.a($$0)) {
               this.a($$4 != null ? dlg.v : dlg.S);
            }
         }
      }
   }

   @Override
   public void a(bki.c $$0) {
      super.a($$0);
      this.bz.a();
   }

   @Override
   public void b(rz $$0) {
      $$0.a("Health", this.eu());
      $$0.a("HurtTime", (short)this.aK);
      $$0.a("HurtByTimestamp", this.bV);
      $$0.a("DeathTime", (short)this.aM);
      $$0.a("AbsorptionAmount", this.fk());
      $$0.a("Attributes", this.eQ().c());
      if (!this.bP.isEmpty()) {
         sf $$1 = new sf();

         for (bjv $$2 : this.bP.values()) {
            $$1.add($$2.a(new rz()));
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fw());
      this.fB().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<sw> $$3 = this.bz.a(sn.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(rz $$0) {
      this.z($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dL() != null && !this.dL().B) {
         this.eQ().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         sf $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            rz $$3 = $$1.a($$2);
            bjv $$4 = bjv.b($$3);
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
         ekf $$6 = this.dL().I().d($$5);
         boolean $$7 = $$6 != null && this.dL().I().a(this.cw(), $$6);
         if (!$$7) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         ht $$8 = new ht($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$8);
         this.an.b(as, blk.c);
         if (!this.am) {
            this.a($$8);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bz = this.a(new Dynamic(sn.a, $$0.c("Brain")));
      }
   }

   protected void em() {
      Iterator<bjt> $$0 = this.bP.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            bjt $$1 = $$0.next();
            bjv $$2 = this.bP.get($$1);
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
            this.dL().a($$4 ? js.a : js.v, this.d(0.5), this.dt(), this.g(0.5), $$7, $$8, $$9);
         }
      }
   }

   protected void H() {
      if (this.bP.isEmpty()) {
         this.ep();
         this.j(false);
      } else {
         Collection<bjv> $$0 = this.bP.values();
         this.an.b(bJ, c($$0));
         this.an.b(bI, cna.a($$0));
         this.j(this.a(bjx.n));
      }
   }

   private void s() {
      boolean $$0 = this.cc();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable bki $$0) {
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
         clb $$3 = this.c(bkn.f);
         bkm<?> $$4 = $$0.ag();
         if ($$4 == bkm.aJ && $$3.a(cle.ts)
            || $$4 == bkm.bp && $$3.a(cle.tv)
            || $$4 == bkm.aw && $$3.a(cle.ty)
            || $$4 == bkm.ax && $$3.a(cle.ty)
            || $$4 == bkm.u && $$3.a(cle.tw)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bky $$0) {
      return $$0 instanceof cdm && this.dL().ai() == bin.a ? false : $$0.en();
   }

   public boolean a(bky $$0, bvk $$1) {
      return $$1.a(this, $$0);
   }

   public boolean en() {
      return !this.cq() && this.eo();
   }

   public boolean eo() {
      return !this.N_() && this.bv();
   }

   public static boolean c(Collection<bjv> $$0) {
      for (bjv $$1 : $$0) {
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
         Iterator<bjv> $$0 = this.bP.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<bjv> er() {
      return this.bP.values();
   }

   public Map<bjt, bjv> es() {
      return this.bP;
   }

   public boolean a(bjt $$0) {
      return this.bP.containsKey($$0);
   }

   @Nullable
   public bjv b(bjt $$0) {
      return this.bP.get($$0);
   }

   public final boolean b(bjv $$0) {
      return this.b($$0, null);
   }

   public boolean b(bjv $$0, @Nullable bki $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         bjv $$2 = this.bP.get($$0.c());
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

   public boolean c(bjv $$0) {
      if (this.eR() == bld.b) {
         bjt $$1 = $$0.c();
         if ($$1 == bjx.j || $$1 == bjx.s) {
            return false;
         }
      }

      return true;
   }

   public void c(bjv $$0, @Nullable bki $$1) {
      if (this.c($$0)) {
         bjv $$2 = this.bP.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean et() {
      return this.eR() == bld.b;
   }

   @Nullable
   public bjv c(@Nullable bjt $$0) {
      return this.bP.remove($$0);
   }

   public boolean d(bjt $$0) {
      bjv $$1 = this.c($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(bjv $$0, @Nullable bki $$1) {
      this.bT = true;
      if (!this.dL().B) {
         $$0.c().a(this.eQ(), $$0.e());
         this.d($$0);
      }
   }

   public void d(bjv $$0) {
      for (bki $$1 : this.cP()) {
         if ($$1 instanceof amb $$2) {
            $$2.c.b(new ace(this.ah(), $$0));
         }
      }
   }

   protected void a(bjv $$0, boolean $$1, @Nullable bki $$2) {
      this.bT = true;
      if ($$1 && !this.dL().B) {
         bjt $$3 = $$0.c();
         $$3.a(this.eQ());
         $$3.a(this.eQ(), $$0.e());
         this.w();
      }

      if (!this.dL().B) {
         this.d($$0);
      }
   }

   protected void a(bjv $$0) {
      this.bT = true;
      if (!this.dL().B) {
         $$0.c().a(this.eQ());
         this.w();

         for (bki $$1 : this.cP()) {
            if ($$1 instanceof amb $$2) {
               $$2.c.b(new aam(this.ah(), $$0.c()));
            }
         }
      }
   }

   private void w() {
      for (bma $$0 : this.eQ().a()) {
         this.d($$0.a());
      }
   }

   private void d(blz $$0) {
      if ($$0 == bme.l) {
         float $$1 = this.eL();
         if (this.eu() > $$1) {
            this.c($$1);
         }
      } else if ($$0 == bme.k) {
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
      this.an.b(bH, ati.a($$0, 0.0F, this.eL()));
   }

   public boolean ev() {
      return this.eu() <= 0.0F;
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dL().B) {
         return false;
      } else if (this.ev()) {
         return false;
      } else if ($$0.a(are.i) && this.a(bjx.l)) {
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
            if (!$$0.a(are.j) && $$0.c() instanceof bky $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(are.o) && this.ag().a(arf.l)) {
            $$1 *= 5.0F;
         }

         this.aQ.a(1.5F);
         boolean $$7 = true;
         if ((float)this.al > 10.0F && !$$0.a(are.e)) {
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

         if ($$0.a(are.a) && !this.c(bkn.f).b()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         bki $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof bky $$9 && !$$0.a(are.q)) {
               this.a($$9);
            }

            if ($$8 instanceof cdm $$10) {
               this.aZ = 100;
               this.aY = $$10;
            } else if ($$8 instanceof bxm $$11 && $$11.s()) {
               this.aZ = 100;
               if ($$11.P_() instanceof cdm $$12) {
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

            if (!$$0.a(are.r) && (!$$3 || $$1 > 0.0F)) {
               this.bo();
            }

            if ($$8 != null && !$$0.a(are.z)) {
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
               aqm $$15 = this.m_();
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

         if (this instanceof amb) {
            al.h.a((amb)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((amb)this).a(aqx.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof amb) {
            al.g.a((amb)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$16;
      }
   }

   protected void d(bky $$0) {
      $$0.e(this);
   }

   protected void e(bky $$0) {
      $$0.q(0.5, $$0.dq() - this.dq(), $$0.dw() - this.dw());
   }

   private boolean h(bjg $$0) {
      if ($$0.a(are.d)) {
         return false;
      } else {
         clb $$1 = null;

         for (bip $$2 : bip.values()) {
            clb $$3 = this.b($$2);
            if ($$3.a(cle.uA)) {
               $$1 = $$3.p();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof amb $$4) {
               $$4.b(aqx.c.b(cle.uA));
               al.B.a($$4, $$1);
               this.a(dlg.C);
            }

            this.c(1.0F);
            this.eq();
            this.b(new bjv(bjx.j, 900, 1));
            this.b(new bjv(bjx.v, 100, 1));
            this.b(new bjv(bjx.l, 800, 0));
            this.dL().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bjg ew() {
      if (this.dL().V() - this.ce > 40L) {
         this.cd = null;
      }

      return this.cd;
   }

   protected void e(bjg $$0) {
      aqm $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eV(), this.eW());
      }
   }

   public boolean f(bjg $$0) {
      bki $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cds $$3 && $$3.B() > 0) {
         $$2 = true;
      }

      if (!$$0.a(are.c) && this.fu() && !$$2) {
         eji $$4 = $$0.h();
         if ($$4 != null) {
            eji $$5 = this.b(0.0F, this.co());
            eji $$6 = $$4.a(this.dj());
            $$6 = new eji($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(clb $$0) {
      if (!$$0.b()) {
         if (!this.aS()) {
            this.dL().a(this.dq(), this.ds(), this.dw(), aqn.md, this.da(), 0.8F, 0.8F + this.dL().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bjg $$0) {
      if (!this.dG() && !this.ba) {
         bki $$1 = $$0.d();
         bky $$2 = this.eK();
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
         if (this.dL() instanceof ama $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(dlg.p);
               this.g($$0);
               this.f($$2);
            }

            this.dL().a(this, (byte)3);
         }

         this.b(blk.h);
      }
   }

   protected void f(@Nullable bky $$0) {
      if (!this.dL().B) {
         boolean $$1 = false;
         if ($$0 instanceof bzt) {
            if (this.dL().X().b(cro.c)) {
               ht $$2 = this.dl();
               dgw $$3 = cuv.cd.o();
               if (this.dL().a_($$2).i() && $$3.a((crv)this.dL(), $$2)) {
                  this.dL().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               caf $$4 = new caf(this.dL(), this.dq(), this.ds(), this.dw(), new clb(cle.da));
               this.dL().b($$4);
            }
         }
      }
   }

   protected void g(bjg $$0) {
      bki $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof cdm) {
         $$2 = cpo.h((bky)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.aZ > 0;
      if (this.ec() && this.dL().X().b(cro.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.ex();
      this.ey();
   }

   protected void ex() {
   }

   protected void ey() {
      if (this.dL() instanceof ama && !this.eC() && (this.ee() || this.aZ > 0 && this.eb() && this.dL().X().b(cro.f))) {
         bko.a((ama)this.dL(), this.dj(), this.ed());
      }
   }

   protected void a(bjg $$0, int $$1, boolean $$2) {
   }

   public agg ez() {
      return this.ag().j();
   }

   public long eA() {
      return 0L;
   }

   protected void a(bjg $$0, boolean $$1) {
      agg $$2 = this.ez();
      eet $$3 = this.dL().n().aH().getLootTable($$2);
      eer.a $$4 = new eer.a((ama)this.dL()).a(egw.a, this).a(egw.f, this.dj()).a(egw.c, $$0).b(egw.d, $$0.d()).b(egw.e, $$0.c());
      if ($$1 && this.aY != null) {
         $$4 = $$4.a(egw.b, this.aY).a(this.aY.go());
      }

      eer $$5 = $$4.a(egv.g);
      $$3.a($$5, this.eA(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.b(bme.i);
      if (!($$0 <= 0.0)) {
         this.au = true;
         eji $$3 = this.do();
         eji $$4 = new eji($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aA() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected aqm d(bjg $$0) {
      return aqn.jd;
   }

   @Nullable
   protected aqm m_() {
      return aqn.iY;
   }

   private aqm d(int $$0) {
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

   protected ejd eE() {
      ejd $$0 = this.cG();
      bki $$1 = this.cY();
      if ($$1 != null) {
         eji $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public bky.a eF() {
      return new bky.a(aqn.je, aqn.iW);
   }

   protected aqm c(clb $$0) {
      return $$0.N();
   }

   public aqm d(clb $$0) {
      return $$0.O();
   }

   public Optional<ht> eG() {
      return this.cc;
   }

   public boolean d_() {
      if (this.N_()) {
         return false;
      } else {
         ht $$0 = this.dl();
         dgw $$1 = this.dm();
         if ($$1.a(arc.aO)) {
            this.cc = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dde && this.c($$0, $$1)) {
            this.cc = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(ht $$0, dgw $$1) {
      if ($$1.c(dde.b)) {
         dgw $$2 = this.dL().a_($$0.d());
         if ($$2.a(cuv.cO) && $$2.c(cyy.b) == $$1.c(dde.aE)) {
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
   public boolean a(float $$0, float $$1, bjg $$2) {
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
      if (this.ag().a(arf.o)) {
         return 0;
      } else {
         bjv $$2 = this.b(bjx.h);
         float $$3 = $$2 == null ? 0.0F : (float)($$2.e() + 1);
         return ati.f(($$0 - 3.0F - $$3) * $$1);
      }
   }

   protected void eH() {
      if (!this.aS()) {
         int $$0 = ati.a(this.dq());
         int $$1 = ati.a(this.ds() - 0.2F);
         int $$2 = ati.a(this.dw());
         dgw $$3 = this.dL().a_(new ht($$0, $$1, $$2));
         if (!$$3.i()) {
            dcf $$4 = $$3.w();
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
      return ati.a(this.b(bme.a));
   }

   protected void b(bjg $$0, float $$1) {
   }

   protected void c(bjg $$0, float $$1) {
   }

   protected void u(float $$0) {
   }

   protected float d(bjg $$0, float $$1) {
      if (!$$0.a(are.b)) {
         this.b($$0, $$1);
         $$1 = bjc.a($$1, (float)this.eI(), (float)this.b(bme.b));
      }

      return $$1;
   }

   protected float e(bjg $$0, float $$1) {
      if ($$0.a(are.f)) {
         return $$1;
      } else {
         if (this.a(bjx.k) && !$$0.a(are.g)) {
            int $$2 = (this.b(bjx.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof amb) {
                  ((amb)this).a(aqx.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof amb) {
                  ((amb)$$0.d()).a(aqx.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(are.h)) {
            return $$1;
         } else {
            int $$7 = cpo.a(this.bK(), $$0);
            if ($$7 > 0) {
               $$1 = bjc.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bjg $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fk(), 0.0F);
         this.y(this.fk() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof amb $$4) {
            $$4.a(aqx.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eJ().a($$0, var9);
            this.c(this.eu() - var9);
            this.y(this.fk() - var9);
            this.a(dlg.o);
         }
      }
   }

   public bjd eJ() {
      return this.bO;
   }

   @Nullable
   public bky eK() {
      if (this.aY != null) {
         return this.aY;
      } else {
         return this.bU != null ? this.bU : null;
      }
   }

   public final float eL() {
      return (float)this.b(bme.l);
   }

   public final float eM() {
      return (float)this.b(bme.k);
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
      if (bjw.a(this)) {
         return 6 - (1 + bjw.b(this));
      } else {
         return this.a(bjx.d) ? 6 + (1 + this.b(bjx.d).e()) * 2 : 6;
      }
   }

   public void a(bip $$0) {
      this.a($$0, false);
   }

   public void a(bip $$0, boolean $$1) {
      if (!this.aF || this.aH >= this.z() / 2 || this.aH < 0) {
         this.aH = -1;
         this.aF = true;
         this.aG = $$0;
         if (this.dL() instanceof ama) {
            yg $$2 = new yg(this, $$0 == bip.a ? 0 : 3);
            aly $$3 = ((ama)this.dL()).k();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bjg $$0) {
      this.aQ.a(1.5F);
      this.al = 20;
      this.aL = 10;
      this.aK = this.aL;
      aqm $$1 = this.d($$0);
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
            aqm $$1 = this.m_();
            if ($$1 != null) {
               this.a($$1, this.eV(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cdm)) {
               this.c(0.0F);
               this.a(this.dM().n());
            }
            break;
         case 29:
            this.a(aqn.uU, 1.0F, 0.8F + this.dL().z.i() * 0.4F);
            break;
         case 30:
            this.a(aqn.uV, 0.8F, 0.8F + this.dL().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ag.i() - 0.5F) * 0.2F;
               float $$6 = (this.ag.i() - 0.5F) * 0.2F;
               float $$7 = (this.ag.i() - 0.5F) * 0.2F;
               double $$8 = ati.d($$4, this.K, this.dq()) + (this.ag.j() - 0.5) * (double)this.df() * 2.0;
               double $$9 = ati.d($$4, this.L, this.ds()) + this.ag.j() * (double)this.dg();
               double $$10 = ati.d($$4, this.M, this.dw()) + (this.ag.j() - 0.5) * (double)this.df() * 2.0;
               this.dL().a(js.X, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.c(bkn.a));
            break;
         case 48:
            this.i(this.c(bkn.b));
            break;
         case 49:
            this.i(this.c(bkn.f));
            break;
         case 50:
            this.i(this.c(bkn.e));
            break;
         case 51:
            this.i(this.c(bkn.d));
            break;
         case 52:
            this.i(this.c(bkn.c));
            break;
         case 54:
            cym.b(this);
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
         this.dL().a(js.W, this.d(1.0), this.dt(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void B() {
      clb $$0 = this.c(bkn.b);
      this.a(bkn.b, this.c(bkn.a));
      this.a(bkn.a, $$0);
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
   public bma a(blz $$0) {
      return this.eQ().a($$0);
   }

   public double a(ib<blz> $$0) {
      return this.b($$0.a());
   }

   public double b(blz $$0) {
      return this.eQ().c($$0);
   }

   public double b(ib<blz> $$0) {
      return this.c($$0.a());
   }

   public double c(blz $$0) {
      return this.eQ().d($$0);
   }

   public bmb eQ() {
      return this.bN;
   }

   public bld eR() {
      return bld.a;
   }

   public clb eS() {
      return this.c(bkn.a);
   }

   public clb eT() {
      return this.c(bkn.b);
   }

   public boolean b(ckw $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<clb> $$0) {
      return $$0.test(this.eS()) || $$0.test(this.eT());
   }

   public clb b(bip $$0) {
      if ($$0 == bip.a) {
         return this.c(bkn.a);
      } else if ($$0 == bip.b) {
         return this.c(bkn.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bip $$0, clb $$1) {
      if ($$0 == bip.a) {
         this.a(bkn.a, $$1);
      } else {
         if ($$0 != bip.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bkn.b, $$1);
      }
   }

   public boolean b(bkn $$0) {
      return !this.c($$0).b();
   }

   @Override
   public abstract Iterable<clb> bK();

   public abstract clb c(bkn var1);

   @Override
   public abstract void a(bkn var1, clb var2);

   protected void e(clb $$0) {
      rz $$1 = $$0.v();
      if ($$1 != null) {
         $$0.d().b($$1);
      }
   }

   public float eU() {
      Iterable<clb> $$0 = this.bK();
      int $$1 = 0;
      int $$2 = 0;

      for (clb $$3 : $$0) {
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
      bma $$1 = this.a(bme.m);
      $$1.b(bA.a());
      if ($$0) {
         $$1.b(bA);
      }
   }

   protected float eV() {
      return 1.0F;
   }

   public float eW() {
      return this.n_() ? (this.ag.i() - this.ag.i()) * 0.2F + 1.5F : (this.ag.i() - this.ag.i()) * 0.2F + 1.0F;
   }

   protected boolean eX() {
      return this.ev();
   }

   @Override
   public void g(bki $$0) {
      if (!this.fD()) {
         super.g($$0);
      }
   }

   private void a(bki $$0) {
      eji $$1;
      if (this.dG()) {
         $$1 = this.dj();
      } else if (!$$0.dG() && !this.dL().a_($$0.dl()).a(arc.aI)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.ds(), $$0.ds());
         $$1 = new eji(this.dq(), $$2, this.dw());
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
      return this.a(bjx.h) ? 0.1F * ((float)this.b(bjx.h).e() + 1.0F) : 0.0F;
   }

   protected void fa() {
      eji $$0 = this.do();
      this.o($$0.c, (double)this.eY(), $$0.e);
      if (this.bX()) {
         float $$1 = this.dB() * (float) (Math.PI / 180.0);
         this.f(this.do().b((double)(-ati.a($$1) * 0.2F), 0.0, (double)(ati.b($$1) * 0.2F)));
      }

      this.au = true;
   }

   protected void fb() {
      this.f(this.do().b(0.0, -0.04F, 0.0));
   }

   protected void c(arr<ecf> $$0) {
      this.f(this.do().b(0.0, 0.04F, 0.0));
   }

   protected float fc() {
      return 0.8F;
   }

   public boolean a(ecg $$0) {
      return false;
   }

   public void h(eji $$0) {
      if (this.cW()) {
         double $$1 = 0.08;
         boolean $$2 = this.do().d <= 0.0;
         if ($$2 && this.a(bjx.B)) {
            $$1 = 0.01;
         }

         ecg $$3 = this.dL().b_(this.dl());
         if (this.aX() && this.dZ() && !this.a($$3)) {
            double $$4 = this.ds();
            float $$5 = this.bX() ? 0.9F : this.fc();
            float $$6 = 0.02F;
            float $$7 = (float)cpo.f(this);
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

            if (this.a(bjx.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(ble.a, this.do());
            eji $$8 = this.do();
            if (this.P && this.d_()) {
               $$8 = new eji($$8.c, 0.2, $$8.e);
            }

            this.f($$8.d((double)$$5, 0.8F, (double)$$5));
            eji $$9 = this.a($$1, $$2, this.do());
            this.f($$9);
            if (this.P && this.g($$9.c, $$9.d + 0.6F - this.ds() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bl() && this.dZ() && !this.a($$3)) {
            double $$10 = this.ds();
            this.a(0.02F, $$0);
            this.a(ble.a, this.do());
            if (this.b(arh.b) <= this.de()) {
               this.f(this.do().d(0.5, 0.8F, 0.5));
               eji $$11 = this.a($$1, $$2, this.do());
               this.f($$11);
            } else {
               this.f(this.do().a(0.5));
            }

            if (!this.aT()) {
               this.f(this.do().b(0.0, -$$1 / 4.0, 0.0));
            }

            eji $$12 = this.do();
            if (this.P && this.g($$12.c, $$12.d + 0.6F - this.ds() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fw()) {
            this.cm();
            eji $$13 = this.do();
            eji $$14 = this.bE();
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
               double $$21 = $$17 * (double)(-ati.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.f($$13.d(0.99F, 0.98F, 0.99F));
            this.a(ble.a, this.do());
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
            ht $$25 = this.aG();
            float $$26 = this.dL().a_($$25).b().i();
            float $$27 = this.aA() ? $$26 * 0.91F : 0.91F;
            eji $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.a(bjx.y)) {
               $$29 += (0.05 * (double)(this.b(bjx.y).e() + 1) - $$28.d) * 0.2;
            } else if (this.dL().B && !this.dL().A($$25)) {
               if (this.ds() > (double)this.dL().I_()) {
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

      this.q(this instanceof bws);
   }

   private void c(cdm $$0, eji $$1) {
      eji $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.cW()) {
         this.w(this.e($$0));
         this.h($$2);
      } else {
         this.q(false);
         this.f(eji.b);
         this.aB();
      }
   }

   protected void a(cdm $$0, eji $$1) {
   }

   protected eji b(cdm $$0, eji $$1) {
      return $$1;
   }

   protected float e(cdm $$0) {
      return this.fe();
   }

   public void q(boolean $$0) {
      float $$1 = (float)ati.g(this.dq() - this.K, $$0 ? this.ds() - this.L : 0.0, this.dw() - this.M);
      this.v($$1);
   }

   protected void v(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aQ.a($$1, 0.4F);
   }

   public eji a(eji $$0, float $$1) {
      this.a(this.A($$1), $$0);
      this.f(this.j(this.do()));
      this.a(ble.a, this.do());
      eji $$2 = this.do();
      if ((this.P || this.bj) && (this.d_() || this.dm().a(cuv.qC) && dam.a(this))) {
         $$2 = new eji($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public eji a(double $$0, boolean $$1, eji $$2) {
      if (!this.aT() && !this.bX()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new eji($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private eji j(eji $$0) {
      if (this.d_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = ati.a($$0.c, -0.15F, 0.15F);
         double $$3 = ati.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dm().a(cuv.nS) && this.fv() && this instanceof cdm) {
            $$4 = 0.0;
         }

         $$0 = new eji($$2, $$4, $$3);
      }

      return $$0;
   }

   private float A(float $$0) {
      return this.aA() ? this.fe() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fd();
   }

   protected float fd() {
      return this.cN() instanceof cdm ? this.fe() * 0.1F : 0.02F;
   }

   public float fe() {
      return this.bY;
   }

   public void w(float $$0) {
      this.bY = $$0;
   }

   public boolean C(bki $$0) {
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
         this.c_();
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
         float $$8 = (float)ati.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = ati.e(ati.g(this.dB()) - $$8);
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
      Map<bkn, clb> $$0 = this.E();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bkn, clb> E() {
      Map<bkn, clb> $$0 = null;

      for (bkn $$1 : bkn.values()) {
         clb $$2;
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

         clb $$5 = this.c($$1);
         if (this.a($$2, $$5)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bkn.class);
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

   public boolean a(clb $$0, clb $$1) {
      return !clb.a($$1, $$0);
   }

   private void a(Map<bkn, clb> $$0) {
      clb $$1 = $$0.get(bkn.a);
      clb $$2 = $$0.get(bkn.b);
      if ($$1 != null && $$2 != null && clb.a($$1, this.f(bkn.b)) && clb.a($$2, this.f(bkn.a))) {
         ((ama)this.dL()).k().b(this, new zf(this, (byte)55));
         $$0.remove(bkn.a);
         $$0.remove(bkn.b);
         this.c(bkn.a, $$1.p());
         this.c(bkn.b, $$2.p());
      }
   }

   private void b(Map<bkn, clb> $$0) {
      List<Pair<bkn, clb>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         clb $$3 = $$2.p();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
         }
      });
      ((ama)this.dL()).k().b(this, new abh(this.ah(), $$1));
   }

   private clb e(bkn $$0) {
      return this.bR.get($$0.b());
   }

   private void b(bkn $$0, clb $$1) {
      this.bR.set($$0.b(), $$1);
   }

   private clb f(bkn $$0) {
      return this.bQ.get($$0.b());
   }

   private void c(bkn $$0, clb $$1) {
      this.bQ.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = ati.g($$0 - this.aU);
      this.aU += $$2 * 0.3F;
      float $$3 = ati.g(this.dB() - this.aU);
      float $$4 = this.ff();
      if (Math.abs($$3) > $$4) {
         this.aU = this.aU + ($$3 - (float)ati.j((double)$$3) * $$4);
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

   public void c_() {
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

      eji $$0 = this.do();
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
            $$4 = this.b(arh.b);
         } else {
            $$4 = this.b(arh.a);
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
               this.c(arh.b);
            }
         } else {
            this.c(arh.a);
         }
      } else {
         this.bZ = 0;
      }

      this.dL().ad().c();
      this.dL().ad().a("travel");
      this.bk *= 0.98F;
      this.bm *= 0.98F;
      this.F();
      ejd $$8 = this.cG();
      eji $$9 = new eji((double)this.bk, (double)this.bl, (double)this.bm);
      if (this.a(bjx.B) || this.a(bjx.y)) {
         this.n();
      }

      label104: {
         if (this.cN() instanceof cdm $$10 && this.bv()) {
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
      if ($$0 && !this.aA() && !this.bN() && !this.a(bjx.y)) {
         clb $$1 = this.c(bkn.e);
         if ($$1.a(cle.nh) && cjv.d($$1)) {
            $$0 = true;
            int $$2 = this.bx + 1;
            if (!this.dL().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, $$0x -> $$0x.d(bkn.e));
               }

               this.a(dlg.n);
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
      if (this.dL().x_()) {
         this.dL().a(dku.a(cdm.class), this.cG(), bkl.a(this)).forEach(this::D);
      } else {
         List<bki> $$0 = this.dL().a(this, this.cG(), bkl.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dL().X().c(cro.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ag.a(4) == 0) {
               int $$2 = 0;

               for (bki $$3 : $$0) {
                  if (!$$3.bN()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dM().g(), 6.0F);
               }
            }

            for (bki $$4 : $$0) {
               this.D($$4);
            }
         }
      }
   }

   protected void a(ejd $$0, ejd $$1) {
      ejd $$2 = $$0.b($$1);
      List<bki> $$3 = this.dL().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bki $$4 : $$3) {
            if ($$4 instanceof bky) {
               this.g((bky)$$4);
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

   protected void D(bki $$0) {
      $$0.g(this);
   }

   protected void g(bky $$0) {
   }

   public boolean fj() {
      return (this.an.b(t) & 4) != 0;
   }

   @Override
   public void aa() {
      bki $$0 = this.cY();
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
   public double o_() {
      return this.bn > 0 ? this.bo : this.dq();
   }

   @Override
   public double L_() {
      return this.bn > 0 ? this.bp : this.ds();
   }

   @Override
   public double M_() {
      return this.bn > 0 ? this.bq : this.dw();
   }

   @Override
   public float e_() {
      return this.bn > 0 ? (float)this.bs : this.dD();
   }

   @Override
   public float p_() {
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

   public void a(caf $$0) {
      bki $$1 = $$0.v();
      if ($$1 instanceof amb) {
         al.O.a((amb)$$1, $$0.q(), this);
      }
   }

   public void a(bki $$0, int $$1) {
      if (!$$0.dG() && !this.dL().B && ($$0 instanceof caf || $$0 instanceof cds || $$0 instanceof bko)) {
         ((ama)this.dL()).k().b($$0, new aca($$0.ah(), this.ah(), $$1));
      }
   }

   public boolean E(bki $$0) {
      if ($$0.dL() != this.dL()) {
         return false;
      } else {
         eji $$1 = new eji(this.dq(), this.du(), this.dw());
         eji $$2 = new eji($$0.dq(), $$0.du(), $$0.dw());
         return $$2.f($$1) > 128.0 ? false : this.dL().a(new crb($$1, $$2, crb.a.a, crb.b.a, this)).c() == ejg.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.aW : ati.i($$0, this.aX, this.aW);
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
      return this.bv() && !this.N_() && !this.d_();
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
   protected eji a(hx.a $$0, l.a $$1) {
      return i(super.a($$0, $$1));
   }

   public static eji i(eji $$0) {
      return new eji($$0.c, $$0.d, 0.0);
   }

   public float fk() {
      return this.ca;
   }

   public final void y(float $$0) {
      this.z(ati.a($$0, 0.0F, this.eM()));
   }

   protected void z(float $$0) {
      this.ca = $$0;
   }

   public void f_() {
   }

   public void g_() {
   }

   protected void fl() {
      this.bT = true;
   }

   public abstract bks fm();

   public boolean fn() {
      return (this.an.b(t) & 1) > 0;
   }

   public bip fo() {
      return (this.an.b(t) & 2) > 0 ? bip.b : bip.a;
   }

   private void G() {
      if (this.fn()) {
         if (clb.b(this.b(this.fo()), this.bv)) {
            this.bv = this.b(this.fo());
            this.a(this.bv);
         } else {
            this.ft();
         }
      }
   }

   protected void a(clb $$0) {
      $$0.b(this.dL(), this, this.fq());
      if (this.I()) {
         this.b($$0, 5);
      }

      if (--this.bw == 0 && !this.dL().B && !$$0.t()) {
         this.ae_();
      }
   }

   private boolean I() {
      int $$0 = this.fq();
      cgb $$1 = this.bv.d().v();
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

   public void c(bip $$0) {
      clb $$1 = this.b($$0);
      if (!$$1.b() && !this.fn()) {
         this.bv = $$1;
         this.bw = $$1.r();
         if (!this.dL().B) {
            this.c(1, true);
            this.c(2, $$0 == bip.b);
            this.a(dlg.D);
         }
      }
   }

   @Override
   public void a(afm<?> $$0) {
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
            this.bv = clb.b;
            this.bw = 0;
         }
      }
   }

   @Override
   public void a(ef.a $$0, eji $$1) {
      super.a($$0, $$1);
      this.aX = this.aW;
      this.aU = this.aW;
      this.aV = this.aU;
   }

   protected void b(clb $$0, int $$1) {
      if (!$$0.b() && this.fn()) {
         if ($$0.s() == cmu.c) {
            this.a(this.c($$0), 0.5F, this.dL().z.i() * 0.1F + 0.9F);
         }

         if ($$0.s() == cmu.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(clb $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         eji $$3 = new eji(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dD() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dB() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ag.i()) * 0.6 - 0.3;
         eji $$5 = new eji(((double)this.ag.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dD() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dB() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dq(), this.du(), this.dw());
         this.dL().a(new jo(js.O, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void ae_() {
      if (!this.dL().B || this.fn()) {
         bip $$0 = this.fo();
         if (!this.bv.equals(this.b($$0))) {
            this.fs();
         } else {
            if (!this.bv.b() && this.fn()) {
               this.b(this.bv, 16);
               clb $$1 = this.bv.a(this.dL(), this);
               if ($$1 != this.bv) {
                  this.a($$0, $$1);
               }

               this.ft();
            }
         }
      }
   }

   public clb fp() {
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
            this.a(dlg.C);
         }
      }

      this.bv = clb.b;
      this.bw = 0;
   }

   public boolean fu() {
      if (this.fn() && !this.bv.b()) {
         ckw $$0 = this.bv.d();
         return $$0.c(this.bv) != cmu.d ? false : $$0.b(this.bv) - this.bw >= 5;
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
      return super.bZ() || !this.fw() && this.c(blk.b);
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
      ht $$9 = ht.a($$0, $$1, $$2);
      crs $$10 = this.dL();
      if ($$10.A($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.I_()) {
            ht $$12 = $$9.d();
            dgw $$13 = $$10.a_($$12);
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

         if (this instanceof blh) {
            ((blh)this).L().n();
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

   public void a(ht $$0, boolean $$1) {
   }

   public boolean f(clb $$0) {
      return false;
   }

   @Override
   public bkj a(blk $$0) {
      return $$0 == blk.c ? v : super.a($$0).a(this.dY());
   }

   public ImmutableList<blk> fA() {
      return ImmutableList.of(blk.a);
   }

   public ejd e(blk $$0) {
      bkj $$1 = this.a($$0);
      return new ejd((double)(-$$1.a / 2.0F), 0.0, (double)(-$$1.a / 2.0F), (double)($$1.a / 2.0F), (double)$$1.b, (double)($$1.a / 2.0F));
   }

   protected boolean f(blk $$0) {
      ejd $$1 = this.a($$0).a(this.dj());
      return this.dL().b(this, $$1);
   }

   @Override
   public boolean cs() {
      return super.cs() && !this.fD();
   }

   public Optional<ht> fB() {
      return this.an.b(bM);
   }

   public void g(ht $$0) {
      this.an.b(bM, Optional.of($$0));
   }

   public void fC() {
      this.an.b(bM, Optional.empty());
   }

   public boolean fD() {
      return this.fB().isPresent();
   }

   public void b(ht $$0) {
      if (this.bN()) {
         this.aa();
      }

      dgw $$1 = this.dL().a_($$0);
      if ($$1.b() instanceof cum) {
         this.dL().a($$0, $$1.a(cum.c, Boolean.valueOf(true)), 3);
      }

      this.b(blk.c);
      this.a($$0);
      this.g($$0);
      this.f(eji.b);
      this.au = true;
   }

   private void a(ht $$0) {
      this.e((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean L() {
      return this.fB().map($$0 -> this.dL().a_($$0).b() instanceof cum).orElse(false);
   }

   public void fE() {
      this.fB().filter(this.dL()::A).ifPresent($$0x -> {
         dgw $$1 = this.dL().a_($$0x);
         if ($$1.b() instanceof cum) {
            hx $$2 = $$1.c(cum.aE);
            this.dL().a($$0x, $$1.a(cum.c, Boolean.valueOf(false)), 3);
            eji $$3 = cum.a(this.ag(), this.dL(), $$0x, $$2, this.dB()).orElseGet(() -> {
               ht $$1x = $$0x.c();
               return new eji((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            eji $$4 = eji.c($$0x).d($$3).d();
            float $$5 = (float)ati.d(ati.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.e($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      eji $$0 = this.dj();
      this.b(blk.a);
      this.e($$0.c, $$0.d, $$0.e);
      this.fC();
   }

   @Nullable
   public hx fF() {
      ht $$0 = this.fB().orElse(null);
      return $$0 != null ? cum.a(this.dL(), $$0) : null;
   }

   @Override
   public boolean bw() {
      return !this.fD() && super.bw();
   }

   @Override
   protected final float a(blk $$0, bkj $$1) {
      return $$0 == blk.c ? 0.2F : this.b($$0, $$1);
   }

   protected float b(blk $$0, bkj $$1) {
      return super.a($$0, $$1);
   }

   public clb g(clb $$0) {
      return clb.b;
   }

   public clb a(crs $$0, clb $$1) {
      if ($$1.M()) {
         $$0.a(null, this.dq(), this.ds(), this.dw(), this.d($$1), aqo.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$1, $$0, this);
         if (!(this instanceof cdm) || !((cdm)this).fT().d) {
            $$1.h(1);
         }

         this.a(dlg.m);
      }

      return $$1;
   }

   private void a(clb $$0, crs $$1, bky $$2) {
      ckw $$3 = $$0.d();
      if ($$3.u()) {
         for (Pair<bjv, Float> $$5 : $$3.v().f()) {
            if (!$$1.B && $$5.getFirst() != null && $$1.z.i() < (Float)$$5.getSecond()) {
               $$2.b(new bjv((bjv)$$5.getFirst()));
            }
         }
      }
   }

   private static byte g(bkn $$0) {
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

   public void d(bkn $$0) {
      this.dL().a(this, g($$0));
   }

   public void d(bip $$0) {
      this.d($$0 == bip.a ? bkn.a : bkn.b);
   }

   @Override
   public ejd h_() {
      if (this.c(bkn.f).a(cle.tx)) {
         float $$0 = 0.5F;
         return this.cG().c(0.5, 0.5, 0.5);
      } else {
         return super.h_();
      }
   }

   public static bkn h(clb $$0) {
      ckc $$1 = ckc.c_($$0);
      return $$1 != null ? $$1.g() : bkn.a;
   }

   private static blq a(bky $$0, bkn $$1) {
      return $$1 != bkn.f && $$1 != bkn.a && $$1 != bkn.b ? blq.a($$0, $$1, $$1x -> $$1x.b() || bla.h($$1x) == $$1) : blq.a($$0, $$1);
   }

   @Nullable
   private static bkn r(int $$0) {
      if ($$0 == 100 + bkn.f.b()) {
         return bkn.f;
      } else if ($$0 == 100 + bkn.e.b()) {
         return bkn.e;
      } else if ($$0 == 100 + bkn.d.b()) {
         return bkn.d;
      } else if ($$0 == 100 + bkn.c.b()) {
         return bkn.c;
      } else if ($$0 == 98) {
         return bkn.a;
      } else {
         return $$0 == 99 ? bkn.b : null;
      }
   }

   @Override
   public blq a_(int $$0) {
      bkn $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dz() {
      if (this.N_()) {
         return false;
      } else {
         boolean $$0 = !this.c(bkn.f).a(ark.az) && !this.c(bkn.e).a(ark.az) && !this.c(bkn.d).a(ark.az) && !this.c(bkn.c).a(ark.az);
         return $$0 && super.dz();
      }
   }

   @Override
   public boolean cc() {
      return !this.dL().x_() && this.a(bjx.x) || super.cc();
   }

   @Override
   public float dC() {
      return this.aU;
   }

   @Override
   public void a(ye $$0) {
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
      return this.eS().d() instanceof ciq;
   }

   @Override
   public float dF() {
      float $$0 = super.dF();
      return this.cN() instanceof cdm ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public eji m(bki $$0) {
      return new eji(this.a($$0, this.a(this.an()), this.dY()).rotateY(-this.aU * (float) (Math.PI / 180.0))).e(this.dj());
   }

   @Override
   public float k(bki $$0) {
      return this.l($$0) * this.dY();
   }

   protected void a(int $$0, double $$1) {
      this.aW = (float)ati.e(1.0 / (double)$$0, (double)this.aW, $$1);
   }

   public static record a(aqm a, aqm b) {
   }
}
