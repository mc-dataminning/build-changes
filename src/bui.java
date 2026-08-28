import com.google.common.collect.ImmutableList;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class bui implements akr, bsk, dzr, ev, fav {
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
   private static final ezm d = new ezm(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double e = 0.014;
   private static final double k = 0.007;
   private static final double l = 0.0023333333333333335;
   public static final String I = "UUID";
   private static double m = 1.0;
   private final bup<?> n;
   private int o = c.incrementAndGet();
   public boolean J;
   private ImmutableList<bui> p = ImmutableList.of();
   protected int K;
   @Nullable
   private bui q;
   private dff r;
   public double L;
   public double M;
   public double N;
   private ezr s;
   private jh t;
   private del u;
   private ezr v = ezr.c;
   private float az;
   private float aA;
   public float O;
   public float P;
   private ezm aB = d;
   private boolean aC;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   public boolean U;
   protected ezr V = ezr.c;
   @Nullable
   private bui.c aD;
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
   protected final azv af = azv.a();
   public int ag;
   private int aF = -this.dp();
   protected boolean ah;
   protected Object2DoubleMap<axt<ern>> ai = new Object2DoubleArrayMap(2);
   protected boolean aj;
   private final Set<axt<ern>> aG = new HashSet<>();
   public int ak;
   protected boolean al = true;
   protected final aks am;
   protected static final ako<Byte> an = aks.a(bui.class, akq.a);
   protected static final int ao = 0;
   private static final int aH = 1;
   private static final int aI = 3;
   private static final int aJ = 4;
   private static final int aK = 5;
   protected static final int ap = 6;
   protected static final int aq = 7;
   private static final ako<Integer> aL = aks.a(bui.class, akq.b);
   private static final ako<Optional<xl>> aM = aks.a(bui.class, akq.g);
   private static final ako<Boolean> aN = aks.a(bui.class, akq.k);
   private static final ako<Boolean> aO = aks.a(bui.class, akq.k);
   private static final ako<Boolean> aP = aks.a(bui.class, akq.k);
   protected static final ako<bvq> ar = aks.a(bui.class, akq.w);
   private static final ako<Integer> aQ = aks.a(bui.class, akq.b);
   private dzs aR = dzs.a;
   private final aiy aS = new aiy();
   public boolean as;
   @Nullable
   public bvp at;
   private int aT;
   private boolean aU;
   protected UUID au = azn.a(this.af);
   protected String av = this.au.toString();
   private boolean aV;
   private final Set<String> aW = Sets.newHashSet();
   private final double[] aX = new double[]{0.0, 0.0, 0.0};
   private long aY;
   private bul aZ;
   private float ba;
   public boolean aw;
   public boolean ax;
   public Optional<jh> ay = Optional.empty();
   private boolean bb = false;
   private float bc;
   private int bd;
   private boolean be;
   @Nullable
   private dvo bf = null;
   private final Map<jh, dvo> bg = new HashMap<>();

   public bui(bup<?> $$0, dff $$1) {
      this.n = $$0;
      this.r = $$1;
      this.aZ = $$0.n();
      this.s = ezr.c;
      this.t = jh.c;
      this.u = del.d;
      aks.a $$2 = new aks.a(this);
      $$2.a(an, (byte)0);
      $$2.a(aL, this.cu());
      $$2.a(aN, false);
      $$2.a(aM, Optional.empty());
      $$2.a(aO, false);
      $$2.a(aP, false);
      $$2.a(ar, bvq.a);
      $$2.a(aQ, 0);
      this.a($$2);
      this.am = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.ba = this.aZ.c();
   }

   public boolean a(jh $$0, dvo $$1) {
      fal $$2 = $$1.b(this.dY(), $$0, ezw.a(this));
      fal $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return fai.c($$3, fai.a(this.cT()), ezv.i);
   }

   public int i_() {
      fay $$0 = this.ct();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean R_() {
      return false;
   }

   public final void ap() {
      if (this.cc()) {
         this.bR();
      }

      if (this.cb()) {
         this.af();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.aS.e(new ezr($$0, $$1, $$2));
   }

   public aiy aq() {
      return this.aS;
   }

   public bup<?> ar() {
      return this.n;
   }

   @Override
   public int as() {
      return this.o;
   }

   public void e(int $$0) {
      this.o = $$0;
   }

   public Set<String> at() {
      return this.aW;
   }

   public boolean a(String $$0) {
      return this.aW.size() >= 1024 ? false : this.aW.add($$0);
   }

   public boolean b(String $$0) {
      return this.aW.remove($$0);
   }

   public void au() {
      this.a(bui.c.a);
      this.a(eak.p);
   }

   public final void av() {
      this.a(bui.c.b);
   }

   protected abstract void a(aks.a var1);

   public aks aw() {
      return this.am;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bui ? ((bui)$$0).o == this.o : false;
   }

   @Override
   public int hashCode() {
      return this.o;
   }

   public void a(bui.c $$0) {
      this.b($$0);
   }

   public void ax() {
   }

   public void b(bvq $$0) {
      this.am.a(ar, $$0);
   }

   public bvq ay() {
      return this.am.a(ar);
   }

   public boolean c(bvq $$0) {
      return this.ay() == $$0;
   }

   public boolean a(bui $$0, double $$1) {
      return this.dw().a((ka)$$0.dw(), $$1);
   }

   public boolean a(bui $$0, double $$1, double $$2) {
      double $$3 = $$0.dD() - this.dD();
      double $$4 = $$0.dF() - this.dF();
      double $$5 = $$0.dJ() - this.dJ();
      return azn.e($$3, $$5) < azn.k($$1) && azn.k($$4) < azn.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.v($$0 % 360.0F);
      this.w($$1 % 360.0F);
   }

   public final void b(ezr $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      this.a(this.az());
   }

   protected ezm az() {
      return this.aZ.a(this.s);
   }

   protected void aA() {
      this.a_(this.s.d, this.s.e, this.s.f);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.w(this.dQ() + $$2);
      this.v(this.dO() + $$3);
      this.w(azn.a(this.dQ(), -90.0F, 90.0F));
      this.P += $$2;
      this.O += $$3;
      this.P = azn.a(this.P, -90.0F, 90.0F);
      if (this.q != null) {
         this.q.k(this);
      }
   }

   public void l() {
      this.aB();
   }

   public void aB() {
      bor $$0 = boq.a();
      $$0.a("entityBaseTick");
      this.bf = null;
      if (this.cb() && this.dm().dT()) {
         this.af();
      }

      if (this.K > 0) {
         this.K--;
      }

      this.P = this.dQ();
      this.O = this.dO();
      this.bY();
      if (this.bx()) {
         this.by();
      }

      this.ax = this.aw;
      this.aw = false;
      this.bs();
      this.w();
      this.br();
      if (this.dY().C) {
         this.aJ();
      } else if (this.aF > 0) {
         if (this.bk()) {
            this.h(this.aF - 4);
            if (this.aF < 0) {
               this.aJ();
            }
         } else {
            if (this.aF % 20 == 0 && !this.bz()) {
               this.a(this.dZ().d(), 1.0F);
            }

            this.h(this.aF - 1);
         }

         if (this.cw() > 0) {
            this.k(0);
            this.dY().a(null, 1009, this.t, 1);
         }
      }

      if (this.bz()) {
         this.aG();
         this.aa *= 0.5F;
      }

      this.aC();
      if (!this.dY().C) {
         this.c(this.aF > 0);
      }

      this.al = false;
      if (!this.dY().C && this instanceof bvc) {
         bvc.b_((bui)((bvc)this));
      }

      $$0.c();
   }

   public void c(boolean $$0) {
      this.b(0, $$0 || this.be);
   }

   public void aC() {
      if (this.dF() < (double)(this.dY().I_() - 64)) {
         this.aK();
      }
   }

   public void aD() {
      this.aT = this.bZ();
   }

   public void f(int $$0) {
      this.aT = $$0;
   }

   public int aE() {
      return this.aT;
   }

   public boolean aF() {
      return this.aT > 0;
   }

   protected void N() {
      if (this.aF()) {
         this.aT--;
      }
   }

   public void aG() {
      if (!this.bk()) {
         this.d(15.0F);
         if (this.a(this.dZ().e(), 4.0F) && this.aH()) {
            this.a(awo.kb, 0.4F, 2.0F + this.af.i() * 0.4F);
         }
      }
   }

   protected boolean aH() {
      return true;
   }

   public final void d(float $$0) {
      this.g(azn.d($$0 * 20.0F));
   }

   public void g(int $$0) {
      if (this.aF < $$0) {
         this.h($$0);
      }
   }

   public void h(int $$0) {
      this.aF = $$0;
   }

   public int aI() {
      return this.aF;
   }

   public void aJ() {
      this.h(0);
   }

   protected void aK() {
      this.av();
   }

   public boolean g(double $$0, double $$1, double $$2) {
      return this.b(this.cT().d($$0, $$1, $$2));
   }

   private boolean b(ezm $$0) {
      return this.dY().a(this, $$0) && !this.dY().d($$0);
   }

   public void d(boolean $$0) {
      this.aC = $$0;
      this.a($$0, null);
   }

   public void a(boolean $$0, boolean $$1, ezr $$2) {
      this.aC = $$0;
      this.Q = $$1;
      this.a($$0, $$2);
   }

   public boolean d(jh $$0) {
      return this.ay.isPresent() && this.ay.get().equals($$0);
   }

   protected void a(boolean $$0, @Nullable ezr $$1) {
      if ($$0) {
         ezm $$2 = this.cT();
         ezm $$3 = new ezm($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<jh> $$4 = this.r.h(this, $$3);
         if ($$4.isPresent() || this.bb) {
            this.ay = $$4;
         } else if ($$1 != null) {
            ezm $$5 = $$3.d(-$$1.d, 0.0, -$$1.f);
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

   public boolean aL() {
      return this.aC;
   }

   public void a(bvi $$0, ezr $$1) {
      if (this.ae) {
         this.a_(this.dD() + $$1.d, this.dF() + $$1.e, this.dJ() + $$1.f);
      } else {
         if ($$0 == bvi.c) {
            $$1 = this.d($$1);
            if ($$1.equals(ezr.c)) {
               return;
            }
         }

         bor $$2 = boq.a();
         $$2.a("move");
         if (this.V.h() > 1.0E-7) {
            $$1 = $$1.h(this.V);
            this.V = ezr.c;
            this.h(ezr.c);
         }

         $$1 = this.a($$1, $$0);
         ezr $$3 = this.a($$1);
         double $$4 = $$3.h();
         if ($$4 > 1.0E-7 || $$1.h() - $$4 < 1.0E-7) {
            if (this.aa != 0.0F && $$4 >= 1.0) {
               ezn $$5 = this.dY().a(new den(this.dw(), this.dw().e($$3), den.a.d, den.b.d, this));
               if ($$5.d() != ezp.a.a) {
                  this.n();
               }
            }

            this.a_(this.dD() + $$3.d, this.dF() + $$3.e, this.dJ() + $$3.f);
         }

         $$2.c();
         $$2.a("rest");
         boolean $$6 = !azn.b($$1.d, $$3.d);
         boolean $$7 = !azn.b($$1.f, $$3.f);
         this.Q = $$6 || $$7;
         if (Math.abs($$1.e) > 0.0 || this.dj()) {
            this.R = $$1.e != $$3.e;
            this.S = this.R && $$1.e < 0.0;
            this.a(this.S, this.Q, $$3);
         }

         if (this.Q) {
            this.T = this.c($$3);
         } else {
            this.T = false;
         }

         jh $$8 = this.aR();
         dvo $$9 = this.dY().a_($$8);
         if (!this.dY().y_() || this.dk()) {
            this.a($$3.e, this.aL(), $$9, $$8);
         }

         if (this.dT()) {
            $$2.c();
         } else {
            if (this.Q) {
               ezr $$10 = this.dB();
               this.n($$6 ? 0.0 : $$10.d, $$10.e, $$7 ? 0.0 : $$10.f);
            }

            if (this.dk()) {
               dij $$11 = $$9.b();
               if ($$1.e != $$3.e) {
                  $$11.a(this.dY(), this);
               }
            }

            if (!this.dY().y_() || this.dk()) {
               bui.b $$12 = this.bi();
               if ($$12.a() && !this.cb()) {
                  this.a($$12, $$3, $$8, $$9);
               }
            }

            float $$13 = this.aV();
            this.h(this.dB().d((double)$$13, 1.0, (double)$$13));
            $$2.c();
         }
      }
   }

   private void a(bui.b $$0, ezr $$1, jh $$2, dvo $$3) {
      float $$4 = 0.6F;
      float $$5 = (float)($$1.g() * 0.6F);
      float $$6 = (float)($$1.i() * 0.6F);
      jh $$7 = this.aT();
      dvo $$8 = this.dY().a_($$7);
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
            this.aE = this.aW();
         } else if (this.bl()) {
            this.aE = this.aW();
            if ($$0.c()) {
               this.ba();
            }

            if ($$0.b()) {
               this.a(eak.Q);
            }
         }
      } else if ($$8.l()) {
         this.aQ();
      }
   }

   public void aM() {
      this.a(this.bE(), this.s);
   }

   public void a(ezr $$0, ezr $$1) {
      if (this.aN()) {
         boolean $$2 = this.ca();
         if (this.aL()) {
            jh $$3 = this.aR();
            dvo $$4 = this.dY().a_($$3);
            $$4.b().a(this.dY(), $$3, $$4, this);
         }

         this.a(this.bg, $$0, $$1);
         boolean $$5 = false;

         for (Entry<jh, dvo> $$6 : this.bg.entrySet()) {
            $$6.getValue().a(this.dY(), $$6.getKey(), this);
            this.a($$6.getValue());
            if ($$6.getValue().a(axd.aM) || $$6.getValue().a(dil.H)) {
               $$5 = true;
            }
         }

         this.bg.clear();
         if (!$$5) {
            if (this.aF <= 0) {
               this.h(-this.dp());
            }

            if ($$2 && (this.aw || this.bn())) {
               this.aO();
            }
         }

         if (this.ca() && (this.aw || this.bn())) {
            this.h(-this.dp());
         }
      }
   }

   protected boolean aN() {
      return !this.dT() && !this.ae;
   }

   private boolean c(dvo $$0) {
      return $$0.a(axd.aR) || $$0.a(dil.qP);
   }

   private boolean a(jh $$0, dvo $$1, boolean $$2, boolean $$3, ezr $$4) {
      if ($$1.l()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aL() || $$5 || this.ck() && $$4.e == 0.0 || this.cs()) && !this.cm()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dY().a(eak.P, this.dw(), eak.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(ezr $$0) {
      return false;
   }

   protected void aO() {
      this.a(awo.kg, 0.7F, 1.6F + (this.af.i() - this.af.i()) * 0.4F);
   }

   public void aP() {
      if (!this.dY().C && this.ca()) {
         this.aO();
      }

      this.aJ();
   }

   protected void aQ() {
      if (this.bc()) {
         this.bb();
         if (this.bi().b()) {
            this.a(eak.x);
         }
      }
   }

   @Deprecated
   public jh aR() {
      return this.e(0.2F);
   }

   public jh aS() {
      return this.e(0.500001F);
   }

   public jh aT() {
      return this.e(1.0E-5F);
   }

   protected jh e(float $$0) {
      if (this.ay.isPresent()) {
         jh $$1 = this.ay.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dvo $$2 = this.dY().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(axd.T)) && !$$2.a(axd.M) && !($$2.b() instanceof dlh) ? $$1.h(azn.a(this.s.e - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = azn.a(this.s.d);
         int $$4 = azn.a(this.s.e - (double)$$0);
         int $$5 = azn.a(this.s.f);
         return new jh($$3, $$4, $$5);
      }
   }

   protected float aU() {
      float $$0 = this.dY().a_(this.dy()).b().k();
      float $$1 = this.dY().a_(this.aS()).b().k();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aV() {
      dvo $$0 = this.dY().a_(this.dy());
      float $$1 = $$0.b().h();
      if (!$$0.a(dil.G) && !$$0.a(dil.nd)) {
         return (double)$$1 == 1.0 ? this.dY().a_(this.aS()).b().h() : $$1;
      } else {
         return $$1;
      }
   }

   protected ezr a(ezr $$0, bvi $$1) {
      return $$0;
   }

   protected ezr d(ezr $$0) {
      if ($$0.h() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dY().aa();
         if ($$1 != this.aY) {
            Arrays.fill(this.aX, 0.0);
            this.aY = $$1;
         }

         if ($$0.d != 0.0) {
            double $$2 = this.a(jm.a.a, $$0.d);
            return Math.abs($$2) <= 1.0E-5F ? ezr.c : new ezr($$2, 0.0, 0.0);
         } else if ($$0.e != 0.0) {
            double $$3 = this.a(jm.a.b, $$0.e);
            return Math.abs($$3) <= 1.0E-5F ? ezr.c : new ezr(0.0, $$3, 0.0);
         } else if ($$0.f != 0.0) {
            double $$4 = this.a(jm.a.c, $$0.f);
            return Math.abs($$4) <= 1.0E-5F ? ezr.c : new ezr(0.0, 0.0, $$4);
         } else {
            return ezr.c;
         }
      }
   }

   private double a(jm.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = azn.a($$1 + this.aX[$$2], -0.51, 0.51);
      $$1 = $$3 - this.aX[$$2];
      this.aX[$$2] = $$3;
      return $$1;
   }

   private ezr a(ezr $$0) {
      ezm $$1 = this.cT();
      List<fal> $$2 = this.dY().c(this, $$1.b($$0));
      ezr $$3 = $$0.h() == 0.0 ? $$0 : a(this, $$0, $$1, this.dY(), $$2);
      boolean $$4 = $$0.d != $$3.d;
      boolean $$5 = $$0.e != $$3.e;
      boolean $$6 = $$0.f != $$3.f;
      boolean $$7 = $$5 && $$0.e < 0.0;
      if (this.dS() > 0.0F && ($$7 || this.aL()) && ($$4 || $$6)) {
         ezm $$8 = $$7 ? $$1.d(0.0, $$3.e, 0.0) : $$1;
         ezm $$9 = $$8.b($$0.d, (double)this.dS(), $$0.f);
         if (!$$7) {
            $$9 = $$9.b(0.0, -1.0E-5F, 0.0);
         }

         List<fal> $$10 = a(this, this.r, $$2, $$9);
         float $$11 = (float)$$3.e;
         float[] $$12 = a($$8, $$10, this.dS(), $$11);

         for (float $$13 : $$12) {
            ezr $$14 = a(new ezr($$0.d, (double)$$13, $$0.f), $$8, $$10);
            if ($$14.j() > $$3.j()) {
               double $$15 = $$1.b - $$8.b;
               return $$14.b(0.0, -$$15, 0.0);
            }
         }
      }

      return $$3;
   }

   private static float[] a(ezm $$0, List<fal> $$1, float $$2, float $$3) {
      FloatSet $$4 = new FloatArraySet(4);

      for (fal $$5 : $$1) {
         DoubleList $$6 = $$5.a(jm.a.b);
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

   public static ezr a(@Nullable bui $$0, ezr $$1, ezm $$2, dff $$3, List<fal> $$4) {
      List<fal> $$5 = a($$0, $$3, $$4, $$2.b($$1));
      return a($$1, $$2, $$5);
   }

   private static List<fal> a(@Nullable bui $$0, dff $$1, List<fal> $$2, ezm $$3) {
      Builder<fal> $$4 = ImmutableList.builderWithExpectedSize($$2.size() + 1);
      if (!$$2.isEmpty()) {
         $$4.addAll($$2);
      }

      dxe $$5 = $$1.C_();
      boolean $$6 = $$0 != null && $$5.a($$0, $$3);
      if ($$6) {
         $$4.add($$5.c());
      }

      $$4.addAll($$1.e($$0, $$3));
      return $$4.build();
   }

   private static ezr a(ezr $$0, ezm $$1, List<fal> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.d;
         double $$4 = $$0.e;
         double $$5 = $$0.f;
         if ($$4 != 0.0) {
            $$4 = fai.a(jm.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = fai.a(jm.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = fai.a(jm.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = fai.a(jm.a.c, $$1, $$2, $$5);
         }

         return new ezr($$3, $$4, $$5);
      }
   }

   protected float aW() {
      return (float)((int)this.Y + 1);
   }

   protected awn aX() {
      return awo.kk;
   }

   protected awn aY() {
      return awo.kj;
   }

   protected awn aZ() {
      return awo.kj;
   }

   public void b(ezr $$0, ezr $$1) {
      this.a(this.bg, $$0, $$1);
   }

   private void a(Map<jh, dvo> $$0, ezr $$1, ezr $$2) {
      ezm $$3 = this.cT().h(1.0E-5F);

      for (jh $$4 : dek.a($$1, $$2, $$3)) {
         if (!this.bN()) {
            return;
         }

         dvo $$5 = this.dY().a_($$4);
         if (!$$5.l() && !$$0.containsKey($$4)) {
            try {
               fal $$6 = $$5.b(this.dY(), $$4);
               if ($$6 == fai.b() || this.a($$1, $$2, $$4, $$6)) {
                  $$0.put($$4.j(), $$5);
               }
            } catch (Throwable var12) {
               o $$8 = o.a(var12, "Colliding entity with block");
               p $$9 = $$8.a("Block being collided with");
               p.a($$9, this.dY(), $$4, $$5);
               p $$10 = $$8.a("Entity being checked for collision");
               this.a($$10);
               throw new z($$8);
            }
         }
      }
   }

   private boolean a(ezr $$0, ezr $$1, jh $$2, fal $$3) {
      ezm $$4 = this.cT().c(this.cT().f().c(-1.0)).c($$1);
      ezr $$5 = $$0.d($$4.g());
      return this.cT().a($$5, $$3.a(new ezr($$2)).e());
   }

   protected void a(dvo $$0) {
   }

   public jh a(arq $$0, jh $$1) {
      jh $$2 = $$0.W();
      ezr $$3 = $$2.b();
      int $$4 = $$0.m($$2).a(ebj.a.f, $$2.u(), $$2.w()) + 1;
      return jh.a($$3.d, (double)$$4, $$3.f);
   }

   public void a(jq<eak> $$0, @Nullable bui $$1) {
      this.dY().a($$1, $$0, this.s);
   }

   public void a(jq<eak> $$0) {
      this.a($$0, this);
   }

   private void c(jh $$0, dvo $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.o();
      }
   }

   protected void ba() {
      bui $$0 = Objects.requireNonNullElse(this.cZ(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      ezr $$2 = $$0.dB();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      this.f($$3);
   }

   protected jh e(jh $$0) {
      jh $$1 = $$0.d();
      dvo $$2 = this.dY().a_($$1);
      return !$$2.a(axd.bo) && !$$2.a(axd.bp) ? $$0 : $$1;
   }

   protected void a(dvo $$0, dvo $$1) {
      dpw $$2 = $$0.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dvo $$0) {
      dpw $$1 = $$0.A();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(jh $$0, dvo $$1) {
      dpw $$2 = $$1.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dvo $$0) {
      return $$0.a(axd.bn) && this.ag >= this.bd + 20;
   }

   private void o() {
      this.bc = this.bc * (float)Math.pow(0.997, (double)(this.ag - this.bd));
      this.bc = Math.min(1.0F, this.bc + 0.07F);
      float $$0 = 0.5F + this.bc * this.af.i() * 1.2F;
      float $$1 = 0.1F + this.bc * 1.2F;
      this.a(awo.E, $$1, $$0);
      this.bd = this.ag;
   }

   protected void f(float $$0) {
      this.a(this.aX(), $$0, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
   }

   protected void bb() {
   }

   protected boolean bc() {
      return false;
   }

   public void a(awn $$0, float $$1, float $$2) {
      if (!this.bd()) {
         this.dY().a(null, this.dD(), this.dF(), this.dJ(), $$0, this.do(), $$1, $$2);
      }
   }

   public void a(awn $$0) {
      if (!this.bd()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean bd() {
      return this.am.a(aO);
   }

   public void e(boolean $$0) {
      this.am.a(aO, $$0);
   }

   public boolean be() {
      return this.am.a(aP);
   }

   public void f(boolean $$0) {
      this.am.a(aP, $$0);
   }

   protected double bf() {
      return 0.0;
   }

   public final double bg() {
      return this.be() ? 0.0 : this.bf();
   }

   protected void bh() {
      double $$0 = this.bg();
      if ($$0 != 0.0) {
         this.h(this.dB().b(0.0, -$$0, 0.0));
      }
   }

   protected bui.b bi() {
      return bui.b.d;
   }

   public boolean bj() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dvo $$2, jh $$3) {
      if ($$1) {
         if (this.aa > 0.0F) {
            $$2.b().a(this.dY(), $$2, $$3, this, this.aa);
            this.dY().a(eak.A, this.s, eak.a.a(this, this.ay.<dvo>map($$0x -> this.dY().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.aa -= (float)$$0;
      }
   }

   public boolean bk() {
      return this.ar().d();
   }

   public boolean a(float $$0, float $$1, bsy $$2) {
      if (this.n.a(axh.o)) {
         return false;
      } else {
         if (this.cc()) {
            for (bui $$3 : this.db()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean bl() {
      return this.ah;
   }

   private boolean q() {
      jh $$0 = this.dy();
      return this.dY().r($$0) || this.dY().r(jh.a((double)$$0.u(), this.cT().e, (double)$$0.w()));
   }

   private boolean v() {
      return this.dz().a(dil.nd);
   }

   public boolean bm() {
      return this.bl() || this.q();
   }

   public boolean bn() {
      return this.bl() || this.q() || this.v();
   }

   public boolean bo() {
      return this.bl() || this.v();
   }

   public boolean bp() {
      return this.bo() || this.bz();
   }

   public boolean bq() {
      return this.aj && this.bl();
   }

   public void br() {
      if (this.cm()) {
         this.i(this.cl() && this.bl() && !this.cb());
      } else {
         this.i(this.cl() && this.bq() && !this.cb() && this.dY().b_(this.t).a(axj.a));
      }
   }

   protected boolean bs() {
      this.ai.clear();
      this.bt();
      double $$0 = this.dY().D_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(axj.b, $$0);
      return this.bl() || $$1;
   }

   void bt() {
      if (this.dm() instanceof cqq $$0 && !$$0.bq()) {
         this.ah = false;
         return;
      }

      if (this.a(axj.a, 0.014)) {
         if (!this.ah && !this.al) {
            this.bu();
         }

         this.n();
         this.ah = true;
         this.aJ();
      } else {
         this.ah = false;
      }
   }

   private void w() {
      this.aj = this.a(axj.a);
      this.aG.clear();
      double $$0 = this.dH();
      if (this.dm() instanceof cqq $$2 && !$$2.bq() && $$2.cT().e >= $$0 && $$2.cT().b <= $$0) {
         return;
      }

      jh $$3 = jh.a(this.dD(), $$0, this.dJ());
      ero $$4 = this.dY().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a(this.dY(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aG::add);
      }
   }

   protected void bu() {
      bui $$0 = Objects.requireNonNullElse(this.cZ(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      ezr $$2 = $$0.dB();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aY(), $$3, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
      } else {
         this.a(this.aZ(), $$3, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
      }

      float $$4 = (float)azn.a(this.dF());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.aZ.a() * 20.0F; $$5++) {
         double $$6 = (this.af.j() * 2.0 - 1.0) * (double)this.aZ.a();
         double $$7 = (this.af.j() * 2.0 - 1.0) * (double)this.aZ.a();
         this.dY().a(ls.d, this.dD() + $$6, (double)($$4 + 1.0F), this.dJ() + $$7, $$2.d, $$2.e - this.af.j() * 0.2F, $$2.f);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.aZ.a() * 20.0F; $$8++) {
         double $$9 = (this.af.j() * 2.0 - 1.0) * (double)this.aZ.a();
         double $$10 = (this.af.j() * 2.0 - 1.0) * (double)this.aZ.a();
         this.dY().a(ls.am, this.dD() + $$9, (double)($$4 + 1.0F), this.dJ() + $$10, $$2.d, $$2.e, $$2.f);
      }

      this.a(eak.O);
   }

   @Deprecated
   protected dvo bv() {
      return this.dY().a_(this.aR());
   }

   public dvo bw() {
      return this.dY().a_(this.aT());
   }

   public boolean bx() {
      return this.cl() && !this.bl() && !this.R_() && !this.ck() && !this.bz() && this.bN();
   }

   protected void by() {
      jh $$0 = this.aR();
      dvo $$1 = this.dY().a_($$0);
      if ($$1.o() != dop.a) {
         ezr $$2 = this.dB();
         jh $$3 = this.dy();
         double $$4 = this.dD() + (this.af.j() - 0.5) * (double)this.aZ.a();
         double $$5 = this.dJ() + (this.af.j() - 0.5) * (double)this.aZ.a();
         if ($$3.u() != $$0.u()) {
            $$4 = azn.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = azn.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dY().a(new lk(ls.b, $$1), $$4, this.dF() + 0.1, $$5, $$2.d * -4.0, 1.5, $$2.f * -4.0);
      }
   }

   public boolean a(axt<ern> $$0) {
      return this.aG.contains($$0);
   }

   public boolean bz() {
      return !this.al && this.ai.getDouble(axj.b) > 0.0;
   }

   public void a(float $$0, ezr $$1) {
      ezr $$2 = a($$1, $$0, this.dO());
      this.h(this.dB().e($$2));
   }

   protected static ezr a(ezr $$0, float $$1, float $$2) {
      double $$3 = $$0.h();
      if ($$3 < 1.0E-7) {
         return ezr.c;
      } else {
         ezr $$4 = ($$3 > 1.0 ? $$0.d() : $$0).c((double)$$1);
         float $$5 = azn.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = azn.b($$2 * (float) (Math.PI / 180.0));
         return new ezr($$4.d * (double)$$6 - $$4.f * (double)$$5, $$4.e, $$4.f * (double)$$6 + $$4.d * (double)$$5);
      }
   }

   @Deprecated
   public float bA() {
      return this.dY().f(this.dC(), this.dI()) ? this.dY().x(jh.a(this.dD(), this.dH(), this.dJ())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.b($$3, $$4);
   }

   public void b(float $$0, float $$1) {
      this.v($$0 % 360.0F);
      this.w(azn.a($$1, -90.0F, 90.0F) % 360.0F);
      this.O = this.dO();
      this.P = this.dQ();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = azn.a($$0, -3.0E7, 3.0E7);
      double $$4 = azn.a($$2, -3.0E7, 3.0E7);
      this.L = $$3;
      this.M = $$1;
      this.N = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(ezr $$0) {
      this.e($$0.d, $$0.e, $$0.f);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dO(), this.dQ());
   }

   public void a(jh $$0, float $$1, float $$2) {
      this.b($$0.c(), $$1, $$2);
   }

   public void b(ezr $$0, float $$1, float $$2) {
      this.b($$0.d, $$0.e, $$0.f, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.o($$0, $$1, $$2);
      this.v($$3);
      this.w($$4);
      this.bB();
      this.aA();
   }

   public final void bB() {
      this.bC();
      this.bD();
   }

   public final void c(ezr $$0, float $$1, float $$2) {
      this.j($$0);
      this.e($$1, $$2);
   }

   protected void bC() {
      this.j(this.s);
   }

   protected void bD() {
      this.e(this.dO(), this.dQ());
   }

   private void j(ezr $$0) {
      this.L = this.ab = $$0.d;
      this.M = this.ac = $$0.e;
      this.N = this.ad = $$0.f;
   }

   private void e(float $$0, float $$1) {
      this.O = $$0;
      this.P = $$1;
   }

   public final ezr bE() {
      return new ezr(this.ab, this.ac, this.ad);
   }

   public float f(bui $$0) {
      float $$1 = (float)(this.dD() - $$0.dD());
      float $$2 = (float)(this.dF() - $$0.dF());
      float $$3 = (float)(this.dJ() - $$0.dJ());
      return azn.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dD() - $$0;
      double $$4 = this.dF() - $$1;
      double $$5 = this.dJ() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(bui $$0) {
      return this.f($$0.dw());
   }

   public double f(ezr $$0) {
      double $$1 = this.dD() - $$0.d;
      double $$2 = this.dF() - $$0.e;
      double $$3 = this.dJ() - $$0.f;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cor $$0) {
   }

   public void h(bui $$0) {
      if (!this.z($$0)) {
         if (!$$0.ae && !this.ae) {
            double $$1 = $$0.dD() - this.dD();
            double $$2 = $$0.dJ() - this.dJ();
            double $$3 = azn.a($$1, $$2);
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
               if (!this.cc() && this.bK()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.cc() && $$0.bK()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void g(ezr $$0) {
      this.j($$0.d, $$0.e, $$0.f);
   }

   public void j(double $$0, double $$1, double $$2) {
      this.h(this.dB().b($$0, $$1, $$2));
      this.as = true;
   }

   protected void bF() {
      this.U = true;
   }

   public boolean a(bsy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bF();
         return false;
      }
   }

   public final ezr g(float $$0) {
      return this.c(this.h($$0), this.i($$0));
   }

   public jm bG() {
      return jm.a(this.g(1.0F));
   }

   public float h(float $$0) {
      return this.j($$0);
   }

   public float i(float $$0) {
      return this.k($$0);
   }

   public float j(float $$0) {
      return $$0 == 1.0F ? this.dQ() : azn.h($$0, this.P, this.dQ());
   }

   public float k(float $$0) {
      return $$0 == 1.0F ? this.dO() : azn.i($$0, this.O, this.dO());
   }

   public final ezr c(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = azn.b($$3);
      float $$5 = azn.a($$3);
      float $$6 = azn.b($$2);
      float $$7 = azn.a($$2);
      return new ezr((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final ezr l(float $$0) {
      return this.d(this.h($$0), this.i($$0));
   }

   protected final ezr d(float $$0, float $$1) {
      return this.c($$0 - 90.0F, $$1);
   }

   public final ezr bH() {
      return new ezr(this.dD(), this.dH(), this.dJ());
   }

   public final ezr m(float $$0) {
      double $$1 = azn.d((double)$$0, this.L, this.dD());
      double $$2 = azn.d((double)$$0, this.M, this.dF()) + (double)this.cU();
      double $$3 = azn.d((double)$$0, this.N, this.dJ());
      return new ezr($$1, $$2, $$3);
   }

   public ezr n(float $$0) {
      return this.m($$0);
   }

   public final ezr o(float $$0) {
      double $$1 = azn.d((double)$$0, this.L, this.dD());
      double $$2 = azn.d((double)$$0, this.M, this.dF());
      double $$3 = azn.d((double)$$0, this.N, this.dJ());
      return new ezr($$1, $$2, $$3);
   }

   public ezp a(double $$0, float $$1, boolean $$2) {
      ezr $$3 = this.m($$1);
      ezr $$4 = this.g($$1);
      ezr $$5 = $$3.b($$4.d * $$0, $$4.e * $$0, $$4.f * $$0);
      return this.dY().a(new den($$3, $$5, den.a.b, $$2 ? den.b.c : den.b.a, this));
   }

   public boolean bI() {
      return this.bN() && this.bJ();
   }

   public boolean bJ() {
      return false;
   }

   public boolean bK() {
      return false;
   }

   public void a(bui $$0, int $$1, bsy $$2) {
      if ($$0 instanceof arr) {
         ao.d.a((arr)$$0, this, $$2);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.dD() - $$0;
      double $$4 = this.dF() - $$1;
      double $$5 = this.dJ() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cT().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * m;
      return $$0 < $$1 * $$1;
   }

   public boolean d(un $$0) {
      if (this.aD != null && !this.aD.b()) {
         return false;
      } else {
         String $$1 = this.bM();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.f($$0);
            return true;
         }
      }
   }

   public boolean e(un $$0) {
      return this.cb() ? false : this.d($$0);
   }

   public un f(un $$0) {
      try {
         if (this.q != null) {
            $$0.a("Pos", this.a(this.q.dD(), this.dF(), this.q.dJ()));
         } else {
            $$0.a("Pos", this.a(this.dD(), this.dF(), this.dJ()));
         }

         ezr $$1 = this.dB();
         $$0.a("Motion", this.a($$1.d, $$1.e, $$1.f));
         $$0.a("Rotation", this.a(this.dO(), this.dQ()));
         $$0.a("FallDistance", this.aa);
         $$0.a("Fire", (short)this.aF);
         $$0.a("Air", (short)this.cv());
         $$0.a("OnGround", this.aL());
         $$0.a("Invulnerable", this.aU);
         $$0.a("PortalCooldown", this.aT);
         $$0.a("UUID", this.cI());
         xl $$2 = this.ao();
         if ($$2 != null) {
            $$0.a("CustomName", xl.a.a($$2, this.ea()));
         }

         if (this.cN()) {
            $$0.a("CustomNameVisible", this.cN());
         }

         if (this.bd()) {
            $$0.a("Silent", this.bd());
         }

         if (this.be()) {
            $$0.a("NoGravity", this.be());
         }

         if (this.aV) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.cw();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.cw());
         }

         if (this.be) {
            $$0.a("HasVisualFire", this.be);
         }

         if (!this.aW.isEmpty()) {
            ut $$4 = new ut();

            for (String $$5 : this.aW) {
               $$4.add(vi.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.cc()) {
            ut $$6 = new ut();

            for (bui $$7 : this.db()) {
               un $$8 = new un();
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

   public void g(un $$0) {
      try {
         ut $$1 = $$0.c("Pos", 6);
         ut $$2 = $$0.c("Motion", 6);
         ut $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.n(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         this.as = true;
         double $$7 = 3.0000512E7;
         this.o(azn.a($$1.h(0), -3.0000512E7, 3.0000512E7), azn.a($$1.h(1), -2.0E7, 2.0E7), azn.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.v($$3.i(0));
         this.w($$3.i(1));
         this.bB();
         this.q(this.dO());
         this.r(this.dO());
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

         if (!Double.isFinite(this.dD()) || !Double.isFinite(this.dF()) || !Double.isFinite(this.dJ())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dO()) && Double.isFinite((double)this.dQ())) {
            this.aA();
            this.a(this.dO(), this.dQ());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(xl.a.a($$8, this.ea()));
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
               ut $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.aW.add($$10.j($$12));
               }
            }

            this.a($$0);
            if (this.bL()) {
               this.aA();
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

   protected boolean bL() {
      return true;
   }

   @Nullable
   protected final String bM() {
      bup<?> $$0 = this.ar();
      all $$1 = bup.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(un var1);

   protected abstract void b(un var1);

   protected ut a(double... $$0) {
      ut $$1 = new ut();

      for (double $$2 : $$0) {
         $$1.add(uo.a($$2));
      }

      return $$1;
   }

   protected ut a(float... $$0) {
      ut $$1 = new ut();

      for (float $$2 : $$0) {
         $$1.add(uq.a($$2));
      }

      return $$1;
   }

   @Nullable
   public ckz a(dfe $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public ckz a(dfe $$0, int $$1) {
      return this.a(new cwf($$0), (float)$$1);
   }

   @Nullable
   public ckz b(cwf $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public ckz a(cwf $$0, float $$1) {
      if ($$0.f()) {
         return null;
      } else if (this.dY().C) {
         return null;
      } else {
         ckz $$2 = new ckz(this.dY(), this.dD(), this.dF() + (double)$$1, this.dJ(), $$0);
         $$2.q();
         this.dY().b($$2);
         return $$2;
      }
   }

   public boolean bN() {
      return !this.dT();
   }

   public boolean bO() {
      if (this.ae) {
         return false;
      } else {
         float $$0 = this.aZ.a() * 0.8F;
         ezm $$1 = ezm.a(this.bH(), (double)$$0, 1.0E-6, (double)$$0);
         return jh.b($$1)
            .anyMatch(
               $$1x -> {
                  dvo $$2 = this.dY().a_($$1x);
                  return !$$2.l()
                     && $$2.j(this.dY(), $$1x)
                     && fai.c($$2.g(this.dY(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), fai.a($$1), ezv.i);
               }
            );
      }
   }

   public bsh a(cor $$0, bsg $$1) {
      if (this.bN() && this instanceof bvc $$2) {
         if ($$2.C() == $$0) {
            if (!this.dY().y_()) {
               $$2.a(true, !$$0.fY());
               this.a(eak.r, $$0);
            }

            return bsh.a;
         }

         cwf $$3 = $$0.b($$1);
         if ($$3.a(cwj.vc) && $$2.O_()) {
            if (!this.dY().y_()) {
               $$2.b($$0, true);
            }

            $$3.h(1);
            return bsh.a;
         }
      }

      return bsh.e;
   }

   public boolean i(bui $$0) {
      return $$0.bP() && !this.z($$0);
   }

   public boolean bP() {
      return false;
   }

   public void u() {
      this.h(ezr.c);
      this.l();
      if (this.cb()) {
         this.dm().j(this);
      }
   }

   public final void j(bui $$0) {
      if (this.y($$0)) {
         this.a($$0, bui::a_);
      }
   }

   protected void a(bui $$0, bui.a $$1) {
      ezr $$2 = this.m($$0);
      ezr $$3 = $$0.l(this);
      $$1.accept($$0, $$2.d - $$3.d, $$2.e - $$3.e, $$2.f - $$3.f);
   }

   public void k(bui $$0) {
   }

   public ezr l(bui $$0) {
      return this.dv().b(buj.b, 0, this.az);
   }

   public ezr m(bui $$0) {
      return this.dw().e(this.a($$0, this.aZ, 1.0F));
   }

   protected ezr a(bui $$0, bul $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static ezr a(bui $$0, bui $$1, buk $$2) {
      int $$3 = $$0.db().indexOf($$1);
      return $$2.c(buj.a, $$3, $$0.az);
   }

   public boolean n(bui $$0) {
      return this.a($$0, false);
   }

   public boolean bQ() {
      return this instanceof bve;
   }

   public boolean a(bui $$0, boolean $$1) {
      if ($$0 == this.q) {
         return false;
      } else if (!$$0.bT()) {
         return false;
      } else {
         for (bui $$2 = $$0; $$2.q != null; $$2 = $$2.q) {
            if ($$2.q == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.cb()) {
               this.af();
            }

            this.b(bvq.a);
            this.q = $$0;
            this.q.p(this);
            $$0.D().filter($$0x -> $$0x instanceof arr).forEach($$0x -> ao.U.a((arr)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bui $$0) {
      return !this.cf() && this.K <= 0;
   }

   public void bR() {
      for (int $$0 = this.p.size() - 1; $$0 >= 0; $$0--) {
         ((bui)this.p.get($$0)).af();
      }
   }

   public void bS() {
      if (this.q != null) {
         bui $$0 = this.q;
         this.q = null;
         $$0.q(this);
      }
   }

   public void af() {
      this.bS();
   }

   protected void p(bui $$0) {
      if ($$0.dm() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.p.isEmpty()) {
            this.p = ImmutableList.of($$0);
         } else {
            List<bui> $$1 = Lists.newArrayList(this.p);
            if (!this.dY().C && $$0 instanceof cor && !(this.dc() instanceof cor)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.p = ImmutableList.copyOf($$1);
         }

         this.a(eak.s, $$0);
      }
   }

   protected void q(bui $$0) {
      if ($$0.dm() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.p.size() == 1 && this.p.get(0) == $$0) {
            this.p = ImmutableList.of();
         } else {
            this.p = this.p.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.K = 60;
         this.a(eak.q, $$0);
      }
   }

   protected boolean r(bui $$0) {
      return this.p.isEmpty();
   }

   protected boolean bT() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public double d_() {
      return this.dD();
   }

   public double e_() {
      return this.dF();
   }

   public double P_() {
      return this.dJ();
   }

   public float Q_() {
      return this.dQ();
   }

   public float f_() {
      return this.dO();
   }

   public void a(float $$0, int $$1) {
      this.q($$0);
   }

   public float bU() {
      return 0.0F;
   }

   public ezr bV() {
      return this.c(this.dQ(), this.dO());
   }

   public ezr a(cwb $$0) {
      if (!(this instanceof cor $$1)) {
         return ezr.c;
      } else {
         boolean $$2 = $$1.fd().a($$0) && !$$1.fc().a($$0);
         buy $$3 = $$2 ? $$1.fB().e() : $$1.fB();
         return this.c(0.0F, this.dO() + (float)($$3 == buy.b ? 80 : -80)).c(0.5);
      }
   }

   public ezq bW() {
      return new ezq(this.dQ(), this.dO());
   }

   public ezr bX() {
      return ezr.a(this.bW());
   }

   public void a(dob $$0, jh $$1) {
      if (this.aF()) {
         this.aD();
      } else {
         if (this.at == null || !this.at.a($$0)) {
            this.at = new bvp($$0, $$1.j());
         } else if (!this.at.e()) {
            this.at.a($$1.j());
            this.at.a(true);
         }
      }
   }

   protected void bY() {
      if (this.dY() instanceof arq $$0) {
         this.N();
         if (this.at != null) {
            if (this.at.a($$0, this, this.o(false))) {
               bor $$2 = boq.a();
               $$2.a("portal");
               this.aD();
               esm $$3 = this.at.a($$0, this);
               if ($$3 != null) {
                  arq $$4 = $$3.a();
                  if ($$0.o().a((dff)$$4) && ($$4.ag() == $$0.ag() || this.a($$0, $$4))) {
                     this.b($$3);
                  }
               }

               $$2.c();
            } else if (this.at.b()) {
               this.at = null;
            }
         }
      }
   }

   public int bZ() {
      bui $$0 = this.dc();
      return $$0 instanceof arr ? $$0.bZ() : 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
   }

   public void c(bsy $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dmc.a(this);
      }
   }

   public void p(float $$0) {
   }

   public boolean ca() {
      boolean $$0 = this.dY() != null && this.dY().C;
      return !this.bk() && (this.aF > 0 || $$0 && this.i(0));
   }

   public boolean cb() {
      return this.dm() != null;
   }

   public boolean cc() {
      return !this.p.isEmpty();
   }

   public boolean cd() {
      return this.ar().a(axh.p);
   }

   public boolean ce() {
      return !this.ar().a(axh.q);
   }

   public void g(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean cf() {
      return this.i(1);
   }

   public boolean cg() {
      return this.cf();
   }

   public boolean ch() {
      return this.cf();
   }

   public boolean ci() {
      return this.cf();
   }

   public boolean cj() {
      return this.cf();
   }

   public boolean ck() {
      return this.c(bvq.f);
   }

   public boolean cl() {
      return this.i(3);
   }

   public void h(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean cm() {
      return this.i(4);
   }

   public boolean cn() {
      return this.c(bvq.d);
   }

   public boolean co() {
      return this.cn() && !this.bl();
   }

   public void i(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cp() {
      return this.aV;
   }

   public final void j(boolean $$0) {
      this.aV = $$0;
      this.b(6, this.cq());
   }

   public boolean cq() {
      return this.dY().y_() ? this.i(6) : this.aV;
   }

   public boolean cr() {
      return this.i(5);
   }

   public boolean d(cor $$0) {
      if ($$0.R_()) {
         return false;
      } else {
         fay $$1 = this.ct();
         return $$1 != null && $$0 != null && $$0.ct() == $$1 && $$1.i() ? false : this.cr();
      }
   }

   public boolean cs() {
      return false;
   }

   public void a(BiConsumer<eah<?>, arq> $$0) {
   }

   @Nullable
   public far ct() {
      return this.dY().O().e(this.cK());
   }

   public final boolean s(@Nullable bui $$0) {
      return $$0 == null ? false : this == $$0 || this.t($$0) || $$0.t(this);
   }

   protected boolean t(bui $$0) {
      return this.a($$0.ct());
   }

   public boolean a(@Nullable fay $$0) {
      return this.ct() != null ? this.ct().a($$0) : false;
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

   public int cu() {
      return 300;
   }

   public int cv() {
      return this.am.a(aL);
   }

   public void j(int $$0) {
      this.am.a(aL, $$0);
   }

   public int cw() {
      return this.am.a(aQ);
   }

   public void k(int $$0) {
      this.am.a(aQ, $$0);
   }

   public float cx() {
      int $$0 = this.cz();
      return (float)Math.min(this.cw(), $$0) / (float)$$0;
   }

   public boolean cy() {
      return this.cw() >= this.cz();
   }

   public int cz() {
      return 140;
   }

   public void a(arq $$0, bvd $$1) {
      this.h(this.aF + 1);
      if (this.aF == 0) {
         this.d(8.0F);
      }

      this.a(this.dZ().c(), 5.0F);
   }

   public void l(boolean $$0) {
      ezr $$1 = this.dB();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.e - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.e + 0.1);
      }

      this.n($$1.d, $$2, $$1.f);
   }

   public void m(boolean $$0) {
      ezr $$1 = this.dB();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.e - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.e + 0.06);
      }

      this.n($$1.d, $$2, $$1.f);
      this.n();
   }

   public boolean a(arq $$0, bve $$1) {
      return true;
   }

   public void cA() {
      if (this.dB().b() > -0.5 && this.aa > 1.0F) {
         this.aa = 1.0F;
      }
   }

   public void n() {
      this.aa = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      jh $$3 = jh.a($$0, $$1, $$2);
      ezr $$4 = new ezr($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      jh.a $$5 = new jh.a();
      jm $$6 = jm.b;
      double $$7 = Double.MAX_VALUE;

      for (jm $$8 : new jm[]{jm.c, jm.d, jm.e, jm.f, jm.b}) {
         $$5.a($$3, $$8);
         if (!this.dY().a_($$5).m(this.dY(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == jm.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.af.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      ezr $$13 = this.dB().c(0.75);
      if ($$6.o() == jm.a.a) {
         this.n((double)($$12 * $$11), $$13.e, $$13.f);
      } else if ($$6.o() == jm.a.b) {
         this.n($$13.d, (double)($$12 * $$11), $$13.f);
      } else if ($$6.o() == jm.a.c) {
         this.n($$13.d, $$13.e, (double)($$12 * $$11));
      }
   }

   public void a(dvo $$0, ezr $$1) {
      this.n();
      this.V = $$1;
   }

   private static xl c(xl $$0) {
      xz $$1 = $$0.e().b($$0.a().a(null));

      for (xl $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public xl am() {
      xl $$0 = this.ao();
      return $$0 != null ? c($$0) : this.cB();
   }

   protected xl cB() {
      return this.n.h();
   }

   public boolean u(bui $$0) {
      return this == $$0;
   }

   public float cC() {
      return 0.0F;
   }

   public void q(float $$0) {
   }

   public void r(float $$0) {
   }

   public boolean cD() {
      return true;
   }

   public boolean v(bui $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dY() == null ? "~NULL~" : this.dY().toString();
      return this.aD != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.am().getString(),
            this.o,
            $$0,
            this.dD(),
            this.dF(),
            this.dJ(),
            this.aD
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.am().getString(),
            this.o,
            $$0,
            this.dD(),
            this.dF(),
            this.dJ()
         );
   }

   public boolean b(bsy $$0) {
      return this.dT() || this.aU && !$$0.a(axf.d) && !$$0.h() || $$0.a(axf.i) && this.bk() || $$0.a(axf.m) && this.ar().a(axh.o);
   }

   public boolean cE() {
      return this.aU;
   }

   public void n(boolean $$0) {
      this.aU = $$0;
   }

   public void w(bui $$0) {
      this.b($$0.dD(), $$0.dF(), $$0.dJ(), $$0.dO(), $$0.dQ());
   }

   public void x(bui $$0) {
      un $$1 = $$0.f(new un());
      $$1.r("Dimension");
      this.g($$1);
      this.aT = $$0.aT;
      this.at = $$0.at;
   }

   @Nullable
   public bui b(esm $$0) {
      if (this.dY() instanceof arq $$1 && !this.dT()) {
         arq $$3 = $$0.a();
         List<bui> $$4 = this.db();
         this.ap();
         List<bui> $$5 = new ArrayList<>();

         for (bui $$6 : $$4) {
            float $$7 = $$6.dO() - this.dO();
            float $$8 = $$6.dQ() - this.dQ();
            float $$9 = $$0.d() + ($$0.g().contains(bvs.d) ? 0.0F : $$7);
            float $$10 = $$0.e() + ($$0.g().contains(bvs.e) ? 0.0F : $$8);
            bui $$11 = $$6.b($$0.a($$9, $$10));
            if ($$11 != null) {
               $$5.add($$11);
            }
         }

         bor $$12 = boq.a();
         $$12.a("changeDimension");
         bui $$13 = $$3.ag() == $$1.ag() ? this : this.ar().a($$3, buo.s);
         if ($$13 != null) {
            if (this != $$13) {
               $$13.x(this);
               this.cF();
            }

            $$13.c($$0);
            if (this != $$13) {
               $$3.d($$13);
            }

            for (bui $$14 : $$5) {
               $$14.a($$13, true);
            }

            $$1.h();
            $$3.h();
            $$0.h().onTransition($$13);
         }

         $$12.c();
         return $$13;
      }

      return null;
   }

   protected void c(esm $$0) {
      bvr $$1 = bvr.a($$0);
      bvr $$2 = bvr.a(bvr.a(this), $$1, $$0.g());
      this.o($$2.a().d, $$2.a().e, $$2.a().f);
      this.v($$2.c());
      this.q($$2.c());
      this.w($$2.d());
      this.aA();
      this.bB();
      this.h($$2.b());
      this.bg.clear();
   }

   public void f(jh $$0) {
      if (this.dY() instanceof arq $$1) {
         $$1.l().a(arw.e, new del($$0), 3, $$0);
      }
   }

   protected void cF() {
      this.b(bui.c.e);
      if (this instanceof bvc $$0) {
         $$0.a(true, false);
      }
   }

   public ezr a(jm.a $$0, l.a $$1) {
      return eso.a($$1, $$0, this.dw(), this.a(this.ay()));
   }

   public boolean o(boolean $$0) {
      return ($$0 || !this.cb()) && this.bN();
   }

   public boolean a(dff $$0, dff $$1) {
      if ($$0.ag() == dff.k && $$1.ag() == dff.i) {
         for (bui $$2 : this.db()) {
            if ($$2 instanceof arr $$3 && !$$3.j) {
               return false;
            }
         }
      }

      return true;
   }

   public float a(dex $$0, dek $$1, jh $$2, dvo $$3, ero $$4, float $$5) {
      return $$5;
   }

   public boolean a(dex $$0, dek $$1, jh $$2, dvo $$3, float $$4) {
      return true;
   }

   public int cG() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bup.a(this.ar()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.o);
      $$0.a("Entity Name", () -> this.am().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dD(), this.dF(), this.dJ()));
      $$0.a("Entity's Block location", p.a(this.dY(), azn.a(this.dD()), azn.a(this.dF()), azn.a(this.dJ())));
      ezr $$1 = this.dB();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.d, $$1.e, $$1.f));
      $$0.a("Entity's Passengers", () -> this.db().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.dm()));
   }

   public boolean cH() {
      return this.ca() && !this.R_();
   }

   public void a_(UUID $$0) {
      this.au = $$0;
      this.av = this.au.toString();
   }

   @Override
   public UUID cI() {
      return this.au;
   }

   public String cJ() {
      return this.av;
   }

   @Override
   public String cK() {
      return this.av;
   }

   public boolean cL() {
      return true;
   }

   public static double cM() {
      return m;
   }

   public static void b(double $$0) {
      m = $$0;
   }

   @Override
   public xl S_() {
      return far.a(this.ct(), this.am()).a($$0 -> $$0.a(this.cS()).a(this.cJ()));
   }

   public void b(@Nullable xl $$0) {
      this.am.a(aM, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public xl ao() {
      return this.am.a(aM).orElse(null);
   }

   @Override
   public boolean an() {
      return this.am.a(aM).isPresent();
   }

   public void p(boolean $$0) {
      this.am.a(aN, $$0);
   }

   public boolean cN() {
      return this.am.a(aN);
   }

   public boolean a(arq $$0, double $$1, double $$2, double $$3, Set<bvs> $$4, float $$5, float $$6, boolean $$7) {
      float $$8 = azn.a($$6, -90.0F, 90.0F);
      bui $$9 = this.b(new esm($$0, new ezr($$1, $$2, $$3), ezr.c, $$5, $$8, $$4, esm.a));
      return $$9 != null;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dY() instanceof arq) {
         this.b($$0, $$1, $$2, this.dO(), this.dQ());
         this.x();
      }
   }

   private void x() {
      this.dd().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.p.iterator();

         while (var1.hasNext()) {
            bui $$1 = (bui)var1.next();
            $$0.a($$1, bui::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.dD() + $$0, this.dF() + $$1, this.dJ() + $$2);
   }

   public boolean cO() {
      return this.cN();
   }

   @Override
   public void a(List<aks.c<?>> $$0) {
   }

   @Override
   public void a(ako<?> $$0) {
      if (ar.equals($$0)) {
         this.j_();
      }
   }

   @Deprecated
   protected void cP() {
      bvq $$0 = this.ay();
      bul $$1 = this.a($$0);
      this.aZ = $$1;
      this.ba = $$1.c();
   }

   public void j_() {
      bul $$0 = this.aZ;
      bvq $$1 = this.ay();
      bul $$2 = this.a($$1);
      this.aZ = $$2;
      this.ba = $$2.c();
      this.aA();
      boolean $$3 = $$2.a() <= 4.0F && $$2.b() <= 4.0F;
      if (!this.r.C && !this.al && !this.ae && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cor)) {
         this.a($$0);
      }
   }

   public boolean a(bul $$0) {
      bul $$1 = this.a(this.ay());
      ezr $$2 = this.dw().b(0.0, (double)$$0.b() / 2.0, 0.0);
      double $$3 = (double)Math.max(0.0F, $$1.a() - $$0.a()) + 1.0E-6;
      double $$4 = (double)Math.max(0.0F, $$1.b() - $$0.b()) + 1.0E-6;
      fal $$5 = fai.a(ezm.a($$2, $$3, $$4, $$3));
      Optional<ezr> $$6 = this.r.a(this, $$5, $$2, (double)$$1.a(), (double)$$1.b(), (double)$$1.a());
      if ($$6.isPresent()) {
         this.b($$6.get().b(0.0, (double)(-$$1.b()) / 2.0, 0.0));
         return true;
      } else {
         if ($$1.a() > $$0.a() && $$1.b() > $$0.b()) {
            fal $$7 = fai.a(ezm.a($$2, $$3, 1.0E-6, $$3));
            Optional<ezr> $$8 = this.r.a(this, $$7, $$2, (double)$$1.a(), (double)$$0.b(), (double)$$1.a());
            if ($$8.isPresent()) {
               this.b($$8.get().b(0.0, (double)(-$$0.b()) / 2.0 + 1.0E-6, 0.0));
               return true;
            }
         }

         return false;
      }
   }

   public jm cQ() {
      return jm.a((double)this.dO());
   }

   public jm cR() {
      return this.cQ();
   }

   protected xr cS() {
      return new xr(xr.a.c, new xr.b(this.ar(), this.cI(), this.am()));
   }

   public boolean a(arr $$0) {
      return true;
   }

   @Override
   public final ezm cT() {
      return this.aB;
   }

   public final void a(ezm $$0) {
      this.aB = $$0;
   }

   public final float d(bvq $$0) {
      return this.a($$0).c();
   }

   public final float cU() {
      return this.ba;
   }

   public ezr s(float $$0) {
      return this.cV();
   }

   protected ezr cV() {
      return new ezr(0.0, (double)this.cU(), (double)(this.dt() * 0.4F));
   }

   public bvw a_(int $$0) {
      return bvw.a;
   }

   @Override
   public void a(xl $$0) {
   }

   public dff cW() {
      return this.dY();
   }

   @Nullable
   public MinecraftServer cX() {
      return this.dY().o();
   }

   public bsh a(cor $$0, ezr $$1, bsg $$2) {
      return bsh.e;
   }

   public boolean a(dex $$0) {
      return false;
   }

   public void d(arr $$0) {
   }

   public void e(arr $$0) {
   }

   public float a(dow $$0) {
      float $$1 = azn.h(this.dO());
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

   public float a(dnf $$0) {
      float $$1 = azn.h(this.dO());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public boolean cY() {
      return false;
   }

   public cpl a(cpk $$0) {
      return this.ar().a(axh.r) ? cpl.b : cpl.a;
   }

   @Nullable
   public bve cZ() {
      return null;
   }

   public final boolean da() {
      return this.cZ() != null;
   }

   public final List<bui> db() {
      return this.p;
   }

   @Nullable
   public bui dc() {
      return this.p.isEmpty() ? null : (bui)this.p.get(0);
   }

   public boolean y(bui $$0) {
      return this.p.contains($$0);
   }

   public boolean a(Predicate<bui> $$0) {
      UnmodifiableIterator var2 = this.p.iterator();

      while (var2.hasNext()) {
         bui $$1 = (bui)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bui> D() {
      return this.p.stream().flatMap(bui::dd);
   }

   @Override
   public Stream<bui> dd() {
      return Stream.concat(Stream.of(this), this.D());
   }

   @Override
   public Stream<bui> de() {
      return Stream.concat(this.p.stream().flatMap(bui::de), Stream.of(this));
   }

   public Iterable<bui> df() {
      return () -> this.D().iterator();
   }

   public int dg() {
      return (int)this.D().filter($$0 -> $$0 instanceof cor).count();
   }

   public boolean dh() {
      return this.dg() == 1;
   }

   public bui di() {
      bui $$0 = this;

      while ($$0.cb()) {
         $$0 = $$0.dm();
      }

      return $$0;
   }

   public boolean z(bui $$0) {
      return this.di() == $$0.di();
   }

   public boolean A(bui $$0) {
      if (!$$0.cb()) {
         return false;
      } else {
         bui $$1 = $$0.dm();
         return $$1 == this ? true : this.A($$1);
      }
   }

   public boolean dj() {
      return this instanceof cor $$0 ? $$0.g() : this.dk();
   }

   public boolean dk() {
      return this.cZ() instanceof cor $$0 ? $$0.g() : this.dl();
   }

   public boolean dl() {
      return !this.dY().C;
   }

   protected static ezr a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -azn.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = azn.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new ezr((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public ezr b(bve $$0) {
      return new ezr(this.dD(), this.cT().e, this.dJ());
   }

   @Nullable
   public bui dm() {
      return this.q;
   }

   @Nullable
   public bui dn() {
      return this.q != null && this.q.cZ() == this ? this.q : null;
   }

   public ert k_() {
      return ert.a;
   }

   public awp do() {
      return awp.g;
   }

   protected int dp() {
      return 1;
   }

   public ew dq() {
      return new ew(
         this, this.dw(), this.bW(), this.dY() instanceof arq ? (arq)this.dY() : null, this.H(), this.am().getString(), this.S_(), this.dY().o(), this
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
      return this.dY().ac().b(dfb.p);
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public boolean L_() {
      return true;
   }

   public void a(fi.a $$0, ezr $$1) {
      ezr $$2 = $$0.a(this);
      double $$3 = $$1.d - $$2.d;
      double $$4 = $$1.e - $$2.e;
      double $$5 = $$1.f - $$2.f;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.w(azn.h((float)(-(azn.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.v(azn.h((float)(azn.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.q(this.dO());
      this.P = this.dQ();
      this.O = this.dO();
   }

   public float t(float $$0) {
      return azn.h($$0, this.O, this.az);
   }

   public boolean a(axt<ern> $$0, double $$1) {
      if (this.dr()) {
         return false;
      } else {
         ezm $$2 = this.cT().h(0.001);
         int $$3 = azn.a($$2.a);
         int $$4 = azn.c($$2.d);
         int $$5 = azn.a($$2.b);
         int $$6 = azn.c($$2.e);
         int $$7 = azn.a($$2.c);
         int $$8 = azn.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cL();
         boolean $$11 = false;
         ezr $$12 = ezr.c;
         int $$13 = 0;
         jh.a $$14 = new jh.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  ero $$18 = this.dY().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a(this.dY(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           ezr $$20 = $$18.c(this.dY(), $$14);
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

            if (!(this instanceof cor)) {
               $$12 = $$12.d();
            }

            ezr $$21 = this.dB();
            $$12 = $$12.c($$1);
            double $$22 = 0.003;
            if (Math.abs($$21.d) < 0.003 && Math.abs($$21.f) < 0.003 && $$12.g() < 0.0045000000000000005) {
               $$12 = $$12.d().c(0.0045000000000000005);
            }

            this.h(this.dB().e($$12));
         }

         this.ai.put($$0, $$9);
         return $$11;
      }
   }

   public boolean dr() {
      ezm $$0 = this.cT().g(1.0);
      int $$1 = azn.a($$0.a);
      int $$2 = azn.c($$0.d);
      int $$3 = azn.a($$0.c);
      int $$4 = azn.c($$0.f);
      return !this.dY().b($$1, $$3, $$2, $$4);
   }

   public double b(axt<ern> $$0) {
      return this.ai.getDouble($$0);
   }

   public double ds() {
      return (double)this.cU() < 0.4 ? 0.0 : 0.4;
   }

   public final float dt() {
      return this.aZ.a();
   }

   public final float du() {
      return this.aZ.b();
   }

   public zs<ach> a(arp $$0) {
      return new aci(this, $$0);
   }

   public bul a(bvq $$0) {
      return this.n.n();
   }

   public final buk dv() {
      return this.aZ.d();
   }

   public ezr dw() {
      return this.s;
   }

   public ezr dx() {
      return this.dw();
   }

   @Override
   public jh dy() {
      return this.t;
   }

   public dvo dz() {
      if (this.bf == null) {
         this.bf = this.dY().a_(this.dy());
      }

      return this.bf;
   }

   public del dA() {
      return this.u;
   }

   public ezr dB() {
      return this.v;
   }

   public void h(ezr $$0) {
      this.v = $$0;
   }

   public void i(ezr $$0) {
      this.h(this.dB().e($$0));
   }

   public void n(double $$0, double $$1, double $$2) {
      this.h(new ezr($$0, $$1, $$2));
   }

   public final int dC() {
      return this.t.u();
   }

   public final double dD() {
      return this.s.d;
   }

   public double c(double $$0) {
      return this.s.d + (double)this.dt() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.af.j() - 1.0) * $$0);
   }

   public final int dE() {
      return this.t.v();
   }

   public final double dF() {
      return this.s.e;
   }

   public double e(double $$0) {
      return this.s.e + (double)this.du() * $$0;
   }

   public double dG() {
      return this.e(this.af.j());
   }

   public double dH() {
      return this.s.e + (double)this.ba;
   }

   public final int dI() {
      return this.t.w();
   }

   public final double dJ() {
      return this.s.f;
   }

   public double f(double $$0) {
      return this.s.f + (double)this.dt() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.af.j() - 1.0) * $$0);
   }

   public final void o(double $$0, double $$1, double $$2) {
      if (this.s.d != $$0 || this.s.e != $$1 || this.s.f != $$2) {
         this.s = new ezr($$0, $$1, $$2);
         int $$3 = azn.a($$0);
         int $$4 = azn.a($$1);
         int $$5 = azn.a($$2);
         if ($$3 != this.t.u() || $$4 != this.t.v() || $$5 != this.t.w()) {
            this.t = new jh($$3, $$4, $$5);
            this.bf = null;
            if (kj.a($$3) != this.u.g || kj.a($$5) != this.u.h) {
               this.u = new del(this.t);
            }
         }

         this.aR.a();
      }
   }

   public void dK() {
   }

   public ezr u(float $$0) {
      return this.o($$0).b(0.0, (double)this.ba * 0.7, 0.0);
   }

   public void a(aci $$0) {
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
   public cwf dL() {
      return null;
   }

   public void q(boolean $$0) {
      this.aw = $$0;
   }

   public boolean dM() {
      return !this.ar().a(axh.k);
   }

   public boolean dN() {
      return (this.aw || this.ax) && this.dM();
   }

   public float dO() {
      return this.az;
   }

   public float dP() {
      return this.dO();
   }

   public void v(float $$0) {
      if (!Float.isFinite($$0)) {
         ae.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.az = $$0;
      }
   }

   public float dQ() {
      return this.aA;
   }

   public void w(float $$0) {
      if (!Float.isFinite($$0)) {
         ae.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aA = Math.clamp($$0 % 360.0F, -90.0F, 90.0F);
      }
   }

   public boolean dR() {
      return false;
   }

   public float dS() {
      return 0.0F;
   }

   public void a(@Nullable bui $$0) {
   }

   public final boolean dT() {
      return this.aD != null;
   }

   @Nullable
   public bui.c dU() {
      return this.aD;
   }

   @Override
   public final void b(bui.c $$0) {
      if (this.aD == null) {
         this.aD = $$0;
      }

      if (this.aD.a()) {
         this.af();
      }

      this.db().forEach(bui::af);
      this.aR.a($$0);
   }

   protected void dV() {
      this.aD = null;
   }

   @Override
   public void a(dzs $$0) {
      this.aR = $$0;
   }

   @Override
   public boolean dW() {
      if (this.aD != null && !this.aD.b()) {
         return false;
      } else {
         return this.cb() ? false : !this.cc() || !this.dh();
      }
   }

   @Override
   public boolean dX() {
      return false;
   }

   public boolean a(dff $$0, jh $$1) {
      return true;
   }

   public dff dY() {
      return this.r;
   }

   protected void a(dff $$0) {
      this.r = $$0;
   }

   public bsz dZ() {
      return this.dY().ai();
   }

   public ke ea() {
      return this.dY().H_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = azn.d($$6, this.dD(), $$1);
      double $$8 = azn.d($$6, this.dF(), $$2);
      double $$9 = azn.d($$6, this.dJ(), $$3);
      float $$10 = (float)azn.e($$6, (double)this.dO(), $$4);
      float $$11 = (float)azn.d($$6, (double)this.dQ(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   public azv eb() {
      return this.af;
   }

   public ezr ai() {
      if (this.cZ() instanceof cor $$0 && this.bN()) {
         return $$0.ai();
      }

      return this.dB();
   }

   @Nullable
   public cwf ec() {
      return null;
   }

   public Optional<alk<eul>> ed() {
      return this.n.k();
   }

   @FunctionalInterface
   public interface a {
      void accept(bui var1, double var2, double var4, double var6);
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
