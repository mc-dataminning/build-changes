import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import java.util.Arrays;
import java.util.Comparator;
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

public abstract class bsu implements akn, bqz, dwc, eo, ewu {
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
   private static final evm d = new evm(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double e = 0.014;
   private static final double k = 0.007;
   private static final double l = 0.0023333333333333335;
   public static final String I = "UUID";
   private static double m = 1.0;
   private final bta<?> n;
   private int o = c.incrementAndGet();
   public boolean J;
   private ImmutableList<bsu> p = ImmutableList.of();
   protected int K;
   @Nullable
   private bsu q;
   private dby r;
   public double L;
   public double M;
   public double N;
   private evr s;
   private iz t;
   private dbf u;
   private evr v = evr.b;
   private float aF;
   private float aG;
   public float O;
   public float P;
   private evm aH = d;
   private boolean aI;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   public boolean U;
   protected evr V = evr.b;
   @Nullable
   private bsu.c aJ;
   public static final float W = 0.6F;
   public static final float X = 1.8F;
   public float Y;
   public float Z;
   public float aa;
   public float ab;
   public float ac;
   private float aK = 1.0F;
   public double ad;
   public double ae;
   public double af;
   public boolean ag;
   protected final azh ah = azh.a();
   public int ai;
   private int aL = -this.df();
   protected boolean aj;
   protected Object2DoubleMap<axf<enu>> ak = new Object2DoubleArrayMap(2);
   protected boolean al;
   private final Set<axf<enu>> aM = new HashSet<>();
   public int am;
   protected boolean an = true;
   protected final ako ao;
   protected static final akk<Byte> ap = ako.a(bsu.class, akm.a);
   protected static final int aq = 0;
   private static final int aN = 1;
   private static final int aO = 3;
   private static final int aP = 4;
   private static final int aQ = 5;
   protected static final int ar = 6;
   protected static final int as = 7;
   private static final akk<Integer> aR = ako.a(bsu.class, akm.b);
   private static final akk<Optional<xp>> aS = ako.a(bsu.class, akm.g);
   private static final akk<Boolean> aT = ako.a(bsu.class, akm.k);
   private static final akk<Boolean> aU = ako.a(bsu.class, akm.k);
   private static final akk<Boolean> aV = ako.a(bsu.class, akm.k);
   protected static final akk<bub> at = ako.a(bsu.class, akm.w);
   private static final akk<Integer> aW = ako.a(bsu.class, akm.b);
   private dwd aX = dwd.a;
   private final aiu aY = new aiu();
   public boolean au;
   public boolean av;
   private int aZ;
   protected boolean aw;
   protected int ax;
   protected iz ay;
   private boolean ba;
   protected UUID az = ayz.a(this.ah);
   protected String aA = this.az.toString();
   private boolean bb;
   private final Set<String> bc = Sets.newHashSet();
   private final double[] bd = new double[]{0.0, 0.0, 0.0};
   private long be;
   private bsx bf;
   private float bg;
   public boolean aB;
   public boolean aC;
   public boolean aD;
   public Optional<iz> aE = Optional.empty();
   private boolean bh = false;
   private float bi;
   private int bj;
   private boolean bk;
   @Nullable
   private dsc bl = null;

   public bsu(bta<?> $$0, dby $$1) {
      this.n = $$0;
      this.r = $$1;
      this.bf = $$0.n();
      this.s = evr.b;
      this.t = iz.c;
      this.u = dbf.b;
      ako.a $$2 = new ako.a(this);
      $$2.a(ap, (byte)0);
      $$2.a(aR, this.ck());
      $$2.a(aT, false);
      $$2.a(aS, Optional.empty());
      $$2.a(aU, false);
      $$2.a(aV, false);
      $$2.a(at, bub.a);
      $$2.a(aW, 0);
      this.a($$2);
      this.ao = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.bg = this.bf.c();
   }

   public boolean a(iz $$0, dsc $$1) {
      ewk $$2 = $$1.b(this.dP(), $$0, evw.a(this));
      ewk $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return ewh.c($$3, ewh.a(this.cK()), evv.i);
   }

   public int i_() {
      ewx $$0 = this.cj();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean N_() {
      return false;
   }

   public final void ai() {
      if (this.bS()) {
         this.bH();
      }

      if (this.bR()) {
         this.ac();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.aY.e(new evr($$0, $$1, $$2));
   }

   public aiu aj() {
      return this.aY;
   }

   public bta<?> ak() {
      return this.n;
   }

   @Override
   public int al() {
      return this.o;
   }

   public void e(int $$0) {
      this.o = $$0;
   }

   public Set<String> am() {
      return this.bc;
   }

   public boolean a(String $$0) {
      return this.bc.size() >= 1024 ? false : this.bc.add($$0);
   }

   public boolean b(String $$0) {
      return this.bc.remove($$0);
   }

   public void an() {
      this.a(bsu.c.a);
      this.a(dwv.p);
   }

   public final void ao() {
      this.a(bsu.c.b);
   }

   protected abstract void a(ako.a var1);

   public ako ap() {
      return this.ao;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bsu ? ((bsu)$$0).o == this.o : false;
   }

   @Override
   public int hashCode() {
      return this.o;
   }

   public void a(bsu.c $$0) {
      this.b($$0);
   }

   public void aq() {
   }

   public void b(bub $$0) {
      this.ao.a(at, $$0);
   }

   public bub ar() {
      return this.ao.a(at);
   }

   public boolean c(bub $$0) {
      return this.ar() == $$0;
   }

   public boolean a(bsu $$0, double $$1) {
      return this.dn().a((js)$$0.dn(), $$1);
   }

   public boolean a(bsu $$0, double $$1, double $$2) {
      double $$3 = $$0.du() - this.du();
      double $$4 = $$0.dw() - this.dw();
      double $$5 = $$0.dA() - this.dA();
      return ayz.e($$3, $$5) < ayz.k($$1) && ayz.k($$4) < ayz.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.r($$0 % 360.0F);
      this.s($$1 % 360.0F);
   }

   public final void b(evr $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.as());
   }

   protected evm as() {
      return this.bf.a(this.s);
   }

   protected void at() {
      this.a_(this.s.c, this.s.d, this.s.e);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.s(this.dH() + $$2);
      this.r(this.dF() + $$3);
      this.s(ayz.a(this.dH(), -90.0F, 90.0F));
      this.P += $$2;
      this.O += $$3;
      this.P = ayz.a(this.P, -90.0F, 90.0F);
      if (this.q != null) {
         this.q.k(this);
      }
   }

   public void l() {
      this.au();
   }

   public void au() {
      this.dP().ag().a("entityBaseTick");
      this.bl = null;
      if (this.bR() && this.dc().dK()) {
         this.ac();
      }

      if (this.K > 0) {
         this.K--;
      }

      this.Y = this.Z;
      this.P = this.dH();
      this.O = this.dF();
      this.bO();
      if (this.bq()) {
         this.br();
      }

      this.aC = this.aB;
      this.aB = false;
      this.bl();
      this.z();
      this.bk();
      if (this.dP().B) {
         this.aC();
      } else if (this.aL > 0) {
         if (this.bd()) {
            this.i(this.aL - 4);
            if (this.aL < 0) {
               this.aC();
            }
         } else {
            if (this.aL % 20 == 0 && !this.bs()) {
               this.a(this.dQ().c(), 1.0F);
            }

            this.i(this.aL - 1);
         }

         if (this.cm() > 0) {
            this.l(0);
            this.dP().a(null, 1009, this.t, 1);
         }
      }

      if (this.bs()) {
         this.aA();
         this.ac *= 0.5F;
      }

      this.av();
      if (!this.dP().B) {
         this.c(this.aL > 0);
      }

      this.an = false;
      this.dP().ag().c();
   }

   public void c(boolean $$0) {
      this.b(0, $$0 || this.bk);
   }

   public void av() {
      if (this.dw() < (double)(this.dP().I_() - 64)) {
         this.aD();
      }
   }

   public void aw() {
      this.aZ = this.bP();
   }

   public void f(int $$0) {
      this.aZ = $$0;
   }

   public int ax() {
      return this.aZ;
   }

   public boolean ay() {
      return this.aZ > 0;
   }

   protected void L() {
      if (this.ay()) {
         this.aZ--;
      }
   }

   public int az() {
      return 0;
   }

   public void aA() {
      if (!this.bd()) {
         this.g(15);
         if (this.a(this.dQ().d(), 4.0F)) {
            this.a(awa.ka, 0.4F, 2.0F + this.ah.i() * 0.4F);
         }
      }
   }

   public final void g(int $$0) {
      this.h($$0 * 20);
   }

   public void h(int $$0) {
      if (this.aL < $$0) {
         this.i($$0);
      }
   }

   public void i(int $$0) {
      this.aL = $$0;
   }

   public int aB() {
      return this.aL;
   }

   public void aC() {
      this.i(0);
   }

   protected void aD() {
      this.ao();
   }

   public boolean g(double $$0, double $$1, double $$2) {
      return this.b(this.cK().d($$0, $$1, $$2));
   }

   private boolean b(evm $$0) {
      return this.dP().a(this, $$0) && !this.dP().d($$0);
   }

   public void d(boolean $$0) {
      this.aI = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, evr $$1) {
      this.aI = $$0;
      this.b($$0, $$1);
   }

   public boolean e(iz $$0) {
      return this.aE.isPresent() && this.aE.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable evr $$1) {
      if ($$0) {
         evm $$2 = this.cK();
         evm $$3 = new evm($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<iz> $$4 = this.r.g(this, $$3);
         if ($$4.isPresent() || this.bh) {
            this.aE = $$4;
         } else if ($$1 != null) {
            evm $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
            $$4 = this.r.g(this, $$5);
            this.aE = $$4;
         }

         this.bh = $$4.isEmpty();
      } else {
         this.bh = false;
         if (this.aE.isPresent()) {
            this.aE = Optional.empty();
         }
      }
   }

   public boolean aE() {
      return this.aI;
   }

   public void a(btu $$0, evr $$1) {
      if (this.ag) {
         this.a_(this.du() + $$1.c, this.dw() + $$1.d, this.dA() + $$1.e);
      } else {
         this.aD = this.bQ();
         if ($$0 == btu.c) {
            $$1 = this.d($$1);
            if ($$1.equals(evr.b)) {
               return;
            }
         }

         this.dP().ag().a("move");
         if (this.V.g() > 1.0E-7) {
            $$1 = $$1.h(this.V);
            this.V = evr.b;
            this.h(evr.b);
         }

         $$1 = this.a($$1, $$0);
         evr $$2 = this.a($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ac != 0.0F && $$3 >= 1.0) {
               evn $$4 = this.dP().a(new dbh(this.dn(), this.dn().e($$2), dbh.a.d, dbh.b.d, this));
               if ($$4.c() != evp.a.a) {
                  this.n();
               }
            }

            this.a_(this.du() + $$2.c, this.dw() + $$2.d, this.dA() + $$2.e);
         }

         this.dP().ag().c();
         this.dP().ag().a("rest");
         boolean $$5 = !ayz.b($$1.c, $$2.c);
         boolean $$6 = !ayz.b($$1.e, $$2.e);
         this.Q = $$5 || $$6;
         this.R = $$1.d != $$2.d;
         this.S = this.R && $$1.d < 0.0;
         if (this.Q) {
            this.T = this.c($$2);
         } else {
            this.T = false;
         }

         this.a(this.S, $$2);
         iz $$7 = this.aJ();
         dsc $$8 = this.dP().a_($$7);
         this.a($$2.d, this.aE(), $$8, $$7);
         if (this.dK()) {
            this.dP().ag().c();
         } else {
            if (this.Q) {
               evr $$9 = this.ds();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            dez $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dP(), this);
            }

            if (this.aE()) {
               $$10.a(this.dP(), $$7, $$8, this);
            }

            bsu.b $$11 = this.bb();
            if ($$11.a() && !this.bR()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.ab = this.ab + (float)($$2.f() * 0.6);
               iz $$15 = this.aL();
               dsc $$16 = this.dP().a_($$15);
               boolean $$17 = this.c($$16);
               if (!$$17) {
                  $$13 = 0.0;
               }

               this.Z = this.Z + (float)$$2.h() * 0.6F;
               this.aa = this.aa + (float)Math.sqrt($$12 * $$12 + $$13 * $$13 + $$14 * $$14) * 0.6F;
               if (this.aa > this.aK && !$$16.i()) {
                  boolean $$18 = $$15.equals($$7);
                  boolean $$19 = this.a($$7, $$8, $$11.c(), $$18, $$1);
                  if (!$$18) {
                     $$19 |= this.a($$15, $$16, false, $$11.b(), $$1);
                  }

                  if ($$19) {
                     this.aK = this.aO();
                  } else if (this.be()) {
                     this.aK = this.aO();
                     if ($$11.c()) {
                        this.aT();
                     }

                     if ($$11.b()) {
                        this.a(dwv.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aI();
               }
            }

            this.aF();
            float $$20 = this.aN();
            this.h(this.ds().d((double)$$20, 1.0, (double)$$20));
            if (this.dP().c(this.cK().h(1.0E-6)).noneMatch($$0x -> $$0x.a(awp.aK) || $$0x.a(dfb.H))) {
               if (this.aL <= 0) {
                  this.i(-this.df());
               }

               if (this.aD && (this.aB || this.bg())) {
                  this.aG();
               }
            }

            if (this.bQ() && (this.aB || this.bg())) {
               this.i(-this.df());
            }

            this.dP().ag().c();
         }
      }
   }

   private boolean c(dsc $$0) {
      return $$0.a(awp.aP) || $$0.a(dfb.qP);
   }

   private boolean a(iz $$0, dsc $$1, boolean $$2, boolean $$3, evr $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aE() || $$5 || this.ca() && $$4.d == 0.0 || this.ci()) && !this.cc()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dP().a(dwv.P, this.dn(), dwv.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(evr $$0) {
      return false;
   }

   protected void aF() {
      try {
         this.aS();
      } catch (Throwable var4) {
         o $$1 = o.a(var4, "Checking entity block collision");
         p $$2 = $$1.a("Entity being checked for collision");
         this.a($$2);
         throw new y($$1);
      }
   }

   protected void aG() {
      this.a(awa.kf, 0.7F, 1.6F + (this.ah.i() - this.ah.i()) * 0.4F);
   }

   public void aH() {
      if (!this.dP().B && this.aD) {
         this.aG();
      }

      this.aC();
   }

   protected void aI() {
      if (this.aV()) {
         this.aU();
         if (this.bb().b()) {
            this.a(dwv.x);
         }
      }
   }

   @Deprecated
   public iz aJ() {
      return this.d(0.2F);
   }

   protected iz aK() {
      return this.d(0.500001F);
   }

   public iz aL() {
      return this.d(1.0E-5F);
   }

   protected iz d(float $$0) {
      if (this.aE.isPresent()) {
         iz $$1 = this.aE.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dsc $$2 = this.dP().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(awp.S)) && !$$2.a(awp.L) && !($$2.b() instanceof dhy) ? $$1.h(ayz.a(this.s.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = ayz.a(this.s.c);
         int $$4 = ayz.a(this.s.d - (double)$$0);
         int $$5 = ayz.a(this.s.e);
         return new iz($$3, $$4, $$5);
      }
   }

   protected float aM() {
      float $$0 = this.dP().a_(this.dp()).b().k();
      float $$1 = this.dP().a_(this.aK()).b().k();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aN() {
      dsc $$0 = this.dP().a_(this.dp());
      float $$1 = $$0.b().j();
      if (!$$0.a(dfb.G) && !$$0.a(dfb.nd)) {
         return (double)$$1 == 1.0 ? this.dP().a_(this.aK()).b().j() : $$1;
      } else {
         return $$1;
      }
   }

   protected evr a(evr $$0, btu $$1) {
      return $$0;
   }

   protected evr d(evr $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dP().Z();
         if ($$1 != this.be) {
            Arrays.fill(this.bd, 0.0);
            this.be = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(je.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? evr.b : new evr($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(je.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? evr.b : new evr(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(je.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? evr.b : new evr(0.0, 0.0, $$4);
         } else {
            return evr.b;
         }
      }
   }

   private double a(je.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = ayz.a($$1 + this.bd[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bd[$$2];
      this.bd[$$2] = $$3;
      return $$1;
   }

   private evr a(evr $$0) {
      evm $$1 = this.cK();
      List<ewk> $$2 = this.dP().c(this, $$1.b($$0));
      evr $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dP(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.aE() || $$5 && $$0.d < 0.0;
      if (this.dJ() > 0.0F && $$7 && ($$4 || $$6)) {
         evr $$8 = a(this, new evr($$0.c, (double)this.dJ(), $$0.e), $$1, this.dP(), $$2);
         evr $$9 = a(this, new evr(0.0, (double)this.dJ(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dP(), $$2);
         if ($$9.d < (double)this.dJ()) {
            evr $$10 = a(this, new evr($$0.c, 0.0, $$0.e), $$1.c($$9), this.dP(), $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new evr(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.dP(), $$2));
         }
      }

      return $$3;
   }

   public static evr a(@Nullable bsu $$0, evr $$1, evm $$2, dby $$3, List<ewk> $$4) {
      Builder<ewk> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      dtt $$6 = $$3.C_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.e($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static evr a(evr $$0, evm $$1, List<ewk> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = ewh.a(je.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = ewh.a(je.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = ewh.a(je.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = ewh.a(je.a.c, $$1, $$2, $$5);
         }

         return new evr($$3, $$4, $$5);
      }
   }

   protected float aO() {
      return (float)((int)this.aa + 1);
   }

   protected avz aP() {
      return awa.kj;
   }

   protected avz aQ() {
      return awa.ki;
   }

   protected avz aR() {
      return awa.ki;
   }

   protected void aS() {
      evm $$0 = this.cK();
      iz $$1 = iz.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      iz $$2 = iz.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dP().a($$1, $$2)) {
         iz.a $$3 = new iz.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bD()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  dsc $$7 = this.dP().a_($$3);

                  try {
                     $$7.a(this.dP(), $$3, this);
                     this.a($$7);
                  } catch (Throwable var12) {
                     o $$9 = o.a(var12, "Colliding entity with block");
                     p $$10 = $$9.a("Block being collided with");
                     p.a($$10, this.dP(), $$3, $$7);
                     throw new y($$9);
                  }
               }
            }
         }
      }
   }

   protected void a(dsc $$0) {
   }

   public void a(ji<dwv> $$0, @Nullable bsu $$1) {
      this.dP().a($$1, $$0, this.s);
   }

   public void a(ji<dwv> $$0) {
      this.a($$0, this);
   }

   private void c(iz $$0, dsc $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.v();
      }
   }

   protected void aT() {
      bsu $$0 = Objects.requireNonNullElse(this.cQ(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      evr $$2 = $$0.ds();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected iz f(iz $$0) {
      iz $$1 = $$0.c();
      dsc $$2 = this.dP().a_($$1);
      return !$$2.a(awp.bn) && !$$2.a(awp.bo) ? $$0 : $$1;
   }

   protected void a(dsc $$0, dsc $$1) {
      dmm $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dsc $$0) {
      dmm $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(iz $$0, dsc $$1) {
      dmm $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dsc $$0) {
      return $$0.a(awp.bm) && this.ai >= this.bj + 20;
   }

   private void v() {
      this.bi = this.bi * (float)Math.pow(0.997, (double)(this.ai - this.bj));
      this.bi = Math.min(1.0F, this.bi + 0.07F);
      float $$0 = 0.5F + this.bi * this.ah.i() * 1.2F;
      float $$1 = 0.1F + this.bi * 1.2F;
      this.a(awa.E, $$1, $$0);
      this.bj = this.ai;
   }

   protected void e(float $$0) {
      this.a(this.aP(), $$0, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
   }

   protected void aU() {
   }

   protected boolean aV() {
      return false;
   }

   public void a(avz $$0, float $$1, float $$2) {
      if (!this.aW()) {
         this.dP().a(null, this.du(), this.dw(), this.dA(), $$0, this.de(), $$1, $$2);
      }
   }

   public void a(avz $$0) {
      if (!this.aW()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean aW() {
      return this.ao.a(aU);
   }

   public void e(boolean $$0) {
      this.ao.a(aU, $$0);
   }

   public boolean aX() {
      return this.ao.a(aV);
   }

   public void f(boolean $$0) {
      this.ao.a(aV, $$0);
   }

   protected double aY() {
      return 0.0;
   }

   public final double aZ() {
      return this.aX() ? 0.0 : this.aY();
   }

   protected void ba() {
      double $$0 = this.aZ();
      if ($$0 != 0.0) {
         this.h(this.ds().b(0.0, -$$0, 0.0));
      }
   }

   protected bsu.b bb() {
      return bsu.b.d;
   }

   public boolean bc() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dsc $$2, iz $$3) {
      if ($$1) {
         if (this.ac > 0.0F) {
            $$2.b().a(this.dP(), $$2, $$3, this, this.ac);
            this.dP().a(dwv.A, this.s, dwv.a.a(this, this.aE.<dsc>map($$0x -> this.dP().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ac -= (float)$$0;
      }
   }

   public boolean bd() {
      return this.ak().d();
   }

   public boolean a(float $$0, float $$1, brn $$2) {
      if (this.n.a(awt.o)) {
         return false;
      } else {
         if (this.bS()) {
            for (bsu $$3 : this.cS()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean be() {
      return this.aj;
   }

   private boolean w() {
      iz $$0 = this.dp();
      return this.dP().r($$0) || this.dP().r(iz.a((double)$$0.u(), this.cK().e, (double)$$0.w()));
   }

   private boolean x() {
      return this.dq().a(dfb.nd);
   }

   public boolean bf() {
      return this.be() || this.w();
   }

   public boolean bg() {
      return this.be() || this.w() || this.x();
   }

   public boolean bh() {
      return this.be() || this.x();
   }

   public boolean bi() {
      return this.bh() || this.bs();
   }

   public boolean bj() {
      return this.al && this.be();
   }

   public void bk() {
      if (this.cc()) {
         this.i(this.cb() && this.be() && !this.bR());
      } else {
         this.i(this.cb() && this.bj() && !this.bR() && this.dP().b_(this.t).a(awv.a));
      }
   }

   protected boolean bl() {
      this.ak.clear();
      this.bm();
      double $$0 = this.dP().D_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(awv.b, $$0);
      return this.be() || $$1;
   }

   void bm() {
      if (this.dc() instanceof cov $$0 && !$$0.bj()) {
         this.aj = false;
         return;
      }

      if (this.a(awv.a, 0.014)) {
         if (!this.aj && !this.an) {
            this.bn();
         }

         this.n();
         this.aj = true;
         this.aC();
      } else {
         this.aj = false;
      }
   }

   private void z() {
      this.al = this.a(awv.a);
      this.aM.clear();
      double $$0 = this.dy();
      if (this.dc() instanceof cov $$2 && !$$2.bj() && $$2.cK().e >= $$0 && $$2.cK().b <= $$0) {
         return;
      }

      iz $$3 = iz.a(this.du(), $$0, this.dA());
      env $$4 = this.dP().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((dbe)this.dP(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aM::add);
      }
   }

   protected void bn() {
      bsu $$0 = Objects.requireNonNullElse(this.cQ(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      evr $$2 = $$0.ds();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aQ(), $$3, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
      } else {
         this.a(this.aR(), $$3, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
      }

      float $$4 = (float)ayz.a(this.dw());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bf.a() * 20.0F; $$5++) {
         double $$6 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         double $$7 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         this.dP().a(li.d, this.du() + $$6, (double)($$4 + 1.0F), this.dA() + $$7, $$2.c, $$2.d - this.ah.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bf.a() * 20.0F; $$8++) {
         double $$9 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         double $$10 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         this.dP().a(li.am, this.du() + $$9, (double)($$4 + 1.0F), this.dA() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(dwv.O);
   }

   @Deprecated
   protected dsc bo() {
      return this.dP().a_(this.aJ());
   }

   public dsc bp() {
      return this.dP().a_(this.aL());
   }

   public boolean bq() {
      return this.cb() && !this.be() && !this.N_() && !this.ca() && !this.bs() && this.bD();
   }

   protected void br() {
      iz $$0 = this.aJ();
      dsc $$1 = this.dP().a_($$0);
      if ($$1.l() != dlf.a) {
         evr $$2 = this.ds();
         iz $$3 = this.dp();
         double $$4 = this.du() + (this.ah.j() - 0.5) * (double)this.bf.a();
         double $$5 = this.dA() + (this.ah.j() - 0.5) * (double)this.bf.a();
         if ($$3.u() != $$0.u()) {
            $$4 = ayz.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = ayz.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dP().a(new la(li.b, $$1), $$4, this.dw() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(axf<enu> $$0) {
      return this.aM.contains($$0);
   }

   public boolean bs() {
      return !this.an && this.ak.getDouble(awv.b) > 0.0;
   }

   public void a(float $$0, evr $$1) {
      evr $$2 = a($$1, $$0, this.dF());
      this.h(this.ds().e($$2));
   }

   private static evr a(evr $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return evr.b;
      } else {
         evr $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = ayz.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = ayz.b($$2 * (float) (Math.PI / 180.0));
         return new evr($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bt() {
      return this.dP().f(this.dt(), this.dz()) ? this.dP().x(iz.a(this.du(), this.dy(), this.dA())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.r($$3 % 360.0F);
      this.s(ayz.a($$4, -90.0F, 90.0F) % 360.0F);
      this.O = this.dF();
      this.P = this.dH();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = ayz.a($$0, -3.0E7, 3.0E7);
      double $$4 = ayz.a($$2, -3.0E7, 3.0E7);
      this.L = $$3;
      this.M = $$1;
      this.N = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(evr $$0) {
      this.e($$0.c, $$0.d, $$0.e);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dF(), this.dH());
   }

   public void a(iz $$0, float $$1, float $$2) {
      this.b((double)$$0.u() + 0.5, (double)$$0.v(), (double)$$0.w() + 0.5, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.p($$0, $$1, $$2);
      this.r($$3);
      this.s($$4);
      this.bu();
      this.at();
   }

   public final void bu() {
      double $$0 = this.du();
      double $$1 = this.dw();
      double $$2 = this.dA();
      this.L = $$0;
      this.M = $$1;
      this.N = $$2;
      this.ad = $$0;
      this.ae = $$1;
      this.af = $$2;
      this.O = this.dF();
      this.P = this.dH();
   }

   public float f(bsu $$0) {
      float $$1 = (float)(this.du() - $$0.du());
      float $$2 = (float)(this.dw() - $$0.dw());
      float $$3 = (float)(this.dA() - $$0.dA());
      return ayz.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.du() - $$0;
      double $$4 = this.dw() - $$1;
      double $$5 = this.dA() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(bsu $$0) {
      return this.f($$0.dn());
   }

   public double f(evr $$0) {
      double $$1 = this.du() - $$0.c;
      double $$2 = this.dw() - $$0.d;
      double $$3 = this.dA() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cmx $$0) {
   }

   public void h(bsu $$0) {
      if (!this.y($$0)) {
         if (!$$0.ag && !this.ag) {
            double $$1 = $$0.du() - this.du();
            double $$2 = $$0.dA() - this.dA();
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
               if (!this.bS() && this.bA()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.bS() && $$0.bA()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void j(double $$0, double $$1, double $$2) {
      this.h(this.ds().b($$0, $$1, $$2));
      this.av = true;
   }

   protected void bv() {
      this.U = true;
   }

   public boolean a(brn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bv();
         return false;
      }
   }

   public final evr f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public je bw() {
      return je.a(this.f(1.0F));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dH() : ayz.i($$0, this.P, this.dH());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dF() : ayz.i($$0, this.O, this.dF());
   }

   public final evr b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = ayz.b($$3);
      float $$5 = ayz.a($$3);
      float $$6 = ayz.b($$2);
      float $$7 = ayz.a($$2);
      return new evr((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final evr i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final evr c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final evr bx() {
      return new evr(this.du(), this.dy(), this.dA());
   }

   public final evr j(float $$0) {
      double $$1 = ayz.d((double)$$0, this.L, this.du());
      double $$2 = ayz.d((double)$$0, this.M, this.dw()) + (double)this.cL();
      double $$3 = ayz.d((double)$$0, this.N, this.dA());
      return new evr($$1, $$2, $$3);
   }

   public evr k(float $$0) {
      return this.j($$0);
   }

   public final evr l(float $$0) {
      double $$1 = ayz.d((double)$$0, this.L, this.du());
      double $$2 = ayz.d((double)$$0, this.M, this.dw());
      double $$3 = ayz.d((double)$$0, this.N, this.dA());
      return new evr($$1, $$2, $$3);
   }

   public evp a(double $$0, float $$1, boolean $$2) {
      evr $$3 = this.j($$1);
      evr $$4 = this.f($$1);
      evr $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dP().a(new dbh($$3, $$5, dbh.a.b, $$2 ? dbh.b.c : dbh.b.a, this));
   }

   public boolean by() {
      return this.bD() && this.bz();
   }

   public boolean bz() {
      return false;
   }

   public boolean bA() {
      return false;
   }

   public void a(bsu $$0, int $$1, brn $$2) {
      if ($$0 instanceof arg) {
         am.d.a((arg)$$0, this, $$2);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.du() - $$0;
      double $$4 = this.dw() - $$1;
      double $$5 = this.dA() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cK().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * m;
      return $$0 < $$1 * $$1;
   }

   public boolean d(us $$0) {
      if (this.aJ != null && !this.aJ.b()) {
         return false;
      } else {
         String $$1 = this.bC();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.f($$0);
            return true;
         }
      }
   }

   public boolean e(us $$0) {
      return this.bR() ? false : this.d($$0);
   }

   public us f(us $$0) {
      try {
         if (this.q != null) {
            $$0.a("Pos", this.a(this.q.du(), this.dw(), this.q.dA()));
         } else {
            $$0.a("Pos", this.a(this.du(), this.dw(), this.dA()));
         }

         evr $$1 = this.ds();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dF(), this.dH()));
         $$0.a("FallDistance", this.ac);
         $$0.a("Fire", (short)this.aL);
         $$0.a("Air", (short)this.cl());
         $$0.a("OnGround", this.aE());
         $$0.a("Invulnerable", this.ba);
         $$0.a("PortalCooldown", this.aZ);
         $$0.a("UUID", this.cz());
         xp $$2 = this.ah();
         if ($$2 != null) {
            $$0.a("CustomName", xp.a.a($$2, this.dR()));
         }

         if (this.cE()) {
            $$0.a("CustomNameVisible", this.cE());
         }

         if (this.aW()) {
            $$0.a("Silent", this.aW());
         }

         if (this.aX()) {
            $$0.a("NoGravity", this.aX());
         }

         if (this.bb) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.cm();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.cm());
         }

         if (this.bk) {
            $$0.a("HasVisualFire", this.bk);
         }

         if (!this.bc.isEmpty()) {
            uy $$4 = new uy();

            for (String $$5 : this.bc) {
               $$4.add(vn.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bS()) {
            uy $$6 = new uy();

            for (bsu $$7 : this.cS()) {
               us $$8 = new us();
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

   public void g(us $$0) {
      try {
         uy $$1 = $$0.c("Pos", 6);
         uy $$2 = $$0.c("Motion", 6);
         uy $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(ayz.a($$1.h(0), -3.0000512E7, 3.0000512E7), ayz.a($$1.h(1), -2.0E7, 2.0E7), ayz.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.r($$3.i(0));
         this.s($$3.i(1));
         this.bu();
         this.n(this.dF());
         this.o(this.dF());
         this.ac = $$0.j("FallDistance");
         this.aL = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.k($$0.g("Air"));
         }

         this.aI = $$0.q("OnGround");
         this.ba = $$0.q("Invulnerable");
         this.aZ = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.az = $$0.a("UUID");
            this.aA = this.az.toString();
         }

         if (!Double.isFinite(this.du()) || !Double.isFinite(this.dw()) || !Double.isFinite(this.dA())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dF()) && Double.isFinite((double)this.dH())) {
            this.at();
            this.a(this.dF(), this.dH());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(xp.a.a($$8, this.dR()));
               } catch (Exception var16) {
                  b.warn("Failed to parse entity custom name {}", $$8, var16);
               }
            }

            this.o($$0.q("CustomNameVisible"));
            this.e($$0.q("Silent"));
            this.f($$0.q("NoGravity"));
            this.j($$0.q("Glowing"));
            this.l($$0.h("TicksFrozen"));
            this.bk = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.bc.clear();
               uy $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.bc.add($$10.j($$12));
               }
            }

            this.a($$0);
            if (this.bB()) {
               this.at();
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

   protected boolean bB() {
      return true;
   }

   @Nullable
   protected final String bC() {
      bta<?> $$0 = this.ak();
      alf $$1 = bta.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(us var1);

   protected abstract void b(us var1);

   protected uy a(double... $$0) {
      uy $$1 = new uy();

      for (double $$2 : $$0) {
         $$1.add(ut.a($$2));
      }

      return $$1;
   }

   protected uy a(float... $$0) {
      uy $$1 = new uy();

      for (float $$2 : $$0) {
         $$1.add(uv.a($$2));
      }

      return $$1;
   }

   @Nullable
   public cjh a(dbx $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public cjh a(dbx $$0, int $$1) {
      return this.a(new cup($$0), (float)$$1);
   }

   @Nullable
   public cjh b(cup $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public cjh a(cup $$0, float $$1) {
      if ($$0.e()) {
         return null;
      } else if (this.dP().B) {
         return null;
      } else {
         cjh $$2 = new cjh(this.dP(), this.du(), this.dw() + (double)$$1, this.dA(), $$0);
         $$2.v();
         this.dP().b($$2);
         return $$2;
      }
   }

   public boolean bD() {
      return !this.dK();
   }

   public boolean bE() {
      if (this.ag) {
         return false;
      } else {
         float $$0 = this.bf.a() * 0.8F;
         evm $$1 = evm.a(this.bx(), (double)$$0, 1.0E-6, (double)$$0);
         return iz.a($$1)
            .anyMatch(
               $$1x -> {
                  dsc $$2 = this.dP().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dP(), $$1x)
                     && ewh.c($$2.k(this.dP(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), ewh.a($$1), evv.i);
               }
            );
      }
   }

   public bqu a(cmx $$0, bqt $$1) {
      return bqu.e;
   }

   public boolean i(bsu $$0) {
      return $$0.bF() && !this.y($$0);
   }

   public boolean bF() {
      return false;
   }

   public void t() {
      this.h(evr.b);
      this.l();
      if (this.bR()) {
         this.dc().j(this);
      }
   }

   public final void j(bsu $$0) {
      if (this.x($$0)) {
         this.a($$0, bsu::a_);
      }
   }

   protected void a(bsu $$0, bsu.a $$1) {
      evr $$2 = this.m($$0);
      evr $$3 = $$0.l(this);
      $$1.accept($$0, $$2.c - $$3.c, $$2.d - $$3.d, $$2.e - $$3.e);
   }

   public void k(bsu $$0) {
   }

   public evr l(bsu $$0) {
      return this.dm().b(bsv.b, 0, this.aF);
   }

   public evr m(bsu $$0) {
      return this.dn().e(this.a($$0, this.bf, 1.0F));
   }

   protected evr a(bsu $$0, bsx $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static evr a(bsu $$0, bsu $$1, bsw $$2) {
      int $$3 = $$0.cS().indexOf($$1);
      return $$2.c(bsv.a, $$3, $$0.aF);
   }

   public boolean n(bsu $$0) {
      return this.a($$0, false);
   }

   public boolean bG() {
      return this instanceof btp;
   }

   public boolean a(bsu $$0, boolean $$1) {
      if ($$0 == this.q) {
         return false;
      } else if (!$$0.bJ()) {
         return false;
      } else {
         for (bsu $$2 = $$0; $$2.q != null; $$2 = $$2.q) {
            if ($$2.q == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bR()) {
               this.ac();
            }

            this.b(bub.a);
            this.q = $$0;
            this.q.p(this);
            $$0.G().filter($$0x -> $$0x instanceof arg).forEach($$0x -> am.U.a((arg)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bsu $$0) {
      return !this.bV() && this.K <= 0;
   }

   public void bH() {
      for (int $$0 = this.p.size() - 1; $$0 >= 0; $$0--) {
         ((bsu)this.p.get($$0)).ac();
      }
   }

   public void bI() {
      if (this.q != null) {
         bsu $$0 = this.q;
         this.q = null;
         $$0.q(this);
      }
   }

   public void ac() {
      this.bI();
   }

   protected void p(bsu $$0) {
      if ($$0.dc() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.p.isEmpty()) {
            this.p = ImmutableList.of($$0);
         } else {
            List<bsu> $$1 = Lists.newArrayList(this.p);
            if (!this.dP().B && $$0 instanceof cmx && !(this.cT() instanceof cmx)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.p = ImmutableList.copyOf($$1);
         }

         this.a(dwv.s, $$0);
      }
   }

   protected void q(bsu $$0) {
      if ($$0.dc() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.p.size() == 1 && this.p.get(0) == $$0) {
            this.p = ImmutableList.of();
         } else {
            this.p = this.p.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.K = 60;
         this.a(dwv.q, $$0);
      }
   }

   protected boolean r(bsu $$0) {
      return this.p.isEmpty();
   }

   protected boolean bJ() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public double c_() {
      return this.du();
   }

   public double d_() {
      return this.dw();
   }

   public double L_() {
      return this.dA();
   }

   public float M_() {
      return this.dH();
   }

   public float e_() {
      return this.dF();
   }

   public void a(float $$0, int $$1) {
      this.n($$0);
   }

   public float bK() {
      return 0.0F;
   }

   public evr bL() {
      return this.b(this.dH(), this.dF());
   }

   public evr a(cuk $$0) {
      if (!(this instanceof cmx $$1)) {
         return evr.b;
      } else {
         boolean $$2 = $$1.eY().a($$0) && !$$1.eX().a($$0);
         btj $$3 = $$2 ? $$1.fu().e() : $$1.fu();
         return this.b(0.0F, this.dF() + (float)($$3 == btj.b ? 80 : -80)).a(0.5);
      }
   }

   public evq bM() {
      return new evq(this.dH(), this.dF());
   }

   public evr bN() {
      return evr.a(this.bM());
   }

   public void g(iz $$0) {
      if (this.ay()) {
         this.aw();
      } else {
         if (!this.dP().B && !$$0.equals(this.ay)) {
            this.ay = $$0.i();
         }

         this.aw = true;
      }
   }

   protected void bO() {
      if (this.dP() instanceof arf) {
         int $$0 = this.az();
         arf $$1 = (arf)this.dP();
         if (this.aw) {
            MinecraftServer $$2 = $$1.o();
            ale<dby> $$3 = this.dP().af() == dby.i ? dby.h : dby.i;
            arf $$4 = $$2.a($$3);
            if ($$4 != null && $$2.G() && !this.bR() && this.ax++ >= $$0) {
               this.dP().ag().a("portal");
               this.ax = $$0;
               this.aw();
               this.b($$4);
               this.dP().ag().c();
            }

            this.aw = false;
         } else {
            if (this.ax > 0) {
               this.ax -= 4;
            }

            if (this.ax < 0) {
               this.ax = 0;
            }
         }

         this.L();
      }
   }

   public int bP() {
      return 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
   }

   public void c(brn $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dit.a(this);
      }
   }

   public void m(float $$0) {
   }

   public boolean bQ() {
      boolean $$0 = this.dP() != null && this.dP().B;
      return !this.bd() && (this.aL > 0 || $$0 && this.j(0));
   }

   public boolean bR() {
      return this.dc() != null;
   }

   public boolean bS() {
      return !this.p.isEmpty();
   }

   public boolean bT() {
      return this.ak().a(awt.p);
   }

   public boolean bU() {
      return !this.ak().a(awt.q);
   }

   public void g(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean bV() {
      return this.j(1);
   }

   public boolean bW() {
      return this.bV();
   }

   public boolean bX() {
      return this.bV();
   }

   public boolean bY() {
      return this.bV();
   }

   public boolean bZ() {
      return this.bV();
   }

   public boolean ca() {
      return this.c(bub.f);
   }

   public boolean cb() {
      return this.j(3);
   }

   public void h(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean cc() {
      return this.j(4);
   }

   public boolean cd() {
      return this.c(bub.d);
   }

   public boolean ce() {
      return this.cd() && !this.be();
   }

   public void i(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cf() {
      return this.bb;
   }

   public final void j(boolean $$0) {
      this.bb = $$0;
      this.b(6, this.cg());
   }

   public boolean cg() {
      return this.dP().x_() ? this.j(6) : this.bb;
   }

   public boolean ch() {
      return this.j(5);
   }

   public boolean d(cmx $$0) {
      if ($$0.N_()) {
         return false;
      } else {
         ewx $$1 = this.cj();
         return $$1 != null && $$0 != null && $$0.cj() == $$1 && $$1.i() ? false : this.ch();
      }
   }

   public boolean ci() {
      return false;
   }

   public void a(BiConsumer<dws<?>, arf> $$0) {
   }

   @Nullable
   public ewq cj() {
      return this.dP().M().e(this.cB());
   }

   public boolean s(bsu $$0) {
      return this.a($$0.cj());
   }

   public boolean a(ewx $$0) {
      return this.cj() != null ? this.cj().a($$0) : false;
   }

   public void k(boolean $$0) {
      this.b(5, $$0);
   }

   protected boolean j(int $$0) {
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

   public int ck() {
      return 300;
   }

   public int cl() {
      return this.ao.a(aR);
   }

   public void k(int $$0) {
      this.ao.a(aR, $$0);
   }

   public int cm() {
      return this.ao.a(aW);
   }

   public void l(int $$0) {
      this.ao.a(aW, $$0);
   }

   public float cn() {
      int $$0 = this.cp();
      return (float)Math.min(this.cm(), $$0) / (float)$$0;
   }

   public boolean co() {
      return this.cm() >= this.cp();
   }

   public int cp() {
      return 140;
   }

   public void a(arf $$0, bto $$1) {
      this.i(this.aL + 1);
      if (this.aL == 0) {
         this.g(8);
      }

      this.a(this.dQ().b(), 5.0F);
   }

   public void l(boolean $$0) {
      evr $$1 = this.ds();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void m(boolean $$0) {
      evr $$1 = this.ds();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(arf $$0, btp $$1) {
      return true;
   }

   public void cq() {
      if (this.ds().b() > -0.5 && this.ac > 1.0F) {
         this.ac = 1.0F;
      }
   }

   public void n() {
      this.ac = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      iz $$3 = iz.a($$0, $$1, $$2);
      evr $$4 = new evr($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      iz.a $$5 = new iz.a();
      je $$6 = je.b;
      double $$7 = Double.MAX_VALUE;

      for (je $$8 : new je[]{je.c, je.d, je.e, je.f, je.b}) {
         $$5.a($$3, $$8);
         if (!this.dP().a_($$5).r(this.dP(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == je.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ah.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      evr $$13 = this.ds().a(0.75);
      if ($$6.o() == je.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == je.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == je.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dsc $$0, evr $$1) {
      this.n();
      this.V = $$1;
   }

   private static xp c(xp $$0) {
      yd $$1 = $$0.e().b($$0.a().a(null));

      for (xp $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public xp af() {
      xp $$0 = this.ah();
      return $$0 != null ? c($$0) : this.cr();
   }

   protected xp cr() {
      return this.n.h();
   }

   public boolean t(bsu $$0) {
      return this == $$0;
   }

   public float cs() {
      return 0.0F;
   }

   public void n(float $$0) {
   }

   public void o(float $$0) {
   }

   public boolean ct() {
      return true;
   }

   public boolean u(bsu $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dP() == null ? "~NULL~" : this.dP().toString();
      return this.aJ != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.af().getString(),
            this.o,
            $$0,
            this.du(),
            this.dw(),
            this.dA(),
            this.aJ
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.af().getString(),
            this.o,
            $$0,
            this.du(),
            this.dw(),
            this.dA()
         );
   }

   public boolean b(brn $$0) {
      return this.dK() || this.ba && !$$0.a(awr.e) && !$$0.g() || $$0.a(awr.j) && this.bd() || $$0.a(awr.n) && this.ak().a(awt.o);
   }

   public boolean cu() {
      return this.ba;
   }

   public void n(boolean $$0) {
      this.ba = $$0;
   }

   public void v(bsu $$0) {
      this.b($$0.du(), $$0.dw(), $$0.dA(), $$0.dF(), $$0.dH());
   }

   public void w(bsu $$0) {
      us $$1 = $$0.f(new us());
      $$1.r("Dimension");
      this.g($$1);
      this.aZ = $$0.aZ;
      this.ay = $$0.ay;
   }

   @Nullable
   public bsu b(arf $$0) {
      if (this.dP() instanceof arf && !this.dK()) {
         this.dP().ag().a("changeDimension");
         this.ai();
         this.dP().ag().a("reposition");
         eou $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dP().ag().b("reloading");
            bsu $$2 = this.ak().a((dby)$$0);
            if ($$2 != null) {
               $$2.w(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dH());
               $$2.h($$1.b);
               $$0.d($$2);
               if ($$0.af() == dby.j) {
                  arf.a($$0);
               }
            }

            this.cv();
            this.dP().ag().c();
            ((arf)this.dP()).h();
            $$0.h();
            this.dP().ag().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void cv() {
      this.b(bsu.c.e);
   }

   @Nullable
   protected eou a(arf $$0) {
      boolean $$1 = this.dP().af() == dby.j && $$0.af() == dby.h;
      boolean $$2 = $$0.af() == dby.j;
      if (!$$1 && !$$2) {
         boolean $$6 = $$0.af() == dby.i;
         if (this.dP().af() != dby.i && !$$6) {
            return null;
         } else {
            dtt $$7 = $$0.C_();
            double $$8 = dvu.a(this.dP().D_(), $$0.D_());
            iz $$9 = $$7.b(this.du() * $$8, this.dw(), this.dA() * $$8);
            return this.a($$0, $$9, $$6, $$7).map($$1x -> {
               dsc $$2x = this.dP().a_(this.ay);
               je.a $$3;
               evr $$5;
               if ($$2x.b(dss.H)) {
                  $$3 = $$2x.c(dss.H);
                  l.a $$4 = l.a(this.ay, $$3, 21, je.a.b, 21, $$1xx -> this.dP().a_($$1xx) == $$2x);
                  $$5 = this.a($$3, $$4);
               } else {
                  $$3 = je.a.a;
                  $$5 = new evr(0.5, 0.0, 0.0);
               }

               return eov.a($$0, $$1x, $$3, $$5, this, this.ds(), this.dF(), this.dH());
            }).orElse(null);
         }
      } else {
         iz $$3 = $$2 ? arf.a : $$0.V();
         $$0.l().a(ark.f, new dbf($$3), 3, $$3);
         int $$4;
         if ($$2) {
            $$4 = $$3.v();
         } else {
            $$4 = $$0.m($$3).a(dxu.a.f, $$3.u(), $$3.w()) + 1;
         }

         return new eou(new evr((double)$$3.u() + 0.5, (double)$$4, (double)$$3.w() + 0.5), this.ds(), this.dF(), this.dH());
      }
   }

   protected evr a(je.a $$0, l.a $$1) {
      return eov.a($$1, $$0, this.dn(), this.a(this.ar()));
   }

   protected Optional<l.a> a(arf $$0, iz $$1, boolean $$2, dtt $$3) {
      return $$0.p().a($$1, $$2, $$3);
   }

   public boolean cw() {
      return !this.bR() && !this.bS();
   }

   public float a(dbq $$0, dbe $$1, iz $$2, dsc $$3, env $$4, float $$5) {
      return $$5;
   }

   public boolean a(dbq $$0, dbe $$1, iz $$2, dsc $$3, float $$4) {
      return true;
   }

   public int cx() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bta.a(this.ak()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.o);
      $$0.a("Entity Name", () -> this.af().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.du(), this.dw(), this.dA()));
      $$0.a("Entity's Block location", p.a(this.dP(), ayz.a(this.du()), ayz.a(this.dw()), ayz.a(this.dA())));
      evr $$1 = this.ds();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", () -> this.cS().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.dc()));
   }

   public boolean cy() {
      return this.bQ() && !this.N_();
   }

   public void a_(UUID $$0) {
      this.az = $$0;
      this.aA = this.az.toString();
   }

   @Override
   public UUID cz() {
      return this.az;
   }

   public String cA() {
      return this.aA;
   }

   @Override
   public String cB() {
      return this.aA;
   }

   public boolean cC() {
      return true;
   }

   public static double cD() {
      return m;
   }

   public static void b(double $$0) {
      m = $$0;
   }

   @Override
   public xp O_() {
      return ewq.a(this.cj(), this.af()).a($$0 -> $$0.a(this.cJ()).a(this.cA()));
   }

   public void b(@Nullable xp $$0) {
      this.ao.a(aS, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public xp ah() {
      return this.ao.a(aS).orElse(null);
   }

   @Override
   public boolean ag() {
      return this.ao.a(aS).isPresent();
   }

   public void o(boolean $$0) {
      this.ao.a(aT, $$0);
   }

   public boolean cE() {
      return this.ao.a(aT);
   }

   public final void n(double $$0, double $$1, double $$2) {
      if (this.dP() instanceof arf) {
         dbf $$3 = new dbf(iz.a($$0, $$1, $$2));
         ((arf)this.dP()).l().a(ark.g, $$3, 0, this.al());
         this.dP().d($$3.e, $$3.f);
         this.c($$0, $$1, $$2);
      }
   }

   public boolean a(arf $$0, double $$1, double $$2, double $$3, Set<bud> $$4, float $$5, float $$6) {
      float $$7 = ayz.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dP()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.A();
         this.n($$5);
      } else {
         this.ai();
         bsu $$8 = this.ak().a((dby)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(bsu.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dP() instanceof arf) {
         this.b($$0, $$1, $$2, this.dF(), this.dH());
         this.A();
      }
   }

   private void A() {
      this.cU().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.p.iterator();

         while (var1.hasNext()) {
            bsu $$1 = (bsu)var1.next();
            $$0.a($$1, bsu::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.du() + $$0, this.dw() + $$1, this.dA() + $$2);
   }

   public boolean cF() {
      return this.cE();
   }

   @Override
   public void a(List<ako.c<?>> $$0) {
   }

   @Override
   public void a(akk<?> $$0) {
      if (at.equals($$0)) {
         this.j_();
      }
   }

   @Deprecated
   protected void cG() {
      bub $$0 = this.ar();
      bsx $$1 = this.a($$0);
      this.bf = $$1;
      this.bg = $$1.c();
   }

   public void j_() {
      bsx $$0 = this.bf;
      bub $$1 = this.ar();
      bsx $$2 = this.a($$1);
      this.bf = $$2;
      this.bg = $$2.c();
      this.at();
      boolean $$3 = (double)$$2.a() <= 4.0 && (double)$$2.b() <= 4.0;
      if (!this.dP().B && !this.an && !this.ag && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cmx)) {
         evr $$4 = this.dn().b(0.0, (double)$$0.b() / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a() - $$0.a()) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b() - $$0.b()) + 1.0E-6;
         ewk $$7 = ewh.a(evm.a($$4, $$5, $$6, $$5));
         this.dP().a(this, $$7, $$4, (double)$$2.a(), (double)$$2.b(), (double)$$2.a()).ifPresent($$1x -> this.b($$1x.b(0.0, (double)(-$$2.b()) / 2.0, 0.0)));
      }
   }

   public je cH() {
      return je.a((double)this.dF());
   }

   public je cI() {
      return this.cH();
   }

   protected xv cJ() {
      return new xv(xv.a.c, new xv.b(this.ak(), this.cz(), this.af()));
   }

   public boolean a(arg $$0) {
      return true;
   }

   @Override
   public final evm cK() {
      return this.aH;
   }

   public evm h_() {
      return this.cK();
   }

   public final void a(evm $$0) {
      this.aH = $$0;
   }

   public final float d(bub $$0) {
      return this.a($$0).c();
   }

   public final float cL() {
      return this.bg;
   }

   public evr p(float $$0) {
      return this.cM();
   }

   protected evr cM() {
      return new evr(0.0, (double)this.cL(), (double)(this.dj() * 0.4F));
   }

   public buh a_(int $$0) {
      return buh.a;
   }

   @Override
   public void a(xp $$0) {
   }

   public dby cN() {
      return this.dP();
   }

   @Nullable
   public MinecraftServer cO() {
      return this.dP().o();
   }

   public bqu a(cmx $$0, evr $$1, bqt $$2) {
      return bqu.e;
   }

   public boolean a(dbq $$0) {
      return false;
   }

   public void a(btp $$0, bsu $$1) {
      if ($$1 instanceof btp) {
         dab.a((btp)$$1, $$0);
      }

      dab.b($$0, $$1);
   }

   public void c(arg $$0) {
   }

   public void d(arg $$0) {
   }

   public float a(dlm $$0) {
      float $$1 = ayz.g(this.dF());
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

   public float a(djw $$0) {
      float $$1 = ayz.g(this.dF());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public boolean cP() {
      return false;
   }

   public cnq a(cnp $$0) {
      return this.ak().a(awt.r) ? cnq.b : cnq.a;
   }

   @Nullable
   public btp cQ() {
      return null;
   }

   public final boolean cR() {
      return this.cQ() != null;
   }

   public final List<bsu> cS() {
      return this.p;
   }

   public Optional<bsu> g(evr $$0) {
      return this.cS().stream().filter($$0x -> $$0x != this).min(Comparator.comparingDouble($$1 -> $$0.g($$1.dn())));
   }

   @Nullable
   public bsu cT() {
      return this.p.isEmpty() ? null : (bsu)this.p.get(0);
   }

   public boolean x(bsu $$0) {
      return this.p.contains($$0);
   }

   public boolean a(Predicate<bsu> $$0) {
      UnmodifiableIterator var2 = this.p.iterator();

      while (var2.hasNext()) {
         bsu $$1 = (bsu)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bsu> G() {
      return this.p.stream().flatMap(bsu::cU);
   }

   @Override
   public Stream<bsu> cU() {
      return Stream.concat(Stream.of(this), this.G());
   }

   @Override
   public Stream<bsu> cV() {
      return Stream.concat(this.p.stream().flatMap(bsu::cV), Stream.of(this));
   }

   public Iterable<bsu> cW() {
      return () -> this.G().iterator();
   }

   public int cX() {
      return (int)this.G().filter($$0 -> $$0 instanceof cmx).count();
   }

   public boolean cY() {
      return this.cX() == 1;
   }

   public bsu cZ() {
      bsu $$0 = this;

      while ($$0.bR()) {
         $$0 = $$0.dc();
      }

      return $$0;
   }

   public boolean y(bsu $$0) {
      return this.cZ() == $$0.cZ();
   }

   public boolean z(bsu $$0) {
      if (!$$0.bR()) {
         return false;
      } else {
         bsu $$1 = $$0.dc();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean da() {
      return this.cQ() instanceof cmx $$0 ? $$0.g() : this.db();
   }

   public boolean db() {
      return !this.dP().B;
   }

   protected static evr a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -ayz.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = ayz.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new evr((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public evr b(btp $$0) {
      return new evr(this.du(), this.cK().e, this.dA());
   }

   @Nullable
   public bsu dc() {
      return this.q;
   }

   @Nullable
   public bsu dd() {
      return this.q != null && this.q.cQ() == this ? this.q : null;
   }

   public eoa k_() {
      return eoa.a;
   }

   public awb de() {
      return awb.g;
   }

   protected int df() {
      return 1;
   }

   public ep dg() {
      return new ep(
         this, this.dn(), this.bM(), this.dP() instanceof arf ? (arf)this.dP() : null, this.F(), this.af().getString(), this.O_(), this.dP().o(), this
      );
   }

   protected int F() {
      return 0;
   }

   public boolean m(int $$0) {
      return this.F() >= $$0;
   }

   @Override
   public boolean l_() {
      return this.dP().ab().b(dbu.p);
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public boolean U_() {
      return true;
   }

   public void a(fb.a $$0, evr $$1) {
      evr $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.s(ayz.g((float)(-(ayz.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.r(ayz.g((float)(ayz.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dF());
      this.P = this.dH();
      this.O = this.dF();
   }

   public boolean a(axf<enu> $$0, double $$1) {
      if (this.dh()) {
         return false;
      } else {
         evm $$2 = this.cK().h(0.001);
         int $$3 = ayz.a($$2.a);
         int $$4 = ayz.c($$2.d);
         int $$5 = ayz.a($$2.b);
         int $$6 = ayz.c($$2.e);
         int $$7 = ayz.a($$2.c);
         int $$8 = ayz.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cC();
         boolean $$11 = false;
         evr $$12 = evr.b;
         int $$13 = 0;
         iz.a $$14 = new iz.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  env $$18 = this.dP().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((dbe)this.dP(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           evr $$20 = $$18.c(this.dP(), $$14);
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

            if (!(this instanceof cmx)) {
               $$12 = $$12.d();
            }

            evr $$21 = this.ds();
            $$12 = $$12.a($$1 * 1.0);
            double $$22 = 0.003;
            if (Math.abs($$21.c) < 0.003 && Math.abs($$21.e) < 0.003 && $$12.f() < 0.0045000000000000005) {
               $$12 = $$12.d().a(0.0045000000000000005);
            }

            this.h(this.ds().e($$12));
         }

         this.ak.put($$0, $$9);
         return $$11;
      }
   }

   public boolean dh() {
      evm $$0 = this.cK().g(1.0);
      int $$1 = ayz.a($$0.a);
      int $$2 = ayz.c($$0.d);
      int $$3 = ayz.a($$0.c);
      int $$4 = ayz.c($$0.f);
      return !this.dP().b($$1, $$3, $$2, $$4);
   }

   public double b(axf<enu> $$0) {
      return this.ak.getDouble($$0);
   }

   public double di() {
      return (double)this.cL() < 0.4 ? 0.0 : 0.4;
   }

   public final float dj() {
      return this.bf.a();
   }

   public final float dk() {
      return this.bf.b();
   }

   public zw<aci> dl() {
      return new acj(this);
   }

   public bsx a(bub $$0) {
      return this.n.n();
   }

   public final bsw dm() {
      return this.bf.d();
   }

   public evr dn() {
      return this.s;
   }

   public evr do() {
      return this.dn();
   }

   @Override
   public iz dp() {
      return this.t;
   }

   public dsc dq() {
      if (this.bl == null) {
         this.bl = this.dP().a_(this.dp());
      }

      return this.bl;
   }

   public dbf dr() {
      return this.u;
   }

   public evr ds() {
      return this.v;
   }

   public void h(evr $$0) {
      this.v = $$0;
   }

   public void i(evr $$0) {
      this.h(this.ds().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.h(new evr($$0, $$1, $$2));
   }

   public final int dt() {
      return this.t.u();
   }

   public final double du() {
      return this.s.c;
   }

   public double c(double $$0) {
      return this.s.c + (double)this.dj() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ah.j() - 1.0) * $$0);
   }

   public final int dv() {
      return this.t.v();
   }

   public final double dw() {
      return this.s.d;
   }

   public double e(double $$0) {
      return this.s.d + (double)this.dk() * $$0;
   }

   public double dx() {
      return this.e(this.ah.j());
   }

   public double dy() {
      return this.s.d + (double)this.bg;
   }

   public final int dz() {
      return this.t.w();
   }

   public final double dA() {
      return this.s.e;
   }

   public double f(double $$0) {
      return this.s.e + (double)this.dj() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ah.j() - 1.0) * $$0);
   }

   public final void p(double $$0, double $$1, double $$2) {
      if (this.s.c != $$0 || this.s.d != $$1 || this.s.e != $$2) {
         this.s = new evr($$0, $$1, $$2);
         int $$3 = ayz.a($$0);
         int $$4 = ayz.a($$1);
         int $$5 = ayz.a($$2);
         if ($$3 != this.t.u() || $$4 != this.t.v() || $$5 != this.t.w()) {
            this.t = new iz($$3, $$4, $$5);
            this.bl = null;
            if (kb.a($$3) != this.u.e || kb.a($$5) != this.u.f) {
               this.u = new dbf(this.t);
            }
         }

         this.aX.a();
      }
   }

   public void dB() {
   }

   public evr q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bg * 0.7, 0.0);
   }

   public void a(acj $$0) {
      int $$1 = $$0.b();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      double $$4 = $$0.i();
      this.f($$2, $$3, $$4);
      this.e($$2, $$3, $$4);
      this.s($$0.m());
      this.r($$0.n());
      this.e($$1);
      this.a_($$0.e());
   }

   @Nullable
   public cup dC() {
      return null;
   }

   public void p(boolean $$0) {
      this.aB = $$0;
   }

   public boolean dD() {
      return !this.ak().a(awt.k);
   }

   public boolean dE() {
      return (this.aB || this.aC) && this.dD();
   }

   public float dF() {
      return this.aF;
   }

   public float dG() {
      return this.dF();
   }

   public void r(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aF = $$0;
      }
   }

   public float dH() {
      return this.aG;
   }

   public void s(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aG = $$0;
      }
   }

   public boolean dI() {
      return false;
   }

   public float dJ() {
      return 0.0F;
   }

   public void a(@Nullable bsu $$0) {
   }

   public final boolean dK() {
      return this.aJ != null;
   }

   @Nullable
   public bsu.c dL() {
      return this.aJ;
   }

   @Override
   public final void b(bsu.c $$0) {
      if (this.aJ == null) {
         this.aJ = $$0;
      }

      if (this.aJ.a()) {
         this.ac();
      }

      this.cS().forEach(bsu::ac);
      this.aX.a($$0);
   }

   protected void dM() {
      this.aJ = null;
   }

   @Override
   public void a(dwd $$0) {
      this.aX = $$0;
   }

   @Override
   public boolean dN() {
      if (this.aJ != null && !this.aJ.b()) {
         return false;
      } else {
         return this.bR() ? false : !this.bS() || !this.cY();
      }
   }

   @Override
   public boolean dO() {
      return false;
   }

   public boolean a(dby $$0, iz $$1) {
      return true;
   }

   public dby dP() {
      return this.r;
   }

   protected void a(dby $$0) {
      this.r = $$0;
   }

   public bro dQ() {
      return this.dP().aj();
   }

   public jw dR() {
      return this.dP().H_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = ayz.d($$6, this.du(), $$1);
      double $$8 = ayz.d($$6, this.dw(), $$2);
      double $$9 = ayz.d($$6, this.dA(), $$3);
      float $$10 = (float)ayz.e($$6, (double)this.dF(), $$4);
      float $$11 = (float)ayz.d($$6, (double)this.dH(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   @FunctionalInterface
   public interface a {
      void accept(bsu var1, double var2, double var4, double var6);
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
