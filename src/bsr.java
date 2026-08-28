import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleListIterator;
import it.unimi.dsi.fastutil.floats.FloatArraySet;
import it.unimi.dsi.fastutil.floats.FloatArrays;
import it.unimi.dsi.fastutil.floats.FloatSet;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import java.util.ArrayList;
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

public abstract class bsr implements ajz, bqw, dxg, es, eyf {
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
   private static final ewx d = new ewx(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double e = 0.014;
   private static final double k = 0.007;
   private static final double l = 0.0023333333333333335;
   public static final String I = "UUID";
   private static double m = 1.0;
   private final bsx<?> n;
   private int o = c.incrementAndGet();
   public boolean J;
   private ImmutableList<bsr> p = ImmutableList.of();
   protected int K;
   @Nullable
   private bsr q;
   private dcw r;
   public double L;
   public double M;
   public double N;
   private exc s;
   private jd t;
   private dcd u;
   private exc v = exc.b;
   private float aD;
   private float aE;
   public float O;
   public float P;
   private ewx aF = d;
   private boolean aG;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   public boolean U;
   protected exc V = exc.b;
   @Nullable
   private bsr.c aH;
   public static final float W = 0.6F;
   public static final float X = 1.8F;
   public float Y;
   public float Z;
   public float aa;
   public float ab;
   public float ac;
   private float aI = 1.0F;
   public double ad;
   public double ae;
   public double af;
   public boolean ag;
   protected final ayw ah = ayw.a();
   public int ai;
   private int aJ = -this.df();
   protected boolean aj;
   protected Object2DoubleMap<awu<epd>> ak = new Object2DoubleArrayMap(2);
   protected boolean al;
   private final Set<awu<epd>> aK = new HashSet<>();
   public int am;
   protected boolean an = true;
   protected final aka ao;
   protected static final ajw<Byte> ap = aka.a(bsr.class, ajy.a);
   protected static final int aq = 0;
   private static final int aL = 1;
   private static final int aM = 3;
   private static final int aN = 4;
   private static final int aO = 5;
   protected static final int ar = 6;
   protected static final int as = 7;
   private static final ajw<Integer> aP = aka.a(bsr.class, ajy.b);
   private static final ajw<Optional<wz>> aQ = aka.a(bsr.class, ajy.g);
   private static final ajw<Boolean> aR = aka.a(bsr.class, ajy.k);
   private static final ajw<Boolean> aS = aka.a(bsr.class, ajy.k);
   private static final ajw<Boolean> aT = aka.a(bsr.class, ajy.k);
   protected static final ajw<bua> at = aka.a(bsr.class, ajy.w);
   private static final ajw<Integer> aU = aka.a(bsr.class, ajy.b);
   private dxh aV = dxh.a;
   private final aig aW = new aig();
   public boolean au;
   public boolean av;
   @Nullable
   public btz aw;
   private int aX;
   private boolean aY;
   protected UUID ax = ayo.a(this.ah);
   protected String ay = this.ax.toString();
   private boolean aZ;
   private final Set<String> ba = Sets.newHashSet();
   private final double[] bb = new double[]{0.0, 0.0, 0.0};
   private long bc;
   private bsu bd;
   private float be;
   public boolean az;
   public boolean aA;
   public boolean aB;
   public Optional<jd> aC = Optional.empty();
   private boolean bf = false;
   private float bg;
   private int bh;
   private boolean bi;
   @Nullable
   private dtc bj = null;

   public bsr(bsx<?> $$0, dcw $$1) {
      this.n = $$0;
      this.r = $$1;
      this.bd = $$0.n();
      this.s = exc.b;
      this.t = jd.c;
      this.u = dcd.b;
      aka.a $$2 = new aka.a(this);
      $$2.a(ap, (byte)0);
      $$2.a(aP, this.cl());
      $$2.a(aR, false);
      $$2.a(aQ, Optional.empty());
      $$2.a(aS, false);
      $$2.a(aT, false);
      $$2.a(at, bua.a);
      $$2.a(aU, 0);
      this.a($$2);
      this.ao = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.be = this.bd.c();
   }

   public boolean a(jd $$0, dtc $$1) {
      exv $$2 = $$1.b(this.dO(), $$0, exh.a(this));
      exv $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return exs.c($$3, exs.a(this.cK()), exg.i);
   }

   public int q_() {
      eyi $$0 = this.ck();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean R_() {
      return false;
   }

   public final void ak() {
      if (this.bT()) {
         this.bI();
      }

      if (this.bS()) {
         this.ad();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.aW.e(new exc($$0, $$1, $$2));
   }

   public aig al() {
      return this.aW;
   }

   public bsx<?> am() {
      return this.n;
   }

   @Override
   public int an() {
      return this.o;
   }

   public void e(int $$0) {
      this.o = $$0;
   }

   public Set<String> ao() {
      return this.ba;
   }

   public boolean a(String $$0) {
      return this.ba.size() >= 1024 ? false : this.ba.add($$0);
   }

   public boolean b(String $$0) {
      return this.ba.remove($$0);
   }

   public void ap() {
      this.a(bsr.c.a);
      this.a(dxz.p);
   }

   public final void aq() {
      this.a(bsr.c.b);
   }

   protected abstract void a(aka.a var1);

   public aka ar() {
      return this.ao;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bsr ? ((bsr)$$0).o == this.o : false;
   }

   @Override
   public int hashCode() {
      return this.o;
   }

   public void a(bsr.c $$0) {
      this.b($$0);
   }

   public void as() {
   }

   public void b(bua $$0) {
      this.ao.a(at, $$0);
   }

   public bua at() {
      return this.ao.a(at);
   }

   public boolean c(bua $$0) {
      return this.at() == $$0;
   }

   public boolean a(bsr $$0, double $$1) {
      return this.dm().a((jw)$$0.dm(), $$1);
   }

   public boolean a(bsr $$0, double $$1, double $$2) {
      double $$3 = $$0.dt() - this.dt();
      double $$4 = $$0.dv() - this.dv();
      double $$5 = $$0.dz() - this.dz();
      return ayo.e($$3, $$5) < ayo.k($$1) && ayo.k($$4) < ayo.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.t($$0 % 360.0F);
      this.u($$1 % 360.0F);
   }

   public final void c(exc $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      this.a(this.au());
   }

   protected ewx au() {
      return this.bd.a(this.s);
   }

   protected void av() {
      this.a_(this.s.c, this.s.d, this.s.e);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.u(this.dG() + $$2);
      this.t(this.dE() + $$3);
      this.u(ayo.a(this.dG(), -90.0F, 90.0F));
      this.P += $$2;
      this.O += $$3;
      this.P = ayo.a(this.P, -90.0F, 90.0F);
      if (this.q != null) {
         this.q.k(this);
      }
   }

   public void l() {
      this.aw();
   }

   public void aw() {
      this.dO().ag().a("entityBaseTick");
      this.bj = null;
      if (this.bS() && this.dc().dJ()) {
         this.ad();
      }

      if (this.K > 0) {
         this.K--;
      }

      this.Y = this.Z;
      this.P = this.dG();
      this.O = this.dE();
      this.bP();
      if (this.br()) {
         this.bs();
      }

      this.aA = this.az;
      this.az = false;
      this.bm();
      this.H();
      this.bl();
      if (this.dO().B) {
         this.aD();
      } else if (this.aJ > 0) {
         if (this.be()) {
            this.h(this.aJ - 4);
            if (this.aJ < 0) {
               this.aD();
            }
         } else {
            if (this.aJ % 20 == 0 && !this.bt()) {
               this.a(this.dP().d(), 1.0F);
            }

            this.h(this.aJ - 1);
         }

         if (this.cn() > 0) {
            this.k(0);
            this.dO().a(null, 1009, this.t, 1);
         }
      }

      if (this.bt()) {
         this.aB();
         this.ac *= 0.5F;
      }

      this.ax();
      if (!this.dO().B) {
         this.c(this.aJ > 0);
      }

      this.an = false;
      if (!this.dO().B && this instanceof btk) {
         btk.b_((bsr)((btk)this));
      }

      this.dO().ag().c();
   }

   public void c(boolean $$0) {
      this.b(0, $$0 || this.bi);
   }

   public void ax() {
      if (this.dv() < (double)(this.dO().I_() - 64)) {
         this.aE();
      }
   }

   public void ay() {
      this.aX = this.bQ();
   }

   public void f(int $$0) {
      this.aX = $$0;
   }

   public int az() {
      return this.aX;
   }

   public boolean aA() {
      return this.aX > 0;
   }

   protected void M() {
      if (this.aA()) {
         this.aX--;
      }
   }

   public void aB() {
      if (!this.be()) {
         this.d(15.0F);
         if (this.a(this.dP().e(), 4.0F)) {
            this.a(avp.ka, 0.4F, 2.0F + this.ah.i() * 0.4F);
         }
      }
   }

   public final void d(float $$0) {
      this.g(ayo.d($$0 * 20.0F));
   }

   public void g(int $$0) {
      if (this.aJ < $$0) {
         this.h($$0);
      }
   }

   public void h(int $$0) {
      this.aJ = $$0;
   }

   public int aC() {
      return this.aJ;
   }

   public void aD() {
      this.h(0);
   }

   protected void aE() {
      this.aq();
   }

   public boolean g(double $$0, double $$1, double $$2) {
      return this.b(this.cK().d($$0, $$1, $$2));
   }

   private boolean b(ewx $$0) {
      return this.dO().a(this, $$0) && !this.dO().d($$0);
   }

   public void d(boolean $$0) {
      this.aG = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, exc $$1) {
      this.aG = $$0;
      this.b($$0, $$1);
   }

   public boolean d(jd $$0) {
      return this.aC.isPresent() && this.aC.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable exc $$1) {
      if ($$0) {
         ewx $$2 = this.cK();
         ewx $$3 = new ewx($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<jd> $$4 = this.r.g(this, $$3);
         if ($$4.isPresent() || this.bf) {
            this.aC = $$4;
         } else if ($$1 != null) {
            ewx $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
            $$4 = this.r.g(this, $$5);
            this.aC = $$4;
         }

         this.bf = $$4.isEmpty();
      } else {
         this.bf = false;
         if (this.aC.isPresent()) {
            this.aC = Optional.empty();
         }
      }
   }

   public boolean aF() {
      return this.aG;
   }

   public void a(bts $$0, exc $$1) {
      if (this.ag) {
         this.a_(this.dt() + $$1.c, this.dv() + $$1.d, this.dz() + $$1.e);
      } else {
         this.aB = this.bR();
         if ($$0 == bts.c) {
            $$1 = this.e($$1);
            if ($$1.equals(exc.b)) {
               return;
            }
         }

         this.dO().ag().a("move");
         if (this.V.g() > 1.0E-7) {
            $$1 = $$1.h(this.V);
            this.V = exc.b;
            this.i(exc.b);
         }

         $$1 = this.a($$1, $$0);
         exc $$2 = this.a($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ac != 0.0F && $$3 >= 1.0) {
               ewy $$4 = this.dO().a(new dcf(this.dm(), this.dm().e($$2), dcf.a.d, dcf.b.d, this));
               if ($$4.c() != exa.a.a) {
                  this.n();
               }
            }

            this.a_(this.dt() + $$2.c, this.dv() + $$2.d, this.dz() + $$2.e);
         }

         this.dO().ag().c();
         this.dO().ag().a("rest");
         boolean $$5 = !ayo.b($$1.c, $$2.c);
         boolean $$6 = !ayo.b($$1.e, $$2.e);
         this.Q = $$5 || $$6;
         this.R = $$1.d != $$2.d;
         this.S = this.R && $$1.d < 0.0;
         if (this.Q) {
            this.T = this.d($$2);
         } else {
            this.T = false;
         }

         this.a(this.S, $$2);
         jd $$7 = this.aK();
         dtc $$8 = this.dO().a_($$7);
         this.a($$2.d, this.aF(), $$8, $$7);
         if (this.dJ()) {
            this.dO().ag().c();
         } else {
            if (this.Q) {
               exc $$9 = this.dr();
               this.n($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            dfy $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dO(), this);
            }

            if (this.aF()) {
               $$10.a(this.dO(), $$7, $$8, this);
            }

            bsr.b $$11 = this.bc();
            if ($$11.a() && !this.bS()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.ab = this.ab + (float)($$2.f() * 0.6);
               jd $$15 = this.aM();
               dtc $$16 = this.dO().a_($$15);
               boolean $$17 = this.c($$16);
               if (!$$17) {
                  $$13 = 0.0;
               }

               this.Z = this.Z + (float)$$2.h() * 0.6F;
               this.aa = this.aa + (float)Math.sqrt($$12 * $$12 + $$13 * $$13 + $$14 * $$14) * 0.6F;
               if (this.aa > this.aI && !$$16.i()) {
                  boolean $$18 = $$15.equals($$7);
                  boolean $$19 = this.a($$7, $$8, $$11.c(), $$18, $$1);
                  if (!$$18) {
                     $$19 |= this.a($$15, $$16, false, $$11.b(), $$1);
                  }

                  if ($$19) {
                     this.aI = this.aP();
                  } else if (this.bf()) {
                     this.aI = this.aP();
                     if ($$11.c()) {
                        this.aU();
                     }

                     if ($$11.b()) {
                        this.a(dxz.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aJ();
               }
            }

            this.aG();
            float $$20 = this.aO();
            this.i(this.dr().d((double)$$20, 1.0, (double)$$20));
            if (this.dO().c(this.cK().h(1.0E-6)).noneMatch($$0x -> $$0x.a(awe.aL) || $$0x.a(dga.H))) {
               if (this.aJ <= 0) {
                  this.h(-this.df());
               }

               if (this.aB && (this.az || this.bh())) {
                  this.aH();
               }
            }

            if (this.bR() && (this.az || this.bh())) {
               this.h(-this.df());
            }

            this.dO().ag().c();
         }
      }
   }

   private boolean c(dtc $$0) {
      return $$0.a(awe.aQ) || $$0.a(dga.qP);
   }

   private boolean a(jd $$0, dtc $$1, boolean $$2, boolean $$3, exc $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aF() || $$5 || this.cb() && $$4.d == 0.0 || this.cj()) && !this.cd()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dO().a(dxz.P, this.dm(), dxz.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean d(exc $$0) {
      return false;
   }

   protected void aG() {
      try {
         this.aT();
      } catch (Throwable var4) {
         o $$1 = o.a(var4, "Checking entity block collision");
         p $$2 = $$1.a("Entity being checked for collision");
         this.a($$2);
         throw new z($$1);
      }
   }

   protected void aH() {
      this.a(avp.kf, 0.7F, 1.6F + (this.ah.i() - this.ah.i()) * 0.4F);
   }

   public void aI() {
      if (!this.dO().B && this.aB) {
         this.aH();
      }

      this.aD();
   }

   protected void aJ() {
      if (this.aW()) {
         this.aV();
         if (this.bc().b()) {
            this.a(dxz.x);
         }
      }
   }

   @Deprecated
   public jd aK() {
      return this.e(0.2F);
   }

   public jd aL() {
      return this.e(0.500001F);
   }

   public jd aM() {
      return this.e(1.0E-5F);
   }

   protected jd e(float $$0) {
      if (this.aC.isPresent()) {
         jd $$1 = this.aC.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dtc $$2 = this.dO().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(awe.T)) && !$$2.a(awe.M) && !($$2.b() instanceof dix) ? $$1.h(ayo.a(this.s.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = ayo.a(this.s.c);
         int $$4 = ayo.a(this.s.d - (double)$$0);
         int $$5 = ayo.a(this.s.e);
         return new jd($$3, $$4, $$5);
      }
   }

   protected float aN() {
      float $$0 = this.dO().a_(this.do()).b().k();
      float $$1 = this.dO().a_(this.aL()).b().k();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aO() {
      dtc $$0 = this.dO().a_(this.do());
      float $$1 = $$0.b().j();
      if (!$$0.a(dga.G) && !$$0.a(dga.nd)) {
         return (double)$$1 == 1.0 ? this.dO().a_(this.aL()).b().j() : $$1;
      } else {
         return $$1;
      }
   }

   protected exc a(exc $$0, bts $$1) {
      return $$0;
   }

   protected exc e(exc $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dO().Z();
         if ($$1 != this.bc) {
            Arrays.fill(this.bb, 0.0);
            this.bc = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(ji.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? exc.b : new exc($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(ji.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? exc.b : new exc(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(ji.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? exc.b : new exc(0.0, 0.0, $$4);
         } else {
            return exc.b;
         }
      }
   }

   private double a(ji.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = ayo.a($$1 + this.bb[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bb[$$2];
      this.bb[$$2] = $$3;
      return $$1;
   }

   private exc a(exc $$0) {
      ewx $$1 = this.cK();
      List<exv> $$2 = this.dO().c(this, $$1.b($$0));
      exc $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dO(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = $$5 && $$0.d < 0.0;
      if (this.dI() > 0.0F && ($$7 || this.aF()) && ($$4 || $$6)) {
         ewx $$8 = $$7 ? $$1.d(0.0, $$3.d, 0.0) : $$1;
         ewx $$9 = $$8.b($$0.c, (double)this.dI(), $$0.e);
         if (!$$7) {
            $$9 = $$9.b(0.0, -1.0E-5F, 0.0);
         }

         List<exv> $$10 = a(this, this.r, $$2, $$9);
         float $$11 = (float)$$3.d;
         float[] $$12 = a($$8, $$10, this.dI(), $$11);

         for (float $$13 : $$12) {
            exc $$14 = a(new exc($$0.c, (double)$$13, $$0.e), $$8, $$10);
            if ($$14.i() > $$3.i()) {
               return $$14;
            }
         }
      }

      return $$3;
   }

   private static float[] a(ewx $$0, List<exv> $$1, float $$2, float $$3) {
      FloatSet $$4 = new FloatArraySet(4);

      for (exv $$5 : $$1) {
         DoubleList $$6 = $$5.a(ji.a.b);
         DoubleListIterator var8 = $$6.iterator();

         while (var8.hasNext()) {
            double $$7 = (Double)var8.next();
            float $$8 = (float)($$7 - $$0.b);
            if (!($$8 < 0.0F) && $$8 != $$3) {
               if ($$8 > $$2) {
                  break;
               }

               $$4.add($$8);
            }
         }
      }

      float[] $$9 = $$4.toFloatArray();
      FloatArrays.unstableSort($$9);
      return $$9;
   }

   public static exc a(@Nullable bsr $$0, exc $$1, ewx $$2, dcw $$3, List<exv> $$4) {
      List<exv> $$5 = a($$0, $$3, $$4, $$2.b($$1));
      return a($$1, $$2, $$5);
   }

   private static List<exv> a(@Nullable bsr $$0, dcw $$1, List<exv> $$2, ewx $$3) {
      Builder<exv> $$4 = ImmutableList.builderWithExpectedSize($$2.size() + 1);
      if (!$$2.isEmpty()) {
         $$4.addAll($$2);
      }

      dut $$5 = $$1.C_();
      boolean $$6 = $$0 != null && $$5.a($$0, $$3);
      if ($$6) {
         $$4.add($$5.c());
      }

      $$4.addAll($$1.e($$0, $$3));
      return $$4.build();
   }

   private static exc a(exc $$0, ewx $$1, List<exv> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = exs.a(ji.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = exs.a(ji.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = exs.a(ji.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = exs.a(ji.a.c, $$1, $$2, $$5);
         }

         return new exc($$3, $$4, $$5);
      }
   }

   protected float aP() {
      return (float)((int)this.aa + 1);
   }

   protected avo aQ() {
      return avp.kj;
   }

   protected avo aR() {
      return avp.ki;
   }

   protected avo aS() {
      return avp.ki;
   }

   protected void aT() {
      ewx $$0 = this.cK();
      jd $$1 = jd.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      jd $$2 = jd.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dO().a($$1, $$2)) {
         jd.a $$3 = new jd.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bE()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  dtc $$7 = this.dO().a_($$3);

                  try {
                     $$7.a(this.dO(), $$3, this);
                     this.a($$7);
                  } catch (Throwable var12) {
                     o $$9 = o.a(var12, "Colliding entity with block");
                     p $$10 = $$9.a("Block being collided with");
                     p.a($$10, this.dO(), $$3, $$7);
                     throw new z($$9);
                  }
               }
            }
         }
      }
   }

   protected void a(dtc $$0) {
   }

   public jd a(aqu $$0, jd $$1) {
      jd $$2 = $$0.V();
      exc $$3 = $$2.b();
      int $$4 = $$0.m($$2).a(dyy.a.f, $$2.u(), $$2.w()) + 1;
      return jd.a($$3.c, (double)$$4, $$3.e);
   }

   public void a(jm<dxz> $$0, @Nullable bsr $$1) {
      this.dO().a($$1, $$0, this.s);
   }

   public void a(jm<dxz> $$0) {
      this.a($$0, this);
   }

   private void c(jd $$0, dtc $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.v();
      }
   }

   protected void aU() {
      bsr $$0 = Objects.requireNonNullElse(this.cQ(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      exc $$2 = $$0.dr();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.f($$3);
   }

   protected jd e(jd $$0) {
      jd $$1 = $$0.d();
      dtc $$2 = this.dO().a_($$1);
      return !$$2.a(awe.bo) && !$$2.a(awe.bp) ? $$0 : $$1;
   }

   protected void a(dtc $$0, dtc $$1) {
      dnm $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dtc $$0) {
      dnm $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(jd $$0, dtc $$1) {
      dnm $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dtc $$0) {
      return $$0.a(awe.bn) && this.ai >= this.bh + 20;
   }

   private void v() {
      this.bg = this.bg * (float)Math.pow(0.997, (double)(this.ai - this.bh));
      this.bg = Math.min(1.0F, this.bg + 0.07F);
      float $$0 = 0.5F + this.bg * this.ah.i() * 1.2F;
      float $$1 = 0.1F + this.bg * 1.2F;
      this.a(avp.E, $$1, $$0);
      this.bh = this.ai;
   }

   protected void f(float $$0) {
      this.a(this.aQ(), $$0, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
   }

   protected void aV() {
   }

   protected boolean aW() {
      return false;
   }

   public void a(avo $$0, float $$1, float $$2) {
      if (!this.aX()) {
         this.dO().a(null, this.dt(), this.dv(), this.dz(), $$0, this.de(), $$1, $$2);
      }
   }

   public void a(avo $$0) {
      if (!this.aX()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean aX() {
      return this.ao.a(aS);
   }

   public void e(boolean $$0) {
      this.ao.a(aS, $$0);
   }

   public boolean aY() {
      return this.ao.a(aT);
   }

   public void f(boolean $$0) {
      this.ao.a(aT, $$0);
   }

   protected double aZ() {
      return 0.0;
   }

   public final double ba() {
      return this.aY() ? 0.0 : this.aZ();
   }

   protected void bb() {
      double $$0 = this.ba();
      if ($$0 != 0.0) {
         this.i(this.dr().b(0.0, -$$0, 0.0));
      }
   }

   protected bsr.b bc() {
      return bsr.b.d;
   }

   public boolean bd() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dtc $$2, jd $$3) {
      if ($$1) {
         if (this.ac > 0.0F) {
            $$2.b().a(this.dO(), $$2, $$3, this, this.ac);
            this.dO().a(dxz.A, this.s, dxz.a.a(this, this.aC.<dtc>map($$0x -> this.dO().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ac -= (float)$$0;
      }
   }

   public boolean be() {
      return this.am().d();
   }

   public boolean a(float $$0, float $$1, brk $$2) {
      if (this.n.a(awi.o)) {
         return false;
      } else {
         if (this.bT()) {
            for (bsr $$3 : this.cS()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean bf() {
      return this.aj;
   }

   private boolean w() {
      jd $$0 = this.do();
      return this.dO().r($$0) || this.dO().r(jd.a((double)$$0.u(), this.cK().e, (double)$$0.w()));
   }

   private boolean F() {
      return this.dp().a(dga.nd);
   }

   public boolean bg() {
      return this.bf() || this.w();
   }

   public boolean bh() {
      return this.bf() || this.w() || this.F();
   }

   public boolean bi() {
      return this.bf() || this.F();
   }

   public boolean bj() {
      return this.bi() || this.bt();
   }

   public boolean bk() {
      return this.al && this.bf();
   }

   public void bl() {
      if (this.cd()) {
         this.i(this.cc() && this.bf() && !this.bS());
      } else {
         this.i(this.cc() && this.bk() && !this.bS() && this.dO().b_(this.t).a(awk.a));
      }
   }

   protected boolean bm() {
      this.ak.clear();
      this.bn();
      double $$0 = this.dO().D_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(awk.b, $$0);
      return this.bf() || $$1;
   }

   void bn() {
      if (this.dc() instanceof cov $$0 && !$$0.bk()) {
         this.aj = false;
         return;
      }

      if (this.a(awk.a, 0.014)) {
         if (!this.aj && !this.an) {
            this.bo();
         }

         this.n();
         this.aj = true;
         this.aD();
      } else {
         this.aj = false;
      }
   }

   private void H() {
      this.al = this.a(awk.a);
      this.aK.clear();
      double $$0 = this.dx();
      if (this.dc() instanceof cov $$2 && !$$2.bk() && $$2.cK().e >= $$0 && $$2.cK().b <= $$0) {
         return;
      }

      jd $$3 = jd.a(this.dt(), $$0, this.dz());
      epe $$4 = this.dO().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((dcc)this.dO(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aK::add);
      }
   }

   protected void bo() {
      bsr $$0 = Objects.requireNonNullElse(this.cQ(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      exc $$2 = $$0.dr();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aR(), $$3, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
      } else {
         this.a(this.aS(), $$3, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
      }

      float $$4 = (float)ayo.a(this.dv());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bd.a() * 20.0F; $$5++) {
         double $$6 = (this.ah.j() * 2.0 - 1.0) * (double)this.bd.a();
         double $$7 = (this.ah.j() * 2.0 - 1.0) * (double)this.bd.a();
         this.dO().a(lm.d, this.dt() + $$6, (double)($$4 + 1.0F), this.dz() + $$7, $$2.c, $$2.d - this.ah.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bd.a() * 20.0F; $$8++) {
         double $$9 = (this.ah.j() * 2.0 - 1.0) * (double)this.bd.a();
         double $$10 = (this.ah.j() * 2.0 - 1.0) * (double)this.bd.a();
         this.dO().a(lm.am, this.dt() + $$9, (double)($$4 + 1.0F), this.dz() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(dxz.O);
   }

   @Deprecated
   protected dtc bp() {
      return this.dO().a_(this.aK());
   }

   public dtc bq() {
      return this.dO().a_(this.aM());
   }

   public boolean br() {
      return this.cc() && !this.bf() && !this.R_() && !this.cb() && !this.bt() && this.bE();
   }

   protected void bs() {
      jd $$0 = this.aK();
      dtc $$1 = this.dO().a_($$0);
      if ($$1.l() != dmf.a) {
         exc $$2 = this.dr();
         jd $$3 = this.do();
         double $$4 = this.dt() + (this.ah.j() - 0.5) * (double)this.bd.a();
         double $$5 = this.dz() + (this.ah.j() - 0.5) * (double)this.bd.a();
         if ($$3.u() != $$0.u()) {
            $$4 = ayo.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = ayo.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dO().a(new le(lm.b, $$1), $$4, this.dv() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(awu<epd> $$0) {
      return this.aK.contains($$0);
   }

   public boolean bt() {
      return !this.an && this.ak.getDouble(awk.b) > 0.0;
   }

   public void a(float $$0, exc $$1) {
      exc $$2 = b($$1, $$0, this.dE());
      this.i(this.dr().e($$2));
   }

   private static exc b(exc $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return exc.b;
      } else {
         exc $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = ayo.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = ayo.b($$2 * (float) (Math.PI / 180.0));
         return new exc($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bu() {
      return this.dO().f(this.ds(), this.dy()) ? this.dO().x(jd.a(this.dt(), this.dx(), this.dz())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.b($$3, $$4);
   }

   public void b(float $$0, float $$1) {
      this.t($$0 % 360.0F);
      this.u(ayo.a($$1, -90.0F, 90.0F) % 360.0F);
      this.O = this.dE();
      this.P = this.dG();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = ayo.a($$0, -3.0E7, 3.0E7);
      double $$4 = ayo.a($$2, -3.0E7, 3.0E7);
      this.L = $$3;
      this.M = $$1;
      this.N = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void f(exc $$0) {
      this.e($$0.c, $$0.d, $$0.e);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dE(), this.dG());
   }

   public void a(jd $$0, float $$1, float $$2) {
      this.a($$0.c(), $$1, $$2);
   }

   public void a(exc $$0, float $$1, float $$2) {
      this.b($$0.c, $$0.d, $$0.e, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.o($$0, $$1, $$2);
      this.t($$3);
      this.u($$4);
      this.bv();
      this.av();
   }

   public final void bv() {
      double $$0 = this.dt();
      double $$1 = this.dv();
      double $$2 = this.dz();
      this.L = $$0;
      this.M = $$1;
      this.N = $$2;
      this.ad = $$0;
      this.ae = $$1;
      this.af = $$2;
      this.O = this.dE();
      this.P = this.dG();
   }

   public float f(bsr $$0) {
      float $$1 = (float)(this.dt() - $$0.dt());
      float $$2 = (float)(this.dv() - $$0.dv());
      float $$3 = (float)(this.dz() - $$0.dz());
      return ayo.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dt() - $$0;
      double $$4 = this.dv() - $$1;
      double $$5 = this.dz() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(bsr $$0) {
      return this.g($$0.dm());
   }

   public double g(exc $$0) {
      double $$1 = this.dt() - $$0.c;
      double $$2 = this.dv() - $$0.d;
      double $$3 = this.dz() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cmx $$0) {
   }

   public void h(bsr $$0) {
      if (!this.y($$0)) {
         if (!$$0.ag && !this.ag) {
            double $$1 = $$0.dt() - this.dt();
            double $$2 = $$0.dz() - this.dz();
            double $$3 = ayo.a($$1, $$2);
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
               if (!this.bT() && this.bB()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.bT() && $$0.bB()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void h(exc $$0) {
      this.j($$0.c, $$0.d, $$0.e);
   }

   public void j(double $$0, double $$1, double $$2) {
      this.i(this.dr().b($$0, $$1, $$2));
      this.av = true;
   }

   protected void bw() {
      this.U = true;
   }

   public boolean a(brk $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bw();
         return false;
      }
   }

   public final exc g(float $$0) {
      return this.c(this.h($$0), this.i($$0));
   }

   public ji bx() {
      return ji.a(this.g(1.0F));
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dG() : ayo.i($$0, this.P, this.dG());
   }

   public float i(float $$0) {
      return $$0 == 1.0F ? this.dE() : ayo.i($$0, this.O, this.dE());
   }

   public final exc c(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = ayo.b($$3);
      float $$5 = ayo.a($$3);
      float $$6 = ayo.b($$2);
      float $$7 = ayo.a($$2);
      return new exc((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final exc j(float $$0) {
      return this.d(this.h($$0), this.i($$0));
   }

   protected final exc d(float $$0, float $$1) {
      return this.c($$0 - 90.0F, $$1);
   }

   public final exc by() {
      return new exc(this.dt(), this.dx(), this.dz());
   }

   public final exc k(float $$0) {
      double $$1 = ayo.d((double)$$0, this.L, this.dt());
      double $$2 = ayo.d((double)$$0, this.M, this.dv()) + (double)this.cL();
      double $$3 = ayo.d((double)$$0, this.N, this.dz());
      return new exc($$1, $$2, $$3);
   }

   public exc l(float $$0) {
      return this.k($$0);
   }

   public final exc m(float $$0) {
      double $$1 = ayo.d((double)$$0, this.L, this.dt());
      double $$2 = ayo.d((double)$$0, this.M, this.dv());
      double $$3 = ayo.d((double)$$0, this.N, this.dz());
      return new exc($$1, $$2, $$3);
   }

   public exa a(double $$0, float $$1, boolean $$2) {
      exc $$3 = this.k($$1);
      exc $$4 = this.g($$1);
      exc $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dO().a(new dcf($$3, $$5, dcf.a.b, $$2 ? dcf.b.c : dcf.b.a, this));
   }

   public boolean bz() {
      return this.bE() && this.bA();
   }

   public boolean bA() {
      return false;
   }

   public boolean bB() {
      return false;
   }

   public void a(bsr $$0, int $$1, brk $$2) {
      if ($$0 instanceof aqv) {
         an.d.a((aqv)$$0, this, $$2);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.dt() - $$0;
      double $$4 = this.dv() - $$1;
      double $$5 = this.dz() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cK().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * m;
      return $$0 < $$1 * $$1;
   }

   public boolean d(ub $$0) {
      if (this.aH != null && !this.aH.b()) {
         return false;
      } else {
         String $$1 = this.bD();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.f($$0);
            return true;
         }
      }
   }

   public boolean e(ub $$0) {
      return this.bS() ? false : this.d($$0);
   }

   public ub f(ub $$0) {
      try {
         if (this.q != null) {
            $$0.a("Pos", this.a(this.q.dt(), this.dv(), this.q.dz()));
         } else {
            $$0.a("Pos", this.a(this.dt(), this.dv(), this.dz()));
         }

         exc $$1 = this.dr();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dE(), this.dG()));
         $$0.a("FallDistance", this.ac);
         $$0.a("Fire", (short)this.aJ);
         $$0.a("Air", (short)this.cm());
         $$0.a("OnGround", this.aF());
         $$0.a("Invulnerable", this.aY);
         $$0.a("PortalCooldown", this.aX);
         $$0.a("UUID", this.cz());
         wz $$2 = this.aj();
         if ($$2 != null) {
            $$0.a("CustomName", wz.a.a($$2, this.dQ()));
         }

         if (this.cE()) {
            $$0.a("CustomNameVisible", this.cE());
         }

         if (this.aX()) {
            $$0.a("Silent", this.aX());
         }

         if (this.aY()) {
            $$0.a("NoGravity", this.aY());
         }

         if (this.aZ) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.cn();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.cn());
         }

         if (this.bi) {
            $$0.a("HasVisualFire", this.bi);
         }

         if (!this.ba.isEmpty()) {
            uh $$4 = new uh();

            for (String $$5 : this.ba) {
               $$4.add(uw.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bT()) {
            uh $$6 = new uh();

            for (bsr $$7 : this.cS()) {
               ub $$8 = new ub();
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
         throw new z($$10);
      }
   }

   public void g(ub $$0) {
      try {
         uh $$1 = $$0.c("Pos", 6);
         uh $$2 = $$0.c("Motion", 6);
         uh $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.n(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.o(ayo.a($$1.h(0), -3.0000512E7, 3.0000512E7), ayo.a($$1.h(1), -2.0E7, 2.0E7), ayo.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.t($$3.i(0));
         this.u($$3.i(1));
         this.bv();
         this.o(this.dE());
         this.p(this.dE());
         this.ac = $$0.j("FallDistance");
         this.aJ = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.j($$0.g("Air"));
         }

         this.aG = $$0.q("OnGround");
         this.aY = $$0.q("Invulnerable");
         this.aX = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.ax = $$0.a("UUID");
            this.ay = this.ax.toString();
         }

         if (!Double.isFinite(this.dt()) || !Double.isFinite(this.dv()) || !Double.isFinite(this.dz())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dE()) && Double.isFinite((double)this.dG())) {
            this.av();
            this.a(this.dE(), this.dG());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(wz.a.a($$8, this.dQ()));
               } catch (Exception var16) {
                  b.warn("Failed to parse entity custom name {}", $$8, var16);
               }
            }

            this.p($$0.q("CustomNameVisible"));
            this.e($$0.q("Silent"));
            this.f($$0.q("NoGravity"));
            this.j($$0.q("Glowing"));
            this.k($$0.h("TicksFrozen"));
            this.bi = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.ba.clear();
               uh $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.ba.add($$10.j($$12));
               }
            }

            this.a($$0);
            if (this.bC()) {
               this.av();
            }
         } else {
            throw new IllegalStateException("Entity has invalid rotation");
         }
      } catch (Throwable var17) {
         o $$14 = o.a(var17, "Loading entity NBT");
         p $$15 = $$14.a("Entity being loaded");
         this.a($$15);
         throw new z($$14);
      }
   }

   protected boolean bC() {
      return true;
   }

   @Nullable
   protected final String bD() {
      bsx<?> $$0 = this.am();
      akr $$1 = bsx.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(ub var1);

   protected abstract void b(ub var1);

   protected uh a(double... $$0) {
      uh $$1 = new uh();

      for (double $$2 : $$0) {
         $$1.add(uc.a($$2));
      }

      return $$1;
   }

   protected uh a(float... $$0) {
      uh $$1 = new uh();

      for (float $$2 : $$0) {
         $$1.add(ue.a($$2));
      }

      return $$1;
   }

   @Nullable
   public cjh a(dcv $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public cjh a(dcv $$0, int $$1) {
      return this.a(new cuq($$0), (float)$$1);
   }

   @Nullable
   public cjh b(cuq $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public cjh a(cuq $$0, float $$1) {
      if ($$0.e()) {
         return null;
      } else if (this.dO().B) {
         return null;
      } else {
         cjh $$2 = new cjh(this.dO(), this.dt(), this.dv() + (double)$$1, this.dz(), $$0);
         $$2.v();
         this.dO().b($$2);
         return $$2;
      }
   }

   public boolean bE() {
      return !this.dJ();
   }

   public boolean bF() {
      if (this.ag) {
         return false;
      } else {
         float $$0 = this.bd.a() * 0.8F;
         ewx $$1 = ewx.a(this.by(), (double)$$0, 1.0E-6, (double)$$0);
         return jd.a($$1)
            .anyMatch(
               $$1x -> {
                  dtc $$2 = this.dO().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dO(), $$1x)
                     && exs.c($$2.k(this.dO(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), exs.a($$1), exg.i);
               }
            );
      }
   }

   public bqr a(cmx $$0, bqq $$1) {
      if (this.bE() && this instanceof btk $$2) {
         if ($$2.A() == $$0) {
            $$2.a(true, !$$0.fL());
            this.a(dxz.r, $$0);
            return bqr.a(this.dO().B);
         }

         cuq $$3 = $$0.b($$1);
         if ($$3.a(cut.uK) && $$2.q()) {
            $$2.b($$0, true);
            $$3.h(1);
            return bqr.a(this.dO().B);
         }
      }

      return bqr.e;
   }

   public boolean i(bsr $$0) {
      return $$0.bG() && !this.y($$0);
   }

   public boolean bG() {
      return false;
   }

   public void u() {
      this.i(exc.b);
      this.l();
      if (this.bS()) {
         this.dc().j(this);
      }
   }

   public final void j(bsr $$0) {
      if (this.x($$0)) {
         this.a($$0, bsr::a_);
      }
   }

   protected void a(bsr $$0, bsr.a $$1) {
      exc $$2 = this.m($$0);
      exc $$3 = $$0.l(this);
      $$1.accept($$0, $$2.c - $$3.c, $$2.d - $$3.d, $$2.e - $$3.e);
   }

   public void k(bsr $$0) {
   }

   public exc l(bsr $$0) {
      return this.dl().b(bss.b, 0, this.aD);
   }

   public exc m(bsr $$0) {
      return this.dm().e(this.a($$0, this.bd, 1.0F));
   }

   protected exc a(bsr $$0, bsu $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static exc a(bsr $$0, bsr $$1, bst $$2) {
      int $$3 = $$0.cS().indexOf($$1);
      return $$2.c(bss.a, $$3, $$0.aD);
   }

   public boolean n(bsr $$0) {
      return this.a($$0, false);
   }

   public boolean bH() {
      return this instanceof btn;
   }

   public boolean a(bsr $$0, boolean $$1) {
      if ($$0 == this.q) {
         return false;
      } else if (!$$0.bK()) {
         return false;
      } else {
         for (bsr $$2 = $$0; $$2.q != null; $$2 = $$2.q) {
            if ($$2.q == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bS()) {
               this.ad();
            }

            this.b(bua.a);
            this.q = $$0;
            this.q.p(this);
            $$0.J().filter($$0x -> $$0x instanceof aqv).forEach($$0x -> an.U.a((aqv)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bsr $$0) {
      return !this.bW() && this.K <= 0;
   }

   public void bI() {
      for (int $$0 = this.p.size() - 1; $$0 >= 0; $$0--) {
         ((bsr)this.p.get($$0)).ad();
      }
   }

   public void bJ() {
      if (this.q != null) {
         bsr $$0 = this.q;
         this.q = null;
         $$0.q(this);
      }
   }

   public void ad() {
      this.bJ();
   }

   protected void p(bsr $$0) {
      if ($$0.dc() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.p.isEmpty()) {
            this.p = ImmutableList.of($$0);
         } else {
            List<bsr> $$1 = Lists.newArrayList(this.p);
            if (!this.dO().B && $$0 instanceof cmx && !(this.cT() instanceof cmx)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.p = ImmutableList.copyOf($$1);
         }

         this.a(dxz.s, $$0);
      }
   }

   protected void q(bsr $$0) {
      if ($$0.dc() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.p.size() == 1 && this.p.get(0) == $$0) {
            this.p = ImmutableList.of();
         } else {
            this.p = this.p.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.K = 60;
         this.a(dxz.q, $$0);
      }
   }

   protected boolean r(bsr $$0) {
      return this.p.isEmpty();
   }

   protected boolean bK() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public double c_() {
      return this.dt();
   }

   public double d_() {
      return this.dv();
   }

   public double P_() {
      return this.dz();
   }

   public float Q_() {
      return this.dG();
   }

   public float e_() {
      return this.dE();
   }

   public void a(float $$0, int $$1) {
      this.o($$0);
   }

   public float bL() {
      return 0.0F;
   }

   public exc bM() {
      return this.c(this.dG(), this.dE());
   }

   public exc a(cul $$0) {
      if (!(this instanceof cmx $$1)) {
         return exc.b;
      } else {
         boolean $$2 = $$1.eU().a($$0) && !$$1.eT().a($$0);
         btg $$3 = $$2 ? $$1.fq().e() : $$1.fq();
         return this.c(0.0F, this.dE() + (float)($$3 == btg.b ? 80 : -80)).a(0.5);
      }
   }

   public exb bN() {
      return new exb(this.dG(), this.dE());
   }

   public exc bO() {
      return exc.a(this.bN());
   }

   public void a(dlr $$0, jd $$1) {
      if (this.aA()) {
         this.ay();
      } else {
         if (this.aw != null && this.aw.a($$0)) {
            this.aw.a($$1.j());
            this.aw.a(true);
         } else {
            this.aw = new btz($$0, $$1.j());
         }
      }
   }

   protected void bP() {
      if (this.dO() instanceof aqu $$0) {
         this.M();
         if (this.aw != null) {
            if (this.aw.a($$0, this, this.o(false))) {
               $$0.ag().a("portal");
               this.ay();
               eqc $$2 = this.aw.a($$0, this);
               if ($$2 != null) {
                  aqu $$3 = $$2.a();
                  if ($$0.o().a((dcw)$$3) && ($$3.af() == $$0.af() || this.a($$0, $$3))) {
                     this.a($$2);
                  }
               }

               $$0.ag().c();
            } else if (this.aw.b()) {
               this.aw = null;
            }
         }
      }
   }

   public int bQ() {
      bsr $$0 = this.cT();
      return $$0 instanceof aqv ? $$0.bQ() : 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
   }

   public void c(brk $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            djs.a(this);
      }
   }

   public void n(float $$0) {
   }

   public boolean bR() {
      boolean $$0 = this.dO() != null && this.dO().B;
      return !this.be() && (this.aJ > 0 || $$0 && this.i(0));
   }

   public boolean bS() {
      return this.dc() != null;
   }

   public boolean bT() {
      return !this.p.isEmpty();
   }

   public boolean bU() {
      return this.am().a(awi.p);
   }

   public boolean bV() {
      return !this.am().a(awi.q);
   }

   public void g(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean bW() {
      return this.i(1);
   }

   public boolean bX() {
      return this.bW();
   }

   public boolean bY() {
      return this.bW();
   }

   public boolean bZ() {
      return this.bW();
   }

   public boolean ca() {
      return this.bW();
   }

   public boolean cb() {
      return this.c(bua.f);
   }

   public boolean cc() {
      return this.i(3);
   }

   public void h(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean cd() {
      return this.i(4);
   }

   public boolean ce() {
      return this.c(bua.d);
   }

   public boolean cf() {
      return this.ce() && !this.bf();
   }

   public void i(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cg() {
      return this.aZ;
   }

   public final void j(boolean $$0) {
      this.aZ = $$0;
      this.b(6, this.ch());
   }

   public boolean ch() {
      return this.dO().x_() ? this.i(6) : this.aZ;
   }

   public boolean ci() {
      return this.i(5);
   }

   public boolean d(cmx $$0) {
      if ($$0.R_()) {
         return false;
      } else {
         eyi $$1 = this.ck();
         return $$1 != null && $$0 != null && $$0.ck() == $$1 && $$1.i() ? false : this.ci();
      }
   }

   public boolean cj() {
      return false;
   }

   public void a(BiConsumer<dxw<?>, aqu> $$0) {
   }

   @Nullable
   public eyb ck() {
      return this.dO().M().e(this.cB());
   }

   public boolean s(bsr $$0) {
      return this.a($$0.ck());
   }

   public boolean a(eyi $$0) {
      return this.ck() != null ? this.ck().a($$0) : false;
   }

   public void k(boolean $$0) {
      this.b(5, $$0);
   }

   protected boolean i(int $$0) {
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

   public int cl() {
      return 300;
   }

   public int cm() {
      return this.ao.a(aP);
   }

   public void j(int $$0) {
      this.ao.a(aP, $$0);
   }

   public int cn() {
      return this.ao.a(aU);
   }

   public void k(int $$0) {
      this.ao.a(aU, $$0);
   }

   public float co() {
      int $$0 = this.cq();
      return (float)Math.min(this.cn(), $$0) / (float)$$0;
   }

   public boolean cp() {
      return this.cn() >= this.cq();
   }

   public int cq() {
      return 140;
   }

   public void a(aqu $$0, btm $$1) {
      this.h(this.aJ + 1);
      if (this.aJ == 0) {
         this.d(8.0F);
      }

      this.a(this.dP().c(), 5.0F);
   }

   public void l(boolean $$0) {
      exc $$1 = this.dr();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.n($$1.c, $$2, $$1.e);
   }

   public void m(boolean $$0) {
      exc $$1 = this.dr();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.n($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(aqu $$0, btn $$1) {
      return true;
   }

   public void cr() {
      if (this.dr().b() > -0.5 && this.ac > 1.0F) {
         this.ac = 1.0F;
      }
   }

   public void n() {
      this.ac = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      jd $$3 = jd.a($$0, $$1, $$2);
      exc $$4 = new exc($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      jd.a $$5 = new jd.a();
      ji $$6 = ji.b;
      double $$7 = Double.MAX_VALUE;

      for (ji $$8 : new ji[]{ji.c, ji.d, ji.e, ji.f, ji.b}) {
         $$5.a($$3, $$8);
         if (!this.dO().a_($$5).r(this.dO(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == ji.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ah.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      exc $$13 = this.dr().a(0.75);
      if ($$6.o() == ji.a.a) {
         this.n((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == ji.a.b) {
         this.n($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == ji.a.c) {
         this.n($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dtc $$0, exc $$1) {
      this.n();
      this.V = $$1;
   }

   private static wz c(wz $$0) {
      xn $$1 = $$0.e().b($$0.a().a(null));

      for (wz $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public wz ah() {
      wz $$0 = this.aj();
      return $$0 != null ? c($$0) : this.cs();
   }

   protected wz cs() {
      return this.n.h();
   }

   public boolean t(bsr $$0) {
      return this == $$0;
   }

   public float ct() {
      return 0.0F;
   }

   public void o(float $$0) {
   }

   public void p(float $$0) {
   }

   public boolean cu() {
      return true;
   }

   public boolean u(bsr $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dO() == null ? "~NULL~" : this.dO().toString();
      return this.aH != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.ah().getString(),
            this.o,
            $$0,
            this.dt(),
            this.dv(),
            this.dz(),
            this.aH
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.ah().getString(),
            this.o,
            $$0,
            this.dt(),
            this.dv(),
            this.dz()
         );
   }

   public boolean b(brk $$0) {
      return this.dJ() || this.aY && !$$0.a(awg.d) && !$$0.h() || $$0.a(awg.i) && this.be() || $$0.a(awg.m) && this.am().a(awi.o);
   }

   public boolean cv() {
      return this.aY;
   }

   public void n(boolean $$0) {
      this.aY = $$0;
   }

   public void v(bsr $$0) {
      this.b($$0.dt(), $$0.dv(), $$0.dz(), $$0.dE(), $$0.dG());
   }

   public void w(bsr $$0) {
      ub $$1 = $$0.f(new ub());
      $$1.r("Dimension");
      this.g($$1);
      this.aX = $$0.aX;
      this.aw = $$0.aw;
   }

   @Nullable
   public bsr a(eqc $$0) {
      if (this.dO() instanceof aqu $$1 && !this.dJ()) {
         aqu $$3 = $$0.a();
         List<bsr> $$4 = this.cS();
         this.ak();
         List<bsr> $$5 = new ArrayList<>();

         for (bsr $$6 : $$4) {
            bsr $$7 = $$6.a($$0);
            if ($$7 != null) {
               $$5.add($$7);
            }
         }

         $$1.ag().a("changeDimension");
         bsr $$8 = $$3.af() == $$1.af() ? this : this.am().a((dcw)$$3);
         if ($$8 != null) {
            if (this != $$8) {
               $$8.w(this);
               this.cw();
            }

            $$8.b($$0.b().c, $$0.b().d, $$0.b().e, $$0.d(), $$8.dG());
            $$8.i($$0.c());
            if (this != $$8) {
               $$3.d($$8);
            }

            for (bsr $$9 : $$5) {
               $$9.a($$8, true);
            }

            $$1.h();
            $$3.h();
            $$0.g().onTransition($$8);
         }

         $$1.ag().c();
         return $$8;
      }

      return null;
   }

   public void f(jd $$0) {
      if (this.dO() instanceof aqu $$1) {
         $$1.l().a(aqz.e, new dcd($$0), 3, $$0);
      }
   }

   protected void cw() {
      this.b(bsr.c.e);
      if (this instanceof btk $$0) {
         $$0.a(true, false);
      }
   }

   public exc a(ji.a $$0, l.a $$1) {
      return eqe.a($$1, $$0, this.dm(), this.a(this.at()));
   }

   public boolean o(boolean $$0) {
      return ($$0 || !this.bS()) && this.bE();
   }

   public boolean a(dcw $$0, dcw $$1) {
      return true;
   }

   public float a(dco $$0, dcc $$1, jd $$2, dtc $$3, epe $$4, float $$5) {
      return $$5;
   }

   public boolean a(dco $$0, dcc $$1, jd $$2, dtc $$3, float $$4) {
      return true;
   }

   public int cx() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bsx.a(this.am()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.o);
      $$0.a("Entity Name", () -> this.ah().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dt(), this.dv(), this.dz()));
      $$0.a("Entity's Block location", p.a(this.dO(), ayo.a(this.dt()), ayo.a(this.dv()), ayo.a(this.dz())));
      exc $$1 = this.dr();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", () -> this.cS().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.dc()));
   }

   public boolean cy() {
      return this.bR() && !this.R_();
   }

   public void a_(UUID $$0) {
      this.ax = $$0;
      this.ay = this.ax.toString();
   }

   @Override
   public UUID cz() {
      return this.ax;
   }

   public String cA() {
      return this.ay;
   }

   @Override
   public String cB() {
      return this.ay;
   }

   public boolean cC() {
      return true;
   }

   public static double cD() {
      return m;
   }

   public static void b(double $$0) {
      m = $$0;
   }

   @Override
   public wz S_() {
      return eyb.a(this.ck(), this.ah()).a($$0 -> $$0.a(this.cJ()).a(this.cA()));
   }

   public void b(@Nullable wz $$0) {
      this.ao.a(aQ, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public wz aj() {
      return this.ao.a(aQ).orElse(null);
   }

   @Override
   public boolean ai() {
      return this.ao.a(aQ).isPresent();
   }

   public void p(boolean $$0) {
      this.ao.a(aR, $$0);
   }

   public boolean cE() {
      return this.ao.a(aR);
   }

   public boolean a(aqu $$0, double $$1, double $$2, double $$3, Set<buc> $$4, float $$5, float $$6) {
      float $$7 = ayo.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dO()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.I();
         this.o($$5);
      } else {
         this.ak();
         bsr $$8 = this.am().a((dcw)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.o($$5);
         this.b(bsr.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dO() instanceof aqu) {
         this.b($$0, $$1, $$2, this.dE(), this.dG());
         this.I();
      }
   }

   private void I() {
      this.cU().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.p.iterator();

         while (var1.hasNext()) {
            bsr $$1 = (bsr)var1.next();
            $$0.a($$1, bsr::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.dt() + $$0, this.dv() + $$1, this.dz() + $$2);
   }

   public boolean cF() {
      return this.cE();
   }

   @Override
   public void a(List<aka.c<?>> $$0) {
   }

   @Override
   public void a(ajw<?> $$0) {
      if (at.equals($$0)) {
         this.i_();
      }
   }

   @Deprecated
   protected void cG() {
      bua $$0 = this.at();
      bsu $$1 = this.a($$0);
      this.bd = $$1;
      this.be = $$1.c();
   }

   public void i_() {
      bsu $$0 = this.bd;
      bua $$1 = this.at();
      bsu $$2 = this.a($$1);
      this.bd = $$2;
      this.be = $$2.c();
      this.av();
      boolean $$3 = (double)$$2.a() <= 4.0 && (double)$$2.b() <= 4.0;
      if (!this.r.B && !this.an && !this.ag && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cmx)) {
         this.a($$0);
      }
   }

   public boolean a(bsu $$0) {
      bsu $$1 = this.a(this.at());
      exc $$2 = this.dm().b(0.0, (double)$$0.b() / 2.0, 0.0);
      double $$3 = (double)Math.max(0.0F, $$1.a() - $$0.a()) + 1.0E-6;
      double $$4 = (double)Math.max(0.0F, $$1.b() - $$0.b()) + 1.0E-6;
      exv $$5 = exs.a(ewx.a($$2, $$3, $$4, $$3));
      Optional<exc> $$6 = this.r.a(this, $$5, $$2, (double)$$1.a(), (double)$$1.b(), (double)$$1.a());
      if ($$6.isPresent()) {
         this.c($$6.get().b(0.0, (double)(-$$1.b()) / 2.0, 0.0));
         return true;
      } else {
         if ($$1.a() > $$0.a() && $$1.b() > $$0.b()) {
            exv $$7 = exs.a(ewx.a($$2, $$3, 1.0E-6, $$3));
            Optional<exc> $$8 = this.r.a(this, $$7, $$2, (double)$$1.a(), (double)$$0.b(), (double)$$1.a());
            if ($$8.isPresent()) {
               this.c($$8.get().b(0.0, (double)(-$$0.b()) / 2.0 + 1.0E-6, 0.0));
               return true;
            }
         }

         return false;
      }
   }

   public ji cH() {
      return ji.a((double)this.dE());
   }

   public ji cI() {
      return this.cH();
   }

   protected xf cJ() {
      return new xf(xf.a.c, new xf.b(this.am(), this.cz(), this.ah()));
   }

   public boolean a(aqv $$0) {
      return true;
   }

   @Override
   public final ewx cK() {
      return this.aF;
   }

   public ewx h_() {
      return this.cK();
   }

   public final void a(ewx $$0) {
      this.aF = $$0;
   }

   public final float d(bua $$0) {
      return this.a($$0).c();
   }

   public final float cL() {
      return this.be;
   }

   public exc q(float $$0) {
      return this.cM();
   }

   protected exc cM() {
      return new exc(0.0, (double)this.cL(), (double)(this.dj() * 0.4F));
   }

   public bug a_(int $$0) {
      return bug.a;
   }

   @Override
   public void a(wz $$0) {
   }

   public dcw cN() {
      return this.dO();
   }

   @Nullable
   public MinecraftServer cO() {
      return this.dO().o();
   }

   public bqr a(cmx $$0, exc $$1, bqq $$2) {
      return bqr.e;
   }

   public boolean a(dco $$0) {
      return false;
   }

   public void d(aqv $$0) {
   }

   public void e(aqv $$0) {
   }

   public float a(dmm $$0) {
      float $$1 = ayo.g(this.dE());
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

   public float a(dkv $$0) {
      float $$1 = ayo.g(this.dE());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public boolean cP() {
      return false;
   }

   public cnq a(cnp $$0) {
      return this.am().a(awi.r) ? cnq.b : cnq.a;
   }

   @Nullable
   public btn cQ() {
      return null;
   }

   public final boolean cR() {
      return this.cQ() != null;
   }

   public final List<bsr> cS() {
      return this.p;
   }

   @Nullable
   public bsr cT() {
      return this.p.isEmpty() ? null : (bsr)this.p.get(0);
   }

   public boolean x(bsr $$0) {
      return this.p.contains($$0);
   }

   public boolean a(Predicate<bsr> $$0) {
      UnmodifiableIterator var2 = this.p.iterator();

      while (var2.hasNext()) {
         bsr $$1 = (bsr)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bsr> J() {
      return this.p.stream().flatMap(bsr::cU);
   }

   @Override
   public Stream<bsr> cU() {
      return Stream.concat(Stream.of(this), this.J());
   }

   @Override
   public Stream<bsr> cV() {
      return Stream.concat(this.p.stream().flatMap(bsr::cV), Stream.of(this));
   }

   public Iterable<bsr> cW() {
      return () -> this.J().iterator();
   }

   public int cX() {
      return (int)this.J().filter($$0 -> $$0 instanceof cmx).count();
   }

   public boolean cY() {
      return this.cX() == 1;
   }

   public bsr cZ() {
      bsr $$0 = this;

      while ($$0.bS()) {
         $$0 = $$0.dc();
      }

      return $$0;
   }

   public boolean y(bsr $$0) {
      return this.cZ() == $$0.cZ();
   }

   public boolean z(bsr $$0) {
      if (!$$0.bS()) {
         return false;
      } else {
         bsr $$1 = $$0.dc();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean da() {
      return this.cQ() instanceof cmx $$0 ? $$0.g() : this.db();
   }

   public boolean db() {
      return !this.dO().B;
   }

   protected static exc a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -ayo.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = ayo.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new exc((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public exc b(btn $$0) {
      return new exc(this.dt(), this.cK().e, this.dz());
   }

   @Nullable
   public bsr dc() {
      return this.q;
   }

   @Nullable
   public bsr dd() {
      return this.q != null && this.q.cQ() == this ? this.q : null;
   }

   public epj j_() {
      return epj.a;
   }

   public avq de() {
      return avq.g;
   }

   protected int df() {
      return 1;
   }

   public et dg() {
      return new et(
         this, this.dm(), this.bN(), this.dO() instanceof aqu ? (aqu)this.dO() : null, this.G(), this.ah().getString(), this.S_(), this.dO().o(), this
      );
   }

   protected int G() {
      return 0;
   }

   public boolean l(int $$0) {
      return this.G() >= $$0;
   }

   @Override
   public boolean k_() {
      return this.dO().ab().b(dcs.p);
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public boolean M_() {
      return true;
   }

   public void a(ff.a $$0, exc $$1) {
      exc $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.u(ayo.g((float)(-(ayo.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.t(ayo.g((float)(ayo.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.o(this.dE());
      this.P = this.dG();
      this.O = this.dE();
   }

   public float r(float $$0) {
      return ayo.i($$0, this.O, this.aD);
   }

   public boolean a(awu<epd> $$0, double $$1) {
      if (this.dh()) {
         return false;
      } else {
         ewx $$2 = this.cK().h(0.001);
         int $$3 = ayo.a($$2.a);
         int $$4 = ayo.c($$2.d);
         int $$5 = ayo.a($$2.b);
         int $$6 = ayo.c($$2.e);
         int $$7 = ayo.a($$2.c);
         int $$8 = ayo.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cC();
         boolean $$11 = false;
         exc $$12 = exc.b;
         int $$13 = 0;
         jd.a $$14 = new jd.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  epe $$18 = this.dO().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((dcc)this.dO(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           exc $$20 = $$18.c(this.dO(), $$14);
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

            if (!(this instanceof cmx)) {
               $$12 = $$12.d();
            }

            exc $$21 = this.dr();
            $$12 = $$12.a($$1);
            double $$22 = 0.003;
            if (Math.abs($$21.c) < 0.003 && Math.abs($$21.e) < 0.003 && $$12.f() < 0.0045000000000000005) {
               $$12 = $$12.d().a(0.0045000000000000005);
            }

            this.i(this.dr().e($$12));
         }

         this.ak.put($$0, $$9);
         return $$11;
      }
   }

   public boolean dh() {
      ewx $$0 = this.cK().g(1.0);
      int $$1 = ayo.a($$0.a);
      int $$2 = ayo.c($$0.d);
      int $$3 = ayo.a($$0.c);
      int $$4 = ayo.c($$0.f);
      return !this.dO().b($$1, $$3, $$2, $$4);
   }

   public double b(awu<epd> $$0) {
      return this.ak.getDouble($$0);
   }

   public double di() {
      return (double)this.cL() < 0.4 ? 0.0 : 0.4;
   }

   public final float dj() {
      return this.bd.a();
   }

   public final float dk() {
      return this.bd.b();
   }

   public zg<abu> a(aqt $$0) {
      return new abv(this, $$0);
   }

   public bsu a(bua $$0) {
      return this.n.n();
   }

   public final bst dl() {
      return this.bd.d();
   }

   public exc dm() {
      return this.s;
   }

   public exc dn() {
      return this.dm();
   }

   @Override
   public jd do() {
      return this.t;
   }

   public dtc dp() {
      if (this.bj == null) {
         this.bj = this.dO().a_(this.do());
      }

      return this.bj;
   }

   public dcd dq() {
      return this.u;
   }

   public exc dr() {
      return this.v;
   }

   public void i(exc $$0) {
      this.v = $$0;
   }

   public void j(exc $$0) {
      this.i(this.dr().e($$0));
   }

   public void n(double $$0, double $$1, double $$2) {
      this.i(new exc($$0, $$1, $$2));
   }

   public final int ds() {
      return this.t.u();
   }

   public final double dt() {
      return this.s.c;
   }

   public double c(double $$0) {
      return this.s.c + (double)this.dj() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ah.j() - 1.0) * $$0);
   }

   public final int du() {
      return this.t.v();
   }

   public final double dv() {
      return this.s.d;
   }

   public double e(double $$0) {
      return this.s.d + (double)this.dk() * $$0;
   }

   public double dw() {
      return this.e(this.ah.j());
   }

   public double dx() {
      return this.s.d + (double)this.be;
   }

   public final int dy() {
      return this.t.w();
   }

   public final double dz() {
      return this.s.e;
   }

   public double f(double $$0) {
      return this.s.e + (double)this.dj() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ah.j() - 1.0) * $$0);
   }

   public final void o(double $$0, double $$1, double $$2) {
      if (this.s.c != $$0 || this.s.d != $$1 || this.s.e != $$2) {
         this.s = new exc($$0, $$1, $$2);
         int $$3 = ayo.a($$0);
         int $$4 = ayo.a($$1);
         int $$5 = ayo.a($$2);
         if ($$3 != this.t.u() || $$4 != this.t.v() || $$5 != this.t.w()) {
            this.t = new jd($$3, $$4, $$5);
            this.bj = null;
            if (kf.a($$3) != this.u.e || kf.a($$5) != this.u.f) {
               this.u = new dcd(this.t);
            }
         }

         this.aV.a();
      }
   }

   public void dA() {
   }

   public exc s(float $$0) {
      return this.m($$0).b(0.0, (double)this.be * 0.7, 0.0);
   }

   public void a(abv $$0) {
      int $$1 = $$0.b();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      double $$4 = $$0.i();
      this.f($$2, $$3, $$4);
      this.e($$2, $$3, $$4);
      this.u($$0.m());
      this.t($$0.n());
      this.e($$1);
      this.a_($$0.e());
   }

   @Nullable
   public cuq dB() {
      return null;
   }

   public void q(boolean $$0) {
      this.az = $$0;
   }

   public boolean dC() {
      return !this.am().a(awi.k);
   }

   public boolean dD() {
      return (this.az || this.aA) && this.dC();
   }

   public float dE() {
      return this.aD;
   }

   public float dF() {
      return this.dE();
   }

   public void t(float $$0) {
      if (!Float.isFinite($$0)) {
         ad.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aD = $$0;
      }
   }

   public float dG() {
      return this.aE;
   }

   public void u(float $$0) {
      if (!Float.isFinite($$0)) {
         ad.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aE = $$0;
      }
   }

   public boolean dH() {
      return false;
   }

   public float dI() {
      return 0.0F;
   }

   public void a(@Nullable bsr $$0) {
   }

   public final boolean dJ() {
      return this.aH != null;
   }

   @Nullable
   public bsr.c dK() {
      return this.aH;
   }

   @Override
   public final void b(bsr.c $$0) {
      if (this.aH == null) {
         this.aH = $$0;
      }

      if (this.aH.a()) {
         this.ad();
      }

      this.cS().forEach(bsr::ad);
      this.aV.a($$0);
   }

   protected void dL() {
      this.aH = null;
   }

   @Override
   public void a(dxh $$0) {
      this.aV = $$0;
   }

   @Override
   public boolean dM() {
      if (this.aH != null && !this.aH.b()) {
         return false;
      } else {
         return this.bS() ? false : !this.bT() || !this.cY();
      }
   }

   @Override
   public boolean dN() {
      return false;
   }

   public boolean a(dcw $$0, jd $$1) {
      return true;
   }

   public dcw dO() {
      return this.r;
   }

   protected void a(dcw $$0) {
      this.r = $$0;
   }

   public brl dP() {
      return this.dO().aj();
   }

   public ka dQ() {
      return this.dO().H_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = ayo.d($$6, this.dt(), $$1);
      double $$8 = ayo.d($$6, this.dv(), $$2);
      double $$9 = ayo.d($$6, this.dz(), $$3);
      float $$10 = (float)ayo.e($$6, (double)this.dE(), $$4);
      float $$11 = (float)ayo.d($$6, (double)this.dG(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   public ayw dR() {
      return this.ah;
   }

   public exc ag() {
      if (this.cQ() instanceof cmx $$0 && this.bE()) {
         return $$0.ag();
      }

      return this.dr();
   }

   @Nullable
   public cuq dS() {
      return null;
   }

   @FunctionalInterface
   public interface a {
      void accept(bsr var1, double var2, double var4, double var6);
   }

   public static enum b {
      a(false, false),
      b(true, false),
      c(false, true),
      d(true, true);

      final boolean e;
      final boolean f;

      private b(final boolean $$0, final boolean $$1) {
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

      private c(final boolean $$0, final boolean $$1) {
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
