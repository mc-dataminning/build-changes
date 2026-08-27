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

public abstract class bql implements ajn, bov, dty, eb, eui {
   private static final Logger c = LogUtils.getLogger();
   public static final String w = "id";
   public static final String x = "Passengers";
   private static final AtomicInteger d = new AtomicInteger();
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
   private static final eta e = new eta(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double k = 0.014;
   private static final double l = 0.007;
   private static final double m = 0.0023333333333333335;
   public static final String I = "UUID";
   private static double n = 1.0;
   private final bqr<?> o;
   private int p = d.incrementAndGet();
   public boolean J;
   private ImmutableList<bql> q = ImmutableList.of();
   protected int K;
   @Nullable
   private bql r;
   private czu s;
   public double L;
   public double M;
   public double N;
   private etf t;
   private im u;
   private czb v;
   private etf aF = etf.b;
   private float aG;
   private float aH;
   public float O;
   public float P;
   private eta aI = e;
   private boolean aJ;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   public boolean U;
   protected etf V = etf.b;
   @Nullable
   private bql.c aK;
   public static final float W = 0.6F;
   public static final float X = 1.8F;
   public float Y;
   public float Z;
   public float aa;
   public float ab;
   public float ac;
   private float aL = 1.0F;
   public double ad;
   public double ae;
   public double af;
   public boolean ag;
   protected final ayd ah = ayd.a();
   public int ai;
   private int aM = -this.dd();
   protected boolean aj;
   protected Object2DoubleMap<awd<elq>> ak = new Object2DoubleArrayMap(2);
   protected boolean al;
   private final Set<awd<elq>> aN = new HashSet<>();
   public int am;
   protected boolean an = true;
   protected final ajo ao;
   protected static final ajk<Byte> ap = ajo.a(bql.class, ajm.a);
   protected static final int aq = 0;
   private static final int aO = 1;
   private static final int aP = 3;
   private static final int aQ = 4;
   private static final int aR = 5;
   protected static final int ar = 6;
   protected static final int as = 7;
   private static final ajk<Integer> aS = ajo.a(bql.class, ajm.b);
   private static final ajk<Optional<ws>> aT = ajo.a(bql.class, ajm.g);
   private static final ajk<Boolean> aU = ajo.a(bql.class, ajm.k);
   private static final ajk<Boolean> aV = ajo.a(bql.class, ajm.k);
   private static final ajk<Boolean> aW = ajo.a(bql.class, ajm.k);
   protected static final ajk<brp> at = ajo.a(bql.class, ajm.w);
   private static final ajk<Integer> aX = ajo.a(bql.class, ajm.b);
   private dtz aY = dtz.a;
   private final ahu aZ = new ahu();
   public boolean au;
   public boolean av;
   private int ba;
   protected boolean aw;
   protected int ax;
   protected im ay;
   private boolean bb;
   protected UUID az = axw.a(this.ah);
   protected String aA = this.az.toString();
   private boolean bc;
   private final Set<String> bd = Sets.newHashSet();
   private final double[] be = new double[]{0.0, 0.0, 0.0};
   private long bf;
   private bqo bg;
   private float bh;
   public boolean aB;
   public boolean aC;
   public boolean aD;
   public Optional<im> aE = Optional.empty();
   private boolean bi = false;
   private float bj;
   private int bk;
   private boolean bl;
   @Nullable
   private dpy bm = null;

   public bql(bqr<?> $$0, czu $$1) {
      this.o = $$0;
      this.s = $$1;
      this.bg = $$0.n();
      this.t = etf.b;
      this.u = im.c;
      this.v = czb.b;
      ajo.a $$2 = new ajo.a(this);
      $$2.a(ap, (byte)0);
      $$2.a(aS, this.ci());
      $$2.a(aU, false);
      $$2.a(aT, Optional.empty());
      $$2.a(aV, false);
      $$2.a(aW, false);
      $$2.a(at, brp.a);
      $$2.a(aX, 0);
      this.a($$2);
      this.ao = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.bh = this.bg.c();
   }

   public boolean a(im $$0, dpy $$1) {
      ety $$2 = $$1.b(this.dN(), $$0, etk.a(this));
      ety $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return etv.c($$3, etv.a(this.cI()), etj.i);
   }

   public int i_() {
      eul $$0 = this.ch();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean N_() {
      return false;
   }

   public final void ag() {
      if (this.bQ()) {
         this.bF();
      }

      if (this.bP()) {
         this.ac();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.aZ.e(new etf($$0, $$1, $$2));
   }

   public ahu ah() {
      return this.aZ;
   }

   public bqr<?> ai() {
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
      return this.bd;
   }

   public boolean a(String $$0) {
      return this.bd.size() >= 1024 ? false : this.bd.add($$0);
   }

   public boolean b(String $$0) {
      return this.bd.remove($$0);
   }

   public void al() {
      this.a(bql.c.a);
      this.a(dur.p);
   }

   public final void am() {
      this.a(bql.c.b);
   }

   protected abstract void a(ajo.a var1);

   public ajo an() {
      return this.ao;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bql ? ((bql)$$0).p == this.p : false;
   }

   @Override
   public int hashCode() {
      return this.p;
   }

   public void a(bql.c $$0) {
      this.b($$0);
   }

   public void ao() {
   }

   public void b(brp $$0) {
      this.ao.a(at, $$0);
   }

   public brp ap() {
      return this.ao.a(at);
   }

   public boolean c(brp $$0) {
      return this.ap() == $$0;
   }

   public boolean a(bql $$0, double $$1) {
      return this.dl().a((jf)$$0.dl(), $$1);
   }

   public boolean a(bql $$0, double $$1, double $$2) {
      double $$3 = $$0.ds() - this.ds();
      double $$4 = $$0.du() - this.du();
      double $$5 = $$0.dy() - this.dy();
      return axw.e($$3, $$5) < axw.k($$1) && axw.k($$4) < axw.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.r($$0 % 360.0F);
      this.s($$1 % 360.0F);
   }

   public final void b(etf $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.aq());
   }

   protected eta aq() {
      return this.bg.a(this.t);
   }

   protected void ar() {
      this.a_(this.t.c, this.t.d, this.t.e);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.s(this.dF() + $$2);
      this.r(this.dD() + $$3);
      this.s(axw.a(this.dF(), -90.0F, 90.0F));
      this.P += $$2;
      this.O += $$3;
      this.P = axw.a(this.P, -90.0F, 90.0F);
      if (this.r != null) {
         this.r.k(this);
      }
   }

   public void l() {
      this.as();
   }

   public void as() {
      this.dN().af().a("entityBaseTick");
      this.bm = null;
      if (this.bP() && this.da().dI()) {
         this.ac();
      }

      if (this.K > 0) {
         this.K--;
      }

      this.Y = this.Z;
      this.P = this.dF();
      this.O = this.dD();
      this.bM();
      if (this.bo()) {
         this.bp();
      }

      this.aC = this.aB;
      this.aB = false;
      this.bj();
      this.x();
      this.bi();
      if (this.dN().B) {
         this.aA();
      } else if (this.aM > 0) {
         if (this.bb()) {
            this.i(this.aM - 4);
            if (this.aM < 0) {
               this.aA();
            }
         } else {
            if (this.aM % 20 == 0 && !this.bq()) {
               this.a(this.dO().c(), 1.0F);
            }

            this.i(this.aM - 1);
         }

         if (this.ck() > 0) {
            this.l(0);
            this.dN().a(null, 1009, this.u, 1);
         }
      }

      if (this.bq()) {
         this.ay();
         this.ac *= 0.5F;
      }

      this.at();
      if (!this.dN().B) {
         this.c(this.aM > 0);
      }

      this.an = false;
      this.dN().af().c();
   }

   public void c(boolean $$0) {
      this.b(0, $$0 || this.bl);
   }

   public void at() {
      if (this.du() < (double)(this.dN().I_() - 64)) {
         this.aB();
      }
   }

   public void au() {
      this.ba = this.bN();
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
      if (!this.bb()) {
         this.g(15);
         if (this.a(this.dO().d(), 4.0F)) {
            this.a(auz.jV, 0.4F, 2.0F + this.ah.i() * 0.4F);
         }
      }
   }

   public final void g(int $$0) {
      this.h($$0 * 20);
   }

   public void h(int $$0) {
      if (this.aM < $$0) {
         this.i($$0);
      }
   }

   public void i(int $$0) {
      this.aM = $$0;
   }

   public int az() {
      return this.aM;
   }

   public void aA() {
      this.i(0);
   }

   protected void aB() {
      this.am();
   }

   public boolean g(double $$0, double $$1, double $$2) {
      return this.b(this.cI().d($$0, $$1, $$2));
   }

   private boolean b(eta $$0) {
      return this.dN().a(this, $$0) && !this.dN().d($$0);
   }

   public void d(boolean $$0) {
      this.aJ = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, etf $$1) {
      this.aJ = $$0;
      this.b($$0, $$1);
   }

   public boolean d(im $$0) {
      return this.aE.isPresent() && this.aE.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable etf $$1) {
      if ($$0) {
         eta $$2 = this.cI();
         eta $$3 = new eta($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<im> $$4 = this.s.g(this, $$3);
         if ($$4.isPresent() || this.bi) {
            this.aE = $$4;
         } else if ($$1 != null) {
            eta $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
            $$4 = this.s.g(this, $$5);
            this.aE = $$4;
         }

         this.bi = $$4.isEmpty();
      } else {
         this.bi = false;
         if (this.aE.isPresent()) {
            this.aE = Optional.empty();
         }
      }
   }

   public boolean aC() {
      return this.aJ;
   }

   public void a(brj $$0, etf $$1) {
      if (this.ag) {
         this.a_(this.ds() + $$1.c, this.du() + $$1.d, this.dy() + $$1.e);
      } else {
         this.aD = this.bO();
         if ($$0 == brj.c) {
            $$1 = this.d($$1);
            if ($$1.equals(etf.b)) {
               return;
            }
         }

         this.dN().af().a("move");
         if (this.V.g() > 1.0E-7) {
            $$1 = $$1.h(this.V);
            this.V = etf.b;
            this.g(etf.b);
         }

         $$1 = this.a($$1, $$0);
         etf $$2 = this.a($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ac != 0.0F && $$3 >= 1.0) {
               etb $$4 = this.dN().a(new czd(this.dl(), this.dl().e($$2), czd.a.d, czd.b.d, this));
               if ($$4.c() != etd.a.a) {
                  this.n();
               }
            }

            this.a_(this.ds() + $$2.c, this.du() + $$2.d, this.dy() + $$2.e);
         }

         this.dN().af().c();
         this.dN().af().a("rest");
         boolean $$5 = !axw.b($$1.c, $$2.c);
         boolean $$6 = !axw.b($$1.e, $$2.e);
         this.Q = $$5 || $$6;
         this.R = $$1.d != $$2.d;
         this.S = this.R && $$1.d < 0.0;
         if (this.Q) {
            this.T = this.c($$2);
         } else {
            this.T = false;
         }

         this.a(this.S, $$2);
         im $$7 = this.aH();
         dpy $$8 = this.dN().a_($$7);
         this.a($$2.d, this.aC(), $$8, $$7);
         if (this.dI()) {
            this.dN().af().c();
         } else {
            if (this.Q) {
               etf $$9 = this.dq();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            dcv $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dN(), this);
            }

            if (this.aC()) {
               $$10.a(this.dN(), $$7, $$8, this);
            }

            bql.b $$11 = this.aZ();
            if ($$11.a() && !this.bP()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.ab = this.ab + (float)($$2.f() * 0.6);
               im $$15 = this.aJ();
               dpy $$16 = this.dN().a_($$15);
               boolean $$17 = this.c($$16);
               if (!$$17) {
                  $$13 = 0.0;
               }

               this.Z = this.Z + (float)$$2.h() * 0.6F;
               this.aa = this.aa + (float)Math.sqrt($$12 * $$12 + $$13 * $$13 + $$14 * $$14) * 0.6F;
               if (this.aa > this.aL && !$$16.i()) {
                  boolean $$18 = $$15.equals($$7);
                  boolean $$19 = this.a($$7, $$8, $$11.c(), $$18, $$1);
                  if (!$$18) {
                     $$19 |= this.a($$15, $$16, false, $$11.b(), $$1);
                  }

                  if ($$19) {
                     this.aL = this.aM();
                  } else if (this.bc()) {
                     this.aL = this.aM();
                     if ($$11.c()) {
                        this.aR();
                     }

                     if ($$11.b()) {
                        this.a(dur.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aG();
               }
            }

            this.aD();
            float $$20 = this.aL();
            this.g(this.dq().d((double)$$20, 1.0, (double)$$20));
            if (this.dN().c(this.cI().h(1.0E-6)).noneMatch($$0x -> $$0x.a(avo.aK) || $$0x.a(dcx.H))) {
               if (this.aM <= 0) {
                  this.i(-this.dd());
               }

               if (this.aD && (this.aB || this.be())) {
                  this.aE();
               }
            }

            if (this.bO() && (this.aB || this.be())) {
               this.i(-this.dd());
            }

            this.dN().af().c();
         }
      }
   }

   private boolean c(dpy $$0) {
      return $$0.a(avo.aP) || $$0.a(dcx.qP);
   }

   private boolean a(im $$0, dpy $$1, boolean $$2, boolean $$3, etf $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aC() || $$5 || this.bY() && $$4.d == 0.0 || this.cg()) && !this.ca()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dN().a(dur.P, this.dl(), dur.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(etf $$0) {
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
      this.a(auz.ka, 0.7F, 1.6F + (this.ah.i() - this.ah.i()) * 0.4F);
   }

   public void aF() {
      if (!this.dN().B && this.aD) {
         this.aE();
      }

      this.aA();
   }

   protected void aG() {
      if (this.aT()) {
         this.aS();
         if (this.aZ().b()) {
            this.a(dur.x);
         }
      }
   }

   @Deprecated
   public im aH() {
      return this.d(0.2F);
   }

   protected im aI() {
      return this.d(0.500001F);
   }

   public im aJ() {
      return this.d(1.0E-5F);
   }

   protected im d(float $$0) {
      if (this.aE.isPresent()) {
         im $$1 = this.aE.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dpy $$2 = this.dN().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(avo.S)) && !$$2.a(avo.L) && !($$2.b() instanceof dfu) ? $$1.h(axw.a(this.t.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = axw.a(this.t.c);
         int $$4 = axw.a(this.t.d - (double)$$0);
         int $$5 = axw.a(this.t.e);
         return new im($$3, $$4, $$5);
      }
   }

   protected float aK() {
      float $$0 = this.dN().a_(this.dn()).b().j();
      float $$1 = this.dN().a_(this.aI()).b().j();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aL() {
      dpy $$0 = this.dN().a_(this.dn());
      float $$1 = $$0.b().i();
      if (!$$0.a(dcx.G) && !$$0.a(dcx.nd)) {
         return (double)$$1 == 1.0 ? this.dN().a_(this.aI()).b().i() : $$1;
      } else {
         return $$1;
      }
   }

   protected etf a(etf $$0, brj $$1) {
      return $$0;
   }

   protected etf d(etf $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dN().Y();
         if ($$1 != this.bf) {
            Arrays.fill(this.be, 0.0);
            this.bf = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(ir.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? etf.b : new etf($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(ir.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? etf.b : new etf(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(ir.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? etf.b : new etf(0.0, 0.0, $$4);
         } else {
            return etf.b;
         }
      }
   }

   private double a(ir.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = axw.a($$1 + this.be[$$2], -0.51, 0.51);
      $$1 = $$3 - this.be[$$2];
      this.be[$$2] = $$3;
      return $$1;
   }

   private etf a(etf $$0) {
      eta $$1 = this.cI();
      List<ety> $$2 = this.dN().c(this, $$1.b($$0));
      etf $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dN(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.aC() || $$5 && $$0.d < 0.0;
      if (this.dH() > 0.0F && $$7 && ($$4 || $$6)) {
         etf $$8 = a(this, new etf($$0.c, (double)this.dH(), $$0.e), $$1, this.dN(), $$2);
         etf $$9 = a(this, new etf(0.0, (double)this.dH(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dN(), $$2);
         if ($$9.d < (double)this.dH()) {
            etf $$10 = a(this, new etf($$0.c, 0.0, $$0.e), $$1.c($$9), this.dN(), $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new etf(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.dN(), $$2));
         }
      }

      return $$3;
   }

   public static etf a(@Nullable bql $$0, etf $$1, eta $$2, czu $$3, List<ety> $$4) {
      Builder<ety> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      drp $$6 = $$3.C_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.e($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static etf a(etf $$0, eta $$1, List<ety> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = etv.a(ir.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = etv.a(ir.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = etv.a(ir.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = etv.a(ir.a.c, $$1, $$2, $$5);
         }

         return new etf($$3, $$4, $$5);
      }
   }

   protected float aM() {
      return (float)((int)this.aa + 1);
   }

   protected auy aN() {
      return auz.ke;
   }

   protected auy aO() {
      return auz.kd;
   }

   protected auy aP() {
      return auz.kd;
   }

   protected void aQ() {
      eta $$0 = this.cI();
      im $$1 = im.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      im $$2 = im.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dN().a($$1, $$2)) {
         im.a $$3 = new im.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bB()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  dpy $$7 = this.dN().a_($$3);

                  try {
                     $$7.a(this.dN(), $$3, this);
                     this.a($$7);
                  } catch (Throwable var12) {
                     o $$9 = o.a(var12, "Colliding entity with block");
                     p $$10 = $$9.a("Block being collided with");
                     p.a($$10, this.dN(), $$3, $$7);
                     throw new y($$9);
                  }
               }
            }
         }
      }
   }

   protected void a(dpy $$0) {
   }

   public void a(iv<dur> $$0, @Nullable bql $$1) {
      this.dN().a($$1, $$0, this.t);
   }

   public void a(iv<dur> $$0) {
      this.a($$0, this);
   }

   private void c(im $$0, dpy $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.r();
      }
   }

   protected void aR() {
      bql $$0 = Objects.requireNonNullElse(this.cO(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      etf $$2 = $$0.dq();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected im e(im $$0) {
      im $$1 = $$0.c();
      dpy $$2 = this.dN().a_($$1);
      return !$$2.a(avo.bn) && !$$2.a(avo.bo) ? $$0 : $$1;
   }

   protected void a(dpy $$0, dpy $$1) {
      dki $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dpy $$0) {
      dki $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(im $$0, dpy $$1) {
      dki $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dpy $$0) {
      return $$0.a(avo.bm) && this.ai >= this.bk + 20;
   }

   private void r() {
      this.bj = this.bj * (float)Math.pow(0.997, (double)(this.ai - this.bk));
      this.bj = Math.min(1.0F, this.bj + 0.07F);
      float $$0 = 0.5F + this.bj * this.ah.i() * 1.2F;
      float $$1 = 0.1F + this.bj * 1.2F;
      this.a(auz.E, $$1, $$0);
      this.bk = this.ai;
   }

   protected void e(float $$0) {
      this.a(this.aN(), $$0, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
   }

   protected void aS() {
   }

   protected boolean aT() {
      return false;
   }

   public void a(auy $$0, float $$1, float $$2) {
      if (!this.aU()) {
         this.dN().a(null, this.ds(), this.du(), this.dy(), $$0, this.dc(), $$1, $$2);
      }
   }

   public void a(auy $$0) {
      if (!this.aU()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean aU() {
      return this.ao.a(aV);
   }

   public void e(boolean $$0) {
      this.ao.a(aV, $$0);
   }

   public boolean aV() {
      return this.ao.a(aW);
   }

   public void f(boolean $$0) {
      this.ao.a(aW, $$0);
   }

   protected double aW() {
      return 0.0;
   }

   public final double aX() {
      return this.aV() ? 0.0 : this.aW();
   }

   protected void aY() {
      double $$0 = this.aX();
      if ($$0 != 0.0) {
         this.g(this.dq().b(0.0, -$$0, 0.0));
      }
   }

   protected bql.b aZ() {
      return bql.b.d;
   }

   public boolean ba() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dpy $$2, im $$3) {
      if ($$1) {
         if (this.ac > 0.0F) {
            $$2.b().a(this.dN(), $$2, $$3, this, this.ac);
            this.dN().a(dur.A, this.t, dur.a.a(this, this.aE.<dpy>map($$0x -> this.dN().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ac -= (float)$$0;
      }
   }

   public boolean bb() {
      return this.ai().d();
   }

   public boolean a(float $$0, float $$1, bpj $$2) {
      if (this.o.a(avr.o)) {
         return false;
      } else {
         if (this.bQ()) {
            for (bql $$3 : this.cQ()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean bc() {
      return this.aj;
   }

   private boolean v() {
      im $$0 = this.dn();
      return this.dN().r($$0) || this.dN().r(im.a((double)$$0.u(), this.cI().e, (double)$$0.w()));
   }

   private boolean w() {
      return this.do().a(dcx.nd);
   }

   public boolean bd() {
      return this.bc() || this.v();
   }

   public boolean be() {
      return this.bc() || this.v() || this.w();
   }

   public boolean bf() {
      return this.bc() || this.w();
   }

   public boolean bg() {
      return this.bf() || this.bq();
   }

   public boolean bh() {
      return this.al && this.bc();
   }

   public void bi() {
      if (this.ca()) {
         this.i(this.bZ() && this.bc() && !this.bP());
      } else {
         this.i(this.bZ() && this.bh() && !this.bP() && this.dN().b_(this.u).a(avt.a));
      }
   }

   protected boolean bj() {
      this.ak.clear();
      this.bk();
      double $$0 = this.dN().D_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(avt.b, $$0);
      return this.bc() || $$1;
   }

   void bk() {
      if (this.da() instanceof cmi $$0 && !$$0.bh()) {
         this.aj = false;
         return;
      }

      if (this.a(avt.a, 0.014)) {
         if (!this.aj && !this.an) {
            this.bl();
         }

         this.n();
         this.aj = true;
         this.aA();
      } else {
         this.aj = false;
      }
   }

   private void x() {
      this.al = this.a(avt.a);
      this.aN.clear();
      double $$0 = this.dw();
      if (this.da() instanceof cmi $$2 && !$$2.bh() && $$2.cI().e >= $$0 && $$2.cI().b <= $$0) {
         return;
      }

      im $$3 = im.a(this.ds(), $$0, this.dy());
      elr $$4 = this.dN().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((cza)this.dN(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aN::add);
      }
   }

   protected void bl() {
      bql $$0 = Objects.requireNonNullElse(this.cO(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      etf $$2 = $$0.dq();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aO(), $$3, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
      } else {
         this.a(this.aP(), $$3, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
      }

      float $$4 = (float)axw.a(this.du());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bg.a() * 20.0F; $$5++) {
         double $$6 = (this.ah.j() * 2.0 - 1.0) * (double)this.bg.a();
         double $$7 = (this.ah.j() * 2.0 - 1.0) * (double)this.bg.a();
         this.dN().a(kw.d, this.ds() + $$6, (double)($$4 + 1.0F), this.dy() + $$7, $$2.c, $$2.d - this.ah.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bg.a() * 20.0F; $$8++) {
         double $$9 = (this.ah.j() * 2.0 - 1.0) * (double)this.bg.a();
         double $$10 = (this.ah.j() * 2.0 - 1.0) * (double)this.bg.a();
         this.dN().a(kw.aj, this.ds() + $$9, (double)($$4 + 1.0F), this.dy() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(dur.O);
   }

   @Deprecated
   protected dpy bm() {
      return this.dN().a_(this.aH());
   }

   public dpy bn() {
      return this.dN().a_(this.aJ());
   }

   public boolean bo() {
      return this.bZ() && !this.bc() && !this.N_() && !this.bY() && !this.bq() && this.bB();
   }

   protected void bp() {
      im $$0 = this.aH();
      dpy $$1 = this.dN().a_($$0);
      if ($$1.l() != djb.a) {
         etf $$2 = this.dq();
         im $$3 = this.dn();
         double $$4 = this.ds() + (this.ah.j() - 0.5) * (double)this.bg.a();
         double $$5 = this.dy() + (this.ah.j() - 0.5) * (double)this.bg.a();
         if ($$3.u() != $$0.u()) {
            $$4 = axw.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = axw.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dN().a(new kn(kw.b, $$1), $$4, this.du() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(awd<elq> $$0) {
      return this.aN.contains($$0);
   }

   public boolean bq() {
      return !this.an && this.ak.getDouble(avt.b) > 0.0;
   }

   public void a(float $$0, etf $$1) {
      etf $$2 = a($$1, $$0, this.dD());
      this.g(this.dq().e($$2));
   }

   private static etf a(etf $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return etf.b;
      } else {
         etf $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = axw.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = axw.b($$2 * (float) (Math.PI / 180.0));
         return new etf($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float br() {
      return this.dN().f(this.dr(), this.dx()) ? this.dN().x(im.a(this.ds(), this.dw(), this.dy())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.r($$3 % 360.0F);
      this.s(axw.a($$4, -90.0F, 90.0F) % 360.0F);
      this.O = this.dD();
      this.P = this.dF();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = axw.a($$0, -3.0E7, 3.0E7);
      double $$4 = axw.a($$2, -3.0E7, 3.0E7);
      this.L = $$3;
      this.M = $$1;
      this.N = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(etf $$0) {
      this.e($$0.c, $$0.d, $$0.e);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dD(), this.dF());
   }

   public void a(im $$0, float $$1, float $$2) {
      this.b((double)$$0.u() + 0.5, (double)$$0.v(), (double)$$0.w() + 0.5, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.p($$0, $$1, $$2);
      this.r($$3);
      this.s($$4);
      this.bs();
      this.ar();
   }

   public final void bs() {
      double $$0 = this.ds();
      double $$1 = this.du();
      double $$2 = this.dy();
      this.L = $$0;
      this.M = $$1;
      this.N = $$2;
      this.ad = $$0;
      this.ae = $$1;
      this.af = $$2;
      this.O = this.dD();
      this.P = this.dF();
   }

   public float f(bql $$0) {
      float $$1 = (float)(this.ds() - $$0.ds());
      float $$2 = (float)(this.du() - $$0.du());
      float $$3 = (float)(this.dy() - $$0.dy());
      return axw.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.ds() - $$0;
      double $$4 = this.du() - $$1;
      double $$5 = this.dy() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(bql $$0) {
      return this.f($$0.dl());
   }

   public double f(etf $$0) {
      double $$1 = this.ds() - $$0.c;
      double $$2 = this.du() - $$0.d;
      double $$3 = this.dy() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(ckl $$0) {
   }

   public void h(bql $$0) {
      if (!this.y($$0)) {
         if (!$$0.ag && !this.ag) {
            double $$1 = $$0.ds() - this.ds();
            double $$2 = $$0.dy() - this.dy();
            double $$3 = axw.a($$1, $$2);
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
               if (!this.bQ() && this.by()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.bQ() && $$0.by()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void j(double $$0, double $$1, double $$2) {
      this.g(this.dq().b($$0, $$1, $$2));
      this.av = true;
   }

   protected void bt() {
      this.U = true;
   }

   public boolean a(bpj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bt();
         return false;
      }
   }

   public final etf f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public ir bu() {
      return ir.a(this.f(1.0F));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dF() : axw.i($$0, this.P, this.dF());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dD() : axw.i($$0, this.O, this.dD());
   }

   public final etf b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = axw.b($$3);
      float $$5 = axw.a($$3);
      float $$6 = axw.b($$2);
      float $$7 = axw.a($$2);
      return new etf((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final etf i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final etf c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final etf bv() {
      return new etf(this.ds(), this.dw(), this.dy());
   }

   public final etf j(float $$0) {
      double $$1 = axw.d((double)$$0, this.L, this.ds());
      double $$2 = axw.d((double)$$0, this.M, this.du()) + (double)this.cJ();
      double $$3 = axw.d((double)$$0, this.N, this.dy());
      return new etf($$1, $$2, $$3);
   }

   public etf k(float $$0) {
      return this.j($$0);
   }

   public final etf l(float $$0) {
      double $$1 = axw.d((double)$$0, this.L, this.ds());
      double $$2 = axw.d((double)$$0, this.M, this.du());
      double $$3 = axw.d((double)$$0, this.N, this.dy());
      return new etf($$1, $$2, $$3);
   }

   public etd a(double $$0, float $$1, boolean $$2) {
      etf $$3 = this.j($$1);
      etf $$4 = this.f($$1);
      etf $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dN().a(new czd($$3, $$5, czd.a.b, $$2 ? czd.b.c : czd.b.a, this));
   }

   public boolean bw() {
      return this.bB() && this.bx();
   }

   public boolean bx() {
      return false;
   }

   public boolean by() {
      return false;
   }

   public void a(bql $$0, int $$1, bpj $$2) {
      if ($$0 instanceof aqf) {
         am.d.a((aqf)$$0, this, $$2);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.ds() - $$0;
      double $$4 = this.du() - $$1;
      double $$5 = this.dy() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cI().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * n;
      return $$0 < $$1 * $$1;
   }

   public boolean d(ty $$0) {
      if (this.aK != null && !this.aK.b()) {
         return false;
      } else {
         String $$1 = this.bA();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.f($$0);
            return true;
         }
      }
   }

   public boolean e(ty $$0) {
      return this.bP() ? false : this.d($$0);
   }

   public ty f(ty $$0) {
      try {
         if (this.r != null) {
            $$0.a("Pos", this.a(this.r.ds(), this.du(), this.r.dy()));
         } else {
            $$0.a("Pos", this.a(this.ds(), this.du(), this.dy()));
         }

         etf $$1 = this.dq();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dD(), this.dF()));
         $$0.a("FallDistance", this.ac);
         $$0.a("Fire", (short)this.aM);
         $$0.a("Air", (short)this.cj());
         $$0.a("OnGround", this.aC());
         $$0.a("Invulnerable", this.bb);
         $$0.a("PortalCooldown", this.ba);
         $$0.a("UUID", this.cx());
         ws $$2 = this.af();
         if ($$2 != null) {
            $$0.a("CustomName", ws.a.a($$2, this.dP()));
         }

         if (this.cC()) {
            $$0.a("CustomNameVisible", this.cC());
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

         int $$3 = this.ck();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.ck());
         }

         if (this.bl) {
            $$0.a("HasVisualFire", this.bl);
         }

         if (!this.bd.isEmpty()) {
            ue $$4 = new ue();

            for (String $$5 : this.bd) {
               $$4.add(ut.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bQ()) {
            ue $$6 = new ue();

            for (bql $$7 : this.cQ()) {
               ty $$8 = new ty();
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

   public void g(ty $$0) {
      try {
         ue $$1 = $$0.c("Pos", 6);
         ue $$2 = $$0.c("Motion", 6);
         ue $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(axw.a($$1.h(0), -3.0000512E7, 3.0000512E7), axw.a($$1.h(1), -2.0E7, 2.0E7), axw.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.r($$3.i(0));
         this.s($$3.i(1));
         this.bs();
         this.n(this.dD());
         this.o(this.dD());
         this.ac = $$0.j("FallDistance");
         this.aM = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.k($$0.g("Air"));
         }

         this.aJ = $$0.q("OnGround");
         this.bb = $$0.q("Invulnerable");
         this.ba = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.az = $$0.a("UUID");
            this.aA = this.az.toString();
         }

         if (!Double.isFinite(this.ds()) || !Double.isFinite(this.du()) || !Double.isFinite(this.dy())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dD()) && Double.isFinite((double)this.dF())) {
            this.ar();
            this.a(this.dD(), this.dF());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(ws.a.a($$8, this.dP()));
               } catch (Exception var16) {
                  c.warn("Failed to parse entity custom name {}", $$8, var16);
               }
            }

            this.o($$0.q("CustomNameVisible"));
            this.e($$0.q("Silent"));
            this.f($$0.q("NoGravity"));
            this.j($$0.q("Glowing"));
            this.l($$0.h("TicksFrozen"));
            this.bl = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.bd.clear();
               ue $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.bd.add($$10.j($$12));
               }
            }

            this.a($$0);
            if (this.bz()) {
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

   protected boolean bz() {
      return true;
   }

   @Nullable
   protected final String bA() {
      bqr<?> $$0 = this.ai();
      akf $$1 = bqr.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(ty var1);

   protected abstract void b(ty var1);

   protected ue a(double... $$0) {
      ue $$1 = new ue();

      for (double $$2 : $$0) {
         $$1.add(tz.a($$2));
      }

      return $$1;
   }

   protected ue a(float... $$0) {
      ue $$1 = new ue();

      for (float $$2 : $$0) {
         $$1.add(ub.a($$2));
      }

      return $$1;
   }

   @Nullable
   public cgv a(czt $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public cgv a(czt $$0, int $$1) {
      return this.a(new csd($$0), (float)$$1);
   }

   @Nullable
   public cgv b(csd $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public cgv a(csd $$0, float $$1) {
      if ($$0.d()) {
         return null;
      } else if (this.dN().B) {
         return null;
      } else {
         cgv $$2 = new cgv(this.dN(), this.ds(), this.du() + (double)$$1, this.dy(), $$0);
         $$2.v();
         this.dN().b($$2);
         return $$2;
      }
   }

   public boolean bB() {
      return !this.dI();
   }

   public boolean bC() {
      if (this.ag) {
         return false;
      } else {
         float $$0 = this.bg.a() * 0.8F;
         eta $$1 = eta.a(this.bv(), (double)$$0, 1.0E-6, (double)$$0);
         return im.a($$1)
            .anyMatch(
               $$1x -> {
                  dpy $$2 = this.dN().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dN(), $$1x)
                     && etv.c($$2.k(this.dN(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), etv.a($$1), etj.i);
               }
            );
      }
   }

   public boq a(ckl $$0, bop $$1) {
      return boq.d;
   }

   public boolean i(bql $$0) {
      return $$0.bD() && !this.y($$0);
   }

   public boolean bD() {
      return false;
   }

   public void t() {
      this.g(etf.b);
      this.l();
      if (this.bP()) {
         this.da().j(this);
      }
   }

   public final void j(bql $$0) {
      if (this.x($$0)) {
         this.a($$0, bql::a_);
      }
   }

   protected void a(bql $$0, bql.a $$1) {
      etf $$2 = this.m($$0);
      etf $$3 = $$0.l(this);
      $$1.accept($$0, $$2.c - $$3.c, $$2.d - $$3.d, $$2.e - $$3.e);
   }

   public void k(bql $$0) {
   }

   public etf l(bql $$0) {
      return this.dk().b(bqm.b, 0, this.aG);
   }

   public etf m(bql $$0) {
      return this.dl().e(this.a($$0, this.bg, 1.0F));
   }

   protected etf a(bql $$0, bqo $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static etf a(bql $$0, bql $$1, bqn $$2) {
      int $$3 = $$0.cQ().indexOf($$1);
      return $$2.c(bqm.a, $$3, $$0.aG);
   }

   public boolean n(bql $$0) {
      return this.a($$0, false);
   }

   public boolean bE() {
      return this instanceof bre;
   }

   public boolean a(bql $$0, boolean $$1) {
      if ($$0 == this.r) {
         return false;
      } else if (!$$0.bH()) {
         return false;
      } else {
         for (bql $$2 = $$0; $$2.r != null; $$2 = $$2.r) {
            if ($$2.r == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bP()) {
               this.ac();
            }

            this.b(brp.a);
            this.r = $$0;
            this.r.p(this);
            $$0.A().filter($$0x -> $$0x instanceof aqf).forEach($$0x -> am.U.a((aqf)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bql $$0) {
      return !this.bT() && this.K <= 0;
   }

   public void bF() {
      for (int $$0 = this.q.size() - 1; $$0 >= 0; $$0--) {
         ((bql)this.q.get($$0)).ac();
      }
   }

   public void bG() {
      if (this.r != null) {
         bql $$0 = this.r;
         this.r = null;
         $$0.q(this);
      }
   }

   public void ac() {
      this.bG();
   }

   protected void p(bql $$0) {
      if ($$0.da() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.q.isEmpty()) {
            this.q = ImmutableList.of($$0);
         } else {
            List<bql> $$1 = Lists.newArrayList(this.q);
            if (!this.dN().B && $$0 instanceof ckl && !(this.cR() instanceof ckl)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.q = ImmutableList.copyOf($$1);
         }

         this.a(dur.s, $$0);
      }
   }

   protected void q(bql $$0) {
      if ($$0.da() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.q.size() == 1 && this.q.get(0) == $$0) {
            this.q = ImmutableList.of();
         } else {
            this.q = this.q.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.K = 60;
         this.a(dur.q, $$0);
      }
   }

   protected boolean r(bql $$0) {
      return this.q.isEmpty();
   }

   protected boolean bH() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public double c_() {
      return this.ds();
   }

   public double d_() {
      return this.du();
   }

   public double L_() {
      return this.dy();
   }

   public float M_() {
      return this.dF();
   }

   public float e_() {
      return this.dD();
   }

   public void a(float $$0, int $$1) {
      this.n($$0);
   }

   public float bI() {
      return 0.0F;
   }

   public etf bJ() {
      return this.b(this.dF(), this.dD());
   }

   public etf a(cry $$0) {
      if (!(this instanceof ckl $$1)) {
         return etf.b;
      } else {
         boolean $$2 = $$1.eW().a($$0) && !$$1.eV().a($$0);
         bqy $$3 = $$2 ? $$1.fs().e() : $$1.fs();
         return this.b(0.0F, this.dD() + (float)($$3 == bqy.b ? 80 : -80)).a(0.5);
      }
   }

   public ete bK() {
      return new ete(this.dF(), this.dD());
   }

   public etf bL() {
      return etf.a(this.bK());
   }

   public void f(im $$0) {
      if (this.aw()) {
         this.au();
      } else {
         if (!this.dN().B && !$$0.equals(this.ay)) {
            this.ay = $$0.i();
         }

         this.aw = true;
      }
   }

   protected void bM() {
      if (this.dN() instanceof aqe) {
         int $$0 = this.ax();
         aqe $$1 = (aqe)this.dN();
         if (this.aw) {
            MinecraftServer $$2 = $$1.o();
            ake<czu> $$3 = this.dN().ae() == czu.i ? czu.h : czu.i;
            aqe $$4 = $$2.a($$3);
            if ($$4 != null && $$2.G() && !this.bP() && this.ax++ >= $$0) {
               this.dN().af().a("portal");
               this.ax = $$0;
               this.au();
               this.b($$4);
               this.dN().af().c();
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

   public int bN() {
      return 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
   }

   public void c(bpj $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dgp.a(this);
      }
   }

   public void m(float $$0) {
   }

   public boolean bO() {
      boolean $$0 = this.dN() != null && this.dN().B;
      return !this.bb() && (this.aM > 0 || $$0 && this.j(0));
   }

   public boolean bP() {
      return this.da() != null;
   }

   public boolean bQ() {
      return !this.q.isEmpty();
   }

   public boolean bR() {
      return this.ai().a(avr.p);
   }

   public boolean bS() {
      return !this.ai().a(avr.q);
   }

   public void g(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean bT() {
      return this.j(1);
   }

   public boolean bU() {
      return this.bT();
   }

   public boolean bV() {
      return this.bT();
   }

   public boolean bW() {
      return this.bT();
   }

   public boolean bX() {
      return this.bT();
   }

   public boolean bY() {
      return this.c(brp.f);
   }

   public boolean bZ() {
      return this.j(3);
   }

   public void h(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean ca() {
      return this.j(4);
   }

   public boolean cb() {
      return this.c(brp.d);
   }

   public boolean cc() {
      return this.cb() && !this.bc();
   }

   public void i(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cd() {
      return this.bc;
   }

   public final void j(boolean $$0) {
      this.bc = $$0;
      this.b(6, this.ce());
   }

   public boolean ce() {
      return this.dN().x_() ? this.j(6) : this.bc;
   }

   public boolean cf() {
      return this.j(5);
   }

   public boolean d(ckl $$0) {
      if ($$0.N_()) {
         return false;
      } else {
         eul $$1 = this.ch();
         return $$1 != null && $$0 != null && $$0.ch() == $$1 && $$1.i() ? false : this.cf();
      }
   }

   public boolean cg() {
      return false;
   }

   public void a(BiConsumer<duo<?>, aqe> $$0) {
   }

   @Nullable
   public eue ch() {
      return this.dN().L().e(this.cz());
   }

   public boolean s(bql $$0) {
      return this.a($$0.ch());
   }

   public boolean a(eul $$0) {
      return this.ch() != null ? this.ch().a($$0) : false;
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

   public int ci() {
      return 300;
   }

   public int cj() {
      return this.ao.a(aS);
   }

   public void k(int $$0) {
      this.ao.a(aS, $$0);
   }

   public int ck() {
      return this.ao.a(aX);
   }

   public void l(int $$0) {
      this.ao.a(aX, $$0);
   }

   public float cl() {
      int $$0 = this.cn();
      return (float)Math.min(this.ck(), $$0) / (float)$$0;
   }

   public boolean cm() {
      return this.ck() >= this.cn();
   }

   public int cn() {
      return 140;
   }

   public void a(aqe $$0, brd $$1) {
      this.i(this.aM + 1);
      if (this.aM == 0) {
         this.g(8);
      }

      this.a(this.dO().b(), 5.0F);
   }

   public void l(boolean $$0) {
      etf $$1 = this.dq();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void m(boolean $$0) {
      etf $$1 = this.dq();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(aqe $$0, bre $$1) {
      return true;
   }

   public void co() {
      if (this.dq().b() > -0.5 && this.ac > 1.0F) {
         this.ac = 1.0F;
      }
   }

   public void n() {
      this.ac = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      im $$3 = im.a($$0, $$1, $$2);
      etf $$4 = new etf($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      im.a $$5 = new im.a();
      ir $$6 = ir.b;
      double $$7 = Double.MAX_VALUE;

      for (ir $$8 : new ir[]{ir.c, ir.d, ir.e, ir.f, ir.b}) {
         $$5.a($$3, $$8);
         if (!this.dN().a_($$5).r(this.dN(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == ir.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ah.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      etf $$13 = this.dq().a(0.75);
      if ($$6.o() == ir.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == ir.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == ir.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dpy $$0, etf $$1) {
      this.n();
      this.V = $$1;
   }

   private static ws c(ws $$0) {
      xg $$1 = $$0.e().b($$0.a().a(null));

      for (ws $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public ws ad() {
      ws $$0 = this.af();
      return $$0 != null ? c($$0) : this.cp();
   }

   protected ws cp() {
      return this.o.h();
   }

   public boolean t(bql $$0) {
      return this == $$0;
   }

   public float cq() {
      return 0.0F;
   }

   public void n(float $$0) {
   }

   public void o(float $$0) {
   }

   public boolean cr() {
      return true;
   }

   public boolean u(bql $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dN() == null ? "~NULL~" : this.dN().toString();
      return this.aK != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.ad().getString(),
            this.p,
            $$0,
            this.ds(),
            this.du(),
            this.dy(),
            this.aK
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.ad().getString(),
            this.p,
            $$0,
            this.ds(),
            this.du(),
            this.dy()
         );
   }

   public boolean b(bpj $$0) {
      return this.dI() || this.bb && !$$0.a(avq.e) && !$$0.g() || $$0.a(avq.j) && this.bb() || $$0.a(avq.n) && this.ai().a(avr.o);
   }

   public boolean cs() {
      return this.bb;
   }

   public void n(boolean $$0) {
      this.bb = $$0;
   }

   public void v(bql $$0) {
      this.b($$0.ds(), $$0.du(), $$0.dy(), $$0.dD(), $$0.dF());
   }

   public void w(bql $$0) {
      ty $$1 = $$0.f(new ty());
      $$1.r("Dimension");
      this.g($$1);
      this.ba = $$0.ba;
      this.ay = $$0.ay;
   }

   @Nullable
   public bql b(aqe $$0) {
      if (this.dN() instanceof aqe && !this.dI()) {
         this.dN().af().a("changeDimension");
         this.ag();
         this.dN().af().a("reposition");
         emq $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dN().af().b("reloading");
            bql $$2 = this.ai().a((czu)$$0);
            if ($$2 != null) {
               $$2.w(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dF());
               $$2.g($$1.b);
               $$0.d($$2);
               if ($$0.ae() == czu.j) {
                  aqe.a($$0);
               }
            }

            this.ct();
            this.dN().af().c();
            ((aqe)this.dN()).h();
            $$0.h();
            this.dN().af().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void ct() {
      this.b(bql.c.e);
   }

   @Nullable
   protected emq a(aqe $$0) {
      boolean $$1 = this.dN().ae() == czu.j && $$0.ae() == czu.h;
      boolean $$2 = $$0.ae() == czu.j;
      if (!$$1 && !$$2) {
         boolean $$6 = $$0.ae() == czu.i;
         if (this.dN().ae() != czu.i && !$$6) {
            return null;
         } else {
            drp $$7 = $$0.C_();
            double $$8 = dtq.a(this.dN().D_(), $$0.D_());
            im $$9 = $$7.b(this.ds() * $$8, this.du(), this.dy() * $$8);
            return this.a($$0, $$9, $$6, $$7).map($$1x -> {
               dpy $$2x = this.dN().a_(this.ay);
               ir.a $$3;
               etf $$5;
               if ($$2x.b(dqo.H)) {
                  $$3 = $$2x.c(dqo.H);
                  l.a $$4 = l.a(this.ay, $$3, 21, ir.a.b, 21, $$1xx -> this.dN().a_($$1xx) == $$2x);
                  $$5 = this.a($$3, $$4);
               } else {
                  $$3 = ir.a.a;
                  $$5 = new etf(0.5, 0.0, 0.0);
               }

               return emr.a($$0, $$1x, $$3, $$5, this, this.dq(), this.dD(), this.dF());
            }).orElse(null);
         }
      } else {
         im $$3 = $$2 ? aqe.a : $$0.U();
         $$0.l().a(aqj.f, new czb($$3), 3, $$3);
         int $$4;
         if ($$2) {
            $$4 = $$3.v();
         } else {
            $$4 = $$0.m($$3).a(dvq.a.f, $$3.u(), $$3.w()) + 1;
         }

         return new emq(new etf((double)$$3.u() + 0.5, (double)$$4, (double)$$3.w() + 0.5), this.dq(), this.dD(), this.dF());
      }
   }

   protected etf a(ir.a $$0, l.a $$1) {
      return emr.a($$1, $$0, this.dl(), this.a(this.ap()));
   }

   protected Optional<l.a> a(aqe $$0, im $$1, boolean $$2, drp $$3) {
      return $$0.p().a($$1, $$2, $$3);
   }

   public boolean cu() {
      return !this.bP() && !this.bQ();
   }

   public float a(czm $$0, cza $$1, im $$2, dpy $$3, elr $$4, float $$5) {
      return $$5;
   }

   public boolean a(czm $$0, cza $$1, im $$2, dpy $$3, float $$4) {
      return true;
   }

   public int cv() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bqr.a(this.ai()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.p);
      $$0.a("Entity Name", () -> this.ad().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.ds(), this.du(), this.dy()));
      $$0.a("Entity's Block location", p.a(this.dN(), axw.a(this.ds()), axw.a(this.du()), axw.a(this.dy())));
      etf $$1 = this.dq();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", () -> this.cQ().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.da()));
   }

   public boolean cw() {
      return this.bO() && !this.N_();
   }

   public void a_(UUID $$0) {
      this.az = $$0;
      this.aA = this.az.toString();
   }

   @Override
   public UUID cx() {
      return this.az;
   }

   public String cy() {
      return this.aA;
   }

   @Override
   public String cz() {
      return this.aA;
   }

   public boolean cA() {
      return true;
   }

   public static double cB() {
      return n;
   }

   public static void b(double $$0) {
      n = $$0;
   }

   @Override
   public ws O_() {
      return eue.a(this.ch(), this.ad()).a($$0 -> $$0.a(this.cH()).a(this.cy()));
   }

   public void b(@Nullable ws $$0) {
      this.ao.a(aT, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public ws af() {
      return this.ao.a(aT).orElse(null);
   }

   @Override
   public boolean ae() {
      return this.ao.a(aT).isPresent();
   }

   public void o(boolean $$0) {
      this.ao.a(aU, $$0);
   }

   public boolean cC() {
      return this.ao.a(aU);
   }

   public final void n(double $$0, double $$1, double $$2) {
      if (this.dN() instanceof aqe) {
         czb $$3 = new czb(im.a($$0, $$1, $$2));
         ((aqe)this.dN()).l().a(aqj.g, $$3, 0, this.aj());
         this.dN().d($$3.e, $$3.f);
         this.c($$0, $$1, $$2);
      }
   }

   public boolean a(aqe $$0, double $$1, double $$2, double $$3, Set<brr> $$4, float $$5, float $$6) {
      float $$7 = axw.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dN()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.z();
         this.n($$5);
      } else {
         this.ag();
         bql $$8 = this.ai().a((czu)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(bql.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dN() instanceof aqe) {
         this.b($$0, $$1, $$2, this.dD(), this.dF());
         this.z();
      }
   }

   private void z() {
      this.cS().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.q.iterator();

         while (var1.hasNext()) {
            bql $$1 = (bql)var1.next();
            $$0.a($$1, bql::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.ds() + $$0, this.du() + $$1, this.dy() + $$2);
   }

   public boolean cD() {
      return this.cC();
   }

   @Override
   public void a(List<ajo.c<?>> $$0) {
   }

   @Override
   public void a(ajk<?> $$0) {
      if (at.equals($$0)) {
         this.j_();
      }
   }

   @Deprecated
   protected void cE() {
      brp $$0 = this.ap();
      bqo $$1 = this.a($$0);
      this.bg = $$1;
      this.bh = $$1.c();
   }

   public void j_() {
      bqo $$0 = this.bg;
      brp $$1 = this.ap();
      bqo $$2 = this.a($$1);
      this.bg = $$2;
      this.bh = $$2.c();
      this.ar();
      boolean $$3 = (double)$$2.a() <= 4.0 && (double)$$2.b() <= 4.0;
      if (!this.dN().B && !this.an && !this.ag && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof ckl)) {
         etf $$4 = this.dl().b(0.0, (double)$$0.b() / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a() - $$0.a()) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b() - $$0.b()) + 1.0E-6;
         ety $$7 = etv.a(eta.a($$4, $$5, $$6, $$5));
         this.dN().a(this, $$7, $$4, (double)$$2.a(), (double)$$2.b(), (double)$$2.a()).ifPresent($$1x -> this.b($$1x.b(0.0, (double)(-$$2.b()) / 2.0, 0.0)));
      }
   }

   public ir cF() {
      return ir.a((double)this.dD());
   }

   public ir cG() {
      return this.cF();
   }

   protected wy cH() {
      return new wy(wy.a.c, new wy.b(this.ai(), this.cx(), this.ad()));
   }

   public boolean a(aqf $$0) {
      return true;
   }

   @Override
   public final eta cI() {
      return this.aI;
   }

   public eta h_() {
      return this.cI();
   }

   public final void a(eta $$0) {
      this.aI = $$0;
   }

   public final float d(brp $$0) {
      return this.a($$0).c();
   }

   public final float cJ() {
      return this.bh;
   }

   public etf p(float $$0) {
      return this.cK();
   }

   protected etf cK() {
      return new etf(0.0, (double)this.cJ(), (double)(this.dh() * 0.4F));
   }

   public brv a_(int $$0) {
      return brv.b;
   }

   @Override
   public void a(ws $$0) {
   }

   public czu cL() {
      return this.dN();
   }

   @Nullable
   public MinecraftServer cM() {
      return this.dN().o();
   }

   public boq a(ckl $$0, etf $$1, bop $$2) {
      return boq.d;
   }

   public boolean a(czm $$0) {
      return false;
   }

   public void a(bre $$0, bql $$1) {
      if ($$1 instanceof bre) {
         cxo.a((bre)$$1, $$0);
      }

      cxo.b($$0, $$1);
   }

   public void c(aqf $$0) {
   }

   public void d(aqf $$0) {
   }

   public float a(dji $$0) {
      float $$1 = axw.g(this.dD());
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

   public float a(dhs $$0) {
      float $$1 = axw.g(this.dD());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public boolean cN() {
      return false;
   }

   public cle a(cld $$0) {
      return this.ai().a(avr.r) ? cle.b : cle.a;
   }

   @Nullable
   public bre cO() {
      return null;
   }

   public final boolean cP() {
      return this.cO() != null;
   }

   public final List<bql> cQ() {
      return this.q;
   }

   @Nullable
   public bql cR() {
      return this.q.isEmpty() ? null : (bql)this.q.get(0);
   }

   public boolean x(bql $$0) {
      return this.q.contains($$0);
   }

   public boolean a(Predicate<bql> $$0) {
      UnmodifiableIterator var2 = this.q.iterator();

      while (var2.hasNext()) {
         bql $$1 = (bql)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bql> A() {
      return this.q.stream().flatMap(bql::cS);
   }

   @Override
   public Stream<bql> cS() {
      return Stream.concat(Stream.of(this), this.A());
   }

   @Override
   public Stream<bql> cT() {
      return Stream.concat(this.q.stream().flatMap(bql::cT), Stream.of(this));
   }

   public Iterable<bql> cU() {
      return () -> this.A().iterator();
   }

   public int cV() {
      return (int)this.A().filter($$0 -> $$0 instanceof ckl).count();
   }

   public boolean cW() {
      return this.cV() == 1;
   }

   public bql cX() {
      bql $$0 = this;

      while ($$0.bP()) {
         $$0 = $$0.da();
      }

      return $$0;
   }

   public boolean y(bql $$0) {
      return this.cX() == $$0.cX();
   }

   public boolean z(bql $$0) {
      if (!$$0.bP()) {
         return false;
      } else {
         bql $$1 = $$0.da();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean cY() {
      return this.cO() instanceof ckl $$0 ? $$0.g() : this.cZ();
   }

   public boolean cZ() {
      return !this.dN().B;
   }

   protected static etf a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -axw.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = axw.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new etf((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public etf b(bre $$0) {
      return new etf(this.ds(), this.cI().e, this.dy());
   }

   @Nullable
   public bql da() {
      return this.r;
   }

   @Nullable
   public bql db() {
      return this.r != null && this.r.cO() == this ? this.r : null;
   }

   public elw k_() {
      return elw.a;
   }

   public ava dc() {
      return ava.g;
   }

   protected int dd() {
      return 1;
   }

   public ec de() {
      return new ec(
         this, this.dl(), this.bK(), this.dN() instanceof aqe ? (aqe)this.dN() : null, this.F(), this.ad().getString(), this.O_(), this.dN().o(), this
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
      return this.dN().aa().b(czq.p);
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public boolean U_() {
      return true;
   }

   public void a(eo.a $$0, etf $$1) {
      etf $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.s(axw.g((float)(-(axw.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.r(axw.g((float)(axw.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dD());
      this.P = this.dF();
      this.O = this.dD();
   }

   public boolean a(awd<elq> $$0, double $$1) {
      if (this.df()) {
         return false;
      } else {
         eta $$2 = this.cI().h(0.001);
         int $$3 = axw.a($$2.a);
         int $$4 = axw.c($$2.d);
         int $$5 = axw.a($$2.b);
         int $$6 = axw.c($$2.e);
         int $$7 = axw.a($$2.c);
         int $$8 = axw.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cA();
         boolean $$11 = false;
         etf $$12 = etf.b;
         int $$13 = 0;
         im.a $$14 = new im.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  elr $$18 = this.dN().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((cza)this.dN(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           etf $$20 = $$18.c(this.dN(), $$14);
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

            if (!(this instanceof ckl)) {
               $$12 = $$12.d();
            }

            etf $$21 = this.dq();
            $$12 = $$12.a($$1 * 1.0);
            double $$22 = 0.003;
            if (Math.abs($$21.c) < 0.003 && Math.abs($$21.e) < 0.003 && $$12.f() < 0.0045000000000000005) {
               $$12 = $$12.d().a(0.0045000000000000005);
            }

            this.g(this.dq().e($$12));
         }

         this.ak.put($$0, $$9);
         return $$11;
      }
   }

   public boolean df() {
      eta $$0 = this.cI().g(1.0);
      int $$1 = axw.a($$0.a);
      int $$2 = axw.c($$0.d);
      int $$3 = axw.a($$0.c);
      int $$4 = axw.c($$0.f);
      return !this.dN().b($$1, $$3, $$2, $$4);
   }

   public double b(awd<elq> $$0) {
      return this.ak.getDouble($$0);
   }

   public double dg() {
      return (double)this.cJ() < 0.4 ? 0.0 : 0.4;
   }

   public final float dh() {
      return this.bg.a();
   }

   public final float di() {
      return this.bg.b();
   }

   public yz<abk> dj() {
      return new abl(this);
   }

   public bqo a(brp $$0) {
      return this.o.n();
   }

   public final bqn dk() {
      return this.bg.d();
   }

   public etf dl() {
      return this.t;
   }

   public etf dm() {
      return this.dl();
   }

   @Override
   public im dn() {
      return this.u;
   }

   public dpy do() {
      if (this.bm == null) {
         this.bm = this.dN().a_(this.dn());
      }

      return this.bm;
   }

   public czb dp() {
      return this.v;
   }

   public etf dq() {
      return this.aF;
   }

   public void g(etf $$0) {
      this.aF = $$0;
   }

   public void h(etf $$0) {
      this.g(this.dq().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.g(new etf($$0, $$1, $$2));
   }

   public final int dr() {
      return this.u.u();
   }

   public final double ds() {
      return this.t.c;
   }

   public double c(double $$0) {
      return this.t.c + (double)this.dh() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ah.j() - 1.0) * $$0);
   }

   public final int dt() {
      return this.u.v();
   }

   public final double du() {
      return this.t.d;
   }

   public double e(double $$0) {
      return this.t.d + (double)this.di() * $$0;
   }

   public double dv() {
      return this.e(this.ah.j());
   }

   public double dw() {
      return this.t.d + (double)this.bh;
   }

   public final int dx() {
      return this.u.w();
   }

   public final double dy() {
      return this.t.e;
   }

   public double f(double $$0) {
      return this.t.e + (double)this.dh() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ah.j() - 1.0) * $$0);
   }

   public final void p(double $$0, double $$1, double $$2) {
      if (this.t.c != $$0 || this.t.d != $$1 || this.t.e != $$2) {
         this.t = new etf($$0, $$1, $$2);
         int $$3 = axw.a($$0);
         int $$4 = axw.a($$1);
         int $$5 = axw.a($$2);
         if ($$3 != this.u.u() || $$4 != this.u.v() || $$5 != this.u.w()) {
            this.u = new im($$3, $$4, $$5);
            this.bm = null;
            if (jo.a($$3) != this.v.e || jo.a($$5) != this.v.f) {
               this.v = new czb(this.u);
            }
         }

         this.aY.a();
      }
   }

   public void dz() {
   }

   public etf q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bh * 0.7, 0.0);
   }

   public void a(abl $$0) {
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
   public csd dA() {
      return null;
   }

   public void p(boolean $$0) {
      this.aB = $$0;
   }

   public boolean dB() {
      return !this.ai().a(avr.k);
   }

   public boolean dC() {
      return (this.aB || this.aC) && this.dB();
   }

   public float dD() {
      return this.aG;
   }

   public float dE() {
      return this.dD();
   }

   public void r(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aG = $$0;
      }
   }

   public float dF() {
      return this.aH;
   }

   public void s(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aH = $$0;
      }
   }

   public boolean dG() {
      return false;
   }

   public float dH() {
      return 0.0F;
   }

   public void a(@Nullable bql $$0) {
   }

   public final boolean dI() {
      return this.aK != null;
   }

   @Nullable
   public bql.c dJ() {
      return this.aK;
   }

   @Override
   public final void b(bql.c $$0) {
      if (this.aK == null) {
         this.aK = $$0;
      }

      if (this.aK.a()) {
         this.ac();
      }

      this.cQ().forEach(bql::ac);
      this.aY.a($$0);
   }

   protected void dK() {
      this.aK = null;
   }

   @Override
   public void a(dtz $$0) {
      this.aY = $$0;
   }

   @Override
   public boolean dL() {
      if (this.aK != null && !this.aK.b()) {
         return false;
      } else {
         return this.bP() ? false : !this.bQ() || !this.cW();
      }
   }

   @Override
   public boolean dM() {
      return false;
   }

   public boolean a(czu $$0, im $$1) {
      return true;
   }

   public czu dN() {
      return this.s;
   }

   protected void a(czu $$0) {
      this.s = $$0;
   }

   public bpk dO() {
      return this.dN().ai();
   }

   public jj dP() {
      return this.dN().H_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = axw.d($$6, this.ds(), $$1);
      double $$8 = axw.d($$6, this.du(), $$2);
      double $$9 = axw.d($$6, this.dy(), $$3);
      float $$10 = (float)axw.e($$6, (double)this.dD(), $$4);
      float $$11 = (float)axw.d($$6, (double)this.dF(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   @FunctionalInterface
   public interface a {
      void accept(bql var1, double var2, double var4, double var6);
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
