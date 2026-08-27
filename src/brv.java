import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import java.util.ArrayList;
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

public abstract class brv implements akb, bqf, dxc, eg, exx {
   private static final Logger b = LogUtils.getLogger();
   public static final String w = "id";
   public static final String x = "Passengers";
   private static final AtomicInteger c = new AtomicInteger();
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
   private static final ewp d = new ewp(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double e = 0.014;
   private static final double k = 0.007;
   private static final double l = 0.0023333333333333335;
   public static final String I = "UUID";
   private static double m = 1.0;
   private final bsb<?> n;
   public boolean J;
   private int o = c.incrementAndGet();
   public boolean K;
   private ImmutableList<brv> p = ImmutableList.of();
   protected int L;
   @Nullable
   private brv q;
   private dca r;
   public double M;
   public double N;
   public double O;
   private ewu s;
   private ir t;
   private dbh u;
   private ewu v = ewu.b;
   private float aN;
   private float aO;
   public float P;
   public float Q;
   private ewp aP = d;
   private boolean aQ;
   public boolean R;
   public boolean S;
   public boolean T;
   public boolean U;
   public boolean V;
   protected ewu W = ewu.b;
   @Nullable
   private brv.d aR;
   public static final float X = 0.6F;
   public static final float Y = 1.8F;
   public float Z;
   public float aa;
   public float ab;
   public float ac;
   public float ad;
   private float aS = 1.0F;
   public double ae;
   public double af;
   public double ag;
   public boolean ah;
   protected float ai;
   public ewu aj = ewu.b;
   public ewu ak = ewu.b;
   protected final ayt al = ayt.a();
   public int am;
   private int aT = -this.dk();
   protected boolean an;
   protected Object2DoubleMap<awt<epd>> ao = new Object2DoubleArrayMap(2);
   protected boolean ap;
   private final Set<awt<epd>> aU = new HashSet<>();
   public int aq;
   protected boolean ar = true;
   protected final akc as;
   protected static final ajy<Byte> at = akc.a(brv.class, aka.a);
   protected static final int au = 0;
   private static final int aV = 1;
   private static final int aW = 3;
   private static final int aX = 4;
   private static final int aY = 5;
   protected static final int av = 6;
   protected static final int aw = 7;
   private static final ajy<Integer> aZ = akc.a(brv.class, aka.b);
   private static final ajy<Optional<xe>> ba = akc.a(brv.class, aka.g);
   private static final ajy<Boolean> bb = akc.a(brv.class, aka.k);
   private static final ajy<Boolean> bc = akc.a(brv.class, aka.k);
   private static final ajy<Boolean> bd = akc.a(brv.class, aka.k);
   protected static final ajy<bsz> ax = akc.a(brv.class, aka.w);
   private static final ajy<Integer> be = akc.a(brv.class, aka.b);
   private dxd bf = dxd.a;
   private final aii bg = new aii();
   public boolean ay;
   public boolean az;
   private int bh;
   protected boolean aA;
   protected int aB;
   protected ir aC;
   private boolean bi;
   protected UUID aD = aym.a(this.al);
   protected String aE = this.aD.toString();
   private boolean bj;
   private final Set<String> bk = Sets.newHashSet();
   private final double[] bl = new double[]{0.0, 0.0, 0.0};
   private long bm;
   private bry bn;
   private float bo;
   public boolean aF;
   public boolean aG;
   public boolean aH;
   public Optional<ir> aI = Optional.empty();
   private boolean bp = false;
   private float bq;
   private int br;
   private boolean bs;
   @Nullable
   private dtc bt = null;
   private static final int bu = 30;
   @Nullable
   protected cpa aJ;
   protected int aK;
   @Nullable
   public UUID aL;
   public int aM;
   private static final List<Pair<aks<ejt>, aks<ejt>>> bv = List.of(Pair.of(ejn.v, ejn.w), Pair.of(ejn.l, ejn.u), Pair.of(ejn.I, ejn.I));

   public brv(bsb<?> $$0, dca $$1) {
      this.n = $$0;
      this.r = $$1;
      this.bn = $$0.n();
      this.s = ewu.b;
      this.t = ir.c;
      this.u = dbh.b;
      akc.a $$2 = new akc.a(this);
      $$2.a(at, (byte)0);
      $$2.a(aZ, this.cp());
      $$2.a(bb, false);
      $$2.a(ba, Optional.empty());
      $$2.a(bc, false);
      $$2.a(bd, false);
      $$2.a(ax, bsz.a);
      $$2.a(be, 0);
      this.a($$2);
      this.as = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.bo = this.bn.c();
   }

   public boolean a(ir $$0, dtc $$1) {
      exn $$2 = $$1.b(this.dU(), $$0, ewz.a(this));
      exn $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return exk.c($$3, exk.a(this.cP()), ewy.i);
   }

   public int q_() {
      eya $$0 = this.co();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean O_() {
      return false;
   }

   public final void ai() {
      if (this.bX()) {
         this.bM();
      }

      if (this.bW()) {
         this.ae();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.bg.e(new ewu($$0, $$1, $$2));
   }

   public aii aj() {
      return this.bg;
   }

   public bsb<?> ak() {
      return this.n;
   }

   @Override
   public int al() {
      return this.o;
   }

   public void e(int $$0) {
      this.o = $$0;
   }

   public Set<String> am() {
      return this.bk;
   }

   public boolean a(String $$0) {
      return this.bk.size() >= 1024 ? false : this.bk.add($$0);
   }

   public boolean b(String $$0) {
      return this.bk.remove($$0);
   }

   public void an() {
      this.a(brv.d.a);
      this.a(dxv.p);
   }

   public final void ao() {
      this.a(brv.d.b);
   }

   protected abstract void a(akc.a var1);

   public akc ap() {
      return this.as;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof brv ? ((brv)$$0).o == this.o : false;
   }

   @Override
   public int hashCode() {
      return this.o;
   }

   public void a(brv.d $$0) {
      this.b($$0);
   }

   public void aq() {
   }

   public void b(bsz $$0) {
      this.as.a(ax, $$0);
   }

   public bsz ar() {
      return this.as.a(ax);
   }

   public boolean c(bsz $$0) {
      return this.ar() == $$0;
   }

   public boolean a(brv $$0, double $$1) {
      return this.ds().a((jk)$$0.ds(), $$1);
   }

   public boolean a(brv $$0, double $$1, double $$2) {
      double $$3 = $$0.dz() - this.dz();
      double $$4 = $$0.dB() - this.dB();
      double $$5 = $$0.dF() - this.dF();
      return aym.e($$3, $$5) < aym.k($$1) && aym.k($$4) < aym.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.r($$0 % 360.0F);
      this.s($$1 % 360.0F);
   }

   public final void b(ewu $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.as());
   }

   protected ewp as() {
      return this.bn.a(this.s);
   }

   protected void at() {
      this.a_(this.s.c, this.s.d, this.s.e);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.s(this.dM() + $$2);
      this.r(this.dK() + $$3);
      this.s(aym.a(this.dM(), -90.0F, 90.0F));
      this.Q += $$2;
      this.P += $$3;
      this.Q = aym.a(this.Q, -90.0F, 90.0F);
      if (this.q != null) {
         this.q.k(this);
      }
   }

   public void l() {
      this.au();
   }

   public void au() {
      if (this.aK > 0) {
         if (--this.aK == 0) {
            this.aJ = null;
         } else if (this.aJ != null && this.aJ.d().dP()) {
            this.aJ = null;
         }
      }

      if (this.aL != null && this.aM > 0) {
         cpa $$0 = this.dU().b(this.aL);
         if ($$0 != null) {
            this.aJ = $$0;
            this.aL = null;
            this.aM = 0;
         } else if (--this.aM == 0 || this.aJ != null) {
            this.aL = null;
         }
      }

      this.dU().ag().a("entityBaseTick");
      this.bt = null;
      if (this.bW() && this.dh().dP()) {
         this.ae();
      }

      if (this.L > 0) {
         this.L--;
      }

      this.Z = this.aa;
      this.Q = this.dM();
      this.P = this.dK();
      this.ai *= 0.7F;
      this.ak = this.aj;
      if (this.ai > 0.0F) {
         this.aj = new ewu(
            (this.al.j() - this.al.j()) * (double)this.ai, (this.al.j() - this.al.j()) * (double)this.ai, (this.al.j() - this.al.j()) * (double)this.ai
         );
      } else {
         this.aj = ewu.b;
      }

      this.bT();
      if (this.bu()) {
         this.bw();
      }

      this.aG = this.aF;
      this.aF = false;
      this.bp();
      this.y();
      this.bo();
      if (this.dU().C) {
         this.aC();
      } else if (this.aT > 0) {
         if (this.bh()) {
            this.i(this.aT - 4);
            if (this.aT < 0) {
               this.aC();
            }
         } else {
            if (this.aT % 20 == 0 && !this.bx()) {
               this.a(this.dX().c(), 1.0F);
            }

            this.i(this.aT - 1);
         }

         if (this.cr() > 0) {
            this.l(0);
            this.dU().a(null, 1009, this.t, 1);
         }
      }

      if (this.bx()) {
         this.aA();
         this.ad *= 0.5F;
      }

      this.av();
      if (!this.dU().C) {
         this.c(this.aT > 0);
      }

      this.ar = false;
      this.dU().ag().c();
   }

   public void c(boolean $$0) {
      this.b(0, $$0 || this.bs);
   }

   public void av() {
      if (this.dB() < (double)(this.dU().J_() - 64)) {
         this.aD();
      }
   }

   public void aw() {
      this.bh = this.bU();
   }

   public void f(int $$0) {
      this.bh = $$0;
   }

   public int ax() {
      return this.bh;
   }

   public boolean ay() {
      return this.bh > 0;
   }

   protected void N() {
      if (this.ay()) {
         this.bh--;
      }
   }

   public int az() {
      return 0;
   }

   public void aA() {
      if (!this.bh()) {
         this.g(15);
         if (this.a(this.dX().d(), 4.0F)) {
            this.a(avo.kn, 0.4F, 2.0F + this.al.i() * 0.4F);
         }
      }
   }

   public final void g(int $$0) {
      this.h($$0 * 20);
   }

   public void h(int $$0) {
      if (this.aT < $$0) {
         this.i($$0);
      }
   }

   public void i(int $$0) {
      this.aT = $$0;
   }

   public int aB() {
      return this.aT;
   }

   public void aC() {
      this.i(0);
   }

   protected void aD() {
      this.ao();
   }

   public boolean g(double $$0, double $$1, double $$2) {
      return this.b(this.cP().d($$0, $$1, $$2));
   }

   private boolean b(ewp $$0) {
      return this.dU().b(this, $$0) && !this.dU().d($$0);
   }

   public void d(boolean $$0) {
      this.aQ = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, ewu $$1) {
      this.aQ = $$0;
      this.b($$0, $$1);
   }

   public boolean f(ir $$0) {
      return this.aI.isPresent() && this.aI.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable ewu $$1) {
      if ($$0) {
         ewp $$2 = this.cP();
         ewp $$3 = new ewp($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<ir> $$4 = this.r.g(this, $$3);
         if ($$4.isPresent() || this.bp) {
            this.aI = $$4;
         } else if ($$1 != null) {
            ewp $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
            $$4 = this.r.g(this, $$5);
            this.aI = $$4;
         }

         this.bp = $$4.isEmpty();
      } else {
         this.bp = false;
         if (this.aI.isPresent()) {
            this.aI = Optional.empty();
         }
      }
   }

   public boolean aE() {
      return this.aQ;
   }

   protected boolean aF() {
      return true;
   }

   public void a(bst $$0, ewu $$1) {
      if (this.aJ != null && this.aF()) {
         $$1 = $$1.e(this.aJ.j());
      }

      if (this.ah) {
         this.a_(this.dz() + $$1.c, this.dB() + $$1.d, this.dF() + $$1.e);
      } else {
         this.aH = this.bV();
         if ($$0 == bst.c) {
            $$1 = this.d($$1);
            if ($$1.equals(ewu.b)) {
               return;
            }
         }

         this.dU().ag().a("move");
         if (this.W.g() > 1.0E-7) {
            $$1 = $$1.h(this.W);
            this.W = ewu.b;
            this.g(ewu.b);
         }

         $$1 = this.a($$1, $$0);
         brv.a $$2 = this.a($$1);
         if ($$2.b != null) {
            this.aJ = $$2.b;
            this.aK = 30;
         }

         ewu $$3 = this.aJ != null ? this.aJ.j() : ewu.b;
         ewu $$4 = $$2.a;
         ewu $$5 = $$4.d($$3);
         double $$6 = $$4.g();
         if ($$6 > 1.0E-7) {
            if (this.ad != 0.0F && $$6 >= 1.0) {
               ewq $$7 = this.dU().a(new dbj(this.ds(), this.ds().e($$4), dbj.a.d, dbj.b.d, this));
               if ($$7.c() != ews.a.a) {
                  this.n();
               }
            }

            this.a_(this.dz() + $$4.c, this.dB() + $$4.d, this.dF() + $$4.e);
         }

         this.dU().ag().c();
         this.dU().ag().a("rest");
         boolean $$8 = !aym.b($$1.c, $$4.c);
         boolean $$9 = !aym.b($$1.e, $$4.e);
         this.R = $$8 || $$9;
         this.S = $$1.d != $$4.d;
         this.T = this.S && $$1.d < $$3.d;
         if (this.R) {
            this.U = this.c($$4);
         } else {
            this.U = false;
         }

         this.a(this.T, $$4);
         ir $$10 = this.aM();
         dtc $$11 = this.bv();
         this.a($$4.d, this.aE(), $$11, $$10);
         if (this.dP()) {
            this.dU().ag().c();
         } else {
            if (this.R) {
               ewu $$12 = this.dx();
               this.o($$8 ? 0.0 : $$12.c, $$12.d, $$9 ? 0.0 : $$12.e);
            }

            dfc $$13 = $$11.b();
            if ($$1.d != $$4.d) {
               $$13.a(this.dU(), this);
            }

            if (this.aE()) {
               $$13.a(this.dU(), $$10, $$11, this);
            }

            brv.c $$14 = this.bf();
            if ($$14.a() && !this.bW()) {
               double $$15 = $$5.c;
               double $$16 = $$5.d;
               double $$17 = $$5.e;
               this.ac = this.ac + (float)($$5.f() * 0.6);
               ir $$18 = this.aO();
               dtc $$19 = this.dU().a_($$18);
               boolean $$20 = this.c($$19);
               if (!$$20) {
                  $$16 = 0.0;
               }

               this.aa = this.aa + (float)$$5.h() * 0.6F;
               this.ab = this.ab + (float)Math.sqrt($$15 * $$15 + $$16 * $$16 + $$17 * $$17) * 0.6F;
               if (this.ab > this.aS && (!$$19.i() || this.aJ != null)) {
                  boolean $$21 = $$18.equals($$10);
                  boolean $$22 = this.a($$10, $$11, $$14.c(), $$21, $$1);
                  if (!$$21) {
                     $$22 |= this.a($$18, $$19, false, $$14.b(), $$1);
                  }

                  if ($$22) {
                     this.aS = this.aS();
                     if (this.aG()) {
                        this.aH();
                     }
                  } else if (this.bi()) {
                     this.aS = this.aS();
                     if ($$14.c()) {
                        this.aX();
                     }

                     if ($$14.b()) {
                        this.a(dxv.Q);
                     }
                  }
               } else if ($$19.i()) {
                  this.aL();
               }
            }

            this.aI();
            float $$23 = this.aQ();
            this.g(this.dx().d((double)$$23, 1.0, (double)$$23));
            if (this.dU().c(this.cP().h(1.0E-6)).noneMatch($$0x -> $$0x.a(awe.aM) || $$0x.a(dfe.am))) {
               if (this.aT <= 0) {
                  this.i(-this.dk());
               }

               if (this.aH && (this.aF || this.bk())) {
                  this.aJ();
               }
            }

            if (this.bV() && (this.aF || this.bk())) {
               this.i(-this.dk());
            }

            this.dU().ag().c();
         }
      }
   }

   public boolean aG() {
      return false;
   }

   protected void aH() {
      this.r.a(lb.S, this.dz(), this.dB() + 0.001, this.dF(), (double)this.aN, 0.0, 0.0);
   }

   private boolean c(dtc $$0) {
      return $$0.a(awe.aR) || $$0.a(dfe.sa);
   }

   private boolean a(ir $$0, dtc $$1, boolean $$2, boolean $$3, ewu $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aE() || $$5 || this.cf() && $$4.d == 0.0 || this.cn()) && !this.ch()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dU().a(dxv.P, this.ds(), dxv.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(ewu $$0) {
      return false;
   }

   protected void aI() {
      try {
         this.aW();
      } catch (Throwable var4) {
         o $$1 = o.a(var4, "Checking entity block collision");
         p $$2 = $$1.a("Entity being checked for collision");
         this.a($$2);
         throw new z($$1);
      }
   }

   protected void aJ() {
      this.a(avo.ks, 0.7F, 1.6F + (this.al.i() - this.al.i()) * 0.4F);
   }

   public void aK() {
      if (!this.dU().C && this.aH) {
         this.aJ();
      }

      this.aC();
   }

   protected void aL() {
      if (this.aZ()) {
         this.aY();
         if (this.bf().b()) {
            this.a(dxv.x);
         }
      }
   }

   @Deprecated
   public ir aM() {
      return this.d(0.2F);
   }

   protected ir aN() {
      return this.d(0.500001F);
   }

   public ir aO() {
      return this.d(1.0E-5F);
   }

   protected ir d(float $$0) {
      if (this.aI.isPresent()) {
         ir $$1 = this.aI.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dtc $$2 = this.dU().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(awe.S)) && !$$2.a(awe.L) && !($$2.b() instanceof die) ? $$1.h(aym.a(this.s.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = aym.a(this.s.c);
         int $$4 = aym.a(this.s.d - (double)$$0);
         int $$5 = aym.a(this.s.e);
         return new ir($$3, $$4, $$5);
      }
   }

   protected float aP() {
      float $$0 = this.dU().a_(this.du()).b().j();
      float $$1 = this.dU().a_(this.aN()).b().j();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aQ() {
      dtc $$0 = this.dU().a_(this.du());
      float $$1 = $$0.b().i();
      if (!$$0.a(dfe.al) && !$$0.a(dfe.ob)) {
         return (double)$$1 == 1.0 ? this.dU().a_(this.aN()).b().i() : $$1;
      } else {
         return $$1;
      }
   }

   protected ewu a(ewu $$0, bst $$1) {
      return $$0;
   }

   protected ewu d(ewu $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dU().Z();
         if ($$1 != this.bm) {
            Arrays.fill(this.bl, 0.0);
            this.bm = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(iw.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? ewu.b : new ewu($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(iw.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? ewu.b : new ewu(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(iw.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? ewu.b : new ewu(0.0, 0.0, $$4);
         } else {
            return ewu.b;
         }
      }
   }

   private double a(iw.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = aym.a($$1 + this.bl[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bl[$$2];
      this.bl[$$2] = $$3;
      return $$1;
   }

   public boolean aR() {
      return this.aJ != null;
   }

   private brv.a a(ewu $$0) {
      ewp $$1 = this.cP();
      List<exn> $$2 = this.dU().a(this, $$1.b($$0));
      brv.a $$3 = a(this, $$0, $$1, this.dU(), $$2);
      boolean $$4 = $$0.c != $$3.a.c;
      boolean $$5 = $$0.d != $$3.a.d;
      boolean $$6 = $$0.e != $$3.a.e;
      boolean $$7 = this.aE() || $$5 && $$0.d < 0.0;
      if (this.dO() > 0.0F && $$7 && ($$4 || $$6)) {
         ewu $$8 = $$3.a();
         ewu $$9 = a(this, new ewu($$0.c, $$8.d + (double)this.dO(), $$0.e), $$1, this.dU(), $$2).b($$8);
         ewu $$10 = a(this, $$8.b(0.0, (double)this.dO(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dU(), $$2).b($$8);
         if ($$10.d < (double)this.dO()) {
            ewu $$11 = a(this, new ewu($$0.c, 0.0, $$0.e), $$1.c($$10), this.dU(), $$2).a($$10).b($$8);
            if ($$11.i() > $$9.i()) {
               $$9 = $$11;
            }
         }

         if ($$9.i() > $$3.b($$8).i()) {
            ewu $$12 = a(this, $$8.b(0.0, -$$9.d + $$0.d, 0.0), $$1.c($$9), this.dU(), $$2).b($$8);
            return new brv.a($$12.e($$9).e($$8), $$3.b);
         }
      }

      return $$3;
   }

   public static brv.a a(@Nullable brv $$0, ewu $$1, ewp $$2, dca $$3, List<exn> $$4) {
      if ($$1.g() > 0.0) {
         $$1 = b($$0, $$1, $$2, $$3, $$4);
      }

      return a($$0, new brv.a($$1, null), $$2, $$3);
   }

   private static brv.a a(@Nullable brv $$0, brv.a $$1, ewp $$2, dca $$3) {
      if ($$0 != null && $$0.J) {
         return $$1;
      } else {
         List<exn> $$4 = new ArrayList<>();

         for (cpa $$5 : $$3.H()) {
            $$1 = a($$0, $$1, $$2, $$5, $$4);
            $$4.clear();
         }

         return $$1;
      }
   }

   private static brv.a a(@Nullable brv $$0, brv.a $$1, ewp $$2, cpa $$3, List<exn> $$4) {
      ewu $$5 = $$3.j();
      ewp $$6 = $$3.i();
      ewu $$7 = $$1.a.d($$5);
      ewp $$8 = $$2.b($$7);
      if (!$$6.c($$8)) {
         return $$1;
      } else {
         ewp $$9 = $$2.d(-$$6.a, -$$6.b, -$$6.c);
         ewp $$10 = $$8.d(-$$6.a, -$$6.b, -$$6.c);
         Iterables.addAll($$4, $$3.e($$0, $$10));
         ewu $$11 = a($$7, $$9, $$4);
         return $$11.equals($$7) ? $$1 : new brv.a($$11.e($$5), $$3);
      }
   }

   private static ewu b(@Nullable brv $$0, ewu $$1, ewp $$2, dca $$3, List<exn> $$4) {
      Builder<exn> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      dut $$6 = $$3.D_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.e($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static ewu a(ewu $$0, ewp $$1, List<exn> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = exk.a(iw.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = exk.a(iw.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = exk.a(iw.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = exk.a(iw.a.c, $$1, $$2, $$5);
         }

         return new ewu($$3, $$4, $$5);
      }
   }

   protected float aS() {
      return (float)((int)this.ab + 1);
   }

   protected avn aT() {
      return avo.kw;
   }

   protected avn aU() {
      return avo.kv;
   }

   protected avn aV() {
      return avo.kv;
   }

   protected void aW() {
      ewp $$0 = this.cP();
      ir $$1 = ir.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      ir $$2 = ir.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dU().a($$1, $$2)) {
         ir.a $$3 = new ir.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bI()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  dtc $$7 = this.dU().a_($$3);

                  try {
                     $$7.a(this.dU(), $$3, this);
                     this.a($$7);
                  } catch (Throwable var12) {
                     o $$9 = o.a(var12, "Colliding entity with block");
                     p $$10 = $$9.a("Block being collided with");
                     p.a($$10, this.dU(), $$3, $$7);
                     throw new z($$9);
                  }
               }
            }
         }
      }
   }

   protected void a(dtc $$0) {
   }

   public void a(ja<dxv> $$0, @Nullable brv $$1) {
      this.dU().a($$1, $$0, this.s);
   }

   public void a(ja<dxv> $$0) {
      this.a($$0, this);
   }

   private void c(ir $$0, dtc $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.r();
      }
   }

   protected void aX() {
      brv $$0 = Objects.requireNonNullElse(this.cV(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      ewu $$2 = $$0.dx();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected ir g(ir $$0) {
      ir $$1 = $$0.c();
      dtc $$2 = this.dU().a_($$1);
      return !$$2.a(awe.bp) && !$$2.a(awe.bq) ? $$0 : $$1;
   }

   protected void a(dtc $$0, dtc $$1) {
      dnd $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dtc $$0) {
      dnd $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(ir $$0, dtc $$1) {
      dnd $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dtc $$0) {
      return $$0.a(awe.bo) && this.am >= this.br + 20;
   }

   private void r() {
      this.bq = this.bq * (float)Math.pow(0.997, (double)(this.am - this.br));
      this.bq = Math.min(1.0F, this.bq + 0.07F);
      float $$0 = 0.5F + this.bq * this.al.i() * 1.2F;
      float $$1 = 0.1F + this.bq * 1.2F;
      this.a(avo.J, $$1, $$0);
      this.br = this.am;
   }

   protected void e(float $$0) {
      this.a(this.aT(), $$0, 1.0F + (this.al.i() - this.al.i()) * 0.4F);
   }

   protected void aY() {
   }

   protected boolean aZ() {
      return false;
   }

   public void a(avn $$0, float $$1, float $$2) {
      if (!this.ba()) {
         this.dU().a(null, this.dz(), this.dB(), this.dF(), $$0, this.dj(), $$1, $$2);
      }
   }

   public void a(avn $$0) {
      if (!this.ba()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean ba() {
      return this.as.a(bc);
   }

   public void e(boolean $$0) {
      this.as.a(bc, $$0);
   }

   public boolean bb() {
      return this.as.a(bd);
   }

   public void f(boolean $$0) {
      this.as.a(bd, $$0);
   }

   protected double bc() {
      return 0.0;
   }

   public final double bd() {
      if (this.aL != null) {
         return 0.0;
      } else {
         return this.bb() ? 0.0 : this.bc();
      }
   }

   protected void be() {
      double $$0 = this.bd();
      if ($$0 != 0.0) {
         this.g(this.dx().b(0.0, -$$0, 0.0));
      }
   }

   protected brv.c bf() {
      return brv.c.d;
   }

   public boolean bg() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dtc $$2, ir $$3) {
      if ($$1) {
         if (this.ad > 0.0F) {
            $$2.b().a(this.dU(), $$2, $$3, this, this.ad);
            this.dU().a(dxv.A, this.s, dxv.a.a(this, this.aI.<dtc>map($$0x -> this.dU().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ad -= (float)$$0;
      }
   }

   public boolean bh() {
      return this.ak().d();
   }

   public boolean a(float $$0, float $$1, bqt $$2) {
      if (this.n.a(awh.o)) {
         return false;
      } else {
         if (this.bX()) {
            for (brv $$3 : this.cX()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean bi() {
      return this.an;
   }

   private boolean u() {
      ir $$0 = this.du();
      return this.dU().r($$0) || this.dU().r(ir.a((double)$$0.u(), this.cP().e, (double)$$0.w()));
   }

   private boolean w() {
      return this.dv().a(dfe.ob);
   }

   public boolean bj() {
      return this.bi() || this.u();
   }

   public boolean bk() {
      return this.bi() || this.u() || this.w();
   }

   public boolean bl() {
      return this.bi() || this.w();
   }

   public boolean bm() {
      return this.bl() || this.bx();
   }

   public boolean bn() {
      return this.ap && this.bi();
   }

   public void bo() {
      if (this.ch()) {
         this.i(this.cg() && this.bi() && !this.bW());
      } else {
         this.i(this.cg() && this.bn() && !this.bW() && this.dU().b_(this.t).a(awj.a));
      }
   }

   protected boolean bp() {
      this.ao.clear();
      this.bq();
      double $$0 = this.dU().E_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(awj.b, $$0);
      return this.bi() || $$1;
   }

   void bq() {
      if (this.dh() instanceof cny $$0 && !$$0.bn()) {
         this.an = false;
         return;
      }

      if (this.a(awj.a, 0.014)) {
         if (!this.an && !this.ar) {
            this.br();
         }

         this.n();
         this.an = true;
         this.aC();
      } else {
         this.an = false;
      }
   }

   private void y() {
      this.ap = this.a(awj.a);
      this.aU.clear();
      double $$0 = this.dD();
      if (this.dh() instanceof cny $$2 && !$$2.bn() && $$2.cP().e >= $$0 && $$2.cP().b <= $$0) {
         return;
      }

      ir $$3 = ir.a(this.dz(), $$0, this.dF());
      epe $$4 = this.dU().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((dbg)this.dU(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aU::add);
      }
   }

   protected void br() {
      brv $$0 = Objects.requireNonNullElse(this.cV(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      ewu $$2 = $$0.dx();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aU(), $$3, 1.0F + (this.al.i() - this.al.i()) * 0.4F);
      } else {
         this.a(this.aV(), $$3, 1.0F + (this.al.i() - this.al.i()) * 0.4F);
      }

      float $$4 = (float)aym.a(this.dB());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bn.a() * 20.0F; $$5++) {
         double $$6 = (this.al.j() * 2.0 - 1.0) * (double)this.bn.a();
         double $$7 = (this.al.j() * 2.0 - 1.0) * (double)this.bn.a();
         this.dU().a(lb.d, this.dz() + $$6, (double)($$4 + 1.0F), this.dF() + $$7, $$2.c, $$2.d - this.al.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bn.a() * 20.0F; $$8++) {
         double $$9 = (this.al.j() * 2.0 - 1.0) * (double)this.bn.a();
         double $$10 = (this.al.j() * 2.0 - 1.0) * (double)this.bn.a();
         this.dU().a(lb.ak, this.dz() + $$9, (double)($$4 + 1.0F), this.dF() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(dxv.O);
   }

   @Deprecated
   protected dtc bs() {
      return this.bv();
   }

   public dtc bt() {
      return this.dU().a_(this.aO());
   }

   public boolean bu() {
      return this.cg() && !this.bi() && !this.O_() && !this.cf() && !this.bx() && this.bI();
   }

   protected dtc bv() {
      if (this.aJ != null) {
         ewu $$0 = this.s.d(this.aJ.d().ds());
         ir $$1 = ir.a($$0.b(0.0, -0.2F, 0.0));
         return this.aJ.a_($$1);
      } else {
         return this.dU().a_(this.aM());
      }
   }

   protected void bw() {
      ir $$0 = this.aM();
      dtc $$1 = this.bv();
      if ($$1.l() != dlw.a) {
         ewu $$2 = this.dx();
         ir $$3 = this.du();
         double $$4 = this.dz() + (this.al.j() - 0.5) * (double)this.bn.a();
         double $$5 = this.dF() + (this.al.j() - 0.5) * (double)this.bn.a();
         if ($$3.u() != $$0.u()) {
            $$4 = aym.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = aym.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dU().a(new ks(lb.b, $$1), $$4, this.dB() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(awt<epd> $$0) {
      return this.aU.contains($$0);
   }

   public boolean bx() {
      return !this.ar && this.ao.getDouble(awj.b) > 0.0;
   }

   public void a(float $$0, ewu $$1) {
      ewu $$2 = a($$1, $$0, this.dK());
      this.g(this.dx().e($$2));
   }

   private static ewu a(ewu $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return ewu.b;
      } else {
         ewu $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = aym.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = aym.b($$2 * (float) (Math.PI / 180.0));
         return new ewu($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float by() {
      return this.dU().e(this.dy(), this.dE()) ? this.dU().x(ir.a(this.dz(), this.dD(), this.dF())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.r($$3 % 360.0F);
      this.s(aym.a($$4, -90.0F, 90.0F) % 360.0F);
      this.P = this.dK();
      this.Q = this.dM();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = aym.a($$0, -3.0E7, 3.0E7);
      double $$4 = aym.a($$2, -3.0E7, 3.0E7);
      this.M = $$3;
      this.N = $$1;
      this.O = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(ewu $$0) {
      this.e($$0.c, $$0.d, $$0.e);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dK(), this.dM());
   }

   public void a(ir $$0, float $$1, float $$2) {
      this.b((double)$$0.u() + 0.5, (double)$$0.v(), (double)$$0.w() + 0.5, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.p($$0, $$1, $$2);
      this.r($$3);
      this.s($$4);
      this.bz();
      this.at();
   }

   public final void bz() {
      double $$0 = this.dz();
      double $$1 = this.dB();
      double $$2 = this.dF();
      this.M = $$0;
      this.N = $$1;
      this.O = $$2;
      this.ae = $$0;
      this.af = $$1;
      this.ag = $$2;
      this.P = this.dK();
      this.Q = this.dM();
   }

   public float f(brv $$0) {
      float $$1 = (float)(this.dz() - $$0.dz());
      float $$2 = (float)(this.dB() - $$0.dB());
      float $$3 = (float)(this.dF() - $$0.dF());
      return aym.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dz() - $$0;
      double $$4 = this.dB() - $$1;
      double $$5 = this.dF() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(brv $$0) {
      return this.f($$0.ds());
   }

   public double f(ewu $$0) {
      double $$1 = this.dz() - $$0.c;
      double $$2 = this.dB() - $$0.d;
      double $$3 = this.dF() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cly $$0) {
   }

   public void h(brv $$0) {
      if (!this.y($$0)) {
         if (!$$0.ah && !this.ah) {
            double $$1 = $$0.dz() - this.dz();
            double $$2 = $$0.dF() - this.dF();
            double $$3 = aym.a($$1, $$2);
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
               if (!this.bX() && this.bF()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.bX() && $$0.bF()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void j(double $$0, double $$1, double $$2) {
      this.g(this.dx().b($$0, $$1, $$2));
      this.az = true;
   }

   protected void bA() {
      this.V = true;
   }

   public boolean a(bqt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bA();
         return false;
      }
   }

   public final ewu f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public iw bB() {
      return iw.a(this.f(1.0F));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dM() : aym.i($$0, this.Q, this.dM());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dK() : aym.i($$0, this.P, this.dK());
   }

   public final ewu b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = aym.b($$3);
      float $$5 = aym.a($$3);
      float $$6 = aym.b($$2);
      float $$7 = aym.a($$2);
      return new ewu((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final ewu i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final ewu c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final ewu bC() {
      return new ewu(this.dz(), this.dD(), this.dF());
   }

   public final ewu j(float $$0) {
      double $$1 = aym.d((double)$$0, this.M, this.dz());
      double $$2 = aym.d((double)$$0, this.N, this.dB()) + (double)this.cQ();
      double $$3 = aym.d((double)$$0, this.O, this.dF());
      return new ewu($$1, $$2, $$3);
   }

   public ewu k(float $$0) {
      return this.j($$0);
   }

   public final ewu l(float $$0) {
      double $$1 = aym.d((double)$$0, this.M, this.dz());
      double $$2 = aym.d((double)$$0, this.N, this.dB());
      double $$3 = aym.d((double)$$0, this.O, this.dF());
      return new ewu($$1, $$2, $$3);
   }

   public ews a(double $$0, float $$1, boolean $$2) {
      ewu $$3 = this.j($$1);
      ewu $$4 = this.f($$1);
      ewu $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dU().a(new dbj($$3, $$5, dbj.a.b, $$2 ? dbj.b.c : dbj.b.a, this));
   }

   public boolean bD() {
      return this.bI() && this.bE();
   }

   public boolean bE() {
      return false;
   }

   public boolean bF() {
      return false;
   }

   public void a(brv $$0, int $$1, bqt $$2) {
      if ($$0 instanceof aqu) {
         an.d.a((aqu)$$0, this, $$2);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.dz() - $$0;
      double $$4 = this.dB() - $$1;
      double $$5 = this.dF() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cP().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * m;
      return $$0 < $$1 * $$1;
   }

   public boolean d(uk $$0) {
      if (this.aR != null && !this.aR.b()) {
         return false;
      } else {
         String $$1 = this.bH();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.f($$0);
            return true;
         }
      }
   }

   public boolean e(uk $$0) {
      return this.bW() ? false : this.d($$0);
   }

   public uk f(uk $$0) {
      try {
         if (this.q != null) {
            $$0.a("Pos", this.a(this.q.dz(), this.dB(), this.q.dF()));
         } else {
            $$0.a("Pos", this.a(this.dz(), this.dB(), this.dF()));
         }

         ewu $$1 = this.dx();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dK(), this.dM()));
         $$0.a("FallDistance", this.ad);
         $$0.a("Fire", (short)this.aT);
         $$0.a("Air", (short)this.cq());
         $$0.a("OnGround", this.aE());
         $$0.a("Invulnerable", this.bi);
         $$0.a("PortalCooldown", this.bh);
         $$0.a("UUID", this.cE());
         xe $$2 = this.ah();
         if ($$2 != null) {
            $$0.a("CustomName", xe.a.a($$2, this.dY()));
         }

         if (this.cJ()) {
            $$0.a("CustomNameVisible", this.cJ());
         }

         if (this.ba()) {
            $$0.a("Silent", this.ba());
         }

         if (this.bb()) {
            $$0.a("NoGravity", this.bb());
         }

         if (this.bj) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.cr();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.cr());
         }

         if (this.bs) {
            $$0.a("HasVisualFire", this.bs);
         }

         if (!this.bk.isEmpty()) {
            uq $$4 = new uq();

            for (String $$5 : this.bk) {
               $$4.add(vf.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.aJ != null) {
            $$0.a("attached_to_grid", this.aJ.c());
         }

         if (this.bX()) {
            uq $$6 = new uq();

            for (brv $$7 : this.cX()) {
               uk $$8 = new uk();
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
         throw new z($$10);
      }
   }

   public void g(uk $$0) {
      try {
         uq $$1 = $$0.c("Pos", 6);
         uq $$2 = $$0.c("Motion", 6);
         uq $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(aym.a($$1.h(0), -3.0000512E7, 3.0000512E7), aym.a($$1.h(1), -2.0E7, 2.0E7), aym.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.r($$3.i(0));
         this.s($$3.i(1));
         this.bz();
         this.n(this.dK());
         this.o(this.dK());
         this.ad = $$0.j("FallDistance");
         this.aT = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.k($$0.g("Air"));
         }

         this.aQ = $$0.q("OnGround");
         this.bi = $$0.q("Invulnerable");
         this.bh = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.aD = $$0.a("UUID");
            this.aE = this.aD.toString();
         }

         if ($$0.b("attached_to_grid")) {
            this.aL = $$0.a("attached_to_grid");
            this.aM = 40;
         }

         if (!Double.isFinite(this.dz()) || !Double.isFinite(this.dB()) || !Double.isFinite(this.dF())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dK()) && Double.isFinite((double)this.dM())) {
            this.at();
            this.a(this.dK(), this.dM());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(xe.a.a($$8, this.dY()));
               } catch (Exception var16) {
                  b.warn("Failed to parse entity custom name {}", $$8, var16);
               }
            }

            this.o($$0.q("CustomNameVisible"));
            this.e($$0.q("Silent"));
            this.f($$0.q("NoGravity"));
            this.j($$0.q("Glowing"));
            this.l($$0.h("TicksFrozen"));
            this.bs = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.bk.clear();
               uq $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.bk.add($$10.j($$12));
               }
            }

            this.a($$0);
            if (this.bG()) {
               this.at();
            }
         } else {
            throw new IllegalStateException("Entity has invalid rotation");
         }
      } catch (Throwable var17) {
         o $$14 = o.a(var17, "Loading entity NBT");
         p $$15 = $$14.a("Entity being loaded");
         this.a($$15);
         throw new z($$14);
      }
   }

   protected boolean bG() {
      return true;
   }

   @Nullable
   protected final String bH() {
      bsb<?> $$0 = this.ak();
      akt $$1 = bsb.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(uk var1);

   protected abstract void b(uk var1);

   protected uq a(double... $$0) {
      uq $$1 = new uq();

      for (double $$2 : $$0) {
         $$1.add(ul.a($$2));
      }

      return $$1;
   }

   protected uq a(float... $$0) {
      uq $$1 = new uq();

      for (float $$2 : $$0) {
         $$1.add(un.a($$2));
      }

      return $$1;
   }

   @Nullable
   public cig a(dbz $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public cig a(dbz $$0, int $$1) {
      return this.a(new cuh($$0), (float)$$1);
   }

   @Nullable
   public cig b(cuh $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public cig a(cuh $$0, float $$1) {
      if ($$0.d()) {
         return null;
      } else if (this.dU().C) {
         return null;
      } else {
         cig $$2 = new cig(this.dU(), this.dz(), this.dB() + (double)$$1, this.dF(), $$0);
         $$2.u();
         this.dU().b($$2);
         return $$2;
      }
   }

   public boolean bI() {
      return !this.dP();
   }

   public boolean bJ() {
      if (this.ah) {
         return false;
      } else {
         float $$0 = this.bn.a() * 0.8F;
         ewp $$1 = ewp.a(this.bC(), (double)$$0, 1.0E-6, (double)$$0);
         return ir.a($$1)
            .anyMatch(
               $$1x -> {
                  dtc $$2 = this.dU().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dU(), $$1x)
                     && exk.c($$2.k(this.dU(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), exk.a($$1), ewy.i);
               }
            );
      }
   }

   public bqa a(cly $$0, bpz $$1) {
      return bqa.d;
   }

   public boolean i(brv $$0) {
      return $$0.bK() && !this.y($$0);
   }

   public boolean bK() {
      return false;
   }

   public void v() {
      this.g(ewu.b);
      this.l();
      if (this.bW()) {
         this.dh().j(this);
      }
   }

   public final void j(brv $$0) {
      if (this.x($$0)) {
         this.a($$0, brv::a_);
      }
   }

   protected void a(brv $$0, brv.b $$1) {
      ewu $$2 = this.m($$0);
      ewu $$3 = $$0.l(this);
      $$1.accept($$0, $$2.c - $$3.c, $$2.d - $$3.d, $$2.e - $$3.e);
   }

   public void k(brv $$0) {
   }

   public ewu l(brv $$0) {
      return this.dr().b(brw.b, 0, this.aN);
   }

   public ewu m(brv $$0) {
      return this.ds().e(this.a($$0, this.bn, 1.0F));
   }

   protected ewu a(brv $$0, bry $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static ewu a(brv $$0, brv $$1, brx $$2) {
      int $$3 = $$0.cX().indexOf($$1);
      return $$2.c(brw.a, $$3, $$0.aN);
   }

   public boolean n(brv $$0) {
      return this.a($$0, false);
   }

   public boolean bL() {
      return this instanceof bso;
   }

   public boolean a(brv $$0, boolean $$1) {
      if ($$0 == this.q) {
         return false;
      } else if (!$$0.bO()) {
         return false;
      } else {
         for (brv $$2 = $$0; $$2.q != null; $$2 = $$2.q) {
            if ($$2.q == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bW()) {
               this.ae();
            }

            this.b(bsz.a);
            this.q = $$0;
            this.q.p(this);
            $$0.A().filter($$0x -> $$0x instanceof aqu).forEach($$0x -> an.U.a((aqu)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(brv $$0) {
      return !this.ca() && this.L <= 0;
   }

   public void bM() {
      for (int $$0 = this.p.size() - 1; $$0 >= 0; $$0--) {
         ((brv)this.p.get($$0)).ae();
      }
   }

   public void bN() {
      if (this.q != null) {
         brv $$0 = this.q;
         this.q = null;
         $$0.q(this);
      }
   }

   public void ae() {
      this.bN();
   }

   protected void p(brv $$0) {
      if ($$0.dh() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.p.isEmpty()) {
            this.p = ImmutableList.of($$0);
         } else {
            List<brv> $$1 = Lists.newArrayList(this.p);
            if (!this.dU().C && $$0 instanceof cly && !(this.cY() instanceof cly)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.p = ImmutableList.copyOf($$1);
         }

         this.a(dxv.s, $$0);
      }
   }

   protected void q(brv $$0) {
      if ($$0.dh() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.p.size() == 1 && this.p.get(0) == $$0) {
            this.p = ImmutableList.of();
         } else {
            this.p = this.p.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.L = 60;
         this.a(dxv.q, $$0);
      }
   }

   protected boolean r(brv $$0) {
      return this.p.isEmpty();
   }

   protected boolean bO() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public double c_() {
      return this.dz();
   }

   public double d_() {
      return this.dB();
   }

   public double M_() {
      return this.dF();
   }

   public float N_() {
      return this.dM();
   }

   public float e_() {
      return this.dK();
   }

   public void a(float $$0, int $$1) {
      this.n($$0);
   }

   public float bP() {
      return 0.0F;
   }

   public ewu bQ() {
      return this.b(this.dM(), this.dK());
   }

   public ewu a(cuc $$0) {
      if (!(this instanceof cly $$1)) {
         return ewu.b;
      } else {
         boolean $$2 = $$1.fh().a($$0) && !$$1.fg().a($$0);
         bsi $$3 = $$2 ? $$1.fD().e() : $$1.fD();
         return this.b(0.0F, this.dK() + (float)($$3 == bsi.b ? 80 : -80)).a(0.5);
      }
   }

   public ewt bR() {
      return new ewt(this.dM(), this.dK());
   }

   public ewu bS() {
      return ewu.a(this.bR());
   }

   public void h(ir $$0) {
      if (this.ay()) {
         this.aw();
      } else {
         if (!this.dU().C && !$$0.equals(this.aC)) {
            this.aC = $$0.i();
         }

         this.aA = true;
      }
   }

   protected void bT() {
      if (this.dU() instanceof aqt $$0) {
         int var11 = this.az();
         if (this.aA) {
            MinecraftServer $$3 = $$0.o();
            dtc $$4 = $$0.a_(this.aC);
            boolean $$5 = $$4.a(dfe.eS);
            boolean $$6 = this.r.a_(this.aC.d()).a(dfe.eT);
            aks<dca> $$7 = $$5 ? (this.dU().z_() ? dca.h : dca.k) : (this.dU().af() == dca.i ? dca.h : dca.i);
            aqt $$8 = $$3.a($$7);
            if ($$8 != null && ($$3.G() || $$5) && !this.bW() && this.aB++ >= var11) {
               this.dU().ag().a("portal");
               this.aB = var11;
               this.aw();
               this.b($$8, $$6);
               if (this instanceof aqu $$9 && $$5 && this.dU().z_() && !$$9.d("dimension")) {
                  $$9.c("dimension");
               }

               this.dU().ag().c();
            }

            this.aA = false;
         } else {
            if (this.aB > 0) {
               this.aB -= 4;
            }

            if (this.aB < 0) {
               this.aB = 0;
            }
         }

         this.N();
      }
   }

   public int bU() {
      return 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
   }

   public void c(bqt $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dja.a(this);
      }
   }

   public void m(float $$0) {
   }

   public boolean bV() {
      boolean $$0 = this.dU() != null && this.dU().C;
      return !this.bh() && (this.aT > 0 || $$0 && this.j(0));
   }

   public boolean bW() {
      return this.dh() != null;
   }

   public boolean bX() {
      return !this.p.isEmpty();
   }

   public boolean bY() {
      return this.ak().a(awh.p);
   }

   public boolean bZ() {
      return !this.ak().a(awh.q);
   }

   public void g(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean ca() {
      return this.j(1);
   }

   public boolean cb() {
      return this.ca();
   }

   public boolean cc() {
      return this.ca();
   }

   public boolean cd() {
      return this.ca();
   }

   public boolean ce() {
      return this.ca();
   }

   public boolean cf() {
      return this.c(bsz.f);
   }

   public boolean cg() {
      return this.j(3);
   }

   public void h(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean ch() {
      return this.j(4);
   }

   public boolean ci() {
      return this.c(bsz.d);
   }

   public boolean cj() {
      return this.ci() && !this.bi();
   }

   public void i(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean ck() {
      return this.bj;
   }

   public final void j(boolean $$0) {
      this.bj = $$0;
      this.b(6, this.cl());
   }

   public boolean cl() {
      return this.dU().x_() ? this.j(6) : this.bj;
   }

   public boolean cm() {
      return this.j(5);
   }

   public boolean d(cly $$0) {
      if ($$0.O_()) {
         return false;
      } else {
         eya $$1 = this.co();
         return $$1 != null && $$0 != null && $$0.co() == $$1 && $$1.i() ? false : this.cm();
      }
   }

   public boolean cn() {
      return false;
   }

   public void a(BiConsumer<dxs<?>, aqt> $$0) {
   }

   @Nullable
   public ext co() {
      return this.dU().M().e(this.cG());
   }

   public boolean s(brv $$0) {
      return this.a($$0.co());
   }

   public boolean a(eya $$0) {
      return this.co() != null ? this.co().a($$0) : false;
   }

   public void k(boolean $$0) {
      this.b(5, $$0);
   }

   protected boolean j(int $$0) {
      return (this.as.a(at) & 1 << $$0) != 0;
   }

   protected void b(int $$0, boolean $$1) {
      byte $$2 = this.as.a(at);
      if ($$1) {
         this.as.a(at, (byte)($$2 | 1 << $$0));
      } else {
         this.as.a(at, (byte)($$2 & ~(1 << $$0)));
      }
   }

   public int cp() {
      return 300;
   }

   public int cq() {
      return this.as.a(aZ);
   }

   public void k(int $$0) {
      this.as.a(aZ, $$0);
   }

   public int cr() {
      return this.as.a(be);
   }

   public void l(int $$0) {
      this.as.a(be, $$0);
   }

   public float cs() {
      int $$0 = this.cu();
      return (float)Math.min(this.cr(), $$0) / (float)$$0;
   }

   public boolean ct() {
      return this.cr() >= this.cu();
   }

   public int cu() {
      return 140;
   }

   public void a(aqt $$0, bsn $$1) {
      this.i(this.aT + 1);
      if (this.aT == 0) {
         this.g(8);
      }

      this.a(this.dX().b(), 5.0F);
   }

   public void l(boolean $$0) {
      ewu $$1 = this.dx();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void m(boolean $$0) {
      ewu $$1 = this.dx();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(aqt $$0, bso $$1) {
      return true;
   }

   public void cv() {
      if (this.dx().b() > -0.5 && this.ad > 1.0F) {
         this.ad = 1.0F;
      }
   }

   public void n() {
      this.ad = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      ir $$3 = ir.a($$0, $$1, $$2);
      ewu $$4 = new ewu($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      ir.a $$5 = new ir.a();
      iw $$6 = iw.b;
      double $$7 = Double.MAX_VALUE;

      for (iw $$8 : new iw[]{iw.c, iw.d, iw.e, iw.f, iw.b}) {
         $$5.a($$3, $$8);
         if (!this.dU().a_($$5).r(this.dU(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == iw.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.al.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      ewu $$13 = this.dx().a(0.75);
      if ($$6.o() == iw.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == iw.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == iw.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dtc $$0, ewu $$1) {
      this.n();
      this.W = $$1;
   }

   private static xe c(xe $$0) {
      xs $$1 = $$0.e().b($$0.a().a(null));

      for (xe $$2 : $$0.c()) {
         $$1.a(c($$2));
      }

      return $$1;
   }

   @Override
   public xe af() {
      xe $$0 = this.ah();
      return $$0 != null ? c($$0) : this.cw();
   }

   protected xe cw() {
      return this.n.h();
   }

   public boolean t(brv $$0) {
      return this == $$0;
   }

   public float cx() {
      return 0.0F;
   }

   public void n(float $$0) {
   }

   public void o(float $$0) {
   }

   public boolean cy() {
      return true;
   }

   public boolean u(brv $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dU() == null ? "~NULL~" : this.dU().toString();
      return this.aR != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.af().getString(),
            this.o,
            $$0,
            this.dz(),
            this.dB(),
            this.dF(),
            this.aR
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.af().getString(),
            this.o,
            $$0,
            this.dz(),
            this.dB(),
            this.dF()
         );
   }

   public boolean b(bqt $$0) {
      return this.dP() || this.bi && !$$0.a(awg.e) && !$$0.g() || $$0.a(awg.j) && this.bh() || $$0.a(awg.n) && this.ak().a(awh.o);
   }

   public boolean cz() {
      return this.bi;
   }

   public void n(boolean $$0) {
      this.bi = $$0;
   }

   public void v(brv $$0) {
      this.b($$0.dz(), $$0.dB(), $$0.dF(), $$0.dK(), $$0.dM());
   }

   public void w(brv $$0) {
      uk $$1 = $$0.f(new uk());
      $$1.r("Dimension");
      this.g($$1);
      this.bh = $$0.bh;
      this.aC = $$0.aC;
   }

   @Nullable
   public brv b(aqt $$0, boolean $$1) {
      if (this.dU() instanceof aqt && !this.dP()) {
         this.dU().ag().a("changeDimension");
         this.ai();
         this.dU().ag().a("reposition");
         eqd $$2 = this.a($$0, $$1);
         if ($$2 == null) {
            return null;
         } else {
            this.dU().ag().b("reloading");
            brv $$3 = this.ak().a((dca)$$0);
            if ($$3 != null) {
               $$3.w(this);
               $$3.b($$2.a.c, $$2.a.d, $$2.a.e, $$2.c, $$3.dM());
               $$3.g($$2.b);
               $$0.d($$3);
               if ($$0.af() == dca.j) {
                  aqt.a($$0);
               }
            }

            this.cA();
            this.dU().ag().c();
            ((aqt)this.dU()).h();
            $$0.h();
            this.dU().ag().c();
            return $$3;
         }
      } else {
         return null;
      }
   }

   protected void cA() {
      this.b(brv.d.e);
   }

   @Nullable
   protected eqd a(aqt $$0, boolean $$1) {
      boolean $$2 = $$0.z_() || this.dU().z_();
      aqt $$3 = (aqt)this.dU();
      if ($$2) {
         dut $$4 = $$0.D_();
         double $$5 = dwu.a(this.dU().E_(), $$0.E_());
         ir $$6 = $$4.b((double)this.aC.u() * $$5, (double)aym.a(this.aC.v(), $$0.J_() + 1, $$0.am() - 1), (double)this.aC.w() * $$5);
         eqd $$7 = null;
         if ($$1) {
            $$7 = this.a($$0, $$3, $$6);
         }

         if ($$7 == null) {
            $$7 = this.a($$0, $$6);
         }

         $$3.l().a(aqy.f, new dbh(this.aC), 3, this.aC);
         ir $$8 = ir.a($$7.a);
         $$0.l().a(aqy.f, new dbh($$8), 3, $$8);
         return $$7;
      } else {
         boolean $$9 = this.dU().af() == dca.j && $$0.af() == dca.h;
         boolean $$10 = $$0.af() == dca.j;
         if (!$$9 && !$$10) {
            boolean $$14 = $$0.af() == dca.i;
            if (this.dU().af() != dca.i && !$$14) {
               return null;
            } else {
               dut $$15 = $$0.D_();
               double $$16 = dwu.a(this.dU().E_(), $$0.E_());
               ir $$17 = $$15.b(this.dz() * $$16, this.dB(), this.dF() * $$16);
               return this.a($$0, $$17, $$14, $$15).map($$1x -> {
                  dtc $$2x = this.dU().a_(this.aC);
                  iw.a $$3x;
                  ewu $$5x;
                  if ($$2x.b(dts.H)) {
                     $$3x = $$2x.c(dts.H);
                     l.a $$4x = l.a(this.aC, $$3x, 21, iw.a.b, 21, $$1xx -> this.dU().a_($$1xx) == $$2x);
                     $$5x = this.a($$3x, $$4x);
                  } else {
                     $$3x = iw.a.a;
                     $$5x = new ewu(0.5, 0.0, 0.0);
                  }

                  return eqe.a($$0, $$1x, $$3x, $$5x, this, this.dx(), this.dK(), this.dM());
               }).orElse(null);
            }
         } else {
            ir $$11 = $$10 ? aqt.a : $$0.V();
            $$0.l().a(aqy.f, new dbh($$11), 3, $$11);
            int $$12;
            if ($$10) {
               $$12 = $$11.v();
            } else {
               $$12 = $$0.m($$11).a(dyu.a.f, $$11.u(), $$11.w()) + 1;
            }

            return new eqd(new ewu((double)$$11.u() + 0.5, (double)$$12, (double)$$11.w() + 0.5), this.dx(), this.dK(), this.dM());
         }
      }
   }

   private eqd a(aqt $$0, ir $$1) {
      ewu $$2 = this.s.d(ewu.a(this.aC));
      cdr $$3 = $$0.y();
      $$3.a($$0, $$1, 64, dvx.c);
      ir $$4 = $$3.d($$0x -> $$0x.a(cdv.u), $$1, 64, cdr.b.c).or(() -> b($$0, $$1)).orElseGet(() -> e($$0, $$1));
      if (!$$0.a_($$4).a(dfe.eS) && $$0.u($$4)) {
         $$0.a($$4, dfe.eS.n(), 3);
      }

      return new eqd(ewu.a($$4).e($$2), this.dx(), this.dK(), this.dM());
   }

   private static Optional<ir> b(aqt $$0, ir $$1) {
      return ir.a($$1, 32, 32, $$1x -> c($$0, $$1x.d()) && $$0.u($$1x) && $$0.u($$1x.c()));
   }

   private static boolean c(aqt $$0, ir $$1) {
      dtc $$2 = $$0.a_($$1);
      return !$$2.a(dfe.Q) && $$2.d($$0, $$1, iw.b);
   }

   private static Optional<ir> d(aqt $$0, ir $$1) {
      return ir.a($$1, 32, 32, $$1x -> $$0.a_($$1x.d()).a(dfe.eT) && ($$0.u($$1x) || $$0.a_($$1x).r()));
   }

   private static ir e(aqt $$0, ir $$1) {
      if (!$$0.a_($$1.d()).d($$0, $$1, iw.b)) {
         $$0.a($$1.d(), $$0.z_() ? dfe.k.n() : dfe.j.n(), 3);
      }

      $$0.a($$1, dfe.oa.n(), 3);
      $$0.a($$1.c(), dfe.oa.n(), 3);
      return $$1;
   }

   @Nullable
   private eqd a(aqt $$0, aqt $$1, ir $$2) {
      ewu $$3 = this.s.d(ewu.a(this.aC));

      for (Pair<aks<ejt>, aks<ejt>> $$4 : bv) {
         aks<ejt> $$5 = $$1.z_() ? (aks)$$4.getSecond() : (aks)$$4.getFirst();
         if ($$1.a().a(this.aC, $$1x -> $$1x.a($$5)).b()) {
            aks<ejt> $$6 = $$1.z_() ? (aks)$$4.getFirst() : (aks)$$4.getSecond();
            je<ejt> $$7 = je.a(this.dY().d(li.aJ).b($$6).orElseThrow());
            Pair<ir, ja<ejt>> $$8 = $$0.l().g().a($$0, $$7, $$2, 128, false);
            if ($$8 != null) {
               dbh $$9 = new dbh((ir)$$8.getFirst());
               duy $$10 = $$0.a($$9.e, $$9.f, dvx.j);
               ekb $$11 = $$0.a().a(jt.a($$10), (ejt)((ja)$$8.getSecond()).a(), $$10);
               if ($$11 != null && $$11.b() && !$$11.i().isEmpty()) {
                  ejx $$12 = $$6 == ejn.l ? $$11.i().stream().filter($$0x -> $$0x instanceof emk.g).findFirst().orElse($$11.i().get(0)) : $$11.i().get(0);
                  ir $$13 = $$12.f().g();
                  cdr $$14 = $$0.y();
                  $$14.a($$0, $$13, 64, dvx.n);
                  System.out.println("Counts on the other side: " + $$14.b($$0x -> true, $$13, 64, cdr.b.c).count());
                  ir $$15 = $$14.d($$0x -> $$0x.a(cdv.u), $$13.c(16), 64, cdr.b.c).or(() -> $$14.e($$0xx -> $$0xx.a(cdv.v), $$1xx -> {
                        ir $$2xx = $$1xx.c();
                        dtc $$3x = $$0.a_($$2xx);
                        return $$3x.k($$0, $$2xx).c() || $$3x.r();
                     }, $$13.c(16), 64, cdr.b.c).map(ir::c)).or(() -> d($$0, $$13.c(8))).or(() -> b($$0, $$13.c(8))).orElseGet(() -> e($$0, $$13));
                  if ($$0.a_($$15.d()).a(dfe.eT) && !$$0.a_($$15).a(dfe.eS)) {
                     $$0.a($$15, dfe.eS.n(), 3);
                  }

                  return new eqd(ewu.a($$15).e($$3), this.dx(), this.dK(), this.dM());
               }
            }
         }
      }

      return null;
   }

   protected ewu a(iw.a $$0, l.a $$1) {
      return eqe.a($$1, $$0, this.ds(), this.a(this.ar()));
   }

   protected Optional<l.a> a(aqt $$0, ir $$1, boolean $$2, dut $$3) {
      return $$0.p().a($$1, $$2, $$3);
   }

   public boolean cB() {
      return !this.bW() && !this.bX();
   }

   public float a(dbs $$0, dbg $$1, ir $$2, dtc $$3, epe $$4, float $$5) {
      return $$5;
   }

   public boolean a(dbs $$0, dbg $$1, ir $$2, dtc $$3, float $$4) {
      return true;
   }

   public int cC() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bsb.a(this.ak()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.o);
      $$0.a("Entity Name", () -> this.af().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dz(), this.dB(), this.dF()));
      $$0.a("Entity's Block location", p.a(this.dU(), aym.a(this.dz()), aym.a(this.dB()), aym.a(this.dF())));
      ewu $$1 = this.dx();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", () -> this.cX().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.dh()));
   }

   public boolean cD() {
      return this.bV() && !this.O_();
   }

   public void a_(UUID $$0) {
      this.aD = $$0;
      this.aE = this.aD.toString();
   }

   @Override
   public UUID cE() {
      return this.aD;
   }

   public String cF() {
      return this.aE;
   }

   @Override
   public String cG() {
      return this.aE;
   }

   public boolean cH() {
      return true;
   }

   public static double cI() {
      return m;
   }

   public static void b(double $$0) {
      m = $$0;
   }

   @Override
   public xe P_() {
      return ext.a(this.co(), this.af()).a($$0 -> $$0.a(this.cO()).a(this.cF()));
   }

   public void b(@Nullable xe $$0) {
      this.as.a(ba, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public xe ah() {
      return this.as.a(ba).orElse(null);
   }

   @Override
   public boolean ag() {
      return this.as.a(ba).isPresent();
   }

   public void o(boolean $$0) {
      this.as.a(bb, $$0);
   }

   public boolean cJ() {
      return this.as.a(bb);
   }

   public final void n(double $$0, double $$1, double $$2) {
      if (this.dU() instanceof aqt) {
         dbh $$3 = new dbh(ir.a($$0, $$1, $$2));
         ((aqt)this.dU()).l().a(aqy.g, $$3, 0, this.al());
         this.dU().c($$3.e, $$3.f);
         this.c($$0, $$1, $$2);
      }
   }

   public boolean a(aqt $$0, double $$1, double $$2, double $$3, Set<btb> $$4, float $$5, float $$6) {
      float $$7 = aym.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dU()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.z();
         this.n($$5);
      } else {
         this.ai();
         brv $$8 = this.ak().a((dca)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(brv.d.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dU() instanceof aqt) {
         this.b($$0, $$1, $$2, this.dK(), this.dM());
         this.z();
      }
   }

   private void z() {
      this.cZ().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.p.iterator();

         while (var1.hasNext()) {
            brv $$1 = (brv)var1.next();
            $$0.a($$1, brv::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.dz() + $$0, this.dB() + $$1, this.dF() + $$2);
   }

   public boolean cK() {
      return this.cJ();
   }

   @Override
   public void a(List<akc.c<?>> $$0) {
   }

   @Override
   public void a(ajy<?> $$0) {
      if (ax.equals($$0)) {
         this.i_();
      }
   }

   @Deprecated
   protected void cL() {
      bsz $$0 = this.ar();
      bry $$1 = this.a($$0);
      this.bn = $$1;
      this.bo = $$1.c();
   }

   public void i_() {
      bry $$0 = this.bn;
      bsz $$1 = this.ar();
      bry $$2 = this.a($$1);
      this.bn = $$2;
      this.bo = $$2.c();
      this.at();
      boolean $$3 = (double)$$2.a() <= 4.0 && (double)$$2.b() <= 4.0;
      if (!this.dU().C && !this.ar && !this.ah && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cly)) {
         ewu $$4 = this.ds().b(0.0, (double)$$0.b() / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a() - $$0.a()) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b() - $$0.b()) + 1.0E-6;
         exn $$7 = exk.a(ewp.a($$4, $$5, $$6, $$5));
         this.dU().a(this, $$7, $$4, (double)$$2.a(), (double)$$2.b(), (double)$$2.a()).ifPresent($$1x -> this.b($$1x.b(0.0, (double)(-$$2.b()) / 2.0, 0.0)));
      }
   }

   public iw cM() {
      return iw.a((double)this.dK());
   }

   public iw cN() {
      return this.cM();
   }

   protected xk cO() {
      return new xk(xk.a.c, new xk.b(this.ak(), this.cE(), this.af()));
   }

   public boolean a(aqu $$0) {
      return true;
   }

   @Override
   public final ewp cP() {
      return this.aP;
   }

   public ewp h_() {
      return this.cP();
   }

   public final void a(ewp $$0) {
      this.aP = $$0;
   }

   public final float d(bsz $$0) {
      return this.a($$0).c();
   }

   public final float cQ() {
      return this.bo;
   }

   public ewu p(float $$0) {
      return this.cR();
   }

   protected ewu cR() {
      return new ewu(0.0, (double)this.cQ(), (double)(this.do() * 0.4F));
   }

   public btf a_(int $$0) {
      return btf.b;
   }

   @Override
   public void a(xe $$0) {
   }

   public dca cS() {
      return this.dU();
   }

   @Nullable
   public MinecraftServer cT() {
      return this.dU().o();
   }

   public bqa a(cly $$0, ewu $$1, bpz $$2) {
      return bqa.d;
   }

   public boolean a(dbs $$0) {
      return false;
   }

   public void a(bso $$0, brv $$1) {
      if ($$1 instanceof bso) {
         dae.a((bso)$$1, $$0);
      }

      dae.b($$0, $$1);
   }

   public void c(aqu $$0) {
   }

   public void d(aqu $$0) {
   }

   public float a(dmd $$0) {
      float $$1 = aym.g(this.dK());
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

   public float a(dke $$0) {
      float $$1 = aym.g(this.dK());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public boolean cU() {
      return false;
   }

   public cmt a(cms $$0) {
      return this.ak().a(awh.r) ? cmt.b : cmt.a;
   }

   @Nullable
   public bso cV() {
      return null;
   }

   public final boolean cW() {
      return this.cV() != null;
   }

   public final List<brv> cX() {
      return this.p;
   }

   @Nullable
   public brv cY() {
      return this.p.isEmpty() ? null : (brv)this.p.get(0);
   }

   public boolean x(brv $$0) {
      return this.p.contains($$0);
   }

   public boolean a(Predicate<brv> $$0) {
      UnmodifiableIterator var2 = this.p.iterator();

      while (var2.hasNext()) {
         brv $$1 = (brv)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<brv> A() {
      return this.p.stream().flatMap(brv::cZ);
   }

   @Override
   public Stream<brv> cZ() {
      return Stream.concat(Stream.of(this), this.A());
   }

   @Override
   public Stream<brv> da() {
      return Stream.concat(this.p.stream().flatMap(brv::da), Stream.of(this));
   }

   public Iterable<brv> db() {
      return () -> this.A().iterator();
   }

   public int dc() {
      return (int)this.A().filter($$0 -> $$0 instanceof cly).count();
   }

   public boolean dd() {
      return this.dc() == 1;
   }

   public brv de() {
      brv $$0 = this;

      while ($$0.bW()) {
         $$0 = $$0.dh();
      }

      return $$0;
   }

   public boolean y(brv $$0) {
      return this.de() == $$0.de();
   }

   public boolean z(brv $$0) {
      if (!$$0.bW()) {
         return false;
      } else {
         brv $$1 = $$0.dh();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean df() {
      return this.cV() instanceof cly $$0 ? $$0.g() : this.dg();
   }

   public boolean dg() {
      return !this.dU().C;
   }

   protected static ewu a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -aym.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = aym.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new ewu((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public ewu b(bso $$0) {
      return new ewu(this.dz(), this.cP().e, this.dF());
   }

   @Nullable
   public brv dh() {
      return this.q;
   }

   @Nullable
   public brv di() {
      return this.q != null && this.q.cV() == this ? this.q : null;
   }

   public epj j_() {
      return epj.a;
   }

   public avq dj() {
      return avq.g;
   }

   protected int dk() {
      return 1;
   }

   public eh dl() {
      return new eh(
         this, this.ds(), this.bR(), this.dU() instanceof aqt ? (aqt)this.dU() : null, this.H(), this.af().getString(), this.P_(), this.dU().o(), this
      );
   }

   protected int H() {
      return 0;
   }

   public boolean m(int $$0) {
      return this.H() >= $$0;
   }

   @Override
   public boolean k_() {
      return this.dU().ab().b(dbw.p);
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public boolean V_() {
      return true;
   }

   public void a(et.a $$0, ewu $$1) {
      ewu $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.s(aym.g((float)(-(aym.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.r(aym.g((float)(aym.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dK());
      this.Q = this.dM();
      this.P = this.dK();
   }

   public boolean a(awt<epd> $$0, double $$1) {
      if (this.dm()) {
         return false;
      } else {
         ewp $$2 = this.cP().h(0.001);
         int $$3 = aym.a($$2.a);
         int $$4 = aym.c($$2.d);
         int $$5 = aym.a($$2.b);
         int $$6 = aym.c($$2.e);
         int $$7 = aym.a($$2.c);
         int $$8 = aym.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cH();
         boolean $$11 = false;
         ewu $$12 = ewu.b;
         int $$13 = 0;
         ir.a $$14 = new ir.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  epe $$18 = this.dU().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((dbg)this.dU(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           ewu $$20 = $$18.c(this.dU(), $$14);
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

            if (!(this instanceof cly)) {
               $$12 = $$12.d();
            }

            ewu $$21 = this.dx();
            $$12 = $$12.a($$1 * 1.0);
            double $$22 = 0.003;
            if (Math.abs($$21.c) < 0.003 && Math.abs($$21.e) < 0.003 && $$12.f() < 0.0045000000000000005) {
               $$12 = $$12.d().a(0.0045000000000000005);
            }

            this.g(this.dx().e($$12));
         }

         this.ao.put($$0, $$9);
         return $$11;
      }
   }

   public boolean dm() {
      ewp $$0 = this.cP().g(1.0);
      int $$1 = aym.a($$0.a);
      int $$2 = aym.c($$0.d);
      int $$3 = aym.a($$0.c);
      int $$4 = aym.c($$0.f);
      return !this.dU().b($$1, $$3, $$2, $$4);
   }

   public double b(awt<epd> $$0) {
      return this.ao.getDouble($$0);
   }

   public double dn() {
      return (double)this.cQ() < 0.4 ? 0.0 : 0.4;
   }

   public final float do() {
      return this.bn.a();
   }

   public final float dp() {
      return this.bn.b();
   }

   public zl<abw> dq() {
      return new abx(this);
   }

   public bry a(bsz $$0) {
      return this.n.n();
   }

   public final brx dr() {
      return this.bn.d();
   }

   public ewu ds() {
      return this.s;
   }

   public ewu dt() {
      return this.ds();
   }

   @Override
   public ir du() {
      return this.t;
   }

   public dtc dv() {
      if (this.bt == null) {
         this.bt = this.dU().a_(this.du());
      }

      return this.bt;
   }

   public dbh dw() {
      return this.u;
   }

   public ewu dx() {
      return this.v;
   }

   public void g(ewu $$0) {
      this.v = $$0;
   }

   public void h(ewu $$0) {
      this.g(this.dx().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.g(new ewu($$0, $$1, $$2));
   }

   public final int dy() {
      return this.t.u();
   }

   public final double dz() {
      return this.s.c;
   }

   public double c(double $$0) {
      return this.s.c + (double)this.do() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.al.j() - 1.0) * $$0);
   }

   public final int dA() {
      return this.t.v();
   }

   public final double dB() {
      return this.s.d;
   }

   public double e(double $$0) {
      return this.s.d + (double)this.dp() * $$0;
   }

   public double dC() {
      return this.e(this.al.j());
   }

   public double dD() {
      return this.s.d + (double)this.bo;
   }

   public final int dE() {
      return this.t.w();
   }

   public final double dF() {
      return this.s.e;
   }

   public double f(double $$0) {
      return this.s.e + (double)this.do() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.al.j() - 1.0) * $$0);
   }

   public final void p(double $$0, double $$1, double $$2) {
      if (this.s.c != $$0 || this.s.d != $$1 || this.s.e != $$2) {
         this.s = new ewu($$0, $$1, $$2);
         int $$3 = aym.a($$0);
         int $$4 = aym.a($$1);
         int $$5 = aym.a($$2);
         if ($$3 != this.t.u() || $$4 != this.t.v() || $$5 != this.t.w()) {
            this.t = new ir($$3, $$4, $$5);
            this.bt = null;
            if (jt.a($$3) != this.u.e || jt.a($$5) != this.u.f) {
               this.u = new dbh(this.t);
            }
         }

         this.bf.a();
      }
   }

   public void dG() {
   }

   public ewu q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bo * 0.7, 0.0);
   }

   public void a(abx $$0) {
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
   public cuh dH() {
      return null;
   }

   public void p(boolean $$0) {
      this.aF = $$0;
   }

   public boolean dI() {
      return !this.ak().a(awh.k);
   }

   public boolean dJ() {
      return (this.aF || this.aG) && this.dI();
   }

   public float dK() {
      return this.aN;
   }

   public float dL() {
      return this.dK();
   }

   public void r(float $$0) {
      if (!Float.isFinite($$0)) {
         ad.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aN = $$0;
      }
   }

   public float dM() {
      return this.aO;
   }

   public void s(float $$0) {
      if (!Float.isFinite($$0)) {
         ad.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aO = $$0;
      }
   }

   public boolean dN() {
      return false;
   }

   public float dO() {
      return 0.0F;
   }

   public void a(@Nullable brv $$0) {
   }

   public final boolean dP() {
      return this.aR != null;
   }

   @Nullable
   public brv.d dQ() {
      return this.aR;
   }

   @Override
   public final void b(brv.d $$0) {
      if (this.aR == null) {
         this.aR = $$0;
      }

      if (this.aR.a()) {
         this.ae();
      }

      this.cX().forEach(brv::ae);
      this.bf.a($$0);
   }

   protected void dR() {
      this.aR = null;
   }

   @Override
   public void a(dxd $$0) {
      this.bf = $$0;
   }

   @Override
   public boolean dS() {
      if (this.aR != null && !this.aR.b()) {
         return false;
      } else {
         return this.bW() ? false : !this.bX() || !this.dd();
      }
   }

   @Override
   public boolean dT() {
      return false;
   }

   public boolean a(dca $$0, ir $$1) {
      return true;
   }

   public dca dU() {
      return this.r;
   }

   public boolean dV() {
      return this.dW() && this.r.z_();
   }

   public boolean dW() {
      return false;
   }

   protected void a(dca $$0) {
      this.r = $$0;
   }

   public bqu dX() {
      return this.dU().aj();
   }

   public jo dY() {
      return this.dU().I_();
   }

   public void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = aym.d($$6, this.dz(), $$1);
      double $$8 = aym.d($$6, this.dB(), $$2);
      double $$9 = aym.d($$6, this.dF(), $$3);
      float $$10 = (float)aym.e($$6, (double)this.dK(), $$4);
      float $$11 = (float)aym.d($$6, (double)this.dM(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   public static record a(ewu a, @Nullable cpa b) {

      public brv.a a(ewu $$0) {
         return new brv.a(this.a.e($$0), this.b);
      }

      public ewu a() {
         return this.b != null ? this.b.j() : ewu.b;
      }

      public ewu b(ewu $$0) {
         return this.a.d($$0);
      }

      public ewu b() {
         return this.a;
      }

      @Nullable
      public cpa c() {
         return this.b;
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(brv var1, double var2, double var4, double var6);
   }

   public static enum c {
      a(false, false),
      b(true, false),
      c(false, true),
      d(true, true);

      final boolean e;
      final boolean f;

      private c(boolean $$0, boolean $$1) {
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

   public static enum d {
      a(true, false),
      b(true, false),
      c(false, true),
      d(false, false),
      e(false, false);

      private final boolean f;
      private final boolean g;

      private d(boolean $$0, boolean $$1) {
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
