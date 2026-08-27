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

public abstract class bqo extends bpv implements bps {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final brt bE = new brt(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, brt.a.c);
   public static final int h = 2;
   public static final int i = 4;
   public static final int j = 98;
   public static final int k = 100;
   public static final int l = 105;
   public static final int m = 6;
   public static final int n = 100;
   private static final int bF = 40;
   public static final double o = 0.003;
   public static final double p = 0.08;
   public static final int q = 20;
   private static final int bG = 7;
   private static final int bH = 10;
   private static final int bI = 2;
   public static final int r = 4;
   public static final float s = 0.42F;
   private static final double bJ = 128.0;
   protected static final int t = 1;
   protected static final int u = 2;
   protected static final int v = 4;
   protected static final aiy<Byte> aE = ajc.a(bqo.class, aja.a);
   private static final aiy<Float> bK = ajc.a(bqo.class, aja.d);
   private static final aiy<Integer> bL = ajc.a(bqo.class, aja.b);
   private static final aiy<Boolean> bM = ajc.a(bqo.class, aja.k);
   private static final aiy<Integer> bN = ajc.a(bqo.class, aja.b);
   private static final aiy<Integer> bO = ajc.a(bqo.class, aja.b);
   private static final aiy<Optional<ib>> bP = ajc.a(bqo.class, aja.o);
   protected static final bpy aF = bpy.c(0.2F, 0.2F).b(0.2F);
   public static final float aG = 0.5F;
   public static final float aH = 0.5F;
   private final brs bQ;
   private final boq bR = new boq(this);
   private final Map<il<bpf>, bph> bS = Maps.newHashMap();
   private final iu<crj> bT = iu.a(2, crj.i);
   private final iu<crj> bU = iu.a(4, crj.i);
   private crj bV = crj.i;
   public boolean aI;
   private boolean bW = false;
   public bnz aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public float aQ;
   public float aR;
   protected int aS;
   public final bro aT = new bro();
   public final int aU = 20;
   public final float aV;
   public final float aW;
   public float aX;
   public float aY;
   public float aZ;
   public float ba;
   @Nullable
   protected cjt bb;
   protected int bc;
   protected boolean bd;
   protected int be;
   protected float bf;
   protected float bg;
   protected float bh;
   protected float bi;
   protected float bj;
   protected int bk;
   protected float bl;
   protected boolean bm;
   public float bn;
   public float bo;
   public float bp;
   protected int bq;
   protected double br;
   protected double bs;
   protected double bt;
   protected double bu;
   protected double bv;
   protected double bw;
   protected int bx;
   private boolean bX = true;
   @Nullable
   private bqo bY;
   private int bZ;
   private bqo ca;
   private int cb;
   private float cc;
   private int cd;
   private float ce;
   protected crj by = crj.i;
   protected int bz;
   protected int bA;
   private ib cf;
   private Optional<ib> cg = Optional.empty();
   @Nullable
   private bot ch;
   private long ci;
   protected int bB;
   private float cj;
   private float ck;
   protected brp<?> bC;
   private boolean cl;
   protected float bD = 1.0F;

   protected bqo(bqb<? extends bqo> $$0, cyx $$1) {
      super($$0, $$1);
      this.bQ = new brs(brw.a($$0));
      this.t(this.eO());
      this.I = true;
      this.aW = (float)((Math.random() + 1.0) * 0.01F);
      this.ar();
      this.aV = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.aZ = this.dC();
      ua $$2 = ua.a;
      this.bC = this.a(new Dynamic($$2, (uj)$$2.createMap(ImmutableMap.of($$2.a("memories"), (uj)$$2.emptyMap()))));
   }

   public brp<?> dP() {
      return this.bC;
   }

   protected brp.b<?> dQ() {
      return brp.a(ImmutableList.of(), ImmutableList.of());
   }

   protected brp<?> a(Dynamic<?> $$0) {
      return this.dQ().a($$0);
   }

   @Override
   public void al() {
      this.a(this.dN().w(), Float.MAX_VALUE);
   }

   public boolean a(bqb<?> $$0) {
      return true;
   }

   @Override
   protected void a(ajc.a $$0) {
      $$0.a(aE, (byte)0);
      $$0.a(bL, 0);
      $$0.a(bM, false);
      $$0.a(bN, 0);
      $$0.a(bO, 0);
      $$0.a(bK, 1.0F);
      $$0.a(bP, Optional.empty());
   }

   public static bru.a dR() {
      return bru.a().a(brv.q).a(brv.n).a(brv.r).a(brv.a).a(brv.b).a(brv.p).a(brv.v).a(brv.t).a(brv.l).a(brv.s).a(brv.i).a(brv.m);
   }

   @Override
   protected void a(double $$0, boolean $$1, doz $$2, ib $$3) {
      if (!this.bc()) {
         this.bk();
      }

      if (!this.dM().B && $$1 && this.ab > 0.0F) {
         this.dW();
         this.dX();
         double $$4 = this.g(brv.s);
         if ((double)this.ab > $$4 && !$$2.i()) {
            double $$5 = this.dr();
            double $$6 = this.dt();
            double $$7 = this.dx();
            ib $$8 = this.dm();
            if ($$3.u() != $$8.u() || $$3.w() != $$8.w()) {
               double $$9 = $$5 - (double)$$3.u() - 0.5;
               double $$10 = $$7 - (double)$$3.w() - 0.5;
               double $$11 = Math.max(Math.abs($$9), Math.abs($$10));
               $$5 = (double)$$3.u() + 0.5 + $$9 / $$11 * 0.5;
               $$7 = (double)$$3.w() + 0.5 + $$10 / $$11 * 0.5;
            }

            float $$12 = (float)axk.c((double)this.ab - $$4);
            double $$13 = Math.min((double)(0.2F + $$12 / 15.0F), 2.5);
            int $$14 = (int)(150.0 * $$13);
            ((aps)this.dM()).a(new kd(kl.c, $$2), $$5, $$6, $$7, $$14, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cg = Optional.empty();
      }
   }

   public final boolean dS() {
      return this.ai().a(avf.m);
   }

   public float a(float $$0) {
      return axk.i($$0, this.ck, this.cj);
   }

   @Override
   public void as() {
      this.aQ = this.aR;
      if (this.am) {
         this.fG().ifPresent(this::a);
      }

      if (this.dT()) {
         this.dU();
      }

      super.as();
      this.dM().af().a("livingEntityBaseTick");
      if (this.bb() || this.dM().B) {
         this.aA();
      }

      if (this.bA()) {
         boolean $$0 = this instanceof cjt;
         if (!this.dM().B) {
            if (this.bB()) {
               this.a(this.dN().f(), 1.0F);
            } else if ($$0 && !this.dM().C_().a(this.cH())) {
               double $$1 = this.dM().C_().a(this) + this.dM().C_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dM().C_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dN().v(), (float)Math.max(1, axk.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(avh.a) && !this.dM().a_(ib.a(this.dr(), this.dv(), this.dx())).a(dca.nd)) {
            boolean $$3 = !this.dS() && !bpi.c(this) && (!$$0 || !((cjt)this).ga().a);
            if ($$3) {
               this.k(this.n(this.ci()));
               if (this.ci() == -20) {
                  this.k(0);
                  esa $$4 = this.dp();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.ag.j() - this.ag.j();
                     double $$7 = this.ag.j() - this.ag.j();
                     double $$8 = this.ag.j() - this.ag.j();
                     this.dM().a(kl.e, this.dr() + $$6, this.dt() + $$7, this.dx() + $$8, $$4.c, $$4.d, $$4.e);
                  }

                  this.a(this.dN().h(), 2.0F);
               }
            }

            if (!this.dM().B && this.bO() && this.cZ() != null && this.cZ().bQ()) {
               this.ac();
            }
         } else if (this.ci() < this.ch()) {
            this.k(this.o(this.ci()));
         }

         if (!this.dM().B) {
            ib $$9 = this.dm();
            if (!Objects.equal(this.cf, $$9)) {
               this.cf = $$9;
               this.c($$9);
            }
         }
      }

      if (this.bA() && (this.be() || this.aA)) {
         this.aF();
      }

      if (this.aN > 0) {
         this.aN--;
      }

      if (this.al > 0 && !(this instanceof apt)) {
         this.al--;
      }

      if (this.ey() && this.dM().h(this)) {
         this.ed();
      }

      if (this.bc > 0) {
         this.bc--;
      } else {
         this.bb = null;
      }

      if (this.ca != null && !this.ca.bA()) {
         this.ca = null;
      }

      if (this.bY != null) {
         if (!this.bY.bA()) {
            this.a(null);
         } else if (this.ah - this.bZ > 100) {
            this.a(null);
         }
      }

      this.ep();
      this.bi = this.bh;
      this.aY = this.aX;
      this.ba = this.aZ;
      this.N = this.dC();
      this.O = this.dE();
      this.dM().af().c();
   }

   public boolean dT() {
      return this.ah % 5 == 0 && this.dp().c != 0.0 && this.dp().e != 0.0 && !this.N_() && cwr.k(this) && this.dV();
   }

   protected void dU() {
      esa $$0 = this.dp();
      this.dM()
         .a(
            kl.L,
            this.dr() + (this.ag.j() - 0.5) * (double)this.dg(),
            this.dt() + 0.1,
            this.dx() + (this.ag.j() - 0.5) * (double)this.dg(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.ag.i() * 0.4F + this.ag.i() > 0.9F ? 0.6F : 0.0F;
      this.a(aum.xu, $$1, 0.6F + this.ag.i() * 0.4F);
   }

   protected boolean dV() {
      return this.dM().a_(this.aI()).a(avc.aN);
   }

   @Override
   protected float aL() {
      return this.dV() && cwr.a(cwt.l, this) > 0 ? 1.0F : super.aL();
   }

   @Override
   protected boolean c(doz $$0) {
      return !$$0.i() || this.fB();
   }

   protected void dW() {
      brr $$0 = this.f(brv.r);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void dX() {
      if (!this.bm().i()) {
         int $$0 = cwr.a(cwt.l, this);
         if ($$0 > 0 && this.dV()) {
            brr $$1 = this.f(brv.r);
            if ($$1 == null) {
               return;
            }

            $$1.c(new brt(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), brt.a.a));
            if (this.ei().i() < 0.04F) {
               crj $$2 = this.d(bqc.c);
               $$2.a(1, this, bqc.c);
            }
         }
      }
   }

   protected void dY() {
      brr $$0 = this.f(brv.r);
      if ($$0 != null) {
         if ($$0.a(e) != null) {
            $$0.b(e);
         }
      }
   }

   protected void dZ() {
      if (!this.bm().i()) {
         int $$0 = this.cj();
         if ($$0 > 0) {
            brr $$1 = this.f(brv.r);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.ck();
            $$1.c(new brt(e, "Powder snow slow", (double)$$2, brt.a.a));
         }
      }
   }

   protected void c(ib $$0) {
      int $$1 = cwr.a(cwt.j, this);
      if ($$1 > 0) {
         cww.a(this, this.dM(), $$0, $$1);
      }

      if (this.c(this.bm())) {
         this.dW();
      }

      this.dX();
   }

   public boolean p_() {
      return false;
   }

   public float ea() {
      return this.p_() ? 0.5F : 1.0F;
   }

   public float eb() {
      brs $$0 = this.eT();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(brv.t));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean ec() {
      return true;
   }

   protected void ed() {
      this.aP++;
      if (this.aP >= 20 && !this.dM().x_() && !this.dH()) {
         this.dM().a(this, (byte)60);
         this.a(bpv.c.a);
      }
   }

   public boolean ee() {
      return !this.p_();
   }

   protected boolean ef() {
      return !this.p_();
   }

   protected int n(int $$0) {
      int $$1 = cwr.e(this);
      return $$1 > 0 && this.ag.a($$1 + 1) > 0 ? $$0 : $$0 - 1;
   }

   protected int o(int $$0) {
      return Math.min($$0 + 4, this.ch());
   }

   public int eg() {
      return 0;
   }

   protected boolean eh() {
      return false;
   }

   public axr ei() {
      return this.ag;
   }

   @Nullable
   public bqo ej() {
      return this.bY;
   }

   @Override
   public bqo T_() {
      return this.ej();
   }

   public int ek() {
      return this.bZ;
   }

   public void c(@Nullable cjt $$0) {
      this.bb = $$0;
      this.bc = this.ah;
   }

   public void a(@Nullable bqo $$0) {
      this.bY = $$0;
      this.bZ = this.ah;
   }

   @Nullable
   public bqo el() {
      return this.ca;
   }

   public int em() {
      return this.cb;
   }

   public void A(bpv $$0) {
      if ($$0 instanceof bqo) {
         this.ca = (bqo)$$0;
      } else {
         this.ca = null;
      }

      this.cb = this.ah;
   }

   public int en() {
      return this.be;
   }

   public void p(int $$0) {
      this.be = $$0;
   }

   public boolean eo() {
      return this.bW;
   }

   public void p(boolean $$0) {
      this.bW = $$0;
   }

   protected boolean a(bqc $$0) {
      return true;
   }

   public void a(bqc $$0, crj $$1, crj $$2) {
      boolean $$3 = $$2.d() && $$1.d();
      if (!$$3 && !crj.c($$1, $$2) && !this.am) {
         cql $$4 = cql.c_($$2);
         if (!this.dM().x_() && !this.N_()) {
            if (!this.aU() && $$4 != null && $$4.k() == $$0) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), $$4.aq_(), this.db(), 1.0F, 1.0F, this.ag.g());
            }

            if (this.a($$0)) {
               this.a($$4 != null ? dts.v : dts.S);
            }
         }
      }
   }

   @Override
   public void a(bpv.c $$0) {
      super.a($$0);
      this.bC.a();
   }

   @Override
   public void b(tm $$0) {
      $$0.a("Health", this.ex());
      $$0.a("HurtTime", (short)this.aN);
      $$0.a("HurtByTimestamp", this.bZ);
      $$0.a("DeathTime", (short)this.aP);
      $$0.a("AbsorptionAmount", this.fp());
      $$0.a("Attributes", this.eT().c());
      if (!this.bS.isEmpty()) {
         ts $$1 = new ts();

         for (bph $$2 : this.bS.values()) {
            $$1.add($$2.i());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fB());
      this.fG().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<uj> $$3 = this.bC.a(ua.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(tm $$0) {
      this.B($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dM() != null && !this.dM().B) {
         this.eT().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         ts $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tm $$3 = $$1.a($$2);
            bph $$4 = bph.a($$3);
            if ($$4 != null) {
               this.bS.put($$4.b(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.t($$0.j("Health"));
      }

      this.aN = $$0.g("HurtTime");
      this.aP = $$0.g("DeathTime");
      this.bZ = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         ete $$6 = this.dM().L();
         esz $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cx(), $$7);
         if (!$$8) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         ib $$9 = new ib($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$9);
         this.an.a(as, bqz.c);
         if (!this.am) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bC = this.a(new Dynamic(ua.a, $$0.c("Brain")));
      }
   }

   protected void ep() {
      Iterator<il<bpf>> $$0 = this.bS.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            il<bpf> $$1 = $$0.next();
            bph $$2 = this.bS.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dM().B) {
                  $$0.remove();
                  this.a($$2);
               }
            } else if ($$2.c() % 600 == 0) {
               this.a($$2, false, null);
            }
         }
      } catch (ConcurrentModificationException var11) {
      }

      if (this.bX) {
         if (!this.dM().B) {
            this.J();
            this.r();
         }

         this.bX = false;
      }

      int $$3 = this.an.a(bL);
      boolean $$4 = this.an.a(bM);
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
            this.dM().a($$4 ? kl.a : kl.v, this.d(0.5), this.du(), this.g(0.5), $$7, $$8, $$9);
         }
      }
   }

   protected void J() {
      if (this.bS.isEmpty()) {
         this.es();
         this.j(false);
      } else {
         Collection<bph> $$0 = this.bS.values();
         this.an.a(bM, c($$0));
         this.an.a(bL, cth.a($$0));
         this.j(this.b(bpj.n));
      }
   }

   private void r() {
      boolean $$0 = this.cd();
      if (this.j(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable bpv $$0) {
      double $$1 = 1.0;
      if (this.bV()) {
         $$1 *= 0.8;
      }

      if (this.ce()) {
         float $$2 = this.fa();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         crj $$3 = this.d(bqc.f);
         bqb<?> $$4 = $$0.ai();
         if ($$4 == bqb.aM && $$3.a(crm.uj)
            || $$4 == bqb.bt && $$3.a(crm.um)
            || $$4 == bqb.az && $$3.a(crm.up)
            || $$4 == bqb.aA && $$3.a(crm.up)
            || $$4 == bqb.x && $$3.a(crm.un)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bqo $$0) {
      return $$0 instanceof cjt && this.dM().ak() == bnx.a ? false : $$0.eq();
   }

   public boolean a(bqo $$0, cbe $$1) {
      return $$1.a(this, $$0);
   }

   public boolean eq() {
      return !this.cr() && this.er();
   }

   public boolean er() {
      return !this.N_() && this.bA();
   }

   public static boolean c(Collection<bph> $$0) {
      for (bph $$1 : $$0) {
         if ($$1.f() && !$$1.e()) {
            return false;
         }
      }

      return true;
   }

   protected void es() {
      this.an.a(bM, false);
      this.an.a(bL, 0);
   }

   public boolean et() {
      if (this.dM().B) {
         return false;
      } else {
         Iterator<bph> $$0 = this.bS.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<bph> eu() {
      return this.bS.values();
   }

   public Map<il<bpf>, bph> ev() {
      return this.bS;
   }

   public boolean b(il<bpf> $$0) {
      return this.bS.containsKey($$0);
   }

   @Nullable
   public bph c(il<bpf> $$0) {
      return this.bS.get($$0);
   }

   public final boolean b(bph $$0) {
      return this.b($$0, null);
   }

   public boolean b(bph $$0, @Nullable bpv $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         bph $$2 = this.bS.get($$0.b());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bS.put($$0.b(), $$0);
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

   public boolean c(bph $$0) {
      return !this.ai().a(avf.w) ? true : !$$0.a(bpj.j) && !$$0.a(bpj.s);
   }

   public void c(bph $$0, @Nullable bpv $$1) {
      if (this.c($$0)) {
         bph $$2 = this.bS.put($$0.b(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean ew() {
      return this.ai().a(avf.x);
   }

   @Nullable
   public bph d(il<bpf> $$0) {
      return this.bS.remove($$0);
   }

   public boolean e(il<bpf> $$0) {
      bph $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(bph $$0, @Nullable bpv $$1) {
      this.bX = true;
      if (!this.dM().B) {
         $$0.b().a().a(this.eT(), $$0.d());
         this.d($$0);
      }
   }

   public void d(bph $$0) {
      for (bpv $$1 : this.cP()) {
         if ($$1 instanceof apt $$2) {
            $$2.d.b(new afe(this.aj(), $$0, false));
         }
      }
   }

   protected void a(bph $$0, boolean $$1, @Nullable bpv $$2) {
      this.bX = true;
      if ($$1 && !this.dM().B) {
         bpf $$3 = $$0.b().a();
         $$3.a(this.eT());
         $$3.a(this.eT(), $$0.d());
         this.v();
      }

      if (!this.dM().B) {
         this.d($$0);
      }
   }

   protected void a(bph $$0) {
      this.bX = true;
      if (!this.dM().B) {
         $$0.b().a().a(this.eT());
         this.v();

         for (bpv $$1 : this.cP()) {
            if ($$1 instanceof apt $$2) {
               $$2.d.b(new adj(this.aj(), $$0.b()));
            }
         }
      }
   }

   private void v() {
      for (brr $$0 : this.eT().a()) {
         this.i($$0.a());
      }
   }

   private void i(il<brq> $$0) {
      if ($$0.a(brv.q)) {
         float $$1 = this.eO();
         if (this.ex() > $$1) {
            this.t($$1);
         }
      } else if ($$0.a(brv.p)) {
         float $$2 = this.eP();
         if (this.fp() > $$2) {
            this.A($$2);
         }
      }
   }

   public void c(float $$0) {
      float $$1 = this.ex();
      if ($$1 > 0.0F) {
         this.t($$1 + $$0);
      }
   }

   public float ex() {
      return this.an.a(bK);
   }

   public void t(float $$0) {
      this.an.a(bK, axk.a($$0, 0.0F, this.eO()));
   }

   public boolean ey() {
      return this.ex() <= 0.0F;
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dM().B) {
         return false;
      } else if (this.ey()) {
         return false;
      } else if ($$0.a(ave.j) && this.b(bpj.l)) {
         return false;
      } else {
         if (this.fI() && !this.dM().B) {
            this.fJ();
         }

         this.be = 0;
         float $$2 = $$1;
         boolean $$3 = false;
         float $$4 = 0.0F;
         if ($$1 > 0.0F && this.f($$0)) {
            this.v($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.a(ave.k) && $$0.c() instanceof bqo $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(ave.p) && this.ai().a(avf.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(ave.a) && !this.d(bqc.f).d()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.aT.a(1.5F);
         boolean $$7 = true;
         if ((float)this.al > 10.0F && !$$0.a(ave.f)) {
            if ($$1 <= this.bl) {
               return false;
            }

            this.f($$0, $$1 - this.bl);
            this.bl = $$1;
            $$7 = false;
         } else {
            this.bl = $$1;
            this.al = 20;
            this.f($$0, $$1);
            this.aO = 10;
            this.aN = this.aO;
         }

         bpv $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof bqo $$9 && !$$0.a(ave.r) && (!$$0.a(bow.G) || !this.ai().a(avf.D))) {
               this.a($$9);
            }

            if ($$8 instanceof cjt $$10) {
               this.bc = 100;
               this.bb = $$10;
            } else if ($$8 instanceof cdg $$11 && $$11.r()) {
               this.bc = 100;
               if ($$11.P_() instanceof cjt $$12) {
                  this.bb = $$12;
               } else {
                  this.bb = null;
               }
            }
         }

         if ($$7) {
            if ($$3) {
               this.dM().a(this, (byte)29);
            } else {
               this.dM().a(this, $$0);
            }

            if (!$$0.a(ave.s) && (!$$3 || $$1 > 0.0F)) {
               this.bt();
            }

            if ($$8 != null && !$$0.a(ave.A)) {
               double $$13 = $$8.dr() - this.dr();

               double $$14;
               for ($$14 = $$8.dx() - this.dx(); $$13 * $$13 + $$14 * $$14 < 1.0E-4; $$14 = (Math.random() - Math.random()) * 0.01) {
                  $$13 = (Math.random() - Math.random()) * 0.01;
               }

               this.q(0.4F, $$13, $$14);
               if (!$$3) {
                  this.a($$13, $$14);
               }
            }
         }

         if (this.ey()) {
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
            this.ch = $$0;
            this.ci = this.dM().Y();
         }

         if (this instanceof apt) {
            am.i.a((apt)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((apt)this).a(auw.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof apt) {
            am.h.a((apt)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$15;
      }
   }

   protected void d(bqo $$0) {
      $$0.e(this);
   }

   protected void e(bqo $$0) {
      $$0.q(0.5, $$0.dr() - this.dr(), $$0.dx() - this.dx());
   }

   private boolean h(bot $$0) {
      if ($$0.a(ave.e)) {
         return false;
      } else {
         crj $$1 = null;

         for (bnz $$2 : bnz.values()) {
            crj $$3 = this.b($$2);
            if ($$3.a(crm.vr)) {
               $$1 = $$3.r();
               $$3.g(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof apt $$4) {
               $$4.b(auw.c.b(crm.vr));
               am.C.a($$4, $$1);
               this.a(dts.C);
            }

            this.t(1.0F);
            this.et();
            this.b(new bph(bpj.j, 900, 1));
            this.b(new bph(bpj.v, 100, 1));
            this.b(new bph(bpj.l, 800, 0));
            this.dM().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bot ez() {
      if (this.dM().Y() - this.ci > 40L) {
         this.ch = null;
      }

      return this.ch;
   }

   protected void e(bot $$0) {
      this.b(this.d($$0));
   }

   public void b(@Nullable aul $$0) {
      if ($$0 != null) {
         this.a($$0, this.fb(), this.fc());
      }
   }

   public boolean f(bot $$0) {
      bpv $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cjz $$3 && $$3.D() > 0) {
         $$2 = true;
      }

      if (!$$0.a(ave.d) && this.fz() && !$$2) {
         esa $$4 = $$0.h();
         if ($$4 != null) {
            esa $$5 = this.b(0.0F, this.cp());
            esa $$6 = $$4.a(this.dk());
            $$6 = new esa($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(crj $$0) {
      if (!$$0.d()) {
         if (!this.aU()) {
            this.dM().a(this.dr(), this.dt(), this.dx(), $$0.K(), this.db(), 0.8F, 0.8F + this.dM().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bot $$0) {
      if (!this.dH() && !this.bd) {
         bpv $$1 = $$0.d();
         bqo $$2 = this.eN();
         if (this.bk >= 0 && $$2 != null) {
            $$2.a(this, this.bk, $$0);
         }

         if (this.fI()) {
            this.fJ();
         }

         if (!this.dM().B && this.ae()) {
            b.info("Named entity {} died: {}", this, this.eM().a().getString());
         }

         this.bd = true;
         this.eM().c();
         if (this.dM() instanceof aps $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(dts.p);
               this.g($$0);
               this.f($$2);
            }

            this.dM().a(this, (byte)3);
         }

         this.b(bqz.h);
      }
   }

   protected void f(@Nullable bqo $$0) {
      if (!this.dM().B) {
         boolean $$1 = false;
         if ($$0 instanceof cfr) {
            if (this.dM().aa().b(cyt.c)) {
               ib $$2 = this.dm();
               doz $$3 = dca.cd.n();
               if (this.dM().a_($$2).i() && $$3.a((cza)this.dM(), $$2)) {
                  this.dM().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               cgd $$4 = new cgd(this.dM(), this.dr(), this.dt(), this.dx(), new crj(crm.dv));
               this.dM().b($$4);
            }
         }
      }
   }

   protected void g(bot $$0) {
      bpv $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof cjt) {
         $$2 = cwr.h((bqo)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.bc > 0;
      if (this.ef() && this.dM().aa().b(cyt.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.eA();
      this.eB();
   }

   protected void eA() {
   }

   protected void eB() {
      if (this.dM() instanceof aps && !this.eF() && (this.eh() || this.bc > 0 && this.ee() && this.dM().aa().b(cyt.f))) {
         bqe.a((aps)this.dM(), this.dk(), this.eg());
      }
   }

   protected void a(bot $$0, int $$1, boolean $$2) {
   }

   public ajt eC() {
      return this.ai().j();
   }

   public long eD() {
      return 0L;
   }

   protected void a(bot $$0, boolean $$1) {
      ajt $$2 = this.eC();
      enj $$3 = this.dM().o().aM().getLootTable($$2);
      enh.a $$4 = new enh.a((aps)this.dM()).a(epo.a, this).a(epo.f, this.dk()).a(epo.c, $$0).b(epo.d, $$0.d()).b(epo.e, $$0.c());
      if ($$1 && this.bb != null) {
         $$4 = $$4.a(epo.b, this.bb).a(this.bb.gv());
      }

      enh $$5 = $$4.a(epn.g);
      $$3.a($$5, this.eD(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.g(brv.n);
      if (!($$0 <= 0.0)) {
         this.au = true;
         esa $$3 = this.dp();
         esa $$4 = new esa($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aC() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected aul d(bot $$0) {
      return aum.kb;
   }

   @Nullable
   protected aul o_() {
      return aum.jW;
   }

   private aul d(int $$0) {
      return $$0 > 4 ? this.eI().b() : this.eI().a();
   }

   public void eE() {
      this.cl = true;
   }

   public boolean eF() {
      return this.cl;
   }

   public float eG() {
      return 0.0F;
   }

   protected erv eH() {
      erv $$0 = this.cH();
      bpv $$1 = this.cZ();
      if ($$1 != null) {
         esa $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public bqo.a eI() {
      return new bqo.a(aum.kc, aum.jU);
   }

   protected aul c(crj $$0) {
      return $$0.I();
   }

   public aul d(crj $$0) {
      return $$0.J();
   }

   public Optional<ib> eJ() {
      return this.cg;
   }

   public boolean q_() {
      if (this.N_()) {
         return false;
      } else {
         ib $$0 = this.dm();
         doz $$1 = this.dn();
         if ($$1.a(avc.aP)) {
            this.cg = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dkk && this.c($$0, $$1)) {
            this.cg = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(ib $$0, doz $$1) {
      if ($$1.c(dkk.b)) {
         doz $$2 = this.dM().a_($$0.d());
         if ($$2.a(dca.cO) && $$2.c(dgd.b) == $$1.c(dkk.aE)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean bA() {
      return !this.dH() && this.ex() > 0.0F;
   }

   @Override
   public int cu() {
      return this.u(0.0F);
   }

   protected final int u(float $$0) {
      return axk.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bot $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.d($$0, $$1);
      if ($$4 > 0) {
         this.a(this.d($$4), 1.0F, 1.0F);
         this.eK();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int d(float $$0, float $$1) {
      if (this.ai().a(avf.o)) {
         return 0;
      } else {
         float $$2 = (float)this.g(brv.s);
         float $$3 = $$0 - $$2;
         return axk.c((double)($$3 * $$1) * this.g(brv.i));
      }
   }

   protected void eK() {
      if (!this.aU()) {
         int $$0 = axk.a(this.dr());
         int $$1 = axk.a(this.dt() - 0.2F);
         int $$2 = axk.a(this.dx());
         doz $$3 = this.dM().a_(new ib($$0, $$1, $$2));
         if (!$$3.i()) {
            djk $$4 = $$3.w();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void m(float $$0) {
      this.aO = 10;
      this.aN = this.aO;
   }

   public int eL() {
      return axk.a(this.g(brv.a));
   }

   protected void b(bot $$0, float $$1) {
   }

   protected void c(bot $$0, float $$1) {
   }

   protected void v(float $$0) {
   }

   protected void a(bot $$0, float $$1, bqc... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bqc $$4 : $$2) {
            crj $$5 = this.d($$4);
            if ((!$$0.a(ave.j) || !$$5.f().A()) && $$5.f() instanceof coy) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float d(bot $$0, float $$1) {
      if (!$$0.a(ave.c)) {
         this.b($$0, $$1);
         $$1 = bop.a($$1, (float)this.eL(), (float)this.g(brv.b));
      }

      return $$1;
   }

   protected float e(bot $$0, float $$1) {
      if ($$0.a(ave.g)) {
         return $$1;
      } else {
         if (this.b(bpj.k) && !$$0.a(ave.h)) {
            int $$2 = (this.c(bpj.k).d() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof apt) {
                  ((apt)this).a(auw.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof apt) {
                  ((apt)$$0.d()).a(auw.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(ave.i)) {
            return $$1;
         } else {
            int $$7 = cwr.a(this.eY(), $$0);
            if ($$7 > 0) {
               $$1 = bop.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bot $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fp(), 0.0F);
         this.A(this.fp() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof apt $$4) {
            $$4.a(auw.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eM().a($$0, var9);
            this.t(this.ex() - var9);
            this.A(this.fp() - var9);
            this.a(dts.o);
         }
      }
   }

   public boq eM() {
      return this.bR;
   }

   @Nullable
   public bqo eN() {
      if (this.bb != null) {
         return this.bb;
      } else {
         return this.bY != null ? this.bY : null;
      }
   }

   public final float eO() {
      return (float)this.g(brv.q);
   }

   public final float eP() {
      return (float)this.g(brv.p);
   }

   public final int eQ() {
      return this.an.a(bN);
   }

   public final void q(int $$0) {
      this.an.a(bN, $$0);
   }

   public final int eR() {
      return this.an.a(bO);
   }

   public final void r(int $$0) {
      this.an.a(bO, $$0);
   }

   private int z() {
      if (bpi.a(this)) {
         return 6 - (1 + bpi.b(this));
      } else {
         return this.b(bpj.d) ? 6 + (1 + this.c(bpj.d).d()) * 2 : 6;
      }
   }

   public void a(bnz $$0) {
      this.a($$0, false);
   }

   public void a(bnz $$0, boolean $$1) {
      if (!this.aI || this.aK >= this.z() / 2 || this.aK < 0) {
         this.aK = -1;
         this.aI = true;
         this.aJ = $$0;
         if (this.dM() instanceof aps) {
            abb $$2 = new abb(this, $$0 == bnz.a ? 0 : 3);
            apq $$3 = ((aps)this.dM()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bot $$0) {
      this.aT.a(1.5F);
      this.al = 20;
      this.aO = 10;
      this.aN = this.aO;
      aul $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.fb(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
      }

      this.a(this.dN().n(), 0.0F);
      this.ch = $$0;
      this.ci = this.dM().Y();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            aul $$1 = this.o_();
            if ($$1 != null) {
               this.a($$1, this.fb(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cjt)) {
               this.t(0.0F);
               this.a(this.dN().n());
            }
            break;
         case 29:
            this.a(aum.wh, 1.0F, 0.8F + this.dM().z.i() * 0.4F);
            break;
         case 30:
            this.a(aum.wi, 0.8F, 0.8F + this.dM().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ag.i() - 0.5F) * 0.2F;
               float $$6 = (this.ag.i() - 0.5F) * 0.2F;
               float $$7 = (this.ag.i() - 0.5F) * 0.2F;
               double $$8 = axk.d($$4, this.K, this.dr()) + (this.ag.j() - 0.5) * (double)this.dg() * 2.0;
               double $$9 = axk.d($$4, this.L, this.dt()) + this.ag.j() * (double)this.dh();
               double $$10 = axk.d($$4, this.M, this.dx()) + (this.ag.j() - 0.5) * (double)this.dg() * 2.0;
               this.dM().a(kl.aa, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.d(bqc.a));
            break;
         case 48:
            this.i(this.d(bqc.b));
            break;
         case 49:
            this.i(this.d(bqc.f));
            break;
         case 50:
            this.i(this.d(bqc.e));
            break;
         case 51:
            this.i(this.d(bqc.d));
            break;
         case 52:
            this.i(this.d(bqc.c));
            break;
         case 54:
            dfr.b(this);
            break;
         case 55:
            this.B();
            break;
         case 60:
            this.A();
            break;
         case 65:
            this.i(this.d(bqc.g));
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
         this.dM().a(kl.Z, this.d(1.0), this.du(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void B() {
      crj $$0 = this.d(bqc.b);
      this.a(bqc.b, this.d(bqc.a));
      this.a(bqc.a, $$0);
   }

   @Override
   protected void aB() {
      this.a(this.dN().m(), 4.0F);
   }

   protected void eS() {
      int $$0 = this.z();
      if (this.aI) {
         this.aK++;
         if (this.aK >= $$0) {
            this.aK = 0;
            this.aI = false;
         }
      } else {
         this.aK = 0;
      }

      this.aR = (float)this.aK / (float)$$0;
   }

   @Nullable
   public brr f(il<brq> $$0) {
      return this.eT().a($$0);
   }

   public double g(il<brq> $$0) {
      return this.eT().c($$0);
   }

   public double h(il<brq> $$0) {
      return this.eT().d($$0);
   }

   public brs eT() {
      return this.bQ;
   }

   public crj eU() {
      return this.d(bqc.a);
   }

   public crj eV() {
      return this.d(bqc.b);
   }

   public boolean b(cre $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<crj> $$0) {
      return $$0.test(this.eU()) || $$0.test(this.eV());
   }

   public crj b(bnz $$0) {
      if ($$0 == bnz.a) {
         return this.d(bqc.a);
      } else if ($$0 == bnz.b) {
         return this.d(bqc.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bnz $$0, crj $$1) {
      if ($$0 == bnz.a) {
         this.a(bqc.a, $$1);
      } else {
         if ($$0 != bnz.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bqc.b, $$1);
      }
   }

   public boolean b(bqc $$0) {
      return !this.d($$0).d();
   }

   public boolean c(bqc $$0) {
      return false;
   }

   public abstract Iterable<crj> eW();

   public abstract crj d(bqc var1);

   public abstract void a(bqc var1, crj var2);

   public Iterable<crj> eX() {
      return List.of();
   }

   public Iterable<crj> eY() {
      return this.eW();
   }

   public Iterable<crj> eZ() {
      return Iterables.concat(this.eX(), this.eY());
   }

   protected void e(crj $$0) {
      $$0.f().n($$0);
   }

   public float fa() {
      Iterable<crj> $$0 = this.eW();
      int $$1 = 0;
      int $$2 = 0;

      for (crj $$3 : $$0) {
         if (!$$3.d()) {
            $$2++;
         }

         $$1++;
      }

      return $$1 > 0 ? (float)$$2 / (float)$$1 : 0.0F;
   }

   @Override
   public void g(boolean $$0) {
      super.g($$0);
      brr $$1 = this.f(brv.r);
      $$1.b(bE.a());
      if ($$0) {
         $$1.c(bE);
      }
   }

   protected float fb() {
      return 1.0F;
   }

   public float fc() {
      return this.p_() ? (this.ag.i() - this.ag.i()) * 0.2F + 1.5F : (this.ag.i() - this.ag.i()) * 0.2F + 1.0F;
   }

   protected boolean fd() {
      return this.ey();
   }

   @Override
   public void h(bpv $$0) {
      if (!this.fI()) {
         super.h($$0);
      }
   }

   private void b(bpv $$0) {
      esa $$1;
      if (this.dH()) {
         $$1 = this.dk();
      } else if (!$$0.dH() && !this.dM().a_($$0.dm()).a(avc.aJ)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dt(), $$0.dt());
         $$1 = new esa(this.dr(), $$2, this.dx());
      }

      this.a($$1.c, $$1.d, $$1.e);
   }

   @Override
   public boolean cC() {
      return this.cB();
   }

   protected float fe() {
      return this.w(1.0F);
   }

   protected float w(float $$0) {
      return (float)this.g(brv.m) * $$0 * this.aK() + this.ff();
   }

   public float ff() {
      return this.b(bpj.h) ? 0.1F * ((float)this.c(bpj.h).d() + 1.0F) : 0.0F;
   }

   protected void fg() {
      esa $$0 = this.dp();
      this.o($$0.c, (double)this.fe(), $$0.e);
      if (this.bY()) {
         float $$1 = this.dC() * (float) (Math.PI / 180.0);
         this.g(this.dp().b((double)(-axk.a($$1) * 0.2F), 0.0, (double)(axk.b($$1) * 0.2F)));
      }

      this.au = true;
   }

   protected void fh() {
      this.g(this.dp().b(0.0, -0.04F, 0.0));
   }

   protected void c(avr<ekr> $$0) {
      this.g(this.dp().b(0.0, 0.04F, 0.0));
   }

   protected float fi() {
      return 0.8F;
   }

   public boolean a(eks $$0) {
      return false;
   }

   @Override
   protected double aW() {
      return this.g(brv.l);
   }

   public void a(esa $$0) {
      if (this.cX()) {
         double $$1 = this.aX();
         boolean $$2 = this.dp().d <= 0.0;
         if ($$2 && this.b(bpj.B)) {
            $$1 = Math.min($$1, 0.01);
         }

         eks $$3 = this.dM().b_(this.dm());
         if (this.bc() && this.ec() && !this.a($$3)) {
            double $$4 = this.dt();
            float $$5 = this.bY() ? 0.9F : this.fi();
            float $$6 = 0.02F;
            float $$7 = (float)cwr.f(this);
            if ($$7 > 3.0F) {
               $$7 = 3.0F;
            }

            if (!this.aC()) {
               $$7 *= 0.5F;
            }

            if ($$7 > 0.0F) {
               $$5 += (0.54600006F - $$5) * $$7 / 3.0F;
               $$6 += (this.fk() - $$6) * $$7 / 3.0F;
            }

            if (this.b(bpj.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(bqt.a, this.dp());
            esa $$8 = this.dp();
            if (this.P && this.q_()) {
               $$8 = new esa($$8.c, 0.2, $$8.e);
            }

            this.g($$8.d((double)$$5, 0.8F, (double)$$5));
            esa $$9 = this.a($$1, $$2, this.dp());
            this.g($$9);
            if (this.P && this.g($$9.c, $$9.d + 0.6F - this.dt() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bq() && this.ec() && !this.a($$3)) {
            double $$10 = this.dt();
            this.a(0.02F, $$0);
            this.a(bqt.a, this.dp());
            if (this.b(avh.b) <= this.df()) {
               this.g(this.dp().d(0.5, 0.8F, 0.5));
               esa $$11 = this.a($$1, $$2, this.dp());
               this.g($$11);
            } else {
               this.g(this.dp().a(0.5));
            }

            if ($$1 != 0.0) {
               this.g(this.dp().b(0.0, -$$1 / 4.0, 0.0));
            }

            esa $$12 = this.dp();
            if (this.P && this.g($$12.c, $$12.d + 0.6F - this.dt() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fB()) {
            this.cn();
            esa $$13 = this.dp();
            esa $$14 = this.bI();
            float $$15 = this.dE() * (float) (Math.PI / 180.0);
            double $$16 = Math.sqrt($$14.c * $$14.c + $$14.e * $$14.e);
            double $$17 = $$13.h();
            double $$18 = $$14.f();
            double $$19 = Math.cos((double)$$15);
            $$19 = $$19 * $$19 * Math.min(1.0, $$18 / 0.4);
            $$13 = this.dp().b(0.0, $$1 * (-1.0 + $$19 * 0.75), 0.0);
            if ($$13.d < 0.0 && $$16 > 0.0) {
               double $$20 = $$13.d * -0.1 * $$19;
               $$13 = $$13.b($$14.c * $$20 / $$16, $$20, $$14.e * $$20 / $$16);
            }

            if ($$15 < 0.0F && $$16 > 0.0) {
               double $$21 = $$17 * (double)(-axk.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.g($$13.d(0.99F, 0.98F, 0.99F));
            this.a(bqt.a, this.dp());
            if (this.P && !this.dM().B) {
               double $$22 = this.dp().h();
               double $$23 = $$17 - $$22;
               float $$24 = (float)($$23 * 10.0 - 3.0);
               if ($$24 > 0.0F) {
                  this.a(this.d((int)$$24), 1.0F, 1.0F);
                  this.a(this.dN().l(), $$24);
               }
            }

            if (this.aC() && !this.dM().B) {
               this.b(7, false);
            }
         } else {
            ib $$25 = this.aI();
            float $$26 = this.dM().a_($$25).b().h();
            float $$27 = this.aC() ? $$26 * 0.91F : 0.91F;
            esa $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.b(bpj.y)) {
               $$29 += (0.05 * (double)(this.c(bpj.y).d() + 1) - $$28.d) * 0.2;
            } else if (!this.dM().B || this.dM().B($$25)) {
               $$29 -= $$1;
            } else if (this.dt() > (double)this.dM().I_()) {
               $$29 = -0.1;
            } else {
               $$29 = 0.0;
            }

            if (this.eo()) {
               this.o($$28.c, $$29, $$28.e);
            } else {
               this.o($$28.c * (double)$$27, $$29 * 0.98F, $$28.e * (double)$$27);
            }
         }
      }

      this.q(this instanceof ccm);
   }

   private void c(cjt $$0, esa $$1) {
      esa $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.cX()) {
         this.y(this.e($$0));
         this.a($$2);
      } else {
         this.q(false);
         this.g(esa.b);
         this.aD();
      }
   }

   protected void a(cjt $$0, esa $$1) {
   }

   protected esa b(cjt $$0, esa $$1) {
      return $$1;
   }

   protected float e(cjt $$0) {
      return this.fk();
   }

   public void q(boolean $$0) {
      float $$1 = (float)axk.g(this.dr() - this.K, $$0 ? this.dt() - this.L : 0.0, this.dx() - this.M);
      this.x($$1);
   }

   protected void x(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aT.a($$1, 0.4F);
   }

   public esa a(esa $$0, float $$1) {
      this.a(this.C($$1), $$0);
      this.g(this.j(this.dp()));
      this.a(bqt.a, this.dp());
      esa $$2 = this.dp();
      if ((this.P || this.bm) && (this.q_() || this.dn().a(dca.qP) && dhr.a(this))) {
         $$2 = new esa($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public esa a(double $$0, boolean $$1, esa $$2) {
      if ($$0 != 0.0 && !this.bY()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new esa($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private esa j(esa $$0) {
      if (this.q_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = axk.a($$0.c, -0.15F, 0.15F);
         double $$3 = axk.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dn().a(dca.nS) && this.fA() && this instanceof cjt) {
            $$4 = 0.0;
         }

         $$0 = new esa($$2, $$4, $$3);
      }

      return $$0;
   }

   private float C(float $$0) {
      return this.aC() ? this.fk() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fj();
   }

   protected float fj() {
      return this.cN() instanceof cjt ? this.fk() * 0.1F : 0.02F;
   }

   public float fk() {
      return this.cc;
   }

   public void y(float $$0) {
      this.cc = $$0;
   }

   public boolean C(bpv $$0) {
      this.A($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.G();
      this.I();
      if (!this.dM().B) {
         int $$0 = this.eQ();
         if ($$0 > 0) {
            if (this.aL <= 0) {
               this.aL = 20 * (30 - $$0);
            }

            this.aL--;
            if (this.aL <= 0) {
               this.q($$0 - 1);
            }
         }

         int $$1 = this.eR();
         if ($$1 > 0) {
            if (this.aM <= 0) {
               this.aM = 20 * (30 - $$1);
            }

            this.aM--;
            if (this.aM <= 0) {
               this.r($$1 - 1);
            }
         }

         this.C();
         if (this.ah % 20 == 0) {
            this.eM().c();
         }

         if (this.fI() && !this.K()) {
            this.fJ();
         }
      }

      if (!this.dH()) {
         this.n_();
      }

      double $$2 = this.dr() - this.K;
      double $$3 = this.dx() - this.M;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aX;
      float $$6 = 0.0F;
      this.bf = this.bg;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)axk.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = axk.e(axk.g(this.dC()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aR > 0.0F) {
         $$5 = this.dC();
      }

      if (!this.aC()) {
         $$7 = 0.0F;
      }

      this.bg = this.bg + ($$7 - this.bg) * 0.3F;
      this.dM().af().a("headTurn");
      $$6 = this.e($$5, $$6);
      this.dM().af().c();
      this.dM().af().a("rangeChecks");

      while (this.dC() - this.N < -180.0F) {
         this.N -= 360.0F;
      }

      while (this.dC() - this.N >= 180.0F) {
         this.N += 360.0F;
      }

      while (this.aX - this.aY < -180.0F) {
         this.aY -= 360.0F;
      }

      while (this.aX - this.aY >= 180.0F) {
         this.aY += 360.0F;
      }

      while (this.dE() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dE() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aZ - this.ba < -180.0F) {
         this.ba -= 360.0F;
      }

      while (this.aZ - this.ba >= 180.0F) {
         this.ba += 360.0F;
      }

      this.dM().af().c();
      this.bh += $$6;
      if (this.fB()) {
         this.bA++;
      } else {
         this.bA = 0;
      }

      if (this.fI()) {
         this.s(0.0F);
      }

      this.v();
      float $$10 = this.eb();
      if ($$10 != this.bD) {
         this.bD = $$10;
         this.j_();
      }
   }

   private void C() {
      Map<bqc, crj> $$0 = this.D();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bqc, crj> D() {
      Map<bqc, crj> $$0 = null;

      for (bqc $$1 : bqc.values()) {
         crj $$2 = switch ($$1.a()) {
            case a -> this.g($$1);
            case b -> this.f($$1);
            case c -> this.bV;
         };
         crj $$3 = this.d($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bqc.class);
            }

            $$0.put($$1, $$3);
            brs $$4 = this.eT();
            if (!$$2.d()) {
               $$2.a($$1, ($$1x, $$2x) -> {
                  brr $$3x = $$4.a($$1x);
                  if ($$3x != null) {
                     $$3x.e($$2x);
                  }
               });
            }

            if (!$$3.d()) {
               $$3.a($$1, ($$1x, $$2x) -> {
                  brr $$3x = $$4.a($$1x);
                  if ($$3x != null) {
                     $$3x.b($$2x.a());
                     $$3x.c($$2x);
                  }
               });
            }
         }
      }

      return $$0;
   }

   public boolean a(crj $$0, crj $$1) {
      return !crj.a($$1, $$0);
   }

   private void a(Map<bqc, crj> $$0) {
      crj $$1 = $$0.get(bqc.a);
      crj $$2 = $$0.get(bqc.b);
      if ($$1 != null && $$2 != null && crj.a($$1, this.g(bqc.b)) && crj.a($$2, this.g(bqc.a))) {
         ((aps)this.dM()).l().b(this, new acc(this, (byte)55));
         $$0.remove(bqc.a);
         $$0.remove(bqc.b);
         this.c(bqc.a, $$1.r());
         this.c(bqc.b, $$2.r());
      }
   }

   private void b(Map<bqc, crj> $$0) {
      List<Pair<bqc, crj>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         crj $$3 = $$2.r();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
               break;
            case c:
               this.bV = $$3;
         }
      });
      ((aps)this.dM()).l().b(this, new aef(this.aj(), $$1));
   }

   private crj f(bqc $$0) {
      return this.bU.get($$0.b());
   }

   private void b(bqc $$0, crj $$1) {
      this.bU.set($$0.b(), $$1);
   }

   private crj g(bqc $$0) {
      return this.bT.get($$0.b());
   }

   private void c(bqc $$0, crj $$1) {
      this.bT.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = axk.g($$0 - this.aX);
      this.aX += $$2 * 0.3F;
      float $$3 = axk.g(this.dC() - this.aX);
      float $$4 = this.fl();
      if (Math.abs($$3) > $$4) {
         this.aX = this.aX + ($$3 - (float)axk.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float fl() {
      return 50.0F;
   }

   public void n_() {
      if (this.cd > 0) {
         this.cd--;
      }

      if (this.cX()) {
         this.bq = 0;
         this.f(this.dr(), this.dt(), this.dx());
      }

      if (this.bq > 0) {
         this.a(this.bq, this.br, this.bs, this.bt, this.bu, this.bv);
         this.bq--;
      } else if (!this.cY()) {
         this.g(this.dp().a(0.98));
      }

      if (this.bx > 0) {
         this.a(this.bx, this.bw);
         this.bx--;
      }

      esa $$0 = this.dp();
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
      this.dM().af().a("ai");
      if (this.fd()) {
         this.bm = false;
         this.bn = 0.0F;
         this.bp = 0.0F;
      } else if (this.cY()) {
         this.dM().af().a("newAi");
         this.fn();
         this.dM().af().c();
      }

      this.dM().af().c();
      this.dM().af().a("jump");
      if (this.bm && this.ec()) {
         double $$4;
         if (this.bq()) {
            $$4 = this.b(avh.b);
         } else {
            $$4 = this.b(avh.a);
         }

         boolean $$6 = this.bc() && $$4 > 0.0;
         double $$7 = this.df();
         if (!$$6 || this.aC() && !($$4 > $$7)) {
            if (!this.bq() || this.aC() && !($$4 > $$7)) {
               if ((this.aC() || $$6 && $$4 <= $$7) && this.cd == 0) {
                  this.fg();
                  this.cd = 10;
               }
            } else {
               this.c(avh.b);
            }
         } else {
            this.c(avh.a);
         }
      } else {
         this.cd = 0;
      }

      this.dM().af().c();
      this.dM().af().a("travel");
      this.bn *= 0.98F;
      this.bp *= 0.98F;
      this.E();
      erv $$8 = this.cH();
      esa $$9 = new esa((double)this.bn, (double)this.bo, (double)this.bp);
      if (this.b(bpj.B) || this.b(bpj.y)) {
         this.n();
      }

      label104: {
         if (this.cN() instanceof cjt $$10 && this.bA()) {
            this.c($$10, $$9);
            break label104;
         }

         this.a($$9);
      }

      this.dM().af().c();
      this.dM().af().a("freezing");
      if (!this.dM().B && !this.ey()) {
         int $$11 = this.cj();
         if (this.aA && this.dA()) {
            this.l(Math.min(this.cm(), $$11 + 1));
         } else {
            this.l(Math.max(0, $$11 - 2));
         }
      }

      this.dY();
      this.dZ();
      if (!this.dM().B && this.ah % 40 == 0 && this.cl() && this.dA()) {
         this.a(this.dN().t(), 1.0F);
      }

      this.dM().af().c();
      this.dM().af().a("push");
      if (this.bB > 0) {
         this.bB--;
         this.a($$8, this.cH());
      }

      this.q();
      this.dM().af().c();
      if (!this.dM().B && this.fm() && this.be()) {
         this.a(this.dN().h(), 1.0F);
      }
   }

   public boolean fm() {
      return false;
   }

   private void E() {
      boolean $$0 = this.j(7);
      if ($$0 && !this.aC() && !this.bO() && !this.b(bpj.y)) {
         crj $$1 = this.d(bqc.e);
         if ($$1.a(crm.nS) && cqf.j($$1)) {
            $$0 = true;
            int $$2 = this.bA + 1;
            if (!this.dM().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, bqc.e);
               }

               this.a(dts.n);
            }
         } else {
            $$0 = false;
         }
      } else {
         $$0 = false;
      }

      if (!this.dM().B) {
         this.b(7, $$0);
      }
   }

   protected void fn() {
   }

   protected void q() {
      if (this.dM().x_()) {
         this.dM().a(dtg.a(cjt.class), this.cH(), bqa.a(this)).forEach(this::D);
      } else {
         List<bpv> $$0 = this.dM().a(this, this.cH(), bqa.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dM().aa().c(cyt.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ag.a(4) == 0) {
               int $$2 = 0;

               for (bpv $$3 : $$0) {
                  if (!$$3.bO()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dN().g(), 6.0F);
               }
            }

            for (bpv $$4 : $$0) {
               this.D($$4);
            }
         }
      }
   }

   protected void a(erv $$0, erv $$1) {
      erv $$2 = $$0.b($$1);
      List<bpv> $$3 = this.dM().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bpv $$4 : $$3) {
            if ($$4 instanceof bqo) {
               this.g((bqo)$$4);
               this.bB = 0;
               this.g(this.dp().a(-0.2));
               break;
            }
         }
      } else if (this.P) {
         this.bB = 0;
      }

      if (!this.dM().B && this.bB <= 0) {
         this.c(4, false);
      }
   }

   protected void D(bpv $$0) {
      $$0.h(this);
   }

   protected void g(bqo $$0) {
   }

   public boolean fo() {
      return (this.an.a(aE) & 4) != 0;
   }

   @Override
   public void ac() {
      bpv $$0 = this.cZ();
      super.ac();
      if ($$0 != null && $$0 != this.cZ() && !this.dM().B) {
         this.b($$0);
      }
   }

   @Override
   public void t() {
      super.t();
      this.bf = this.bg;
      this.bg = 0.0F;
      this.n();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.br = $$0;
      this.bs = $$1;
      this.bt = $$2;
      this.bu = (double)$$3;
      this.bv = (double)$$4;
      this.bq = $$5;
   }

   @Override
   public double c_() {
      return this.bq > 0 ? this.br : this.dr();
   }

   @Override
   public double d_() {
      return this.bq > 0 ? this.bs : this.dt();
   }

   @Override
   public double L_() {
      return this.bq > 0 ? this.bt : this.dx();
   }

   @Override
   public float M_() {
      return this.bq > 0 ? (float)this.bv : this.dE();
   }

   @Override
   public float e_() {
      return this.bq > 0 ? (float)this.bu : this.dC();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bw = (double)$$0;
      this.bx = $$1;
   }

   public void r(boolean $$0) {
      this.bm = $$0;
   }

   public void a(cgd $$0) {
      bpv $$1 = $$0.u();
      if ($$1 instanceof apt) {
         am.R.a((apt)$$1, $$0.p(), this);
      }
   }

   public void a(bpv $$0, int $$1) {
      if (!$$0.dH() && !this.dM().B && ($$0 instanceof cgd || $$0 instanceof cjz || $$0 instanceof bqe)) {
         ((aps)this.dM()).l().b($$0, new aey($$0.aj(), this.aj(), $$1));
      }
   }

   public boolean E(bpv $$0) {
      if ($$0.dM() != this.dM()) {
         return false;
      } else {
         esa $$1 = new esa(this.dr(), this.dv(), this.dx());
         esa $$2 = new esa($$0.dr(), $$0.dv(), $$0.dx());
         return $$2.f($$1) > 128.0 ? false : this.dM().a(new cyg($$1, $$2, cyg.a.a, cyg.b.a, this)).c() == ery.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.aZ : axk.i($$0, this.ba, this.aZ);
   }

   public float z(float $$0) {
      float $$1 = this.aR - this.aQ;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aQ + $$1 * $$0;
   }

   @Override
   public boolean bw() {
      return !this.dH();
   }

   @Override
   public boolean bx() {
      return this.bA() && !this.N_() && !this.q_();
   }

   @Override
   public float cp() {
      return this.aZ;
   }

   @Override
   public void n(float $$0) {
      this.aZ = $$0;
   }

   @Override
   public void o(float $$0) {
      this.aX = $$0;
   }

   @Override
   protected esa a(ih.a $$0, l.a $$1) {
      return i(super.a($$0, $$1));
   }

   public static esa i(esa $$0) {
      return new esa($$0.c, $$0.d, 0.0);
   }

   public float fp() {
      return this.ce;
   }

   public final void A(float $$0) {
      this.B(axk.a($$0, 0.0F, this.eP()));
   }

   protected void B(float $$0) {
      this.ce = $$0;
   }

   public void f_() {
   }

   public void g_() {
   }

   protected void fq() {
      this.bX = true;
   }

   public abstract bqi fr();

   public boolean fs() {
      return (this.an.a(aE) & 1) > 0;
   }

   public bnz ft() {
      return (this.an.a(aE) & 2) > 0 ? bnz.b : bnz.a;
   }

   private void G() {
      if (this.fs()) {
         if (crj.b(this.b(this.ft()), this.by)) {
            this.by = this.b(this.ft());
            this.a(this.by);
         } else {
            this.fy();
         }
      }
   }

   protected void a(crj $$0) {
      $$0.b(this.dM(), this, this.fv());
      if (this.H()) {
         this.b($$0, 5);
      }

      if (--this.bz == 0 && !this.dM().B && !$$0.v()) {
         this.x();
      }
   }

   private boolean H() {
      int $$0 = this.fv();
      cmm $$1 = this.by.f().z();
      boolean $$2 = $$1 != null && $$1.e();
      $$2 |= $$0 <= this.by.t() - 7;
      return $$2 && $$0 % 4 == 0;
   }

   private void I() {
      this.ck = this.cj;
      if (this.ca()) {
         this.cj = Math.min(1.0F, this.cj + 0.09F);
      } else {
         this.cj = Math.max(0.0F, this.cj - 0.09F);
      }
   }

   protected void c(int $$0, boolean $$1) {
      int $$2 = this.an.a(aE);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.an.a(aE, (byte)$$2);
   }

   public void c(bnz $$0) {
      crj $$1 = this.b($$0);
      if (!$$1.d() && !this.fs()) {
         this.by = $$1;
         this.bz = $$1.t();
         if (!this.dM().B) {
            this.c(1, true);
            this.c(2, $$0 == bnz.b);
            this.a(dts.D);
         }
      }
   }

   @Override
   public void a(aiy<?> $$0) {
      super.a($$0);
      if (bP.equals($$0)) {
         if (this.dM().B) {
            this.fG().ifPresent(this::a);
         }
      } else if (aE.equals($$0) && this.dM().B) {
         if (this.fs() && this.by.d()) {
            this.by = this.b(this.ft());
            if (!this.by.d()) {
               this.bz = this.by.t();
            }
         } else if (!this.fs() && !this.by.d()) {
            this.by = crj.i;
            this.bz = 0;
         }
      }
   }

   @Override
   public void a(eg.a $$0, esa $$1) {
      super.a($$0, $$1);
      this.ba = this.aZ;
      this.aX = this.aZ;
      this.aY = this.aX;
   }

   protected void b(crj $$0, int $$1) {
      if (!$$0.d() && this.fs()) {
         if ($$0.u() == ctb.c) {
            this.a(this.c($$0), 0.5F, this.dM().z.i() * 0.1F + 0.9F);
         }

         if ($$0.u() == ctb.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(crj $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         esa $$3 = new esa(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dE() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dC() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ag.i()) * 0.6 - 0.3;
         esa $$5 = new esa(((double)this.ag.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dE() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dC() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dr(), this.dv(), this.dx());
         this.dM().a(new kh(kl.R, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   @Override
   protected void x() {
      if (!this.dM().B || this.fs()) {
         bnz $$0 = this.ft();
         if (!this.by.equals(this.b($$0))) {
            this.fx();
         } else {
            if (!this.by.d() && this.fs()) {
               this.b(this.by, 16);
               crj $$1 = this.by.a(this.dM(), this);
               if ($$1 != this.by) {
                  this.a($$0, $$1);
               }

               this.fy();
            }
         }
      }
   }

   public crj fu() {
      return this.by;
   }

   public int fv() {
      return this.bz;
   }

   public int fw() {
      return this.fs() ? this.by.t() - this.fv() : 0;
   }

   public void fx() {
      if (!this.by.d()) {
         this.by.a(this.dM(), this, this.fv());
         if (this.by.v()) {
            this.G();
         }
      }

      this.fy();
   }

   public void fy() {
      if (!this.dM().B) {
         boolean $$0 = this.fs();
         this.c(1, false);
         if ($$0) {
            this.a(dts.C);
         }
      }

      this.by = crj.i;
      this.bz = 0;
   }

   public boolean fz() {
      if (this.fs() && !this.by.d()) {
         cre $$0 = this.by.f();
         return $$0.c(this.by) != ctb.d ? false : $$0.b(this.by) - this.bz >= 5;
      } else {
         return false;
      }
   }

   public boolean fA() {
      return this.bS();
   }

   public boolean fB() {
      return this.j(7);
   }

   @Override
   public boolean ca() {
      return super.ca() || !this.fB() && this.c(bqz.b);
   }

   public int fC() {
      return this.bA;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dr();
      double $$5 = this.dt();
      double $$6 = this.dx();
      double $$7 = $$1;
      boolean $$8 = false;
      ib $$9 = ib.a($$0, $$1, $$2);
      cyx $$10 = this.dM();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.I_()) {
            ib $$12 = $$9.d();
            doz $$13 = $$10.a_($$12);
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

         if (this instanceof bqw $$14) {
            $$14.K().n();
         }

         return true;
      }
   }

   public boolean fD() {
      return !this.ey();
   }

   public boolean fE() {
      return true;
   }

   public void a(ib $$0, boolean $$1) {
   }

   public boolean f(crj $$0) {
      return false;
   }

   @Override
   public final bpy a(bqz $$0) {
      return $$0 == bqz.c ? aF : this.e($$0).a(this.eb());
   }

   protected bpy e(bqz $$0) {
      return this.ai().n().a(this.ea());
   }

   public ImmutableList<bqz> fF() {
      return ImmutableList.of(bqz.a);
   }

   public erv f(bqz $$0) {
      bpy $$1 = this.a($$0);
      return new erv((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bqz $$0) {
      erv $$1 = this.a($$0).a(this.dk());
      return this.dM().b(this, $$1);
   }

   @Override
   public boolean ct() {
      return super.ct() && !this.fI();
   }

   public Optional<ib> fG() {
      return this.an.a(bP);
   }

   public void g(ib $$0) {
      this.an.a(bP, Optional.of($$0));
   }

   public void fH() {
      this.an.a(bP, Optional.empty());
   }

   public boolean fI() {
      return this.fG().isPresent();
   }

   public void b(ib $$0) {
      if (this.bO()) {
         this.ac();
      }

      doz $$1 = this.dM().a_($$0);
      if ($$1.b() instanceof dbr) {
         this.dM().a($$0, $$1.a(dbr.c, Boolean.valueOf(true)), 3);
      }

      this.b(bqz.c);
      this.a($$0);
      this.g($$0);
      this.g(esa.b);
      this.au = true;
   }

   private void a(ib $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean K() {
      return this.fG().map($$0 -> this.dM().a_($$0).b() instanceof dbr).orElse(false);
   }

   public void fJ() {
      this.fG().filter(this.dM()::B).ifPresent($$0x -> {
         doz $$1 = this.dM().a_($$0x);
         if ($$1.b() instanceof dbr) {
            ih $$2 = $$1.c(dbr.aE);
            this.dM().a($$0x, $$1.a(dbr.c, Boolean.valueOf(false)), 3);
            esa $$3 = dbr.a(this.ai(), this.dM(), $$0x, $$2, this.dC()).orElseGet(() -> {
               ib $$1x = $$0x.c();
               return new esa((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            esa $$4 = esa.c($$0x).d($$3).d();
            float $$5 = (float)axk.d(axk.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      esa $$0 = this.dk();
      this.b(bqz.a);
      this.a_($$0.c, $$0.d, $$0.e);
      this.fH();
   }

   @Nullable
   public ih fK() {
      ib $$0 = this.fG().orElse(null);
      return $$0 != null ? dbr.a(this.dM(), $$0) : null;
   }

   @Override
   public boolean bB() {
      return !this.fI() && super.bB();
   }

   public crj g(crj $$0) {
      return crj.i;
   }

   public crj a(cyx $$0, crj $$1) {
      if ($$1.H()) {
         $$0.a(null, this.dr(), this.dt(), this.dx(), this.d($$1), aun.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$1, $$0, this);
         $$1.a(1, this);
         this.a(dts.m);
      }

      return $$1;
   }

   private void a(crj $$0, cyx $$1, bqo $$2) {
      cre $$3 = $$0.f();
      if ($$3.y()) {
         for (Pair<bph, Float> $$5 : $$3.z().f()) {
            if (!$$1.B && $$5.getFirst() != null && $$1.z.i() < (Float)$$5.getSecond()) {
               $$2.b(new bph((bph)$$5.getFirst()));
            }
         }
      }
   }

   private static byte h(bqc $$0) {
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

   public void e(bqc $$0) {
      this.dM().a(this, h($$0));
   }

   public static bqc d(bnz $$0) {
      return $$0 == bnz.a ? bqc.a : bqc.b;
   }

   @Override
   public erv h_() {
      if (this.d(bqc.f).a(crm.uo)) {
         float $$0 = 0.5F;
         return this.cH().c(0.5, 0.5, 0.5);
      } else {
         return super.h_();
      }
   }

   public static bqc h(crj $$0) {
      cql $$1 = cql.c_($$0);
      return $$1 != null ? $$1.k() : bqc.a;
   }

   private static brf a(bqo $$0, bqc $$1) {
      return $$1 != bqc.f && $$1 != bqc.a && $$1 != bqc.b ? brf.a($$0, $$1, $$1x -> $$1x.d() || bqq.h($$1x) == $$1) : brf.a($$0, $$1);
   }

   @Nullable
   private static bqc s(int $$0) {
      if ($$0 == 100 + bqc.f.b()) {
         return bqc.f;
      } else if ($$0 == 100 + bqc.e.b()) {
         return bqc.e;
      } else if ($$0 == 100 + bqc.d.b()) {
         return bqc.d;
      } else if ($$0 == 100 + bqc.c.b()) {
         return bqc.c;
      } else if ($$0 == 98) {
         return bqc.a;
      } else if ($$0 == 99) {
         return bqc.b;
      } else {
         return $$0 == 105 ? bqc.g : null;
      }
   }

   @Override
   public brf a_(int $$0) {
      bqc $$1 = s($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dA() {
      if (this.N_()) {
         return false;
      } else {
         boolean $$0 = !this.d(bqc.f).a(avk.az) && !this.d(bqc.e).a(avk.az) && !this.d(bqc.d).a(avk.az) && !this.d(bqc.c).a(avk.az);
         return $$0 && super.dA();
      }
   }

   @Override
   public boolean cd() {
      return !this.dM().x_() && this.b(bpj.x) || super.cd();
   }

   @Override
   public float dD() {
      return this.aX;
   }

   @Override
   public void a(aaz $$0) {
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      float $$4 = $$0.n();
      float $$5 = $$0.m();
      this.f($$1, $$2, $$3);
      this.aX = $$0.o();
      this.aZ = $$0.o();
      this.aY = this.aX;
      this.ba = this.aZ;
      this.e($$0.b());
      this.a_($$0.e());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.o($$0.j(), $$0.k(), $$0.l());
   }

   public boolean fL() {
      return this.eU().f() instanceof cpd;
   }

   @Override
   public float dG() {
      float $$0 = (float)this.g(brv.v);
      return this.cN() instanceof cjt ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public esa m(bpv $$0) {
      return this.dk().e(this.a($$0, this.a(this.ap()), this.eb() * this.ea()));
   }

   protected void a(int $$0, double $$1) {
      this.aZ = (float)axk.e(1.0 / (double)$$0, (double)this.aZ, $$1);
   }

   @Override
   public void h(int $$0) {
      super.h(cxd.a(this, $$0));
   }

   public boolean fM() {
      return false;
   }

   public static record a(aul a, aul b) {
   }
}
