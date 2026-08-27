import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import java.util.Arrays;
import java.util.Collections;
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
import org.joml.Vector3f;
import org.slf4j.Logger;

public abstract class big implements bgs, dip, dr {
   private static final Logger c = LogUtils.getLogger();
   public static final String w = "id";
   public static final String x = "Passengers";
   private static final AtomicInteger d = new AtomicInteger();
   private static final List<ciw> e = Collections.emptyList();
   public static final int y = 60;
   public static final int z = 300;
   public static final int A = 1024;
   public static final float B = 0.2F;
   public static final double C = 0.500001;
   public static final double D = 0.999999;
   public static final float E = 0.11111111F;
   public static final int F = 140;
   public static final int G = 40;
   private static final eha k = new eha(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double l = 0.014;
   private static final double m = 0.007;
   private static final double n = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double o = 1.0;
   private final bik<?> p;
   private int q = d.incrementAndGet();
   public boolean I;
   private ImmutableList<big> r = ImmutableList.of();
   protected int J;
   @Nullable
   private big s;
   private cpk t;
   public double K;
   public double L;
   public double M;
   private ehf u;
   private gv v;
   private cor aE;
   private ehf aF = ehf.b;
   private float aG;
   private float aH;
   public float N;
   public float O;
   private eha aI = k;
   private boolean aJ;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected ehf U = ehf.b;
   @Nullable
   private big.c aK;
   public static final float V = 0.6F;
   public static final float W = 1.8F;
   public float X;
   public float Y;
   public float Z;
   public float aa;
   public float ab;
   private float aL = 1.0F;
   public double ac;
   public double ad;
   public double ae;
   private float aM;
   public boolean af;
   protected final art ag = art.a();
   public int ah;
   private int aN = -this.db();
   protected boolean ai;
   protected Object2DoubleMap<apy<eaa>> aj = new Object2DoubleArrayMap(2);
   protected boolean ak;
   private final Set<apy<eaa>> aO = new HashSet<>();
   public int al;
   protected boolean am = true;
   protected final aea an;
   protected static final adx<Byte> ao = aea.a(big.class, adz.a);
   protected static final int ap = 0;
   private static final int aP = 1;
   private static final int aQ = 3;
   private static final int aR = 4;
   private static final int aS = 5;
   protected static final int aq = 6;
   protected static final int ar = 7;
   private static final adx<Integer> aT = aea.a(big.class, adz.b);
   private static final adx<Optional<te>> aU = aea.a(big.class, adz.g);
   private static final adx<Boolean> aV = aea.a(big.class, adz.k);
   private static final adx<Boolean> aW = aea.a(big.class, adz.k);
   private static final adx<Boolean> aX = aea.a(big.class, adz.k);
   protected static final adx<bji> as = aea.a(big.class, adz.v);
   private static final adx<Integer> aY = aea.a(big.class, adz.b);
   private diq aZ = diq.a;
   private final acr ba = new acr();
   public boolean at;
   public boolean au;
   private int bb;
   protected boolean av;
   protected int aw;
   protected gv ax;
   private boolean bc;
   protected UUID ay = aro.a(this.ag);
   protected String az = this.ay.toString();
   private boolean bd;
   private final Set<String> be = Sets.newHashSet();
   private final double[] bf = new double[]{0.0, 0.0, 0.0};
   private long bg;
   private bih bh;
   private float bi;
   public boolean aA;
   public boolean aB;
   public boolean aC;
   public Optional<gv> aD = Optional.empty();
   private boolean bj = false;
   private float bk;
   private int bl;
   private boolean bm;
   @Nullable
   private dey bn = null;

   public big(bik<?> $$0, cpk $$1) {
      this.p = $$0;
      this.t = $$1;
      this.bh = $$0.n();
      this.u = ehf.b;
      this.v = gv.b;
      this.aE = cor.b;
      this.an = new aea(this);
      this.an.a(ao, (byte)0);
      this.an.a(aT, this.cg());
      this.an.a(aV, false);
      this.an.a(aU, Optional.empty());
      this.an.a(aW, false);
      this.an.a(aX, false);
      this.an.a(as, bji.a);
      this.an.a(aY, 0);
      this.a_();
      this.e(0.0, 0.0, 0.0);
      this.bi = this.a(bji.a, this.bh);
   }

   public boolean a(gv $$0, dey $$1) {
      ehy $$2 = $$1.b(this.dK(), $$0, ehk.a(this));
      ehy $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return ehv.c($$3, ehv.a(this.cG()), ehj.i);
   }

   public int c_() {
      eig $$0 = this.cf();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean G_() {
      return false;
   }

   public final void ae() {
      if (this.bO()) {
         this.bA();
      }

      if (this.bN()) {
         this.aa();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.ba.e(new ehf($$0, $$1, $$2));
   }

   public acr af() {
      return this.ba;
   }

   public bik<?> ag() {
      return this.p;
   }

   @Override
   public int ah() {
      return this.q;
   }

   public void e(int $$0) {
      this.q = $$0;
   }

   public Set<String> ai() {
      return this.be;
   }

   public boolean a(String $$0) {
      return this.be.size() >= 1024 ? false : this.be.add($$0);
   }

   public boolean b(String $$0) {
      return this.be.remove($$0);
   }

   public void aj() {
      this.a(big.c.a);
      this.a(dji.p);
   }

   public final void ak() {
      this.a(big.c.b);
   }

   protected abstract void a_();

   public aea al() {
      return this.an;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof big ? ((big)$$0).q == this.q : false;
   }

   @Override
   public int hashCode() {
      return this.q;
   }

   public void a(big.c $$0) {
      this.b($$0);
   }

   public void am() {
   }

   public void b(bji $$0) {
      this.an.b(as, $$0);
   }

   public bji an() {
      return this.an.b(as);
   }

   public boolean c(bji $$0) {
      return this.an() == $$0;
   }

   public boolean a(big $$0, double $$1) {
      return this.di().a((hp)$$0.di(), $$1);
   }

   public boolean a(big $$0, double $$1, double $$2) {
      double $$3 = $$0.dp() - this.dp();
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.dv() - this.dv();
      return aro.e($$3, $$5) < aro.k($$1) && aro.k($$4) < aro.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.r($$0 % 360.0F);
      this.s($$1 % 360.0F);
   }

   public final void a(ehf $$0) {
      this.e($$0.a(), $$0.b(), $$0.c());
   }

   public void e(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.ao());
   }

   protected eha ao() {
      return this.bh.a(this.u);
   }

   protected void ap() {
      this.e(this.u.c, this.u.d, this.u.e);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.s(this.dC() + $$2);
      this.r(this.dA() + $$3);
      this.s(aro.a(this.dC(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = aro.a(this.O, -90.0F, 90.0F);
      if (this.s != null) {
         this.s.j(this);
      }
   }

   public void l() {
      this.aq();
   }

   public void aq() {
      this.dK().ad().a("entityBaseTick");
      this.bn = null;
      if (this.bN() && this.cY().dF()) {
         this.aa();
      }

      if (this.J > 0) {
         this.J--;
      }

      this.X = this.Y;
      this.O = this.dC();
      this.N = this.dA();
      this.bH();
      if (this.bj()) {
         this.bk();
      }

      this.aB = this.aA;
      this.aA = false;
      this.be();
      this.r();
      this.bd();
      if (this.dK().B) {
         this.ay();
      } else if (this.aN > 0) {
         if (this.aW()) {
            this.h(this.aN - 4);
            if (this.aN < 0) {
               this.ay();
            }
         } else {
            if (this.aN % 20 == 0 && !this.bl()) {
               this.a(this.dL().c(), 1.0F);
            }

            this.h(this.aN - 1);
         }

         if (this.ci() > 0) {
            this.k(0);
            this.dK().a(null, 1009, this.v, 1);
         }
      }

      if (this.bl()) {
         this.aw();
         this.ab *= 0.5F;
      }

      this.ar();
      if (!this.dK().B) {
         this.a_(this.aN > 0);
      }

      this.am = false;
      this.dK().ad().c();
   }

   public void a_(boolean $$0) {
      this.b(0, $$0 || this.bm);
   }

   public void ar() {
      if (this.dr() < (double)(this.dK().C_() - 64)) {
         this.az();
      }
   }

   public void as() {
      this.bb = this.bI();
   }

   public void f(int $$0) {
      this.bb = $$0;
   }

   public int at() {
      return this.bb;
   }

   public boolean au() {
      return this.bb > 0;
   }

   protected void I() {
      if (this.au()) {
         this.bb--;
      }
   }

   public int av() {
      return 0;
   }

   public void aw() {
      if (!this.aW()) {
         this.g(15);
         if (this.a(this.dL().d(), 4.0F)) {
            this.a(aou.iT, 0.4F, 2.0F + this.ag.i() * 0.4F);
         }
      }
   }

   public void g(int $$0) {
      int $$1 = $$0 * 20;
      if (this instanceof biw) {
         $$1 = cnq.a((biw)this, $$1);
      }

      if (this.aN < $$1) {
         this.h($$1);
      }
   }

   public void h(int $$0) {
      this.aN = $$0;
   }

   public int ax() {
      return this.aN;
   }

   public void ay() {
      this.h(0);
   }

   protected void az() {
      this.ak();
   }

   public boolean g(double $$0, double $$1, double $$2) {
      return this.b(this.cG().d($$0, $$1, $$2));
   }

   private boolean b(eha $$0) {
      return this.dK().a(this, $$0) && !this.dK().d($$0);
   }

   public void c(boolean $$0) {
      this.aJ = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, ehf $$1) {
      this.aJ = $$0;
      this.b($$0, $$1);
   }

   public boolean d(gv $$0) {
      return this.aD.isPresent() && this.aD.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable ehf $$1) {
      if ($$0) {
         eha $$2 = this.cG();
         eha $$3 = new eha($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<gv> $$4 = this.t.g(this, $$3);
         if ($$4.isPresent() || this.bj) {
            this.aD = $$4;
         } else if ($$1 != null) {
            eha $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
            $$4 = this.t.g(this, $$5);
            this.aD = $$4;
         }

         this.bj = $$4.isEmpty();
      } else {
         this.bj = false;
         if (this.aD.isPresent()) {
            this.aD = Optional.empty();
         }
      }
   }

   public boolean aA() {
      return this.aJ;
   }

   public void a(bjc $$0, ehf $$1) {
      if (this.af) {
         this.e(this.dp() + $$1.c, this.dr() + $$1.d, this.dv() + $$1.e);
      } else {
         this.aC = this.bM();
         if ($$0 == bjc.c) {
            $$1 = this.c($$1);
            if ($$1.equals(ehf.b)) {
               return;
            }
         }

         this.dK().ad().a("move");
         if (this.U.g() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = ehf.b;
            this.f(ehf.b);
         }

         $$1 = this.a($$1, $$0);
         ehf $$2 = this.h($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ab != 0.0F && $$3 >= 1.0) {
               ehb $$4 = this.dK().a(new cot(this.di(), this.di().e($$2), cot.a.d, cot.b.d, this));
               if ($$4.c() != ehd.a.a) {
                  this.n();
               }
            }

            this.e(this.dp() + $$2.c, this.dr() + $$2.d, this.dv() + $$2.e);
         }

         this.dK().ad().c();
         this.dK().ad().a("rest");
         boolean $$5 = !aro.b($$1.c, $$2.c);
         boolean $$6 = !aro.b($$1.e, $$2.e);
         this.P = $$5 || $$6;
         this.Q = $$1.d != $$2.d;
         this.R = this.Q && $$1.d < 0.0;
         if (this.P) {
            this.S = this.b($$2);
         } else {
            this.S = false;
         }

         this.a(this.R, $$2);
         gv $$7 = this.aF();
         dey $$8 = this.dK().a_($$7);
         this.a($$2.d, this.aA(), $$8, $$7);
         if (this.dF()) {
            this.dK().ad().c();
         } else {
            if (this.P) {
               ehf $$9 = this.dn();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            csk $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dK(), this);
            }

            if (this.aA()) {
               $$10.a(this.dK(), $$7, $$8, this);
            }

            big.b $$11 = this.aU();
            if ($$11.a() && !this.bN()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.aa = this.aa + (float)($$2.f() * 0.6);
               gv $$15 = this.aH();
               dey $$16 = this.dK().a_($$15);
               boolean $$17 = this.c($$16);
               if (!$$17) {
                  $$13 = 0.0;
               }

               this.Y = this.Y + (float)$$2.h() * 0.6F;
               this.Z = this.Z + (float)Math.sqrt($$12 * $$12 + $$13 * $$13 + $$14 * $$14) * 0.6F;
               if (this.Z > this.aL && !$$16.i()) {
                  boolean $$18 = $$15.equals($$7);
                  boolean $$19 = this.a($$7, $$8, $$11.c(), $$18, $$1);
                  if (!$$18) {
                     $$19 |= this.a($$15, $$16, false, $$11.b(), $$1);
                  }

                  if ($$19) {
                     this.aL = this.aK();
                  } else if (this.aX()) {
                     this.aL = this.aK();
                     if ($$11.c()) {
                        this.aP();
                     }

                     if ($$11.b()) {
                        this.a(dji.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aE();
               }
            }

            this.aB();
            float $$20 = this.aJ();
            this.f(this.dn().d((double)$$20, 1.0, (double)$$20));
            if (this.dK().c(this.cG().h(1.0E-6)).noneMatch($$0x -> $$0x.a(apj.aJ) || $$0x.a(csl.H))) {
               if (this.aN <= 0) {
                  this.h(-this.db());
               }

               if (this.aC && (this.aA || this.aZ())) {
                  this.aC();
               }
            }

            if (this.bM() && (this.aA || this.aZ())) {
               this.h(-this.db());
            }

            this.dK().ad().c();
         }
      }
   }

   private boolean c(dey $$0) {
      return $$0.a(apj.aO) || $$0.a(csl.qC);
   }

   private boolean a(gv $$0, dey $$1, boolean $$2, boolean $$3, ehf $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aA() || $$5 || this.bW() && $$4.d == 0.0 || this.ce()) && !this.bY()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dK().a(dji.P, this.di(), dji.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean b(ehf $$0) {
      return false;
   }

   protected void aB() {
      try {
         this.aO();
      } catch (Throwable var4) {
         o $$1 = o.a(var4, "Checking entity block collision");
         p $$2 = $$1.a("Entity being checked for collision");
         this.a($$2);
         throw new y($$1);
      }
   }

   protected void aC() {
      this.a(aou.iY, 0.7F, 1.6F + (this.ag.i() - this.ag.i()) * 0.4F);
   }

   public void aD() {
      if (!this.dK().B && this.aC) {
         this.aC();
      }

      this.ay();
   }

   protected void aE() {
      if (this.aR()) {
         this.aQ();
         if (this.aU().b()) {
            this.a(dji.x);
         }
      }
   }

   @Deprecated
   public gv aF() {
      return this.d(0.2F);
   }

   protected gv aG() {
      return this.d(0.500001F);
   }

   public gv aH() {
      return this.d(1.0E-5F);
   }

   protected gv d(float $$0) {
      if (this.aD.isPresent()) {
         gv $$1 = this.aD.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dey $$2 = this.dK().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(apj.S)) && !$$2.a(apj.L) && !($$2.b() instanceof cvf) ? $$1.h(aro.a(this.u.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = aro.a(this.u.c);
         int $$4 = aro.a(this.u.d - (double)$$0);
         int $$5 = aro.a(this.u.e);
         return new gv($$3, $$4, $$5);
      }
   }

   protected float aI() {
      float $$0 = this.dK().a_(this.dk()).b().j();
      float $$1 = this.dK().a_(this.aG()).b().j();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aJ() {
      dey $$0 = this.dK().a_(this.dk());
      float $$1 = $$0.b().i();
      if (!$$0.a(csl.G) && !$$0.a(csl.nd)) {
         return (double)$$1 == 1.0 ? this.dK().a_(this.aG()).b().i() : $$1;
      } else {
         return $$1;
      }
   }

   protected ehf a(ehf $$0, bjc $$1) {
      return $$0;
   }

   protected ehf c(ehf $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dK().V();
         if ($$1 != this.bg) {
            Arrays.fill(this.bf, 0.0);
            this.bg = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(hb.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? ehf.b : new ehf($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(hb.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? ehf.b : new ehf(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(hb.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? ehf.b : new ehf(0.0, 0.0, $$4);
         } else {
            return ehf.b;
         }
      }
   }

   private double a(hb.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = aro.a($$1 + this.bf[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bf[$$2];
      this.bf[$$2] = $$3;
      return $$1;
   }

   private ehf h(ehf $$0) {
      eha $$1 = this.cG();
      List<ehy> $$2 = this.dK().c(this, $$1.b($$0));
      ehf $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dK(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.aA() || $$5 && $$0.d < 0.0;
      if (this.dE() > 0.0F && $$7 && ($$4 || $$6)) {
         ehf $$8 = a(this, new ehf($$0.c, (double)this.dE(), $$0.e), $$1, this.dK(), $$2);
         ehf $$9 = a(this, new ehf(0.0, (double)this.dE(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dK(), $$2);
         if ($$9.d < (double)this.dE()) {
            ehf $$10 = a(this, new ehf($$0.c, 0.0, $$0.e), $$1.c($$9), this.dK(), $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new ehf(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.dK(), $$2));
         }
      }

      return $$3;
   }

   public static ehf a(@Nullable big $$0, ehf $$1, eha $$2, cpk $$3, List<ehy> $$4) {
      Builder<ehy> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      dgp $$6 = $$3.w_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.e($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static ehf a(ehf $$0, eha $$1, List<ehy> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = ehv.a(hb.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = ehv.a(hb.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = ehv.a(hb.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = ehv.a(hb.a.c, $$1, $$2, $$5);
         }

         return new ehf($$3, $$4, $$5);
      }
   }

   protected float aK() {
      return (float)((int)this.Z + 1);
   }

   protected aot aL() {
      return aou.jc;
   }

   protected aot aM() {
      return aou.jb;
   }

   protected aot aN() {
      return aou.jb;
   }

   protected void aO() {
      eha $$0 = this.cG();
      gv $$1 = gv.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      gv $$2 = gv.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dK().a($$1, $$2)) {
         gv.a $$3 = new gv.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  $$3.d($$4, $$5, $$6);
                  dey $$7 = this.dK().a_($$3);

                  try {
                     $$7.a(this.dK(), $$3, this);
                     this.a($$7);
                  } catch (Throwable var12) {
                     o $$9 = o.a(var12, "Colliding entity with block");
                     p $$10 = $$9.a("Block being collided with");
                     p.a($$10, this.dK(), $$3, $$7);
                     throw new y($$9);
                  }
               }
            }
         }
      }
   }

   protected void a(dey $$0) {
   }

   public void a(dji $$0, @Nullable big $$1) {
      this.dK().a($$1, $$0, this.u);
   }

   public void a(dji $$0) {
      this.a($$0, this);
   }

   private void c(gv $$0, dey $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.m();
      }
   }

   protected void aP() {
      big $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      ehf $$2 = $$0.dn();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected gv e(gv $$0) {
      gv $$1 = $$0.c();
      dey $$2 = this.dK().a_($$1);
      return !$$2.a(apj.bm) && !$$2.a(apj.bn) ? $$0 : $$1;
   }

   protected void a(dey $$0, dey $$1) {
      czx $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dey $$0) {
      czx $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(gv $$0, dey $$1) {
      czx $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dey $$0) {
      return $$0.a(apj.bl) && this.ah >= this.bl + 20;
   }

   private void m() {
      this.bk = this.bk * (float)Math.pow(0.997, (double)(this.ah - this.bl));
      this.bk = Math.min(1.0F, this.bk + 0.07F);
      float $$0 = 0.5F + this.bk * this.ag.i() * 1.2F;
      float $$1 = 0.1F + this.bk * 1.2F;
      this.a(aou.E, $$1, $$0);
      this.bl = this.ah;
   }

   protected void e(float $$0) {
      this.a(this.aL(), $$0, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
   }

   protected void aQ() {
   }

   protected boolean aR() {
      return false;
   }

   public void a(aot $$0, float $$1, float $$2) {
      if (!this.aS()) {
         this.dK().a(null, this.dp(), this.dr(), this.dv(), $$0, this.da(), $$1, $$2);
      }
   }

   public void a(aot $$0) {
      if (!this.aS()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean aS() {
      return this.an.b(aW);
   }

   public void d(boolean $$0) {
      this.an.b(aW, $$0);
   }

   public boolean aT() {
      return this.an.b(aX);
   }

   public void e(boolean $$0) {
      this.an.b(aX, $$0);
   }

   protected big.b aU() {
      return big.b.d;
   }

   public boolean aV() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dey $$2, gv $$3) {
      if ($$1) {
         if (this.ab > 0.0F) {
            $$2.b().a(this.dK(), $$2, $$3, this, this.ab);
            this.dK().a(dji.A, this.u, dji.a.a(this, this.aD.<dey>map($$0x -> this.dK().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ab -= (float)$$0;
      }
   }

   public boolean aW() {
      return this.ag().d();
   }

   public boolean a(float $$0, float $$1, bhe $$2) {
      if (this.p.a(apm.l)) {
         return false;
      } else {
         if (this.bO()) {
            for (big $$3 : this.cP()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean aX() {
      return this.ai;
   }

   private boolean o() {
      gv $$0 = this.dk();
      return this.dK().q($$0) || this.dK().q(gv.a((double)$$0.u(), this.cG().e, (double)$$0.w()));
   }

   private boolean p() {
      return this.dK().a_(this.dk()).a(csl.nd);
   }

   public boolean aY() {
      return this.aX() || this.o();
   }

   public boolean aZ() {
      return this.aX() || this.o() || this.p();
   }

   public boolean ba() {
      return this.aX() || this.p();
   }

   public boolean bb() {
      return this.ba() || this.bl();
   }

   public boolean bc() {
      return this.ak && this.aX();
   }

   public void bd() {
      if (this.bY()) {
         this.h(this.bX() && this.aX() && !this.bN());
      } else {
         this.h(this.bX() && this.bc() && !this.bN() && this.dK().b_(this.v).a(apo.a));
      }
   }

   protected boolean be() {
      this.aj.clear();
      this.bf();
      double $$0 = this.dK().x_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(apo.b, $$0);
      return this.aX() || $$1;
   }

   void bf() {
      if (this.cY() instanceof cde $$0 && !$$0.bc()) {
         this.ai = false;
         return;
      }

      if (this.a(apo.a, 0.014)) {
         if (!this.ai && !this.am) {
            this.bg();
         }

         this.n();
         this.ai = true;
         this.ay();
      } else {
         this.ai = false;
      }
   }

   private void r() {
      this.ak = this.a(apo.a);
      this.aO.clear();
      double $$0 = this.dt() - 0.11111111F;
      if (this.cY() instanceof cde $$2 && !$$2.bc() && $$2.cG().e >= $$0 && $$2.cG().b <= $$0) {
         return;
      }

      gv $$3 = gv.a(this.dp(), $$0, this.dv());
      eab $$4 = this.dK().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((coq)this.dK(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aO::add);
      }
   }

   protected void bg() {
      big $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      ehf $$2 = $$0.dn();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aM(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      } else {
         this.a(this.aN(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      }

      float $$4 = (float)aro.a(this.dr());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bh.a * 20.0F; $$5++) {
         double $$6 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         double $$7 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         this.dK().a(iw.e, this.dp() + $$6, (double)($$4 + 1.0F), this.dv() + $$7, $$2.c, $$2.d - this.ag.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bh.a * 20.0F; $$8++) {
         double $$9 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         double $$10 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         this.dK().a(iw.ag, this.dp() + $$9, (double)($$4 + 1.0F), this.dv() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(dji.O);
   }

   @Deprecated
   protected dey bh() {
      return this.dK().a_(this.aF());
   }

   public dey bi() {
      return this.dK().a_(this.aH());
   }

   public boolean bj() {
      return this.bX() && !this.aX() && !this.G_() && !this.bW() && !this.bl() && this.bv();
   }

   protected void bk() {
      gv $$0 = this.aF();
      dey $$1 = this.dK().a_($$0);
      if ($$1.l() != cyp.a) {
         ehf $$2 = this.dn();
         gv $$3 = this.dk();
         double $$4 = this.dp() + (this.ag.j() - 0.5) * (double)this.bh.a;
         double $$5 = this.dv() + (this.ag.j() - 0.5) * (double)this.bh.a;
         if ($$3.u() != $$0.u()) {
            $$4 = aro.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = aro.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dK().a(new io(iw.c, $$1), $$4, this.dr() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(apy<eaa> $$0) {
      return this.aO.contains($$0);
   }

   public boolean bl() {
      return !this.am && this.aj.getDouble(apo.b) > 0.0;
   }

   public void a(float $$0, ehf $$1) {
      ehf $$2 = a($$1, $$0, this.dA());
      this.f(this.dn().e($$2));
   }

   private static ehf a(ehf $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return ehf.b;
      } else {
         ehf $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = aro.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = aro.b($$2 * (float) (Math.PI / 180.0));
         return new ehf($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bm() {
      return this.dK().f(this.do(), this.du()) ? this.dK().w(gv.a(this.dp(), this.dt(), this.dv())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.r($$3 % 360.0F);
      this.s(aro.a($$4, -90.0F, 90.0F) % 360.0F);
      this.N = this.dA();
      this.O = this.dC();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = aro.a($$0, -3.0E7, 3.0E7);
      double $$4 = aro.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.e($$3, $$1, $$4);
   }

   public void d(ehf $$0) {
      this.d($$0.c, $$0.d, $$0.e);
   }

   public void d(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dA(), this.dC());
   }

   public void a(gv $$0, float $$1, float $$2) {
      this.b((double)$$0.u() + 0.5, (double)$$0.v(), (double)$$0.w() + 0.5, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.p($$0, $$1, $$2);
      this.r($$3);
      this.s($$4);
      this.bn();
      this.ap();
   }

   public final void bn() {
      double $$0 = this.dp();
      double $$1 = this.dr();
      double $$2 = this.dv();
      this.K = $$0;
      this.L = $$1;
      this.M = $$2;
      this.ac = $$0;
      this.ad = $$1;
      this.ae = $$2;
      this.N = this.dA();
      this.O = this.dC();
   }

   public float e(big $$0) {
      float $$1 = (float)(this.dp() - $$0.dp());
      float $$2 = (float)(this.dr() - $$0.dr());
      float $$3 = (float)(this.dv() - $$0.dv());
      return aro.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dp() - $$0;
      double $$4 = this.dr() - $$1;
      double $$5 = this.dv() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double f(big $$0) {
      return this.e($$0.di());
   }

   public double e(ehf $$0) {
      double $$1 = this.dp() - $$0.c;
      double $$2 = this.dr() - $$0.d;
      double $$3 = this.dv() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cbl $$0) {
   }

   public void g(big $$0) {
      if (!this.y($$0)) {
         if (!$$0.af && !this.af) {
            double $$1 = $$0.dp() - this.dp();
            double $$2 = $$0.dv() - this.dv();
            double $$3 = aro.a($$1, $$2);
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
               if (!this.bO() && this.bs()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.bO() && $$0.bs()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void j(double $$0, double $$1, double $$2) {
      this.f(this.dn().b($$0, $$1, $$2));
      this.au = true;
   }

   protected void bo() {
      this.T = true;
   }

   public boolean a(bhe $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bo();
         return false;
      }
   }

   public final ehf f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dC() : aro.i($$0, this.O, this.dC());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dA() : aro.i($$0, this.N, this.dA());
   }

   protected final ehf b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = aro.b($$3);
      float $$5 = aro.a($$3);
      float $$6 = aro.b($$2);
      float $$7 = aro.a($$2);
      return new ehf((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final ehf i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final ehf c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final ehf bp() {
      return new ehf(this.dp(), this.dt(), this.dv());
   }

   public final ehf j(float $$0) {
      double $$1 = aro.d((double)$$0, this.K, this.dp());
      double $$2 = aro.d((double)$$0, this.L, this.dr()) + (double)this.cH();
      double $$3 = aro.d((double)$$0, this.M, this.dv());
      return new ehf($$1, $$2, $$3);
   }

   public ehf k(float $$0) {
      return this.j($$0);
   }

   public final ehf l(float $$0) {
      double $$1 = aro.d((double)$$0, this.K, this.dp());
      double $$2 = aro.d((double)$$0, this.L, this.dr());
      double $$3 = aro.d((double)$$0, this.M, this.dv());
      return new ehf($$1, $$2, $$3);
   }

   public ehd a(double $$0, float $$1, boolean $$2) {
      ehf $$3 = this.j($$1);
      ehf $$4 = this.f($$1);
      ehf $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dK().a(new cot($$3, $$5, cot.a.b, $$2 ? cot.b.c : cot.b.a, this));
   }

   public boolean bq() {
      return this.bv() && this.br();
   }

   public boolean br() {
      return false;
   }

   public boolean bs() {
      return false;
   }

   public void a(big $$0, int $$1, bhe $$2) {
      if ($$0 instanceof akj) {
         ai.c.a((akj)$$0, this, $$2);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.dp() - $$0;
      double $$4 = this.dr() - $$1;
      double $$5 = this.dv() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cG().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * o;
      return $$0 < $$1 * $$1;
   }

   public boolean d(qs $$0) {
      if (this.aK != null && !this.aK.b()) {
         return false;
      } else {
         String $$1 = this.bu();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.f($$0);
            return true;
         }
      }
   }

   public boolean e(qs $$0) {
      return this.bN() ? false : this.d($$0);
   }

   public qs f(qs $$0) {
      try {
         if (this.s != null) {
            $$0.a("Pos", this.a(this.s.dp(), this.dr(), this.s.dv()));
         } else {
            $$0.a("Pos", this.a(this.dp(), this.dr(), this.dv()));
         }

         ehf $$1 = this.dn();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dA(), this.dC()));
         $$0.a("FallDistance", this.ab);
         $$0.a("Fire", (short)this.aN);
         $$0.a("Air", (short)this.ch());
         $$0.a("OnGround", this.aA());
         $$0.a("Invulnerable", this.bc);
         $$0.a("PortalCooldown", this.bb);
         $$0.a("UUID", this.cv());
         te $$2 = this.ad();
         if ($$2 != null) {
            $$0.a("CustomName", te.a.a($$2));
         }

         if (this.cA()) {
            $$0.a("CustomNameVisible", this.cA());
         }

         if (this.aS()) {
            $$0.a("Silent", this.aS());
         }

         if (this.aT()) {
            $$0.a("NoGravity", this.aT());
         }

         if (this.bd) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.ci();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.ci());
         }

         if (this.bm) {
            $$0.a("HasVisualFire", this.bm);
         }

         if (!this.be.isEmpty()) {
            qy $$4 = new qy();

            for (String $$5 : this.be) {
               $$4.add(rj.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bO()) {
            qy $$6 = new qy();

            for (big $$7 : this.cP()) {
               qs $$8 = new qs();
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
         throw new y($$10);
      }
   }

   public void g(qs $$0) {
      try {
         qy $$1 = $$0.c("Pos", 6);
         qy $$2 = $$0.c("Motion", 6);
         qy $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(aro.a($$1.h(0), -3.0000512E7, 3.0000512E7), aro.a($$1.h(1), -2.0E7, 2.0E7), aro.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.r($$3.i(0));
         this.s($$3.i(1));
         this.bn();
         this.n(this.dA());
         this.o(this.dA());
         this.ab = $$0.j("FallDistance");
         this.aN = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.j($$0.g("Air"));
         }

         this.aJ = $$0.q("OnGround");
         this.bc = $$0.q("Invulnerable");
         this.bb = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.ay = $$0.a("UUID");
            this.az = this.ay.toString();
         }

         if (!Double.isFinite(this.dp()) || !Double.isFinite(this.dr()) || !Double.isFinite(this.dv())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dA()) && Double.isFinite((double)this.dC())) {
            this.ap();
            this.a(this.dA(), this.dC());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(te.a.a($$8));
               } catch (Exception var16) {
                  c.warn("Failed to parse entity custom name {}", $$8, var16);
               }
            }

            this.n($$0.q("CustomNameVisible"));
            this.d($$0.q("Silent"));
            this.e($$0.q("NoGravity"));
            this.i($$0.q("Glowing"));
            this.k($$0.h("TicksFrozen"));
            this.bm = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.be.clear();
               qy $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.be.add($$10.j($$12));
               }
            }

            this.a($$0);
            if (this.bt()) {
               this.ap();
            }
         } else {
            throw new IllegalStateException("Entity has invalid rotation");
         }
      } catch (Throwable var17) {
         o $$14 = o.a(var17, "Loading entity NBT");
         p $$15 = $$14.a("Entity being loaded");
         this.a($$15);
         throw new y($$14);
      }
   }

   protected boolean bt() {
      return true;
   }

   @Nullable
   protected final String bu() {
      bik<?> $$0 = this.ag();
      aep $$1 = bik.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(qs var1);

   protected abstract void b(qs var1);

   protected qy a(double... $$0) {
      qy $$1 = new qy();

      for (double $$2 : $$0) {
         $$1.add(qt.a($$2));
      }

      return $$1;
   }

   protected qy a(float... $$0) {
      qy $$1 = new qy();

      for (float $$2 : $$0) {
         $$1.add(qv.a($$2));
      }

      return $$1;
   }

   @Nullable
   public bye a(cpj $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public bye a(cpj $$0, int $$1) {
      return this.a(new ciw($$0), (float)$$1);
   }

   @Nullable
   public bye b(ciw $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public bye a(ciw $$0, float $$1) {
      if ($$0.b()) {
         return null;
      } else if (this.dK().B) {
         return null;
      } else {
         bye $$2 = new bye(this.dK(), this.dp(), this.dr() + (double)$$1, this.dv(), $$0);
         $$2.o();
         this.dK().b($$2);
         return $$2;
      }
   }

   public boolean bv() {
      return !this.dF();
   }

   public boolean bw() {
      if (this.af) {
         return false;
      } else {
         float $$0 = this.bh.a * 0.8F;
         eha $$1 = eha.a(this.bp(), (double)$$0, 1.0E-6, (double)$$0);
         return gv.a($$1)
            .anyMatch(
               $$1x -> {
                  dey $$2 = this.dK().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dK(), $$1x)
                     && ehv.c($$2.k(this.dK(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), ehv.a($$1), ehj.i);
               }
            );
      }
   }

   public bgo a(cbl $$0, bgn $$1) {
      return bgo.d;
   }

   public boolean h(big $$0) {
      return $$0.bx() && !this.y($$0);
   }

   public boolean bx() {
      return false;
   }

   public void by() {
      this.f(ehf.b);
      this.l();
      if (this.bN()) {
         this.cY().i(this);
      }
   }

   public final void i(big $$0) {
      if (this.x($$0)) {
         this.a($$0, big::e);
      }
   }

   protected void a(big $$0, big.a $$1) {
      ehf $$2 = this.m($$0);
      $$1.accept($$0, $$2.c, $$2.d + (double)$$0.k(this), $$2.e);
   }

   public void j(big $$0) {
   }

   public float k(big $$0) {
      return this.l($$0);
   }

   protected float l(big $$0) {
      return 0.0F;
   }

   public ehf m(big $$0) {
      return new ehf(this.a($$0, this.bh, 1.0F).rotateY(-this.aG * (float) (Math.PI / 180.0))).e(this.di());
   }

   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   public boolean n(big $$0) {
      return this.a($$0, false);
   }

   public boolean bz() {
      return this instanceof biw;
   }

   public boolean a(big $$0, boolean $$1) {
      if ($$0 == this.s) {
         return false;
      } else if (!$$0.bC()) {
         return false;
      } else {
         for (big $$2 = $$0; $$2.s != null; $$2 = $$2.s) {
            if ($$2.s == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bN()) {
               this.aa();
            }

            this.b(bji.a);
            this.s = $$0;
            this.s.p(this);
            $$0.w().filter($$0x -> $$0x instanceof akj).forEach($$0x -> ai.R.a((akj)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(big $$0) {
      return !this.bR() && this.J <= 0;
   }

   public void bA() {
      for (int $$0 = this.r.size() - 1; $$0 >= 0; $$0--) {
         ((big)this.r.get($$0)).aa();
      }
   }

   public void bB() {
      if (this.s != null) {
         big $$0 = this.s;
         this.s = null;
         $$0.q(this);
      }
   }

   public void aa() {
      this.bB();
   }

   protected void p(big $$0) {
      if ($$0.cY() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.r.isEmpty()) {
            this.r = ImmutableList.of($$0);
         } else {
            List<big> $$1 = Lists.newArrayList(this.r);
            if (!this.dK().B && $$0 instanceof cbl && !(this.cQ() instanceof cbl)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.r = ImmutableList.copyOf($$1);
         }

         this.a(dji.s, $$0);
      }
   }

   protected void q(big $$0) {
      if ($$0.cY() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.r.size() == 1 && this.r.get(0) == $$0) {
            this.r = ImmutableList.of();
         } else {
            this.r = this.r.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(dji.q, $$0);
      }
   }

   protected boolean r(big $$0) {
      return this.r.isEmpty();
   }

   protected boolean bC() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.e($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public void a(float $$0, int $$1) {
      this.n($$0);
   }

   public float bD() {
      return 0.0F;
   }

   public ehf bE() {
      return this.b(this.dC(), this.dA());
   }

   public ehf a(cir $$0) {
      if (!(this instanceof cbl $$1)) {
         return ehf.b;
      } else {
         boolean $$2 = $$1.eS().a($$0) && !$$1.eR().a($$0);
         biq $$3 = $$2 ? $$1.fk().e() : $$1.fk();
         return this.b(0.0F, this.dA() + (float)($$3 == biq.b ? 80 : -80)).a(0.5);
      }
   }

   public ehe bF() {
      return new ehe(this.dC(), this.dA());
   }

   public ehf bG() {
      return ehf.a(this.bF());
   }

   public void f(gv $$0) {
      if (this.au()) {
         this.as();
      } else {
         if (!this.dK().B && !$$0.equals(this.ax)) {
            this.ax = $$0.i();
         }

         this.av = true;
      }
   }

   protected void bH() {
      if (this.dK() instanceof aki) {
         int $$0 = this.av();
         aki $$1 = (aki)this.dK();
         if (this.av) {
            MinecraftServer $$2 = $$1.n();
            aeo<cpk> $$3 = this.dK().ac() == cpk.i ? cpk.h : cpk.i;
            aki $$4 = $$2.a($$3);
            if ($$4 != null && $$2.B() && !this.bN() && this.aw++ >= $$0) {
               this.dK().ad().a("portal");
               this.aw = $$0;
               this.as();
               this.b($$4);
               this.dK().ad().c();
            }

            this.av = false;
         } else {
            if (this.aw > 0) {
               this.aw -= 4;
            }

            if (this.aw < 0) {
               this.aw = 0;
            }
         }

         this.I();
      }
   }

   public int bI() {
      return 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
   }

   public void c(bhe $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            cwb.a(this);
      }
   }

   public void m(float $$0) {
   }

   public Iterable<ciw> bJ() {
      return e;
   }

   public Iterable<ciw> bK() {
      return e;
   }

   public Iterable<ciw> bL() {
      return Iterables.concat(this.bJ(), this.bK());
   }

   public void a(bil $$0, ciw $$1) {
   }

   public boolean bM() {
      boolean $$0 = this.dK() != null && this.dK().B;
      return !this.aW() && (this.aN > 0 || $$0 && this.i(0));
   }

   public boolean bN() {
      return this.cY() != null;
   }

   public boolean bO() {
      return !this.r.isEmpty();
   }

   public boolean bP() {
      return this.ag().a(apm.m);
   }

   public boolean bQ() {
      return !this.ag().a(apm.n);
   }

   public void f(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean bR() {
      return this.i(1);
   }

   public boolean bS() {
      return this.bR();
   }

   public boolean bT() {
      return this.bR();
   }

   public boolean bU() {
      return this.bR();
   }

   public boolean bV() {
      return this.bR();
   }

   public boolean bW() {
      return this.c(bji.f);
   }

   public boolean bX() {
      return this.i(3);
   }

   public void g(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean bY() {
      return this.i(4);
   }

   public boolean bZ() {
      return this.c(bji.d);
   }

   public boolean ca() {
      return this.bZ() && !this.aX();
   }

   public void h(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cb() {
      return this.bd;
   }

   public final void i(boolean $$0) {
      this.bd = $$0;
      this.b(6, this.cc());
   }

   public boolean cc() {
      return this.dK().r_() ? this.i(6) : this.bd;
   }

   public boolean cd() {
      return this.i(5);
   }

   public boolean d(cbl $$0) {
      if ($$0.G_()) {
         return false;
      } else {
         eig $$1 = this.cf();
         return $$1 != null && $$0 != null && $$0.cf() == $$1 && $$1.i() ? false : this.cd();
      }
   }

   public boolean ce() {
      return false;
   }

   public void a(BiConsumer<djf<?>, aki> $$0) {
   }

   @Nullable
   public eig cf() {
      return this.dK().I().g(this.cx());
   }

   public boolean s(big $$0) {
      return this.a($$0.cf());
   }

   public boolean a(eig $$0) {
      return this.cf() != null ? this.cf().a($$0) : false;
   }

   public void j(boolean $$0) {
      this.b(5, $$0);
   }

   protected boolean i(int $$0) {
      return (this.an.b(ao) & 1 << $$0) != 0;
   }

   protected void b(int $$0, boolean $$1) {
      byte $$2 = this.an.b(ao);
      if ($$1) {
         this.an.b(ao, (byte)($$2 | 1 << $$0));
      } else {
         this.an.b(ao, (byte)($$2 & ~(1 << $$0)));
      }
   }

   public int cg() {
      return 300;
   }

   public int ch() {
      return this.an.b(aT);
   }

   public void j(int $$0) {
      this.an.b(aT, $$0);
   }

   public int ci() {
      return this.an.b(aY);
   }

   public void k(int $$0) {
      this.an.b(aY, $$0);
   }

   public float cj() {
      int $$0 = this.cl();
      return (float)Math.min(this.ci(), $$0) / (float)$$0;
   }

   public boolean ck() {
      return this.ci() >= this.cl();
   }

   public int cl() {
      return 140;
   }

   public void a(aki $$0, biv $$1) {
      this.h(this.aN + 1);
      if (this.aN == 0) {
         this.g(8);
      }

      this.a(this.dL().b(), 5.0F);
   }

   public void k(boolean $$0) {
      ehf $$1 = this.dn();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void l(boolean $$0) {
      ehf $$1 = this.dn();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(aki $$0, biw $$1) {
      return true;
   }

   public void cm() {
      if (this.dn().b() > -0.5 && this.ab > 1.0F) {
         this.ab = 1.0F;
      }
   }

   public void n() {
      this.ab = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      gv $$3 = gv.a($$0, $$1, $$2);
      ehf $$4 = new ehf($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      gv.a $$5 = new gv.a();
      hb $$6 = hb.b;
      double $$7 = Double.MAX_VALUE;

      for (hb $$8 : new hb[]{hb.c, hb.d, hb.e, hb.f, hb.b}) {
         $$5.a($$3, $$8);
         if (!this.dK().a_($$5).r(this.dK(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == hb.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ag.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      ehf $$13 = this.dn().a(0.75);
      if ($$6.o() == hb.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == hb.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == hb.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dey $$0, ehf $$1) {
      this.n();
      this.U = $$1;
   }

   private static te c(te $$0) {
      tr $$1 = $$0.d().b($$0.a().a(null));

      for (te $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public te ab() {
      te $$0 = this.ad();
      return $$0 != null ? c($$0) : this.cn();
   }

   protected te cn() {
      return this.p.h();
   }

   public boolean t(big $$0) {
      return this == $$0;
   }

   public float co() {
      return 0.0F;
   }

   public void n(float $$0) {
   }

   public void o(float $$0) {
   }

   public boolean cp() {
      return true;
   }

   public boolean u(big $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dK() == null ? "~NULL~" : this.dK().toString();
      return this.aK != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.ab().getString(),
            this.q,
            $$0,
            this.dp(),
            this.dr(),
            this.dv(),
            this.aK
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.ab().getString(),
            this.q,
            $$0,
            this.dp(),
            this.dr(),
            this.dv()
         );
   }

   public boolean b(bhe $$0) {
      return this.dF() || this.bc && !$$0.a(apl.d) && !$$0.g() || $$0.a(apl.i) && this.aW() || $$0.a(apl.m) && this.ag().a(apm.l);
   }

   public boolean cq() {
      return this.bc;
   }

   public void m(boolean $$0) {
      this.bc = $$0;
   }

   public void v(big $$0) {
      this.b($$0.dp(), $$0.dr(), $$0.dv(), $$0.dA(), $$0.dC());
   }

   public void w(big $$0) {
      qs $$1 = $$0.f(new qs());
      $$1.r("Dimension");
      this.g($$1);
      this.bb = $$0.bb;
      this.ax = $$0.ax;
   }

   @Nullable
   public big b(aki $$0) {
      if (this.dK() instanceof aki && !this.dF()) {
         this.dK().ad().a("changeDimension");
         this.ae();
         this.dK().ad().a("reposition");
         eay $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dK().ad().b("reloading");
            big $$2 = this.ag().a((cpk)$$0);
            if ($$2 != null) {
               $$2.w(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dC());
               $$2.f($$1.b);
               $$0.d($$2);
               if ($$0.ac() == cpk.j) {
                  aki.a($$0);
               }
            }

            this.cr();
            this.dK().ad().c();
            ((aki)this.dK()).g();
            $$0.g();
            this.dK().ad().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void cr() {
      this.b(big.c.e);
   }

   @Nullable
   protected eay a(aki $$0) {
      boolean $$1 = this.dK().ac() == cpk.j && $$0.ac() == cpk.h;
      boolean $$2 = $$0.ac() == cpk.j;
      if (!$$1 && !$$2) {
         boolean $$5 = $$0.ac() == cpk.i;
         if (this.dK().ac() != cpk.i && !$$5) {
            return null;
         } else {
            dgp $$6 = $$0.w_();
            double $$7 = dih.a(this.dK().x_(), $$0.x_());
            gv $$8 = $$6.b(this.dp() * $$7, this.dr(), this.dv() * $$7);
            return this.a($$0, $$8, $$5, $$6).map($$1x -> {
               dey $$2x = this.dK().a_(this.ax);
               hb.a $$3;
               ehf $$5x;
               if ($$2x.b(dfo.H)) {
                  $$3 = $$2x.c(dfo.H);
                  l.a $$4 = l.a(this.ax, $$3, 21, hb.a.b, 21, $$1xx -> this.dK().a_($$1xx) == $$2x);
                  $$5x = this.a($$3, $$4);
               } else {
                  $$3 = hb.a.a;
                  $$5x = new ehf(0.5, 0.0, 0.0);
               }

               return eaz.a($$0, $$1x, $$3, $$5x, this, this.dn(), this.dA(), this.dC());
            }).orElse(null);
         }
      } else {
         gv $$3;
         if ($$2) {
            $$3 = aki.a;
         } else {
            $$3 = $$0.a(dkh.a.f, $$0.R());
         }

         return new eay(new ehf((double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5), this.dn(), this.dA(), this.dC());
      }
   }

   protected ehf a(hb.a $$0, l.a $$1) {
      return eaz.a($$1, $$0, this.di(), this.a(this.an()));
   }

   protected Optional<l.a> a(aki $$0, gv $$1, boolean $$2, dgp $$3) {
      return $$0.o().a($$1, $$2, $$3);
   }

   public boolean cs() {
      return !this.bN() && !this.bO();
   }

   public float a(cpc $$0, coq $$1, gv $$2, dey $$3, eab $$4, float $$5) {
      return $$5;
   }

   public boolean a(cpc $$0, coq $$1, gv $$2, dey $$3, float $$4) {
      return true;
   }

   public int ct() {
      return 3;
   }

   public boolean d_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bik.a(this.ag()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.q);
      $$0.a("Entity Name", () -> this.ab().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dp(), this.dr(), this.dv()));
      $$0.a("Entity's Block location", p.a(this.dK(), aro.a(this.dp()), aro.a(this.dr()), aro.a(this.dv())));
      ehf $$1 = this.dn();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", () -> this.cP().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.cY()));
   }

   public boolean cu() {
      return this.bM() && !this.G_();
   }

   public void a_(UUID $$0) {
      this.ay = $$0;
      this.az = this.ay.toString();
   }

   @Override
   public UUID cv() {
      return this.ay;
   }

   public String cw() {
      return this.az;
   }

   public String cx() {
      return this.az;
   }

   public boolean cy() {
      return true;
   }

   public static double cz() {
      return o;
   }

   public static void b(double $$0) {
      o = $$0;
   }

   @Override
   public te H_() {
      return eic.a(this.cf(), this.ab()).a($$0 -> $$0.a(this.cF()).a(this.cw()));
   }

   public void b(@Nullable te $$0) {
      this.an.b(aU, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public te ad() {
      return this.an.b(aU).orElse(null);
   }

   @Override
   public boolean ac() {
      return this.an.b(aU).isPresent();
   }

   public void n(boolean $$0) {
      this.an.b(aV, $$0);
   }

   public boolean cA() {
      return this.an.b(aV);
   }

   public final void n(double $$0, double $$1, double $$2) {
      if (this.dK() instanceof aki) {
         cor $$3 = new cor(gv.a($$0, $$1, $$2));
         ((aki)this.dK()).k().a(akn.g, $$3, 0, this.ah());
         this.dK().d($$3.e, $$3.f);
         this.b($$0, $$1, $$2);
      }
   }

   public boolean a(aki $$0, double $$1, double $$2, double $$3, Set<bjk> $$4, float $$5, float $$6) {
      float $$7 = aro.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dK()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.s();
         this.n($$5);
      } else {
         this.ae();
         big $$8 = this.ag().a((cpk)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(big.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (this.dK() instanceof aki) {
         this.b($$0, $$1, $$2, this.dA(), this.dC());
         this.s();
      }
   }

   private void s() {
      this.cR().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.r.iterator();

         while (var1.hasNext()) {
            big $$1 = (big)var1.next();
            $$0.a($$1, big::d);
         }
      });
   }

   public void c(double $$0, double $$1, double $$2) {
      this.b(this.dp() + $$0, this.dr() + $$1, this.dv() + $$2);
   }

   public boolean cB() {
      return this.cA();
   }

   public void a(List<aea.b<?>> $$0) {
   }

   public void a(adx<?> $$0) {
      if (as.equals($$0)) {
         this.e_();
      }
   }

   @Deprecated
   protected void cC() {
      bji $$0 = this.an();
      bih $$1 = this.a($$0);
      this.bh = $$1;
      this.bi = this.a($$0, $$1);
   }

   public void e_() {
      bih $$0 = this.bh;
      bji $$1 = this.an();
      bih $$2 = this.a($$1);
      this.bh = $$2;
      this.bi = this.a($$1, $$2);
      this.ap();
      boolean $$3 = (double)$$2.a <= 4.0 && (double)$$2.b <= 4.0;
      if (!this.dK().B && !this.am && !this.af && $$3 && ($$2.a > $$0.a || $$2.b > $$0.b) && !(this instanceof cbl)) {
         ehf $$4 = this.di().b(0.0, (double)$$0.b / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a - $$0.a) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b - $$0.b) + 1.0E-6;
         ehy $$7 = ehv.a(eha.a($$4, $$5, $$6, $$5));
         this.dK().a(this, $$7, $$4, (double)$$2.a, (double)$$2.b, (double)$$2.a).ifPresent($$1x -> this.a($$1x.b(0.0, (double)(-$$2.b) / 2.0, 0.0)));
      }
   }

   public hb cD() {
      return hb.a((double)this.dA());
   }

   public hb cE() {
      return this.cD();
   }

   protected tj cF() {
      return new tj(tj.a.c, new tj.b(this.ag(), this.cv(), this.ab()));
   }

   public boolean a(akj $$0) {
      return true;
   }

   @Override
   public final eha cG() {
      return this.aI;
   }

   public eha k_() {
      return this.cG();
   }

   public final void a(eha $$0) {
      this.aI = $$0;
   }

   protected float a(bji $$0, bih $$1) {
      return $$1.b * 0.85F;
   }

   public float d(bji $$0) {
      return this.a($$0, this.a($$0));
   }

   public final float cH() {
      return this.bi;
   }

   public ehf p(float $$0) {
      return this.cI();
   }

   protected ehf cI() {
      return new ehf(0.0, (double)this.cH(), (double)(this.df() * 0.4F));
   }

   public bjp a_(int $$0) {
      return bjp.b;
   }

   @Override
   public void a(te $$0) {
   }

   public cpk cJ() {
      return this.dK();
   }

   @Nullable
   public MinecraftServer cK() {
      return this.dK().n();
   }

   public bgo a(cbl $$0, ehf $$1, bgn $$2) {
      return bgo.d;
   }

   public boolean cL() {
      return false;
   }

   public void a(biw $$0, big $$1) {
      if ($$1 instanceof biw) {
         cnf.a((biw)$$1, $$0);
      }

      cnf.b($$0, $$1);
   }

   public void c(akj $$0) {
   }

   public void d(akj $$0) {
   }

   public float a(cyw $$0) {
      float $$1 = aro.g(this.dA());
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

   public float a(cxf $$0) {
      float $$1 = aro.g(this.dA());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public boolean cM() {
      return false;
   }

   @Nullable
   public biw cN() {
      return null;
   }

   public final boolean cO() {
      return this.cN() != null;
   }

   public final List<big> cP() {
      return this.r;
   }

   @Nullable
   public big cQ() {
      return this.r.isEmpty() ? null : (big)this.r.get(0);
   }

   public boolean x(big $$0) {
      return this.r.contains($$0);
   }

   public boolean a(Predicate<big> $$0) {
      UnmodifiableIterator var2 = this.r.iterator();

      while (var2.hasNext()) {
         big $$1 = (big)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<big> w() {
      return this.r.stream().flatMap(big::cR);
   }

   @Override
   public Stream<big> cR() {
      return Stream.concat(Stream.of(this), this.w());
   }

   @Override
   public Stream<big> cS() {
      return Stream.concat(this.r.stream().flatMap(big::cS), Stream.of(this));
   }

   public Iterable<big> cT() {
      return () -> this.w().iterator();
   }

   public boolean cU() {
      return this.w().filter($$0 -> $$0 instanceof cbl).count() == 1L;
   }

   public big cV() {
      big $$0 = this;

      while ($$0.bN()) {
         $$0 = $$0.cY();
      }

      return $$0;
   }

   public boolean y(big $$0) {
      return this.cV() == $$0.cV();
   }

   public boolean z(big $$0) {
      if (!$$0.bN()) {
         return false;
      } else {
         big $$1 = $$0.cY();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean cW() {
      return this.cN() instanceof cbl $$0 ? $$0.g() : this.cX();
   }

   public boolean cX() {
      return !this.dK().B;
   }

   protected static ehf a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -aro.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = aro.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new ehf((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public ehf b(biw $$0) {
      return new ehf(this.dp(), this.cG().e, this.dv());
   }

   @Nullable
   public big cY() {
      return this.s;
   }

   @Nullable
   public big cZ() {
      return this.s != null && this.s.cN() == this ? this.s : null;
   }

   public eag l_() {
      return eag.a;
   }

   public aov da() {
      return aov.g;
   }

   protected int db() {
      return 1;
   }

   public ds dc() {
      return new ds(
         this, this.di(), this.bF(), this.dK() instanceof aki ? (aki)this.dK() : null, this.C(), this.ab().getString(), this.H_(), this.dK().n(), this
      );
   }

   protected int C() {
      return 0;
   }

   public boolean l(int $$0) {
      return this.C() >= $$0;
   }

   @Override
   public boolean f_() {
      return this.dK().X().b(cpg.o);
   }

   @Override
   public boolean q_() {
      return true;
   }

   @Override
   public boolean N_() {
      return true;
   }

   public void a(ec.a $$0, ehf $$1) {
      ehf $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.s(aro.g((float)(-(aro.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.r(aro.g((float)(aro.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dA());
      this.O = this.dC();
      this.N = this.dA();
   }

   public boolean a(apy<eaa> $$0, double $$1) {
      if (this.dd()) {
         return false;
      } else {
         eha $$2 = this.cG().h(0.001);
         int $$3 = aro.a($$2.a);
         int $$4 = aro.c($$2.d);
         int $$5 = aro.a($$2.b);
         int $$6 = aro.c($$2.e);
         int $$7 = aro.a($$2.c);
         int $$8 = aro.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cy();
         boolean $$11 = false;
         ehf $$12 = ehf.b;
         int $$13 = 0;
         gv.a $$14 = new gv.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  eab $$18 = this.dK().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((coq)this.dK(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           ehf $$20 = $$18.c(this.dK(), $$14);
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

            if (!(this instanceof cbl)) {
               $$12 = $$12.d();
            }

            ehf $$21 = this.dn();
            $$12 = $$12.a($$1 * 1.0);
            double $$22 = 0.003;
            if (Math.abs($$21.c) < 0.003 && Math.abs($$21.e) < 0.003 && $$12.f() < 0.0045000000000000005) {
               $$12 = $$12.d().a(0.0045000000000000005);
            }

            this.f(this.dn().e($$12));
         }

         this.aj.put($$0, $$9);
         return $$11;
      }
   }

   public boolean dd() {
      eha $$0 = this.cG().g(1.0);
      int $$1 = aro.a($$0.a);
      int $$2 = aro.c($$0.d);
      int $$3 = aro.a($$0.c);
      int $$4 = aro.c($$0.f);
      return !this.dK().b($$1, $$3, $$2, $$4);
   }

   public double b(apy<eaa> $$0) {
      return this.aj.getDouble($$0);
   }

   public double de() {
      return (double)this.cH() < 0.4 ? 0.0 : 0.4;
   }

   public final float df() {
      return this.bh.a;
   }

   public final float dg() {
      return this.bh.b;
   }

   public float dh() {
      return this.dg() + 0.5F;
   }

   public uw<wo> U() {
      return new wp(this);
   }

   public bih a(bji $$0) {
      return this.p.n();
   }

   public ehf di() {
      return this.u;
   }

   public ehf dj() {
      return this.di();
   }

   @Override
   public gv dk() {
      return this.v;
   }

   public dey dl() {
      if (this.bn == null) {
         this.bn = this.dK().a_(this.dk());
      }

      return this.bn;
   }

   public cor dm() {
      return this.aE;
   }

   public ehf dn() {
      return this.aF;
   }

   public void f(ehf $$0) {
      this.aF = $$0;
   }

   public void g(ehf $$0) {
      this.f(this.dn().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.f(new ehf($$0, $$1, $$2));
   }

   public final int do() {
      return this.v.u();
   }

   public final double dp() {
      return this.u.c;
   }

   public double c(double $$0) {
      return this.u.c + (double)this.df() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ag.j() - 1.0) * $$0);
   }

   public final int dq() {
      return this.v.v();
   }

   public final double dr() {
      return this.u.d;
   }

   public double e(double $$0) {
      return this.u.d + (double)this.dg() * $$0;
   }

   public double ds() {
      return this.e(this.ag.j());
   }

   public double dt() {
      return this.u.d + (double)this.bi;
   }

   public final int du() {
      return this.v.w();
   }

   public final double dv() {
      return this.u.e;
   }

   public double f(double $$0) {
      return this.u.e + (double)this.df() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ag.j() - 1.0) * $$0);
   }

   public final void p(double $$0, double $$1, double $$2) {
      if (this.u.c != $$0 || this.u.d != $$1 || this.u.e != $$2) {
         this.u = new ehf($$0, $$1, $$2);
         int $$3 = aro.a($$0);
         int $$4 = aro.a($$1);
         int $$5 = aro.a($$2);
         if ($$3 != this.v.u() || $$4 != this.v.v() || $$5 != this.v.w()) {
            this.v = new gv($$3, $$4, $$5);
            this.bn = null;
            if (hy.a($$3) != this.aE.e || hy.a($$5) != this.aE.f) {
               this.aE = new cor(this.v);
            }
         }

         this.aZ.a();
      }
   }

   public void dw() {
   }

   public ehf q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bi * 0.7, 0.0);
   }

   public void a(wp $$0) {
      int $$1 = $$0.a();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      double $$4 = $$0.h();
      this.f($$2, $$3, $$4);
      this.d($$2, $$3, $$4);
      this.s($$0.l());
      this.r($$0.m());
      this.e($$1);
      this.a_($$0.d());
   }

   @Nullable
   public ciw dx() {
      return null;
   }

   public void o(boolean $$0) {
      this.aA = $$0;
   }

   public boolean dy() {
      return !this.ag().a(apm.i);
   }

   public boolean dz() {
      return (this.aA || this.aB) && this.dy();
   }

   public float dA() {
      return this.aG;
   }

   public float dB() {
      return this.dA();
   }

   public void r(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aG = $$0;
      }
   }

   public float dC() {
      return this.aH;
   }

   public void s(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aH = $$0;
      }
   }

   public boolean dD() {
      return false;
   }

   public float dE() {
      return this.aM;
   }

   public void t(float $$0) {
      this.aM = $$0;
   }

   public final boolean dF() {
      return this.aK != null;
   }

   @Nullable
   public big.c dG() {
      return this.aK;
   }

   @Override
   public final void b(big.c $$0) {
      if (this.aK == null) {
         this.aK = $$0;
      }

      if (this.aK.a()) {
         this.aa();
      }

      this.cP().forEach(big::aa);
      this.aZ.a($$0);
   }

   protected void dH() {
      this.aK = null;
   }

   @Override
   public void a(diq $$0) {
      this.aZ = $$0;
   }

   @Override
   public boolean dI() {
      if (this.aK != null && !this.aK.b()) {
         return false;
      } else {
         return this.bN() ? false : !this.bO() || !this.cU();
      }
   }

   @Override
   public boolean dJ() {
      return false;
   }

   public boolean a(cpk $$0, gv $$1) {
      return true;
   }

   public cpk dK() {
      return this.t;
   }

   protected void a(cpk $$0) {
      this.t = $$0;
   }

   public bhf dL() {
      return this.dK().ag();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = aro.d($$6, this.dp(), $$1);
      double $$8 = aro.d($$6, this.dr(), $$2);
      double $$9 = aro.d($$6, this.dv(), $$3);
      float $$10 = (float)aro.e($$6, (double)this.dA(), $$4);
      float $$11 = (float)aro.d($$6, (double)this.dC(), $$5);
      this.e($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   @FunctionalInterface
   public interface a {
      void accept(big var1, double var2, double var4, double var6);
   }

   public static enum b {
      a(false, false),
      b(true, false),
      c(false, true),
      d(true, true);

      final boolean e;
      final boolean f;

      private b(boolean $$0, boolean $$1) {
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

      private c(boolean $$0, boolean $$1) {
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
