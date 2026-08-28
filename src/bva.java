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
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
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

public abstract class bva implements aka, btb, ebu, fdb {
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
   private static final fbs d = new fbs(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double k = 0.014;
   private static final double l = 0.007;
   private static final double m = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double n = 1.0;
   private final bvi<?> o;
   private int p = c.incrementAndGet();
   public boolean I;
   private ImmutableList<bva> q = ImmutableList.of();
   protected int J;
   @Nullable
   private bva r;
   private dgz s;
   public double K;
   public double L;
   public double M;
   private fbx t;
   private ji u;
   private dgg ay;
   private fbx az = fbx.c;
   private float aA;
   private float aB;
   public float N;
   public float O;
   private fbs aC = d;
   private boolean aD;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected fbx U = fbx.c;
   @Nullable
   private bva.d aE;
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
   private int aH = -this.dm();
   protected boolean ag;
   protected Object2DoubleMap<axf<etv>> ah = new Object2DoubleArrayMap(2);
   protected boolean ai;
   private final Set<axf<etv>> aI = new HashSet<>();
   public int aj;
   protected boolean ak = true;
   protected final akb al;
   protected static final ajx<Byte> am = akb.a(bva.class, ajz.a);
   protected static final int an = 0;
   private static final int aJ = 1;
   private static final int aK = 3;
   private static final int aL = 4;
   private static final int aM = 5;
   protected static final int ao = 6;
   protected static final int ap = 7;
   private static final ajx<Integer> aN = akb.a(bva.class, ajz.b);
   private static final ajx<Optional<wp>> aO = akb.a(bva.class, ajz.g);
   private static final ajx<Boolean> aP = akb.a(bva.class, ajz.k);
   private static final ajx<Boolean> aQ = akb.a(bva.class, ajz.k);
   private static final ajx<Boolean> aR = akb.a(bva.class, ajz.k);
   protected static final ajx<bwk> aq = akb.a(bva.class, ajz.w);
   private static final ajx<Integer> aS = akb.a(bva.class, ajz.b);
   private ebv aT = ebv.a;
   private final aih aU = new aih();
   public boolean ar;
   @Nullable
   public bwj as;
   private int aV;
   private boolean aW;
   protected UUID at = ayz.a(this.ae);
   protected String au = this.at.toString();
   private boolean aX;
   private final Set<String> aY = Sets.newHashSet();
   private final double[] aZ = new double[]{0.0, 0.0, 0.0};
   private long ba;
   private bvd bb;
   private float bc;
   public boolean av;
   public boolean aw;
   public Optional<ji> ax = Optional.empty();
   private boolean bd = false;
   private float be;
   private int bf;
   private boolean bg;
   @Nullable
   private dxq bh = null;
   private final List<bva.b> bi = new ArrayList<>();
   private final List<dxq> bj = new ReferenceArrayList();
   private final LongSet bk = new LongOpenHashSet();

   public bva(bvi<?> $$0, dgz $$1) {
      this.o = $$0;
      this.s = $$1;
      this.bb = $$0.n();
      this.t = fbx.c;
      this.u = ji.c;
      this.ay = dgg.e;
      akb.a $$2 = new akb.a(this);
      $$2.a(am, (byte)0);
      $$2.a(aN, this.cr());
      $$2.a(aP, false);
      $$2.a(aO, Optional.empty());
      $$2.a(aQ, false);
      $$2.a(aR, false);
      $$2.a(aq, bwk.a);
      $$2.a(aS, 0);
      this.a($$2);
      this.al = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.bc = this.bb.c();
   }

   public boolean a(ji $$0, dxq $$1) {
      fcr $$2 = $$1.b(this.dU(), $$0, fcc.a(this)).a($$0);
      return fco.c($$2, fco.a(this.cQ()), fcb.i);
   }

   public int f_() {
      fde $$0 = this.cq();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean U_() {
      return false;
   }

   public final void ao() {
      if (this.bZ()) {
         this.bN();
      }

      if (this.bY()) {
         this.bO();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.aU.e(new fbx($$0, $$1, $$2));
   }

   public aih ap() {
      return this.aU;
   }

   public bvi<?> aq() {
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

   public void c(ard $$0) {
      this.a(bva.d.a);
      this.a(ecp.p);
   }

   public final void at() {
      this.a(bva.d.b);
   }

   protected abstract void a(akb.a var1);

   public akb au() {
      return this.al;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bva ? ((bva)$$0).p == this.p : false;
   }

   @Override
   public int hashCode() {
      return this.p;
   }

   public void a(bva.d $$0) {
      this.c($$0);
   }

   public void av() {
   }

   public void b(bva.d $$0) {
   }

   public void b(bwk $$0) {
      this.al.a(aq, $$0);
   }

   public bwk aw() {
      return this.al.a(aq);
   }

   public boolean c(bwk $$0) {
      return this.aw() == $$0;
   }

   public boolean a(bva $$0, double $$1) {
      return this.ds().a((kb)$$0.ds(), $$1);
   }

   public boolean a(bva $$0, double $$1, double $$2) {
      double $$3 = $$0.dz() - this.dz();
      double $$4 = $$0.dB() - this.dB();
      double $$5 = $$0.dF() - this.dF();
      return ayz.e($$3, $$5) < ayz.k($$1) && ayz.k($$4) < ayz.k($$2);
   }

   protected void b(float $$0, float $$1) {
      this.w($$0 % 360.0F);
      this.x($$1 % 360.0F);
   }

   public final void b(fbx $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      this.a(this.ax());
   }

   protected final fbs ax() {
      return this.c(this.t);
   }

   protected fbs c(fbx $$0) {
      return this.bb.a($$0);
   }

   protected void ay() {
      this.a_(this.t.d, this.t.e, this.t.f);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.x(this.dM() + $$2);
      this.w(this.dK() + $$3);
      this.x(ayz.a(this.dM(), -90.0F, 90.0F));
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
      bpj $$0 = bpi.a();
      $$0.a("entityBaseTick");
      this.bh = null;
      if (this.bY() && this.dj().dP()) {
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
      this.D();
      this.bn();
      if (this.dU() instanceof ard $$1) {
         if (this.aH > 0) {
            if (this.bi()) {
               this.h(this.aH - 4);
               if (this.aH < 0) {
                  this.aH();
               }
            } else {
               if (this.aH % 20 == 0 && !this.bv()) {
                  this.a($$1, this.dV().d(), 1.0F);
               }

               this.h(this.aH - 1);
            }

            if (this.ct() > 0) {
               this.k(0);
               this.dU().a(null, 1009, this.u, 1);
            }
         }
      } else {
         this.aH();
      }

      if (this.bv()) {
         this.aE();
         this.Z *= 0.5F;
      }

      this.aA();
      if (!this.dU().C) {
         this.c(this.aH > 0);
      }

      this.ak = false;
      if (this.dU() instanceof ard $$2 && this instanceof bvw) {
         bvw.a_($$2, (bva)((bvw)this));
      }

      $$0.c();
   }

   public void c(boolean $$0) {
      this.b(0, $$0 || this.bg);
   }

   public void aA() {
      if (this.dB() < (double)(this.dU().G_() - 64)) {
         this.aI();
      }
   }

   public void aB() {
      this.aV = this.bW();
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
         if (this.dU() instanceof ard $$0 && this.a($$0, this.dV().e(), 4.0F) && this.aF() && !this.bb()) {
            $$0.a(null, this.dz(), this.dB(), this.dF(), awa.kA, this.dl(), 0.4F, 2.0F + this.ae.i() * 0.4F);
         }
      }
   }

   protected boolean aF() {
      return true;
   }

   public final void e(float $$0) {
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
      return this.b(this.cQ().d($$0, $$1, $$2));
   }

   private boolean b(fbs $$0) {
      return this.dU().a(this, $$0) && !this.dU().d($$0);
   }

   public void d(boolean $$0) {
      this.aD = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, fbx $$1) {
      this.a($$0, this.P, $$1);
   }

   public void a(boolean $$0, boolean $$1, fbx $$2) {
      this.aD = $$0;
      this.P = $$1;
      this.b($$0, $$2);
   }

   public boolean d(ji $$0) {
      return this.ax.isPresent() && this.ax.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable fbx $$1) {
      if ($$0) {
         fbs $$2 = this.cQ();
         fbs $$3 = new fbs($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<ji> $$4 = this.s.h(this, $$3);
         if ($$4.isPresent() || this.bd) {
            this.ax = $$4;
         } else if ($$1 != null) {
            fbs $$5 = $$3.d(-$$1.d, 0.0, -$$1.f);
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

   public void a(bwc $$0, fbx $$1) {
      if (this.ad) {
         this.a_(this.dz() + $$1.d, this.dB() + $$1.e, this.dF() + $$1.f);
      } else {
         this.aG = this.bX();
         if ($$0 == bwc.c) {
            $$1 = this.e($$1);
            if ($$1.equals(fbx.c)) {
               return;
            }
         }

         bpj $$2 = bpi.a();
         $$2.a("move");
         if (this.U.h() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = fbx.c;
            this.i(fbx.c);
         }

         $$1 = this.a($$1, $$0);
         fbx $$3 = this.a($$1);
         double $$4 = $$3.h();
         if ($$4 > 1.0E-7 || $$1.h() - $$4 < 1.0E-7) {
            if (this.Z != 0.0F && $$4 >= 1.0) {
               fbt $$5 = this.dU().a(new dgi(this.ds(), this.ds().e($$3), dgi.a.d, dgi.b.d, this));
               if ($$5.d() != fbv.a.a) {
                  this.k();
               }
            }

            this.a_(this.dz() + $$3.d, this.dB() + $$3.e, this.dF() + $$3.f);
         }

         $$2.c();
         $$2.a("rest");
         boolean $$6 = !ayz.b($$1.d, $$3.d);
         boolean $$7 = !ayz.b($$1.f, $$3.f);
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

         ji $$8 = this.aP();
         dxq $$9 = this.dU().a_($$8);
         if (this.df()) {
            this.a($$3.e, this.aJ(), $$9, $$8);
         }

         if (this.dP()) {
            $$2.c();
         } else {
            if (this.P) {
               fbx $$10 = this.dx();
               this.n($$6 ? 0.0 : $$10.d, $$10.e, $$7 ? 0.0 : $$10.f);
            }

            if (this.dh()) {
               dke $$11 = $$9.b();
               if ($$1.e != $$3.e) {
                  $$11.a(this.dU(), this);
               }
            }

            if (!this.dU().w_() || this.df()) {
               bva.c $$12 = this.bg();
               if ($$12.a() && !this.bY()) {
                  this.a($$12, $$3, $$8, $$9);
               }
            }

            float $$13 = this.aT();
            this.i(this.dx().d((double)$$13, 1.0, (double)$$13));
            $$2.c();
         }
      }
   }

   private void a(bva.c $$0, fbx $$1, ji $$2, dxq $$3) {
      float $$4 = 0.6F;
      float $$5 = (float)($$1.g() * 0.6F);
      float $$6 = (float)($$1.i() * 0.6F);
      ji $$7 = this.aR();
      dxq $$8 = this.dU().a_($$7);
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
               this.a(ecp.Q);
            }
         }
      } else if ($$8.l()) {
         this.aO();
      }
   }

   public void aK() {
      this.a(this.bA(), this.t);
   }

   public void a(fbx $$0, fbx $$1) {
      if (this.aL()) {
         if (this.aJ()) {
            ji $$2 = this.aP();
            dxq $$3 = this.dU().a_($$2);
            $$3.b().a(this.dU(), $$2, $$3, this);
         }

         this.bi.add(new bva.b($$0, $$1));
         List<bva.b> $$4 = List.copyOf(this.bi);
         this.bi.clear();
         boolean $$5 = this.bX();
         this.a($$4, this.bj);
         boolean $$6 = false;
         boolean $$7 = false;

         for (dxq $$8 : this.bj) {
            if ($$8.a(dkg.K)) {
               $$6 = true;
               $$5 = true;
               $$7 = false;
            } else if ($$8.a(awp.aN)) {
               $$5 = true;
               $$7 = false;
            } else if ($$5 && ($$8.a(dkg.J) || $$8.a(dkg.rr) || $$8.a(dkg.nF))) {
               $$5 = false;
               $$7 = true;
            }
         }

         this.bj.clear();
         if ($$6) {
            this.aE();
         }

         if ($$7) {
            if (!this.s.w_()) {
               this.aM();
            }

            this.aH();
         }

         if (!$$5 && this.aH <= 0) {
            this.h(-this.dm());
         }
      }
   }

   protected boolean aL() {
      return !this.dP() && !this.ad;
   }

   private boolean c(dxq $$0) {
      return $$0.a(awp.aS) || $$0.a(dkg.rr);
   }

   private boolean a(ji $$0, dxq $$1, boolean $$2, boolean $$3, fbx $$4) {
      if ($$1.l()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aJ() || $$5 || this.ch() && $$4.e == 0.0 || this.cp()) && !this.cj()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dU().a(ecp.P, this.ds(), ecp.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean d(fbx $$0) {
      return false;
   }

   protected void aM() {
      this.a(awa.kF, 0.7F, 1.6F + (this.ae.i() - this.ae.i()) * 0.4F);
   }

   public void aN() {
      if (!this.dU().C && this.aG) {
         this.aM();
      }

      this.aH();
   }

   protected void aO() {
      if (this.ba()) {
         this.aZ();
         if (this.bg().b()) {
            this.a(ecp.x);
         }
      }
   }

   @Deprecated
   public ji aP() {
      return this.f(0.2F);
   }

   public ji aQ() {
      return this.f(0.500001F);
   }

   public ji aR() {
      return this.f(1.0E-5F);
   }

   protected ji f(float $$0) {
      if (this.ax.isPresent()) {
         ji $$1 = this.ax.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dxq $$2 = this.dU().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(awp.U)) && !$$2.a(awp.N) && !($$2.b() instanceof dne) ? $$1.h(ayz.a(this.t.e - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = ayz.a(this.t.d);
         int $$4 = ayz.a(this.t.e - (double)$$0);
         int $$5 = ayz.a(this.t.f);
         return new ji($$3, $$4, $$5);
      }
   }

   protected float aS() {
      float $$0 = this.dU().a_(this.du()).b().j();
      float $$1 = this.dU().a_(this.aQ()).b().j();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aT() {
      dxq $$0 = this.dU().a_(this.du());
      float $$1 = $$0.b().h();
      if (!$$0.a(dkg.J) && !$$0.a(dkg.nF)) {
         return (double)$$1 == 1.0 ? this.dU().a_(this.aQ()).b().h() : $$1;
      } else {
         return $$1;
      }
   }

   protected fbx a(fbx $$0, bwc $$1) {
      return $$0;
   }

   protected fbx e(fbx $$0) {
      if ($$0.h() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dU().ae();
         if ($$1 != this.ba) {
            Arrays.fill(this.aZ, 0.0);
            this.ba = $$1;
         }

         if ($$0.d != 0.0) {
            double $$2 = this.a(jn.a.a, $$0.d);
            return Math.abs($$2) <= 1.0E-5F ? fbx.c : new fbx($$2, 0.0, 0.0);
         } else if ($$0.e != 0.0) {
            double $$3 = this.a(jn.a.b, $$0.e);
            return Math.abs($$3) <= 1.0E-5F ? fbx.c : new fbx(0.0, $$3, 0.0);
         } else if ($$0.f != 0.0) {
            double $$4 = this.a(jn.a.c, $$0.f);
            return Math.abs($$4) <= 1.0E-5F ? fbx.c : new fbx(0.0, 0.0, $$4);
         } else {
            return fbx.c;
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

   private fbx a(fbx $$0) {
      fbs $$1 = this.cQ();
      List<fcr> $$2 = this.dU().c(this, $$1.b($$0));
      fbx $$3 = $$0.h() == 0.0 ? $$0 : a(this, $$0, $$1, this.dU(), $$2);
      boolean $$4 = $$0.d != $$3.d;
      boolean $$5 = $$0.e != $$3.e;
      boolean $$6 = $$0.f != $$3.f;
      boolean $$7 = $$5 && $$0.e < 0.0;
      if (this.dO() > 0.0F && ($$7 || this.aJ()) && ($$4 || $$6)) {
         fbs $$8 = $$7 ? $$1.d(0.0, $$3.e, 0.0) : $$1;
         fbs $$9 = $$8.b($$0.d, (double)this.dO(), $$0.f);
         if (!$$7) {
            $$9 = $$9.b(0.0, -1.0E-5F, 0.0);
         }

         List<fcr> $$10 = a(this, this.s, $$2, $$9);
         float $$11 = (float)$$3.e;
         float[] $$12 = a($$8, $$10, this.dO(), $$11);

         for (float $$13 : $$12) {
            fbx $$14 = a(new fbx($$0.d, (double)$$13, $$0.f), $$8, $$10);
            if ($$14.j() > $$3.j()) {
               double $$15 = $$1.b - $$8.b;
               return $$14.b(0.0, -$$15, 0.0);
            }
         }
      }

      return $$3;
   }

   private static float[] a(fbs $$0, List<fcr> $$1, float $$2, float $$3) {
      FloatSet $$4 = new FloatArraySet(4);

      for (fcr $$5 : $$1) {
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

   public static fbx a(@Nullable bva $$0, fbx $$1, fbs $$2, dgz $$3, List<fcr> $$4) {
      List<fcr> $$5 = a($$0, $$3, $$4, $$2.b($$1));
      return a($$1, $$2, $$5);
   }

   private static List<fcr> a(@Nullable bva $$0, dgz $$1, List<fcr> $$2, fbs $$3) {
      Builder<fcr> $$4 = ImmutableList.builderWithExpectedSize($$2.size() + 1);
      if (!$$2.isEmpty()) {
         $$4.addAll($$2);
      }

      dzh $$5 = $$1.A_();
      boolean $$6 = $$0 != null && $$5.a($$0, $$3);
      if ($$6) {
         $$4.add($$5.c());
      }

      $$4.addAll($$1.e($$0, $$3));
      return $$4.build();
   }

   private static fbx a(fbx $$0, fbs $$1, List<fcr> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.d;
         double $$4 = $$0.e;
         double $$5 = $$0.f;
         if ($$4 != 0.0) {
            $$4 = fco.a(jn.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = fco.a(jn.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = fco.a(jn.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = fco.a(jn.a.c, $$1, $$2, $$5);
         }

         return new fbx($$3, $$4, $$5);
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

   public void b(fbx $$0, fbx $$1) {
      this.bi.add(new bva.b($$0, $$1));
   }

   private void a(List<bva.b> $$0, List<dxq> $$1) {
      if (this.aL()) {
         LongSet $$2 = this.bk;

         for (bva.b $$3 : $$0) {
            fbx $$4 = $$3.a();
            fbx $$5 = $$3.b();
            fbs $$6 = this.c($$5).h(1.0E-5F);

            for (ji $$7 : dgf.a($$4, $$5, $$6)) {
               if (!this.bJ()) {
                  return;
               }

               dxq $$8 = this.dU().a_($$7);
               if (!$$8.l() && $$2.add($$7.a())) {
                  try {
                     fcr $$9 = $$8.b(this.dU(), $$7);
                     if ($$9 != fco.b() && !this.a($$4, $$5, $$7, $$9)) {
                        continue;
                     }

                     $$8.a(this.dU(), $$7, this);
                     this.a($$8);
                  } catch (Throwable var16) {
                     o $$11 = o.a(var16, "Colliding entity with block");
                     p $$12 = $$11.a("Block being collided with");
                     p.a($$12, this.dU(), $$7, $$8);
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

   private boolean a(fbx $$0, fbx $$1, ji $$2, fcr $$3) {
      fbs $$4 = this.c($$0);
      fbx $$5 = $$1.d($$0);
      return $$4.a($$5, $$3.a(new fbx($$2)).e());
   }

   protected void a(dxq $$0) {
   }

   public ji a(ard $$0, ji $$1) {
      ji $$2 = $$0.aa();
      fbx $$3 = $$2.b();
      int $$4 = $$0.m($$2).a(edo.a.f, $$2.u(), $$2.w()) + 1;
      return ji.a($$3.d, (double)$$4, $$3.f);
   }

   public void a(jr<ecp> $$0, @Nullable bva $$1) {
      this.dU().a($$1, $$0, this.t);
   }

   public void a(jr<ecp> $$0) {
      this.a($$0, this);
   }

   private void c(ji $$0, dxq $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.o();
      }
   }

   protected void aY() {
      bva $$0 = Objects.requireNonNullElse(this.cV(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      fbx $$2 = $$0.dx();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      this.g($$3);
   }

   protected ji e(ji $$0) {
      ji $$1 = $$0.d();
      dxq $$2 = this.dU().a_($$1);
      return !$$2.a(awp.bp) && !$$2.a(awp.bq) ? $$0 : $$1;
   }

   protected void a(dxq $$0, dxq $$1) {
      drx $$2 = $$0.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dxq $$0) {
      drx $$1 = $$0.A();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(ji $$0, dxq $$1) {
      drx $$2 = $$1.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dxq $$0) {
      return $$0.a(awp.bo) && this.af >= this.bf + 20;
   }

   private void o() {
      this.be = this.be * (float)Math.pow(0.997, (double)(this.af - this.bf));
      this.be = Math.min(1.0F, this.be + 0.07F);
      float $$0 = 0.5F + this.be * this.ae.i() * 1.2F;
      float $$1 = 0.1F + this.be * 1.2F;
      this.a(awa.E, $$1, $$0);
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

   public void a(avz $$0, float $$1, float $$2) {
      if (!this.bb()) {
         this.dU().a(null, this.dz(), this.dB(), this.dF(), $$0, this.dl(), $$1, $$2);
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
         this.i(this.dx().b(0.0, -$$0, 0.0));
      }
   }

   protected bva.c bg() {
      return bva.c.d;
   }

   public boolean bh() {
      return false;
   }

   public final void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dn()) {
         this.b($$3, new fbx($$0, $$1, $$2));
         ji $$4 = this.aP();
         dxq $$5 = this.dU().a_($$4);
         this.a($$1, $$3, $$5, $$4);
      }
   }

   protected void a(double $$0, boolean $$1, dxq $$2, ji $$3) {
      if (!this.bj() && $$0 < 0.0) {
         this.Z -= (float)$$0;
      }

      if ($$1) {
         if (this.Z > 0.0F) {
            $$2.b().a(this.dU(), $$2, $$3, this, this.Z);
            this.dU().a(ecp.A, this.t, ecp.a.a(this, this.ax.<dxq>map($$0x -> this.dU().a_($$0x)).orElse($$2)));
         }

         this.k();
      }
   }

   public boolean bi() {
      return this.aq().d();
   }

   public boolean a(float $$0, float $$1, btp $$2) {
      if (this.o.a(awt.o)) {
         return false;
      } else {
         if (this.bZ()) {
            for (bva $$3 : this.cX()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean bj() {
      return this.ag;
   }

   private boolean v() {
      ji $$0 = this.du();
      return this.dU().r($$0) || this.dU().r(ji.a((double)$$0.u(), this.cQ().e, (double)$$0.w()));
   }

   public boolean bk() {
      return this.bj() || this.v();
   }

   public boolean bl() {
      return this.bj() || this.bv();
   }

   public boolean bm() {
      return this.ai && this.bj();
   }

   public void bn() {
      if (this.cj()) {
         this.i(this.ci() && this.bj() && !this.bY());
      } else {
         this.i(this.ci() && this.bm() && !this.bY() && this.dU().b_(this.u).a(awv.a));
      }
   }

   protected boolean bo() {
      this.ah.clear();
      this.bp();
      double $$0 = this.dU().B_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(awv.b, $$0);
      return this.bj() || $$1;
   }

   void bp() {
      if (this.dj() instanceof cro $$0 && !$$0.bm()) {
         this.ag = false;
         return;
      }

      if (this.a(awv.a, 0.014)) {
         if (!this.ag && !this.ak) {
            this.bq();
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
      double $$0 = this.dD();
      if (this.dj() instanceof cro $$2 && !$$2.bm() && $$2.cQ().e >= $$0 && $$2.cQ().b <= $$0) {
         return;
      }

      ji $$3 = ji.a(this.dz(), $$0, this.dF());
      etw $$4 = this.dU().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a(this.dU(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aI::add);
      }
   }

   protected void bq() {
      bva $$0 = Objects.requireNonNullElse(this.cV(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      fbx $$2 = $$0.dx();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aW(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      } else {
         this.a(this.aX(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      }

      float $$4 = (float)ayz.a(this.dB());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bb.a() * 20.0F; $$5++) {
         double $$6 = (this.ae.j() * 2.0 - 1.0) * (double)this.bb.a();
         double $$7 = (this.ae.j() * 2.0 - 1.0) * (double)this.bb.a();
         this.dU().a(lt.d, this.dz() + $$6, (double)($$4 + 1.0F), this.dF() + $$7, $$2.d, $$2.e - this.ae.j() * 0.2F, $$2.f);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bb.a() * 20.0F; $$8++) {
         double $$9 = (this.ae.j() * 2.0 - 1.0) * (double)this.bb.a();
         double $$10 = (this.ae.j() * 2.0 - 1.0) * (double)this.bb.a();
         this.dU().a(lt.ap, this.dz() + $$9, (double)($$4 + 1.0F), this.dF() + $$10, $$2.d, $$2.e, $$2.f);
      }

      this.a(ecp.O);
   }

   @Deprecated
   protected dxq br() {
      return this.dU().a_(this.aP());
   }

   public dxq bs() {
      return this.dU().a_(this.aR());
   }

   public boolean bt() {
      return this.ci() && !this.bj() && !this.U_() && !this.ch() && !this.bv() && this.bJ();
   }

   protected void bu() {
      ji $$0 = this.aP();
      dxq $$1 = this.dU().a_($$0);
      if ($$1.o() != dqp.a) {
         fbx $$2 = this.dx();
         ji $$3 = this.du();
         double $$4 = this.dz() + (this.ae.j() - 0.5) * (double)this.bb.a();
         double $$5 = this.dF() + (this.ae.j() - 0.5) * (double)this.bb.a();
         if ($$3.u() != $$0.u()) {
            $$4 = ayz.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = ayz.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dU().a(new ll(lt.b, $$1), $$4, this.dB() + 0.1, $$5, $$2.d * -4.0, 1.5, $$2.f * -4.0);
      }
   }

   public boolean a(axf<etv> $$0) {
      return this.aI.contains($$0);
   }

   public boolean bv() {
      return !this.ak && this.ah.getDouble(awv.b) > 0.0;
   }

   public void a(float $$0, fbx $$1) {
      fbx $$2 = a($$1, $$0, this.dK());
      this.i(this.dx().e($$2));
   }

   protected static fbx a(fbx $$0, float $$1, float $$2) {
      double $$3 = $$0.h();
      if ($$3 < 1.0E-7) {
         return fbx.c;
      } else {
         fbx $$4 = ($$3 > 1.0 ? $$0.d() : $$0).c((double)$$1);
         float $$5 = ayz.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = ayz.b($$2 * (float) (Math.PI / 180.0));
         return new fbx($$4.d * (double)$$6 - $$4.f * (double)$$5, $$4.e, $$4.f * (double)$$6 + $$4.d * (double)$$5);
      }
   }

   @Deprecated
   public float bw() {
      return this.dU().f(this.dy(), this.dE()) ? this.dU().x(ji.a(this.dz(), this.dD(), this.dF())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.c($$3, $$4);
   }

   public void c(float $$0, float $$1) {
      this.w($$0 % 360.0F);
      this.x(ayz.a($$1, -90.0F, 90.0F) % 360.0F);
      this.N = this.dK();
      this.O = this.dM();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = ayz.a($$0, -3.0E7, 3.0E7);
      double $$4 = ayz.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void f(fbx $$0) {
      this.e($$0.d, $$0.e, $$0.f);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dK(), this.dM());
   }

   public void a(ji $$0, float $$1, float $$2) {
      this.b($$0.c(), $$1, $$2);
   }

   public void b(fbx $$0, float $$1, float $$2) {
      this.b($$0.d, $$0.e, $$0.f, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.o($$0, $$1, $$2);
      this.w($$3);
      this.x($$4);
      this.bx();
      this.ay();
   }

   public final void bx() {
      this.by();
      this.bz();
   }

   public final void c(fbx $$0, float $$1, float $$2) {
      this.k($$0);
      this.f($$1, $$2);
   }

   protected void by() {
      this.k(this.t);
   }

   public void bz() {
      this.f(this.dK(), this.dM());
   }

   private void k(fbx $$0) {
      this.K = this.aa = $$0.d;
      this.L = this.ab = $$0.e;
      this.M = this.ac = $$0.f;
   }

   private void f(float $$0, float $$1) {
      this.N = $$0;
      this.O = $$1;
   }

   public final fbx bA() {
      return new fbx(this.aa, this.ab, this.ac);
   }

   public float f(bva $$0) {
      float $$1 = (float)(this.dz() - $$0.dz());
      float $$2 = (float)(this.dB() - $$0.dB());
      float $$3 = (float)(this.dF() - $$0.dF());
      return ayz.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dz() - $$0;
      double $$4 = this.dB() - $$1;
      double $$5 = this.dF() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(bva $$0) {
      return this.g($$0.ds());
   }

   public double g(fbx $$0) {
      double $$1 = this.dz() - $$0.d;
      double $$2 = this.dB() - $$0.e;
      double $$3 = this.dF() - $$0.f;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void a_(cpr $$0) {
   }

   public void h(bva $$0) {
      if (!this.z($$0)) {
         if (!$$0.ad && !this.ad) {
            double $$1 = $$0.dz() - this.dz();
            double $$2 = $$0.dF() - this.dF();
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
               if (!this.bZ() && this.bG()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.bZ() && $$0.bG()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void h(fbx $$0) {
      this.j($$0.d, $$0.e, $$0.f);
   }

   public void j(double $$0, double $$1, double $$2) {
      this.i(this.dx().b($$0, $$1, $$2));
      this.ar = true;
   }

   protected void bB() {
      this.T = true;
   }

   @Deprecated
   public final void a(btp $$0, float $$1) {
      if (this.s instanceof ard $$2) {
         this.a($$2, $$0, $$1);
      }
   }

   @Deprecated
   public final boolean b(btp $$0, float $$1) {
      return this.s instanceof ard $$2 ? this.a($$2, $$0, $$1) : this.b($$0);
   }

   public abstract boolean a(ard var1, btp var2, float var3);

   public boolean b(btp $$0) {
      return false;
   }

   public final fbx h(float $$0) {
      return this.d(this.i($$0), this.j($$0));
   }

   public jn bC() {
      return jn.a(this.h(1.0F));
   }

   public float i(float $$0) {
      return this.k($$0);
   }

   public float j(float $$0) {
      return this.l($$0);
   }

   public float k(float $$0) {
      return $$0 == 1.0F ? this.dM() : ayz.h($$0, this.O, this.dM());
   }

   public float l(float $$0) {
      return $$0 == 1.0F ? this.dK() : ayz.i($$0, this.N, this.dK());
   }

   public final fbx d(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = ayz.b($$3);
      float $$5 = ayz.a($$3);
      float $$6 = ayz.b($$2);
      float $$7 = ayz.a($$2);
      return new fbx((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final fbx m(float $$0) {
      return this.e(this.i($$0), this.j($$0));
   }

   protected final fbx e(float $$0, float $$1) {
      return this.d($$0 - 90.0F, $$1);
   }

   public final fbx bD() {
      return new fbx(this.dz(), this.dD(), this.dF());
   }

   public final fbx n(float $$0) {
      double $$1 = ayz.d((double)$$0, this.K, this.dz());
      double $$2 = ayz.d((double)$$0, this.L, this.dB()) + (double)this.cR();
      double $$3 = ayz.d((double)$$0, this.M, this.dF());
      return new fbx($$1, $$2, $$3);
   }

   public fbx o(float $$0) {
      return this.n($$0);
   }

   public final fbx p(float $$0) {
      double $$1 = ayz.d((double)$$0, this.K, this.dz());
      double $$2 = ayz.d((double)$$0, this.L, this.dB());
      double $$3 = ayz.d((double)$$0, this.M, this.dF());
      return new fbx($$1, $$2, $$3);
   }

   public fbv a(double $$0, float $$1, boolean $$2) {
      fbx $$3 = this.n($$1);
      fbx $$4 = this.h($$1);
      fbx $$5 = $$3.b($$4.d * $$0, $$4.e * $$0, $$4.f * $$0);
      return this.dU().a(new dgi($$3, $$5, dgi.a.b, $$2 ? dgi.b.c : dgi.b.a, this));
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

   public void a(bva $$0, btp $$1) {
      if ($$0 instanceof are) {
         ap.d.a((are)$$0, this, $$1);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
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

   public boolean d(tq $$0) {
      if (this.aE != null && !this.aE.b()) {
         return false;
      } else {
         String $$1 = this.bI();
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
      return this.bY() ? false : this.d($$0);
   }

   public tq f(tq $$0) {
      try {
         if (this.r != null) {
            $$0.a("Pos", this.a(this.r.dz(), this.dB(), this.r.dF()));
         } else {
            $$0.a("Pos", this.a(this.dz(), this.dB(), this.dF()));
         }

         fbx $$1 = this.dx();
         $$0.a("Motion", this.a($$1.d, $$1.e, $$1.f));
         $$0.a("Rotation", this.a(this.dK(), this.dM()));
         $$0.a("FallDistance", this.Z);
         $$0.a("Fire", (short)this.aH);
         $$0.a("Air", (short)this.cs());
         $$0.a("OnGround", this.aJ());
         $$0.a("Invulnerable", this.aW);
         $$0.a("PortalCooldown", this.aV);
         $$0.a("UUID", this.cF());
         wp $$2 = this.an();
         if ($$2 != null) {
            aks<un> $$3 = this.dW().a(ue.a);
            $$0.a("CustomName", (un)wr.a.encodeStart($$3, $$2).getOrThrow());
         }

         if (this.cK()) {
            $$0.a("CustomNameVisible", this.cK());
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

         int $$4 = this.ct();
         if ($$4 > 0) {
            $$0.a("TicksFrozen", this.ct());
         }

         if (this.bg) {
            $$0.a("HasVisualFire", this.bg);
         }

         if (!this.aY.isEmpty()) {
            tw $$5 = new tw();

            for (String $$6 : this.aY) {
               $$5.add(ul.a($$6));
            }

            $$0.a("Tags", $$5);
         }

         this.b($$0);
         if (this.bZ()) {
            tw $$7 = new tw();

            for (bva $$8 : this.cX()) {
               tq $$9 = new tq();
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
         this.w($$3.i(0));
         this.x($$3.i(1));
         this.bx();
         this.r(this.dK());
         this.s(this.dK());
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

         if (!Double.isFinite(this.dz()) || !Double.isFinite(this.dB()) || !Double.isFinite(this.dF())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dK()) && Double.isFinite((double)this.dM())) {
            this.ay();
            this.b(this.dK(), this.dM());
            un $$8 = $$0.c("CustomName");
            if ($$8 != null) {
               aks<un> $$9 = this.dW().a(ue.a);
               wr.a.parse($$9, $$8).ifSuccess(this::b).ifError($$1x -> b.warn("Failed to parse entity custom name {}: {}", $$8, $$1x));
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
               tw $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.aY.add($$10.j($$12));
               }
            }

            this.a($$0);
            if (this.bH()) {
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

   protected boolean bH() {
      return true;
   }

   @Nullable
   protected final String bI() {
      bvi<?> $$0 = this.aq();
      aku $$1 = bvi.a($$0);
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
   public clw a(ard $$0, dgy $$1) {
      return this.a($$0, $$1, 0);
   }

   @Nullable
   public clw a(ard $$0, dgy $$1, int $$2) {
      return this.a($$0, new cxh($$1), (float)$$2);
   }

   @Nullable
   public clw a(ard $$0, cxh $$1) {
      return this.a($$0, $$1, 0.0F);
   }

   @Nullable
   public clw a(ard $$0, cxh $$1, float $$2) {
      if ($$1.f()) {
         return null;
      } else {
         clw $$3 = new clw($$0, this.dz(), this.dB() + (double)$$2, this.dF(), $$1);
         $$3.j();
         $$0.b($$3);
         return $$3;
      }
   }

   public boolean bJ() {
      return !this.dP();
   }

   public boolean bK() {
      if (this.ad) {
         return false;
      } else {
         float $$0 = this.bb.a() * 0.8F;
         fbs $$1 = fbs.a(this.bD(), (double)$$0, 1.0E-6, (double)$$0);
         return ji.b($$1).anyMatch($$1x -> {
            dxq $$2 = this.dU().a_($$1x);
            return !$$2.l() && $$2.j(this.dU(), $$1x) && fco.c($$2.g(this.dU(), $$1x).a($$1x), fco.a($$1), fcb.i);
         });
      }
   }

   public bsy a(cpr $$0, bsx $$1) {
      if (this.bJ() && this instanceof bvw $$2) {
         if ($$2.C() == $$0) {
            if (!this.dU().w_()) {
               if ($$0.fX()) {
                  $$2.z();
               } else {
                  $$2.y();
               }

               this.a(ecp.r, $$0);
            }

            return bsy.a.b();
         }

         cxh $$3 = $$0.b($$1);
         if ($$3.a(cxl.vM) && $$2.p()) {
            if (!this.dU().w_()) {
               $$2.b($$0, true);
            }

            $$3.h(1);
            return bsy.a;
         }
      }

      return bsy.e;
   }

   public boolean i(bva $$0) {
      return $$0.bL() && !this.z($$0);
   }

   public boolean bL() {
      return false;
   }

   public void r() {
      this.i(fbx.c);
      this.h();
      if (this.bY()) {
         this.dj().j(this);
      }
   }

   public final void j(bva $$0) {
      if (this.y($$0)) {
         this.a($$0, bva::a_);
      }
   }

   protected void a(bva $$0, bva.a $$1) {
      fbx $$2 = this.m($$0);
      fbx $$3 = $$0.l(this);
      $$1.accept($$0, $$2.d - $$3.d, $$2.e - $$3.e, $$2.f - $$3.f);
   }

   public void k(bva $$0) {
   }

   public fbx l(bva $$0) {
      return this.dr().b(bvb.b, 0, this.aA);
   }

   public fbx m(bva $$0) {
      return this.ds().e(this.a($$0, this.bb, 1.0F));
   }

   protected fbx a(bva $$0, bvd $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static fbx a(bva $$0, bva $$1, bvc $$2) {
      int $$3 = $$0.cX().indexOf($$1);
      return $$2.c(bvb.a, $$3, $$0.aA);
   }

   public boolean n(bva $$0) {
      return this.a($$0, false);
   }

   public boolean bM() {
      return this instanceof bvy;
   }

   public boolean a(bva $$0, boolean $$1) {
      if ($$0 == this.r) {
         return false;
      } else if (!$$0.bP()) {
         return false;
      } else if (!this.dU().w_() && !$$0.o.b()) {
         return false;
      } else {
         for (bva $$2 = $$0; $$2.r != null; $$2 = $$2.r) {
            if ($$2.r == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bY()) {
               this.bO();
            }

            this.b(bwk.a);
            this.r = $$0;
            this.r.p(this);
            $$0.F().filter($$0x -> $$0x instanceof are).forEach($$0x -> ap.U.a((are)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bva $$0) {
      return !this.cc() && this.J <= 0;
   }

   public void bN() {
      for (int $$0 = this.q.size() - 1; $$0 >= 0; $$0--) {
         ((bva)this.q.get($$0)).bO();
      }
   }

   public void ae() {
      if (this.r != null) {
         bva $$0 = this.r;
         this.r = null;
         $$0.q(this);
      }
   }

   public void bO() {
      this.ae();
   }

   protected void p(bva $$0) {
      if ($$0.dj() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.q.isEmpty()) {
            this.q = ImmutableList.of($$0);
         } else {
            List<bva> $$1 = Lists.newArrayList(this.q);
            if (!this.dU().C && $$0 instanceof cpr && !(this.cY() instanceof cpr)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.q = ImmutableList.copyOf($$1);
         }

         this.a(ecp.s, $$0);
      }
   }

   protected void q(bva $$0) {
      if ($$0.dj() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.q.size() == 1 && this.q.get(0) == $$0) {
            this.q = ImmutableList.of();
         } else {
            this.q = this.q.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(ecp.q, $$0);
      }
   }

   protected boolean r(bva $$0) {
      return this.q.isEmpty();
   }

   protected boolean bP() {
      return true;
   }

   public final boolean bQ() {
      return this.N_() != null && this.N_().d();
   }

   public final void d(fbx $$0, float $$1, float $$2) {
      bvt $$3 = this.N_();
      if ($$3 != null) {
         $$3.a($$0, $$1, $$2);
      } else {
         this.b($$0, $$1, $$2);
      }
   }

   @Nullable
   public bvt N_() {
      return null;
   }

   public void a(float $$0, int $$1) {
      this.r($$0);
   }

   public float bR() {
      return 0.0F;
   }

   public fbx bS() {
      return this.d(this.dM(), this.dK());
   }

   public fbx a(cxd $$0) {
      if (!(this instanceof cpr $$1)) {
         return fbx.c;
      } else {
         boolean $$2 = $$1.fa().a($$0) && !$$1.eZ().a($$0);
         bvr $$3 = $$2 ? $$1.fA().e() : $$1.fA();
         return this.d(0.0F, this.dK() + (float)($$3 == bvr.b ? 80 : -80)).c(0.5);
      }
   }

   public fbw bT() {
      return new fbw(this.dM(), this.dK());
   }

   public fbx bU() {
      return fbx.a(this.bT());
   }

   public void a(dqb $$0, ji $$1) {
      if (this.aD()) {
         this.aB();
      } else {
         if (this.as == null || !this.as.a($$0)) {
            this.as = new bwj($$0, $$1.j());
         } else if (!this.as.e()) {
            this.as.a($$1.j());
            this.as.a(true);
         }
      }
   }

   protected void bV() {
      if (this.dU() instanceof ard $$0) {
         this.M();
         if (this.as != null) {
            if (this.as.a($$0, this, this.n(false))) {
               bpj $$2 = bpi.a();
               $$2.a("portal");
               this.aB();
               euw $$3 = this.as.a($$0, this);
               if ($$3 != null) {
                  ard $$4 = $$3.b();
                  if ($$0.p().a((dgz)$$4) && ($$4.aj() == $$0.aj() || this.a($$0, $$4))) {
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
      bva $$0 = this.cY();
      return $$0 instanceof are ? $$0.bW() : 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
   }

   public void c(btp $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dob.a(this);
      }
   }

   public void q(float $$0) {
   }

   public boolean bX() {
      boolean $$0 = this.dU() != null && this.dU().C;
      return !this.bi() && (this.aH > 0 || $$0 && this.i(0));
   }

   public boolean bY() {
      return this.dj() != null;
   }

   public boolean bZ() {
      return !this.q.isEmpty();
   }

   public boolean ca() {
      return this.aq().a(awt.p);
   }

   public boolean cb() {
      return !this.aq().a(awt.q);
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
      return this.c(bwk.f);
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
      return this.c(bwk.d);
   }

   public boolean cl() {
      return this.ck() && !this.bj();
   }

   public void i(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cm() {
      return this.aX;
   }

   public final void j(boolean $$0) {
      this.aX = $$0;
      this.b(6, this.cn());
   }

   public boolean cn() {
      return this.dU().w_() ? this.i(6) : this.aX;
   }

   public boolean co() {
      return this.i(5);
   }

   public boolean d(cpr $$0) {
      if ($$0.U_()) {
         return false;
      } else {
         fde $$1 = this.cq();
         return $$1 != null && $$0 != null && $$0.cq() == $$1 && $$1.i() ? false : this.co();
      }
   }

   public boolean cp() {
      return false;
   }

   public void a(BiConsumer<ecm<?>, ard> $$0) {
   }

   @Nullable
   public fcx cq() {
      return this.dU().R().e(this.cH());
   }

   public final boolean s(@Nullable bva $$0) {
      return $$0 == null ? false : this == $$0 || this.t($$0) || $$0.t(this);
   }

   protected boolean t(bva $$0) {
      return this.a($$0.cq());
   }

   public boolean a(@Nullable fde $$0) {
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
      return this.al.a(aN);
   }

   public void j(int $$0) {
      this.al.a(aN, $$0);
   }

   public int ct() {
      return this.al.a(aS);
   }

   public void k(int $$0) {
      this.al.a(aS, $$0);
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

   public void a(ard $$0, bvx $$1) {
      this.h(this.aH + 1);
      if (this.aH == 0) {
         this.e(8.0F);
      }

      this.a($$0, this.dV().c(), 5.0F);
   }

   public void a(boolean $$0, ji $$1) {
      fbx $$2 = this.dx();
      double $$3;
      if ($$0) {
         $$3 = Math.max(-0.9, $$2.e - 0.03);
      } else {
         $$3 = Math.min(1.8, $$2.e + 0.1);
      }

      this.n($$2.d, $$3, $$2.f);
      this.f($$1);
   }

   protected void f(ji $$0) {
      if (this.s instanceof ard $$1) {
         for (int $$2 = 0; $$2 < 2; $$2++) {
            $$1.a(lt.ap, (double)$$0.u() + this.s.A.j(), (double)($$0.v() + 1), (double)$$0.w() + this.s.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            $$1.a(lt.d, (double)$$0.u() + this.s.A.j(), (double)($$0.v() + 1), (double)$$0.w() + this.s.A.j(), 1, 0.0, 0.01, 0.0, 0.2);
         }
      }
   }

   public void l(boolean $$0) {
      fbx $$1 = this.dx();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.e - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.e + 0.06);
      }

      this.n($$1.d, $$2, $$1.f);
      this.k();
   }

   public boolean a(ard $$0, bvy $$1) {
      return true;
   }

   public void cx() {
      if (this.dx().b() > -0.5 && this.Z > 1.0F) {
         this.Z = 1.0F;
      }
   }

   public void k() {
      this.Z = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      ji $$3 = ji.a($$0, $$1, $$2);
      fbx $$4 = new fbx($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      ji.a $$5 = new ji.a();
      jn $$6 = jn.b;
      double $$7 = Double.MAX_VALUE;

      for (jn $$8 : new jn[]{jn.c, jn.d, jn.e, jn.f, jn.b}) {
         $$5.a($$3, $$8);
         if (!this.dU().a_($$5).m(this.dU(), $$5)) {
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
      fbx $$13 = this.dx().c(0.75);
      if ($$6.o() == jn.a.a) {
         this.n((double)($$12 * $$11), $$13.e, $$13.f);
      } else if ($$6.o() == jn.a.b) {
         this.n($$13.d, (double)($$12 * $$11), $$13.f);
      } else if ($$6.o() == jn.a.c) {
         this.n($$13.d, $$13.e, (double)($$12 * $$11));
      }
   }

   public void a(dxq $$0, fbx $$1) {
      this.k();
      this.U = $$1;
   }

   private static wp a(wp $$0) {
      xd $$1 = $$0.e().b($$0.a().a(null));

      for (wp $$2 : $$0.c()) {
         $$1.b(a($$2));
      }

      return $$1;
   }

   @Override
   public wp al() {
      wp $$0 = this.an();
      return $$0 != null ? a($$0) : this.cy();
   }

   protected wp cy() {
      return this.o.h();
   }

   public boolean u(bva $$0) {
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

   public boolean v(bva $$0) {
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
            this.al().getString(),
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
            this.al().getString(),
            this.p,
            $$0,
            this.dz(),
            this.dB(),
            this.dF()
         );
   }

   protected final boolean d(btp $$0) {
      return this.dP() || this.aW && !$$0.a(awr.d) && !$$0.h() || $$0.a(awr.i) && this.bi() || $$0.a(awr.m) && this.aq().a(awt.o);
   }

   public boolean cB() {
      return this.aW;
   }

   public void m(boolean $$0) {
      this.aW = $$0;
   }

   public void w(bva $$0) {
      this.b($$0.dz(), $$0.dB(), $$0.dF(), $$0.dK(), $$0.dM());
   }

   public void x(bva $$0) {
      tq $$1 = $$0.f(new tq());
      $$1.r("Dimension");
      this.g($$1);
      this.aV = $$0.aV;
      this.as = $$0.as;
   }

   @Nullable
   public bva b(euw $$0) {
      if (this.dU() instanceof ard $$1 && !this.dP()) {
         ard $$3 = $$0.b();
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

   private bva a(ard $$0, euw $$1) {
      for (bva $$2 : this.cX()) {
         $$2.b(this.a($$1, $$2));
      }

      bpj $$3 = bpi.a();
      $$3.a("teleportSameDimension");
      this.a(bwl.a($$1), $$1.i());
      if (!$$1.h()) {
         this.a($$1);
      }

      $$1.j().onTransition(this);
      $$3.c();
      return this;
   }

   private bva b(ard $$0, euw $$1) {
      List<bva> $$2 = this.cX();
      List<bva> $$3 = new ArrayList<>($$2.size());
      this.bN();

      for (bva $$4 : $$2) {
         bva $$5 = $$4.b(this.a($$1, $$4));
         if ($$5 != null) {
            $$3.add($$5);
         }
      }

      bpj $$6 = bpi.a();
      $$6.a("teleportCrossDimension");
      bva $$7 = this.aq().a($$0, bvh.s);
      if ($$7 == null) {
         $$6.c();
         return null;
      } else {
         $$7.x(this);
         this.cC();
         $$7.a(bwl.a($$1), $$1.i());
         $$0.d($$7);

         for (bva $$8 : $$3) {
            $$8.a($$7, true);
         }

         $$0.i();
         $$1.j().onTransition($$7);
         $$6.c();
         return $$7;
      }
   }

   private euw a(euw $$0, bva $$1) {
      float $$2 = $$0.e() + ($$0.i().contains(bwm.d) ? 0.0F : $$1.dK() - this.dK());
      float $$3 = $$0.f() + ($$0.i().contains(bwm.e) ? 0.0F : $$1.dM() - this.dM());
      fbx $$4 = $$1.ds().d(this.ds());
      fbx $$5 = $$0.c().b($$0.i().contains(bwm.a) ? 0.0 : $$4.a(), $$0.i().contains(bwm.b) ? 0.0 : $$4.b(), $$0.i().contains(bwm.c) ? 0.0 : $$4.c());
      return $$0.a($$5).a($$2, $$3).a();
   }

   private void a(euw $$0) {
      bva $$1 = this.cV();

      for (bva $$2 : this.db()) {
         if ($$2 instanceof are) {
            are $$3 = (are)$$2;
            if ($$1 != null && $$3.ar() == $$1.ar()) {
               $$3.f.b(aft.a(this.ar(), bwl.a($$0), $$0.i(), this.aD));
            } else {
               $$3.f.b(aft.a(this.ar(), bwl.a(this), Set.of(), this.aD));
            }
         }
      }
   }

   public void a(bwl $$0, Set<bwm> $$1) {
      bwl $$2 = bwl.a(this);
      bwl $$3 = bwl.a($$2, $$0, $$1);
      this.o($$3.a().d, $$3.a().e, $$3.a().f);
      this.w($$3.c());
      this.r($$3.c());
      this.x($$3.d());
      this.ay();
      this.bx();
      this.i($$3.b());
      this.bi.clear();
   }

   public void a(float $$0, float $$1) {
      this.w($$0);
      this.r($$0);
      this.x($$1);
      this.bz();
   }

   public void g(ji $$0) {
      if (this.dU() instanceof ard $$1) {
         $$1.m().a(ark.g, new dgg($$0), 3);
      }
   }

   protected void cC() {
      this.c(bva.d.e);
      if (this instanceof bvw $$0) {
         $$0.z();
      }
   }

   public fbx a(jn.a $$0, l.a $$1) {
      return euv.a($$1, $$0, this.ds(), this.a(this.aw()));
   }

   public boolean n(boolean $$0) {
      return ($$0 || !this.bY()) && this.bJ();
   }

   public boolean a(dgz $$0, dgz $$1) {
      if ($$0.aj() == dgz.k && $$1.aj() == dgz.i) {
         for (bva $$2 : this.cX()) {
            if ($$2 instanceof are $$3 && !$$3.i) {
               return false;
            }
         }
      }

      return true;
   }

   public float a(dgs $$0, dgf $$1, ji $$2, dxq $$3, etw $$4, float $$5) {
      return $$5;
   }

   public boolean a(dgs $$0, dgf $$1, ji $$2, dxq $$3, float $$4) {
      return true;
   }

   public int cD() {
      return 3;
   }

   public boolean g_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bvi.a(this.aq()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.p);
      $$0.a("Entity Name", () -> this.al().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dz(), this.dB(), this.dF()));
      $$0.a("Entity's Block location", p.a(this.dU(), ayz.a(this.dz()), ayz.a(this.dB()), ayz.a(this.dF())));
      fbx $$1 = this.dx();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.d, $$1.e, $$1.f));
      $$0.a("Entity's Passengers", () -> this.cX().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.dj()));
   }

   public boolean cE() {
      return this.bX() && !this.U_();
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
   public wp m_() {
      return fcx.a(this.cq(), this.al()).a($$0 -> $$0.a(this.cP()).a(this.cG()));
   }

   public void b(@Nullable wp $$0) {
      this.al.a(aO, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public wp an() {
      return this.al.a(aO).orElse(null);
   }

   @Override
   public boolean h_() {
      return this.al.a(aO).isPresent();
   }

   public void o(boolean $$0) {
      this.al.a(aP, $$0);
   }

   public boolean cK() {
      return this.al.a(aP);
   }

   public boolean a(ard $$0, double $$1, double $$2, double $$3, Set<bwm> $$4, float $$5, float $$6, boolean $$7) {
      float $$8 = ayz.a($$6, -90.0F, 90.0F);
      bva $$9 = this.b(new euw($$0, new fbx($$1, $$2, $$3), fbx.c, $$5, $$8, $$4, euw.a));
      return $$9 != null;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dU() instanceof ard) {
         this.b($$0, $$1, $$2, this.dK(), this.dM());
         this.E();
      }
   }

   private void E() {
      this.cZ().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.q.iterator();

         while (var1.hasNext()) {
            bva $$1 = (bva)var1.next();
            $$0.a($$1, bva::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.dz() + $$0, this.dB() + $$1, this.dF() + $$2);
   }

   public boolean cL() {
      return this.cK();
   }

   @Override
   public void a(List<akb.c<?>> $$0) {
   }

   @Override
   public void a(ajx<?> $$0) {
      if (aq.equals($$0)) {
         this.i_();
      }
   }

   @Deprecated
   protected void cM() {
      bwk $$0 = this.aw();
      bvd $$1 = this.a($$0);
      this.bb = $$1;
      this.bc = $$1.c();
   }

   public void i_() {
      bvd $$0 = this.bb;
      bwk $$1 = this.aw();
      bvd $$2 = this.a($$1);
      this.bb = $$2;
      this.bc = $$2.c();
      this.ay();
      boolean $$3 = $$2.a() <= 4.0F && $$2.b() <= 4.0F;
      if (!this.s.C && !this.ak && !this.ad && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cpr)) {
         this.a($$0);
      }
   }

   public boolean a(bvd $$0) {
      bvd $$1 = this.a(this.aw());
      fbx $$2 = this.ds().b(0.0, (double)$$0.b() / 2.0, 0.0);
      double $$3 = (double)Math.max(0.0F, $$1.a() - $$0.a()) + 1.0E-6;
      double $$4 = (double)Math.max(0.0F, $$1.b() - $$0.b()) + 1.0E-6;
      fcr $$5 = fco.a(fbs.a($$2, $$3, $$4, $$3));
      Optional<fbx> $$6 = this.s.a(this, $$5, $$2, (double)$$1.a(), (double)$$1.b(), (double)$$1.a());
      if ($$6.isPresent()) {
         this.b($$6.get().b(0.0, (double)(-$$1.b()) / 2.0, 0.0));
         return true;
      } else {
         if ($$1.a() > $$0.a() && $$1.b() > $$0.b()) {
            fcr $$7 = fco.a(fbs.a($$2, $$3, 1.0E-6, $$3));
            Optional<fbx> $$8 = this.s.a(this, $$7, $$2, (double)$$1.a(), (double)$$0.b(), (double)$$1.a());
            if ($$8.isPresent()) {
               this.b($$8.get().b(0.0, (double)(-$$0.b()) / 2.0 + 1.0E-6, 0.0));
               return true;
            }
         }

         return false;
      }
   }

   public jn cN() {
      return jn.a((double)this.dK());
   }

   public jn cO() {
      return this.cN();
   }

   protected wv cP() {
      return new wv.c(new wv.b(this.aq(), this.cF(), this.al()));
   }

   public boolean a(are $$0) {
      return true;
   }

   @Override
   public final fbs cQ() {
      return this.aC;
   }

   public final void a(fbs $$0) {
      this.aC = $$0;
   }

   public final float d(bwk $$0) {
      return this.a($$0).c();
   }

   public final float cR() {
      return this.bc;
   }

   public fbx t(float $$0) {
      return this.cS();
   }

   protected fbx cS() {
      return new fbx(0.0, (double)this.cR(), (double)(this.dp() * 0.4F));
   }

   public bwq a_(int $$0) {
      return bwq.a;
   }

   public dgz cT() {
      return this.dU();
   }

   @Nullable
   public MinecraftServer cU() {
      return this.dU().p();
   }

   public bsy a(cpr $$0, fbx $$1, bsx $$2) {
      return bsy.e;
   }

   public boolean a(dgs $$0) {
      return false;
   }

   public void d(are $$0) {
   }

   public void e(are $$0) {
   }

   public float a(dqw $$0) {
      float $$1 = ayz.h(this.dK());
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

   public float a(dpf $$0) {
      float $$1 = ayz.h(this.dK());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public cql a(cqk $$0) {
      return this.aq().a(awt.r) ? cql.b : cql.a;
   }

   @Nullable
   public bvy cV() {
      return null;
   }

   public final boolean cW() {
      return this.cV() != null;
   }

   public final List<bva> cX() {
      return this.q;
   }

   @Nullable
   public bva cY() {
      return this.q.isEmpty() ? null : (bva)this.q.get(0);
   }

   public boolean y(bva $$0) {
      return this.q.contains($$0);
   }

   public boolean a(Predicate<bva> $$0) {
      UnmodifiableIterator var2 = this.q.iterator();

      while (var2.hasNext()) {
         bva $$1 = (bva)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bva> F() {
      return this.q.stream().flatMap(bva::cZ);
   }

   @Override
   public Stream<bva> cZ() {
      return Stream.concat(Stream.of(this), this.F());
   }

   @Override
   public Stream<bva> da() {
      return Stream.concat(this.q.stream().flatMap(bva::da), Stream.of(this));
   }

   public Iterable<bva> db() {
      return () -> this.F().iterator();
   }

   public int dc() {
      return (int)this.F().filter($$0 -> $$0 instanceof cpr).count();
   }

   public boolean dd() {
      return this.dc() == 1;
   }

   public bva de() {
      bva $$0 = this;

      while ($$0.bY()) {
         $$0 = $$0.dj();
      }

      return $$0;
   }

   public boolean z(bva $$0) {
      return this.de() == $$0.de();
   }

   public boolean A(bva $$0) {
      if (!$$0.bY()) {
         return false;
      } else {
         bva $$1 = $$0.dj();
         return $$1 == this ? true : this.A($$1);
      }
   }

   public final boolean df() {
      return this.s.w_() ? this.dg() : !this.L_();
   }

   protected boolean dg() {
      bvy $$0 = this.cV();
      return $$0 != null && $$0.dg();
   }

   public boolean L_() {
      bvy $$0 = this.cV();
      return $$0 != null && $$0.L_();
   }

   public boolean dh() {
      return this.df();
   }

   public boolean di() {
      return this.df();
   }

   protected static fbx a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -ayz.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = ayz.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new fbx((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public fbx b(bvy $$0) {
      return new fbx(this.dz(), this.cQ().e, this.dF());
   }

   @Nullable
   public bva dj() {
      return this.r;
   }

   @Nullable
   public bva dk() {
      return this.r != null && this.r.cV() == this ? this.r : null;
   }

   public eub j_() {
      return eub.a;
   }

   public awb dl() {
      return awb.g;
   }

   protected int dm() {
      return 1;
   }

   public ex d(ard $$0) {
      return new ex(ew.a, this.ds(), this.bT(), $$0, 0, this.al().getString(), this.m_(), $$0.p(), this);
   }

   public void a(fj.a $$0, fbx $$1) {
      fbx $$2 = $$0.a(this);
      double $$3 = $$1.d - $$2.d;
      double $$4 = $$1.e - $$2.e;
      double $$5 = $$1.f - $$2.f;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.x(ayz.h((float)(-(ayz.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.w(ayz.h((float)(ayz.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.r(this.dK());
      this.O = this.dM();
      this.N = this.dK();
   }

   public float u(float $$0) {
      return ayz.h($$0, this.N, this.aA);
   }

   public boolean a(axf<etv> $$0, double $$1) {
      if (this.dn()) {
         return false;
      } else {
         fbs $$2 = this.cQ().h(0.001);
         int $$3 = ayz.a($$2.a);
         int $$4 = ayz.c($$2.d);
         int $$5 = ayz.a($$2.b);
         int $$6 = ayz.c($$2.e);
         int $$7 = ayz.a($$2.c);
         int $$8 = ayz.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cI();
         boolean $$11 = false;
         fbx $$12 = fbx.c;
         int $$13 = 0;
         ji.a $$14 = new ji.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  etw $$18 = this.dU().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a(this.dU(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           fbx $$20 = $$18.c(this.dU(), $$14);
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

            if (!(this instanceof cpr)) {
               $$12 = $$12.d();
            }

            fbx $$21 = this.dx();
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
      fbs $$0 = this.cQ().g(1.0);
      int $$1 = ayz.a($$0.a);
      int $$2 = ayz.c($$0.d);
      int $$3 = ayz.a($$0.c);
      int $$4 = ayz.c($$0.f);
      return !this.dU().b($$1, $$3, $$2, $$4);
   }

   public double b(axf<etv> $$0) {
      return this.ah.getDouble($$0);
   }

   public double do() {
      return (double)this.cR() < 0.4 ? 0.0 : 0.4;
   }

   public final float dp() {
      return this.bb.a();
   }

   public final float dq() {
      return this.bb.b();
   }

   public yw<abl> a(arb $$0) {
      return new abm(this, $$0);
   }

   public bvd a(bwk $$0) {
      return this.o.n();
   }

   public final bvc dr() {
      return this.bb.d();
   }

   public fbx ds() {
      return this.t;
   }

   public fbx dt() {
      return this.ds();
   }

   @Override
   public ji du() {
      return this.u;
   }

   public dxq dv() {
      if (this.bh == null) {
         this.bh = this.dU().a_(this.du());
      }

      return this.bh;
   }

   public dgg dw() {
      return this.ay;
   }

   public fbx dx() {
      return this.az;
   }

   public void i(fbx $$0) {
      this.az = $$0;
   }

   public void j(fbx $$0) {
      this.i(this.dx().e($$0));
   }

   public void n(double $$0, double $$1, double $$2) {
      this.i(new fbx($$0, $$1, $$2));
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
      return this.t.e + (double)this.bc;
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
         this.t = new fbx($$0, $$1, $$2);
         int $$3 = ayz.a($$0);
         int $$4 = ayz.a($$1);
         int $$5 = ayz.a($$2);
         if ($$3 != this.u.u() || $$4 != this.u.v() || $$5 != this.u.w()) {
            this.u = new ji($$3, $$4, $$5);
            this.bh = null;
            if (kk.a($$3) != this.ay.h || kk.a($$5) != this.ay.i) {
               this.ay = new dgg(this.u);
            }
         }

         this.aT.a();
      }
   }

   public void dG() {
   }

   public fbx v(float $$0) {
      return this.p($$0).b(0.0, (double)this.bc * 0.7, 0.0);
   }

   public void a(abm $$0) {
      int $$1 = $$0.b();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      double $$4 = $$0.i();
      this.f($$2, $$3, $$4);
      this.b($$2, $$3, $$4, $$0.n(), $$0.m());
      this.e($$1);
      this.a_($$0.e());
      fbx $$5 = new fbx($$0.j(), $$0.k(), $$0.l());
      this.i($$5);
   }

   @Nullable
   public cxh dH() {
      return null;
   }

   public void p(boolean $$0) {
      this.av = $$0;
   }

   public boolean dI() {
      return !this.aq().a(awt.k);
   }

   public boolean dJ() {
      return (this.av || this.aw) && this.dI();
   }

   public float dK() {
      return this.aA;
   }

   public float dL() {
      return this.dK();
   }

   public void w(float $$0) {
      if (!Float.isFinite($$0)) {
         af.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aA = $$0;
      }
   }

   public float dM() {
      return this.aB;
   }

   public void x(float $$0) {
      if (!Float.isFinite($$0)) {
         af.b("Invalid entity rotation: " + $$0 + ", discarding.");
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

   public void b_(@Nullable bva $$0) {
   }

   @Override
   public final boolean dP() {
      return this.aE != null;
   }

   @Nullable
   public bva.d dQ() {
      return this.aE;
   }

   @Override
   public final void c(bva.d $$0) {
      if (this.aE == null) {
         this.aE = $$0;
      }

      if (this.aE.a()) {
         this.bO();
      }

      this.cX().forEach(bva::bO);
      this.aT.a($$0);
      this.b($$0);
   }

   protected void dR() {
      this.aE = null;
   }

   @Override
   public void a(ebv $$0) {
      this.aT = $$0;
   }

   @Override
   public boolean dS() {
      if (this.aE != null && !this.aE.b()) {
         return false;
      } else {
         return this.bY() ? false : !this.bZ() || !this.dd();
      }
   }

   @Override
   public boolean dT() {
      return false;
   }

   public boolean c(ard $$0, ji $$1) {
      return true;
   }

   public dgz dU() {
      return this.s;
   }

   protected void a(dgz $$0) {
      this.s = $$0;
   }

   public btq dV() {
      return this.dU().al();
   }

   public kf dW() {
      return this.dU().F_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = ayz.d($$6, this.dz(), $$1);
      double $$8 = ayz.d($$6, this.dB(), $$2);
      double $$9 = ayz.d($$6, this.dF(), $$3);
      float $$10 = (float)ayz.e($$6, (double)this.dK(), $$4);
      float $$11 = (float)ayz.d($$6, (double)this.dM(), $$5);
      this.a_($$7, $$8, $$9);
      this.b($$10, $$11);
   }

   public azh dX() {
      return this.ae;
   }

   public fbx ah() {
      if (this.cV() instanceof cpr $$0 && this.bJ()) {
         return $$0.ah();
      }

      return this.dx();
   }

   @Nullable
   public cxh dY() {
      return null;
   }

   public Optional<akt<ewt>> dZ() {
      return this.o.j();
   }

   @FunctionalInterface
   public interface a {
      void accept(bva var1, double var2, double var4, double var6);
   }

   static record b(fbx a, fbx b) {
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
