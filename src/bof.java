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

public abstract class bof implements bmq, dpy, dt, epy {
   private static final Logger c = LogUtils.getLogger();
   public static final String w = "id";
   public static final String x = "Passengers";
   private static final AtomicInteger d = new AtomicInteger();
   public static final int y = 60;
   public static final int z = 300;
   public static final int A = 1024;
   public static final float B = 0.2F;
   public static final double C = 0.500001;
   public static final double D = 0.999999;
   public static final int E = 140;
   public static final int F = 40;
   private static final eoq e = new eoq(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double k = 0.014;
   private static final double l = 0.007;
   private static final double m = 0.0023333333333333335;
   public static final String G = "UUID";
   private static double n = 1.0;
   private final bol<?> o;
   private int p = d.incrementAndGet();
   public boolean H;
   private ImmutableList<bof> q = ImmutableList.of();
   protected int I;
   @Nullable
   private bof r;
   private cwe s;
   public double J;
   public double K;
   public double L;
   private eov t;
   private ib u;
   private cvl v;
   private eov aD = eov.b;
   private float aE;
   private float aF;
   public float M;
   public float N;
   private eoq aG = e;
   private boolean aH;
   public boolean O;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   protected eov T = eov.b;
   @Nullable
   private bof.c aI;
   public static final float U = 0.6F;
   public static final float V = 1.8F;
   public float W;
   public float X;
   public float Y;
   public float Z;
   public float aa;
   private float aJ = 1.0F;
   public double ab;
   public double ac;
   public double ad;
   public boolean ae;
   protected final awt af = awt.a();
   public int ag;
   private int aK = -this.cZ();
   protected boolean ah;
   protected Object2DoubleMap<aut<ehq>> ai = new Object2DoubleArrayMap(2);
   protected boolean aj;
   private final Set<aut<ehq>> aL = new HashSet<>();
   public int ak;
   protected boolean al = true;
   protected final ail am;
   protected static final aii<Byte> an = ail.a(bof.class, aik.a);
   protected static final int ao = 0;
   private static final int aM = 1;
   private static final int aN = 3;
   private static final int aO = 4;
   private static final int aP = 5;
   protected static final int ap = 6;
   protected static final int aq = 7;
   private static final aii<Integer> aQ = ail.a(bof.class, aik.b);
   private static final aii<Optional<vs>> aR = ail.a(bof.class, aik.g);
   private static final aii<Boolean> aS = ail.a(bof.class, aik.k);
   private static final aii<Boolean> aT = ail.a(bof.class, aik.k);
   private static final aii<Boolean> aU = ail.a(bof.class, aik.k);
   protected static final aii<bpi> ar = ail.a(bof.class, aik.v);
   private static final aii<Integer> aV = ail.a(bof.class, aik.b);
   private dpz aW = dpz.a;
   private final ags aX = new ags();
   public boolean as;
   public boolean at;
   private int aY;
   protected boolean au;
   protected int av;
   protected ib aw;
   private boolean aZ;
   protected UUID ax = awm.a(this.af);
   protected String ay = this.ax.toString();
   private boolean ba;
   private final Set<String> bb = Sets.newHashSet();
   private final double[] bc = new double[]{0.0, 0.0, 0.0};
   private long bd;
   private boi be;
   private float bf;
   public boolean az;
   public boolean aA;
   public boolean aB;
   public Optional<ib> aC = Optional.empty();
   private boolean bg = false;
   private float bh;
   private int bi;
   private boolean bj;
   @Nullable
   private dme bk = null;

   public bof(bol<?> $$0, cwe $$1) {
      this.o = $$0;
      this.s = $$1;
      this.be = $$0.n();
      this.t = eov.b;
      this.u = ib.c;
      this.v = cvl.b;
      this.am = new ail(this);
      this.am.a(an, (byte)0);
      this.am.a(aQ, this.ce());
      this.am.a(aS, false);
      this.am.a(aR, Optional.empty());
      this.am.a(aT, false);
      this.am.a(aU, false);
      this.am.a(ar, bpi.a);
      this.am.a(aV, 0);
      this.c_();
      this.a_(0.0, 0.0, 0.0);
      this.bf = this.be.c();
   }

   public boolean a(ib $$0, dme $$1) {
      epo $$2 = $$1.b(this.dJ(), $$0, epa.a(this));
      epo $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return epl.c($$3, epl.a(this.cE()), eoz.i);
   }

   public int j_() {
      eqb $$0 = this.cd();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean P_() {
      return false;
   }

   public final void ag() {
      if (this.bM()) {
         this.bB();
      }

      if (this.bL()) {
         this.ac();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.aX.e(new eov($$0, $$1, $$2));
   }

   public ags ah() {
      return this.aX;
   }

   public bol<?> ai() {
      return this.o;
   }

   @Override
   public int aj() {
      return this.p;
   }

   public void e(int $$0) {
      this.p = $$0;
   }

   public Set<String> ak() {
      return this.bb;
   }

   public boolean a(String $$0) {
      return this.bb.size() >= 1024 ? false : this.bb.add($$0);
   }

   public boolean b(String $$0) {
      return this.bb.remove($$0);
   }

   public void al() {
      this.a(bof.c.a);
      this.b(dqr.p);
   }

   public final void am() {
      this.a(bof.c.b);
   }

   protected abstract void c_();

   public ail an() {
      return this.am;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bof ? ((bof)$$0).p == this.p : false;
   }

   @Override
   public int hashCode() {
      return this.p;
   }

   public void a(bof.c $$0) {
      this.b($$0);
   }

   public void ao() {
   }

   public void b(bpi $$0) {
      this.am.b(ar, $$0);
   }

   public bpi ap() {
      return this.am.b(ar);
   }

   public boolean c(bpi $$0) {
      return this.ap() == $$0;
   }

   public boolean a(bof $$0, double $$1) {
      return this.dh().a((iv)$$0.dh(), $$1);
   }

   public boolean a(bof $$0, double $$1, double $$2) {
      double $$3 = $$0.do() - this.do();
      double $$4 = $$0.dq() - this.dq();
      double $$5 = $$0.du() - this.du();
      return awm.e($$3, $$5) < awm.k($$1) && awm.k($$4) < awm.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.r($$0 % 360.0F);
      this.s($$1 % 360.0F);
   }

   public final void b(eov $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.aq());
   }

   protected eoq aq() {
      return this.be.a(this.t);
   }

   protected void ar() {
      this.a_(this.t.c, this.t.d, this.t.e);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.s(this.dB() + $$2);
      this.r(this.dz() + $$3);
      this.s(awm.a(this.dB(), -90.0F, 90.0F));
      this.N += $$2;
      this.M += $$3;
      this.N = awm.a(this.N, -90.0F, 90.0F);
      if (this.r != null) {
         this.r.j(this);
      }
   }

   public void l() {
      this.as();
   }

   public void as() {
      this.dJ().ae().a("entityBaseTick");
      this.bk = null;
      if (this.bL() && this.cW().dE()) {
         this.ac();
      }

      if (this.I > 0) {
         this.I--;
      }

      this.W = this.X;
      this.N = this.dB();
      this.M = this.dz();
      this.bI();
      if (this.bl()) {
         this.bm();
      }

      this.aA = this.az;
      this.az = false;
      this.bg();
      this.y();
      this.bf();
      if (this.dJ().B) {
         this.aA();
      } else if (this.aK > 0) {
         if (this.aY()) {
            this.i(this.aK - 4);
            if (this.aK < 0) {
               this.aA();
            }
         } else {
            if (this.aK % 20 == 0 && !this.bn()) {
               this.a(this.dK().c(), 1.0F);
            }

            this.i(this.aK - 1);
         }

         if (this.cg() > 0) {
            this.l(0);
            this.dJ().a(null, 1009, this.u, 1);
         }
      }

      if (this.bn()) {
         this.ay();
         this.aa *= 0.5F;
      }

      this.at();
      if (!this.dJ().B) {
         this.a_(this.aK > 0);
      }

      this.al = false;
      this.dJ().ae().c();
   }

   public void a_(boolean $$0) {
      this.b(0, $$0 || this.bj);
   }

   public void at() {
      if (this.dq() < (double)(this.dJ().J_() - 64)) {
         this.aB();
      }
   }

   public void au() {
      this.aY = this.bJ();
   }

   public void f(int $$0) {
      this.aY = $$0;
   }

   public int av() {
      return this.aY;
   }

   public boolean aw() {
      return this.aY > 0;
   }

   protected void L() {
      if (this.aw()) {
         this.aY--;
      }
   }

   public int ax() {
      return 0;
   }

   public void ay() {
      if (!this.aY()) {
         this.g(15);
         if (this.a(this.dK().d(), 4.0F)) {
            this.a(atp.jM, 0.4F, 2.0F + this.af.i() * 0.4F);
         }
      }
   }

   public final void g(int $$0) {
      this.h($$0 * 20);
   }

   public void h(int $$0) {
      if (this.aK < $$0) {
         this.i($$0);
      }
   }

   public void i(int $$0) {
      this.aK = $$0;
   }

   public int az() {
      return this.aK;
   }

   public void aA() {
      this.i(0);
   }

   protected void aB() {
      this.am();
   }

   public boolean g(double $$0, double $$1, double $$2) {
      return this.b(this.cE().d($$0, $$1, $$2));
   }

   private boolean b(eoq $$0) {
      return this.dJ().a(this, $$0) && !this.dJ().d($$0);
   }

   public void c(boolean $$0) {
      this.aH = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, eov $$1) {
      this.aH = $$0;
      this.b($$0, $$1);
   }

   public boolean d(ib $$0) {
      return this.aC.isPresent() && this.aC.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable eov $$1) {
      if ($$0) {
         eoq $$2 = this.cE();
         eoq $$3 = new eoq($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<ib> $$4 = this.s.g(this, $$3);
         if ($$4.isPresent() || this.bg) {
            this.aC = $$4;
         } else if ($$1 != null) {
            eoq $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
            $$4 = this.s.g(this, $$5);
            this.aC = $$4;
         }

         this.bg = $$4.isEmpty();
      } else {
         this.bg = false;
         if (this.aC.isPresent()) {
            this.aC = Optional.empty();
         }
      }
   }

   public boolean aC() {
      return this.aH;
   }

   public void a(bpc $$0, eov $$1) {
      if (this.ae) {
         this.a_(this.do() + $$1.c, this.dq() + $$1.d, this.du() + $$1.e);
      } else {
         this.aB = this.bK();
         if ($$0 == bpc.c) {
            $$1 = this.d($$1);
            if ($$1.equals(eov.b)) {
               return;
            }
         }

         this.dJ().ae().a("move");
         if (this.T.g() > 1.0E-7) {
            $$1 = $$1.h(this.T);
            this.T = eov.b;
            this.g(eov.b);
         }

         $$1 = this.a($$1, $$0);
         eov $$2 = this.a($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.aa != 0.0F && $$3 >= 1.0) {
               eor $$4 = this.dJ().a(new cvn(this.dh(), this.dh().e($$2), cvn.a.d, cvn.b.d, this));
               if ($$4.c() != eot.a.a) {
                  this.n();
               }
            }

            this.a_(this.do() + $$2.c, this.dq() + $$2.d, this.du() + $$2.e);
         }

         this.dJ().ae().c();
         this.dJ().ae().a("rest");
         boolean $$5 = !awm.b($$1.c, $$2.c);
         boolean $$6 = !awm.b($$1.e, $$2.e);
         this.O = $$5 || $$6;
         this.P = $$1.d != $$2.d;
         this.Q = this.P && $$1.d < 0.0;
         if (this.O) {
            this.R = this.c($$2);
         } else {
            this.R = false;
         }

         this.a(this.Q, $$2);
         ib $$7 = this.aH();
         dme $$8 = this.dJ().a_($$7);
         this.a($$2.d, this.aC(), $$8, $$7);
         if (this.dE()) {
            this.dJ().ae().c();
         } else {
            if (this.O) {
               eov $$9 = this.dm();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            czf $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dJ(), this);
            }

            if (this.aC()) {
               $$10.a(this.dJ(), $$7, $$8, this);
            }

            bof.b $$11 = this.aW();
            if ($$11.a() && !this.bL()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.Z = this.Z + (float)($$2.f() * 0.6);
               ib $$15 = this.aJ();
               dme $$16 = this.dJ().a_($$15);
               boolean $$17 = this.c($$16);
               if (!$$17) {
                  $$13 = 0.0;
               }

               this.X = this.X + (float)$$2.h() * 0.6F;
               this.Y = this.Y + (float)Math.sqrt($$12 * $$12 + $$13 * $$13 + $$14 * $$14) * 0.6F;
               if (this.Y > this.aJ && !$$16.i()) {
                  boolean $$18 = $$15.equals($$7);
                  boolean $$19 = this.a($$7, $$8, $$11.c(), $$18, $$1);
                  if (!$$18) {
                     $$19 |= this.a($$15, $$16, false, $$11.b(), $$1);
                  }

                  if ($$19) {
                     this.aJ = this.aM();
                  } else if (this.aZ()) {
                     this.aJ = this.aM();
                     if ($$11.c()) {
                        this.aR();
                     }

                     if ($$11.b()) {
                        this.b(dqr.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aG();
               }
            }

            this.aD();
            float $$20 = this.aL();
            this.g(this.dm().d((double)$$20, 1.0, (double)$$20));
            if (this.dJ().c(this.cE().h(1.0E-6)).noneMatch($$0x -> $$0x.a(aue.aJ) || $$0x.a(czh.H))) {
               if (this.aK <= 0) {
                  this.i(-this.cZ());
               }

               if (this.aB && (this.az || this.bb())) {
                  this.aE();
               }
            }

            if (this.bK() && (this.az || this.bb())) {
               this.i(-this.cZ());
            }

            this.dJ().ae().c();
         }
      }
   }

   private boolean c(dme $$0) {
      return $$0.a(aue.aO) || $$0.a(czh.qP);
   }

   private boolean a(ib $$0, dme $$1, boolean $$2, boolean $$3, eov $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aC() || $$5 || this.bU() && $$4.d == 0.0 || this.cc()) && !this.bW()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dJ().a(dqr.P, this.dh(), dqr.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(eov $$0) {
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
      this.a(atp.jR, 0.7F, 1.6F + (this.af.i() - this.af.i()) * 0.4F);
   }

   public void aF() {
      if (!this.dJ().B && this.aB) {
         this.aE();
      }

      this.aA();
   }

   protected void aG() {
      if (this.aT()) {
         this.aS();
         if (this.aW().b()) {
            this.b(dqr.x);
         }
      }
   }

   @Deprecated
   public ib aH() {
      return this.d(0.2F);
   }

   protected ib aI() {
      return this.d(0.500001F);
   }

   public ib aJ() {
      return this.d(1.0E-5F);
   }

   protected ib d(float $$0) {
      if (this.aC.isPresent()) {
         ib $$1 = this.aC.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dme $$2 = this.dJ().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(aue.S)) && !$$2.a(aue.L) && !($$2.b() instanceof dce) ? $$1.h(awm.a(this.t.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = awm.a(this.t.c);
         int $$4 = awm.a(this.t.d - (double)$$0);
         int $$5 = awm.a(this.t.e);
         return new ib($$3, $$4, $$5);
      }
   }

   protected float aK() {
      float $$0 = this.dJ().a_(this.dj()).b().k();
      float $$1 = this.dJ().a_(this.aI()).b().k();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aL() {
      dme $$0 = this.dJ().a_(this.dj());
      float $$1 = $$0.b().j();
      if (!$$0.a(czh.G) && !$$0.a(czh.nd)) {
         return (double)$$1 == 1.0 ? this.dJ().a_(this.aI()).b().j() : $$1;
      } else {
         return $$1;
      }
   }

   protected eov a(eov $$0, bpc $$1) {
      return $$0;
   }

   protected eov d(eov $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dJ().X();
         if ($$1 != this.bd) {
            Arrays.fill(this.bc, 0.0);
            this.bd = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(ih.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? eov.b : new eov($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(ih.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? eov.b : new eov(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(ih.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? eov.b : new eov(0.0, 0.0, $$4);
         } else {
            return eov.b;
         }
      }
   }

   private double a(ih.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = awm.a($$1 + this.bc[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bc[$$2];
      this.bc[$$2] = $$3;
      return $$1;
   }

   private eov a(eov $$0) {
      eoq $$1 = this.cE();
      List<epo> $$2 = this.dJ().c(this, $$1.b($$0));
      eov $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dJ(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.aC() || $$5 && $$0.d < 0.0;
      if (this.dD() > 0.0F && $$7 && ($$4 || $$6)) {
         eov $$8 = a(this, new eov($$0.c, (double)this.dD(), $$0.e), $$1, this.dJ(), $$2);
         eov $$9 = a(this, new eov(0.0, (double)this.dD(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dJ(), $$2);
         if ($$9.d < (double)this.dD()) {
            eov $$10 = a(this, new eov($$0.c, 0.0, $$0.e), $$1.c($$9), this.dJ(), $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new eov(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.dJ(), $$2));
         }
      }

      return $$3;
   }

   public static eov a(@Nullable bof $$0, eov $$1, eoq $$2, cwe $$3, List<epo> $$4) {
      Builder<epo> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      dnv $$6 = $$3.D_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.e($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static eov a(eov $$0, eoq $$1, List<epo> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = epl.a(ih.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = epl.a(ih.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = epl.a(ih.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = epl.a(ih.a.c, $$1, $$2, $$5);
         }

         return new eov($$3, $$4, $$5);
      }
   }

   protected float aM() {
      return (float)((int)this.Y + 1);
   }

   protected ato aN() {
      return atp.jV;
   }

   protected ato aO() {
      return atp.jU;
   }

   protected ato aP() {
      return atp.jU;
   }

   protected void aQ() {
      eoq $$0 = this.cE();
      ib $$1 = ib.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      ib $$2 = ib.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dJ().a($$1, $$2)) {
         ib.a $$3 = new ib.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bx()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  dme $$7 = this.dJ().a_($$3);

                  try {
                     $$7.a(this.dJ(), $$3, this);
                     this.a($$7);
                  } catch (Throwable var12) {
                     o $$9 = o.a(var12, "Colliding entity with block");
                     p $$10 = $$9.a("Block being collided with");
                     p.a($$10, this.dJ(), $$3, $$7);
                     throw new y($$9);
                  }
               }
            }
         }
      }
   }

   protected void a(dme $$0) {
   }

   public void a(il<dqr> $$0, @Nullable bof $$1) {
      this.dJ().a($$1, $$0, this.t);
   }

   public void b(il<dqr> $$0) {
      this.a($$0, this);
   }

   private void c(ib $$0, dme $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.s();
      }
   }

   protected void aR() {
      bof $$0 = Objects.requireNonNullElse(this.cK(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      eov $$2 = $$0.dm();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected ib e(ib $$0) {
      ib $$1 = $$0.c();
      dme $$2 = this.dJ().a_($$1);
      return !$$2.a(aue.bm) && !$$2.a(aue.bn) ? $$0 : $$1;
   }

   protected void a(dme $$0, dme $$1) {
      dgr $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dme $$0) {
      dgr $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(ib $$0, dme $$1) {
      dgr $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dme $$0) {
      return $$0.a(aue.bl) && this.ag >= this.bi + 20;
   }

   private void s() {
      this.bh = this.bh * (float)Math.pow(0.997, (double)(this.ag - this.bi));
      this.bh = Math.min(1.0F, this.bh + 0.07F);
      float $$0 = 0.5F + this.bh * this.af.i() * 1.2F;
      float $$1 = 0.1F + this.bh * 1.2F;
      this.a(atp.E, $$1, $$0);
      this.bi = this.ag;
   }

   protected void e(float $$0) {
      this.a(this.aN(), $$0, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
   }

   protected void aS() {
   }

   protected boolean aT() {
      return false;
   }

   public void a(ato $$0, float $$1, float $$2) {
      if (!this.aU()) {
         this.dJ().a(null, this.do(), this.dq(), this.du(), $$0, this.cY(), $$1, $$2);
      }
   }

   public void a(ato $$0) {
      if (!this.aU()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean aU() {
      return this.am.b(aT);
   }

   public void d(boolean $$0) {
      this.am.b(aT, $$0);
   }

   public boolean aV() {
      return this.am.b(aU);
   }

   public void e(boolean $$0) {
      this.am.b(aU, $$0);
   }

   protected bof.b aW() {
      return bof.b.d;
   }

   public boolean aX() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dme $$2, ib $$3) {
      if ($$1) {
         if (this.aa > 0.0F) {
            $$2.b().a(this.dJ(), $$2, $$3, this, this.aa);
            this.dJ().a(dqr.A, this.t, dqr.a.a(this, this.aC.<dme>map($$0x -> this.dJ().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.aa -= (float)$$0;
      }
   }

   public boolean aY() {
      return this.ai().d();
   }

   public boolean a(float $$0, float $$1, bne $$2) {
      if (this.o.a(auh.o)) {
         return false;
      } else {
         if (this.bM()) {
            for (bof $$3 : this.cM()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean aZ() {
      return this.ah;
   }

   private boolean u() {
      ib $$0 = this.dj();
      return this.dJ().r($$0) || this.dJ().r(ib.a((double)$$0.u(), this.cE().e, (double)$$0.w()));
   }

   private boolean x() {
      return this.dJ().a_(this.dj()).a(czh.nd);
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
      return this.aj && this.aZ();
   }

   public void bf() {
      if (this.bW()) {
         this.h(this.bV() && this.aZ() && !this.bL());
      } else {
         this.h(this.bV() && this.be() && !this.bL() && this.dJ().b_(this.u).a(auj.a));
      }
   }

   protected boolean bg() {
      this.ai.clear();
      this.bh();
      double $$0 = this.dJ().E_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(auj.b, $$0);
      return this.aZ() || $$1;
   }

   void bh() {
      if (this.cW() instanceof cjv $$0 && !$$0.be()) {
         this.ah = false;
         return;
      }

      if (this.a(auj.a, 0.014)) {
         if (!this.ah && !this.al) {
            this.bi();
         }

         this.n();
         this.ah = true;
         this.aA();
      } else {
         this.ah = false;
      }
   }

   private void y() {
      this.aj = this.a(auj.a);
      this.aL.clear();
      double $$0 = this.ds();
      if (this.cW() instanceof cjv $$2 && !$$2.be() && $$2.cE().e >= $$0 && $$2.cE().b <= $$0) {
         return;
      }

      ib $$3 = ib.a(this.do(), $$0, this.du());
      ehr $$4 = this.dJ().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((cvk)this.dJ(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aL::add);
      }
   }

   protected void bi() {
      bof $$0 = Objects.requireNonNullElse(this.cK(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      eov $$2 = $$0.dm();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aO(), $$3, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
      } else {
         this.a(this.aP(), $$3, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
      }

      float $$4 = (float)awm.a(this.dq());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.be.a() * 20.0F; $$5++) {
         double $$6 = (this.af.j() * 2.0 - 1.0) * (double)this.be.a();
         double $$7 = (this.af.j() * 2.0 - 1.0) * (double)this.be.a();
         this.dJ().a(kb.e, this.do() + $$6, (double)($$4 + 1.0F), this.du() + $$7, $$2.c, $$2.d - this.af.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.be.a() * 20.0F; $$8++) {
         double $$9 = (this.af.j() * 2.0 - 1.0) * (double)this.be.a();
         double $$10 = (this.af.j() * 2.0 - 1.0) * (double)this.be.a();
         this.dJ().a(kb.aj, this.do() + $$9, (double)($$4 + 1.0F), this.du() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.b(dqr.O);
   }

   @Deprecated
   protected dme bj() {
      return this.dJ().a_(this.aH());
   }

   public dme bk() {
      return this.dJ().a_(this.aJ());
   }

   public boolean bl() {
      return this.bV() && !this.aZ() && !this.P_() && !this.bU() && !this.bn() && this.bx();
   }

   protected void bm() {
      ib $$0 = this.aH();
      dme $$1 = this.dJ().a_($$0);
      if ($$1.l() != dfk.a) {
         eov $$2 = this.dm();
         ib $$3 = this.dj();
         double $$4 = this.do() + (this.af.j() - 0.5) * (double)this.be.a();
         double $$5 = this.du() + (this.af.j() - 0.5) * (double)this.be.a();
         if ($$3.u() != $$0.u()) {
            $$4 = awm.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = awm.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dJ().a(new jt(kb.c, $$1), $$4, this.dq() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(aut<ehq> $$0) {
      return this.aL.contains($$0);
   }

   public boolean bn() {
      return !this.al && this.ai.getDouble(auj.b) > 0.0;
   }

   public void a(float $$0, eov $$1) {
      eov $$2 = a($$1, $$0, this.dz());
      this.g(this.dm().e($$2));
   }

   private static eov a(eov $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return eov.b;
      } else {
         eov $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = awm.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = awm.b($$2 * (float) (Math.PI / 180.0));
         return new eov($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bo() {
      return this.dJ().f(this.dn(), this.dt()) ? this.dJ().x(ib.a(this.do(), this.ds(), this.du())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.r($$3 % 360.0F);
      this.s(awm.a($$4, -90.0F, 90.0F) % 360.0F);
      this.M = this.dz();
      this.N = this.dB();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = awm.a($$0, -3.0E7, 3.0E7);
      double $$4 = awm.a($$2, -3.0E7, 3.0E7);
      this.J = $$3;
      this.K = $$1;
      this.L = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(eov $$0) {
      this.e($$0.c, $$0.d, $$0.e);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dz(), this.dB());
   }

   public void a(ib $$0, float $$1, float $$2) {
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
      double $$0 = this.do();
      double $$1 = this.dq();
      double $$2 = this.du();
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.ab = $$0;
      this.ac = $$1;
      this.ad = $$2;
      this.M = this.dz();
      this.N = this.dB();
   }

   public float e(bof $$0) {
      float $$1 = (float)(this.do() - $$0.do());
      float $$2 = (float)(this.dq() - $$0.dq());
      float $$3 = (float)(this.du() - $$0.du());
      return awm.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.do() - $$0;
      double $$4 = this.dq() - $$1;
      double $$5 = this.du() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double f(bof $$0) {
      return this.f($$0.dh());
   }

   public double f(eov $$0) {
      double $$1 = this.do() - $$0.c;
      double $$2 = this.dq() - $$0.d;
      double $$3 = this.du() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cia $$0) {
   }

   public void g(bof $$0) {
      if (!this.x($$0)) {
         if (!$$0.ae && !this.ae) {
            double $$1 = $$0.do() - this.do();
            double $$2 = $$0.du() - this.du();
            double $$3 = awm.a($$1, $$2);
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
               if (!this.bM() && this.bu()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.bM() && $$0.bu()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void j(double $$0, double $$1, double $$2) {
      this.g(this.dm().b($$0, $$1, $$2));
      this.at = true;
   }

   protected void bq() {
      this.S = true;
   }

   public boolean a(bne $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bq();
         return false;
      }
   }

   public final eov f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dB() : awm.i($$0, this.N, this.dB());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dz() : awm.i($$0, this.M, this.dz());
   }

   protected final eov b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = awm.b($$3);
      float $$5 = awm.a($$3);
      float $$6 = awm.b($$2);
      float $$7 = awm.a($$2);
      return new eov((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final eov i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final eov c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final eov br() {
      return new eov(this.do(), this.ds(), this.du());
   }

   public final eov j(float $$0) {
      double $$1 = awm.d((double)$$0, this.J, this.do());
      double $$2 = awm.d((double)$$0, this.K, this.dq()) + (double)this.cF();
      double $$3 = awm.d((double)$$0, this.L, this.du());
      return new eov($$1, $$2, $$3);
   }

   public eov k(float $$0) {
      return this.j($$0);
   }

   public final eov l(float $$0) {
      double $$1 = awm.d((double)$$0, this.J, this.do());
      double $$2 = awm.d((double)$$0, this.K, this.dq());
      double $$3 = awm.d((double)$$0, this.L, this.du());
      return new eov($$1, $$2, $$3);
   }

   public eot a(double $$0, float $$1, boolean $$2) {
      eov $$3 = this.j($$1);
      eov $$4 = this.f($$1);
      eov $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dJ().a(new cvn($$3, $$5, cvn.a.b, $$2 ? cvn.b.c : cvn.b.a, this));
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

   public void a(bof $$0, int $$1, bne $$2) {
      if ($$0 instanceof apb) {
         am.d.a((apb)$$0, this, $$2);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.do() - $$0;
      double $$4 = this.dq() - $$1;
      double $$5 = this.du() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cE().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * n;
      return $$0 < $$1 * $$1;
   }

   public boolean d(sy $$0) {
      if (this.aI != null && !this.aI.b()) {
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

   public boolean e(sy $$0) {
      return this.bL() ? false : this.d($$0);
   }

   public sy f(sy $$0) {
      try {
         if (this.r != null) {
            $$0.a("Pos", this.a(this.r.do(), this.dq(), this.r.du()));
         } else {
            $$0.a("Pos", this.a(this.do(), this.dq(), this.du()));
         }

         eov $$1 = this.dm();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dz(), this.dB()));
         $$0.a("FallDistance", this.aa);
         $$0.a("Fire", (short)this.aK);
         $$0.a("Air", (short)this.cf());
         $$0.a("OnGround", this.aC());
         $$0.a("Invulnerable", this.aZ);
         $$0.a("PortalCooldown", this.aY);
         $$0.a("UUID", this.ct());
         vs $$2 = this.af();
         if ($$2 != null) {
            $$0.a("CustomName", vs.a.a($$2));
         }

         if (this.cy()) {
            $$0.a("CustomNameVisible", this.cy());
         }

         if (this.aU()) {
            $$0.a("Silent", this.aU());
         }

         if (this.aV()) {
            $$0.a("NoGravity", this.aV());
         }

         if (this.ba) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.cg();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.cg());
         }

         if (this.bj) {
            $$0.a("HasVisualFire", this.bj);
         }

         if (!this.bb.isEmpty()) {
            te $$4 = new te();

            for (String $$5 : this.bb) {
               $$4.add(tt.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bM()) {
            te $$6 = new te();

            for (bof $$7 : this.cM()) {
               sy $$8 = new sy();
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

   public void g(sy $$0) {
      try {
         te $$1 = $$0.c("Pos", 6);
         te $$2 = $$0.c("Motion", 6);
         te $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(awm.a($$1.h(0), -3.0000512E7, 3.0000512E7), awm.a($$1.h(1), -2.0E7, 2.0E7), awm.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.r($$3.i(0));
         this.s($$3.i(1));
         this.bp();
         this.n(this.dz());
         this.o(this.dz());
         this.aa = $$0.j("FallDistance");
         this.aK = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.k($$0.g("Air"));
         }

         this.aH = $$0.q("OnGround");
         this.aZ = $$0.q("Invulnerable");
         this.aY = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.ax = $$0.a("UUID");
            this.ay = this.ax.toString();
         }

         if (!Double.isFinite(this.do()) || !Double.isFinite(this.dq()) || !Double.isFinite(this.du())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dz()) && Double.isFinite((double)this.dB())) {
            this.ar();
            this.a(this.dz(), this.dB());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(vs.a.a($$8));
               } catch (Exception var16) {
                  c.warn("Failed to parse entity custom name {}", $$8, var16);
               }
            }

            this.n($$0.q("CustomNameVisible"));
            this.d($$0.q("Silent"));
            this.e($$0.q("NoGravity"));
            this.i($$0.q("Glowing"));
            this.l($$0.h("TicksFrozen"));
            this.bj = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.bb.clear();
               te $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.bb.add($$10.j($$12));
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
      bol<?> $$0 = this.ai();
      ajc $$1 = bol.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(sy var1);

   protected abstract void b(sy var1);

   protected te a(double... $$0) {
      te $$1 = new te();

      for (double $$2 : $$0) {
         $$1.add(sz.a($$2));
      }

      return $$1;
   }

   protected te a(float... $$0) {
      te $$1 = new te();

      for (float $$2 : $$0) {
         $$1.add(tb.a($$2));
      }

      return $$1;
   }

   @Nullable
   public cel a(cwd $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public cel a(cwd $$0, int $$1) {
      return this.a(new cpq($$0), (float)$$1);
   }

   @Nullable
   public cel b(cpq $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public cel a(cpq $$0, float $$1) {
      if ($$0.b()) {
         return null;
      } else if (this.dJ().B) {
         return null;
      } else {
         cel $$2 = new cel(this.dJ(), this.do(), this.dq() + (double)$$1, this.du(), $$0);
         $$2.u();
         this.dJ().b($$2);
         return $$2;
      }
   }

   public boolean bx() {
      return !this.dE();
   }

   public boolean by() {
      if (this.ae) {
         return false;
      } else {
         float $$0 = this.be.a() * 0.8F;
         eoq $$1 = eoq.a(this.br(), (double)$$0, 1.0E-6, (double)$$0);
         return ib.a($$1)
            .anyMatch(
               $$1x -> {
                  dme $$2 = this.dJ().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dJ(), $$1x)
                     && epl.c($$2.k(this.dJ(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), epl.a($$1), eoz.i);
               }
            );
      }
   }

   public bml a(cia $$0, bmk $$1) {
      return bml.d;
   }

   public boolean h(bof $$0) {
      return $$0.bz() && !this.x($$0);
   }

   public boolean bz() {
      return false;
   }

   public void t() {
      this.g(eov.b);
      this.l();
      if (this.bL()) {
         this.cW().i(this);
      }
   }

   public final void i(bof $$0) {
      if (this.w($$0)) {
         this.a($$0, bof::a_);
      }
   }

   protected void a(bof $$0, bof.a $$1) {
      eov $$2 = this.l($$0);
      eov $$3 = $$0.k(this);
      $$1.accept($$0, $$2.c - $$3.c, $$2.d - $$3.d, $$2.e - $$3.e);
   }

   public void j(bof $$0) {
   }

   public eov k(bof $$0) {
      return this.dg().b(bog.b, 0, this.aE);
   }

   public eov l(bof $$0) {
      return this.dh().e(this.a($$0, this.be, 1.0F));
   }

   protected eov a(bof $$0, boi $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static eov a(bof $$0, bof $$1, boh $$2) {
      int $$3 = $$0.cM().indexOf($$1);
      return $$2.c(bog.a, $$3, $$0.aE);
   }

   public boolean m(bof $$0) {
      return this.a($$0, false);
   }

   public boolean bA() {
      return this instanceof box;
   }

   public boolean a(bof $$0, boolean $$1) {
      if ($$0 == this.r) {
         return false;
      } else if (!$$0.bD()) {
         return false;
      } else {
         for (bof $$2 = $$0; $$2.r != null; $$2 = $$2.r) {
            if ($$2.r == this) {
               return false;
            }
         }

         if ($$1 || this.n($$0) && $$0.q(this)) {
            if (this.bL()) {
               this.ac();
            }

            this.b(bpi.a);
            this.r = $$0;
            this.r.o(this);
            $$0.B().filter($$0x -> $$0x instanceof apb).forEach($$0x -> am.U.a((apb)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean n(bof $$0) {
      return !this.bP() && this.I <= 0;
   }

   public void bB() {
      for (int $$0 = this.q.size() - 1; $$0 >= 0; $$0--) {
         ((bof)this.q.get($$0)).ac();
      }
   }

   public void bC() {
      if (this.r != null) {
         bof $$0 = this.r;
         this.r = null;
         $$0.p(this);
      }
   }

   public void ac() {
      this.bC();
   }

   protected void o(bof $$0) {
      if ($$0.cW() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.q.isEmpty()) {
            this.q = ImmutableList.of($$0);
         } else {
            List<bof> $$1 = Lists.newArrayList(this.q);
            if (!this.dJ().B && $$0 instanceof cia && !(this.cN() instanceof cia)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.q = ImmutableList.copyOf($$1);
         }

         this.a(dqr.s, $$0);
      }
   }

   protected void p(bof $$0) {
      if ($$0.cW() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.q.size() == 1 && this.q.get(0) == $$0) {
            this.q = ImmutableList.of();
         } else {
            this.q = this.q.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.I = 60;
         this.a(dqr.q, $$0);
      }
   }

   protected boolean q(bof $$0) {
      return this.q.isEmpty();
   }

   protected boolean bD() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public double p_() {
      return this.do();
   }

   public double N_() {
      return this.dq();
   }

   public double O_() {
      return this.du();
   }

   public float f_() {
      return this.dB();
   }

   public float q_() {
      return this.dz();
   }

   public void a(float $$0, int $$1) {
      this.n($$0);
   }

   public float bE() {
      return 0.0F;
   }

   public eov bF() {
      return this.b(this.dB(), this.dz());
   }

   public eov a(cpl $$0) {
      if (!(this instanceof cia $$1)) {
         return eov.b;
      } else {
         boolean $$2 = $$1.eS().a($$0) && !$$1.eR().a($$0);
         bor $$3 = $$2 ? $$1.fo().e() : $$1.fo();
         return this.b(0.0F, this.dz() + (float)($$3 == bor.b ? 80 : -80)).a(0.5);
      }
   }

   public eou bG() {
      return new eou(this.dB(), this.dz());
   }

   public eov bH() {
      return eov.a(this.bG());
   }

   public void f(ib $$0) {
      if (this.aw()) {
         this.au();
      } else {
         if (!this.dJ().B && !$$0.equals(this.aw)) {
            this.aw = $$0.i();
         }

         this.au = true;
      }
   }

   protected void bI() {
      if (this.dJ() instanceof apa) {
         int $$0 = this.ax();
         apa $$1 = (apa)this.dJ();
         if (this.au) {
            MinecraftServer $$2 = $$1.o();
            ajb<cwe> $$3 = this.dJ().ad() == cwe.i ? cwe.h : cwe.i;
            apa $$4 = $$2.a($$3);
            if ($$4 != null && $$2.G() && !this.bL() && this.av++ >= $$0) {
               this.dJ().ae().a("portal");
               this.av = $$0;
               this.au();
               this.b($$4);
               this.dJ().ae().c();
            }

            this.au = false;
         } else {
            if (this.av > 0) {
               this.av -= 4;
            }

            if (this.av < 0) {
               this.av = 0;
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

   public void c(bne $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dcy.a(this);
      }
   }

   public void m(float $$0) {
   }

   public boolean bK() {
      boolean $$0 = this.dJ() != null && this.dJ().B;
      return !this.aY() && (this.aK > 0 || $$0 && this.j(0));
   }

   public boolean bL() {
      return this.cW() != null;
   }

   public boolean bM() {
      return !this.q.isEmpty();
   }

   public boolean bN() {
      return this.ai().a(auh.p);
   }

   public boolean bO() {
      return !this.ai().a(auh.q);
   }

   public void f(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean bP() {
      return this.j(1);
   }

   public boolean bQ() {
      return this.bP();
   }

   public boolean bR() {
      return this.bP();
   }

   public boolean bS() {
      return this.bP();
   }

   public boolean bT() {
      return this.bP();
   }

   public boolean bU() {
      return this.c(bpi.f);
   }

   public boolean bV() {
      return this.j(3);
   }

   public void g(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean bW() {
      return this.j(4);
   }

   public boolean bX() {
      return this.c(bpi.d);
   }

   public boolean bY() {
      return this.bX() && !this.aZ();
   }

   public void h(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean bZ() {
      return this.ba;
   }

   public final void i(boolean $$0) {
      this.ba = $$0;
      this.b(6, this.ca());
   }

   public boolean ca() {
      return this.dJ().y_() ? this.j(6) : this.ba;
   }

   public boolean cb() {
      return this.j(5);
   }

   public boolean d(cia $$0) {
      if ($$0.P_()) {
         return false;
      } else {
         eqb $$1 = this.cd();
         return $$1 != null && $$0 != null && $$0.cd() == $$1 && $$1.i() ? false : this.cb();
      }
   }

   public boolean cc() {
      return false;
   }

   public void a(BiConsumer<dqo<?>, apa> $$0) {
   }

   @Nullable
   public epu cd() {
      return this.dJ().K().e(this.cv());
   }

   public boolean r(bof $$0) {
      return this.a($$0.cd());
   }

   public boolean a(eqb $$0) {
      return this.cd() != null ? this.cd().a($$0) : false;
   }

   public void j(boolean $$0) {
      this.b(5, $$0);
   }

   protected boolean j(int $$0) {
      return (this.am.b(an) & 1 << $$0) != 0;
   }

   protected void b(int $$0, boolean $$1) {
      byte $$2 = this.am.b(an);
      if ($$1) {
         this.am.b(an, (byte)($$2 | 1 << $$0));
      } else {
         this.am.b(an, (byte)($$2 & ~(1 << $$0)));
      }
   }

   public int ce() {
      return 300;
   }

   public int cf() {
      return this.am.b(aQ);
   }

   public void k(int $$0) {
      this.am.b(aQ, $$0);
   }

   public int cg() {
      return this.am.b(aV);
   }

   public void l(int $$0) {
      this.am.b(aV, $$0);
   }

   public float ch() {
      int $$0 = this.cj();
      return (float)Math.min(this.cg(), $$0) / (float)$$0;
   }

   public boolean ci() {
      return this.cg() >= this.cj();
   }

   public int cj() {
      return 140;
   }

   public void a(apa $$0, bow $$1) {
      this.i(this.aK + 1);
      if (this.aK == 0) {
         this.g(8);
      }

      this.a(this.dK().b(), 5.0F);
   }

   public void k(boolean $$0) {
      eov $$1 = this.dm();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void l(boolean $$0) {
      eov $$1 = this.dm();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(apa $$0, box $$1) {
      return true;
   }

   public void ck() {
      if (this.dm().b() > -0.5 && this.aa > 1.0F) {
         this.aa = 1.0F;
      }
   }

   public void n() {
      this.aa = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      ib $$3 = ib.a($$0, $$1, $$2);
      eov $$4 = new eov($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      ib.a $$5 = new ib.a();
      ih $$6 = ih.b;
      double $$7 = Double.MAX_VALUE;

      for (ih $$8 : new ih[]{ih.c, ih.d, ih.e, ih.f, ih.b}) {
         $$5.a($$3, $$8);
         if (!this.dJ().a_($$5).r(this.dJ(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == ih.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.af.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      eov $$13 = this.dm().a(0.75);
      if ($$6.o() == ih.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == ih.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == ih.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dme $$0, eov $$1) {
      this.n();
      this.T = $$1;
   }

   private static vs c(vs $$0) {
      wg $$1 = $$0.e().b($$0.a().a(null));

      for (vs $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public vs ad() {
      vs $$0 = this.af();
      return $$0 != null ? c($$0) : this.cl();
   }

   protected vs cl() {
      return this.o.h();
   }

   public boolean s(bof $$0) {
      return this == $$0;
   }

   public float cm() {
      return 0.0F;
   }

   public void n(float $$0) {
   }

   public void o(float $$0) {
   }

   public boolean cn() {
      return true;
   }

   public boolean t(bof $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dJ() == null ? "~NULL~" : this.dJ().toString();
      return this.aI != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.ad().getString(),
            this.p,
            $$0,
            this.do(),
            this.dq(),
            this.du(),
            this.aI
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.ad().getString(),
            this.p,
            $$0,
            this.do(),
            this.dq(),
            this.du()
         );
   }

   public boolean b(bne $$0) {
      return this.dE() || this.aZ && !$$0.a(aug.e) && !$$0.g() || $$0.a(aug.j) && this.aY() || $$0.a(aug.n) && this.ai().a(auh.o);
   }

   public boolean co() {
      return this.aZ;
   }

   public void m(boolean $$0) {
      this.aZ = $$0;
   }

   public void u(bof $$0) {
      this.b($$0.do(), $$0.dq(), $$0.du(), $$0.dz(), $$0.dB());
   }

   public void v(bof $$0) {
      sy $$1 = $$0.f(new sy());
      $$1.r("Dimension");
      this.g($$1);
      this.aY = $$0.aY;
      this.aw = $$0.aw;
   }

   @Nullable
   public bof b(apa $$0) {
      if (this.dJ() instanceof apa && !this.dE()) {
         this.dJ().ae().a("changeDimension");
         this.ag();
         this.dJ().ae().a("reposition");
         eio $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dJ().ae().b("reloading");
            bof $$2 = this.ai().a((cwe)$$0);
            if ($$2 != null) {
               $$2.v(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dB());
               $$2.g($$1.b);
               $$0.d($$2);
               if ($$0.ad() == cwe.j) {
                  apa.a($$0);
               }
            }

            this.cp();
            this.dJ().ae().c();
            ((apa)this.dJ()).h();
            $$0.h();
            this.dJ().ae().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void cp() {
      this.b(bof.c.e);
   }

   @Nullable
   protected eio a(apa $$0) {
      boolean $$1 = this.dJ().ad() == cwe.j && $$0.ad() == cwe.h;
      boolean $$2 = $$0.ad() == cwe.j;
      if (!$$1 && !$$2) {
         boolean $$6 = $$0.ad() == cwe.i;
         if (this.dJ().ad() != cwe.i && !$$6) {
            return null;
         } else {
            dnv $$7 = $$0.D_();
            double $$8 = dpq.a(this.dJ().E_(), $$0.E_());
            ib $$9 = $$7.b(this.do() * $$8, this.dq(), this.du() * $$8);
            return this.a($$0, $$9, $$6, $$7).map($$1x -> {
               dme $$2x = this.dJ().a_(this.aw);
               ih.a $$3;
               eov $$5;
               if ($$2x.b(dmu.H)) {
                  $$3 = $$2x.c(dmu.H);
                  l.a $$4 = l.a(this.aw, $$3, 21, ih.a.b, 21, $$1xx -> this.dJ().a_($$1xx) == $$2x);
                  $$5 = this.a($$3, $$4);
               } else {
                  $$3 = ih.a.a;
                  $$5 = new eov(0.5, 0.0, 0.0);
               }

               return eip.a($$0, $$1x, $$3, $$5, this, this.dm(), this.dz(), this.dB());
            }).orElse(null);
         }
      } else {
         ib $$3 = $$2 ? apa.a : $$0.T();
         $$0.l().a(apf.f, new cvl($$3), 3, $$3);
         int $$4;
         if ($$2) {
            $$4 = $$3.v();
         } else {
            $$4 = $$0.m($$3).a(drq.a.f, $$3.u(), $$3.w()) + 1;
         }

         return new eio(new eov((double)$$3.u() + 0.5, (double)$$4, (double)$$3.w() + 0.5), this.dm(), this.dz(), this.dB());
      }
   }

   protected eov a(ih.a $$0, l.a $$1) {
      return eip.a($$1, $$0, this.dh(), this.a(this.ap()));
   }

   protected Optional<l.a> a(apa $$0, ib $$1, boolean $$2, dnv $$3) {
      return $$0.p().a($$1, $$2, $$3);
   }

   public boolean cq() {
      return !this.bL() && !this.bM();
   }

   public float a(cvw $$0, cvk $$1, ib $$2, dme $$3, ehr $$4, float $$5) {
      return $$5;
   }

   public boolean a(cvw $$0, cvk $$1, ib $$2, dme $$3, float $$4) {
      return true;
   }

   public int cr() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bol.a(this.ai()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.p);
      $$0.a("Entity Name", () -> this.ad().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.do(), this.dq(), this.du()));
      $$0.a("Entity's Block location", p.a(this.dJ(), awm.a(this.do()), awm.a(this.dq()), awm.a(this.du())));
      eov $$1 = this.dm();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", () -> this.cM().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.cW()));
   }

   public boolean cs() {
      return this.bK() && !this.P_();
   }

   public void a_(UUID $$0) {
      this.ax = $$0;
      this.ay = this.ax.toString();
   }

   @Override
   public UUID ct() {
      return this.ax;
   }

   public String cu() {
      return this.ay;
   }

   @Override
   public String cv() {
      return this.ay;
   }

   public boolean cw() {
      return true;
   }

   public static double cx() {
      return n;
   }

   public static void b(double $$0) {
      n = $$0;
   }

   @Override
   public vs Q_() {
      return epu.a(this.cd(), this.ad()).a($$0 -> $$0.a(this.cD()).a(this.cu()));
   }

   public void b(@Nullable vs $$0) {
      this.am.b(aR, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public vs af() {
      return this.am.b(aR).orElse(null);
   }

   @Override
   public boolean ae() {
      return this.am.b(aR).isPresent();
   }

   public void n(boolean $$0) {
      this.am.b(aS, $$0);
   }

   public boolean cy() {
      return this.am.b(aS);
   }

   public final void n(double $$0, double $$1, double $$2) {
      if (this.dJ() instanceof apa) {
         cvl $$3 = new cvl(ib.a($$0, $$1, $$2));
         ((apa)this.dJ()).l().a(apf.g, $$3, 0, this.aj());
         this.dJ().d($$3.e, $$3.f);
         this.c($$0, $$1, $$2);
      }
   }

   public boolean a(apa $$0, double $$1, double $$2, double $$3, Set<bpk> $$4, float $$5, float $$6) {
      float $$7 = awm.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dJ()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.z();
         this.n($$5);
      } else {
         this.ag();
         bof $$8 = this.ai().a((cwe)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.v(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(bof.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dJ() instanceof apa) {
         this.b($$0, $$1, $$2, this.dz(), this.dB());
         this.z();
      }
   }

   private void z() {
      this.cO().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.q.iterator();

         while (var1.hasNext()) {
            bof $$1 = (bof)var1.next();
            $$0.a($$1, bof::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.do() + $$0, this.dq() + $$1, this.du() + $$2);
   }

   public boolean cz() {
      return this.cy();
   }

   public void b(List<ail.b<?>> $$0) {
   }

   public void a(aii<?> $$0) {
      if (ar.equals($$0)) {
         this.k_();
      }
   }

   @Deprecated
   protected void cA() {
      bpi $$0 = this.ap();
      boi $$1 = this.a($$0);
      this.be = $$1;
      this.bf = $$1.c();
   }

   public void k_() {
      boi $$0 = this.be;
      bpi $$1 = this.ap();
      boi $$2 = this.a($$1);
      this.be = $$2;
      this.bf = $$2.c();
      this.ar();
      boolean $$3 = (double)$$2.a() <= 4.0 && (double)$$2.b() <= 4.0;
      if (!this.dJ().B && !this.al && !this.ae && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cia)) {
         eov $$4 = this.dh().b(0.0, (double)$$0.b() / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a() - $$0.a()) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b() - $$0.b()) + 1.0E-6;
         epo $$7 = epl.a(eoq.a($$4, $$5, $$6, $$5));
         this.dJ().a(this, $$7, $$4, (double)$$2.a(), (double)$$2.b(), (double)$$2.a()).ifPresent($$1x -> this.b($$1x.b(0.0, (double)(-$$2.b()) / 2.0, 0.0)));
      }
   }

   public ih cB() {
      return ih.a((double)this.dz());
   }

   public ih cC() {
      return this.cB();
   }

   protected vy cD() {
      return new vy(vy.a.c, new vy.b(this.ai(), this.ct(), this.ad()));
   }

   public boolean a(apb $$0) {
      return true;
   }

   @Override
   public final eoq cE() {
      return this.aG;
   }

   public eoq i_() {
      return this.cE();
   }

   public final void a(eoq $$0) {
      this.aG = $$0;
   }

   public final float d(bpi $$0) {
      return this.a($$0).c();
   }

   public final float cF() {
      return this.bf;
   }

   public eov p(float $$0) {
      return this.cG();
   }

   protected eov cG() {
      return new eov(0.0, (double)this.cF(), (double)(this.dd() * 0.4F));
   }

   public bpo a_(int $$0) {
      return bpo.b;
   }

   @Override
   public void a(vs $$0) {
   }

   public cwe cH() {
      return this.dJ();
   }

   @Nullable
   public MinecraftServer cI() {
      return this.dJ().o();
   }

   public bml a(cia $$0, eov $$1, bmk $$2) {
      return bml.d;
   }

   public boolean a(cvw $$0) {
      return false;
   }

   public void a(box $$0, bof $$1) {
      if ($$1 instanceof box) {
         cua.a((box)$$1, $$0);
      }

      cua.b($$0, $$1);
   }

   public void c(apb $$0) {
   }

   public void d(apb $$0) {
   }

   public float a(dfr $$0) {
      float $$1 = awm.g(this.dz());
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

   public float a(deb $$0) {
      float $$1 = awm.g(this.dz());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public boolean cJ() {
      return false;
   }

   public cit a(cis $$0) {
      return this.ai().a(auh.r) ? cit.b : cit.a;
   }

   @Nullable
   public box cK() {
      return null;
   }

   public final boolean cL() {
      return this.cK() != null;
   }

   public final List<bof> cM() {
      return this.q;
   }

   @Nullable
   public bof cN() {
      return this.q.isEmpty() ? null : (bof)this.q.get(0);
   }

   public boolean w(bof $$0) {
      return this.q.contains($$0);
   }

   public boolean a(Predicate<bof> $$0) {
      UnmodifiableIterator var2 = this.q.iterator();

      while (var2.hasNext()) {
         bof $$1 = (bof)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bof> B() {
      return this.q.stream().flatMap(bof::cO);
   }

   @Override
   public Stream<bof> cO() {
      return Stream.concat(Stream.of(this), this.B());
   }

   @Override
   public Stream<bof> cP() {
      return Stream.concat(this.q.stream().flatMap(bof::cP), Stream.of(this));
   }

   public Iterable<bof> cQ() {
      return () -> this.B().iterator();
   }

   public int cR() {
      return (int)this.B().filter($$0 -> $$0 instanceof cia).count();
   }

   public boolean cS() {
      return this.cR() == 1;
   }

   public bof cT() {
      bof $$0 = this;

      while ($$0.bL()) {
         $$0 = $$0.cW();
      }

      return $$0;
   }

   public boolean x(bof $$0) {
      return this.cT() == $$0.cT();
   }

   public boolean y(bof $$0) {
      if (!$$0.bL()) {
         return false;
      } else {
         bof $$1 = $$0.cW();
         return $$1 == this ? true : this.y($$1);
      }
   }

   public boolean cU() {
      return this.cK() instanceof cia $$0 ? $$0.g() : this.cV();
   }

   public boolean cV() {
      return !this.dJ().B;
   }

   protected static eov a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -awm.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = awm.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new eov((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public eov b(box $$0) {
      return new eov(this.do(), this.cE().e, this.du());
   }

   @Nullable
   public bof cW() {
      return this.r;
   }

   @Nullable
   public bof cX() {
      return this.r != null && this.r.cK() == this ? this.r : null;
   }

   public ehw s_() {
      return ehw.a;
   }

   public atq cY() {
      return atq.g;
   }

   protected int cZ() {
      return 1;
   }

   public du da() {
      return new du(
         this, this.dh(), this.bG(), this.dJ() instanceof apa ? (apa)this.dJ() : null, this.F(), this.ad().getString(), this.Q_(), this.dJ().o(), this
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
      return this.dJ().Z().b(cwa.p);
   }

   @Override
   public boolean x_() {
      return true;
   }

   @Override
   public boolean W_() {
      return true;
   }

   public void a(eg.a $$0, eov $$1) {
      eov $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.s(awm.g((float)(-(awm.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.r(awm.g((float)(awm.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dz());
      this.N = this.dB();
      this.M = this.dz();
   }

   public boolean a(aut<ehq> $$0, double $$1) {
      if (this.db()) {
         return false;
      } else {
         eoq $$2 = this.cE().h(0.001);
         int $$3 = awm.a($$2.a);
         int $$4 = awm.c($$2.d);
         int $$5 = awm.a($$2.b);
         int $$6 = awm.c($$2.e);
         int $$7 = awm.a($$2.c);
         int $$8 = awm.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cw();
         boolean $$11 = false;
         eov $$12 = eov.b;
         int $$13 = 0;
         ib.a $$14 = new ib.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  ehr $$18 = this.dJ().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((cvk)this.dJ(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           eov $$20 = $$18.c(this.dJ(), $$14);
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

            if (!(this instanceof cia)) {
               $$12 = $$12.d();
            }

            eov $$21 = this.dm();
            $$12 = $$12.a($$1 * 1.0);
            double $$22 = 0.003;
            if (Math.abs($$21.c) < 0.003 && Math.abs($$21.e) < 0.003 && $$12.f() < 0.0045000000000000005) {
               $$12 = $$12.d().a(0.0045000000000000005);
            }

            this.g(this.dm().e($$12));
         }

         this.ai.put($$0, $$9);
         return $$11;
      }
   }

   public boolean db() {
      eoq $$0 = this.cE().g(1.0);
      int $$1 = awm.a($$0.a);
      int $$2 = awm.c($$0.d);
      int $$3 = awm.a($$0.c);
      int $$4 = awm.c($$0.f);
      return !this.dJ().b($$1, $$3, $$2, $$4);
   }

   public double b(aut<ehq> $$0) {
      return this.ai.getDouble($$0);
   }

   public double dc() {
      return (double)this.cF() < 0.4 ? 0.0 : 0.4;
   }

   public final float dd() {
      return this.be.a();
   }

   public final float de() {
      return this.be.b();
   }

   public xz<aai> df() {
      return new aaj(this);
   }

   public boi a(bpi $$0) {
      return this.o.n();
   }

   public final boh dg() {
      return this.be.d();
   }

   public eov dh() {
      return this.t;
   }

   public eov di() {
      return this.dh();
   }

   @Override
   public ib dj() {
      return this.u;
   }

   public dme dk() {
      if (this.bk == null) {
         this.bk = this.dJ().a_(this.dj());
      }

      return this.bk;
   }

   public cvl dl() {
      return this.v;
   }

   public eov dm() {
      return this.aD;
   }

   public void g(eov $$0) {
      this.aD = $$0;
   }

   public void h(eov $$0) {
      this.g(this.dm().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.g(new eov($$0, $$1, $$2));
   }

   public final int dn() {
      return this.u.u();
   }

   public final double do() {
      return this.t.c;
   }

   public double c(double $$0) {
      return this.t.c + (double)this.dd() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.af.j() - 1.0) * $$0);
   }

   public final int dp() {
      return this.u.v();
   }

   public final double dq() {
      return this.t.d;
   }

   public double e(double $$0) {
      return this.t.d + (double)this.de() * $$0;
   }

   public double dr() {
      return this.e(this.af.j());
   }

   public double ds() {
      return this.t.d + (double)this.bf;
   }

   public final int dt() {
      return this.u.w();
   }

   public final double du() {
      return this.t.e;
   }

   public double f(double $$0) {
      return this.t.e + (double)this.dd() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.af.j() - 1.0) * $$0);
   }

   public final void p(double $$0, double $$1, double $$2) {
      if (this.t.c != $$0 || this.t.d != $$1 || this.t.e != $$2) {
         this.t = new eov($$0, $$1, $$2);
         int $$3 = awm.a($$0);
         int $$4 = awm.a($$1);
         int $$5 = awm.a($$2);
         if ($$3 != this.u.u() || $$4 != this.u.v() || $$5 != this.u.w()) {
            this.u = new ib($$3, $$4, $$5);
            this.bk = null;
            if (jd.a($$3) != this.v.e || jd.a($$5) != this.v.f) {
               this.v = new cvl(this.u);
            }
         }

         this.aW.a();
      }
   }

   public void dv() {
   }

   public eov q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bf * 0.7, 0.0);
   }

   public void a(aaj $$0) {
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
   public cpq dw() {
      return null;
   }

   public void o(boolean $$0) {
      this.az = $$0;
   }

   public boolean dx() {
      return !this.ai().a(auh.k);
   }

   public boolean dy() {
      return (this.az || this.aA) && this.dx();
   }

   public float dz() {
      return this.aE;
   }

   public float dA() {
      return this.dz();
   }

   public void r(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aE = $$0;
      }
   }

   public float dB() {
      return this.aF;
   }

   public void s(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aF = $$0;
      }
   }

   public boolean dC() {
      return false;
   }

   public float dD() {
      return 0.0F;
   }

   public final boolean dE() {
      return this.aI != null;
   }

   @Nullable
   public bof.c dF() {
      return this.aI;
   }

   @Override
   public final void b(bof.c $$0) {
      if (this.aI == null) {
         this.aI = $$0;
      }

      if (this.aI.a()) {
         this.ac();
      }

      this.cM().forEach(bof::ac);
      this.aW.a($$0);
   }

   protected void dG() {
      this.aI = null;
   }

   @Override
   public void a(dpz $$0) {
      this.aW = $$0;
   }

   @Override
   public boolean dH() {
      if (this.aI != null && !this.aI.b()) {
         return false;
      } else {
         return this.bL() ? false : !this.bM() || !this.cS();
      }
   }

   @Override
   public boolean dI() {
      return false;
   }

   public boolean a(cwe $$0, ib $$1) {
      return true;
   }

   public cwe dJ() {
      return this.s;
   }

   protected void a(cwe $$0) {
      this.s = $$0;
   }

   public bnf dK() {
      return this.dJ().ah();
   }

   public iy dL() {
      return this.dJ().I_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = awm.d($$6, this.do(), $$1);
      double $$8 = awm.d($$6, this.dq(), $$2);
      double $$9 = awm.d($$6, this.du(), $$3);
      float $$10 = (float)awm.e($$6, (double)this.dz(), $$4);
      float $$11 = (float)awm.d($$6, (double)this.dB(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   @FunctionalInterface
   public interface a {
      void accept(bof var1, double var2, double var4, double var6);
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
