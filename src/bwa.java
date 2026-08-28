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

public abstract class bwa implements akk, bub, edt, ffa, ke {
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
   private static final fdr d = new fdr(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double k = 0.014;
   private static final double l = 0.007;
   private static final double m = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double n = 1.0;
   private final bwj<?> o;
   private int p = c.incrementAndGet();
   public boolean I;
   private ImmutableList<bwa> q = ImmutableList.of();
   protected int J;
   @Nullable
   private bwa r;
   private dip s;
   public double K;
   public double L;
   public double M;
   private fdw t;
   private iu u;
   private dhw ay;
   private fdw az = fdw.c;
   private float aA;
   private float aB;
   public float N;
   public float O;
   private fdr aC = d;
   private boolean aD;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected fdw U = fdw.c;
   @Nullable
   private bwa.e aE;
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
   protected final azt ae = azt.a();
   public int af;
   private int aG = -this.dn();
   protected boolean ag;
   protected Object2DoubleMap<axp<evu>> ah = new Object2DoubleArrayMap(2);
   protected boolean ai;
   private final Set<axp<evu>> aH = new HashSet<>();
   public int aj;
   protected boolean ak = true;
   protected final akl al;
   protected static final akh<Byte> am = akl.a(bwa.class, akj.a);
   protected static final int an = 0;
   private static final int aI = 1;
   private static final int aJ = 3;
   private static final int aK = 4;
   private static final int aL = 5;
   protected static final int ao = 6;
   protected static final int ap = 7;
   private static final akh<Integer> aM = akl.a(bwa.class, akj.b);
   private static final akh<Optional<ww>> aN = akl.a(bwa.class, akj.g);
   private static final akh<Boolean> aO = akl.a(bwa.class, akj.k);
   private static final akh<Boolean> aP = akl.a(bwa.class, akj.k);
   private static final akh<Boolean> aQ = akl.a(bwa.class, akj.k);
   protected static final akh<bxl> aq = akl.a(bwa.class, akj.w);
   private static final akh<Integer> aR = akl.a(bwa.class, akj.b);
   private edu aS = edu.a;
   private final air aT = new air();
   public boolean ar;
   @Nullable
   public bxk as;
   private int aU;
   private boolean aV;
   protected UUID at = azk.a(this.ae);
   protected String au = this.at.toString();
   private boolean aW;
   private final Set<String> aX = Sets.newHashSet();
   private final double[] aY = new double[]{0.0, 0.0, 0.0};
   private long aZ;
   private bwd ba;
   private float bb;
   public boolean av;
   public boolean aw;
   public Optional<iu> ax = Optional.empty();
   private boolean bc = false;
   private float bd;
   private int be;
   private boolean bf;
   @Nullable
   private dzo bg = null;
   private final List<bwa.c> bh = new ArrayList<>();
   private final LongSet bi = new LongOpenHashSet();
   private final bwa.a bj = new bwa.a();

   public bwa(bwj<?> $$0, dip $$1) {
      this.o = $$0;
      this.s = $$1;
      this.ba = $$0.n();
      this.t = fdw.c;
      this.u = iu.c;
      this.ay = dhw.e;
      akl.a $$2 = new akl.a(this);
      $$2.a(am, (byte)0);
      $$2.a(aM, this.cs());
      $$2.a(aO, false);
      $$2.a(aN, Optional.empty());
      $$2.a(aP, false);
      $$2.a(aQ, false);
      $$2.a(aq, bxl.a);
      $$2.a(aR, 0);
      this.a($$2);
      this.al = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.bb = this.ba.c();
   }

   public boolean a(iu $$0, dzo $$1) {
      feq $$2 = $$1.b(this.dV(), $$0, feb.a(this)).a($$0);
      return fen.c($$2, fen.a(this.cR()), fea.i);
   }

   public int f_() {
      ffd $$0 = this.cr();
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
      this.aT.e(new fdw($$0, $$1, $$2));
   }

   public air ap() {
      return this.aT;
   }

   public bwj<?> aq() {
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
      return this.aX;
   }

   public boolean a(String $$0) {
      return this.aX.size() >= 1024 ? false : this.aX.add($$0);
   }

   public boolean b(String $$0) {
      return this.aX.remove($$0);
   }

   public void c(aro $$0) {
      this.a(bwa.e.a);
      this.a(eeo.p);
   }

   public final void at() {
      this.a(bwa.e.b);
   }

   protected abstract void a(akl.a var1);

   public akl au() {
      return this.al;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bwa ? ((bwa)$$0).p == this.p : false;
   }

   @Override
   public int hashCode() {
      return this.p;
   }

   public void a(bwa.e $$0) {
      this.c($$0);
   }

   public void av() {
   }

   public void b(bwa.e $$0) {
   }

   public void b(bxl $$0) {
      this.al.a(aq, $$0);
   }

   public bxl aw() {
      return this.al.a(aq);
   }

   public boolean c(bxl $$0) {
      return this.aw() == $$0;
   }

   public boolean a(bwa $$0, double $$1) {
      return this.dt().a((jo)$$0.dt(), $$1);
   }

   public boolean a(bwa $$0, double $$1, double $$2) {
      double $$3 = $$0.dA() - this.dA();
      double $$4 = $$0.dC() - this.dC();
      double $$5 = $$0.dG() - this.dG();
      return azk.e($$3, $$5) < azk.k($$1) && azk.k($$4) < azk.k($$2);
   }

   protected void b(float $$0, float $$1) {
      this.w($$0 % 360.0F);
      this.x($$1 % 360.0F);
   }

   public final void b(fdw $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      this.a(this.ax());
   }

   protected final fdr ax() {
      return this.c(this.t);
   }

   protected fdr c(fdw $$0) {
      return this.ba.a($$0);
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
      bqj $$0 = bqi.a();
      $$0.a("entityBaseTick");
      this.bg = null;
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
      if (this.dV() instanceof aro $$1) {
         if (this.aG > 0) {
            if (this.bi()) {
               this.h(this.aG - 4);
               if (this.aG < 0) {
                  this.aH();
               }
            } else {
               if (this.aG % 20 == 0 && !this.bw()) {
                  this.a($$1, this.dW().d(), 1.0F);
               }

               this.h(this.aG - 1);
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
         this.c(this.aG > 0);
      }

      this.ak = false;
      if (this.dV() instanceof aro $$2 && this instanceof bwx) {
         bwx.a_($$2, (bwa)((bwx)this));
      }

      $$0.c();
   }

   public void c(boolean $$0) {
      this.b(0, $$0 || this.bf);
   }

   public void aA() {
      if (this.dC() < (double)(this.dV().G_() - 64)) {
         this.aI();
      }
   }

   public void aB() {
      this.aU = this.bX();
   }

   public void f(int $$0) {
      this.aU = $$0;
   }

   public int aC() {
      return this.aU;
   }

   public boolean aD() {
      return this.aU > 0;
   }

   protected void M() {
      if (this.aD()) {
         this.aU--;
      }
   }

   public void aE() {
      if (!this.bi()) {
         this.e(15.0F);
         if (this.dV() instanceof aro $$0 && this.a($$0, this.dW().e(), 4.0F) && this.aF() && !this.bb()) {
            $$0.a(null, this.dA(), this.dC(), this.dG(), awl.kA, this.dm(), 0.4F, 2.0F + this.ae.i() * 0.4F);
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
      if (this.aG < $$0) {
         this.h($$0);
      }
   }

   public void h(int $$0) {
      this.aG = $$0;
   }

   public int aG() {
      return this.aG;
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

   private boolean b(fdr $$0) {
      return this.dV().a(this, $$0) && !this.dV().d($$0);
   }

   public void d(boolean $$0) {
      this.aD = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, fdw $$1) {
      this.a($$0, this.P, $$1);
   }

   public void a(boolean $$0, boolean $$1, fdw $$2) {
      this.aD = $$0;
      this.P = $$1;
      this.b($$0, $$2);
   }

   public boolean d(iu $$0) {
      return this.ax.isPresent() && this.ax.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable fdw $$1) {
      if ($$0) {
         fdr $$2 = this.cR();
         fdr $$3 = new fdr($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<iu> $$4 = this.s.h(this, $$3);
         if ($$4.isPresent() || this.bc) {
            this.ax = $$4;
         } else if ($$1 != null) {
            fdr $$5 = $$3.d(-$$1.d, 0.0, -$$1.f);
            $$4 = this.s.h(this, $$5);
            this.ax = $$4;
         }

         this.bc = $$4.isEmpty();
      } else {
         this.bc = false;
         if (this.ax.isPresent()) {
            this.ax = Optional.empty();
         }
      }
   }

   public boolean aJ() {
      return this.aD;
   }

   public void a(bxd $$0, fdw $$1) {
      if (this.ad) {
         this.a_(this.dA() + $$1.d, this.dC() + $$1.e, this.dG() + $$1.f);
      } else {
         if ($$0 == bxd.c) {
            $$1 = this.e($$1);
            if ($$1.equals(fdw.c)) {
               return;
            }
         }

         bqj $$2 = bqi.a();
         $$2.a("move");
         if (this.U.h() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = fdw.c;
            this.i(fdw.c);
         }

         $$1 = this.a($$1, $$0);
         fdw $$3 = this.a($$1);
         double $$4 = $$3.h();
         if ($$4 > 1.0E-7 || $$1.h() - $$4 < 1.0E-7) {
            if (this.Z != 0.0 && $$4 >= 1.0) {
               fds $$5 = this.dV().a(new dhy(this.dt(), this.dt().e($$3), dhy.a.d, dhy.b.d, this));
               if ($$5.d() != fdu.a.a) {
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

         iu $$8 = this.aP();
         dzo $$9 = this.dV().a_($$8);
         if (this.dg()) {
            this.a($$3.e, this.aJ(), $$9, $$8);
         }

         if (this.dQ()) {
            $$2.c();
         } else {
            if (this.P) {
               fdw $$10 = this.dy();
               this.n($$6 ? 0.0 : $$10.d, $$10.e, $$7 ? 0.0 : $$10.f);
            }

            if (this.di()) {
               dlu $$11 = $$9.b();
               if ($$1.e != $$3.e) {
                  $$11.a(this.dV(), this);
               }
            }

            if (!this.dV().w_() || this.dg()) {
               bwa.d $$12 = this.bg();
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

   private void a(bwa.d $$0, fdw $$1, iu $$2, dzo $$3) {
      float $$4 = 0.6F;
      float $$5 = (float)($$1.g() * 0.6F);
      float $$6 = (float)($$1.i() * 0.6F);
      iu $$7 = this.aR();
      dzo $$8 = this.dV().a_($$7);
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
               this.a(eeo.Q);
            }
         }
      } else if ($$8.l()) {
         this.aO();
      }
   }

   public void aK() {
      this.a(this.bB(), this.t);
   }

   public void a(fdw $$0, fdw $$1) {
      if (this.aL()) {
         if (this.aJ()) {
            iu $$2 = this.aP();
            dzo $$3 = this.dV().a_($$2);
            $$3.b().a(this.dV(), $$2, $$3, this);
         }

         this.bh.add(new bwa.c($$0, $$1));
         List<bwa.c> $$4 = List.copyOf(this.bh);
         this.bh.clear();
         boolean $$5 = this.bY();
         this.bj.a($$5);
         this.a($$4, this.bj);
         if (this.bj.b) {
            this.aE();
         }

         if (!this.bj.a) {
            this.aH();
         }

         if ($$5 && !this.bY()) {
            this.aM();
         }

         if (!this.bj.a && this.aG <= 0) {
            this.h(-this.dn());
         }
      }
   }

   protected boolean aL() {
      return !this.dQ() && !this.ad;
   }

   private boolean c(dzo $$0) {
      return $$0.a(axa.aS) || $$0.a(dlw.rt);
   }

   private boolean a(iu $$0, dzo $$1, boolean $$2, boolean $$3, fdw $$4) {
      if ($$1.l()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aJ() || $$5 || this.ci() && $$4.e == 0.0 || this.cq()) && !this.ck()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dV().a(eeo.P, this.dt(), eeo.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean d(fdw $$0) {
      return false;
   }

   protected void aM() {
      if (!this.s.w_()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awl.kF, this.dm(), 0.7F, 1.6F + (this.ae.i() - this.ae.i()) * 0.4F);
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
            this.a(eeo.x);
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
            dzo $$2 = this.dV().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(axa.U)) && !$$2.a(axa.N) && !($$2.b() instanceof dou) ? $$1.h(azk.a(this.t.e - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = azk.a(this.t.d);
         int $$4 = azk.a(this.t.e - (double)$$0);
         int $$5 = azk.a(this.t.f);
         return new iu($$3, $$4, $$5);
      }
   }

   protected float aS() {
      float $$0 = this.dV().a_(this.dv()).b().j();
      float $$1 = this.dV().a_(this.aQ()).b().j();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aT() {
      dzo $$0 = this.dV().a_(this.dv());
      float $$1 = $$0.b().i();
      if (!$$0.a(dlw.J) && !$$0.a(dlw.nF)) {
         return (double)$$1 == 1.0 ? this.dV().a_(this.aQ()).b().i() : $$1;
      } else {
         return $$1;
      }
   }

   protected fdw a(fdw $$0, bxd $$1) {
      return $$0;
   }

   protected fdw e(fdw $$0) {
      if ($$0.h() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dV().ae();
         if ($$1 != this.aZ) {
            Arrays.fill(this.aY, 0.0);
            this.aZ = $$1;
         }

         if ($$0.d != 0.0) {
            double $$2 = this.a(ja.a.a, $$0.d);
            return Math.abs($$2) <= 1.0E-5F ? fdw.c : new fdw($$2, 0.0, 0.0);
         } else if ($$0.e != 0.0) {
            double $$3 = this.a(ja.a.b, $$0.e);
            return Math.abs($$3) <= 1.0E-5F ? fdw.c : new fdw(0.0, $$3, 0.0);
         } else if ($$0.f != 0.0) {
            double $$4 = this.a(ja.a.c, $$0.f);
            return Math.abs($$4) <= 1.0E-5F ? fdw.c : new fdw(0.0, 0.0, $$4);
         } else {
            return fdw.c;
         }
      }
   }

   private double a(ja.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = azk.a($$1 + this.aY[$$2], -0.51, 0.51);
      $$1 = $$3 - this.aY[$$2];
      this.aY[$$2] = $$3;
      return $$1;
   }

   private fdw a(fdw $$0) {
      fdr $$1 = this.cR();
      List<feq> $$2 = this.dV().c(this, $$1.b($$0));
      fdw $$3 = $$0.h() == 0.0 ? $$0 : a(this, $$0, $$1, this.dV(), $$2);
      boolean $$4 = $$0.d != $$3.d;
      boolean $$5 = $$0.e != $$3.e;
      boolean $$6 = $$0.f != $$3.f;
      boolean $$7 = $$5 && $$0.e < 0.0;
      if (this.dP() > 0.0F && ($$7 || this.aJ()) && ($$4 || $$6)) {
         fdr $$8 = $$7 ? $$1.d(0.0, $$3.e, 0.0) : $$1;
         fdr $$9 = $$8.b($$0.d, (double)this.dP(), $$0.f);
         if (!$$7) {
            $$9 = $$9.b(0.0, -1.0E-5F, 0.0);
         }

         List<feq> $$10 = a(this, this.s, $$2, $$9);
         float $$11 = (float)$$3.e;
         float[] $$12 = a($$8, $$10, this.dP(), $$11);

         for (float $$13 : $$12) {
            fdw $$14 = a(new fdw($$0.d, (double)$$13, $$0.f), $$8, $$10);
            if ($$14.j() > $$3.j()) {
               double $$15 = $$1.b - $$8.b;
               return $$14.b(0.0, -$$15, 0.0);
            }
         }
      }

      return $$3;
   }

   private static float[] a(fdr $$0, List<feq> $$1, float $$2, float $$3) {
      FloatSet $$4 = new FloatArraySet(4);

      for (feq $$5 : $$1) {
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

   public static fdw a(@Nullable bwa $$0, fdw $$1, fdr $$2, dip $$3, List<feq> $$4) {
      List<feq> $$5 = a($$0, $$3, $$4, $$2.b($$1));
      return a($$1, $$2, $$5);
   }

   private static List<feq> a(@Nullable bwa $$0, dip $$1, List<feq> $$2, fdr $$3) {
      Builder<feq> $$4 = ImmutableList.builderWithExpectedSize($$2.size() + 1);
      if (!$$2.isEmpty()) {
         $$4.addAll($$2);
      }

      ebg $$5 = $$1.A_();
      boolean $$6 = $$0 != null && $$5.a($$0, $$3);
      if ($$6) {
         $$4.add($$5.c());
      }

      $$4.addAll($$1.e($$0, $$3));
      return $$4.build();
   }

   private static fdw a(fdw $$0, fdr $$1, List<feq> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.d;
         double $$4 = $$0.e;
         double $$5 = $$0.f;
         if ($$4 != 0.0) {
            $$4 = fen.a(ja.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = fen.a(ja.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = fen.a(ja.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = fen.a(ja.a.c, $$1, $$2, $$5);
         }

         return new fdw($$3, $$4, $$5);
      }
   }

   protected float aU() {
      return (float)((int)this.X + 1);
   }

   protected awk aV() {
      return awl.kJ;
   }

   protected awk aW() {
      return awl.kI;
   }

   protected awk aX() {
      return awl.kI;
   }

   public void b(fdw $$0, fdw $$1) {
      this.bh.add(new bwa.c($$0, $$1));
   }

   private void a(List<bwa.c> $$0, bwa.f $$1) {
      if (this.aL()) {
         LongSet $$2 = this.bi;

         for (bwa.c $$3 : $$0) {
            fdw $$4 = $$3.a();
            fdw $$5 = $$3.b();
            fdr $$6 = this.c($$5).h(1.0E-5F);

            for (iu $$7 : dhv.a($$4, $$5, $$6)) {
               if (!this.bK()) {
                  return;
               }

               dzo $$8 = this.dV().a_($$7);
               if (!$$8.l() && $$2.add($$7.a())) {
                  feq $$9 = $$8.a((dhv)this.dV(), $$7, this);
                  boolean $$10 = $$9 == fen.b() || this.a($$4, $$5, $$9.a(new fdw($$7)).e());
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

   private boolean a(evv $$0, iu $$1, fdw $$2, fdw $$3) {
      fdr $$4 = $$0.e(this.dV(), $$1);
      return $$4 != null && this.a($$2, $$3, List.of($$4));
   }

   private boolean a(fdw $$0, fdw $$1, List<fdr> $$2) {
      fdr $$3 = this.c($$0);
      fdw $$4 = $$1.d($$0);
      return $$3.a($$4, $$2);
   }

   protected void a(dzo $$0) {
   }

   public iu a(aro $$0, iu $$1) {
      iu $$2 = $$0.aa();
      fdw $$3 = $$2.b();
      int $$4 = $$0.m($$2).a(efn.a.f, $$2.u(), $$2.w()) + 1;
      return iu.a($$3.d, (double)$$4, $$3.f);
   }

   public void a(je<eeo> $$0, @Nullable bwa $$1) {
      this.dV().a($$1, $$0, this.t);
   }

   public void a(je<eeo> $$0) {
      this.a($$0, this);
   }

   private void c(iu $$0, dzo $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.j();
      }
   }

   protected void aY() {
      bwa $$0 = Objects.requireNonNullElse(this.cW(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      fdw $$2 = $$0.dy();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      this.g($$3);
   }

   protected iu e(iu $$0) {
      iu $$1 = $$0.d();
      dzo $$2 = this.dV().a_($$1);
      return !$$2.a(axa.bp) && !$$2.a(axa.bq) ? $$0 : $$1;
   }

   protected void a(dzo $$0, dzo $$1) {
      dtn $$2 = $$0.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dzo $$0) {
      dtn $$1 = $$0.A();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(iu $$0, dzo $$1) {
      dtn $$2 = $$1.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dzo $$0) {
      return $$0.a(axa.bo) && this.af >= this.be + 20;
   }

   private void j() {
      this.bd = this.bd * (float)Math.pow(0.997, (double)(this.af - this.be));
      this.bd = Math.min(1.0F, this.bd + 0.07F);
      float $$0 = 0.5F + this.bd * this.ae.i() * 1.2F;
      float $$1 = 0.1F + this.bd * 1.2F;
      this.a(awl.E, $$1, $$0);
      this.be = this.af;
   }

   protected void g(float $$0) {
      this.a(this.aV(), $$0, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
   }

   protected void aZ() {
   }

   protected boolean ba() {
      return false;
   }

   public void a(awk $$0, float $$1, float $$2) {
      if (!this.bb()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), $$0, this.dm(), $$1, $$2);
      }
   }

   public void a(awk $$0) {
      if (!this.bb()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean bb() {
      return this.al.a(aP);
   }

   public void e(boolean $$0) {
      this.al.a(aP, $$0);
   }

   public boolean bc() {
      return this.al.a(aQ);
   }

   public void f(boolean $$0) {
      this.al.a(aQ, $$0);
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

   protected bwa.d bg() {
      return bwa.d.d;
   }

   public boolean bh() {
      return false;
   }

   public final void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.do()) {
         this.b($$3, new fdw($$0, $$1, $$2));
         iu $$4 = this.aP();
         dzo $$5 = this.dV().a_($$4);
         this.a($$1, $$3, $$5, $$4);
      }
   }

   protected void a(double $$0, boolean $$1, dzo $$2, iu $$3) {
      if (!this.bj() && $$0 < 0.0) {
         this.Z -= (double)((float)$$0);
      }

      if ($$1) {
         if (this.Z > 0.0) {
            $$2.b().a(this.dV(), $$2, $$3, this, this.Z);
            this.dV().a(eeo.A, this.t, eeo.a.a(this, this.ax.<dzo>map($$0x -> this.dV().a_($$0x)).orElse($$2)));
         }

         this.k();
      }
   }

   public boolean bi() {
      return this.aq().d();
   }

   public boolean a(double $$0, float $$1, bup $$2) {
      if (this.o.a(axd.o)) {
         return false;
      } else {
         if (this.ca()) {
            for (bwa $$3 : this.cY()) {
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
      if (this.dk() instanceof ctc $$0 && !$$0.bn()) {
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
      this.aH.clear();
      double $$0 = this.dE();
      if (this.dk() instanceof ctc $$2 && !$$2.bn() && $$2.cR().e >= $$0 && $$2.cR().b <= $$0) {
         return;
      }

      iu $$3 = iu.a(this.dA(), $$0, this.dG());
      evv $$4 = this.dV().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a(this.dV(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aH::add);
      }
   }

   protected void br() {
      bwa $$0 = Objects.requireNonNullElse(this.cW(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      fdw $$2 = $$0.dy();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aW(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      } else {
         this.a(this.aX(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      }

      float $$4 = (float)azk.a(this.dC());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.ba.a() * 20.0F; $$5++) {
         double $$6 = (this.ae.j() * 2.0 - 1.0) * (double)this.ba.a();
         double $$7 = (this.ae.j() * 2.0 - 1.0) * (double)this.ba.a();
         this.dV().a(lx.d, this.dA() + $$6, (double)($$4 + 1.0F), this.dG() + $$7, $$2.d, $$2.e - this.ae.j() * 0.2F, $$2.f);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.ba.a() * 20.0F; $$8++) {
         double $$9 = (this.ae.j() * 2.0 - 1.0) * (double)this.ba.a();
         double $$10 = (this.ae.j() * 2.0 - 1.0) * (double)this.ba.a();
         this.dV().a(lx.ap, this.dA() + $$9, (double)($$4 + 1.0F), this.dG() + $$10, $$2.d, $$2.e, $$2.f);
      }

      this.a(eeo.O);
   }

   @Deprecated
   protected dzo bs() {
      return this.dV().a_(this.aP());
   }

   public dzo bt() {
      return this.dV().a_(this.aR());
   }

   public boolean bu() {
      return this.cj() && !this.bj() && !this.U_() && !this.ci() && !this.bw() && this.bK();
   }

   protected void bv() {
      iu $$0 = this.aP();
      dzo $$1 = this.dV().a_($$0);
      if ($$1.o() != dsf.a) {
         fdw $$2 = this.dy();
         iu $$3 = this.dv();
         double $$4 = this.dA() + (this.ae.j() - 0.5) * (double)this.ba.a();
         double $$5 = this.dG() + (this.ae.j() - 0.5) * (double)this.ba.a();
         if ($$3.u() != $$0.u()) {
            $$4 = azk.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = azk.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dV().a(new lp(lx.b, $$1), $$4, this.dC() + 0.1, $$5, $$2.d * -4.0, 1.5, $$2.f * -4.0);
      }
   }

   public boolean a(axp<evu> $$0) {
      return this.aH.contains($$0);
   }

   public boolean bw() {
      return !this.ak && this.ah.getDouble(axf.b) > 0.0;
   }

   public void a(float $$0, fdw $$1) {
      fdw $$2 = a($$1, $$0, this.dL());
      this.i(this.dy().e($$2));
   }

   protected static fdw a(fdw $$0, float $$1, float $$2) {
      double $$3 = $$0.h();
      if ($$3 < 1.0E-7) {
         return fdw.c;
      } else {
         fdw $$4 = ($$3 > 1.0 ? $$0.d() : $$0).c((double)$$1);
         float $$5 = azk.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = azk.b($$2 * (float) (Math.PI / 180.0));
         return new fdw($$4.d * (double)$$6 - $$4.f * (double)$$5, $$4.e, $$4.f * (double)$$6 + $$4.d * (double)$$5);
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

   public void f(fdw $$0) {
      this.e($$0.d, $$0.e, $$0.f);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dL(), this.dN());
   }

   public void a(iu $$0, float $$1, float $$2) {
      this.b($$0.c(), $$1, $$2);
   }

   public void b(fdw $$0, float $$1, float $$2) {
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

   public final void c(fdw $$0, float $$1, float $$2) {
      this.k($$0);
      this.f($$1, $$2);
   }

   protected void bz() {
      this.k(this.t);
   }

   public void bA() {
      this.f(this.dL(), this.dN());
   }

   private void k(fdw $$0) {
      this.K = this.aa = $$0.d;
      this.L = this.ab = $$0.e;
      this.M = this.ac = $$0.f;
   }

   private void f(float $$0, float $$1) {
      this.N = $$0;
      this.O = $$1;
   }

   public final fdw bB() {
      return new fdw(this.aa, this.ab, this.ac);
   }

   public float f(bwa $$0) {
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

   public double g(bwa $$0) {
      return this.g($$0.dt());
   }

   public double g(fdw $$0) {
      double $$1 = this.dA() - $$0.d;
      double $$2 = this.dC() - $$0.e;
      double $$3 = this.dG() - $$0.f;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void a_(cqs $$0) {
   }

   public void h(bwa $$0) {
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

   public void h(fdw $$0) {
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
   public final void a(bup $$0, float $$1) {
      if (this.s instanceof aro $$2) {
         this.a($$2, $$0, $$1);
      }
   }

   @Deprecated
   public final boolean b(bup $$0, float $$1) {
      return this.s instanceof aro $$2 ? this.a($$2, $$0, $$1) : this.b($$0);
   }

   public abstract boolean a(aro var1, bup var2, float var3);

   public boolean b(bup $$0) {
      return false;
   }

   public final fdw h(float $$0) {
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
      return $$0 == 1.0F ? this.dN() : azk.h($$0, this.O, this.dN());
   }

   public float l(float $$0) {
      return $$0 == 1.0F ? this.dL() : azk.i($$0, this.N, this.dL());
   }

   public final fdw d(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = azk.b($$3);
      float $$5 = azk.a($$3);
      float $$6 = azk.b($$2);
      float $$7 = azk.a($$2);
      return new fdw((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final fdw m(float $$0) {
      return this.e(this.i($$0), this.j($$0));
   }

   protected final fdw e(float $$0, float $$1) {
      return this.d($$0 - 90.0F, $$1);
   }

   public final fdw bE() {
      return new fdw(this.dA(), this.dE(), this.dG());
   }

   public final fdw n(float $$0) {
      double $$1 = azk.d((double)$$0, this.K, this.dA());
      double $$2 = azk.d((double)$$0, this.L, this.dC()) + (double)this.cS();
      double $$3 = azk.d((double)$$0, this.M, this.dG());
      return new fdw($$1, $$2, $$3);
   }

   public fdw o(float $$0) {
      return this.n($$0);
   }

   public final fdw p(float $$0) {
      double $$1 = azk.d((double)$$0, this.K, this.dA());
      double $$2 = azk.d((double)$$0, this.L, this.dC());
      double $$3 = azk.d((double)$$0, this.M, this.dG());
      return new fdw($$1, $$2, $$3);
   }

   public fdu a(double $$0, float $$1, boolean $$2) {
      fdw $$3 = this.n($$1);
      fdw $$4 = this.h($$1);
      fdw $$5 = $$3.b($$4.d * $$0, $$4.e * $$0, $$4.f * $$0);
      return this.dV().a(new dhy($$3, $$5, dhy.a.b, $$2 ? dhy.b.c : dhy.b.a, this));
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

   public void a(bwa $$0, bup $$1) {
      if ($$0 instanceof arp) {
         ap.d.a((arp)$$0, this, $$1);
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

   public boolean d(tx $$0) {
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

   public boolean e(tx $$0) {
      return this.bZ() ? false : this.d($$0);
   }

   public tx f(tx $$0) {
      try {
         if (this.r != null) {
            $$0.a("Pos", this.a(this.r.dA(), this.dC(), this.r.dG()));
         } else {
            $$0.a("Pos", this.a(this.dA(), this.dC(), this.dG()));
         }

         fdw $$1 = this.dy();
         $$0.a("Motion", this.a($$1.d, $$1.e, $$1.f));
         $$0.a("Rotation", this.a(this.dL(), this.dN()));
         $$0.a("fall_distance", this.Z);
         $$0.a("Fire", (short)this.aG);
         $$0.a("Air", (short)this.ct());
         $$0.a("OnGround", this.aJ());
         $$0.a("Invulnerable", this.aV);
         $$0.a("PortalCooldown", this.aU);
         $$0.a("UUID", this.cG());
         ww $$2 = this.an();
         if ($$2 != null) {
            alc<uu> $$3 = this.dX().a(ul.a);
            $$0.a("CustomName", (uu)wy.a.encodeStart($$3, $$2).getOrThrow());
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

         if (this.aW) {
            $$0.a("Glowing", true);
         }

         int $$4 = this.cu();
         if ($$4 > 0) {
            $$0.a("TicksFrozen", this.cu());
         }

         if (this.bf) {
            $$0.a("HasVisualFire", this.bf);
         }

         if (!this.aX.isEmpty()) {
            ud $$5 = new ud();

            for (String $$6 : this.aX) {
               $$5.add(us.a($$6));
            }

            $$0.a("Tags", $$5);
         }

         this.b($$0);
         if (this.ca()) {
            ud $$7 = new ud();

            for (bwa $$8 : this.cY()) {
               tx $$9 = new tx();
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

   public void g(tx $$0) {
      try {
         ud $$1 = $$0.c("Pos", 6);
         ud $$2 = $$0.c("Motion", 6);
         ud $$3 = $$0.c("Rotation", 5);
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
         this.aG = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.j($$0.g("Air"));
         }

         this.aD = $$0.q("OnGround");
         this.aV = $$0.q("Invulnerable");
         this.aU = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.at = $$0.a("UUID");
            this.au = this.at.toString();
         }

         if (!Double.isFinite(this.dA()) || !Double.isFinite(this.dC()) || !Double.isFinite(this.dG())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dL()) && Double.isFinite((double)this.dN())) {
            this.ay();
            this.b(this.dL(), this.dN());
            uu $$8 = $$0.c("CustomName");
            if ($$8 != null) {
               alc<uu> $$9 = this.dX().a(ul.a);
               wy.a.parse($$9, $$8).ifSuccess(this::b).ifError($$1x -> b.warn("Failed to parse entity custom name {}: {}", $$8, $$1x));
            } else {
               this.al.a(aN, Optional.empty());
            }

            this.o($$0.q("CustomNameVisible"));
            this.e($$0.q("Silent"));
            this.f($$0.q("NoGravity"));
            this.j($$0.q("Glowing"));
            this.k($$0.h("TicksFrozen"));
            this.bf = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.aX.clear();
               ud $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.aX.add($$10.j($$12));
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
      bwj<?> $$0 = this.aq();
      ale $$1 = bwj.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(tx var1);

   protected abstract void b(tx var1);

   protected ud a(double... $$0) {
      ud $$1 = new ud();

      for (double $$2 : $$0) {
         $$1.add(ty.a($$2));
      }

      return $$1;
   }

   protected ud a(float... $$0) {
      ud $$1 = new ud();

      for (float $$2 : $$0) {
         $$1.add(ua.a($$2));
      }

      return $$1;
   }

   @Nullable
   public cmx a(aro $$0, dio $$1) {
      return this.a($$0, $$1, 0);
   }

   @Nullable
   public cmx a(aro $$0, dio $$1, int $$2) {
      return this.a($$0, new cys($$1), (float)$$2);
   }

   @Nullable
   public cmx a(aro $$0, cys $$1) {
      return this.a($$0, $$1, 0.0F);
   }

   @Nullable
   public cmx a(aro $$0, cys $$1, float $$2) {
      if ($$1.f()) {
         return null;
      } else {
         cmx $$3 = new cmx($$0, this.dA(), this.dC() + (double)$$2, this.dG(), $$1);
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
         float $$0 = this.ba.a() * 0.8F;
         fdr $$1 = fdr.a(this.bE(), (double)$$0, 1.0E-6, (double)$$0);
         return iu.b($$1).anyMatch($$1x -> {
            dzo $$2 = this.dV().a_($$1x);
            return !$$2.l() && $$2.j(this.dV(), $$1x) && fen.c($$2.g(this.dV(), $$1x).a($$1x), fen.a($$1), fea.i);
         });
      }
   }

   public bty a(cqs $$0, btx $$1) {
      if (this.bK() && this instanceof bwx $$2) {
         if ($$2.C() == $$0) {
            if (!this.dV().w_()) {
               if ($$0.fU()) {
                  $$2.z();
               } else {
                  $$2.y();
               }

               this.a(eeo.r, $$0);
            }

            return bty.a.b();
         }

         cys $$3 = $$0.b($$1);
         if ($$3.a(cyw.vO) && $$2.p()) {
            if (!this.dV().w_()) {
               $$2.a_($$0, true);
            }

            $$3.h(1);
            return bty.a;
         }
      }

      return bty.e;
   }

   public boolean i(bwa $$0) {
      return $$0.bM() && !this.z($$0);
   }

   public boolean bM() {
      return false;
   }

   public void r() {
      this.i(fdw.c);
      this.h();
      if (this.bZ()) {
         this.dk().j(this);
      }
   }

   public final void j(bwa $$0) {
      if (this.y($$0)) {
         this.a($$0, bwa::a_);
      }
   }

   protected void a(bwa $$0, bwa.b $$1) {
      fdw $$2 = this.m($$0);
      fdw $$3 = $$0.l(this);
      $$1.accept($$0, $$2.d - $$3.d, $$2.e - $$3.e, $$2.f - $$3.f);
   }

   public void k(bwa $$0) {
   }

   public fdw l(bwa $$0) {
      return this.ds().b(bwb.b, 0, this.aA);
   }

   public fdw m(bwa $$0) {
      return this.dt().e(this.a($$0, this.ba, 1.0F));
   }

   protected fdw a(bwa $$0, bwd $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static fdw a(bwa $$0, bwa $$1, bwc $$2) {
      int $$3 = $$0.cY().indexOf($$1);
      return $$2.c(bwb.a, $$3, $$0.aA);
   }

   public boolean n(bwa $$0) {
      return this.a($$0, false);
   }

   public boolean bN() {
      return this instanceof bwz;
   }

   public boolean a(bwa $$0, boolean $$1) {
      if ($$0 == this.r) {
         return false;
      } else if (!$$0.bQ()) {
         return false;
      } else if (!this.dV().w_() && !$$0.o.b()) {
         return false;
      } else {
         for (bwa $$2 = $$0; $$2.r != null; $$2 = $$2.r) {
            if ($$2.r == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bZ()) {
               this.bP();
            }

            this.b(bxl.a);
            this.r = $$0;
            this.r.p(this);
            $$0.D().filter($$0x -> $$0x instanceof arp).forEach($$0x -> ap.U.a((arp)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bwa $$0) {
      return !this.cd() && this.J <= 0;
   }

   public void bO() {
      for (int $$0 = this.q.size() - 1; $$0 >= 0; $$0--) {
         ((bwa)this.q.get($$0)).bP();
      }
   }

   public void ae() {
      if (this.r != null) {
         bwa $$0 = this.r;
         this.r = null;
         $$0.q(this);
      }
   }

   public void bP() {
      this.ae();
   }

   protected void p(bwa $$0) {
      if ($$0.dk() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.q.isEmpty()) {
            this.q = ImmutableList.of($$0);
         } else {
            List<bwa> $$1 = Lists.newArrayList(this.q);
            if (!this.dV().C && $$0 instanceof cqs && !(this.cZ() instanceof cqs)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.q = ImmutableList.copyOf($$1);
         }

         this.a(eeo.s, $$0);
      }
   }

   protected void q(bwa $$0) {
      if ($$0.dk() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.q.size() == 1 && this.q.get(0) == $$0) {
            this.q = ImmutableList.of();
         } else {
            this.q = this.q.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(eeo.q, $$0);
      }
   }

   protected boolean r(bwa $$0) {
      return this.q.isEmpty();
   }

   protected boolean bQ() {
      return true;
   }

   public final boolean bR() {
      return this.N_() != null && this.N_().d();
   }

   public final void d(fdw $$0, float $$1, float $$2) {
      bwu $$3 = this.N_();
      if ($$3 != null) {
         $$3.a($$0, $$1, $$2);
      } else {
         this.b($$0);
         this.b($$1, $$2);
      }
   }

   @Nullable
   public bwu N_() {
      return null;
   }

   public void a(float $$0, int $$1) {
      this.r($$0);
   }

   public float bS() {
      return 0.0F;
   }

   public fdw bT() {
      return this.d(this.dN(), this.dL());
   }

   public fdw a(cyo $$0) {
      if (!(this instanceof cqs $$1)) {
         return fdw.c;
      } else {
         boolean $$2 = $$1.fb().a($$0) && !$$1.fa().a($$0);
         bws $$3 = $$2 ? $$1.fx().e() : $$1.fx();
         return this.d(0.0F, this.dL() + (float)($$3 == bws.b ? 80 : -80)).c(0.5);
      }
   }

   public fdv bU() {
      return new fdv(this.dN(), this.dL());
   }

   public fdw bV() {
      return fdw.a(this.bU());
   }

   public void a(drr $$0, iu $$1) {
      if (this.aD()) {
         this.aB();
      } else {
         if (this.as == null || !this.as.a($$0)) {
            this.as = new bxk($$0, $$1.j());
         } else if (!this.as.e()) {
            this.as.a($$1.j());
            this.as.a(true);
         }
      }
   }

   protected void bW() {
      if (this.dV() instanceof aro $$0) {
         this.M();
         if (this.as != null) {
            if (this.as.a($$0, this, this.n(false))) {
               bqj $$2 = bqi.a();
               $$2.a("portal");
               this.aB();
               ewv $$3 = this.as.a($$0, this);
               if ($$3 != null) {
                  aro $$4 = $$3.b();
                  if ($$0.p().a((dip)$$4) && ($$4.aj() == $$0.aj() || this.a($$0, $$4))) {
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
      bwa $$0 = this.cZ();
      return $$0 instanceof arp ? $$0.bX() : 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
   }

   public void c(bup $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dpr.a(this);
      }
   }

   public void q(float $$0) {
   }

   public boolean bY() {
      boolean $$0 = this.dV() != null && this.dV().C;
      return !this.bi() && (this.aG > 0 || $$0 && this.i(0));
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
      return this.c(bxl.f);
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
      return this.c(bxl.d);
   }

   public boolean cm() {
      return this.cl() && !this.bj();
   }

   public void i(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cn() {
      return this.aW;
   }

   public final void j(boolean $$0) {
      this.aW = $$0;
      this.b(6, this.co());
   }

   public boolean co() {
      return this.dV().w_() ? this.i(6) : this.aW;
   }

   public boolean cp() {
      return this.i(5);
   }

   public boolean d(cqs $$0) {
      if ($$0.U_()) {
         return false;
      } else {
         ffd $$1 = this.cr();
         return $$1 != null && $$0 != null && $$0.cr() == $$1 && $$1.i() ? false : this.cp();
      }
   }

   public boolean cq() {
      return false;
   }

   public void a(BiConsumer<eel<?>, aro> $$0) {
   }

   @Nullable
   public few cr() {
      return this.dV().R().e(this.cI());
   }

   public final boolean s(@Nullable bwa $$0) {
      return $$0 == null ? false : this == $$0 || this.t($$0) || $$0.t(this);
   }

   protected boolean t(bwa $$0) {
      return this.a($$0.cr());
   }

   public boolean a(@Nullable ffd $$0) {
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
      return this.al.a(aM);
   }

   public void j(int $$0) {
      this.al.a(aM, $$0);
   }

   public int cu() {
      return this.al.a(aR);
   }

   public void k(int $$0) {
      this.al.a(aR, $$0);
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

   public void a(aro $$0, bwy $$1) {
      this.h(this.aG + 1);
      if (this.aG == 0) {
         this.e(8.0F);
      }

      this.a($$0, this.dW().c(), 5.0F);
   }

   public void a(boolean $$0, iu $$1) {
      a(this, $$0, $$1);
   }

   protected static void a(bwa $$0, boolean $$1, iu $$2) {
      fdw $$3 = $$0.dy();
      double $$4;
      if ($$1) {
         $$4 = Math.max(-0.9, $$3.e - 0.03);
      } else {
         $$4 = Math.min(1.8, $$3.e + 0.1);
      }

      $$0.n($$3.d, $$4, $$3.f);
      a($$0.s, $$2);
   }

   protected static void a(dip $$0, iu $$1) {
      if ($$0 instanceof aro $$2) {
         for (int $$3 = 0; $$3 < 2; $$3++) {
            $$2.a(lx.ap, (double)$$1.u() + $$0.A.j(), (double)($$1.v() + 1), (double)$$1.w() + $$0.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            $$2.a(lx.d, (double)$$1.u() + $$0.A.j(), (double)($$1.v() + 1), (double)$$1.w() + $$0.A.j(), 1, 0.0, 0.01, 0.0, 0.2);
         }
      }
   }

   public void l(boolean $$0) {
      b(this, $$0);
   }

   protected static void b(bwa $$0, boolean $$1) {
      fdw $$2 = $$0.dy();
      double $$3;
      if ($$1) {
         $$3 = Math.max(-0.3, $$2.e - 0.03);
      } else {
         $$3 = Math.min(0.7, $$2.e + 0.06);
      }

      $$0.n($$2.d, $$3, $$2.f);
      $$0.k();
   }

   public boolean a(aro $$0, bwz $$1) {
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
      fdw $$4 = new fdw($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
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
      fdw $$13 = this.dy().c(0.75);
      if ($$6.o() == ja.a.a) {
         this.n((double)($$12 * $$11), $$13.e, $$13.f);
      } else if ($$6.o() == ja.a.b) {
         this.n($$13.d, (double)($$12 * $$11), $$13.f);
      } else if ($$6.o() == ja.a.c) {
         this.n($$13.d, $$13.e, (double)($$12 * $$11));
      }
   }

   public void a(dzo $$0, fdw $$1) {
      this.k();
      this.U = $$1;
   }

   private static ww a(ww $$0) {
      xk $$1 = $$0.e().b($$0.a().a(null));

      for (ww $$2 : $$0.c()) {
         $$1.b(a($$2));
      }

      return $$1;
   }

   @Override
   public ww al() {
      ww $$0 = this.an();
      return $$0 != null ? a($$0) : this.cz();
   }

   protected ww cz() {
      return this.o.h();
   }

   public boolean u(bwa $$0) {
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

   public boolean v(bwa $$0) {
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

   protected final boolean d(bup $$0) {
      return this.dQ() || this.aV && !$$0.a(axb.d) && !$$0.h() || $$0.a(axb.i) && this.bi() || $$0.a(axb.m) && this.aq().a(axd.o);
   }

   public boolean cC() {
      return this.aV;
   }

   public void m(boolean $$0) {
      this.aV = $$0;
   }

   public void w(bwa $$0) {
      this.b($$0.dA(), $$0.dC(), $$0.dG(), $$0.dL(), $$0.dN());
   }

   public void x(bwa $$0) {
      tx $$1 = $$0.f(new tx());
      $$1.r("Dimension");
      this.g($$1);
      this.aU = $$0.aU;
      this.as = $$0.as;
   }

   @Nullable
   public bwa b(ewv $$0) {
      if (this.dV() instanceof aro $$1 && !this.dQ()) {
         aro $$3 = $$0.b();
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

   private bwa a(aro $$0, ewv $$1) {
      for (bwa $$2 : this.cY()) {
         $$2.b(this.a($$1, $$2));
      }

      bqj $$3 = bqi.a();
      $$3.a("teleportSameDimension");
      this.a(bxm.a($$1), $$1.i());
      if (!$$1.h()) {
         this.a($$1);
      }

      $$1.j().onTransition(this);
      $$3.c();
      return this;
   }

   private bwa b(aro $$0, ewv $$1) {
      List<bwa> $$2 = this.cY();
      List<bwa> $$3 = new ArrayList<>($$2.size());
      this.bO();

      for (bwa $$4 : $$2) {
         bwa $$5 = $$4.b(this.a($$1, $$4));
         if ($$5 != null) {
            $$3.add($$5);
         }
      }

      bqj $$6 = bqi.a();
      $$6.a("teleportCrossDimension");
      bwa $$7 = this.aq().a($$0, bwi.s);
      if ($$7 == null) {
         $$6.c();
         return null;
      } else {
         $$7.x(this);
         this.cD();
         $$7.a(bxm.a($$1), $$1.i());
         $$0.d($$7);

         for (bwa $$8 : $$3) {
            $$8.a($$7, true);
         }

         $$0.i();
         $$1.j().onTransition($$7);
         $$6.c();
         return $$7;
      }
   }

   private ewv a(ewv $$0, bwa $$1) {
      float $$2 = $$0.e() + ($$0.i().contains(bxn.d) ? 0.0F : $$1.dL() - this.dL());
      float $$3 = $$0.f() + ($$0.i().contains(bxn.e) ? 0.0F : $$1.dN() - this.dN());
      fdw $$4 = $$1.dt().d(this.dt());
      fdw $$5 = $$0.c().b($$0.i().contains(bxn.a) ? 0.0 : $$4.a(), $$0.i().contains(bxn.b) ? 0.0 : $$4.b(), $$0.i().contains(bxn.c) ? 0.0 : $$4.c());
      return $$0.a($$5).a($$2, $$3).a();
   }

   private void a(ewv $$0) {
      bwa $$1 = this.cW();

      for (bwa $$2 : this.dc()) {
         if ($$2 instanceof arp) {
            arp $$3 = (arp)$$2;
            if ($$1 != null && $$3.ar() == $$1.ar()) {
               $$3.f.b(aga.a(this.ar(), bxm.a($$0), $$0.i(), this.aD));
            } else {
               $$3.f.b(aga.a(this.ar(), bxm.a(this), Set.of(), this.aD));
            }
         }
      }
   }

   public void a(bxm $$0, Set<bxn> $$1) {
      bxm $$2 = bxm.a(this);
      bxm $$3 = bxm.a($$2, $$0, $$1);
      this.o($$3.a().d, $$3.a().e, $$3.a().f);
      this.w($$3.c());
      this.r($$3.c());
      this.x($$3.d());
      this.ay();
      this.by();
      this.i($$3.b());
      this.bh.clear();
   }

   public void a(float $$0, float $$1) {
      this.w($$0);
      this.r($$0);
      this.x($$1);
      this.bA();
   }

   public void f(iu $$0) {
      if (this.dV() instanceof aro $$1) {
         $$1.m().a(arv.g, new dhw($$0), 3);
      }
   }

   protected void cD() {
      this.c(bwa.e.e);
      if (this instanceof bwx $$0) {
         $$0.z();
      }
   }

   public fdw a(ja.a $$0, l.a $$1) {
      return ewu.a($$1, $$0, this.dt(), this.a(this.aw()));
   }

   public boolean n(boolean $$0) {
      return ($$0 || !this.bZ()) && this.bK();
   }

   public boolean a(dip $$0, dip $$1) {
      if ($$0.aj() == dip.k && $$1.aj() == dip.i) {
         for (bwa $$2 : this.cY()) {
            if ($$2 instanceof arp $$3 && !$$3.i) {
               return false;
            }
         }
      }

      return true;
   }

   public float a(dii $$0, dhv $$1, iu $$2, dzo $$3, evv $$4, float $$5) {
      return $$5;
   }

   public boolean a(dii $$0, dhv $$1, iu $$2, dzo $$3, float $$4) {
      return true;
   }

   public int cE() {
      return 3;
   }

   public boolean g_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bwj.a(this.aq()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.p);
      $$0.a("Entity Name", () -> this.al().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dA(), this.dC(), this.dG()));
      $$0.a("Entity's Block location", p.a(this.dV(), azk.a(this.dA()), azk.a(this.dC()), azk.a(this.dG())));
      fdw $$1 = this.dy();
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
   public ww m_() {
      return few.a(this.cr(), this.al()).a($$0 -> $$0.a(this.cQ()).a(this.cH()));
   }

   public void b(@Nullable ww $$0) {
      this.al.a(aN, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public ww an() {
      return this.al.a(aN).orElse(null);
   }

   @Override
   public boolean h_() {
      return this.al.a(aN).isPresent();
   }

   public void o(boolean $$0) {
      this.al.a(aO, $$0);
   }

   public boolean cL() {
      return this.al.a(aO);
   }

   public boolean a(aro $$0, double $$1, double $$2, double $$3, Set<bxn> $$4, float $$5, float $$6, boolean $$7) {
      bwa $$8 = this.b(new ewv($$0, new fdw($$1, $$2, $$3), fdw.c, $$5, $$6, $$4, ewv.a));
      return $$8 != null;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dV() instanceof aro) {
         this.b($$0, $$1, $$2, this.dL(), this.dN());
         this.v();
      }
   }

   private void v() {
      this.da().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.q.iterator();

         while (var1.hasNext()) {
            bwa $$1 = (bwa)var1.next();
            $$0.a($$1, bwa::e);
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
   public void a(List<akl.c<?>> $$0) {
   }

   @Override
   public void a(akh<?> $$0) {
      if (aq.equals($$0)) {
         this.i_();
      }
   }

   @Deprecated
   protected void cN() {
      bxl $$0 = this.aw();
      bwd $$1 = this.a($$0);
      this.ba = $$1;
      this.bb = $$1.c();
   }

   public void i_() {
      bwd $$0 = this.ba;
      bxl $$1 = this.aw();
      bwd $$2 = this.a($$1);
      this.ba = $$2;
      this.bb = $$2.c();
      this.ay();
      boolean $$3 = $$2.a() <= 4.0F && $$2.b() <= 4.0F;
      if (!this.s.C && !this.ak && !this.ad && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cqs)) {
         this.a($$0);
      }
   }

   public boolean a(bwd $$0) {
      bwd $$1 = this.a(this.aw());
      fdw $$2 = this.dt().b(0.0, (double)$$0.b() / 2.0, 0.0);
      double $$3 = (double)Math.max(0.0F, $$1.a() - $$0.a()) + 1.0E-6;
      double $$4 = (double)Math.max(0.0F, $$1.b() - $$0.b()) + 1.0E-6;
      feq $$5 = fen.a(fdr.a($$2, $$3, $$4, $$3));
      Optional<fdw> $$6 = this.s.a(this, $$5, $$2, (double)$$1.a(), (double)$$1.b(), (double)$$1.a());
      if ($$6.isPresent()) {
         this.b($$6.get().b(0.0, (double)(-$$1.b()) / 2.0, 0.0));
         return true;
      } else {
         if ($$1.a() > $$0.a() && $$1.b() > $$0.b()) {
            feq $$7 = fen.a(fdr.a($$2, $$3, 1.0E-6, $$3));
            Optional<fdw> $$8 = this.s.a(this, $$7, $$2, (double)$$1.a(), (double)$$0.b(), (double)$$1.a());
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

   protected xc cQ() {
      return new xc.c(new xc.b(this.aq(), this.cG(), this.al()));
   }

   public boolean a(arp $$0) {
      return true;
   }

   @Override
   public final fdr cR() {
      return this.aC;
   }

   public final void a(fdr $$0) {
      this.aC = $$0;
   }

   public final float d(bxl $$0) {
      return this.a($$0).c();
   }

   public final float cS() {
      return this.bb;
   }

   public fdw t(float $$0) {
      return this.cT();
   }

   protected fdw cT() {
      return new fdw(0.0, (double)this.cS(), (double)(this.dq() * 0.4F));
   }

   public bxq a_(int $$0) {
      return bxq.a;
   }

   public dip cU() {
      return this.dV();
   }

   @Nullable
   public MinecraftServer cV() {
      return this.dV().p();
   }

   public bty a(cqs $$0, fdw $$1, btx $$2) {
      return bty.e;
   }

   public boolean a(dii $$0) {
      return false;
   }

   public void d(arp $$0) {
   }

   public void e(arp $$0) {
   }

   public float a(dsm $$0) {
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

   public float a(dqv $$0) {
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

   public crn a(crm $$0) {
      return this.aq().a(axd.r) ? crn.b : crn.a;
   }

   @Nullable
   public bwz cW() {
      return null;
   }

   public final boolean cX() {
      return this.cW() != null;
   }

   public final List<bwa> cY() {
      return this.q;
   }

   @Nullable
   public bwa cZ() {
      return this.q.isEmpty() ? null : (bwa)this.q.get(0);
   }

   public boolean y(bwa $$0) {
      return this.q.contains($$0);
   }

   public boolean a(Predicate<bwa> $$0) {
      UnmodifiableIterator var2 = this.q.iterator();

      while (var2.hasNext()) {
         bwa $$1 = (bwa)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bwa> D() {
      return this.q.stream().flatMap(bwa::da);
   }

   @Override
   public Stream<bwa> da() {
      return Stream.concat(Stream.of(this), this.D());
   }

   @Override
   public Stream<bwa> db() {
      return Stream.concat(this.q.stream().flatMap(bwa::db), Stream.of(this));
   }

   public Iterable<bwa> dc() {
      return () -> this.D().iterator();
   }

   public int dd() {
      return (int)this.D().filter($$0 -> $$0 instanceof cqs).count();
   }

   public boolean de() {
      return this.dd() == 1;
   }

   public bwa df() {
      bwa $$0 = this;

      while ($$0.bZ()) {
         $$0 = $$0.dk();
      }

      return $$0;
   }

   public boolean z(bwa $$0) {
      return this.df() == $$0.df();
   }

   public boolean A(bwa $$0) {
      if (!$$0.bZ()) {
         return false;
      } else {
         bwa $$1 = $$0.dk();
         return $$1 == this ? true : this.A($$1);
      }
   }

   public final boolean dg() {
      return this.s.w_() ? this.dh() : !this.L_();
   }

   protected boolean dh() {
      bwz $$0 = this.cW();
      return $$0 != null && $$0.dh();
   }

   public boolean L_() {
      bwz $$0 = this.cW();
      return $$0 != null && $$0.L_();
   }

   public boolean di() {
      return this.dg();
   }

   public boolean dj() {
      return this.dg();
   }

   protected static fdw a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -azk.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = azk.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new fdw((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public fdw b(bwz $$0) {
      return new fdw(this.dA(), this.cR().e, this.dG());
   }

   @Nullable
   public bwa dk() {
      return this.r;
   }

   @Nullable
   public bwa dl() {
      return this.r != null && this.r.cW() == this ? this.r : null;
   }

   public ewa j_() {
      return ewa.a;
   }

   public awm dm() {
      return awm.g;
   }

   protected int dn() {
      return 1;
   }

   public ei d(aro $$0) {
      return new ei(eh.a, this.dt(), this.bU(), $$0, 0, this.al().getString(), this.m_(), $$0.p(), this);
   }

   public void a(eu.a $$0, fdw $$1) {
      fdw $$2 = $$0.a(this);
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

   public boolean a(axp<evu> $$0, double $$1) {
      if (this.do()) {
         return false;
      } else {
         fdr $$2 = this.cR().h(0.001);
         int $$3 = azk.a($$2.a);
         int $$4 = azk.c($$2.d);
         int $$5 = azk.a($$2.b);
         int $$6 = azk.c($$2.e);
         int $$7 = azk.a($$2.c);
         int $$8 = azk.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cJ();
         boolean $$11 = false;
         fdw $$12 = fdw.c;
         int $$13 = 0;
         iu.a $$14 = new iu.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  evv $$18 = this.dV().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a(this.dV(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           fdw $$20 = $$18.c(this.dV(), $$14);
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

            if (!(this instanceof cqs)) {
               $$12 = $$12.d();
            }

            fdw $$21 = this.dy();
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
      fdr $$0 = this.cR().g(1.0);
      int $$1 = azk.a($$0.a);
      int $$2 = azk.c($$0.d);
      int $$3 = azk.a($$0.c);
      int $$4 = azk.c($$0.f);
      return !this.dV().b($$1, $$3, $$2, $$4);
   }

   public double b(axp<evu> $$0) {
      return this.ah.getDouble($$0);
   }

   public double dp() {
      return (double)this.cS() < 0.4 ? 0.0 : 0.4;
   }

   public final float dq() {
      return this.ba.a();
   }

   public final float dr() {
      return this.ba.b();
   }

   public zd<abs> a(arm $$0) {
      return new abt(this, $$0);
   }

   public bwd a(bxl $$0) {
      return this.o.n();
   }

   public final bwc ds() {
      return this.ba.d();
   }

   public fdw dt() {
      return this.t;
   }

   public fdw du() {
      return this.dt();
   }

   @Override
   public iu dv() {
      return this.u;
   }

   public dzo dw() {
      if (this.bg == null) {
         this.bg = this.dV().a_(this.dv());
      }

      return this.bg;
   }

   public dhw dx() {
      return this.ay;
   }

   public fdw dy() {
      return this.az;
   }

   public void i(fdw $$0) {
      this.az = $$0;
   }

   public void j(fdw $$0) {
      this.i(this.dy().e($$0));
   }

   public void n(double $$0, double $$1, double $$2) {
      this.i(new fdw($$0, $$1, $$2));
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
      return this.t.e + (double)this.bb;
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
         this.t = new fdw($$0, $$1, $$2);
         int $$3 = azk.a($$0);
         int $$4 = azk.a($$1);
         int $$5 = azk.a($$2);
         if ($$3 != this.u.u() || $$4 != this.u.v() || $$5 != this.u.w()) {
            this.u = new iu($$3, $$4, $$5);
            this.bg = null;
            if (jx.a($$3) != this.ay.h || jx.a($$5) != this.ay.i) {
               this.ay = new dhw(this.u);
            }
         }

         this.aS.a();
      }
   }

   public void dH() {
   }

   public fdw v(float $$0) {
      return this.p($$0).b(0.0, (double)this.bb * 0.7, 0.0);
   }

   public void a(abt $$0) {
      int $$1 = $$0.b();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      double $$4 = $$0.i();
      this.f($$2, $$3, $$4);
      this.b($$2, $$3, $$4, $$0.n(), $$0.m());
      this.e($$1);
      this.a_($$0.e());
      fdw $$5 = new fdw($$0.j(), $$0.k(), $$0.l());
      this.i($$5);
   }

   @Nullable
   public cys dI() {
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

   public void b_(@Nullable bwa $$0) {
   }

   @Override
   public final boolean dQ() {
      return this.aE != null;
   }

   @Nullable
   public bwa.e dR() {
      return this.aE;
   }

   @Override
   public final void c(bwa.e $$0) {
      if (this.aE == null) {
         this.aE = $$0;
      }

      if (this.aE.a()) {
         this.bP();
      }

      this.cY().forEach(bwa::bP);
      this.aS.a($$0);
      this.b($$0);
   }

   protected void dS() {
      this.aE = null;
   }

   @Override
   public void a(edu $$0) {
      this.aS = $$0;
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

   public boolean c(aro $$0, iu $$1) {
      return true;
   }

   public dip dV() {
      return this.s;
   }

   protected void a(dip $$0) {
      this.s = $$0;
   }

   public buq dW() {
      return this.dV().al();
   }

   public js dX() {
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

   public azt dY() {
      return this.ae;
   }

   public fdw ah() {
      if (this.cW() instanceof cqs $$0 && this.bK()) {
         return $$0.ah();
      }

      return this.dy();
   }

   @Nullable
   public cys dZ() {
      return null;
   }

   public Optional<ald<eys>> ea() {
      return this.o.j();
   }

   protected void a(ke $$0) {
      this.a($$0, kj.g);
   }

   public final void c(cys $$0) {
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

   static class a implements bwa.f {
      boolean a = false;
      boolean b = false;

      public void a(boolean $$0) {
         this.a = $$0;
         this.b = false;
      }

      @Override
      public void a(dzo $$0, boolean $$1, boolean $$2) {
         boolean $$3 = $$1 && $$0.a(dlw.rt);
         boolean $$4 = $$1 && $$0.a(axa.aN);
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
      void accept(bwa var1, double var2, double var4, double var6);
   }

   static record c(fdw a, fdw b) {
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
      void a(dzo var1, boolean var2, boolean var3);
   }
}
