import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleListIterator;
import it.unimi.dsi.fastutil.floats.FloatArraySet;
import it.unimi.dsi.fastutil.floats.FloatArrays;
import it.unimi.dsi.fastutil.floats.FloatSet;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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

public abstract class bwt implements ako, buu, efj, fgu, kf {
   public static final String v = "id";
   public static final String w = "Passengers";
   private static final AtomicInteger b = new AtomicInteger();
   public static final int x = 0;
   public static final int y = 60;
   public static final int z = 300;
   public static final int A = 1024;
   private static final Codec<List<String>> c = Codec.STRING.sizeLimitedListOf(1024);
   public static final float B = 0.2F;
   public static final double C = 0.500001;
   public static final double D = 0.999999;
   public static final int E = 140;
   public static final int F = 40;
   public static final int G = 3;
   private static final ImmutableList<jb.a> d = ImmutableList.of(jb.a.b, jb.a.a, jb.a.c);
   private static final ImmutableList<jb.a> e = ImmutableList.of(jb.a.b, jb.a.c, jb.a.a);
   private static final ffl m = new ffl(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double n = 0.014;
   private static final double o = 0.007;
   private static final double p = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double q = 1.0;
   private final bxc<?> r;
   private int s = b.incrementAndGet();
   public boolean I;
   private ImmutableList<bwt> t = ImmutableList.of();
   protected int J;
   @Nullable
   private bwt u;
   private djx ay;
   public double K;
   public double L;
   public double M;
   private ffq az;
   private iv aA;
   private djc aB;
   private ffq aC = ffq.c;
   private float aD;
   private float aE;
   public float N;
   public float O;
   private ffl aF = m;
   private boolean aG;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected ffq U = ffq.c;
   @Nullable
   private bwt.d aH;
   public static final float V = 0.6F;
   public static final float W = 1.8F;
   public float X;
   public float Y;
   public double Z;
   private float aI = 1.0F;
   public double aa;
   public double ab;
   public double ac;
   public boolean ad;
   protected final azx ae = azx.a();
   public int af;
   private int aJ = -this.dn();
   protected boolean ag;
   protected Object2DoubleMap<axt<exn>> ah = new Object2DoubleArrayMap(2);
   protected boolean ai;
   private final Set<axt<exn>> aK = new HashSet<>();
   public int aj;
   protected boolean ak = true;
   protected final akp al;
   protected static final akl<Byte> am = akp.a(bwt.class, akn.a);
   protected static final int an = 0;
   private static final int aL = 1;
   private static final int aM = 3;
   private static final int aN = 4;
   private static final int aO = 5;
   protected static final int ao = 6;
   protected static final int ap = 7;
   private static final akl<Integer> aP = akp.a(bwt.class, akn.b);
   private static final akl<Optional<xa>> aQ = akp.a(bwt.class, akn.g);
   private static final akl<Boolean> aR = akp.a(bwt.class, akn.k);
   private static final akl<Boolean> aS = akp.a(bwt.class, akn.k);
   private static final akl<Boolean> aT = akp.a(bwt.class, akn.k);
   protected static final akl<byg> aq = akp.a(bwt.class, akn.w);
   private static final akl<Integer> aU = akp.a(bwt.class, akn.b);
   private efk aV = efk.a;
   private final aiv aW = new aiv();
   public boolean ar;
   @Nullable
   public byf as;
   private int aX;
   private boolean aY;
   protected UUID at = azo.a(this.ae);
   protected String au = this.at.toString();
   private boolean aZ;
   private final Set<String> ba = Sets.newHashSet();
   private final double[] bb = new double[]{0.0, 0.0, 0.0};
   private long bc;
   private bww bd;
   private float be;
   public boolean av;
   public boolean aw;
   public Optional<iv> ax = Optional.empty();
   private boolean bf = false;
   private float bg;
   private int bh;
   private boolean bi;
   @Nullable
   private ebe bj = null;
   private final List<List<bwt.b>> bk = new ObjectArrayList();
   private final List<bwt.b> bl = new ObjectArrayList();
   private final LongSet bm = new LongOpenHashSet();
   private final bxm.a bn = new bxm.a();

   public bwt(bxc<?> $$0, djx $$1) {
      this.r = $$0;
      this.ay = $$1;
      this.bd = $$0.n();
      this.az = ffq.c;
      this.aA = iv.c;
      this.aB = djc.e;
      akp.a $$2 = new akp.a(this);
      $$2.a(am, (byte)0);
      $$2.a(aP, this.cr());
      $$2.a(aR, false);
      $$2.a(aQ, Optional.empty());
      $$2.a(aS, false);
      $$2.a(aT, false);
      $$2.a(aq, byg.a);
      $$2.a(aU, 0);
      this.a($$2);
      this.al = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.be = this.bd.c();
   }

   public boolean a(iv $$0, ebe $$1) {
      fgk $$2 = $$1.b(this.dV(), $$0, ffv.a(this)).a($$0);
      return fgh.c($$2, fgh.a(this.cR()), ffu.i);
   }

   public int f_() {
      fgx $$0 = this.cq();
      return $$0 != null && $$0.o().f() != null ? $$0.o().f() : 16777215;
   }

   public boolean Z_() {
      return false;
   }

   public final void al() {
      if (this.bZ()) {
         this.bN();
      }

      if (this.bY()) {
         this.bO();
      }
   }

   public void e(double $$0, double $$1, double $$2) {
      this.aW.e(new ffq($$0, $$1, $$2));
   }

   public aiv am() {
      return this.aW;
   }

   public bxc<?> an() {
      return this.r;
   }

   @Override
   public int ao() {
      return this.s;
   }

   public void e(int $$0) {
      this.s = $$0;
   }

   public Set<String> ap() {
      return this.ba;
   }

   public boolean a(String $$0) {
      return this.ba.size() >= 1024 ? false : this.ba.add($$0);
   }

   public boolean b(String $$0) {
      return this.ba.remove($$0);
   }

   public void c(ars $$0) {
      this.a(bwt.d.a);
      this.a(ege.p);
   }

   public final void aq() {
      this.a(bwt.d.b);
   }

   protected abstract void a(akp.a var1);

   public akp ar() {
      return this.al;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bwt ? ((bwt)$$0).s == this.s : false;
   }

   @Override
   public int hashCode() {
      return this.s;
   }

   public void a(bwt.d $$0) {
      this.c($$0);
   }

   public void as() {
   }

   public void b(bwt.d $$0) {
   }

   public void b(byg $$0) {
      this.al.a(aq, $$0);
   }

   public byg at() {
      return this.al.a(aq);
   }

   public boolean c(byg $$0) {
      return this.at() == $$0;
   }

   public boolean a(bwt $$0, double $$1) {
      return this.dt().a((jp)$$0.dt(), $$1);
   }

   public boolean a(bwt $$0, double $$1, double $$2) {
      double $$3 = $$0.dA() - this.dA();
      double $$4 = $$0.dC() - this.dC();
      double $$5 = $$0.dG() - this.dG();
      return azo.e($$3, $$5) < azo.k($$1) && azo.k($$4) < azo.k($$2);
   }

   protected void b(float $$0, float $$1) {
      this.w($$0 % 360.0F);
      this.x($$1 % 360.0F);
   }

   public final void b(ffq $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      this.a(this.au());
   }

   protected final ffl au() {
      return this.c(this.az);
   }

   protected ffl c(ffq $$0) {
      return this.bd.a($$0);
   }

   protected void av() {
      this.a_(this.az.d, this.az.e, this.az.f);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.x(this.dN() + $$2);
      this.w(this.dL() + $$3);
      this.x(azo.a(this.dN(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = azo.a(this.O, -90.0F, 90.0F);
      if (this.u != null) {
         this.u.k(this);
      }
   }

   public void h() {
      this.aw();
   }

   public void aw() {
      brb $$0 = bra.a();
      $$0.a("entityBaseTick");
      this.bj = null;
      if (this.bY() && this.dk().dQ()) {
         this.bO();
      }

      if (this.J > 0) {
         this.J--;
      }

      this.bV();
      if (this.bt()) {
         this.bu();
      }

      this.aw = this.av;
      this.av = false;
      this.bo();
      this.o();
      this.bn();
      if (this.dV() instanceof ars $$1) {
         if (this.aJ > 0) {
            if (this.bh()) {
               this.h(this.aJ - 4);
               if (this.aJ < 0) {
                  this.aF();
               }
            } else {
               if (this.aJ % 20 == 0 && !this.bv()) {
                  this.a($$1, this.dW().d(), 1.0F);
               }

               this.h(this.aJ - 1);
            }
         }
      } else {
         this.aF();
      }

      if (this.bv()) {
         this.Z *= 0.5;
      }

      this.ax();
      if (!this.dV().C) {
         this.c(this.aJ > 0);
      }

      this.ak = false;
      if (this.dV() instanceof ars $$2 && this instanceof bxs) {
         bxs.a_($$2, (bwt)((bxs)this));
      }

      $$0.c();
   }

   public void c(boolean $$0) {
      this.b(0, $$0 || this.bi);
   }

   public void ax() {
      if (this.dC() < (double)(this.dV().K_() - 64)) {
         this.aG();
      }
   }

   public void ay() {
      this.aX = this.bW();
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
      if (!this.bh()) {
         this.e(15.0F);
      }
   }

   public void aC() {
      if (!this.bh()) {
         if (this.dV() instanceof ars $$0 && this.a($$0, this.dW().e(), 4.0F) && this.aD() && !this.ba()) {
            $$0.a(null, this.dA(), this.dC(), this.dG(), awp.kE, this.dm(), 0.4F, 2.0F + this.ae.i() * 0.4F);
         }
      }
   }

   protected boolean aD() {
      return true;
   }

   public final void e(float $$0) {
      this.g(azo.d($$0 * 20.0F));
   }

   public void g(int $$0) {
      if (this.aJ < $$0) {
         this.h($$0);
      }

      this.ct();
   }

   public void h(int $$0) {
      this.aJ = $$0;
   }

   public int aE() {
      return this.aJ;
   }

   public void aF() {
      this.h(0);
   }

   protected void aG() {
      this.aq();
   }

   public boolean f(double $$0, double $$1, double $$2) {
      return this.b(this.cR().d($$0, $$1, $$2));
   }

   private boolean b(ffl $$0) {
      return this.dV().a(this, $$0) && !this.dV().d($$0);
   }

   public void d(boolean $$0) {
      this.aG = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, ffq $$1) {
      this.a($$0, this.P, $$1);
   }

   public void a(boolean $$0, boolean $$1, ffq $$2) {
      this.aG = $$0;
      this.P = $$1;
      this.b($$0, $$2);
   }

   public boolean d(iv $$0) {
      return this.ax.isPresent() && this.ax.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable ffq $$1) {
      if ($$0) {
         ffl $$2 = this.cR();
         ffl $$3 = new ffl($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<iv> $$4 = this.ay.h(this, $$3);
         if ($$4.isPresent() || this.bf) {
            this.ax = $$4;
         } else if ($$1 != null) {
            ffl $$5 = $$3.d(-$$1.d, 0.0, -$$1.f);
            $$4 = this.ay.h(this, $$5);
            this.ax = $$4;
         }

         this.bf = $$4.isEmpty();
      } else {
         this.bf = false;
         if (this.ax.isPresent()) {
            this.ax = Optional.empty();
         }
      }
   }

   public boolean aH() {
      return this.aG;
   }

   public void a(bxy $$0, ffq $$1) {
      if (this.ad) {
         this.a_(this.dA() + $$1.d, this.dC() + $$1.e, this.dG() + $$1.f);
      } else {
         if ($$0 == bxy.c) {
            $$1 = this.e($$1);
            if ($$1.equals(ffq.c)) {
               return;
            }
         }

         brb $$2 = bra.a();
         $$2.a("move");
         if (this.U.h() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = ffq.c;
            this.i(ffq.c);
         }

         $$1 = this.a($$1, $$0);
         ffq $$3 = this.a($$1);
         double $$4 = $$3.h();
         if ($$4 > 1.0E-7 || $$1.h() - $$4 < 1.0E-7) {
            if (this.Z != 0.0 && $$4 >= 1.0) {
               ffm $$5 = this.dV().a(new dje(this.dt(), this.dt().e($$3), dje.a.d, dje.b.d, this));
               if ($$5.d() != ffo.a.a) {
                  this.k();
               }
            }

            ffq $$6 = this.dt();
            List<bwt.b> $$7 = new ObjectArrayList();

            for (jb.a $$8 : k($$3)) {
               double $$9 = $$3.a($$8);
               if ($$9 != 0.0) {
                  ffq $$10 = $$6.a($$8.e(), $$9);
                  $$7.add(new bwt.b($$6, $$10));
                  $$6 = $$10;
               }
            }

            this.bk.add($$7);
            this.b($$6);
         }

         $$2.c();
         $$2.a("rest");
         boolean $$11 = !azo.b($$1.d, $$3.d);
         boolean $$12 = !azo.b($$1.f, $$3.f);
         this.P = $$11 || $$12;
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

         iv $$13 = this.aO();
         ebe $$14 = this.dV().a_($$13);
         if (this.dg()) {
            this.a($$3.e, this.aH(), $$14, $$13);
         }

         if (this.dQ()) {
            $$2.c();
         } else {
            if (this.P) {
               ffq $$15 = this.dy();
               this.n($$11 ? 0.0 : $$15.d, $$15.e, $$12 ? 0.0 : $$15.f);
            }

            if (this.di()) {
               dnc $$16 = $$14.b();
               if ($$1.e != $$3.e) {
                  $$16.a(this.dV(), this);
               }
            }

            if (!this.dV().A_() || this.dg()) {
               bwt.c $$17 = this.bf();
               if ($$17.a() && !this.bY()) {
                  this.a($$17, $$3, $$13, $$14);
               }
            }

            float $$18 = this.aS();
            this.i(this.dy().d((double)$$18, 1.0, (double)$$18));
            $$2.c();
         }
      }
   }

   private void a(bwt.c $$0, ffq $$1, iv $$2, ebe $$3) {
      float $$4 = 0.6F;
      float $$5 = (float)($$1.g() * 0.6F);
      float $$6 = (float)($$1.i() * 0.6F);
      iv $$7 = this.aQ();
      ebe $$8 = this.dV().a_($$7);
      boolean $$9 = this.c($$8);
      this.X += $$9 ? $$5 : $$6;
      this.Y += $$5;
      if (this.X > this.aI && !$$8.l()) {
         boolean $$10 = $$7.equals($$2);
         boolean $$11 = this.a($$2, $$3, $$0.c(), $$10, $$1);
         if (!$$10) {
            $$11 |= this.a($$7, $$8, false, $$0.b(), $$1);
         }

         if ($$11) {
            this.aI = this.aT();
         } else if (this.bi()) {
            this.aI = this.aT();
            if ($$0.c()) {
               this.aX();
            }

            if ($$0.b()) {
               this.a(ege.Q);
            }
         }
      } else if ($$8.l()) {
         this.aN();
      }
   }

   protected void aI() {
      this.bl.clear();
      this.bk.forEach(this.bl::addAll);
      this.bk.clear();
      if (this.bl.isEmpty()) {
         this.bl.add(new bwt.b(this.bA(), this.dt()));
      } else if (this.bl.getLast().b.g(this.dt()) > 9.9999994E-11F) {
         this.bl.add(new bwt.b(this.bl.getLast().b, this.dt()));
      }

      this.b(this.bl);
   }

   public void aJ() {
      this.bk.removeLast();
   }

   protected void a(ffq $$0, ffq $$1) {
      this.b(List.of(new bwt.b($$0, $$1)));
   }

   private void b(List<bwt.b> $$0) {
      if (this.aK()) {
         if (this.aH()) {
            iv $$1 = this.aO();
            ebe $$2 = this.dV().a_($$1);
            $$2.b().a(this.dV(), $$1, $$2, this);
         }

         boolean $$3 = this.bX();
         boolean $$4 = this.dK();
         this.a($$0, this.bn);
         this.bn.a(this);
         if ($$3 && !this.bX() || $$4 && !this.dK()) {
            this.aL();
         }

         if ($$3 && !this.bX() && this.aJ <= 0) {
            this.h(-this.dn());
         }
      }
   }

   protected boolean aK() {
      return !this.dQ() && !this.ad;
   }

   private boolean c(ebe $$0) {
      return $$0.a(axe.aS) || $$0.a(dne.rx);
   }

   private boolean a(iv $$0, ebe $$1, boolean $$2, boolean $$3, ffq $$4) {
      if ($$1.l()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aH() || $$5 || this.ch() && $$4.e == 0.0 || this.cp()) && !this.cj()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dV().a(ege.P, this.dt(), ege.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean d(ffq $$0) {
      return false;
   }

   protected void aL() {
      if (!this.ay.A_()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awp.kJ, this.dm(), 0.7F, 1.6F + (this.ae.i() - this.ae.i()) * 0.4F);
      }
   }

   public void aM() {
      if (this.bX()) {
         this.aL();
      }

      this.aF();
   }

   protected void aN() {
      if (this.aZ()) {
         this.aY();
         if (this.bf().b()) {
            this.a(ege.x);
         }
      }
   }

   @Deprecated
   public iv aO() {
      return this.f(0.2F);
   }

   public iv aP() {
      return this.f(0.500001F);
   }

   public iv aQ() {
      return this.f(1.0E-5F);
   }

   protected iv f(float $$0) {
      if (this.ax.isPresent()) {
         iv $$1 = this.ax.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            ebe $$2 = this.dV().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(axe.U)) && !$$2.a(axe.N) && !($$2.b() instanceof dqd) ? $$1.h(azo.a(this.az.e - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = azo.a(this.az.d);
         int $$4 = azo.a(this.az.e - (double)$$0);
         int $$5 = azo.a(this.az.f);
         return new iv($$3, $$4, $$5);
      }
   }

   protected float aR() {
      float $$0 = this.dV().a_(this.dv()).b().j();
      float $$1 = this.dV().a_(this.aP()).b().j();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aS() {
      ebe $$0 = this.dV().a_(this.dv());
      float $$1 = $$0.b().i();
      if (!$$0.a(dne.J) && !$$0.a(dne.nJ)) {
         return (double)$$1 == 1.0 ? this.dV().a_(this.aP()).b().i() : $$1;
      } else {
         return $$1;
      }
   }

   protected ffq a(ffq $$0, bxy $$1) {
      return $$0;
   }

   protected ffq e(ffq $$0) {
      if ($$0.h() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dV().ae();
         if ($$1 != this.bc) {
            Arrays.fill(this.bb, 0.0);
            this.bc = $$1;
         }

         if ($$0.d != 0.0) {
            double $$2 = this.a(jb.a.a, $$0.d);
            return Math.abs($$2) <= 1.0E-5F ? ffq.c : new ffq($$2, 0.0, 0.0);
         } else if ($$0.e != 0.0) {
            double $$3 = this.a(jb.a.b, $$0.e);
            return Math.abs($$3) <= 1.0E-5F ? ffq.c : new ffq(0.0, $$3, 0.0);
         } else if ($$0.f != 0.0) {
            double $$4 = this.a(jb.a.c, $$0.f);
            return Math.abs($$4) <= 1.0E-5F ? ffq.c : new ffq(0.0, 0.0, $$4);
         } else {
            return ffq.c;
         }
      }
   }

   private double a(jb.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = azo.a($$1 + this.bb[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bb[$$2];
      this.bb[$$2] = $$3;
      return $$1;
   }

   private ffq a(ffq $$0) {
      ffl $$1 = this.cR();
      List<fgk> $$2 = this.dV().c(this, $$1.b($$0));
      ffq $$3 = $$0.h() == 0.0 ? $$0 : a(this, $$0, $$1, this.dV(), $$2);
      boolean $$4 = $$0.d != $$3.d;
      boolean $$5 = $$0.e != $$3.e;
      boolean $$6 = $$0.f != $$3.f;
      boolean $$7 = $$5 && $$0.e < 0.0;
      if (this.dP() > 0.0F && ($$7 || this.aH()) && ($$4 || $$6)) {
         ffl $$8 = $$7 ? $$1.d(0.0, $$3.e, 0.0) : $$1;
         ffl $$9 = $$8.b($$0.d, (double)this.dP(), $$0.f);
         if (!$$7) {
            $$9 = $$9.b(0.0, -1.0E-5F, 0.0);
         }

         List<fgk> $$10 = a(this, this.ay, $$2, $$9);
         float $$11 = (float)$$3.e;
         float[] $$12 = a($$8, $$10, this.dP(), $$11);

         for (float $$13 : $$12) {
            ffq $$14 = a(new ffq($$0.d, (double)$$13, $$0.f), $$8, $$10);
            if ($$14.j() > $$3.j()) {
               double $$15 = $$1.b - $$8.b;
               return $$14.a(0.0, $$15, 0.0);
            }
         }
      }

      return $$3;
   }

   private static float[] a(ffl $$0, List<fgk> $$1, float $$2, float $$3) {
      FloatSet $$4 = new FloatArraySet(4);

      for (fgk $$5 : $$1) {
         DoubleList $$6 = $$5.a(jb.a.b);
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

   public static ffq a(@Nullable bwt $$0, ffq $$1, ffl $$2, djx $$3, List<fgk> $$4) {
      List<fgk> $$5 = a($$0, $$3, $$4, $$2.b($$1));
      return a($$1, $$2, $$5);
   }

   private static List<fgk> a(@Nullable bwt $$0, djx $$1, List<fgk> $$2, ffl $$3) {
      Builder<fgk> $$4 = ImmutableList.builderWithExpectedSize($$2.size() + 1);
      if (!$$2.isEmpty()) {
         $$4.addAll($$2);
      }

      ecw $$5 = $$1.E_();
      boolean $$6 = $$0 != null && $$5.a($$0, $$3);
      if ($$6) {
         $$4.add($$5.c());
      }

      $$4.addAll($$1.e($$0, $$3));
      return $$4.build();
   }

   private static ffq a(ffq $$0, ffl $$1, List<fgk> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         ffq $$3 = ffq.c;

         for (jb.a $$4 : k($$0)) {
            double $$5 = $$0.a($$4);
            if ($$5 != 0.0) {
               double $$6 = fgh.a($$4, $$1.c($$3), $$2, $$5);
               $$3 = $$3.a($$4, $$6);
            }
         }

         return $$3;
      }
   }

   private static Iterable<jb.a> k(ffq $$0) {
      return Math.abs($$0.d) < Math.abs($$0.f) ? e : d;
   }

   protected float aT() {
      return (float)((int)this.X + 1);
   }

   protected awo aU() {
      return awp.kN;
   }

   protected awo aV() {
      return awp.kM;
   }

   protected awo aW() {
      return awp.kM;
   }

   private void a(List<bwt.b> $$0, bxm.a $$1) {
      if (this.aK()) {
         LongSet $$2 = this.bm;

         for (bwt.b $$3 : $$0) {
            ffq $$4 = $$3.a();
            ffq $$5 = $$3.b();
            ffl $$6 = this.c($$5).h(1.0E-5F);
            djb.a($$4, $$5, $$6, ($$4x, $$5x) -> {
               if (this.bJ()) {
                  ebe $$6x = this.dV().a_($$4x);
                  if (!$$6x.l()) {
                     if ($$2.add($$4x.a())) {
                        fgk $$7 = $$6x.a(this.dV(), $$4x, this);
                        boolean $$8 = $$7 == fgh.b() || this.a($$4, $$5, $$7.a(new ffq($$4x)).e());
                        if ($$8) {
                           try {
                              $$1.a($$5x);
                              $$6x.a(this.dV(), $$4x, this, $$1);
                              this.a($$6x);
                           } catch (Throwable var14) {
                              p $$10 = p.a(var14, "Colliding entity with block");
                              q $$11 = $$10.a("Block being collided with");
                              q.a($$11, this.dV(), $$4x, $$6x);
                              q $$12 = $$10.a("Entity being checked for collision");
                              this.a($$12);
                              throw new aa($$10);
                           }
                        }

                        boolean $$13 = this.a($$6x.y(), $$4x, $$4, $$5);
                        if ($$13) {
                           $$1.a($$5x);
                           $$6x.y().a(this.dV(), $$4x, this, $$1);
                        }
                     }
                  }
               }
            });
         }

         $$2.clear();
      }
   }

   private boolean a(exo $$0, iv $$1, ffq $$2, ffq $$3) {
      ffl $$4 = $$0.e(this.dV(), $$1);
      return $$4 != null && this.a($$2, $$3, List.of($$4));
   }

   private boolean a(ffq $$0, ffq $$1, List<ffl> $$2) {
      ffl $$3 = this.c($$0);
      ffq $$4 = $$1.d($$0);
      return $$3.a($$4, $$2);
   }

   protected void a(ebe $$0) {
   }

   public iv a(ars $$0, iv $$1) {
      iv $$2 = $$0.aa();
      ffq $$3 = $$2.b();
      int $$4 = $$0.m($$2).a(ehd.a.f, $$2.u(), $$2.w()) + 1;
      return iv.a($$3.d, (double)$$4, $$3.f);
   }

   public void a(jf<ege> $$0, @Nullable bwt $$1) {
      this.dV().a($$1, $$0, this.az);
   }

   public void a(jf<ege> $$0) {
      this.a($$0, this);
   }

   private void c(iv $$0, ebe $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.j();
      }
   }

   protected void aX() {
      bwt $$0 = Objects.requireNonNullElse(this.cW(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      ffq $$2 = $$0.dy();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      this.g($$3);
   }

   protected iv e(iv $$0) {
      iv $$1 = $$0.d();
      ebe $$2 = this.dV().a_($$1);
      return !$$2.a(axe.bq) && !$$2.a(axe.br) ? $$0 : $$1;
   }

   protected void a(ebe $$0, ebe $$1) {
      duz $$2 = $$0.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(ebe $$0) {
      duz $$1 = $$0.A();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(iv $$0, ebe $$1) {
      duz $$2 = $$1.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(ebe $$0) {
      return $$0.a(axe.bp) && this.af >= this.bh + 20;
   }

   private void j() {
      this.bg = this.bg * (float)Math.pow(0.997, (double)(this.af - this.bh));
      this.bg = Math.min(1.0F, this.bg + 0.07F);
      float $$0 = 0.5F + this.bg * this.ae.i() * 1.2F;
      float $$1 = 0.1F + this.bg * 1.2F;
      this.a(awp.E, $$1, $$0);
      this.bh = this.af;
   }

   protected void g(float $$0) {
      this.a(this.aU(), $$0, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
   }

   protected void aY() {
   }

   protected boolean aZ() {
      return false;
   }

   public void a(awo $$0, float $$1, float $$2) {
      if (!this.ba()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), $$0, this.dm(), $$1, $$2);
      }
   }

   public void a(awo $$0) {
      if (!this.ba()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean ba() {
      return this.al.a(aS);
   }

   public void e(boolean $$0) {
      this.al.a(aS, $$0);
   }

   public boolean bb() {
      return this.al.a(aT);
   }

   public void f(boolean $$0) {
      this.al.a(aT, $$0);
   }

   protected double bc() {
      return 0.0;
   }

   public final double bd() {
      return this.bb() ? 0.0 : this.bc();
   }

   protected void be() {
      double $$0 = this.bd();
      if ($$0 != 0.0) {
         this.i(this.dy().b(0.0, -$$0, 0.0));
      }
   }

   protected bwt.c bf() {
      return bwt.c.d;
   }

   public boolean bg() {
      return false;
   }

   public final void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.do()) {
         this.b($$3, new ffq($$0, $$1, $$2));
         iv $$4 = this.aO();
         ebe $$5 = this.dV().a_($$4);
         this.a($$1, $$3, $$5, $$4);
      }
   }

   protected void a(double $$0, boolean $$1, ebe $$2, iv $$3) {
      if (!this.bi() && $$0 < 0.0) {
         this.Z -= (double)((float)$$0);
      }

      if ($$1) {
         if (this.Z > 0.0) {
            $$2.b().a(this.dV(), $$2, $$3, this, this.Z);
            this.dV().a(ege.A, this.az, ege.a.a(this, this.ax.<ebe>map($$0x -> this.dV().a_($$0x)).orElse($$2)));
         }

         this.k();
      }
   }

   public boolean bh() {
      return this.an().d();
   }

   public boolean a(double $$0, float $$1, bvi $$2) {
      if (this.r.a(axh.o)) {
         return false;
      } else {
         this.b($$0, $$1, $$2);
         return false;
      }
   }

   protected void b(double $$0, float $$1, bvi $$2) {
      if (this.bZ()) {
         for (bwt $$3 : this.cY()) {
            $$3.a($$0, $$1, $$2);
         }
      }
   }

   public boolean bi() {
      return this.ag;
   }

   boolean bj() {
      iv $$0 = this.dv();
      return this.dV().r($$0) || this.dV().r(iv.a((double)$$0.u(), this.cR().e, (double)$$0.w()));
   }

   public boolean bk() {
      return this.bi() || this.bj();
   }

   public boolean bl() {
      return this.bi() || this.bv();
   }

   public boolean bm() {
      return this.ai && this.bi();
   }

   public void bn() {
      if (this.cj()) {
         this.i(this.ci() && this.bi() && !this.bY());
      } else {
         this.i(this.ci() && this.bm() && !this.bY() && this.dV().b_(this.aA).a(axj.a));
      }
   }

   protected boolean bo() {
      this.ah.clear();
      this.bp();
      double $$0 = this.dV().F_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(axj.b, $$0);
      return this.bi() || $$1;
   }

   void bp() {
      if (this.dk() instanceof cui $$0 && !$$0.bm()) {
         this.ag = false;
         return;
      }

      if (this.a(axj.a, 0.014)) {
         if (!this.ag && !this.ak) {
            this.bq();
         }

         this.k();
         this.ag = true;
      } else {
         this.ag = false;
      }
   }

   private void o() {
      this.ai = this.a(axj.a);
      this.aK.clear();
      double $$0 = this.dE();
      if (this.dk() instanceof cui $$2 && !$$2.bm() && $$2.cR().e >= $$0 && $$2.cR().b <= $$0) {
         return;
      }

      iv $$3 = iv.a(this.dA(), $$0, this.dG());
      exo $$4 = this.dV().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a(this.dV(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aK::add);
      }
   }

   protected void bq() {
      bwt $$0 = Objects.requireNonNullElse(this.cW(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      ffq $$2 = $$0.dy();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aV(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      } else {
         this.a(this.aW(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      }

      float $$4 = (float)azo.a(this.dC());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bd.a() * 20.0F; $$5++) {
         double $$6 = (this.ae.j() * 2.0 - 1.0) * (double)this.bd.a();
         double $$7 = (this.ae.j() * 2.0 - 1.0) * (double)this.bd.a();
         this.dV().a(ly.d, this.dA() + $$6, (double)($$4 + 1.0F), this.dG() + $$7, $$2.d, $$2.e - this.ae.j() * 0.2F, $$2.f);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bd.a() * 20.0F; $$8++) {
         double $$9 = (this.ae.j() * 2.0 - 1.0) * (double)this.bd.a();
         double $$10 = (this.ae.j() * 2.0 - 1.0) * (double)this.bd.a();
         this.dV().a(ly.ap, this.dA() + $$9, (double)($$4 + 1.0F), this.dG() + $$10, $$2.d, $$2.e, $$2.f);
      }

      this.a(ege.O);
   }

   @Deprecated
   protected ebe br() {
      return this.dV().a_(this.aO());
   }

   public ebe bs() {
      return this.dV().a_(this.aQ());
   }

   public boolean bt() {
      return this.ci() && !this.bi() && !this.Z_() && !this.ch() && !this.bv() && this.bJ();
   }

   protected void bu() {
      iv $$0 = this.aO();
      ebe $$1 = this.dV().a_($$0);
      if ($$1.o() != dtp.a) {
         ffq $$2 = this.dy();
         iv $$3 = this.dv();
         double $$4 = this.dA() + (this.ae.j() - 0.5) * (double)this.bd.a();
         double $$5 = this.dG() + (this.ae.j() - 0.5) * (double)this.bd.a();
         if ($$3.u() != $$0.u()) {
            $$4 = azo.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = azo.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dV().a(new lq(ly.b, $$1), $$4, this.dC() + 0.1, $$5, $$2.d * -4.0, 1.5, $$2.f * -4.0);
      }
   }

   public boolean a(axt<exn> $$0) {
      return this.aK.contains($$0);
   }

   public boolean bv() {
      return !this.ak && this.ah.getDouble(axj.b) > 0.0;
   }

   public void a(float $$0, ffq $$1) {
      ffq $$2 = a($$1, $$0, this.dL());
      this.i(this.dy().e($$2));
   }

   protected static ffq a(ffq $$0, float $$1, float $$2) {
      double $$3 = $$0.h();
      if ($$3 < 1.0E-7) {
         return ffq.c;
      } else {
         ffq $$4 = ($$3 > 1.0 ? $$0.d() : $$0).c((double)$$1);
         float $$5 = azo.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = azo.b($$2 * (float) (Math.PI / 180.0));
         return new ffq($$4.d * (double)$$6 - $$4.f * (double)$$5, $$4.e, $$4.f * (double)$$6 + $$4.d * (double)$$5);
      }
   }

   @Deprecated
   public float bw() {
      return this.dV().f(this.dz(), this.dF()) ? this.dV().y(iv.a(this.dA(), this.dE(), this.dG())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.g($$0, $$1, $$2);
      this.c($$3, $$4);
   }

   public void c(float $$0, float $$1) {
      this.w($$0 % 360.0F);
      this.x(azo.a($$1, -90.0F, 90.0F) % 360.0F);
      this.N = this.dL();
      this.O = this.dN();
   }

   public void g(double $$0, double $$1, double $$2) {
      double $$3 = azo.a($$0, -3.0E7, 3.0E7);
      double $$4 = azo.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void f(ffq $$0) {
      this.d($$0.d, $$0.e, $$0.f);
   }

   public void d(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dL(), this.dN());
   }

   public void a(iv $$0, float $$1, float $$2) {
      this.b($$0.c(), $$1, $$2);
   }

   public void b(ffq $$0, float $$1, float $$2) {
      this.b($$0.d, $$0.e, $$0.f, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.o($$0, $$1, $$2);
      this.w($$3);
      this.x($$4);
      this.bx();
      this.av();
   }

   public final void bx() {
      this.by();
      this.bz();
   }

   public final void c(ffq $$0, float $$1, float $$2) {
      this.l($$0);
      this.f($$1, $$2);
   }

   protected void by() {
      this.l(this.az);
   }

   public void bz() {
      this.f(this.dL(), this.dN());
   }

   private void l(ffq $$0) {
      this.K = this.aa = $$0.d;
      this.L = this.ab = $$0.e;
      this.M = this.ac = $$0.f;
   }

   private void f(float $$0, float $$1) {
      this.N = $$0;
      this.O = $$1;
   }

   public final ffq bA() {
      return new ffq(this.aa, this.ab, this.ac);
   }

   public float f(bwt $$0) {
      float $$1 = (float)(this.dA() - $$0.dA());
      float $$2 = (float)(this.dC() - $$0.dC());
      float $$3 = (float)(this.dG() - $$0.dG());
      return azo.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double h(double $$0, double $$1, double $$2) {
      double $$3 = this.dA() - $$0;
      double $$4 = this.dC() - $$1;
      double $$5 = this.dG() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(bwt $$0) {
      return this.g($$0.dt());
   }

   public double g(ffq $$0) {
      double $$1 = this.dA() - $$0.d;
      double $$2 = this.dC() - $$0.e;
      double $$3 = this.dG() - $$0.f;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void a_(crx $$0) {
   }

   public void h(bwt $$0) {
      if (!this.z($$0)) {
         if (!$$0.ad && !this.ad) {
            double $$1 = $$0.dA() - this.dA();
            double $$2 = $$0.dG() - this.dG();
            double $$3 = azo.a($$1, $$2);
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
               if (!this.bZ() && this.bG()) {
                  this.i(-$$1, 0.0, -$$2);
               }

               if (!$$0.bZ() && $$0.bG()) {
                  $$0.i($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void h(ffq $$0) {
      this.i($$0.d, $$0.e, $$0.f);
   }

   public void i(double $$0, double $$1, double $$2) {
      this.i(this.dy().b($$0, $$1, $$2));
      this.ar = true;
   }

   protected void bB() {
      this.T = true;
   }

   @Deprecated
   public final void a(bvi $$0, float $$1) {
      if (this.ay instanceof ars $$2) {
         this.a($$2, $$0, $$1);
      }
   }

   @Deprecated
   public final boolean b(bvi $$0, float $$1) {
      return this.ay instanceof ars $$2 ? this.a($$2, $$0, $$1) : this.b($$0);
   }

   public abstract boolean a(ars var1, bvi var2, float var3);

   public boolean b(bvi $$0) {
      return false;
   }

   public final ffq h(float $$0) {
      return this.d(this.i($$0), this.j($$0));
   }

   public jb bC() {
      return jb.a(this.h(1.0F));
   }

   public float i(float $$0) {
      return this.k($$0);
   }

   public float j(float $$0) {
      return this.l($$0);
   }

   public float k(float $$0) {
      return $$0 == 1.0F ? this.dN() : azo.h($$0, this.O, this.dN());
   }

   public float l(float $$0) {
      return $$0 == 1.0F ? this.dL() : azo.i($$0, this.N, this.dL());
   }

   public final ffq d(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = azo.b($$3);
      float $$5 = azo.a($$3);
      float $$6 = azo.b($$2);
      float $$7 = azo.a($$2);
      return new ffq((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final ffq m(float $$0) {
      return this.e(this.i($$0), this.j($$0));
   }

   protected final ffq e(float $$0, float $$1) {
      return this.d($$0 - 90.0F, $$1);
   }

   public final ffq bD() {
      return new ffq(this.dA(), this.dE(), this.dG());
   }

   public final ffq n(float $$0) {
      double $$1 = azo.d((double)$$0, this.K, this.dA());
      double $$2 = azo.d((double)$$0, this.L, this.dC()) + (double)this.cS();
      double $$3 = azo.d((double)$$0, this.M, this.dG());
      return new ffq($$1, $$2, $$3);
   }

   public ffq o(float $$0) {
      return this.n($$0);
   }

   public final ffq p(float $$0) {
      double $$1 = azo.d((double)$$0, this.K, this.dA());
      double $$2 = azo.d((double)$$0, this.L, this.dC());
      double $$3 = azo.d((double)$$0, this.M, this.dG());
      return new ffq($$1, $$2, $$3);
   }

   public ffo a(double $$0, float $$1, boolean $$2) {
      ffq $$3 = this.n($$1);
      ffq $$4 = this.h($$1);
      ffq $$5 = $$3.b($$4.d * $$0, $$4.e * $$0, $$4.f * $$0);
      return this.dV().a(new dje($$3, $$5, dje.a.b, $$2 ? dje.b.c : dje.b.a, this));
   }

   public boolean bE() {
      return this.bJ() && this.bF();
   }

   public boolean bF() {
      return false;
   }

   public boolean bG() {
      return false;
   }

   public void a(bwt $$0, bvi $$1) {
      if ($$0 instanceof art) {
         aq.d.a((art)$$0, this, $$1);
      }
   }

   public boolean j(double $$0, double $$1, double $$2) {
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

      $$1 *= 64.0 * q;
      return $$0 < $$1 * $$1;
   }

   public boolean f(tz $$0) {
      if (this.aH != null && !this.aH.b()) {
         return false;
      } else {
         String $$1 = this.bI();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.h($$0);
            return true;
         }
      }
   }

   public boolean g(tz $$0) {
      return this.bY() ? false : this.f($$0);
   }

   public tz h(tz $$0) {
      try {
         if (this.u != null) {
            $$0.a("Pos", ffq.a, new ffq(this.u.dA(), this.dC(), this.u.dG()));
         } else {
            $$0.a("Pos", ffq.a, this.dt());
         }

         $$0.a("Motion", ffq.a, this.dy());
         $$0.a("Rotation", ffp.i, new ffp(this.dL(), this.dN()));
         $$0.a("fall_distance", this.Z);
         $$0.a("Fire", (short)this.aJ);
         $$0.a("Air", (short)this.cs());
         $$0.a("OnGround", this.aH());
         $$0.a("Invulnerable", this.aY);
         $$0.a("PortalCooldown", this.aX);
         $$0.a("UUID", jz.a, this.cG());
         xa $$1 = this.ak();
         if ($$1 != null) {
            alg<uy> $$2 = this.dX().a(un.a);
            $$0.a("CustomName", xc.a, $$2, $$1);
         }

         if (this.cL()) {
            $$0.a("CustomNameVisible", this.cL());
         }

         if (this.ba()) {
            $$0.a("Silent", this.ba());
         }

         if (this.bb()) {
            $$0.a("NoGravity", this.bb());
         }

         if (this.aZ) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.cu();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.cu());
         }

         if (this.bi) {
            $$0.a("HasVisualFire", this.bi);
         }

         if (!this.ba.isEmpty()) {
            $$0.a("Tags", c, List.copyOf(this.ba));
         }

         this.b($$0);
         if (this.bZ()) {
            uf $$4 = new uf();

            for (bwt $$5 : this.cY()) {
               tz $$6 = new tz();
               if ($$5.f($$6)) {
                  $$4.add($$6);
               }
            }

            if (!$$4.isEmpty()) {
               $$0.a("Passengers", $$4);
            }
         }

         return $$0;
      } catch (Throwable var8) {
         p $$8 = p.a(var8, "Saving entity NBT");
         q $$9 = $$8.a("Entity being saved");
         this.a($$9);
         throw new aa($$8);
      }
   }

   public void i(tz $$0) {
      try {
         ffq $$1 = $$0.<ffq>a("Pos", ffq.a).orElse(ffq.c);
         ffq $$2 = $$0.<ffq>a("Motion", ffq.a).orElse(ffq.c);
         ffp $$3 = $$0.<ffp>a("Rotation", ffp.i).orElse(ffp.a);
         this.n(Math.abs($$2.d) > 10.0 ? 0.0 : $$2.d, Math.abs($$2.e) > 10.0 ? 0.0 : $$2.e, Math.abs($$2.f) > 10.0 ? 0.0 : $$2.f);
         this.ar = true;
         double $$4 = 3.0000512E7;
         this.o(azo.a($$1.d, -3.0000512E7, 3.0000512E7), azo.a($$1.e, -2.0E7, 2.0E7), azo.a($$1.f, -3.0000512E7, 3.0000512E7));
         this.w($$3.j);
         this.x($$3.k);
         this.bx();
         this.r(this.dL());
         this.s(this.dL());
         this.Z = $$0.b("fall_distance", 0.0);
         this.aJ = $$0.b("Fire", (short)0);
         this.j($$0.b("Air", this.cr()));
         this.aG = $$0.b("OnGround", false);
         this.aY = $$0.b("Invulnerable", false);
         this.aX = $$0.b("PortalCooldown", 0);
         $$0.<UUID>a("UUID", jz.a).ifPresent($$0x -> {
            this.at = $$0x;
            this.au = this.at.toString();
         });
         if (!Double.isFinite(this.dA()) || !Double.isFinite(this.dC()) || !Double.isFinite(this.dG())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dL()) && Double.isFinite((double)this.dN())) {
            this.av();
            this.b(this.dL(), this.dN());
            alg<uy> $$5 = this.dX().a(un.a);
            this.b($$0.<xa>a("CustomName", xc.a, $$5).orElse(null));
            this.o($$0.b("CustomNameVisible", false));
            this.e($$0.b("Silent", false));
            this.f($$0.b("NoGravity", false));
            this.j($$0.b("Glowing", false));
            this.k($$0.b("TicksFrozen", 0));
            this.bi = $$0.b("HasVisualFire", false);
            this.ba.clear();
            $$0.<Collection<? extends E>>a("Tags", c).ifPresent(this.ba::addAll);
            this.a($$0);
            if (this.bH()) {
               this.av();
            }
         } else {
            throw new IllegalStateException("Entity has invalid rotation");
         }
      } catch (Throwable var8) {
         p $$7 = p.a(var8, "Loading entity NBT");
         q $$8 = $$7.a("Entity being loaded");
         this.a($$8);
         throw new aa($$7);
      }
   }

   protected boolean bH() {
      return true;
   }

   @Nullable
   protected final String bI() {
      bxc<?> $$0 = this.an();
      ali $$1 = bxc.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(tz var1);

   protected abstract void b(tz var1);

   @Nullable
   public coc a(ars $$0, djw $$1) {
      return this.a($$0, $$1, 0);
   }

   @Nullable
   public coc a(ars $$0, djw $$1, int $$2) {
      return this.a($$0, new czy($$1), (float)$$2);
   }

   @Nullable
   public coc a(ars $$0, czy $$1) {
      return this.a($$0, $$1, 0.0F);
   }

   @Nullable
   public coc a(ars $$0, czy $$1, float $$2) {
      if ($$1.f()) {
         return null;
      } else {
         coc $$3 = new coc($$0, this.dA(), this.dC() + (double)$$2, this.dG(), $$1);
         $$3.j();
         $$0.b($$3);
         return $$3;
      }
   }

   public boolean bJ() {
      return !this.dQ();
   }

   public boolean bK() {
      if (this.ad) {
         return false;
      } else {
         float $$0 = this.bd.a() * 0.8F;
         ffl $$1 = ffl.a(this.bD(), (double)$$0, 1.0E-6, (double)$$0);
         return iv.b($$1).anyMatch($$1x -> {
            ebe $$2 = this.dV().a_($$1x);
            return !$$2.l() && $$2.j(this.dV(), $$1x) && fgh.c($$2.g(this.dV(), $$1x).a($$1x), fgh.a($$1), ffu.i);
         });
      }
   }

   public bur a(crx $$0, buq $$1) {
      if (this.bJ() && this instanceof bxs $$2) {
         if ($$2.C() == $$0) {
            if (!this.dV().A_()) {
               if ($$0.fV()) {
                  $$2.z();
               } else {
                  $$2.y();
               }

               this.a(ege.r, $$0);
            }

            return bur.a.b();
         }

         czy $$3 = $$0.b($$1);
         if ($$3.a(dac.vV) && $$2.p()) {
            if (!this.dV().A_()) {
               $$2.a_($$0, true);
            }

            $$3.h(1);
            return bur.a;
         }
      }

      return bur.e;
   }

   public boolean i(bwt $$0) {
      return $$0.bL() && !this.z($$0);
   }

   public boolean bL() {
      return false;
   }

   public void r() {
      this.i(ffq.c);
      this.h();
      if (this.bY()) {
         this.dk().j(this);
      }
   }

   public final void j(bwt $$0) {
      if (this.y($$0)) {
         this.a($$0, bwt::a_);
      }
   }

   protected void a(bwt $$0, bwt.a $$1) {
      ffq $$2 = this.m($$0);
      ffq $$3 = $$0.l(this);
      $$1.accept($$0, $$2.d - $$3.d, $$2.e - $$3.e, $$2.f - $$3.f);
   }

   public void k(bwt $$0) {
   }

   public ffq l(bwt $$0) {
      return this.ds().b(bwu.b, 0, this.aD);
   }

   public ffq m(bwt $$0) {
      return this.dt().e(this.a($$0, this.bd, 1.0F));
   }

   protected ffq a(bwt $$0, bww $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static ffq a(bwt $$0, bwt $$1, bwv $$2) {
      int $$3 = $$0.cY().indexOf($$1);
      return $$2.c(bwu.a, $$3, $$0.aD);
   }

   public boolean n(bwt $$0) {
      return this.a($$0, false);
   }

   public boolean bM() {
      return this instanceof bxu;
   }

   public boolean a(bwt $$0, boolean $$1) {
      if ($$0 == this.u) {
         return false;
      } else if (!$$0.bP()) {
         return false;
      } else if (!this.dV().A_() && !$$0.r.b()) {
         return false;
      } else {
         for (bwt $$2 = $$0; $$2.u != null; $$2 = $$2.u) {
            if ($$2.u == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bY()) {
               this.bO();
            }

            this.b(byg.a);
            this.u = $$0;
            this.u.p(this);
            $$0.D().filter($$0x -> $$0x instanceof art).forEach($$0x -> aq.U.a((art)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bwt $$0) {
      return !this.cc() && this.J <= 0;
   }

   public void bN() {
      for (int $$0 = this.t.size() - 1; $$0 >= 0; $$0--) {
         ((bwt)this.t.get($$0)).bO();
      }
   }

   public void ab() {
      if (this.u != null) {
         bwt $$0 = this.u;
         this.u = null;
         $$0.q(this);
      }
   }

   public void bO() {
      this.ab();
   }

   protected void p(bwt $$0) {
      if ($$0.dk() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.t.isEmpty()) {
            this.t = ImmutableList.of($$0);
         } else {
            List<bwt> $$1 = Lists.newArrayList(this.t);
            if (!this.dV().C && $$0 instanceof crx && !(this.cZ() instanceof crx)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.t = ImmutableList.copyOf($$1);
         }

         this.a(ege.s, $$0);
      }
   }

   protected void q(bwt $$0) {
      if ($$0.dk() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.t.size() == 1 && this.t.get(0) == $$0) {
            this.t = ImmutableList.of();
         } else {
            this.t = this.t.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(ege.q, $$0);
      }
   }

   protected boolean r(bwt $$0) {
      return this.t.isEmpty();
   }

   protected boolean bP() {
      return true;
   }

   public final boolean bQ() {
      return this.R_() != null && this.R_().d();
   }

   public final void d(ffq $$0, float $$1, float $$2) {
      bxp $$3 = this.R_();
      if ($$3 != null) {
         $$3.a($$0, $$1, $$2);
      } else {
         this.b($$0);
         this.b($$1, $$2);
      }
   }

   @Nullable
   public bxp R_() {
      return null;
   }

   public void a(float $$0, int $$1) {
      this.r($$0);
   }

   public float bR() {
      return 0.0F;
   }

   public ffq bS() {
      return this.d(this.dN(), this.dL());
   }

   public ffq a(czu $$0) {
      if (!(this instanceof crx $$1)) {
         return ffq.c;
      } else {
         boolean $$2 = $$1.fc().a($$0) && !$$1.fb().a($$0);
         bxl $$3 = $$2 ? $$1.fy().e() : $$1.fy();
         return this.d(0.0F, this.dL() + (float)($$3 == bxl.b ? 80 : -80)).c(0.5);
      }
   }

   public ffp bT() {
      return new ffp(this.dN(), this.dL());
   }

   public ffq bU() {
      return ffq.a(this.bT());
   }

   public void a(dtb $$0, iv $$1) {
      if (this.aA()) {
         this.ay();
      } else {
         if (this.as == null || !this.as.a($$0)) {
            this.as = new byf($$0, $$1.j());
         } else if (!this.as.e()) {
            this.as.a($$1.j());
            this.as.a(true);
         }
      }
   }

   protected void bV() {
      if (this.dV() instanceof ars $$0) {
         this.M();
         if (this.as != null) {
            if (this.as.a($$0, this, this.n(false))) {
               brb $$2 = bra.a();
               $$2.a("portal");
               this.ay();
               eyo $$3 = this.as.a($$0, this);
               if ($$3 != null) {
                  ars $$4 = $$3.b();
                  if ($$0.p().a((djx)$$4) && ($$4.aj() == $$0.aj() || this.a($$0, $$4))) {
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

   public int bW() {
      bwt $$0 = this.cZ();
      return $$0 instanceof art ? $$0.bW() : 300;
   }

   public void k(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
   }

   public void c(bvi $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            drb.a(this);
      }
   }

   public void q(float $$0) {
   }

   public boolean bX() {
      boolean $$0 = this.dV() != null && this.dV().C;
      return !this.bh() && (this.aJ > 0 || $$0 && this.i(0));
   }

   public boolean bY() {
      return this.dk() != null;
   }

   public boolean bZ() {
      return !this.t.isEmpty();
   }

   public boolean ca() {
      return this.an().a(axh.p);
   }

   public boolean cb() {
      return !this.an().a(axh.q);
   }

   public void g(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean cc() {
      return this.i(1);
   }

   public boolean cd() {
      return this.cc();
   }

   public boolean ce() {
      return this.cc();
   }

   public boolean cf() {
      return this.cc();
   }

   public boolean cg() {
      return this.cc();
   }

   public boolean ch() {
      return this.c(byg.f);
   }

   public boolean ci() {
      return this.i(3);
   }

   public void h(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean cj() {
      return this.i(4);
   }

   public boolean ck() {
      return this.c(byg.d);
   }

   public boolean cl() {
      return this.ck() && !this.bi();
   }

   public void i(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cm() {
      return this.aZ;
   }

   public final void j(boolean $$0) {
      this.aZ = $$0;
      this.b(6, this.cn());
   }

   public boolean cn() {
      return this.dV().A_() ? this.i(6) : this.aZ;
   }

   public boolean co() {
      return this.i(5);
   }

   public boolean d(crx $$0) {
      if ($$0.Z_()) {
         return false;
      } else {
         fgx $$1 = this.cq();
         return $$1 != null && $$0 != null && $$0.cq() == $$1 && $$1.j() ? false : this.co();
      }
   }

   public boolean cp() {
      return false;
   }

   public void a(BiConsumer<egb<?>, ars> $$0) {
   }

   @Nullable
   public fgq cq() {
      return this.dV().R().e(this.cI());
   }

   public final boolean s(@Nullable bwt $$0) {
      return $$0 == null ? false : this == $$0 || this.t($$0) || $$0.t(this);
   }

   protected boolean t(bwt $$0) {
      return this.a($$0.cq());
   }

   public boolean a(@Nullable fgx $$0) {
      return this.cq() != null ? this.cq().a($$0) : false;
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

   public int cr() {
      return 300;
   }

   public int cs() {
      return this.al.a(aP);
   }

   public void j(int $$0) {
      this.al.a(aP, $$0);
   }

   public void ct() {
      this.k(0);
   }

   public int cu() {
      return this.al.a(aU);
   }

   public void k(int $$0) {
      this.al.a(aU, $$0);
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

   public void a(ars $$0, bxt $$1) {
      this.h(this.aJ + 1);
      if (this.aJ == 0) {
         this.e(8.0F);
      }

      this.a($$0, this.dW().c(), 5.0F);
   }

   public void a(boolean $$0, iv $$1) {
      a(this, $$0, $$1);
   }

   protected static void a(bwt $$0, boolean $$1, iv $$2) {
      ffq $$3 = $$0.dy();
      double $$4;
      if ($$1) {
         $$4 = Math.max(-0.9, $$3.e - 0.03);
      } else {
         $$4 = Math.min(1.8, $$3.e + 0.1);
      }

      $$0.n($$3.d, $$4, $$3.f);
      a($$0.ay, $$2);
   }

   protected static void a(djx $$0, iv $$1) {
      if ($$0 instanceof ars $$2) {
         for (int $$3 = 0; $$3 < 2; $$3++) {
            $$2.a(ly.ap, (double)$$1.u() + $$0.A.j(), (double)($$1.v() + 1), (double)$$1.w() + $$0.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            $$2.a(ly.d, (double)$$1.u() + $$0.A.j(), (double)($$1.v() + 1), (double)$$1.w() + $$0.A.j(), 1, 0.0, 0.01, 0.0, 0.2);
         }
      }
   }

   public void l(boolean $$0) {
      b(this, $$0);
   }

   protected static void b(bwt $$0, boolean $$1) {
      ffq $$2 = $$0.dy();
      double $$3;
      if ($$1) {
         $$3 = Math.max(-0.3, $$2.e - 0.03);
      } else {
         $$3 = Math.min(0.7, $$2.e + 0.06);
      }

      $$0.n($$2.d, $$3, $$2.f);
      $$0.k();
   }

   public boolean a(ars $$0, bxu $$1) {
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

   protected void l(double $$0, double $$1, double $$2) {
      iv $$3 = iv.a($$0, $$1, $$2);
      ffq $$4 = new ffq($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      iv.a $$5 = new iv.a();
      jb $$6 = jb.b;
      double $$7 = Double.MAX_VALUE;

      for (jb $$8 : new jb[]{jb.c, jb.d, jb.e, jb.f, jb.b}) {
         $$5.a($$3, $$8);
         if (!this.dV().a_($$5).m(this.dV(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == jb.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ae.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      ffq $$13 = this.dy().c(0.75);
      if ($$6.o() == jb.a.a) {
         this.n((double)($$12 * $$11), $$13.e, $$13.f);
      } else if ($$6.o() == jb.a.b) {
         this.n($$13.d, (double)($$12 * $$11), $$13.f);
      } else if ($$6.o() == jb.a.c) {
         this.n($$13.d, $$13.e, (double)($$12 * $$11));
      }
   }

   public void a(ebe $$0, ffq $$1) {
      this.k();
      this.U = $$1;
   }

   private static xa a(xa $$0) {
      xo $$1 = $$0.e().b($$0.a().a(null));

      for (xa $$2 : $$0.c()) {
         $$1.b(a($$2));
      }

      return $$1;
   }

   @Override
   public xa ai() {
      xa $$0 = this.ak();
      return $$0 != null ? a($$0) : this.cz();
   }

   protected xa cz() {
      return this.r.h();
   }

   public boolean u(bwt $$0) {
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

   public boolean v(bwt $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dV() == null ? "~NULL~" : this.dV().toString();
      return this.aH != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.ai().getString(),
            this.s,
            $$0,
            this.dA(),
            this.dC(),
            this.dG(),
            this.aH
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.ai().getString(),
            this.s,
            $$0,
            this.dA(),
            this.dC(),
            this.dG()
         );
   }

   protected final boolean d(bvi $$0) {
      return this.dQ() || this.aY && !$$0.a(axf.d) && !$$0.h() || $$0.a(axf.i) && this.bh() || $$0.a(axf.m) && this.an().a(axh.o);
   }

   public boolean cC() {
      return this.aY;
   }

   public void m(boolean $$0) {
      this.aY = $$0;
   }

   public void w(bwt $$0) {
      this.b($$0.dA(), $$0.dC(), $$0.dG(), $$0.dL(), $$0.dN());
   }

   public void x(bwt $$0) {
      tz $$1 = $$0.h(new tz());
      $$1.r("Dimension");
      this.i($$1);
      this.aX = $$0.aX;
      this.as = $$0.as;
   }

   @Nullable
   public bwt b(eyo $$0) {
      if (this.dV() instanceof ars $$1 && !this.dQ()) {
         ars $$3 = $$0.b();
         boolean $$4 = $$3.aj() != $$1.aj();
         if (!$$0.h()) {
            this.bO();
         }

         if ($$4) {
            return this.b($$3, $$0);
         }

         return this.a($$1, $$0);
      }

      return null;
   }

   private bwt a(ars $$0, eyo $$1) {
      for (bwt $$2 : this.cY()) {
         $$2.b(this.a($$1, $$2));
      }

      brb $$3 = bra.a();
      $$3.a("teleportSameDimension");
      this.a(byh.a($$1), $$1.i());
      if (!$$1.h()) {
         this.a($$1);
      }

      $$1.j().onTransition(this);
      $$3.c();
      return this;
   }

   private bwt b(ars $$0, eyo $$1) {
      List<bwt> $$2 = this.cY();
      List<bwt> $$3 = new ArrayList<>($$2.size());
      this.bN();

      for (bwt $$4 : $$2) {
         bwt $$5 = $$4.b(this.a($$1, $$4));
         if ($$5 != null) {
            $$3.add($$5);
         }
      }

      brb $$6 = bra.a();
      $$6.a("teleportCrossDimension");
      bwt $$7 = this.an().a($$0, bxb.s);
      if ($$7 == null) {
         $$6.c();
         return null;
      } else {
         $$7.x(this);
         this.cD();
         $$7.a(byh.a($$1), $$1.i());
         $$0.d($$7);

         for (bwt $$8 : $$3) {
            $$8.a($$7, true);
         }

         $$0.i();
         $$1.j().onTransition($$7);
         $$6.c();
         return $$7;
      }
   }

   private eyo a(eyo $$0, bwt $$1) {
      float $$2 = $$0.e() + ($$0.i().contains(byi.d) ? 0.0F : $$1.dL() - this.dL());
      float $$3 = $$0.f() + ($$0.i().contains(byi.e) ? 0.0F : $$1.dN() - this.dN());
      ffq $$4 = $$1.dt().d(this.dt());
      ffq $$5 = $$0.c().b($$0.i().contains(byi.a) ? 0.0 : $$4.a(), $$0.i().contains(byi.b) ? 0.0 : $$4.b(), $$0.i().contains(byi.c) ? 0.0 : $$4.c());
      return $$0.a($$5).a($$2, $$3).a();
   }

   private void a(eyo $$0) {
      bwt $$1 = this.cW();

      for (bwt $$2 : this.dc()) {
         if ($$2 instanceof art) {
            art $$3 = (art)$$2;
            if ($$1 != null && $$3.ao() == $$1.ao()) {
               $$3.f.b(age.a(this.ao(), byh.a($$0), $$0.i(), this.aG));
            } else {
               $$3.f.b(age.a(this.ao(), byh.a(this), Set.of(), this.aG));
            }
         }
      }
   }

   public void a(byh $$0, Set<byi> $$1) {
      byh $$2 = byh.a(this);
      byh $$3 = byh.a($$2, $$0, $$1);
      this.o($$3.a().d, $$3.a().e, $$3.a().f);
      this.w($$3.c());
      this.r($$3.c());
      this.x($$3.d());
      this.av();
      this.bx();
      this.i($$3.b());
      this.bk.clear();
   }

   public void a(float $$0, float $$1) {
      this.w($$0);
      this.r($$0);
      this.x($$1);
      this.bz();
   }

   public void f(iv $$0) {
      if (this.dV() instanceof ars $$1) {
         $$1.m().a(arz.g, new djc($$0), 3);
      }
   }

   protected void cD() {
      this.c(bwt.d.e);
      if (this instanceof bxs $$0) {
         $$0.z();
      }
   }

   public ffq a(jb.a $$0, m.a $$1) {
      return eyn.a($$1, $$0, this.dt(), this.a(this.at()));
   }

   public boolean n(boolean $$0) {
      return ($$0 || !this.bY()) && this.bJ();
   }

   public boolean a(djx $$0, djx $$1) {
      if ($$0.aj() == djx.k && $$1.aj() == djx.i) {
         for (bwt $$2 : this.cY()) {
            if ($$2 instanceof art $$3 && !$$3.i) {
               return false;
            }
         }
      }

      return true;
   }

   public float a(djq $$0, djb $$1, iv $$2, ebe $$3, exo $$4, float $$5) {
      return $$5;
   }

   public boolean a(djq $$0, djb $$1, iv $$2, ebe $$3, float $$4) {
      return true;
   }

   public int cE() {
      return 3;
   }

   public boolean g_() {
      return false;
   }

   public void a(q $$0) {
      $$0.a("Entity Type", () -> bxc.a(this.an()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.s);
      $$0.a("Entity Name", () -> this.ai().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dA(), this.dC(), this.dG()));
      $$0.a("Entity's Block location", q.a(this.dV(), azo.a(this.dA()), azo.a(this.dC()), azo.a(this.dG())));
      ffq $$1 = this.dy();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.d, $$1.e, $$1.f));
      $$0.a("Entity's Passengers", () -> this.cY().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.dk()));
   }

   public boolean cF() {
      return this.bX() && !this.Z_();
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
      return q;
   }

   public static void b(double $$0) {
      q = $$0;
   }

   @Override
   public xa m_() {
      return fgq.a(this.cq(), this.ai()).a($$0 -> $$0.a(this.cQ()).a(this.cH()));
   }

   public void b(@Nullable xa $$0) {
      this.al.a(aQ, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public xa ak() {
      return this.al.a(aQ).orElse(null);
   }

   @Override
   public boolean h_() {
      return this.al.a(aQ).isPresent();
   }

   public void o(boolean $$0) {
      this.al.a(aR, $$0);
   }

   public boolean cL() {
      return this.al.a(aR);
   }

   public boolean a(ars $$0, double $$1, double $$2, double $$3, Set<byi> $$4, float $$5, float $$6, boolean $$7) {
      bwt $$8 = this.b(new eyo($$0, new ffq($$1, $$2, $$3), ffq.c, $$5, $$6, $$4, eyo.a));
      return $$8 != null;
   }

   public void m(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (this.dV() instanceof ars) {
         this.b($$0, $$1, $$2, this.dL(), this.dN());
         this.v();
      }
   }

   private void v() {
      this.da().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.t.iterator();

         while (var1.hasNext()) {
            bwt $$1 = (bwt)var1.next();
            $$0.a($$1, bwt::d);
         }
      });
   }

   public void c(double $$0, double $$1, double $$2) {
      this.b(this.dA() + $$0, this.dC() + $$1, this.dG() + $$2);
   }

   public boolean cM() {
      return this.cL();
   }

   @Override
   public void a(List<akp.c<?>> $$0) {
   }

   @Override
   public void a(akl<?> $$0) {
      if (aq.equals($$0)) {
         this.i_();
      }
   }

   @Deprecated
   protected void cN() {
      byg $$0 = this.at();
      bww $$1 = this.a($$0);
      this.bd = $$1;
      this.be = $$1.c();
   }

   public void i_() {
      bww $$0 = this.bd;
      byg $$1 = this.at();
      bww $$2 = this.a($$1);
      this.bd = $$2;
      this.be = $$2.c();
      this.av();
      boolean $$3 = $$2.a() <= 4.0F && $$2.b() <= 4.0F;
      if (!this.ay.C && !this.ak && !this.ad && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof crx)) {
         this.a($$0);
      }
   }

   public boolean a(bww $$0) {
      bww $$1 = this.a(this.at());
      ffq $$2 = this.dt().b(0.0, (double)$$0.b() / 2.0, 0.0);
      double $$3 = (double)Math.max(0.0F, $$1.a() - $$0.a()) + 1.0E-6;
      double $$4 = (double)Math.max(0.0F, $$1.b() - $$0.b()) + 1.0E-6;
      fgk $$5 = fgh.a(ffl.a($$2, $$3, $$4, $$3));
      Optional<ffq> $$6 = this.ay.a(this, $$5, $$2, (double)$$1.a(), (double)$$1.b(), (double)$$1.a());
      if ($$6.isPresent()) {
         this.b($$6.get().b(0.0, (double)(-$$1.b()) / 2.0, 0.0));
         return true;
      } else {
         if ($$1.a() > $$0.a() && $$1.b() > $$0.b()) {
            fgk $$7 = fgh.a(ffl.a($$2, $$3, 1.0E-6, $$3));
            Optional<ffq> $$8 = this.ay.a(this, $$7, $$2, (double)$$1.a(), (double)$$0.b(), (double)$$1.a());
            if ($$8.isPresent()) {
               this.b($$8.get().b(0.0, (double)(-$$0.b()) / 2.0 + 1.0E-6, 0.0));
               return true;
            }
         }

         return false;
      }
   }

   public jb cO() {
      return jb.a((double)this.dL());
   }

   public jb cP() {
      return this.cO();
   }

   protected xg cQ() {
      return new xg.c(new xg.b(this.an(), this.cG(), this.ai()));
   }

   public boolean a(art $$0) {
      return true;
   }

   @Override
   public final ffl cR() {
      return this.aF;
   }

   public final void a(ffl $$0) {
      this.aF = $$0;
   }

   public final float d(byg $$0) {
      return this.a($$0).c();
   }

   public final float cS() {
      return this.be;
   }

   public ffq t(float $$0) {
      return this.cT();
   }

   protected ffq cT() {
      return new ffq(0.0, (double)this.cS(), (double)(this.dq() * 0.4F));
   }

   public byl a_(int $$0) {
      return byl.a;
   }

   public djx cU() {
      return this.dV();
   }

   @Nullable
   public MinecraftServer cV() {
      return this.dV().p();
   }

   public bur a(crx $$0, ffq $$1, buq $$2) {
      return bur.e;
   }

   public boolean a(djq $$0) {
      return false;
   }

   public void d(art $$0) {
   }

   public void e(art $$0) {
   }

   public float a(dtw $$0) {
      float $$1 = azo.h(this.dL());
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

   public float a(dsf $$0) {
      float $$1 = azo.h(this.dL());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public cst a(css $$0) {
      return this.an().a(axh.r) ? cst.b : cst.a;
   }

   @Nullable
   public bxu cW() {
      return null;
   }

   public final boolean cX() {
      return this.cW() != null;
   }

   public final List<bwt> cY() {
      return this.t;
   }

   @Nullable
   public bwt cZ() {
      return this.t.isEmpty() ? null : (bwt)this.t.get(0);
   }

   public boolean y(bwt $$0) {
      return this.t.contains($$0);
   }

   public boolean a(Predicate<bwt> $$0) {
      UnmodifiableIterator var2 = this.t.iterator();

      while (var2.hasNext()) {
         bwt $$1 = (bwt)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bwt> D() {
      return this.t.stream().flatMap(bwt::da);
   }

   @Override
   public Stream<bwt> da() {
      return Stream.concat(Stream.of(this), this.D());
   }

   @Override
   public Stream<bwt> db() {
      return Stream.concat(this.t.stream().flatMap(bwt::db), Stream.of(this));
   }

   public Iterable<bwt> dc() {
      return () -> this.D().iterator();
   }

   public int dd() {
      return (int)this.D().filter($$0 -> $$0 instanceof crx).count();
   }

   public boolean de() {
      return this.dd() == 1;
   }

   public bwt df() {
      bwt $$0 = this;

      while ($$0.bY()) {
         $$0 = $$0.dk();
      }

      return $$0;
   }

   public boolean z(bwt $$0) {
      return this.df() == $$0.df();
   }

   public boolean A(bwt $$0) {
      if (!$$0.bY()) {
         return false;
      } else {
         bwt $$1 = $$0.dk();
         return $$1 == this ? true : this.A($$1);
      }
   }

   public final boolean dg() {
      return this.ay.A_() ? this.dh() : !this.P_();
   }

   protected boolean dh() {
      bxu $$0 = this.cW();
      return $$0 != null && $$0.dh();
   }

   public boolean P_() {
      bxu $$0 = this.cW();
      return $$0 != null && $$0.P_();
   }

   public boolean di() {
      return this.dg();
   }

   public boolean dj() {
      return this.dg();
   }

   protected static ffq a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -azo.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = azo.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new ffq((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public ffq b(bxu $$0) {
      return new ffq(this.dA(), this.cR().e, this.dG());
   }

   @Nullable
   public bwt dk() {
      return this.u;
   }

   @Nullable
   public bwt dl() {
      return this.u != null && this.u.cW() == this ? this.u : null;
   }

   public ext j_() {
      return ext.a;
   }

   public awq dm() {
      return awq.g;
   }

   protected int dn() {
      return 1;
   }

   public ej d(ars $$0) {
      return new ej(ei.a, this.dt(), this.bT(), $$0, 0, this.ai().getString(), this.m_(), $$0.p(), this);
   }

   public void a(ev.a $$0, ffq $$1) {
      ffq $$2 = $$0.a(this);
      double $$3 = $$1.d - $$2.d;
      double $$4 = $$1.e - $$2.e;
      double $$5 = $$1.f - $$2.f;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.x(azo.h((float)(-(azo.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.w(azo.h((float)(azo.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.r(this.dL());
      this.O = this.dN();
      this.N = this.dL();
   }

   public float u(float $$0) {
      return azo.h($$0, this.N, this.aD);
   }

   public boolean a(axt<exn> $$0, double $$1) {
      if (this.do()) {
         return false;
      } else {
         ffl $$2 = this.cR().h(0.001);
         int $$3 = azo.a($$2.a);
         int $$4 = azo.c($$2.d);
         int $$5 = azo.a($$2.b);
         int $$6 = azo.c($$2.e);
         int $$7 = azo.a($$2.c);
         int $$8 = azo.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cJ();
         boolean $$11 = false;
         ffq $$12 = ffq.c;
         int $$13 = 0;
         iv.a $$14 = new iv.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  exo $$18 = this.dV().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a(this.dV(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           ffq $$20 = $$18.c(this.dV(), $$14);
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

            if (!(this instanceof crx)) {
               $$12 = $$12.d();
            }

            ffq $$21 = this.dy();
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
      ffl $$0 = this.cR().g(1.0);
      int $$1 = azo.a($$0.a);
      int $$2 = azo.c($$0.d);
      int $$3 = azo.a($$0.c);
      int $$4 = azo.c($$0.f);
      return !this.dV().b($$1, $$3, $$2, $$4);
   }

   public double b(axt<exn> $$0) {
      return this.ah.getDouble($$0);
   }

   public double dp() {
      return (double)this.cS() < 0.4 ? 0.0 : 0.4;
   }

   public final float dq() {
      return this.bd.a();
   }

   public final float dr() {
      return this.bd.b();
   }

   public zh<abw> a(arq $$0) {
      return new abx(this, $$0);
   }

   public bww a(byg $$0) {
      return this.r.n();
   }

   public final bwv ds() {
      return this.bd.d();
   }

   public ffq dt() {
      return this.az;
   }

   public ffq du() {
      return this.dt();
   }

   @Override
   public iv dv() {
      return this.aA;
   }

   public ebe dw() {
      if (this.bj == null) {
         this.bj = this.dV().a_(this.dv());
      }

      return this.bj;
   }

   public djc dx() {
      return this.aB;
   }

   public ffq dy() {
      return this.aC;
   }

   public void i(ffq $$0) {
      this.aC = $$0;
   }

   public void j(ffq $$0) {
      this.i(this.dy().e($$0));
   }

   public void n(double $$0, double $$1, double $$2) {
      this.i(new ffq($$0, $$1, $$2));
   }

   public final int dz() {
      return this.aA.u();
   }

   public final double dA() {
      return this.az.d;
   }

   public double c(double $$0) {
      return this.az.d + (double)this.dq() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ae.j() - 1.0) * $$0);
   }

   public final int dB() {
      return this.aA.v();
   }

   public final double dC() {
      return this.az.e;
   }

   public double e(double $$0) {
      return this.az.e + (double)this.dr() * $$0;
   }

   public double dD() {
      return this.e(this.ae.j());
   }

   public double dE() {
      return this.az.e + (double)this.be;
   }

   public final int dF() {
      return this.aA.w();
   }

   public final double dG() {
      return this.az.f;
   }

   public double f(double $$0) {
      return this.az.f + (double)this.dq() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ae.j() - 1.0) * $$0);
   }

   public final void o(double $$0, double $$1, double $$2) {
      if (this.az.d != $$0 || this.az.e != $$1 || this.az.f != $$2) {
         this.az = new ffq($$0, $$1, $$2);
         int $$3 = azo.a($$0);
         int $$4 = azo.a($$1);
         int $$5 = azo.a($$2);
         if ($$3 != this.aA.u() || $$4 != this.aA.v() || $$5 != this.aA.w()) {
            this.aA = new iv($$3, $$4, $$5);
            this.bj = null;
            if (jy.a($$3) != this.aB.h || jy.a($$5) != this.aB.i) {
               this.aB = new djc(this.aA);
            }
         }

         this.aV.a();
      }
   }

   public void dH() {
   }

   public ffq v(float $$0) {
      return this.p($$0).b(0.0, (double)this.be * 0.7, 0.0);
   }

   public void a(abx $$0) {
      int $$1 = $$0.b();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      double $$4 = $$0.i();
      this.e($$2, $$3, $$4);
      this.b($$2, $$3, $$4, $$0.n(), $$0.m());
      this.e($$1);
      this.a_($$0.e());
      ffq $$5 = new ffq($$0.j(), $$0.k(), $$0.l());
      this.i($$5);
   }

   @Nullable
   public czy dI() {
      return null;
   }

   public void p(boolean $$0) {
      this.av = $$0;
   }

   public boolean dJ() {
      return !this.an().a(axh.k);
   }

   public boolean dK() {
      return this.cu() > 0;
   }

   public float dL() {
      return this.aD;
   }

   public float dM() {
      return this.dL();
   }

   public void w(float $$0) {
      if (!Float.isFinite($$0)) {
         ag.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aD = $$0;
      }
   }

   public float dN() {
      return this.aE;
   }

   public void x(float $$0) {
      if (!Float.isFinite($$0)) {
         ag.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aE = Math.clamp($$0 % 360.0F, -90.0F, 90.0F);
      }
   }

   public boolean dO() {
      return false;
   }

   public float dP() {
      return 0.0F;
   }

   public void b_(@Nullable bwt $$0) {
   }

   @Override
   public final boolean dQ() {
      return this.aH != null;
   }

   @Nullable
   public bwt.d dR() {
      return this.aH;
   }

   @Override
   public final void c(bwt.d $$0) {
      if (this.aH == null) {
         this.aH = $$0;
      }

      if (this.aH.a()) {
         this.bO();
      }

      this.cY().forEach(bwt::bO);
      this.aV.a($$0);
      this.b($$0);
   }

   protected void dS() {
      this.aH = null;
   }

   @Override
   public void a(efk $$0) {
      this.aV = $$0;
   }

   @Override
   public boolean dT() {
      if (this.aH != null && !this.aH.b()) {
         return false;
      } else {
         return this.bY() ? false : !this.bZ() || !this.de();
      }
   }

   @Override
   public boolean dU() {
      return false;
   }

   public boolean c(ars $$0, iv $$1) {
      return true;
   }

   public djx dV() {
      return this.ay;
   }

   protected void a(djx $$0) {
      this.ay = $$0;
   }

   public bvj dW() {
      return this.dV().al();
   }

   public jt dX() {
      return this.dV().J_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = azo.d($$6, this.dA(), $$1);
      double $$8 = azo.d($$6, this.dC(), $$2);
      double $$9 = azo.d($$6, this.dG(), $$3);
      float $$10 = (float)azo.e($$6, (double)this.dL(), $$4);
      float $$11 = (float)azo.d($$6, (double)this.dN(), $$5);
      this.a_($$7, $$8, $$9);
      this.b($$10, $$11);
   }

   public azx dY() {
      return this.ae;
   }

   public ffq ae() {
      if (this.cW() instanceof crx $$0 && this.bJ()) {
         return $$0.ae();
      }

      return this.dy();
   }

   @Nullable
   public czy dZ() {
      return null;
   }

   public Optional<alh<fam>> ea() {
      return this.r.j();
   }

   protected void a(kf $$0) {
      this.a($$0, kk.g);
   }

   public final void c(czy $$0) {
      this.a($$0.a());
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.g ? c((kj<T>)$$0, this.ak()) : null;
   }

   @Nullable
   @Contract("_,!null->!null;_,_->_")
   protected static <T> T c(kj<T> $$0, @Nullable Object $$1) {
      return (T)$$1;
   }

   public <T> void d(kj<T> $$0, T $$1) {
      this.b($$0, $$1);
   }

   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.g) {
         this.b(c(kk.g, $$1));
         return true;
      } else {
         return false;
      }
   }

   protected <T> boolean a(kf $$0, kj<T> $$1) {
      T $$2 = $$0.a($$1);
      return $$2 != null ? this.b($$1, $$2) : false;
   }

   @FunctionalInterface
   public interface a {
      void accept(bwt var1, double var2, double var4, double var6);
   }

   static record b(ffq a, ffq b) {
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
