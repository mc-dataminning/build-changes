import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import java.util.Arrays;
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

public abstract class bow implements aip, bnh, dqu, dt, equ {
   private static final Logger c = LogUtils.getLogger();
   public static final String w = "id";
   public static final String x = "Passengers";
   private static final AtomicInteger d = new AtomicInteger();
   public static final int y = 60;
   public static final int z = 300;
   public static final int A = 1024;
   public static final float B = 0.2F;
   public static final double C = 0.500001;
   public static final double D = 0.999999;
   public static final int E = 140;
   public static final int F = 40;
   public static final int G = 3;
   private static final epm e = new epm(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double k = 0.014;
   private static final double l = 0.007;
   private static final double m = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double n = 1.0;
   private final bpc<?> o;
   private int p = d.incrementAndGet();
   public boolean I;
   private ImmutableList<bow> q = ImmutableList.of();
   protected int J;
   @Nullable
   private bow r;
   private cwz s;
   public double K;
   public double L;
   public double M;
   private epr t;
   private ib u;
   private cwg v;
   private epr aE = epr.b;
   private float aF;
   private float aG;
   public float N;
   public float O;
   private epm aH = e;
   private boolean aI;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected epr U = epr.b;
   @Nullable
   private bow.c aJ;
   public static final float V = 0.6F;
   public static final float W = 1.8F;
   public float X;
   public float Y;
   public float Z;
   public float aa;
   public float ab;
   private float aK = 1.0F;
   public double ac;
   public double ad;
   public double ae;
   public boolean af;
   protected final axd ag = axd.a();
   public int ah;
   private int aL = -this.dc();
   protected boolean ai;
   protected Object2DoubleMap<avd<eim>> aj = new Object2DoubleArrayMap(2);
   protected boolean ak;
   private final Set<avd<eim>> aM = new HashSet<>();
   public int al;
   protected boolean am = true;
   protected final aiq an;
   protected static final aim<Byte> ao = aiq.a(bow.class, aio.a);
   protected static final int ap = 0;
   private static final int aN = 1;
   private static final int aO = 3;
   private static final int aP = 4;
   private static final int aQ = 5;
   protected static final int aq = 6;
   protected static final int ar = 7;
   private static final aim<Integer> aR = aiq.a(bow.class, aio.b);
   private static final aim<Optional<vu>> aS = aiq.a(bow.class, aio.g);
   private static final aim<Boolean> aT = aiq.a(bow.class, aio.k);
   private static final aim<Boolean> aU = aiq.a(bow.class, aio.k);
   private static final aim<Boolean> aV = aiq.a(bow.class, aio.k);
   protected static final aim<bpz> as = aiq.a(bow.class, aio.v);
   private static final aim<Integer> aW = aiq.a(bow.class, aio.b);
   private dqv aX = dqv.a;
   private final agw aY = new agw();
   public boolean at;
   public boolean au;
   private int aZ;
   protected boolean av;
   protected int aw;
   protected ib ax;
   private boolean ba;
   protected UUID ay = aww.a(this.ag);
   protected String az = this.ay.toString();
   private boolean bb;
   private final Set<String> bc = Sets.newHashSet();
   private final double[] bd = new double[]{0.0, 0.0, 0.0};
   private long be;
   private boz bf;
   private float bg;
   public boolean aA;
   public boolean aB;
   public boolean aC;
   public Optional<ib> aD = Optional.empty();
   private boolean bh = false;
   private float bi;
   private int bj;
   private boolean bk;
   @Nullable
   private dmz bl = null;

   public bow(bpc<?> $$0, cwz $$1) {
      this.o = $$0;
      this.s = $$1;
      this.bf = $$0.n();
      this.t = epr.b;
      this.u = ib.c;
      this.v = cwg.b;
      aiq.a $$2 = new aiq.a(this);
      $$2.a(ao, (byte)0);
      $$2.a(aR, this.ch());
      $$2.a(aT, false);
      $$2.a(aS, Optional.empty());
      $$2.a(aU, false);
      $$2.a(aV, false);
      $$2.a(as, bpz.a);
      $$2.a(aW, 0);
      this.a($$2);
      this.an = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.bg = this.bf.c();
   }

   public boolean a(ib $$0, dmz $$1) {
      eqk $$2 = $$1.b(this.dM(), $$0, epw.a(this));
      eqk $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return eqh.c($$3, eqh.a(this.cH()), epv.i);
   }

   public int i_() {
      eqx $$0 = this.cg();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean N_() {
      return false;
   }

   public final void ag() {
      if (this.bP()) {
         this.bE();
      }

      if (this.bO()) {
         this.ac();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.aY.e(new epr($$0, $$1, $$2));
   }

   public agw ah() {
      return this.aY;
   }

   public bpc<?> ai() {
      return this.o;
   }

   @Override
   public int aj() {
      return this.p;
   }

   public void e(int $$0) {
      this.p = $$0;
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
      this.a(bow.c.a);
      this.b(drn.p);
   }

   public final void am() {
      this.a(bow.c.b);
   }

   protected abstract void a(aiq.a var1);

   public aiq an() {
      return this.an;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bow ? ((bow)$$0).p == this.p : false;
   }

   @Override
   public int hashCode() {
      return this.p;
   }

   public void a(bow.c $$0) {
      this.b($$0);
   }

   public void ao() {
   }

   public void b(bpz $$0) {
      this.an.a(as, $$0);
   }

   public bpz ap() {
      return this.an.a(as);
   }

   public boolean c(bpz $$0) {
      return this.ap() == $$0;
   }

   public boolean a(bow $$0, double $$1) {
      return this.dk().a((iv)$$0.dk(), $$1);
   }

   public boolean a(bow $$0, double $$1, double $$2) {
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.dt() - this.dt();
      double $$5 = $$0.dx() - this.dx();
      return aww.e($$3, $$5) < aww.k($$1) && aww.k($$4) < aww.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.r($$0 % 360.0F);
      this.s($$1 % 360.0F);
   }

   public final void b(epr $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.aq());
   }

   protected epm aq() {
      return this.bf.a(this.t);
   }

   protected void ar() {
      this.a_(this.t.c, this.t.d, this.t.e);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.s(this.dE() + $$2);
      this.r(this.dC() + $$3);
      this.s(aww.a(this.dE(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = aww.a(this.O, -90.0F, 90.0F);
      if (this.r != null) {
         this.r.k(this);
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

      if (this.J > 0) {
         this.J--;
      }

      this.X = this.Y;
      this.O = this.dE();
      this.N = this.dC();
      this.bL();
      if (this.bo()) {
         this.bp();
      }

      this.aB = this.aA;
      this.aA = false;
      this.bj();
      this.z();
      this.bi();
      if (this.dM().B) {
         this.aA();
      } else if (this.aL > 0) {
         if (this.bb()) {
            this.i(this.aL - 4);
            if (this.aL < 0) {
               this.aA();
            }
         } else {
            if (this.aL % 20 == 0 && !this.bq()) {
               this.a(this.dN().c(), 1.0F);
            }

            this.i(this.aL - 1);
         }

         if (this.cj() > 0) {
            this.l(0);
            this.dM().a(null, 1009, this.u, 1);
         }
      }

      if (this.bq()) {
         this.ay();
         this.ab *= 0.5F;
      }

      this.at();
      if (!this.dM().B) {
         this.a_(this.aL > 0);
      }

      this.am = false;
      this.dM().ae().c();
   }

   public void a_(boolean $$0) {
      this.b(0, $$0 || this.bk);
   }

   public void at() {
      if (this.dt() < (double)(this.dM().I_() - 64)) {
         this.aB();
      }
   }

   public void au() {
      this.aZ = this.bM();
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
      if (!this.bb()) {
         this.g(15);
         if (this.a(this.dN().d(), 4.0F)) {
            this.a(aty.jP, 0.4F, 2.0F + this.ag.i() * 0.4F);
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

   private boolean b(epm $$0) {
      return this.dM().a(this, $$0) && !this.dM().d($$0);
   }

   public void c(boolean $$0) {
      this.aI = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, epr $$1) {
      this.aI = $$0;
      this.b($$0, $$1);
   }

   public boolean d(ib $$0) {
      return this.aD.isPresent() && this.aD.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable epr $$1) {
      if ($$0) {
         epm $$2 = this.cH();
         epm $$3 = new epm($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<ib> $$4 = this.s.g(this, $$3);
         if ($$4.isPresent() || this.bh) {
            this.aD = $$4;
         } else if ($$1 != null) {
            epm $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
            $$4 = this.s.g(this, $$5);
            this.aD = $$4;
         }

         this.bh = $$4.isEmpty();
      } else {
         this.bh = false;
         if (this.aD.isPresent()) {
            this.aD = Optional.empty();
         }
      }
   }

   public boolean aC() {
      return this.aI;
   }

   public void a(bpt $$0, epr $$1) {
      if (this.af) {
         this.a_(this.dr() + $$1.c, this.dt() + $$1.d, this.dx() + $$1.e);
      } else {
         this.aC = this.bN();
         if ($$0 == bpt.c) {
            $$1 = this.d($$1);
            if ($$1.equals(epr.b)) {
               return;
            }
         }

         this.dM().ae().a("move");
         if (this.U.g() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = epr.b;
            this.g(epr.b);
         }

         $$1 = this.a($$1, $$0);
         epr $$2 = this.a($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ab != 0.0F && $$3 >= 1.0) {
               epn $$4 = this.dM().a(new cwi(this.dk(), this.dk().e($$2), cwi.a.d, cwi.b.d, this));
               if ($$4.c() != epp.a.a) {
                  this.n();
               }
            }

            this.a_(this.dr() + $$2.c, this.dt() + $$2.d, this.dx() + $$2.e);
         }

         this.dM().ae().c();
         this.dM().ae().a("rest");
         boolean $$5 = !aww.b($$1.c, $$2.c);
         boolean $$6 = !aww.b($$1.e, $$2.e);
         this.P = $$5 || $$6;
         this.Q = $$1.d != $$2.d;
         this.R = this.Q && $$1.d < 0.0;
         if (this.P) {
            this.S = this.c($$2);
         } else {
            this.S = false;
         }

         this.a(this.R, $$2);
         ib $$7 = this.aH();
         dmz $$8 = this.dM().a_($$7);
         this.a($$2.d, this.aC(), $$8, $$7);
         if (this.dH()) {
            this.dM().ae().c();
         } else {
            if (this.P) {
               epr $$9 = this.dp();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            daa $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dM(), this);
            }

            if (this.aC()) {
               $$10.a(this.dM(), $$7, $$8, this);
            }

            bow.b $$11 = this.aZ();
            if ($$11.a() && !this.bO()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.aa = this.aa + (float)($$2.f() * 0.6);
               ib $$15 = this.aJ();
               dmz $$16 = this.dM().a_($$15);
               boolean $$17 = this.c($$16);
               if (!$$17) {
                  $$13 = 0.0;
               }

               this.Y = this.Y + (float)$$2.h() * 0.6F;
               this.Z = this.Z + (float)Math.sqrt($$12 * $$12 + $$13 * $$13 + $$14 * $$14) * 0.6F;
               if (this.Z > this.aK && !$$16.i()) {
                  boolean $$18 = $$15.equals($$7);
                  boolean $$19 = this.a($$7, $$8, $$11.c(), $$18, $$1);
                  if (!$$18) {
                     $$19 |= this.a($$15, $$16, false, $$11.b(), $$1);
                  }

                  if ($$19) {
                     this.aK = this.aM();
                  } else if (this.bc()) {
                     this.aK = this.aM();
                     if ($$11.c()) {
                        this.aR();
                     }

                     if ($$11.b()) {
                        this.b(drn.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aG();
               }
            }

            this.aD();
            float $$20 = this.aL();
            this.g(this.dp().d((double)$$20, 1.0, (double)$$20));
            if (this.dM().c(this.cH().h(1.0E-6)).noneMatch($$0x -> $$0x.a(aun.aK) || $$0x.a(dac.H))) {
               if (this.aL <= 0) {
                  this.i(-this.dc());
               }

               if (this.aC && (this.aA || this.be())) {
                  this.aE();
               }
            }

            if (this.bN() && (this.aA || this.be())) {
               this.i(-this.dc());
            }

            this.dM().ae().c();
         }
      }
   }

   private boolean c(dmz $$0) {
      return $$0.a(aun.aP) || $$0.a(dac.qP);
   }

   private boolean a(ib $$0, dmz $$1, boolean $$2, boolean $$3, epr $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aC() || $$5 || this.bX() && $$4.d == 0.0 || this.cf()) && !this.bZ()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dM().a(drn.P, this.dk(), drn.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(epr $$0) {
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
      this.a(aty.jU, 0.7F, 1.6F + (this.ag.i() - this.ag.i()) * 0.4F);
   }

   public void aF() {
      if (!this.dM().B && this.aC) {
         this.aE();
      }

      this.aA();
   }

   protected void aG() {
      if (this.aT()) {
         this.aS();
         if (this.aZ().b()) {
            this.b(drn.x);
         }
      }
   }

   @Deprecated
   public ib aH() {
      return this.d(0.2F);
   }

   protected ib aI() {
      return this.d(0.500001F);
   }

   public ib aJ() {
      return this.d(1.0E-5F);
   }

   protected ib d(float $$0) {
      if (this.aD.isPresent()) {
         ib $$1 = this.aD.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dmz $$2 = this.dM().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(aun.S)) && !$$2.a(aun.L) && !($$2.b() instanceof dcz) ? $$1.h(aww.a(this.t.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = aww.a(this.t.c);
         int $$4 = aww.a(this.t.d - (double)$$0);
         int $$5 = aww.a(this.t.e);
         return new ib($$3, $$4, $$5);
      }
   }

   protected float aK() {
      float $$0 = this.dM().a_(this.dm()).b().k();
      float $$1 = this.dM().a_(this.aI()).b().k();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aL() {
      dmz $$0 = this.dM().a_(this.dm());
      float $$1 = $$0.b().j();
      if (!$$0.a(dac.G) && !$$0.a(dac.nd)) {
         return (double)$$1 == 1.0 ? this.dM().a_(this.aI()).b().j() : $$1;
      } else {
         return $$1;
      }
   }

   protected epr a(epr $$0, bpt $$1) {
      return $$0;
   }

   protected epr d(epr $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dM().X();
         if ($$1 != this.be) {
            Arrays.fill(this.bd, 0.0);
            this.be = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(ih.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? epr.b : new epr($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(ih.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? epr.b : new epr(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(ih.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? epr.b : new epr(0.0, 0.0, $$4);
         } else {
            return epr.b;
         }
      }
   }

   private double a(ih.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = aww.a($$1 + this.bd[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bd[$$2];
      this.bd[$$2] = $$3;
      return $$1;
   }

   private epr a(epr $$0) {
      epm $$1 = this.cH();
      List<eqk> $$2 = this.dM().c(this, $$1.b($$0));
      epr $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dM(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.aC() || $$5 && $$0.d < 0.0;
      if (this.dG() > 0.0F && $$7 && ($$4 || $$6)) {
         epr $$8 = a(this, new epr($$0.c, (double)this.dG(), $$0.e), $$1, this.dM(), $$2);
         epr $$9 = a(this, new epr(0.0, (double)this.dG(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dM(), $$2);
         if ($$9.d < (double)this.dG()) {
            epr $$10 = a(this, new epr($$0.c, 0.0, $$0.e), $$1.c($$9), this.dM(), $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new epr(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.dM(), $$2));
         }
      }

      return $$3;
   }

   public static epr a(@Nullable bow $$0, epr $$1, epm $$2, cwz $$3, List<eqk> $$4) {
      Builder<eqk> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      doq $$6 = $$3.C_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.e($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static epr a(epr $$0, epm $$1, List<eqk> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = eqh.a(ih.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = eqh.a(ih.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = eqh.a(ih.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = eqh.a(ih.a.c, $$1, $$2, $$5);
         }

         return new epr($$3, $$4, $$5);
      }
   }

   protected float aM() {
      return (float)((int)this.Z + 1);
   }

   protected atx aN() {
      return aty.jY;
   }

   protected atx aO() {
      return aty.jX;
   }

   protected atx aP() {
      return aty.jX;
   }

   protected void aQ() {
      epm $$0 = this.cH();
      ib $$1 = ib.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      ib $$2 = ib.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dM().a($$1, $$2)) {
         ib.a $$3 = new ib.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bA()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  dmz $$7 = this.dM().a_($$3);

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

   protected void a(dmz $$0) {
   }

   public void a(il<drn> $$0, @Nullable bow $$1) {
      this.dM().a($$1, $$0, this.t);
   }

   public void b(il<drn> $$0) {
      this.a($$0, this);
   }

   private void c(ib $$0, dmz $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.r();
      }
   }

   protected void aR() {
      bow $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      epr $$2 = $$0.dp();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected ib e(ib $$0) {
      ib $$1 = $$0.c();
      dmz $$2 = this.dM().a_($$1);
      return !$$2.a(aun.bn) && !$$2.a(aun.bo) ? $$0 : $$1;
   }

   protected void a(dmz $$0, dmz $$1) {
      dhm $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dmz $$0) {
      dhm $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(ib $$0, dmz $$1) {
      dhm $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dmz $$0) {
      return $$0.a(aun.bm) && this.ah >= this.bj + 20;
   }

   private void r() {
      this.bi = this.bi * (float)Math.pow(0.997, (double)(this.ah - this.bj));
      this.bi = Math.min(1.0F, this.bi + 0.07F);
      float $$0 = 0.5F + this.bi * this.ag.i() * 1.2F;
      float $$1 = 0.1F + this.bi * 1.2F;
      this.a(aty.E, $$1, $$0);
      this.bj = this.ah;
   }

   protected void e(float $$0) {
      this.a(this.aN(), $$0, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
   }

   protected void aS() {
   }

   protected boolean aT() {
      return false;
   }

   public void a(atx $$0, float $$1, float $$2) {
      if (!this.aU()) {
         this.dM().a(null, this.dr(), this.dt(), this.dx(), $$0, this.db(), $$1, $$2);
      }
   }

   public void a(atx $$0) {
      if (!this.aU()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean aU() {
      return this.an.a(aU);
   }

   public void d(boolean $$0) {
      this.an.a(aU, $$0);
   }

   public boolean aV() {
      return this.an.a(aV);
   }

   public void e(boolean $$0) {
      this.an.a(aV, $$0);
   }

   protected double aW() {
      return 0.0;
   }

   public final double aX() {
      return this.aV() ? 0.0 : this.aW();
   }

   protected void aY() {
      double $$0 = this.aX();
      if ($$0 != 0.0) {
         this.g(this.dp().b(0.0, -$$0, 0.0));
      }
   }

   protected bow.b aZ() {
      return bow.b.d;
   }

   public boolean ba() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dmz $$2, ib $$3) {
      if ($$1) {
         if (this.ab > 0.0F) {
            $$2.b().a(this.dM(), $$2, $$3, this, this.ab);
            this.dM().a(drn.A, this.t, drn.a.a(this, this.aD.<dmz>map($$0x -> this.dM().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ab -= (float)$$0;
      }
   }

   public boolean bb() {
      return this.ai().d();
   }

   public boolean a(float $$0, float $$1, bnv $$2) {
      if (this.o.a(auq.o)) {
         return false;
      } else {
         if (this.bP()) {
            for (bow $$3 : this.cP()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean bc() {
      return this.ai;
   }

   private boolean w() {
      ib $$0 = this.dm();
      return this.dM().r($$0) || this.dM().r(ib.a((double)$$0.u(), this.cH().e, (double)$$0.w()));
   }

   private boolean x() {
      return this.dM().a_(this.dm()).a(dac.nd);
   }

   public boolean bd() {
      return this.bc() || this.w();
   }

   public boolean be() {
      return this.bc() || this.w() || this.x();
   }

   public boolean bf() {
      return this.bc() || this.x();
   }

   public boolean bg() {
      return this.bf() || this.bq();
   }

   public boolean bh() {
      return this.ak && this.bc();
   }

   public void bi() {
      if (this.bZ()) {
         this.h(this.bY() && this.bc() && !this.bO());
      } else {
         this.h(this.bY() && this.bh() && !this.bO() && this.dM().b_(this.u).a(aus.a));
      }
   }

   protected boolean bj() {
      this.aj.clear();
      this.bk();
      double $$0 = this.dM().D_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(aus.b, $$0);
      return this.bc() || $$1;
   }

   void bk() {
      if (this.cZ() instanceof ckp $$0 && !$$0.bh()) {
         this.ai = false;
         return;
      }

      if (this.a(aus.a, 0.014)) {
         if (!this.ai && !this.am) {
            this.bl();
         }

         this.n();
         this.ai = true;
         this.aA();
      } else {
         this.ai = false;
      }
   }

   private void z() {
      this.ak = this.a(aus.a);
      this.aM.clear();
      double $$0 = this.dv();
      if (this.cZ() instanceof ckp $$2 && !$$2.bh() && $$2.cH().e >= $$0 && $$2.cH().b <= $$0) {
         return;
      }

      ib $$3 = ib.a(this.dr(), $$0, this.dx());
      ein $$4 = this.dM().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((cwf)this.dM(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aM::add);
      }
   }

   protected void bl() {
      bow $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      epr $$2 = $$0.dp();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aO(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      } else {
         this.a(this.aP(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      }

      float $$4 = (float)aww.a(this.dt());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bf.a() * 20.0F; $$5++) {
         double $$6 = (this.ag.j() * 2.0 - 1.0) * (double)this.bf.a();
         double $$7 = (this.ag.j() * 2.0 - 1.0) * (double)this.bf.a();
         this.dM().a(kc.e, this.dr() + $$6, (double)($$4 + 1.0F), this.dx() + $$7, $$2.c, $$2.d - this.ag.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bf.a() * 20.0F; $$8++) {
         double $$9 = (this.ag.j() * 2.0 - 1.0) * (double)this.bf.a();
         double $$10 = (this.ag.j() * 2.0 - 1.0) * (double)this.bf.a();
         this.dM().a(kc.ak, this.dr() + $$9, (double)($$4 + 1.0F), this.dx() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.b(drn.O);
   }

   @Deprecated
   protected dmz bm() {
      return this.dM().a_(this.aH());
   }

   public dmz bn() {
      return this.dM().a_(this.aJ());
   }

   public boolean bo() {
      return this.bY() && !this.bc() && !this.N_() && !this.bX() && !this.bq() && this.bA();
   }

   protected void bp() {
      ib $$0 = this.aH();
      dmz $$1 = this.dM().a_($$0);
      if ($$1.l() != dgf.a) {
         epr $$2 = this.dp();
         ib $$3 = this.dm();
         double $$4 = this.dr() + (this.ag.j() - 0.5) * (double)this.bf.a();
         double $$5 = this.dx() + (this.ag.j() - 0.5) * (double)this.bf.a();
         if ($$3.u() != $$0.u()) {
            $$4 = aww.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = aww.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dM().a(new ju(kc.c, $$1), $$4, this.dt() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(avd<eim> $$0) {
      return this.aM.contains($$0);
   }

   public boolean bq() {
      return !this.am && this.aj.getDouble(aus.b) > 0.0;
   }

   public void a(float $$0, epr $$1) {
      epr $$2 = a($$1, $$0, this.dC());
      this.g(this.dp().e($$2));
   }

   private static epr a(epr $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return epr.b;
      } else {
         epr $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = aww.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = aww.b($$2 * (float) (Math.PI / 180.0));
         return new epr($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float br() {
      return this.dM().f(this.dq(), this.dw()) ? this.dM().x(ib.a(this.dr(), this.dv(), this.dx())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.r($$3 % 360.0F);
      this.s(aww.a($$4, -90.0F, 90.0F) % 360.0F);
      this.N = this.dC();
      this.O = this.dE();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = aww.a($$0, -3.0E7, 3.0E7);
      double $$4 = aww.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(epr $$0) {
      this.e($$0.c, $$0.d, $$0.e);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dC(), this.dE());
   }

   public void a(ib $$0, float $$1, float $$2) {
      this.b((double)$$0.u() + 0.5, (double)$$0.v(), (double)$$0.w() + 0.5, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.p($$0, $$1, $$2);
      this.r($$3);
      this.s($$4);
      this.bs();
      this.ar();
   }

   public final void bs() {
      double $$0 = this.dr();
      double $$1 = this.dt();
      double $$2 = this.dx();
      this.K = $$0;
      this.L = $$1;
      this.M = $$2;
      this.ac = $$0;
      this.ad = $$1;
      this.ae = $$2;
      this.N = this.dC();
      this.O = this.dE();
   }

   public float f(bow $$0) {
      float $$1 = (float)(this.dr() - $$0.dr());
      float $$2 = (float)(this.dt() - $$0.dt());
      float $$3 = (float)(this.dx() - $$0.dx());
      return aww.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dr() - $$0;
      double $$4 = this.dt() - $$1;
      double $$5 = this.dx() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(bow $$0) {
      return this.f($$0.dk());
   }

   public double f(epr $$0) {
      double $$1 = this.dr() - $$0.c;
      double $$2 = this.dt() - $$0.d;
      double $$3 = this.dx() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cis $$0) {
   }

   public void h(bow $$0) {
      if (!this.y($$0)) {
         if (!$$0.af && !this.af) {
            double $$1 = $$0.dr() - this.dr();
            double $$2 = $$0.dx() - this.dx();
            double $$3 = aww.a($$1, $$2);
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
               if (!this.bP() && this.bx()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.bP() && $$0.bx()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void j(double $$0, double $$1, double $$2) {
      this.g(this.dp().b($$0, $$1, $$2));
      this.au = true;
   }

   protected void bt() {
      this.T = true;
   }

   public boolean a(bnv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bt();
         return false;
      }
   }

   public final epr f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dE() : aww.i($$0, this.O, this.dE());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dC() : aww.i($$0, this.N, this.dC());
   }

   protected final epr b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = aww.b($$3);
      float $$5 = aww.a($$3);
      float $$6 = aww.b($$2);
      float $$7 = aww.a($$2);
      return new epr((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final epr i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final epr c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final epr bu() {
      return new epr(this.dr(), this.dv(), this.dx());
   }

   public final epr j(float $$0) {
      double $$1 = aww.d((double)$$0, this.K, this.dr());
      double $$2 = aww.d((double)$$0, this.L, this.dt()) + (double)this.cI();
      double $$3 = aww.d((double)$$0, this.M, this.dx());
      return new epr($$1, $$2, $$3);
   }

   public epr k(float $$0) {
      return this.j($$0);
   }

   public final epr l(float $$0) {
      double $$1 = aww.d((double)$$0, this.K, this.dr());
      double $$2 = aww.d((double)$$0, this.L, this.dt());
      double $$3 = aww.d((double)$$0, this.M, this.dx());
      return new epr($$1, $$2, $$3);
   }

   public epp a(double $$0, float $$1, boolean $$2) {
      epr $$3 = this.j($$1);
      epr $$4 = this.f($$1);
      epr $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dM().a(new cwi($$3, $$5, cwi.a.b, $$2 ? cwi.b.c : cwi.b.a, this));
   }

   public boolean bv() {
      return this.bA() && this.bw();
   }

   public boolean bw() {
      return false;
   }

   public boolean bx() {
      return false;
   }

   public void a(bow $$0, int $$1, bnv $$2) {
      if ($$0 instanceof apg) {
         am.d.a((apg)$$0, this, $$2);
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

      $$1 *= 64.0 * n;
      return $$0 < $$1 * $$1;
   }

   public boolean d(ta $$0) {
      if (this.aJ != null && !this.aJ.b()) {
         return false;
      } else {
         String $$1 = this.bz();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.f($$0);
            return true;
         }
      }
   }

   public boolean e(ta $$0) {
      return this.bO() ? false : this.d($$0);
   }

   public ta f(ta $$0) {
      try {
         if (this.r != null) {
            $$0.a("Pos", this.a(this.r.dr(), this.dt(), this.r.dx()));
         } else {
            $$0.a("Pos", this.a(this.dr(), this.dt(), this.dx()));
         }

         epr $$1 = this.dp();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dC(), this.dE()));
         $$0.a("FallDistance", this.ab);
         $$0.a("Fire", (short)this.aL);
         $$0.a("Air", (short)this.ci());
         $$0.a("OnGround", this.aC());
         $$0.a("Invulnerable", this.ba);
         $$0.a("PortalCooldown", this.aZ);
         $$0.a("UUID", this.cw());
         vu $$2 = this.af();
         if ($$2 != null) {
            $$0.a("CustomName", vu.a.a($$2));
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
            tg $$4 = new tg();

            for (String $$5 : this.bc) {
               $$4.add(tv.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bP()) {
            tg $$6 = new tg();

            for (bow $$7 : this.cP()) {
               ta $$8 = new ta();
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

   public void g(ta $$0) {
      try {
         tg $$1 = $$0.c("Pos", 6);
         tg $$2 = $$0.c("Motion", 6);
         tg $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(aww.a($$1.h(0), -3.0000512E7, 3.0000512E7), aww.a($$1.h(1), -2.0E7, 2.0E7), aww.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.r($$3.i(0));
         this.s($$3.i(1));
         this.bs();
         this.n(this.dC());
         this.o(this.dC());
         this.ab = $$0.j("FallDistance");
         this.aL = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.k($$0.g("Air"));
         }

         this.aI = $$0.q("OnGround");
         this.ba = $$0.q("Invulnerable");
         this.aZ = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.ay = $$0.a("UUID");
            this.az = this.ay.toString();
         }

         if (!Double.isFinite(this.dr()) || !Double.isFinite(this.dt()) || !Double.isFinite(this.dx())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dC()) && Double.isFinite((double)this.dE())) {
            this.ar();
            this.a(this.dC(), this.dE());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(vu.a.a($$8));
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
               tg $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.bc.add($$10.j($$12));
               }
            }

            this.a($$0);
            if (this.by()) {
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

   protected boolean by() {
      return true;
   }

   @Nullable
   protected final String bz() {
      bpc<?> $$0 = this.ai();
      ajh $$1 = bpc.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(ta var1);

   protected abstract void b(ta var1);

   protected tg a(double... $$0) {
      tg $$1 = new tg();

      for (double $$2 : $$0) {
         $$1.add(tb.a($$2));
      }

      return $$1;
   }

   protected tg a(float... $$0) {
      tg $$1 = new tg();

      for (float $$2 : $$0) {
         $$1.add(td.a($$2));
      }

      return $$1;
   }

   @Nullable
   public cfd a(cwy $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public cfd a(cwy $$0, int $$1) {
      return this.a(new cqk($$0), (float)$$1);
   }

   @Nullable
   public cfd b(cqk $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public cfd a(cqk $$0, float $$1) {
      if ($$0.b()) {
         return null;
      } else if (this.dM().B) {
         return null;
      } else {
         cfd $$2 = new cfd(this.dM(), this.dr(), this.dt() + (double)$$1, this.dx(), $$0);
         $$2.s();
         this.dM().b($$2);
         return $$2;
      }
   }

   public boolean bA() {
      return !this.dH();
   }

   public boolean bB() {
      if (this.af) {
         return false;
      } else {
         float $$0 = this.bf.a() * 0.8F;
         epm $$1 = epm.a(this.bu(), (double)$$0, 1.0E-6, (double)$$0);
         return ib.a($$1)
            .anyMatch(
               $$1x -> {
                  dmz $$2 = this.dM().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dM(), $$1x)
                     && eqh.c($$2.k(this.dM(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), eqh.a($$1), epv.i);
               }
            );
      }
   }

   public bnc a(cis $$0, bnb $$1) {
      return bnc.d;
   }

   public boolean i(bow $$0) {
      return $$0.bC() && !this.y($$0);
   }

   public boolean bC() {
      return false;
   }

   public void t() {
      this.g(epr.b);
      this.l();
      if (this.bO()) {
         this.cZ().j(this);
      }
   }

   public final void j(bow $$0) {
      if (this.x($$0)) {
         this.a($$0, bow::a_);
      }
   }

   protected void a(bow $$0, bow.a $$1) {
      epr $$2 = this.m($$0);
      epr $$3 = $$0.l(this);
      $$1.accept($$0, $$2.c - $$3.c, $$2.d - $$3.d, $$2.e - $$3.e);
   }

   public void k(bow $$0) {
   }

   public epr l(bow $$0) {
      return this.dj().b(box.b, 0, this.aF);
   }

   public epr m(bow $$0) {
      return this.dk().e(this.a($$0, this.bf, 1.0F));
   }

   protected epr a(bow $$0, boz $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static epr a(bow $$0, bow $$1, boy $$2) {
      int $$3 = $$0.cP().indexOf($$1);
      return $$2.c(box.a, $$3, $$0.aF);
   }

   public boolean n(bow $$0) {
      return this.a($$0, false);
   }

   public boolean bD() {
      return this instanceof bpo;
   }

   public boolean a(bow $$0, boolean $$1) {
      if ($$0 == this.r) {
         return false;
      } else if (!$$0.bG()) {
         return false;
      } else {
         for (bow $$2 = $$0; $$2.r != null; $$2 = $$2.r) {
            if ($$2.r == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bO()) {
               this.ac();
            }

            this.b(bpz.a);
            this.r = $$0;
            this.r.p(this);
            $$0.G().filter($$0x -> $$0x instanceof apg).forEach($$0x -> am.U.a((apg)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bow $$0) {
      return !this.bS() && this.J <= 0;
   }

   public void bE() {
      for (int $$0 = this.q.size() - 1; $$0 >= 0; $$0--) {
         ((bow)this.q.get($$0)).ac();
      }
   }

   public void bF() {
      if (this.r != null) {
         bow $$0 = this.r;
         this.r = null;
         $$0.q(this);
      }
   }

   public void ac() {
      this.bF();
   }

   protected void p(bow $$0) {
      if ($$0.cZ() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.q.isEmpty()) {
            this.q = ImmutableList.of($$0);
         } else {
            List<bow> $$1 = Lists.newArrayList(this.q);
            if (!this.dM().B && $$0 instanceof cis && !(this.cQ() instanceof cis)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.q = ImmutableList.copyOf($$1);
         }

         this.a(drn.s, $$0);
      }
   }

   protected void q(bow $$0) {
      if ($$0.cZ() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.q.size() == 1 && this.q.get(0) == $$0) {
            this.q = ImmutableList.of();
         } else {
            this.q = this.q.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(drn.q, $$0);
      }
   }

   protected boolean r(bow $$0) {
      return this.q.isEmpty();
   }

   protected boolean bG() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public double c_() {
      return this.dr();
   }

   public double d_() {
      return this.dt();
   }

   public double L_() {
      return this.dx();
   }

   public float M_() {
      return this.dE();
   }

   public float e_() {
      return this.dC();
   }

   public void a(float $$0, int $$1) {
      this.n($$0);
   }

   public float bH() {
      return 0.0F;
   }

   public epr bI() {
      return this.b(this.dE(), this.dC());
   }

   public epr a(cqf $$0) {
      if (!(this instanceof cis $$1)) {
         return epr.b;
      } else {
         boolean $$2 = $$1.eV().a($$0) && !$$1.eU().a($$0);
         bpi $$3 = $$2 ? $$1.fr().e() : $$1.fr();
         return this.b(0.0F, this.dC() + (float)($$3 == bpi.b ? 80 : -80)).a(0.5);
      }
   }

   public epq bJ() {
      return new epq(this.dE(), this.dC());
   }

   public epr bK() {
      return epr.a(this.bJ());
   }

   public void f(ib $$0) {
      if (this.aw()) {
         this.au();
      } else {
         if (!this.dM().B && !$$0.equals(this.ax)) {
            this.ax = $$0.i();
         }

         this.av = true;
      }
   }

   protected void bL() {
      if (this.dM() instanceof apf) {
         int $$0 = this.ax();
         apf $$1 = (apf)this.dM();
         if (this.av) {
            MinecraftServer $$2 = $$1.o();
            ajg<cwz> $$3 = this.dM().ad() == cwz.i ? cwz.h : cwz.i;
            apf $$4 = $$2.a($$3);
            if ($$4 != null && $$2.G() && !this.bO() && this.aw++ >= $$0) {
               this.dM().ae().a("portal");
               this.aw = $$0;
               this.au();
               this.b($$4);
               this.dM().ae().c();
            }

            this.av = false;
         } else {
            if (this.aw > 0) {
               this.aw -= 4;
            }

            if (this.aw < 0) {
               this.aw = 0;
            }
         }

         this.L();
      }
   }

   public int bM() {
      return 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
   }

   public void c(bnv $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            ddt.a(this);
      }
   }

   public void m(float $$0) {
   }

   public boolean bN() {
      boolean $$0 = this.dM() != null && this.dM().B;
      return !this.bb() && (this.aL > 0 || $$0 && this.j(0));
   }

   public boolean bO() {
      return this.cZ() != null;
   }

   public boolean bP() {
      return !this.q.isEmpty();
   }

   public boolean bQ() {
      return this.ai().a(auq.p);
   }

   public boolean bR() {
      return !this.ai().a(auq.q);
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
      return this.c(bpz.f);
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
      return this.c(bpz.d);
   }

   public boolean cb() {
      return this.ca() && !this.bc();
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
      return this.dM().x_() ? this.j(6) : this.bb;
   }

   public boolean ce() {
      return this.j(5);
   }

   public boolean d(cis $$0) {
      if ($$0.N_()) {
         return false;
      } else {
         eqx $$1 = this.cg();
         return $$1 != null && $$0 != null && $$0.cg() == $$1 && $$1.i() ? false : this.ce();
      }
   }

   public boolean cf() {
      return false;
   }

   public void a(BiConsumer<drk<?>, apf> $$0) {
   }

   @Nullable
   public eqq cg() {
      return this.dM().K().e(this.cy());
   }

   public boolean s(bow $$0) {
      return this.a($$0.cg());
   }

   public boolean a(eqx $$0) {
      return this.cg() != null ? this.cg().a($$0) : false;
   }

   public void j(boolean $$0) {
      this.b(5, $$0);
   }

   protected boolean j(int $$0) {
      return (this.an.a(ao) & 1 << $$0) != 0;
   }

   protected void b(int $$0, boolean $$1) {
      byte $$2 = this.an.a(ao);
      if ($$1) {
         this.an.a(ao, (byte)($$2 | 1 << $$0));
      } else {
         this.an.a(ao, (byte)($$2 & ~(1 << $$0)));
      }
   }

   public int ch() {
      return 300;
   }

   public int ci() {
      return this.an.a(aR);
   }

   public void k(int $$0) {
      this.an.a(aR, $$0);
   }

   public int cj() {
      return this.an.a(aW);
   }

   public void l(int $$0) {
      this.an.a(aW, $$0);
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

   public void a(apf $$0, bpn $$1) {
      this.i(this.aL + 1);
      if (this.aL == 0) {
         this.g(8);
      }

      this.a(this.dN().b(), 5.0F);
   }

   public void k(boolean $$0) {
      epr $$1 = this.dp();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void l(boolean $$0) {
      epr $$1 = this.dp();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(apf $$0, bpo $$1) {
      return true;
   }

   public void cn() {
      if (this.dp().b() > -0.5 && this.ab > 1.0F) {
         this.ab = 1.0F;
      }
   }

   public void n() {
      this.ab = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      ib $$3 = ib.a($$0, $$1, $$2);
      epr $$4 = new epr($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      ib.a $$5 = new ib.a();
      ih $$6 = ih.b;
      double $$7 = Double.MAX_VALUE;

      for (ih $$8 : new ih[]{ih.c, ih.d, ih.e, ih.f, ih.b}) {
         $$5.a($$3, $$8);
         if (!this.dM().a_($$5).r(this.dM(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == ih.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ag.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      epr $$13 = this.dp().a(0.75);
      if ($$6.o() == ih.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == ih.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == ih.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dmz $$0, epr $$1) {
      this.n();
      this.U = $$1;
   }

   private static vu c(vu $$0) {
      wi $$1 = $$0.e().b($$0.a().a(null));

      for (vu $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public vu ad() {
      vu $$0 = this.af();
      return $$0 != null ? c($$0) : this.co();
   }

   protected vu co() {
      return this.o.h();
   }

   public boolean t(bow $$0) {
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

   public boolean u(bow $$0) {
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
            this.p,
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
            this.p,
            $$0,
            this.dr(),
            this.dt(),
            this.dx()
         );
   }

   public boolean b(bnv $$0) {
      return this.dH() || this.ba && !$$0.a(aup.e) && !$$0.g() || $$0.a(aup.j) && this.bb() || $$0.a(aup.n) && this.ai().a(auq.o);
   }

   public boolean cr() {
      return this.ba;
   }

   public void m(boolean $$0) {
      this.ba = $$0;
   }

   public void v(bow $$0) {
      this.b($$0.dr(), $$0.dt(), $$0.dx(), $$0.dC(), $$0.dE());
   }

   public void w(bow $$0) {
      ta $$1 = $$0.f(new ta());
      $$1.r("Dimension");
      this.g($$1);
      this.aZ = $$0.aZ;
      this.ax = $$0.ax;
   }

   @Nullable
   public bow b(apf $$0) {
      if (this.dM() instanceof apf && !this.dH()) {
         this.dM().ae().a("changeDimension");
         this.ag();
         this.dM().ae().a("reposition");
         ejk $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dM().ae().b("reloading");
            bow $$2 = this.ai().a((cwz)$$0);
            if ($$2 != null) {
               $$2.w(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dE());
               $$2.g($$1.b);
               $$0.d($$2);
               if ($$0.ad() == cwz.j) {
                  apf.a($$0);
               }
            }

            this.cs();
            this.dM().ae().c();
            ((apf)this.dM()).h();
            $$0.h();
            this.dM().ae().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void cs() {
      this.b(bow.c.e);
   }

   @Nullable
   protected ejk a(apf $$0) {
      boolean $$1 = this.dM().ad() == cwz.j && $$0.ad() == cwz.h;
      boolean $$2 = $$0.ad() == cwz.j;
      if (!$$1 && !$$2) {
         boolean $$6 = $$0.ad() == cwz.i;
         if (this.dM().ad() != cwz.i && !$$6) {
            return null;
         } else {
            doq $$7 = $$0.C_();
            double $$8 = dqm.a(this.dM().D_(), $$0.D_());
            ib $$9 = $$7.b(this.dr() * $$8, this.dt(), this.dx() * $$8);
            return this.a($$0, $$9, $$6, $$7).map($$1x -> {
               dmz $$2x = this.dM().a_(this.ax);
               ih.a $$3;
               epr $$5;
               if ($$2x.b(dnp.H)) {
                  $$3 = $$2x.c(dnp.H);
                  l.a $$4 = l.a(this.ax, $$3, 21, ih.a.b, 21, $$1xx -> this.dM().a_($$1xx) == $$2x);
                  $$5 = this.a($$3, $$4);
               } else {
                  $$3 = ih.a.a;
                  $$5 = new epr(0.5, 0.0, 0.0);
               }

               return ejl.a($$0, $$1x, $$3, $$5, this, this.dp(), this.dC(), this.dE());
            }).orElse(null);
         }
      } else {
         ib $$3 = $$2 ? apf.a : $$0.T();
         $$0.l().a(apk.f, new cwg($$3), 3, $$3);
         int $$4;
         if ($$2) {
            $$4 = $$3.v();
         } else {
            $$4 = $$0.m($$3).a(dsm.a.f, $$3.u(), $$3.w()) + 1;
         }

         return new ejk(new epr((double)$$3.u() + 0.5, (double)$$4, (double)$$3.w() + 0.5), this.dp(), this.dC(), this.dE());
      }
   }

   protected epr a(ih.a $$0, l.a $$1) {
      return ejl.a($$1, $$0, this.dk(), this.a(this.ap()));
   }

   protected Optional<l.a> a(apf $$0, ib $$1, boolean $$2, doq $$3) {
      return $$0.p().a($$1, $$2, $$3);
   }

   public boolean ct() {
      return !this.bO() && !this.bP();
   }

   public float a(cwr $$0, cwf $$1, ib $$2, dmz $$3, ein $$4, float $$5) {
      return $$5;
   }

   public boolean a(cwr $$0, cwf $$1, ib $$2, dmz $$3, float $$4) {
      return true;
   }

   public int cu() {
      return 3;
   }

   public boolean q_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bpc.a(this.ai()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.p);
      $$0.a("Entity Name", () -> this.ad().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dr(), this.dt(), this.dx()));
      $$0.a("Entity's Block location", p.a(this.dM(), aww.a(this.dr()), aww.a(this.dt()), aww.a(this.dx())));
      epr $$1 = this.dp();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", () -> this.cP().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.cZ()));
   }

   public boolean cv() {
      return this.bN() && !this.N_();
   }

   public void a_(UUID $$0) {
      this.ay = $$0;
      this.az = this.ay.toString();
   }

   @Override
   public UUID cw() {
      return this.ay;
   }

   public String cx() {
      return this.az;
   }

   @Override
   public String cy() {
      return this.az;
   }

   public boolean cz() {
      return true;
   }

   public static double cA() {
      return n;
   }

   public static void b(double $$0) {
      n = $$0;
   }

   @Override
   public vu O_() {
      return eqq.a(this.cg(), this.ad()).a($$0 -> $$0.a(this.cG()).a(this.cx()));
   }

   public void b(@Nullable vu $$0) {
      this.an.a(aS, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public vu af() {
      return this.an.a(aS).orElse(null);
   }

   @Override
   public boolean ae() {
      return this.an.a(aS).isPresent();
   }

   public void n(boolean $$0) {
      this.an.a(aT, $$0);
   }

   public boolean cB() {
      return this.an.a(aT);
   }

   public final void n(double $$0, double $$1, double $$2) {
      if (this.dM() instanceof apf) {
         cwg $$3 = new cwg(ib.a($$0, $$1, $$2));
         ((apf)this.dM()).l().a(apk.g, $$3, 0, this.aj());
         this.dM().d($$3.e, $$3.f);
         this.c($$0, $$1, $$2);
      }
   }

   public boolean a(apf $$0, double $$1, double $$2, double $$3, Set<bqb> $$4, float $$5, float $$6) {
      float $$7 = aww.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dM()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.A();
         this.n($$5);
      } else {
         this.ag();
         bow $$8 = this.ai().a((cwz)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(bow.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dM() instanceof apf) {
         this.b($$0, $$1, $$2, this.dC(), this.dE());
         this.A();
      }
   }

   private void A() {
      this.cR().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.q.iterator();

         while (var1.hasNext()) {
            bow $$1 = (bow)var1.next();
            $$0.a($$1, bow::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.dr() + $$0, this.dt() + $$1, this.dx() + $$2);
   }

   public boolean cC() {
      return this.cB();
   }

   @Override
   public void a(List<aiq.c<?>> $$0) {
   }

   @Override
   public void a(aim<?> $$0) {
      if (as.equals($$0)) {
         this.j_();
      }
   }

   @Deprecated
   protected void cD() {
      bpz $$0 = this.ap();
      boz $$1 = this.a($$0);
      this.bf = $$1;
      this.bg = $$1.c();
   }

   public void j_() {
      boz $$0 = this.bf;
      bpz $$1 = this.ap();
      boz $$2 = this.a($$1);
      this.bf = $$2;
      this.bg = $$2.c();
      this.ar();
      boolean $$3 = (double)$$2.a() <= 4.0 && (double)$$2.b() <= 4.0;
      if (!this.dM().B && !this.am && !this.af && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cis)) {
         epr $$4 = this.dk().b(0.0, (double)$$0.b() / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a() - $$0.a()) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b() - $$0.b()) + 1.0E-6;
         eqk $$7 = eqh.a(epm.a($$4, $$5, $$6, $$5));
         this.dM().a(this, $$7, $$4, (double)$$2.a(), (double)$$2.b(), (double)$$2.a()).ifPresent($$1x -> this.b($$1x.b(0.0, (double)(-$$2.b()) / 2.0, 0.0)));
      }
   }

   public ih cE() {
      return ih.a((double)this.dC());
   }

   public ih cF() {
      return this.cE();
   }

   protected wa cG() {
      return new wa(wa.a.c, new wa.b(this.ai(), this.cw(), this.ad()));
   }

   public boolean a(apg $$0) {
      return true;
   }

   @Override
   public final epm cH() {
      return this.aH;
   }

   public epm h_() {
      return this.cH();
   }

   public final void a(epm $$0) {
      this.aH = $$0;
   }

   public final float d(bpz $$0) {
      return this.a($$0).c();
   }

   public final float cI() {
      return this.bg;
   }

   public epr p(float $$0) {
      return this.cJ();
   }

   protected epr cJ() {
      return new epr(0.0, (double)this.cI(), (double)(this.dg() * 0.4F));
   }

   public bqf a_(int $$0) {
      return bqf.b;
   }

   @Override
   public void a(vu $$0) {
   }

   public cwz cK() {
      return this.dM();
   }

   @Nullable
   public MinecraftServer cL() {
      return this.dM().o();
   }

   public bnc a(cis $$0, epr $$1, bnb $$2) {
      return bnc.d;
   }

   public boolean a(cwr $$0) {
      return false;
   }

   public void a(bpo $$0, bow $$1) {
      if ($$1 instanceof bpo) {
         cuv.a((bpo)$$1, $$0);
      }

      cuv.b($$0, $$1);
   }

   public void c(apg $$0) {
   }

   public void d(apg $$0) {
   }

   public float a(dgm $$0) {
      float $$1 = aww.g(this.dC());
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

   public float a(dew $$0) {
      float $$1 = aww.g(this.dC());
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

   public cjl a(cjk $$0) {
      return this.ai().a(auq.r) ? cjl.b : cjl.a;
   }

   @Nullable
   public bpo cN() {
      return null;
   }

   public final boolean cO() {
      return this.cN() != null;
   }

   public final List<bow> cP() {
      return this.q;
   }

   @Nullable
   public bow cQ() {
      return this.q.isEmpty() ? null : (bow)this.q.get(0);
   }

   public boolean x(bow $$0) {
      return this.q.contains($$0);
   }

   public boolean a(Predicate<bow> $$0) {
      UnmodifiableIterator var2 = this.q.iterator();

      while (var2.hasNext()) {
         bow $$1 = (bow)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bow> G() {
      return this.q.stream().flatMap(bow::cR);
   }

   @Override
   public Stream<bow> cR() {
      return Stream.concat(Stream.of(this), this.G());
   }

   @Override
   public Stream<bow> cS() {
      return Stream.concat(this.q.stream().flatMap(bow::cS), Stream.of(this));
   }

   public Iterable<bow> cT() {
      return () -> this.G().iterator();
   }

   public int cU() {
      return (int)this.G().filter($$0 -> $$0 instanceof cis).count();
   }

   public boolean cV() {
      return this.cU() == 1;
   }

   public bow cW() {
      bow $$0 = this;

      while ($$0.bO()) {
         $$0 = $$0.cZ();
      }

      return $$0;
   }

   public boolean y(bow $$0) {
      return this.cW() == $$0.cW();
   }

   public boolean z(bow $$0) {
      if (!$$0.bO()) {
         return false;
      } else {
         bow $$1 = $$0.cZ();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean cX() {
      return this.cN() instanceof cis $$0 ? $$0.g() : this.cY();
   }

   public boolean cY() {
      return !this.dM().B;
   }

   protected static epr a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -aww.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = aww.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new epr((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public epr b(bpo $$0) {
      return new epr(this.dr(), this.cH().e, this.dx());
   }

   @Nullable
   public bow cZ() {
      return this.r;
   }

   @Nullable
   public bow da() {
      return this.r != null && this.r.cN() == this ? this.r : null;
   }

   public eis r_() {
      return eis.a;
   }

   public atz db() {
      return atz.g;
   }

   protected int dc() {
      return 1;
   }

   public du dd() {
      return new du(
         this, this.dk(), this.bJ(), this.dM() instanceof apf ? (apf)this.dM() : null, this.F(), this.ad().getString(), this.O_(), this.dM().o(), this
      );
   }

   protected int F() {
      return 0;
   }

   public boolean m(int $$0) {
      return this.F() >= $$0;
   }

   @Override
   public boolean k_() {
      return this.dM().Z().b(cwv.p);
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public boolean U_() {
      return true;
   }

   public void a(eg.a $$0, epr $$1) {
      epr $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.s(aww.g((float)(-(aww.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.r(aww.g((float)(aww.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dC());
      this.O = this.dE();
      this.N = this.dC();
   }

   public boolean a(avd<eim> $$0, double $$1) {
      if (this.de()) {
         return false;
      } else {
         epm $$2 = this.cH().h(0.001);
         int $$3 = aww.a($$2.a);
         int $$4 = aww.c($$2.d);
         int $$5 = aww.a($$2.b);
         int $$6 = aww.c($$2.e);
         int $$7 = aww.a($$2.c);
         int $$8 = aww.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cz();
         boolean $$11 = false;
         epr $$12 = epr.b;
         int $$13 = 0;
         ib.a $$14 = new ib.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  ein $$18 = this.dM().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((cwf)this.dM(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           epr $$20 = $$18.c(this.dM(), $$14);
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

            if (!(this instanceof cis)) {
               $$12 = $$12.d();
            }

            epr $$21 = this.dp();
            $$12 = $$12.a($$1 * 1.0);
            double $$22 = 0.003;
            if (Math.abs($$21.c) < 0.003 && Math.abs($$21.e) < 0.003 && $$12.f() < 0.0045000000000000005) {
               $$12 = $$12.d().a(0.0045000000000000005);
            }

            this.g(this.dp().e($$12));
         }

         this.aj.put($$0, $$9);
         return $$11;
      }
   }

   public boolean de() {
      epm $$0 = this.cH().g(1.0);
      int $$1 = aww.a($$0.a);
      int $$2 = aww.c($$0.d);
      int $$3 = aww.a($$0.c);
      int $$4 = aww.c($$0.f);
      return !this.dM().b($$1, $$3, $$2, $$4);
   }

   public double b(avd<eim> $$0) {
      return this.aj.getDouble($$0);
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

   public yb<aam> di() {
      return new aan(this);
   }

   public boz a(bpz $$0) {
      return this.o.n();
   }

   public final boy dj() {
      return this.bf.d();
   }

   public epr dk() {
      return this.t;
   }

   public epr dl() {
      return this.dk();
   }

   @Override
   public ib dm() {
      return this.u;
   }

   public dmz dn() {
      if (this.bl == null) {
         this.bl = this.dM().a_(this.dm());
      }

      return this.bl;
   }

   public cwg do() {
      return this.v;
   }

   public epr dp() {
      return this.aE;
   }

   public void g(epr $$0) {
      this.aE = $$0;
   }

   public void h(epr $$0) {
      this.g(this.dp().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.g(new epr($$0, $$1, $$2));
   }

   public final int dq() {
      return this.u.u();
   }

   public final double dr() {
      return this.t.c;
   }

   public double c(double $$0) {
      return this.t.c + (double)this.dg() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ag.j() - 1.0) * $$0);
   }

   public final int ds() {
      return this.u.v();
   }

   public final double dt() {
      return this.t.d;
   }

   public double e(double $$0) {
      return this.t.d + (double)this.dh() * $$0;
   }

   public double du() {
      return this.e(this.ag.j());
   }

   public double dv() {
      return this.t.d + (double)this.bg;
   }

   public final int dw() {
      return this.u.w();
   }

   public final double dx() {
      return this.t.e;
   }

   public double f(double $$0) {
      return this.t.e + (double)this.dg() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ag.j() - 1.0) * $$0);
   }

   public final void p(double $$0, double $$1, double $$2) {
      if (this.t.c != $$0 || this.t.d != $$1 || this.t.e != $$2) {
         this.t = new epr($$0, $$1, $$2);
         int $$3 = aww.a($$0);
         int $$4 = aww.a($$1);
         int $$5 = aww.a($$2);
         if ($$3 != this.u.u() || $$4 != this.u.v() || $$5 != this.u.w()) {
            this.u = new ib($$3, $$4, $$5);
            this.bl = null;
            if (je.a($$3) != this.v.e || je.a($$5) != this.v.f) {
               this.v = new cwg(this.u);
            }
         }

         this.aX.a();
      }
   }

   public void dy() {
   }

   public epr q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bg * 0.7, 0.0);
   }

   public void a(aan $$0) {
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
   public cqk dz() {
      return null;
   }

   public void o(boolean $$0) {
      this.aA = $$0;
   }

   public boolean dA() {
      return !this.ai().a(auq.k);
   }

   public boolean dB() {
      return (this.aA || this.aB) && this.dA();
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

   public void a(@Nullable bow $$0) {
   }

   public final boolean dH() {
      return this.aJ != null;
   }

   @Nullable
   public bow.c dI() {
      return this.aJ;
   }

   @Override
   public final void b(bow.c $$0) {
      if (this.aJ == null) {
         this.aJ = $$0;
      }

      if (this.aJ.a()) {
         this.ac();
      }

      this.cP().forEach(bow::ac);
      this.aX.a($$0);
   }

   protected void dJ() {
      this.aJ = null;
   }

   @Override
   public void a(dqv $$0) {
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

   public boolean a(cwz $$0, ib $$1) {
      return true;
   }

   public cwz dM() {
      return this.s;
   }

   protected void a(cwz $$0) {
      this.s = $$0;
   }

   public bnw dN() {
      return this.dM().ah();
   }

   public iz dO() {
      return this.dM().H_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = aww.d($$6, this.dr(), $$1);
      double $$8 = aww.d($$6, this.dt(), $$2);
      double $$9 = aww.d($$6, this.dx(), $$3);
      float $$10 = (float)aww.e($$6, (double)this.dC(), $$4);
      float $$11 = (float)aww.d($$6, (double)this.dE(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   @FunctionalInterface
   public interface a {
      void accept(bow var1, double var2, double var4, double var6);
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
