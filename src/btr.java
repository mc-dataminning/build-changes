import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleListIterator;
import it.unimi.dsi.fastutil.floats.FloatArraySet;
import it.unimi.dsi.fastutil.floats.FloatArrays;
import it.unimi.dsi.fastutil.floats.FloatSet;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
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

public abstract class btr implements akk, brv, dyw, et, faa {
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
   private static final eyr d = new eyr(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double e = 0.014;
   private static final double k = 0.007;
   private static final double l = 0.0023333333333333335;
   public static final String I = "UUID";
   private static double m = 1.0;
   private final bty<?> n;
   private int o = c.incrementAndGet();
   public boolean J;
   private ImmutableList<btr> p = ImmutableList.of();
   protected int K;
   @Nullable
   private btr q;
   private dej r;
   public double L;
   public double M;
   public double N;
   private eyw s;
   private jf t;
   private ddp u;
   private eyw v = eyw.c;
   private float az;
   private float aA;
   public float O;
   public float P;
   private eyr aB = d;
   private boolean aC;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   public boolean U;
   protected eyw V = eyw.c;
   @Nullable
   private btr.c aD;
   public static final float W = 0.6F;
   public static final float X = 1.8F;
   public float Y;
   public float Z;
   public float aa;
   private float aE = 1.0F;
   public double ab;
   public double ac;
   public double ad;
   public boolean ae;
   protected final azn af = azn.a();
   public int ag;
   private int aF = -this.dj();
   protected boolean ah;
   protected Object2DoubleMap<axl<eqs>> ai = new Object2DoubleArrayMap(2);
   protected boolean aj;
   private final Set<axl<eqs>> aG = new HashSet<>();
   public int ak;
   protected boolean al = true;
   protected final akl am;
   protected static final akh<Byte> an = akl.a(btr.class, akj.a);
   protected static final int ao = 0;
   private static final int aH = 1;
   private static final int aI = 3;
   private static final int aJ = 4;
   private static final int aK = 5;
   protected static final int ap = 6;
   protected static final int aq = 7;
   private static final akh<Integer> aL = akl.a(btr.class, akj.b);
   private static final akh<Optional<xe>> aM = akl.a(btr.class, akj.g);
   private static final akh<Boolean> aN = akl.a(btr.class, akj.k);
   private static final akh<Boolean> aO = akl.a(btr.class, akj.k);
   private static final akh<Boolean> aP = akl.a(btr.class, akj.k);
   protected static final akh<buz> ar = akl.a(btr.class, akj.w);
   private static final akh<Integer> aQ = akl.a(btr.class, akj.b);
   private dyx aR = dyx.a;
   private final air aS = new air();
   public boolean as;
   @Nullable
   public buy at;
   private int aT;
   private boolean aU;
   protected UUID au = azf.a(this.af);
   protected String av = this.au.toString();
   private boolean aV;
   private final Set<String> aW = Sets.newHashSet();
   private final double[] aX = new double[]{0.0, 0.0, 0.0};
   private long aY;
   private btu aZ;
   private float ba;
   public boolean aw;
   public boolean ax;
   public Optional<jf> ay = Optional.empty();
   private boolean bb = false;
   private float bc;
   private int bd;
   private boolean be;
   @Nullable
   private dus bf = null;
   private final Set<dus> bg = new ReferenceArraySet();

   public btr(bty<?> $$0, dej $$1) {
      this.n = $$0;
      this.r = $$1;
      this.aZ = $$0.n();
      this.s = eyw.c;
      this.t = jf.c;
      this.u = ddp.b;
      akl.a $$2 = new akl.a(this);
      $$2.a(an, (byte)0);
      $$2.a(aL, this.cp());
      $$2.a(aN, false);
      $$2.a(aM, Optional.empty());
      $$2.a(aO, false);
      $$2.a(aP, false);
      $$2.a(ar, buz.a);
      $$2.a(aQ, 0);
      this.a($$2);
      this.am = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.ba = this.aZ.c();
   }

   public boolean a(jf $$0, dus $$1) {
      ezq $$2 = $$1.b(this.dS(), $$0, ezb.a(this));
      ezq $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return ezn.c($$3, ezn.a(this.cO()), eza.i);
   }

   public int i_() {
      fad $$0 = this.co();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean Q_() {
      return false;
   }

   public final void am() {
      if (this.bX()) {
         this.bM();
      }

      if (this.bW()) {
         this.af();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.aS.e(new eyw($$0, $$1, $$2));
   }

   public air an() {
      return this.aS;
   }

   public bty<?> ao() {
      return this.n;
   }

   @Override
   public int ap() {
      return this.o;
   }

   public void e(int $$0) {
      this.o = $$0;
   }

   public Set<String> aq() {
      return this.aW;
   }

   public boolean a(String $$0) {
      return this.aW.size() >= 1024 ? false : this.aW.add($$0);
   }

   public boolean b(String $$0) {
      return this.aW.remove($$0);
   }

   public void ar() {
      this.a(btr.c.a);
      this.a(dzp.p);
   }

   public final void as() {
      this.a(btr.c.b);
   }

   protected abstract void a(akl.a var1);

   public akl at() {
      return this.am;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof btr ? ((btr)$$0).o == this.o : false;
   }

   @Override
   public int hashCode() {
      return this.o;
   }

   public void a(btr.c $$0) {
      this.b($$0);
   }

   public void au() {
   }

   public void b(buz $$0) {
      this.am.a(ar, $$0);
   }

   public buz av() {
      return this.am.a(ar);
   }

   public boolean c(buz $$0) {
      return this.av() == $$0;
   }

   public boolean a(btr $$0, double $$1) {
      return this.dq().a((jy)$$0.dq(), $$1);
   }

   public boolean a(btr $$0, double $$1, double $$2) {
      double $$3 = $$0.dx() - this.dx();
      double $$4 = $$0.dz() - this.dz();
      double $$5 = $$0.dD() - this.dD();
      return azf.e($$3, $$5) < azf.k($$1) && azf.k($$4) < azf.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.v($$0 % 360.0F);
      this.w($$1 % 360.0F);
   }

   public final void b(eyw $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      this.a(this.aw());
   }

   protected eyr aw() {
      return this.aZ.a(this.s);
   }

   protected void ax() {
      this.a_(this.s.d, this.s.e, this.s.f);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.w(this.dK() + $$2);
      this.v(this.dI() + $$3);
      this.w(azf.a(this.dK(), -90.0F, 90.0F));
      this.P += $$2;
      this.O += $$3;
      this.P = azf.a(this.P, -90.0F, 90.0F);
      if (this.q != null) {
         this.q.k(this);
      }
   }

   public void l() {
      this.ay();
   }

   public void ay() {
      this.dS().ah().a("entityBaseTick");
      this.bf = null;
      if (this.bW() && this.dg().dN()) {
         this.af();
      }

      if (this.K > 0) {
         this.K--;
      }

      this.P = this.dK();
      this.O = this.dI();
      this.bT();
      if (this.bu()) {
         this.bv();
      }

      this.ax = this.aw;
      this.aw = false;
      this.bp();
      this.w();
      this.bo();
      if (this.dS().B) {
         this.aF();
      } else if (this.aF > 0) {
         if (this.bh()) {
            this.h(this.aF - 4);
            if (this.aF < 0) {
               this.aF();
            }
         } else {
            if (this.aF % 20 == 0 && !this.bw()) {
               this.a(this.dT().d(), 1.0F);
            }

            this.h(this.aF - 1);
         }

         if (this.cr() > 0) {
            this.k(0);
            this.dS().a(null, 1009, this.t, 1);
         }
      }

      if (this.bw()) {
         this.aD();
         this.aa *= 0.5F;
      }

      this.az();
      if (!this.dS().B) {
         this.c(this.aF > 0);
      }

      this.al = false;
      if (!this.dS().B && this instanceof bul) {
         bul.b_((btr)((bul)this));
      }

      this.dS().ah().c();
   }

   public void c(boolean $$0) {
      this.b(0, $$0 || this.be);
   }

   public void az() {
      if (this.dz() < (double)(this.dS().H_() - 64)) {
         this.aG();
      }
   }

   public void aA() {
      this.aT = this.bU();
   }

   public void f(int $$0) {
      this.aT = $$0;
   }

   public int aB() {
      return this.aT;
   }

   public boolean aC() {
      return this.aT > 0;
   }

   protected void N() {
      if (this.aC()) {
         this.aT--;
      }
   }

   public void aD() {
      if (!this.bh()) {
         this.d(15.0F);
         if (this.a(this.dT().e(), 4.0F)) {
            this.a(awg.kb, 0.4F, 2.0F + this.af.i() * 0.4F);
         }
      }
   }

   public final void d(float $$0) {
      this.g(azf.d($$0 * 20.0F));
   }

   public void g(int $$0) {
      if (this.aF < $$0) {
         this.h($$0);
      }
   }

   public void h(int $$0) {
      this.aF = $$0;
   }

   public int aE() {
      return this.aF;
   }

   public void aF() {
      this.h(0);
   }

   protected void aG() {
      this.as();
   }

   public boolean g(double $$0, double $$1, double $$2) {
      return this.b(this.cO().d($$0, $$1, $$2));
   }

   private boolean b(eyr $$0) {
      return this.dS().a(this, $$0) && !this.dS().d($$0);
   }

   public void d(boolean $$0) {
      this.aC = $$0;
      this.a($$0, null);
   }

   public void a(boolean $$0, boolean $$1, eyw $$2) {
      this.aC = $$0;
      this.Q = $$1;
      this.a($$0, $$2);
   }

   public boolean d(jf $$0) {
      return this.ay.isPresent() && this.ay.get().equals($$0);
   }

   protected void a(boolean $$0, @Nullable eyw $$1) {
      if ($$0) {
         eyr $$2 = this.cO();
         eyr $$3 = new eyr($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<jf> $$4 = this.r.h(this, $$3);
         if ($$4.isPresent() || this.bb) {
            this.ay = $$4;
         } else if ($$1 != null) {
            eyr $$5 = $$3.d(-$$1.d, 0.0, -$$1.f);
            $$4 = this.r.h(this, $$5);
            this.ay = $$4;
         }

         this.bb = $$4.isEmpty();
      } else {
         this.bb = false;
         if (this.ay.isPresent()) {
            this.ay = Optional.empty();
         }
      }
   }

   public boolean aH() {
      return this.aC;
   }

   public void a(bur $$0, eyw $$1) {
      if (this.ae) {
         this.a_(this.dx() + $$1.d, this.dz() + $$1.e, this.dD() + $$1.f);
      } else {
         if ($$0 == bur.c) {
            $$1 = this.d($$1);
            if ($$1.equals(eyw.c)) {
               return;
            }
         }

         this.dS().ah().a("move");
         if (this.V.h() > 1.0E-7) {
            $$1 = $$1.h(this.V);
            this.V = eyw.c;
            this.h(eyw.c);
         }

         $$1 = this.a($$1, $$0);
         eyw $$2 = this.a($$1);
         double $$3 = $$2.h();
         if ($$3 > 1.0E-7 || $$1.h() - $$3 < 1.0E-7) {
            if (this.aa != 0.0F && $$3 >= 1.0) {
               eys $$4 = this.dS().a(new ddr(this.dq(), this.dq().e($$2), ddr.a.d, ddr.b.d, this));
               if ($$4.d() != eyu.a.a) {
                  this.n();
               }
            }

            this.a_(this.dx() + $$2.d, this.dz() + $$2.e, this.dD() + $$2.f);
         }

         this.dS().ah().c();
         this.dS().ah().a("rest");
         boolean $$5 = !azf.b($$1.d, $$2.d);
         boolean $$6 = !azf.b($$1.f, $$2.f);
         this.Q = $$5 || $$6;
         this.R = $$1.e != $$2.e;
         this.S = this.R && $$1.e < 0.0;
         if (this.Q) {
            this.T = this.c($$2);
         } else {
            this.T = false;
         }

         this.a(this.S, this.Q, $$2);
         jf $$7 = this.aN();
         dus $$8 = this.dS().a_($$7);
         if (!this.dS().x_() || this.de()) {
            this.a($$2.e, this.aH(), $$8, $$7);
         }

         if (this.dN()) {
            this.dS().ah().c();
         } else {
            if (this.Q) {
               eyw $$9 = this.dv();
               this.n($$5 ? 0.0 : $$9.d, $$9.e, $$6 ? 0.0 : $$9.f);
            }

            if (this.de()) {
               dhm $$10 = $$8.b();
               if ($$1.e != $$2.e) {
                  $$10.a(this.dS(), this);
               }
            }

            if (!this.dS().x_() || this.de()) {
               btr.b $$11 = this.bf();
               if ($$11.a() && !this.bW()) {
                  this.a($$11, $$2, $$7, $$8);
               }
            }

            float $$12 = this.aR();
            this.h(this.dv().d((double)$$12, 1.0, (double)$$12));
            this.dS().ah().c();
         }
      }
   }

   private void a(btr.b $$0, eyw $$1, jf $$2, dus $$3) {
      float $$4 = 0.6F;
      float $$5 = (float)($$1.g() * 0.6F);
      float $$6 = (float)($$1.i() * 0.6F);
      jf $$7 = this.aP();
      dus $$8 = this.dS().a_($$7);
      boolean $$9 = this.c($$8);
      this.Y += $$9 ? $$5 : $$6;
      this.Z += $$5;
      if (this.Y > this.aE && !$$8.l()) {
         boolean $$10 = $$7.equals($$2);
         boolean $$11 = this.a($$2, $$3, $$0.c(), $$10, $$1);
         if (!$$10) {
            $$11 |= this.a($$7, $$8, false, $$0.b(), $$1);
         }

         if ($$11) {
            this.aE = this.aS();
         } else if (this.bi()) {
            this.aE = this.aS();
            if ($$0.c()) {
               this.aX();
            }

            if ($$0.b()) {
               this.a(dzp.Q);
            }
         }
      } else if ($$8.l()) {
         this.aM();
      }
   }

   public void aI() {
      if (this.aJ()) {
         boolean $$0 = this.bV();
         if (this.aH()) {
            jf $$1 = this.aN();
            dus $$2 = this.dS().a_($$1);
            $$2.b().a(this.dS(), $$1, $$2, this);
         }

         this.a(this.bg);
         boolean $$3 = Iterables.any(this.bg, $$0x -> $$0x.a(awv.aL) || $$0x.a(dho.H));
         this.bg.clear();
         if (!$$3) {
            if (this.aF <= 0) {
               this.h(-this.dj());
            }

            if ($$0 && (this.aw || this.bk())) {
               this.aK();
            }
         }

         if (this.bV() && (this.aw || this.bk())) {
            this.h(-this.dj());
         }
      }
   }

   protected boolean aJ() {
      return !this.dN() && !this.ae;
   }

   private boolean c(dus $$0) {
      return $$0.a(awv.aQ) || $$0.a(dho.qP);
   }

   private boolean a(jf $$0, dus $$1, boolean $$2, boolean $$3, eyw $$4) {
      if ($$1.l()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aH() || $$5 || this.cf() && $$4.e == 0.0 || this.cn()) && !this.ch()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dS().a(dzp.P, this.dq(), dzp.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(eyw $$0) {
      return false;
   }

   protected void aK() {
      this.a(awg.kg, 0.7F, 1.6F + (this.af.i() - this.af.i()) * 0.4F);
   }

   public void aL() {
      if (!this.dS().B && this.bV()) {
         this.aK();
      }

      this.aF();
   }

   protected void aM() {
      if (this.aZ()) {
         this.aY();
         if (this.bf().b()) {
            this.a(dzp.x);
         }
      }
   }

   @Deprecated
   public jf aN() {
      return this.e(0.2F);
   }

   public jf aO() {
      return this.e(0.500001F);
   }

   public jf aP() {
      return this.e(1.0E-5F);
   }

   protected jf e(float $$0) {
      if (this.ay.isPresent()) {
         jf $$1 = this.ay.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dus $$2 = this.dS().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(awv.T)) && !$$2.a(awv.M) && !($$2.b() instanceof dkl) ? $$1.h(azf.a(this.s.e - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = azf.a(this.s.d);
         int $$4 = azf.a(this.s.e - (double)$$0);
         int $$5 = azf.a(this.s.f);
         return new jf($$3, $$4, $$5);
      }
   }

   protected float aQ() {
      float $$0 = this.dS().a_(this.ds()).b().j();
      float $$1 = this.dS().a_(this.aO()).b().j();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aR() {
      dus $$0 = this.dS().a_(this.ds());
      float $$1 = $$0.b().h();
      if (!$$0.a(dho.G) && !$$0.a(dho.nd)) {
         return (double)$$1 == 1.0 ? this.dS().a_(this.aO()).b().h() : $$1;
      } else {
         return $$1;
      }
   }

   protected eyw a(eyw $$0, bur $$1) {
      return $$0;
   }

   protected eyw d(eyw $$0) {
      if ($$0.h() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dS().aa();
         if ($$1 != this.aY) {
            Arrays.fill(this.aX, 0.0);
            this.aY = $$1;
         }

         if ($$0.d != 0.0) {
            double $$2 = this.a(jk.a.a, $$0.d);
            return Math.abs($$2) <= 1.0E-5F ? eyw.c : new eyw($$2, 0.0, 0.0);
         } else if ($$0.e != 0.0) {
            double $$3 = this.a(jk.a.b, $$0.e);
            return Math.abs($$3) <= 1.0E-5F ? eyw.c : new eyw(0.0, $$3, 0.0);
         } else if ($$0.f != 0.0) {
            double $$4 = this.a(jk.a.c, $$0.f);
            return Math.abs($$4) <= 1.0E-5F ? eyw.c : new eyw(0.0, 0.0, $$4);
         } else {
            return eyw.c;
         }
      }
   }

   private double a(jk.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = azf.a($$1 + this.aX[$$2], -0.51, 0.51);
      $$1 = $$3 - this.aX[$$2];
      this.aX[$$2] = $$3;
      return $$1;
   }

   private eyw a(eyw $$0) {
      eyr $$1 = this.cO();
      List<ezq> $$2 = this.dS().c(this, $$1.b($$0));
      eyw $$3 = $$0.h() == 0.0 ? $$0 : a(this, $$0, $$1, this.dS(), $$2);
      boolean $$4 = $$0.d != $$3.d;
      boolean $$5 = $$0.e != $$3.e;
      boolean $$6 = $$0.f != $$3.f;
      boolean $$7 = $$5 && $$0.e < 0.0;
      if (this.dM() > 0.0F && ($$7 || this.aH()) && ($$4 || $$6)) {
         eyr $$8 = $$7 ? $$1.d(0.0, $$3.e, 0.0) : $$1;
         eyr $$9 = $$8.b($$0.d, (double)this.dM(), $$0.f);
         if (!$$7) {
            $$9 = $$9.b(0.0, -1.0E-5F, 0.0);
         }

         List<ezq> $$10 = a(this, this.r, $$2, $$9);
         float $$11 = (float)$$3.e;
         float[] $$12 = a($$8, $$10, this.dM(), $$11);

         for (float $$13 : $$12) {
            eyw $$14 = a(new eyw($$0.d, (double)$$13, $$0.f), $$8, $$10);
            if ($$14.j() > $$3.j()) {
               double $$15 = $$1.b - $$8.b;
               return $$14.b(0.0, -$$15, 0.0);
            }
         }
      }

      return $$3;
   }

   private static float[] a(eyr $$0, List<ezq> $$1, float $$2, float $$3) {
      FloatSet $$4 = new FloatArraySet(4);

      for (ezq $$5 : $$1) {
         DoubleList $$6 = $$5.a(jk.a.b);
         DoubleListIterator var8 = $$6.iterator();

         while (var8.hasNext()) {
            double $$7 = (Double)var8.next();
            float $$8 = (float)($$7 - $$0.b);
            if (!($$8 < 0.0F) && $$8 != $$3) {
               if ($$8 > $$2) {
                  break;
               }

               $$4.add($$8);
            }
         }
      }

      float[] $$9 = $$4.toFloatArray();
      FloatArrays.unstableSort($$9);
      return $$9;
   }

   public static eyw a(@Nullable btr $$0, eyw $$1, eyr $$2, dej $$3, List<ezq> $$4) {
      List<ezq> $$5 = a($$0, $$3, $$4, $$2.b($$1));
      return a($$1, $$2, $$5);
   }

   private static List<ezq> a(@Nullable btr $$0, dej $$1, List<ezq> $$2, eyr $$3) {
      Builder<ezq> $$4 = ImmutableList.builderWithExpectedSize($$2.size() + 1);
      if (!$$2.isEmpty()) {
         $$4.addAll($$2);
      }

      dwj $$5 = $$1.B_();
      boolean $$6 = $$0 != null && $$5.a($$0, $$3);
      if ($$6) {
         $$4.add($$5.c());
      }

      $$4.addAll($$1.e($$0, $$3));
      return $$4.build();
   }

   private static eyw a(eyw $$0, eyr $$1, List<ezq> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.d;
         double $$4 = $$0.e;
         double $$5 = $$0.f;
         if ($$4 != 0.0) {
            $$4 = ezn.a(jk.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = ezn.a(jk.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = ezn.a(jk.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = ezn.a(jk.a.c, $$1, $$2, $$5);
         }

         return new eyw($$3, $$4, $$5);
      }
   }

   protected float aS() {
      return (float)((int)this.Y + 1);
   }

   protected awf aT() {
      return awg.kk;
   }

   protected awf aU() {
      return awg.kj;
   }

   protected awf aV() {
      return awg.kj;
   }

   protected void aW() {
      this.a(null);
   }

   protected void a(@Nullable Set<dus> $$0) {
      eyw $$1 = this.bz();
      eyw $$2 = this.s;

      for (jf $$3 : ddo.a($$1, $$2, this.cO())) {
         if (!this.bI()) {
            return;
         }

         dus $$4 = this.dS().a_($$3);
         if (!$$4.l()) {
            try {
               $$4.a(this.dS(), $$3, this);
               this.a($$4);
            } catch (Throwable var11) {
               o $$6 = o.a(var11, "Colliding entity with block");
               p $$7 = $$6.a("Block being collided with");
               p.a($$7, this.dS(), $$3, $$4);
               p $$8 = $$6.a("Entity being checked for collision");
               this.a($$8);
               throw new z($$6);
            }

            if ($$0 != null) {
               $$0.add($$4);
            }
         }
      }
   }

   protected void a(dus $$0) {
   }

   public jf a(arj $$0, jf $$1) {
      jf $$2 = $$0.W();
      eyw $$3 = $$2.b();
      int $$4 = $$0.m($$2).a(eao.a.f, $$2.u(), $$2.w()) + 1;
      return jf.a($$3.d, (double)$$4, $$3.f);
   }

   public void a(jo<dzp> $$0, @Nullable btr $$1) {
      this.dS().a($$1, $$0, this.s);
   }

   public void a(jo<dzp> $$0) {
      this.a($$0, this);
   }

   private void c(jf $$0, dus $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.o();
      }
   }

   protected void aX() {
      btr $$0 = Objects.requireNonNullElse(this.cU(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      eyw $$2 = $$0.dv();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      this.f($$3);
   }

   protected jf e(jf $$0) {
      jf $$1 = $$0.d();
      dus $$2 = this.dS().a_($$1);
      return !$$2.a(awv.bo) && !$$2.a(awv.bp) ? $$0 : $$1;
   }

   protected void a(dus $$0, dus $$1) {
      dpa $$2 = $$0.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dus $$0) {
      dpa $$1 = $$0.A();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(jf $$0, dus $$1) {
      dpa $$2 = $$1.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dus $$0) {
      return $$0.a(awv.bn) && this.ag >= this.bd + 20;
   }

   private void o() {
      this.bc = this.bc * (float)Math.pow(0.997, (double)(this.ag - this.bd));
      this.bc = Math.min(1.0F, this.bc + 0.07F);
      float $$0 = 0.5F + this.bc * this.af.i() * 1.2F;
      float $$1 = 0.1F + this.bc * 1.2F;
      this.a(awg.E, $$1, $$0);
      this.bd = this.ag;
   }

   protected void f(float $$0) {
      this.a(this.aT(), $$0, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
   }

   protected void aY() {
   }

   protected boolean aZ() {
      return false;
   }

   public void a(awf $$0, float $$1, float $$2) {
      if (!this.ba()) {
         this.dS().a(null, this.dx(), this.dz(), this.dD(), $$0, this.di(), $$1, $$2);
      }
   }

   public void a(awf $$0) {
      if (!this.ba()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean ba() {
      return this.am.a(aO);
   }

   public void e(boolean $$0) {
      this.am.a(aO, $$0);
   }

   public boolean bb() {
      return this.am.a(aP);
   }

   public void f(boolean $$0) {
      this.am.a(aP, $$0);
   }

   protected double bc() {
      return 0.0;
   }

   public final double bd() {
      return this.bb() ? 0.0 : this.bc();
   }

   protected void be() {
      double $$0 = this.bd();
      if ($$0 != 0.0) {
         this.h(this.dv().b(0.0, -$$0, 0.0));
      }
   }

   protected btr.b bf() {
      return btr.b.d;
   }

   public boolean bg() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dus $$2, jf $$3) {
      if ($$1) {
         if (this.aa > 0.0F) {
            $$2.b().a(this.dS(), $$2, $$3, this, this.aa);
            this.dS().a(dzp.A, this.s, dzp.a.a(this, this.ay.<dus>map($$0x -> this.dS().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.aa -= (float)$$0;
      }
   }

   public boolean bh() {
      return this.ao().d();
   }

   public boolean a(float $$0, float $$1, bsj $$2) {
      if (this.n.a(awz.o)) {
         return false;
      } else {
         if (this.bX()) {
            for (btr $$3 : this.cW()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean bi() {
      return this.ah;
   }

   private boolean q() {
      jf $$0 = this.ds();
      return this.dS().r($$0) || this.dS().r(jf.a((double)$$0.u(), this.cO().e, (double)$$0.w()));
   }

   private boolean v() {
      return this.dt().a(dho.nd);
   }

   public boolean bj() {
      return this.bi() || this.q();
   }

   public boolean bk() {
      return this.bi() || this.q() || this.v();
   }

   public boolean bl() {
      return this.bi() || this.v();
   }

   public boolean bm() {
      return this.bl() || this.bw();
   }

   public boolean bn() {
      return this.aj && this.bi();
   }

   public void bo() {
      if (this.ch()) {
         this.i(this.cg() && this.bi() && !this.bW());
      } else {
         this.i(this.cg() && this.bn() && !this.bW() && this.dS().b_(this.t).a(axb.a));
      }
   }

   protected boolean bp() {
      this.ai.clear();
      this.bq();
      double $$0 = this.dS().C_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(axb.b, $$0);
      return this.bi() || $$1;
   }

   void bq() {
      if (this.dg() instanceof cpx $$0 && !$$0.bn()) {
         this.ah = false;
         return;
      }

      if (this.a(axb.a, 0.014)) {
         if (!this.ah && !this.al) {
            this.br();
         }

         this.n();
         this.ah = true;
         this.aF();
      } else {
         this.ah = false;
      }
   }

   private void w() {
      this.aj = this.a(axb.a);
      this.aG.clear();
      double $$0 = this.dB();
      if (this.dg() instanceof cpx $$2 && !$$2.bn() && $$2.cO().e >= $$0 && $$2.cO().b <= $$0) {
         return;
      }

      jf $$3 = jf.a(this.dx(), $$0, this.dD());
      eqt $$4 = this.dS().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a(this.dS(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aG::add);
      }
   }

   protected void br() {
      btr $$0 = Objects.requireNonNullElse(this.cU(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      eyw $$2 = $$0.dv();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aU(), $$3, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
      } else {
         this.a(this.aV(), $$3, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
      }

      float $$4 = (float)azf.a(this.dz());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.aZ.a() * 20.0F; $$5++) {
         double $$6 = (this.af.j() * 2.0 - 1.0) * (double)this.aZ.a();
         double $$7 = (this.af.j() * 2.0 - 1.0) * (double)this.aZ.a();
         this.dS().a(lo.d, this.dx() + $$6, (double)($$4 + 1.0F), this.dD() + $$7, $$2.d, $$2.e - this.af.j() * 0.2F, $$2.f);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.aZ.a() * 20.0F; $$8++) {
         double $$9 = (this.af.j() * 2.0 - 1.0) * (double)this.aZ.a();
         double $$10 = (this.af.j() * 2.0 - 1.0) * (double)this.aZ.a();
         this.dS().a(lo.am, this.dx() + $$9, (double)($$4 + 1.0F), this.dD() + $$10, $$2.d, $$2.e, $$2.f);
      }

      this.a(dzp.O);
   }

   @Deprecated
   protected dus bs() {
      return this.dS().a_(this.aN());
   }

   public dus bt() {
      return this.dS().a_(this.aP());
   }

   public boolean bu() {
      return this.cg() && !this.bi() && !this.Q_() && !this.cf() && !this.bw() && this.bI();
   }

   protected void bv() {
      jf $$0 = this.aN();
      dus $$1 = this.dS().a_($$0);
      if ($$1.o() != dnt.a) {
         eyw $$2 = this.dv();
         jf $$3 = this.ds();
         double $$4 = this.dx() + (this.af.j() - 0.5) * (double)this.aZ.a();
         double $$5 = this.dD() + (this.af.j() - 0.5) * (double)this.aZ.a();
         if ($$3.u() != $$0.u()) {
            $$4 = azf.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = azf.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dS().a(new lg(lo.b, $$1), $$4, this.dz() + 0.1, $$5, $$2.d * -4.0, 1.5, $$2.f * -4.0);
      }
   }

   public boolean a(axl<eqs> $$0) {
      return this.aG.contains($$0);
   }

   public boolean bw() {
      return !this.al && this.ai.getDouble(axb.b) > 0.0;
   }

   public void a(float $$0, eyw $$1) {
      eyw $$2 = a($$1, $$0, this.dI());
      this.h(this.dv().e($$2));
   }

   protected static eyw a(eyw $$0, float $$1, float $$2) {
      double $$3 = $$0.h();
      if ($$3 < 1.0E-7) {
         return eyw.c;
      } else {
         eyw $$4 = ($$3 > 1.0 ? $$0.d() : $$0).c((double)$$1);
         float $$5 = azf.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = azf.b($$2 * (float) (Math.PI / 180.0));
         return new eyw($$4.d * (double)$$6 - $$4.f * (double)$$5, $$4.e, $$4.f * (double)$$6 + $$4.d * (double)$$5);
      }
   }

   @Deprecated
   public float bx() {
      return this.dS().f(this.dw(), this.dC()) ? this.dS().x(jf.a(this.dx(), this.dB(), this.dD())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.b($$3, $$4);
   }

   public void b(float $$0, float $$1) {
      this.v($$0 % 360.0F);
      this.w(azf.a($$1, -90.0F, 90.0F) % 360.0F);
      this.O = this.dI();
      this.P = this.dK();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = azf.a($$0, -3.0E7, 3.0E7);
      double $$4 = azf.a($$2, -3.0E7, 3.0E7);
      this.L = $$3;
      this.M = $$1;
      this.N = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(eyw $$0) {
      this.e($$0.d, $$0.e, $$0.f);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dI(), this.dK());
   }

   public void a(jf $$0, float $$1, float $$2) {
      this.b($$0.c(), $$1, $$2);
   }

   public void b(eyw $$0, float $$1, float $$2) {
      this.b($$0.d, $$0.e, $$0.f, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.o($$0, $$1, $$2);
      this.v($$3);
      this.w($$4);
      this.by();
      this.ax();
   }

   public final void by() {
      double $$0 = this.dx();
      double $$1 = this.dz();
      double $$2 = this.dD();
      this.L = $$0;
      this.M = $$1;
      this.N = $$2;
      this.ab = $$0;
      this.ac = $$1;
      this.ad = $$2;
      this.O = this.dI();
      this.P = this.dK();
   }

   public final eyw bz() {
      return new eyw(this.ab, this.ac, this.ad);
   }

   public float f(btr $$0) {
      float $$1 = (float)(this.dx() - $$0.dx());
      float $$2 = (float)(this.dz() - $$0.dz());
      float $$3 = (float)(this.dD() - $$0.dD());
      return azf.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dx() - $$0;
      double $$4 = this.dz() - $$1;
      double $$5 = this.dD() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(btr $$0) {
      return this.f($$0.dq());
   }

   public double f(eyw $$0) {
      double $$1 = this.dx() - $$0.d;
      double $$2 = this.dz() - $$0.e;
      double $$3 = this.dD() - $$0.f;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cnx $$0) {
   }

   public void h(btr $$0) {
      if (!this.z($$0)) {
         if (!$$0.ae && !this.ae) {
            double $$1 = $$0.dx() - this.dx();
            double $$2 = $$0.dD() - this.dD();
            double $$3 = azf.a($$1, $$2);
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

   public void g(eyw $$0) {
      this.j($$0.d, $$0.e, $$0.f);
   }

   public void j(double $$0, double $$1, double $$2) {
      this.h(this.dv().b($$0, $$1, $$2));
      this.as = true;
   }

   protected void bA() {
      this.U = true;
   }

   public boolean a(bsj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bA();
         return false;
      }
   }

   public final eyw g(float $$0) {
      return this.c(this.h($$0), this.i($$0));
   }

   public jk bB() {
      return jk.a(this.g(1.0F));
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dK() : azf.h($$0, this.P, this.dK());
   }

   public float i(float $$0) {
      return $$0 == 1.0F ? this.dI() : azf.h($$0, this.O, this.dI());
   }

   public float j(float $$0) {
      return azf.h($$0, this.P, this.dK());
   }

   public float k(float $$0) {
      return azf.i($$0, this.O, this.dI());
   }

   public final eyw c(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = azf.b($$3);
      float $$5 = azf.a($$3);
      float $$6 = azf.b($$2);
      float $$7 = azf.a($$2);
      return new eyw((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final eyw l(float $$0) {
      return this.d(this.h($$0), this.i($$0));
   }

   protected final eyw d(float $$0, float $$1) {
      return this.c($$0 - 90.0F, $$1);
   }

   public final eyw bC() {
      return new eyw(this.dx(), this.dB(), this.dD());
   }

   public final eyw m(float $$0) {
      double $$1 = azf.d((double)$$0, this.L, this.dx());
      double $$2 = azf.d((double)$$0, this.M, this.dz()) + (double)this.cP();
      double $$3 = azf.d((double)$$0, this.N, this.dD());
      return new eyw($$1, $$2, $$3);
   }

   public eyw n(float $$0) {
      return this.m($$0);
   }

   public final eyw o(float $$0) {
      double $$1 = azf.d((double)$$0, this.L, this.dx());
      double $$2 = azf.d((double)$$0, this.M, this.dz());
      double $$3 = azf.d((double)$$0, this.N, this.dD());
      return new eyw($$1, $$2, $$3);
   }

   public eyu a(double $$0, float $$1, boolean $$2) {
      eyw $$3 = this.m($$1);
      eyw $$4 = this.g($$1);
      eyw $$5 = $$3.b($$4.d * $$0, $$4.e * $$0, $$4.f * $$0);
      return this.dS().a(new ddr($$3, $$5, ddr.a.b, $$2 ? ddr.b.c : ddr.b.a, this));
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

   public void a(btr $$0, int $$1, bsj $$2) {
      if ($$0 instanceof ark) {
         an.d.a((ark)$$0, this, $$2);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.dx() - $$0;
      double $$4 = this.dz() - $$1;
      double $$5 = this.dD() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cO().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * m;
      return $$0 < $$1 * $$1;
   }

   public boolean d(ug $$0) {
      if (this.aD != null && !this.aD.b()) {
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

   public boolean e(ug $$0) {
      return this.bW() ? false : this.d($$0);
   }

   public ug f(ug $$0) {
      try {
         if (this.q != null) {
            $$0.a("Pos", this.a(this.q.dx(), this.dz(), this.q.dD()));
         } else {
            $$0.a("Pos", this.a(this.dx(), this.dz(), this.dD()));
         }

         eyw $$1 = this.dv();
         $$0.a("Motion", this.a($$1.d, $$1.e, $$1.f));
         $$0.a("Rotation", this.a(this.dI(), this.dK()));
         $$0.a("FallDistance", this.aa);
         $$0.a("Fire", (short)this.aF);
         $$0.a("Air", (short)this.cq());
         $$0.a("OnGround", this.aH());
         $$0.a("Invulnerable", this.aU);
         $$0.a("PortalCooldown", this.aT);
         $$0.a("UUID", this.cD());
         xe $$2 = this.al();
         if ($$2 != null) {
            $$0.a("CustomName", xe.a.a($$2, this.dU()));
         }

         if (this.cI()) {
            $$0.a("CustomNameVisible", this.cI());
         }

         if (this.ba()) {
            $$0.a("Silent", this.ba());
         }

         if (this.bb()) {
            $$0.a("NoGravity", this.bb());
         }

         if (this.aV) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.cr();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.cr());
         }

         if (this.be) {
            $$0.a("HasVisualFire", this.be);
         }

         if (!this.aW.isEmpty()) {
            um $$4 = new um();

            for (String $$5 : this.aW) {
               $$4.add(vb.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bX()) {
            um $$6 = new um();

            for (btr $$7 : this.cW()) {
               ug $$8 = new ug();
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

   public void g(ug $$0) {
      try {
         um $$1 = $$0.c("Pos", 6);
         um $$2 = $$0.c("Motion", 6);
         um $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.n(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.o(azf.a($$1.h(0), -3.0000512E7, 3.0000512E7), azf.a($$1.h(1), -2.0E7, 2.0E7), azf.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.v($$3.i(0));
         this.w($$3.i(1));
         this.by();
         this.q(this.dI());
         this.r(this.dI());
         this.aa = $$0.j("FallDistance");
         this.aF = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.j($$0.g("Air"));
         }

         this.aC = $$0.q("OnGround");
         this.aU = $$0.q("Invulnerable");
         this.aT = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.au = $$0.a("UUID");
            this.av = this.au.toString();
         }

         if (!Double.isFinite(this.dx()) || !Double.isFinite(this.dz()) || !Double.isFinite(this.dD())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dI()) && Double.isFinite((double)this.dK())) {
            this.ax();
            this.a(this.dI(), this.dK());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(xe.a.a($$8, this.dU()));
               } catch (Exception var16) {
                  b.warn("Failed to parse entity custom name {}", $$8, var16);
               }
            }

            this.p($$0.q("CustomNameVisible"));
            this.e($$0.q("Silent"));
            this.f($$0.q("NoGravity"));
            this.j($$0.q("Glowing"));
            this.k($$0.h("TicksFrozen"));
            this.be = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.aW.clear();
               um $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.aW.add($$10.j($$12));
               }
            }

            this.a($$0);
            if (this.bG()) {
               this.ax();
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
      bty<?> $$0 = this.ao();
      ale $$1 = bty.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(ug var1);

   protected abstract void b(ug var1);

   protected um a(double... $$0) {
      um $$1 = new um();

      for (double $$2 : $$0) {
         $$1.add(uh.a($$2));
      }

      return $$1;
   }

   protected um a(float... $$0) {
      um $$1 = new um();

      for (float $$2 : $$0) {
         $$1.add(uj.a($$2));
      }

      return $$1;
   }

   @Nullable
   public ckh a(dei $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public ckh a(dei $$0, int $$1) {
      return this.a(new cvs($$0), (float)$$1);
   }

   @Nullable
   public ckh b(cvs $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public ckh a(cvs $$0, float $$1) {
      if ($$0.f()) {
         return null;
      } else if (this.dS().B) {
         return null;
      } else {
         ckh $$2 = new ckh(this.dS(), this.dx(), this.dz() + (double)$$1, this.dD(), $$0);
         $$2.q();
         this.dS().b($$2);
         return $$2;
      }
   }

   public boolean bI() {
      return !this.dN();
   }

   public boolean bJ() {
      if (this.ae) {
         return false;
      } else {
         float $$0 = this.aZ.a() * 0.8F;
         eyr $$1 = eyr.a(this.bC(), (double)$$0, 1.0E-6, (double)$$0);
         return jf.b($$1)
            .anyMatch(
               $$1x -> {
                  dus $$2 = this.dS().a_($$1x);
                  return !$$2.l()
                     && $$2.j(this.dS(), $$1x)
                     && ezn.c($$2.g(this.dS(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), ezn.a($$1), eza.i);
               }
            );
      }
   }

   public brs a(cnx $$0, brr $$1) {
      if (this.bI() && this instanceof bul $$2) {
         if ($$2.C() == $$0) {
            if (!this.dS().x_()) {
               $$2.a(true, !$$0.fR());
               this.a(dzp.r, $$0);
            }

            return brs.a;
         }

         cvs $$3 = $$0.b($$1);
         if ($$3.a(cvw.uM) && $$2.N_()) {
            if (!this.dS().x_()) {
               $$2.b($$0, true);
            }

            $$3.h(1);
            return brs.a;
         }
      }

      return brs.e;
   }

   public boolean i(btr $$0) {
      return $$0.bK() && !this.z($$0);
   }

   public boolean bK() {
      return false;
   }

   public void u() {
      this.h(eyw.c);
      this.l();
      if (this.bW()) {
         this.dg().j(this);
      }
   }

   public final void j(btr $$0) {
      if (this.y($$0)) {
         this.a($$0, btr::a_);
      }
   }

   protected void a(btr $$0, btr.a $$1) {
      eyw $$2 = this.m($$0);
      eyw $$3 = $$0.l(this);
      $$1.accept($$0, $$2.d - $$3.d, $$2.e - $$3.e, $$2.f - $$3.f);
   }

   public void k(btr $$0) {
   }

   public eyw l(btr $$0) {
      return this.dp().b(bts.b, 0, this.az);
   }

   public eyw m(btr $$0) {
      return this.dq().e(this.a($$0, this.aZ, 1.0F));
   }

   protected eyw a(btr $$0, btu $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static eyw a(btr $$0, btr $$1, btt $$2) {
      int $$3 = $$0.cW().indexOf($$1);
      return $$2.c(bts.a, $$3, $$0.az);
   }

   public boolean n(btr $$0) {
      return this.a($$0, false);
   }

   public boolean bL() {
      return this instanceof bun;
   }

   public boolean a(btr $$0, boolean $$1) {
      if ($$0 == this.q) {
         return false;
      } else if (!$$0.bO()) {
         return false;
      } else {
         for (btr $$2 = $$0; $$2.q != null; $$2 = $$2.q) {
            if ($$2.q == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bW()) {
               this.af();
            }

            this.b(buz.a);
            this.q = $$0;
            this.q.p(this);
            $$0.D().filter($$0x -> $$0x instanceof ark).forEach($$0x -> an.U.a((ark)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(btr $$0) {
      return !this.ca() && this.K <= 0;
   }

   public void bM() {
      for (int $$0 = this.p.size() - 1; $$0 >= 0; $$0--) {
         ((btr)this.p.get($$0)).af();
      }
   }

   public void bN() {
      if (this.q != null) {
         btr $$0 = this.q;
         this.q = null;
         $$0.q(this);
      }
   }

   public void af() {
      this.bN();
   }

   protected void p(btr $$0) {
      if ($$0.dg() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.p.isEmpty()) {
            this.p = ImmutableList.of($$0);
         } else {
            List<btr> $$1 = Lists.newArrayList(this.p);
            if (!this.dS().B && $$0 instanceof cnx && !(this.cX() instanceof cnx)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.p = ImmutableList.copyOf($$1);
         }

         this.a(dzp.s, $$0);
      }
   }

   protected void q(btr $$0) {
      if ($$0.dg() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.p.size() == 1 && this.p.get(0) == $$0) {
            this.p = ImmutableList.of();
         } else {
            this.p = this.p.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.K = 60;
         this.a(dzp.q, $$0);
      }
   }

   protected boolean r(btr $$0) {
      return this.p.isEmpty();
   }

   protected boolean bO() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public double d_() {
      return this.dx();
   }

   public double e_() {
      return this.dz();
   }

   public double O_() {
      return this.dD();
   }

   public float P_() {
      return this.dK();
   }

   public float f_() {
      return this.dI();
   }

   public void a(float $$0, int $$1) {
      this.q($$0);
   }

   public float bP() {
      return 0.0F;
   }

   public eyw bQ() {
      return this.c(this.dK(), this.dI());
   }

   public eyw a(cvn $$0) {
      if (!(this instanceof cnx $$1)) {
         return eyw.c;
      } else {
         boolean $$2 = $$1.eX().a($$0) && !$$1.eW().a($$0);
         buh $$3 = $$2 ? $$1.fu().e() : $$1.fu();
         return this.c(0.0F, this.dI() + (float)($$3 == buh.b ? 80 : -80)).c(0.5);
      }
   }

   public eyv bR() {
      return new eyv(this.dK(), this.dI());
   }

   public eyw bS() {
      return eyw.a(this.bR());
   }

   public void a(dnf $$0, jf $$1) {
      if (this.aC()) {
         this.aA();
      } else {
         if (this.at != null && this.at.a($$0)) {
            this.at.a($$1.j());
            this.at.a(true);
         } else {
            this.at = new buy($$0, $$1.j());
         }
      }
   }

   protected void bT() {
      if (this.dS() instanceof arj $$0) {
         this.N();
         if (this.at != null) {
            if (this.at.a($$0, this, this.o(false))) {
               $$0.ah().a("portal");
               this.aA();
               err $$2 = this.at.a($$0, this);
               if ($$2 != null) {
                  arj $$3 = $$2.a();
                  if ($$0.o().a((dej)$$3) && ($$3.ag() == $$0.ag() || this.a($$0, $$3))) {
                     this.b($$2);
                  }
               }

               $$0.ah().c();
            } else if (this.at.b()) {
               this.at = null;
            }
         }
      }
   }

   public int bU() {
      btr $$0 = this.cX();
      return $$0 instanceof ark ? $$0.bU() : 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
   }

   public void c(bsj $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dlg.a(this);
      }
   }

   public void p(float $$0) {
   }

   public boolean bV() {
      boolean $$0 = this.dS() != null && this.dS().B;
      return !this.bh() && (this.aF > 0 || $$0 && this.i(0));
   }

   public boolean bW() {
      return this.dg() != null;
   }

   public boolean bX() {
      return !this.p.isEmpty();
   }

   public boolean bY() {
      return this.ao().a(awz.p);
   }

   public boolean bZ() {
      return !this.ao().a(awz.q);
   }

   public void g(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean ca() {
      return this.i(1);
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
      return this.c(buz.f);
   }

   public boolean cg() {
      return this.i(3);
   }

   public void h(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean ch() {
      return this.i(4);
   }

   public boolean ci() {
      return this.c(buz.d);
   }

   public boolean cj() {
      return this.ci() && !this.bi();
   }

   public void i(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean ck() {
      return this.aV;
   }

   public final void j(boolean $$0) {
      this.aV = $$0;
      this.b(6, this.cl());
   }

   public boolean cl() {
      return this.dS().x_() ? this.i(6) : this.aV;
   }

   public boolean cm() {
      return this.i(5);
   }

   public boolean d(cnx $$0) {
      if ($$0.Q_()) {
         return false;
      } else {
         fad $$1 = this.co();
         return $$1 != null && $$0 != null && $$0.co() == $$1 && $$1.i() ? false : this.cm();
      }
   }

   public boolean cn() {
      return false;
   }

   public void a(BiConsumer<dzm<?>, arj> $$0) {
   }

   @Nullable
   public ezw co() {
      return this.dS().O().e(this.cF());
   }

   public final boolean s(@Nullable btr $$0) {
      return $$0 == null ? false : this == $$0 || this.t($$0) || $$0.t(this);
   }

   protected boolean t(btr $$0) {
      return this.a($$0.co());
   }

   public boolean a(@Nullable fad $$0) {
      return this.co() != null ? this.co().a($$0) : false;
   }

   public void k(boolean $$0) {
      this.b(5, $$0);
   }

   protected boolean i(int $$0) {
      return (this.am.a(an) & 1 << $$0) != 0;
   }

   protected void b(int $$0, boolean $$1) {
      byte $$2 = this.am.a(an);
      if ($$1) {
         this.am.a(an, (byte)($$2 | 1 << $$0));
      } else {
         this.am.a(an, (byte)($$2 & ~(1 << $$0)));
      }
   }

   public int cp() {
      return 300;
   }

   public int cq() {
      return this.am.a(aL);
   }

   public void j(int $$0) {
      this.am.a(aL, $$0);
   }

   public int cr() {
      return this.am.a(aQ);
   }

   public void k(int $$0) {
      this.am.a(aQ, $$0);
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

   public void a(arj $$0, bum $$1) {
      this.h(this.aF + 1);
      if (this.aF == 0) {
         this.d(8.0F);
      }

      this.a(this.dT().c(), 5.0F);
   }

   public void l(boolean $$0) {
      eyw $$1 = this.dv();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.e - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.e + 0.1);
      }

      this.n($$1.d, $$2, $$1.f);
   }

   public void m(boolean $$0) {
      eyw $$1 = this.dv();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.e - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.e + 0.06);
      }

      this.n($$1.d, $$2, $$1.f);
      this.n();
   }

   public boolean a(arj $$0, bun $$1) {
      return true;
   }

   public void cv() {
      if (this.dv().b() > -0.5 && this.aa > 1.0F) {
         this.aa = 1.0F;
      }
   }

   public void n() {
      this.aa = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      jf $$3 = jf.a($$0, $$1, $$2);
      eyw $$4 = new eyw($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      jf.a $$5 = new jf.a();
      jk $$6 = jk.b;
      double $$7 = Double.MAX_VALUE;

      for (jk $$8 : new jk[]{jk.c, jk.d, jk.e, jk.f, jk.b}) {
         $$5.a($$3, $$8);
         if (!this.dS().a_($$5).m(this.dS(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == jk.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.af.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      eyw $$13 = this.dv().c(0.75);
      if ($$6.o() == jk.a.a) {
         this.n((double)($$12 * $$11), $$13.e, $$13.f);
      } else if ($$6.o() == jk.a.b) {
         this.n($$13.d, (double)($$12 * $$11), $$13.f);
      } else if ($$6.o() == jk.a.c) {
         this.n($$13.d, $$13.e, (double)($$12 * $$11));
      }
   }

   public void a(dus $$0, eyw $$1) {
      this.n();
      this.V = $$1;
   }

   private static xe c(xe $$0) {
      xs $$1 = $$0.e().b($$0.a().a(null));

      for (xe $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public xe aj() {
      xe $$0 = this.al();
      return $$0 != null ? c($$0) : this.cw();
   }

   protected xe cw() {
      return this.n.h();
   }

   public boolean u(btr $$0) {
      return this == $$0;
   }

   public float cx() {
      return 0.0F;
   }

   public void q(float $$0) {
   }

   public void r(float $$0) {
   }

   public boolean cy() {
      return true;
   }

   public boolean v(btr $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dS() == null ? "~NULL~" : this.dS().toString();
      return this.aD != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.aj().getString(),
            this.o,
            $$0,
            this.dx(),
            this.dz(),
            this.dD(),
            this.aD
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.aj().getString(),
            this.o,
            $$0,
            this.dx(),
            this.dz(),
            this.dD()
         );
   }

   public boolean b(bsj $$0) {
      return this.dN() || this.aU && !$$0.a(awx.d) && !$$0.h() || $$0.a(awx.i) && this.bh() || $$0.a(awx.m) && this.ao().a(awz.o);
   }

   public boolean cz() {
      return this.aU;
   }

   public void n(boolean $$0) {
      this.aU = $$0;
   }

   public void w(btr $$0) {
      this.b($$0.dx(), $$0.dz(), $$0.dD(), $$0.dI(), $$0.dK());
   }

   public void x(btr $$0) {
      ug $$1 = $$0.f(new ug());
      $$1.r("Dimension");
      this.g($$1);
      this.aT = $$0.aT;
      this.at = $$0.at;
   }

   @Nullable
   public btr b(err $$0) {
      if (this.dS() instanceof arj $$1 && !this.dN()) {
         arj $$3 = $$0.a();
         List<btr> $$4 = this.cW();
         this.am();
         List<btr> $$5 = new ArrayList<>();

         for (btr $$6 : $$4) {
            float $$7 = $$0.d() + ($$6.dI() - this.dI());
            btr $$8 = $$6.b($$0.a($$7, $$6.aA));
            if ($$8 != null) {
               $$5.add($$8);
            }
         }

         $$1.ah().a("changeDimension");
         btr $$9 = $$3.ag() == $$1.ag() ? this : this.ao().a($$3, btx.s);
         if ($$9 != null) {
            if (this != $$9) {
               $$9.x(this);
               this.cA();
            }

            $$9.c($$0);
            this.aW();
            if (this != $$9) {
               $$3.d($$9);
            }

            for (btr $$10 : $$5) {
               $$10.a($$9, true);
            }

            $$1.h();
            $$3.h();
            $$0.g().onTransition($$9);
         }

         $$1.ah().c();
         return $$9;
      }

      return null;
   }

   protected void c(err $$0) {
      this.o($$0.b().d, $$0.b().e, $$0.b().f);
      this.v($$0.d());
      this.w($$0.e());
      this.ax();
      this.by();
      this.h($$0.c());
   }

   public void f(jf $$0) {
      if (this.dS() instanceof arj $$1) {
         $$1.l().a(aro.e, new ddp($$0), 3, $$0);
      }
   }

   protected void cA() {
      this.b(btr.c.e);
      if (this instanceof bul $$0) {
         $$0.a(true, false);
      }
   }

   public eyw a(jk.a $$0, l.a $$1) {
      return ert.a($$1, $$0, this.dq(), this.a(this.av()));
   }

   public boolean o(boolean $$0) {
      return ($$0 || !this.bW()) && this.bI();
   }

   public boolean a(dej $$0, dej $$1) {
      if ($$0.ag() == dej.j && $$1.ag() == dej.h) {
         for (btr $$2 : this.cW()) {
            if ($$2 instanceof ark $$3 && !$$3.f) {
               return false;
            }
         }
      }

      return true;
   }

   public float a(deb $$0, ddo $$1, jf $$2, dus $$3, eqt $$4, float $$5) {
      return $$5;
   }

   public boolean a(deb $$0, ddo $$1, jf $$2, dus $$3, float $$4) {
      return true;
   }

   public int cB() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bty.a(this.ao()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.o);
      $$0.a("Entity Name", () -> this.aj().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dx(), this.dz(), this.dD()));
      $$0.a("Entity's Block location", p.a(this.dS(), azf.a(this.dx()), azf.a(this.dz()), azf.a(this.dD())));
      eyw $$1 = this.dv();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.d, $$1.e, $$1.f));
      $$0.a("Entity's Passengers", () -> this.cW().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.dg()));
   }

   public boolean cC() {
      return this.bV() && !this.Q_();
   }

   public void a_(UUID $$0) {
      this.au = $$0;
      this.av = this.au.toString();
   }

   @Override
   public UUID cD() {
      return this.au;
   }

   public String cE() {
      return this.av;
   }

   @Override
   public String cF() {
      return this.av;
   }

   public boolean cG() {
      return true;
   }

   public static double cH() {
      return m;
   }

   public static void b(double $$0) {
      m = $$0;
   }

   @Override
   public xe R_() {
      return ezw.a(this.co(), this.aj()).a($$0 -> $$0.a(this.cN()).a(this.cE()));
   }

   public void b(@Nullable xe $$0) {
      this.am.a(aM, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public xe al() {
      return this.am.a(aM).orElse(null);
   }

   @Override
   public boolean ak() {
      return this.am.a(aM).isPresent();
   }

   public void p(boolean $$0) {
      this.am.a(aN, $$0);
   }

   public boolean cI() {
      return this.am.a(aN);
   }

   public boolean a(arj $$0, double $$1, double $$2, double $$3, Set<bva> $$4, float $$5, float $$6, boolean $$7) {
      float $$8 = azf.a($$6, -90.0F, 90.0F);
      btr $$9 = this.b(new err($$0, new eyw($$1, $$2, $$3), this.dv(), $$5, $$8, err.a));
      return $$9 != null;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dS() instanceof arj) {
         this.b($$0, $$1, $$2, this.dI(), this.dK());
         this.x();
      }
   }

   private void x() {
      this.cY().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.p.iterator();

         while (var1.hasNext()) {
            btr $$1 = (btr)var1.next();
            $$0.a($$1, btr::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.dx() + $$0, this.dz() + $$1, this.dD() + $$2);
   }

   public boolean cJ() {
      return this.cI();
   }

   @Override
   public void a(List<akl.c<?>> $$0) {
   }

   @Override
   public void a(akh<?> $$0) {
      if (ar.equals($$0)) {
         this.j_();
      }
   }

   @Deprecated
   protected void cK() {
      buz $$0 = this.av();
      btu $$1 = this.a($$0);
      this.aZ = $$1;
      this.ba = $$1.c();
   }

   public void j_() {
      btu $$0 = this.aZ;
      buz $$1 = this.av();
      btu $$2 = this.a($$1);
      this.aZ = $$2;
      this.ba = $$2.c();
      this.ax();
      boolean $$3 = $$2.a() <= 4.0F && $$2.b() <= 4.0F;
      if (!this.r.B && !this.al && !this.ae && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cnx)) {
         this.a($$0);
      }
   }

   public boolean a(btu $$0) {
      btu $$1 = this.a(this.av());
      eyw $$2 = this.dq().b(0.0, (double)$$0.b() / 2.0, 0.0);
      double $$3 = (double)Math.max(0.0F, $$1.a() - $$0.a()) + 1.0E-6;
      double $$4 = (double)Math.max(0.0F, $$1.b() - $$0.b()) + 1.0E-6;
      ezq $$5 = ezn.a(eyr.a($$2, $$3, $$4, $$3));
      Optional<eyw> $$6 = this.r.a(this, $$5, $$2, (double)$$1.a(), (double)$$1.b(), (double)$$1.a());
      if ($$6.isPresent()) {
         this.b($$6.get().b(0.0, (double)(-$$1.b()) / 2.0, 0.0));
         return true;
      } else {
         if ($$1.a() > $$0.a() && $$1.b() > $$0.b()) {
            ezq $$7 = ezn.a(eyr.a($$2, $$3, 1.0E-6, $$3));
            Optional<eyw> $$8 = this.r.a(this, $$7, $$2, (double)$$1.a(), (double)$$0.b(), (double)$$1.a());
            if ($$8.isPresent()) {
               this.b($$8.get().b(0.0, (double)(-$$0.b()) / 2.0 + 1.0E-6, 0.0));
               return true;
            }
         }

         return false;
      }
   }

   public jk cL() {
      return jk.a((double)this.dI());
   }

   public jk cM() {
      return this.cL();
   }

   protected xk cN() {
      return new xk(xk.a.c, new xk.b(this.ao(), this.cD(), this.aj()));
   }

   public boolean a(ark $$0) {
      return true;
   }

   @Override
   public final eyr cO() {
      return this.aB;
   }

   public final void a(eyr $$0) {
      this.aB = $$0;
   }

   public final float d(buz $$0) {
      return this.a($$0).c();
   }

   public final float cP() {
      return this.ba;
   }

   public eyw s(float $$0) {
      return this.cQ();
   }

   protected eyw cQ() {
      return new eyw(0.0, (double)this.cP(), (double)(this.dn() * 0.4F));
   }

   public bve a_(int $$0) {
      return bve.a;
   }

   @Override
   public void a(xe $$0) {
   }

   public dej cR() {
      return this.dS();
   }

   @Nullable
   public MinecraftServer cS() {
      return this.dS().o();
   }

   public brs a(cnx $$0, eyw $$1, brr $$2) {
      return brs.e;
   }

   public boolean a(deb $$0) {
      return false;
   }

   public void d(ark $$0) {
   }

   public void e(ark $$0) {
   }

   public float a(doa $$0) {
      float $$1 = azf.h(this.dI());
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

   public float a(dmj $$0) {
      float $$1 = azf.h(this.dI());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public boolean cT() {
      return false;
   }

   public cos a(cor $$0) {
      return this.ao().a(awz.r) ? cos.b : cos.a;
   }

   @Nullable
   public bun cU() {
      return null;
   }

   public final boolean cV() {
      return this.cU() != null;
   }

   public final List<btr> cW() {
      return this.p;
   }

   @Nullable
   public btr cX() {
      return this.p.isEmpty() ? null : (btr)this.p.get(0);
   }

   public boolean y(btr $$0) {
      return this.p.contains($$0);
   }

   public boolean a(Predicate<btr> $$0) {
      UnmodifiableIterator var2 = this.p.iterator();

      while (var2.hasNext()) {
         btr $$1 = (btr)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<btr> D() {
      return this.p.stream().flatMap(btr::cY);
   }

   @Override
   public Stream<btr> cY() {
      return Stream.concat(Stream.of(this), this.D());
   }

   @Override
   public Stream<btr> cZ() {
      return Stream.concat(this.p.stream().flatMap(btr::cZ), Stream.of(this));
   }

   public Iterable<btr> da() {
      return () -> this.D().iterator();
   }

   public int db() {
      return (int)this.D().filter($$0 -> $$0 instanceof cnx).count();
   }

   public boolean dc() {
      return this.db() == 1;
   }

   public btr dd() {
      btr $$0 = this;

      while ($$0.bW()) {
         $$0 = $$0.dg();
      }

      return $$0;
   }

   public boolean z(btr $$0) {
      return this.dd() == $$0.dd();
   }

   public boolean A(btr $$0) {
      if (!$$0.bW()) {
         return false;
      } else {
         btr $$1 = $$0.dg();
         return $$1 == this ? true : this.A($$1);
      }
   }

   public boolean de() {
      return this.cU() instanceof cnx $$0 ? $$0.g() : this.df();
   }

   public boolean df() {
      return !this.dS().B;
   }

   protected static eyw a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -azf.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = azf.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new eyw((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public eyw b(bun $$0) {
      return new eyw(this.dx(), this.cO().e, this.dD());
   }

   @Nullable
   public btr dg() {
      return this.q;
   }

   @Nullable
   public btr dh() {
      return this.q != null && this.q.cU() == this ? this.q : null;
   }

   public eqy k_() {
      return eqy.a;
   }

   public awh di() {
      return awh.g;
   }

   protected int dj() {
      return 1;
   }

   public eu dk() {
      return new eu(
         this, this.dq(), this.bR(), this.dS() instanceof arj ? (arj)this.dS() : null, this.H(), this.aj().getString(), this.R_(), this.dS().o(), this
      );
   }

   protected int H() {
      return 0;
   }

   public boolean l(int $$0) {
      return this.H() >= $$0;
   }

   @Override
   public boolean l_() {
      return this.dS().ac().b(def.p);
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public boolean K_() {
      return true;
   }

   public void a(fg.a $$0, eyw $$1) {
      eyw $$2 = $$0.a(this);
      double $$3 = $$1.d - $$2.d;
      double $$4 = $$1.e - $$2.e;
      double $$5 = $$1.f - $$2.f;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.w(azf.h((float)(-(azf.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.v(azf.h((float)(azf.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.q(this.dI());
      this.P = this.dK();
      this.O = this.dI();
   }

   public float t(float $$0) {
      return azf.h($$0, this.O, this.az);
   }

   public boolean a(axl<eqs> $$0, double $$1) {
      if (this.dl()) {
         return false;
      } else {
         eyr $$2 = this.cO().h(0.001);
         int $$3 = azf.a($$2.a);
         int $$4 = azf.c($$2.d);
         int $$5 = azf.a($$2.b);
         int $$6 = azf.c($$2.e);
         int $$7 = azf.a($$2.c);
         int $$8 = azf.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cG();
         boolean $$11 = false;
         eyw $$12 = eyw.c;
         int $$13 = 0;
         jf.a $$14 = new jf.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  eqt $$18 = this.dS().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a(this.dS(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           eyw $$20 = $$18.c(this.dS(), $$14);
                           if ($$9 < 0.4) {
                              $$20 = $$20.c($$9);
                           }

                           $$12 = $$12.e($$20);
                           $$13++;
                        }
                     }
                  }
               }
            }
         }

         if ($$12.g() > 0.0) {
            if ($$13 > 0) {
               $$12 = $$12.c(1.0 / (double)$$13);
            }

            if (!(this instanceof cnx)) {
               $$12 = $$12.d();
            }

            eyw $$21 = this.dv();
            $$12 = $$12.c($$1);
            double $$22 = 0.003;
            if (Math.abs($$21.d) < 0.003 && Math.abs($$21.f) < 0.003 && $$12.g() < 0.0045000000000000005) {
               $$12 = $$12.d().c(0.0045000000000000005);
            }

            this.h(this.dv().e($$12));
         }

         this.ai.put($$0, $$9);
         return $$11;
      }
   }

   public boolean dl() {
      eyr $$0 = this.cO().g(1.0);
      int $$1 = azf.a($$0.a);
      int $$2 = azf.c($$0.d);
      int $$3 = azf.a($$0.c);
      int $$4 = azf.c($$0.f);
      return !this.dS().b($$1, $$3, $$2, $$4);
   }

   public double b(axl<eqs> $$0) {
      return this.ai.getDouble($$0);
   }

   public double dm() {
      return (double)this.cP() < 0.4 ? 0.0 : 0.4;
   }

   public final float dn() {
      return this.aZ.a();
   }

   public final float do() {
      return this.aZ.b();
   }

   public zl<aca> a(ari $$0) {
      return new acb(this, $$0);
   }

   public btu a(buz $$0) {
      return this.n.n();
   }

   public final btt dp() {
      return this.aZ.d();
   }

   public eyw dq() {
      return this.s;
   }

   public eyw dr() {
      return this.dq();
   }

   @Override
   public jf ds() {
      return this.t;
   }

   public dus dt() {
      if (this.bf == null) {
         this.bf = this.dS().a_(this.ds());
      }

      return this.bf;
   }

   public ddp du() {
      return this.u;
   }

   public eyw dv() {
      return this.v;
   }

   public void h(eyw $$0) {
      this.v = $$0;
   }

   public void i(eyw $$0) {
      this.h(this.dv().e($$0));
   }

   public void n(double $$0, double $$1, double $$2) {
      this.h(new eyw($$0, $$1, $$2));
   }

   public final int dw() {
      return this.t.u();
   }

   public final double dx() {
      return this.s.d;
   }

   public double c(double $$0) {
      return this.s.d + (double)this.dn() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.af.j() - 1.0) * $$0);
   }

   public final int dy() {
      return this.t.v();
   }

   public final double dz() {
      return this.s.e;
   }

   public double e(double $$0) {
      return this.s.e + (double)this.do() * $$0;
   }

   public double dA() {
      return this.e(this.af.j());
   }

   public double dB() {
      return this.s.e + (double)this.ba;
   }

   public final int dC() {
      return this.t.w();
   }

   public final double dD() {
      return this.s.f;
   }

   public double f(double $$0) {
      return this.s.f + (double)this.dn() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.af.j() - 1.0) * $$0);
   }

   public final void o(double $$0, double $$1, double $$2) {
      if (this.s.d != $$0 || this.s.e != $$1 || this.s.f != $$2) {
         this.s = new eyw($$0, $$1, $$2);
         int $$3 = azf.a($$0);
         int $$4 = azf.a($$1);
         int $$5 = azf.a($$2);
         if ($$3 != this.t.u() || $$4 != this.t.v() || $$5 != this.t.w()) {
            this.t = new jf($$3, $$4, $$5);
            this.bf = null;
            if (kh.a($$3) != this.u.e || kh.a($$5) != this.u.f) {
               this.u = new ddp(this.t);
            }
         }

         this.aR.a();
      }
   }

   public void dE() {
   }

   public eyw u(float $$0) {
      return this.o($$0).b(0.0, (double)this.ba * 0.7, 0.0);
   }

   public void a(acb $$0) {
      int $$1 = $$0.b();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      double $$4 = $$0.i();
      this.f($$2, $$3, $$4);
      this.e($$2, $$3, $$4);
      this.w($$0.m());
      this.v($$0.n());
      this.e($$1);
      this.a_($$0.e());
   }

   @Nullable
   public cvs dF() {
      return null;
   }

   public void q(boolean $$0) {
      this.aw = $$0;
   }

   public boolean dG() {
      return !this.ao().a(awz.k);
   }

   public boolean dH() {
      return (this.aw || this.ax) && this.dG();
   }

   public float dI() {
      return this.az;
   }

   public float dJ() {
      return this.dI();
   }

   public void v(float $$0) {
      if (!Float.isFinite($$0)) {
         ad.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.az = $$0;
      }
   }

   public float dK() {
      return this.aA;
   }

   public void w(float $$0) {
      if (!Float.isFinite($$0)) {
         ad.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aA = Math.clamp($$0 % 360.0F, -90.0F, 90.0F);
      }
   }

   public boolean dL() {
      return false;
   }

   public float dM() {
      return 0.0F;
   }

   public void a(@Nullable btr $$0) {
   }

   public final boolean dN() {
      return this.aD != null;
   }

   @Nullable
   public btr.c dO() {
      return this.aD;
   }

   @Override
   public final void b(btr.c $$0) {
      if (this.aD == null) {
         this.aD = $$0;
      }

      if (this.aD.a()) {
         this.af();
      }

      this.cW().forEach(btr::af);
      this.aR.a($$0);
   }

   protected void dP() {
      this.aD = null;
   }

   @Override
   public void a(dyx $$0) {
      this.aR = $$0;
   }

   @Override
   public boolean dQ() {
      if (this.aD != null && !this.aD.b()) {
         return false;
      } else {
         return this.bW() ? false : !this.bX() || !this.dc();
      }
   }

   @Override
   public boolean dR() {
      return false;
   }

   public boolean a(dej $$0, jf $$1) {
      return true;
   }

   public dej dS() {
      return this.r;
   }

   protected void a(dej $$0) {
      this.r = $$0;
   }

   public bsk dT() {
      return this.dS().ak();
   }

   public kc dU() {
      return this.dS().G_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = azf.d($$6, this.dx(), $$1);
      double $$8 = azf.d($$6, this.dz(), $$2);
      double $$9 = azf.d($$6, this.dD(), $$3);
      float $$10 = (float)azf.e($$6, (double)this.dI(), $$4);
      float $$11 = (float)azf.d($$6, (double)this.dK(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   public azn dV() {
      return this.af;
   }

   public eyw ai() {
      if (this.cU() instanceof cnx $$0 && this.bI()) {
         return $$0.ai();
      }

      return this.dv();
   }

   @Nullable
   public cvs dW() {
      return null;
   }

   public Optional<ald<etq>> dX() {
      return this.n.k();
   }

   @FunctionalInterface
   public interface a {
      void accept(btr var1, double var2, double var4, double var6);
   }

   public static enum b {
      a(false, false),
      b(true, false),
      c(false, true),
      d(true, true);

      final boolean e;
      final boolean f;

      private b(final boolean $$0, final boolean $$1) {
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

      private c(final boolean $$0, final boolean $$1) {
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
