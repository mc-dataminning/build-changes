import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
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

public abstract class btk extends bsp implements bsm {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final buq bF = new buq(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, buq.a.c);
   public static final int h = 2;
   public static final int i = 4;
   public static final int j = 98;
   public static final int k = 100;
   public static final int l = 105;
   public static final int m = 6;
   public static final int n = 100;
   private static final int bG = 40;
   public static final double o = 0.003;
   public static final double p = 0.08;
   public static final int q = 20;
   private static final int bH = 10;
   private static final int bI = 2;
   public static final int r = 4;
   public static final float s = 0.42F;
   private static final double bJ = 128.0;
   protected static final int t = 1;
   protected static final int u = 2;
   protected static final int v = 4;
   protected static final akg<Byte> aF = akk.a(btk.class, aki.a);
   private static final akg<Float> bK = akk.a(btk.class, aki.d);
   private static final akg<List<lh>> bL = akk.a(btk.class, aki.m);
   private static final akg<Boolean> bM = akk.a(btk.class, aki.k);
   private static final akg<Integer> bN = akk.a(btk.class, aki.b);
   private static final akg<Integer> bO = akk.a(btk.class, aki.b);
   private static final akg<Optional<iz>> bP = akk.a(btk.class, aki.p);
   private static final int bQ = 15;
   protected static final bss aG = bss.c(0.2F, 0.2F).b(0.2F);
   public static final float aH = 0.5F;
   public static final float aI = 0.5F;
   private static final float bR = 0.21875F;
   private final bup bS;
   private final brf bT = new brf(this);
   private final Map<ji<brv>, brx> bU = Maps.newHashMap();
   private final jr<cuk> bV = jr.a(2, cuk.l);
   private final jr<cuk> bW = jr.a(4, cuk.l);
   private cuk bX = cuk.l;
   public boolean aJ;
   private boolean bY = false;
   public bqo aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public int aQ;
   public float aR;
   public float aS;
   protected int aT;
   public final bul aU = new bul();
   public final int aV = 20;
   public final float aW;
   public final float aX;
   public float aY;
   public float aZ;
   public float ba;
   public float bb;
   @Nullable
   protected cms bc;
   protected int bd;
   protected boolean be;
   protected int bf;
   protected float bg;
   protected float bh;
   protected float bi;
   protected float bj;
   protected float bk;
   protected int bl;
   protected float bm;
   protected boolean bn;
   public float bo;
   public float bp;
   public float bq;
   protected int br;
   protected double bs;
   protected double bt;
   protected double bu;
   protected double bv;
   protected double bw;
   protected double bx;
   protected int by;
   private boolean bZ = true;
   @Nullable
   private btk ca;
   private int cb;
   private btk cc;
   private int cd;
   private float ce;
   private int cf;
   private float cg;
   protected cuk bz = cuk.l;
   protected int bA;
   protected int bB;
   private iz ch;
   private Optional<iz> ci = Optional.empty();
   @Nullable
   private bri cj;
   private long ck;
   protected int bC;
   private float cl;
   private float cm;
   protected bum<?> bD;
   private boolean cn;
   protected float bE = 1.0F;

   protected btk(bsv<? extends btk> $$0, dbt $$1) {
      super($$0, $$1);
      this.bS = new bup(but.a($$0));
      this.t(this.eR());
      this.J = true;
      this.aX = (float)((Math.random() + 1.0) * 0.01F);
      this.at();
      this.aW = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.ba = this.dF();
      vf $$2 = vf.a;
      this.bD = this.a(new Dynamic($$2, (vo)$$2.createMap(ImmutableMap.of($$2.a("memories"), (vo)$$2.emptyMap()))));
   }

   public bum<?> dS() {
      return this.bD;
   }

   protected bum.b<?> dT() {
      return bum.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bum<?> a(Dynamic<?> $$0) {
      return this.dT().a($$0);
   }

   @Override
   public void an() {
      this.a(this.dQ().w(), Float.MAX_VALUE);
   }

   public boolean a(bsv<?> $$0) {
      return true;
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(aF, (byte)0);
      $$0.a(bL, List.of());
      $$0.a(bM, false);
      $$0.a(bN, 0);
      $$0.a(bO, 0);
      $$0.a(bK, 1.0F);
      $$0.a(bP, Optional.empty());
   }

   public static bur.a dU() {
      return bur.a().a(bus.q).a(bus.n).a(bus.r).a(bus.a).a(bus.b).a(bus.p).a(bus.v).a(bus.t).a(bus.l).a(bus.s).a(bus.i).a(bus.m);
   }

   @Override
   protected void a(double $$0, boolean $$1, drx $$2, iz $$3) {
      if (!this.be()) {
         this.bm();
      }

      if (!this.dP().B && $$1 && this.ac > 0.0F) {
         this.dZ();
         this.ea();
         double $$4 = this.g(bus.s);
         if ((double)this.ac > $$4 && !$$2.i()) {
            double $$5 = this.du();
            double $$6 = this.dw();
            double $$7 = this.dA();
            iz $$8 = this.dp();
            if ($$3.u() != $$8.u() || $$3.w() != $$8.w()) {
               double $$9 = $$5 - (double)$$3.u() - 0.5;
               double $$10 = $$7 - (double)$$3.w() - 0.5;
               double $$11 = Math.max(Math.abs($$9), Math.abs($$10));
               $$5 = (double)$$3.u() + 0.5 + $$9 / $$11 * 0.5;
               $$7 = (double)$$3.w() + 0.5 + $$10 / $$11 * 0.5;
            }

            float $$12 = (float)ayu.c((double)this.ac - $$4);
            double $$13 = Math.min((double)(0.2F + $$12 / 15.0F), 2.5);
            int $$14 = (int)(150.0 * $$13);
            ((arb)this.dP()).a(new la(lj.b, $$2), $$5, $$6, $$7, $$14, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.ci = Optional.empty();
      }
   }

   public final boolean dV() {
      return this.ak().a(awp.m);
   }

   public float a(float $$0) {
      return ayu.i($$0, this.cm, this.cl);
   }

   @Override
   public void au() {
      this.aR = this.aS;
      if (this.an) {
         this.fJ().ifPresent(this::a);
      }

      if (this.dW()) {
         this.dX();
      }

      super.au();
      this.dP().ag().a("livingEntityBaseTick");
      if (this.bd() || this.dP().B) {
         this.aC();
      }

      if (this.bD()) {
         boolean $$0 = this instanceof cms;
         if (!this.dP().B) {
            if (this.bE()) {
               this.a(this.dQ().f(), 1.0F);
            } else if ($$0 && !this.dP().C_().a(this.cK())) {
               double $$1 = this.dP().C_().a(this) + this.dP().C_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dP().C_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dQ().v(), (float)Math.max(1, ayu.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(awr.a) && !this.dP().a_(iz.a(this.du(), this.dy(), this.dA())).a(dew.nd)) {
            boolean $$3 = !this.dV() && !bry.c(this) && (!$$0 || !((cms)this).gd().a);
            if ($$3) {
               this.k(this.n(this.cl()));
               if (this.cl() == -20) {
                  this.k(0);
                  evm $$4 = this.ds();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.ah.j() - this.ah.j();
                     double $$7 = this.ah.j() - this.ah.j();
                     double $$8 = this.ah.j() - this.ah.j();
                     this.dP().a(lj.d, this.du() + $$6, this.dw() + $$7, this.dA() + $$8, $$4.c, $$4.d, $$4.e);
                  }

                  this.a(this.dQ().h(), 2.0F);
               }
            }

            if (!this.dP().B && this.bR() && this.dc() != null && this.dc().bT()) {
               this.ac();
            }
         } else if (this.cl() < this.ck()) {
            this.k(this.o(this.cl()));
         }

         if (!this.dP().B) {
            iz $$9 = this.dp();
            if (!Objects.equal(this.ch, $$9)) {
               this.ch = $$9;
               this.c($$9);
            }
         }
      }

      if (this.bD() && (this.bg() || this.aB)) {
         this.aH();
      }

      if (this.aO > 0) {
         this.aO--;
      }

      if (this.am > 0 && !(this instanceof arc)) {
         this.am--;
      }

      if (this.eB() && this.dP().h(this)) {
         this.eg();
      }

      if (this.bd > 0) {
         this.bd--;
      } else {
         this.bc = null;
      }

      if (this.cc != null && !this.cc.bD()) {
         this.cc = null;
      }

      if (this.ca != null) {
         if (!this.ca.bD()) {
            this.a(null);
         } else if (this.ai - this.cb > 100) {
            this.a(null);
         }
      }

      this.es();
      this.bj = this.bi;
      this.aZ = this.aY;
      this.bb = this.ba;
      this.O = this.dF();
      this.P = this.dH();
      this.dP().ag().c();
   }

   public boolean dW() {
      return this.ai % 5 == 0 && this.ds().c != 0.0 && this.ds().e != 0.0 && !this.N_() && czw.k(this) && this.dY();
   }

   protected void dX() {
      evm $$0 = this.ds();
      this.dP()
         .a(
            lj.M,
            this.du() + (this.ah.j() - 0.5) * (double)this.dj(),
            this.dw() + 0.1,
            this.dA() + (this.ah.j() - 0.5) * (double)this.dj(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.ah.i() * 0.4F + this.ah.i() > 0.9F ? 0.6F : 0.0F;
      this.a(avw.xN, $$1, 0.6F + this.ah.i() * 0.4F);
   }

   protected boolean dY() {
      return this.dP().a_(this.aK()).a(awl.aN);
   }

   @Override
   protected float aN() {
      return this.dY() && czw.a(czy.l, this) > 0 ? 1.0F : super.aN();
   }

   @Override
   protected boolean c(drx $$0) {
      return !$$0.i() || this.fE();
   }

   protected void dZ() {
      buo $$0 = this.f(bus.r);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void ea() {
      if (!this.bo().i()) {
         int $$0 = czw.a(czy.l, this);
         if ($$0 > 0 && this.dY()) {
            buo $$1 = this.f(bus.r);
            if ($$1 == null) {
               return;
            }

            $$1.c(new buq(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), buq.a.a));
            if (this.el().i() < 0.04F) {
               cuk $$2 = this.a(bsw.c);
               $$2.a(1, this, bsw.c);
            }
         }
      }
   }

   protected void eb() {
      buo $$0 = this.f(bus.r);
      if ($$0 != null) {
         if ($$0.a(e) != null) {
            $$0.b(e);
         }
      }
   }

   protected void ec() {
      if (!this.bo().i()) {
         int $$0 = this.cm();
         if ($$0 > 0) {
            buo $$1 = this.f(bus.r);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cn();
            $$1.c(new buq(e, "Powder snow slow", (double)$$2, buq.a.a));
         }
      }
   }

   protected void c(iz $$0) {
      int $$1 = czw.a(czy.j, this);
      if ($$1 > 0) {
         czz.a(this, this.dP(), $$0, $$1);
      }

      if (this.c(this.bo())) {
         this.dZ();
      }

      this.ea();
   }

   public boolean p_() {
      return false;
   }

   public float ed() {
      return this.p_() ? 0.5F : 1.0F;
   }

   public float ee() {
      bup $$0 = this.eW();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bus.t));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean ef() {
      return true;
   }

   protected void eg() {
      this.aQ++;
      if (this.aQ >= 20 && !this.dP().x_() && !this.dK()) {
         this.dP().a(this, (byte)60);
         this.a(bsp.c.a);
      }
   }

   public boolean eh() {
      return !this.p_();
   }

   protected boolean ei() {
      return !this.p_();
   }

   protected int n(int $$0) {
      int $$1 = czw.e(this);
      return $$1 > 0 && this.ah.a($$1 + 1) > 0 ? $$0 : $$0 - 1;
   }

   protected int o(int $$0) {
      return Math.min($$0 + 4, this.ck());
   }

   public int ej() {
      return 0;
   }

   protected boolean ek() {
      return false;
   }

   public azc el() {
      return this.ah;
   }

   @Nullable
   public btk em() {
      return this.ca;
   }

   @Override
   public btk T_() {
      return this.em();
   }

   public int en() {
      return this.cb;
   }

   public void c(@Nullable cms $$0) {
      this.bc = $$0;
      this.bd = this.ai;
   }

   public void a(@Nullable btk $$0) {
      this.ca = $$0;
      this.cb = this.ai;
   }

   @Nullable
   public btk eo() {
      return this.cc;
   }

   public int ep() {
      return this.cd;
   }

   public void A(bsp $$0) {
      if ($$0 instanceof btk) {
         this.cc = (btk)$$0;
      } else {
         this.cc = null;
      }

      this.cd = this.ai;
   }

   public int eq() {
      return this.bf;
   }

   public void p(int $$0) {
      this.bf = $$0;
   }

   public boolean er() {
      return this.bY;
   }

   public void q(boolean $$0) {
      this.bY = $$0;
   }

   protected boolean b(bsw $$0) {
      return true;
   }

   public void a(bsw $$0, cuk $$1, cuk $$2) {
      boolean $$3 = $$2.e() && $$1.e();
      if (!$$3 && !cuk.c($$1, $$2) && !this.an) {
         ctm $$4 = ctm.c_($$2);
         if (!this.dP().x_() && !this.N_()) {
            if (!this.aW() && $$4 != null && $$4.m() == $$0) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), $$4.aq_(), this.de(), 1.0F, 1.0F, this.ah.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? dwq.v : dwq.S);
            }
         }
      }
   }

   @Override
   public void a(bsp.c $$0) {
      if ($$0 == bsp.c.a || $$0 == bsp.c.b) {
         for (brx $$1 : this.ex()) {
            $$1.a(this, $$0);
         }
      }

      super.a($$0);
      this.bD.a();
   }

   @Override
   public void b(ur $$0) {
      $$0.a("Health", this.eA());
      $$0.a("HurtTime", (short)this.aO);
      $$0.a("HurtByTimestamp", this.cb);
      $$0.a("DeathTime", (short)this.aQ);
      $$0.a("AbsorptionAmount", this.fs());
      $$0.a("Attributes", this.eW().c());
      if (!this.bU.isEmpty()) {
         ux $$1 = new ux();

         for (brx $$2 : this.bU.values()) {
            $$1.add($$2.j());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fE());
      this.fJ().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<vo> $$3 = this.bD.a(vf.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(ur $$0) {
      this.B($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dP() != null && !this.dP().B) {
         this.eW().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         ux $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ur $$3 = $$1.a($$2);
            brx $$4 = brx.a($$3);
            if ($$4 != null) {
               this.bU.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.t($$0.j("Health"));
      }

      this.aO = $$0.g("HurtTime");
      this.aQ = $$0.g("DeathTime");
      this.cb = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         ewq $$6 = this.dP().M();
         ewl $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cA(), $$7);
         if (!$$8) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         iz $$9 = new iz($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.h($$9);
         this.ao.a(at, btw.c);
         if (!this.an) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bD = this.a(new Dynamic(vf.a, $$0.c("Brain")));
      }
   }

   protected void es() {
      Iterator<ji<brv>> $$0 = this.bU.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            ji<brv> $$1 = $$0.next();
            brx $$2 = this.bU.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dP().B) {
                  $$0.remove();
                  this.a($$2);
               }
            } else if ($$2.d() % 600 == 0) {
               this.a($$2, false, null);
            }
         }
      } catch (ConcurrentModificationException var6) {
      }

      if (this.bZ) {
         if (!this.dP().B) {
            this.J();
            this.v();
         }

         this.bZ = false;
      }

      List<lh> $$3 = this.ao.a(bL);
      if (!$$3.isEmpty()) {
         boolean $$4 = this.ao.a(bM);
         int $$5 = this.ch() ? 15 : 4;
         int $$6 = $$4 ? 5 : 1;
         if (this.ah.a($$5 * $$6) == 0) {
            this.dP().a(ac.a($$3, this.ah), this.d(0.5), this.dx(), this.g(0.5), 1.0, 1.0, 1.0);
         }
      }
   }

   protected void J() {
      if (this.bU.isEmpty()) {
         this.ev();
         this.k(false);
      } else {
         this.k(this.b(brz.n));
         this.s();
      }
   }

   private void s() {
      List<lh> $$0 = this.bU.values().stream().filter(brx::g).map(brx::a).toList();
      this.ao.a(bL, $$0);
      this.ao.a(bM, c(this.bU.values()));
   }

   private void v() {
      boolean $$0 = this.cg();
      if (this.j(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable bsp $$0) {
      double $$1 = 1.0;
      if (this.bY()) {
         $$1 *= 0.8;
      }

      if (this.ch()) {
         float $$2 = this.fd();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cuk $$3 = this.a(bsw.f);
         bsv<?> $$4 = $$0.ak();
         if ($$4 == bsv.aN && $$3.a(cun.ul)
            || $$4 == bsv.bu && $$3.a(cun.uo)
            || $$4 == bsv.aA && $$3.a(cun.ur)
            || $$4 == bsv.aB && $$3.a(cun.ur)
            || $$4 == bsv.x && $$3.a(cun.up)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(btk $$0) {
      return $$0 instanceof cms && this.dP().al() == bqm.a ? false : $$0.et();
   }

   public boolean a(btk $$0, ceb $$1) {
      return $$1.a(this, $$0);
   }

   public boolean et() {
      return !this.cu() && this.eu();
   }

   public boolean eu() {
      return !this.N_() && this.bD();
   }

   public static boolean c(Collection<brx> $$0) {
      for (brx $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void ev() {
      this.ao.a(bL, List.of());
   }

   public boolean ew() {
      if (this.dP().B) {
         return false;
      } else {
         Iterator<brx> $$0 = this.bU.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<brx> ex() {
      return this.bU.values();
   }

   public Map<ji<brv>, brx> ey() {
      return this.bU;
   }

   public boolean b(ji<brv> $$0) {
      return this.bU.containsKey($$0);
   }

   @Nullable
   public brx c(ji<brv> $$0) {
      return this.bU.get($$0);
   }

   public final boolean b(brx $$0) {
      return this.b($$0, null);
   }

   public boolean b(brx $$0, @Nullable bsp $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         brx $$2 = this.bU.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bU.put($$0.c(), $$0);
            this.a($$0, $$1);
            $$3 = true;
            $$0.b(this);
         } else if ($$2.b($$0)) {
            this.a($$2, true, $$1);
            $$3 = true;
         }

         $$0.a(this);
         return $$3;
      }
   }

   public boolean c(brx $$0) {
      if (this.ak().a(awp.G)) {
         return !$$0.a(brz.M);
      } else if (this.ak().a(awp.F)) {
         return !$$0.a(brz.L);
      } else {
         return !this.ak().a(awp.w) ? true : !$$0.a(brz.j) && !$$0.a(brz.s);
      }
   }

   public void c(brx $$0, @Nullable bsp $$1) {
      if (this.c($$0)) {
         brx $$2 = this.bU.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean ez() {
      return this.ak().a(awp.x);
   }

   @Nullable
   public brx d(ji<brv> $$0) {
      return this.bU.remove($$0);
   }

   public boolean e(ji<brv> $$0) {
      brx $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(brx $$0, @Nullable bsp $$1) {
      this.bZ = true;
      if (!this.dP().B) {
         $$0.c().a().a(this.eW(), $$0.e());
         this.d($$0);
      }
   }

   public void d(brx $$0) {
      for (bsp $$1 : this.cS()) {
         if ($$1 instanceof arc $$2) {
            $$2.c.b(new agl(this.al(), $$0, false));
         }
      }
   }

   protected void a(brx $$0, boolean $$1, @Nullable bsp $$2) {
      this.bZ = true;
      if ($$1 && !this.dP().B) {
         brv $$3 = $$0.c().a();
         $$3.a(this.eW());
         $$3.a(this.eW(), $$0.e());
         this.z();
      }

      if (!this.dP().B) {
         this.d($$0);
      }
   }

   protected void a(brx $$0) {
      this.bZ = true;
      if (!this.dP().B) {
         $$0.c().a().a(this.eW());
         this.z();

         for (bsp $$1 : this.cS()) {
            if ($$1 instanceof arc $$2) {
               $$2.c.b(new aeq(this.al(), $$0.c()));
            }
         }
      }
   }

   private void z() {
      for (buo $$0 : this.eW().a()) {
         this.i($$0.a());
      }
   }

   private void i(ji<bun> $$0) {
      if ($$0.a(bus.q)) {
         float $$1 = this.eR();
         if (this.eA() > $$1) {
            this.t($$1);
         }
      } else if ($$0.a(bus.p)) {
         float $$2 = this.eS();
         if (this.fs() > $$2) {
            this.A($$2);
         }
      }
   }

   public void c(float $$0) {
      float $$1 = this.eA();
      if ($$1 > 0.0F) {
         this.t($$1 + $$0);
      }
   }

   public float eA() {
      return this.ao.a(bK);
   }

   public void t(float $$0) {
      this.ao.a(bK, ayu.a($$0, 0.0F, this.eR()));
   }

   public boolean eB() {
      return this.eA() <= 0.0F;
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dP().B) {
         return false;
      } else if (this.eB()) {
         return false;
      } else if ($$0.a(awn.j) && this.b(brz.l)) {
         return false;
      } else {
         if (this.fL() && !this.dP().B) {
            this.fM();
         }

         this.bf = 0;
         float $$2 = $$1;
         boolean $$3 = false;
         float $$4 = 0.0F;
         if ($$1 > 0.0F && this.f($$0)) {
            this.v($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.a(awn.k) && $$0.c() instanceof btk $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(awn.p) && this.ak().a(awp.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(awn.a) && !this.a(bsw.f).e()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.aU.a(1.5F);
         boolean $$7 = true;
         if ((float)this.am > 10.0F && !$$0.a(awn.f)) {
            if ($$1 <= this.bm) {
               return false;
            }

            this.f($$0, $$1 - this.bm);
            this.bm = $$1;
            $$7 = false;
         } else {
            this.bm = $$1;
            this.am = 20;
            this.f($$0, $$1);
            this.aP = 10;
            this.aO = this.aP;
         }

         bsp $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof btk $$9 && !$$0.a(awn.r) && (!$$0.a(brl.G) || !this.ak().a(awp.E))) {
               this.a($$9);
            }

            if ($$8 instanceof cms $$10) {
               this.bd = 100;
               this.bc = $$10;
            } else if ($$8 instanceof cgd $$11 && $$11.s()) {
               this.bd = 100;
               if ($$11.P_() instanceof cms $$12) {
                  this.bc = $$12;
               } else {
                  this.bc = null;
               }
            }
         }

         if ($$7) {
            if ($$3) {
               this.dP().a(this, (byte)29);
            } else {
               this.dP().a(this, $$0);
            }

            if (!$$0.a(awn.s) && (!$$3 || $$1 > 0.0F)) {
               this.bv();
            }

            if ($$8 != null && !$$0.a(awn.A)) {
               double $$13 = $$8.du() - this.du();

               double $$14;
               for ($$14 = $$8.dA() - this.dA(); $$13 * $$13 + $$14 * $$14 < 1.0E-4; $$14 = (Math.random() - Math.random()) * 0.01) {
                  $$13 = (Math.random() - Math.random()) * 0.01;
               }

               this.q(0.4F, $$13, $$14);
               if (!$$3) {
                  this.a($$13, $$14);
               }
            }
         }

         if (this.eB()) {
            if (!this.h($$0)) {
               if ($$7) {
                  this.b(this.o_());
               }

               this.a($$0);
            }
         } else if ($$7) {
            this.e($$0);
         }

         boolean $$15 = !$$3 || $$1 > 0.0F;
         if ($$15) {
            this.cj = $$0;
            this.ck = this.dP().Z();

            for (brx $$16 : this.ex()) {
               $$16.a(this, $$0, $$1);
            }
         }

         if (this instanceof arc) {
            am.i.a((arc)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((arc)this).a(awg.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof arc) {
            am.h.a((arc)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$15;
      }
   }

   protected void d(btk $$0) {
      $$0.e(this);
   }

   protected void e(btk $$0) {
      $$0.q(0.5, $$0.du() - this.du(), $$0.dA() - this.dA());
   }

   private boolean h(bri $$0) {
      if ($$0.a(awn.e)) {
         return false;
      } else {
         cuk $$1 = null;

         for (bqo $$2 : bqo.values()) {
            cuk $$3 = this.b($$2);
            if ($$3.a(cun.vt)) {
               $$1 = $$3.s();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof arc $$4) {
               $$4.b(awg.c.b(cun.vt));
               am.C.a($$4, $$1);
               this.a(dwq.C);
            }

            this.t(1.0F);
            this.ew();
            this.b(new brx(brz.j, 900, 1));
            this.b(new brx(brz.v, 100, 1));
            this.b(new brx(brz.l, 800, 0));
            this.dP().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bri eC() {
      if (this.dP().Z() - this.ck > 40L) {
         this.cj = null;
      }

      return this.cj;
   }

   protected void e(bri $$0) {
      this.b(this.d($$0));
   }

   public void b(@Nullable avv $$0) {
      if ($$0 != null) {
         this.a($$0, this.fe(), this.ff());
      }
   }

   public boolean f(bri $$0) {
      bsp $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cmy $$3 && $$3.D() > 0) {
         $$2 = true;
      }

      if (!$$0.a(awn.d) && this.fC() && !$$2) {
         evm $$4 = $$0.h();
         if ($$4 != null) {
            evm $$5 = this.b(0.0F, this.cs());
            evm $$6 = $$4.a(this.dn());
            $$6 = new evm($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(cuk $$0) {
      if (!$$0.e()) {
         if (!this.aW()) {
            this.dP().a(this.du(), this.dw(), this.dA(), $$0.L(), this.de(), 0.8F, 0.8F + this.dP().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bri $$0) {
      if (!this.dK() && !this.be) {
         bsp $$1 = $$0.d();
         btk $$2 = this.eQ();
         if (this.bl >= 0 && $$2 != null) {
            $$2.a(this, this.bl, $$0);
         }

         if (this.fL()) {
            this.fM();
         }

         if (!this.dP().B && this.ag()) {
            b.info("Named entity {} died: {}", this, this.eP().a().getString());
         }

         this.be = true;
         this.eP().c();
         if (this.dP() instanceof arb $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(dwq.p);
               this.g($$0);
               this.f($$2);
            }

            this.dP().a(this, (byte)3);
         }

         this.b(btw.h);
      }
   }

   protected void f(@Nullable btk $$0) {
      if (!this.dP().B) {
         boolean $$1 = false;
         if ($$0 instanceof ciq) {
            if (this.dP().ab().b(dbp.c)) {
               iz $$2 = this.dp();
               drx $$3 = dew.cd.n();
               if (this.dP().a_($$2).i() && $$3.a((dbw)this.dP(), $$2)) {
                  this.dP().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               cjc $$4 = new cjc(this.dP(), this.du(), this.dw(), this.dA(), new cuk(cun.dw));
               this.dP().b($$4);
            }
         }
      }
   }

   protected void g(bri $$0) {
      bsp $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof cms) {
         $$2 = czw.h((btk)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.bd > 0;
      if (this.ei() && this.dP().ab().b(dbp.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.eD();
      this.eE();
   }

   protected void eD() {
   }

   protected void eE() {
      if (this.dP() instanceof arb && !this.eI() && (this.ek() || this.bd > 0 && this.eh() && this.dP().ab().b(dbp.f))) {
         bta.a((arb)this.dP(), this.dn(), this.ej());
      }
   }

   protected void a(bri $$0, int $$1, boolean $$2) {
   }

   public ala<eqi> eF() {
      return this.ak().k();
   }

   public long eG() {
      return 0L;
   }

   protected void a(bri $$0, boolean $$1) {
      ala<eqi> $$2 = this.eF();
      eqi $$3 = this.dP().o().be().b($$2);
      eqg.a $$4 = new eqg.a((arb)this.dP()).a(esz.a, this).a(esz.f, this.dn()).a(esz.c, $$0).b(esz.d, $$0.d()).b(esz.e, $$0.c());
      if ($$1 && this.bc != null) {
         $$4 = $$4.a(esz.b, this.bc).a(this.bc.gy());
      }

      eqg $$5 = $$4.a(esy.g);
      $$3.a($$5, this.eG(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.g(bus.n);
      if (!($$0 <= 0.0)) {
         this.av = true;
         evm $$3 = this.ds();
         evm $$4 = new evm($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aE() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected avv d(bri $$0) {
      return avw.kg;
   }

   @Nullable
   protected avv o_() {
      return avw.kb;
   }

   private avv d(int $$0) {
      return $$0 > 4 ? this.eL().b() : this.eL().a();
   }

   public void eH() {
      this.cn = true;
   }

   public boolean eI() {
      return this.cn;
   }

   public float eJ() {
      return 0.0F;
   }

   protected evh eK() {
      evh $$0 = this.cK();
      bsp $$1 = this.dc();
      if ($$1 != null) {
         evm $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public btk.a eL() {
      return new btk.a(avw.kh, avw.jZ);
   }

   protected avv c(cuk $$0) {
      return $$0.J();
   }

   public avv d(cuk $$0) {
      return $$0.K();
   }

   public Optional<iz> eM() {
      return this.ci;
   }

   public boolean q_() {
      if (this.N_()) {
         return false;
      } else {
         iz $$0 = this.dp();
         drx $$1 = this.dq();
         if ($$1.a(awl.aP)) {
            this.ci = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dnh && this.c($$0, $$1)) {
            this.ci = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(iz $$0, drx $$1) {
      if ($$1.c(dnh.b)) {
         drx $$2 = this.dP().a_($$0.d());
         if ($$2.a(dew.cO) && $$2.c(dja.b) == $$1.c(dnh.aE)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean bD() {
      return !this.dK() && this.eA() > 0.0F;
   }

   @Override
   public int cx() {
      return this.u(0.0F);
   }

   protected final int u(float $$0) {
      return ayu.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bri $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.d($$0, $$1);
      if ($$4 > 0) {
         this.a(this.d($$4), 1.0F, 1.0F);
         this.eN();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int d(float $$0, float $$1) {
      if (this.ak().a(awp.o)) {
         return 0;
      } else {
         float $$2 = (float)this.g(bus.s);
         float $$3 = $$0 - $$2;
         return ayu.c((double)($$3 * $$1) * this.g(bus.i));
      }
   }

   protected void eN() {
      if (!this.aW()) {
         int $$0 = ayu.a(this.du());
         int $$1 = ayu.a(this.dw() - 0.2F);
         int $$2 = ayu.a(this.dA());
         drx $$3 = this.dP().a_(new iz($$0, $$1, $$2));
         if (!$$3.i()) {
            dmh $$4 = $$3.w();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void m(float $$0) {
      this.aP = 10;
      this.aO = this.aP;
   }

   public int eO() {
      return ayu.a(this.g(bus.a));
   }

   protected void b(bri $$0, float $$1) {
   }

   protected void c(bri $$0, float $$1) {
   }

   protected void v(float $$0) {
   }

   protected void a(bri $$0, float $$1, bsw... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bsw $$4 : $$2) {
            cuk $$5 = this.a($$4);
            if ($$5.g() instanceof crz && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float d(bri $$0, float $$1) {
      if (!$$0.a(awn.c)) {
         this.b($$0, $$1);
         $$1 = bre.a($$1, $$0, (float)this.eO(), (float)this.g(bus.b));
      }

      return $$1;
   }

   protected float e(bri $$0, float $$1) {
      if ($$0.a(awn.g)) {
         return $$1;
      } else {
         if (this.b(brz.k) && !$$0.a(awn.h)) {
            int $$2 = (this.c(brz.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof arc) {
                  ((arc)this).a(awg.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof arc) {
                  ((arc)$$0.d()).a(awg.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(awn.i)) {
            return $$1;
         } else {
            int $$7 = czw.a(this.fb(), $$0);
            if ($$7 > 0) {
               $$1 = bre.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bri $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fs(), 0.0F);
         this.A(this.fs() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof arc $$4) {
            $$4.a(awg.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eP().a($$0, var9);
            this.t(this.eA() - var9);
            this.A(this.fs() - var9);
            this.a(dwq.o);
         }
      }
   }

   public brf eP() {
      return this.bT;
   }

   @Nullable
   public btk eQ() {
      if (this.bc != null) {
         return this.bc;
      } else {
         return this.ca != null ? this.ca : null;
      }
   }

   public final float eR() {
      return (float)this.g(bus.q);
   }

   public final float eS() {
      return (float)this.g(bus.p);
   }

   public final int eT() {
      return this.ao.a(bN);
   }

   public final void q(int $$0) {
      this.ao.a(bN, $$0);
   }

   public final int eU() {
      return this.ao.a(bO);
   }

   public final void r(int $$0) {
      this.ao.a(bO, $$0);
   }

   private int A() {
      if (bry.a(this)) {
         return 6 - (1 + bry.b(this));
      } else {
         return this.b(brz.d) ? 6 + (1 + this.c(brz.d).e()) * 2 : 6;
      }
   }

   public void a(bqo $$0) {
      this.a($$0, false);
   }

   public void a(bqo $$0, boolean $$1) {
      if (!this.aJ || this.aL >= this.A() / 2 || this.aL < 0) {
         this.aL = -1;
         this.aJ = true;
         this.aK = $$0;
         if (this.dP() instanceof arb) {
            ach $$2 = new ach(this, $$0 == bqo.a ? 0 : 3);
            aqz $$3 = ((arb)this.dP()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bri $$0) {
      this.aU.a(1.5F);
      this.am = 20;
      this.aP = 10;
      this.aO = this.aP;
      avv $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.fe(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
      }

      this.a(this.dQ().n(), 0.0F);
      this.cj = $$0;
      this.ck = this.dP().Z();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            avv $$1 = this.o_();
            if ($$1 != null) {
               this.a($$1, this.fe(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cms)) {
               this.t(0.0F);
               this.a(this.dQ().n());
            }
            break;
         case 29:
            this.a(avw.wA, 1.0F, 0.8F + this.dP().z.i() * 0.4F);
            break;
         case 30:
            this.a(avw.wB, 0.8F, 0.8F + this.dP().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ah.i() - 0.5F) * 0.2F;
               float $$6 = (this.ah.i() - 0.5F) * 0.2F;
               float $$7 = (this.ah.i() - 0.5F) * 0.2F;
               double $$8 = ayu.d($$4, this.L, this.du()) + (this.ah.j() - 0.5) * (double)this.dj() * 2.0;
               double $$9 = ayu.d($$4, this.M, this.dw()) + this.ah.j() * (double)this.dk();
               double $$10 = ayu.d($$4, this.N, this.dA()) + (this.ah.j() - 0.5) * (double)this.dj() * 2.0;
               this.dP().a(lj.ac, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.a(bsw.a));
            break;
         case 48:
            this.i(this.a(bsw.b));
            break;
         case 49:
            this.i(this.a(bsw.f));
            break;
         case 50:
            this.i(this.a(bsw.e));
            break;
         case 51:
            this.i(this.a(bsw.d));
            break;
         case 52:
            this.i(this.a(bsw.c));
            break;
         case 54:
            dio.b(this);
            break;
         case 55:
            this.C();
            break;
         case 60:
            this.B();
            break;
         case 65:
            this.i(this.a(bsw.g));
            break;
         default:
            super.b($$0);
      }
   }

   private void B() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.ah.k() * 0.02;
         double $$2 = this.ah.k() * 0.02;
         double $$3 = this.ah.k() * 0.02;
         this.dP().a(lj.ab, this.d(1.0), this.dx(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void C() {
      cuk $$0 = this.a(bsw.b);
      this.a(bsw.b, this.a(bsw.a));
      this.a(bsw.a, $$0);
   }

   @Override
   protected void aD() {
      this.a(this.dQ().m(), 4.0F);
   }

   protected void eV() {
      int $$0 = this.A();
      if (this.aJ) {
         this.aL++;
         if (this.aL >= $$0) {
            this.aL = 0;
            this.aJ = false;
         }
      } else {
         this.aL = 0;
      }

      this.aS = (float)this.aL / (float)$$0;
   }

   @Nullable
   public buo f(ji<bun> $$0) {
      return this.eW().a($$0);
   }

   public double g(ji<bun> $$0) {
      return this.eW().c($$0);
   }

   public double h(ji<bun> $$0) {
      return this.eW().d($$0);
   }

   public bup eW() {
      return this.bS;
   }

   public cuk eX() {
      return this.a(bsw.a);
   }

   public cuk eY() {
      return this.a(bsw.b);
   }

   public boolean b(cuf $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cuk> $$0) {
      return $$0.test(this.eX()) || $$0.test(this.eY());
   }

   public cuk b(bqo $$0) {
      if ($$0 == bqo.a) {
         return this.a(bsw.a);
      } else if ($$0 == bqo.b) {
         return this.a(bsw.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bqo $$0, cuk $$1) {
      if ($$0 == bqo.a) {
         this.a(bsw.a, $$1);
      } else {
         if ($$0 != bqo.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bsw.b, $$1);
      }
   }

   public boolean c(bsw $$0) {
      return !this.a($$0).e();
   }

   public boolean d(bsw $$0) {
      return false;
   }

   public abstract Iterable<cuk> eZ();

   public abstract cuk a(bsw var1);

   public abstract void a(bsw var1, cuk var2);

   public Iterable<cuk> fa() {
      return List.of();
   }

   public Iterable<cuk> fb() {
      return this.eZ();
   }

   public Iterable<cuk> fc() {
      return Iterables.concat(this.fa(), this.fb());
   }

   protected void e(cuk $$0) {
      $$0.g().n($$0);
   }

   public float fd() {
      Iterable<cuk> $$0 = this.eZ();
      int $$1 = 0;
      int $$2 = 0;

      for (cuk $$3 : $$0) {
         if (!$$3.e()) {
            $$2++;
         }

         $$1++;
      }

      return $$1 > 0 ? (float)$$2 / (float)$$1 : 0.0F;
   }

   @Override
   public void h(boolean $$0) {
      super.h($$0);
      buo $$1 = this.f(bus.r);
      $$1.b(bF.b());
      if ($$0) {
         $$1.c(bF);
      }
   }

   protected float fe() {
      return 1.0F;
   }

   public float ff() {
      return this.p_() ? (this.ah.i() - this.ah.i()) * 0.2F + 1.5F : (this.ah.i() - this.ah.i()) * 0.2F + 1.0F;
   }

   protected boolean fg() {
      return this.eB();
   }

   @Override
   public void h(bsp $$0) {
      if (!this.fL()) {
         super.h($$0);
      }
   }

   private void b(bsp $$0) {
      evm $$1;
      if (this.dK()) {
         $$1 = this.dn();
      } else if (!$$0.dK() && !this.dP().a_($$0.dp()).a(awl.aJ)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dw(), $$0.dw());
         $$1 = new evm(this.du(), $$2, this.dA());
      }

      this.a($$1.c, $$1.d, $$1.e);
   }

   @Override
   public boolean cF() {
      return this.cE();
   }

   protected float fh() {
      return this.w(1.0F);
   }

   protected float w(float $$0) {
      return (float)this.g(bus.m) * $$0 * this.aM() + this.fi();
   }

   public float fi() {
      return this.b(brz.h) ? 0.1F * ((float)this.c(brz.h).e() + 1.0F) : 0.0F;
   }

   protected void fj() {
      float $$0 = this.fh();
      if (!($$0 <= 1.0E-5F)) {
         evm $$1 = this.ds();
         this.o($$1.c, (double)$$0, $$1.e);
         if (this.cb()) {
            float $$2 = this.dF() * (float) (Math.PI / 180.0);
            this.i(new evm((double)(-ayu.a($$2)) * 0.2, 0.0, (double)ayu.b($$2) * 0.2));
         }

         this.av = true;
      }
   }

   protected void fk() {
      this.h(this.ds().b(0.0, -0.04F, 0.0));
   }

   protected void c(axb<enp> $$0) {
      this.h(this.ds().b(0.0, 0.04F, 0.0));
   }

   protected float fl() {
      return 0.8F;
   }

   public boolean a(enq $$0) {
      return false;
   }

   @Override
   protected double aY() {
      return this.g(bus.l);
   }

   public void a(evm $$0) {
      if (this.da()) {
         double $$1 = this.aZ();
         boolean $$2 = this.ds().d <= 0.0;
         if ($$2 && this.b(brz.B)) {
            $$1 = Math.min($$1, 0.01);
         }

         enq $$3 = this.dP().b_(this.dp());
         if (this.be() && this.ef() && !this.a($$3)) {
            double $$4 = this.dw();
            float $$5 = this.cb() ? 0.9F : this.fl();
            float $$6 = 0.02F;
            float $$7 = (float)czw.f(this);
            if ($$7 > 3.0F) {
               $$7 = 3.0F;
            }

            if (!this.aE()) {
               $$7 *= 0.5F;
            }

            if ($$7 > 0.0F) {
               $$5 += (0.54600006F - $$5) * $$7 / 3.0F;
               $$6 += (this.fn() - $$6) * $$7 / 3.0F;
            }

            if (this.b(brz.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(btp.a, this.ds());
            evm $$8 = this.ds();
            if (this.Q && this.q_()) {
               $$8 = new evm($$8.c, 0.2, $$8.e);
            }

            this.h($$8.d((double)$$5, 0.8F, (double)$$5));
            evm $$9 = this.a($$1, $$2, this.ds());
            this.h($$9);
            if (this.Q && this.g($$9.c, $$9.d + 0.6F - this.dw() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bs() && this.ef() && !this.a($$3)) {
            double $$10 = this.dw();
            this.a(0.02F, $$0);
            this.a(btp.a, this.ds());
            if (this.b(awr.b) <= this.di()) {
               this.h(this.ds().d(0.5, 0.8F, 0.5));
               evm $$11 = this.a($$1, $$2, this.ds());
               this.h($$11);
            } else {
               this.h(this.ds().a(0.5));
            }

            if ($$1 != 0.0) {
               this.h(this.ds().b(0.0, -$$1 / 4.0, 0.0));
            }

            evm $$12 = this.ds();
            if (this.Q && this.g($$12.c, $$12.d + 0.6F - this.dw() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fE()) {
            this.cq();
            evm $$13 = this.ds();
            evm $$14 = this.bL();
            float $$15 = this.dH() * (float) (Math.PI / 180.0);
            double $$16 = Math.sqrt($$14.c * $$14.c + $$14.e * $$14.e);
            double $$17 = $$13.h();
            double $$18 = $$14.f();
            double $$19 = Math.cos((double)$$15);
            $$19 = $$19 * $$19 * Math.min(1.0, $$18 / 0.4);
            $$13 = this.ds().b(0.0, $$1 * (-1.0 + $$19 * 0.75), 0.0);
            if ($$13.d < 0.0 && $$16 > 0.0) {
               double $$20 = $$13.d * -0.1 * $$19;
               $$13 = $$13.b($$14.c * $$20 / $$16, $$20, $$14.e * $$20 / $$16);
            }

            if ($$15 < 0.0F && $$16 > 0.0) {
               double $$21 = $$17 * (double)(-ayu.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.h($$13.d(0.99F, 0.98F, 0.99F));
            this.a(btp.a, this.ds());
            if (this.Q && !this.dP().B) {
               double $$22 = this.ds().h();
               double $$23 = $$17 - $$22;
               float $$24 = (float)($$23 * 10.0 - 3.0);
               if ($$24 > 0.0F) {
                  this.a(this.d((int)$$24), 1.0F, 1.0F);
                  this.a(this.dQ().l(), $$24);
               }
            }

            if (this.aE() && !this.dP().B) {
               this.b(7, false);
            }
         } else {
            iz $$25 = this.aK();
            float $$26 = this.dP().a_($$25).b().h();
            float $$27 = this.aE() ? $$26 * 0.91F : 0.91F;
            evm $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.b(brz.y)) {
               $$29 += (0.05 * (double)(this.c(brz.y).e() + 1) - $$28.d) * 0.2;
            } else if (!this.dP().B || this.dP().B($$25)) {
               $$29 -= $$1;
            } else if (this.dw() > (double)this.dP().I_()) {
               $$29 = -0.1;
            } else {
               $$29 = 0.0;
            }

            if (this.er()) {
               this.o($$28.c, $$29, $$28.e);
            } else {
               this.o($$28.c * (double)$$27, this instanceof cfj ? $$29 * (double)$$27 : $$29 * 0.98F, $$28.e * (double)$$27);
            }
         }
      }

      this.r(this instanceof cfj);
   }

   private void c(cms $$0, evm $$1) {
      evm $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.da()) {
         this.y(this.e($$0));
         this.a($$2);
      } else {
         this.r(false);
         this.h(evm.b);
         this.aF();
      }
   }

   protected void a(cms $$0, evm $$1) {
   }

   protected evm b(cms $$0, evm $$1) {
      return $$1;
   }

   protected float e(cms $$0) {
      return this.fn();
   }

   public void r(boolean $$0) {
      float $$1 = (float)ayu.g(this.du() - this.L, $$0 ? this.dw() - this.M : 0.0, this.dA() - this.N);
      this.x($$1);
   }

   protected void x(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aU.a($$1, 0.4F);
   }

   public evm a(evm $$0, float $$1) {
      this.a(this.C($$1), $$0);
      this.h(this.k(this.ds()));
      this.a(btp.a, this.ds());
      evm $$2 = this.ds();
      if ((this.Q || this.bn) && (this.q_() || this.dq().a(dew.qP) && dko.a(this))) {
         $$2 = new evm($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public evm a(double $$0, boolean $$1, evm $$2) {
      if ($$0 != 0.0 && !this.cb()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new evm($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private evm k(evm $$0) {
      if (this.q_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = ayu.a($$0.c, -0.15F, 0.15F);
         double $$3 = ayu.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dq().a(dew.nS) && this.fD() && this instanceof cms) {
            $$4 = 0.0;
         }

         $$0 = new evm($$2, $$4, $$3);
      }

      return $$0;
   }

   private float C(float $$0) {
      return this.aE() ? this.fn() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fm();
   }

   protected float fm() {
      return this.cQ() instanceof cms ? this.fn() * 0.1F : 0.02F;
   }

   public float fn() {
      return this.ce;
   }

   public void y(float $$0) {
      this.ce = $$0;
   }

   public boolean C(bsp $$0) {
      this.A($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.H();
      this.K();
      if (!this.dP().B) {
         int $$0 = this.eT();
         if ($$0 > 0) {
            if (this.aM <= 0) {
               this.aM = 20 * (30 - $$0);
            }

            this.aM--;
            if (this.aM <= 0) {
               this.q($$0 - 1);
            }
         }

         int $$1 = this.eU();
         if ($$1 > 0) {
            if (this.aN <= 0) {
               this.aN = 20 * (30 - $$1);
            }

            this.aN--;
            if (this.aN <= 0) {
               this.r($$1 - 1);
            }
         }

         this.D();
         if (this.ai % 20 == 0) {
            this.eP().c();
         }

         if (this.fL() && !this.M()) {
            this.fM();
         }
      }

      if (!this.dK()) {
         this.n_();
      }

      double $$2 = this.du() - this.L;
      double $$3 = this.dA() - this.N;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aY;
      float $$6 = 0.0F;
      this.bg = this.bh;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)ayu.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = ayu.e(ayu.g(this.dF()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aS > 0.0F) {
         $$5 = this.dF();
      }

      if (!this.aE()) {
         $$7 = 0.0F;
      }

      this.bh = this.bh + ($$7 - this.bh) * 0.3F;
      this.dP().ag().a("headTurn");
      $$6 = this.e($$5, $$6);
      this.dP().ag().c();
      this.dP().ag().a("rangeChecks");

      while (this.dF() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dF() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aY - this.aZ < -180.0F) {
         this.aZ -= 360.0F;
      }

      while (this.aY - this.aZ >= 180.0F) {
         this.aZ += 360.0F;
      }

      while (this.dH() - this.P < -180.0F) {
         this.P -= 360.0F;
      }

      while (this.dH() - this.P >= 180.0F) {
         this.P += 360.0F;
      }

      while (this.ba - this.bb < -180.0F) {
         this.bb -= 360.0F;
      }

      while (this.ba - this.bb >= 180.0F) {
         this.bb += 360.0F;
      }

      this.dP().ag().c();
      this.bi += $$6;
      if (this.fE()) {
         this.bB++;
      } else {
         this.bB = 0;
      }

      if (this.fL()) {
         this.s(0.0F);
      }

      this.z();
      float $$10 = this.ee();
      if ($$10 != this.bE) {
         this.bE = $$10;
         this.j_();
      }
   }

   private void D() {
      Map<bsw, cuk> $$0 = this.E();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bsw, cuk> E() {
      Map<bsw, cuk> $$0 = null;

      for (bsw $$1 : bsw.values()) {
         cuk $$2 = switch ($$1.a()) {
            case a -> this.g($$1);
            case b -> this.f($$1);
            case c -> this.bX;
         };
         cuk $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bsw.class);
            }

            $$0.put($$1, $$3);
            bup $$4 = this.eW();
            if (!$$2.e()) {
               $$2.a($$1, ($$1x, $$2x) -> {
                  buo $$3x = $$4.a($$1x);
                  if ($$3x != null) {
                     $$3x.e($$2x);
                  }
               });
            }

            if (!$$3.e()) {
               $$3.a($$1, ($$1x, $$2x) -> {
                  buo $$3x = $$4.a($$1x);
                  if ($$3x != null) {
                     $$3x.b($$2x.b());
                     $$3x.c($$2x);
                  }
               });
            }
         }
      }

      return $$0;
   }

   public boolean a(cuk $$0, cuk $$1) {
      return !cuk.a($$1, $$0);
   }

   private void a(Map<bsw, cuk> $$0) {
      cuk $$1 = $$0.get(bsw.a);
      cuk $$2 = $$0.get(bsw.b);
      if ($$1 != null && $$2 != null && cuk.a($$1, this.g(bsw.b)) && cuk.a($$2, this.g(bsw.a))) {
         ((arb)this.dP()).l().b(this, new adi(this, (byte)55));
         $$0.remove(bsw.a);
         $$0.remove(bsw.b);
         this.c(bsw.a, $$1.s());
         this.c(bsw.b, $$2.s());
      }
   }

   private void b(Map<bsw, cuk> $$0) {
      List<Pair<bsw, cuk>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cuk $$3 = $$2.s();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
               break;
            case c:
               this.bX = $$3;
         }
      });
      ((arb)this.dP()).l().b(this, new afm(this.al(), $$1));
   }

   private cuk f(bsw $$0) {
      return this.bW.get($$0.b());
   }

   private void b(bsw $$0, cuk $$1) {
      this.bW.set($$0.b(), $$1);
   }

   private cuk g(bsw $$0) {
      return this.bV.get($$0.b());
   }

   private void c(bsw $$0, cuk $$1) {
      this.bV.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = ayu.g($$0 - this.aY);
      this.aY += $$2 * 0.3F;
      float $$3 = ayu.g(this.dF() - this.aY);
      float $$4 = this.fo();
      if (Math.abs($$3) > $$4) {
         this.aY = this.aY + ($$3 - (float)ayu.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float fo() {
      return 50.0F;
   }

   public void n_() {
      if (this.cf > 0) {
         this.cf--;
      }

      if (this.da()) {
         this.br = 0;
         this.f(this.du(), this.dw(), this.dA());
      }

      if (this.br > 0) {
         this.a(this.br, this.bs, this.bt, this.bu, this.bv, this.bw);
         this.br--;
      } else if (!this.db()) {
         this.h(this.ds().a(0.98));
      }

      if (this.by > 0) {
         this.a(this.by, this.bx);
         this.by--;
      }

      evm $$0 = this.ds();
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
      this.dP().ag().a("ai");
      if (this.fg()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      } else if (this.db()) {
         this.dP().ag().a("newAi");
         this.fq();
         this.dP().ag().c();
      }

      this.dP().ag().c();
      this.dP().ag().a("jump");
      if (this.bn && this.ef()) {
         double $$4;
         if (this.bs()) {
            $$4 = this.b(awr.b);
         } else {
            $$4 = this.b(awr.a);
         }

         boolean $$6 = this.be() && $$4 > 0.0;
         double $$7 = this.di();
         if (!$$6 || this.aE() && !($$4 > $$7)) {
            if (!this.bs() || this.aE() && !($$4 > $$7)) {
               if ((this.aE() || $$6 && $$4 <= $$7) && this.cf == 0) {
                  this.fj();
                  this.cf = 10;
               }
            } else {
               this.c(awr.b);
            }
         } else {
            this.c(awr.a);
         }
      } else {
         this.cf = 0;
      }

      this.dP().ag().c();
      this.dP().ag().a("travel");
      this.bo *= 0.98F;
      this.bq *= 0.98F;
      this.G();
      evh $$8 = this.cK();
      evm $$9 = new evm((double)this.bo, (double)this.bp, (double)this.bq);
      if (this.b(brz.B) || this.b(brz.y)) {
         this.n();
      }

      label104: {
         if (this.cQ() instanceof cms $$10 && this.bD()) {
            this.c($$10, $$9);
            break label104;
         }

         this.a($$9);
      }

      this.dP().ag().c();
      this.dP().ag().a("freezing");
      if (!this.dP().B && !this.eB()) {
         int $$11 = this.cm();
         if (this.aB && this.dD()) {
            this.l(Math.min(this.cp(), $$11 + 1));
         } else {
            this.l(Math.max(0, $$11 - 2));
         }
      }

      this.eb();
      this.ec();
      if (!this.dP().B && this.ai % 40 == 0 && this.co() && this.dD()) {
         this.a(this.dQ().t(), 1.0F);
      }

      this.dP().ag().c();
      this.dP().ag().a("push");
      if (this.bC > 0) {
         this.bC--;
         this.a($$8, this.cK());
      }

      this.q();
      this.dP().ag().c();
      if (!this.dP().B && this.fp() && this.bg()) {
         this.a(this.dQ().h(), 1.0F);
      }
   }

   public boolean fp() {
      return false;
   }

   private void G() {
      boolean $$0 = this.j(7);
      if ($$0 && !this.aE() && !this.bR() && !this.b(brz.y)) {
         cuk $$1 = this.a(bsw.e);
         if ($$1.a(cun.nT) && ctg.j($$1)) {
            $$0 = true;
            int $$2 = this.bB + 1;
            if (!this.dP().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, bsw.e);
               }

               this.a(dwq.n);
            }
         } else {
            $$0 = false;
         }
      } else {
         $$0 = false;
      }

      if (!this.dP().B) {
         this.b(7, $$0);
      }
   }

   protected void fq() {
   }

   protected void q() {
      if (this.dP().x_()) {
         this.dP().a(dwe.a(cms.class), this.cK(), bsu.a(this)).forEach(this::D);
      } else {
         List<bsp> $$0 = this.dP().a(this, this.cK(), bsu.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dP().ab().c(dbp.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ah.a(4) == 0) {
               int $$2 = 0;

               for (bsp $$3 : $$0) {
                  if (!$$3.bR()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dQ().g(), 6.0F);
               }
            }

            for (bsp $$4 : $$0) {
               this.D($$4);
            }
         }
      }
   }

   protected void a(evh $$0, evh $$1) {
      evh $$2 = $$0.b($$1);
      List<bsp> $$3 = this.dP().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bsp $$4 : $$3) {
            if ($$4 instanceof btk) {
               this.g((btk)$$4);
               this.bC = 0;
               this.h(this.ds().a(-0.2));
               break;
            }
         }
      } else if (this.Q) {
         this.bC = 0;
      }

      if (!this.dP().B && this.bC <= 0) {
         this.c(4, false);
      }
   }

   protected void D(bsp $$0) {
      $$0.h(this);
   }

   protected void g(btk $$0) {
   }

   public boolean fr() {
      return (this.ao.a(aF) & 4) != 0;
   }

   @Override
   public void ac() {
      bsp $$0 = this.dc();
      super.ac();
      if ($$0 != null && $$0 != this.dc() && !this.dP().B) {
         this.b($$0);
      }
   }

   @Override
   public void t() {
      super.t();
      this.bg = this.bh;
      this.bh = 0.0F;
      this.n();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.bs = $$0;
      this.bt = $$1;
      this.bu = $$2;
      this.bv = (double)$$3;
      this.bw = (double)$$4;
      this.br = $$5;
   }

   @Override
   public double c_() {
      return this.br > 0 ? this.bs : this.du();
   }

   @Override
   public double d_() {
      return this.br > 0 ? this.bt : this.dw();
   }

   @Override
   public double L_() {
      return this.br > 0 ? this.bu : this.dA();
   }

   @Override
   public float M_() {
      return this.br > 0 ? (float)this.bw : this.dH();
   }

   @Override
   public float e_() {
      return this.br > 0 ? (float)this.bv : this.dF();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bx = (double)$$0;
      this.by = $$1;
   }

   public void s(boolean $$0) {
      this.bn = $$0;
   }

   public void a(cjc $$0) {
      bsp $$1 = $$0.s();
      if ($$1 instanceof arc) {
         am.R.a((arc)$$1, $$0.p(), this);
      }
   }

   public void a(bsp $$0, int $$1) {
      if (!$$0.dK() && !this.dP().B && ($$0 instanceof cjc || $$0 instanceof cmy || $$0 instanceof bta)) {
         ((arb)this.dP()).l().b($$0, new agf($$0.al(), this.al(), $$1));
      }
   }

   public boolean E(bsp $$0) {
      if ($$0.dP() != this.dP()) {
         return false;
      } else {
         evm $$1 = new evm(this.du(), this.dy(), this.dA());
         evm $$2 = new evm($$0.du(), $$0.dy(), $$0.dA());
         return $$2.f($$1) > 128.0 ? false : this.dP().a(new dbc($$1, $$2, dbc.a.a, dbc.b.a, this)).c() == evk.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.ba : ayu.i($$0, this.bb, this.ba);
   }

   public float z(float $$0) {
      float $$1 = this.aS - this.aR;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aR + $$1 * $$0;
   }

   @Override
   public boolean bz() {
      return !this.dK();
   }

   @Override
   public boolean bA() {
      return this.bD() && !this.N_() && !this.q_();
   }

   @Override
   public float cs() {
      return this.ba;
   }

   @Override
   public void n(float $$0) {
      this.ba = $$0;
   }

   @Override
   public void o(float $$0) {
      this.aY = $$0;
   }

   @Override
   protected evm a(je.a $$0, l.a $$1) {
      return j(super.a($$0, $$1));
   }

   public static evm j(evm $$0) {
      return new evm($$0.c, $$0.d, 0.0);
   }

   public float fs() {
      return this.cg;
   }

   public final void A(float $$0) {
      this.B(ayu.a($$0, 0.0F, this.eS()));
   }

   protected void B(float $$0) {
      this.cg = $$0;
   }

   public void f_() {
   }

   public void g_() {
   }

   protected void ft() {
      this.bZ = true;
   }

   public abstract bte fu();

   public boolean fv() {
      return (this.ao.a(aF) & 1) > 0;
   }

   public bqo fw() {
      return (this.ao.a(aF) & 2) > 0 ? bqo.b : bqo.a;
   }

   private void H() {
      if (this.fv()) {
         if (cuk.b(this.b(this.fw()), this.bz)) {
            this.bz = this.b(this.fw());
            this.a(this.bz);
         } else {
            this.fB();
         }
      }
   }

   protected void a(cuk $$0) {
      $$0.b(this.dP(), this, this.fy());
      if (this.I()) {
         this.b($$0, 5);
      }

      if (--this.bA == 0 && !this.dP().B && !$$0.w()) {
         this.x();
      }
   }

   private boolean I() {
      int $$0 = this.bz.u() - this.fy();
      int $$1 = (int)((float)this.bz.u() * 0.21875F);
      boolean $$2 = $$0 > $$1;
      return $$2 && this.fy() % 4 == 0;
   }

   private void K() {
      this.cm = this.cl;
      if (this.cd()) {
         this.cl = Math.min(1.0F, this.cl + 0.09F);
      } else {
         this.cl = Math.max(0.0F, this.cl - 0.09F);
      }
   }

   protected void c(int $$0, boolean $$1) {
      int $$2 = this.ao.a(aF);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.ao.a(aF, (byte)$$2);
   }

   public void c(bqo $$0) {
      cuk $$1 = this.b($$0);
      if (!$$1.e() && !this.fv()) {
         this.bz = $$1;
         this.bA = $$1.u();
         if (!this.dP().B) {
            this.c(1, true);
            this.c(2, $$0 == bqo.b);
            this.a(dwq.D);
         }
      }
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (bP.equals($$0)) {
         if (this.dP().B) {
            this.fJ().ifPresent(this::a);
         }
      } else if (aF.equals($$0) && this.dP().B) {
         if (this.fv() && this.bz.e()) {
            this.bz = this.b(this.fw());
            if (!this.bz.e()) {
               this.bA = this.bz.u();
            }
         } else if (!this.fv() && !this.bz.e()) {
            this.bz = cuk.l;
            this.bA = 0;
         }
      }
   }

   @Override
   public void a(fb.a $$0, evm $$1) {
      super.a($$0, $$1);
      this.bb = this.ba;
      this.aY = this.ba;
      this.aZ = this.aY;
   }

   protected void b(cuk $$0, int $$1) {
      if (!$$0.e() && this.fv()) {
         if ($$0.v() == cwf.c) {
            this.a(this.c($$0), 0.5F, this.dP().z.i() * 0.1F + 0.9F);
         }

         if ($$0.v() == cwf.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ah.a(2), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(cuk $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         evm $$3 = new evm(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dH() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dF() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ah.i()) * 0.6 - 0.3;
         evm $$5 = new evm(((double)this.ah.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dH() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dF() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.du(), this.dy(), this.dA());
         this.dP().a(new lf(lj.S, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void x() {
      if (!this.dP().B || this.fv()) {
         bqo $$0 = this.fw();
         if (!this.bz.equals(this.b($$0))) {
            this.fA();
         } else {
            if (!this.bz.e() && this.fv()) {
               this.b(this.bz, 16);
               cuk $$1 = this.bz.a(this.dP(), this);
               if ($$1 != this.bz) {
                  this.a($$0, $$1);
               }

               this.fB();
            }
         }
      }
   }

   public cuk fx() {
      return this.bz;
   }

   public int fy() {
      return this.bA;
   }

   public int fz() {
      return this.fv() ? this.bz.u() - this.fy() : 0;
   }

   public void fA() {
      if (!this.bz.e()) {
         this.bz.a(this.dP(), this, this.fy());
         if (this.bz.w()) {
            this.H();
         }
      }

      this.fB();
   }

   public void fB() {
      if (!this.dP().B) {
         boolean $$0 = this.fv();
         this.c(1, false);
         if ($$0) {
            this.a(dwq.C);
         }
      }

      this.bz = cuk.l;
      this.bA = 0;
   }

   public boolean fC() {
      if (this.fv() && !this.bz.e()) {
         cuf $$0 = this.bz.g();
         return $$0.c(this.bz) != cwf.d ? false : $$0.b(this.bz) - this.bA >= 5;
      } else {
         return false;
      }
   }

   public boolean fD() {
      return this.bV();
   }

   public boolean fE() {
      return this.j(7);
   }

   @Override
   public boolean cd() {
      return super.cd() || !this.fE() && this.c(btw.b);
   }

   public int fF() {
      return this.bB;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.du();
      double $$5 = this.dw();
      double $$6 = this.dA();
      double $$7 = $$1;
      boolean $$8 = false;
      iz $$9 = iz.a($$0, $$1, $$2);
      dbt $$10 = this.dP();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.I_()) {
            iz $$12 = $$9.d();
            drx $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.c($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cK())) {
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

         if (this instanceof btt $$14) {
            $$14.K().n();
         }

         return true;
      }
   }

   public boolean fG() {
      return !this.eB();
   }

   public boolean fH() {
      return true;
   }

   public void a(iz $$0, boolean $$1) {
   }

   public boolean f(cuk $$0) {
      return false;
   }

   @Override
   public final bss a(btw $$0) {
      return $$0 == btw.c ? aG : this.e($$0).a(this.ee());
   }

   protected bss e(btw $$0) {
      return this.ak().n().a(this.ed());
   }

   public ImmutableList<btw> fI() {
      return ImmutableList.of(btw.a);
   }

   public evh f(btw $$0) {
      bss $$1 = this.a($$0);
      return new evh((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(btw $$0) {
      evh $$1 = this.a($$0).a(this.dn());
      return this.dP().b(this, $$1);
   }

   @Override
   public boolean cw() {
      return super.cw() && !this.fL();
   }

   public Optional<iz> fJ() {
      return this.ao.a(bP);
   }

   public void h(iz $$0) {
      this.ao.a(bP, Optional.of($$0));
   }

   public void fK() {
      this.ao.a(bP, Optional.empty());
   }

   public boolean fL() {
      return this.fJ().isPresent();
   }

   public void b(iz $$0) {
      if (this.bR()) {
         this.ac();
      }

      drx $$1 = this.dP().a_($$0);
      if ($$1.b() instanceof den) {
         this.dP().a($$0, $$1.a(den.c, Boolean.valueOf(true)), 3);
      }

      this.b(btw.c);
      this.a($$0);
      this.h($$0);
      this.h(evm.b);
      this.av = true;
   }

   private void a(iz $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean M() {
      return this.fJ().map($$0 -> this.dP().a_($$0).b() instanceof den).orElse(false);
   }

   public void fM() {
      this.fJ().filter(this.dP()::B).ifPresent($$0x -> {
         drx $$1 = this.dP().a_($$0x);
         if ($$1.b() instanceof den) {
            je $$2 = $$1.c(den.aE);
            this.dP().a($$0x, $$1.a(den.c, Boolean.valueOf(false)), 3);
            evm $$3 = den.a(this.ak(), this.dP(), $$0x, $$2, this.dF()).orElseGet(() -> {
               iz $$1x = $$0x.c();
               return new evm((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            evm $$4 = evm.c($$0x).d($$3).d();
            float $$5 = (float)ayu.d(ayu.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      evm $$0 = this.dn();
      this.b(btw.a);
      this.a_($$0.c, $$0.d, $$0.e);
      this.fK();
   }

   @Nullable
   public je fN() {
      iz $$0 = this.fJ().orElse(null);
      return $$0 != null ? den.a(this.dP(), $$0) : null;
   }

   @Override
   public boolean bE() {
      return !this.fL() && super.bE();
   }

   public cuk g(cuk $$0) {
      return cuk.l;
   }

   public cuk a(dbt $$0, cuk $$1) {
      cpm $$2 = $$1.a(km.u);
      if ($$2 != null) {
         $$0.a(null, this.du(), this.dw(), this.dA(), this.d($$1), avx.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$2);
         $$1.a(1, this);
         this.a(dwq.m);
      }

      return $$1;
   }

   private void a(cpm $$0) {
      if (!this.dP().x_()) {
         for (cpm.b $$2 : $$0.f()) {
            if (this.ah.i() < $$2.b()) {
               this.b($$2.a());
            }
         }
      }
   }

   private static byte h(bsw $$0) {
      return switch ($$0) {
         case a -> 47;
         case b -> 48;
         case f -> 49;
         case e -> 50;
         case c -> 52;
         case d -> 51;
         case g -> 65;
      };
   }

   public void e(bsw $$0) {
      this.dP().a(this, h($$0));
   }

   public static bsw d(bqo $$0) {
      return $$0 == bqo.a ? bsw.a : bsw.b;
   }

   @Override
   public evh h_() {
      if (this.a(bsw.f).a(cun.uq)) {
         float $$0 = 0.5F;
         return this.cK().c(0.5, 0.5, 0.5);
      } else {
         return super.h_();
      }
   }

   public static bsw h(cuk $$0) {
      ctm $$1 = ctm.c_($$0);
      return $$1 != null ? $$1.m() : bsw.a;
   }

   private static buc a(btk $$0, bsw $$1) {
      return $$1 != bsw.f && $$1 != bsw.a && $$1 != bsw.b ? buc.a($$0, $$1, $$1x -> $$1x.e() || btm.h($$1x) == $$1) : buc.a($$0, $$1);
   }

   @Nullable
   private static bsw s(int $$0) {
      if ($$0 == 100 + bsw.f.b()) {
         return bsw.f;
      } else if ($$0 == 100 + bsw.e.b()) {
         return bsw.e;
      } else if ($$0 == 100 + bsw.d.b()) {
         return bsw.d;
      } else if ($$0 == 100 + bsw.c.b()) {
         return bsw.c;
      } else if ($$0 == 98) {
         return bsw.a;
      } else if ($$0 == 99) {
         return bsw.b;
      } else {
         return $$0 == 105 ? bsw.g : null;
      }
   }

   @Override
   public buc a_(int $$0) {
      bsw $$1 = s($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dD() {
      if (this.N_()) {
         return false;
      } else {
         boolean $$0 = !this.a(bsw.f).a(awu.ba) && !this.a(bsw.e).a(awu.ba) && !this.a(bsw.d).a(awu.ba) && !this.a(bsw.c).a(awu.ba);
         return $$0 && super.dD();
      }
   }

   @Override
   public boolean cg() {
      return !this.dP().x_() && this.b(brz.x) || super.cg();
   }

   @Override
   public float dG() {
      return this.aY;
   }

   @Override
   public void a(acf $$0) {
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      float $$4 = $$0.n();
      float $$5 = $$0.m();
      this.f($$1, $$2, $$3);
      this.aY = $$0.o();
      this.ba = $$0.o();
      this.aZ = this.aY;
      this.bb = this.ba;
      this.e($$0.b());
      this.a_($$0.e());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.o($$0.j(), $$0.k(), $$0.l());
   }

   public boolean fO() {
      return this.eX().g() instanceof cse;
   }

   @Override
   public float dJ() {
      float $$0 = (float)this.g(bus.v);
      return this.cQ() instanceof cms ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public evm m(bsp $$0) {
      return this.dn().e(this.a($$0, this.a(this.ar()), this.ee() * this.ed()));
   }

   protected void a(int $$0, double $$1) {
      this.ba = (float)ayu.e(1.0 / (double)$$0, (double)this.ba, $$1);
   }

   @Override
   public void h(int $$0) {
      super.h(dae.a(this, $$0));
   }

   public boolean fP() {
      return false;
   }

   public static record a(avv a, avv b) {
   }
}
