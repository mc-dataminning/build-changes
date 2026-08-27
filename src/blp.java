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

public abstract class blp implements bjz, dmr, dr, emp {
   private static final Logger c = LogUtils.getLogger();
   public static final String w = "id";
   public static final String x = "Passengers";
   private static final AtomicInteger d = new AtomicInteger();
   private static final List<cmr> e = Collections.emptyList();
   public static final int y = 60;
   public static final int z = 300;
   public static final int A = 1024;
   public static final float B = 0.2F;
   public static final double C = 0.500001;
   public static final double D = 0.999999;
   public static final float E = 0.11111111F;
   public static final int F = 140;
   public static final int G = 40;
   private static final elh k = new elh(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double l = 0.014;
   private static final double m = 0.007;
   private static final double n = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double o = 1.0;
   private final blt<?> p;
   private int q = d.incrementAndGet();
   public boolean I;
   private ImmutableList<blp> r = ImmutableList.of();
   protected int J;
   @Nullable
   private blp s;
   private cti t;
   public double K;
   public double L;
   public double M;
   private elm u;
   private hx v;
   private csp aE;
   private elm aF = elm.b;
   private float aG;
   private float aH;
   public float N;
   public float O;
   private elh aI = k;
   private boolean aJ;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected elm U = elm.b;
   @Nullable
   private blp.c aK;
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
   protected final aup ag = aup.a();
   public int ah;
   private int aN = -this.dc();
   protected boolean ai;
   protected Object2DoubleMap<asq<eej>> aj = new Object2DoubleArrayMap(2);
   protected boolean ak;
   private final Set<asq<eej>> aO = new HashSet<>();
   public int al;
   protected boolean am = true;
   protected final agm an;
   protected static final agj<Byte> ao = agm.a(blp.class, agl.a);
   protected static final int ap = 0;
   private static final int aP = 1;
   private static final int aQ = 3;
   private static final int aR = 4;
   private static final int aS = 5;
   protected static final int aq = 6;
   protected static final int ar = 7;
   private static final agj<Integer> aT = agm.a(blp.class, agl.b);
   private static final agj<Optional<vd>> aU = agm.a(blp.class, agl.g);
   private static final agj<Boolean> aV = agm.a(blp.class, agl.k);
   private static final agj<Boolean> aW = agm.a(blp.class, agl.k);
   private static final agj<Boolean> aX = agm.a(blp.class, agl.k);
   protected static final agj<bmr> as = agm.a(blp.class, agl.v);
   private static final agj<Integer> aY = agm.a(blp.class, agl.b);
   private dms aZ = dms.a;
   private final afd ba = new afd();
   public boolean at;
   public boolean au;
   private int bb;
   protected boolean av;
   protected int aw;
   protected hx ax;
   private boolean bc;
   protected UUID ay = aui.a(this.ag);
   protected String az = this.ay.toString();
   private boolean bd;
   private final Set<String> be = Sets.newHashSet();
   private final double[] bf = new double[]{0.0, 0.0, 0.0};
   private long bg;
   private blq bh;
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
   private dja bn = null;

   public blp(blt<?> $$0, cti $$1) {
      this.p = $$0;
      this.t = $$1;
      this.bh = $$0.n();
      this.u = elm.b;
      this.v = hx.b;
      this.aE = csp.b;
      this.an = new agm(this);
      this.an.a(ao, (byte)0);
      this.an.a(aT, this.ch());
      this.an.a(aV, false);
      this.an.a(aU, Optional.empty());
      this.an.a(aW, false);
      this.an.a(aX, false);
      this.an.a(as, bmr.a);
      this.an.a(aY, 0);
      this.c_();
      this.a_(0.0, 0.0, 0.0);
      this.bi = this.a(bmr.a, this.bh);
   }

   public boolean a(hx $$0, dja $$1) {
      emf $$2 = $$1.b(this.dM(), $$0, elr.a(this));
      emf $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return emc.c($$3, emc.a(this.cH()), elq.i);
   }

   public int j_() {
      ems $$0 = this.cg();
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
      this.ba.e(new elm($$0, $$1, $$2));
   }

   public afd ah() {
      return this.ba;
   }

   public blt<?> ai() {
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
      this.a(blp.c.a);
      this.a(dnk.p);
   }

   public final void am() {
      this.a(blp.c.b);
   }

   protected abstract void c_();

   public agm an() {
      return this.an;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof blp ? ((blp)$$0).q == this.q : false;
   }

   @Override
   public int hashCode() {
      return this.q;
   }

   public void a(blp.c $$0) {
      this.b($$0);
   }

   public void ao() {
   }

   public void b(bmr $$0) {
      this.an.b(as, $$0);
   }

   public bmr ap() {
      return this.an.b(as);
   }

   public boolean c(bmr $$0) {
      return this.ap() == $$0;
   }

   public boolean a(blp $$0, double $$1) {
      return this.dk().a((ir)$$0.dk(), $$1);
   }

   public boolean a(blp $$0, double $$1, double $$2) {
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.dt() - this.dt();
      double $$5 = $$0.dx() - this.dx();
      return aui.e($$3, $$5) < aui.k($$1) && aui.k($$4) < aui.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.r($$0 % 360.0F);
      this.s($$1 % 360.0F);
   }

   public final void b(elm $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.aq());
   }

   protected elh aq() {
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
      this.s(aui.a(this.dE(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = aui.a(this.O, -90.0F, 90.0F);
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
            this.a(arm.jw, 0.4F, 2.0F + this.ag.i() * 0.4F);
         }
      }
   }

   public void g(int $$0) {
      int $$1 = $$0 * 20;
      if (this instanceof bmf) {
         $$1 = crp.a((bmf)this, $$1);
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

   private boolean b(elh $$0) {
      return this.dM().a(this, $$0) && !this.dM().d($$0);
   }

   public void c(boolean $$0) {
      this.aJ = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, elm $$1) {
      this.aJ = $$0;
      this.b($$0, $$1);
   }

   public boolean d(hx $$0) {
      return this.aD.isPresent() && this.aD.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable elm $$1) {
      if ($$0) {
         elh $$2 = this.cH();
         elh $$3 = new elh($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<hx> $$4 = this.t.g(this, $$3);
         if ($$4.isPresent() || this.bj) {
            this.aD = $$4;
         } else if ($$1 != null) {
            elh $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
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

   public void a(bml $$0, elm $$1) {
      if (this.af) {
         this.a_(this.dr() + $$1.c, this.dt() + $$1.d, this.dx() + $$1.e);
      } else {
         this.aC = this.bN();
         if ($$0 == bml.c) {
            $$1 = this.d($$1);
            if ($$1.equals(elm.b)) {
               return;
            }
         }

         this.dM().af().a("move");
         if (this.U.g() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = elm.b;
            this.g(elm.b);
         }

         $$1 = this.a($$1, $$0);
         elm $$2 = this.a($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ab != 0.0F && $$3 >= 1.0) {
               eli $$4 = this.dM().a(new csr(this.dk(), this.dk().e($$2), csr.a.d, csr.b.d, this));
               if ($$4.c() != elk.a.a) {
                  this.n();
               }
            }

            this.a_(this.dr() + $$2.c, this.dt() + $$2.d, this.dx() + $$2.e);
         }

         this.dM().af().c();
         this.dM().af().a("rest");
         boolean $$5 = !aui.b($$1.c, $$2.c);
         boolean $$6 = !aui.b($$1.e, $$2.e);
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
         dja $$8 = this.dM().a_($$7);
         this.a($$2.d, this.aC(), $$8, $$7);
         if (this.dH()) {
            this.dM().af().c();
         } else {
            if (this.P) {
               elm $$9 = this.dp();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            cwj $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dM(), this);
            }

            if (this.aC()) {
               $$10.a(this.dM(), $$7, $$8, this);
            }

            blp.b $$11 = this.aW();
            if ($$11.a() && !this.bO()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.aa = this.aa + (float)($$2.f() * 0.6);
               hx $$15 = this.aJ();
               dja $$16 = this.dM().a_($$15);
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
                        this.a(dnk.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aG();
               }
            }

            this.aD();
            float $$20 = this.aL();
            this.g(this.dp().d((double)$$20, 1.0, (double)$$20));
            if (this.dM().c(this.cH().h(1.0E-6)).noneMatch($$0x -> $$0x.a(asb.aJ) || $$0x.a(cwl.H))) {
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

   private boolean c(dja $$0) {
      return $$0.a(asb.aO) || $$0.a(cwl.qP);
   }

   private boolean a(hx $$0, dja $$1, boolean $$2, boolean $$3, elm $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aC() || $$5 || this.bX() && $$4.d == 0.0 || this.cf()) && !this.bZ()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dM().a(dnk.P, this.dk(), dnk.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(elm $$0) {
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
      this.a(arm.jB, 0.7F, 1.6F + (this.ag.i() - this.ag.i()) * 0.4F);
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
            this.a(dnk.x);
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
            dja $$2 = this.dM().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(asb.S)) && !$$2.a(asb.L) && !($$2.b() instanceof czi) ? $$1.h(aui.a(this.u.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = aui.a(this.u.c);
         int $$4 = aui.a(this.u.d - (double)$$0);
         int $$5 = aui.a(this.u.e);
         return new hx($$3, $$4, $$5);
      }
   }

   protected float aK() {
      float $$0 = this.dM().a_(this.dm()).b().l();
      float $$1 = this.dM().a_(this.aI()).b().l();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aL() {
      dja $$0 = this.dM().a_(this.dm());
      float $$1 = $$0.b().j();
      if (!$$0.a(cwl.G) && !$$0.a(cwl.nd)) {
         return (double)$$1 == 1.0 ? this.dM().a_(this.aI()).b().j() : $$1;
      } else {
         return $$1;
      }
   }

   protected elm a(elm $$0, bml $$1) {
      return $$0;
   }

   protected elm d(elm $$0) {
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
            return Math.abs($$2) <= 1.0E-5F ? elm.b : new elm($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(ic.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? elm.b : new elm(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(ic.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? elm.b : new elm(0.0, 0.0, $$4);
         } else {
            return elm.b;
         }
      }
   }

   private double a(ic.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = aui.a($$1 + this.bf[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bf[$$2];
      this.bf[$$2] = $$3;
      return $$1;
   }

   private elm a(elm $$0) {
      elh $$1 = this.cH();
      List<emf> $$2 = this.dM().c(this, $$1.b($$0));
      elm $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dM(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.aC() || $$5 && $$0.d < 0.0;
      if (this.dG() > 0.0F && $$7 && ($$4 || $$6)) {
         elm $$8 = a(this, new elm($$0.c, (double)this.dG(), $$0.e), $$1, this.dM(), $$2);
         elm $$9 = a(this, new elm(0.0, (double)this.dG(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dM(), $$2);
         if ($$9.d < (double)this.dG()) {
            elm $$10 = a(this, new elm($$0.c, 0.0, $$0.e), $$1.c($$9), this.dM(), $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new elm(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.dM(), $$2));
         }
      }

      return $$3;
   }

   public static elm a(@Nullable blp $$0, elm $$1, elh $$2, cti $$3, List<emf> $$4) {
      Builder<emf> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      dkr $$6 = $$3.D_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.e($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static elm a(elm $$0, elh $$1, List<emf> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = emc.a(ic.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = emc.a(ic.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = emc.a(ic.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = emc.a(ic.a.c, $$1, $$2, $$5);
         }

         return new elm($$3, $$4, $$5);
      }
   }

   protected float aM() {
      return (float)((int)this.Z + 1);
   }

   protected arl aN() {
      return arm.jF;
   }

   protected arl aO() {
      return arm.jE;
   }

   protected arl aP() {
      return arm.jE;
   }

   protected void aQ() {
      elh $$0 = this.cH();
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
                  dja $$7 = this.dM().a_($$3);

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

   protected void a(dja $$0) {
   }

   public void a(dnk $$0, @Nullable blp $$1) {
      this.dM().a($$1, $$0, this.u);
   }

   public void a(dnk $$0) {
      this.a($$0, this);
   }

   private void c(hx $$0, dja $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.s();
      }
   }

   protected void aR() {
      blp $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      elm $$2 = $$0.dp();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected hx e(hx $$0) {
      hx $$1 = $$0.c();
      dja $$2 = this.dM().a_($$1);
      return !$$2.a(asb.bm) && !$$2.a(asb.bn) ? $$0 : $$1;
   }

   protected void a(dja $$0, dja $$1) {
      ddv $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dja $$0) {
      ddv $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(hx $$0, dja $$1) {
      ddv $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dja $$0) {
      return $$0.a(asb.bl) && this.ah >= this.bl + 20;
   }

   private void s() {
      this.bk = this.bk * (float)Math.pow(0.997, (double)(this.ah - this.bl));
      this.bk = Math.min(1.0F, this.bk + 0.07F);
      float $$0 = 0.5F + this.bk * this.ag.i() * 1.2F;
      float $$1 = 0.1F + this.bk * 1.2F;
      this.a(arm.E, $$1, $$0);
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

   public void a(arl $$0, float $$1, float $$2) {
      if (!this.aU()) {
         this.dM().a(null, this.dr(), this.dt(), this.dx(), $$0, this.db(), $$1, $$2);
      }
   }

   public void a(arl $$0) {
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

   protected blp.b aW() {
      return blp.b.d;
   }

   public boolean aX() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dja $$2, hx $$3) {
      if ($$1) {
         if (this.ab > 0.0F) {
            $$2.b().a(this.dM(), $$2, $$3, this, this.ab);
            this.dM().a(dnk.A, this.u, dnk.a.a(this, this.aD.<dja>map($$0x -> this.dM().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ab -= (float)$$0;
      }
   }

   public boolean aY() {
      return this.ai().d();
   }

   public boolean a(float $$0, float $$1, bkn $$2) {
      if (this.p.a(ase.o)) {
         return false;
      } else {
         if (this.bP()) {
            for (blp $$3 : this.cP()) {
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
      return this.dM().a_(this.dm()).a(cwl.nd);
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
         this.h(this.bY() && this.be() && !this.bO() && this.dM().b_(this.v).a(asg.a));
      }
   }

   protected boolean bg() {
      this.aj.clear();
      this.bh();
      double $$0 = this.dM().E_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(asg.b, $$0);
      return this.aZ() || $$1;
   }

   void bh() {
      if (this.cZ() instanceof cgv $$0 && !$$0.be()) {
         this.ai = false;
         return;
      }

      if (this.a(asg.a, 0.014)) {
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
      this.ak = this.a(asg.a);
      this.aO.clear();
      double $$0 = this.dv() - 0.11111111F;
      if (this.cZ() instanceof cgv $$2 && !$$2.be() && $$2.cH().e >= $$0 && $$2.cH().b <= $$0) {
         return;
      }

      hx $$3 = hx.a(this.dr(), $$0, this.dx());
      eek $$4 = this.dM().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((cso)this.dM(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aO::add);
      }
   }

   protected void bi() {
      blp $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      elm $$2 = $$0.dp();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aO(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      } else {
         this.a(this.aP(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      }

      float $$4 = (float)aui.a(this.dt());

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

      this.a(dnk.O);
   }

   @Deprecated
   protected dja bj() {
      return this.dM().a_(this.aH());
   }

   public dja bk() {
      return this.dM().a_(this.aJ());
   }

   public boolean bl() {
      return this.bY() && !this.aZ() && !this.P_() && !this.bX() && !this.bn() && this.bx();
   }

   protected void bm() {
      hx $$0 = this.aH();
      dja $$1 = this.dM().a_($$0);
      if ($$1.l() != dco.a) {
         elm $$2 = this.dp();
         hx $$3 = this.dm();
         double $$4 = this.dr() + (this.ag.j() - 0.5) * (double)this.bh.a;
         double $$5 = this.dx() + (this.ag.j() - 0.5) * (double)this.bh.a;
         if ($$3.u() != $$0.u()) {
            $$4 = aui.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = aui.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dM().a(new jp(jx.c, $$1), $$4, this.dt() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(asq<eej> $$0) {
      return this.aO.contains($$0);
   }

   public boolean bn() {
      return !this.am && this.aj.getDouble(asg.b) > 0.0;
   }

   public void a(float $$0, elm $$1) {
      elm $$2 = a($$1, $$0, this.dC());
      this.g(this.dp().e($$2));
   }

   private static elm a(elm $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return elm.b;
      } else {
         elm $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = aui.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = aui.b($$2 * (float) (Math.PI / 180.0));
         return new elm($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bo() {
      return this.dM().f(this.dq(), this.dw()) ? this.dM().x(hx.a(this.dr(), this.dv(), this.dx())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.r($$3 % 360.0F);
      this.s(aui.a($$4, -90.0F, 90.0F) % 360.0F);
      this.N = this.dC();
      this.O = this.dE();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = aui.a($$0, -3.0E7, 3.0E7);
      double $$4 = aui.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(elm $$0) {
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

   public float e(blp $$0) {
      float $$1 = (float)(this.dr() - $$0.dr());
      float $$2 = (float)(this.dt() - $$0.dt());
      float $$3 = (float)(this.dx() - $$0.dx());
      return aui.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dr() - $$0;
      double $$4 = this.dt() - $$1;
      double $$5 = this.dx() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double f(blp $$0) {
      return this.f($$0.dk());
   }

   public double f(elm $$0) {
      double $$1 = this.dr() - $$0.c;
      double $$2 = this.dt() - $$0.d;
      double $$3 = this.dx() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cfb $$0) {
   }

   public void g(blp $$0) {
      if (!this.y($$0)) {
         if (!$$0.af && !this.af) {
            double $$1 = $$0.dr() - this.dr();
            double $$2 = $$0.dx() - this.dx();
            double $$3 = aui.a($$1, $$2);
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

   public boolean a(bkn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bq();
         return false;
      }
   }

   public final elm f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dE() : aui.i($$0, this.O, this.dE());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dC() : aui.i($$0, this.N, this.dC());
   }

   protected final elm b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = aui.b($$3);
      float $$5 = aui.a($$3);
      float $$6 = aui.b($$2);
      float $$7 = aui.a($$2);
      return new elm((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final elm i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final elm c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final elm br() {
      return new elm(this.dr(), this.dv(), this.dx());
   }

   public final elm j(float $$0) {
      double $$1 = aui.d((double)$$0, this.K, this.dr());
      double $$2 = aui.d((double)$$0, this.L, this.dt()) + (double)this.cI();
      double $$3 = aui.d((double)$$0, this.M, this.dx());
      return new elm($$1, $$2, $$3);
   }

   public elm k(float $$0) {
      return this.j($$0);
   }

   public final elm l(float $$0) {
      double $$1 = aui.d((double)$$0, this.K, this.dr());
      double $$2 = aui.d((double)$$0, this.L, this.dt());
      double $$3 = aui.d((double)$$0, this.M, this.dx());
      return new elm($$1, $$2, $$3);
   }

   public elk a(double $$0, float $$1, boolean $$2) {
      elm $$3 = this.j($$1);
      elm $$4 = this.f($$1);
      elm $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dM().a(new csr($$3, $$5, csr.a.b, $$2 ? csr.b.c : csr.b.a, this));
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

   public void a(blp $$0, int $$1, bkn $$2) {
      if ($$0 instanceof ana) {
         am.d.a((ana)$$0, this, $$2);
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

   public boolean d(sl $$0) {
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

   public boolean e(sl $$0) {
      return this.bO() ? false : this.d($$0);
   }

   public sl f(sl $$0) {
      try {
         if (this.s != null) {
            $$0.a("Pos", this.a(this.s.dr(), this.dt(), this.s.dx()));
         } else {
            $$0.a("Pos", this.a(this.dr(), this.dt(), this.dx()));
         }

         elm $$1 = this.dp();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dC(), this.dE()));
         $$0.a("FallDistance", this.ab);
         $$0.a("Fire", (short)this.aN);
         $$0.a("Air", (short)this.ci());
         $$0.a("OnGround", this.aC());
         $$0.a("Invulnerable", this.bc);
         $$0.a("PortalCooldown", this.bb);
         $$0.a("UUID", this.cw());
         vd $$2 = this.af();
         if ($$2 != null) {
            $$0.a("CustomName", vd.a.a($$2));
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
            sr $$4 = new sr();

            for (String $$5 : this.be) {
               $$4.add(tg.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bP()) {
            sr $$6 = new sr();

            for (blp $$7 : this.cP()) {
               sl $$8 = new sl();
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

   public void g(sl $$0) {
      try {
         sr $$1 = $$0.c("Pos", 6);
         sr $$2 = $$0.c("Motion", 6);
         sr $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(aui.a($$1.h(0), -3.0000512E7, 3.0000512E7), aui.a($$1.h(1), -2.0E7, 2.0E7), aui.a($$1.h(2), -3.0000512E7, 3.0000512E7));
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
                  this.b(vd.a.a($$8));
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
               sr $$10 = $$0.c("Tags", 8);
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
      blt<?> $$0 = this.ai();
      ahd $$1 = blt.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(sl var1);

   protected abstract void b(sl var1);

   protected sr a(double... $$0) {
      sr $$1 = new sr();

      for (double $$2 : $$0) {
         $$1.add(sm.a($$2));
      }

      return $$1;
   }

   protected sr a(float... $$0) {
      sr $$1 = new sr();

      for (float $$2 : $$0) {
         $$1.add(so.a($$2));
      }

      return $$1;
   }

   @Nullable
   public cbo a(cth $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public cbo a(cth $$0, int $$1) {
      return this.a(new cmr($$0), (float)$$1);
   }

   @Nullable
   public cbo b(cmr $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public cbo a(cmr $$0, float $$1) {
      if ($$0.b()) {
         return null;
      } else if (this.dM().B) {
         return null;
      } else {
         cbo $$2 = new cbo(this.dM(), this.dr(), this.dt() + (double)$$1, this.dx(), $$0);
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
         elh $$1 = elh.a(this.br(), (double)$$0, 1.0E-6, (double)$$0);
         return hx.a($$1)
            .anyMatch(
               $$1x -> {
                  dja $$2 = this.dM().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dM(), $$1x)
                     && emc.c($$2.k(this.dM(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), emc.a($$1), elq.i);
               }
            );
      }
   }

   public bjv a(cfb $$0, bju $$1) {
      return bjv.d;
   }

   public boolean h(blp $$0) {
      return $$0.bz() && !this.y($$0);
   }

   public boolean bz() {
      return false;
   }

   public void t() {
      this.g(elm.b);
      this.l();
      if (this.bO()) {
         this.cZ().i(this);
      }
   }

   public final void i(blp $$0) {
      if (this.x($$0)) {
         this.a($$0, blp::a_);
      }
   }

   protected void a(blp $$0, blp.a $$1) {
      elm $$2 = this.m($$0);
      $$1.accept($$0, $$2.c, $$2.d + (double)$$0.k(this), $$2.e);
   }

   public void j(blp $$0) {
   }

   public float k(blp $$0) {
      return this.l($$0);
   }

   protected float l(blp $$0) {
      return 0.0F;
   }

   public elm m(blp $$0) {
      return new elm(this.a($$0, this.bh, 1.0F).rotateY(-this.aG * (float) (Math.PI / 180.0))).e(this.dk());
   }

   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   public boolean n(blp $$0) {
      return this.a($$0, false);
   }

   public boolean bA() {
      return this instanceof bmf;
   }

   public boolean a(blp $$0, boolean $$1) {
      if ($$0 == this.s) {
         return false;
      } else if (!$$0.bD()) {
         return false;
      } else {
         for (blp $$2 = $$0; $$2.s != null; $$2 = $$2.s) {
            if ($$2.s == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bO()) {
               this.ac();
            }

            this.b(bmr.a);
            this.s = $$0;
            this.s.p(this);
            $$0.B().filter($$0x -> $$0x instanceof ana).forEach($$0x -> am.S.a((ana)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(blp $$0) {
      return !this.bS() && this.J <= 0;
   }

   public void bB() {
      for (int $$0 = this.r.size() - 1; $$0 >= 0; $$0--) {
         ((blp)this.r.get($$0)).ac();
      }
   }

   public void bC() {
      if (this.s != null) {
         blp $$0 = this.s;
         this.s = null;
         $$0.q(this);
      }
   }

   public void ac() {
      this.bC();
   }

   protected void p(blp $$0) {
      if ($$0.cZ() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.r.isEmpty()) {
            this.r = ImmutableList.of($$0);
         } else {
            List<blp> $$1 = Lists.newArrayList(this.r);
            if (!this.dM().B && $$0 instanceof cfb && !(this.cQ() instanceof cfb)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.r = ImmutableList.copyOf($$1);
         }

         this.a(dnk.s, $$0);
      }
   }

   protected void q(blp $$0) {
      if ($$0.cZ() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.r.size() == 1 && this.r.get(0) == $$0) {
            this.r = ImmutableList.of();
         } else {
            this.r = this.r.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(dnk.q, $$0);
      }
   }

   protected boolean r(blp $$0) {
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

   public elm bF() {
      return this.b(this.dE(), this.dC());
   }

   public elm a(cmm $$0) {
      if (!(this instanceof cfb $$1)) {
         return elm.b;
      } else {
         boolean $$2 = $$1.eU().a($$0) && !$$1.eT().a($$0);
         blz $$3 = $$2 ? $$1.fm().e() : $$1.fm();
         return this.b(0.0F, this.dC() + (float)($$3 == blz.b ? 80 : -80)).a(0.5);
      }
   }

   public ell bG() {
      return new ell(this.dE(), this.dC());
   }

   public elm bH() {
      return elm.a(this.bG());
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
      if (this.dM() instanceof amz) {
         int $$0 = this.ax();
         amz $$1 = (amz)this.dM();
         if (this.av) {
            MinecraftServer $$2 = $$1.o();
            ahc<cti> $$3 = this.dM().ae() == cti.i ? cti.h : cti.i;
            amz $$4 = $$2.a($$3);
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

   public void c(bkn $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dac.a(this);
      }
   }

   public void m(float $$0) {
   }

   public Iterable<cmr> bK() {
      return e;
   }

   public Iterable<cmr> bL() {
      return e;
   }

   public Iterable<cmr> bM() {
      return Iterables.concat(this.bK(), this.bL());
   }

   public void a(blu $$0, cmr $$1) {
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
      return this.ai().a(ase.p);
   }

   public boolean bR() {
      return !this.ai().a(ase.q);
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
      return this.c(bmr.f);
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
      return this.c(bmr.d);
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

   public boolean d(cfb $$0) {
      if ($$0.P_()) {
         return false;
      } else {
         ems $$1 = this.cg();
         return $$1 != null && $$0 != null && $$0.cg() == $$1 && $$1.i() ? false : this.ce();
      }
   }

   public boolean cf() {
      return false;
   }

   public void a(BiConsumer<dnh<?>, amz> $$0) {
   }

   @Nullable
   public eml cg() {
      return this.dM().K().e(this.cy());
   }

   public boolean s(blp $$0) {
      return this.a($$0.cg());
   }

   public boolean a(ems $$0) {
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

   public void a(amz $$0, bme $$1) {
      this.h(this.aN + 1);
      if (this.aN == 0) {
         this.g(8);
      }

      this.a(this.dN().b(), 5.0F);
   }

   public void k(boolean $$0) {
      elm $$1 = this.dp();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void l(boolean $$0) {
      elm $$1 = this.dp();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(amz $$0, bmf $$1) {
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
      elm $$4 = new elm($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
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
      elm $$13 = this.dp().a(0.75);
      if ($$6.o() == ic.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == ic.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == ic.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dja $$0, elm $$1) {
      this.n();
      this.U = $$1;
   }

   private static vd c(vd $$0) {
      vr $$1 = $$0.e().b($$0.a().a(null));

      for (vd $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public vd ad() {
      vd $$0 = this.af();
      return $$0 != null ? c($$0) : this.co();
   }

   protected vd co() {
      return this.p.h();
   }

   public boolean t(blp $$0) {
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

   public boolean u(blp $$0) {
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

   public boolean b(bkn $$0) {
      return this.dH() || this.bc && !$$0.a(asd.e) && !$$0.g() || $$0.a(asd.j) && this.aY() || $$0.a(asd.n) && this.ai().a(ase.o);
   }

   public boolean cr() {
      return this.bc;
   }

   public void m(boolean $$0) {
      this.bc = $$0;
   }

   public void v(blp $$0) {
      this.b($$0.dr(), $$0.dt(), $$0.dx(), $$0.dC(), $$0.dE());
   }

   public void w(blp $$0) {
      sl $$1 = $$0.f(new sl());
      $$1.r("Dimension");
      this.g($$1);
      this.bb = $$0.bb;
      this.ax = $$0.ax;
   }

   @Nullable
   public blp b(amz $$0) {
      if (this.dM() instanceof amz && !this.dH()) {
         this.dM().af().a("changeDimension");
         this.ag();
         this.dM().af().a("reposition");
         efh $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dM().af().b("reloading");
            blp $$2 = this.ai().a((cti)$$0);
            if ($$2 != null) {
               $$2.w(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dE());
               $$2.g($$1.b);
               $$0.d($$2);
               if ($$0.ae() == cti.j) {
                  amz.a($$0);
               }
            }

            this.cs();
            this.dM().af().c();
            ((amz)this.dM()).h();
            $$0.h();
            this.dM().af().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void cs() {
      this.b(blp.c.e);
   }

   @Nullable
   protected efh a(amz $$0) {
      boolean $$1 = this.dM().ae() == cti.j && $$0.ae() == cti.h;
      boolean $$2 = $$0.ae() == cti.j;
      if (!$$1 && !$$2) {
         boolean $$5 = $$0.ae() == cti.i;
         if (this.dM().ae() != cti.i && !$$5) {
            return null;
         } else {
            dkr $$6 = $$0.D_();
            double $$7 = dmj.a(this.dM().E_(), $$0.E_());
            hx $$8 = $$6.b(this.dr() * $$7, this.dt(), this.dx() * $$7);
            return this.a($$0, $$8, $$5, $$6).map($$1x -> {
               dja $$2x = this.dM().a_(this.ax);
               ic.a $$3;
               elm $$5x;
               if ($$2x.b(djq.H)) {
                  $$3 = $$2x.c(djq.H);
                  l.a $$4 = l.a(this.ax, $$3, 21, ic.a.b, 21, $$1xx -> this.dM().a_($$1xx) == $$2x);
                  $$5x = this.a($$3, $$4);
               } else {
                  $$3 = ic.a.a;
                  $$5x = new elm(0.5, 0.0, 0.0);
               }

               return efi.a($$0, $$1x, $$3, $$5x, this, this.dp(), this.dC(), this.dE());
            }).orElse(null);
         }
      } else {
         hx $$3;
         if ($$2) {
            $$3 = amz.a;
         } else {
            $$3 = $$0.a(doj.a.f, $$0.T());
         }

         return new efh(new elm((double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5), this.dp(), this.dC(), this.dE());
      }
   }

   protected elm a(ic.a $$0, l.a $$1) {
      return efi.a($$1, $$0, this.dk(), this.a(this.ap()));
   }

   protected Optional<l.a> a(amz $$0, hx $$1, boolean $$2, dkr $$3) {
      return $$0.p().a($$1, $$2, $$3);
   }

   public boolean ct() {
      return !this.bO() && !this.bP();
   }

   public float a(cta $$0, cso $$1, hx $$2, dja $$3, eek $$4, float $$5) {
      return $$5;
   }

   public boolean a(cta $$0, cso $$1, hx $$2, dja $$3, float $$4) {
      return true;
   }

   public int cu() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> blt.a(this.ai()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.q);
      $$0.a("Entity Name", () -> this.ad().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dr(), this.dt(), this.dx()));
      $$0.a("Entity's Block location", p.a(this.dM(), aui.a(this.dr()), aui.a(this.dt()), aui.a(this.dx())));
      elm $$1 = this.dp();
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
   public vd Q_() {
      return eml.a(this.cg(), this.ad()).a($$0 -> $$0.a(this.cG()).a(this.cx()));
   }

   public void b(@Nullable vd $$0) {
      this.an.b(aU, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public vd af() {
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
      if (this.dM() instanceof amz) {
         csp $$3 = new csp(hx.a($$0, $$1, $$2));
         ((amz)this.dM()).l().a(ane.g, $$3, 0, this.aj());
         this.dM().d($$3.e, $$3.f);
         this.c($$0, $$1, $$2);
      }
   }

   public boolean a(amz $$0, double $$1, double $$2, double $$3, Set<bmt> $$4, float $$5, float $$6) {
      float $$7 = aui.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dM()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.z();
         this.n($$5);
      } else {
         this.ag();
         blp $$8 = this.ai().a((cti)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(blp.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dM() instanceof amz) {
         this.b($$0, $$1, $$2, this.dC(), this.dE());
         this.z();
      }
   }

   private void z() {
      this.cR().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.r.iterator();

         while (var1.hasNext()) {
            blp $$1 = (blp)var1.next();
            $$0.a($$1, blp::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.dr() + $$0, this.dt() + $$1, this.dx() + $$2);
   }

   public boolean cC() {
      return this.cB();
   }

   public void b(List<agm.b<?>> $$0) {
   }

   public void a(agj<?> $$0) {
      if (as.equals($$0)) {
         this.k_();
      }
   }

   @Deprecated
   protected void cD() {
      bmr $$0 = this.ap();
      blq $$1 = this.a($$0);
      this.bh = $$1;
      this.bi = this.a($$0, $$1);
   }

   public void k_() {
      blq $$0 = this.bh;
      bmr $$1 = this.ap();
      blq $$2 = this.a($$1);
      this.bh = $$2;
      this.bi = this.a($$1, $$2);
      this.ar();
      boolean $$3 = (double)$$2.a <= 4.0 && (double)$$2.b <= 4.0;
      if (!this.dM().B && !this.am && !this.af && $$3 && ($$2.a > $$0.a || $$2.b > $$0.b) && !(this instanceof cfb)) {
         elm $$4 = this.dk().b(0.0, (double)$$0.b / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a - $$0.a) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b - $$0.b) + 1.0E-6;
         emf $$7 = emc.a(elh.a($$4, $$5, $$6, $$5));
         this.dM().a(this, $$7, $$4, (double)$$2.a, (double)$$2.b, (double)$$2.a).ifPresent($$1x -> this.b($$1x.b(0.0, (double)(-$$2.b) / 2.0, 0.0)));
      }
   }

   public ic cE() {
      return ic.a((double)this.dC());
   }

   public ic cF() {
      return this.cE();
   }

   protected vj cG() {
      return new vj(vj.a.c, new vj.b(this.ai(), this.cw(), this.ad()));
   }

   public boolean a(ana $$0) {
      return true;
   }

   @Override
   public final elh cH() {
      return this.aI;
   }

   public elh i_() {
      return this.cH();
   }

   public final void a(elh $$0) {
      this.aI = $$0;
   }

   protected float a(bmr $$0, blq $$1) {
      return $$1.b * 0.85F;
   }

   public float d(bmr $$0) {
      return this.a($$0, this.a($$0));
   }

   public final float cI() {
      return this.bi;
   }

   public elm p(float $$0) {
      return this.cJ();
   }

   protected elm cJ() {
      return new elm(0.0, (double)this.cI(), (double)(this.dg() * 0.4F));
   }

   public bmx a_(int $$0) {
      return bmx.b;
   }

   @Override
   public void a(vd $$0) {
   }

   public cti cK() {
      return this.dM();
   }

   @Nullable
   public MinecraftServer cL() {
      return this.dM().o();
   }

   public bjv a(cfb $$0, elm $$1, bju $$2) {
      return bjv.d;
   }

   public boolean a(cta $$0) {
      return false;
   }

   public void a(bmf $$0, blp $$1) {
      if ($$1 instanceof bmf) {
         cre.a((bmf)$$1, $$0);
      }

      cre.b($$0, $$1);
   }

   public void c(ana $$0) {
   }

   public void d(ana $$0) {
   }

   public float a(dcv $$0) {
      float $$1 = aui.g(this.dC());
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

   public float a(dbf $$0) {
      float $$1 = aui.g(this.dC());
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
   public bmf cN() {
      return null;
   }

   public final boolean cO() {
      return this.cN() != null;
   }

   public final List<blp> cP() {
      return this.r;
   }

   @Nullable
   public blp cQ() {
      return this.r.isEmpty() ? null : (blp)this.r.get(0);
   }

   public boolean x(blp $$0) {
      return this.r.contains($$0);
   }

   public boolean a(Predicate<blp> $$0) {
      UnmodifiableIterator var2 = this.r.iterator();

      while (var2.hasNext()) {
         blp $$1 = (blp)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<blp> B() {
      return this.r.stream().flatMap(blp::cR);
   }

   @Override
   public Stream<blp> cR() {
      return Stream.concat(Stream.of(this), this.B());
   }

   @Override
   public Stream<blp> cS() {
      return Stream.concat(this.r.stream().flatMap(blp::cS), Stream.of(this));
   }

   public Iterable<blp> cT() {
      return () -> this.B().iterator();
   }

   public int cU() {
      return (int)this.B().filter($$0 -> $$0 instanceof cfb).count();
   }

   public boolean cV() {
      return this.cU() == 1;
   }

   public blp cW() {
      blp $$0 = this;

      while ($$0.bO()) {
         $$0 = $$0.cZ();
      }

      return $$0;
   }

   public boolean y(blp $$0) {
      return this.cW() == $$0.cW();
   }

   public boolean z(blp $$0) {
      if (!$$0.bO()) {
         return false;
      } else {
         blp $$1 = $$0.cZ();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean cX() {
      return this.cN() instanceof cfb $$0 ? $$0.g() : this.cY();
   }

   public boolean cY() {
      return !this.dM().B;
   }

   protected static elm a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -aui.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = aui.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new elm((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public elm b(bmf $$0) {
      return new elm(this.dr(), this.cH().e, this.dx());
   }

   @Nullable
   public blp cZ() {
      return this.s;
   }

   @Nullable
   public blp da() {
      return this.s != null && this.s.cN() == this ? this.s : null;
   }

   public eep s_() {
      return eep.a;
   }

   public arn db() {
      return arn.g;
   }

   protected int dc() {
      return 1;
   }

   public ds dd() {
      return new ds(
         this, this.dk(), this.bG(), this.dM() instanceof amz ? (amz)this.dM() : null, this.F(), this.ad().getString(), this.Q_(), this.dM().o(), this
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
      return this.dM().Z().b(cte.p);
   }

   @Override
   public boolean x_() {
      return true;
   }

   @Override
   public boolean W_() {
      return true;
   }

   public void a(ee.a $$0, elm $$1) {
      elm $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.s(aui.g((float)(-(aui.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.r(aui.g((float)(aui.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dC());
      this.O = this.dE();
      this.N = this.dC();
   }

   public boolean a(asq<eej> $$0, double $$1) {
      if (this.de()) {
         return false;
      } else {
         elh $$2 = this.cH().h(0.001);
         int $$3 = aui.a($$2.a);
         int $$4 = aui.c($$2.d);
         int $$5 = aui.a($$2.b);
         int $$6 = aui.c($$2.e);
         int $$7 = aui.a($$2.c);
         int $$8 = aui.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cz();
         boolean $$11 = false;
         elm $$12 = elm.b;
         int $$13 = 0;
         hx.a $$14 = new hx.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  eek $$18 = this.dM().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((cso)this.dM(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           elm $$20 = $$18.c(this.dM(), $$14);
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

            if (!(this instanceof cfb)) {
               $$12 = $$12.d();
            }

            elm $$21 = this.dp();
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
      elh $$0 = this.cH().g(1.0);
      int $$1 = aui.a($$0.a);
      int $$2 = aui.c($$0.d);
      int $$3 = aui.a($$0.c);
      int $$4 = aui.c($$0.f);
      return !this.dM().b($$1, $$3, $$2, $$4);
   }

   public double b(asq<eej> $$0) {
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

   public xd<yx> dj() {
      return new yy(this);
   }

   public blq a(bmr $$0) {
      return this.p.n();
   }

   public elm dk() {
      return this.u;
   }

   public elm dl() {
      return this.dk();
   }

   @Override
   public hx dm() {
      return this.v;
   }

   public dja dn() {
      if (this.bn == null) {
         this.bn = this.dM().a_(this.dm());
      }

      return this.bn;
   }

   public csp do() {
      return this.aE;
   }

   public elm dp() {
      return this.aF;
   }

   public void g(elm $$0) {
      this.aF = $$0;
   }

   public void h(elm $$0) {
      this.g(this.dp().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.g(new elm($$0, $$1, $$2));
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
         this.u = new elm($$0, $$1, $$2);
         int $$3 = aui.a($$0);
         int $$4 = aui.a($$1);
         int $$5 = aui.a($$2);
         if ($$3 != this.v.u() || $$4 != this.v.v() || $$5 != this.v.w()) {
            this.v = new hx($$3, $$4, $$5);
            this.bn = null;
            if (iz.a($$3) != this.aE.e || iz.a($$5) != this.aE.f) {
               this.aE = new csp(this.v);
            }
         }

         this.aZ.a();
      }
   }

   public void dy() {
   }

   public elm q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bi * 0.7, 0.0);
   }

   public void a(yy $$0) {
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
   public cmr dz() {
      return null;
   }

   public void o(boolean $$0) {
      this.aA = $$0;
   }

   public boolean dA() {
      return !this.ai().a(ase.k);
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
   public blp.c dI() {
      return this.aK;
   }

   @Override
   public final void b(blp.c $$0) {
      if (this.aK == null) {
         this.aK = $$0;
      }

      if (this.aK.a()) {
         this.ac();
      }

      this.cP().forEach(blp::ac);
      this.aZ.a($$0);
   }

   protected void dJ() {
      this.aK = null;
   }

   @Override
   public void a(dms $$0) {
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

   public boolean a(cti $$0, hx $$1) {
      return true;
   }

   public cti dM() {
      return this.t;
   }

   protected void a(cti $$0) {
      this.t = $$0;
   }

   public bko dN() {
      return this.dM().ai();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = aui.d($$6, this.dr(), $$1);
      double $$8 = aui.d($$6, this.dt(), $$2);
      double $$9 = aui.d($$6, this.dx(), $$3);
      float $$10 = (float)aui.e($$6, (double)this.dC(), $$4);
      float $$11 = (float)aui.d($$6, (double)this.dE(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   @FunctionalInterface
   public interface a {
      void accept(blp var1, double var2, double var4, double var6);
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
