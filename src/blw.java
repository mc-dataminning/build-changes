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
import org.slf4j.Logger;

public abstract class blw implements bkh, dng, dr, enf {
   private static final Logger c = LogUtils.getLogger();
   public static final String w = "id";
   public static final String x = "Passengers";
   private static final AtomicInteger d = new AtomicInteger();
   private static final List<cng> e = Collections.emptyList();
   public static final int y = 60;
   public static final int z = 300;
   public static final int A = 1024;
   public static final float B = 0.2F;
   public static final double C = 0.500001;
   public static final double D = 0.999999;
   public static final float E = 0.11111111F;
   public static final int F = 140;
   public static final int G = 40;
   private static final elx k = new elx(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double l = 0.014;
   private static final double m = 0.007;
   private static final double n = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double o = 1.0;
   private final bmc<?> p;
   private int q = d.incrementAndGet();
   public boolean I;
   private ImmutableList<blw> r = ImmutableList.of();
   protected int J;
   @Nullable
   private blw s;
   private ctx t;
   public double K;
   public double L;
   public double M;
   private emc u;
   private hx v;
   private cte aE;
   private emc aF = emc.b;
   private float aG;
   private float aH;
   public float N;
   public float O;
   private elx aI = k;
   private boolean aJ;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected emc U = emc.b;
   @Nullable
   private blw.c aK;
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
   public boolean af;
   protected final auw ag = auw.a();
   public int ah;
   private int aM = -this.dc();
   protected boolean ai;
   protected Object2DoubleMap<asx<eey>> aj = new Object2DoubleArrayMap(2);
   protected boolean ak;
   private final Set<asx<eey>> aN = new HashSet<>();
   public int al;
   protected boolean am = true;
   protected final agq an;
   protected static final agn<Byte> ao = agq.a(blw.class, agp.a);
   protected static final int ap = 0;
   private static final int aO = 1;
   private static final int aP = 3;
   private static final int aQ = 4;
   private static final int aR = 5;
   protected static final int aq = 6;
   protected static final int ar = 7;
   private static final agn<Integer> aS = agq.a(blw.class, agp.b);
   private static final agn<Optional<vg>> aT = agq.a(blw.class, agp.g);
   private static final agn<Boolean> aU = agq.a(blw.class, agp.k);
   private static final agn<Boolean> aV = agq.a(blw.class, agp.k);
   private static final agn<Boolean> aW = agq.a(blw.class, agp.k);
   protected static final agn<bna> as = agq.a(blw.class, agp.v);
   private static final agn<Integer> aX = agq.a(blw.class, agp.b);
   private dnh aY = dnh.a;
   private final afh aZ = new afh();
   public boolean at;
   public boolean au;
   private int ba;
   protected boolean av;
   protected int aw;
   protected hx ax;
   private boolean bb;
   protected UUID ay = aup.a(this.ag);
   protected String az = this.ay.toString();
   private boolean bc;
   private final Set<String> bd = Sets.newHashSet();
   private final double[] be = new double[]{0.0, 0.0, 0.0};
   private long bf;
   private blz bg;
   private float bh;
   public boolean aA;
   public boolean aB;
   public boolean aC;
   public Optional<hx> aD = Optional.empty();
   private boolean bi = false;
   private float bj;
   private int bk;
   private boolean bl;
   @Nullable
   private djp bm = null;

   public blw(bmc<?> $$0, ctx $$1) {
      this.p = $$0;
      this.t = $$1;
      this.bg = $$0.n();
      this.u = emc.b;
      this.v = hx.b;
      this.aE = cte.b;
      this.an = new agq(this);
      this.an.a(ao, (byte)0);
      this.an.a(aS, this.ch());
      this.an.a(aU, false);
      this.an.a(aT, Optional.empty());
      this.an.a(aV, false);
      this.an.a(aW, false);
      this.an.a(as, bna.a);
      this.an.a(aX, 0);
      this.c_();
      this.a_(0.0, 0.0, 0.0);
      this.bh = this.bg.c();
   }

   public boolean a(hx $$0, djp $$1) {
      emv $$2 = $$1.b(this.dL(), $$0, emh.a(this));
      emv $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return ems.c($$3, ems.a(this.cH()), emg.i);
   }

   public int j_() {
      eni $$0 = this.cg();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean P_() {
      return false;
   }

   public final void ag() {
      if (this.bP()) {
         this.bB();
      }

      if (this.bO()) {
         this.ac();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.aZ.e(new emc($$0, $$1, $$2));
   }

   public afh ah() {
      return this.aZ;
   }

   public bmc<?> ai() {
      return this.p;
   }

   @Override
   public int aj() {
      return this.q;
   }

   public void e(int $$0) {
      this.q = $$0;
   }

   public Set<String> ak() {
      return this.bd;
   }

   public boolean a(String $$0) {
      return this.bd.size() >= 1024 ? false : this.bd.add($$0);
   }

   public boolean b(String $$0) {
      return this.bd.remove($$0);
   }

   public void al() {
      this.a(blw.c.a);
      this.b(dnz.p);
   }

   public final void am() {
      this.a(blw.c.b);
   }

   protected abstract void c_();

   public agq an() {
      return this.an;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof blw ? ((blw)$$0).q == this.q : false;
   }

   @Override
   public int hashCode() {
      return this.q;
   }

   public void a(blw.c $$0) {
      this.b($$0);
   }

   public void ao() {
   }

   public void b(bna $$0) {
      this.an.b(as, $$0);
   }

   public bna ap() {
      return this.an.b(as);
   }

   public boolean c(bna $$0) {
      return this.ap() == $$0;
   }

   public boolean a(blw $$0, double $$1) {
      return this.dj().a((ir)$$0.dj(), $$1);
   }

   public boolean a(blw $$0, double $$1, double $$2) {
      double $$3 = $$0.dq() - this.dq();
      double $$4 = $$0.ds() - this.ds();
      double $$5 = $$0.dw() - this.dw();
      return aup.e($$3, $$5) < aup.k($$1) && aup.k($$4) < aup.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.r($$0 % 360.0F);
      this.s($$1 % 360.0F);
   }

   public final void b(emc $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.b(this.aq());
   }

   protected elx aq() {
      return this.bg.a(this.u);
   }

   protected void ar() {
      this.a_(this.u.c, this.u.d, this.u.e);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.s(this.dD() + $$2);
      this.r(this.dB() + $$3);
      this.s(aup.a(this.dD(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = aup.a(this.O, -90.0F, 90.0F);
      if (this.s != null) {
         this.s.j(this);
      }
   }

   public void l() {
      this.as();
   }

   public void as() {
      this.dL().af().a("entityBaseTick");
      this.bm = null;
      if (this.bO() && this.cZ().dG()) {
         this.ac();
      }

      if (this.J > 0) {
         this.J--;
      }

      this.X = this.Y;
      this.O = this.dD();
      this.N = this.dB();
      this.bI();
      if (this.bl()) {
         this.bm();
      }

      this.aB = this.aA;
      this.aA = false;
      this.bg();
      this.y();
      this.bf();
      if (this.dL().B) {
         this.aA();
      } else if (this.aM > 0) {
         if (this.aY()) {
            this.h(this.aM - 4);
            if (this.aM < 0) {
               this.aA();
            }
         } else {
            if (this.aM % 20 == 0 && !this.bn()) {
               this.a(this.dM().c(), 1.0F);
            }

            this.h(this.aM - 1);
         }

         if (this.cj() > 0) {
            this.k(0);
            this.dL().a(null, 1009, this.v, 1);
         }
      }

      if (this.bn()) {
         this.ay();
         this.ab *= 0.5F;
      }

      this.at();
      if (!this.dL().B) {
         this.a_(this.aM > 0);
      }

      this.am = false;
      this.dL().af().c();
   }

   public void a_(boolean $$0) {
      this.b(0, $$0 || this.bl);
   }

   public void at() {
      if (this.ds() < (double)(this.dL().J_() - 64)) {
         this.aB();
      }
   }

   public void au() {
      this.ba = this.bJ();
   }

   public void f(int $$0) {
      this.ba = $$0;
   }

   public int av() {
      return this.ba;
   }

   public boolean aw() {
      return this.ba > 0;
   }

   protected void L() {
      if (this.aw()) {
         this.ba--;
      }
   }

   public int ax() {
      return 0;
   }

   public void ay() {
      if (!this.aY()) {
         this.g(15);
         if (this.a(this.dM().d(), 4.0F)) {
            this.a(art.jL, 0.4F, 2.0F + this.ag.i() * 0.4F);
         }
      }
   }

   public void g(int $$0) {
      int $$1 = $$0 * 20;
      if (this instanceof bmo) {
         $$1 = cse.a((bmo)this, $$1);
      }

      if (this.aM < $$1) {
         this.h($$1);
      }
   }

   public void h(int $$0) {
      this.aM = $$0;
   }

   public int az() {
      return this.aM;
   }

   public void aA() {
      this.h(0);
   }

   protected void aB() {
      this.am();
   }

   public boolean g(double $$0, double $$1, double $$2) {
      return this.a(this.cH().d($$0, $$1, $$2));
   }

   private boolean a(elx $$0) {
      return this.dL().a(this, $$0) && !this.dL().d($$0);
   }

   public void c(boolean $$0) {
      this.aJ = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, emc $$1) {
      this.aJ = $$0;
      this.b($$0, $$1);
   }

   public boolean e(hx $$0) {
      return this.aD.isPresent() && this.aD.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable emc $$1) {
      if ($$0) {
         elx $$2 = this.cH();
         elx $$3 = new elx($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<hx> $$4 = this.t.g(this, $$3);
         if ($$4.isPresent() || this.bi) {
            this.aD = $$4;
         } else if ($$1 != null) {
            elx $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
            $$4 = this.t.g(this, $$5);
            this.aD = $$4;
         }

         this.bi = $$4.isEmpty();
      } else {
         this.bi = false;
         if (this.aD.isPresent()) {
            this.aD = Optional.empty();
         }
      }
   }

   public boolean aC() {
      return this.aJ;
   }

   public void a(bmu $$0, emc $$1) {
      if (this.af) {
         this.a_(this.dq() + $$1.c, this.ds() + $$1.d, this.dw() + $$1.e);
      } else {
         this.aC = this.bN();
         if ($$0 == bmu.c) {
            $$1 = this.d($$1);
            if ($$1.equals(emc.b)) {
               return;
            }
         }

         this.dL().af().a("move");
         if (this.U.g() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = emc.b;
            this.g(emc.b);
         }

         $$1 = this.a($$1, $$0);
         emc $$2 = this.a($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ab != 0.0F && $$3 >= 1.0) {
               ely $$4 = this.dL().a(new ctg(this.dj(), this.dj().e($$2), ctg.a.d, ctg.b.d, this));
               if ($$4.c() != ema.a.a) {
                  this.n();
               }
            }

            this.a_(this.dq() + $$2.c, this.ds() + $$2.d, this.dw() + $$2.e);
         }

         this.dL().af().c();
         this.dL().af().a("rest");
         boolean $$5 = !aup.b($$1.c, $$2.c);
         boolean $$6 = !aup.b($$1.e, $$2.e);
         this.P = $$5 || $$6;
         this.Q = $$1.d != $$2.d;
         this.R = this.Q && $$1.d < 0.0;
         if (this.P) {
            this.S = this.c($$2);
         } else {
            this.S = false;
         }

         this.a(this.R, $$2);
         hx $$7 = this.aH();
         djp $$8 = this.dL().a_($$7);
         this.a($$2.d, this.aC(), $$8, $$7);
         if (this.dG()) {
            this.dL().af().c();
         } else {
            if (this.P) {
               emc $$9 = this.do();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            cwy $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dL(), this);
            }

            if (this.aC()) {
               $$10.a(this.dL(), $$7, $$8, this);
            }

            blw.b $$11 = this.aW();
            if ($$11.a() && !this.bO()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.aa = this.aa + (float)($$2.f() * 0.6);
               hx $$15 = this.aJ();
               djp $$16 = this.dL().a_($$15);
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
                     this.aL = this.aM();
                  } else if (this.aZ()) {
                     this.aL = this.aM();
                     if ($$11.c()) {
                        this.aR();
                     }

                     if ($$11.b()) {
                        this.b(dnz.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aG();
               }
            }

            this.aD();
            float $$20 = this.aL();
            this.g(this.do().d((double)$$20, 1.0, (double)$$20));
            if (this.dL().c(this.cH().h(1.0E-6)).noneMatch($$0x -> $$0x.a(asi.aJ) || $$0x.a(cxa.H))) {
               if (this.aM <= 0) {
                  this.h(-this.dc());
               }

               if (this.aC && (this.aA || this.bb())) {
                  this.aE();
               }
            }

            if (this.bN() && (this.aA || this.bb())) {
               this.h(-this.dc());
            }

            this.dL().af().c();
         }
      }
   }

   private boolean c(djp $$0) {
      return $$0.a(asi.aO) || $$0.a(cxa.qP);
   }

   private boolean a(hx $$0, djp $$1, boolean $$2, boolean $$3, emc $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aC() || $$5 || this.bX() && $$4.d == 0.0 || this.cf()) && !this.bZ()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dL().a(dnz.P, this.dj(), dnz.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(emc $$0) {
      return false;
   }

   protected void aD() {
      try {
         this.aQ();
      } catch (Throwable var4) {
         o $$1 = o.a(var4, "Checking entity block collision");
         p $$2 = $$1.a("Entity being checked for collision");
         this.a($$2);
         throw new y($$1);
      }
   }

   protected void aE() {
      this.a(art.jQ, 0.7F, 1.6F + (this.ag.i() - this.ag.i()) * 0.4F);
   }

   public void aF() {
      if (!this.dL().B && this.aC) {
         this.aE();
      }

      this.aA();
   }

   protected void aG() {
      if (this.aT()) {
         this.aS();
         if (this.aW().b()) {
            this.b(dnz.x);
         }
      }
   }

   @Deprecated
   public hx aH() {
      return this.d(0.2F);
   }

   protected hx aI() {
      return this.d(0.500001F);
   }

   public hx aJ() {
      return this.d(1.0E-5F);
   }

   protected hx d(float $$0) {
      if (this.aD.isPresent()) {
         hx $$1 = this.aD.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            djp $$2 = this.dL().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(asi.S)) && !$$2.a(asi.L) && !($$2.b() instanceof czx) ? $$1.h(aup.a(this.u.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = aup.a(this.u.c);
         int $$4 = aup.a(this.u.d - (double)$$0);
         int $$5 = aup.a(this.u.e);
         return new hx($$3, $$4, $$5);
      }
   }

   protected float aK() {
      float $$0 = this.dL().a_(this.dl()).b().l();
      float $$1 = this.dL().a_(this.aI()).b().l();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aL() {
      djp $$0 = this.dL().a_(this.dl());
      float $$1 = $$0.b().k();
      if (!$$0.a(cxa.G) && !$$0.a(cxa.nd)) {
         return (double)$$1 == 1.0 ? this.dL().a_(this.aI()).b().k() : $$1;
      } else {
         return $$1;
      }
   }

   protected emc a(emc $$0, bmu $$1) {
      return $$0;
   }

   protected emc d(emc $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dL().X();
         if ($$1 != this.bf) {
            Arrays.fill(this.be, 0.0);
            this.bf = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(ic.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? emc.b : new emc($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(ic.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? emc.b : new emc(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(ic.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? emc.b : new emc(0.0, 0.0, $$4);
         } else {
            return emc.b;
         }
      }
   }

   private double a(ic.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = aup.a($$1 + this.be[$$2], -0.51, 0.51);
      $$1 = $$3 - this.be[$$2];
      this.be[$$2] = $$3;
      return $$1;
   }

   private emc a(emc $$0) {
      elx $$1 = this.cH();
      List<emv> $$2 = this.dL().c(this, $$1.b($$0));
      emc $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dL(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.aC() || $$5 && $$0.d < 0.0;
      if (this.dF() > 0.0F && $$7 && ($$4 || $$6)) {
         emc $$8 = a(this, new emc($$0.c, (double)this.dF(), $$0.e), $$1, this.dL(), $$2);
         emc $$9 = a(this, new emc(0.0, (double)this.dF(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dL(), $$2);
         if ($$9.d < (double)this.dF()) {
            emc $$10 = a(this, new emc($$0.c, 0.0, $$0.e), $$1.c($$9), this.dL(), $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new emc(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.dL(), $$2));
         }
      }

      return $$3;
   }

   public static emc a(@Nullable blw $$0, emc $$1, elx $$2, ctx $$3, List<emv> $$4) {
      Builder<emv> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      dlg $$6 = $$3.D_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.e($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static emc a(emc $$0, elx $$1, List<emv> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = ems.a(ic.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = ems.a(ic.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = ems.a(ic.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = ems.a(ic.a.c, $$1, $$2, $$5);
         }

         return new emc($$3, $$4, $$5);
      }
   }

   protected float aM() {
      return (float)((int)this.Z + 1);
   }

   protected ars aN() {
      return art.jU;
   }

   protected ars aO() {
      return art.jT;
   }

   protected ars aP() {
      return art.jT;
   }

   protected void aQ() {
      elx $$0 = this.cH();
      hx $$1 = hx.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      hx $$2 = hx.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dL().a($$1, $$2)) {
         hx.a $$3 = new hx.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bx()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  djp $$7 = this.dL().a_($$3);

                  try {
                     $$7.a(this.dL(), $$3, this);
                     this.a($$7);
                  } catch (Throwable var12) {
                     o $$9 = o.a(var12, "Colliding entity with block");
                     p $$10 = $$9.a("Block being collided with");
                     p.a($$10, this.dL(), $$3, $$7);
                     throw new y($$9);
                  }
               }
            }
         }
      }
   }

   protected void a(djp $$0) {
   }

   public void a(ih<dnz> $$0, @Nullable blw $$1) {
      this.dL().a($$1, $$0, this.u);
   }

   public void b(ih<dnz> $$0) {
      this.a($$0, this);
   }

   private void c(hx $$0, djp $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.s();
      }
   }

   protected void aR() {
      blw $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      emc $$2 = $$0.do();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected hx f(hx $$0) {
      hx $$1 = $$0.c();
      djp $$2 = this.dL().a_($$1);
      return !$$2.a(asi.bm) && !$$2.a(asi.bn) ? $$0 : $$1;
   }

   protected void a(djp $$0, djp $$1) {
      dek $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(djp $$0) {
      dek $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(hx $$0, djp $$1) {
      dek $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(djp $$0) {
      return $$0.a(asi.bl) && this.ah >= this.bk + 20;
   }

   private void s() {
      this.bj = this.bj * (float)Math.pow(0.997, (double)(this.ah - this.bk));
      this.bj = Math.min(1.0F, this.bj + 0.07F);
      float $$0 = 0.5F + this.bj * this.ag.i() * 1.2F;
      float $$1 = 0.1F + this.bj * 1.2F;
      this.a(art.E, $$1, $$0);
      this.bk = this.ah;
   }

   protected void e(float $$0) {
      this.a(this.aN(), $$0, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
   }

   protected void aS() {
   }

   protected boolean aT() {
      return false;
   }

   public void a(ars $$0, float $$1, float $$2) {
      if (!this.aU()) {
         this.dL().a(null, this.dq(), this.ds(), this.dw(), $$0, this.db(), $$1, $$2);
      }
   }

   public void a(ars $$0) {
      if (!this.aU()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean aU() {
      return this.an.b(aV);
   }

   public void d(boolean $$0) {
      this.an.b(aV, $$0);
   }

   public boolean aV() {
      return this.an.b(aW);
   }

   public void e(boolean $$0) {
      this.an.b(aW, $$0);
   }

   protected blw.b aW() {
      return blw.b.d;
   }

   public boolean aX() {
      return false;
   }

   protected void a(double $$0, boolean $$1, djp $$2, hx $$3) {
      if ($$1) {
         if (this.ab > 0.0F) {
            $$2.b().a(this.dL(), $$2, $$3, this, this.ab);
            this.dL().a(dnz.A, this.u, dnz.a.a(this, this.aD.<djp>map($$0x -> this.dL().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ab -= (float)$$0;
      }
   }

   public boolean aY() {
      return this.ai().d();
   }

   public boolean a(float $$0, float $$1, bkv $$2) {
      if (this.p.a(asl.o)) {
         return false;
      } else {
         if (this.bP()) {
            for (blw $$3 : this.cP()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean aZ() {
      return this.ai;
   }

   private boolean u() {
      hx $$0 = this.dl();
      return this.dL().r($$0) || this.dL().r(hx.a((double)$$0.u(), this.cH().e, (double)$$0.w()));
   }

   private boolean x() {
      return this.dL().a_(this.dl()).a(cxa.nd);
   }

   public boolean ba() {
      return this.aZ() || this.u();
   }

   public boolean bb() {
      return this.aZ() || this.u() || this.x();
   }

   public boolean bc() {
      return this.aZ() || this.x();
   }

   public boolean bd() {
      return this.bc() || this.bn();
   }

   public boolean be() {
      return this.ak && this.aZ();
   }

   public void bf() {
      if (this.bZ()) {
         this.h(this.bY() && this.aZ() && !this.bO());
      } else {
         this.h(this.bY() && this.be() && !this.bO() && this.dL().b_(this.v).a(asn.a));
      }
   }

   protected boolean bg() {
      this.aj.clear();
      this.bh();
      double $$0 = this.dL().E_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(asn.b, $$0);
      return this.aZ() || $$1;
   }

   void bh() {
      if (this.cZ() instanceof chk $$0 && !$$0.be()) {
         this.ai = false;
         return;
      }

      if (this.a(asn.a, 0.014)) {
         if (!this.ai && !this.am) {
            this.bi();
         }

         this.n();
         this.ai = true;
         this.aA();
      } else {
         this.ai = false;
      }
   }

   private void y() {
      this.ak = this.a(asn.a);
      this.aN.clear();
      double $$0 = this.du() - 0.11111111F;
      if (this.cZ() instanceof chk $$2 && !$$2.be() && $$2.cH().e >= $$0 && $$2.cH().b <= $$0) {
         return;
      }

      hx $$3 = hx.a(this.dq(), $$0, this.dw());
      eez $$4 = this.dL().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((ctd)this.dL(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aN::add);
      }
   }

   protected void bi() {
      blw $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      emc $$2 = $$0.do();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aO(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      } else {
         this.a(this.aP(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      }

      float $$4 = (float)aup.a(this.ds());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bg.a() * 20.0F; $$5++) {
         double $$6 = (this.ag.j() * 2.0 - 1.0) * (double)this.bg.a();
         double $$7 = (this.ag.j() * 2.0 - 1.0) * (double)this.bg.a();
         this.dL().a(jx.e, this.dq() + $$6, (double)($$4 + 1.0F), this.dw() + $$7, $$2.c, $$2.d - this.ag.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bg.a() * 20.0F; $$8++) {
         double $$9 = (this.ag.j() * 2.0 - 1.0) * (double)this.bg.a();
         double $$10 = (this.ag.j() * 2.0 - 1.0) * (double)this.bg.a();
         this.dL().a(jx.aj, this.dq() + $$9, (double)($$4 + 1.0F), this.dw() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.b(dnz.O);
   }

   @Deprecated
   protected djp bj() {
      return this.dL().a_(this.aH());
   }

   public djp bk() {
      return this.dL().a_(this.aJ());
   }

   public boolean bl() {
      return this.bY() && !this.aZ() && !this.P_() && !this.bX() && !this.bn() && this.bx();
   }

   protected void bm() {
      hx $$0 = this.aH();
      djp $$1 = this.dL().a_($$0);
      if ($$1.l() != ddd.a) {
         emc $$2 = this.do();
         hx $$3 = this.dl();
         double $$4 = this.dq() + (this.ag.j() - 0.5) * (double)this.bg.a();
         double $$5 = this.dw() + (this.ag.j() - 0.5) * (double)this.bg.a();
         if ($$3.u() != $$0.u()) {
            $$4 = aup.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = aup.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dL().a(new jp(jx.c, $$1), $$4, this.ds() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(asx<eey> $$0) {
      return this.aN.contains($$0);
   }

   public boolean bn() {
      return !this.am && this.aj.getDouble(asn.b) > 0.0;
   }

   public void a(float $$0, emc $$1) {
      emc $$2 = a($$1, $$0, this.dB());
      this.g(this.do().e($$2));
   }

   private static emc a(emc $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return emc.b;
      } else {
         emc $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = aup.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = aup.b($$2 * (float) (Math.PI / 180.0));
         return new emc($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bo() {
      return this.dL().f(this.dp(), this.dv()) ? this.dL().x(hx.a(this.dq(), this.du(), this.dw())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.r($$3 % 360.0F);
      this.s(aup.a($$4, -90.0F, 90.0F) % 360.0F);
      this.N = this.dB();
      this.O = this.dD();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = aup.a($$0, -3.0E7, 3.0E7);
      double $$4 = aup.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(emc $$0) {
      this.e($$0.c, $$0.d, $$0.e);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dB(), this.dD());
   }

   public void a(hx $$0, float $$1, float $$2) {
      this.b((double)$$0.u() + 0.5, (double)$$0.v(), (double)$$0.w() + 0.5, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.p($$0, $$1, $$2);
      this.r($$3);
      this.s($$4);
      this.bp();
      this.ar();
   }

   public final void bp() {
      double $$0 = this.dq();
      double $$1 = this.ds();
      double $$2 = this.dw();
      this.K = $$0;
      this.L = $$1;
      this.M = $$2;
      this.ac = $$0;
      this.ad = $$1;
      this.ae = $$2;
      this.N = this.dB();
      this.O = this.dD();
   }

   public float e(blw $$0) {
      float $$1 = (float)(this.dq() - $$0.dq());
      float $$2 = (float)(this.ds() - $$0.ds());
      float $$3 = (float)(this.dw() - $$0.dw());
      return aup.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dq() - $$0;
      double $$4 = this.ds() - $$1;
      double $$5 = this.dw() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double f(blw $$0) {
      return this.f($$0.dj());
   }

   public double f(emc $$0) {
      double $$1 = this.dq() - $$0.c;
      double $$2 = this.ds() - $$0.d;
      double $$3 = this.dw() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cfq $$0) {
   }

   public void g(blw $$0) {
      if (!this.x($$0)) {
         if (!$$0.af && !this.af) {
            double $$1 = $$0.dq() - this.dq();
            double $$2 = $$0.dw() - this.dw();
            double $$3 = aup.a($$1, $$2);
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
               if (!this.bP() && this.bu()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.bP() && $$0.bu()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void j(double $$0, double $$1, double $$2) {
      this.g(this.do().b($$0, $$1, $$2));
      this.au = true;
   }

   protected void bq() {
      this.T = true;
   }

   public boolean a(bkv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bq();
         return false;
      }
   }

   public final emc f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dD() : aup.i($$0, this.O, this.dD());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dB() : aup.i($$0, this.N, this.dB());
   }

   protected final emc b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = aup.b($$3);
      float $$5 = aup.a($$3);
      float $$6 = aup.b($$2);
      float $$7 = aup.a($$2);
      return new emc((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final emc i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final emc c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final emc br() {
      return new emc(this.dq(), this.du(), this.dw());
   }

   public final emc j(float $$0) {
      double $$1 = aup.d((double)$$0, this.K, this.dq());
      double $$2 = aup.d((double)$$0, this.L, this.ds()) + (double)this.cI();
      double $$3 = aup.d((double)$$0, this.M, this.dw());
      return new emc($$1, $$2, $$3);
   }

   public emc k(float $$0) {
      return this.j($$0);
   }

   public final emc l(float $$0) {
      double $$1 = aup.d((double)$$0, this.K, this.dq());
      double $$2 = aup.d((double)$$0, this.L, this.ds());
      double $$3 = aup.d((double)$$0, this.M, this.dw());
      return new emc($$1, $$2, $$3);
   }

   public ema a(double $$0, float $$1, boolean $$2) {
      emc $$3 = this.j($$1);
      emc $$4 = this.f($$1);
      emc $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dL().a(new ctg($$3, $$5, ctg.a.b, $$2 ? ctg.b.c : ctg.b.a, this));
   }

   public boolean bs() {
      return this.bx() && this.bt();
   }

   public boolean bt() {
      return false;
   }

   public boolean bu() {
      return false;
   }

   public void a(blw $$0, int $$1, bkv $$2) {
      if ($$0 instanceof anf) {
         am.d.a((anf)$$0, this, $$2);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.dq() - $$0;
      double $$4 = this.ds() - $$1;
      double $$5 = this.dw() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cH().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * o;
      return $$0 < $$1 * $$1;
   }

   public boolean d(so $$0) {
      if (this.aK != null && !this.aK.b()) {
         return false;
      } else {
         String $$1 = this.bw();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.f($$0);
            return true;
         }
      }
   }

   public boolean e(so $$0) {
      return this.bO() ? false : this.d($$0);
   }

   public so f(so $$0) {
      try {
         if (this.s != null) {
            $$0.a("Pos", this.a(this.s.dq(), this.ds(), this.s.dw()));
         } else {
            $$0.a("Pos", this.a(this.dq(), this.ds(), this.dw()));
         }

         emc $$1 = this.do();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dB(), this.dD()));
         $$0.a("FallDistance", this.ab);
         $$0.a("Fire", (short)this.aM);
         $$0.a("Air", (short)this.ci());
         $$0.a("OnGround", this.aC());
         $$0.a("Invulnerable", this.bb);
         $$0.a("PortalCooldown", this.ba);
         $$0.a("UUID", this.cw());
         vg $$2 = this.af();
         if ($$2 != null) {
            $$0.a("CustomName", vg.a.a($$2));
         }

         if (this.cB()) {
            $$0.a("CustomNameVisible", this.cB());
         }

         if (this.aU()) {
            $$0.a("Silent", this.aU());
         }

         if (this.aV()) {
            $$0.a("NoGravity", this.aV());
         }

         if (this.bc) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.cj();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.cj());
         }

         if (this.bl) {
            $$0.a("HasVisualFire", this.bl);
         }

         if (!this.bd.isEmpty()) {
            su $$4 = new su();

            for (String $$5 : this.bd) {
               $$4.add(tj.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bP()) {
            su $$6 = new su();

            for (blw $$7 : this.cP()) {
               so $$8 = new so();
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

   public void g(so $$0) {
      try {
         su $$1 = $$0.c("Pos", 6);
         su $$2 = $$0.c("Motion", 6);
         su $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(aup.a($$1.h(0), -3.0000512E7, 3.0000512E7), aup.a($$1.h(1), -2.0E7, 2.0E7), aup.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.r($$3.i(0));
         this.s($$3.i(1));
         this.bp();
         this.n(this.dB());
         this.o(this.dB());
         this.ab = $$0.j("FallDistance");
         this.aM = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.j($$0.g("Air"));
         }

         this.aJ = $$0.q("OnGround");
         this.bb = $$0.q("Invulnerable");
         this.ba = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.ay = $$0.a("UUID");
            this.az = this.ay.toString();
         }

         if (!Double.isFinite(this.dq()) || !Double.isFinite(this.ds()) || !Double.isFinite(this.dw())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dB()) && Double.isFinite((double)this.dD())) {
            this.ar();
            this.a(this.dB(), this.dD());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(vg.a.a($$8));
               } catch (Exception var16) {
                  c.warn("Failed to parse entity custom name {}", $$8, var16);
               }
            }

            this.n($$0.q("CustomNameVisible"));
            this.d($$0.q("Silent"));
            this.e($$0.q("NoGravity"));
            this.i($$0.q("Glowing"));
            this.k($$0.h("TicksFrozen"));
            this.bl = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.bd.clear();
               su $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.bd.add($$10.j($$12));
               }
            }

            this.a($$0);
            if (this.bv()) {
               this.ar();
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

   protected boolean bv() {
      return true;
   }

   @Nullable
   protected final String bw() {
      bmc<?> $$0 = this.ai();
      ahh $$1 = bmc.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(so var1);

   protected abstract void b(so var1);

   protected su a(double... $$0) {
      su $$1 = new su();

      for (double $$2 : $$0) {
         $$1.add(sp.a($$2));
      }

      return $$1;
   }

   protected su a(float... $$0) {
      su $$1 = new su();

      for (float $$2 : $$0) {
         $$1.add(sr.a($$2));
      }

      return $$1;
   }

   @Nullable
   public ccb a(ctw $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public ccb a(ctw $$0, int $$1) {
      return this.a(new cng($$0), (float)$$1);
   }

   @Nullable
   public ccb b(cng $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public ccb a(cng $$0, float $$1) {
      if ($$0.b()) {
         return null;
      } else if (this.dL().B) {
         return null;
      } else {
         ccb $$2 = new ccb(this.dL(), this.dq(), this.ds() + (double)$$1, this.dw(), $$0);
         $$2.u();
         this.dL().b($$2);
         return $$2;
      }
   }

   public boolean bx() {
      return !this.dG();
   }

   public boolean by() {
      if (this.af) {
         return false;
      } else {
         float $$0 = this.bg.a() * 0.8F;
         elx $$1 = elx.a(this.br(), (double)$$0, 1.0E-6, (double)$$0);
         return hx.a($$1)
            .anyMatch(
               $$1x -> {
                  djp $$2 = this.dL().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dL(), $$1x)
                     && ems.c($$2.k(this.dL(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), ems.a($$1), emg.i);
               }
            );
      }
   }

   public bkc a(cfq $$0, bkb $$1) {
      return bkc.d;
   }

   public boolean h(blw $$0) {
      return $$0.bz() && !this.x($$0);
   }

   public boolean bz() {
      return false;
   }

   public void t() {
      this.g(emc.b);
      this.l();
      if (this.bO()) {
         this.cZ().i(this);
      }
   }

   public final void i(blw $$0) {
      if (this.w($$0)) {
         this.a($$0, blw::a_);
      }
   }

   protected void a(blw $$0, blw.a $$1) {
      emc $$2 = this.l($$0);
      emc $$3 = $$0.k(this);
      $$1.accept($$0, $$2.c - $$3.c, $$2.d - $$3.d, $$2.e - $$3.e);
   }

   public void j(blw $$0) {
   }

   public emc k(blw $$0) {
      return this.bg.d().b(blx.b, 0, this.aG);
   }

   public emc l(blw $$0) {
      return this.dj().e(this.a($$0, this.bg, 1.0F));
   }

   protected emc a(blw $$0, blz $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static emc a(blw $$0, blw $$1, bly $$2) {
      int $$3 = $$0.cP().indexOf($$1);
      return $$2.c(blx.a, $$3, $$0.aG);
   }

   public boolean m(blw $$0) {
      return this.a($$0, false);
   }

   public boolean bA() {
      return this instanceof bmo;
   }

   public boolean a(blw $$0, boolean $$1) {
      if ($$0 == this.s) {
         return false;
      } else if (!$$0.bD()) {
         return false;
      } else {
         for (blw $$2 = $$0; $$2.s != null; $$2 = $$2.s) {
            if ($$2.s == this) {
               return false;
            }
         }

         if ($$1 || this.n($$0) && $$0.q(this)) {
            if (this.bO()) {
               this.ac();
            }

            this.b(bna.a);
            this.s = $$0;
            this.s.o(this);
            $$0.B().filter($$0x -> $$0x instanceof anf).forEach($$0x -> am.S.a((anf)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean n(blw $$0) {
      return !this.bS() && this.J <= 0;
   }

   public void bB() {
      for (int $$0 = this.r.size() - 1; $$0 >= 0; $$0--) {
         ((blw)this.r.get($$0)).ac();
      }
   }

   public void bC() {
      if (this.s != null) {
         blw $$0 = this.s;
         this.s = null;
         $$0.p(this);
      }
   }

   public void ac() {
      this.bC();
   }

   protected void o(blw $$0) {
      if ($$0.cZ() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.r.isEmpty()) {
            this.r = ImmutableList.of($$0);
         } else {
            List<blw> $$1 = Lists.newArrayList(this.r);
            if (!this.dL().B && $$0 instanceof cfq && !(this.cQ() instanceof cfq)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.r = ImmutableList.copyOf($$1);
         }

         this.a(dnz.s, $$0);
      }
   }

   protected void p(blw $$0) {
      if ($$0.cZ() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.r.size() == 1 && this.r.get(0) == $$0) {
            this.r = ImmutableList.of();
         } else {
            this.r = this.r.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(dnz.q, $$0);
      }
   }

   protected boolean q(blw $$0) {
      return this.r.isEmpty();
   }

   protected boolean bD() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public double p_() {
      return this.dq();
   }

   public double N_() {
      return this.ds();
   }

   public double O_() {
      return this.dw();
   }

   public float f_() {
      return this.dD();
   }

   public float q_() {
      return this.dB();
   }

   public void a(float $$0, int $$1) {
      this.n($$0);
   }

   public float bE() {
      return 0.0F;
   }

   public emc bF() {
      return this.b(this.dD(), this.dB());
   }

   public emc a(cnb $$0) {
      if (!(this instanceof cfq $$1)) {
         return emc.b;
      } else {
         boolean $$2 = $$1.eU().a($$0) && !$$1.eT().a($$0);
         bmi $$3 = $$2 ? $$1.fm().e() : $$1.fm();
         return this.b(0.0F, this.dB() + (float)($$3 == bmi.b ? 80 : -80)).a(0.5);
      }
   }

   public emb bG() {
      return new emb(this.dD(), this.dB());
   }

   public emc bH() {
      return emc.a(this.bG());
   }

   public void g(hx $$0) {
      if (this.aw()) {
         this.au();
      } else {
         if (!this.dL().B && !$$0.equals(this.ax)) {
            this.ax = $$0.i();
         }

         this.av = true;
      }
   }

   protected void bI() {
      if (this.dL() instanceof ane) {
         int $$0 = this.ax();
         ane $$1 = (ane)this.dL();
         if (this.av) {
            MinecraftServer $$2 = $$1.o();
            ahg<ctx> $$3 = this.dL().ae() == ctx.i ? ctx.h : ctx.i;
            ane $$4 = $$2.a($$3);
            if ($$4 != null && $$2.D() && !this.bO() && this.aw++ >= $$0) {
               this.dL().af().a("portal");
               this.aw = $$0;
               this.au();
               this.b($$4);
               this.dL().af().c();
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

         this.L();
      }
   }

   public int bJ() {
      return 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
   }

   public void c(bkv $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dar.a(this);
      }
   }

   public void m(float $$0) {
   }

   public Iterable<cng> bK() {
      return e;
   }

   public Iterable<cng> bL() {
      return e;
   }

   public Iterable<cng> bM() {
      return Iterables.concat(this.bK(), this.bL());
   }

   public void a(bmd $$0, cng $$1) {
   }

   public boolean bN() {
      boolean $$0 = this.dL() != null && this.dL().B;
      return !this.aY() && (this.aM > 0 || $$0 && this.i(0));
   }

   public boolean bO() {
      return this.cZ() != null;
   }

   public boolean bP() {
      return !this.r.isEmpty();
   }

   public boolean bQ() {
      return this.ai().a(asl.p);
   }

   public boolean bR() {
      return !this.ai().a(asl.q);
   }

   public void f(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean bS() {
      return this.i(1);
   }

   public boolean bT() {
      return this.bS();
   }

   public boolean bU() {
      return this.bS();
   }

   public boolean bV() {
      return this.bS();
   }

   public boolean bW() {
      return this.bS();
   }

   public boolean bX() {
      return this.c(bna.f);
   }

   public boolean bY() {
      return this.i(3);
   }

   public void g(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean bZ() {
      return this.i(4);
   }

   public boolean ca() {
      return this.c(bna.d);
   }

   public boolean cb() {
      return this.ca() && !this.aZ();
   }

   public void h(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cc() {
      return this.bc;
   }

   public final void i(boolean $$0) {
      this.bc = $$0;
      this.b(6, this.cd());
   }

   public boolean cd() {
      return this.dL().y_() ? this.i(6) : this.bc;
   }

   public boolean ce() {
      return this.i(5);
   }

   public boolean d(cfq $$0) {
      if ($$0.P_()) {
         return false;
      } else {
         eni $$1 = this.cg();
         return $$1 != null && $$0 != null && $$0.cg() == $$1 && $$1.i() ? false : this.ce();
      }
   }

   public boolean cf() {
      return false;
   }

   public void a(BiConsumer<dnw<?>, ane> $$0) {
   }

   @Nullable
   public enb cg() {
      return this.dL().K().e(this.cy());
   }

   public boolean r(blw $$0) {
      return this.a($$0.cg());
   }

   public boolean a(eni $$0) {
      return this.cg() != null ? this.cg().a($$0) : false;
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

   public int ch() {
      return 300;
   }

   public int ci() {
      return this.an.b(aS);
   }

   public void j(int $$0) {
      this.an.b(aS, $$0);
   }

   public int cj() {
      return this.an.b(aX);
   }

   public void k(int $$0) {
      this.an.b(aX, $$0);
   }

   public float ck() {
      int $$0 = this.cm();
      return (float)Math.min(this.cj(), $$0) / (float)$$0;
   }

   public boolean cl() {
      return this.cj() >= this.cm();
   }

   public int cm() {
      return 140;
   }

   public void a(ane $$0, bmn $$1) {
      this.h(this.aM + 1);
      if (this.aM == 0) {
         this.g(8);
      }

      this.a(this.dM().b(), 5.0F);
   }

   public void k(boolean $$0) {
      emc $$1 = this.do();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void l(boolean $$0) {
      emc $$1 = this.do();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(ane $$0, bmo $$1) {
      return true;
   }

   public void cn() {
      if (this.do().b() > -0.5 && this.ab > 1.0F) {
         this.ab = 1.0F;
      }
   }

   public void n() {
      this.ab = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      hx $$3 = hx.a($$0, $$1, $$2);
      emc $$4 = new emc($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      hx.a $$5 = new hx.a();
      ic $$6 = ic.b;
      double $$7 = Double.MAX_VALUE;

      for (ic $$8 : new ic[]{ic.c, ic.d, ic.e, ic.f, ic.b}) {
         $$5.a($$3, $$8);
         if (!this.dL().a_($$5).r(this.dL(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == ic.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ag.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      emc $$13 = this.do().a(0.75);
      if ($$6.o() == ic.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == ic.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == ic.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(djp $$0, emc $$1) {
      this.n();
      this.U = $$1;
   }

   private static vg c(vg $$0) {
      vu $$1 = $$0.e().b($$0.a().a(null));

      for (vg $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public vg ad() {
      vg $$0 = this.af();
      return $$0 != null ? c($$0) : this.co();
   }

   protected vg co() {
      return this.p.h();
   }

   public boolean s(blw $$0) {
      return this == $$0;
   }

   public float cp() {
      return 0.0F;
   }

   public void n(float $$0) {
   }

   public void o(float $$0) {
   }

   public boolean cq() {
      return true;
   }

   public boolean t(blw $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dL() == null ? "~NULL~" : this.dL().toString();
      return this.aK != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.ad().getString(),
            this.q,
            $$0,
            this.dq(),
            this.ds(),
            this.dw(),
            this.aK
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.ad().getString(),
            this.q,
            $$0,
            this.dq(),
            this.ds(),
            this.dw()
         );
   }

   public boolean b(bkv $$0) {
      return this.dG() || this.bb && !$$0.a(ask.e) && !$$0.g() || $$0.a(ask.j) && this.aY() || $$0.a(ask.n) && this.ai().a(asl.o);
   }

   public boolean cr() {
      return this.bb;
   }

   public void m(boolean $$0) {
      this.bb = $$0;
   }

   public void u(blw $$0) {
      this.b($$0.dq(), $$0.ds(), $$0.dw(), $$0.dB(), $$0.dD());
   }

   public void v(blw $$0) {
      so $$1 = $$0.f(new so());
      $$1.r("Dimension");
      this.g($$1);
      this.ba = $$0.ba;
      this.ax = $$0.ax;
   }

   @Nullable
   public blw b(ane $$0) {
      if (this.dL() instanceof ane && !this.dG()) {
         this.dL().af().a("changeDimension");
         this.ag();
         this.dL().af().a("reposition");
         efw $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dL().af().b("reloading");
            blw $$2 = this.ai().a((ctx)$$0);
            if ($$2 != null) {
               $$2.v(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dD());
               $$2.g($$1.b);
               $$0.d($$2);
               if ($$0.ae() == ctx.j) {
                  ane.a($$0);
               }
            }

            this.cs();
            this.dL().af().c();
            ((ane)this.dL()).h();
            $$0.h();
            this.dL().af().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void cs() {
      this.b(blw.c.e);
   }

   @Nullable
   protected efw a(ane $$0) {
      boolean $$1 = this.dL().ae() == ctx.j && $$0.ae() == ctx.h;
      boolean $$2 = $$0.ae() == ctx.j;
      if (!$$1 && !$$2) {
         boolean $$5 = $$0.ae() == ctx.i;
         if (this.dL().ae() != ctx.i && !$$5) {
            return null;
         } else {
            dlg $$6 = $$0.D_();
            double $$7 = dmy.a(this.dL().E_(), $$0.E_());
            hx $$8 = $$6.b(this.dq() * $$7, this.ds(), this.dw() * $$7);
            return this.a($$0, $$8, $$5, $$6).map($$1x -> {
               djp $$2x = this.dL().a_(this.ax);
               ic.a $$3;
               emc $$5x;
               if ($$2x.b(dkf.H)) {
                  $$3 = $$2x.c(dkf.H);
                  l.a $$4 = l.a(this.ax, $$3, 21, ic.a.b, 21, $$1xx -> this.dL().a_($$1xx) == $$2x);
                  $$5x = this.a($$3, $$4);
               } else {
                  $$3 = ic.a.a;
                  $$5x = new emc(0.5, 0.0, 0.0);
               }

               return efx.a($$0, $$1x, $$3, $$5x, this, this.do(), this.dB(), this.dD());
            }).orElse(null);
         }
      } else {
         hx $$3;
         if ($$2) {
            $$3 = ane.a;
         } else {
            $$3 = $$0.a(doy.a.f, $$0.T());
         }

         return new efw(new emc((double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5), this.do(), this.dB(), this.dD());
      }
   }

   protected emc a(ic.a $$0, l.a $$1) {
      return efx.a($$1, $$0, this.dj(), this.a(this.ap()));
   }

   protected Optional<l.a> a(ane $$0, hx $$1, boolean $$2, dlg $$3) {
      return $$0.p().a($$1, $$2, $$3);
   }

   public boolean ct() {
      return !this.bO() && !this.bP();
   }

   public float a(ctp $$0, ctd $$1, hx $$2, djp $$3, eez $$4, float $$5) {
      return $$5;
   }

   public boolean a(ctp $$0, ctd $$1, hx $$2, djp $$3, float $$4) {
      return true;
   }

   public int cu() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bmc.a(this.ai()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.q);
      $$0.a("Entity Name", () -> this.ad().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dq(), this.ds(), this.dw()));
      $$0.a("Entity's Block location", p.a(this.dL(), aup.a(this.dq()), aup.a(this.ds()), aup.a(this.dw())));
      emc $$1 = this.do();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", () -> this.cP().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.cZ()));
   }

   public boolean cv() {
      return this.bN() && !this.P_();
   }

   public void a_(UUID $$0) {
      this.ay = $$0;
      this.az = this.ay.toString();
   }

   @Override
   public UUID cw() {
      return this.ay;
   }

   public String cx() {
      return this.az;
   }

   @Override
   public String cy() {
      return this.az;
   }

   public boolean cz() {
      return true;
   }

   public static double cA() {
      return o;
   }

   public static void b(double $$0) {
      o = $$0;
   }

   @Override
   public vg Q_() {
      return enb.a(this.cg(), this.ad()).a($$0 -> $$0.a(this.cG()).a(this.cx()));
   }

   public void b(@Nullable vg $$0) {
      this.an.b(aT, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public vg af() {
      return this.an.b(aT).orElse(null);
   }

   @Override
   public boolean ae() {
      return this.an.b(aT).isPresent();
   }

   public void n(boolean $$0) {
      this.an.b(aU, $$0);
   }

   public boolean cB() {
      return this.an.b(aU);
   }

   public final void n(double $$0, double $$1, double $$2) {
      if (this.dL() instanceof ane) {
         cte $$3 = new cte(hx.a($$0, $$1, $$2));
         ((ane)this.dL()).l().a(anj.g, $$3, 0, this.aj());
         this.dL().d($$3.e, $$3.f);
         this.c($$0, $$1, $$2);
      }
   }

   public boolean a(ane $$0, double $$1, double $$2, double $$3, Set<bnc> $$4, float $$5, float $$6) {
      float $$7 = aup.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dL()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.z();
         this.n($$5);
      } else {
         this.ag();
         blw $$8 = this.ai().a((ctx)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.v(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(blw.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dL() instanceof ane) {
         this.b($$0, $$1, $$2, this.dB(), this.dD());
         this.z();
      }
   }

   private void z() {
      this.cR().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.r.iterator();

         while (var1.hasNext()) {
            blw $$1 = (blw)var1.next();
            $$0.a($$1, blw::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.dq() + $$0, this.ds() + $$1, this.dw() + $$2);
   }

   public boolean cC() {
      return this.cB();
   }

   public void b(List<agq.b<?>> $$0) {
   }

   public void a(agn<?> $$0) {
      if (as.equals($$0)) {
         this.k_();
      }
   }

   @Deprecated
   protected void cD() {
      bna $$0 = this.ap();
      blz $$1 = this.a($$0);
      this.bg = $$1;
      this.bh = $$1.c();
   }

   public void k_() {
      blz $$0 = this.bg;
      bna $$1 = this.ap();
      blz $$2 = this.a($$1);
      this.bg = $$2;
      this.bh = $$2.c();
      this.ar();
      boolean $$3 = (double)$$2.a() <= 4.0 && (double)$$2.b() <= 4.0;
      if (!this.dL().B && !this.am && !this.af && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cfq)) {
         emc $$4 = this.dj().b(0.0, (double)$$0.b() / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a() - $$0.a()) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b() - $$0.b()) + 1.0E-6;
         emv $$7 = ems.a(elx.a($$4, $$5, $$6, $$5));
         this.dL().a(this, $$7, $$4, (double)$$2.a(), (double)$$2.b(), (double)$$2.a()).ifPresent($$1x -> this.b($$1x.b(0.0, (double)(-$$2.b()) / 2.0, 0.0)));
      }
   }

   public ic cE() {
      return ic.a((double)this.dB());
   }

   public ic cF() {
      return this.cE();
   }

   protected vm cG() {
      return new vm(vm.a.c, new vm.b(this.ai(), this.cw(), this.ad()));
   }

   public boolean a(anf $$0) {
      return true;
   }

   @Override
   public final elx cH() {
      return this.aI;
   }

   public elx i_() {
      return this.cH();
   }

   public final void b(elx $$0) {
      this.aI = $$0;
   }

   public final float d(bna $$0) {
      return this.a($$0).c();
   }

   public final float cI() {
      return this.bh;
   }

   public emc p(float $$0) {
      return this.cJ();
   }

   protected emc cJ() {
      return new emc(0.0, (double)this.cI(), (double)(this.dg() * 0.4F));
   }

   public bng a_(int $$0) {
      return bng.b;
   }

   @Override
   public void a(vg $$0) {
   }

   public ctx cK() {
      return this.dL();
   }

   @Nullable
   public MinecraftServer cL() {
      return this.dL().o();
   }

   public bkc a(cfq $$0, emc $$1, bkb $$2) {
      return bkc.d;
   }

   public boolean a(ctp $$0) {
      return false;
   }

   public void a(bmo $$0, blw $$1) {
      if ($$1 instanceof bmo) {
         crt.a((bmo)$$1, $$0);
      }

      crt.b($$0, $$1);
   }

   public void c(anf $$0) {
   }

   public void d(anf $$0) {
   }

   public float a(ddk $$0) {
      float $$1 = aup.g(this.dB());
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

   public float a(dbu $$0) {
      float $$1 = aup.g(this.dB());
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

   public void a(cgi $$0) {
   }

   @Nullable
   public bmo cN() {
      return null;
   }

   public final boolean cO() {
      return this.cN() != null;
   }

   public final List<blw> cP() {
      return this.r;
   }

   @Nullable
   public blw cQ() {
      return this.r.isEmpty() ? null : (blw)this.r.get(0);
   }

   public boolean w(blw $$0) {
      return this.r.contains($$0);
   }

   public boolean a(Predicate<blw> $$0) {
      UnmodifiableIterator var2 = this.r.iterator();

      while (var2.hasNext()) {
         blw $$1 = (blw)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<blw> B() {
      return this.r.stream().flatMap(blw::cR);
   }

   @Override
   public Stream<blw> cR() {
      return Stream.concat(Stream.of(this), this.B());
   }

   @Override
   public Stream<blw> cS() {
      return Stream.concat(this.r.stream().flatMap(blw::cS), Stream.of(this));
   }

   public Iterable<blw> cT() {
      return () -> this.B().iterator();
   }

   public int cU() {
      return (int)this.B().filter($$0 -> $$0 instanceof cfq).count();
   }

   public boolean cV() {
      return this.cU() == 1;
   }

   public blw cW() {
      blw $$0 = this;

      while ($$0.bO()) {
         $$0 = $$0.cZ();
      }

      return $$0;
   }

   public boolean x(blw $$0) {
      return this.cW() == $$0.cW();
   }

   public boolean y(blw $$0) {
      if (!$$0.bO()) {
         return false;
      } else {
         blw $$1 = $$0.cZ();
         return $$1 == this ? true : this.y($$1);
      }
   }

   public boolean cX() {
      return this.cN() instanceof cfq $$0 ? $$0.g() : this.cY();
   }

   public boolean cY() {
      return !this.dL().B;
   }

   protected static emc a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -aup.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = aup.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new emc((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public emc b(bmo $$0) {
      return new emc(this.dq(), this.cH().e, this.dw());
   }

   @Nullable
   public blw cZ() {
      return this.s;
   }

   @Nullable
   public blw da() {
      return this.s != null && this.s.cN() == this ? this.s : null;
   }

   public efe s_() {
      return efe.a;
   }

   public aru db() {
      return aru.g;
   }

   protected int dc() {
      return 1;
   }

   public ds dd() {
      return new ds(
         this, this.dj(), this.bG(), this.dL() instanceof ane ? (ane)this.dL() : null, this.F(), this.ad().getString(), this.Q_(), this.dL().o(), this
      );
   }

   protected int F() {
      return 0;
   }

   public boolean l(int $$0) {
      return this.F() >= $$0;
   }

   @Override
   public boolean l_() {
      return this.dL().Z().b(ctt.p);
   }

   @Override
   public boolean x_() {
      return true;
   }

   @Override
   public boolean W_() {
      return true;
   }

   public void a(ee.a $$0, emc $$1) {
      emc $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.s(aup.g((float)(-(aup.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.r(aup.g((float)(aup.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dB());
      this.O = this.dD();
      this.N = this.dB();
   }

   public boolean a(asx<eey> $$0, double $$1) {
      if (this.de()) {
         return false;
      } else {
         elx $$2 = this.cH().h(0.001);
         int $$3 = aup.a($$2.a);
         int $$4 = aup.c($$2.d);
         int $$5 = aup.a($$2.b);
         int $$6 = aup.c($$2.e);
         int $$7 = aup.a($$2.c);
         int $$8 = aup.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cz();
         boolean $$11 = false;
         emc $$12 = emc.b;
         int $$13 = 0;
         hx.a $$14 = new hx.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  eez $$18 = this.dL().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((ctd)this.dL(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           emc $$20 = $$18.c(this.dL(), $$14);
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

            if (!(this instanceof cfq)) {
               $$12 = $$12.d();
            }

            emc $$21 = this.do();
            $$12 = $$12.a($$1 * 1.0);
            double $$22 = 0.003;
            if (Math.abs($$21.c) < 0.003 && Math.abs($$21.e) < 0.003 && $$12.f() < 0.0045000000000000005) {
               $$12 = $$12.d().a(0.0045000000000000005);
            }

            this.g(this.do().e($$12));
         }

         this.aj.put($$0, $$9);
         return $$11;
      }
   }

   public boolean de() {
      elx $$0 = this.cH().g(1.0);
      int $$1 = aup.a($$0.a);
      int $$2 = aup.c($$0.d);
      int $$3 = aup.a($$0.c);
      int $$4 = aup.c($$0.f);
      return !this.dL().b($$1, $$3, $$2, $$4);
   }

   public double b(asx<eey> $$0) {
      return this.aj.getDouble($$0);
   }

   public double df() {
      return (double)this.cI() < 0.4 ? 0.0 : 0.4;
   }

   public final float dg() {
      return this.bg.a();
   }

   public final float dh() {
      return this.bg.b();
   }

   public xg<zb> di() {
      return new zc(this);
   }

   public blz a(bna $$0) {
      return this.p.n();
   }

   public emc dj() {
      return this.u;
   }

   public emc dk() {
      return this.dj();
   }

   @Override
   public hx dl() {
      return this.v;
   }

   public djp dm() {
      if (this.bm == null) {
         this.bm = this.dL().a_(this.dl());
      }

      return this.bm;
   }

   public cte dn() {
      return this.aE;
   }

   public emc do() {
      return this.aF;
   }

   public void g(emc $$0) {
      this.aF = $$0;
   }

   public void h(emc $$0) {
      this.g(this.do().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.g(new emc($$0, $$1, $$2));
   }

   public final int dp() {
      return this.v.u();
   }

   public final double dq() {
      return this.u.c;
   }

   public double c(double $$0) {
      return this.u.c + (double)this.dg() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ag.j() - 1.0) * $$0);
   }

   public final int dr() {
      return this.v.v();
   }

   public final double ds() {
      return this.u.d;
   }

   public double e(double $$0) {
      return this.u.d + (double)this.dh() * $$0;
   }

   public double dt() {
      return this.e(this.ag.j());
   }

   public double du() {
      return this.u.d + (double)this.bh;
   }

   public final int dv() {
      return this.v.w();
   }

   public final double dw() {
      return this.u.e;
   }

   public double f(double $$0) {
      return this.u.e + (double)this.dg() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ag.j() - 1.0) * $$0);
   }

   public final void p(double $$0, double $$1, double $$2) {
      if (this.u.c != $$0 || this.u.d != $$1 || this.u.e != $$2) {
         this.u = new emc($$0, $$1, $$2);
         int $$3 = aup.a($$0);
         int $$4 = aup.a($$1);
         int $$5 = aup.a($$2);
         if ($$3 != this.v.u() || $$4 != this.v.v() || $$5 != this.v.w()) {
            this.v = new hx($$3, $$4, $$5);
            this.bm = null;
            if (iz.a($$3) != this.aE.e || iz.a($$5) != this.aE.f) {
               this.aE = new cte(this.v);
            }
         }

         this.aY.a();
      }
   }

   public void dx() {
   }

   public emc q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bh * 0.7, 0.0);
   }

   public void a(zc $$0) {
      int $$1 = $$0.a();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      double $$4 = $$0.h();
      this.f($$2, $$3, $$4);
      this.e($$2, $$3, $$4);
      this.s($$0.l());
      this.r($$0.m());
      this.e($$1);
      this.a_($$0.d());
   }

   @Nullable
   public cng dy() {
      return null;
   }

   public void o(boolean $$0) {
      this.aA = $$0;
   }

   public boolean dz() {
      return !this.ai().a(asl.k);
   }

   public boolean dA() {
      return (this.aA || this.aB) && this.dz();
   }

   public float dB() {
      return this.aG;
   }

   public float dC() {
      return this.dB();
   }

   public void r(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aG = $$0;
      }
   }

   public float dD() {
      return this.aH;
   }

   public void s(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aH = $$0;
      }
   }

   public boolean dE() {
      return false;
   }

   public float dF() {
      return 0.0F;
   }

   public final boolean dG() {
      return this.aK != null;
   }

   @Nullable
   public blw.c dH() {
      return this.aK;
   }

   @Override
   public final void b(blw.c $$0) {
      if (this.aK == null) {
         this.aK = $$0;
      }

      if (this.aK.a()) {
         this.ac();
      }

      this.cP().forEach(blw::ac);
      this.aY.a($$0);
   }

   protected void dI() {
      this.aK = null;
   }

   @Override
   public void a(dnh $$0) {
      this.aY = $$0;
   }

   @Override
   public boolean dJ() {
      if (this.aK != null && !this.aK.b()) {
         return false;
      } else {
         return this.bO() ? false : !this.bP() || !this.cV();
      }
   }

   @Override
   public boolean dK() {
      return false;
   }

   public boolean a(ctx $$0, hx $$1) {
      return true;
   }

   public ctx dL() {
      return this.t;
   }

   protected void a(ctx $$0) {
      this.t = $$0;
   }

   public bkw dM() {
      return this.dL().ai();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = aup.d($$6, this.dq(), $$1);
      double $$8 = aup.d($$6, this.ds(), $$2);
      double $$9 = aup.d($$6, this.dw(), $$3);
      float $$10 = (float)aup.e($$6, (double)this.dB(), $$4);
      float $$11 = (float)aup.d($$6, (double)this.dD(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   @FunctionalInterface
   public interface a {
      void accept(blw var1, double var2, double var4, double var6);
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
