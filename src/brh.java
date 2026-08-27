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

public abstract class brh implements ajp, bpr, duh, ec, eus {
   private static final Logger b = LogUtils.getLogger();
   public static final String w = "id";
   public static final String x = "Passengers";
   private static final AtomicInteger c = new AtomicInteger();
   public static final int y = 0;
   public static final int z = 60;
   public static final int A = 300;
   public static final int B = 1024;
   public static final float C = 0.2F;
   public static final double D = 0.500001;
   public static final double E = 0.999999;
   public static final int F = 140;
   public static final int G = 40;
   public static final int H = 3;
   private static final etk d = new etk(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double e = 0.014;
   private static final double k = 0.007;
   private static final double l = 0.0023333333333333335;
   public static final String I = "UUID";
   private static double m = 1.0;
   private final brn<?> n;
   private int o = c.incrementAndGet();
   public boolean J;
   private ImmutableList<brh> p = ImmutableList.of();
   protected int K;
   @Nullable
   private brh q;
   private dad r;
   public double L;
   public double M;
   public double N;
   private etp s;
   private in t;
   private czk u;
   private etp v = etp.b;
   private float aF;
   private float aG;
   public float O;
   public float P;
   private etk aH = d;
   private boolean aI;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   public boolean U;
   protected etp V = etp.b;
   @Nullable
   private brh.c aJ;
   public static final float W = 0.6F;
   public static final float X = 1.8F;
   public float Y;
   public float Z;
   public float aa;
   public float ab;
   public float ac;
   private float aK = 1.0F;
   public double ad;
   public double ae;
   public double af;
   public boolean ag;
   protected final ayg ah = ayg.a();
   public int ai;
   private int aL = -this.dd();
   protected boolean aj;
   protected Object2DoubleMap<awg<elz>> ak = new Object2DoubleArrayMap(2);
   protected boolean al;
   private final Set<awg<elz>> aM = new HashSet<>();
   public int am;
   protected boolean an = true;
   protected final ajq ao;
   protected static final ajm<Byte> ap = ajq.a(brh.class, ajo.a);
   protected static final int aq = 0;
   private static final int aN = 1;
   private static final int aO = 3;
   private static final int aP = 4;
   private static final int aQ = 5;
   protected static final int ar = 6;
   protected static final int as = 7;
   private static final ajm<Integer> aR = ajq.a(brh.class, ajo.b);
   private static final ajm<Optional<wu>> aS = ajq.a(brh.class, ajo.g);
   private static final ajm<Boolean> aT = ajq.a(brh.class, ajo.k);
   private static final ajm<Boolean> aU = ajq.a(brh.class, ajo.k);
   private static final ajm<Boolean> aV = ajq.a(brh.class, ajo.k);
   protected static final ajm<bsl> at = ajq.a(brh.class, ajo.w);
   private static final ajm<Integer> aW = ajq.a(brh.class, ajo.b);
   private dui aX = dui.a;
   private final ahw aY = new ahw();
   public boolean au;
   public boolean av;
   private int aZ;
   protected boolean aw;
   protected int ax;
   protected in ay;
   private boolean ba;
   protected UUID az = axz.a(this.ah);
   protected String aA = this.az.toString();
   private boolean bb;
   private final Set<String> bc = Sets.newHashSet();
   private final double[] bd = new double[]{0.0, 0.0, 0.0};
   private long be;
   private brk bf;
   private float bg;
   public boolean aB;
   public boolean aC;
   public boolean aD;
   public Optional<in> aE = Optional.empty();
   private boolean bh = false;
   private float bi;
   private int bj;
   private boolean bk;
   @Nullable
   private dqh bl = null;

   public brh(brn<?> $$0, dad $$1) {
      this.n = $$0;
      this.r = $$1;
      this.bf = $$0.n();
      this.s = etp.b;
      this.t = in.c;
      this.u = czk.b;
      ajq.a $$2 = new ajq.a(this);
      $$2.a(ap, (byte)0);
      $$2.a(aR, this.ci());
      $$2.a(aT, false);
      $$2.a(aS, Optional.empty());
      $$2.a(aU, false);
      $$2.a(aV, false);
      $$2.a(at, bsl.a);
      $$2.a(aW, 0);
      this.a($$2);
      this.ao = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.bg = this.bf.c();
   }

   public boolean a(in $$0, dqh $$1) {
      eui $$2 = $$1.b(this.dN(), $$0, etu.a(this));
      eui $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return euf.c($$3, euf.a(this.cI()), ett.i);
   }

   public int i_() {
      euv $$0 = this.ch();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean N_() {
      return false;
   }

   public final void ag() {
      if (this.bQ()) {
         this.bF();
      }

      if (this.bP()) {
         this.ac();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.aY.e(new etp($$0, $$1, $$2));
   }

   public ahw ah() {
      return this.aY;
   }

   public brn<?> ai() {
      return this.n;
   }

   @Override
   public int aj() {
      return this.o;
   }

   public void e(int $$0) {
      this.o = $$0;
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
      this.a(brh.c.a);
      this.a(dva.p);
   }

   public final void am() {
      this.a(brh.c.b);
   }

   protected abstract void a(ajq.a var1);

   public ajq an() {
      return this.ao;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof brh ? ((brh)$$0).o == this.o : false;
   }

   @Override
   public int hashCode() {
      return this.o;
   }

   public void a(brh.c $$0) {
      this.b($$0);
   }

   public void ao() {
   }

   public void b(bsl $$0) {
      this.ao.a(at, $$0);
   }

   public bsl ap() {
      return this.ao.a(at);
   }

   public boolean c(bsl $$0) {
      return this.ap() == $$0;
   }

   public boolean a(brh $$0, double $$1) {
      return this.dl().a((jg)$$0.dl(), $$1);
   }

   public boolean a(brh $$0, double $$1, double $$2) {
      double $$3 = $$0.ds() - this.ds();
      double $$4 = $$0.du() - this.du();
      double $$5 = $$0.dy() - this.dy();
      return axz.e($$3, $$5) < axz.k($$1) && axz.k($$4) < axz.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.r($$0 % 360.0F);
      this.s($$1 % 360.0F);
   }

   public final void b(etp $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.aq());
   }

   protected etk aq() {
      return this.bf.a(this.s);
   }

   protected void ar() {
      this.a_(this.s.c, this.s.d, this.s.e);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.s(this.dF() + $$2);
      this.r(this.dD() + $$3);
      this.s(axz.a(this.dF(), -90.0F, 90.0F));
      this.P += $$2;
      this.O += $$3;
      this.P = axz.a(this.P, -90.0F, 90.0F);
      if (this.q != null) {
         this.q.k(this);
      }
   }

   public void l() {
      this.as();
   }

   public void as() {
      this.dN().af().a("entityBaseTick");
      this.bl = null;
      if (this.bP() && this.da().dI()) {
         this.ac();
      }

      if (this.K > 0) {
         this.K--;
      }

      this.Y = this.Z;
      this.P = this.dF();
      this.O = this.dD();
      this.bM();
      if (this.bo()) {
         this.bp();
      }

      this.aC = this.aB;
      this.aB = false;
      this.bj();
      this.x();
      this.bi();
      if (this.dN().B) {
         this.aA();
      } else if (this.aL > 0) {
         if (this.bb()) {
            this.i(this.aL - 4);
            if (this.aL < 0) {
               this.aA();
            }
         } else {
            if (this.aL % 20 == 0 && !this.bq()) {
               this.a(this.dO().c(), 1.0F);
            }

            this.i(this.aL - 1);
         }

         if (this.ck() > 0) {
            this.l(0);
            this.dN().a(null, 1009, this.t, 1);
         }
      }

      if (this.bq()) {
         this.ay();
         this.ac *= 0.5F;
      }

      this.at();
      if (!this.dN().B) {
         this.c(this.aL > 0);
      }

      this.an = false;
      this.dN().af().c();
   }

   public void c(boolean $$0) {
      this.b(0, $$0 || this.bk);
   }

   public void at() {
      if (this.du() < (double)(this.dN().I_() - 64)) {
         this.aB();
      }
   }

   public void au() {
      this.aZ = this.bN();
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
         if (this.a(this.dO().d(), 4.0F)) {
            this.a(avc.jV, 0.4F, 2.0F + this.ah.i() * 0.4F);
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
      return this.b(this.cI().d($$0, $$1, $$2));
   }

   private boolean b(etk $$0) {
      return this.dN().a(this, $$0) && !this.dN().d($$0);
   }

   public void d(boolean $$0) {
      this.aI = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, etp $$1) {
      this.aI = $$0;
      this.b($$0, $$1);
   }

   public boolean d(in $$0) {
      return this.aE.isPresent() && this.aE.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable etp $$1) {
      if ($$0) {
         etk $$2 = this.cI();
         etk $$3 = new etk($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<in> $$4 = this.r.g(this, $$3);
         if ($$4.isPresent() || this.bh) {
            this.aE = $$4;
         } else if ($$1 != null) {
            etk $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
            $$4 = this.r.g(this, $$5);
            this.aE = $$4;
         }

         this.bh = $$4.isEmpty();
      } else {
         this.bh = false;
         if (this.aE.isPresent()) {
            this.aE = Optional.empty();
         }
      }
   }

   public boolean aC() {
      return this.aI;
   }

   public void a(bsf $$0, etp $$1) {
      if (this.ag) {
         this.a_(this.ds() + $$1.c, this.du() + $$1.d, this.dy() + $$1.e);
      } else {
         this.aD = this.bO();
         if ($$0 == bsf.c) {
            $$1 = this.d($$1);
            if ($$1.equals(etp.b)) {
               return;
            }
         }

         this.dN().af().a("move");
         if (this.V.g() > 1.0E-7) {
            $$1 = $$1.h(this.V);
            this.V = etp.b;
            this.g(etp.b);
         }

         $$1 = this.a($$1, $$0);
         etp $$2 = this.a($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ac != 0.0F && $$3 >= 1.0) {
               etl $$4 = this.dN().a(new czm(this.dl(), this.dl().e($$2), czm.a.d, czm.b.d, this));
               if ($$4.c() != etn.a.a) {
                  this.n();
               }
            }

            this.a_(this.ds() + $$2.c, this.du() + $$2.d, this.dy() + $$2.e);
         }

         this.dN().af().c();
         this.dN().af().a("rest");
         boolean $$5 = !axz.b($$1.c, $$2.c);
         boolean $$6 = !axz.b($$1.e, $$2.e);
         this.Q = $$5 || $$6;
         this.R = $$1.d != $$2.d;
         this.S = this.R && $$1.d < 0.0;
         if (this.Q) {
            this.T = this.c($$2);
         } else {
            this.T = false;
         }

         this.a(this.S, $$2);
         in $$7 = this.aH();
         dqh $$8 = this.dN().a_($$7);
         this.a($$2.d, this.aC(), $$8, $$7);
         if (this.dI()) {
            this.dN().af().c();
         } else {
            if (this.Q) {
               etp $$9 = this.dq();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            dde $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dN(), this);
            }

            if (this.aC()) {
               $$10.a(this.dN(), $$7, $$8, this);
            }

            brh.b $$11 = this.aZ();
            if ($$11.a() && !this.bP()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.ab = this.ab + (float)($$2.f() * 0.6);
               in $$15 = this.aJ();
               dqh $$16 = this.dN().a_($$15);
               boolean $$17 = this.c($$16);
               if (!$$17) {
                  $$13 = 0.0;
               }

               this.Z = this.Z + (float)$$2.h() * 0.6F;
               this.aa = this.aa + (float)Math.sqrt($$12 * $$12 + $$13 * $$13 + $$14 * $$14) * 0.6F;
               if (this.aa > this.aK && !$$16.i()) {
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
                        this.a(dva.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aG();
               }
            }

            this.aD();
            float $$20 = this.aL();
            this.g(this.dq().d((double)$$20, 1.0, (double)$$20));
            if (this.dN().c(this.cI().h(1.0E-6)).noneMatch($$0x -> $$0x.a(avr.aK) || $$0x.a(ddg.H))) {
               if (this.aL <= 0) {
                  this.i(-this.dd());
               }

               if (this.aD && (this.aB || this.be())) {
                  this.aE();
               }
            }

            if (this.bO() && (this.aB || this.be())) {
               this.i(-this.dd());
            }

            this.dN().af().c();
         }
      }
   }

   private boolean c(dqh $$0) {
      return $$0.a(avr.aP) || $$0.a(ddg.qP);
   }

   private boolean a(in $$0, dqh $$1, boolean $$2, boolean $$3, etp $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aC() || $$5 || this.bY() && $$4.d == 0.0 || this.cg()) && !this.ca()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dN().a(dva.P, this.dl(), dva.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(etp $$0) {
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
      this.a(avc.ka, 0.7F, 1.6F + (this.ah.i() - this.ah.i()) * 0.4F);
   }

   public void aF() {
      if (!this.dN().B && this.aD) {
         this.aE();
      }

      this.aA();
   }

   protected void aG() {
      if (this.aT()) {
         this.aS();
         if (this.aZ().b()) {
            this.a(dva.x);
         }
      }
   }

   @Deprecated
   public in aH() {
      return this.d(0.2F);
   }

   protected in aI() {
      return this.d(0.500001F);
   }

   public in aJ() {
      return this.d(1.0E-5F);
   }

   protected in d(float $$0) {
      if (this.aE.isPresent()) {
         in $$1 = this.aE.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dqh $$2 = this.dN().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(avr.S)) && !$$2.a(avr.L) && !($$2.b() instanceof dgd) ? $$1.h(axz.a(this.s.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = axz.a(this.s.c);
         int $$4 = axz.a(this.s.d - (double)$$0);
         int $$5 = axz.a(this.s.e);
         return new in($$3, $$4, $$5);
      }
   }

   protected float aK() {
      float $$0 = this.dN().a_(this.dn()).b().j();
      float $$1 = this.dN().a_(this.aI()).b().j();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aL() {
      dqh $$0 = this.dN().a_(this.dn());
      float $$1 = $$0.b().i();
      if (!$$0.a(ddg.G) && !$$0.a(ddg.nd)) {
         return (double)$$1 == 1.0 ? this.dN().a_(this.aI()).b().i() : $$1;
      } else {
         return $$1;
      }
   }

   protected etp a(etp $$0, bsf $$1) {
      return $$0;
   }

   protected etp d(etp $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dN().Y();
         if ($$1 != this.be) {
            Arrays.fill(this.bd, 0.0);
            this.be = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(is.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? etp.b : new etp($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(is.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? etp.b : new etp(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(is.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? etp.b : new etp(0.0, 0.0, $$4);
         } else {
            return etp.b;
         }
      }
   }

   private double a(is.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = axz.a($$1 + this.bd[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bd[$$2];
      this.bd[$$2] = $$3;
      return $$1;
   }

   private etp a(etp $$0) {
      etk $$1 = this.cI();
      List<eui> $$2 = this.dN().c(this, $$1.b($$0));
      etp $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dN(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.aC() || $$5 && $$0.d < 0.0;
      if (this.dH() > 0.0F && $$7 && ($$4 || $$6)) {
         etp $$8 = a(this, new etp($$0.c, (double)this.dH(), $$0.e), $$1, this.dN(), $$2);
         etp $$9 = a(this, new etp(0.0, (double)this.dH(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dN(), $$2);
         if ($$9.d < (double)this.dH()) {
            etp $$10 = a(this, new etp($$0.c, 0.0, $$0.e), $$1.c($$9), this.dN(), $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new etp(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.dN(), $$2));
         }
      }

      return $$3;
   }

   public static etp a(@Nullable brh $$0, etp $$1, etk $$2, dad $$3, List<eui> $$4) {
      Builder<eui> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      dry $$6 = $$3.C_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.e($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static etp a(etp $$0, etk $$1, List<eui> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = euf.a(is.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = euf.a(is.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = euf.a(is.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = euf.a(is.a.c, $$1, $$2, $$5);
         }

         return new etp($$3, $$4, $$5);
      }
   }

   protected float aM() {
      return (float)((int)this.aa + 1);
   }

   protected avb aN() {
      return avc.ke;
   }

   protected avb aO() {
      return avc.kd;
   }

   protected avb aP() {
      return avc.kd;
   }

   protected void aQ() {
      etk $$0 = this.cI();
      in $$1 = in.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      in $$2 = in.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dN().a($$1, $$2)) {
         in.a $$3 = new in.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bB()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  dqh $$7 = this.dN().a_($$3);

                  try {
                     $$7.a(this.dN(), $$3, this);
                     this.a($$7);
                  } catch (Throwable var12) {
                     o $$9 = o.a(var12, "Colliding entity with block");
                     p $$10 = $$9.a("Block being collided with");
                     p.a($$10, this.dN(), $$3, $$7);
                     throw new y($$9);
                  }
               }
            }
         }
      }
   }

   protected void a(dqh $$0) {
   }

   public void a(iw<dva> $$0, @Nullable brh $$1) {
      this.dN().a($$1, $$0, this.s);
   }

   public void a(iw<dva> $$0) {
      this.a($$0, this);
   }

   private void c(in $$0, dqh $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.r();
      }
   }

   protected void aR() {
      brh $$0 = Objects.requireNonNullElse(this.cO(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      etp $$2 = $$0.dq();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected in e(in $$0) {
      in $$1 = $$0.c();
      dqh $$2 = this.dN().a_($$1);
      return !$$2.a(avr.bn) && !$$2.a(avr.bo) ? $$0 : $$1;
   }

   protected void a(dqh $$0, dqh $$1) {
      dkr $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dqh $$0) {
      dkr $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(in $$0, dqh $$1) {
      dkr $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dqh $$0) {
      return $$0.a(avr.bm) && this.ai >= this.bj + 20;
   }

   private void r() {
      this.bi = this.bi * (float)Math.pow(0.997, (double)(this.ai - this.bj));
      this.bi = Math.min(1.0F, this.bi + 0.07F);
      float $$0 = 0.5F + this.bi * this.ah.i() * 1.2F;
      float $$1 = 0.1F + this.bi * 1.2F;
      this.a(avc.E, $$1, $$0);
      this.bj = this.ai;
   }

   protected void e(float $$0) {
      this.a(this.aN(), $$0, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
   }

   protected void aS() {
   }

   protected boolean aT() {
      return false;
   }

   public void a(avb $$0, float $$1, float $$2) {
      if (!this.aU()) {
         this.dN().a(null, this.ds(), this.du(), this.dy(), $$0, this.dc(), $$1, $$2);
      }
   }

   public void a(avb $$0) {
      if (!this.aU()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean aU() {
      return this.ao.a(aU);
   }

   public void e(boolean $$0) {
      this.ao.a(aU, $$0);
   }

   public boolean aV() {
      return this.ao.a(aV);
   }

   public void f(boolean $$0) {
      this.ao.a(aV, $$0);
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
         this.g(this.dq().b(0.0, -$$0, 0.0));
      }
   }

   protected brh.b aZ() {
      return brh.b.d;
   }

   public boolean ba() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dqh $$2, in $$3) {
      if ($$1) {
         if (this.ac > 0.0F) {
            $$2.b().a(this.dN(), $$2, $$3, this, this.ac);
            this.dN().a(dva.A, this.s, dva.a.a(this, this.aE.<dqh>map($$0x -> this.dN().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ac -= (float)$$0;
      }
   }

   public boolean bb() {
      return this.ai().d();
   }

   public boolean a(float $$0, float $$1, bqf $$2) {
      if (this.n.a(avu.o)) {
         return false;
      } else {
         if (this.bQ()) {
            for (brh $$3 : this.cQ()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean bc() {
      return this.aj;
   }

   private boolean v() {
      in $$0 = this.dn();
      return this.dN().r($$0) || this.dN().r(in.a((double)$$0.u(), this.cI().e, (double)$$0.w()));
   }

   private boolean w() {
      return this.do().a(ddg.nd);
   }

   public boolean bd() {
      return this.bc() || this.v();
   }

   public boolean be() {
      return this.bc() || this.v() || this.w();
   }

   public boolean bf() {
      return this.bc() || this.w();
   }

   public boolean bg() {
      return this.bf() || this.bq();
   }

   public boolean bh() {
      return this.al && this.bc();
   }

   public void bi() {
      if (this.ca()) {
         this.i(this.bZ() && this.bc() && !this.bP());
      } else {
         this.i(this.bZ() && this.bh() && !this.bP() && this.dN().b_(this.t).a(avw.a));
      }
   }

   protected boolean bj() {
      this.ak.clear();
      this.bk();
      double $$0 = this.dN().D_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(avw.b, $$0);
      return this.bc() || $$1;
   }

   void bk() {
      if (this.da() instanceof cne $$0 && !$$0.bh()) {
         this.aj = false;
         return;
      }

      if (this.a(avw.a, 0.014)) {
         if (!this.aj && !this.an) {
            this.bl();
         }

         this.n();
         this.aj = true;
         this.aA();
      } else {
         this.aj = false;
      }
   }

   private void x() {
      this.al = this.a(avw.a);
      this.aM.clear();
      double $$0 = this.dw();
      if (this.da() instanceof cne $$2 && !$$2.bh() && $$2.cI().e >= $$0 && $$2.cI().b <= $$0) {
         return;
      }

      in $$3 = in.a(this.ds(), $$0, this.dy());
      ema $$4 = this.dN().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((czj)this.dN(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aM::add);
      }
   }

   protected void bl() {
      brh $$0 = Objects.requireNonNullElse(this.cO(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      etp $$2 = $$0.dq();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aO(), $$3, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
      } else {
         this.a(this.aP(), $$3, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
      }

      float $$4 = (float)axz.a(this.du());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bf.a() * 20.0F; $$5++) {
         double $$6 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         double $$7 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         this.dN().a(kx.d, this.ds() + $$6, (double)($$4 + 1.0F), this.dy() + $$7, $$2.c, $$2.d - this.ah.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bf.a() * 20.0F; $$8++) {
         double $$9 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         double $$10 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         this.dN().a(kx.aj, this.ds() + $$9, (double)($$4 + 1.0F), this.dy() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(dva.O);
   }

   @Deprecated
   protected dqh bm() {
      return this.dN().a_(this.aH());
   }

   public dqh bn() {
      return this.dN().a_(this.aJ());
   }

   public boolean bo() {
      return this.bZ() && !this.bc() && !this.N_() && !this.bY() && !this.bq() && this.bB();
   }

   protected void bp() {
      in $$0 = this.aH();
      dqh $$1 = this.dN().a_($$0);
      if ($$1.l() != djk.a) {
         etp $$2 = this.dq();
         in $$3 = this.dn();
         double $$4 = this.ds() + (this.ah.j() - 0.5) * (double)this.bf.a();
         double $$5 = this.dy() + (this.ah.j() - 0.5) * (double)this.bf.a();
         if ($$3.u() != $$0.u()) {
            $$4 = axz.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = axz.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dN().a(new ko(kx.b, $$1), $$4, this.du() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(awg<elz> $$0) {
      return this.aM.contains($$0);
   }

   public boolean bq() {
      return !this.an && this.ak.getDouble(avw.b) > 0.0;
   }

   public void a(float $$0, etp $$1) {
      etp $$2 = a($$1, $$0, this.dD());
      this.g(this.dq().e($$2));
   }

   private static etp a(etp $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return etp.b;
      } else {
         etp $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = axz.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = axz.b($$2 * (float) (Math.PI / 180.0));
         return new etp($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float br() {
      return this.dN().f(this.dr(), this.dx()) ? this.dN().x(in.a(this.ds(), this.dw(), this.dy())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.r($$3 % 360.0F);
      this.s(axz.a($$4, -90.0F, 90.0F) % 360.0F);
      this.O = this.dD();
      this.P = this.dF();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = axz.a($$0, -3.0E7, 3.0E7);
      double $$4 = axz.a($$2, -3.0E7, 3.0E7);
      this.L = $$3;
      this.M = $$1;
      this.N = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(etp $$0) {
      this.e($$0.c, $$0.d, $$0.e);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dD(), this.dF());
   }

   public void a(in $$0, float $$1, float $$2) {
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
      double $$0 = this.ds();
      double $$1 = this.du();
      double $$2 = this.dy();
      this.L = $$0;
      this.M = $$1;
      this.N = $$2;
      this.ad = $$0;
      this.ae = $$1;
      this.af = $$2;
      this.O = this.dD();
      this.P = this.dF();
   }

   public float f(brh $$0) {
      float $$1 = (float)(this.ds() - $$0.ds());
      float $$2 = (float)(this.du() - $$0.du());
      float $$3 = (float)(this.dy() - $$0.dy());
      return axz.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.ds() - $$0;
      double $$4 = this.du() - $$1;
      double $$5 = this.dy() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(brh $$0) {
      return this.f($$0.dl());
   }

   public double f(etp $$0) {
      double $$1 = this.ds() - $$0.c;
      double $$2 = this.du() - $$0.d;
      double $$3 = this.dy() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(clh $$0) {
   }

   public void h(brh $$0) {
      if (!this.y($$0)) {
         if (!$$0.ag && !this.ag) {
            double $$1 = $$0.ds() - this.ds();
            double $$2 = $$0.dy() - this.dy();
            double $$3 = axz.a($$1, $$2);
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
               if (!this.bQ() && this.by()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.bQ() && $$0.by()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void j(double $$0, double $$1, double $$2) {
      this.g(this.dq().b($$0, $$1, $$2));
      this.av = true;
   }

   protected void bt() {
      this.U = true;
   }

   public boolean a(bqf $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bt();
         return false;
      }
   }

   public final etp f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public is bu() {
      return is.a(this.f(1.0F));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dF() : axz.i($$0, this.P, this.dF());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dD() : axz.i($$0, this.O, this.dD());
   }

   public final etp b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = axz.b($$3);
      float $$5 = axz.a($$3);
      float $$6 = axz.b($$2);
      float $$7 = axz.a($$2);
      return new etp((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final etp i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final etp c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final etp bv() {
      return new etp(this.ds(), this.dw(), this.dy());
   }

   public final etp j(float $$0) {
      double $$1 = axz.d((double)$$0, this.L, this.ds());
      double $$2 = axz.d((double)$$0, this.M, this.du()) + (double)this.cJ();
      double $$3 = axz.d((double)$$0, this.N, this.dy());
      return new etp($$1, $$2, $$3);
   }

   public etp k(float $$0) {
      return this.j($$0);
   }

   public final etp l(float $$0) {
      double $$1 = axz.d((double)$$0, this.L, this.ds());
      double $$2 = axz.d((double)$$0, this.M, this.du());
      double $$3 = axz.d((double)$$0, this.N, this.dy());
      return new etp($$1, $$2, $$3);
   }

   public etn a(double $$0, float $$1, boolean $$2) {
      etp $$3 = this.j($$1);
      etp $$4 = this.f($$1);
      etp $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dN().a(new czm($$3, $$5, czm.a.b, $$2 ? czm.b.c : czm.b.a, this));
   }

   public boolean bw() {
      return this.bB() && this.bx();
   }

   public boolean bx() {
      return false;
   }

   public boolean by() {
      return false;
   }

   public void a(brh $$0, int $$1, bqf $$2) {
      if ($$0 instanceof aqi) {
         am.d.a((aqi)$$0, this, $$2);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.ds() - $$0;
      double $$4 = this.du() - $$1;
      double $$5 = this.dy() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cI().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * m;
      return $$0 < $$1 * $$1;
   }

   public boolean d(ua $$0) {
      if (this.aJ != null && !this.aJ.b()) {
         return false;
      } else {
         String $$1 = this.bA();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.f($$0);
            return true;
         }
      }
   }

   public boolean e(ua $$0) {
      return this.bP() ? false : this.d($$0);
   }

   public ua f(ua $$0) {
      try {
         if (this.q != null) {
            $$0.a("Pos", this.a(this.q.ds(), this.du(), this.q.dy()));
         } else {
            $$0.a("Pos", this.a(this.ds(), this.du(), this.dy()));
         }

         etp $$1 = this.dq();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dD(), this.dF()));
         $$0.a("FallDistance", this.ac);
         $$0.a("Fire", (short)this.aL);
         $$0.a("Air", (short)this.cj());
         $$0.a("OnGround", this.aC());
         $$0.a("Invulnerable", this.ba);
         $$0.a("PortalCooldown", this.aZ);
         $$0.a("UUID", this.cx());
         wu $$2 = this.af();
         if ($$2 != null) {
            $$0.a("CustomName", wu.a.a($$2, this.dP()));
         }

         if (this.cC()) {
            $$0.a("CustomNameVisible", this.cC());
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

         int $$3 = this.ck();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.ck());
         }

         if (this.bk) {
            $$0.a("HasVisualFire", this.bk);
         }

         if (!this.bc.isEmpty()) {
            ug $$4 = new ug();

            for (String $$5 : this.bc) {
               $$4.add(uv.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bQ()) {
            ug $$6 = new ug();

            for (brh $$7 : this.cQ()) {
               ua $$8 = new ua();
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

   public void g(ua $$0) {
      try {
         ug $$1 = $$0.c("Pos", 6);
         ug $$2 = $$0.c("Motion", 6);
         ug $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(axz.a($$1.h(0), -3.0000512E7, 3.0000512E7), axz.a($$1.h(1), -2.0E7, 2.0E7), axz.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.r($$3.i(0));
         this.s($$3.i(1));
         this.bs();
         this.n(this.dD());
         this.o(this.dD());
         this.ac = $$0.j("FallDistance");
         this.aL = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.k($$0.g("Air"));
         }

         this.aI = $$0.q("OnGround");
         this.ba = $$0.q("Invulnerable");
         this.aZ = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.az = $$0.a("UUID");
            this.aA = this.az.toString();
         }

         if (!Double.isFinite(this.ds()) || !Double.isFinite(this.du()) || !Double.isFinite(this.dy())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dD()) && Double.isFinite((double)this.dF())) {
            this.ar();
            this.a(this.dD(), this.dF());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(wu.a.a($$8, this.dP()));
               } catch (Exception var16) {
                  b.warn("Failed to parse entity custom name {}", $$8, var16);
               }
            }

            this.o($$0.q("CustomNameVisible"));
            this.e($$0.q("Silent"));
            this.f($$0.q("NoGravity"));
            this.j($$0.q("Glowing"));
            this.l($$0.h("TicksFrozen"));
            this.bk = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.bc.clear();
               ug $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.bc.add($$10.j($$12));
               }
            }

            this.a($$0);
            if (this.bz()) {
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

   protected boolean bz() {
      return true;
   }

   @Nullable
   protected final String bA() {
      brn<?> $$0 = this.ai();
      akh $$1 = brn.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(ua var1);

   protected abstract void b(ua var1);

   protected ug a(double... $$0) {
      ug $$1 = new ug();

      for (double $$2 : $$0) {
         $$1.add(ub.a($$2));
      }

      return $$1;
   }

   protected ug a(float... $$0) {
      ug $$1 = new ug();

      for (float $$2 : $$0) {
         $$1.add(ud.a($$2));
      }

      return $$1;
   }

   @Nullable
   public chr a(dac $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public chr a(dac $$0, int $$1) {
      return this.a(new csz($$0), (float)$$1);
   }

   @Nullable
   public chr b(csz $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public chr a(csz $$0, float $$1) {
      if ($$0.d()) {
         return null;
      } else if (this.dN().B) {
         return null;
      } else {
         chr $$2 = new chr(this.dN(), this.ds(), this.du() + (double)$$1, this.dy(), $$0);
         $$2.v();
         this.dN().b($$2);
         return $$2;
      }
   }

   public boolean bB() {
      return !this.dI();
   }

   public boolean bC() {
      if (this.ag) {
         return false;
      } else {
         float $$0 = this.bf.a() * 0.8F;
         etk $$1 = etk.a(this.bv(), (double)$$0, 1.0E-6, (double)$$0);
         return in.a($$1)
            .anyMatch(
               $$1x -> {
                  dqh $$2 = this.dN().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dN(), $$1x)
                     && euf.c($$2.k(this.dN(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), euf.a($$1), ett.i);
               }
            );
      }
   }

   public bpm a(clh $$0, bpl $$1) {
      return bpm.d;
   }

   public boolean i(brh $$0) {
      return $$0.bD() && !this.y($$0);
   }

   public boolean bD() {
      return false;
   }

   public void t() {
      this.g(etp.b);
      this.l();
      if (this.bP()) {
         this.da().j(this);
      }
   }

   public final void j(brh $$0) {
      if (this.x($$0)) {
         this.a($$0, brh::a_);
      }
   }

   protected void a(brh $$0, brh.a $$1) {
      etp $$2 = this.m($$0);
      etp $$3 = $$0.l(this);
      $$1.accept($$0, $$2.c - $$3.c, $$2.d - $$3.d, $$2.e - $$3.e);
   }

   public void k(brh $$0) {
   }

   public etp l(brh $$0) {
      return this.dk().b(bri.b, 0, this.aF);
   }

   public etp m(brh $$0) {
      return this.dl().e(this.a($$0, this.bf, 1.0F));
   }

   protected etp a(brh $$0, brk $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static etp a(brh $$0, brh $$1, brj $$2) {
      int $$3 = $$0.cQ().indexOf($$1);
      return $$2.c(bri.a, $$3, $$0.aF);
   }

   public boolean n(brh $$0) {
      return this.a($$0, false);
   }

   public boolean bE() {
      return this instanceof bsa;
   }

   public boolean a(brh $$0, boolean $$1) {
      if ($$0 == this.q) {
         return false;
      } else if (!$$0.bH()) {
         return false;
      } else {
         for (brh $$2 = $$0; $$2.q != null; $$2 = $$2.q) {
            if ($$2.q == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bP()) {
               this.ac();
            }

            this.b(bsl.a);
            this.q = $$0;
            this.q.p(this);
            $$0.A().filter($$0x -> $$0x instanceof aqi).forEach($$0x -> am.U.a((aqi)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(brh $$0) {
      return !this.bT() && this.K <= 0;
   }

   public void bF() {
      for (int $$0 = this.p.size() - 1; $$0 >= 0; $$0--) {
         ((brh)this.p.get($$0)).ac();
      }
   }

   public void bG() {
      if (this.q != null) {
         brh $$0 = this.q;
         this.q = null;
         $$0.q(this);
      }
   }

   public void ac() {
      this.bG();
   }

   protected void p(brh $$0) {
      if ($$0.da() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.p.isEmpty()) {
            this.p = ImmutableList.of($$0);
         } else {
            List<brh> $$1 = Lists.newArrayList(this.p);
            if (!this.dN().B && $$0 instanceof clh && !(this.cR() instanceof clh)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.p = ImmutableList.copyOf($$1);
         }

         this.a(dva.s, $$0);
      }
   }

   protected void q(brh $$0) {
      if ($$0.da() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.p.size() == 1 && this.p.get(0) == $$0) {
            this.p = ImmutableList.of();
         } else {
            this.p = this.p.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.K = 60;
         this.a(dva.q, $$0);
      }
   }

   protected boolean r(brh $$0) {
      return this.p.isEmpty();
   }

   protected boolean bH() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public double c_() {
      return this.ds();
   }

   public double d_() {
      return this.du();
   }

   public double L_() {
      return this.dy();
   }

   public float M_() {
      return this.dF();
   }

   public float e_() {
      return this.dD();
   }

   public void a(float $$0, int $$1) {
      this.n($$0);
   }

   public float bI() {
      return 0.0F;
   }

   public etp bJ() {
      return this.b(this.dF(), this.dD());
   }

   public etp a(csu $$0) {
      if (!(this instanceof clh $$1)) {
         return etp.b;
      } else {
         boolean $$2 = $$1.eW().a($$0) && !$$1.eV().a($$0);
         bru $$3 = $$2 ? $$1.fs().e() : $$1.fs();
         return this.b(0.0F, this.dD() + (float)($$3 == bru.b ? 80 : -80)).a(0.5);
      }
   }

   public eto bK() {
      return new eto(this.dF(), this.dD());
   }

   public etp bL() {
      return etp.a(this.bK());
   }

   public void f(in $$0) {
      if (this.aw()) {
         this.au();
      } else {
         if (!this.dN().B && !$$0.equals(this.ay)) {
            this.ay = $$0.i();
         }

         this.aw = true;
      }
   }

   protected void bM() {
      if (this.dN() instanceof aqh) {
         int $$0 = this.ax();
         aqh $$1 = (aqh)this.dN();
         if (this.aw) {
            MinecraftServer $$2 = $$1.o();
            akg<dad> $$3 = this.dN().ae() == dad.i ? dad.h : dad.i;
            aqh $$4 = $$2.a($$3);
            if ($$4 != null && $$2.G() && !this.bP() && this.ax++ >= $$0) {
               this.dN().af().a("portal");
               this.ax = $$0;
               this.au();
               this.b($$4);
               this.dN().af().c();
            }

            this.aw = false;
         } else {
            if (this.ax > 0) {
               this.ax -= 4;
            }

            if (this.ax < 0) {
               this.ax = 0;
            }
         }

         this.L();
      }
   }

   public int bN() {
      return 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
   }

   public void c(bqf $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dgy.a(this);
      }
   }

   public void m(float $$0) {
   }

   public boolean bO() {
      boolean $$0 = this.dN() != null && this.dN().B;
      return !this.bb() && (this.aL > 0 || $$0 && this.j(0));
   }

   public boolean bP() {
      return this.da() != null;
   }

   public boolean bQ() {
      return !this.p.isEmpty();
   }

   public boolean bR() {
      return this.ai().a(avu.p);
   }

   public boolean bS() {
      return !this.ai().a(avu.q);
   }

   public void g(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean bT() {
      return this.j(1);
   }

   public boolean bU() {
      return this.bT();
   }

   public boolean bV() {
      return this.bT();
   }

   public boolean bW() {
      return this.bT();
   }

   public boolean bX() {
      return this.bT();
   }

   public boolean bY() {
      return this.c(bsl.f);
   }

   public boolean bZ() {
      return this.j(3);
   }

   public void h(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean ca() {
      return this.j(4);
   }

   public boolean cb() {
      return this.c(bsl.d);
   }

   public boolean cc() {
      return this.cb() && !this.bc();
   }

   public void i(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cd() {
      return this.bb;
   }

   public final void j(boolean $$0) {
      this.bb = $$0;
      this.b(6, this.ce());
   }

   public boolean ce() {
      return this.dN().x_() ? this.j(6) : this.bb;
   }

   public boolean cf() {
      return this.j(5);
   }

   public boolean d(clh $$0) {
      if ($$0.N_()) {
         return false;
      } else {
         euv $$1 = this.ch();
         return $$1 != null && $$0 != null && $$0.ch() == $$1 && $$1.i() ? false : this.cf();
      }
   }

   public boolean cg() {
      return false;
   }

   public void a(BiConsumer<dux<?>, aqh> $$0) {
   }

   @Nullable
   public euo ch() {
      return this.dN().L().e(this.cz());
   }

   public boolean s(brh $$0) {
      return this.a($$0.ch());
   }

   public boolean a(euv $$0) {
      return this.ch() != null ? this.ch().a($$0) : false;
   }

   public void k(boolean $$0) {
      this.b(5, $$0);
   }

   protected boolean j(int $$0) {
      return (this.ao.a(ap) & 1 << $$0) != 0;
   }

   protected void b(int $$0, boolean $$1) {
      byte $$2 = this.ao.a(ap);
      if ($$1) {
         this.ao.a(ap, (byte)($$2 | 1 << $$0));
      } else {
         this.ao.a(ap, (byte)($$2 & ~(1 << $$0)));
      }
   }

   public int ci() {
      return 300;
   }

   public int cj() {
      return this.ao.a(aR);
   }

   public void k(int $$0) {
      this.ao.a(aR, $$0);
   }

   public int ck() {
      return this.ao.a(aW);
   }

   public void l(int $$0) {
      this.ao.a(aW, $$0);
   }

   public float cl() {
      int $$0 = this.cn();
      return (float)Math.min(this.ck(), $$0) / (float)$$0;
   }

   public boolean cm() {
      return this.ck() >= this.cn();
   }

   public int cn() {
      return 140;
   }

   public void a(aqh $$0, brz $$1) {
      this.i(this.aL + 1);
      if (this.aL == 0) {
         this.g(8);
      }

      this.a(this.dO().b(), 5.0F);
   }

   public void l(boolean $$0) {
      etp $$1 = this.dq();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void m(boolean $$0) {
      etp $$1 = this.dq();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(aqh $$0, bsa $$1) {
      return true;
   }

   public void co() {
      if (this.dq().b() > -0.5 && this.ac > 1.0F) {
         this.ac = 1.0F;
      }
   }

   public void n() {
      this.ac = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      in $$3 = in.a($$0, $$1, $$2);
      etp $$4 = new etp($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      in.a $$5 = new in.a();
      is $$6 = is.b;
      double $$7 = Double.MAX_VALUE;

      for (is $$8 : new is[]{is.c, is.d, is.e, is.f, is.b}) {
         $$5.a($$3, $$8);
         if (!this.dN().a_($$5).r(this.dN(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == is.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ah.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      etp $$13 = this.dq().a(0.75);
      if ($$6.o() == is.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == is.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == is.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dqh $$0, etp $$1) {
      this.n();
      this.V = $$1;
   }

   private static wu c(wu $$0) {
      xi $$1 = $$0.e().b($$0.a().a(null));

      for (wu $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public wu ad() {
      wu $$0 = this.af();
      return $$0 != null ? c($$0) : this.cp();
   }

   protected wu cp() {
      return this.n.h();
   }

   public boolean t(brh $$0) {
      return this == $$0;
   }

   public float cq() {
      return 0.0F;
   }

   public void n(float $$0) {
   }

   public void o(float $$0) {
   }

   public boolean cr() {
      return true;
   }

   public boolean u(brh $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dN() == null ? "~NULL~" : this.dN().toString();
      return this.aJ != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.ad().getString(),
            this.o,
            $$0,
            this.ds(),
            this.du(),
            this.dy(),
            this.aJ
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.ad().getString(),
            this.o,
            $$0,
            this.ds(),
            this.du(),
            this.dy()
         );
   }

   public boolean b(bqf $$0) {
      return this.dI() || this.ba && !$$0.a(avt.e) && !$$0.g() || $$0.a(avt.j) && this.bb() || $$0.a(avt.n) && this.ai().a(avu.o);
   }

   public boolean cs() {
      return this.ba;
   }

   public void n(boolean $$0) {
      this.ba = $$0;
   }

   public void v(brh $$0) {
      this.b($$0.ds(), $$0.du(), $$0.dy(), $$0.dD(), $$0.dF());
   }

   public void w(brh $$0) {
      ua $$1 = $$0.f(new ua());
      $$1.r("Dimension");
      this.g($$1);
      this.aZ = $$0.aZ;
      this.ay = $$0.ay;
   }

   @Nullable
   public brh b(aqh $$0) {
      if (this.dN() instanceof aqh && !this.dI()) {
         this.dN().af().a("changeDimension");
         this.ag();
         this.dN().af().a("reposition");
         emz $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dN().af().b("reloading");
            brh $$2 = this.ai().a((dad)$$0);
            if ($$2 != null) {
               $$2.w(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dF());
               $$2.g($$1.b);
               $$0.d($$2);
               if ($$0.ae() == dad.j) {
                  aqh.a($$0);
               }
            }

            this.ct();
            this.dN().af().c();
            ((aqh)this.dN()).h();
            $$0.h();
            this.dN().af().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void ct() {
      this.b(brh.c.e);
   }

   @Nullable
   protected emz a(aqh $$0) {
      boolean $$1 = this.dN().ae() == dad.j && $$0.ae() == dad.h;
      boolean $$2 = $$0.ae() == dad.j;
      if (!$$1 && !$$2) {
         boolean $$6 = $$0.ae() == dad.i;
         if (this.dN().ae() != dad.i && !$$6) {
            return null;
         } else {
            dry $$7 = $$0.C_();
            double $$8 = dtz.a(this.dN().D_(), $$0.D_());
            in $$9 = $$7.b(this.ds() * $$8, this.du(), this.dy() * $$8);
            return this.a($$0, $$9, $$6, $$7).map($$1x -> {
               dqh $$2x = this.dN().a_(this.ay);
               is.a $$3;
               etp $$5;
               if ($$2x.b(dqx.H)) {
                  $$3 = $$2x.c(dqx.H);
                  l.a $$4 = l.a(this.ay, $$3, 21, is.a.b, 21, $$1xx -> this.dN().a_($$1xx) == $$2x);
                  $$5 = this.a($$3, $$4);
               } else {
                  $$3 = is.a.a;
                  $$5 = new etp(0.5, 0.0, 0.0);
               }

               return ena.a($$0, $$1x, $$3, $$5, this, this.dq(), this.dD(), this.dF());
            }).orElse(null);
         }
      } else {
         in $$3 = $$2 ? aqh.a : $$0.U();
         $$0.l().a(aqm.f, new czk($$3), 3, $$3);
         int $$4;
         if ($$2) {
            $$4 = $$3.v();
         } else {
            $$4 = $$0.m($$3).a(dvz.a.f, $$3.u(), $$3.w()) + 1;
         }

         return new emz(new etp((double)$$3.u() + 0.5, (double)$$4, (double)$$3.w() + 0.5), this.dq(), this.dD(), this.dF());
      }
   }

   protected etp a(is.a $$0, l.a $$1) {
      return ena.a($$1, $$0, this.dl(), this.a(this.ap()));
   }

   protected Optional<l.a> a(aqh $$0, in $$1, boolean $$2, dry $$3) {
      return $$0.p().a($$1, $$2, $$3);
   }

   public boolean cu() {
      return !this.bP() && !this.bQ();
   }

   public float a(czv $$0, czj $$1, in $$2, dqh $$3, ema $$4, float $$5) {
      return $$5;
   }

   public boolean a(czv $$0, czj $$1, in $$2, dqh $$3, float $$4) {
      return true;
   }

   public int cv() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> brn.a(this.ai()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.o);
      $$0.a("Entity Name", () -> this.ad().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.ds(), this.du(), this.dy()));
      $$0.a("Entity's Block location", p.a(this.dN(), axz.a(this.ds()), axz.a(this.du()), axz.a(this.dy())));
      etp $$1 = this.dq();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", () -> this.cQ().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.da()));
   }

   public boolean cw() {
      return this.bO() && !this.N_();
   }

   public void a_(UUID $$0) {
      this.az = $$0;
      this.aA = this.az.toString();
   }

   @Override
   public UUID cx() {
      return this.az;
   }

   public String cy() {
      return this.aA;
   }

   @Override
   public String cz() {
      return this.aA;
   }

   public boolean cA() {
      return true;
   }

   public static double cB() {
      return m;
   }

   public static void b(double $$0) {
      m = $$0;
   }

   @Override
   public wu O_() {
      return euo.a(this.ch(), this.ad()).a($$0 -> $$0.a(this.cH()).a(this.cy()));
   }

   public void b(@Nullable wu $$0) {
      this.ao.a(aS, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public wu af() {
      return this.ao.a(aS).orElse(null);
   }

   @Override
   public boolean ae() {
      return this.ao.a(aS).isPresent();
   }

   public void o(boolean $$0) {
      this.ao.a(aT, $$0);
   }

   public boolean cC() {
      return this.ao.a(aT);
   }

   public final void n(double $$0, double $$1, double $$2) {
      if (this.dN() instanceof aqh) {
         czk $$3 = new czk(in.a($$0, $$1, $$2));
         ((aqh)this.dN()).l().a(aqm.g, $$3, 0, this.aj());
         this.dN().d($$3.e, $$3.f);
         this.c($$0, $$1, $$2);
      }
   }

   public boolean a(aqh $$0, double $$1, double $$2, double $$3, Set<bsn> $$4, float $$5, float $$6) {
      float $$7 = axz.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dN()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.z();
         this.n($$5);
      } else {
         this.ag();
         brh $$8 = this.ai().a((dad)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(brh.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dN() instanceof aqh) {
         this.b($$0, $$1, $$2, this.dD(), this.dF());
         this.z();
      }
   }

   private void z() {
      this.cS().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.p.iterator();

         while (var1.hasNext()) {
            brh $$1 = (brh)var1.next();
            $$0.a($$1, brh::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.ds() + $$0, this.du() + $$1, this.dy() + $$2);
   }

   public boolean cD() {
      return this.cC();
   }

   @Override
   public void a(List<ajq.c<?>> $$0) {
   }

   @Override
   public void a(ajm<?> $$0) {
      if (at.equals($$0)) {
         this.j_();
      }
   }

   @Deprecated
   protected void cE() {
      bsl $$0 = this.ap();
      brk $$1 = this.a($$0);
      this.bf = $$1;
      this.bg = $$1.c();
   }

   public void j_() {
      brk $$0 = this.bf;
      bsl $$1 = this.ap();
      brk $$2 = this.a($$1);
      this.bf = $$2;
      this.bg = $$2.c();
      this.ar();
      boolean $$3 = (double)$$2.a() <= 4.0 && (double)$$2.b() <= 4.0;
      if (!this.dN().B && !this.an && !this.ag && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof clh)) {
         etp $$4 = this.dl().b(0.0, (double)$$0.b() / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a() - $$0.a()) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b() - $$0.b()) + 1.0E-6;
         eui $$7 = euf.a(etk.a($$4, $$5, $$6, $$5));
         this.dN().a(this, $$7, $$4, (double)$$2.a(), (double)$$2.b(), (double)$$2.a()).ifPresent($$1x -> this.b($$1x.b(0.0, (double)(-$$2.b()) / 2.0, 0.0)));
      }
   }

   public is cF() {
      return is.a((double)this.dD());
   }

   public is cG() {
      return this.cF();
   }

   protected xa cH() {
      return new xa(xa.a.c, new xa.b(this.ai(), this.cx(), this.ad()));
   }

   public boolean a(aqi $$0) {
      return true;
   }

   @Override
   public final etk cI() {
      return this.aH;
   }

   public etk h_() {
      return this.cI();
   }

   public final void a(etk $$0) {
      this.aH = $$0;
   }

   public final float d(bsl $$0) {
      return this.a($$0).c();
   }

   public final float cJ() {
      return this.bg;
   }

   public etp p(float $$0) {
      return this.cK();
   }

   protected etp cK() {
      return new etp(0.0, (double)this.cJ(), (double)(this.dh() * 0.4F));
   }

   public bsr a_(int $$0) {
      return bsr.b;
   }

   @Override
   public void a(wu $$0) {
   }

   public dad cL() {
      return this.dN();
   }

   @Nullable
   public MinecraftServer cM() {
      return this.dN().o();
   }

   public bpm a(clh $$0, etp $$1, bpl $$2) {
      return bpm.d;
   }

   public boolean a(czv $$0) {
      return false;
   }

   public void a(bsa $$0, brh $$1) {
      if ($$1 instanceof bsa) {
         cyh.a((bsa)$$1, $$0);
      }

      cyh.b($$0, $$1);
   }

   public void c(aqi $$0) {
   }

   public void d(aqi $$0) {
   }

   public float a(djr $$0) {
      float $$1 = axz.g(this.dD());
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

   public float a(dib $$0) {
      float $$1 = axz.g(this.dD());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public boolean cN() {
      return false;
   }

   public cma a(clz $$0) {
      return this.ai().a(avu.r) ? cma.b : cma.a;
   }

   @Nullable
   public bsa cO() {
      return null;
   }

   public final boolean cP() {
      return this.cO() != null;
   }

   public final List<brh> cQ() {
      return this.p;
   }

   @Nullable
   public brh cR() {
      return this.p.isEmpty() ? null : (brh)this.p.get(0);
   }

   public boolean x(brh $$0) {
      return this.p.contains($$0);
   }

   public boolean a(Predicate<brh> $$0) {
      UnmodifiableIterator var2 = this.p.iterator();

      while (var2.hasNext()) {
         brh $$1 = (brh)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<brh> A() {
      return this.p.stream().flatMap(brh::cS);
   }

   @Override
   public Stream<brh> cS() {
      return Stream.concat(Stream.of(this), this.A());
   }

   @Override
   public Stream<brh> cT() {
      return Stream.concat(this.p.stream().flatMap(brh::cT), Stream.of(this));
   }

   public Iterable<brh> cU() {
      return () -> this.A().iterator();
   }

   public int cV() {
      return (int)this.A().filter($$0 -> $$0 instanceof clh).count();
   }

   public boolean cW() {
      return this.cV() == 1;
   }

   public brh cX() {
      brh $$0 = this;

      while ($$0.bP()) {
         $$0 = $$0.da();
      }

      return $$0;
   }

   public boolean y(brh $$0) {
      return this.cX() == $$0.cX();
   }

   public boolean z(brh $$0) {
      if (!$$0.bP()) {
         return false;
      } else {
         brh $$1 = $$0.da();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean cY() {
      return this.cO() instanceof clh $$0 ? $$0.g() : this.cZ();
   }

   public boolean cZ() {
      return !this.dN().B;
   }

   protected static etp a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -axz.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = axz.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new etp((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public etp b(bsa $$0) {
      return new etp(this.ds(), this.cI().e, this.dy());
   }

   @Nullable
   public brh da() {
      return this.q;
   }

   @Nullable
   public brh db() {
      return this.q != null && this.q.cO() == this ? this.q : null;
   }

   public emf k_() {
      return emf.a;
   }

   public avd dc() {
      return avd.g;
   }

   protected int dd() {
      return 1;
   }

   public ed de() {
      return new ed(
         this, this.dl(), this.bK(), this.dN() instanceof aqh ? (aqh)this.dN() : null, this.F(), this.ad().getString(), this.O_(), this.dN().o(), this
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
      return this.dN().aa().b(czz.p);
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public boolean U_() {
      return true;
   }

   public void a(ep.a $$0, etp $$1) {
      etp $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.s(axz.g((float)(-(axz.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.r(axz.g((float)(axz.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dD());
      this.P = this.dF();
      this.O = this.dD();
   }

   public boolean a(awg<elz> $$0, double $$1) {
      if (this.df()) {
         return false;
      } else {
         etk $$2 = this.cI().h(0.001);
         int $$3 = axz.a($$2.a);
         int $$4 = axz.c($$2.d);
         int $$5 = axz.a($$2.b);
         int $$6 = axz.c($$2.e);
         int $$7 = axz.a($$2.c);
         int $$8 = axz.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cA();
         boolean $$11 = false;
         etp $$12 = etp.b;
         int $$13 = 0;
         in.a $$14 = new in.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  ema $$18 = this.dN().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((czj)this.dN(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           etp $$20 = $$18.c(this.dN(), $$14);
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

            if (!(this instanceof clh)) {
               $$12 = $$12.d();
            }

            etp $$21 = this.dq();
            $$12 = $$12.a($$1 * 1.0);
            double $$22 = 0.003;
            if (Math.abs($$21.c) < 0.003 && Math.abs($$21.e) < 0.003 && $$12.f() < 0.0045000000000000005) {
               $$12 = $$12.d().a(0.0045000000000000005);
            }

            this.g(this.dq().e($$12));
         }

         this.ak.put($$0, $$9);
         return $$11;
      }
   }

   public boolean df() {
      etk $$0 = this.cI().g(1.0);
      int $$1 = axz.a($$0.a);
      int $$2 = axz.c($$0.d);
      int $$3 = axz.a($$0.c);
      int $$4 = axz.c($$0.f);
      return !this.dN().b($$1, $$3, $$2, $$4);
   }

   public double b(awg<elz> $$0) {
      return this.ak.getDouble($$0);
   }

   public double dg() {
      return (double)this.cJ() < 0.4 ? 0.0 : 0.4;
   }

   public final float dh() {
      return this.bf.a();
   }

   public final float di() {
      return this.bf.b();
   }

   public zb<abm> dj() {
      return new abn(this);
   }

   public brk a(bsl $$0) {
      return this.n.n();
   }

   public final brj dk() {
      return this.bf.d();
   }

   public etp dl() {
      return this.s;
   }

   public etp dm() {
      return this.dl();
   }

   @Override
   public in dn() {
      return this.t;
   }

   public dqh do() {
      if (this.bl == null) {
         this.bl = this.dN().a_(this.dn());
      }

      return this.bl;
   }

   public czk dp() {
      return this.u;
   }

   public etp dq() {
      return this.v;
   }

   public void g(etp $$0) {
      this.v = $$0;
   }

   public void h(etp $$0) {
      this.g(this.dq().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.g(new etp($$0, $$1, $$2));
   }

   public final int dr() {
      return this.t.u();
   }

   public final double ds() {
      return this.s.c;
   }

   public double c(double $$0) {
      return this.s.c + (double)this.dh() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ah.j() - 1.0) * $$0);
   }

   public final int dt() {
      return this.t.v();
   }

   public final double du() {
      return this.s.d;
   }

   public double e(double $$0) {
      return this.s.d + (double)this.di() * $$0;
   }

   public double dv() {
      return this.e(this.ah.j());
   }

   public double dw() {
      return this.s.d + (double)this.bg;
   }

   public final int dx() {
      return this.t.w();
   }

   public final double dy() {
      return this.s.e;
   }

   public double f(double $$0) {
      return this.s.e + (double)this.dh() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ah.j() - 1.0) * $$0);
   }

   public final void p(double $$0, double $$1, double $$2) {
      if (this.s.c != $$0 || this.s.d != $$1 || this.s.e != $$2) {
         this.s = new etp($$0, $$1, $$2);
         int $$3 = axz.a($$0);
         int $$4 = axz.a($$1);
         int $$5 = axz.a($$2);
         if ($$3 != this.t.u() || $$4 != this.t.v() || $$5 != this.t.w()) {
            this.t = new in($$3, $$4, $$5);
            this.bl = null;
            if (jp.a($$3) != this.u.e || jp.a($$5) != this.u.f) {
               this.u = new czk(this.t);
            }
         }

         this.aX.a();
      }
   }

   public void dz() {
   }

   public etp q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bg * 0.7, 0.0);
   }

   public void a(abn $$0) {
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
   public csz dA() {
      return null;
   }

   public void p(boolean $$0) {
      this.aB = $$0;
   }

   public boolean dB() {
      return !this.ai().a(avu.k);
   }

   public boolean dC() {
      return (this.aB || this.aC) && this.dB();
   }

   public float dD() {
      return this.aF;
   }

   public float dE() {
      return this.dD();
   }

   public void r(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aF = $$0;
      }
   }

   public float dF() {
      return this.aG;
   }

   public void s(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aG = $$0;
      }
   }

   public boolean dG() {
      return false;
   }

   public float dH() {
      return 0.0F;
   }

   public void a(@Nullable brh $$0) {
   }

   public final boolean dI() {
      return this.aJ != null;
   }

   @Nullable
   public brh.c dJ() {
      return this.aJ;
   }

   @Override
   public final void b(brh.c $$0) {
      if (this.aJ == null) {
         this.aJ = $$0;
      }

      if (this.aJ.a()) {
         this.ac();
      }

      this.cQ().forEach(brh::ac);
      this.aX.a($$0);
   }

   protected void dK() {
      this.aJ = null;
   }

   @Override
   public void a(dui $$0) {
      this.aX = $$0;
   }

   @Override
   public boolean dL() {
      if (this.aJ != null && !this.aJ.b()) {
         return false;
      } else {
         return this.bP() ? false : !this.bQ() || !this.cW();
      }
   }

   @Override
   public boolean dM() {
      return false;
   }

   public boolean a(dad $$0, in $$1) {
      return true;
   }

   public dad dN() {
      return this.r;
   }

   protected void a(dad $$0) {
      this.r = $$0;
   }

   public bqg dO() {
      return this.dN().ai();
   }

   public jk dP() {
      return this.dN().H_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = axz.d($$6, this.ds(), $$1);
      double $$8 = axz.d($$6, this.du(), $$2);
      double $$9 = axz.d($$6, this.dy(), $$3);
      float $$10 = (float)axz.e($$6, (double)this.dD(), $$4);
      float $$11 = (float)axz.d($$6, (double)this.dF(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   @FunctionalInterface
   public interface a {
      void accept(brh var1, double var2, double var4, double var6);
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
