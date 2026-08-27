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

public abstract class biq implements bhc, dja, ds {
   private static final Logger c = LogUtils.getLogger();
   public static final String w = "id";
   public static final String x = "Passengers";
   private static final AtomicInteger d = new AtomicInteger();
   private static final List<cjf> e = Collections.emptyList();
   public static final int y = 60;
   public static final int z = 300;
   public static final int A = 1024;
   public static final float B = 0.2F;
   public static final double C = 0.500001;
   public static final double D = 0.999999;
   public static final float E = 0.11111111F;
   public static final int F = 140;
   public static final int G = 40;
   private static final ehi k = new ehi(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double l = 0.014;
   private static final double m = 0.007;
   private static final double n = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double o = 1.0;
   private final biu<?> p;
   private int q = d.incrementAndGet();
   public boolean I;
   private ImmutableList<biq> r = ImmutableList.of();
   protected int J;
   @Nullable
   private biq s;
   private cpv t;
   public double K;
   public double L;
   public double M;
   private ehn u;
   private gw v;
   private cpc aE;
   private ehn aF = ehn.b;
   private float aG;
   private float aH;
   public float N;
   public float O;
   private ehi aI = k;
   private boolean aJ;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected ehn U = ehn.b;
   @Nullable
   private biq.c aK;
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
   protected final asc ag = asc.a();
   public int ah;
   private int aN = -this.dc();
   protected boolean ai;
   protected Object2DoubleMap<aqi<eal>> aj = new Object2DoubleArrayMap(2);
   protected boolean ak;
   private final Set<aqi<eal>> aO = new HashSet<>();
   public int al;
   protected boolean am = true;
   protected final aei an;
   protected static final aef<Byte> ao = aei.a(biq.class, aeh.a);
   protected static final int ap = 0;
   private static final int aP = 1;
   private static final int aQ = 3;
   private static final int aR = 4;
   private static final int aS = 5;
   protected static final int aq = 6;
   protected static final int ar = 7;
   private static final aef<Integer> aT = aei.a(biq.class, aeh.b);
   private static final aef<Optional<tl>> aU = aei.a(biq.class, aeh.g);
   private static final aef<Boolean> aV = aei.a(biq.class, aeh.k);
   private static final aef<Boolean> aW = aei.a(biq.class, aeh.k);
   private static final aef<Boolean> aX = aei.a(biq.class, aeh.k);
   protected static final aef<bjs> as = aei.a(biq.class, aeh.v);
   private static final aef<Integer> aY = aei.a(biq.class, aeh.b);
   private djb aZ = djb.a;
   private final acz ba = new acz();
   public boolean at;
   public boolean au;
   private int bb;
   protected boolean av;
   protected int aw;
   protected gw ax;
   private boolean bc;
   protected UUID ay = arx.a(this.ag);
   protected String az = this.ay.toString();
   private boolean bd;
   private final Set<String> be = Sets.newHashSet();
   private final double[] bf = new double[]{0.0, 0.0, 0.0};
   private long bg;
   private bir bh;
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
   private dfj bn = null;

   public biq(biu<?> $$0, cpv $$1) {
      this.p = $$0;
      this.t = $$1;
      this.bh = $$0.n();
      this.u = ehn.b;
      this.v = gw.b;
      this.aE = cpc.b;
      this.an = new aei(this);
      this.an.a(ao, (byte)0);
      this.an.a(aT, this.ch());
      this.an.a(aV, false);
      this.an.a(aU, Optional.empty());
      this.an.a(aW, false);
      this.an.a(aX, false);
      this.an.a(as, bjs.a);
      this.an.a(aY, 0);
      this.a_();
      this.e(0.0, 0.0, 0.0);
      this.bi = this.a(bjs.a, this.bh);
   }

   public boolean a(gw $$0, dfj $$1) {
      eig $$2 = $$1.b(this.dL(), $$0, ehs.a(this));
      eig $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return eid.c($$3, eid.a(this.cH()), ehr.i);
   }

   public int h_() {
      eio $$0 = this.cg();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean M_() {
      return false;
   }

   public final void af() {
      if (this.bP()) {
         this.bB();
      }

      if (this.bO()) {
         this.ab();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.ba.e(new ehn($$0, $$1, $$2));
   }

   public acz ag() {
      return this.ba;
   }

   public biu<?> ah() {
      return this.p;
   }

   @Override
   public int ai() {
      return this.q;
   }

   public void e(int $$0) {
      this.q = $$0;
   }

   public Set<String> aj() {
      return this.be;
   }

   public boolean a(String $$0) {
      return this.be.size() >= 1024 ? false : this.be.add($$0);
   }

   public boolean b(String $$0) {
      return this.be.remove($$0);
   }

   public void ak() {
      this.a(biq.c.a);
      this.a(djt.p);
   }

   public final void al() {
      this.a(biq.c.b);
   }

   protected abstract void a_();

   public aei am() {
      return this.an;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof biq ? ((biq)$$0).q == this.q : false;
   }

   @Override
   public int hashCode() {
      return this.q;
   }

   public void a(biq.c $$0) {
      this.b($$0);
   }

   public void an() {
   }

   public void b(bjs $$0) {
      this.an.b(as, $$0);
   }

   public bjs ao() {
      return this.an.b(as);
   }

   public boolean c(bjs $$0) {
      return this.ao() == $$0;
   }

   public boolean a(biq $$0, double $$1) {
      return this.dj().a((hq)$$0.dj(), $$1);
   }

   public boolean a(biq $$0, double $$1, double $$2) {
      double $$3 = $$0.dq() - this.dq();
      double $$4 = $$0.ds() - this.ds();
      double $$5 = $$0.dw() - this.dw();
      return arx.e($$3, $$5) < arx.k($$1) && arx.k($$4) < arx.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.r($$0 % 360.0F);
      this.s($$1 % 360.0F);
   }

   public final void a(ehn $$0) {
      this.e($$0.a(), $$0.b(), $$0.c());
   }

   public void e(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.ap());
   }

   protected ehi ap() {
      return this.bh.a(this.u);
   }

   protected void aq() {
      this.e(this.u.c, this.u.d, this.u.e);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.s(this.dD() + $$2);
      this.r(this.dB() + $$3);
      this.s(arx.a(this.dD(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = arx.a(this.O, -90.0F, 90.0F);
      if (this.s != null) {
         this.s.j(this);
      }
   }

   public void l() {
      this.ar();
   }

   public void ar() {
      this.dL().ad().a("entityBaseTick");
      this.bn = null;
      if (this.bO() && this.cZ().dG()) {
         this.ab();
      }

      if (this.J > 0) {
         this.J--;
      }

      this.X = this.Y;
      this.O = this.dD();
      this.N = this.dB();
      this.bI();
      if (this.bk()) {
         this.bl();
      }

      this.aB = this.aA;
      this.aA = false;
      this.bf();
      this.z();
      this.be();
      if (this.dL().B) {
         this.az();
      } else if (this.aN > 0) {
         if (this.aX()) {
            this.h(this.aN - 4);
            if (this.aN < 0) {
               this.az();
            }
         } else {
            if (this.aN % 20 == 0 && !this.bm()) {
               this.a(this.dM().c(), 1.0F);
            }

            this.h(this.aN - 1);
         }

         if (this.cj() > 0) {
            this.k(0);
            this.dL().a(null, 1009, this.v, 1);
         }
      }

      if (this.bm()) {
         this.ax();
         this.ab *= 0.5F;
      }

      this.as();
      if (!this.dL().B) {
         this.a_(this.aN > 0);
      }

      this.am = false;
      this.dL().ad().c();
   }

   public void a_(boolean $$0) {
      this.b(0, $$0 || this.bm);
   }

   public void as() {
      if (this.ds() < (double)(this.dL().H_() - 64)) {
         this.aA();
      }
   }

   public void at() {
      this.bb = this.bJ();
   }

   public void f(int $$0) {
      this.bb = $$0;
   }

   public int au() {
      return this.bb;
   }

   public boolean av() {
      return this.bb > 0;
   }

   protected void J() {
      if (this.av()) {
         this.bb--;
      }
   }

   public int aw() {
      return 0;
   }

   public void ax() {
      if (!this.aX()) {
         this.g(15);
         if (this.a(this.dM().d(), 4.0F)) {
            this.a(ape.iT, 0.4F, 2.0F + this.ag.i() * 0.4F);
         }
      }
   }

   public void g(int $$0) {
      int $$1 = $$0 * 20;
      if (this instanceof bjg) {
         $$1 = cob.a((bjg)this, $$1);
      }

      if (this.aN < $$1) {
         this.h($$1);
      }
   }

   public void h(int $$0) {
      this.aN = $$0;
   }

   public int ay() {
      return this.aN;
   }

   public void az() {
      this.h(0);
   }

   protected void aA() {
      this.al();
   }

   public boolean g(double $$0, double $$1, double $$2) {
      return this.b(this.cH().d($$0, $$1, $$2));
   }

   private boolean b(ehi $$0) {
      return this.dL().a(this, $$0) && !this.dL().d($$0);
   }

   public void c(boolean $$0) {
      this.aJ = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, ehn $$1) {
      this.aJ = $$0;
      this.b($$0, $$1);
   }

   public boolean d(gw $$0) {
      return this.aD.isPresent() && this.aD.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable ehn $$1) {
      if ($$0) {
         ehi $$2 = this.cH();
         ehi $$3 = new ehi($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<gw> $$4 = this.t.g(this, $$3);
         if ($$4.isPresent() || this.bj) {
            this.aD = $$4;
         } else if ($$1 != null) {
            ehi $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
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

   public boolean aB() {
      return this.aJ;
   }

   public void a(bjm $$0, ehn $$1) {
      if (this.af) {
         this.e(this.dq() + $$1.c, this.ds() + $$1.d, this.dw() + $$1.e);
      } else {
         this.aC = this.bN();
         if ($$0 == bjm.c) {
            $$1 = this.c($$1);
            if ($$1.equals(ehn.b)) {
               return;
            }
         }

         this.dL().ad().a("move");
         if (this.U.g() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = ehn.b;
            this.f(ehn.b);
         }

         $$1 = this.a($$1, $$0);
         ehn $$2 = this.h($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ab != 0.0F && $$3 >= 1.0) {
               ehj $$4 = this.dL().a(new cpe(this.dj(), this.dj().e($$2), cpe.a.d, cpe.b.d, this));
               if ($$4.c() != ehl.a.a) {
                  this.n();
               }
            }

            this.e(this.dq() + $$2.c, this.ds() + $$2.d, this.dw() + $$2.e);
         }

         this.dL().ad().c();
         this.dL().ad().a("rest");
         boolean $$5 = !arx.b($$1.c, $$2.c);
         boolean $$6 = !arx.b($$1.e, $$2.e);
         this.P = $$5 || $$6;
         this.Q = $$1.d != $$2.d;
         this.R = this.Q && $$1.d < 0.0;
         if (this.P) {
            this.S = this.b($$2);
         } else {
            this.S = false;
         }

         this.a(this.R, $$2);
         gw $$7 = this.aG();
         dfj $$8 = this.dL().a_($$7);
         this.a($$2.d, this.aB(), $$8, $$7);
         if (this.dG()) {
            this.dL().ad().c();
         } else {
            if (this.P) {
               ehn $$9 = this.do();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            csv $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dL(), this);
            }

            if (this.aB()) {
               $$10.a(this.dL(), $$7, $$8, this);
            }

            biq.b $$11 = this.aV();
            if ($$11.a() && !this.bO()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.aa = this.aa + (float)($$2.f() * 0.6);
               gw $$15 = this.aI();
               dfj $$16 = this.dL().a_($$15);
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
                     this.aL = this.aL();
                  } else if (this.aY()) {
                     this.aL = this.aL();
                     if ($$11.c()) {
                        this.aQ();
                     }

                     if ($$11.b()) {
                        this.a(djt.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aF();
               }
            }

            this.aC();
            float $$20 = this.aK();
            this.f(this.do().d((double)$$20, 1.0, (double)$$20));
            if (this.dL().c(this.cH().h(1.0E-6)).noneMatch($$0x -> $$0x.a(apt.aJ) || $$0x.a(csw.H))) {
               if (this.aN <= 0) {
                  this.h(-this.dc());
               }

               if (this.aC && (this.aA || this.ba())) {
                  this.aD();
               }
            }

            if (this.bN() && (this.aA || this.ba())) {
               this.h(-this.dc());
            }

            this.dL().ad().c();
         }
      }
   }

   private boolean c(dfj $$0) {
      return $$0.a(apt.aO) || $$0.a(csw.qC);
   }

   private boolean a(gw $$0, dfj $$1, boolean $$2, boolean $$3, ehn $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aB() || $$5 || this.bX() && $$4.d == 0.0 || this.cf()) && !this.bZ()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dL().a(djt.P, this.dj(), djt.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean b(ehn $$0) {
      return false;
   }

   protected void aC() {
      try {
         this.aP();
      } catch (Throwable var4) {
         o $$1 = o.a(var4, "Checking entity block collision");
         p $$2 = $$1.a("Entity being checked for collision");
         this.a($$2);
         throw new y($$1);
      }
   }

   protected void aD() {
      this.a(ape.iY, 0.7F, 1.6F + (this.ag.i() - this.ag.i()) * 0.4F);
   }

   public void aE() {
      if (!this.dL().B && this.aC) {
         this.aD();
      }

      this.az();
   }

   protected void aF() {
      if (this.aS()) {
         this.aR();
         if (this.aV().b()) {
            this.a(djt.x);
         }
      }
   }

   @Deprecated
   public gw aG() {
      return this.d(0.2F);
   }

   protected gw aH() {
      return this.d(0.500001F);
   }

   public gw aI() {
      return this.d(1.0E-5F);
   }

   protected gw d(float $$0) {
      if (this.aD.isPresent()) {
         gw $$1 = this.aD.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dfj $$2 = this.dL().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(apt.S)) && !$$2.a(apt.L) && !($$2.b() instanceof cvq) ? $$1.h(arx.a(this.u.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = arx.a(this.u.c);
         int $$4 = arx.a(this.u.d - (double)$$0);
         int $$5 = arx.a(this.u.e);
         return new gw($$3, $$4, $$5);
      }
   }

   protected float aJ() {
      float $$0 = this.dL().a_(this.dl()).b().j();
      float $$1 = this.dL().a_(this.aH()).b().j();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aK() {
      dfj $$0 = this.dL().a_(this.dl());
      float $$1 = $$0.b().i();
      if (!$$0.a(csw.G) && !$$0.a(csw.nd)) {
         return (double)$$1 == 1.0 ? this.dL().a_(this.aH()).b().i() : $$1;
      } else {
         return $$1;
      }
   }

   protected ehn a(ehn $$0, bjm $$1) {
      return $$0;
   }

   protected ehn c(ehn $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dL().V();
         if ($$1 != this.bg) {
            Arrays.fill(this.bf, 0.0);
            this.bg = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(hc.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? ehn.b : new ehn($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(hc.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? ehn.b : new ehn(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(hc.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? ehn.b : new ehn(0.0, 0.0, $$4);
         } else {
            return ehn.b;
         }
      }
   }

   private double a(hc.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = arx.a($$1 + this.bf[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bf[$$2];
      this.bf[$$2] = $$3;
      return $$1;
   }

   private ehn h(ehn $$0) {
      ehi $$1 = this.cH();
      List<eig> $$2 = this.dL().c(this, $$1.b($$0));
      ehn $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dL(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.aB() || $$5 && $$0.d < 0.0;
      if (this.dF() > 0.0F && $$7 && ($$4 || $$6)) {
         ehn $$8 = a(this, new ehn($$0.c, (double)this.dF(), $$0.e), $$1, this.dL(), $$2);
         ehn $$9 = a(this, new ehn(0.0, (double)this.dF(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dL(), $$2);
         if ($$9.d < (double)this.dF()) {
            ehn $$10 = a(this, new ehn($$0.c, 0.0, $$0.e), $$1.c($$9), this.dL(), $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new ehn(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.dL(), $$2));
         }
      }

      return $$3;
   }

   public static ehn a(@Nullable biq $$0, ehn $$1, ehi $$2, cpv $$3, List<eig> $$4) {
      Builder<eig> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      dha $$6 = $$3.B_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.e($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static ehn a(ehn $$0, ehi $$1, List<eig> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = eid.a(hc.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = eid.a(hc.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = eid.a(hc.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = eid.a(hc.a.c, $$1, $$2, $$5);
         }

         return new ehn($$3, $$4, $$5);
      }
   }

   protected float aL() {
      return (float)((int)this.Z + 1);
   }

   protected apd aM() {
      return ape.jc;
   }

   protected apd aN() {
      return ape.jb;
   }

   protected apd aO() {
      return ape.jb;
   }

   protected void aP() {
      ehi $$0 = this.cH();
      gw $$1 = gw.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      gw $$2 = gw.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dL().a($$1, $$2)) {
         gw.a $$3 = new gw.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bw()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  dfj $$7 = this.dL().a_($$3);

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

   protected void a(dfj $$0) {
   }

   public void a(djt $$0, @Nullable biq $$1) {
      this.dL().a($$1, $$0, this.u);
   }

   public void a(djt $$0) {
      this.a($$0, this);
   }

   private void c(gw $$0, dfj $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.s();
      }
   }

   protected void aQ() {
      biq $$0 = Objects.requireNonNullElse(this.cO(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      ehn $$2 = $$0.do();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected gw e(gw $$0) {
      gw $$1 = $$0.c();
      dfj $$2 = this.dL().a_($$1);
      return !$$2.a(apt.bm) && !$$2.a(apt.bn) ? $$0 : $$1;
   }

   protected void a(dfj $$0, dfj $$1) {
      dai $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dfj $$0) {
      dai $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(gw $$0, dfj $$1) {
      dai $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dfj $$0) {
      return $$0.a(apt.bl) && this.ah >= this.bl + 20;
   }

   private void s() {
      this.bk = this.bk * (float)Math.pow(0.997, (double)(this.ah - this.bl));
      this.bk = Math.min(1.0F, this.bk + 0.07F);
      float $$0 = 0.5F + this.bk * this.ag.i() * 1.2F;
      float $$1 = 0.1F + this.bk * 1.2F;
      this.a(ape.E, $$1, $$0);
      this.bl = this.ah;
   }

   protected void e(float $$0) {
      this.a(this.aM(), $$0, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
   }

   protected void aR() {
   }

   protected boolean aS() {
      return false;
   }

   public void a(apd $$0, float $$1, float $$2) {
      if (!this.aT()) {
         this.dL().a(null, this.dq(), this.ds(), this.dw(), $$0, this.db(), $$1, $$2);
      }
   }

   public void a(apd $$0) {
      if (!this.aT()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean aT() {
      return this.an.b(aW);
   }

   public void d(boolean $$0) {
      this.an.b(aW, $$0);
   }

   public boolean aU() {
      return this.an.b(aX);
   }

   public void e(boolean $$0) {
      this.an.b(aX, $$0);
   }

   protected biq.b aV() {
      return biq.b.d;
   }

   public boolean aW() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dfj $$2, gw $$3) {
      if ($$1) {
         if (this.ab > 0.0F) {
            $$2.b().a(this.dL(), $$2, $$3, this, this.ab);
            this.dL().a(djt.A, this.u, djt.a.a(this, this.aD.<dfj>map($$0x -> this.dL().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ab -= (float)$$0;
      }
   }

   public boolean aX() {
      return this.ah().d();
   }

   public boolean a(float $$0, float $$1, bho $$2) {
      if (this.p.a(apw.l)) {
         return false;
      } else {
         if (this.bP()) {
            for (biq $$3 : this.cQ()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean aY() {
      return this.ai;
   }

   private boolean w() {
      gw $$0 = this.dl();
      return this.dL().q($$0) || this.dL().q(gw.a((double)$$0.u(), this.cH().e, (double)$$0.w()));
   }

   private boolean x() {
      return this.dL().a_(this.dl()).a(csw.nd);
   }

   public boolean aZ() {
      return this.aY() || this.w();
   }

   public boolean ba() {
      return this.aY() || this.w() || this.x();
   }

   public boolean bb() {
      return this.aY() || this.x();
   }

   public boolean bc() {
      return this.bb() || this.bm();
   }

   public boolean bd() {
      return this.ak && this.aY();
   }

   public void be() {
      if (this.bZ()) {
         this.h(this.bY() && this.aY() && !this.bO());
      } else {
         this.h(this.bY() && this.bd() && !this.bO() && this.dL().b_(this.v).a(apy.a));
      }
   }

   protected boolean bf() {
      this.aj.clear();
      this.bg();
      double $$0 = this.dL().C_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(apy.b, $$0);
      return this.aY() || $$1;
   }

   void bg() {
      if (this.cZ() instanceof cdn $$0 && !$$0.bd()) {
         this.ai = false;
         return;
      }

      if (this.a(apy.a, 0.014)) {
         if (!this.ai && !this.am) {
            this.bh();
         }

         this.n();
         this.ai = true;
         this.az();
      } else {
         this.ai = false;
      }
   }

   private void z() {
      this.ak = this.a(apy.a);
      this.aO.clear();
      double $$0 = this.du() - 0.11111111F;
      if (this.cZ() instanceof cdn $$2 && !$$2.bd() && $$2.cH().e >= $$0 && $$2.cH().b <= $$0) {
         return;
      }

      gw $$3 = gw.a(this.dq(), $$0, this.dw());
      eam $$4 = this.dL().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((cpb)this.dL(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aO::add);
      }
   }

   protected void bh() {
      biq $$0 = Objects.requireNonNullElse(this.cO(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      ehn $$2 = $$0.do();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aN(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      } else {
         this.a(this.aO(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      }

      float $$4 = (float)arx.a(this.ds());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bh.a * 20.0F; $$5++) {
         double $$6 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         double $$7 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         this.dL().a(ix.e, this.dq() + $$6, (double)($$4 + 1.0F), this.dw() + $$7, $$2.c, $$2.d - this.ag.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bh.a * 20.0F; $$8++) {
         double $$9 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         double $$10 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         this.dL().a(ix.ag, this.dq() + $$9, (double)($$4 + 1.0F), this.dw() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(djt.O);
   }

   @Deprecated
   protected dfj bi() {
      return this.dL().a_(this.aG());
   }

   public dfj bj() {
      return this.dL().a_(this.aI());
   }

   public boolean bk() {
      return this.bY() && !this.aY() && !this.M_() && !this.bX() && !this.bm() && this.bw();
   }

   protected void bl() {
      gw $$0 = this.aG();
      dfj $$1 = this.dL().a_($$0);
      if ($$1.l() != cza.a) {
         ehn $$2 = this.do();
         gw $$3 = this.dl();
         double $$4 = this.dq() + (this.ag.j() - 0.5) * (double)this.bh.a;
         double $$5 = this.dw() + (this.ag.j() - 0.5) * (double)this.bh.a;
         if ($$3.u() != $$0.u()) {
            $$4 = arx.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = arx.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dL().a(new ip(ix.c, $$1), $$4, this.ds() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(aqi<eal> $$0) {
      return this.aO.contains($$0);
   }

   public boolean bm() {
      return !this.am && this.aj.getDouble(apy.b) > 0.0;
   }

   public void a(float $$0, ehn $$1) {
      ehn $$2 = a($$1, $$0, this.dB());
      this.f(this.do().e($$2));
   }

   private static ehn a(ehn $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return ehn.b;
      } else {
         ehn $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = arx.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = arx.b($$2 * (float) (Math.PI / 180.0));
         return new ehn($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bn() {
      return this.dL().f(this.dp(), this.dv()) ? this.dL().w(gw.a(this.dq(), this.du(), this.dw())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.r($$3 % 360.0F);
      this.s(arx.a($$4, -90.0F, 90.0F) % 360.0F);
      this.N = this.dB();
      this.O = this.dD();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = arx.a($$0, -3.0E7, 3.0E7);
      double $$4 = arx.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.e($$3, $$1, $$4);
   }

   public void d(ehn $$0) {
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
      this.bo();
      this.aq();
   }

   public final void bo() {
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

   public float e(biq $$0) {
      float $$1 = (float)(this.dq() - $$0.dq());
      float $$2 = (float)(this.ds() - $$0.ds());
      float $$3 = (float)(this.dw() - $$0.dw());
      return arx.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dq() - $$0;
      double $$4 = this.ds() - $$1;
      double $$5 = this.dw() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double f(biq $$0) {
      return this.e($$0.dj());
   }

   public double e(ehn $$0) {
      double $$1 = this.dq() - $$0.c;
      double $$2 = this.ds() - $$0.d;
      double $$3 = this.dw() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cbu $$0) {
   }

   public void g(biq $$0) {
      if (!this.y($$0)) {
         if (!$$0.af && !this.af) {
            double $$1 = $$0.dq() - this.dq();
            double $$2 = $$0.dw() - this.dw();
            double $$3 = arx.a($$1, $$2);
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
               if (!this.bP() && this.bt()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.bP() && $$0.bt()) {
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

   protected void bp() {
      this.T = true;
   }

   public boolean a(bho $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bp();
         return false;
      }
   }

   public final ehn f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dD() : arx.i($$0, this.O, this.dD());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dB() : arx.i($$0, this.N, this.dB());
   }

   protected final ehn b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = arx.b($$3);
      float $$5 = arx.a($$3);
      float $$6 = arx.b($$2);
      float $$7 = arx.a($$2);
      return new ehn((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final ehn i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final ehn c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final ehn bq() {
      return new ehn(this.dq(), this.du(), this.dw());
   }

   public final ehn j(float $$0) {
      double $$1 = arx.d((double)$$0, this.K, this.dq());
      double $$2 = arx.d((double)$$0, this.L, this.ds()) + (double)this.cI();
      double $$3 = arx.d((double)$$0, this.M, this.dw());
      return new ehn($$1, $$2, $$3);
   }

   public ehn k(float $$0) {
      return this.j($$0);
   }

   public final ehn l(float $$0) {
      double $$1 = arx.d((double)$$0, this.K, this.dq());
      double $$2 = arx.d((double)$$0, this.L, this.ds());
      double $$3 = arx.d((double)$$0, this.M, this.dw());
      return new ehn($$1, $$2, $$3);
   }

   public ehl a(double $$0, float $$1, boolean $$2) {
      ehn $$3 = this.j($$1);
      ehn $$4 = this.f($$1);
      ehn $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dL().a(new cpe($$3, $$5, cpe.a.b, $$2 ? cpe.b.c : cpe.b.a, this));
   }

   public boolean br() {
      return this.bw() && this.bs();
   }

   public boolean bs() {
      return false;
   }

   public boolean bt() {
      return false;
   }

   public void a(biq $$0, int $$1, bho $$2) {
      if ($$0 instanceof aks) {
         al.c.a((aks)$$0, this, $$2);
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

   public boolean d(qx $$0) {
      if (this.aK != null && !this.aK.b()) {
         return false;
      } else {
         String $$1 = this.bv();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.f($$0);
            return true;
         }
      }
   }

   public boolean e(qx $$0) {
      return this.bO() ? false : this.d($$0);
   }

   public qx f(qx $$0) {
      try {
         if (this.s != null) {
            $$0.a("Pos", this.a(this.s.dq(), this.ds(), this.s.dw()));
         } else {
            $$0.a("Pos", this.a(this.dq(), this.ds(), this.dw()));
         }

         ehn $$1 = this.do();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dB(), this.dD()));
         $$0.a("FallDistance", this.ab);
         $$0.a("Fire", (short)this.aN);
         $$0.a("Air", (short)this.ci());
         $$0.a("OnGround", this.aB());
         $$0.a("Invulnerable", this.bc);
         $$0.a("PortalCooldown", this.bb);
         $$0.a("UUID", this.cw());
         tl $$2 = this.ae();
         if ($$2 != null) {
            $$0.a("CustomName", tl.a.a($$2));
         }

         if (this.cB()) {
            $$0.a("CustomNameVisible", this.cB());
         }

         if (this.aT()) {
            $$0.a("Silent", this.aT());
         }

         if (this.aU()) {
            $$0.a("NoGravity", this.aU());
         }

         if (this.bd) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.cj();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.cj());
         }

         if (this.bm) {
            $$0.a("HasVisualFire", this.bm);
         }

         if (!this.be.isEmpty()) {
            rd $$4 = new rd();

            for (String $$5 : this.be) {
               $$4.add(ro.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bP()) {
            rd $$6 = new rd();

            for (biq $$7 : this.cQ()) {
               qx $$8 = new qx();
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

   public void g(qx $$0) {
      try {
         rd $$1 = $$0.c("Pos", 6);
         rd $$2 = $$0.c("Motion", 6);
         rd $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(arx.a($$1.h(0), -3.0000512E7, 3.0000512E7), arx.a($$1.h(1), -2.0E7, 2.0E7), arx.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.r($$3.i(0));
         this.s($$3.i(1));
         this.bo();
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
            this.aq();
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
               rd $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.be.add($$10.j($$12));
               }
            }

            this.a($$0);
            if (this.bu()) {
               this.aq();
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

   protected boolean bu() {
      return true;
   }

   @Nullable
   protected final String bv() {
      biu<?> $$0 = this.ah();
      aex $$1 = biu.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(qx var1);

   protected abstract void b(qx var1);

   protected rd a(double... $$0) {
      rd $$1 = new rd();

      for (double $$2 : $$0) {
         $$1.add(qy.a($$2));
      }

      return $$1;
   }

   protected rd a(float... $$0) {
      rd $$1 = new rd();

      for (float $$2 : $$0) {
         $$1.add(ra.a($$2));
      }

      return $$1;
   }

   @Nullable
   public byn a(cpu $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public byn a(cpu $$0, int $$1) {
      return this.a(new cjf($$0), (float)$$1);
   }

   @Nullable
   public byn b(cjf $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public byn a(cjf $$0, float $$1) {
      if ($$0.b()) {
         return null;
      } else if (this.dL().B) {
         return null;
      } else {
         byn $$2 = new byn(this.dL(), this.dq(), this.ds() + (double)$$1, this.dw(), $$0);
         $$2.t();
         this.dL().b($$2);
         return $$2;
      }
   }

   public boolean bw() {
      return !this.dG();
   }

   public boolean bx() {
      if (this.af) {
         return false;
      } else {
         float $$0 = this.bh.a * 0.8F;
         ehi $$1 = ehi.a(this.bq(), (double)$$0, 1.0E-6, (double)$$0);
         return gw.a($$1)
            .anyMatch(
               $$1x -> {
                  dfj $$2 = this.dL().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dL(), $$1x)
                     && eid.c($$2.k(this.dL(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), eid.a($$1), ehr.i);
               }
            );
      }
   }

   public bgy a(cbu $$0, bgx $$1) {
      return bgy.d;
   }

   public boolean h(biq $$0) {
      return $$0.by() && !this.y($$0);
   }

   public boolean by() {
      return false;
   }

   public void bz() {
      this.f(ehn.b);
      this.l();
      if (this.bO()) {
         this.cZ().i(this);
      }
   }

   public final void i(biq $$0) {
      if (this.x($$0)) {
         this.a($$0, biq::e);
      }
   }

   protected void a(biq $$0, biq.a $$1) {
      ehn $$2 = this.m($$0);
      $$1.accept($$0, $$2.c, $$2.d + (double)$$0.k(this), $$2.e);
   }

   public void j(biq $$0) {
   }

   public float k(biq $$0) {
      return this.l($$0);
   }

   protected float l(biq $$0) {
      return 0.0F;
   }

   public ehn m(biq $$0) {
      return new ehn(this.a($$0, this.bh, 1.0F).rotateY(-this.aG * (float) (Math.PI / 180.0))).e(this.dj());
   }

   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   public boolean n(biq $$0) {
      return this.a($$0, false);
   }

   public boolean bA() {
      return this instanceof bjg;
   }

   public boolean a(biq $$0, boolean $$1) {
      if ($$0 == this.s) {
         return false;
      } else if (!$$0.bD()) {
         return false;
      } else {
         for (biq $$2 = $$0; $$2.s != null; $$2 = $$2.s) {
            if ($$2.s == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bO()) {
               this.ab();
            }

            this.b(bjs.a);
            this.s = $$0;
            this.s.p(this);
            $$0.B().filter($$0x -> $$0x instanceof aks).forEach($$0x -> al.R.a((aks)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(biq $$0) {
      return !this.bS() && this.J <= 0;
   }

   public void bB() {
      for (int $$0 = this.r.size() - 1; $$0 >= 0; $$0--) {
         ((biq)this.r.get($$0)).ab();
      }
   }

   public void bC() {
      if (this.s != null) {
         biq $$0 = this.s;
         this.s = null;
         $$0.q(this);
      }
   }

   public void ab() {
      this.bC();
   }

   protected void p(biq $$0) {
      if ($$0.cZ() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.r.isEmpty()) {
            this.r = ImmutableList.of($$0);
         } else {
            List<biq> $$1 = Lists.newArrayList(this.r);
            if (!this.dL().B && $$0 instanceof cbu && !(this.cR() instanceof cbu)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.r = ImmutableList.copyOf($$1);
         }

         this.a(djt.s, $$0);
      }
   }

   protected void q(biq $$0) {
      if ($$0.cZ() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.r.size() == 1 && this.r.get(0) == $$0) {
            this.r = ImmutableList.of();
         } else {
            this.r = this.r.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(djt.q, $$0);
      }
   }

   protected boolean r(biq $$0) {
      return this.r.isEmpty();
   }

   protected boolean bD() {
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

   public float bE() {
      return 0.0F;
   }

   public ehn bF() {
      return this.b(this.dD(), this.dB());
   }

   public ehn a(cja $$0) {
      if (!(this instanceof cbu $$1)) {
         return ehn.b;
      } else {
         boolean $$2 = $$1.eT().a($$0) && !$$1.eS().a($$0);
         bja $$3 = $$2 ? $$1.fl().e() : $$1.fl();
         return this.b(0.0F, this.dB() + (float)($$3 == bja.b ? 80 : -80)).a(0.5);
      }
   }

   public ehm bG() {
      return new ehm(this.dD(), this.dB());
   }

   public ehn bH() {
      return ehn.a(this.bG());
   }

   public void f(gw $$0) {
      if (this.av()) {
         this.at();
      } else {
         if (!this.dL().B && !$$0.equals(this.ax)) {
            this.ax = $$0.i();
         }

         this.av = true;
      }
   }

   protected void bI() {
      if (this.dL() instanceof akr) {
         int $$0 = this.aw();
         akr $$1 = (akr)this.dL();
         if (this.av) {
            MinecraftServer $$2 = $$1.n();
            aew<cpv> $$3 = this.dL().ac() == cpv.i ? cpv.h : cpv.i;
            akr $$4 = $$2.a($$3);
            if ($$4 != null && $$2.B() && !this.bO() && this.aw++ >= $$0) {
               this.dL().ad().a("portal");
               this.aw = $$0;
               this.at();
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

   public int bJ() {
      return 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
   }

   public void c(bho $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            cwm.a(this);
      }
   }

   public void m(float $$0) {
   }

   public Iterable<cjf> bK() {
      return e;
   }

   public Iterable<cjf> bL() {
      return e;
   }

   public Iterable<cjf> bM() {
      return Iterables.concat(this.bK(), this.bL());
   }

   public void a(biv $$0, cjf $$1) {
   }

   public boolean bN() {
      boolean $$0 = this.dL() != null && this.dL().B;
      return !this.aX() && (this.aN > 0 || $$0 && this.i(0));
   }

   public boolean bO() {
      return this.cZ() != null;
   }

   public boolean bP() {
      return !this.r.isEmpty();
   }

   public boolean bQ() {
      return this.ah().a(apw.m);
   }

   public boolean bR() {
      return !this.ah().a(apw.n);
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
      return this.c(bjs.f);
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
      return this.c(bjs.d);
   }

   public boolean cb() {
      return this.ca() && !this.aY();
   }

   public void h(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cc() {
      return this.bd;
   }

   public final void i(boolean $$0) {
      this.bd = $$0;
      this.b(6, this.cd());
   }

   public boolean cd() {
      return this.dL().w_() ? this.i(6) : this.bd;
   }

   public boolean ce() {
      return this.i(5);
   }

   public boolean d(cbu $$0) {
      if ($$0.M_()) {
         return false;
      } else {
         eio $$1 = this.cg();
         return $$1 != null && $$0 != null && $$0.cg() == $$1 && $$1.i() ? false : this.ce();
      }
   }

   public boolean cf() {
      return false;
   }

   public void a(BiConsumer<djq<?>, akr> $$0) {
   }

   @Nullable
   public eio cg() {
      return this.dL().I().g(this.cy());
   }

   public boolean s(biq $$0) {
      return this.a($$0.cg());
   }

   public boolean a(eio $$0) {
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
      return this.an.b(aT);
   }

   public void j(int $$0) {
      this.an.b(aT, $$0);
   }

   public int cj() {
      return this.an.b(aY);
   }

   public void k(int $$0) {
      this.an.b(aY, $$0);
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

   public void a(akr $$0, bjf $$1) {
      this.h(this.aN + 1);
      if (this.aN == 0) {
         this.g(8);
      }

      this.a(this.dM().b(), 5.0F);
   }

   public void k(boolean $$0) {
      ehn $$1 = this.do();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void l(boolean $$0) {
      ehn $$1 = this.do();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(akr $$0, bjg $$1) {
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
      gw $$3 = gw.a($$0, $$1, $$2);
      ehn $$4 = new ehn($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      gw.a $$5 = new gw.a();
      hc $$6 = hc.b;
      double $$7 = Double.MAX_VALUE;

      for (hc $$8 : new hc[]{hc.c, hc.d, hc.e, hc.f, hc.b}) {
         $$5.a($$3, $$8);
         if (!this.dL().a_($$5).r(this.dL(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == hc.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ag.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      ehn $$13 = this.do().a(0.75);
      if ($$6.o() == hc.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == hc.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == hc.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dfj $$0, ehn $$1) {
      this.n();
      this.U = $$1;
   }

   private static tl c(tl $$0) {
      ty $$1 = $$0.d().b($$0.a().a(null));

      for (tl $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public tl ac() {
      tl $$0 = this.ae();
      return $$0 != null ? c($$0) : this.co();
   }

   protected tl co() {
      return this.p.h();
   }

   public boolean t(biq $$0) {
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

   public boolean u(biq $$0) {
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
            this.ac().getString(),
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
            this.ac().getString(),
            this.q,
            $$0,
            this.dq(),
            this.ds(),
            this.dw()
         );
   }

   public boolean b(bho $$0) {
      return this.dG() || this.bc && !$$0.a(apv.d) && !$$0.g() || $$0.a(apv.i) && this.aX() || $$0.a(apv.m) && this.ah().a(apw.l);
   }

   public boolean cr() {
      return this.bc;
   }

   public void m(boolean $$0) {
      this.bc = $$0;
   }

   public void v(biq $$0) {
      this.b($$0.dq(), $$0.ds(), $$0.dw(), $$0.dB(), $$0.dD());
   }

   public void w(biq $$0) {
      qx $$1 = $$0.f(new qx());
      $$1.r("Dimension");
      this.g($$1);
      this.bb = $$0.bb;
      this.ax = $$0.ax;
   }

   @Nullable
   public biq b(akr $$0) {
      if (this.dL() instanceof akr && !this.dG()) {
         this.dL().ad().a("changeDimension");
         this.af();
         this.dL().ad().a("reposition");
         ebj $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dL().ad().b("reloading");
            biq $$2 = this.ah().a((cpv)$$0);
            if ($$2 != null) {
               $$2.w(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dD());
               $$2.f($$1.b);
               $$0.d($$2);
               if ($$0.ac() == cpv.j) {
                  akr.a($$0);
               }
            }

            this.cs();
            this.dL().ad().c();
            ((akr)this.dL()).g();
            $$0.g();
            this.dL().ad().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void cs() {
      this.b(biq.c.e);
   }

   @Nullable
   protected ebj a(akr $$0) {
      boolean $$1 = this.dL().ac() == cpv.j && $$0.ac() == cpv.h;
      boolean $$2 = $$0.ac() == cpv.j;
      if (!$$1 && !$$2) {
         boolean $$5 = $$0.ac() == cpv.i;
         if (this.dL().ac() != cpv.i && !$$5) {
            return null;
         } else {
            dha $$6 = $$0.B_();
            double $$7 = dis.a(this.dL().C_(), $$0.C_());
            gw $$8 = $$6.b(this.dq() * $$7, this.ds(), this.dw() * $$7);
            return this.a($$0, $$8, $$5, $$6).map($$1x -> {
               dfj $$2x = this.dL().a_(this.ax);
               hc.a $$3;
               ehn $$5x;
               if ($$2x.b(dfz.H)) {
                  $$3 = $$2x.c(dfz.H);
                  l.a $$4 = l.a(this.ax, $$3, 21, hc.a.b, 21, $$1xx -> this.dL().a_($$1xx) == $$2x);
                  $$5x = this.a($$3, $$4);
               } else {
                  $$3 = hc.a.a;
                  $$5x = new ehn(0.5, 0.0, 0.0);
               }

               return ebk.a($$0, $$1x, $$3, $$5x, this, this.do(), this.dB(), this.dD());
            }).orElse(null);
         }
      } else {
         gw $$3;
         if ($$2) {
            $$3 = akr.a;
         } else {
            $$3 = $$0.a(dks.a.f, $$0.R());
         }

         return new ebj(new ehn((double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5), this.do(), this.dB(), this.dD());
      }
   }

   protected ehn a(hc.a $$0, l.a $$1) {
      return ebk.a($$1, $$0, this.dj(), this.a(this.ao()));
   }

   protected Optional<l.a> a(akr $$0, gw $$1, boolean $$2, dha $$3) {
      return $$0.o().a($$1, $$2, $$3);
   }

   public boolean ct() {
      return !this.bO() && !this.bP();
   }

   public float a(cpn $$0, cpb $$1, gw $$2, dfj $$3, eam $$4, float $$5) {
      return $$5;
   }

   public boolean a(cpn $$0, cpb $$1, gw $$2, dfj $$3, float $$4) {
      return true;
   }

   public int cu() {
      return 3;
   }

   public boolean p_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> biu.a(this.ah()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.q);
      $$0.a("Entity Name", () -> this.ac().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dq(), this.ds(), this.dw()));
      $$0.a("Entity's Block location", p.a(this.dL(), arx.a(this.dq()), arx.a(this.ds()), arx.a(this.dw())));
      ehn $$1 = this.do();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", () -> this.cQ().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.cZ()));
   }

   public boolean cv() {
      return this.bN() && !this.M_();
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
   public tl N_() {
      return eik.a(this.cg(), this.ac()).a($$0 -> $$0.a(this.cG()).a(this.cx()));
   }

   public void b(@Nullable tl $$0) {
      this.an.b(aU, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public tl ae() {
      return this.an.b(aU).orElse(null);
   }

   @Override
   public boolean ad() {
      return this.an.b(aU).isPresent();
   }

   public void n(boolean $$0) {
      this.an.b(aV, $$0);
   }

   public boolean cB() {
      return this.an.b(aV);
   }

   public final void n(double $$0, double $$1, double $$2) {
      if (this.dL() instanceof akr) {
         cpc $$3 = new cpc(gw.a($$0, $$1, $$2));
         ((akr)this.dL()).k().a(akw.g, $$3, 0, this.ai());
         this.dL().d($$3.e, $$3.f);
         this.b($$0, $$1, $$2);
      }
   }

   public boolean a(akr $$0, double $$1, double $$2, double $$3, Set<bju> $$4, float $$5, float $$6) {
      float $$7 = arx.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dL()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.A();
         this.n($$5);
      } else {
         this.af();
         biq $$8 = this.ah().a((cpv)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(biq.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (this.dL() instanceof akr) {
         this.b($$0, $$1, $$2, this.dB(), this.dD());
         this.A();
      }
   }

   private void A() {
      this.cS().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.r.iterator();

         while (var1.hasNext()) {
            biq $$1 = (biq)var1.next();
            $$0.a($$1, biq::d);
         }
      });
   }

   public void c(double $$0, double $$1, double $$2) {
      this.b(this.dq() + $$0, this.ds() + $$1, this.dw() + $$2);
   }

   public boolean cC() {
      return this.cB();
   }

   public void a(List<aei.b<?>> $$0) {
   }

   public void a(aef<?> $$0) {
      if (as.equals($$0)) {
         this.i_();
      }
   }

   @Deprecated
   protected void cD() {
      bjs $$0 = this.ao();
      bir $$1 = this.a($$0);
      this.bh = $$1;
      this.bi = this.a($$0, $$1);
   }

   public void i_() {
      bir $$0 = this.bh;
      bjs $$1 = this.ao();
      bir $$2 = this.a($$1);
      this.bh = $$2;
      this.bi = this.a($$1, $$2);
      this.aq();
      boolean $$3 = (double)$$2.a <= 4.0 && (double)$$2.b <= 4.0;
      if (!this.dL().B && !this.am && !this.af && $$3 && ($$2.a > $$0.a || $$2.b > $$0.b) && !(this instanceof cbu)) {
         ehn $$4 = this.dj().b(0.0, (double)$$0.b / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a - $$0.a) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b - $$0.b) + 1.0E-6;
         eig $$7 = eid.a(ehi.a($$4, $$5, $$6, $$5));
         this.dL().a(this, $$7, $$4, (double)$$2.a, (double)$$2.b, (double)$$2.a).ifPresent($$1x -> this.a($$1x.b(0.0, (double)(-$$2.b) / 2.0, 0.0)));
      }
   }

   public hc cE() {
      return hc.a((double)this.dB());
   }

   public hc cF() {
      return this.cE();
   }

   protected tq cG() {
      return new tq(tq.a.c, new tq.b(this.ah(), this.cw(), this.ac()));
   }

   public boolean a(aks $$0) {
      return true;
   }

   @Override
   public final ehi cH() {
      return this.aI;
   }

   public ehi g_() {
      return this.cH();
   }

   public final void a(ehi $$0) {
      this.aI = $$0;
   }

   protected float a(bjs $$0, bir $$1) {
      return $$1.b * 0.85F;
   }

   public float d(bjs $$0) {
      return this.a($$0, this.a($$0));
   }

   public final float cI() {
      return this.bi;
   }

   public ehn p(float $$0) {
      return this.cJ();
   }

   protected ehn cJ() {
      return new ehn(0.0, (double)this.cI(), (double)(this.dg() * 0.4F));
   }

   public bjy a_(int $$0) {
      return bjy.b;
   }

   @Override
   public void a(tl $$0) {
   }

   public cpv cK() {
      return this.dL();
   }

   @Nullable
   public MinecraftServer cL() {
      return this.dL().n();
   }

   public bgy a(cbu $$0, ehn $$1, bgx $$2) {
      return bgy.d;
   }

   public boolean cM() {
      return false;
   }

   public void a(bjg $$0, biq $$1) {
      if ($$1 instanceof bjg) {
         cnq.a((bjg)$$1, $$0);
      }

      cnq.b($$0, $$1);
   }

   public void c(aks $$0) {
   }

   public void d(aks $$0) {
   }

   public float a(czh $$0) {
      float $$1 = arx.g(this.dB());
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

   public float a(cxq $$0) {
      float $$1 = arx.g(this.dB());
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

   @Nullable
   public bjg cO() {
      return null;
   }

   public final boolean cP() {
      return this.cO() != null;
   }

   public final List<biq> cQ() {
      return this.r;
   }

   @Nullable
   public biq cR() {
      return this.r.isEmpty() ? null : (biq)this.r.get(0);
   }

   public boolean x(biq $$0) {
      return this.r.contains($$0);
   }

   public boolean a(Predicate<biq> $$0) {
      UnmodifiableIterator var2 = this.r.iterator();

      while (var2.hasNext()) {
         biq $$1 = (biq)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<biq> B() {
      return this.r.stream().flatMap(biq::cS);
   }

   @Override
   public Stream<biq> cS() {
      return Stream.concat(Stream.of(this), this.B());
   }

   @Override
   public Stream<biq> cT() {
      return Stream.concat(this.r.stream().flatMap(biq::cT), Stream.of(this));
   }

   public Iterable<biq> cU() {
      return () -> this.B().iterator();
   }

   public boolean cV() {
      return this.B().filter($$0 -> $$0 instanceof cbu).count() == 1L;
   }

   public biq cW() {
      biq $$0 = this;

      while ($$0.bO()) {
         $$0 = $$0.cZ();
      }

      return $$0;
   }

   public boolean y(biq $$0) {
      return this.cW() == $$0.cW();
   }

   public boolean z(biq $$0) {
      if (!$$0.bO()) {
         return false;
      } else {
         biq $$1 = $$0.cZ();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean cX() {
      return this.cO() instanceof cbu $$0 ? $$0.g() : this.cY();
   }

   public boolean cY() {
      return !this.dL().B;
   }

   protected static ehn a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -arx.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = arx.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new ehn((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public ehn b(bjg $$0) {
      return new ehn(this.dq(), this.cH().e, this.dw());
   }

   @Nullable
   public biq cZ() {
      return this.s;
   }

   @Nullable
   public biq da() {
      return this.s != null && this.s.cO() == this ? this.s : null;
   }

   public ear q_() {
      return ear.a;
   }

   public apf db() {
      return apf.g;
   }

   protected int dc() {
      return 1;
   }

   public dt dd() {
      return new dt(
         this, this.dj(), this.bG(), this.dL() instanceof akr ? (akr)this.dL() : null, this.D(), this.ac().getString(), this.N_(), this.dL().n(), this
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
      return this.dL().X().b(cpr.o);
   }

   @Override
   public boolean v_() {
      return true;
   }

   @Override
   public boolean T_() {
      return true;
   }

   public void a(ed.a $$0, ehn $$1) {
      ehn $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.s(arx.g((float)(-(arx.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.r(arx.g((float)(arx.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dB());
      this.O = this.dD();
      this.N = this.dB();
   }

   public boolean a(aqi<eal> $$0, double $$1) {
      if (this.de()) {
         return false;
      } else {
         ehi $$2 = this.cH().h(0.001);
         int $$3 = arx.a($$2.a);
         int $$4 = arx.c($$2.d);
         int $$5 = arx.a($$2.b);
         int $$6 = arx.c($$2.e);
         int $$7 = arx.a($$2.c);
         int $$8 = arx.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cz();
         boolean $$11 = false;
         ehn $$12 = ehn.b;
         int $$13 = 0;
         gw.a $$14 = new gw.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  eam $$18 = this.dL().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((cpb)this.dL(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           ehn $$20 = $$18.c(this.dL(), $$14);
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

            if (!(this instanceof cbu)) {
               $$12 = $$12.d();
            }

            ehn $$21 = this.do();
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

   public boolean de() {
      ehi $$0 = this.cH().g(1.0);
      int $$1 = arx.a($$0.a);
      int $$2 = arx.c($$0.d);
      int $$3 = arx.a($$0.c);
      int $$4 = arx.c($$0.f);
      return !this.dL().b($$1, $$3, $$2, $$4);
   }

   public double b(aqi<eal> $$0) {
      return this.aj.getDouble($$0);
   }

   public double df() {
      return (double)this.cI() < 0.4 ? 0.0 : 0.4;
   }

   public final float dg() {
      return this.bh.a;
   }

   public final float dh() {
      return this.bh.b;
   }

   public float di() {
      return this.dh() + 0.5F;
   }

   public vd<ww> V() {
      return new wx(this);
   }

   public bir a(bjs $$0) {
      return this.p.n();
   }

   public ehn dj() {
      return this.u;
   }

   public ehn dk() {
      return this.dj();
   }

   @Override
   public gw dl() {
      return this.v;
   }

   public dfj dm() {
      if (this.bn == null) {
         this.bn = this.dL().a_(this.dl());
      }

      return this.bn;
   }

   public cpc dn() {
      return this.aE;
   }

   public ehn do() {
      return this.aF;
   }

   public void f(ehn $$0) {
      this.aF = $$0;
   }

   public void g(ehn $$0) {
      this.f(this.do().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.f(new ehn($$0, $$1, $$2));
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
      return this.u.d + (double)this.bi;
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
         this.u = new ehn($$0, $$1, $$2);
         int $$3 = arx.a($$0);
         int $$4 = arx.a($$1);
         int $$5 = arx.a($$2);
         if ($$3 != this.v.u() || $$4 != this.v.v() || $$5 != this.v.w()) {
            this.v = new gw($$3, $$4, $$5);
            this.bn = null;
            if (hz.a($$3) != this.aE.e || hz.a($$5) != this.aE.f) {
               this.aE = new cpc(this.v);
            }
         }

         this.aZ.a();
      }
   }

   public void dx() {
   }

   public ehn q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bi * 0.7, 0.0);
   }

   public void a(wx $$0) {
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
   public cjf dy() {
      return null;
   }

   public void o(boolean $$0) {
      this.aA = $$0;
   }

   public boolean dz() {
      return !this.ah().a(apw.i);
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
   public biq.c dH() {
      return this.aK;
   }

   @Override
   public final void b(biq.c $$0) {
      if (this.aK == null) {
         this.aK = $$0;
      }

      if (this.aK.a()) {
         this.ab();
      }

      this.cQ().forEach(biq::ab);
      this.aZ.a($$0);
   }

   protected void dI() {
      this.aK = null;
   }

   @Override
   public void a(djb $$0) {
      this.aZ = $$0;
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

   public boolean a(cpv $$0, gw $$1) {
      return true;
   }

   public cpv dL() {
      return this.t;
   }

   protected void a(cpv $$0) {
      this.t = $$0;
   }

   public bhp dM() {
      return this.dL().ag();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = arx.d($$6, this.dq(), $$1);
      double $$8 = arx.d($$6, this.ds(), $$2);
      double $$9 = arx.d($$6, this.dw(), $$3);
      float $$10 = (float)arx.e($$6, (double)this.dB(), $$4);
      float $$11 = (float)arx.d($$6, (double)this.dD(), $$5);
      this.e($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   @FunctionalInterface
   public interface a {
      void accept(biq var1, double var2, double var4, double var6);
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
