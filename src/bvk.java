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

public abstract class bvk implements alf, btm, eby, fdc {
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
   private static final fbt d = new fbt(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double k = 0.014;
   private static final double l = 0.007;
   private static final double m = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double n = 1.0;
   private final bvr<?> o;
   private int p = c.incrementAndGet();
   public boolean I;
   private ImmutableList<bvk> q = ImmutableList.of();
   protected int J;
   @Nullable
   private bvk r;
   private dhi s;
   public double K;
   public double L;
   public double M;
   private fby t;
   private jh u;
   private dgo ay;
   private fby az = fby.c;
   private float aA;
   private float aB;
   public float N;
   public float O;
   private fbt aC = d;
   private boolean aD;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected fby U = fby.c;
   @Nullable
   private bvk.d aE;
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
   protected final bam ae = bam.a();
   public int af;
   private int aH = -this.do();
   protected boolean ag;
   protected Object2DoubleMap<ayk<etw>> ah = new Object2DoubleArrayMap(2);
   protected boolean ai;
   private final Set<ayk<etw>> aI = new HashSet<>();
   public int aj;
   protected boolean ak = true;
   protected final alg al;
   protected static final alc<Byte> am = alg.a(bvk.class, ale.a);
   protected static final int an = 0;
   private static final int aJ = 1;
   private static final int aK = 3;
   private static final int aL = 4;
   private static final int aM = 5;
   protected static final int ao = 6;
   protected static final int ap = 7;
   private static final alc<Integer> aN = alg.a(bvk.class, ale.b);
   private static final alc<Optional<xv>> aO = alg.a(bvk.class, ale.g);
   private static final alc<Boolean> aP = alg.a(bvk.class, ale.k);
   private static final alc<Boolean> aQ = alg.a(bvk.class, ale.k);
   private static final alc<Boolean> aR = alg.a(bvk.class, ale.k);
   protected static final alc<bws> aq = alg.a(bvk.class, ale.w);
   private static final alc<Integer> aS = alg.a(bvk.class, ale.b);
   private ebz aT = ebz.a;
   private final ajm aU = new ajm();
   public boolean ar;
   @Nullable
   public bwr as;
   private int aV;
   private boolean aW;
   protected UUID at = bae.a(this.ae);
   protected String au = this.at.toString();
   private boolean aX;
   private final Set<String> aY = Sets.newHashSet();
   private final double[] aZ = new double[]{0.0, 0.0, 0.0};
   private long ba;
   private bvn bb;
   private float bc;
   public boolean av;
   public boolean aw;
   public Optional<jh> ax = Optional.empty();
   private boolean bd = false;
   private float be;
   private int bf;
   private boolean bg;
   @Nullable
   private dxv bh = null;
   private final List<bvk.b> bi = new ArrayList<>();
   private final Set<dxv> bj = new ReferenceArraySet();
   private final LongSet bk = new LongOpenHashSet();

   public bvk(bvr<?> $$0, dhi $$1) {
      this.o = $$0;
      this.s = $$1;
      this.bb = $$0.n();
      this.t = fby.c;
      this.u = jh.c;
      this.ay = dgo.e;
      alg.a $$2 = new alg.a(this);
      $$2.a(am, (byte)0);
      $$2.a(aN, this.cs());
      $$2.a(aP, false);
      $$2.a(aO, Optional.empty());
      $$2.a(aQ, false);
      $$2.a(aR, false);
      $$2.a(aq, bws.a);
      $$2.a(aS, 0);
      this.a($$2);
      this.al = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.bc = this.bb.c();
   }

   public boolean a(jh $$0, dxv $$1) {
      fcs $$2 = $$1.b(this.dW(), $$0, fcd.a(this));
      fcs $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return fcp.c($$3, fcp.a(this.cR()), fcc.i);
   }

   public int k_() {
      fdf $$0 = this.cr();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean aa_() {
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
      this.aU.e(new fby($$0, $$1, $$2));
   }

   public ajm ap() {
      return this.aU;
   }

   public bvr<?> aq() {
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

   public void c(ash $$0) {
      this.a(bvk.d.a);
      this.a(ecr.p);
   }

   public final void at() {
      this.a(bvk.d.b);
   }

   protected abstract void a(alg.a var1);

   public alg au() {
      return this.al;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bvk ? ((bvk)$$0).p == this.p : false;
   }

   @Override
   public int hashCode() {
      return this.p;
   }

   public void a(bvk.d $$0) {
      this.c($$0);
   }

   public void av() {
   }

   public void b(bvk.d $$0) {
   }

   public void b(bws $$0) {
      this.al.a(aq, $$0);
   }

   public bws aw() {
      return this.al.a(aq);
   }

   public boolean c(bws $$0) {
      return this.aw() == $$0;
   }

   public boolean a(bvk $$0, double $$1) {
      return this.du().a((ka)$$0.du(), $$1);
   }

   public boolean a(bvk $$0, double $$1, double $$2) {
      double $$3 = $$0.dB() - this.dB();
      double $$4 = $$0.dD() - this.dD();
      double $$5 = $$0.dH() - this.dH();
      return bae.e($$3, $$5) < bae.k($$1) && bae.k($$4) < bae.k($$2);
   }

   protected void b(float $$0, float $$1) {
      this.v($$0 % 360.0F);
      this.w($$1 % 360.0F);
   }

   public final void b(fby $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      this.a(this.ax());
   }

   protected fbt ax() {
      return this.bb.a(this.t);
   }

   protected void ay() {
      this.a_(this.t.d, this.t.e, this.t.f);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.w(this.dO() + $$2);
      this.v(this.dM() + $$3);
      this.w(bae.a(this.dO(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = bae.a(this.O, -90.0F, 90.0F);
      if (this.r != null) {
         this.r.k(this);
      }
   }

   public void h() {
      this.az();
   }

   public void az() {
      bpt $$0 = bps.a();
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
      if (this.dW() instanceof ash $$1) {
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
      if (this.dW() instanceof ash $$2 && this instanceof bwe) {
         bwe.a_($$2, (bvk)((bwe)this));
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
         if (this.dW() instanceof ash $$0 && this.a($$0, this.dX().e(), 4.0F) && this.aF() && !this.bb()) {
            $$0.a(null, this.dB(), this.dD(), this.dH(), axf.ku, this.dn(), 0.4F, 2.0F + this.ae.i() * 0.4F);
         }
      }
   }

   protected boolean aF() {
      return true;
   }

   public final void d(float $$0) {
      this.g(bae.d($$0 * 20.0F));
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

   private boolean b(fbt $$0) {
      return this.dW().a(this, $$0) && !this.dW().d($$0);
   }

   public void d(boolean $$0) {
      this.aD = $$0;
      this.a($$0, null);
   }

   public void a(boolean $$0, boolean $$1, fby $$2) {
      this.aD = $$0;
      this.P = $$1;
      this.a($$0, $$2);
   }

   public boolean d(jh $$0) {
      return this.ax.isPresent() && this.ax.get().equals($$0);
   }

   protected void a(boolean $$0, @Nullable fby $$1) {
      if ($$0) {
         fbt $$2 = this.cR();
         fbt $$3 = new fbt($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<jh> $$4 = this.s.h(this, $$3);
         if ($$4.isPresent() || this.bd) {
            this.ax = $$4;
         } else if ($$1 != null) {
            fbt $$5 = $$3.d(-$$1.d, 0.0, -$$1.f);
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

   public void a(bwk $$0, fby $$1) {
      if (this.ad) {
         this.a_(this.dB() + $$1.d, this.dD() + $$1.e, this.dH() + $$1.f);
      } else {
         this.aG = this.bY();
         if ($$0 == bwk.c) {
            $$1 = this.d($$1);
            if ($$1.equals(fby.c)) {
               return;
            }
         }

         bpt $$2 = bps.a();
         $$2.a("move");
         if (this.U.h() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = fby.c;
            this.h(fby.c);
         }

         $$1 = this.a($$1, $$0);
         fby $$3 = this.a($$1);
         double $$4 = $$3.h();
         if ($$4 > 1.0E-7 || $$1.h() - $$4 < 1.0E-7) {
            if (this.Z != 0.0F && $$4 >= 1.0) {
               fbu $$5 = this.dW().a(new dgq(this.du(), this.du().e($$3), dgq.a.d, dgq.b.d, this));
               if ($$5.d() != fbw.a.a) {
                  this.k();
               }
            }

            this.a_(this.dB() + $$3.d, this.dD() + $$3.e, this.dH() + $$3.f);
         }

         $$2.c();
         $$2.a("rest");
         boolean $$6 = !bae.b($$1.d, $$3.d);
         boolean $$7 = !bae.b($$1.f, $$3.f);
         this.P = $$6 || $$7;
         this.Q = $$1.e != $$3.e;
         this.R = this.Q && $$1.e < 0.0;
         if (this.P) {
            this.S = this.c($$3);
         } else {
            this.S = false;
         }

         this.a(this.R, this.P, $$3);
         jh $$8 = this.aP();
         dxv $$9 = this.dW().a_($$8);
         if (!this.dW().B_() || this.di()) {
            this.a($$3.e, this.aJ(), $$9, $$8);
         }

         if (this.dR()) {
            $$2.c();
         } else {
            if (this.P) {
               fby $$10 = this.dz();
               this.n($$6 ? 0.0 : $$10.d, $$10.e, $$7 ? 0.0 : $$10.f);
            }

            if (this.di()) {
               dkm $$11 = $$9.b();
               if ($$1.e != $$3.e) {
                  $$11.a(this.dW(), this);
               }
            }

            if (!this.dW().B_() || this.di()) {
               bvk.c $$12 = this.bg();
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

   private void a(bvk.c $$0, fby $$1, jh $$2, dxv $$3) {
      float $$4 = 0.6F;
      float $$5 = (float)($$1.g() * 0.6F);
      float $$6 = (float)($$1.i() * 0.6F);
      jh $$7 = this.aR();
      dxv $$8 = this.dW().a_($$7);
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
               this.a(ecr.Q);
            }
         }
      } else if ($$8.l()) {
         this.aO();
      }
   }

   public void aK() {
      this.a(this.bC(), this.t);
   }

   public void a(fby $$0, fby $$1) {
      if (this.aL()) {
         if (this.aJ()) {
            jh $$2 = this.aP();
            dxv $$3 = this.dW().a_($$2);
            $$3.b().a(this.dW(), $$2, $$3, this);
         }

         this.bi.add(new bvk.b($$0, $$1));
         this.a(this.bi, this.bj);
         boolean $$4 = Iterables.any(this.bj, $$0x -> $$0x.a(axu.aN) || $$0x.a(dko.K));
         this.bi.clear();
         this.bj.clear();
         if (!$$4 && this.bL()) {
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

   private boolean c(dxv $$0) {
      return $$0.a(axu.aS) || $$0.a(dko.rk);
   }

   private boolean a(jh $$0, dxv $$1, boolean $$2, boolean $$3, fby $$4) {
      if ($$1.l()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aJ() || $$5 || this.ci() && $$4.e == 0.0 || this.cq()) && !this.ck()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dW().a(ecr.P, this.du(), ecr.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(fby $$0) {
      return false;
   }

   protected void aM() {
      this.a(axf.kz, 0.7F, 1.6F + (this.ae.i() - this.ae.i()) * 0.4F);
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
            this.a(ecr.x);
         }
      }
   }

   @Deprecated
   public jh aP() {
      return this.e(0.2F);
   }

   public jh aQ() {
      return this.e(0.500001F);
   }

   public jh aR() {
      return this.e(1.0E-5F);
   }

   protected jh e(float $$0) {
      if (this.ax.isPresent()) {
         jh $$1 = this.ax.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dxv $$2 = this.dW().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(axu.U)) && !$$2.a(axu.N) && !($$2.b() instanceof dnm) ? $$1.h(bae.a(this.t.e - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = bae.a(this.t.d);
         int $$4 = bae.a(this.t.e - (double)$$0);
         int $$5 = bae.a(this.t.f);
         return new jh($$3, $$4, $$5);
      }
   }

   protected float aS() {
      float $$0 = this.dW().a_(this.dw()).b().k();
      float $$1 = this.dW().a_(this.aQ()).b().k();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aT() {
      dxv $$0 = this.dW().a_(this.dw());
      float $$1 = $$0.b().h();
      if (!$$0.a(dko.J) && !$$0.a(dko.ny)) {
         return (double)$$1 == 1.0 ? this.dW().a_(this.aQ()).b().h() : $$1;
      } else {
         return $$1;
      }
   }

   protected fby a(fby $$0, bwk $$1) {
      return $$0;
   }

   protected fby d(fby $$0) {
      if ($$0.h() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dW().ac();
         if ($$1 != this.ba) {
            Arrays.fill(this.aZ, 0.0);
            this.ba = $$1;
         }

         if ($$0.d != 0.0) {
            double $$2 = this.a(jm.a.a, $$0.d);
            return Math.abs($$2) <= 1.0E-5F ? fby.c : new fby($$2, 0.0, 0.0);
         } else if ($$0.e != 0.0) {
            double $$3 = this.a(jm.a.b, $$0.e);
            return Math.abs($$3) <= 1.0E-5F ? fby.c : new fby(0.0, $$3, 0.0);
         } else if ($$0.f != 0.0) {
            double $$4 = this.a(jm.a.c, $$0.f);
            return Math.abs($$4) <= 1.0E-5F ? fby.c : new fby(0.0, 0.0, $$4);
         } else {
            return fby.c;
         }
      }
   }

   private double a(jm.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = bae.a($$1 + this.aZ[$$2], -0.51, 0.51);
      $$1 = $$3 - this.aZ[$$2];
      this.aZ[$$2] = $$3;
      return $$1;
   }

   private fby a(fby $$0) {
      fbt $$1 = this.cR();
      List<fcs> $$2 = this.dW().c(this, $$1.b($$0));
      fby $$3 = $$0.h() == 0.0 ? $$0 : a(this, $$0, $$1, this.dW(), $$2);
      boolean $$4 = $$0.d != $$3.d;
      boolean $$5 = $$0.e != $$3.e;
      boolean $$6 = $$0.f != $$3.f;
      boolean $$7 = $$5 && $$0.e < 0.0;
      if (this.dQ() > 0.0F && ($$7 || this.aJ()) && ($$4 || $$6)) {
         fbt $$8 = $$7 ? $$1.d(0.0, $$3.e, 0.0) : $$1;
         fbt $$9 = $$8.b($$0.d, (double)this.dQ(), $$0.f);
         if (!$$7) {
            $$9 = $$9.b(0.0, -1.0E-5F, 0.0);
         }

         List<fcs> $$10 = a(this, this.s, $$2, $$9);
         float $$11 = (float)$$3.e;
         float[] $$12 = a($$8, $$10, this.dQ(), $$11);

         for (float $$13 : $$12) {
            fby $$14 = a(new fby($$0.d, (double)$$13, $$0.f), $$8, $$10);
            if ($$14.j() > $$3.j()) {
               double $$15 = $$1.b - $$8.b;
               return $$14.b(0.0, -$$15, 0.0);
            }
         }
      }

      return $$3;
   }

   private static float[] a(fbt $$0, List<fcs> $$1, float $$2, float $$3) {
      FloatSet $$4 = new FloatArraySet(4);

      for (fcs $$5 : $$1) {
         DoubleList $$6 = $$5.a(jm.a.b);
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

   public static fby a(@Nullable bvk $$0, fby $$1, fbt $$2, dhi $$3, List<fcs> $$4) {
      List<fcs> $$5 = a($$0, $$3, $$4, $$2.b($$1));
      return a($$1, $$2, $$5);
   }

   private static List<fcs> a(@Nullable bvk $$0, dhi $$1, List<fcs> $$2, fbt $$3) {
      Builder<fcs> $$4 = ImmutableList.builderWithExpectedSize($$2.size() + 1);
      if (!$$2.isEmpty()) {
         $$4.addAll($$2);
      }

      dzl $$5 = $$1.F_();
      boolean $$6 = $$0 != null && $$5.a($$0, $$3);
      if ($$6) {
         $$4.add($$5.c());
      }

      $$4.addAll($$1.e($$0, $$3));
      return $$4.build();
   }

   private static fby a(fby $$0, fbt $$1, List<fcs> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.d;
         double $$4 = $$0.e;
         double $$5 = $$0.f;
         if ($$4 != 0.0) {
            $$4 = fcp.a(jm.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = fcp.a(jm.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = fcp.a(jm.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = fcp.a(jm.a.c, $$1, $$2, $$5);
         }

         return new fby($$3, $$4, $$5);
      }
   }

   protected float aU() {
      return (float)((int)this.X + 1);
   }

   protected axe aV() {
      return axf.kD;
   }

   protected axe aW() {
      return axf.kC;
   }

   protected axe aX() {
      return axf.kC;
   }

   public void b(fby $$0, fby $$1) {
      this.bi.add(new bvk.b($$0, $$1));
   }

   private void a(List<bvk.b> $$0, Set<dxv> $$1) {
      if (this.aL()) {
         fbt $$2 = this.cR().h(1.0E-5F);
         LongSet $$3 = this.bk;

         for (bvk.b $$4 : $$0) {
            fby $$5 = $$4.a();
            fby $$6 = $$4.b();

            for (jh $$7 : dgn.a($$5, $$6, $$2)) {
               if (!this.bL()) {
                  return;
               }

               dxv $$8 = this.dW().a_($$7);
               if (!$$8.l() && $$3.add($$7.a())) {
                  try {
                     fcs $$9 = $$8.b(this.dW(), $$7);
                     if ($$9 != fcp.b() && !this.a($$5, $$6, $$7, $$9)) {
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

         $$3.clear();
      }
   }

   private boolean a(fby $$0, fby $$1, jh $$2, fcs $$3) {
      fbt $$4 = this.cR().c(this.cR().f().c(-1.0)).c($$1);
      fby $$5 = $$0.d($$4.g());
      return this.cR().a($$5, $$3.a(new fby($$2)).e());
   }

   protected void a(dxv $$0) {
   }

   public jh a(ash $$0, jh $$1) {
      jh $$2 = $$0.Y();
      fby $$3 = $$2.b();
      int $$4 = $$0.m($$2).a(edq.a.f, $$2.u(), $$2.w()) + 1;
      return jh.a($$3.d, (double)$$4, $$3.f);
   }

   public void a(jq<ecr> $$0, @Nullable bvk $$1) {
      this.dW().a($$1, $$0, this.t);
   }

   public void a(jq<ecr> $$0) {
      this.a($$0, this);
   }

   private void c(jh $$0, dxv $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.m();
      }
   }

   protected void aY() {
      bvk $$0 = Objects.requireNonNullElse(this.cX(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      fby $$2 = $$0.dz();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      this.f($$3);
   }

   protected jh e(jh $$0) {
      jh $$1 = $$0.d();
      dxv $$2 = this.dW().a_($$1);
      return !$$2.a(axu.bp) && !$$2.a(axu.bq) ? $$0 : $$1;
   }

   protected void a(dxv $$0, dxv $$1) {
      dsc $$2 = $$0.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dxv $$0) {
      dsc $$1 = $$0.A();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(jh $$0, dxv $$1) {
      dsc $$2 = $$1.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dxv $$0) {
      return $$0.a(axu.bo) && this.af >= this.bf + 20;
   }

   private void m() {
      this.be = this.be * (float)Math.pow(0.997, (double)(this.af - this.bf));
      this.be = Math.min(1.0F, this.be + 0.07F);
      float $$0 = 0.5F + this.be * this.ae.i() * 1.2F;
      float $$1 = 0.1F + this.be * 1.2F;
      this.a(axf.E, $$1, $$0);
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

   public void a(axe $$0, float $$1, float $$2) {
      if (!this.bb()) {
         this.dW().a(null, this.dB(), this.dD(), this.dH(), $$0, this.dn(), $$1, $$2);
      }
   }

   public void a(axe $$0) {
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

   protected bvk.c bg() {
      return bvk.c.d;
   }

   public boolean bh() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dxv $$2, jh $$3) {
      if ($$1) {
         if (this.Z > 0.0F) {
            $$2.b().a(this.dW(), $$2, $$3, this, this.Z);
            this.dW().a(ecr.A, this.t, ecr.a.a(this, this.ax.<dxv>map($$0x -> this.dW().a_($$0x)).orElse($$2)));
         }

         this.k();
      } else if ($$0 < 0.0) {
         this.Z -= (float)$$0;
      }
   }

   public boolean bi() {
      return this.aq().d();
   }

   public boolean a(float $$0, float $$1, bua $$2) {
      if (this.o.a(axy.o)) {
         return false;
      } else {
         if (this.ca()) {
            for (bvk $$3 : this.cZ()) {
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
      jh $$0 = this.dw();
      return this.dW().r($$0) || this.dW().r(jh.a((double)$$0.u(), this.cR().e, (double)$$0.w()));
   }

   private boolean u() {
      return this.dx().a(dko.ny);
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
         this.i(this.cj() && this.bo() && !this.bZ() && this.dW().b_(this.u).a(aya.a));
      }
   }

   protected boolean bq() {
      this.ah.clear();
      this.br();
      double $$0 = this.dW().G_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(aya.b, $$0);
      return this.bj() || $$1;
   }

   void br() {
      if (this.dl() instanceof cru $$0 && !$$0.bo()) {
         this.ag = false;
         return;
      }

      if (this.a(aya.a, 0.014)) {
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
      this.ai = this.a(aya.a);
      this.aI.clear();
      double $$0 = this.dF();
      if (this.dl() instanceof cru $$2 && !$$2.bo() && $$2.cR().e >= $$0 && $$2.cR().b <= $$0) {
         return;
      }

      jh $$3 = jh.a(this.dB(), $$0, this.dH());
      etx $$4 = this.dW().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a(this.dW(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aI::add);
      }
   }

   protected void bs() {
      bvk $$0 = Objects.requireNonNullElse(this.cX(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      fby $$2 = $$0.dz();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aW(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      } else {
         this.a(this.aX(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      }

      float $$4 = (float)bae.a(this.dD());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bb.a() * 20.0F; $$5++) {
         double $$6 = (this.ae.j() * 2.0 - 1.0) * (double)this.bb.a();
         double $$7 = (this.ae.j() * 2.0 - 1.0) * (double)this.bb.a();
         this.dW().a(ls.d, this.dB() + $$6, (double)($$4 + 1.0F), this.dH() + $$7, $$2.d, $$2.e - this.ae.j() * 0.2F, $$2.f);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bb.a() * 20.0F; $$8++) {
         double $$9 = (this.ae.j() * 2.0 - 1.0) * (double)this.bb.a();
         double $$10 = (this.ae.j() * 2.0 - 1.0) * (double)this.bb.a();
         this.dW().a(ls.an, this.dB() + $$9, (double)($$4 + 1.0F), this.dH() + $$10, $$2.d, $$2.e, $$2.f);
      }

      this.a(ecr.O);
   }

   @Deprecated
   protected dxv bt() {
      return this.dW().a_(this.aP());
   }

   public dxv bu() {
      return this.dW().a_(this.aR());
   }

   public boolean bv() {
      return this.cj() && !this.bj() && !this.aa_() && !this.ci() && !this.bx() && this.bL();
   }

   protected void bw() {
      jh $$0 = this.aP();
      dxv $$1 = this.dW().a_($$0);
      if ($$1.o() != dqv.a) {
         fby $$2 = this.dz();
         jh $$3 = this.dw();
         double $$4 = this.dB() + (this.ae.j() - 0.5) * (double)this.bb.a();
         double $$5 = this.dH() + (this.ae.j() - 0.5) * (double)this.bb.a();
         if ($$3.u() != $$0.u()) {
            $$4 = bae.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = bae.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dW().a(new lk(ls.b, $$1), $$4, this.dD() + 0.1, $$5, $$2.d * -4.0, 1.5, $$2.f * -4.0);
      }
   }

   public boolean a(ayk<etw> $$0) {
      return this.aI.contains($$0);
   }

   public boolean bx() {
      return !this.ak && this.ah.getDouble(aya.b) > 0.0;
   }

   public void a(float $$0, fby $$1) {
      fby $$2 = a($$1, $$0, this.dM());
      this.h(this.dz().e($$2));
   }

   protected static fby a(fby $$0, float $$1, float $$2) {
      double $$3 = $$0.h();
      if ($$3 < 1.0E-7) {
         return fby.c;
      } else {
         fby $$4 = ($$3 > 1.0 ? $$0.d() : $$0).c((double)$$1);
         float $$5 = bae.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = bae.b($$2 * (float) (Math.PI / 180.0));
         return new fby($$4.d * (double)$$6 - $$4.f * (double)$$5, $$4.e, $$4.f * (double)$$6 + $$4.d * (double)$$5);
      }
   }

   @Deprecated
   public float by() {
      return this.dW().f(this.dA(), this.dG()) ? this.dW().x(jh.a(this.dB(), this.dF(), this.dH())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.c($$3, $$4);
   }

   public void c(float $$0, float $$1) {
      this.v($$0 % 360.0F);
      this.w(bae.a($$1, -90.0F, 90.0F) % 360.0F);
      this.N = this.dM();
      this.O = this.dO();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = bae.a($$0, -3.0E7, 3.0E7);
      double $$4 = bae.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(fby $$0) {
      this.e($$0.d, $$0.e, $$0.f);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dM(), this.dO());
   }

   public void a(jh $$0, float $$1, float $$2) {
      this.b($$0.c(), $$1, $$2);
   }

   public void b(fby $$0, float $$1, float $$2) {
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

   public final void c(fby $$0, float $$1, float $$2) {
      this.j($$0);
      this.f($$1, $$2);
   }

   protected void bA() {
      this.j(this.t);
   }

   public void bB() {
      this.f(this.dM(), this.dO());
   }

   private void j(fby $$0) {
      this.K = this.aa = $$0.d;
      this.L = this.ab = $$0.e;
      this.M = this.ac = $$0.f;
   }

   private void f(float $$0, float $$1) {
      this.N = $$0;
      this.O = $$1;
   }

   public final fby bC() {
      return new fby(this.aa, this.ab, this.ac);
   }

   public float f(bvk $$0) {
      float $$1 = (float)(this.dB() - $$0.dB());
      float $$2 = (float)(this.dD() - $$0.dD());
      float $$3 = (float)(this.dH() - $$0.dH());
      return bae.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dB() - $$0;
      double $$4 = this.dD() - $$1;
      double $$5 = this.dH() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(bvk $$0) {
      return this.f($$0.du());
   }

   public double f(fby $$0) {
      double $$1 = this.dB() - $$0.d;
      double $$2 = this.dD() - $$0.e;
      double $$3 = this.dH() - $$0.f;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void a_(cpx $$0) {
   }

   public void h(bvk $$0) {
      if (!this.z($$0)) {
         if (!$$0.ad && !this.ad) {
            double $$1 = $$0.dB() - this.dB();
            double $$2 = $$0.dH() - this.dH();
            double $$3 = bae.a($$1, $$2);
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

   public void g(fby $$0) {
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
   public final void a(bua $$0, float $$1) {
      if (this.s instanceof ash $$2) {
         this.a($$2, $$0, $$1);
      }
   }

   @Deprecated
   public final boolean b(bua $$0, float $$1) {
      return this.s instanceof ash $$2 ? this.a($$2, $$0, $$1) : this.b($$0);
   }

   public abstract boolean a(ash var1, bua var2, float var3);

   public boolean b(bua $$0) {
      return false;
   }

   public final fby g(float $$0) {
      return this.d(this.h($$0), this.i($$0));
   }

   public jm bE() {
      return jm.a(this.g(1.0F));
   }

   public float h(float $$0) {
      return this.j($$0);
   }

   public float i(float $$0) {
      return this.k($$0);
   }

   public float j(float $$0) {
      return $$0 == 1.0F ? this.dO() : bae.h($$0, this.O, this.dO());
   }

   public float k(float $$0) {
      return $$0 == 1.0F ? this.dM() : bae.i($$0, this.N, this.dM());
   }

   public final fby d(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = bae.b($$3);
      float $$5 = bae.a($$3);
      float $$6 = bae.b($$2);
      float $$7 = bae.a($$2);
      return new fby((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final fby l(float $$0) {
      return this.e(this.h($$0), this.i($$0));
   }

   protected final fby e(float $$0, float $$1) {
      return this.d($$0 - 90.0F, $$1);
   }

   public final fby bF() {
      return new fby(this.dB(), this.dF(), this.dH());
   }

   public final fby m(float $$0) {
      double $$1 = bae.d((double)$$0, this.K, this.dB());
      double $$2 = bae.d((double)$$0, this.L, this.dD()) + (double)this.cS();
      double $$3 = bae.d((double)$$0, this.M, this.dH());
      return new fby($$1, $$2, $$3);
   }

   public fby n(float $$0) {
      return this.m($$0);
   }

   public final fby o(float $$0) {
      double $$1 = bae.d((double)$$0, this.K, this.dB());
      double $$2 = bae.d((double)$$0, this.L, this.dD());
      double $$3 = bae.d((double)$$0, this.M, this.dH());
      return new fby($$1, $$2, $$3);
   }

   public fbw a(double $$0, float $$1, boolean $$2) {
      fby $$3 = this.m($$1);
      fby $$4 = this.g($$1);
      fby $$5 = $$3.b($$4.d * $$0, $$4.e * $$0, $$4.f * $$0);
      return this.dW().a(new dgq($$3, $$5, dgq.a.b, $$2 ? dgq.b.c : dgq.b.a, this));
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

   public void a(bvk $$0, int $$1, bua $$2) {
      if ($$0 instanceof asi) {
         ao.d.a((asi)$$0, this, $$2);
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

   public boolean d(ux $$0) {
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

   public boolean e(ux $$0) {
      return this.bZ() ? false : this.d($$0);
   }

   public ux f(ux $$0) {
      try {
         if (this.r != null) {
            $$0.a("Pos", this.a(this.r.dB(), this.dD(), this.r.dH()));
         } else {
            $$0.a("Pos", this.a(this.dB(), this.dD(), this.dH()));
         }

         fby $$1 = this.dz();
         $$0.a("Motion", this.a($$1.d, $$1.e, $$1.f));
         $$0.a("Rotation", this.a(this.dM(), this.dO()));
         $$0.a("FallDistance", this.Z);
         $$0.a("Fire", (short)this.aH);
         $$0.a("Air", (short)this.ct());
         $$0.a("OnGround", this.aJ());
         $$0.a("Invulnerable", this.aW);
         $$0.a("PortalCooldown", this.aV);
         $$0.a("UUID", this.cG());
         xv $$2 = this.an();
         if ($$2 != null) {
            $$0.a("CustomName", xv.a.a($$2, this.dY()));
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
            vd $$4 = new vd();

            for (String $$5 : this.aY) {
               $$4.add(vs.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.ca()) {
            vd $$6 = new vd();

            for (bvk $$7 : this.cZ()) {
               ux $$8 = new ux();
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

   public void g(ux $$0) {
      try {
         vd $$1 = $$0.c("Pos", 6);
         vd $$2 = $$0.c("Motion", 6);
         vd $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.n(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         this.ar = true;
         double $$7 = 3.0000512E7;
         this.o(bae.a($$1.h(0), -3.0000512E7, 3.0000512E7), bae.a($$1.h(1), -2.0E7, 2.0E7), bae.a($$1.h(2), -3.0000512E7, 3.0000512E7));
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
                  this.b(xv.a.a($$8, this.dY()));
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
               vd $$10 = $$0.c("Tags", 8);
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
      bvr<?> $$0 = this.aq();
      alz $$1 = bvr.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(ux var1);

   protected abstract void b(ux var1);

   protected vd a(double... $$0) {
      vd $$1 = new vd();

      for (double $$2 : $$0) {
         $$1.add(uy.a($$2));
      }

      return $$1;
   }

   protected vd a(float... $$0) {
      vd $$1 = new vd();

      for (float $$2 : $$0) {
         $$1.add(va.a($$2));
      }

      return $$1;
   }

   @Nullable
   public cmb a(ash $$0, dhh $$1) {
      return this.a($$0, $$1, 0);
   }

   @Nullable
   public cmb a(ash $$0, dhh $$1, int $$2) {
      return this.a($$0, new cxp($$1), (float)$$2);
   }

   @Nullable
   public cmb a(ash $$0, cxp $$1) {
      return this.a($$0, $$1, 0.0F);
   }

   @Nullable
   public cmb a(ash $$0, cxp $$1, float $$2) {
      if ($$1.f()) {
         return null;
      } else {
         cmb $$3 = new cmb($$0, this.dB(), this.dD() + (double)$$2, this.dH(), $$1);
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
         fbt $$1 = fbt.a(this.bF(), (double)$$0, 1.0E-6, (double)$$0);
         return jh.b($$1)
            .anyMatch(
               $$1x -> {
                  dxv $$2 = this.dW().a_($$1x);
                  return !$$2.l()
                     && $$2.j(this.dW(), $$1x)
                     && fcp.c($$2.g(this.dW(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), fcp.a($$1), fcc.i);
               }
            );
      }
   }

   public btj a(cpx $$0, bti $$1) {
      if (this.bL() && this instanceof bwe $$2) {
         if ($$2.A() == $$0) {
            if (!this.dW().B_()) {
               $$2.a(true, !$$0.fV());
               this.a(ecr.r, $$0);
            }

            return btj.a;
         }

         cxp $$3 = $$0.b($$1);
         if ($$3.a(cxt.vA) && $$2.Q_()) {
            if (!this.dW().B_()) {
               $$2.b($$0, true);
            }

            $$3.h(1);
            return btj.a;
         }
      }

      return btj.e;
   }

   public boolean i(bvk $$0) {
      return $$0.bN() && !this.z($$0);
   }

   public boolean bN() {
      return false;
   }

   public void r() {
      this.h(fby.c);
      this.h();
      if (this.bZ()) {
         this.dl().j(this);
      }
   }

   public final void j(bvk $$0) {
      if (this.y($$0)) {
         this.a($$0, bvk::a_);
      }
   }

   protected void a(bvk $$0, bvk.a $$1) {
      fby $$2 = this.m($$0);
      fby $$3 = $$0.l(this);
      $$1.accept($$0, $$2.d - $$3.d, $$2.e - $$3.e, $$2.f - $$3.f);
   }

   public void k(bvk $$0) {
   }

   public fby l(bvk $$0) {
      return this.dt().b(bvl.b, 0, this.aA);
   }

   public fby m(bvk $$0) {
      return this.du().e(this.a($$0, this.bb, 1.0F));
   }

   protected fby a(bvk $$0, bvn $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static fby a(bvk $$0, bvk $$1, bvm $$2) {
      int $$3 = $$0.cZ().indexOf($$1);
      return $$2.c(bvl.a, $$3, $$0.aA);
   }

   public boolean n(bvk $$0) {
      return this.a($$0, false);
   }

   public boolean bO() {
      return this instanceof bwg;
   }

   public boolean a(bvk $$0, boolean $$1) {
      if ($$0 == this.r) {
         return false;
      } else if (!$$0.bR()) {
         return false;
      } else if (!this.dW().B_() && !$$0.o.b()) {
         return false;
      } else {
         for (bvk $$2 = $$0; $$2.r != null; $$2 = $$2.r) {
            if ($$2.r == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bZ()) {
               this.ae();
            }

            this.b(bws.a);
            this.r = $$0;
            this.r.p(this);
            $$0.F().filter($$0x -> $$0x instanceof asi).forEach($$0x -> ao.U.a((asi)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bvk $$0) {
      return !this.cd() && this.J <= 0;
   }

   public void bP() {
      for (int $$0 = this.q.size() - 1; $$0 >= 0; $$0--) {
         ((bvk)this.q.get($$0)).ae();
      }
   }

   public void bQ() {
      if (this.r != null) {
         bvk $$0 = this.r;
         this.r = null;
         $$0.q(this);
      }
   }

   public void ae() {
      this.bQ();
   }

   protected void p(bvk $$0) {
      if ($$0.dl() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.q.isEmpty()) {
            this.q = ImmutableList.of($$0);
         } else {
            List<bvk> $$1 = Lists.newArrayList(this.q);
            if (!this.dW().C && $$0 instanceof cpx && !(this.da() instanceof cpx)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.q = ImmutableList.copyOf($$1);
         }

         this.a(ecr.s, $$0);
      }
   }

   protected void q(bvk $$0) {
      if ($$0.dl() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.q.size() == 1 && this.q.get(0) == $$0) {
            this.q = ImmutableList.of();
         } else {
            this.q = this.q.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(ecr.q, $$0);
      }
   }

   protected boolean r(bvk $$0) {
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

   public fby bT() {
      return this.d(this.dO(), this.dM());
   }

   public fby a(cxl $$0) {
      if (!(this instanceof cpx $$1)) {
         return fby.c;
      } else {
         boolean $$2 = $$1.fa().a($$0) && !$$1.eZ().a($$0);
         bwa $$3 = $$2 ? $$1.fy().e() : $$1.fy();
         return this.d(0.0F, this.dM() + (float)($$3 == bwa.b ? 80 : -80)).c(0.5);
      }
   }

   public fbx bU() {
      return new fbx(this.dO(), this.dM());
   }

   public fby bV() {
      return fby.a(this.bU());
   }

   public void a(dqh $$0, jh $$1) {
      if (this.aD()) {
         this.aB();
      } else {
         if (this.as == null || !this.as.a($$0)) {
            this.as = new bwr($$0, $$1.j());
         } else if (!this.as.e()) {
            this.as.a($$1.j());
            this.as.a(true);
         }
      }
   }

   protected void bW() {
      if (this.dW() instanceof ash $$0) {
         this.M();
         if (this.as != null) {
            if (this.as.a($$0, this, this.o(false))) {
               bpt $$2 = bps.a();
               $$2.a("portal");
               this.aB();
               eux $$3 = this.as.a($$0, this);
               if ($$3 != null) {
                  ash $$4 = $$3.b();
                  if ($$0.p().a((dhi)$$4) && ($$4.ah() == $$0.ah() || this.a($$0, $$4))) {
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
      bvk $$0 = this.da();
      return $$0 instanceof asi ? $$0.bX() : 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
   }

   public void c(bua $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            doi.a(this);
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
      return this.aq().a(axy.p);
   }

   public boolean cc() {
      return !this.aq().a(axy.q);
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
      return this.c(bws.f);
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
      return this.c(bws.d);
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

   public boolean d(cpx $$0) {
      if ($$0.aa_()) {
         return false;
      } else {
         fdf $$1 = this.cr();
         return $$1 != null && $$0 != null && $$0.cr() == $$1 && $$1.i() ? false : this.cp();
      }
   }

   public boolean cq() {
      return false;
   }

   public void a(BiConsumer<eco<?>, ash> $$0) {
   }

   @Nullable
   public fcy cr() {
      return this.dW().Q().e(this.cI());
   }

   public final boolean s(@Nullable bvk $$0) {
      return $$0 == null ? false : this == $$0 || this.t($$0) || $$0.t(this);
   }

   protected boolean t(bvk $$0) {
      return this.a($$0.cr());
   }

   public boolean a(@Nullable fdf $$0) {
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

   public void a(ash $$0, bwf $$1) {
      this.h(this.aH + 1);
      if (this.aH == 0) {
         this.d(8.0F);
      }

      this.a($$0, this.dX().c(), 5.0F);
   }

   public void l(boolean $$0) {
      fby $$1 = this.dz();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.e - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.e + 0.1);
      }

      this.n($$1.d, $$2, $$1.f);
   }

   public void m(boolean $$0) {
      fby $$1 = this.dz();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.e - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.e + 0.06);
      }

      this.n($$1.d, $$2, $$1.f);
      this.k();
   }

   public boolean a(ash $$0, bwg $$1) {
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
      jh $$3 = jh.a($$0, $$1, $$2);
      fby $$4 = new fby($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      jh.a $$5 = new jh.a();
      jm $$6 = jm.b;
      double $$7 = Double.MAX_VALUE;

      for (jm $$8 : new jm[]{jm.c, jm.d, jm.e, jm.f, jm.b}) {
         $$5.a($$3, $$8);
         if (!this.dW().a_($$5).m(this.dW(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == jm.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ae.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      fby $$13 = this.dz().c(0.75);
      if ($$6.o() == jm.a.a) {
         this.n((double)($$12 * $$11), $$13.e, $$13.f);
      } else if ($$6.o() == jm.a.b) {
         this.n($$13.d, (double)($$12 * $$11), $$13.f);
      } else if ($$6.o() == jm.a.c) {
         this.n($$13.d, $$13.e, (double)($$12 * $$11));
      }
   }

   public void a(dxv $$0, fby $$1) {
      this.k();
      this.U = $$1;
   }

   private static xv a(xv $$0) {
      yj $$1 = $$0.e().b($$0.a().a(null));

      for (xv $$2 : $$0.c()) {
         $$1.b(a($$2));
      }

      return $$1;
   }

   @Override
   public xv al() {
      xv $$0 = this.an();
      return $$0 != null ? a($$0) : this.cz();
   }

   protected xv cz() {
      return this.o.h();
   }

   public boolean u(bvk $$0) {
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

   public boolean v(bvk $$0) {
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

   protected final boolean d(bua $$0) {
      return this.dR() || this.aW && !$$0.a(axw.d) && !$$0.h() || $$0.a(axw.i) && this.bi() || $$0.a(axw.m) && this.aq().a(axy.o);
   }

   public boolean cC() {
      return this.aW;
   }

   public void n(boolean $$0) {
      this.aW = $$0;
   }

   public void w(bvk $$0) {
      this.b($$0.dB(), $$0.dD(), $$0.dH(), $$0.dM(), $$0.dO());
   }

   public void x(bvk $$0) {
      ux $$1 = $$0.f(new ux());
      $$1.r("Dimension");
      this.g($$1);
      this.aV = $$0.aV;
      this.as = $$0.as;
   }

   @Nullable
   public bvk b(eux $$0) {
      if (this.dW() instanceof ash $$1 && !this.dR()) {
         ash $$3 = $$0.b();
         boolean $$4 = $$3.ah() != $$1.ah();
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

   private bvk a(ash $$0, eux $$1) {
      for (bvk $$2 : this.cZ()) {
         $$2.b(this.a($$1, $$2));
      }

      bpt $$3 = bps.a();
      $$3.a("teleportSameDimension");
      this.a(bwt.a($$1), $$1.i());
      if (!$$1.h()) {
         this.a($$1);
      }

      $$1.j().onTransition(this);
      $$3.c();
      return this;
   }

   private bvk b(ash $$0, eux $$1) {
      List<bvk> $$2 = this.cZ();
      List<bvk> $$3 = new ArrayList<>($$2.size());
      this.bP();

      for (bvk $$4 : $$2) {
         bvk $$5 = $$4.b(this.a($$1, $$4));
         if ($$5 != null) {
            $$3.add($$5);
         }
      }

      bpt $$6 = bps.a();
      $$6.a("teleportCrossDimension");
      bvk $$7 = this.aq().a($$0, bvq.s);
      if ($$7 == null) {
         $$6.c();
         return null;
      } else {
         $$7.x(this);
         this.cD();
         $$7.a(bwt.a($$1), $$1.i());
         $$0.d($$7);

         for (bvk $$8 : $$3) {
            $$8.a($$7, true);
         }

         $$0.i();
         $$1.j().onTransition($$7);
         $$6.c();
         return $$7;
      }
   }

   private eux a(eux $$0, bvk $$1) {
      float $$2 = $$0.e() + ($$0.i().contains(bwu.d) ? 0.0F : $$1.dM() - this.dM());
      float $$3 = $$0.f() + ($$0.i().contains(bwu.e) ? 0.0F : $$1.dO() - this.dO());
      fby $$4 = $$1.du().d(this.du());
      fby $$5 = $$0.c().b($$0.i().contains(bwu.a) ? 0.0 : $$4.a(), $$0.i().contains(bwu.b) ? 0.0 : $$4.b(), $$0.i().contains(bwu.c) ? 0.0 : $$4.c());
      return $$0.a($$5).a($$2, $$3).a();
   }

   private void a(eux $$0) {
      bvk $$1 = this.cX();

      for (bvk $$2 : this.dd()) {
         if ($$2 instanceof asi) {
            asi $$3 = (asi)$$2;
            if ($$1 != null && $$3.ar() == $$1.ar()) {
               $$3.f.b(aha.a(this.ar(), bwt.a($$0), $$0.i(), this.aD));
            } else {
               $$3.f.b(aha.a(this.ar(), bwt.a(this), Set.of(), this.aD));
            }
         }
      }
   }

   public void a(bwt $$0, Set<bwu> $$1) {
      bwt $$2 = bwt.a(this);
      bwt $$3 = bwt.a($$2, $$0, $$1);
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

   public void f(jh $$0) {
      if (this.dW() instanceof ash $$1) {
         $$1.m().a(asn.e, new dgo($$0), 3, $$0);
      }
   }

   protected void cD() {
      this.c(bvk.d.e);
      if (this instanceof bwe $$0) {
         $$0.a(true, false);
      }
   }

   public fby a(jm.a $$0, l.a $$1) {
      return euw.a($$1, $$0, this.du(), this.a(this.aw()));
   }

   public boolean o(boolean $$0) {
      return ($$0 || !this.bZ()) && this.bL();
   }

   public boolean a(dhi $$0, dhi $$1) {
      if ($$0.ah() == dhi.k && $$1.ah() == dhi.i) {
         for (bvk $$2 : this.cZ()) {
            if ($$2 instanceof asi $$3 && !$$3.i) {
               return false;
            }
         }
      }

      return true;
   }

   public float a(dha $$0, dgn $$1, jh $$2, dxv $$3, etx $$4, float $$5) {
      return $$5;
   }

   public boolean a(dha $$0, dgn $$1, jh $$2, dxv $$3, float $$4) {
      return true;
   }

   public int cE() {
      return 3;
   }

   public boolean s_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bvr.a(this.aq()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.p);
      $$0.a("Entity Name", () -> this.al().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dB(), this.dD(), this.dH()));
      $$0.a("Entity's Block location", p.a(this.dW(), bae.a(this.dB()), bae.a(this.dD()), bae.a(this.dH())));
      fby $$1 = this.dz();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.d, $$1.e, $$1.f));
      $$0.a("Entity's Passengers", () -> this.cZ().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.dl()));
   }

   public boolean cF() {
      return this.bY() && !this.aa_();
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
   public xv p_() {
      return fcy.a(this.cr(), this.al()).a($$0 -> $$0.a(this.cQ()).a(this.cH()));
   }

   public void b(@Nullable xv $$0) {
      this.al.a(aO, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public xv an() {
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

   public boolean a(ash $$0, double $$1, double $$2, double $$3, Set<bwu> $$4, float $$5, float $$6, boolean $$7) {
      float $$8 = bae.a($$6, -90.0F, 90.0F);
      bvk $$9 = this.b(new eux($$0, new fby($$1, $$2, $$3), fby.c, $$5, $$8, $$4, eux.a));
      return $$9 != null;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dW() instanceof ash) {
         this.b($$0, $$1, $$2, this.dM(), this.dO());
         this.E();
      }
   }

   private void E() {
      this.db().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.q.iterator();

         while (var1.hasNext()) {
            bvk $$1 = (bvk)var1.next();
            $$0.a($$1, bvk::e);
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
   public void a(List<alg.c<?>> $$0) {
   }

   @Override
   public void a(alc<?> $$0) {
      if (aq.equals($$0)) {
         this.m_();
      }
   }

   @Deprecated
   protected void cN() {
      bws $$0 = this.aw();
      bvn $$1 = this.a($$0);
      this.bb = $$1;
      this.bc = $$1.c();
   }

   public void m_() {
      bvn $$0 = this.bb;
      bws $$1 = this.aw();
      bvn $$2 = this.a($$1);
      this.bb = $$2;
      this.bc = $$2.c();
      this.ay();
      boolean $$3 = $$2.a() <= 4.0F && $$2.b() <= 4.0F;
      if (!this.s.C && !this.ak && !this.ad && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cpx)) {
         this.a($$0);
      }
   }

   public boolean a(bvn $$0) {
      bvn $$1 = this.a(this.aw());
      fby $$2 = this.du().b(0.0, (double)$$0.b() / 2.0, 0.0);
      double $$3 = (double)Math.max(0.0F, $$1.a() - $$0.a()) + 1.0E-6;
      double $$4 = (double)Math.max(0.0F, $$1.b() - $$0.b()) + 1.0E-6;
      fcs $$5 = fcp.a(fbt.a($$2, $$3, $$4, $$3));
      Optional<fby> $$6 = this.s.a(this, $$5, $$2, (double)$$1.a(), (double)$$1.b(), (double)$$1.a());
      if ($$6.isPresent()) {
         this.b($$6.get().b(0.0, (double)(-$$1.b()) / 2.0, 0.0));
         return true;
      } else {
         if ($$1.a() > $$0.a() && $$1.b() > $$0.b()) {
            fcs $$7 = fcp.a(fbt.a($$2, $$3, 1.0E-6, $$3));
            Optional<fby> $$8 = this.s.a(this, $$7, $$2, (double)$$1.a(), (double)$$0.b(), (double)$$1.a());
            if ($$8.isPresent()) {
               this.b($$8.get().b(0.0, (double)(-$$0.b()) / 2.0 + 1.0E-6, 0.0));
               return true;
            }
         }

         return false;
      }
   }

   public jm cO() {
      return jm.a((double)this.dM());
   }

   public jm cP() {
      return this.cO();
   }

   protected yb cQ() {
      return new yb(yb.a.c, new yb.b(this.aq(), this.cG(), this.al()));
   }

   public boolean a(asi $$0) {
      return true;
   }

   @Override
   public final fbt cR() {
      return this.aC;
   }

   public final void a(fbt $$0) {
      this.aC = $$0;
   }

   public final float d(bws $$0) {
      return this.a($$0).c();
   }

   public final float cS() {
      return this.bc;
   }

   public fby s(float $$0) {
      return this.cT();
   }

   protected fby cT() {
      return new fby(0.0, (double)this.cS(), (double)(this.dr() * 0.4F));
   }

   public bwy a_(int $$0) {
      return bwy.a;
   }

   public dhi cU() {
      return this.dW();
   }

   @Nullable
   public MinecraftServer cV() {
      return this.dW().p();
   }

   public btj a(cpx $$0, fby $$1, bti $$2) {
      return btj.e;
   }

   public boolean a(dha $$0) {
      return false;
   }

   public void d(asi $$0) {
   }

   public void e(asi $$0) {
   }

   public float a(drc $$0) {
      float $$1 = bae.h(this.dM());
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

   public float a(dpl $$0) {
      float $$1 = bae.h(this.dM());
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

   public cqr a(cqq $$0) {
      return this.aq().a(axy.r) ? cqr.b : cqr.a;
   }

   @Nullable
   public bwg cX() {
      return null;
   }

   public final boolean cY() {
      return this.cX() != null;
   }

   public final List<bvk> cZ() {
      return this.q;
   }

   @Nullable
   public bvk da() {
      return this.q.isEmpty() ? null : (bvk)this.q.get(0);
   }

   public boolean y(bvk $$0) {
      return this.q.contains($$0);
   }

   public boolean a(Predicate<bvk> $$0) {
      UnmodifiableIterator var2 = this.q.iterator();

      while (var2.hasNext()) {
         bvk $$1 = (bvk)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bvk> F() {
      return this.q.stream().flatMap(bvk::db);
   }

   @Override
   public Stream<bvk> db() {
      return Stream.concat(Stream.of(this), this.F());
   }

   @Override
   public Stream<bvk> dc() {
      return Stream.concat(this.q.stream().flatMap(bvk::dc), Stream.of(this));
   }

   public Iterable<bvk> dd() {
      return () -> this.F().iterator();
   }

   public int de() {
      return (int)this.F().filter($$0 -> $$0 instanceof cpx).count();
   }

   public boolean df() {
      return this.de() == 1;
   }

   public bvk dg() {
      bvk $$0 = this;

      while ($$0.bZ()) {
         $$0 = $$0.dl();
      }

      return $$0;
   }

   public boolean z(bvk $$0) {
      return this.dg() == $$0.dg();
   }

   public boolean A(bvk $$0) {
      if (!$$0.bZ()) {
         return false;
      } else {
         bvk $$1 = $$0.dl();
         return $$1 == this ? true : this.A($$1);
      }
   }

   public boolean dh() {
      return this instanceof cpx $$0 ? $$0.c() : this.di();
   }

   public boolean di() {
      return this.cX() instanceof cpx $$0 ? $$0.c() : this.dk();
   }

   public boolean dj() {
      bwg $$0 = this.cX();
      return $$0 != null && $$0.dj();
   }

   public boolean dk() {
      return !this.dW().C;
   }

   protected static fby a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -bae.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = bae.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new fby((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public fby b(bwg $$0) {
      return new fby(this.dB(), this.cR().e, this.dH());
   }

   @Nullable
   public bvk dl() {
      return this.r;
   }

   @Nullable
   public bvk dm() {
      return this.r != null && this.r.cX() == this ? this.r : null;
   }

   public euc n_() {
      return euc.a;
   }

   public axg dn() {
      return axg.g;
   }

   protected int do() {
      return 1;
   }

   public ew d(ash $$0) {
      return new ew(ev.a, this.du(), this.bU(), $$0, 0, this.al().getString(), this.p_(), $$0.p(), this);
   }

   public void a(fi.a $$0, fby $$1) {
      fby $$2 = $$0.a(this);
      double $$3 = $$1.d - $$2.d;
      double $$4 = $$1.e - $$2.e;
      double $$5 = $$1.f - $$2.f;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.w(bae.h((float)(-(bae.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.v(bae.h((float)(bae.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.q(this.dM());
      this.O = this.dO();
      this.N = this.dM();
   }

   public float t(float $$0) {
      return bae.h($$0, this.N, this.aA);
   }

   public boolean a(ayk<etw> $$0, double $$1) {
      if (this.dp()) {
         return false;
      } else {
         fbt $$2 = this.cR().h(0.001);
         int $$3 = bae.a($$2.a);
         int $$4 = bae.c($$2.d);
         int $$5 = bae.a($$2.b);
         int $$6 = bae.c($$2.e);
         int $$7 = bae.a($$2.c);
         int $$8 = bae.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cJ();
         boolean $$11 = false;
         fby $$12 = fby.c;
         int $$13 = 0;
         jh.a $$14 = new jh.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  etx $$18 = this.dW().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a(this.dW(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           fby $$20 = $$18.c(this.dW(), $$14);
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

            if (!(this instanceof cpx)) {
               $$12 = $$12.d();
            }

            fby $$21 = this.dz();
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
      fbt $$0 = this.cR().g(1.0);
      int $$1 = bae.a($$0.a);
      int $$2 = bae.c($$0.d);
      int $$3 = bae.a($$0.c);
      int $$4 = bae.c($$0.f);
      return !this.dW().b($$1, $$3, $$2, $$4);
   }

   public double b(ayk<etw> $$0) {
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

   public aac<acr> a(asf $$0) {
      return new acs(this, $$0);
   }

   public bvn a(bws $$0) {
      return this.o.n();
   }

   public final bvm dt() {
      return this.bb.d();
   }

   public fby du() {
      return this.t;
   }

   public fby dv() {
      return this.du();
   }

   @Override
   public jh dw() {
      return this.u;
   }

   public dxv dx() {
      if (this.bh == null) {
         this.bh = this.dW().a_(this.dw());
      }

      return this.bh;
   }

   public dgo dy() {
      return this.ay;
   }

   public fby dz() {
      return this.az;
   }

   public void h(fby $$0) {
      this.az = $$0;
   }

   public void i(fby $$0) {
      this.h(this.dz().e($$0));
   }

   public void n(double $$0, double $$1, double $$2) {
      this.h(new fby($$0, $$1, $$2));
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
         this.t = new fby($$0, $$1, $$2);
         int $$3 = bae.a($$0);
         int $$4 = bae.a($$1);
         int $$5 = bae.a($$2);
         if ($$3 != this.u.u() || $$4 != this.u.v() || $$5 != this.u.w()) {
            this.u = new jh($$3, $$4, $$5);
            this.bh = null;
            if (kj.a($$3) != this.ay.h || kj.a($$5) != this.ay.i) {
               this.ay = new dgo(this.u);
            }
         }

         this.aT.a();
      }
   }

   public void dI() {
   }

   public fby u(float $$0) {
      return this.o($$0).b(0.0, (double)this.bc * 0.7, 0.0);
   }

   public void a(acs $$0) {
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
   public cxp dJ() {
      return null;
   }

   public void q(boolean $$0) {
      this.av = $$0;
   }

   public boolean dK() {
      return !this.aq().a(axy.k);
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
         ae.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aA = $$0;
      }
   }

   public float dO() {
      return this.aB;
   }

   public void w(float $$0) {
      if (!Float.isFinite($$0)) {
         ae.b("Invalid entity rotation: " + $$0 + ", discarding.");
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

   public void b_(@Nullable bvk $$0) {
   }

   public final boolean dR() {
      return this.aE != null;
   }

   @Nullable
   public bvk.d dS() {
      return this.aE;
   }

   @Override
   public final void c(bvk.d $$0) {
      if (this.aE == null) {
         this.aE = $$0;
      }

      if (this.aE.a()) {
         this.ae();
      }

      this.cZ().forEach(bvk::ae);
      this.aT.a($$0);
      this.b($$0);
   }

   protected void dT() {
      this.aE = null;
   }

   @Override
   public void a(ebz $$0) {
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

   public boolean c(ash $$0, jh $$1) {
      return true;
   }

   public dhi dW() {
      return this.s;
   }

   protected void a(dhi $$0) {
      this.s = $$0;
   }

   public bub dX() {
      return this.dW().aj();
   }

   public ke dY() {
      return this.dW().K_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = bae.d($$6, this.dB(), $$1);
      double $$8 = bae.d($$6, this.dD(), $$2);
      double $$9 = bae.d($$6, this.dH(), $$3);
      float $$10 = (float)bae.e($$6, (double)this.dM(), $$4);
      float $$11 = (float)bae.d($$6, (double)this.dO(), $$5);
      this.a_($$7, $$8, $$9);
      this.b($$10, $$11);
   }

   public bam dZ() {
      return this.ae;
   }

   public fby ah() {
      if (this.cX() instanceof cpx $$0 && this.bL()) {
         return $$0.ah();
      }

      return this.dz();
   }

   @Nullable
   public cxp ea() {
      return null;
   }

   public Optional<aly<ewu>> eb() {
      return this.o.k();
   }

   @FunctionalInterface
   public interface a {
      void accept(bvk var1, double var2, double var4, double var6);
   }

   static record b(fby a, fby b) {
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
