import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleListIterator;
import it.unimi.dsi.fastutil.floats.FloatArraySet;
import it.unimi.dsi.fastutil.floats.FloatArrays;
import it.unimi.dsi.fastutil.floats.FloatSet;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
import org.jetbrains.annotations.Contract;

public abstract class bwv implements akq, buw, efl, fgw, kg {
   public static final String v = "id";
   public static final String w = "Passengers";
   private static final String b = "data";
   private static final AtomicInteger c = new AtomicInteger();
   public static final int x = 0;
   public static final int y = 60;
   public static final int z = 300;
   public static final int A = 1024;
   private static final Codec<List<String>> d = Codec.STRING.sizeLimitedListOf(1024);
   public static final float B = 0.2F;
   public static final double C = 0.500001;
   public static final double D = 0.999999;
   public static final int E = 140;
   public static final int F = 40;
   public static final int G = 3;
   private static final ImmutableList<jc.a> e = ImmutableList.of(jc.a.b, jc.a.a, jc.a.c);
   private static final ImmutableList<jc.a> m = ImmutableList.of(jc.a.b, jc.a.c, jc.a.a);
   private static final ffn n = new ffn(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double o = 0.014;
   private static final double p = 0.007;
   private static final double q = 0.0023333333333333335;
   public static final String H = "UUID";
   private static double r = 1.0;
   private final bxe<?> s;
   private int t = c.incrementAndGet();
   public boolean I;
   private ImmutableList<bwv> u = ImmutableList.of();
   protected int J;
   @Nullable
   private bwv ay;
   private djz az;
   public double K;
   public double L;
   public double M;
   private ffs aA;
   private iw aB;
   private dje aC;
   private ffs aD = ffs.c;
   private float aE;
   private float aF;
   public float N;
   public float O;
   private ffn aG = n;
   private boolean aH;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   public boolean T;
   protected ffs U = ffs.c;
   @Nullable
   private bwv.d aI;
   public static final float V = 0.6F;
   public static final float W = 1.8F;
   public float X;
   public float Y;
   public double Z;
   private float aJ = 1.0F;
   public double aa;
   public double ab;
   public double ac;
   public boolean ad;
   protected final azz ae = azz.a();
   public int af;
   private int aK = -this.dn();
   protected boolean ag;
   protected Object2DoubleMap<axv<exp>> ah = new Object2DoubleArrayMap(2);
   protected boolean ai;
   private final Set<axv<exp>> aL = new HashSet<>();
   public int aj;
   protected boolean ak = true;
   protected final akr al;
   protected static final akn<Byte> am = akr.a(bwv.class, akp.a);
   protected static final int an = 0;
   private static final int aM = 1;
   private static final int aN = 3;
   private static final int aO = 4;
   private static final int aP = 5;
   protected static final int ao = 6;
   protected static final int ap = 7;
   private static final akn<Integer> aQ = akr.a(bwv.class, akp.b);
   private static final akn<Optional<xc>> aR = akr.a(bwv.class, akp.g);
   private static final akn<Boolean> aS = akr.a(bwv.class, akp.k);
   private static final akn<Boolean> aT = akr.a(bwv.class, akp.k);
   private static final akn<Boolean> aU = akr.a(bwv.class, akp.k);
   protected static final akn<byi> aq = akr.a(bwv.class, akp.w);
   private static final akn<Integer> aV = akr.a(bwv.class, akp.b);
   private efm aW = efm.a;
   private final aix aX = new aix();
   public boolean ar;
   @Nullable
   public byh as;
   private int aY;
   private boolean aZ;
   protected UUID at = azq.a(this.ae);
   protected String au = this.at.toString();
   private boolean ba;
   private final Set<String> bb = Sets.newHashSet();
   private final double[] bc = new double[]{0.0, 0.0, 0.0};
   private long bd;
   private bwy be;
   private float bf;
   public boolean av;
   public boolean aw;
   public Optional<iw> ax = Optional.empty();
   private boolean bg = false;
   private float bh;
   private int bi;
   private boolean bj;
   @Nullable
   private ebg bk = null;
   private final List<List<bwv.b>> bl = new ObjectArrayList();
   private final List<bwv.b> bm = new ObjectArrayList();
   private final LongSet bn = new LongOpenHashSet();
   private final bxo.a bo = new bxo.a();
   private dci bp = dci.a;

   public bwv(bxe<?> $$0, djz $$1) {
      this.s = $$0;
      this.az = $$1;
      this.be = $$0.n();
      this.aA = ffs.c;
      this.aB = iw.c;
      this.aC = dje.e;
      akr.a $$2 = new akr.a(this);
      $$2.a(am, (byte)0);
      $$2.a(aQ, this.cr());
      $$2.a(aS, false);
      $$2.a(aR, Optional.empty());
      $$2.a(aT, false);
      $$2.a(aU, false);
      $$2.a(aq, byi.a);
      $$2.a(aV, 0);
      this.a($$2);
      this.al = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.bf = this.be.c();
   }

   public boolean a(iw $$0, ebg $$1) {
      fgm $$2 = $$1.b(this.dV(), $$0, ffx.a(this)).a($$0);
      return fgj.c($$2, fgj.a(this.cR()), ffw.i);
   }

   public int f_() {
      fgz $$0 = this.cq();
      return $$0 != null && $$0.o().f() != null ? $$0.o().f() : 16777215;
   }

   public boolean Z_() {
      return false;
   }

   public final void al() {
      if (this.bZ()) {
         this.bN();
      }

      if (this.bY()) {
         this.bO();
      }
   }

   public void e(double $$0, double $$1, double $$2) {
      this.aX.e(new ffs($$0, $$1, $$2));
   }

   public aix am() {
      return this.aX;
   }

   public bxe<?> an() {
      return this.s;
   }

   @Override
   public int ao() {
      return this.t;
   }

   public void e(int $$0) {
      this.t = $$0;
   }

   public Set<String> ap() {
      return this.bb;
   }

   public boolean a(String $$0) {
      return this.bb.size() >= 1024 ? false : this.bb.add($$0);
   }

   public boolean b(String $$0) {
      return this.bb.remove($$0);
   }

   public void c(aru $$0) {
      this.a(bwv.d.a);
      this.a(egg.p);
   }

   public final void aq() {
      this.a(bwv.d.b);
   }

   protected abstract void a(akr.a var1);

   public akr ar() {
      return this.al;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bwv ? ((bwv)$$0).t == this.t : false;
   }

   @Override
   public int hashCode() {
      return this.t;
   }

   public void a(bwv.d $$0) {
      this.c($$0);
   }

   public void as() {
   }

   public void b(bwv.d $$0) {
   }

   public void b(byi $$0) {
      this.al.a(aq, $$0);
   }

   public byi at() {
      return this.al.a(aq);
   }

   public boolean c(byi $$0) {
      return this.at() == $$0;
   }

   public boolean a(bwv $$0, double $$1) {
      return this.dt().a((jq)$$0.dt(), $$1);
   }

   public boolean a(bwv $$0, double $$1, double $$2) {
      double $$3 = $$0.dA() - this.dA();
      double $$4 = $$0.dC() - this.dC();
      double $$5 = $$0.dG() - this.dG();
      return azq.e($$3, $$5) < azq.k($$1) && azq.k($$4) < azq.k($$2);
   }

   protected void b(float $$0, float $$1) {
      this.w($$0 % 360.0F);
      this.x($$1 % 360.0F);
   }

   public final void b(ffs $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      this.a(this.au());
   }

   protected final ffn au() {
      return this.c(this.aA);
   }

   protected ffn c(ffs $$0) {
      return this.be.a($$0);
   }

   protected void av() {
      this.a_(this.aA.d, this.aA.e, this.aA.f);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.x(this.dN() + $$2);
      this.w(this.dL() + $$3);
      this.x(azq.a(this.dN(), -90.0F, 90.0F));
      this.O += $$2;
      this.N += $$3;
      this.O = azq.a(this.O, -90.0F, 90.0F);
      if (this.ay != null) {
         this.ay.k(this);
      }
   }

   public void h() {
      this.aw();
   }

   public void aw() {
      brd $$0 = brc.a();
      $$0.a("entityBaseTick");
      this.bk = null;
      if (this.bY() && this.dk().dQ()) {
         this.bO();
      }

      if (this.J > 0) {
         this.J--;
      }

      this.bV();
      if (this.bt()) {
         this.bu();
      }

      this.aw = this.av;
      this.av = false;
      this.bo();
      this.o();
      this.bn();
      if (this.dV() instanceof aru $$1) {
         if (this.aK > 0) {
            if (this.bh()) {
               this.h(this.aK - 4);
               if (this.aK < 0) {
                  this.aF();
               }
            } else {
               if (this.aK % 20 == 0 && !this.bv()) {
                  this.a($$1, this.dW().d(), 1.0F);
               }

               this.h(this.aK - 1);
            }
         }
      } else {
         this.aF();
      }

      if (this.bv()) {
         this.Z *= 0.5;
      }

      this.ax();
      if (!this.dV().C) {
         this.c(this.aK > 0);
      }

      this.ak = false;
      if (this.dV() instanceof aru $$2 && this instanceof bxu) {
         bxu.a_($$2, (bwv)((bxu)this));
      }

      $$0.c();
   }

   public void c(boolean $$0) {
      this.b(0, $$0 || this.bj);
   }

   public void ax() {
      if (this.dC() < (double)(this.dV().K_() - 64)) {
         this.aG();
      }
   }

   public void ay() {
      this.aY = this.bW();
   }

   public void f(int $$0) {
      this.aY = $$0;
   }

   public int az() {
      return this.aY;
   }

   public boolean aA() {
      return this.aY > 0;
   }

   protected void M() {
      if (this.aA()) {
         this.aY--;
      }
   }

   public void aB() {
      if (!this.bh()) {
         this.e(15.0F);
      }
   }

   public void aC() {
      if (!this.bh()) {
         if (this.dV() instanceof aru $$0 && this.a($$0, this.dW().e(), 4.0F) && this.aD() && !this.ba()) {
            $$0.a(null, this.dA(), this.dC(), this.dG(), awr.kE, this.dm(), 0.4F, 2.0F + this.ae.i() * 0.4F);
         }
      }
   }

   protected boolean aD() {
      return true;
   }

   public final void e(float $$0) {
      this.g(azq.d($$0 * 20.0F));
   }

   public void g(int $$0) {
      if (this.aK < $$0) {
         this.h($$0);
      }

      this.ct();
   }

   public void h(int $$0) {
      this.aK = $$0;
   }

   public int aE() {
      return this.aK;
   }

   public void aF() {
      this.h(0);
   }

   protected void aG() {
      this.aq();
   }

   public boolean f(double $$0, double $$1, double $$2) {
      return this.b(this.cR().d($$0, $$1, $$2));
   }

   private boolean b(ffn $$0) {
      return this.dV().a(this, $$0) && !this.dV().d($$0);
   }

   public void d(boolean $$0) {
      this.aH = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, ffs $$1) {
      this.a($$0, this.P, $$1);
   }

   public void a(boolean $$0, boolean $$1, ffs $$2) {
      this.aH = $$0;
      this.P = $$1;
      this.b($$0, $$2);
   }

   public boolean d(iw $$0) {
      return this.ax.isPresent() && this.ax.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable ffs $$1) {
      if ($$0) {
         ffn $$2 = this.cR();
         ffn $$3 = new ffn($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<iw> $$4 = this.az.h(this, $$3);
         if ($$4.isPresent() || this.bg) {
            this.ax = $$4;
         } else if ($$1 != null) {
            ffn $$5 = $$3.d(-$$1.d, 0.0, -$$1.f);
            $$4 = this.az.h(this, $$5);
            this.ax = $$4;
         }

         this.bg = $$4.isEmpty();
      } else {
         this.bg = false;
         if (this.ax.isPresent()) {
            this.ax = Optional.empty();
         }
      }
   }

   public boolean aH() {
      return this.aH;
   }

   public void a(bya $$0, ffs $$1) {
      if (this.ad) {
         this.a_(this.dA() + $$1.d, this.dC() + $$1.e, this.dG() + $$1.f);
      } else {
         if ($$0 == bya.c) {
            $$1 = this.e($$1);
            if ($$1.equals(ffs.c)) {
               return;
            }
         }

         brd $$2 = brc.a();
         $$2.a("move");
         if (this.U.h() > 1.0E-7) {
            $$1 = $$1.h(this.U);
            this.U = ffs.c;
            this.i(ffs.c);
         }

         $$1 = this.a($$1, $$0);
         ffs $$3 = this.a($$1);
         double $$4 = $$3.h();
         if ($$4 > 1.0E-7 || $$1.h() - $$4 < 1.0E-7) {
            if (this.Z != 0.0 && $$4 >= 1.0) {
               ffo $$5 = this.dV().a(new djg(this.dt(), this.dt().e($$3), djg.a.d, djg.b.d, this));
               if ($$5.d() != ffq.a.a) {
                  this.k();
               }
            }

            ffs $$6 = this.dt();
            List<bwv.b> $$7 = new ObjectArrayList();

            for (jc.a $$8 : k($$3)) {
               double $$9 = $$3.a($$8);
               if ($$9 != 0.0) {
                  ffs $$10 = $$6.a($$8.e(), $$9);
                  $$7.add(new bwv.b($$6, $$10));
                  $$6 = $$10;
               }
            }

            this.bl.add($$7);
            this.b($$6);
         }

         $$2.c();
         $$2.a("rest");
         boolean $$11 = !azq.b($$1.d, $$3.d);
         boolean $$12 = !azq.b($$1.f, $$3.f);
         this.P = $$11 || $$12;
         if (Math.abs($$1.e) > 0.0 || this.dg()) {
            this.Q = $$1.e != $$3.e;
            this.R = this.Q && $$1.e < 0.0;
            this.a(this.R, this.P, $$3);
         }

         if (this.P) {
            this.S = this.d($$3);
         } else {
            this.S = false;
         }

         iw $$13 = this.aO();
         ebg $$14 = this.dV().a_($$13);
         if (this.dg()) {
            this.a($$3.e, this.aH(), $$14, $$13);
         }

         if (this.dQ()) {
            $$2.c();
         } else {
            if (this.P) {
               ffs $$15 = this.dy();
               this.n($$11 ? 0.0 : $$15.d, $$15.e, $$12 ? 0.0 : $$15.f);
            }

            if (this.di()) {
               dne $$16 = $$14.b();
               if ($$1.e != $$3.e) {
                  $$16.a(this.dV(), this);
               }
            }

            if (!this.dV().A_() || this.dg()) {
               bwv.c $$17 = this.bf();
               if ($$17.a() && !this.bY()) {
                  this.a($$17, $$3, $$13, $$14);
               }
            }

            float $$18 = this.aS();
            this.i(this.dy().d((double)$$18, 1.0, (double)$$18));
            $$2.c();
         }
      }
   }

   private void a(bwv.c $$0, ffs $$1, iw $$2, ebg $$3) {
      float $$4 = 0.6F;
      float $$5 = (float)($$1.g() * 0.6F);
      float $$6 = (float)($$1.i() * 0.6F);
      iw $$7 = this.aQ();
      ebg $$8 = this.dV().a_($$7);
      boolean $$9 = this.c($$8);
      this.X += $$9 ? $$5 : $$6;
      this.Y += $$5;
      if (this.X > this.aJ && !$$8.l()) {
         boolean $$10 = $$7.equals($$2);
         boolean $$11 = this.a($$2, $$3, $$0.c(), $$10, $$1);
         if (!$$10) {
            $$11 |= this.a($$7, $$8, false, $$0.b(), $$1);
         }

         if ($$11) {
            this.aJ = this.aT();
         } else if (this.bi()) {
            this.aJ = this.aT();
            if ($$0.c()) {
               this.aX();
            }

            if ($$0.b()) {
               this.a(egg.Q);
            }
         }
      } else if ($$8.l()) {
         this.aN();
      }
   }

   protected void aI() {
      this.bm.clear();
      this.bl.forEach(this.bm::addAll);
      this.bl.clear();
      if (this.bm.isEmpty()) {
         this.bm.add(new bwv.b(this.bA(), this.dt()));
      } else if (this.bm.getLast().b.g(this.dt()) > 9.9999994E-11F) {
         this.bm.add(new bwv.b(this.bm.getLast().b, this.dt()));
      }

      this.b(this.bm);
   }

   public void aJ() {
      this.bl.removeLast();
   }

   protected void a(ffs $$0, ffs $$1) {
      this.b(List.of(new bwv.b($$0, $$1)));
   }

   private void b(List<bwv.b> $$0) {
      if (this.aK()) {
         if (this.aH()) {
            iw $$1 = this.aO();
            ebg $$2 = this.dV().a_($$1);
            $$2.b().a(this.dV(), $$1, $$2, this);
         }

         boolean $$3 = this.bX();
         boolean $$4 = this.dK();
         this.a($$0, this.bo);
         this.bo.a(this);
         if ($$3 && !this.bX() || $$4 && !this.dK()) {
            this.aL();
         }

         if ($$3 && !this.bX() && this.aK <= 0) {
            this.h(-this.dn());
         }
      }
   }

   protected boolean aK() {
      return !this.dQ() && !this.ad;
   }

   private boolean c(ebg $$0) {
      return $$0.a(axg.aS) || $$0.a(dng.rx);
   }

   private boolean a(iw $$0, ebg $$1, boolean $$2, boolean $$3, ffs $$4) {
      if ($$1.l()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aH() || $$5 || this.ch() && $$4.e == 0.0 || this.cp()) && !this.cj()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dV().a(egg.P, this.dt(), egg.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean d(ffs $$0) {
      return false;
   }

   protected void aL() {
      if (!this.az.A_()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awr.kJ, this.dm(), 0.7F, 1.6F + (this.ae.i() - this.ae.i()) * 0.4F);
      }
   }

   public void aM() {
      if (this.bX()) {
         this.aL();
      }

      this.aF();
   }

   protected void aN() {
      if (this.aZ()) {
         this.aY();
         if (this.bf().b()) {
            this.a(egg.x);
         }
      }
   }

   @Deprecated
   public iw aO() {
      return this.f(0.2F);
   }

   public iw aP() {
      return this.f(0.500001F);
   }

   public iw aQ() {
      return this.f(1.0E-5F);
   }

   protected iw f(float $$0) {
      if (this.ax.isPresent()) {
         iw $$1 = this.ax.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            ebg $$2 = this.dV().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(axg.U)) && !$$2.a(axg.N) && !($$2.b() instanceof dqf) ? $$1.h(azq.a(this.aA.e - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = azq.a(this.aA.d);
         int $$4 = azq.a(this.aA.e - (double)$$0);
         int $$5 = azq.a(this.aA.f);
         return new iw($$3, $$4, $$5);
      }
   }

   protected float aR() {
      float $$0 = this.dV().a_(this.dv()).b().j();
      float $$1 = this.dV().a_(this.aP()).b().j();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aS() {
      ebg $$0 = this.dV().a_(this.dv());
      float $$1 = $$0.b().i();
      if (!$$0.a(dng.J) && !$$0.a(dng.nJ)) {
         return (double)$$1 == 1.0 ? this.dV().a_(this.aP()).b().i() : $$1;
      } else {
         return $$1;
      }
   }

   protected ffs a(ffs $$0, bya $$1) {
      return $$0;
   }

   protected ffs e(ffs $$0) {
      if ($$0.h() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dV().ae();
         if ($$1 != this.bd) {
            Arrays.fill(this.bc, 0.0);
            this.bd = $$1;
         }

         if ($$0.d != 0.0) {
            double $$2 = this.a(jc.a.a, $$0.d);
            return Math.abs($$2) <= 1.0E-5F ? ffs.c : new ffs($$2, 0.0, 0.0);
         } else if ($$0.e != 0.0) {
            double $$3 = this.a(jc.a.b, $$0.e);
            return Math.abs($$3) <= 1.0E-5F ? ffs.c : new ffs(0.0, $$3, 0.0);
         } else if ($$0.f != 0.0) {
            double $$4 = this.a(jc.a.c, $$0.f);
            return Math.abs($$4) <= 1.0E-5F ? ffs.c : new ffs(0.0, 0.0, $$4);
         } else {
            return ffs.c;
         }
      }
   }

   private double a(jc.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = azq.a($$1 + this.bc[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bc[$$2];
      this.bc[$$2] = $$3;
      return $$1;
   }

   private ffs a(ffs $$0) {
      ffn $$1 = this.cR();
      List<fgm> $$2 = this.dV().c(this, $$1.b($$0));
      ffs $$3 = $$0.h() == 0.0 ? $$0 : a(this, $$0, $$1, this.dV(), $$2);
      boolean $$4 = $$0.d != $$3.d;
      boolean $$5 = $$0.e != $$3.e;
      boolean $$6 = $$0.f != $$3.f;
      boolean $$7 = $$5 && $$0.e < 0.0;
      if (this.dP() > 0.0F && ($$7 || this.aH()) && ($$4 || $$6)) {
         ffn $$8 = $$7 ? $$1.d(0.0, $$3.e, 0.0) : $$1;
         ffn $$9 = $$8.b($$0.d, (double)this.dP(), $$0.f);
         if (!$$7) {
            $$9 = $$9.b(0.0, -1.0E-5F, 0.0);
         }

         List<fgm> $$10 = a(this, this.az, $$2, $$9);
         float $$11 = (float)$$3.e;
         float[] $$12 = a($$8, $$10, this.dP(), $$11);

         for (float $$13 : $$12) {
            ffs $$14 = a(new ffs($$0.d, (double)$$13, $$0.f), $$8, $$10);
            if ($$14.j() > $$3.j()) {
               double $$15 = $$1.b - $$8.b;
               return $$14.a(0.0, $$15, 0.0);
            }
         }
      }

      return $$3;
   }

   private static float[] a(ffn $$0, List<fgm> $$1, float $$2, float $$3) {
      FloatSet $$4 = new FloatArraySet(4);

      for (fgm $$5 : $$1) {
         DoubleList $$6 = $$5.a(jc.a.b);
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

   public static ffs a(@Nullable bwv $$0, ffs $$1, ffn $$2, djz $$3, List<fgm> $$4) {
      List<fgm> $$5 = a($$0, $$3, $$4, $$2.b($$1));
      return a($$1, $$2, $$5);
   }

   private static List<fgm> a(@Nullable bwv $$0, djz $$1, List<fgm> $$2, ffn $$3) {
      Builder<fgm> $$4 = ImmutableList.builderWithExpectedSize($$2.size() + 1);
      if (!$$2.isEmpty()) {
         $$4.addAll($$2);
      }

      ecy $$5 = $$1.E_();
      boolean $$6 = $$0 != null && $$5.a($$0, $$3);
      if ($$6) {
         $$4.add($$5.c());
      }

      $$4.addAll($$1.e($$0, $$3));
      return $$4.build();
   }

   private static ffs a(ffs $$0, ffn $$1, List<fgm> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         ffs $$3 = ffs.c;

         for (jc.a $$4 : k($$0)) {
            double $$5 = $$0.a($$4);
            if ($$5 != 0.0) {
               double $$6 = fgj.a($$4, $$1.c($$3), $$2, $$5);
               $$3 = $$3.a($$4, $$6);
            }
         }

         return $$3;
      }
   }

   private static Iterable<jc.a> k(ffs $$0) {
      return Math.abs($$0.d) < Math.abs($$0.f) ? m : e;
   }

   protected float aT() {
      return (float)((int)this.X + 1);
   }

   protected awq aU() {
      return awr.kN;
   }

   protected awq aV() {
      return awr.kM;
   }

   protected awq aW() {
      return awr.kM;
   }

   private void a(List<bwv.b> $$0, bxo.a $$1) {
      if (this.aK()) {
         LongSet $$2 = this.bn;

         for (bwv.b $$3 : $$0) {
            ffs $$4 = $$3.a();
            ffs $$5 = $$3.b();
            ffn $$6 = this.c($$5).h(1.0E-5F);
            djd.a($$4, $$5, $$6, ($$4x, $$5x) -> {
               if (this.bJ()) {
                  ebg $$6x = this.dV().a_($$4x);
                  if (!$$6x.l()) {
                     if ($$2.add($$4x.a())) {
                        fgm $$7 = $$6x.a(this.dV(), $$4x, this);
                        boolean $$8 = $$7 == fgj.b() || this.a($$4, $$5, $$7.a(new ffs($$4x)).e());
                        if ($$8) {
                           try {
                              $$1.a($$5x);
                              $$6x.a(this.dV(), $$4x, this, $$1);
                              this.a($$6x);
                           } catch (Throwable var14) {
                              p $$10 = p.a(var14, "Colliding entity with block");
                              q $$11 = $$10.a("Block being collided with");
                              q.a($$11, this.dV(), $$4x, $$6x);
                              q $$12 = $$10.a("Entity being checked for collision");
                              this.a($$12);
                              throw new aa($$10);
                           }
                        }

                        boolean $$13 = this.a($$6x.y(), $$4x, $$4, $$5);
                        if ($$13) {
                           $$1.a($$5x);
                           $$6x.y().a(this.dV(), $$4x, this, $$1);
                        }
                     }
                  }
               }
            });
         }

         $$2.clear();
      }
   }

   private boolean a(exq $$0, iw $$1, ffs $$2, ffs $$3) {
      ffn $$4 = $$0.e(this.dV(), $$1);
      return $$4 != null && this.a($$2, $$3, List.of($$4));
   }

   private boolean a(ffs $$0, ffs $$1, List<ffn> $$2) {
      ffn $$3 = this.c($$0);
      ffs $$4 = $$1.d($$0);
      return $$3.a($$4, $$2);
   }

   protected void a(ebg $$0) {
   }

   public iw a(aru $$0, iw $$1) {
      iw $$2 = $$0.aa();
      ffs $$3 = $$2.b();
      int $$4 = $$0.m($$2).a(ehf.a.f, $$2.u(), $$2.w()) + 1;
      return iw.a($$3.d, (double)$$4, $$3.f);
   }

   public void a(jg<egg> $$0, @Nullable bwv $$1) {
      this.dV().a($$1, $$0, this.aA);
   }

   public void a(jg<egg> $$0) {
      this.a($$0, this);
   }

   private void c(iw $$0, ebg $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.j();
      }
   }

   protected void aX() {
      bwv $$0 = Objects.requireNonNullElse(this.cW(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      ffs $$2 = $$0.dy();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      this.g($$3);
   }

   protected iw e(iw $$0) {
      iw $$1 = $$0.d();
      ebg $$2 = this.dV().a_($$1);
      return !$$2.a(axg.bq) && !$$2.a(axg.br) ? $$0 : $$1;
   }

   protected void a(ebg $$0, ebg $$1) {
      dvb $$2 = $$0.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(ebg $$0) {
      dvb $$1 = $$0.A();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(iw $$0, ebg $$1) {
      dvb $$2 = $$1.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(ebg $$0) {
      return $$0.a(axg.bp) && this.af >= this.bi + 20;
   }

   private void j() {
      this.bh = this.bh * (float)Math.pow(0.997, (double)(this.af - this.bi));
      this.bh = Math.min(1.0F, this.bh + 0.07F);
      float $$0 = 0.5F + this.bh * this.ae.i() * 1.2F;
      float $$1 = 0.1F + this.bh * 1.2F;
      this.a(awr.E, $$1, $$0);
      this.bi = this.af;
   }

   protected void g(float $$0) {
      this.a(this.aU(), $$0, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
   }

   protected void aY() {
   }

   protected boolean aZ() {
      return false;
   }

   public void a(awq $$0, float $$1, float $$2) {
      if (!this.ba()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), $$0, this.dm(), $$1, $$2);
      }
   }

   public void a(awq $$0) {
      if (!this.ba()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean ba() {
      return this.al.a(aT);
   }

   public void e(boolean $$0) {
      this.al.a(aT, $$0);
   }

   public boolean bb() {
      return this.al.a(aU);
   }

   public void f(boolean $$0) {
      this.al.a(aU, $$0);
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
         this.i(this.dy().b(0.0, -$$0, 0.0));
      }
   }

   protected bwv.c bf() {
      return bwv.c.d;
   }

   public boolean bg() {
      return false;
   }

   public final void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.do()) {
         this.b($$3, new ffs($$0, $$1, $$2));
         iw $$4 = this.aO();
         ebg $$5 = this.dV().a_($$4);
         this.a($$1, $$3, $$5, $$4);
      }
   }

   protected void a(double $$0, boolean $$1, ebg $$2, iw $$3) {
      if (!this.bi() && $$0 < 0.0) {
         this.Z -= (double)((float)$$0);
      }

      if ($$1) {
         if (this.Z > 0.0) {
            $$2.b().a(this.dV(), $$2, $$3, this, this.Z);
            this.dV().a(egg.A, this.aA, egg.a.a(this, this.ax.<ebg>map($$0x -> this.dV().a_($$0x)).orElse($$2)));
         }

         this.k();
      }
   }

   public boolean bh() {
      return this.an().d();
   }

   public boolean a(double $$0, float $$1, bvk $$2) {
      if (this.s.a(axj.o)) {
         return false;
      } else {
         this.b($$0, $$1, $$2);
         return false;
      }
   }

   protected void b(double $$0, float $$1, bvk $$2) {
      if (this.bZ()) {
         for (bwv $$3 : this.cY()) {
            $$3.a($$0, $$1, $$2);
         }
      }
   }

   public boolean bi() {
      return this.ag;
   }

   boolean bj() {
      iw $$0 = this.dv();
      return this.dV().r($$0) || this.dV().r(iw.a((double)$$0.u(), this.cR().e, (double)$$0.w()));
   }

   public boolean bk() {
      return this.bi() || this.bj();
   }

   public boolean bl() {
      return this.bi() || this.bv();
   }

   public boolean bm() {
      return this.ai && this.bi();
   }

   public void bn() {
      if (this.cj()) {
         this.i(this.ci() && this.bi() && !this.bY());
      } else {
         this.i(this.ci() && this.bm() && !this.bY() && this.dV().b_(this.aB).a(axl.a));
      }
   }

   protected boolean bo() {
      this.ah.clear();
      this.bp();
      double $$0 = this.dV().F_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(axl.b, $$0);
      return this.bi() || $$1;
   }

   void bp() {
      if (this.dk() instanceof cuk $$0 && !$$0.bm()) {
         this.ag = false;
         return;
      }

      if (this.a(axl.a, 0.014)) {
         if (!this.ag && !this.ak) {
            this.bq();
         }

         this.k();
         this.ag = true;
      } else {
         this.ag = false;
      }
   }

   private void o() {
      this.ai = this.a(axl.a);
      this.aL.clear();
      double $$0 = this.dE();
      if (this.dk() instanceof cuk $$2 && !$$2.bm() && $$2.cR().e >= $$0 && $$2.cR().b <= $$0) {
         return;
      }

      iw $$3 = iw.a(this.dA(), $$0, this.dG());
      exq $$4 = this.dV().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a(this.dV(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aL::add);
      }
   }

   protected void bq() {
      bwv $$0 = Objects.requireNonNullElse(this.cW(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      ffs $$2 = $$0.dy();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aV(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      } else {
         this.a(this.aW(), $$3, 1.0F + (this.ae.i() - this.ae.i()) * 0.4F);
      }

      float $$4 = (float)azq.a(this.dC());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.be.a() * 20.0F; $$5++) {
         double $$6 = (this.ae.j() * 2.0 - 1.0) * (double)this.be.a();
         double $$7 = (this.ae.j() * 2.0 - 1.0) * (double)this.be.a();
         this.dV().a(lz.d, this.dA() + $$6, (double)($$4 + 1.0F), this.dG() + $$7, $$2.d, $$2.e - this.ae.j() * 0.2F, $$2.f);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.be.a() * 20.0F; $$8++) {
         double $$9 = (this.ae.j() * 2.0 - 1.0) * (double)this.be.a();
         double $$10 = (this.ae.j() * 2.0 - 1.0) * (double)this.be.a();
         this.dV().a(lz.ap, this.dA() + $$9, (double)($$4 + 1.0F), this.dG() + $$10, $$2.d, $$2.e, $$2.f);
      }

      this.a(egg.O);
   }

   @Deprecated
   protected ebg br() {
      return this.dV().a_(this.aO());
   }

   public ebg bs() {
      return this.dV().a_(this.aQ());
   }

   public boolean bt() {
      return this.ci() && !this.bi() && !this.Z_() && !this.ch() && !this.bv() && this.bJ();
   }

   protected void bu() {
      iw $$0 = this.aO();
      ebg $$1 = this.dV().a_($$0);
      if ($$1.o() != dtr.a) {
         ffs $$2 = this.dy();
         iw $$3 = this.dv();
         double $$4 = this.dA() + (this.ae.j() - 0.5) * (double)this.be.a();
         double $$5 = this.dG() + (this.ae.j() - 0.5) * (double)this.be.a();
         if ($$3.u() != $$0.u()) {
            $$4 = azq.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = azq.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dV().a(new lr(lz.b, $$1), $$4, this.dC() + 0.1, $$5, $$2.d * -4.0, 1.5, $$2.f * -4.0);
      }
   }

   public boolean a(axv<exp> $$0) {
      return this.aL.contains($$0);
   }

   public boolean bv() {
      return !this.ak && this.ah.getDouble(axl.b) > 0.0;
   }

   public void a(float $$0, ffs $$1) {
      ffs $$2 = a($$1, $$0, this.dL());
      this.i(this.dy().e($$2));
   }

   protected static ffs a(ffs $$0, float $$1, float $$2) {
      double $$3 = $$0.h();
      if ($$3 < 1.0E-7) {
         return ffs.c;
      } else {
         ffs $$4 = ($$3 > 1.0 ? $$0.d() : $$0).c((double)$$1);
         float $$5 = azq.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = azq.b($$2 * (float) (Math.PI / 180.0));
         return new ffs($$4.d * (double)$$6 - $$4.f * (double)$$5, $$4.e, $$4.f * (double)$$6 + $$4.d * (double)$$5);
      }
   }

   @Deprecated
   public float bw() {
      return this.dV().f(this.dz(), this.dF()) ? this.dV().y(iw.a(this.dA(), this.dE(), this.dG())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.g($$0, $$1, $$2);
      this.c($$3, $$4);
   }

   public void c(float $$0, float $$1) {
      this.w($$0 % 360.0F);
      this.x(azq.a($$1, -90.0F, 90.0F) % 360.0F);
      this.N = this.dL();
      this.O = this.dN();
   }

   public void g(double $$0, double $$1, double $$2) {
      double $$3 = azq.a($$0, -3.0E7, 3.0E7);
      double $$4 = azq.a($$2, -3.0E7, 3.0E7);
      this.K = $$3;
      this.L = $$1;
      this.M = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void f(ffs $$0) {
      this.d($$0.d, $$0.e, $$0.f);
   }

   public void d(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dL(), this.dN());
   }

   public void a(iw $$0, float $$1, float $$2) {
      this.b($$0.c(), $$1, $$2);
   }

   public void b(ffs $$0, float $$1, float $$2) {
      this.b($$0.d, $$0.e, $$0.f, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.o($$0, $$1, $$2);
      this.w($$3);
      this.x($$4);
      this.bx();
      this.av();
   }

   public final void bx() {
      this.by();
      this.bz();
   }

   public final void c(ffs $$0, float $$1, float $$2) {
      this.l($$0);
      this.f($$1, $$2);
   }

   protected void by() {
      this.l(this.aA);
   }

   public void bz() {
      this.f(this.dL(), this.dN());
   }

   private void l(ffs $$0) {
      this.K = this.aa = $$0.d;
      this.L = this.ab = $$0.e;
      this.M = this.ac = $$0.f;
   }

   private void f(float $$0, float $$1) {
      this.N = $$0;
      this.O = $$1;
   }

   public final ffs bA() {
      return new ffs(this.aa, this.ab, this.ac);
   }

   public float f(bwv $$0) {
      float $$1 = (float)(this.dA() - $$0.dA());
      float $$2 = (float)(this.dC() - $$0.dC());
      float $$3 = (float)(this.dG() - $$0.dG());
      return azq.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double h(double $$0, double $$1, double $$2) {
      double $$3 = this.dA() - $$0;
      double $$4 = this.dC() - $$1;
      double $$5 = this.dG() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(bwv $$0) {
      return this.g($$0.dt());
   }

   public double g(ffs $$0) {
      double $$1 = this.dA() - $$0.d;
      double $$2 = this.dC() - $$0.e;
      double $$3 = this.dG() - $$0.f;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void a_(crz $$0) {
   }

   public void h(bwv $$0) {
      if (!this.z($$0)) {
         if (!$$0.ad && !this.ad) {
            double $$1 = $$0.dA() - this.dA();
            double $$2 = $$0.dG() - this.dG();
            double $$3 = azq.a($$1, $$2);
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
               if (!this.bZ() && this.bG()) {
                  this.i(-$$1, 0.0, -$$2);
               }

               if (!$$0.bZ() && $$0.bG()) {
                  $$0.i($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void h(ffs $$0) {
      this.i($$0.d, $$0.e, $$0.f);
   }

   public void i(double $$0, double $$1, double $$2) {
      this.i(this.dy().b($$0, $$1, $$2));
      this.ar = true;
   }

   protected void bB() {
      this.T = true;
   }

   @Deprecated
   public final void a(bvk $$0, float $$1) {
      if (this.az instanceof aru $$2) {
         this.a($$2, $$0, $$1);
      }
   }

   @Deprecated
   public final boolean b(bvk $$0, float $$1) {
      return this.az instanceof aru $$2 ? this.a($$2, $$0, $$1) : this.b($$0);
   }

   public abstract boolean a(aru var1, bvk var2, float var3);

   public boolean b(bvk $$0) {
      return false;
   }

   public final ffs h(float $$0) {
      return this.d(this.i($$0), this.j($$0));
   }

   public jc bC() {
      return jc.a(this.h(1.0F));
   }

   public float i(float $$0) {
      return this.k($$0);
   }

   public float j(float $$0) {
      return this.l($$0);
   }

   public float k(float $$0) {
      return $$0 == 1.0F ? this.dN() : azq.h($$0, this.O, this.dN());
   }

   public float l(float $$0) {
      return $$0 == 1.0F ? this.dL() : azq.i($$0, this.N, this.dL());
   }

   public final ffs d(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = azq.b($$3);
      float $$5 = azq.a($$3);
      float $$6 = azq.b($$2);
      float $$7 = azq.a($$2);
      return new ffs((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final ffs m(float $$0) {
      return this.e(this.i($$0), this.j($$0));
   }

   protected final ffs e(float $$0, float $$1) {
      return this.d($$0 - 90.0F, $$1);
   }

   public final ffs bD() {
      return new ffs(this.dA(), this.dE(), this.dG());
   }

   public final ffs n(float $$0) {
      double $$1 = azq.d((double)$$0, this.K, this.dA());
      double $$2 = azq.d((double)$$0, this.L, this.dC()) + (double)this.cS();
      double $$3 = azq.d((double)$$0, this.M, this.dG());
      return new ffs($$1, $$2, $$3);
   }

   public ffs o(float $$0) {
      return this.n($$0);
   }

   public final ffs p(float $$0) {
      double $$1 = azq.d((double)$$0, this.K, this.dA());
      double $$2 = azq.d((double)$$0, this.L, this.dC());
      double $$3 = azq.d((double)$$0, this.M, this.dG());
      return new ffs($$1, $$2, $$3);
   }

   public ffq a(double $$0, float $$1, boolean $$2) {
      ffs $$3 = this.n($$1);
      ffs $$4 = this.h($$1);
      ffs $$5 = $$3.b($$4.d * $$0, $$4.e * $$0, $$4.f * $$0);
      return this.dV().a(new djg($$3, $$5, djg.a.b, $$2 ? djg.b.c : djg.b.a, this));
   }

   public boolean bE() {
      return this.bJ() && this.bF();
   }

   public boolean bF() {
      return false;
   }

   public boolean bG() {
      return false;
   }

   public void a(bwv $$0, bvk $$1) {
      if ($$0 instanceof arv) {
         aq.d.a((arv)$$0, this, $$1);
      }
   }

   public boolean j(double $$0, double $$1, double $$2) {
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

      $$1 *= 64.0 * r;
      return $$0 < $$1 * $$1;
   }

   public boolean f(ua $$0) {
      if (this.aI != null && !this.aI.b()) {
         return false;
      } else {
         String $$1 = this.bI();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.h($$0);
            return true;
         }
      }
   }

   public boolean g(ua $$0) {
      return this.bY() ? false : this.f($$0);
   }

   public ua h(ua $$0) {
      try {
         if (this.ay != null) {
            $$0.a("Pos", ffs.a, new ffs(this.ay.dA(), this.dC(), this.ay.dG()));
         } else {
            $$0.a("Pos", ffs.a, this.dt());
         }

         $$0.a("Motion", ffs.a, this.dy());
         $$0.a("Rotation", ffr.i, new ffr(this.dL(), this.dN()));
         $$0.a("fall_distance", this.Z);
         $$0.a("Fire", (short)this.aK);
         $$0.a("Air", (short)this.cs());
         $$0.a("OnGround", this.aH());
         $$0.a("Invulnerable", this.aZ);
         $$0.a("PortalCooldown", this.aY);
         $$0.a("UUID", ka.a, this.cG());
         xc $$1 = this.ak();
         if ($$1 != null) {
            ali<va> $$2 = this.dX().a(uo.a);
            $$0.a("CustomName", xe.a, $$2, $$1);
         }

         if (this.cL()) {
            $$0.a("CustomNameVisible", this.cL());
         }

         if (this.ba()) {
            $$0.a("Silent", this.ba());
         }

         if (this.bb()) {
            $$0.a("NoGravity", this.bb());
         }

         if (this.ba) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.cu();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.cu());
         }

         if (this.bj) {
            $$0.a("HasVisualFire", this.bj);
         }

         if (!this.bb.isEmpty()) {
            $$0.a("Tags", d, List.copyOf(this.bb));
         }

         if (!this.bp.c()) {
            $$0.a("data", dci.b, this.bp);
         }

         this.b($$0);
         if (this.bZ()) {
            ug $$4 = new ug();

            for (bwv $$5 : this.cY()) {
               ua $$6 = new ua();
               if ($$5.f($$6)) {
                  $$4.add($$6);
               }
            }

            if (!$$4.isEmpty()) {
               $$0.a("Passengers", $$4);
            }
         }

         return $$0;
      } catch (Throwable var8) {
         p $$8 = p.a(var8, "Saving entity NBT");
         q $$9 = $$8.a("Entity being saved");
         this.a($$9);
         throw new aa($$8);
      }
   }

   public void i(ua $$0) {
      try {
         ffs $$1 = $$0.<ffs>a("Pos", ffs.a).orElse(ffs.c);
         ffs $$2 = $$0.<ffs>a("Motion", ffs.a).orElse(ffs.c);
         ffr $$3 = $$0.<ffr>a("Rotation", ffr.i).orElse(ffr.a);
         this.n(Math.abs($$2.d) > 10.0 ? 0.0 : $$2.d, Math.abs($$2.e) > 10.0 ? 0.0 : $$2.e, Math.abs($$2.f) > 10.0 ? 0.0 : $$2.f);
         this.ar = true;
         double $$4 = 3.0000512E7;
         this.o(azq.a($$1.d, -3.0000512E7, 3.0000512E7), azq.a($$1.e, -2.0E7, 2.0E7), azq.a($$1.f, -3.0000512E7, 3.0000512E7));
         this.w($$3.j);
         this.x($$3.k);
         this.bx();
         this.r(this.dL());
         this.s(this.dL());
         this.Z = $$0.b("fall_distance", 0.0);
         this.aK = $$0.b("Fire", (short)0);
         this.j($$0.b("Air", this.cr()));
         this.aH = $$0.b("OnGround", false);
         this.aZ = $$0.b("Invulnerable", false);
         this.aY = $$0.b("PortalCooldown", 0);
         $$0.<UUID>a("UUID", ka.a).ifPresent($$0x -> {
            this.at = $$0x;
            this.au = this.at.toString();
         });
         if (!Double.isFinite(this.dA()) || !Double.isFinite(this.dC()) || !Double.isFinite(this.dG())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dL()) && Double.isFinite((double)this.dN())) {
            this.av();
            this.b(this.dL(), this.dN());
            ali<va> $$5 = this.dX().a(uo.a);
            this.b($$0.<xc>a("CustomName", xe.a, $$5).orElse(null));
            this.o($$0.b("CustomNameVisible", false));
            this.e($$0.b("Silent", false));
            this.f($$0.b("NoGravity", false));
            this.j($$0.b("Glowing", false));
            this.k($$0.b("TicksFrozen", 0));
            this.bj = $$0.b("HasVisualFire", false);
            this.bp = $$0.<dci>a("data", dci.b).orElse(dci.a);
            this.bb.clear();
            $$0.<Collection<? extends E>>a("Tags", d).ifPresent(this.bb::addAll);
            this.a($$0);
            if (this.bH()) {
               this.av();
            }
         } else {
            throw new IllegalStateException("Entity has invalid rotation");
         }
      } catch (Throwable var8) {
         p $$7 = p.a(var8, "Loading entity NBT");
         q $$8 = $$7.a("Entity being loaded");
         this.a($$8);
         throw new aa($$7);
      }
   }

   protected boolean bH() {
      return true;
   }

   @Nullable
   protected final String bI() {
      bxe<?> $$0 = this.an();
      alk $$1 = bxe.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(ua var1);

   protected abstract void b(ua var1);

   @Nullable
   public coe a(aru $$0, djy $$1) {
      return this.a($$0, $$1, 0);
   }

   @Nullable
   public coe a(aru $$0, djy $$1, int $$2) {
      return this.a($$0, new daa($$1), (float)$$2);
   }

   @Nullable
   public coe a(aru $$0, daa $$1) {
      return this.a($$0, $$1, 0.0F);
   }

   @Nullable
   public coe a(aru $$0, daa $$1, float $$2) {
      if ($$1.f()) {
         return null;
      } else {
         coe $$3 = new coe($$0, this.dA(), this.dC() + (double)$$2, this.dG(), $$1);
         $$3.j();
         $$0.b($$3);
         return $$3;
      }
   }

   public boolean bJ() {
      return !this.dQ();
   }

   public boolean bK() {
      if (this.ad) {
         return false;
      } else {
         float $$0 = this.be.a() * 0.8F;
         ffn $$1 = ffn.a(this.bD(), (double)$$0, 1.0E-6, (double)$$0);
         return iw.b($$1).anyMatch($$1x -> {
            ebg $$2 = this.dV().a_($$1x);
            return !$$2.l() && $$2.j(this.dV(), $$1x) && fgj.c($$2.g(this.dV(), $$1x).a($$1x), fgj.a($$1), ffw.i);
         });
      }
   }

   public but a(crz $$0, bus $$1) {
      if (this.bJ() && this instanceof bxu $$2) {
         if ($$2.C() == $$0) {
            if (!this.dV().A_()) {
               if ($$0.fV()) {
                  $$2.z();
               } else {
                  $$2.y();
               }

               this.a(egg.r, $$0);
            }

            return but.a.b();
         }

         daa $$3 = $$0.b($$1);
         if ($$3.a(dae.vV) && $$2.p()) {
            if (!this.dV().A_()) {
               $$2.a_($$0, true);
            }

            $$3.h(1);
            return but.a;
         }
      }

      return but.e;
   }

   public boolean i(bwv $$0) {
      return $$0.bL() && !this.z($$0);
   }

   public boolean bL() {
      return false;
   }

   public void r() {
      this.i(ffs.c);
      this.h();
      if (this.bY()) {
         this.dk().j(this);
      }
   }

   public final void j(bwv $$0) {
      if (this.y($$0)) {
         this.a($$0, bwv::a_);
      }
   }

   protected void a(bwv $$0, bwv.a $$1) {
      ffs $$2 = this.m($$0);
      ffs $$3 = $$0.l(this);
      $$1.accept($$0, $$2.d - $$3.d, $$2.e - $$3.e, $$2.f - $$3.f);
   }

   public void k(bwv $$0) {
   }

   public ffs l(bwv $$0) {
      return this.ds().b(bww.b, 0, this.aE);
   }

   public ffs m(bwv $$0) {
      return this.dt().e(this.a($$0, this.be, 1.0F));
   }

   protected ffs a(bwv $$0, bwy $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static ffs a(bwv $$0, bwv $$1, bwx $$2) {
      int $$3 = $$0.cY().indexOf($$1);
      return $$2.c(bww.a, $$3, $$0.aE);
   }

   public boolean n(bwv $$0) {
      return this.a($$0, false);
   }

   public boolean bM() {
      return this instanceof bxw;
   }

   public boolean a(bwv $$0, boolean $$1) {
      if ($$0 == this.ay) {
         return false;
      } else if (!$$0.bP()) {
         return false;
      } else if (!this.dV().A_() && !$$0.s.b()) {
         return false;
      } else {
         for (bwv $$2 = $$0; $$2.ay != null; $$2 = $$2.ay) {
            if ($$2.ay == this) {
               return false;
            }
         }

         if ($$1 || this.o($$0) && $$0.r(this)) {
            if (this.bY()) {
               this.bO();
            }

            this.b(byi.a);
            this.ay = $$0;
            this.ay.p(this);
            $$0.D().filter($$0x -> $$0x instanceof arv).forEach($$0x -> aq.U.a((arv)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean o(bwv $$0) {
      return !this.cc() && this.J <= 0;
   }

   public void bN() {
      for (int $$0 = this.u.size() - 1; $$0 >= 0; $$0--) {
         ((bwv)this.u.get($$0)).bO();
      }
   }

   public void ab() {
      if (this.ay != null) {
         bwv $$0 = this.ay;
         this.ay = null;
         $$0.q(this);
      }
   }

   public void bO() {
      this.ab();
   }

   protected void p(bwv $$0) {
      if ($$0.dk() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.u.isEmpty()) {
            this.u = ImmutableList.of($$0);
         } else {
            List<bwv> $$1 = Lists.newArrayList(this.u);
            if (!this.dV().C && $$0 instanceof crz && !(this.cZ() instanceof crz)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.u = ImmutableList.copyOf($$1);
         }

         this.a(egg.s, $$0);
      }
   }

   protected void q(bwv $$0) {
      if ($$0.dk() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.u.size() == 1 && this.u.get(0) == $$0) {
            this.u = ImmutableList.of();
         } else {
            this.u = this.u.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.J = 60;
         this.a(egg.q, $$0);
      }
   }

   protected boolean r(bwv $$0) {
      return this.u.isEmpty();
   }

   protected boolean bP() {
      return true;
   }

   public final boolean bQ() {
      return this.R_() != null && this.R_().d();
   }

   public final void d(ffs $$0, float $$1, float $$2) {
      bxr $$3 = this.R_();
      if ($$3 != null) {
         $$3.a($$0, $$1, $$2);
      } else {
         this.b($$0);
         this.b($$1, $$2);
      }
   }

   @Nullable
   public bxr R_() {
      return null;
   }

   public void a(float $$0, int $$1) {
      this.r($$0);
   }

   public float bR() {
      return 0.0F;
   }

   public ffs bS() {
      return this.d(this.dN(), this.dL());
   }

   public ffs a(czw $$0) {
      if (!(this instanceof crz $$1)) {
         return ffs.c;
      } else {
         boolean $$2 = $$1.fc().a($$0) && !$$1.fb().a($$0);
         bxn $$3 = $$2 ? $$1.fy().e() : $$1.fy();
         return this.d(0.0F, this.dL() + (float)($$3 == bxn.b ? 80 : -80)).c(0.5);
      }
   }

   public ffr bT() {
      return new ffr(this.dN(), this.dL());
   }

   public ffs bU() {
      return ffs.a(this.bT());
   }

   public void a(dtd $$0, iw $$1) {
      if (this.aA()) {
         this.ay();
      } else {
         if (this.as == null || !this.as.a($$0)) {
            this.as = new byh($$0, $$1.j());
         } else if (!this.as.e()) {
            this.as.a($$1.j());
            this.as.a(true);
         }
      }
   }

   protected void bV() {
      if (this.dV() instanceof aru $$0) {
         this.M();
         if (this.as != null) {
            if (this.as.a($$0, this, this.n(false))) {
               brd $$2 = brc.a();
               $$2.a("portal");
               this.ay();
               eyq $$3 = this.as.a($$0, this);
               if ($$3 != null) {
                  aru $$4 = $$3.b();
                  if ($$0.p().a((djz)$$4) && ($$4.aj() == $$0.aj() || this.a($$0, $$4))) {
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

   public int bW() {
      bwv $$0 = this.cZ();
      return $$0 instanceof arv ? $$0.bW() : 300;
   }

   public void k(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
   }

   public void c(bvk $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            drd.a(this);
      }
   }

   public void q(float $$0) {
   }

   public boolean bX() {
      boolean $$0 = this.dV() != null && this.dV().C;
      return !this.bh() && (this.aK > 0 || $$0 && this.i(0));
   }

   public boolean bY() {
      return this.dk() != null;
   }

   public boolean bZ() {
      return !this.u.isEmpty();
   }

   public boolean ca() {
      return this.an().a(axj.p);
   }

   public boolean cb() {
      return !this.an().a(axj.q);
   }

   public void g(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean cc() {
      return this.i(1);
   }

   public boolean cd() {
      return this.cc();
   }

   public boolean ce() {
      return this.cc();
   }

   public boolean cf() {
      return this.cc();
   }

   public boolean cg() {
      return this.cc();
   }

   public boolean ch() {
      return this.c(byi.f);
   }

   public boolean ci() {
      return this.i(3);
   }

   public void h(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean cj() {
      return this.i(4);
   }

   public boolean ck() {
      return this.c(byi.d);
   }

   public boolean cl() {
      return this.ck() && !this.bi();
   }

   public void i(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cm() {
      return this.ba;
   }

   public final void j(boolean $$0) {
      this.ba = $$0;
      this.b(6, this.cn());
   }

   public boolean cn() {
      return this.dV().A_() ? this.i(6) : this.ba;
   }

   public boolean co() {
      return this.i(5);
   }

   public boolean d(crz $$0) {
      if ($$0.Z_()) {
         return false;
      } else {
         fgz $$1 = this.cq();
         return $$1 != null && $$0 != null && $$0.cq() == $$1 && $$1.j() ? false : this.co();
      }
   }

   public boolean cp() {
      return false;
   }

   public void a(BiConsumer<egd<?>, aru> $$0) {
   }

   @Nullable
   public fgs cq() {
      return this.dV().R().e(this.cI());
   }

   public final boolean s(@Nullable bwv $$0) {
      return $$0 == null ? false : this == $$0 || this.t($$0) || $$0.t(this);
   }

   protected boolean t(bwv $$0) {
      return this.a($$0.cq());
   }

   public boolean a(@Nullable fgz $$0) {
      return this.cq() != null ? this.cq().a($$0) : false;
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

   public int cr() {
      return 300;
   }

   public int cs() {
      return this.al.a(aQ);
   }

   public void j(int $$0) {
      this.al.a(aQ, $$0);
   }

   public void ct() {
      this.k(0);
   }

   public int cu() {
      return this.al.a(aV);
   }

   public void k(int $$0) {
      this.al.a(aV, $$0);
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

   public void a(aru $$0, bxv $$1) {
      this.h(this.aK + 1);
      if (this.aK == 0) {
         this.e(8.0F);
      }

      this.a($$0, this.dW().c(), 5.0F);
   }

   public void a(boolean $$0, iw $$1) {
      a(this, $$0, $$1);
   }

   protected static void a(bwv $$0, boolean $$1, iw $$2) {
      ffs $$3 = $$0.dy();
      double $$4;
      if ($$1) {
         $$4 = Math.max(-0.9, $$3.e - 0.03);
      } else {
         $$4 = Math.min(1.8, $$3.e + 0.1);
      }

      $$0.n($$3.d, $$4, $$3.f);
      a($$0.az, $$2);
   }

   protected static void a(djz $$0, iw $$1) {
      if ($$0 instanceof aru $$2) {
         for (int $$3 = 0; $$3 < 2; $$3++) {
            $$2.a(lz.ap, (double)$$1.u() + $$0.A.j(), (double)($$1.v() + 1), (double)$$1.w() + $$0.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            $$2.a(lz.d, (double)$$1.u() + $$0.A.j(), (double)($$1.v() + 1), (double)$$1.w() + $$0.A.j(), 1, 0.0, 0.01, 0.0, 0.2);
         }
      }
   }

   public void l(boolean $$0) {
      b(this, $$0);
   }

   protected static void b(bwv $$0, boolean $$1) {
      ffs $$2 = $$0.dy();
      double $$3;
      if ($$1) {
         $$3 = Math.max(-0.3, $$2.e - 0.03);
      } else {
         $$3 = Math.min(0.7, $$2.e + 0.06);
      }

      $$0.n($$2.d, $$3, $$2.f);
      $$0.k();
   }

   public boolean a(aru $$0, bxw $$1) {
      return true;
   }

   public void cy() {
      if (this.dy().b() > -0.5 && this.Z > 1.0) {
         this.Z = 1.0;
      }
   }

   public void k() {
      this.Z = 0.0;
   }

   protected void l(double $$0, double $$1, double $$2) {
      iw $$3 = iw.a($$0, $$1, $$2);
      ffs $$4 = new ffs($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      iw.a $$5 = new iw.a();
      jc $$6 = jc.b;
      double $$7 = Double.MAX_VALUE;

      for (jc $$8 : new jc[]{jc.c, jc.d, jc.e, jc.f, jc.b}) {
         $$5.a($$3, $$8);
         if (!this.dV().a_($$5).m(this.dV(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == jc.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ae.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      ffs $$13 = this.dy().c(0.75);
      if ($$6.o() == jc.a.a) {
         this.n((double)($$12 * $$11), $$13.e, $$13.f);
      } else if ($$6.o() == jc.a.b) {
         this.n($$13.d, (double)($$12 * $$11), $$13.f);
      } else if ($$6.o() == jc.a.c) {
         this.n($$13.d, $$13.e, (double)($$12 * $$11));
      }
   }

   public void a(ebg $$0, ffs $$1) {
      this.k();
      this.U = $$1;
   }

   private static xc a(xc $$0) {
      xq $$1 = $$0.e().b($$0.a().a(null));

      for (xc $$2 : $$0.c()) {
         $$1.b(a($$2));
      }

      return $$1;
   }

   @Override
   public xc ai() {
      xc $$0 = this.ak();
      return $$0 != null ? a($$0) : this.cz();
   }

   protected xc cz() {
      return this.s.h();
   }

   public boolean u(bwv $$0) {
      return this == $$0;
   }

   public float cA() {
      return 0.0F;
   }

   public void r(float $$0) {
   }

   public void s(float $$0) {
   }

   public boolean cB() {
      return true;
   }

   public boolean v(bwv $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dV() == null ? "~NULL~" : this.dV().toString();
      return this.aI != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.ai().getString(),
            this.t,
            $$0,
            this.dA(),
            this.dC(),
            this.dG(),
            this.aI
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.ai().getString(),
            this.t,
            $$0,
            this.dA(),
            this.dC(),
            this.dG()
         );
   }

   protected final boolean d(bvk $$0) {
      return this.dQ() || this.aZ && !$$0.a(axh.d) && !$$0.h() || $$0.a(axh.i) && this.bh() || $$0.a(axh.m) && this.an().a(axj.o);
   }

   public boolean cC() {
      return this.aZ;
   }

   public void m(boolean $$0) {
      this.aZ = $$0;
   }

   public void w(bwv $$0) {
      this.b($$0.dA(), $$0.dC(), $$0.dG(), $$0.dL(), $$0.dN());
   }

   public void x(bwv $$0) {
      ua $$1 = $$0.h(new ua());
      $$1.r("Dimension");
      this.i($$1);
      this.aY = $$0.aY;
      this.as = $$0.as;
   }

   @Nullable
   public bwv b(eyq $$0) {
      if (this.dV() instanceof aru $$1 && !this.dQ()) {
         aru $$3 = $$0.b();
         boolean $$4 = $$3.aj() != $$1.aj();
         if (!$$0.h()) {
            this.bO();
         }

         if ($$4) {
            return this.b($$3, $$0);
         }

         return this.a($$1, $$0);
      }

      return null;
   }

   private bwv a(aru $$0, eyq $$1) {
      for (bwv $$2 : this.cY()) {
         $$2.b(this.a($$1, $$2));
      }

      brd $$3 = brc.a();
      $$3.a("teleportSameDimension");
      this.a(byj.a($$1), $$1.i());
      if (!$$1.h()) {
         this.a($$1);
      }

      $$1.j().onTransition(this);
      $$3.c();
      return this;
   }

   private bwv b(aru $$0, eyq $$1) {
      List<bwv> $$2 = this.cY();
      List<bwv> $$3 = new ArrayList<>($$2.size());
      this.bN();

      for (bwv $$4 : $$2) {
         bwv $$5 = $$4.b(this.a($$1, $$4));
         if ($$5 != null) {
            $$3.add($$5);
         }
      }

      brd $$6 = brc.a();
      $$6.a("teleportCrossDimension");
      bwv $$7 = this.an().a($$0, bxd.s);
      if ($$7 == null) {
         $$6.c();
         return null;
      } else {
         $$7.x(this);
         this.cD();
         $$7.a(byj.a($$1), $$1.i());
         $$0.d($$7);

         for (bwv $$8 : $$3) {
            $$8.a($$7, true);
         }

         $$0.i();
         $$1.j().onTransition($$7);
         $$6.c();
         return $$7;
      }
   }

   private eyq a(eyq $$0, bwv $$1) {
      float $$2 = $$0.e() + ($$0.i().contains(byk.d) ? 0.0F : $$1.dL() - this.dL());
      float $$3 = $$0.f() + ($$0.i().contains(byk.e) ? 0.0F : $$1.dN() - this.dN());
      ffs $$4 = $$1.dt().d(this.dt());
      ffs $$5 = $$0.c().b($$0.i().contains(byk.a) ? 0.0 : $$4.a(), $$0.i().contains(byk.b) ? 0.0 : $$4.b(), $$0.i().contains(byk.c) ? 0.0 : $$4.c());
      return $$0.a($$5).a($$2, $$3).a();
   }

   private void a(eyq $$0) {
      bwv $$1 = this.cW();

      for (bwv $$2 : this.dc()) {
         if ($$2 instanceof arv) {
            arv $$3 = (arv)$$2;
            if ($$1 != null && $$3.ao() == $$1.ao()) {
               $$3.f.b(agg.a(this.ao(), byj.a($$0), $$0.i(), this.aH));
            } else {
               $$3.f.b(agg.a(this.ao(), byj.a(this), Set.of(), this.aH));
            }
         }
      }
   }

   public void a(byj $$0, Set<byk> $$1) {
      byj $$2 = byj.a(this);
      byj $$3 = byj.a($$2, $$0, $$1);
      this.o($$3.a().d, $$3.a().e, $$3.a().f);
      this.w($$3.c());
      this.r($$3.c());
      this.x($$3.d());
      this.av();
      this.bx();
      this.i($$3.b());
      this.bl.clear();
   }

   public void a(float $$0, float $$1) {
      this.w($$0);
      this.r($$0);
      this.x($$1);
      this.bz();
   }

   public void f(iw $$0) {
      if (this.dV() instanceof aru $$1) {
         $$1.m().a(asb.g, new dje($$0), 3);
      }
   }

   protected void cD() {
      this.c(bwv.d.e);
      if (this instanceof bxu $$0) {
         $$0.z();
      }
   }

   public ffs a(jc.a $$0, m.a $$1) {
      return eyp.a($$1, $$0, this.dt(), this.a(this.at()));
   }

   public boolean n(boolean $$0) {
      return ($$0 || !this.bY()) && this.bJ();
   }

   public boolean a(djz $$0, djz $$1) {
      if ($$0.aj() == djz.k && $$1.aj() == djz.i) {
         for (bwv $$2 : this.cY()) {
            if ($$2 instanceof arv $$3 && !$$3.i) {
               return false;
            }
         }
      }

      return true;
   }

   public float a(djs $$0, djd $$1, iw $$2, ebg $$3, exq $$4, float $$5) {
      return $$5;
   }

   public boolean a(djs $$0, djd $$1, iw $$2, ebg $$3, float $$4) {
      return true;
   }

   public int cE() {
      return 3;
   }

   public boolean g_() {
      return false;
   }

   public void a(q $$0) {
      $$0.a("Entity Type", () -> bxe.a(this.an()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.t);
      $$0.a("Entity Name", () -> this.ai().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dA(), this.dC(), this.dG()));
      $$0.a("Entity's Block location", q.a(this.dV(), azq.a(this.dA()), azq.a(this.dC()), azq.a(this.dG())));
      ffs $$1 = this.dy();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.d, $$1.e, $$1.f));
      $$0.a("Entity's Passengers", () -> this.cY().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.dk()));
   }

   public boolean cF() {
      return this.bX() && !this.Z_();
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
      return r;
   }

   public static void b(double $$0) {
      r = $$0;
   }

   @Override
   public xc m_() {
      return fgs.a(this.cq(), this.ai()).a($$0 -> $$0.a(this.cQ()).a(this.cH()));
   }

   public void b(@Nullable xc $$0) {
      this.al.a(aR, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public xc ak() {
      return this.al.a(aR).orElse(null);
   }

   @Override
   public boolean h_() {
      return this.al.a(aR).isPresent();
   }

   public void o(boolean $$0) {
      this.al.a(aS, $$0);
   }

   public boolean cL() {
      return this.al.a(aS);
   }

   public boolean a(aru $$0, double $$1, double $$2, double $$3, Set<byk> $$4, float $$5, float $$6, boolean $$7) {
      bwv $$8 = this.b(new eyq($$0, new ffs($$1, $$2, $$3), ffs.c, $$5, $$6, $$4, eyq.a));
      return $$8 != null;
   }

   public void m(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (this.dV() instanceof aru) {
         this.b($$0, $$1, $$2, this.dL(), this.dN());
         this.v();
      }
   }

   private void v() {
      this.da().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.u.iterator();

         while (var1.hasNext()) {
            bwv $$1 = (bwv)var1.next();
            $$0.a($$1, bwv::d);
         }
      });
   }

   public void c(double $$0, double $$1, double $$2) {
      this.b(this.dA() + $$0, this.dC() + $$1, this.dG() + $$2);
   }

   public boolean cM() {
      return this.cL();
   }

   @Override
   public void a(List<akr.c<?>> $$0) {
   }

   @Override
   public void a(akn<?> $$0) {
      if (aq.equals($$0)) {
         this.i_();
      }
   }

   @Deprecated
   protected void cN() {
      byi $$0 = this.at();
      bwy $$1 = this.a($$0);
      this.be = $$1;
      this.bf = $$1.c();
   }

   public void i_() {
      bwy $$0 = this.be;
      byi $$1 = this.at();
      bwy $$2 = this.a($$1);
      this.be = $$2;
      this.bf = $$2.c();
      this.av();
      boolean $$3 = $$2.a() <= 4.0F && $$2.b() <= 4.0F;
      if (!this.az.C && !this.ak && !this.ad && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof crz)) {
         this.a($$0);
      }
   }

   public boolean a(bwy $$0) {
      bwy $$1 = this.a(this.at());
      ffs $$2 = this.dt().b(0.0, (double)$$0.b() / 2.0, 0.0);
      double $$3 = (double)Math.max(0.0F, $$1.a() - $$0.a()) + 1.0E-6;
      double $$4 = (double)Math.max(0.0F, $$1.b() - $$0.b()) + 1.0E-6;
      fgm $$5 = fgj.a(ffn.a($$2, $$3, $$4, $$3));
      Optional<ffs> $$6 = this.az.a(this, $$5, $$2, (double)$$1.a(), (double)$$1.b(), (double)$$1.a());
      if ($$6.isPresent()) {
         this.b($$6.get().b(0.0, (double)(-$$1.b()) / 2.0, 0.0));
         return true;
      } else {
         if ($$1.a() > $$0.a() && $$1.b() > $$0.b()) {
            fgm $$7 = fgj.a(ffn.a($$2, $$3, 1.0E-6, $$3));
            Optional<ffs> $$8 = this.az.a(this, $$7, $$2, (double)$$1.a(), (double)$$0.b(), (double)$$1.a());
            if ($$8.isPresent()) {
               this.b($$8.get().b(0.0, (double)(-$$0.b()) / 2.0 + 1.0E-6, 0.0));
               return true;
            }
         }

         return false;
      }
   }

   public jc cO() {
      return jc.a((double)this.dL());
   }

   public jc cP() {
      return this.cO();
   }

   protected xi cQ() {
      return new xi.c(new xi.b(this.an(), this.cG(), this.ai()));
   }

   public boolean a(arv $$0) {
      return true;
   }

   @Override
   public final ffn cR() {
      return this.aG;
   }

   public final void a(ffn $$0) {
      this.aG = $$0;
   }

   public final float d(byi $$0) {
      return this.a($$0).c();
   }

   public final float cS() {
      return this.bf;
   }

   public ffs t(float $$0) {
      return this.cT();
   }

   protected ffs cT() {
      return new ffs(0.0, (double)this.cS(), (double)(this.dq() * 0.4F));
   }

   public byn a_(int $$0) {
      return byn.a;
   }

   public djz cU() {
      return this.dV();
   }

   @Nullable
   public MinecraftServer cV() {
      return this.dV().p();
   }

   public but a(crz $$0, ffs $$1, bus $$2) {
      return but.e;
   }

   public boolean a(djs $$0) {
      return false;
   }

   public void d(arv $$0) {
   }

   public void e(arv $$0) {
   }

   public float a(dty $$0) {
      float $$1 = azq.h(this.dL());
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

   public float a(dsh $$0) {
      float $$1 = azq.h(this.dL());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public csv a(csu $$0) {
      return this.an().a(axj.r) ? csv.b : csv.a;
   }

   @Nullable
   public bxw cW() {
      return null;
   }

   public final boolean cX() {
      return this.cW() != null;
   }

   public final List<bwv> cY() {
      return this.u;
   }

   @Nullable
   public bwv cZ() {
      return this.u.isEmpty() ? null : (bwv)this.u.get(0);
   }

   public boolean y(bwv $$0) {
      return this.u.contains($$0);
   }

   public boolean a(Predicate<bwv> $$0) {
      UnmodifiableIterator var2 = this.u.iterator();

      while (var2.hasNext()) {
         bwv $$1 = (bwv)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bwv> D() {
      return this.u.stream().flatMap(bwv::da);
   }

   @Override
   public Stream<bwv> da() {
      return Stream.concat(Stream.of(this), this.D());
   }

   @Override
   public Stream<bwv> db() {
      return Stream.concat(this.u.stream().flatMap(bwv::db), Stream.of(this));
   }

   public Iterable<bwv> dc() {
      return () -> this.D().iterator();
   }

   public int dd() {
      return (int)this.D().filter($$0 -> $$0 instanceof crz).count();
   }

   public boolean de() {
      return this.dd() == 1;
   }

   public bwv df() {
      bwv $$0 = this;

      while ($$0.bY()) {
         $$0 = $$0.dk();
      }

      return $$0;
   }

   public boolean z(bwv $$0) {
      return this.df() == $$0.df();
   }

   public boolean A(bwv $$0) {
      if (!$$0.bY()) {
         return false;
      } else {
         bwv $$1 = $$0.dk();
         return $$1 == this ? true : this.A($$1);
      }
   }

   public final boolean dg() {
      return this.az.A_() ? this.dh() : !this.P_();
   }

   protected boolean dh() {
      bxw $$0 = this.cW();
      return $$0 != null && $$0.dh();
   }

   public boolean P_() {
      bxw $$0 = this.cW();
      return $$0 != null && $$0.P_();
   }

   public boolean di() {
      return this.dg();
   }

   public boolean dj() {
      return this.dg();
   }

   protected static ffs a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -azq.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = azq.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new ffs((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public ffs b(bxw $$0) {
      return new ffs(this.dA(), this.cR().e, this.dG());
   }

   @Nullable
   public bwv dk() {
      return this.ay;
   }

   @Nullable
   public bwv dl() {
      return this.ay != null && this.ay.cW() == this ? this.ay : null;
   }

   public exv j_() {
      return exv.a;
   }

   public aws dm() {
      return aws.g;
   }

   protected int dn() {
      return 1;
   }

   public ek d(aru $$0) {
      return new ek(ej.a, this.dt(), this.bT(), $$0, 0, this.ai().getString(), this.m_(), $$0.p(), this);
   }

   public void a(ew.a $$0, ffs $$1) {
      ffs $$2 = $$0.a(this);
      double $$3 = $$1.d - $$2.d;
      double $$4 = $$1.e - $$2.e;
      double $$5 = $$1.f - $$2.f;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.x(azq.h((float)(-(azq.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.w(azq.h((float)(azq.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.r(this.dL());
      this.O = this.dN();
      this.N = this.dL();
   }

   public float u(float $$0) {
      return azq.h($$0, this.N, this.aE);
   }

   public boolean a(axv<exp> $$0, double $$1) {
      if (this.do()) {
         return false;
      } else {
         ffn $$2 = this.cR().h(0.001);
         int $$3 = azq.a($$2.a);
         int $$4 = azq.c($$2.d);
         int $$5 = azq.a($$2.b);
         int $$6 = azq.c($$2.e);
         int $$7 = azq.a($$2.c);
         int $$8 = azq.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cJ();
         boolean $$11 = false;
         ffs $$12 = ffs.c;
         int $$13 = 0;
         iw.a $$14 = new iw.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  exq $$18 = this.dV().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a(this.dV(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           ffs $$20 = $$18.c(this.dV(), $$14);
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

            if (!(this instanceof crz)) {
               $$12 = $$12.d();
            }

            ffs $$21 = this.dy();
            $$12 = $$12.c($$1);
            double $$22 = 0.003;
            if (Math.abs($$21.d) < 0.003 && Math.abs($$21.f) < 0.003 && $$12.g() < 0.0045000000000000005) {
               $$12 = $$12.d().c(0.0045000000000000005);
            }

            this.i(this.dy().e($$12));
         }

         this.ah.put($$0, $$9);
         return $$11;
      }
   }

   public boolean do() {
      ffn $$0 = this.cR().g(1.0);
      int $$1 = azq.a($$0.a);
      int $$2 = azq.c($$0.d);
      int $$3 = azq.a($$0.c);
      int $$4 = azq.c($$0.f);
      return !this.dV().b($$1, $$3, $$2, $$4);
   }

   public double b(axv<exp> $$0) {
      return this.ah.getDouble($$0);
   }

   public double dp() {
      return (double)this.cS() < 0.4 ? 0.0 : 0.4;
   }

   public final float dq() {
      return this.be.a();
   }

   public final float dr() {
      return this.be.b();
   }

   public zj<aby> a(ars $$0) {
      return new abz(this, $$0);
   }

   public bwy a(byi $$0) {
      return this.s.n();
   }

   public final bwx ds() {
      return this.be.d();
   }

   public ffs dt() {
      return this.aA;
   }

   public ffs du() {
      return this.dt();
   }

   @Override
   public iw dv() {
      return this.aB;
   }

   public ebg dw() {
      if (this.bk == null) {
         this.bk = this.dV().a_(this.dv());
      }

      return this.bk;
   }

   public dje dx() {
      return this.aC;
   }

   public ffs dy() {
      return this.aD;
   }

   public void i(ffs $$0) {
      this.aD = $$0;
   }

   public void j(ffs $$0) {
      this.i(this.dy().e($$0));
   }

   public void n(double $$0, double $$1, double $$2) {
      this.i(new ffs($$0, $$1, $$2));
   }

   public final int dz() {
      return this.aB.u();
   }

   public final double dA() {
      return this.aA.d;
   }

   public double c(double $$0) {
      return this.aA.d + (double)this.dq() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ae.j() - 1.0) * $$0);
   }

   public final int dB() {
      return this.aB.v();
   }

   public final double dC() {
      return this.aA.e;
   }

   public double e(double $$0) {
      return this.aA.e + (double)this.dr() * $$0;
   }

   public double dD() {
      return this.e(this.ae.j());
   }

   public double dE() {
      return this.aA.e + (double)this.bf;
   }

   public final int dF() {
      return this.aB.w();
   }

   public final double dG() {
      return this.aA.f;
   }

   public double f(double $$0) {
      return this.aA.f + (double)this.dq() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ae.j() - 1.0) * $$0);
   }

   public final void o(double $$0, double $$1, double $$2) {
      if (this.aA.d != $$0 || this.aA.e != $$1 || this.aA.f != $$2) {
         this.aA = new ffs($$0, $$1, $$2);
         int $$3 = azq.a($$0);
         int $$4 = azq.a($$1);
         int $$5 = azq.a($$2);
         if ($$3 != this.aB.u() || $$4 != this.aB.v() || $$5 != this.aB.w()) {
            this.aB = new iw($$3, $$4, $$5);
            this.bk = null;
            if (jz.a($$3) != this.aC.h || jz.a($$5) != this.aC.i) {
               this.aC = new dje(this.aB);
            }
         }

         this.aW.a();
      }
   }

   public void dH() {
   }

   public ffs v(float $$0) {
      return this.p($$0).b(0.0, (double)this.bf * 0.7, 0.0);
   }

   public void a(abz $$0) {
      int $$1 = $$0.b();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      double $$4 = $$0.i();
      this.e($$2, $$3, $$4);
      this.b($$2, $$3, $$4, $$0.n(), $$0.m());
      this.e($$1);
      this.a_($$0.e());
      ffs $$5 = new ffs($$0.j(), $$0.k(), $$0.l());
      this.i($$5);
   }

   @Nullable
   public daa dI() {
      return null;
   }

   public void p(boolean $$0) {
      this.av = $$0;
   }

   public boolean dJ() {
      return !this.an().a(axj.k);
   }

   public boolean dK() {
      return this.cu() > 0;
   }

   public float dL() {
      return this.aE;
   }

   public float dM() {
      return this.dL();
   }

   public void w(float $$0) {
      if (!Float.isFinite($$0)) {
         ag.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aE = $$0;
      }
   }

   public float dN() {
      return this.aF;
   }

   public void x(float $$0) {
      if (!Float.isFinite($$0)) {
         ag.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aF = Math.clamp($$0 % 360.0F, -90.0F, 90.0F);
      }
   }

   public boolean dO() {
      return false;
   }

   public float dP() {
      return 0.0F;
   }

   public void b_(@Nullable bwv $$0) {
   }

   @Override
   public final boolean dQ() {
      return this.aI != null;
   }

   @Nullable
   public bwv.d dR() {
      return this.aI;
   }

   @Override
   public final void c(bwv.d $$0) {
      if (this.aI == null) {
         this.aI = $$0;
      }

      if (this.aI.a()) {
         this.bO();
      }

      this.cY().forEach(bwv::bO);
      this.aW.a($$0);
      this.b($$0);
   }

   protected void dS() {
      this.aI = null;
   }

   @Override
   public void a(efm $$0) {
      this.aW = $$0;
   }

   @Override
   public boolean dT() {
      if (this.aI != null && !this.aI.b()) {
         return false;
      } else {
         return this.bY() ? false : !this.bZ() || !this.de();
      }
   }

   @Override
   public boolean dU() {
      return false;
   }

   public boolean c(aru $$0, iw $$1) {
      return true;
   }

   public djz dV() {
      return this.az;
   }

   protected void a(djz $$0) {
      this.az = $$0;
   }

   public bvl dW() {
      return this.dV().al();
   }

   public ju dX() {
      return this.dV().J_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / (double)$$0;
      double $$7 = azq.d($$6, this.dA(), $$1);
      double $$8 = azq.d($$6, this.dC(), $$2);
      double $$9 = azq.d($$6, this.dG(), $$3);
      float $$10 = (float)azq.e($$6, (double)this.dL(), $$4);
      float $$11 = (float)azq.d($$6, (double)this.dN(), $$5);
      this.a_($$7, $$8, $$9);
      this.b($$10, $$11);
   }

   public azz dY() {
      return this.ae;
   }

   public ffs ae() {
      if (this.cW() instanceof crz $$0 && this.bJ()) {
         return $$0.ae();
      }

      return this.dy();
   }

   @Nullable
   public daa dZ() {
      return null;
   }

   public Optional<alj<fao>> ea() {
      return this.s.j();
   }

   protected void a(kg $$0) {
      this.a($$0, kl.g);
      this.a($$0, kl.b);
   }

   public final void c(daa $$0) {
      this.a($$0.a());
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      if ($$0 == kl.g) {
         return c((kk<T>)$$0, this.ak());
      } else {
         return $$0 == kl.b ? c((kk<T>)$$0, this.bp) : null;
      }
   }

   @Nullable
   @Contract("_,!null->!null;_,_->_")
   protected static <T> T c(kk<T> $$0, @Nullable Object $$1) {
      return (T)$$1;
   }

   public <T> void d(kk<T> $$0, T $$1) {
      this.b($$0, $$1);
   }

   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.g) {
         this.b(c(kl.g, $$1));
         return true;
      } else if ($$0 == kl.b) {
         this.bp = c(kl.b, $$1);
         return true;
      } else {
         return false;
      }
   }

   protected <T> boolean a(kg $$0, kk<T> $$1) {
      T $$2 = $$0.a($$1);
      return $$2 != null ? this.b($$1, $$2) : false;
   }

   @FunctionalInterface
   public interface a {
      void accept(bwv var1, double var2, double var4, double var6);
   }

   static record b(ffs a, ffs b) {
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
