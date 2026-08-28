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

public abstract class bsy extends bsd implements bsa {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final bue e = new bue(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, bue.a.c);
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
   protected static final ajp<Byte> aF = ajt.a(bsy.class, ajr.a);
   private static final ajp<Float> bL = ajt.a(bsy.class, ajr.d);
   private static final ajp<List<lh>> bM = ajt.a(bsy.class, ajr.m);
   private static final ajp<Boolean> bN = ajt.a(bsy.class, ajr.k);
   private static final ajp<Integer> bO = ajt.a(bsy.class, ajr.b);
   private static final ajp<Integer> bP = ajt.a(bsy.class, ajr.b);
   private static final ajp<Optional<ja>> bQ = ajt.a(bsy.class, ajr.p);
   private static final int bR = 15;
   protected static final bsg aG = bsg.c(0.2F, 0.2F).b(0.2F);
   public static final float aH = 0.5F;
   public static final float aI = 0.5F;
   private static final float bS = 0.21875F;
   private final bud bT;
   private final bqt bU = new bqt(this);
   private final Map<jj<brj>, brl> bV = Maps.newHashMap();
   private final js<cua> bW = js.a(2, cua.l);
   private final js<cua> bX = js.a(4, cua.l);
   private cua bY = cua.l;
   public boolean aJ;
   private boolean bZ = false;
   public bqc aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public int aQ;
   public float aR;
   public float aS;
   protected int aT;
   public final btz aU = new btz();
   public final int aV = 20;
   public final float aW;
   public final float aX;
   public float aY;
   public float aZ;
   public float ba;
   public float bb;
   @Nullable
   protected cmh bc;
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
   private bsy cb;
   private int cc;
   @Nullable
   private bsy cd;
   private int ce;
   private float cf;
   private int cg;
   private float ch;
   protected cua bz = cua.l;
   protected int bA;
   protected int bB;
   private ja ci;
   private Optional<ja> cj = Optional.empty();
   @Nullable
   private bqw ck;
   private long cl;
   protected int bC;
   protected float bD;
   @Nullable
   protected cua bE;
   private float cm;
   private float cn;
   protected bua<?> bF;
   private boolean co;
   private final Reference2ObjectMap<czj, Set<daa>> cp = new Reference2ObjectArrayMap();
   protected float bG = 1.0F;

   protected bsy(bsj<? extends bsy> $$0, dcd $$1) {
      super($$0, $$1);
      this.bT = new bud(buh.a($$0));
      this.u(this.eN());
      this.J = true;
      this.aX = (float)((Math.random() + 1.0) * 0.01F);
      this.at();
      this.aW = (float)Math.random() * 12398.0F;
      this.s((float)(Math.random() * (float) (Math.PI * 2)));
      this.ba = this.dF();
      ul $$2 = ul.a;
      this.bF = this.a(new Dynamic($$2, (uu)$$2.createMap(ImmutableMap.of($$2.a("memories"), (uu)$$2.emptyMap()))));
   }

   public bua<?> dT() {
      return this.bF;
   }

   protected bua.b<?> dU() {
      return bua.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bua<?> a(Dynamic<?> $$0) {
      return this.dU().a($$0);
   }

   @Override
   public void an() {
      this.a(this.dQ().x(), Float.MAX_VALUE);
   }

   public boolean a(bsj<?> $$0) {
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

   public static buf.a dV() {
      return buf.a()
         .a(bug.s)
         .a(bug.p)
         .a(bug.v)
         .a(bug.a)
         .a(bug.b)
         .a(bug.r)
         .a(bug.B)
         .a(bug.y)
         .a(bug.n)
         .a(bug.x)
         .a(bug.k)
         .a(bug.o)
         .a(bug.w)
         .a(bug.h)
         .a(bug.i)
         .a(bug.E)
         .a(bug.u)
         .a(bug.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, dsh $$2, ja $$3) {
      if (!this.be()) {
         this.bm();
      }

      if (this.dP() instanceof aqk $$4 && $$1 && this.ac > 0.0F) {
         this.a($$4, $$3);
         double $$5 = this.g(bug.x);
         if ((double)this.ac > $$5 && !$$2.i()) {
            double $$6 = this.du();
            double $$7 = this.dw();
            double $$8 = this.dA();
            ja $$9 = this.dp();
            if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
               double $$10 = $$6 - (double)$$3.u() - 0.5;
               double $$11 = $$8 - (double)$$3.w() - 0.5;
               double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
               $$6 = (double)$$3.u() + 0.5 + $$10 / $$12 * 0.5;
               $$8 = (double)$$3.w() + 0.5 + $$11 / $$12 * 0.5;
            }

            float $$13 = (float)aye.c((double)this.ac - $$5);
            double $$14 = Math.min((double)(0.2F + $$13 / 15.0F), 2.5);
            int $$15 = (int)(150.0 * $$14);
            ((aqk)this.dP()).a(new lb(lj.b, $$2), $$6, $$7, $$8, $$15, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cj = Optional.empty();
      }
   }

   public final boolean dW() {
      return this.ak().a(avy.m);
   }

   public float a(float $$0) {
      return aye.i($$0, this.cn, this.cm);
   }

   public boolean dX() {
      return this.ds().b() < 1.0E-5F && this.bi();
   }

   @Override
   public void au() {
      this.aR = this.aS;
      if (this.an) {
         this.fF().ifPresent(this::a);
      }

      if (this.dP() instanceof aqk $$0) {
         czl.b($$0, this);
      }

      super.au();
      this.dP().ag().a("livingEntityBaseTick");
      if (this.bd() || this.dP().B) {
         this.aC();
      }

      if (this.bD()) {
         boolean $$1 = this instanceof cmh;
         if (!this.dP().B) {
            if (this.bE()) {
               this.a(this.dQ().g(), 1.0F);
            } else if ($$1 && !this.dP().C_().a(this.cK())) {
               double $$2 = this.dP().C_().a(this) + this.dP().C_().n();
               if ($$2 < 0.0) {
                  double $$3 = this.dP().C_().o();
                  if ($$3 > 0.0) {
                     this.a(this.dQ().w(), (float)Math.max(1, aye.a(-$$2 * $$3)));
                  }
               }
            }
         }

         if (this.a(awa.a) && !this.dP().a_(ja.a(this.du(), this.dy(), this.dA())).a(dfh.nd)) {
            boolean $$4 = !this.dW() && !brm.c(this) && (!$$1 || !((cmh)this).fZ().a);
            if ($$4) {
               this.j(this.m(this.cl()));
               if (this.cl() == -20) {
                  this.j(0);
                  evz $$5 = this.ds();

                  for (int $$6 = 0; $$6 < 8; $$6++) {
                     double $$7 = this.ah.j() - this.ah.j();
                     double $$8 = this.ah.j() - this.ah.j();
                     double $$9 = this.ah.j() - this.ah.j();
                     this.dP().a(lj.d, this.du() + $$7, this.dw() + $$8, this.dA() + $$9, $$5.c, $$5.d, $$5.e);
                  }

                  this.a(this.dQ().i(), 2.0F);
               }
            }

            if (!this.dP().B && this.bR() && this.dc() != null && this.dc().bT()) {
               this.ac();
            }
         } else if (this.cl() < this.ck()) {
            this.j(this.n(this.cl()));
         }

         if (this.dP() instanceof aqk $$10) {
            ja $$11 = this.dp();
            if (!Objects.equal(this.ci, $$11)) {
               this.ci = $$11;
               this.a($$10, $$11);
            }
         }
      }

      if (this.bD() && (this.bg() || this.aB)) {
         this.aH();
      }

      if (this.aO > 0) {
         this.aO--;
      }

      if (this.am > 0 && !(this instanceof aql)) {
         this.am--;
      }

      if (this.ex() && this.dP().h(this)) {
         this.ed();
      }

      if (this.bd > 0) {
         this.bd--;
      } else {
         this.bc = null;
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

      this.eo();
      this.bj = this.bi;
      this.aZ = this.aY;
      this.bb = this.ba;
      this.O = this.dF();
      this.P = this.dH();
      this.dP().ag().c();
   }

   @Override
   protected float aN() {
      return aye.i((float)this.g(bug.u), super.aN(), 1.0F);
   }

   protected void dY() {
      buc $$0 = this.f(bug.v);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void dZ() {
      if (!this.bo().i()) {
         int $$0 = this.cm();
         if ($$0 > 0) {
            buc $$1 = this.f(bug.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cn();
            $$1.c(new bue(d, "Powder snow slow", (double)$$2, bue.a.a));
         }
      }
   }

   protected void a(aqk $$0, ja $$1) {
      czl.a($$0, this);
   }

   public boolean p_() {
      return false;
   }

   public float ea() {
      return this.p_() ? 0.5F : 1.0F;
   }

   public float eb() {
      bud $$0 = this.eS();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bug.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean ec() {
      return true;
   }

   protected void ed() {
      this.aQ++;
      if (this.aQ >= 20 && !this.dP().x_() && !this.dK()) {
         this.dP().a(this, (byte)60);
         this.a(bsd.c.a);
      }
   }

   public boolean ee() {
      return !this.p_();
   }

   protected boolean ef() {
      return !this.p_();
   }

   protected int m(int $$0) {
      buc $$1 = this.f(bug.w);
      double $$2;
      if ($$1 != null) {
         $$2 = $$1.f();
      } else {
         $$2 = 0.0;
      }

      return $$2 > 0.0 && this.ah.j() >= 1.0 / ($$2 + 1.0) ? $$0 : $$0 - 1;
   }

   protected int n(int $$0) {
      return Math.min($$0 + 4, this.ck());
   }

   public final int a(aqk $$0, @Nullable bsd $$1) {
      return czl.a($$0, $$1, this, this.eg());
   }

   protected int eg() {
      return 0;
   }

   protected boolean eh() {
      return false;
   }

   @Nullable
   public bsy ei() {
      return this.cb;
   }

   @Override
   public bsy T_() {
      return this.ei();
   }

   public int ej() {
      return this.cc;
   }

   public void c(@Nullable cmh $$0) {
      this.bc = $$0;
      this.bd = this.ai;
   }

   public void a(@Nullable bsy $$0) {
      this.cb = $$0;
      this.cc = this.ai;
   }

   @Nullable
   public bsy ek() {
      return this.cd;
   }

   public int el() {
      return this.ce;
   }

   public void A(bsd $$0) {
      if ($$0 instanceof bsy) {
         this.cd = (bsy)$$0;
      } else {
         this.cd = null;
      }

      this.ce = this.ai;
   }

   public int em() {
      return this.bf;
   }

   public void o(int $$0) {
      this.bf = $$0;
   }

   public boolean en() {
      return this.bZ;
   }

   public void q(boolean $$0) {
      this.bZ = $$0;
   }

   protected boolean b(bsk $$0) {
      return true;
   }

   public void a(bsk $$0, cua $$1, cua $$2) {
      boolean $$3 = $$2.e() && $$1.e();
      if (!$$3 && !cua.c($$1, $$2) && !this.an) {
         ctc $$4 = ctc.c_($$2);
         if (!this.dP().x_() && !this.N_()) {
            if (!this.aW() && $$4 != null && $$4.m() == $$0) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), $$4.n(), this.de(), 1.0F, 1.0F, this.ah.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? dxa.v : dxa.S);
            }
         }
      }
   }

   @Override
   public void a(bsd.c $$0) {
      if ($$0 == bsd.c.a || $$0 == bsd.c.b) {
         for (brl $$1 : this.et()) {
            $$1.a(this, $$0);
         }
      }

      super.a($$0);
      this.bF.a();
   }

   @Override
   public void b(tx $$0) {
      $$0.a("Health", this.ew());
      $$0.a("HurtTime", (short)this.aO);
      $$0.a("HurtByTimestamp", this.cc);
      $$0.a("DeathTime", (short)this.aQ);
      $$0.a("AbsorptionAmount", this.fo());
      $$0.a("Attributes", this.eS().c());
      if (!this.bV.isEmpty()) {
         ud $$1 = new ud();

         for (brl $$2 : this.bV.values()) {
            $$1.add($$2.j());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fA());
      this.fF().ifPresent($$1 -> {
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
      if ($$0.b("Attributes", 9) && this.dP() != null && !this.dP().B) {
         this.eS().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         ud $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tx $$3 = $$1.a($$2);
            brl $$4 = brl.a($$3);
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
         exd $$6 = this.dP().M();
         ewy $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cA(), $$7);
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
         this.ao.a(at, btk.c);
         if (!this.an) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bF = this.a(new Dynamic(ul.a, $$0.c("Brain")));
      }
   }

   protected void eo() {
      Iterator<jj<brj>> $$0 = this.bV.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            jj<brj> $$1 = $$0.next();
            brl $$2 = this.bV.get($$1);
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

      List<lh> $$3 = this.ao.a(bM);
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
         this.er();
         this.k(false);
      } else {
         this.k(this.b(brn.n));
         this.s();
      }
   }

   private void s() {
      List<lh> $$0 = this.bV.values().stream().filter(brl::g).map(brl::a).toList();
      this.ao.a(bM, $$0);
      this.ao.a(bN, c(this.bV.values()));
   }

   private void v() {
      boolean $$0 = this.cg();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable bsd $$0) {
      double $$1 = 1.0;
      if (this.bY()) {
         $$1 *= 0.8;
      }

      if (this.ch()) {
         float $$2 = this.eZ();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cua $$3 = this.a(bsk.f);
         bsj<?> $$4 = $$0.ak();
         if ($$4 == bsj.aN && $$3.a(cud.ul)
            || $$4 == bsj.bu && $$3.a(cud.uo)
            || $$4 == bsj.aA && $$3.a(cud.ur)
            || $$4 == bsj.aB && $$3.a(cud.ur)
            || $$4 == bsj.x && $$3.a(cud.up)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bsy $$0) {
      return $$0 instanceof cmh && this.dP().al() == bqa.a ? false : $$0.ep();
   }

   public boolean a(bsy $$0, cdp $$1) {
      return $$1.a(this, $$0);
   }

   public boolean ep() {
      return !this.cu() && this.eq();
   }

   public boolean eq() {
      return !this.N_() && this.bD();
   }

   public static boolean c(Collection<brl> $$0) {
      for (brl $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void er() {
      this.ao.a(bM, List.of());
   }

   public boolean es() {
      if (this.dP().B) {
         return false;
      } else {
         Iterator<brl> $$0 = this.bV.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<brl> et() {
      return this.bV.values();
   }

   public Map<jj<brj>, brl> eu() {
      return this.bV;
   }

   public boolean b(jj<brj> $$0) {
      return this.bV.containsKey($$0);
   }

   @Nullable
   public brl c(jj<brj> $$0) {
      return this.bV.get($$0);
   }

   public final boolean b(brl $$0) {
      return this.b($$0, null);
   }

   public boolean b(brl $$0, @Nullable bsd $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         brl $$2 = this.bV.get($$0.c());
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

   public boolean c(brl $$0) {
      if (this.ak().a(avy.G)) {
         return !$$0.a(brn.M);
      } else if (this.ak().a(avy.F)) {
         return !$$0.a(brn.L);
      } else {
         return !this.ak().a(avy.w) ? true : !$$0.a(brn.j) && !$$0.a(brn.s);
      }
   }

   public void c(brl $$0, @Nullable bsd $$1) {
      if (this.c($$0)) {
         brl $$2 = this.bV.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean ev() {
      return this.ak().a(avy.x);
   }

   @Nullable
   public brl d(jj<brj> $$0) {
      return this.bV.remove($$0);
   }

   public boolean e(jj<brj> $$0) {
      brl $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(brl $$0, @Nullable bsd $$1) {
      this.ca = true;
      if (!this.dP().B) {
         $$0.c().a().a(this.eS(), $$0.e());
         this.d($$0);
      }
   }

   public void d(brl $$0) {
      for (bsd $$1 : this.cS()) {
         if ($$1 instanceof aql $$2) {
            $$2.c.b(new afu(this.al(), $$0, false));
         }
      }
   }

   protected void a(brl $$0, boolean $$1, @Nullable bsd $$2) {
      this.ca = true;
      if ($$1 && !this.dP().B) {
         brj $$3 = $$0.c().a();
         $$3.a(this.eS());
         $$3.a(this.eS(), $$0.e());
         this.z();
      }

      if (!this.dP().B) {
         this.d($$0);
      }
   }

   protected void a(brl $$0) {
      this.ca = true;
      if (!this.dP().B) {
         $$0.c().a().a(this.eS());
         this.z();

         for (bsd $$1 : this.cS()) {
            if ($$1 instanceof aql $$2) {
               $$2.c.b(new adz(this.al(), $$0.c()));
            }
         }
      }
   }

   private void z() {
      for (buc $$0 : this.eS().a()) {
         this.i($$0.a());
      }
   }

   private void i(jj<bub> $$0) {
      if ($$0.a(bug.s)) {
         float $$1 = this.eN();
         if (this.ew() > $$1) {
            this.u($$1);
         }
      } else if ($$0.a(bug.r)) {
         float $$2 = this.eO();
         if (this.fo() > $$2) {
            this.B($$2);
         }
      }
   }

   public void c(float $$0) {
      float $$1 = this.ew();
      if ($$1 > 0.0F) {
         this.u($$1 + $$0);
      }
   }

   public float ew() {
      return this.ao.a(bL);
   }

   public void u(float $$0) {
      this.ao.a(bL, aye.a($$0, 0.0F, this.eN()));
   }

   public boolean ex() {
      return this.ew() <= 0.0F;
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dP().B) {
         return false;
      } else if (this.ex()) {
         return false;
      } else if ($$0.a(avw.j) && this.b(brn.l)) {
         return false;
      } else {
         if (this.fH() && !this.dP().B) {
            this.fI();
         }

         this.bf = 0;
         float $$2 = $$1;
         boolean $$3 = false;
         float $$4 = 0.0F;
         if ($$1 > 0.0F && this.f($$0)) {
            this.w($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.a(avw.k) && $$0.c() instanceof bsy $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(avw.p) && this.ak().a(avy.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(avw.a) && !this.a(bsk.f).e()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.aU.a(1.5F);
         boolean $$7 = true;
         if ((float)this.am > 10.0F && !$$0.a(avw.f)) {
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

         bsd $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof bsy $$9 && !$$0.a(avw.r) && (!$$0.a(bqz.H) || !this.ak().a(avy.E))) {
               this.a($$9);
            }

            if ($$8 instanceof cmh $$10) {
               this.bd = 100;
               this.bc = $$10;
            } else if ($$8 instanceof cfr $$11 && $$11.s()) {
               this.bd = 100;
               if ($$11.P_() instanceof cmh $$12) {
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

            if (!$$0.a(avw.s) && (!$$3 || $$1 > 0.0F)) {
               this.bv();
            }

            if (!$$0.a(avw.A)) {
               double $$13 = 0.0;
               double $$14 = 0.0;
               if ($$0.c() instanceof cmz $$15) {
                  DoubleDoubleImmutablePair $$16 = $$15.a_(this, $$0);
                  $$13 = -$$16.leftDouble();
                  $$14 = -$$16.rightDouble();
               } else if ($$8 != null) {
                  $$13 = $$8.du() - this.du();
                  $$14 = $$8.dA() - this.dA();
               }

               this.q(0.4F, $$13, $$14);
               if (!$$3) {
                  this.a($$13, $$14);
               }
            }
         }

         if (this.ex()) {
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
            this.cl = this.dP().Z();

            for (brl $$18 : this.et()) {
               $$18.a(this, $$0, $$1);
            }
         }

         if (this instanceof aql) {
            am.i.a((aql)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((aql)this).a(avp.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof aql) {
            am.h.a((aql)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$17;
      }
   }

   protected void d(bsy $$0) {
      $$0.e(this);
   }

   protected void e(bsy $$0) {
      $$0.q(0.5, $$0.du() - this.du(), $$0.dA() - this.dA());
   }

   private boolean h(bqw $$0) {
      if ($$0.a(avw.e)) {
         return false;
      } else {
         cua $$1 = null;

         for (bqc $$2 : bqc.values()) {
            cua $$3 = this.b($$2);
            if ($$3.a(cud.vt)) {
               $$1 = $$3.s();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof aql $$4) {
               $$4.b(avp.c.b(cud.vt));
               am.C.a($$4, $$1);
               this.a(dxa.C);
            }

            this.u(1.0F);
            this.es();
            this.b(new brl(brn.j, 900, 1));
            this.b(new brl(brn.v, 100, 1));
            this.b(new brl(brn.l, 800, 0));
            this.dP().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bqw ey() {
      if (this.dP().Z() - this.cl > 40L) {
         this.ck = null;
      }

      return this.ck;
   }

   protected void e(bqw $$0) {
      this.b(this.d($$0));
   }

   public void b(@Nullable ave $$0) {
      if ($$0 != null) {
         this.a($$0, this.fa(), this.fb());
      }
   }

   public boolean f(bqw $$0) {
      bsd $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cmn $$3 && $$3.D() > 0) {
         $$2 = true;
      }

      if (!$$0.a(avw.d) && this.fy() && !$$2) {
         evz $$4 = $$0.h();
         if ($$4 != null) {
            evz $$5 = this.b(0.0F, this.cs());
            evz $$6 = $$4.a(this.dn());
            $$6 = new evz($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(cua $$0) {
      if (!$$0.e()) {
         if (!this.aW()) {
            this.dP().a(this.du(), this.dw(), this.dA(), $$0.K(), this.de(), 0.8F, 0.8F + this.dP().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bqw $$0) {
      if (!this.dK() && !this.be) {
         bsd $$1 = $$0.d();
         bsy $$2 = this.eM();
         if (this.bl >= 0 && $$2 != null) {
            $$2.a(this, this.bl, $$0);
         }

         if (this.fH()) {
            this.fI();
         }

         if (!this.dP().B && this.ag()) {
            b.info("Named entity {} died: {}", this, this.eL().a().getString());
         }

         this.be = true;
         this.eL().c();
         if (this.dP() instanceof aqk $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(dxa.p);
               this.g($$0);
               this.f($$2);
            }

            this.dP().a(this, (byte)3);
         }

         this.b(btk.h);
      }
   }

   protected void f(@Nullable bsy $$0) {
      if (!this.dP().B) {
         boolean $$1 = false;
         if ($$0 instanceof cie) {
            if (this.dP().ab().b(dbz.c)) {
               ja $$2 = this.dp();
               dsh $$3 = dfh.cd.o();
               if (this.dP().a_($$2).i() && $$3.a((dcg)this.dP(), $$2)) {
                  this.dP().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               cir $$4 = new cir(this.dP(), this.du(), this.dw(), this.dA(), new cua(cud.dw));
               this.dP().b($$4);
            }
         }
      }
   }

   protected void g(bqw $$0) {
      boolean $$1 = this.bd > 0;
      if (this.ef() && this.dP().ab().b(dbz.f)) {
         this.b($$0, $$1);
         this.a($$0, $$1);
      }

      this.ez();
      this.C($$0.d());
   }

   protected void ez() {
   }

   protected void C(@Nullable bsd $$0) {
      if (this.dP() instanceof aqk $$1 && !this.eD() && (this.eh() || this.bd > 0 && this.ee() && this.dP().ab().b(dbz.f))) {
         bso.a($$1, this.dn(), this.a($$1, $$0));
      }
   }

   protected void a(bqw $$0, boolean $$1) {
   }

   public akj<eqt> eA() {
      return this.ak().k();
   }

   public long eB() {
      return 0L;
   }

   protected float a(bsd $$0, bqw $$1) {
      float $$2 = (float)this.g(bug.d);
      return this.dP() instanceof aqk $$3 ? czl.d($$3, this.eT(), $$0, $$1, $$2) : $$2;
   }

   protected void b(bqw $$0, boolean $$1) {
      akj<eqt> $$2 = this.eA();
      eqt $$3 = this.dP().o().be().b($$2);
      eqr.a $$4 = new eqr.a((aqk)this.dP()).a(etk.a, this).a(etk.f, this.dn()).a(etk.c, $$0).b(etk.d, $$0.d()).b(etk.e, $$0.c());
      if ($$1 && this.bc != null) {
         $$4 = $$4.a(etk.b, this.bc).a(this.bc.gu());
      }

      eqr $$5 = $$4.a(etj.g);
      $$3.a($$5, this.eB(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.g(bug.p);
      if (!($$0 <= 0.0)) {
         this.av = true;
         evz $$3 = this.ds();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         evz $$4 = new evz($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aE() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected ave d(bqw $$0) {
      return avf.kg;
   }

   @Nullable
   protected ave o_() {
      return avf.kb;
   }

   private ave d(int $$0) {
      return $$0 > 4 ? this.eH().b() : this.eH().a();
   }

   public void eC() {
      this.co = true;
   }

   public boolean eD() {
      return this.co;
   }

   public float eE() {
      return 0.0F;
   }

   protected evu eF() {
      evu $$0 = this.cK();
      bsd $$1 = this.dc();
      if ($$1 != null) {
         evz $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<czj, Set<daa>> eG() {
      return this.cp;
   }

   public bsy.a eH() {
      return new bsy.a(avf.kh, avf.jZ);
   }

   protected ave c(cua $$0) {
      return $$0.I();
   }

   public ave d(cua $$0) {
      return $$0.J();
   }

   public Optional<ja> eI() {
      return this.cj;
   }

   public boolean q_() {
      if (this.N_()) {
         return false;
      } else {
         ja $$0 = this.dp();
         dsh $$1 = this.dq();
         if ($$1.a(avu.aP)) {
            this.cj = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dns && this.c($$0, $$1)) {
            this.cj = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(ja $$0, dsh $$1) {
      if ($$1.c(dns.b)) {
         dsh $$2 = this.dP().a_($$0.d());
         if ($$2.a(dfh.cO) && $$2.c(djl.b) == $$1.c(dns.aE)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean bD() {
      return !this.dK() && this.ew() > 0.0F;
   }

   @Override
   public int cx() {
      return this.v(0.0F);
   }

   protected final int v(float $$0) {
      return aye.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bqw $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.d($$0, $$1);
      if ($$4 > 0) {
         this.a(this.d($$4), 1.0F, 1.0F);
         this.eJ();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int d(float $$0, float $$1) {
      if (this.ak().a(avy.o)) {
         return 0;
      } else {
         float $$2 = (float)this.g(bug.x);
         float $$3 = $$0 - $$2;
         return aye.c((double)($$3 * $$1) * this.g(bug.k));
      }
   }

   protected void eJ() {
      if (!this.aW()) {
         int $$0 = aye.a(this.du());
         int $$1 = aye.a(this.dw() - 0.2F);
         int $$2 = aye.a(this.dA());
         dsh $$3 = this.dP().a_(new ja($$0, $$1, $$2));
         if (!$$3.i()) {
            dms $$4 = $$3.w();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void n(float $$0) {
      this.aP = 10;
      this.aO = this.aP;
   }

   public int eK() {
      return aye.a(this.g(bug.a));
   }

   protected void b(bqw $$0, float $$1) {
   }

   protected void c(bqw $$0, float $$1) {
   }

   protected void w(float $$0) {
   }

   protected void a(bqw $$0, float $$1, bsk... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bsk $$4 : $$2) {
            cua $$5 = this.a($$4);
            if ($$5.g() instanceof crp && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float d(bqw $$0, float $$1) {
      if (!$$0.a(avw.c)) {
         this.b($$0, $$1);
         $$1 = bqs.a(this, $$1, $$0, (float)this.eK(), (float)this.g(bug.b));
      }

      return $$1;
   }

   protected float e(bqw $$0, float $$1) {
      if ($$0.a(avw.g)) {
         return $$1;
      } else {
         if (this.b(brn.k) && !$$0.a(avw.h)) {
            int $$2 = (this.c(brn.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof aql) {
                  ((aql)this).a(avp.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof aql) {
                  ((aql)$$0.d()).a(avp.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(avw.i)) {
            return $$1;
         } else {
            float $$8;
            if (this.dP() instanceof aqk $$7) {
               $$8 = czl.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = bqs.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void f(bqw $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fo(), 0.0F);
         this.B(this.fo() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof aql $$4) {
            $$4.a(avp.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eL().a($$0, var9);
            this.u(this.ew() - var9);
            this.B(this.fo() - var9);
            this.a(dxa.o);
         }
      }
   }

   public bqt eL() {
      return this.bU;
   }

   @Nullable
   public bsy eM() {
      if (this.bc != null) {
         return this.bc;
      } else {
         return this.cb != null ? this.cb : null;
      }
   }

   public final float eN() {
      return (float)this.g(bug.s);
   }

   public final float eO() {
      return (float)this.g(bug.r);
   }

   public final int eP() {
      return this.ao.a(bO);
   }

   public final void p(int $$0) {
      this.ao.a(bO, $$0);
   }

   public final int eQ() {
      return this.ao.a(bP);
   }

   public final void q(int $$0) {
      this.ao.a(bP, $$0);
   }

   private int A() {
      if (brm.a(this)) {
         return 6 - (1 + brm.b(this));
      } else {
         return this.b(brn.d) ? 6 + (1 + this.c(brn.d).e()) * 2 : 6;
      }
   }

   public void a(bqc $$0) {
      this.a($$0, false);
   }

   public void a(bqc $$0, boolean $$1) {
      if (!this.aJ || this.aL >= this.A() / 2 || this.aL < 0) {
         this.aL = -1;
         this.aJ = true;
         this.aK = $$0;
         if (this.dP() instanceof aqk) {
            abq $$2 = new abq(this, $$0 == bqc.a ? 0 : 3);
            aqi $$3 = ((aqk)this.dP()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bqw $$0) {
      this.aU.a(1.5F);
      this.am = 20;
      this.aP = 10;
      this.aO = this.aP;
      ave $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.fa(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
      }

      this.a(this.dQ().o(), 0.0F);
      this.ck = $$0;
      this.cl = this.dP().Z();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            ave $$1 = this.o_();
            if ($$1 != null) {
               this.a($$1, this.fa(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cmh)) {
               this.u(0.0F);
               this.a(this.dQ().o());
            }
            break;
         case 29:
            this.a(avf.wD, 1.0F, 0.8F + this.dP().z.i() * 0.4F);
            break;
         case 30:
            this.a(avf.wE, 0.8F, 0.8F + this.dP().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ah.i() - 0.5F) * 0.2F;
               float $$6 = (this.ah.i() - 0.5F) * 0.2F;
               float $$7 = (this.ah.i() - 0.5F) * 0.2F;
               double $$8 = aye.d($$4, this.L, this.du()) + (this.ah.j() - 0.5) * (double)this.dj() * 2.0;
               double $$9 = aye.d($$4, this.M, this.dw()) + this.ah.j() * (double)this.dk();
               double $$10 = aye.d($$4, this.N, this.dA()) + (this.ah.j() - 0.5) * (double)this.dj() * 2.0;
               this.dP().a(lj.ac, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.a(bsk.a));
            break;
         case 48:
            this.i(this.a(bsk.b));
            break;
         case 49:
            this.i(this.a(bsk.f));
            break;
         case 50:
            this.i(this.a(bsk.e));
            break;
         case 51:
            this.i(this.a(bsk.d));
            break;
         case 52:
            this.i(this.a(bsk.c));
            break;
         case 54:
            diz.b(this);
            break;
         case 55:
            this.C();
            break;
         case 60:
            this.B();
            break;
         case 65:
            this.i(this.a(bsk.g));
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
      cua $$0 = this.a(bsk.b);
      this.a(bsk.b, this.a(bsk.a));
      this.a(bsk.a, $$0);
   }

   @Override
   protected void aD() {
      this.a(this.dQ().n(), 4.0F);
   }

   protected void eR() {
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
   public buc f(jj<bub> $$0) {
      return this.eS().a($$0);
   }

   public double g(jj<bub> $$0) {
      return this.eS().c($$0);
   }

   public double h(jj<bub> $$0) {
      return this.eS().d($$0);
   }

   public bud eS() {
      return this.bT;
   }

   public cua eT() {
      return this.a(bsk.a);
   }

   public cua eU() {
      return this.a(bsk.b);
   }

   public boolean b(ctv $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cua> $$0) {
      return $$0.test(this.eT()) || $$0.test(this.eU());
   }

   public cua b(bqc $$0) {
      if ($$0 == bqc.a) {
         return this.a(bsk.a);
      } else if ($$0 == bqc.b) {
         return this.a(bsk.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bqc $$0, cua $$1) {
      if ($$0 == bqc.a) {
         this.a(bsk.a, $$1);
      } else {
         if ($$0 != bqc.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bsk.b, $$1);
      }
   }

   public boolean c(bsk $$0) {
      return !this.a($$0).e();
   }

   public boolean d(bsk $$0) {
      return false;
   }

   public abstract Iterable<cua> eV();

   public abstract cua a(bsk var1);

   public abstract void a(bsk var1, cua var2);

   public Iterable<cua> eW() {
      return List.of();
   }

   public Iterable<cua> eX() {
      return this.eV();
   }

   public Iterable<cua> eY() {
      return Iterables.concat(this.eW(), this.eX());
   }

   protected void e(cua $$0) {
      $$0.g().m($$0);
   }

   public float eZ() {
      Iterable<cua> $$0 = this.eV();
      int $$1 = 0;
      int $$2 = 0;

      for (cua $$3 : $$0) {
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
      buc $$1 = this.f(bug.v);
      $$1.b(e.b());
      if ($$0) {
         $$1.c(e);
      }
   }

   protected float fa() {
      return 1.0F;
   }

   public float fb() {
      return this.p_() ? (this.ah.i() - this.ah.i()) * 0.2F + 1.5F : (this.ah.i() - this.ah.i()) * 0.2F + 1.0F;
   }

   protected boolean fc() {
      return this.ex();
   }

   @Override
   public void h(bsd $$0) {
      if (!this.fH()) {
         super.h($$0);
      }
   }

   private void b(bsd $$0) {
      evz $$1;
      if (this.dK()) {
         $$1 = this.dn();
      } else if (!$$0.dK() && !this.dP().a_($$0.dp()).a(avu.aJ)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dw(), $$0.dw());
         $$1 = new evz(this.du(), $$2, this.dA());
      }

      this.a($$1.c, $$1.d, $$1.e);
   }

   @Override
   public boolean cF() {
      return this.cE();
   }

   protected float fd() {
      return this.x(1.0F);
   }

   protected float x(float $$0) {
      return (float)this.g(bug.o) * $$0 * this.aM() + this.fe();
   }

   public float fe() {
      return this.b(brn.h) ? 0.1F * ((float)this.c(brn.h).e() + 1.0F) : 0.0F;
   }

   protected void ff() {
      float $$0 = this.fd();
      if (!($$0 <= 1.0E-5F)) {
         evz $$1 = this.ds();
         this.o($$1.c, (double)$$0, $$1.e);
         if (this.cb()) {
            float $$2 = this.dF() * (float) (Math.PI / 180.0);
            this.i(new evz((double)(-aye.a($$2)) * 0.2, 0.0, (double)aye.b($$2) * 0.2));
         }

         this.av = true;
      }
   }

   protected void fg() {
      this.h(this.ds().b(0.0, -0.04F, 0.0));
   }

   protected void c(awk<eoa> $$0) {
      this.h(this.ds().b(0.0, 0.04F, 0.0));
   }

   protected float fh() {
      return 0.8F;
   }

   public boolean a(eob $$0) {
      return false;
   }

   @Override
   protected double aY() {
      return this.g(bug.n);
   }

   public void a(evz $$0) {
      if (this.da()) {
         double $$1 = this.aZ();
         boolean $$2 = this.ds().d <= 0.0;
         if ($$2 && this.b(brn.B)) {
            $$1 = Math.min($$1, 0.01);
         }

         eob $$3 = this.dP().b_(this.dp());
         if (this.be() && this.ec() && !this.a($$3)) {
            double $$4 = this.dw();
            float $$5 = this.cb() ? 0.9F : this.fh();
            float $$6 = 0.02F;
            float $$7 = (float)this.g(bug.E);
            if (!this.aE()) {
               $$7 *= 0.5F;
            }

            if ($$7 > 0.0F) {
               $$5 += (0.54600006F - $$5) * $$7;
               $$6 += (this.fj() - $$6) * $$7;
            }

            if (this.b(brn.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(btd.a, this.ds());
            evz $$8 = this.ds();
            if (this.Q && this.q_()) {
               $$8 = new evz($$8.c, 0.2, $$8.e);
            }

            this.h($$8.d((double)$$5, 0.8F, (double)$$5));
            evz $$9 = this.a($$1, $$2, this.ds());
            this.h($$9);
            if (this.Q && this.g($$9.c, $$9.d + 0.6F - this.dw() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bs() && this.ec() && !this.a($$3)) {
            double $$10 = this.dw();
            this.a(0.02F, $$0);
            this.a(btd.a, this.ds());
            if (this.b(awa.b) <= this.di()) {
               this.h(this.ds().d(0.5, 0.8F, 0.5));
               evz $$11 = this.a($$1, $$2, this.ds());
               this.h($$11);
            } else {
               this.h(this.ds().a(0.5));
            }

            if ($$1 != 0.0) {
               this.h(this.ds().b(0.0, -$$1 / 4.0, 0.0));
            }

            evz $$12 = this.ds();
            if (this.Q && this.g($$12.c, $$12.d + 0.6F - this.dw() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fA()) {
            this.cq();
            evz $$13 = this.ds();
            evz $$14 = this.bL();
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
               double $$21 = $$17 * (double)(-aye.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.h($$13.d(0.99F, 0.98F, 0.99F));
            this.a(btd.a, this.ds());
            if (this.Q && !this.dP().B) {
               double $$22 = this.ds().h();
               double $$23 = $$17 - $$22;
               float $$24 = (float)($$23 * 10.0 - 3.0);
               if ($$24 > 0.0F) {
                  this.a(this.d((int)$$24), 1.0F, 1.0F);
                  this.a(this.dQ().m(), $$24);
               }
            }

            if (this.aE() && !this.dP().B) {
               this.b(7, false);
            }
         } else {
            ja $$25 = this.aK();
            float $$26 = this.dP().a_($$25).b().h();
            float $$27 = this.aE() ? $$26 * 0.91F : 0.91F;
            evz $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.b(brn.y)) {
               $$29 += (0.05 * (double)(this.c(brn.y).e() + 1) - $$28.d) * 0.2;
            } else if (!this.dP().B || this.dP().B($$25)) {
               $$29 -= $$1;
            } else if (this.dw() > (double)this.dP().I_()) {
               $$29 = -0.1;
            } else {
               $$29 = 0.0;
            }

            if (this.en()) {
               this.o($$28.c, $$29, $$28.e);
            } else {
               this.o($$28.c * (double)$$27, this instanceof cex ? $$29 * (double)$$27 : $$29 * 0.98F, $$28.e * (double)$$27);
            }
         }
      }

      this.r(this instanceof cex);
   }

   private void c(cmh $$0, evz $$1) {
      evz $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.da()) {
         this.z(this.e($$0));
         this.a($$2);
      } else {
         this.r(false);
         this.h(evz.b);
         this.aF();
      }
   }

   protected void a(cmh $$0, evz $$1) {
   }

   protected evz b(cmh $$0, evz $$1) {
      return $$1;
   }

   protected float e(cmh $$0) {
      return this.fj();
   }

   public void r(boolean $$0) {
      float $$1 = (float)aye.g(this.du() - this.L, $$0 ? this.dw() - this.M : 0.0, this.dA() - this.N);
      this.y($$1);
   }

   protected void y(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aU.a($$1, 0.4F);
   }

   public evz a(evz $$0, float $$1) {
      this.a(this.D($$1), $$0);
      this.h(this.k(this.ds()));
      this.a(btd.a, this.ds());
      evz $$2 = this.ds();
      if ((this.Q || this.bn) && (this.q_() || this.dq().a(dfh.qP) && dkz.a(this))) {
         $$2 = new evz($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public evz a(double $$0, boolean $$1, evz $$2) {
      if ($$0 != 0.0 && !this.cb()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new evz($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private evz k(evz $$0) {
      if (this.q_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = aye.a($$0.c, -0.15F, 0.15F);
         double $$3 = aye.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dq().a(dfh.nS) && this.fz() && this instanceof cmh) {
            $$4 = 0.0;
         }

         $$0 = new evz($$2, $$4, $$3);
      }

      return $$0;
   }

   private float D(float $$0) {
      return this.aE() ? this.fj() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fi();
   }

   protected float fi() {
      return this.cQ() instanceof cmh ? this.fj() * 0.1F : 0.02F;
   }

   public float fj() {
      return this.cf;
   }

   public void z(float $$0) {
      this.cf = $$0;
   }

   public boolean D(bsd $$0) {
      this.A($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.H();
      this.K();
      if (!this.dP().B) {
         int $$0 = this.eP();
         if ($$0 > 0) {
            if (this.aM <= 0) {
               this.aM = 20 * (30 - $$0);
            }

            this.aM--;
            if (this.aM <= 0) {
               this.p($$0 - 1);
            }
         }

         int $$1 = this.eQ();
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
            this.eL().c();
         }

         if (this.fH() && !this.M()) {
            this.fI();
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
         float $$8 = (float)aye.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = aye.e(aye.g(this.dF()) - $$8);
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
      if (this.fA()) {
         this.bB++;
      } else {
         this.bB = 0;
      }

      if (this.fH()) {
         this.t(0.0F);
      }

      this.z();
      float $$10 = this.eb();
      if ($$10 != this.bG) {
         this.bG = $$10;
         this.j_();
      }
   }

   private void D() {
      Map<bsk, cua> $$0 = this.E();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bsk, cua> E() {
      Map<bsk, cua> $$0 = null;

      for (bsk $$1 : bsk.values()) {
         cua $$2 = switch ($$1.a()) {
            case a -> this.g($$1);
            case b -> this.f($$1);
            case c -> this.bY;
         };
         cua $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bsk.class);
            }

            $$0.put($$1, $$3);
            bud $$4 = this.eS();
            if (!$$2.e()) {
               $$2.a($$1, ($$3x, $$4x) -> {
                  buc $$5 = $$4.a($$3x);
                  if ($$5 != null) {
                     $$5.e($$4x);
                  }

                  czl.a($$2, this, $$1);
               });
            }

            if (!$$3.e()) {
               $$3.a($$1, ($$3x, $$4x) -> {
                  buc $$5 = $$4.a($$3x);
                  if ($$5 != null) {
                     $$5.b($$4x.b());
                     $$5.c($$4x);
                  }

                  if (this.dP() instanceof aqk $$7) {
                     czl.a($$7, $$3, this, $$1);
                  }
               });
            }
         }
      }

      return $$0;
   }

   public boolean a(cua $$0, cua $$1) {
      return !cua.a($$1, $$0);
   }

   private void a(Map<bsk, cua> $$0) {
      cua $$1 = $$0.get(bsk.a);
      cua $$2 = $$0.get(bsk.b);
      if ($$1 != null && $$2 != null && cua.a($$1, this.g(bsk.b)) && cua.a($$2, this.g(bsk.a))) {
         ((aqk)this.dP()).l().b(this, new acr(this, (byte)55));
         $$0.remove(bsk.a);
         $$0.remove(bsk.b);
         this.c(bsk.a, $$1.s());
         this.c(bsk.b, $$2.s());
      }
   }

   private void b(Map<bsk, cua> $$0) {
      List<Pair<bsk, cua>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cua $$3 = $$2.s();
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
      ((aqk)this.dP()).l().b(this, new aev(this.al(), $$1));
   }

   private cua f(bsk $$0) {
      return this.bX.get($$0.b());
   }

   private void b(bsk $$0, cua $$1) {
      this.bX.set($$0.b(), $$1);
   }

   private cua g(bsk $$0) {
      return this.bW.get($$0.b());
   }

   private void c(bsk $$0, cua $$1) {
      this.bW.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = aye.g($$0 - this.aY);
      this.aY += $$2 * 0.3F;
      float $$3 = aye.g(this.dF() - this.aY);
      float $$4 = this.fk();
      if (Math.abs($$3) > $$4) {
         this.aY = this.aY + ($$3 - (float)aye.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float fk() {
      return 50.0F;
   }

   public void n_() {
      if (this.cg > 0) {
         this.cg--;
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

      evz $$0 = this.ds();
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
      if (this.fc()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      } else if (this.db()) {
         this.dP().ag().a("newAi");
         this.fm();
         this.dP().ag().c();
      }

      this.dP().ag().c();
      this.dP().ag().a("jump");
      if (this.bn && this.ec()) {
         double $$4;
         if (this.bs()) {
            $$4 = this.b(awa.b);
         } else {
            $$4 = this.b(awa.a);
         }

         boolean $$6 = this.be() && $$4 > 0.0;
         double $$7 = this.di();
         if (!$$6 || this.aE() && !($$4 > $$7)) {
            if (!this.bs() || this.aE() && !($$4 > $$7)) {
               if ((this.aE() || $$6 && $$4 <= $$7) && this.cg == 0) {
                  this.ff();
                  this.cg = 10;
               }
            } else {
               this.c(awa.b);
            }
         } else {
            this.c(awa.a);
         }
      } else {
         this.cg = 0;
      }

      this.dP().ag().c();
      this.dP().ag().a("travel");
      this.bo *= 0.98F;
      this.bq *= 0.98F;
      this.G();
      evu $$8 = this.cK();
      evz $$9 = new evz((double)this.bo, (double)this.bp, (double)this.bq);
      if (this.b(brn.B) || this.b(brn.y)) {
         this.n();
      }

      label104: {
         if (this.cQ() instanceof cmh $$10 && this.bD()) {
            this.c($$10, $$9);
            break label104;
         }

         this.a($$9);
      }

      this.dP().ag().c();
      this.dP().ag().a("freezing");
      if (!this.dP().B && !this.ex()) {
         int $$11 = this.cm();
         if (this.aB && this.dD()) {
            this.k(Math.min(this.cp(), $$11 + 1));
         } else {
            this.k(Math.max(0, $$11 - 2));
         }
      }

      this.dY();
      this.dZ();
      if (!this.dP().B && this.ai % 40 == 0 && this.co() && this.dD()) {
         this.a(this.dQ().u(), 1.0F);
      }

      this.dP().ag().c();
      this.dP().ag().a("push");
      if (this.bC > 0) {
         this.bC--;
         this.a($$8, this.cK());
      }

      this.q();
      this.dP().ag().c();
      if (!this.dP().B && this.fl() && this.bg()) {
         this.a(this.dQ().i(), 1.0F);
      }
   }

   public boolean fl() {
      return false;
   }

   private void G() {
      boolean $$0 = this.i(7);
      if ($$0 && !this.aE() && !this.bR() && !this.b(brn.y)) {
         cua $$1 = this.a(bsk.e);
         if ($$1.a(cud.nT) && csw.i($$1)) {
            $$0 = true;
            int $$2 = this.bB + 1;
            if (!this.dP().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, bsk.e);
               }

               this.a(dxa.n);
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

   protected void fm() {
   }

   protected void q() {
      if (this.dP().x_()) {
         this.dP().a(dwo.a(cmh.class), this.cK(), bsi.a(this)).forEach(this::E);
      } else {
         List<bsd> $$0 = this.dP().a(this, this.cK(), bsi.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dP().ab().c(dbz.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ah.a(4) == 0) {
               int $$2 = 0;

               for (bsd $$3 : $$0) {
                  if (!$$3.bR()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dQ().h(), 6.0F);
               }
            }

            for (bsd $$4 : $$0) {
               this.E($$4);
            }
         }
      }
   }

   protected void a(evu $$0, evu $$1) {
      evu $$2 = $$0.b($$1);
      List<bsd> $$3 = this.dP().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bsd $$4 : $$3) {
            if ($$4 instanceof bsy) {
               this.g((bsy)$$4);
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
         this.bD = 0.0F;
         this.bE = null;
      }
   }

   protected void E(bsd $$0) {
      $$0.h(this);
   }

   protected void g(bsy $$0) {
   }

   public boolean fn() {
      return (this.ao.a(aF) & 4) != 0;
   }

   @Override
   public void ac() {
      bsd $$0 = this.dc();
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

   public void a(cir $$0) {
      bsd $$1 = $$0.s();
      if ($$1 instanceof aql) {
         am.R.a((aql)$$1, $$0.p(), this);
      }
   }

   public void a(bsd $$0, int $$1) {
      if (!$$0.dK() && !this.dP().B && ($$0 instanceof cir || $$0 instanceof cmn || $$0 instanceof bso)) {
         ((aqk)this.dP()).l().b($$0, new afo($$0.al(), this.al(), $$1));
      }
   }

   public boolean F(bsd $$0) {
      if ($$0.dP() != this.dP()) {
         return false;
      } else {
         evz $$1 = new evz(this.du(), this.dy(), this.dA());
         evz $$2 = new evz($$0.du(), $$0.dy(), $$0.dA());
         return $$2.f($$1) > 128.0 ? false : this.dP().a(new dbm($$1, $$2, dbm.a.a, dbm.b.a, this)).c() == evx.a.a;
      }
   }

   @Override
   public float i(float $$0) {
      return $$0 == 1.0F ? this.ba : aye.i($$0, this.bb, this.ba);
   }

   public float A(float $$0) {
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
   public void o(float $$0) {
      this.ba = $$0;
   }

   @Override
   public void p(float $$0) {
      this.aY = $$0;
   }

   @Override
   protected evz a(jf.a $$0, l.a $$1) {
      return j(super.a($$0, $$1));
   }

   public static evz j(evz $$0) {
      return new evz($$0.c, $$0.d, 0.0);
   }

   public float fo() {
      return this.ch;
   }

   public final void B(float $$0) {
      this.C(aye.a($$0, 0.0F, this.eO()));
   }

   protected void C(float $$0) {
      this.ch = $$0;
   }

   public void f_() {
   }

   public void g_() {
   }

   protected void fp() {
      this.ca = true;
   }

   public abstract bss fq();

   public boolean fr() {
      return (this.ao.a(aF) & 1) > 0;
   }

   public bqc fs() {
      return (this.ao.a(aF) & 2) > 0 ? bqc.b : bqc.a;
   }

   private void H() {
      if (this.fr()) {
         if (cua.b(this.b(this.fs()), this.bz)) {
            this.bz = this.b(this.fs());
            this.a(this.bz);
         } else {
            this.fx();
         }
      }
   }

   protected void a(cua $$0) {
      $$0.b(this.dP(), this, this.fu());
      if (this.I()) {
         this.b($$0, 5);
      }

      if (--this.bA == 0 && !this.dP().B && !$$0.v()) {
         this.x();
      }
   }

   private boolean I() {
      int $$0 = this.bz.a(this) - this.fu();
      int $$1 = (int)((float)this.bz.a(this) * 0.21875F);
      boolean $$2 = $$0 > $$1;
      return $$2 && this.fu() % 4 == 0;
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
      int $$2 = this.ao.a(aF);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.ao.a(aF, (byte)$$2);
   }

   public void c(bqc $$0) {
      cua $$1 = this.b($$0);
      if (!$$1.e() && !this.fr()) {
         this.bz = $$1;
         this.bA = $$1.a(this);
         if (!this.dP().B) {
            this.c(1, true);
            this.c(2, $$0 == bqc.b);
            this.a(dxa.D);
         }
      }
   }

   @Override
   public void a(ajp<?> $$0) {
      super.a($$0);
      if (bQ.equals($$0)) {
         if (this.dP().B) {
            this.fF().ifPresent(this::a);
         }
      } else if (aF.equals($$0) && this.dP().B) {
         if (this.fr() && this.bz.e()) {
            this.bz = this.b(this.fs());
            if (!this.bz.e()) {
               this.bA = this.bz.a(this);
            }
         } else if (!this.fr() && !this.bz.e()) {
            this.bz = cua.l;
            this.bA = 0;
         }
      }
   }

   @Override
   public void a(fc.a $$0, evz $$1) {
      super.a($$0, $$1);
      this.bb = this.ba;
      this.aY = this.ba;
      this.aZ = this.aY;
   }

   protected void b(cua $$0, int $$1) {
      if (!$$0.e() && this.fr()) {
         if ($$0.u() == cvv.c) {
            this.a(this.c($$0), 0.5F, this.dP().z.i() * 0.1F + 0.9F);
         }

         if ($$0.u() == cvv.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ah.a(2), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(cua $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         evz $$3 = new evz(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dH() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dF() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ah.i()) * 0.6 - 0.3;
         evz $$5 = new evz(((double)this.ah.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dH() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dF() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.du(), this.dy(), this.dA());
         this.dP().a(new lf(lj.S, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void x() {
      if (!this.dP().B || this.fr()) {
         bqc $$0 = this.fs();
         if (!this.bz.equals(this.b($$0))) {
            this.fw();
         } else {
            if (!this.bz.e() && this.fr()) {
               this.b(this.bz, 16);
               cua $$1 = this.bz.a(this.dP(), this);
               if ($$1 != this.bz) {
                  this.a($$0, $$1);
               }

               this.fx();
            }
         }
      }
   }

   public cua ft() {
      return this.bz;
   }

   public int fu() {
      return this.bA;
   }

   public int fv() {
      return this.fr() ? this.bz.a(this) - this.fu() : 0;
   }

   public void fw() {
      if (!this.bz.e()) {
         this.bz.a(this.dP(), this, this.fu());
         if (this.bz.v()) {
            this.H();
         }
      }

      this.fx();
   }

   public void fx() {
      if (!this.dP().B) {
         boolean $$0 = this.fr();
         this.c(1, false);
         if ($$0) {
            this.a(dxa.C);
         }
      }

      this.bz = cua.l;
      this.bA = 0;
   }

   public boolean fy() {
      if (this.fr() && !this.bz.e()) {
         ctv $$0 = this.bz.g();
         return $$0.b(this.bz) != cvv.d ? false : $$0.a(this.bz, this) - this.bA >= 5;
      } else {
         return false;
      }
   }

   public boolean fz() {
      return this.bV();
   }

   public boolean fA() {
      return this.i(7);
   }

   @Override
   public boolean cd() {
      return super.cd() || !this.fA() && this.c(btk.b);
   }

   public int fB() {
      return this.bB;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.du();
      double $$5 = this.dw();
      double $$6 = this.dA();
      double $$7 = $$1;
      boolean $$8 = false;
      ja $$9 = ja.a($$0, $$1, $$2);
      dcd $$10 = this.dP();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.I_()) {
            ja $$12 = $$9.d();
            dsh $$13 = $$10.a_($$12);
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

         if (this instanceof bth $$14) {
            $$14.K().n();
         }

         return true;
      }
   }

   public boolean fC() {
      return !this.ex();
   }

   public boolean fD() {
      return true;
   }

   public void a(ja $$0, boolean $$1) {
   }

   public boolean f(cua $$0) {
      return false;
   }

   @Override
   public final bsg a(btk $$0) {
      return $$0 == btk.c ? aG : this.e($$0).a(this.eb());
   }

   protected bsg e(btk $$0) {
      return this.ak().n().a(this.ea());
   }

   public ImmutableList<btk> fE() {
      return ImmutableList.of(btk.a);
   }

   public evu f(btk $$0) {
      bsg $$1 = this.a($$0);
      return new evu((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(btk $$0) {
      evu $$1 = this.a($$0).a(this.dn());
      return this.dP().b(this, $$1);
   }

   @Override
   public boolean cw() {
      return super.cw() && !this.fH();
   }

   public Optional<ja> fF() {
      return this.ao.a(bQ);
   }

   public void g(ja $$0) {
      this.ao.a(bQ, Optional.of($$0));
   }

   public void fG() {
      this.ao.a(bQ, Optional.empty());
   }

   public boolean fH() {
      return this.fF().isPresent();
   }

   public void b(ja $$0) {
      if (this.bR()) {
         this.ac();
      }

      dsh $$1 = this.dP().a_($$0);
      if ($$1.b() instanceof dey) {
         this.dP().a($$0, $$1.a(dey.c, Boolean.valueOf(true)), 3);
      }

      this.b(btk.c);
      this.a($$0);
      this.g($$0);
      this.h(evz.b);
      this.av = true;
   }

   private void a(ja $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean M() {
      return this.fF().map($$0 -> this.dP().a_($$0).b() instanceof dey).orElse(false);
   }

   public void fI() {
      this.fF().filter(this.dP()::B).ifPresent($$0x -> {
         dsh $$1 = this.dP().a_($$0x);
         if ($$1.b() instanceof dey) {
            jf $$2 = $$1.c(dey.aE);
            this.dP().a($$0x, $$1.a(dey.c, Boolean.valueOf(false)), 3);
            evz $$3 = dey.a(this.ak(), this.dP(), $$0x, $$2, this.dF()).orElseGet(() -> {
               ja $$1x = $$0x.c();
               return new evz((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            evz $$4 = evz.c($$0x).d($$3).d();
            float $$5 = (float)aye.d(aye.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.c, $$3.d, $$3.e);
            this.s($$5);
            this.t(0.0F);
         }
      });
      evz $$0 = this.dn();
      this.b(btk.a);
      this.a_($$0.c, $$0.d, $$0.e);
      this.fG();
   }

   @Nullable
   public jf fJ() {
      ja $$0 = this.fF().orElse(null);
      return $$0 != null ? dey.a(this.dP(), $$0) : null;
   }

   @Override
   public boolean bE() {
      return !this.fH() && super.bE();
   }

   public cua g(cua $$0) {
      return cua.l;
   }

   public cua a(dcd $$0, cua $$1) {
      cpb $$2 = $$1.a(kn.v);
      if ($$2 != null) {
         $$0.a(null, this.du(), this.dw(), this.dA(), this.d($$1), avg.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$2);
         $$1.a(1, this);
         this.a(dxa.m);
      }

      return $$1;
   }

   private void a(cpb $$0) {
      if (!this.dP().x_()) {
         for (cpb.b $$2 : $$0.f()) {
            if (this.ah.i() < $$2.b()) {
               this.b($$2.a());
            }
         }
      }
   }

   private static byte h(bsk $$0) {
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

   public void e(bsk $$0) {
      this.dP().a(this, h($$0));
   }

   public static bsk d(bqc $$0) {
      return $$0 == bqc.a ? bsk.a : bsk.b;
   }

   @Override
   public evu h_() {
      if (this.a(bsk.f).a(cud.uq)) {
         float $$0 = 0.5F;
         return this.cK().c(0.5, 0.5, 0.5);
      } else {
         return super.h_();
      }
   }

   public static bsk h(cua $$0) {
      ctc $$1 = ctc.c_($$0);
      return $$1 != null ? $$1.m() : bsk.a;
   }

   private static btq a(bsy $$0, bsk $$1) {
      return $$1 != bsk.f && $$1 != bsk.a && $$1 != bsk.b ? btq.a($$0, $$1, $$1x -> $$1x.e() || bta.h($$1x) == $$1) : btq.a($$0, $$1);
   }

   @Nullable
   private static bsk r(int $$0) {
      if ($$0 == 100 + bsk.f.b()) {
         return bsk.f;
      } else if ($$0 == 100 + bsk.e.b()) {
         return bsk.e;
      } else if ($$0 == 100 + bsk.d.b()) {
         return bsk.d;
      } else if ($$0 == 100 + bsk.c.b()) {
         return bsk.c;
      } else if ($$0 == 98) {
         return bsk.a;
      } else if ($$0 == 99) {
         return bsk.b;
      } else {
         return $$0 == 105 ? bsk.g : null;
      }
   }

   @Override
   public btq a_(int $$0) {
      bsk $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dD() {
      if (this.N_()) {
         return false;
      } else {
         boolean $$0 = !this.a(bsk.f).a(awd.ba) && !this.a(bsk.e).a(awd.ba) && !this.a(bsk.d).a(awd.ba) && !this.a(bsk.c).a(awd.ba) && !this.a(bsk.g).a(awd.ba);
         return $$0 && super.dD();
      }
   }

   @Override
   public boolean cg() {
      return !this.dP().x_() && this.b(brn.x) || super.cg();
   }

   @Override
   public float dG() {
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

   public boolean fK() {
      return this.eT().g() instanceof cru;
   }

   @Override
   public float dJ() {
      float $$0 = (float)this.g(bug.B);
      return this.cQ() instanceof cmh ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public evz m(bsd $$0) {
      return this.dn().e(this.a($$0, this.a(this.ar()), this.eb() * this.ea()));
   }

   protected void a(int $$0, double $$1) {
      this.ba = (float)aye.e(1.0 / (double)$$0, (double)this.ba, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(aye.c((double)$$0 * this.g(bug.h)));
   }

   public boolean fL() {
      return false;
   }

   @Override
   public boolean b(bqw $$0) {
      if (super.b($$0)) {
         return true;
      } else {
         if (this.dP() instanceof aqk $$1 && czl.a($$1, this, $$0)) {
            return true;
         }

         return false;
      }
   }

   public static record a(ave a, ave b) {
   }
}
