import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
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
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
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

public abstract class btz implements akn, bsb, dzh, eu, fal {
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
   private static final ezc d = new ezc(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double e = 0.014;
   private static final double k = 0.007;
   private static final double l = 0.0023333333333333335;
   public static final String I = "UUID";
   private static double m = 1.0;
   private final bug<?> n;
   private int o = c.incrementAndGet();
   public boolean J;
   private ImmutableList<btz> p = ImmutableList.of();
   protected int K;
   @Nullable
   private btz q;
   private dev r;
   public double L;
   public double M;
   public double N;
   private ezh s;
   private jg t;
   private deb u;
   private ezh v = ezh.c;
   private float az;
   private float aA;
   public float O;
   public float P;
   private ezc aB = d;
   private boolean aC;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   public boolean U;
   protected ezh V = ezh.c;
   @Nullable
   private btz.c aD;
   public static final float W = 0.6F;
   public static final float X = 1.8F;
   public float Y;
   public float Z;
   public float aa;
   private float aE = 1.0F;
   public double ab;
   public double ac;
   public double ad;
   public boolean ae;
   protected final azr af = azr.a();
   public int ag;
   private int aF = -this.do();
   protected boolean ah;
   protected Object2DoubleMap<axp<erd>> ai = new Object2DoubleArrayMap(2);
   protected boolean aj;
   private final Set<axp<erd>> aG = new HashSet<>();
   public int ak;
   protected boolean al = true;
   protected final ako am;
   protected static final akk<Byte> an = ako.a(btz.class, akm.a);
   protected static final int ao = 0;
   private static final int aH = 1;
   private static final int aI = 3;
   private static final int aJ = 4;
   private static final int aK = 5;
   protected static final int ap = 6;
   protected static final int aq = 7;
   private static final akk<Integer> aL = ako.a(btz.class, akm.b);
   private static final akk<Optional<xh>> aM = ako.a(btz.class, akm.g);
   private static final akk<Boolean> aN = ako.a(btz.class, akm.k);
   private static final akk<Boolean> aO = ako.a(btz.class, akm.k);
   private static final akk<Boolean> aP = ako.a(btz.class, akm.k);
   protected static final akk<bvh> ar = ako.a(btz.class, akm.w);
   private static final akk<Integer> aQ = ako.a(btz.class, akm.b);
   private dzi aR = dzi.a;
   private final aiu aS = new aiu();
   public boolean as;
   @Nullable
   public bvg at;
   private int aT;
   private boolean aU;
   protected UUID au = azj.a(this.af);
   protected String av = this.au.toString();
   private boolean aV;
   private final Set<String> aW = Sets.newHashSet();
   private final double[] aX = new double[]{0.0, 0.0, 0.0};
   private long aY;
   private buc aZ;
   private float ba;
   public boolean aw;
   public boolean ax;
   public Optional<jg> ay = Optional.empty();
   private boolean bb = false;
   private float bc;
   private int bd;
   private boolean be;
   @Nullable
   private dvd bf = null;
   private final Set<dvd> bg = new ReferenceArraySet();

   public btz(bug<?> $$0, dev $$1) {
      this.n = $$0;
      this.r = $$1;
      this.aZ = $$0.n();
      this.s = ezh.c;
      this.t = jg.c;
      this.u = deb.b;
      ako.a $$2 = new ako.a(this);
      $$2.a(an, (byte)0);
      $$2.a(aL, this.ct());
      $$2.a(aN, false);
      $$2.a(aM, Optional.empty());
      $$2.a(aO, false);
      $$2.a(aP, false);
      $$2.a(ar, bvh.a);
      $$2.a(aQ, 0);
      this.a($$2);
      this.am = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.ba = this.aZ.c();
   }

   public boolean a(jg $$0, dvd $$1) {
      fab $$2 = $$1.b(this.dX(), $$0, ezm.a(this));
      fab $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return ezy.c($$3, ezy.a(this.cS()), ezl.i);
   }

   public int i_() {
      fao $$0 = this.cs();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean R_() {
      return false;
   }

   public final void ao() {
      if (this.cb()) {
         this.bQ();
      }

      if (this.ca()) {
         this.af();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.aS.e(new ezh($$0, $$1, $$2));
   }

   public aiu ap() {
      return this.aS;
   }

   public bug<?> aq() {
      return this.n;
   }

   @Override
   public int ar() {
      return this.o;
   }

   public void e(int $$0) {
      this.o = $$0;
   }

   public Set<String> as() {
      return this.aW;
   }

   public boolean a(String $$0) {
      return this.aW.size() >= 1024 ? false : this.aW.add($$0);
   }

   public boolean b(String $$0) {
      return this.aW.remove($$0);
   }

   public void at() {
      this.a(btz.c.a);
      this.a(eaa.p);
   }

   public final void au() {
      this.a(btz.c.b);
   }

   protected abstract void a(ako.a var1);

   public ako av() {
      return this.am;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof btz ? ((btz)$$0).o == this.o : false;
   }

   @Override
   public int hashCode() {
      return this.o;
   }

   public void a(btz.c $$0) {
      this.b($$0);
   }

   public void aw() {
   }

   public void b(bvh $$0) {
      this.am.a(ar, $$0);
   }

   public bvh ax() {
      return this.am.a(ar);
   }

   public boolean c(bvh $$0) {
      return this.ax() == $$0;
   }

   public boolean a(btz $$0, double $$1) {
      return this.dv().a((jz)$$0.dv(), $$1);
   }

   public boolean a(btz $$0, double $$1, double $$2) {
      double $$3 = $$0.dC() - this.dC();
      double $$4 = $$0.dE() - this.dE();
      double $$5 = $$0.dI() - this.dI();
      return azj.e($$3, $$5) < azj.k($$1) && azj.k($$4) < azj.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.v($$0 % 360.0F);
      this.w($$1 % 360.0F);
   }

   public final void b(ezh $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      this.a(this.ay());
   }

   protected ezc ay() {
      return this.aZ.a(this.s);
   }

   protected void az() {
      this.a_(this.s.d, this.s.e, this.s.f);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.w(this.dP() + $$2);
      this.v(this.dN() + $$3);
      this.w(azj.a(this.dP(), -90.0F, 90.0F));
      this.P += $$2;
      this.O += $$3;
      this.P = azj.a(this.P, -90.0F, 90.0F);
      if (this.q != null) {
         this.q.k(this);
      }
   }

   public void l() {
      this.aA();
   }

   public void aA() {
      this.dX().ah().a("entityBaseTick");
      this.bf = null;
      if (this.ca() && this.dl().dS()) {
         this.af();
      }

      if (this.K > 0) {
         this.K--;
      }

      this.P = this.dP();
      this.O = this.dN();
      this.bX();
      if (this.bw()) {
         this.bx();
      }

      this.ax = this.aw;
      this.aw = false;
      this.br();
      this.w();
      this.bq();
      if (this.dX().C) {
         this.aH();
      } else if (this.aF > 0) {
         if (this.bj()) {
            this.h(this.aF - 4);
            if (this.aF < 0) {
               this.aH();
            }
         } else {
            if (this.aF % 20 == 0 && !this.by()) {
               this.a(this.dY().d(), 1.0F);
            }

            this.h(this.aF - 1);
         }

         if (this.cv() > 0) {
            this.k(0);
            this.dX().a(null, 1009, this.t, 1);
         }
      }

      if (this.by()) {
         this.aF();
         this.aa *= 0.5F;
      }

      this.aB();
      if (!this.dX().C) {
         this.c(this.aF > 0);
      }

      this.al = false;
      if (!this.dX().C && this instanceof but) {
         but.b_((btz)((but)this));
      }

      this.dX().ah().c();
   }

   public void c(boolean $$0) {
      this.b(0, $$0 || this.be);
   }

   public void aB() {
      if (this.dE() < (double)(this.dX().I_() - 64)) {
         this.aI();
      }
   }

   public void aC() {
      this.aT = this.bY();
   }

   public void f(int $$0) {
      this.aT = $$0;
   }

   public int aD() {
      return this.aT;
   }

   public boolean aE() {
      return this.aT > 0;
   }

   protected void N() {
      if (this.aE()) {
         this.aT--;
      }
   }

   public void aF() {
      if (!this.bj()) {
         this.d(15.0F);
         if (this.a(this.dY().e(), 4.0F)) {
            this.a(awk.kb, 0.4F, 2.0F + this.af.i() * 0.4F);
         }
      }
   }

   public final void d(float $$0) {
      this.g(azj.d($$0 * 20.0F));
   }

   public void g(int $$0) {
      if (this.aF < $$0) {
         this.h($$0);
      }
   }

   public void h(int $$0) {
      this.aF = $$0;
   }

   public int aG() {
      return this.aF;
   }

   public void aH() {
      this.h(0);
   }

   protected void aI() {
      this.au();
   }

   public boolean g(double $$0, double $$1, double $$2) {
      return this.b(this.cS().d($$0, $$1, $$2));
   }

   private boolean b(ezc $$0) {
      return this.dX().a(this, $$0) && !this.dX().d($$0);
   }

   public void d(boolean $$0) {
      this.aC = $$0;
      this.a($$0, null);
   }

   public void a(boolean $$0, boolean $$1, ezh $$2) {
      this.aC = $$0;
      this.Q = $$1;
      this.a($$0, $$2);
   }

   public boolean d(jg $$0) {
      return this.ay.isPresent() && this.ay.get().equals($$0);
   }

   protected void a(boolean $$0, @Nullable ezh $$1) {
      if ($$0) {
         ezc $$2 = this.cS();
         ezc $$3 = new ezc($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<jg> $$4 = this.r.h(this, $$3);
         if ($$4.isPresent() || this.bb) {
            this.ay = $$4;
         } else if ($$1 != null) {
            ezc $$5 = $$3.d(-$$1.d, 0.0, -$$1.f);
            $$4 = this.r.h(this, $$5);
            this.ay = $$4;
         }

         this.bb = $$4.isEmpty();
      } else {
         this.bb = false;
         if (this.ay.isPresent()) {
            this.ay = Optional.empty();
         }
      }
   }

   public boolean aJ() {
      return this.aC;
   }

   public void a(buz $$0, ezh $$1) {
      if (this.ae) {
         this.a_(this.dC() + $$1.d, this.dE() + $$1.e, this.dI() + $$1.f);
      } else {
         if ($$0 == buz.c) {
            $$1 = this.d($$1);
            if ($$1.equals(ezh.c)) {
               return;
            }
         }

         this.dX().ah().a("move");
         if (this.V.h() > 1.0E-7) {
            $$1 = $$1.h(this.V);
            this.V = ezh.c;
            this.h(ezh.c);
         }

         $$1 = this.a($$1, $$0);
         ezh $$2 = this.a($$1);
         double $$3 = $$2.h();
         if ($$3 > 1.0E-7 || $$1.h() - $$3 < 1.0E-7) {
            if (this.aa != 0.0F && $$3 >= 1.0) {
               ezd $$4 = this.dX().a(new ded(this.dv(), this.dv().e($$2), ded.a.d, ded.b.d, this));
               if ($$4.d() != ezf.a.a) {
                  this.n();
               }
            }

            this.a_(this.dC() + $$2.d, this.dE() + $$2.e, this.dI() + $$2.f);
         }

         this.dX().ah().c();
         this.dX().ah().a("rest");
         boolean $$5 = !azj.b($$1.d, $$2.d);
         boolean $$6 = !azj.b($$1.f, $$2.f);
         this.Q = $$5 || $$6;
         if (Math.abs($$1.e) > 0.0 || this.di()) {
            this.R = $$1.e != $$2.e;
            this.S = this.R && $$1.e < 0.0;
            this.a(this.S, this.Q, $$2);
         }

         if (this.Q) {
            this.T = this.c($$2);
         } else {
            this.T = false;
         }

         jg $$7 = this.aP();
         dvd $$8 = this.dX().a_($$7);
         if (!this.dX().y_() || this.dj()) {
            this.a($$2.e, this.aJ(), $$8, $$7);
         }

         if (this.dS()) {
            this.dX().ah().c();
         } else {
            if (this.Q) {
               ezh $$9 = this.dA();
               this.n($$5 ? 0.0 : $$9.d, $$9.e, $$6 ? 0.0 : $$9.f);
            }

            if (this.dj()) {
               dhy $$10 = $$8.b();
               if ($$1.e != $$2.e) {
                  $$10.a(this.dX(), this);
               }
            }

            if (!this.dX().y_() || this.dj()) {
               btz.b $$11 = this.bh();
               if ($$11.a() && !this.ca()) {
                  this.a($$11, $$2, $$7, $$8);
               }
            }

            float $$12 = this.aT();
            this.h(this.dA().d((double)$$12, 1.0, (double)$$12));
            this.dX().ah().c();
         }
      }
   }

   private void a(btz.b $$0, ezh $$1, jg $$2, dvd $$3) {
      float $$4 = 0.6F;
      float $$5 = (float)($$1.g() * 0.6F);
      float $$6 = (float)($$1.i() * 0.6F);
      jg $$7 = this.aR();
      dvd $$8 = this.dX().a_($$7);
      boolean $$9 = this.c($$8);
      this.Y += $$9 ? $$5 : $$6;
      this.Z += $$5;
      if (this.Y > this.aE && !$$8.l()) {
         boolean $$10 = $$7.equals($$2);
         boolean $$11 = this.a($$2, $$3, $$0.c(), $$10, $$1);
         if (!$$10) {
            $$11 |= this.a($$7, $$8, false, $$0.b(), $$1);
         }

         if ($$11) {
            this.aE = this.aU();
         } else if (this.bk()) {
            this.aE = this.aU();
            if ($$0.c()) {
               this.aZ();
            }

            if ($$0.b()) {
               this.a(eaa.Q);
            }
         }
      } else if ($$8.l()) {
         this.aO();
      }
   }

   public void aK() {
      if (this.aL()) {
         boolean $$0 = this.bZ();
         if (this.aJ()) {
            jg $$1 = this.aP();
            dvd $$2 = this.dX().a_($$1);
            $$2.b().a(this.dX(), $$1, $$2, this);
         }

         this.a(this.bg);
         boolean $$3 = Iterables.any(this.bg, $$0x -> $$0x.a(awz.aL) || $$0x.a(dia.H));
         this.bg.clear();
         if (!$$3) {
            if (this.aF <= 0) {
               this.h(-this.do());
            }

            if ($$0 && (this.aw || this.bm())) {
               this.aM();
            }
         }

         if (this.bZ() && (this.aw || this.bm())) {
            this.h(-this.do());
         }
      }
   }

   protected boolean aL() {
      return !this.dS() && !this.ae;
   }

   private boolean c(dvd $$0) {
      return $$0.a(awz.aQ) || $$0.a(dia.qP);
   }

   private boolean a(jg $$0, dvd $$1, boolean $$2, boolean $$3, ezh $$4) {
      if ($$1.l()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aJ() || $$5 || this.cj() && $$4.e == 0.0 || this.cr()) && !this.cl()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dX().a(eaa.P, this.dv(), eaa.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(ezh $$0) {
      return false;
   }

   protected void aM() {
      this.a(awk.kg, 0.7F, 1.6F + (this.af.i() - this.af.i()) * 0.4F);
   }

   public void aN() {
      if (!this.dX().C && this.bZ()) {
         this.aM();
      }

      this.aH();
   }

   protected void aO() {
      if (this.bb()) {
         this.ba();
         if (this.bh().b()) {
            this.a(eaa.x);
         }
      }
   }

   @Deprecated
   public jg aP() {
      return this.e(0.2F);
   }

   public jg aQ() {
      return this.e(0.500001F);
   }

   public jg aR() {
      return this.e(1.0E-5F);
   }

   protected jg e(float $$0) {
      if (this.ay.isPresent()) {
         jg $$1 = this.ay.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dvd $$2 = this.dX().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(awz.T)) && !$$2.a(awz.M) && !($$2.b() instanceof dkw) ? $$1.h(azj.a(this.s.e - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = azj.a(this.s.d);
         int $$4 = azj.a(this.s.e - (double)$$0);
         int $$5 = azj.a(this.s.f);
         return new jg($$3, $$4, $$5);
      }
   }

   protected float aS() {
      float $$0 = this.dX().a_(this.dx()).b().k();
      float $$1 = this.dX().a_(this.aQ()).b().k();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aT() {
      dvd $$0 = this.dX().a_(this.dx());
      float $$1 = $$0.b().h();
      if (!$$0.a(dia.G) && !$$0.a(dia.nd)) {
         return (double)$$1 == 1.0 ? this.dX().a_(this.aQ()).b().h() : $$1;
      } else {
         return $$1;
      }
   }

   protected ezh a(ezh $$0, buz $$1) {
      return $$0;
   }

   protected ezh d(ezh $$0) {
      if ($$0.h() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dX().aa();
         if ($$1 != this.aY) {
            Arrays.fill(this.aX, 0.0);
            this.aY = $$1;
         }

         if ($$0.d != 0.0) {
            double $$2 = this.a(jl.a.a, $$0.d);
            return Math.abs($$2) <= 1.0E-5F ? ezh.c : new ezh($$2, 0.0, 0.0);
         } else if ($$0.e != 0.0) {
            double $$3 = this.a(jl.a.b, $$0.e);
            return Math.abs($$3) <= 1.0E-5F ? ezh.c : new ezh(0.0, $$3, 0.0);
         } else if ($$0.f != 0.0) {
            double $$4 = this.a(jl.a.c, $$0.f);
            return Math.abs($$4) <= 1.0E-5F ? ezh.c : new ezh(0.0, 0.0, $$4);
         } else {
            return ezh.c;
         }
      }
   }

   private double a(jl.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = azj.a($$1 + this.aX[$$2], -0.51, 0.51);
      $$1 = $$3 - this.aX[$$2];
      this.aX[$$2] = $$3;
      return $$1;
   }

   private ezh a(ezh $$0) {
      ezc $$1 = this.cS();
      List<fab> $$2 = this.dX().c(this, $$1.b($$0));
      ezh $$3 = $$0.h() == 0.0 ? $$0 : a(this, $$0, $$1, this.dX(), $$2);
      boolean $$4 = $$0.d != $$3.d;
      boolean $$5 = $$0.e != $$3.e;
      boolean $$6 = $$0.f != $$3.f;
      boolean $$7 = $$5 && $$0.e < 0.0;
      if (this.dR() > 0.0F && ($$7 || this.aJ()) && ($$4 || $$6)) {
         ezc $$8 = $$7 ? $$1.d(0.0, $$3.e, 0.0) : $$1;
         ezc $$9 = $$8.b($$0.d, (double)this.dR(), $$0.f);
         if (!$$7) {
            $$9 = $$9.b(0.0, -1.0E-5F, 0.0);
         }

         List<fab> $$10 = a(this, this.r, $$2, $$9);
         float $$11 = (float)$$3.e;
         float[] $$12 = a($$8, $$10, this.dR(), $$11);

         for (float $$13 : $$12) {
            ezh $$14 = a(new ezh($$0.d, (double)$$13, $$0.f), $$8, $$10);
            if ($$14.j() > $$3.j()) {
               double $$15 = $$1.b - $$8.b;
               return $$14.b(0.0, -$$15, 0.0);
            }
         }
      }

      return $$3;
   }

   private static float[] a(ezc $$0, List<fab> $$1, float $$2, float $$3) {
      FloatSet $$4 = new FloatArraySet(4);

      for (fab $$5 : $$1) {
         DoubleList $$6 = $$5.a(jl.a.b);
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

   public static ezh a(@Nullable btz $$0, ezh $$1, ezc $$2, dev $$3, List<fab> $$4) {
      List<fab> $$5 = a($$0, $$3, $$4, $$2.b($$1));
      return a($$1, $$2, $$5);
   }

   private static List<fab> a(@Nullable btz $$0, dev $$1, List<fab> $$2, ezc $$3) {
      Builder<fab> $$4 = ImmutableList.builderWithExpectedSize($$2.size() + 1);
      if (!$$2.isEmpty()) {
         $$4.addAll($$2);
      }

      dwu $$5 = $$1.C_();
      boolean $$6 = $$0 != null && $$5.a($$0, $$3);
      if ($$6) {
         $$4.add($$5.c());
      }

      $$4.addAll($$1.e($$0, $$3));
      return $$4.build();
   }

   private static ezh a(ezh $$0, ezc $$1, List<fab> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.d;
         double $$4 = $$0.e;
         double $$5 = $$0.f;
         if ($$4 != 0.0) {
            $$4 = ezy.a(jl.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = ezy.a(jl.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = ezy.a(jl.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = ezy.a(jl.a.c, $$1, $$2, $$5);
         }

         return new ezh($$3, $$4, $$5);
      }
   }

   protected float aU() {
      return (float)((int)this.Y + 1);
   }

   protected awj aV() {
      return awk.kk;
   }

   protected awj aW() {
      return awk.kj;
   }

   protected awj aX() {
      return awk.kj;
   }

   protected void aY() {
      this.a(null);
   }

   protected void a(@Nullable Set<dvd> $$0) {
      ezh $$1 = this.bD();
      ezh $$2 = this.s;
      ezc $$3 = this.cS().h(1.0E-5F);

      for (jg $$4 : dea.a($$1, $$2, $$3)) {
         if (!this.bM()) {
            return;
         }

         dvd $$5 = this.dX().a_($$4);
         if (!$$5.l()) {
            try {
               fab $$6 = $$5.b(this.dX(), $$4);
               if ($$6 == ezy.b() || this.a($$1, $$4, $$6)) {
                  $$5.a(this.dX(), $$4, this);
                  this.a($$5);
               }
            } catch (Throwable var12) {
               o $$8 = o.a(var12, "Colliding entity with block");
               p $$9 = $$8.a("Block being collided with");
               p.a($$9, this.dX(), $$4, $$5);
               p $$10 = $$8.a("Entity being checked for collision");
               this.a($$10);
               throw new z($$8);
            }

            if ($$0 != null) {
               $$0.add($$5);
            }
         }
      }
   }

   private boolean a(ezh $$0, jg $$1, fab $$2) {
      ezc $$3 = this.cS();
      ezh $$4 = $$0.d($$3.g());
      return this.cS().a($$4, $$2.a(new ezh($$1)).e());
   }

   protected void a(dvd $$0) {
   }

   public jg a(arm $$0, jg $$1) {
      jg $$2 = $$0.W();
      ezh $$3 = $$2.b();
      int $$4 = $$0.m($$2).a(eaz.a.f, $$2.u(), $$2.w()) + 1;
      return jg.a($$3.d, (double)$$4, $$3.f);
   }

   public void a(jp<eaa> $$0, @Nullable btz $$1) {
      this.dX().a($$1, $$0, this.s);
   }

   public void a(jp<eaa> $$0) {
      this.a($$0, this);
   }

   private void c(jg $$0, dvd $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.o();
      }
   }

   protected void aZ() {
      btz $$0 = Objects.requireNonNullElse(this.cY(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      ezh $$2 = $$0.dA();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      this.f($$3);
   }

   protected jg e(jg $$0) {
      jg $$1 = $$0.d();
      dvd $$2 = this.dX().a_($$1);
      return !$$2.a(awz.bo) && !$$2.a(awz.bp) ? $$0 : $$1;
   }

   protected void a(dvd $$0, dvd $$1) {
      dpl $$2 = $$0.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dvd $$0) {
      dpl $$1 = $$0.A();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(jg $$0, dvd $$1) {
      dpl $$2 = $$1.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dvd $$0) {
      return $$0.a(awz.bn) && this.ag >= this.bd + 20;
   }

   private void o() {
      this.bc = this.bc * (float)Math.pow(0.997, (double)(this.ag - this.bd));
      this.bc = Math.min(1.0F, this.bc + 0.07F);
      float $$0 = 0.5F + this.bc * this.af.i() * 1.2F;
      float $$1 = 0.1F + this.bc * 1.2F;
      this.a(awk.E, $$1, $$0);
      this.bd = this.ag;
   }

   protected void f(float $$0) {
      this.a(this.aV(), $$0, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
   }

   protected void ba() {
   }

   protected boolean bb() {
      return false;
   }

   public void a(awj $$0, float $$1, float $$2) {
      if (!this.bc()) {
         this.dX().a(null, this.dC(), this.dE(), this.dI(), $$0, this.dn(), $$1, $$2);
      }
   }

   public void a(awj $$0) {
      if (!this.bc()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean bc() {
      return this.am.a(aO);
   }

   public void e(boolean $$0) {
      this.am.a(aO, $$0);
   }

   public boolean bd() {
      return this.am.a(aP);
   }

   public void f(boolean $$0) {
      this.am.a(aP, $$0);
   }

   protected double be() {
      return 0.0;
   }

   public final double bf() {
      return this.bd() ? 0.0 : this.be();
   }

   protected void bg() {
      double $$0 = this.bf();
      if ($$0 != 0.0) {
         this.h(this.dA().b(0.0, -$$0, 0.0));
      }
   }

   protected btz.b bh() {
      return btz.b.d;
   }

   public boolean bi() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dvd $$2, jg $$3) {
      if ($$1) {
         if (this.aa > 0.0F) {
            $$2.b().a(this.dX(), $$2, $$3, this, this.aa);
            this.dX().a(eaa.A, this.s, eaa.a.a(this, this.ay.<dvd>map($$0x -> this.dX().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.aa -= (float)$$0;
      }
   }

   public boolean bj() {
      return this.aq().d();
   }

   public boolean a(float $$0, float $$1, bsp $$2) {
      if (this.n.a(axd.o)) {
         return false;
      } else {
         if (this.cb()) {
            for (btz $$3 : this.da()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean bk() {
      return this.ah;
   }

   private boolean q() {
      jg $$0 = this.dx();
      return this.dX().r($$0) || this.dX().r(jg.a((double)$$0.u(), this.cS().e, (double)$$0.w()));
   }

   private boolean v() {
      return this.dy().a(dia.nd);
   }

   public boolean bl() {
      return this.bk() || this.q();
   }

   public boolean bm() {
      return this.bk() || this.q() || this.v();
   }

   public boolean bn() {
      return this.bk() || this.v();
   }

   public boolean bo() {
      return this.bn() || this.by();
   }

   public boolean bp() {
      return this.aj && this.bk();
   }

   public void bq() {
      if (this.cl()) {
         this.i(this.ck() && this.bk() && !this.ca());
      } else {
         this.i(this.ck() && this.bp() && !this.ca() && this.dX().b_(this.t).a(axf.a));
      }
   }

   protected boolean br() {
      this.ai.clear();
      this.bs();
      double $$0 = this.dX().D_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(axf.b, $$0);
      return this.bk() || $$1;
   }

   void bs() {
      if (this.dl() instanceof cqh $$0 && !$$0.bp()) {
         this.ah = false;
         return;
      }

      if (this.a(axf.a, 0.014)) {
         if (!this.ah && !this.al) {
            this.bt();
         }

         this.n();
         this.ah = true;
         this.aH();
      } else {
         this.ah = false;
      }
   }

   private void w() {
      this.aj = this.a(axf.a);
      this.aG.clear();
      double $$0 = this.dG();
      if (this.dl() instanceof cqh $$2 && !$$2.bp() && $$2.cS().e >= $$0 && $$2.cS().b <= $$0) {
         return;
      }

      jg $$3 = jg.a(this.dC(), $$0, this.dI());
      ere $$4 = this.dX().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a(this.dX(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aG::add);
      }
   }

   protected void bt() {
      btz $$0 = Objects.requireNonNullElse(this.cY(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      ezh $$2 = $$0.dA();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aW(), $$3, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
      } else {
         this.a(this.aX(), $$3, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
      }

      float $$4 = (float)azj.a(this.dE());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.aZ.a() * 20.0F; $$5++) {
         double $$6 = (this.af.j() * 2.0 - 1.0) * (double)this.aZ.a();
         double $$7 = (this.af.j() * 2.0 - 1.0) * (double)this.aZ.a();
         this.dX().a(lq.d, this.dC() + $$6, (double)($$4 + 1.0F), this.dI() + $$7, $$2.d, $$2.e - this.af.j() * 0.2F, $$2.f);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.aZ.a() * 20.0F; $$8++) {
         double $$9 = (this.af.j() * 2.0 - 1.0) * (double)this.aZ.a();
         double $$10 = (this.af.j() * 2.0 - 1.0) * (double)this.aZ.a();
         this.dX().a(lq.am, this.dC() + $$9, (double)($$4 + 1.0F), this.dI() + $$10, $$2.d, $$2.e, $$2.f);
      }

      this.a(eaa.O);
   }

   @Deprecated
   protected dvd bu() {
      return this.dX().a_(this.aP());
   }

   public dvd bv() {
      return this.dX().a_(this.aR());
   }

   public boolean bw() {
      return this.ck() && !this.bk() && !this.R_() && !this.cj() && !this.by() && this.bM();
   }

   protected void bx() {
      jg $$0 = this.aP();
      dvd $$1 = this.dX().a_($$0);
      if ($$1.o() != doe.a) {
         ezh $$2 = this.dA();
         jg $$3 = this.dx();
         double $$4 = this.dC() + (this.af.j() - 0.5) * (double)this.aZ.a();
         double $$5 = this.dI() + (this.af.j() - 0.5) * (double)this.aZ.a();
         if ($$3.u() != $$0.u()) {
            $$4 = azj.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = azj.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dX().a(new li(lq.b, $$1), $$4, this.dE() + 0.1, $$5, $$2.d * -4.0, 1.5, $$2.f * -4.0);
      }
   }

   public boolean a(axp<erd> $$0) {
      return this.aG.contains($$0);
   }

   public boolean by() {
      return !this.al && this.ai.getDouble(axf.b) > 0.0;
   }

   public void a(float $$0, ezh $$1) {
      ezh $$2 = a($$1, $$0, this.dN());
      this.h(this.dA().e($$2));
   }

   protected static ezh a(ezh $$0, float $$1, float $$2) {
      double $$3 = $$0.h();
      if ($$3 < 1.0E-7) {
         return ezh.c;
      } else {
         ezh $$4 = ($$3 > 1.0 ? $$0.d() : $$0).c((double)$$1);
         float $$5 = azj.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = azj.b($$2 * (float) (Math.PI / 180.0));
         return new ezh($$4.d * (double)$$6 - $$4.f * (double)$$5, $$4.e, $$4.f * (double)$$6 + $$4.d * (double)$$5);
      }
   }

   @Deprecated
   public float bz() {
      return this.dX().f(this.dB(), this.dH()) ? this.dX().x(jg.a(this.dC(), this.dG(), this.dI())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.b($$3, $$4);
   }

   public void b(float $$0, float $$1) {
      this.v($$0 % 360.0F);
      this.w(azj.a($$1, -90.0F, 90.0F) % 360.0F);
      this.O = this.dN();
      this.P = this.dP();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = azj.a($$0, -3.0E7, 3.0E7);
      double $$4 = azj.a($$2, -3.0E7, 3.0E7);
      this.L = $$3;
      this.M = $$1;
      this.N = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(ezh $$0) {
      this.e($$0.d, $$0.e, $$0.f);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dN(), this.dP());
   }

   public void a(jg $$0, float $$1, float $$2) {
      this.b($$0.c(), $$1, $$2);
   }

   public void b(ezh $$0, float $$1, float $$2) {
      this.b($$0.d, $$0.e, $$0.f, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.o($$0, $$1, $$2);
      this.v($$3);
      this.w($$4);
      this.bA();
      this.az();
   }

   public final void bA() {
      this.bB();
      this.bC();
   }

   public final void c(ezh $$0, float $$1, float $$2) {
      this.j($$0);
      this.e($$1, $$2);
   }

   protected void bB() {
      this.j(this.s);
   }

   protected void bC() {
      this.e(this.dN(), this.dP());
   }

   private void j(ezh $$0) {
      this.L = this.ab = $$0.d;
      this.M = this.ac = $$0.e;
      this.N = this.ad = $$0.f;
   }

   private void e(float $$0, float $$1) {
      this.O = $$0;
      this.P = $$1;
   }

   public final ezh bD() {
      return new ezh(this.ab, this.ac, this.ad);
   }

   public float f(btz $$0) {
      float $$1 = (float)(this.dC() - $$0.dC());
      float $$2 = (float)(this.dE() - $$0.dE());
      float $$3 = (float)(this.dI() - $$0.dI());
      return azj.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dC() - $$0;
      double $$4 = this.dE() - $$1;
      double $$5 = this.dI() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(btz $$0) {
      return this.f($$0.dv());
   }

   public double f(ezh $$0) {
      double $$1 = this.dC() - $$0.d;
      double $$2 = this.dE() - $$0.e;
      double $$3 = this.dI() - $$0.f;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(coh $$0) {
   }

   public void h(btz $$0) {
      if (!this.z($$0)) {
         if (!$$0.ae && !this.ae) {
            double $$1 = $$0.dC() - this.dC();
            double $$2 = $$0.dI() - this.dI();
            double $$3 = azj.a($$1, $$2);
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
               if (!this.cb() && this.bJ()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.cb() && $$0.bJ()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void g(ezh $$0) {
      this.j($$0.d, $$0.e, $$0.f);
   }

   public void j(double $$0, double $$1, double $$2) {
      this.h(this.dA().b($$0, $$1, $$2));
      this.as = true;
   }

   protected void bE() {
      this.U = true;
   }

   public boolean a(bsp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bE();
         return false;
      }
   }

   public final ezh g(float $$0) {
      return this.c(this.h($$0), this.i($$0));
   }

   public jl bF() {
      return jl.a(this.g(1.0F));
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dP() : azj.h($$0, this.P, this.dP());
   }

   public float i(float $$0) {
      return $$0 == 1.0F ? this.dN() : azj.h($$0, this.O, this.dN());
   }

   public float j(float $$0) {
      return azj.h($$0, this.P, this.dP());
   }

   public float k(float $$0) {
      return azj.i($$0, this.O, this.dN());
   }

   public final ezh c(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = azj.b($$3);
      float $$5 = azj.a($$3);
      float $$6 = azj.b($$2);
      float $$7 = azj.a($$2);
      return new ezh((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final ezh l(float $$0) {
      return this.d(this.h($$0), this.i($$0));
   }

   protected final ezh d(float $$0, float $$1) {
      return this.c($$0 - 90.0F, $$1);
   }

   public final ezh bG() {
      return new ezh(this.dC(), this.dG(), this.dI());
   }

   public final ezh m(float $$0) {
      double $$1 = azj.d((double)$$0, this.L, this.dC());
      double $$2 = azj.d((double)$$0, this.M, this.dE()) + (double)this.cT();
      double $$3 = azj.d((double)$$0, this.N, this.dI());
      return new ezh($$1, $$2, $$3);
   }

   public ezh n(float $$0) {
      return this.m($$0);
   }

   public final ezh o(float $$0) {
      double $$1 = azj.d((double)$$0, this.L, this.dC());
      double $$2 = azj.d((double)$$0, this.M, this.dE());
      double $$3 = azj.d((double)$$0, this.N, this.dI());
      return new ezh($$1, $$2, $$3);
   }

   public ezf a(double $$0, float $$1, boolean $$2) {
      ezh $$3 = this.m($$1);
      ezh $$4 = this.g($$1);
      ezh $$5 = $$3.b($$4.d * $$0, $$4.e * $$0, $$4.f * $$0);
      return this.dX().a(new ded($$3, $$5, ded.a.b, $$2 ? ded.b.c : ded.b.a, this));
   }

   public boolean bH() {
      return this.bM() && this.bI();
   }

   public boolean bI() {
      return false;
   }

   public boolean bJ() {
      return false;
   }

   public void a(btz $$0, int $$1, bsp $$2) {
      if ($$0 instanceof arn) {
         an.d.a((arn)$$0, this, $$2);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.dC() - $$0;
      double $$4 = this.dE() - $$1;
      double $$5 = this.dI() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cS().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * m;
      return $$0 < $$1 * $$1;
   }

   public boolean d(uj $$0) {
      if (this.aD != null && !this.aD.b()) {
         return false;
      } else {
         String $$1 = this.bL();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.f($$0);
            return true;
         }
      }
   }

   public boolean e(uj $$0) {
      return this.ca() ? false : this.d($$0);
   }

   public uj f(uj $$0) {
      try {
         if (this.q != null) {
            $$0.a("Pos", this.a(this.q.dC(), this.dE(), this.q.dI()));
         } else {
            $$0.a("Pos", this.a(this.dC(), this.dE(), this.dI()));
         }

         ezh $$1 = this.dA();
         $$0.a("Motion", this.a($$1.d, $$1.e, $$1.f));
         $$0.a("Rotation", this.a(this.dN(), this.dP()));
         $$0.a("FallDistance", this.aa);
         $$0.a("Fire", (short)this.aF);
         $$0.a("Air", (short)this.cu());
         $$0.a("OnGround", this.aJ());
         $$0.a("Invulnerable", this.aU);
         $$0.a("PortalCooldown", this.aT);
         $$0.a("UUID", this.cH());
         xh $$2 = this.an();
         if ($$2 != null) {
            $$0.a("CustomName", xh.a.a($$2, this.dZ()));
         }

         if (this.cM()) {
            $$0.a("CustomNameVisible", this.cM());
         }

         if (this.bc()) {
            $$0.a("Silent", this.bc());
         }

         if (this.bd()) {
            $$0.a("NoGravity", this.bd());
         }

         if (this.aV) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.cv();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.cv());
         }

         if (this.be) {
            $$0.a("HasVisualFire", this.be);
         }

         if (!this.aW.isEmpty()) {
            up $$4 = new up();

            for (String $$5 : this.aW) {
               $$4.add(ve.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.cb()) {
            up $$6 = new up();

            for (btz $$7 : this.da()) {
               uj $$8 = new uj();
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

   public void g(uj $$0) {
      try {
         up $$1 = $$0.c("Pos", 6);
         up $$2 = $$0.c("Motion", 6);
         up $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.n(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.o(azj.a($$1.h(0), -3.0000512E7, 3.0000512E7), azj.a($$1.h(1), -2.0E7, 2.0E7), azj.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.v($$3.i(0));
         this.w($$3.i(1));
         this.bA();
         this.q(this.dN());
         this.r(this.dN());
         this.aa = $$0.j("FallDistance");
         this.aF = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.j($$0.g("Air"));
         }

         this.aC = $$0.q("OnGround");
         this.aU = $$0.q("Invulnerable");
         this.aT = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.au = $$0.a("UUID");
            this.av = this.au.toString();
         }

         if (!Double.isFinite(this.dC()) || !Double.isFinite(this.dE()) || !Double.isFinite(this.dI())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dN()) && Double.isFinite((double)this.dP())) {
            this.az();
            this.a(this.dN(), this.dP());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(xh.a.a($$8, this.dZ()));
               } catch (Exception var16) {
                  b.warn("Failed to parse entity custom name {}", $$8, var16);
               }
            }

            this.p($$0.q("CustomNameVisible"));
            this.e($$0.q("Silent"));
            this.f($$0.q("NoGravity"));
            this.j($$0.q("Glowing"));
            this.k($$0.h("TicksFrozen"));
            this.be = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.aW.clear();
               up $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.aW.add($$10.j($$12));
               }
            }

            this.a($$0);
            if (this.bK()) {
               this.az();
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

   protected boolean bK() {
      return true;
   }

   @Nullable
   protected final String bL() {
      bug<?> $$0 = this.aq();
      alh $$1 = bug.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(uj var1);

   protected abstract void b(uj var1);

   protected up a(double... $$0) {
      up $$1 = new up();

      for (double $$2 : $$0) {
         $$1.add(uk.a($$2));
      }

      return $$1;
   }

   protected up a(float... $$0) {
      up $$1 = new up();

      for (float $$2 : $$0) {
         $$1.add(um.a($$2));
      }

      return $$1;
   }

   @Nullable
   public ckq a(deu $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public ckq a(deu $$0, int $$1) {
      return this.a(new cvx($$0), (float)$$1);
   }

   @Nullable
   public ckq b(cvx $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public ckq a(cvx $$0, float $$1) {
      if ($$0.f()) {
         return null;
      } else if (this.dX().C) {
         return null;
      } else {
         ckq $$2 = new ckq(this.dX(), this.dC(), this.dE() + (double)$$1, this.dI(), $$0);
         $$2.q();
         this.dX().b($$2);
         return $$2;
      }
   }

   public boolean bM() {
      return !this.dS();
   }

   public boolean bN() {
      if (this.ae) {
         return false;
      } else {
         float $$0 = this.aZ.a() * 0.8F;
         ezc $$1 = ezc.a(this.bG(), (double)$$0, 1.0E-6, (double)$$0);
         return jg.b($$1)
            .anyMatch(
               $$1x -> {
                  dvd $$2 = this.dX().a_($$1x);
                  return !$$2.l()
                     && $$2.j(this.dX(), $$1x)
                     && ezy.c($$2.g(this.dX(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), ezy.a($$1), ezl.i);
               }
            );
      }
   }

   public bry a(coh $$0, brx $$1) {
      if (this.bM() && this instanceof but $$2) {
         if ($$2.C() == $$0) {
            if (!this.dX().y_()) {
               $$2.a(true, !$$0.fX());
               this.a(eaa.r, $$0);
            }

            return bry.a;
         }

         cvx $$3 = $$0.b($$1);
         if ($$3.a(cwb.uM) && $$2.O_()) {
            if (!this.dX().y_()) {
               $$2.b($$0, true);
            }

            $$3.h(1);
            return bry.a;
         }
      }

      return bry.e;
   }

   public boolean i(btz $$0) {
      return $$0.bO() && !this.z($$0);
   }

   public boolean bO() {
      return false;
   }

   public void u() {
      this.h(ezh.c);
      this.l();
      if (this.ca()) {
         this.dl().j(this);
      }
   }

   public final void j(btz $$0) {
      if (this.y($$0)) {
         this.a($$0, btz::a_);
      }
   }

   protected void a(btz $$0, btz.a $$1) {
      ezh $$2 = this.m($$0);
      ezh $$3 = $$0.l(this);
      $$1.accept($$0, $$2.d - $$3.d, $$2.e - $$3.e, $$2.f - $$3.f);
   }

   public void k(btz $$0) {
   }

   public ezh l(btz $$0) {
      return this.du().b(bua.b, 0, this.az);
   }

   public ezh m(btz $$0) {
      return this.dv().e(this.a($$0, this.aZ, 1.0F));
   }

   protected ezh a(btz $$0, buc $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static ezh a(btz $$0, btz $$1, bub $$2) {
      int $$3 = $$0.da().indexOf($$1);
      return $$2.c(bua.a, $$3, $$0.az);
   }

   public boolean n(btz $$0) {
      return this.a($$0, false);
   }

   public boolean bP() {
      return this instanceof buv;
   }

   public boolean a(btz $$0, boolean $$1) {
      if ($$0 == this.q) {
         return false;
      } else if (!$$0.bS()) {
         return false;
      } else {
         for (btz $$2 = $$0; $$2.q != null; $$2 = $$2.q) {
            if ($$2.q == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.ca()) {
               this.af();
            }

            this.b(bvh.a);
            this.q = $$0;
            this.q.p(this);
            $$0.D().filter($$0x -> $$0x instanceof arn).forEach($$0x -> an.U.a((arn)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(btz $$0) {
      return !this.ce() && this.K <= 0;
   }

   public void bQ() {
      for (int $$0 = this.p.size() - 1; $$0 >= 0; $$0--) {
         ((btz)this.p.get($$0)).af();
      }
   }

   public void bR() {
      if (this.q != null) {
         btz $$0 = this.q;
         this.q = null;
         $$0.q(this);
      }
   }

   public void af() {
      this.bR();
   }

   protected void p(btz $$0) {
      if ($$0.dl() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.p.isEmpty()) {
            this.p = ImmutableList.of($$0);
         } else {
            List<btz> $$1 = Lists.newArrayList(this.p);
            if (!this.dX().C && $$0 instanceof coh && !(this.db() instanceof coh)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.p = ImmutableList.copyOf($$1);
         }

         this.a(eaa.s, $$0);
      }
   }

   protected void q(btz $$0) {
      if ($$0.dl() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.p.size() == 1 && this.p.get(0) == $$0) {
            this.p = ImmutableList.of();
         } else {
            this.p = this.p.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.K = 60;
         this.a(eaa.q, $$0);
      }
   }

   protected boolean r(btz $$0) {
      return this.p.isEmpty();
   }

   protected boolean bS() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public double d_() {
      return this.dC();
   }

   public double e_() {
      return this.dE();
   }

   public double P_() {
      return this.dI();
   }

   public float Q_() {
      return this.dP();
   }

   public float f_() {
      return this.dN();
   }

   public void a(float $$0, int $$1) {
      this.q($$0);
   }

   public float bT() {
      return 0.0F;
   }

   public ezh bU() {
      return this.c(this.dP(), this.dN());
   }

   public ezh a(cvt $$0) {
      if (!(this instanceof coh $$1)) {
         return ezh.c;
      } else {
         boolean $$2 = $$1.fc().a($$0) && !$$1.fb().a($$0);
         bup $$3 = $$2 ? $$1.fA().e() : $$1.fA();
         return this.c(0.0F, this.dN() + (float)($$3 == bup.b ? 80 : -80)).c(0.5);
      }
   }

   public ezg bV() {
      return new ezg(this.dP(), this.dN());
   }

   public ezh bW() {
      return ezh.a(this.bV());
   }

   public void a(dnq $$0, jg $$1) {
      if (this.aE()) {
         this.aC();
      } else {
         if (this.at == null || !this.at.a($$0)) {
            this.at = new bvg($$0, $$1.j());
         } else if (!this.at.e()) {
            this.at.a($$1.j());
            this.at.a(true);
         }
      }
   }

   protected void bX() {
      if (this.dX() instanceof arm $$0) {
         this.N();
         if (this.at != null) {
            if (this.at.a($$0, this, this.o(false))) {
               $$0.ah().a("portal");
               this.aC();
               esc $$2 = this.at.a($$0, this);
               if ($$2 != null) {
                  arm $$3 = $$2.a();
                  if ($$0.o().a((dev)$$3) && ($$3.ag() == $$0.ag() || this.a($$0, $$3))) {
                     this.b($$2);
                  }
               }

               $$0.ah().c();
            } else if (this.at.b()) {
               this.at = null;
            }
         }
      }
   }

   public int bY() {
      btz $$0 = this.db();
      return $$0 instanceof arn ? $$0.bY() : 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
   }

   public void c(bsp $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dlr.a(this);
      }
   }

   public void p(float $$0) {
   }

   public boolean bZ() {
      boolean $$0 = this.dX() != null && this.dX().C;
      return !this.bj() && (this.aF > 0 || $$0 && this.i(0));
   }

   public boolean ca() {
      return this.dl() != null;
   }

   public boolean cb() {
      return !this.p.isEmpty();
   }

   public boolean cc() {
      return this.aq().a(axd.p);
   }

   public boolean cd() {
      return !this.aq().a(axd.q);
   }

   public void g(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean ce() {
      return this.i(1);
   }

   public boolean cf() {
      return this.ce();
   }

   public boolean cg() {
      return this.ce();
   }

   public boolean ch() {
      return this.ce();
   }

   public boolean ci() {
      return this.ce();
   }

   public boolean cj() {
      return this.c(bvh.f);
   }

   public boolean ck() {
      return this.i(3);
   }

   public void h(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean cl() {
      return this.i(4);
   }

   public boolean cm() {
      return this.c(bvh.d);
   }

   public boolean cn() {
      return this.cm() && !this.bk();
   }

   public void i(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean co() {
      return this.aV;
   }

   public final void j(boolean $$0) {
      this.aV = $$0;
      this.b(6, this.cp());
   }

   public boolean cp() {
      return this.dX().y_() ? this.i(6) : this.aV;
   }

   public boolean cq() {
      return this.i(5);
   }

   public boolean d(coh $$0) {
      if ($$0.R_()) {
         return false;
      } else {
         fao $$1 = this.cs();
         return $$1 != null && $$0 != null && $$0.cs() == $$1 && $$1.i() ? false : this.cq();
      }
   }

   public boolean cr() {
      return false;
   }

   public void a(BiConsumer<dzx<?>, arm> $$0) {
   }

   @Nullable
   public fah cs() {
      return this.dX().O().e(this.cJ());
   }

   public final boolean s(@Nullable btz $$0) {
      return $$0 == null ? false : this == $$0 || this.t($$0) || $$0.t(this);
   }

   protected boolean t(btz $$0) {
      return this.a($$0.cs());
   }

   public boolean a(@Nullable fao $$0) {
      return this.cs() != null ? this.cs().a($$0) : false;
   }

   public void k(boolean $$0) {
      this.b(5, $$0);
   }

   protected boolean i(int $$0) {
      return (this.am.a(an) & 1 << $$0) != 0;
   }

   protected void b(int $$0, boolean $$1) {
      byte $$2 = this.am.a(an);
      if ($$1) {
         this.am.a(an, (byte)($$2 | 1 << $$0));
      } else {
         this.am.a(an, (byte)($$2 & ~(1 << $$0)));
      }
   }

   public int ct() {
      return 300;
   }

   public int cu() {
      return this.am.a(aL);
   }

   public void j(int $$0) {
      this.am.a(aL, $$0);
   }

   public int cv() {
      return this.am.a(aQ);
   }

   public void k(int $$0) {
      this.am.a(aQ, $$0);
   }

   public float cw() {
      int $$0 = this.cy();
      return (float)Math.min(this.cv(), $$0) / (float)$$0;
   }

   public boolean cx() {
      return this.cv() >= this.cy();
   }

   public int cy() {
      return 140;
   }

   public void a(arm $$0, buu $$1) {
      this.h(this.aF + 1);
      if (this.aF == 0) {
         this.d(8.0F);
      }

      this.a(this.dY().c(), 5.0F);
   }

   public void l(boolean $$0) {
      ezh $$1 = this.dA();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.e - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.e + 0.1);
      }

      this.n($$1.d, $$2, $$1.f);
   }

   public void m(boolean $$0) {
      ezh $$1 = this.dA();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.e - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.e + 0.06);
      }

      this.n($$1.d, $$2, $$1.f);
      this.n();
   }

   public boolean a(arm $$0, buv $$1) {
      return true;
   }

   public void cz() {
      if (this.dA().b() > -0.5 && this.aa > 1.0F) {
         this.aa = 1.0F;
      }
   }

   public void n() {
      this.aa = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      jg $$3 = jg.a($$0, $$1, $$2);
      ezh $$4 = new ezh($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      jg.a $$5 = new jg.a();
      jl $$6 = jl.b;
      double $$7 = Double.MAX_VALUE;

      for (jl $$8 : new jl[]{jl.c, jl.d, jl.e, jl.f, jl.b}) {
         $$5.a($$3, $$8);
         if (!this.dX().a_($$5).m(this.dX(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == jl.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.af.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      ezh $$13 = this.dA().c(0.75);
      if ($$6.o() == jl.a.a) {
         this.n((double)($$12 * $$11), $$13.e, $$13.f);
      } else if ($$6.o() == jl.a.b) {
         this.n($$13.d, (double)($$12 * $$11), $$13.f);
      } else if ($$6.o() == jl.a.c) {
         this.n($$13.d, $$13.e, (double)($$12 * $$11));
      }
   }

   public void a(dvd $$0, ezh $$1) {
      this.n();
      this.V = $$1;
   }

   private static xh c(xh $$0) {
      xv $$1 = $$0.e().b($$0.a().a(null));

      for (xh $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public xh al() {
      xh $$0 = this.an();
      return $$0 != null ? c($$0) : this.cA();
   }

   protected xh cA() {
      return this.n.h();
   }

   public boolean u(btz $$0) {
      return this == $$0;
   }

   public float cB() {
      return 0.0F;
   }

   public void q(float $$0) {
   }

   public void r(float $$0) {
   }

   public boolean cC() {
      return true;
   }

   public boolean v(btz $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dX() == null ? "~NULL~" : this.dX().toString();
      return this.aD != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.al().getString(),
            this.o,
            $$0,
            this.dC(),
            this.dE(),
            this.dI(),
            this.aD
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.al().getString(),
            this.o,
            $$0,
            this.dC(),
            this.dE(),
            this.dI()
         );
   }

   public boolean b(bsp $$0) {
      return this.dS() || this.aU && !$$0.a(axb.d) && !$$0.h() || $$0.a(axb.i) && this.bj() || $$0.a(axb.m) && this.aq().a(axd.o);
   }

   public boolean cD() {
      return this.aU;
   }

   public void n(boolean $$0) {
      this.aU = $$0;
   }

   public void w(btz $$0) {
      this.b($$0.dC(), $$0.dE(), $$0.dI(), $$0.dN(), $$0.dP());
   }

   public void x(btz $$0) {
      uj $$1 = $$0.f(new uj());
      $$1.r("Dimension");
      this.g($$1);
      this.aT = $$0.aT;
      this.at = $$0.at;
   }

   @Nullable
   public btz b(esc $$0) {
      if (this.dX() instanceof arm $$1 && !this.dS()) {
         arm $$3 = $$0.a();
         List<btz> $$4 = this.da();
         this.ao();
         List<btz> $$5 = new ArrayList<>();

         for (btz $$6 : $$4) {
            float $$7 = $$6.dN() - this.dN();
            float $$8 = $$6.dP() - this.dP();
            float $$9 = $$0.d() + ($$0.g().contains(bvj.d) ? 0.0F : $$7);
            float $$10 = $$0.e() + ($$0.g().contains(bvj.e) ? 0.0F : $$8);
            btz $$11 = $$6.b($$0.a($$9, $$10));
            if ($$11 != null) {
               $$5.add($$11);
            }
         }

         $$1.ah().a("changeDimension");
         btz $$12 = $$3.ag() == $$1.ag() ? this : this.aq().a($$3, buf.s);
         if ($$12 != null) {
            if (this != $$12) {
               $$12.x(this);
               this.cE();
            }

            $$12.c($$0);
            $$12.aY();
            if (this != $$12) {
               $$3.d($$12);
            }

            for (btz $$13 : $$5) {
               $$13.a($$12, true);
            }

            $$1.h();
            $$3.h();
            $$0.h().onTransition($$12);
         }

         $$1.ah().c();
         return $$12;
      }

      return null;
   }

   protected void c(esc $$0) {
      bvi $$1 = bvi.a($$0);
      bvi $$2 = bvi.a(bvi.a(this), $$1, $$0.g());
      this.o($$2.a().d, $$2.a().e, $$2.a().f);
      this.v($$2.c());
      this.q($$2.c());
      this.w($$2.d());
      this.az();
      this.bA();
      this.h($$2.b());
   }

   public void f(jg $$0) {
      if (this.dX() instanceof arm $$1) {
         $$1.l().a(ars.e, new deb($$0), 3, $$0);
      }
   }

   protected void cE() {
      this.b(btz.c.e);
      if (this instanceof but $$0) {
         $$0.a(true, false);
      }
   }

   public ezh a(jl.a $$0, l.a $$1) {
      return ese.a($$1, $$0, this.dv(), this.a(this.ax()));
   }

   public boolean o(boolean $$0) {
      return ($$0 || !this.ca()) && this.bM();
   }

   public boolean a(dev $$0, dev $$1) {
      if ($$0.ag() == dev.k && $$1.ag() == dev.i) {
         for (btz $$2 : this.da()) {
            if ($$2 instanceof arn $$3 && !$$3.g) {
               return false;
            }
         }
      }

      return true;
   }

   public float a(den $$0, dea $$1, jg $$2, dvd $$3, ere $$4, float $$5) {
      return $$5;
   }

   public boolean a(den $$0, dea $$1, jg $$2, dvd $$3, float $$4) {
      return true;
   }

   public int cF() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bug.a(this.aq()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.o);
      $$0.a("Entity Name", () -> this.al().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dC(), this.dE(), this.dI()));
      $$0.a("Entity's Block location", p.a(this.dX(), azj.a(this.dC()), azj.a(this.dE()), azj.a(this.dI())));
      ezh $$1 = this.dA();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.d, $$1.e, $$1.f));
      $$0.a("Entity's Passengers", () -> this.da().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.dl()));
   }

   public boolean cG() {
      return this.bZ() && !this.R_();
   }

   public void a_(UUID $$0) {
      this.au = $$0;
      this.av = this.au.toString();
   }

   @Override
   public UUID cH() {
      return this.au;
   }

   public String cI() {
      return this.av;
   }

   @Override
   public String cJ() {
      return this.av;
   }

   public boolean cK() {
      return true;
   }

   public static double cL() {
      return m;
   }

   public static void b(double $$0) {
      m = $$0;
   }

   @Override
   public xh S_() {
      return fah.a(this.cs(), this.al()).a($$0 -> $$0.a(this.cR()).a(this.cI()));
   }

   public void b(@Nullable xh $$0) {
      this.am.a(aM, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public xh an() {
      return this.am.a(aM).orElse(null);
   }

   @Override
   public boolean am() {
      return this.am.a(aM).isPresent();
   }

   public void p(boolean $$0) {
      this.am.a(aN, $$0);
   }

   public boolean cM() {
      return this.am.a(aN);
   }

   public boolean a(arm $$0, double $$1, double $$2, double $$3, Set<bvj> $$4, float $$5, float $$6, boolean $$7) {
      float $$8 = azj.a($$6, -90.0F, 90.0F);
      btz $$9 = this.b(new esc($$0, new ezh($$1, $$2, $$3), ezh.c, $$5, $$8, $$4, esc.a));
      return $$9 != null;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dX() instanceof arm) {
         this.b($$0, $$1, $$2, this.dN(), this.dP());
         this.x();
      }
   }

   private void x() {
      this.dc().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.p.iterator();

         while (var1.hasNext()) {
            btz $$1 = (btz)var1.next();
            $$0.a($$1, btz::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.dC() + $$0, this.dE() + $$1, this.dI() + $$2);
   }

   public boolean cN() {
      return this.cM();
   }

   @Override
   public void a(List<ako.c<?>> $$0) {
   }

   @Override
   public void a(akk<?> $$0) {
      if (ar.equals($$0)) {
         this.j_();
      }
   }

   @Deprecated
   protected void cO() {
      bvh $$0 = this.ax();
      buc $$1 = this.a($$0);
      this.aZ = $$1;
      this.ba = $$1.c();
   }

   public void j_() {
      buc $$0 = this.aZ;
      bvh $$1 = this.ax();
      buc $$2 = this.a($$1);
      this.aZ = $$2;
      this.ba = $$2.c();
      this.az();
      boolean $$3 = $$2.a() <= 4.0F && $$2.b() <= 4.0F;
      if (!this.r.C && !this.al && !this.ae && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof coh)) {
         this.a($$0);
      }
   }

   public boolean a(buc $$0) {
      buc $$1 = this.a(this.ax());
      ezh $$2 = this.dv().b(0.0, (double)$$0.b() / 2.0, 0.0);
      double $$3 = (double)Math.max(0.0F, $$1.a() - $$0.a()) + 1.0E-6;
      double $$4 = (double)Math.max(0.0F, $$1.b() - $$0.b()) + 1.0E-6;
      fab $$5 = ezy.a(ezc.a($$2, $$3, $$4, $$3));
      Optional<ezh> $$6 = this.r.a(this, $$5, $$2, (double)$$1.a(), (double)$$1.b(), (double)$$1.a());
      if ($$6.isPresent()) {
         this.b($$6.get().b(0.0, (double)(-$$1.b()) / 2.0, 0.0));
         return true;
      } else {
         if ($$1.a() > $$0.a() && $$1.b() > $$0.b()) {
            fab $$7 = ezy.a(ezc.a($$2, $$3, 1.0E-6, $$3));
            Optional<ezh> $$8 = this.r.a(this, $$7, $$2, (double)$$1.a(), (double)$$0.b(), (double)$$1.a());
            if ($$8.isPresent()) {
               this.b($$8.get().b(0.0, (double)(-$$0.b()) / 2.0 + 1.0E-6, 0.0));
               return true;
            }
         }

         return false;
      }
   }

   public jl cP() {
      return jl.a((double)this.dN());
   }

   public jl cQ() {
      return this.cP();
   }

   protected xn cR() {
      return new xn(xn.a.c, new xn.b(this.aq(), this.cH(), this.al()));
   }

   public boolean a(arn $$0) {
      return true;
   }

   @Override
   public final ezc cS() {
      return this.aB;
   }

   public final void a(ezc $$0) {
      this.aB = $$0;
   }

   public final float d(bvh $$0) {
      return this.a($$0).c();
   }

   public final float cT() {
      return this.ba;
   }

   public ezh s(float $$0) {
      return this.cU();
   }

   protected ezh cU() {
      return new ezh(0.0, (double)this.cT(), (double)(this.ds() * 0.4F));
   }

   public bvn a_(int $$0) {
      return bvn.a;
   }

   @Override
   public void a(xh $$0) {
   }

   public dev cV() {
      return this.dX();
   }

   @Nullable
   public MinecraftServer cW() {
      return this.dX().o();
   }

   public bry a(coh $$0, ezh $$1, brx $$2) {
      return bry.e;
   }

   public boolean a(den $$0) {
      return false;
   }

   public void d(arn $$0) {
   }

   public void e(arn $$0) {
   }

   public float a(dol $$0) {
      float $$1 = azj.h(this.dN());
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

   public float a(dmu $$0) {
      float $$1 = azj.h(this.dN());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public boolean cX() {
      return false;
   }

   public cpc a(cpb $$0) {
      return this.aq().a(axd.r) ? cpc.b : cpc.a;
   }

   @Nullable
   public buv cY() {
      return null;
   }

   public final boolean cZ() {
      return this.cY() != null;
   }

   public final List<btz> da() {
      return this.p;
   }

   @Nullable
   public btz db() {
      return this.p.isEmpty() ? null : (btz)this.p.get(0);
   }

   public boolean y(btz $$0) {
      return this.p.contains($$0);
   }

   public boolean a(Predicate<btz> $$0) {
      UnmodifiableIterator var2 = this.p.iterator();

      while (var2.hasNext()) {
         btz $$1 = (btz)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<btz> D() {
      return this.p.stream().flatMap(btz::dc);
   }

   @Override
   public Stream<btz> dc() {
      return Stream.concat(Stream.of(this), this.D());
   }

   @Override
   public Stream<btz> dd() {
      return Stream.concat(this.p.stream().flatMap(btz::dd), Stream.of(this));
   }

   public Iterable<btz> de() {
      return () -> this.D().iterator();
   }

   public int df() {
      return (int)this.D().filter($$0 -> $$0 instanceof coh).count();
   }

   public boolean dg() {
      return this.df() == 1;
   }

   public btz dh() {
      btz $$0 = this;

      while ($$0.ca()) {
         $$0 = $$0.dl();
      }

      return $$0;
   }

   public boolean z(btz $$0) {
      return this.dh() == $$0.dh();
   }

   public boolean A(btz $$0) {
      if (!$$0.ca()) {
         return false;
      } else {
         btz $$1 = $$0.dl();
         return $$1 == this ? true : this.A($$1);
      }
   }

   public boolean di() {
      return this instanceof coh $$0 ? $$0.g() : this.dj();
   }

   public boolean dj() {
      return this.cY() instanceof coh $$0 ? $$0.g() : this.dk();
   }

   public boolean dk() {
      return !this.dX().C;
   }

   protected static ezh a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -azj.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = azj.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new ezh((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public ezh b(buv $$0) {
      return new ezh(this.dC(), this.cS().e, this.dI());
   }

   @Nullable
   public btz dl() {
      return this.q;
   }

   @Nullable
   public btz dm() {
      return this.q != null && this.q.cY() == this ? this.q : null;
   }

   public erj k_() {
      return erj.a;
   }

   public awl dn() {
      return awl.g;
   }

   protected int do() {
      return 1;
   }

   public ev dp() {
      return new ev(
         this, this.dv(), this.bV(), this.dX() instanceof arm ? (arm)this.dX() : null, this.H(), this.al().getString(), this.S_(), this.dX().o(), this
      );
   }

   protected int H() {
      return 0;
   }

   public boolean l(int $$0) {
      return this.H() >= $$0;
   }

   @Override
   public boolean l_() {
      return this.dX().ac().b(der.p);
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public boolean L_() {
      return true;
   }

   public void a(fh.a $$0, ezh $$1) {
      ezh $$2 = $$0.a(this);
      double $$3 = $$1.d - $$2.d;
      double $$4 = $$1.e - $$2.e;
      double $$5 = $$1.f - $$2.f;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.w(azj.h((float)(-(azj.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.v(azj.h((float)(azj.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.q(this.dN());
      this.P = this.dP();
      this.O = this.dN();
   }

   public float t(float $$0) {
      return azj.h($$0, this.O, this.az);
   }

   public boolean a(axp<erd> $$0, double $$1) {
      if (this.dq()) {
         return false;
      } else {
         ezc $$2 = this.cS().h(0.001);
         int $$3 = azj.a($$2.a);
         int $$4 = azj.c($$2.d);
         int $$5 = azj.a($$2.b);
         int $$6 = azj.c($$2.e);
         int $$7 = azj.a($$2.c);
         int $$8 = azj.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cK();
         boolean $$11 = false;
         ezh $$12 = ezh.c;
         int $$13 = 0;
         jg.a $$14 = new jg.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  ere $$18 = this.dX().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a(this.dX(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           ezh $$20 = $$18.c(this.dX(), $$14);
                           if ($$9 < 0.4) {
                              $$20 = $$20.c($$9);
                           }

                           $$12 = $$12.e($$20);
                           $$13++;
                        }
                     }
                  }
               }
            }
         }

         if ($$12.g() > 0.0) {
            if ($$13 > 0) {
               $$12 = $$12.c(1.0 / (double)$$13);
            }

            if (!(this instanceof coh)) {
               $$12 = $$12.d();
            }

            ezh $$21 = this.dA();
            $$12 = $$12.c($$1);
            double $$22 = 0.003;
            if (Math.abs($$21.d) < 0.003 && Math.abs($$21.f) < 0.003 && $$12.g() < 0.0045000000000000005) {
               $$12 = $$12.d().c(0.0045000000000000005);
            }

            this.h(this.dA().e($$12));
         }

         this.ai.put($$0, $$9);
         return $$11;
      }
   }

   public boolean dq() {
      ezc $$0 = this.cS().g(1.0);
      int $$1 = azj.a($$0.a);
      int $$2 = azj.c($$0.d);
      int $$3 = azj.a($$0.c);
      int $$4 = azj.c($$0.f);
      return !this.dX().b($$1, $$3, $$2, $$4);
   }

   public double b(axp<erd> $$0) {
      return this.ai.getDouble($$0);
   }

   public double dr() {
      return (double)this.cT() < 0.4 ? 0.0 : 0.4;
   }

   public final float ds() {
      return this.aZ.a();
   }

   public final float dt() {
      return this.aZ.b();
   }

   public zo<acd> a(arl $$0) {
      return new ace(this, $$0);
   }

   public buc a(bvh $$0) {
      return this.n.n();
   }

   public final bub du() {
      return this.aZ.d();
   }

   public ezh dv() {
      return this.s;
   }

   public ezh dw() {
      return this.dv();
   }

   @Override
   public jg dx() {
      return this.t;
   }

   public dvd dy() {
      if (this.bf == null) {
         this.bf = this.dX().a_(this.dx());
      }

      return this.bf;
   }

   public deb dz() {
      return this.u;
   }

   public ezh dA() {
      return this.v;
   }

   public void h(ezh $$0) {
      this.v = $$0;
   }

   public void i(ezh $$0) {
      this.h(this.dA().e($$0));
   }

   public void n(double $$0, double $$1, double $$2) {
      this.h(new ezh($$0, $$1, $$2));
   }

   public final int dB() {
      return this.t.u();
   }

   public final double dC() {
      return this.s.d;
   }

   public double c(double $$0) {
      return this.s.d + (double)this.ds() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.af.j() - 1.0) * $$0);
   }

   public final int dD() {
      return this.t.v();
   }

   public final double dE() {
      return this.s.e;
   }

   public double e(double $$0) {
      return this.s.e + (double)this.dt() * $$0;
   }

   public double dF() {
      return this.e(this.af.j());
   }

   public double dG() {
      return this.s.e + (double)this.ba;
   }

   public final int dH() {
      return this.t.w();
   }

   public final double dI() {
      return this.s.f;
   }

   public double f(double $$0) {
      return this.s.f + (double)this.ds() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.af.j() - 1.0) * $$0);
   }

   public final void o(double $$0, double $$1, double $$2) {
      if (this.s.d != $$0 || this.s.e != $$1 || this.s.f != $$2) {
         this.s = new ezh($$0, $$1, $$2);
         int $$3 = azj.a($$0);
         int $$4 = azj.a($$1);
         int $$5 = azj.a($$2);
         if ($$3 != this.t.u() || $$4 != this.t.v() || $$5 != this.t.w()) {
            this.t = new jg($$3, $$4, $$5);
            this.bf = null;
            if (ki.a($$3) != this.u.e || ki.a($$5) != this.u.f) {
               this.u = new deb(this.t);
            }
         }

         this.aR.a();
      }
   }

   public void dJ() {
   }

   public ezh u(float $$0) {
      return this.o($$0).b(0.0, (double)this.ba * 0.7, 0.0);
   }

   public void a(ace $$0) {
      int $$1 = $$0.b();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      double $$4 = $$0.i();
      this.f($$2, $$3, $$4);
      this.e($$2, $$3, $$4);
      this.w($$0.m());
      this.v($$0.n());
      this.e($$1);
      this.a_($$0.e());
   }

   @Nullable
   public cvx dK() {
      return null;
   }

   public void q(boolean $$0) {
      this.aw = $$0;
   }

   public boolean dL() {
      return !this.aq().a(axd.k);
   }

   public boolean dM() {
      return (this.aw || this.ax) && this.dL();
   }

   public float dN() {
      return this.az;
   }

   public float dO() {
      return this.dN();
   }

   public void v(float $$0) {
      if (!Float.isFinite($$0)) {
         ad.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.az = $$0;
      }
   }

   public float dP() {
      return this.aA;
   }

   public void w(float $$0) {
      if (!Float.isFinite($$0)) {
         ad.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aA = Math.clamp($$0 % 360.0F, -90.0F, 90.0F);
      }
   }

   public boolean dQ() {
      return false;
   }

   public float dR() {
      return 0.0F;
   }

   public void a(@Nullable btz $$0) {
   }

   public final boolean dS() {
      return this.aD != null;
   }

   @Nullable
   public btz.c dT() {
      return this.aD;
   }

   @Override
   public final void b(btz.c $$0) {
      if (this.aD == null) {
         this.aD = $$0;
      }

      if (this.aD.a()) {
         this.af();
      }

      this.da().forEach(btz::af);
      this.aR.a($$0);
   }

   protected void dU() {
      this.aD = null;
   }

   @Override
   public void a(dzi $$0) {
      this.aR = $$0;
   }

   @Override
   public boolean dV() {
      if (this.aD != null && !this.aD.b()) {
         return false;
      } else {
         return this.ca() ? false : !this.cb() || !this.dg();
      }
   }

   @Override
   public boolean dW() {
      return false;
   }

   public boolean a(dev $$0, jg $$1) {
      return true;
   }

   public dev dX() {
      return this.r;
   }

   protected void a(dev $$0) {
      this.r = $$0;
   }

   public bsq dY() {
      return this.dX().ak();
   }

   public kd dZ() {
      return this.dX().H_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = azj.d($$6, this.dC(), $$1);
      double $$8 = azj.d($$6, this.dE(), $$2);
      double $$9 = azj.d($$6, this.dI(), $$3);
      float $$10 = (float)azj.e($$6, (double)this.dN(), $$4);
      float $$11 = (float)azj.d($$6, (double)this.dP(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   public azr ea() {
      return this.af;
   }

   public ezh ai() {
      if (this.cY() instanceof coh $$0 && this.bM()) {
         return $$0.ai();
      }

      return this.dA();
   }

   @Nullable
   public cvx eb() {
      return null;
   }

   public Optional<alg<eub>> ec() {
      return this.n.k();
   }

   @FunctionalInterface
   public interface a {
      void accept(btz var1, double var2, double var4, double var6);
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
