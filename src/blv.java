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

public abstract class blv implements bkf, dmy, dr, emw {
   private static final Logger c = LogUtils.getLogger();
   public static final String w = "id";
   public static final String x = "Passengers";
   private static final AtomicInteger d = new AtomicInteger();
   private static final List<cmy> e = Collections.emptyList();
   public static final int y = 60;
   public static final int z = 300;
   public static final int A = 1024;
   public static final float B = 0.2F;
   public static final double C = 0.500001;
   public static final double D = 0.999999;
   public static final float E = 0.11111111F;
   public static final int F = 140;
   public static final int G = 40;
   private static final elo k = new elo(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double l = 0.014;
   private static final double m = 0.007;
   private static final double n = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double o = 1.0;
   private final blz<?> p;
   private int q = d.incrementAndGet();
   public boolean I;
   private ImmutableList<blv> r = ImmutableList.of();
   protected int J;
   @Nullable
   private blv s;
   private ctp t;
   public double K;
   public double L;
   public double M;
   private elt u;
   private hx v;
   private csw aE;
   private elt aF = elt.b;
   private float aG;
   private float aH;
   public float N;
   public float O;
   private elo aI = k;
   private boolean aJ;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected elt U = elt.b;
   @Nullable
   private blv.c aK;
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
   protected final auv ag = auv.a();
   public int ah;
   private int aN = -this.dc();
   protected boolean ai;
   protected Object2DoubleMap<asw<eeq>> aj = new Object2DoubleArrayMap(2);
   protected boolean ak;
   private final Set<asw<eeq>> aO = new HashSet<>();
   public int al;
   protected boolean am = true;
   protected final agp an;
   protected static final agm<Byte> ao = agp.a(blv.class, ago.a);
   protected static final int ap = 0;
   private static final int aP = 1;
   private static final int aQ = 3;
   private static final int aR = 4;
   private static final int aS = 5;
   protected static final int aq = 6;
   protected static final int ar = 7;
   private static final agm<Integer> aT = agp.a(blv.class, ago.b);
   private static final agm<Optional<vf>> aU = agp.a(blv.class, ago.g);
   private static final agm<Boolean> aV = agp.a(blv.class, ago.k);
   private static final agm<Boolean> aW = agp.a(blv.class, ago.k);
   private static final agm<Boolean> aX = agp.a(blv.class, ago.k);
   protected static final agm<bmx> as = agp.a(blv.class, ago.v);
   private static final agm<Integer> aY = agp.a(blv.class, ago.b);
   private dmz aZ = dmz.a;
   private final afg ba = new afg();
   public boolean at;
   public boolean au;
   private int bb;
   protected boolean av;
   protected int aw;
   protected hx ax;
   private boolean bc;
   protected UUID ay = auo.a(this.ag);
   protected String az = this.ay.toString();
   private boolean bd;
   private final Set<String> be = Sets.newHashSet();
   private final double[] bf = new double[]{0.0, 0.0, 0.0};
   private long bg;
   private blw bh;
   private float bi;
   public boolean aA;
   public boolean aB;
   public boolean aC;
   public Optional<hx> aD = Optional.empty();
   private boolean bj = false;
   private float bk;
   private int bl;
   private boolean bm;
   @Nullable
   private djh bn = null;

   public blv(blz<?> $$0, ctp $$1) {
      this.p = $$0;
      this.t = $$1;
      this.bh = $$0.n();
      this.u = elt.b;
      this.v = hx.b;
      this.aE = csw.b;
      this.an = new agp(this);
      this.an.a(ao, (byte)0);
      this.an.a(aT, this.ch());
      this.an.a(aV, false);
      this.an.a(aU, Optional.empty());
      this.an.a(aW, false);
      this.an.a(aX, false);
      this.an.a(as, bmx.a);
      this.an.a(aY, 0);
      this.c_();
      this.a_(0.0, 0.0, 0.0);
      this.bi = this.a(bmx.a, this.bh);
   }

   public boolean a(hx $$0, djh $$1) {
      emm $$2 = $$1.b(this.dM(), $$0, ely.a(this));
      emm $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return emj.c($$3, emj.a(this.cH()), elx.i);
   }

   public int j_() {
      emz $$0 = this.cg();
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
      this.ba.e(new elt($$0, $$1, $$2));
   }

   public afg ah() {
      return this.ba;
   }

   public blz<?> ai() {
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
      return this.be;
   }

   public boolean a(String $$0) {
      return this.be.size() >= 1024 ? false : this.be.add($$0);
   }

   public boolean b(String $$0) {
      return this.be.remove($$0);
   }

   public void al() {
      this.a(blv.c.a);
      this.a(dnr.p);
   }

   public final void am() {
      this.a(blv.c.b);
   }

   protected abstract void c_();

   public agp an() {
      return this.an;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof blv ? ((blv)$$0).q == this.q : false;
   }

   @Override
   public int hashCode() {
      return this.q;
   }

   public void a(blv.c $$0) {
      this.b($$0);
   }

   public void ao() {
   }

   public void b(bmx $$0) {
      this.an.b(as, $$0);
   }

   public bmx ap() {
      return this.an.b(as);
   }

   public boolean c(bmx $$0) {
      return this.ap() == $$0;
   }

   public boolean a(blv $$0, double $$1) {
      return this.dk().a((ir)$$0.dk(), $$1);
   }

   public boolean a(blv $$0, double $$1, double $$2) {
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.dt() - this.dt();
      double $$5 = $$0.dx() - this.dx();
      return auo.e($$3, $$5) < auo.k($$1) && auo.k($$4) < auo.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.r($$0 % 360.0F);
      this.s($$1 % 360.0F);
   }

   public final void b(elt $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.aq());
   }

   protected elo aq() {
      return this.bh.a(this.u);
   }

   protected void ar() {
      this.a_(this.u.c, this.u.d, this.u.e);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.s(this.dE() + $$2);
      this.r(this.dC() + $$3);
      this.s(auo.a(this.dE(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = auo.a(this.O, -90.0F, 90.0F);
      if (this.s != null) {
         this.s.j(this);
      }
   }

   public void l() {
      this.as();
   }

   public void as() {
      this.dM().af().a("entityBaseTick");
      this.bn = null;
      if (this.bO() && this.cZ().dH()) {
         this.ac();
      }

      if (this.J > 0) {
         this.J--;
      }

      this.X = this.Y;
      this.O = this.dE();
      this.N = this.dC();
      this.bI();
      if (this.bl()) {
         this.bm();
      }

      this.aB = this.aA;
      this.aA = false;
      this.bg();
      this.y();
      this.bf();
      if (this.dM().B) {
         this.aA();
      } else if (this.aN > 0) {
         if (this.aY()) {
            this.h(this.aN - 4);
            if (this.aN < 0) {
               this.aA();
            }
         } else {
            if (this.aN % 20 == 0 && !this.bn()) {
               this.a(this.dN().c(), 1.0F);
            }

            this.h(this.aN - 1);
         }

         if (this.cj() > 0) {
            this.k(0);
            this.dM().a(null, 1009, this.v, 1);
         }
      }

      if (this.bn()) {
         this.ay();
         this.ab *= 0.5F;
      }

      this.at();
      if (!this.dM().B) {
         this.a_(this.aN > 0);
      }

      this.am = false;
      this.dM().af().c();
   }

   public void a_(boolean $$0) {
      this.b(0, $$0 || this.bm);
   }

   public void at() {
      if (this.dt() < (double)(this.dM().J_() - 64)) {
         this.aB();
      }
   }

   public void au() {
      this.bb = this.bJ();
   }

   public void f(int $$0) {
      this.bb = $$0;
   }

   public int av() {
      return this.bb;
   }

   public boolean aw() {
      return this.bb > 0;
   }

   protected void L() {
      if (this.aw()) {
         this.bb--;
      }
   }

   public int ax() {
      return 0;
   }

   public void ay() {
      if (!this.aY()) {
         this.g(15);
         if (this.a(this.dN().d(), 4.0F)) {
            this.a(ars.jw, 0.4F, 2.0F + this.ag.i() * 0.4F);
         }
      }
   }

   public void g(int $$0) {
      int $$1 = $$0 * 20;
      if (this instanceof bml) {
         $$1 = crw.a((bml)this, $$1);
      }

      if (this.aN < $$1) {
         this.h($$1);
      }
   }

   public void h(int $$0) {
      this.aN = $$0;
   }

   public int az() {
      return this.aN;
   }

   public void aA() {
      this.h(0);
   }

   protected void aB() {
      this.am();
   }

   public boolean g(double $$0, double $$1, double $$2) {
      return this.b(this.cH().d($$0, $$1, $$2));
   }

   private boolean b(elo $$0) {
      return this.dM().a(this, $$0) && !this.dM().d($$0);
   }

   public void c(boolean $$0) {
      this.aJ = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, elt $$1) {
      this.aJ = $$0;
      this.b($$0, $$1);
   }

   public boolean d(hx $$0) {
      return this.aD.isPresent() && this.aD.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable elt $$1) {
      if ($$0) {
         elo $$2 = this.cH();
         elo $$3 = new elo($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<hx> $$4 = this.t.g(this, $$3);
         if ($$4.isPresent() || this.bj) {
            this.aD = $$4;
         } else if ($$1 != null) {
            elo $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
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

   public boolean aC() {
      return this.aJ;
   }

   public void a(bmr $$0, elt $$1) {
      if (this.af) {
         this.a_(this.dr() + $$1.c, this.dt() + $$1.d, this.dx() + $$1.e);
      } else {
         this.aC = this.bN();
         if ($$0 == bmr.c) {
            $$1 = this.d($$1);
            if ($$1.equals(elt.b)) {
               return;
            }
         }

         this.dM().af().a("move");
         if (this.U.g() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = elt.b;
            this.g(elt.b);
         }

         $$1 = this.a($$1, $$0);
         elt $$2 = this.a($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ab != 0.0F && $$3 >= 1.0) {
               elp $$4 = this.dM().a(new csy(this.dk(), this.dk().e($$2), csy.a.d, csy.b.d, this));
               if ($$4.c() != elr.a.a) {
                  this.n();
               }
            }

            this.a_(this.dr() + $$2.c, this.dt() + $$2.d, this.dx() + $$2.e);
         }

         this.dM().af().c();
         this.dM().af().a("rest");
         boolean $$5 = !auo.b($$1.c, $$2.c);
         boolean $$6 = !auo.b($$1.e, $$2.e);
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
         djh $$8 = this.dM().a_($$7);
         this.a($$2.d, this.aC(), $$8, $$7);
         if (this.dH()) {
            this.dM().af().c();
         } else {
            if (this.P) {
               elt $$9 = this.dp();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            cwq $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dM(), this);
            }

            if (this.aC()) {
               $$10.a(this.dM(), $$7, $$8, this);
            }

            blv.b $$11 = this.aW();
            if ($$11.a() && !this.bO()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.aa = this.aa + (float)($$2.f() * 0.6);
               hx $$15 = this.aJ();
               djh $$16 = this.dM().a_($$15);
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
                        this.a(dnr.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aG();
               }
            }

            this.aD();
            float $$20 = this.aL();
            this.g(this.dp().d((double)$$20, 1.0, (double)$$20));
            if (this.dM().c(this.cH().h(1.0E-6)).noneMatch($$0x -> $$0x.a(ash.aJ) || $$0x.a(cws.H))) {
               if (this.aN <= 0) {
                  this.h(-this.dc());
               }

               if (this.aC && (this.aA || this.bb())) {
                  this.aE();
               }
            }

            if (this.bN() && (this.aA || this.bb())) {
               this.h(-this.dc());
            }

            this.dM().af().c();
         }
      }
   }

   private boolean c(djh $$0) {
      return $$0.a(ash.aO) || $$0.a(cws.qP);
   }

   private boolean a(hx $$0, djh $$1, boolean $$2, boolean $$3, elt $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aC() || $$5 || this.bX() && $$4.d == 0.0 || this.cf()) && !this.bZ()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dM().a(dnr.P, this.dk(), dnr.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(elt $$0) {
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
      this.a(ars.jB, 0.7F, 1.6F + (this.ag.i() - this.ag.i()) * 0.4F);
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
         if (this.aW().b()) {
            this.a(dnr.x);
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
            djh $$2 = this.dM().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(ash.S)) && !$$2.a(ash.L) && !($$2.b() instanceof czp) ? $$1.h(auo.a(this.u.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = auo.a(this.u.c);
         int $$4 = auo.a(this.u.d - (double)$$0);
         int $$5 = auo.a(this.u.e);
         return new hx($$3, $$4, $$5);
      }
   }

   protected float aK() {
      float $$0 = this.dM().a_(this.dm()).b().l();
      float $$1 = this.dM().a_(this.aI()).b().l();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aL() {
      djh $$0 = this.dM().a_(this.dm());
      float $$1 = $$0.b().j();
      if (!$$0.a(cws.G) && !$$0.a(cws.nd)) {
         return (double)$$1 == 1.0 ? this.dM().a_(this.aI()).b().j() : $$1;
      } else {
         return $$1;
      }
   }

   protected elt a(elt $$0, bmr $$1) {
      return $$0;
   }

   protected elt d(elt $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dM().X();
         if ($$1 != this.bg) {
            Arrays.fill(this.bf, 0.0);
            this.bg = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(ic.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? elt.b : new elt($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(ic.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? elt.b : new elt(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(ic.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? elt.b : new elt(0.0, 0.0, $$4);
         } else {
            return elt.b;
         }
      }
   }

   private double a(ic.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = auo.a($$1 + this.bf[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bf[$$2];
      this.bf[$$2] = $$3;
      return $$1;
   }

   private elt a(elt $$0) {
      elo $$1 = this.cH();
      List<emm> $$2 = this.dM().c(this, $$1.b($$0));
      elt $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dM(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.aC() || $$5 && $$0.d < 0.0;
      if (this.dG() > 0.0F && $$7 && ($$4 || $$6)) {
         elt $$8 = a(this, new elt($$0.c, (double)this.dG(), $$0.e), $$1, this.dM(), $$2);
         elt $$9 = a(this, new elt(0.0, (double)this.dG(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dM(), $$2);
         if ($$9.d < (double)this.dG()) {
            elt $$10 = a(this, new elt($$0.c, 0.0, $$0.e), $$1.c($$9), this.dM(), $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new elt(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.dM(), $$2));
         }
      }

      return $$3;
   }

   public static elt a(@Nullable blv $$0, elt $$1, elo $$2, ctp $$3, List<emm> $$4) {
      Builder<emm> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      dky $$6 = $$3.D_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.e($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static elt a(elt $$0, elo $$1, List<emm> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = emj.a(ic.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = emj.a(ic.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = emj.a(ic.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = emj.a(ic.a.c, $$1, $$2, $$5);
         }

         return new elt($$3, $$4, $$5);
      }
   }

   protected float aM() {
      return (float)((int)this.Z + 1);
   }

   protected arr aN() {
      return ars.jF;
   }

   protected arr aO() {
      return ars.jE;
   }

   protected arr aP() {
      return ars.jE;
   }

   protected void aQ() {
      elo $$0 = this.cH();
      hx $$1 = hx.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      hx $$2 = hx.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dM().a($$1, $$2)) {
         hx.a $$3 = new hx.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bx()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  djh $$7 = this.dM().a_($$3);

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

   protected void a(djh $$0) {
   }

   public void a(dnr $$0, @Nullable blv $$1) {
      this.dM().a($$1, $$0, this.u);
   }

   public void a(dnr $$0) {
      this.a($$0, this);
   }

   private void c(hx $$0, djh $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.s();
      }
   }

   protected void aR() {
      blv $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      elt $$2 = $$0.dp();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected hx e(hx $$0) {
      hx $$1 = $$0.c();
      djh $$2 = this.dM().a_($$1);
      return !$$2.a(ash.bm) && !$$2.a(ash.bn) ? $$0 : $$1;
   }

   protected void a(djh $$0, djh $$1) {
      dec $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(djh $$0) {
      dec $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(hx $$0, djh $$1) {
      dec $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(djh $$0) {
      return $$0.a(ash.bl) && this.ah >= this.bl + 20;
   }

   private void s() {
      this.bk = this.bk * (float)Math.pow(0.997, (double)(this.ah - this.bl));
      this.bk = Math.min(1.0F, this.bk + 0.07F);
      float $$0 = 0.5F + this.bk * this.ag.i() * 1.2F;
      float $$1 = 0.1F + this.bk * 1.2F;
      this.a(ars.E, $$1, $$0);
      this.bl = this.ah;
   }

   protected void e(float $$0) {
      this.a(this.aN(), $$0, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
   }

   protected void aS() {
   }

   protected boolean aT() {
      return false;
   }

   public void a(arr $$0, float $$1, float $$2) {
      if (!this.aU()) {
         this.dM().a(null, this.dr(), this.dt(), this.dx(), $$0, this.db(), $$1, $$2);
      }
   }

   public void a(arr $$0) {
      if (!this.aU()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean aU() {
      return this.an.b(aW);
   }

   public void d(boolean $$0) {
      this.an.b(aW, $$0);
   }

   public boolean aV() {
      return this.an.b(aX);
   }

   public void e(boolean $$0) {
      this.an.b(aX, $$0);
   }

   protected blv.b aW() {
      return blv.b.d;
   }

   public boolean aX() {
      return false;
   }

   protected void a(double $$0, boolean $$1, djh $$2, hx $$3) {
      if ($$1) {
         if (this.ab > 0.0F) {
            $$2.b().a(this.dM(), $$2, $$3, this, this.ab);
            this.dM().a(dnr.A, this.u, dnr.a.a(this, this.aD.<djh>map($$0x -> this.dM().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ab -= (float)$$0;
      }
   }

   public boolean aY() {
      return this.ai().d();
   }

   public boolean a(float $$0, float $$1, bkt $$2) {
      if (this.p.a(ask.o)) {
         return false;
      } else {
         if (this.bP()) {
            for (blv $$3 : this.cP()) {
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
      hx $$0 = this.dm();
      return this.dM().r($$0) || this.dM().r(hx.a((double)$$0.u(), this.cH().e, (double)$$0.w()));
   }

   private boolean x() {
      return this.dM().a_(this.dm()).a(cws.nd);
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
         this.h(this.bY() && this.be() && !this.bO() && this.dM().b_(this.v).a(asm.a));
      }
   }

   protected boolean bg() {
      this.aj.clear();
      this.bh();
      double $$0 = this.dM().E_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(asm.b, $$0);
      return this.aZ() || $$1;
   }

   void bh() {
      if (this.cZ() instanceof chc $$0 && !$$0.be()) {
         this.ai = false;
         return;
      }

      if (this.a(asm.a, 0.014)) {
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
      this.ak = this.a(asm.a);
      this.aO.clear();
      double $$0 = this.dv() - 0.11111111F;
      if (this.cZ() instanceof chc $$2 && !$$2.be() && $$2.cH().e >= $$0 && $$2.cH().b <= $$0) {
         return;
      }

      hx $$3 = hx.a(this.dr(), $$0, this.dx());
      eer $$4 = this.dM().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((csv)this.dM(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aO::add);
      }
   }

   protected void bi() {
      blv $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      elt $$2 = $$0.dp();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aO(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      } else {
         this.a(this.aP(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      }

      float $$4 = (float)auo.a(this.dt());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bh.a * 20.0F; $$5++) {
         double $$6 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         double $$7 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         this.dM().a(jx.e, this.dr() + $$6, (double)($$4 + 1.0F), this.dx() + $$7, $$2.c, $$2.d - this.ag.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bh.a * 20.0F; $$8++) {
         double $$9 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         double $$10 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         this.dM().a(jx.aj, this.dr() + $$9, (double)($$4 + 1.0F), this.dx() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(dnr.O);
   }

   @Deprecated
   protected djh bj() {
      return this.dM().a_(this.aH());
   }

   public djh bk() {
      return this.dM().a_(this.aJ());
   }

   public boolean bl() {
      return this.bY() && !this.aZ() && !this.P_() && !this.bX() && !this.bn() && this.bx();
   }

   protected void bm() {
      hx $$0 = this.aH();
      djh $$1 = this.dM().a_($$0);
      if ($$1.l() != dcv.a) {
         elt $$2 = this.dp();
         hx $$3 = this.dm();
         double $$4 = this.dr() + (this.ag.j() - 0.5) * (double)this.bh.a;
         double $$5 = this.dx() + (this.ag.j() - 0.5) * (double)this.bh.a;
         if ($$3.u() != $$0.u()) {
            $$4 = auo.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = auo.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dM().a(new jp(jx.c, $$1), $$4, this.dt() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(asw<eeq> $$0) {
      return this.aO.contains($$0);
   }

   public boolean bn() {
      return !this.am && this.aj.getDouble(asm.b) > 0.0;
   }

   public void a(float $$0, elt $$1) {
      elt $$2 = a($$1, $$0, this.dC());
      this.g(this.dp().e($$2));
   }

   private static elt a(elt $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return elt.b;
      } else {
         elt $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = auo.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = auo.b($$2 * (float) (Math.PI / 180.0));
         return new elt($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bo() {
      return this.dM().f(this.dq(), this.dw()) ? this.dM().x(hx.a(this.dr(), this.dv(), this.dx())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.r($$3 % 360.0F);
      this.s(auo.a($$4, -90.0F, 90.0F) % 360.0F);
      this.N = this.dC();
      this.O = this.dE();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = auo.a($$0, -3.0E7, 3.0E7);
      double $$4 = auo.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(elt $$0) {
      this.e($$0.c, $$0.d, $$0.e);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dC(), this.dE());
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

   public float e(blv $$0) {
      float $$1 = (float)(this.dr() - $$0.dr());
      float $$2 = (float)(this.dt() - $$0.dt());
      float $$3 = (float)(this.dx() - $$0.dx());
      return auo.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dr() - $$0;
      double $$4 = this.dt() - $$1;
      double $$5 = this.dx() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double f(blv $$0) {
      return this.f($$0.dk());
   }

   public double f(elt $$0) {
      double $$1 = this.dr() - $$0.c;
      double $$2 = this.dt() - $$0.d;
      double $$3 = this.dx() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cfi $$0) {
   }

   public void g(blv $$0) {
      if (!this.y($$0)) {
         if (!$$0.af && !this.af) {
            double $$1 = $$0.dr() - this.dr();
            double $$2 = $$0.dx() - this.dx();
            double $$3 = auo.a($$1, $$2);
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
      this.g(this.dp().b($$0, $$1, $$2));
      this.au = true;
   }

   protected void bq() {
      this.T = true;
   }

   public boolean a(bkt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bq();
         return false;
      }
   }

   public final elt f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dE() : auo.i($$0, this.O, this.dE());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dC() : auo.i($$0, this.N, this.dC());
   }

   protected final elt b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = auo.b($$3);
      float $$5 = auo.a($$3);
      float $$6 = auo.b($$2);
      float $$7 = auo.a($$2);
      return new elt((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final elt i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final elt c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final elt br() {
      return new elt(this.dr(), this.dv(), this.dx());
   }

   public final elt j(float $$0) {
      double $$1 = auo.d((double)$$0, this.K, this.dr());
      double $$2 = auo.d((double)$$0, this.L, this.dt()) + (double)this.cI();
      double $$3 = auo.d((double)$$0, this.M, this.dx());
      return new elt($$1, $$2, $$3);
   }

   public elt k(float $$0) {
      return this.j($$0);
   }

   public final elt l(float $$0) {
      double $$1 = auo.d((double)$$0, this.K, this.dr());
      double $$2 = auo.d((double)$$0, this.L, this.dt());
      double $$3 = auo.d((double)$$0, this.M, this.dx());
      return new elt($$1, $$2, $$3);
   }

   public elr a(double $$0, float $$1, boolean $$2) {
      elt $$3 = this.j($$1);
      elt $$4 = this.f($$1);
      elt $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dM().a(new csy($$3, $$5, csy.a.b, $$2 ? csy.b.c : csy.b.a, this));
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

   public void a(blv $$0, int $$1, bkt $$2) {
      if ($$0 instanceof ane) {
         am.d.a((ane)$$0, this, $$2);
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

      $$1 *= 64.0 * o;
      return $$0 < $$1 * $$1;
   }

   public boolean d(sn $$0) {
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

   public boolean e(sn $$0) {
      return this.bO() ? false : this.d($$0);
   }

   public sn f(sn $$0) {
      try {
         if (this.s != null) {
            $$0.a("Pos", this.a(this.s.dr(), this.dt(), this.s.dx()));
         } else {
            $$0.a("Pos", this.a(this.dr(), this.dt(), this.dx()));
         }

         elt $$1 = this.dp();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dC(), this.dE()));
         $$0.a("FallDistance", this.ab);
         $$0.a("Fire", (short)this.aN);
         $$0.a("Air", (short)this.ci());
         $$0.a("OnGround", this.aC());
         $$0.a("Invulnerable", this.bc);
         $$0.a("PortalCooldown", this.bb);
         $$0.a("UUID", this.cw());
         vf $$2 = this.af();
         if ($$2 != null) {
            $$0.a("CustomName", vf.a.a($$2));
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
            st $$4 = new st();

            for (String $$5 : this.be) {
               $$4.add(ti.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bP()) {
            st $$6 = new st();

            for (blv $$7 : this.cP()) {
               sn $$8 = new sn();
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

   public void g(sn $$0) {
      try {
         st $$1 = $$0.c("Pos", 6);
         st $$2 = $$0.c("Motion", 6);
         st $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(auo.a($$1.h(0), -3.0000512E7, 3.0000512E7), auo.a($$1.h(1), -2.0E7, 2.0E7), auo.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.r($$3.i(0));
         this.s($$3.i(1));
         this.bp();
         this.n(this.dC());
         this.o(this.dC());
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

         if (!Double.isFinite(this.dr()) || !Double.isFinite(this.dt()) || !Double.isFinite(this.dx())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dC()) && Double.isFinite((double)this.dE())) {
            this.ar();
            this.a(this.dC(), this.dE());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(vf.a.a($$8));
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
               st $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.be.add($$10.j($$12));
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
      blz<?> $$0 = this.ai();
      ahg $$1 = blz.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(sn var1);

   protected abstract void b(sn var1);

   protected st a(double... $$0) {
      st $$1 = new st();

      for (double $$2 : $$0) {
         $$1.add(so.a($$2));
      }

      return $$1;
   }

   protected st a(float... $$0) {
      st $$1 = new st();

      for (float $$2 : $$0) {
         $$1.add(sq.a($$2));
      }

      return $$1;
   }

   @Nullable
   public cbu a(cto $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public cbu a(cto $$0, int $$1) {
      return this.a(new cmy($$0), (float)$$1);
   }

   @Nullable
   public cbu b(cmy $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public cbu a(cmy $$0, float $$1) {
      if ($$0.b()) {
         return null;
      } else if (this.dM().B) {
         return null;
      } else {
         cbu $$2 = new cbu(this.dM(), this.dr(), this.dt() + (double)$$1, this.dx(), $$0);
         $$2.u();
         this.dM().b($$2);
         return $$2;
      }
   }

   public boolean bx() {
      return !this.dH();
   }

   public boolean by() {
      if (this.af) {
         return false;
      } else {
         float $$0 = this.bh.a * 0.8F;
         elo $$1 = elo.a(this.br(), (double)$$0, 1.0E-6, (double)$$0);
         return hx.a($$1)
            .anyMatch(
               $$1x -> {
                  djh $$2 = this.dM().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dM(), $$1x)
                     && emj.c($$2.k(this.dM(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), emj.a($$1), elx.i);
               }
            );
      }
   }

   public bkb a(cfi $$0, bka $$1) {
      return bkb.d;
   }

   public boolean h(blv $$0) {
      return $$0.bz() && !this.y($$0);
   }

   public boolean bz() {
      return false;
   }

   public void t() {
      this.g(elt.b);
      this.l();
      if (this.bO()) {
         this.cZ().i(this);
      }
   }

   public final void i(blv $$0) {
      if (this.x($$0)) {
         this.a($$0, blv::a_);
      }
   }

   protected void a(blv $$0, blv.a $$1) {
      elt $$2 = this.m($$0);
      $$1.accept($$0, $$2.c, $$2.d + (double)$$0.k(this), $$2.e);
   }

   public void j(blv $$0) {
   }

   public float k(blv $$0) {
      return this.l($$0);
   }

   protected float l(blv $$0) {
      return 0.0F;
   }

   public elt m(blv $$0) {
      return new elt(this.a($$0, this.bh, 1.0F).rotateY(-this.aG * (float) (Math.PI / 180.0))).e(this.dk());
   }

   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   public boolean n(blv $$0) {
      return this.a($$0, false);
   }

   public boolean bA() {
      return this instanceof bml;
   }

   public boolean a(blv $$0, boolean $$1) {
      if ($$0 == this.s) {
         return false;
      } else if (!$$0.bD()) {
         return false;
      } else {
         for (blv $$2 = $$0; $$2.s != null; $$2 = $$2.s) {
            if ($$2.s == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bO()) {
               this.ac();
            }

            this.b(bmx.a);
            this.s = $$0;
            this.s.p(this);
            $$0.B().filter($$0x -> $$0x instanceof ane).forEach($$0x -> am.S.a((ane)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(blv $$0) {
      return !this.bS() && this.J <= 0;
   }

   public void bB() {
      for (int $$0 = this.r.size() - 1; $$0 >= 0; $$0--) {
         ((blv)this.r.get($$0)).ac();
      }
   }

   public void bC() {
      if (this.s != null) {
         blv $$0 = this.s;
         this.s = null;
         $$0.q(this);
      }
   }

   public void ac() {
      this.bC();
   }

   protected void p(blv $$0) {
      if ($$0.cZ() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.r.isEmpty()) {
            this.r = ImmutableList.of($$0);
         } else {
            List<blv> $$1 = Lists.newArrayList(this.r);
            if (!this.dM().B && $$0 instanceof cfi && !(this.cQ() instanceof cfi)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.r = ImmutableList.copyOf($$1);
         }

         this.a(dnr.s, $$0);
      }
   }

   protected void q(blv $$0) {
      if ($$0.cZ() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.r.size() == 1 && this.r.get(0) == $$0) {
            this.r = ImmutableList.of();
         } else {
            this.r = this.r.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(dnr.q, $$0);
      }
   }

   protected boolean r(blv $$0) {
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
      return this.dr();
   }

   public double N_() {
      return this.dt();
   }

   public double O_() {
      return this.dx();
   }

   public float f_() {
      return this.dE();
   }

   public float q_() {
      return this.dC();
   }

   public void a(float $$0, int $$1) {
      this.n($$0);
   }

   public float bE() {
      return 0.0F;
   }

   public elt bF() {
      return this.b(this.dE(), this.dC());
   }

   public elt a(cmt $$0) {
      if (!(this instanceof cfi $$1)) {
         return elt.b;
      } else {
         boolean $$2 = $$1.eU().a($$0) && !$$1.eT().a($$0);
         bmf $$3 = $$2 ? $$1.fm().e() : $$1.fm();
         return this.b(0.0F, this.dC() + (float)($$3 == bmf.b ? 80 : -80)).a(0.5);
      }
   }

   public els bG() {
      return new els(this.dE(), this.dC());
   }

   public elt bH() {
      return elt.a(this.bG());
   }

   public void f(hx $$0) {
      if (this.aw()) {
         this.au();
      } else {
         if (!this.dM().B && !$$0.equals(this.ax)) {
            this.ax = $$0.i();
         }

         this.av = true;
      }
   }

   protected void bI() {
      if (this.dM() instanceof and) {
         int $$0 = this.ax();
         and $$1 = (and)this.dM();
         if (this.av) {
            MinecraftServer $$2 = $$1.o();
            ahf<ctp> $$3 = this.dM().ae() == ctp.i ? ctp.h : ctp.i;
            and $$4 = $$2.a($$3);
            if ($$4 != null && $$2.D() && !this.bO() && this.aw++ >= $$0) {
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

   public int bJ() {
      return 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
   }

   public void c(bkt $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            daj.a(this);
      }
   }

   public void m(float $$0) {
   }

   public Iterable<cmy> bK() {
      return e;
   }

   public Iterable<cmy> bL() {
      return e;
   }

   public Iterable<cmy> bM() {
      return Iterables.concat(this.bK(), this.bL());
   }

   public void a(bma $$0, cmy $$1) {
   }

   public boolean bN() {
      boolean $$0 = this.dM() != null && this.dM().B;
      return !this.aY() && (this.aN > 0 || $$0 && this.i(0));
   }

   public boolean bO() {
      return this.cZ() != null;
   }

   public boolean bP() {
      return !this.r.isEmpty();
   }

   public boolean bQ() {
      return this.ai().a(ask.p);
   }

   public boolean bR() {
      return !this.ai().a(ask.q);
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
      return this.c(bmx.f);
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
      return this.c(bmx.d);
   }

   public boolean cb() {
      return this.ca() && !this.aZ();
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
      return this.dM().y_() ? this.i(6) : this.bd;
   }

   public boolean ce() {
      return this.i(5);
   }

   public boolean d(cfi $$0) {
      if ($$0.P_()) {
         return false;
      } else {
         emz $$1 = this.cg();
         return $$1 != null && $$0 != null && $$0.cg() == $$1 && $$1.i() ? false : this.ce();
      }
   }

   public boolean cf() {
      return false;
   }

   public void a(BiConsumer<dno<?>, and> $$0) {
   }

   @Nullable
   public ems cg() {
      return this.dM().K().e(this.cy());
   }

   public boolean s(blv $$0) {
      return this.a($$0.cg());
   }

   public boolean a(emz $$0) {
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

   public void a(and $$0, bmk $$1) {
      this.h(this.aN + 1);
      if (this.aN == 0) {
         this.g(8);
      }

      this.a(this.dN().b(), 5.0F);
   }

   public void k(boolean $$0) {
      elt $$1 = this.dp();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void l(boolean $$0) {
      elt $$1 = this.dp();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(and $$0, bml $$1) {
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
      hx $$3 = hx.a($$0, $$1, $$2);
      elt $$4 = new elt($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      hx.a $$5 = new hx.a();
      ic $$6 = ic.b;
      double $$7 = Double.MAX_VALUE;

      for (ic $$8 : new ic[]{ic.c, ic.d, ic.e, ic.f, ic.b}) {
         $$5.a($$3, $$8);
         if (!this.dM().a_($$5).r(this.dM(), $$5)) {
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
      elt $$13 = this.dp().a(0.75);
      if ($$6.o() == ic.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == ic.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == ic.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(djh $$0, elt $$1) {
      this.n();
      this.U = $$1;
   }

   private static vf c(vf $$0) {
      vt $$1 = $$0.e().b($$0.a().a(null));

      for (vf $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public vf ad() {
      vf $$0 = this.af();
      return $$0 != null ? c($$0) : this.co();
   }

   protected vf co() {
      return this.p.h();
   }

   public boolean t(blv $$0) {
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

   public boolean u(blv $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dM() == null ? "~NULL~" : this.dM().toString();
      return this.aK != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.ad().getString(),
            this.q,
            $$0,
            this.dr(),
            this.dt(),
            this.dx(),
            this.aK
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.ad().getString(),
            this.q,
            $$0,
            this.dr(),
            this.dt(),
            this.dx()
         );
   }

   public boolean b(bkt $$0) {
      return this.dH() || this.bc && !$$0.a(asj.e) && !$$0.g() || $$0.a(asj.j) && this.aY() || $$0.a(asj.n) && this.ai().a(ask.o);
   }

   public boolean cr() {
      return this.bc;
   }

   public void m(boolean $$0) {
      this.bc = $$0;
   }

   public void v(blv $$0) {
      this.b($$0.dr(), $$0.dt(), $$0.dx(), $$0.dC(), $$0.dE());
   }

   public void w(blv $$0) {
      sn $$1 = $$0.f(new sn());
      $$1.r("Dimension");
      this.g($$1);
      this.bb = $$0.bb;
      this.ax = $$0.ax;
   }

   @Nullable
   public blv b(and $$0) {
      if (this.dM() instanceof and && !this.dH()) {
         this.dM().af().a("changeDimension");
         this.ag();
         this.dM().af().a("reposition");
         efo $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dM().af().b("reloading");
            blv $$2 = this.ai().a((ctp)$$0);
            if ($$2 != null) {
               $$2.w(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dE());
               $$2.g($$1.b);
               $$0.d($$2);
               if ($$0.ae() == ctp.j) {
                  and.a($$0);
               }
            }

            this.cs();
            this.dM().af().c();
            ((and)this.dM()).h();
            $$0.h();
            this.dM().af().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void cs() {
      this.b(blv.c.e);
   }

   @Nullable
   protected efo a(and $$0) {
      boolean $$1 = this.dM().ae() == ctp.j && $$0.ae() == ctp.h;
      boolean $$2 = $$0.ae() == ctp.j;
      if (!$$1 && !$$2) {
         boolean $$5 = $$0.ae() == ctp.i;
         if (this.dM().ae() != ctp.i && !$$5) {
            return null;
         } else {
            dky $$6 = $$0.D_();
            double $$7 = dmq.a(this.dM().E_(), $$0.E_());
            hx $$8 = $$6.b(this.dr() * $$7, this.dt(), this.dx() * $$7);
            return this.a($$0, $$8, $$5, $$6).map($$1x -> {
               djh $$2x = this.dM().a_(this.ax);
               ic.a $$3;
               elt $$5x;
               if ($$2x.b(djx.H)) {
                  $$3 = $$2x.c(djx.H);
                  l.a $$4 = l.a(this.ax, $$3, 21, ic.a.b, 21, $$1xx -> this.dM().a_($$1xx) == $$2x);
                  $$5x = this.a($$3, $$4);
               } else {
                  $$3 = ic.a.a;
                  $$5x = new elt(0.5, 0.0, 0.0);
               }

               return efp.a($$0, $$1x, $$3, $$5x, this, this.dp(), this.dC(), this.dE());
            }).orElse(null);
         }
      } else {
         hx $$3;
         if ($$2) {
            $$3 = and.a;
         } else {
            $$3 = $$0.a(doq.a.f, $$0.T());
         }

         return new efo(new elt((double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5), this.dp(), this.dC(), this.dE());
      }
   }

   protected elt a(ic.a $$0, l.a $$1) {
      return efp.a($$1, $$0, this.dk(), this.a(this.ap()));
   }

   protected Optional<l.a> a(and $$0, hx $$1, boolean $$2, dky $$3) {
      return $$0.p().a($$1, $$2, $$3);
   }

   public boolean ct() {
      return !this.bO() && !this.bP();
   }

   public float a(cth $$0, csv $$1, hx $$2, djh $$3, eer $$4, float $$5) {
      return $$5;
   }

   public boolean a(cth $$0, csv $$1, hx $$2, djh $$3, float $$4) {
      return true;
   }

   public int cu() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> blz.a(this.ai()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.q);
      $$0.a("Entity Name", () -> this.ad().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dr(), this.dt(), this.dx()));
      $$0.a("Entity's Block location", p.a(this.dM(), auo.a(this.dr()), auo.a(this.dt()), auo.a(this.dx())));
      elt $$1 = this.dp();
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
   public vf Q_() {
      return ems.a(this.cg(), this.ad()).a($$0 -> $$0.a(this.cG()).a(this.cx()));
   }

   public void b(@Nullable vf $$0) {
      this.an.b(aU, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public vf af() {
      return this.an.b(aU).orElse(null);
   }

   @Override
   public boolean ae() {
      return this.an.b(aU).isPresent();
   }

   public void n(boolean $$0) {
      this.an.b(aV, $$0);
   }

   public boolean cB() {
      return this.an.b(aV);
   }

   public final void n(double $$0, double $$1, double $$2) {
      if (this.dM() instanceof and) {
         csw $$3 = new csw(hx.a($$0, $$1, $$2));
         ((and)this.dM()).l().a(ani.g, $$3, 0, this.aj());
         this.dM().d($$3.e, $$3.f);
         this.c($$0, $$1, $$2);
      }
   }

   public boolean a(and $$0, double $$1, double $$2, double $$3, Set<bmz> $$4, float $$5, float $$6) {
      float $$7 = auo.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dM()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.z();
         this.n($$5);
      } else {
         this.ag();
         blv $$8 = this.ai().a((ctp)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(blv.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dM() instanceof and) {
         this.b($$0, $$1, $$2, this.dC(), this.dE());
         this.z();
      }
   }

   private void z() {
      this.cR().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.r.iterator();

         while (var1.hasNext()) {
            blv $$1 = (blv)var1.next();
            $$0.a($$1, blv::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.dr() + $$0, this.dt() + $$1, this.dx() + $$2);
   }

   public boolean cC() {
      return this.cB();
   }

   public void b(List<agp.b<?>> $$0) {
   }

   public void a(agm<?> $$0) {
      if (as.equals($$0)) {
         this.k_();
      }
   }

   @Deprecated
   protected void cD() {
      bmx $$0 = this.ap();
      blw $$1 = this.a($$0);
      this.bh = $$1;
      this.bi = this.a($$0, $$1);
   }

   public void k_() {
      blw $$0 = this.bh;
      bmx $$1 = this.ap();
      blw $$2 = this.a($$1);
      this.bh = $$2;
      this.bi = this.a($$1, $$2);
      this.ar();
      boolean $$3 = (double)$$2.a <= 4.0 && (double)$$2.b <= 4.0;
      if (!this.dM().B && !this.am && !this.af && $$3 && ($$2.a > $$0.a || $$2.b > $$0.b) && !(this instanceof cfi)) {
         elt $$4 = this.dk().b(0.0, (double)$$0.b / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a - $$0.a) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b - $$0.b) + 1.0E-6;
         emm $$7 = emj.a(elo.a($$4, $$5, $$6, $$5));
         this.dM().a(this, $$7, $$4, (double)$$2.a, (double)$$2.b, (double)$$2.a).ifPresent($$1x -> this.b($$1x.b(0.0, (double)(-$$2.b) / 2.0, 0.0)));
      }
   }

   public ic cE() {
      return ic.a((double)this.dC());
   }

   public ic cF() {
      return this.cE();
   }

   protected vl cG() {
      return new vl(vl.a.c, new vl.b(this.ai(), this.cw(), this.ad()));
   }

   public boolean a(ane $$0) {
      return true;
   }

   @Override
   public final elo cH() {
      return this.aI;
   }

   public elo i_() {
      return this.cH();
   }

   public final void a(elo $$0) {
      this.aI = $$0;
   }

   protected float a(bmx $$0, blw $$1) {
      return $$1.b * 0.85F;
   }

   public float d(bmx $$0) {
      return this.a($$0, this.a($$0));
   }

   public final float cI() {
      return this.bi;
   }

   public elt p(float $$0) {
      return this.cJ();
   }

   protected elt cJ() {
      return new elt(0.0, (double)this.cI(), (double)(this.dg() * 0.4F));
   }

   public bnd a_(int $$0) {
      return bnd.b;
   }

   @Override
   public void a(vf $$0) {
   }

   public ctp cK() {
      return this.dM();
   }

   @Nullable
   public MinecraftServer cL() {
      return this.dM().o();
   }

   public bkb a(cfi $$0, elt $$1, bka $$2) {
      return bkb.d;
   }

   public boolean a(cth $$0) {
      return false;
   }

   public void a(bml $$0, blv $$1) {
      if ($$1 instanceof bml) {
         crl.a((bml)$$1, $$0);
      }

      crl.b($$0, $$1);
   }

   public void c(ane $$0) {
   }

   public void d(ane $$0) {
   }

   public float a(ddc $$0) {
      float $$1 = auo.g(this.dC());
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

   public float a(dbm $$0) {
      float $$1 = auo.g(this.dC());
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
   public bml cN() {
      return null;
   }

   public final boolean cO() {
      return this.cN() != null;
   }

   public final List<blv> cP() {
      return this.r;
   }

   @Nullable
   public blv cQ() {
      return this.r.isEmpty() ? null : (blv)this.r.get(0);
   }

   public boolean x(blv $$0) {
      return this.r.contains($$0);
   }

   public boolean a(Predicate<blv> $$0) {
      UnmodifiableIterator var2 = this.r.iterator();

      while (var2.hasNext()) {
         blv $$1 = (blv)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<blv> B() {
      return this.r.stream().flatMap(blv::cR);
   }

   @Override
   public Stream<blv> cR() {
      return Stream.concat(Stream.of(this), this.B());
   }

   @Override
   public Stream<blv> cS() {
      return Stream.concat(this.r.stream().flatMap(blv::cS), Stream.of(this));
   }

   public Iterable<blv> cT() {
      return () -> this.B().iterator();
   }

   public int cU() {
      return (int)this.B().filter($$0 -> $$0 instanceof cfi).count();
   }

   public boolean cV() {
      return this.cU() == 1;
   }

   public blv cW() {
      blv $$0 = this;

      while ($$0.bO()) {
         $$0 = $$0.cZ();
      }

      return $$0;
   }

   public boolean y(blv $$0) {
      return this.cW() == $$0.cW();
   }

   public boolean z(blv $$0) {
      if (!$$0.bO()) {
         return false;
      } else {
         blv $$1 = $$0.cZ();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean cX() {
      return this.cN() instanceof cfi $$0 ? $$0.g() : this.cY();
   }

   public boolean cY() {
      return !this.dM().B;
   }

   protected static elt a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -auo.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = auo.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new elt((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public elt b(bml $$0) {
      return new elt(this.dr(), this.cH().e, this.dx());
   }

   @Nullable
   public blv cZ() {
      return this.s;
   }

   @Nullable
   public blv da() {
      return this.s != null && this.s.cN() == this ? this.s : null;
   }

   public eew s_() {
      return eew.a;
   }

   public art db() {
      return art.g;
   }

   protected int dc() {
      return 1;
   }

   public ds dd() {
      return new ds(
         this, this.dk(), this.bG(), this.dM() instanceof and ? (and)this.dM() : null, this.F(), this.ad().getString(), this.Q_(), this.dM().o(), this
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
      return this.dM().Z().b(ctl.p);
   }

   @Override
   public boolean x_() {
      return true;
   }

   @Override
   public boolean W_() {
      return true;
   }

   public void a(ee.a $$0, elt $$1) {
      elt $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.s(auo.g((float)(-(auo.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.r(auo.g((float)(auo.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dC());
      this.O = this.dE();
      this.N = this.dC();
   }

   public boolean a(asw<eeq> $$0, double $$1) {
      if (this.de()) {
         return false;
      } else {
         elo $$2 = this.cH().h(0.001);
         int $$3 = auo.a($$2.a);
         int $$4 = auo.c($$2.d);
         int $$5 = auo.a($$2.b);
         int $$6 = auo.c($$2.e);
         int $$7 = auo.a($$2.c);
         int $$8 = auo.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cz();
         boolean $$11 = false;
         elt $$12 = elt.b;
         int $$13 = 0;
         hx.a $$14 = new hx.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  eer $$18 = this.dM().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((csv)this.dM(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           elt $$20 = $$18.c(this.dM(), $$14);
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

            if (!(this instanceof cfi)) {
               $$12 = $$12.d();
            }

            elt $$21 = this.dp();
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
      elo $$0 = this.cH().g(1.0);
      int $$1 = auo.a($$0.a);
      int $$2 = auo.c($$0.d);
      int $$3 = auo.a($$0.c);
      int $$4 = auo.c($$0.f);
      return !this.dM().b($$1, $$3, $$2, $$4);
   }

   public double b(asw<eeq> $$0) {
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

   public xf<za> dj() {
      return new zb(this);
   }

   public blw a(bmx $$0) {
      return this.p.n();
   }

   public elt dk() {
      return this.u;
   }

   public elt dl() {
      return this.dk();
   }

   @Override
   public hx dm() {
      return this.v;
   }

   public djh dn() {
      if (this.bn == null) {
         this.bn = this.dM().a_(this.dm());
      }

      return this.bn;
   }

   public csw do() {
      return this.aE;
   }

   public elt dp() {
      return this.aF;
   }

   public void g(elt $$0) {
      this.aF = $$0;
   }

   public void h(elt $$0) {
      this.g(this.dp().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.g(new elt($$0, $$1, $$2));
   }

   public final int dq() {
      return this.v.u();
   }

   public final double dr() {
      return this.u.c;
   }

   public double c(double $$0) {
      return this.u.c + (double)this.dg() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ag.j() - 1.0) * $$0);
   }

   public final int ds() {
      return this.v.v();
   }

   public final double dt() {
      return this.u.d;
   }

   public double e(double $$0) {
      return this.u.d + (double)this.dh() * $$0;
   }

   public double du() {
      return this.e(this.ag.j());
   }

   public double dv() {
      return this.u.d + (double)this.bi;
   }

   public final int dw() {
      return this.v.w();
   }

   public final double dx() {
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
         this.u = new elt($$0, $$1, $$2);
         int $$3 = auo.a($$0);
         int $$4 = auo.a($$1);
         int $$5 = auo.a($$2);
         if ($$3 != this.v.u() || $$4 != this.v.v() || $$5 != this.v.w()) {
            this.v = new hx($$3, $$4, $$5);
            this.bn = null;
            if (iz.a($$3) != this.aE.e || iz.a($$5) != this.aE.f) {
               this.aE = new csw(this.v);
            }
         }

         this.aZ.a();
      }
   }

   public void dy() {
   }

   public elt q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bi * 0.7, 0.0);
   }

   public void a(zb $$0) {
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
   public cmy dz() {
      return null;
   }

   public void o(boolean $$0) {
      this.aA = $$0;
   }

   public boolean dA() {
      return !this.ai().a(ask.k);
   }

   public boolean dB() {
      return (this.aA || this.aB) && this.dA();
   }

   public float dC() {
      return this.aG;
   }

   public float dD() {
      return this.dC();
   }

   public void r(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aG = $$0;
      }
   }

   public float dE() {
      return this.aH;
   }

   public void s(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aH = $$0;
      }
   }

   public boolean dF() {
      return false;
   }

   public float dG() {
      return this.aM;
   }

   public void t(float $$0) {
      this.aM = $$0;
   }

   public final boolean dH() {
      return this.aK != null;
   }

   @Nullable
   public blv.c dI() {
      return this.aK;
   }

   @Override
   public final void b(blv.c $$0) {
      if (this.aK == null) {
         this.aK = $$0;
      }

      if (this.aK.a()) {
         this.ac();
      }

      this.cP().forEach(blv::ac);
      this.aZ.a($$0);
   }

   protected void dJ() {
      this.aK = null;
   }

   @Override
   public void a(dmz $$0) {
      this.aZ = $$0;
   }

   @Override
   public boolean dK() {
      if (this.aK != null && !this.aK.b()) {
         return false;
      } else {
         return this.bO() ? false : !this.bP() || !this.cV();
      }
   }

   @Override
   public boolean dL() {
      return false;
   }

   public boolean a(ctp $$0, hx $$1) {
      return true;
   }

   public ctp dM() {
      return this.t;
   }

   protected void a(ctp $$0) {
      this.t = $$0;
   }

   public bku dN() {
      return this.dM().ai();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = auo.d($$6, this.dr(), $$1);
      double $$8 = auo.d($$6, this.dt(), $$2);
      double $$9 = auo.d($$6, this.dx(), $$3);
      float $$10 = (float)auo.e($$6, (double)this.dC(), $$4);
      float $$11 = (float)auo.d($$6, (double)this.dE(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   @FunctionalInterface
   public interface a {
      void accept(blv var1, double var2, double var4, double var6);
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
