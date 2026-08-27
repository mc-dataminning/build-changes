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

public abstract class bil implements bgx, div, ds {
   private static final Logger c = LogUtils.getLogger();
   public static final String w = "id";
   public static final String x = "Passengers";
   private static final AtomicInteger d = new AtomicInteger();
   private static final List<cja> e = Collections.emptyList();
   public static final int y = 60;
   public static final int z = 300;
   public static final int A = 1024;
   public static final float B = 0.2F;
   public static final double C = 0.500001;
   public static final double D = 0.999999;
   public static final float E = 0.11111111F;
   public static final int F = 140;
   public static final int G = 40;
   private static final ehd k = new ehd(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double l = 0.014;
   private static final double m = 0.007;
   private static final double n = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double o = 1.0;
   private final bip<?> p;
   private int q = d.incrementAndGet();
   public boolean I;
   private ImmutableList<bil> r = ImmutableList.of();
   protected int J;
   @Nullable
   private bil s;
   private cpq t;
   public double K;
   public double L;
   public double M;
   private ehi u;
   private gw v;
   private cox aE;
   private ehi aF = ehi.b;
   private float aG;
   private float aH;
   public float N;
   public float O;
   private ehd aI = k;
   private boolean aJ;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected ehi U = ehi.b;
   @Nullable
   private bil.c aK;
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
   protected final arx ag = arx.a();
   public int ah;
   private int aN = -this.db();
   protected boolean ai;
   protected Object2DoubleMap<aqd<eag>> aj = new Object2DoubleArrayMap(2);
   protected boolean ak;
   private final Set<aqd<eag>> aO = new HashSet<>();
   public int al;
   protected boolean am = true;
   protected final aef an;
   protected static final aec<Byte> ao = aef.a(bil.class, aee.a);
   protected static final int ap = 0;
   private static final int aP = 1;
   private static final int aQ = 3;
   private static final int aR = 4;
   private static final int aS = 5;
   protected static final int aq = 6;
   protected static final int ar = 7;
   private static final aec<Integer> aT = aef.a(bil.class, aee.b);
   private static final aec<Optional<ti>> aU = aef.a(bil.class, aee.g);
   private static final aec<Boolean> aV = aef.a(bil.class, aee.k);
   private static final aec<Boolean> aW = aef.a(bil.class, aee.k);
   private static final aec<Boolean> aX = aef.a(bil.class, aee.k);
   protected static final aec<bjn> as = aef.a(bil.class, aee.v);
   private static final aec<Integer> aY = aef.a(bil.class, aee.b);
   private diw aZ = diw.a;
   private final acw ba = new acw();
   public boolean at;
   public boolean au;
   private int bb;
   protected boolean av;
   protected int aw;
   protected gw ax;
   private boolean bc;
   protected UUID ay = ars.a(this.ag);
   protected String az = this.ay.toString();
   private boolean bd;
   private final Set<String> be = Sets.newHashSet();
   private final double[] bf = new double[]{0.0, 0.0, 0.0};
   private long bg;
   private bim bh;
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
   private dfe bn = null;

   public bil(bip<?> $$0, cpq $$1) {
      this.p = $$0;
      this.t = $$1;
      this.bh = $$0.n();
      this.u = ehi.b;
      this.v = gw.b;
      this.aE = cox.b;
      this.an = new aef(this);
      this.an.a(ao, (byte)0);
      this.an.a(aT, this.cg());
      this.an.a(aV, false);
      this.an.a(aU, Optional.empty());
      this.an.a(aW, false);
      this.an.a(aX, false);
      this.an.a(as, bjn.a);
      this.an.a(aY, 0);
      this.a_();
      this.e(0.0, 0.0, 0.0);
      this.bi = this.a(bjn.a, this.bh);
   }

   public boolean a(gw $$0, dfe $$1) {
      eib $$2 = $$1.b(this.dK(), $$0, ehn.a(this));
      eib $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return ehy.c($$3, ehy.a(this.cG()), ehm.i);
   }

   public int c_() {
      eij $$0 = this.cf();
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
      this.ba.e(new ehi($$0, $$1, $$2));
   }

   public acw af() {
      return this.ba;
   }

   public bip<?> ag() {
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
      this.a(bil.c.a);
      this.a(djo.p);
   }

   public final void ak() {
      this.a(bil.c.b);
   }

   protected abstract void a_();

   public aef al() {
      return this.an;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bil ? ((bil)$$0).q == this.q : false;
   }

   @Override
   public int hashCode() {
      return this.q;
   }

   public void a(bil.c $$0) {
      this.b($$0);
   }

   public void am() {
   }

   public void b(bjn $$0) {
      this.an.b(as, $$0);
   }

   public bjn an() {
      return this.an.b(as);
   }

   public boolean c(bjn $$0) {
      return this.an() == $$0;
   }

   public boolean a(bil $$0, double $$1) {
      return this.di().a((hq)$$0.di(), $$1);
   }

   public boolean a(bil $$0, double $$1, double $$2) {
      double $$3 = $$0.dp() - this.dp();
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.dv() - this.dv();
      return ars.e($$3, $$5) < ars.k($$1) && ars.k($$4) < ars.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.r($$0 % 360.0F);
      this.s($$1 % 360.0F);
   }

   public final void a(ehi $$0) {
      this.e($$0.a(), $$0.b(), $$0.c());
   }

   public void e(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.ao());
   }

   protected ehd ao() {
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
      this.s(ars.a(this.dC(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = ars.a(this.O, -90.0F, 90.0F);
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
            this.a(aoz.iT, 0.4F, 2.0F + this.ag.i() * 0.4F);
         }
      }
   }

   public void g(int $$0) {
      int $$1 = $$0 * 20;
      if (this instanceof bjb) {
         $$1 = cnw.a((bjb)this, $$1);
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

   private boolean b(ehd $$0) {
      return this.dK().a(this, $$0) && !this.dK().d($$0);
   }

   public void c(boolean $$0) {
      this.aJ = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, ehi $$1) {
      this.aJ = $$0;
      this.b($$0, $$1);
   }

   public boolean d(gw $$0) {
      return this.aD.isPresent() && this.aD.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable ehi $$1) {
      if ($$0) {
         ehd $$2 = this.cG();
         ehd $$3 = new ehd($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<gw> $$4 = this.t.g(this, $$3);
         if ($$4.isPresent() || this.bj) {
            this.aD = $$4;
         } else if ($$1 != null) {
            ehd $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
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

   public void a(bjh $$0, ehi $$1) {
      if (this.af) {
         this.e(this.dp() + $$1.c, this.dr() + $$1.d, this.dv() + $$1.e);
      } else {
         this.aC = this.bM();
         if ($$0 == bjh.c) {
            $$1 = this.c($$1);
            if ($$1.equals(ehi.b)) {
               return;
            }
         }

         this.dK().ad().a("move");
         if (this.U.g() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = ehi.b;
            this.f(ehi.b);
         }

         $$1 = this.a($$1, $$0);
         ehi $$2 = this.h($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ab != 0.0F && $$3 >= 1.0) {
               ehe $$4 = this.dK().a(new coz(this.di(), this.di().e($$2), coz.a.d, coz.b.d, this));
               if ($$4.c() != ehg.a.a) {
                  this.n();
               }
            }

            this.e(this.dp() + $$2.c, this.dr() + $$2.d, this.dv() + $$2.e);
         }

         this.dK().ad().c();
         this.dK().ad().a("rest");
         boolean $$5 = !ars.b($$1.c, $$2.c);
         boolean $$6 = !ars.b($$1.e, $$2.e);
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
         dfe $$8 = this.dK().a_($$7);
         this.a($$2.d, this.aA(), $$8, $$7);
         if (this.dF()) {
            this.dK().ad().c();
         } else {
            if (this.P) {
               ehi $$9 = this.dn();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            csq $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dK(), this);
            }

            if (this.aA()) {
               $$10.a(this.dK(), $$7, $$8, this);
            }

            bil.b $$11 = this.aU();
            if ($$11.a() && !this.bN()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.aa = this.aa + (float)($$2.f() * 0.6);
               gw $$15 = this.aH();
               dfe $$16 = this.dK().a_($$15);
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
                        this.a(djo.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aE();
               }
            }

            this.aB();
            float $$20 = this.aJ();
            this.f(this.dn().d((double)$$20, 1.0, (double)$$20));
            if (this.dK().c(this.cG().h(1.0E-6)).noneMatch($$0x -> $$0x.a(apo.aJ) || $$0x.a(csr.H))) {
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

   private boolean c(dfe $$0) {
      return $$0.a(apo.aO) || $$0.a(csr.qC);
   }

   private boolean a(gw $$0, dfe $$1, boolean $$2, boolean $$3, ehi $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aA() || $$5 || this.bW() && $$4.d == 0.0 || this.ce()) && !this.bY()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dK().a(djo.P, this.di(), djo.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean b(ehi $$0) {
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
      this.a(aoz.iY, 0.7F, 1.6F + (this.ag.i() - this.ag.i()) * 0.4F);
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
            this.a(djo.x);
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
            dfe $$2 = this.dK().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(apo.S)) && !$$2.a(apo.L) && !($$2.b() instanceof cvl) ? $$1.h(ars.a(this.u.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = ars.a(this.u.c);
         int $$4 = ars.a(this.u.d - (double)$$0);
         int $$5 = ars.a(this.u.e);
         return new gw($$3, $$4, $$5);
      }
   }

   protected float aI() {
      float $$0 = this.dK().a_(this.dk()).b().j();
      float $$1 = this.dK().a_(this.aG()).b().j();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aJ() {
      dfe $$0 = this.dK().a_(this.dk());
      float $$1 = $$0.b().i();
      if (!$$0.a(csr.G) && !$$0.a(csr.nd)) {
         return (double)$$1 == 1.0 ? this.dK().a_(this.aG()).b().i() : $$1;
      } else {
         return $$1;
      }
   }

   protected ehi a(ehi $$0, bjh $$1) {
      return $$0;
   }

   protected ehi c(ehi $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dK().V();
         if ($$1 != this.bg) {
            Arrays.fill(this.bf, 0.0);
            this.bg = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(hc.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? ehi.b : new ehi($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(hc.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? ehi.b : new ehi(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(hc.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? ehi.b : new ehi(0.0, 0.0, $$4);
         } else {
            return ehi.b;
         }
      }
   }

   private double a(hc.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = ars.a($$1 + this.bf[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bf[$$2];
      this.bf[$$2] = $$3;
      return $$1;
   }

   private ehi h(ehi $$0) {
      ehd $$1 = this.cG();
      List<eib> $$2 = this.dK().c(this, $$1.b($$0));
      ehi $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dK(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.aA() || $$5 && $$0.d < 0.0;
      if (this.dE() > 0.0F && $$7 && ($$4 || $$6)) {
         ehi $$8 = a(this, new ehi($$0.c, (double)this.dE(), $$0.e), $$1, this.dK(), $$2);
         ehi $$9 = a(this, new ehi(0.0, (double)this.dE(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dK(), $$2);
         if ($$9.d < (double)this.dE()) {
            ehi $$10 = a(this, new ehi($$0.c, 0.0, $$0.e), $$1.c($$9), this.dK(), $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new ehi(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.dK(), $$2));
         }
      }

      return $$3;
   }

   public static ehi a(@Nullable bil $$0, ehi $$1, ehd $$2, cpq $$3, List<eib> $$4) {
      Builder<eib> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      dgv $$6 = $$3.w_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.e($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static ehi a(ehi $$0, ehd $$1, List<eib> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = ehy.a(hc.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = ehy.a(hc.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = ehy.a(hc.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = ehy.a(hc.a.c, $$1, $$2, $$5);
         }

         return new ehi($$3, $$4, $$5);
      }
   }

   protected float aK() {
      return (float)((int)this.Z + 1);
   }

   protected aoy aL() {
      return aoz.jc;
   }

   protected aoy aM() {
      return aoz.jb;
   }

   protected aoy aN() {
      return aoz.jb;
   }

   protected void aO() {
      ehd $$0 = this.cG();
      gw $$1 = gw.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      gw $$2 = gw.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dK().a($$1, $$2)) {
         gw.a $$3 = new gw.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bv()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  dfe $$7 = this.dK().a_($$3);

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

   protected void a(dfe $$0) {
   }

   public void a(djo $$0, @Nullable bil $$1) {
      this.dK().a($$1, $$0, this.u);
   }

   public void a(djo $$0) {
      this.a($$0, this);
   }

   private void c(gw $$0, dfe $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.m();
      }
   }

   protected void aP() {
      bil $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      ehi $$2 = $$0.dn();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected gw e(gw $$0) {
      gw $$1 = $$0.c();
      dfe $$2 = this.dK().a_($$1);
      return !$$2.a(apo.bm) && !$$2.a(apo.bn) ? $$0 : $$1;
   }

   protected void a(dfe $$0, dfe $$1) {
      dad $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dfe $$0) {
      dad $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(gw $$0, dfe $$1) {
      dad $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dfe $$0) {
      return $$0.a(apo.bl) && this.ah >= this.bl + 20;
   }

   private void m() {
      this.bk = this.bk * (float)Math.pow(0.997, (double)(this.ah - this.bl));
      this.bk = Math.min(1.0F, this.bk + 0.07F);
      float $$0 = 0.5F + this.bk * this.ag.i() * 1.2F;
      float $$1 = 0.1F + this.bk * 1.2F;
      this.a(aoz.E, $$1, $$0);
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

   public void a(aoy $$0, float $$1, float $$2) {
      if (!this.aS()) {
         this.dK().a(null, this.dp(), this.dr(), this.dv(), $$0, this.da(), $$1, $$2);
      }
   }

   public void a(aoy $$0) {
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

   protected bil.b aU() {
      return bil.b.d;
   }

   public boolean aV() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dfe $$2, gw $$3) {
      if ($$1) {
         if (this.ab > 0.0F) {
            $$2.b().a(this.dK(), $$2, $$3, this, this.ab);
            this.dK().a(djo.A, this.u, djo.a.a(this, this.aD.<dfe>map($$0x -> this.dK().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ab -= (float)$$0;
      }
   }

   public boolean aW() {
      return this.ag().d();
   }

   public boolean a(float $$0, float $$1, bhj $$2) {
      if (this.p.a(apr.l)) {
         return false;
      } else {
         if (this.bO()) {
            for (bil $$3 : this.cP()) {
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
      gw $$0 = this.dk();
      return this.dK().q($$0) || this.dK().q(gw.a((double)$$0.u(), this.cG().e, (double)$$0.w()));
   }

   private boolean p() {
      return this.dK().a_(this.dk()).a(csr.nd);
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
         this.h(this.bX() && this.bc() && !this.bN() && this.dK().b_(this.v).a(apt.a));
      }
   }

   protected boolean be() {
      this.aj.clear();
      this.bf();
      double $$0 = this.dK().x_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(apt.b, $$0);
      return this.aX() || $$1;
   }

   void bf() {
      if (this.cY() instanceof cdi $$0 && !$$0.bc()) {
         this.ai = false;
         return;
      }

      if (this.a(apt.a, 0.014)) {
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
      this.ak = this.a(apt.a);
      this.aO.clear();
      double $$0 = this.dt() - 0.11111111F;
      if (this.cY() instanceof cdi $$2 && !$$2.bc() && $$2.cG().e >= $$0 && $$2.cG().b <= $$0) {
         return;
      }

      gw $$3 = gw.a(this.dp(), $$0, this.dv());
      eah $$4 = this.dK().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((cow)this.dK(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aO::add);
      }
   }

   protected void bg() {
      bil $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      ehi $$2 = $$0.dn();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aM(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      } else {
         this.a(this.aN(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      }

      float $$4 = (float)ars.a(this.dr());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bh.a * 20.0F; $$5++) {
         double $$6 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         double $$7 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         this.dK().a(ix.e, this.dp() + $$6, (double)($$4 + 1.0F), this.dv() + $$7, $$2.c, $$2.d - this.ag.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bh.a * 20.0F; $$8++) {
         double $$9 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         double $$10 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         this.dK().a(ix.ag, this.dp() + $$9, (double)($$4 + 1.0F), this.dv() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(djo.O);
   }

   @Deprecated
   protected dfe bh() {
      return this.dK().a_(this.aF());
   }

   public dfe bi() {
      return this.dK().a_(this.aH());
   }

   public boolean bj() {
      return this.bX() && !this.aX() && !this.G_() && !this.bW() && !this.bl() && this.bv();
   }

   protected void bk() {
      gw $$0 = this.aF();
      dfe $$1 = this.dK().a_($$0);
      if ($$1.l() != cyv.a) {
         ehi $$2 = this.dn();
         gw $$3 = this.dk();
         double $$4 = this.dp() + (this.ag.j() - 0.5) * (double)this.bh.a;
         double $$5 = this.dv() + (this.ag.j() - 0.5) * (double)this.bh.a;
         if ($$3.u() != $$0.u()) {
            $$4 = ars.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = ars.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dK().a(new ip(ix.c, $$1), $$4, this.dr() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(aqd<eag> $$0) {
      return this.aO.contains($$0);
   }

   public boolean bl() {
      return !this.am && this.aj.getDouble(apt.b) > 0.0;
   }

   public void a(float $$0, ehi $$1) {
      ehi $$2 = a($$1, $$0, this.dA());
      this.f(this.dn().e($$2));
   }

   private static ehi a(ehi $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return ehi.b;
      } else {
         ehi $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = ars.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = ars.b($$2 * (float) (Math.PI / 180.0));
         return new ehi($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bm() {
      return this.dK().f(this.do(), this.du()) ? this.dK().w(gw.a(this.dp(), this.dt(), this.dv())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.r($$3 % 360.0F);
      this.s(ars.a($$4, -90.0F, 90.0F) % 360.0F);
      this.N = this.dA();
      this.O = this.dC();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = ars.a($$0, -3.0E7, 3.0E7);
      double $$4 = ars.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.e($$3, $$1, $$4);
   }

   public void d(ehi $$0) {
      this.d($$0.c, $$0.d, $$0.e);
   }

   public void d(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dA(), this.dC());
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

   public float e(bil $$0) {
      float $$1 = (float)(this.dp() - $$0.dp());
      float $$2 = (float)(this.dr() - $$0.dr());
      float $$3 = (float)(this.dv() - $$0.dv());
      return ars.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dp() - $$0;
      double $$4 = this.dr() - $$1;
      double $$5 = this.dv() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double f(bil $$0) {
      return this.e($$0.di());
   }

   public double e(ehi $$0) {
      double $$1 = this.dp() - $$0.c;
      double $$2 = this.dr() - $$0.d;
      double $$3 = this.dv() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cbp $$0) {
   }

   public void g(bil $$0) {
      if (!this.y($$0)) {
         if (!$$0.af && !this.af) {
            double $$1 = $$0.dp() - this.dp();
            double $$2 = $$0.dv() - this.dv();
            double $$3 = ars.a($$1, $$2);
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

   public boolean a(bhj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bo();
         return false;
      }
   }

   public final ehi f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dC() : ars.i($$0, this.O, this.dC());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dA() : ars.i($$0, this.N, this.dA());
   }

   protected final ehi b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = ars.b($$3);
      float $$5 = ars.a($$3);
      float $$6 = ars.b($$2);
      float $$7 = ars.a($$2);
      return new ehi((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final ehi i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final ehi c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final ehi bp() {
      return new ehi(this.dp(), this.dt(), this.dv());
   }

   public final ehi j(float $$0) {
      double $$1 = ars.d((double)$$0, this.K, this.dp());
      double $$2 = ars.d((double)$$0, this.L, this.dr()) + (double)this.cH();
      double $$3 = ars.d((double)$$0, this.M, this.dv());
      return new ehi($$1, $$2, $$3);
   }

   public ehi k(float $$0) {
      return this.j($$0);
   }

   public final ehi l(float $$0) {
      double $$1 = ars.d((double)$$0, this.K, this.dp());
      double $$2 = ars.d((double)$$0, this.L, this.dr());
      double $$3 = ars.d((double)$$0, this.M, this.dv());
      return new ehi($$1, $$2, $$3);
   }

   public ehg a(double $$0, float $$1, boolean $$2) {
      ehi $$3 = this.j($$1);
      ehi $$4 = this.f($$1);
      ehi $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dK().a(new coz($$3, $$5, coz.a.b, $$2 ? coz.b.c : coz.b.a, this));
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

   public void a(bil $$0, int $$1, bhj $$2) {
      if ($$0 instanceof ako) {
         al.c.a((ako)$$0, this, $$2);
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

   public boolean d(qu $$0) {
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

   public boolean e(qu $$0) {
      return this.bN() ? false : this.d($$0);
   }

   public qu f(qu $$0) {
      try {
         if (this.s != null) {
            $$0.a("Pos", this.a(this.s.dp(), this.dr(), this.s.dv()));
         } else {
            $$0.a("Pos", this.a(this.dp(), this.dr(), this.dv()));
         }

         ehi $$1 = this.dn();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dA(), this.dC()));
         $$0.a("FallDistance", this.ab);
         $$0.a("Fire", (short)this.aN);
         $$0.a("Air", (short)this.ch());
         $$0.a("OnGround", this.aA());
         $$0.a("Invulnerable", this.bc);
         $$0.a("PortalCooldown", this.bb);
         $$0.a("UUID", this.cv());
         ti $$2 = this.ad();
         if ($$2 != null) {
            $$0.a("CustomName", ti.a.a($$2));
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
            ra $$4 = new ra();

            for (String $$5 : this.be) {
               $$4.add(rl.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bO()) {
            ra $$6 = new ra();

            for (bil $$7 : this.cP()) {
               qu $$8 = new qu();
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

   public void g(qu $$0) {
      try {
         ra $$1 = $$0.c("Pos", 6);
         ra $$2 = $$0.c("Motion", 6);
         ra $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(ars.a($$1.h(0), -3.0000512E7, 3.0000512E7), ars.a($$1.h(1), -2.0E7, 2.0E7), ars.a($$1.h(2), -3.0000512E7, 3.0000512E7));
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
                  this.b(ti.a.a($$8));
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
               ra $$10 = $$0.c("Tags", 8);
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
      bip<?> $$0 = this.ag();
      aeu $$1 = bip.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(qu var1);

   protected abstract void b(qu var1);

   protected ra a(double... $$0) {
      ra $$1 = new ra();

      for (double $$2 : $$0) {
         $$1.add(qv.a($$2));
      }

      return $$1;
   }

   protected ra a(float... $$0) {
      ra $$1 = new ra();

      for (float $$2 : $$0) {
         $$1.add(qx.a($$2));
      }

      return $$1;
   }

   @Nullable
   public byi a(cpp $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public byi a(cpp $$0, int $$1) {
      return this.a(new cja($$0), (float)$$1);
   }

   @Nullable
   public byi b(cja $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public byi a(cja $$0, float $$1) {
      if ($$0.b()) {
         return null;
      } else if (this.dK().B) {
         return null;
      } else {
         byi $$2 = new byi(this.dK(), this.dp(), this.dr() + (double)$$1, this.dv(), $$0);
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
         ehd $$1 = ehd.a(this.bp(), (double)$$0, 1.0E-6, (double)$$0);
         return gw.a($$1)
            .anyMatch(
               $$1x -> {
                  dfe $$2 = this.dK().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dK(), $$1x)
                     && ehy.c($$2.k(this.dK(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), ehy.a($$1), ehm.i);
               }
            );
      }
   }

   public bgt a(cbp $$0, bgs $$1) {
      return bgt.d;
   }

   public boolean h(bil $$0) {
      return $$0.bx() && !this.y($$0);
   }

   public boolean bx() {
      return false;
   }

   public void by() {
      this.f(ehi.b);
      this.l();
      if (this.bN()) {
         this.cY().i(this);
      }
   }

   public final void i(bil $$0) {
      if (this.x($$0)) {
         this.a($$0, bil::e);
      }
   }

   protected void a(bil $$0, bil.a $$1) {
      ehi $$2 = this.m($$0);
      $$1.accept($$0, $$2.c, $$2.d + (double)$$0.k(this), $$2.e);
   }

   public void j(bil $$0) {
   }

   public float k(bil $$0) {
      return this.l($$0);
   }

   protected float l(bil $$0) {
      return 0.0F;
   }

   public ehi m(bil $$0) {
      return new ehi(this.a($$0, this.bh, 1.0F).rotateY(-this.aG * (float) (Math.PI / 180.0))).e(this.di());
   }

   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   public boolean n(bil $$0) {
      return this.a($$0, false);
   }

   public boolean bz() {
      return this instanceof bjb;
   }

   public boolean a(bil $$0, boolean $$1) {
      if ($$0 == this.s) {
         return false;
      } else if (!$$0.bC()) {
         return false;
      } else {
         for (bil $$2 = $$0; $$2.s != null; $$2 = $$2.s) {
            if ($$2.s == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bN()) {
               this.aa();
            }

            this.b(bjn.a);
            this.s = $$0;
            this.s.p(this);
            $$0.w().filter($$0x -> $$0x instanceof ako).forEach($$0x -> al.R.a((ako)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bil $$0) {
      return !this.bR() && this.J <= 0;
   }

   public void bA() {
      for (int $$0 = this.r.size() - 1; $$0 >= 0; $$0--) {
         ((bil)this.r.get($$0)).aa();
      }
   }

   public void bB() {
      if (this.s != null) {
         bil $$0 = this.s;
         this.s = null;
         $$0.q(this);
      }
   }

   public void aa() {
      this.bB();
   }

   protected void p(bil $$0) {
      if ($$0.cY() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.r.isEmpty()) {
            this.r = ImmutableList.of($$0);
         } else {
            List<bil> $$1 = Lists.newArrayList(this.r);
            if (!this.dK().B && $$0 instanceof cbp && !(this.cQ() instanceof cbp)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.r = ImmutableList.copyOf($$1);
         }

         this.a(djo.s, $$0);
      }
   }

   protected void q(bil $$0) {
      if ($$0.cY() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.r.size() == 1 && this.r.get(0) == $$0) {
            this.r = ImmutableList.of();
         } else {
            this.r = this.r.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(djo.q, $$0);
      }
   }

   protected boolean r(bil $$0) {
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

   public ehi bE() {
      return this.b(this.dC(), this.dA());
   }

   public ehi a(civ $$0) {
      if (!(this instanceof cbp $$1)) {
         return ehi.b;
      } else {
         boolean $$2 = $$1.eS().a($$0) && !$$1.eR().a($$0);
         biv $$3 = $$2 ? $$1.fk().e() : $$1.fk();
         return this.b(0.0F, this.dA() + (float)($$3 == biv.b ? 80 : -80)).a(0.5);
      }
   }

   public ehh bF() {
      return new ehh(this.dC(), this.dA());
   }

   public ehi bG() {
      return ehi.a(this.bF());
   }

   public void f(gw $$0) {
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
      if (this.dK() instanceof akn) {
         int $$0 = this.av();
         akn $$1 = (akn)this.dK();
         if (this.av) {
            MinecraftServer $$2 = $$1.n();
            aet<cpq> $$3 = this.dK().ac() == cpq.i ? cpq.h : cpq.i;
            akn $$4 = $$2.a($$3);
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

   public void c(bhj $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            cwh.a(this);
      }
   }

   public void m(float $$0) {
   }

   public Iterable<cja> bJ() {
      return e;
   }

   public Iterable<cja> bK() {
      return e;
   }

   public Iterable<cja> bL() {
      return Iterables.concat(this.bJ(), this.bK());
   }

   public void a(biq $$0, cja $$1) {
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
      return this.ag().a(apr.m);
   }

   public boolean bQ() {
      return !this.ag().a(apr.n);
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
      return this.c(bjn.f);
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
      return this.c(bjn.d);
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

   public boolean d(cbp $$0) {
      if ($$0.G_()) {
         return false;
      } else {
         eij $$1 = this.cf();
         return $$1 != null && $$0 != null && $$0.cf() == $$1 && $$1.i() ? false : this.cd();
      }
   }

   public boolean ce() {
      return false;
   }

   public void a(BiConsumer<djl<?>, akn> $$0) {
   }

   @Nullable
   public eij cf() {
      return this.dK().I().g(this.cx());
   }

   public boolean s(bil $$0) {
      return this.a($$0.cf());
   }

   public boolean a(eij $$0) {
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

   public void a(akn $$0, bja $$1) {
      this.h(this.aN + 1);
      if (this.aN == 0) {
         this.g(8);
      }

      this.a(this.dL().b(), 5.0F);
   }

   public void k(boolean $$0) {
      ehi $$1 = this.dn();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void l(boolean $$0) {
      ehi $$1 = this.dn();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(akn $$0, bjb $$1) {
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
      gw $$3 = gw.a($$0, $$1, $$2);
      ehi $$4 = new ehi($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      gw.a $$5 = new gw.a();
      hc $$6 = hc.b;
      double $$7 = Double.MAX_VALUE;

      for (hc $$8 : new hc[]{hc.c, hc.d, hc.e, hc.f, hc.b}) {
         $$5.a($$3, $$8);
         if (!this.dK().a_($$5).r(this.dK(), $$5)) {
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
      ehi $$13 = this.dn().a(0.75);
      if ($$6.o() == hc.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == hc.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == hc.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dfe $$0, ehi $$1) {
      this.n();
      this.U = $$1;
   }

   private static ti c(ti $$0) {
      tv $$1 = $$0.d().b($$0.a().a(null));

      for (ti $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public ti ab() {
      ti $$0 = this.ad();
      return $$0 != null ? c($$0) : this.cn();
   }

   protected ti cn() {
      return this.p.h();
   }

   public boolean t(bil $$0) {
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

   public boolean u(bil $$0) {
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

   public boolean b(bhj $$0) {
      return this.dF() || this.bc && !$$0.a(apq.d) && !$$0.g() || $$0.a(apq.i) && this.aW() || $$0.a(apq.m) && this.ag().a(apr.l);
   }

   public boolean cq() {
      return this.bc;
   }

   public void m(boolean $$0) {
      this.bc = $$0;
   }

   public void v(bil $$0) {
      this.b($$0.dp(), $$0.dr(), $$0.dv(), $$0.dA(), $$0.dC());
   }

   public void w(bil $$0) {
      qu $$1 = $$0.f(new qu());
      $$1.r("Dimension");
      this.g($$1);
      this.bb = $$0.bb;
      this.ax = $$0.ax;
   }

   @Nullable
   public bil b(akn $$0) {
      if (this.dK() instanceof akn && !this.dF()) {
         this.dK().ad().a("changeDimension");
         this.ae();
         this.dK().ad().a("reposition");
         ebe $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dK().ad().b("reloading");
            bil $$2 = this.ag().a((cpq)$$0);
            if ($$2 != null) {
               $$2.w(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dC());
               $$2.f($$1.b);
               $$0.d($$2);
               if ($$0.ac() == cpq.j) {
                  akn.a($$0);
               }
            }

            this.cr();
            this.dK().ad().c();
            ((akn)this.dK()).g();
            $$0.g();
            this.dK().ad().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void cr() {
      this.b(bil.c.e);
   }

   @Nullable
   protected ebe a(akn $$0) {
      boolean $$1 = this.dK().ac() == cpq.j && $$0.ac() == cpq.h;
      boolean $$2 = $$0.ac() == cpq.j;
      if (!$$1 && !$$2) {
         boolean $$5 = $$0.ac() == cpq.i;
         if (this.dK().ac() != cpq.i && !$$5) {
            return null;
         } else {
            dgv $$6 = $$0.w_();
            double $$7 = din.a(this.dK().x_(), $$0.x_());
            gw $$8 = $$6.b(this.dp() * $$7, this.dr(), this.dv() * $$7);
            return this.a($$0, $$8, $$5, $$6).map($$1x -> {
               dfe $$2x = this.dK().a_(this.ax);
               hc.a $$3;
               ehi $$5x;
               if ($$2x.b(dfu.H)) {
                  $$3 = $$2x.c(dfu.H);
                  l.a $$4 = l.a(this.ax, $$3, 21, hc.a.b, 21, $$1xx -> this.dK().a_($$1xx) == $$2x);
                  $$5x = this.a($$3, $$4);
               } else {
                  $$3 = hc.a.a;
                  $$5x = new ehi(0.5, 0.0, 0.0);
               }

               return ebf.a($$0, $$1x, $$3, $$5x, this, this.dn(), this.dA(), this.dC());
            }).orElse(null);
         }
      } else {
         gw $$3;
         if ($$2) {
            $$3 = akn.a;
         } else {
            $$3 = $$0.a(dkn.a.f, $$0.R());
         }

         return new ebe(new ehi((double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5), this.dn(), this.dA(), this.dC());
      }
   }

   protected ehi a(hc.a $$0, l.a $$1) {
      return ebf.a($$1, $$0, this.di(), this.a(this.an()));
   }

   protected Optional<l.a> a(akn $$0, gw $$1, boolean $$2, dgv $$3) {
      return $$0.o().a($$1, $$2, $$3);
   }

   public boolean cs() {
      return !this.bN() && !this.bO();
   }

   public float a(cpi $$0, cow $$1, gw $$2, dfe $$3, eah $$4, float $$5) {
      return $$5;
   }

   public boolean a(cpi $$0, cow $$1, gw $$2, dfe $$3, float $$4) {
      return true;
   }

   public int ct() {
      return 3;
   }

   public boolean d_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bip.a(this.ag()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.q);
      $$0.a("Entity Name", () -> this.ab().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dp(), this.dr(), this.dv()));
      $$0.a("Entity's Block location", p.a(this.dK(), ars.a(this.dp()), ars.a(this.dr()), ars.a(this.dv())));
      ehi $$1 = this.dn();
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
   public ti H_() {
      return eif.a(this.cf(), this.ab()).a($$0 -> $$0.a(this.cF()).a(this.cw()));
   }

   public void b(@Nullable ti $$0) {
      this.an.b(aU, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public ti ad() {
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
      if (this.dK() instanceof akn) {
         cox $$3 = new cox(gw.a($$0, $$1, $$2));
         ((akn)this.dK()).k().a(aks.g, $$3, 0, this.ah());
         this.dK().d($$3.e, $$3.f);
         this.b($$0, $$1, $$2);
      }
   }

   public boolean a(akn $$0, double $$1, double $$2, double $$3, Set<bjp> $$4, float $$5, float $$6) {
      float $$7 = ars.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dK()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.s();
         this.n($$5);
      } else {
         this.ae();
         bil $$8 = this.ag().a((cpq)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(bil.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (this.dK() instanceof akn) {
         this.b($$0, $$1, $$2, this.dA(), this.dC());
         this.s();
      }
   }

   private void s() {
      this.cR().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.r.iterator();

         while (var1.hasNext()) {
            bil $$1 = (bil)var1.next();
            $$0.a($$1, bil::d);
         }
      });
   }

   public void c(double $$0, double $$1, double $$2) {
      this.b(this.dp() + $$0, this.dr() + $$1, this.dv() + $$2);
   }

   public boolean cB() {
      return this.cA();
   }

   public void a(List<aef.b<?>> $$0) {
   }

   public void a(aec<?> $$0) {
      if (as.equals($$0)) {
         this.e_();
      }
   }

   @Deprecated
   protected void cC() {
      bjn $$0 = this.an();
      bim $$1 = this.a($$0);
      this.bh = $$1;
      this.bi = this.a($$0, $$1);
   }

   public void e_() {
      bim $$0 = this.bh;
      bjn $$1 = this.an();
      bim $$2 = this.a($$1);
      this.bh = $$2;
      this.bi = this.a($$1, $$2);
      this.ap();
      boolean $$3 = (double)$$2.a <= 4.0 && (double)$$2.b <= 4.0;
      if (!this.dK().B && !this.am && !this.af && $$3 && ($$2.a > $$0.a || $$2.b > $$0.b) && !(this instanceof cbp)) {
         ehi $$4 = this.di().b(0.0, (double)$$0.b / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a - $$0.a) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b - $$0.b) + 1.0E-6;
         eib $$7 = ehy.a(ehd.a($$4, $$5, $$6, $$5));
         this.dK().a(this, $$7, $$4, (double)$$2.a, (double)$$2.b, (double)$$2.a).ifPresent($$1x -> this.a($$1x.b(0.0, (double)(-$$2.b) / 2.0, 0.0)));
      }
   }

   public hc cD() {
      return hc.a((double)this.dA());
   }

   public hc cE() {
      return this.cD();
   }

   protected tn cF() {
      return new tn(tn.a.c, new tn.b(this.ag(), this.cv(), this.ab()));
   }

   public boolean a(ako $$0) {
      return true;
   }

   @Override
   public final ehd cG() {
      return this.aI;
   }

   public ehd k_() {
      return this.cG();
   }

   public final void a(ehd $$0) {
      this.aI = $$0;
   }

   protected float a(bjn $$0, bim $$1) {
      return $$1.b * 0.85F;
   }

   public float d(bjn $$0) {
      return this.a($$0, this.a($$0));
   }

   public final float cH() {
      return this.bi;
   }

   public ehi p(float $$0) {
      return this.cI();
   }

   protected ehi cI() {
      return new ehi(0.0, (double)this.cH(), (double)(this.df() * 0.4F));
   }

   public bjt a_(int $$0) {
      return bjt.b;
   }

   @Override
   public void a(ti $$0) {
   }

   public cpq cJ() {
      return this.dK();
   }

   @Nullable
   public MinecraftServer cK() {
      return this.dK().n();
   }

   public bgt a(cbp $$0, ehi $$1, bgs $$2) {
      return bgt.d;
   }

   public boolean cL() {
      return false;
   }

   public void a(bjb $$0, bil $$1) {
      if ($$1 instanceof bjb) {
         cnl.a((bjb)$$1, $$0);
      }

      cnl.b($$0, $$1);
   }

   public void c(ako $$0) {
   }

   public void d(ako $$0) {
   }

   public float a(czc $$0) {
      float $$1 = ars.g(this.dA());
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

   public float a(cxl $$0) {
      float $$1 = ars.g(this.dA());
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
   public bjb cN() {
      return null;
   }

   public final boolean cO() {
      return this.cN() != null;
   }

   public final List<bil> cP() {
      return this.r;
   }

   @Nullable
   public bil cQ() {
      return this.r.isEmpty() ? null : (bil)this.r.get(0);
   }

   public boolean x(bil $$0) {
      return this.r.contains($$0);
   }

   public boolean a(Predicate<bil> $$0) {
      UnmodifiableIterator var2 = this.r.iterator();

      while (var2.hasNext()) {
         bil $$1 = (bil)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bil> w() {
      return this.r.stream().flatMap(bil::cR);
   }

   @Override
   public Stream<bil> cR() {
      return Stream.concat(Stream.of(this), this.w());
   }

   @Override
   public Stream<bil> cS() {
      return Stream.concat(this.r.stream().flatMap(bil::cS), Stream.of(this));
   }

   public Iterable<bil> cT() {
      return () -> this.w().iterator();
   }

   public boolean cU() {
      return this.w().filter($$0 -> $$0 instanceof cbp).count() == 1L;
   }

   public bil cV() {
      bil $$0 = this;

      while ($$0.bN()) {
         $$0 = $$0.cY();
      }

      return $$0;
   }

   public boolean y(bil $$0) {
      return this.cV() == $$0.cV();
   }

   public boolean z(bil $$0) {
      if (!$$0.bN()) {
         return false;
      } else {
         bil $$1 = $$0.cY();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean cW() {
      return this.cN() instanceof cbp $$0 ? $$0.g() : this.cX();
   }

   public boolean cX() {
      return !this.dK().B;
   }

   protected static ehi a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -ars.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = ars.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new ehi((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public ehi b(bjb $$0) {
      return new ehi(this.dp(), this.cG().e, this.dv());
   }

   @Nullable
   public bil cY() {
      return this.s;
   }

   @Nullable
   public bil cZ() {
      return this.s != null && this.s.cN() == this ? this.s : null;
   }

   public eam l_() {
      return eam.a;
   }

   public apa da() {
      return apa.g;
   }

   protected int db() {
      return 1;
   }

   public dt dc() {
      return new dt(
         this, this.di(), this.bF(), this.dK() instanceof akn ? (akn)this.dK() : null, this.C(), this.ab().getString(), this.H_(), this.dK().n(), this
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
      return this.dK().X().b(cpm.o);
   }

   @Override
   public boolean q_() {
      return true;
   }

   @Override
   public boolean N_() {
      return true;
   }

   public void a(ed.a $$0, ehi $$1) {
      ehi $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.s(ars.g((float)(-(ars.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.r(ars.g((float)(ars.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dA());
      this.O = this.dC();
      this.N = this.dA();
   }

   public boolean a(aqd<eag> $$0, double $$1) {
      if (this.dd()) {
         return false;
      } else {
         ehd $$2 = this.cG().h(0.001);
         int $$3 = ars.a($$2.a);
         int $$4 = ars.c($$2.d);
         int $$5 = ars.a($$2.b);
         int $$6 = ars.c($$2.e);
         int $$7 = ars.a($$2.c);
         int $$8 = ars.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cy();
         boolean $$11 = false;
         ehi $$12 = ehi.b;
         int $$13 = 0;
         gw.a $$14 = new gw.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  eah $$18 = this.dK().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((cow)this.dK(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           ehi $$20 = $$18.c(this.dK(), $$14);
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

            if (!(this instanceof cbp)) {
               $$12 = $$12.d();
            }

            ehi $$21 = this.dn();
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
      ehd $$0 = this.cG().g(1.0);
      int $$1 = ars.a($$0.a);
      int $$2 = ars.c($$0.d);
      int $$3 = ars.a($$0.c);
      int $$4 = ars.c($$0.f);
      return !this.dK().b($$1, $$3, $$2, $$4);
   }

   public double b(aqd<eag> $$0) {
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

   public va<ws> U() {
      return new wt(this);
   }

   public bim a(bjn $$0) {
      return this.p.n();
   }

   public ehi di() {
      return this.u;
   }

   public ehi dj() {
      return this.di();
   }

   @Override
   public gw dk() {
      return this.v;
   }

   public dfe dl() {
      if (this.bn == null) {
         this.bn = this.dK().a_(this.dk());
      }

      return this.bn;
   }

   public cox dm() {
      return this.aE;
   }

   public ehi dn() {
      return this.aF;
   }

   public void f(ehi $$0) {
      this.aF = $$0;
   }

   public void g(ehi $$0) {
      this.f(this.dn().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.f(new ehi($$0, $$1, $$2));
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
         this.u = new ehi($$0, $$1, $$2);
         int $$3 = ars.a($$0);
         int $$4 = ars.a($$1);
         int $$5 = ars.a($$2);
         if ($$3 != this.v.u() || $$4 != this.v.v() || $$5 != this.v.w()) {
            this.v = new gw($$3, $$4, $$5);
            this.bn = null;
            if (hz.a($$3) != this.aE.e || hz.a($$5) != this.aE.f) {
               this.aE = new cox(this.v);
            }
         }

         this.aZ.a();
      }
   }

   public void dw() {
   }

   public ehi q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bi * 0.7, 0.0);
   }

   public void a(wt $$0) {
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
   public cja dx() {
      return null;
   }

   public void o(boolean $$0) {
      this.aA = $$0;
   }

   public boolean dy() {
      return !this.ag().a(apr.i);
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
   public bil.c dG() {
      return this.aK;
   }

   @Override
   public final void b(bil.c $$0) {
      if (this.aK == null) {
         this.aK = $$0;
      }

      if (this.aK.a()) {
         this.aa();
      }

      this.cP().forEach(bil::aa);
      this.aZ.a($$0);
   }

   protected void dH() {
      this.aK = null;
   }

   @Override
   public void a(diw $$0) {
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

   public boolean a(cpq $$0, gw $$1) {
      return true;
   }

   public cpq dK() {
      return this.t;
   }

   protected void a(cpq $$0) {
      this.t = $$0;
   }

   public bhk dL() {
      return this.dK().ag();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = ars.d($$6, this.dp(), $$1);
      double $$8 = ars.d($$6, this.dr(), $$2);
      double $$9 = ars.d($$6, this.dv(), $$3);
      float $$10 = (float)ars.e($$6, (double)this.dA(), $$4);
      float $$11 = (float)ars.d($$6, (double)this.dC(), $$5);
      this.e($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   @FunctionalInterface
   public interface a {
      void accept(bil var1, double var2, double var4, double var6);
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
