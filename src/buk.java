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
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
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

public abstract class buk implements aka, bsm, eba, fce {
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
   private static final fav d = new fav(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double k = 0.014;
   private static final double l = 0.007;
   private static final double m = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double n = 1.0;
   private final bur<?> o;
   private int p = c.incrementAndGet();
   public boolean I;
   private ImmutableList<buk> q = ImmutableList.of();
   protected int J;
   @Nullable
   private buk r;
   private dgi s;
   public double K;
   public double L;
   public double M;
   private fba t;
   private ji u;
   private dfo ay;
   private fba az = fba.c;
   private float aA;
   private float aB;
   public float N;
   public float O;
   private fav aC = d;
   private boolean aD;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected fba U = fba.c;
   @Nullable
   private buk.d aE;
   public static final float V = 0.6F;
   public static final float W = 1.8F;
   public float X;
   public float Y;
   public float Z;
   private float aF = 1.0F;
   public double aa;
   public double ab;
   public double ac;
   public boolean ad;
   private boolean aG;
   protected final azh ae = azh.a();
   public int af;
   private int aH = -this.do();
   protected boolean ag;
   protected Object2DoubleMap<axf<esy>> ah = new Object2DoubleArrayMap(2);
   protected boolean ai;
   private final Set<axf<esy>> aI = new HashSet<>();
   public int aj;
   protected boolean ak = true;
   protected final akb al;
   protected static final ajx<Byte> am = akb.a(buk.class, ajz.a);
   protected static final int an = 0;
   private static final int aJ = 1;
   private static final int aK = 3;
   private static final int aL = 4;
   private static final int aM = 5;
   protected static final int ao = 6;
   protected static final int ap = 7;
   private static final ajx<Integer> aN = akb.a(buk.class, ajz.b);
   private static final ajx<Optional<wo>> aO = akb.a(buk.class, ajz.g);
   private static final ajx<Boolean> aP = akb.a(buk.class, ajz.k);
   private static final ajx<Boolean> aQ = akb.a(buk.class, ajz.k);
   private static final ajx<Boolean> aR = akb.a(buk.class, ajz.k);
   protected static final ajx<bvs> aq = akb.a(buk.class, ajz.w);
   private static final ajx<Integer> aS = akb.a(buk.class, ajz.b);
   private ebb aT = ebb.a;
   private final aih aU = new aih();
   public boolean ar;
   @Nullable
   public bvr as;
   private int aV;
   private boolean aW;
   protected UUID at = ayz.a(this.ae);
   protected String au = this.at.toString();
   private boolean aX;
   private final Set<String> aY = Sets.newHashSet();
   private final double[] aZ = new double[]{0.0, 0.0, 0.0};
   private long ba;
   private bun bb;
   private float bc;
   public boolean av;
   public boolean aw;
   public Optional<ji> ax = Optional.empty();
   private boolean bd = false;
   private float be;
   private int bf;
   private boolean bg;
   @Nullable
   private dwx bh = null;
   private final List<buk.b> bi = new ArrayList<>();
   private final Set<dwx> bj = new ReferenceArraySet();
   private final LongSet bk = new LongOpenHashSet();

   public buk(bur<?> $$0, dgi $$1) {
      this.o = $$0;
      this.s = $$1;
      this.bb = $$0.n();
      this.t = fba.c;
      this.u = ji.c;
      this.ay = dfo.e;
      akb.a $$2 = new akb.a(this);
      $$2.a(am, (byte)0);
      $$2.a(aN, this.cs());
      $$2.a(aP, false);
      $$2.a(aO, Optional.empty());
      $$2.a(aQ, false);
      $$2.a(aR, false);
      $$2.a(aq, bvs.a);
      $$2.a(aS, 0);
      this.a($$2);
      this.al = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.bc = this.bb.c();
   }

   public boolean a(ji $$0, dwx $$1) {
      fbu $$2 = $$1.b(this.dW(), $$0, fbf.a(this));
      fbu $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return fbr.c($$3, fbr.a(this.cR()), fbe.i);
   }

   public int k_() {
      fch $$0 = this.cr();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean Z_() {
      return false;
   }

   public final void ao() {
      if (this.ca()) {
         this.bP();
      }

      if (this.bZ()) {
         this.ae();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.aU.e(new fba($$0, $$1, $$2));
   }

   public aih ap() {
      return this.aU;
   }

   public bur<?> aq() {
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

   public void c(arc $$0) {
      this.a(buk.d.a);
      this.a(ebt.p);
   }

   public final void at() {
      this.a(buk.d.b);
   }

   protected abstract void a(akb.a var1);

   public akb au() {
      return this.al;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof buk ? ((buk)$$0).p == this.p : false;
   }

   @Override
   public int hashCode() {
      return this.p;
   }

   public void a(buk.d $$0) {
      this.c($$0);
   }

   public void av() {
   }

   public void b(buk.d $$0) {
   }

   public void b(bvs $$0) {
      this.al.a(aq, $$0);
   }

   public bvs aw() {
      return this.al.a(aq);
   }

   public boolean c(bvs $$0) {
      return this.aw() == $$0;
   }

   public boolean a(buk $$0, double $$1) {
      return this.du().a((kb)$$0.du(), $$1);
   }

   public boolean a(buk $$0, double $$1, double $$2) {
      double $$3 = $$0.dB() - this.dB();
      double $$4 = $$0.dD() - this.dD();
      double $$5 = $$0.dH() - this.dH();
      return ayz.e($$3, $$5) < ayz.k($$1) && ayz.k($$4) < ayz.k($$2);
   }

   protected void b(float $$0, float $$1) {
      this.v($$0 % 360.0F);
      this.w($$1 % 360.0F);
   }

   public final void b(fba $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      this.a(this.ax());
   }

   protected fav ax() {
      return this.a(this.t);
   }

   private fav a(fba $$0) {
      return this.bb.a($$0);
   }

   protected void ay() {
      this.a_(this.t.d, this.t.e, this.t.f);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.w(this.dO() + $$2);
      this.v(this.dM() + $$3);
      this.w(ayz.a(this.dO(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = ayz.a(this.O, -90.0F, 90.0F);
      if (this.r != null) {
         this.r.k(this);
      }
   }

   public void h() {
      this.az();
   }

   public void az() {
      bos $$0 = bor.a();
      $$0.a("entityBaseTick");
      this.bh = null;
      if (this.bZ() && this.dl().dR()) {
         this.ae();
      }

      if (this.J > 0) {
         this.J--;
      }

      this.bW();
      if (this.bv()) {
         this.bw();
      }

      this.aw = this.av;
      this.av = false;
      this.bq();
      this.D();
      this.bp();
      if (this.dW() instanceof arc $$1) {
         if (this.aH > 0) {
            if (this.bi()) {
               this.h(this.aH - 4);
               if (this.aH < 0) {
                  this.aH();
               }
            } else {
               if (this.aH % 20 == 0 && !this.bx()) {
                  this.a($$1, this.dX().d(), 1.0F);
               }

               this.h(this.aH - 1);
            }

            if (this.cu() > 0) {
               this.k(0);
               this.dW().a(null, 1009, this.u, 1);
            }
         }
      } else {
         this.aH();
      }

      if (this.bx()) {
         this.aE();
         this.Z *= 0.5F;
      }

      this.aA();
      if (!this.dW().C) {
         this.c(this.aH > 0);
      }

      this.ak = false;
      if (this.dW() instanceof arc $$2 && this instanceof bve) {
         bve.a_($$2, (buk)((bve)this));
      }

      $$0.c();
   }

   public void c(boolean $$0) {
      this.b(0, $$0 || this.bg);
   }

   public void aA() {
      if (this.dD() < (double)(this.dW().L_() - 64)) {
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
         this.d(15.0F);
         if (this.dW() instanceof arc $$0 && this.a($$0, this.dX().e(), 4.0F) && this.aF() && !this.bb()) {
            $$0.a(null, this.dB(), this.dD(), this.dH(), awa.kA, this.dn(), 0.4F, 2.0F + this.ae.i() * 0.4F);
         }
      }
   }

   protected boolean aF() {
      return true;
   }

   public final void d(float $$0) {
      this.g(ayz.d($$0 * 20.0F));
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

   private boolean b(fav $$0) {
      return this.dW().a(this, $$0) && !this.dW().d($$0);
   }

   public void d(boolean $$0) {
      this.aD = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, fba $$1) {
      this.a($$0, this.P, $$1);
   }

   public void a(boolean $$0, boolean $$1, fba $$2) {
      this.aD = $$0;
      this.P = $$1;
      this.b($$0, $$2);
   }

   public boolean d(ji $$0) {
      return this.ax.isPresent() && this.ax.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable fba $$1) {
      if ($$0) {
         fav $$2 = this.cR();
         fav $$3 = new fav($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<ji> $$4 = this.s.h(this, $$3);
         if ($$4.isPresent() || this.bd) {
            this.ax = $$4;
         } else if ($$1 != null) {
            fav $$5 = $$3.d(-$$1.d, 0.0, -$$1.f);
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

   public void a(bvk $$0, fba $$1) {
      if (this.ad) {
         this.a_(this.dB() + $$1.d, this.dD() + $$1.e, this.dH() + $$1.f);
      } else {
         this.aG = this.bY();
         if ($$0 == bvk.c) {
            $$1 = this.d($$1);
            if ($$1.equals(fba.c)) {
               return;
            }
         }

         bos $$2 = bor.a();
         $$2.a("move");
         if (this.U.h() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = fba.c;
            this.h(fba.c);
         }

         $$1 = this.a($$1, $$0);
         fba $$3 = this.j($$1);
         double $$4 = $$3.h();
         if ($$4 > 1.0E-7 || $$1.h() - $$4 < 1.0E-7) {
            if (this.Z != 0.0F && $$4 >= 1.0) {
               faw $$5 = this.dW().a(new dfq(this.du(), this.du().e($$3), dfq.a.d, dfq.b.d, this));
               if ($$5.d() != fay.a.a) {
                  this.k();
               }
            }

            this.a_(this.dB() + $$3.d, this.dD() + $$3.e, this.dH() + $$3.f);
         }

         $$2.c();
         $$2.a("rest");
         boolean $$6 = !ayz.b($$1.d, $$3.d);
         boolean $$7 = !ayz.b($$1.f, $$3.f);
         this.P = $$6 || $$7;
         if (Math.abs($$1.e) > 0.0 || this.dh()) {
            this.Q = $$1.e != $$3.e;
            this.R = this.Q && $$1.e < 0.0;
            this.a(this.R, this.P, $$3);
         }

         if (this.P) {
            this.S = this.c($$3);
         } else {
            this.S = false;
         }

         ji $$8 = this.aP();
         dwx $$9 = this.dW().a_($$8);
         if (!this.dW().B_() || this.di()) {
            this.a($$3.e, this.aJ(), $$9, $$8);
         }

         if (this.dR()) {
            $$2.c();
         } else {
            if (this.P) {
               fba $$10 = this.dz();
               this.n($$6 ? 0.0 : $$10.d, $$10.e, $$7 ? 0.0 : $$10.f);
            }

            if (this.di()) {
               djm $$11 = $$9.b();
               if ($$1.e != $$3.e) {
                  $$11.a(this.dW(), this);
               }
            }

            if (!this.dW().B_() || this.di()) {
               buk.c $$12 = this.bg();
               if ($$12.a() && !this.bZ()) {
                  this.a($$12, $$3, $$8, $$9);
               }
            }

            float $$13 = this.aT();
            this.h(this.dz().d((double)$$13, 1.0, (double)$$13));
            $$2.c();
         }
      }
   }

   private void a(buk.c $$0, fba $$1, ji $$2, dwx $$3) {
      float $$4 = 0.6F;
      float $$5 = (float)($$1.g() * 0.6F);
      float $$6 = (float)($$1.i() * 0.6F);
      ji $$7 = this.aR();
      dwx $$8 = this.dW().a_($$7);
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
               this.a(ebt.Q);
            }
         }
      } else if ($$8.l()) {
         this.aO();
      }
   }

   public void aK() {
      this.a(this.bC(), this.t);
   }

   public void a(fba $$0, fba $$1) {
      if (this.aL()) {
         if (this.aJ()) {
            ji $$2 = this.aP();
            dwx $$3 = this.dW().a_($$2);
            $$3.b().a(this.dW(), $$2, $$3, this);
         }

         this.bi.add(new buk.b($$0, $$1));
         List<buk.b> $$4 = List.copyOf(this.bi);
         this.bi.clear();
         this.a($$4, this.bj);
         boolean $$5 = Iterables.any(this.bj, $$0x -> $$0x.a(awp.aN) || $$0x.a(djo.K));
         this.bj.clear();
         if (!$$5 && this.bL()) {
            if (this.aH <= 0) {
               this.h(-this.do());
            }

            if (this.aG && (this.av || this.bl())) {
               this.aM();
            }
         }

         if (this.bY() && (this.av || this.bl())) {
            this.h(-this.do());
         }
      }
   }

   protected boolean aL() {
      return !this.dR() && !this.ad;
   }

   private boolean c(dwx $$0) {
      return $$0.a(awp.aS) || $$0.a(djo.rr);
   }

   private boolean a(ji $$0, dwx $$1, boolean $$2, boolean $$3, fba $$4) {
      if ($$1.l()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aJ() || $$5 || this.ci() && $$4.e == 0.0 || this.cq()) && !this.ck()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dW().a(ebt.P, this.du(), ebt.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(fba $$0) {
      return false;
   }

   protected void aM() {
      this.a(awa.kF, 0.7F, 1.6F + (this.ae.i() - this.ae.i()) * 0.4F);
   }

   public void aN() {
      if (!this.dW().C && this.aG) {
         this.aM();
      }

      this.aH();
   }

   protected void aO() {
      if (this.ba()) {
         this.aZ();
         if (this.bg().b()) {
            this.a(ebt.x);
         }
      }
   }

   @Deprecated
   public ji aP() {
      return this.e(0.2F);
   }

   public ji aQ() {
      return this.e(0.500001F);
   }

   public ji aR() {
      return this.e(1.0E-5F);
   }

   protected ji e(float $$0) {
      if (this.ax.isPresent()) {
         ji $$1 = this.ax.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dwx $$2 = this.dW().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(awp.U)) && !$$2.a(awp.N) && !($$2.b() instanceof dmm) ? $$1.h(ayz.a(this.t.e - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = ayz.a(this.t.d);
         int $$4 = ayz.a(this.t.e - (double)$$0);
         int $$5 = ayz.a(this.t.f);
         return new ji($$3, $$4, $$5);
      }
   }

   protected float aS() {
      float $$0 = this.dW().a_(this.dw()).b().k();
      float $$1 = this.dW().a_(this.aQ()).b().k();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aT() {
      dwx $$0 = this.dW().a_(this.dw());
      float $$1 = $$0.b().h();
      if (!$$0.a(djo.J) && !$$0.a(djo.nF)) {
         return (double)$$1 == 1.0 ? this.dW().a_(this.aQ()).b().h() : $$1;
      } else {
         return $$1;
      }
   }

   protected fba a(fba $$0, bvk $$1) {
      return $$0;
   }

   protected fba d(fba $$0) {
      if ($$0.h() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dW().ad();
         if ($$1 != this.ba) {
            Arrays.fill(this.aZ, 0.0);
            this.ba = $$1;
         }

         if ($$0.d != 0.0) {
            double $$2 = this.a(jn.a.a, $$0.d);
            return Math.abs($$2) <= 1.0E-5F ? fba.c : new fba($$2, 0.0, 0.0);
         } else if ($$0.e != 0.0) {
            double $$3 = this.a(jn.a.b, $$0.e);
            return Math.abs($$3) <= 1.0E-5F ? fba.c : new fba(0.0, $$3, 0.0);
         } else if ($$0.f != 0.0) {
            double $$4 = this.a(jn.a.c, $$0.f);
            return Math.abs($$4) <= 1.0E-5F ? fba.c : new fba(0.0, 0.0, $$4);
         } else {
            return fba.c;
         }
      }
   }

   private double a(jn.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = ayz.a($$1 + this.aZ[$$2], -0.51, 0.51);
      $$1 = $$3 - this.aZ[$$2];
      this.aZ[$$2] = $$3;
      return $$1;
   }

   private fba j(fba $$0) {
      fav $$1 = this.cR();
      List<fbu> $$2 = this.dW().c(this, $$1.b($$0));
      fba $$3 = $$0.h() == 0.0 ? $$0 : a(this, $$0, $$1, this.dW(), $$2);
      boolean $$4 = $$0.d != $$3.d;
      boolean $$5 = $$0.e != $$3.e;
      boolean $$6 = $$0.f != $$3.f;
      boolean $$7 = $$5 && $$0.e < 0.0;
      if (this.dQ() > 0.0F && ($$7 || this.aJ()) && ($$4 || $$6)) {
         fav $$8 = $$7 ? $$1.d(0.0, $$3.e, 0.0) : $$1;
         fav $$9 = $$8.b($$0.d, (double)this.dQ(), $$0.f);
         if (!$$7) {
            $$9 = $$9.b(0.0, -1.0E-5F, 0.0);
         }

         List<fbu> $$10 = a(this, this.s, $$2, $$9);
         float $$11 = (float)$$3.e;
         float[] $$12 = a($$8, $$10, this.dQ(), $$11);

         for (float $$13 : $$12) {
            fba $$14 = a(new fba($$0.d, (double)$$13, $$0.f), $$8, $$10);
            if ($$14.j() > $$3.j()) {
               double $$15 = $$1.b - $$8.b;
               return $$14.b(0.0, -$$15, 0.0);
            }
         }
      }

      return $$3;
   }

   private static float[] a(fav $$0, List<fbu> $$1, float $$2, float $$3) {
      FloatSet $$4 = new FloatArraySet(4);

      for (fbu $$5 : $$1) {
         DoubleList $$6 = $$5.a(jn.a.b);
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

   public static fba a(@Nullable buk $$0, fba $$1, fav $$2, dgi $$3, List<fbu> $$4) {
      List<fbu> $$5 = a($$0, $$3, $$4, $$2.b($$1));
      return a($$1, $$2, $$5);
   }

   private static List<fbu> a(@Nullable buk $$0, dgi $$1, List<fbu> $$2, fav $$3) {
      Builder<fbu> $$4 = ImmutableList.builderWithExpectedSize($$2.size() + 1);
      if (!$$2.isEmpty()) {
         $$4.addAll($$2);
      }

      dyn $$5 = $$1.F_();
      boolean $$6 = $$0 != null && $$5.a($$0, $$3);
      if ($$6) {
         $$4.add($$5.c());
      }

      $$4.addAll($$1.e($$0, $$3));
      return $$4.build();
   }

   private static fba a(fba $$0, fav $$1, List<fbu> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.d;
         double $$4 = $$0.e;
         double $$5 = $$0.f;
         if ($$4 != 0.0) {
            $$4 = fbr.a(jn.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = fbr.a(jn.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = fbr.a(jn.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = fbr.a(jn.a.c, $$1, $$2, $$5);
         }

         return new fba($$3, $$4, $$5);
      }
   }

   protected float aU() {
      return (float)((int)this.X + 1);
   }

   protected avz aV() {
      return awa.kJ;
   }

   protected avz aW() {
      return awa.kI;
   }

   protected avz aX() {
      return awa.kI;
   }

   public void b(fba $$0, fba $$1) {
      this.bi.add(new buk.b($$0, $$1));
   }

   private void a(List<buk.b> $$0, Set<dwx> $$1) {
      if (this.aL()) {
         LongSet $$2 = this.bk;

         for (buk.b $$3 : $$0) {
            fba $$4 = $$3.a();
            fba $$5 = $$3.b();
            fav $$6 = this.a($$5).h(1.0E-5F);

            for (ji $$7 : dfn.a($$4, $$5, $$6)) {
               if (!this.bL()) {
                  return;
               }

               dwx $$8 = this.dW().a_($$7);
               if (!$$8.l() && $$2.add($$7.a())) {
                  try {
                     fbu $$9 = $$8.b(this.dW(), $$7);
                     if ($$9 != fbr.b() && !this.a($$4, $$5, $$7, $$9)) {
                        continue;
                     }

                     $$8.a(this.dW(), $$7, this);
                     this.a($$8);
                  } catch (Throwable var16) {
                     o $$11 = o.a(var16, "Colliding entity with block");
                     p $$12 = $$11.a("Block being collided with");
                     p.a($$12, this.dW(), $$7, $$8);
                     p $$13 = $$11.a("Entity being checked for collision");
                     this.a($$13);
                     throw new z($$11);
                  }

                  $$1.add($$8);
               }
            }
         }

         $$2.clear();
      }
   }

   private boolean a(fba $$0, fba $$1, ji $$2, fbu $$3) {
      fav $$4 = this.a($$0);
      fba $$5 = $$1.d($$0);
      return $$4.a($$5, $$3.a(new fba($$2)).e());
   }

   protected void a(dwx $$0) {
   }

   public ji a(arc $$0, ji $$1) {
      ji $$2 = $$0.Z();
      fba $$3 = $$2.b();
      int $$4 = $$0.m($$2).a(ecs.a.f, $$2.u(), $$2.w()) + 1;
      return ji.a($$3.d, (double)$$4, $$3.f);
   }

   public void a(jr<ebt> $$0, @Nullable buk $$1) {
      this.dW().a($$1, $$0, this.t);
   }

   public void a(jr<ebt> $$0) {
      this.a($$0, this);
   }

   private void c(ji $$0, dwx $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.m();
      }
   }

   protected void aY() {
      buk $$0 = Objects.requireNonNullElse(this.cX(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      fba $$2 = $$0.dz();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      this.f($$3);
   }

   protected ji e(ji $$0) {
      ji $$1 = $$0.d();
      dwx $$2 = this.dW().a_($$1);
      return !$$2.a(awp.bp) && !$$2.a(awp.bq) ? $$0 : $$1;
   }

   protected void a(dwx $$0, dwx $$1) {
      dre $$2 = $$0.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dwx $$0) {
      dre $$1 = $$0.A();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(ji $$0, dwx $$1) {
      dre $$2 = $$1.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dwx $$0) {
      return $$0.a(awp.bo) && this.af >= this.bf + 20;
   }

   private void m() {
      this.be = this.be * (float)Math.pow(0.997, (double)(this.af - this.bf));
      this.be = Math.min(1.0F, this.be + 0.07F);
      float $$0 = 0.5F + this.be * this.ae.i() * 1.2F;
      float $$1 = 0.1F + this.be * 1.2F;
      this.a(awa.E, $$1, $$0);
      this.bf = this.af;
   }

   protected void f(float $$0) {
      this.a(this.aV(), $$0, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
   }

   protected void aZ() {
   }

   protected boolean ba() {
      return false;
   }

   public void a(avz $$0, float $$1, float $$2) {
      if (!this.bb()) {
         this.dW().a(null, this.dB(), this.dD(), this.dH(), $$0, this.dn(), $$1, $$2);
      }
   }

   public void a(avz $$0) {
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
         this.h(this.dz().b(0.0, -$$0, 0.0));
      }
   }

   protected buk.c bg() {
      return buk.c.d;
   }

   public boolean bh() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dwx $$2, ji $$3) {
      if ($$1) {
         if (this.Z > 0.0F) {
            $$2.b().a(this.dW(), $$2, $$3, this, this.Z);
            this.dW().a(ebt.A, this.t, ebt.a.a(this, this.ax.<dwx>map($$0x -> this.dW().a_($$0x)).orElse($$2)));
         }

         this.k();
      } else if ($$0 < 0.0) {
         this.Z -= (float)$$0;
      }
   }

   public boolean bi() {
      return this.aq().d();
   }

   public boolean a(float $$0, float $$1, bta $$2) {
      if (this.o.a(awt.o)) {
         return false;
      } else {
         if (this.ca()) {
            for (buk $$3 : this.cZ()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean bj() {
      return this.ag;
   }

   private boolean s() {
      ji $$0 = this.dw();
      return this.dW().r($$0) || this.dW().r(ji.a((double)$$0.u(), this.cR().e, (double)$$0.w()));
   }

   private boolean u() {
      return this.dx().a(djo.nF);
   }

   public boolean bk() {
      return this.bj() || this.s();
   }

   public boolean bl() {
      return this.bj() || this.s() || this.u();
   }

   public boolean bm() {
      return this.bj() || this.u();
   }

   public boolean bn() {
      return this.bm() || this.bx();
   }

   public boolean bo() {
      return this.ai && this.bj();
   }

   public void bp() {
      if (this.ck()) {
         this.i(this.cj() && this.bj() && !this.bZ());
      } else {
         this.i(this.cj() && this.bo() && !this.bZ() && this.dW().b_(this.u).a(awv.a));
      }
   }

   protected boolean bq() {
      this.ah.clear();
      this.br();
      double $$0 = this.dW().G_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(awv.b, $$0);
      return this.bj() || $$1;
   }

   void br() {
      if (this.dl() instanceof cqu $$0 && !$$0.bo()) {
         this.ag = false;
         return;
      }

      if (this.a(awv.a, 0.014)) {
         if (!this.ag && !this.ak) {
            this.bs();
         }

         this.k();
         this.ag = true;
         this.aH();
      } else {
         this.ag = false;
      }
   }

   private void D() {
      this.ai = this.a(awv.a);
      this.aI.clear();
      double $$0 = this.dF();
      if (this.dl() instanceof cqu $$2 && !$$2.bo() && $$2.cR().e >= $$0 && $$2.cR().b <= $$0) {
         return;
      }

      ji $$3 = ji.a(this.dB(), $$0, this.dH());
      esz $$4 = this.dW().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a(this.dW(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aI::add);
      }
   }

   protected void bs() {
      buk $$0 = Objects.requireNonNullElse(this.cX(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      fba $$2 = $$0.dz();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aW(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      } else {
         this.a(this.aX(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      }

      float $$4 = (float)ayz.a(this.dD());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bb.a() * 20.0F; $$5++) {
         double $$6 = (this.ae.j() * 2.0 - 1.0) * (double)this.bb.a();
         double $$7 = (this.ae.j() * 2.0 - 1.0) * (double)this.bb.a();
         this.dW().a(lt.d, this.dB() + $$6, (double)($$4 + 1.0F), this.dH() + $$7, $$2.d, $$2.e - this.ae.j() * 0.2F, $$2.f);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bb.a() * 20.0F; $$8++) {
         double $$9 = (this.ae.j() * 2.0 - 1.0) * (double)this.bb.a();
         double $$10 = (this.ae.j() * 2.0 - 1.0) * (double)this.bb.a();
         this.dW().a(lt.ao, this.dB() + $$9, (double)($$4 + 1.0F), this.dH() + $$10, $$2.d, $$2.e, $$2.f);
      }

      this.a(ebt.O);
   }

   @Deprecated
   protected dwx bt() {
      return this.dW().a_(this.aP());
   }

   public dwx bu() {
      return this.dW().a_(this.aR());
   }

   public boolean bv() {
      return this.cj() && !this.bj() && !this.Z_() && !this.ci() && !this.bx() && this.bL();
   }

   protected void bw() {
      ji $$0 = this.aP();
      dwx $$1 = this.dW().a_($$0);
      if ($$1.o() != dpx.a) {
         fba $$2 = this.dz();
         ji $$3 = this.dw();
         double $$4 = this.dB() + (this.ae.j() - 0.5) * (double)this.bb.a();
         double $$5 = this.dH() + (this.ae.j() - 0.5) * (double)this.bb.a();
         if ($$3.u() != $$0.u()) {
            $$4 = ayz.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = ayz.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dW().a(new ll(lt.b, $$1), $$4, this.dD() + 0.1, $$5, $$2.d * -4.0, 1.5, $$2.f * -4.0);
      }
   }

   public boolean a(axf<esy> $$0) {
      return this.aI.contains($$0);
   }

   public boolean bx() {
      return !this.ak && this.ah.getDouble(awv.b) > 0.0;
   }

   public void a(float $$0, fba $$1) {
      fba $$2 = a($$1, $$0, this.dM());
      this.h(this.dz().e($$2));
   }

   protected static fba a(fba $$0, float $$1, float $$2) {
      double $$3 = $$0.h();
      if ($$3 < 1.0E-7) {
         return fba.c;
      } else {
         fba $$4 = ($$3 > 1.0 ? $$0.d() : $$0).c((double)$$1);
         float $$5 = ayz.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = ayz.b($$2 * (float) (Math.PI / 180.0));
         return new fba($$4.d * (double)$$6 - $$4.f * (double)$$5, $$4.e, $$4.f * (double)$$6 + $$4.d * (double)$$5);
      }
   }

   @Deprecated
   public float by() {
      return this.dW().f(this.dA(), this.dG()) ? this.dW().x(ji.a(this.dB(), this.dF(), this.dH())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.c($$3, $$4);
   }

   public void c(float $$0, float $$1) {
      this.v($$0 % 360.0F);
      this.w(ayz.a($$1, -90.0F, 90.0F) % 360.0F);
      this.N = this.dM();
      this.O = this.dO();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = ayz.a($$0, -3.0E7, 3.0E7);
      double $$4 = ayz.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(fba $$0) {
      this.e($$0.d, $$0.e, $$0.f);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dM(), this.dO());
   }

   public void a(ji $$0, float $$1, float $$2) {
      this.b($$0.c(), $$1, $$2);
   }

   public void b(fba $$0, float $$1, float $$2) {
      this.b($$0.d, $$0.e, $$0.f, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.o($$0, $$1, $$2);
      this.v($$3);
      this.w($$4);
      this.bz();
      this.ay();
   }

   public final void bz() {
      this.bA();
      this.bB();
   }

   public final void c(fba $$0, float $$1, float $$2) {
      this.k($$0);
      this.f($$1, $$2);
   }

   protected void bA() {
      this.k(this.t);
   }

   public void bB() {
      this.f(this.dM(), this.dO());
   }

   private void k(fba $$0) {
      this.K = this.aa = $$0.d;
      this.L = this.ab = $$0.e;
      this.M = this.ac = $$0.f;
   }

   private void f(float $$0, float $$1) {
      this.N = $$0;
      this.O = $$1;
   }

   public final fba bC() {
      return new fba(this.aa, this.ab, this.ac);
   }

   public float f(buk $$0) {
      float $$1 = (float)(this.dB() - $$0.dB());
      float $$2 = (float)(this.dD() - $$0.dD());
      float $$3 = (float)(this.dH() - $$0.dH());
      return ayz.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dB() - $$0;
      double $$4 = this.dD() - $$1;
      double $$5 = this.dH() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(buk $$0) {
      return this.f($$0.du());
   }

   public double f(fba $$0) {
      double $$1 = this.dB() - $$0.d;
      double $$2 = this.dD() - $$0.e;
      double $$3 = this.dH() - $$0.f;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void a_(cox $$0) {
   }

   public void h(buk $$0) {
      if (!this.z($$0)) {
         if (!$$0.ad && !this.ad) {
            double $$1 = $$0.dB() - this.dB();
            double $$2 = $$0.dH() - this.dH();
            double $$3 = ayz.a($$1, $$2);
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
               if (!this.ca() && this.bI()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.ca() && $$0.bI()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void g(fba $$0) {
      this.j($$0.d, $$0.e, $$0.f);
   }

   public void j(double $$0, double $$1, double $$2) {
      this.h(this.dz().b($$0, $$1, $$2));
      this.ar = true;
   }

   protected void bD() {
      this.T = true;
   }

   @Deprecated
   public final void a(bta $$0, float $$1) {
      if (this.s instanceof arc $$2) {
         this.a($$2, $$0, $$1);
      }
   }

   @Deprecated
   public final boolean b(bta $$0, float $$1) {
      return this.s instanceof arc $$2 ? this.a($$2, $$0, $$1) : this.b($$0);
   }

   public abstract boolean a(arc var1, bta var2, float var3);

   public boolean b(bta $$0) {
      return false;
   }

   public final fba g(float $$0) {
      return this.d(this.h($$0), this.i($$0));
   }

   public jn bE() {
      return jn.a(this.g(1.0F));
   }

   public float h(float $$0) {
      return this.j($$0);
   }

   public float i(float $$0) {
      return this.k($$0);
   }

   public float j(float $$0) {
      return $$0 == 1.0F ? this.dO() : ayz.h($$0, this.O, this.dO());
   }

   public float k(float $$0) {
      return $$0 == 1.0F ? this.dM() : ayz.i($$0, this.N, this.dM());
   }

   public final fba d(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = ayz.b($$3);
      float $$5 = ayz.a($$3);
      float $$6 = ayz.b($$2);
      float $$7 = ayz.a($$2);
      return new fba((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final fba l(float $$0) {
      return this.e(this.h($$0), this.i($$0));
   }

   protected final fba e(float $$0, float $$1) {
      return this.d($$0 - 90.0F, $$1);
   }

   public final fba bF() {
      return new fba(this.dB(), this.dF(), this.dH());
   }

   public final fba m(float $$0) {
      double $$1 = ayz.d((double)$$0, this.K, this.dB());
      double $$2 = ayz.d((double)$$0, this.L, this.dD()) + (double)this.cS();
      double $$3 = ayz.d((double)$$0, this.M, this.dH());
      return new fba($$1, $$2, $$3);
   }

   public fba n(float $$0) {
      return this.m($$0);
   }

   public final fba o(float $$0) {
      double $$1 = ayz.d((double)$$0, this.K, this.dB());
      double $$2 = ayz.d((double)$$0, this.L, this.dD());
      double $$3 = ayz.d((double)$$0, this.M, this.dH());
      return new fba($$1, $$2, $$3);
   }

   public fay a(double $$0, float $$1, boolean $$2) {
      fba $$3 = this.m($$1);
      fba $$4 = this.g($$1);
      fba $$5 = $$3.b($$4.d * $$0, $$4.e * $$0, $$4.f * $$0);
      return this.dW().a(new dfq($$3, $$5, dfq.a.b, $$2 ? dfq.b.c : dfq.b.a, this));
   }

   public boolean bG() {
      return this.bL() && this.bH();
   }

   public boolean bH() {
      return false;
   }

   public boolean bI() {
      return false;
   }

   public void a(buk $$0, bta $$1) {
      if ($$0 instanceof ard) {
         ap.d.a((ard)$$0, this, $$1);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.dB() - $$0;
      double $$4 = this.dD() - $$1;
      double $$5 = this.dH() - $$2;
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

   public boolean d(tq $$0) {
      if (this.aE != null && !this.aE.b()) {
         return false;
      } else {
         String $$1 = this.bK();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.f($$0);
            return true;
         }
      }
   }

   public boolean e(tq $$0) {
      return this.bZ() ? false : this.d($$0);
   }

   public tq f(tq $$0) {
      try {
         if (this.r != null) {
            $$0.a("Pos", this.a(this.r.dB(), this.dD(), this.r.dH()));
         } else {
            $$0.a("Pos", this.a(this.dB(), this.dD(), this.dH()));
         }

         fba $$1 = this.dz();
         $$0.a("Motion", this.a($$1.d, $$1.e, $$1.f));
         $$0.a("Rotation", this.a(this.dM(), this.dO()));
         $$0.a("FallDistance", this.Z);
         $$0.a("Fire", (short)this.aH);
         $$0.a("Air", (short)this.ct());
         $$0.a("OnGround", this.aJ());
         $$0.a("Invulnerable", this.aW);
         $$0.a("PortalCooldown", this.aV);
         $$0.a("UUID", this.cG());
         wo $$2 = this.an();
         if ($$2 != null) {
            $$0.a("CustomName", wo.a.a($$2, this.dY()));
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

         int $$3 = this.cu();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.cu());
         }

         if (this.bg) {
            $$0.a("HasVisualFire", this.bg);
         }

         if (!this.aY.isEmpty()) {
            tw $$4 = new tw();

            for (String $$5 : this.aY) {
               $$4.add(ul.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.ca()) {
            tw $$6 = new tw();

            for (buk $$7 : this.cZ()) {
               tq $$8 = new tq();
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

   public void g(tq $$0) {
      try {
         tw $$1 = $$0.c("Pos", 6);
         tw $$2 = $$0.c("Motion", 6);
         tw $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.n(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         this.ar = true;
         double $$7 = 3.0000512E7;
         this.o(ayz.a($$1.h(0), -3.0000512E7, 3.0000512E7), ayz.a($$1.h(1), -2.0E7, 2.0E7), ayz.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.v($$3.i(0));
         this.w($$3.i(1));
         this.bz();
         this.q(this.dM());
         this.r(this.dM());
         this.Z = $$0.j("FallDistance");
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

         if (!Double.isFinite(this.dB()) || !Double.isFinite(this.dD()) || !Double.isFinite(this.dH())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dM()) && Double.isFinite((double)this.dO())) {
            this.ay();
            this.b(this.dM(), this.dO());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(wo.a.a($$8, this.dY()));
               } catch (Exception var16) {
                  b.warn("Failed to parse entity custom name {}", $$8, var16);
               }
            }

            this.p($$0.q("CustomNameVisible"));
            this.e($$0.q("Silent"));
            this.f($$0.q("NoGravity"));
            this.j($$0.q("Glowing"));
            this.k($$0.h("TicksFrozen"));
            this.bg = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.aY.clear();
               tw $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.aY.add($$10.j($$12));
               }
            }

            this.a($$0);
            if (this.bJ()) {
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

   protected boolean bJ() {
      return true;
   }

   @Nullable
   protected final String bK() {
      bur<?> $$0 = this.aq();
      aku $$1 = bur.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(tq var1);

   protected abstract void b(tq var1);

   protected tw a(double... $$0) {
      tw $$1 = new tw();

      for (double $$2 : $$0) {
         $$1.add(tr.a($$2));
      }

      return $$1;
   }

   protected tw a(float... $$0) {
      tw $$1 = new tw();

      for (float $$2 : $$0) {
         $$1.add(tt.a($$2));
      }

      return $$1;
   }

   @Nullable
   public clb a(arc $$0, dgh $$1) {
      return this.a($$0, $$1, 0);
   }

   @Nullable
   public clb a(arc $$0, dgh $$1, int $$2) {
      return this.a($$0, new cwp($$1), (float)$$2);
   }

   @Nullable
   public clb a(arc $$0, cwp $$1) {
      return this.a($$0, $$1, 0.0F);
   }

   @Nullable
   public clb a(arc $$0, cwp $$1, float $$2) {
      if ($$1.f()) {
         return null;
      } else {
         clb $$3 = new clb($$0, this.dB(), this.dD() + (double)$$2, this.dH(), $$1);
         $$3.s();
         $$0.b($$3);
         return $$3;
      }
   }

   public boolean bL() {
      return !this.dR();
   }

   public boolean bM() {
      if (this.ad) {
         return false;
      } else {
         float $$0 = this.bb.a() * 0.8F;
         fav $$1 = fav.a(this.bF(), (double)$$0, 1.0E-6, (double)$$0);
         return ji.b($$1)
            .anyMatch(
               $$1x -> {
                  dwx $$2 = this.dW().a_($$1x);
                  return !$$2.l()
                     && $$2.j(this.dW(), $$1x)
                     && fbr.c($$2.g(this.dW(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), fbr.a($$1), fbe.i);
               }
            );
      }
   }

   public bsj a(cox $$0, bsi $$1) {
      if (this.bL() && this instanceof bve $$2) {
         if ($$2.A() == $$0) {
            if (!this.dW().B_()) {
               $$2.a(true, !$$0.fV());
               this.a(ebt.r, $$0);
            }

            return bsj.a;
         }

         cwp $$3 = $$0.b($$1);
         if ($$3.a(cwt.vK) && $$2.Q_()) {
            if (!this.dW().B_()) {
               $$2.b($$0, true);
            }

            $$3.h(1);
            return bsj.a;
         }
      }

      return bsj.e;
   }

   public boolean i(buk $$0) {
      return $$0.bN() && !this.z($$0);
   }

   public boolean bN() {
      return false;
   }

   public void r() {
      this.h(fba.c);
      this.h();
      if (this.bZ()) {
         this.dl().j(this);
      }
   }

   public final void j(buk $$0) {
      if (this.y($$0)) {
         this.a($$0, buk::a_);
      }
   }

   protected void a(buk $$0, buk.a $$1) {
      fba $$2 = this.m($$0);
      fba $$3 = $$0.l(this);
      $$1.accept($$0, $$2.d - $$3.d, $$2.e - $$3.e, $$2.f - $$3.f);
   }

   public void k(buk $$0) {
   }

   public fba l(buk $$0) {
      return this.dt().b(bul.b, 0, this.aA);
   }

   public fba m(buk $$0) {
      return this.du().e(this.a($$0, this.bb, 1.0F));
   }

   protected fba a(buk $$0, bun $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static fba a(buk $$0, buk $$1, bum $$2) {
      int $$3 = $$0.cZ().indexOf($$1);
      return $$2.c(bul.a, $$3, $$0.aA);
   }

   public boolean n(buk $$0) {
      return this.a($$0, false);
   }

   public boolean bO() {
      return this instanceof bvg;
   }

   public boolean a(buk $$0, boolean $$1) {
      if ($$0 == this.r) {
         return false;
      } else if (!$$0.bR()) {
         return false;
      } else if (!this.dW().B_() && !$$0.o.b()) {
         return false;
      } else {
         for (buk $$2 = $$0; $$2.r != null; $$2 = $$2.r) {
            if ($$2.r == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bZ()) {
               this.ae();
            }

            this.b(bvs.a);
            this.r = $$0;
            this.r.p(this);
            $$0.F().filter($$0x -> $$0x instanceof ard).forEach($$0x -> ap.U.a((ard)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(buk $$0) {
      return !this.cd() && this.J <= 0;
   }

   public void bP() {
      for (int $$0 = this.q.size() - 1; $$0 >= 0; $$0--) {
         ((buk)this.q.get($$0)).ae();
      }
   }

   public void bQ() {
      if (this.r != null) {
         buk $$0 = this.r;
         this.r = null;
         $$0.q(this);
      }
   }

   public void ae() {
      this.bQ();
   }

   protected void p(buk $$0) {
      if ($$0.dl() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.q.isEmpty()) {
            this.q = ImmutableList.of($$0);
         } else {
            List<buk> $$1 = Lists.newArrayList(this.q);
            if (!this.dW().C && $$0 instanceof cox && !(this.da() instanceof cox)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.q = ImmutableList.copyOf($$1);
         }

         this.a(ebt.s, $$0);
      }
   }

   protected void q(buk $$0) {
      if ($$0.dl() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.q.size() == 1 && this.q.get(0) == $$0) {
            this.q = ImmutableList.of();
         } else {
            this.q = this.q.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(ebt.q, $$0);
      }
   }

   protected boolean r(buk $$0) {
      return this.q.isEmpty();
   }

   protected boolean bR() {
      return true;
   }

   public void f_() {
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.b($$3, $$4);
   }

   public double R_() {
      return this.dB();
   }

   public double S_() {
      return this.dD();
   }

   public double g_() {
      return this.dH();
   }

   public float r_() {
      return this.dO();
   }

   public float h_() {
      return this.dM();
   }

   public void a(float $$0, int $$1) {
      this.q($$0);
   }

   public float bS() {
      return 0.0F;
   }

   public fba bT() {
      return this.d(this.dO(), this.dM());
   }

   public fba a(cwl $$0) {
      if (!(this instanceof cox $$1)) {
         return fba.c;
      } else {
         boolean $$2 = $$1.fa().a($$0) && !$$1.eZ().a($$0);
         bva $$3 = $$2 ? $$1.fy().e() : $$1.fy();
         return this.d(0.0F, this.dM() + (float)($$3 == bva.b ? 80 : -80)).c(0.5);
      }
   }

   public faz bU() {
      return new faz(this.dO(), this.dM());
   }

   public fba bV() {
      return fba.a(this.bU());
   }

   public void a(dpj $$0, ji $$1) {
      if (this.aD()) {
         this.aB();
      } else {
         if (this.as == null || !this.as.a($$0)) {
            this.as = new bvr($$0, $$1.j());
         } else if (!this.as.e()) {
            this.as.a($$1.j());
            this.as.a(true);
         }
      }
   }

   protected void bW() {
      if (this.dW() instanceof arc $$0) {
         this.M();
         if (this.as != null) {
            if (this.as.a($$0, this, this.o(false))) {
               bos $$2 = bor.a();
               $$2.a("portal");
               this.aB();
               etz $$3 = this.as.a($$0, this);
               if ($$3 != null) {
                  arc $$4 = $$3.b();
                  if ($$0.p().a((dgi)$$4) && ($$4.ai() == $$0.ai() || this.a($$0, $$4))) {
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
      buk $$0 = this.da();
      return $$0 instanceof ard ? $$0.bX() : 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
   }

   public void c(bta $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dni.a(this);
      }
   }

   public void p(float $$0) {
   }

   public boolean bY() {
      boolean $$0 = this.dW() != null && this.dW().C;
      return !this.bi() && (this.aH > 0 || $$0 && this.i(0));
   }

   public boolean bZ() {
      return this.dl() != null;
   }

   public boolean ca() {
      return !this.q.isEmpty();
   }

   public boolean cb() {
      return this.aq().a(awt.p);
   }

   public boolean cc() {
      return !this.aq().a(awt.q);
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
      return this.c(bvs.f);
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
      return this.c(bvs.d);
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
      return this.dW().B_() ? this.i(6) : this.aX;
   }

   public boolean cp() {
      return this.i(5);
   }

   public boolean d(cox $$0) {
      if ($$0.Z_()) {
         return false;
      } else {
         fch $$1 = this.cr();
         return $$1 != null && $$0 != null && $$0.cr() == $$1 && $$1.i() ? false : this.cp();
      }
   }

   public boolean cq() {
      return false;
   }

   public void a(BiConsumer<ebq<?>, arc> $$0) {
   }

   @Nullable
   public fca cr() {
      return this.dW().R().e(this.cI());
   }

   public final boolean s(@Nullable buk $$0) {
      return $$0 == null ? false : this == $$0 || this.t($$0) || $$0.t(this);
   }

   protected boolean t(buk $$0) {
      return this.a($$0.cr());
   }

   public boolean a(@Nullable fch $$0) {
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

   public void a(arc $$0, bvf $$1) {
      this.h(this.aH + 1);
      if (this.aH == 0) {
         this.d(8.0F);
      }

      this.a($$0, this.dX().c(), 5.0F);
   }

   public void l(boolean $$0) {
      fba $$1 = this.dz();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.e - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.e + 0.1);
      }

      this.n($$1.d, $$2, $$1.f);
   }

   public void m(boolean $$0) {
      fba $$1 = this.dz();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.e - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.e + 0.06);
      }

      this.n($$1.d, $$2, $$1.f);
      this.k();
   }

   public boolean a(arc $$0, bvg $$1) {
      return true;
   }

   public void cy() {
      if (this.dz().b() > -0.5 && this.Z > 1.0F) {
         this.Z = 1.0F;
      }
   }

   public void k() {
      this.Z = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      ji $$3 = ji.a($$0, $$1, $$2);
      fba $$4 = new fba($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      ji.a $$5 = new ji.a();
      jn $$6 = jn.b;
      double $$7 = Double.MAX_VALUE;

      for (jn $$8 : new jn[]{jn.c, jn.d, jn.e, jn.f, jn.b}) {
         $$5.a($$3, $$8);
         if (!this.dW().a_($$5).m(this.dW(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == jn.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ae.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      fba $$13 = this.dz().c(0.75);
      if ($$6.o() == jn.a.a) {
         this.n((double)($$12 * $$11), $$13.e, $$13.f);
      } else if ($$6.o() == jn.a.b) {
         this.n($$13.d, (double)($$12 * $$11), $$13.f);
      } else if ($$6.o() == jn.a.c) {
         this.n($$13.d, $$13.e, (double)($$12 * $$11));
      }
   }

   public void a(dwx $$0, fba $$1) {
      this.k();
      this.U = $$1;
   }

   private static wo a(wo $$0) {
      xc $$1 = $$0.e().b($$0.a().a(null));

      for (wo $$2 : $$0.c()) {
         $$1.b(a($$2));
      }

      return $$1;
   }

   @Override
   public wo al() {
      wo $$0 = this.an();
      return $$0 != null ? a($$0) : this.cz();
   }

   protected wo cz() {
      return this.o.h();
   }

   public boolean u(buk $$0) {
      return this == $$0;
   }

   public float cA() {
      return 0.0F;
   }

   public void q(float $$0) {
   }

   public void r(float $$0) {
   }

   public boolean cB() {
      return true;
   }

   public boolean v(buk $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dW() == null ? "~NULL~" : this.dW().toString();
      return this.aE != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.al().getString(),
            this.p,
            $$0,
            this.dB(),
            this.dD(),
            this.dH(),
            this.aE
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.al().getString(),
            this.p,
            $$0,
            this.dB(),
            this.dD(),
            this.dH()
         );
   }

   protected final boolean d(bta $$0) {
      return this.dR() || this.aW && !$$0.a(awr.d) && !$$0.h() || $$0.a(awr.i) && this.bi() || $$0.a(awr.m) && this.aq().a(awt.o);
   }

   public boolean cC() {
      return this.aW;
   }

   public void n(boolean $$0) {
      this.aW = $$0;
   }

   public void w(buk $$0) {
      this.b($$0.dB(), $$0.dD(), $$0.dH(), $$0.dM(), $$0.dO());
   }

   public void x(buk $$0) {
      tq $$1 = $$0.f(new tq());
      $$1.r("Dimension");
      this.g($$1);
      this.aV = $$0.aV;
      this.as = $$0.as;
   }

   @Nullable
   public buk b(etz $$0) {
      if (this.dW() instanceof arc $$1 && !this.dR()) {
         arc $$3 = $$0.b();
         boolean $$4 = $$3.ai() != $$1.ai();
         if (!$$0.h()) {
            this.ae();
         }

         if ($$4) {
            return this.b($$3, $$0);
         }

         return this.a($$1, $$0);
      }

      return null;
   }

   private buk a(arc $$0, etz $$1) {
      for (buk $$2 : this.cZ()) {
         $$2.b(this.a($$1, $$2));
      }

      bos $$3 = bor.a();
      $$3.a("teleportSameDimension");
      this.a(bvt.a($$1), $$1.i());
      if (!$$1.h()) {
         this.a($$1);
      }

      $$1.j().onTransition(this);
      $$3.c();
      return this;
   }

   private buk b(arc $$0, etz $$1) {
      List<buk> $$2 = this.cZ();
      List<buk> $$3 = new ArrayList<>($$2.size());
      this.bP();

      for (buk $$4 : $$2) {
         buk $$5 = $$4.b(this.a($$1, $$4));
         if ($$5 != null) {
            $$3.add($$5);
         }
      }

      bos $$6 = bor.a();
      $$6.a("teleportCrossDimension");
      buk $$7 = this.aq().a($$0, buq.s);
      if ($$7 == null) {
         $$6.c();
         return null;
      } else {
         $$7.x(this);
         this.cD();
         $$7.a(bvt.a($$1), $$1.i());
         $$0.d($$7);

         for (buk $$8 : $$3) {
            $$8.a($$7, true);
         }

         $$0.i();
         $$1.j().onTransition($$7);
         $$6.c();
         return $$7;
      }
   }

   private etz a(etz $$0, buk $$1) {
      float $$2 = $$0.e() + ($$0.i().contains(bvu.d) ? 0.0F : $$1.dM() - this.dM());
      float $$3 = $$0.f() + ($$0.i().contains(bvu.e) ? 0.0F : $$1.dO() - this.dO());
      fba $$4 = $$1.du().d(this.du());
      fba $$5 = $$0.c().b($$0.i().contains(bvu.a) ? 0.0 : $$4.a(), $$0.i().contains(bvu.b) ? 0.0 : $$4.b(), $$0.i().contains(bvu.c) ? 0.0 : $$4.c());
      return $$0.a($$5).a($$2, $$3).a();
   }

   private void a(etz $$0) {
      buk $$1 = this.cX();

      for (buk $$2 : this.dd()) {
         if ($$2 instanceof ard) {
            ard $$3 = (ard)$$2;
            if ($$1 != null && $$3.ar() == $$1.ar()) {
               $$3.f.b(aft.a(this.ar(), bvt.a($$0), $$0.i(), this.aD));
            } else {
               $$3.f.b(aft.a(this.ar(), bvt.a(this), Set.of(), this.aD));
            }
         }
      }
   }

   public void a(bvt $$0, Set<bvu> $$1) {
      bvt $$2 = bvt.a(this);
      bvt $$3 = bvt.a($$2, $$0, $$1);
      this.o($$3.a().d, $$3.a().e, $$3.a().f);
      this.v($$3.c());
      this.q($$3.c());
      this.w($$3.d());
      this.ay();
      this.bz();
      this.h($$3.b());
      this.bi.clear();
   }

   public void a(float $$0, float $$1) {
      this.v($$0);
      this.q($$0);
      this.w($$1);
      this.bB();
   }

   public void f(ji $$0) {
      if (this.dW() instanceof arc $$1) {
         $$1.m().a(ari.e, new dfo($$0), 3, $$0);
      }
   }

   protected void cD() {
      this.c(buk.d.e);
      if (this instanceof bve $$0) {
         $$0.a(true, false);
      }
   }

   public fba a(jn.a $$0, l.a $$1) {
      return ety.a($$1, $$0, this.du(), this.a(this.aw()));
   }

   public boolean o(boolean $$0) {
      return ($$0 || !this.bZ()) && this.bL();
   }

   public boolean a(dgi $$0, dgi $$1) {
      if ($$0.ai() == dgi.k && $$1.ai() == dgi.i) {
         for (buk $$2 : this.cZ()) {
            if ($$2 instanceof ard $$3 && !$$3.i) {
               return false;
            }
         }
      }

      return true;
   }

   public float a(dga $$0, dfn $$1, ji $$2, dwx $$3, esz $$4, float $$5) {
      return $$5;
   }

   public boolean a(dga $$0, dfn $$1, ji $$2, dwx $$3, float $$4) {
      return true;
   }

   public int cE() {
      return 3;
   }

   public boolean s_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bur.a(this.aq()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.p);
      $$0.a("Entity Name", () -> this.al().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dB(), this.dD(), this.dH()));
      $$0.a("Entity's Block location", p.a(this.dW(), ayz.a(this.dB()), ayz.a(this.dD()), ayz.a(this.dH())));
      fba $$1 = this.dz();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.d, $$1.e, $$1.f));
      $$0.a("Entity's Passengers", () -> this.cZ().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.dl()));
   }

   public boolean cF() {
      return this.bY() && !this.Z_();
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
   public wo p_() {
      return fca.a(this.cr(), this.al()).a($$0 -> $$0.a(this.cQ()).a(this.cH()));
   }

   public void b(@Nullable wo $$0) {
      this.al.a(aO, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public wo an() {
      return this.al.a(aO).orElse(null);
   }

   @Override
   public boolean l_() {
      return this.al.a(aO).isPresent();
   }

   public void p(boolean $$0) {
      this.al.a(aP, $$0);
   }

   public boolean cL() {
      return this.al.a(aP);
   }

   public boolean a(arc $$0, double $$1, double $$2, double $$3, Set<bvu> $$4, float $$5, float $$6, boolean $$7) {
      float $$8 = ayz.a($$6, -90.0F, 90.0F);
      buk $$9 = this.b(new etz($$0, new fba($$1, $$2, $$3), fba.c, $$5, $$8, $$4, etz.a));
      return $$9 != null;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dW() instanceof arc) {
         this.b($$0, $$1, $$2, this.dM(), this.dO());
         this.E();
      }
   }

   private void E() {
      this.db().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.q.iterator();

         while (var1.hasNext()) {
            buk $$1 = (buk)var1.next();
            $$0.a($$1, buk::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.dB() + $$0, this.dD() + $$1, this.dH() + $$2);
   }

   public boolean cM() {
      return this.cL();
   }

   @Override
   public void a(List<akb.c<?>> $$0) {
   }

   @Override
   public void a(ajx<?> $$0) {
      if (aq.equals($$0)) {
         this.m_();
      }
   }

   @Deprecated
   protected void cN() {
      bvs $$0 = this.aw();
      bun $$1 = this.a($$0);
      this.bb = $$1;
      this.bc = $$1.c();
   }

   public void m_() {
      bun $$0 = this.bb;
      bvs $$1 = this.aw();
      bun $$2 = this.a($$1);
      this.bb = $$2;
      this.bc = $$2.c();
      this.ay();
      boolean $$3 = $$2.a() <= 4.0F && $$2.b() <= 4.0F;
      if (!this.s.C && !this.ak && !this.ad && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cox)) {
         this.a($$0);
      }
   }

   public boolean a(bun $$0) {
      bun $$1 = this.a(this.aw());
      fba $$2 = this.du().b(0.0, (double)$$0.b() / 2.0, 0.0);
      double $$3 = (double)Math.max(0.0F, $$1.a() - $$0.a()) + 1.0E-6;
      double $$4 = (double)Math.max(0.0F, $$1.b() - $$0.b()) + 1.0E-6;
      fbu $$5 = fbr.a(fav.a($$2, $$3, $$4, $$3));
      Optional<fba> $$6 = this.s.a(this, $$5, $$2, (double)$$1.a(), (double)$$1.b(), (double)$$1.a());
      if ($$6.isPresent()) {
         this.b($$6.get().b(0.0, (double)(-$$1.b()) / 2.0, 0.0));
         return true;
      } else {
         if ($$1.a() > $$0.a() && $$1.b() > $$0.b()) {
            fbu $$7 = fbr.a(fav.a($$2, $$3, 1.0E-6, $$3));
            Optional<fba> $$8 = this.s.a(this, $$7, $$2, (double)$$1.a(), (double)$$0.b(), (double)$$1.a());
            if ($$8.isPresent()) {
               this.b($$8.get().b(0.0, (double)(-$$0.b()) / 2.0 + 1.0E-6, 0.0));
               return true;
            }
         }

         return false;
      }
   }

   public jn cO() {
      return jn.a((double)this.dM());
   }

   public jn cP() {
      return this.cO();
   }

   protected wu cQ() {
      return new wu(wu.a.c, new wu.b(this.aq(), this.cG(), this.al()));
   }

   public boolean a(ard $$0) {
      return true;
   }

   @Override
   public final fav cR() {
      return this.aC;
   }

   public final void a(fav $$0) {
      this.aC = $$0;
   }

   public final float d(bvs $$0) {
      return this.a($$0).c();
   }

   public final float cS() {
      return this.bc;
   }

   public fba s(float $$0) {
      return this.cT();
   }

   protected fba cT() {
      return new fba(0.0, (double)this.cS(), (double)(this.dr() * 0.4F));
   }

   public bvy a_(int $$0) {
      return bvy.a;
   }

   public dgi cU() {
      return this.dW();
   }

   @Nullable
   public MinecraftServer cV() {
      return this.dW().p();
   }

   public bsj a(cox $$0, fba $$1, bsi $$2) {
      return bsj.e;
   }

   public boolean a(dga $$0) {
      return false;
   }

   public void d(ard $$0) {
   }

   public void e(ard $$0) {
   }

   public float a(dqe $$0) {
      float $$1 = ayz.h(this.dM());
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

   public float a(dol $$0) {
      float $$1 = ayz.h(this.dM());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public boolean cW() {
      return false;
   }

   public cpr a(cpq $$0) {
      return this.aq().a(awt.r) ? cpr.b : cpr.a;
   }

   @Nullable
   public bvg cX() {
      return null;
   }

   public final boolean cY() {
      return this.cX() != null;
   }

   public final List<buk> cZ() {
      return this.q;
   }

   @Nullable
   public buk da() {
      return this.q.isEmpty() ? null : (buk)this.q.get(0);
   }

   public boolean y(buk $$0) {
      return this.q.contains($$0);
   }

   public boolean a(Predicate<buk> $$0) {
      UnmodifiableIterator var2 = this.q.iterator();

      while (var2.hasNext()) {
         buk $$1 = (buk)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<buk> F() {
      return this.q.stream().flatMap(buk::db);
   }

   @Override
   public Stream<buk> db() {
      return Stream.concat(Stream.of(this), this.F());
   }

   @Override
   public Stream<buk> dc() {
      return Stream.concat(this.q.stream().flatMap(buk::dc), Stream.of(this));
   }

   public Iterable<buk> dd() {
      return () -> this.F().iterator();
   }

   public int de() {
      return (int)this.F().filter($$0 -> $$0 instanceof cox).count();
   }

   public boolean df() {
      return this.de() == 1;
   }

   public buk dg() {
      buk $$0 = this;

      while ($$0.bZ()) {
         $$0 = $$0.dl();
      }

      return $$0;
   }

   public boolean z(buk $$0) {
      return this.dg() == $$0.dg();
   }

   public boolean A(buk $$0) {
      if (!$$0.bZ()) {
         return false;
      } else {
         buk $$1 = $$0.dl();
         return $$1 == this ? true : this.A($$1);
      }
   }

   public boolean dh() {
      return this instanceof cox $$0 ? $$0.c() : this.di();
   }

   public boolean di() {
      return this.cX() instanceof cox $$0 ? $$0.c() : this.dk();
   }

   public boolean dj() {
      bvg $$0 = this.cX();
      return $$0 != null && $$0.dj();
   }

   public boolean dk() {
      return !this.dW().C;
   }

   protected static fba a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -ayz.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = ayz.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new fba((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public fba b(bvg $$0) {
      return new fba(this.dB(), this.cR().e, this.dH());
   }

   @Nullable
   public buk dl() {
      return this.r;
   }

   @Nullable
   public buk dm() {
      return this.r != null && this.r.cX() == this ? this.r : null;
   }

   public ete n_() {
      return ete.a;
   }

   public awb dn() {
      return awb.g;
   }

   protected int do() {
      return 1;
   }

   public ex d(arc $$0) {
      return new ex(ew.a, this.du(), this.bU(), $$0, 0, this.al().getString(), this.p_(), $$0.p(), this);
   }

   public void a(fj.a $$0, fba $$1) {
      fba $$2 = $$0.a(this);
      double $$3 = $$1.d - $$2.d;
      double $$4 = $$1.e - $$2.e;
      double $$5 = $$1.f - $$2.f;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.w(ayz.h((float)(-(ayz.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.v(ayz.h((float)(ayz.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.q(this.dM());
      this.O = this.dO();
      this.N = this.dM();
   }

   public float t(float $$0) {
      return ayz.h($$0, this.N, this.aA);
   }

   public boolean a(axf<esy> $$0, double $$1) {
      if (this.dp()) {
         return false;
      } else {
         fav $$2 = this.cR().h(0.001);
         int $$3 = ayz.a($$2.a);
         int $$4 = ayz.c($$2.d);
         int $$5 = ayz.a($$2.b);
         int $$6 = ayz.c($$2.e);
         int $$7 = ayz.a($$2.c);
         int $$8 = ayz.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cJ();
         boolean $$11 = false;
         fba $$12 = fba.c;
         int $$13 = 0;
         ji.a $$14 = new ji.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  esz $$18 = this.dW().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a(this.dW(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           fba $$20 = $$18.c(this.dW(), $$14);
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

            if (!(this instanceof cox)) {
               $$12 = $$12.d();
            }

            fba $$21 = this.dz();
            $$12 = $$12.c($$1);
            double $$22 = 0.003;
            if (Math.abs($$21.d) < 0.003 && Math.abs($$21.f) < 0.003 && $$12.g() < 0.0045000000000000005) {
               $$12 = $$12.d().c(0.0045000000000000005);
            }

            this.h(this.dz().e($$12));
         }

         this.ah.put($$0, $$9);
         return $$11;
      }
   }

   public boolean dp() {
      fav $$0 = this.cR().g(1.0);
      int $$1 = ayz.a($$0.a);
      int $$2 = ayz.c($$0.d);
      int $$3 = ayz.a($$0.c);
      int $$4 = ayz.c($$0.f);
      return !this.dW().b($$1, $$3, $$2, $$4);
   }

   public double b(axf<esy> $$0) {
      return this.ah.getDouble($$0);
   }

   public double dq() {
      return (double)this.cS() < 0.4 ? 0.0 : 0.4;
   }

   public final float dr() {
      return this.bb.a();
   }

   public final float ds() {
      return this.bb.b();
   }

   public yv<abk> a(ara $$0) {
      return new abl(this, $$0);
   }

   public bun a(bvs $$0) {
      return this.o.n();
   }

   public final bum dt() {
      return this.bb.d();
   }

   public fba du() {
      return this.t;
   }

   public fba dv() {
      return this.du();
   }

   @Override
   public ji dw() {
      return this.u;
   }

   public dwx dx() {
      if (this.bh == null) {
         this.bh = this.dW().a_(this.dw());
      }

      return this.bh;
   }

   public dfo dy() {
      return this.ay;
   }

   public fba dz() {
      return this.az;
   }

   public void h(fba $$0) {
      this.az = $$0;
   }

   public void i(fba $$0) {
      this.h(this.dz().e($$0));
   }

   public void n(double $$0, double $$1, double $$2) {
      this.h(new fba($$0, $$1, $$2));
   }

   public final int dA() {
      return this.u.u();
   }

   public final double dB() {
      return this.t.d;
   }

   public double c(double $$0) {
      return this.t.d + (double)this.dr() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ae.j() - 1.0) * $$0);
   }

   public final int dC() {
      return this.u.v();
   }

   public final double dD() {
      return this.t.e;
   }

   public double e(double $$0) {
      return this.t.e + (double)this.ds() * $$0;
   }

   public double dE() {
      return this.e(this.ae.j());
   }

   public double dF() {
      return this.t.e + (double)this.bc;
   }

   public final int dG() {
      return this.u.w();
   }

   public final double dH() {
      return this.t.f;
   }

   public double f(double $$0) {
      return this.t.f + (double)this.dr() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ae.j() - 1.0) * $$0);
   }

   public final void o(double $$0, double $$1, double $$2) {
      if (this.t.d != $$0 || this.t.e != $$1 || this.t.f != $$2) {
         this.t = new fba($$0, $$1, $$2);
         int $$3 = ayz.a($$0);
         int $$4 = ayz.a($$1);
         int $$5 = ayz.a($$2);
         if ($$3 != this.u.u() || $$4 != this.u.v() || $$5 != this.u.w()) {
            this.u = new ji($$3, $$4, $$5);
            this.bh = null;
            if (kk.a($$3) != this.ay.h || kk.a($$5) != this.ay.i) {
               this.ay = new dfo(this.u);
            }
         }

         this.aT.a();
      }
   }

   public void dI() {
   }

   public fba u(float $$0) {
      return this.o($$0).b(0.0, (double)this.bc * 0.7, 0.0);
   }

   public void a(abl $$0) {
      int $$1 = $$0.b();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      double $$4 = $$0.i();
      this.f($$2, $$3, $$4);
      this.b($$2, $$3, $$4, $$0.n(), $$0.m());
      this.e($$1);
      this.a_($$0.e());
   }

   @Nullable
   public cwp dJ() {
      return null;
   }

   public void q(boolean $$0) {
      this.av = $$0;
   }

   public boolean dK() {
      return !this.aq().a(awt.k);
   }

   public boolean dL() {
      return (this.av || this.aw) && this.dK();
   }

   public float dM() {
      return this.aA;
   }

   public float dN() {
      return this.dM();
   }

   public void v(float $$0) {
      if (!Float.isFinite($$0)) {
         af.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aA = $$0;
      }
   }

   public float dO() {
      return this.aB;
   }

   public void w(float $$0) {
      if (!Float.isFinite($$0)) {
         af.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aB = Math.clamp($$0 % 360.0F, -90.0F, 90.0F);
      }
   }

   public boolean dP() {
      return false;
   }

   public float dQ() {
      return 0.0F;
   }

   public void b_(@Nullable buk $$0) {
   }

   public final boolean dR() {
      return this.aE != null;
   }

   @Nullable
   public buk.d dS() {
      return this.aE;
   }

   @Override
   public final void c(buk.d $$0) {
      if (this.aE == null) {
         this.aE = $$0;
      }

      if (this.aE.a()) {
         this.ae();
      }

      this.cZ().forEach(buk::ae);
      this.aT.a($$0);
      this.b($$0);
   }

   protected void dT() {
      this.aE = null;
   }

   @Override
   public void a(ebb $$0) {
      this.aT = $$0;
   }

   @Override
   public boolean dU() {
      if (this.aE != null && !this.aE.b()) {
         return false;
      } else {
         return this.bZ() ? false : !this.ca() || !this.df();
      }
   }

   @Override
   public boolean dV() {
      return false;
   }

   public boolean c(arc $$0, ji $$1) {
      return true;
   }

   public dgi dW() {
      return this.s;
   }

   protected void a(dgi $$0) {
      this.s = $$0;
   }

   public btb dX() {
      return this.dW().ak();
   }

   public kf dY() {
      return this.dW().K_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = ayz.d($$6, this.dB(), $$1);
      double $$8 = ayz.d($$6, this.dD(), $$2);
      double $$9 = ayz.d($$6, this.dH(), $$3);
      float $$10 = (float)ayz.e($$6, (double)this.dM(), $$4);
      float $$11 = (float)ayz.d($$6, (double)this.dO(), $$5);
      this.a_($$7, $$8, $$9);
      this.b($$10, $$11);
   }

   public azh dZ() {
      return this.ae;
   }

   public fba ah() {
      if (this.cX() instanceof cox $$0 && this.bL()) {
         return $$0.ah();
      }

      return this.dz();
   }

   @Nullable
   public cwp ea() {
      return null;
   }

   public Optional<akt<evw>> eb() {
      return this.o.k();
   }

   @FunctionalInterface
   public interface a {
      void accept(buk var1, double var2, double var4, double var6);
   }

   static record b(fba a, fba b) {
   }

   public static enum c {
      a(false, false),
      b(true, false),
      c(false, true),
      d(true, true);

      final boolean e;
      final boolean f;

      private c(final boolean $$0, final boolean $$1) {
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

   public static enum d {
      a(true, false),
      b(true, false),
      c(false, true),
      d(false, false),
      e(false, false);

      private final boolean f;
      private final boolean g;

      private d(final boolean $$0, final boolean $$1) {
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
