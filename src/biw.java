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

public abstract class biw implements bhi, diu, ds {
   private static final Logger c = LogUtils.getLogger();
   public static final String w = "id";
   public static final String x = "Passengers";
   private static final AtomicInteger d = new AtomicInteger();
   private static final List<cjl> e = Collections.emptyList();
   public static final int y = 60;
   public static final int z = 300;
   public static final int A = 1024;
   public static final float B = 0.2F;
   public static final double C = 0.500001;
   public static final double D = 0.999999;
   public static final float E = 0.11111111F;
   public static final int F = 140;
   public static final int G = 40;
   private static final ehc k = new ehc(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double l = 0.014;
   private static final double m = 0.007;
   private static final double n = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double o = 1.0;
   private final bja<?> p;
   private int q = d.incrementAndGet();
   public boolean I;
   private ImmutableList<biw> r = ImmutableList.of();
   protected int J;
   @Nullable
   private biw s;
   private cqb t;
   public double K;
   public double L;
   public double M;
   private ehh u;
   private gw v;
   private cpi aE;
   private ehh aF = ehh.b;
   private float aG;
   private float aH;
   public float N;
   public float O;
   private ehc aI = k;
   private boolean aJ;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected ehh U = ehh.b;
   @Nullable
   private biw.c aK;
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
   protected final ash ag = ash.a();
   public int ah;
   private int aN = -this.db();
   protected boolean ai;
   protected Object2DoubleMap<aqk<eaf>> aj = new Object2DoubleArrayMap(2);
   protected boolean ak;
   private final Set<aqk<eaf>> aO = new HashSet<>();
   public int al;
   protected boolean am = true;
   protected final aei an;
   protected static final aef<Byte> ao = aei.a(biw.class, aeh.a);
   protected static final int ap = 0;
   private static final int aP = 1;
   private static final int aQ = 3;
   private static final int aR = 4;
   private static final int aS = 5;
   protected static final int aq = 6;
   protected static final int ar = 7;
   private static final aef<Integer> aT = aei.a(biw.class, aeh.b);
   private static final aef<Optional<tl>> aU = aei.a(biw.class, aeh.g);
   private static final aef<Boolean> aV = aei.a(biw.class, aeh.k);
   private static final aef<Boolean> aW = aei.a(biw.class, aeh.k);
   private static final aef<Boolean> aX = aei.a(biw.class, aeh.k);
   protected static final aef<bjy> as = aei.a(biw.class, aeh.v);
   private static final aef<Integer> aY = aei.a(biw.class, aeh.b);
   private div aZ = div.a;
   private final acz ba = new acz();
   public boolean at;
   public boolean au;
   private int bb;
   protected boolean av;
   protected int aw;
   protected gw ax;
   private boolean bc;
   protected UUID ay = asb.a(this.ag);
   protected String az = this.ay.toString();
   private boolean bd;
   private final Set<String> be = Sets.newHashSet();
   private final double[] bf = new double[]{0.0, 0.0, 0.0};
   private long bg;
   private bix bh;
   private float bi;
   public boolean aA;
   public boolean aB;
   public boolean aC;
   public Optional<gw> aD = Optional.empty();
   private boolean bj = false;
   private float bk;
   private int bl;
   private boolean bm;
   @Nullable
   private dfd bn = null;

   public biw(bja<?> $$0, cqb $$1) {
      this.p = $$0;
      this.t = $$1;
      this.bh = $$0.n();
      this.u = ehh.b;
      this.v = gw.b;
      this.aE = cpi.b;
      this.an = new aei(this);
      this.an.a(ao, (byte)0);
      this.an.a(aT, this.cg());
      this.an.a(aV, false);
      this.an.a(aU, Optional.empty());
      this.an.a(aW, false);
      this.an.a(aX, false);
      this.an.a(as, bjy.a);
      this.an.a(aY, 0);
      this.a_();
      this.e(0.0, 0.0, 0.0);
      this.bi = this.a(bjy.a, this.bh);
   }

   public boolean a(gw $$0, dfd $$1) {
      eia $$2 = $$1.b(this.dL(), $$0, ehm.a(this));
      eia $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return ehx.c($$3, ehx.a(this.cG()), ehl.i);
   }

   public int h_() {
      eii $$0 = this.cf();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean M_() {
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
      this.ba.e(new ehh($$0, $$1, $$2));
   }

   public acz af() {
      return this.ba;
   }

   public bja<?> ag() {
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
      this.a(biw.c.a);
      this.a(djn.p);
   }

   public final void ak() {
      this.a(biw.c.b);
   }

   protected abstract void a_();

   public aei al() {
      return this.an;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof biw ? ((biw)$$0).q == this.q : false;
   }

   @Override
   public int hashCode() {
      return this.q;
   }

   public void a(biw.c $$0) {
      this.b($$0);
   }

   public void am() {
   }

   public void b(bjy $$0) {
      this.an.b(as, $$0);
   }

   public bjy an() {
      return this.an.b(as);
   }

   public boolean c(bjy $$0) {
      return this.an() == $$0;
   }

   public boolean a(biw $$0, double $$1) {
      return this.dj().a((ho)$$0.dj(), $$1);
   }

   public boolean a(biw $$0, double $$1, double $$2) {
      double $$3 = $$0.dq() - this.dq();
      double $$4 = $$0.ds() - this.ds();
      double $$5 = $$0.dw() - this.dw();
      return asb.e($$3, $$5) < asb.k($$1) && asb.k($$4) < asb.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.r($$0 % 360.0F);
      this.s($$1 % 360.0F);
   }

   public final void a(ehh $$0) {
      this.e($$0.a(), $$0.b(), $$0.c());
   }

   public void e(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.ao());
   }

   protected ehc ao() {
      return this.bh.a(this.u);
   }

   protected void ap() {
      this.e(this.u.c, this.u.d, this.u.e);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.s(this.dD() + $$2);
      this.r(this.dB() + $$3);
      this.s(asb.a(this.dD(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = asb.a(this.O, -90.0F, 90.0F);
      if (this.s != null) {
         this.s.j(this);
      }
   }

   public void l() {
      this.aq();
   }

   public void aq() {
      this.dL().ad().a("entityBaseTick");
      this.bn = null;
      if (this.bN() && this.cY().dG()) {
         this.aa();
      }

      if (this.J > 0) {
         this.J--;
      }

      this.X = this.Y;
      this.O = this.dD();
      this.N = this.dB();
      this.bH();
      if (this.bj()) {
         this.bk();
      }

      this.aB = this.aA;
      this.aA = false;
      this.be();
      this.z();
      this.bd();
      if (this.dL().B) {
         this.ay();
      } else if (this.aN > 0) {
         if (this.aW()) {
            this.h(this.aN - 4);
            if (this.aN < 0) {
               this.ay();
            }
         } else {
            if (this.aN % 20 == 0 && !this.bl()) {
               this.a(this.dM().c(), 1.0F);
            }

            this.h(this.aN - 1);
         }

         if (this.ci() > 0) {
            this.k(0);
            this.dL().a(null, 1009, this.v, 1);
         }
      }

      if (this.bl()) {
         this.aw();
         this.ab *= 0.5F;
      }

      this.ar();
      if (!this.dL().B) {
         this.a_(this.aN > 0);
      }

      this.am = false;
      this.dL().ad().c();
   }

   public void a_(boolean $$0) {
      this.b(0, $$0 || this.bm);
   }

   public void ar() {
      if (this.ds() < (double)(this.dL().H_() - 64)) {
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

   protected void J() {
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
         if (this.a(this.dM().d(), 4.0F)) {
            this.a(apg.iT, 0.4F, 2.0F + this.ag.i() * 0.4F);
         }
      }
   }

   public void g(int $$0) {
      int $$1 = $$0 * 20;
      if (this instanceof bjm) {
         $$1 = coh.a((bjm)this, $$1);
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

   private boolean b(ehc $$0) {
      return this.dL().a(this, $$0) && !this.dL().d($$0);
   }

   public void c(boolean $$0) {
      this.aJ = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, ehh $$1) {
      this.aJ = $$0;
      this.b($$0, $$1);
   }

   public boolean d(gw $$0) {
      return this.aD.isPresent() && this.aD.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable ehh $$1) {
      if ($$0) {
         ehc $$2 = this.cG();
         ehc $$3 = new ehc($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<gw> $$4 = this.t.g(this, $$3);
         if ($$4.isPresent() || this.bj) {
            this.aD = $$4;
         } else if ($$1 != null) {
            ehc $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
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

   public void a(bjs $$0, ehh $$1) {
      if (this.af) {
         this.e(this.dq() + $$1.c, this.ds() + $$1.d, this.dw() + $$1.e);
      } else {
         this.aC = this.bM();
         if ($$0 == bjs.c) {
            $$1 = this.c($$1);
            if ($$1.equals(ehh.b)) {
               return;
            }
         }

         this.dL().ad().a("move");
         if (this.U.g() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = ehh.b;
            this.f(ehh.b);
         }

         $$1 = this.a($$1, $$0);
         ehh $$2 = this.h($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ab != 0.0F && $$3 >= 1.0) {
               ehd $$4 = this.dL().a(new cpk(this.dj(), this.dj().e($$2), cpk.a.d, cpk.b.d, this));
               if ($$4.c() != ehf.a.a) {
                  this.n();
               }
            }

            this.e(this.dq() + $$2.c, this.ds() + $$2.d, this.dw() + $$2.e);
         }

         this.dL().ad().c();
         this.dL().ad().a("rest");
         boolean $$5 = !asb.b($$1.c, $$2.c);
         boolean $$6 = !asb.b($$1.e, $$2.e);
         this.P = $$5 || $$6;
         this.Q = $$1.d != $$2.d;
         this.R = this.Q && $$1.d < 0.0;
         if (this.P) {
            this.S = this.b($$2);
         } else {
            this.S = false;
         }

         this.a(this.R, $$2);
         gw $$7 = this.aF();
         dfd $$8 = this.dL().a_($$7);
         this.a($$2.d, this.aA(), $$8, $$7);
         if (this.dG()) {
            this.dL().ad().c();
         } else {
            if (this.P) {
               ehh $$9 = this.do();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            ctc $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dL(), this);
            }

            if (this.aA()) {
               $$10.a(this.dL(), $$7, $$8, this);
            }

            biw.b $$11 = this.aU();
            if ($$11.a() && !this.bN()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.aa = this.aa + (float)($$2.f() * 0.6);
               gw $$15 = this.aH();
               dfd $$16 = this.dL().a_($$15);
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
                        this.a(djn.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aE();
               }
            }

            this.aB();
            float $$20 = this.aJ();
            this.f(this.do().d((double)$$20, 1.0, (double)$$20));
            if (this.dL().c(this.cG().h(1.0E-6)).noneMatch($$0x -> $$0x.a(apv.aJ) || $$0x.a(cte.H))) {
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

            this.dL().ad().c();
         }
      }
   }

   private boolean c(dfd $$0) {
      return $$0.a(apv.aO) || $$0.a(cte.qC);
   }

   private boolean a(gw $$0, dfd $$1, boolean $$2, boolean $$3, ehh $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aA() || $$5 || this.bW() && $$4.d == 0.0 || this.ce()) && !this.bY()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dL().a(djn.P, this.dj(), djn.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean b(ehh $$0) {
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
      this.a(apg.iY, 0.7F, 1.6F + (this.ag.i() - this.ag.i()) * 0.4F);
   }

   public void aD() {
      if (!this.dL().B && this.aC) {
         this.aC();
      }

      this.ay();
   }

   protected void aE() {
      if (this.aR()) {
         this.aQ();
         if (this.aU().b()) {
            this.a(djn.x);
         }
      }
   }

   @Deprecated
   public gw aF() {
      return this.d(0.2F);
   }

   protected gw aG() {
      return this.d(0.500001F);
   }

   public gw aH() {
      return this.d(1.0E-5F);
   }

   protected gw d(float $$0) {
      if (this.aD.isPresent()) {
         gw $$1 = this.aD.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dfd $$2 = this.dL().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(apv.S)) && !$$2.a(apv.L) && !($$2.b() instanceof cvz) ? $$1.h(asb.a(this.u.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = asb.a(this.u.c);
         int $$4 = asb.a(this.u.d - (double)$$0);
         int $$5 = asb.a(this.u.e);
         return new gw($$3, $$4, $$5);
      }
   }

   protected float aI() {
      float $$0 = this.dL().a_(this.dl()).b().l();
      float $$1 = this.dL().a_(this.aG()).b().l();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aJ() {
      dfd $$0 = this.dL().a_(this.dl());
      float $$1 = $$0.b().j();
      if (!$$0.a(cte.G) && !$$0.a(cte.nd)) {
         return (double)$$1 == 1.0 ? this.dL().a_(this.aG()).b().j() : $$1;
      } else {
         return $$1;
      }
   }

   protected ehh a(ehh $$0, bjs $$1) {
      return $$0;
   }

   protected ehh c(ehh $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dL().V();
         if ($$1 != this.bg) {
            Arrays.fill(this.bf, 0.0);
            this.bg = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(ha.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? ehh.b : new ehh($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(ha.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? ehh.b : new ehh(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(ha.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? ehh.b : new ehh(0.0, 0.0, $$4);
         } else {
            return ehh.b;
         }
      }
   }

   private double a(ha.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = asb.a($$1 + this.bf[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bf[$$2];
      this.bf[$$2] = $$3;
      return $$1;
   }

   private ehh h(ehh $$0) {
      ehc $$1 = this.cG();
      List<eia> $$2 = this.dL().c(this, $$1.b($$0));
      ehh $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dL(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.aA() || $$5 && $$0.d < 0.0;
      if (this.dF() > 0.0F && $$7 && ($$4 || $$6)) {
         ehh $$8 = a(this, new ehh($$0.c, (double)this.dF(), $$0.e), $$1, this.dL(), $$2);
         ehh $$9 = a(this, new ehh(0.0, (double)this.dF(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dL(), $$2);
         if ($$9.d < (double)this.dF()) {
            ehh $$10 = a(this, new ehh($$0.c, 0.0, $$0.e), $$1.c($$9), this.dL(), $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new ehh(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.dL(), $$2));
         }
      }

      return $$3;
   }

   public static ehh a(@Nullable biw $$0, ehh $$1, ehc $$2, cqb $$3, List<eia> $$4) {
      Builder<eia> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      dgu $$6 = $$3.B_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.e($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static ehh a(ehh $$0, ehc $$1, List<eia> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = ehx.a(ha.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = ehx.a(ha.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = ehx.a(ha.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = ehx.a(ha.a.c, $$1, $$2, $$5);
         }

         return new ehh($$3, $$4, $$5);
      }
   }

   protected float aK() {
      return (float)((int)this.Z + 1);
   }

   protected apf aL() {
      return apg.jc;
   }

   protected apf aM() {
      return apg.jb;
   }

   protected apf aN() {
      return apg.jb;
   }

   protected void aO() {
      ehc $$0 = this.cG();
      gw $$1 = gw.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      gw $$2 = gw.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dL().a($$1, $$2)) {
         gw.a $$3 = new gw.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bv()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  dfd $$7 = this.dL().a_($$3);

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

   protected void a(dfd $$0) {
   }

   public void a(djn $$0, @Nullable biw $$1) {
      this.dL().a($$1, $$0, this.u);
   }

   public void a(djn $$0) {
      this.a($$0, this);
   }

   private void c(gw $$0, dfd $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.s();
      }
   }

   protected void aP() {
      biw $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      ehh $$2 = $$0.do();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected gw e(gw $$0) {
      gw $$1 = $$0.c();
      dfd $$2 = this.dL().a_($$1);
      return !$$2.a(apv.bm) && !$$2.a(apv.bn) ? $$0 : $$1;
   }

   protected void a(dfd $$0, dfd $$1) {
      dan $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dfd $$0) {
      dan $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(gw $$0, dfd $$1) {
      dan $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dfd $$0) {
      return $$0.a(apv.bl) && this.ah >= this.bl + 20;
   }

   private void s() {
      this.bk = this.bk * (float)Math.pow(0.997, (double)(this.ah - this.bl));
      this.bk = Math.min(1.0F, this.bk + 0.07F);
      float $$0 = 0.5F + this.bk * this.ag.i() * 1.2F;
      float $$1 = 0.1F + this.bk * 1.2F;
      this.a(apg.E, $$1, $$0);
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

   public void a(apf $$0, float $$1, float $$2) {
      if (!this.aS()) {
         this.dL().a(null, this.dq(), this.ds(), this.dw(), $$0, this.da(), $$1, $$2);
      }
   }

   public void a(apf $$0) {
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

   protected biw.b aU() {
      return biw.b.d;
   }

   public boolean aV() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dfd $$2, gw $$3) {
      if ($$1) {
         if (this.ab > 0.0F) {
            $$2.b().a(this.dL(), $$2, $$3, this, this.ab);
            this.dL().a(djn.A, this.u, djn.a.a(this, this.aD.<dfd>map($$0x -> this.dL().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ab -= (float)$$0;
      }
   }

   public boolean aW() {
      return this.ag().d();
   }

   public boolean a(float $$0, float $$1, bhu $$2) {
      if (this.p.a(apy.o)) {
         return false;
      } else {
         if (this.bO()) {
            for (biw $$3 : this.cP()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean aX() {
      return this.ai;
   }

   private boolean w() {
      gw $$0 = this.dl();
      return this.dL().q($$0) || this.dL().q(gw.a((double)$$0.u(), this.cG().e, (double)$$0.w()));
   }

   private boolean x() {
      return this.dL().a_(this.dl()).a(cte.nd);
   }

   public boolean aY() {
      return this.aX() || this.w();
   }

   public boolean aZ() {
      return this.aX() || this.w() || this.x();
   }

   public boolean ba() {
      return this.aX() || this.x();
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
         this.h(this.bX() && this.bc() && !this.bN() && this.dL().b_(this.v).a(aqa.a));
      }
   }

   protected boolean be() {
      this.aj.clear();
      this.bf();
      double $$0 = this.dL().C_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(aqa.b, $$0);
      return this.aX() || $$1;
   }

   void bf() {
      if (this.cY() instanceof cdt $$0 && !$$0.bc()) {
         this.ai = false;
         return;
      }

      if (this.a(aqa.a, 0.014)) {
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

   private void z() {
      this.ak = this.a(aqa.a);
      this.aO.clear();
      double $$0 = this.du() - 0.11111111F;
      if (this.cY() instanceof cdt $$2 && !$$2.bc() && $$2.cG().e >= $$0 && $$2.cG().b <= $$0) {
         return;
      }

      gw $$3 = gw.a(this.dq(), $$0, this.dw());
      eag $$4 = this.dL().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((cph)this.dL(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aO::add);
      }
   }

   protected void bg() {
      biw $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      ehh $$2 = $$0.do();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aM(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      } else {
         this.a(this.aN(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      }

      float $$4 = (float)asb.a(this.ds());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bh.a * 20.0F; $$5++) {
         double $$6 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         double $$7 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         this.dL().a(iv.e, this.dq() + $$6, (double)($$4 + 1.0F), this.dw() + $$7, $$2.c, $$2.d - this.ag.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bh.a * 20.0F; $$8++) {
         double $$9 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         double $$10 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         this.dL().a(iv.ag, this.dq() + $$9, (double)($$4 + 1.0F), this.dw() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(djn.O);
   }

   @Deprecated
   protected dfd bh() {
      return this.dL().a_(this.aF());
   }

   public dfd bi() {
      return this.dL().a_(this.aH());
   }

   public boolean bj() {
      return this.bX() && !this.aX() && !this.M_() && !this.bW() && !this.bl() && this.bv();
   }

   protected void bk() {
      gw $$0 = this.aF();
      dfd $$1 = this.dL().a_($$0);
      if ($$1.l() != czg.a) {
         ehh $$2 = this.do();
         gw $$3 = this.dl();
         double $$4 = this.dq() + (this.ag.j() - 0.5) * (double)this.bh.a;
         double $$5 = this.dw() + (this.ag.j() - 0.5) * (double)this.bh.a;
         if ($$3.u() != $$0.u()) {
            $$4 = asb.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = asb.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dL().a(new in(iv.c, $$1), $$4, this.ds() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(aqk<eaf> $$0) {
      return this.aO.contains($$0);
   }

   public boolean bl() {
      return !this.am && this.aj.getDouble(aqa.b) > 0.0;
   }

   public void a(float $$0, ehh $$1) {
      ehh $$2 = a($$1, $$0, this.dB());
      this.f(this.do().e($$2));
   }

   private static ehh a(ehh $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return ehh.b;
      } else {
         ehh $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = asb.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = asb.b($$2 * (float) (Math.PI / 180.0));
         return new ehh($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bm() {
      return this.dL().f(this.dp(), this.dv()) ? this.dL().w(gw.a(this.dq(), this.du(), this.dw())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.r($$3 % 360.0F);
      this.s(asb.a($$4, -90.0F, 90.0F) % 360.0F);
      this.N = this.dB();
      this.O = this.dD();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = asb.a($$0, -3.0E7, 3.0E7);
      double $$4 = asb.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.e($$3, $$1, $$4);
   }

   public void d(ehh $$0) {
      this.d($$0.c, $$0.d, $$0.e);
   }

   public void d(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dB(), this.dD());
   }

   public void a(gw $$0, float $$1, float $$2) {
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

   public float e(biw $$0) {
      float $$1 = (float)(this.dq() - $$0.dq());
      float $$2 = (float)(this.ds() - $$0.ds());
      float $$3 = (float)(this.dw() - $$0.dw());
      return asb.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dq() - $$0;
      double $$4 = this.ds() - $$1;
      double $$5 = this.dw() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double f(biw $$0) {
      return this.e($$0.dj());
   }

   public double e(ehh $$0) {
      double $$1 = this.dq() - $$0.c;
      double $$2 = this.ds() - $$0.d;
      double $$3 = this.dw() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cca $$0) {
   }

   public void g(biw $$0) {
      if (!this.y($$0)) {
         if (!$$0.af && !this.af) {
            double $$1 = $$0.dq() - this.dq();
            double $$2 = $$0.dw() - this.dw();
            double $$3 = asb.a($$1, $$2);
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
      this.f(this.do().b($$0, $$1, $$2));
      this.au = true;
   }

   protected void bo() {
      this.T = true;
   }

   public boolean a(bhu $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bo();
         return false;
      }
   }

   public final ehh f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dD() : asb.i($$0, this.O, this.dD());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dB() : asb.i($$0, this.N, this.dB());
   }

   protected final ehh b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = asb.b($$3);
      float $$5 = asb.a($$3);
      float $$6 = asb.b($$2);
      float $$7 = asb.a($$2);
      return new ehh((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final ehh i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final ehh c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final ehh bp() {
      return new ehh(this.dq(), this.du(), this.dw());
   }

   public final ehh j(float $$0) {
      double $$1 = asb.d((double)$$0, this.K, this.dq());
      double $$2 = asb.d((double)$$0, this.L, this.ds()) + (double)this.cH();
      double $$3 = asb.d((double)$$0, this.M, this.dw());
      return new ehh($$1, $$2, $$3);
   }

   public ehh k(float $$0) {
      return this.j($$0);
   }

   public final ehh l(float $$0) {
      double $$1 = asb.d((double)$$0, this.K, this.dq());
      double $$2 = asb.d((double)$$0, this.L, this.ds());
      double $$3 = asb.d((double)$$0, this.M, this.dw());
      return new ehh($$1, $$2, $$3);
   }

   public ehf a(double $$0, float $$1, boolean $$2) {
      ehh $$3 = this.j($$1);
      ehh $$4 = this.f($$1);
      ehh $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dL().a(new cpk($$3, $$5, cpk.a.b, $$2 ? cpk.b.c : cpk.b.a, this));
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

   public void a(biw $$0, int $$1, bhu $$2) {
      if ($$0 instanceof aku) {
         al.c.a((aku)$$0, this, $$2);
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
      double $$1 = this.cG().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * o;
      return $$0 < $$1 * $$1;
   }

   public boolean d(qw $$0) {
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

   public boolean e(qw $$0) {
      return this.bN() ? false : this.d($$0);
   }

   public qw f(qw $$0) {
      try {
         if (this.s != null) {
            $$0.a("Pos", this.a(this.s.dq(), this.ds(), this.s.dw()));
         } else {
            $$0.a("Pos", this.a(this.dq(), this.ds(), this.dw()));
         }

         ehh $$1 = this.do();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dB(), this.dD()));
         $$0.a("FallDistance", this.ab);
         $$0.a("Fire", (short)this.aN);
         $$0.a("Air", (short)this.ch());
         $$0.a("OnGround", this.aA());
         $$0.a("Invulnerable", this.bc);
         $$0.a("PortalCooldown", this.bb);
         $$0.a("UUID", this.cv());
         tl $$2 = this.ad();
         if ($$2 != null) {
            $$0.a("CustomName", tl.a.a($$2));
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
            rc $$4 = new rc();

            for (String $$5 : this.be) {
               $$4.add(ro.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bO()) {
            rc $$6 = new rc();

            for (biw $$7 : this.cP()) {
               qw $$8 = new qw();
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

   public void g(qw $$0) {
      try {
         rc $$1 = $$0.c("Pos", 6);
         rc $$2 = $$0.c("Motion", 6);
         rc $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(asb.a($$1.h(0), -3.0000512E7, 3.0000512E7), asb.a($$1.h(1), -2.0E7, 2.0E7), asb.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.r($$3.i(0));
         this.s($$3.i(1));
         this.bn();
         this.n(this.dB());
         this.o(this.dB());
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

         if (!Double.isFinite(this.dq()) || !Double.isFinite(this.ds()) || !Double.isFinite(this.dw())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dB()) && Double.isFinite((double)this.dD())) {
            this.ap();
            this.a(this.dB(), this.dD());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(tl.a.a($$8));
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
               rc $$10 = $$0.c("Tags", 8);
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
      bja<?> $$0 = this.ag();
      aez $$1 = bja.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(qw var1);

   protected abstract void b(qw var1);

   protected rc a(double... $$0) {
      rc $$1 = new rc();

      for (double $$2 : $$0) {
         $$1.add(qx.a($$2));
      }

      return $$1;
   }

   protected rc a(float... $$0) {
      rc $$1 = new rc();

      for (float $$2 : $$0) {
         $$1.add(qz.a($$2));
      }

      return $$1;
   }

   @Nullable
   public byt a(cqa $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public byt a(cqa $$0, int $$1) {
      return this.a(new cjl($$0), (float)$$1);
   }

   @Nullable
   public byt b(cjl $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public byt a(cjl $$0, float $$1) {
      if ($$0.b()) {
         return null;
      } else if (this.dL().B) {
         return null;
      } else {
         byt $$2 = new byt(this.dL(), this.dq(), this.ds() + (double)$$1, this.dw(), $$0);
         $$2.t();
         this.dL().b($$2);
         return $$2;
      }
   }

   public boolean bv() {
      return !this.dG();
   }

   public boolean bw() {
      if (this.af) {
         return false;
      } else {
         float $$0 = this.bh.a * 0.8F;
         ehc $$1 = ehc.a(this.bp(), (double)$$0, 1.0E-6, (double)$$0);
         return gw.a($$1)
            .anyMatch(
               $$1x -> {
                  dfd $$2 = this.dL().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dL(), $$1x)
                     && ehx.c($$2.k(this.dL(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), ehx.a($$1), ehl.i);
               }
            );
      }
   }

   public bhe a(cca $$0, bhd $$1) {
      return bhe.d;
   }

   public boolean h(biw $$0) {
      return $$0.bx() && !this.y($$0);
   }

   public boolean bx() {
      return false;
   }

   public void by() {
      this.f(ehh.b);
      this.l();
      if (this.bN()) {
         this.cY().i(this);
      }
   }

   public final void i(biw $$0) {
      if (this.x($$0)) {
         this.a($$0, biw::e);
      }
   }

   protected void a(biw $$0, biw.a $$1) {
      ehh $$2 = this.m($$0);
      $$1.accept($$0, $$2.c, $$2.d + (double)$$0.k(this), $$2.e);
   }

   public void j(biw $$0) {
   }

   public float k(biw $$0) {
      return this.l($$0);
   }

   protected float l(biw $$0) {
      return 0.0F;
   }

   public ehh m(biw $$0) {
      return new ehh(this.a($$0, this.bh, 1.0F).rotateY(-this.aG * (float) (Math.PI / 180.0))).e(this.dj());
   }

   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   public boolean n(biw $$0) {
      return this.a($$0, false);
   }

   public boolean bz() {
      return this instanceof bjm;
   }

   public boolean a(biw $$0, boolean $$1) {
      if ($$0 == this.s) {
         return false;
      } else if (!$$0.bC()) {
         return false;
      } else {
         for (biw $$2 = $$0; $$2.s != null; $$2 = $$2.s) {
            if ($$2.s == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bN()) {
               this.aa();
            }

            this.b(bjy.a);
            this.s = $$0;
            this.s.p(this);
            $$0.B().filter($$0x -> $$0x instanceof aku).forEach($$0x -> al.R.a((aku)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(biw $$0) {
      return !this.bR() && this.J <= 0;
   }

   public void bA() {
      for (int $$0 = this.r.size() - 1; $$0 >= 0; $$0--) {
         ((biw)this.r.get($$0)).aa();
      }
   }

   public void bB() {
      if (this.s != null) {
         biw $$0 = this.s;
         this.s = null;
         $$0.q(this);
      }
   }

   public void aa() {
      this.bB();
   }

   protected void p(biw $$0) {
      if ($$0.cY() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.r.isEmpty()) {
            this.r = ImmutableList.of($$0);
         } else {
            List<biw> $$1 = Lists.newArrayList(this.r);
            if (!this.dL().B && $$0 instanceof cca && !(this.cQ() instanceof cca)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.r = ImmutableList.copyOf($$1);
         }

         this.a(djn.s, $$0);
      }
   }

   protected void q(biw $$0) {
      if ($$0.cY() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.r.size() == 1 && this.r.get(0) == $$0) {
            this.r = ImmutableList.of();
         } else {
            this.r = this.r.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(djn.q, $$0);
      }
   }

   protected boolean r(biw $$0) {
      return this.r.isEmpty();
   }

   protected boolean bC() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.e($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public double n_() {
      return this.dq();
   }

   public double K_() {
      return this.ds();
   }

   public double L_() {
      return this.dw();
   }

   public float d_() {
      return this.dD();
   }

   public float o_() {
      return this.dB();
   }

   public void a(float $$0, int $$1) {
      this.n($$0);
   }

   public float bD() {
      return 0.0F;
   }

   public ehh bE() {
      return this.b(this.dD(), this.dB());
   }

   public ehh a(cjg $$0) {
      if (!(this instanceof cca $$1)) {
         return ehh.b;
      } else {
         boolean $$2 = $$1.eT().a($$0) && !$$1.eS().a($$0);
         bjg $$3 = $$2 ? $$1.fm().e() : $$1.fm();
         return this.b(0.0F, this.dB() + (float)($$3 == bjg.b ? 80 : -80)).a(0.5);
      }
   }

   public ehg bF() {
      return new ehg(this.dD(), this.dB());
   }

   public ehh bG() {
      return ehh.a(this.bF());
   }

   public void f(gw $$0) {
      if (this.au()) {
         this.as();
      } else {
         if (!this.dL().B && !$$0.equals(this.ax)) {
            this.ax = $$0.i();
         }

         this.av = true;
      }
   }

   protected void bH() {
      if (this.dL() instanceof akt) {
         int $$0 = this.av();
         akt $$1 = (akt)this.dL();
         if (this.av) {
            MinecraftServer $$2 = $$1.n();
            aey<cqb> $$3 = this.dL().ac() == cqb.i ? cqb.h : cqb.i;
            akt $$4 = $$2.a($$3);
            if ($$4 != null && $$2.B() && !this.bN() && this.aw++ >= $$0) {
               this.dL().ad().a("portal");
               this.aw = $$0;
               this.as();
               this.b($$4);
               this.dL().ad().c();
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

         this.J();
      }
   }

   public int bI() {
      return 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
   }

   public void c(bhu $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            cwu.a(this);
      }
   }

   public void m(float $$0) {
   }

   public Iterable<cjl> bJ() {
      return e;
   }

   public Iterable<cjl> bK() {
      return e;
   }

   public Iterable<cjl> bL() {
      return Iterables.concat(this.bJ(), this.bK());
   }

   public void a(bjb $$0, cjl $$1) {
   }

   public boolean bM() {
      boolean $$0 = this.dL() != null && this.dL().B;
      return !this.aW() && (this.aN > 0 || $$0 && this.i(0));
   }

   public boolean bN() {
      return this.cY() != null;
   }

   public boolean bO() {
      return !this.r.isEmpty();
   }

   public boolean bP() {
      return this.ag().a(apy.p);
   }

   public boolean bQ() {
      return !this.ag().a(apy.q);
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
      return this.c(bjy.f);
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
      return this.c(bjy.d);
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
      return this.dL().w_() ? this.i(6) : this.bd;
   }

   public boolean cd() {
      return this.i(5);
   }

   public boolean d(cca $$0) {
      if ($$0.M_()) {
         return false;
      } else {
         eii $$1 = this.cf();
         return $$1 != null && $$0 != null && $$0.cf() == $$1 && $$1.i() ? false : this.cd();
      }
   }

   public boolean ce() {
      return false;
   }

   public void a(BiConsumer<djk<?>, akt> $$0) {
   }

   @Nullable
   public eii cf() {
      return this.dL().I().g(this.cx());
   }

   public boolean s(biw $$0) {
      return this.a($$0.cf());
   }

   public boolean a(eii $$0) {
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

   public void a(akt $$0, bjl $$1) {
      this.h(this.aN + 1);
      if (this.aN == 0) {
         this.g(8);
      }

      this.a(this.dM().b(), 5.0F);
   }

   public void k(boolean $$0) {
      ehh $$1 = this.do();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void l(boolean $$0) {
      ehh $$1 = this.do();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(akt $$0, bjm $$1) {
      return true;
   }

   public void cm() {
      if (this.do().b() > -0.5 && this.ab > 1.0F) {
         this.ab = 1.0F;
      }
   }

   public void n() {
      this.ab = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      gw $$3 = gw.a($$0, $$1, $$2);
      ehh $$4 = new ehh($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      gw.a $$5 = new gw.a();
      ha $$6 = ha.b;
      double $$7 = Double.MAX_VALUE;

      for (ha $$8 : new ha[]{ha.c, ha.d, ha.e, ha.f, ha.b}) {
         $$5.a($$3, $$8);
         if (!this.dL().a_($$5).r(this.dL(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == ha.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ag.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      ehh $$13 = this.do().a(0.75);
      if ($$6.o() == ha.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == ha.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == ha.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dfd $$0, ehh $$1) {
      this.n();
      this.U = $$1;
   }

   private static tl c(tl $$0) {
      tz $$1 = $$0.e().b($$0.a().a(null));

      for (tl $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public tl ab() {
      tl $$0 = this.ad();
      return $$0 != null ? c($$0) : this.cn();
   }

   protected tl cn() {
      return this.p.h();
   }

   public boolean t(biw $$0) {
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

   public boolean u(biw $$0) {
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
            this.ab().getString(),
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
            this.ab().getString(),
            this.q,
            $$0,
            this.dq(),
            this.ds(),
            this.dw()
         );
   }

   public boolean b(bhu $$0) {
      return this.dG() || this.bc && !$$0.a(apx.d) && !$$0.g() || $$0.a(apx.i) && this.aW() || $$0.a(apx.m) && this.ag().a(apy.o);
   }

   public boolean cq() {
      return this.bc;
   }

   public void m(boolean $$0) {
      this.bc = $$0;
   }

   public void v(biw $$0) {
      this.b($$0.dq(), $$0.ds(), $$0.dw(), $$0.dB(), $$0.dD());
   }

   public void w(biw $$0) {
      qw $$1 = $$0.f(new qw());
      $$1.r("Dimension");
      this.g($$1);
      this.bb = $$0.bb;
      this.ax = $$0.ax;
   }

   @Nullable
   public biw b(akt $$0) {
      if (this.dL() instanceof akt && !this.dG()) {
         this.dL().ad().a("changeDimension");
         this.ae();
         this.dL().ad().a("reposition");
         ebd $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dL().ad().b("reloading");
            biw $$2 = this.ag().a((cqb)$$0);
            if ($$2 != null) {
               $$2.w(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dD());
               $$2.f($$1.b);
               $$0.d($$2);
               if ($$0.ac() == cqb.j) {
                  akt.a($$0);
               }
            }

            this.cr();
            this.dL().ad().c();
            ((akt)this.dL()).g();
            $$0.g();
            this.dL().ad().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void cr() {
      this.b(biw.c.e);
   }

   @Nullable
   protected ebd a(akt $$0) {
      boolean $$1 = this.dL().ac() == cqb.j && $$0.ac() == cqb.h;
      boolean $$2 = $$0.ac() == cqb.j;
      if (!$$1 && !$$2) {
         boolean $$5 = $$0.ac() == cqb.i;
         if (this.dL().ac() != cqb.i && !$$5) {
            return null;
         } else {
            dgu $$6 = $$0.B_();
            double $$7 = dim.a(this.dL().C_(), $$0.C_());
            gw $$8 = $$6.b(this.dq() * $$7, this.ds(), this.dw() * $$7);
            return this.a($$0, $$8, $$5, $$6).map($$1x -> {
               dfd $$2x = this.dL().a_(this.ax);
               ha.a $$3;
               ehh $$5x;
               if ($$2x.b(dft.H)) {
                  $$3 = $$2x.c(dft.H);
                  l.a $$4 = l.a(this.ax, $$3, 21, ha.a.b, 21, $$1xx -> this.dL().a_($$1xx) == $$2x);
                  $$5x = this.a($$3, $$4);
               } else {
                  $$3 = ha.a.a;
                  $$5x = new ehh(0.5, 0.0, 0.0);
               }

               return ebe.a($$0, $$1x, $$3, $$5x, this, this.do(), this.dB(), this.dD());
            }).orElse(null);
         }
      } else {
         gw $$3;
         if ($$2) {
            $$3 = akt.a;
         } else {
            $$3 = $$0.a(dkm.a.f, $$0.R());
         }

         return new ebd(new ehh((double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5), this.do(), this.dB(), this.dD());
      }
   }

   protected ehh a(ha.a $$0, l.a $$1) {
      return ebe.a($$1, $$0, this.dj(), this.a(this.an()));
   }

   protected Optional<l.a> a(akt $$0, gw $$1, boolean $$2, dgu $$3) {
      return $$0.o().a($$1, $$2, $$3);
   }

   public boolean cs() {
      return !this.bN() && !this.bO();
   }

   public float a(cpt $$0, cph $$1, gw $$2, dfd $$3, eag $$4, float $$5) {
      return $$5;
   }

   public boolean a(cpt $$0, cph $$1, gw $$2, dfd $$3, float $$4) {
      return true;
   }

   public int ct() {
      return 3;
   }

   public boolean p_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bja.a(this.ag()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.q);
      $$0.a("Entity Name", () -> this.ab().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dq(), this.ds(), this.dw()));
      $$0.a("Entity's Block location", p.a(this.dL(), asb.a(this.dq()), asb.a(this.ds()), asb.a(this.dw())));
      ehh $$1 = this.do();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", () -> this.cP().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.cY()));
   }

   public boolean cu() {
      return this.bM() && !this.M_();
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
   public tl N_() {
      return eie.a(this.cf(), this.ab()).a($$0 -> $$0.a(this.cF()).a(this.cw()));
   }

   public void b(@Nullable tl $$0) {
      this.an.b(aU, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public tl ad() {
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
      if (this.dL() instanceof akt) {
         cpi $$3 = new cpi(gw.a($$0, $$1, $$2));
         ((akt)this.dL()).k().a(aky.g, $$3, 0, this.ah());
         this.dL().d($$3.e, $$3.f);
         this.b($$0, $$1, $$2);
      }
   }

   public boolean a(akt $$0, double $$1, double $$2, double $$3, Set<bka> $$4, float $$5, float $$6) {
      float $$7 = asb.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dL()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.A();
         this.n($$5);
      } else {
         this.ae();
         biw $$8 = this.ag().a((cqb)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(biw.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (this.dL() instanceof akt) {
         this.b($$0, $$1, $$2, this.dB(), this.dD());
         this.A();
      }
   }

   private void A() {
      this.cR().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.r.iterator();

         while (var1.hasNext()) {
            biw $$1 = (biw)var1.next();
            $$0.a($$1, biw::d);
         }
      });
   }

   public void c(double $$0, double $$1, double $$2) {
      this.b(this.dq() + $$0, this.ds() + $$1, this.dw() + $$2);
   }

   public boolean cB() {
      return this.cA();
   }

   public void a(List<aei.b<?>> $$0) {
   }

   public void a(aef<?> $$0) {
      if (as.equals($$0)) {
         this.i_();
      }
   }

   @Deprecated
   protected void cC() {
      bjy $$0 = this.an();
      bix $$1 = this.a($$0);
      this.bh = $$1;
      this.bi = this.a($$0, $$1);
   }

   public void i_() {
      bix $$0 = this.bh;
      bjy $$1 = this.an();
      bix $$2 = this.a($$1);
      this.bh = $$2;
      this.bi = this.a($$1, $$2);
      this.ap();
      boolean $$3 = (double)$$2.a <= 4.0 && (double)$$2.b <= 4.0;
      if (!this.dL().B && !this.am && !this.af && $$3 && ($$2.a > $$0.a || $$2.b > $$0.b) && !(this instanceof cca)) {
         ehh $$4 = this.dj().b(0.0, (double)$$0.b / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a - $$0.a) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b - $$0.b) + 1.0E-6;
         eia $$7 = ehx.a(ehc.a($$4, $$5, $$6, $$5));
         this.dL().a(this, $$7, $$4, (double)$$2.a, (double)$$2.b, (double)$$2.a).ifPresent($$1x -> this.a($$1x.b(0.0, (double)(-$$2.b) / 2.0, 0.0)));
      }
   }

   public ha cD() {
      return ha.a((double)this.dB());
   }

   public ha cE() {
      return this.cD();
   }

   protected tr cF() {
      return new tr(tr.a.c, new tr.b(this.ag(), this.cv(), this.ab()));
   }

   public boolean a(aku $$0) {
      return true;
   }

   @Override
   public final ehc cG() {
      return this.aI;
   }

   public ehc g_() {
      return this.cG();
   }

   public final void a(ehc $$0) {
      this.aI = $$0;
   }

   protected float a(bjy $$0, bix $$1) {
      return $$1.b * 0.85F;
   }

   public float d(bjy $$0) {
      return this.a($$0, this.a($$0));
   }

   public final float cH() {
      return this.bi;
   }

   public ehh p(float $$0) {
      return this.cI();
   }

   protected ehh cI() {
      return new ehh(0.0, (double)this.cH(), (double)(this.df() * 0.4F));
   }

   public bke a_(int $$0) {
      return bke.b;
   }

   @Override
   public void a(tl $$0) {
   }

   public cqb cJ() {
      return this.dL();
   }

   @Nullable
   public MinecraftServer cK() {
      return this.dL().n();
   }

   public bhe a(cca $$0, ehh $$1, bhd $$2) {
      return bhe.d;
   }

   public boolean cL() {
      return false;
   }

   public void a(bjm $$0, biw $$1) {
      if ($$1 instanceof bjm) {
         cnw.a((bjm)$$1, $$0);
      }

      cnw.b($$0, $$1);
   }

   public void c(aku $$0) {
   }

   public void d(aku $$0) {
   }

   public float a(czn $$0) {
      float $$1 = asb.g(this.dB());
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

   public float a(cxx $$0) {
      float $$1 = asb.g(this.dB());
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
   public bjm cN() {
      return null;
   }

   public final boolean cO() {
      return this.cN() != null;
   }

   public final List<biw> cP() {
      return this.r;
   }

   @Nullable
   public biw cQ() {
      return this.r.isEmpty() ? null : (biw)this.r.get(0);
   }

   public boolean x(biw $$0) {
      return this.r.contains($$0);
   }

   public boolean a(Predicate<biw> $$0) {
      UnmodifiableIterator var2 = this.r.iterator();

      while (var2.hasNext()) {
         biw $$1 = (biw)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<biw> B() {
      return this.r.stream().flatMap(biw::cR);
   }

   @Override
   public Stream<biw> cR() {
      return Stream.concat(Stream.of(this), this.B());
   }

   @Override
   public Stream<biw> cS() {
      return Stream.concat(this.r.stream().flatMap(biw::cS), Stream.of(this));
   }

   public Iterable<biw> cT() {
      return () -> this.B().iterator();
   }

   public boolean cU() {
      return this.B().filter($$0 -> $$0 instanceof cca).count() == 1L;
   }

   public biw cV() {
      biw $$0 = this;

      while ($$0.bN()) {
         $$0 = $$0.cY();
      }

      return $$0;
   }

   public boolean y(biw $$0) {
      return this.cV() == $$0.cV();
   }

   public boolean z(biw $$0) {
      if (!$$0.bN()) {
         return false;
      } else {
         biw $$1 = $$0.cY();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean cW() {
      return this.cN() instanceof cca $$0 ? $$0.g() : this.cX();
   }

   public boolean cX() {
      return !this.dL().B;
   }

   protected static ehh a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -asb.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = asb.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new ehh((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public ehh b(bjm $$0) {
      return new ehh(this.dq(), this.cG().e, this.dw());
   }

   @Nullable
   public biw cY() {
      return this.s;
   }

   @Nullable
   public biw cZ() {
      return this.s != null && this.s.cN() == this ? this.s : null;
   }

   public eal q_() {
      return eal.a;
   }

   public aph da() {
      return aph.g;
   }

   protected int db() {
      return 1;
   }

   public dt dc() {
      return new dt(
         this, this.dj(), this.bF(), this.dL() instanceof akt ? (akt)this.dL() : null, this.D(), this.ab().getString(), this.N_(), this.dL().n(), this
      );
   }

   protected int D() {
      return 0;
   }

   public boolean l(int $$0) {
      return this.D() >= $$0;
   }

   @Override
   public boolean j_() {
      return this.dL().X().b(cpx.o);
   }

   @Override
   public boolean v_() {
      return true;
   }

   @Override
   public boolean T_() {
      return true;
   }

   public void a(ed.a $$0, ehh $$1) {
      ehh $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.s(asb.g((float)(-(asb.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.r(asb.g((float)(asb.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dB());
      this.O = this.dD();
      this.N = this.dB();
   }

   public boolean a(aqk<eaf> $$0, double $$1) {
      if (this.dd()) {
         return false;
      } else {
         ehc $$2 = this.cG().h(0.001);
         int $$3 = asb.a($$2.a);
         int $$4 = asb.c($$2.d);
         int $$5 = asb.a($$2.b);
         int $$6 = asb.c($$2.e);
         int $$7 = asb.a($$2.c);
         int $$8 = asb.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cy();
         boolean $$11 = false;
         ehh $$12 = ehh.b;
         int $$13 = 0;
         gw.a $$14 = new gw.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  eag $$18 = this.dL().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((cph)this.dL(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           ehh $$20 = $$18.c(this.dL(), $$14);
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

            if (!(this instanceof cca)) {
               $$12 = $$12.d();
            }

            ehh $$21 = this.do();
            $$12 = $$12.a($$1 * 1.0);
            double $$22 = 0.003;
            if (Math.abs($$21.c) < 0.003 && Math.abs($$21.e) < 0.003 && $$12.f() < 0.0045000000000000005) {
               $$12 = $$12.d().a(0.0045000000000000005);
            }

            this.f(this.do().e($$12));
         }

         this.aj.put($$0, $$9);
         return $$11;
      }
   }

   public boolean dd() {
      ehc $$0 = this.cG().g(1.0);
      int $$1 = asb.a($$0.a);
      int $$2 = asb.c($$0.d);
      int $$3 = asb.a($$0.c);
      int $$4 = asb.c($$0.f);
      return !this.dL().b($$1, $$3, $$2, $$4);
   }

   public double b(aqk<eaf> $$0) {
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

   public ve<wx> di() {
      return new wy(this);
   }

   public bix a(bjy $$0) {
      return this.p.n();
   }

   public ehh dj() {
      return this.u;
   }

   public ehh dk() {
      return this.dj();
   }

   @Override
   public gw dl() {
      return this.v;
   }

   public dfd dm() {
      if (this.bn == null) {
         this.bn = this.dL().a_(this.dl());
      }

      return this.bn;
   }

   public cpi dn() {
      return this.aE;
   }

   public ehh do() {
      return this.aF;
   }

   public void f(ehh $$0) {
      this.aF = $$0;
   }

   public void g(ehh $$0) {
      this.f(this.do().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.f(new ehh($$0, $$1, $$2));
   }

   public final int dp() {
      return this.v.u();
   }

   public final double dq() {
      return this.u.c;
   }

   public double c(double $$0) {
      return this.u.c + (double)this.df() * $$0;
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
      return this.u.d + (double)this.dg() * $$0;
   }

   public double dt() {
      return this.e(this.ag.j());
   }

   public double du() {
      return this.u.d + (double)this.bi;
   }

   public final int dv() {
      return this.v.w();
   }

   public final double dw() {
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
         this.u = new ehh($$0, $$1, $$2);
         int $$3 = asb.a($$0);
         int $$4 = asb.a($$1);
         int $$5 = asb.a($$2);
         if ($$3 != this.v.u() || $$4 != this.v.v() || $$5 != this.v.w()) {
            this.v = new gw($$3, $$4, $$5);
            this.bn = null;
            if (hw.a($$3) != this.aE.e || hw.a($$5) != this.aE.f) {
               this.aE = new cpi(this.v);
            }
         }

         this.aZ.a();
      }
   }

   public void dx() {
   }

   public ehh q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bi * 0.7, 0.0);
   }

   public void a(wy $$0) {
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
   public cjl dy() {
      return null;
   }

   public void o(boolean $$0) {
      this.aA = $$0;
   }

   public boolean dz() {
      return !this.ag().a(apy.k);
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
      return this.aM;
   }

   public void t(float $$0) {
      this.aM = $$0;
   }

   public final boolean dG() {
      return this.aK != null;
   }

   @Nullable
   public biw.c dH() {
      return this.aK;
   }

   @Override
   public final void b(biw.c $$0) {
      if (this.aK == null) {
         this.aK = $$0;
      }

      if (this.aK.a()) {
         this.aa();
      }

      this.cP().forEach(biw::aa);
      this.aZ.a($$0);
   }

   protected void dI() {
      this.aK = null;
   }

   @Override
   public void a(div $$0) {
      this.aZ = $$0;
   }

   @Override
   public boolean dJ() {
      if (this.aK != null && !this.aK.b()) {
         return false;
      } else {
         return this.bN() ? false : !this.bO() || !this.cU();
      }
   }

   @Override
   public boolean dK() {
      return false;
   }

   public boolean a(cqb $$0, gw $$1) {
      return true;
   }

   public cqb dL() {
      return this.t;
   }

   protected void a(cqb $$0) {
      this.t = $$0;
   }

   public bhv dM() {
      return this.dL().ag();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = asb.d($$6, this.dq(), $$1);
      double $$8 = asb.d($$6, this.ds(), $$2);
      double $$9 = asb.d($$6, this.dw(), $$3);
      float $$10 = (float)asb.e($$6, (double)this.dB(), $$4);
      float $$11 = (float)asb.d($$6, (double)this.dD(), $$5);
      this.e($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   @FunctionalInterface
   public interface a {
      void accept(biw var1, double var2, double var4, double var6);
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
