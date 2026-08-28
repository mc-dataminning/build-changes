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
import org.slf4j.Logger;

public abstract class bvs implements akj, btt, ecr, fdy, kr {
   private static final Logger b = LogUtils.getLogger();
   public static final String v = "id";
   public static final String w = "Passengers";
   private static final AtomicInteger c = new AtomicInteger();
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
   private static final fcp d = new fcp(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double k = 0.014;
   private static final double l = 0.007;
   private static final double m = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double n = 1.0;
   private final bwb<?> o;
   private int p = c.incrementAndGet();
   public boolean I;
   private ImmutableList<bvs> q = ImmutableList.of();
   protected int J;
   @Nullable
   private bvs r;
   private dhp s;
   public double K;
   public double L;
   public double M;
   private fcu t;
   private jj u;
   private dgw ay;
   private fcu az = fcu.c;
   private float aA;
   private float aB;
   public float N;
   public float O;
   private fcp aC = d;
   private boolean aD;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected fcu U = fcu.c;
   @Nullable
   private bvs.e aE;
   public static final float V = 0.6F;
   public static final float W = 1.8F;
   public float X;
   public float Y;
   public double Z;
   private float aF = 1.0F;
   public double aa;
   public double ab;
   public double ac;
   public boolean ad;
   private boolean aG;
   protected final azs ae = azs.a();
   public int af;
   private int aH = -this.dn();
   protected boolean ag;
   protected Object2DoubleMap<axp<eus>> ah = new Object2DoubleArrayMap(2);
   protected boolean ai;
   private final Set<axp<eus>> aI = new HashSet<>();
   public int aj;
   protected boolean ak = true;
   protected final akk al;
   protected static final akg<Byte> am = akk.a(bvs.class, aki.a);
   protected static final int an = 0;
   private static final int aJ = 1;
   private static final int aK = 3;
   private static final int aL = 4;
   private static final int aM = 5;
   protected static final int ao = 6;
   protected static final int ap = 7;
   private static final akg<Integer> aN = akk.a(bvs.class, aki.b);
   private static final akg<Optional<wv>> aO = akk.a(bvs.class, aki.g);
   private static final akg<Boolean> aP = akk.a(bvs.class, aki.k);
   private static final akg<Boolean> aQ = akk.a(bvs.class, aki.k);
   private static final akg<Boolean> aR = akk.a(bvs.class, aki.k);
   protected static final akg<bxd> aq = akk.a(bvs.class, aki.w);
   private static final akg<Integer> aS = akk.a(bvs.class, aki.b);
   private ecs aT = ecs.a;
   private final aiq aU = new aiq();
   public boolean ar;
   @Nullable
   public bxc as;
   private int aV;
   private boolean aW;
   protected UUID at = azk.a(this.ae);
   protected String au = this.at.toString();
   private boolean aX;
   private final Set<String> aY = Sets.newHashSet();
   private final double[] aZ = new double[]{0.0, 0.0, 0.0};
   private long ba;
   private bvv bb;
   private float bc;
   public boolean av;
   public boolean aw;
   public Optional<jj> ax = Optional.empty();
   private boolean bd = false;
   private float be;
   private int bf;
   private boolean bg;
   @Nullable
   private dym bh = null;
   private final List<bvs.c> bi = new ArrayList<>();
   private final LongSet bj = new LongOpenHashSet();
   private final bvs.a bk = new bvs.a();

   public bvs(bwb<?> $$0, dhp $$1) {
      this.o = $$0;
      this.s = $$1;
      this.bb = $$0.n();
      this.t = fcu.c;
      this.u = jj.c;
      this.ay = dgw.e;
      akk.a $$2 = new akk.a(this);
      $$2.a(am, (byte)0);
      $$2.a(aN, this.cs());
      $$2.a(aP, false);
      $$2.a(aO, Optional.empty());
      $$2.a(aQ, false);
      $$2.a(aR, false);
      $$2.a(aq, bxd.a);
      $$2.a(aS, 0);
      this.a($$2);
      this.al = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.bc = this.bb.c();
   }

   public boolean a(jj $$0, dym $$1) {
      fdo $$2 = $$1.b(this.dV(), $$0, fcz.a(this)).a($$0);
      return fdl.c($$2, fdl.a(this.cR()), fcy.i);
   }

   public int f_() {
      feb $$0 = this.cr();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
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
      this.aU.e(new fcu($$0, $$1, $$2));
   }

   public aiq ap() {
      return this.aU;
   }

   public bwb<?> aq() {
      return this.o;
   }

   @Override
   public int ar() {
      return this.p;
   }

   public void e(int $$0) {
      this.p = $$0;
   }

   public Set<String> as() {
      return this.aY;
   }

   public boolean a(String $$0) {
      return this.aY.size() >= 1024 ? false : this.aY.add($$0);
   }

   public boolean b(String $$0) {
      return this.aY.remove($$0);
   }

   public void c(arn $$0) {
      this.a(bvs.e.a);
      this.a(edm.p);
   }

   public final void at() {
      this.a(bvs.e.b);
   }

   protected abstract void a(akk.a var1);

   public akk au() {
      return this.al;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bvs ? ((bvs)$$0).p == this.p : false;
   }

   @Override
   public int hashCode() {
      return this.p;
   }

   public void a(bvs.e $$0) {
      this.c($$0);
   }

   public void av() {
   }

   public void b(bvs.e $$0) {
   }

   public void b(bxd $$0) {
      this.al.a(aq, $$0);
   }

   public bxd aw() {
      return this.al.a(aq);
   }

   public boolean c(bxd $$0) {
      return this.aw() == $$0;
   }

   public boolean a(bvs $$0, double $$1) {
      return this.dt().a((kc)$$0.dt(), $$1);
   }

   public boolean a(bvs $$0, double $$1, double $$2) {
      double $$3 = $$0.dA() - this.dA();
      double $$4 = $$0.dC() - this.dC();
      double $$5 = $$0.dG() - this.dG();
      return azk.e($$3, $$5) < azk.k($$1) && azk.k($$4) < azk.k($$2);
   }

   protected void b(float $$0, float $$1) {
      this.w($$0 % 360.0F);
      this.x($$1 % 360.0F);
   }

   public final void b(fcu $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      this.a(this.ax());
   }

   protected final fcp ax() {
      return this.c(this.t);
   }

   protected fcp c(fcu $$0) {
      return this.bb.a($$0);
   }

   protected void ay() {
      this.a_(this.t.d, this.t.e, this.t.f);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.x(this.dN() + $$2);
      this.w(this.dL() + $$3);
      this.x(azk.a(this.dN(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = azk.a(this.O, -90.0F, 90.0F);
      if (this.r != null) {
         this.r.k(this);
      }
   }

   public void h() {
      this.az();
   }

   public void az() {
      bqb $$0 = bqa.a();
      $$0.a("entityBaseTick");
      this.bh = null;
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
      if (this.dV() instanceof arn $$1) {
         if (this.aH > 0) {
            if (this.bi()) {
               this.h(this.aH - 4);
               if (this.aH < 0) {
                  this.aH();
               }
            } else {
               if (this.aH % 20 == 0 && !this.bw()) {
                  this.a($$1, this.dW().d(), 1.0F);
               }

               this.h(this.aH - 1);
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
         this.c(this.aH > 0);
      }

      this.ak = false;
      if (this.dV() instanceof arn $$2 && this instanceof bwp) {
         bwp.a_($$2, (bvs)((bwp)this));
      }

      $$0.c();
   }

   public void c(boolean $$0) {
      this.b(0, $$0 || this.bg);
   }

   public void aA() {
      if (this.dC() < (double)(this.dV().G_() - 64)) {
         this.aI();
      }
   }

   public void aB() {
      this.aV = this.bX();
   }

   public void f(int $$0) {
      this.aV = $$0;
   }

   public int aC() {
      return this.aV;
   }

   public boolean aD() {
      return this.aV > 0;
   }

   protected void M() {
      if (this.aD()) {
         this.aV--;
      }
   }

   public void aE() {
      if (!this.bi()) {
         this.e(15.0F);
         if (this.dV() instanceof arn $$0 && this.a($$0, this.dW().e(), 4.0F) && this.aF() && !this.bb()) {
            $$0.a(null, this.dA(), this.dC(), this.dG(), awk.kA, this.dm(), 0.4F, 2.0F + this.ae.i() * 0.4F);
         }
      }
   }

   protected boolean aF() {
      return true;
   }

   public final void e(float $$0) {
      this.g(azk.d($$0 * 20.0F));
   }

   public void g(int $$0) {
      if (this.aH < $$0) {
         this.h($$0);
      }
   }

   public void h(int $$0) {
      this.aH = $$0;
   }

   public int aG() {
      return this.aH;
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

   private boolean b(fcp $$0) {
      return this.dV().a(this, $$0) && !this.dV().d($$0);
   }

   public void d(boolean $$0) {
      this.aD = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, fcu $$1) {
      this.a($$0, this.P, $$1);
   }

   public void a(boolean $$0, boolean $$1, fcu $$2) {
      this.aD = $$0;
      this.P = $$1;
      this.b($$0, $$2);
   }

   public boolean d(jj $$0) {
      return this.ax.isPresent() && this.ax.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable fcu $$1) {
      if ($$0) {
         fcp $$2 = this.cR();
         fcp $$3 = new fcp($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<jj> $$4 = this.s.h(this, $$3);
         if ($$4.isPresent() || this.bd) {
            this.ax = $$4;
         } else if ($$1 != null) {
            fcp $$5 = $$3.d(-$$1.d, 0.0, -$$1.f);
            $$4 = this.s.h(this, $$5);
            this.ax = $$4;
         }

         this.bd = $$4.isEmpty();
      } else {
         this.bd = false;
         if (this.ax.isPresent()) {
            this.ax = Optional.empty();
         }
      }
   }

   public boolean aJ() {
      return this.aD;
   }

   public void a(bwv $$0, fcu $$1) {
      if (this.ad) {
         this.a_(this.dA() + $$1.d, this.dC() + $$1.e, this.dG() + $$1.f);
      } else {
         this.aG = this.bY();
         if ($$0 == bwv.c) {
            $$1 = this.e($$1);
            if ($$1.equals(fcu.c)) {
               return;
            }
         }

         bqb $$2 = bqa.a();
         $$2.a("move");
         if (this.U.h() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = fcu.c;
            this.i(fcu.c);
         }

         $$1 = this.a($$1, $$0);
         fcu $$3 = this.a($$1);
         double $$4 = $$3.h();
         if ($$4 > 1.0E-7 || $$1.h() - $$4 < 1.0E-7) {
            if (this.Z != 0.0 && $$4 >= 1.0) {
               fcq $$5 = this.dV().a(new dgy(this.dt(), this.dt().e($$3), dgy.a.d, dgy.b.d, this));
               if ($$5.d() != fcs.a.a) {
                  this.k();
               }
            }

            this.a_(this.dA() + $$3.d, this.dC() + $$3.e, this.dG() + $$3.f);
         }

         $$2.c();
         $$2.a("rest");
         boolean $$6 = !azk.b($$1.d, $$3.d);
         boolean $$7 = !azk.b($$1.f, $$3.f);
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

         jj $$8 = this.aP();
         dym $$9 = this.dV().a_($$8);
         if (this.dg()) {
            this.a($$3.e, this.aJ(), $$9, $$8);
         }

         if (this.dQ()) {
            $$2.c();
         } else {
            if (this.P) {
               fcu $$10 = this.dy();
               this.n($$6 ? 0.0 : $$10.d, $$10.e, $$7 ? 0.0 : $$10.f);
            }

            if (this.di()) {
               dku $$11 = $$9.b();
               if ($$1.e != $$3.e) {
                  $$11.a(this.dV(), this);
               }
            }

            if (!this.dV().w_() || this.dg()) {
               bvs.d $$12 = this.bg();
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

   private void a(bvs.d $$0, fcu $$1, jj $$2, dym $$3) {
      float $$4 = 0.6F;
      float $$5 = (float)($$1.g() * 0.6F);
      float $$6 = (float)($$1.i() * 0.6F);
      jj $$7 = this.aR();
      dym $$8 = this.dV().a_($$7);
      boolean $$9 = this.c($$8);
      this.X += $$9 ? $$5 : $$6;
      this.Y += $$5;
      if (this.X > this.aF && !$$8.l()) {
         boolean $$10 = $$7.equals($$2);
         boolean $$11 = this.a($$2, $$3, $$0.c(), $$10, $$1);
         if (!$$10) {
            $$11 |= this.a($$7, $$8, false, $$0.b(), $$1);
         }

         if ($$11) {
            this.aF = this.aU();
         } else if (this.bj()) {
            this.aF = this.aU();
            if ($$0.c()) {
               this.aY();
            }

            if ($$0.b()) {
               this.a(edm.Q);
            }
         }
      } else if ($$8.l()) {
         this.aO();
      }
   }

   public void aK() {
      this.a(this.bB(), this.t);
   }

   public void a(fcu $$0, fcu $$1) {
      if (this.aL()) {
         if (this.aJ()) {
            jj $$2 = this.aP();
            dym $$3 = this.dV().a_($$2);
            $$3.b().a(this.dV(), $$2, $$3, this);
         }

         this.bi.add(new bvs.c($$0, $$1));
         List<bvs.c> $$4 = List.copyOf(this.bi);
         this.bi.clear();
         boolean $$5 = this.bY();
         this.bk.a($$5);
         this.a($$4, this.bk);
         if (this.bk.b) {
            this.aE();
         }

         if (!this.bk.a) {
            this.aH();
         }

         if ($$5 && !this.bY()) {
            this.aM();
         }

         if (!this.bk.a && this.aH <= 0) {
            this.h(-this.dn());
         }
      }
   }

   protected boolean aL() {
      return !this.dQ() && !this.ad;
   }

   private boolean c(dym $$0) {
      return $$0.a(awz.aS) || $$0.a(dkw.rt);
   }

   private boolean a(jj $$0, dym $$1, boolean $$2, boolean $$3, fcu $$4) {
      if ($$1.l()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aJ() || $$5 || this.ci() && $$4.e == 0.0 || this.cq()) && !this.ck()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dV().a(edm.P, this.dt(), edm.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean d(fcu $$0) {
      return false;
   }

   protected void aM() {
      if (!this.s.w_()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awk.kF, this.dm(), 0.7F, 1.6F + (this.ae.i() - this.ae.i()) * 0.4F);
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
            this.a(edm.x);
         }
      }
   }

   @Deprecated
   public jj aP() {
      return this.f(0.2F);
   }

   public jj aQ() {
      return this.f(0.500001F);
   }

   public jj aR() {
      return this.f(1.0E-5F);
   }

   protected jj f(float $$0) {
      if (this.ax.isPresent()) {
         jj $$1 = this.ax.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dym $$2 = this.dV().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(awz.U)) && !$$2.a(awz.N) && !($$2.b() instanceof dnu) ? $$1.h(azk.a(this.t.e - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = azk.a(this.t.d);
         int $$4 = azk.a(this.t.e - (double)$$0);
         int $$5 = azk.a(this.t.f);
         return new jj($$3, $$4, $$5);
      }
   }

   protected float aS() {
      float $$0 = this.dV().a_(this.dv()).b().j();
      float $$1 = this.dV().a_(this.aQ()).b().j();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aT() {
      dym $$0 = this.dV().a_(this.dv());
      float $$1 = $$0.b().h();
      if (!$$0.a(dkw.J) && !$$0.a(dkw.nF)) {
         return (double)$$1 == 1.0 ? this.dV().a_(this.aQ()).b().h() : $$1;
      } else {
         return $$1;
      }
   }

   protected fcu a(fcu $$0, bwv $$1) {
      return $$0;
   }

   protected fcu e(fcu $$0) {
      if ($$0.h() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dV().ae();
         if ($$1 != this.ba) {
            Arrays.fill(this.aZ, 0.0);
            this.ba = $$1;
         }

         if ($$0.d != 0.0) {
            double $$2 = this.a(jo.a.a, $$0.d);
            return Math.abs($$2) <= 1.0E-5F ? fcu.c : new fcu($$2, 0.0, 0.0);
         } else if ($$0.e != 0.0) {
            double $$3 = this.a(jo.a.b, $$0.e);
            return Math.abs($$3) <= 1.0E-5F ? fcu.c : new fcu(0.0, $$3, 0.0);
         } else if ($$0.f != 0.0) {
            double $$4 = this.a(jo.a.c, $$0.f);
            return Math.abs($$4) <= 1.0E-5F ? fcu.c : new fcu(0.0, 0.0, $$4);
         } else {
            return fcu.c;
         }
      }
   }

   private double a(jo.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = azk.a($$1 + this.aZ[$$2], -0.51, 0.51);
      $$1 = $$3 - this.aZ[$$2];
      this.aZ[$$2] = $$3;
      return $$1;
   }

   private fcu a(fcu $$0) {
      fcp $$1 = this.cR();
      List<fdo> $$2 = this.dV().c(this, $$1.b($$0));
      fcu $$3 = $$0.h() == 0.0 ? $$0 : a(this, $$0, $$1, this.dV(), $$2);
      boolean $$4 = $$0.d != $$3.d;
      boolean $$5 = $$0.e != $$3.e;
      boolean $$6 = $$0.f != $$3.f;
      boolean $$7 = $$5 && $$0.e < 0.0;
      if (this.dP() > 0.0F && ($$7 || this.aJ()) && ($$4 || $$6)) {
         fcp $$8 = $$7 ? $$1.d(0.0, $$3.e, 0.0) : $$1;
         fcp $$9 = $$8.b($$0.d, (double)this.dP(), $$0.f);
         if (!$$7) {
            $$9 = $$9.b(0.0, -1.0E-5F, 0.0);
         }

         List<fdo> $$10 = a(this, this.s, $$2, $$9);
         float $$11 = (float)$$3.e;
         float[] $$12 = a($$8, $$10, this.dP(), $$11);

         for (float $$13 : $$12) {
            fcu $$14 = a(new fcu($$0.d, (double)$$13, $$0.f), $$8, $$10);
            if ($$14.j() > $$3.j()) {
               double $$15 = $$1.b - $$8.b;
               return $$14.b(0.0, -$$15, 0.0);
            }
         }
      }

      return $$3;
   }

   private static float[] a(fcp $$0, List<fdo> $$1, float $$2, float $$3) {
      FloatSet $$4 = new FloatArraySet(4);

      for (fdo $$5 : $$1) {
         DoubleList $$6 = $$5.a(jo.a.b);
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

   public static fcu a(@Nullable bvs $$0, fcu $$1, fcp $$2, dhp $$3, List<fdo> $$4) {
      List<fdo> $$5 = a($$0, $$3, $$4, $$2.b($$1));
      return a($$1, $$2, $$5);
   }

   private static List<fdo> a(@Nullable bvs $$0, dhp $$1, List<fdo> $$2, fcp $$3) {
      Builder<fdo> $$4 = ImmutableList.builderWithExpectedSize($$2.size() + 1);
      if (!$$2.isEmpty()) {
         $$4.addAll($$2);
      }

      eae $$5 = $$1.A_();
      boolean $$6 = $$0 != null && $$5.a($$0, $$3);
      if ($$6) {
         $$4.add($$5.c());
      }

      $$4.addAll($$1.e($$0, $$3));
      return $$4.build();
   }

   private static fcu a(fcu $$0, fcp $$1, List<fdo> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.d;
         double $$4 = $$0.e;
         double $$5 = $$0.f;
         if ($$4 != 0.0) {
            $$4 = fdl.a(jo.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = fdl.a(jo.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = fdl.a(jo.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = fdl.a(jo.a.c, $$1, $$2, $$5);
         }

         return new fcu($$3, $$4, $$5);
      }
   }

   protected float aU() {
      return (float)((int)this.X + 1);
   }

   protected awj aV() {
      return awk.kJ;
   }

   protected awj aW() {
      return awk.kI;
   }

   protected awj aX() {
      return awk.kI;
   }

   public void b(fcu $$0, fcu $$1) {
      this.bi.add(new bvs.c($$0, $$1));
   }

   private void a(List<bvs.c> $$0, bvs.f $$1) {
      if (this.aL()) {
         LongSet $$2 = this.bj;

         for (bvs.c $$3 : $$0) {
            fcu $$4 = $$3.a();
            fcu $$5 = $$3.b();
            fcp $$6 = this.c($$5).h(1.0E-5F);

            for (jj $$7 : dgv.a($$4, $$5, $$6)) {
               if (!this.bK()) {
                  return;
               }

               dym $$8 = this.dV().a_($$7);
               if (!$$8.l() && $$2.add($$7.a())) {
                  fdo $$9 = $$8.b(this.dV(), $$7);
                  boolean $$10 = $$9 == fdl.b() || this.a($$4, $$5, $$9.a(new fcu($$7)).e());
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

   private boolean a(eut $$0, jj $$1, fcu $$2, fcu $$3) {
      fcp $$4 = $$0.e(this.dV(), $$1);
      return $$4 != null && this.a($$2, $$3, List.of($$4));
   }

   private boolean a(fcu $$0, fcu $$1, List<fcp> $$2) {
      fcp $$3 = this.c($$0);
      fcu $$4 = $$1.d($$0);
      return $$3.a($$4, $$2);
   }

   protected void a(dym $$0) {
   }

   public jj a(arn $$0, jj $$1) {
      jj $$2 = $$0.aa();
      fcu $$3 = $$2.b();
      int $$4 = $$0.m($$2).a(eel.a.f, $$2.u(), $$2.w()) + 1;
      return jj.a($$3.d, (double)$$4, $$3.f);
   }

   public void a(js<edm> $$0, @Nullable bvs $$1) {
      this.dV().a($$1, $$0, this.t);
   }

   public void a(js<edm> $$0) {
      this.a($$0, this);
   }

   private void c(jj $$0, dym $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.j();
      }
   }

   protected void aY() {
      bvs $$0 = Objects.requireNonNullElse(this.cW(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      fcu $$2 = $$0.dy();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      this.g($$3);
   }

   protected jj e(jj $$0) {
      jj $$1 = $$0.d();
      dym $$2 = this.dV().a_($$1);
      return !$$2.a(awz.bp) && !$$2.a(awz.bq) ? $$0 : $$1;
   }

   protected void a(dym $$0, dym $$1) {
      dsn $$2 = $$0.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dym $$0) {
      dsn $$1 = $$0.A();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(jj $$0, dym $$1) {
      dsn $$2 = $$1.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dym $$0) {
      return $$0.a(awz.bo) && this.af >= this.bf + 20;
   }

   private void j() {
      this.be = this.be * (float)Math.pow(0.997, (double)(this.af - this.bf));
      this.be = Math.min(1.0F, this.be + 0.07F);
      float $$0 = 0.5F + this.be * this.ae.i() * 1.2F;
      float $$1 = 0.1F + this.be * 1.2F;
      this.a(awk.E, $$1, $$0);
      this.bf = this.af;
   }

   protected void g(float $$0) {
      this.a(this.aV(), $$0, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
   }

   protected void aZ() {
   }

   protected boolean ba() {
      return false;
   }

   public void a(awj $$0, float $$1, float $$2) {
      if (!this.bb()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), $$0, this.dm(), $$1, $$2);
      }
   }

   public void a(awj $$0) {
      if (!this.bb()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean bb() {
      return this.al.a(aQ);
   }

   public void e(boolean $$0) {
      this.al.a(aQ, $$0);
   }

   public boolean bc() {
      return this.al.a(aR);
   }

   public void f(boolean $$0) {
      this.al.a(aR, $$0);
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

   protected bvs.d bg() {
      return bvs.d.d;
   }

   public boolean bh() {
      return false;
   }

   public final void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.do()) {
         this.b($$3, new fcu($$0, $$1, $$2));
         jj $$4 = this.aP();
         dym $$5 = this.dV().a_($$4);
         this.a($$1, $$3, $$5, $$4);
      }
   }

   protected void a(double $$0, boolean $$1, dym $$2, jj $$3) {
      if (!this.bj() && $$0 < 0.0) {
         this.Z -= (double)((float)$$0);
      }

      if ($$1) {
         if (this.Z > 0.0) {
            $$2.b().a(this.dV(), $$2, $$3, this, this.Z);
            this.dV().a(edm.A, this.t, edm.a.a(this, this.ax.<dym>map($$0x -> this.dV().a_($$0x)).orElse($$2)));
         }

         this.k();
      }
   }

   public boolean bi() {
      return this.aq().d();
   }

   public boolean a(double $$0, float $$1, buh $$2) {
      if (this.o.a(axd.o)) {
         return false;
      } else {
         if (this.ca()) {
            for (bvs $$3 : this.cY()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean bj() {
      return this.ag;
   }

   boolean bk() {
      jj $$0 = this.dv();
      return this.dV().r($$0) || this.dV().r(jj.a((double)$$0.u(), this.cR().e, (double)$$0.w()));
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
         this.i(this.cj() && this.bn() && !this.bZ() && this.dV().b_(this.u).a(axf.a));
      }
   }

   protected boolean bp() {
      this.ah.clear();
      this.bq();
      double $$0 = this.dV().B_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(axf.b, $$0);
      return this.bj() || $$1;
   }

   void bq() {
      if (this.dk() instanceof csf $$0 && !$$0.bn()) {
         this.ag = false;
         return;
      }

      if (this.a(axf.a, 0.014)) {
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
      this.ai = this.a(axf.a);
      this.aI.clear();
      double $$0 = this.dE();
      if (this.dk() instanceof csf $$2 && !$$2.bn() && $$2.cR().e >= $$0 && $$2.cR().b <= $$0) {
         return;
      }

      jj $$3 = jj.a(this.dA(), $$0, this.dG());
      eut $$4 = this.dV().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a(this.dV(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aI::add);
      }
   }

   protected void br() {
      bvs $$0 = Objects.requireNonNullElse(this.cW(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      fcu $$2 = $$0.dy();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aW(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      } else {
         this.a(this.aX(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      }

      float $$4 = (float)azk.a(this.dC());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bb.a() * 20.0F; $$5++) {
         double $$6 = (this.ae.j() * 2.0 - 1.0) * (double)this.bb.a();
         double $$7 = (this.ae.j() * 2.0 - 1.0) * (double)this.bb.a();
         this.dV().a(lv.d, this.dA() + $$6, (double)($$4 + 1.0F), this.dG() + $$7, $$2.d, $$2.e - this.ae.j() * 0.2F, $$2.f);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bb.a() * 20.0F; $$8++) {
         double $$9 = (this.ae.j() * 2.0 - 1.0) * (double)this.bb.a();
         double $$10 = (this.ae.j() * 2.0 - 1.0) * (double)this.bb.a();
         this.dV().a(lv.ap, this.dA() + $$9, (double)($$4 + 1.0F), this.dG() + $$10, $$2.d, $$2.e, $$2.f);
      }

      this.a(edm.O);
   }

   @Deprecated
   protected dym bs() {
      return this.dV().a_(this.aP());
   }

   public dym bt() {
      return this.dV().a_(this.aR());
   }

   public boolean bu() {
      return this.cj() && !this.bj() && !this.U_() && !this.ci() && !this.bw() && this.bK();
   }

   protected void bv() {
      jj $$0 = this.aP();
      dym $$1 = this.dV().a_($$0);
      if ($$1.o() != drf.a) {
         fcu $$2 = this.dy();
         jj $$3 = this.dv();
         double $$4 = this.dA() + (this.ae.j() - 0.5) * (double)this.bb.a();
         double $$5 = this.dG() + (this.ae.j() - 0.5) * (double)this.bb.a();
         if ($$3.u() != $$0.u()) {
            $$4 = azk.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = azk.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dV().a(new ln(lv.b, $$1), $$4, this.dC() + 0.1, $$5, $$2.d * -4.0, 1.5, $$2.f * -4.0);
      }
   }

   public boolean a(axp<eus> $$0) {
      return this.aI.contains($$0);
   }

   public boolean bw() {
      return !this.ak && this.ah.getDouble(axf.b) > 0.0;
   }

   public void a(float $$0, fcu $$1) {
      fcu $$2 = a($$1, $$0, this.dL());
      this.i(this.dy().e($$2));
   }

   protected static fcu a(fcu $$0, float $$1, float $$2) {
      double $$3 = $$0.h();
      if ($$3 < 1.0E-7) {
         return fcu.c;
      } else {
         fcu $$4 = ($$3 > 1.0 ? $$0.d() : $$0).c((double)$$1);
         float $$5 = azk.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = azk.b($$2 * (float) (Math.PI / 180.0));
         return new fcu($$4.d * (double)$$6 - $$4.f * (double)$$5, $$4.e, $$4.f * (double)$$6 + $$4.d * (double)$$5);
      }
   }

   @Deprecated
   public float bx() {
      return this.dV().f(this.dz(), this.dF()) ? this.dV().x(jj.a(this.dA(), this.dE(), this.dG())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.c($$3, $$4);
   }

   public void c(float $$0, float $$1) {
      this.w($$0 % 360.0F);
      this.x(azk.a($$1, -90.0F, 90.0F) % 360.0F);
      this.N = this.dL();
      this.O = this.dN();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = azk.a($$0, -3.0E7, 3.0E7);
      double $$4 = azk.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void f(fcu $$0) {
      this.e($$0.d, $$0.e, $$0.f);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dL(), this.dN());
   }

   public void a(jj $$0, float $$1, float $$2) {
      this.b($$0.c(), $$1, $$2);
   }

   public void b(fcu $$0, float $$1, float $$2) {
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

   public final void c(fcu $$0, float $$1, float $$2) {
      this.k($$0);
      this.f($$1, $$2);
   }

   protected void bz() {
      this.k(this.t);
   }

   public void bA() {
      this.f(this.dL(), this.dN());
   }

   private void k(fcu $$0) {
      this.K = this.aa = $$0.d;
      this.L = this.ab = $$0.e;
      this.M = this.ac = $$0.f;
   }

   private void f(float $$0, float $$1) {
      this.N = $$0;
      this.O = $$1;
   }

   public final fcu bB() {
      return new fcu(this.aa, this.ab, this.ac);
   }

   public float f(bvs $$0) {
      float $$1 = (float)(this.dA() - $$0.dA());
      float $$2 = (float)(this.dC() - $$0.dC());
      float $$3 = (float)(this.dG() - $$0.dG());
      return azk.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dA() - $$0;
      double $$4 = this.dC() - $$1;
      double $$5 = this.dG() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(bvs $$0) {
      return this.g($$0.dt());
   }

   public double g(fcu $$0) {
      double $$1 = this.dA() - $$0.d;
      double $$2 = this.dC() - $$0.e;
      double $$3 = this.dG() - $$0.f;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void a_(cqi $$0) {
   }

   public void h(bvs $$0) {
      if (!this.z($$0)) {
         if (!$$0.ad && !this.ad) {
            double $$1 = $$0.dA() - this.dA();
            double $$2 = $$0.dG() - this.dG();
            double $$3 = azk.a($$1, $$2);
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

   public void h(fcu $$0) {
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
   public final void a(buh $$0, float $$1) {
      if (this.s instanceof arn $$2) {
         this.a($$2, $$0, $$1);
      }
   }

   @Deprecated
   public final boolean b(buh $$0, float $$1) {
      return this.s instanceof arn $$2 ? this.a($$2, $$0, $$1) : this.b($$0);
   }

   public abstract boolean a(arn var1, buh var2, float var3);

   public boolean b(buh $$0) {
      return false;
   }

   public final fcu h(float $$0) {
      return this.d(this.i($$0), this.j($$0));
   }

   public jo bD() {
      return jo.a(this.h(1.0F));
   }

   public float i(float $$0) {
      return this.k($$0);
   }

   public float j(float $$0) {
      return this.l($$0);
   }

   public float k(float $$0) {
      return $$0 == 1.0F ? this.dN() : azk.h($$0, this.O, this.dN());
   }

   public float l(float $$0) {
      return $$0 == 1.0F ? this.dL() : azk.i($$0, this.N, this.dL());
   }

   public final fcu d(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = azk.b($$3);
      float $$5 = azk.a($$3);
      float $$6 = azk.b($$2);
      float $$7 = azk.a($$2);
      return new fcu((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final fcu m(float $$0) {
      return this.e(this.i($$0), this.j($$0));
   }

   protected final fcu e(float $$0, float $$1) {
      return this.d($$0 - 90.0F, $$1);
   }

   public final fcu bE() {
      return new fcu(this.dA(), this.dE(), this.dG());
   }

   public final fcu n(float $$0) {
      double $$1 = azk.d((double)$$0, this.K, this.dA());
      double $$2 = azk.d((double)$$0, this.L, this.dC()) + (double)this.cS();
      double $$3 = azk.d((double)$$0, this.M, this.dG());
      return new fcu($$1, $$2, $$3);
   }

   public fcu o(float $$0) {
      return this.n($$0);
   }

   public final fcu p(float $$0) {
      double $$1 = azk.d((double)$$0, this.K, this.dA());
      double $$2 = azk.d((double)$$0, this.L, this.dC());
      double $$3 = azk.d((double)$$0, this.M, this.dG());
      return new fcu($$1, $$2, $$3);
   }

   public fcs a(double $$0, float $$1, boolean $$2) {
      fcu $$3 = this.n($$1);
      fcu $$4 = this.h($$1);
      fcu $$5 = $$3.b($$4.d * $$0, $$4.e * $$0, $$4.f * $$0);
      return this.dV().a(new dgy($$3, $$5, dgy.a.b, $$2 ? dgy.b.c : dgy.b.a, this));
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

   public void a(bvs $$0, buh $$1) {
      if ($$0 instanceof aro) {
         ap.d.a((aro)$$0, this, $$1);
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

      $$1 *= 64.0 * n;
      return $$0 < $$1 * $$1;
   }

   public boolean d(tw $$0) {
      if (this.aE != null && !this.aE.b()) {
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

   public boolean e(tw $$0) {
      return this.bZ() ? false : this.d($$0);
   }

   public tw f(tw $$0) {
      try {
         if (this.r != null) {
            $$0.a("Pos", this.a(this.r.dA(), this.dC(), this.r.dG()));
         } else {
            $$0.a("Pos", this.a(this.dA(), this.dC(), this.dG()));
         }

         fcu $$1 = this.dy();
         $$0.a("Motion", this.a($$1.d, $$1.e, $$1.f));
         $$0.a("Rotation", this.a(this.dL(), this.dN()));
         $$0.a("fall_distance", this.Z);
         $$0.a("Fire", (short)this.aH);
         $$0.a("Air", (short)this.ct());
         $$0.a("OnGround", this.aJ());
         $$0.a("Invulnerable", this.aW);
         $$0.a("PortalCooldown", this.aV);
         $$0.a("UUID", this.cG());
         wv $$2 = this.an();
         if ($$2 != null) {
            alb<ut> $$3 = this.dX().a(uk.a);
            $$0.a("CustomName", (ut)wx.a.encodeStart($$3, $$2).getOrThrow());
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

         if (this.aX) {
            $$0.a("Glowing", true);
         }

         int $$4 = this.cu();
         if ($$4 > 0) {
            $$0.a("TicksFrozen", this.cu());
         }

         if (this.bg) {
            $$0.a("HasVisualFire", this.bg);
         }

         if (!this.aY.isEmpty()) {
            uc $$5 = new uc();

            for (String $$6 : this.aY) {
               $$5.add(ur.a($$6));
            }

            $$0.a("Tags", $$5);
         }

         this.b($$0);
         if (this.ca()) {
            uc $$7 = new uc();

            for (bvs $$8 : this.cY()) {
               tw $$9 = new tw();
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

   public void g(tw $$0) {
      try {
         uc $$1 = $$0.c("Pos", 6);
         uc $$2 = $$0.c("Motion", 6);
         uc $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.n(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         this.ar = true;
         double $$7 = 3.0000512E7;
         this.o(azk.a($$1.h(0), -3.0000512E7, 3.0000512E7), azk.a($$1.h(1), -2.0E7, 2.0E7), azk.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.w($$3.i(0));
         this.x($$3.i(1));
         this.by();
         this.r(this.dL());
         this.s(this.dL());
         this.Z = $$0.k("fall_distance");
         this.aH = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.j($$0.g("Air"));
         }

         this.aD = $$0.q("OnGround");
         this.aW = $$0.q("Invulnerable");
         this.aV = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.at = $$0.a("UUID");
            this.au = this.at.toString();
         }

         if (!Double.isFinite(this.dA()) || !Double.isFinite(this.dC()) || !Double.isFinite(this.dG())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dL()) && Double.isFinite((double)this.dN())) {
            this.ay();
            this.b(this.dL(), this.dN());
            ut $$8 = $$0.c("CustomName");
            if ($$8 != null) {
               alb<ut> $$9 = this.dX().a(uk.a);
               wx.a.parse($$9, $$8).ifSuccess(this::b).ifError($$1x -> b.warn("Failed to parse entity custom name {}: {}", $$8, $$1x));
            } else {
               this.al.a(aO, Optional.empty());
            }

            this.o($$0.q("CustomNameVisible"));
            this.e($$0.q("Silent"));
            this.f($$0.q("NoGravity"));
            this.j($$0.q("Glowing"));
            this.k($$0.h("TicksFrozen"));
            this.bg = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.aY.clear();
               uc $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.aY.add($$10.j($$12));
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
         o $$14 = o.a(var17, "Loading entity NBT");
         p $$15 = $$14.a("Entity being loaded");
         this.a($$15);
         throw new z($$14);
      }
   }

   protected boolean bI() {
      return true;
   }

   @Nullable
   protected final String bJ() {
      bwb<?> $$0 = this.aq();
      ald $$1 = bwb.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(tw var1);

   protected abstract void b(tw var1);

   protected uc a(double... $$0) {
      uc $$1 = new uc();

      for (double $$2 : $$0) {
         $$1.add(tx.a($$2));
      }

      return $$1;
   }

   protected uc a(float... $$0) {
      uc $$1 = new uc();

      for (float $$2 : $$0) {
         $$1.add(tz.a($$2));
      }

      return $$1;
   }

   @Nullable
   public cmn a(arn $$0, dho $$1) {
      return this.a($$0, $$1, 0);
   }

   @Nullable
   public cmn a(arn $$0, dho $$1, int $$2) {
      return this.a($$0, new cxy($$1), (float)$$2);
   }

   @Nullable
   public cmn a(arn $$0, cxy $$1) {
      return this.a($$0, $$1, 0.0F);
   }

   @Nullable
   public cmn a(arn $$0, cxy $$1, float $$2) {
      if ($$1.f()) {
         return null;
      } else {
         cmn $$3 = new cmn($$0, this.dA(), this.dC() + (double)$$2, this.dG(), $$1);
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
         float $$0 = this.bb.a() * 0.8F;
         fcp $$1 = fcp.a(this.bE(), (double)$$0, 1.0E-6, (double)$$0);
         return jj.b($$1).anyMatch($$1x -> {
            dym $$2 = this.dV().a_($$1x);
            return !$$2.l() && $$2.j(this.dV(), $$1x) && fdl.c($$2.g(this.dV(), $$1x).a($$1x), fdl.a($$1), fcy.i);
         });
      }
   }

   public btq a(cqi $$0, btp $$1) {
      if (this.bK() && this instanceof bwp $$2) {
         if ($$2.C() == $$0) {
            if (!this.dV().w_()) {
               if ($$0.fU()) {
                  $$2.z();
               } else {
                  $$2.y();
               }

               this.a(edm.r, $$0);
            }

            return btq.a.b();
         }

         cxy $$3 = $$0.b($$1);
         if ($$3.a(cyc.vO) && $$2.p()) {
            if (!this.dV().w_()) {
               $$2.b($$0, true);
            }

            $$3.h(1);
            return btq.a;
         }
      }

      return btq.e;
   }

   public boolean i(bvs $$0) {
      return $$0.bM() && !this.z($$0);
   }

   public boolean bM() {
      return false;
   }

   public void r() {
      this.i(fcu.c);
      this.h();
      if (this.bZ()) {
         this.dk().j(this);
      }
   }

   public final void j(bvs $$0) {
      if (this.y($$0)) {
         this.a($$0, bvs::a_);
      }
   }

   protected void a(bvs $$0, bvs.b $$1) {
      fcu $$2 = this.m($$0);
      fcu $$3 = $$0.l(this);
      $$1.accept($$0, $$2.d - $$3.d, $$2.e - $$3.e, $$2.f - $$3.f);
   }

   public void k(bvs $$0) {
   }

   public fcu l(bvs $$0) {
      return this.ds().b(bvt.b, 0, this.aA);
   }

   public fcu m(bvs $$0) {
      return this.dt().e(this.a($$0, this.bb, 1.0F));
   }

   protected fcu a(bvs $$0, bvv $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static fcu a(bvs $$0, bvs $$1, bvu $$2) {
      int $$3 = $$0.cY().indexOf($$1);
      return $$2.c(bvt.a, $$3, $$0.aA);
   }

   public boolean n(bvs $$0) {
      return this.a($$0, false);
   }

   public boolean bN() {
      return this instanceof bwr;
   }

   public boolean a(bvs $$0, boolean $$1) {
      if ($$0 == this.r) {
         return false;
      } else if (!$$0.bQ()) {
         return false;
      } else if (!this.dV().w_() && !$$0.o.b()) {
         return false;
      } else {
         for (bvs $$2 = $$0; $$2.r != null; $$2 = $$2.r) {
            if ($$2.r == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bZ()) {
               this.bP();
            }

            this.b(bxd.a);
            this.r = $$0;
            this.r.p(this);
            $$0.D().filter($$0x -> $$0x instanceof aro).forEach($$0x -> ap.U.a((aro)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bvs $$0) {
      return !this.cd() && this.J <= 0;
   }

   public void bO() {
      for (int $$0 = this.q.size() - 1; $$0 >= 0; $$0--) {
         ((bvs)this.q.get($$0)).bP();
      }
   }

   public void ae() {
      if (this.r != null) {
         bvs $$0 = this.r;
         this.r = null;
         $$0.q(this);
      }
   }

   public void bP() {
      this.ae();
   }

   protected void p(bvs $$0) {
      if ($$0.dk() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.q.isEmpty()) {
            this.q = ImmutableList.of($$0);
         } else {
            List<bvs> $$1 = Lists.newArrayList(this.q);
            if (!this.dV().C && $$0 instanceof cqi && !(this.cZ() instanceof cqi)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.q = ImmutableList.copyOf($$1);
         }

         this.a(edm.s, $$0);
      }
   }

   protected void q(bvs $$0) {
      if ($$0.dk() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.q.size() == 1 && this.q.get(0) == $$0) {
            this.q = ImmutableList.of();
         } else {
            this.q = this.q.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(edm.q, $$0);
      }
   }

   protected boolean r(bvs $$0) {
      return this.q.isEmpty();
   }

   protected boolean bQ() {
      return true;
   }

   public final boolean bR() {
      return this.N_() != null && this.N_().d();
   }

   public final void d(fcu $$0, float $$1, float $$2) {
      bwm $$3 = this.N_();
      if ($$3 != null) {
         $$3.a($$0, $$1, $$2);
      } else {
         this.b($$0);
         this.b($$1, $$2);
      }
   }

   @Nullable
   public bwm N_() {
      return null;
   }

   public void a(float $$0, int $$1) {
      this.r($$0);
   }

   public float bS() {
      return 0.0F;
   }

   public fcu bT() {
      return this.d(this.dN(), this.dL());
   }

   public fcu a(cxu $$0) {
      if (!(this instanceof cqi $$1)) {
         return fcu.c;
      } else {
         boolean $$2 = $$1.fb().a($$0) && !$$1.fa().a($$0);
         bwk $$3 = $$2 ? $$1.fx().e() : $$1.fx();
         return this.d(0.0F, this.dL() + (float)($$3 == bwk.b ? 80 : -80)).c(0.5);
      }
   }

   public fct bU() {
      return new fct(this.dN(), this.dL());
   }

   public fcu bV() {
      return fcu.a(this.bU());
   }

   public void a(dqr $$0, jj $$1) {
      if (this.aD()) {
         this.aB();
      } else {
         if (this.as == null || !this.as.a($$0)) {
            this.as = new bxc($$0, $$1.j());
         } else if (!this.as.e()) {
            this.as.a($$1.j());
            this.as.a(true);
         }
      }
   }

   protected void bW() {
      if (this.dV() instanceof arn $$0) {
         this.M();
         if (this.as != null) {
            if (this.as.a($$0, this, this.n(false))) {
               bqb $$2 = bqa.a();
               $$2.a("portal");
               this.aB();
               evt $$3 = this.as.a($$0, this);
               if ($$3 != null) {
                  arn $$4 = $$3.b();
                  if ($$0.p().a((dhp)$$4) && ($$4.aj() == $$0.aj() || this.a($$0, $$4))) {
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
      bvs $$0 = this.cZ();
      return $$0 instanceof aro ? $$0.bX() : 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
   }

   public void c(buh $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dor.a(this);
      }
   }

   public void q(float $$0) {
   }

   public boolean bY() {
      boolean $$0 = this.dV() != null && this.dV().C;
      return !this.bi() && (this.aH > 0 || $$0 && this.i(0));
   }

   public boolean bZ() {
      return this.dk() != null;
   }

   public boolean ca() {
      return !this.q.isEmpty();
   }

   public boolean cb() {
      return this.aq().a(axd.p);
   }

   public boolean cc() {
      return !this.aq().a(axd.q);
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
      return this.c(bxd.f);
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
      return this.c(bxd.d);
   }

   public boolean cm() {
      return this.cl() && !this.bj();
   }

   public void i(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cn() {
      return this.aX;
   }

   public final void j(boolean $$0) {
      this.aX = $$0;
      this.b(6, this.co());
   }

   public boolean co() {
      return this.dV().w_() ? this.i(6) : this.aX;
   }

   public boolean cp() {
      return this.i(5);
   }

   public boolean d(cqi $$0) {
      if ($$0.U_()) {
         return false;
      } else {
         feb $$1 = this.cr();
         return $$1 != null && $$0 != null && $$0.cr() == $$1 && $$1.i() ? false : this.cp();
      }
   }

   public boolean cq() {
      return false;
   }

   public void a(BiConsumer<edj<?>, arn> $$0) {
   }

   @Nullable
   public fdu cr() {
      return this.dV().R().e(this.cI());
   }

   public final boolean s(@Nullable bvs $$0) {
      return $$0 == null ? false : this == $$0 || this.t($$0) || $$0.t(this);
   }

   protected boolean t(bvs $$0) {
      return this.a($$0.cr());
   }

   public boolean a(@Nullable feb $$0) {
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
      return this.al.a(aN);
   }

   public void j(int $$0) {
      this.al.a(aN, $$0);
   }

   public int cu() {
      return this.al.a(aS);
   }

   public void k(int $$0) {
      this.al.a(aS, $$0);
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

   public void a(arn $$0, bwq $$1) {
      this.h(this.aH + 1);
      if (this.aH == 0) {
         this.e(8.0F);
      }

      this.a($$0, this.dW().c(), 5.0F);
   }

   public void a(boolean $$0, jj $$1) {
      fcu $$2 = this.dy();
      double $$3;
      if ($$0) {
         $$3 = Math.max(-0.9, $$2.e - 0.03);
      } else {
         $$3 = Math.min(1.8, $$2.e + 0.1);
      }

      this.n($$2.d, $$3, $$2.f);
      this.f($$1);
   }

   protected void f(jj $$0) {
      if (this.s instanceof arn $$1) {
         for (int $$2 = 0; $$2 < 2; $$2++) {
            $$1.a(lv.ap, (double)$$0.u() + this.s.A.j(), (double)($$0.v() + 1), (double)$$0.w() + this.s.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            $$1.a(lv.d, (double)$$0.u() + this.s.A.j(), (double)($$0.v() + 1), (double)$$0.w() + this.s.A.j(), 1, 0.0, 0.01, 0.0, 0.2);
         }
      }
   }

   public void l(boolean $$0) {
      fcu $$1 = this.dy();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.e - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.e + 0.06);
      }

      this.n($$1.d, $$2, $$1.f);
      this.k();
   }

   public boolean a(arn $$0, bwr $$1) {
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
      jj $$3 = jj.a($$0, $$1, $$2);
      fcu $$4 = new fcu($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      jj.a $$5 = new jj.a();
      jo $$6 = jo.b;
      double $$7 = Double.MAX_VALUE;

      for (jo $$8 : new jo[]{jo.c, jo.d, jo.e, jo.f, jo.b}) {
         $$5.a($$3, $$8);
         if (!this.dV().a_($$5).m(this.dV(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == jo.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ae.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      fcu $$13 = this.dy().c(0.75);
      if ($$6.o() == jo.a.a) {
         this.n((double)($$12 * $$11), $$13.e, $$13.f);
      } else if ($$6.o() == jo.a.b) {
         this.n($$13.d, (double)($$12 * $$11), $$13.f);
      } else if ($$6.o() == jo.a.c) {
         this.n($$13.d, $$13.e, (double)($$12 * $$11));
      }
   }

   public void a(dym $$0, fcu $$1) {
      this.k();
      this.U = $$1;
   }

   private static wv a(wv $$0) {
      xj $$1 = $$0.e().b($$0.a().a(null));

      for (wv $$2 : $$0.c()) {
         $$1.b(a($$2));
      }

      return $$1;
   }

   @Override
   public wv al() {
      wv $$0 = this.an();
      return $$0 != null ? a($$0) : this.cz();
   }

   protected wv cz() {
      return this.o.h();
   }

   public boolean u(bvs $$0) {
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

   public boolean v(bvs $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dV() == null ? "~NULL~" : this.dV().toString();
      return this.aE != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.al().getString(),
            this.p,
            $$0,
            this.dA(),
            this.dC(),
            this.dG(),
            this.aE
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.al().getString(),
            this.p,
            $$0,
            this.dA(),
            this.dC(),
            this.dG()
         );
   }

   protected final boolean d(buh $$0) {
      return this.dQ() || this.aW && !$$0.a(axb.d) && !$$0.h() || $$0.a(axb.i) && this.bi() || $$0.a(axb.m) && this.aq().a(axd.o);
   }

   public boolean cC() {
      return this.aW;
   }

   public void m(boolean $$0) {
      this.aW = $$0;
   }

   public void w(bvs $$0) {
      this.b($$0.dA(), $$0.dC(), $$0.dG(), $$0.dL(), $$0.dN());
   }

   public void x(bvs $$0) {
      tw $$1 = $$0.f(new tw());
      $$1.r("Dimension");
      this.g($$1);
      this.aV = $$0.aV;
      this.as = $$0.as;
   }

   @Nullable
   public bvs b(evt $$0) {
      if (this.dV() instanceof arn $$1 && !this.dQ()) {
         arn $$3 = $$0.b();
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

   private bvs a(arn $$0, evt $$1) {
      for (bvs $$2 : this.cY()) {
         $$2.b(this.a($$1, $$2));
      }

      bqb $$3 = bqa.a();
      $$3.a("teleportSameDimension");
      this.a(bxe.a($$1), $$1.i());
      if (!$$1.h()) {
         this.a($$1);
      }

      $$1.j().onTransition(this);
      $$3.c();
      return this;
   }

   private bvs b(arn $$0, evt $$1) {
      List<bvs> $$2 = this.cY();
      List<bvs> $$3 = new ArrayList<>($$2.size());
      this.bO();

      for (bvs $$4 : $$2) {
         bvs $$5 = $$4.b(this.a($$1, $$4));
         if ($$5 != null) {
            $$3.add($$5);
         }
      }

      bqb $$6 = bqa.a();
      $$6.a("teleportCrossDimension");
      bvs $$7 = this.aq().a($$0, bwa.s);
      if ($$7 == null) {
         $$6.c();
         return null;
      } else {
         $$7.x(this);
         this.cD();
         $$7.a(bxe.a($$1), $$1.i());
         $$0.d($$7);

         for (bvs $$8 : $$3) {
            $$8.a($$7, true);
         }

         $$0.i();
         $$1.j().onTransition($$7);
         $$6.c();
         return $$7;
      }
   }

   private evt a(evt $$0, bvs $$1) {
      float $$2 = $$0.e() + ($$0.i().contains(bxf.d) ? 0.0F : $$1.dL() - this.dL());
      float $$3 = $$0.f() + ($$0.i().contains(bxf.e) ? 0.0F : $$1.dN() - this.dN());
      fcu $$4 = $$1.dt().d(this.dt());
      fcu $$5 = $$0.c().b($$0.i().contains(bxf.a) ? 0.0 : $$4.a(), $$0.i().contains(bxf.b) ? 0.0 : $$4.b(), $$0.i().contains(bxf.c) ? 0.0 : $$4.c());
      return $$0.a($$5).a($$2, $$3).a();
   }

   private void a(evt $$0) {
      bvs $$1 = this.cW();

      for (bvs $$2 : this.dc()) {
         if ($$2 instanceof aro) {
            aro $$3 = (aro)$$2;
            if ($$1 != null && $$3.ar() == $$1.ar()) {
               $$3.f.b(afz.a(this.ar(), bxe.a($$0), $$0.i(), this.aD));
            } else {
               $$3.f.b(afz.a(this.ar(), bxe.a(this), Set.of(), this.aD));
            }
         }
      }
   }

   public void a(bxe $$0, Set<bxf> $$1) {
      bxe $$2 = bxe.a(this);
      bxe $$3 = bxe.a($$2, $$0, $$1);
      this.o($$3.a().d, $$3.a().e, $$3.a().f);
      this.w($$3.c());
      this.r($$3.c());
      this.x($$3.d());
      this.ay();
      this.by();
      this.i($$3.b());
      this.bi.clear();
   }

   public void a(float $$0, float $$1) {
      this.w($$0);
      this.r($$0);
      this.x($$1);
      this.bA();
   }

   public void g(jj $$0) {
      if (this.dV() instanceof arn $$1) {
         $$1.m().a(aru.g, new dgw($$0), 3);
      }
   }

   protected void cD() {
      this.c(bvs.e.e);
      if (this instanceof bwp $$0) {
         $$0.z();
      }
   }

   public fcu a(jo.a $$0, l.a $$1) {
      return evs.a($$1, $$0, this.dt(), this.a(this.aw()));
   }

   public boolean n(boolean $$0) {
      return ($$0 || !this.bZ()) && this.bK();
   }

   public boolean a(dhp $$0, dhp $$1) {
      if ($$0.aj() == dhp.k && $$1.aj() == dhp.i) {
         for (bvs $$2 : this.cY()) {
            if ($$2 instanceof aro $$3 && !$$3.i) {
               return false;
            }
         }
      }

      return true;
   }

   public float a(dhi $$0, dgv $$1, jj $$2, dym $$3, eut $$4, float $$5) {
      return $$5;
   }

   public boolean a(dhi $$0, dgv $$1, jj $$2, dym $$3, float $$4) {
      return true;
   }

   public int cE() {
      return 3;
   }

   public boolean g_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bwb.a(this.aq()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.p);
      $$0.a("Entity Name", () -> this.al().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dA(), this.dC(), this.dG()));
      $$0.a("Entity's Block location", p.a(this.dV(), azk.a(this.dA()), azk.a(this.dC()), azk.a(this.dG())));
      fcu $$1 = this.dy();
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
      return n;
   }

   public static void b(double $$0) {
      n = $$0;
   }

   @Override
   public wv m_() {
      return fdu.a(this.cr(), this.al()).a($$0 -> $$0.a(this.cQ()).a(this.cH()));
   }

   public void b(@Nullable wv $$0) {
      this.al.a(aO, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public wv an() {
      return this.al.a(aO).orElse(null);
   }

   @Override
   public boolean h_() {
      return this.al.a(aO).isPresent();
   }

   public void o(boolean $$0) {
      this.al.a(aP, $$0);
   }

   public boolean cL() {
      return this.al.a(aP);
   }

   public boolean a(arn $$0, double $$1, double $$2, double $$3, Set<bxf> $$4, float $$5, float $$6, boolean $$7) {
      bvs $$8 = this.b(new evt($$0, new fcu($$1, $$2, $$3), fcu.c, $$5, $$6, $$4, evt.a));
      return $$8 != null;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dV() instanceof arn) {
         this.b($$0, $$1, $$2, this.dL(), this.dN());
         this.v();
      }
   }

   private void v() {
      this.da().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.q.iterator();

         while (var1.hasNext()) {
            bvs $$1 = (bvs)var1.next();
            $$0.a($$1, bvs::e);
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
   public void a(List<akk.c<?>> $$0) {
   }

   @Override
   public void a(akg<?> $$0) {
      if (aq.equals($$0)) {
         this.i_();
      }
   }

   @Deprecated
   protected void cN() {
      bxd $$0 = this.aw();
      bvv $$1 = this.a($$0);
      this.bb = $$1;
      this.bc = $$1.c();
   }

   public void i_() {
      bvv $$0 = this.bb;
      bxd $$1 = this.aw();
      bvv $$2 = this.a($$1);
      this.bb = $$2;
      this.bc = $$2.c();
      this.ay();
      boolean $$3 = $$2.a() <= 4.0F && $$2.b() <= 4.0F;
      if (!this.s.C && !this.ak && !this.ad && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cqi)) {
         this.a($$0);
      }
   }

   public boolean a(bvv $$0) {
      bvv $$1 = this.a(this.aw());
      fcu $$2 = this.dt().b(0.0, (double)$$0.b() / 2.0, 0.0);
      double $$3 = (double)Math.max(0.0F, $$1.a() - $$0.a()) + 1.0E-6;
      double $$4 = (double)Math.max(0.0F, $$1.b() - $$0.b()) + 1.0E-6;
      fdo $$5 = fdl.a(fcp.a($$2, $$3, $$4, $$3));
      Optional<fcu> $$6 = this.s.a(this, $$5, $$2, (double)$$1.a(), (double)$$1.b(), (double)$$1.a());
      if ($$6.isPresent()) {
         this.b($$6.get().b(0.0, (double)(-$$1.b()) / 2.0, 0.0));
         return true;
      } else {
         if ($$1.a() > $$0.a() && $$1.b() > $$0.b()) {
            fdo $$7 = fdl.a(fcp.a($$2, $$3, 1.0E-6, $$3));
            Optional<fcu> $$8 = this.s.a(this, $$7, $$2, (double)$$1.a(), (double)$$0.b(), (double)$$1.a());
            if ($$8.isPresent()) {
               this.b($$8.get().b(0.0, (double)(-$$0.b()) / 2.0 + 1.0E-6, 0.0));
               return true;
            }
         }

         return false;
      }
   }

   public jo cO() {
      return jo.a((double)this.dL());
   }

   public jo cP() {
      return this.cO();
   }

   protected xb cQ() {
      return new xb.c(new xb.b(this.aq(), this.cG(), this.al()));
   }

   public boolean a(aro $$0) {
      return true;
   }

   @Override
   public final fcp cR() {
      return this.aC;
   }

   public final void a(fcp $$0) {
      this.aC = $$0;
   }

   public final float d(bxd $$0) {
      return this.a($$0).c();
   }

   public final float cS() {
      return this.bc;
   }

   public fcu t(float $$0) {
      return this.cT();
   }

   protected fcu cT() {
      return new fcu(0.0, (double)this.cS(), (double)(this.dq() * 0.4F));
   }

   public bxi a_(int $$0) {
      return bxi.a;
   }

   public dhp cU() {
      return this.dV();
   }

   @Nullable
   public MinecraftServer cV() {
      return this.dV().p();
   }

   public btq a(cqi $$0, fcu $$1, btp $$2) {
      return btq.e;
   }

   public boolean a(dhi $$0) {
      return false;
   }

   public void d(aro $$0) {
   }

   public void e(aro $$0) {
   }

   public float a(drm $$0) {
      float $$1 = azk.h(this.dL());
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

   public float a(dpv $$0) {
      float $$1 = azk.h(this.dL());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public crc a(crb $$0) {
      return this.aq().a(axd.r) ? crc.b : crc.a;
   }

   @Nullable
   public bwr cW() {
      return null;
   }

   public final boolean cX() {
      return this.cW() != null;
   }

   public final List<bvs> cY() {
      return this.q;
   }

   @Nullable
   public bvs cZ() {
      return this.q.isEmpty() ? null : (bvs)this.q.get(0);
   }

   public boolean y(bvs $$0) {
      return this.q.contains($$0);
   }

   public boolean a(Predicate<bvs> $$0) {
      UnmodifiableIterator var2 = this.q.iterator();

      while (var2.hasNext()) {
         bvs $$1 = (bvs)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bvs> D() {
      return this.q.stream().flatMap(bvs::da);
   }

   @Override
   public Stream<bvs> da() {
      return Stream.concat(Stream.of(this), this.D());
   }

   @Override
   public Stream<bvs> db() {
      return Stream.concat(this.q.stream().flatMap(bvs::db), Stream.of(this));
   }

   public Iterable<bvs> dc() {
      return () -> this.D().iterator();
   }

   public int dd() {
      return (int)this.D().filter($$0 -> $$0 instanceof cqi).count();
   }

   public boolean de() {
      return this.dd() == 1;
   }

   public bvs df() {
      bvs $$0 = this;

      while ($$0.bZ()) {
         $$0 = $$0.dk();
      }

      return $$0;
   }

   public boolean z(bvs $$0) {
      return this.df() == $$0.df();
   }

   public boolean A(bvs $$0) {
      if (!$$0.bZ()) {
         return false;
      } else {
         bvs $$1 = $$0.dk();
         return $$1 == this ? true : this.A($$1);
      }
   }

   public final boolean dg() {
      return this.s.w_() ? this.dh() : !this.L_();
   }

   protected boolean dh() {
      bwr $$0 = this.cW();
      return $$0 != null && $$0.dh();
   }

   public boolean L_() {
      bwr $$0 = this.cW();
      return $$0 != null && $$0.L_();
   }

   public boolean di() {
      return this.dg();
   }

   public boolean dj() {
      return this.dg();
   }

   protected static fcu a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -azk.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = azk.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new fcu((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public fcu b(bwr $$0) {
      return new fcu(this.dA(), this.cR().e, this.dG());
   }

   @Nullable
   public bvs dk() {
      return this.r;
   }

   @Nullable
   public bvs dl() {
      return this.r != null && this.r.cW() == this ? this.r : null;
   }

   public euy j_() {
      return euy.a;
   }

   public awl dm() {
      return awl.g;
   }

   protected int dn() {
      return 1;
   }

   public ex d(arn $$0) {
      return new ex(ew.a, this.dt(), this.bU(), $$0, 0, this.al().getString(), this.m_(), $$0.p(), this);
   }

   public void a(fj.a $$0, fcu $$1) {
      fcu $$2 = $$0.a(this);
      double $$3 = $$1.d - $$2.d;
      double $$4 = $$1.e - $$2.e;
      double $$5 = $$1.f - $$2.f;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.x(azk.h((float)(-(azk.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.w(azk.h((float)(azk.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.r(this.dL());
      this.O = this.dN();
      this.N = this.dL();
   }

   public float u(float $$0) {
      return azk.h($$0, this.N, this.aA);
   }

   public boolean a(axp<eus> $$0, double $$1) {
      if (this.do()) {
         return false;
      } else {
         fcp $$2 = this.cR().h(0.001);
         int $$3 = azk.a($$2.a);
         int $$4 = azk.c($$2.d);
         int $$5 = azk.a($$2.b);
         int $$6 = azk.c($$2.e);
         int $$7 = azk.a($$2.c);
         int $$8 = azk.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cJ();
         boolean $$11 = false;
         fcu $$12 = fcu.c;
         int $$13 = 0;
         jj.a $$14 = new jj.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  eut $$18 = this.dV().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a(this.dV(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           fcu $$20 = $$18.c(this.dV(), $$14);
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

            if (!(this instanceof cqi)) {
               $$12 = $$12.d();
            }

            fcu $$21 = this.dy();
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
      fcp $$0 = this.cR().g(1.0);
      int $$1 = azk.a($$0.a);
      int $$2 = azk.c($$0.d);
      int $$3 = azk.a($$0.c);
      int $$4 = azk.c($$0.f);
      return !this.dV().b($$1, $$3, $$2, $$4);
   }

   public double b(axp<eus> $$0) {
      return this.ah.getDouble($$0);
   }

   public double dp() {
      return (double)this.cS() < 0.4 ? 0.0 : 0.4;
   }

   public final float dq() {
      return this.bb.a();
   }

   public final float dr() {
      return this.bb.b();
   }

   public zc<abr> a(arl $$0) {
      return new abs(this, $$0);
   }

   public bvv a(bxd $$0) {
      return this.o.n();
   }

   public final bvu ds() {
      return this.bb.d();
   }

   public fcu dt() {
      return this.t;
   }

   public fcu du() {
      return this.dt();
   }

   @Override
   public jj dv() {
      return this.u;
   }

   public dym dw() {
      if (this.bh == null) {
         this.bh = this.dV().a_(this.dv());
      }

      return this.bh;
   }

   public dgw dx() {
      return this.ay;
   }

   public fcu dy() {
      return this.az;
   }

   public void i(fcu $$0) {
      this.az = $$0;
   }

   public void j(fcu $$0) {
      this.i(this.dy().e($$0));
   }

   public void n(double $$0, double $$1, double $$2) {
      this.i(new fcu($$0, $$1, $$2));
   }

   public final int dz() {
      return this.u.u();
   }

   public final double dA() {
      return this.t.d;
   }

   public double c(double $$0) {
      return this.t.d + (double)this.dq() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ae.j() - 1.0) * $$0);
   }

   public final int dB() {
      return this.u.v();
   }

   public final double dC() {
      return this.t.e;
   }

   public double e(double $$0) {
      return this.t.e + (double)this.dr() * $$0;
   }

   public double dD() {
      return this.e(this.ae.j());
   }

   public double dE() {
      return this.t.e + (double)this.bc;
   }

   public final int dF() {
      return this.u.w();
   }

   public final double dG() {
      return this.t.f;
   }

   public double f(double $$0) {
      return this.t.f + (double)this.dq() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ae.j() - 1.0) * $$0);
   }

   public final void o(double $$0, double $$1, double $$2) {
      if (this.t.d != $$0 || this.t.e != $$1 || this.t.f != $$2) {
         this.t = new fcu($$0, $$1, $$2);
         int $$3 = azk.a($$0);
         int $$4 = azk.a($$1);
         int $$5 = azk.a($$2);
         if ($$3 != this.u.u() || $$4 != this.u.v() || $$5 != this.u.w()) {
            this.u = new jj($$3, $$4, $$5);
            this.bh = null;
            if (kl.a($$3) != this.ay.h || kl.a($$5) != this.ay.i) {
               this.ay = new dgw(this.u);
            }
         }

         this.aT.a();
      }
   }

   public void dH() {
   }

   public fcu v(float $$0) {
      return this.p($$0).b(0.0, (double)this.bc * 0.7, 0.0);
   }

   public void a(abs $$0) {
      int $$1 = $$0.b();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      double $$4 = $$0.i();
      this.f($$2, $$3, $$4);
      this.b($$2, $$3, $$4, $$0.n(), $$0.m());
      this.e($$1);
      this.a_($$0.e());
      fcu $$5 = new fcu($$0.j(), $$0.k(), $$0.l());
      this.i($$5);
   }

   @Nullable
   public cxy dI() {
      return null;
   }

   public void p(boolean $$0) {
      this.av = $$0;
   }

   public boolean dJ() {
      return !this.aq().a(axd.k);
   }

   public boolean dK() {
      return (this.av || this.aw) && this.dJ();
   }

   public float dL() {
      return this.aA;
   }

   public float dM() {
      return this.dL();
   }

   public void w(float $$0) {
      if (!Float.isFinite($$0)) {
         af.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aA = $$0;
      }
   }

   public float dN() {
      return this.aB;
   }

   public void x(float $$0) {
      if (!Float.isFinite($$0)) {
         af.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aB = Math.clamp($$0 % 360.0F, -90.0F, 90.0F);
      }
   }

   public boolean dO() {
      return false;
   }

   public float dP() {
      return 0.0F;
   }

   public void b_(@Nullable bvs $$0) {
   }

   @Override
   public final boolean dQ() {
      return this.aE != null;
   }

   @Nullable
   public bvs.e dR() {
      return this.aE;
   }

   @Override
   public final void c(bvs.e $$0) {
      if (this.aE == null) {
         this.aE = $$0;
      }

      if (this.aE.a()) {
         this.bP();
      }

      this.cY().forEach(bvs::bP);
      this.aT.a($$0);
      this.b($$0);
   }

   protected void dS() {
      this.aE = null;
   }

   @Override
   public void a(ecs $$0) {
      this.aT = $$0;
   }

   @Override
   public boolean dT() {
      if (this.aE != null && !this.aE.b()) {
         return false;
      } else {
         return this.bZ() ? false : !this.ca() || !this.de();
      }
   }

   @Override
   public boolean dU() {
      return false;
   }

   public boolean c(arn $$0, jj $$1) {
      return true;
   }

   public dhp dV() {
      return this.s;
   }

   protected void a(dhp $$0) {
      this.s = $$0;
   }

   public bui dW() {
      return this.dV().al();
   }

   public kg dX() {
      return this.dV().F_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = azk.d($$6, this.dA(), $$1);
      double $$8 = azk.d($$6, this.dC(), $$2);
      double $$9 = azk.d($$6, this.dG(), $$3);
      float $$10 = (float)azk.e($$6, (double)this.dL(), $$4);
      float $$11 = (float)azk.d($$6, (double)this.dN(), $$5);
      this.a_($$7, $$8, $$9);
      this.b($$10, $$11);
   }

   public azs dY() {
      return this.ae;
   }

   public fcu ah() {
      if (this.cW() instanceof cqi $$0 && this.bK()) {
         return $$0.ah();
      }

      return this.dy();
   }

   @Nullable
   public cxy dZ() {
      return null;
   }

   public Optional<alc<exq>> ea() {
      return this.o.j();
   }

   protected void a(kr $$0) {
      this.a($$0, kx.g);
   }

   public final void c(cxy $$0) {
      this.a($$0.a());
   }

   @Nullable
   @Override
   public <T> T a(kw<? extends T> $$0) {
      return $$0 == kx.g ? b((kw<T>)$$0, this.an()) : null;
   }

   @Nullable
   @Contract("_,!null->!null;_,_->_")
   protected static <T> T b(kw<T> $$0, @Nullable Object $$1) {
      return (T)$$1;
   }

   public <T> void c(kw<T> $$0, T $$1) {
      this.d($$0, $$1);
   }

   protected <T> boolean d(kw<T> $$0, T $$1) {
      if ($$0 == kx.g) {
         this.b(b(kx.g, $$1));
         return true;
      } else {
         return false;
      }
   }

   protected <T> boolean a(kr $$0, kw<T> $$1) {
      T $$2 = $$0.a($$1);
      return $$2 != null ? this.d($$1, $$2) : false;
   }

   static class a implements bvs.f {
      boolean a = false;
      boolean b = false;

      public void a(boolean $$0) {
         this.a = $$0;
         this.b = false;
      }

      @Override
      public void a(dym $$0, boolean $$1, boolean $$2) {
         boolean $$3 = $$1 && $$0.a(dkw.rt);
         boolean $$4 = $$1 && $$0.a(awz.aN);
         boolean $$5 = $$2 && $$0.y().a(axf.b);
         boolean $$6 = $$2 && $$0.y().a(axf.a);
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
      void accept(bvs var1, double var2, double var4, double var6);
   }

   static record c(fcu a, fcu b) {
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
      void a(dym var1, boolean var2, boolean var3);
   }
}
