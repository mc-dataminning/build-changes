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

public abstract class bii implements bgu, dir, dq {
   private static final Logger c = LogUtils.getLogger();
   public static final String w = "id";
   public static final String x = "Passengers";
   private static final AtomicInteger d = new AtomicInteger();
   private static final List<ciy> e = Collections.emptyList();
   public static final int y = 60;
   public static final int z = 300;
   public static final int A = 1024;
   public static final float B = 0.2F;
   public static final double C = 0.500001;
   public static final double D = 0.999999;
   public static final float E = 0.11111111F;
   public static final int F = 140;
   public static final int G = 40;
   private static final egz k = new egz(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double l = 0.014;
   private static final double m = 0.007;
   private static final double n = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double o = 1.0;
   private final bim<?> p;
   private int q = d.incrementAndGet();
   public boolean I;
   private ImmutableList<bii> r = ImmutableList.of();
   protected int J;
   @Nullable
   private bii s;
   private cpm t;
   public double K;
   public double L;
   public double M;
   private ehe u;
   private gu v;
   private cot aE;
   private ehe aF = ehe.b;
   private float aG;
   private float aH;
   public float N;
   public float O;
   private egz aI = k;
   private boolean aJ;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected ehe U = ehe.b;
   @Nullable
   private bii.c aK;
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
   protected final aru ag = aru.a();
   public int ah;
   private int aN = -this.db();
   protected boolean ai;
   protected Object2DoubleMap<aqa<eac>> aj = new Object2DoubleArrayMap(2);
   protected boolean ak;
   private final Set<aqa<eac>> aO = new HashSet<>();
   public int al;
   protected boolean am = true;
   protected final aec an;
   protected static final adz<Byte> ao = aec.a(bii.class, aeb.a);
   protected static final int ap = 0;
   private static final int aP = 1;
   private static final int aQ = 3;
   private static final int aR = 4;
   private static final int aS = 5;
   protected static final int aq = 6;
   protected static final int ar = 7;
   private static final adz<Integer> aT = aec.a(bii.class, aeb.b);
   private static final adz<Optional<tf>> aU = aec.a(bii.class, aeb.g);
   private static final adz<Boolean> aV = aec.a(bii.class, aeb.k);
   private static final adz<Boolean> aW = aec.a(bii.class, aeb.k);
   private static final adz<Boolean> aX = aec.a(bii.class, aeb.k);
   protected static final adz<bjk> as = aec.a(bii.class, aeb.v);
   private static final adz<Integer> aY = aec.a(bii.class, aeb.b);
   private dis aZ = dis.a;
   private final act ba = new act();
   public boolean at;
   public boolean au;
   private int bb;
   protected boolean av;
   protected int aw;
   protected gu ax;
   private boolean bc;
   protected UUID ay = arp.a(this.ag);
   protected String az = this.ay.toString();
   private boolean bd;
   private final Set<String> be = Sets.newHashSet();
   private final double[] bf = new double[]{0.0, 0.0, 0.0};
   private long bg;
   private bij bh;
   private float bi;
   public boolean aA;
   public boolean aB;
   public boolean aC;
   public Optional<gu> aD = Optional.empty();
   private boolean bj = false;
   private float bk;
   private int bl;
   private boolean bm;
   @Nullable
   private dfa bn = null;

   public bii(bim<?> $$0, cpm $$1) {
      this.p = $$0;
      this.t = $$1;
      this.bh = $$0.n();
      this.u = ehe.b;
      this.v = gu.b;
      this.aE = cot.b;
      this.an = new aec(this);
      this.an.a(ao, (byte)0);
      this.an.a(aT, this.cg());
      this.an.a(aV, false);
      this.an.a(aU, Optional.empty());
      this.an.a(aW, false);
      this.an.a(aX, false);
      this.an.a(as, bjk.a);
      this.an.a(aY, 0);
      this.a_();
      this.e(0.0, 0.0, 0.0);
      this.bi = this.a(bjk.a, this.bh);
   }

   public boolean a(gu $$0, dfa $$1) {
      ehx $$2 = $$1.b(this.dK(), $$0, ehj.a(this));
      ehx $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return ehu.c($$3, ehu.a(this.cG()), ehi.i);
   }

   public int c_() {
      eif $$0 = this.cf();
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
      this.ba.e(new ehe($$0, $$1, $$2));
   }

   public act af() {
      return this.ba;
   }

   public bim<?> ag() {
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
      this.a(bii.c.a);
      this.a(djk.p);
   }

   public final void ak() {
      this.a(bii.c.b);
   }

   protected abstract void a_();

   public aec al() {
      return this.an;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bii ? ((bii)$$0).q == this.q : false;
   }

   @Override
   public int hashCode() {
      return this.q;
   }

   public void a(bii.c $$0) {
      this.b($$0);
   }

   public void am() {
   }

   public void b(bjk $$0) {
      this.an.b(as, $$0);
   }

   public bjk an() {
      return this.an.b(as);
   }

   public boolean c(bjk $$0) {
      return this.an() == $$0;
   }

   public boolean a(bii $$0, double $$1) {
      return this.di().a((ho)$$0.di(), $$1);
   }

   public boolean a(bii $$0, double $$1, double $$2) {
      double $$3 = $$0.dp() - this.dp();
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.dv() - this.dv();
      return arp.e($$3, $$5) < arp.k($$1) && arp.k($$4) < arp.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.r($$0 % 360.0F);
      this.s($$1 % 360.0F);
   }

   public final void a(ehe $$0) {
      this.e($$0.a(), $$0.b(), $$0.c());
   }

   public void e(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.ao());
   }

   protected egz ao() {
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
      this.s(arp.a(this.dC(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = arp.a(this.O, -90.0F, 90.0F);
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
            this.a(aow.iT, 0.4F, 2.0F + this.ag.i() * 0.4F);
         }
      }
   }

   public void g(int $$0) {
      int $$1 = $$0 * 20;
      if (this instanceof biy) {
         $$1 = cns.a((biy)this, $$1);
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

   private boolean b(egz $$0) {
      return this.dK().a(this, $$0) && !this.dK().d($$0);
   }

   public void c(boolean $$0) {
      this.aJ = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, ehe $$1) {
      this.aJ = $$0;
      this.b($$0, $$1);
   }

   public boolean d(gu $$0) {
      return this.aD.isPresent() && this.aD.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable ehe $$1) {
      if ($$0) {
         egz $$2 = this.cG();
         egz $$3 = new egz($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<gu> $$4 = this.t.g(this, $$3);
         if ($$4.isPresent() || this.bj) {
            this.aD = $$4;
         } else if ($$1 != null) {
            egz $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
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

   public void a(bje $$0, ehe $$1) {
      if (this.af) {
         this.e(this.dp() + $$1.c, this.dr() + $$1.d, this.dv() + $$1.e);
      } else {
         this.aC = this.bM();
         if ($$0 == bje.c) {
            $$1 = this.c($$1);
            if ($$1.equals(ehe.b)) {
               return;
            }
         }

         this.dK().ad().a("move");
         if (this.U.g() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = ehe.b;
            this.f(ehe.b);
         }

         $$1 = this.a($$1, $$0);
         ehe $$2 = this.h($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ab != 0.0F && $$3 >= 1.0) {
               eha $$4 = this.dK().a(new cov(this.di(), this.di().e($$2), cov.a.d, cov.b.d, this));
               if ($$4.c() != ehc.a.a) {
                  this.n();
               }
            }

            this.e(this.dp() + $$2.c, this.dr() + $$2.d, this.dv() + $$2.e);
         }

         this.dK().ad().c();
         this.dK().ad().a("rest");
         boolean $$5 = !arp.b($$1.c, $$2.c);
         boolean $$6 = !arp.b($$1.e, $$2.e);
         this.P = $$5 || $$6;
         this.Q = $$1.d != $$2.d;
         this.R = this.Q && $$1.d < 0.0;
         if (this.P) {
            this.S = this.b($$2);
         } else {
            this.S = false;
         }

         this.a(this.R, $$2);
         gu $$7 = this.aF();
         dfa $$8 = this.dK().a_($$7);
         this.a($$2.d, this.aA(), $$8, $$7);
         if (this.dF()) {
            this.dK().ad().c();
         } else {
            if (this.P) {
               ehe $$9 = this.dn();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            csm $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dK(), this);
            }

            if (this.aA()) {
               $$10.a(this.dK(), $$7, $$8, this);
            }

            bii.b $$11 = this.aU();
            if ($$11.a() && !this.bN()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.aa = this.aa + (float)($$2.f() * 0.6);
               gu $$15 = this.aH();
               dfa $$16 = this.dK().a_($$15);
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
                        this.a(djk.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aE();
               }
            }

            this.aB();
            float $$20 = this.aJ();
            this.f(this.dn().d((double)$$20, 1.0, (double)$$20));
            if (this.dK().c(this.cG().h(1.0E-6)).noneMatch($$0x -> $$0x.a(apl.aJ) || $$0x.a(csn.H))) {
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

   private boolean c(dfa $$0) {
      return $$0.a(apl.aO) || $$0.a(csn.qC);
   }

   private boolean a(gu $$0, dfa $$1, boolean $$2, boolean $$3, ehe $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aA() || $$5 || this.bW() && $$4.d == 0.0 || this.ce()) && !this.bY()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dK().a(djk.P, this.di(), djk.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean b(ehe $$0) {
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
      this.a(aow.iY, 0.7F, 1.6F + (this.ag.i() - this.ag.i()) * 0.4F);
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
            this.a(djk.x);
         }
      }
   }

   @Deprecated
   public gu aF() {
      return this.d(0.2F);
   }

   protected gu aG() {
      return this.d(0.500001F);
   }

   public gu aH() {
      return this.d(1.0E-5F);
   }

   protected gu d(float $$0) {
      if (this.aD.isPresent()) {
         gu $$1 = this.aD.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dfa $$2 = this.dK().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(apl.S)) && !$$2.a(apl.L) && !($$2.b() instanceof cvh) ? $$1.h(arp.a(this.u.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = arp.a(this.u.c);
         int $$4 = arp.a(this.u.d - (double)$$0);
         int $$5 = arp.a(this.u.e);
         return new gu($$3, $$4, $$5);
      }
   }

   protected float aI() {
      float $$0 = this.dK().a_(this.dk()).b().j();
      float $$1 = this.dK().a_(this.aG()).b().j();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aJ() {
      dfa $$0 = this.dK().a_(this.dk());
      float $$1 = $$0.b().i();
      if (!$$0.a(csn.G) && !$$0.a(csn.nd)) {
         return (double)$$1 == 1.0 ? this.dK().a_(this.aG()).b().i() : $$1;
      } else {
         return $$1;
      }
   }

   protected ehe a(ehe $$0, bje $$1) {
      return $$0;
   }

   protected ehe c(ehe $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dK().V();
         if ($$1 != this.bg) {
            Arrays.fill(this.bf, 0.0);
            this.bg = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(ha.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? ehe.b : new ehe($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(ha.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? ehe.b : new ehe(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(ha.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? ehe.b : new ehe(0.0, 0.0, $$4);
         } else {
            return ehe.b;
         }
      }
   }

   private double a(ha.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = arp.a($$1 + this.bf[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bf[$$2];
      this.bf[$$2] = $$3;
      return $$1;
   }

   private ehe h(ehe $$0) {
      egz $$1 = this.cG();
      List<ehx> $$2 = this.dK().c(this, $$1.b($$0));
      ehe $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dK(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.aA() || $$5 && $$0.d < 0.0;
      if (this.dE() > 0.0F && $$7 && ($$4 || $$6)) {
         ehe $$8 = a(this, new ehe($$0.c, (double)this.dE(), $$0.e), $$1, this.dK(), $$2);
         ehe $$9 = a(this, new ehe(0.0, (double)this.dE(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dK(), $$2);
         if ($$9.d < (double)this.dE()) {
            ehe $$10 = a(this, new ehe($$0.c, 0.0, $$0.e), $$1.c($$9), this.dK(), $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new ehe(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.dK(), $$2));
         }
      }

      return $$3;
   }

   public static ehe a(@Nullable bii $$0, ehe $$1, egz $$2, cpm $$3, List<ehx> $$4) {
      Builder<ehx> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      dgr $$6 = $$3.w_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.e($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static ehe a(ehe $$0, egz $$1, List<ehx> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = ehu.a(ha.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = ehu.a(ha.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = ehu.a(ha.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = ehu.a(ha.a.c, $$1, $$2, $$5);
         }

         return new ehe($$3, $$4, $$5);
      }
   }

   protected float aK() {
      return (float)((int)this.Z + 1);
   }

   protected aov aL() {
      return aow.jc;
   }

   protected aov aM() {
      return aow.jb;
   }

   protected aov aN() {
      return aow.jb;
   }

   protected void aO() {
      egz $$0 = this.cG();
      gu $$1 = gu.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      gu $$2 = gu.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dK().a($$1, $$2)) {
         gu.a $$3 = new gu.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  $$3.d($$4, $$5, $$6);
                  dfa $$7 = this.dK().a_($$3);

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

   protected void a(dfa $$0) {
   }

   public void a(djk $$0, @Nullable bii $$1) {
      this.dK().a($$1, $$0, this.u);
   }

   public void a(djk $$0) {
      this.a($$0, this);
   }

   private void c(gu $$0, dfa $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.m();
      }
   }

   protected void aP() {
      bii $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      ehe $$2 = $$0.dn();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected gu e(gu $$0) {
      gu $$1 = $$0.c();
      dfa $$2 = this.dK().a_($$1);
      return !$$2.a(apl.bm) && !$$2.a(apl.bn) ? $$0 : $$1;
   }

   protected void a(dfa $$0, dfa $$1) {
      czz $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dfa $$0) {
      czz $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(gu $$0, dfa $$1) {
      czz $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dfa $$0) {
      return $$0.a(apl.bl) && this.ah >= this.bl + 20;
   }

   private void m() {
      this.bk = this.bk * (float)Math.pow(0.997, (double)(this.ah - this.bl));
      this.bk = Math.min(1.0F, this.bk + 0.07F);
      float $$0 = 0.5F + this.bk * this.ag.i() * 1.2F;
      float $$1 = 0.1F + this.bk * 1.2F;
      this.a(aow.E, $$1, $$0);
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

   public void a(aov $$0, float $$1, float $$2) {
      if (!this.aS()) {
         this.dK().a(null, this.dp(), this.dr(), this.dv(), $$0, this.da(), $$1, $$2);
      }
   }

   public void a(aov $$0) {
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

   protected bii.b aU() {
      return bii.b.d;
   }

   public boolean aV() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dfa $$2, gu $$3) {
      if ($$1) {
         if (this.ab > 0.0F) {
            $$2.b().a(this.dK(), $$2, $$3, this, this.ab);
            this.dK().a(djk.A, this.u, djk.a.a(this, this.aD.<dfa>map($$0x -> this.dK().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ab -= (float)$$0;
      }
   }

   public boolean aW() {
      return this.ag().d();
   }

   public boolean a(float $$0, float $$1, bhg $$2) {
      if (this.p.a(apo.l)) {
         return false;
      } else {
         if (this.bO()) {
            for (bii $$3 : this.cP()) {
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
      gu $$0 = this.dk();
      return this.dK().q($$0) || this.dK().q(gu.a((double)$$0.u(), this.cG().e, (double)$$0.w()));
   }

   private boolean p() {
      return this.dK().a_(this.dk()).a(csn.nd);
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
         this.h(this.bX() && this.bc() && !this.bN() && this.dK().b_(this.v).a(apq.a));
      }
   }

   protected boolean be() {
      this.aj.clear();
      this.bf();
      double $$0 = this.dK().x_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(apq.b, $$0);
      return this.aX() || $$1;
   }

   void bf() {
      if (this.cY() instanceof cdg $$0 && !$$0.bc()) {
         this.ai = false;
         return;
      }

      if (this.a(apq.a, 0.014)) {
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
      this.ak = this.a(apq.a);
      this.aO.clear();
      double $$0 = this.dt() - 0.11111111F;
      if (this.cY() instanceof cdg $$2 && !$$2.bc() && $$2.cG().e >= $$0 && $$2.cG().b <= $$0) {
         return;
      }

      gu $$3 = gu.a(this.dp(), $$0, this.dv());
      ead $$4 = this.dK().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((cos)this.dK(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aO::add);
      }
   }

   protected void bg() {
      bii $$0 = Objects.requireNonNullElse(this.cN(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      ehe $$2 = $$0.dn();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aM(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      } else {
         this.a(this.aN(), $$3, 1.0F + (this.ag.i() - this.ag.i()) * 0.4F);
      }

      float $$4 = (float)arp.a(this.dr());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bh.a * 20.0F; $$5++) {
         double $$6 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         double $$7 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         this.dK().a(iv.e, this.dp() + $$6, (double)($$4 + 1.0F), this.dv() + $$7, $$2.c, $$2.d - this.ag.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bh.a * 20.0F; $$8++) {
         double $$9 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         double $$10 = (this.ag.j() * 2.0 - 1.0) * (double)this.bh.a;
         this.dK().a(iv.ag, this.dp() + $$9, (double)($$4 + 1.0F), this.dv() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(djk.O);
   }

   @Deprecated
   protected dfa bh() {
      return this.dK().a_(this.aF());
   }

   public dfa bi() {
      return this.dK().a_(this.aH());
   }

   public boolean bj() {
      return this.bX() && !this.aX() && !this.G_() && !this.bW() && !this.bl() && this.bv();
   }

   protected void bk() {
      gu $$0 = this.aF();
      dfa $$1 = this.dK().a_($$0);
      if ($$1.l() != cyr.a) {
         ehe $$2 = this.dn();
         gu $$3 = this.dk();
         double $$4 = this.dp() + (this.ag.j() - 0.5) * (double)this.bh.a;
         double $$5 = this.dv() + (this.ag.j() - 0.5) * (double)this.bh.a;
         if ($$3.u() != $$0.u()) {
            $$4 = arp.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = arp.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dK().a(new in(iv.c, $$1), $$4, this.dr() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(aqa<eac> $$0) {
      return this.aO.contains($$0);
   }

   public boolean bl() {
      return !this.am && this.aj.getDouble(apq.b) > 0.0;
   }

   public void a(float $$0, ehe $$1) {
      ehe $$2 = a($$1, $$0, this.dA());
      this.f(this.dn().e($$2));
   }

   private static ehe a(ehe $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return ehe.b;
      } else {
         ehe $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = arp.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = arp.b($$2 * (float) (Math.PI / 180.0));
         return new ehe($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bm() {
      return this.dK().f(this.do(), this.du()) ? this.dK().w(gu.a(this.dp(), this.dt(), this.dv())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.r($$3 % 360.0F);
      this.s(arp.a($$4, -90.0F, 90.0F) % 360.0F);
      this.N = this.dA();
      this.O = this.dC();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = arp.a($$0, -3.0E7, 3.0E7);
      double $$4 = arp.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.e($$3, $$1, $$4);
   }

   public void d(ehe $$0) {
      this.d($$0.c, $$0.d, $$0.e);
   }

   public void d(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dA(), this.dC());
   }

   public void a(gu $$0, float $$1, float $$2) {
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

   public float e(bii $$0) {
      float $$1 = (float)(this.dp() - $$0.dp());
      float $$2 = (float)(this.dr() - $$0.dr());
      float $$3 = (float)(this.dv() - $$0.dv());
      return arp.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dp() - $$0;
      double $$4 = this.dr() - $$1;
      double $$5 = this.dv() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double f(bii $$0) {
      return this.e($$0.di());
   }

   public double e(ehe $$0) {
      double $$1 = this.dp() - $$0.c;
      double $$2 = this.dr() - $$0.d;
      double $$3 = this.dv() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cbn $$0) {
   }

   public void g(bii $$0) {
      if (!this.y($$0)) {
         if (!$$0.af && !this.af) {
            double $$1 = $$0.dp() - this.dp();
            double $$2 = $$0.dv() - this.dv();
            double $$3 = arp.a($$1, $$2);
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

   public boolean a(bhg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bo();
         return false;
      }
   }

   public final ehe f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dC() : arp.i($$0, this.O, this.dC());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dA() : arp.i($$0, this.N, this.dA());
   }

   protected final ehe b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = arp.b($$3);
      float $$5 = arp.a($$3);
      float $$6 = arp.b($$2);
      float $$7 = arp.a($$2);
      return new ehe((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final ehe i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final ehe c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final ehe bp() {
      return new ehe(this.dp(), this.dt(), this.dv());
   }

   public final ehe j(float $$0) {
      double $$1 = arp.d((double)$$0, this.K, this.dp());
      double $$2 = arp.d((double)$$0, this.L, this.dr()) + (double)this.cH();
      double $$3 = arp.d((double)$$0, this.M, this.dv());
      return new ehe($$1, $$2, $$3);
   }

   public ehe k(float $$0) {
      return this.j($$0);
   }

   public final ehe l(float $$0) {
      double $$1 = arp.d((double)$$0, this.K, this.dp());
      double $$2 = arp.d((double)$$0, this.L, this.dr());
      double $$3 = arp.d((double)$$0, this.M, this.dv());
      return new ehe($$1, $$2, $$3);
   }

   public ehc a(double $$0, float $$1, boolean $$2) {
      ehe $$3 = this.j($$1);
      ehe $$4 = this.f($$1);
      ehe $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dK().a(new cov($$3, $$5, cov.a.b, $$2 ? cov.b.c : cov.b.a, this));
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

   public void a(bii $$0, int $$1, bhg $$2) {
      if ($$0 instanceof akl) {
         ai.c.a((akl)$$0, this, $$2);
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

   public boolean d(qr $$0) {
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

   public boolean e(qr $$0) {
      return this.bN() ? false : this.d($$0);
   }

   public qr f(qr $$0) {
      try {
         if (this.s != null) {
            $$0.a("Pos", this.a(this.s.dp(), this.dr(), this.s.dv()));
         } else {
            $$0.a("Pos", this.a(this.dp(), this.dr(), this.dv()));
         }

         ehe $$1 = this.dn();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dA(), this.dC()));
         $$0.a("FallDistance", this.ab);
         $$0.a("Fire", (short)this.aN);
         $$0.a("Air", (short)this.ch());
         $$0.a("OnGround", this.aA());
         $$0.a("Invulnerable", this.bc);
         $$0.a("PortalCooldown", this.bb);
         $$0.a("UUID", this.cv());
         tf $$2 = this.ad();
         if ($$2 != null) {
            $$0.a("CustomName", tf.a.a($$2));
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
            qx $$4 = new qx();

            for (String $$5 : this.be) {
               $$4.add(ri.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bO()) {
            qx $$6 = new qx();

            for (bii $$7 : this.cP()) {
               qr $$8 = new qr();
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

   public void g(qr $$0) {
      try {
         qx $$1 = $$0.c("Pos", 6);
         qx $$2 = $$0.c("Motion", 6);
         qx $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(arp.a($$1.h(0), -3.0000512E7, 3.0000512E7), arp.a($$1.h(1), -2.0E7, 2.0E7), arp.a($$1.h(2), -3.0000512E7, 3.0000512E7));
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
                  this.b(tf.a.a($$8));
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
               qx $$10 = $$0.c("Tags", 8);
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
      bim<?> $$0 = this.ag();
      aer $$1 = bim.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(qr var1);

   protected abstract void b(qr var1);

   protected qx a(double... $$0) {
      qx $$1 = new qx();

      for (double $$2 : $$0) {
         $$1.add(qs.a($$2));
      }

      return $$1;
   }

   protected qx a(float... $$0) {
      qx $$1 = new qx();

      for (float $$2 : $$0) {
         $$1.add(qu.a($$2));
      }

      return $$1;
   }

   @Nullable
   public byg a(cpl $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public byg a(cpl $$0, int $$1) {
      return this.a(new ciy($$0), (float)$$1);
   }

   @Nullable
   public byg b(ciy $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public byg a(ciy $$0, float $$1) {
      if ($$0.b()) {
         return null;
      } else if (this.dK().B) {
         return null;
      } else {
         byg $$2 = new byg(this.dK(), this.dp(), this.dr() + (double)$$1, this.dv(), $$0);
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
         egz $$1 = egz.a(this.bp(), (double)$$0, 1.0E-6, (double)$$0);
         return gu.a($$1)
            .anyMatch(
               $$1x -> {
                  dfa $$2 = this.dK().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dK(), $$1x)
                     && ehu.c($$2.k(this.dK(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), ehu.a($$1), ehi.i);
               }
            );
      }
   }

   public bgq a(cbn $$0, bgp $$1) {
      return bgq.d;
   }

   public boolean h(bii $$0) {
      return $$0.bx() && !this.y($$0);
   }

   public boolean bx() {
      return false;
   }

   public void by() {
      this.f(ehe.b);
      this.l();
      if (this.bN()) {
         this.cY().i(this);
      }
   }

   public final void i(bii $$0) {
      if (this.x($$0)) {
         this.a($$0, bii::e);
      }
   }

   protected void a(bii $$0, bii.a $$1) {
      ehe $$2 = this.m($$0);
      $$1.accept($$0, $$2.c, $$2.d + (double)$$0.k(this), $$2.e);
   }

   public void j(bii $$0) {
   }

   public float k(bii $$0) {
      return this.l($$0);
   }

   protected float l(bii $$0) {
      return 0.0F;
   }

   public ehe m(bii $$0) {
      return new ehe(this.a($$0, this.bh, 1.0F).rotateY(-this.aG * (float) (Math.PI / 180.0))).e(this.di());
   }

   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, 0.0F);
   }

   public boolean n(bii $$0) {
      return this.a($$0, false);
   }

   public boolean bz() {
      return this instanceof biy;
   }

   public boolean a(bii $$0, boolean $$1) {
      if ($$0 == this.s) {
         return false;
      } else if (!$$0.bC()) {
         return false;
      } else {
         for (bii $$2 = $$0; $$2.s != null; $$2 = $$2.s) {
            if ($$2.s == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bN()) {
               this.aa();
            }

            this.b(bjk.a);
            this.s = $$0;
            this.s.p(this);
            $$0.w().filter($$0x -> $$0x instanceof akl).forEach($$0x -> ai.R.a((akl)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bii $$0) {
      return !this.bR() && this.J <= 0;
   }

   public void bA() {
      for (int $$0 = this.r.size() - 1; $$0 >= 0; $$0--) {
         ((bii)this.r.get($$0)).aa();
      }
   }

   public void bB() {
      if (this.s != null) {
         bii $$0 = this.s;
         this.s = null;
         $$0.q(this);
      }
   }

   public void aa() {
      this.bB();
   }

   protected void p(bii $$0) {
      if ($$0.cY() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.r.isEmpty()) {
            this.r = ImmutableList.of($$0);
         } else {
            List<bii> $$1 = Lists.newArrayList(this.r);
            if (!this.dK().B && $$0 instanceof cbn && !(this.cQ() instanceof cbn)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.r = ImmutableList.copyOf($$1);
         }

         this.a(djk.s, $$0);
      }
   }

   protected void q(bii $$0) {
      if ($$0.cY() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.r.size() == 1 && this.r.get(0) == $$0) {
            this.r = ImmutableList.of();
         } else {
            this.r = this.r.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(djk.q, $$0);
      }
   }

   protected boolean r(bii $$0) {
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

   public ehe bE() {
      return this.b(this.dC(), this.dA());
   }

   public ehe a(cit $$0) {
      if (!(this instanceof cbn $$1)) {
         return ehe.b;
      } else {
         boolean $$2 = $$1.eS().a($$0) && !$$1.eR().a($$0);
         bis $$3 = $$2 ? $$1.fk().e() : $$1.fk();
         return this.b(0.0F, this.dA() + (float)($$3 == bis.b ? 80 : -80)).a(0.5);
      }
   }

   public ehd bF() {
      return new ehd(this.dC(), this.dA());
   }

   public ehe bG() {
      return ehe.a(this.bF());
   }

   public void f(gu $$0) {
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
      if (this.dK() instanceof akk) {
         int $$0 = this.av();
         akk $$1 = (akk)this.dK();
         if (this.av) {
            MinecraftServer $$2 = $$1.n();
            aeq<cpm> $$3 = this.dK().ac() == cpm.i ? cpm.h : cpm.i;
            akk $$4 = $$2.a($$3);
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

   public void c(bhg $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            cwd.a(this);
      }
   }

   public void m(float $$0) {
   }

   public Iterable<ciy> bJ() {
      return e;
   }

   public Iterable<ciy> bK() {
      return e;
   }

   public Iterable<ciy> bL() {
      return Iterables.concat(this.bJ(), this.bK());
   }

   public void a(bin $$0, ciy $$1) {
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
      return this.ag().a(apo.m);
   }

   public boolean bQ() {
      return !this.ag().a(apo.n);
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
      return this.c(bjk.f);
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
      return this.c(bjk.d);
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

   public boolean d(cbn $$0) {
      if ($$0.G_()) {
         return false;
      } else {
         eif $$1 = this.cf();
         return $$1 != null && $$0 != null && $$0.cf() == $$1 && $$1.i() ? false : this.cd();
      }
   }

   public boolean ce() {
      return false;
   }

   public void a(BiConsumer<djh<?>, akk> $$0) {
   }

   @Nullable
   public eif cf() {
      return this.dK().I().g(this.cx());
   }

   public boolean s(bii $$0) {
      return this.a($$0.cf());
   }

   public boolean a(eif $$0) {
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

   public void a(akk $$0, bix $$1) {
      this.h(this.aN + 1);
      if (this.aN == 0) {
         this.g(8);
      }

      this.a(this.dL().b(), 5.0F);
   }

   public void k(boolean $$0) {
      ehe $$1 = this.dn();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void l(boolean $$0) {
      ehe $$1 = this.dn();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(akk $$0, biy $$1) {
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
      gu $$3 = gu.a($$0, $$1, $$2);
      ehe $$4 = new ehe($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      gu.a $$5 = new gu.a();
      ha $$6 = ha.b;
      double $$7 = Double.MAX_VALUE;

      for (ha $$8 : new ha[]{ha.c, ha.d, ha.e, ha.f, ha.b}) {
         $$5.a($$3, $$8);
         if (!this.dK().a_($$5).r(this.dK(), $$5)) {
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
      ehe $$13 = this.dn().a(0.75);
      if ($$6.o() == ha.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == ha.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == ha.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dfa $$0, ehe $$1) {
      this.n();
      this.U = $$1;
   }

   private static tf c(tf $$0) {
      ts $$1 = $$0.d().b($$0.a().a(null));

      for (tf $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public tf ab() {
      tf $$0 = this.ad();
      return $$0 != null ? c($$0) : this.cn();
   }

   protected tf cn() {
      return this.p.h();
   }

   public boolean t(bii $$0) {
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

   public boolean u(bii $$0) {
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

   public boolean b(bhg $$0) {
      return this.dF() || this.bc && !$$0.a(apn.d) && !$$0.g() || $$0.a(apn.i) && this.aW() || $$0.a(apn.m) && this.ag().a(apo.l);
   }

   public boolean cq() {
      return this.bc;
   }

   public void m(boolean $$0) {
      this.bc = $$0;
   }

   public void v(bii $$0) {
      this.b($$0.dp(), $$0.dr(), $$0.dv(), $$0.dA(), $$0.dC());
   }

   public void w(bii $$0) {
      qr $$1 = $$0.f(new qr());
      $$1.r("Dimension");
      this.g($$1);
      this.bb = $$0.bb;
      this.ax = $$0.ax;
   }

   @Nullable
   public bii b(akk $$0) {
      if (this.dK() instanceof akk && !this.dF()) {
         this.dK().ad().a("changeDimension");
         this.ae();
         this.dK().ad().a("reposition");
         eba $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dK().ad().b("reloading");
            bii $$2 = this.ag().a((cpm)$$0);
            if ($$2 != null) {
               $$2.w(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dC());
               $$2.f($$1.b);
               $$0.d($$2);
               if ($$0.ac() == cpm.j) {
                  akk.a($$0);
               }
            }

            this.cr();
            this.dK().ad().c();
            ((akk)this.dK()).g();
            $$0.g();
            this.dK().ad().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void cr() {
      this.b(bii.c.e);
   }

   @Nullable
   protected eba a(akk $$0) {
      boolean $$1 = this.dK().ac() == cpm.j && $$0.ac() == cpm.h;
      boolean $$2 = $$0.ac() == cpm.j;
      if (!$$1 && !$$2) {
         boolean $$5 = $$0.ac() == cpm.i;
         if (this.dK().ac() != cpm.i && !$$5) {
            return null;
         } else {
            dgr $$6 = $$0.w_();
            double $$7 = dij.a(this.dK().x_(), $$0.x_());
            gu $$8 = $$6.b(this.dp() * $$7, this.dr(), this.dv() * $$7);
            return this.a($$0, $$8, $$5, $$6).map($$1x -> {
               dfa $$2x = this.dK().a_(this.ax);
               ha.a $$3;
               ehe $$5x;
               if ($$2x.b(dfq.H)) {
                  $$3 = $$2x.c(dfq.H);
                  l.a $$4 = l.a(this.ax, $$3, 21, ha.a.b, 21, $$1xx -> this.dK().a_($$1xx) == $$2x);
                  $$5x = this.a($$3, $$4);
               } else {
                  $$3 = ha.a.a;
                  $$5x = new ehe(0.5, 0.0, 0.0);
               }

               return ebb.a($$0, $$1x, $$3, $$5x, this, this.dn(), this.dA(), this.dC());
            }).orElse(null);
         }
      } else {
         gu $$3;
         if ($$2) {
            $$3 = akk.a;
         } else {
            $$3 = $$0.a(dkj.a.f, $$0.R());
         }

         return new eba(new ehe((double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5), this.dn(), this.dA(), this.dC());
      }
   }

   protected ehe a(ha.a $$0, l.a $$1) {
      return ebb.a($$1, $$0, this.di(), this.a(this.an()));
   }

   protected Optional<l.a> a(akk $$0, gu $$1, boolean $$2, dgr $$3) {
      return $$0.o().a($$1, $$2, $$3);
   }

   public boolean cs() {
      return !this.bN() && !this.bO();
   }

   public float a(cpe $$0, cos $$1, gu $$2, dfa $$3, ead $$4, float $$5) {
      return $$5;
   }

   public boolean a(cpe $$0, cos $$1, gu $$2, dfa $$3, float $$4) {
      return true;
   }

   public int ct() {
      return 3;
   }

   public boolean d_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bim.a(this.ag()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.q);
      $$0.a("Entity Name", () -> this.ab().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dp(), this.dr(), this.dv()));
      $$0.a("Entity's Block location", p.a(this.dK(), arp.a(this.dp()), arp.a(this.dr()), arp.a(this.dv())));
      ehe $$1 = this.dn();
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
   public tf H_() {
      return eib.a(this.cf(), this.ab()).a($$0 -> $$0.a(this.cF()).a(this.cw()));
   }

   public void b(@Nullable tf $$0) {
      this.an.b(aU, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public tf ad() {
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
      if (this.dK() instanceof akk) {
         cot $$3 = new cot(gu.a($$0, $$1, $$2));
         ((akk)this.dK()).k().a(akp.g, $$3, 0, this.ah());
         this.dK().d($$3.e, $$3.f);
         this.b($$0, $$1, $$2);
      }
   }

   public boolean a(akk $$0, double $$1, double $$2, double $$3, Set<bjm> $$4, float $$5, float $$6) {
      float $$7 = arp.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dK()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.s();
         this.n($$5);
      } else {
         this.ae();
         bii $$8 = this.ag().a((cpm)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(bii.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (this.dK() instanceof akk) {
         this.b($$0, $$1, $$2, this.dA(), this.dC());
         this.s();
      }
   }

   private void s() {
      this.cR().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.r.iterator();

         while (var1.hasNext()) {
            bii $$1 = (bii)var1.next();
            $$0.a($$1, bii::d);
         }
      });
   }

   public void c(double $$0, double $$1, double $$2) {
      this.b(this.dp() + $$0, this.dr() + $$1, this.dv() + $$2);
   }

   public boolean cB() {
      return this.cA();
   }

   public void a(List<aec.b<?>> $$0) {
   }

   public void a(adz<?> $$0) {
      if (as.equals($$0)) {
         this.e_();
      }
   }

   @Deprecated
   protected void cC() {
      bjk $$0 = this.an();
      bij $$1 = this.a($$0);
      this.bh = $$1;
      this.bi = this.a($$0, $$1);
   }

   public void e_() {
      bij $$0 = this.bh;
      bjk $$1 = this.an();
      bij $$2 = this.a($$1);
      this.bh = $$2;
      this.bi = this.a($$1, $$2);
      this.ap();
      boolean $$3 = (double)$$2.a <= 4.0 && (double)$$2.b <= 4.0;
      if (!this.dK().B && !this.am && !this.af && $$3 && ($$2.a > $$0.a || $$2.b > $$0.b) && !(this instanceof cbn)) {
         ehe $$4 = this.di().b(0.0, (double)$$0.b / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a - $$0.a) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b - $$0.b) + 1.0E-6;
         ehx $$7 = ehu.a(egz.a($$4, $$5, $$6, $$5));
         this.dK().a(this, $$7, $$4, (double)$$2.a, (double)$$2.b, (double)$$2.a).ifPresent($$1x -> this.a($$1x.b(0.0, (double)(-$$2.b) / 2.0, 0.0)));
      }
   }

   public ha cD() {
      return ha.a((double)this.dA());
   }

   public ha cE() {
      return this.cD();
   }

   protected tk cF() {
      return new tk(tk.a.c, new tk.b(this.ag(), this.cv(), this.ab()));
   }

   public boolean a(akl $$0) {
      return true;
   }

   @Override
   public final egz cG() {
      return this.aI;
   }

   public egz k_() {
      return this.cG();
   }

   public final void a(egz $$0) {
      this.aI = $$0;
   }

   protected float a(bjk $$0, bij $$1) {
      return $$1.b * 0.85F;
   }

   public float d(bjk $$0) {
      return this.a($$0, this.a($$0));
   }

   public final float cH() {
      return this.bi;
   }

   public ehe p(float $$0) {
      return this.cI();
   }

   protected ehe cI() {
      return new ehe(0.0, (double)this.cH(), (double)(this.df() * 0.4F));
   }

   public bjr a_(int $$0) {
      return bjr.b;
   }

   @Override
   public void a(tf $$0) {
   }

   public cpm cJ() {
      return this.dK();
   }

   @Nullable
   public MinecraftServer cK() {
      return this.dK().n();
   }

   public bgq a(cbn $$0, ehe $$1, bgp $$2) {
      return bgq.d;
   }

   public boolean cL() {
      return false;
   }

   public void a(biy $$0, bii $$1) {
      if ($$1 instanceof biy) {
         cnh.a((biy)$$1, $$0);
      }

      cnh.b($$0, $$1);
   }

   public void c(akl $$0) {
   }

   public void d(akl $$0) {
   }

   public float a(cyy $$0) {
      float $$1 = arp.g(this.dA());
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

   public float a(cxh $$0) {
      float $$1 = arp.g(this.dA());
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
   public biy cN() {
      return null;
   }

   public final boolean cO() {
      return this.cN() != null;
   }

   public final List<bii> cP() {
      return this.r;
   }

   @Nullable
   public bii cQ() {
      return this.r.isEmpty() ? null : (bii)this.r.get(0);
   }

   public boolean x(bii $$0) {
      return this.r.contains($$0);
   }

   public boolean a(Predicate<bii> $$0) {
      UnmodifiableIterator var2 = this.r.iterator();

      while (var2.hasNext()) {
         bii $$1 = (bii)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bii> w() {
      return this.r.stream().flatMap(bii::cR);
   }

   @Override
   public Stream<bii> cR() {
      return Stream.concat(Stream.of(this), this.w());
   }

   @Override
   public Stream<bii> cS() {
      return Stream.concat(this.r.stream().flatMap(bii::cS), Stream.of(this));
   }

   public Iterable<bii> cT() {
      return () -> this.w().iterator();
   }

   public boolean cU() {
      return this.w().filter($$0 -> $$0 instanceof cbn).count() == 1L;
   }

   public bii cV() {
      bii $$0 = this;

      while ($$0.bN()) {
         $$0 = $$0.cY();
      }

      return $$0;
   }

   public boolean y(bii $$0) {
      return this.cV() == $$0.cV();
   }

   public boolean z(bii $$0) {
      if (!$$0.bN()) {
         return false;
      } else {
         bii $$1 = $$0.cY();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean cW() {
      return this.cN() instanceof cbn $$0 ? $$0.g() : this.cX();
   }

   public boolean cX() {
      return !this.dK().B;
   }

   protected static ehe a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -arp.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = arp.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new ehe((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public ehe b(biy $$0) {
      return new ehe(this.dp(), this.cG().e, this.dv());
   }

   @Nullable
   public bii cY() {
      return this.s;
   }

   @Nullable
   public bii cZ() {
      return this.s != null && this.s.cN() == this ? this.s : null;
   }

   public eai l_() {
      return eai.a;
   }

   public aox da() {
      return aox.g;
   }

   protected int db() {
      return 1;
   }

   public dr dc() {
      return new dr(
         this, this.di(), this.bF(), this.dK() instanceof akk ? (akk)this.dK() : null, this.C(), this.ab().getString(), this.H_(), this.dK().n(), this
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
      return this.dK().X().b(cpi.o);
   }

   @Override
   public boolean q_() {
      return true;
   }

   @Override
   public boolean N_() {
      return true;
   }

   public void a(eb.a $$0, ehe $$1) {
      ehe $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.s(arp.g((float)(-(arp.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.r(arp.g((float)(arp.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dA());
      this.O = this.dC();
      this.N = this.dA();
   }

   public boolean a(aqa<eac> $$0, double $$1) {
      if (this.dd()) {
         return false;
      } else {
         egz $$2 = this.cG().h(0.001);
         int $$3 = arp.a($$2.a);
         int $$4 = arp.c($$2.d);
         int $$5 = arp.a($$2.b);
         int $$6 = arp.c($$2.e);
         int $$7 = arp.a($$2.c);
         int $$8 = arp.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cy();
         boolean $$11 = false;
         ehe $$12 = ehe.b;
         int $$13 = 0;
         gu.a $$14 = new gu.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  ead $$18 = this.dK().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((cos)this.dK(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           ehe $$20 = $$18.c(this.dK(), $$14);
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

            if (!(this instanceof cbn)) {
               $$12 = $$12.d();
            }

            ehe $$21 = this.dn();
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
      egz $$0 = this.cG().g(1.0);
      int $$1 = arp.a($$0.a);
      int $$2 = arp.c($$0.d);
      int $$3 = arp.a($$0.c);
      int $$4 = arp.c($$0.f);
      return !this.dK().b($$1, $$3, $$2, $$4);
   }

   public double b(aqa<eac> $$0) {
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

   public ux<wp> U() {
      return new wq(this);
   }

   public bij a(bjk $$0) {
      return this.p.n();
   }

   public ehe di() {
      return this.u;
   }

   public ehe dj() {
      return this.di();
   }

   @Override
   public gu dk() {
      return this.v;
   }

   public dfa dl() {
      if (this.bn == null) {
         this.bn = this.dK().a_(this.dk());
      }

      return this.bn;
   }

   public cot dm() {
      return this.aE;
   }

   public ehe dn() {
      return this.aF;
   }

   public void f(ehe $$0) {
      this.aF = $$0;
   }

   public void g(ehe $$0) {
      this.f(this.dn().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.f(new ehe($$0, $$1, $$2));
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
         this.u = new ehe($$0, $$1, $$2);
         int $$3 = arp.a($$0);
         int $$4 = arp.a($$1);
         int $$5 = arp.a($$2);
         if ($$3 != this.v.u() || $$4 != this.v.v() || $$5 != this.v.w()) {
            this.v = new gu($$3, $$4, $$5);
            this.bn = null;
            if (hx.a($$3) != this.aE.e || hx.a($$5) != this.aE.f) {
               this.aE = new cot(this.v);
            }
         }

         this.aZ.a();
      }
   }

   public void dw() {
   }

   public ehe q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bi * 0.7, 0.0);
   }

   public void a(wq $$0) {
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
   public ciy dx() {
      return null;
   }

   public void o(boolean $$0) {
      this.aA = $$0;
   }

   public boolean dy() {
      return !this.ag().a(apo.i);
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
   public bii.c dG() {
      return this.aK;
   }

   @Override
   public final void b(bii.c $$0) {
      if (this.aK == null) {
         this.aK = $$0;
      }

      if (this.aK.a()) {
         this.aa();
      }

      this.cP().forEach(bii::aa);
      this.aZ.a($$0);
   }

   protected void dH() {
      this.aK = null;
   }

   @Override
   public void a(dis $$0) {
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

   public boolean a(cpm $$0, gu $$1) {
      return true;
   }

   public cpm dK() {
      return this.t;
   }

   protected void a(cpm $$0) {
      this.t = $$0;
   }

   public bhh dL() {
      return this.dK().ag();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = arp.d($$6, this.dp(), $$1);
      double $$8 = arp.d($$6, this.dr(), $$2);
      double $$9 = arp.d($$6, this.dv(), $$3);
      float $$10 = (float)arp.e($$6, (double)this.dA(), $$4);
      float $$11 = (float)arp.d($$6, (double)this.dC(), $$5);
      this.e($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   @FunctionalInterface
   public interface a {
      void accept(bii var1, double var2, double var4, double var6);
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
