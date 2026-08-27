import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class bnq implements bmb, dpd, dt, epc {
   private static final Logger c = LogUtils.getLogger();
   public static final String w = "id";
   public static final String x = "Passengers";
   private static final AtomicInteger d = new AtomicInteger();
   private static final List<cpd> e = Collections.emptyList();
   public static final int y = 60;
   public static final int z = 300;
   public static final int A = 1024;
   public static final float B = 0.2F;
   public static final double C = 0.500001;
   public static final double D = 0.999999;
   public static final int E = 140;
   public static final int F = 40;
   private static final enu k = new enu(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double l = 0.014;
   private static final double m = 0.007;
   private static final double n = 0.0023333333333333335;
   public static final String G = "UUID";
   private static double o = 1.0;
   private final bnw<?> p;
   private int q = d.incrementAndGet();
   public boolean H;
   private ImmutableList<bnq> r = ImmutableList.of();
   protected int I;
   @Nullable
   private bnq s;
   private cvr t;
   public double J;
   public double K;
   public double L;
   private enz u;
   private hz v;
   private cuy aD;
   private enz aE = enz.b;
   private float aF;
   private float aG;
   public float M;
   public float N;
   private enu aH = k;
   private boolean aI;
   public boolean O;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   protected enz T = enz.b;
   @Nullable
   private bnq.c aJ;
   public static final float U = 0.6F;
   public static final float V = 1.8F;
   public float W;
   public float X;
   public float Y;
   public float Z;
   public float aa;
   private float aK = 1.0F;
   public double ab;
   public double ac;
   public double ad;
   public boolean ae;
   protected final awp af = awp.a();
   public int ag;
   private int aL = -this.dc();
   protected boolean ah;
   protected Object2DoubleMap<aup<egv>> ai = new Object2DoubleArrayMap(2);
   protected boolean aj;
   private final Set<aup<egv>> aM = new HashSet<>();
   public int ak;
   protected boolean al = true;
   protected final aih am;
   protected static final aie<Byte> an = aih.a(bnq.class, aig.a);
   protected static final int ao = 0;
   private static final int aN = 1;
   private static final int aO = 3;
   private static final int aP = 4;
   private static final int aQ = 5;
   protected static final int ap = 6;
   protected static final int aq = 7;
   private static final aie<Integer> aR = aih.a(bnq.class, aig.b);
   private static final aie<Optional<vq>> aS = aih.a(bnq.class, aig.g);
   private static final aie<Boolean> aT = aih.a(bnq.class, aig.k);
   private static final aie<Boolean> aU = aih.a(bnq.class, aig.k);
   private static final aie<Boolean> aV = aih.a(bnq.class, aig.k);
   protected static final aie<bot> ar = aih.a(bnq.class, aig.v);
   private static final aie<Integer> aW = aih.a(bnq.class, aig.b);
   private dpe aX = dpe.a;
   private final ago aY = new ago();
   public boolean as;
   public boolean at;
   private int aZ;
   protected boolean au;
   protected int av;
   protected hz aw;
   private boolean ba;
   protected UUID ax = awi.a(this.af);
   protected String ay = this.ax.toString();
   private boolean bb;
   private final Set<String> bc = Sets.newHashSet();
   private final double[] bd = new double[]{0.0, 0.0, 0.0};
   private long be;
   private bnt bf;
   private float bg;
   public boolean az;
   public boolean aA;
   public boolean aB;
   public Optional<hz> aC = Optional.empty();
   private boolean bh = false;
   private float bi;
   private int bj;
   private boolean bk;
   @Nullable
   private dlj bl = null;

   public bnq(bnw<?> $$0, cvr $$1) {
      this.p = $$0;
      this.t = $$1;
      this.bf = $$0.n();
      this.u = enz.b;
      this.v = hz.c;
      this.aD = cuy.b;
      this.am = new aih(this);
      this.am.a(an, (byte)0);
      this.am.a(aR, this.ch());
      this.am.a(aT, false);
      this.am.a(aS, Optional.empty());
      this.am.a(aU, false);
      this.am.a(aV, false);
      this.am.a(ar, bot.a);
      this.am.a(aW, 0);
      this.c_();
      this.a_(0.0, 0.0, 0.0);
      this.bg = this.bf.c();
   }

   public boolean a(hz $$0, dlj $$1) {
      eos $$2 = $$1.b(this.dM(), $$0, eoe.a(this));
      eos $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return eop.c($$3, eop.a(this.cH()), eod.i);
   }

   public int j_() {
      epf $$0 = this.cg();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean P_() {
      return false;
   }

   public final void ag() {
      if (this.bP()) {
         this.bB();
      }

      if (this.bO()) {
         this.ac();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.aY.e(new enz($$0, $$1, $$2));
   }

   public ago ah() {
      return this.aY;
   }

   public bnw<?> ai() {
      return this.p;
   }

   @Override
   public int aj() {
      return this.q;
   }

   public void e(int $$0) {
      this.q = $$0;
   }

   public Set<String> ak() {
      return this.bc;
   }

   public boolean a(String $$0) {
      return this.bc.size() >= 1024 ? false : this.bc.add($$0);
   }

   public boolean b(String $$0) {
      return this.bc.remove($$0);
   }

   public void al() {
      this.a(bnq.c.a);
      this.b(dpw.p);
   }

   public final void am() {
      this.a(bnq.c.b);
   }

   protected abstract void c_();

   public aih an() {
      return this.am;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bnq ? ((bnq)$$0).q == this.q : false;
   }

   @Override
   public int hashCode() {
      return this.q;
   }

   public void a(bnq.c $$0) {
      this.b($$0);
   }

   public void ao() {
   }

   public void b(bot $$0) {
      this.am.b(ar, $$0);
   }

   public bot ap() {
      return this.am.b(ar);
   }

   public boolean c(bot $$0) {
      return this.ap() == $$0;
   }

   public boolean a(bnq $$0, double $$1) {
      return this.dk().a((it)$$0.dk(), $$1);
   }

   public boolean a(bnq $$0, double $$1, double $$2) {
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.dt() - this.dt();
      double $$5 = $$0.dx() - this.dx();
      return awi.e($$3, $$5) < awi.k($$1) && awi.k($$4) < awi.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.r($$0 % 360.0F);
      this.s($$1 % 360.0F);
   }

   public final void b(enz $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.aq());
   }

   protected enu aq() {
      return this.bf.a(this.u);
   }

   protected void ar() {
      this.a_(this.u.c, this.u.d, this.u.e);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.s(this.dE() + $$2);
      this.r(this.dC() + $$3);
      this.s(awi.a(this.dE(), -90.0F, 90.0F));
      this.N += $$2;
      this.M += $$3;
      this.N = awi.a(this.N, -90.0F, 90.0F);
      if (this.s != null) {
         this.s.j(this);
      }
   }

   public void l() {
      this.as();
   }

   public void as() {
      this.dM().ae().a("entityBaseTick");
      this.bl = null;
      if (this.bO() && this.cZ().dH()) {
         this.ac();
      }

      if (this.I > 0) {
         this.I--;
      }

      this.W = this.X;
      this.N = this.dE();
      this.M = this.dC();
      this.bI();
      if (this.bl()) {
         this.bm();
      }

      this.aA = this.az;
      this.az = false;
      this.bg();
      this.y();
      this.bf();
      if (this.dM().B) {
         this.aA();
      } else if (this.aL > 0) {
         if (this.aY()) {
            this.i(this.aL - 4);
            if (this.aL < 0) {
               this.aA();
            }
         } else {
            if (this.aL % 20 == 0 && !this.bn()) {
               this.a(this.dN().c(), 1.0F);
            }

            this.i(this.aL - 1);
         }

         if (this.cj() > 0) {
            this.l(0);
            this.dM().a(null, 1009, this.v, 1);
         }
      }

      if (this.bn()) {
         this.ay();
         this.aa *= 0.5F;
      }

      this.at();
      if (!this.dM().B) {
         this.a_(this.aL > 0);
      }

      this.al = false;
      this.dM().ae().c();
   }

   public void a_(boolean $$0) {
      this.b(0, $$0 || this.bk);
   }

   public void at() {
      if (this.dt() < (double)(this.dM().J_() - 64)) {
         this.aB();
      }
   }

   public void au() {
      this.aZ = this.bJ();
   }

   public void f(int $$0) {
      this.aZ = $$0;
   }

   public int av() {
      return this.aZ;
   }

   public boolean aw() {
      return this.aZ > 0;
   }

   protected void L() {
      if (this.aw()) {
         this.aZ--;
      }
   }

   public int ax() {
      return 0;
   }

   public void ay() {
      if (!this.aY()) {
         this.g(15);
         if (this.a(this.dN().d(), 4.0F)) {
            this.a(atl.jM, 0.4F, 2.0F + this.af.i() * 0.4F);
         }
      }
   }

   public final void g(int $$0) {
      this.h($$0 * 20);
   }

   public void h(int $$0) {
      if (this.aL < $$0) {
         this.i($$0);
      }
   }

   public void i(int $$0) {
      this.aL = $$0;
   }

   public int az() {
      return this.aL;
   }

   public void aA() {
      this.i(0);
   }

   protected void aB() {
      this.am();
   }

   public boolean g(double $$0, double $$1, double $$2) {
      return this.b(this.cH().d($$0, $$1, $$2));
   }

   private boolean b(enu $$0) {
      return this.dM().a(this, $$0) && !this.dM().d($$0);
   }

   public void c(boolean $$0) {
      this.aI = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, enz $$1) {
      this.aI = $$0;
      this.b($$0, $$1);
   }

   public boolean d(hz $$0) {
      return this.aC.isPresent() && this.aC.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable enz $$1) {
      if ($$0) {
         enu $$2 = this.cH();
         enu $$3 = new enu($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<hz> $$4 = this.t.g(this, $$3);
         if ($$4.isPresent() || this.bh) {
            this.aC = $$4;
         } else if ($$1 != null) {
            enu $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
            $$4 = this.t.g(this, $$5);
            this.aC = $$4;
         }

         this.bh = $$4.isEmpty();
      } else {
         this.bh = false;
         if (this.aC.isPresent()) {
            this.aC = Optional.empty();
         }
      }
   }

   public boolean aC() {
      return this.aI;
   }

   public void a(bon $$0, enz $$1) {
      if (this.ae) {
         this.a_(this.dr() + $$1.c, this.dt() + $$1.d, this.dx() + $$1.e);
      } else {
         this.aB = this.bN();
         if ($$0 == bon.c) {
            $$1 = this.d($$1);
            if ($$1.equals(enz.b)) {
               return;
            }
         }

         this.dM().ae().a("move");
         if (this.T.g() > 1.0E-7) {
            $$1 = $$1.h(this.T);
            this.T = enz.b;
            this.g(enz.b);
         }

         $$1 = this.a($$1, $$0);
         enz $$2 = this.a($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.aa != 0.0F && $$3 >= 1.0) {
               env $$4 = this.dM().a(new cva(this.dk(), this.dk().e($$2), cva.a.d, cva.b.d, this));
               if ($$4.c() != enx.a.a) {
                  this.n();
               }
            }

            this.a_(this.dr() + $$2.c, this.dt() + $$2.d, this.dx() + $$2.e);
         }

         this.dM().ae().c();
         this.dM().ae().a("rest");
         boolean $$5 = !awi.b($$1.c, $$2.c);
         boolean $$6 = !awi.b($$1.e, $$2.e);
         this.O = $$5 || $$6;
         this.P = $$1.d != $$2.d;
         this.Q = this.P && $$1.d < 0.0;
         if (this.O) {
            this.R = this.c($$2);
         } else {
            this.R = false;
         }

         this.a(this.Q, $$2);
         hz $$7 = this.aH();
         dlj $$8 = this.dM().a_($$7);
         this.a($$2.d, this.aC(), $$8, $$7);
         if (this.dH()) {
            this.dM().ae().c();
         } else {
            if (this.O) {
               enz $$9 = this.dp();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            cys $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dM(), this);
            }

            if (this.aC()) {
               $$10.a(this.dM(), $$7, $$8, this);
            }

            bnq.b $$11 = this.aW();
            if ($$11.a() && !this.bO()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.Z = this.Z + (float)($$2.f() * 0.6);
               hz $$15 = this.aJ();
               dlj $$16 = this.dM().a_($$15);
               boolean $$17 = this.c($$16);
               if (!$$17) {
                  $$13 = 0.0;
               }

               this.X = this.X + (float)$$2.h() * 0.6F;
               this.Y = this.Y + (float)Math.sqrt($$12 * $$12 + $$13 * $$13 + $$14 * $$14) * 0.6F;
               if (this.Y > this.aK && !$$16.i()) {
                  boolean $$18 = $$15.equals($$7);
                  boolean $$19 = this.a($$7, $$8, $$11.c(), $$18, $$1);
                  if (!$$18) {
                     $$19 |= this.a($$15, $$16, false, $$11.b(), $$1);
                  }

                  if ($$19) {
                     this.aK = this.aM();
                  } else if (this.aZ()) {
                     this.aK = this.aM();
                     if ($$11.c()) {
                        this.aR();
                     }

                     if ($$11.b()) {
                        this.b(dpw.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aG();
               }
            }

            this.aD();
            float $$20 = this.aL();
            this.g(this.dp().d((double)$$20, 1.0, (double)$$20));
            if (this.dM().c(this.cH().h(1.0E-6)).noneMatch($$0x -> $$0x.a(aua.aJ) || $$0x.a(cyu.H))) {
               if (this.aL <= 0) {
                  this.i(-this.dc());
               }

               if (this.aB && (this.az || this.bb())) {
                  this.aE();
               }
            }

            if (this.bN() && (this.az || this.bb())) {
               this.i(-this.dc());
            }

            this.dM().ae().c();
         }
      }
   }

   private boolean c(dlj $$0) {
      return $$0.a(aua.aO) || $$0.a(cyu.qP);
   }

   private boolean a(hz $$0, dlj $$1, boolean $$2, boolean $$3, enz $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aC() || $$5 || this.bX() && $$4.d == 0.0 || this.cf()) && !this.bZ()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dM().a(dpw.P, this.dk(), dpw.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(enz $$0) {
      return false;
   }

   protected void aD() {
      try {
         this.aQ();
      } catch (Throwable var4) {
         o $$1 = o.a(var4, "Checking entity block collision");
         p $$2 = $$1.a("Entity being checked for collision");
         this.a($$2);
         throw new y($$1);
      }
   }

   protected void aE() {
      this.a(atl.jR, 0.7F, 1.6F + (this.af.i() - this.af.i()) * 0.4F);
   }

   public void aF() {
      if (!this.dM().B && this.aB) {
         this.aE();
      }

      this.aA();
   }

   protected void aG() {
      if (this.aT()) {
         this.aS();
         if (this.aW().b()) {
            this.b(dpw.x);
         }
      }
   }

   @Deprecated
   public hz aH() {
      return this.d(0.2F);
   }

   protected hz aI() {
      return this.d(0.500001F);
   }

   public hz aJ() {
      return this.d(1.0E-5F);
   }

   protected hz d(float $$0) {
      if (this.aC.isPresent()) {
         hz $$1 = this.aC.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dlj $$2 = this.dM().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(aua.S)) && !$$2.a(aua.L) && !($$2.b() instanceof dbr) ? $$1.h(awi.a(this.u.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = awi.a(this.u.c);
         int $$4 = awi.a(this.u.d - (double)$$0);
         int $$5 = awi.a(this.u.e);
         return new hz($$3, $$4, $$5);
      }
   }

   protected float aK() {
      float $$0 = this.dM().a_(this.dm()).b().l();
      float $$1 = this.dM().a_(this.aI()).b().l();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aL() {
      dlj $$0 = this.dM().a_(this.dm());
      float $$1 = $$0.b().k();
      if (!$$0.a(cyu.G) && !$$0.a(cyu.nd)) {
         return (double)$$1 == 1.0 ? this.dM().a_(this.aI()).b().k() : $$1;
      } else {
         return $$1;
      }
   }

   protected enz a(enz $$0, bon $$1) {
      return $$0;
   }

   protected enz d(enz $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dM().X();
         if ($$1 != this.be) {
            Arrays.fill(this.bd, 0.0);
            this.be = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(ie.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? enz.b : new enz($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(ie.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? enz.b : new enz(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(ie.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? enz.b : new enz(0.0, 0.0, $$4);
         } else {
            return enz.b;
         }
      }
   }

   private double a(ie.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = awi.a($$1 + this.bd[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bd[$$2];
      this.bd[$$2] = $$3;
      return $$1;
   }

   private enz a(enz $$0) {
      enu $$1 = this.cH();
      List<eos> $$2 = this.dM().c(this, $$1.b($$0));
      enz $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dM(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.aC() || $$5 && $$0.d < 0.0;
      if (this.dG() > 0.0F && $$7 && ($$4 || $$6)) {
         enz $$8 = a(this, new enz($$0.c, (double)this.dG(), $$0.e), $$1, this.dM(), $$2);
         enz $$9 = a(this, new enz(0.0, (double)this.dG(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dM(), $$2);
         if ($$9.d < (double)this.dG()) {
            enz $$10 = a(this, new enz($$0.c, 0.0, $$0.e), $$1.c($$9), this.dM(), $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new enz(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.dM(), $$2));
         }
      }

      return $$3;
   }

   public static enz a(@Nullable bnq $$0, enz $$1, enu $$2, cvr $$3, List<eos> $$4) {
      Builder<eos> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      dna $$6 = $$3.D_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.e($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static enz a(enz $$0, enu $$1, List<eos> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = eop.a(ie.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = eop.a(ie.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = eop.a(ie.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = eop.a(ie.a.c, $$1, $$2, $$5);
         }

         return new enz($$3, $$4, $$5);
      }
   }

   protected float aM() {
      return (float)((int)this.Y + 1);
   }

   protected atk aN() {
      return atl.jV;
   }

   protected atk aO() {
      return atl.jU;
   }

   protected atk aP() {
      return atl.jU;
   }

   protected void aQ() {
      enu $$0 = this.cH();
      hz $$1 = hz.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      hz $$2 = hz.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dM().a($$1, $$2)) {
         hz.a $$3 = new hz.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bx()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  dlj $$7 = this.dM().a_($$3);

                  try {
                     $$7.a(this.dM(), $$3, this);
                     this.a($$7);
                  } catch (Throwable var12) {
                     o $$9 = o.a(var12, "Colliding entity with block");
                     p $$10 = $$9.a("Block being collided with");
                     p.a($$10, this.dM(), $$3, $$7);
                     throw new y($$9);
                  }
               }
            }
         }
      }
   }

   protected void a(dlj $$0) {
   }

   public void a(ij<dpw> $$0, @Nullable bnq $$1) {
      this.dM().a($$1, $$0, this.u);
   }

   public void b(ij<dpw> $$0) {
      this.a($$0, this);
   }

   private void c(hz $$0, dlj $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.s();
      }
   }

   protected void aR() {
      bnq $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      enz $$2 = $$0.dp();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected hz e(hz $$0) {
      hz $$1 = $$0.c();
      dlj $$2 = this.dM().a_($$1);
      return !$$2.a(aua.bm) && !$$2.a(aua.bn) ? $$0 : $$1;
   }

   protected void a(dlj $$0, dlj $$1) {
      dge $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dlj $$0) {
      dge $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(hz $$0, dlj $$1) {
      dge $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dlj $$0) {
      return $$0.a(aua.bl) && this.ag >= this.bj + 20;
   }

   private void s() {
      this.bi = this.bi * (float)Math.pow(0.997, (double)(this.ag - this.bj));
      this.bi = Math.min(1.0F, this.bi + 0.07F);
      float $$0 = 0.5F + this.bi * this.af.i() * 1.2F;
      float $$1 = 0.1F + this.bi * 1.2F;
      this.a(atl.E, $$1, $$0);
      this.bj = this.ag;
   }

   protected void e(float $$0) {
      this.a(this.aN(), $$0, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
   }

   protected void aS() {
   }

   protected boolean aT() {
      return false;
   }

   public void a(atk $$0, float $$1, float $$2) {
      if (!this.aU()) {
         this.dM().a(null, this.dr(), this.dt(), this.dx(), $$0, this.db(), $$1, $$2);
      }
   }

   public void a(atk $$0) {
      if (!this.aU()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean aU() {
      return this.am.b(aU);
   }

   public void d(boolean $$0) {
      this.am.b(aU, $$0);
   }

   public boolean aV() {
      return this.am.b(aV);
   }

   public void e(boolean $$0) {
      this.am.b(aV, $$0);
   }

   protected bnq.b aW() {
      return bnq.b.d;
   }

   public boolean aX() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dlj $$2, hz $$3) {
      if ($$1) {
         if (this.aa > 0.0F) {
            $$2.b().a(this.dM(), $$2, $$3, this, this.aa);
            this.dM().a(dpw.A, this.u, dpw.a.a(this, this.aC.<dlj>map($$0x -> this.dM().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.aa -= (float)$$0;
      }
   }

   public boolean aY() {
      return this.ai().d();
   }

   public boolean a(float $$0, float $$1, bmp $$2) {
      if (this.p.a(aud.o)) {
         return false;
      } else {
         if (this.bP()) {
            for (bnq $$3 : this.cP()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean aZ() {
      return this.ah;
   }

   private boolean u() {
      hz $$0 = this.dm();
      return this.dM().r($$0) || this.dM().r(hz.a((double)$$0.u(), this.cH().e, (double)$$0.w()));
   }

   private boolean x() {
      return this.dM().a_(this.dm()).a(cyu.nd);
   }

   public boolean ba() {
      return this.aZ() || this.u();
   }

   public boolean bb() {
      return this.aZ() || this.u() || this.x();
   }

   public boolean bc() {
      return this.aZ() || this.x();
   }

   public boolean bd() {
      return this.bc() || this.bn();
   }

   public boolean be() {
      return this.aj && this.aZ();
   }

   public void bf() {
      if (this.bZ()) {
         this.h(this.bY() && this.aZ() && !this.bO());
      } else {
         this.h(this.bY() && this.be() && !this.bO() && this.dM().b_(this.v).a(auf.a));
      }
   }

   protected boolean bg() {
      this.ai.clear();
      this.bh();
      double $$0 = this.dM().E_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(auf.b, $$0);
      return this.aZ() || $$1;
   }

   void bh() {
      if (this.cZ() instanceof cjg $$0 && !$$0.be()) {
         this.ah = false;
         return;
      }

      if (this.a(auf.a, 0.014)) {
         if (!this.ah && !this.al) {
            this.bi();
         }

         this.n();
         this.ah = true;
         this.aA();
      } else {
         this.ah = false;
      }
   }

   private void y() {
      this.aj = this.a(auf.a);
      this.aM.clear();
      double $$0 = this.dv();
      if (this.cZ() instanceof cjg $$2 && !$$2.be() && $$2.cH().e >= $$0 && $$2.cH().b <= $$0) {
         return;
      }

      hz $$3 = hz.a(this.dr(), $$0, this.dx());
      egw $$4 = this.dM().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((cux)this.dM(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aM::add);
      }
   }

   protected void bi() {
      bnq $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      enz $$2 = $$0.dp();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aO(), $$3, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
      } else {
         this.a(this.aP(), $$3, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
      }

      float $$4 = (float)awi.a(this.dt());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bf.a() * 20.0F; $$5++) {
         double $$6 = (this.af.j() * 2.0 - 1.0) * (double)this.bf.a();
         double $$7 = (this.af.j() * 2.0 - 1.0) * (double)this.bf.a();
         this.dM().a(jz.e, this.dr() + $$6, (double)($$4 + 1.0F), this.dx() + $$7, $$2.c, $$2.d - this.af.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bf.a() * 20.0F; $$8++) {
         double $$9 = (this.af.j() * 2.0 - 1.0) * (double)this.bf.a();
         double $$10 = (this.af.j() * 2.0 - 1.0) * (double)this.bf.a();
         this.dM().a(jz.aj, this.dr() + $$9, (double)($$4 + 1.0F), this.dx() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.b(dpw.O);
   }

   @Deprecated
   protected dlj bj() {
      return this.dM().a_(this.aH());
   }

   public dlj bk() {
      return this.dM().a_(this.aJ());
   }

   public boolean bl() {
      return this.bY() && !this.aZ() && !this.P_() && !this.bX() && !this.bn() && this.bx();
   }

   protected void bm() {
      hz $$0 = this.aH();
      dlj $$1 = this.dM().a_($$0);
      if ($$1.l() != dex.a) {
         enz $$2 = this.dp();
         hz $$3 = this.dm();
         double $$4 = this.dr() + (this.af.j() - 0.5) * (double)this.bf.a();
         double $$5 = this.dx() + (this.af.j() - 0.5) * (double)this.bf.a();
         if ($$3.u() != $$0.u()) {
            $$4 = awi.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = awi.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dM().a(new jr(jz.c, $$1), $$4, this.dt() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(aup<egv> $$0) {
      return this.aM.contains($$0);
   }

   public boolean bn() {
      return !this.al && this.ai.getDouble(auf.b) > 0.0;
   }

   public void a(float $$0, enz $$1) {
      enz $$2 = a($$1, $$0, this.dC());
      this.g(this.dp().e($$2));
   }

   private static enz a(enz $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return enz.b;
      } else {
         enz $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = awi.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = awi.b($$2 * (float) (Math.PI / 180.0));
         return new enz($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bo() {
      return this.dM().f(this.dq(), this.dw()) ? this.dM().x(hz.a(this.dr(), this.dv(), this.dx())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.r($$3 % 360.0F);
      this.s(awi.a($$4, -90.0F, 90.0F) % 360.0F);
      this.M = this.dC();
      this.N = this.dE();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = awi.a($$0, -3.0E7, 3.0E7);
      double $$4 = awi.a($$2, -3.0E7, 3.0E7);
      this.J = $$3;
      this.K = $$1;
      this.L = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(enz $$0) {
      this.e($$0.c, $$0.d, $$0.e);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dC(), this.dE());
   }

   public void a(hz $$0, float $$1, float $$2) {
      this.b((double)$$0.u() + 0.5, (double)$$0.v(), (double)$$0.w() + 0.5, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.p($$0, $$1, $$2);
      this.r($$3);
      this.s($$4);
      this.bp();
      this.ar();
   }

   public final void bp() {
      double $$0 = this.dr();
      double $$1 = this.dt();
      double $$2 = this.dx();
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.ab = $$0;
      this.ac = $$1;
      this.ad = $$2;
      this.M = this.dC();
      this.N = this.dE();
   }

   public float e(bnq $$0) {
      float $$1 = (float)(this.dr() - $$0.dr());
      float $$2 = (float)(this.dt() - $$0.dt());
      float $$3 = (float)(this.dx() - $$0.dx());
      return awi.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dr() - $$0;
      double $$4 = this.dt() - $$1;
      double $$5 = this.dx() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double f(bnq $$0) {
      return this.f($$0.dk());
   }

   public double f(enz $$0) {
      double $$1 = this.dr() - $$0.c;
      double $$2 = this.dt() - $$0.d;
      double $$3 = this.dx() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(chl $$0) {
   }

   public void g(bnq $$0) {
      if (!this.x($$0)) {
         if (!$$0.ae && !this.ae) {
            double $$1 = $$0.dr() - this.dr();
            double $$2 = $$0.dx() - this.dx();
            double $$3 = awi.a($$1, $$2);
            if ($$3 >= 0.01F) {
               $$3 = Math.sqrt($$3);
               $$1 /= $$3;
               $$2 /= $$3;
               double $$4 = 1.0 / $$3;
               if ($$4 > 1.0) {
                  $$4 = 1.0;
               }

               $$1 *= $$4;
               $$2 *= $$4;
               $$1 *= 0.05F;
               $$2 *= 0.05F;
               if (!this.bP() && this.bu()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.bP() && $$0.bu()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void j(double $$0, double $$1, double $$2) {
      this.g(this.dp().b($$0, $$1, $$2));
      this.at = true;
   }

   protected void bq() {
      this.S = true;
   }

   public boolean a(bmp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bq();
         return false;
      }
   }

   public final enz f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dE() : awi.i($$0, this.N, this.dE());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dC() : awi.i($$0, this.M, this.dC());
   }

   protected final enz b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = awi.b($$3);
      float $$5 = awi.a($$3);
      float $$6 = awi.b($$2);
      float $$7 = awi.a($$2);
      return new enz((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final enz i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final enz c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final enz br() {
      return new enz(this.dr(), this.dv(), this.dx());
   }

   public final enz j(float $$0) {
      double $$1 = awi.d((double)$$0, this.J, this.dr());
      double $$2 = awi.d((double)$$0, this.K, this.dt()) + (double)this.cI();
      double $$3 = awi.d((double)$$0, this.L, this.dx());
      return new enz($$1, $$2, $$3);
   }

   public enz k(float $$0) {
      return this.j($$0);
   }

   public final enz l(float $$0) {
      double $$1 = awi.d((double)$$0, this.J, this.dr());
      double $$2 = awi.d((double)$$0, this.K, this.dt());
      double $$3 = awi.d((double)$$0, this.L, this.dx());
      return new enz($$1, $$2, $$3);
   }

   public enx a(double $$0, float $$1, boolean $$2) {
      enz $$3 = this.j($$1);
      enz $$4 = this.f($$1);
      enz $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dM().a(new cva($$3, $$5, cva.a.b, $$2 ? cva.b.c : cva.b.a, this));
   }

   public boolean bs() {
      return this.bx() && this.bt();
   }

   public boolean bt() {
      return false;
   }

   public boolean bu() {
      return false;
   }

   public void a(bnq $$0, int $$1, bmp $$2) {
      if ($$0 instanceof aox) {
         am.d.a((aox)$$0, this, $$2);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.dr() - $$0;
      double $$4 = this.dt() - $$1;
      double $$5 = this.dx() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cH().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * o;
      return $$0 < $$1 * $$1;
   }

   public boolean d(sw $$0) {
      if (this.aJ != null && !this.aJ.b()) {
         return false;
      } else {
         String $$1 = this.bw();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.f($$0);
            return true;
         }
      }
   }

   public boolean e(sw $$0) {
      return this.bO() ? false : this.d($$0);
   }

   public sw f(sw $$0) {
      try {
         if (this.s != null) {
            $$0.a("Pos", this.a(this.s.dr(), this.dt(), this.s.dx()));
         } else {
            $$0.a("Pos", this.a(this.dr(), this.dt(), this.dx()));
         }

         enz $$1 = this.dp();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dC(), this.dE()));
         $$0.a("FallDistance", this.aa);
         $$0.a("Fire", (short)this.aL);
         $$0.a("Air", (short)this.ci());
         $$0.a("OnGround", this.aC());
         $$0.a("Invulnerable", this.ba);
         $$0.a("PortalCooldown", this.aZ);
         $$0.a("UUID", this.cw());
         vq $$2 = this.af();
         if ($$2 != null) {
            $$0.a("CustomName", vq.a.a($$2));
         }

         if (this.cB()) {
            $$0.a("CustomNameVisible", this.cB());
         }

         if (this.aU()) {
            $$0.a("Silent", this.aU());
         }

         if (this.aV()) {
            $$0.a("NoGravity", this.aV());
         }

         if (this.bb) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.cj();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.cj());
         }

         if (this.bk) {
            $$0.a("HasVisualFire", this.bk);
         }

         if (!this.bc.isEmpty()) {
            tc $$4 = new tc();

            for (String $$5 : this.bc) {
               $$4.add(tr.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bP()) {
            tc $$6 = new tc();

            for (bnq $$7 : this.cP()) {
               sw $$8 = new sw();
               if ($$7.d($$8)) {
                  $$6.add($$8);
               }
            }

            if (!$$6.isEmpty()) {
               $$0.a("Passengers", $$6);
            }
         }

         return $$0;
      } catch (Throwable var9) {
         o $$10 = o.a(var9, "Saving entity NBT");
         p $$11 = $$10.a("Entity being saved");
         this.a($$11);
         throw new y($$10);
      }
   }

   public void g(sw $$0) {
      try {
         tc $$1 = $$0.c("Pos", 6);
         tc $$2 = $$0.c("Motion", 6);
         tc $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(awi.a($$1.h(0), -3.0000512E7, 3.0000512E7), awi.a($$1.h(1), -2.0E7, 2.0E7), awi.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.r($$3.i(0));
         this.s($$3.i(1));
         this.bp();
         this.n(this.dC());
         this.o(this.dC());
         this.aa = $$0.j("FallDistance");
         this.aL = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.k($$0.g("Air"));
         }

         this.aI = $$0.q("OnGround");
         this.ba = $$0.q("Invulnerable");
         this.aZ = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.ax = $$0.a("UUID");
            this.ay = this.ax.toString();
         }

         if (!Double.isFinite(this.dr()) || !Double.isFinite(this.dt()) || !Double.isFinite(this.dx())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dC()) && Double.isFinite((double)this.dE())) {
            this.ar();
            this.a(this.dC(), this.dE());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(vq.a.a($$8));
               } catch (Exception var16) {
                  c.warn("Failed to parse entity custom name {}", $$8, var16);
               }
            }

            this.n($$0.q("CustomNameVisible"));
            this.d($$0.q("Silent"));
            this.e($$0.q("NoGravity"));
            this.i($$0.q("Glowing"));
            this.l($$0.h("TicksFrozen"));
            this.bk = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.bc.clear();
               tc $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.bc.add($$10.j($$12));
               }
            }

            this.a($$0);
            if (this.bv()) {
               this.ar();
            }
         } else {
            throw new IllegalStateException("Entity has invalid rotation");
         }
      } catch (Throwable var17) {
         o $$14 = o.a(var17, "Loading entity NBT");
         p $$15 = $$14.a("Entity being loaded");
         this.a($$15);
         throw new y($$14);
      }
   }

   protected boolean bv() {
      return true;
   }

   @Nullable
   protected final String bw() {
      bnw<?> $$0 = this.ai();
      aiy $$1 = bnw.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(sw var1);

   protected abstract void b(sw var1);

   protected tc a(double... $$0) {
      tc $$1 = new tc();

      for (double $$2 : $$0) {
         $$1.add(sx.a($$2));
      }

      return $$1;
   }

   protected tc a(float... $$0) {
      tc $$1 = new tc();

      for (float $$2 : $$0) {
         $$1.add(sz.a($$2));
      }

      return $$1;
   }

   @Nullable
   public cdw a(cvq $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public cdw a(cvq $$0, int $$1) {
      return this.a(new cpd($$0), (float)$$1);
   }

   @Nullable
   public cdw b(cpd $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public cdw a(cpd $$0, float $$1) {
      if ($$0.b()) {
         return null;
      } else if (this.dM().B) {
         return null;
      } else {
         cdw $$2 = new cdw(this.dM(), this.dr(), this.dt() + (double)$$1, this.dx(), $$0);
         $$2.u();
         this.dM().b($$2);
         return $$2;
      }
   }

   public boolean bx() {
      return !this.dH();
   }

   public boolean by() {
      if (this.ae) {
         return false;
      } else {
         float $$0 = this.bf.a() * 0.8F;
         enu $$1 = enu.a(this.br(), (double)$$0, 1.0E-6, (double)$$0);
         return hz.a($$1)
            .anyMatch(
               $$1x -> {
                  dlj $$2 = this.dM().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dM(), $$1x)
                     && eop.c($$2.k(this.dM(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), eop.a($$1), eod.i);
               }
            );
      }
   }

   public blw a(chl $$0, blv $$1) {
      return blw.d;
   }

   public boolean h(bnq $$0) {
      return $$0.bz() && !this.x($$0);
   }

   public boolean bz() {
      return false;
   }

   public void t() {
      this.g(enz.b);
      this.l();
      if (this.bO()) {
         this.cZ().i(this);
      }
   }

   public final void i(bnq $$0) {
      if (this.w($$0)) {
         this.a($$0, bnq::a_);
      }
   }

   protected void a(bnq $$0, bnq.a $$1) {
      enz $$2 = this.l($$0);
      enz $$3 = $$0.k(this);
      $$1.accept($$0, $$2.c - $$3.c, $$2.d - $$3.d, $$2.e - $$3.e);
   }

   public void j(bnq $$0) {
   }

   public enz k(bnq $$0) {
      return this.dj().b(bnr.b, 0, this.aF);
   }

   public enz l(bnq $$0) {
      return this.dk().e(this.a($$0, this.bf, 1.0F));
   }

   protected enz a(bnq $$0, bnt $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static enz a(bnq $$0, bnq $$1, bns $$2) {
      int $$3 = $$0.cP().indexOf($$1);
      return $$2.c(bnr.a, $$3, $$0.aF);
   }

   public boolean m(bnq $$0) {
      return this.a($$0, false);
   }

   public boolean bA() {
      return this instanceof boi;
   }

   public boolean a(bnq $$0, boolean $$1) {
      if ($$0 == this.s) {
         return false;
      } else if (!$$0.bD()) {
         return false;
      } else {
         for (bnq $$2 = $$0; $$2.s != null; $$2 = $$2.s) {
            if ($$2.s == this) {
               return false;
            }
         }

         if ($$1 || this.n($$0) && $$0.q(this)) {
            if (this.bO()) {
               this.ac();
            }

            this.b(bot.a);
            this.s = $$0;
            this.s.o(this);
            $$0.B().filter($$0x -> $$0x instanceof aox).forEach($$0x -> am.U.a((aox)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean n(bnq $$0) {
      return !this.bS() && this.I <= 0;
   }

   public void bB() {
      for (int $$0 = this.r.size() - 1; $$0 >= 0; $$0--) {
         ((bnq)this.r.get($$0)).ac();
      }
   }

   public void bC() {
      if (this.s != null) {
         bnq $$0 = this.s;
         this.s = null;
         $$0.p(this);
      }
   }

   public void ac() {
      this.bC();
   }

   protected void o(bnq $$0) {
      if ($$0.cZ() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.r.isEmpty()) {
            this.r = ImmutableList.of($$0);
         } else {
            List<bnq> $$1 = Lists.newArrayList(this.r);
            if (!this.dM().B && $$0 instanceof chl && !(this.cQ() instanceof chl)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.r = ImmutableList.copyOf($$1);
         }

         this.a(dpw.s, $$0);
      }
   }

   protected void p(bnq $$0) {
      if ($$0.cZ() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.r.size() == 1 && this.r.get(0) == $$0) {
            this.r = ImmutableList.of();
         } else {
            this.r = this.r.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.I = 60;
         this.a(dpw.q, $$0);
      }
   }

   protected boolean q(bnq $$0) {
      return this.r.isEmpty();
   }

   protected boolean bD() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public double p_() {
      return this.dr();
   }

   public double N_() {
      return this.dt();
   }

   public double O_() {
      return this.dx();
   }

   public float f_() {
      return this.dE();
   }

   public float q_() {
      return this.dC();
   }

   public void a(float $$0, int $$1) {
      this.n($$0);
   }

   public float bE() {
      return 0.0F;
   }

   public enz bF() {
      return this.b(this.dE(), this.dC());
   }

   public enz a(coy $$0) {
      if (!(this instanceof chl $$1)) {
         return enz.b;
      } else {
         boolean $$2 = $$1.eU().a($$0) && !$$1.eT().a($$0);
         boc $$3 = $$2 ? $$1.fm().e() : $$1.fm();
         return this.b(0.0F, this.dC() + (float)($$3 == boc.b ? 80 : -80)).a(0.5);
      }
   }

   public eny bG() {
      return new eny(this.dE(), this.dC());
   }

   public enz bH() {
      return enz.a(this.bG());
   }

   public void f(hz $$0) {
      if (this.aw()) {
         this.au();
      } else {
         if (!this.dM().B && !$$0.equals(this.aw)) {
            this.aw = $$0.i();
         }

         this.au = true;
      }
   }

   protected void bI() {
      if (this.dM() instanceof aow) {
         int $$0 = this.ax();
         aow $$1 = (aow)this.dM();
         if (this.au) {
            MinecraftServer $$2 = $$1.o();
            aix<cvr> $$3 = this.dM().ad() == cvr.i ? cvr.h : cvr.i;
            aow $$4 = $$2.a($$3);
            if ($$4 != null && $$2.F() && !this.bO() && this.av++ >= $$0) {
               this.dM().ae().a("portal");
               this.av = $$0;
               this.au();
               this.b($$4);
               this.dM().ae().c();
            }

            this.au = false;
         } else {
            if (this.av > 0) {
               this.av -= 4;
            }

            if (this.av < 0) {
               this.av = 0;
            }
         }

         this.L();
      }
   }

   public int bJ() {
      return 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
   }

   public void c(bmp $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dcl.a(this);
      }
   }

   public void m(float $$0) {
   }

   public Iterable<cpd> bK() {
      return e;
   }

   public Iterable<cpd> bL() {
      return e;
   }

   public Iterable<cpd> bM() {
      return Iterables.concat(this.bK(), this.bL());
   }

   public void a(bnx $$0, cpd $$1) {
   }

   public boolean bN() {
      boolean $$0 = this.dM() != null && this.dM().B;
      return !this.aY() && (this.aL > 0 || $$0 && this.j(0));
   }

   public boolean bO() {
      return this.cZ() != null;
   }

   public boolean bP() {
      return !this.r.isEmpty();
   }

   public boolean bQ() {
      return this.ai().a(aud.p);
   }

   public boolean bR() {
      return !this.ai().a(aud.q);
   }

   public void f(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean bS() {
      return this.j(1);
   }

   public boolean bT() {
      return this.bS();
   }

   public boolean bU() {
      return this.bS();
   }

   public boolean bV() {
      return this.bS();
   }

   public boolean bW() {
      return this.bS();
   }

   public boolean bX() {
      return this.c(bot.f);
   }

   public boolean bY() {
      return this.j(3);
   }

   public void g(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean bZ() {
      return this.j(4);
   }

   public boolean ca() {
      return this.c(bot.d);
   }

   public boolean cb() {
      return this.ca() && !this.aZ();
   }

   public void h(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cc() {
      return this.bb;
   }

   public final void i(boolean $$0) {
      this.bb = $$0;
      this.b(6, this.cd());
   }

   public boolean cd() {
      return this.dM().y_() ? this.j(6) : this.bb;
   }

   public boolean ce() {
      return this.j(5);
   }

   public boolean d(chl $$0) {
      if ($$0.P_()) {
         return false;
      } else {
         epf $$1 = this.cg();
         return $$1 != null && $$0 != null && $$0.cg() == $$1 && $$1.i() ? false : this.ce();
      }
   }

   public boolean cf() {
      return false;
   }

   public void a(BiConsumer<dpt<?>, aow> $$0) {
   }

   @Nullable
   public eoy cg() {
      return this.dM().K().e(this.cy());
   }

   public boolean r(bnq $$0) {
      return this.a($$0.cg());
   }

   public boolean a(epf $$0) {
      return this.cg() != null ? this.cg().a($$0) : false;
   }

   public void j(boolean $$0) {
      this.b(5, $$0);
   }

   protected boolean j(int $$0) {
      return (this.am.b(an) & 1 << $$0) != 0;
   }

   protected void b(int $$0, boolean $$1) {
      byte $$2 = this.am.b(an);
      if ($$1) {
         this.am.b(an, (byte)($$2 | 1 << $$0));
      } else {
         this.am.b(an, (byte)($$2 & ~(1 << $$0)));
      }
   }

   public int ch() {
      return 300;
   }

   public int ci() {
      return this.am.b(aR);
   }

   public void k(int $$0) {
      this.am.b(aR, $$0);
   }

   public int cj() {
      return this.am.b(aW);
   }

   public void l(int $$0) {
      this.am.b(aW, $$0);
   }

   public float ck() {
      int $$0 = this.cm();
      return (float)Math.min(this.cj(), $$0) / (float)$$0;
   }

   public boolean cl() {
      return this.cj() >= this.cm();
   }

   public int cm() {
      return 140;
   }

   public void a(aow $$0, boh $$1) {
      this.i(this.aL + 1);
      if (this.aL == 0) {
         this.g(8);
      }

      this.a(this.dN().b(), 5.0F);
   }

   public void k(boolean $$0) {
      enz $$1 = this.dp();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void l(boolean $$0) {
      enz $$1 = this.dp();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(aow $$0, boi $$1) {
      return true;
   }

   public void cn() {
      if (this.dp().b() > -0.5 && this.aa > 1.0F) {
         this.aa = 1.0F;
      }
   }

   public void n() {
      this.aa = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      hz $$3 = hz.a($$0, $$1, $$2);
      enz $$4 = new enz($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      hz.a $$5 = new hz.a();
      ie $$6 = ie.b;
      double $$7 = Double.MAX_VALUE;

      for (ie $$8 : new ie[]{ie.c, ie.d, ie.e, ie.f, ie.b}) {
         $$5.a($$3, $$8);
         if (!this.dM().a_($$5).r(this.dM(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == ie.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.af.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      enz $$13 = this.dp().a(0.75);
      if ($$6.o() == ie.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == ie.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == ie.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dlj $$0, enz $$1) {
      this.n();
      this.T = $$1;
   }

   private static vq c(vq $$0) {
      we $$1 = $$0.e().b($$0.a().a(null));

      for (vq $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public vq ad() {
      vq $$0 = this.af();
      return $$0 != null ? c($$0) : this.co();
   }

   protected vq co() {
      return this.p.h();
   }

   public boolean s(bnq $$0) {
      return this == $$0;
   }

   public float cp() {
      return 0.0F;
   }

   public void n(float $$0) {
   }

   public void o(float $$0) {
   }

   public boolean cq() {
      return true;
   }

   public boolean t(bnq $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dM() == null ? "~NULL~" : this.dM().toString();
      return this.aJ != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.ad().getString(),
            this.q,
            $$0,
            this.dr(),
            this.dt(),
            this.dx(),
            this.aJ
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.ad().getString(),
            this.q,
            $$0,
            this.dr(),
            this.dt(),
            this.dx()
         );
   }

   public boolean b(bmp $$0) {
      return this.dH() || this.ba && !$$0.a(auc.e) && !$$0.g() || $$0.a(auc.j) && this.aY() || $$0.a(auc.n) && this.ai().a(aud.o);
   }

   public boolean cr() {
      return this.ba;
   }

   public void m(boolean $$0) {
      this.ba = $$0;
   }

   public void u(bnq $$0) {
      this.b($$0.dr(), $$0.dt(), $$0.dx(), $$0.dC(), $$0.dE());
   }

   public void v(bnq $$0) {
      sw $$1 = $$0.f(new sw());
      $$1.r("Dimension");
      this.g($$1);
      this.aZ = $$0.aZ;
      this.aw = $$0.aw;
   }

   @Nullable
   public bnq b(aow $$0) {
      if (this.dM() instanceof aow && !this.dH()) {
         this.dM().ae().a("changeDimension");
         this.ag();
         this.dM().ae().a("reposition");
         eht $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dM().ae().b("reloading");
            bnq $$2 = this.ai().a((cvr)$$0);
            if ($$2 != null) {
               $$2.v(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dE());
               $$2.g($$1.b);
               $$0.d($$2);
               if ($$0.ad() == cvr.j) {
                  aow.a($$0);
               }
            }

            this.cs();
            this.dM().ae().c();
            ((aow)this.dM()).h();
            $$0.h();
            this.dM().ae().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void cs() {
      this.b(bnq.c.e);
   }

   @Nullable
   protected eht a(aow $$0) {
      boolean $$1 = this.dM().ad() == cvr.j && $$0.ad() == cvr.h;
      boolean $$2 = $$0.ad() == cvr.j;
      if (!$$1 && !$$2) {
         boolean $$6 = $$0.ad() == cvr.i;
         if (this.dM().ad() != cvr.i && !$$6) {
            return null;
         } else {
            dna $$7 = $$0.D_();
            double $$8 = dov.a(this.dM().E_(), $$0.E_());
            hz $$9 = $$7.b(this.dr() * $$8, this.dt(), this.dx() * $$8);
            return this.a($$0, $$9, $$6, $$7).map($$1x -> {
               dlj $$2x = this.dM().a_(this.aw);
               ie.a $$3;
               enz $$5;
               if ($$2x.b(dlz.H)) {
                  $$3 = $$2x.c(dlz.H);
                  l.a $$4 = l.a(this.aw, $$3, 21, ie.a.b, 21, $$1xx -> this.dM().a_($$1xx) == $$2x);
                  $$5 = this.a($$3, $$4);
               } else {
                  $$3 = ie.a.a;
                  $$5 = new enz(0.5, 0.0, 0.0);
               }

               return ehu.a($$0, $$1x, $$3, $$5, this, this.dp(), this.dC(), this.dE());
            }).orElse(null);
         }
      } else {
         hz $$3 = $$2 ? aow.a : $$0.T();
         $$0.l().a(apb.f, new cuy($$3), 3, $$3);
         int $$4;
         if ($$2) {
            $$4 = $$3.v();
         } else {
            $$4 = $$0.m($$3).a(dqv.a.f, $$3.u(), $$3.w()) + 1;
         }

         return new eht(new enz((double)$$3.u() + 0.5, (double)$$4, (double)$$3.w() + 0.5), this.dp(), this.dC(), this.dE());
      }
   }

   protected enz a(ie.a $$0, l.a $$1) {
      return ehu.a($$1, $$0, this.dk(), this.a(this.ap()));
   }

   protected Optional<l.a> a(aow $$0, hz $$1, boolean $$2, dna $$3) {
      return $$0.p().a($$1, $$2, $$3);
   }

   public boolean ct() {
      return !this.bO() && !this.bP();
   }

   public float a(cvj $$0, cux $$1, hz $$2, dlj $$3, egw $$4, float $$5) {
      return $$5;
   }

   public boolean a(cvj $$0, cux $$1, hz $$2, dlj $$3, float $$4) {
      return true;
   }

   public int cu() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bnw.a(this.ai()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.q);
      $$0.a("Entity Name", () -> this.ad().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dr(), this.dt(), this.dx()));
      $$0.a("Entity's Block location", p.a(this.dM(), awi.a(this.dr()), awi.a(this.dt()), awi.a(this.dx())));
      enz $$1 = this.dp();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", () -> this.cP().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.cZ()));
   }

   public boolean cv() {
      return this.bN() && !this.P_();
   }

   public void a_(UUID $$0) {
      this.ax = $$0;
      this.ay = this.ax.toString();
   }

   @Override
   public UUID cw() {
      return this.ax;
   }

   public String cx() {
      return this.ay;
   }

   @Override
   public String cy() {
      return this.ay;
   }

   public boolean cz() {
      return true;
   }

   public static double cA() {
      return o;
   }

   public static void b(double $$0) {
      o = $$0;
   }

   @Override
   public vq Q_() {
      return eoy.a(this.cg(), this.ad()).a($$0 -> $$0.a(this.cG()).a(this.cx()));
   }

   public void b(@Nullable vq $$0) {
      this.am.b(aS, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public vq af() {
      return this.am.b(aS).orElse(null);
   }

   @Override
   public boolean ae() {
      return this.am.b(aS).isPresent();
   }

   public void n(boolean $$0) {
      this.am.b(aT, $$0);
   }

   public boolean cB() {
      return this.am.b(aT);
   }

   public final void n(double $$0, double $$1, double $$2) {
      if (this.dM() instanceof aow) {
         cuy $$3 = new cuy(hz.a($$0, $$1, $$2));
         ((aow)this.dM()).l().a(apb.g, $$3, 0, this.aj());
         this.dM().d($$3.e, $$3.f);
         this.c($$0, $$1, $$2);
      }
   }

   public boolean a(aow $$0, double $$1, double $$2, double $$3, Set<bov> $$4, float $$5, float $$6) {
      float $$7 = awi.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dM()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.z();
         this.n($$5);
      } else {
         this.ag();
         bnq $$8 = this.ai().a((cvr)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.v(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(bnq.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dM() instanceof aow) {
         this.b($$0, $$1, $$2, this.dC(), this.dE());
         this.z();
      }
   }

   private void z() {
      this.cR().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.r.iterator();

         while (var1.hasNext()) {
            bnq $$1 = (bnq)var1.next();
            $$0.a($$1, bnq::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.dr() + $$0, this.dt() + $$1, this.dx() + $$2);
   }

   public boolean cC() {
      return this.cB();
   }

   public void b(List<aih.b<?>> $$0) {
   }

   public void a(aie<?> $$0) {
      if (ar.equals($$0)) {
         this.k_();
      }
   }

   @Deprecated
   protected void cD() {
      bot $$0 = this.ap();
      bnt $$1 = this.a($$0);
      this.bf = $$1;
      this.bg = $$1.c();
   }

   public void k_() {
      bnt $$0 = this.bf;
      bot $$1 = this.ap();
      bnt $$2 = this.a($$1);
      this.bf = $$2;
      this.bg = $$2.c();
      this.ar();
      boolean $$3 = (double)$$2.a() <= 4.0 && (double)$$2.b() <= 4.0;
      if (!this.dM().B && !this.al && !this.ae && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof chl)) {
         enz $$4 = this.dk().b(0.0, (double)$$0.b() / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a() - $$0.a()) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b() - $$0.b()) + 1.0E-6;
         eos $$7 = eop.a(enu.a($$4, $$5, $$6, $$5));
         this.dM().a(this, $$7, $$4, (double)$$2.a(), (double)$$2.b(), (double)$$2.a()).ifPresent($$1x -> this.b($$1x.b(0.0, (double)(-$$2.b()) / 2.0, 0.0)));
      }
   }

   public ie cE() {
      return ie.a((double)this.dC());
   }

   public ie cF() {
      return this.cE();
   }

   protected vw cG() {
      return new vw(vw.a.c, new vw.b(this.ai(), this.cw(), this.ad()));
   }

   public boolean a(aox $$0) {
      return true;
   }

   @Override
   public final enu cH() {
      return this.aH;
   }

   public enu i_() {
      return this.cH();
   }

   public final void a(enu $$0) {
      this.aH = $$0;
   }

   public final float d(bot $$0) {
      return this.a($$0).c();
   }

   public final float cI() {
      return this.bg;
   }

   public enz p(float $$0) {
      return this.cJ();
   }

   protected enz cJ() {
      return new enz(0.0, (double)this.cI(), (double)(this.dg() * 0.4F));
   }

   public boz a_(int $$0) {
      return boz.b;
   }

   @Override
   public void a(vq $$0) {
   }

   public cvr cK() {
      return this.dM();
   }

   @Nullable
   public MinecraftServer cL() {
      return this.dM().o();
   }

   public blw a(chl $$0, enz $$1, blv $$2) {
      return blw.d;
   }

   public boolean a(cvj $$0) {
      return false;
   }

   public void a(boi $$0, bnq $$1) {
      if ($$1 instanceof boi) {
         ctn.a((boi)$$1, $$0);
      }

      ctn.b($$0, $$1);
   }

   public void c(aox $$0) {
   }

   public void d(aox $$0) {
   }

   public float a(dfe $$0) {
      float $$1 = awi.g(this.dC());
      switch ($$0) {
         case c:
            return $$1 + 180.0F;
         case d:
            return $$1 + 270.0F;
         case b:
            return $$1 + 90.0F;
         default:
            return $$1;
      }
   }

   public float a(ddo $$0) {
      float $$1 = awi.g(this.dC());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public boolean cM() {
      return false;
   }

   public cie a(cid $$0) {
      return this.ai().a(aud.r) ? cie.b : cie.a;
   }

   @Nullable
   public boi cN() {
      return null;
   }

   public final boolean cO() {
      return this.cN() != null;
   }

   public final List<bnq> cP() {
      return this.r;
   }

   @Nullable
   public bnq cQ() {
      return this.r.isEmpty() ? null : (bnq)this.r.get(0);
   }

   public boolean w(bnq $$0) {
      return this.r.contains($$0);
   }

   public boolean a(Predicate<bnq> $$0) {
      UnmodifiableIterator var2 = this.r.iterator();

      while (var2.hasNext()) {
         bnq $$1 = (bnq)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bnq> B() {
      return this.r.stream().flatMap(bnq::cR);
   }

   @Override
   public Stream<bnq> cR() {
      return Stream.concat(Stream.of(this), this.B());
   }

   @Override
   public Stream<bnq> cS() {
      return Stream.concat(this.r.stream().flatMap(bnq::cS), Stream.of(this));
   }

   public Iterable<bnq> cT() {
      return () -> this.B().iterator();
   }

   public int cU() {
      return (int)this.B().filter($$0 -> $$0 instanceof chl).count();
   }

   public boolean cV() {
      return this.cU() == 1;
   }

   public bnq cW() {
      bnq $$0 = this;

      while ($$0.bO()) {
         $$0 = $$0.cZ();
      }

      return $$0;
   }

   public boolean x(bnq $$0) {
      return this.cW() == $$0.cW();
   }

   public boolean y(bnq $$0) {
      if (!$$0.bO()) {
         return false;
      } else {
         bnq $$1 = $$0.cZ();
         return $$1 == this ? true : this.y($$1);
      }
   }

   public boolean cX() {
      return this.cN() instanceof chl $$0 ? $$0.g() : this.cY();
   }

   public boolean cY() {
      return !this.dM().B;
   }

   protected static enz a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -awi.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = awi.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new enz((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public enz b(boi $$0) {
      return new enz(this.dr(), this.cH().e, this.dx());
   }

   @Nullable
   public bnq cZ() {
      return this.s;
   }

   @Nullable
   public bnq da() {
      return this.s != null && this.s.cN() == this ? this.s : null;
   }

   public ehb s_() {
      return ehb.a;
   }

   public atm db() {
      return atm.g;
   }

   protected int dc() {
      return 1;
   }

   public du dd() {
      return new du(
         this, this.dk(), this.bG(), this.dM() instanceof aow ? (aow)this.dM() : null, this.F(), this.ad().getString(), this.Q_(), this.dM().o(), this
      );
   }

   protected int F() {
      return 0;
   }

   public boolean m(int $$0) {
      return this.F() >= $$0;
   }

   @Override
   public boolean l_() {
      return this.dM().Z().b(cvn.p);
   }

   @Override
   public boolean x_() {
      return true;
   }

   @Override
   public boolean W_() {
      return true;
   }

   public void a(eg.a $$0, enz $$1) {
      enz $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.s(awi.g((float)(-(awi.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.r(awi.g((float)(awi.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dC());
      this.N = this.dE();
      this.M = this.dC();
   }

   public boolean a(aup<egv> $$0, double $$1) {
      if (this.de()) {
         return false;
      } else {
         enu $$2 = this.cH().h(0.001);
         int $$3 = awi.a($$2.a);
         int $$4 = awi.c($$2.d);
         int $$5 = awi.a($$2.b);
         int $$6 = awi.c($$2.e);
         int $$7 = awi.a($$2.c);
         int $$8 = awi.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cz();
         boolean $$11 = false;
         enz $$12 = enz.b;
         int $$13 = 0;
         hz.a $$14 = new hz.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  egw $$18 = this.dM().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((cux)this.dM(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           enz $$20 = $$18.c(this.dM(), $$14);
                           if ($$9 < 0.4) {
                              $$20 = $$20.a($$9);
                           }

                           $$12 = $$12.e($$20);
                           $$13++;
                        }
                     }
                  }
               }
            }
         }

         if ($$12.f() > 0.0) {
            if ($$13 > 0) {
               $$12 = $$12.a(1.0 / (double)$$13);
            }

            if (!(this instanceof chl)) {
               $$12 = $$12.d();
            }

            enz $$21 = this.dp();
            $$12 = $$12.a($$1 * 1.0);
            double $$22 = 0.003;
            if (Math.abs($$21.c) < 0.003 && Math.abs($$21.e) < 0.003 && $$12.f() < 0.0045000000000000005) {
               $$12 = $$12.d().a(0.0045000000000000005);
            }

            this.g(this.dp().e($$12));
         }

         this.ai.put($$0, $$9);
         return $$11;
      }
   }

   public boolean de() {
      enu $$0 = this.cH().g(1.0);
      int $$1 = awi.a($$0.a);
      int $$2 = awi.c($$0.d);
      int $$3 = awi.a($$0.c);
      int $$4 = awi.c($$0.f);
      return !this.dM().b($$1, $$3, $$2, $$4);
   }

   public double b(aup<egv> $$0) {
      return this.ai.getDouble($$0);
   }

   public double df() {
      return (double)this.cI() < 0.4 ? 0.0 : 0.4;
   }

   public final float dg() {
      return this.bf.a();
   }

   public final float dh() {
      return this.bf.b();
   }

   public xx<aag> di() {
      return new aah(this);
   }

   public bnt a(bot $$0) {
      return this.p.n();
   }

   public final bns dj() {
      return this.bf.d();
   }

   public enz dk() {
      return this.u;
   }

   public enz dl() {
      return this.dk();
   }

   @Override
   public hz dm() {
      return this.v;
   }

   public dlj dn() {
      if (this.bl == null) {
         this.bl = this.dM().a_(this.dm());
      }

      return this.bl;
   }

   public cuy do() {
      return this.aD;
   }

   public enz dp() {
      return this.aE;
   }

   public void g(enz $$0) {
      this.aE = $$0;
   }

   public void h(enz $$0) {
      this.g(this.dp().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.g(new enz($$0, $$1, $$2));
   }

   public final int dq() {
      return this.v.u();
   }

   public final double dr() {
      return this.u.c;
   }

   public double c(double $$0) {
      return this.u.c + (double)this.dg() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.af.j() - 1.0) * $$0);
   }

   public final int ds() {
      return this.v.v();
   }

   public final double dt() {
      return this.u.d;
   }

   public double e(double $$0) {
      return this.u.d + (double)this.dh() * $$0;
   }

   public double du() {
      return this.e(this.af.j());
   }

   public double dv() {
      return this.u.d + (double)this.bg;
   }

   public final int dw() {
      return this.v.w();
   }

   public final double dx() {
      return this.u.e;
   }

   public double f(double $$0) {
      return this.u.e + (double)this.dg() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.af.j() - 1.0) * $$0);
   }

   public final void p(double $$0, double $$1, double $$2) {
      if (this.u.c != $$0 || this.u.d != $$1 || this.u.e != $$2) {
         this.u = new enz($$0, $$1, $$2);
         int $$3 = awi.a($$0);
         int $$4 = awi.a($$1);
         int $$5 = awi.a($$2);
         if ($$3 != this.v.u() || $$4 != this.v.v() || $$5 != this.v.w()) {
            this.v = new hz($$3, $$4, $$5);
            this.bl = null;
            if (jb.a($$3) != this.aD.e || jb.a($$5) != this.aD.f) {
               this.aD = new cuy(this.v);
            }
         }

         this.aX.a();
      }
   }

   public void dy() {
   }

   public enz q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bg * 0.7, 0.0);
   }

   public void a(aah $$0) {
      int $$1 = $$0.b();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      double $$4 = $$0.i();
      this.f($$2, $$3, $$4);
      this.e($$2, $$3, $$4);
      this.s($$0.m());
      this.r($$0.n());
      this.e($$1);
      this.a_($$0.e());
   }

   @Nullable
   public cpd dz() {
      return null;
   }

   public void o(boolean $$0) {
      this.az = $$0;
   }

   public boolean dA() {
      return !this.ai().a(aud.k);
   }

   public boolean dB() {
      return (this.az || this.aA) && this.dA();
   }

   public float dC() {
      return this.aF;
   }

   public float dD() {
      return this.dC();
   }

   public void r(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aF = $$0;
      }
   }

   public float dE() {
      return this.aG;
   }

   public void s(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aG = $$0;
      }
   }

   public boolean dF() {
      return false;
   }

   public float dG() {
      return 0.0F;
   }

   public final boolean dH() {
      return this.aJ != null;
   }

   @Nullable
   public bnq.c dI() {
      return this.aJ;
   }

   @Override
   public final void b(bnq.c $$0) {
      if (this.aJ == null) {
         this.aJ = $$0;
      }

      if (this.aJ.a()) {
         this.ac();
      }

      this.cP().forEach(bnq::ac);
      this.aX.a($$0);
   }

   protected void dJ() {
      this.aJ = null;
   }

   @Override
   public void a(dpe $$0) {
      this.aX = $$0;
   }

   @Override
   public boolean dK() {
      if (this.aJ != null && !this.aJ.b()) {
         return false;
      } else {
         return this.bO() ? false : !this.bP() || !this.cV();
      }
   }

   @Override
   public boolean dL() {
      return false;
   }

   public boolean a(cvr $$0, hz $$1) {
      return true;
   }

   public cvr dM() {
      return this.t;
   }

   protected void a(cvr $$0) {
      this.t = $$0;
   }

   public bmq dN() {
      return this.dM().ah();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = awi.d($$6, this.dr(), $$1);
      double $$8 = awi.d($$6, this.dt(), $$2);
      double $$9 = awi.d($$6, this.dx(), $$3);
      float $$10 = (float)awi.e($$6, (double)this.dC(), $$4);
      float $$11 = (float)awi.d($$6, (double)this.dE(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   @FunctionalInterface
   public interface a {
      void accept(bnq var1, double var2, double var4, double var6);
   }

   public static enum b {
      a(false, false),
      b(true, false),
      c(false, true),
      d(true, true);

      final boolean e;
      final boolean f;

      private b(boolean $$0, boolean $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public boolean a() {
         return this.f || this.e;
      }

      public boolean b() {
         return this.f;
      }

      public boolean c() {
         return this.e;
      }
   }

   public static enum c {
      a(true, false),
      b(true, false),
      c(false, true),
      d(false, false),
      e(false, false);

      private final boolean f;
      private final boolean g;

      private c(boolean $$0, boolean $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public boolean a() {
         return this.f;
      }

      public boolean b() {
         return this.g;
      }
   }
}
