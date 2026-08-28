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

public abstract class bsh implements ajs, bqm, dwo, ep, exk {
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
   private static final ewc d = new ewc(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double e = 0.014;
   private static final double k = 0.007;
   private static final double l = 0.0023333333333333335;
   public static final String I = "UUID";
   private static double m = 1.0;
   private final bsn<?> n;
   private int o = c.incrementAndGet();
   public boolean J;
   private ImmutableList<bsh> p = ImmutableList.of();
   protected int K;
   @Nullable
   private bsh q;
   private dcg r;
   public double L;
   public double M;
   public double N;
   private ewh s;
   private ja t;
   private dbn u;
   private ewh v = ewh.b;
   private float aF;
   private float aG;
   public float O;
   public float P;
   private ewc aH = d;
   private boolean aI;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   public boolean U;
   protected ewh V = ewh.b;
   @Nullable
   private bsh.d aJ;
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
   private int aL = -this.dh();
   protected boolean aj;
   protected Object2DoubleMap<awm<eoi>> ak = new Object2DoubleArrayMap(2);
   protected boolean al;
   private final Set<awm<eoi>> aM = new HashSet<>();
   public int am;
   protected boolean an = true;
   protected final ajt ao;
   protected static final ajp<Byte> ap = ajt.a(bsh.class, ajr.a);
   protected static final int aq = 0;
   private static final int aN = 1;
   private static final int aO = 3;
   private static final int aP = 4;
   private static final int aQ = 5;
   protected static final int ar = 6;
   protected static final int as = 7;
   private static final ajp<Integer> aR = ajt.a(bsh.class, ajr.b);
   private static final ajp<Optional<wu>> aS = ajt.a(bsh.class, ajr.g);
   private static final ajp<Boolean> aT = ajt.a(bsh.class, ajr.k);
   private static final ajp<Boolean> aU = ajt.a(bsh.class, ajr.k);
   private static final ajp<Boolean> aV = ajt.a(bsh.class, ajr.k);
   protected static final ajp<bto> at = ajt.a(bsh.class, ajr.w);
   private static final ajp<Integer> aW = ajt.a(bsh.class, ajr.b);
   private dwp aX = dwp.a;
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
   private bsk bf;
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
   private dsl bl = null;

   public bsh(bsn<?> $$0, dcg $$1) {
      this.n = $$0;
      this.r = $$1;
      this.bf = $$0.n();
      this.s = ewh.b;
      this.t = ja.c;
      this.u = dbn.b;
      ajt.a $$2 = new ajt.a(this);
      $$2.a(ap, (byte)0);
      $$2.a(aR, this.cm());
      $$2.a(aT, false);
      $$2.a(aS, Optional.empty());
      $$2.a(aU, false);
      $$2.a(aV, false);
      $$2.a(at, bto.a);
      $$2.a(aW, 0);
      this.a($$2);
      this.ao = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.bg = this.bf.c();
   }

   public boolean a(ja $$0, dsl $$1) {
      exa $$2 = $$1.b(this.dR(), $$0, ewm.a(this));
      exa $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return ewx.c($$3, ewx.a(this.cM()), ewl.i);
   }

   public int q_() {
      exn $$0 = this.cl();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean N_() {
      return false;
   }

   public final void ak() {
      if (this.bU()) {
         this.bJ();
      }

      if (this.bT()) {
         this.ad();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.aY.e(new ewh($$0, $$1, $$2));
   }

   public ahz al() {
      return this.aY;
   }

   public bsn<?> am() {
      return this.n;
   }

   @Override
   public int an() {
      return this.o;
   }

   public void e(int $$0) {
      this.o = $$0;
   }

   public Set<String> ao() {
      return this.bc;
   }

   public boolean a(String $$0) {
      return this.bc.size() >= 1024 ? false : this.bc.add($$0);
   }

   public boolean b(String $$0) {
      return this.bc.remove($$0);
   }

   public void ap() {
      this.a(bsh.d.a);
      this.a(dxh.p);
   }

   public final void aq() {
      this.a(bsh.d.b);
   }

   protected abstract void a(ajt.a var1);

   public ajt ar() {
      return this.ao;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bsh ? ((bsh)$$0).o == this.o : false;
   }

   @Override
   public int hashCode() {
      return this.o;
   }

   public void a(bsh.d $$0) {
      this.b($$0);
   }

   public void as() {
   }

   public void b(bto $$0) {
      this.ao.a(at, $$0);
   }

   public bto at() {
      return this.ao.a(at);
   }

   public boolean c(bto $$0) {
      return this.at() == $$0;
   }

   public boolean a(bsh $$0, double $$1) {
      return this.dp().a((jt)$$0.dp(), $$1);
   }

   public boolean a(bsh $$0, double $$1, double $$2) {
      double $$3 = $$0.dw() - this.dw();
      double $$4 = $$0.dy() - this.dy();
      double $$5 = $$0.dC() - this.dC();
      return ayg.e($$3, $$5) < ayg.k($$1) && ayg.k($$4) < ayg.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.s($$0 % 360.0F);
      this.t($$1 % 360.0F);
   }

   public final void c(ewh $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.au());
   }

   protected ewc au() {
      return this.bf.a(this.s);
   }

   protected void av() {
      this.a_(this.s.c, this.s.d, this.s.e);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.t(this.dJ() + $$2);
      this.s(this.dH() + $$3);
      this.t(ayg.a(this.dJ(), -90.0F, 90.0F));
      this.P += $$2;
      this.O += $$3;
      this.P = ayg.a(this.P, -90.0F, 90.0F);
      if (this.q != null) {
         this.q.k(this);
      }
   }

   public void l() {
      this.aw();
   }

   public void aw() {
      this.dR().ag().a("entityBaseTick");
      this.bl = null;
      if (this.bT() && this.de().dM()) {
         this.ad();
      }

      if (this.K > 0) {
         this.K--;
      }

      this.Y = this.Z;
      this.P = this.dJ();
      this.O = this.dH();
      this.bQ();
      if (this.bs()) {
         this.bt();
      }

      this.aC = this.aB;
      this.aB = false;
      this.bn();
      this.z();
      this.bm();
      if (this.dR().B) {
         this.aE();
      } else if (this.aL > 0) {
         if (this.bf()) {
            this.h(this.aL - 4);
            if (this.aL < 0) {
               this.aE();
            }
         } else {
            if (this.aL % 20 == 0 && !this.bu()) {
               this.a(this.dS().d(), 1.0F);
            }

            this.h(this.aL - 1);
         }

         if (this.co() > 0) {
            this.k(0);
            this.dR().a(null, 1009, this.t, 1);
         }
      }

      if (this.bu()) {
         this.aC();
         this.ac *= 0.5F;
      }

      this.ax();
      if (!this.dR().B) {
         this.d(this.aL > 0);
      }

      this.an = false;
      this.dR().ag().c();
   }

   public void d(boolean $$0) {
      this.b(0, $$0 || this.bk);
   }

   public void ax() {
      if (this.dy() < (double)(this.dR().I_() - 64)) {
         this.aF();
      }
   }

   public void ay() {
      this.aZ = this.bR();
   }

   public void f(int $$0) {
      this.aZ = $$0;
   }

   public int az() {
      return this.aZ;
   }

   public boolean aA() {
      return this.aZ > 0;
   }

   protected void M() {
      if (this.aA()) {
         this.aZ--;
      }
   }

   public int aB() {
      return 0;
   }

   public void aC() {
      if (!this.bf()) {
         this.d(15.0F);
         if (this.a(this.dS().e(), 4.0F)) {
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

   public int aD() {
      return this.aL;
   }

   public void aE() {
      this.h(0);
   }

   protected void aF() {
      this.aq();
   }

   public boolean g(double $$0, double $$1, double $$2) {
      return this.b(this.cM().d($$0, $$1, $$2));
   }

   private boolean b(ewc $$0) {
      return this.dR().a(this, $$0) && !this.dR().d($$0);
   }

   public void e(boolean $$0) {
      this.aI = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, ewh $$1) {
      this.aI = $$0;
      this.b($$0, $$1);
   }

   public boolean d(ja $$0) {
      return this.aE.isPresent() && this.aE.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable ewh $$1) {
      if ($$0) {
         ewc $$2 = this.cM();
         ewc $$3 = new ewc($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<ja> $$4 = this.r.g(this, $$3);
         if ($$4.isPresent() || this.bh) {
            this.aE = $$4;
         } else if ($$1 != null) {
            ewc $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
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

   public boolean aG() {
      return this.aI;
   }

   public void a(bth $$0, ewh $$1) {
      if (this.ag) {
         this.a_(this.dw() + $$1.c, this.dy() + $$1.d, this.dC() + $$1.e);
      } else {
         this.aD = this.bS();
         if ($$0 == bth.c) {
            $$1 = this.e($$1);
            if ($$1.equals(ewh.b)) {
               return;
            }
         }

         this.dR().ag().a("move");
         if (this.V.g() > 1.0E-7) {
            $$1 = $$1.h(this.V);
            this.V = ewh.b;
            this.j(ewh.b);
         }

         $$1 = this.a($$1, $$0);
         ewh $$2 = this.a($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.ac != 0.0F && $$3 >= 1.0) {
               ewd $$4 = this.dR().a(new dbp(this.dp(), this.dp().e($$2), dbp.a.d, dbp.b.d, this));
               if ($$4.c() != ewf.a.a) {
                  this.n();
               }
            }

            this.a_(this.dw() + $$2.c, this.dy() + $$2.d, this.dC() + $$2.e);
         }

         this.dR().ag().c();
         this.dR().ag().a("rest");
         boolean $$5 = !ayg.b($$1.c, $$2.c);
         boolean $$6 = !ayg.b($$1.e, $$2.e);
         this.Q = $$5 || $$6;
         this.R = $$1.d != $$2.d;
         this.S = this.R && $$1.d < 0.0;
         if (this.Q) {
            this.T = this.d($$2);
         } else {
            this.T = false;
         }

         this.a(this.S, $$2);
         ja $$7 = this.aL();
         dsl $$8 = this.dR().a_($$7);
         this.a($$2.d, this.aG(), $$8, $$7);
         if (this.dM()) {
            this.dR().ag().c();
         } else {
            if (this.Q) {
               ewh $$9 = this.du();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            dfi $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dR(), this);
            }

            if (this.aG()) {
               $$10.a(this.dR(), $$7, $$8, this);
            }

            bsh.c $$11 = this.bd();
            if ($$11.a() && !this.bT()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.ab = this.ab + (float)($$2.f() * 0.6);
               ja $$15 = this.aN();
               dsl $$16 = this.dR().a_($$15);
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
                     this.aK = this.aQ();
                  } else if (this.bg()) {
                     this.aK = this.aQ();
                     if ($$11.c()) {
                        this.aV();
                     }

                     if ($$11.b()) {
                        this.a(dxh.Q);
                     }
                  }
               } else if ($$16.i()) {
                  this.aK();
               }
            }

            this.aH();
            float $$20 = this.aP();
            this.j(this.du().d((double)$$20, 1.0, (double)$$20));
            if (this.dR().c(this.cM().h(1.0E-6)).noneMatch($$0x -> $$0x.a(avw.aK) || $$0x.a(dfk.H))) {
               if (this.aL <= 0) {
                  this.h(-this.dh());
               }

               if (this.aD && (this.aB || this.bi())) {
                  this.aI();
               }
            }

            if (this.bS() && (this.aB || this.bi())) {
               this.h(-this.dh());
            }

            this.dR().ag().c();
         }
      }
   }

   private boolean c(dsl $$0) {
      return $$0.a(avw.aP) || $$0.a(dfk.qP);
   }

   private boolean a(ja $$0, dsl $$1, boolean $$2, boolean $$3, ewh $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aG() || $$5 || this.cc() && $$4.d == 0.0 || this.ck()) && !this.ce()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dR().a(dxh.P, this.dp(), dxh.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean d(ewh $$0) {
      return false;
   }

   protected void aH() {
      try {
         this.aU();
      } catch (Throwable var4) {
         o $$1 = o.a(var4, "Checking entity block collision");
         p $$2 = $$1.a("Entity being checked for collision");
         this.a($$2);
         throw new y($$1);
      }
   }

   protected void aI() {
      this.a(avh.kf, 0.7F, 1.6F + (this.ah.i() - this.ah.i()) * 0.4F);
   }

   public void aJ() {
      if (!this.dR().B && this.aD) {
         this.aI();
      }

      this.aE();
   }

   protected void aK() {
      if (this.aX()) {
         this.aW();
         if (this.bd().b()) {
            this.a(dxh.x);
         }
      }
   }

   @Deprecated
   public ja aL() {
      return this.e(0.2F);
   }

   public ja aM() {
      return this.e(0.500001F);
   }

   public ja aN() {
      return this.e(1.0E-5F);
   }

   protected ja e(float $$0) {
      if (this.aE.isPresent()) {
         ja $$1 = this.aE.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dsl $$2 = this.dR().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(avw.S)) && !$$2.a(avw.L) && !($$2.b() instanceof dih) ? $$1.h(ayg.a(this.s.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = ayg.a(this.s.c);
         int $$4 = ayg.a(this.s.d - (double)$$0);
         int $$5 = ayg.a(this.s.e);
         return new ja($$3, $$4, $$5);
      }
   }

   protected float aO() {
      float $$0 = this.dR().a_(this.dr()).b().k();
      float $$1 = this.dR().a_(this.aM()).b().k();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aP() {
      dsl $$0 = this.dR().a_(this.dr());
      float $$1 = $$0.b().j();
      if (!$$0.a(dfk.G) && !$$0.a(dfk.nd)) {
         return (double)$$1 == 1.0 ? this.dR().a_(this.aM()).b().j() : $$1;
      } else {
         return $$1;
      }
   }

   protected ewh a(ewh $$0, bth $$1) {
      return $$0;
   }

   protected ewh e(ewh $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dR().Z();
         if ($$1 != this.be) {
            Arrays.fill(this.bd, 0.0);
            this.be = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(jf.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? ewh.b : new ewh($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(jf.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? ewh.b : new ewh(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(jf.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? ewh.b : new ewh(0.0, 0.0, $$4);
         } else {
            return ewh.b;
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

   private ewh a(ewh $$0) {
      ewc $$1 = this.cM();
      List<exa> $$2 = this.dR().c(this, $$1.b($$0));
      ewh $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dR(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = $$5 && $$0.d < 0.0;
      if (this.dL() > 0.0F && ($$7 || this.aG()) && ($$4 || $$6)) {
         ewc $$8 = $$7 ? $$1.d(0.0, $$3.d, 0.0) : $$1;
         ewc $$9 = $$8.b($$0.c, (double)this.dL(), $$0.e);
         if (!$$7) {
            $$9 = $$9.b(0.0, -1.0E-5F, 0.0);
         }

         List<exa> $$10 = a(this, this.r, $$2, $$9);
         float $$11 = (float)$$3.d;
         float[] $$12 = a($$8, $$10, this.dL(), $$11);

         for (float $$13 : $$12) {
            ewh $$14 = a(new ewh($$0.c, (double)$$13, $$0.e), $$8, $$10);
            if ($$14.i() > $$3.i()) {
               return $$14;
            }
         }
      }

      return $$3;
   }

   private static float[] a(ewc $$0, List<exa> $$1, float $$2, float $$3) {
      FloatSet $$4 = new FloatArraySet(4);

      for (exa $$5 : $$1) {
         DoubleList $$6 = $$5.a(jf.a.b);
         DoubleListIterator var8 = $$6.iterator();

         while (var8.hasNext()) {
            double $$7 = (Double)var8.next();
            float $$8 = (float)($$7 - $$0.b);
            if (!($$8 < 0.0F) && !ayg.a($$8, $$3)) {
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

   public static ewh a(@Nullable bsh $$0, ewh $$1, ewc $$2, dcg $$3, List<exa> $$4) {
      List<exa> $$5 = a($$0, $$3, $$4, $$2.b($$1));
      return a($$1, $$2, $$5);
   }

   private static List<exa> a(@Nullable bsh $$0, dcg $$1, List<exa> $$2, ewc $$3) {
      Builder<exa> $$4 = ImmutableList.builderWithExpectedSize($$2.size() + 1);
      if (!$$2.isEmpty()) {
         $$4.addAll($$2);
      }

      duc $$5 = $$1.C_();
      boolean $$6 = $$0 != null && $$5.a($$0, $$3);
      if ($$6) {
         $$4.add($$5.c());
      }

      $$4.addAll($$1.e($$0, $$3));
      return $$4.build();
   }

   private static ewh a(ewh $$0, ewc $$1, List<exa> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = ewx.a(jf.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = ewx.a(jf.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = ewx.a(jf.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = ewx.a(jf.a.c, $$1, $$2, $$5);
         }

         return new ewh($$3, $$4, $$5);
      }
   }

   protected float aQ() {
      return (float)((int)this.aa + 1);
   }

   protected avg aR() {
      return avh.kj;
   }

   protected avg aS() {
      return avh.ki;
   }

   protected avg aT() {
      return avh.ki;
   }

   protected void aU() {
      ewc $$0 = this.cM();
      ja $$1 = ja.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      ja $$2 = ja.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dR().a($$1, $$2)) {
         ja.a $$3 = new ja.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  if (!this.bF()) {
                     return;
                  }

                  $$3.d($$4, $$5, $$6);
                  dsl $$7 = this.dR().a_($$3);

                  try {
                     $$7.a(this.dR(), $$3, this);
                     this.a($$7);
                  } catch (Throwable var12) {
                     o $$9 = o.a(var12, "Colliding entity with block");
                     p $$10 = $$9.a("Block being collided with");
                     p.a($$10, this.dR(), $$3, $$7);
                     throw new y($$9);
                  }
               }
            }
         }
      }
   }

   protected void a(dsl $$0) {
   }

   public void a(jj<dxh> $$0, @Nullable bsh $$1) {
      this.dR().a($$1, $$0, this.s);
   }

   public void a(jj<dxh> $$0) {
      this.a($$0, this);
   }

   private void c(ja $$0, dsl $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.v();
      }
   }

   protected void aV() {
      bsh $$0 = Objects.requireNonNullElse(this.cS(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      ewh $$2 = $$0.du();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.f($$3);
   }

   protected ja e(ja $$0) {
      ja $$1 = $$0.c();
      dsl $$2 = this.dR().a_($$1);
      return !$$2.a(avw.bn) && !$$2.a(avw.bo) ? $$0 : $$1;
   }

   protected void a(dsl $$0, dsl $$1) {
      dmv $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dsl $$0) {
      dmv $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(ja $$0, dsl $$1) {
      dmv $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dsl $$0) {
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
      this.a(this.aR(), $$0, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
   }

   protected void aW() {
   }

   protected boolean aX() {
      return false;
   }

   public void a(avg $$0, float $$1, float $$2) {
      if (!this.aY()) {
         this.dR().a(null, this.dw(), this.dy(), this.dC(), $$0, this.dg(), $$1, $$2);
      }
   }

   public void a(avg $$0) {
      if (!this.aY()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean aY() {
      return this.ao.a(aU);
   }

   public void f(boolean $$0) {
      this.ao.a(aU, $$0);
   }

   public boolean aZ() {
      return this.ao.a(aV);
   }

   public void g(boolean $$0) {
      this.ao.a(aV, $$0);
   }

   protected double ba() {
      return 0.0;
   }

   public final double bb() {
      return this.aZ() ? 0.0 : this.ba();
   }

   protected void bc() {
      double $$0 = this.bb();
      if ($$0 != 0.0) {
         this.j(this.du().b(0.0, -$$0, 0.0));
      }
   }

   protected bsh.c bd() {
      return bsh.c.d;
   }

   public boolean be() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dsl $$2, ja $$3) {
      if ($$1) {
         if (this.ac > 0.0F) {
            $$2.b().a(this.dR(), $$2, $$3, this, this.ac);
            this.dR().a(dxh.A, this.s, dxh.a.a(this, this.aE.<dsl>map($$0x -> this.dR().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.ac -= (float)$$0;
      }
   }

   public boolean bf() {
      return this.am().d();
   }

   public boolean a(float $$0, float $$1, bra $$2) {
      if (this.n.a(awa.o)) {
         return false;
      } else {
         if (this.bU()) {
            for (bsh $$3 : this.cU()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean bg() {
      return this.aj;
   }

   private boolean w() {
      ja $$0 = this.dr();
      return this.dR().r($$0) || this.dR().r(ja.a((double)$$0.u(), this.cM().e, (double)$$0.w()));
   }

   private boolean y() {
      return this.ds().a(dfk.nd);
   }

   public boolean bh() {
      return this.bg() || this.w();
   }

   public boolean bi() {
      return this.bg() || this.w() || this.y();
   }

   public boolean bj() {
      return this.bg() || this.y();
   }

   public boolean bk() {
      return this.bj() || this.bu();
   }

   public boolean bl() {
      return this.al && this.bg();
   }

   public void bm() {
      if (this.ce()) {
         this.j(this.cd() && this.bg() && !this.bT());
      } else {
         this.j(this.cd() && this.bl() && !this.bT() && this.dR().b_(this.t).a(awc.a));
      }
   }

   protected boolean bn() {
      this.ak.clear();
      this.bo();
      double $$0 = this.dR().D_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(awc.b, $$0);
      return this.bg() || $$1;
   }

   void bo() {
      if (this.de() instanceof coi $$0 && !$$0.bl()) {
         this.aj = false;
         return;
      }

      if (this.a(awc.a, 0.014)) {
         if (!this.aj && !this.an) {
            this.bp();
         }

         this.n();
         this.aj = true;
         this.aE();
      } else {
         this.aj = false;
      }
   }

   private void z() {
      this.al = this.a(awc.a);
      this.aM.clear();
      double $$0 = this.dA();
      if (this.de() instanceof coi $$2 && !$$2.bl() && $$2.cM().e >= $$0 && $$2.cM().b <= $$0) {
         return;
      }

      ja $$3 = ja.a(this.dw(), $$0, this.dC());
      eoj $$4 = this.dR().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((dbm)this.dR(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aM::add);
      }
   }

   protected void bp() {
      bsh $$0 = Objects.requireNonNullElse(this.cS(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      ewh $$2 = $$0.du();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aS(), $$3, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
      } else {
         this.a(this.aT(), $$3, 1.0F + (this.ah.i() - this.ah.i()) * 0.4F);
      }

      float $$4 = (float)ayg.a(this.dy());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bf.a() * 20.0F; $$5++) {
         double $$6 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         double $$7 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         this.dR().a(lj.d, this.dw() + $$6, (double)($$4 + 1.0F), this.dC() + $$7, $$2.c, $$2.d - this.ah.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bf.a() * 20.0F; $$8++) {
         double $$9 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         double $$10 = (this.ah.j() * 2.0 - 1.0) * (double)this.bf.a();
         this.dR().a(lj.am, this.dw() + $$9, (double)($$4 + 1.0F), this.dC() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(dxh.O);
   }

   @Deprecated
   protected dsl bq() {
      return this.dR().a_(this.aL());
   }

   public dsl br() {
      return this.dR().a_(this.aN());
   }

   public boolean bs() {
      return this.cd() && !this.bg() && !this.N_() && !this.cc() && !this.bu() && this.bF();
   }

   protected void bt() {
      ja $$0 = this.aL();
      dsl $$1 = this.dR().a_($$0);
      if ($$1.l() != dlo.a) {
         ewh $$2 = this.du();
         ja $$3 = this.dr();
         double $$4 = this.dw() + (this.ah.j() - 0.5) * (double)this.bf.a();
         double $$5 = this.dC() + (this.ah.j() - 0.5) * (double)this.bf.a();
         if ($$3.u() != $$0.u()) {
            $$4 = ayg.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = ayg.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dR().a(new lb(lj.b, $$1), $$4, this.dy() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(awm<eoi> $$0) {
      return this.aM.contains($$0);
   }

   public boolean bu() {
      return !this.an && this.ak.getDouble(awc.b) > 0.0;
   }

   public void a(float $$0, ewh $$1) {
      ewh $$2 = a($$1, $$0, this.dH());
      this.j(this.du().e($$2));
   }

   private static ewh a(ewh $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return ewh.b;
      } else {
         ewh $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = ayg.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = ayg.b($$2 * (float) (Math.PI / 180.0));
         return new ewh($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bv() {
      return this.dR().f(this.dv(), this.dB()) ? this.dR().x(ja.a(this.dw(), this.dA(), this.dC())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.b($$3, $$4);
   }

   public void b(float $$0, float $$1) {
      this.s($$0 % 360.0F);
      this.t(ayg.a($$1, -90.0F, 90.0F) % 360.0F);
      this.O = this.dH();
      this.P = this.dJ();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = ayg.a($$0, -3.0E7, 3.0E7);
      double $$4 = ayg.a($$2, -3.0E7, 3.0E7);
      this.L = $$3;
      this.M = $$1;
      this.N = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void f(ewh $$0) {
      this.e($$0.c, $$0.d, $$0.e);
   }

   public void e(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dH(), this.dJ());
   }

   public void a(ja $$0, float $$1, float $$2) {
      this.b((double)$$0.u() + 0.5, (double)$$0.v(), (double)$$0.w() + 0.5, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.p($$0, $$1, $$2);
      this.s($$3);
      this.t($$4);
      this.bw();
      this.av();
   }

   public final void bw() {
      double $$0 = this.dw();
      double $$1 = this.dy();
      double $$2 = this.dC();
      this.L = $$0;
      this.M = $$1;
      this.N = $$2;
      this.ad = $$0;
      this.ae = $$1;
      this.af = $$2;
      this.O = this.dH();
      this.P = this.dJ();
   }

   public float f(bsh $$0) {
      float $$1 = (float)(this.dw() - $$0.dw());
      float $$2 = (float)(this.dy() - $$0.dy());
      float $$3 = (float)(this.dC() - $$0.dC());
      return ayg.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dw() - $$0;
      double $$4 = this.dy() - $$1;
      double $$5 = this.dC() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(bsh $$0) {
      return this.g($$0.dp());
   }

   public double g(ewh $$0) {
      double $$1 = this.dw() - $$0.c;
      double $$2 = this.dy() - $$0.d;
      double $$3 = this.dC() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(cml $$0) {
   }

   public void h(bsh $$0) {
      if (!this.y($$0)) {
         if (!$$0.ag && !this.ag) {
            double $$1 = $$0.dw() - this.dw();
            double $$2 = $$0.dC() - this.dC();
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
               if (!this.bU() && this.bC()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.bU() && $$0.bC()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void h(ewh $$0) {
      this.j($$0.c, $$0.d, $$0.e);
   }

   public void j(double $$0, double $$1, double $$2) {
      this.j(this.du().b($$0, $$1, $$2));
      this.av = true;
   }

   protected void bx() {
      this.U = true;
   }

   public boolean a(bra $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bx();
         return false;
      }
   }

   public final ewh g(float $$0) {
      return this.c(this.h($$0), this.i($$0));
   }

   public jf by() {
      return jf.a(this.g(1.0F));
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dJ() : ayg.i($$0, this.P, this.dJ());
   }

   public float i(float $$0) {
      return $$0 == 1.0F ? this.dH() : ayg.i($$0, this.O, this.dH());
   }

   public final ewh c(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = ayg.b($$3);
      float $$5 = ayg.a($$3);
      float $$6 = ayg.b($$2);
      float $$7 = ayg.a($$2);
      return new ewh((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final ewh j(float $$0) {
      return this.d(this.h($$0), this.i($$0));
   }

   protected final ewh d(float $$0, float $$1) {
      return this.c($$0 - 90.0F, $$1);
   }

   public final ewh bz() {
      return new ewh(this.dw(), this.dA(), this.dC());
   }

   public final ewh k(float $$0) {
      double $$1 = ayg.d((double)$$0, this.L, this.dw());
      double $$2 = ayg.d((double)$$0, this.M, this.dy()) + (double)this.cN();
      double $$3 = ayg.d((double)$$0, this.N, this.dC());
      return new ewh($$1, $$2, $$3);
   }

   public ewh l(float $$0) {
      return this.k($$0);
   }

   public final ewh m(float $$0) {
      double $$1 = ayg.d((double)$$0, this.L, this.dw());
      double $$2 = ayg.d((double)$$0, this.M, this.dy());
      double $$3 = ayg.d((double)$$0, this.N, this.dC());
      return new ewh($$1, $$2, $$3);
   }

   public ewf a(double $$0, float $$1, boolean $$2) {
      ewh $$3 = this.k($$1);
      ewh $$4 = this.g($$1);
      ewh $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dR().a(new dbp($$3, $$5, dbp.a.b, $$2 ? dbp.b.c : dbp.b.a, this));
   }

   public boolean bA() {
      return this.bF() && this.bB();
   }

   public boolean bB() {
      return false;
   }

   public boolean bC() {
      return false;
   }

   public void a(bsh $$0, int $$1, bra $$2) {
      if ($$0 instanceof aqn) {
         am.d.a((aqn)$$0, this, $$2);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.dw() - $$0;
      double $$4 = this.dy() - $$1;
      double $$5 = this.dC() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cM().a();
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
         String $$1 = this.bE();
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
      return this.bT() ? false : this.d($$0);
   }

   public tx f(tx $$0) {
      try {
         if (this.q != null) {
            $$0.a("Pos", this.a(this.q.dw(), this.dy(), this.q.dC()));
         } else {
            $$0.a("Pos", this.a(this.dw(), this.dy(), this.dC()));
         }

         ewh $$1 = this.du();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dH(), this.dJ()));
         $$0.a("FallDistance", this.ac);
         $$0.a("Fire", (short)this.aL);
         $$0.a("Air", (short)this.cn());
         $$0.a("OnGround", this.aG());
         $$0.a("Invulnerable", this.ba);
         $$0.a("PortalCooldown", this.aZ);
         $$0.a("UUID", this.cB());
         wu $$2 = this.aj();
         if ($$2 != null) {
            $$0.a("CustomName", wu.a.a($$2, this.dT()));
         }

         if (this.cG()) {
            $$0.a("CustomNameVisible", this.cG());
         }

         if (this.aY()) {
            $$0.a("Silent", this.aY());
         }

         if (this.aZ()) {
            $$0.a("NoGravity", this.aZ());
         }

         if (this.bb) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.co();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.co());
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
         if (this.bU()) {
            ud $$6 = new ud();

            for (bsh $$7 : this.cU()) {
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
         this.bw();
         this.o(this.dH());
         this.p(this.dH());
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

         if (!Double.isFinite(this.dw()) || !Double.isFinite(this.dy()) || !Double.isFinite(this.dC())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dH()) && Double.isFinite((double)this.dJ())) {
            this.av();
            this.a(this.dH(), this.dJ());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(wu.a.a($$8, this.dT()));
               } catch (Exception var16) {
                  b.warn("Failed to parse entity custom name {}", $$8, var16);
               }
            }

            this.p($$0.q("CustomNameVisible"));
            this.f($$0.q("Silent"));
            this.g($$0.q("NoGravity"));
            this.k($$0.q("Glowing"));
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
            if (this.bD()) {
               this.av();
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

   protected boolean bD() {
      return true;
   }

   @Nullable
   protected final String bE() {
      bsn<?> $$0 = this.am();
      akk $$1 = bsn.a($$0);
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
   public civ a(dcf $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public civ a(dcf $$0, int $$1) {
      return this.a(new cud($$0), (float)$$1);
   }

   @Nullable
   public civ b(cud $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public civ a(cud $$0, float $$1) {
      if ($$0.e()) {
         return null;
      } else if (this.dR().B) {
         return null;
      } else {
         civ $$2 = new civ(this.dR(), this.dw(), this.dy() + (double)$$1, this.dC(), $$0);
         $$2.v();
         this.dR().b($$2);
         return $$2;
      }
   }

   public boolean bF() {
      return !this.dM();
   }

   public boolean bG() {
      if (this.ag) {
         return false;
      } else {
         float $$0 = this.bf.a() * 0.8F;
         ewc $$1 = ewc.a(this.bz(), (double)$$0, 1.0E-6, (double)$$0);
         return ja.a($$1)
            .anyMatch(
               $$1x -> {
                  dsl $$2 = this.dR().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dR(), $$1x)
                     && ewx.c($$2.k(this.dR(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), ewx.a($$1), ewl.i);
               }
            );
      }
   }

   public bqh a(cml $$0, bqg $$1) {
      return bqh.e;
   }

   public boolean i(bsh $$0) {
      return $$0.bH() && !this.y($$0);
   }

   public boolean bH() {
      return false;
   }

   public void u() {
      this.j(ewh.b);
      this.l();
      if (this.bT()) {
         this.de().j(this);
      }
   }

   public final void j(bsh $$0) {
      if (this.x($$0)) {
         this.a($$0, bsh::a_);
      }
   }

   protected void a(bsh $$0, bsh.b $$1) {
      ewh $$2 = this.m($$0);
      ewh $$3 = $$0.l(this);
      $$1.accept($$0, $$2.c - $$3.c, $$2.d - $$3.d, $$2.e - $$3.e);
   }

   public void k(bsh $$0) {
   }

   public ewh l(bsh $$0) {
      return this.do().b(bsi.b, 0, this.aF);
   }

   public ewh m(bsh $$0) {
      return this.dp().e(this.a($$0, this.bf, 1.0F));
   }

   protected ewh a(bsh $$0, bsk $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static ewh a(bsh $$0, bsh $$1, bsj $$2) {
      int $$3 = $$0.cU().indexOf($$1);
      return $$2.c(bsi.a, $$3, $$0.aF);
   }

   public boolean n(bsh $$0) {
      return this.a($$0, false);
   }

   public boolean bI() {
      return this instanceof btc;
   }

   public boolean a(bsh $$0, boolean $$1) {
      if ($$0 == this.q) {
         return false;
      } else if (!$$0.bL()) {
         return false;
      } else {
         for (bsh $$2 = $$0; $$2.q != null; $$2 = $$2.q) {
            if ($$2.q == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bT()) {
               this.ad();
            }

            this.b(bto.a);
            this.q = $$0;
            this.q.p(this);
            $$0.F().filter($$0x -> $$0x instanceof aqn).forEach($$0x -> am.U.a((aqn)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bsh $$0) {
      return !this.bX() && this.K <= 0;
   }

   public void bJ() {
      for (int $$0 = this.p.size() - 1; $$0 >= 0; $$0--) {
         ((bsh)this.p.get($$0)).ad();
      }
   }

   public void bK() {
      if (this.q != null) {
         bsh $$0 = this.q;
         this.q = null;
         $$0.q(this);
      }
   }

   public void ad() {
      this.bK();
   }

   protected void p(bsh $$0) {
      if ($$0.de() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.p.isEmpty()) {
            this.p = ImmutableList.of($$0);
         } else {
            List<bsh> $$1 = Lists.newArrayList(this.p);
            if (!this.dR().B && $$0 instanceof cml && !(this.cV() instanceof cml)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.p = ImmutableList.copyOf($$1);
         }

         this.a(dxh.s, $$0);
      }
   }

   protected void q(bsh $$0) {
      if ($$0.de() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.p.size() == 1 && this.p.get(0) == $$0) {
            this.p = ImmutableList.of();
         } else {
            this.p = this.p.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.K = 60;
         this.a(dxh.q, $$0);
      }
   }

   protected boolean r(bsh $$0) {
      return this.p.isEmpty();
   }

   protected boolean bL() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public double c_() {
      return this.dw();
   }

   public double d_() {
      return this.dy();
   }

   public double L_() {
      return this.dC();
   }

   public float M_() {
      return this.dJ();
   }

   public float e_() {
      return this.dH();
   }

   public void a(float $$0, int $$1) {
      this.o($$0);
   }

   public float bM() {
      return 0.0F;
   }

   public ewh bN() {
      return this.c(this.dJ(), this.dH());
   }

   public ewh a(cty $$0) {
      if (!(this instanceof cml $$1)) {
         return ewh.b;
      } else {
         boolean $$2 = $$1.eW().a($$0) && !$$1.eV().a($$0);
         bsw $$3 = $$2 ? $$1.fs().e() : $$1.fs();
         return this.c(0.0F, this.dH() + (float)($$3 == bsw.b ? 80 : -80)).a(0.5);
      }
   }

   public ewg bO() {
      return new ewg(this.dJ(), this.dH());
   }

   public ewh bP() {
      return ewh.a(this.bO());
   }

   public void f(ja $$0) {
      if (this.aA()) {
         this.ay();
      } else {
         if (!this.dR().B && !$$0.equals(this.ay)) {
            this.ay = $$0.i();
         }

         this.aw = true;
      }
   }

   protected void bQ() {
      if (this.dR() instanceof aqm) {
         int $$0 = this.aB();
         aqm $$1 = (aqm)this.dR();
         if (this.aw) {
            MinecraftServer $$2 = $$1.o();
            akj<dcg> $$3 = this.dR().af() == dcg.i ? dcg.h : dcg.i;
            aqm $$4 = $$2.a($$3);
            if ($$4 != null && $$2.H() && !this.bT() && this.ax++ >= $$0) {
               this.dR().ag().a("portal");
               this.ax = $$0;
               this.ay();
               this.a(() -> this.a($$4));
               this.dR().ag().c();
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

         this.M();
      }
   }

   public int bR() {
      return 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
   }

   public void c(bra $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            djc.a(this);
      }
   }

   public void n(float $$0) {
   }

   public boolean bS() {
      boolean $$0 = this.dR() != null && this.dR().B;
      return !this.bf() && (this.aL > 0 || $$0 && this.i(0));
   }

   public boolean bT() {
      return this.de() != null;
   }

   public boolean bU() {
      return !this.p.isEmpty();
   }

   public boolean bV() {
      return this.am().a(awa.p);
   }

   public boolean bW() {
      return !this.am().a(awa.q);
   }

   public void h(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean bX() {
      return this.i(1);
   }

   public boolean bY() {
      return this.bX();
   }

   public boolean bZ() {
      return this.bX();
   }

   public boolean ca() {
      return this.bX();
   }

   public boolean cb() {
      return this.bX();
   }

   public boolean cc() {
      return this.c(bto.f);
   }

   public boolean cd() {
      return this.i(3);
   }

   public void i(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean ce() {
      return this.i(4);
   }

   public boolean cf() {
      return this.c(bto.d);
   }

   public boolean cg() {
      return this.cf() && !this.bg();
   }

   public void j(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean ch() {
      return this.bb;
   }

   public final void k(boolean $$0) {
      this.bb = $$0;
      this.b(6, this.ci());
   }

   public boolean ci() {
      return this.dR().x_() ? this.i(6) : this.bb;
   }

   public boolean cj() {
      return this.i(5);
   }

   public boolean d(cml $$0) {
      if ($$0.N_()) {
         return false;
      } else {
         exn $$1 = this.cl();
         return $$1 != null && $$0 != null && $$0.cl() == $$1 && $$1.i() ? false : this.cj();
      }
   }

   public boolean ck() {
      return false;
   }

   public void a(BiConsumer<dxe<?>, aqm> $$0) {
   }

   @Nullable
   public exg cl() {
      return this.dR().M().e(this.cD());
   }

   public boolean s(bsh $$0) {
      return this.a($$0.cl());
   }

   public boolean a(exn $$0) {
      return this.cl() != null ? this.cl().a($$0) : false;
   }

   public void l(boolean $$0) {
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

   public int cm() {
      return 300;
   }

   public int cn() {
      return this.ao.a(aR);
   }

   public void j(int $$0) {
      this.ao.a(aR, $$0);
   }

   public int co() {
      return this.ao.a(aW);
   }

   public void k(int $$0) {
      this.ao.a(aW, $$0);
   }

   public float cp() {
      int $$0 = this.cr();
      return (float)Math.min(this.co(), $$0) / (float)$$0;
   }

   public boolean cq() {
      return this.co() >= this.cr();
   }

   public int cr() {
      return 140;
   }

   public void a(aqm $$0, btb $$1) {
      this.h(this.aL + 1);
      if (this.aL == 0) {
         this.d(8.0F);
      }

      this.a(this.dS().c(), 5.0F);
   }

   public void m(boolean $$0) {
      ewh $$1 = this.du();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void n(boolean $$0) {
      ewh $$1 = this.du();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(aqm $$0, btc $$1) {
      return true;
   }

   public void cs() {
      if (this.du().b() > -0.5 && this.ac > 1.0F) {
         this.ac = 1.0F;
      }
   }

   public void n() {
      this.ac = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      ja $$3 = ja.a($$0, $$1, $$2);
      ewh $$4 = new ewh($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      ja.a $$5 = new ja.a();
      jf $$6 = jf.b;
      double $$7 = Double.MAX_VALUE;

      for (jf $$8 : new jf[]{jf.c, jf.d, jf.e, jf.f, jf.b}) {
         $$5.a($$3, $$8);
         if (!this.dR().a_($$5).r(this.dR(), $$5)) {
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
      ewh $$13 = this.du().a(0.75);
      if ($$6.o() == jf.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == jf.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == jf.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dsl $$0, ewh $$1) {
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
   public wu ah() {
      wu $$0 = this.aj();
      return $$0 != null ? c($$0) : this.ct();
   }

   protected wu ct() {
      return this.n.h();
   }

   public boolean t(bsh $$0) {
      return this == $$0;
   }

   public float cu() {
      return 0.0F;
   }

   public void o(float $$0) {
   }

   public void p(float $$0) {
   }

   public boolean cv() {
      return true;
   }

   public boolean u(bsh $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dR() == null ? "~NULL~" : this.dR().toString();
      return this.aJ != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.ah().getString(),
            this.o,
            $$0,
            this.dw(),
            this.dy(),
            this.dC(),
            this.aJ
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.ah().getString(),
            this.o,
            $$0,
            this.dw(),
            this.dy(),
            this.dC()
         );
   }

   public boolean b(bra $$0) {
      return this.dM() || this.ba && !$$0.a(avy.e) && !$$0.g() || $$0.a(avy.j) && this.bf() || $$0.a(avy.n) && this.am().a(awa.o);
   }

   public boolean cw() {
      return this.ba;
   }

   public void o(boolean $$0) {
      this.ba = $$0;
   }

   public void v(bsh $$0) {
      this.b($$0.dw(), $$0.dy(), $$0.dC(), $$0.dH(), $$0.dJ());
   }

   public void w(bsh $$0) {
      tx $$1 = $$0.f(new tx());
      $$1.r("Dimension");
      this.g($$1);
      this.aZ = $$0.aZ;
      this.ay = $$0.ay;
   }

   @Nullable
   public bsh a(bsh.a $$0) {
      if (this.dR() instanceof aqm && !this.dM()) {
         eph $$1 = $$0.get();
         if ($$1 == null) {
            return null;
         } else {
            aqm $$2 = $$1.a();
            this.dR().ag().a("changeDimension");
            this.ak();
            this.dR().ag().a("reposition");
            this.dR().ag().b("reloading");
            bsh $$3 = this.am().a((dcg)$$2);
            if ($$3 != null) {
               $$3.w(this);
               $$3.b($$1.b().c, $$1.b().d, $$1.b().e, $$1.d(), $$3.dJ());
               $$3.j($$1.c());
               $$2.d($$3);
               if ($$2.af() == dcg.j) {
                  aqm.a($$2);
               }
            }

            this.cx();
            this.dR().ag().c();
            ((aqm)this.dR()).h();
            $$2.h();
            this.dR().ag().c();
            return $$3;
         }
      } else {
         return null;
      }
   }

   protected void cx() {
      this.b(bsh.d.e);
   }

   @Nullable
   public eph a(aqm $$0) {
      boolean $$1 = this.dR().af() == dcg.j && $$0.af() == dcg.h;
      boolean $$2 = $$0.af() == dcg.j;
      if (!$$1 && !$$2) {
         boolean $$6 = $$0.af() == dcg.i;
         if (this.dR().af() != dcg.i && !$$6) {
            return null;
         } else {
            duc $$7 = $$0.C_();
            double $$8 = dwg.a(this.dR().D_(), $$0.D_());
            ja $$9 = $$7.b(this.dw() * $$8, this.dy(), this.dC() * $$8);
            return this.a($$0, $$9, $$6, $$7).map($$1x -> {
               dsl $$2x = this.dR().a_(this.ay);
               jf.a $$3;
               ewh $$5;
               if ($$2x.b(dtb.H)) {
                  $$3 = $$2x.c(dtb.H);
                  l.a $$4 = l.a(this.ay, $$3, 21, jf.a.b, 21, $$1xx -> this.dR().a_($$1xx) == $$2x);
                  $$5 = this.a($$3, $$4);
               } else {
                  $$3 = jf.a.a;
                  $$5 = new ewh(0.5, 0.0, 0.0);
               }

               return epj.a($$0, $$1x, $$3, $$5, this, this.du(), this.dH(), this.dJ());
            }).orElse(null);
         }
      } else {
         ja $$3 = $$2 ? aqm.a : $$0.V();
         $$0.l().a(aqr.e, new dbn($$3), 3, $$3);
         int $$4;
         if ($$2) {
            $$4 = $$3.v();
         } else {
            $$4 = $$0.m($$3).a(dyg.a.f, $$3.u(), $$3.w()) + 1;
         }

         return new eph($$0, new ewh((double)$$3.u() + 0.5, (double)$$4, (double)$$3.w() + 0.5), this.du(), this.dH(), this.dJ());
      }
   }

   protected ewh a(jf.a $$0, l.a $$1) {
      return epj.a($$1, $$0, this.dp(), this.a(this.at()));
   }

   protected Optional<l.a> a(aqm $$0, ja $$1, boolean $$2, duc $$3) {
      return $$0.p().a($$1, $$2, $$3);
   }

   public boolean cy() {
      return !this.bT() && !this.bU();
   }

   public float a(dby $$0, dbm $$1, ja $$2, dsl $$3, eoj $$4, float $$5) {
      return $$5;
   }

   public boolean a(dby $$0, dbm $$1, ja $$2, dsl $$3, float $$4) {
      return true;
   }

   public int cz() {
      return 3;
   }

   public boolean r_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bsn.a(this.am()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.o);
      $$0.a("Entity Name", () -> this.ah().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dw(), this.dy(), this.dC()));
      $$0.a("Entity's Block location", p.a(this.dR(), ayg.a(this.dw()), ayg.a(this.dy()), ayg.a(this.dC())));
      ewh $$1 = this.du();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", () -> this.cU().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.de()));
   }

   public boolean cA() {
      return this.bS() && !this.N_();
   }

   public void a_(UUID $$0) {
      this.az = $$0;
      this.aA = this.az.toString();
   }

   @Override
   public UUID cB() {
      return this.az;
   }

   public String cC() {
      return this.aA;
   }

   @Override
   public String cD() {
      return this.aA;
   }

   public boolean cE() {
      return true;
   }

   public static double cF() {
      return m;
   }

   public static void b(double $$0) {
      m = $$0;
   }

   @Override
   public wu O_() {
      return exg.a(this.cl(), this.ah()).a($$0 -> $$0.a(this.cL()).a(this.cC()));
   }

   public void b(@Nullable wu $$0) {
      this.ao.a(aS, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public wu aj() {
      return this.ao.a(aS).orElse(null);
   }

   @Override
   public boolean ai() {
      return this.ao.a(aS).isPresent();
   }

   public void p(boolean $$0) {
      this.ao.a(aT, $$0);
   }

   public boolean cG() {
      return this.ao.a(aT);
   }

   public final void n(double $$0, double $$1, double $$2) {
      if (this.dR() instanceof aqm) {
         dbn $$3 = new dbn(ja.a($$0, $$1, $$2));
         ((aqm)this.dR()).l().a(aqr.f, $$3, 0, this.an());
         this.dR().d($$3.e, $$3.f);
         this.c($$0, $$1, $$2);
      }
   }

   public boolean a(aqm $$0, double $$1, double $$2, double $$3, Set<btq> $$4, float $$5, float $$6) {
      float $$7 = ayg.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dR()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.A();
         this.o($$5);
      } else {
         this.ak();
         bsh $$8 = this.am().a((dcg)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.w(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.o($$5);
         this.b(bsh.d.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.c($$0, $$1, $$2);
   }

   public void c(double $$0, double $$1, double $$2) {
      if (this.dR() instanceof aqm) {
         this.b($$0, $$1, $$2, this.dH(), this.dJ());
         this.A();
      }
   }

   private void A() {
      this.cW().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.p.iterator();

         while (var1.hasNext()) {
            bsh $$1 = (bsh)var1.next();
            $$0.a($$1, bsh::e);
         }
      });
   }

   public void d(double $$0, double $$1, double $$2) {
      this.c(this.dw() + $$0, this.dy() + $$1, this.dC() + $$2);
   }

   public boolean cH() {
      return this.cG();
   }

   @Override
   public void a(List<ajt.c<?>> $$0) {
   }

   @Override
   public void a(ajp<?> $$0) {
      if (at.equals($$0)) {
         this.i_();
      }
   }

   @Deprecated
   protected void cI() {
      bto $$0 = this.at();
      bsk $$1 = this.a($$0);
      this.bf = $$1;
      this.bg = $$1.c();
   }

   public void i_() {
      bsk $$0 = this.bf;
      bto $$1 = this.at();
      bsk $$2 = this.a($$1);
      this.bf = $$2;
      this.bg = $$2.c();
      this.av();
      boolean $$3 = (double)$$2.a() <= 4.0 && (double)$$2.b() <= 4.0;
      if (!this.r.B && !this.an && !this.ag && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cml)) {
         this.a($$0);
      }
   }

   public boolean a(bsk $$0) {
      bsk $$1 = this.a(this.at());
      ewh $$2 = this.dp().b(0.0, (double)$$0.b() / 2.0, 0.0);
      double $$3 = (double)Math.max(0.0F, $$1.a() - $$0.a()) + 1.0E-6;
      double $$4 = (double)Math.max(0.0F, $$1.b() - $$0.b()) + 1.0E-6;
      exa $$5 = ewx.a(ewc.a($$2, $$3, $$4, $$3));
      Optional<ewh> $$6 = this.r.a(this, $$5, $$2, (double)$$1.a(), (double)$$1.b(), (double)$$1.a());
      if ($$6.isPresent()) {
         this.c($$6.get().b(0.0, (double)(-$$1.b()) / 2.0, 0.0));
         return true;
      } else {
         if ($$1.a() > $$0.a() && $$1.b() > $$0.b()) {
            exa $$7 = ewx.a(ewc.a($$2, $$3, 1.0E-6, $$3));
            Optional<ewh> $$8 = this.r.a(this, $$7, $$2, (double)$$1.a(), (double)$$0.b(), (double)$$1.a());
            if ($$8.isPresent()) {
               this.c($$8.get().b(0.0, (double)(-$$0.b()) / 2.0 + 1.0E-6, 0.0));
               return true;
            }
         }

         return false;
      }
   }

   public jf cJ() {
      return jf.a((double)this.dH());
   }

   public jf cK() {
      return this.cJ();
   }

   protected xa cL() {
      return new xa(xa.a.c, new xa.b(this.am(), this.cB(), this.ah()));
   }

   public boolean a(aqn $$0) {
      return true;
   }

   @Override
   public final ewc cM() {
      return this.aH;
   }

   public ewc h_() {
      return this.cM();
   }

   public final void a(ewc $$0) {
      this.aH = $$0;
   }

   public final float d(bto $$0) {
      return this.a($$0).c();
   }

   public final float cN() {
      return this.bg;
   }

   public ewh q(float $$0) {
      return this.cO();
   }

   protected ewh cO() {
      return new ewh(0.0, (double)this.cN(), (double)(this.dl() * 0.4F));
   }

   public btu a_(int $$0) {
      return btu.a;
   }

   @Override
   public void a(wu $$0) {
   }

   public dcg cP() {
      return this.dR();
   }

   @Nullable
   public MinecraftServer cQ() {
      return this.dR().o();
   }

   public bqh a(cml $$0, ewh $$1, bqg $$2) {
      return bqh.e;
   }

   public boolean a(dby $$0) {
      return false;
   }

   public void d(aqn $$0) {
   }

   public void e(aqn $$0) {
   }

   public float a(dlv $$0) {
      float $$1 = ayg.g(this.dH());
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

   public float a(dkf $$0) {
      float $$1 = ayg.g(this.dH());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public boolean cR() {
      return false;
   }

   public cne a(cnd $$0) {
      return this.am().a(awa.r) ? cne.b : cne.a;
   }

   @Nullable
   public btc cS() {
      return null;
   }

   public final boolean cT() {
      return this.cS() != null;
   }

   public final List<bsh> cU() {
      return this.p;
   }

   public Optional<bsh> i(ewh $$0) {
      return this.cU().stream().filter($$0x -> $$0x != this).min(Comparator.comparingDouble($$1 -> $$0.g($$1.dp())));
   }

   @Nullable
   public bsh cV() {
      return this.p.isEmpty() ? null : (bsh)this.p.get(0);
   }

   public boolean x(bsh $$0) {
      return this.p.contains($$0);
   }

   public boolean a(Predicate<bsh> $$0) {
      UnmodifiableIterator var2 = this.p.iterator();

      while (var2.hasNext()) {
         bsh $$1 = (bsh)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bsh> F() {
      return this.p.stream().flatMap(bsh::cW);
   }

   @Override
   public Stream<bsh> cW() {
      return Stream.concat(Stream.of(this), this.F());
   }

   @Override
   public Stream<bsh> cX() {
      return Stream.concat(this.p.stream().flatMap(bsh::cX), Stream.of(this));
   }

   public Iterable<bsh> cY() {
      return () -> this.F().iterator();
   }

   public int cZ() {
      return (int)this.F().filter($$0 -> $$0 instanceof cml).count();
   }

   public boolean da() {
      return this.cZ() == 1;
   }

   public bsh db() {
      bsh $$0 = this;

      while ($$0.bT()) {
         $$0 = $$0.de();
      }

      return $$0;
   }

   public boolean y(bsh $$0) {
      return this.db() == $$0.db();
   }

   public boolean z(bsh $$0) {
      if (!$$0.bT()) {
         return false;
      } else {
         bsh $$1 = $$0.de();
         return $$1 == this ? true : this.z($$1);
      }
   }

   public boolean dc() {
      return this.cS() instanceof cml $$0 ? $$0.g() : this.dd();
   }

   public boolean dd() {
      return !this.dR().B;
   }

   protected static ewh a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -ayg.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = ayg.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new ewh((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public ewh b(btc $$0) {
      return new ewh(this.dw(), this.cM().e, this.dC());
   }

   @Nullable
   public bsh de() {
      return this.q;
   }

   @Nullable
   public bsh df() {
      return this.q != null && this.q.cS() == this ? this.q : null;
   }

   public eoo j_() {
      return eoo.a;
   }

   public avi dg() {
      return avi.g;
   }

   protected int dh() {
      return 1;
   }

   public eq di() {
      return new eq(
         this, this.dp(), this.bO(), this.dR() instanceof aqm ? (aqm)this.dR() : null, this.G(), this.ah().getString(), this.O_(), this.dR().o(), this
      );
   }

   protected int G() {
      return 0;
   }

   public boolean l(int $$0) {
      return this.G() >= $$0;
   }

   @Override
   public boolean k_() {
      return this.dR().ab().b(dcc.p);
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public boolean U_() {
      return true;
   }

   public void a(fc.a $$0, ewh $$1) {
      ewh $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.t(ayg.g((float)(-(ayg.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.s(ayg.g((float)(ayg.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.o(this.dH());
      this.P = this.dJ();
      this.O = this.dH();
   }

   public boolean a(awm<eoi> $$0, double $$1) {
      if (this.dj()) {
         return false;
      } else {
         ewc $$2 = this.cM().h(0.001);
         int $$3 = ayg.a($$2.a);
         int $$4 = ayg.c($$2.d);
         int $$5 = ayg.a($$2.b);
         int $$6 = ayg.c($$2.e);
         int $$7 = ayg.a($$2.c);
         int $$8 = ayg.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cE();
         boolean $$11 = false;
         ewh $$12 = ewh.b;
         int $$13 = 0;
         ja.a $$14 = new ja.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  eoj $$18 = this.dR().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((dbm)this.dR(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           ewh $$20 = $$18.c(this.dR(), $$14);
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

            if (!(this instanceof cml)) {
               $$12 = $$12.d();
            }

            ewh $$21 = this.du();
            $$12 = $$12.a($$1 * 1.0);
            double $$22 = 0.003;
            if (Math.abs($$21.c) < 0.003 && Math.abs($$21.e) < 0.003 && $$12.f() < 0.0045000000000000005) {
               $$12 = $$12.d().a(0.0045000000000000005);
            }

            this.j(this.du().e($$12));
         }

         this.ak.put($$0, $$9);
         return $$11;
      }
   }

   public boolean dj() {
      ewc $$0 = this.cM().g(1.0);
      int $$1 = ayg.a($$0.a);
      int $$2 = ayg.c($$0.d);
      int $$3 = ayg.a($$0.c);
      int $$4 = ayg.c($$0.f);
      return !this.dR().b($$1, $$3, $$2, $$4);
   }

   public double b(awm<eoi> $$0) {
      return this.ak.getDouble($$0);
   }

   public double dk() {
      return (double)this.cN() < 0.4 ? 0.0 : 0.4;
   }

   public final float dl() {
      return this.bf.a();
   }

   public final float dm() {
      return this.bf.b();
   }

   public zb<abn> dn() {
      return new abo(this);
   }

   public bsk a(bto $$0) {
      return this.n.n();
   }

   public final bsj do() {
      return this.bf.d();
   }

   public ewh dp() {
      return this.s;
   }

   public ewh dq() {
      return this.dp();
   }

   @Override
   public ja dr() {
      return this.t;
   }

   public dsl ds() {
      if (this.bl == null) {
         this.bl = this.dR().a_(this.dr());
      }

      return this.bl;
   }

   public dbn dt() {
      return this.u;
   }

   public ewh du() {
      return this.v;
   }

   public void j(ewh $$0) {
      this.v = $$0;
   }

   public void k(ewh $$0) {
      this.j(this.du().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.j(new ewh($$0, $$1, $$2));
   }

   public final int dv() {
      return this.t.u();
   }

   public final double dw() {
      return this.s.c;
   }

   public double c(double $$0) {
      return this.s.c + (double)this.dl() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ah.j() - 1.0) * $$0);
   }

   public final int dx() {
      return this.t.v();
   }

   public final double dy() {
      return this.s.d;
   }

   public double e(double $$0) {
      return this.s.d + (double)this.dm() * $$0;
   }

   public double dz() {
      return this.e(this.ah.j());
   }

   public double dA() {
      return this.s.d + (double)this.bg;
   }

   public final int dB() {
      return this.t.w();
   }

   public final double dC() {
      return this.s.e;
   }

   public double f(double $$0) {
      return this.s.e + (double)this.dl() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ah.j() - 1.0) * $$0);
   }

   public final void p(double $$0, double $$1, double $$2) {
      if (this.s.c != $$0 || this.s.d != $$1 || this.s.e != $$2) {
         this.s = new ewh($$0, $$1, $$2);
         int $$3 = ayg.a($$0);
         int $$4 = ayg.a($$1);
         int $$5 = ayg.a($$2);
         if ($$3 != this.t.u() || $$4 != this.t.v() || $$5 != this.t.w()) {
            this.t = new ja($$3, $$4, $$5);
            this.bl = null;
            if (kc.a($$3) != this.u.e || kc.a($$5) != this.u.f) {
               this.u = new dbn(this.t);
            }
         }

         this.aX.a();
      }
   }

   public void dD() {
   }

   public ewh r(float $$0) {
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
   public cud dE() {
      return null;
   }

   public void q(boolean $$0) {
      this.aB = $$0;
   }

   public boolean dF() {
      return !this.am().a(awa.k);
   }

   public boolean dG() {
      return (this.aB || this.aC) && this.dF();
   }

   public float dH() {
      return this.aF;
   }

   public float dI() {
      return this.dH();
   }

   public void s(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aF = $$0;
      }
   }

   public float dJ() {
      return this.aG;
   }

   public void t(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aG = $$0;
      }
   }

   public boolean dK() {
      return false;
   }

   public float dL() {
      return 0.0F;
   }

   public void a(@Nullable bsh $$0) {
   }

   public final boolean dM() {
      return this.aJ != null;
   }

   @Nullable
   public bsh.d dN() {
      return this.aJ;
   }

   @Override
   public final void b(bsh.d $$0) {
      if (this.aJ == null) {
         this.aJ = $$0;
      }

      if (this.aJ.a()) {
         this.ad();
      }

      this.cU().forEach(bsh::ad);
      this.aX.a($$0);
   }

   protected void dO() {
      this.aJ = null;
   }

   @Override
   public void a(dwp $$0) {
      this.aX = $$0;
   }

   @Override
   public boolean dP() {
      if (this.aJ != null && !this.aJ.b()) {
         return false;
      } else {
         return this.bT() ? false : !this.bU() || !this.da();
      }
   }

   @Override
   public boolean dQ() {
      return false;
   }

   public boolean a(dcg $$0, ja $$1) {
      return true;
   }

   public dcg dR() {
      return this.r;
   }

   protected void a(dcg $$0) {
      this.r = $$0;
   }

   public brb dS() {
      return this.dR().aj();
   }

   public jx dT() {
      return this.dR().H_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = ayg.d($$6, this.dw(), $$1);
      double $$8 = ayg.d($$6, this.dy(), $$2);
      double $$9 = ayg.d($$6, this.dC(), $$3);
      float $$10 = (float)ayg.e($$6, (double)this.dH(), $$4);
      float $$11 = (float)ayg.d($$6, (double)this.dJ(), $$5);
      this.a_($$7, $$8, $$9);
      this.a($$10, $$11);
   }

   public ayo dU() {
      return this.ah;
   }

   public ewh ag() {
      return this.du();
   }

   @FunctionalInterface
   public interface a {
      @Nullable
      eph get();
   }

   @FunctionalInterface
   public interface b {
      void accept(bsh var1, double var2, double var4, double var6);
   }

   public static enum c {
      a(false, false),
      b(true, false),
      c(false, true),
      d(true, true);

      final boolean e;
      final boolean f;

      private c(final boolean $$0, final boolean $$1) {
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

      private d(final boolean $$0, final boolean $$1) {
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
