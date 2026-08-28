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

public abstract class bul implements akp, bsn, dzy, fbc {
   private static final Logger b = LogUtils.getLogger();
   public static final String v = "id";
   public static final String w = "Passengers";
   private static final AtomicInteger c = new AtomicInteger();
   public static final int x = 0;
   public static final int y = 60;
   public static final int z = 300;
   public static final int A = 1024;
   public static final float B = 0.2F;
   public static final double C = 0.500001;
   public static final double D = 0.999999;
   public static final int E = 140;
   public static final int F = 40;
   public static final int G = 3;
   private static final ezt d = new ezt(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double k = 0.014;
   private static final double l = 0.007;
   private static final double m = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double n = 1.0;
   private final bus<?> o;
   private int p = c.incrementAndGet();
   public boolean I;
   private ImmutableList<bul> q = ImmutableList.of();
   protected int J;
   @Nullable
   private bul r;
   private dfm s;
   public double K;
   public double L;
   public double M;
   private ezy t;
   private jh u;
   private des ay;
   private ezy az = ezy.c;
   private float aA;
   private float aB;
   public float N;
   public float O;
   private ezt aC = d;
   private boolean aD;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected ezy U = ezy.c;
   @Nullable
   private bul.c aE;
   public static final float V = 0.6F;
   public static final float W = 1.8F;
   public float X;
   public float Y;
   public float Z;
   private float aF = 1.0F;
   public double aa;
   public double ab;
   public double ac;
   public boolean ad;
   protected final azu ae = azu.a();
   public int af;
   private int aG = -this.dn();
   protected boolean ag;
   protected Object2DoubleMap<axs<eru>> ah = new Object2DoubleArrayMap(2);
   protected boolean ai;
   private final Set<axs<eru>> aH = new HashSet<>();
   public int aj;
   protected boolean ak = true;
   protected final akq al;
   protected static final akm<Byte> am = akq.a(bul.class, ako.a);
   protected static final int an = 0;
   private static final int aI = 1;
   private static final int aJ = 3;
   private static final int aK = 4;
   private static final int aL = 5;
   protected static final int ao = 6;
   protected static final int ap = 7;
   private static final akm<Integer> aM = akq.a(bul.class, ako.b);
   private static final akm<Optional<xj>> aN = akq.a(bul.class, ako.g);
   private static final akm<Boolean> aO = akq.a(bul.class, ako.k);
   private static final akm<Boolean> aP = akq.a(bul.class, ako.k);
   private static final akm<Boolean> aQ = akq.a(bul.class, ako.k);
   protected static final akm<bvt> aq = akq.a(bul.class, ako.w);
   private static final akm<Integer> aR = akq.a(bul.class, ako.b);
   private dzz aS = dzz.a;
   private final aiw aT = new aiw();
   public boolean ar;
   @Nullable
   public bvs as;
   private int aU;
   private boolean aV;
   protected UUID at = azm.a(this.ae);
   protected String au = this.at.toString();
   private boolean aW;
   private final Set<String> aX = Sets.newHashSet();
   private final double[] aY = new double[]{0.0, 0.0, 0.0};
   private long aZ;
   private buo ba;
   private float bb;
   public boolean av;
   public boolean aw;
   public Optional<jh> ax = Optional.empty();
   private boolean bc = false;
   private float bd;
   private int be;
   private boolean bf;
   @Nullable
   private dvv bg = null;
   private final Map<jh, dvv> bh = new HashMap<>();

   public bul(bus<?> $$0, dfm $$1) {
      this.o = $$0;
      this.s = $$1;
      this.ba = $$0.n();
      this.t = ezy.c;
      this.u = jh.c;
      this.ay = des.d;
      akq.a $$2 = new akq.a(this);
      $$2.a(am, (byte)0);
      $$2.a(aM, this.cs());
      $$2.a(aO, false);
      $$2.a(aN, Optional.empty());
      $$2.a(aP, false);
      $$2.a(aQ, false);
      $$2.a(aq, bvt.a);
      $$2.a(aR, 0);
      this.a($$2);
      this.al = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.bb = this.ba.c();
   }

   public boolean a(jh $$0, dvv $$1) {
      fas $$2 = $$1.b(this.dV(), $$0, fad.a(this));
      fas $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return fap.c($$3, fap.a(this.cR()), fac.i);
   }

   public int j_() {
      fbf $$0 = this.cr();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean Y_() {
      return false;
   }

   public final void ao() {
      if (this.ca()) {
         this.bP();
      }

      if (this.bZ()) {
         this.ae();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.aT.e(new ezy($$0, $$1, $$2));
   }

   public aiw ap() {
      return this.aT;
   }

   public bus<?> aq() {
      return this.o;
   }

   @Override
   public int ar() {
      return this.p;
   }

   public void e(int $$0) {
      this.p = $$0;
   }

   public Set<String> as() {
      return this.aX;
   }

   public boolean a(String $$0) {
      return this.aX.size() >= 1024 ? false : this.aX.add($$0);
   }

   public boolean b(String $$0) {
      return this.aX.remove($$0);
   }

   public void c(arp $$0) {
      this.a(bul.c.a);
      this.a(ear.p);
   }

   public final void at() {
      this.a(bul.c.b);
   }

   protected abstract void a(akq.a var1);

   public akq au() {
      return this.al;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bul ? ((bul)$$0).p == this.p : false;
   }

   @Override
   public int hashCode() {
      return this.p;
   }

   public void a(bul.c $$0) {
      this.b($$0);
   }

   public void av() {
   }

   public void b(bvt $$0) {
      this.al.a(aq, $$0);
   }

   public bvt aw() {
      return this.al.a(aq);
   }

   public boolean c(bvt $$0) {
      return this.aw() == $$0;
   }

   public boolean a(bul $$0, double $$1) {
      return this.dt().a((ka)$$0.dt(), $$1);
   }

   public boolean a(bul $$0, double $$1, double $$2) {
      double $$3 = $$0.dA() - this.dA();
      double $$4 = $$0.dC() - this.dC();
      double $$5 = $$0.dG() - this.dG();
      return azm.e($$3, $$5) < azm.k($$1) && azm.k($$4) < azm.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.v($$0 % 360.0F);
      this.w($$1 % 360.0F);
   }

   public final void b(ezy $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      this.a(this.ax());
   }

   protected ezt ax() {
      return this.ba.a(this.t);
   }

   protected void ay() {
      this.a_(this.t.d, this.t.e, this.t.f);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.w(this.dN() + $$2);
      this.v(this.dL() + $$3);
      this.w(azm.a(this.dN(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = azm.a(this.O, -90.0F, 90.0F);
      if (this.r != null) {
         this.r.k(this);
      }
   }

   public void h() {
      this.az();
   }

   public void az() {
      bou $$0 = bot.a();
      $$0.a("entityBaseTick");
      this.bg = null;
      if (this.bZ() && this.dk().dQ()) {
         this.ae();
      }

      if (this.J > 0) {
         this.J--;
      }

      this.bW();
      if (this.bv()) {
         this.bw();
      }

      this.aw = this.av;
      this.av = false;
      this.bq();
      this.t();
      this.bp();
      if (this.dV() instanceof arp $$1) {
         if (this.aG > 0) {
            if (this.bi()) {
               this.h(this.aG - 4);
               if (this.aG < 0) {
                  this.aH();
               }
            } else {
               if (this.aG % 20 == 0 && !this.bx()) {
                  this.a($$1, this.dW().d(), 1.0F);
               }

               this.h(this.aG - 1);
            }

            if (this.cu() > 0) {
               this.k(0);
               this.dV().a(null, 1009, this.u, 1);
            }
         }
      } else {
         this.aH();
      }

      if (this.bx()) {
         this.aE();
         this.Z *= 0.5F;
      }

      this.aA();
      if (!this.dV().C) {
         this.c(this.aG > 0);
      }

      this.ak = false;
      if (this.dV() instanceof arp $$2 && this instanceof bvf) {
         bvf.a_($$2, (bul)((bvf)this));
      }

      $$0.c();
   }

   public void c(boolean $$0) {
      this.b(0, $$0 || this.bf);
   }

   public void aA() {
      if (this.dC() < (double)(this.dV().K_() - 64)) {
         this.aI();
      }
   }

   public void aB() {
      this.aU = this.bX();
   }

   public void f(int $$0) {
      this.aU = $$0;
   }

   public int aC() {
      return this.aU;
   }

   public boolean aD() {
      return this.aU > 0;
   }

   protected void M() {
      if (this.aD()) {
         this.aU--;
      }
   }

   public void aE() {
      if (!this.bi()) {
         this.d(15.0F);
         if (this.dV() instanceof arp $$0 && this.a($$0, this.dW().e(), 4.0F) && this.aF() && !this.bb()) {
            $$0.a(null, this.dA(), this.dC(), this.dG(), awn.kb, this.dm(), 0.4F, 2.0F + this.ae.i() * 0.4F);
         }
      }
   }

   protected boolean aF() {
      return true;
   }

   public final void d(float $$0) {
      this.g(azm.d($$0 * 20.0F));
   }

   public void g(int $$0) {
      if (this.aG < $$0) {
         this.h($$0);
      }
   }

   public void h(int $$0) {
      this.aG = $$0;
   }

   public int aG() {
      return this.aG;
   }

   public void aH() {
      this.h(0);
   }

   protected void aI() {
      this.at();
   }

   public boolean g(double $$0, double $$1, double $$2) {
      return this.b(this.cR().d($$0, $$1, $$2));
   }

   private boolean b(ezt $$0) {
      return this.dV().a(this, $$0) && !this.dV().d($$0);
   }

   public void d(boolean $$0) {
      this.aD = $$0;
      this.a($$0, null);
   }

   public void a(boolean $$0, boolean $$1, ezy $$2) {
      this.aD = $$0;
      this.P = $$1;
      this.a($$0, $$2);
   }

   public boolean d(jh $$0) {
      return this.ax.isPresent() && this.ax.get().equals($$0);
   }

   protected void a(boolean $$0, @Nullable ezy $$1) {
      if ($$0) {
         ezt $$2 = this.cR();
         ezt $$3 = new ezt($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<jh> $$4 = this.s.h(this, $$3);
         if ($$4.isPresent() || this.bc) {
            this.ax = $$4;
         } else if ($$1 != null) {
            ezt $$5 = $$3.d(-$$1.d, 0.0, -$$1.f);
            $$4 = this.s.h(this, $$5);
            this.ax = $$4;
         }

         this.bc = $$4.isEmpty();
      } else {
         this.bc = false;
         if (this.ax.isPresent()) {
            this.ax = Optional.empty();
         }
      }
   }

   public boolean aJ() {
      return this.aD;
   }

   public void a(bvl $$0, ezy $$1) {
      if (this.ad) {
         this.a_(this.dA() + $$1.d, this.dC() + $$1.e, this.dG() + $$1.f);
      } else {
         if ($$0 == bvl.c) {
            $$1 = this.d($$1);
            if ($$1.equals(ezy.c)) {
               return;
            }
         }

         bou $$2 = bot.a();
         $$2.a("move");
         if (this.U.h() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = ezy.c;
            this.h(ezy.c);
         }

         $$1 = this.a($$1, $$0);
         ezy $$3 = this.a($$1);
         double $$4 = $$3.h();
         if ($$4 > 1.0E-7 || $$1.h() - $$4 < 1.0E-7) {
            if (this.Z != 0.0F && $$4 >= 1.0) {
               ezu $$5 = this.dV().a(new deu(this.dt(), this.dt().e($$3), deu.a.d, deu.b.d, this));
               if ($$5.d() != ezw.a.a) {
                  this.k();
               }
            }

            this.a_(this.dA() + $$3.d, this.dC() + $$3.e, this.dG() + $$3.f);
         }

         $$2.c();
         $$2.a("rest");
         boolean $$6 = !azm.b($$1.d, $$3.d);
         boolean $$7 = !azm.b($$1.f, $$3.f);
         this.P = $$6 || $$7;
         if (Math.abs($$1.e) > 0.0 || this.dh()) {
            this.Q = $$1.e != $$3.e;
            this.R = this.Q && $$1.e < 0.0;
            this.a(this.R, this.P, $$3);
         }

         if (this.P) {
            this.S = this.c($$3);
         } else {
            this.S = false;
         }

         jh $$8 = this.aP();
         dvv $$9 = this.dV().a_($$8);
         if (!this.dV().A_() || this.di()) {
            this.a($$3.e, this.aJ(), $$9, $$8);
         }

         if (this.dQ()) {
            $$2.c();
         } else {
            if (this.P) {
               ezy $$10 = this.dy();
               this.n($$6 ? 0.0 : $$10.d, $$10.e, $$7 ? 0.0 : $$10.f);
            }

            if (this.di()) {
               diq $$11 = $$9.b();
               if ($$1.e != $$3.e) {
                  $$11.a(this.dV(), this);
               }
            }

            if (!this.dV().A_() || this.di()) {
               bul.b $$12 = this.bg();
               if ($$12.a() && !this.bZ()) {
                  this.a($$12, $$3, $$8, $$9);
               }
            }

            float $$13 = this.aT();
            this.h(this.dy().d((double)$$13, 1.0, (double)$$13));
            $$2.c();
         }
      }
   }

   private void a(bul.b $$0, ezy $$1, jh $$2, dvv $$3) {
      float $$4 = 0.6F;
      float $$5 = (float)($$1.g() * 0.6F);
      float $$6 = (float)($$1.i() * 0.6F);
      jh $$7 = this.aR();
      dvv $$8 = this.dV().a_($$7);
      boolean $$9 = this.c($$8);
      this.X += $$9 ? $$5 : $$6;
      this.Y += $$5;
      if (this.X > this.aF && !$$8.l()) {
         boolean $$10 = $$7.equals($$2);
         boolean $$11 = this.a($$2, $$3, $$0.c(), $$10, $$1);
         if (!$$10) {
            $$11 |= this.a($$7, $$8, false, $$0.b(), $$1);
         }

         if ($$11) {
            this.aF = this.aU();
         } else if (this.bj()) {
            this.aF = this.aU();
            if ($$0.c()) {
               this.aY();
            }

            if ($$0.b()) {
               this.a(ear.Q);
            }
         }
      } else if ($$8.l()) {
         this.aO();
      }
   }

   public void aK() {
      this.a(this.bC(), this.t);
   }

   public void a(ezy $$0, ezy $$1) {
      if (this.aL()) {
         boolean $$2 = this.bY();
         if (this.aJ()) {
            jh $$3 = this.aP();
            dvv $$4 = this.dV().a_($$3);
            $$4.b().a(this.dV(), $$3, $$4, this);
         }

         this.a(this.bh, $$0, $$1);
         boolean $$5 = false;

         for (Entry<jh, dvv> $$6 : this.bh.entrySet()) {
            $$6.getValue().a(this.dV(), $$6.getKey(), this);
            this.a($$6.getValue());
            if ($$6.getValue().a(axc.aM) || $$6.getValue().a(dis.H)) {
               $$5 = true;
            }
         }

         this.bh.clear();
         if (!$$5) {
            if (this.aG <= 0) {
               this.h(-this.dn());
            }

            if ($$2 && (this.av || this.bl())) {
               this.aM();
            }
         }

         if (this.bY() && (this.av || this.bl())) {
            this.h(-this.dn());
         }
      }
   }

   protected boolean aL() {
      return !this.dQ() && !this.ad;
   }

   private boolean c(dvv $$0) {
      return $$0.a(axc.aR) || $$0.a(dis.qP);
   }

   private boolean a(jh $$0, dvv $$1, boolean $$2, boolean $$3, ezy $$4) {
      if ($$1.l()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aJ() || $$5 || this.ci() && $$4.e == 0.0 || this.cq()) && !this.ck()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dV().a(ear.P, this.dt(), ear.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(ezy $$0) {
      return false;
   }

   protected void aM() {
      this.a(awn.kg, 0.7F, 1.6F + (this.ae.i() - this.ae.i()) * 0.4F);
   }

   public void aN() {
      if (!this.dV().C && this.bY()) {
         this.aM();
      }

      this.aH();
   }

   protected void aO() {
      if (this.ba()) {
         this.aZ();
         if (this.bg().b()) {
            this.a(ear.x);
         }
      }
   }

   @Deprecated
   public jh aP() {
      return this.e(0.2F);
   }

   public jh aQ() {
      return this.e(0.500001F);
   }

   public jh aR() {
      return this.e(1.0E-5F);
   }

   protected jh e(float $$0) {
      if (this.ax.isPresent()) {
         jh $$1 = this.ax.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dvv $$2 = this.dV().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(axc.T)) && !$$2.a(axc.M) && !($$2.b() instanceof dlo) ? $$1.h(azm.a(this.t.e - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = azm.a(this.t.d);
         int $$4 = azm.a(this.t.e - (double)$$0);
         int $$5 = azm.a(this.t.f);
         return new jh($$3, $$4, $$5);
      }
   }

   protected float aS() {
      float $$0 = this.dV().a_(this.dv()).b().k();
      float $$1 = this.dV().a_(this.aQ()).b().k();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aT() {
      dvv $$0 = this.dV().a_(this.dv());
      float $$1 = $$0.b().h();
      if (!$$0.a(dis.G) && !$$0.a(dis.nd)) {
         return (double)$$1 == 1.0 ? this.dV().a_(this.aQ()).b().h() : $$1;
      } else {
         return $$1;
      }
   }

   protected ezy a(ezy $$0, bvl $$1) {
      return $$0;
   }

   protected ezy d(ezy $$0) {
      if ($$0.h() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dV().ab();
         if ($$1 != this.aZ) {
            Arrays.fill(this.aY, 0.0);
            this.aZ = $$1;
         }

         if ($$0.d != 0.0) {
            double $$2 = this.a(jm.a.a, $$0.d);
            return Math.abs($$2) <= 1.0E-5F ? ezy.c : new ezy($$2, 0.0, 0.0);
         } else if ($$0.e != 0.0) {
            double $$3 = this.a(jm.a.b, $$0.e);
            return Math.abs($$3) <= 1.0E-5F ? ezy.c : new ezy(0.0, $$3, 0.0);
         } else if ($$0.f != 0.0) {
            double $$4 = this.a(jm.a.c, $$0.f);
            return Math.abs($$4) <= 1.0E-5F ? ezy.c : new ezy(0.0, 0.0, $$4);
         } else {
            return ezy.c;
         }
      }
   }

   private double a(jm.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = azm.a($$1 + this.aY[$$2], -0.51, 0.51);
      $$1 = $$3 - this.aY[$$2];
      this.aY[$$2] = $$3;
      return $$1;
   }

   private ezy a(ezy $$0) {
      ezt $$1 = this.cR();
      List<fas> $$2 = this.dV().c(this, $$1.b($$0));
      ezy $$3 = $$0.h() == 0.0 ? $$0 : a(this, $$0, $$1, this.dV(), $$2);
      boolean $$4 = $$0.d != $$3.d;
      boolean $$5 = $$0.e != $$3.e;
      boolean $$6 = $$0.f != $$3.f;
      boolean $$7 = $$5 && $$0.e < 0.0;
      if (this.dP() > 0.0F && ($$7 || this.aJ()) && ($$4 || $$6)) {
         ezt $$8 = $$7 ? $$1.d(0.0, $$3.e, 0.0) : $$1;
         ezt $$9 = $$8.b($$0.d, (double)this.dP(), $$0.f);
         if (!$$7) {
            $$9 = $$9.b(0.0, -1.0E-5F, 0.0);
         }

         List<fas> $$10 = a(this, this.s, $$2, $$9);
         float $$11 = (float)$$3.e;
         float[] $$12 = a($$8, $$10, this.dP(), $$11);

         for (float $$13 : $$12) {
            ezy $$14 = a(new ezy($$0.d, (double)$$13, $$0.f), $$8, $$10);
            if ($$14.j() > $$3.j()) {
               double $$15 = $$1.b - $$8.b;
               return $$14.b(0.0, -$$15, 0.0);
            }
         }
      }

      return $$3;
   }

   private static float[] a(ezt $$0, List<fas> $$1, float $$2, float $$3) {
      FloatSet $$4 = new FloatArraySet(4);

      for (fas $$5 : $$1) {
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

   public static ezy a(@Nullable bul $$0, ezy $$1, ezt $$2, dfm $$3, List<fas> $$4) {
      List<fas> $$5 = a($$0, $$3, $$4, $$2.b($$1));
      return a($$1, $$2, $$5);
   }

   private static List<fas> a(@Nullable bul $$0, dfm $$1, List<fas> $$2, ezt $$3) {
      Builder<fas> $$4 = ImmutableList.builderWithExpectedSize($$2.size() + 1);
      if (!$$2.isEmpty()) {
         $$4.addAll($$2);
      }

      dxl $$5 = $$1.E_();
      boolean $$6 = $$0 != null && $$5.a($$0, $$3);
      if ($$6) {
         $$4.add($$5.c());
      }

      $$4.addAll($$1.e($$0, $$3));
      return $$4.build();
   }

   private static ezy a(ezy $$0, ezt $$1, List<fas> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.d;
         double $$4 = $$0.e;
         double $$5 = $$0.f;
         if ($$4 != 0.0) {
            $$4 = fap.a(jm.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = fap.a(jm.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = fap.a(jm.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = fap.a(jm.a.c, $$1, $$2, $$5);
         }

         return new ezy($$3, $$4, $$5);
      }
   }

   protected float aU() {
      return (float)((int)this.X + 1);
   }

   protected awm aV() {
      return awn.kk;
   }

   protected awm aW() {
      return awn.kj;
   }

   protected awm aX() {
      return awn.kj;
   }

   public void b(ezy $$0, ezy $$1) {
      this.a(this.bh, $$0, $$1);
   }

   private void a(Map<jh, dvv> $$0, ezy $$1, ezy $$2) {
      ezt $$3 = this.cR().h(1.0E-5F);

      for (jh $$4 : der.a($$1, $$2, $$3)) {
         if (!this.bL()) {
            return;
         }

         dvv $$5 = this.dV().a_($$4);
         if (!$$5.l() && !$$0.containsKey($$4)) {
            try {
               fas $$6 = $$5.b(this.dV(), $$4);
               if ($$6 == fap.b() || this.a($$1, $$2, $$4, $$6)) {
                  $$0.put($$4.j(), $$5);
               }
            } catch (Throwable var12) {
               o $$8 = o.a(var12, "Colliding entity with block");
               p $$9 = $$8.a("Block being collided with");
               p.a($$9, this.dV(), $$4, $$5);
               p $$10 = $$8.a("Entity being checked for collision");
               this.a($$10);
               throw new z($$8);
            }
         }
      }
   }

   private boolean a(ezy $$0, ezy $$1, jh $$2, fas $$3) {
      ezt $$4 = this.cR().c(this.cR().f().c(-1.0)).c($$1);
      ezy $$5 = $$0.d($$4.g());
      return this.cR().a($$5, $$3.a(new ezy($$2)).e());
   }

   protected void a(dvv $$0) {
   }

   public jh a(arp $$0, jh $$1) {
      jh $$2 = $$0.X();
      ezy $$3 = $$2.b();
      int $$4 = $$0.m($$2).a(ebq.a.f, $$2.u(), $$2.w()) + 1;
      return jh.a($$3.d, (double)$$4, $$3.f);
   }

   public void a(jq<ear> $$0, @Nullable bul $$1) {
      this.dV().a($$1, $$0, this.t);
   }

   public void a(jq<ear> $$0) {
      this.a($$0, this);
   }

   private void c(jh $$0, dvv $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.l();
      }
   }

   protected void aY() {
      bul $$0 = Objects.requireNonNullElse(this.cX(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      ezy $$2 = $$0.dy();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      this.f($$3);
   }

   protected jh e(jh $$0) {
      jh $$1 = $$0.d();
      dvv $$2 = this.dV().a_($$1);
      return !$$2.a(axc.bo) && !$$2.a(axc.bp) ? $$0 : $$1;
   }

   protected void a(dvv $$0, dvv $$1) {
      dqd $$2 = $$0.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dvv $$0) {
      dqd $$1 = $$0.A();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(jh $$0, dvv $$1) {
      dqd $$2 = $$1.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dvv $$0) {
      return $$0.a(axc.bn) && this.af >= this.be + 20;
   }

   private void l() {
      this.bd = this.bd * (float)Math.pow(0.997, (double)(this.af - this.be));
      this.bd = Math.min(1.0F, this.bd + 0.07F);
      float $$0 = 0.5F + this.bd * this.ae.i() * 1.2F;
      float $$1 = 0.1F + this.bd * 1.2F;
      this.a(awn.E, $$1, $$0);
      this.be = this.af;
   }

   protected void f(float $$0) {
      this.a(this.aV(), $$0, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
   }

   protected void aZ() {
   }

   protected boolean ba() {
      return false;
   }

   public void a(awm $$0, float $$1, float $$2) {
      if (!this.bb()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), $$0, this.dm(), $$1, $$2);
      }
   }

   public void a(awm $$0) {
      if (!this.bb()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean bb() {
      return this.al.a(aP);
   }

   public void e(boolean $$0) {
      this.al.a(aP, $$0);
   }

   public boolean bc() {
      return this.al.a(aQ);
   }

   public void f(boolean $$0) {
      this.al.a(aQ, $$0);
   }

   protected double bd() {
      return 0.0;
   }

   public final double be() {
      return this.bc() ? 0.0 : this.bd();
   }

   protected void bf() {
      double $$0 = this.be();
      if ($$0 != 0.0) {
         this.h(this.dy().b(0.0, -$$0, 0.0));
      }
   }

   protected bul.b bg() {
      return bul.b.d;
   }

   public boolean bh() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dvv $$2, jh $$3) {
      if ($$1) {
         if (this.Z > 0.0F) {
            $$2.b().a(this.dV(), $$2, $$3, this, this.Z);
            this.dV().a(ear.A, this.t, ear.a.a(this, this.ax.<dvv>map($$0x -> this.dV().a_($$0x)).orElse($$2)));
         }

         this.k();
      } else if ($$0 < 0.0) {
         this.Z -= (float)$$0;
      }
   }

   public boolean bi() {
      return this.aq().d();
   }

   public boolean a(float $$0, float $$1, btb $$2) {
      if (this.o.a(axg.o)) {
         return false;
      } else {
         if (this.ca()) {
            for (bul $$3 : this.cZ()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean bj() {
      return this.ag;
   }

   private boolean n() {
      jh $$0 = this.dv();
      return this.dV().r($$0) || this.dV().r(jh.a((double)$$0.u(), this.cR().e, (double)$$0.w()));
   }

   private boolean s() {
      return this.dw().a(dis.nd);
   }

   public boolean bk() {
      return this.bj() || this.n();
   }

   public boolean bl() {
      return this.bj() || this.n() || this.s();
   }

   public boolean bm() {
      return this.bj() || this.s();
   }

   public boolean bn() {
      return this.bm() || this.bx();
   }

   public boolean bo() {
      return this.ai && this.bj();
   }

   public void bp() {
      if (this.ck()) {
         this.i(this.cj() && this.bj() && !this.bZ());
      } else {
         this.i(this.cj() && this.bo() && !this.bZ() && this.dV().b_(this.u).a(axi.a));
      }
   }

   protected boolean bq() {
      this.ah.clear();
      this.br();
      double $$0 = this.dV().F_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(axi.b, $$0);
      return this.bj() || $$1;
   }

   void br() {
      if (this.dk() instanceof cqr $$0 && !$$0.bo()) {
         this.ag = false;
         return;
      }

      if (this.a(axi.a, 0.014)) {
         if (!this.ag && !this.ak) {
            this.bs();
         }

         this.k();
         this.ag = true;
         this.aH();
      } else {
         this.ag = false;
      }
   }

   private void t() {
      this.ai = this.a(axi.a);
      this.aH.clear();
      double $$0 = this.dE();
      if (this.dk() instanceof cqr $$2 && !$$2.bo() && $$2.cR().e >= $$0 && $$2.cR().b <= $$0) {
         return;
      }

      jh $$3 = jh.a(this.dA(), $$0, this.dG());
      erv $$4 = this.dV().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a(this.dV(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aH::add);
      }
   }

   protected void bs() {
      bul $$0 = Objects.requireNonNullElse(this.cX(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      ezy $$2 = $$0.dy();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aW(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      } else {
         this.a(this.aX(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      }

      float $$4 = (float)azm.a(this.dC());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.ba.a() * 20.0F; $$5++) {
         double $$6 = (this.ae.j() * 2.0 - 1.0) * (double)this.ba.a();
         double $$7 = (this.ae.j() * 2.0 - 1.0) * (double)this.ba.a();
         this.dV().a(ls.d, this.dA() + $$6, (double)($$4 + 1.0F), this.dG() + $$7, $$2.d, $$2.e - this.ae.j() * 0.2F, $$2.f);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.ba.a() * 20.0F; $$8++) {
         double $$9 = (this.ae.j() * 2.0 - 1.0) * (double)this.ba.a();
         double $$10 = (this.ae.j() * 2.0 - 1.0) * (double)this.ba.a();
         this.dV().a(ls.am, this.dA() + $$9, (double)($$4 + 1.0F), this.dG() + $$10, $$2.d, $$2.e, $$2.f);
      }

      this.a(ear.O);
   }

   @Deprecated
   protected dvv bt() {
      return this.dV().a_(this.aP());
   }

   public dvv bu() {
      return this.dV().a_(this.aR());
   }

   public boolean bv() {
      return this.cj() && !this.bj() && !this.Y_() && !this.ci() && !this.bx() && this.bL();
   }

   protected void bw() {
      jh $$0 = this.aP();
      dvv $$1 = this.dV().a_($$0);
      if ($$1.o() != dow.a) {
         ezy $$2 = this.dy();
         jh $$3 = this.dv();
         double $$4 = this.dA() + (this.ae.j() - 0.5) * (double)this.ba.a();
         double $$5 = this.dG() + (this.ae.j() - 0.5) * (double)this.ba.a();
         if ($$3.u() != $$0.u()) {
            $$4 = azm.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = azm.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dV().a(new lk(ls.b, $$1), $$4, this.dC() + 0.1, $$5, $$2.d * -4.0, 1.5, $$2.f * -4.0);
      }
   }

   public boolean a(axs<eru> $$0) {
      return this.aH.contains($$0);
   }

   public boolean bx() {
      return !this.ak && this.ah.getDouble(axi.b) > 0.0;
   }

   public void a(float $$0, ezy $$1) {
      ezy $$2 = a($$1, $$0, this.dL());
      this.h(this.dy().e($$2));
   }

   protected static ezy a(ezy $$0, float $$1, float $$2) {
      double $$3 = $$0.h();
      if ($$3 < 1.0E-7) {
         return ezy.c;
      } else {
         ezy $$4 = ($$3 > 1.0 ? $$0.d() : $$0).c((double)$$1);
         float $$5 = azm.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = azm.b($$2 * (float) (Math.PI / 180.0));
         return new ezy($$4.d * (double)$$6 - $$4.f * (double)$$5, $$4.e, $$4.f * (double)$$6 + $$4.d * (double)$$5);
      }
   }

   @Deprecated
   public float by() {
      return this.dV().f(this.dz(), this.dF()) ? this.dV().x(jh.a(this.dA(), this.dE(), this.dG())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.b($$3, $$4);
   }

   public void b(float $$0, float $$1) {
      this.v($$0 % 360.0F);
      this.w(azm.a($$1, -90.0F, 90.0F) % 360.0F);
      this.N = this.dL();
      this.O = this.dN();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = azm.a($$0, -3.0E7, 3.0E7);
      double $$4 = azm.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(ezy $$0) {
      this.e($$0.d, $$0.e, $$0.f);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dL(), this.dN());
   }

   public void a(jh $$0, float $$1, float $$2) {
      this.b($$0.c(), $$1, $$2);
   }

   public void b(ezy $$0, float $$1, float $$2) {
      this.b($$0.d, $$0.e, $$0.f, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.o($$0, $$1, $$2);
      this.v($$3);
      this.w($$4);
      this.bz();
      this.ay();
   }

   public final void bz() {
      this.bA();
      this.bB();
   }

   public final void c(ezy $$0, float $$1, float $$2) {
      this.j($$0);
      this.e($$1, $$2);
   }

   protected void bA() {
      this.j(this.t);
   }

   protected void bB() {
      this.e(this.dL(), this.dN());
   }

   private void j(ezy $$0) {
      this.K = this.aa = $$0.d;
      this.L = this.ab = $$0.e;
      this.M = this.ac = $$0.f;
   }

   private void e(float $$0, float $$1) {
      this.N = $$0;
      this.O = $$1;
   }

   public final ezy bC() {
      return new ezy(this.aa, this.ab, this.ac);
   }

   public float f(bul $$0) {
      float $$1 = (float)(this.dA() - $$0.dA());
      float $$2 = (float)(this.dC() - $$0.dC());
      float $$3 = (float)(this.dG() - $$0.dG());
      return azm.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dA() - $$0;
      double $$4 = this.dC() - $$1;
      double $$5 = this.dG() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(bul $$0) {
      return this.f($$0.dt());
   }

   public double f(ezy $$0) {
      double $$1 = this.dA() - $$0.d;
      double $$2 = this.dC() - $$0.e;
      double $$3 = this.dG() - $$0.f;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void a_(cou $$0) {
   }

   public void h(bul $$0) {
      if (!this.z($$0)) {
         if (!$$0.ad && !this.ad) {
            double $$1 = $$0.dA() - this.dA();
            double $$2 = $$0.dG() - this.dG();
            double $$3 = azm.a($$1, $$2);
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
               if (!this.ca() && this.bI()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.ca() && $$0.bI()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void g(ezy $$0) {
      this.j($$0.d, $$0.e, $$0.f);
   }

   public void j(double $$0, double $$1, double $$2) {
      this.h(this.dy().b($$0, $$1, $$2));
      this.ar = true;
   }

   protected void bD() {
      this.T = true;
   }

   @Deprecated
   public final void a(btb $$0, float $$1) {
      if (this.s instanceof arp $$2) {
         this.a($$2, $$0, $$1);
      }
   }

   @Deprecated
   public final boolean b(btb $$0, float $$1) {
      return this.s instanceof arp $$2 ? this.a($$2, $$0, $$1) : this.b($$0);
   }

   public abstract boolean a(arp var1, btb var2, float var3);

   public boolean b(btb $$0) {
      return false;
   }

   public final ezy g(float $$0) {
      return this.c(this.h($$0), this.i($$0));
   }

   public jm bE() {
      return jm.a(this.g(1.0F));
   }

   public float h(float $$0) {
      return this.j($$0);
   }

   public float i(float $$0) {
      return this.k($$0);
   }

   public float j(float $$0) {
      return $$0 == 1.0F ? this.dN() : azm.h($$0, this.O, this.dN());
   }

   public float k(float $$0) {
      return $$0 == 1.0F ? this.dL() : azm.i($$0, this.N, this.dL());
   }

   public final ezy c(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = azm.b($$3);
      float $$5 = azm.a($$3);
      float $$6 = azm.b($$2);
      float $$7 = azm.a($$2);
      return new ezy((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final ezy l(float $$0) {
      return this.d(this.h($$0), this.i($$0));
   }

   protected final ezy d(float $$0, float $$1) {
      return this.c($$0 - 90.0F, $$1);
   }

   public final ezy bF() {
      return new ezy(this.dA(), this.dE(), this.dG());
   }

   public final ezy m(float $$0) {
      double $$1 = azm.d((double)$$0, this.K, this.dA());
      double $$2 = azm.d((double)$$0, this.L, this.dC()) + (double)this.cS();
      double $$3 = azm.d((double)$$0, this.M, this.dG());
      return new ezy($$1, $$2, $$3);
   }

   public ezy n(float $$0) {
      return this.m($$0);
   }

   public final ezy o(float $$0) {
      double $$1 = azm.d((double)$$0, this.K, this.dA());
      double $$2 = azm.d((double)$$0, this.L, this.dC());
      double $$3 = azm.d((double)$$0, this.M, this.dG());
      return new ezy($$1, $$2, $$3);
   }

   public ezw a(double $$0, float $$1, boolean $$2) {
      ezy $$3 = this.m($$1);
      ezy $$4 = this.g($$1);
      ezy $$5 = $$3.b($$4.d * $$0, $$4.e * $$0, $$4.f * $$0);
      return this.dV().a(new deu($$3, $$5, deu.a.b, $$2 ? deu.b.c : deu.b.a, this));
   }

   public boolean bG() {
      return this.bL() && this.bH();
   }

   public boolean bH() {
      return false;
   }

   public boolean bI() {
      return false;
   }

   public void a(bul $$0, int $$1, btb $$2) {
      if ($$0 instanceof arq) {
         ao.d.a((arq)$$0, this, $$2);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.dA() - $$0;
      double $$4 = this.dC() - $$1;
      double $$5 = this.dG() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cR().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * n;
      return $$0 < $$1 * $$1;
   }

   public boolean d(ul $$0) {
      if (this.aE != null && !this.aE.b()) {
         return false;
      } else {
         String $$1 = this.bK();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.f($$0);
            return true;
         }
      }
   }

   public boolean e(ul $$0) {
      return this.bZ() ? false : this.d($$0);
   }

   public ul f(ul $$0) {
      try {
         if (this.r != null) {
            $$0.a("Pos", this.a(this.r.dA(), this.dC(), this.r.dG()));
         } else {
            $$0.a("Pos", this.a(this.dA(), this.dC(), this.dG()));
         }

         ezy $$1 = this.dy();
         $$0.a("Motion", this.a($$1.d, $$1.e, $$1.f));
         $$0.a("Rotation", this.a(this.dL(), this.dN()));
         $$0.a("FallDistance", this.Z);
         $$0.a("Fire", (short)this.aG);
         $$0.a("Air", (short)this.ct());
         $$0.a("OnGround", this.aJ());
         $$0.a("Invulnerable", this.aV);
         $$0.a("PortalCooldown", this.aU);
         $$0.a("UUID", this.cG());
         xj $$2 = this.an();
         if ($$2 != null) {
            $$0.a("CustomName", xj.a.a($$2, this.dX()));
         }

         if (this.cL()) {
            $$0.a("CustomNameVisible", this.cL());
         }

         if (this.bb()) {
            $$0.a("Silent", this.bb());
         }

         if (this.bc()) {
            $$0.a("NoGravity", this.bc());
         }

         if (this.aW) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.cu();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.cu());
         }

         if (this.bf) {
            $$0.a("HasVisualFire", this.bf);
         }

         if (!this.aX.isEmpty()) {
            ur $$4 = new ur();

            for (String $$5 : this.aX) {
               $$4.add(vg.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.ca()) {
            ur $$6 = new ur();

            for (bul $$7 : this.cZ()) {
               ul $$8 = new ul();
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

   public void g(ul $$0) {
      try {
         ur $$1 = $$0.c("Pos", 6);
         ur $$2 = $$0.c("Motion", 6);
         ur $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.n(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         this.ar = true;
         double $$7 = 3.0000512E7;
         this.o(azm.a($$1.h(0), -3.0000512E7, 3.0000512E7), azm.a($$1.h(1), -2.0E7, 2.0E7), azm.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.v($$3.i(0));
         this.w($$3.i(1));
         this.bz();
         this.q(this.dL());
         this.r(this.dL());
         this.Z = $$0.j("FallDistance");
         this.aG = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.j($$0.g("Air"));
         }

         this.aD = $$0.q("OnGround");
         this.aV = $$0.q("Invulnerable");
         this.aU = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.at = $$0.a("UUID");
            this.au = this.at.toString();
         }

         if (!Double.isFinite(this.dA()) || !Double.isFinite(this.dC()) || !Double.isFinite(this.dG())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dL()) && Double.isFinite((double)this.dN())) {
            this.ay();
            this.a(this.dL(), this.dN());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(xj.a.a($$8, this.dX()));
               } catch (Exception var16) {
                  b.warn("Failed to parse entity custom name {}", $$8, var16);
               }
            }

            this.p($$0.q("CustomNameVisible"));
            this.e($$0.q("Silent"));
            this.f($$0.q("NoGravity"));
            this.j($$0.q("Glowing"));
            this.k($$0.h("TicksFrozen"));
            this.bf = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.aX.clear();
               ur $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.aX.add($$10.j($$12));
               }
            }

            this.a($$0);
            if (this.bJ()) {
               this.ay();
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

   protected boolean bJ() {
      return true;
   }

   @Nullable
   protected final String bK() {
      bus<?> $$0 = this.aq();
      alj $$1 = bus.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(ul var1);

   protected abstract void b(ul var1);

   protected ur a(double... $$0) {
      ur $$1 = new ur();

      for (double $$2 : $$0) {
         $$1.add(um.a($$2));
      }

      return $$1;
   }

   protected ur a(float... $$0) {
      ur $$1 = new ur();

      for (float $$2 : $$0) {
         $$1.add(uo.a($$2));
      }

      return $$1;
   }

   @Nullable
   public clc a(arp $$0, dfl $$1) {
      return this.a($$0, $$1, 0);
   }

   @Nullable
   public clc a(arp $$0, dfl $$1, int $$2) {
      return this.a($$0, new cwm($$1), (float)$$2);
   }

   @Nullable
   public clc a(arp $$0, cwm $$1) {
      return this.a($$0, $$1, 0.0F);
   }

   @Nullable
   public clc a(arp $$0, cwm $$1, float $$2) {
      if ($$1.f()) {
         return null;
      } else {
         clc $$3 = new clc($$0, this.dA(), this.dC() + (double)$$2, this.dG(), $$1);
         $$3.n();
         $$0.b($$3);
         return $$3;
      }
   }

   public boolean bL() {
      return !this.dQ();
   }

   public boolean bM() {
      if (this.ad) {
         return false;
      } else {
         float $$0 = this.ba.a() * 0.8F;
         ezt $$1 = ezt.a(this.bF(), (double)$$0, 1.0E-6, (double)$$0);
         return jh.b($$1)
            .anyMatch(
               $$1x -> {
                  dvv $$2 = this.dV().a_($$1x);
                  return !$$2.l()
                     && $$2.j(this.dV(), $$1x)
                     && fap.c($$2.g(this.dV(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), fap.a($$1), fac.i);
               }
            );
      }
   }

   public bsk a(cou $$0, bsj $$1) {
      if (this.bL() && this instanceof bvf $$2) {
         if ($$2.A() == $$0) {
            if (!this.dV().A_()) {
               $$2.a(true, !$$0.fT());
               this.a(ear.r, $$0);
            }

            return bsk.a;
         }

         cwm $$3 = $$0.b($$1);
         if ($$3.a(cwq.vc) && $$2.x()) {
            if (!this.dV().A_()) {
               $$2.b($$0, true);
            }

            $$3.h(1);
            return bsk.a;
         }
      }

      return bsk.e;
   }

   public boolean i(bul $$0) {
      return $$0.bN() && !this.z($$0);
   }

   public boolean bN() {
      return false;
   }

   public void r() {
      this.h(ezy.c);
      this.h();
      if (this.bZ()) {
         this.dk().j(this);
      }
   }

   public final void j(bul $$0) {
      if (this.y($$0)) {
         this.a($$0, bul::a_);
      }
   }

   protected void a(bul $$0, bul.a $$1) {
      ezy $$2 = this.m($$0);
      ezy $$3 = $$0.l(this);
      $$1.accept($$0, $$2.d - $$3.d, $$2.e - $$3.e, $$2.f - $$3.f);
   }

   public void k(bul $$0) {
   }

   public ezy l(bul $$0) {
      return this.ds().b(bum.b, 0, this.aA);
   }

   public ezy m(bul $$0) {
      return this.dt().e(this.a($$0, this.ba, 1.0F));
   }

   protected ezy a(bul $$0, buo $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static ezy a(bul $$0, bul $$1, bun $$2) {
      int $$3 = $$0.cZ().indexOf($$1);
      return $$2.c(bum.a, $$3, $$0.aA);
   }

   public boolean n(bul $$0) {
      return this.a($$0, false);
   }

   public boolean bO() {
      return this instanceof bvh;
   }

   public boolean a(bul $$0, boolean $$1) {
      if ($$0 == this.r) {
         return false;
      } else if (!$$0.bR()) {
         return false;
      } else {
         for (bul $$2 = $$0; $$2.r != null; $$2 = $$2.r) {
            if ($$2.r == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bZ()) {
               this.ae();
            }

            this.b(bvt.a);
            this.r = $$0;
            this.r.p(this);
            $$0.E().filter($$0x -> $$0x instanceof arq).forEach($$0x -> ao.U.a((arq)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bul $$0) {
      return !this.cd() && this.J <= 0;
   }

   public void bP() {
      for (int $$0 = this.q.size() - 1; $$0 >= 0; $$0--) {
         ((bul)this.q.get($$0)).ae();
      }
   }

   public void bQ() {
      if (this.r != null) {
         bul $$0 = this.r;
         this.r = null;
         $$0.q(this);
      }
   }

   public void ae() {
      this.bQ();
   }

   protected void p(bul $$0) {
      if ($$0.dk() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.q.isEmpty()) {
            this.q = ImmutableList.of($$0);
         } else {
            List<bul> $$1 = Lists.newArrayList(this.q);
            if (!this.dV().C && $$0 instanceof cou && !(this.da() instanceof cou)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.q = ImmutableList.copyOf($$1);
         }

         this.a(ear.s, $$0);
      }
   }

   protected void q(bul $$0) {
      if ($$0.dk() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.q.size() == 1 && this.q.get(0) == $$0) {
            this.q = ImmutableList.of();
         } else {
            this.q = this.q.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(ear.q, $$0);
      }
   }

   protected boolean r(bul $$0) {
      return this.q.isEmpty();
   }

   protected boolean bR() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public double f_() {
      return this.dA();
   }

   public double P_() {
      return this.dC();
   }

   public double Q_() {
      return this.dG();
   }

   public float g_() {
      return this.dN();
   }

   public float q_() {
      return this.dL();
   }

   public void a(float $$0, int $$1) {
      this.q($$0);
   }

   public float bS() {
      return 0.0F;
   }

   public ezy bT() {
      return this.c(this.dN(), this.dL());
   }

   public ezy a(cwi $$0) {
      if (!(this instanceof cou $$1)) {
         return ezy.c;
      } else {
         boolean $$2 = $$1.eY().a($$0) && !$$1.eX().a($$0);
         bvb $$3 = $$2 ? $$1.fw().e() : $$1.fw();
         return this.c(0.0F, this.dL() + (float)($$3 == bvb.b ? 80 : -80)).c(0.5);
      }
   }

   public ezx bU() {
      return new ezx(this.dN(), this.dL());
   }

   public ezy bV() {
      return ezy.a(this.bU());
   }

   public void a(doi $$0, jh $$1) {
      if (this.aD()) {
         this.aB();
      } else {
         if (this.as == null || !this.as.a($$0)) {
            this.as = new bvs($$0, $$1.j());
         } else if (!this.as.e()) {
            this.as.a($$1.j());
            this.as.a(true);
         }
      }
   }

   protected void bW() {
      if (this.dV() instanceof arp $$0) {
         this.M();
         if (this.as != null) {
            if (this.as.a($$0, this, this.o(false))) {
               bou $$2 = bot.a();
               $$2.a("portal");
               this.aB();
               est $$3 = this.as.a($$0, this);
               if ($$3 != null) {
                  arp $$4 = $$3.a();
                  if ($$0.p().a((dfm)$$4) && ($$4.ag() == $$0.ag() || this.a($$0, $$4))) {
                     this.b($$3);
                  }
               }

               $$2.c();
            } else if (this.as.b()) {
               this.as = null;
            }
         }
      }
   }

   public int bX() {
      bul $$0 = this.da();
      return $$0 instanceof arq ? $$0.bX() : 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
   }

   public void c(btb $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dmj.a(this);
      }
   }

   public void p(float $$0) {
   }

   public boolean bY() {
      boolean $$0 = this.dV() != null && this.dV().C;
      return !this.bi() && (this.aG > 0 || $$0 && this.i(0));
   }

   public boolean bZ() {
      return this.dk() != null;
   }

   public boolean ca() {
      return !this.q.isEmpty();
   }

   public boolean cb() {
      return this.aq().a(axg.p);
   }

   public boolean cc() {
      return !this.aq().a(axg.q);
   }

   public void g(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean cd() {
      return this.i(1);
   }

   public boolean ce() {
      return this.cd();
   }

   public boolean cf() {
      return this.cd();
   }

   public boolean cg() {
      return this.cd();
   }

   public boolean ch() {
      return this.cd();
   }

   public boolean ci() {
      return this.c(bvt.f);
   }

   public boolean cj() {
      return this.i(3);
   }

   public void h(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean ck() {
      return this.i(4);
   }

   public boolean cl() {
      return this.c(bvt.d);
   }

   public boolean cm() {
      return this.cl() && !this.bj();
   }

   public void i(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cn() {
      return this.aW;
   }

   public final void j(boolean $$0) {
      this.aW = $$0;
      this.b(6, this.co());
   }

   public boolean co() {
      return this.dV().A_() ? this.i(6) : this.aW;
   }

   public boolean cp() {
      return this.i(5);
   }

   public boolean d(cou $$0) {
      if ($$0.Y_()) {
         return false;
      } else {
         fbf $$1 = this.cr();
         return $$1 != null && $$0 != null && $$0.cr() == $$1 && $$1.i() ? false : this.cp();
      }
   }

   public boolean cq() {
      return false;
   }

   public void a(BiConsumer<eao<?>, arp> $$0) {
   }

   @Nullable
   public fay cr() {
      return this.dV().P().e(this.cI());
   }

   public final boolean s(@Nullable bul $$0) {
      return $$0 == null ? false : this == $$0 || this.t($$0) || $$0.t(this);
   }

   protected boolean t(bul $$0) {
      return this.a($$0.cr());
   }

   public boolean a(@Nullable fbf $$0) {
      return this.cr() != null ? this.cr().a($$0) : false;
   }

   public void k(boolean $$0) {
      this.b(5, $$0);
   }

   protected boolean i(int $$0) {
      return (this.al.a(am) & 1 << $$0) != 0;
   }

   protected void b(int $$0, boolean $$1) {
      byte $$2 = this.al.a(am);
      if ($$1) {
         this.al.a(am, (byte)($$2 | 1 << $$0));
      } else {
         this.al.a(am, (byte)($$2 & ~(1 << $$0)));
      }
   }

   public int cs() {
      return 300;
   }

   public int ct() {
      return this.al.a(aM);
   }

   public void j(int $$0) {
      this.al.a(aM, $$0);
   }

   public int cu() {
      return this.al.a(aR);
   }

   public void k(int $$0) {
      this.al.a(aR, $$0);
   }

   public float cv() {
      int $$0 = this.cx();
      return (float)Math.min(this.cu(), $$0) / (float)$$0;
   }

   public boolean cw() {
      return this.cu() >= this.cx();
   }

   public int cx() {
      return 140;
   }

   public void a(arp $$0, bvg $$1) {
      this.h(this.aG + 1);
      if (this.aG == 0) {
         this.d(8.0F);
      }

      this.a($$0, this.dW().c(), 5.0F);
   }

   public void l(boolean $$0) {
      ezy $$1 = this.dy();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.e - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.e + 0.1);
      }

      this.n($$1.d, $$2, $$1.f);
   }

   public void m(boolean $$0) {
      ezy $$1 = this.dy();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.e - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.e + 0.06);
      }

      this.n($$1.d, $$2, $$1.f);
      this.k();
   }

   public boolean a(arp $$0, bvh $$1) {
      return true;
   }

   public void cy() {
      if (this.dy().b() > -0.5 && this.Z > 1.0F) {
         this.Z = 1.0F;
      }
   }

   public void k() {
      this.Z = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      jh $$3 = jh.a($$0, $$1, $$2);
      ezy $$4 = new ezy($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      jh.a $$5 = new jh.a();
      jm $$6 = jm.b;
      double $$7 = Double.MAX_VALUE;

      for (jm $$8 : new jm[]{jm.c, jm.d, jm.e, jm.f, jm.b}) {
         $$5.a($$3, $$8);
         if (!this.dV().a_($$5).m(this.dV(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == jm.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ae.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      ezy $$13 = this.dy().c(0.75);
      if ($$6.o() == jm.a.a) {
         this.n((double)($$12 * $$11), $$13.e, $$13.f);
      } else if ($$6.o() == jm.a.b) {
         this.n($$13.d, (double)($$12 * $$11), $$13.f);
      } else if ($$6.o() == jm.a.c) {
         this.n($$13.d, $$13.e, (double)($$12 * $$11));
      }
   }

   public void a(dvv $$0, ezy $$1) {
      this.k();
      this.U = $$1;
   }

   private static xj a(xj $$0) {
      xx $$1 = $$0.e().b($$0.a().a(null));

      for (xj $$2 : $$0.c()) {
         $$1.b(a($$2));
      }

      return $$1;
   }

   @Override
   public xj al() {
      xj $$0 = this.an();
      return $$0 != null ? a($$0) : this.cz();
   }

   protected xj cz() {
      return this.o.h();
   }

   public boolean u(bul $$0) {
      return this == $$0;
   }

   public float cA() {
      return 0.0F;
   }

   public void q(float $$0) {
   }

   public void r(float $$0) {
   }

   public boolean cB() {
      return true;
   }

   public boolean v(bul $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dV() == null ? "~NULL~" : this.dV().toString();
      return this.aE != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.al().getString(),
            this.p,
            $$0,
            this.dA(),
            this.dC(),
            this.dG(),
            this.aE
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.al().getString(),
            this.p,
            $$0,
            this.dA(),
            this.dC(),
            this.dG()
         );
   }

   protected final boolean d(btb $$0) {
      return this.dQ() || this.aV && !$$0.a(axe.d) && !$$0.h() || $$0.a(axe.i) && this.bi() || $$0.a(axe.m) && this.aq().a(axg.o);
   }

   public boolean cC() {
      return this.aV;
   }

   public void n(boolean $$0) {
      this.aV = $$0;
   }

   public void w(bul $$0) {
      this.b($$0.dA(), $$0.dC(), $$0.dG(), $$0.dL(), $$0.dN());
   }

   public void x(bul $$0) {
      ul $$1 = $$0.f(new ul());
      $$1.r("Dimension");
      this.g($$1);
      this.aU = $$0.aU;
      this.as = $$0.as;
   }

   @Nullable
   public bul b(est $$0) {
      if (this.dV() instanceof arp $$1 && !this.dQ()) {
         arp $$3 = $$0.a();
         List<bul> $$4 = this.cZ();
         this.ao();
         List<bul> $$5 = new ArrayList<>();

         for (bul $$6 : $$4) {
            float $$7 = $$6.dL() - this.dL();
            float $$8 = $$6.dN() - this.dN();
            float $$9 = $$0.d() + ($$0.g().contains(bvv.d) ? 0.0F : $$7);
            float $$10 = $$0.e() + ($$0.g().contains(bvv.e) ? 0.0F : $$8);
            bul $$11 = $$6.b($$0.a($$9, $$10));
            if ($$11 != null) {
               $$5.add($$11);
            }
         }

         bou $$12 = bot.a();
         $$12.a("changeDimension");
         bul $$13 = $$3.ag() == $$1.ag() ? this : this.aq().a($$3, bur.s);
         if ($$13 != null) {
            if (this != $$13) {
               $$13.x(this);
               this.cD();
            }

            $$13.a(bvu.a($$0), $$0.g());
            if (this != $$13) {
               $$3.d($$13);
            }

            for (bul $$14 : $$5) {
               $$14.a($$13, true);
            }

            $$1.i();
            $$3.i();
            $$0.h().onTransition($$13);
         }

         $$12.c();
         return $$13;
      }

      return null;
   }

   public void a(bvu $$0, Set<bvv> $$1) {
      bvu $$2 = bvu.a(this);
      bvu $$3 = bvu.a($$2, $$0, $$1);
      this.o($$3.a().d, $$3.a().e, $$3.a().f);
      this.v($$3.c());
      this.q($$3.c());
      this.w($$3.d());
      this.ay();
      this.bz();
      this.h($$3.b());
      this.bh.clear();
   }

   public void f(jh $$0) {
      if (this.dV() instanceof arp $$1) {
         $$1.m().a(arv.e, new des($$0), 3, $$0);
      }
   }

   protected void cD() {
      this.b(bul.c.e);
      if (this instanceof bvf $$0) {
         $$0.a(true, false);
      }
   }

   public ezy a(jm.a $$0, l.a $$1) {
      return esv.a($$1, $$0, this.dt(), this.a(this.aw()));
   }

   public boolean o(boolean $$0) {
      return ($$0 || !this.bZ()) && this.bL();
   }

   public boolean a(dfm $$0, dfm $$1) {
      if ($$0.ag() == dfm.k && $$1.ag() == dfm.i) {
         for (bul $$2 : this.cZ()) {
            if ($$2 instanceof arq $$3 && !$$3.i) {
               return false;
            }
         }
      }

      return true;
   }

   public float a(dfe $$0, der $$1, jh $$2, dvv $$3, erv $$4, float $$5) {
      return $$5;
   }

   public boolean a(dfe $$0, der $$1, jh $$2, dvv $$3, float $$4) {
      return true;
   }

   public int cE() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bus.a(this.aq()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.p);
      $$0.a("Entity Name", () -> this.al().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dA(), this.dC(), this.dG()));
      $$0.a("Entity's Block location", p.a(this.dV(), azm.a(this.dA()), azm.a(this.dC()), azm.a(this.dG())));
      ezy $$1 = this.dy();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.d, $$1.e, $$1.f));
      $$0.a("Entity's Passengers", () -> this.cZ().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.dk()));
   }

   public boolean cF() {
      return this.bY() && !this.Y_();
   }

   public void a_(UUID $$0) {
      this.at = $$0;
      this.au = this.at.toString();
   }

   @Override
   public UUID cG() {
      return this.at;
   }

   public String cH() {
      return this.au;
   }

   @Override
   public String cI() {
      return this.au;
   }

   public boolean cJ() {
      return true;
   }

   public static double cK() {
      return n;
   }

   public static void b(double $$0) {
      n = $$0;
   }

   @Override
   public xj o_() {
      return fay.a(this.cr(), this.al()).a($$0 -> $$0.a(this.cQ()).a(this.cH()));
   }

   public void b(@Nullable xj $$0) {
      this.al.a(aN, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public xj an() {
      return this.al.a(aN).orElse(null);
   }

   @Override
   public boolean k_() {
      return this.al.a(aN).isPresent();
   }

   public void p(boolean $$0) {
      this.al.a(aO, $$0);
   }

   public boolean cL() {
      return this.al.a(aO);
   }

   public boolean a(arp $$0, double $$1, double $$2, double $$3, Set<bvv> $$4, float $$5, float $$6, boolean $$7) {
      float $$8 = azm.a($$6, -90.0F, 90.0F);
      bul $$9 = this.b(new est($$0, new ezy($$1, $$2, $$3), ezy.c, $$5, $$8, $$4, est.a));
      return $$9 != null;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dV() instanceof arp) {
         this.b($$0, $$1, $$2, this.dL(), this.dN());
         this.D();
      }
   }

   private void D() {
      this.db().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.q.iterator();

         while (var1.hasNext()) {
            bul $$1 = (bul)var1.next();
            $$0.a($$1, bul::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.dA() + $$0, this.dC() + $$1, this.dG() + $$2);
   }

   public boolean cM() {
      return this.cL();
   }

   @Override
   public void a(List<akq.c<?>> $$0) {
   }

   @Override
   public void a(akm<?> $$0) {
      if (aq.equals($$0)) {
         this.l_();
      }
   }

   @Deprecated
   protected void cN() {
      bvt $$0 = this.aw();
      buo $$1 = this.a($$0);
      this.ba = $$1;
      this.bb = $$1.c();
   }

   public void l_() {
      buo $$0 = this.ba;
      bvt $$1 = this.aw();
      buo $$2 = this.a($$1);
      this.ba = $$2;
      this.bb = $$2.c();
      this.ay();
      boolean $$3 = $$2.a() <= 4.0F && $$2.b() <= 4.0F;
      if (!this.s.C && !this.ak && !this.ad && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cou)) {
         this.a($$0);
      }
   }

   public boolean a(buo $$0) {
      buo $$1 = this.a(this.aw());
      ezy $$2 = this.dt().b(0.0, (double)$$0.b() / 2.0, 0.0);
      double $$3 = (double)Math.max(0.0F, $$1.a() - $$0.a()) + 1.0E-6;
      double $$4 = (double)Math.max(0.0F, $$1.b() - $$0.b()) + 1.0E-6;
      fas $$5 = fap.a(ezt.a($$2, $$3, $$4, $$3));
      Optional<ezy> $$6 = this.s.a(this, $$5, $$2, (double)$$1.a(), (double)$$1.b(), (double)$$1.a());
      if ($$6.isPresent()) {
         this.b($$6.get().b(0.0, (double)(-$$1.b()) / 2.0, 0.0));
         return true;
      } else {
         if ($$1.a() > $$0.a() && $$1.b() > $$0.b()) {
            fas $$7 = fap.a(ezt.a($$2, $$3, 1.0E-6, $$3));
            Optional<ezy> $$8 = this.s.a(this, $$7, $$2, (double)$$1.a(), (double)$$0.b(), (double)$$1.a());
            if ($$8.isPresent()) {
               this.b($$8.get().b(0.0, (double)(-$$0.b()) / 2.0 + 1.0E-6, 0.0));
               return true;
            }
         }

         return false;
      }
   }

   public jm cO() {
      return jm.a((double)this.dL());
   }

   public jm cP() {
      return this.cO();
   }

   protected xp cQ() {
      return new xp(xp.a.c, new xp.b(this.aq(), this.cG(), this.al()));
   }

   public boolean a(arq $$0) {
      return true;
   }

   @Override
   public final ezt cR() {
      return this.aC;
   }

   public final void a(ezt $$0) {
      this.aC = $$0;
   }

   public final float d(bvt $$0) {
      return this.a($$0).c();
   }

   public final float cS() {
      return this.bb;
   }

   public ezy s(float $$0) {
      return this.cT();
   }

   protected ezy cT() {
      return new ezy(0.0, (double)this.cS(), (double)(this.dq() * 0.4F));
   }

   public bvz a_(int $$0) {
      return bvz.a;
   }

   public dfm cU() {
      return this.dV();
   }

   @Nullable
   public MinecraftServer cV() {
      return this.dV().p();
   }

   public bsk a(cou $$0, ezy $$1, bsj $$2) {
      return bsk.e;
   }

   public boolean a(dfe $$0) {
      return false;
   }

   public void d(arq $$0) {
   }

   public void e(arq $$0) {
   }

   public float a(dpd $$0) {
      float $$1 = azm.h(this.dL());
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

   public float a(dnm $$0) {
      float $$1 = azm.h(this.dL());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public boolean cW() {
      return false;
   }

   public cpo a(cpn $$0) {
      return this.aq().a(axg.r) ? cpo.b : cpo.a;
   }

   @Nullable
   public bvh cX() {
      return null;
   }

   public final boolean cY() {
      return this.cX() != null;
   }

   public final List<bul> cZ() {
      return this.q;
   }

   @Nullable
   public bul da() {
      return this.q.isEmpty() ? null : (bul)this.q.get(0);
   }

   public boolean y(bul $$0) {
      return this.q.contains($$0);
   }

   public boolean a(Predicate<bul> $$0) {
      UnmodifiableIterator var2 = this.q.iterator();

      while (var2.hasNext()) {
         bul $$1 = (bul)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bul> E() {
      return this.q.stream().flatMap(bul::db);
   }

   @Override
   public Stream<bul> db() {
      return Stream.concat(Stream.of(this), this.E());
   }

   @Override
   public Stream<bul> dc() {
      return Stream.concat(this.q.stream().flatMap(bul::dc), Stream.of(this));
   }

   public Iterable<bul> dd() {
      return () -> this.E().iterator();
   }

   public int de() {
      return (int)this.E().filter($$0 -> $$0 instanceof cou).count();
   }

   public boolean df() {
      return this.de() == 1;
   }

   public bul dg() {
      bul $$0 = this;

      while ($$0.bZ()) {
         $$0 = $$0.dk();
      }

      return $$0;
   }

   public boolean z(bul $$0) {
      return this.dg() == $$0.dg();
   }

   public boolean A(bul $$0) {
      if (!$$0.bZ()) {
         return false;
      } else {
         bul $$1 = $$0.dk();
         return $$1 == this ? true : this.A($$1);
      }
   }

   public boolean dh() {
      return this instanceof cou $$0 ? $$0.c() : this.di();
   }

   public boolean di() {
      return this.cX() instanceof cou $$0 ? $$0.c() : this.dj();
   }

   public boolean dj() {
      return !this.dV().C;
   }

   protected static ezy a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -azm.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = azm.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new ezy((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public ezy b(bvh $$0) {
      return new ezy(this.dA(), this.cR().e, this.dG());
   }

   @Nullable
   public bul dk() {
      return this.r;
   }

   @Nullable
   public bul dl() {
      return this.r != null && this.r.cX() == this ? this.r : null;
   }

   public esa m_() {
      return esa.a;
   }

   public awo dm() {
      return awo.g;
   }

   protected int dn() {
      return 1;
   }

   public ew d(arp $$0) {
      return new ew(ev.a, this.dt(), this.bU(), $$0, 0, this.al().getString(), this.o_(), $$0.p(), this);
   }

   public void a(fi.a $$0, ezy $$1) {
      ezy $$2 = $$0.a(this);
      double $$3 = $$1.d - $$2.d;
      double $$4 = $$1.e - $$2.e;
      double $$5 = $$1.f - $$2.f;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.w(azm.h((float)(-(azm.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.v(azm.h((float)(azm.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.q(this.dL());
      this.O = this.dN();
      this.N = this.dL();
   }

   public float t(float $$0) {
      return azm.h($$0, this.N, this.aA);
   }

   public boolean a(axs<eru> $$0, double $$1) {
      if (this.do()) {
         return false;
      } else {
         ezt $$2 = this.cR().h(0.001);
         int $$3 = azm.a($$2.a);
         int $$4 = azm.c($$2.d);
         int $$5 = azm.a($$2.b);
         int $$6 = azm.c($$2.e);
         int $$7 = azm.a($$2.c);
         int $$8 = azm.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cJ();
         boolean $$11 = false;
         ezy $$12 = ezy.c;
         int $$13 = 0;
         jh.a $$14 = new jh.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  erv $$18 = this.dV().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a(this.dV(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           ezy $$20 = $$18.c(this.dV(), $$14);
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

            if (!(this instanceof cou)) {
               $$12 = $$12.d();
            }

            ezy $$21 = this.dy();
            $$12 = $$12.c($$1);
            double $$22 = 0.003;
            if (Math.abs($$21.d) < 0.003 && Math.abs($$21.f) < 0.003 && $$12.g() < 0.0045000000000000005) {
               $$12 = $$12.d().c(0.0045000000000000005);
            }

            this.h(this.dy().e($$12));
         }

         this.ah.put($$0, $$9);
         return $$11;
      }
   }

   public boolean do() {
      ezt $$0 = this.cR().g(1.0);
      int $$1 = azm.a($$0.a);
      int $$2 = azm.c($$0.d);
      int $$3 = azm.a($$0.c);
      int $$4 = azm.c($$0.f);
      return !this.dV().b($$1, $$3, $$2, $$4);
   }

   public double b(axs<eru> $$0) {
      return this.ah.getDouble($$0);
   }

   public double dp() {
      return (double)this.cS() < 0.4 ? 0.0 : 0.4;
   }

   public final float dq() {
      return this.ba.a();
   }

   public final float dr() {
      return this.ba.b();
   }

   public zq<acf> a(arn $$0) {
      return new acg(this, $$0);
   }

   public buo a(bvt $$0) {
      return this.o.n();
   }

   public final bun ds() {
      return this.ba.d();
   }

   public ezy dt() {
      return this.t;
   }

   public ezy du() {
      return this.dt();
   }

   @Override
   public jh dv() {
      return this.u;
   }

   public dvv dw() {
      if (this.bg == null) {
         this.bg = this.dV().a_(this.dv());
      }

      return this.bg;
   }

   public des dx() {
      return this.ay;
   }

   public ezy dy() {
      return this.az;
   }

   public void h(ezy $$0) {
      this.az = $$0;
   }

   public void i(ezy $$0) {
      this.h(this.dy().e($$0));
   }

   public void n(double $$0, double $$1, double $$2) {
      this.h(new ezy($$0, $$1, $$2));
   }

   public final int dz() {
      return this.u.u();
   }

   public final double dA() {
      return this.t.d;
   }

   public double c(double $$0) {
      return this.t.d + (double)this.dq() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ae.j() - 1.0) * $$0);
   }

   public final int dB() {
      return this.u.v();
   }

   public final double dC() {
      return this.t.e;
   }

   public double e(double $$0) {
      return this.t.e + (double)this.dr() * $$0;
   }

   public double dD() {
      return this.e(this.ae.j());
   }

   public double dE() {
      return this.t.e + (double)this.bb;
   }

   public final int dF() {
      return this.u.w();
   }

   public final double dG() {
      return this.t.f;
   }

   public double f(double $$0) {
      return this.t.f + (double)this.dq() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ae.j() - 1.0) * $$0);
   }

   public final void o(double $$0, double $$1, double $$2) {
      if (this.t.d != $$0 || this.t.e != $$1 || this.t.f != $$2) {
         this.t = new ezy($$0, $$1, $$2);
         int $$3 = azm.a($$0);
         int $$4 = azm.a($$1);
         int $$5 = azm.a($$2);
         if ($$3 != this.u.u() || $$4 != this.u.v() || $$5 != this.u.w()) {
            this.u = new jh($$3, $$4, $$5);
            this.bg = null;
            if (kj.a($$3) != this.ay.g || kj.a($$5) != this.ay.h) {
               this.ay = new des(this.u);
            }
         }

         this.aS.a();
      }
   }

   public void dH() {
   }

   public ezy u(float $$0) {
      return this.o($$0).b(0.0, (double)this.bb * 0.7, 0.0);
   }

   public void a(acg $$0) {
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
   public cwm dI() {
      return null;
   }

   public void q(boolean $$0) {
      this.av = $$0;
   }

   public boolean dJ() {
      return !this.aq().a(axg.k);
   }

   public boolean dK() {
      return (this.av || this.aw) && this.dJ();
   }

   public float dL() {
      return this.aA;
   }

   public float dM() {
      return this.dL();
   }

   public void v(float $$0) {
      if (!Float.isFinite($$0)) {
         ae.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aA = $$0;
      }
   }

   public float dN() {
      return this.aB;
   }

   public void w(float $$0) {
      if (!Float.isFinite($$0)) {
         ae.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aB = Math.clamp($$0 % 360.0F, -90.0F, 90.0F);
      }
   }

   public boolean dO() {
      return false;
   }

   public float dP() {
      return 0.0F;
   }

   public void b_(@Nullable bul $$0) {
   }

   public final boolean dQ() {
      return this.aE != null;
   }

   @Nullable
   public bul.c dR() {
      return this.aE;
   }

   @Override
   public final void b(bul.c $$0) {
      if (this.aE == null) {
         this.aE = $$0;
      }

      if (this.aE.a()) {
         this.ae();
      }

      this.cZ().forEach(bul::ae);
      this.aS.a($$0);
   }

   protected void dS() {
      this.aE = null;
   }

   @Override
   public void a(dzz $$0) {
      this.aS = $$0;
   }

   @Override
   public boolean dT() {
      if (this.aE != null && !this.aE.b()) {
         return false;
      } else {
         return this.bZ() ? false : !this.ca() || !this.df();
      }
   }

   @Override
   public boolean dU() {
      return false;
   }

   public boolean c(arp $$0, jh $$1) {
      return true;
   }

   public dfm dV() {
      return this.s;
   }

   protected void a(dfm $$0) {
      this.s = $$0;
   }

   public btc dW() {
      return this.dV().ai();
   }

   public ke dX() {
      return this.dV().J_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = azm.d($$6, this.dA(), $$1);
      double $$8 = azm.d($$6, this.dC(), $$2);
      double $$9 = azm.d($$6, this.dG(), $$3);
      float $$10 = (float)azm.e($$6, (double)this.dL(), $$4);
      float $$11 = (float)azm.d($$6, (double)this.dN(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   public azu dY() {
      return this.ae;
   }

   public ezy ah() {
      if (this.cX() instanceof cou $$0 && this.bL()) {
         return $$0.ah();
      }

      return this.dy();
   }

   @Nullable
   public cwm dZ() {
      return null;
   }

   public Optional<ali<eus>> ea() {
      return this.o.k();
   }

   @FunctionalInterface
   public interface a {
      void accept(bul var1, double var2, double var4, double var6);
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
