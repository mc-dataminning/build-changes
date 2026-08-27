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

public abstract class bmo extends blw implements blu {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final bns bB = new bns(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, bns.a.c);
   public static final int g = 2;
   public static final int h = 4;
   public static final int i = 98;
   public static final int j = 100;
   public static final int k = 6;
   public static final int l = 100;
   private static final int bC = 40;
   public static final double m = 0.003;
   public static final double n = 0.08;
   public static final int o = 20;
   private static final int bD = 7;
   private static final int bE = 10;
   private static final int bF = 2;
   public static final int p = 4;
   private static final float bG = 0.42F;
   private static final double bH = 128.0;
   protected static final int q = 1;
   protected static final int r = 2;
   protected static final int s = 4;
   protected static final agn<Byte> t = agq.a(bmo.class, agp.a);
   private static final agn<Float> bI = agq.a(bmo.class, agp.d);
   private static final agn<Integer> bJ = agq.a(bmo.class, agp.b);
   private static final agn<Boolean> bK = agq.a(bmo.class, agp.k);
   private static final agn<Integer> bL = agq.a(bmo.class, agp.b);
   private static final agn<Integer> bM = agq.a(bmo.class, agp.b);
   private static final agn<Optional<hx>> bN = agq.a(bmo.class, agp.o);
   protected static final blz u = blz.c(0.2F, 0.2F).b(0.2F);
   public static final float v = 0.5F;
   public static final float aE = 0.5F;
   private final bnr bO;
   private final bks bP = new bks(this);
   private final Map<ih<blh>, blj> bQ = Maps.newHashMap();
   private final iq<cng> bR = iq.a(2, cng.f);
   private final iq<cng> bS = iq.a(4, cng.f);
   public boolean aF;
   private boolean bT = false;
   public bkb aG;
   public int aH;
   public int aI;
   public int aJ;
   public int aK;
   public int aL;
   public int aM;
   public float aN;
   public float aO;
   protected int aP;
   public final bnn aQ = new bnn();
   public final int aR = 20;
   public final float aS;
   public final float aT;
   public float aU;
   public float aV;
   public float aW;
   public float aX;
   @Nullable
   protected cfq aY;
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
   private bmo bV;
   private int bW;
   private bmo bX;
   private int bY;
   private float bZ;
   private int ca;
   private float cb;
   protected cng bv = cng.f;
   protected int bw;
   protected int bx;
   private hx cc;
   private Optional<hx> cd = Optional.empty();
   @Nullable
   private bkv ce;
   private long cf;
   protected int by;
   private float cg;
   private float ch;
   protected bno<?> bz;
   private boolean ci;
   protected float bA = 1.0F;

   protected bmo(bmc<? extends bmo> $$0, ctx $$1) {
      super($$0, $$1);
      this.bO = new bnr(bnv.a($$0));
      this.c(this.eM());
      this.I = true;
      this.aT = (float)((Math.random() + 1.0) * 0.01F);
      this.ar();
      this.aS = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.aW = this.dB();
      tc $$2 = tc.a;
      this.bz = this.a(new Dynamic($$2, (tl)$$2.createMap(ImmutableMap.of($$2.a("memories"), (tl)$$2.emptyMap()))));
   }

   public bno<?> dN() {
      return this.bz;
   }

   protected bno.b<?> dO() {
      return bno.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bno<?> a(Dynamic<?> $$0) {
      return this.dO().a($$0);
   }

   @Override
   public void al() {
      this.a(this.dM().w(), Float.MAX_VALUE);
   }

   public boolean a(bmc<?> $$0) {
      return true;
   }

   @Override
   protected void c_() {
      this.an.a(t, (byte)0);
      this.an.a(bJ, 0);
      this.an.a(bK, false);
      this.an.a(bL, 0);
      this.an.a(bM, 0);
      this.an.a(bI, 1.0F);
      this.an.a(bN, Optional.empty());
   }

   public static bnt.a dP() {
      return bnt.a().a(bnu.n).a(bnu.k).a(bnu.o).a(bnu.a).a(bnu.b).a(bnu.m).a(bnu.r).a(bnu.p);
   }

   @Override
   protected void a(double $$0, boolean $$1, djp $$2, hx $$3) {
      if (!this.aZ()) {
         this.bh();
      }

      if (!this.dL().B && $$1 && this.ab > 0.0F) {
         this.dU();
         this.dV();
      }

      if (!this.dL().B && this.ab > 3.0F && $$1 && !$$2.i()) {
         double $$4 = this.dq();
         double $$5 = this.ds();
         double $$6 = this.dw();
         hx $$7 = this.dl();
         if ($$3.u() != $$7.u() || $$3.w() != $$7.w()) {
            double $$8 = $$4 - (double)$$3.u() - 0.5;
            double $$9 = $$6 - (double)$$3.w() - 0.5;
            double $$10 = Math.max(Math.abs($$8), Math.abs($$9));
            $$4 = (double)$$3.u() + 0.5 + $$8 / $$10 * 0.5;
            $$6 = (double)$$3.w() + 0.5 + $$9 / $$10 * 0.5;
         }

         float $$11 = (float)aup.f(this.ab - 3.0F);
         double $$12 = Math.min((double)(0.2F + $$11 / 15.0F), 2.5);
         int $$13 = (int)(150.0 * $$12);
         ((ane)this.dL()).a(new jp(jx.c, $$2), $$4, $$5, $$6, $$13, 0.0, 0.0, 0.0, 0.15F);
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cd = Optional.empty();
      }
   }

   public final boolean dQ() {
      return this.ai().a(asl.m);
   }

   public float a(float $$0) {
      return aup.i($$0, this.ch, this.cg);
   }

   @Override
   public void as() {
      this.aN = this.aO;
      if (this.am) {
         this.fB().ifPresent(this::a);
      }

      if (this.dR()) {
         this.dS();
      }

      super.as();
      this.dL().af().a("livingEntityBaseTick");
      if (this.aY() || this.dL().B) {
         this.aA();
      }

      if (this.bx()) {
         boolean $$0 = this instanceof cfq;
         if (!this.dL().B) {
            if (this.by()) {
               this.a(this.dM().f(), 1.0F);
            } else if ($$0 && !this.dL().D_().a(this.cH())) {
               double $$1 = this.dL().D_().a(this) + this.dL().D_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dL().D_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dM().v(), (float)Math.max(1, aup.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(asn.a) && !this.dL().a_(hx.a(this.dq(), this.du(), this.dw())).a(cxa.nd)) {
            boolean $$3 = !this.dQ() && !blk.c(this) && (!$$0 || !((cfq)this).fT().a);
            if ($$3) {
               this.j(this.m(this.ci()));
               if (this.ci() == -20) {
                  this.j(0);
                  emc $$4 = this.do();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.ag.j() - this.ag.j();
                     double $$7 = this.ag.j() - this.ag.j();
                     double $$8 = this.ag.j() - this.ag.j();
                     this.dL().a(jx.e, this.dq() + $$6, this.ds() + $$7, this.dw() + $$8, $$4.c, $$4.d, $$4.e);
                  }

                  this.a(this.dM().h(), 2.0F);
               }
            }

            if (!this.dL().B && this.bO() && this.cZ() != null && this.cZ().bQ()) {
               this.ac();
            }
         } else if (this.ci() < this.ch()) {
            this.j(this.n(this.ci()));
         }

         if (!this.dL().B) {
            hx $$9 = this.dl();
            if (!Objects.equal(this.cc, $$9)) {
               this.cc = $$9;
               this.c($$9);
            }
         }
      }

      if (this.bx() && (this.bb() || this.aA)) {
         this.aF();
      }

      if (this.aK > 0) {
         this.aK--;
      }

      if (this.al > 0 && !(this instanceof anf)) {
         this.al--;
      }

      if (this.ew() && this.dL().h(this)) {
         this.eb();
      }

      if (this.aZ > 0) {
         this.aZ--;
      } else {
         this.aY = null;
      }

      if (this.bX != null && !this.bX.bx()) {
         this.bX = null;
      }

      if (this.bV != null) {
         if (!this.bV.bx()) {
            this.a(null);
         } else if (this.ah - this.bW > 100) {
            this.a(null);
         }
      }

      this.en();
      this.bf = this.be;
      this.aV = this.aU;
      this.aX = this.aW;
      this.N = this.dB();
      this.O = this.dD();
      this.dL().af().c();
   }

   public boolean dR() {
      return this.ah % 5 == 0 && this.do().c != 0.0 && this.do().e != 0.0 && !this.P_() && crt.k(this) && this.dT();
   }

   protected void dS() {
      emc $$0 = this.do();
      this.dL()
         .a(
            jx.K,
            this.dq() + (this.ag.j() - 0.5) * (double)this.dg(),
            this.ds() + 0.1,
            this.dw() + (this.ag.j() - 0.5) * (double)this.dg(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.ag.i() * 0.4F + this.ag.i() > 0.9F ? 0.6F : 0.0F;
      this.a(art.xi, $$1, 0.6F + this.ag.i() * 0.4F);
   }

   protected boolean dT() {
      return this.dL().a_(this.aI()).a(asi.aM);
   }

   @Override
   protected float aL() {
      return this.dT() && crt.a(crv.l, this) > 0 ? 1.0F : super.aL();
   }

   @Override
   protected boolean c(djp $$0) {
      return !$$0.i() || this.fw();
   }

   protected void dU() {
      bnq $$0 = this.f(bnu.o);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void dV() {
      if (!this.bj().i()) {
         int $$0 = crt.a(crv.l, this);
         if ($$0 > 0 && this.dT()) {
            bnq $$1 = this.f(bnu.o);
            if ($$1 == null) {
               return;
            }

            $$1.c(new bns(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), bns.a.a));
            if (this.eg().i() < 0.04F) {
               cng $$2 = this.c(bmd.c);
               $$2.a(1, this, $$0x -> $$0x.d(bmd.c));
            }
         }
      }
   }

   protected void dW() {
      bnq $$0 = this.f(bnu.o);
      if ($$0 != null) {
         if ($$0.a(e) != null) {
            $$0.b(e);
         }
      }
   }

   protected void dX() {
      if (!this.bj().i()) {
         int $$0 = this.cj();
         if ($$0 > 0) {
            bnq $$1 = this.f(bnu.o);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.ck();
            $$1.c(new bns(e, "Powder snow slow", (double)$$2, bns.a.a));
         }
      }
   }

   protected void c(hx $$0) {
      int $$1 = crt.a(crv.j, this);
      if ($$1 > 0) {
         cry.a(this, this.dL(), $$0, $$1);
      }

      if (this.c(this.bj())) {
         this.dU();
      }

      this.dV();
   }

   public boolean o_() {
      return false;
   }

   public float dY() {
      return this.o_() ? 0.5F : 1.0F;
   }

   public float dZ() {
      bnr $$0 = this.eR();
      return $$0 == null ? 1.0F : (float)$$0.c(bnu.p);
   }

   protected boolean ea() {
      return true;
   }

   protected void eb() {
      this.aM++;
      if (this.aM >= 20 && !this.dL().y_() && !this.dG()) {
         this.dL().a(this, (byte)60);
         this.a(blw.c.a);
      }
   }

   public boolean ec() {
      return !this.o_();
   }

   protected boolean ed() {
      return !this.o_();
   }

   protected int m(int $$0) {
      int $$1 = crt.e(this);
      return $$1 > 0 && this.ag.a($$1 + 1) > 0 ? $$0 : $$0 - 1;
   }

   protected int n(int $$0) {
      return Math.min($$0 + 4, this.ch());
   }

   public int ee() {
      return 0;
   }

   protected boolean ef() {
      return false;
   }

   public auw eg() {
      return this.ag;
   }

   @Nullable
   public bmo eh() {
      return this.bV;
   }

   @Override
   public bmo V_() {
      return this.eh();
   }

   public int ei() {
      return this.bW;
   }

   public void c(@Nullable cfq $$0) {
      this.aY = $$0;
      this.aZ = this.ah;
   }

   public void a(@Nullable bmo $$0) {
      this.bV = $$0;
      this.bW = this.ah;
   }

   @Nullable
   public bmo ej() {
      return this.bX;
   }

   public int ek() {
      return this.bY;
   }

   public void z(blw $$0) {
      if ($$0 instanceof bmo) {
         this.bX = (bmo)$$0;
      } else {
         this.bX = null;
      }

      this.bY = this.ah;
   }

   public int el() {
      return this.bb;
   }

   public void o(int $$0) {
      this.bb = $$0;
   }

   public boolean em() {
      return this.bT;
   }

   public void p(boolean $$0) {
      this.bT = $$0;
   }

   protected boolean a(bmd $$0) {
      return true;
   }

   public void a(bmd $$0, cng $$1, cng $$2) {
      boolean $$3 = $$2.b() && $$1.b();
      if (!$$3 && !cng.c($$1, $$2) && !this.am) {
         cmi $$4 = cmi.c_($$2);
         if (!this.dL().y_() && !this.P_()) {
            if (!this.aU() && $$4 != null && $$4.g() == $$0) {
               this.dL().a(null, this.dq(), this.ds(), this.dw(), $$4.au_(), this.db(), 1.0F, 1.0F);
            }

            if (this.a($$0)) {
               this.b($$4 != null ? dnz.v : dnz.S);
            }
         }
      }
   }

   @Override
   public void a(blw.c $$0) {
      super.a($$0);
      this.bz.a();
   }

   @Override
   public void b(so $$0) {
      $$0.a("Health", this.ev());
      $$0.a("HurtTime", (short)this.aK);
      $$0.a("HurtByTimestamp", this.bW);
      $$0.a("DeathTime", (short)this.aM);
      $$0.a("AbsorptionAmount", this.fk());
      $$0.a("Attributes", this.eR().c());
      if (!this.bQ.isEmpty()) {
         su $$1 = new su();

         for (blj $$2 : this.bQ.values()) {
            $$1.add($$2.a(new so()));
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fw());
      this.fB().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<tl> $$3 = this.bz.a(tc.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(so $$0) {
      this.y($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dL() != null && !this.dL().B) {
         this.eR().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         su $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            so $$3 = $$1.a($$2);
            blj $$4 = blj.b($$3);
            if ($$4 != null) {
               this.bQ.put($$4.b(), $$4);
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
         eng $$6 = this.dL().K();
         enb $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cx(), $$7);
         if (!$$8) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         hx $$9 = new hx($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.h($$9);
         this.an.b(as, bna.c);
         if (!this.am) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bz = this.a(new Dynamic(tc.a, $$0.c("Brain")));
      }
   }

   protected void en() {
      Iterator<ih<blh>> $$0 = this.bQ.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            ih<blh> $$1 = $$0.next();
            blj $$2 = this.bQ.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dL().B) {
                  $$0.remove();
                  this.a($$2);
               }
            } else if ($$2.c() % 600 == 0) {
               this.a($$2, false, null);
            }
         }
      } catch (ConcurrentModificationException var11) {
      }

      if (this.bU) {
         if (!this.dL().B) {
            this.J();
            this.u();
         }

         this.bU = false;
      }

      int $$3 = this.an.b(bJ);
      boolean $$4 = this.an.b(bK);
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
            this.dL().a($$4 ? jx.a : jx.v, this.d(0.5), this.dt(), this.g(0.5), $$7, $$8, $$9);
         }
      }
   }

   protected void J() {
      if (this.bQ.isEmpty()) {
         this.eq();
         this.j(false);
      } else {
         Collection<blj> $$0 = this.bQ.values();
         this.an.b(bK, c($$0));
         this.an.b(bJ, cpg.a($$0));
         this.j(this.a(bll.n));
      }
   }

   private void u() {
      boolean $$0 = this.cd();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double A(@Nullable blw $$0) {
      double $$1 = 1.0;
      if (this.bV()) {
         $$1 *= 0.8;
      }

      if (this.ce()) {
         float $$2 = this.eV();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cng $$3 = this.c(bmd.f);
         bmc<?> $$4 = $$0.ai();
         if ($$4 == bmc.aL && $$3.a(cnj.uh)
            || $$4 == bmc.bs && $$3.a(cnj.uk)
            || $$4 == bmc.ay && $$3.a(cnj.un)
            || $$4 == bmc.az && $$3.a(cnj.un)
            || $$4 == bmc.w && $$3.a(cnj.ul)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bmo $$0) {
      return $$0 instanceof cfq && this.dL().ak() == bjz.a ? false : $$0.eo();
   }

   public boolean a(bmo $$0, bxd $$1) {
      return $$1.a(this, $$0);
   }

   public boolean eo() {
      return !this.cr() && this.ep();
   }

   public boolean ep() {
      return !this.P_() && this.bx();
   }

   public static boolean c(Collection<blj> $$0) {
      for (blj $$1 : $$0) {
         if ($$1.f() && !$$1.e()) {
            return false;
         }
      }

      return true;
   }

   protected void eq() {
      this.an.b(bK, false);
      this.an.b(bJ, 0);
   }

   public boolean er() {
      if (this.dL().B) {
         return false;
      } else {
         Iterator<blj> $$0 = this.bQ.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<blj> es() {
      return this.bQ.values();
   }

   public Map<ih<blh>, blj> et() {
      return this.bQ;
   }

   public boolean a(ih<blh> $$0) {
      return this.bQ.containsKey($$0);
   }

   @Nullable
   public blj c(ih<blh> $$0) {
      return this.bQ.get($$0);
   }

   public final boolean b(blj $$0) {
      return this.b($$0, null);
   }

   public boolean b(blj $$0, @Nullable blw $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         blj $$2 = this.bQ.get($$0.b());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bQ.put($$0.b(), $$0);
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

   public boolean c(blj $$0) {
      return this.eS() != bmt.b ? true : !$$0.a(bll.j) && !$$0.a(bll.s);
   }

   public void c(blj $$0, @Nullable blw $$1) {
      if (this.c($$0)) {
         blj $$2 = this.bQ.put($$0.b(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eu() {
      return this.eS() == bmt.b;
   }

   @Nullable
   public blj d(ih<blh> $$0) {
      return this.bQ.remove($$0);
   }

   public boolean e(ih<blh> $$0) {
      blj $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(blj $$0, @Nullable blw $$1) {
      this.bU = true;
      if (!this.dL().B) {
         $$0.b().a().a(this.eR(), $$0.d());
         this.d($$0);
      }
   }

   public void d(blj $$0) {
      for (blw $$1 : this.cP()) {
         if ($$1 instanceof anf $$2) {
            $$2.c.b(new adf(this.aj(), $$0, false));
         }
      }
   }

   protected void a(blj $$0, boolean $$1, @Nullable blw $$2) {
      this.bU = true;
      if ($$1 && !this.dL().B) {
         blh $$3 = $$0.b().a();
         $$3.a(this.eR());
         $$3.a(this.eR(), $$0.d());
         this.y();
      }

      if (!this.dL().B) {
         this.d($$0);
      }
   }

   protected void a(blj $$0) {
      this.bU = true;
      if (!this.dL().B) {
         $$0.b().a().a(this.eR());
         this.y();

         for (blw $$1 : this.cP()) {
            if ($$1 instanceof anf $$2) {
               $$2.c.b(new abk(this.aj(), $$0.b()));
            }
         }
      }
   }

   private void y() {
      for (bnq $$0 : this.eR().a()) {
         this.i($$0.a());
      }
   }

   private void i(ih<bnp> $$0) {
      if ($$0.a(bnu.n)) {
         float $$1 = this.eM();
         if (this.ev() > $$1) {
            this.c($$1);
         }
      } else if ($$0.a(bnu.m)) {
         float $$2 = this.eN();
         if (this.fk() > $$2) {
            this.x($$2);
         }
      }
   }

   public void b(float $$0) {
      float $$1 = this.ev();
      if ($$1 > 0.0F) {
         this.c($$1 + $$0);
      }
   }

   public float ev() {
      return this.an.b(bI);
   }

   public void c(float $$0) {
      this.an.b(bI, aup.a($$0, 0.0F, this.eM()));
   }

   public boolean ew() {
      return this.ev() <= 0.0F;
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dL().B) {
         return false;
      } else if (this.ew()) {
         return false;
      } else if ($$0.a(ask.j) && this.a(bll.l)) {
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
            this.t($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.a(ask.k) && $$0.c() instanceof bmo $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(ask.p) && this.ai().a(asl.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(ask.a) && !this.c(bmd.f).b()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.aQ.a(1.5F);
         boolean $$7 = true;
         if ((float)this.al > 10.0F && !$$0.a(ask.f)) {
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

         blw $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof bmo $$9 && !$$0.a(ask.r)) {
               this.a($$9);
            }

            if ($$8 instanceof cfq $$10) {
               this.aZ = 100;
               this.aY = $$10;
            } else if ($$8 instanceof bzf $$11 && $$11.u()) {
               this.aZ = 100;
               if ($$11.R_() instanceof cfq $$12) {
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

            if (!$$0.a(ask.s) && (!$$3 || $$1 > 0.0F)) {
               this.bq();
            }

            if ($$8 != null && !$$0.a(ask.A)) {
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

         if (this.ew()) {
            if (!this.h($$0)) {
               ars $$15 = this.n_();
               if ($$7 && $$15 != null) {
                  this.a($$15, this.eW(), this.eX());
               }

               this.a($$0);
            }
         } else if ($$7) {
            this.e($$0);
         }

         boolean $$16 = !$$3 || $$1 > 0.0F;
         if ($$16) {
            this.ce = $$0;
            this.cf = this.dL().X();
         }

         if (this instanceof anf) {
            am.i.a((anf)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((anf)this).a(asd.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof anf) {
            am.h.a((anf)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$16;
      }
   }

   protected void d(bmo $$0) {
      $$0.e(this);
   }

   protected void e(bmo $$0) {
      $$0.q(0.5, $$0.dq() - this.dq(), $$0.dw() - this.dw());
   }

   private boolean h(bkv $$0) {
      if ($$0.a(ask.e)) {
         return false;
      } else {
         cng $$1 = null;

         for (bkb $$2 : bkb.values()) {
            cng $$3 = this.b($$2);
            if ($$3.a(cnj.vp)) {
               $$1 = $$3.p();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof anf $$4) {
               $$4.b(asd.c.b(cnj.vp));
               am.C.a($$4, $$1);
               this.b(dnz.C);
            }

            this.c(1.0F);
            this.er();
            this.b(new blj(bll.j, 900, 1));
            this.b(new blj(bll.v, 100, 1));
            this.b(new blj(bll.l, 800, 0));
            this.dL().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bkv ex() {
      if (this.dL().X() - this.cf > 40L) {
         this.ce = null;
      }

      return this.ce;
   }

   protected void e(bkv $$0) {
      ars $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eW(), this.eX());
      }
   }

   public boolean f(bkv $$0) {
      blw $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cfw $$3 && $$3.D() > 0) {
         $$2 = true;
      }

      if (!$$0.a(ask.d) && this.fu() && !$$2) {
         emc $$4 = $$0.h();
         if ($$4 != null) {
            emc $$5 = this.b(0.0F, this.cp());
            emc $$6 = $$4.a(this.dj());
            $$6 = new emc($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(cng $$0) {
      if (!$$0.b()) {
         if (!this.aU()) {
            this.dL().a(this.dq(), this.ds(), this.dw(), art.nc, this.db(), 0.8F, 0.8F + this.dL().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bkv $$0) {
      if (!this.dG() && !this.ba) {
         blw $$1 = $$0.d();
         bmo $$2 = this.eL();
         if (this.bh >= 0 && $$2 != null) {
            $$2.a(this, this.bh, $$0);
         }

         if (this.fD()) {
            this.fE();
         }

         if (!this.dL().B && this.ae()) {
            b.info("Named entity {} died: {}", this, this.eK().a().getString());
         }

         this.ba = true;
         this.eK().c();
         if (this.dL() instanceof ane $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.b(dnz.p);
               this.g($$0);
               this.f($$2);
            }

            this.dL().a(this, (byte)3);
         }

         this.b(bna.h);
      }
   }

   protected void f(@Nullable bmo $$0) {
      if (!this.dL().B) {
         boolean $$1 = false;
         if ($$0 instanceof cbp) {
            if (this.dL().Z().b(ctt.c)) {
               hx $$2 = this.dl();
               djp $$3 = cxa.cd.o();
               if (this.dL().a_($$2).i() && $$3.a((cua)this.dL(), $$2)) {
                  this.dL().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               ccb $$4 = new ccb(this.dL(), this.dq(), this.ds(), this.dw(), new cng(cnj.dv));
               this.dL().b($$4);
            }
         }
      }
   }

   protected void g(bkv $$0) {
      blw $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof cfq) {
         $$2 = crt.h((bmo)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.aZ > 0;
      if (this.ed() && this.dL().Z().b(ctt.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.ey();
      this.ez();
   }

   protected void ey() {
   }

   protected void ez() {
      if (this.dL() instanceof ane && !this.eD() && (this.ef() || this.aZ > 0 && this.ec() && this.dL().Z().b(ctt.f))) {
         bme.a((ane)this.dL(), this.dj(), this.ee());
      }
   }

   protected void a(bkv $$0, int $$1, boolean $$2) {
   }

   public ahh eA() {
      return this.ai().j();
   }

   public long eB() {
      return 0L;
   }

   protected void a(bkv $$0, boolean $$1) {
      ahh $$2 = this.eA();
      ehn $$3 = this.dL().o().aJ().getLootTable($$2);
      ehl.a $$4 = new ehl.a((ane)this.dL()).a(ejq.a, this).a(ejq.f, this.dj()).a(ejq.c, $$0).b(ejq.d, $$0.d()).b(ejq.e, $$0.c());
      if ($$1 && this.aY != null) {
         $$4 = $$4.a(ejq.b, this.aY).a(this.aY.go());
      }

      ehl $$5 = $$4.a(ejp.g);
      $$3.a($$5, this.eB(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.g(bnu.k);
      if (!($$0 <= 0.0)) {
         this.au = true;
         emc $$3 = this.do();
         emc $$4 = new emc($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aC() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected ars d(bkv $$0) {
      return art.jR;
   }

   @Nullable
   protected ars n_() {
      return art.jM;
   }

   private ars d(int $$0) {
      return $$0 > 4 ? this.eG().b() : this.eG().a();
   }

   public void eC() {
      this.ci = true;
   }

   public boolean eD() {
      return this.ci;
   }

   public float eE() {
      return 0.0F;
   }

   protected elx eF() {
      elx $$0 = this.cH();
      blw $$1 = this.cZ();
      if ($$1 != null) {
         emc $$2 = $$1.l(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public bmo.a eG() {
      return new bmo.a(art.jS, art.jK);
   }

   protected ars c(cng $$0) {
      return $$0.N();
   }

   public ars d(cng $$0) {
      return $$0.O();
   }

   public Optional<hx> eH() {
      return this.cd;
   }

   public boolean e_() {
      if (this.P_()) {
         return false;
      } else {
         hx $$0 = this.dl();
         djp $$1 = this.dm();
         if ($$1.a(asi.aO)) {
            this.cd = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dfk && this.c($$0, $$1)) {
            this.cd = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(hx $$0, djp $$1) {
      if ($$1.c(dfk.b)) {
         djp $$2 = this.dL().a_($$0.d());
         if ($$2.a(cxa.cO) && $$2.c(dbd.b) == $$1.c(dfk.aE)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean bx() {
      return !this.dG() && this.ev() > 0.0F;
   }

   @Override
   public boolean a(float $$0, float $$1, bkv $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.d($$0, $$1);
      if ($$4 > 0) {
         this.a(this.d($$4), 1.0F, 1.0F);
         this.eI();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int d(float $$0, float $$1) {
      if (this.ai().a(asl.o)) {
         return 0;
      } else {
         blj $$2 = this.c(bll.h);
         float $$3 = $$2 == null ? 0.0F : (float)($$2.d() + 1);
         return aup.f(($$0 - 3.0F - $$3) * $$1);
      }
   }

   protected void eI() {
      if (!this.aU()) {
         int $$0 = aup.a(this.dq());
         int $$1 = aup.a(this.ds() - 0.2F);
         int $$2 = aup.a(this.dw());
         djp $$3 = this.dL().a_(new hx($$0, $$1, $$2));
         if (!$$3.i()) {
            dek $$4 = $$3.w();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void m(float $$0) {
      this.aL = 10;
      this.aK = this.aL;
   }

   public int eJ() {
      return aup.a(this.g(bnu.a));
   }

   protected void b(bkv $$0, float $$1) {
   }

   protected void c(bkv $$0, float $$1) {
   }

   protected void t(float $$0) {
   }

   protected float d(bkv $$0, float $$1) {
      if (!$$0.a(ask.c)) {
         this.b($$0, $$1);
         $$1 = bkr.a($$1, (float)this.eJ(), (float)this.g(bnu.b));
      }

      return $$1;
   }

   protected float e(bkv $$0, float $$1) {
      if ($$0.a(ask.g)) {
         return $$1;
      } else {
         if (this.a(bll.k) && !$$0.a(ask.h)) {
            int $$2 = (this.c(bll.k).d() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof anf) {
                  ((anf)this).a(asd.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof anf) {
                  ((anf)$$0.d()).a(asd.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(ask.i)) {
            return $$1;
         } else {
            int $$7 = crt.a(this.bL(), $$0);
            if ($$7 > 0) {
               $$1 = bkr.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bkv $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fk(), 0.0F);
         this.x(this.fk() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof anf $$4) {
            $$4.a(asd.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eK().a($$0, var9);
            this.c(this.ev() - var9);
            this.x(this.fk() - var9);
            this.b(dnz.o);
         }
      }
   }

   public bks eK() {
      return this.bP;
   }

   @Nullable
   public bmo eL() {
      if (this.aY != null) {
         return this.aY;
      } else {
         return this.bV != null ? this.bV : null;
      }
   }

   public final float eM() {
      return (float)this.g(bnu.n);
   }

   public final float eN() {
      return (float)this.g(bnu.m);
   }

   public final int eO() {
      return this.an.b(bL);
   }

   public final void p(int $$0) {
      this.an.b(bL, $$0);
   }

   public final int eP() {
      return this.an.b(bM);
   }

   public final void q(int $$0) {
      this.an.b(bM, $$0);
   }

   private int B() {
      if (blk.a(this)) {
         return 6 - (1 + blk.b(this));
      } else {
         return this.a(bll.d) ? 6 + (1 + this.c(bll.d).d()) * 2 : 6;
      }
   }

   public void a(bkb $$0) {
      this.a($$0, false);
   }

   public void a(bkb $$0, boolean $$1) {
      if (!this.aF || this.aH >= this.B() / 2 || this.aH < 0) {
         this.aH = -1;
         this.aF = true;
         this.aG = $$0;
         if (this.dL() instanceof ane) {
            ze $$2 = new ze(this, $$0 == bkb.a ? 0 : 3);
            anc $$3 = ((ane)this.dL()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bkv $$0) {
      this.aQ.a(1.5F);
      this.al = 20;
      this.aL = 10;
      this.aK = this.aL;
      ars $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eW(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
      }

      this.a(this.dM().n(), 0.0F);
      this.ce = $$0;
      this.cf = this.dL().X();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            ars $$1 = this.n_();
            if ($$1 != null) {
               this.a($$1, this.eW(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cfq)) {
               this.c(0.0F);
               this.a(this.dM().n());
            }
            break;
         case 29:
            this.a(art.vV, 1.0F, 0.8F + this.dL().z.i() * 0.4F);
            break;
         case 30:
            this.a(art.vW, 0.8F, 0.8F + this.dL().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ag.i() - 0.5F) * 0.2F;
               float $$6 = (this.ag.i() - 0.5F) * 0.2F;
               float $$7 = (this.ag.i() - 0.5F) * 0.2F;
               double $$8 = aup.d($$4, this.K, this.dq()) + (this.ag.j() - 0.5) * (double)this.dg() * 2.0;
               double $$9 = aup.d($$4, this.L, this.ds()) + this.ag.j() * (double)this.dh();
               double $$10 = aup.d($$4, this.M, this.dw()) + (this.ag.j() - 0.5) * (double)this.dg() * 2.0;
               this.dL().a(jx.Z, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.c(bmd.a));
            break;
         case 48:
            this.i(this.c(bmd.b));
            break;
         case 49:
            this.i(this.c(bmd.f));
            break;
         case 50:
            this.i(this.c(bmd.e));
            break;
         case 51:
            this.i(this.c(bmd.d));
            break;
         case 52:
            this.i(this.c(bmd.c));
            break;
         case 54:
            dar.b(this);
            break;
         case 55:
            this.D();
            break;
         case 60:
            this.C();
            break;
         default:
            super.b($$0);
      }
   }

   private void C() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.ag.k() * 0.02;
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         this.dL().a(jx.Y, this.d(1.0), this.dt(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void D() {
      cng $$0 = this.c(bmd.b);
      this.a(bmd.b, this.c(bmd.a));
      this.a(bmd.a, $$0);
   }

   @Override
   protected void aB() {
      this.a(this.dM().m(), 4.0F);
   }

   protected void eQ() {
      int $$0 = this.B();
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
   public bnq f(ih<bnp> $$0) {
      return this.eR().a($$0);
   }

   public double g(ih<bnp> $$0) {
      return this.eR().c($$0);
   }

   public double h(ih<bnp> $$0) {
      return this.eR().d($$0);
   }

   public bnr eR() {
      return this.bO;
   }

   public bmt eS() {
      return bmt.a;
   }

   public cng eT() {
      return this.c(bmd.a);
   }

   public cng eU() {
      return this.c(bmd.b);
   }

   public boolean b(cnb $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cng> $$0) {
      return $$0.test(this.eT()) || $$0.test(this.eU());
   }

   public cng b(bkb $$0) {
      if ($$0 == bkb.a) {
         return this.c(bmd.a);
      } else if ($$0 == bkb.b) {
         return this.c(bmd.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bkb $$0, cng $$1) {
      if ($$0 == bkb.a) {
         this.a(bmd.a, $$1);
      } else {
         if ($$0 != bkb.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bmd.b, $$1);
      }
   }

   public boolean b(bmd $$0) {
      return !this.c($$0).b();
   }

   @Override
   public abstract Iterable<cng> bL();

   public abstract cng c(bmd var1);

   @Override
   public abstract void a(bmd var1, cng var2);

   protected void e(cng $$0) {
      so $$1 = $$0.v();
      if ($$1 != null) {
         $$0.d().b($$1);
      }
   }

   public float eV() {
      Iterable<cng> $$0 = this.bL();
      int $$1 = 0;
      int $$2 = 0;

      for (cng $$3 : $$0) {
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
      bnq $$1 = this.f(bnu.o);
      $$1.b(bB.a());
      if ($$0) {
         $$1.c(bB);
      }
   }

   protected float eW() {
      return 1.0F;
   }

   public float eX() {
      return this.o_() ? (this.ag.i() - this.ag.i()) * 0.2F + 1.5F : (this.ag.i() - this.ag.i()) * 0.2F + 1.0F;
   }

   protected boolean eY() {
      return this.ew();
   }

   @Override
   public void g(blw $$0) {
      if (!this.fD()) {
         super.g($$0);
      }
   }

   private void a(blw $$0) {
      emc $$1;
      if (this.dG()) {
         $$1 = this.dj();
      } else if (!$$0.dG() && !this.dL().a_($$0.dl()).a(asi.aI)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.ds(), $$0.ds());
         $$1 = new emc(this.dq(), $$2, this.dw());
      }

      this.a($$1.c, $$1.d, $$1.e);
   }

   @Override
   public boolean cC() {
      return this.cB();
   }

   protected float eZ() {
      return 0.42F * this.aK() + this.fa();
   }

   public float fa() {
      return this.a(bll.h) ? 0.1F * ((float)this.c(bll.h).d() + 1.0F) : 0.0F;
   }

   protected void fb() {
      emc $$0 = this.do();
      this.o($$0.c, (double)this.eZ(), $$0.e);
      if (this.bY()) {
         float $$1 = this.dB() * (float) (Math.PI / 180.0);
         this.g(this.do().b((double)(-aup.a($$1) * 0.2F), 0.0, (double)(aup.b($$1) * 0.2F)));
      }

      this.au = true;
   }

   protected void fc() {
      this.g(this.do().b(0.0, -0.04F, 0.0));
   }

   protected void c(asx<eey> $$0) {
      this.g(this.do().b(0.0, 0.04F, 0.0));
   }

   protected float fd() {
      return 0.8F;
   }

   public boolean a(eez $$0) {
      return false;
   }

   public void a(emc $$0) {
      if (this.cX()) {
         double $$1 = 0.08;
         boolean $$2 = this.do().d <= 0.0;
         if ($$2 && this.a(bll.B)) {
            $$1 = 0.01;
         }

         eez $$3 = this.dL().b_(this.dl());
         if (this.aZ() && this.ea() && !this.a($$3)) {
            double $$4 = this.ds();
            float $$5 = this.bY() ? 0.9F : this.fd();
            float $$6 = 0.02F;
            float $$7 = (float)crt.f(this);
            if ($$7 > 3.0F) {
               $$7 = 3.0F;
            }

            if (!this.aC()) {
               $$7 *= 0.5F;
            }

            if ($$7 > 0.0F) {
               $$5 += (0.54600006F - $$5) * $$7 / 3.0F;
               $$6 += (this.ff() - $$6) * $$7 / 3.0F;
            }

            if (this.a(bll.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(bmu.a, this.do());
            emc $$8 = this.do();
            if (this.P && this.e_()) {
               $$8 = new emc($$8.c, 0.2, $$8.e);
            }

            this.g($$8.d((double)$$5, 0.8F, (double)$$5));
            emc $$9 = this.a($$1, $$2, this.do());
            this.g($$9);
            if (this.P && this.g($$9.c, $$9.d + 0.6F - this.ds() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bn() && this.ea() && !this.a($$3)) {
            double $$10 = this.ds();
            this.a(0.02F, $$0);
            this.a(bmu.a, this.do());
            if (this.b(asn.b) <= this.df()) {
               this.g(this.do().d(0.5, 0.8F, 0.5));
               emc $$11 = this.a($$1, $$2, this.do());
               this.g($$11);
            } else {
               this.g(this.do().a(0.5));
            }

            if (!this.aV()) {
               this.g(this.do().b(0.0, -$$1 / 4.0, 0.0));
            }

            emc $$12 = this.do();
            if (this.P && this.g($$12.c, $$12.d + 0.6F - this.ds() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fw()) {
            this.cn();
            emc $$13 = this.do();
            emc $$14 = this.bF();
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
               double $$21 = $$17 * (double)(-aup.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.g($$13.d(0.99F, 0.98F, 0.99F));
            this.a(bmu.a, this.do());
            if (this.P && !this.dL().B) {
               double $$22 = this.do().h();
               double $$23 = $$17 - $$22;
               float $$24 = (float)($$23 * 10.0 - 3.0);
               if ($$24 > 0.0F) {
                  this.a(this.d((int)$$24), 1.0F, 1.0F);
                  this.a(this.dM().l(), $$24);
               }
            }

            if (this.aC() && !this.dL().B) {
               this.b(7, false);
            }
         } else {
            hx $$25 = this.aI();
            float $$26 = this.dL().a_($$25).b().i();
            float $$27 = this.aC() ? $$26 * 0.91F : 0.91F;
            emc $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.a(bll.y)) {
               $$29 += (0.05 * (double)(this.c(bll.y).d() + 1) - $$28.d) * 0.2;
            } else if (this.dL().B && !this.dL().B($$25)) {
               if (this.ds() > (double)this.dL().J_()) {
                  $$29 = -0.1;
               } else {
                  $$29 = 0.0;
               }
            } else if (!this.aV()) {
               $$29 -= $$1;
            }

            if (this.em()) {
               this.o($$28.c, $$29, $$28.e);
            } else {
               this.o($$28.c * (double)$$27, $$29 * 0.98F, $$28.e * (double)$$27);
            }
         }
      }

      this.q(this instanceof byl);
   }

   private void c(cfq $$0, emc $$1) {
      emc $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.cX()) {
         this.v(this.e($$0));
         this.a($$2);
      } else {
         this.q(false);
         this.g(emc.b);
         this.aD();
      }
   }

   protected void a(cfq $$0, emc $$1) {
   }

   protected emc b(cfq $$0, emc $$1) {
      return $$1;
   }

   protected float e(cfq $$0) {
      return this.ff();
   }

   public void q(boolean $$0) {
      float $$1 = (float)aup.g(this.dq() - this.K, $$0 ? this.ds() - this.L : 0.0, this.dw() - this.M);
      this.u($$1);
   }

   protected void u(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aQ.a($$1, 0.4F);
   }

   public emc a(emc $$0, float $$1) {
      this.a(this.z($$1), $$0);
      this.g(this.j(this.do()));
      this.a(bmu.a, this.do());
      emc $$2 = this.do();
      if ((this.P || this.bj) && (this.e_() || this.dm().a(cxa.qP) && dcr.a(this))) {
         $$2 = new emc($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public emc a(double $$0, boolean $$1, emc $$2) {
      if (!this.aV() && !this.bY()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new emc($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private emc j(emc $$0) {
      if (this.e_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = aup.a($$0.c, -0.15F, 0.15F);
         double $$3 = aup.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dm().a(cxa.nS) && this.fv() && this instanceof cfq) {
            $$4 = 0.0;
         }

         $$0 = new emc($$2, $$4, $$3);
      }

      return $$0;
   }

   private float z(float $$0) {
      return this.aC() ? this.ff() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fe();
   }

   protected float fe() {
      return this.cN() instanceof cfq ? this.ff() * 0.1F : 0.02F;
   }

   public float ff() {
      return this.bZ;
   }

   public void v(float $$0) {
      this.bZ = $$0;
   }

   public boolean B(blw $$0) {
      this.z($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.I();
      this.M();
      if (!this.dL().B) {
         int $$0 = this.eO();
         if ($$0 > 0) {
            if (this.aI <= 0) {
               this.aI = 20 * (30 - $$0);
            }

            this.aI--;
            if (this.aI <= 0) {
               this.p($$0 - 1);
            }
         }

         int $$1 = this.eP();
         if ($$1 > 0) {
            if (this.aJ <= 0) {
               this.aJ = 20 * (30 - $$1);
            }

            this.aJ--;
            if (this.aJ <= 0) {
               this.q($$1 - 1);
            }
         }

         this.E();
         if (this.ah % 20 == 0) {
            this.eK().c();
         }

         if (this.fD() && !this.N()) {
            this.fE();
         }
      }

      if (!this.dG()) {
         this.d_();
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
         float $$8 = (float)aup.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = aup.e(aup.g(this.dB()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aO > 0.0F) {
         $$5 = this.dB();
      }

      if (!this.aC()) {
         $$7 = 0.0F;
      }

      this.bd = this.bd + ($$7 - this.bd) * 0.3F;
      this.dL().af().a("headTurn");
      $$6 = this.e($$5, $$6);
      this.dL().af().c();
      this.dL().af().a("rangeChecks");

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

      this.dL().af().c();
      this.be += $$6;
      if (this.fw()) {
         this.bx++;
      } else {
         this.bx = 0;
      }

      if (this.fD()) {
         this.s(0.0F);
      }

      this.y();
      float $$10 = this.dZ();
      if ($$10 != this.bA) {
         this.bA = $$10;
         this.k_();
      }
   }

   private void E() {
      Map<bmd, cng> $$0 = this.G();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bmd, cng> G() {
      Map<bmd, cng> $$0 = null;

      for (bmd $$1 : bmd.values()) {
         cng $$2;
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

         cng $$5 = this.c($$1);
         if (this.a($$2, $$5)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bmd.class);
            }

            $$0.put($$1, $$5);
            if (!$$2.b()) {
               this.eR().a($$2.a($$1));
            }

            if (!$$5.b()) {
               this.eR().b($$5.a($$1));
            }
         }
      }

      return $$0;
   }

   public boolean a(cng $$0, cng $$1) {
      return !cng.a($$1, $$0);
   }

   private void a(Map<bmd, cng> $$0) {
      cng $$1 = $$0.get(bmd.a);
      cng $$2 = $$0.get(bmd.b);
      if ($$1 != null && $$2 != null && cng.a($$1, this.f(bmd.b)) && cng.a($$2, this.f(bmd.a))) {
         ((ane)this.dL()).l().b(this, new aad(this, (byte)55));
         $$0.remove(bmd.a);
         $$0.remove(bmd.b);
         this.c(bmd.a, $$1.p());
         this.c(bmd.b, $$2.p());
      }
   }

   private void b(Map<bmd, cng> $$0) {
      List<Pair<bmd, cng>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cng $$3 = $$2.p();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
         }
      });
      ((ane)this.dL()).l().b(this, new acg(this.aj(), $$1));
   }

   private cng e(bmd $$0) {
      return this.bS.get($$0.b());
   }

   private void b(bmd $$0, cng $$1) {
      this.bS.set($$0.b(), $$1);
   }

   private cng f(bmd $$0) {
      return this.bR.get($$0.b());
   }

   private void c(bmd $$0, cng $$1) {
      this.bR.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = aup.g($$0 - this.aU);
      this.aU += $$2 * 0.3F;
      float $$3 = aup.g(this.dB() - this.aU);
      float $$4 = this.fg();
      if (Math.abs($$3) > $$4) {
         this.aU = this.aU + ($$3 - (float)aup.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float fg() {
      return 50.0F;
   }

   public void d_() {
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
         this.g(this.do().a(0.98));
      }

      if (this.bu > 0) {
         this.a(this.bu, this.bt);
         this.bu--;
      }

      emc $$0 = this.do();
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
      this.dL().af().a("ai");
      if (this.eY()) {
         this.bj = false;
         this.bk = 0.0F;
         this.bm = 0.0F;
      } else if (this.cY()) {
         this.dL().af().a("newAi");
         this.fi();
         this.dL().af().c();
      }

      this.dL().af().c();
      this.dL().af().a("jump");
      if (this.bj && this.ea()) {
         double $$4;
         if (this.bn()) {
            $$4 = this.b(asn.b);
         } else {
            $$4 = this.b(asn.a);
         }

         boolean $$6 = this.aZ() && $$4 > 0.0;
         double $$7 = this.df();
         if (!$$6 || this.aC() && !($$4 > $$7)) {
            if (!this.bn() || this.aC() && !($$4 > $$7)) {
               if ((this.aC() || $$6 && $$4 <= $$7) && this.ca == 0) {
                  this.fb();
                  this.ca = 10;
               }
            } else {
               this.c(asn.b);
            }
         } else {
            this.c(asn.a);
         }
      } else {
         this.ca = 0;
      }

      this.dL().af().c();
      this.dL().af().a("travel");
      this.bk *= 0.98F;
      this.bm *= 0.98F;
      this.H();
      elx $$8 = this.cH();
      emc $$9 = new emc((double)this.bk, (double)this.bl, (double)this.bm);
      if (this.a(bll.B) || this.a(bll.y)) {
         this.n();
      }

      label104: {
         if (this.cN() instanceof cfq $$10 && this.bx()) {
            this.c($$10, $$9);
            break label104;
         }

         this.a($$9);
      }

      this.dL().af().c();
      this.dL().af().a("freezing");
      if (!this.dL().B && !this.ew()) {
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

      this.dL().af().c();
      this.dL().af().a("push");
      if (this.by > 0) {
         this.by--;
         this.a($$8, this.cH());
      }

      this.M_();
      this.dL().af().c();
      if (!this.dL().B && this.fh() && this.bb()) {
         this.a(this.dM().h(), 1.0F);
      }
   }

   public boolean fh() {
      return false;
   }

   private void H() {
      boolean $$0 = this.i(7);
      if ($$0 && !this.aC() && !this.bO() && !this.a(bll.y)) {
         cng $$1 = this.c(bmd.e);
         if ($$1.a(cnj.nS) && cmb.d($$1)) {
            $$0 = true;
            int $$2 = this.bx + 1;
            if (!this.dL().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, $$0x -> $$0x.d(bmd.e));
               }

               this.b(dnz.n);
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

   protected void fi() {
   }

   protected void M_() {
      if (this.dL().y_()) {
         this.dL().a(dnn.a(cfq.class), this.cH(), bmb.a(this)).forEach(this::C);
      } else {
         List<blw> $$0 = this.dL().a(this, this.cH(), bmb.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dL().Z().c(ctt.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ag.a(4) == 0) {
               int $$2 = 0;

               for (blw $$3 : $$0) {
                  if (!$$3.bO()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dM().g(), 6.0F);
               }
            }

            for (blw $$4 : $$0) {
               this.C($$4);
            }
         }
      }
   }

   protected void a(elx $$0, elx $$1) {
      elx $$2 = $$0.b($$1);
      List<blw> $$3 = this.dL().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (blw $$4 : $$3) {
            if ($$4 instanceof bmo) {
               this.g((bmo)$$4);
               this.by = 0;
               this.g(this.do().a(-0.2));
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

   protected void C(blw $$0) {
      $$0.g(this);
   }

   protected void g(bmo $$0) {
   }

   public boolean fj() {
      return (this.an.b(t) & 4) != 0;
   }

   @Override
   public void ac() {
      blw $$0 = this.cZ();
      super.ac();
      if ($$0 != null && $$0 != this.cZ() && !this.dL().B) {
         this.a($$0);
      }
   }

   @Override
   public void t() {
      super.t();
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
   public double p_() {
      return this.bn > 0 ? this.bo : this.dq();
   }

   @Override
   public double N_() {
      return this.bn > 0 ? this.bp : this.ds();
   }

   @Override
   public double O_() {
      return this.bn > 0 ? this.bq : this.dw();
   }

   @Override
   public float f_() {
      return this.bn > 0 ? (float)this.bs : this.dD();
   }

   @Override
   public float q_() {
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

   public void a(ccb $$0) {
      blw $$1 = $$0.w();
      if ($$1 instanceof anf) {
         am.P.a((anf)$$1, $$0.q(), this);
      }
   }

   public void a(blw $$0, int $$1) {
      if (!$$0.dG() && !this.dL().B && ($$0 instanceof ccb || $$0 instanceof cfw || $$0 instanceof bme)) {
         ((ane)this.dL()).l().b($$0, new acz($$0.aj(), this.aj(), $$1));
      }
   }

   public boolean D(blw $$0) {
      if ($$0.dL() != this.dL()) {
         return false;
      } else {
         emc $$1 = new emc(this.dq(), this.du(), this.dw());
         emc $$2 = new emc($$0.dq(), $$0.du(), $$0.dw());
         return $$2.f($$1) > 128.0 ? false : this.dL().a(new ctg($$1, $$2, ctg.a.a, ctg.b.a, this)).c() == ema.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.aW : aup.i($$0, this.aX, this.aW);
   }

   public float w(float $$0) {
      float $$1 = this.aO - this.aN;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aN + $$1 * $$0;
   }

   @Override
   public boolean bt() {
      return !this.dG();
   }

   @Override
   public boolean bu() {
      return this.bx() && !this.P_() && !this.e_();
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
   protected emc a(ic.a $$0, l.a $$1) {
      return i(super.a($$0, $$1));
   }

   public static emc i(emc $$0) {
      return new emc($$0.c, $$0.d, 0.0);
   }

   public float fk() {
      return this.cb;
   }

   public final void x(float $$0) {
      this.y(aup.a($$0, 0.0F, this.eN()));
   }

   protected void y(float $$0) {
      this.cb = $$0;
   }

   public void g_() {
   }

   public void h_() {
   }

   protected void fl() {
      this.bU = true;
   }

   public abstract bmi fm();

   public boolean fn() {
      return (this.an.b(t) & 1) > 0;
   }

   public bkb fo() {
      return (this.an.b(t) & 2) > 0 ? bkb.b : bkb.a;
   }

   private void I() {
      if (this.fn()) {
         if (cng.b(this.b(this.fo()), this.bv)) {
            this.bv = this.b(this.fo());
            this.a(this.bv);
         } else {
            this.ft();
         }
      }
   }

   protected void a(cng $$0) {
      $$0.b(this.dL(), this, this.fq());
      if (this.K()) {
         this.b($$0, 5);
      }

      if (--this.bw == 0 && !this.dL().B && !$$0.t()) {
         this.x();
      }
   }

   private boolean K() {
      int $$0 = this.fq();
      cig $$1 = this.bv.d().u();
      boolean $$2 = $$1 != null && $$1.e();
      $$2 |= $$0 <= this.bv.r() - 7;
      return $$2 && $$0 % 4 == 0;
   }

   private void M() {
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

   public void c(bkb $$0) {
      cng $$1 = this.b($$0);
      if (!$$1.b() && !this.fn()) {
         this.bv = $$1;
         this.bw = $$1.r();
         if (!this.dL().B) {
            this.c(1, true);
            this.c(2, $$0 == bkb.b);
            this.b(dnz.D);
         }
      }
   }

   @Override
   public void a(agn<?> $$0) {
      super.a($$0);
      if (bN.equals($$0)) {
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
            this.bv = cng.f;
            this.bw = 0;
         }
      }
   }

   @Override
   public void a(ee.a $$0, emc $$1) {
      super.a($$0, $$1);
      this.aX = this.aW;
      this.aU = this.aW;
      this.aV = this.aU;
   }

   protected void b(cng $$0, int $$1) {
      if (!$$0.b() && this.fn()) {
         if ($$0.s() == cpa.c) {
            this.a(this.c($$0), 0.5F, this.dL().z.i() * 0.1F + 0.9F);
         }

         if ($$0.s() == cpa.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(cng $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         emc $$3 = new emc(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dD() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dB() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ag.i()) * 0.6 - 0.3;
         emc $$5 = new emc(((double)this.ag.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dD() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dB() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dq(), this.du(), this.dw());
         this.dL().a(new jt(jx.Q, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void x() {
      if (!this.dL().B || this.fn()) {
         bkb $$0 = this.fo();
         if (!this.bv.equals(this.b($$0))) {
            this.fs();
         } else {
            if (!this.bv.b() && this.fn()) {
               this.b(this.bv, 16);
               cng $$1 = this.bv.a(this.dL(), this);
               if ($$1 != this.bv) {
                  this.a($$0, $$1);
               }

               this.ft();
            }
         }
      }
   }

   public cng fp() {
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
            this.I();
         }
      }

      this.ft();
   }

   public void ft() {
      if (!this.dL().B) {
         boolean $$0 = this.fn();
         this.c(1, false);
         if ($$0) {
            this.b(dnz.C);
         }
      }

      this.bv = cng.f;
      this.bw = 0;
   }

   public boolean fu() {
      if (this.fn() && !this.bv.b()) {
         cnb $$0 = this.bv.d();
         return $$0.c(this.bv) != cpa.d ? false : $$0.b(this.bv) - this.bw >= 5;
      } else {
         return false;
      }
   }

   public boolean fv() {
      return this.bS();
   }

   public boolean fw() {
      return this.i(7);
   }

   @Override
   public boolean ca() {
      return super.ca() || !this.fw() && this.c(bna.b);
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
      hx $$9 = hx.a($$0, $$1, $$2);
      ctx $$10 = this.dL();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.J_()) {
            hx $$12 = $$9.d();
            djp $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.c($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cH())) {
               $$8 = true;
            }
         }
      }

      if (!$$8) {
         this.c($$4, $$5, $$6);
         return false;
      } else {
         if ($$3) {
            $$10.a(this, (byte)46);
         }

         if (this instanceof bmx $$14) {
            $$14.N().n();
         }

         return true;
      }
   }

   public boolean fy() {
      return !this.ew();
   }

   public boolean fz() {
      return true;
   }

   public void a(hx $$0, boolean $$1) {
   }

   public boolean f(cng $$0) {
      return false;
   }

   @Override
   public final blz a(bna $$0) {
      return $$0 == bna.c ? u : this.e($$0).a(this.dZ());
   }

   protected blz e(bna $$0) {
      return this.ai().n().a(this.dY());
   }

   public ImmutableList<bna> fA() {
      return ImmutableList.of(bna.a);
   }

   public elx f(bna $$0) {
      blz $$1 = this.a($$0);
      return new elx((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bna $$0) {
      elx $$1 = this.a($$0).a(this.dj());
      return this.dL().b(this, $$1);
   }

   @Override
   public boolean ct() {
      return super.ct() && !this.fD();
   }

   public Optional<hx> fB() {
      return this.an.b(bN);
   }

   public void h(hx $$0) {
      this.an.b(bN, Optional.of($$0));
   }

   public void fC() {
      this.an.b(bN, Optional.empty());
   }

   public boolean fD() {
      return this.fB().isPresent();
   }

   public void b(hx $$0) {
      if (this.bO()) {
         this.ac();
      }

      djp $$1 = this.dL().a_($$0);
      if ($$1.b() instanceof cwr) {
         this.dL().a($$0, $$1.a(cwr.c, Boolean.valueOf(true)), 3);
      }

      this.b(bna.c);
      this.a($$0);
      this.h($$0);
      this.g(emc.b);
      this.au = true;
   }

   private void a(hx $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean N() {
      return this.fB().map($$0 -> this.dL().a_($$0).b() instanceof cwr).orElse(false);
   }

   public void fE() {
      this.fB().filter(this.dL()::B).ifPresent($$0x -> {
         djp $$1 = this.dL().a_($$0x);
         if ($$1.b() instanceof cwr) {
            ic $$2 = $$1.c(cwr.aE);
            this.dL().a($$0x, $$1.a(cwr.c, Boolean.valueOf(false)), 3);
            emc $$3 = cwr.a(this.ai(), this.dL(), $$0x, $$2, this.dB()).orElseGet(() -> {
               hx $$1x = $$0x.c();
               return new emc((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            emc $$4 = emc.c($$0x).d($$3).d();
            float $$5 = (float)aup.d(aup.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      emc $$0 = this.dj();
      this.b(bna.a);
      this.a_($$0.c, $$0.d, $$0.e);
      this.fC();
   }

   @Nullable
   public ic fF() {
      hx $$0 = this.fB().orElse(null);
      return $$0 != null ? cwr.a(this.dL(), $$0) : null;
   }

   @Override
   public boolean by() {
      return !this.fD() && super.by();
   }

   public cng g(cng $$0) {
      return cng.f;
   }

   public cng a(ctx $$0, cng $$1) {
      if ($$1.M()) {
         $$0.a(null, this.dq(), this.ds(), this.dw(), this.d($$1), aru.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$1, $$0, this);
         if (!(this instanceof cfq) || !((cfq)this).fT().d) {
            $$1.h(1);
         }

         this.b(dnz.m);
      }

      return $$1;
   }

   private void a(cng $$0, ctx $$1, bmo $$2) {
      cnb $$3 = $$0.d();
      if ($$3.t()) {
         for (Pair<blj, Float> $$5 : $$3.u().f()) {
            if (!$$1.B && $$5.getFirst() != null && $$1.z.i() < (Float)$$5.getSecond()) {
               $$2.b(new blj((blj)$$5.getFirst()));
            }
         }
      }
   }

   private static byte g(bmd $$0) {
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

   public void d(bmd $$0) {
      this.dL().a(this, g($$0));
   }

   public void d(bkb $$0) {
      this.d($$0 == bkb.a ? bmd.a : bmd.b);
   }

   @Override
   public elx i_() {
      if (this.c(bmd.f).a(cnj.um)) {
         float $$0 = 0.5F;
         return this.cH().c(0.5, 0.5, 0.5);
      } else {
         return super.i_();
      }
   }

   public static bmd h(cng $$0) {
      cmi $$1 = cmi.c_($$0);
      return $$1 != null ? $$1.g() : bmd.a;
   }

   private static bng a(bmo $$0, bmd $$1) {
      return $$1 != bmd.f && $$1 != bmd.a && $$1 != bmd.b ? bng.a($$0, $$1, $$1x -> $$1x.b() || bmq.h($$1x) == $$1) : bng.a($$0, $$1);
   }

   @Nullable
   private static bmd r(int $$0) {
      if ($$0 == 100 + bmd.f.b()) {
         return bmd.f;
      } else if ($$0 == 100 + bmd.e.b()) {
         return bmd.e;
      } else if ($$0 == 100 + bmd.d.b()) {
         return bmd.d;
      } else if ($$0 == 100 + bmd.c.b()) {
         return bmd.c;
      } else if ($$0 == 98) {
         return bmd.a;
      } else {
         return $$0 == 99 ? bmd.b : null;
      }
   }

   @Override
   public bng a_(int $$0) {
      bmd $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dz() {
      if (this.P_()) {
         return false;
      } else {
         boolean $$0 = !this.c(bmd.f).a(asq.az) && !this.c(bmd.e).a(asq.az) && !this.c(bmd.d).a(asq.az) && !this.c(bmd.c).a(asq.az);
         return $$0 && super.dz();
      }
   }

   @Override
   public boolean cd() {
      return !this.dL().y_() && this.a(bll.x) || super.cd();
   }

   @Override
   public float dC() {
      return this.aU;
   }

   @Override
   public void a(zc $$0) {
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
      return this.eT().d() instanceof ckw;
   }

   @Override
   public float dF() {
      float $$0 = (float)this.g(bnu.r);
      return this.cN() instanceof cfq ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public emc l(blw $$0) {
      return this.dj().e(this.a($$0, this.a(this.ap()), this.dZ() * this.dY()));
   }

   protected void a(int $$0, double $$1) {
      this.aW = (float)aup.e(1.0 / (double)$$0, (double)this.aW, $$1);
   }

   public static record a(ars a, ars b) {
   }
}
