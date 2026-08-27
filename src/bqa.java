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

public abstract class bqa implements ajd, bok, dti, du, etm {
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
   public static final int G = 3;
   private static final ese e = new ese(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double k = 0.014;
   private static final double l = 0.007;
   private static final double m = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double n = 1.0;
   private final bqg<?> o;
   private int p = d.incrementAndGet();
   public boolean I;
   private ImmutableList<bqa> q = ImmutableList.of();
   protected int J;
   @Nullable
   private bqa r;
   private czg s;
   public double K;
   public double L;
   public double M;
   private esj t;
   private id u;
   private cyn v;
   private esj aE = esj.b;
   private float aF;
   private float aG;
   public float N;
   public float O;
   private ese aH = e;
   private boolean aI;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected esj U = esj.b;
   @Nullable
   private bqa.c aJ;
   public static final float V = 0.6F;
   public static final float W = 1.8F;
   public float X;
   public float Y;
   public float Z;
   public float aa;
   public float ab;
   private float aK = 1.0F;
   public double ac;
   public double ad;
   public double ae;
   public boolean af;
   protected final axt ag = axt.a();
   public int ah;
   private int aL = -this.dc();
   protected boolean ai;
   protected Object2DoubleMap<avt<ela>> aj = new Object2DoubleArrayMap(2);
   protected boolean ak;
   private final Set<avt<ela>> aM = new HashSet<>();
   public int al;
   protected boolean am = true;
   protected final aje an;
   protected static final aja<Byte> ao = aje.a(bqa.class, ajc.a);
   protected static final int ap = 0;
   private static final int aN = 1;
   private static final int aO = 3;
   private static final int aP = 4;
   private static final int aQ = 5;
   protected static final int aq = 6;
   protected static final int ar = 7;
   private static final aja<Integer> aR = aje.a(bqa.class, ajc.b);
   private static final aja<Optional<wi>> aS = aje.a(bqa.class, ajc.g);
   private static final aja<Boolean> aT = aje.a(bqa.class, ajc.k);
   private static final aja<Boolean> aU = aje.a(bqa.class, ajc.k);
   private static final aja<Boolean> aV = aje.a(bqa.class, ajc.k);
   protected static final aja<bre> as = aje.a(bqa.class, ajc.v);
   private static final aja<Integer> aW = aje.a(bqa.class, ajc.b);
   private dtj aX = dtj.a;
   private final ahk aY = new ahk();
   public boolean at;
   public boolean au;
   private int aZ;
   protected boolean av;
   protected int aw;
   protected id ax;
   private boolean ba;
   protected UUID ay = axm.a(this.ag);
   protected String az = this.ay.toString();
   private boolean bb;
   private final Set<String> bc = Sets.newHashSet();
   private final double[] bd = new double[]{0.0, 0.0, 0.0};
   private long be;
   private bqd bf;
   private float bg;
   public boolean aA;
   public boolean aB;
   public boolean aC;
   public Optional<id> aD = Optional.empty();
   private boolean bh = false;
   private float bi;
   private int bj;
   private boolean bk;
   @Nullable
   private dpi bl = null;

   public bqa(bqg<?> $$0, czg $$1) {
      this.o = $$0;
      this.s = $$1;
      this.bf = $$0.n();
      this.t = esj.b;
      this.u = id.c;
      this.v = cyn.b;
      aje.a $$2 = new aje.a(this);
      $$2.a(ao, (byte)0);
      $$2.a(aR, this.ch());
      $$2.a(aT, false);
      $$2.a(aS, Optional.empty());
      $$2.a(aU, false);
      $$2.a(aV, false);
      $$2.a(as, bre.a);
      $$2.a(aW, 0);
      this.a($$2);
      this.an = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.bg = this.bf.c();
   }

   public boolean a(id $$0, dpi $$1) {
      etc $$2 = $$1.b(this.dM(), $$0, eso.a(this));
      etc $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return esz.c($$3, esz.a(this.cH()), esn.i);
   }

   public int i_() {
      etp $$0 = this.cg();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean N_() {
      return false;
   }

   public final void ag() {
      if (this.bP()) {
         this.bE();
      }

      if (this.bO()) {
         this.ac();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.aY.e(new esj($$0, $$1, $$2));
   }

   public ahk ah() {
      return this.aY;
   }

   public bqg<?> ai() {
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
      return this.bc;
   }

   public boolean a(String $$0) {
      return this.bc.size() >= 1024 ? false : this.bc.add($$0);
   }

   public boolean b(String $$0) {
      return this.bc.remove($$0);
   }

   public void al() {
      this.a(bqa.c.a);
      this.a(dub.p);
   }

   public final void am() {
      this.a(bqa.c.b);
   }

   protected abstract void a(aje.a var1);

   public aje an() {
      return this.an;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bqa ? ((bqa)$$0).p == this.p : false;
   }

   @Override
   public int hashCode() {
      return this.p;
   }

   public void a(bqa.c $$0) {
      this.b($$0);
   }

   public void ao() {
   }

   public void b(bre $$0) {
      this.an.a(as, $$0);
   }

   public bre ap() {
      return this.an.a(as);
   }

   public boolean c(bre $$0) {
      return this.ap() == $$0;
   }

   public boolean a(bqa $$0, double $$1) {
      return this.dk().a((ix)$$0.dk(), $$1);
   }

   public boolean a(bqa $$0, double $$1, double $$2) {
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.dt() - this.dt();
      double $$5 = $$0.dx() - this.dx();
      return axm.e($$3, $$5) < axm.k($$1) && axm.k($$4) < axm.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.r($$0 % 360.0F);
      this.s($$1 % 360.0F);
   }

   public final void b(esj $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.aq());
   }

   protected ese aq() {
      return this.bf.a(this.t);
   }

   protected void ar() {
      this.a_(this.t.c, this.t.d, this.t.e);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.s(this.dE() + $$2);
      this.r(this.dC() + $$3);
      this.s(axm.a(this.dE(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = axm.a(this.O, -90.0F, 90.0F);
      if (this.r != null) {
         this.r.k(this);
      }
   }

   public void l() {
      this.as();
   }

   public void as() {
      this.dM().af().a("entityBaseTick");
      this.bl = null;
      if (this.bO() && this.cZ().dH()) {
         this.ac();
      }

      if (this.J > 0) {
         this.J--;
      }

      this.X = this.Y;
      this.O = this.dE();
      this.N = this.dC();
      this.bL();
      if (this.bo()) {
         this.bp();
      }

      this.aB = this.aA;
      this.aA = false;
      this.bj();
      this.x();
      this.bi();
      if (this.dM().B) {
         this.aA();
      } else if (this.aL > 0) {
         if (this.bb()) {
            this.i(this.aL - 4);
            if (this.aL < 0) {
               this.aA();
            }
         } else {
            if (this.aL % 20 == 0 && !this.bq()) {
               this.a(this.dN().c(), 1.0F);
            }

            this.i(this.aL - 1);
         }

         if (this.cj() > 0) {
            this.l(0);
            this.dM().a(null, 1009, this.u, 1);
         }
      }

      if (this.bq()) {
         this.ay();
         this.ab *= 0.5F;
      }

      this.at();
      if (!this.dM().B) {
         this.a_(this.aL > 0);
      }

      this.am = false;
      this.dM().af().c();
   }

   public void a_(boolean $$0) {
      this.b(0, $$0 || this.bk);
   }

   public void at() {
      if (this.dt() < (double)(this.dM().I_() - 64)) {
         this.aB();
      }
   }

   public void au() {
      this.aZ = this.bM();
   }

   public void f(int $$0) {
      this.aZ = $$0;
   }

   public int av() {
      return this.aZ;
   }

   public boolean aw() {
      return this.aZ > 0;
   }

   protected void L() {
      if (this.aw()) {
         this.aZ--;
      }
   }

   public int ax() {
      return 0;
   }

   public void ay() {
      if (!this.bb()) {
         this.g(15);
         if (this.a(this.dN().d(), 4.0F)) {
            this.a(auo.jV, 0.4F, 2.0F + this.ag.i() * 0.4F);
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

   public int az() {
      return this.aL;
   }

   public void aA() {
      this.i(0);
   }

   protected void aB() {
      this.am();
   }

   public boolean g(double $$0, double $$1, double $$2) {
      return this.b(this.cH().d($$0, $$1, $$2));
   }

   private boolean b(ese $$0) {
      return this.dM().a(this, $$0) && !this.dM().d($$0);
   }

   public void c(boolean $$0) {
      this.aI = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, esj $$1) {
      this.aI = $$0;
      this.b($$0, $$1);
   }

   public boolean d(id $$0) {
      return this.aD.isPresent() && this.aD.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable esj $$1) {
      if ($$0) {
         ese $$2 = this.cH();
         ese $$3 = new ese($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<id> $$4 = this.s.g(this, $$3);
         if ($$4.isPresent() || this.bh) {
            this.aD = $$4;
         } else if ($$1 != null) {
            ese $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
            $$4 = this.s.g(this, $$5);
            this.aD = $$4;
         }

         this.bh = $$4.isEmpty();
      } else {
         this.bh = false;
         if (this.aD.isPresent()) {
            this.aD = Optional.empty();
         }
      }
   }

   public boolean aC() {
      return this.aI;
   }

   public void a(bqy $$0, esj $$1) {
      if (this.af) {
         this.a_(this.dr() + $$1.c, this.dt() + $$1.d, this.dx() + $$1.e);
      } else {
         this.aC = this.bN();
         if ($$0 == bqy.c) {
            $$1 = this.d($$1);
            if ($$1.equals(esj.b)) {
               return;
            }
         }

         this.dM().af().a("move");
         if (this.U.g() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = esj.b;
            this.g(esj.b);
         }

         $$1 = this.a($$1, $$0);
         esj $$2 = this.a($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ab != 0.0F && $$3 >= 1.0) {
               esf $$4 = this.dM().a(new cyp(this.dk(), this.dk().e($$2), cyp.a.d, cyp.b.d, this));
               if ($$4.c() != esh.a.a) {
                  this.n();
               }
            }

            this.a_(this.dr() + $$2.c, this.dt() + $$2.d, this.dx() + $$2.e);
         }

         this.dM().af().c();
         this.dM().af().a("rest");
         boolean $$5 = !axm.b($$1.c, $$2.c);
         boolean $$6 = !axm.b($$1.e, $$2.e);
         this.P = $$5 || $$6;
         this.Q = $$1.d != $$2.d;
         this.R = this.Q && $$1.d < 0.0;
         if (this.P) {
            this.S = this.c($$2);
         } else {
            this.S = false;
         }

         this.a(this.R, $$2);
         id $$7 = this.aH();
         dpi $$8 = this.dM().a_($$7);
         this.a($$2.d, this.aC(), $$8, $$7);
         if (this.dH()) {
            this.dM().af().c();
         } else {
            if (this.P) {
               esj $$9 = this.dp();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            dch $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dM(), this);
            }

            if (this.aC()) {
               $$10.a(this.dM(), $$7, $$8, this);
            }

            bqa.b $$11 = this.aZ();
            if ($$11.a() && !this.bO()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.aa = this.aa + (float)($$2.f() * 0.6);
               id $$15 = this.aJ();
               dpi $$16 = this.dM().a_($$15);
               boolean $$17 = this.c($$16);
               if (!$$17) {
                  $$13 = 0.0;
               }

               this.Y = this.Y + (float)$$2.h() * 0.6F;
               this.Z = this.Z + (float)Math.sqrt($$12 * $$12 + $$13 * $$13 + $$14 * $$14) * 0.6F;
               if (this.Z > this.aK && !$$16.i()) {
                  boolean $$18 = $$15.equals($$7);
                  boolean $$19 = this.a($$7, $$8, $$11.c(), $$18, $$1);
                  if (!$$18) {
                     $$19 |= this.a($$15, $$16, false, $$11.b(), $$1);
                  }

                  if ($$19) {
                     this.aK = this.aM();
                  } else if (this.bc()) {
                     this.aK = this.aM();
                     if ($$11.c()) {
                        this.aR();
                     }

                     if ($$11.b()) {
                        this.a(dub.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aG();
               }
            }

            this.aD();
            float $$20 = this.aL();
            this.g(this.dp().d((double)$$20, 1.0, (double)$$20));
            if (this.dM().c(this.cH().h(1.0E-6)).noneMatch($$0x -> $$0x.a(ave.aK) || $$0x.a(dcj.H))) {
               if (this.aL <= 0) {
                  this.i(-this.dc());
               }

               if (this.aC && (this.aA || this.be())) {
                  this.aE();
               }
            }

            if (this.bN() && (this.aA || this.be())) {
               this.i(-this.dc());
            }

            this.dM().af().c();
         }
      }
   }

   private boolean c(dpi $$0) {
      return $$0.a(ave.aP) || $$0.a(dcj.qP);
   }

   private boolean a(id $$0, dpi $$1, boolean $$2, boolean $$3, esj $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aC() || $$5 || this.bX() && $$4.d == 0.0 || this.cf()) && !this.bZ()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dM().a(dub.P, this.dk(), dub.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(esj $$0) {
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
      this.a(auo.ka, 0.7F, 1.6F + (this.ag.i() - this.ag.i()) * 0.4F);
   }

   public void aF() {
      if (!this.dM().B && this.aC) {
         this.aE();
      }

      this.aA();
   }

   protected void aG() {
      if (this.aT()) {
         this.aS();
         if (this.aZ().b()) {
            this.a(dub.x);
         }
      }
   }

   @Deprecated
   public id aH() {
      return this.d(0.2F);
   }

   protected id aI() {
      return this.d(0.500001F);
   }

   public id aJ() {
      return this.d(1.0E-5F);
   }

   protected id d(float $$0) {
      if (this.aD.isPresent()) {
         id $$1 = this.aD.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dpi $$2 = this.dM().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(ave.S)) && !$$2.a(ave.L) && !($$2.b() instanceof dfg) ? $$1.h(axm.a(this.t.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = axm.a(this.t.c);
         int $$4 = axm.a(this.t.d - (double)$$0);
         int $$5 = axm.a(this.t.e);
         return new id($$3, $$4, $$5);
      }
   }

   protected float aK() {
      float $$0 = this.dM().a_(this.dm()).b().j();
      float $$1 = this.dM().a_(this.aI()).b().j();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aL() {
      dpi $$0 = this.dM().a_(this.dm());
      float $$1 = $$0.b().i();
      if (!$$0.a(dcj.G) && !$$0.a(dcj.nd)) {
         return (double)$$1 == 1.0 ? this.dM().a_(this.aI()).b().i() : $$1;
      } else {
         return $$1;
      }
   }

   protected esj a(esj $$0, bqy $$1) {
      return $$0;
   }

   protected esj d(esj $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dM().Y();
         if ($$1 != this.be) {
            Arrays.fill(this.bd, 0.0);
            this.be = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(ij.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? esj.b : new esj($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(ij.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? esj.b : new esj(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(ij.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? esj.b : new esj(0.0, 0.0, $$4);
         } else {
            return esj.b;
         }
      }
   }

   private double a(ij.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = axm.a($$1 + this.bd[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bd[$$2];
      this.bd[$$2] = $$3;
      return $$1;
   }

   private esj a(esj $$0) {
      ese $$1 = this.cH();
      List<etc> $$2 = this.dM().c(this, $$1.b($$0));
      esj $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dM(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.aC() || $$5 && $$0.d < 0.0;
      if (this.dG() > 0.0F && $$7 && ($$4 || $$6)) {
         esj $$8 = a(this, new esj($$0.c, (double)this.dG(), $$0.e), $$1, this.dM(), $$2);
         esj $$9 = a(this, new esj(0.0, (double)this.dG(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dM(), $$2);
         if ($$9.d < (double)this.dG()) {
            esj $$10 = a(this, new esj($$0.c, 0.0, $$0.e), $$1.c($$9), this.dM(), $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new esj(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.dM(), $$2));
         }
      }

      return $$3;
   }

   public static esj a(@Nullable bqa $$0, esj $$1, ese $$2, czg $$3, List<etc> $$4) {
      Builder<etc> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      dqz $$6 = $$3.C_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.e($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static esj a(esj $$0, ese $$1, List<etc> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = esz.a(ij.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = esz.a(ij.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = esz.a(ij.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = esz.a(ij.a.c, $$1, $$2, $$5);
         }

         return new esj($$3, $$4, $$5);
      }
   }

   protected float aM() {
      return (float)((int)this.Z + 1);
   }

   protected aun aN() {
      return auo.ke;
   }

   protected aun aO() {
      return auo.kd;
   }

   protected aun aP() {
      return auo.kd;
   }

   protected void aQ() {
      ese $$0 = this.cH();
      id $$1 = id.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      id $$2 = id.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dM().a($$1, $$2)) {
         id.a $$3 = new id.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bA()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  dpi $$7 = this.dM().a_($$3);

                  try {
                     $$7.a(this.dM(), $$3, this);
                     this.a($$7);
                  } catch (Throwable var12) {
                     o $$9 = o.a(var12, "Colliding entity with block");
                     p $$10 = $$9.a("Block being collided with");
                     p.a($$10, this.dM(), $$3, $$7);
                     throw new y($$9);
                  }
               }
            }
         }
      }
   }

   protected void a(dpi $$0) {
   }

   public void a(in<dub> $$0, @Nullable bqa $$1) {
      this.dM().a($$1, $$0, this.t);
   }

   public void a(in<dub> $$0) {
      this.a($$0, this);
   }

   private void c(id $$0, dpi $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.r();
      }
   }

   protected void aR() {
      bqa $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      esj $$2 = $$0.dp();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected id e(id $$0) {
      id $$1 = $$0.c();
      dpi $$2 = this.dM().a_($$1);
      return !$$2.a(ave.bn) && !$$2.a(ave.bo) ? $$0 : $$1;
   }

   protected void a(dpi $$0, dpi $$1) {
      djt $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dpi $$0) {
      djt $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(id $$0, dpi $$1) {
      djt $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dpi $$0) {
      return $$0.a(ave.bm) && this.ah >= this.bj + 20;
   }

   private void r() {
      this.bi = this.bi * (float)Math.pow(0.997, (double)(this.ah - this.bj));
      this.bi = Math.min(1.0F, this.bi + 0.07F);
      float $$0 = 0.5F + this.bi * this.ag.i() * 1.2F;
      float $$1 = 0.1F + this.bi * 1.2F;
      this.a(auo.E, $$1, $$0);
      this.bj = this.ah;
   }

   protected void e(float $$0) {
      this.a(this.aN(), $$0, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
   }

   protected void aS() {
   }

   protected boolean aT() {
      return false;
   }

   public void a(aun $$0, float $$1, float $$2) {
      if (!this.aU()) {
         this.dM().a(null, this.dr(), this.dt(), this.dx(), $$0, this.db(), $$1, $$2);
      }
   }

   public void a(aun $$0) {
      if (!this.aU()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean aU() {
      return this.an.a(aU);
   }

   public void d(boolean $$0) {
      this.an.a(aU, $$0);
   }

   public boolean aV() {
      return this.an.a(aV);
   }

   public void e(boolean $$0) {
      this.an.a(aV, $$0);
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
         this.g(this.dp().b(0.0, -$$0, 0.0));
      }
   }

   protected bqa.b aZ() {
      return bqa.b.d;
   }

   public boolean ba() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dpi $$2, id $$3) {
      if ($$1) {
         if (this.ab > 0.0F) {
            $$2.b().a(this.dM(), $$2, $$3, this, this.ab);
            this.dM().a(dub.A, this.t, dub.a.a(this, this.aD.<dpi>map($$0x -> this.dM().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ab -= (float)$$0;
      }
   }

   public boolean bb() {
      return this.ai().d();
   }

   public boolean a(float $$0, float $$1, boy $$2) {
      if (this.o.a(avh.o)) {
         return false;
      } else {
         if (this.bP()) {
            for (bqa $$3 : this.cP()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean bc() {
      return this.ai;
   }

   private boolean v() {
      id $$0 = this.dm();
      return this.dM().r($$0) || this.dM().r(id.a((double)$$0.u(), this.cH().e, (double)$$0.w()));
   }

   private boolean w() {
      return this.dn().a(dcj.nd);
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
      return this.ak && this.bc();
   }

   public void bi() {
      if (this.bZ()) {
         this.h(this.bY() && this.bc() && !this.bO());
      } else {
         this.h(this.bY() && this.bh() && !this.bO() && this.dM().b_(this.u).a(avj.a));
      }
   }

   protected boolean bj() {
      this.aj.clear();
      this.bk();
      double $$0 = this.dM().D_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(avj.b, $$0);
      return this.bc() || $$1;
   }

   void bk() {
      if (this.cZ() instanceof clx $$0 && !$$0.bh()) {
         this.ai = false;
         return;
      }

      if (this.a(avj.a, 0.014)) {
         if (!this.ai && !this.am) {
            this.bl();
         }

         this.n();
         this.ai = true;
         this.aA();
      } else {
         this.ai = false;
      }
   }

   private void x() {
      this.ak = this.a(avj.a);
      this.aM.clear();
      double $$0 = this.dv();
      if (this.cZ() instanceof clx $$2 && !$$2.bh() && $$2.cH().e >= $$0 && $$2.cH().b <= $$0) {
         return;
      }

      id $$3 = id.a(this.dr(), $$0, this.dx());
      elb $$4 = this.dM().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((cym)this.dM(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aM::add);
      }
   }

   protected void bl() {
      bqa $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      esj $$2 = $$0.dp();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aO(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      } else {
         this.a(this.aP(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      }

      float $$4 = (float)axm.a(this.dt());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bf.a() * 20.0F; $$5++) {
         double $$6 = (this.ag.j() * 2.0 - 1.0) * (double)this.bf.a();
         double $$7 = (this.ag.j() * 2.0 - 1.0) * (double)this.bf.a();
         this.dM().a(kn.e, this.dr() + $$6, (double)($$4 + 1.0F), this.dx() + $$7, $$2.c, $$2.d - this.ag.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bf.a() * 20.0F; $$8++) {
         double $$9 = (this.ag.j() * 2.0 - 1.0) * (double)this.bf.a();
         double $$10 = (this.ag.j() * 2.0 - 1.0) * (double)this.bf.a();
         this.dM().a(kn.ak, this.dr() + $$9, (double)($$4 + 1.0F), this.dx() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(dub.O);
   }

   @Deprecated
   protected dpi bm() {
      return this.dM().a_(this.aH());
   }

   public dpi bn() {
      return this.dM().a_(this.aJ());
   }

   public boolean bo() {
      return this.bY() && !this.bc() && !this.N_() && !this.bX() && !this.bq() && this.bA();
   }

   protected void bp() {
      id $$0 = this.aH();
      dpi $$1 = this.dM().a_($$0);
      if ($$1.l() != dim.a) {
         esj $$2 = this.dp();
         id $$3 = this.dm();
         double $$4 = this.dr() + (this.ag.j() - 0.5) * (double)this.bf.a();
         double $$5 = this.dx() + (this.ag.j() - 0.5) * (double)this.bf.a();
         if ($$3.u() != $$0.u()) {
            $$4 = axm.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = axm.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dM().a(new kf(kn.c, $$1), $$4, this.dt() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(avt<ela> $$0) {
      return this.aM.contains($$0);
   }

   public boolean bq() {
      return !this.am && this.aj.getDouble(avj.b) > 0.0;
   }

   public void a(float $$0, esj $$1) {
      esj $$2 = a($$1, $$0, this.dC());
      this.g(this.dp().e($$2));
   }

   private static esj a(esj $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return esj.b;
      } else {
         esj $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = axm.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = axm.b($$2 * (float) (Math.PI / 180.0));
         return new esj($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float br() {
      return this.dM().f(this.dq(), this.dw()) ? this.dM().x(id.a(this.dr(), this.dv(), this.dx())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.r($$3 % 360.0F);
      this.s(axm.a($$4, -90.0F, 90.0F) % 360.0F);
      this.N = this.dC();
      this.O = this.dE();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = axm.a($$0, -3.0E7, 3.0E7);
      double $$4 = axm.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(esj $$0) {
      this.e($$0.c, $$0.d, $$0.e);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dC(), this.dE());
   }

   public void a(id $$0, float $$1, float $$2) {
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
      double $$0 = this.dr();
      double $$1 = this.dt();
      double $$2 = this.dx();
      this.K = $$0;
      this.L = $$1;
      this.M = $$2;
      this.ac = $$0;
      this.ad = $$1;
      this.ae = $$2;
      this.N = this.dC();
      this.O = this.dE();
   }

   public float f(bqa $$0) {
      float $$1 = (float)(this.dr() - $$0.dr());
      float $$2 = (float)(this.dt() - $$0.dt());
      float $$3 = (float)(this.dx() - $$0.dx());
      return axm.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dr() - $$0;
      double $$4 = this.dt() - $$1;
      double $$5 = this.dx() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(bqa $$0) {
      return this.f($$0.dk());
   }

   public double f(esj $$0) {
      double $$1 = this.dr() - $$0.c;
      double $$2 = this.dt() - $$0.d;
      double $$3 = this.dx() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cka $$0) {
   }

   public void h(bqa $$0) {
      if (!this.y($$0)) {
         if (!$$0.af && !this.af) {
            double $$1 = $$0.dr() - this.dr();
            double $$2 = $$0.dx() - this.dx();
            double $$3 = axm.a($$1, $$2);
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
               if (!this.bP() && this.bx()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.bP() && $$0.bx()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void j(double $$0, double $$1, double $$2) {
      this.g(this.dp().b($$0, $$1, $$2));
      this.au = true;
   }

   protected void bt() {
      this.T = true;
   }

   public boolean a(boy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bt();
         return false;
      }
   }

   public final esj f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dE() : axm.i($$0, this.O, this.dE());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dC() : axm.i($$0, this.N, this.dC());
   }

   protected final esj b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = axm.b($$3);
      float $$5 = axm.a($$3);
      float $$6 = axm.b($$2);
      float $$7 = axm.a($$2);
      return new esj((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final esj i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final esj c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final esj bu() {
      return new esj(this.dr(), this.dv(), this.dx());
   }

   public final esj j(float $$0) {
      double $$1 = axm.d((double)$$0, this.K, this.dr());
      double $$2 = axm.d((double)$$0, this.L, this.dt()) + (double)this.cI();
      double $$3 = axm.d((double)$$0, this.M, this.dx());
      return new esj($$1, $$2, $$3);
   }

   public esj k(float $$0) {
      return this.j($$0);
   }

   public final esj l(float $$0) {
      double $$1 = axm.d((double)$$0, this.K, this.dr());
      double $$2 = axm.d((double)$$0, this.L, this.dt());
      double $$3 = axm.d((double)$$0, this.M, this.dx());
      return new esj($$1, $$2, $$3);
   }

   public esh a(double $$0, float $$1, boolean $$2) {
      esj $$3 = this.j($$1);
      esj $$4 = this.f($$1);
      esj $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dM().a(new cyp($$3, $$5, cyp.a.b, $$2 ? cyp.b.c : cyp.b.a, this));
   }

   public boolean bv() {
      return this.bA() && this.bw();
   }

   public boolean bw() {
      return false;
   }

   public boolean bx() {
      return false;
   }

   public void a(bqa $$0, int $$1, boy $$2) {
      if ($$0 instanceof apv) {
         am.d.a((apv)$$0, this, $$2);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.dr() - $$0;
      double $$4 = this.dt() - $$1;
      double $$5 = this.dx() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cH().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * n;
      return $$0 < $$1 * $$1;
   }

   public boolean d(to $$0) {
      if (this.aJ != null && !this.aJ.b()) {
         return false;
      } else {
         String $$1 = this.bz();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.f($$0);
            return true;
         }
      }
   }

   public boolean e(to $$0) {
      return this.bO() ? false : this.d($$0);
   }

   public to f(to $$0) {
      try {
         if (this.r != null) {
            $$0.a("Pos", this.a(this.r.dr(), this.dt(), this.r.dx()));
         } else {
            $$0.a("Pos", this.a(this.dr(), this.dt(), this.dx()));
         }

         esj $$1 = this.dp();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dC(), this.dE()));
         $$0.a("FallDistance", this.ab);
         $$0.a("Fire", (short)this.aL);
         $$0.a("Air", (short)this.ci());
         $$0.a("OnGround", this.aC());
         $$0.a("Invulnerable", this.ba);
         $$0.a("PortalCooldown", this.aZ);
         $$0.a("UUID", this.cw());
         wi $$2 = this.af();
         if ($$2 != null) {
            $$0.a("CustomName", wi.a.a($$2, this.dO()));
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

         if (this.bb) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.cj();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.cj());
         }

         if (this.bk) {
            $$0.a("HasVisualFire", this.bk);
         }

         if (!this.bc.isEmpty()) {
            tu $$4 = new tu();

            for (String $$5 : this.bc) {
               $$4.add(uj.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bP()) {
            tu $$6 = new tu();

            for (bqa $$7 : this.cP()) {
               to $$8 = new to();
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

   public void g(to $$0) {
      try {
         tu $$1 = $$0.c("Pos", 6);
         tu $$2 = $$0.c("Motion", 6);
         tu $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(axm.a($$1.h(0), -3.0000512E7, 3.0000512E7), axm.a($$1.h(1), -2.0E7, 2.0E7), axm.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.r($$3.i(0));
         this.s($$3.i(1));
         this.bs();
         this.n(this.dC());
         this.o(this.dC());
         this.ab = $$0.j("FallDistance");
         this.aL = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.k($$0.g("Air"));
         }

         this.aI = $$0.q("OnGround");
         this.ba = $$0.q("Invulnerable");
         this.aZ = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.ay = $$0.a("UUID");
            this.az = this.ay.toString();
         }

         if (!Double.isFinite(this.dr()) || !Double.isFinite(this.dt()) || !Double.isFinite(this.dx())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dC()) && Double.isFinite((double)this.dE())) {
            this.ar();
            this.a(this.dC(), this.dE());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(wi.a.a($$8, this.dO()));
               } catch (Exception var16) {
                  c.warn("Failed to parse entity custom name {}", $$8, var16);
               }
            }

            this.n($$0.q("CustomNameVisible"));
            this.d($$0.q("Silent"));
            this.e($$0.q("NoGravity"));
            this.i($$0.q("Glowing"));
            this.l($$0.h("TicksFrozen"));
            this.bk = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.bc.clear();
               tu $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.bc.add($$10.j($$12));
               }
            }

            this.a($$0);
            if (this.by()) {
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

   protected boolean by() {
      return true;
   }

   @Nullable
   protected final String bz() {
      bqg<?> $$0 = this.ai();
      ajv $$1 = bqg.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(to var1);

   protected abstract void b(to var1);

   protected tu a(double... $$0) {
      tu $$1 = new tu();

      for (double $$2 : $$0) {
         $$1.add(tp.a($$2));
      }

      return $$1;
   }

   protected tu a(float... $$0) {
      tu $$1 = new tu();

      for (float $$2 : $$0) {
         $$1.add(tr.a($$2));
      }

      return $$1;
   }

   @Nullable
   public cgk a(czf $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public cgk a(czf $$0, int $$1) {
      return this.a(new crs($$0), (float)$$1);
   }

   @Nullable
   public cgk b(crs $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public cgk a(crs $$0, float $$1) {
      if ($$0.d()) {
         return null;
      } else if (this.dM().B) {
         return null;
      } else {
         cgk $$2 = new cgk(this.dM(), this.dr(), this.dt() + (double)$$1, this.dx(), $$0);
         $$2.v();
         this.dM().b($$2);
         return $$2;
      }
   }

   public boolean bA() {
      return !this.dH();
   }

   public boolean bB() {
      if (this.af) {
         return false;
      } else {
         float $$0 = this.bf.a() * 0.8F;
         ese $$1 = ese.a(this.bu(), (double)$$0, 1.0E-6, (double)$$0);
         return id.a($$1)
            .anyMatch(
               $$1x -> {
                  dpi $$2 = this.dM().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dM(), $$1x)
                     && esz.c($$2.k(this.dM(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), esz.a($$1), esn.i);
               }
            );
      }
   }

   public bof a(cka $$0, boe $$1) {
      return bof.d;
   }

   public boolean i(bqa $$0) {
      return $$0.bC() && !this.y($$0);
   }

   public boolean bC() {
      return false;
   }

   public void t() {
      this.g(esj.b);
      this.l();
      if (this.bO()) {
         this.cZ().j(this);
      }
   }

   public final void j(bqa $$0) {
      if (this.x($$0)) {
         this.a($$0, bqa::a_);
      }
   }

   protected void a(bqa $$0, bqa.a $$1) {
      esj $$2 = this.m($$0);
      esj $$3 = $$0.l(this);
      $$1.accept($$0, $$2.c - $$3.c, $$2.d - $$3.d, $$2.e - $$3.e);
   }

   public void k(bqa $$0) {
   }

   public esj l(bqa $$0) {
      return this.dj().b(bqb.b, 0, this.aF);
   }

   public esj m(bqa $$0) {
      return this.dk().e(this.a($$0, this.bf, 1.0F));
   }

   protected esj a(bqa $$0, bqd $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static esj a(bqa $$0, bqa $$1, bqc $$2) {
      int $$3 = $$0.cP().indexOf($$1);
      return $$2.c(bqb.a, $$3, $$0.aF);
   }

   public boolean n(bqa $$0) {
      return this.a($$0, false);
   }

   public boolean bD() {
      return this instanceof bqt;
   }

   public boolean a(bqa $$0, boolean $$1) {
      if ($$0 == this.r) {
         return false;
      } else if (!$$0.bG()) {
         return false;
      } else {
         for (bqa $$2 = $$0; $$2.r != null; $$2 = $$2.r) {
            if ($$2.r == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bO()) {
               this.ac();
            }

            this.b(bre.a);
            this.r = $$0;
            this.r.p(this);
            $$0.A().filter($$0x -> $$0x instanceof apv).forEach($$0x -> am.U.a((apv)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bqa $$0) {
      return !this.bS() && this.J <= 0;
   }

   public void bE() {
      for (int $$0 = this.q.size() - 1; $$0 >= 0; $$0--) {
         ((bqa)this.q.get($$0)).ac();
      }
   }

   public void bF() {
      if (this.r != null) {
         bqa $$0 = this.r;
         this.r = null;
         $$0.q(this);
      }
   }

   public void ac() {
      this.bF();
   }

   protected void p(bqa $$0) {
      if ($$0.cZ() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.q.isEmpty()) {
            this.q = ImmutableList.of($$0);
         } else {
            List<bqa> $$1 = Lists.newArrayList(this.q);
            if (!this.dM().B && $$0 instanceof cka && !(this.cQ() instanceof cka)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.q = ImmutableList.copyOf($$1);
         }

         this.a(dub.s, $$0);
      }
   }

   protected void q(bqa $$0) {
      if ($$0.cZ() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.q.size() == 1 && this.q.get(0) == $$0) {
            this.q = ImmutableList.of();
         } else {
            this.q = this.q.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(dub.q, $$0);
      }
   }

   protected boolean r(bqa $$0) {
      return this.q.isEmpty();
   }

   protected boolean bG() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public double c_() {
      return this.dr();
   }

   public double d_() {
      return this.dt();
   }

   public double L_() {
      return this.dx();
   }

   public float M_() {
      return this.dE();
   }

   public float e_() {
      return this.dC();
   }

   public void a(float $$0, int $$1) {
      this.n($$0);
   }

   public float bH() {
      return 0.0F;
   }

   public esj bI() {
      return this.b(this.dE(), this.dC());
   }

   public esj a(crn $$0) {
      if (!(this instanceof cka $$1)) {
         return esj.b;
      } else {
         boolean $$2 = $$1.eV().a($$0) && !$$1.eU().a($$0);
         bqn $$3 = $$2 ? $$1.fr().e() : $$1.fr();
         return this.b(0.0F, this.dC() + (float)($$3 == bqn.b ? 80 : -80)).a(0.5);
      }
   }

   public esi bJ() {
      return new esi(this.dE(), this.dC());
   }

   public esj bK() {
      return esj.a(this.bJ());
   }

   public void f(id $$0) {
      if (this.aw()) {
         this.au();
      } else {
         if (!this.dM().B && !$$0.equals(this.ax)) {
            this.ax = $$0.i();
         }

         this.av = true;
      }
   }

   protected void bL() {
      if (this.dM() instanceof apu) {
         int $$0 = this.ax();
         apu $$1 = (apu)this.dM();
         if (this.av) {
            MinecraftServer $$2 = $$1.o();
            aju<czg> $$3 = this.dM().ae() == czg.i ? czg.h : czg.i;
            apu $$4 = $$2.a($$3);
            if ($$4 != null && $$2.G() && !this.bO() && this.aw++ >= $$0) {
               this.dM().af().a("portal");
               this.aw = $$0;
               this.au();
               this.b($$4);
               this.dM().af().c();
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

   public int bM() {
      return 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
   }

   public void c(boy $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dga.a(this);
      }
   }

   public void m(float $$0) {
   }

   public boolean bN() {
      boolean $$0 = this.dM() != null && this.dM().B;
      return !this.bb() && (this.aL > 0 || $$0 && this.j(0));
   }

   public boolean bO() {
      return this.cZ() != null;
   }

   public boolean bP() {
      return !this.q.isEmpty();
   }

   public boolean bQ() {
      return this.ai().a(avh.p);
   }

   public boolean bR() {
      return !this.ai().a(avh.q);
   }

   public void f(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean bS() {
      return this.j(1);
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
      return this.c(bre.f);
   }

   public boolean bY() {
      return this.j(3);
   }

   public void g(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean bZ() {
      return this.j(4);
   }

   public boolean ca() {
      return this.c(bre.d);
   }

   public boolean cb() {
      return this.ca() && !this.bc();
   }

   public void h(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cc() {
      return this.bb;
   }

   public final void i(boolean $$0) {
      this.bb = $$0;
      this.b(6, this.cd());
   }

   public boolean cd() {
      return this.dM().x_() ? this.j(6) : this.bb;
   }

   public boolean ce() {
      return this.j(5);
   }

   public boolean d(cka $$0) {
      if ($$0.N_()) {
         return false;
      } else {
         etp $$1 = this.cg();
         return $$1 != null && $$0 != null && $$0.cg() == $$1 && $$1.i() ? false : this.ce();
      }
   }

   public boolean cf() {
      return false;
   }

   public void a(BiConsumer<dty<?>, apu> $$0) {
   }

   @Nullable
   public eti cg() {
      return this.dM().L().e(this.cy());
   }

   public boolean s(bqa $$0) {
      return this.a($$0.cg());
   }

   public boolean a(etp $$0) {
      return this.cg() != null ? this.cg().a($$0) : false;
   }

   public void j(boolean $$0) {
      this.b(5, $$0);
   }

   protected boolean j(int $$0) {
      return (this.an.a(ao) & 1 << $$0) != 0;
   }

   protected void b(int $$0, boolean $$1) {
      byte $$2 = this.an.a(ao);
      if ($$1) {
         this.an.a(ao, (byte)($$2 | 1 << $$0));
      } else {
         this.an.a(ao, (byte)($$2 & ~(1 << $$0)));
      }
   }

   public int ch() {
      return 300;
   }

   public int ci() {
      return this.an.a(aR);
   }

   public void k(int $$0) {
      this.an.a(aR, $$0);
   }

   public int cj() {
      return this.an.a(aW);
   }

   public void l(int $$0) {
      this.an.a(aW, $$0);
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

   public void a(apu $$0, bqs $$1) {
      this.i(this.aL + 1);
      if (this.aL == 0) {
         this.g(8);
      }

      this.a(this.dN().b(), 5.0F);
   }

   public void k(boolean $$0) {
      esj $$1 = this.dp();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void l(boolean $$0) {
      esj $$1 = this.dp();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(apu $$0, bqt $$1) {
      return true;
   }

   public void cn() {
      if (this.dp().b() > -0.5 && this.ab > 1.0F) {
         this.ab = 1.0F;
      }
   }

   public void n() {
      this.ab = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      id $$3 = id.a($$0, $$1, $$2);
      esj $$4 = new esj($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      id.a $$5 = new id.a();
      ij $$6 = ij.b;
      double $$7 = Double.MAX_VALUE;

      for (ij $$8 : new ij[]{ij.c, ij.d, ij.e, ij.f, ij.b}) {
         $$5.a($$3, $$8);
         if (!this.dM().a_($$5).r(this.dM(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == ij.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ag.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      esj $$13 = this.dp().a(0.75);
      if ($$6.o() == ij.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == ij.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == ij.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dpi $$0, esj $$1) {
      this.n();
      this.U = $$1;
   }

   private static wi c(wi $$0) {
      ww $$1 = $$0.e().b($$0.a().a(null));

      for (wi $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public wi ad() {
      wi $$0 = this.af();
      return $$0 != null ? c($$0) : this.co();
   }

   protected wi co() {
      return this.o.h();
   }

   public boolean t(bqa $$0) {
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

   public boolean u(bqa $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dM() == null ? "~NULL~" : this.dM().toString();
      return this.aJ != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.ad().getString(),
            this.p,
            $$0,
            this.dr(),
            this.dt(),
            this.dx(),
            this.aJ
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.ad().getString(),
            this.p,
            $$0,
            this.dr(),
            this.dt(),
            this.dx()
         );
   }

   public boolean b(boy $$0) {
      return this.dH() || this.ba && !$$0.a(avg.e) && !$$0.g() || $$0.a(avg.j) && this.bb() || $$0.a(avg.n) && this.ai().a(avh.o);
   }

   public boolean cr() {
      return this.ba;
   }

   public void m(boolean $$0) {
      this.ba = $$0;
   }

   public void v(bqa $$0) {
      this.b($$0.dr(), $$0.dt(), $$0.dx(), $$0.dC(), $$0.dE());
   }

   public void w(bqa $$0) {
      to $$1 = $$0.f(new to());
      $$1.r("Dimension");
      this.g($$1);
      this.aZ = $$0.aZ;
      this.ax = $$0.ax;
   }

   @Nullable
   public bqa b(apu $$0) {
      if (this.dM() instanceof apu && !this.dH()) {
         this.dM().af().a("changeDimension");
         this.ag();
         this.dM().af().a("reposition");
         ema $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dM().af().b("reloading");
            bqa $$2 = this.ai().a((czg)$$0);
            if ($$2 != null) {
               $$2.w(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dE());
               $$2.g($$1.b);
               $$0.d($$2);
               if ($$0.ae() == czg.j) {
                  apu.a($$0);
               }
            }

            this.cs();
            this.dM().af().c();
            ((apu)this.dM()).h();
            $$0.h();
            this.dM().af().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void cs() {
      this.b(bqa.c.e);
   }

   @Nullable
   protected ema a(apu $$0) {
      boolean $$1 = this.dM().ae() == czg.j && $$0.ae() == czg.h;
      boolean $$2 = $$0.ae() == czg.j;
      if (!$$1 && !$$2) {
         boolean $$6 = $$0.ae() == czg.i;
         if (this.dM().ae() != czg.i && !$$6) {
            return null;
         } else {
            dqz $$7 = $$0.C_();
            double $$8 = dta.a(this.dM().D_(), $$0.D_());
            id $$9 = $$7.b(this.dr() * $$8, this.dt(), this.dx() * $$8);
            return this.a($$0, $$9, $$6, $$7).map($$1x -> {
               dpi $$2x = this.dM().a_(this.ax);
               ij.a $$3;
               esj $$5;
               if ($$2x.b(dpy.H)) {
                  $$3 = $$2x.c(dpy.H);
                  l.a $$4 = l.a(this.ax, $$3, 21, ij.a.b, 21, $$1xx -> this.dM().a_($$1xx) == $$2x);
                  $$5 = this.a($$3, $$4);
               } else {
                  $$3 = ij.a.a;
                  $$5 = new esj(0.5, 0.0, 0.0);
               }

               return emb.a($$0, $$1x, $$3, $$5, this, this.dp(), this.dC(), this.dE());
            }).orElse(null);
         }
      } else {
         id $$3 = $$2 ? apu.a : $$0.U();
         $$0.l().a(apz.f, new cyn($$3), 3, $$3);
         int $$4;
         if ($$2) {
            $$4 = $$3.v();
         } else {
            $$4 = $$0.m($$3).a(dva.a.f, $$3.u(), $$3.w()) + 1;
         }

         return new ema(new esj((double)$$3.u() + 0.5, (double)$$4, (double)$$3.w() + 0.5), this.dp(), this.dC(), this.dE());
      }
   }

   protected esj a(ij.a $$0, l.a $$1) {
      return emb.a($$1, $$0, this.dk(), this.a(this.ap()));
   }

   protected Optional<l.a> a(apu $$0, id $$1, boolean $$2, dqz $$3) {
      return $$0.p().a($$1, $$2, $$3);
   }

   public boolean ct() {
      return !this.bO() && !this.bP();
   }

   public float a(cyy $$0, cym $$1, id $$2, dpi $$3, elb $$4, float $$5) {
      return $$5;
   }

   public boolean a(cyy $$0, cym $$1, id $$2, dpi $$3, float $$4) {
      return true;
   }

   public int cu() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bqg.a(this.ai()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.p);
      $$0.a("Entity Name", () -> this.ad().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dr(), this.dt(), this.dx()));
      $$0.a("Entity's Block location", p.a(this.dM(), axm.a(this.dr()), axm.a(this.dt()), axm.a(this.dx())));
      esj $$1 = this.dp();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", () -> this.cP().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.cZ()));
   }

   public boolean cv() {
      return this.bN() && !this.N_();
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
      return n;
   }

   public static void b(double $$0) {
      n = $$0;
   }

   @Override
   public wi O_() {
      return eti.a(this.cg(), this.ad()).a($$0 -> $$0.a(this.cG()).a(this.cx()));
   }

   public void b(@Nullable wi $$0) {
      this.an.a(aS, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public wi af() {
      return this.an.a(aS).orElse(null);
   }

   @Override
   public boolean ae() {
      return this.an.a(aS).isPresent();
   }

   public void n(boolean $$0) {
      this.an.a(aT, $$0);
   }

   public boolean cB() {
      return this.an.a(aT);
   }

   public final void n(double $$0, double $$1, double $$2) {
      if (this.dM() instanceof apu) {
         cyn $$3 = new cyn(id.a($$0, $$1, $$2));
         ((apu)this.dM()).l().a(apz.g, $$3, 0, this.aj());
         this.dM().d($$3.e, $$3.f);
         this.c($$0, $$1, $$2);
      }
   }

   public boolean a(apu $$0, double $$1, double $$2, double $$3, Set<brg> $$4, float $$5, float $$6) {
      float $$7 = axm.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dM()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.z();
         this.n($$5);
      } else {
         this.ag();
         bqa $$8 = this.ai().a((czg)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(bqa.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dM() instanceof apu) {
         this.b($$0, $$1, $$2, this.dC(), this.dE());
         this.z();
      }
   }

   private void z() {
      this.cR().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.q.iterator();

         while (var1.hasNext()) {
            bqa $$1 = (bqa)var1.next();
            $$0.a($$1, bqa::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.dr() + $$0, this.dt() + $$1, this.dx() + $$2);
   }

   public boolean cC() {
      return this.cB();
   }

   @Override
   public void a(List<aje.c<?>> $$0) {
   }

   @Override
   public void a(aja<?> $$0) {
      if (as.equals($$0)) {
         this.j_();
      }
   }

   @Deprecated
   protected void cD() {
      bre $$0 = this.ap();
      bqd $$1 = this.a($$0);
      this.bf = $$1;
      this.bg = $$1.c();
   }

   public void j_() {
      bqd $$0 = this.bf;
      bre $$1 = this.ap();
      bqd $$2 = this.a($$1);
      this.bf = $$2;
      this.bg = $$2.c();
      this.ar();
      boolean $$3 = (double)$$2.a() <= 4.0 && (double)$$2.b() <= 4.0;
      if (!this.dM().B && !this.am && !this.af && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cka)) {
         esj $$4 = this.dk().b(0.0, (double)$$0.b() / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a() - $$0.a()) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b() - $$0.b()) + 1.0E-6;
         etc $$7 = esz.a(ese.a($$4, $$5, $$6, $$5));
         this.dM().a(this, $$7, $$4, (double)$$2.a(), (double)$$2.b(), (double)$$2.a()).ifPresent($$1x -> this.b($$1x.b(0.0, (double)(-$$2.b()) / 2.0, 0.0)));
      }
   }

   public ij cE() {
      return ij.a((double)this.dC());
   }

   public ij cF() {
      return this.cE();
   }

   protected wo cG() {
      return new wo(wo.a.c, new wo.b(this.ai(), this.cw(), this.ad()));
   }

   public boolean a(apv $$0) {
      return true;
   }

   @Override
   public final ese cH() {
      return this.aH;
   }

   public ese h_() {
      return this.cH();
   }

   public final void a(ese $$0) {
      this.aH = $$0;
   }

   public final float d(bre $$0) {
      return this.a($$0).c();
   }

   public final float cI() {
      return this.bg;
   }

   public esj p(float $$0) {
      return this.cJ();
   }

   protected esj cJ() {
      return new esj(0.0, (double)this.cI(), (double)(this.dg() * 0.4F));
   }

   public brk a_(int $$0) {
      return brk.b;
   }

   @Override
   public void a(wi $$0) {
   }

   public czg cK() {
      return this.dM();
   }

   @Nullable
   public MinecraftServer cL() {
      return this.dM().o();
   }

   public bof a(cka $$0, esj $$1, boe $$2) {
      return bof.d;
   }

   public boolean a(cyy $$0) {
      return false;
   }

   public void a(bqt $$0, bqa $$1) {
      if ($$1 instanceof bqt) {
         cxa.a((bqt)$$1, $$0);
      }

      cxa.b($$0, $$1);
   }

   public void c(apv $$0) {
   }

   public void d(apv $$0) {
   }

   public float a(dit $$0) {
      float $$1 = axm.g(this.dC());
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

   public float a(dhd $$0) {
      float $$1 = axm.g(this.dC());
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

   public ckt a(cks $$0) {
      return this.ai().a(avh.r) ? ckt.b : ckt.a;
   }

   @Nullable
   public bqt cN() {
      return null;
   }

   public final boolean cO() {
      return this.cN() != null;
   }

   public final List<bqa> cP() {
      return this.q;
   }

   @Nullable
   public bqa cQ() {
      return this.q.isEmpty() ? null : (bqa)this.q.get(0);
   }

   public boolean x(bqa $$0) {
      return this.q.contains($$0);
   }

   public boolean a(Predicate<bqa> $$0) {
      UnmodifiableIterator var2 = this.q.iterator();

      while (var2.hasNext()) {
         bqa $$1 = (bqa)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bqa> A() {
      return this.q.stream().flatMap(bqa::cR);
   }

   @Override
   public Stream<bqa> cR() {
      return Stream.concat(Stream.of(this), this.A());
   }

   @Override
   public Stream<bqa> cS() {
      return Stream.concat(this.q.stream().flatMap(bqa::cS), Stream.of(this));
   }

   public Iterable<bqa> cT() {
      return () -> this.A().iterator();
   }

   public int cU() {
      return (int)this.A().filter($$0 -> $$0 instanceof cka).count();
   }

   public boolean cV() {
      return this.cU() == 1;
   }

   public bqa cW() {
      bqa $$0 = this;

      while ($$0.bO()) {
         $$0 = $$0.cZ();
      }

      return $$0;
   }

   public boolean y(bqa $$0) {
      return this.cW() == $$0.cW();
   }

   public boolean z(bqa $$0) {
      if (!$$0.bO()) {
         return false;
      } else {
         bqa $$1 = $$0.cZ();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean cX() {
      return this.cN() instanceof cka $$0 ? $$0.g() : this.cY();
   }

   public boolean cY() {
      return !this.dM().B;
   }

   protected static esj a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -axm.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = axm.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new esj((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public esj b(bqt $$0) {
      return new esj(this.dr(), this.cH().e, this.dx());
   }

   @Nullable
   public bqa cZ() {
      return this.r;
   }

   @Nullable
   public bqa da() {
      return this.r != null && this.r.cN() == this ? this.r : null;
   }

   public elg k_() {
      return elg.a;
   }

   public aup db() {
      return aup.g;
   }

   protected int dc() {
      return 1;
   }

   public dv dd() {
      return new dv(
         this, this.dk(), this.bJ(), this.dM() instanceof apu ? (apu)this.dM() : null, this.F(), this.ad().getString(), this.O_(), this.dM().o(), this
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
      return this.dM().aa().b(czc.p);
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public boolean U_() {
      return true;
   }

   public void a(eh.a $$0, esj $$1) {
      esj $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.s(axm.g((float)(-(axm.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.r(axm.g((float)(axm.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dC());
      this.O = this.dE();
      this.N = this.dC();
   }

   public boolean a(avt<ela> $$0, double $$1) {
      if (this.de()) {
         return false;
      } else {
         ese $$2 = this.cH().h(0.001);
         int $$3 = axm.a($$2.a);
         int $$4 = axm.c($$2.d);
         int $$5 = axm.a($$2.b);
         int $$6 = axm.c($$2.e);
         int $$7 = axm.a($$2.c);
         int $$8 = axm.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cz();
         boolean $$11 = false;
         esj $$12 = esj.b;
         int $$13 = 0;
         id.a $$14 = new id.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  elb $$18 = this.dM().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((cym)this.dM(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           esj $$20 = $$18.c(this.dM(), $$14);
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

            if (!(this instanceof cka)) {
               $$12 = $$12.d();
            }

            esj $$21 = this.dp();
            $$12 = $$12.a($$1 * 1.0);
            double $$22 = 0.003;
            if (Math.abs($$21.c) < 0.003 && Math.abs($$21.e) < 0.003 && $$12.f() < 0.0045000000000000005) {
               $$12 = $$12.d().a(0.0045000000000000005);
            }

            this.g(this.dp().e($$12));
         }

         this.aj.put($$0, $$9);
         return $$11;
      }
   }

   public boolean de() {
      ese $$0 = this.cH().g(1.0);
      int $$1 = axm.a($$0.a);
      int $$2 = axm.c($$0.d);
      int $$3 = axm.a($$0.c);
      int $$4 = axm.c($$0.f);
      return !this.dM().b($$1, $$3, $$2, $$4);
   }

   public double b(avt<ela> $$0) {
      return this.aj.getDouble($$0);
   }

   public double df() {
      return (double)this.cI() < 0.4 ? 0.0 : 0.4;
   }

   public final float dg() {
      return this.bf.a();
   }

   public final float dh() {
      return this.bf.b();
   }

   public yp<aba> di() {
      return new abb(this);
   }

   public bqd a(bre $$0) {
      return this.o.n();
   }

   public final bqc dj() {
      return this.bf.d();
   }

   public esj dk() {
      return this.t;
   }

   public esj dl() {
      return this.dk();
   }

   @Override
   public id dm() {
      return this.u;
   }

   public dpi dn() {
      if (this.bl == null) {
         this.bl = this.dM().a_(this.dm());
      }

      return this.bl;
   }

   public cyn do() {
      return this.v;
   }

   public esj dp() {
      return this.aE;
   }

   public void g(esj $$0) {
      this.aE = $$0;
   }

   public void h(esj $$0) {
      this.g(this.dp().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.g(new esj($$0, $$1, $$2));
   }

   public final int dq() {
      return this.u.u();
   }

   public final double dr() {
      return this.t.c;
   }

   public double c(double $$0) {
      return this.t.c + (double)this.dg() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ag.j() - 1.0) * $$0);
   }

   public final int ds() {
      return this.u.v();
   }

   public final double dt() {
      return this.t.d;
   }

   public double e(double $$0) {
      return this.t.d + (double)this.dh() * $$0;
   }

   public double du() {
      return this.e(this.ag.j());
   }

   public double dv() {
      return this.t.d + (double)this.bg;
   }

   public final int dw() {
      return this.u.w();
   }

   public final double dx() {
      return this.t.e;
   }

   public double f(double $$0) {
      return this.t.e + (double)this.dg() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ag.j() - 1.0) * $$0);
   }

   public final void p(double $$0, double $$1, double $$2) {
      if (this.t.c != $$0 || this.t.d != $$1 || this.t.e != $$2) {
         this.t = new esj($$0, $$1, $$2);
         int $$3 = axm.a($$0);
         int $$4 = axm.a($$1);
         int $$5 = axm.a($$2);
         if ($$3 != this.u.u() || $$4 != this.u.v() || $$5 != this.u.w()) {
            this.u = new id($$3, $$4, $$5);
            this.bl = null;
            if (jg.a($$3) != this.v.e || jg.a($$5) != this.v.f) {
               this.v = new cyn(this.u);
            }
         }

         this.aX.a();
      }
   }

   public void dy() {
   }

   public esj q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bg * 0.7, 0.0);
   }

   public void a(abb $$0) {
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
   public crs dz() {
      return null;
   }

   public void o(boolean $$0) {
      this.aA = $$0;
   }

   public boolean dA() {
      return !this.ai().a(avh.k);
   }

   public boolean dB() {
      return (this.aA || this.aB) && this.dA();
   }

   public float dC() {
      return this.aF;
   }

   public float dD() {
      return this.dC();
   }

   public void r(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aF = $$0;
      }
   }

   public float dE() {
      return this.aG;
   }

   public void s(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aG = $$0;
      }
   }

   public boolean dF() {
      return false;
   }

   public float dG() {
      return 0.0F;
   }

   public void a(@Nullable bqa $$0) {
   }

   public final boolean dH() {
      return this.aJ != null;
   }

   @Nullable
   public bqa.c dI() {
      return this.aJ;
   }

   @Override
   public final void b(bqa.c $$0) {
      if (this.aJ == null) {
         this.aJ = $$0;
      }

      if (this.aJ.a()) {
         this.ac();
      }

      this.cP().forEach(bqa::ac);
      this.aX.a($$0);
   }

   protected void dJ() {
      this.aJ = null;
   }

   @Override
   public void a(dtj $$0) {
      this.aX = $$0;
   }

   @Override
   public boolean dK() {
      if (this.aJ != null && !this.aJ.b()) {
         return false;
      } else {
         return this.bO() ? false : !this.bP() || !this.cV();
      }
   }

   @Override
   public boolean dL() {
      return false;
   }

   public boolean a(czg $$0, id $$1) {
      return true;
   }

   public czg dM() {
      return this.s;
   }

   protected void a(czg $$0) {
      this.s = $$0;
   }

   public boz dN() {
      return this.dM().ai();
   }

   public jb dO() {
      return this.dM().H_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = axm.d($$6, this.dr(), $$1);
      double $$8 = axm.d($$6, this.dt(), $$2);
      double $$9 = axm.d($$6, this.dx(), $$3);
      float $$10 = (float)axm.e($$6, (double)this.dC(), $$4);
      float $$11 = (float)axm.d($$6, (double)this.dE(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   @FunctionalInterface
   public interface a {
      void accept(bqa var1, double var2, double var4, double var6);
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
