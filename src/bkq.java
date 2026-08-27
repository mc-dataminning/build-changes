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

public abstract class bkq implements bjb, dkz, dt {
   private static final Logger c = LogUtils.getLogger();
   public static final String w = "id";
   public static final String x = "Passengers";
   private static final AtomicInteger d = new AtomicInteger();
   private static final List<clj> e = Collections.emptyList();
   public static final int y = 60;
   public static final int z = 300;
   public static final int A = 1024;
   public static final float B = 0.2F;
   public static final double C = 0.500001;
   public static final double D = 0.999999;
   public static final float E = 0.11111111F;
   public static final int F = 140;
   public static final int G = 40;
   private static final ejp k = new ejp(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double l = 0.014;
   private static final double m = 0.007;
   private static final double n = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double o = 1.0;
   private final bku<?> p;
   private int q = d.incrementAndGet();
   public boolean I;
   private ImmutableList<bkq> r = ImmutableList.of();
   protected int J;
   @Nullable
   private bkq s;
   private csa t;
   public double K;
   public double L;
   public double M;
   private eju u;
   private ht v;
   private crh aE;
   private eju aF = eju.b;
   private float aG;
   private float aH;
   public float N;
   public float O;
   private ejp aI = k;
   private boolean aJ;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected eju U = eju.b;
   @Nullable
   private bkq.c aK;
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
   protected final ats ag = ats.a();
   public int ah;
   private int aN = -this.dd();
   protected boolean ai;
   protected Object2DoubleMap<arv<ecr>> aj = new Object2DoubleArrayMap(2);
   protected boolean ak;
   private final Set<arv<ecr>> aO = new HashSet<>();
   public int al;
   protected boolean am = true;
   protected final afr an;
   protected static final afo<Byte> ao = afr.a(bkq.class, afq.a);
   protected static final int ap = 0;
   private static final int aP = 1;
   private static final int aQ = 3;
   private static final int aR = 4;
   private static final int aS = 5;
   protected static final int aq = 6;
   protected static final int ar = 7;
   private static final afo<Integer> aT = afr.a(bkq.class, afq.b);
   private static final afo<Optional<ur>> aU = afr.a(bkq.class, afq.g);
   private static final afo<Boolean> aV = afr.a(bkq.class, afq.k);
   private static final afo<Boolean> aW = afr.a(bkq.class, afq.k);
   private static final afo<Boolean> aX = afr.a(bkq.class, afq.k);
   protected static final afo<bls> as = afr.a(bkq.class, afq.v);
   private static final afo<Integer> aY = afr.a(bkq.class, afq.b);
   private dla aZ = dla.a;
   private final aei ba = new aei();
   public boolean at;
   public boolean au;
   private int bb;
   protected boolean av;
   protected int aw;
   protected ht ax;
   private boolean bc;
   protected UUID ay = atm.a(this.ag);
   protected String az = this.ay.toString();
   private boolean bd;
   private final Set<String> be = Sets.newHashSet();
   private final double[] bf = new double[]{0.0, 0.0, 0.0};
   private long bg;
   private bkr bh;
   private float bi;
   public boolean aA;
   public boolean aB;
   public boolean aC;
   public Optional<ht> aD = Optional.empty();
   private boolean bj = false;
   private float bk;
   private int bl;
   private boolean bm;
   @Nullable
   private dhi bn = null;

   public bkq(bku<?> $$0, csa $$1) {
      this.p = $$0;
      this.t = $$1;
      this.bh = $$0.n();
      this.u = eju.b;
      this.v = ht.b;
      this.aE = crh.b;
      this.an = new afr(this);
      this.an.a(ao, (byte)0);
      this.an.a(aT, this.ch());
      this.an.a(aV, false);
      this.an.a(aU, Optional.empty());
      this.an.a(aW, false);
      this.an.a(aX, false);
      this.an.a(as, bls.a);
      this.an.a(aY, 0);
      this.b_();
      this.a_(0.0, 0.0, 0.0);
      this.bi = this.a(bls.a, this.bh);
   }

   public boolean a(ht $$0, dhi $$1) {
      ekn $$2 = $$1.b(this.dN(), $$0, ejz.a(this));
      ekn $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return ekk.c($$3, ekk.a(this.cH()), ejy.i);
   }

   public int i_() {
      ekv $$0 = this.cg();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean O_() {
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
      this.ba.e(new eju($$0, $$1, $$2));
   }

   public aei ah() {
      return this.ba;
   }

   public bku<?> ai() {
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
      this.a(bkq.c.a);
      this.a(dls.p);
   }

   public final void am() {
      this.a(bkq.c.b);
   }

   protected abstract void b_();

   public afr an() {
      return this.an;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bkq ? ((bkq)$$0).q == this.q : false;
   }

   @Override
   public int hashCode() {
      return this.q;
   }

   public void a(bkq.c $$0) {
      this.b($$0);
   }

   public void ao() {
   }

   public void b(bls $$0) {
      this.an.b(as, $$0);
   }

   public bls ap() {
      return this.an.b(as);
   }

   public boolean c(bls $$0) {
      return this.ap() == $$0;
   }

   public boolean a(bkq $$0, double $$1) {
      return this.dl().a((im)$$0.dl(), $$1);
   }

   public boolean a(bkq $$0, double $$1, double $$2) {
      double $$3 = $$0.ds() - this.ds();
      double $$4 = $$0.du() - this.du();
      double $$5 = $$0.dy() - this.dy();
      return atm.e($$3, $$5) < atm.k($$1) && atm.k($$4) < atm.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.r($$0 % 360.0F);
      this.s($$1 % 360.0F);
   }

   public final void b(eju $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.aq());
   }

   protected ejp aq() {
      return this.bh.a(this.u);
   }

   protected void ar() {
      this.a_(this.u.c, this.u.d, this.u.e);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.s(this.dF() + $$2);
      this.r(this.dD() + $$3);
      this.s(atm.a(this.dF(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = atm.a(this.O, -90.0F, 90.0F);
      if (this.s != null) {
         this.s.j(this);
      }
   }

   public void l() {
      this.as();
   }

   public void as() {
      this.dN().ae().a("entityBaseTick");
      this.bn = null;
      if (this.bO() && this.da().dI()) {
         this.ac();
      }

      if (this.J > 0) {
         this.J--;
      }

      this.X = this.Y;
      this.O = this.dF();
      this.N = this.dD();
      this.bI();
      if (this.bl()) {
         this.bm();
      }

      this.aB = this.aA;
      this.aA = false;
      this.bg();
      this.y();
      this.bf();
      if (this.dN().B) {
         this.aA();
      } else if (this.aN > 0) {
         if (this.aY()) {
            this.h(this.aN - 4);
            if (this.aN < 0) {
               this.aA();
            }
         } else {
            if (this.aN % 20 == 0 && !this.bn()) {
               this.a(this.dO().c(), 1.0F);
            }

            this.h(this.aN - 1);
         }

         if (this.cj() > 0) {
            this.k(0);
            this.dN().a(null, 1009, this.v, 1);
         }
      }

      if (this.bn()) {
         this.ay();
         this.ab *= 0.5F;
      }

      this.at();
      if (!this.dN().B) {
         this.a_(this.aN > 0);
      }

      this.am = false;
      this.dN().ae().c();
   }

   public void a_(boolean $$0) {
      this.b(0, $$0 || this.bm);
   }

   public void at() {
      if (this.du() < (double)(this.dN().I_() - 64)) {
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
         if (this.a(this.dO().d(), 4.0F)) {
            this.a(aqr.jn, 0.4F, 2.0F + this.ag.i() * 0.4F);
         }
      }
   }

   public void g(int $$0) {
      int $$1 = $$0 * 20;
      if (this instanceof blg) {
         $$1 = cqh.a((blg)this, $$1);
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

   private boolean b(ejp $$0) {
      return this.dN().a(this, $$0) && !this.dN().d($$0);
   }

   public void c(boolean $$0) {
      this.aJ = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, eju $$1) {
      this.aJ = $$0;
      this.b($$0, $$1);
   }

   public boolean d(ht $$0) {
      return this.aD.isPresent() && this.aD.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable eju $$1) {
      if ($$0) {
         ejp $$2 = this.cH();
         ejp $$3 = new ejp($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<ht> $$4 = this.t.g(this, $$3);
         if ($$4.isPresent() || this.bj) {
            this.aD = $$4;
         } else if ($$1 != null) {
            ejp $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
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

   public void a(blm $$0, eju $$1) {
      if (this.af) {
         this.a_(this.ds() + $$1.c, this.du() + $$1.d, this.dy() + $$1.e);
      } else {
         this.aC = this.bN();
         if ($$0 == blm.c) {
            $$1 = this.d($$1);
            if ($$1.equals(eju.b)) {
               return;
            }
         }

         this.dN().ae().a("move");
         if (this.U.g() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = eju.b;
            this.g(eju.b);
         }

         $$1 = this.a($$1, $$0);
         eju $$2 = this.a($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ab != 0.0F && $$3 >= 1.0) {
               ejq $$4 = this.dN().a(new crj(this.dl(), this.dl().e($$2), crj.a.d, crj.b.d, this));
               if ($$4.c() != ejs.a.a) {
                  this.n();
               }
            }

            this.a_(this.ds() + $$2.c, this.du() + $$2.d, this.dy() + $$2.e);
         }

         this.dN().ae().c();
         this.dN().ae().a("rest");
         boolean $$5 = !atm.b($$1.c, $$2.c);
         boolean $$6 = !atm.b($$1.e, $$2.e);
         this.P = $$5 || $$6;
         this.Q = $$1.d != $$2.d;
         this.R = this.Q && $$1.d < 0.0;
         if (this.P) {
            this.S = this.c($$2);
         } else {
            this.S = false;
         }

         this.a(this.R, $$2);
         ht $$7 = this.aH();
         dhi $$8 = this.dN().a_($$7);
         this.a($$2.d, this.aC(), $$8, $$7);
         if (this.dI()) {
            this.dN().ae().c();
         } else {
            if (this.P) {
               eju $$9 = this.dq();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            cva $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dN(), this);
            }

            if (this.aC()) {
               $$10.a(this.dN(), $$7, $$8, this);
            }

            bkq.b $$11 = this.aW();
            if ($$11.a() && !this.bO()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.aa = this.aa + (float)($$2.f() * 0.6);
               ht $$15 = this.aJ();
               dhi $$16 = this.dN().a_($$15);
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
                        this.a(dls.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aG();
               }
            }

            this.aD();
            float $$20 = this.aL();
            this.g(this.dq().d((double)$$20, 1.0, (double)$$20));
            if (this.dN().c(this.cH().h(1.0E-6)).noneMatch($$0x -> $$0x.a(arg.aJ) || $$0x.a(cvc.H))) {
               if (this.aN <= 0) {
                  this.h(-this.dd());
               }

               if (this.aC && (this.aA || this.bb())) {
                  this.aE();
               }
            }

            if (this.bN() && (this.aA || this.bb())) {
               this.h(-this.dd());
            }

            this.dN().ae().c();
         }
      }
   }

   private boolean c(dhi $$0) {
      return $$0.a(arg.aO) || $$0.a(cvc.qP);
   }

   private boolean a(ht $$0, dhi $$1, boolean $$2, boolean $$3, eju $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aC() || $$5 || this.bX() && $$4.d == 0.0 || this.cf()) && !this.bZ()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dN().a(dls.P, this.dl(), dls.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(eju $$0) {
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
      this.a(aqr.js, 0.7F, 1.6F + (this.ag.i() - this.ag.i()) * 0.4F);
   }

   public void aF() {
      if (!this.dN().B && this.aC) {
         this.aE();
      }

      this.aA();
   }

   protected void aG() {
      if (this.aT()) {
         this.aS();
         if (this.aW().b()) {
            this.a(dls.x);
         }
      }
   }

   @Deprecated
   public ht aH() {
      return this.d(0.2F);
   }

   protected ht aI() {
      return this.d(0.500001F);
   }

   public ht aJ() {
      return this.d(1.0E-5F);
   }

   protected ht d(float $$0) {
      if (this.aD.isPresent()) {
         ht $$1 = this.aD.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dhi $$2 = this.dN().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(arg.S)) && !$$2.a(arg.L) && !($$2.b() instanceof cxz) ? $$1.h(atm.a(this.u.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = atm.a(this.u.c);
         int $$4 = atm.a(this.u.d - (double)$$0);
         int $$5 = atm.a(this.u.e);
         return new ht($$3, $$4, $$5);
      }
   }

   protected float aK() {
      float $$0 = this.dN().a_(this.dn()).b().l();
      float $$1 = this.dN().a_(this.aI()).b().l();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aL() {
      dhi $$0 = this.dN().a_(this.dn());
      float $$1 = $$0.b().j();
      if (!$$0.a(cvc.G) && !$$0.a(cvc.nd)) {
         return (double)$$1 == 1.0 ? this.dN().a_(this.aI()).b().j() : $$1;
      } else {
         return $$1;
      }
   }

   protected eju a(eju $$0, blm $$1) {
      return $$0;
   }

   protected eju d(eju $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dN().W();
         if ($$1 != this.bg) {
            Arrays.fill(this.bf, 0.0);
            this.bg = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(hx.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? eju.b : new eju($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(hx.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? eju.b : new eju(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(hx.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? eju.b : new eju(0.0, 0.0, $$4);
         } else {
            return eju.b;
         }
      }
   }

   private double a(hx.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = atm.a($$1 + this.bf[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bf[$$2];
      this.bf[$$2] = $$3;
      return $$1;
   }

   private eju a(eju $$0) {
      ejp $$1 = this.cH();
      List<ekn> $$2 = this.dN().c(this, $$1.b($$0));
      eju $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dN(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.aC() || $$5 && $$0.d < 0.0;
      if (this.dH() > 0.0F && $$7 && ($$4 || $$6)) {
         eju $$8 = a(this, new eju($$0.c, (double)this.dH(), $$0.e), $$1, this.dN(), $$2);
         eju $$9 = a(this, new eju(0.0, (double)this.dH(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dN(), $$2);
         if ($$9.d < (double)this.dH()) {
            eju $$10 = a(this, new eju($$0.c, 0.0, $$0.e), $$1.c($$9), this.dN(), $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new eju(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.dN(), $$2));
         }
      }

      return $$3;
   }

   public static eju a(@Nullable bkq $$0, eju $$1, ejp $$2, csa $$3, List<ekn> $$4) {
      Builder<ekn> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      diz $$6 = $$3.C_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.e($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static eju a(eju $$0, ejp $$1, List<ekn> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = ekk.a(hx.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = ekk.a(hx.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = ekk.a(hx.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = ekk.a(hx.a.c, $$1, $$2, $$5);
         }

         return new eju($$3, $$4, $$5);
      }
   }

   protected float aM() {
      return (float)((int)this.Z + 1);
   }

   protected aqq aN() {
      return aqr.jw;
   }

   protected aqq aO() {
      return aqr.jv;
   }

   protected aqq aP() {
      return aqr.jv;
   }

   protected void aQ() {
      ejp $$0 = this.cH();
      ht $$1 = ht.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      ht $$2 = ht.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dN().a($$1, $$2)) {
         ht.a $$3 = new ht.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bx()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  dhi $$7 = this.dN().a_($$3);

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

   protected void a(dhi $$0) {
   }

   public void a(dls $$0, @Nullable bkq $$1) {
      this.dN().a($$1, $$0, this.u);
   }

   public void a(dls $$0) {
      this.a($$0, this);
   }

   private void c(ht $$0, dhi $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.s();
      }
   }

   protected void aR() {
      bkq $$0 = Objects.requireNonNullElse(this.cO(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      eju $$2 = $$0.dq();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected ht e(ht $$0) {
      ht $$1 = $$0.c();
      dhi $$2 = this.dN().a_($$1);
      return !$$2.a(arg.bm) && !$$2.a(arg.bn) ? $$0 : $$1;
   }

   protected void a(dhi $$0, dhi $$1) {
      dcm $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dhi $$0) {
      dcm $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(ht $$0, dhi $$1) {
      dcm $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dhi $$0) {
      return $$0.a(arg.bl) && this.ah >= this.bl + 20;
   }

   private void s() {
      this.bk = this.bk * (float)Math.pow(0.997, (double)(this.ah - this.bl));
      this.bk = Math.min(1.0F, this.bk + 0.07F);
      float $$0 = 0.5F + this.bk * this.ag.i() * 1.2F;
      float $$1 = 0.1F + this.bk * 1.2F;
      this.a(aqr.E, $$1, $$0);
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

   public void a(aqq $$0, float $$1, float $$2) {
      if (!this.aU()) {
         this.dN().a(null, this.ds(), this.du(), this.dy(), $$0, this.dc(), $$1, $$2);
      }
   }

   public void a(aqq $$0) {
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

   protected bkq.b aW() {
      return bkq.b.d;
   }

   public boolean aX() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dhi $$2, ht $$3) {
      if ($$1) {
         if (this.ab > 0.0F) {
            $$2.b().a(this.dN(), $$2, $$3, this, this.ab);
            this.dN().a(dls.A, this.u, dls.a.a(this, this.aD.<dhi>map($$0x -> this.dN().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ab -= (float)$$0;
      }
   }

   public boolean aY() {
      return this.ai().d();
   }

   public boolean a(float $$0, float $$1, bjo $$2) {
      if (this.p.a(arj.o)) {
         return false;
      } else {
         if (this.bP()) {
            for (bkq $$3 : this.cQ()) {
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
      ht $$0 = this.dn();
      return this.dN().q($$0) || this.dN().q(ht.a((double)$$0.u(), this.cH().e, (double)$$0.w()));
   }

   private boolean x() {
      return this.dN().a_(this.dn()).a(cvc.nd);
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
         this.h(this.bY() && this.be() && !this.bO() && this.dN().b_(this.v).a(arl.a));
      }
   }

   protected boolean bg() {
      this.aj.clear();
      this.bh();
      double $$0 = this.dN().D_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(arl.b, $$0);
      return this.aZ() || $$1;
   }

   void bh() {
      if (this.da() instanceof cfn $$0 && !$$0.be()) {
         this.ai = false;
         return;
      }

      if (this.a(arl.a, 0.014)) {
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
      this.ak = this.a(arl.a);
      this.aO.clear();
      double $$0 = this.dw() - 0.11111111F;
      if (this.da() instanceof cfn $$2 && !$$2.be() && $$2.cH().e >= $$0 && $$2.cH().b <= $$0) {
         return;
      }

      ht $$3 = ht.a(this.ds(), $$0, this.dy());
      ecs $$4 = this.dN().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((crg)this.dN(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aO::add);
      }
   }

   protected void bi() {
      bkq $$0 = Objects.requireNonNullElse(this.cO(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      eju $$2 = $$0.dq();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aO(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      } else {
         this.a(this.aP(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      }

      float $$4 = (float)atm.a(this.du());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bh.a * 20.0F; $$5++) {
         double $$6 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         double $$7 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         this.dN().a(js.e, this.ds() + $$6, (double)($$4 + 1.0F), this.dy() + $$7, $$2.c, $$2.d - this.ag.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bh.a * 20.0F; $$8++) {
         double $$9 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         double $$10 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         this.dN().a(js.ah, this.ds() + $$9, (double)($$4 + 1.0F), this.dy() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(dls.O);
   }

   @Deprecated
   protected dhi bj() {
      return this.dN().a_(this.aH());
   }

   public dhi bk() {
      return this.dN().a_(this.aJ());
   }

   public boolean bl() {
      return this.bY() && !this.aZ() && !this.O_() && !this.bX() && !this.bn() && this.bx();
   }

   protected void bm() {
      ht $$0 = this.aH();
      dhi $$1 = this.dN().a_($$0);
      if ($$1.l() != dbf.a) {
         eju $$2 = this.dq();
         ht $$3 = this.dn();
         double $$4 = this.ds() + (this.ag.j() - 0.5) * (double)this.bh.a;
         double $$5 = this.dy() + (this.ag.j() - 0.5) * (double)this.bh.a;
         if ($$3.u() != $$0.u()) {
            $$4 = atm.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = atm.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dN().a(new jk(js.c, $$1), $$4, this.du() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(arv<ecr> $$0) {
      return this.aO.contains($$0);
   }

   public boolean bn() {
      return !this.am && this.aj.getDouble(arl.b) > 0.0;
   }

   public void a(float $$0, eju $$1) {
      eju $$2 = a($$1, $$0, this.dD());
      this.g(this.dq().e($$2));
   }

   private static eju a(eju $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return eju.b;
      } else {
         eju $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = atm.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = atm.b($$2 * (float) (Math.PI / 180.0));
         return new eju($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bo() {
      return this.dN().f(this.dr(), this.dx()) ? this.dN().w(ht.a(this.ds(), this.dw(), this.dy())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.r($$3 % 360.0F);
      this.s(atm.a($$4, -90.0F, 90.0F) % 360.0F);
      this.N = this.dD();
      this.O = this.dF();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = atm.a($$0, -3.0E7, 3.0E7);
      double $$4 = atm.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(eju $$0) {
      this.e($$0.c, $$0.d, $$0.e);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dD(), this.dF());
   }

   public void a(ht $$0, float $$1, float $$2) {
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
      double $$0 = this.ds();
      double $$1 = this.du();
      double $$2 = this.dy();
      this.K = $$0;
      this.L = $$1;
      this.M = $$2;
      this.ac = $$0;
      this.ad = $$1;
      this.ae = $$2;
      this.N = this.dD();
      this.O = this.dF();
   }

   public float e(bkq $$0) {
      float $$1 = (float)(this.ds() - $$0.ds());
      float $$2 = (float)(this.du() - $$0.du());
      float $$3 = (float)(this.dy() - $$0.dy());
      return atm.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.ds() - $$0;
      double $$4 = this.du() - $$1;
      double $$5 = this.dy() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double f(bkq $$0) {
      return this.f($$0.dl());
   }

   public double f(eju $$0) {
      double $$1 = this.ds() - $$0.c;
      double $$2 = this.du() - $$0.d;
      double $$3 = this.dy() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cdu $$0) {
   }

   public void g(bkq $$0) {
      if (!this.y($$0)) {
         if (!$$0.af && !this.af) {
            double $$1 = $$0.ds() - this.ds();
            double $$2 = $$0.dy() - this.dy();
            double $$3 = atm.a($$1, $$2);
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
      this.g(this.dq().b($$0, $$1, $$2));
      this.au = true;
   }

   protected void bq() {
      this.T = true;
   }

   public boolean a(bjo $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bq();
         return false;
      }
   }

   public final eju f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dF() : atm.i($$0, this.O, this.dF());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dD() : atm.i($$0, this.N, this.dD());
   }

   protected final eju b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = atm.b($$3);
      float $$5 = atm.a($$3);
      float $$6 = atm.b($$2);
      float $$7 = atm.a($$2);
      return new eju((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final eju i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final eju c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final eju br() {
      return new eju(this.ds(), this.dw(), this.dy());
   }

   public final eju j(float $$0) {
      double $$1 = atm.d((double)$$0, this.K, this.ds());
      double $$2 = atm.d((double)$$0, this.L, this.du()) + (double)this.cI();
      double $$3 = atm.d((double)$$0, this.M, this.dy());
      return new eju($$1, $$2, $$3);
   }

   public eju k(float $$0) {
      return this.j($$0);
   }

   public final eju l(float $$0) {
      double $$1 = atm.d((double)$$0, this.K, this.ds());
      double $$2 = atm.d((double)$$0, this.L, this.du());
      double $$3 = atm.d((double)$$0, this.M, this.dy());
      return new eju($$1, $$2, $$3);
   }

   public ejs a(double $$0, float $$1, boolean $$2) {
      eju $$3 = this.j($$1);
      eju $$4 = this.f($$1);
      eju $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dN().a(new crj($$3, $$5, crj.a.b, $$2 ? crj.b.c : crj.b.a, this));
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

   public void a(bkq $$0, int $$1, bjo $$2) {
      if ($$0 instanceof amf) {
         al.c.a((amf)$$0, this, $$2);
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
      double $$1 = this.cH().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * o;
      return $$0 < $$1 * $$1;
   }

   public boolean d(rz $$0) {
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

   public boolean e(rz $$0) {
      return this.bO() ? false : this.d($$0);
   }

   public rz f(rz $$0) {
      try {
         if (this.s != null) {
            $$0.a("Pos", this.a(this.s.ds(), this.du(), this.s.dy()));
         } else {
            $$0.a("Pos", this.a(this.ds(), this.du(), this.dy()));
         }

         eju $$1 = this.dq();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dD(), this.dF()));
         $$0.a("FallDistance", this.ab);
         $$0.a("Fire", (short)this.aN);
         $$0.a("Air", (short)this.ci());
         $$0.a("OnGround", this.aC());
         $$0.a("Invulnerable", this.bc);
         $$0.a("PortalCooldown", this.bb);
         $$0.a("UUID", this.cw());
         ur $$2 = this.af();
         if ($$2 != null) {
            $$0.a("CustomName", ur.a.a($$2));
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
            sf $$4 = new sf();

            for (String $$5 : this.be) {
               $$4.add(su.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bP()) {
            sf $$6 = new sf();

            for (bkq $$7 : this.cQ()) {
               rz $$8 = new rz();
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

   public void g(rz $$0) {
      try {
         sf $$1 = $$0.c("Pos", 6);
         sf $$2 = $$0.c("Motion", 6);
         sf $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(atm.a($$1.h(0), -3.0000512E7, 3.0000512E7), atm.a($$1.h(1), -2.0E7, 2.0E7), atm.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.r($$3.i(0));
         this.s($$3.i(1));
         this.bp();
         this.n(this.dD());
         this.o(this.dD());
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

         if (!Double.isFinite(this.ds()) || !Double.isFinite(this.du()) || !Double.isFinite(this.dy())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dD()) && Double.isFinite((double)this.dF())) {
            this.ar();
            this.a(this.dD(), this.dF());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(ur.a.a($$8));
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
               sf $$10 = $$0.c("Tags", 8);
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
      bku<?> $$0 = this.ai();
      agi $$1 = bku.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(rz var1);

   protected abstract void b(rz var1);

   protected sf a(double... $$0) {
      sf $$1 = new sf();

      for (double $$2 : $$0) {
         $$1.add(sa.a($$2));
      }

      return $$1;
   }

   protected sf a(float... $$0) {
      sf $$1 = new sf();

      for (float $$2 : $$0) {
         $$1.add(sc.a($$2));
      }

      return $$1;
   }

   @Nullable
   public can a(crz $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public can a(crz $$0, int $$1) {
      return this.a(new clj($$0), (float)$$1);
   }

   @Nullable
   public can b(clj $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public can a(clj $$0, float $$1) {
      if ($$0.b()) {
         return null;
      } else if (this.dN().B) {
         return null;
      } else {
         can $$2 = new can(this.dN(), this.ds(), this.du() + (double)$$1, this.dy(), $$0);
         $$2.u();
         this.dN().b($$2);
         return $$2;
      }
   }

   public boolean bx() {
      return !this.dI();
   }

   public boolean by() {
      if (this.af) {
         return false;
      } else {
         float $$0 = this.bh.a * 0.8F;
         ejp $$1 = ejp.a(this.br(), (double)$$0, 1.0E-6, (double)$$0);
         return ht.a($$1)
            .anyMatch(
               $$1x -> {
                  dhi $$2 = this.dN().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dN(), $$1x)
                     && ekk.c($$2.k(this.dN(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), ekk.a($$1), ejy.i);
               }
            );
      }
   }

   public bix a(cdu $$0, biw $$1) {
      return bix.d;
   }

   public boolean h(bkq $$0) {
      return $$0.bz() && !this.y($$0);
   }

   public boolean bz() {
      return false;
   }

   public void t() {
      this.g(eju.b);
      this.l();
      if (this.bO()) {
         this.da().i(this);
      }
   }

   public final void i(bkq $$0) {
      if (this.x($$0)) {
         this.a($$0, bkq::a_);
      }
   }

   protected void a(bkq $$0, bkq.a $$1) {
      eju $$2 = this.m($$0);
      $$1.accept($$0, $$2.c, $$2.d + (double)$$0.k(this), $$2.e);
   }

   public void j(bkq $$0) {
   }

   public float k(bkq $$0) {
      return this.l($$0);
   }

   protected float l(bkq $$0) {
      return 0.0F;
   }

   public eju m(bkq $$0) {
      return new eju(this.a($$0, this.bh, 1.0F).rotateY(-this.aG * (float) (Math.PI / 180.0))).e(this.dl());
   }

   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   public boolean n(bkq $$0) {
      return this.a($$0, false);
   }

   public boolean bA() {
      return this instanceof blg;
   }

   public boolean a(bkq $$0, boolean $$1) {
      if ($$0 == this.s) {
         return false;
      } else if (!$$0.bD()) {
         return false;
      } else {
         for (bkq $$2 = $$0; $$2.s != null; $$2 = $$2.s) {
            if ($$2.s == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bO()) {
               this.ac();
            }

            this.b(bls.a);
            this.s = $$0;
            this.s.p(this);
            $$0.B().filter($$0x -> $$0x instanceof amf).forEach($$0x -> al.R.a((amf)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bkq $$0) {
      return !this.bS() && this.J <= 0;
   }

   public void bB() {
      for (int $$0 = this.r.size() - 1; $$0 >= 0; $$0--) {
         ((bkq)this.r.get($$0)).ac();
      }
   }

   public void bC() {
      if (this.s != null) {
         bkq $$0 = this.s;
         this.s = null;
         $$0.q(this);
      }
   }

   public void ac() {
      this.bC();
   }

   protected void p(bkq $$0) {
      if ($$0.da() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.r.isEmpty()) {
            this.r = ImmutableList.of($$0);
         } else {
            List<bkq> $$1 = Lists.newArrayList(this.r);
            if (!this.dN().B && $$0 instanceof cdu && !(this.cR() instanceof cdu)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.r = ImmutableList.copyOf($$1);
         }

         this.a(dls.s, $$0);
      }
   }

   protected void q(bkq $$0) {
      if ($$0.da() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.r.size() == 1 && this.r.get(0) == $$0) {
            this.r = ImmutableList.of();
         } else {
            this.r = this.r.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(dls.q, $$0);
      }
   }

   protected boolean r(bkq $$0) {
      return this.r.isEmpty();
   }

   protected boolean bD() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public double o_() {
      return this.ds();
   }

   public double M_() {
      return this.du();
   }

   public double N_() {
      return this.dy();
   }

   public float e_() {
      return this.dF();
   }

   public float p_() {
      return this.dD();
   }

   public void a(float $$0, int $$1) {
      this.n($$0);
   }

   public float bE() {
      return 0.0F;
   }

   public eju bF() {
      return this.b(this.dF(), this.dD());
   }

   public eju a(cle $$0) {
      if (!(this instanceof cdu $$1)) {
         return eju.b;
      } else {
         boolean $$2 = $$1.eV().a($$0) && !$$1.eU().a($$0);
         bla $$3 = $$2 ? $$1.fn().e() : $$1.fn();
         return this.b(0.0F, this.dD() + (float)($$3 == bla.b ? 80 : -80)).a(0.5);
      }
   }

   public ejt bG() {
      return new ejt(this.dF(), this.dD());
   }

   public eju bH() {
      return eju.a(this.bG());
   }

   public void f(ht $$0) {
      if (this.aw()) {
         this.au();
      } else {
         if (!this.dN().B && !$$0.equals(this.ax)) {
            this.ax = $$0.i();
         }

         this.av = true;
      }
   }

   protected void bI() {
      if (this.dN() instanceof ame) {
         int $$0 = this.ax();
         ame $$1 = (ame)this.dN();
         if (this.av) {
            MinecraftServer $$2 = $$1.n();
            agh<csa> $$3 = this.dN().ad() == csa.i ? csa.h : csa.i;
            ame $$4 = $$2.a($$3);
            if ($$4 != null && $$2.D() && !this.bO() && this.aw++ >= $$0) {
               this.dN().ae().a("portal");
               this.aw = $$0;
               this.au();
               this.b($$4);
               this.dN().ae().c();
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

   public void c(bjo $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            cyt.a(this);
      }
   }

   public void m(float $$0) {
   }

   public Iterable<clj> bK() {
      return e;
   }

   public Iterable<clj> bL() {
      return e;
   }

   public Iterable<clj> bM() {
      return Iterables.concat(this.bK(), this.bL());
   }

   public void a(bkv $$0, clj $$1) {
   }

   public boolean bN() {
      boolean $$0 = this.dN() != null && this.dN().B;
      return !this.aY() && (this.aN > 0 || $$0 && this.i(0));
   }

   public boolean bO() {
      return this.da() != null;
   }

   public boolean bP() {
      return !this.r.isEmpty();
   }

   public boolean bQ() {
      return this.ai().a(arj.p);
   }

   public boolean bR() {
      return !this.ai().a(arj.q);
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
      return this.c(bls.f);
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
      return this.c(bls.d);
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
      return this.dN().x_() ? this.i(6) : this.bd;
   }

   public boolean ce() {
      return this.i(5);
   }

   public boolean d(cdu $$0) {
      if ($$0.O_()) {
         return false;
      } else {
         ekv $$1 = this.cg();
         return $$1 != null && $$0 != null && $$0.cg() == $$1 && $$1.i() ? false : this.ce();
      }
   }

   public boolean cf() {
      return false;
   }

   public void a(BiConsumer<dlp<?>, ame> $$0) {
   }

   @Nullable
   public ekr cg() {
      return this.dN().J().g(this.cy());
   }

   public boolean s(bkq $$0) {
      return this.a($$0.cg());
   }

   public boolean a(ekv $$0) {
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

   public void a(ame $$0, blf $$1) {
      this.h(this.aN + 1);
      if (this.aN == 0) {
         this.g(8);
      }

      this.a(this.dO().b(), 5.0F);
   }

   public void k(boolean $$0) {
      eju $$1 = this.dq();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void l(boolean $$0) {
      eju $$1 = this.dq();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(ame $$0, blg $$1) {
      return true;
   }

   public void cn() {
      if (this.dq().b() > -0.5 && this.ab > 1.0F) {
         this.ab = 1.0F;
      }
   }

   public void n() {
      this.ab = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      ht $$3 = ht.a($$0, $$1, $$2);
      eju $$4 = new eju($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      ht.a $$5 = new ht.a();
      hx $$6 = hx.b;
      double $$7 = Double.MAX_VALUE;

      for (hx $$8 : new hx[]{hx.c, hx.d, hx.e, hx.f, hx.b}) {
         $$5.a($$3, $$8);
         if (!this.dN().a_($$5).r(this.dN(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == hx.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ag.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      eju $$13 = this.dq().a(0.75);
      if ($$6.o() == hx.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == hx.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == hx.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dhi $$0, eju $$1) {
      this.n();
      this.U = $$1;
   }

   private static ur c(ur $$0) {
      vf $$1 = $$0.e().b($$0.a().a(null));

      for (ur $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public ur ad() {
      ur $$0 = this.af();
      return $$0 != null ? c($$0) : this.co();
   }

   protected ur co() {
      return this.p.h();
   }

   public boolean t(bkq $$0) {
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

   public boolean u(bkq $$0) {
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
            this.q,
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
            this.q,
            $$0,
            this.ds(),
            this.du(),
            this.dy()
         );
   }

   public boolean b(bjo $$0) {
      return this.dI() || this.bc && !$$0.a(ari.d) && !$$0.g() || $$0.a(ari.i) && this.aY() || $$0.a(ari.m) && this.ai().a(arj.o);
   }

   public boolean cr() {
      return this.bc;
   }

   public void m(boolean $$0) {
      this.bc = $$0;
   }

   public void v(bkq $$0) {
      this.b($$0.ds(), $$0.du(), $$0.dy(), $$0.dD(), $$0.dF());
   }

   public void w(bkq $$0) {
      rz $$1 = $$0.f(new rz());
      $$1.r("Dimension");
      this.g($$1);
      this.bb = $$0.bb;
      this.ax = $$0.ax;
   }

   @Nullable
   public bkq b(ame $$0) {
      if (this.dN() instanceof ame && !this.dI()) {
         this.dN().ae().a("changeDimension");
         this.ag();
         this.dN().ae().a("reposition");
         edp $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dN().ae().b("reloading");
            bkq $$2 = this.ai().a((csa)$$0);
            if ($$2 != null) {
               $$2.w(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dF());
               $$2.g($$1.b);
               $$0.d($$2);
               if ($$0.ad() == csa.j) {
                  ame.a($$0);
               }
            }

            this.cs();
            this.dN().ae().c();
            ((ame)this.dN()).g();
            $$0.g();
            this.dN().ae().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void cs() {
      this.b(bkq.c.e);
   }

   @Nullable
   protected edp a(ame $$0) {
      boolean $$1 = this.dN().ad() == csa.j && $$0.ad() == csa.h;
      boolean $$2 = $$0.ad() == csa.j;
      if (!$$1 && !$$2) {
         boolean $$5 = $$0.ad() == csa.i;
         if (this.dN().ad() != csa.i && !$$5) {
            return null;
         } else {
            diz $$6 = $$0.C_();
            double $$7 = dkr.a(this.dN().D_(), $$0.D_());
            ht $$8 = $$6.b(this.ds() * $$7, this.du(), this.dy() * $$7);
            return this.a($$0, $$8, $$5, $$6).map($$1x -> {
               dhi $$2x = this.dN().a_(this.ax);
               hx.a $$3;
               eju $$5x;
               if ($$2x.b(dhy.H)) {
                  $$3 = $$2x.c(dhy.H);
                  l.a $$4 = l.a(this.ax, $$3, 21, hx.a.b, 21, $$1xx -> this.dN().a_($$1xx) == $$2x);
                  $$5x = this.a($$3, $$4);
               } else {
                  $$3 = hx.a.a;
                  $$5x = new eju(0.5, 0.0, 0.0);
               }

               return edq.a($$0, $$1x, $$3, $$5x, this, this.dq(), this.dD(), this.dF());
            }).orElse(null);
         }
      } else {
         ht $$3;
         if ($$2) {
            $$3 = ame.a;
         } else {
            $$3 = $$0.a(dmr.a.f, $$0.S());
         }

         return new edp(new eju((double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5), this.dq(), this.dD(), this.dF());
      }
   }

   protected eju a(hx.a $$0, l.a $$1) {
      return edq.a($$1, $$0, this.dl(), this.a(this.ap()));
   }

   protected Optional<l.a> a(ame $$0, ht $$1, boolean $$2, diz $$3) {
      return $$0.o().a($$1, $$2, $$3);
   }

   public boolean ct() {
      return !this.bO() && !this.bP();
   }

   public float a(crs $$0, crg $$1, ht $$2, dhi $$3, ecs $$4, float $$5) {
      return $$5;
   }

   public boolean a(crs $$0, crg $$1, ht $$2, dhi $$3, float $$4) {
      return true;
   }

   public int cu() {
      return 3;
   }

   public boolean q_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bku.a(this.ai()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.q);
      $$0.a("Entity Name", () -> this.ad().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.ds(), this.du(), this.dy()));
      $$0.a("Entity's Block location", p.a(this.dN(), atm.a(this.ds()), atm.a(this.du()), atm.a(this.dy())));
      eju $$1 = this.dq();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", () -> this.cQ().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.da()));
   }

   public boolean cv() {
      return this.bN() && !this.O_();
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
   public ur P_() {
      return ekr.a(this.cg(), this.ad()).a($$0 -> $$0.a(this.cG()).a(this.cx()));
   }

   public void b(@Nullable ur $$0) {
      this.an.b(aU, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public ur af() {
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
      if (this.dN() instanceof ame) {
         crh $$3 = new crh(ht.a($$0, $$1, $$2));
         ((ame)this.dN()).k().a(amj.g, $$3, 0, this.aj());
         this.dN().d($$3.e, $$3.f);
         this.c($$0, $$1, $$2);
      }
   }

   public boolean a(ame $$0, double $$1, double $$2, double $$3, Set<blu> $$4, float $$5, float $$6) {
      float $$7 = atm.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dN()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.z();
         this.n($$5);
      } else {
         this.ag();
         bkq $$8 = this.ai().a((csa)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(bkq.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dN() instanceof ame) {
         this.b($$0, $$1, $$2, this.dD(), this.dF());
         this.z();
      }
   }

   private void z() {
      this.cS().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.r.iterator();

         while (var1.hasNext()) {
            bkq $$1 = (bkq)var1.next();
            $$0.a($$1, bkq::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.ds() + $$0, this.du() + $$1, this.dy() + $$2);
   }

   public boolean cC() {
      return this.cB();
   }

   public void a(List<afr.b<?>> $$0) {
   }

   public void a(afo<?> $$0) {
      if (as.equals($$0)) {
         this.j_();
      }
   }

   @Deprecated
   protected void cD() {
      bls $$0 = this.ap();
      bkr $$1 = this.a($$0);
      this.bh = $$1;
      this.bi = this.a($$0, $$1);
   }

   public void j_() {
      bkr $$0 = this.bh;
      bls $$1 = this.ap();
      bkr $$2 = this.a($$1);
      this.bh = $$2;
      this.bi = this.a($$1, $$2);
      this.ar();
      boolean $$3 = (double)$$2.a <= 4.0 && (double)$$2.b <= 4.0;
      if (!this.dN().B && !this.am && !this.af && $$3 && ($$2.a > $$0.a || $$2.b > $$0.b) && !(this instanceof cdu)) {
         eju $$4 = this.dl().b(0.0, (double)$$0.b / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a - $$0.a) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b - $$0.b) + 1.0E-6;
         ekn $$7 = ekk.a(ejp.a($$4, $$5, $$6, $$5));
         this.dN().a(this, $$7, $$4, (double)$$2.a, (double)$$2.b, (double)$$2.a).ifPresent($$1x -> this.b($$1x.b(0.0, (double)(-$$2.b) / 2.0, 0.0)));
      }
   }

   public hx cE() {
      return hx.a((double)this.dD());
   }

   public hx cF() {
      return this.cE();
   }

   protected ux cG() {
      return new ux(ux.a.c, new ux.b(this.ai(), this.cw(), this.ad()));
   }

   public boolean a(amf $$0) {
      return true;
   }

   @Override
   public final ejp cH() {
      return this.aI;
   }

   public ejp h_() {
      return this.cH();
   }

   public final void a(ejp $$0) {
      this.aI = $$0;
   }

   protected float a(bls $$0, bkr $$1) {
      return $$1.b * 0.85F;
   }

   public float d(bls $$0) {
      return this.a($$0, this.a($$0));
   }

   public final float cI() {
      return this.bi;
   }

   public eju p(float $$0) {
      return this.cJ();
   }

   protected eju cJ() {
      return new eju(0.0, (double)this.cI(), (double)(this.dh() * 0.4F));
   }

   public bly a_(int $$0) {
      return bly.b;
   }

   @Override
   public void a(ur $$0) {
   }

   public csa cK() {
      return this.dN();
   }

   @Nullable
   public MinecraftServer cL() {
      return this.dN().n();
   }

   public bix a(cdu $$0, eju $$1, biw $$2) {
      return bix.d;
   }

   public boolean cM() {
      return false;
   }

   public void a(blg $$0, bkq $$1) {
      if ($$1 instanceof blg) {
         cpw.a((blg)$$1, $$0);
      }

      cpw.b($$0, $$1);
   }

   public void c(amf $$0) {
   }

   public void d(amf $$0) {
   }

   public float a(dbm $$0) {
      float $$1 = atm.g(this.dD());
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

   public float a(czw $$0) {
      float $$1 = atm.g(this.dD());
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
   public blg cO() {
      return null;
   }

   public final boolean cP() {
      return this.cO() != null;
   }

   public final List<bkq> cQ() {
      return this.r;
   }

   @Nullable
   public bkq cR() {
      return this.r.isEmpty() ? null : (bkq)this.r.get(0);
   }

   public boolean x(bkq $$0) {
      return this.r.contains($$0);
   }

   public boolean a(Predicate<bkq> $$0) {
      UnmodifiableIterator var2 = this.r.iterator();

      while (var2.hasNext()) {
         bkq $$1 = (bkq)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bkq> B() {
      return this.r.stream().flatMap(bkq::cS);
   }

   @Override
   public Stream<bkq> cS() {
      return Stream.concat(Stream.of(this), this.B());
   }

   @Override
   public Stream<bkq> cT() {
      return Stream.concat(this.r.stream().flatMap(bkq::cT), Stream.of(this));
   }

   public Iterable<bkq> cU() {
      return () -> this.B().iterator();
   }

   public int cV() {
      return (int)this.B().filter($$0 -> $$0 instanceof cdu).count();
   }

   public boolean cW() {
      return this.cV() == 1;
   }

   public bkq cX() {
      bkq $$0 = this;

      while ($$0.bO()) {
         $$0 = $$0.da();
      }

      return $$0;
   }

   public boolean y(bkq $$0) {
      return this.cX() == $$0.cX();
   }

   public boolean z(bkq $$0) {
      if (!$$0.bO()) {
         return false;
      } else {
         bkq $$1 = $$0.da();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean cY() {
      return this.cO() instanceof cdu $$0 ? $$0.g() : this.cZ();
   }

   public boolean cZ() {
      return !this.dN().B;
   }

   protected static eju a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -atm.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = atm.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new eju((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public eju b(blg $$0) {
      return new eju(this.ds(), this.cH().e, this.dy());
   }

   @Nullable
   public bkq da() {
      return this.s;
   }

   @Nullable
   public bkq db() {
      return this.s != null && this.s.cO() == this ? this.s : null;
   }

   public ecx r_() {
      return ecx.a;
   }

   public aqs dc() {
      return aqs.g;
   }

   protected int dd() {
      return 1;
   }

   public du de() {
      return new du(
         this, this.dl(), this.bG(), this.dN() instanceof ame ? (ame)this.dN() : null, this.F(), this.ad().getString(), this.P_(), this.dN().n(), this
      );
   }

   protected int F() {
      return 0;
   }

   public boolean l(int $$0) {
      return this.F() >= $$0;
   }

   @Override
   public boolean k_() {
      return this.dN().Y().b(crw.p);
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public boolean V_() {
      return true;
   }

   public void a(ef.a $$0, eju $$1) {
      eju $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.s(atm.g((float)(-(atm.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.r(atm.g((float)(atm.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dD());
      this.O = this.dF();
      this.N = this.dD();
   }

   public boolean a(arv<ecr> $$0, double $$1) {
      if (this.df()) {
         return false;
      } else {
         ejp $$2 = this.cH().h(0.001);
         int $$3 = atm.a($$2.a);
         int $$4 = atm.c($$2.d);
         int $$5 = atm.a($$2.b);
         int $$6 = atm.c($$2.e);
         int $$7 = atm.a($$2.c);
         int $$8 = atm.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cz();
         boolean $$11 = false;
         eju $$12 = eju.b;
         int $$13 = 0;
         ht.a $$14 = new ht.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  ecs $$18 = this.dN().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((crg)this.dN(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           eju $$20 = $$18.c(this.dN(), $$14);
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

            if (!(this instanceof cdu)) {
               $$12 = $$12.d();
            }

            eju $$21 = this.dq();
            $$12 = $$12.a($$1 * 1.0);
            double $$22 = 0.003;
            if (Math.abs($$21.c) < 0.003 && Math.abs($$21.e) < 0.003 && $$12.f() < 0.0045000000000000005) {
               $$12 = $$12.d().a(0.0045000000000000005);
            }

            this.g(this.dq().e($$12));
         }

         this.aj.put($$0, $$9);
         return $$11;
      }
   }

   public boolean df() {
      ejp $$0 = this.cH().g(1.0);
      int $$1 = atm.a($$0.a);
      int $$2 = atm.c($$0.d);
      int $$3 = atm.a($$0.c);
      int $$4 = atm.c($$0.f);
      return !this.dN().b($$1, $$3, $$2, $$4);
   }

   public double b(arv<ecr> $$0) {
      return this.aj.getDouble($$0);
   }

   public double dg() {
      return (double)this.cI() < 0.4 ? 0.0 : 0.4;
   }

   public final float dh() {
      return this.bh.a;
   }

   public final float di() {
      return this.bh.b;
   }

   public float dj() {
      return this.di() + 0.5F;
   }

   public wk<yd> dk() {
      return new ye(this);
   }

   public bkr a(bls $$0) {
      return this.p.n();
   }

   public eju dl() {
      return this.u;
   }

   public eju dm() {
      return this.dl();
   }

   @Override
   public ht dn() {
      return this.v;
   }

   public dhi do() {
      if (this.bn == null) {
         this.bn = this.dN().a_(this.dn());
      }

      return this.bn;
   }

   public crh dp() {
      return this.aE;
   }

   public eju dq() {
      return this.aF;
   }

   public void g(eju $$0) {
      this.aF = $$0;
   }

   public void h(eju $$0) {
      this.g(this.dq().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.g(new eju($$0, $$1, $$2));
   }

   public final int dr() {
      return this.v.u();
   }

   public final double ds() {
      return this.u.c;
   }

   public double c(double $$0) {
      return this.u.c + (double)this.dh() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ag.j() - 1.0) * $$0);
   }

   public final int dt() {
      return this.v.v();
   }

   public final double du() {
      return this.u.d;
   }

   public double e(double $$0) {
      return this.u.d + (double)this.di() * $$0;
   }

   public double dv() {
      return this.e(this.ag.j());
   }

   public double dw() {
      return this.u.d + (double)this.bi;
   }

   public final int dx() {
      return this.v.w();
   }

   public final double dy() {
      return this.u.e;
   }

   public double f(double $$0) {
      return this.u.e + (double)this.dh() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ag.j() - 1.0) * $$0);
   }

   public final void p(double $$0, double $$1, double $$2) {
      if (this.u.c != $$0 || this.u.d != $$1 || this.u.e != $$2) {
         this.u = new eju($$0, $$1, $$2);
         int $$3 = atm.a($$0);
         int $$4 = atm.a($$1);
         int $$5 = atm.a($$2);
         if ($$3 != this.v.u() || $$4 != this.v.v() || $$5 != this.v.w()) {
            this.v = new ht($$3, $$4, $$5);
            this.bn = null;
            if (iu.a($$3) != this.aE.e || iu.a($$5) != this.aE.f) {
               this.aE = new crh(this.v);
            }
         }

         this.aZ.a();
      }
   }

   public void dz() {
   }

   public eju q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bi * 0.7, 0.0);
   }

   public void a(ye $$0) {
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
   public clj dA() {
      return null;
   }

   public void o(boolean $$0) {
      this.aA = $$0;
   }

   public boolean dB() {
      return !this.ai().a(arj.k);
   }

   public boolean dC() {
      return (this.aA || this.aB) && this.dB();
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
      return this.aM;
   }

   public void t(float $$0) {
      this.aM = $$0;
   }

   public final boolean dI() {
      return this.aK != null;
   }

   @Nullable
   public bkq.c dJ() {
      return this.aK;
   }

   @Override
   public final void b(bkq.c $$0) {
      if (this.aK == null) {
         this.aK = $$0;
      }

      if (this.aK.a()) {
         this.ac();
      }

      this.cQ().forEach(bkq::ac);
      this.aZ.a($$0);
   }

   protected void dK() {
      this.aK = null;
   }

   @Override
   public void a(dla $$0) {
      this.aZ = $$0;
   }

   @Override
   public boolean dL() {
      if (this.aK != null && !this.aK.b()) {
         return false;
      } else {
         return this.bO() ? false : !this.bP() || !this.cW();
      }
   }

   @Override
   public boolean dM() {
      return false;
   }

   public boolean a(csa $$0, ht $$1) {
      return true;
   }

   public csa dN() {
      return this.t;
   }

   protected void a(csa $$0) {
      this.t = $$0;
   }

   public bjp dO() {
      return this.dN().ah();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = atm.d($$6, this.ds(), $$1);
      double $$8 = atm.d($$6, this.du(), $$2);
      double $$9 = atm.d($$6, this.dy(), $$3);
      float $$10 = (float)atm.e($$6, (double)this.dD(), $$4);
      float $$11 = (float)atm.d($$6, (double)this.dF(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   @FunctionalInterface
   public interface a {
      void accept(bkq var1, double var2, double var4, double var6);
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
