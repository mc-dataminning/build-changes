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

public abstract class bkv implements bjf, dle, dt {
   private static final Logger c = LogUtils.getLogger();
   public static final String w = "id";
   public static final String x = "Passengers";
   private static final AtomicInteger d = new AtomicInteger();
   private static final List<clo> e = Collections.emptyList();
   public static final int y = 60;
   public static final int z = 300;
   public static final int A = 1024;
   public static final float B = 0.2F;
   public static final double C = 0.500001;
   public static final double D = 0.999999;
   public static final float E = 0.11111111F;
   public static final int F = 140;
   public static final int G = 40;
   private static final eju k = new eju(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double l = 0.014;
   private static final double m = 0.007;
   private static final double n = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double o = 1.0;
   private final bkz<?> p;
   private int q = d.incrementAndGet();
   public boolean I;
   private ImmutableList<bkv> r = ImmutableList.of();
   protected int J;
   @Nullable
   private bkv s;
   private csf t;
   public double K;
   public double L;
   public double M;
   private ejz u;
   private hx v;
   private crm aE;
   private ejz aF = ejz.b;
   private float aG;
   private float aH;
   public float N;
   public float O;
   private eju aI = k;
   private boolean aJ;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected ejz U = ejz.b;
   @Nullable
   private bkv.c aK;
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
   protected final atw ag = atw.a();
   public int ah;
   private int aN = -this.dd();
   protected boolean ai;
   protected Object2DoubleMap<arz<ecw>> aj = new Object2DoubleArrayMap(2);
   protected boolean ak;
   private final Set<arz<ecw>> aO = new HashSet<>();
   public int al;
   protected boolean am = true;
   protected final afv an;
   protected static final afs<Byte> ao = afv.a(bkv.class, afu.a);
   protected static final int ap = 0;
   private static final int aP = 1;
   private static final int aQ = 3;
   private static final int aR = 4;
   private static final int aS = 5;
   protected static final int aq = 6;
   protected static final int ar = 7;
   private static final afs<Integer> aT = afv.a(bkv.class, afu.b);
   private static final afs<Optional<uv>> aU = afv.a(bkv.class, afu.g);
   private static final afs<Boolean> aV = afv.a(bkv.class, afu.k);
   private static final afs<Boolean> aW = afv.a(bkv.class, afu.k);
   private static final afs<Boolean> aX = afv.a(bkv.class, afu.k);
   protected static final afs<blx> as = afv.a(bkv.class, afu.v);
   private static final afs<Integer> aY = afv.a(bkv.class, afu.b);
   private dlf aZ = dlf.a;
   private final aem ba = new aem();
   public boolean at;
   public boolean au;
   private int bb;
   protected boolean av;
   protected int aw;
   protected hx ax;
   private boolean bc;
   protected UUID ay = atq.a(this.ag);
   protected String az = this.ay.toString();
   private boolean bd;
   private final Set<String> be = Sets.newHashSet();
   private final double[] bf = new double[]{0.0, 0.0, 0.0};
   private long bg;
   private bkw bh;
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
   private dhn bn = null;

   public bkv(bkz<?> $$0, csf $$1) {
      this.p = $$0;
      this.t = $$1;
      this.bh = $$0.n();
      this.u = ejz.b;
      this.v = hx.b;
      this.aE = crm.b;
      this.an = new afv(this);
      this.an.a(ao, (byte)0);
      this.an.a(aT, this.ch());
      this.an.a(aV, false);
      this.an.a(aU, Optional.empty());
      this.an.a(aW, false);
      this.an.a(aX, false);
      this.an.a(as, blx.a);
      this.an.a(aY, 0);
      this.c_();
      this.a_(0.0, 0.0, 0.0);
      this.bi = this.a(blx.a, this.bh);
   }

   public boolean a(hx $$0, dhn $$1) {
      eks $$2 = $$1.b(this.dN(), $$0, eke.a(this));
      eks $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return ekp.c($$3, ekp.a(this.cH()), ekd.i);
   }

   public int j_() {
      ela $$0 = this.cg();
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
      this.ba.e(new ejz($$0, $$1, $$2));
   }

   public aem ah() {
      return this.ba;
   }

   public bkz<?> ai() {
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
      this.a(bkv.c.a);
      this.a(dlx.p);
   }

   public final void am() {
      this.a(bkv.c.b);
   }

   protected abstract void c_();

   public afv an() {
      return this.an;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bkv ? ((bkv)$$0).q == this.q : false;
   }

   @Override
   public int hashCode() {
      return this.q;
   }

   public void a(bkv.c $$0) {
      this.b($$0);
   }

   public void ao() {
   }

   public void b(blx $$0) {
      this.an.b(as, $$0);
   }

   public blx ap() {
      return this.an.b(as);
   }

   public boolean c(blx $$0) {
      return this.ap() == $$0;
   }

   public boolean a(bkv $$0, double $$1) {
      return this.dl().a((iq)$$0.dl(), $$1);
   }

   public boolean a(bkv $$0, double $$1, double $$2) {
      double $$3 = $$0.ds() - this.ds();
      double $$4 = $$0.du() - this.du();
      double $$5 = $$0.dy() - this.dy();
      return atq.e($$3, $$5) < atq.k($$1) && atq.k($$4) < atq.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.r($$0 % 360.0F);
      this.s($$1 % 360.0F);
   }

   public final void b(ejz $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.aq());
   }

   protected eju aq() {
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
      this.s(atq.a(this.dF(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = atq.a(this.O, -90.0F, 90.0F);
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
      if (this.du() < (double)(this.dN().J_() - 64)) {
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
            this.a(aqv.jn, 0.4F, 2.0F + this.ag.i() * 0.4F);
         }
      }
   }

   public void g(int $$0) {
      int $$1 = $$0 * 20;
      if (this instanceof bll) {
         $$1 = cqm.a((bll)this, $$1);
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

   private boolean b(eju $$0) {
      return this.dN().a(this, $$0) && !this.dN().d($$0);
   }

   public void c(boolean $$0) {
      this.aJ = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, ejz $$1) {
      this.aJ = $$0;
      this.b($$0, $$1);
   }

   public boolean d(hx $$0) {
      return this.aD.isPresent() && this.aD.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable ejz $$1) {
      if ($$0) {
         eju $$2 = this.cH();
         eju $$3 = new eju($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<hx> $$4 = this.t.g(this, $$3);
         if ($$4.isPresent() || this.bj) {
            this.aD = $$4;
         } else if ($$1 != null) {
            eju $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
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

   public void a(blr $$0, ejz $$1) {
      if (this.af) {
         this.a_(this.ds() + $$1.c, this.du() + $$1.d, this.dy() + $$1.e);
      } else {
         this.aC = this.bN();
         if ($$0 == blr.c) {
            $$1 = this.d($$1);
            if ($$1.equals(ejz.b)) {
               return;
            }
         }

         this.dN().ae().a("move");
         if (this.U.g() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = ejz.b;
            this.g(ejz.b);
         }

         $$1 = this.a($$1, $$0);
         ejz $$2 = this.a($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ab != 0.0F && $$3 >= 1.0) {
               ejv $$4 = this.dN().a(new cro(this.dl(), this.dl().e($$2), cro.a.d, cro.b.d, this));
               if ($$4.c() != ejx.a.a) {
                  this.n();
               }
            }

            this.a_(this.ds() + $$2.c, this.du() + $$2.d, this.dy() + $$2.e);
         }

         this.dN().ae().c();
         this.dN().ae().a("rest");
         boolean $$5 = !atq.b($$1.c, $$2.c);
         boolean $$6 = !atq.b($$1.e, $$2.e);
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
         dhn $$8 = this.dN().a_($$7);
         this.a($$2.d, this.aC(), $$8, $$7);
         if (this.dI()) {
            this.dN().ae().c();
         } else {
            if (this.P) {
               ejz $$9 = this.dq();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            cvf $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dN(), this);
            }

            if (this.aC()) {
               $$10.a(this.dN(), $$7, $$8, this);
            }

            bkv.b $$11 = this.aW();
            if ($$11.a() && !this.bO()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.aa = this.aa + (float)($$2.f() * 0.6);
               hx $$15 = this.aJ();
               dhn $$16 = this.dN().a_($$15);
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
                        this.a(dlx.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aG();
               }
            }

            this.aD();
            float $$20 = this.aL();
            this.g(this.dq().d((double)$$20, 1.0, (double)$$20));
            if (this.dN().c(this.cH().h(1.0E-6)).noneMatch($$0x -> $$0x.a(ark.aJ) || $$0x.a(cvh.H))) {
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

   private boolean c(dhn $$0) {
      return $$0.a(ark.aO) || $$0.a(cvh.qP);
   }

   private boolean a(hx $$0, dhn $$1, boolean $$2, boolean $$3, ejz $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aC() || $$5 || this.bX() && $$4.d == 0.0 || this.cf()) && !this.bZ()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dN().a(dlx.P, this.dl(), dlx.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(ejz $$0) {
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
      this.a(aqv.js, 0.7F, 1.6F + (this.ag.i() - this.ag.i()) * 0.4F);
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
            this.a(dlx.x);
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
            dhn $$2 = this.dN().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(ark.S)) && !$$2.a(ark.L) && !($$2.b() instanceof cye) ? $$1.h(atq.a(this.u.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = atq.a(this.u.c);
         int $$4 = atq.a(this.u.d - (double)$$0);
         int $$5 = atq.a(this.u.e);
         return new hx($$3, $$4, $$5);
      }
   }

   protected float aK() {
      float $$0 = this.dN().a_(this.dn()).b().l();
      float $$1 = this.dN().a_(this.aI()).b().l();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aL() {
      dhn $$0 = this.dN().a_(this.dn());
      float $$1 = $$0.b().j();
      if (!$$0.a(cvh.G) && !$$0.a(cvh.nd)) {
         return (double)$$1 == 1.0 ? this.dN().a_(this.aI()).b().j() : $$1;
      } else {
         return $$1;
      }
   }

   protected ejz a(ejz $$0, blr $$1) {
      return $$0;
   }

   protected ejz d(ejz $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dN().W();
         if ($$1 != this.bg) {
            Arrays.fill(this.bf, 0.0);
            this.bg = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(ib.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? ejz.b : new ejz($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(ib.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? ejz.b : new ejz(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(ib.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? ejz.b : new ejz(0.0, 0.0, $$4);
         } else {
            return ejz.b;
         }
      }
   }

   private double a(ib.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = atq.a($$1 + this.bf[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bf[$$2];
      this.bf[$$2] = $$3;
      return $$1;
   }

   private ejz a(ejz $$0) {
      eju $$1 = this.cH();
      List<eks> $$2 = this.dN().c(this, $$1.b($$0));
      ejz $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dN(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.aC() || $$5 && $$0.d < 0.0;
      if (this.dH() > 0.0F && $$7 && ($$4 || $$6)) {
         ejz $$8 = a(this, new ejz($$0.c, (double)this.dH(), $$0.e), $$1, this.dN(), $$2);
         ejz $$9 = a(this, new ejz(0.0, (double)this.dH(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dN(), $$2);
         if ($$9.d < (double)this.dH()) {
            ejz $$10 = a(this, new ejz($$0.c, 0.0, $$0.e), $$1.c($$9), this.dN(), $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new ejz(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.dN(), $$2));
         }
      }

      return $$3;
   }

   public static ejz a(@Nullable bkv $$0, ejz $$1, eju $$2, csf $$3, List<eks> $$4) {
      Builder<eks> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      dje $$6 = $$3.D_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.e($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static ejz a(ejz $$0, eju $$1, List<eks> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = ekp.a(ib.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = ekp.a(ib.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = ekp.a(ib.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = ekp.a(ib.a.c, $$1, $$2, $$5);
         }

         return new ejz($$3, $$4, $$5);
      }
   }

   protected float aM() {
      return (float)((int)this.Z + 1);
   }

   protected aqu aN() {
      return aqv.jw;
   }

   protected aqu aO() {
      return aqv.jv;
   }

   protected aqu aP() {
      return aqv.jv;
   }

   protected void aQ() {
      eju $$0 = this.cH();
      hx $$1 = hx.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      hx $$2 = hx.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dN().a($$1, $$2)) {
         hx.a $$3 = new hx.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bx()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  dhn $$7 = this.dN().a_($$3);

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

   protected void a(dhn $$0) {
   }

   public void a(dlx $$0, @Nullable bkv $$1) {
      this.dN().a($$1, $$0, this.u);
   }

   public void a(dlx $$0) {
      this.a($$0, this);
   }

   private void c(hx $$0, dhn $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.s();
      }
   }

   protected void aR() {
      bkv $$0 = Objects.requireNonNullElse(this.cO(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      ejz $$2 = $$0.dq();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected hx e(hx $$0) {
      hx $$1 = $$0.c();
      dhn $$2 = this.dN().a_($$1);
      return !$$2.a(ark.bm) && !$$2.a(ark.bn) ? $$0 : $$1;
   }

   protected void a(dhn $$0, dhn $$1) {
      dcr $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dhn $$0) {
      dcr $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(hx $$0, dhn $$1) {
      dcr $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dhn $$0) {
      return $$0.a(ark.bl) && this.ah >= this.bl + 20;
   }

   private void s() {
      this.bk = this.bk * (float)Math.pow(0.997, (double)(this.ah - this.bl));
      this.bk = Math.min(1.0F, this.bk + 0.07F);
      float $$0 = 0.5F + this.bk * this.ag.i() * 1.2F;
      float $$1 = 0.1F + this.bk * 1.2F;
      this.a(aqv.E, $$1, $$0);
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

   public void a(aqu $$0, float $$1, float $$2) {
      if (!this.aU()) {
         this.dN().a(null, this.ds(), this.du(), this.dy(), $$0, this.dc(), $$1, $$2);
      }
   }

   public void a(aqu $$0) {
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

   protected bkv.b aW() {
      return bkv.b.d;
   }

   public boolean aX() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dhn $$2, hx $$3) {
      if ($$1) {
         if (this.ab > 0.0F) {
            $$2.b().a(this.dN(), $$2, $$3, this, this.ab);
            this.dN().a(dlx.A, this.u, dlx.a.a(this, this.aD.<dhn>map($$0x -> this.dN().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ab -= (float)$$0;
      }
   }

   public boolean aY() {
      return this.ai().d();
   }

   public boolean a(float $$0, float $$1, bjt $$2) {
      if (this.p.a(arn.o)) {
         return false;
      } else {
         if (this.bP()) {
            for (bkv $$3 : this.cQ()) {
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
      hx $$0 = this.dn();
      return this.dN().q($$0) || this.dN().q(hx.a((double)$$0.u(), this.cH().e, (double)$$0.w()));
   }

   private boolean x() {
      return this.dN().a_(this.dn()).a(cvh.nd);
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
         this.h(this.bY() && this.be() && !this.bO() && this.dN().b_(this.v).a(arp.a));
      }
   }

   protected boolean bg() {
      this.aj.clear();
      this.bh();
      double $$0 = this.dN().E_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(arp.b, $$0);
      return this.aZ() || $$1;
   }

   void bh() {
      if (this.da() instanceof cfs $$0 && !$$0.be()) {
         this.ai = false;
         return;
      }

      if (this.a(arp.a, 0.014)) {
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
      this.ak = this.a(arp.a);
      this.aO.clear();
      double $$0 = this.dw() - 0.11111111F;
      if (this.da() instanceof cfs $$2 && !$$2.be() && $$2.cH().e >= $$0 && $$2.cH().b <= $$0) {
         return;
      }

      hx $$3 = hx.a(this.ds(), $$0, this.dy());
      ecx $$4 = this.dN().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((crl)this.dN(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aO::add);
      }
   }

   protected void bi() {
      bkv $$0 = Objects.requireNonNullElse(this.cO(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      ejz $$2 = $$0.dq();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aO(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      } else {
         this.a(this.aP(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      }

      float $$4 = (float)atq.a(this.du());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bh.a * 20.0F; $$5++) {
         double $$6 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         double $$7 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         this.dN().a(jw.e, this.ds() + $$6, (double)($$4 + 1.0F), this.dy() + $$7, $$2.c, $$2.d - this.ag.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bh.a * 20.0F; $$8++) {
         double $$9 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         double $$10 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         this.dN().a(jw.ah, this.ds() + $$9, (double)($$4 + 1.0F), this.dy() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(dlx.O);
   }

   @Deprecated
   protected dhn bj() {
      return this.dN().a_(this.aH());
   }

   public dhn bk() {
      return this.dN().a_(this.aJ());
   }

   public boolean bl() {
      return this.bY() && !this.aZ() && !this.P_() && !this.bX() && !this.bn() && this.bx();
   }

   protected void bm() {
      hx $$0 = this.aH();
      dhn $$1 = this.dN().a_($$0);
      if ($$1.l() != dbk.a) {
         ejz $$2 = this.dq();
         hx $$3 = this.dn();
         double $$4 = this.ds() + (this.ag.j() - 0.5) * (double)this.bh.a;
         double $$5 = this.dy() + (this.ag.j() - 0.5) * (double)this.bh.a;
         if ($$3.u() != $$0.u()) {
            $$4 = atq.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = atq.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dN().a(new jo(jw.c, $$1), $$4, this.du() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(arz<ecw> $$0) {
      return this.aO.contains($$0);
   }

   public boolean bn() {
      return !this.am && this.aj.getDouble(arp.b) > 0.0;
   }

   public void a(float $$0, ejz $$1) {
      ejz $$2 = a($$1, $$0, this.dD());
      this.g(this.dq().e($$2));
   }

   private static ejz a(ejz $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return ejz.b;
      } else {
         ejz $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = atq.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = atq.b($$2 * (float) (Math.PI / 180.0));
         return new ejz($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bo() {
      return this.dN().f(this.dr(), this.dx()) ? this.dN().w(hx.a(this.ds(), this.dw(), this.dy())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.r($$3 % 360.0F);
      this.s(atq.a($$4, -90.0F, 90.0F) % 360.0F);
      this.N = this.dD();
      this.O = this.dF();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = atq.a($$0, -3.0E7, 3.0E7);
      double $$4 = atq.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(ejz $$0) {
      this.e($$0.c, $$0.d, $$0.e);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dD(), this.dF());
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

   public float e(bkv $$0) {
      float $$1 = (float)(this.ds() - $$0.ds());
      float $$2 = (float)(this.du() - $$0.du());
      float $$3 = (float)(this.dy() - $$0.dy());
      return atq.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.ds() - $$0;
      double $$4 = this.du() - $$1;
      double $$5 = this.dy() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double f(bkv $$0) {
      return this.f($$0.dl());
   }

   public double f(ejz $$0) {
      double $$1 = this.ds() - $$0.c;
      double $$2 = this.du() - $$0.d;
      double $$3 = this.dy() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cdz $$0) {
   }

   public void g(bkv $$0) {
      if (!this.y($$0)) {
         if (!$$0.af && !this.af) {
            double $$1 = $$0.ds() - this.ds();
            double $$2 = $$0.dy() - this.dy();
            double $$3 = atq.a($$1, $$2);
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

   public boolean a(bjt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bq();
         return false;
      }
   }

   public final ejz f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dF() : atq.i($$0, this.O, this.dF());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dD() : atq.i($$0, this.N, this.dD());
   }

   protected final ejz b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = atq.b($$3);
      float $$5 = atq.a($$3);
      float $$6 = atq.b($$2);
      float $$7 = atq.a($$2);
      return new ejz((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final ejz i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final ejz c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final ejz br() {
      return new ejz(this.ds(), this.dw(), this.dy());
   }

   public final ejz j(float $$0) {
      double $$1 = atq.d((double)$$0, this.K, this.ds());
      double $$2 = atq.d((double)$$0, this.L, this.du()) + (double)this.cI();
      double $$3 = atq.d((double)$$0, this.M, this.dy());
      return new ejz($$1, $$2, $$3);
   }

   public ejz k(float $$0) {
      return this.j($$0);
   }

   public final ejz l(float $$0) {
      double $$1 = atq.d((double)$$0, this.K, this.ds());
      double $$2 = atq.d((double)$$0, this.L, this.du());
      double $$3 = atq.d((double)$$0, this.M, this.dy());
      return new ejz($$1, $$2, $$3);
   }

   public ejx a(double $$0, float $$1, boolean $$2) {
      ejz $$3 = this.j($$1);
      ejz $$4 = this.f($$1);
      ejz $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dN().a(new cro($$3, $$5, cro.a.b, $$2 ? cro.b.c : cro.b.a, this));
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

   public void a(bkv $$0, int $$1, bjt $$2) {
      if ($$0 instanceof amj) {
         al.c.a((amj)$$0, this, $$2);
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

   public boolean d(sd $$0) {
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

   public boolean e(sd $$0) {
      return this.bO() ? false : this.d($$0);
   }

   public sd f(sd $$0) {
      try {
         if (this.s != null) {
            $$0.a("Pos", this.a(this.s.ds(), this.du(), this.s.dy()));
         } else {
            $$0.a("Pos", this.a(this.ds(), this.du(), this.dy()));
         }

         ejz $$1 = this.dq();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dD(), this.dF()));
         $$0.a("FallDistance", this.ab);
         $$0.a("Fire", (short)this.aN);
         $$0.a("Air", (short)this.ci());
         $$0.a("OnGround", this.aC());
         $$0.a("Invulnerable", this.bc);
         $$0.a("PortalCooldown", this.bb);
         $$0.a("UUID", this.cw());
         uv $$2 = this.af();
         if ($$2 != null) {
            $$0.a("CustomName", uv.a.a($$2));
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
            sj $$4 = new sj();

            for (String $$5 : this.be) {
               $$4.add(sy.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bP()) {
            sj $$6 = new sj();

            for (bkv $$7 : this.cQ()) {
               sd $$8 = new sd();
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

   public void g(sd $$0) {
      try {
         sj $$1 = $$0.c("Pos", 6);
         sj $$2 = $$0.c("Motion", 6);
         sj $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(atq.a($$1.h(0), -3.0000512E7, 3.0000512E7), atq.a($$1.h(1), -2.0E7, 2.0E7), atq.a($$1.h(2), -3.0000512E7, 3.0000512E7));
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
                  this.b(uv.a.a($$8));
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
               sj $$10 = $$0.c("Tags", 8);
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
      bkz<?> $$0 = this.ai();
      agm $$1 = bkz.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(sd var1);

   protected abstract void b(sd var1);

   protected sj a(double... $$0) {
      sj $$1 = new sj();

      for (double $$2 : $$0) {
         $$1.add(se.a($$2));
      }

      return $$1;
   }

   protected sj a(float... $$0) {
      sj $$1 = new sj();

      for (float $$2 : $$0) {
         $$1.add(sg.a($$2));
      }

      return $$1;
   }

   @Nullable
   public cas a(cse $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public cas a(cse $$0, int $$1) {
      return this.a(new clo($$0), (float)$$1);
   }

   @Nullable
   public cas b(clo $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public cas a(clo $$0, float $$1) {
      if ($$0.b()) {
         return null;
      } else if (this.dN().B) {
         return null;
      } else {
         cas $$2 = new cas(this.dN(), this.ds(), this.du() + (double)$$1, this.dy(), $$0);
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
         eju $$1 = eju.a(this.br(), (double)$$0, 1.0E-6, (double)$$0);
         return hx.a($$1)
            .anyMatch(
               $$1x -> {
                  dhn $$2 = this.dN().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dN(), $$1x)
                     && ekp.c($$2.k(this.dN(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), ekp.a($$1), ekd.i);
               }
            );
      }
   }

   public bjb a(cdz $$0, bja $$1) {
      return bjb.d;
   }

   public boolean h(bkv $$0) {
      return $$0.bz() && !this.y($$0);
   }

   public boolean bz() {
      return false;
   }

   public void t() {
      this.g(ejz.b);
      this.l();
      if (this.bO()) {
         this.da().i(this);
      }
   }

   public final void i(bkv $$0) {
      if (this.x($$0)) {
         this.a($$0, bkv::a_);
      }
   }

   protected void a(bkv $$0, bkv.a $$1) {
      ejz $$2 = this.m($$0);
      $$1.accept($$0, $$2.c, $$2.d + (double)$$0.k(this), $$2.e);
   }

   public void j(bkv $$0) {
   }

   public float k(bkv $$0) {
      return this.l($$0);
   }

   protected float l(bkv $$0) {
      return 0.0F;
   }

   public ejz m(bkv $$0) {
      return new ejz(this.a($$0, this.bh, 1.0F).rotateY(-this.aG * (float) (Math.PI / 180.0))).e(this.dl());
   }

   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   public boolean n(bkv $$0) {
      return this.a($$0, false);
   }

   public boolean bA() {
      return this instanceof bll;
   }

   public boolean a(bkv $$0, boolean $$1) {
      if ($$0 == this.s) {
         return false;
      } else if (!$$0.bD()) {
         return false;
      } else {
         for (bkv $$2 = $$0; $$2.s != null; $$2 = $$2.s) {
            if ($$2.s == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bO()) {
               this.ac();
            }

            this.b(blx.a);
            this.s = $$0;
            this.s.p(this);
            $$0.B().filter($$0x -> $$0x instanceof amj).forEach($$0x -> al.R.a((amj)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bkv $$0) {
      return !this.bS() && this.J <= 0;
   }

   public void bB() {
      for (int $$0 = this.r.size() - 1; $$0 >= 0; $$0--) {
         ((bkv)this.r.get($$0)).ac();
      }
   }

   public void bC() {
      if (this.s != null) {
         bkv $$0 = this.s;
         this.s = null;
         $$0.q(this);
      }
   }

   public void ac() {
      this.bC();
   }

   protected void p(bkv $$0) {
      if ($$0.da() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.r.isEmpty()) {
            this.r = ImmutableList.of($$0);
         } else {
            List<bkv> $$1 = Lists.newArrayList(this.r);
            if (!this.dN().B && $$0 instanceof cdz && !(this.cR() instanceof cdz)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.r = ImmutableList.copyOf($$1);
         }

         this.a(dlx.s, $$0);
      }
   }

   protected void q(bkv $$0) {
      if ($$0.da() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.r.size() == 1 && this.r.get(0) == $$0) {
            this.r = ImmutableList.of();
         } else {
            this.r = this.r.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(dlx.q, $$0);
      }
   }

   protected boolean r(bkv $$0) {
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
      return this.ds();
   }

   public double N_() {
      return this.du();
   }

   public double O_() {
      return this.dy();
   }

   public float f_() {
      return this.dF();
   }

   public float q_() {
      return this.dD();
   }

   public void a(float $$0, int $$1) {
      this.n($$0);
   }

   public float bE() {
      return 0.0F;
   }

   public ejz bF() {
      return this.b(this.dF(), this.dD());
   }

   public ejz a(clj $$0) {
      if (!(this instanceof cdz $$1)) {
         return ejz.b;
      } else {
         boolean $$2 = $$1.eV().a($$0) && !$$1.eU().a($$0);
         blf $$3 = $$2 ? $$1.fn().e() : $$1.fn();
         return this.b(0.0F, this.dD() + (float)($$3 == blf.b ? 80 : -80)).a(0.5);
      }
   }

   public ejy bG() {
      return new ejy(this.dF(), this.dD());
   }

   public ejz bH() {
      return ejz.a(this.bG());
   }

   public void f(hx $$0) {
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
      if (this.dN() instanceof ami) {
         int $$0 = this.ax();
         ami $$1 = (ami)this.dN();
         if (this.av) {
            MinecraftServer $$2 = $$1.n();
            agl<csf> $$3 = this.dN().ad() == csf.i ? csf.h : csf.i;
            ami $$4 = $$2.a($$3);
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

   public void c(bjt $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            cyy.a(this);
      }
   }

   public void m(float $$0) {
   }

   public Iterable<clo> bK() {
      return e;
   }

   public Iterable<clo> bL() {
      return e;
   }

   public Iterable<clo> bM() {
      return Iterables.concat(this.bK(), this.bL());
   }

   public void a(bla $$0, clo $$1) {
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
      return this.ai().a(arn.p);
   }

   public boolean bR() {
      return !this.ai().a(arn.q);
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
      return this.c(blx.f);
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
      return this.c(blx.d);
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
      return this.dN().y_() ? this.i(6) : this.bd;
   }

   public boolean ce() {
      return this.i(5);
   }

   public boolean d(cdz $$0) {
      if ($$0.P_()) {
         return false;
      } else {
         ela $$1 = this.cg();
         return $$1 != null && $$0 != null && $$0.cg() == $$1 && $$1.i() ? false : this.ce();
      }
   }

   public boolean cf() {
      return false;
   }

   public void a(BiConsumer<dlu<?>, ami> $$0) {
   }

   @Nullable
   public ekw cg() {
      return this.dN().J().g(this.cy());
   }

   public boolean s(bkv $$0) {
      return this.a($$0.cg());
   }

   public boolean a(ela $$0) {
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

   public void a(ami $$0, blk $$1) {
      this.h(this.aN + 1);
      if (this.aN == 0) {
         this.g(8);
      }

      this.a(this.dO().b(), 5.0F);
   }

   public void k(boolean $$0) {
      ejz $$1 = this.dq();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void l(boolean $$0) {
      ejz $$1 = this.dq();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(ami $$0, bll $$1) {
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
      hx $$3 = hx.a($$0, $$1, $$2);
      ejz $$4 = new ejz($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      hx.a $$5 = new hx.a();
      ib $$6 = ib.b;
      double $$7 = Double.MAX_VALUE;

      for (ib $$8 : new ib[]{ib.c, ib.d, ib.e, ib.f, ib.b}) {
         $$5.a($$3, $$8);
         if (!this.dN().a_($$5).r(this.dN(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == ib.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ag.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      ejz $$13 = this.dq().a(0.75);
      if ($$6.o() == ib.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == ib.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == ib.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dhn $$0, ejz $$1) {
      this.n();
      this.U = $$1;
   }

   private static uv c(uv $$0) {
      vj $$1 = $$0.e().b($$0.a().a(null));

      for (uv $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public uv ad() {
      uv $$0 = this.af();
      return $$0 != null ? c($$0) : this.co();
   }

   protected uv co() {
      return this.p.h();
   }

   public boolean t(bkv $$0) {
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

   public boolean u(bkv $$0) {
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

   public boolean b(bjt $$0) {
      return this.dI() || this.bc && !$$0.a(arm.d) && !$$0.g() || $$0.a(arm.i) && this.aY() || $$0.a(arm.m) && this.ai().a(arn.o);
   }

   public boolean cr() {
      return this.bc;
   }

   public void m(boolean $$0) {
      this.bc = $$0;
   }

   public void v(bkv $$0) {
      this.b($$0.ds(), $$0.du(), $$0.dy(), $$0.dD(), $$0.dF());
   }

   public void w(bkv $$0) {
      sd $$1 = $$0.f(new sd());
      $$1.r("Dimension");
      this.g($$1);
      this.bb = $$0.bb;
      this.ax = $$0.ax;
   }

   @Nullable
   public bkv b(ami $$0) {
      if (this.dN() instanceof ami && !this.dI()) {
         this.dN().ae().a("changeDimension");
         this.ag();
         this.dN().ae().a("reposition");
         edu $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dN().ae().b("reloading");
            bkv $$2 = this.ai().a((csf)$$0);
            if ($$2 != null) {
               $$2.w(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dF());
               $$2.g($$1.b);
               $$0.d($$2);
               if ($$0.ad() == csf.j) {
                  ami.a($$0);
               }
            }

            this.cs();
            this.dN().ae().c();
            ((ami)this.dN()).g();
            $$0.g();
            this.dN().ae().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void cs() {
      this.b(bkv.c.e);
   }

   @Nullable
   protected edu a(ami $$0) {
      boolean $$1 = this.dN().ad() == csf.j && $$0.ad() == csf.h;
      boolean $$2 = $$0.ad() == csf.j;
      if (!$$1 && !$$2) {
         boolean $$5 = $$0.ad() == csf.i;
         if (this.dN().ad() != csf.i && !$$5) {
            return null;
         } else {
            dje $$6 = $$0.D_();
            double $$7 = dkw.a(this.dN().E_(), $$0.E_());
            hx $$8 = $$6.b(this.ds() * $$7, this.du(), this.dy() * $$7);
            return this.a($$0, $$8, $$5, $$6).map($$1x -> {
               dhn $$2x = this.dN().a_(this.ax);
               ib.a $$3;
               ejz $$5x;
               if ($$2x.b(did.H)) {
                  $$3 = $$2x.c(did.H);
                  l.a $$4 = l.a(this.ax, $$3, 21, ib.a.b, 21, $$1xx -> this.dN().a_($$1xx) == $$2x);
                  $$5x = this.a($$3, $$4);
               } else {
                  $$3 = ib.a.a;
                  $$5x = new ejz(0.5, 0.0, 0.0);
               }

               return edv.a($$0, $$1x, $$3, $$5x, this, this.dq(), this.dD(), this.dF());
            }).orElse(null);
         }
      } else {
         hx $$3;
         if ($$2) {
            $$3 = ami.a;
         } else {
            $$3 = $$0.a(dmw.a.f, $$0.S());
         }

         return new edu(new ejz((double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5), this.dq(), this.dD(), this.dF());
      }
   }

   protected ejz a(ib.a $$0, l.a $$1) {
      return edv.a($$1, $$0, this.dl(), this.a(this.ap()));
   }

   protected Optional<l.a> a(ami $$0, hx $$1, boolean $$2, dje $$3) {
      return $$0.o().a($$1, $$2, $$3);
   }

   public boolean ct() {
      return !this.bO() && !this.bP();
   }

   public float a(crx $$0, crl $$1, hx $$2, dhn $$3, ecx $$4, float $$5) {
      return $$5;
   }

   public boolean a(crx $$0, crl $$1, hx $$2, dhn $$3, float $$4) {
      return true;
   }

   public int cu() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bkz.a(this.ai()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.q);
      $$0.a("Entity Name", () -> this.ad().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.ds(), this.du(), this.dy()));
      $$0.a("Entity's Block location", p.a(this.dN(), atq.a(this.ds()), atq.a(this.du()), atq.a(this.dy())));
      ejz $$1 = this.dq();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", () -> this.cQ().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.da()));
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
   public uv Q_() {
      return ekw.a(this.cg(), this.ad()).a($$0 -> $$0.a(this.cG()).a(this.cx()));
   }

   public void b(@Nullable uv $$0) {
      this.an.b(aU, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public uv af() {
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
      if (this.dN() instanceof ami) {
         crm $$3 = new crm(hx.a($$0, $$1, $$2));
         ((ami)this.dN()).k().a(amn.g, $$3, 0, this.aj());
         this.dN().d($$3.e, $$3.f);
         this.c($$0, $$1, $$2);
      }
   }

   public boolean a(ami $$0, double $$1, double $$2, double $$3, Set<blz> $$4, float $$5, float $$6) {
      float $$7 = atq.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dN()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.z();
         this.n($$5);
      } else {
         this.ag();
         bkv $$8 = this.ai().a((csf)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(bkv.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dN() instanceof ami) {
         this.b($$0, $$1, $$2, this.dD(), this.dF());
         this.z();
      }
   }

   private void z() {
      this.cS().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.r.iterator();

         while (var1.hasNext()) {
            bkv $$1 = (bkv)var1.next();
            $$0.a($$1, bkv::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.ds() + $$0, this.du() + $$1, this.dy() + $$2);
   }

   public boolean cC() {
      return this.cB();
   }

   public void a(List<afv.b<?>> $$0) {
   }

   public void a(afs<?> $$0) {
      if (as.equals($$0)) {
         this.k_();
      }
   }

   @Deprecated
   protected void cD() {
      blx $$0 = this.ap();
      bkw $$1 = this.a($$0);
      this.bh = $$1;
      this.bi = this.a($$0, $$1);
   }

   public void k_() {
      bkw $$0 = this.bh;
      blx $$1 = this.ap();
      bkw $$2 = this.a($$1);
      this.bh = $$2;
      this.bi = this.a($$1, $$2);
      this.ar();
      boolean $$3 = (double)$$2.a <= 4.0 && (double)$$2.b <= 4.0;
      if (!this.dN().B && !this.am && !this.af && $$3 && ($$2.a > $$0.a || $$2.b > $$0.b) && !(this instanceof cdz)) {
         ejz $$4 = this.dl().b(0.0, (double)$$0.b / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a - $$0.a) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b - $$0.b) + 1.0E-6;
         eks $$7 = ekp.a(eju.a($$4, $$5, $$6, $$5));
         this.dN().a(this, $$7, $$4, (double)$$2.a, (double)$$2.b, (double)$$2.a).ifPresent($$1x -> this.b($$1x.b(0.0, (double)(-$$2.b) / 2.0, 0.0)));
      }
   }

   public ib cE() {
      return ib.a((double)this.dD());
   }

   public ib cF() {
      return this.cE();
   }

   protected vb cG() {
      return new vb(vb.a.c, new vb.b(this.ai(), this.cw(), this.ad()));
   }

   public boolean a(amj $$0) {
      return true;
   }

   @Override
   public final eju cH() {
      return this.aI;
   }

   public eju i_() {
      return this.cH();
   }

   public final void a(eju $$0) {
      this.aI = $$0;
   }

   protected float a(blx $$0, bkw $$1) {
      return $$1.b * 0.85F;
   }

   public float d(blx $$0) {
      return this.a($$0, this.a($$0));
   }

   public final float cI() {
      return this.bi;
   }

   public ejz p(float $$0) {
      return this.cJ();
   }

   protected ejz cJ() {
      return new ejz(0.0, (double)this.cI(), (double)(this.dh() * 0.4F));
   }

   public bmd a_(int $$0) {
      return bmd.b;
   }

   @Override
   public void a(uv $$0) {
   }

   public csf cK() {
      return this.dN();
   }

   @Nullable
   public MinecraftServer cL() {
      return this.dN().n();
   }

   public bjb a(cdz $$0, ejz $$1, bja $$2) {
      return bjb.d;
   }

   public boolean cM() {
      return false;
   }

   public void a(bll $$0, bkv $$1) {
      if ($$1 instanceof bll) {
         cqb.a((bll)$$1, $$0);
      }

      cqb.b($$0, $$1);
   }

   public void c(amj $$0) {
   }

   public void d(amj $$0) {
   }

   public float a(dbr $$0) {
      float $$1 = atq.g(this.dD());
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

   public float a(dab $$0) {
      float $$1 = atq.g(this.dD());
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
   public bll cO() {
      return null;
   }

   public final boolean cP() {
      return this.cO() != null;
   }

   public final List<bkv> cQ() {
      return this.r;
   }

   @Nullable
   public bkv cR() {
      return this.r.isEmpty() ? null : (bkv)this.r.get(0);
   }

   public boolean x(bkv $$0) {
      return this.r.contains($$0);
   }

   public boolean a(Predicate<bkv> $$0) {
      UnmodifiableIterator var2 = this.r.iterator();

      while (var2.hasNext()) {
         bkv $$1 = (bkv)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bkv> B() {
      return this.r.stream().flatMap(bkv::cS);
   }

   @Override
   public Stream<bkv> cS() {
      return Stream.concat(Stream.of(this), this.B());
   }

   @Override
   public Stream<bkv> cT() {
      return Stream.concat(this.r.stream().flatMap(bkv::cT), Stream.of(this));
   }

   public Iterable<bkv> cU() {
      return () -> this.B().iterator();
   }

   public int cV() {
      return (int)this.B().filter($$0 -> $$0 instanceof cdz).count();
   }

   public boolean cW() {
      return this.cV() == 1;
   }

   public bkv cX() {
      bkv $$0 = this;

      while ($$0.bO()) {
         $$0 = $$0.da();
      }

      return $$0;
   }

   public boolean y(bkv $$0) {
      return this.cX() == $$0.cX();
   }

   public boolean z(bkv $$0) {
      if (!$$0.bO()) {
         return false;
      } else {
         bkv $$1 = $$0.da();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean cY() {
      return this.cO() instanceof cdz $$0 ? $$0.g() : this.cZ();
   }

   public boolean cZ() {
      return !this.dN().B;
   }

   protected static ejz a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -atq.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = atq.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new ejz((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public ejz b(bll $$0) {
      return new ejz(this.ds(), this.cH().e, this.dy());
   }

   @Nullable
   public bkv da() {
      return this.s;
   }

   @Nullable
   public bkv db() {
      return this.s != null && this.s.cO() == this ? this.s : null;
   }

   public edc s_() {
      return edc.a;
   }

   public aqw dc() {
      return aqw.g;
   }

   protected int dd() {
      return 1;
   }

   public du de() {
      return new du(
         this, this.dl(), this.bG(), this.dN() instanceof ami ? (ami)this.dN() : null, this.F(), this.ad().getString(), this.Q_(), this.dN().n(), this
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
      return this.dN().Y().b(csb.p);
   }

   @Override
   public boolean x_() {
      return true;
   }

   @Override
   public boolean W_() {
      return true;
   }

   public void a(ef.a $$0, ejz $$1) {
      ejz $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.s(atq.g((float)(-(atq.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.r(atq.g((float)(atq.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dD());
      this.O = this.dF();
      this.N = this.dD();
   }

   public boolean a(arz<ecw> $$0, double $$1) {
      if (this.df()) {
         return false;
      } else {
         eju $$2 = this.cH().h(0.001);
         int $$3 = atq.a($$2.a);
         int $$4 = atq.c($$2.d);
         int $$5 = atq.a($$2.b);
         int $$6 = atq.c($$2.e);
         int $$7 = atq.a($$2.c);
         int $$8 = atq.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cz();
         boolean $$11 = false;
         ejz $$12 = ejz.b;
         int $$13 = 0;
         hx.a $$14 = new hx.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  ecx $$18 = this.dN().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((crl)this.dN(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           ejz $$20 = $$18.c(this.dN(), $$14);
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

            if (!(this instanceof cdz)) {
               $$12 = $$12.d();
            }

            ejz $$21 = this.dq();
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
      eju $$0 = this.cH().g(1.0);
      int $$1 = atq.a($$0.a);
      int $$2 = atq.c($$0.d);
      int $$3 = atq.a($$0.c);
      int $$4 = atq.c($$0.f);
      return !this.dN().b($$1, $$3, $$2, $$4);
   }

   public double b(arz<ecw> $$0) {
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

   public wo<yh> dk() {
      return new yi(this);
   }

   public bkw a(blx $$0) {
      return this.p.n();
   }

   public ejz dl() {
      return this.u;
   }

   public ejz dm() {
      return this.dl();
   }

   @Override
   public hx dn() {
      return this.v;
   }

   public dhn do() {
      if (this.bn == null) {
         this.bn = this.dN().a_(this.dn());
      }

      return this.bn;
   }

   public crm dp() {
      return this.aE;
   }

   public ejz dq() {
      return this.aF;
   }

   public void g(ejz $$0) {
      this.aF = $$0;
   }

   public void h(ejz $$0) {
      this.g(this.dq().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.g(new ejz($$0, $$1, $$2));
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
         this.u = new ejz($$0, $$1, $$2);
         int $$3 = atq.a($$0);
         int $$4 = atq.a($$1);
         int $$5 = atq.a($$2);
         if ($$3 != this.v.u() || $$4 != this.v.v() || $$5 != this.v.w()) {
            this.v = new hx($$3, $$4, $$5);
            this.bn = null;
            if (iy.a($$3) != this.aE.e || iy.a($$5) != this.aE.f) {
               this.aE = new crm(this.v);
            }
         }

         this.aZ.a();
      }
   }

   public void dz() {
   }

   public ejz q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bi * 0.7, 0.0);
   }

   public void a(yi $$0) {
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
   public clo dA() {
      return null;
   }

   public void o(boolean $$0) {
      this.aA = $$0;
   }

   public boolean dB() {
      return !this.ai().a(arn.k);
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
   public bkv.c dJ() {
      return this.aK;
   }

   @Override
   public final void b(bkv.c $$0) {
      if (this.aK == null) {
         this.aK = $$0;
      }

      if (this.aK.a()) {
         this.ac();
      }

      this.cQ().forEach(bkv::ac);
      this.aZ.a($$0);
   }

   protected void dK() {
      this.aK = null;
   }

   @Override
   public void a(dlf $$0) {
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

   public boolean a(csf $$0, hx $$1) {
      return true;
   }

   public csf dN() {
      return this.t;
   }

   protected void a(csf $$0) {
      this.t = $$0;
   }

   public bju dO() {
      return this.dN().ah();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = atq.d($$6, this.ds(), $$1);
      double $$8 = atq.d($$6, this.du(), $$2);
      double $$9 = atq.d($$6, this.dy(), $$3);
      float $$10 = (float)atq.e($$6, (double)this.dD(), $$4);
      float $$11 = (float)atq.d($$6, (double)this.dF(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   @FunctionalInterface
   public interface a {
      void accept(bkv var1, double var2, double var4, double var6);
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
