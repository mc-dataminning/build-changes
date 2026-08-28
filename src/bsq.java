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

public abstract class bsq implements ajy, bqv, dxd, es, exz {
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
   private static final ewr d = new ewr(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double e = 0.014;
   private static final double k = 0.007;
   private static final double l = 0.0023333333333333335;
   public static final String I = "UUID";
   private static double m = 1.0;
   private final bsw<?> n;
   private int o = c.incrementAndGet();
   public boolean J;
   private ImmutableList<bsq> p = ImmutableList.of();
   protected int K;
   @Nullable
   private bsq q;
   private dcu r;
   public double L;
   public double M;
   public double N;
   private eww s;
   private jd t;
   private dcb u;
   private eww v = eww.b;
   private float aD;
   private float aE;
   public float O;
   public float P;
   private ewr aF = d;
   private boolean aG;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   public boolean U;
   protected eww V = eww.b;
   @Nullable
   private bsq.c aH;
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
   protected final ayv ah = ayv.a();
   public int ai;
   private int aJ = -this.dg();
   protected boolean aj;
   protected Object2DoubleMap<awt<eox>> ak = new Object2DoubleArrayMap(2);
   protected boolean al;
   private final Set<awt<eox>> aK = new HashSet<>();
   public int am;
   protected boolean an = true;
   protected final ajz ao;
   protected static final ajv<Byte> ap = ajz.a(bsq.class, ajx.a);
   protected static final int aq = 0;
   private static final int aL = 1;
   private static final int aM = 3;
   private static final int aN = 4;
   private static final int aO = 5;
   protected static final int ar = 6;
   protected static final int as = 7;
   private static final ajv<Integer> aP = ajz.a(bsq.class, ajx.b);
   private static final ajv<Optional<wy>> aQ = ajz.a(bsq.class, ajx.g);
   private static final ajv<Boolean> aR = ajz.a(bsq.class, ajx.k);
   private static final ajv<Boolean> aS = ajz.a(bsq.class, ajx.k);
   private static final ajv<Boolean> aT = ajz.a(bsq.class, ajx.k);
   protected static final ajv<bty> at = ajz.a(bsq.class, ajx.w);
   private static final ajv<Integer> aU = ajz.a(bsq.class, ajx.b);
   private dxe aV = dxe.a;
   private final aif aW = new aif();
   public boolean au;
   public boolean av;
   @Nullable
   public btx aw;
   private int aX;
   private boolean aY;
   protected UUID ax = ayn.a(this.ah);
   protected String ay = this.ax.toString();
   private boolean aZ;
   private final Set<String> ba = Sets.newHashSet();
   private final double[] bb = new double[]{0.0, 0.0, 0.0};
   private long bc;
   private bst bd;
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
   private dta bj = null;

   public bsq(bsw<?> $$0, dcu $$1) {
      this.n = $$0;
      this.r = $$1;
      this.bd = $$0.n();
      this.s = eww.b;
      this.t = jd.c;
      this.u = dcb.b;
      ajz.a $$2 = new ajz.a(this);
      $$2.a(ap, (byte)0);
      $$2.a(aP, this.cl());
      $$2.a(aR, false);
      $$2.a(aQ, Optional.empty());
      $$2.a(aS, false);
      $$2.a(aT, false);
      $$2.a(at, bty.a);
      $$2.a(aU, 0);
      this.a($$2);
      this.ao = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.be = this.bd.c();
   }

   public boolean a(jd $$0, dta $$1) {
      exp $$2 = $$1.b(this.dQ(), $$0, exb.a(this));
      exp $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return exm.c($$3, exm.a(this.cL()), exa.i);
   }

   public int q_() {
      eyc $$0 = this.ck();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean N_() {
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
      this.aW.e(new eww($$0, $$1, $$2));
   }

   public aif al() {
      return this.aW;
   }

   public bsw<?> am() {
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
      this.a(bsq.c.a);
      this.a(dxw.p);
   }

   public final void aq() {
      this.a(bsq.c.b);
   }

   protected abstract void a(ajz.a var1);

   public ajz ar() {
      return this.ao;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bsq ? ((bsq)$$0).o == this.o : false;
   }

   @Override
   public int hashCode() {
      return this.o;
   }

   public void a(bsq.c $$0) {
      this.b($$0);
   }

   public void as() {
   }

   public void b(bty $$0) {
      this.ao.a(at, $$0);
   }

   public bty at() {
      return this.ao.a(at);
   }

   public boolean c(bty $$0) {
      return this.at() == $$0;
   }

   public boolean a(bsq $$0, double $$1) {
      return this.do().a((jw)$$0.do(), $$1);
   }

   public boolean a(bsq $$0, double $$1, double $$2) {
      double $$3 = $$0.dv() - this.dv();
      double $$4 = $$0.dx() - this.dx();
      double $$5 = $$0.dB() - this.dB();
      return ayn.e($$3, $$5) < ayn.k($$1) && ayn.k($$4) < ayn.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.s($$0 % 360.0F);
      this.t($$1 % 360.0F);
   }

   public final void c(eww $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      this.a(this.au());
   }

   protected ewr au() {
      return this.bd.a(this.s);
   }

   protected void av() {
      this.a_(this.s.c, this.s.d, this.s.e);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.t(this.dI() + $$2);
      this.s(this.dG() + $$3);
      this.t(ayn.a(this.dI(), -90.0F, 90.0F));
      this.P += $$2;
      this.O += $$3;
      this.P = ayn.a(this.P, -90.0F, 90.0F);
      if (this.q != null) {
         this.q.k(this);
      }
   }

   public void l() {
      this.aw();
   }

   public void aw() {
      this.dQ().ag().a("entityBaseTick");
      this.bj = null;
      if (this.bS() && this.dd().dL()) {
         this.ad();
      }

      if (this.K > 0) {
         this.K--;
      }

      this.Y = this.Z;
      this.P = this.dI();
      this.O = this.dG();
      this.bP();
      if (this.br()) {
         this.bs();
      }

      this.aA = this.az;
      this.az = false;
      this.bm();
      this.z();
      this.bl();
      if (this.dQ().B) {
         this.aD();
      } else if (this.aJ > 0) {
         if (this.be()) {
            this.h(this.aJ - 4);
            if (this.aJ < 0) {
               this.aD();
            }
         } else {
            if (this.aJ % 20 == 0 && !this.bt()) {
               this.a(this.dR().d(), 1.0F);
            }

            this.h(this.aJ - 1);
         }

         if (this.cn() > 0) {
            this.k(0);
            this.dQ().a(null, 1009, this.t, 1);
         }
      }

      if (this.bt()) {
         this.aB();
         this.ac *= 0.5F;
      }

      this.ax();
      if (!this.dQ().B) {
         this.d(this.aJ > 0);
      }

      this.an = false;
      this.dQ().ag().c();
   }

   public void d(boolean $$0) {
      this.b(0, $$0 || this.bi);
   }

   public void ax() {
      if (this.dx() < (double)(this.dQ().I_() - 64)) {
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
         if (this.a(this.dR().e(), 4.0F)) {
            this.a(avo.ka, 0.4F, 2.0F + this.ah.i() * 0.4F);
         }
      }
   }

   public final void d(float $$0) {
      this.g(ayn.d($$0 * 20.0F));
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
      return this.b(this.cL().d($$0, $$1, $$2));
   }

   private boolean b(ewr $$0) {
      return this.dQ().a(this, $$0) && !this.dQ().d($$0);
   }

   public void e(boolean $$0) {
      this.aG = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, eww $$1) {
      this.aG = $$0;
      this.b($$0, $$1);
   }

   public boolean d(jd $$0) {
      return this.aC.isPresent() && this.aC.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable eww $$1) {
      if ($$0) {
         ewr $$2 = this.cL();
         ewr $$3 = new ewr($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<jd> $$4 = this.r.g(this, $$3);
         if ($$4.isPresent() || this.bf) {
            this.aC = $$4;
         } else if ($$1 != null) {
            ewr $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
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

   public void a(btq $$0, eww $$1) {
      if (this.ag) {
         this.a_(this.dv() + $$1.c, this.dx() + $$1.d, this.dB() + $$1.e);
      } else {
         this.aB = this.bR();
         if ($$0 == btq.c) {
            $$1 = this.e($$1);
            if ($$1.equals(eww.b)) {
               return;
            }
         }

         this.dQ().ag().a("move");
         if (this.V.g() > 1.0E-7) {
            $$1 = $$1.h(this.V);
            this.V = eww.b;
            this.i(eww.b);
         }

         $$1 = this.a($$1, $$0);
         eww $$2 = this.a($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ac != 0.0F && $$3 >= 1.0) {
               ews $$4 = this.dQ().a(new dcd(this.do(), this.do().e($$2), dcd.a.d, dcd.b.d, this));
               if ($$4.c() != ewu.a.a) {
                  this.n();
               }
            }

            this.a_(this.dv() + $$2.c, this.dx() + $$2.d, this.dB() + $$2.e);
         }

         this.dQ().ag().c();
         this.dQ().ag().a("rest");
         boolean $$5 = !ayn.b($$1.c, $$2.c);
         boolean $$6 = !ayn.b($$1.e, $$2.e);
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
         dta $$8 = this.dQ().a_($$7);
         this.a($$2.d, this.aF(), $$8, $$7);
         if (this.dL()) {
            this.dQ().ag().c();
         } else {
            if (this.Q) {
               eww $$9 = this.dt();
               this.n($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            dfw $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dQ(), this);
            }

            if (this.aF()) {
               $$10.a(this.dQ(), $$7, $$8, this);
            }

            bsq.b $$11 = this.bc();
            if ($$11.a() && !this.bS()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.ab = this.ab + (float)($$2.f() * 0.6);
               jd $$15 = this.aM();
               dta $$16 = this.dQ().a_($$15);
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
                        this.a(dxw.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aJ();
               }
            }

            this.aG();
            float $$20 = this.aO();
            this.i(this.dt().d((double)$$20, 1.0, (double)$$20));
            if (this.dQ().c(this.cL().h(1.0E-6)).noneMatch($$0x -> $$0x.a(awd.aK) || $$0x.a(dfy.H))) {
               if (this.aJ <= 0) {
                  this.h(-this.dg());
               }

               if (this.aB && (this.az || this.bh())) {
                  this.aH();
               }
            }

            if (this.bR() && (this.az || this.bh())) {
               this.h(-this.dg());
            }

            this.dQ().ag().c();
         }
      }
   }

   private boolean c(dta $$0) {
      return $$0.a(awd.aP) || $$0.a(dfy.qP);
   }

   private boolean a(jd $$0, dta $$1, boolean $$2, boolean $$3, eww $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aF() || $$5 || this.cb() && $$4.d == 0.0 || this.cj()) && !this.cd()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dQ().a(dxw.P, this.do(), dxw.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean d(eww $$0) {
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
      this.a(avo.kf, 0.7F, 1.6F + (this.ah.i() - this.ah.i()) * 0.4F);
   }

   public void aI() {
      if (!this.dQ().B && this.aB) {
         this.aH();
      }

      this.aD();
   }

   protected void aJ() {
      if (this.aW()) {
         this.aV();
         if (this.bc().b()) {
            this.a(dxw.x);
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
            dta $$2 = this.dQ().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(awd.S)) && !$$2.a(awd.L) && !($$2.b() instanceof div) ? $$1.h(ayn.a(this.s.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = ayn.a(this.s.c);
         int $$4 = ayn.a(this.s.d - (double)$$0);
         int $$5 = ayn.a(this.s.e);
         return new jd($$3, $$4, $$5);
      }
   }

   protected float aN() {
      float $$0 = this.dQ().a_(this.dq()).b().k();
      float $$1 = this.dQ().a_(this.aL()).b().k();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aO() {
      dta $$0 = this.dQ().a_(this.dq());
      float $$1 = $$0.b().j();
      if (!$$0.a(dfy.G) && !$$0.a(dfy.nd)) {
         return (double)$$1 == 1.0 ? this.dQ().a_(this.aL()).b().j() : $$1;
      } else {
         return $$1;
      }
   }

   protected eww a(eww $$0, btq $$1) {
      return $$0;
   }

   protected eww e(eww $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dQ().Z();
         if ($$1 != this.bc) {
            Arrays.fill(this.bb, 0.0);
            this.bc = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(ji.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? eww.b : new eww($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(ji.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? eww.b : new eww(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(ji.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? eww.b : new eww(0.0, 0.0, $$4);
         } else {
            return eww.b;
         }
      }
   }

   private double a(ji.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = ayn.a($$1 + this.bb[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bb[$$2];
      this.bb[$$2] = $$3;
      return $$1;
   }

   private eww a(eww $$0) {
      ewr $$1 = this.cL();
      List<exp> $$2 = this.dQ().c(this, $$1.b($$0));
      eww $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dQ(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = $$5 && $$0.d < 0.0;
      if (this.dK() > 0.0F && ($$7 || this.aF()) && ($$4 || $$6)) {
         ewr $$8 = $$7 ? $$1.d(0.0, $$3.d, 0.0) : $$1;
         ewr $$9 = $$8.b($$0.c, (double)this.dK(), $$0.e);
         if (!$$7) {
            $$9 = $$9.b(0.0, -1.0E-5F, 0.0);
         }

         List<exp> $$10 = a(this, this.r, $$2, $$9);
         float $$11 = (float)$$3.d;
         float[] $$12 = a($$8, $$10, this.dK(), $$11);

         for (float $$13 : $$12) {
            eww $$14 = a(new eww($$0.c, (double)$$13, $$0.e), $$8, $$10);
            if ($$14.i() > $$3.i()) {
               return $$14;
            }
         }
      }

      return $$3;
   }

   private static float[] a(ewr $$0, List<exp> $$1, float $$2, float $$3) {
      FloatSet $$4 = new FloatArraySet(4);

      for (exp $$5 : $$1) {
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

   public static eww a(@Nullable bsq $$0, eww $$1, ewr $$2, dcu $$3, List<exp> $$4) {
      List<exp> $$5 = a($$0, $$3, $$4, $$2.b($$1));
      return a($$1, $$2, $$5);
   }

   private static List<exp> a(@Nullable bsq $$0, dcu $$1, List<exp> $$2, ewr $$3) {
      Builder<exp> $$4 = ImmutableList.builderWithExpectedSize($$2.size() + 1);
      if (!$$2.isEmpty()) {
         $$4.addAll($$2);
      }

      dur $$5 = $$1.C_();
      boolean $$6 = $$0 != null && $$5.a($$0, $$3);
      if ($$6) {
         $$4.add($$5.c());
      }

      $$4.addAll($$1.e($$0, $$3));
      return $$4.build();
   }

   private static eww a(eww $$0, ewr $$1, List<exp> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = exm.a(ji.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = exm.a(ji.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = exm.a(ji.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = exm.a(ji.a.c, $$1, $$2, $$5);
         }

         return new eww($$3, $$4, $$5);
      }
   }

   protected float aP() {
      return (float)((int)this.aa + 1);
   }

   protected avn aQ() {
      return avo.kj;
   }

   protected avn aR() {
      return avo.ki;
   }

   protected avn aS() {
      return avo.ki;
   }

   protected void aT() {
      ewr $$0 = this.cL();
      jd $$1 = jd.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      jd $$2 = jd.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dQ().a($$1, $$2)) {
         jd.a $$3 = new jd.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bE()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  dta $$7 = this.dQ().a_($$3);

                  try {
                     $$7.a(this.dQ(), $$3, this);
                     this.a($$7);
                  } catch (Throwable var12) {
                     o $$9 = o.a(var12, "Colliding entity with block");
                     p $$10 = $$9.a("Block being collided with");
                     p.a($$10, this.dQ(), $$3, $$7);
                     throw new z($$9);
                  }
               }
            }
         }
      }
   }

   protected void a(dta $$0) {
   }

   public void a(jm<dxw> $$0, @Nullable bsq $$1) {
      this.dQ().a($$1, $$0, this.s);
   }

   public void a(jm<dxw> $$0) {
      this.a($$0, this);
   }

   private void c(jd $$0, dta $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.v();
      }
   }

   protected void aU() {
      bsq $$0 = Objects.requireNonNullElse(this.cR(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      eww $$2 = $$0.dt();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.f($$3);
   }

   protected jd e(jd $$0) {
      jd $$1 = $$0.c();
      dta $$2 = this.dQ().a_($$1);
      return !$$2.a(awd.bn) && !$$2.a(awd.bo) ? $$0 : $$1;
   }

   protected void a(dta $$0, dta $$1) {
      dnk $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dta $$0) {
      dnk $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(jd $$0, dta $$1) {
      dnk $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dta $$0) {
      return $$0.a(awd.bm) && this.ai >= this.bh + 20;
   }

   private void v() {
      this.bg = this.bg * (float)Math.pow(0.997, (double)(this.ai - this.bh));
      this.bg = Math.min(1.0F, this.bg + 0.07F);
      float $$0 = 0.5F + this.bg * this.ah.i() * 1.2F;
      float $$1 = 0.1F + this.bg * 1.2F;
      this.a(avo.E, $$1, $$0);
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

   public void a(avn $$0, float $$1, float $$2) {
      if (!this.aX()) {
         this.dQ().a(null, this.dv(), this.dx(), this.dB(), $$0, this.df(), $$1, $$2);
      }
   }

   public void a(avn $$0) {
      if (!this.aX()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean aX() {
      return this.ao.a(aS);
   }

   public void f(boolean $$0) {
      this.ao.a(aS, $$0);
   }

   public boolean aY() {
      return this.ao.a(aT);
   }

   public void g(boolean $$0) {
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
         this.i(this.dt().b(0.0, -$$0, 0.0));
      }
   }

   protected bsq.b bc() {
      return bsq.b.d;
   }

   public boolean bd() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dta $$2, jd $$3) {
      if ($$1) {
         if (this.ac > 0.0F) {
            $$2.b().a(this.dQ(), $$2, $$3, this, this.ac);
            this.dQ().a(dxw.A, this.s, dxw.a.a(this, this.aC.<dta>map($$0x -> this.dQ().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ac -= (float)$$0;
      }
   }

   public boolean be() {
      return this.am().d();
   }

   public boolean a(float $$0, float $$1, brj $$2) {
      if (this.n.a(awh.o)) {
         return false;
      } else {
         if (this.bT()) {
            for (bsq $$3 : this.cT()) {
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
      jd $$0 = this.dq();
      return this.dQ().r($$0) || this.dQ().r(jd.a((double)$$0.u(), this.cL().e, (double)$$0.w()));
   }

   private boolean y() {
      return this.dr().a(dfy.nd);
   }

   public boolean bg() {
      return this.bf() || this.w();
   }

   public boolean bh() {
      return this.bf() || this.w() || this.y();
   }

   public boolean bi() {
      return this.bf() || this.y();
   }

   public boolean bj() {
      return this.bi() || this.bt();
   }

   public boolean bk() {
      return this.al && this.bf();
   }

   public void bl() {
      if (this.cd()) {
         this.j(this.cc() && this.bf() && !this.bS());
      } else {
         this.j(this.cc() && this.bk() && !this.bS() && this.dQ().b_(this.t).a(awj.a));
      }
   }

   protected boolean bm() {
      this.ak.clear();
      this.bn();
      double $$0 = this.dQ().D_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(awj.b, $$0);
      return this.bf() || $$1;
   }

   void bn() {
      if (this.dd() instanceof cot $$0 && !$$0.bk()) {
         this.aj = false;
         return;
      }

      if (this.a(awj.a, 0.014)) {
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

   private void z() {
      this.al = this.a(awj.a);
      this.aK.clear();
      double $$0 = this.dz();
      if (this.dd() instanceof cot $$2 && !$$2.bk() && $$2.cL().e >= $$0 && $$2.cL().b <= $$0) {
         return;
      }

      jd $$3 = jd.a(this.dv(), $$0, this.dB());
      eoy $$4 = this.dQ().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((dca)this.dQ(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aK::add);
      }
   }

   protected void bo() {
      bsq $$0 = Objects.requireNonNullElse(this.cR(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      eww $$2 = $$0.dt();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aR(), $$3, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
      } else {
         this.a(this.aS(), $$3, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
      }

      float $$4 = (float)ayn.a(this.dx());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bd.a() * 20.0F; $$5++) {
         double $$6 = (this.ah.j() * 2.0 - 1.0) * (double)this.bd.a();
         double $$7 = (this.ah.j() * 2.0 - 1.0) * (double)this.bd.a();
         this.dQ().a(lm.d, this.dv() + $$6, (double)($$4 + 1.0F), this.dB() + $$7, $$2.c, $$2.d - this.ah.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bd.a() * 20.0F; $$8++) {
         double $$9 = (this.ah.j() * 2.0 - 1.0) * (double)this.bd.a();
         double $$10 = (this.ah.j() * 2.0 - 1.0) * (double)this.bd.a();
         this.dQ().a(lm.am, this.dv() + $$9, (double)($$4 + 1.0F), this.dB() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(dxw.O);
   }

   @Deprecated
   protected dta bp() {
      return this.dQ().a_(this.aK());
   }

   public dta bq() {
      return this.dQ().a_(this.aM());
   }

   public boolean br() {
      return this.cc() && !this.bf() && !this.N_() && !this.cb() && !this.bt() && this.bE();
   }

   protected void bs() {
      jd $$0 = this.aK();
      dta $$1 = this.dQ().a_($$0);
      if ($$1.l() != dmd.a) {
         eww $$2 = this.dt();
         jd $$3 = this.dq();
         double $$4 = this.dv() + (this.ah.j() - 0.5) * (double)this.bd.a();
         double $$5 = this.dB() + (this.ah.j() - 0.5) * (double)this.bd.a();
         if ($$3.u() != $$0.u()) {
            $$4 = ayn.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = ayn.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dQ().a(new le(lm.b, $$1), $$4, this.dx() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(awt<eox> $$0) {
      return this.aK.contains($$0);
   }

   public boolean bt() {
      return !this.an && this.ak.getDouble(awj.b) > 0.0;
   }

   public void a(float $$0, eww $$1) {
      eww $$2 = a($$1, $$0, this.dG());
      this.i(this.dt().e($$2));
   }

   private static eww a(eww $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return eww.b;
      } else {
         eww $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = ayn.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = ayn.b($$2 * (float) (Math.PI / 180.0));
         return new eww($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bu() {
      return this.dQ().f(this.du(), this.dA()) ? this.dQ().x(jd.a(this.dv(), this.dz(), this.dB())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.b($$3, $$4);
   }

   public void b(float $$0, float $$1) {
      this.s($$0 % 360.0F);
      this.t(ayn.a($$1, -90.0F, 90.0F) % 360.0F);
      this.O = this.dG();
      this.P = this.dI();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = ayn.a($$0, -3.0E7, 3.0E7);
      double $$4 = ayn.a($$2, -3.0E7, 3.0E7);
      this.L = $$3;
      this.M = $$1;
      this.N = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void f(eww $$0) {
      this.e($$0.c, $$0.d, $$0.e);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dG(), this.dI());
   }

   public void a(jd $$0, float $$1, float $$2) {
      this.b((double)$$0.u() + 0.5, (double)$$0.v(), (double)$$0.w() + 0.5, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.o($$0, $$1, $$2);
      this.s($$3);
      this.t($$4);
      this.bv();
      this.av();
   }

   public final void bv() {
      double $$0 = this.dv();
      double $$1 = this.dx();
      double $$2 = this.dB();
      this.L = $$0;
      this.M = $$1;
      this.N = $$2;
      this.ad = $$0;
      this.ae = $$1;
      this.af = $$2;
      this.O = this.dG();
      this.P = this.dI();
   }

   public float f(bsq $$0) {
      float $$1 = (float)(this.dv() - $$0.dv());
      float $$2 = (float)(this.dx() - $$0.dx());
      float $$3 = (float)(this.dB() - $$0.dB());
      return ayn.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dv() - $$0;
      double $$4 = this.dx() - $$1;
      double $$5 = this.dB() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(bsq $$0) {
      return this.g($$0.do());
   }

   public double g(eww $$0) {
      double $$1 = this.dv() - $$0.c;
      double $$2 = this.dx() - $$0.d;
      double $$3 = this.dB() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cmv $$0) {
   }

   public void h(bsq $$0) {
      if (!this.y($$0)) {
         if (!$$0.ag && !this.ag) {
            double $$1 = $$0.dv() - this.dv();
            double $$2 = $$0.dB() - this.dB();
            double $$3 = ayn.a($$1, $$2);
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

   public void h(eww $$0) {
      this.j($$0.c, $$0.d, $$0.e);
   }

   public void j(double $$0, double $$1, double $$2) {
      this.i(this.dt().b($$0, $$1, $$2));
      this.av = true;
   }

   protected void bw() {
      this.U = true;
   }

   public boolean a(brj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bw();
         return false;
      }
   }

   public final eww g(float $$0) {
      return this.c(this.h($$0), this.i($$0));
   }

   public ji bx() {
      return ji.a(this.g(1.0F));
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dI() : ayn.i($$0, this.P, this.dI());
   }

   public float i(float $$0) {
      return $$0 == 1.0F ? this.dG() : ayn.i($$0, this.O, this.dG());
   }

   public final eww c(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = ayn.b($$3);
      float $$5 = ayn.a($$3);
      float $$6 = ayn.b($$2);
      float $$7 = ayn.a($$2);
      return new eww((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final eww j(float $$0) {
      return this.d(this.h($$0), this.i($$0));
   }

   protected final eww d(float $$0, float $$1) {
      return this.c($$0 - 90.0F, $$1);
   }

   public final eww by() {
      return new eww(this.dv(), this.dz(), this.dB());
   }

   public final eww k(float $$0) {
      double $$1 = ayn.d((double)$$0, this.L, this.dv());
      double $$2 = ayn.d((double)$$0, this.M, this.dx()) + (double)this.cM();
      double $$3 = ayn.d((double)$$0, this.N, this.dB());
      return new eww($$1, $$2, $$3);
   }

   public eww l(float $$0) {
      return this.k($$0);
   }

   public final eww m(float $$0) {
      double $$1 = ayn.d((double)$$0, this.L, this.dv());
      double $$2 = ayn.d((double)$$0, this.M, this.dx());
      double $$3 = ayn.d((double)$$0, this.N, this.dB());
      return new eww($$1, $$2, $$3);
   }

   public ewu a(double $$0, float $$1, boolean $$2) {
      eww $$3 = this.k($$1);
      eww $$4 = this.g($$1);
      eww $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dQ().a(new dcd($$3, $$5, dcd.a.b, $$2 ? dcd.b.c : dcd.b.a, this));
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

   public void a(bsq $$0, int $$1, brj $$2) {
      if ($$0 instanceof aqu) {
         an.d.a((aqu)$$0, this, $$2);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.dv() - $$0;
      double $$4 = this.dx() - $$1;
      double $$5 = this.dB() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cL().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * m;
      return $$0 < $$1 * $$1;
   }

   public boolean d(ua $$0) {
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

   public boolean e(ua $$0) {
      return this.bS() ? false : this.d($$0);
   }

   public ua f(ua $$0) {
      try {
         if (this.q != null) {
            $$0.a("Pos", this.a(this.q.dv(), this.dx(), this.q.dB()));
         } else {
            $$0.a("Pos", this.a(this.dv(), this.dx(), this.dB()));
         }

         eww $$1 = this.dt();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dG(), this.dI()));
         $$0.a("FallDistance", this.ac);
         $$0.a("Fire", (short)this.aJ);
         $$0.a("Air", (short)this.cm());
         $$0.a("OnGround", this.aF());
         $$0.a("Invulnerable", this.aY);
         $$0.a("PortalCooldown", this.aX);
         $$0.a("UUID", this.cA());
         wy $$2 = this.aj();
         if ($$2 != null) {
            $$0.a("CustomName", wy.a.a($$2, this.dS()));
         }

         if (this.cF()) {
            $$0.a("CustomNameVisible", this.cF());
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
            ug $$4 = new ug();

            for (String $$5 : this.ba) {
               $$4.add(uv.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bT()) {
            ug $$6 = new ug();

            for (bsq $$7 : this.cT()) {
               ua $$8 = new ua();
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

   public void g(ua $$0) {
      try {
         ug $$1 = $$0.c("Pos", 6);
         ug $$2 = $$0.c("Motion", 6);
         ug $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.n(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.o(ayn.a($$1.h(0), -3.0000512E7, 3.0000512E7), ayn.a($$1.h(1), -2.0E7, 2.0E7), ayn.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.s($$3.i(0));
         this.t($$3.i(1));
         this.bv();
         this.o(this.dG());
         this.p(this.dG());
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

         if (!Double.isFinite(this.dv()) || !Double.isFinite(this.dx()) || !Double.isFinite(this.dB())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dG()) && Double.isFinite((double)this.dI())) {
            this.av();
            this.a(this.dG(), this.dI());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(wy.a.a($$8, this.dS()));
               } catch (Exception var16) {
                  b.warn("Failed to parse entity custom name {}", $$8, var16);
               }
            }

            this.p($$0.q("CustomNameVisible"));
            this.f($$0.q("Silent"));
            this.g($$0.q("NoGravity"));
            this.k($$0.q("Glowing"));
            this.k($$0.h("TicksFrozen"));
            this.bi = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.ba.clear();
               ug $$10 = $$0.c("Tags", 8);
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
      bsw<?> $$0 = this.am();
      akq $$1 = bsw.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(ua var1);

   protected abstract void b(ua var1);

   protected ug a(double... $$0) {
      ug $$1 = new ug();

      for (double $$2 : $$0) {
         $$1.add(ub.a($$2));
      }

      return $$1;
   }

   protected ug a(float... $$0) {
      ug $$1 = new ug();

      for (float $$2 : $$0) {
         $$1.add(ud.a($$2));
      }

      return $$1;
   }

   @Nullable
   public cjf a(dct $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public cjf a(dct $$0, int $$1) {
      return this.a(new cuo($$0), (float)$$1);
   }

   @Nullable
   public cjf b(cuo $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public cjf a(cuo $$0, float $$1) {
      if ($$0.e()) {
         return null;
      } else if (this.dQ().B) {
         return null;
      } else {
         cjf $$2 = new cjf(this.dQ(), this.dv(), this.dx() + (double)$$1, this.dB(), $$0);
         $$2.v();
         this.dQ().b($$2);
         return $$2;
      }
   }

   public boolean bE() {
      return !this.dL();
   }

   public boolean bF() {
      if (this.ag) {
         return false;
      } else {
         float $$0 = this.bd.a() * 0.8F;
         ewr $$1 = ewr.a(this.by(), (double)$$0, 1.0E-6, (double)$$0);
         return jd.a($$1)
            .anyMatch(
               $$1x -> {
                  dta $$2 = this.dQ().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dQ(), $$1x)
                     && exm.c($$2.k(this.dQ(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), exm.a($$1), exa.i);
               }
            );
      }
   }

   public bqq a(cmv $$0, bqp $$1) {
      return bqq.e;
   }

   public boolean i(bsq $$0) {
      return $$0.bG() && !this.y($$0);
   }

   public boolean bG() {
      return false;
   }

   public void u() {
      this.i(eww.b);
      this.l();
      if (this.bS()) {
         this.dd().j(this);
      }
   }

   public final void j(bsq $$0) {
      if (this.x($$0)) {
         this.a($$0, bsq::a_);
      }
   }

   protected void a(bsq $$0, bsq.a $$1) {
      eww $$2 = this.m($$0);
      eww $$3 = $$0.l(this);
      $$1.accept($$0, $$2.c - $$3.c, $$2.d - $$3.d, $$2.e - $$3.e);
   }

   public void k(bsq $$0) {
   }

   public eww l(bsq $$0) {
      return this.dn().b(bsr.b, 0, this.aD);
   }

   public eww m(bsq $$0) {
      return this.do().e(this.a($$0, this.bd, 1.0F));
   }

   protected eww a(bsq $$0, bst $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static eww a(bsq $$0, bsq $$1, bss $$2) {
      int $$3 = $$0.cT().indexOf($$1);
      return $$2.c(bsr.a, $$3, $$0.aD);
   }

   public boolean n(bsq $$0) {
      return this.a($$0, false);
   }

   public boolean bH() {
      return this instanceof btl;
   }

   public boolean a(bsq $$0, boolean $$1) {
      if ($$0 == this.q) {
         return false;
      } else if (!$$0.bK()) {
         return false;
      } else {
         for (bsq $$2 = $$0; $$2.q != null; $$2 = $$2.q) {
            if ($$2.q == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bS()) {
               this.ad();
            }

            this.b(bty.a);
            this.q = $$0;
            this.q.p(this);
            $$0.F().filter($$0x -> $$0x instanceof aqu).forEach($$0x -> an.U.a((aqu)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bsq $$0) {
      return !this.bW() && this.K <= 0;
   }

   public void bI() {
      for (int $$0 = this.p.size() - 1; $$0 >= 0; $$0--) {
         ((bsq)this.p.get($$0)).ad();
      }
   }

   public void bJ() {
      if (this.q != null) {
         bsq $$0 = this.q;
         this.q = null;
         $$0.q(this);
      }
   }

   public void ad() {
      this.bJ();
   }

   protected void p(bsq $$0) {
      if ($$0.dd() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.p.isEmpty()) {
            this.p = ImmutableList.of($$0);
         } else {
            List<bsq> $$1 = Lists.newArrayList(this.p);
            if (!this.dQ().B && $$0 instanceof cmv && !(this.cU() instanceof cmv)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.p = ImmutableList.copyOf($$1);
         }

         this.a(dxw.s, $$0);
      }
   }

   protected void q(bsq $$0) {
      if ($$0.dd() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.p.size() == 1 && this.p.get(0) == $$0) {
            this.p = ImmutableList.of();
         } else {
            this.p = this.p.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.K = 60;
         this.a(dxw.q, $$0);
      }
   }

   protected boolean r(bsq $$0) {
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
      return this.dv();
   }

   public double d_() {
      return this.dx();
   }

   public double L_() {
      return this.dB();
   }

   public float M_() {
      return this.dI();
   }

   public float e_() {
      return this.dG();
   }

   public void a(float $$0, int $$1) {
      this.o($$0);
   }

   public float bL() {
      return 0.0F;
   }

   public eww bM() {
      return this.c(this.dI(), this.dG());
   }

   public eww a(cuj $$0) {
      if (!(this instanceof cmv $$1)) {
         return eww.b;
      } else {
         boolean $$2 = $$1.eV().a($$0) && !$$1.eU().a($$0);
         btf $$3 = $$2 ? $$1.fr().e() : $$1.fr();
         return this.c(0.0F, this.dG() + (float)($$3 == btf.b ? 80 : -80)).a(0.5);
      }
   }

   public ewv bN() {
      return new ewv(this.dI(), this.dG());
   }

   public eww bO() {
      return eww.a(this.bN());
   }

   public void a(dlp $$0, jd $$1) {
      if (this.aA()) {
         this.ay();
      } else {
         if (this.aw != null && this.aw.a($$0)) {
            this.aw.a($$1.i());
            this.aw.a(true);
         } else {
            this.aw = new btx($$0, $$1.i());
         }
      }
   }

   protected void bP() {
      if (this.dQ() instanceof aqt $$0) {
         this.M();
         if (this.aw != null) {
            if (this.aw.a($$0, this, this.cx())) {
               $$0.ag().a("portal");
               this.ay();
               epw $$2 = this.aw.a($$0, this);
               if ($$2 != null && $$0.o().a((dcu)$$2.a())) {
                  bsq $$3 = this.a($$2);
                  if ($$3 != null && $$3.dQ() instanceof aqt $$4) {
                     jd $$5 = jd.a((jw)$$3.s);
                     $$4.l().a(aqy.e, new dcb($$5), 3, $$5);
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
      bsq $$0 = this.cU();
      return $$0 instanceof aqu ? $$0.bQ() : 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
   }

   public void c(brj $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            djq.a(this);
      }
   }

   public void n(float $$0) {
   }

   public boolean bR() {
      boolean $$0 = this.dQ() != null && this.dQ().B;
      return !this.be() && (this.aJ > 0 || $$0 && this.i(0));
   }

   public boolean bS() {
      return this.dd() != null;
   }

   public boolean bT() {
      return !this.p.isEmpty();
   }

   public boolean bU() {
      return this.am().a(awh.p);
   }

   public boolean bV() {
      return !this.am().a(awh.q);
   }

   public void h(boolean $$0) {
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
      return this.c(bty.f);
   }

   public boolean cc() {
      return this.i(3);
   }

   public void i(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean cd() {
      return this.i(4);
   }

   public boolean ce() {
      return this.c(bty.d);
   }

   public boolean cf() {
      return this.ce() && !this.bf();
   }

   public void j(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cg() {
      return this.aZ;
   }

   public final void k(boolean $$0) {
      this.aZ = $$0;
      this.b(6, this.ch());
   }

   public boolean ch() {
      return this.dQ().x_() ? this.i(6) : this.aZ;
   }

   public boolean ci() {
      return this.i(5);
   }

   public boolean d(cmv $$0) {
      if ($$0.N_()) {
         return false;
      } else {
         eyc $$1 = this.ck();
         return $$1 != null && $$0 != null && $$0.ck() == $$1 && $$1.i() ? false : this.ci();
      }
   }

   public boolean cj() {
      return false;
   }

   public void a(BiConsumer<dxt<?>, aqt> $$0) {
   }

   @Nullable
   public exv ck() {
      return this.dQ().M().e(this.cC());
   }

   public boolean s(bsq $$0) {
      return this.a($$0.ck());
   }

   public boolean a(eyc $$0) {
      return this.ck() != null ? this.ck().a($$0) : false;
   }

   public void l(boolean $$0) {
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

   public void a(aqt $$0, btk $$1) {
      this.h(this.aJ + 1);
      if (this.aJ == 0) {
         this.d(8.0F);
      }

      this.a(this.dR().c(), 5.0F);
   }

   public void m(boolean $$0) {
      eww $$1 = this.dt();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.n($$1.c, $$2, $$1.e);
   }

   public void n(boolean $$0) {
      eww $$1 = this.dt();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.n($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(aqt $$0, btl $$1) {
      return true;
   }

   public void cr() {
      if (this.dt().b() > -0.5 && this.ac > 1.0F) {
         this.ac = 1.0F;
      }
   }

   public void n() {
      this.ac = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      jd $$3 = jd.a($$0, $$1, $$2);
      eww $$4 = new eww($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      jd.a $$5 = new jd.a();
      ji $$6 = ji.b;
      double $$7 = Double.MAX_VALUE;

      for (ji $$8 : new ji[]{ji.c, ji.d, ji.e, ji.f, ji.b}) {
         $$5.a($$3, $$8);
         if (!this.dQ().a_($$5).r(this.dQ(), $$5)) {
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
      eww $$13 = this.dt().a(0.75);
      if ($$6.o() == ji.a.a) {
         this.n((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == ji.a.b) {
         this.n($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == ji.a.c) {
         this.n($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dta $$0, eww $$1) {
      this.n();
      this.V = $$1;
   }

   private static wy c(wy $$0) {
      xm $$1 = $$0.e().b($$0.a().a(null));

      for (wy $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public wy ah() {
      wy $$0 = this.aj();
      return $$0 != null ? c($$0) : this.cs();
   }

   protected wy cs() {
      return this.n.h();
   }

   public boolean t(bsq $$0) {
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

   public boolean u(bsq $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dQ() == null ? "~NULL~" : this.dQ().toString();
      return this.aH != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.ah().getString(),
            this.o,
            $$0,
            this.dv(),
            this.dx(),
            this.dB(),
            this.aH
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.ah().getString(),
            this.o,
            $$0,
            this.dv(),
            this.dx(),
            this.dB()
         );
   }

   public boolean b(brj $$0) {
      return this.dL() || this.aY && !$$0.a(awf.d) && !$$0.g() || $$0.a(awf.i) && this.be() || $$0.a(awf.m) && this.am().a(awh.o);
   }

   public boolean cv() {
      return this.aY;
   }

   public void o(boolean $$0) {
      this.aY = $$0;
   }

   public void v(bsq $$0) {
      this.b($$0.dv(), $$0.dx(), $$0.dB(), $$0.dG(), $$0.dI());
   }

   public void w(bsq $$0) {
      ua $$1 = $$0.f(new ua());
      $$1.r("Dimension");
      this.g($$1);
      this.aX = $$0.aX;
      this.aw = $$0.aw;
   }

   @Nullable
   public bsq a(epw $$0) {
      if (this.dQ() instanceof aqt $$1 && !this.dL()) {
         aqt $$3 = $$0.a();
         List<bsq> $$4 = this.cT();
         this.ak();
         List<bsq> $$5 = new ArrayList<>();

         for (bsq $$6 : $$4) {
            $$5.add($$6.a($$0));
         }

         $$1.ag().a("changeDimension");
         bsq $$7 = $$3.af() == $$1.af() ? this : this.am().a((dcu)$$3);
         if ($$7 != null) {
            if (this != $$7) {
               $$7.w(this);
               this.cw();
            }

            $$7.b($$0.b().c, $$0.b().d, $$0.b().e, $$0.d(), $$7.dI());
            $$7.i($$0.c());
            if (this != $$7) {
               $$3.d($$7);
            }

            for (bsq $$8 : $$5) {
               $$8.a($$7, true);
            }
         }

         $$1.h();
         $$3.h();
         $$1.ag().c();
         return $$7;
      }

      return null;
   }

   protected void cw() {
      this.b(bsq.c.e);
   }

   public eww a(ji.a $$0, l.a $$1) {
      return epy.a($$1, $$0, this.do(), this.a(this.at()));
   }

   public boolean cx() {
      return !this.bS() && this.bE() && (!this.bT() || this.r.ab().a(dcq.aa).a());
   }

   public float a(dcm $$0, dca $$1, jd $$2, dta $$3, eoy $$4, float $$5) {
      return $$5;
   }

   public boolean a(dcm $$0, dca $$1, jd $$2, dta $$3, float $$4) {
      return true;
   }

   public int cy() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bsw.a(this.am()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.o);
      $$0.a("Entity Name", () -> this.ah().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dv(), this.dx(), this.dB()));
      $$0.a("Entity's Block location", p.a(this.dQ(), ayn.a(this.dv()), ayn.a(this.dx()), ayn.a(this.dB())));
      eww $$1 = this.dt();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", () -> this.cT().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.dd()));
   }

   public boolean cz() {
      return this.bR() && !this.N_();
   }

   public void a_(UUID $$0) {
      this.ax = $$0;
      this.ay = this.ax.toString();
   }

   @Override
   public UUID cA() {
      return this.ax;
   }

   public String cB() {
      return this.ay;
   }

   @Override
   public String cC() {
      return this.ay;
   }

   public boolean cD() {
      return true;
   }

   public static double cE() {
      return m;
   }

   public static void b(double $$0) {
      m = $$0;
   }

   @Override
   public wy O_() {
      return exv.a(this.ck(), this.ah()).a($$0 -> $$0.a(this.cK()).a(this.cB()));
   }

   public void b(@Nullable wy $$0) {
      this.ao.a(aQ, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public wy aj() {
      return this.ao.a(aQ).orElse(null);
   }

   @Override
   public boolean ai() {
      return this.ao.a(aQ).isPresent();
   }

   public void p(boolean $$0) {
      this.ao.a(aR, $$0);
   }

   public boolean cF() {
      return this.ao.a(aR);
   }

   public boolean a(aqt $$0, double $$1, double $$2, double $$3, Set<bua> $$4, float $$5, float $$6) {
      float $$7 = ayn.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dQ()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.A();
         this.o($$5);
      } else {
         this.ak();
         bsq $$8 = this.am().a((dcu)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.o($$5);
         this.b(bsq.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dQ() instanceof aqt) {
         this.b($$0, $$1, $$2, this.dG(), this.dI());
         this.A();
      }
   }

   private void A() {
      this.cV().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.p.iterator();

         while (var1.hasNext()) {
            bsq $$1 = (bsq)var1.next();
            $$0.a($$1, bsq::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.dv() + $$0, this.dx() + $$1, this.dB() + $$2);
   }

   public boolean cG() {
      return this.cF();
   }

   @Override
   public void a(List<ajz.c<?>> $$0) {
   }

   @Override
   public void a(ajv<?> $$0) {
      if (at.equals($$0)) {
         this.i_();
      }
   }

   @Deprecated
   protected void cH() {
      bty $$0 = this.at();
      bst $$1 = this.a($$0);
      this.bd = $$1;
      this.be = $$1.c();
   }

   public void i_() {
      bst $$0 = this.bd;
      bty $$1 = this.at();
      bst $$2 = this.a($$1);
      this.bd = $$2;
      this.be = $$2.c();
      this.av();
      boolean $$3 = (double)$$2.a() <= 4.0 && (double)$$2.b() <= 4.0;
      if (!this.r.B && !this.an && !this.ag && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cmv)) {
         this.a($$0);
      }
   }

   public boolean a(bst $$0) {
      bst $$1 = this.a(this.at());
      eww $$2 = this.do().b(0.0, (double)$$0.b() / 2.0, 0.0);
      double $$3 = (double)Math.max(0.0F, $$1.a() - $$0.a()) + 1.0E-6;
      double $$4 = (double)Math.max(0.0F, $$1.b() - $$0.b()) + 1.0E-6;
      exp $$5 = exm.a(ewr.a($$2, $$3, $$4, $$3));
      Optional<eww> $$6 = this.r.a(this, $$5, $$2, (double)$$1.a(), (double)$$1.b(), (double)$$1.a());
      if ($$6.isPresent()) {
         this.c($$6.get().b(0.0, (double)(-$$1.b()) / 2.0, 0.0));
         return true;
      } else {
         if ($$1.a() > $$0.a() && $$1.b() > $$0.b()) {
            exp $$7 = exm.a(ewr.a($$2, $$3, 1.0E-6, $$3));
            Optional<eww> $$8 = this.r.a(this, $$7, $$2, (double)$$1.a(), (double)$$0.b(), (double)$$1.a());
            if ($$8.isPresent()) {
               this.c($$8.get().b(0.0, (double)(-$$0.b()) / 2.0 + 1.0E-6, 0.0));
               return true;
            }
         }

         return false;
      }
   }

   public ji cI() {
      return ji.a((double)this.dG());
   }

   public ji cJ() {
      return this.cI();
   }

   protected xe cK() {
      return new xe(xe.a.c, new xe.b(this.am(), this.cA(), this.ah()));
   }

   public boolean a(aqu $$0) {
      return true;
   }

   @Override
   public final ewr cL() {
      return this.aF;
   }

   public ewr h_() {
      return this.cL();
   }

   public final void a(ewr $$0) {
      this.aF = $$0;
   }

   public final float d(bty $$0) {
      return this.a($$0).c();
   }

   public final float cM() {
      return this.be;
   }

   public eww q(float $$0) {
      return this.cN();
   }

   protected eww cN() {
      return new eww(0.0, (double)this.cM(), (double)(this.dk() * 0.4F));
   }

   public bue a_(int $$0) {
      return bue.a;
   }

   @Override
   public void a(wy $$0) {
   }

   public dcu cO() {
      return this.dQ();
   }

   @Nullable
   public MinecraftServer cP() {
      return this.dQ().o();
   }

   public bqq a(cmv $$0, eww $$1, bqp $$2) {
      return bqq.e;
   }

   public boolean a(dcm $$0) {
      return false;
   }

   public void d(aqu $$0) {
   }

   public void e(aqu $$0) {
   }

   public float a(dmk $$0) {
      float $$1 = ayn.g(this.dG());
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

   public float a(dkt $$0) {
      float $$1 = ayn.g(this.dG());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public boolean cQ() {
      return false;
   }

   public cno a(cnn $$0) {
      return this.am().a(awh.r) ? cno.b : cno.a;
   }

   @Nullable
   public btl cR() {
      return null;
   }

   public final boolean cS() {
      return this.cR() != null;
   }

   public final List<bsq> cT() {
      return this.p;
   }

   @Nullable
   public bsq cU() {
      return this.p.isEmpty() ? null : (bsq)this.p.get(0);
   }

   public boolean x(bsq $$0) {
      return this.p.contains($$0);
   }

   public boolean a(Predicate<bsq> $$0) {
      UnmodifiableIterator var2 = this.p.iterator();

      while (var2.hasNext()) {
         bsq $$1 = (bsq)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bsq> F() {
      return this.p.stream().flatMap(bsq::cV);
   }

   @Override
   public Stream<bsq> cV() {
      return Stream.concat(Stream.of(this), this.F());
   }

   @Override
   public Stream<bsq> cW() {
      return Stream.concat(this.p.stream().flatMap(bsq::cW), Stream.of(this));
   }

   public Iterable<bsq> cX() {
      return () -> this.F().iterator();
   }

   public int cY() {
      return (int)this.F().filter($$0 -> $$0 instanceof cmv).count();
   }

   public boolean cZ() {
      return this.cY() == 1;
   }

   public bsq da() {
      bsq $$0 = this;

      while ($$0.bS()) {
         $$0 = $$0.dd();
      }

      return $$0;
   }

   public boolean y(bsq $$0) {
      return this.da() == $$0.da();
   }

   public boolean z(bsq $$0) {
      if (!$$0.bS()) {
         return false;
      } else {
         bsq $$1 = $$0.dd();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean db() {
      return this.cR() instanceof cmv $$0 ? $$0.g() : this.dc();
   }

   public boolean dc() {
      return !this.dQ().B;
   }

   protected static eww a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -ayn.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = ayn.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new eww((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public eww b(btl $$0) {
      return new eww(this.dv(), this.cL().e, this.dB());
   }

   @Nullable
   public bsq dd() {
      return this.q;
   }

   @Nullable
   public bsq de() {
      return this.q != null && this.q.cR() == this ? this.q : null;
   }

   public epd j_() {
      return epd.a;
   }

   public avp df() {
      return avp.g;
   }

   protected int dg() {
      return 1;
   }

   public et dh() {
      return new et(
         this, this.do(), this.bN(), this.dQ() instanceof aqt ? (aqt)this.dQ() : null, this.G(), this.ah().getString(), this.O_(), this.dQ().o(), this
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
      return this.dQ().ab().b(dcq.p);
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public boolean U_() {
      return true;
   }

   public void a(ff.a $$0, eww $$1) {
      eww $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.t(ayn.g((float)(-(ayn.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.s(ayn.g((float)(ayn.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.o(this.dG());
      this.P = this.dI();
      this.O = this.dG();
   }

   public boolean a(awt<eox> $$0, double $$1) {
      if (this.di()) {
         return false;
      } else {
         ewr $$2 = this.cL().h(0.001);
         int $$3 = ayn.a($$2.a);
         int $$4 = ayn.c($$2.d);
         int $$5 = ayn.a($$2.b);
         int $$6 = ayn.c($$2.e);
         int $$7 = ayn.a($$2.c);
         int $$8 = ayn.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cD();
         boolean $$11 = false;
         eww $$12 = eww.b;
         int $$13 = 0;
         jd.a $$14 = new jd.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  eoy $$18 = this.dQ().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((dca)this.dQ(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           eww $$20 = $$18.c(this.dQ(), $$14);
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

            if (!(this instanceof cmv)) {
               $$12 = $$12.d();
            }

            eww $$21 = this.dt();
            $$12 = $$12.a($$1 * 1.0);
            double $$22 = 0.003;
            if (Math.abs($$21.c) < 0.003 && Math.abs($$21.e) < 0.003 && $$12.f() < 0.0045000000000000005) {
               $$12 = $$12.d().a(0.0045000000000000005);
            }

            this.i(this.dt().e($$12));
         }

         this.ak.put($$0, $$9);
         return $$11;
      }
   }

   public boolean di() {
      ewr $$0 = this.cL().g(1.0);
      int $$1 = ayn.a($$0.a);
      int $$2 = ayn.c($$0.d);
      int $$3 = ayn.a($$0.c);
      int $$4 = ayn.c($$0.f);
      return !this.dQ().b($$1, $$3, $$2, $$4);
   }

   public double b(awt<eox> $$0) {
      return this.ak.getDouble($$0);
   }

   public double dj() {
      return (double)this.cM() < 0.4 ? 0.0 : 0.4;
   }

   public final float dk() {
      return this.bd.a();
   }

   public final float dl() {
      return this.bd.b();
   }

   public zf<abt> dm() {
      return new abu(this);
   }

   public bst a(bty $$0) {
      return this.n.n();
   }

   public final bss dn() {
      return this.bd.d();
   }

   public eww do() {
      return this.s;
   }

   public eww dp() {
      return this.do();
   }

   @Override
   public jd dq() {
      return this.t;
   }

   public dta dr() {
      if (this.bj == null) {
         this.bj = this.dQ().a_(this.dq());
      }

      return this.bj;
   }

   public dcb ds() {
      return this.u;
   }

   public eww dt() {
      return this.v;
   }

   public void i(eww $$0) {
      this.v = $$0;
   }

   public void j(eww $$0) {
      this.i(this.dt().e($$0));
   }

   public void n(double $$0, double $$1, double $$2) {
      this.i(new eww($$0, $$1, $$2));
   }

   public final int du() {
      return this.t.u();
   }

   public final double dv() {
      return this.s.c;
   }

   public double c(double $$0) {
      return this.s.c + (double)this.dk() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ah.j() - 1.0) * $$0);
   }

   public final int dw() {
      return this.t.v();
   }

   public final double dx() {
      return this.s.d;
   }

   public double e(double $$0) {
      return this.s.d + (double)this.dl() * $$0;
   }

   public double dy() {
      return this.e(this.ah.j());
   }

   public double dz() {
      return this.s.d + (double)this.be;
   }

   public final int dA() {
      return this.t.w();
   }

   public final double dB() {
      return this.s.e;
   }

   public double f(double $$0) {
      return this.s.e + (double)this.dk() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ah.j() - 1.0) * $$0);
   }

   public final void o(double $$0, double $$1, double $$2) {
      if (this.s.c != $$0 || this.s.d != $$1 || this.s.e != $$2) {
         this.s = new eww($$0, $$1, $$2);
         int $$3 = ayn.a($$0);
         int $$4 = ayn.a($$1);
         int $$5 = ayn.a($$2);
         if ($$3 != this.t.u() || $$4 != this.t.v() || $$5 != this.t.w()) {
            this.t = new jd($$3, $$4, $$5);
            this.bj = null;
            if (kf.a($$3) != this.u.e || kf.a($$5) != this.u.f) {
               this.u = new dcb(this.t);
            }
         }

         this.aV.a();
      }
   }

   public void dC() {
   }

   public eww r(float $$0) {
      return this.m($$0).b(0.0, (double)this.be * 0.7, 0.0);
   }

   public void a(abu $$0) {
      int $$1 = $$0.b();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      double $$4 = $$0.i();
      this.f($$2, $$3, $$4);
      this.e($$2, $$3, $$4);
      this.t($$0.m());
      this.s($$0.n());
      this.e($$1);
      this.a_($$0.e());
   }

   @Nullable
   public cuo dD() {
      return null;
   }

   public void q(boolean $$0) {
      this.az = $$0;
   }

   public boolean dE() {
      return !this.am().a(awh.k);
   }

   public boolean dF() {
      return (this.az || this.aA) && this.dE();
   }

   public float dG() {
      return this.aD;
   }

   public float dH() {
      return this.dG();
   }

   public void s(float $$0) {
      if (!Float.isFinite($$0)) {
         ad.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aD = $$0;
      }
   }

   public float dI() {
      return this.aE;
   }

   public void t(float $$0) {
      if (!Float.isFinite($$0)) {
         ad.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aE = $$0;
      }
   }

   public boolean dJ() {
      return false;
   }

   public float dK() {
      return 0.0F;
   }

   public void a(@Nullable bsq $$0) {
   }

   public final boolean dL() {
      return this.aH != null;
   }

   @Nullable
   public bsq.c dM() {
      return this.aH;
   }

   @Override
   public final void b(bsq.c $$0) {
      if (this.aH == null) {
         this.aH = $$0;
      }

      if (this.aH.a()) {
         this.ad();
      }

      this.cT().forEach(bsq::ad);
      this.aV.a($$0);
   }

   protected void dN() {
      this.aH = null;
   }

   @Override
   public void a(dxe $$0) {
      this.aV = $$0;
   }

   @Override
   public boolean dO() {
      if (this.aH != null && !this.aH.b()) {
         return false;
      } else {
         return this.bS() ? false : !this.bT() || !this.cZ();
      }
   }

   @Override
   public boolean dP() {
      return false;
   }

   public boolean a(dcu $$0, jd $$1) {
      return true;
   }

   public dcu dQ() {
      return this.r;
   }

   protected void a(dcu $$0) {
      this.r = $$0;
   }

   public brk dR() {
      return this.dQ().aj();
   }

   public ka dS() {
      return this.dQ().H_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = ayn.d($$6, this.dv(), $$1);
      double $$8 = ayn.d($$6, this.dx(), $$2);
      double $$9 = ayn.d($$6, this.dB(), $$3);
      float $$10 = (float)ayn.e($$6, (double)this.dG(), $$4);
      float $$11 = (float)ayn.d($$6, (double)this.dI(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   public ayv dT() {
      return this.ah;
   }

   public eww ag() {
      if (this.cR() instanceof cmv $$0 && this.bE()) {
         return $$0.ag();
      }

      return this.dt();
   }

   @FunctionalInterface
   public interface a {
      void accept(bsq var1, double var2, double var4, double var6);
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
