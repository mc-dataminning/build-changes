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

public abstract class bpp extends box implements bov {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final bqu bE = new bqu(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, bqu.a.c);
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
   protected static final aim<Byte> aE = aiq.a(bpp.class, aio.a);
   private static final aim<Float> bK = aiq.a(bpp.class, aio.d);
   private static final aim<Integer> bL = aiq.a(bpp.class, aio.b);
   private static final aim<Boolean> bM = aiq.a(bpp.class, aio.k);
   private static final aim<Integer> bN = aiq.a(bpp.class, aio.b);
   private static final aim<Integer> bO = aiq.a(bpp.class, aio.b);
   private static final aim<Optional<ib>> bP = aiq.a(bpp.class, aio.o);
   protected static final bpa aF = bpa.c(0.2F, 0.2F).b(0.2F);
   public static final float aG = 0.5F;
   public static final float aH = 0.5F;
   private final bqt bQ;
   private final bnt bR = new bnt(this);
   private final Map<il<boi>, bok> bS = Maps.newHashMap();
   private final iu<cqm> bT = iu.a(2, cqm.h);
   private final iu<cqm> bU = iu.a(4, cqm.h);
   private cqm bV = cqm.h;
   public boolean aI;
   private boolean bW = false;
   public bnc aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public float aQ;
   public float aR;
   protected int aS;
   public final bqp aT = new bqp();
   public final int aU = 20;
   public final float aV;
   public final float aW;
   public float aX;
   public float aY;
   public float aZ;
   public float ba;
   @Nullable
   protected ciu bb;
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
   private bpp bY;
   private int bZ;
   private bpp ca;
   private int cb;
   private float cc;
   private int cd;
   private float ce;
   protected cqm by = cqm.h;
   protected int bz;
   protected int bA;
   private ib cf;
   private Optional<ib> cg = Optional.empty();
   @Nullable
   private bnw ch;
   private long ci;
   protected int bB;
   private float cj;
   private float ck;
   protected bqq<?> bC;
   private boolean cl;
   protected float bD = 1.0F;

   protected bpp(bpd<? extends bpp> $$0, cxb $$1) {
      super($$0, $$1);
      this.bQ = new bqt(bqx.a($$0));
      this.t(this.eO());
      this.I = true;
      this.aW = (float)((Math.random() + 1.0) * 0.01F);
      this.ar();
      this.aV = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.aZ = this.dC();
      to $$2 = to.a;
      this.bC = this.a(new Dynamic($$2, (tx)$$2.createMap(ImmutableMap.of($$2.a("memories"), (tx)$$2.emptyMap()))));
   }

   public bqq<?> dP() {
      return this.bC;
   }

   protected bqq.b<?> dQ() {
      return bqq.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bqq<?> a(Dynamic<?> $$0) {
      return this.dQ().a($$0);
   }

   @Override
   public void al() {
      this.a(this.dN().w(), Float.MAX_VALUE);
   }

   public boolean a(bpd<?> $$0) {
      return true;
   }

   @Override
   protected void a(aiq.a $$0) {
      $$0.a(aE, (byte)0);
      $$0.a(bL, 0);
      $$0.a(bM, false);
      $$0.a(bN, 0);
      $$0.a(bO, 0);
      $$0.a(bK, 1.0F);
      $$0.a(bP, Optional.empty());
   }

   public static bqv.a dR() {
      return bqv.a().a(bqw.q).a(bqw.n).a(bqw.r).a(bqw.a).a(bqw.b).a(bqw.p).a(bqw.v).a(bqw.t).a(bqw.l).a(bqw.s).a(bqw.i).a(bqw.m);
   }

   @Override
   protected void a(double $$0, boolean $$1, dnb $$2, ib $$3) {
      if (!this.bc()) {
         this.bk();
      }

      if (!this.dM().B && $$1 && this.ab > 0.0F) {
         this.dW();
         this.dX();
         double $$4 = this.g(bqw.s);
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

            float $$12 = (float)aww.c((double)this.ab - $$4);
            double $$13 = Math.min((double)(0.2F + $$12 / 15.0F), 2.5);
            int $$14 = (int)(150.0 * $$13);
            ((apf)this.dM()).a(new ju(kc.c, $$2), $$5, $$6, $$7, $$14, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cg = Optional.empty();
      }
   }

   public final boolean dS() {
      return this.ai().a(auq.m);
   }

   public float a(float $$0) {
      return aww.i($$0, this.ck, this.cj);
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
      this.dM().ae().a("livingEntityBaseTick");
      if (this.bb() || this.dM().B) {
         this.aA();
      }

      if (this.bA()) {
         boolean $$0 = this instanceof ciu;
         if (!this.dM().B) {
            if (this.bB()) {
               this.a(this.dN().f(), 1.0F);
            } else if ($$0 && !this.dM().C_().a(this.cH())) {
               double $$1 = this.dM().C_().a(this) + this.dM().C_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dM().C_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dN().v(), (float)Math.max(1, aww.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(aus.a) && !this.dM().a_(ib.a(this.dr(), this.dv(), this.dx())).a(dae.nd)) {
            boolean $$3 = !this.dS() && !bol.c(this) && (!$$0 || !((ciu)this).ga().a);
            if ($$3) {
               this.k(this.n(this.ci()));
               if (this.ci() == -20) {
                  this.k(0);
                  ept $$4 = this.dp();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.ag.j() - this.ag.j();
                     double $$7 = this.ag.j() - this.ag.j();
                     double $$8 = this.ag.j() - this.ag.j();
                     this.dM().a(kc.e, this.dr() + $$6, this.dt() + $$7, this.dx() + $$8, $$4.c, $$4.d, $$4.e);
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

      if (this.al > 0 && !(this instanceof apg)) {
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
      this.dM().ae().c();
   }

   public boolean dT() {
      return this.ah % 5 == 0 && this.dp().c != 0.0 && this.dp().e != 0.0 && !this.N_() && cux.k(this) && this.dV();
   }

   protected void dU() {
      ept $$0 = this.dp();
      this.dM()
         .a(
            kc.L,
            this.dr() + (this.ag.j() - 0.5) * (double)this.dg(),
            this.dt() + 0.1,
            this.dx() + (this.ag.j() - 0.5) * (double)this.dg(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.ag.i() * 0.4F + this.ag.i() > 0.9F ? 0.6F : 0.0F;
      this.a(aty.xr, $$1, 0.6F + this.ag.i() * 0.4F);
   }

   protected boolean dV() {
      return this.dM().a_(this.aI()).a(aun.aN);
   }

   @Override
   protected float aL() {
      return this.dV() && cux.a(cuz.l, this) > 0 ? 1.0F : super.aL();
   }

   @Override
   protected boolean c(dnb $$0) {
      return !$$0.i() || this.fB();
   }

   protected void dW() {
      bqs $$0 = this.f(bqw.r);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void dX() {
      if (!this.bm().i()) {
         int $$0 = cux.a(cuz.l, this);
         if ($$0 > 0 && this.dV()) {
            bqs $$1 = this.f(bqw.r);
            if ($$1 == null) {
               return;
            }

            $$1.c(new bqu(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), bqu.a.a));
            if (this.ei().i() < 0.04F) {
               cqm $$2 = this.d(bpe.c);
               $$2.a(1, this, bpe.c);
            }
         }
      }
   }

   protected void dY() {
      bqs $$0 = this.f(bqw.r);
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
            bqs $$1 = this.f(bqw.r);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.ck();
            $$1.c(new bqu(e, "Powder snow slow", (double)$$2, bqu.a.a));
         }
      }
   }

   protected void c(ib $$0) {
      int $$1 = cux.a(cuz.j, this);
      if ($$1 > 0) {
         cvc.a(this, this.dM(), $$0, $$1);
      }

      if (this.c(this.bm())) {
         this.dW();
      }

      this.dX();
   }

   public boolean o_() {
      return false;
   }

   public float ea() {
      return this.o_() ? 0.5F : 1.0F;
   }

   public float eb() {
      bqt $$0 = this.eT();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bqw.t));
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
         this.a(box.c.a);
      }
   }

   public boolean ee() {
      return !this.o_();
   }

   protected boolean ef() {
      return !this.o_();
   }

   protected int n(int $$0) {
      int $$1 = cux.e(this);
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

   public axd ei() {
      return this.ag;
   }

   @Nullable
   public bpp ej() {
      return this.bY;
   }

   @Override
   public bpp T_() {
      return this.ej();
   }

   public int ek() {
      return this.bZ;
   }

   public void c(@Nullable ciu $$0) {
      this.bb = $$0;
      this.bc = this.ah;
   }

   public void a(@Nullable bpp $$0) {
      this.bY = $$0;
      this.bZ = this.ah;
   }

   @Nullable
   public bpp el() {
      return this.ca;
   }

   public int em() {
      return this.cb;
   }

   public void A(box $$0) {
      if ($$0 instanceof bpp) {
         this.ca = (bpp)$$0;
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

   protected boolean a(bpe $$0) {
      return true;
   }

   public void a(bpe $$0, cqm $$1, cqm $$2) {
      boolean $$3 = $$2.b() && $$1.b();
      if (!$$3 && !cqm.c($$1, $$2) && !this.am) {
         cpo $$4 = cpo.c_($$2);
         if (!this.dM().x_() && !this.N_()) {
            if (!this.aU() && $$4 != null && $$4.i() == $$0) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), $$4.as_(), this.db(), 1.0F, 1.0F, this.ag.g());
            }

            if (this.a($$0)) {
               this.b($$4 != null ? drp.v : drp.S);
            }
         }
      }
   }

   @Override
   public void a(box.c $$0) {
      super.a($$0);
      this.bC.a();
   }

   @Override
   public void b(ta $$0) {
      $$0.a("Health", this.ex());
      $$0.a("HurtTime", (short)this.aN);
      $$0.a("HurtByTimestamp", this.bZ);
      $$0.a("DeathTime", (short)this.aP);
      $$0.a("AbsorptionAmount", this.fp());
      $$0.a("Attributes", this.eT().c());
      if (!this.bS.isEmpty()) {
         tg $$1 = new tg();

         for (bok $$2 : this.bS.values()) {
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
      DataResult<tx> $$3 = this.bC.a(to.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(ta $$0) {
      this.B($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dM() != null && !this.dM().B) {
         this.eT().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         tg $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ta $$3 = $$1.a($$2);
            bok $$4 = bok.a($$3);
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
         eqx $$6 = this.dM().K();
         eqs $$7 = $$6.b($$5);
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
         this.an.a(as, bqa.c);
         if (!this.am) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bC = this.a(new Dynamic(to.a, $$0.c("Brain")));
      }
   }

   protected void ep() {
      Iterator<il<boi>> $$0 = this.bS.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            il<boi> $$1 = $$0.next();
            bok $$2 = this.bS.get($$1);
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
            this.dM().a($$4 ? kc.a : kc.v, this.d(0.5), this.du(), this.g(0.5), $$7, $$8, $$9);
         }
      }
   }

   protected void J() {
      if (this.bS.isEmpty()) {
         this.es();
         this.j(false);
      } else {
         Collection<bok> $$0 = this.bS.values();
         this.an.a(bM, c($$0));
         this.an.a(bL, csl.a($$0));
         this.j(this.a(bom.n));
      }
   }

   private void r() {
      boolean $$0 = this.cd();
      if (this.j(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable box $$0) {
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
         cqm $$3 = this.d(bpe.f);
         bpd<?> $$4 = $$0.ai();
         if ($$4 == bpd.aN && $$3.a(cqp.uj)
            || $$4 == bpd.bu && $$3.a(cqp.um)
            || $$4 == bpd.aA && $$3.a(cqp.up)
            || $$4 == bpd.aB && $$3.a(cqp.up)
            || $$4 == bpd.y && $$3.a(cqp.un)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bpp $$0) {
      return $$0 instanceof ciu && this.dM().aj() == bna.a ? false : $$0.eq();
   }

   public boolean a(bpp $$0, caf $$1) {
      return $$1.a(this, $$0);
   }

   public boolean eq() {
      return !this.cr() && this.er();
   }

   public boolean er() {
      return !this.N_() && this.bA();
   }

   public static boolean c(Collection<bok> $$0) {
      for (bok $$1 : $$0) {
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
         Iterator<bok> $$0 = this.bS.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<bok> eu() {
      return this.bS.values();
   }

   public Map<il<boi>, bok> ev() {
      return this.bS;
   }

   public boolean a(il<boi> $$0) {
      return this.bS.containsKey($$0);
   }

   @Nullable
   public bok c(il<boi> $$0) {
      return this.bS.get($$0);
   }

   public final boolean b(bok $$0) {
      return this.b($$0, null);
   }

   public boolean b(bok $$0, @Nullable box $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         bok $$2 = this.bS.get($$0.b());
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

   public boolean c(bok $$0) {
      return !this.ai().a(auq.w) ? true : !$$0.a(bom.j) && !$$0.a(bom.s);
   }

   public void c(bok $$0, @Nullable box $$1) {
      if (this.c($$0)) {
         bok $$2 = this.bS.put($$0.b(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean ew() {
      return this.ai().a(auq.x);
   }

   @Nullable
   public bok d(il<boi> $$0) {
      return this.bS.remove($$0);
   }

   public boolean e(il<boi> $$0) {
      bok $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(bok $$0, @Nullable box $$1) {
      this.bX = true;
      if (!this.dM().B) {
         $$0.b().a().a(this.eT(), $$0.d());
         this.d($$0);
      }
   }

   public void d(bok $$0) {
      for (box $$1 : this.cP()) {
         if ($$1 instanceof apg $$2) {
            $$2.d.b(new aes(this.aj(), $$0, false));
         }
      }
   }

   protected void a(bok $$0, boolean $$1, @Nullable box $$2) {
      this.bX = true;
      if ($$1 && !this.dM().B) {
         boi $$3 = $$0.b().a();
         $$3.a(this.eT());
         $$3.a(this.eT(), $$0.d());
         this.v();
      }

      if (!this.dM().B) {
         this.d($$0);
      }
   }

   protected void a(bok $$0) {
      this.bX = true;
      if (!this.dM().B) {
         $$0.b().a().a(this.eT());
         this.v();

         for (box $$1 : this.cP()) {
            if ($$1 instanceof apg $$2) {
               $$2.d.b(new acx(this.aj(), $$0.b()));
            }
         }
      }
   }

   private void v() {
      for (bqs $$0 : this.eT().a()) {
         this.i($$0.a());
      }
   }

   private void i(il<bqr> $$0) {
      if ($$0.a(bqw.q)) {
         float $$1 = this.eO();
         if (this.ex() > $$1) {
            this.t($$1);
         }
      } else if ($$0.a(bqw.p)) {
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
      this.an.a(bK, aww.a($$0, 0.0F, this.eO()));
   }

   public boolean ey() {
      return this.ex() <= 0.0F;
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dM().B) {
         return false;
      } else if (this.ey()) {
         return false;
      } else if ($$0.a(aup.j) && this.a(bom.l)) {
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
            if (!$$0.a(aup.k) && $$0.c() instanceof bpp $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(aup.p) && this.ai().a(auq.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(aup.a) && !this.d(bpe.f).b()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.aT.a(1.5F);
         boolean $$7 = true;
         if ((float)this.al > 10.0F && !$$0.a(aup.f)) {
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

         box $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof bpp $$9 && !$$0.a(aup.r) && (!$$0.a(bnz.G) || !this.ai().a(auq.D))) {
               this.a($$9);
            }

            if ($$8 instanceof ciu $$10) {
               this.bc = 100;
               this.bb = $$10;
            } else if ($$8 instanceof cch $$11 && $$11.r()) {
               this.bc = 100;
               if ($$11.P_() instanceof ciu $$12) {
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

            if (!$$0.a(aup.s) && (!$$3 || $$1 > 0.0F)) {
               this.bt();
            }

            if ($$8 != null && !$$0.a(aup.A)) {
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
                  this.b(this.n_());
               }

               this.a($$0);
            }
         } else if ($$7) {
            this.e($$0);
         }

         boolean $$15 = !$$3 || $$1 > 0.0F;
         if ($$15) {
            this.ch = $$0;
            this.ci = this.dM().X();
         }

         if (this instanceof apg) {
            am.i.a((apg)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((apg)this).a(aui.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof apg) {
            am.h.a((apg)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$15;
      }
   }

   protected void d(bpp $$0) {
      $$0.e(this);
   }

   protected void e(bpp $$0) {
      $$0.q(0.5, $$0.dr() - this.dr(), $$0.dx() - this.dx());
   }

   private boolean h(bnw $$0) {
      if ($$0.a(aup.e)) {
         return false;
      } else {
         cqm $$1 = null;

         for (bnc $$2 : bnc.values()) {
            cqm $$3 = this.b($$2);
            if ($$3.a(cqp.vr)) {
               $$1 = $$3.q();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof apg $$4) {
               $$4.b(aui.c.b(cqp.vr));
               am.C.a($$4, $$1);
               this.b(drp.C);
            }

            this.t(1.0F);
            this.et();
            this.b(new bok(bom.j, 900, 1));
            this.b(new bok(bom.v, 100, 1));
            this.b(new bok(bom.l, 800, 0));
            this.dM().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bnw ez() {
      if (this.dM().X() - this.ci > 40L) {
         this.ch = null;
      }

      return this.ch;
   }

   protected void e(bnw $$0) {
      this.b(this.d($$0));
   }

   public void b(@Nullable atx $$0) {
      if ($$0 != null) {
         this.a($$0, this.fb(), this.fc());
      }
   }

   public boolean f(bnw $$0) {
      box $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cja $$3 && $$3.C() > 0) {
         $$2 = true;
      }

      if (!$$0.a(aup.d) && this.fz() && !$$2) {
         ept $$4 = $$0.h();
         if ($$4 != null) {
            ept $$5 = this.b(0.0F, this.cp());
            ept $$6 = $$4.a(this.dk());
            $$6 = new ept($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(cqm $$0) {
      if (!$$0.b()) {
         if (!this.aU()) {
            this.dM().a(this.dr(), this.dt(), this.dx(), aty.nk, this.db(), 0.8F, 0.8F + this.dM().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bnw $$0) {
      if (!this.dH() && !this.bd) {
         box $$1 = $$0.d();
         bpp $$2 = this.eN();
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
         if (this.dM() instanceof apf $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.b(drp.p);
               this.g($$0);
               this.f($$2);
            }

            this.dM().a(this, (byte)3);
         }

         this.b(bqa.h);
      }
   }

   protected void f(@Nullable bpp $$0) {
      if (!this.dM().B) {
         boolean $$1 = false;
         if ($$0 instanceof ces) {
            if (this.dM().Z().b(cwx.c)) {
               ib $$2 = this.dm();
               dnb $$3 = dae.cd.o();
               if (this.dM().a_($$2).i() && $$3.a((cxe)this.dM(), $$2)) {
                  this.dM().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               cfe $$4 = new cfe(this.dM(), this.dr(), this.dt(), this.dx(), new cqm(cqp.dv));
               this.dM().b($$4);
            }
         }
      }
   }

   protected void g(bnw $$0) {
      box $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof ciu) {
         $$2 = cux.h((bpp)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.bc > 0;
      if (this.ef() && this.dM().Z().b(cwx.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.eA();
      this.eB();
   }

   protected void eA() {
   }

   protected void eB() {
      if (this.dM() instanceof apf && !this.eF() && (this.eh() || this.bc > 0 && this.ee() && this.dM().Z().b(cwx.f))) {
         bpf.a((apf)this.dM(), this.dk(), this.eg());
      }
   }

   protected void a(bnw $$0, int $$1, boolean $$2) {
   }

   public ajh eC() {
      return this.ai().j();
   }

   public long eD() {
      return 0L;
   }

   protected void a(bnw $$0, boolean $$1) {
      ajh $$2 = this.eC();
      ele $$3 = this.dM().o().aM().getLootTable($$2);
      elc.a $$4 = new elc.a((apf)this.dM()).a(enh.a, this).a(enh.f, this.dk()).a(enh.c, $$0).b(enh.d, $$0.d()).b(enh.e, $$0.c());
      if ($$1 && this.bb != null) {
         $$4 = $$4.a(enh.b, this.bb).a(this.bb.gv());
      }

      elc $$5 = $$4.a(eng.g);
      $$3.a($$5, this.eD(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.g(bqw.n);
      if (!($$0 <= 0.0)) {
         this.au = true;
         ept $$3 = this.dp();
         ept $$4 = new ept($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aC() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected atx d(bnw $$0) {
      return aty.jZ;
   }

   @Nullable
   protected atx n_() {
      return aty.jU;
   }

   private atx d(int $$0) {
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

   protected epo eH() {
      epo $$0 = this.cH();
      box $$1 = this.cZ();
      if ($$1 != null) {
         ept $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public bpp.a eI() {
      return new bpp.a(aty.ka, aty.jS);
   }

   protected atx c(cqm $$0) {
      return $$0.O();
   }

   public atx d(cqm $$0) {
      return $$0.P();
   }

   public Optional<ib> eJ() {
      return this.cg;
   }

   public boolean p_() {
      if (this.N_()) {
         return false;
      } else {
         ib $$0 = this.dm();
         dnb $$1 = this.dn();
         if ($$1.a(aun.aP)) {
            this.cg = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dio && this.c($$0, $$1)) {
            this.cg = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(ib $$0, dnb $$1) {
      if ($$1.c(dio.b)) {
         dnb $$2 = this.dM().a_($$0.d());
         if ($$2.a(dae.cO) && $$2.c(deh.b) == $$1.c(dio.aE)) {
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
      return aww.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bnw $$2) {
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
      if (this.ai().a(auq.o)) {
         return 0;
      } else {
         float $$2 = (float)this.g(bqw.s);
         float $$3 = $$0 - $$2;
         return aww.c((double)($$3 * $$1) * this.g(bqw.i));
      }
   }

   protected void eK() {
      if (!this.aU()) {
         int $$0 = aww.a(this.dr());
         int $$1 = aww.a(this.dt() - 0.2F);
         int $$2 = aww.a(this.dx());
         dnb $$3 = this.dM().a_(new ib($$0, $$1, $$2));
         if (!$$3.i()) {
            dho $$4 = $$3.w();
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
      return aww.a(this.g(bqw.a));
   }

   protected void b(bnw $$0, float $$1) {
   }

   protected void c(bnw $$0, float $$1) {
   }

   protected void v(float $$0) {
   }

   protected float d(bnw $$0, float $$1) {
      if (!$$0.a(aup.c)) {
         this.b($$0, $$1);
         $$1 = bns.a($$1, (float)this.eL(), (float)this.g(bqw.b));
      }

      return $$1;
   }

   protected float e(bnw $$0, float $$1) {
      if ($$0.a(aup.g)) {
         return $$1;
      } else {
         if (this.a(bom.k) && !$$0.a(aup.h)) {
            int $$2 = (this.c(bom.k).d() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof apg) {
                  ((apg)this).a(aui.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof apg) {
                  ((apg)$$0.d()).a(aui.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(aup.i)) {
            return $$1;
         } else {
            int $$7 = cux.a(this.eY(), $$0);
            if ($$7 > 0) {
               $$1 = bns.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bnw $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fp(), 0.0F);
         this.A(this.fp() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof apg $$4) {
            $$4.a(aui.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eM().a($$0, var9);
            this.t(this.ex() - var9);
            this.A(this.fp() - var9);
            this.b(drp.o);
         }
      }
   }

   public bnt eM() {
      return this.bR;
   }

   @Nullable
   public bpp eN() {
      if (this.bb != null) {
         return this.bb;
      } else {
         return this.bY != null ? this.bY : null;
      }
   }

   public final float eO() {
      return (float)this.g(bqw.q);
   }

   public final float eP() {
      return (float)this.g(bqw.p);
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
      if (bol.a(this)) {
         return 6 - (1 + bol.b(this));
      } else {
         return this.a(bom.d) ? 6 + (1 + this.c(bom.d).d()) * 2 : 6;
      }
   }

   public void a(bnc $$0) {
      this.a($$0, false);
   }

   public void a(bnc $$0, boolean $$1) {
      if (!this.aI || this.aK >= this.z() / 2 || this.aK < 0) {
         this.aK = -1;
         this.aI = true;
         this.aJ = $$0;
         if (this.dM() instanceof apf) {
            aap $$2 = new aap(this, $$0 == bnc.a ? 0 : 3);
            apd $$3 = ((apf)this.dM()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bnw $$0) {
      this.aT.a(1.5F);
      this.al = 20;
      this.aO = 10;
      this.aN = this.aO;
      atx $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.fb(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
      }

      this.a(this.dN().n(), 0.0F);
      this.ch = $$0;
      this.ci = this.dM().X();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            atx $$1 = this.n_();
            if ($$1 != null) {
               this.a($$1, this.fb(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof ciu)) {
               this.t(0.0F);
               this.a(this.dN().n());
            }
            break;
         case 29:
            this.a(aty.we, 1.0F, 0.8F + this.dM().z.i() * 0.4F);
            break;
         case 30:
            this.a(aty.wf, 0.8F, 0.8F + this.dM().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ag.i() - 0.5F) * 0.2F;
               float $$6 = (this.ag.i() - 0.5F) * 0.2F;
               float $$7 = (this.ag.i() - 0.5F) * 0.2F;
               double $$8 = aww.d($$4, this.K, this.dr()) + (this.ag.j() - 0.5) * (double)this.dg() * 2.0;
               double $$9 = aww.d($$4, this.L, this.dt()) + this.ag.j() * (double)this.dh();
               double $$10 = aww.d($$4, this.M, this.dx()) + (this.ag.j() - 0.5) * (double)this.dg() * 2.0;
               this.dM().a(kc.aa, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.d(bpe.a));
            break;
         case 48:
            this.i(this.d(bpe.b));
            break;
         case 49:
            this.i(this.d(bpe.f));
            break;
         case 50:
            this.i(this.d(bpe.e));
            break;
         case 51:
            this.i(this.d(bpe.d));
            break;
         case 52:
            this.i(this.d(bpe.c));
            break;
         case 54:
            ddv.b(this);
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
         this.dM().a(kc.Z, this.d(1.0), this.du(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void B() {
      cqm $$0 = this.d(bpe.b);
      this.a(bpe.b, this.d(bpe.a));
      this.a(bpe.a, $$0);
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
   public bqs f(il<bqr> $$0) {
      return this.eT().a($$0);
   }

   public double g(il<bqr> $$0) {
      return this.eT().c($$0);
   }

   public double h(il<bqr> $$0) {
      return this.eT().d($$0);
   }

   public bqt eT() {
      return this.bQ;
   }

   public cqm eU() {
      return this.d(bpe.a);
   }

   public cqm eV() {
      return this.d(bpe.b);
   }

   public boolean b(cqh $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cqm> $$0) {
      return $$0.test(this.eU()) || $$0.test(this.eV());
   }

   public cqm b(bnc $$0) {
      if ($$0 == bnc.a) {
         return this.d(bpe.a);
      } else if ($$0 == bnc.b) {
         return this.d(bpe.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bnc $$0, cqm $$1) {
      if ($$0 == bnc.a) {
         this.a(bpe.a, $$1);
      } else {
         if ($$0 != bnc.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bpe.b, $$1);
      }
   }

   public boolean b(bpe $$0) {
      return !this.d($$0).b();
   }

   public boolean c(bpe $$0) {
      return false;
   }

   public abstract Iterable<cqm> eW();

   public abstract cqm d(bpe var1);

   public abstract void a(bpe var1, cqm var2);

   public Iterable<cqm> eX() {
      return List.of();
   }

   public Iterable<cqm> eY() {
      return this.eW();
   }

   public Iterable<cqm> eZ() {
      return Iterables.concat(this.eX(), this.eY());
   }

   protected void e(cqm $$0) {
      ta $$1 = $$0.w();
      if ($$1 != null) {
         $$0.d().b($$1);
      }
   }

   public float fa() {
      Iterable<cqm> $$0 = this.eW();
      int $$1 = 0;
      int $$2 = 0;

      for (cqm $$3 : $$0) {
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
      bqs $$1 = this.f(bqw.r);
      $$1.b(bE.a());
      if ($$0) {
         $$1.c(bE);
      }
   }

   protected float fb() {
      return 1.0F;
   }

   public float fc() {
      return this.o_() ? (this.ag.i() - this.ag.i()) * 0.2F + 1.5F : (this.ag.i() - this.ag.i()) * 0.2F + 1.0F;
   }

   protected boolean fd() {
      return this.ey();
   }

   @Override
   public void h(box $$0) {
      if (!this.fI()) {
         super.h($$0);
      }
   }

   private void b(box $$0) {
      ept $$1;
      if (this.dH()) {
         $$1 = this.dk();
      } else if (!$$0.dH() && !this.dM().a_($$0.dm()).a(aun.aJ)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dt(), $$0.dt());
         $$1 = new ept(this.dr(), $$2, this.dx());
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
      return (float)this.g(bqw.m) * $$0 * this.aK() + this.ff();
   }

   public float ff() {
      return this.a(bom.h) ? 0.1F * ((float)this.c(bom.h).d() + 1.0F) : 0.0F;
   }

   protected void fg() {
      ept $$0 = this.dp();
      this.o($$0.c, (double)this.fe(), $$0.e);
      if (this.bY()) {
         float $$1 = this.dC() * (float) (Math.PI / 180.0);
         this.g(this.dp().b((double)(-aww.a($$1) * 0.2F), 0.0, (double)(aww.b($$1) * 0.2F)));
      }

      this.au = true;
   }

   protected void fh() {
      this.g(this.dp().b(0.0, -0.04F, 0.0));
   }

   protected void c(avd<eio> $$0) {
      this.g(this.dp().b(0.0, 0.04F, 0.0));
   }

   protected float fi() {
      return 0.8F;
   }

   public boolean a(eip $$0) {
      return false;
   }

   @Override
   protected double aW() {
      return this.g(bqw.l);
   }

   public void a(ept $$0) {
      if (this.cX()) {
         double $$1 = this.aX();
         boolean $$2 = this.dp().d <= 0.0;
         if ($$2 && this.a(bom.B)) {
            $$1 = Math.min($$1, 0.01);
         }

         eip $$3 = this.dM().b_(this.dm());
         if (this.bc() && this.ec() && !this.a($$3)) {
            double $$4 = this.dt();
            float $$5 = this.bY() ? 0.9F : this.fi();
            float $$6 = 0.02F;
            float $$7 = (float)cux.f(this);
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

            if (this.a(bom.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(bpu.a, this.dp());
            ept $$8 = this.dp();
            if (this.P && this.p_()) {
               $$8 = new ept($$8.c, 0.2, $$8.e);
            }

            this.g($$8.d((double)$$5, 0.8F, (double)$$5));
            ept $$9 = this.a($$1, $$2, this.dp());
            this.g($$9);
            if (this.P && this.g($$9.c, $$9.d + 0.6F - this.dt() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bq() && this.ec() && !this.a($$3)) {
            double $$10 = this.dt();
            this.a(0.02F, $$0);
            this.a(bpu.a, this.dp());
            if (this.b(aus.b) <= this.df()) {
               this.g(this.dp().d(0.5, 0.8F, 0.5));
               ept $$11 = this.a($$1, $$2, this.dp());
               this.g($$11);
            } else {
               this.g(this.dp().a(0.5));
            }

            if ($$1 != 0.0) {
               this.g(this.dp().b(0.0, -$$1 / 4.0, 0.0));
            }

            ept $$12 = this.dp();
            if (this.P && this.g($$12.c, $$12.d + 0.6F - this.dt() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fB()) {
            this.cn();
            ept $$13 = this.dp();
            ept $$14 = this.bI();
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
               double $$21 = $$17 * (double)(-aww.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.g($$13.d(0.99F, 0.98F, 0.99F));
            this.a(bpu.a, this.dp());
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
            ept $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.a(bom.y)) {
               $$29 += (0.05 * (double)(this.c(bom.y).d() + 1) - $$28.d) * 0.2;
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

      this.q(this instanceof cbn);
   }

   private void c(ciu $$0, ept $$1) {
      ept $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.cX()) {
         this.y(this.e($$0));
         this.a($$2);
      } else {
         this.q(false);
         this.g(ept.b);
         this.aD();
      }
   }

   protected void a(ciu $$0, ept $$1) {
   }

   protected ept b(ciu $$0, ept $$1) {
      return $$1;
   }

   protected float e(ciu $$0) {
      return this.fk();
   }

   public void q(boolean $$0) {
      float $$1 = (float)aww.g(this.dr() - this.K, $$0 ? this.dt() - this.L : 0.0, this.dx() - this.M);
      this.x($$1);
   }

   protected void x(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aT.a($$1, 0.4F);
   }

   public ept a(ept $$0, float $$1) {
      this.a(this.C($$1), $$0);
      this.g(this.j(this.dp()));
      this.a(bpu.a, this.dp());
      ept $$2 = this.dp();
      if ((this.P || this.bm) && (this.p_() || this.dn().a(dae.qP) && dfv.a(this))) {
         $$2 = new ept($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public ept a(double $$0, boolean $$1, ept $$2) {
      if ($$0 != 0.0 && !this.bY()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new ept($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private ept j(ept $$0) {
      if (this.p_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = aww.a($$0.c, -0.15F, 0.15F);
         double $$3 = aww.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dn().a(dae.nS) && this.fA() && this instanceof ciu) {
            $$4 = 0.0;
         }

         $$0 = new ept($$2, $$4, $$3);
      }

      return $$0;
   }

   private float C(float $$0) {
      return this.aC() ? this.fk() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fj();
   }

   protected float fj() {
      return this.cN() instanceof ciu ? this.fk() * 0.1F : 0.02F;
   }

   public float fk() {
      return this.cc;
   }

   public void y(float $$0) {
      this.cc = $$0;
   }

   public boolean C(box $$0) {
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
         this.m_();
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
         float $$8 = (float)aww.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = aww.e(aww.g(this.dC()) - $$8);
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
      this.dM().ae().a("headTurn");
      $$6 = this.e($$5, $$6);
      this.dM().ae().c();
      this.dM().ae().a("rangeChecks");

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

      this.dM().ae().c();
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
      Map<bpe, cqm> $$0 = this.D();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bpe, cqm> D() {
      Map<bpe, cqm> $$0 = null;

      for (bpe $$1 : bpe.values()) {
         cqm $$2 = switch ($$1.a()) {
            case a -> this.g($$1);
            case b -> this.f($$1);
            case c -> this.bV;
         };
         cqm $$3 = this.d($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bpe.class);
            }

            $$0.put($$1, $$3);
            if (!$$2.b()) {
               this.eT().a($$2.a($$1));
            }

            if (!$$3.b()) {
               this.eT().b($$3.a($$1));
            }
         }
      }

      return $$0;
   }

   public boolean a(cqm $$0, cqm $$1) {
      return !cqm.a($$1, $$0);
   }

   private void a(Map<bpe, cqm> $$0) {
      cqm $$1 = $$0.get(bpe.a);
      cqm $$2 = $$0.get(bpe.b);
      if ($$1 != null && $$2 != null && cqm.a($$1, this.g(bpe.b)) && cqm.a($$2, this.g(bpe.a))) {
         ((apf)this.dM()).l().b(this, new abq(this, (byte)55));
         $$0.remove(bpe.a);
         $$0.remove(bpe.b);
         this.c(bpe.a, $$1.q());
         this.c(bpe.b, $$2.q());
      }
   }

   private void b(Map<bpe, cqm> $$0) {
      List<Pair<bpe, cqm>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cqm $$3 = $$2.q();
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
      ((apf)this.dM()).l().b(this, new adt(this.aj(), $$1));
   }

   private cqm f(bpe $$0) {
      return this.bU.get($$0.b());
   }

   private void b(bpe $$0, cqm $$1) {
      this.bU.set($$0.b(), $$1);
   }

   private cqm g(bpe $$0) {
      return this.bT.get($$0.b());
   }

   private void c(bpe $$0, cqm $$1) {
      this.bT.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = aww.g($$0 - this.aX);
      this.aX += $$2 * 0.3F;
      float $$3 = aww.g(this.dC() - this.aX);
      float $$4 = this.fl();
      if (Math.abs($$3) > $$4) {
         this.aX = this.aX + ($$3 - (float)aww.j((double)$$3) * $$4);
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

   public void m_() {
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

      ept $$0 = this.dp();
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
      this.dM().ae().a("ai");
      if (this.fd()) {
         this.bm = false;
         this.bn = 0.0F;
         this.bp = 0.0F;
      } else if (this.cY()) {
         this.dM().ae().a("newAi");
         this.fn();
         this.dM().ae().c();
      }

      this.dM().ae().c();
      this.dM().ae().a("jump");
      if (this.bm && this.ec()) {
         double $$4;
         if (this.bq()) {
            $$4 = this.b(aus.b);
         } else {
            $$4 = this.b(aus.a);
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
               this.c(aus.b);
            }
         } else {
            this.c(aus.a);
         }
      } else {
         this.cd = 0;
      }

      this.dM().ae().c();
      this.dM().ae().a("travel");
      this.bn *= 0.98F;
      this.bp *= 0.98F;
      this.E();
      epo $$8 = this.cH();
      ept $$9 = new ept((double)this.bn, (double)this.bo, (double)this.bp);
      if (this.a(bom.B) || this.a(bom.y)) {
         this.n();
      }

      label104: {
         if (this.cN() instanceof ciu $$10 && this.bA()) {
            this.c($$10, $$9);
            break label104;
         }

         this.a($$9);
      }

      this.dM().ae().c();
      this.dM().ae().a("freezing");
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

      this.dM().ae().c();
      this.dM().ae().a("push");
      if (this.bB > 0) {
         this.bB--;
         this.a($$8, this.cH());
      }

      this.q();
      this.dM().ae().c();
      if (!this.dM().B && this.fm() && this.be()) {
         this.a(this.dN().h(), 1.0F);
      }
   }

   public boolean fm() {
      return false;
   }

   private void E() {
      boolean $$0 = this.j(7);
      if ($$0 && !this.aC() && !this.bO() && !this.a(bom.y)) {
         cqm $$1 = this.d(bpe.e);
         if ($$1.a(cqp.nS) && cph.d($$1)) {
            $$0 = true;
            int $$2 = this.bA + 1;
            if (!this.dM().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, bpe.e);
               }

               this.b(drp.n);
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
         this.dM().a(drd.a(ciu.class), this.cH(), bpc.a(this)).forEach(this::D);
      } else {
         List<box> $$0 = this.dM().a(this, this.cH(), bpc.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dM().Z().c(cwx.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ag.a(4) == 0) {
               int $$2 = 0;

               for (box $$3 : $$0) {
                  if (!$$3.bO()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dN().g(), 6.0F);
               }
            }

            for (box $$4 : $$0) {
               this.D($$4);
            }
         }
      }
   }

   protected void a(epo $$0, epo $$1) {
      epo $$2 = $$0.b($$1);
      List<box> $$3 = this.dM().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (box $$4 : $$3) {
            if ($$4 instanceof bpp) {
               this.g((bpp)$$4);
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

   protected void D(box $$0) {
      $$0.h(this);
   }

   protected void g(bpp $$0) {
   }

   public boolean fo() {
      return (this.an.a(aE) & 4) != 0;
   }

   @Override
   public void ac() {
      box $$0 = this.cZ();
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

   public void a(cfe $$0) {
      box $$1 = $$0.af_();
      if ($$1 instanceof apg) {
         am.R.a((apg)$$1, $$0.p(), this);
      }
   }

   public void a(box $$0, int $$1) {
      if (!$$0.dH() && !this.dM().B && ($$0 instanceof cfe || $$0 instanceof cja || $$0 instanceof bpf)) {
         ((apf)this.dM()).l().b($$0, new aem($$0.aj(), this.aj(), $$1));
      }
   }

   public boolean E(box $$0) {
      if ($$0.dM() != this.dM()) {
         return false;
      } else {
         ept $$1 = new ept(this.dr(), this.dv(), this.dx());
         ept $$2 = new ept($$0.dr(), $$0.dv(), $$0.dx());
         return $$2.f($$1) > 128.0 ? false : this.dM().a(new cwk($$1, $$2, cwk.a.a, cwk.b.a, this)).c() == epr.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.aZ : aww.i($$0, this.ba, this.aZ);
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
      return this.bA() && !this.N_() && !this.p_();
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
   protected ept a(ih.a $$0, l.a $$1) {
      return i(super.a($$0, $$1));
   }

   public static ept i(ept $$0) {
      return new ept($$0.c, $$0.d, 0.0);
   }

   public float fp() {
      return this.ce;
   }

   public final void A(float $$0) {
      this.B(aww.a($$0, 0.0F, this.eP()));
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

   public abstract bpj fr();

   public boolean fs() {
      return (this.an.a(aE) & 1) > 0;
   }

   public bnc ft() {
      return (this.an.a(aE) & 2) > 0 ? bnc.b : bnc.a;
   }

   private void G() {
      if (this.fs()) {
         if (cqm.b(this.b(this.ft()), this.by)) {
            this.by = this.b(this.ft());
            this.a(this.by);
         } else {
            this.fy();
         }
      }
   }

   protected void a(cqm $$0) {
      $$0.b(this.dM(), this, this.fv());
      if (this.H()) {
         this.b($$0, 5);
      }

      if (--this.bz == 0 && !this.dM().B && !$$0.u()) {
         this.x();
      }
   }

   private boolean H() {
      int $$0 = this.fv();
      cln $$1 = this.by.d().w();
      boolean $$2 = $$1 != null && $$1.e();
      $$2 |= $$0 <= this.by.s() - 7;
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

   public void c(bnc $$0) {
      cqm $$1 = this.b($$0);
      if (!$$1.b() && !this.fs()) {
         this.by = $$1;
         this.bz = $$1.s();
         if (!this.dM().B) {
            this.c(1, true);
            this.c(2, $$0 == bnc.b);
            this.b(drp.D);
         }
      }
   }

   @Override
   public void a(aim<?> $$0) {
      super.a($$0);
      if (bP.equals($$0)) {
         if (this.dM().B) {
            this.fG().ifPresent(this::a);
         }
      } else if (aE.equals($$0) && this.dM().B) {
         if (this.fs() && this.by.b()) {
            this.by = this.b(this.ft());
            if (!this.by.b()) {
               this.bz = this.by.s();
            }
         } else if (!this.fs() && !this.by.b()) {
            this.by = cqm.h;
            this.bz = 0;
         }
      }
   }

   @Override
   public void a(eg.a $$0, ept $$1) {
      super.a($$0, $$1);
      this.ba = this.aZ;
      this.aX = this.aZ;
      this.aY = this.aX;
   }

   protected void b(cqm $$0, int $$1) {
      if (!$$0.b() && this.fs()) {
         if ($$0.t() == csf.c) {
            this.a(this.c($$0), 0.5F, this.dM().z.i() * 0.1F + 0.9F);
         }

         if ($$0.t() == csf.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(cqm $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ept $$3 = new ept(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dE() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dC() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ag.i()) * 0.6 - 0.3;
         ept $$5 = new ept(((double)this.ag.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dE() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dC() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dr(), this.dv(), this.dx());
         this.dM().a(new jy(kc.R, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void x() {
      if (!this.dM().B || this.fs()) {
         bnc $$0 = this.ft();
         if (!this.by.equals(this.b($$0))) {
            this.fx();
         } else {
            if (!this.by.b() && this.fs()) {
               this.b(this.by, 16);
               cqm $$1 = this.by.a(this.dM(), this);
               if ($$1 != this.by) {
                  this.a($$0, $$1);
               }

               this.fy();
            }
         }
      }
   }

   public cqm fu() {
      return this.by;
   }

   public int fv() {
      return this.bz;
   }

   public int fw() {
      return this.fs() ? this.by.s() - this.fv() : 0;
   }

   public void fx() {
      if (!this.by.b()) {
         this.by.a(this.dM(), this, this.fv());
         if (this.by.u()) {
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
            this.b(drp.C);
         }
      }

      this.by = cqm.h;
      this.bz = 0;
   }

   public boolean fz() {
      if (this.fs() && !this.by.b()) {
         cqh $$0 = this.by.d();
         return $$0.c(this.by) != csf.d ? false : $$0.b(this.by) - this.bz >= 5;
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
      return super.ca() || !this.fB() && this.c(bqa.b);
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
      cxb $$10 = this.dM();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.I_()) {
            ib $$12 = $$9.d();
            dnb $$13 = $$10.a_($$12);
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

         if (this instanceof bpx $$14) {
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

   public boolean f(cqm $$0) {
      return false;
   }

   @Override
   public final bpa a(bqa $$0) {
      return $$0 == bqa.c ? aF : this.e($$0).a(this.eb());
   }

   protected bpa e(bqa $$0) {
      return this.ai().n().a(this.ea());
   }

   public ImmutableList<bqa> fF() {
      return ImmutableList.of(bqa.a);
   }

   public epo f(bqa $$0) {
      bpa $$1 = this.a($$0);
      return new epo((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bqa $$0) {
      epo $$1 = this.a($$0).a(this.dk());
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

      dnb $$1 = this.dM().a_($$0);
      if ($$1.b() instanceof czv) {
         this.dM().a($$0, $$1.a(czv.c, Boolean.valueOf(true)), 3);
      }

      this.b(bqa.c);
      this.a($$0);
      this.g($$0);
      this.g(ept.b);
      this.au = true;
   }

   private void a(ib $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean K() {
      return this.fG().map($$0 -> this.dM().a_($$0).b() instanceof czv).orElse(false);
   }

   public void fJ() {
      this.fG().filter(this.dM()::B).ifPresent($$0x -> {
         dnb $$1 = this.dM().a_($$0x);
         if ($$1.b() instanceof czv) {
            ih $$2 = $$1.c(czv.aE);
            this.dM().a($$0x, $$1.a(czv.c, Boolean.valueOf(false)), 3);
            ept $$3 = czv.a(this.ai(), this.dM(), $$0x, $$2, this.dC()).orElseGet(() -> {
               ib $$1x = $$0x.c();
               return new ept((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            ept $$4 = ept.c($$0x).d($$3).d();
            float $$5 = (float)aww.d(aww.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      ept $$0 = this.dk();
      this.b(bqa.a);
      this.a_($$0.c, $$0.d, $$0.e);
      this.fH();
   }

   @Nullable
   public ih fK() {
      ib $$0 = this.fG().orElse(null);
      return $$0 != null ? czv.a(this.dM(), $$0) : null;
   }

   @Override
   public boolean bB() {
      return !this.fI() && super.bB();
   }

   public cqm g(cqm $$0) {
      return cqm.h;
   }

   public cqm a(cxb $$0, cqm $$1) {
      if ($$1.N()) {
         $$0.a(null, this.dr(), this.dt(), this.dx(), this.d($$1), atz.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$1, $$0, this);
         $$1.a(1, this);
         this.b(drp.m);
      }

      return $$1;
   }

   private void a(cqm $$0, cxb $$1, bpp $$2) {
      cqh $$3 = $$0.d();
      if ($$3.v()) {
         for (Pair<bok, Float> $$5 : $$3.w().f()) {
            if (!$$1.B && $$5.getFirst() != null && $$1.z.i() < (Float)$$5.getSecond()) {
               $$2.b(new bok((bok)$$5.getFirst()));
            }
         }
      }
   }

   private static byte h(bpe $$0) {
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

   public void e(bpe $$0) {
      this.dM().a(this, h($$0));
   }

   public static bpe d(bnc $$0) {
      return $$0 == bnc.a ? bpe.a : bpe.b;
   }

   @Override
   public epo h_() {
      if (this.d(bpe.f).a(cqp.uo)) {
         float $$0 = 0.5F;
         return this.cH().c(0.5, 0.5, 0.5);
      } else {
         return super.h_();
      }
   }

   public static bpe h(cqm $$0) {
      cpo $$1 = cpo.c_($$0);
      return $$1 != null ? $$1.i() : bpe.a;
   }

   private static bqg a(bpp $$0, bpe $$1) {
      return $$1 != bpe.f && $$1 != bpe.a && $$1 != bpe.b ? bqg.a($$0, $$1, $$1x -> $$1x.b() || bpr.h($$1x) == $$1) : bqg.a($$0, $$1);
   }

   @Nullable
   private static bpe s(int $$0) {
      if ($$0 == 100 + bpe.f.b()) {
         return bpe.f;
      } else if ($$0 == 100 + bpe.e.b()) {
         return bpe.e;
      } else if ($$0 == 100 + bpe.d.b()) {
         return bpe.d;
      } else if ($$0 == 100 + bpe.c.b()) {
         return bpe.c;
      } else if ($$0 == 98) {
         return bpe.a;
      } else if ($$0 == 99) {
         return bpe.b;
      } else {
         return $$0 == 105 ? bpe.g : null;
      }
   }

   @Override
   public bqg a_(int $$0) {
      bpe $$1 = s($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dA() {
      if (this.N_()) {
         return false;
      } else {
         boolean $$0 = !this.d(bpe.f).a(auv.az) && !this.d(bpe.e).a(auv.az) && !this.d(bpe.d).a(auv.az) && !this.d(bpe.c).a(auv.az);
         return $$0 && super.dA();
      }
   }

   @Override
   public boolean cd() {
      return !this.dM().x_() && this.a(bom.x) || super.cd();
   }

   @Override
   public float dD() {
      return this.aX;
   }

   @Override
   public void a(aan $$0) {
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
      return this.eU().d() instanceof cod;
   }

   @Override
   public float dG() {
      float $$0 = (float)this.g(bqw.v);
      return this.cN() instanceof ciu ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public ept m(box $$0) {
      return this.dk().e(this.a($$0, this.a(this.ap()), this.eb() * this.ea()));
   }

   protected void a(int $$0, double $$1) {
      this.aZ = (float)aww.e(1.0 / (double)$$0, (double)this.aZ, $$1);
   }

   @Override
   public void h(int $$0) {
      super.h(cvi.a(this, $$0));
   }

   public boolean fM() {
      return false;
   }

   public static record a(atx a, atx b) {
   }
}
