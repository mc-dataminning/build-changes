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

public abstract class bso extends bru implements brr {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final btu bG = new btu(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, btu.a.c);
   public static final int i = 2;
   public static final int j = 4;
   public static final int k = 98;
   public static final int l = 100;
   public static final int m = 105;
   public static final int n = 6;
   public static final int o = 100;
   private static final int bH = 40;
   public static final double p = 0.003;
   public static final double q = 0.08;
   public static final int r = 20;
   private static final int bI = 10;
   private static final int bJ = 2;
   public static final int s = 4;
   public static final float t = 0.42F;
   private static final double bK = 128.0;
   protected static final int u = 1;
   protected static final int v = 2;
   protected static final int aF = 4;
   protected static final ajr<Byte> aG = ajv.a(bso.class, ajt.a);
   private static final ajr<Float> bL = ajv.a(bso.class, ajt.d);
   private static final ajr<List<kw>> bM = ajv.a(bso.class, ajt.m);
   private static final ajr<Boolean> bN = ajv.a(bso.class, ajt.k);
   private static final ajr<Integer> bO = ajv.a(bso.class, ajt.b);
   private static final ajr<Integer> bP = ajv.a(bso.class, ajt.b);
   private static final ajr<Optional<io>> bQ = ajv.a(bso.class, ajt.p);
   private static final int bR = 15;
   protected static final brx aH = brx.c(0.2F, 0.2F).b(0.2F);
   public static final float aI = 0.5F;
   public static final float aJ = 0.5F;
   private static final float bS = 0.21875F;
   private final btt bT;
   private final bqk bU = new bqk(this);
   private final Map<ix<bra>, brc> bV = Maps.newHashMap();
   private final jg<cto> bW = jg.a(2, cto.i);
   private final jg<cto> bX = jg.a(4, cto.i);
   private cto bY = cto.i;
   public boolean aK;
   private boolean bZ = false;
   public bpt aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public int aQ;
   public int aR;
   public float aS;
   public float aT;
   protected int aU;
   public final btp aV = new btp();
   public final int aW = 20;
   public final float aX;
   public final float aY;
   public float aZ;
   public float ba;
   public float bb;
   public float bc;
   @Nullable
   protected clw bd;
   protected int be;
   protected boolean bf;
   protected int bg;
   protected float bh;
   protected float bi;
   protected float bj;
   protected float bk;
   protected float bl;
   protected int bm;
   protected float bn;
   protected boolean bo;
   public float bp;
   public float bq;
   public float br;
   protected int bs;
   protected double bt;
   protected double bu;
   protected double bv;
   protected double bw;
   protected double bx;
   protected double by;
   protected int bz;
   private boolean ca = true;
   @Nullable
   private bso cb;
   private int cc;
   private bso cd;
   private int ce;
   private float cf;
   private int cg;
   private float ch;
   protected cto bA = cto.i;
   protected int bB;
   protected int bC;
   private io ci;
   private Optional<io> cj = Optional.empty();
   @Nullable
   private bqn ck;
   private long cl;
   protected int bD;
   private float cm;
   private float cn;
   protected btq<?> bE;
   private boolean co;
   protected float bF = 1.0F;

   protected bso(bsa<? extends bso> $$0, dax $$1) {
      super($$0, $$1);
      this.bT = new btt(btx.a($$0));
      this.t(this.eR());
      this.J = true;
      this.aY = (float)((Math.random() + 1.0) * 0.01F);
      this.at();
      this.aX = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.bb = this.dF();
      ur $$2 = ur.a;
      this.bE = this.a(new Dynamic($$2, (va)$$2.createMap(ImmutableMap.of($$2.a("memories"), (va)$$2.emptyMap()))));
   }

   public btq<?> dS() {
      return this.bE;
   }

   protected btq.b<?> dT() {
      return btq.a(ImmutableList.of(), ImmutableList.of());
   }

   protected btq<?> a(Dynamic<?> $$0) {
      return this.dT().a($$0);
   }

   @Override
   public void an() {
      this.a(this.dQ().w(), Float.MAX_VALUE);
   }

   public boolean a(bsa<?> $$0) {
      return true;
   }

   @Override
   protected void a(ajv.a $$0) {
      $$0.a(aG, (byte)0);
      $$0.a(bM, List.of());
      $$0.a(bN, false);
      $$0.a(bO, 0);
      $$0.a(bP, 0);
      $$0.a(bL, 1.0F);
      $$0.a(bQ, Optional.empty());
   }

   public static btv.a dU() {
      return btv.a().a(btw.q).a(btw.n).a(btw.r).a(btw.a).a(btw.b).a(btw.p).a(btw.v).a(btw.t).a(btw.l).a(btw.s).a(btw.i).a(btw.m);
   }

   @Override
   protected void a(double $$0, boolean $$1, drb $$2, io $$3) {
      if (!this.be()) {
         this.bm();
      }

      if (!this.dP().B && $$1 && this.ac > 0.0F) {
         this.dZ();
         this.ea();
         double $$4 = this.g(btw.s);
         if ((double)this.ac > $$4 && !$$2.i()) {
            double $$5 = this.du();
            double $$6 = this.dw();
            double $$7 = this.dA();
            io $$8 = this.dp();
            if ($$3.u() != $$8.u() || $$3.w() != $$8.w()) {
               double $$9 = $$5 - (double)$$3.u() - 0.5;
               double $$10 = $$7 - (double)$$3.w() - 0.5;
               double $$11 = Math.max(Math.abs($$9), Math.abs($$10));
               $$5 = (double)$$3.u() + 0.5 + $$9 / $$11 * 0.5;
               $$7 = (double)$$3.w() + 0.5 + $$10 / $$11 * 0.5;
            }

            float $$12 = (float)ayd.c((double)this.ac - $$4);
            double $$13 = Math.min((double)(0.2F + $$12 / 15.0F), 2.5);
            int $$14 = (int)(150.0 * $$13);
            ((aqm)this.dP()).a(new kp(ky.b, $$2), $$5, $$6, $$7, $$14, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cj = Optional.empty();
      }
   }

   public final boolean dV() {
      return this.ak().a(avz.m);
   }

   public float a(float $$0) {
      return ayd.i($$0, this.cn, this.cm);
   }

   @Override
   public void au() {
      this.aS = this.aT;
      if (this.an) {
         this.fJ().ifPresent(this::a);
      }

      if (this.dW()) {
         this.dX();
      }

      super.au();
      this.dP().af().a("livingEntityBaseTick");
      if (this.bd() || this.dP().B) {
         this.aC();
      }

      if (this.bD()) {
         boolean $$0 = this instanceof clw;
         if (!this.dP().B) {
            if (this.bE()) {
               this.a(this.dQ().f(), 1.0F);
            } else if ($$0 && !this.dP().C_().a(this.cK())) {
               double $$1 = this.dP().C_().a(this) + this.dP().C_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dP().C_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dQ().v(), (float)Math.max(1, ayd.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(awb.a) && !this.dP().a_(io.a(this.du(), this.dy(), this.dA())).a(dea.nd)) {
            boolean $$3 = !this.dV() && !brd.c(this) && (!$$0 || !((clw)this).gd().a);
            if ($$3) {
               this.k(this.n(this.cl()));
               if (this.cl() == -20) {
                  this.k(0);
                  euk $$4 = this.ds();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.ah.j() - this.ah.j();
                     double $$7 = this.ah.j() - this.ah.j();
                     double $$8 = this.ah.j() - this.ah.j();
                     this.dP().a(ky.d, this.du() + $$6, this.dw() + $$7, this.dA() + $$8, $$4.c, $$4.d, $$4.e);
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
            io $$9 = this.dp();
            if (!Objects.equal(this.ci, $$9)) {
               this.ci = $$9;
               this.c($$9);
            }
         }
      }

      if (this.bD() && (this.bg() || this.aB)) {
         this.aH();
      }

      if (this.aP > 0) {
         this.aP--;
      }

      if (this.am > 0 && !(this instanceof aqn)) {
         this.am--;
      }

      if (this.eB() && this.dP().h(this)) {
         this.eg();
      }

      if (this.be > 0) {
         this.be--;
      } else {
         this.bd = null;
      }

      if (this.cd != null && !this.cd.bD()) {
         this.cd = null;
      }

      if (this.cb != null) {
         if (!this.cb.bD()) {
            this.a(null);
         } else if (this.ai - this.cc > 100) {
            this.a(null);
         }
      }

      this.es();
      this.bk = this.bj;
      this.ba = this.aZ;
      this.bc = this.bb;
      this.O = this.dF();
      this.P = this.dH();
      this.dP().af().c();
   }

   public boolean dW() {
      return this.ai % 5 == 0 && this.ds().c != 0.0 && this.ds().e != 0.0 && !this.N_() && cza.k(this) && this.dY();
   }

   protected void dX() {
      euk $$0 = this.ds();
      this.dP()
         .a(
            ky.M,
            this.du() + (this.ah.j() - 0.5) * (double)this.dj(),
            this.dw() + 0.1,
            this.dA() + (this.ah.j() - 0.5) * (double)this.dj(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.ah.i() * 0.4F + this.ah.i() > 0.9F ? 0.6F : 0.0F;
      this.a(avh.xN, $$1, 0.6F + this.ah.i() * 0.4F);
   }

   protected boolean dY() {
      return this.dP().a_(this.aK()).a(avw.aN);
   }

   @Override
   protected float aN() {
      return this.dY() && cza.a(czc.l, this) > 0 ? 1.0F : super.aN();
   }

   @Override
   protected boolean c(drb $$0) {
      return !$$0.i() || this.fE();
   }

   protected void dZ() {
      bts $$0 = this.f(btw.r);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void ea() {
      if (!this.bo().i()) {
         int $$0 = cza.a(czc.l, this);
         if ($$0 > 0 && this.dY()) {
            bts $$1 = this.f(btw.r);
            if ($$1 == null) {
               return;
            }

            $$1.c(new btu(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), btu.a.a));
            if (this.el().i() < 0.04F) {
               cto $$2 = this.a(bsb.c);
               $$2.a(1, this, bsb.c);
            }
         }
      }
   }

   protected void eb() {
      bts $$0 = this.f(btw.r);
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
            bts $$1 = this.f(btw.r);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cn();
            $$1.c(new btu(e, "Powder snow slow", (double)$$2, btu.a.a));
         }
      }
   }

   protected void c(io $$0) {
      int $$1 = cza.a(czc.j, this);
      if ($$1 > 0) {
         czd.a(this, this.dP(), $$0, $$1);
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
      btt $$0 = this.eW();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(btw.t));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean ef() {
      return true;
   }

   protected void eg() {
      this.aR++;
      if (this.aR >= 20 && !this.dP().x_() && !this.dK()) {
         this.dP().a(this, (byte)60);
         this.a(bru.c.a);
      }
   }

   public boolean eh() {
      return !this.p_();
   }

   protected boolean ei() {
      return !this.p_();
   }

   protected int n(int $$0) {
      int $$1 = cza.e(this);
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

   public ayk el() {
      return this.ah;
   }

   @Nullable
   public bso em() {
      return this.cb;
   }

   @Override
   public bso T_() {
      return this.em();
   }

   public int en() {
      return this.cc;
   }

   public void c(@Nullable clw $$0) {
      this.bd = $$0;
      this.be = this.ai;
   }

   public void a(@Nullable bso $$0) {
      this.cb = $$0;
      this.cc = this.ai;
   }

   @Nullable
   public bso eo() {
      return this.cd;
   }

   public int ep() {
      return this.ce;
   }

   public void A(bru $$0) {
      if ($$0 instanceof bso) {
         this.cd = (bso)$$0;
      } else {
         this.cd = null;
      }

      this.ce = this.ai;
   }

   public int eq() {
      return this.bg;
   }

   public void p(int $$0) {
      this.bg = $$0;
   }

   public boolean er() {
      return this.bZ;
   }

   public void q(boolean $$0) {
      this.bZ = $$0;
   }

   protected boolean b(bsb $$0) {
      return true;
   }

   public void a(bsb $$0, cto $$1, cto $$2) {
      boolean $$3 = $$2.e() && $$1.e();
      if (!$$3 && !cto.c($$1, $$2) && !this.an) {
         csq $$4 = csq.c_($$2);
         if (!this.dP().x_() && !this.N_()) {
            if (!this.aW() && $$4 != null && $$4.l() == $$0) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), $$4.ap_(), this.de(), 1.0F, 1.0F, this.ah.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? dvu.v : dvu.S);
            }
         }
      }
   }

   @Override
   public void a(bru.c $$0) {
      if ($$0 == bru.c.a || $$0 == bru.c.b) {
         for (brc $$1 : this.ex()) {
            $$1.a(this, $$0);
         }
      }

      super.a($$0);
      this.bE.a();
   }

   @Override
   public void b(ud $$0) {
      $$0.a("Health", this.eA());
      $$0.a("HurtTime", (short)this.aP);
      $$0.a("HurtByTimestamp", this.cc);
      $$0.a("DeathTime", (short)this.aR);
      $$0.a("AbsorptionAmount", this.fs());
      $$0.a("Attributes", this.eW().c());
      if (!this.bV.isEmpty()) {
         uj $$1 = new uj();

         for (brc $$2 : this.bV.values()) {
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
      DataResult<va> $$3 = this.bE.a(ur.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(ud $$0) {
      this.B($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dP() != null && !this.dP().B) {
         this.eW().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         uj $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ud $$3 = $$1.a($$2);
            brc $$4 = brc.a($$3);
            if ($$4 != null) {
               this.bV.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.t($$0.j("Health"));
      }

      this.aP = $$0.g("HurtTime");
      this.aR = $$0.g("DeathTime");
      this.cc = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         evo $$6 = this.dP().L();
         evj $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cA(), $$7);
         if (!$$8) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         io $$9 = new io($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.h($$9);
         this.ao.a(at, bta.c);
         if (!this.an) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bE = this.a(new Dynamic(ur.a, $$0.c("Brain")));
      }
   }

   protected void es() {
      Iterator<ix<bra>> $$0 = this.bV.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            ix<bra> $$1 = $$0.next();
            brc $$2 = this.bV.get($$1);
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

      if (this.ca) {
         if (!this.dP().B) {
            this.J();
            this.v();
         }

         this.ca = false;
      }

      List<kw> $$3 = this.ao.a(bM);
      if (!$$3.isEmpty()) {
         boolean $$4 = this.ao.a(bN);
         int $$5 = this.ch() ? 15 : 4;
         int $$6 = $$4 ? 5 : 1;
         if (this.ah.a($$5 * $$6) == 0) {
            this.dP().a(ac.a($$3, this.ah), this.d(0.5), this.dx(), this.g(0.5), 1.0, 1.0, 1.0);
         }
      }
   }

   protected void J() {
      if (this.bV.isEmpty()) {
         this.ev();
         this.k(false);
      } else {
         this.k(this.b(bre.n));
         this.s();
      }
   }

   private void s() {
      List<kw> $$0 = this.bV.values().stream().filter(brc::g).map(brc::a).toList();
      this.ao.a(bM, $$0);
      this.ao.a(bN, c(this.bV.values()));
   }

   private void v() {
      boolean $$0 = this.cg();
      if (this.j(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable bru $$0) {
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
         cto $$3 = this.a(bsb.f);
         bsa<?> $$4 = $$0.ak();
         if ($$4 == bsa.aN && $$3.a(ctr.ul)
            || $$4 == bsa.bu && $$3.a(ctr.uo)
            || $$4 == bsa.aA && $$3.a(ctr.ur)
            || $$4 == bsa.aB && $$3.a(ctr.ur)
            || $$4 == bsa.x && $$3.a(ctr.up)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bso $$0) {
      return $$0 instanceof clw && this.dP().ak() == bpr.a ? false : $$0.et();
   }

   public boolean a(bso $$0, cdf $$1) {
      return $$1.a(this, $$0);
   }

   public boolean et() {
      return !this.cu() && this.eu();
   }

   public boolean eu() {
      return !this.N_() && this.bD();
   }

   public static boolean c(Collection<brc> $$0) {
      for (brc $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void ev() {
      this.ao.a(bM, List.of());
   }

   public boolean ew() {
      if (this.dP().B) {
         return false;
      } else {
         Iterator<brc> $$0 = this.bV.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<brc> ex() {
      return this.bV.values();
   }

   public Map<ix<bra>, brc> ey() {
      return this.bV;
   }

   public boolean b(ix<bra> $$0) {
      return this.bV.containsKey($$0);
   }

   @Nullable
   public brc c(ix<bra> $$0) {
      return this.bV.get($$0);
   }

   public final boolean b(brc $$0) {
      return this.b($$0, null);
   }

   public boolean b(brc $$0, @Nullable bru $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         brc $$2 = this.bV.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bV.put($$0.c(), $$0);
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

   public boolean c(brc $$0) {
      if (this.ak().a(avz.G)) {
         return !$$0.a(bre.M);
      } else if (this.ak().a(avz.F)) {
         return !$$0.a(bre.L);
      } else {
         return !this.ak().a(avz.w) ? true : !$$0.a(bre.j) && !$$0.a(bre.s);
      }
   }

   public void c(brc $$0, @Nullable bru $$1) {
      if (this.c($$0)) {
         brc $$2 = this.bV.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean ez() {
      return this.ak().a(avz.x);
   }

   @Nullable
   public brc d(ix<bra> $$0) {
      return this.bV.remove($$0);
   }

   public boolean e(ix<bra> $$0) {
      brc $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(brc $$0, @Nullable bru $$1) {
      this.ca = true;
      if (!this.dP().B) {
         $$0.c().a().a(this.eW(), $$0.e());
         this.d($$0);
      }
   }

   public void d(brc $$0) {
      for (bru $$1 : this.cS()) {
         if ($$1 instanceof aqn $$2) {
            $$2.d.b(new afw(this.al(), $$0, false));
         }
      }
   }

   protected void a(brc $$0, boolean $$1, @Nullable bru $$2) {
      this.ca = true;
      if ($$1 && !this.dP().B) {
         bra $$3 = $$0.c().a();
         $$3.a(this.eW());
         $$3.a(this.eW(), $$0.e());
         this.z();
      }

      if (!this.dP().B) {
         this.d($$0);
      }
   }

   protected void a(brc $$0) {
      this.ca = true;
      if (!this.dP().B) {
         $$0.c().a().a(this.eW());
         this.z();

         for (bru $$1 : this.cS()) {
            if ($$1 instanceof aqn $$2) {
               $$2.d.b(new aeb(this.al(), $$0.c()));
            }
         }
      }
   }

   private void z() {
      for (bts $$0 : this.eW().a()) {
         this.i($$0.a());
      }
   }

   private void i(ix<btr> $$0) {
      if ($$0.a(btw.q)) {
         float $$1 = this.eR();
         if (this.eA() > $$1) {
            this.t($$1);
         }
      } else if ($$0.a(btw.p)) {
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
      return this.ao.a(bL);
   }

   public void t(float $$0) {
      this.ao.a(bL, ayd.a($$0, 0.0F, this.eR()));
   }

   public boolean eB() {
      return this.eA() <= 0.0F;
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dP().B) {
         return false;
      } else if (this.eB()) {
         return false;
      } else if ($$0.a(avy.j) && this.b(bre.l)) {
         return false;
      } else {
         if (this.fL() && !this.dP().B) {
            this.fM();
         }

         this.bg = 0;
         float $$2 = $$1;
         boolean $$3 = false;
         float $$4 = 0.0F;
         if ($$1 > 0.0F && this.f($$0)) {
            this.v($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.a(avy.k) && $$0.c() instanceof bso $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(avy.p) && this.ak().a(avz.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(avy.a) && !this.a(bsb.f).e()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.aV.a(1.5F);
         boolean $$7 = true;
         if ((float)this.am > 10.0F && !$$0.a(avy.f)) {
            if ($$1 <= this.bn) {
               return false;
            }

            this.f($$0, $$1 - this.bn);
            this.bn = $$1;
            $$7 = false;
         } else {
            this.bn = $$1;
            this.am = 20;
            this.f($$0, $$1);
            this.aQ = 10;
            this.aP = this.aQ;
         }

         bru $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof bso $$9 && !$$0.a(avy.r) && (!$$0.a(bqq.G) || !this.ak().a(avz.E))) {
               this.a($$9);
            }

            if ($$8 instanceof clw $$10) {
               this.be = 100;
               this.bd = $$10;
            } else if ($$8 instanceof cfh $$11 && $$11.s()) {
               this.be = 100;
               if ($$11.P_() instanceof clw $$12) {
                  this.bd = $$12;
               } else {
                  this.bd = null;
               }
            }
         }

         if ($$7) {
            if ($$3) {
               this.dP().a(this, (byte)29);
            } else {
               this.dP().a(this, $$0);
            }

            if (!$$0.a(avy.s) && (!$$3 || $$1 > 0.0F)) {
               this.bv();
            }

            if ($$8 != null && !$$0.a(avy.A)) {
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
            this.ck = $$0;
            this.cl = this.dP().Y();
         }

         if (this instanceof aqn) {
            am.i.a((aqn)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((aqn)this).a(avr.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof aqn) {
            am.h.a((aqn)$$8, this, $$0, $$2, $$1, $$3);
         }

         for (brc $$16 : this.ex()) {
            $$16.a(this, $$0, $$1);
         }

         return $$15;
      }
   }

   protected void d(bso $$0) {
      $$0.e(this);
   }

   protected void e(bso $$0) {
      $$0.q(0.5, $$0.du() - this.du(), $$0.dA() - this.dA());
   }

   private boolean h(bqn $$0) {
      if ($$0.a(avy.e)) {
         return false;
      } else {
         cto $$1 = null;

         for (bpt $$2 : bpt.values()) {
            cto $$3 = this.b($$2);
            if ($$3.a(ctr.vt)) {
               $$1 = $$3.s();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof aqn $$4) {
               $$4.b(avr.c.b(ctr.vt));
               am.C.a($$4, $$1);
               this.a(dvu.C);
            }

            this.t(1.0F);
            this.ew();
            this.b(new brc(bre.j, 900, 1));
            this.b(new brc(bre.v, 100, 1));
            this.b(new brc(bre.l, 800, 0));
            this.dP().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bqn eC() {
      if (this.dP().Y() - this.cl > 40L) {
         this.ck = null;
      }

      return this.ck;
   }

   protected void e(bqn $$0) {
      this.b(this.d($$0));
   }

   public void b(@Nullable avg $$0) {
      if ($$0 != null) {
         this.a($$0, this.fe(), this.ff());
      }
   }

   public boolean f(bqn $$0) {
      bru $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cmc $$3 && $$3.D() > 0) {
         $$2 = true;
      }

      if (!$$0.a(avy.d) && this.fC() && !$$2) {
         euk $$4 = $$0.h();
         if ($$4 != null) {
            euk $$5 = this.b(0.0F, this.cs());
            euk $$6 = $$4.a(this.dn());
            $$6 = new euk($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(cto $$0) {
      if (!$$0.e()) {
         if (!this.aW()) {
            this.dP().a(this.du(), this.dw(), this.dA(), $$0.L(), this.de(), 0.8F, 0.8F + this.dP().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bqn $$0) {
      if (!this.dK() && !this.bf) {
         bru $$1 = $$0.d();
         bso $$2 = this.eQ();
         if (this.bm >= 0 && $$2 != null) {
            $$2.a(this, this.bm, $$0);
         }

         if (this.fL()) {
            this.fM();
         }

         if (!this.dP().B && this.ag()) {
            b.info("Named entity {} died: {}", this, this.eP().a().getString());
         }

         this.bf = true;
         this.eP().c();
         if (this.dP() instanceof aqm $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(dvu.p);
               this.g($$0);
               this.f($$2);
            }

            this.dP().a(this, (byte)3);
         }

         this.b(bta.h);
      }
   }

   protected void f(@Nullable bso $$0) {
      if (!this.dP().B) {
         boolean $$1 = false;
         if ($$0 instanceof chu) {
            if (this.dP().aa().b(dat.c)) {
               io $$2 = this.dp();
               drb $$3 = dea.cd.n();
               if (this.dP().a_($$2).i() && $$3.a((dba)this.dP(), $$2)) {
                  this.dP().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               cig $$4 = new cig(this.dP(), this.du(), this.dw(), this.dA(), new cto(ctr.dw));
               this.dP().b($$4);
            }
         }
      }
   }

   protected void g(bqn $$0) {
      bru $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof clw) {
         $$2 = cza.h((bso)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.be > 0;
      if (this.ei() && this.dP().aa().b(dat.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.eD();
      this.eE();
   }

   protected void eD() {
   }

   protected void eE() {
      if (this.dP() instanceof aqm && !this.eI() && (this.ek() || this.be > 0 && this.eh() && this.dP().aa().b(dat.f))) {
         bse.a((aqm)this.dP(), this.dn(), this.ej());
      }
   }

   protected void a(bqn $$0, int $$1, boolean $$2) {
   }

   public akl<epk> eF() {
      return this.ak().k();
   }

   public long eG() {
      return 0L;
   }

   protected void a(bqn $$0, boolean $$1) {
      akl<epk> $$2 = this.eF();
      epk $$3 = this.dP().o().be().b($$2);
      epi.a $$4 = new epi.a((aqm)this.dP()).a(erx.a, this).a(erx.f, this.dn()).a(erx.c, $$0).b(erx.d, $$0.d()).b(erx.e, $$0.c());
      if ($$1 && this.bd != null) {
         $$4 = $$4.a(erx.b, this.bd).a(this.bd.gy());
      }

      epi $$5 = $$4.a(erw.g);
      $$3.a($$5, this.eG(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.g(btw.n);
      if (!($$0 <= 0.0)) {
         this.av = true;
         euk $$3 = this.ds();
         euk $$4 = new euk($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aE() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected avg d(bqn $$0) {
      return avh.kg;
   }

   @Nullable
   protected avg o_() {
      return avh.kb;
   }

   private avg d(int $$0) {
      return $$0 > 4 ? this.eL().b() : this.eL().a();
   }

   public void eH() {
      this.co = true;
   }

   public boolean eI() {
      return this.co;
   }

   public float eJ() {
      return 0.0F;
   }

   protected euf eK() {
      euf $$0 = this.cK();
      bru $$1 = this.dc();
      if ($$1 != null) {
         euk $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public bso.a eL() {
      return new bso.a(avh.kh, avh.jZ);
   }

   protected avg c(cto $$0) {
      return $$0.J();
   }

   public avg d(cto $$0) {
      return $$0.K();
   }

   public Optional<io> eM() {
      return this.cj;
   }

   public boolean q_() {
      if (this.N_()) {
         return false;
      } else {
         io $$0 = this.dp();
         drb $$1 = this.dq();
         if ($$1.a(avw.aP)) {
            this.cj = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dml && this.c($$0, $$1)) {
            this.cj = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(io $$0, drb $$1) {
      if ($$1.c(dml.b)) {
         drb $$2 = this.dP().a_($$0.d());
         if ($$2.a(dea.cO) && $$2.c(die.b) == $$1.c(dml.aE)) {
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
      return ayd.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bqn $$2) {
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
      if (this.ak().a(avz.o)) {
         return 0;
      } else {
         float $$2 = (float)this.g(btw.s);
         float $$3 = $$0 - $$2;
         return ayd.c((double)($$3 * $$1) * this.g(btw.i));
      }
   }

   protected void eN() {
      if (!this.aW()) {
         int $$0 = ayd.a(this.du());
         int $$1 = ayd.a(this.dw() - 0.2F);
         int $$2 = ayd.a(this.dA());
         drb $$3 = this.dP().a_(new io($$0, $$1, $$2));
         if (!$$3.i()) {
            dll $$4 = $$3.w();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void m(float $$0) {
      this.aQ = 10;
      this.aP = this.aQ;
   }

   public int eO() {
      return ayd.a(this.g(btw.a));
   }

   protected void b(bqn $$0, float $$1) {
   }

   protected void c(bqn $$0, float $$1) {
   }

   protected void v(float $$0) {
   }

   protected void a(bqn $$0, float $$1, bsb... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bsb $$4 : $$2) {
            cto $$5 = this.a($$4);
            if ($$5.g() instanceof crd && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float d(bqn $$0, float $$1) {
      if (!$$0.a(avy.c)) {
         this.b($$0, $$1);
         $$1 = bqj.a($$1, $$0, (float)this.eO(), (float)this.g(btw.b));
      }

      return $$1;
   }

   protected float e(bqn $$0, float $$1) {
      if ($$0.a(avy.g)) {
         return $$1;
      } else {
         if (this.b(bre.k) && !$$0.a(avy.h)) {
            int $$2 = (this.c(bre.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof aqn) {
                  ((aqn)this).a(avr.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof aqn) {
                  ((aqn)$$0.d()).a(avr.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(avy.i)) {
            return $$1;
         } else {
            int $$7 = cza.a(this.fb(), $$0);
            if ($$7 > 0) {
               $$1 = bqj.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bqn $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fs(), 0.0F);
         this.A(this.fs() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof aqn $$4) {
            $$4.a(avr.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eP().a($$0, var9);
            this.t(this.eA() - var9);
            this.A(this.fs() - var9);
            this.a(dvu.o);
         }
      }
   }

   public bqk eP() {
      return this.bU;
   }

   @Nullable
   public bso eQ() {
      if (this.bd != null) {
         return this.bd;
      } else {
         return this.cb != null ? this.cb : null;
      }
   }

   public final float eR() {
      return (float)this.g(btw.q);
   }

   public final float eS() {
      return (float)this.g(btw.p);
   }

   public final int eT() {
      return this.ao.a(bO);
   }

   public final void q(int $$0) {
      this.ao.a(bO, $$0);
   }

   public final int eU() {
      return this.ao.a(bP);
   }

   public final void r(int $$0) {
      this.ao.a(bP, $$0);
   }

   private int A() {
      if (brd.a(this)) {
         return 6 - (1 + brd.b(this));
      } else {
         return this.b(bre.d) ? 6 + (1 + this.c(bre.d).e()) * 2 : 6;
      }
   }

   public void a(bpt $$0) {
      this.a($$0, false);
   }

   public void a(bpt $$0, boolean $$1) {
      if (!this.aK || this.aM >= this.A() / 2 || this.aM < 0) {
         this.aM = -1;
         this.aK = true;
         this.aL = $$0;
         if (this.dP() instanceof aqm) {
            abt $$2 = new abt(this, $$0 == bpt.a ? 0 : 3);
            aqk $$3 = ((aqm)this.dP()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bqn $$0) {
      this.aV.a(1.5F);
      this.am = 20;
      this.aQ = 10;
      this.aP = this.aQ;
      avg $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.fe(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
      }

      this.a(this.dQ().n(), 0.0F);
      this.ck = $$0;
      this.cl = this.dP().Y();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            avg $$1 = this.o_();
            if ($$1 != null) {
               this.a($$1, this.fe(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof clw)) {
               this.t(0.0F);
               this.a(this.dQ().n());
            }
            break;
         case 29:
            this.a(avh.wA, 1.0F, 0.8F + this.dP().z.i() * 0.4F);
            break;
         case 30:
            this.a(avh.wB, 0.8F, 0.8F + this.dP().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ah.i() - 0.5F) * 0.2F;
               float $$6 = (this.ah.i() - 0.5F) * 0.2F;
               float $$7 = (this.ah.i() - 0.5F) * 0.2F;
               double $$8 = ayd.d($$4, this.L, this.du()) + (this.ah.j() - 0.5) * (double)this.dj() * 2.0;
               double $$9 = ayd.d($$4, this.M, this.dw()) + this.ah.j() * (double)this.dk();
               double $$10 = ayd.d($$4, this.N, this.dA()) + (this.ah.j() - 0.5) * (double)this.dj() * 2.0;
               this.dP().a(ky.ac, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.a(bsb.a));
            break;
         case 48:
            this.i(this.a(bsb.b));
            break;
         case 49:
            this.i(this.a(bsb.f));
            break;
         case 50:
            this.i(this.a(bsb.e));
            break;
         case 51:
            this.i(this.a(bsb.d));
            break;
         case 52:
            this.i(this.a(bsb.c));
            break;
         case 54:
            dhs.b(this);
            break;
         case 55:
            this.C();
            break;
         case 60:
            this.B();
            break;
         case 65:
            this.i(this.a(bsb.g));
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
         this.dP().a(ky.ab, this.d(1.0), this.dx(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void C() {
      cto $$0 = this.a(bsb.b);
      this.a(bsb.b, this.a(bsb.a));
      this.a(bsb.a, $$0);
   }

   @Override
   protected void aD() {
      this.a(this.dQ().m(), 4.0F);
   }

   protected void eV() {
      int $$0 = this.A();
      if (this.aK) {
         this.aM++;
         if (this.aM >= $$0) {
            this.aM = 0;
            this.aK = false;
         }
      } else {
         this.aM = 0;
      }

      this.aT = (float)this.aM / (float)$$0;
   }

   @Nullable
   public bts f(ix<btr> $$0) {
      return this.eW().a($$0);
   }

   public double g(ix<btr> $$0) {
      return this.eW().c($$0);
   }

   public double h(ix<btr> $$0) {
      return this.eW().d($$0);
   }

   public btt eW() {
      return this.bT;
   }

   public cto eX() {
      return this.a(bsb.a);
   }

   public cto eY() {
      return this.a(bsb.b);
   }

   public boolean b(ctj $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cto> $$0) {
      return $$0.test(this.eX()) || $$0.test(this.eY());
   }

   public cto b(bpt $$0) {
      if ($$0 == bpt.a) {
         return this.a(bsb.a);
      } else if ($$0 == bpt.b) {
         return this.a(bsb.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bpt $$0, cto $$1) {
      if ($$0 == bpt.a) {
         this.a(bsb.a, $$1);
      } else {
         if ($$0 != bpt.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bsb.b, $$1);
      }
   }

   public boolean c(bsb $$0) {
      return !this.a($$0).e();
   }

   public boolean d(bsb $$0) {
      return false;
   }

   public abstract Iterable<cto> eZ();

   public abstract cto a(bsb var1);

   public abstract void a(bsb var1, cto var2);

   public Iterable<cto> fa() {
      return List.of();
   }

   public Iterable<cto> fb() {
      return this.eZ();
   }

   public Iterable<cto> fc() {
      return Iterables.concat(this.fa(), this.fb());
   }

   protected void e(cto $$0) {
      $$0.g().n($$0);
   }

   public float fd() {
      Iterable<cto> $$0 = this.eZ();
      int $$1 = 0;
      int $$2 = 0;

      for (cto $$3 : $$0) {
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
      bts $$1 = this.f(btw.r);
      $$1.b(bG.b());
      if ($$0) {
         $$1.c(bG);
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
   public void h(bru $$0) {
      if (!this.fL()) {
         super.h($$0);
      }
   }

   private void b(bru $$0) {
      euk $$1;
      if (this.dK()) {
         $$1 = this.dn();
      } else if (!$$0.dK() && !this.dP().a_($$0.dp()).a(avw.aJ)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dw(), $$0.dw());
         $$1 = new euk(this.du(), $$2, this.dA());
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
      return (float)this.g(btw.m) * $$0 * this.aM() + this.fi();
   }

   public float fi() {
      return this.b(bre.h) ? 0.1F * ((float)this.c(bre.h).e() + 1.0F) : 0.0F;
   }

   protected void fj() {
      euk $$0 = this.ds();
      this.o($$0.c, (double)this.fh(), $$0.e);
      if (this.cb()) {
         float $$1 = this.dF() * (float) (Math.PI / 180.0);
         this.g(this.ds().b((double)(-ayd.a($$1) * 0.2F), 0.0, (double)(ayd.b($$1) * 0.2F)));
      }

      this.av = true;
   }

   protected void fk() {
      this.g(this.ds().b(0.0, -0.04F, 0.0));
   }

   protected void c(awl<emt> $$0) {
      this.g(this.ds().b(0.0, 0.04F, 0.0));
   }

   protected float fl() {
      return 0.8F;
   }

   public boolean a(emu $$0) {
      return false;
   }

   @Override
   protected double aY() {
      return this.g(btw.l);
   }

   public void a(euk $$0) {
      if (this.da()) {
         double $$1 = this.aZ();
         boolean $$2 = this.ds().d <= 0.0;
         if ($$2 && this.b(bre.B)) {
            $$1 = Math.min($$1, 0.01);
         }

         emu $$3 = this.dP().b_(this.dp());
         if (this.be() && this.ef() && !this.a($$3)) {
            double $$4 = this.dw();
            float $$5 = this.cb() ? 0.9F : this.fl();
            float $$6 = 0.02F;
            float $$7 = (float)cza.f(this);
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

            if (this.b(bre.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(bst.a, this.ds());
            euk $$8 = this.ds();
            if (this.Q && this.q_()) {
               $$8 = new euk($$8.c, 0.2, $$8.e);
            }

            this.g($$8.d((double)$$5, 0.8F, (double)$$5));
            euk $$9 = this.a($$1, $$2, this.ds());
            this.g($$9);
            if (this.Q && this.g($$9.c, $$9.d + 0.6F - this.dw() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bs() && this.ef() && !this.a($$3)) {
            double $$10 = this.dw();
            this.a(0.02F, $$0);
            this.a(bst.a, this.ds());
            if (this.b(awb.b) <= this.di()) {
               this.g(this.ds().d(0.5, 0.8F, 0.5));
               euk $$11 = this.a($$1, $$2, this.ds());
               this.g($$11);
            } else {
               this.g(this.ds().a(0.5));
            }

            if ($$1 != 0.0) {
               this.g(this.ds().b(0.0, -$$1 / 4.0, 0.0));
            }

            euk $$12 = this.ds();
            if (this.Q && this.g($$12.c, $$12.d + 0.6F - this.dw() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fE()) {
            this.cq();
            euk $$13 = this.ds();
            euk $$14 = this.bL();
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
               double $$21 = $$17 * (double)(-ayd.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.g($$13.d(0.99F, 0.98F, 0.99F));
            this.a(bst.a, this.ds());
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
            io $$25 = this.aK();
            float $$26 = this.dP().a_($$25).b().h();
            float $$27 = this.aE() ? $$26 * 0.91F : 0.91F;
            euk $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.b(bre.y)) {
               $$29 += (0.05 * (double)(this.c(bre.y).e() + 1) - $$28.d) * 0.2;
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
               this.o($$28.c * (double)$$27, this instanceof cen ? $$29 * (double)$$27 : $$29 * 0.98F, $$28.e * (double)$$27);
            }
         }
      }

      this.r(this instanceof cen);
   }

   private void c(clw $$0, euk $$1) {
      euk $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.da()) {
         this.y(this.e($$0));
         this.a($$2);
      } else {
         this.r(false);
         this.g(euk.b);
         this.aF();
      }
   }

   protected void a(clw $$0, euk $$1) {
   }

   protected euk b(clw $$0, euk $$1) {
      return $$1;
   }

   protected float e(clw $$0) {
      return this.fn();
   }

   public void r(boolean $$0) {
      float $$1 = (float)ayd.g(this.du() - this.L, $$0 ? this.dw() - this.M : 0.0, this.dA() - this.N);
      this.x($$1);
   }

   protected void x(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aV.a($$1, 0.4F);
   }

   public euk a(euk $$0, float $$1) {
      this.a(this.C($$1), $$0);
      this.g(this.j(this.ds()));
      this.a(bst.a, this.ds());
      euk $$2 = this.ds();
      if ((this.Q || this.bo) && (this.q_() || this.dq().a(dea.qP) && djs.a(this))) {
         $$2 = new euk($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public euk a(double $$0, boolean $$1, euk $$2) {
      if ($$0 != 0.0 && !this.cb()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new euk($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private euk j(euk $$0) {
      if (this.q_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = ayd.a($$0.c, -0.15F, 0.15F);
         double $$3 = ayd.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dq().a(dea.nS) && this.fD() && this instanceof clw) {
            $$4 = 0.0;
         }

         $$0 = new euk($$2, $$4, $$3);
      }

      return $$0;
   }

   private float C(float $$0) {
      return this.aE() ? this.fn() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fm();
   }

   protected float fm() {
      return this.cQ() instanceof clw ? this.fn() * 0.1F : 0.02F;
   }

   public float fn() {
      return this.cf;
   }

   public void y(float $$0) {
      this.cf = $$0;
   }

   public boolean C(bru $$0) {
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
            if (this.aN <= 0) {
               this.aN = 20 * (30 - $$0);
            }

            this.aN--;
            if (this.aN <= 0) {
               this.q($$0 - 1);
            }
         }

         int $$1 = this.eU();
         if ($$1 > 0) {
            if (this.aO <= 0) {
               this.aO = 20 * (30 - $$1);
            }

            this.aO--;
            if (this.aO <= 0) {
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
      float $$5 = this.aZ;
      float $$6 = 0.0F;
      this.bh = this.bi;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)ayd.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = ayd.e(ayd.g(this.dF()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aT > 0.0F) {
         $$5 = this.dF();
      }

      if (!this.aE()) {
         $$7 = 0.0F;
      }

      this.bi = this.bi + ($$7 - this.bi) * 0.3F;
      this.dP().af().a("headTurn");
      $$6 = this.e($$5, $$6);
      this.dP().af().c();
      this.dP().af().a("rangeChecks");

      while (this.dF() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dF() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aZ - this.ba < -180.0F) {
         this.ba -= 360.0F;
      }

      while (this.aZ - this.ba >= 180.0F) {
         this.ba += 360.0F;
      }

      while (this.dH() - this.P < -180.0F) {
         this.P -= 360.0F;
      }

      while (this.dH() - this.P >= 180.0F) {
         this.P += 360.0F;
      }

      while (this.bb - this.bc < -180.0F) {
         this.bc -= 360.0F;
      }

      while (this.bb - this.bc >= 180.0F) {
         this.bc += 360.0F;
      }

      this.dP().af().c();
      this.bj += $$6;
      if (this.fE()) {
         this.bC++;
      } else {
         this.bC = 0;
      }

      if (this.fL()) {
         this.s(0.0F);
      }

      this.z();
      float $$10 = this.ee();
      if ($$10 != this.bF) {
         this.bF = $$10;
         this.j_();
      }
   }

   private void D() {
      Map<bsb, cto> $$0 = this.E();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bsb, cto> E() {
      Map<bsb, cto> $$0 = null;

      for (bsb $$1 : bsb.values()) {
         cto $$2 = switch ($$1.a()) {
            case a -> this.g($$1);
            case b -> this.f($$1);
            case c -> this.bY;
         };
         cto $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bsb.class);
            }

            $$0.put($$1, $$3);
            btt $$4 = this.eW();
            if (!$$2.e()) {
               $$2.a($$1, ($$1x, $$2x) -> {
                  bts $$3x = $$4.a($$1x);
                  if ($$3x != null) {
                     $$3x.e($$2x);
                  }
               });
            }

            if (!$$3.e()) {
               $$3.a($$1, ($$1x, $$2x) -> {
                  bts $$3x = $$4.a($$1x);
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

   public boolean a(cto $$0, cto $$1) {
      return !cto.a($$1, $$0);
   }

   private void a(Map<bsb, cto> $$0) {
      cto $$1 = $$0.get(bsb.a);
      cto $$2 = $$0.get(bsb.b);
      if ($$1 != null && $$2 != null && cto.a($$1, this.g(bsb.b)) && cto.a($$2, this.g(bsb.a))) {
         ((aqm)this.dP()).l().b(this, new acu(this, (byte)55));
         $$0.remove(bsb.a);
         $$0.remove(bsb.b);
         this.c(bsb.a, $$1.s());
         this.c(bsb.b, $$2.s());
      }
   }

   private void b(Map<bsb, cto> $$0) {
      List<Pair<bsb, cto>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cto $$3 = $$2.s();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
               break;
            case c:
               this.bY = $$3;
         }
      });
      ((aqm)this.dP()).l().b(this, new aex(this.al(), $$1));
   }

   private cto f(bsb $$0) {
      return this.bX.get($$0.b());
   }

   private void b(bsb $$0, cto $$1) {
      this.bX.set($$0.b(), $$1);
   }

   private cto g(bsb $$0) {
      return this.bW.get($$0.b());
   }

   private void c(bsb $$0, cto $$1) {
      this.bW.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = ayd.g($$0 - this.aZ);
      this.aZ += $$2 * 0.3F;
      float $$3 = ayd.g(this.dF() - this.aZ);
      float $$4 = this.fo();
      if (Math.abs($$3) > $$4) {
         this.aZ = this.aZ + ($$3 - (float)ayd.j((double)$$3) * $$4);
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
      if (this.cg > 0) {
         this.cg--;
      }

      if (this.da()) {
         this.bs = 0;
         this.f(this.du(), this.dw(), this.dA());
      }

      if (this.bs > 0) {
         this.a(this.bs, this.bt, this.bu, this.bv, this.bw, this.bx);
         this.bs--;
      } else if (!this.db()) {
         this.g(this.ds().a(0.98));
      }

      if (this.bz > 0) {
         this.a(this.bz, this.by);
         this.bz--;
      }

      euk $$0 = this.ds();
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
      this.dP().af().a("ai");
      if (this.fg()) {
         this.bo = false;
         this.bp = 0.0F;
         this.br = 0.0F;
      } else if (this.db()) {
         this.dP().af().a("newAi");
         this.fq();
         this.dP().af().c();
      }

      this.dP().af().c();
      this.dP().af().a("jump");
      if (this.bo && this.ef()) {
         double $$4;
         if (this.bs()) {
            $$4 = this.b(awb.b);
         } else {
            $$4 = this.b(awb.a);
         }

         boolean $$6 = this.be() && $$4 > 0.0;
         double $$7 = this.di();
         if (!$$6 || this.aE() && !($$4 > $$7)) {
            if (!this.bs() || this.aE() && !($$4 > $$7)) {
               if ((this.aE() || $$6 && $$4 <= $$7) && this.cg == 0) {
                  this.fj();
                  this.cg = 10;
               }
            } else {
               this.c(awb.b);
            }
         } else {
            this.c(awb.a);
         }
      } else {
         this.cg = 0;
      }

      this.dP().af().c();
      this.dP().af().a("travel");
      this.bp *= 0.98F;
      this.br *= 0.98F;
      this.G();
      euf $$8 = this.cK();
      euk $$9 = new euk((double)this.bp, (double)this.bq, (double)this.br);
      if (this.b(bre.B) || this.b(bre.y)) {
         this.n();
      }

      label104: {
         if (this.cQ() instanceof clw $$10 && this.bD()) {
            this.c($$10, $$9);
            break label104;
         }

         this.a($$9);
      }

      this.dP().af().c();
      this.dP().af().a("freezing");
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

      this.dP().af().c();
      this.dP().af().a("push");
      if (this.bD > 0) {
         this.bD--;
         this.a($$8, this.cK());
      }

      this.q();
      this.dP().af().c();
      if (!this.dP().B && this.fp() && this.bg()) {
         this.a(this.dQ().h(), 1.0F);
      }
   }

   public boolean fp() {
      return false;
   }

   private void G() {
      boolean $$0 = this.j(7);
      if ($$0 && !this.aE() && !this.bR() && !this.b(bre.y)) {
         cto $$1 = this.a(bsb.e);
         if ($$1.a(ctr.nT) && csk.j($$1)) {
            $$0 = true;
            int $$2 = this.bC + 1;
            if (!this.dP().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, bsb.e);
               }

               this.a(dvu.n);
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
         this.dP().a(dvi.a(clw.class), this.cK(), brz.a(this)).forEach(this::D);
      } else {
         List<bru> $$0 = this.dP().a(this, this.cK(), brz.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dP().aa().c(dat.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ah.a(4) == 0) {
               int $$2 = 0;

               for (bru $$3 : $$0) {
                  if (!$$3.bR()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dQ().g(), 6.0F);
               }
            }

            for (bru $$4 : $$0) {
               this.D($$4);
            }
         }
      }
   }

   protected void a(euf $$0, euf $$1) {
      euf $$2 = $$0.b($$1);
      List<bru> $$3 = this.dP().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bru $$4 : $$3) {
            if ($$4 instanceof bso) {
               this.g((bso)$$4);
               this.bD = 0;
               this.g(this.ds().a(-0.2));
               break;
            }
         }
      } else if (this.Q) {
         this.bD = 0;
      }

      if (!this.dP().B && this.bD <= 0) {
         this.c(4, false);
      }
   }

   protected void D(bru $$0) {
      $$0.h(this);
   }

   protected void g(bso $$0) {
   }

   public boolean fr() {
      return (this.ao.a(aG) & 4) != 0;
   }

   @Override
   public void ac() {
      bru $$0 = this.dc();
      super.ac();
      if ($$0 != null && $$0 != this.dc() && !this.dP().B) {
         this.b($$0);
      }
   }

   @Override
   public void t() {
      super.t();
      this.bh = this.bi;
      this.bi = 0.0F;
      this.n();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.bt = $$0;
      this.bu = $$1;
      this.bv = $$2;
      this.bw = (double)$$3;
      this.bx = (double)$$4;
      this.bs = $$5;
   }

   @Override
   public double c_() {
      return this.bs > 0 ? this.bt : this.du();
   }

   @Override
   public double d_() {
      return this.bs > 0 ? this.bu : this.dw();
   }

   @Override
   public double L_() {
      return this.bs > 0 ? this.bv : this.dA();
   }

   @Override
   public float M_() {
      return this.bs > 0 ? (float)this.bx : this.dH();
   }

   @Override
   public float e_() {
      return this.bs > 0 ? (float)this.bw : this.dF();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.by = (double)$$0;
      this.bz = $$1;
   }

   public void s(boolean $$0) {
      this.bo = $$0;
   }

   public void a(cig $$0) {
      bru $$1 = $$0.s();
      if ($$1 instanceof aqn) {
         am.R.a((aqn)$$1, $$0.p(), this);
      }
   }

   public void a(bru $$0, int $$1) {
      if (!$$0.dK() && !this.dP().B && ($$0 instanceof cig || $$0 instanceof cmc || $$0 instanceof bse)) {
         ((aqm)this.dP()).l().b($$0, new afq($$0.al(), this.al(), $$1));
      }
   }

   public boolean E(bru $$0) {
      if ($$0.dP() != this.dP()) {
         return false;
      } else {
         euk $$1 = new euk(this.du(), this.dy(), this.dA());
         euk $$2 = new euk($$0.du(), $$0.dy(), $$0.dA());
         return $$2.f($$1) > 128.0 ? false : this.dP().a(new dag($$1, $$2, dag.a.a, dag.b.a, this)).c() == eui.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.bb : ayd.i($$0, this.bc, this.bb);
   }

   public float z(float $$0) {
      float $$1 = this.aT - this.aS;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aS + $$1 * $$0;
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
      return this.bb;
   }

   @Override
   public void n(float $$0) {
      this.bb = $$0;
   }

   @Override
   public void o(float $$0) {
      this.aZ = $$0;
   }

   @Override
   protected euk a(it.a $$0, l.a $$1) {
      return i(super.a($$0, $$1));
   }

   public static euk i(euk $$0) {
      return new euk($$0.c, $$0.d, 0.0);
   }

   public float fs() {
      return this.ch;
   }

   public final void A(float $$0) {
      this.B(ayd.a($$0, 0.0F, this.eS()));
   }

   protected void B(float $$0) {
      this.ch = $$0;
   }

   public void f_() {
   }

   public void g_() {
   }

   protected void ft() {
      this.ca = true;
   }

   public abstract bsi fu();

   public boolean fv() {
      return (this.ao.a(aG) & 1) > 0;
   }

   public bpt fw() {
      return (this.ao.a(aG) & 2) > 0 ? bpt.b : bpt.a;
   }

   private void H() {
      if (this.fv()) {
         if (cto.b(this.b(this.fw()), this.bA)) {
            this.bA = this.b(this.fw());
            this.a(this.bA);
         } else {
            this.fB();
         }
      }
   }

   protected void a(cto $$0) {
      $$0.b(this.dP(), this, this.fy());
      if (this.I()) {
         this.b($$0, 5);
      }

      if (--this.bB == 0 && !this.dP().B && !$$0.w()) {
         this.x();
      }
   }

   private boolean I() {
      int $$0 = this.bA.u() - this.fy();
      int $$1 = (int)((float)this.bA.u() * 0.21875F);
      boolean $$2 = $$0 > $$1;
      return $$2 && this.fy() % 4 == 0;
   }

   private void K() {
      this.cn = this.cm;
      if (this.cd()) {
         this.cm = Math.min(1.0F, this.cm + 0.09F);
      } else {
         this.cm = Math.max(0.0F, this.cm - 0.09F);
      }
   }

   protected void c(int $$0, boolean $$1) {
      int $$2 = this.ao.a(aG);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.ao.a(aG, (byte)$$2);
   }

   public void c(bpt $$0) {
      cto $$1 = this.b($$0);
      if (!$$1.e() && !this.fv()) {
         this.bA = $$1;
         this.bB = $$1.u();
         if (!this.dP().B) {
            this.c(1, true);
            this.c(2, $$0 == bpt.b);
            this.a(dvu.D);
         }
      }
   }

   @Override
   public void a(ajr<?> $$0) {
      super.a($$0);
      if (bQ.equals($$0)) {
         if (this.dP().B) {
            this.fJ().ifPresent(this::a);
         }
      } else if (aG.equals($$0) && this.dP().B) {
         if (this.fv() && this.bA.e()) {
            this.bA = this.b(this.fw());
            if (!this.bA.e()) {
               this.bB = this.bA.u();
            }
         } else if (!this.fv() && !this.bA.e()) {
            this.bA = cto.i;
            this.bB = 0;
         }
      }
   }

   @Override
   public void a(eq.a $$0, euk $$1) {
      super.a($$0, $$1);
      this.bc = this.bb;
      this.aZ = this.bb;
      this.ba = this.aZ;
   }

   protected void b(cto $$0, int $$1) {
      if (!$$0.e() && this.fv()) {
         if ($$0.v() == cvj.c) {
            this.a(this.c($$0), 0.5F, this.dP().z.i() * 0.1F + 0.9F);
         }

         if ($$0.v() == cvj.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ah.a(2), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(cto $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         euk $$3 = new euk(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dH() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dF() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ah.i()) * 0.6 - 0.3;
         euk $$5 = new euk(((double)this.ah.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dH() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dF() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.du(), this.dy(), this.dA());
         this.dP().a(new ku(ky.S, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void x() {
      if (!this.dP().B || this.fv()) {
         bpt $$0 = this.fw();
         if (!this.bA.equals(this.b($$0))) {
            this.fA();
         } else {
            if (!this.bA.e() && this.fv()) {
               this.b(this.bA, 16);
               cto $$1 = this.bA.a(this.dP(), this);
               if ($$1 != this.bA) {
                  this.a($$0, $$1);
               }

               this.fB();
            }
         }
      }
   }

   public cto fx() {
      return this.bA;
   }

   public int fy() {
      return this.bB;
   }

   public int fz() {
      return this.fv() ? this.bA.u() - this.fy() : 0;
   }

   public void fA() {
      if (!this.bA.e()) {
         this.bA.a(this.dP(), this, this.fy());
         if (this.bA.w()) {
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
            this.a(dvu.C);
         }
      }

      this.bA = cto.i;
      this.bB = 0;
   }

   public boolean fC() {
      if (this.fv() && !this.bA.e()) {
         ctj $$0 = this.bA.g();
         return $$0.c(this.bA) != cvj.d ? false : $$0.b(this.bA) - this.bB >= 5;
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
      return super.cd() || !this.fE() && this.c(bta.b);
   }

   public int fF() {
      return this.bC;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.du();
      double $$5 = this.dw();
      double $$6 = this.dA();
      double $$7 = $$1;
      boolean $$8 = false;
      io $$9 = io.a($$0, $$1, $$2);
      dax $$10 = this.dP();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.I_()) {
            io $$12 = $$9.d();
            drb $$13 = $$10.a_($$12);
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

         if (this instanceof bsx $$14) {
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

   public void a(io $$0, boolean $$1) {
   }

   public boolean f(cto $$0) {
      return false;
   }

   @Override
   public final brx a(bta $$0) {
      return $$0 == bta.c ? aH : this.e($$0).a(this.ee());
   }

   protected brx e(bta $$0) {
      return this.ak().n().a(this.ed());
   }

   public ImmutableList<bta> fI() {
      return ImmutableList.of(bta.a);
   }

   public euf f(bta $$0) {
      brx $$1 = this.a($$0);
      return new euf((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bta $$0) {
      euf $$1 = this.a($$0).a(this.dn());
      return this.dP().b(this, $$1);
   }

   @Override
   public boolean cw() {
      return super.cw() && !this.fL();
   }

   public Optional<io> fJ() {
      return this.ao.a(bQ);
   }

   public void h(io $$0) {
      this.ao.a(bQ, Optional.of($$0));
   }

   public void fK() {
      this.ao.a(bQ, Optional.empty());
   }

   public boolean fL() {
      return this.fJ().isPresent();
   }

   public void b(io $$0) {
      if (this.bR()) {
         this.ac();
      }

      drb $$1 = this.dP().a_($$0);
      if ($$1.b() instanceof ddr) {
         this.dP().a($$0, $$1.a(ddr.c, Boolean.valueOf(true)), 3);
      }

      this.b(bta.c);
      this.a($$0);
      this.h($$0);
      this.g(euk.b);
      this.av = true;
   }

   private void a(io $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean M() {
      return this.fJ().map($$0 -> this.dP().a_($$0).b() instanceof ddr).orElse(false);
   }

   public void fM() {
      this.fJ().filter(this.dP()::B).ifPresent($$0x -> {
         drb $$1 = this.dP().a_($$0x);
         if ($$1.b() instanceof ddr) {
            it $$2 = $$1.c(ddr.aE);
            this.dP().a($$0x, $$1.a(ddr.c, Boolean.valueOf(false)), 3);
            euk $$3 = ddr.a(this.ak(), this.dP(), $$0x, $$2, this.dF()).orElseGet(() -> {
               io $$1x = $$0x.c();
               return new euk((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            euk $$4 = euk.c($$0x).d($$3).d();
            float $$5 = (float)ayd.d(ayd.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      euk $$0 = this.dn();
      this.b(bta.a);
      this.a_($$0.c, $$0.d, $$0.e);
      this.fK();
   }

   @Nullable
   public it fN() {
      io $$0 = this.fJ().orElse(null);
      return $$0 != null ? ddr.a(this.dP(), $$0) : null;
   }

   @Override
   public boolean bE() {
      return !this.fL() && super.bE();
   }

   public cto g(cto $$0) {
      return cto.i;
   }

   public cto a(dax $$0, cto $$1) {
      coq $$2 = $$1.a(kb.u);
      if ($$2 != null) {
         $$0.a(null, this.du(), this.dw(), this.dA(), this.d($$1), avi.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$2);
         $$1.a(1, this);
         this.a(dvu.m);
      }

      return $$1;
   }

   private void a(coq $$0) {
      if (!this.dP().x_()) {
         for (coq.b $$2 : $$0.f()) {
            if (this.ah.i() < $$2.b()) {
               this.b($$2.a());
            }
         }
      }
   }

   private static byte h(bsb $$0) {
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

   public void e(bsb $$0) {
      this.dP().a(this, h($$0));
   }

   public static bsb d(bpt $$0) {
      return $$0 == bpt.a ? bsb.a : bsb.b;
   }

   @Override
   public euf h_() {
      if (this.a(bsb.f).a(ctr.uq)) {
         float $$0 = 0.5F;
         return this.cK().c(0.5, 0.5, 0.5);
      } else {
         return super.h_();
      }
   }

   public static bsb h(cto $$0) {
      csq $$1 = csq.c_($$0);
      return $$1 != null ? $$1.l() : bsb.a;
   }

   private static btg a(bso $$0, bsb $$1) {
      return $$1 != bsb.f && $$1 != bsb.a && $$1 != bsb.b ? btg.a($$0, $$1, $$1x -> $$1x.e() || bsq.h($$1x) == $$1) : btg.a($$0, $$1);
   }

   @Nullable
   private static bsb s(int $$0) {
      if ($$0 == 100 + bsb.f.b()) {
         return bsb.f;
      } else if ($$0 == 100 + bsb.e.b()) {
         return bsb.e;
      } else if ($$0 == 100 + bsb.d.b()) {
         return bsb.d;
      } else if ($$0 == 100 + bsb.c.b()) {
         return bsb.c;
      } else if ($$0 == 98) {
         return bsb.a;
      } else if ($$0 == 99) {
         return bsb.b;
      } else {
         return $$0 == 105 ? bsb.g : null;
      }
   }

   @Override
   public btg a_(int $$0) {
      bsb $$1 = s($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dD() {
      if (this.N_()) {
         return false;
      } else {
         boolean $$0 = !this.a(bsb.f).a(awe.ba) && !this.a(bsb.e).a(awe.ba) && !this.a(bsb.d).a(awe.ba) && !this.a(bsb.c).a(awe.ba);
         return $$0 && super.dD();
      }
   }

   @Override
   public boolean cg() {
      return !this.dP().x_() && this.b(bre.x) || super.cg();
   }

   @Override
   public float dG() {
      return this.aZ;
   }

   @Override
   public void a(abr $$0) {
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      float $$4 = $$0.n();
      float $$5 = $$0.m();
      this.f($$1, $$2, $$3);
      this.aZ = $$0.o();
      this.bb = $$0.o();
      this.ba = this.aZ;
      this.bc = this.bb;
      this.e($$0.b());
      this.a_($$0.e());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.o($$0.j(), $$0.k(), $$0.l());
   }

   public boolean fO() {
      return this.eX().g() instanceof cri;
   }

   @Override
   public float dJ() {
      float $$0 = (float)this.g(btw.v);
      return this.cQ() instanceof clw ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public euk m(bru $$0) {
      return this.dn().e(this.a($$0, this.a(this.ar()), this.ee() * this.ed()));
   }

   protected void a(int $$0, double $$1) {
      this.bb = (float)ayd.e(1.0 / (double)$$0, (double)this.bb, $$1);
   }

   @Override
   public void h(int $$0) {
      super.h(czi.a(this, $$0));
   }

   public boolean fP() {
      return false;
   }

   public static record a(avg a, avg b) {
   }
}
