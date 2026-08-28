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

public abstract class btc extends bsh implements bse {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final bui e = new bui(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, bui.a.c);
   public static final int i = 2;
   public static final int j = 4;
   public static final int k = 98;
   public static final int l = 100;
   public static final int m = 105;
   public static final int n = 6;
   public static final int o = 100;
   private static final int bI = 40;
   public static final double p = 0.003;
   public static final double q = 0.08;
   public static final int r = 20;
   private static final int bJ = 10;
   private static final int bK = 2;
   public static final int s = 4;
   public static final float t = 0.42F;
   private static final double bL = 128.0;
   protected static final int u = 1;
   protected static final int v = 2;
   protected static final int aF = 4;
   protected static final ajp<Byte> aG = ajt.a(btc.class, ajr.a);
   private static final ajp<Float> bM = ajt.a(btc.class, ajr.d);
   private static final ajp<List<lh>> bN = ajt.a(btc.class, ajr.m);
   private static final ajp<Boolean> bO = ajt.a(btc.class, ajr.k);
   private static final ajp<Integer> bP = ajt.a(btc.class, ajr.b);
   private static final ajp<Integer> bQ = ajt.a(btc.class, ajr.b);
   private static final ajp<Optional<ja>> bR = ajt.a(btc.class, ajr.p);
   private static final int bS = 15;
   protected static final bsk aH = bsk.c(0.2F, 0.2F).b(0.2F);
   public static final float aI = 0.5F;
   public static final float aJ = 0.5F;
   private static final float bT = 0.21875F;
   private final buh bU;
   private final bqx bV = new bqx(this);
   private final Map<jj<brn>, brp> bW = Maps.newHashMap();
   private final js<cud> bX = js.a(2, cud.l);
   private final js<cud> bY = js.a(4, cud.l);
   private cud bZ = cud.l;
   public boolean aK;
   private boolean ca = false;
   public bqg aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public int aQ;
   public int aR;
   public float aS;
   public float aT;
   protected int aU;
   public final bud aV = new bud();
   public final int aW = 20;
   public final float aX;
   public final float aY;
   public float aZ;
   public float ba;
   public float bb;
   public float bc;
   @Nullable
   protected cml bd;
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
   private boolean cb = true;
   @Nullable
   private btc cc;
   private int cd;
   @Nullable
   private btc ce;
   private int cf;
   private float cg;
   private int ch;
   private float ci;
   protected cud bA = cud.l;
   protected int bB;
   protected int bC;
   private ja cj;
   private Optional<ja> ck = Optional.empty();
   @Nullable
   private bra cl;
   private long cm;
   protected int bD;
   protected float bE;
   @Nullable
   protected cud bF;
   private float cn;
   private float co;
   protected bue<?> bG;
   private boolean cp;
   private final Reference2ObjectMap<czm, Set<dad>> cq = new Reference2ObjectArrayMap();
   protected float bH = 1.0F;

   protected btc(bsn<? extends btc> $$0, dcg $$1) {
      super($$0, $$1);
      this.bU = new buh(bul.a($$0));
      this.u(this.eP());
      this.J = true;
      this.aY = (float)((Math.random() + 1.0) * 0.01F);
      this.av();
      this.aX = (float)Math.random() * 12398.0F;
      this.s((float)(Math.random() * (float) (Math.PI * 2)));
      this.bb = this.dH();
      ul $$2 = ul.a;
      this.bG = this.a(new Dynamic($$2, (uu)$$2.createMap(ImmutableMap.of($$2.a("memories"), (uu)$$2.emptyMap()))));
   }

   public bue<?> dV() {
      return this.bG;
   }

   protected bue.b<?> dW() {
      return bue.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bue<?> a(Dynamic<?> $$0) {
      return this.dW().a($$0);
   }

   @Override
   public void ap() {
      this.a(this.dS().x(), Float.MAX_VALUE);
   }

   public boolean a(bsn<?> $$0) {
      return true;
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(aG, (byte)0);
      $$0.a(bN, List.of());
      $$0.a(bO, false);
      $$0.a(bP, 0);
      $$0.a(bQ, 0);
      $$0.a(bM, 1.0F);
      $$0.a(bR, Optional.empty());
   }

   public static buj.a dX() {
      return buj.a()
         .a(buk.s)
         .a(buk.p)
         .a(buk.v)
         .a(buk.a)
         .a(buk.b)
         .a(buk.r)
         .a(buk.B)
         .a(buk.y)
         .a(buk.n)
         .a(buk.x)
         .a(buk.k)
         .a(buk.o)
         .a(buk.w)
         .a(buk.h)
         .a(buk.i)
         .a(buk.E)
         .a(buk.u)
         .a(buk.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, dsl $$2, ja $$3) {
      if (!this.bg()) {
         this.bo();
      }

      if (this.dR() instanceof aqm $$4 && $$1 && this.ac > 0.0F) {
         this.a($$4, $$3);
         double $$5 = this.g(buk.x);
         if ((double)this.ac > $$5 && !$$2.i()) {
            double $$6 = this.dw();
            double $$7 = this.dy();
            double $$8 = this.dC();
            ja $$9 = this.dr();
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
            ((aqm)this.dR()).a(new lb(lj.b, $$2), $$6, $$7, $$8, $$15, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.ck = Optional.empty();
      }
   }

   public final boolean dY() {
      return this.am().a(awa.m);
   }

   public float a(float $$0) {
      return ayg.i($$0, this.co, this.cn);
   }

   public boolean dZ() {
      return this.du().b() < 1.0E-5F && this.bk();
   }

   @Override
   public void aw() {
      this.aS = this.aT;
      if (this.an) {
         this.fH().ifPresent(this::a);
      }

      if (this.dR() instanceof aqm $$0) {
         czo.b($$0, this);
      }

      super.aw();
      this.dR().ag().a("livingEntityBaseTick");
      if (this.bf() || this.dR().B) {
         this.aE();
      }

      if (this.bF()) {
         boolean $$1 = this instanceof cml;
         if (!this.dR().B) {
            if (this.bG()) {
               this.a(this.dS().g(), 1.0F);
            } else if ($$1 && !this.dR().C_().a(this.cM())) {
               double $$2 = this.dR().C_().a(this) + this.dR().C_().n();
               if ($$2 < 0.0) {
                  double $$3 = this.dR().C_().o();
                  if ($$3 > 0.0) {
                     this.a(this.dS().w(), (float)Math.max(1, ayg.a(-$$2 * $$3)));
                  }
               }
            }
         }

         if (this.a(awc.a) && !this.dR().a_(ja.a(this.dw(), this.dA(), this.dC())).a(dfk.nd)) {
            boolean $$4 = !this.dY() && !brq.c(this) && (!$$1 || !((cml)this).gb().a);
            if ($$4) {
               this.j(this.m(this.cn()));
               if (this.cn() == -20) {
                  this.j(0);
                  ewh $$5 = this.du();

                  for (int $$6 = 0; $$6 < 8; $$6++) {
                     double $$7 = this.ah.j() - this.ah.j();
                     double $$8 = this.ah.j() - this.ah.j();
                     double $$9 = this.ah.j() - this.ah.j();
                     this.dR().a(lj.d, this.dw() + $$7, this.dy() + $$8, this.dC() + $$9, $$5.c, $$5.d, $$5.e);
                  }

                  this.a(this.dS().i(), 2.0F);
               }
            }

            if (!this.dR().B && this.bT() && this.de() != null && this.de().bV()) {
               this.ad();
            }
         } else if (this.cn() < this.cm()) {
            this.j(this.n(this.cn()));
         }

         if (this.dR() instanceof aqm $$10) {
            ja $$11 = this.dr();
            if (!Objects.equal(this.cj, $$11)) {
               this.cj = $$11;
               this.a($$10, $$11);
            }
         }
      }

      if (this.bF() && (this.bi() || this.aB)) {
         this.aJ();
      }

      if (this.aP > 0) {
         this.aP--;
      }

      if (this.am > 0 && !(this instanceof aqn)) {
         this.am--;
      }

      if (this.ez() && this.dR().h(this)) {
         this.ef();
      }

      if (this.be > 0) {
         this.be--;
      } else {
         this.bd = null;
      }

      if (this.ce != null && !this.ce.bF()) {
         this.ce = null;
      }

      if (this.cc != null) {
         if (!this.cc.bF()) {
            this.a(null);
         } else if (this.ai - this.cd > 100) {
            this.a(null);
         }
      }

      this.eq();
      this.bk = this.bj;
      this.ba = this.aZ;
      this.bc = this.bb;
      this.O = this.dH();
      this.P = this.dJ();
      this.dR().ag().c();
   }

   @Override
   protected float aP() {
      return ayg.i((float)this.g(buk.u), super.aP(), 1.0F);
   }

   protected void ea() {
      bug $$0 = this.f(buk.v);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void eb() {
      if (!this.bq().i()) {
         int $$0 = this.co();
         if ($$0 > 0) {
            bug $$1 = this.f(buk.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cp();
            $$1.c(new bui(d, "Powder snow slow", (double)$$2, bui.a.a));
         }
      }
   }

   protected void a(aqm $$0, ja $$1) {
      czo.a($$0, this);
   }

   public boolean o_() {
      return false;
   }

   public float ec() {
      return this.o_() ? 0.5F : 1.0F;
   }

   public float ed() {
      buh $$0 = this.eU();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(buk.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean ee() {
      return true;
   }

   protected void ef() {
      this.aR++;
      if (this.aR >= 20 && !this.dR().x_() && !this.dM()) {
         this.dR().a(this, (byte)60);
         this.a(bsh.d.a);
      }
   }

   public boolean eg() {
      return !this.o_();
   }

   protected boolean eh() {
      return !this.o_();
   }

   protected int m(int $$0) {
      bug $$1 = this.f(buk.w);
      double $$2;
      if ($$1 != null) {
         $$2 = $$1.f();
      } else {
         $$2 = 0.0;
      }

      return $$2 > 0.0 && this.ah.j() >= 1.0 / ($$2 + 1.0) ? $$0 : $$0 - 1;
   }

   protected int n(int $$0) {
      return Math.min($$0 + 4, this.cm());
   }

   public final int a(aqm $$0, @Nullable bsh $$1) {
      return czo.a($$0, $$1, this, this.ei());
   }

   protected int ei() {
      return 0;
   }

   protected boolean ej() {
      return false;
   }

   @Nullable
   public btc ek() {
      return this.cc;
   }

   @Override
   public btc T_() {
      return this.ek();
   }

   public int el() {
      return this.cd;
   }

   public void c(@Nullable cml $$0) {
      this.bd = $$0;
      this.be = this.ai;
   }

   public void a(@Nullable btc $$0) {
      this.cc = $$0;
      this.cd = this.ai;
   }

   @Nullable
   public btc em() {
      return this.ce;
   }

   public int en() {
      return this.cf;
   }

   public void A(bsh $$0) {
      if ($$0 instanceof btc) {
         this.ce = (btc)$$0;
      } else {
         this.ce = null;
      }

      this.cf = this.ai;
   }

   public int eo() {
      return this.bg;
   }

   public void o(int $$0) {
      this.bg = $$0;
   }

   public boolean ep() {
      return this.ca;
   }

   public void r(boolean $$0) {
      this.ca = $$0;
   }

   protected boolean b(bso $$0) {
      return true;
   }

   public void a(bso $$0, cud $$1, cud $$2) {
      boolean $$3 = $$2.e() && $$1.e();
      if (!$$3 && !cud.c($$1, $$2) && !this.an) {
         ctf $$4 = ctf.c_($$2);
         if (!this.dR().x_() && !this.N_()) {
            if (!this.aY() && $$4 != null && $$4.m() == $$0) {
               this.dR().a(null, this.dw(), this.dy(), this.dC(), $$4.n(), this.dg(), 1.0F, 1.0F, this.ah.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? dxh.v : dxh.S);
            }
         }
      }
   }

   @Override
   public void a(bsh.d $$0) {
      if ($$0 == bsh.d.a || $$0 == bsh.d.b) {
         for (brp $$1 : this.ev()) {
            $$1.a(this, $$0);
         }

         this.bW.clear();
      }

      super.a($$0);
      this.bG.a();
   }

   @Override
   public void b(tx $$0) {
      $$0.a("Health", this.ey());
      $$0.a("HurtTime", (short)this.aP);
      $$0.a("HurtByTimestamp", this.cd);
      $$0.a("DeathTime", (short)this.aR);
      $$0.a("AbsorptionAmount", this.fq());
      $$0.a("Attributes", this.eU().d());
      if (!this.bW.isEmpty()) {
         ud $$1 = new ud();

         for (brp $$2 : this.bW.values()) {
            $$1.add($$2.j());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fC());
      this.fH().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<uu> $$3 = this.bG.a(ul.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(tx $$0) {
      this.C($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dR() != null && !this.dR().B) {
         this.eU().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         ud $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tx $$3 = $$1.a($$2);
            brp $$4 = brp.a($$3);
            if ($$4 != null) {
               this.bW.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.u($$0.j("Health"));
      }

      this.aP = $$0.g("HurtTime");
      this.aR = $$0.g("DeathTime");
      this.cd = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         exl $$6 = this.dR().M();
         exg $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cC(), $$7);
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
         this.ao.a(at, bto.c);
         if (!this.an) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bG = this.a(new Dynamic(ul.a, $$0.c("Brain")));
      }
   }

   protected void eq() {
      Iterator<jj<brn>> $$0 = this.bW.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            jj<brn> $$1 = $$0.next();
            brp $$2 = this.bW.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dR().B) {
                  $$0.remove();
                  this.a($$2);
               }
            } else if ($$2.d() % 600 == 0) {
               this.a($$2, false, null);
            }
         }
      } catch (ConcurrentModificationException var6) {
      }

      if (this.cb) {
         if (!this.dR().B) {
            this.K();
            this.v();
         }

         this.cb = false;
      }

      List<lh> $$3 = this.ao.a(bN);
      if (!$$3.isEmpty()) {
         boolean $$4 = this.ao.a(bO);
         int $$5 = this.cj() ? 15 : 4;
         int $$6 = $$4 ? 5 : 1;
         if (this.ah.a($$5 * $$6) == 0) {
            this.dR().a(ac.a($$3, this.ah), this.d(0.5), this.dz(), this.g(0.5), 1.0, 1.0, 1.0);
         }
      }
   }

   protected void K() {
      if (this.bW.isEmpty()) {
         this.et();
         this.l(false);
      } else {
         this.l(this.b(brr.n));
         this.s();
      }
   }

   private void s() {
      List<lh> $$0 = this.bW.values().stream().filter(brp::g).map(brp::a).toList();
      this.ao.a(bN, $$0);
      this.ao.a(bO, c(this.bW.values()));
   }

   private void v() {
      boolean $$0 = this.ci();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable bsh $$0) {
      double $$1 = 1.0;
      if (this.ca()) {
         $$1 *= 0.8;
      }

      if (this.cj()) {
         float $$2 = this.fb();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cud $$3 = this.a(bso.f);
         bsn<?> $$4 = $$0.am();
         if ($$4 == bsn.aN && $$3.a(cug.ul)
            || $$4 == bsn.bu && $$3.a(cug.uo)
            || $$4 == bsn.aA && $$3.a(cug.ur)
            || $$4 == bsn.aB && $$3.a(cug.ur)
            || $$4 == bsn.x && $$3.a(cug.up)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(btc $$0) {
      return $$0 instanceof cml && this.dR().al() == bqe.a ? false : $$0.er();
   }

   public boolean a(btc $$0, cdt $$1) {
      return $$1.a(this, $$0);
   }

   public boolean er() {
      return !this.cw() && this.es();
   }

   public boolean es() {
      return !this.N_() && this.bF();
   }

   public static boolean c(Collection<brp> $$0) {
      for (brp $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void et() {
      this.ao.a(bN, List.of());
   }

   public boolean eu() {
      if (this.dR().B) {
         return false;
      } else {
         Iterator<brp> $$0 = this.bW.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<brp> ev() {
      return this.bW.values();
   }

   public Map<jj<brn>, brp> ew() {
      return this.bW;
   }

   public boolean b(jj<brn> $$0) {
      return this.bW.containsKey($$0);
   }

   @Nullable
   public brp c(jj<brn> $$0) {
      return this.bW.get($$0);
   }

   public final boolean b(brp $$0) {
      return this.b($$0, null);
   }

   public boolean b(brp $$0, @Nullable bsh $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         brp $$2 = this.bW.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bW.put($$0.c(), $$0);
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

   public boolean c(brp $$0) {
      if (this.am().a(awa.G)) {
         return !$$0.a(brr.M);
      } else if (this.am().a(awa.F)) {
         return !$$0.a(brr.L);
      } else {
         return !this.am().a(awa.w) ? true : !$$0.a(brr.j) && !$$0.a(brr.s);
      }
   }

   public void c(brp $$0, @Nullable bsh $$1) {
      if (this.c($$0)) {
         brp $$2 = this.bW.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean ex() {
      return this.am().a(awa.x);
   }

   @Nullable
   public brp d(jj<brn> $$0) {
      return this.bW.remove($$0);
   }

   public boolean e(jj<brn> $$0) {
      brp $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(brp $$0, @Nullable bsh $$1) {
      this.cb = true;
      if (!this.dR().B) {
         $$0.c().a().a(this.eU(), $$0.e());
         this.d($$0);
      }
   }

   public void d(brp $$0) {
      for (bsh $$1 : this.cU()) {
         if ($$1 instanceof aqn $$2) {
            $$2.c.b(new afu(this.an(), $$0, false));
         }
      }
   }

   protected void a(brp $$0, boolean $$1, @Nullable bsh $$2) {
      this.cb = true;
      if ($$1 && !this.dR().B) {
         brn $$3 = $$0.c().a();
         $$3.a(this.eU());
         $$3.a(this.eU(), $$0.e());
         this.z();
      }

      if (!this.dR().B) {
         this.d($$0);
      }
   }

   protected void a(brp $$0) {
      this.cb = true;
      if (!this.dR().B) {
         $$0.c().a().a(this.eU());
         this.z();

         for (bsh $$1 : this.cU()) {
            if ($$1 instanceof aqn $$2) {
               $$2.c.b(new adz(this.an(), $$0.c()));
            }
         }
      }
   }

   private void z() {
      Set<bug> $$0 = this.eU().b();

      for (bug $$1 : $$0) {
         this.i($$1.a());
      }

      $$0.clear();
   }

   private void i(jj<buf> $$0) {
      if ($$0.a(buk.s)) {
         float $$1 = this.eP();
         if (this.ey() > $$1) {
            this.u($$1);
         }
      } else if ($$0.a(buk.r)) {
         float $$2 = this.eQ();
         if (this.fq() > $$2) {
            this.B($$2);
         }
      }
   }

   public void c(float $$0) {
      float $$1 = this.ey();
      if ($$1 > 0.0F) {
         this.u($$1 + $$0);
      }
   }

   public float ey() {
      return this.ao.a(bM);
   }

   public void u(float $$0) {
      this.ao.a(bM, ayg.a($$0, 0.0F, this.eP()));
   }

   public boolean ez() {
      return this.ey() <= 0.0F;
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dR().B) {
         return false;
      } else if (this.ez()) {
         return false;
      } else if ($$0.a(avy.j) && this.b(brr.l)) {
         return false;
      } else {
         if (this.fJ() && !this.dR().B) {
            this.fK();
         }

         this.bg = 0;
         float $$2 = $$1;
         boolean $$3 = false;
         float $$4 = 0.0F;
         if ($$1 > 0.0F && this.f($$0)) {
            this.w($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.a(avy.k) && $$0.c() instanceof btc $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(avy.p) && this.am().a(awa.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(avy.a) && !this.a(bso.f).e()) {
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

         bsh $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof btc $$9 && !$$0.a(avy.r) && (!$$0.a(brd.H) || !this.am().a(awa.E))) {
               this.a($$9);
            }

            if ($$8 instanceof cml $$10) {
               this.be = 100;
               this.bd = $$10;
            } else if ($$8 instanceof cfv $$11 && $$11.s()) {
               this.be = 100;
               if ($$11.P_() instanceof cml $$12) {
                  this.bd = $$12;
               } else {
                  this.bd = null;
               }
            }
         }

         if ($$7) {
            if ($$3) {
               this.dR().a(this, (byte)29);
            } else {
               this.dR().a(this, $$0);
            }

            if (!$$0.a(avy.s) && (!$$3 || $$1 > 0.0F)) {
               this.bx();
            }

            if (!$$0.a(avy.A)) {
               double $$13 = 0.0;
               double $$14 = 0.0;
               if ($$0.c() instanceof cnd $$15) {
                  DoubleDoubleImmutablePair $$16 = $$15.a_(this, $$0);
                  $$13 = -$$16.leftDouble();
                  $$14 = -$$16.rightDouble();
               } else if ($$0.h() != null) {
                  $$13 = $$0.h().a() - this.dw();
                  $$14 = $$0.h().c() - this.dC();
               }

               this.q(0.4F, $$13, $$14);
               if (!$$3) {
                  this.a($$13, $$14);
               }
            }
         }

         if (this.ez()) {
            if (!this.g($$0)) {
               if ($$7) {
                  this.b(this.n_());
               }

               this.a($$0);
            }
         } else if ($$7) {
            this.e($$0);
         }

         boolean $$17 = !$$3 || $$1 > 0.0F;
         if ($$17) {
            this.cl = $$0;
            this.cm = this.dR().Z();

            for (brp $$18 : this.ev()) {
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

   protected void d(btc $$0) {
      $$0.e(this);
   }

   protected void e(btc $$0) {
      $$0.q(0.5, $$0.dw() - this.dw(), $$0.dC() - this.dC());
   }

   private boolean g(bra $$0) {
      if ($$0.a(avy.e)) {
         return false;
      } else {
         cud $$1 = null;

         for (bqg $$2 : bqg.values()) {
            cud $$3 = this.b($$2);
            if ($$3.a(cug.vt)) {
               $$1 = $$3.s();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof aqn $$4) {
               $$4.b(avr.c.b(cug.vt));
               am.C.a($$4, $$1);
               this.a(dxh.C);
            }

            this.u(1.0F);
            this.eu();
            this.b(new brp(brr.j, 900, 1));
            this.b(new brp(brr.v, 100, 1));
            this.b(new brp(brr.l, 800, 0));
            this.dR().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bra eA() {
      if (this.dR().Z() - this.cm > 40L) {
         this.cl = null;
      }

      return this.cl;
   }

   protected void e(bra $$0) {
      this.b(this.d($$0));
   }

   public void b(@Nullable avg $$0) {
      if ($$0 != null) {
         this.a($$0, this.fc(), this.fd());
      }
   }

   public boolean f(bra $$0) {
      bsh $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cmr $$3 && $$3.D() > 0) {
         $$2 = true;
      }

      if (!$$0.a(avy.d) && this.fA() && !$$2) {
         ewh $$4 = $$0.h();
         if ($$4 != null) {
            ewh $$5 = this.c(0.0F, this.cu());
            ewh $$6 = $$4.a(this.dp());
            $$6 = new ewh($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(cud $$0) {
      if (!$$0.e()) {
         if (!this.aY()) {
            this.dR().a(this.dw(), this.dy(), this.dC(), $$0.K(), this.dg(), 0.8F, 0.8F + this.dR().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bra $$0) {
      if (!this.dM() && !this.bf) {
         bsh $$1 = $$0.d();
         btc $$2 = this.eO();
         if (this.bm >= 0 && $$2 != null) {
            $$2.a(this, this.bm, $$0);
         }

         if (this.fJ()) {
            this.fK();
         }

         if (!this.dR().B && this.ai()) {
            b.info("Named entity {} died: {}", this, this.eN().a().getString());
         }

         this.bf = true;
         this.eN().c();
         if (this.dR() instanceof aqm $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(dxh.p);
               this.a($$3, $$0);
               this.f($$2);
            }

            this.dR().a(this, (byte)3);
         }

         this.b(bto.h);
      }
   }

   protected void f(@Nullable btc $$0) {
      if (!this.dR().B) {
         boolean $$1 = false;
         if ($$0 instanceof cii) {
            if (this.dR().ab().b(dcc.c)) {
               ja $$2 = this.dr();
               dsl $$3 = dfk.cd.o();
               if (this.dR().a_($$2).i() && $$3.a((dcj)this.dR(), $$2)) {
                  this.dR().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               civ $$4 = new civ(this.dR(), this.dw(), this.dy(), this.dC(), new cud(cug.dw));
               this.dR().b($$4);
            }
         }
      }
   }

   protected void a(aqm $$0, bra $$1) {
      boolean $$2 = this.be > 0;
      if (this.eh() && $$0.ab().b(dcc.f)) {
         this.a($$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.eB();
      this.C($$1.d());
   }

   protected void eB() {
   }

   protected void C(@Nullable bsh $$0) {
      if (this.dR() instanceof aqm $$1 && !this.eF() && (this.ej() || this.be > 0 && this.eg() && this.dR().ab().b(dcc.f))) {
         bss.a($$1, this.dp(), this.a($$1, $$0));
      }
   }

   protected void a(aqm $$0, bra $$1, boolean $$2) {
   }

   public akj<erb> eC() {
      return this.am().k();
   }

   public long eD() {
      return 0L;
   }

   protected float a(bsh $$0, bra $$1) {
      float $$2 = (float)this.g(buk.d);
      return this.dR() instanceof aqm $$3 ? czo.d($$3, this.eV(), $$0, $$1, $$2) : $$2;
   }

   protected void a(bra $$0, boolean $$1) {
      akj<erb> $$2 = this.eC();
      erb $$3 = this.dR().o().bf().b($$2);
      eqz.a $$4 = new eqz.a((aqm)this.dR()).a(ets.a, this).a(ets.f, this.dp()).a(ets.c, $$0).b(ets.d, $$0.d()).b(ets.e, $$0.c());
      if ($$1 && this.bd != null) {
         $$4 = $$4.a(ets.b, this.bd).a(this.bd.gw());
      }

      eqz $$5 = $$4.a(etr.g);
      $$3.a($$5, this.eD(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.g(buk.p);
      if (!($$0 <= 0.0)) {
         this.av = true;
         ewh $$3 = this.du();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         ewh $$4 = new ewh($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aG() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected avg d(bra $$0) {
      return avh.kg;
   }

   @Nullable
   protected avg n_() {
      return avh.kb;
   }

   private avg d(int $$0) {
      return $$0 > 4 ? this.eJ().b() : this.eJ().a();
   }

   public void eE() {
      this.cp = true;
   }

   public boolean eF() {
      return this.cp;
   }

   public float eG() {
      return 0.0F;
   }

   protected ewc eH() {
      ewc $$0 = this.cM();
      bsh $$1 = this.de();
      if ($$1 != null) {
         ewh $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<czm, Set<dad>> eI() {
      return this.cq;
   }

   public btc.a eJ() {
      return new btc.a(avh.kh, avh.jZ);
   }

   protected avg c(cud $$0) {
      return $$0.I();
   }

   public avg d(cud $$0) {
      return $$0.J();
   }

   public Optional<ja> eK() {
      return this.ck;
   }

   public boolean p_() {
      if (this.N_()) {
         return false;
      } else {
         ja $$0 = this.dr();
         dsl $$1 = this.ds();
         if ($$1.a(avw.aP)) {
            this.ck = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dnv && this.c($$0, $$1)) {
            this.ck = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(ja $$0, dsl $$1) {
      if ($$1.c(dnv.b)) {
         dsl $$2 = this.dR().a_($$0.d());
         if ($$2.a(dfk.cO) && $$2.c(djo.b) == $$1.c(dnv.aE)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean bF() {
      return !this.dM() && this.ey() > 0.0F;
   }

   @Override
   public int cz() {
      return this.v(0.0F);
   }

   protected final int v(float $$0) {
      return ayg.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bra $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.e($$0, $$1);
      if ($$4 > 0) {
         this.a(this.d($$4), 1.0F, 1.0F);
         this.eL();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int e(float $$0, float $$1) {
      if (this.am().a(awa.o)) {
         return 0;
      } else {
         float $$2 = (float)this.g(buk.x);
         float $$3 = $$0 - $$2;
         return ayg.c((double)($$3 * $$1) * this.g(buk.k));
      }
   }

   protected void eL() {
      if (!this.aY()) {
         int $$0 = ayg.a(this.dw());
         int $$1 = ayg.a(this.dy() - 0.2F);
         int $$2 = ayg.a(this.dC());
         dsl $$3 = this.dR().a_(new ja($$0, $$1, $$2));
         if (!$$3.i()) {
            dmv $$4 = $$3.w();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void n(float $$0) {
      this.aQ = 10;
      this.aP = this.aQ;
   }

   public int eM() {
      return ayg.a(this.g(buk.a));
   }

   protected void b(bra $$0, float $$1) {
   }

   protected void c(bra $$0, float $$1) {
   }

   protected void w(float $$0) {
   }

   protected void a(bra $$0, float $$1, bso... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bso $$4 : $$2) {
            cud $$5 = this.a($$4);
            if ($$5.g() instanceof crt && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float d(bra $$0, float $$1) {
      if (!$$0.a(avy.c)) {
         this.b($$0, $$1);
         $$1 = bqw.a(this, $$1, $$0, (float)this.eM(), (float)this.g(buk.b));
      }

      return $$1;
   }

   protected float e(bra $$0, float $$1) {
      if ($$0.a(avy.g)) {
         return $$1;
      } else {
         if (this.b(brr.k) && !$$0.a(avy.h)) {
            int $$2 = (this.c(brr.k).e() + 1) * 5;
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
            if (this.dR() instanceof aqm $$7) {
               $$8 = czo.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = bqw.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void f(bra $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fq(), 0.0F);
         this.B(this.fq() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof aqn $$4) {
            $$4.a(avr.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eN().a($$0, var9);
            this.u(this.ey() - var9);
            this.B(this.fq() - var9);
            this.a(dxh.o);
         }
      }
   }

   public bqx eN() {
      return this.bV;
   }

   @Nullable
   public btc eO() {
      if (this.bd != null) {
         return this.bd;
      } else {
         return this.cc != null ? this.cc : null;
      }
   }

   public final float eP() {
      return (float)this.g(buk.s);
   }

   public final float eQ() {
      return (float)this.g(buk.r);
   }

   public final int eR() {
      return this.ao.a(bP);
   }

   public final void p(int $$0) {
      this.ao.a(bP, $$0);
   }

   public final int eS() {
      return this.ao.a(bQ);
   }

   public final void q(int $$0) {
      this.ao.a(bQ, $$0);
   }

   private int A() {
      if (brq.a(this)) {
         return 6 - (1 + brq.b(this));
      } else {
         return this.b(brr.d) ? 6 + (1 + this.c(brr.d).e()) * 2 : 6;
      }
   }

   public void a(bqg $$0) {
      this.a($$0, false);
   }

   public void a(bqg $$0, boolean $$1) {
      if (!this.aK || this.aM >= this.A() / 2 || this.aM < 0) {
         this.aM = -1;
         this.aK = true;
         this.aL = $$0;
         if (this.dR() instanceof aqm) {
            abq $$2 = new abq(this, $$0 == bqg.a ? 0 : 3);
            aqk $$3 = ((aqm)this.dR()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bra $$0) {
      this.aV.a(1.5F);
      this.am = 20;
      this.aQ = 10;
      this.aP = this.aQ;
      avg $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.fc(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
      }

      this.a(this.dS().o(), 0.0F);
      this.cl = $$0;
      this.cm = this.dR().Z();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            avg $$1 = this.n_();
            if ($$1 != null) {
               this.a($$1, this.fc(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cml)) {
               this.u(0.0F);
               this.a(this.dS().o());
            }
            break;
         case 29:
            this.a(avh.wD, 1.0F, 0.8F + this.dR().z.i() * 0.4F);
            break;
         case 30:
            this.a(avh.wE, 0.8F, 0.8F + this.dR().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ah.i() - 0.5F) * 0.2F;
               float $$6 = (this.ah.i() - 0.5F) * 0.2F;
               float $$7 = (this.ah.i() - 0.5F) * 0.2F;
               double $$8 = ayg.d($$4, this.L, this.dw()) + (this.ah.j() - 0.5) * (double)this.dl() * 2.0;
               double $$9 = ayg.d($$4, this.M, this.dy()) + this.ah.j() * (double)this.dm();
               double $$10 = ayg.d($$4, this.N, this.dC()) + (this.ah.j() - 0.5) * (double)this.dl() * 2.0;
               this.dR().a(lj.ac, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.a(bso.a));
            break;
         case 48:
            this.i(this.a(bso.b));
            break;
         case 49:
            this.i(this.a(bso.f));
            break;
         case 50:
            this.i(this.a(bso.e));
            break;
         case 51:
            this.i(this.a(bso.d));
            break;
         case 52:
            this.i(this.a(bso.c));
            break;
         case 54:
            djc.b(this);
            break;
         case 55:
            this.C();
            break;
         case 60:
            this.B();
            break;
         case 65:
            this.i(this.a(bso.g));
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
         this.dR().a(lj.ab, this.d(1.0), this.dz(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void C() {
      cud $$0 = this.a(bso.b);
      this.a(bso.b, this.a(bso.a));
      this.a(bso.a, $$0);
   }

   @Override
   protected void aF() {
      this.a(this.dS().n(), 4.0F);
   }

   protected void eT() {
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
   public bug f(jj<buf> $$0) {
      return this.eU().a($$0);
   }

   public double g(jj<buf> $$0) {
      return this.eU().c($$0);
   }

   public double h(jj<buf> $$0) {
      return this.eU().d($$0);
   }

   public buh eU() {
      return this.bU;
   }

   public cud eV() {
      return this.a(bso.a);
   }

   public cud eW() {
      return this.a(bso.b);
   }

   public boolean b(cty $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cud> $$0) {
      return $$0.test(this.eV()) || $$0.test(this.eW());
   }

   public cud b(bqg $$0) {
      if ($$0 == bqg.a) {
         return this.a(bso.a);
      } else if ($$0 == bqg.b) {
         return this.a(bso.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bqg $$0, cud $$1) {
      if ($$0 == bqg.a) {
         this.a(bso.a, $$1);
      } else {
         if ($$0 != bqg.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bso.b, $$1);
      }
   }

   public boolean c(bso $$0) {
      return !this.a($$0).e();
   }

   public boolean d(bso $$0) {
      return false;
   }

   public abstract Iterable<cud> eX();

   public abstract cud a(bso var1);

   public abstract void a(bso var1, cud var2);

   public Iterable<cud> eY() {
      return List.of();
   }

   public Iterable<cud> eZ() {
      return this.eX();
   }

   public Iterable<cud> fa() {
      return Iterables.concat(this.eY(), this.eZ());
   }

   protected void e(cud $$0) {
      $$0.g().m($$0);
   }

   public float fb() {
      Iterable<cud> $$0 = this.eX();
      int $$1 = 0;
      int $$2 = 0;

      for (cud $$3 : $$0) {
         if (!$$3.e()) {
            $$2++;
         }

         $$1++;
      }

      return $$1 > 0 ? (float)$$2 / (float)$$1 : 0.0F;
   }

   @Override
   public void i(boolean $$0) {
      super.i($$0);
      bug $$1 = this.f(buk.v);
      $$1.b(e.b());
      if ($$0) {
         $$1.c(e);
      }
   }

   protected float fc() {
      return 1.0F;
   }

   public float fd() {
      return this.o_() ? (this.ah.i() - this.ah.i()) * 0.2F + 1.5F : (this.ah.i() - this.ah.i()) * 0.2F + 1.0F;
   }

   protected boolean fe() {
      return this.ez();
   }

   @Override
   public void h(bsh $$0) {
      if (!this.fJ()) {
         super.h($$0);
      }
   }

   private void b(bsh $$0) {
      ewh $$1;
      if (this.dM()) {
         $$1 = this.dp();
      } else if (!$$0.dM() && !this.dR().a_($$0.dr()).a(avw.aJ)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dy(), $$0.dy());
         $$1 = new ewh(this.dw(), $$2, this.dC());
      }

      this.a($$1.c, $$1.d, $$1.e);
   }

   @Override
   public boolean cH() {
      return this.cG();
   }

   protected float ff() {
      return this.x(1.0F);
   }

   protected float x(float $$0) {
      return (float)this.g(buk.o) * $$0 * this.aO() + this.fg();
   }

   public float fg() {
      return this.b(brr.h) ? 0.1F * ((float)this.c(brr.h).e() + 1.0F) : 0.0F;
   }

   protected void fh() {
      float $$0 = this.ff();
      if (!($$0 <= 1.0E-5F)) {
         ewh $$1 = this.du();
         this.o($$1.c, (double)$$0, $$1.e);
         if (this.cd()) {
            float $$2 = this.dH() * (float) (Math.PI / 180.0);
            this.k(new ewh((double)(-ayg.a($$2)) * 0.2, 0.0, (double)ayg.b($$2) * 0.2));
         }

         this.av = true;
      }
   }

   protected void fi() {
      this.j(this.du().b(0.0, -0.04F, 0.0));
   }

   protected void c(awm<eoi> $$0) {
      this.j(this.du().b(0.0, 0.04F, 0.0));
   }

   protected float fj() {
      return 0.8F;
   }

   public boolean a(eoj $$0) {
      return false;
   }

   @Override
   protected double ba() {
      return this.g(buk.n);
   }

   public void a(ewh $$0) {
      if (this.dc()) {
         double $$1 = this.bb();
         boolean $$2 = this.du().d <= 0.0;
         if ($$2 && this.b(brr.B)) {
            $$1 = Math.min($$1, 0.01);
         }

         eoj $$3 = this.dR().b_(this.dr());
         if (this.bg() && this.ee() && !this.a($$3)) {
            double $$4 = this.dy();
            float $$5 = this.cd() ? 0.9F : this.fj();
            float $$6 = 0.02F;
            float $$7 = (float)this.g(buk.E);
            if (!this.aG()) {
               $$7 *= 0.5F;
            }

            if ($$7 > 0.0F) {
               $$5 += (0.54600006F - $$5) * $$7;
               $$6 += (this.fl() - $$6) * $$7;
            }

            if (this.b(brr.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(bth.a, this.du());
            ewh $$8 = this.du();
            if (this.Q && this.p_()) {
               $$8 = new ewh($$8.c, 0.2, $$8.e);
            }

            this.j($$8.d((double)$$5, 0.8F, (double)$$5));
            ewh $$9 = this.a($$1, $$2, this.du());
            this.j($$9);
            if (this.Q && this.g($$9.c, $$9.d + 0.6F - this.dy() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bu() && this.ee() && !this.a($$3)) {
            double $$10 = this.dy();
            this.a(0.02F, $$0);
            this.a(bth.a, this.du());
            if (this.b(awc.b) <= this.dk()) {
               this.j(this.du().d(0.5, 0.8F, 0.5));
               ewh $$11 = this.a($$1, $$2, this.du());
               this.j($$11);
            } else {
               this.j(this.du().a(0.5));
            }

            if ($$1 != 0.0) {
               this.j(this.du().b(0.0, -$$1 / 4.0, 0.0));
            }

            ewh $$12 = this.du();
            if (this.Q && this.g($$12.c, $$12.d + 0.6F - this.dy() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fC()) {
            this.cs();
            ewh $$13 = this.du();
            ewh $$14 = this.bN();
            float $$15 = this.dJ() * (float) (Math.PI / 180.0);
            double $$16 = Math.sqrt($$14.c * $$14.c + $$14.e * $$14.e);
            double $$17 = $$13.h();
            double $$18 = $$14.f();
            double $$19 = Math.cos((double)$$15);
            $$19 = $$19 * $$19 * Math.min(1.0, $$18 / 0.4);
            $$13 = this.du().b(0.0, $$1 * (-1.0 + $$19 * 0.75), 0.0);
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

            this.j($$13.d(0.99F, 0.98F, 0.99F));
            this.a(bth.a, this.du());
            if (this.Q && !this.dR().B) {
               double $$22 = this.du().h();
               double $$23 = $$17 - $$22;
               float $$24 = (float)($$23 * 10.0 - 3.0);
               if ($$24 > 0.0F) {
                  this.a(this.d((int)$$24), 1.0F, 1.0F);
                  this.a(this.dS().m(), $$24);
               }
            }

            if (this.aG() && !this.dR().B) {
               this.b(7, false);
            }
         } else {
            ja $$25 = this.aM();
            float $$26 = this.dR().a_($$25).b().h();
            float $$27 = this.aG() ? $$26 * 0.91F : 0.91F;
            ewh $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.b(brr.y)) {
               $$29 += (0.05 * (double)(this.c(brr.y).e() + 1) - $$28.d) * 0.2;
            } else if (!this.dR().B || this.dR().B($$25)) {
               $$29 -= $$1;
            } else if (this.dy() > (double)this.dR().I_()) {
               $$29 = -0.1;
            } else {
               $$29 = 0.0;
            }

            if (this.ep()) {
               this.o($$28.c, $$29, $$28.e);
            } else {
               this.o($$28.c * (double)$$27, this instanceof cfb ? $$29 * (double)$$27 : $$29 * 0.98F, $$28.e * (double)$$27);
            }
         }
      }

      this.s(this instanceof cfb);
   }

   private void c(cml $$0, ewh $$1) {
      ewh $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.dc()) {
         this.z(this.e($$0));
         this.a($$2);
      } else {
         this.s(false);
         this.j(ewh.b);
         this.aH();
      }
   }

   protected void a(cml $$0, ewh $$1) {
   }

   protected ewh b(cml $$0, ewh $$1) {
      return $$1;
   }

   protected float e(cml $$0) {
      return this.fl();
   }

   public void s(boolean $$0) {
      float $$1 = (float)ayg.g(this.dw() - this.L, $$0 ? this.dy() - this.M : 0.0, this.dC() - this.N);
      this.y($$1);
   }

   protected void y(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aV.a($$1, 0.4F);
   }

   public ewh a(ewh $$0, float $$1) {
      this.a(this.D($$1), $$0);
      this.j(this.b(this.du()));
      this.a(bth.a, this.du());
      ewh $$2 = this.du();
      if ((this.Q || this.bo) && (this.p_() || this.ds().a(dfk.qP) && dlc.a(this))) {
         $$2 = new ewh($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public ewh a(double $$0, boolean $$1, ewh $$2) {
      if ($$0 != 0.0 && !this.cd()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new ewh($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private ewh b(ewh $$0) {
      if (this.p_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = ayg.a($$0.c, -0.15F, 0.15F);
         double $$3 = ayg.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.ds().a(dfk.nS) && this.fB() && this instanceof cml) {
            $$4 = 0.0;
         }

         $$0 = new ewh($$2, $$4, $$3);
      }

      return $$0;
   }

   private float D(float $$0) {
      return this.aG() ? this.fl() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fk();
   }

   protected float fk() {
      return this.cS() instanceof cml ? this.fl() * 0.1F : 0.02F;
   }

   public float fl() {
      return this.cg;
   }

   public void z(float $$0) {
      this.cg = $$0;
   }

   public boolean D(bsh $$0) {
      this.A($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.H();
      this.J();
      if (!this.dR().B) {
         int $$0 = this.eR();
         if ($$0 > 0) {
            if (this.aN <= 0) {
               this.aN = 20 * (30 - $$0);
            }

            this.aN--;
            if (this.aN <= 0) {
               this.p($$0 - 1);
            }
         }

         int $$1 = this.eS();
         if ($$1 > 0) {
            if (this.aO <= 0) {
               this.aO = 20 * (30 - $$1);
            }

            this.aO--;
            if (this.aO <= 0) {
               this.q($$1 - 1);
            }
         }

         this.D();
         if (this.ai % 20 == 0) {
            this.eN().c();
         }

         if (this.fJ() && !this.L()) {
            this.fK();
         }
      }

      if (!this.dM()) {
         this.m_();
      }

      double $$2 = this.dw() - this.L;
      double $$3 = this.dC() - this.N;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aZ;
      float $$6 = 0.0F;
      this.bh = this.bi;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)ayg.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = ayg.e(ayg.g(this.dH()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aT > 0.0F) {
         $$5 = this.dH();
      }

      if (!this.aG()) {
         $$7 = 0.0F;
      }

      this.bi = this.bi + ($$7 - this.bi) * 0.3F;
      this.dR().ag().a("headTurn");
      $$6 = this.f($$5, $$6);
      this.dR().ag().c();
      this.dR().ag().a("rangeChecks");

      while (this.dH() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dH() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aZ - this.ba < -180.0F) {
         this.ba -= 360.0F;
      }

      while (this.aZ - this.ba >= 180.0F) {
         this.ba += 360.0F;
      }

      while (this.dJ() - this.P < -180.0F) {
         this.P -= 360.0F;
      }

      while (this.dJ() - this.P >= 180.0F) {
         this.P += 360.0F;
      }

      while (this.bb - this.bc < -180.0F) {
         this.bc -= 360.0F;
      }

      while (this.bb - this.bc >= 180.0F) {
         this.bc += 360.0F;
      }

      this.dR().ag().c();
      this.bj += $$6;
      if (this.fC()) {
         this.bC++;
      } else {
         this.bC = 0;
      }

      if (this.fJ()) {
         this.t(0.0F);
      }

      this.z();
      float $$10 = this.ed();
      if ($$10 != this.bH) {
         this.bH = $$10;
         this.i_();
      }
   }

   private void D() {
      Map<bso, cud> $$0 = this.E();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bso, cud> E() {
      Map<bso, cud> $$0 = null;

      for (bso $$1 : bso.values()) {
         cud $$2 = switch ($$1.a()) {
            case a -> this.f($$1);
            case b -> this.e($$1);
            case c -> this.bZ;
         };
         cud $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bso.class);
            }

            $$0.put($$1, $$3);
            buh $$4 = this.eU();
            if (!$$2.e()) {
               $$2.a($$1, ($$3x, $$4x) -> {
                  bug $$5 = $$4.a($$3x);
                  if ($$5 != null) {
                     $$5.e($$4x);
                  }

                  czo.a($$2, this, $$1);
               });
            }

            if (!$$3.e()) {
               $$3.a($$1, ($$3x, $$4x) -> {
                  bug $$5 = $$4.a($$3x);
                  if ($$5 != null) {
                     $$5.b($$4x.b());
                     $$5.c($$4x);
                  }

                  if (this.dR() instanceof aqm $$7) {
                     czo.a($$7, $$3, this, $$1);
                  }
               });
            }
         }
      }

      return $$0;
   }

   public boolean a(cud $$0, cud $$1) {
      return !cud.a($$1, $$0);
   }

   private void a(Map<bso, cud> $$0) {
      cud $$1 = $$0.get(bso.a);
      cud $$2 = $$0.get(bso.b);
      if ($$1 != null && $$2 != null && cud.a($$1, this.f(bso.b)) && cud.a($$2, this.f(bso.a))) {
         ((aqm)this.dR()).l().b(this, new acr(this, (byte)55));
         $$0.remove(bso.a);
         $$0.remove(bso.b);
         this.c(bso.a, $$1.s());
         this.c(bso.b, $$2.s());
      }
   }

   private void b(Map<bso, cud> $$0) {
      List<Pair<bso, cud>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cud $$3 = $$2.s();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
               break;
            case c:
               this.bZ = $$3;
         }
      });
      ((aqm)this.dR()).l().b(this, new aev(this.an(), $$1));
   }

   private cud e(bso $$0) {
      return this.bY.get($$0.b());
   }

   private void b(bso $$0, cud $$1) {
      this.bY.set($$0.b(), $$1);
   }

   private cud f(bso $$0) {
      return this.bX.get($$0.b());
   }

   private void c(bso $$0, cud $$1) {
      this.bX.set($$0.b(), $$1);
   }

   protected float f(float $$0, float $$1) {
      float $$2 = ayg.g($$0 - this.aZ);
      this.aZ += $$2 * 0.3F;
      float $$3 = ayg.g(this.dH() - this.aZ);
      float $$4 = this.fm();
      if (Math.abs($$3) > $$4) {
         this.aZ = this.aZ + ($$3 - (float)ayg.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float fm() {
      return 50.0F;
   }

   public void m_() {
      if (this.ch > 0) {
         this.ch--;
      }

      if (this.dc()) {
         this.bs = 0;
         this.f(this.dw(), this.dy(), this.dC());
      }

      if (this.bs > 0) {
         this.a(this.bs, this.bt, this.bu, this.bv, this.bw, this.bx);
         this.bs--;
      } else if (!this.dd()) {
         this.j(this.du().a(0.98));
      }

      if (this.bz > 0) {
         this.a(this.bz, this.by);
         this.bz--;
      }

      ewh $$0 = this.du();
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
      this.dR().ag().a("ai");
      if (this.fe()) {
         this.bo = false;
         this.bp = 0.0F;
         this.br = 0.0F;
      } else if (this.dd()) {
         this.dR().ag().a("newAi");
         this.fo();
         this.dR().ag().c();
      }

      this.dR().ag().c();
      this.dR().ag().a("jump");
      if (this.bo && this.ee()) {
         double $$4;
         if (this.bu()) {
            $$4 = this.b(awc.b);
         } else {
            $$4 = this.b(awc.a);
         }

         boolean $$6 = this.bg() && $$4 > 0.0;
         double $$7 = this.dk();
         if (!$$6 || this.aG() && !($$4 > $$7)) {
            if (!this.bu() || this.aG() && !($$4 > $$7)) {
               if ((this.aG() || $$6 && $$4 <= $$7) && this.ch == 0) {
                  this.fh();
                  this.ch = 10;
               }
            } else {
               this.c(awc.b);
            }
         } else {
            this.c(awc.a);
         }
      } else {
         this.ch = 0;
      }

      this.dR().ag().c();
      this.dR().ag().a("travel");
      this.bp *= 0.98F;
      this.br *= 0.98F;
      this.F();
      ewc $$8 = this.cM();
      ewh $$9 = new ewh((double)this.bp, (double)this.bq, (double)this.br);
      if (this.b(brr.B) || this.b(brr.y)) {
         this.n();
      }

      label104: {
         if (this.cS() instanceof cml $$10 && this.bF()) {
            this.c($$10, $$9);
            break label104;
         }

         this.a($$9);
      }

      this.dR().ag().c();
      this.dR().ag().a("freezing");
      if (!this.dR().B && !this.ez()) {
         int $$11 = this.co();
         if (this.aB && this.dF()) {
            this.k(Math.min(this.cr(), $$11 + 1));
         } else {
            this.k(Math.max(0, $$11 - 2));
         }
      }

      this.ea();
      this.eb();
      if (!this.dR().B && this.ai % 40 == 0 && this.cq() && this.dF()) {
         this.a(this.dS().u(), 1.0F);
      }

      this.dR().ag().c();
      this.dR().ag().a("push");
      if (this.bD > 0) {
         this.bD--;
         this.a($$8, this.cM());
      }

      this.r();
      this.dR().ag().c();
      if (!this.dR().B && this.fn() && this.bi()) {
         this.a(this.dS().i(), 1.0F);
      }
   }

   public boolean fn() {
      return false;
   }

   private void F() {
      boolean $$0 = this.i(7);
      if ($$0 && !this.aG() && !this.bT() && !this.b(brr.y)) {
         cud $$1 = this.a(bso.e);
         if ($$1.a(cug.nT) && csz.i($$1)) {
            $$0 = true;
            int $$2 = this.bC + 1;
            if (!this.dR().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, bso.e);
               }

               this.a(dxh.n);
            }
         } else {
            $$0 = false;
         }
      } else {
         $$0 = false;
      }

      if (!this.dR().B) {
         this.b(7, $$0);
      }
   }

   protected void fo() {
   }

   protected void r() {
      if (this.dR().x_()) {
         this.dR().a(dwv.a(cml.class), this.cM(), bsm.a(this)).forEach(this::E);
      } else {
         List<bsh> $$0 = this.dR().a(this, this.cM(), bsm.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dR().ab().c(dcc.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ah.a(4) == 0) {
               int $$2 = 0;

               for (bsh $$3 : $$0) {
                  if (!$$3.bT()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dS().h(), 6.0F);
               }
            }

            for (bsh $$4 : $$0) {
               this.E($$4);
            }
         }
      }
   }

   protected void a(ewc $$0, ewc $$1) {
      ewc $$2 = $$0.b($$1);
      List<bsh> $$3 = this.dR().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bsh $$4 : $$3) {
            if ($$4 instanceof btc) {
               this.g((btc)$$4);
               this.bD = 0;
               this.j(this.du().a(-0.2));
               break;
            }
         }
      } else if (this.Q) {
         this.bD = 0;
      }

      if (!this.dR().B && this.bD <= 0) {
         this.c(4, false);
         this.bE = 0.0F;
         this.bF = null;
      }
   }

   protected void E(bsh $$0) {
      $$0.h(this);
   }

   protected void g(btc $$0) {
   }

   public boolean fp() {
      return (this.ao.a(aG) & 4) != 0;
   }

   @Override
   public void ad() {
      bsh $$0 = this.de();
      super.ad();
      if ($$0 != null && $$0 != this.de() && !this.dR().B) {
         this.b($$0);
      }
   }

   @Override
   public void u() {
      super.u();
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
      return this.bs > 0 ? this.bt : this.dw();
   }

   @Override
   public double d_() {
      return this.bs > 0 ? this.bu : this.dy();
   }

   @Override
   public double L_() {
      return this.bs > 0 ? this.bv : this.dC();
   }

   @Override
   public float M_() {
      return this.bs > 0 ? (float)this.bx : this.dJ();
   }

   @Override
   public float e_() {
      return this.bs > 0 ? (float)this.bw : this.dH();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.by = (double)$$0;
      this.bz = $$1;
   }

   public void t(boolean $$0) {
      this.bo = $$0;
   }

   public void a(civ $$0) {
      bsh $$1 = $$0.s();
      if ($$1 instanceof aqn) {
         am.R.a((aqn)$$1, $$0.p(), this);
      }
   }

   public void a(bsh $$0, int $$1) {
      if (!$$0.dM() && !this.dR().B && ($$0 instanceof civ || $$0 instanceof cmr || $$0 instanceof bss)) {
         ((aqm)this.dR()).l().b($$0, new afo($$0.an(), this.an(), $$1));
      }
   }

   public boolean F(bsh $$0) {
      if ($$0.dR() != this.dR()) {
         return false;
      } else {
         ewh $$1 = new ewh(this.dw(), this.dA(), this.dC());
         ewh $$2 = new ewh($$0.dw(), $$0.dA(), $$0.dC());
         return $$2.f($$1) > 128.0 ? false : this.dR().a(new dbp($$1, $$2, dbp.a.a, dbp.b.a, this)).c() == ewf.a.a;
      }
   }

   @Override
   public float i(float $$0) {
      return $$0 == 1.0F ? this.bb : ayg.i($$0, this.bc, this.bb);
   }

   public float A(float $$0) {
      float $$1 = this.aT - this.aS;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aS + $$1 * $$0;
   }

   @Override
   public boolean bB() {
      return !this.dM();
   }

   @Override
   public boolean bC() {
      return this.bF() && !this.N_() && !this.p_();
   }

   @Override
   public float cu() {
      return this.bb;
   }

   @Override
   public void o(float $$0) {
      this.bb = $$0;
   }

   @Override
   public void p(float $$0) {
      this.aZ = $$0;
   }

   @Override
   protected ewh a(jf.a $$0, l.a $$1) {
      return l(super.a($$0, $$1));
   }

   public static ewh l(ewh $$0) {
      return new ewh($$0.c, $$0.d, 0.0);
   }

   public float fq() {
      return this.ci;
   }

   public final void B(float $$0) {
      this.C(ayg.a($$0, 0.0F, this.eQ()));
   }

   protected void C(float $$0) {
      this.ci = $$0;
   }

   public void f_() {
   }

   public void g_() {
   }

   protected void fr() {
      this.cb = true;
   }

   public abstract bsw fs();

   public boolean ft() {
      return (this.ao.a(aG) & 1) > 0;
   }

   public bqg fu() {
      return (this.ao.a(aG) & 2) > 0 ? bqg.b : bqg.a;
   }

   private void H() {
      if (this.ft()) {
         if (cud.b(this.b(this.fu()), this.bA)) {
            this.bA = this.b(this.fu());
            this.a(this.bA);
         } else {
            this.fz();
         }
      }
   }

   protected void a(cud $$0) {
      $$0.b(this.dR(), this, this.fw());
      if (this.I()) {
         this.b($$0, 5);
      }

      if (--this.bB == 0 && !this.dR().B && !$$0.v()) {
         this.y();
      }
   }

   private boolean I() {
      int $$0 = this.bA.a(this) - this.fw();
      int $$1 = (int)((float)this.bA.a(this) * 0.21875F);
      boolean $$2 = $$0 > $$1;
      return $$2 && this.fw() % 4 == 0;
   }

   private void J() {
      this.co = this.cn;
      if (this.cf()) {
         this.cn = Math.min(1.0F, this.cn + 0.09F);
      } else {
         this.cn = Math.max(0.0F, this.cn - 0.09F);
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

   public void c(bqg $$0) {
      cud $$1 = this.b($$0);
      if (!$$1.e() && !this.ft()) {
         this.bA = $$1;
         this.bB = $$1.a(this);
         if (!this.dR().B) {
            this.c(1, true);
            this.c(2, $$0 == bqg.b);
            this.a(dxh.D);
         }
      }
   }

   @Override
   public void a(ajp<?> $$0) {
      super.a($$0);
      if (bR.equals($$0)) {
         if (this.dR().B) {
            this.fH().ifPresent(this::a);
         }
      } else if (aG.equals($$0) && this.dR().B) {
         if (this.ft() && this.bA.e()) {
            this.bA = this.b(this.fu());
            if (!this.bA.e()) {
               this.bB = this.bA.a(this);
            }
         } else if (!this.ft() && !this.bA.e()) {
            this.bA = cud.l;
            this.bB = 0;
         }
      }
   }

   @Override
   public void a(fc.a $$0, ewh $$1) {
      super.a($$0, $$1);
      this.bc = this.bb;
      this.aZ = this.bb;
      this.ba = this.aZ;
   }

   protected void b(cud $$0, int $$1) {
      if (!$$0.e() && this.ft()) {
         if ($$0.u() == cvy.c) {
            this.a(this.c($$0), 0.5F, this.dR().z.i() * 0.1F + 0.9F);
         }

         if ($$0.u() == cvy.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ah.a(2), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(cud $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ewh $$3 = new ewh(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dJ() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dH() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ah.i()) * 0.6 - 0.3;
         ewh $$5 = new ewh(((double)this.ah.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dJ() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dH() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dw(), this.dA(), this.dC());
         this.dR().a(new lf(lj.S, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void y() {
      if (!this.dR().B || this.ft()) {
         bqg $$0 = this.fu();
         if (!this.bA.equals(this.b($$0))) {
            this.fy();
         } else {
            if (!this.bA.e() && this.ft()) {
               this.b(this.bA, 16);
               cud $$1 = this.bA.a(this.dR(), this);
               if ($$1 != this.bA) {
                  this.a($$0, $$1);
               }

               this.fz();
            }
         }
      }
   }

   public cud fv() {
      return this.bA;
   }

   public int fw() {
      return this.bB;
   }

   public int fx() {
      return this.ft() ? this.bA.a(this) - this.fw() : 0;
   }

   public void fy() {
      if (!this.bA.e()) {
         this.bA.a(this.dR(), this, this.fw());
         if (this.bA.v()) {
            this.H();
         }
      }

      this.fz();
   }

   public void fz() {
      if (!this.dR().B) {
         boolean $$0 = this.ft();
         this.c(1, false);
         if ($$0) {
            this.a(dxh.C);
         }
      }

      this.bA = cud.l;
      this.bB = 0;
   }

   public boolean fA() {
      if (this.ft() && !this.bA.e()) {
         cty $$0 = this.bA.g();
         return $$0.b(this.bA) != cvy.d ? false : $$0.a(this.bA, this) - this.bB >= 5;
      } else {
         return false;
      }
   }

   public boolean fB() {
      return this.bX();
   }

   public boolean fC() {
      return this.i(7);
   }

   @Override
   public boolean cf() {
      return super.cf() || !this.fC() && this.c(bto.b);
   }

   public int fD() {
      return this.bC;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dw();
      double $$5 = this.dy();
      double $$6 = this.dC();
      double $$7 = $$1;
      boolean $$8 = false;
      ja $$9 = ja.a($$0, $$1, $$2);
      dcg $$10 = this.dR();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.I_()) {
            ja $$12 = $$9.d();
            dsl $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.c($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cM())) {
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

         if (this instanceof btl $$14) {
            $$14.J().n();
         }

         return true;
      }
   }

   public boolean fE() {
      return !this.ez();
   }

   public boolean fF() {
      return true;
   }

   public void a(ja $$0, boolean $$1) {
   }

   public boolean f(cud $$0) {
      return false;
   }

   @Override
   public final bsk a(bto $$0) {
      return $$0 == bto.c ? aH : this.e($$0).a(this.ed());
   }

   protected bsk e(bto $$0) {
      return this.am().n().a(this.ec());
   }

   public ImmutableList<bto> fG() {
      return ImmutableList.of(bto.a);
   }

   public ewc f(bto $$0) {
      bsk $$1 = this.a($$0);
      return new ewc((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bto $$0) {
      ewc $$1 = this.a($$0).a(this.dp());
      return this.dR().b(this, $$1);
   }

   @Override
   public boolean cy() {
      return super.cy() && !this.fJ();
   }

   public Optional<ja> fH() {
      return this.ao.a(bR);
   }

   public void g(ja $$0) {
      this.ao.a(bR, Optional.of($$0));
   }

   public void fI() {
      this.ao.a(bR, Optional.empty());
   }

   public boolean fJ() {
      return this.fH().isPresent();
   }

   public void b(ja $$0) {
      if (this.bT()) {
         this.ad();
      }

      dsl $$1 = this.dR().a_($$0);
      if ($$1.b() instanceof dfb) {
         this.dR().a($$0, $$1.a(dfb.c, Boolean.valueOf(true)), 3);
      }

      this.b(bto.c);
      this.a($$0);
      this.g($$0);
      this.j(ewh.b);
      this.av = true;
   }

   private void a(ja $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean L() {
      return this.fH().map($$0 -> this.dR().a_($$0).b() instanceof dfb).orElse(false);
   }

   public void fK() {
      this.fH().filter(this.dR()::B).ifPresent($$0x -> {
         dsl $$1 = this.dR().a_($$0x);
         if ($$1.b() instanceof dfb) {
            jf $$2 = $$1.c(dfb.aE);
            this.dR().a($$0x, $$1.a(dfb.c, Boolean.valueOf(false)), 3);
            ewh $$3 = dfb.a(this.am(), this.dR(), $$0x, $$2, this.dH()).orElseGet(() -> {
               ja $$1x = $$0x.c();
               return new ewh((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            ewh $$4 = ewh.c($$0x).d($$3).d();
            float $$5 = (float)ayg.d(ayg.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.c, $$3.d, $$3.e);
            this.s($$5);
            this.t(0.0F);
         }
      });
      ewh $$0 = this.dp();
      this.b(bto.a);
      this.a_($$0.c, $$0.d, $$0.e);
      this.fI();
   }

   @Nullable
   public jf fL() {
      ja $$0 = this.fH().orElse(null);
      return $$0 != null ? dfb.a(this.dR(), $$0) : null;
   }

   @Override
   public boolean bG() {
      return !this.fJ() && super.bG();
   }

   public cud g(cud $$0) {
      return cud.l;
   }

   public final cud a(dcg $$0, cud $$1) {
      cpf $$2 = $$1.a(kn.v);
      return $$2 != null ? this.a($$0, $$1, $$2) : $$1;
   }

   public cud a(dcg $$0, cud $$1, cpf $$2) {
      $$0.a(null, this.dw(), this.dy(), this.dC(), this.d($$1), avi.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
      this.a($$2);
      $$1.a(1, this);
      this.a(dxh.m);
      return $$1;
   }

   private void a(cpf $$0) {
      if (!this.dR().x_()) {
         for (cpf.b $$2 : $$0.g()) {
            if (this.ah.i() < $$2.b()) {
               this.b($$2.a());
            }
         }
      }
   }

   private static byte g(bso $$0) {
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

   public void a(cty $$0, bso $$1) {
      this.dR().a(this, g($$1));
   }

   public static bso d(bqg $$0) {
      return $$0 == bqg.a ? bso.a : bso.b;
   }

   @Override
   public ewc h_() {
      if (this.a(bso.f).a(cug.uq)) {
         float $$0 = 0.5F;
         return this.cM().c(0.5, 0.5, 0.5);
      } else {
         return super.h_();
      }
   }

   public bso h(cud $$0) {
      ctf $$1 = ctf.c_($$0);
      if ($$1 != null) {
         bso $$2 = $$1.m();
         if (this.d($$2)) {
            return $$2;
         }
      }

      return bso.a;
   }

   private static btu a(btc $$0, bso $$1) {
      return $$1 != bso.f && $$1 != bso.a && $$1 != bso.b ? btu.a($$0, $$1, $$2 -> $$2.e() || $$0.h($$2) == $$1) : btu.a($$0, $$1);
   }

   @Nullable
   private static bso r(int $$0) {
      if ($$0 == 100 + bso.f.b()) {
         return bso.f;
      } else if ($$0 == 100 + bso.e.b()) {
         return bso.e;
      } else if ($$0 == 100 + bso.d.b()) {
         return bso.d;
      } else if ($$0 == 100 + bso.c.b()) {
         return bso.c;
      } else if ($$0 == 98) {
         return bso.a;
      } else if ($$0 == 99) {
         return bso.b;
      } else {
         return $$0 == 105 ? bso.g : null;
      }
   }

   @Override
   public btu a_(int $$0) {
      bso $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dF() {
      if (this.N_()) {
         return false;
      } else {
         boolean $$0 = !this.a(bso.f).a(awf.ba) && !this.a(bso.e).a(awf.ba) && !this.a(bso.d).a(awf.ba) && !this.a(bso.c).a(awf.ba) && !this.a(bso.g).a(awf.ba);
         return $$0 && super.dF();
      }
   }

   @Override
   public boolean ci() {
      return !this.dR().x_() && this.b(brr.x) || super.ci();
   }

   @Override
   public float dI() {
      return this.aZ;
   }

   @Override
   public void a(abo $$0) {
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

   public boolean fM() {
      return this.eV().g() instanceof cry;
   }

   @Override
   public float dL() {
      float $$0 = (float)this.g(buk.B);
      return this.cS() instanceof cml ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public ewh m(bsh $$0) {
      return this.dp().e(this.a($$0, this.a(this.at()), this.ed() * this.ec()));
   }

   protected void a(int $$0, double $$1) {
      this.bb = (float)ayg.e(1.0 / (double)$$0, (double)this.bb, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(ayg.c((double)$$0 * this.g(buk.h)));
   }

   public boolean fN() {
      return false;
   }

   @Override
   public boolean b(bra $$0) {
      if (super.b($$0)) {
         return true;
      } else {
         if (this.dR() instanceof aqm $$1 && czo.a($$1, this, $$0)) {
            return true;
         }

         return false;
      }
   }

   public static record a(avg a, avg b) {
   }
}
