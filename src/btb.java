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
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class btb extends bsg implements bsd {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final buh e = new buh(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, buh.a.c);
   public static final int h = 2;
   public static final int i = 4;
   public static final int j = 98;
   public static final int k = 100;
   public static final int l = 105;
   public static final int m = 6;
   public static final int n = 100;
   private static final int bH = 40;
   public static final double o = 0.003;
   public static final double p = 0.08;
   public static final int q = 20;
   private static final int bI = 10;
   private static final int bJ = 2;
   public static final int r = 4;
   public static final float s = 0.42F;
   private static final double bK = 128.0;
   protected static final int t = 1;
   protected static final int u = 2;
   protected static final int v = 4;
   protected static final ajp<Byte> aF = ajt.a(btb.class, ajr.a);
   private static final ajp<Float> bL = ajt.a(btb.class, ajr.d);
   private static final ajp<List<lh>> bM = ajt.a(btb.class, ajr.m);
   private static final ajp<Boolean> bN = ajt.a(btb.class, ajr.k);
   private static final ajp<Integer> bO = ajt.a(btb.class, ajr.b);
   private static final ajp<Integer> bP = ajt.a(btb.class, ajr.b);
   private static final ajp<Optional<ja>> bQ = ajt.a(btb.class, ajr.p);
   private static final int bR = 15;
   protected static final bsj aG = bsj.c(0.2F, 0.2F).b(0.2F);
   public static final float aH = 0.5F;
   public static final float aI = 0.5F;
   private static final float bS = 0.21875F;
   private final bug bT;
   private final bqw bU = new bqw(this);
   private final Map<jj<brm>, bro> bV = Maps.newHashMap();
   private final js<cuc> bW = js.a(2, cuc.l);
   private final js<cuc> bX = js.a(4, cuc.l);
   private cuc bY = cuc.l;
   public boolean aJ;
   private boolean bZ = false;
   public bqf aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public int aQ;
   public float aR;
   public float aS;
   protected int aT;
   public final buc aU = new buc();
   public final int aV = 20;
   public final float aW;
   public final float aX;
   public float aY;
   public float aZ;
   public float ba;
   public float bb;
   @Nullable
   protected cmk bc;
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
   private boolean ca = true;
   @Nullable
   private btb cb;
   private int cc;
   @Nullable
   private btb cd;
   private int ce;
   private float cf;
   private int cg;
   private float ch;
   protected cuc bz = cuc.l;
   protected int bA;
   protected int bB;
   private ja ci;
   private Optional<ja> cj = Optional.empty();
   @Nullable
   private bqz ck;
   private long cl;
   protected int bC;
   protected float bD;
   @Nullable
   protected cuc bE;
   private float cm;
   private float cn;
   protected bud<?> bF;
   private boolean co;
   private final Reference2ObjectMap<czl, Set<dac>> cp = new Reference2ObjectArrayMap();
   protected float bG = 1.0F;

   protected btb(bsm<? extends btb> $$0, dcf $$1) {
      super($$0, $$1);
      this.bT = new bug(buk.a($$0));
      this.u(this.eO());
      this.J = true;
      this.aX = (float)((Math.random() + 1.0) * 0.01F);
      this.au();
      this.aW = (float)Math.random() * 12398.0F;
      this.s((float)(Math.random() * (float) (Math.PI * 2)));
      this.ba = this.dG();
      ul $$2 = ul.a;
      this.bF = this.a(new Dynamic($$2, (uu)$$2.createMap(ImmutableMap.of($$2.a("memories"), (uu)$$2.emptyMap()))));
   }

   public bud<?> dU() {
      return this.bF;
   }

   protected bud.b<?> dV() {
      return bud.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bud<?> a(Dynamic<?> $$0) {
      return this.dV().a($$0);
   }

   @Override
   public void ao() {
      this.a(this.dR().x(), Float.MAX_VALUE);
   }

   public boolean a(bsm<?> $$0) {
      return true;
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(aF, (byte)0);
      $$0.a(bM, List.of());
      $$0.a(bN, false);
      $$0.a(bO, 0);
      $$0.a(bP, 0);
      $$0.a(bL, 1.0F);
      $$0.a(bQ, Optional.empty());
   }

   public static bui.a dW() {
      return bui.a()
         .a(buj.s)
         .a(buj.p)
         .a(buj.v)
         .a(buj.a)
         .a(buj.b)
         .a(buj.r)
         .a(buj.B)
         .a(buj.y)
         .a(buj.n)
         .a(buj.x)
         .a(buj.k)
         .a(buj.o)
         .a(buj.w)
         .a(buj.h)
         .a(buj.i)
         .a(buj.E)
         .a(buj.u)
         .a(buj.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, dsk $$2, ja $$3) {
      if (!this.bf()) {
         this.bn();
      }

      if (this.dQ() instanceof aqm $$4 && $$1 && this.ac > 0.0F) {
         this.a($$4, $$3);
         double $$5 = this.g(buj.x);
         if ((double)this.ac > $$5 && !$$2.i()) {
            double $$6 = this.dv();
            double $$7 = this.dx();
            double $$8 = this.dB();
            ja $$9 = this.dq();
            if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
               double $$10 = $$6 - (double)$$3.u() - 0.5;
               double $$11 = $$8 - (double)$$3.w() - 0.5;
               double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
               $$6 = (double)$$3.u() + 0.5 + $$10 / $$12 * 0.5;
               $$8 = (double)$$3.w() + 0.5 + $$11 / $$12 * 0.5;
            }

            float $$13 = (float)ayg.c((double)this.ac - $$5);
            double $$14 = Math.min((double)(0.2F + $$13 / 15.0F), 2.5);
            int $$15 = (int)(150.0 * $$14);
            ((aqm)this.dQ()).a(new lb(lj.b, $$2), $$6, $$7, $$8, $$15, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cj = Optional.empty();
      }
   }

   public final boolean dX() {
      return this.al().a(awa.m);
   }

   public float a(float $$0) {
      return ayg.i($$0, this.cn, this.cm);
   }

   public boolean dY() {
      return this.dt().b() < 1.0E-5F && this.bj();
   }

   @Override
   public void av() {
      this.aR = this.aS;
      if (this.an) {
         this.fG().ifPresent(this::a);
      }

      if (this.dQ() instanceof aqm $$0) {
         czn.b($$0, this);
      }

      super.av();
      this.dQ().ag().a("livingEntityBaseTick");
      if (this.be() || this.dQ().B) {
         this.aD();
      }

      if (this.bE()) {
         boolean $$1 = this instanceof cmk;
         if (!this.dQ().B) {
            if (this.bF()) {
               this.a(this.dR().g(), 1.0F);
            } else if ($$1 && !this.dQ().C_().a(this.cL())) {
               double $$2 = this.dQ().C_().a(this) + this.dQ().C_().n();
               if ($$2 < 0.0) {
                  double $$3 = this.dQ().C_().o();
                  if ($$3 > 0.0) {
                     this.a(this.dR().w(), (float)Math.max(1, ayg.a(-$$2 * $$3)));
                  }
               }
            }
         }

         if (this.a(awc.a) && !this.dQ().a_(ja.a(this.dv(), this.dz(), this.dB())).a(dfj.nd)) {
            boolean $$4 = !this.dX() && !brp.c(this) && (!$$1 || !((cmk)this).ga().a);
            if ($$4) {
               this.j(this.m(this.cm()));
               if (this.cm() == -20) {
                  this.j(0);
                  ewf $$5 = this.dt();

                  for (int $$6 = 0; $$6 < 8; $$6++) {
                     double $$7 = this.ah.j() - this.ah.j();
                     double $$8 = this.ah.j() - this.ah.j();
                     double $$9 = this.ah.j() - this.ah.j();
                     this.dQ().a(lj.d, this.dv() + $$7, this.dx() + $$8, this.dB() + $$9, $$5.c, $$5.d, $$5.e);
                  }

                  this.a(this.dR().i(), 2.0F);
               }
            }

            if (!this.dQ().B && this.bS() && this.dd() != null && this.dd().bU()) {
               this.ac();
            }
         } else if (this.cm() < this.cl()) {
            this.j(this.n(this.cm()));
         }

         if (this.dQ() instanceof aqm $$10) {
            ja $$11 = this.dq();
            if (!Objects.equal(this.ci, $$11)) {
               this.ci = $$11;
               this.a($$10, $$11);
            }
         }
      }

      if (this.bE() && (this.bh() || this.aB)) {
         this.aI();
      }

      if (this.aO > 0) {
         this.aO--;
      }

      if (this.am > 0 && !(this instanceof aqn)) {
         this.am--;
      }

      if (this.ey() && this.dQ().h(this)) {
         this.ee();
      }

      if (this.bd > 0) {
         this.bd--;
      } else {
         this.bc = null;
      }

      if (this.cd != null && !this.cd.bE()) {
         this.cd = null;
      }

      if (this.cb != null) {
         if (!this.cb.bE()) {
            this.a(null);
         } else if (this.ai - this.cc > 100) {
            this.a(null);
         }
      }

      this.ep();
      this.bj = this.bi;
      this.aZ = this.aY;
      this.bb = this.ba;
      this.O = this.dG();
      this.P = this.dI();
      this.dQ().ag().c();
   }

   @Override
   protected float aO() {
      return ayg.i((float)this.g(buj.u), super.aO(), 1.0F);
   }

   protected void dZ() {
      buf $$0 = this.f(buj.v);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void ea() {
      if (!this.bp().i()) {
         int $$0 = this.cn();
         if ($$0 > 0) {
            buf $$1 = this.f(buj.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.co();
            $$1.c(new buh(d, "Powder snow slow", (double)$$2, buh.a.a));
         }
      }
   }

   protected void a(aqm $$0, ja $$1) {
      czn.a($$0, this);
   }

   public boolean p_() {
      return false;
   }

   public float eb() {
      return this.p_() ? 0.5F : 1.0F;
   }

   public float ec() {
      bug $$0 = this.eT();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(buj.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean ed() {
      return true;
   }

   protected void ee() {
      this.aQ++;
      if (this.aQ >= 20 && !this.dQ().x_() && !this.dL()) {
         this.dQ().a(this, (byte)60);
         this.a(bsg.c.a);
      }
   }

   public boolean ef() {
      return !this.p_();
   }

   protected boolean eg() {
      return !this.p_();
   }

   protected int m(int $$0) {
      buf $$1 = this.f(buj.w);
      double $$2;
      if ($$1 != null) {
         $$2 = $$1.f();
      } else {
         $$2 = 0.0;
      }

      return $$2 > 0.0 && this.ah.j() >= 1.0 / ($$2 + 1.0) ? $$0 : $$0 - 1;
   }

   protected int n(int $$0) {
      return Math.min($$0 + 4, this.cl());
   }

   public final int a(aqm $$0, @Nullable bsg $$1) {
      return czn.a($$0, $$1, this, this.eh());
   }

   protected int eh() {
      return 0;
   }

   protected boolean ei() {
      return false;
   }

   @Nullable
   public btb ej() {
      return this.cb;
   }

   @Override
   public btb T_() {
      return this.ej();
   }

   public int ek() {
      return this.cc;
   }

   public void c(@Nullable cmk $$0) {
      this.bc = $$0;
      this.bd = this.ai;
   }

   public void a(@Nullable btb $$0) {
      this.cb = $$0;
      this.cc = this.ai;
   }

   @Nullable
   public btb el() {
      return this.cd;
   }

   public int em() {
      return this.ce;
   }

   public void A(bsg $$0) {
      if ($$0 instanceof btb) {
         this.cd = (btb)$$0;
      } else {
         this.cd = null;
      }

      this.ce = this.ai;
   }

   public int en() {
      return this.bf;
   }

   public void o(int $$0) {
      this.bf = $$0;
   }

   public boolean eo() {
      return this.bZ;
   }

   public void q(boolean $$0) {
      this.bZ = $$0;
   }

   protected boolean b(bsn $$0) {
      return true;
   }

   public void a(bsn $$0, cuc $$1, cuc $$2) {
      boolean $$3 = $$2.e() && $$1.e();
      if (!$$3 && !cuc.c($$1, $$2) && !this.an) {
         cte $$4 = cte.c_($$2);
         if (!this.dQ().x_() && !this.N_()) {
            if (!this.aX() && $$4 != null && $$4.m() == $$0) {
               this.dQ().a(null, this.dv(), this.dx(), this.dB(), $$4.n(), this.df(), 1.0F, 1.0F, this.ah.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? dxg.v : dxg.S);
            }
         }
      }
   }

   @Override
   public void a(bsg.c $$0) {
      if ($$0 == bsg.c.a || $$0 == bsg.c.b) {
         for (bro $$1 : this.eu()) {
            $$1.a(this, $$0);
         }
      }

      super.a($$0);
      this.bF.a();
   }

   @Override
   public void b(tx $$0) {
      $$0.a("Health", this.ex());
      $$0.a("HurtTime", (short)this.aO);
      $$0.a("HurtByTimestamp", this.cc);
      $$0.a("DeathTime", (short)this.aQ);
      $$0.a("AbsorptionAmount", this.fp());
      $$0.a("Attributes", this.eT().d());
      if (!this.bV.isEmpty()) {
         ud $$1 = new ud();

         for (bro $$2 : this.bV.values()) {
            $$1.add($$2.j());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fB());
      this.fG().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<uu> $$3 = this.bF.a(ul.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(tx $$0) {
      this.C($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dQ() != null && !this.dQ().B) {
         this.eT().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         ud $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tx $$3 = $$1.a($$2);
            bro $$4 = bro.a($$3);
            if ($$4 != null) {
               this.bV.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.u($$0.j("Health"));
      }

      this.aO = $$0.g("HurtTime");
      this.aQ = $$0.g("DeathTime");
      this.cc = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         exj $$6 = this.dQ().M();
         exe $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cB(), $$7);
         if (!$$8) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         ja $$9 = new ja($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$9);
         this.ao.a(at, btn.c);
         if (!this.an) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bF = this.a(new Dynamic(ul.a, $$0.c("Brain")));
      }
   }

   protected void ep() {
      Iterator<jj<brm>> $$0 = this.bV.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            jj<brm> $$1 = $$0.next();
            bro $$2 = this.bV.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dQ().B) {
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
         if (!this.dQ().B) {
            this.J();
            this.v();
         }

         this.ca = false;
      }

      List<lh> $$3 = this.ao.a(bM);
      if (!$$3.isEmpty()) {
         boolean $$4 = this.ao.a(bN);
         int $$5 = this.ci() ? 15 : 4;
         int $$6 = $$4 ? 5 : 1;
         if (this.ah.a($$5 * $$6) == 0) {
            this.dQ().a(ac.a($$3, this.ah), this.d(0.5), this.dy(), this.g(0.5), 1.0, 1.0, 1.0);
         }
      }
   }

   protected void J() {
      if (this.bV.isEmpty()) {
         this.es();
         this.k(false);
      } else {
         this.k(this.b(brq.n));
         this.s();
      }
   }

   private void s() {
      List<lh> $$0 = this.bV.values().stream().filter(bro::g).map(bro::a).toList();
      this.ao.a(bM, $$0);
      this.ao.a(bN, c(this.bV.values()));
   }

   private void v() {
      boolean $$0 = this.ch();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable bsg $$0) {
      double $$1 = 1.0;
      if (this.bZ()) {
         $$1 *= 0.8;
      }

      if (this.ci()) {
         float $$2 = this.fa();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cuc $$3 = this.a(bsn.f);
         bsm<?> $$4 = $$0.al();
         if ($$4 == bsm.aN && $$3.a(cuf.ul)
            || $$4 == bsm.bu && $$3.a(cuf.uo)
            || $$4 == bsm.aA && $$3.a(cuf.ur)
            || $$4 == bsm.aB && $$3.a(cuf.ur)
            || $$4 == bsm.x && $$3.a(cuf.up)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(btb $$0) {
      return $$0 instanceof cmk && this.dQ().al() == bqd.a ? false : $$0.eq();
   }

   public boolean a(btb $$0, cds $$1) {
      return $$1.a(this, $$0);
   }

   public boolean eq() {
      return !this.cv() && this.er();
   }

   public boolean er() {
      return !this.N_() && this.bE();
   }

   public static boolean c(Collection<bro> $$0) {
      for (bro $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void es() {
      this.ao.a(bM, List.of());
   }

   public boolean et() {
      if (this.dQ().B) {
         return false;
      } else {
         Iterator<bro> $$0 = this.bV.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<bro> eu() {
      return this.bV.values();
   }

   public Map<jj<brm>, bro> ev() {
      return this.bV;
   }

   public boolean b(jj<brm> $$0) {
      return this.bV.containsKey($$0);
   }

   @Nullable
   public bro c(jj<brm> $$0) {
      return this.bV.get($$0);
   }

   public final boolean b(bro $$0) {
      return this.b($$0, null);
   }

   public boolean b(bro $$0, @Nullable bsg $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         bro $$2 = this.bV.get($$0.c());
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

   public boolean c(bro $$0) {
      if (this.al().a(awa.G)) {
         return !$$0.a(brq.M);
      } else if (this.al().a(awa.F)) {
         return !$$0.a(brq.L);
      } else {
         return !this.al().a(awa.w) ? true : !$$0.a(brq.j) && !$$0.a(brq.s);
      }
   }

   public void c(bro $$0, @Nullable bsg $$1) {
      if (this.c($$0)) {
         bro $$2 = this.bV.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean ew() {
      return this.al().a(awa.x);
   }

   @Nullable
   public bro d(jj<brm> $$0) {
      return this.bV.remove($$0);
   }

   public boolean e(jj<brm> $$0) {
      bro $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(bro $$0, @Nullable bsg $$1) {
      this.ca = true;
      if (!this.dQ().B) {
         $$0.c().a().a(this.eT(), $$0.e());
         this.d($$0);
      }
   }

   public void d(bro $$0) {
      for (bsg $$1 : this.cT()) {
         if ($$1 instanceof aqn $$2) {
            $$2.c.b(new afu(this.am(), $$0, false));
         }
      }
   }

   protected void a(bro $$0, boolean $$1, @Nullable bsg $$2) {
      this.ca = true;
      if ($$1 && !this.dQ().B) {
         brm $$3 = $$0.c().a();
         $$3.a(this.eT());
         $$3.a(this.eT(), $$0.e());
         this.z();
      }

      if (!this.dQ().B) {
         this.d($$0);
      }
   }

   protected void a(bro $$0) {
      this.ca = true;
      if (!this.dQ().B) {
         $$0.c().a().a(this.eT());
         this.z();

         for (bsg $$1 : this.cT()) {
            if ($$1 instanceof aqn $$2) {
               $$2.c.b(new adz(this.am(), $$0.c()));
            }
         }
      }
   }

   private void z() {
      Set<buf> $$0 = this.eT().b();

      for (buf $$1 : $$0) {
         this.i($$1.a());
      }

      $$0.clear();
   }

   private void i(jj<bue> $$0) {
      if ($$0.a(buj.s)) {
         float $$1 = this.eO();
         if (this.ex() > $$1) {
            this.u($$1);
         }
      } else if ($$0.a(buj.r)) {
         float $$2 = this.eP();
         if (this.fp() > $$2) {
            this.B($$2);
         }
      }
   }

   public void c(float $$0) {
      float $$1 = this.ex();
      if ($$1 > 0.0F) {
         this.u($$1 + $$0);
      }
   }

   public float ex() {
      return this.ao.a(bL);
   }

   public void u(float $$0) {
      this.ao.a(bL, ayg.a($$0, 0.0F, this.eO()));
   }

   public boolean ey() {
      return this.ex() <= 0.0F;
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dQ().B) {
         return false;
      } else if (this.ey()) {
         return false;
      } else if ($$0.a(avy.j) && this.b(brq.l)) {
         return false;
      } else {
         if (this.fI() && !this.dQ().B) {
            this.fJ();
         }

         this.bf = 0;
         float $$2 = $$1;
         boolean $$3 = false;
         float $$4 = 0.0F;
         if ($$1 > 0.0F && this.f($$0)) {
            this.w($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.a(avy.k) && $$0.c() instanceof btb $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(avy.p) && this.al().a(awa.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(avy.a) && !this.a(bsn.f).e()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.aU.a(1.5F);
         boolean $$7 = true;
         if ((float)this.am > 10.0F && !$$0.a(avy.f)) {
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

         bsg $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof btb $$9 && !$$0.a(avy.r) && (!$$0.a(brc.H) || !this.al().a(awa.E))) {
               this.a($$9);
            }

            if ($$8 instanceof cmk $$10) {
               this.bd = 100;
               this.bc = $$10;
            } else if ($$8 instanceof cfu $$11 && $$11.s()) {
               this.bd = 100;
               if ($$11.P_() instanceof cmk $$12) {
                  this.bc = $$12;
               } else {
                  this.bc = null;
               }
            }
         }

         if ($$7) {
            if ($$3) {
               this.dQ().a(this, (byte)29);
            } else {
               this.dQ().a(this, $$0);
            }

            if (!$$0.a(avy.s) && (!$$3 || $$1 > 0.0F)) {
               this.bw();
            }

            if (!$$0.a(avy.A)) {
               double $$13 = 0.0;
               double $$14 = 0.0;
               if ($$0.c() instanceof cnc $$15) {
                  DoubleDoubleImmutablePair $$16 = $$15.a_(this, $$0);
                  $$13 = -$$16.leftDouble();
                  $$14 = -$$16.rightDouble();
               } else if ($$8 != null) {
                  $$13 = $$8.dv() - this.dv();
                  $$14 = $$8.dB() - this.dB();
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

         boolean $$17 = !$$3 || $$1 > 0.0F;
         if ($$17) {
            this.ck = $$0;
            this.cl = this.dQ().Z();

            for (bro $$18 : this.eu()) {
               $$18.a(this, $$0, $$1);
            }
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

         return $$17;
      }
   }

   protected void d(btb $$0) {
      $$0.e(this);
   }

   protected void e(btb $$0) {
      $$0.q(0.5, $$0.dv() - this.dv(), $$0.dB() - this.dB());
   }

   private boolean h(bqz $$0) {
      if ($$0.a(avy.e)) {
         return false;
      } else {
         cuc $$1 = null;

         for (bqf $$2 : bqf.values()) {
            cuc $$3 = this.b($$2);
            if ($$3.a(cuf.vt)) {
               $$1 = $$3.s();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof aqn $$4) {
               $$4.b(avr.c.b(cuf.vt));
               am.C.a($$4, $$1);
               this.a(dxg.C);
            }

            this.u(1.0F);
            this.et();
            this.b(new bro(brq.j, 900, 1));
            this.b(new bro(brq.v, 100, 1));
            this.b(new bro(brq.l, 800, 0));
            this.dQ().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bqz ez() {
      if (this.dQ().Z() - this.cl > 40L) {
         this.ck = null;
      }

      return this.ck;
   }

   protected void e(bqz $$0) {
      this.b(this.d($$0));
   }

   public void b(@Nullable avg $$0) {
      if ($$0 != null) {
         this.a($$0, this.fb(), this.fc());
      }
   }

   public boolean f(bqz $$0) {
      bsg $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cmq $$3 && $$3.D() > 0) {
         $$2 = true;
      }

      if (!$$0.a(avy.d) && this.fz() && !$$2) {
         ewf $$4 = $$0.h();
         if ($$4 != null) {
            ewf $$5 = this.b(0.0F, this.ct());
            ewf $$6 = $$4.a(this.do());
            $$6 = new ewf($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(cuc $$0) {
      if (!$$0.e()) {
         if (!this.aX()) {
            this.dQ().a(this.dv(), this.dx(), this.dB(), $$0.K(), this.df(), 0.8F, 0.8F + this.dQ().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bqz $$0) {
      if (!this.dL() && !this.be) {
         bsg $$1 = $$0.d();
         btb $$2 = this.eN();
         if (this.bl >= 0 && $$2 != null) {
            $$2.a(this, this.bl, $$0);
         }

         if (this.fI()) {
            this.fJ();
         }

         if (!this.dQ().B && this.ah()) {
            b.info("Named entity {} died: {}", this, this.eM().a().getString());
         }

         this.be = true;
         this.eM().c();
         if (this.dQ() instanceof aqm $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(dxg.p);
               this.g($$0);
               this.f($$2);
            }

            this.dQ().a(this, (byte)3);
         }

         this.b(btn.h);
      }
   }

   protected void f(@Nullable btb $$0) {
      if (!this.dQ().B) {
         boolean $$1 = false;
         if ($$0 instanceof cih) {
            if (this.dQ().ab().b(dcb.c)) {
               ja $$2 = this.dq();
               dsk $$3 = dfj.cd.o();
               if (this.dQ().a_($$2).i() && $$3.a((dci)this.dQ(), $$2)) {
                  this.dQ().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               ciu $$4 = new ciu(this.dQ(), this.dv(), this.dx(), this.dB(), new cuc(cuf.dw));
               this.dQ().b($$4);
            }
         }
      }
   }

   protected void g(bqz $$0) {
      boolean $$1 = this.bd > 0;
      if (this.eg() && this.dQ().ab().b(dcb.f)) {
         this.b($$0, $$1);
         this.a($$0, $$1);
      }

      this.eA();
      this.C($$0.d());
   }

   protected void eA() {
   }

   protected void C(@Nullable bsg $$0) {
      if (this.dQ() instanceof aqm $$1 && !this.eE() && (this.ei() || this.bd > 0 && this.ef() && this.dQ().ab().b(dcb.f))) {
         bsr.a($$1, this.do(), this.a($$1, $$0));
      }
   }

   protected void a(bqz $$0, boolean $$1) {
   }

   public akj<eqz> eB() {
      return this.al().k();
   }

   public long eC() {
      return 0L;
   }

   protected float a(bsg $$0, bqz $$1) {
      float $$2 = (float)this.g(buj.d);
      return this.dQ() instanceof aqm $$3 ? czn.d($$3, this.eU(), $$0, $$1, $$2) : $$2;
   }

   protected void b(bqz $$0, boolean $$1) {
      akj<eqz> $$2 = this.eB();
      eqz $$3 = this.dQ().o().bf().b($$2);
      eqx.a $$4 = new eqx.a((aqm)this.dQ()).a(etq.a, this).a(etq.f, this.do()).a(etq.c, $$0).b(etq.d, $$0.d()).b(etq.e, $$0.c());
      if ($$1 && this.bc != null) {
         $$4 = $$4.a(etq.b, this.bc).a(this.bc.gv());
      }

      eqx $$5 = $$4.a(etp.g);
      $$3.a($$5, this.eC(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.g(buj.p);
      if (!($$0 <= 0.0)) {
         this.av = true;
         ewf $$3 = this.dt();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         ewf $$4 = new ewf($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aF() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected avg d(bqz $$0) {
      return avh.kg;
   }

   @Nullable
   protected avg o_() {
      return avh.kb;
   }

   private avg d(int $$0) {
      return $$0 > 4 ? this.eI().b() : this.eI().a();
   }

   public void eD() {
      this.co = true;
   }

   public boolean eE() {
      return this.co;
   }

   public float eF() {
      return 0.0F;
   }

   protected ewa eG() {
      ewa $$0 = this.cL();
      bsg $$1 = this.dd();
      if ($$1 != null) {
         ewf $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<czl, Set<dac>> eH() {
      return this.cp;
   }

   public btb.a eI() {
      return new btb.a(avh.kh, avh.jZ);
   }

   protected avg c(cuc $$0) {
      return $$0.I();
   }

   public avg d(cuc $$0) {
      return $$0.J();
   }

   public Optional<ja> eJ() {
      return this.cj;
   }

   public boolean q_() {
      if (this.N_()) {
         return false;
      } else {
         ja $$0 = this.dq();
         dsk $$1 = this.dr();
         if ($$1.a(avw.aP)) {
            this.cj = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dnu && this.c($$0, $$1)) {
            this.cj = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(ja $$0, dsk $$1) {
      if ($$1.c(dnu.b)) {
         dsk $$2 = this.dQ().a_($$0.d());
         if ($$2.a(dfj.cO) && $$2.c(djn.b) == $$1.c(dnu.aE)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean bE() {
      return !this.dL() && this.ex() > 0.0F;
   }

   @Override
   public int cy() {
      return this.v(0.0F);
   }

   protected final int v(float $$0) {
      return ayg.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bqz $$2) {
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
      if (this.al().a(awa.o)) {
         return 0;
      } else {
         float $$2 = (float)this.g(buj.x);
         float $$3 = $$0 - $$2;
         return ayg.c((double)($$3 * $$1) * this.g(buj.k));
      }
   }

   protected void eK() {
      if (!this.aX()) {
         int $$0 = ayg.a(this.dv());
         int $$1 = ayg.a(this.dx() - 0.2F);
         int $$2 = ayg.a(this.dB());
         dsk $$3 = this.dQ().a_(new ja($$0, $$1, $$2));
         if (!$$3.i()) {
            dmu $$4 = $$3.w();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void n(float $$0) {
      this.aP = 10;
      this.aO = this.aP;
   }

   public int eL() {
      return ayg.a(this.g(buj.a));
   }

   protected void b(bqz $$0, float $$1) {
   }

   protected void c(bqz $$0, float $$1) {
   }

   protected void w(float $$0) {
   }

   protected void a(bqz $$0, float $$1, bsn... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bsn $$4 : $$2) {
            cuc $$5 = this.a($$4);
            if ($$5.g() instanceof crs && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float d(bqz $$0, float $$1) {
      if (!$$0.a(avy.c)) {
         this.b($$0, $$1);
         $$1 = bqv.a(this, $$1, $$0, (float)this.eL(), (float)this.g(buj.b));
      }

      return $$1;
   }

   protected float e(bqz $$0, float $$1) {
      if ($$0.a(avy.g)) {
         return $$1;
      } else {
         if (this.b(brq.k) && !$$0.a(avy.h)) {
            int $$2 = (this.c(brq.k).e() + 1) * 5;
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
            float $$8;
            if (this.dQ() instanceof aqm $$7) {
               $$8 = czn.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = bqv.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void f(bqz $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fp(), 0.0F);
         this.B(this.fp() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof aqn $$4) {
            $$4.a(avr.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eM().a($$0, var9);
            this.u(this.ex() - var9);
            this.B(this.fp() - var9);
            this.a(dxg.o);
         }
      }
   }

   public bqw eM() {
      return this.bU;
   }

   @Nullable
   public btb eN() {
      if (this.bc != null) {
         return this.bc;
      } else {
         return this.cb != null ? this.cb : null;
      }
   }

   public final float eO() {
      return (float)this.g(buj.s);
   }

   public final float eP() {
      return (float)this.g(buj.r);
   }

   public final int eQ() {
      return this.ao.a(bO);
   }

   public final void p(int $$0) {
      this.ao.a(bO, $$0);
   }

   public final int eR() {
      return this.ao.a(bP);
   }

   public final void q(int $$0) {
      this.ao.a(bP, $$0);
   }

   private int A() {
      if (brp.a(this)) {
         return 6 - (1 + brp.b(this));
      } else {
         return this.b(brq.d) ? 6 + (1 + this.c(brq.d).e()) * 2 : 6;
      }
   }

   public void a(bqf $$0) {
      this.a($$0, false);
   }

   public void a(bqf $$0, boolean $$1) {
      if (!this.aJ || this.aL >= this.A() / 2 || this.aL < 0) {
         this.aL = -1;
         this.aJ = true;
         this.aK = $$0;
         if (this.dQ() instanceof aqm) {
            abq $$2 = new abq(this, $$0 == bqf.a ? 0 : 3);
            aqk $$3 = ((aqm)this.dQ()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bqz $$0) {
      this.aU.a(1.5F);
      this.am = 20;
      this.aP = 10;
      this.aO = this.aP;
      avg $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.fb(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
      }

      this.a(this.dR().o(), 0.0F);
      this.ck = $$0;
      this.cl = this.dQ().Z();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            avg $$1 = this.o_();
            if ($$1 != null) {
               this.a($$1, this.fb(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cmk)) {
               this.u(0.0F);
               this.a(this.dR().o());
            }
            break;
         case 29:
            this.a(avh.wD, 1.0F, 0.8F + this.dQ().z.i() * 0.4F);
            break;
         case 30:
            this.a(avh.wE, 0.8F, 0.8F + this.dQ().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ah.i() - 0.5F) * 0.2F;
               float $$6 = (this.ah.i() - 0.5F) * 0.2F;
               float $$7 = (this.ah.i() - 0.5F) * 0.2F;
               double $$8 = ayg.d($$4, this.L, this.dv()) + (this.ah.j() - 0.5) * (double)this.dk() * 2.0;
               double $$9 = ayg.d($$4, this.M, this.dx()) + this.ah.j() * (double)this.dl();
               double $$10 = ayg.d($$4, this.N, this.dB()) + (this.ah.j() - 0.5) * (double)this.dk() * 2.0;
               this.dQ().a(lj.ac, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.a(bsn.a));
            break;
         case 48:
            this.i(this.a(bsn.b));
            break;
         case 49:
            this.i(this.a(bsn.f));
            break;
         case 50:
            this.i(this.a(bsn.e));
            break;
         case 51:
            this.i(this.a(bsn.d));
            break;
         case 52:
            this.i(this.a(bsn.c));
            break;
         case 54:
            djb.b(this);
            break;
         case 55:
            this.C();
            break;
         case 60:
            this.B();
            break;
         case 65:
            this.i(this.a(bsn.g));
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
         this.dQ().a(lj.ab, this.d(1.0), this.dy(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void C() {
      cuc $$0 = this.a(bsn.b);
      this.a(bsn.b, this.a(bsn.a));
      this.a(bsn.a, $$0);
   }

   @Override
   protected void aE() {
      this.a(this.dR().n(), 4.0F);
   }

   protected void eS() {
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
   public buf f(jj<bue> $$0) {
      return this.eT().a($$0);
   }

   public double g(jj<bue> $$0) {
      return this.eT().c($$0);
   }

   public double h(jj<bue> $$0) {
      return this.eT().d($$0);
   }

   public bug eT() {
      return this.bT;
   }

   public cuc eU() {
      return this.a(bsn.a);
   }

   public cuc eV() {
      return this.a(bsn.b);
   }

   public boolean b(ctx $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cuc> $$0) {
      return $$0.test(this.eU()) || $$0.test(this.eV());
   }

   public cuc b(bqf $$0) {
      if ($$0 == bqf.a) {
         return this.a(bsn.a);
      } else if ($$0 == bqf.b) {
         return this.a(bsn.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bqf $$0, cuc $$1) {
      if ($$0 == bqf.a) {
         this.a(bsn.a, $$1);
      } else {
         if ($$0 != bqf.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bsn.b, $$1);
      }
   }

   public boolean c(bsn $$0) {
      return !this.a($$0).e();
   }

   public boolean d(bsn $$0) {
      return false;
   }

   public abstract Iterable<cuc> eW();

   public abstract cuc a(bsn var1);

   public abstract void a(bsn var1, cuc var2);

   public Iterable<cuc> eX() {
      return List.of();
   }

   public Iterable<cuc> eY() {
      return this.eW();
   }

   public Iterable<cuc> eZ() {
      return Iterables.concat(this.eX(), this.eY());
   }

   protected void e(cuc $$0) {
      $$0.g().m($$0);
   }

   public float fa() {
      Iterable<cuc> $$0 = this.eW();
      int $$1 = 0;
      int $$2 = 0;

      for (cuc $$3 : $$0) {
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
      buf $$1 = this.f(buj.v);
      $$1.b(e.b());
      if ($$0) {
         $$1.c(e);
      }
   }

   protected float fb() {
      return 1.0F;
   }

   public float fc() {
      return this.p_() ? (this.ah.i() - this.ah.i()) * 0.2F + 1.5F : (this.ah.i() - this.ah.i()) * 0.2F + 1.0F;
   }

   protected boolean fd() {
      return this.ey();
   }

   @Override
   public void h(bsg $$0) {
      if (!this.fI()) {
         super.h($$0);
      }
   }

   private void b(bsg $$0) {
      ewf $$1;
      if (this.dL()) {
         $$1 = this.do();
      } else if (!$$0.dL() && !this.dQ().a_($$0.dq()).a(avw.aJ)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dx(), $$0.dx());
         $$1 = new ewf(this.dv(), $$2, this.dB());
      }

      this.a($$1.c, $$1.d, $$1.e);
   }

   @Override
   public boolean cG() {
      return this.cF();
   }

   protected float fe() {
      return this.x(1.0F);
   }

   protected float x(float $$0) {
      return (float)this.g(buj.o) * $$0 * this.aN() + this.ff();
   }

   public float ff() {
      return this.b(brq.h) ? 0.1F * ((float)this.c(brq.h).e() + 1.0F) : 0.0F;
   }

   protected void fg() {
      float $$0 = this.fe();
      if (!($$0 <= 1.0E-5F)) {
         ewf $$1 = this.dt();
         this.o($$1.c, (double)$$0, $$1.e);
         if (this.cc()) {
            float $$2 = this.dG() * (float) (Math.PI / 180.0);
            this.j(new ewf((double)(-ayg.a($$2)) * 0.2, 0.0, (double)ayg.b($$2) * 0.2));
         }

         this.av = true;
      }
   }

   protected void fh() {
      this.i(this.dt().b(0.0, -0.04F, 0.0));
   }

   protected void c(awm<eog> $$0) {
      this.i(this.dt().b(0.0, 0.04F, 0.0));
   }

   protected float fi() {
      return 0.8F;
   }

   public boolean a(eoh $$0) {
      return false;
   }

   @Override
   protected double aZ() {
      return this.g(buj.n);
   }

   public void a(ewf $$0) {
      if (this.db()) {
         double $$1 = this.ba();
         boolean $$2 = this.dt().d <= 0.0;
         if ($$2 && this.b(brq.B)) {
            $$1 = Math.min($$1, 0.01);
         }

         eoh $$3 = this.dQ().b_(this.dq());
         if (this.bf() && this.ed() && !this.a($$3)) {
            double $$4 = this.dx();
            float $$5 = this.cc() ? 0.9F : this.fi();
            float $$6 = 0.02F;
            float $$7 = (float)this.g(buj.E);
            if (!this.aF()) {
               $$7 *= 0.5F;
            }

            if ($$7 > 0.0F) {
               $$5 += (0.54600006F - $$5) * $$7;
               $$6 += (this.fk() - $$6) * $$7;
            }

            if (this.b(brq.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(btg.a, this.dt());
            ewf $$8 = this.dt();
            if (this.Q && this.q_()) {
               $$8 = new ewf($$8.c, 0.2, $$8.e);
            }

            this.i($$8.d((double)$$5, 0.8F, (double)$$5));
            ewf $$9 = this.a($$1, $$2, this.dt());
            this.i($$9);
            if (this.Q && this.g($$9.c, $$9.d + 0.6F - this.dx() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bt() && this.ed() && !this.a($$3)) {
            double $$10 = this.dx();
            this.a(0.02F, $$0);
            this.a(btg.a, this.dt());
            if (this.b(awc.b) <= this.dj()) {
               this.i(this.dt().d(0.5, 0.8F, 0.5));
               ewf $$11 = this.a($$1, $$2, this.dt());
               this.i($$11);
            } else {
               this.i(this.dt().a(0.5));
            }

            if ($$1 != 0.0) {
               this.i(this.dt().b(0.0, -$$1 / 4.0, 0.0));
            }

            ewf $$12 = this.dt();
            if (this.Q && this.g($$12.c, $$12.d + 0.6F - this.dx() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fB()) {
            this.cr();
            ewf $$13 = this.dt();
            ewf $$14 = this.bM();
            float $$15 = this.dI() * (float) (Math.PI / 180.0);
            double $$16 = Math.sqrt($$14.c * $$14.c + $$14.e * $$14.e);
            double $$17 = $$13.h();
            double $$18 = $$14.f();
            double $$19 = Math.cos((double)$$15);
            $$19 = $$19 * $$19 * Math.min(1.0, $$18 / 0.4);
            $$13 = this.dt().b(0.0, $$1 * (-1.0 + $$19 * 0.75), 0.0);
            if ($$13.d < 0.0 && $$16 > 0.0) {
               double $$20 = $$13.d * -0.1 * $$19;
               $$13 = $$13.b($$14.c * $$20 / $$16, $$20, $$14.e * $$20 / $$16);
            }

            if ($$15 < 0.0F && $$16 > 0.0) {
               double $$21 = $$17 * (double)(-ayg.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.i($$13.d(0.99F, 0.98F, 0.99F));
            this.a(btg.a, this.dt());
            if (this.Q && !this.dQ().B) {
               double $$22 = this.dt().h();
               double $$23 = $$17 - $$22;
               float $$24 = (float)($$23 * 10.0 - 3.0);
               if ($$24 > 0.0F) {
                  this.a(this.d((int)$$24), 1.0F, 1.0F);
                  this.a(this.dR().m(), $$24);
               }
            }

            if (this.aF() && !this.dQ().B) {
               this.b(7, false);
            }
         } else {
            ja $$25 = this.aL();
            float $$26 = this.dQ().a_($$25).b().h();
            float $$27 = this.aF() ? $$26 * 0.91F : 0.91F;
            ewf $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.b(brq.y)) {
               $$29 += (0.05 * (double)(this.c(brq.y).e() + 1) - $$28.d) * 0.2;
            } else if (!this.dQ().B || this.dQ().B($$25)) {
               $$29 -= $$1;
            } else if (this.dx() > (double)this.dQ().I_()) {
               $$29 = -0.1;
            } else {
               $$29 = 0.0;
            }

            if (this.eo()) {
               this.o($$28.c, $$29, $$28.e);
            } else {
               this.o($$28.c * (double)$$27, this instanceof cfa ? $$29 * (double)$$27 : $$29 * 0.98F, $$28.e * (double)$$27);
            }
         }
      }

      this.r(this instanceof cfa);
   }

   private void c(cmk $$0, ewf $$1) {
      ewf $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.db()) {
         this.z(this.e($$0));
         this.a($$2);
      } else {
         this.r(false);
         this.i(ewf.b);
         this.aG();
      }
   }

   protected void a(cmk $$0, ewf $$1) {
   }

   protected ewf b(cmk $$0, ewf $$1) {
      return $$1;
   }

   protected float e(cmk $$0) {
      return this.fk();
   }

   public void r(boolean $$0) {
      float $$1 = (float)ayg.g(this.dv() - this.L, $$0 ? this.dx() - this.M : 0.0, this.dB() - this.N);
      this.y($$1);
   }

   protected void y(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aU.a($$1, 0.4F);
   }

   public ewf a(ewf $$0, float $$1) {
      this.a(this.D($$1), $$0);
      this.i(this.l(this.dt()));
      this.a(btg.a, this.dt());
      ewf $$2 = this.dt();
      if ((this.Q || this.bn) && (this.q_() || this.dr().a(dfj.qP) && dlb.a(this))) {
         $$2 = new ewf($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public ewf a(double $$0, boolean $$1, ewf $$2) {
      if ($$0 != 0.0 && !this.cc()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new ewf($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private ewf l(ewf $$0) {
      if (this.q_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = ayg.a($$0.c, -0.15F, 0.15F);
         double $$3 = ayg.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dr().a(dfj.nS) && this.fA() && this instanceof cmk) {
            $$4 = 0.0;
         }

         $$0 = new ewf($$2, $$4, $$3);
      }

      return $$0;
   }

   private float D(float $$0) {
      return this.aF() ? this.fk() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fj();
   }

   protected float fj() {
      return this.cR() instanceof cmk ? this.fk() * 0.1F : 0.02F;
   }

   public float fk() {
      return this.cf;
   }

   public void z(float $$0) {
      this.cf = $$0;
   }

   public boolean D(bsg $$0) {
      this.A($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.H();
      this.K();
      if (!this.dQ().B) {
         int $$0 = this.eQ();
         if ($$0 > 0) {
            if (this.aM <= 0) {
               this.aM = 20 * (30 - $$0);
            }

            this.aM--;
            if (this.aM <= 0) {
               this.p($$0 - 1);
            }
         }

         int $$1 = this.eR();
         if ($$1 > 0) {
            if (this.aN <= 0) {
               this.aN = 20 * (30 - $$1);
            }

            this.aN--;
            if (this.aN <= 0) {
               this.q($$1 - 1);
            }
         }

         this.D();
         if (this.ai % 20 == 0) {
            this.eM().c();
         }

         if (this.fI() && !this.M()) {
            this.fJ();
         }
      }

      if (!this.dL()) {
         this.n_();
      }

      double $$2 = this.dv() - this.L;
      double $$3 = this.dB() - this.N;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aY;
      float $$6 = 0.0F;
      this.bg = this.bh;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)ayg.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = ayg.e(ayg.g(this.dG()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aS > 0.0F) {
         $$5 = this.dG();
      }

      if (!this.aF()) {
         $$7 = 0.0F;
      }

      this.bh = this.bh + ($$7 - this.bh) * 0.3F;
      this.dQ().ag().a("headTurn");
      $$6 = this.e($$5, $$6);
      this.dQ().ag().c();
      this.dQ().ag().a("rangeChecks");

      while (this.dG() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dG() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aY - this.aZ < -180.0F) {
         this.aZ -= 360.0F;
      }

      while (this.aY - this.aZ >= 180.0F) {
         this.aZ += 360.0F;
      }

      while (this.dI() - this.P < -180.0F) {
         this.P -= 360.0F;
      }

      while (this.dI() - this.P >= 180.0F) {
         this.P += 360.0F;
      }

      while (this.ba - this.bb < -180.0F) {
         this.bb -= 360.0F;
      }

      while (this.ba - this.bb >= 180.0F) {
         this.bb += 360.0F;
      }

      this.dQ().ag().c();
      this.bi += $$6;
      if (this.fB()) {
         this.bB++;
      } else {
         this.bB = 0;
      }

      if (this.fI()) {
         this.t(0.0F);
      }

      this.z();
      float $$10 = this.ec();
      if ($$10 != this.bG) {
         this.bG = $$10;
         this.j_();
      }
   }

   private void D() {
      Map<bsn, cuc> $$0 = this.E();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bsn, cuc> E() {
      Map<bsn, cuc> $$0 = null;

      for (bsn $$1 : bsn.values()) {
         cuc $$2 = switch ($$1.a()) {
            case a -> this.g($$1);
            case b -> this.f($$1);
            case c -> this.bY;
         };
         cuc $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bsn.class);
            }

            $$0.put($$1, $$3);
            bug $$4 = this.eT();
            if (!$$2.e()) {
               $$2.a($$1, ($$3x, $$4x) -> {
                  buf $$5 = $$4.a($$3x);
                  if ($$5 != null) {
                     $$5.e($$4x);
                  }

                  czn.a($$2, this, $$1);
               });
            }

            if (!$$3.e()) {
               $$3.a($$1, ($$3x, $$4x) -> {
                  buf $$5 = $$4.a($$3x);
                  if ($$5 != null) {
                     $$5.b($$4x.b());
                     $$5.c($$4x);
                  }

                  if (this.dQ() instanceof aqm $$7) {
                     czn.a($$7, $$3, this, $$1);
                  }
               });
            }
         }
      }

      return $$0;
   }

   public boolean a(cuc $$0, cuc $$1) {
      return !cuc.a($$1, $$0);
   }

   private void a(Map<bsn, cuc> $$0) {
      cuc $$1 = $$0.get(bsn.a);
      cuc $$2 = $$0.get(bsn.b);
      if ($$1 != null && $$2 != null && cuc.a($$1, this.g(bsn.b)) && cuc.a($$2, this.g(bsn.a))) {
         ((aqm)this.dQ()).l().b(this, new acr(this, (byte)55));
         $$0.remove(bsn.a);
         $$0.remove(bsn.b);
         this.c(bsn.a, $$1.s());
         this.c(bsn.b, $$2.s());
      }
   }

   private void b(Map<bsn, cuc> $$0) {
      List<Pair<bsn, cuc>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cuc $$3 = $$2.s();
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
      ((aqm)this.dQ()).l().b(this, new aev(this.am(), $$1));
   }

   private cuc f(bsn $$0) {
      return this.bX.get($$0.b());
   }

   private void b(bsn $$0, cuc $$1) {
      this.bX.set($$0.b(), $$1);
   }

   private cuc g(bsn $$0) {
      return this.bW.get($$0.b());
   }

   private void c(bsn $$0, cuc $$1) {
      this.bW.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = ayg.g($$0 - this.aY);
      this.aY += $$2 * 0.3F;
      float $$3 = ayg.g(this.dG() - this.aY);
      float $$4 = this.fl();
      if (Math.abs($$3) > $$4) {
         this.aY = this.aY + ($$3 - (float)ayg.j((double)$$3) * $$4);
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
      if (this.cg > 0) {
         this.cg--;
      }

      if (this.db()) {
         this.br = 0;
         this.f(this.dv(), this.dx(), this.dB());
      }

      if (this.br > 0) {
         this.a(this.br, this.bs, this.bt, this.bu, this.bv, this.bw);
         this.br--;
      } else if (!this.dc()) {
         this.i(this.dt().a(0.98));
      }

      if (this.by > 0) {
         this.a(this.by, this.bx);
         this.by--;
      }

      ewf $$0 = this.dt();
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
      this.dQ().ag().a("ai");
      if (this.fd()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      } else if (this.dc()) {
         this.dQ().ag().a("newAi");
         this.fn();
         this.dQ().ag().c();
      }

      this.dQ().ag().c();
      this.dQ().ag().a("jump");
      if (this.bn && this.ed()) {
         double $$4;
         if (this.bt()) {
            $$4 = this.b(awc.b);
         } else {
            $$4 = this.b(awc.a);
         }

         boolean $$6 = this.bf() && $$4 > 0.0;
         double $$7 = this.dj();
         if (!$$6 || this.aF() && !($$4 > $$7)) {
            if (!this.bt() || this.aF() && !($$4 > $$7)) {
               if ((this.aF() || $$6 && $$4 <= $$7) && this.cg == 0) {
                  this.fg();
                  this.cg = 10;
               }
            } else {
               this.c(awc.b);
            }
         } else {
            this.c(awc.a);
         }
      } else {
         this.cg = 0;
      }

      this.dQ().ag().c();
      this.dQ().ag().a("travel");
      this.bo *= 0.98F;
      this.bq *= 0.98F;
      this.G();
      ewa $$8 = this.cL();
      ewf $$9 = new ewf((double)this.bo, (double)this.bp, (double)this.bq);
      if (this.b(brq.B) || this.b(brq.y)) {
         this.n();
      }

      label104: {
         if (this.cR() instanceof cmk $$10 && this.bE()) {
            this.c($$10, $$9);
            break label104;
         }

         this.a($$9);
      }

      this.dQ().ag().c();
      this.dQ().ag().a("freezing");
      if (!this.dQ().B && !this.ey()) {
         int $$11 = this.cn();
         if (this.aB && this.dE()) {
            this.k(Math.min(this.cq(), $$11 + 1));
         } else {
            this.k(Math.max(0, $$11 - 2));
         }
      }

      this.dZ();
      this.ea();
      if (!this.dQ().B && this.ai % 40 == 0 && this.cp() && this.dE()) {
         this.a(this.dR().u(), 1.0F);
      }

      this.dQ().ag().c();
      this.dQ().ag().a("push");
      if (this.bC > 0) {
         this.bC--;
         this.a($$8, this.cL());
      }

      this.q();
      this.dQ().ag().c();
      if (!this.dQ().B && this.fm() && this.bh()) {
         this.a(this.dR().i(), 1.0F);
      }
   }

   public boolean fm() {
      return false;
   }

   private void G() {
      boolean $$0 = this.i(7);
      if ($$0 && !this.aF() && !this.bS() && !this.b(brq.y)) {
         cuc $$1 = this.a(bsn.e);
         if ($$1.a(cuf.nT) && csy.i($$1)) {
            $$0 = true;
            int $$2 = this.bB + 1;
            if (!this.dQ().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, bsn.e);
               }

               this.a(dxg.n);
            }
         } else {
            $$0 = false;
         }
      } else {
         $$0 = false;
      }

      if (!this.dQ().B) {
         this.b(7, $$0);
      }
   }

   protected void fn() {
   }

   protected void q() {
      if (this.dQ().x_()) {
         this.dQ().a(dwu.a(cmk.class), this.cL(), bsl.a(this)).forEach(this::E);
      } else {
         List<bsg> $$0 = this.dQ().a(this, this.cL(), bsl.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dQ().ab().c(dcb.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ah.a(4) == 0) {
               int $$2 = 0;

               for (bsg $$3 : $$0) {
                  if (!$$3.bS()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dR().h(), 6.0F);
               }
            }

            for (bsg $$4 : $$0) {
               this.E($$4);
            }
         }
      }
   }

   protected void a(ewa $$0, ewa $$1) {
      ewa $$2 = $$0.b($$1);
      List<bsg> $$3 = this.dQ().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bsg $$4 : $$3) {
            if ($$4 instanceof btb) {
               this.g((btb)$$4);
               this.bC = 0;
               this.i(this.dt().a(-0.2));
               break;
            }
         }
      } else if (this.Q) {
         this.bC = 0;
      }

      if (!this.dQ().B && this.bC <= 0) {
         this.c(4, false);
         this.bD = 0.0F;
         this.bE = null;
      }
   }

   protected void E(bsg $$0) {
      $$0.h(this);
   }

   protected void g(btb $$0) {
   }

   public boolean fo() {
      return (this.ao.a(aF) & 4) != 0;
   }

   @Override
   public void ac() {
      bsg $$0 = this.dd();
      super.ac();
      if ($$0 != null && $$0 != this.dd() && !this.dQ().B) {
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
      return this.br > 0 ? this.bs : this.dv();
   }

   @Override
   public double d_() {
      return this.br > 0 ? this.bt : this.dx();
   }

   @Override
   public double L_() {
      return this.br > 0 ? this.bu : this.dB();
   }

   @Override
   public float M_() {
      return this.br > 0 ? (float)this.bw : this.dI();
   }

   @Override
   public float e_() {
      return this.br > 0 ? (float)this.bv : this.dG();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bx = (double)$$0;
      this.by = $$1;
   }

   public void s(boolean $$0) {
      this.bn = $$0;
   }

   public void a(ciu $$0) {
      bsg $$1 = $$0.s();
      if ($$1 instanceof aqn) {
         am.R.a((aqn)$$1, $$0.p(), this);
      }
   }

   public void a(bsg $$0, int $$1) {
      if (!$$0.dL() && !this.dQ().B && ($$0 instanceof ciu || $$0 instanceof cmq || $$0 instanceof bsr)) {
         ((aqm)this.dQ()).l().b($$0, new afo($$0.am(), this.am(), $$1));
      }
   }

   public boolean F(bsg $$0) {
      if ($$0.dQ() != this.dQ()) {
         return false;
      } else {
         ewf $$1 = new ewf(this.dv(), this.dz(), this.dB());
         ewf $$2 = new ewf($$0.dv(), $$0.dz(), $$0.dB());
         return $$2.f($$1) > 128.0 ? false : this.dQ().a(new dbo($$1, $$2, dbo.a.a, dbo.b.a, this)).c() == ewd.a.a;
      }
   }

   @Override
   public float i(float $$0) {
      return $$0 == 1.0F ? this.ba : ayg.i($$0, this.bb, this.ba);
   }

   public float A(float $$0) {
      float $$1 = this.aS - this.aR;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aR + $$1 * $$0;
   }

   @Override
   public boolean bA() {
      return !this.dL();
   }

   @Override
   public boolean bB() {
      return this.bE() && !this.N_() && !this.q_();
   }

   @Override
   public float ct() {
      return this.ba;
   }

   @Override
   public void o(float $$0) {
      this.ba = $$0;
   }

   @Override
   public void p(float $$0) {
      this.aY = $$0;
   }

   @Override
   protected ewf a(jf.a $$0, l.a $$1) {
      return k(super.a($$0, $$1));
   }

   public static ewf k(ewf $$0) {
      return new ewf($$0.c, $$0.d, 0.0);
   }

   public float fp() {
      return this.ch;
   }

   public final void B(float $$0) {
      this.C(ayg.a($$0, 0.0F, this.eP()));
   }

   protected void C(float $$0) {
      this.ch = $$0;
   }

   public void f_() {
   }

   public void g_() {
   }

   protected void fq() {
      this.ca = true;
   }

   public abstract bsv fr();

   public boolean fs() {
      return (this.ao.a(aF) & 1) > 0;
   }

   public bqf ft() {
      return (this.ao.a(aF) & 2) > 0 ? bqf.b : bqf.a;
   }

   private void H() {
      if (this.fs()) {
         if (cuc.b(this.b(this.ft()), this.bz)) {
            this.bz = this.b(this.ft());
            this.a(this.bz);
         } else {
            this.fy();
         }
      }
   }

   protected void a(cuc $$0) {
      $$0.b(this.dQ(), this, this.fv());
      if (this.I()) {
         this.b($$0, 5);
      }

      if (--this.bA == 0 && !this.dQ().B && !$$0.v()) {
         this.x();
      }
   }

   private boolean I() {
      int $$0 = this.bz.a(this) - this.fv();
      int $$1 = (int)((float)this.bz.a(this) * 0.21875F);
      boolean $$2 = $$0 > $$1;
      return $$2 && this.fv() % 4 == 0;
   }

   private void K() {
      this.cn = this.cm;
      if (this.ce()) {
         this.cm = Math.min(1.0F, this.cm + 0.09F);
      } else {
         this.cm = Math.max(0.0F, this.cm - 0.09F);
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

   public void c(bqf $$0) {
      cuc $$1 = this.b($$0);
      if (!$$1.e() && !this.fs()) {
         this.bz = $$1;
         this.bA = $$1.a(this);
         if (!this.dQ().B) {
            this.c(1, true);
            this.c(2, $$0 == bqf.b);
            this.a(dxg.D);
         }
      }
   }

   @Override
   public void a(ajp<?> $$0) {
      super.a($$0);
      if (bQ.equals($$0)) {
         if (this.dQ().B) {
            this.fG().ifPresent(this::a);
         }
      } else if (aF.equals($$0) && this.dQ().B) {
         if (this.fs() && this.bz.e()) {
            this.bz = this.b(this.ft());
            if (!this.bz.e()) {
               this.bA = this.bz.a(this);
            }
         } else if (!this.fs() && !this.bz.e()) {
            this.bz = cuc.l;
            this.bA = 0;
         }
      }
   }

   @Override
   public void a(fc.a $$0, ewf $$1) {
      super.a($$0, $$1);
      this.bb = this.ba;
      this.aY = this.ba;
      this.aZ = this.aY;
   }

   protected void b(cuc $$0, int $$1) {
      if (!$$0.e() && this.fs()) {
         if ($$0.u() == cvx.c) {
            this.a(this.c($$0), 0.5F, this.dQ().z.i() * 0.1F + 0.9F);
         }

         if ($$0.u() == cvx.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ah.a(2), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(cuc $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ewf $$3 = new ewf(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dI() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dG() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ah.i()) * 0.6 - 0.3;
         ewf $$5 = new ewf(((double)this.ah.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dI() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dG() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dv(), this.dz(), this.dB());
         this.dQ().a(new lf(lj.S, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void x() {
      if (!this.dQ().B || this.fs()) {
         bqf $$0 = this.ft();
         if (!this.bz.equals(this.b($$0))) {
            this.fx();
         } else {
            if (!this.bz.e() && this.fs()) {
               this.b(this.bz, 16);
               cuc $$1 = this.bz.a(this.dQ(), this);
               if ($$1 != this.bz) {
                  this.a($$0, $$1);
               }

               this.fy();
            }
         }
      }
   }

   public cuc fu() {
      return this.bz;
   }

   public int fv() {
      return this.bA;
   }

   public int fw() {
      return this.fs() ? this.bz.a(this) - this.fv() : 0;
   }

   public void fx() {
      if (!this.bz.e()) {
         this.bz.a(this.dQ(), this, this.fv());
         if (this.bz.v()) {
            this.H();
         }
      }

      this.fy();
   }

   public void fy() {
      if (!this.dQ().B) {
         boolean $$0 = this.fs();
         this.c(1, false);
         if ($$0) {
            this.a(dxg.C);
         }
      }

      this.bz = cuc.l;
      this.bA = 0;
   }

   public boolean fz() {
      if (this.fs() && !this.bz.e()) {
         ctx $$0 = this.bz.g();
         return $$0.b(this.bz) != cvx.d ? false : $$0.a(this.bz, this) - this.bA >= 5;
      } else {
         return false;
      }
   }

   public boolean fA() {
      return this.bW();
   }

   public boolean fB() {
      return this.i(7);
   }

   @Override
   public boolean ce() {
      return super.ce() || !this.fB() && this.c(btn.b);
   }

   public int fC() {
      return this.bB;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dv();
      double $$5 = this.dx();
      double $$6 = this.dB();
      double $$7 = $$1;
      boolean $$8 = false;
      ja $$9 = ja.a($$0, $$1, $$2);
      dcf $$10 = this.dQ();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.I_()) {
            ja $$12 = $$9.d();
            dsk $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.c($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cL())) {
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

         if (this instanceof btk $$14) {
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

   public void a(ja $$0, boolean $$1) {
   }

   public boolean f(cuc $$0) {
      return false;
   }

   @Override
   public final bsj a(btn $$0) {
      return $$0 == btn.c ? aG : this.e($$0).a(this.ec());
   }

   protected bsj e(btn $$0) {
      return this.al().n().a(this.eb());
   }

   public ImmutableList<btn> fF() {
      return ImmutableList.of(btn.a);
   }

   public ewa f(btn $$0) {
      bsj $$1 = this.a($$0);
      return new ewa((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(btn $$0) {
      ewa $$1 = this.a($$0).a(this.do());
      return this.dQ().b(this, $$1);
   }

   @Override
   public boolean cx() {
      return super.cx() && !this.fI();
   }

   public Optional<ja> fG() {
      return this.ao.a(bQ);
   }

   public void g(ja $$0) {
      this.ao.a(bQ, Optional.of($$0));
   }

   public void fH() {
      this.ao.a(bQ, Optional.empty());
   }

   public boolean fI() {
      return this.fG().isPresent();
   }

   public void b(ja $$0) {
      if (this.bS()) {
         this.ac();
      }

      dsk $$1 = this.dQ().a_($$0);
      if ($$1.b() instanceof dfa) {
         this.dQ().a($$0, $$1.a(dfa.c, Boolean.valueOf(true)), 3);
      }

      this.b(btn.c);
      this.a($$0);
      this.g($$0);
      this.i(ewf.b);
      this.av = true;
   }

   private void a(ja $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean M() {
      return this.fG().map($$0 -> this.dQ().a_($$0).b() instanceof dfa).orElse(false);
   }

   public void fJ() {
      this.fG().filter(this.dQ()::B).ifPresent($$0x -> {
         dsk $$1 = this.dQ().a_($$0x);
         if ($$1.b() instanceof dfa) {
            jf $$2 = $$1.c(dfa.aE);
            this.dQ().a($$0x, $$1.a(dfa.c, Boolean.valueOf(false)), 3);
            ewf $$3 = dfa.a(this.al(), this.dQ(), $$0x, $$2, this.dG()).orElseGet(() -> {
               ja $$1x = $$0x.c();
               return new ewf((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            ewf $$4 = ewf.c($$0x).d($$3).d();
            float $$5 = (float)ayg.d(ayg.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.c, $$3.d, $$3.e);
            this.s($$5);
            this.t(0.0F);
         }
      });
      ewf $$0 = this.do();
      this.b(btn.a);
      this.a_($$0.c, $$0.d, $$0.e);
      this.fH();
   }

   @Nullable
   public jf fK() {
      ja $$0 = this.fG().orElse(null);
      return $$0 != null ? dfa.a(this.dQ(), $$0) : null;
   }

   @Override
   public boolean bF() {
      return !this.fI() && super.bF();
   }

   public cuc g(cuc $$0) {
      return cuc.l;
   }

   public final cuc a(dcf $$0, cuc $$1) {
      cpe $$2 = $$1.a(kn.v);
      return $$2 != null ? this.a($$0, $$1, $$2) : $$1;
   }

   public cuc a(dcf $$0, cuc $$1, cpe $$2) {
      $$0.a(null, this.dv(), this.dx(), this.dB(), this.d($$1), avi.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
      this.a($$2);
      $$1.a(1, this);
      this.a(dxg.m);
      return $$1;
   }

   private void a(cpe $$0) {
      if (!this.dQ().x_()) {
         for (cpe.b $$2 : $$0.g()) {
            if (this.ah.i() < $$2.b()) {
               this.b($$2.a());
            }
         }
      }
   }

   private static byte h(bsn $$0) {
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

   public void e(bsn $$0) {
      this.dQ().a(this, h($$0));
   }

   public static bsn d(bqf $$0) {
      return $$0 == bqf.a ? bsn.a : bsn.b;
   }

   @Override
   public ewa h_() {
      if (this.a(bsn.f).a(cuf.uq)) {
         float $$0 = 0.5F;
         return this.cL().c(0.5, 0.5, 0.5);
      } else {
         return super.h_();
      }
   }

   public static bsn h(cuc $$0) {
      cte $$1 = cte.c_($$0);
      return $$1 != null ? $$1.m() : bsn.a;
   }

   private static btt a(btb $$0, bsn $$1) {
      return $$1 != bsn.f && $$1 != bsn.a && $$1 != bsn.b ? btt.a($$0, $$1, $$1x -> $$1x.e() || btd.h($$1x) == $$1) : btt.a($$0, $$1);
   }

   @Nullable
   private static bsn r(int $$0) {
      if ($$0 == 100 + bsn.f.b()) {
         return bsn.f;
      } else if ($$0 == 100 + bsn.e.b()) {
         return bsn.e;
      } else if ($$0 == 100 + bsn.d.b()) {
         return bsn.d;
      } else if ($$0 == 100 + bsn.c.b()) {
         return bsn.c;
      } else if ($$0 == 98) {
         return bsn.a;
      } else if ($$0 == 99) {
         return bsn.b;
      } else {
         return $$0 == 105 ? bsn.g : null;
      }
   }

   @Override
   public btt a_(int $$0) {
      bsn $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dE() {
      if (this.N_()) {
         return false;
      } else {
         boolean $$0 = !this.a(bsn.f).a(awf.ba) && !this.a(bsn.e).a(awf.ba) && !this.a(bsn.d).a(awf.ba) && !this.a(bsn.c).a(awf.ba) && !this.a(bsn.g).a(awf.ba);
         return $$0 && super.dE();
      }
   }

   @Override
   public boolean ch() {
      return !this.dQ().x_() && this.b(brq.x) || super.ch();
   }

   @Override
   public float dH() {
      return this.aY;
   }

   @Override
   public void a(abo $$0) {
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

   public boolean fL() {
      return this.eU().g() instanceof crx;
   }

   @Override
   public float dK() {
      float $$0 = (float)this.g(buj.B);
      return this.cR() instanceof cmk ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public ewf m(bsg $$0) {
      return this.do().e(this.a($$0, this.a(this.as()), this.ec() * this.eb()));
   }

   protected void a(int $$0, double $$1) {
      this.ba = (float)ayg.e(1.0 / (double)$$0, (double)this.ba, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(ayg.c((double)$$0 * this.g(buj.h)));
   }

   public boolean fM() {
      return false;
   }

   @Override
   public boolean b(bqz $$0) {
      if (super.b($$0)) {
         return true;
      } else {
         if (this.dQ() instanceof aqm $$1 && czn.a($$1, this, $$0)) {
            return true;
         }

         return false;
      }
   }

   public static record a(avg a, avg b) {
   }
}
