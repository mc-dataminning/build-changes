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
import java.util.Arrays;
import java.util.Comparator;
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

public abstract class bsg implements ajs, bql, dwn, ep, exi {
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
   private static final ewa d = new ewa(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double e = 0.014;
   private static final double k = 0.007;
   private static final double l = 0.0023333333333333335;
   public static final String I = "UUID";
   private static double m = 1.0;
   private final bsm<?> n;
   private int o = c.incrementAndGet();
   public boolean J;
   private ImmutableList<bsg> p = ImmutableList.of();
   protected int K;
   @Nullable
   private bsg q;
   private dcf r;
   public double L;
   public double M;
   public double N;
   private ewf s;
   private ja t;
   private dbm u;
   private ewf v = ewf.b;
   private float aF;
   private float aG;
   public float O;
   public float P;
   private ewa aH = d;
   private boolean aI;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   public boolean U;
   protected ewf V = ewf.b;
   @Nullable
   private bsg.c aJ;
   public static final float W = 0.6F;
   public static final float X = 1.8F;
   public float Y;
   public float Z;
   public float aa;
   public float ab;
   public float ac;
   private float aK = 1.0F;
   public double ad;
   public double ae;
   public double af;
   public boolean ag;
   protected final ayo ah = ayo.a();
   public int ai;
   private int aL = -this.dg();
   protected boolean aj;
   protected Object2DoubleMap<awm<eog>> ak = new Object2DoubleArrayMap(2);
   protected boolean al;
   private final Set<awm<eog>> aM = new HashSet<>();
   public int am;
   protected boolean an = true;
   protected final ajt ao;
   protected static final ajp<Byte> ap = ajt.a(bsg.class, ajr.a);
   protected static final int aq = 0;
   private static final int aN = 1;
   private static final int aO = 3;
   private static final int aP = 4;
   private static final int aQ = 5;
   protected static final int ar = 6;
   protected static final int as = 7;
   private static final ajp<Integer> aR = ajt.a(bsg.class, ajr.b);
   private static final ajp<Optional<wu>> aS = ajt.a(bsg.class, ajr.g);
   private static final ajp<Boolean> aT = ajt.a(bsg.class, ajr.k);
   private static final ajp<Boolean> aU = ajt.a(bsg.class, ajr.k);
   private static final ajp<Boolean> aV = ajt.a(bsg.class, ajr.k);
   protected static final ajp<btn> at = ajt.a(bsg.class, ajr.w);
   private static final ajp<Integer> aW = ajt.a(bsg.class, ajr.b);
   private dwo aX = dwo.a;
   private final ahz aY = new ahz();
   public boolean au;
   public boolean av;
   private int aZ;
   protected boolean aw;
   protected int ax;
   protected ja ay;
   private boolean ba;
   protected UUID az = ayg.a(this.ah);
   protected String aA = this.az.toString();
   private boolean bb;
   private final Set<String> bc = Sets.newHashSet();
   private final double[] bd = new double[]{0.0, 0.0, 0.0};
   private long be;
   private bsj bf;
   private float bg;
   public boolean aB;
   public boolean aC;
   public boolean aD;
   public Optional<ja> aE = Optional.empty();
   private boolean bh = false;
   private float bi;
   private int bj;
   private boolean bk;
   @Nullable
   private dsk bl = null;

   public bsg(bsm<?> $$0, dcf $$1) {
      this.n = $$0;
      this.r = $$1;
      this.bf = $$0.n();
      this.s = ewf.b;
      this.t = ja.c;
      this.u = dbm.b;
      ajt.a $$2 = new ajt.a(this);
      $$2.a(ap, (byte)0);
      $$2.a(aR, this.cl());
      $$2.a(aT, false);
      $$2.a(aS, Optional.empty());
      $$2.a(aU, false);
      $$2.a(aV, false);
      $$2.a(at, btn.a);
      $$2.a(aW, 0);
      this.a($$2);
      this.ao = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.bg = this.bf.c();
   }

   public boolean a(ja $$0, dsk $$1) {
      ewy $$2 = $$1.b(this.dQ(), $$0, ewk.a(this));
      ewy $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return ewv.c($$3, ewv.a(this.cL()), ewj.i);
   }

   public int i_() {
      exl $$0 = this.ck();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean N_() {
      return false;
   }

   public final void aj() {
      if (this.bT()) {
         this.bI();
      }

      if (this.bS()) {
         this.ac();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.aY.e(new ewf($$0, $$1, $$2));
   }

   public ahz ak() {
      return this.aY;
   }

   public bsm<?> al() {
      return this.n;
   }

   @Override
   public int am() {
      return this.o;
   }

   public void e(int $$0) {
      this.o = $$0;
   }

   public Set<String> an() {
      return this.bc;
   }

   public boolean a(String $$0) {
      return this.bc.size() >= 1024 ? false : this.bc.add($$0);
   }

   public boolean b(String $$0) {
      return this.bc.remove($$0);
   }

   public void ao() {
      this.a(bsg.c.a);
      this.a(dxg.p);
   }

   public final void ap() {
      this.a(bsg.c.b);
   }

   protected abstract void a(ajt.a var1);

   public ajt aq() {
      return this.ao;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bsg ? ((bsg)$$0).o == this.o : false;
   }

   @Override
   public int hashCode() {
      return this.o;
   }

   public void a(bsg.c $$0) {
      this.b($$0);
   }

   public void ar() {
   }

   public void b(btn $$0) {
      this.ao.a(at, $$0);
   }

   public btn as() {
      return this.ao.a(at);
   }

   public boolean c(btn $$0) {
      return this.as() == $$0;
   }

   public boolean a(bsg $$0, double $$1) {
      return this.do().a((jt)$$0.do(), $$1);
   }

   public boolean a(bsg $$0, double $$1, double $$2) {
      double $$3 = $$0.dv() - this.dv();
      double $$4 = $$0.dx() - this.dx();
      double $$5 = $$0.dB() - this.dB();
      return ayg.e($$3, $$5) < ayg.k($$1) && ayg.k($$4) < ayg.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.s($$0 % 360.0F);
      this.t($$1 % 360.0F);
   }

   public final void b(ewf $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.at());
   }

   protected ewa at() {
      return this.bf.a(this.s);
   }

   protected void au() {
      this.a_(this.s.c, this.s.d, this.s.e);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.t(this.dI() + $$2);
      this.s(this.dG() + $$3);
      this.t(ayg.a(this.dI(), -90.0F, 90.0F));
      this.P += $$2;
      this.O += $$3;
      this.P = ayg.a(this.P, -90.0F, 90.0F);
      if (this.q != null) {
         this.q.k(this);
      }
   }

   public void l() {
      this.av();
   }

   public void av() {
      this.dQ().ag().a("entityBaseTick");
      this.bl = null;
      if (this.bS() && this.dd().dL()) {
         this.ac();
      }

      if (this.K > 0) {
         this.K--;
      }

      this.Y = this.Z;
      this.P = this.dI();
      this.O = this.dG();
      this.bP();
      if (this.br()) {
         this.bs();
      }

      this.aC = this.aB;
      this.aB = false;
      this.bm();
      this.z();
      this.bl();
      if (this.dQ().B) {
         this.aD();
      } else if (this.aL > 0) {
         if (this.be()) {
            this.h(this.aL - 4);
            if (this.aL < 0) {
               this.aD();
            }
         } else {
            if (this.aL % 20 == 0 && !this.bt()) {
               this.a(this.dR().d(), 1.0F);
            }

            this.h(this.aL - 1);
         }

         if (this.cn() > 0) {
            this.k(0);
            this.dQ().a(null, 1009, this.t, 1);
         }
      }

      if (this.bt()) {
         this.aB();
         this.ac *= 0.5F;
      }

      this.aw();
      if (!this.dQ().B) {
         this.c(this.aL > 0);
      }

      this.an = false;
      this.dQ().ag().c();
   }

   public void c(boolean $$0) {
      this.b(0, $$0 || this.bk);
   }

   public void aw() {
      if (this.dx() < (double)(this.dQ().I_() - 64)) {
         this.aE();
      }
   }

   public void ax() {
      this.aZ = this.bQ();
   }

   public void f(int $$0) {
      this.aZ = $$0;
   }

   public int ay() {
      return this.aZ;
   }

   public boolean az() {
      return this.aZ > 0;
   }

   protected void L() {
      if (this.az()) {
         this.aZ--;
      }
   }

   public int aA() {
      return 0;
   }

   public void aB() {
      if (!this.be()) {
         this.d(15.0F);
         if (this.a(this.dR().e(), 4.0F)) {
            this.a(avh.ka, 0.4F, 2.0F + this.ah.i() * 0.4F);
         }
      }
   }

   public final void d(float $$0) {
      this.g(ayg.d($$0 * 20.0F));
   }

   public void g(int $$0) {
      if (this.aL < $$0) {
         this.h($$0);
      }
   }

   public void h(int $$0) {
      this.aL = $$0;
   }

   public int aC() {
      return this.aL;
   }

   public void aD() {
      this.h(0);
   }

   protected void aE() {
      this.ap();
   }

   public boolean g(double $$0, double $$1, double $$2) {
      return this.b(this.cL().d($$0, $$1, $$2));
   }

   private boolean b(ewa $$0) {
      return this.dQ().a(this, $$0) && !this.dQ().d($$0);
   }

   public void d(boolean $$0) {
      this.aI = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, ewf $$1) {
      this.aI = $$0;
      this.b($$0, $$1);
   }

   public boolean d(ja $$0) {
      return this.aE.isPresent() && this.aE.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable ewf $$1) {
      if ($$0) {
         ewa $$2 = this.cL();
         ewa $$3 = new ewa($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<ja> $$4 = this.r.g(this, $$3);
         if ($$4.isPresent() || this.bh) {
            this.aE = $$4;
         } else if ($$1 != null) {
            ewa $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
            $$4 = this.r.g(this, $$5);
            this.aE = $$4;
         }

         this.bh = $$4.isEmpty();
      } else {
         this.bh = false;
         if (this.aE.isPresent()) {
            this.aE = Optional.empty();
         }
      }
   }

   public boolean aF() {
      return this.aI;
   }

   public void a(btg $$0, ewf $$1) {
      if (this.ag) {
         this.a_(this.dv() + $$1.c, this.dx() + $$1.d, this.dB() + $$1.e);
      } else {
         this.aD = this.bR();
         if ($$0 == btg.c) {
            $$1 = this.d($$1);
            if ($$1.equals(ewf.b)) {
               return;
            }
         }

         this.dQ().ag().a("move");
         if (this.V.g() > 1.0E-7) {
            $$1 = $$1.h(this.V);
            this.V = ewf.b;
            this.i(ewf.b);
         }

         $$1 = this.a($$1, $$0);
         ewf $$2 = this.a($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ac != 0.0F && $$3 >= 1.0) {
               ewb $$4 = this.dQ().a(new dbo(this.do(), this.do().e($$2), dbo.a.d, dbo.b.d, this));
               if ($$4.c() != ewd.a.a) {
                  this.n();
               }
            }

            this.a_(this.dv() + $$2.c, this.dx() + $$2.d, this.dB() + $$2.e);
         }

         this.dQ().ag().c();
         this.dQ().ag().a("rest");
         boolean $$5 = !ayg.b($$1.c, $$2.c);
         boolean $$6 = !ayg.b($$1.e, $$2.e);
         this.Q = $$5 || $$6;
         this.R = $$1.d != $$2.d;
         this.S = this.R && $$1.d < 0.0;
         if (this.Q) {
            this.T = this.c($$2);
         } else {
            this.T = false;
         }

         this.a(this.S, $$2);
         ja $$7 = this.aK();
         dsk $$8 = this.dQ().a_($$7);
         this.a($$2.d, this.aF(), $$8, $$7);
         if (this.dL()) {
            this.dQ().ag().c();
         } else {
            if (this.Q) {
               ewf $$9 = this.dt();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            dfh $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dQ(), this);
            }

            if (this.aF()) {
               $$10.a(this.dQ(), $$7, $$8, this);
            }

            bsg.b $$11 = this.bc();
            if ($$11.a() && !this.bS()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.ab = this.ab + (float)($$2.f() * 0.6);
               ja $$15 = this.aM();
               dsk $$16 = this.dQ().a_($$15);
               boolean $$17 = this.c($$16);
               if (!$$17) {
                  $$13 = 0.0;
               }

               this.Z = this.Z + (float)$$2.h() * 0.6F;
               this.aa = this.aa + (float)Math.sqrt($$12 * $$12 + $$13 * $$13 + $$14 * $$14) * 0.6F;
               if (this.aa > this.aK && !$$16.i()) {
                  boolean $$18 = $$15.equals($$7);
                  boolean $$19 = this.a($$7, $$8, $$11.c(), $$18, $$1);
                  if (!$$18) {
                     $$19 |= this.a($$15, $$16, false, $$11.b(), $$1);
                  }

                  if ($$19) {
                     this.aK = this.aP();
                  } else if (this.bf()) {
                     this.aK = this.aP();
                     if ($$11.c()) {
                        this.aU();
                     }

                     if ($$11.b()) {
                        this.a(dxg.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aJ();
               }
            }

            this.aG();
            float $$20 = this.aO();
            this.i(this.dt().d((double)$$20, 1.0, (double)$$20));
            if (this.dQ().c(this.cL().h(1.0E-6)).noneMatch($$0x -> $$0x.a(avw.aK) || $$0x.a(dfj.H))) {
               if (this.aL <= 0) {
                  this.h(-this.dg());
               }

               if (this.aD && (this.aB || this.bh())) {
                  this.aH();
               }
            }

            if (this.bR() && (this.aB || this.bh())) {
               this.h(-this.dg());
            }

            this.dQ().ag().c();
         }
      }
   }

   private boolean c(dsk $$0) {
      return $$0.a(avw.aP) || $$0.a(dfj.qP);
   }

   private boolean a(ja $$0, dsk $$1, boolean $$2, boolean $$3, ewf $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aF() || $$5 || this.cb() && $$4.d == 0.0 || this.cj()) && !this.cd()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dQ().a(dxg.P, this.do(), dxg.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean c(ewf $$0) {
      return false;
   }

   protected void aG() {
      try {
         this.aT();
      } catch (Throwable var4) {
         o $$1 = o.a(var4, "Checking entity block collision");
         p $$2 = $$1.a("Entity being checked for collision");
         this.a($$2);
         throw new y($$1);
      }
   }

   protected void aH() {
      this.a(avh.kf, 0.7F, 1.6F + (this.ah.i() - this.ah.i()) * 0.4F);
   }

   public void aI() {
      if (!this.dQ().B && this.aD) {
         this.aH();
      }

      this.aD();
   }

   protected void aJ() {
      if (this.aW()) {
         this.aV();
         if (this.bc().b()) {
            this.a(dxg.x);
         }
      }
   }

   @Deprecated
   public ja aK() {
      return this.e(0.2F);
   }

   protected ja aL() {
      return this.e(0.500001F);
   }

   public ja aM() {
      return this.e(1.0E-5F);
   }

   protected ja e(float $$0) {
      if (this.aE.isPresent()) {
         ja $$1 = this.aE.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dsk $$2 = this.dQ().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(avw.S)) && !$$2.a(avw.L) && !($$2.b() instanceof dig) ? $$1.h(ayg.a(this.s.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = ayg.a(this.s.c);
         int $$4 = ayg.a(this.s.d - (double)$$0);
         int $$5 = ayg.a(this.s.e);
         return new ja($$3, $$4, $$5);
      }
   }

   protected float aN() {
      float $$0 = this.dQ().a_(this.dq()).b().k();
      float $$1 = this.dQ().a_(this.aL()).b().k();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aO() {
      dsk $$0 = this.dQ().a_(this.dq());
      float $$1 = $$0.b().j();
      if (!$$0.a(dfj.G) && !$$0.a(dfj.nd)) {
         return (double)$$1 == 1.0 ? this.dQ().a_(this.aL()).b().j() : $$1;
      } else {
         return $$1;
      }
   }

   protected ewf a(ewf $$0, btg $$1) {
      return $$0;
   }

   protected ewf d(ewf $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dQ().Z();
         if ($$1 != this.be) {
            Arrays.fill(this.bd, 0.0);
            this.be = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(jf.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? ewf.b : new ewf($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(jf.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? ewf.b : new ewf(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(jf.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? ewf.b : new ewf(0.0, 0.0, $$4);
         } else {
            return ewf.b;
         }
      }
   }

   private double a(jf.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = ayg.a($$1 + this.bd[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bd[$$2];
      this.bd[$$2] = $$3;
      return $$1;
   }

   private ewf a(ewf $$0) {
      ewa $$1 = this.cL();
      List<ewy> $$2 = this.dQ().c(this, $$1.b($$0));
      ewf $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dQ(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = $$5 && $$0.d < 0.0;
      if (this.dK() > 0.0F && ($$7 || this.aF()) && ($$4 || $$6)) {
         ewa $$8 = $$7 ? $$1.d(0.0, $$3.d, 0.0) : $$1;
         ewa $$9 = $$8.b($$0.c, (double)this.dK(), $$0.e);
         if (!$$7) {
            $$9 = $$9.b(0.0, -1.0E-5F, 0.0);
         }

         List<ewy> $$10 = a(this, this.r, $$2, $$9);
         float $$11 = (float)$$3.d;
         float[] $$12 = a($$8, $$10, $$11, this.dK());

         for (float $$13 : $$12) {
            ewf $$14 = a(new ewf($$0.c, (double)$$13, $$0.e), $$8, $$10);
            if ($$14.i() > $$3.i()) {
               return $$14;
            }
         }
      }

      return $$3;
   }

   private static float[] a(ewa $$0, List<ewy> $$1, float $$2, float $$3) {
      FloatSet $$4 = new FloatArraySet(4);

      for (ewy $$5 : $$1) {
         DoubleList $$6 = $$5.a(jf.a.b);
         DoubleListIterator var8 = $$6.iterator();

         while (var8.hasNext()) {
            double $$7 = (Double)var8.next();
            float $$8 = (float)($$7 - $$0.b);
            if (!($$8 <= $$2)) {
               if ($$8 > $$3) {
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

   public static ewf a(@Nullable bsg $$0, ewf $$1, ewa $$2, dcf $$3, List<ewy> $$4) {
      List<ewy> $$5 = a($$0, $$3, $$4, $$2.b($$1));
      return a($$1, $$2, $$5);
   }

   private static List<ewy> a(@Nullable bsg $$0, dcf $$1, List<ewy> $$2, ewa $$3) {
      Builder<ewy> $$4 = ImmutableList.builderWithExpectedSize($$2.size() + 1);
      if (!$$2.isEmpty()) {
         $$4.addAll($$2);
      }

      dub $$5 = $$1.C_();
      boolean $$6 = $$0 != null && $$5.a($$0, $$3);
      if ($$6) {
         $$4.add($$5.c());
      }

      $$4.addAll($$1.e($$0, $$3));
      return $$4.build();
   }

   private static ewf a(ewf $$0, ewa $$1, List<ewy> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = ewv.a(jf.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = ewv.a(jf.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = ewv.a(jf.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = ewv.a(jf.a.c, $$1, $$2, $$5);
         }

         return new ewf($$3, $$4, $$5);
      }
   }

   protected float aP() {
      return (float)((int)this.aa + 1);
   }

   protected avg aQ() {
      return avh.kj;
   }

   protected avg aR() {
      return avh.ki;
   }

   protected avg aS() {
      return avh.ki;
   }

   protected void aT() {
      ewa $$0 = this.cL();
      ja $$1 = ja.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      ja $$2 = ja.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dQ().a($$1, $$2)) {
         ja.a $$3 = new ja.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bE()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  dsk $$7 = this.dQ().a_($$3);

                  try {
                     $$7.a(this.dQ(), $$3, this);
                     this.a($$7);
                  } catch (Throwable var12) {
                     o $$9 = o.a(var12, "Colliding entity with block");
                     p $$10 = $$9.a("Block being collided with");
                     p.a($$10, this.dQ(), $$3, $$7);
                     throw new y($$9);
                  }
               }
            }
         }
      }
   }

   protected void a(dsk $$0) {
   }

   public void a(jj<dxg> $$0, @Nullable bsg $$1) {
      this.dQ().a($$1, $$0, this.s);
   }

   public void a(jj<dxg> $$0) {
      this.a($$0, this);
   }

   private void c(ja $$0, dsk $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.v();
      }
   }

   protected void aU() {
      bsg $$0 = Objects.requireNonNullElse(this.cR(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      ewf $$2 = $$0.dt();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.f($$3);
   }

   protected ja e(ja $$0) {
      ja $$1 = $$0.c();
      dsk $$2 = this.dQ().a_($$1);
      return !$$2.a(avw.bn) && !$$2.a(avw.bo) ? $$0 : $$1;
   }

   protected void a(dsk $$0, dsk $$1) {
      dmu $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dsk $$0) {
      dmu $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(ja $$0, dsk $$1) {
      dmu $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dsk $$0) {
      return $$0.a(avw.bm) && this.ai >= this.bj + 20;
   }

   private void v() {
      this.bi = this.bi * (float)Math.pow(0.997, (double)(this.ai - this.bj));
      this.bi = Math.min(1.0F, this.bi + 0.07F);
      float $$0 = 0.5F + this.bi * this.ah.i() * 1.2F;
      float $$1 = 0.1F + this.bi * 1.2F;
      this.a(avh.E, $$1, $$0);
      this.bj = this.ai;
   }

   protected void f(float $$0) {
      this.a(this.aQ(), $$0, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
   }

   protected void aV() {
   }

   protected boolean aW() {
      return false;
   }

   public void a(avg $$0, float $$1, float $$2) {
      if (!this.aX()) {
         this.dQ().a(null, this.dv(), this.dx(), this.dB(), $$0, this.df(), $$1, $$2);
      }
   }

   public void a(avg $$0) {
      if (!this.aX()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean aX() {
      return this.ao.a(aU);
   }

   public void e(boolean $$0) {
      this.ao.a(aU, $$0);
   }

   public boolean aY() {
      return this.ao.a(aV);
   }

   public void f(boolean $$0) {
      this.ao.a(aV, $$0);
   }

   protected double aZ() {
      return 0.0;
   }

   public final double ba() {
      return this.aY() ? 0.0 : this.aZ();
   }

   protected void bb() {
      double $$0 = this.ba();
      if ($$0 != 0.0) {
         this.i(this.dt().b(0.0, -$$0, 0.0));
      }
   }

   protected bsg.b bc() {
      return bsg.b.d;
   }

   public boolean bd() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dsk $$2, ja $$3) {
      if ($$1) {
         if (this.ac > 0.0F) {
            $$2.b().a(this.dQ(), $$2, $$3, this, this.ac);
            this.dQ().a(dxg.A, this.s, dxg.a.a(this, this.aE.<dsk>map($$0x -> this.dQ().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ac -= (float)$$0;
      }
   }

   public boolean be() {
      return this.al().d();
   }

   public boolean a(float $$0, float $$1, bqz $$2) {
      if (this.n.a(awa.o)) {
         return false;
      } else {
         if (this.bT()) {
            for (bsg $$3 : this.cT()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean bf() {
      return this.aj;
   }

   private boolean w() {
      ja $$0 = this.dq();
      return this.dQ().r($$0) || this.dQ().r(ja.a((double)$$0.u(), this.cL().e, (double)$$0.w()));
   }

   private boolean x() {
      return this.dr().a(dfj.nd);
   }

   public boolean bg() {
      return this.bf() || this.w();
   }

   public boolean bh() {
      return this.bf() || this.w() || this.x();
   }

   public boolean bi() {
      return this.bf() || this.x();
   }

   public boolean bj() {
      return this.bi() || this.bt();
   }

   public boolean bk() {
      return this.al && this.bf();
   }

   public void bl() {
      if (this.cd()) {
         this.i(this.cc() && this.bf() && !this.bS());
      } else {
         this.i(this.cc() && this.bk() && !this.bS() && this.dQ().b_(this.t).a(awc.a));
      }
   }

   protected boolean bm() {
      this.ak.clear();
      this.bn();
      double $$0 = this.dQ().D_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(awc.b, $$0);
      return this.bf() || $$1;
   }

   void bn() {
      if (this.dd() instanceof coh $$0 && !$$0.bk()) {
         this.aj = false;
         return;
      }

      if (this.a(awc.a, 0.014)) {
         if (!this.aj && !this.an) {
            this.bo();
         }

         this.n();
         this.aj = true;
         this.aD();
      } else {
         this.aj = false;
      }
   }

   private void z() {
      this.al = this.a(awc.a);
      this.aM.clear();
      double $$0 = this.dz();
      if (this.dd() instanceof coh $$2 && !$$2.bk() && $$2.cL().e >= $$0 && $$2.cL().b <= $$0) {
         return;
      }

      ja $$3 = ja.a(this.dv(), $$0, this.dB());
      eoh $$4 = this.dQ().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((dbl)this.dQ(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aM::add);
      }
   }

   protected void bo() {
      bsg $$0 = Objects.requireNonNullElse(this.cR(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      ewf $$2 = $$0.dt();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aR(), $$3, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
      } else {
         this.a(this.aS(), $$3, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
      }

      float $$4 = (float)ayg.a(this.dx());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bf.a() * 20.0F; $$5++) {
         double $$6 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         double $$7 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         this.dQ().a(lj.d, this.dv() + $$6, (double)($$4 + 1.0F), this.dB() + $$7, $$2.c, $$2.d - this.ah.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bf.a() * 20.0F; $$8++) {
         double $$9 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         double $$10 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         this.dQ().a(lj.am, this.dv() + $$9, (double)($$4 + 1.0F), this.dB() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(dxg.O);
   }

   @Deprecated
   protected dsk bp() {
      return this.dQ().a_(this.aK());
   }

   public dsk bq() {
      return this.dQ().a_(this.aM());
   }

   public boolean br() {
      return this.cc() && !this.bf() && !this.N_() && !this.cb() && !this.bt() && this.bE();
   }

   protected void bs() {
      ja $$0 = this.aK();
      dsk $$1 = this.dQ().a_($$0);
      if ($$1.l() != dln.a) {
         ewf $$2 = this.dt();
         ja $$3 = this.dq();
         double $$4 = this.dv() + (this.ah.j() - 0.5) * (double)this.bf.a();
         double $$5 = this.dB() + (this.ah.j() - 0.5) * (double)this.bf.a();
         if ($$3.u() != $$0.u()) {
            $$4 = ayg.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = ayg.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dQ().a(new lb(lj.b, $$1), $$4, this.dx() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(awm<eog> $$0) {
      return this.aM.contains($$0);
   }

   public boolean bt() {
      return !this.an && this.ak.getDouble(awc.b) > 0.0;
   }

   public void a(float $$0, ewf $$1) {
      ewf $$2 = a($$1, $$0, this.dG());
      this.i(this.dt().e($$2));
   }

   private static ewf a(ewf $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return ewf.b;
      } else {
         ewf $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = ayg.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = ayg.b($$2 * (float) (Math.PI / 180.0));
         return new ewf($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bu() {
      return this.dQ().f(this.du(), this.dA()) ? this.dQ().x(ja.a(this.dv(), this.dz(), this.dB())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.s($$3 % 360.0F);
      this.t(ayg.a($$4, -90.0F, 90.0F) % 360.0F);
      this.O = this.dG();
      this.P = this.dI();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = ayg.a($$0, -3.0E7, 3.0E7);
      double $$4 = ayg.a($$2, -3.0E7, 3.0E7);
      this.L = $$3;
      this.M = $$1;
      this.N = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void e(ewf $$0) {
      this.e($$0.c, $$0.d, $$0.e);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dG(), this.dI());
   }

   public void a(ja $$0, float $$1, float $$2) {
      this.b((double)$$0.u() + 0.5, (double)$$0.v(), (double)$$0.w() + 0.5, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.p($$0, $$1, $$2);
      this.s($$3);
      this.t($$4);
      this.bv();
      this.au();
   }

   public final void bv() {
      double $$0 = this.dv();
      double $$1 = this.dx();
      double $$2 = this.dB();
      this.L = $$0;
      this.M = $$1;
      this.N = $$2;
      this.ad = $$0;
      this.ae = $$1;
      this.af = $$2;
      this.O = this.dG();
      this.P = this.dI();
   }

   public float f(bsg $$0) {
      float $$1 = (float)(this.dv() - $$0.dv());
      float $$2 = (float)(this.dx() - $$0.dx());
      float $$3 = (float)(this.dB() - $$0.dB());
      return ayg.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dv() - $$0;
      double $$4 = this.dx() - $$1;
      double $$5 = this.dB() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(bsg $$0) {
      return this.f($$0.do());
   }

   public double f(ewf $$0) {
      double $$1 = this.dv() - $$0.c;
      double $$2 = this.dx() - $$0.d;
      double $$3 = this.dB() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cmk $$0) {
   }

   public void h(bsg $$0) {
      if (!this.y($$0)) {
         if (!$$0.ag && !this.ag) {
            double $$1 = $$0.dv() - this.dv();
            double $$2 = $$0.dB() - this.dB();
            double $$3 = ayg.a($$1, $$2);
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
               if (!this.bT() && this.bB()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.bT() && $$0.bB()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void g(ewf $$0) {
      this.j($$0.c, $$0.d, $$0.e);
   }

   public void j(double $$0, double $$1, double $$2) {
      this.i(this.dt().b($$0, $$1, $$2));
      this.av = true;
   }

   protected void bw() {
      this.U = true;
   }

   public boolean a(bqz $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bw();
         return false;
      }
   }

   public final ewf g(float $$0) {
      return this.b(this.h($$0), this.i($$0));
   }

   public jf bx() {
      return jf.a(this.g(1.0F));
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dI() : ayg.i($$0, this.P, this.dI());
   }

   public float i(float $$0) {
      return $$0 == 1.0F ? this.dG() : ayg.i($$0, this.O, this.dG());
   }

   public final ewf b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = ayg.b($$3);
      float $$5 = ayg.a($$3);
      float $$6 = ayg.b($$2);
      float $$7 = ayg.a($$2);
      return new ewf((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final ewf j(float $$0) {
      return this.c(this.h($$0), this.i($$0));
   }

   protected final ewf c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final ewf by() {
      return new ewf(this.dv(), this.dz(), this.dB());
   }

   public final ewf k(float $$0) {
      double $$1 = ayg.d((double)$$0, this.L, this.dv());
      double $$2 = ayg.d((double)$$0, this.M, this.dx()) + (double)this.cM();
      double $$3 = ayg.d((double)$$0, this.N, this.dB());
      return new ewf($$1, $$2, $$3);
   }

   public ewf l(float $$0) {
      return this.k($$0);
   }

   public final ewf m(float $$0) {
      double $$1 = ayg.d((double)$$0, this.L, this.dv());
      double $$2 = ayg.d((double)$$0, this.M, this.dx());
      double $$3 = ayg.d((double)$$0, this.N, this.dB());
      return new ewf($$1, $$2, $$3);
   }

   public ewd a(double $$0, float $$1, boolean $$2) {
      ewf $$3 = this.k($$1);
      ewf $$4 = this.g($$1);
      ewf $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dQ().a(new dbo($$3, $$5, dbo.a.b, $$2 ? dbo.b.c : dbo.b.a, this));
   }

   public boolean bz() {
      return this.bE() && this.bA();
   }

   public boolean bA() {
      return false;
   }

   public boolean bB() {
      return false;
   }

   public void a(bsg $$0, int $$1, bqz $$2) {
      if ($$0 instanceof aqn) {
         am.d.a((aqn)$$0, this, $$2);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.dv() - $$0;
      double $$4 = this.dx() - $$1;
      double $$5 = this.dB() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cL().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * m;
      return $$0 < $$1 * $$1;
   }

   public boolean d(tx $$0) {
      if (this.aJ != null && !this.aJ.b()) {
         return false;
      } else {
         String $$1 = this.bD();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.f($$0);
            return true;
         }
      }
   }

   public boolean e(tx $$0) {
      return this.bS() ? false : this.d($$0);
   }

   public tx f(tx $$0) {
      try {
         if (this.q != null) {
            $$0.a("Pos", this.a(this.q.dv(), this.dx(), this.q.dB()));
         } else {
            $$0.a("Pos", this.a(this.dv(), this.dx(), this.dB()));
         }

         ewf $$1 = this.dt();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dG(), this.dI()));
         $$0.a("FallDistance", this.ac);
         $$0.a("Fire", (short)this.aL);
         $$0.a("Air", (short)this.cm());
         $$0.a("OnGround", this.aF());
         $$0.a("Invulnerable", this.ba);
         $$0.a("PortalCooldown", this.aZ);
         $$0.a("UUID", this.cA());
         wu $$2 = this.ai();
         if ($$2 != null) {
            $$0.a("CustomName", wu.a.a($$2, this.dS()));
         }

         if (this.cF()) {
            $$0.a("CustomNameVisible", this.cF());
         }

         if (this.aX()) {
            $$0.a("Silent", this.aX());
         }

         if (this.aY()) {
            $$0.a("NoGravity", this.aY());
         }

         if (this.bb) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.cn();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.cn());
         }

         if (this.bk) {
            $$0.a("HasVisualFire", this.bk);
         }

         if (!this.bc.isEmpty()) {
            ud $$4 = new ud();

            for (String $$5 : this.bc) {
               $$4.add(us.a($$5));
            }

            $$0.a("Tags", $$4);
         }

         this.b($$0);
         if (this.bT()) {
            ud $$6 = new ud();

            for (bsg $$7 : this.cT()) {
               tx $$8 = new tx();
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

   public void g(tx $$0) {
      try {
         ud $$1 = $$0.c("Pos", 6);
         ud $$2 = $$0.c("Motion", 6);
         ud $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.o(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.p(ayg.a($$1.h(0), -3.0000512E7, 3.0000512E7), ayg.a($$1.h(1), -2.0E7, 2.0E7), ayg.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.s($$3.i(0));
         this.t($$3.i(1));
         this.bv();
         this.o(this.dG());
         this.p(this.dG());
         this.ac = $$0.j("FallDistance");
         this.aL = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.j($$0.g("Air"));
         }

         this.aI = $$0.q("OnGround");
         this.ba = $$0.q("Invulnerable");
         this.aZ = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.az = $$0.a("UUID");
            this.aA = this.az.toString();
         }

         if (!Double.isFinite(this.dv()) || !Double.isFinite(this.dx()) || !Double.isFinite(this.dB())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dG()) && Double.isFinite((double)this.dI())) {
            this.au();
            this.a(this.dG(), this.dI());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(wu.a.a($$8, this.dS()));
               } catch (Exception var16) {
                  b.warn("Failed to parse entity custom name {}", $$8, var16);
               }
            }

            this.o($$0.q("CustomNameVisible"));
            this.e($$0.q("Silent"));
            this.f($$0.q("NoGravity"));
            this.j($$0.q("Glowing"));
            this.k($$0.h("TicksFrozen"));
            this.bk = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.bc.clear();
               ud $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for (int $$12 = 0; $$12 < $$11; $$12++) {
                  this.bc.add($$10.j($$12));
               }
            }

            this.a($$0);
            if (this.bC()) {
               this.au();
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

   protected boolean bC() {
      return true;
   }

   @Nullable
   protected final String bD() {
      bsm<?> $$0 = this.al();
      akk $$1 = bsm.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(tx var1);

   protected abstract void b(tx var1);

   protected ud a(double... $$0) {
      ud $$1 = new ud();

      for (double $$2 : $$0) {
         $$1.add(ty.a($$2));
      }

      return $$1;
   }

   protected ud a(float... $$0) {
      ud $$1 = new ud();

      for (float $$2 : $$0) {
         $$1.add(ua.a($$2));
      }

      return $$1;
   }

   @Nullable
   public ciu a(dce $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public ciu a(dce $$0, int $$1) {
      return this.a(new cuc($$0), (float)$$1);
   }

   @Nullable
   public ciu b(cuc $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public ciu a(cuc $$0, float $$1) {
      if ($$0.e()) {
         return null;
      } else if (this.dQ().B) {
         return null;
      } else {
         ciu $$2 = new ciu(this.dQ(), this.dv(), this.dx() + (double)$$1, this.dB(), $$0);
         $$2.v();
         this.dQ().b($$2);
         return $$2;
      }
   }

   public boolean bE() {
      return !this.dL();
   }

   public boolean bF() {
      if (this.ag) {
         return false;
      } else {
         float $$0 = this.bf.a() * 0.8F;
         ewa $$1 = ewa.a(this.by(), (double)$$0, 1.0E-6, (double)$$0);
         return ja.a($$1)
            .anyMatch(
               $$1x -> {
                  dsk $$2 = this.dQ().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dQ(), $$1x)
                     && ewv.c($$2.k(this.dQ(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), ewv.a($$1), ewj.i);
               }
            );
      }
   }

   public bqg a(cmk $$0, bqf $$1) {
      return bqg.e;
   }

   public boolean i(bsg $$0) {
      return $$0.bG() && !this.y($$0);
   }

   public boolean bG() {
      return false;
   }

   public void t() {
      this.i(ewf.b);
      this.l();
      if (this.bS()) {
         this.dd().j(this);
      }
   }

   public final void j(bsg $$0) {
      if (this.x($$0)) {
         this.a($$0, bsg::a_);
      }
   }

   protected void a(bsg $$0, bsg.a $$1) {
      ewf $$2 = this.m($$0);
      ewf $$3 = $$0.l(this);
      $$1.accept($$0, $$2.c - $$3.c, $$2.d - $$3.d, $$2.e - $$3.e);
   }

   public void k(bsg $$0) {
   }

   public ewf l(bsg $$0) {
      return this.dn().b(bsh.b, 0, this.aF);
   }

   public ewf m(bsg $$0) {
      return this.do().e(this.a($$0, this.bf, 1.0F));
   }

   protected ewf a(bsg $$0, bsj $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static ewf a(bsg $$0, bsg $$1, bsi $$2) {
      int $$3 = $$0.cT().indexOf($$1);
      return $$2.c(bsh.a, $$3, $$0.aF);
   }

   public boolean n(bsg $$0) {
      return this.a($$0, false);
   }

   public boolean bH() {
      return this instanceof btb;
   }

   public boolean a(bsg $$0, boolean $$1) {
      if ($$0 == this.q) {
         return false;
      } else if (!$$0.bK()) {
         return false;
      } else {
         for (bsg $$2 = $$0; $$2.q != null; $$2 = $$2.q) {
            if ($$2.q == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bS()) {
               this.ac();
            }

            this.b(btn.a);
            this.q = $$0;
            this.q.p(this);
            $$0.G().filter($$0x -> $$0x instanceof aqn).forEach($$0x -> am.U.a((aqn)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bsg $$0) {
      return !this.bW() && this.K <= 0;
   }

   public void bI() {
      for (int $$0 = this.p.size() - 1; $$0 >= 0; $$0--) {
         ((bsg)this.p.get($$0)).ac();
      }
   }

   public void bJ() {
      if (this.q != null) {
         bsg $$0 = this.q;
         this.q = null;
         $$0.q(this);
      }
   }

   public void ac() {
      this.bJ();
   }

   protected void p(bsg $$0) {
      if ($$0.dd() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.p.isEmpty()) {
            this.p = ImmutableList.of($$0);
         } else {
            List<bsg> $$1 = Lists.newArrayList(this.p);
            if (!this.dQ().B && $$0 instanceof cmk && !(this.cU() instanceof cmk)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.p = ImmutableList.copyOf($$1);
         }

         this.a(dxg.s, $$0);
      }
   }

   protected void q(bsg $$0) {
      if ($$0.dd() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.p.size() == 1 && this.p.get(0) == $$0) {
            this.p = ImmutableList.of();
         } else {
            this.p = this.p.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.K = 60;
         this.a(dxg.q, $$0);
      }
   }

   protected boolean r(bsg $$0) {
      return this.p.isEmpty();
   }

   protected boolean bK() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public double c_() {
      return this.dv();
   }

   public double d_() {
      return this.dx();
   }

   public double L_() {
      return this.dB();
   }

   public float M_() {
      return this.dI();
   }

   public float e_() {
      return this.dG();
   }

   public void a(float $$0, int $$1) {
      this.o($$0);
   }

   public float bL() {
      return 0.0F;
   }

   public ewf bM() {
      return this.b(this.dI(), this.dG());
   }

   public ewf a(ctx $$0) {
      if (!(this instanceof cmk $$1)) {
         return ewf.b;
      } else {
         boolean $$2 = $$1.eV().a($$0) && !$$1.eU().a($$0);
         bsv $$3 = $$2 ? $$1.fr().e() : $$1.fr();
         return this.b(0.0F, this.dG() + (float)($$3 == bsv.b ? 80 : -80)).a(0.5);
      }
   }

   public ewe bN() {
      return new ewe(this.dI(), this.dG());
   }

   public ewf bO() {
      return ewf.a(this.bN());
   }

   public void f(ja $$0) {
      if (this.az()) {
         this.ax();
      } else {
         if (!this.dQ().B && !$$0.equals(this.ay)) {
            this.ay = $$0.i();
         }

         this.aw = true;
      }
   }

   protected void bP() {
      if (this.dQ() instanceof aqm) {
         int $$0 = this.aA();
         aqm $$1 = (aqm)this.dQ();
         if (this.aw) {
            MinecraftServer $$2 = $$1.o();
            akj<dcf> $$3 = this.dQ().af() == dcf.i ? dcf.h : dcf.i;
            aqm $$4 = $$2.a($$3);
            if ($$4 != null && $$2.H() && !this.bS() && this.ax++ >= $$0) {
               this.dQ().ag().a("portal");
               this.ax = $$0;
               this.ax();
               this.b($$4);
               this.dQ().ag().c();
            }

            this.aw = false;
         } else {
            if (this.ax > 0) {
               this.ax -= 4;
            }

            if (this.ax < 0) {
               this.ax = 0;
            }
         }

         this.L();
      }
   }

   public int bQ() {
      return 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
   }

   public void c(bqz $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            djb.a(this);
      }
   }

   public void n(float $$0) {
   }

   public boolean bR() {
      boolean $$0 = this.dQ() != null && this.dQ().B;
      return !this.be() && (this.aL > 0 || $$0 && this.i(0));
   }

   public boolean bS() {
      return this.dd() != null;
   }

   public boolean bT() {
      return !this.p.isEmpty();
   }

   public boolean bU() {
      return this.al().a(awa.p);
   }

   public boolean bV() {
      return !this.al().a(awa.q);
   }

   public void g(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean bW() {
      return this.i(1);
   }

   public boolean bX() {
      return this.bW();
   }

   public boolean bY() {
      return this.bW();
   }

   public boolean bZ() {
      return this.bW();
   }

   public boolean ca() {
      return this.bW();
   }

   public boolean cb() {
      return this.c(btn.f);
   }

   public boolean cc() {
      return this.i(3);
   }

   public void h(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean cd() {
      return this.i(4);
   }

   public boolean ce() {
      return this.c(btn.d);
   }

   public boolean cf() {
      return this.ce() && !this.bf();
   }

   public void i(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cg() {
      return this.bb;
   }

   public final void j(boolean $$0) {
      this.bb = $$0;
      this.b(6, this.ch());
   }

   public boolean ch() {
      return this.dQ().x_() ? this.i(6) : this.bb;
   }

   public boolean ci() {
      return this.i(5);
   }

   public boolean d(cmk $$0) {
      if ($$0.N_()) {
         return false;
      } else {
         exl $$1 = this.ck();
         return $$1 != null && $$0 != null && $$0.ck() == $$1 && $$1.i() ? false : this.ci();
      }
   }

   public boolean cj() {
      return false;
   }

   public void a(BiConsumer<dxd<?>, aqm> $$0) {
   }

   @Nullable
   public exe ck() {
      return this.dQ().M().e(this.cC());
   }

   public boolean s(bsg $$0) {
      return this.a($$0.ck());
   }

   public boolean a(exl $$0) {
      return this.ck() != null ? this.ck().a($$0) : false;
   }

   public void k(boolean $$0) {
      this.b(5, $$0);
   }

   protected boolean i(int $$0) {
      return (this.ao.a(ap) & 1 << $$0) != 0;
   }

   protected void b(int $$0, boolean $$1) {
      byte $$2 = this.ao.a(ap);
      if ($$1) {
         this.ao.a(ap, (byte)($$2 | 1 << $$0));
      } else {
         this.ao.a(ap, (byte)($$2 & ~(1 << $$0)));
      }
   }

   public int cl() {
      return 300;
   }

   public int cm() {
      return this.ao.a(aR);
   }

   public void j(int $$0) {
      this.ao.a(aR, $$0);
   }

   public int cn() {
      return this.ao.a(aW);
   }

   public void k(int $$0) {
      this.ao.a(aW, $$0);
   }

   public float co() {
      int $$0 = this.cq();
      return (float)Math.min(this.cn(), $$0) / (float)$$0;
   }

   public boolean cp() {
      return this.cn() >= this.cq();
   }

   public int cq() {
      return 140;
   }

   public void a(aqm $$0, bta $$1) {
      this.h(this.aL + 1);
      if (this.aL == 0) {
         this.d(8.0F);
      }

      this.a(this.dR().c(), 5.0F);
   }

   public void l(boolean $$0) {
      ewf $$1 = this.dt();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void m(boolean $$0) {
      ewf $$1 = this.dt();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(aqm $$0, btb $$1) {
      return true;
   }

   public void cr() {
      if (this.dt().b() > -0.5 && this.ac > 1.0F) {
         this.ac = 1.0F;
      }
   }

   public void n() {
      this.ac = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      ja $$3 = ja.a($$0, $$1, $$2);
      ewf $$4 = new ewf($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      ja.a $$5 = new ja.a();
      jf $$6 = jf.b;
      double $$7 = Double.MAX_VALUE;

      for (jf $$8 : new jf[]{jf.c, jf.d, jf.e, jf.f, jf.b}) {
         $$5.a($$3, $$8);
         if (!this.dQ().a_($$5).r(this.dQ(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == jf.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ah.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      ewf $$13 = this.dt().a(0.75);
      if ($$6.o() == jf.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == jf.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == jf.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dsk $$0, ewf $$1) {
      this.n();
      this.V = $$1;
   }

   private static wu c(wu $$0) {
      xi $$1 = $$0.e().b($$0.a().a(null));

      for (wu $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public wu ag() {
      wu $$0 = this.ai();
      return $$0 != null ? c($$0) : this.cs();
   }

   protected wu cs() {
      return this.n.h();
   }

   public boolean t(bsg $$0) {
      return this == $$0;
   }

   public float ct() {
      return 0.0F;
   }

   public void o(float $$0) {
   }

   public void p(float $$0) {
   }

   public boolean cu() {
      return true;
   }

   public boolean u(bsg $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dQ() == null ? "~NULL~" : this.dQ().toString();
      return this.aJ != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.ag().getString(),
            this.o,
            $$0,
            this.dv(),
            this.dx(),
            this.dB(),
            this.aJ
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.ag().getString(),
            this.o,
            $$0,
            this.dv(),
            this.dx(),
            this.dB()
         );
   }

   public boolean b(bqz $$0) {
      return this.dL() || this.ba && !$$0.a(avy.e) && !$$0.g() || $$0.a(avy.j) && this.be() || $$0.a(avy.n) && this.al().a(awa.o);
   }

   public boolean cv() {
      return this.ba;
   }

   public void n(boolean $$0) {
      this.ba = $$0;
   }

   public void v(bsg $$0) {
      this.b($$0.dv(), $$0.dx(), $$0.dB(), $$0.dG(), $$0.dI());
   }

   public void w(bsg $$0) {
      tx $$1 = $$0.f(new tx());
      $$1.r("Dimension");
      this.g($$1);
      this.aZ = $$0.aZ;
      this.ay = $$0.ay;
   }

   @Nullable
   public bsg b(aqm $$0) {
      if (this.dQ() instanceof aqm && !this.dL()) {
         this.dQ().ag().a("changeDimension");
         this.aj();
         this.dQ().ag().a("reposition");
         epg $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dQ().ag().b("reloading");
            bsg $$2 = this.al().a((dcf)$$0);
            if ($$2 != null) {
               $$2.w(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dI());
               $$2.i($$1.b);
               $$0.d($$2);
               if ($$0.af() == dcf.j) {
                  aqm.a($$0);
               }
            }

            this.cw();
            this.dQ().ag().c();
            ((aqm)this.dQ()).h();
            $$0.h();
            this.dQ().ag().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void cw() {
      this.b(bsg.c.e);
   }

   @Nullable
   protected epg a(aqm $$0) {
      boolean $$1 = this.dQ().af() == dcf.j && $$0.af() == dcf.h;
      boolean $$2 = $$0.af() == dcf.j;
      if (!$$1 && !$$2) {
         boolean $$6 = $$0.af() == dcf.i;
         if (this.dQ().af() != dcf.i && !$$6) {
            return null;
         } else {
            dub $$7 = $$0.C_();
            double $$8 = dwf.a(this.dQ().D_(), $$0.D_());
            ja $$9 = $$7.b(this.dv() * $$8, this.dx(), this.dB() * $$8);
            return this.a($$0, $$9, $$6, $$7).map($$1x -> {
               dsk $$2x = this.dQ().a_(this.ay);
               jf.a $$3;
               ewf $$5;
               if ($$2x.b(dta.H)) {
                  $$3 = $$2x.c(dta.H);
                  l.a $$4 = l.a(this.ay, $$3, 21, jf.a.b, 21, $$1xx -> this.dQ().a_($$1xx) == $$2x);
                  $$5 = this.a($$3, $$4);
               } else {
                  $$3 = jf.a.a;
                  $$5 = new ewf(0.5, 0.0, 0.0);
               }

               return eph.a($$0, $$1x, $$3, $$5, this, this.dt(), this.dG(), this.dI());
            }).orElse(null);
         }
      } else {
         ja $$3 = $$2 ? aqm.a : $$0.V();
         $$0.l().a(aqr.e, new dbm($$3), 3, $$3);
         int $$4;
         if ($$2) {
            $$4 = $$3.v();
         } else {
            $$4 = $$0.m($$3).a(dyf.a.f, $$3.u(), $$3.w()) + 1;
         }

         return new epg(new ewf((double)$$3.u() + 0.5, (double)$$4, (double)$$3.w() + 0.5), this.dt(), this.dG(), this.dI());
      }
   }

   protected ewf a(jf.a $$0, l.a $$1) {
      return eph.a($$1, $$0, this.do(), this.a(this.as()));
   }

   protected Optional<l.a> a(aqm $$0, ja $$1, boolean $$2, dub $$3) {
      return $$0.p().a($$1, $$2, $$3);
   }

   public boolean cx() {
      return !this.bS() && !this.bT();
   }

   public float a(dbx $$0, dbl $$1, ja $$2, dsk $$3, eoh $$4, float $$5) {
      return $$5;
   }

   public boolean a(dbx $$0, dbl $$1, ja $$2, dsk $$3, float $$4) {
      return true;
   }

   public int cy() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bsm.a(this.al()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.o);
      $$0.a("Entity Name", () -> this.ag().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dv(), this.dx(), this.dB()));
      $$0.a("Entity's Block location", p.a(this.dQ(), ayg.a(this.dv()), ayg.a(this.dx()), ayg.a(this.dB())));
      ewf $$1 = this.dt();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", () -> this.cT().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.dd()));
   }

   public boolean cz() {
      return this.bR() && !this.N_();
   }

   public void a_(UUID $$0) {
      this.az = $$0;
      this.aA = this.az.toString();
   }

   @Override
   public UUID cA() {
      return this.az;
   }

   public String cB() {
      return this.aA;
   }

   @Override
   public String cC() {
      return this.aA;
   }

   public boolean cD() {
      return true;
   }

   public static double cE() {
      return m;
   }

   public static void b(double $$0) {
      m = $$0;
   }

   @Override
   public wu O_() {
      return exe.a(this.ck(), this.ag()).a($$0 -> $$0.a(this.cK()).a(this.cB()));
   }

   public void b(@Nullable wu $$0) {
      this.ao.a(aS, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public wu ai() {
      return this.ao.a(aS).orElse(null);
   }

   @Override
   public boolean ah() {
      return this.ao.a(aS).isPresent();
   }

   public void o(boolean $$0) {
      this.ao.a(aT, $$0);
   }

   public boolean cF() {
      return this.ao.a(aT);
   }

   public final void n(double $$0, double $$1, double $$2) {
      if (this.dQ() instanceof aqm) {
         dbm $$3 = new dbm(ja.a($$0, $$1, $$2));
         ((aqm)this.dQ()).l().a(aqr.f, $$3, 0, this.am());
         this.dQ().d($$3.e, $$3.f);
         this.c($$0, $$1, $$2);
      }
   }

   public boolean a(aqm $$0, double $$1, double $$2, double $$3, Set<btp> $$4, float $$5, float $$6) {
      float $$7 = ayg.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dQ()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.A();
         this.o($$5);
      } else {
         this.aj();
         bsg $$8 = this.al().a((dcf)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.o($$5);
         this.b(bsg.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dQ() instanceof aqm) {
         this.b($$0, $$1, $$2, this.dG(), this.dI());
         this.A();
      }
   }

   private void A() {
      this.cV().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.p.iterator();

         while (var1.hasNext()) {
            bsg $$1 = (bsg)var1.next();
            $$0.a($$1, bsg::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.dv() + $$0, this.dx() + $$1, this.dB() + $$2);
   }

   public boolean cG() {
      return this.cF();
   }

   @Override
   public void a(List<ajt.c<?>> $$0) {
   }

   @Override
   public void a(ajp<?> $$0) {
      if (at.equals($$0)) {
         this.j_();
      }
   }

   @Deprecated
   protected void cH() {
      btn $$0 = this.as();
      bsj $$1 = this.a($$0);
      this.bf = $$1;
      this.bg = $$1.c();
   }

   public void j_() {
      bsj $$0 = this.bf;
      btn $$1 = this.as();
      bsj $$2 = this.a($$1);
      this.bf = $$2;
      this.bg = $$2.c();
      this.au();
      boolean $$3 = (double)$$2.a() <= 4.0 && (double)$$2.b() <= 4.0;
      if (!this.r.B && !this.an && !this.ag && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cmk)) {
         this.a($$0);
      }
   }

   public boolean a(bsj $$0) {
      bsj $$1 = this.a(this.as());
      ewf $$2 = this.do().b(0.0, (double)$$0.b() / 2.0, 0.0);
      double $$3 = (double)Math.max(0.0F, $$1.a() - $$0.a()) + 1.0E-6;
      double $$4 = (double)Math.max(0.0F, $$1.b() - $$0.b()) + 1.0E-6;
      ewy $$5 = ewv.a(ewa.a($$2, $$3, $$4, $$3));
      Optional<ewf> $$6 = this.r.a(this, $$5, $$2, (double)$$1.a(), (double)$$1.b(), (double)$$1.a());
      if ($$6.isPresent()) {
         this.b($$6.get().b(0.0, (double)(-$$1.b()) / 2.0, 0.0));
         return true;
      } else {
         if ($$1.a() > $$0.a() && $$1.b() > $$0.b()) {
            ewy $$7 = ewv.a(ewa.a($$2, $$3, 1.0E-6, $$3));
            Optional<ewf> $$8 = this.r.a(this, $$7, $$2, (double)$$1.a(), (double)$$0.b(), (double)$$1.a());
            if ($$8.isPresent()) {
               this.b($$8.get().b(0.0, (double)(-$$0.b()) / 2.0 + 1.0E-6, 0.0));
               return true;
            }
         }

         return false;
      }
   }

   public jf cI() {
      return jf.a((double)this.dG());
   }

   public jf cJ() {
      return this.cI();
   }

   protected xa cK() {
      return new xa(xa.a.c, new xa.b(this.al(), this.cA(), this.ag()));
   }

   public boolean a(aqn $$0) {
      return true;
   }

   @Override
   public final ewa cL() {
      return this.aH;
   }

   public ewa h_() {
      return this.cL();
   }

   public final void a(ewa $$0) {
      this.aH = $$0;
   }

   public final float d(btn $$0) {
      return this.a($$0).c();
   }

   public final float cM() {
      return this.bg;
   }

   public ewf q(float $$0) {
      return this.cN();
   }

   protected ewf cN() {
      return new ewf(0.0, (double)this.cM(), (double)(this.dk() * 0.4F));
   }

   public btt a_(int $$0) {
      return btt.a;
   }

   @Override
   public void a(wu $$0) {
   }

   public dcf cO() {
      return this.dQ();
   }

   @Nullable
   public MinecraftServer cP() {
      return this.dQ().o();
   }

   public bqg a(cmk $$0, ewf $$1, bqf $$2) {
      return bqg.e;
   }

   public boolean a(dbx $$0) {
      return false;
   }

   public void c(aqn $$0) {
   }

   public void d(aqn $$0) {
   }

   public float a(dlu $$0) {
      float $$1 = ayg.g(this.dG());
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
      float $$1 = ayg.g(this.dG());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public boolean cQ() {
      return false;
   }

   public cnd a(cnc $$0) {
      return this.al().a(awa.r) ? cnd.b : cnd.a;
   }

   @Nullable
   public btb cR() {
      return null;
   }

   public final boolean cS() {
      return this.cR() != null;
   }

   public final List<bsg> cT() {
      return this.p;
   }

   public Optional<bsg> h(ewf $$0) {
      return this.cT().stream().filter($$0x -> $$0x != this).min(Comparator.comparingDouble($$1 -> $$0.g($$1.do())));
   }

   @Nullable
   public bsg cU() {
      return this.p.isEmpty() ? null : (bsg)this.p.get(0);
   }

   public boolean x(bsg $$0) {
      return this.p.contains($$0);
   }

   public boolean a(Predicate<bsg> $$0) {
      UnmodifiableIterator var2 = this.p.iterator();

      while (var2.hasNext()) {
         bsg $$1 = (bsg)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bsg> G() {
      return this.p.stream().flatMap(bsg::cV);
   }

   @Override
   public Stream<bsg> cV() {
      return Stream.concat(Stream.of(this), this.G());
   }

   @Override
   public Stream<bsg> cW() {
      return Stream.concat(this.p.stream().flatMap(bsg::cW), Stream.of(this));
   }

   public Iterable<bsg> cX() {
      return () -> this.G().iterator();
   }

   public int cY() {
      return (int)this.G().filter($$0 -> $$0 instanceof cmk).count();
   }

   public boolean cZ() {
      return this.cY() == 1;
   }

   public bsg da() {
      bsg $$0 = this;

      while ($$0.bS()) {
         $$0 = $$0.dd();
      }

      return $$0;
   }

   public boolean y(bsg $$0) {
      return this.da() == $$0.da();
   }

   public boolean z(bsg $$0) {
      if (!$$0.bS()) {
         return false;
      } else {
         bsg $$1 = $$0.dd();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean db() {
      return this.cR() instanceof cmk $$0 ? $$0.g() : this.dc();
   }

   public boolean dc() {
      return !this.dQ().B;
   }

   protected static ewf a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -ayg.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = ayg.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new ewf((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public ewf b(btb $$0) {
      return new ewf(this.dv(), this.cL().e, this.dB());
   }

   @Nullable
   public bsg dd() {
      return this.q;
   }

   @Nullable
   public bsg de() {
      return this.q != null && this.q.cR() == this ? this.q : null;
   }

   public eom k_() {
      return eom.a;
   }

   public avi df() {
      return avi.g;
   }

   protected int dg() {
      return 1;
   }

   public eq dh() {
      return new eq(
         this, this.do(), this.bN(), this.dQ() instanceof aqm ? (aqm)this.dQ() : null, this.F(), this.ag().getString(), this.O_(), this.dQ().o(), this
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
      return this.dQ().ab().b(dcb.p);
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public boolean U_() {
      return true;
   }

   public void a(fc.a $$0, ewf $$1) {
      ewf $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.t(ayg.g((float)(-(ayg.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.s(ayg.g((float)(ayg.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.o(this.dG());
      this.P = this.dI();
      this.O = this.dG();
   }

   public boolean a(awm<eog> $$0, double $$1) {
      if (this.di()) {
         return false;
      } else {
         ewa $$2 = this.cL().h(0.001);
         int $$3 = ayg.a($$2.a);
         int $$4 = ayg.c($$2.d);
         int $$5 = ayg.a($$2.b);
         int $$6 = ayg.c($$2.e);
         int $$7 = ayg.a($$2.c);
         int $$8 = ayg.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cD();
         boolean $$11 = false;
         ewf $$12 = ewf.b;
         int $$13 = 0;
         ja.a $$14 = new ja.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  eoh $$18 = this.dQ().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((dbl)this.dQ(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           ewf $$20 = $$18.c(this.dQ(), $$14);
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

            if (!(this instanceof cmk)) {
               $$12 = $$12.d();
            }

            ewf $$21 = this.dt();
            $$12 = $$12.a($$1 * 1.0);
            double $$22 = 0.003;
            if (Math.abs($$21.c) < 0.003 && Math.abs($$21.e) < 0.003 && $$12.f() < 0.0045000000000000005) {
               $$12 = $$12.d().a(0.0045000000000000005);
            }

            this.i(this.dt().e($$12));
         }

         this.ak.put($$0, $$9);
         return $$11;
      }
   }

   public boolean di() {
      ewa $$0 = this.cL().g(1.0);
      int $$1 = ayg.a($$0.a);
      int $$2 = ayg.c($$0.d);
      int $$3 = ayg.a($$0.c);
      int $$4 = ayg.c($$0.f);
      return !this.dQ().b($$1, $$3, $$2, $$4);
   }

   public double b(awm<eog> $$0) {
      return this.ak.getDouble($$0);
   }

   public double dj() {
      return (double)this.cM() < 0.4 ? 0.0 : 0.4;
   }

   public final float dk() {
      return this.bf.a();
   }

   public final float dl() {
      return this.bf.b();
   }

   public zb<abn> dm() {
      return new abo(this);
   }

   public bsj a(btn $$0) {
      return this.n.n();
   }

   public final bsi dn() {
      return this.bf.d();
   }

   public ewf do() {
      return this.s;
   }

   public ewf dp() {
      return this.do();
   }

   @Override
   public ja dq() {
      return this.t;
   }

   public dsk dr() {
      if (this.bl == null) {
         this.bl = this.dQ().a_(this.dq());
      }

      return this.bl;
   }

   public dbm ds() {
      return this.u;
   }

   public ewf dt() {
      return this.v;
   }

   public void i(ewf $$0) {
      this.v = $$0;
   }

   public void j(ewf $$0) {
      this.i(this.dt().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.i(new ewf($$0, $$1, $$2));
   }

   public final int du() {
      return this.t.u();
   }

   public final double dv() {
      return this.s.c;
   }

   public double c(double $$0) {
      return this.s.c + (double)this.dk() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ah.j() - 1.0) * $$0);
   }

   public final int dw() {
      return this.t.v();
   }

   public final double dx() {
      return this.s.d;
   }

   public double e(double $$0) {
      return this.s.d + (double)this.dl() * $$0;
   }

   public double dy() {
      return this.e(this.ah.j());
   }

   public double dz() {
      return this.s.d + (double)this.bg;
   }

   public final int dA() {
      return this.t.w();
   }

   public final double dB() {
      return this.s.e;
   }

   public double f(double $$0) {
      return this.s.e + (double)this.dk() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ah.j() - 1.0) * $$0);
   }

   public final void p(double $$0, double $$1, double $$2) {
      if (this.s.c != $$0 || this.s.d != $$1 || this.s.e != $$2) {
         this.s = new ewf($$0, $$1, $$2);
         int $$3 = ayg.a($$0);
         int $$4 = ayg.a($$1);
         int $$5 = ayg.a($$2);
         if ($$3 != this.t.u() || $$4 != this.t.v() || $$5 != this.t.w()) {
            this.t = new ja($$3, $$4, $$5);
            this.bl = null;
            if (kc.a($$3) != this.u.e || kc.a($$5) != this.u.f) {
               this.u = new dbm(this.t);
            }
         }

         this.aX.a();
      }
   }

   public void dC() {
   }

   public ewf r(float $$0) {
      return this.m($$0).b(0.0, (double)this.bg * 0.7, 0.0);
   }

   public void a(abo $$0) {
      int $$1 = $$0.b();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      double $$4 = $$0.i();
      this.f($$2, $$3, $$4);
      this.e($$2, $$3, $$4);
      this.t($$0.m());
      this.s($$0.n());
      this.e($$1);
      this.a_($$0.e());
   }

   @Nullable
   public cuc dD() {
      return null;
   }

   public void p(boolean $$0) {
      this.aB = $$0;
   }

   public boolean dE() {
      return !this.al().a(awa.k);
   }

   public boolean dF() {
      return (this.aB || this.aC) && this.dE();
   }

   public float dG() {
      return this.aF;
   }

   public float dH() {
      return this.dG();
   }

   public void s(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aF = $$0;
      }
   }

   public float dI() {
      return this.aG;
   }

   public void t(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aG = $$0;
      }
   }

   public boolean dJ() {
      return false;
   }

   public float dK() {
      return 0.0F;
   }

   public void a(@Nullable bsg $$0) {
   }

   public final boolean dL() {
      return this.aJ != null;
   }

   @Nullable
   public bsg.c dM() {
      return this.aJ;
   }

   @Override
   public final void b(bsg.c $$0) {
      if (this.aJ == null) {
         this.aJ = $$0;
      }

      if (this.aJ.a()) {
         this.ac();
      }

      this.cT().forEach(bsg::ac);
      this.aX.a($$0);
   }

   protected void dN() {
      this.aJ = null;
   }

   @Override
   public void a(dwo $$0) {
      this.aX = $$0;
   }

   @Override
   public boolean dO() {
      if (this.aJ != null && !this.aJ.b()) {
         return false;
      } else {
         return this.bS() ? false : !this.bT() || !this.cZ();
      }
   }

   @Override
   public boolean dP() {
      return false;
   }

   public boolean a(dcf $$0, ja $$1) {
      return true;
   }

   public dcf dQ() {
      return this.r;
   }

   protected void a(dcf $$0) {
      this.r = $$0;
   }

   public bra dR() {
      return this.dQ().aj();
   }

   public jx dS() {
      return this.dQ().H_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = ayg.d($$6, this.dv(), $$1);
      double $$8 = ayg.d($$6, this.dx(), $$2);
      double $$9 = ayg.d($$6, this.dB(), $$3);
      float $$10 = (float)ayg.e($$6, (double)this.dG(), $$4);
      float $$11 = (float)ayg.d($$6, (double)this.dI(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   public ayo dT() {
      return this.ah;
   }

   public ewf af() {
      return this.dt();
   }

   @FunctionalInterface
   public interface a {
      void accept(bsg var1, double var2, double var4, double var6);
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
