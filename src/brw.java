import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
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

public abstract class brw implements ajv, bqb, dvd, ed, evp {
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
   private static final euh d = new euh(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double e = 0.014;
   private static final double k = 0.007;
   private static final double l = 0.0023333333333333335;
   public static final String I = "UUID";
   private static double m = 1.0;
   private final bsc<?> n;
   private int o = c.incrementAndGet();
   public boolean J;
   private ImmutableList<brw> p = ImmutableList.of();
   protected int K;
   @Nullable
   private brw q;
   private daz r;
   public double L;
   public double M;
   public double N;
   private eum s;
   private io t;
   private dag u;
   private eum v = eum.b;
   private float aF;
   private float aG;
   public float O;
   public float P;
   private euh aH = d;
   private boolean aI;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   public boolean U;
   protected eum V = eum.b;
   @Nullable
   private brw.c aJ;
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
   protected final aym ah = aym.a();
   public int ai;
   private int aL = -this.df();
   protected boolean aj;
   protected Object2DoubleMap<awm<emv>> ak = new Object2DoubleArrayMap(2);
   protected boolean al;
   private final Set<awm<emv>> aM = new HashSet<>();
   public int am;
   protected boolean an = true;
   protected final ajw ao;
   protected static final ajs<Byte> ap = ajw.a(brw.class, aju.a);
   protected static final int aq = 0;
   private static final int aN = 1;
   private static final int aO = 3;
   private static final int aP = 4;
   private static final int aQ = 5;
   protected static final int ar = 6;
   protected static final int as = 7;
   private static final ajs<Integer> aR = ajw.a(brw.class, aju.b);
   private static final ajs<Optional<wx>> aS = ajw.a(brw.class, aju.g);
   private static final ajs<Boolean> aT = ajw.a(brw.class, aju.k);
   private static final ajs<Boolean> aU = ajw.a(brw.class, aju.k);
   private static final ajs<Boolean> aV = ajw.a(brw.class, aju.k);
   protected static final ajs<btc> at = ajw.a(brw.class, aju.w);
   private static final ajs<Integer> aW = ajw.a(brw.class, aju.b);
   private dve aX = dve.a;
   private final aic aY = new aic();
   public boolean au;
   public boolean av;
   private int aZ;
   protected boolean aw;
   protected int ax;
   protected io ay;
   private boolean ba;
   protected UUID az = ayf.a(this.ah);
   protected String aA = this.az.toString();
   private boolean bb;
   private final Set<String> bc = Sets.newHashSet();
   private final double[] bd = new double[]{0.0, 0.0, 0.0};
   private long be;
   private brz bf;
   private float bg;
   public boolean aB;
   public boolean aC;
   public boolean aD;
   public Optional<io> aE = Optional.empty();
   private boolean bh = false;
   private float bi;
   private int bj;
   private boolean bk;
   @Nullable
   private drd bl = null;

   public brw(bsc<?> $$0, daz $$1) {
      this.n = $$0;
      this.r = $$1;
      this.bf = $$0.n();
      this.s = eum.b;
      this.t = io.c;
      this.u = dag.b;
      ajw.a $$2 = new ajw.a(this);
      $$2.a(ap, (byte)0);
      $$2.a(aR, this.ck());
      $$2.a(aT, false);
      $$2.a(aS, Optional.empty());
      $$2.a(aU, false);
      $$2.a(aV, false);
      $$2.a(at, btc.a);
      $$2.a(aW, 0);
      this.a($$2);
      this.ao = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.bg = this.bf.c();
   }

   public boolean a(io $$0, drd $$1) {
      evf $$2 = $$1.b(this.dP(), $$0, eur.a(this));
      evf $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return evc.c($$3, evc.a(this.cK()), euq.i);
   }

   public int i_() {
      evs $$0 = this.cj();
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
      this.aY.e(new eum($$0, $$1, $$2));
   }

   public aic aj() {
      return this.aY;
   }

   public bsc<?> ak() {
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
      this.a(brw.c.a);
      this.a(dvw.p);
   }

   public final void ao() {
      this.a(brw.c.b);
   }

   protected abstract void a(ajw.a var1);

   public ajw ap() {
      return this.ao;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof brw ? ((brw)$$0).o == this.o : false;
   }

   @Override
   public int hashCode() {
      return this.o;
   }

   public void a(brw.c $$0) {
      this.b($$0);
   }

   public void aq() {
   }

   public void b(btc $$0) {
      this.ao.a(at, $$0);
   }

   public btc ar() {
      return this.ao.a(at);
   }

   public boolean c(btc $$0) {
      return this.ar() == $$0;
   }

   public boolean a(brw $$0, double $$1) {
      return this.dn().a((jh)$$0.dn(), $$1);
   }

   public boolean a(brw $$0, double $$1, double $$2) {
      double $$3 = $$0.du() - this.du();
      double $$4 = $$0.dw() - this.dw();
      double $$5 = $$0.dA() - this.dA();
      return ayf.e($$3, $$5) < ayf.k($$1) && ayf.k($$4) < ayf.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.r($$0 % 360.0F);
      this.s($$1 % 360.0F);
   }

   public final void b(eum $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.as());
   }

   protected euh as() {
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
      this.s(ayf.a(this.dH(), -90.0F, 90.0F));
      this.P += $$2;
      this.O += $$3;
      this.P = ayf.a(this.P, -90.0F, 90.0F);
      if (this.q != null) {
         this.q.k(this);
      }
   }

   public void l() {
      this.au();
   }

   public void au() {
      this.dP().af().a("entityBaseTick");
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
      this.dP().af().c();
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
            this.a(avi.ka, 0.4F, 2.0F + this.ah.i() * 0.4F);
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

   private boolean b(euh $$0) {
      return this.dP().a(this, $$0) && !this.dP().d($$0);
   }

   public void d(boolean $$0) {
      this.aI = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, eum $$1) {
      this.aI = $$0;
      this.b($$0, $$1);
   }

   public boolean e(io $$0) {
      return this.aE.isPresent() && this.aE.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable eum $$1) {
      if ($$0) {
         euh $$2 = this.cK();
         euh $$3 = new euh($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<io> $$4 = this.r.g(this, $$3);
         if ($$4.isPresent() || this.bh) {
            this.aE = $$4;
         } else if ($$1 != null) {
            euh $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
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

   public void a(bsv $$0, eum $$1) {
      if (this.ag) {
         this.a_(this.du() + $$1.c, this.dw() + $$1.d, this.dA() + $$1.e);
      } else {
         this.aD = this.bQ();
         if ($$0 == bsv.c) {
            $$1 = this.d($$1);
            if ($$1.equals(eum.b)) {
               return;
            }
         }

         this.dP().af().a("move");
         if (this.V.g() > 1.0E-7) {
            $$1 = $$1.h(this.V);
            this.V = eum.b;
            this.g(eum.b);
         }

         $$1 = this.a($$1, $$0);
         eum $$2 = this.a($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ac != 0.0F && $$3 >= 1.0) {
               eui $$4 = this.dP().a(new dai(this.dn(), this.dn().e($$2), dai.a.d, dai.b.d, this));
               if ($$4.c() != euk.a.a) {
                  this.n();
               }
            }

            this.a_(this.du() + $$2.c, this.dw() + $$2.d, this.dA() + $$2.e);
         }

         this.dP().af().c();
         this.dP().af().a("rest");
         boolean $$5 = !ayf.b($$1.c, $$2.c);
         boolean $$6 = !ayf.b($$1.e, $$2.e);
         this.Q = $$5 || $$6;
         this.R = $$1.d != $$2.d;
         this.S = this.R && $$1.d < 0.0;
         if (this.Q) {
            this.T = this.c($$2);
         } else {
            this.T = false;
         }

         this.a(this.S, $$2);
         io $$7 = this.aJ();
         drd $$8 = this.dP().a_($$7);
         this.a($$2.d, this.aE(), $$8, $$7);
         if (this.dK()) {
            this.dP().af().c();
         } else {
            if (this.Q) {
               eum $$9 = this.ds();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            dea $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dP(), this);
            }

            if (this.aE()) {
               $$10.a(this.dP(), $$7, $$8, this);
            }

            brw.b $$11 = this.bb();
            if ($$11.a() && !this.bR()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.ab = this.ab + (float)($$2.f() * 0.6);
               io $$15 = this.aL();
               drd $$16 = this.dP().a_($$15);
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
                        this.a(dvw.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aI();
               }
            }

            this.aF();
            float $$20 = this.aN();
            this.g(this.ds().d((double)$$20, 1.0, (double)$$20));
            if (this.dP().c(this.cK().h(1.0E-6)).noneMatch($$0x -> $$0x.a(avx.aK) || $$0x.a(dec.H))) {
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

            this.dP().af().c();
         }
      }
   }

   private boolean c(drd $$0) {
      return $$0.a(avx.aP) || $$0.a(dec.qP);
   }

   private boolean a(io $$0, drd $$1, boolean $$2, boolean $$3, eum $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aE() || $$5 || this.ca() && $$4.d == 0.0 || this.ci()) && !this.cc()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dP().a(dvw.P, this.dn(), dvw.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(eum $$0) {
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
      this.a(avi.kf, 0.7F, 1.6F + (this.ah.i() - this.ah.i()) * 0.4F);
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
            this.a(dvw.x);
         }
      }
   }

   @Deprecated
   public io aJ() {
      return this.d(0.2F);
   }

   protected io aK() {
      return this.d(0.500001F);
   }

   public io aL() {
      return this.d(1.0E-5F);
   }

   protected io d(float $$0) {
      if (this.aE.isPresent()) {
         io $$1 = this.aE.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            drd $$2 = this.dP().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(avx.S)) && !$$2.a(avx.L) && !($$2.b() instanceof dgz) ? $$1.h(ayf.a(this.s.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = ayf.a(this.s.c);
         int $$4 = ayf.a(this.s.d - (double)$$0);
         int $$5 = ayf.a(this.s.e);
         return new io($$3, $$4, $$5);
      }
   }

   protected float aM() {
      float $$0 = this.dP().a_(this.dp()).b().k();
      float $$1 = this.dP().a_(this.aK()).b().k();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aN() {
      drd $$0 = this.dP().a_(this.dp());
      float $$1 = $$0.b().j();
      if (!$$0.a(dec.G) && !$$0.a(dec.nd)) {
         return (double)$$1 == 1.0 ? this.dP().a_(this.aK()).b().j() : $$1;
      } else {
         return $$1;
      }
   }

   protected eum a(eum $$0, bsv $$1) {
      return $$0;
   }

   protected eum d(eum $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dP().Y();
         if ($$1 != this.be) {
            Arrays.fill(this.bd, 0.0);
            this.be = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(it.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? eum.b : new eum($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(it.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? eum.b : new eum(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(it.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? eum.b : new eum(0.0, 0.0, $$4);
         } else {
            return eum.b;
         }
      }
   }

   private double a(it.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = ayf.a($$1 + this.bd[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bd[$$2];
      this.bd[$$2] = $$3;
      return $$1;
   }

   private eum a(eum $$0) {
      euh $$1 = this.cK();
      List<evf> $$2 = this.dP().c(this, $$1.b($$0));
      eum $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dP(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.aE() || $$5 && $$0.d < 0.0;
      if (this.dJ() > 0.0F && $$7 && ($$4 || $$6)) {
         eum $$8 = a(this, new eum($$0.c, (double)this.dJ(), $$0.e), $$1, this.dP(), $$2);
         eum $$9 = a(this, new eum(0.0, (double)this.dJ(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dP(), $$2);
         if ($$9.d < (double)this.dJ()) {
            eum $$10 = a(this, new eum($$0.c, 0.0, $$0.e), $$1.c($$9), this.dP(), $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new eum(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.dP(), $$2));
         }
      }

      return $$3;
   }

   public static eum a(@Nullable brw $$0, eum $$1, euh $$2, daz $$3, List<evf> $$4) {
      Builder<evf> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      dsu $$6 = $$3.C_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.e($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static eum a(eum $$0, euh $$1, List<evf> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = evc.a(it.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = evc.a(it.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = evc.a(it.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = evc.a(it.a.c, $$1, $$2, $$5);
         }

         return new eum($$3, $$4, $$5);
      }
   }

   protected float aO() {
      return (float)((int)this.aa + 1);
   }

   protected avh aP() {
      return avi.kj;
   }

   protected avh aQ() {
      return avi.ki;
   }

   protected avh aR() {
      return avi.ki;
   }

   protected void aS() {
      euh $$0 = this.cK();
      io $$1 = io.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      io $$2 = io.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dP().a($$1, $$2)) {
         io.a $$3 = new io.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bD()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  drd $$7 = this.dP().a_($$3);

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

   protected void a(drd $$0) {
   }

   public void a(ix<dvw> $$0, @Nullable brw $$1) {
      this.dP().a($$1, $$0, this.s);
   }

   public void a(ix<dvw> $$0) {
      this.a($$0, this);
   }

   private void c(io $$0, drd $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.v();
      }
   }

   protected void aT() {
      brw $$0 = Objects.requireNonNullElse(this.cQ(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      eum $$2 = $$0.ds();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected io f(io $$0) {
      io $$1 = $$0.c();
      drd $$2 = this.dP().a_($$1);
      return !$$2.a(avx.bn) && !$$2.a(avx.bo) ? $$0 : $$1;
   }

   protected void a(drd $$0, drd $$1) {
      dln $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(drd $$0) {
      dln $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(io $$0, drd $$1) {
      dln $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(drd $$0) {
      return $$0.a(avx.bm) && this.ai >= this.bj + 20;
   }

   private void v() {
      this.bi = this.bi * (float)Math.pow(0.997, (double)(this.ai - this.bj));
      this.bi = Math.min(1.0F, this.bi + 0.07F);
      float $$0 = 0.5F + this.bi * this.ah.i() * 1.2F;
      float $$1 = 0.1F + this.bi * 1.2F;
      this.a(avi.E, $$1, $$0);
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

   public void a(avh $$0, float $$1, float $$2) {
      if (!this.aW()) {
         this.dP().a(null, this.du(), this.dw(), this.dA(), $$0, this.de(), $$1, $$2);
      }
   }

   public void a(avh $$0) {
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
         this.g(this.ds().b(0.0, -$$0, 0.0));
      }
   }

   protected brw.b bb() {
      return brw.b.d;
   }

   public boolean bc() {
      return false;
   }

   protected void a(double $$0, boolean $$1, drd $$2, io $$3) {
      if ($$1) {
         if (this.ac > 0.0F) {
            $$2.b().a(this.dP(), $$2, $$3, this, this.ac);
            this.dP().a(dvw.A, this.s, dvw.a.a(this, this.aE.<drd>map($$0x -> this.dP().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ac -= (float)$$0;
      }
   }

   public boolean bd() {
      return this.ak().d();
   }

   public boolean a(float $$0, float $$1, bqp $$2) {
      if (this.n.a(awa.o)) {
         return false;
      } else {
         if (this.bS()) {
            for (brw $$3 : this.cS()) {
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
      io $$0 = this.dp();
      return this.dP().r($$0) || this.dP().r(io.a((double)$$0.u(), this.cK().e, (double)$$0.w()));
   }

   private boolean x() {
      return this.dq().a(dec.nd);
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
         this.i(this.cb() && this.bj() && !this.bR() && this.dP().b_(this.t).a(awc.a));
      }
   }

   protected boolean bl() {
      this.ak.clear();
      this.bm();
      double $$0 = this.dP().D_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(awc.b, $$0);
      return this.be() || $$1;
   }

   void bm() {
      if (this.dc() instanceof cnv $$0 && !$$0.bj()) {
         this.aj = false;
         return;
      }

      if (this.a(awc.a, 0.014)) {
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
      this.al = this.a(awc.a);
      this.aM.clear();
      double $$0 = this.dy();
      if (this.dc() instanceof cnv $$2 && !$$2.bj() && $$2.cK().e >= $$0 && $$2.cK().b <= $$0) {
         return;
      }

      io $$3 = io.a(this.du(), $$0, this.dA());
      emw $$4 = this.dP().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((daf)this.dP(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aM::add);
      }
   }

   protected void bn() {
      brw $$0 = Objects.requireNonNullElse(this.cQ(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      eum $$2 = $$0.ds();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aQ(), $$3, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
      } else {
         this.a(this.aR(), $$3, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
      }

      float $$4 = (float)ayf.a(this.dw());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bf.a() * 20.0F; $$5++) {
         double $$6 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         double $$7 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         this.dP().a(ky.d, this.du() + $$6, (double)($$4 + 1.0F), this.dA() + $$7, $$2.c, $$2.d - this.ah.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bf.a() * 20.0F; $$8++) {
         double $$9 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         double $$10 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         this.dP().a(ky.am, this.du() + $$9, (double)($$4 + 1.0F), this.dA() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(dvw.O);
   }

   @Deprecated
   protected drd bo() {
      return this.dP().a_(this.aJ());
   }

   public drd bp() {
      return this.dP().a_(this.aL());
   }

   public boolean bq() {
      return this.cb() && !this.be() && !this.N_() && !this.ca() && !this.bs() && this.bD();
   }

   protected void br() {
      io $$0 = this.aJ();
      drd $$1 = this.dP().a_($$0);
      if ($$1.l() != dkg.a) {
         eum $$2 = this.ds();
         io $$3 = this.dp();
         double $$4 = this.du() + (this.ah.j() - 0.5) * (double)this.bf.a();
         double $$5 = this.dA() + (this.ah.j() - 0.5) * (double)this.bf.a();
         if ($$3.u() != $$0.u()) {
            $$4 = ayf.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = ayf.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dP().a(new kp(ky.b, $$1), $$4, this.dw() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(awm<emv> $$0) {
      return this.aM.contains($$0);
   }

   public boolean bs() {
      return !this.an && this.ak.getDouble(awc.b) > 0.0;
   }

   public void a(float $$0, eum $$1) {
      eum $$2 = a($$1, $$0, this.dF());
      this.g(this.ds().e($$2));
   }

   private static eum a(eum $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return eum.b;
      } else {
         eum $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = ayf.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = ayf.b($$2 * (float) (Math.PI / 180.0));
         return new eum($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bt() {
      return this.dP().f(this.dt(), this.dz()) ? this.dP().x(io.a(this.du(), this.dy(), this.dA())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.r($$3 % 360.0F);
      this.s(ayf.a($$4, -90.0F, 90.0F) % 360.0F);
      this.O = this.dF();
      this.P = this.dH();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = ayf.a($$0, -3.0E7, 3.0E7);
      double $$4 = ayf.a($$2, -3.0E7, 3.0E7);
      this.L = $$3;
      this.M = $$1;
      this.N = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(eum $$0) {
      this.e($$0.c, $$0.d, $$0.e);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dF(), this.dH());
   }

   public void a(io $$0, float $$1, float $$2) {
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

   public float f(brw $$0) {
      float $$1 = (float)(this.du() - $$0.du());
      float $$2 = (float)(this.dw() - $$0.dw());
      float $$3 = (float)(this.dA() - $$0.dA());
      return ayf.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.du() - $$0;
      double $$4 = this.dw() - $$1;
      double $$5 = this.dA() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(brw $$0) {
      return this.f($$0.dn());
   }

   public double f(eum $$0) {
      double $$1 = this.du() - $$0.c;
      double $$2 = this.dw() - $$0.d;
      double $$3 = this.dA() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cly $$0) {
   }

   public void h(brw $$0) {
      if (!this.y($$0)) {
         if (!$$0.ag && !this.ag) {
            double $$1 = $$0.du() - this.du();
            double $$2 = $$0.dA() - this.dA();
            double $$3 = ayf.a($$1, $$2);
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
      this.g(this.ds().b($$0, $$1, $$2));
      this.av = true;
   }

   protected void bv() {
      this.U = true;
   }

   public boolean a(bqp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bv();
         return false;
      }
   }

   public final eum f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public it bw() {
      return it.a(this.f(1.0F));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dH() : ayf.i($$0, this.P, this.dH());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dF() : ayf.i($$0, this.O, this.dF());
   }

   public final eum b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = ayf.b($$3);
      float $$5 = ayf.a($$3);
      float $$6 = ayf.b($$2);
      float $$7 = ayf.a($$2);
      return new eum((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final eum i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final eum c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final eum bx() {
      return new eum(this.du(), this.dy(), this.dA());
   }

   public final eum j(float $$0) {
      double $$1 = ayf.d((double)$$0, this.L, this.du());
      double $$2 = ayf.d((double)$$0, this.M, this.dw()) + (double)this.cL();
      double $$3 = ayf.d((double)$$0, this.N, this.dA());
      return new eum($$1, $$2, $$3);
   }

   public eum k(float $$0) {
      return this.j($$0);
   }

   public final eum l(float $$0) {
      double $$1 = ayf.d((double)$$0, this.L, this.du());
      double $$2 = ayf.d((double)$$0, this.M, this.dw());
      double $$3 = ayf.d((double)$$0, this.N, this.dA());
      return new eum($$1, $$2, $$3);
   }

   public euk a(double $$0, float $$1, boolean $$2) {
      eum $$3 = this.j($$1);
      eum $$4 = this.f($$1);
      eum $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dP().a(new dai($$3, $$5, dai.a.b, $$2 ? dai.b.c : dai.b.a, this));
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

   public void a(brw $$0, int $$1, bqp $$2) {
      if ($$0 instanceof aqo) {
         am.d.a((aqo)$$0, this, $$2);
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

   public boolean d(ud $$0) {
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

   public boolean e(ud $$0) {
      return this.bR() ? false : this.d($$0);
   }

   public ud f(ud $$0) {
      try {
         if (this.q != null) {
            $$0.a("Pos", this.a(this.q.du(), this.dw(), this.q.dA()));
         } else {
            $$0.a("Pos", this.a(this.du(), this.dw(), this.dA()));
         }

         eum $$1 = this.ds();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dF(), this.dH()));
         $$0.a("FallDistance", this.ac);
         $$0.a("Fire", (short)this.aL);
         $$0.a("Air", (short)this.cl());
         $$0.a("OnGround", this.aE());
         $$0.a("Invulnerable", this.ba);
         $$0.a("PortalCooldown", this.aZ);
         $$0.a("UUID", this.cz());
         wx $$2 = this.ah();
         if ($$2 != null) {
            $$0.a("CustomName", wx.a.a($$2, this.dR()));
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
            uj $$4 = new uj();

            for (String $$5 : this.bc) {
               $$4.add(uy.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bS()) {
            uj $$6 = new uj();

            for (brw $$7 : this.cS()) {
               ud $$8 = new ud();
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

   public void g(ud $$0) {
      try {
         uj $$1 = $$0.c("Pos", 6);
         uj $$2 = $$0.c("Motion", 6);
         uj $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(ayf.a($$1.h(0), -3.0000512E7, 3.0000512E7), ayf.a($$1.h(1), -2.0E7, 2.0E7), ayf.a($$1.h(2), -3.0000512E7, 3.0000512E7));
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
                  this.b(wx.a.a($$8, this.dR()));
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
               uj $$10 = $$0.c("Tags", 8);
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
      bsc<?> $$0 = this.ak();
      akn $$1 = bsc.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(ud var1);

   protected abstract void b(ud var1);

   protected uj a(double... $$0) {
      uj $$1 = new uj();

      for (double $$2 : $$0) {
         $$1.add(ue.a($$2));
      }

      return $$1;
   }

   protected uj a(float... $$0) {
      uj $$1 = new uj();

      for (float $$2 : $$0) {
         $$1.add(ug.a($$2));
      }

      return $$1;
   }

   @Nullable
   public cii a(day $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public cii a(day $$0, int $$1) {
      return this.a(new ctq($$0), (float)$$1);
   }

   @Nullable
   public cii b(ctq $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public cii a(ctq $$0, float $$1) {
      if ($$0.e()) {
         return null;
      } else if (this.dP().B) {
         return null;
      } else {
         cii $$2 = new cii(this.dP(), this.du(), this.dw() + (double)$$1, this.dA(), $$0);
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
         euh $$1 = euh.a(this.bx(), (double)$$0, 1.0E-6, (double)$$0);
         return io.a($$1)
            .anyMatch(
               $$1x -> {
                  drd $$2 = this.dP().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dP(), $$1x)
                     && evc.c($$2.k(this.dP(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), evc.a($$1), euq.i);
               }
            );
      }
   }

   public bpw a(cly $$0, bpv $$1) {
      return bpw.d;
   }

   public boolean i(brw $$0) {
      return $$0.bF() && !this.y($$0);
   }

   public boolean bF() {
      return false;
   }

   public void t() {
      this.g(eum.b);
      this.l();
      if (this.bR()) {
         this.dc().j(this);
      }
   }

   public final void j(brw $$0) {
      if (this.x($$0)) {
         this.a($$0, brw::a_);
      }
   }

   protected void a(brw $$0, brw.a $$1) {
      eum $$2 = this.m($$0);
      eum $$3 = $$0.l(this);
      $$1.accept($$0, $$2.c - $$3.c, $$2.d - $$3.d, $$2.e - $$3.e);
   }

   public void k(brw $$0) {
   }

   public eum l(brw $$0) {
      return this.dm().b(brx.b, 0, this.aF);
   }

   public eum m(brw $$0) {
      return this.dn().e(this.a($$0, this.bf, 1.0F));
   }

   protected eum a(brw $$0, brz $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static eum a(brw $$0, brw $$1, bry $$2) {
      int $$3 = $$0.cS().indexOf($$1);
      return $$2.c(brx.a, $$3, $$0.aF);
   }

   public boolean n(brw $$0) {
      return this.a($$0, false);
   }

   public boolean bG() {
      return this instanceof bsq;
   }

   public boolean a(brw $$0, boolean $$1) {
      if ($$0 == this.q) {
         return false;
      } else if (!$$0.bJ()) {
         return false;
      } else {
         for (brw $$2 = $$0; $$2.q != null; $$2 = $$2.q) {
            if ($$2.q == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bR()) {
               this.ac();
            }

            this.b(btc.a);
            this.q = $$0;
            this.q.p(this);
            $$0.G().filter($$0x -> $$0x instanceof aqo).forEach($$0x -> am.U.a((aqo)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(brw $$0) {
      return !this.bV() && this.K <= 0;
   }

   public void bH() {
      for (int $$0 = this.p.size() - 1; $$0 >= 0; $$0--) {
         ((brw)this.p.get($$0)).ac();
      }
   }

   public void bI() {
      if (this.q != null) {
         brw $$0 = this.q;
         this.q = null;
         $$0.q(this);
      }
   }

   public void ac() {
      this.bI();
   }

   protected void p(brw $$0) {
      if ($$0.dc() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.p.isEmpty()) {
            this.p = ImmutableList.of($$0);
         } else {
            List<brw> $$1 = Lists.newArrayList(this.p);
            if (!this.dP().B && $$0 instanceof cly && !(this.cT() instanceof cly)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.p = ImmutableList.copyOf($$1);
         }

         this.a(dvw.s, $$0);
      }
   }

   protected void q(brw $$0) {
      if ($$0.dc() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.p.size() == 1 && this.p.get(0) == $$0) {
            this.p = ImmutableList.of();
         } else {
            this.p = this.p.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.K = 60;
         this.a(dvw.q, $$0);
      }
   }

   protected boolean r(brw $$0) {
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

   public eum bL() {
      return this.b(this.dH(), this.dF());
   }

   public eum a(ctl $$0) {
      if (!(this instanceof cly $$1)) {
         return eum.b;
      } else {
         boolean $$2 = $$1.eY().a($$0) && !$$1.eX().a($$0);
         bsk $$3 = $$2 ? $$1.fu().e() : $$1.fu();
         return this.b(0.0F, this.dF() + (float)($$3 == bsk.b ? 80 : -80)).a(0.5);
      }
   }

   public eul bM() {
      return new eul(this.dH(), this.dF());
   }

   public eum bN() {
      return eum.a(this.bM());
   }

   public void g(io $$0) {
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
      if (this.dP() instanceof aqn) {
         int $$0 = this.az();
         aqn $$1 = (aqn)this.dP();
         if (this.aw) {
            MinecraftServer $$2 = $$1.o();
            akm<daz> $$3 = this.dP().ae() == daz.i ? daz.h : daz.i;
            aqn $$4 = $$2.a($$3);
            if ($$4 != null && $$2.G() && !this.bR() && this.ax++ >= $$0) {
               this.dP().af().a("portal");
               this.ax = $$0;
               this.aw();
               this.b($$4);
               this.dP().af().c();
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

   public void c(bqp $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dhu.a(this);
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
      return this.ak().a(awa.p);
   }

   public boolean bU() {
      return !this.ak().a(awa.q);
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
      return this.c(btc.f);
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
      return this.c(btc.d);
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

   public boolean d(cly $$0) {
      if ($$0.N_()) {
         return false;
      } else {
         evs $$1 = this.cj();
         return $$1 != null && $$0 != null && $$0.cj() == $$1 && $$1.i() ? false : this.ch();
      }
   }

   public boolean ci() {
      return false;
   }

   public void a(BiConsumer<dvt<?>, aqn> $$0) {
   }

   @Nullable
   public evl cj() {
      return this.dP().L().e(this.cB());
   }

   public boolean s(brw $$0) {
      return this.a($$0.cj());
   }

   public boolean a(evs $$0) {
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

   public void a(aqn $$0, bsp $$1) {
      this.i(this.aL + 1);
      if (this.aL == 0) {
         this.g(8);
      }

      this.a(this.dQ().b(), 5.0F);
   }

   public void l(boolean $$0) {
      eum $$1 = this.ds();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void m(boolean $$0) {
      eum $$1 = this.ds();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(aqn $$0, bsq $$1) {
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
      io $$3 = io.a($$0, $$1, $$2);
      eum $$4 = new eum($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      io.a $$5 = new io.a();
      it $$6 = it.b;
      double $$7 = Double.MAX_VALUE;

      for (it $$8 : new it[]{it.c, it.d, it.e, it.f, it.b}) {
         $$5.a($$3, $$8);
         if (!this.dP().a_($$5).r(this.dP(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == it.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ah.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      eum $$13 = this.ds().a(0.75);
      if ($$6.o() == it.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == it.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == it.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(drd $$0, eum $$1) {
      this.n();
      this.V = $$1;
   }

   private static wx c(wx $$0) {
      xl $$1 = $$0.e().b($$0.a().a(null));

      for (wx $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public wx af() {
      wx $$0 = this.ah();
      return $$0 != null ? c($$0) : this.cr();
   }

   protected wx cr() {
      return this.n.h();
   }

   public boolean t(brw $$0) {
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

   public boolean u(brw $$0) {
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

   public boolean b(bqp $$0) {
      return this.dK() || this.ba && !$$0.a(avz.e) && !$$0.g() || $$0.a(avz.j) && this.bd() || $$0.a(avz.n) && this.ak().a(awa.o);
   }

   public boolean cu() {
      return this.ba;
   }

   public void n(boolean $$0) {
      this.ba = $$0;
   }

   public void v(brw $$0) {
      this.b($$0.du(), $$0.dw(), $$0.dA(), $$0.dF(), $$0.dH());
   }

   public void w(brw $$0) {
      ud $$1 = $$0.f(new ud());
      $$1.r("Dimension");
      this.g($$1);
      this.aZ = $$0.aZ;
      this.ay = $$0.ay;
   }

   @Nullable
   public brw b(aqn $$0) {
      if (this.dP() instanceof aqn && !this.dK()) {
         this.dP().af().a("changeDimension");
         this.ai();
         this.dP().af().a("reposition");
         env $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dP().af().b("reloading");
            brw $$2 = this.ak().a((daz)$$0);
            if ($$2 != null) {
               $$2.w(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dH());
               $$2.g($$1.b);
               $$0.d($$2);
               if ($$0.ae() == daz.j) {
                  aqn.a($$0);
               }
            }

            this.cv();
            this.dP().af().c();
            ((aqn)this.dP()).h();
            $$0.h();
            this.dP().af().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void cv() {
      this.b(brw.c.e);
   }

   @Nullable
   protected env a(aqn $$0) {
      boolean $$1 = this.dP().ae() == daz.j && $$0.ae() == daz.h;
      boolean $$2 = $$0.ae() == daz.j;
      if (!$$1 && !$$2) {
         boolean $$6 = $$0.ae() == daz.i;
         if (this.dP().ae() != daz.i && !$$6) {
            return null;
         } else {
            dsu $$7 = $$0.C_();
            double $$8 = duv.a(this.dP().D_(), $$0.D_());
            io $$9 = $$7.b(this.du() * $$8, this.dw(), this.dA() * $$8);
            return this.a($$0, $$9, $$6, $$7).map($$1x -> {
               drd $$2x = this.dP().a_(this.ay);
               it.a $$3;
               eum $$5;
               if ($$2x.b(drt.H)) {
                  $$3 = $$2x.c(drt.H);
                  l.a $$4 = l.a(this.ay, $$3, 21, it.a.b, 21, $$1xx -> this.dP().a_($$1xx) == $$2x);
                  $$5 = this.a($$3, $$4);
               } else {
                  $$3 = it.a.a;
                  $$5 = new eum(0.5, 0.0, 0.0);
               }

               return enw.a($$0, $$1x, $$3, $$5, this, this.ds(), this.dF(), this.dH());
            }).orElse(null);
         }
      } else {
         io $$3 = $$2 ? aqn.a : $$0.U();
         $$0.l().a(aqs.f, new dag($$3), 3, $$3);
         int $$4;
         if ($$2) {
            $$4 = $$3.v();
         } else {
            $$4 = $$0.m($$3).a(dwv.a.f, $$3.u(), $$3.w()) + 1;
         }

         return new env(new eum((double)$$3.u() + 0.5, (double)$$4, (double)$$3.w() + 0.5), this.ds(), this.dF(), this.dH());
      }
   }

   protected eum a(it.a $$0, l.a $$1) {
      return enw.a($$1, $$0, this.dn(), this.a(this.ar()));
   }

   protected Optional<l.a> a(aqn $$0, io $$1, boolean $$2, dsu $$3) {
      return $$0.p().a($$1, $$2, $$3);
   }

   public boolean cw() {
      return !this.bR() && !this.bS();
   }

   public float a(dar $$0, daf $$1, io $$2, drd $$3, emw $$4, float $$5) {
      return $$5;
   }

   public boolean a(dar $$0, daf $$1, io $$2, drd $$3, float $$4) {
      return true;
   }

   public int cx() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bsc.a(this.ak()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.o);
      $$0.a("Entity Name", () -> this.af().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.du(), this.dw(), this.dA()));
      $$0.a("Entity's Block location", p.a(this.dP(), ayf.a(this.du()), ayf.a(this.dw()), ayf.a(this.dA())));
      eum $$1 = this.ds();
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
   public wx O_() {
      return evl.a(this.cj(), this.af()).a($$0 -> $$0.a(this.cJ()).a(this.cA()));
   }

   public void b(@Nullable wx $$0) {
      this.ao.a(aS, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public wx ah() {
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
      if (this.dP() instanceof aqn) {
         dag $$3 = new dag(io.a($$0, $$1, $$2));
         ((aqn)this.dP()).l().a(aqs.g, $$3, 0, this.al());
         this.dP().d($$3.e, $$3.f);
         this.c($$0, $$1, $$2);
      }
   }

   public boolean a(aqn $$0, double $$1, double $$2, double $$3, Set<bte> $$4, float $$5, float $$6) {
      float $$7 = ayf.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dP()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.A();
         this.n($$5);
      } else {
         this.ai();
         brw $$8 = this.ak().a((daz)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(brw.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dP() instanceof aqn) {
         this.b($$0, $$1, $$2, this.dF(), this.dH());
         this.A();
      }
   }

   private void A() {
      this.cU().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.p.iterator();

         while (var1.hasNext()) {
            brw $$1 = (brw)var1.next();
            $$0.a($$1, brw::e);
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
   public void a(List<ajw.c<?>> $$0) {
   }

   @Override
   public void a(ajs<?> $$0) {
      if (at.equals($$0)) {
         this.j_();
      }
   }

   @Deprecated
   protected void cG() {
      btc $$0 = this.ar();
      brz $$1 = this.a($$0);
      this.bf = $$1;
      this.bg = $$1.c();
   }

   public void j_() {
      brz $$0 = this.bf;
      btc $$1 = this.ar();
      brz $$2 = this.a($$1);
      this.bf = $$2;
      this.bg = $$2.c();
      this.at();
      boolean $$3 = (double)$$2.a() <= 4.0 && (double)$$2.b() <= 4.0;
      if (!this.dP().B && !this.an && !this.ag && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cly)) {
         eum $$4 = this.dn().b(0.0, (double)$$0.b() / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a() - $$0.a()) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b() - $$0.b()) + 1.0E-6;
         evf $$7 = evc.a(euh.a($$4, $$5, $$6, $$5));
         this.dP().a(this, $$7, $$4, (double)$$2.a(), (double)$$2.b(), (double)$$2.a()).ifPresent($$1x -> this.b($$1x.b(0.0, (double)(-$$2.b()) / 2.0, 0.0)));
      }
   }

   public it cH() {
      return it.a((double)this.dF());
   }

   public it cI() {
      return this.cH();
   }

   protected xd cJ() {
      return new xd(xd.a.c, new xd.b(this.ak(), this.cz(), this.af()));
   }

   public boolean a(aqo $$0) {
      return true;
   }

   @Override
   public final euh cK() {
      return this.aH;
   }

   public euh h_() {
      return this.cK();
   }

   public final void a(euh $$0) {
      this.aH = $$0;
   }

   public final float d(btc $$0) {
      return this.a($$0).c();
   }

   public final float cL() {
      return this.bg;
   }

   public eum p(float $$0) {
      return this.cM();
   }

   protected eum cM() {
      return new eum(0.0, (double)this.cL(), (double)(this.dj() * 0.4F));
   }

   public bti a_(int $$0) {
      return bti.b;
   }

   @Override
   public void a(wx $$0) {
   }

   public daz cN() {
      return this.dP();
   }

   @Nullable
   public MinecraftServer cO() {
      return this.dP().o();
   }

   public bpw a(cly $$0, eum $$1, bpv $$2) {
      return bpw.d;
   }

   public boolean a(dar $$0) {
      return false;
   }

   public void a(bsq $$0, brw $$1) {
      if ($$1 instanceof bsq) {
         czc.a((bsq)$$1, $$0);
      }

      czc.b($$0, $$1);
   }

   public void c(aqo $$0) {
   }

   public void d(aqo $$0) {
   }

   public float a(dkn $$0) {
      float $$1 = ayf.g(this.dF());
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

   public float a(dix $$0) {
      float $$1 = ayf.g(this.dF());
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

   public cmr a(cmq $$0) {
      return this.ak().a(awa.r) ? cmr.b : cmr.a;
   }

   @Nullable
   public bsq cQ() {
      return null;
   }

   public final boolean cR() {
      return this.cQ() != null;
   }

   public final List<brw> cS() {
      return this.p;
   }

   @Nullable
   public brw cT() {
      return this.p.isEmpty() ? null : (brw)this.p.get(0);
   }

   public boolean x(brw $$0) {
      return this.p.contains($$0);
   }

   public boolean a(Predicate<brw> $$0) {
      UnmodifiableIterator var2 = this.p.iterator();

      while (var2.hasNext()) {
         brw $$1 = (brw)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<brw> G() {
      return this.p.stream().flatMap(brw::cU);
   }

   @Override
   public Stream<brw> cU() {
      return Stream.concat(Stream.of(this), this.G());
   }

   @Override
   public Stream<brw> cV() {
      return Stream.concat(this.p.stream().flatMap(brw::cV), Stream.of(this));
   }

   public Iterable<brw> cW() {
      return () -> this.G().iterator();
   }

   public int cX() {
      return (int)this.G().filter($$0 -> $$0 instanceof cly).count();
   }

   public boolean cY() {
      return this.cX() == 1;
   }

   public brw cZ() {
      brw $$0 = this;

      while ($$0.bR()) {
         $$0 = $$0.dc();
      }

      return $$0;
   }

   public boolean y(brw $$0) {
      return this.cZ() == $$0.cZ();
   }

   public boolean z(brw $$0) {
      if (!$$0.bR()) {
         return false;
      } else {
         brw $$1 = $$0.dc();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean da() {
      return this.cQ() instanceof cly $$0 ? $$0.g() : this.db();
   }

   public boolean db() {
      return !this.dP().B;
   }

   protected static eum a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -ayf.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = ayf.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new eum((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public eum b(bsq $$0) {
      return new eum(this.du(), this.cK().e, this.dA());
   }

   @Nullable
   public brw dc() {
      return this.q;
   }

   @Nullable
   public brw dd() {
      return this.q != null && this.q.cQ() == this ? this.q : null;
   }

   public enb k_() {
      return enb.a;
   }

   public avj de() {
      return avj.g;
   }

   protected int df() {
      return 1;
   }

   public ee dg() {
      return new ee(
         this, this.dn(), this.bM(), this.dP() instanceof aqn ? (aqn)this.dP() : null, this.F(), this.af().getString(), this.O_(), this.dP().o(), this
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
      return this.dP().aa().b(dav.p);
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public boolean U_() {
      return true;
   }

   public void a(eq.a $$0, eum $$1) {
      eum $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.s(ayf.g((float)(-(ayf.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.r(ayf.g((float)(ayf.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dF());
      this.P = this.dH();
      this.O = this.dF();
   }

   public boolean a(awm<emv> $$0, double $$1) {
      if (this.dh()) {
         return false;
      } else {
         euh $$2 = this.cK().h(0.001);
         int $$3 = ayf.a($$2.a);
         int $$4 = ayf.c($$2.d);
         int $$5 = ayf.a($$2.b);
         int $$6 = ayf.c($$2.e);
         int $$7 = ayf.a($$2.c);
         int $$8 = ayf.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cC();
         boolean $$11 = false;
         eum $$12 = eum.b;
         int $$13 = 0;
         io.a $$14 = new io.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  emw $$18 = this.dP().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((daf)this.dP(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           eum $$20 = $$18.c(this.dP(), $$14);
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

            if (!(this instanceof cly)) {
               $$12 = $$12.d();
            }

            eum $$21 = this.ds();
            $$12 = $$12.a($$1 * 1.0);
            double $$22 = 0.003;
            if (Math.abs($$21.c) < 0.003 && Math.abs($$21.e) < 0.003 && $$12.f() < 0.0045000000000000005) {
               $$12 = $$12.d().a(0.0045000000000000005);
            }

            this.g(this.ds().e($$12));
         }

         this.ak.put($$0, $$9);
         return $$11;
      }
   }

   public boolean dh() {
      euh $$0 = this.cK().g(1.0);
      int $$1 = ayf.a($$0.a);
      int $$2 = ayf.c($$0.d);
      int $$3 = ayf.a($$0.c);
      int $$4 = ayf.c($$0.f);
      return !this.dP().b($$1, $$3, $$2, $$4);
   }

   public double b(awm<emv> $$0) {
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

   public ze<abq> dl() {
      return new abr(this);
   }

   public brz a(btc $$0) {
      return this.n.n();
   }

   public final bry dm() {
      return this.bf.d();
   }

   public eum dn() {
      return this.s;
   }

   public eum do() {
      return this.dn();
   }

   @Override
   public io dp() {
      return this.t;
   }

   public drd dq() {
      if (this.bl == null) {
         this.bl = this.dP().a_(this.dp());
      }

      return this.bl;
   }

   public dag dr() {
      return this.u;
   }

   public eum ds() {
      return this.v;
   }

   public void g(eum $$0) {
      this.v = $$0;
   }

   public void h(eum $$0) {
      this.g(this.ds().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.g(new eum($$0, $$1, $$2));
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
         this.s = new eum($$0, $$1, $$2);
         int $$3 = ayf.a($$0);
         int $$4 = ayf.a($$1);
         int $$5 = ayf.a($$2);
         if ($$3 != this.t.u() || $$4 != this.t.v() || $$5 != this.t.w()) {
            this.t = new io($$3, $$4, $$5);
            this.bl = null;
            if (jq.a($$3) != this.u.e || jq.a($$5) != this.u.f) {
               this.u = new dag(this.t);
            }
         }

         this.aX.a();
      }
   }

   public void dB() {
   }

   public eum q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bg * 0.7, 0.0);
   }

   public void a(abr $$0) {
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
   public ctq dC() {
      return null;
   }

   public void p(boolean $$0) {
      this.aB = $$0;
   }

   public boolean dD() {
      return !this.ak().a(awa.k);
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

   public void a(@Nullable brw $$0) {
   }

   public final boolean dK() {
      return this.aJ != null;
   }

   @Nullable
   public brw.c dL() {
      return this.aJ;
   }

   @Override
   public final void b(brw.c $$0) {
      if (this.aJ == null) {
         this.aJ = $$0;
      }

      if (this.aJ.a()) {
         this.ac();
      }

      this.cS().forEach(brw::ac);
      this.aX.a($$0);
   }

   protected void dM() {
      this.aJ = null;
   }

   @Override
   public void a(dve $$0) {
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

   public boolean a(daz $$0, io $$1) {
      return true;
   }

   public daz dP() {
      return this.r;
   }

   protected void a(daz $$0) {
      this.r = $$0;
   }

   public bqq dQ() {
      return this.dP().ai();
   }

   public jl dR() {
      return this.dP().H_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = ayf.d($$6, this.du(), $$1);
      double $$8 = ayf.d($$6, this.dw(), $$2);
      double $$9 = ayf.d($$6, this.dA(), $$3);
      float $$10 = (float)ayf.e($$6, (double)this.dF(), $$4);
      float $$11 = (float)ayf.d($$6, (double)this.dH(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   @FunctionalInterface
   public interface a {
      void accept(brw var1, double var2, double var4, double var6);
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
