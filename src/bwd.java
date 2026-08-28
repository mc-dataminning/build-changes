import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleListIterator;
import it.unimi.dsi.fastutil.floats.FloatArraySet;
import it.unimi.dsi.fastutil.floats.FloatArrays;
import it.unimi.dsi.fastutil.floats.FloatSet;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
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
import org.jetbrains.annotations.Contract;

public abstract class bwd implements akm, bue, eee, ffm, ke {
   public static final String v = "id";
   public static final String w = "Passengers";
   private static final AtomicInteger b = new AtomicInteger();
   public static final int x = 0;
   public static final int y = 60;
   public static final int z = 300;
   public static final int A = 1024;
   public static final float B = 0.2F;
   public static final double C = 0.500001;
   public static final double D = 0.999999;
   public static final int E = 140;
   public static final int F = 40;
   public static final int G = 3;
   private static final fed c = new fed(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double d = 0.014;
   private static final double k = 0.007;
   private static final double l = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double m = 1.0;
   private final bwm<?> n;
   private int o = b.incrementAndGet();
   public boolean I;
   private ImmutableList<bwd> p = ImmutableList.of();
   protected int J;
   @Nullable
   private bwd q;
   private div r;
   public double K;
   public double L;
   public double M;
   private fei s;
   private iu t;
   private dic u;
   private fei ay = fei.c;
   private float az;
   private float aA;
   public float N;
   public float O;
   private fed aB = c;
   private boolean aC;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected fei U = fei.c;
   @Nullable
   private bwd.e aD;
   public static final float V = 0.6F;
   public static final float W = 1.8F;
   public float X;
   public float Y;
   public double Z;
   private float aE = 1.0F;
   public double aa;
   public double ab;
   public double ac;
   public boolean ad;
   protected final azv ae = azv.a();
   public int af;
   private int aF = -this.dn();
   protected boolean ag;
   protected Object2DoubleMap<axr<ewf>> ah = new Object2DoubleArrayMap(2);
   protected boolean ai;
   private final Set<axr<ewf>> aG = new HashSet<>();
   public int aj;
   protected boolean ak = true;
   protected final akn al;
   protected static final akj<Byte> am = akn.a(bwd.class, akl.a);
   protected static final int an = 0;
   private static final int aH = 1;
   private static final int aI = 3;
   private static final int aJ = 4;
   private static final int aK = 5;
   protected static final int ao = 6;
   protected static final int ap = 7;
   private static final akj<Integer> aL = akn.a(bwd.class, akl.b);
   private static final akj<Optional<wy>> aM = akn.a(bwd.class, akl.g);
   private static final akj<Boolean> aN = akn.a(bwd.class, akl.k);
   private static final akj<Boolean> aO = akn.a(bwd.class, akl.k);
   private static final akj<Boolean> aP = akn.a(bwd.class, akl.k);
   protected static final akj<bxo> aq = akn.a(bwd.class, akl.w);
   private static final akj<Integer> aQ = akn.a(bwd.class, akl.b);
   private eef aR = eef.a;
   private final ait aS = new ait();
   public boolean ar;
   @Nullable
   public bxn as;
   private int aT;
   private boolean aU;
   protected UUID at = azm.a(this.ae);
   protected String au = this.at.toString();
   private boolean aV;
   private final Set<String> aW = Sets.newHashSet();
   private final double[] aX = new double[]{0.0, 0.0, 0.0};
   private long aY;
   private bwg aZ;
   private float ba;
   public boolean av;
   public boolean aw;
   public Optional<iu> ax = Optional.empty();
   private boolean bb = false;
   private float bc;
   private int bd;
   private boolean be;
   @Nullable
   private dzz bf = null;
   private final List<bwd.c> bg = new ArrayList<>();
   private final LongSet bh = new LongOpenHashSet();
   private final bwd.a bi = new bwd.a();

   public bwd(bwm<?> $$0, div $$1) {
      this.n = $$0;
      this.r = $$1;
      this.aZ = $$0.n();
      this.s = fei.c;
      this.t = iu.c;
      this.u = dic.e;
      akn.a $$2 = new akn.a(this);
      $$2.a(am, (byte)0);
      $$2.a(aL, this.cs());
      $$2.a(aN, false);
      $$2.a(aM, Optional.empty());
      $$2.a(aO, false);
      $$2.a(aP, false);
      $$2.a(aq, bxo.a);
      $$2.a(aQ, 0);
      this.a($$2);
      this.al = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.ba = this.aZ.c();
   }

   public boolean a(iu $$0, dzz $$1) {
      ffc $$2 = $$1.b(this.dV(), $$0, fen.a(this)).a($$0);
      return fez.c($$2, fez.a(this.cR()), fem.i);
   }

   public int f_() {
      ffp $$0 = this.cr();
      return $$0 != null && $$0.o().f() != null ? $$0.o().f() : 16777215;
   }

   public boolean U_() {
      return false;
   }

   public final void ao() {
      if (this.ca()) {
         this.bO();
      }

      if (this.bZ()) {
         this.bP();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.aS.e(new fei($$0, $$1, $$2));
   }

   public ait ap() {
      return this.aS;
   }

   public bwm<?> aq() {
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

   public void c(arq $$0) {
      this.a(bwd.e.a);
      this.a(eez.p);
   }

   public final void at() {
      this.a(bwd.e.b);
   }

   protected abstract void a(akn.a var1);

   public akn au() {
      return this.al;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bwd ? ((bwd)$$0).o == this.o : false;
   }

   @Override
   public int hashCode() {
      return this.o;
   }

   public void a(bwd.e $$0) {
      this.c($$0);
   }

   public void av() {
   }

   public void b(bwd.e $$0) {
   }

   public void b(bxo $$0) {
      this.al.a(aq, $$0);
   }

   public bxo aw() {
      return this.al.a(aq);
   }

   public boolean c(bxo $$0) {
      return this.aw() == $$0;
   }

   public boolean a(bwd $$0, double $$1) {
      return this.dt().a((jo)$$0.dt(), $$1);
   }

   public boolean a(bwd $$0, double $$1, double $$2) {
      double $$3 = $$0.dA() - this.dA();
      double $$4 = $$0.dC() - this.dC();
      double $$5 = $$0.dG() - this.dG();
      return azm.e($$3, $$5) < azm.k($$1) && azm.k($$4) < azm.k($$2);
   }

   protected void b(float $$0, float $$1) {
      this.w($$0 % 360.0F);
      this.x($$1 % 360.0F);
   }

   public final void b(fei $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      this.a(this.ax());
   }

   protected final fed ax() {
      return this.c(this.s);
   }

   protected fed c(fei $$0) {
      return this.aZ.a($$0);
   }

   protected void ay() {
      this.a_(this.s.d, this.s.e, this.s.f);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.x(this.dN() + $$2);
      this.w(this.dL() + $$3);
      this.x(azm.a(this.dN(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = azm.a(this.O, -90.0F, 90.0F);
      if (this.q != null) {
         this.q.k(this);
      }
   }

   public void h() {
      this.az();
   }

   public void az() {
      bqm $$0 = bql.a();
      $$0.a("entityBaseTick");
      this.bf = null;
      if (this.bZ() && this.dk().dQ()) {
         this.bP();
      }

      if (this.J > 0) {
         this.J--;
      }

      this.bW();
      if (this.bu()) {
         this.bv();
      }

      this.aw = this.av;
      this.av = false;
      this.bp();
      this.o();
      this.bo();
      if (this.dV() instanceof arq $$1) {
         if (this.aF > 0) {
            if (this.bi()) {
               this.h(this.aF - 4);
               if (this.aF < 0) {
                  this.aH();
               }
            } else {
               if (this.aF % 20 == 0 && !this.bw()) {
                  this.a($$1, this.dW().d(), 1.0F);
               }

               this.h(this.aF - 1);
            }

            if (this.cu() > 0) {
               this.k(0);
               this.aM();
            }
         }
      } else {
         this.aH();
      }

      if (this.bw()) {
         this.Z *= 0.5;
      }

      this.aA();
      if (!this.dV().C) {
         this.c(this.aF > 0);
      }

      this.ak = false;
      if (this.dV() instanceof arq $$2 && this instanceof bxa) {
         bxa.a_($$2, (bwd)((bxa)this));
      }

      $$0.c();
   }

   public void c(boolean $$0) {
      this.b(0, $$0 || this.be);
   }

   public void aA() {
      if (this.dC() < (double)(this.dV().G_() - 64)) {
         this.aI();
      }
   }

   public void aB() {
      this.aT = this.bX();
   }

   public void f(int $$0) {
      this.aT = $$0;
   }

   public int aC() {
      return this.aT;
   }

   public boolean aD() {
      return this.aT > 0;
   }

   protected void M() {
      if (this.aD()) {
         this.aT--;
      }
   }

   public void aE() {
      if (!this.bi()) {
         this.e(15.0F);
         if (this.dV() instanceof arq $$0 && this.a($$0, this.dW().e(), 4.0F) && this.aF() && !this.bb()) {
            $$0.a(null, this.dA(), this.dC(), this.dG(), awn.kB, this.dm(), 0.4F, 2.0F + this.ae.i() * 0.4F);
         }
      }
   }

   protected boolean aF() {
      return true;
   }

   public final void e(float $$0) {
      this.g(azm.d($$0 * 20.0F));
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
      this.at();
   }

   public boolean g(double $$0, double $$1, double $$2) {
      return this.b(this.cR().d($$0, $$1, $$2));
   }

   private boolean b(fed $$0) {
      return this.dV().a(this, $$0) && !this.dV().d($$0);
   }

   public void d(boolean $$0) {
      this.aC = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, fei $$1) {
      this.a($$0, this.P, $$1);
   }

   public void a(boolean $$0, boolean $$1, fei $$2) {
      this.aC = $$0;
      this.P = $$1;
      this.b($$0, $$2);
   }

   public boolean d(iu $$0) {
      return this.ax.isPresent() && this.ax.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable fei $$1) {
      if ($$0) {
         fed $$2 = this.cR();
         fed $$3 = new fed($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<iu> $$4 = this.r.h(this, $$3);
         if ($$4.isPresent() || this.bb) {
            this.ax = $$4;
         } else if ($$1 != null) {
            fed $$5 = $$3.d(-$$1.d, 0.0, -$$1.f);
            $$4 = this.r.h(this, $$5);
            this.ax = $$4;
         }

         this.bb = $$4.isEmpty();
      } else {
         this.bb = false;
         if (this.ax.isPresent()) {
            this.ax = Optional.empty();
         }
      }
   }

   public boolean aJ() {
      return this.aC;
   }

   public void a(bxg $$0, fei $$1) {
      if (this.ad) {
         this.a_(this.dA() + $$1.d, this.dC() + $$1.e, this.dG() + $$1.f);
      } else {
         if ($$0 == bxg.c) {
            $$1 = this.e($$1);
            if ($$1.equals(fei.c)) {
               return;
            }
         }

         bqm $$2 = bql.a();
         $$2.a("move");
         if (this.U.h() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = fei.c;
            this.i(fei.c);
         }

         $$1 = this.a($$1, $$0);
         fei $$3 = this.a($$1);
         double $$4 = $$3.h();
         if ($$4 > 1.0E-7 || $$1.h() - $$4 < 1.0E-7) {
            if (this.Z != 0.0 && $$4 >= 1.0) {
               fee $$5 = this.dV().a(new die(this.dt(), this.dt().e($$3), die.a.d, die.b.d, this));
               if ($$5.d() != feg.a.a) {
                  this.k();
               }
            }

            this.a_(this.dA() + $$3.d, this.dC() + $$3.e, this.dG() + $$3.f);
         }

         $$2.c();
         $$2.a("rest");
         boolean $$6 = !azm.b($$1.d, $$3.d);
         boolean $$7 = !azm.b($$1.f, $$3.f);
         this.P = $$6 || $$7;
         if (Math.abs($$1.e) > 0.0 || this.dg()) {
            this.Q = $$1.e != $$3.e;
            this.R = this.Q && $$1.e < 0.0;
            this.a(this.R, this.P, $$3);
         }

         if (this.P) {
            this.S = this.d($$3);
         } else {
            this.S = false;
         }

         iu $$8 = this.aP();
         dzz $$9 = this.dV().a_($$8);
         if (this.dg()) {
            this.a($$3.e, this.aJ(), $$9, $$8);
         }

         if (this.dQ()) {
            $$2.c();
         } else {
            if (this.P) {
               fei $$10 = this.dy();
               this.n($$6 ? 0.0 : $$10.d, $$10.e, $$7 ? 0.0 : $$10.f);
            }

            if (this.di()) {
               dma $$11 = $$9.b();
               if ($$1.e != $$3.e) {
                  $$11.a(this.dV(), this);
               }
            }

            if (!this.dV().w_() || this.dg()) {
               bwd.d $$12 = this.bg();
               if ($$12.a() && !this.bZ()) {
                  this.a($$12, $$3, $$8, $$9);
               }
            }

            float $$13 = this.aT();
            this.i(this.dy().d((double)$$13, 1.0, (double)$$13));
            $$2.c();
         }
      }
   }

   private void a(bwd.d $$0, fei $$1, iu $$2, dzz $$3) {
      float $$4 = 0.6F;
      float $$5 = (float)($$1.g() * 0.6F);
      float $$6 = (float)($$1.i() * 0.6F);
      iu $$7 = this.aR();
      dzz $$8 = this.dV().a_($$7);
      boolean $$9 = this.c($$8);
      this.X += $$9 ? $$5 : $$6;
      this.Y += $$5;
      if (this.X > this.aE && !$$8.l()) {
         boolean $$10 = $$7.equals($$2);
         boolean $$11 = this.a($$2, $$3, $$0.c(), $$10, $$1);
         if (!$$10) {
            $$11 |= this.a($$7, $$8, false, $$0.b(), $$1);
         }

         if ($$11) {
            this.aE = this.aU();
         } else if (this.bj()) {
            this.aE = this.aU();
            if ($$0.c()) {
               this.aY();
            }

            if ($$0.b()) {
               this.a(eez.Q);
            }
         }
      } else if ($$8.l()) {
         this.aO();
      }
   }

   public void aK() {
      this.a(this.bB(), this.s);
   }

   public void a(fei $$0, fei $$1) {
      if (this.aL()) {
         if (this.aJ()) {
            iu $$2 = this.aP();
            dzz $$3 = this.dV().a_($$2);
            $$3.b().a(this.dV(), $$2, $$3, this);
         }

         this.bg.add(new bwd.c($$0, $$1));
         List<bwd.c> $$4 = List.copyOf(this.bg);
         this.bg.clear();
         boolean $$5 = this.bY();
         this.bi.a($$5);
         this.a($$4, this.bi);
         if (this.bi.b) {
            this.aE();
         }

         if (!this.bi.a) {
            this.aH();
         }

         if ($$5 && !this.bY()) {
            this.aM();
         }

         if (!this.bi.a && this.aF <= 0) {
            this.h(-this.dn());
         }
      }
   }

   protected boolean aL() {
      return !this.dQ() && !this.ad;
   }

   private boolean c(dzz $$0) {
      return $$0.a(axc.aS) || $$0.a(dmc.ru);
   }

   private boolean a(iu $$0, dzz $$1, boolean $$2, boolean $$3, fei $$4) {
      if ($$1.l()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aJ() || $$5 || this.ci() && $$4.e == 0.0 || this.cq()) && !this.ck()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dV().a(eez.P, this.dt(), eez.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean d(fei $$0) {
      return false;
   }

   protected void aM() {
      if (!this.r.w_()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.kG, this.dm(), 0.7F, 1.6F + (this.ae.i() - this.ae.i()) * 0.4F);
      }
   }

   public void aN() {
      if (this.bY()) {
         this.aM();
      }

      this.aH();
   }

   protected void aO() {
      if (this.ba()) {
         this.aZ();
         if (this.bg().b()) {
            this.a(eez.x);
         }
      }
   }

   @Deprecated
   public iu aP() {
      return this.f(0.2F);
   }

   public iu aQ() {
      return this.f(0.500001F);
   }

   public iu aR() {
      return this.f(1.0E-5F);
   }

   protected iu f(float $$0) {
      if (this.ax.isPresent()) {
         iu $$1 = this.ax.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dzz $$2 = this.dV().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(axc.U)) && !$$2.a(axc.N) && !($$2.b() instanceof dpa) ? $$1.h(azm.a(this.s.e - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = azm.a(this.s.d);
         int $$4 = azm.a(this.s.e - (double)$$0);
         int $$5 = azm.a(this.s.f);
         return new iu($$3, $$4, $$5);
      }
   }

   protected float aS() {
      float $$0 = this.dV().a_(this.dv()).b().j();
      float $$1 = this.dV().a_(this.aQ()).b().j();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aT() {
      dzz $$0 = this.dV().a_(this.dv());
      float $$1 = $$0.b().i();
      if (!$$0.a(dmc.J) && !$$0.a(dmc.nG)) {
         return (double)$$1 == 1.0 ? this.dV().a_(this.aQ()).b().i() : $$1;
      } else {
         return $$1;
      }
   }

   protected fei a(fei $$0, bxg $$1) {
      return $$0;
   }

   protected fei e(fei $$0) {
      if ($$0.h() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dV().ae();
         if ($$1 != this.aY) {
            Arrays.fill(this.aX, 0.0);
            this.aY = $$1;
         }

         if ($$0.d != 0.0) {
            double $$2 = this.a(ja.a.a, $$0.d);
            return Math.abs($$2) <= 1.0E-5F ? fei.c : new fei($$2, 0.0, 0.0);
         } else if ($$0.e != 0.0) {
            double $$3 = this.a(ja.a.b, $$0.e);
            return Math.abs($$3) <= 1.0E-5F ? fei.c : new fei(0.0, $$3, 0.0);
         } else if ($$0.f != 0.0) {
            double $$4 = this.a(ja.a.c, $$0.f);
            return Math.abs($$4) <= 1.0E-5F ? fei.c : new fei(0.0, 0.0, $$4);
         } else {
            return fei.c;
         }
      }
   }

   private double a(ja.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = azm.a($$1 + this.aX[$$2], -0.51, 0.51);
      $$1 = $$3 - this.aX[$$2];
      this.aX[$$2] = $$3;
      return $$1;
   }

   private fei a(fei $$0) {
      fed $$1 = this.cR();
      List<ffc> $$2 = this.dV().c(this, $$1.b($$0));
      fei $$3 = $$0.h() == 0.0 ? $$0 : a(this, $$0, $$1, this.dV(), $$2);
      boolean $$4 = $$0.d != $$3.d;
      boolean $$5 = $$0.e != $$3.e;
      boolean $$6 = $$0.f != $$3.f;
      boolean $$7 = $$5 && $$0.e < 0.0;
      if (this.dP() > 0.0F && ($$7 || this.aJ()) && ($$4 || $$6)) {
         fed $$8 = $$7 ? $$1.d(0.0, $$3.e, 0.0) : $$1;
         fed $$9 = $$8.b($$0.d, (double)this.dP(), $$0.f);
         if (!$$7) {
            $$9 = $$9.b(0.0, -1.0E-5F, 0.0);
         }

         List<ffc> $$10 = a(this, this.r, $$2, $$9);
         float $$11 = (float)$$3.e;
         float[] $$12 = a($$8, $$10, this.dP(), $$11);

         for (float $$13 : $$12) {
            fei $$14 = a(new fei($$0.d, (double)$$13, $$0.f), $$8, $$10);
            if ($$14.j() > $$3.j()) {
               double $$15 = $$1.b - $$8.b;
               return $$14.b(0.0, -$$15, 0.0);
            }
         }
      }

      return $$3;
   }

   private static float[] a(fed $$0, List<ffc> $$1, float $$2, float $$3) {
      FloatSet $$4 = new FloatArraySet(4);

      for (ffc $$5 : $$1) {
         DoubleList $$6 = $$5.a(ja.a.b);
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

   public static fei a(@Nullable bwd $$0, fei $$1, fed $$2, div $$3, List<ffc> $$4) {
      List<ffc> $$5 = a($$0, $$3, $$4, $$2.b($$1));
      return a($$1, $$2, $$5);
   }

   private static List<ffc> a(@Nullable bwd $$0, div $$1, List<ffc> $$2, fed $$3) {
      Builder<ffc> $$4 = ImmutableList.builderWithExpectedSize($$2.size() + 1);
      if (!$$2.isEmpty()) {
         $$4.addAll($$2);
      }

      ebr $$5 = $$1.A_();
      boolean $$6 = $$0 != null && $$5.a($$0, $$3);
      if ($$6) {
         $$4.add($$5.c());
      }

      $$4.addAll($$1.e($$0, $$3));
      return $$4.build();
   }

   private static fei a(fei $$0, fed $$1, List<ffc> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.d;
         double $$4 = $$0.e;
         double $$5 = $$0.f;
         if ($$4 != 0.0) {
            $$4 = fez.a(ja.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = fez.a(ja.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = fez.a(ja.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = fez.a(ja.a.c, $$1, $$2, $$5);
         }

         return new fei($$3, $$4, $$5);
      }
   }

   protected float aU() {
      return (float)((int)this.X + 1);
   }

   protected awm aV() {
      return awn.kK;
   }

   protected awm aW() {
      return awn.kJ;
   }

   protected awm aX() {
      return awn.kJ;
   }

   public void b(fei $$0, fei $$1) {
      this.bg.add(new bwd.c($$0, $$1));
   }

   private void a(List<bwd.c> $$0, bwd.f $$1) {
      if (this.aL()) {
         LongSet $$2 = this.bh;

         for (bwd.c $$3 : $$0) {
            fei $$4 = $$3.a();
            fei $$5 = $$3.b();
            fed $$6 = this.c($$5).h(1.0E-5F);

            for (iu $$7 : dib.a($$4, $$5, $$6)) {
               if (!this.bK()) {
                  return;
               }

               dzz $$8 = this.dV().a_($$7);
               if (!$$8.l() && $$2.add($$7.a())) {
                  ffc $$9 = $$8.a((dib)this.dV(), $$7, this);
                  boolean $$10 = $$9 == fez.b() || this.a($$4, $$5, $$9.a(new fei($$7)).e());
                  if ($$10) {
                     try {
                        $$8.a(this.dV(), $$7, this);
                        this.a($$8);
                     } catch (Throwable var18) {
                        o $$12 = o.a(var18, "Colliding entity with block");
                        p $$13 = $$12.a("Block being collided with");
                        p.a($$13, this.dV(), $$7, $$8);
                        p $$14 = $$12.a("Entity being checked for collision");
                        this.a($$14);
                        throw new z($$12);
                     }
                  }

                  boolean $$15 = this.a($$8.y(), $$7, $$4, $$5);
                  $$1.a($$8, $$10, $$15);
               }
            }
         }

         $$2.clear();
      }
   }

   private boolean a(ewg $$0, iu $$1, fei $$2, fei $$3) {
      fed $$4 = $$0.e(this.dV(), $$1);
      return $$4 != null && this.a($$2, $$3, List.of($$4));
   }

   private boolean a(fei $$0, fei $$1, List<fed> $$2) {
      fed $$3 = this.c($$0);
      fei $$4 = $$1.d($$0);
      return $$3.a($$4, $$2);
   }

   protected void a(dzz $$0) {
   }

   public iu a(arq $$0, iu $$1) {
      iu $$2 = $$0.aa();
      fei $$3 = $$2.b();
      int $$4 = $$0.m($$2).a(efy.a.f, $$2.u(), $$2.w()) + 1;
      return iu.a($$3.d, (double)$$4, $$3.f);
   }

   public void a(je<eez> $$0, @Nullable bwd $$1) {
      this.dV().a($$1, $$0, this.s);
   }

   public void a(je<eez> $$0) {
      this.a($$0, this);
   }

   private void c(iu $$0, dzz $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.j();
      }
   }

   protected void aY() {
      bwd $$0 = Objects.requireNonNullElse(this.cW(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      fei $$2 = $$0.dy();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      this.g($$3);
   }

   protected iu e(iu $$0) {
      iu $$1 = $$0.d();
      dzz $$2 = this.dV().a_($$1);
      return !$$2.a(axc.bp) && !$$2.a(axc.bq) ? $$0 : $$1;
   }

   protected void a(dzz $$0, dzz $$1) {
      dtv $$2 = $$0.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dzz $$0) {
      dtv $$1 = $$0.A();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(iu $$0, dzz $$1) {
      dtv $$2 = $$1.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dzz $$0) {
      return $$0.a(axc.bo) && this.af >= this.bd + 20;
   }

   private void j() {
      this.bc = this.bc * (float)Math.pow(0.997, (double)(this.af - this.bd));
      this.bc = Math.min(1.0F, this.bc + 0.07F);
      float $$0 = 0.5F + this.bc * this.ae.i() * 1.2F;
      float $$1 = 0.1F + this.bc * 1.2F;
      this.a(awn.E, $$1, $$0);
      this.bd = this.af;
   }

   protected void g(float $$0) {
      this.a(this.aV(), $$0, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
   }

   protected void aZ() {
   }

   protected boolean ba() {
      return false;
   }

   public void a(awm $$0, float $$1, float $$2) {
      if (!this.bb()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), $$0, this.dm(), $$1, $$2);
      }
   }

   public void a(awm $$0) {
      if (!this.bb()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean bb() {
      return this.al.a(aO);
   }

   public void e(boolean $$0) {
      this.al.a(aO, $$0);
   }

   public boolean bc() {
      return this.al.a(aP);
   }

   public void f(boolean $$0) {
      this.al.a(aP, $$0);
   }

   protected double bd() {
      return 0.0;
   }

   public final double be() {
      return this.bc() ? 0.0 : this.bd();
   }

   protected void bf() {
      double $$0 = this.be();
      if ($$0 != 0.0) {
         this.i(this.dy().b(0.0, -$$0, 0.0));
      }
   }

   protected bwd.d bg() {
      return bwd.d.d;
   }

   public boolean bh() {
      return false;
   }

   public final void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.do()) {
         this.b($$3, new fei($$0, $$1, $$2));
         iu $$4 = this.aP();
         dzz $$5 = this.dV().a_($$4);
         this.a($$1, $$3, $$5, $$4);
      }
   }

   protected void a(double $$0, boolean $$1, dzz $$2, iu $$3) {
      if (!this.bj() && $$0 < 0.0) {
         this.Z -= (double)((float)$$0);
      }

      if ($$1) {
         if (this.Z > 0.0) {
            $$2.b().a(this.dV(), $$2, $$3, this, this.Z);
            this.dV().a(eez.A, this.s, eez.a.a(this, this.ax.<dzz>map($$0x -> this.dV().a_($$0x)).orElse($$2)));
         }

         this.k();
      }
   }

   public boolean bi() {
      return this.aq().d();
   }

   public boolean a(double $$0, float $$1, bus $$2) {
      if (this.n.a(axf.o)) {
         return false;
      } else {
         this.b($$0, $$1, $$2);
         return false;
      }
   }

   protected void b(double $$0, float $$1, bus $$2) {
      if (this.ca()) {
         for (bwd $$3 : this.cY()) {
            $$3.a($$0, $$1, $$2);
         }
      }
   }

   public boolean bj() {
      return this.ag;
   }

   boolean bk() {
      iu $$0 = this.dv();
      return this.dV().r($$0) || this.dV().r(iu.a((double)$$0.u(), this.cR().e, (double)$$0.w()));
   }

   public boolean bl() {
      return this.bj() || this.bk();
   }

   public boolean bm() {
      return this.bj() || this.bw();
   }

   public boolean bn() {
      return this.ai && this.bj();
   }

   public void bo() {
      if (this.ck()) {
         this.i(this.cj() && this.bj() && !this.bZ());
      } else {
         this.i(this.cj() && this.bn() && !this.bZ() && this.dV().b_(this.t).a(axh.a));
      }
   }

   protected boolean bp() {
      this.ah.clear();
      this.bq();
      double $$0 = this.dV().B_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(axh.b, $$0);
      return this.bj() || $$1;
   }

   void bq() {
      if (this.dk() instanceof cti $$0 && !$$0.bn()) {
         this.ag = false;
         return;
      }

      if (this.a(axh.a, 0.014)) {
         if (!this.ag && !this.ak) {
            this.br();
         }

         this.k();
         this.ag = true;
      } else {
         this.ag = false;
      }
   }

   private void o() {
      this.ai = this.a(axh.a);
      this.aG.clear();
      double $$0 = this.dE();
      if (this.dk() instanceof cti $$2 && !$$2.bn() && $$2.cR().e >= $$0 && $$2.cR().b <= $$0) {
         return;
      }

      iu $$3 = iu.a(this.dA(), $$0, this.dG());
      ewg $$4 = this.dV().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a(this.dV(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aG::add);
      }
   }

   protected void br() {
      bwd $$0 = Objects.requireNonNullElse(this.cW(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      fei $$2 = $$0.dy();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aW(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      } else {
         this.a(this.aX(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      }

      float $$4 = (float)azm.a(this.dC());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.aZ.a() * 20.0F; $$5++) {
         double $$6 = (this.ae.j() * 2.0 - 1.0) * (double)this.aZ.a();
         double $$7 = (this.ae.j() * 2.0 - 1.0) * (double)this.aZ.a();
         this.dV().a(lx.d, this.dA() + $$6, (double)($$4 + 1.0F), this.dG() + $$7, $$2.d, $$2.e - this.ae.j() * 0.2F, $$2.f);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.aZ.a() * 20.0F; $$8++) {
         double $$9 = (this.ae.j() * 2.0 - 1.0) * (double)this.aZ.a();
         double $$10 = (this.ae.j() * 2.0 - 1.0) * (double)this.aZ.a();
         this.dV().a(lx.ap, this.dA() + $$9, (double)($$4 + 1.0F), this.dG() + $$10, $$2.d, $$2.e, $$2.f);
      }

      this.a(eez.O);
   }

   @Deprecated
   protected dzz bs() {
      return this.dV().a_(this.aP());
   }

   public dzz bt() {
      return this.dV().a_(this.aR());
   }

   public boolean bu() {
      return this.cj() && !this.bj() && !this.U_() && !this.ci() && !this.bw() && this.bK();
   }

   protected void bv() {
      iu $$0 = this.aP();
      dzz $$1 = this.dV().a_($$0);
      if ($$1.o() != dsm.a) {
         fei $$2 = this.dy();
         iu $$3 = this.dv();
         double $$4 = this.dA() + (this.ae.j() - 0.5) * (double)this.aZ.a();
         double $$5 = this.dG() + (this.ae.j() - 0.5) * (double)this.aZ.a();
         if ($$3.u() != $$0.u()) {
            $$4 = azm.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = azm.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dV().a(new lp(lx.b, $$1), $$4, this.dC() + 0.1, $$5, $$2.d * -4.0, 1.5, $$2.f * -4.0);
      }
   }

   public boolean a(axr<ewf> $$0) {
      return this.aG.contains($$0);
   }

   public boolean bw() {
      return !this.ak && this.ah.getDouble(axh.b) > 0.0;
   }

   public void a(float $$0, fei $$1) {
      fei $$2 = a($$1, $$0, this.dL());
      this.i(this.dy().e($$2));
   }

   protected static fei a(fei $$0, float $$1, float $$2) {
      double $$3 = $$0.h();
      if ($$3 < 1.0E-7) {
         return fei.c;
      } else {
         fei $$4 = ($$3 > 1.0 ? $$0.d() : $$0).c((double)$$1);
         float $$5 = azm.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = azm.b($$2 * (float) (Math.PI / 180.0));
         return new fei($$4.d * (double)$$6 - $$4.f * (double)$$5, $$4.e, $$4.f * (double)$$6 + $$4.d * (double)$$5);
      }
   }

   @Deprecated
   public float bx() {
      return this.dV().f(this.dz(), this.dF()) ? this.dV().y(iu.a(this.dA(), this.dE(), this.dG())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.c($$3, $$4);
   }

   public void c(float $$0, float $$1) {
      this.w($$0 % 360.0F);
      this.x(azm.a($$1, -90.0F, 90.0F) % 360.0F);
      this.N = this.dL();
      this.O = this.dN();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = azm.a($$0, -3.0E7, 3.0E7);
      double $$4 = azm.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void f(fei $$0) {
      this.e($$0.d, $$0.e, $$0.f);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dL(), this.dN());
   }

   public void a(iu $$0, float $$1, float $$2) {
      this.b($$0.c(), $$1, $$2);
   }

   public void b(fei $$0, float $$1, float $$2) {
      this.b($$0.d, $$0.e, $$0.f, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.o($$0, $$1, $$2);
      this.w($$3);
      this.x($$4);
      this.by();
      this.ay();
   }

   public final void by() {
      this.bz();
      this.bA();
   }

   public final void c(fei $$0, float $$1, float $$2) {
      this.k($$0);
      this.f($$1, $$2);
   }

   protected void bz() {
      this.k(this.s);
   }

   public void bA() {
      this.f(this.dL(), this.dN());
   }

   private void k(fei $$0) {
      this.K = this.aa = $$0.d;
      this.L = this.ab = $$0.e;
      this.M = this.ac = $$0.f;
   }

   private void f(float $$0, float $$1) {
      this.N = $$0;
      this.O = $$1;
   }

   public final fei bB() {
      return new fei(this.aa, this.ab, this.ac);
   }

   public float f(bwd $$0) {
      float $$1 = (float)(this.dA() - $$0.dA());
      float $$2 = (float)(this.dC() - $$0.dC());
      float $$3 = (float)(this.dG() - $$0.dG());
      return azm.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dA() - $$0;
      double $$4 = this.dC() - $$1;
      double $$5 = this.dG() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(bwd $$0) {
      return this.g($$0.dt());
   }

   public double g(fei $$0) {
      double $$1 = this.dA() - $$0.d;
      double $$2 = this.dC() - $$0.e;
      double $$3 = this.dG() - $$0.f;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void a_(cqy $$0) {
   }

   public void h(bwd $$0) {
      if (!this.z($$0)) {
         if (!$$0.ad && !this.ad) {
            double $$1 = $$0.dA() - this.dA();
            double $$2 = $$0.dG() - this.dG();
            double $$3 = azm.a($$1, $$2);
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
               if (!this.ca() && this.bH()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.ca() && $$0.bH()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void h(fei $$0) {
      this.j($$0.d, $$0.e, $$0.f);
   }

   public void j(double $$0, double $$1, double $$2) {
      this.i(this.dy().b($$0, $$1, $$2));
      this.ar = true;
   }

   protected void bC() {
      this.T = true;
   }

   @Deprecated
   public final void a(bus $$0, float $$1) {
      if (this.r instanceof arq $$2) {
         this.a($$2, $$0, $$1);
      }
   }

   @Deprecated
   public final boolean b(bus $$0, float $$1) {
      return this.r instanceof arq $$2 ? this.a($$2, $$0, $$1) : this.b($$0);
   }

   public abstract boolean a(arq var1, bus var2, float var3);

   public boolean b(bus $$0) {
      return false;
   }

   public final fei h(float $$0) {
      return this.d(this.i($$0), this.j($$0));
   }

   public ja bD() {
      return ja.a(this.h(1.0F));
   }

   public float i(float $$0) {
      return this.k($$0);
   }

   public float j(float $$0) {
      return this.l($$0);
   }

   public float k(float $$0) {
      return $$0 == 1.0F ? this.dN() : azm.h($$0, this.O, this.dN());
   }

   public float l(float $$0) {
      return $$0 == 1.0F ? this.dL() : azm.i($$0, this.N, this.dL());
   }

   public final fei d(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = azm.b($$3);
      float $$5 = azm.a($$3);
      float $$6 = azm.b($$2);
      float $$7 = azm.a($$2);
      return new fei((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final fei m(float $$0) {
      return this.e(this.i($$0), this.j($$0));
   }

   protected final fei e(float $$0, float $$1) {
      return this.d($$0 - 90.0F, $$1);
   }

   public final fei bE() {
      return new fei(this.dA(), this.dE(), this.dG());
   }

   public final fei n(float $$0) {
      double $$1 = azm.d((double)$$0, this.K, this.dA());
      double $$2 = azm.d((double)$$0, this.L, this.dC()) + (double)this.cS();
      double $$3 = azm.d((double)$$0, this.M, this.dG());
      return new fei($$1, $$2, $$3);
   }

   public fei o(float $$0) {
      return this.n($$0);
   }

   public final fei p(float $$0) {
      double $$1 = azm.d((double)$$0, this.K, this.dA());
      double $$2 = azm.d((double)$$0, this.L, this.dC());
      double $$3 = azm.d((double)$$0, this.M, this.dG());
      return new fei($$1, $$2, $$3);
   }

   public feg a(double $$0, float $$1, boolean $$2) {
      fei $$3 = this.n($$1);
      fei $$4 = this.h($$1);
      fei $$5 = $$3.b($$4.d * $$0, $$4.e * $$0, $$4.f * $$0);
      return this.dV().a(new die($$3, $$5, die.a.b, $$2 ? die.b.c : die.b.a, this));
   }

   public boolean bF() {
      return this.bK() && this.bG();
   }

   public boolean bG() {
      return false;
   }

   public boolean bH() {
      return false;
   }

   public void a(bwd $$0, bus $$1) {
      if ($$0 instanceof arr) {
         ap.d.a((arr)$$0, this, $$1);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.dA() - $$0;
      double $$4 = this.dC() - $$1;
      double $$5 = this.dG() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cR().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * m;
      return $$0 < $$1 * $$1;
   }

   public boolean d(tz $$0) {
      if (this.aD != null && !this.aD.b()) {
         return false;
      } else {
         String $$1 = this.bJ();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.f($$0);
            return true;
         }
      }
   }

   public boolean e(tz $$0) {
      return this.bZ() ? false : this.d($$0);
   }

   public tz f(tz $$0) {
      try {
         if (this.q != null) {
            $$0.a("Pos", this.a(this.q.dA(), this.dC(), this.q.dG()));
         } else {
            $$0.a("Pos", this.a(this.dA(), this.dC(), this.dG()));
         }

         fei $$1 = this.dy();
         $$0.a("Motion", this.a($$1.d, $$1.e, $$1.f));
         $$0.a("Rotation", this.a(this.dL(), this.dN()));
         $$0.a("fall_distance", this.Z);
         $$0.a("Fire", (short)this.aF);
         $$0.a("Air", (short)this.ct());
         $$0.a("OnGround", this.aJ());
         $$0.a("Invulnerable", this.aU);
         $$0.a("PortalCooldown", this.aT);
         $$0.a("UUID", this.cG());
         wy $$2 = this.an();
         if ($$2 != null) {
            ale<uw> $$3 = this.dX().a(un.a);
            $$0.a("CustomName", xa.a, $$3, $$2);
         }

         if (this.cL()) {
            $$0.a("CustomNameVisible", this.cL());
         }

         if (this.bb()) {
            $$0.a("Silent", this.bb());
         }

         if (this.bc()) {
            $$0.a("NoGravity", this.bc());
         }

         if (this.aV) {
            $$0.a("Glowing", true);
         }

         int $$4 = this.cu();
         if ($$4 > 0) {
            $$0.a("TicksFrozen", this.cu());
         }

         if (this.be) {
            $$0.a("HasVisualFire", this.be);
         }

         if (!this.aW.isEmpty()) {
            uf $$5 = new uf();

            for (String $$6 : this.aW) {
               $$5.add(uu.a($$6));
            }

            $$0.a("Tags", $$5);
         }

         this.b($$0);
         if (this.ca()) {
            uf $$7 = new uf();

            for (bwd $$8 : this.cY()) {
               tz $$9 = new tz();
               if ($$8.d($$9)) {
                  $$7.add($$9);
               }
            }

            if (!$$7.isEmpty()) {
               $$0.a("Passengers", $$7);
            }
         }

         return $$0;
      } catch (Throwable var9) {
         o $$11 = o.a(var9, "Saving entity NBT");
         p $$12 = $$11.a("Entity being saved");
         this.a($$12);
         throw new z($$11);
      }
   }

   public void g(tz $$0) {
      try {
         uf $$1 = $$0.c("Pos", 6);
         uf $$2 = $$0.c("Motion", 6);
         uf $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.n(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         this.ar = true;
         double $$7 = 3.0000512E7;
         this.o(azm.a($$1.h(0), -3.0000512E7, 3.0000512E7), azm.a($$1.h(1), -2.0E7, 2.0E7), azm.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.w($$3.i(0));
         this.x($$3.i(1));
         this.by();
         this.r(this.dL());
         this.s(this.dL());
         this.Z = $$0.k("fall_distance");
         this.aF = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.j($$0.g("Air"));
         }

         this.aC = $$0.q("OnGround");
         this.aU = $$0.q("Invulnerable");
         this.aT = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.at = $$0.a("UUID");
            this.au = this.at.toString();
         }

         if (!Double.isFinite(this.dA()) || !Double.isFinite(this.dC()) || !Double.isFinite(this.dG())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dL()) && Double.isFinite((double)this.dN())) {
            this.ay();
            this.b(this.dL(), this.dN());
            ale<uw> $$8 = this.dX().a(un.a);
            this.b($$0.<wy>a("CustomName", xa.a, $$8).orElse(null));
            this.o($$0.q("CustomNameVisible"));
            this.e($$0.q("Silent"));
            this.f($$0.q("NoGravity"));
            this.j($$0.q("Glowing"));
            this.k($$0.h("TicksFrozen"));
            this.be = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.aW.clear();
               uf $$9 = $$0.c("Tags", 8);
               int $$10 = Math.min($$9.size(), 1024);

               for (int $$11 = 0; $$11 < $$10; $$11++) {
                  this.aW.add($$9.j($$11));
               }
            }

            this.a($$0);
            if (this.bI()) {
               this.ay();
            }
         } else {
            throw new IllegalStateException("Entity has invalid rotation");
         }
      } catch (Throwable var17) {
         o $$13 = o.a(var17, "Loading entity NBT");
         p $$14 = $$13.a("Entity being loaded");
         this.a($$14);
         throw new z($$13);
      }
   }

   protected boolean bI() {
      return true;
   }

   @Nullable
   protected final String bJ() {
      bwm<?> $$0 = this.aq();
      alg $$1 = bwm.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(tz var1);

   protected abstract void b(tz var1);

   protected uf a(double... $$0) {
      uf $$1 = new uf();

      for (double $$2 : $$0) {
         $$1.add(ua.a($$2));
      }

      return $$1;
   }

   protected uf a(float... $$0) {
      uf $$1 = new uf();

      for (float $$2 : $$0) {
         $$1.add(uc.a($$2));
      }

      return $$1;
   }

   @Nullable
   public cnd a(arq $$0, diu $$1) {
      return this.a($$0, $$1, 0);
   }

   @Nullable
   public cnd a(arq $$0, diu $$1, int $$2) {
      return this.a($$0, new cyy($$1), (float)$$2);
   }

   @Nullable
   public cnd a(arq $$0, cyy $$1) {
      return this.a($$0, $$1, 0.0F);
   }

   @Nullable
   public cnd a(arq $$0, cyy $$1, float $$2) {
      if ($$1.f()) {
         return null;
      } else {
         cnd $$3 = new cnd($$0, this.dA(), this.dC() + (double)$$2, this.dG(), $$1);
         $$3.j();
         $$0.b($$3);
         return $$3;
      }
   }

   public boolean bK() {
      return !this.dQ();
   }

   public boolean bL() {
      if (this.ad) {
         return false;
      } else {
         float $$0 = this.aZ.a() * 0.8F;
         fed $$1 = fed.a(this.bE(), (double)$$0, 1.0E-6, (double)$$0);
         return iu.b($$1).anyMatch($$1x -> {
            dzz $$2 = this.dV().a_($$1x);
            return !$$2.l() && $$2.j(this.dV(), $$1x) && fez.c($$2.g(this.dV(), $$1x).a($$1x), fez.a($$1), fem.i);
         });
      }
   }

   public bub a(cqy $$0, bua $$1) {
      if (this.bK() && this instanceof bxa $$2) {
         if ($$2.C() == $$0) {
            if (!this.dV().w_()) {
               if ($$0.fU()) {
                  $$2.z();
               } else {
                  $$2.y();
               }

               this.a(eez.r, $$0);
            }

            return bub.a.b();
         }

         cyy $$3 = $$0.b($$1);
         if ($$3.a(czc.vQ) && $$2.p()) {
            if (!this.dV().w_()) {
               $$2.a_($$0, true);
            }

            $$3.h(1);
            return bub.a;
         }
      }

      return bub.e;
   }

   public boolean i(bwd $$0) {
      return $$0.bM() && !this.z($$0);
   }

   public boolean bM() {
      return false;
   }

   public void r() {
      this.i(fei.c);
      this.h();
      if (this.bZ()) {
         this.dk().j(this);
      }
   }

   public final void j(bwd $$0) {
      if (this.y($$0)) {
         this.a($$0, bwd::a_);
      }
   }

   protected void a(bwd $$0, bwd.b $$1) {
      fei $$2 = this.m($$0);
      fei $$3 = $$0.l(this);
      $$1.accept($$0, $$2.d - $$3.d, $$2.e - $$3.e, $$2.f - $$3.f);
   }

   public void k(bwd $$0) {
   }

   public fei l(bwd $$0) {
      return this.ds().b(bwe.b, 0, this.az);
   }

   public fei m(bwd $$0) {
      return this.dt().e(this.a($$0, this.aZ, 1.0F));
   }

   protected fei a(bwd $$0, bwg $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static fei a(bwd $$0, bwd $$1, bwf $$2) {
      int $$3 = $$0.cY().indexOf($$1);
      return $$2.c(bwe.a, $$3, $$0.az);
   }

   public boolean n(bwd $$0) {
      return this.a($$0, false);
   }

   public boolean bN() {
      return this instanceof bxc;
   }

   public boolean a(bwd $$0, boolean $$1) {
      if ($$0 == this.q) {
         return false;
      } else if (!$$0.bQ()) {
         return false;
      } else if (!this.dV().w_() && !$$0.n.b()) {
         return false;
      } else {
         for (bwd $$2 = $$0; $$2.q != null; $$2 = $$2.q) {
            if ($$2.q == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bZ()) {
               this.bP();
            }

            this.b(bxo.a);
            this.q = $$0;
            this.q.p(this);
            $$0.D().filter($$0x -> $$0x instanceof arr).forEach($$0x -> ap.U.a((arr)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bwd $$0) {
      return !this.cd() && this.J <= 0;
   }

   public void bO() {
      for (int $$0 = this.p.size() - 1; $$0 >= 0; $$0--) {
         ((bwd)this.p.get($$0)).bP();
      }
   }

   public void ae() {
      if (this.q != null) {
         bwd $$0 = this.q;
         this.q = null;
         $$0.q(this);
      }
   }

   public void bP() {
      this.ae();
   }

   protected void p(bwd $$0) {
      if ($$0.dk() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.p.isEmpty()) {
            this.p = ImmutableList.of($$0);
         } else {
            List<bwd> $$1 = Lists.newArrayList(this.p);
            if (!this.dV().C && $$0 instanceof cqy && !(this.cZ() instanceof cqy)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.p = ImmutableList.copyOf($$1);
         }

         this.a(eez.s, $$0);
      }
   }

   protected void q(bwd $$0) {
      if ($$0.dk() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.p.size() == 1 && this.p.get(0) == $$0) {
            this.p = ImmutableList.of();
         } else {
            this.p = this.p.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(eez.q, $$0);
      }
   }

   protected boolean r(bwd $$0) {
      return this.p.isEmpty();
   }

   protected boolean bQ() {
      return true;
   }

   public final boolean bR() {
      return this.N_() != null && this.N_().d();
   }

   public final void d(fei $$0, float $$1, float $$2) {
      bwx $$3 = this.N_();
      if ($$3 != null) {
         $$3.a($$0, $$1, $$2);
      } else {
         this.b($$0);
         this.b($$1, $$2);
      }
   }

   @Nullable
   public bwx N_() {
      return null;
   }

   public void a(float $$0, int $$1) {
      this.r($$0);
   }

   public float bS() {
      return 0.0F;
   }

   public fei bT() {
      return this.d(this.dN(), this.dL());
   }

   public fei a(cyu $$0) {
      if (!(this instanceof cqy $$1)) {
         return fei.c;
      } else {
         boolean $$2 = $$1.fb().a($$0) && !$$1.fa().a($$0);
         bwv $$3 = $$2 ? $$1.fx().e() : $$1.fx();
         return this.d(0.0F, this.dL() + (float)($$3 == bwv.b ? 80 : -80)).c(0.5);
      }
   }

   public feh bU() {
      return new feh(this.dN(), this.dL());
   }

   public fei bV() {
      return fei.a(this.bU());
   }

   public void a(dry $$0, iu $$1) {
      if (this.aD()) {
         this.aB();
      } else {
         if (this.as == null || !this.as.a($$0)) {
            this.as = new bxn($$0, $$1.j());
         } else if (!this.as.e()) {
            this.as.a($$1.j());
            this.as.a(true);
         }
      }
   }

   protected void bW() {
      if (this.dV() instanceof arq $$0) {
         this.M();
         if (this.as != null) {
            if (this.as.a($$0, this, this.n(false))) {
               bqm $$2 = bql.a();
               $$2.a("portal");
               this.aB();
               exg $$3 = this.as.a($$0, this);
               if ($$3 != null) {
                  arq $$4 = $$3.b();
                  if ($$0.p().a((div)$$4) && ($$4.aj() == $$0.aj() || this.a($$0, $$4))) {
                     this.b($$3);
                  }
               }

               $$2.c();
            } else if (this.as.b()) {
               this.as = null;
            }
         }
      }
   }

   public int bX() {
      bwd $$0 = this.cZ();
      return $$0 instanceof arr ? $$0.bX() : 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
   }

   public void c(bus $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dpy.a(this);
      }
   }

   public void q(float $$0) {
   }

   public boolean bY() {
      boolean $$0 = this.dV() != null && this.dV().C;
      return !this.bi() && (this.aF > 0 || $$0 && this.i(0));
   }

   public boolean bZ() {
      return this.dk() != null;
   }

   public boolean ca() {
      return !this.p.isEmpty();
   }

   public boolean cb() {
      return this.aq().a(axf.p);
   }

   public boolean cc() {
      return !this.aq().a(axf.q);
   }

   public void g(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean cd() {
      return this.i(1);
   }

   public boolean ce() {
      return this.cd();
   }

   public boolean cf() {
      return this.cd();
   }

   public boolean cg() {
      return this.cd();
   }

   public boolean ch() {
      return this.cd();
   }

   public boolean ci() {
      return this.c(bxo.f);
   }

   public boolean cj() {
      return this.i(3);
   }

   public void h(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean ck() {
      return this.i(4);
   }

   public boolean cl() {
      return this.c(bxo.d);
   }

   public boolean cm() {
      return this.cl() && !this.bj();
   }

   public void i(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cn() {
      return this.aV;
   }

   public final void j(boolean $$0) {
      this.aV = $$0;
      this.b(6, this.co());
   }

   public boolean co() {
      return this.dV().w_() ? this.i(6) : this.aV;
   }

   public boolean cp() {
      return this.i(5);
   }

   public boolean d(cqy $$0) {
      if ($$0.U_()) {
         return false;
      } else {
         ffp $$1 = this.cr();
         return $$1 != null && $$0 != null && $$0.cr() == $$1 && $$1.j() ? false : this.cp();
      }
   }

   public boolean cq() {
      return false;
   }

   public void a(BiConsumer<eew<?>, arq> $$0) {
   }

   @Nullable
   public ffi cr() {
      return this.dV().R().e(this.cI());
   }

   public final boolean s(@Nullable bwd $$0) {
      return $$0 == null ? false : this == $$0 || this.t($$0) || $$0.t(this);
   }

   protected boolean t(bwd $$0) {
      return this.a($$0.cr());
   }

   public boolean a(@Nullable ffp $$0) {
      return this.cr() != null ? this.cr().a($$0) : false;
   }

   public void k(boolean $$0) {
      this.b(5, $$0);
   }

   protected boolean i(int $$0) {
      return (this.al.a(am) & 1 << $$0) != 0;
   }

   protected void b(int $$0, boolean $$1) {
      byte $$2 = this.al.a(am);
      if ($$1) {
         this.al.a(am, (byte)($$2 | 1 << $$0));
      } else {
         this.al.a(am, (byte)($$2 & ~(1 << $$0)));
      }
   }

   public int cs() {
      return 300;
   }

   public int ct() {
      return this.al.a(aL);
   }

   public void j(int $$0) {
      this.al.a(aL, $$0);
   }

   public int cu() {
      return this.al.a(aQ);
   }

   public void k(int $$0) {
      this.al.a(aQ, $$0);
   }

   public float cv() {
      int $$0 = this.cx();
      return (float)Math.min(this.cu(), $$0) / (float)$$0;
   }

   public boolean cw() {
      return this.cu() >= this.cx();
   }

   public int cx() {
      return 140;
   }

   public void a(arq $$0, bxb $$1) {
      this.h(this.aF + 1);
      if (this.aF == 0) {
         this.e(8.0F);
      }

      this.a($$0, this.dW().c(), 5.0F);
   }

   public void a(boolean $$0, iu $$1) {
      a(this, $$0, $$1);
   }

   protected static void a(bwd $$0, boolean $$1, iu $$2) {
      fei $$3 = $$0.dy();
      double $$4;
      if ($$1) {
         $$4 = Math.max(-0.9, $$3.e - 0.03);
      } else {
         $$4 = Math.min(1.8, $$3.e + 0.1);
      }

      $$0.n($$3.d, $$4, $$3.f);
      a($$0.r, $$2);
   }

   protected static void a(div $$0, iu $$1) {
      if ($$0 instanceof arq $$2) {
         for (int $$3 = 0; $$3 < 2; $$3++) {
            $$2.a(lx.ap, (double)$$1.u() + $$0.A.j(), (double)($$1.v() + 1), (double)$$1.w() + $$0.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            $$2.a(lx.d, (double)$$1.u() + $$0.A.j(), (double)($$1.v() + 1), (double)$$1.w() + $$0.A.j(), 1, 0.0, 0.01, 0.0, 0.2);
         }
      }
   }

   public void l(boolean $$0) {
      b(this, $$0);
   }

   protected static void b(bwd $$0, boolean $$1) {
      fei $$2 = $$0.dy();
      double $$3;
      if ($$1) {
         $$3 = Math.max(-0.3, $$2.e - 0.03);
      } else {
         $$3 = Math.min(0.7, $$2.e + 0.06);
      }

      $$0.n($$2.d, $$3, $$2.f);
      $$0.k();
   }

   public boolean a(arq $$0, bxc $$1) {
      return true;
   }

   public void cy() {
      if (this.dy().b() > -0.5 && this.Z > 1.0) {
         this.Z = 1.0;
      }
   }

   public void k() {
      this.Z = 0.0;
   }

   protected void m(double $$0, double $$1, double $$2) {
      iu $$3 = iu.a($$0, $$1, $$2);
      fei $$4 = new fei($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      iu.a $$5 = new iu.a();
      ja $$6 = ja.b;
      double $$7 = Double.MAX_VALUE;

      for (ja $$8 : new ja[]{ja.c, ja.d, ja.e, ja.f, ja.b}) {
         $$5.a($$3, $$8);
         if (!this.dV().a_($$5).m(this.dV(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == ja.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ae.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      fei $$13 = this.dy().c(0.75);
      if ($$6.o() == ja.a.a) {
         this.n((double)($$12 * $$11), $$13.e, $$13.f);
      } else if ($$6.o() == ja.a.b) {
         this.n($$13.d, (double)($$12 * $$11), $$13.f);
      } else if ($$6.o() == ja.a.c) {
         this.n($$13.d, $$13.e, (double)($$12 * $$11));
      }
   }

   public void a(dzz $$0, fei $$1) {
      this.k();
      this.U = $$1;
   }

   private static wy a(wy $$0) {
      xm $$1 = $$0.e().b($$0.a().a(null));

      for (wy $$2 : $$0.c()) {
         $$1.b(a($$2));
      }

      return $$1;
   }

   @Override
   public wy al() {
      wy $$0 = this.an();
      return $$0 != null ? a($$0) : this.cz();
   }

   protected wy cz() {
      return this.n.h();
   }

   public boolean u(bwd $$0) {
      return this == $$0;
   }

   public float cA() {
      return 0.0F;
   }

   public void r(float $$0) {
   }

   public void s(float $$0) {
   }

   public boolean cB() {
      return true;
   }

   public boolean v(bwd $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dV() == null ? "~NULL~" : this.dV().toString();
      return this.aD != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.al().getString(),
            this.o,
            $$0,
            this.dA(),
            this.dC(),
            this.dG(),
            this.aD
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.al().getString(),
            this.o,
            $$0,
            this.dA(),
            this.dC(),
            this.dG()
         );
   }

   protected final boolean d(bus $$0) {
      return this.dQ() || this.aU && !$$0.a(axd.d) && !$$0.h() || $$0.a(axd.i) && this.bi() || $$0.a(axd.m) && this.aq().a(axf.o);
   }

   public boolean cC() {
      return this.aU;
   }

   public void m(boolean $$0) {
      this.aU = $$0;
   }

   public void w(bwd $$0) {
      this.b($$0.dA(), $$0.dC(), $$0.dG(), $$0.dL(), $$0.dN());
   }

   public void x(bwd $$0) {
      tz $$1 = $$0.f(new tz());
      $$1.r("Dimension");
      this.g($$1);
      this.aT = $$0.aT;
      this.as = $$0.as;
   }

   @Nullable
   public bwd b(exg $$0) {
      if (this.dV() instanceof arq $$1 && !this.dQ()) {
         arq $$3 = $$0.b();
         boolean $$4 = $$3.aj() != $$1.aj();
         if (!$$0.h()) {
            this.bP();
         }

         if ($$4) {
            return this.b($$3, $$0);
         }

         return this.a($$1, $$0);
      }

      return null;
   }

   private bwd a(arq $$0, exg $$1) {
      for (bwd $$2 : this.cY()) {
         $$2.b(this.a($$1, $$2));
      }

      bqm $$3 = bql.a();
      $$3.a("teleportSameDimension");
      this.a(bxp.a($$1), $$1.i());
      if (!$$1.h()) {
         this.a($$1);
      }

      $$1.j().onTransition(this);
      $$3.c();
      return this;
   }

   private bwd b(arq $$0, exg $$1) {
      List<bwd> $$2 = this.cY();
      List<bwd> $$3 = new ArrayList<>($$2.size());
      this.bO();

      for (bwd $$4 : $$2) {
         bwd $$5 = $$4.b(this.a($$1, $$4));
         if ($$5 != null) {
            $$3.add($$5);
         }
      }

      bqm $$6 = bql.a();
      $$6.a("teleportCrossDimension");
      bwd $$7 = this.aq().a($$0, bwl.s);
      if ($$7 == null) {
         $$6.c();
         return null;
      } else {
         $$7.x(this);
         this.cD();
         $$7.a(bxp.a($$1), $$1.i());
         $$0.d($$7);

         for (bwd $$8 : $$3) {
            $$8.a($$7, true);
         }

         $$0.i();
         $$1.j().onTransition($$7);
         $$6.c();
         return $$7;
      }
   }

   private exg a(exg $$0, bwd $$1) {
      float $$2 = $$0.e() + ($$0.i().contains(bxq.d) ? 0.0F : $$1.dL() - this.dL());
      float $$3 = $$0.f() + ($$0.i().contains(bxq.e) ? 0.0F : $$1.dN() - this.dN());
      fei $$4 = $$1.dt().d(this.dt());
      fei $$5 = $$0.c().b($$0.i().contains(bxq.a) ? 0.0 : $$4.a(), $$0.i().contains(bxq.b) ? 0.0 : $$4.b(), $$0.i().contains(bxq.c) ? 0.0 : $$4.c());
      return $$0.a($$5).a($$2, $$3).a();
   }

   private void a(exg $$0) {
      bwd $$1 = this.cW();

      for (bwd $$2 : this.dc()) {
         if ($$2 instanceof arr) {
            arr $$3 = (arr)$$2;
            if ($$1 != null && $$3.ar() == $$1.ar()) {
               $$3.f.b(agc.a(this.ar(), bxp.a($$0), $$0.i(), this.aC));
            } else {
               $$3.f.b(agc.a(this.ar(), bxp.a(this), Set.of(), this.aC));
            }
         }
      }
   }

   public void a(bxp $$0, Set<bxq> $$1) {
      bxp $$2 = bxp.a(this);
      bxp $$3 = bxp.a($$2, $$0, $$1);
      this.o($$3.a().d, $$3.a().e, $$3.a().f);
      this.w($$3.c());
      this.r($$3.c());
      this.x($$3.d());
      this.ay();
      this.by();
      this.i($$3.b());
      this.bg.clear();
   }

   public void a(float $$0, float $$1) {
      this.w($$0);
      this.r($$0);
      this.x($$1);
      this.bA();
   }

   public void f(iu $$0) {
      if (this.dV() instanceof arq $$1) {
         $$1.m().a(arx.g, new dic($$0), 3);
      }
   }

   protected void cD() {
      this.c(bwd.e.e);
      if (this instanceof bxa $$0) {
         $$0.z();
      }
   }

   public fei a(ja.a $$0, l.a $$1) {
      return exf.a($$1, $$0, this.dt(), this.a(this.aw()));
   }

   public boolean n(boolean $$0) {
      return ($$0 || !this.bZ()) && this.bK();
   }

   public boolean a(div $$0, div $$1) {
      if ($$0.aj() == div.k && $$1.aj() == div.i) {
         for (bwd $$2 : this.cY()) {
            if ($$2 instanceof arr $$3 && !$$3.i) {
               return false;
            }
         }
      }

      return true;
   }

   public float a(dio $$0, dib $$1, iu $$2, dzz $$3, ewg $$4, float $$5) {
      return $$5;
   }

   public boolean a(dio $$0, dib $$1, iu $$2, dzz $$3, float $$4) {
      return true;
   }

   public int cE() {
      return 3;
   }

   public boolean g_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bwm.a(this.aq()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.o);
      $$0.a("Entity Name", () -> this.al().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dA(), this.dC(), this.dG()));
      $$0.a("Entity's Block location", p.a(this.dV(), azm.a(this.dA()), azm.a(this.dC()), azm.a(this.dG())));
      fei $$1 = this.dy();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.d, $$1.e, $$1.f));
      $$0.a("Entity's Passengers", () -> this.cY().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.dk()));
   }

   public boolean cF() {
      return this.bY() && !this.U_();
   }

   public void a_(UUID $$0) {
      this.at = $$0;
      this.au = this.at.toString();
   }

   @Override
   public UUID cG() {
      return this.at;
   }

   public String cH() {
      return this.au;
   }

   @Override
   public String cI() {
      return this.au;
   }

   public boolean cJ() {
      return true;
   }

   public static double cK() {
      return m;
   }

   public static void b(double $$0) {
      m = $$0;
   }

   @Override
   public wy m_() {
      return ffi.a(this.cr(), this.al()).a($$0 -> $$0.a(this.cQ()).a(this.cH()));
   }

   public void b(@Nullable wy $$0) {
      this.al.a(aM, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public wy an() {
      return this.al.a(aM).orElse(null);
   }

   @Override
   public boolean h_() {
      return this.al.a(aM).isPresent();
   }

   public void o(boolean $$0) {
      this.al.a(aN, $$0);
   }

   public boolean cL() {
      return this.al.a(aN);
   }

   public boolean a(arq $$0, double $$1, double $$2, double $$3, Set<bxq> $$4, float $$5, float $$6, boolean $$7) {
      bwd $$8 = this.b(new exg($$0, new fei($$1, $$2, $$3), fei.c, $$5, $$6, $$4, exg.a));
      return $$8 != null;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dV() instanceof arq) {
         this.b($$0, $$1, $$2, this.dL(), this.dN());
         this.v();
      }
   }

   private void v() {
      this.da().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.p.iterator();

         while (var1.hasNext()) {
            bwd $$1 = (bwd)var1.next();
            $$0.a($$1, bwd::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.dA() + $$0, this.dC() + $$1, this.dG() + $$2);
   }

   public boolean cM() {
      return this.cL();
   }

   @Override
   public void a(List<akn.c<?>> $$0) {
   }

   @Override
   public void a(akj<?> $$0) {
      if (aq.equals($$0)) {
         this.i_();
      }
   }

   @Deprecated
   protected void cN() {
      bxo $$0 = this.aw();
      bwg $$1 = this.a($$0);
      this.aZ = $$1;
      this.ba = $$1.c();
   }

   public void i_() {
      bwg $$0 = this.aZ;
      bxo $$1 = this.aw();
      bwg $$2 = this.a($$1);
      this.aZ = $$2;
      this.ba = $$2.c();
      this.ay();
      boolean $$3 = $$2.a() <= 4.0F && $$2.b() <= 4.0F;
      if (!this.r.C && !this.ak && !this.ad && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cqy)) {
         this.a($$0);
      }
   }

   public boolean a(bwg $$0) {
      bwg $$1 = this.a(this.aw());
      fei $$2 = this.dt().b(0.0, (double)$$0.b() / 2.0, 0.0);
      double $$3 = (double)Math.max(0.0F, $$1.a() - $$0.a()) + 1.0E-6;
      double $$4 = (double)Math.max(0.0F, $$1.b() - $$0.b()) + 1.0E-6;
      ffc $$5 = fez.a(fed.a($$2, $$3, $$4, $$3));
      Optional<fei> $$6 = this.r.a(this, $$5, $$2, (double)$$1.a(), (double)$$1.b(), (double)$$1.a());
      if ($$6.isPresent()) {
         this.b($$6.get().b(0.0, (double)(-$$1.b()) / 2.0, 0.0));
         return true;
      } else {
         if ($$1.a() > $$0.a() && $$1.b() > $$0.b()) {
            ffc $$7 = fez.a(fed.a($$2, $$3, 1.0E-6, $$3));
            Optional<fei> $$8 = this.r.a(this, $$7, $$2, (double)$$1.a(), (double)$$0.b(), (double)$$1.a());
            if ($$8.isPresent()) {
               this.b($$8.get().b(0.0, (double)(-$$0.b()) / 2.0 + 1.0E-6, 0.0));
               return true;
            }
         }

         return false;
      }
   }

   public ja cO() {
      return ja.a((double)this.dL());
   }

   public ja cP() {
      return this.cO();
   }

   protected xe cQ() {
      return new xe.c(new xe.b(this.aq(), this.cG(), this.al()));
   }

   public boolean a(arr $$0) {
      return true;
   }

   @Override
   public final fed cR() {
      return this.aB;
   }

   public final void a(fed $$0) {
      this.aB = $$0;
   }

   public final float d(bxo $$0) {
      return this.a($$0).c();
   }

   public final float cS() {
      return this.ba;
   }

   public fei t(float $$0) {
      return this.cT();
   }

   protected fei cT() {
      return new fei(0.0, (double)this.cS(), (double)(this.dq() * 0.4F));
   }

   public bxt a_(int $$0) {
      return bxt.a;
   }

   public div cU() {
      return this.dV();
   }

   @Nullable
   public MinecraftServer cV() {
      return this.dV().p();
   }

   public bub a(cqy $$0, fei $$1, bua $$2) {
      return bub.e;
   }

   public boolean a(dio $$0) {
      return false;
   }

   public void d(arr $$0) {
   }

   public void e(arr $$0) {
   }

   public float a(dst $$0) {
      float $$1 = azm.h(this.dL());
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

   public float a(drc $$0) {
      float $$1 = azm.h(this.dL());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public crt a(crs $$0) {
      return this.aq().a(axf.r) ? crt.b : crt.a;
   }

   @Nullable
   public bxc cW() {
      return null;
   }

   public final boolean cX() {
      return this.cW() != null;
   }

   public final List<bwd> cY() {
      return this.p;
   }

   @Nullable
   public bwd cZ() {
      return this.p.isEmpty() ? null : (bwd)this.p.get(0);
   }

   public boolean y(bwd $$0) {
      return this.p.contains($$0);
   }

   public boolean a(Predicate<bwd> $$0) {
      UnmodifiableIterator var2 = this.p.iterator();

      while (var2.hasNext()) {
         bwd $$1 = (bwd)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bwd> D() {
      return this.p.stream().flatMap(bwd::da);
   }

   @Override
   public Stream<bwd> da() {
      return Stream.concat(Stream.of(this), this.D());
   }

   @Override
   public Stream<bwd> db() {
      return Stream.concat(this.p.stream().flatMap(bwd::db), Stream.of(this));
   }

   public Iterable<bwd> dc() {
      return () -> this.D().iterator();
   }

   public int dd() {
      return (int)this.D().filter($$0 -> $$0 instanceof cqy).count();
   }

   public boolean de() {
      return this.dd() == 1;
   }

   public bwd df() {
      bwd $$0 = this;

      while ($$0.bZ()) {
         $$0 = $$0.dk();
      }

      return $$0;
   }

   public boolean z(bwd $$0) {
      return this.df() == $$0.df();
   }

   public boolean A(bwd $$0) {
      if (!$$0.bZ()) {
         return false;
      } else {
         bwd $$1 = $$0.dk();
         return $$1 == this ? true : this.A($$1);
      }
   }

   public final boolean dg() {
      return this.r.w_() ? this.dh() : !this.L_();
   }

   protected boolean dh() {
      bxc $$0 = this.cW();
      return $$0 != null && $$0.dh();
   }

   public boolean L_() {
      bxc $$0 = this.cW();
      return $$0 != null && $$0.L_();
   }

   public boolean di() {
      return this.dg();
   }

   public boolean dj() {
      return this.dg();
   }

   protected static fei a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -azm.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = azm.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new fei((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public fei b(bxc $$0) {
      return new fei(this.dA(), this.cR().e, this.dG());
   }

   @Nullable
   public bwd dk() {
      return this.q;
   }

   @Nullable
   public bwd dl() {
      return this.q != null && this.q.cW() == this ? this.q : null;
   }

   public ewl j_() {
      return ewl.a;
   }

   public awo dm() {
      return awo.g;
   }

   protected int dn() {
      return 1;
   }

   public ei d(arq $$0) {
      return new ei(eh.a, this.dt(), this.bU(), $$0, 0, this.al().getString(), this.m_(), $$0.p(), this);
   }

   public void a(eu.a $$0, fei $$1) {
      fei $$2 = $$0.a(this);
      double $$3 = $$1.d - $$2.d;
      double $$4 = $$1.e - $$2.e;
      double $$5 = $$1.f - $$2.f;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.x(azm.h((float)(-(azm.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.w(azm.h((float)(azm.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.r(this.dL());
      this.O = this.dN();
      this.N = this.dL();
   }

   public float u(float $$0) {
      return azm.h($$0, this.N, this.az);
   }

   public boolean a(axr<ewf> $$0, double $$1) {
      if (this.do()) {
         return false;
      } else {
         fed $$2 = this.cR().h(0.001);
         int $$3 = azm.a($$2.a);
         int $$4 = azm.c($$2.d);
         int $$5 = azm.a($$2.b);
         int $$6 = azm.c($$2.e);
         int $$7 = azm.a($$2.c);
         int $$8 = azm.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cJ();
         boolean $$11 = false;
         fei $$12 = fei.c;
         int $$13 = 0;
         iu.a $$14 = new iu.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  ewg $$18 = this.dV().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a(this.dV(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           fei $$20 = $$18.c(this.dV(), $$14);
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

            if (!(this instanceof cqy)) {
               $$12 = $$12.d();
            }

            fei $$21 = this.dy();
            $$12 = $$12.c($$1);
            double $$22 = 0.003;
            if (Math.abs($$21.d) < 0.003 && Math.abs($$21.f) < 0.003 && $$12.g() < 0.0045000000000000005) {
               $$12 = $$12.d().c(0.0045000000000000005);
            }

            this.i(this.dy().e($$12));
         }

         this.ah.put($$0, $$9);
         return $$11;
      }
   }

   public boolean do() {
      fed $$0 = this.cR().g(1.0);
      int $$1 = azm.a($$0.a);
      int $$2 = azm.c($$0.d);
      int $$3 = azm.a($$0.c);
      int $$4 = azm.c($$0.f);
      return !this.dV().b($$1, $$3, $$2, $$4);
   }

   public double b(axr<ewf> $$0) {
      return this.ah.getDouble($$0);
   }

   public double dp() {
      return (double)this.cS() < 0.4 ? 0.0 : 0.4;
   }

   public final float dq() {
      return this.aZ.a();
   }

   public final float dr() {
      return this.aZ.b();
   }

   public zf<abu> a(aro $$0) {
      return new abv(this, $$0);
   }

   public bwg a(bxo $$0) {
      return this.n.n();
   }

   public final bwf ds() {
      return this.aZ.d();
   }

   public fei dt() {
      return this.s;
   }

   public fei du() {
      return this.dt();
   }

   @Override
   public iu dv() {
      return this.t;
   }

   public dzz dw() {
      if (this.bf == null) {
         this.bf = this.dV().a_(this.dv());
      }

      return this.bf;
   }

   public dic dx() {
      return this.u;
   }

   public fei dy() {
      return this.ay;
   }

   public void i(fei $$0) {
      this.ay = $$0;
   }

   public void j(fei $$0) {
      this.i(this.dy().e($$0));
   }

   public void n(double $$0, double $$1, double $$2) {
      this.i(new fei($$0, $$1, $$2));
   }

   public final int dz() {
      return this.t.u();
   }

   public final double dA() {
      return this.s.d;
   }

   public double c(double $$0) {
      return this.s.d + (double)this.dq() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ae.j() - 1.0) * $$0);
   }

   public final int dB() {
      return this.t.v();
   }

   public final double dC() {
      return this.s.e;
   }

   public double e(double $$0) {
      return this.s.e + (double)this.dr() * $$0;
   }

   public double dD() {
      return this.e(this.ae.j());
   }

   public double dE() {
      return this.s.e + (double)this.ba;
   }

   public final int dF() {
      return this.t.w();
   }

   public final double dG() {
      return this.s.f;
   }

   public double f(double $$0) {
      return this.s.f + (double)this.dq() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ae.j() - 1.0) * $$0);
   }

   public final void o(double $$0, double $$1, double $$2) {
      if (this.s.d != $$0 || this.s.e != $$1 || this.s.f != $$2) {
         this.s = new fei($$0, $$1, $$2);
         int $$3 = azm.a($$0);
         int $$4 = azm.a($$1);
         int $$5 = azm.a($$2);
         if ($$3 != this.t.u() || $$4 != this.t.v() || $$5 != this.t.w()) {
            this.t = new iu($$3, $$4, $$5);
            this.bf = null;
            if (jx.a($$3) != this.u.h || jx.a($$5) != this.u.i) {
               this.u = new dic(this.t);
            }
         }

         this.aR.a();
      }
   }

   public void dH() {
   }

   public fei v(float $$0) {
      return this.p($$0).b(0.0, (double)this.ba * 0.7, 0.0);
   }

   public void a(abv $$0) {
      int $$1 = $$0.b();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      double $$4 = $$0.i();
      this.f($$2, $$3, $$4);
      this.b($$2, $$3, $$4, $$0.n(), $$0.m());
      this.e($$1);
      this.a_($$0.e());
      fei $$5 = new fei($$0.j(), $$0.k(), $$0.l());
      this.i($$5);
   }

   @Nullable
   public cyy dI() {
      return null;
   }

   public void p(boolean $$0) {
      this.av = $$0;
   }

   public boolean dJ() {
      return !this.aq().a(axf.k);
   }

   public boolean dK() {
      return (this.av || this.aw) && this.dJ();
   }

   public float dL() {
      return this.az;
   }

   public float dM() {
      return this.dL();
   }

   public void w(float $$0) {
      if (!Float.isFinite($$0)) {
         af.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.az = $$0;
      }
   }

   public float dN() {
      return this.aA;
   }

   public void x(float $$0) {
      if (!Float.isFinite($$0)) {
         af.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aA = Math.clamp($$0 % 360.0F, -90.0F, 90.0F);
      }
   }

   public boolean dO() {
      return false;
   }

   public float dP() {
      return 0.0F;
   }

   public void b_(@Nullable bwd $$0) {
   }

   @Override
   public final boolean dQ() {
      return this.aD != null;
   }

   @Nullable
   public bwd.e dR() {
      return this.aD;
   }

   @Override
   public final void c(bwd.e $$0) {
      if (this.aD == null) {
         this.aD = $$0;
      }

      if (this.aD.a()) {
         this.bP();
      }

      this.cY().forEach(bwd::bP);
      this.aR.a($$0);
      this.b($$0);
   }

   protected void dS() {
      this.aD = null;
   }

   @Override
   public void a(eef $$0) {
      this.aR = $$0;
   }

   @Override
   public boolean dT() {
      if (this.aD != null && !this.aD.b()) {
         return false;
      } else {
         return this.bZ() ? false : !this.ca() || !this.de();
      }
   }

   @Override
   public boolean dU() {
      return false;
   }

   public boolean c(arq $$0, iu $$1) {
      return true;
   }

   public div dV() {
      return this.r;
   }

   protected void a(div $$0) {
      this.r = $$0;
   }

   public but dW() {
      return this.dV().al();
   }

   public js dX() {
      return this.dV().F_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = azm.d($$6, this.dA(), $$1);
      double $$8 = azm.d($$6, this.dC(), $$2);
      double $$9 = azm.d($$6, this.dG(), $$3);
      float $$10 = (float)azm.e($$6, (double)this.dL(), $$4);
      float $$11 = (float)azm.d($$6, (double)this.dN(), $$5);
      this.a_($$7, $$8, $$9);
      this.b($$10, $$11);
   }

   public azv dY() {
      return this.ae;
   }

   public fei ah() {
      if (this.cW() instanceof cqy $$0 && this.bK()) {
         return $$0.ah();
      }

      return this.dy();
   }

   @Nullable
   public cyy dZ() {
      return null;
   }

   public Optional<alf<eze>> ea() {
      return this.n.j();
   }

   protected void a(ke $$0) {
      this.a($$0, kj.g);
   }

   public final void c(cyy $$0) {
      this.a($$0.a());
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.g ? c((ki<T>)$$0, this.an()) : null;
   }

   @Nullable
   @Contract("_,!null->!null;_,_->_")
   protected static <T> T c(ki<T> $$0, @Nullable Object $$1) {
      return (T)$$1;
   }

   public <T> void d(ki<T> $$0, T $$1) {
      this.b($$0, $$1);
   }

   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.g) {
         this.b(c(kj.g, $$1));
         return true;
      } else {
         return false;
      }
   }

   protected <T> boolean a(ke $$0, ki<T> $$1) {
      T $$2 = $$0.a($$1);
      return $$2 != null ? this.b($$1, $$2) : false;
   }

   static class a implements bwd.f {
      boolean a = false;
      boolean b = false;

      public void a(boolean $$0) {
         this.a = $$0;
         this.b = false;
      }

      @Override
      public void a(dzz $$0, boolean $$1, boolean $$2) {
         boolean $$3 = $$1 && $$0.a(dmc.ru);
         boolean $$4 = $$1 && $$0.a(axc.aN);
         boolean $$5 = $$2 && $$0.y().a(axh.b);
         boolean $$6 = $$2 && $$0.y().a(axh.a);
         if ($$5) {
            this.b = true;
            this.a = true;
         } else if ($$4) {
            this.a = true;
         } else if (this.a && ($$3 || $$6)) {
            this.a = false;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(bwd var1, double var2, double var4, double var6);
   }

   static record c(fei a, fei b) {
   }

   public static enum d {
      a(false, false),
      b(true, false),
      c(false, true),
      d(true, true);

      final boolean e;
      final boolean f;

      private d(final boolean $$0, final boolean $$1) {
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

   public static enum e {
      a(true, false),
      b(true, false),
      c(false, true),
      d(false, false),
      e(false, false);

      private final boolean f;
      private final boolean g;

      private e(final boolean $$0, final boolean $$1) {
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

   interface f {
      void a(dzz var1, boolean var2, boolean var3);
   }
}
