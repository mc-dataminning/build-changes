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

public abstract class bwi implements akm, buj, eey, fgg, kf {
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
   private static final fex d = new fex(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double k = 0.014;
   private static final double l = 0.007;
   private static final double m = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double n = 1.0;
   private final bwr<?> o;
   private int p = b.incrementAndGet();
   public boolean I;
   private ImmutableList<bwi> q = ImmutableList.of();
   protected int J;
   @Nullable
   private bwi r;
   private djm s;
   public double K;
   public double L;
   public double M;
   private ffc t;
   private iv u;
   private dir ay;
   private ffc az = ffc.c;
   private float aA;
   private float aB;
   public float N;
   public float O;
   private fex aC = d;
   private boolean aD;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected ffc U = ffc.c;
   @Nullable
   private bwi.d aE;
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
   protected final azv ae = azv.a();
   public int af;
   private int aG = -this.dm();
   protected boolean ag;
   protected Object2DoubleMap<axr<ewz>> ah = new Object2DoubleArrayMap(2);
   protected boolean ai;
   private final Set<axr<ewz>> aH = new HashSet<>();
   public int aj;
   protected boolean ak = true;
   protected final akn al;
   protected static final akj<Byte> am = akn.a(bwi.class, akl.a);
   protected static final int an = 0;
   private static final int aI = 1;
   private static final int aJ = 3;
   private static final int aK = 4;
   private static final int aL = 5;
   protected static final int ao = 6;
   protected static final int ap = 7;
   private static final akj<Integer> aM = akn.a(bwi.class, akl.b);
   private static final akj<Optional<wy>> aN = akn.a(bwi.class, akl.g);
   private static final akj<Boolean> aO = akn.a(bwi.class, akl.k);
   private static final akj<Boolean> aP = akn.a(bwi.class, akl.k);
   private static final akj<Boolean> aQ = akn.a(bwi.class, akl.k);
   protected static final akj<bxv> aq = akn.a(bwi.class, akl.w);
   private static final akj<Integer> aR = akn.a(bwi.class, akl.b);
   private eez aS = eez.a;
   private final ait aT = new ait();
   public boolean ar;
   @Nullable
   public bxu as;
   private int aU;
   private boolean aV;
   protected UUID at = azm.a(this.ae);
   protected String au = this.at.toString();
   private boolean aW;
   private final Set<String> aX = Sets.newHashSet();
   private final double[] aY = new double[]{0.0, 0.0, 0.0};
   private long aZ;
   private bwl ba;
   private float bb;
   public boolean av;
   public boolean aw;
   public Optional<iv> ax = Optional.empty();
   private boolean bc = false;
   private float bd;
   private int be;
   private boolean bf;
   @Nullable
   private eat bg = null;
   private final List<bwi.b> bh = new ArrayList<>();
   private final LongSet bi = new LongOpenHashSet();
   private final bxb.a bj = new bxb.a();

   public bwi(bwr<?> $$0, djm $$1) {
      this.o = $$0;
      this.s = $$1;
      this.ba = $$0.n();
      this.t = ffc.c;
      this.u = iv.c;
      this.ay = dir.e;
      akn.a $$2 = new akn.a(this);
      $$2.a(am, (byte)0);
      $$2.a(aM, this.cq());
      $$2.a(aO, false);
      $$2.a(aN, Optional.empty());
      $$2.a(aP, false);
      $$2.a(aQ, false);
      $$2.a(aq, bxv.a);
      $$2.a(aR, 0);
      this.a($$2);
      this.al = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.bb = this.ba.c();
   }

   public boolean a(iv $$0, eat $$1) {
      ffw $$2 = $$1.b(this.dU(), $$0, ffh.a(this)).a($$0);
      return fft.c($$2, fft.a(this.cQ()), ffg.i);
   }

   public int f_() {
      fgj $$0 = this.cp();
      return $$0 != null && $$0.o().f() != null ? $$0.o().f() : 16777215;
   }

   public boolean V_() {
      return false;
   }

   public final void al() {
      if (this.bY()) {
         this.bM();
      }

      if (this.bX()) {
         this.bN();
      }
   }

   public void e(double $$0, double $$1, double $$2) {
      this.aT.e(new ffc($$0, $$1, $$2));
   }

   public ait am() {
      return this.aT;
   }

   public bwr<?> an() {
      return this.o;
   }

   @Override
   public int ao() {
      return this.p;
   }

   public void e(int $$0) {
      this.p = $$0;
   }

   public Set<String> ap() {
      return this.aX;
   }

   public boolean a(String $$0) {
      return this.aX.size() >= 1024 ? false : this.aX.add($$0);
   }

   public boolean b(String $$0) {
      return this.aX.remove($$0);
   }

   public void c(arq $$0) {
      this.a(bwi.d.a);
      this.a(eft.p);
   }

   public final void aq() {
      this.a(bwi.d.b);
   }

   protected abstract void a(akn.a var1);

   public akn ar() {
      return this.al;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bwi ? ((bwi)$$0).p == this.p : false;
   }

   @Override
   public int hashCode() {
      return this.p;
   }

   public void a(bwi.d $$0) {
      this.c($$0);
   }

   public void as() {
   }

   public void b(bwi.d $$0) {
   }

   public void b(bxv $$0) {
      this.al.a(aq, $$0);
   }

   public bxv at() {
      return this.al.a(aq);
   }

   public boolean c(bxv $$0) {
      return this.at() == $$0;
   }

   public boolean a(bwi $$0, double $$1) {
      return this.ds().a((jp)$$0.ds(), $$1);
   }

   public boolean a(bwi $$0, double $$1, double $$2) {
      double $$3 = $$0.dz() - this.dz();
      double $$4 = $$0.dB() - this.dB();
      double $$5 = $$0.dF() - this.dF();
      return azm.e($$3, $$5) < azm.k($$1) && azm.k($$4) < azm.k($$2);
   }

   protected void b(float $$0, float $$1) {
      this.w($$0 % 360.0F);
      this.x($$1 % 360.0F);
   }

   public final void b(ffc $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      this.a(this.au());
   }

   protected final fex au() {
      return this.c(this.t);
   }

   protected fex c(ffc $$0) {
      return this.ba.a($$0);
   }

   protected void av() {
      this.a_(this.t.d, this.t.e, this.t.f);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.x(this.dM() + $$2);
      this.w(this.dK() + $$3);
      this.x(azm.a(this.dM(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = azm.a(this.O, -90.0F, 90.0F);
      if (this.r != null) {
         this.r.k(this);
      }
   }

   public void h() {
      this.aw();
   }

   public void aw() {
      bqq $$0 = bqp.a();
      $$0.a("entityBaseTick");
      this.bg = null;
      if (this.bX() && this.dj().dP()) {
         this.bN();
      }

      if (this.J > 0) {
         this.J--;
      }

      this.bU();
      if (this.bs()) {
         this.bt();
      }

      this.aw = this.av;
      this.av = false;
      this.bn();
      this.o();
      this.bm();
      if (this.dU() instanceof arq $$1) {
         if (this.aG > 0) {
            if (this.bg()) {
               this.h(this.aG - 4);
               if (this.aG < 0) {
                  this.aF();
               }
            } else {
               if (this.aG % 20 == 0 && !this.bu()) {
                  this.a($$1, this.dV().d(), 1.0F);
               }

               this.h(this.aG - 1);
            }
         }
      } else {
         this.aF();
      }

      if (this.bu()) {
         this.Z *= 0.5;
      }

      this.ax();
      if (!this.dU().C) {
         this.c(this.aG > 0);
      }

      this.ak = false;
      if (this.dU() instanceof arq $$2 && this instanceof bxh) {
         bxh.a_($$2, (bwi)((bxh)this));
      }

      $$0.c();
   }

   public void c(boolean $$0) {
      this.b(0, $$0 || this.bf);
   }

   public void ax() {
      if (this.dB() < (double)(this.dU().G_() - 64)) {
         this.aG();
      }
   }

   public void ay() {
      this.aU = this.bV();
   }

   public void f(int $$0) {
      this.aU = $$0;
   }

   public int az() {
      return this.aU;
   }

   public boolean aA() {
      return this.aU > 0;
   }

   protected void M() {
      if (this.aA()) {
         this.aU--;
      }
   }

   public void aB() {
      if (!this.bg()) {
         this.e(15.0F);
      }
   }

   public void aC() {
      if (!this.bg()) {
         if (this.dU() instanceof arq $$0 && this.a($$0, this.dV().e(), 4.0F) && this.aD() && !this.aZ()) {
            $$0.a(null, this.dz(), this.dB(), this.dF(), awn.kE, this.dl(), 0.4F, 2.0F + this.ae.i() * 0.4F);
         }
      }
   }

   protected boolean aD() {
      return true;
   }

   public final void e(float $$0) {
      this.g(azm.d($$0 * 20.0F));
   }

   public void g(int $$0) {
      if (this.aG < $$0) {
         this.h($$0);
      }

      this.cs();
   }

   public void h(int $$0) {
      this.aG = $$0;
   }

   public int aE() {
      return this.aG;
   }

   public void aF() {
      this.h(0);
   }

   protected void aG() {
      this.aq();
   }

   public boolean f(double $$0, double $$1, double $$2) {
      return this.b(this.cQ().d($$0, $$1, $$2));
   }

   private boolean b(fex $$0) {
      return this.dU().a(this, $$0) && !this.dU().d($$0);
   }

   public void d(boolean $$0) {
      this.aD = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, ffc $$1) {
      this.a($$0, this.P, $$1);
   }

   public void a(boolean $$0, boolean $$1, ffc $$2) {
      this.aD = $$0;
      this.P = $$1;
      this.b($$0, $$2);
   }

   public boolean d(iv $$0) {
      return this.ax.isPresent() && this.ax.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable ffc $$1) {
      if ($$0) {
         fex $$2 = this.cQ();
         fex $$3 = new fex($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<iv> $$4 = this.s.h(this, $$3);
         if ($$4.isPresent() || this.bc) {
            this.ax = $$4;
         } else if ($$1 != null) {
            fex $$5 = $$3.d(-$$1.d, 0.0, -$$1.f);
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

   public boolean aH() {
      return this.aD;
   }

   public void a(bxn $$0, ffc $$1) {
      if (this.ad) {
         this.a_(this.dz() + $$1.d, this.dB() + $$1.e, this.dF() + $$1.f);
      } else {
         if ($$0 == bxn.c) {
            $$1 = this.e($$1);
            if ($$1.equals(ffc.c)) {
               return;
            }
         }

         bqq $$2 = bqp.a();
         $$2.a("move");
         if (this.U.h() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = ffc.c;
            this.i(ffc.c);
         }

         $$1 = this.a($$1, $$0);
         ffc $$3 = this.a($$1);
         double $$4 = $$3.h();
         if ($$4 > 1.0E-7 || $$1.h() - $$4 < 1.0E-7) {
            if (this.Z != 0.0 && $$4 >= 1.0) {
               fey $$5 = this.dU().a(new dit(this.ds(), this.ds().e($$3), dit.a.d, dit.b.d, this));
               if ($$5.d() != ffa.a.a) {
                  this.k();
               }
            }

            this.a_(this.dz() + $$3.d, this.dB() + $$3.e, this.dF() + $$3.f);
         }

         $$2.c();
         $$2.a("rest");
         boolean $$6 = !azm.b($$1.d, $$3.d);
         boolean $$7 = !azm.b($$1.f, $$3.f);
         this.P = $$6 || $$7;
         if (Math.abs($$1.e) > 0.0 || this.df()) {
            this.Q = $$1.e != $$3.e;
            this.R = this.Q && $$1.e < 0.0;
            this.a(this.R, this.P, $$3);
         }

         if (this.P) {
            this.S = this.d($$3);
         } else {
            this.S = false;
         }

         iv $$8 = this.aN();
         eat $$9 = this.dU().a_($$8);
         if (this.df()) {
            this.a($$3.e, this.aH(), $$9, $$8);
         }

         if (this.dP()) {
            $$2.c();
         } else {
            if (this.P) {
               ffc $$10 = this.dx();
               this.n($$6 ? 0.0 : $$10.d, $$10.e, $$7 ? 0.0 : $$10.f);
            }

            if (this.dh()) {
               dmr $$11 = $$9.b();
               if ($$1.e != $$3.e) {
                  $$11.a(this.dU(), this);
               }
            }

            if (!this.dU().w_() || this.df()) {
               bwi.c $$12 = this.be();
               if ($$12.a() && !this.bX()) {
                  this.a($$12, $$3, $$8, $$9);
               }
            }

            float $$13 = this.aR();
            this.i(this.dx().d((double)$$13, 1.0, (double)$$13));
            $$2.c();
         }
      }
   }

   private void a(bwi.c $$0, ffc $$1, iv $$2, eat $$3) {
      float $$4 = 0.6F;
      float $$5 = (float)($$1.g() * 0.6F);
      float $$6 = (float)($$1.i() * 0.6F);
      iv $$7 = this.aP();
      eat $$8 = this.dU().a_($$7);
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
            this.aF = this.aS();
         } else if (this.bh()) {
            this.aF = this.aS();
            if ($$0.c()) {
               this.aW();
            }

            if ($$0.b()) {
               this.a(eft.Q);
            }
         }
      } else if ($$8.l()) {
         this.aM();
      }
   }

   public void aI() {
      this.a(this.bz(), this.t);
   }

   public void a(ffc $$0, ffc $$1) {
      if (this.aJ()) {
         if (this.aH()) {
            iv $$2 = this.aN();
            eat $$3 = this.dU().a_($$2);
            $$3.b().a(this.dU(), $$2, $$3, this);
         }

         this.bh.add(new bwi.b($$0, $$1));
         List<bwi.b> $$4 = List.copyOf(this.bh);
         this.bh.clear();
         boolean $$5 = this.bW();
         boolean $$6 = this.dJ();
         this.a($$4, this.bj);
         this.bj.a(this);
         if ($$5 && !this.bW() || $$6 && !this.dJ()) {
            this.aK();
         }

         if ($$5 && !this.bW() && this.aG <= 0) {
            this.h(-this.dm());
         }
      }
   }

   protected boolean aJ() {
      return !this.dP() && !this.ad;
   }

   private boolean c(eat $$0) {
      return $$0.a(axc.aS) || $$0.a(dmt.rx);
   }

   private boolean a(iv $$0, eat $$1, boolean $$2, boolean $$3, ffc $$4) {
      if ($$1.l()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aH() || $$5 || this.cg() && $$4.e == 0.0 || this.co()) && !this.ci()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dU().a(eft.P, this.ds(), eft.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean d(ffc $$0) {
      return false;
   }

   protected void aK() {
      if (!this.s.w_()) {
         this.dU().a(null, this.dz(), this.dB(), this.dF(), awn.kJ, this.dl(), 0.7F, 1.6F + (this.ae.i() - this.ae.i()) * 0.4F);
      }
   }

   public void aL() {
      if (this.bW()) {
         this.aK();
      }

      this.aF();
   }

   protected void aM() {
      if (this.aY()) {
         this.aX();
         if (this.be().b()) {
            this.a(eft.x);
         }
      }
   }

   @Deprecated
   public iv aN() {
      return this.f(0.2F);
   }

   public iv aO() {
      return this.f(0.500001F);
   }

   public iv aP() {
      return this.f(1.0E-5F);
   }

   protected iv f(float $$0) {
      if (this.ax.isPresent()) {
         iv $$1 = this.ax.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            eat $$2 = this.dU().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(axc.U)) && !$$2.a(axc.N) && !($$2.b() instanceof dps) ? $$1.h(azm.a(this.t.e - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = azm.a(this.t.d);
         int $$4 = azm.a(this.t.e - (double)$$0);
         int $$5 = azm.a(this.t.f);
         return new iv($$3, $$4, $$5);
      }
   }

   protected float aQ() {
      float $$0 = this.dU().a_(this.du()).b().j();
      float $$1 = this.dU().a_(this.aO()).b().j();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aR() {
      eat $$0 = this.dU().a_(this.du());
      float $$1 = $$0.b().i();
      if (!$$0.a(dmt.J) && !$$0.a(dmt.nJ)) {
         return (double)$$1 == 1.0 ? this.dU().a_(this.aO()).b().i() : $$1;
      } else {
         return $$1;
      }
   }

   protected ffc a(ffc $$0, bxn $$1) {
      return $$0;
   }

   protected ffc e(ffc $$0) {
      if ($$0.h() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dU().ae();
         if ($$1 != this.aZ) {
            Arrays.fill(this.aY, 0.0);
            this.aZ = $$1;
         }

         if ($$0.d != 0.0) {
            double $$2 = this.a(jb.a.a, $$0.d);
            return Math.abs($$2) <= 1.0E-5F ? ffc.c : new ffc($$2, 0.0, 0.0);
         } else if ($$0.e != 0.0) {
            double $$3 = this.a(jb.a.b, $$0.e);
            return Math.abs($$3) <= 1.0E-5F ? ffc.c : new ffc(0.0, $$3, 0.0);
         } else if ($$0.f != 0.0) {
            double $$4 = this.a(jb.a.c, $$0.f);
            return Math.abs($$4) <= 1.0E-5F ? ffc.c : new ffc(0.0, 0.0, $$4);
         } else {
            return ffc.c;
         }
      }
   }

   private double a(jb.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = azm.a($$1 + this.aY[$$2], -0.51, 0.51);
      $$1 = $$3 - this.aY[$$2];
      this.aY[$$2] = $$3;
      return $$1;
   }

   private ffc a(ffc $$0) {
      fex $$1 = this.cQ();
      List<ffw> $$2 = this.dU().c(this, $$1.b($$0));
      ffc $$3 = $$0.h() == 0.0 ? $$0 : a(this, $$0, $$1, this.dU(), $$2);
      boolean $$4 = $$0.d != $$3.d;
      boolean $$5 = $$0.e != $$3.e;
      boolean $$6 = $$0.f != $$3.f;
      boolean $$7 = $$5 && $$0.e < 0.0;
      if (this.dO() > 0.0F && ($$7 || this.aH()) && ($$4 || $$6)) {
         fex $$8 = $$7 ? $$1.d(0.0, $$3.e, 0.0) : $$1;
         fex $$9 = $$8.b($$0.d, (double)this.dO(), $$0.f);
         if (!$$7) {
            $$9 = $$9.b(0.0, -1.0E-5F, 0.0);
         }

         List<ffw> $$10 = a(this, this.s, $$2, $$9);
         float $$11 = (float)$$3.e;
         float[] $$12 = a($$8, $$10, this.dO(), $$11);

         for (float $$13 : $$12) {
            ffc $$14 = a(new ffc($$0.d, (double)$$13, $$0.f), $$8, $$10);
            if ($$14.j() > $$3.j()) {
               double $$15 = $$1.b - $$8.b;
               return $$14.b(0.0, -$$15, 0.0);
            }
         }
      }

      return $$3;
   }

   private static float[] a(fex $$0, List<ffw> $$1, float $$2, float $$3) {
      FloatSet $$4 = new FloatArraySet(4);

      for (ffw $$5 : $$1) {
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

   public static ffc a(@Nullable bwi $$0, ffc $$1, fex $$2, djm $$3, List<ffw> $$4) {
      List<ffw> $$5 = a($$0, $$3, $$4, $$2.b($$1));
      return a($$1, $$2, $$5);
   }

   private static List<ffw> a(@Nullable bwi $$0, djm $$1, List<ffw> $$2, fex $$3) {
      Builder<ffw> $$4 = ImmutableList.builderWithExpectedSize($$2.size() + 1);
      if (!$$2.isEmpty()) {
         $$4.addAll($$2);
      }

      ecl $$5 = $$1.A_();
      boolean $$6 = $$0 != null && $$5.a($$0, $$3);
      if ($$6) {
         $$4.add($$5.c());
      }

      $$4.addAll($$1.e($$0, $$3));
      return $$4.build();
   }

   private static ffc a(ffc $$0, fex $$1, List<ffw> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.d;
         double $$4 = $$0.e;
         double $$5 = $$0.f;
         if ($$4 != 0.0) {
            $$4 = fft.a(jb.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = fft.a(jb.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = fft.a(jb.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = fft.a(jb.a.c, $$1, $$2, $$5);
         }

         return new ffc($$3, $$4, $$5);
      }
   }

   protected float aS() {
      return (float)((int)this.X + 1);
   }

   protected awm aT() {
      return awn.kN;
   }

   protected awm aU() {
      return awn.kM;
   }

   protected awm aV() {
      return awn.kM;
   }

   public void b(ffc $$0, ffc $$1) {
      this.bh.add(new bwi.b($$0, $$1));
   }

   private void a(List<bwi.b> $$0, bxb.a $$1) {
      if (this.aJ()) {
         LongSet $$2 = this.bi;

         for (bwi.b $$3 : $$0) {
            ffc $$4 = $$3.a();
            ffc $$5 = $$3.b();
            fex $$6 = this.c($$5).h(1.0E-5F);
            diq.a($$4, $$5, $$6, ($$4x, $$5x) -> {
               if (this.bI()) {
                  eat $$6x = this.dU().a_($$4x);
                  if (!$$6x.l()) {
                     if ($$2.add($$4x.a())) {
                        ffw $$7 = $$6x.a(this.dU(), $$4x, this);
                        boolean $$8 = $$7 == fft.b() || this.a($$4, $$5, $$7.a(new ffc($$4x)).e());
                        if ($$8) {
                           try {
                              $$1.a($$5x);
                              $$6x.a(this.dU(), $$4x, this, $$1);
                              this.a($$6x);
                           } catch (Throwable var14) {
                              p $$10 = p.a(var14, "Colliding entity with block");
                              q $$11 = $$10.a("Block being collided with");
                              q.a($$11, this.dU(), $$4x, $$6x);
                              q $$12 = $$10.a("Entity being checked for collision");
                              this.a($$12);
                              throw new aa($$10);
                           }
                        }

                        boolean $$13 = this.a($$6x.y(), $$4x, $$4, $$5);
                        if ($$13) {
                           $$1.a($$5x);
                           $$6x.y().a(this.dU(), $$4x, this, $$1);
                        }
                     }
                  }
               }
            });
         }

         $$2.clear();
      }
   }

   private boolean a(exa $$0, iv $$1, ffc $$2, ffc $$3) {
      fex $$4 = $$0.e(this.dU(), $$1);
      return $$4 != null && this.a($$2, $$3, List.of($$4));
   }

   private boolean a(ffc $$0, ffc $$1, List<fex> $$2) {
      fex $$3 = this.c($$0);
      ffc $$4 = $$1.d($$0);
      return $$3.a($$4, $$2);
   }

   protected void a(eat $$0) {
   }

   public iv a(arq $$0, iv $$1) {
      iv $$2 = $$0.aa();
      ffc $$3 = $$2.b();
      int $$4 = $$0.m($$2).a(egs.a.f, $$2.u(), $$2.w()) + 1;
      return iv.a($$3.d, (double)$$4, $$3.f);
   }

   public void a(jf<eft> $$0, @Nullable bwi $$1) {
      this.dU().a($$1, $$0, this.t);
   }

   public void a(jf<eft> $$0) {
      this.a($$0, this);
   }

   private void c(iv $$0, eat $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.j();
      }
   }

   protected void aW() {
      bwi $$0 = Objects.requireNonNullElse(this.cV(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      ffc $$2 = $$0.dx();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      this.g($$3);
   }

   protected iv e(iv $$0) {
      iv $$1 = $$0.d();
      eat $$2 = this.dU().a_($$1);
      return !$$2.a(axc.bq) && !$$2.a(axc.br) ? $$0 : $$1;
   }

   protected void a(eat $$0, eat $$1) {
      duo $$2 = $$0.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(eat $$0) {
      duo $$1 = $$0.A();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(iv $$0, eat $$1) {
      duo $$2 = $$1.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(eat $$0) {
      return $$0.a(axc.bp) && this.af >= this.be + 20;
   }

   private void j() {
      this.bd = this.bd * (float)Math.pow(0.997, (double)(this.af - this.be));
      this.bd = Math.min(1.0F, this.bd + 0.07F);
      float $$0 = 0.5F + this.bd * this.ae.i() * 1.2F;
      float $$1 = 0.1F + this.bd * 1.2F;
      this.a(awn.E, $$1, $$0);
      this.be = this.af;
   }

   protected void g(float $$0) {
      this.a(this.aT(), $$0, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
   }

   protected void aX() {
   }

   protected boolean aY() {
      return false;
   }

   public void a(awm $$0, float $$1, float $$2) {
      if (!this.aZ()) {
         this.dU().a(null, this.dz(), this.dB(), this.dF(), $$0, this.dl(), $$1, $$2);
      }
   }

   public void a(awm $$0) {
      if (!this.aZ()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean aZ() {
      return this.al.a(aP);
   }

   public void e(boolean $$0) {
      this.al.a(aP, $$0);
   }

   public boolean ba() {
      return this.al.a(aQ);
   }

   public void f(boolean $$0) {
      this.al.a(aQ, $$0);
   }

   protected double bb() {
      return 0.0;
   }

   public final double bc() {
      return this.ba() ? 0.0 : this.bb();
   }

   protected void bd() {
      double $$0 = this.bc();
      if ($$0 != 0.0) {
         this.i(this.dx().b(0.0, -$$0, 0.0));
      }
   }

   protected bwi.c be() {
      return bwi.c.d;
   }

   public boolean bf() {
      return false;
   }

   public final void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dn()) {
         this.b($$3, new ffc($$0, $$1, $$2));
         iv $$4 = this.aN();
         eat $$5 = this.dU().a_($$4);
         this.a($$1, $$3, $$5, $$4);
      }
   }

   protected void a(double $$0, boolean $$1, eat $$2, iv $$3) {
      if (!this.bh() && $$0 < 0.0) {
         this.Z -= (double)((float)$$0);
      }

      if ($$1) {
         if (this.Z > 0.0) {
            $$2.b().a(this.dU(), $$2, $$3, this, this.Z);
            this.dU().a(eft.A, this.t, eft.a.a(this, this.ax.<eat>map($$0x -> this.dU().a_($$0x)).orElse($$2)));
         }

         this.k();
      }
   }

   public boolean bg() {
      return this.an().d();
   }

   public boolean a(double $$0, float $$1, bux $$2) {
      if (this.o.a(axf.o)) {
         return false;
      } else {
         this.b($$0, $$1, $$2);
         return false;
      }
   }

   protected void b(double $$0, float $$1, bux $$2) {
      if (this.bY()) {
         for (bwi $$3 : this.cX()) {
            $$3.a($$0, $$1, $$2);
         }
      }
   }

   public boolean bh() {
      return this.ag;
   }

   boolean bi() {
      iv $$0 = this.du();
      return this.dU().r($$0) || this.dU().r(iv.a((double)$$0.u(), this.cQ().e, (double)$$0.w()));
   }

   public boolean bj() {
      return this.bh() || this.bi();
   }

   public boolean bk() {
      return this.bh() || this.bu();
   }

   public boolean bl() {
      return this.ai && this.bh();
   }

   public void bm() {
      if (this.ci()) {
         this.i(this.ch() && this.bh() && !this.bX());
      } else {
         this.i(this.ch() && this.bl() && !this.bX() && this.dU().b_(this.u).a(axh.a));
      }
   }

   protected boolean bn() {
      this.ah.clear();
      this.bo();
      double $$0 = this.dU().B_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(axh.b, $$0);
      return this.bh() || $$1;
   }

   void bo() {
      if (this.dj() instanceof ctx $$0 && !$$0.bl()) {
         this.ag = false;
         return;
      }

      if (this.a(axh.a, 0.014)) {
         if (!this.ag && !this.ak) {
            this.bp();
         }

         this.k();
         this.ag = true;
      } else {
         this.ag = false;
      }
   }

   private void o() {
      this.ai = this.a(axh.a);
      this.aH.clear();
      double $$0 = this.dD();
      if (this.dj() instanceof ctx $$2 && !$$2.bl() && $$2.cQ().e >= $$0 && $$2.cQ().b <= $$0) {
         return;
      }

      iv $$3 = iv.a(this.dz(), $$0, this.dF());
      exa $$4 = this.dU().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a(this.dU(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aH::add);
      }
   }

   protected void bp() {
      bwi $$0 = Objects.requireNonNullElse(this.cV(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      ffc $$2 = $$0.dx();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aU(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      } else {
         this.a(this.aV(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      }

      float $$4 = (float)azm.a(this.dB());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.ba.a() * 20.0F; $$5++) {
         double $$6 = (this.ae.j() * 2.0 - 1.0) * (double)this.ba.a();
         double $$7 = (this.ae.j() * 2.0 - 1.0) * (double)this.ba.a();
         this.dU().a(ly.d, this.dz() + $$6, (double)($$4 + 1.0F), this.dF() + $$7, $$2.d, $$2.e - this.ae.j() * 0.2F, $$2.f);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.ba.a() * 20.0F; $$8++) {
         double $$9 = (this.ae.j() * 2.0 - 1.0) * (double)this.ba.a();
         double $$10 = (this.ae.j() * 2.0 - 1.0) * (double)this.ba.a();
         this.dU().a(ly.ap, this.dz() + $$9, (double)($$4 + 1.0F), this.dF() + $$10, $$2.d, $$2.e, $$2.f);
      }

      this.a(eft.O);
   }

   @Deprecated
   protected eat bq() {
      return this.dU().a_(this.aN());
   }

   public eat br() {
      return this.dU().a_(this.aP());
   }

   public boolean bs() {
      return this.ch() && !this.bh() && !this.V_() && !this.cg() && !this.bu() && this.bI();
   }

   protected void bt() {
      iv $$0 = this.aN();
      eat $$1 = this.dU().a_($$0);
      if ($$1.o() != dte.a) {
         ffc $$2 = this.dx();
         iv $$3 = this.du();
         double $$4 = this.dz() + (this.ae.j() - 0.5) * (double)this.ba.a();
         double $$5 = this.dF() + (this.ae.j() - 0.5) * (double)this.ba.a();
         if ($$3.u() != $$0.u()) {
            $$4 = azm.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = azm.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dU().a(new lq(ly.b, $$1), $$4, this.dB() + 0.1, $$5, $$2.d * -4.0, 1.5, $$2.f * -4.0);
      }
   }

   public boolean a(axr<ewz> $$0) {
      return this.aH.contains($$0);
   }

   public boolean bu() {
      return !this.ak && this.ah.getDouble(axh.b) > 0.0;
   }

   public void a(float $$0, ffc $$1) {
      ffc $$2 = a($$1, $$0, this.dK());
      this.i(this.dx().e($$2));
   }

   protected static ffc a(ffc $$0, float $$1, float $$2) {
      double $$3 = $$0.h();
      if ($$3 < 1.0E-7) {
         return ffc.c;
      } else {
         ffc $$4 = ($$3 > 1.0 ? $$0.d() : $$0).c((double)$$1);
         float $$5 = azm.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = azm.b($$2 * (float) (Math.PI / 180.0));
         return new ffc($$4.d * (double)$$6 - $$4.f * (double)$$5, $$4.e, $$4.f * (double)$$6 + $$4.d * (double)$$5);
      }
   }

   @Deprecated
   public float bv() {
      return this.dU().f(this.dy(), this.dE()) ? this.dU().y(iv.a(this.dz(), this.dD(), this.dF())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.g($$0, $$1, $$2);
      this.c($$3, $$4);
   }

   public void c(float $$0, float $$1) {
      this.w($$0 % 360.0F);
      this.x(azm.a($$1, -90.0F, 90.0F) % 360.0F);
      this.N = this.dK();
      this.O = this.dM();
   }

   public void g(double $$0, double $$1, double $$2) {
      double $$3 = azm.a($$0, -3.0E7, 3.0E7);
      double $$4 = azm.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void f(ffc $$0) {
      this.d($$0.d, $$0.e, $$0.f);
   }

   public void d(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dK(), this.dM());
   }

   public void a(iv $$0, float $$1, float $$2) {
      this.b($$0.c(), $$1, $$2);
   }

   public void b(ffc $$0, float $$1, float $$2) {
      this.b($$0.d, $$0.e, $$0.f, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.o($$0, $$1, $$2);
      this.w($$3);
      this.x($$4);
      this.bw();
      this.av();
   }

   public final void bw() {
      this.bx();
      this.by();
   }

   public final void c(ffc $$0, float $$1, float $$2) {
      this.k($$0);
      this.f($$1, $$2);
   }

   protected void bx() {
      this.k(this.t);
   }

   public void by() {
      this.f(this.dK(), this.dM());
   }

   private void k(ffc $$0) {
      this.K = this.aa = $$0.d;
      this.L = this.ab = $$0.e;
      this.M = this.ac = $$0.f;
   }

   private void f(float $$0, float $$1) {
      this.N = $$0;
      this.O = $$1;
   }

   public final ffc bz() {
      return new ffc(this.aa, this.ab, this.ac);
   }

   public float f(bwi $$0) {
      float $$1 = (float)(this.dz() - $$0.dz());
      float $$2 = (float)(this.dB() - $$0.dB());
      float $$3 = (float)(this.dF() - $$0.dF());
      return azm.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double h(double $$0, double $$1, double $$2) {
      double $$3 = this.dz() - $$0;
      double $$4 = this.dB() - $$1;
      double $$5 = this.dF() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(bwi $$0) {
      return this.g($$0.ds());
   }

   public double g(ffc $$0) {
      double $$1 = this.dz() - $$0.d;
      double $$2 = this.dB() - $$0.e;
      double $$3 = this.dF() - $$0.f;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void a_(crm $$0) {
   }

   public void h(bwi $$0) {
      if (!this.z($$0)) {
         if (!$$0.ad && !this.ad) {
            double $$1 = $$0.dz() - this.dz();
            double $$2 = $$0.dF() - this.dF();
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
               if (!this.bY() && this.bF()) {
                  this.i(-$$1, 0.0, -$$2);
               }

               if (!$$0.bY() && $$0.bF()) {
                  $$0.i($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void h(ffc $$0) {
      this.i($$0.d, $$0.e, $$0.f);
   }

   public void i(double $$0, double $$1, double $$2) {
      this.i(this.dx().b($$0, $$1, $$2));
      this.ar = true;
   }

   protected void bA() {
      this.T = true;
   }

   @Deprecated
   public final void a(bux $$0, float $$1) {
      if (this.s instanceof arq $$2) {
         this.a($$2, $$0, $$1);
      }
   }

   @Deprecated
   public final boolean b(bux $$0, float $$1) {
      return this.s instanceof arq $$2 ? this.a($$2, $$0, $$1) : this.b($$0);
   }

   public abstract boolean a(arq var1, bux var2, float var3);

   public boolean b(bux $$0) {
      return false;
   }

   public final ffc h(float $$0) {
      return this.d(this.i($$0), this.j($$0));
   }

   public jb bB() {
      return jb.a(this.h(1.0F));
   }

   public float i(float $$0) {
      return this.k($$0);
   }

   public float j(float $$0) {
      return this.l($$0);
   }

   public float k(float $$0) {
      return $$0 == 1.0F ? this.dM() : azm.h($$0, this.O, this.dM());
   }

   public float l(float $$0) {
      return $$0 == 1.0F ? this.dK() : azm.i($$0, this.N, this.dK());
   }

   public final ffc d(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = azm.b($$3);
      float $$5 = azm.a($$3);
      float $$6 = azm.b($$2);
      float $$7 = azm.a($$2);
      return new ffc((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final ffc m(float $$0) {
      return this.e(this.i($$0), this.j($$0));
   }

   protected final ffc e(float $$0, float $$1) {
      return this.d($$0 - 90.0F, $$1);
   }

   public final ffc bC() {
      return new ffc(this.dz(), this.dD(), this.dF());
   }

   public final ffc n(float $$0) {
      double $$1 = azm.d((double)$$0, this.K, this.dz());
      double $$2 = azm.d((double)$$0, this.L, this.dB()) + (double)this.cR();
      double $$3 = azm.d((double)$$0, this.M, this.dF());
      return new ffc($$1, $$2, $$3);
   }

   public ffc o(float $$0) {
      return this.n($$0);
   }

   public final ffc p(float $$0) {
      double $$1 = azm.d((double)$$0, this.K, this.dz());
      double $$2 = azm.d((double)$$0, this.L, this.dB());
      double $$3 = azm.d((double)$$0, this.M, this.dF());
      return new ffc($$1, $$2, $$3);
   }

   public ffa a(double $$0, float $$1, boolean $$2) {
      ffc $$3 = this.n($$1);
      ffc $$4 = this.h($$1);
      ffc $$5 = $$3.b($$4.d * $$0, $$4.e * $$0, $$4.f * $$0);
      return this.dU().a(new dit($$3, $$5, dit.a.b, $$2 ? dit.b.c : dit.b.a, this));
   }

   public boolean bD() {
      return this.bI() && this.bE();
   }

   public boolean bE() {
      return false;
   }

   public boolean bF() {
      return false;
   }

   public void a(bwi $$0, bux $$1) {
      if ($$0 instanceof arr) {
         aq.d.a((arr)$$0, this, $$1);
      }
   }

   public boolean j(double $$0, double $$1, double $$2) {
      double $$3 = this.dz() - $$0;
      double $$4 = this.dB() - $$1;
      double $$5 = this.dF() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cQ().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * n;
      return $$0 < $$1 * $$1;
   }

   public boolean d(tz $$0) {
      if (this.aE != null && !this.aE.b()) {
         return false;
      } else {
         String $$1 = this.bH();
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
      return this.bX() ? false : this.d($$0);
   }

   public tz f(tz $$0) {
      try {
         if (this.r != null) {
            $$0.a("Pos", ffc.a, new ffc(this.r.dz(), this.dB(), this.r.dF()));
         } else {
            $$0.a("Pos", ffc.a, this.ds());
         }

         $$0.a("Motion", ffc.a, this.dx());
         $$0.a("Rotation", ffb.i, new ffb(this.dK(), this.dM()));
         $$0.a("fall_distance", this.Z);
         $$0.a("Fire", (short)this.aG);
         $$0.a("Air", (short)this.cr());
         $$0.a("OnGround", this.aH());
         $$0.a("Invulnerable", this.aV);
         $$0.a("PortalCooldown", this.aU);
         $$0.a("UUID", jz.a, this.cF());
         wy $$1 = this.ak();
         if ($$1 != null) {
            ale<uw> $$2 = this.dW().a(un.a);
            $$0.a("CustomName", xa.a, $$2, $$1);
         }

         if (this.cK()) {
            $$0.a("CustomNameVisible", this.cK());
         }

         if (this.aZ()) {
            $$0.a("Silent", this.aZ());
         }

         if (this.ba()) {
            $$0.a("NoGravity", this.ba());
         }

         if (this.aW) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.ct();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.ct());
         }

         if (this.bf) {
            $$0.a("HasVisualFire", this.bf);
         }

         if (!this.aX.isEmpty()) {
            $$0.a("Tags", c, List.copyOf(this.aX));
         }

         this.b($$0);
         if (this.bY()) {
            uf $$4 = new uf();

            for (bwi $$5 : this.cX()) {
               tz $$6 = new tz();
               if ($$5.d($$6)) {
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

   public void g(tz $$0) {
      try {
         ffc $$1 = $$0.<ffc>a("Pos", ffc.a).orElse(ffc.c);
         ffc $$2 = $$0.<ffc>a("Motion", ffc.a).orElse(ffc.c);
         ffb $$3 = $$0.<ffb>a("Rotation", ffb.i).orElse(ffb.a);
         this.n(Math.abs($$2.d) > 10.0 ? 0.0 : $$2.d, Math.abs($$2.e) > 10.0 ? 0.0 : $$2.e, Math.abs($$2.f) > 10.0 ? 0.0 : $$2.f);
         this.ar = true;
         double $$4 = 3.0000512E7;
         this.o(azm.a($$1.d, -3.0000512E7, 3.0000512E7), azm.a($$1.e, -2.0E7, 2.0E7), azm.a($$1.f, -3.0000512E7, 3.0000512E7));
         this.w($$3.j);
         this.x($$3.k);
         this.bw();
         this.r(this.dK());
         this.s(this.dK());
         this.Z = $$0.i("fall_distance");
         this.aG = $$0.e("Fire");
         if ($$0.c("Air")) {
            this.j($$0.e("Air"));
         }

         this.aD = $$0.o("OnGround");
         this.aV = $$0.o("Invulnerable");
         this.aU = $$0.f("PortalCooldown");
         $$0.<UUID>a("UUID", jz.a).ifPresent($$0x -> {
            this.at = $$0x;
            this.au = this.at.toString();
         });
         if (!Double.isFinite(this.dz()) || !Double.isFinite(this.dB()) || !Double.isFinite(this.dF())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dK()) && Double.isFinite((double)this.dM())) {
            this.av();
            this.b(this.dK(), this.dM());
            ale<uw> $$5 = this.dW().a(un.a);
            this.b($$0.<wy>a("CustomName", xa.a, $$5).orElse(null));
            this.o($$0.o("CustomNameVisible"));
            this.e($$0.o("Silent"));
            this.f($$0.o("NoGravity"));
            this.j($$0.o("Glowing"));
            this.k($$0.f("TicksFrozen"));
            this.bf = $$0.o("HasVisualFire");
            this.aX.clear();
            $$0.<Collection<? extends E>>a("Tags", c).ifPresent(this.aX::addAll);
            this.a($$0);
            if (this.bG()) {
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

   protected boolean bG() {
      return true;
   }

   @Nullable
   protected final String bH() {
      bwr<?> $$0 = this.an();
      alg $$1 = bwr.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(tz var1);

   protected abstract void b(tz var1);

   @Nullable
   public cnr a(arq $$0, djl $$1) {
      return this.a($$0, $$1, 0);
   }

   @Nullable
   public cnr a(arq $$0, djl $$1, int $$2) {
      return this.a($$0, new czn($$1), (float)$$2);
   }

   @Nullable
   public cnr a(arq $$0, czn $$1) {
      return this.a($$0, $$1, 0.0F);
   }

   @Nullable
   public cnr a(arq $$0, czn $$1, float $$2) {
      if ($$1.f()) {
         return null;
      } else {
         cnr $$3 = new cnr($$0, this.dz(), this.dB() + (double)$$2, this.dF(), $$1);
         $$3.j();
         $$0.b($$3);
         return $$3;
      }
   }

   public boolean bI() {
      return !this.dP();
   }

   public boolean bJ() {
      if (this.ad) {
         return false;
      } else {
         float $$0 = this.ba.a() * 0.8F;
         fex $$1 = fex.a(this.bC(), (double)$$0, 1.0E-6, (double)$$0);
         return iv.b($$1).anyMatch($$1x -> {
            eat $$2 = this.dU().a_($$1x);
            return !$$2.l() && $$2.j(this.dU(), $$1x) && fft.c($$2.g(this.dU(), $$1x).a($$1x), fft.a($$1), ffg.i);
         });
      }
   }

   public bug a(crm $$0, buf $$1) {
      if (this.bI() && this instanceof bxh $$2) {
         if ($$2.C() == $$0) {
            if (!this.dU().w_()) {
               if ($$0.fU()) {
                  $$2.z();
               } else {
                  $$2.y();
               }

               this.a(eft.r, $$0);
            }

            return bug.a.b();
         }

         czn $$3 = $$0.b($$1);
         if ($$3.a(czr.vV) && $$2.p()) {
            if (!this.dU().w_()) {
               $$2.a_($$0, true);
            }

            $$3.h(1);
            return bug.a;
         }
      }

      return bug.e;
   }

   public boolean i(bwi $$0) {
      return $$0.bK() && !this.z($$0);
   }

   public boolean bK() {
      return false;
   }

   public void r() {
      this.i(ffc.c);
      this.h();
      if (this.bX()) {
         this.dj().j(this);
      }
   }

   public final void j(bwi $$0) {
      if (this.y($$0)) {
         this.a($$0, bwi::a_);
      }
   }

   protected void a(bwi $$0, bwi.a $$1) {
      ffc $$2 = this.m($$0);
      ffc $$3 = $$0.l(this);
      $$1.accept($$0, $$2.d - $$3.d, $$2.e - $$3.e, $$2.f - $$3.f);
   }

   public void k(bwi $$0) {
   }

   public ffc l(bwi $$0) {
      return this.dr().b(bwj.b, 0, this.aA);
   }

   public ffc m(bwi $$0) {
      return this.ds().e(this.a($$0, this.ba, 1.0F));
   }

   protected ffc a(bwi $$0, bwl $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static ffc a(bwi $$0, bwi $$1, bwk $$2) {
      int $$3 = $$0.cX().indexOf($$1);
      return $$2.c(bwj.a, $$3, $$0.aA);
   }

   public boolean n(bwi $$0) {
      return this.a($$0, false);
   }

   public boolean bL() {
      return this instanceof bxj;
   }

   public boolean a(bwi $$0, boolean $$1) {
      if ($$0 == this.r) {
         return false;
      } else if (!$$0.bO()) {
         return false;
      } else if (!this.dU().w_() && !$$0.o.b()) {
         return false;
      } else {
         for (bwi $$2 = $$0; $$2.r != null; $$2 = $$2.r) {
            if ($$2.r == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bX()) {
               this.bN();
            }

            this.b(bxv.a);
            this.r = $$0;
            this.r.p(this);
            $$0.D().filter($$0x -> $$0x instanceof arr).forEach($$0x -> aq.U.a((arr)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bwi $$0) {
      return !this.cb() && this.J <= 0;
   }

   public void bM() {
      for (int $$0 = this.q.size() - 1; $$0 >= 0; $$0--) {
         ((bwi)this.q.get($$0)).bN();
      }
   }

   public void ab() {
      if (this.r != null) {
         bwi $$0 = this.r;
         this.r = null;
         $$0.q(this);
      }
   }

   public void bN() {
      this.ab();
   }

   protected void p(bwi $$0) {
      if ($$0.dj() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.q.isEmpty()) {
            this.q = ImmutableList.of($$0);
         } else {
            List<bwi> $$1 = Lists.newArrayList(this.q);
            if (!this.dU().C && $$0 instanceof crm && !(this.cY() instanceof crm)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.q = ImmutableList.copyOf($$1);
         }

         this.a(eft.s, $$0);
      }
   }

   protected void q(bwi $$0) {
      if ($$0.dj() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.q.size() == 1 && this.q.get(0) == $$0) {
            this.q = ImmutableList.of();
         } else {
            this.q = this.q.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(eft.q, $$0);
      }
   }

   protected boolean r(bwi $$0) {
      return this.q.isEmpty();
   }

   protected boolean bO() {
      return true;
   }

   public final boolean bP() {
      return this.N_() != null && this.N_().d();
   }

   public final void d(ffc $$0, float $$1, float $$2) {
      bxe $$3 = this.N_();
      if ($$3 != null) {
         $$3.a($$0, $$1, $$2);
      } else {
         this.b($$0);
         this.b($$1, $$2);
      }
   }

   @Nullable
   public bxe N_() {
      return null;
   }

   public void a(float $$0, int $$1) {
      this.r($$0);
   }

   public float bQ() {
      return 0.0F;
   }

   public ffc bR() {
      return this.d(this.dM(), this.dK());
   }

   public ffc a(czj $$0) {
      if (!(this instanceof crm $$1)) {
         return ffc.c;
      } else {
         boolean $$2 = $$1.fb().a($$0) && !$$1.fa().a($$0);
         bxa $$3 = $$2 ? $$1.fx().e() : $$1.fx();
         return this.d(0.0F, this.dK() + (float)($$3 == bxa.b ? 80 : -80)).c(0.5);
      }
   }

   public ffb bS() {
      return new ffb(this.dM(), this.dK());
   }

   public ffc bT() {
      return ffc.a(this.bS());
   }

   public void a(dsq $$0, iv $$1) {
      if (this.aA()) {
         this.ay();
      } else {
         if (this.as == null || !this.as.a($$0)) {
            this.as = new bxu($$0, $$1.j());
         } else if (!this.as.e()) {
            this.as.a($$1.j());
            this.as.a(true);
         }
      }
   }

   protected void bU() {
      if (this.dU() instanceof arq $$0) {
         this.M();
         if (this.as != null) {
            if (this.as.a($$0, this, this.n(false))) {
               bqq $$2 = bqp.a();
               $$2.a("portal");
               this.ay();
               eya $$3 = this.as.a($$0, this);
               if ($$3 != null) {
                  arq $$4 = $$3.b();
                  if ($$0.p().a((djm)$$4) && ($$4.aj() == $$0.aj() || this.a($$0, $$4))) {
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

   public int bV() {
      bwi $$0 = this.cY();
      return $$0 instanceof arr ? $$0.bV() : 300;
   }

   public void k(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
   }

   public void c(bux $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dqq.a(this);
      }
   }

   public void q(float $$0) {
   }

   public boolean bW() {
      boolean $$0 = this.dU() != null && this.dU().C;
      return !this.bg() && (this.aG > 0 || $$0 && this.i(0));
   }

   public boolean bX() {
      return this.dj() != null;
   }

   public boolean bY() {
      return !this.q.isEmpty();
   }

   public boolean bZ() {
      return this.an().a(axf.p);
   }

   public boolean ca() {
      return !this.an().a(axf.q);
   }

   public void g(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean cb() {
      return this.i(1);
   }

   public boolean cc() {
      return this.cb();
   }

   public boolean cd() {
      return this.cb();
   }

   public boolean ce() {
      return this.cb();
   }

   public boolean cf() {
      return this.cb();
   }

   public boolean cg() {
      return this.c(bxv.f);
   }

   public boolean ch() {
      return this.i(3);
   }

   public void h(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean ci() {
      return this.i(4);
   }

   public boolean cj() {
      return this.c(bxv.d);
   }

   public boolean ck() {
      return this.cj() && !this.bh();
   }

   public void i(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cl() {
      return this.aW;
   }

   public final void j(boolean $$0) {
      this.aW = $$0;
      this.b(6, this.cm());
   }

   public boolean cm() {
      return this.dU().w_() ? this.i(6) : this.aW;
   }

   public boolean cn() {
      return this.i(5);
   }

   public boolean d(crm $$0) {
      if ($$0.V_()) {
         return false;
      } else {
         fgj $$1 = this.cp();
         return $$1 != null && $$0 != null && $$0.cp() == $$1 && $$1.j() ? false : this.cn();
      }
   }

   public boolean co() {
      return false;
   }

   public void a(BiConsumer<efq<?>, arq> $$0) {
   }

   @Nullable
   public fgc cp() {
      return this.dU().R().e(this.cH());
   }

   public final boolean s(@Nullable bwi $$0) {
      return $$0 == null ? false : this == $$0 || this.t($$0) || $$0.t(this);
   }

   protected boolean t(bwi $$0) {
      return this.a($$0.cp());
   }

   public boolean a(@Nullable fgj $$0) {
      return this.cp() != null ? this.cp().a($$0) : false;
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

   public int cq() {
      return 300;
   }

   public int cr() {
      return this.al.a(aM);
   }

   public void j(int $$0) {
      this.al.a(aM, $$0);
   }

   public void cs() {
      this.k(0);
   }

   public int ct() {
      return this.al.a(aR);
   }

   public void k(int $$0) {
      this.al.a(aR, $$0);
   }

   public float cu() {
      int $$0 = this.cw();
      return (float)Math.min(this.ct(), $$0) / (float)$$0;
   }

   public boolean cv() {
      return this.ct() >= this.cw();
   }

   public int cw() {
      return 140;
   }

   public void a(arq $$0, bxi $$1) {
      this.h(this.aG + 1);
      if (this.aG == 0) {
         this.e(8.0F);
      }

      this.a($$0, this.dV().c(), 5.0F);
   }

   public void a(boolean $$0, iv $$1) {
      a(this, $$0, $$1);
   }

   protected static void a(bwi $$0, boolean $$1, iv $$2) {
      ffc $$3 = $$0.dx();
      double $$4;
      if ($$1) {
         $$4 = Math.max(-0.9, $$3.e - 0.03);
      } else {
         $$4 = Math.min(1.8, $$3.e + 0.1);
      }

      $$0.n($$3.d, $$4, $$3.f);
      a($$0.s, $$2);
   }

   protected static void a(djm $$0, iv $$1) {
      if ($$0 instanceof arq $$2) {
         for (int $$3 = 0; $$3 < 2; $$3++) {
            $$2.a(ly.ap, (double)$$1.u() + $$0.A.j(), (double)($$1.v() + 1), (double)$$1.w() + $$0.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            $$2.a(ly.d, (double)$$1.u() + $$0.A.j(), (double)($$1.v() + 1), (double)$$1.w() + $$0.A.j(), 1, 0.0, 0.01, 0.0, 0.2);
         }
      }
   }

   public void l(boolean $$0) {
      b(this, $$0);
   }

   protected static void b(bwi $$0, boolean $$1) {
      ffc $$2 = $$0.dx();
      double $$3;
      if ($$1) {
         $$3 = Math.max(-0.3, $$2.e - 0.03);
      } else {
         $$3 = Math.min(0.7, $$2.e + 0.06);
      }

      $$0.n($$2.d, $$3, $$2.f);
      $$0.k();
   }

   public boolean a(arq $$0, bxj $$1) {
      return true;
   }

   public void cx() {
      if (this.dx().b() > -0.5 && this.Z > 1.0) {
         this.Z = 1.0;
      }
   }

   public void k() {
      this.Z = 0.0;
   }

   protected void l(double $$0, double $$1, double $$2) {
      iv $$3 = iv.a($$0, $$1, $$2);
      ffc $$4 = new ffc($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      iv.a $$5 = new iv.a();
      jb $$6 = jb.b;
      double $$7 = Double.MAX_VALUE;

      for (jb $$8 : new jb[]{jb.c, jb.d, jb.e, jb.f, jb.b}) {
         $$5.a($$3, $$8);
         if (!this.dU().a_($$5).m(this.dU(), $$5)) {
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
      ffc $$13 = this.dx().c(0.75);
      if ($$6.o() == jb.a.a) {
         this.n((double)($$12 * $$11), $$13.e, $$13.f);
      } else if ($$6.o() == jb.a.b) {
         this.n($$13.d, (double)($$12 * $$11), $$13.f);
      } else if ($$6.o() == jb.a.c) {
         this.n($$13.d, $$13.e, (double)($$12 * $$11));
      }
   }

   public void a(eat $$0, ffc $$1) {
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
   public wy ai() {
      wy $$0 = this.ak();
      return $$0 != null ? a($$0) : this.cy();
   }

   protected wy cy() {
      return this.o.h();
   }

   public boolean u(bwi $$0) {
      return this == $$0;
   }

   public float cz() {
      return 0.0F;
   }

   public void r(float $$0) {
   }

   public void s(float $$0) {
   }

   public boolean cA() {
      return true;
   }

   public boolean v(bwi $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dU() == null ? "~NULL~" : this.dU().toString();
      return this.aE != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.ai().getString(),
            this.p,
            $$0,
            this.dz(),
            this.dB(),
            this.dF(),
            this.aE
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.ai().getString(),
            this.p,
            $$0,
            this.dz(),
            this.dB(),
            this.dF()
         );
   }

   protected final boolean d(bux $$0) {
      return this.dP() || this.aV && !$$0.a(axd.d) && !$$0.h() || $$0.a(axd.i) && this.bg() || $$0.a(axd.m) && this.an().a(axf.o);
   }

   public boolean cB() {
      return this.aV;
   }

   public void m(boolean $$0) {
      this.aV = $$0;
   }

   public void w(bwi $$0) {
      this.b($$0.dz(), $$0.dB(), $$0.dF(), $$0.dK(), $$0.dM());
   }

   public void x(bwi $$0) {
      tz $$1 = $$0.f(new tz());
      $$1.p("Dimension");
      this.g($$1);
      this.aU = $$0.aU;
      this.as = $$0.as;
   }

   @Nullable
   public bwi b(eya $$0) {
      if (this.dU() instanceof arq $$1 && !this.dP()) {
         arq $$3 = $$0.b();
         boolean $$4 = $$3.aj() != $$1.aj();
         if (!$$0.h()) {
            this.bN();
         }

         if ($$4) {
            return this.b($$3, $$0);
         }

         return this.a($$1, $$0);
      }

      return null;
   }

   private bwi a(arq $$0, eya $$1) {
      for (bwi $$2 : this.cX()) {
         $$2.b(this.a($$1, $$2));
      }

      bqq $$3 = bqp.a();
      $$3.a("teleportSameDimension");
      this.a(bxw.a($$1), $$1.i());
      if (!$$1.h()) {
         this.a($$1);
      }

      $$1.j().onTransition(this);
      $$3.c();
      return this;
   }

   private bwi b(arq $$0, eya $$1) {
      List<bwi> $$2 = this.cX();
      List<bwi> $$3 = new ArrayList<>($$2.size());
      this.bM();

      for (bwi $$4 : $$2) {
         bwi $$5 = $$4.b(this.a($$1, $$4));
         if ($$5 != null) {
            $$3.add($$5);
         }
      }

      bqq $$6 = bqp.a();
      $$6.a("teleportCrossDimension");
      bwi $$7 = this.an().a($$0, bwq.s);
      if ($$7 == null) {
         $$6.c();
         return null;
      } else {
         $$7.x(this);
         this.cC();
         $$7.a(bxw.a($$1), $$1.i());
         $$0.d($$7);

         for (bwi $$8 : $$3) {
            $$8.a($$7, true);
         }

         $$0.i();
         $$1.j().onTransition($$7);
         $$6.c();
         return $$7;
      }
   }

   private eya a(eya $$0, bwi $$1) {
      float $$2 = $$0.e() + ($$0.i().contains(bxx.d) ? 0.0F : $$1.dK() - this.dK());
      float $$3 = $$0.f() + ($$0.i().contains(bxx.e) ? 0.0F : $$1.dM() - this.dM());
      ffc $$4 = $$1.ds().d(this.ds());
      ffc $$5 = $$0.c().b($$0.i().contains(bxx.a) ? 0.0 : $$4.a(), $$0.i().contains(bxx.b) ? 0.0 : $$4.b(), $$0.i().contains(bxx.c) ? 0.0 : $$4.c());
      return $$0.a($$5).a($$2, $$3).a();
   }

   private void a(eya $$0) {
      bwi $$1 = this.cV();

      for (bwi $$2 : this.db()) {
         if ($$2 instanceof arr) {
            arr $$3 = (arr)$$2;
            if ($$1 != null && $$3.ao() == $$1.ao()) {
               $$3.f.b(agc.a(this.ao(), bxw.a($$0), $$0.i(), this.aD));
            } else {
               $$3.f.b(agc.a(this.ao(), bxw.a(this), Set.of(), this.aD));
            }
         }
      }
   }

   public void a(bxw $$0, Set<bxx> $$1) {
      bxw $$2 = bxw.a(this);
      bxw $$3 = bxw.a($$2, $$0, $$1);
      this.o($$3.a().d, $$3.a().e, $$3.a().f);
      this.w($$3.c());
      this.r($$3.c());
      this.x($$3.d());
      this.av();
      this.bw();
      this.i($$3.b());
      this.bh.clear();
   }

   public void a(float $$0, float $$1) {
      this.w($$0);
      this.r($$0);
      this.x($$1);
      this.by();
   }

   public void f(iv $$0) {
      if (this.dU() instanceof arq $$1) {
         $$1.m().a(arx.g, new dir($$0), 3);
      }
   }

   protected void cC() {
      this.c(bwi.d.e);
      if (this instanceof bxh $$0) {
         $$0.z();
      }
   }

   public ffc a(jb.a $$0, m.a $$1) {
      return exz.a($$1, $$0, this.ds(), this.a(this.at()));
   }

   public boolean n(boolean $$0) {
      return ($$0 || !this.bX()) && this.bI();
   }

   public boolean a(djm $$0, djm $$1) {
      if ($$0.aj() == djm.k && $$1.aj() == djm.i) {
         for (bwi $$2 : this.cX()) {
            if ($$2 instanceof arr $$3 && !$$3.i) {
               return false;
            }
         }
      }

      return true;
   }

   public float a(djf $$0, diq $$1, iv $$2, eat $$3, exa $$4, float $$5) {
      return $$5;
   }

   public boolean a(djf $$0, diq $$1, iv $$2, eat $$3, float $$4) {
      return true;
   }

   public int cD() {
      return 3;
   }

   public boolean g_() {
      return false;
   }

   public void a(q $$0) {
      $$0.a("Entity Type", () -> bwr.a(this.an()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.p);
      $$0.a("Entity Name", () -> this.ai().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dz(), this.dB(), this.dF()));
      $$0.a("Entity's Block location", q.a(this.dU(), azm.a(this.dz()), azm.a(this.dB()), azm.a(this.dF())));
      ffc $$1 = this.dx();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.d, $$1.e, $$1.f));
      $$0.a("Entity's Passengers", () -> this.cX().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.dj()));
   }

   public boolean cE() {
      return this.bW() && !this.V_();
   }

   public void a_(UUID $$0) {
      this.at = $$0;
      this.au = this.at.toString();
   }

   @Override
   public UUID cF() {
      return this.at;
   }

   public String cG() {
      return this.au;
   }

   @Override
   public String cH() {
      return this.au;
   }

   public boolean cI() {
      return true;
   }

   public static double cJ() {
      return n;
   }

   public static void b(double $$0) {
      n = $$0;
   }

   @Override
   public wy m_() {
      return fgc.a(this.cp(), this.ai()).a($$0 -> $$0.a(this.cP()).a(this.cG()));
   }

   public void b(@Nullable wy $$0) {
      this.al.a(aN, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public wy ak() {
      return this.al.a(aN).orElse(null);
   }

   @Override
   public boolean h_() {
      return this.al.a(aN).isPresent();
   }

   public void o(boolean $$0) {
      this.al.a(aO, $$0);
   }

   public boolean cK() {
      return this.al.a(aO);
   }

   public boolean a(arq $$0, double $$1, double $$2, double $$3, Set<bxx> $$4, float $$5, float $$6, boolean $$7) {
      bwi $$8 = this.b(new eya($$0, new ffc($$1, $$2, $$3), ffc.c, $$5, $$6, $$4, eya.a));
      return $$8 != null;
   }

   public void m(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (this.dU() instanceof arq) {
         this.b($$0, $$1, $$2, this.dK(), this.dM());
         this.v();
      }
   }

   private void v() {
      this.cZ().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.q.iterator();

         while (var1.hasNext()) {
            bwi $$1 = (bwi)var1.next();
            $$0.a($$1, bwi::d);
         }
      });
   }

   public void c(double $$0, double $$1, double $$2) {
      this.b(this.dz() + $$0, this.dB() + $$1, this.dF() + $$2);
   }

   public boolean cL() {
      return this.cK();
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
   protected void cM() {
      bxv $$0 = this.at();
      bwl $$1 = this.a($$0);
      this.ba = $$1;
      this.bb = $$1.c();
   }

   public void i_() {
      bwl $$0 = this.ba;
      bxv $$1 = this.at();
      bwl $$2 = this.a($$1);
      this.ba = $$2;
      this.bb = $$2.c();
      this.av();
      boolean $$3 = $$2.a() <= 4.0F && $$2.b() <= 4.0F;
      if (!this.s.C && !this.ak && !this.ad && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof crm)) {
         this.a($$0);
      }
   }

   public boolean a(bwl $$0) {
      bwl $$1 = this.a(this.at());
      ffc $$2 = this.ds().b(0.0, (double)$$0.b() / 2.0, 0.0);
      double $$3 = (double)Math.max(0.0F, $$1.a() - $$0.a()) + 1.0E-6;
      double $$4 = (double)Math.max(0.0F, $$1.b() - $$0.b()) + 1.0E-6;
      ffw $$5 = fft.a(fex.a($$2, $$3, $$4, $$3));
      Optional<ffc> $$6 = this.s.a(this, $$5, $$2, (double)$$1.a(), (double)$$1.b(), (double)$$1.a());
      if ($$6.isPresent()) {
         this.b($$6.get().b(0.0, (double)(-$$1.b()) / 2.0, 0.0));
         return true;
      } else {
         if ($$1.a() > $$0.a() && $$1.b() > $$0.b()) {
            ffw $$7 = fft.a(fex.a($$2, $$3, 1.0E-6, $$3));
            Optional<ffc> $$8 = this.s.a(this, $$7, $$2, (double)$$1.a(), (double)$$0.b(), (double)$$1.a());
            if ($$8.isPresent()) {
               this.b($$8.get().b(0.0, (double)(-$$0.b()) / 2.0 + 1.0E-6, 0.0));
               return true;
            }
         }

         return false;
      }
   }

   public jb cN() {
      return jb.a((double)this.dK());
   }

   public jb cO() {
      return this.cN();
   }

   protected xe cP() {
      return new xe.c(new xe.b(this.an(), this.cF(), this.ai()));
   }

   public boolean a(arr $$0) {
      return true;
   }

   @Override
   public final fex cQ() {
      return this.aC;
   }

   public final void a(fex $$0) {
      this.aC = $$0;
   }

   public final float d(bxv $$0) {
      return this.a($$0).c();
   }

   public final float cR() {
      return this.bb;
   }

   public ffc t(float $$0) {
      return this.cS();
   }

   protected ffc cS() {
      return new ffc(0.0, (double)this.cR(), (double)(this.dp() * 0.4F));
   }

   public bya a_(int $$0) {
      return bya.a;
   }

   public djm cT() {
      return this.dU();
   }

   @Nullable
   public MinecraftServer cU() {
      return this.dU().p();
   }

   public bug a(crm $$0, ffc $$1, buf $$2) {
      return bug.e;
   }

   public boolean a(djf $$0) {
      return false;
   }

   public void d(arr $$0) {
   }

   public void e(arr $$0) {
   }

   public float a(dtl $$0) {
      float $$1 = azm.h(this.dK());
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

   public float a(dru $$0) {
      float $$1 = azm.h(this.dK());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public csi a(csh $$0) {
      return this.an().a(axf.r) ? csi.b : csi.a;
   }

   @Nullable
   public bxj cV() {
      return null;
   }

   public final boolean cW() {
      return this.cV() != null;
   }

   public final List<bwi> cX() {
      return this.q;
   }

   @Nullable
   public bwi cY() {
      return this.q.isEmpty() ? null : (bwi)this.q.get(0);
   }

   public boolean y(bwi $$0) {
      return this.q.contains($$0);
   }

   public boolean a(Predicate<bwi> $$0) {
      UnmodifiableIterator var2 = this.q.iterator();

      while (var2.hasNext()) {
         bwi $$1 = (bwi)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bwi> D() {
      return this.q.stream().flatMap(bwi::cZ);
   }

   @Override
   public Stream<bwi> cZ() {
      return Stream.concat(Stream.of(this), this.D());
   }

   @Override
   public Stream<bwi> da() {
      return Stream.concat(this.q.stream().flatMap(bwi::da), Stream.of(this));
   }

   public Iterable<bwi> db() {
      return () -> this.D().iterator();
   }

   public int dc() {
      return (int)this.D().filter($$0 -> $$0 instanceof crm).count();
   }

   public boolean dd() {
      return this.dc() == 1;
   }

   public bwi de() {
      bwi $$0 = this;

      while ($$0.bX()) {
         $$0 = $$0.dj();
      }

      return $$0;
   }

   public boolean z(bwi $$0) {
      return this.de() == $$0.de();
   }

   public boolean A(bwi $$0) {
      if (!$$0.bX()) {
         return false;
      } else {
         bwi $$1 = $$0.dj();
         return $$1 == this ? true : this.A($$1);
      }
   }

   public final boolean df() {
      return this.s.w_() ? this.dg() : !this.L_();
   }

   protected boolean dg() {
      bxj $$0 = this.cV();
      return $$0 != null && $$0.dg();
   }

   public boolean L_() {
      bxj $$0 = this.cV();
      return $$0 != null && $$0.L_();
   }

   public boolean dh() {
      return this.df();
   }

   public boolean di() {
      return this.df();
   }

   protected static ffc a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -azm.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = azm.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new ffc((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public ffc b(bxj $$0) {
      return new ffc(this.dz(), this.cQ().e, this.dF());
   }

   @Nullable
   public bwi dj() {
      return this.r;
   }

   @Nullable
   public bwi dk() {
      return this.r != null && this.r.cV() == this ? this.r : null;
   }

   public exf j_() {
      return exf.a;
   }

   public awo dl() {
      return awo.g;
   }

   protected int dm() {
      return 1;
   }

   public ej d(arq $$0) {
      return new ej(ei.a, this.ds(), this.bS(), $$0, 0, this.ai().getString(), this.m_(), $$0.p(), this);
   }

   public void a(ev.a $$0, ffc $$1) {
      ffc $$2 = $$0.a(this);
      double $$3 = $$1.d - $$2.d;
      double $$4 = $$1.e - $$2.e;
      double $$5 = $$1.f - $$2.f;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.x(azm.h((float)(-(azm.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.w(azm.h((float)(azm.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.r(this.dK());
      this.O = this.dM();
      this.N = this.dK();
   }

   public float u(float $$0) {
      return azm.h($$0, this.N, this.aA);
   }

   public boolean a(axr<ewz> $$0, double $$1) {
      if (this.dn()) {
         return false;
      } else {
         fex $$2 = this.cQ().h(0.001);
         int $$3 = azm.a($$2.a);
         int $$4 = azm.c($$2.d);
         int $$5 = azm.a($$2.b);
         int $$6 = azm.c($$2.e);
         int $$7 = azm.a($$2.c);
         int $$8 = azm.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cI();
         boolean $$11 = false;
         ffc $$12 = ffc.c;
         int $$13 = 0;
         iv.a $$14 = new iv.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  exa $$18 = this.dU().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a(this.dU(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           ffc $$20 = $$18.c(this.dU(), $$14);
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

            if (!(this instanceof crm)) {
               $$12 = $$12.d();
            }

            ffc $$21 = this.dx();
            $$12 = $$12.c($$1);
            double $$22 = 0.003;
            if (Math.abs($$21.d) < 0.003 && Math.abs($$21.f) < 0.003 && $$12.g() < 0.0045000000000000005) {
               $$12 = $$12.d().c(0.0045000000000000005);
            }

            this.i(this.dx().e($$12));
         }

         this.ah.put($$0, $$9);
         return $$11;
      }
   }

   public boolean dn() {
      fex $$0 = this.cQ().g(1.0);
      int $$1 = azm.a($$0.a);
      int $$2 = azm.c($$0.d);
      int $$3 = azm.a($$0.c);
      int $$4 = azm.c($$0.f);
      return !this.dU().b($$1, $$3, $$2, $$4);
   }

   public double b(axr<ewz> $$0) {
      return this.ah.getDouble($$0);
   }

   public double do() {
      return (double)this.cR() < 0.4 ? 0.0 : 0.4;
   }

   public final float dp() {
      return this.ba.a();
   }

   public final float dq() {
      return this.ba.b();
   }

   public zf<abu> a(aro $$0) {
      return new abv(this, $$0);
   }

   public bwl a(bxv $$0) {
      return this.o.n();
   }

   public final bwk dr() {
      return this.ba.d();
   }

   public ffc ds() {
      return this.t;
   }

   public ffc dt() {
      return this.ds();
   }

   @Override
   public iv du() {
      return this.u;
   }

   public eat dv() {
      if (this.bg == null) {
         this.bg = this.dU().a_(this.du());
      }

      return this.bg;
   }

   public dir dw() {
      return this.ay;
   }

   public ffc dx() {
      return this.az;
   }

   public void i(ffc $$0) {
      this.az = $$0;
   }

   public void j(ffc $$0) {
      this.i(this.dx().e($$0));
   }

   public void n(double $$0, double $$1, double $$2) {
      this.i(new ffc($$0, $$1, $$2));
   }

   public final int dy() {
      return this.u.u();
   }

   public final double dz() {
      return this.t.d;
   }

   public double c(double $$0) {
      return this.t.d + (double)this.dp() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ae.j() - 1.0) * $$0);
   }

   public final int dA() {
      return this.u.v();
   }

   public final double dB() {
      return this.t.e;
   }

   public double e(double $$0) {
      return this.t.e + (double)this.dq() * $$0;
   }

   public double dC() {
      return this.e(this.ae.j());
   }

   public double dD() {
      return this.t.e + (double)this.bb;
   }

   public final int dE() {
      return this.u.w();
   }

   public final double dF() {
      return this.t.f;
   }

   public double f(double $$0) {
      return this.t.f + (double)this.dp() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ae.j() - 1.0) * $$0);
   }

   public final void o(double $$0, double $$1, double $$2) {
      if (this.t.d != $$0 || this.t.e != $$1 || this.t.f != $$2) {
         this.t = new ffc($$0, $$1, $$2);
         int $$3 = azm.a($$0);
         int $$4 = azm.a($$1);
         int $$5 = azm.a($$2);
         if ($$3 != this.u.u() || $$4 != this.u.v() || $$5 != this.u.w()) {
            this.u = new iv($$3, $$4, $$5);
            this.bg = null;
            if (jy.a($$3) != this.ay.h || jy.a($$5) != this.ay.i) {
               this.ay = new dir(this.u);
            }
         }

         this.aS.a();
      }
   }

   public void dG() {
   }

   public ffc v(float $$0) {
      return this.p($$0).b(0.0, (double)this.bb * 0.7, 0.0);
   }

   public void a(abv $$0) {
      int $$1 = $$0.b();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      double $$4 = $$0.i();
      this.e($$2, $$3, $$4);
      this.b($$2, $$3, $$4, $$0.n(), $$0.m());
      this.e($$1);
      this.a_($$0.e());
      ffc $$5 = new ffc($$0.j(), $$0.k(), $$0.l());
      this.i($$5);
   }

   @Nullable
   public czn dH() {
      return null;
   }

   public void p(boolean $$0) {
      this.av = $$0;
   }

   public boolean dI() {
      return !this.an().a(axf.k);
   }

   public boolean dJ() {
      return this.ct() > 0;
   }

   public float dK() {
      return this.aA;
   }

   public float dL() {
      return this.dK();
   }

   public void w(float $$0) {
      if (!Float.isFinite($$0)) {
         ag.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aA = $$0;
      }
   }

   public float dM() {
      return this.aB;
   }

   public void x(float $$0) {
      if (!Float.isFinite($$0)) {
         ag.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aB = Math.clamp($$0 % 360.0F, -90.0F, 90.0F);
      }
   }

   public boolean dN() {
      return false;
   }

   public float dO() {
      return 0.0F;
   }

   public void b_(@Nullable bwi $$0) {
   }

   @Override
   public final boolean dP() {
      return this.aE != null;
   }

   @Nullable
   public bwi.d dQ() {
      return this.aE;
   }

   @Override
   public final void c(bwi.d $$0) {
      if (this.aE == null) {
         this.aE = $$0;
      }

      if (this.aE.a()) {
         this.bN();
      }

      this.cX().forEach(bwi::bN);
      this.aS.a($$0);
      this.b($$0);
   }

   protected void dR() {
      this.aE = null;
   }

   @Override
   public void a(eez $$0) {
      this.aS = $$0;
   }

   @Override
   public boolean dS() {
      if (this.aE != null && !this.aE.b()) {
         return false;
      } else {
         return this.bX() ? false : !this.bY() || !this.dd();
      }
   }

   @Override
   public boolean dT() {
      return false;
   }

   public boolean c(arq $$0, iv $$1) {
      return true;
   }

   public djm dU() {
      return this.s;
   }

   protected void a(djm $$0) {
      this.s = $$0;
   }

   public buy dV() {
      return this.dU().al();
   }

   public jt dW() {
      return this.dU().F_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = azm.d($$6, this.dz(), $$1);
      double $$8 = azm.d($$6, this.dB(), $$2);
      double $$9 = azm.d($$6, this.dF(), $$3);
      float $$10 = (float)azm.e($$6, (double)this.dK(), $$4);
      float $$11 = (float)azm.d($$6, (double)this.dM(), $$5);
      this.a_($$7, $$8, $$9);
      this.b($$10, $$11);
   }

   public azv dX() {
      return this.ae;
   }

   public ffc ae() {
      if (this.cV() instanceof crm $$0 && this.bI()) {
         return $$0.ae();
      }

      return this.dx();
   }

   @Nullable
   public czn dY() {
      return null;
   }

   public Optional<alf<ezy>> dZ() {
      return this.o.j();
   }

   protected void a(kf $$0) {
      this.a($$0, kk.g);
   }

   public final void c(czn $$0) {
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
      void accept(bwi var1, double var2, double var4, double var6);
   }

   static record b(ffc a, ffc b) {
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
