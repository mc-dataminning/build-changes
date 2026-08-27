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

public abstract class bfj implements beb, dfs, dr {
   private static final Logger c = LogUtils.getLogger();
   public static final String v = "id";
   public static final String w = "Passengers";
   private static final AtomicInteger d = new AtomicInteger();
   private static final List<cfz> e = Collections.emptyList();
   public static final int x = 60;
   public static final int y = 300;
   public static final int z = 1024;
   public static final float A = 0.2F;
   public static final double B = 0.500001;
   public static final double C = 0.999999;
   public static final float D = 0.11111111F;
   public static final int E = 140;
   public static final int F = 40;
   private static final eed k = new eed(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double l = 0.014;
   private static final double m = 0.007;
   private static final double n = 0.0023333333333333335;
   public static final String G = "UUID";
   private static double o = 1.0;
   private final bfn<?> p;
   private int q = d.incrementAndGet();
   public boolean H;
   private ImmutableList<bfj> r = ImmutableList.of();
   protected int I;
   @Nullable
   private bfj s;
   private cmm t;
   public double J;
   public double K;
   public double L;
   private eei u;
   private gu aD;
   private clt aE;
   private eei aF = eei.b;
   private float aG;
   private float aH;
   public float M;
   public float N;
   private eed aI = k;
   private boolean aJ;
   public boolean O;
   public boolean P;
   public boolean Q;
   public boolean R;
   public boolean S;
   protected eei T = eei.b;
   @Nullable
   private bfj.c aK;
   public static final float U = 0.6F;
   public static final float V = 1.8F;
   public float W;
   public float X;
   public float Y;
   public float Z;
   public float aa;
   private float aL = 1.0F;
   public double ab;
   public double ac;
   public double ad;
   private float aM;
   public boolean ae;
   protected final apf af = apf.a();
   public int ag;
   private int aN = -this.cZ();
   protected boolean ah;
   protected Object2DoubleMap<anl<dxd>> ai = new Object2DoubleArrayMap(2);
   protected boolean aj;
   private final Set<anl<dxd>> aO = new HashSet<>();
   public int ak;
   protected boolean al = true;
   protected final acb am;
   protected static final aby<Byte> an = acb.a(bfj.class, aca.a);
   protected static final int ao = 0;
   private static final int aP = 1;
   private static final int aQ = 3;
   private static final int aR = 4;
   private static final int aS = 5;
   protected static final int ap = 6;
   protected static final int aq = 7;
   private static final aby<Integer> aT = acb.a(bfj.class, aca.b);
   private static final aby<Optional<sw>> aU = acb.a(bfj.class, aca.g);
   private static final aby<Boolean> aV = acb.a(bfj.class, aca.k);
   private static final aby<Boolean> aW = acb.a(bfj.class, aca.k);
   private static final aby<Boolean> aX = acb.a(bfj.class, aca.k);
   protected static final aby<bgl> ar = acb.a(bfj.class, aca.v);
   private static final aby<Integer> aY = acb.a(bfj.class, aca.b);
   private dft aZ = dft.a;
   private final aaz ba = new aaz();
   public boolean as;
   public boolean at;
   private int bb;
   protected boolean au;
   protected int av;
   protected gu aw;
   private boolean bc;
   protected UUID ax = apa.a(this.af);
   protected String ay = this.ax.toString();
   private boolean bd;
   private final Set<String> be = Sets.newHashSet();
   private final double[] bf = new double[]{0.0, 0.0, 0.0};
   private long bg;
   private bfk bh;
   private float bi;
   public boolean az;
   public boolean aA;
   public boolean aB;
   public Optional<gu> aC = Optional.empty();
   private boolean bj = false;
   private float bk;
   private int bl;
   private boolean bm;
   @Nullable
   private dcb bn = null;

   public bfj(bfn<?> $$0, cmm $$1) {
      this.p = $$0;
      this.t = $$1;
      this.bh = $$0.n();
      this.u = eei.b;
      this.aD = gu.b;
      this.aE = clt.b;
      this.am = new acb(this);
      this.am.a(an, (byte)0);
      this.am.a(aT, this.ce());
      this.am.a(aV, false);
      this.am.a(aU, Optional.empty());
      this.am.a(aW, false);
      this.am.a(aX, false);
      this.am.a(ar, bgl.a);
      this.am.a(aY, 0);
      this.a_();
      this.e(0.0, 0.0, 0.0);
      this.bi = this.a(bgl.a, this.bh);
   }

   public boolean a(gu $$0, dcb $$1) {
      efb $$2 = $$1.b(this.dI(), $$0, een.a(this));
      efb $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return eey.c($$3, eey.a(this.cE()), eem.i);
   }

   public int k_() {
      efi $$0 = this.cd();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean G_() {
      return false;
   }

   public final void ac() {
      if (this.bN()) {
         this.bz();
      }

      if (this.bM()) {
         this.Y();
      }
   }

   public void f(double $$0, double $$1, double $$2) {
      this.ba.e(new eei($$0, $$1, $$2));
   }

   public aaz ad() {
      return this.ba;
   }

   public bfn<?> ae() {
      return this.p;
   }

   @Override
   public int af() {
      return this.q;
   }

   public void e(int $$0) {
      this.q = $$0;
   }

   public Set<String> ag() {
      return this.be;
   }

   public boolean a(String $$0) {
      return this.be.size() >= 1024 ? false : this.be.add($$0);
   }

   public boolean b(String $$0) {
      return this.be.remove($$0);
   }

   public void ah() {
      this.a(bfj.c.a);
      this.a(dgl.p);
   }

   public final void ai() {
      this.a(bfj.c.b);
   }

   protected abstract void a_();

   public acb aj() {
      return this.am;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bfj ? ((bfj)$$0).q == this.q : false;
   }

   @Override
   public int hashCode() {
      return this.q;
   }

   public void a(bfj.c $$0) {
      this.b($$0);
   }

   public void ak() {
   }

   public void b(bgl $$0) {
      this.am.b(ar, $$0);
   }

   public bgl al() {
      return this.am.b(ar);
   }

   public boolean c(bgl $$0) {
      return this.al() == $$0;
   }

   public boolean a(bfj $$0, double $$1) {
      return this.dg().a((ho)$$0.dg(), $$1);
   }

   public boolean a(bfj $$0, double $$1, double $$2) {
      double $$3 = $$0.dn() - this.dn();
      double $$4 = $$0.dp() - this.dp();
      double $$5 = $$0.dt() - this.dt();
      return apa.e($$3, $$5) < apa.k($$1) && apa.k($$4) < apa.k($$2);
   }

   protected void a(float $$0, float $$1) {
      this.a_($$0 % 360.0F);
      this.b_($$1 % 360.0F);
   }

   public final void a(eei $$0) {
      this.e($$0.a(), $$0.b(), $$0.c());
   }

   public void e(double $$0, double $$1, double $$2) {
      this.p($$0, $$1, $$2);
      this.a(this.am());
   }

   protected eed am() {
      return this.bh.a(this.u);
   }

   protected void an() {
      this.e(this.u.c, this.u.d, this.u.e);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.b_(this.dA() + $$2);
      this.a_(this.dy() + $$3);
      this.b_(apa.a(this.dA(), -90.0F, 90.0F));
      this.N += $$2;
      this.M += $$3;
      this.N = apa.a(this.N, -90.0F, 90.0F);
      if (this.s != null) {
         this.s.j(this);
      }
   }

   public void l() {
      this.ao();
   }

   public void ao() {
      this.dI().ad().a("entityBaseTick");
      this.bn = null;
      if (this.bM() && this.cW().dD()) {
         this.Y();
      }

      if (this.I > 0) {
         this.I--;
      }

      this.W = this.X;
      this.N = this.dA();
      this.M = this.dy();
      this.bG();
      if (this.bg()) {
         this.bh();
      }

      this.aA = this.az;
      this.az = false;
      this.bb();
      this.q();
      this.ba();
      if (this.dI().B) {
         this.aw();
      } else if (this.aN > 0) {
         if (this.aU()) {
            this.h(this.aN - 4);
            if (this.aN < 0) {
               this.aw();
            }
         } else {
            if (this.aN % 20 == 0 && !this.bi()) {
               this.a(this.dJ().c(), 1.0F);
            }

            this.h(this.aN - 1);
         }

         if (this.cg() > 0) {
            this.k(0);
            this.dI().a(null, 1009, this.aD, 1);
         }
      }

      if (this.bi()) {
         this.au();
         this.aa *= 0.5F;
      }

      this.ap();
      if (!this.dI().B) {
         this.a_(this.aN > 0);
      }

      this.al = false;
      this.dI().ad().c();
   }

   public void a_(boolean $$0) {
      this.b(0, $$0 || this.bm);
   }

   public void ap() {
      if (this.dp() < (double)(this.dI().C_() - 64)) {
         this.ax();
      }
   }

   public void aq() {
      this.bb = this.bH();
   }

   public void f(int $$0) {
      this.bb = $$0;
   }

   public int ar() {
      return this.bb;
   }

   public boolean as() {
      return this.bb > 0;
   }

   protected void H() {
      if (this.as()) {
         this.bb--;
      }
   }

   public int at() {
      return 0;
   }

   public void au() {
      if (!this.aU()) {
         this.g(15);
         if (this.a(this.dJ().d(), 4.0F)) {
            this.a(amh.iT, 0.4F, 2.0F + this.af.i() * 0.4F);
         }
      }
   }

   public void g(int $$0) {
      int $$1 = $$0 * 20;
      if (this instanceof bfz) {
         $$1 = ckt.a((bfz)this, $$1);
      }

      if (this.aN < $$1) {
         this.h($$1);
      }
   }

   public void h(int $$0) {
      this.aN = $$0;
   }

   public int av() {
      return this.aN;
   }

   public void aw() {
      this.h(0);
   }

   protected void ax() {
      this.ai();
   }

   public boolean g(double $$0, double $$1, double $$2) {
      return this.b(this.cE().d($$0, $$1, $$2));
   }

   private boolean b(eed $$0) {
      return this.dI().a(this, $$0) && !this.dI().d($$0);
   }

   public void c(boolean $$0) {
      this.aJ = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, eei $$1) {
      this.aJ = $$0;
      this.b($$0, $$1);
   }

   public boolean d(gu $$0) {
      return this.aC.isPresent() && this.aC.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable eei $$1) {
      if ($$0) {
         eed $$2 = this.cE();
         eed $$3 = new eed($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<gu> $$4 = this.t.f(this, $$3);
         if ($$4.isPresent() || this.bj) {
            this.aC = $$4;
         } else if ($$1 != null) {
            eed $$5 = $$3.d(-$$1.c, 0.0, -$$1.e);
            $$4 = this.t.f(this, $$5);
            this.aC = $$4;
         }

         this.bj = $$4.isEmpty();
      } else {
         this.bj = false;
         if (this.aC.isPresent()) {
            this.aC = Optional.empty();
         }
      }
   }

   public boolean ay() {
      return this.aJ;
   }

   public void a(bgf $$0, eei $$1) {
      if (this.ae) {
         this.e(this.dn() + $$1.c, this.dp() + $$1.d, this.dt() + $$1.e);
      } else {
         this.aB = this.bL();
         if ($$0 == bgf.c) {
            $$1 = this.c($$1);
            if ($$1.equals(eei.b)) {
               return;
            }
         }

         this.dI().ad().a("move");
         if (this.T.g() > 1.0E-7) {
            $$1 = $$1.h(this.T);
            this.T = eei.b;
            this.f(eei.b);
         }

         $$1 = this.a($$1, $$0);
         eei $$2 = this.h($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.aa != 0.0F && $$3 >= 1.0) {
               eee $$4 = this.dI().a(new clv(this.dg(), this.dg().e($$2), clv.a.d, clv.b.d, this));
               if ($$4.c() != eeg.a.a) {
                  this.n();
               }
            }

            this.e(this.dn() + $$2.c, this.dp() + $$2.d, this.dt() + $$2.e);
         }

         this.dI().ad().c();
         this.dI().ad().a("rest");
         boolean $$5 = !apa.b($$1.c, $$2.c);
         boolean $$6 = !apa.b($$1.e, $$2.e);
         this.O = $$5 || $$6;
         this.P = $$1.d != $$2.d;
         this.Q = this.P && $$1.d < 0.0;
         if (this.O) {
            this.R = this.b($$2);
         } else {
            this.R = false;
         }

         this.a(this.Q, $$2);
         gu $$7 = this.aD();
         dcb $$8 = this.dI().a_($$7);
         this.a($$2.d, this.ay(), $$8, $$7);
         if (this.dD()) {
            this.dI().ad().c();
         } else {
            if (this.O) {
               eei $$9 = this.dl();
               this.o($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            cpn $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.dI(), this);
            }

            if (this.ay()) {
               $$10.a(this.dI(), $$7, $$8, this);
            }

            bfj.b $$11 = this.aS();
            if ($$11.a() && !this.bM()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.Z = this.Z + (float)($$2.f() * 0.6);
               gu $$15 = this.aF();
               dcb $$16 = this.dI().a_($$15);
               boolean $$17 = this.c($$16);
               if (!$$17) {
                  $$13 = 0.0;
               }

               this.X = this.X + (float)$$2.h() * 0.6F;
               this.Y = this.Y + (float)Math.sqrt($$12 * $$12 + $$13 * $$13 + $$14 * $$14) * 0.6F;
               if (this.Y > this.aL && !$$16.i()) {
                  boolean $$18 = $$15.equals($$7);
                  boolean $$19 = this.a($$7, $$8, $$11.c(), $$18, $$1);
                  if (!$$18) {
                     $$19 |= this.a($$15, $$16, false, $$11.b(), $$1);
                  }

                  if ($$19) {
                     this.aL = this.aI();
                  } else if (this.aV()) {
                     this.aL = this.aI();
                     if ($$11.c()) {
                        this.aN();
                     }

                     if ($$11.b()) {
                        this.a(dgl.R);
                     }
                  }
               } else if ($$16.i()) {
                  this.aC();
               }
            }

            this.az();
            float $$20 = this.aH();
            this.f(this.dl().d((double)$$20, 1.0, (double)$$20));
            if (this.dI().c(this.cE().h(1.0E-6)).noneMatch($$0x -> $$0x.a(amw.aI) || $$0x.a(cpo.H))) {
               if (this.aN <= 0) {
                  this.h(-this.cZ());
               }

               if (this.aB && (this.az || this.aX())) {
                  this.aA();
               }
            }

            if (this.bL() && (this.az || this.aX())) {
               this.h(-this.cZ());
            }

            this.dI().ad().c();
         }
      }
   }

   private boolean c(dcb $$0) {
      return $$0.a(amw.aN) || $$0.a(cpo.qC);
   }

   private boolean a(gu $$0, dcb $$1, boolean $$2, boolean $$3, eei $$4) {
      if ($$1.i()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.ay() || $$5 || this.bU() && $$4.d == 0.0 || this.cc()) && !this.bW()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.dI().a(dgl.Q, this.dg(), dgl.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean b(eei $$0) {
      return false;
   }

   protected void az() {
      try {
         this.aM();
      } catch (Throwable var4) {
         o $$1 = o.a(var4, "Checking entity block collision");
         p $$2 = $$1.a("Entity being checked for collision");
         this.a($$2);
         throw new y($$1);
      }
   }

   protected void aA() {
      this.a(amh.iY, 0.7F, 1.6F + (this.af.i() - this.af.i()) * 0.4F);
   }

   public void aB() {
      if (!this.dI().B && this.aB) {
         this.aA();
      }

      this.aw();
   }

   protected void aC() {
      if (this.aP()) {
         this.aO();
         if (this.aS().b()) {
            this.a(dgl.y);
         }
      }
   }

   @Deprecated
   public gu aD() {
      return this.d(0.2F);
   }

   protected gu aE() {
      return this.d(0.500001F);
   }

   public gu aF() {
      return this.d(1.0E-5F);
   }

   protected gu d(float $$0) {
      if (this.aC.isPresent()) {
         gu $$1 = this.aC.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            dcb $$2 = this.dI().a_($$1);
            return (!((double)$$0 <= 0.5) || !$$2.a(amw.S)) && !$$2.a(amw.L) && !($$2.b() instanceof csi) ? $$1.h(apa.a(this.u.d - (double)$$0)) : $$1;
         }
      } else {
         int $$3 = apa.a(this.u.c);
         int $$4 = apa.a(this.u.d - (double)$$0);
         int $$5 = apa.a(this.u.e);
         return new gu($$3, $$4, $$5);
      }
   }

   protected float aG() {
      float $$0 = this.dI().a_(this.di()).b().j();
      float $$1 = this.dI().a_(this.aE()).b().j();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aH() {
      dcb $$0 = this.dI().a_(this.di());
      float $$1 = $$0.b().i();
      if (!$$0.a(cpo.G) && !$$0.a(cpo.nd)) {
         return (double)$$1 == 1.0 ? this.dI().a_(this.aE()).b().i() : $$1;
      } else {
         return $$1;
      }
   }

   protected eei a(eei $$0, bgf $$1) {
      return $$0;
   }

   protected eei c(eei $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.dI().V();
         if ($$1 != this.bg) {
            Arrays.fill(this.bf, 0.0);
            this.bg = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(ha.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? eei.b : new eei($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(ha.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? eei.b : new eei(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(ha.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? eei.b : new eei(0.0, 0.0, $$4);
         } else {
            return eei.b;
         }
      }
   }

   private double a(ha.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = apa.a($$1 + this.bf[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bf[$$2];
      this.bf[$$2] = $$3;
      return $$1;
   }

   private eei h(eei $$0) {
      eed $$1 = this.cE();
      List<efb> $$2 = this.dI().b(this, $$1.b($$0));
      eei $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.dI(), $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.ay() || $$5 && $$0.d < 0.0;
      if (this.dC() > 0.0F && $$7 && ($$4 || $$6)) {
         eei $$8 = a(this, new eei($$0.c, (double)this.dC(), $$0.e), $$1, this.dI(), $$2);
         eei $$9 = a(this, new eei(0.0, (double)this.dC(), 0.0), $$1.b($$0.c, 0.0, $$0.e), this.dI(), $$2);
         if ($$9.d < (double)this.dC()) {
            eei $$10 = a(this, new eei($$0.c, 0.0, $$0.e), $$1.c($$9), this.dI(), $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new eei(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.dI(), $$2));
         }
      }

      return $$3;
   }

   public static eei a(@Nullable bfj $$0, eei $$1, eed $$2, cmm $$3, List<efb> $$4) {
      Builder<efb> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      dds $$6 = $$3.w_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.d($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static eei a(eei $$0, eed $$1, List<efb> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = eey.a(ha.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = eey.a(ha.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = eey.a(ha.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = eey.a(ha.a.c, $$1, $$2, $$5);
         }

         return new eei($$3, $$4, $$5);
      }
   }

   protected float aI() {
      return (float)((int)this.Y + 1);
   }

   protected amg aJ() {
      return amh.jc;
   }

   protected amg aK() {
      return amh.jb;
   }

   protected amg aL() {
      return amh.jb;
   }

   protected void aM() {
      eed $$0 = this.cE();
      gu $$1 = gu.a($$0.a + 1.0E-7, $$0.b + 1.0E-7, $$0.c + 1.0E-7);
      gu $$2 = gu.a($$0.d - 1.0E-7, $$0.e - 1.0E-7, $$0.f - 1.0E-7);
      if (this.dI().a($$1, $$2)) {
         gu.a $$3 = new gu.a();

         for (int $$4 = $$1.u(); $$4 <= $$2.u(); $$4++) {
            for (int $$5 = $$1.v(); $$5 <= $$2.v(); $$5++) {
               for (int $$6 = $$1.w(); $$6 <= $$2.w(); $$6++) {
                  $$3.d($$4, $$5, $$6);
                  dcb $$7 = this.dI().a_($$3);

                  try {
                     $$7.a(this.dI(), $$3, this);
                     this.a($$7);
                  } catch (Throwable var12) {
                     o $$9 = o.a(var12, "Colliding entity with block");
                     p $$10 = $$9.a("Block being collided with");
                     p.a($$10, this.dI(), $$3, $$7);
                     throw new y($$9);
                  }
               }
            }
         }
      }
   }

   protected void a(dcb $$0) {
   }

   public void a(dgl $$0, @Nullable bfj $$1) {
      this.dI().a($$1, $$0, this.u);
   }

   public void a(dgl $$0) {
      this.a($$0, this);
   }

   private void c(gu $$0, dcb $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.k();
      }
   }

   protected void aN() {
      bfj $$0 = (bfj)(this.bN() && this.cL() != null ? this.cL() : this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      eei $$2 = $$0.dl();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      this.e($$3);
   }

   protected gu e(gu $$0) {
      gu $$1 = $$0.c();
      dcb $$2 = this.dI().a_($$1);
      return !$$2.a(amw.bl) && !$$2.a(amw.bm) ? $$0 : $$1;
   }

   protected void a(dcb $$0, dcb $$1) {
      cxa $$2 = $$0.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(dcb $$0) {
      cxa $$1 = $$0.w();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(gu $$0, dcb $$1) {
      cxa $$2 = $$1.w();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(dcb $$0) {
      return $$0.a(amw.bk) && this.ag >= this.bl + 20;
   }

   private void k() {
      this.bk = this.bk * (float)Math.pow(0.997, (double)(this.ag - this.bl));
      this.bk = Math.min(1.0F, this.bk + 0.07F);
      float $$0 = 0.5F + this.bk * this.af.i() * 1.2F;
      float $$1 = 0.1F + this.bk * 1.2F;
      this.a(amh.E, $$1, $$0);
      this.bl = this.ag;
   }

   protected void e(float $$0) {
      this.a(this.aJ(), $$0, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
   }

   protected void aO() {
   }

   protected boolean aP() {
      return false;
   }

   public void a(amg $$0, float $$1, float $$2) {
      if (!this.aQ()) {
         this.dI().a(null, this.dn(), this.dp(), this.dt(), $$0, this.cY(), $$1, $$2);
      }
   }

   public void a(amg $$0) {
      if (!this.aQ()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean aQ() {
      return this.am.b(aW);
   }

   public void d(boolean $$0) {
      this.am.b(aW, $$0);
   }

   public boolean aR() {
      return this.am.b(aX);
   }

   public void e(boolean $$0) {
      this.am.b(aX, $$0);
   }

   protected bfj.b aS() {
      return bfj.b.d;
   }

   public boolean aT() {
      return false;
   }

   protected void a(double $$0, boolean $$1, dcb $$2, gu $$3) {
      if ($$1) {
         if (this.aa > 0.0F) {
            $$2.b().a(this.dI(), $$2, $$3, this, this.aa);
            this.dI().a(dgl.B, this.u, dgl.a.a(this, this.aC.<dcb>map($$0x -> this.dI().a_($$0x)).orElse($$2)));
         }

         this.n();
      } else if ($$0 < 0.0) {
         this.aa -= (float)$$0;
      }
   }

   public boolean aU() {
      return this.ae().d();
   }

   public boolean a(float $$0, float $$1, ben $$2) {
      if (this.p.a(amz.l)) {
         return false;
      } else {
         if (this.bN()) {
            for (bfj $$3 : this.cN()) {
               $$3.a($$0, $$1, $$2);
            }
         }

         return false;
      }
   }

   public boolean aV() {
      return this.ah;
   }

   private boolean o() {
      gu $$0 = this.di();
      return this.dI().q($$0) || this.dI().q(gu.a((double)$$0.u(), this.cE().e, (double)$$0.w()));
   }

   private boolean p() {
      return this.dI().a_(this.di()).a(cpo.nd);
   }

   public boolean aW() {
      return this.aV() || this.o();
   }

   public boolean aX() {
      return this.aV() || this.o() || this.p();
   }

   public boolean aY() {
      return this.aV() || this.p();
   }

   public boolean aZ() {
      return this.aj && this.aV();
   }

   public void ba() {
      if (this.bW()) {
         this.h(this.bV() && this.aV() && !this.bM());
      } else {
         this.h(this.bV() && this.aZ() && !this.bM() && this.dI().b_(this.aD).a(anb.a));
      }
   }

   protected boolean bb() {
      this.ai.clear();
      this.bc();
      double $$0 = this.dI().x_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(anb.b, $$0);
      return this.aV() || $$1;
   }

   void bc() {
      if (this.cW() instanceof cah $$0 && !$$0.aZ()) {
         this.ah = false;
         return;
      }

      if (this.a(anb.a, 0.014)) {
         if (!this.ah && !this.al) {
            this.bd();
         }

         this.n();
         this.ah = true;
         this.aw();
      } else {
         this.ah = false;
      }
   }

   private void q() {
      this.aj = this.a(anb.a);
      this.aO.clear();
      double $$0 = this.dr() - 0.11111111F;
      if (this.cW() instanceof cah $$2 && !$$2.aZ() && $$2.cE().e >= $$0 && $$2.cE().b <= $$0) {
         return;
      }

      gu $$3 = gu.a(this.dn(), $$0, this.dt());
      dxe $$4 = this.dI().b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((cls)this.dI(), $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aO::add);
      }
   }

   protected void bd() {
      bfj $$0 = (bfj)(this.bN() && this.cL() != null ? this.cL() : this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      eei $$2 = $$0.dl();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aK(), $$3, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
      } else {
         this.a(this.aL(), $$3, 1.0F + (this.af.i() - this.af.i()) * 0.4F);
      }

      float $$4 = (float)apa.a(this.dp());

      for (int $$5 = 0; (float)$$5 < 1.0F + this.bh.a * 20.0F; $$5++) {
         double $$6 = (this.af.j() * 2.0 - 1.0) * (double)this.bh.a;
         double $$7 = (this.af.j() * 2.0 - 1.0) * (double)this.bh.a;
         this.dI().a(iv.e, this.dn() + $$6, (double)($$4 + 1.0F), this.dt() + $$7, $$2.c, $$2.d - this.af.j() * 0.2F, $$2.e);
      }

      for (int $$8 = 0; (float)$$8 < 1.0F + this.bh.a * 20.0F; $$8++) {
         double $$9 = (this.af.j() * 2.0 - 1.0) * (double)this.bh.a;
         double $$10 = (this.af.j() * 2.0 - 1.0) * (double)this.bh.a;
         this.dI().a(iv.ag, this.dn() + $$9, (double)($$4 + 1.0F), this.dt() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(dgl.P);
   }

   @Deprecated
   protected dcb be() {
      return this.dI().a_(this.aD());
   }

   public dcb bf() {
      return this.dI().a_(this.aF());
   }

   public boolean bg() {
      return this.bV() && !this.aV() && !this.G_() && !this.bU() && !this.bi() && this.bs();
   }

   protected void bh() {
      gu $$0 = this.aD();
      dcb $$1 = this.dI().a_($$0);
      if ($$1.l() != cvs.a) {
         eei $$2 = this.dl();
         gu $$3 = this.di();
         double $$4 = this.dn() + (this.af.j() - 0.5) * (double)this.bh.a;
         double $$5 = this.dt() + (this.af.j() - 0.5) * (double)this.bh.a;
         if ($$3.u() != $$0.u()) {
            $$4 = apa.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = apa.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
         }

         this.dI().a(new in(iv.c, $$1), $$4, this.dp() + 0.1, $$5, $$2.c * -4.0, 1.5, $$2.e * -4.0);
      }
   }

   public boolean a(anl<dxd> $$0) {
      return this.aO.contains($$0);
   }

   public boolean bi() {
      return !this.al && this.ai.getDouble(anb.b) > 0.0;
   }

   public void a(float $$0, eei $$1) {
      eei $$2 = a($$1, $$0, this.dy());
      this.f(this.dl().e($$2));
   }

   private static eei a(eei $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return eei.b;
      } else {
         eei $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = apa.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = apa.b($$2 * (float) (Math.PI / 180.0));
         return new eei($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bj() {
      return this.dI().f(this.dm(), this.ds()) ? this.dI().w(gu.a(this.dn(), this.dr(), this.dt())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.h($$0, $$1, $$2);
      this.a_($$3 % 360.0F);
      this.b_(apa.a($$4, -90.0F, 90.0F) % 360.0F);
      this.M = this.dy();
      this.N = this.dA();
   }

   public void h(double $$0, double $$1, double $$2) {
      double $$3 = apa.a($$0, -3.0E7, 3.0E7);
      double $$4 = apa.a($$2, -3.0E7, 3.0E7);
      this.J = $$3;
      this.K = $$1;
      this.L = $$4;
      this.e($$3, $$1, $$4);
   }

   public void d(eei $$0) {
      this.d($$0.c, $$0.d, $$0.e);
   }

   public void d(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dy(), this.dA());
   }

   public void a(gu $$0, float $$1, float $$2) {
      this.b((double)$$0.u() + 0.5, (double)$$0.v(), (double)$$0.w() + 0.5, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.p($$0, $$1, $$2);
      this.a_($$3);
      this.b_($$4);
      this.bk();
      this.an();
   }

   public final void bk() {
      double $$0 = this.dn();
      double $$1 = this.dp();
      double $$2 = this.dt();
      this.J = $$0;
      this.K = $$1;
      this.L = $$2;
      this.ab = $$0;
      this.ac = $$1;
      this.ad = $$2;
      this.M = this.dy();
      this.N = this.dA();
   }

   public float e(bfj $$0) {
      float $$1 = (float)(this.dn() - $$0.dn());
      float $$2 = (float)(this.dp() - $$0.dp());
      float $$3 = (float)(this.dt() - $$0.dt());
      return apa.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double i(double $$0, double $$1, double $$2) {
      double $$3 = this.dn() - $$0;
      double $$4 = this.dp() - $$1;
      double $$5 = this.dt() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double f(bfj $$0) {
      return this.e($$0.dg());
   }

   public double e(eei $$0) {
      double $$1 = this.dn() - $$0.c;
      double $$2 = this.dp() - $$0.d;
      double $$3 = this.dt() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(byo $$0) {
   }

   public void g(bfj $$0) {
      if (!this.v($$0)) {
         if (!$$0.ae && !this.ae) {
            double $$1 = $$0.dn() - this.dn();
            double $$2 = $$0.dt() - this.dt();
            double $$3 = apa.a($$1, $$2);
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
               if (!this.bN() && this.bp()) {
                  this.j(-$$1, 0.0, -$$2);
               }

               if (!$$0.bN() && $$0.bp()) {
                  $$0.j($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void j(double $$0, double $$1, double $$2) {
      this.f(this.dl().b($$0, $$1, $$2));
      this.at = true;
   }

   protected void bl() {
      this.S = true;
   }

   public boolean a(ben $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bl();
         return false;
      }
   }

   public final eei f(float $$0) {
      return this.b(this.g($$0), this.h($$0));
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dA() : apa.i($$0, this.N, this.dA());
   }

   public float h(float $$0) {
      return $$0 == 1.0F ? this.dy() : apa.i($$0, this.M, this.dy());
   }

   protected final eei b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = apa.b($$3);
      float $$5 = apa.a($$3);
      float $$6 = apa.b($$2);
      float $$7 = apa.a($$2);
      return new eei((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final eei i(float $$0) {
      return this.c(this.g($$0), this.h($$0));
   }

   protected final eei c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final eei bm() {
      return new eei(this.dn(), this.dr(), this.dt());
   }

   public final eei j(float $$0) {
      double $$1 = apa.d((double)$$0, this.J, this.dn());
      double $$2 = apa.d((double)$$0, this.K, this.dp()) + (double)this.cF();
      double $$3 = apa.d((double)$$0, this.L, this.dt());
      return new eei($$1, $$2, $$3);
   }

   public eei k(float $$0) {
      return this.j($$0);
   }

   public final eei l(float $$0) {
      double $$1 = apa.d((double)$$0, this.J, this.dn());
      double $$2 = apa.d((double)$$0, this.K, this.dp());
      double $$3 = apa.d((double)$$0, this.L, this.dt());
      return new eei($$1, $$2, $$3);
   }

   public eeg a(double $$0, float $$1, boolean $$2) {
      eei $$3 = this.j($$1);
      eei $$4 = this.f($$1);
      eei $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.dI().a(new clv($$3, $$5, clv.a.b, $$2 ? clv.b.c : clv.b.a, this));
   }

   public boolean bn() {
      return this.bs() && this.bo();
   }

   public boolean bo() {
      return false;
   }

   public boolean bp() {
      return false;
   }

   public void a(bfj $$0, int $$1, ben $$2) {
      if ($$0 instanceof aig) {
         ai.c.a((aig)$$0, this, $$2);
      }
   }

   public boolean k(double $$0, double $$1, double $$2) {
      double $$3 = this.dn() - $$0;
      double $$4 = this.dp() - $$1;
      double $$5 = this.dt() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cE().a();
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
         String $$1 = this.br();
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
      return this.bM() ? false : this.d($$0);
   }

   public qr f(qr $$0) {
      try {
         if (this.s != null) {
            $$0.a("Pos", this.a(this.s.dn(), this.dp(), this.s.dt()));
         } else {
            $$0.a("Pos", this.a(this.dn(), this.dp(), this.dt()));
         }

         eei $$1 = this.dl();
         $$0.a("Motion", this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", this.a(this.dy(), this.dA()));
         $$0.a("FallDistance", this.aa);
         $$0.a("Fire", (short)this.aN);
         $$0.a("Air", (short)this.cf());
         $$0.a("OnGround", this.ay());
         $$0.a("Invulnerable", this.bc);
         $$0.a("PortalCooldown", this.bb);
         $$0.a("UUID", this.ct());
         sw $$2 = this.ab();
         if ($$2 != null) {
            $$0.a("CustomName", sw.a.a($$2));
         }

         if (this.cy()) {
            $$0.a("CustomNameVisible", this.cy());
         }

         if (this.aQ()) {
            $$0.a("Silent", this.aQ());
         }

         if (this.aR()) {
            $$0.a("NoGravity", this.aR());
         }

         if (this.bd) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.cg();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.cg());
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
         if (this.bN()) {
            qx $$6 = new qx();

            for (bfj $$7 : this.cN()) {
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
         this.p(apa.a($$1.h(0), -3.0000512E7, 3.0000512E7), apa.a($$1.h(1), -2.0E7, 2.0E7), apa.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.a_($$3.i(0));
         this.b_($$3.i(1));
         this.bk();
         this.n(this.dy());
         this.o(this.dy());
         this.aa = $$0.j("FallDistance");
         this.aN = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.j($$0.g("Air"));
         }

         this.aJ = $$0.q("OnGround");
         this.bc = $$0.q("Invulnerable");
         this.bb = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.ax = $$0.a("UUID");
            this.ay = this.ax.toString();
         }

         if (!Double.isFinite(this.dn()) || !Double.isFinite(this.dp()) || !Double.isFinite(this.dt())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dy()) && Double.isFinite((double)this.dA())) {
            this.an();
            this.a(this.dy(), this.dA());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(sw.a.a($$8));
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
            if (this.bq()) {
               this.an();
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

   protected boolean bq() {
      return true;
   }

   @Nullable
   protected final String br() {
      bfn<?> $$0 = this.ae();
      acq $$1 = bfn.a($$0);
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
   public bvh a(cml $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public bvh a(cml $$0, int $$1) {
      return this.a(new cfz($$0), (float)$$1);
   }

   @Nullable
   public bvh b(cfz $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public bvh a(cfz $$0, float $$1) {
      if ($$0.b()) {
         return null;
      } else if (this.dI().B) {
         return null;
      } else {
         bvh $$2 = new bvh(this.dI(), this.dn(), this.dp() + (double)$$1, this.dt(), $$0);
         $$2.o();
         this.dI().b($$2);
         return $$2;
      }
   }

   public boolean bs() {
      return !this.dD();
   }

   public boolean bt() {
      if (this.ae) {
         return false;
      } else {
         float $$0 = this.bh.a * 0.8F;
         eed $$1 = eed.a(this.bm(), (double)$$0, 1.0E-6, (double)$$0);
         return gu.a($$1)
            .anyMatch(
               $$1x -> {
                  dcb $$2 = this.dI().a_($$1x);
                  return !$$2.i()
                     && $$2.o(this.dI(), $$1x)
                     && eey.c($$2.k(this.dI(), $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), eey.a($$1), eem.i);
               }
            );
      }
   }

   public bdx a(byo $$0, bdw $$1) {
      return bdx.d;
   }

   public boolean h(bfj $$0) {
      return $$0.bu() && !this.v($$0);
   }

   public boolean bu() {
      return false;
   }

   public void bv() {
      this.f(eei.b);
      this.l();
      if (this.bM()) {
         this.cW().i(this);
      }
   }

   public final void i(bfj $$0) {
      this.a($$0, bfj::e);
   }

   protected void a(bfj $$0, bfj.a $$1) {
      if (this.u($$0)) {
         double $$2 = this.dp() + this.bx() + $$0.bw();
         $$1.accept($$0, this.dn(), $$2, this.dt());
      }
   }

   public void j(bfj $$0) {
   }

   public double bw() {
      return 0.0;
   }

   public double bx() {
      return (double)this.bh.b * 0.75;
   }

   public boolean k(bfj $$0) {
      return this.a($$0, false);
   }

   public boolean by() {
      return this instanceof bfz;
   }

   public boolean a(bfj $$0, boolean $$1) {
      if ($$0 == this.s) {
         return false;
      } else if (!$$0.bB()) {
         return false;
      } else {
         for (bfj $$2 = $$0; $$2.s != null; $$2 = $$2.s) {
            if ($$2.s == this) {
               return false;
            }
         }

         if ($$1 || this.l($$0) && $$0.o(this)) {
            if (this.bM()) {
               this.Y();
            }

            this.b(bgl.a);
            this.s = $$0;
            this.s.m(this);
            $$0.t().filter($$0x -> $$0x instanceof aig).forEach($$0x -> ai.R.a((aig)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean l(bfj $$0) {
      return !this.bP() && this.I <= 0;
   }

   protected boolean d(bgl $$0) {
      return this.dI().a(this, this.e($$0).h(1.0E-7));
   }

   public void bz() {
      for (int $$0 = this.r.size() - 1; $$0 >= 0; $$0--) {
         ((bfj)this.r.get($$0)).Y();
      }
   }

   public void bA() {
      if (this.s != null) {
         bfj $$0 = this.s;
         this.s = null;
         $$0.n(this);
      }
   }

   public void Y() {
      this.bA();
   }

   protected void m(bfj $$0) {
      if ($$0.cW() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.r.isEmpty()) {
            this.r = ImmutableList.of($$0);
         } else {
            List<bfj> $$1 = Lists.newArrayList(this.r);
            if (!this.dI().B && $$0 instanceof byo && !(this.cO() instanceof byo)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.r = ImmutableList.copyOf($$1);
         }

         this.a(dgl.s, $$0);
      }
   }

   protected void n(bfj $$0) {
      if ($$0.cW() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.r.size() == 1 && this.r.get(0) == $$0) {
            this.r = ImmutableList.of();
         } else {
            this.r = this.r.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.I = 60;
         this.a(dgl.q, $$0);
      }
   }

   protected boolean o(bfj $$0) {
      return this.r.isEmpty();
   }

   protected boolean bB() {
      return true;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5, boolean $$6) {
      this.e($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public void a(float $$0, int $$1) {
      this.n($$0);
   }

   public float bC() {
      return 0.0F;
   }

   public eei bD() {
      return this.b(this.dA(), this.dy());
   }

   public eei a(cfu $$0) {
      if (!(this instanceof byo $$1)) {
         return eei.b;
      } else {
         boolean $$2 = $$1.eP().a($$0) && !$$1.eO().a($$0);
         bft $$3 = $$2 ? $$1.fh().d() : $$1.fh();
         return this.b(0.0F, this.dy() + (float)($$3 == bft.b ? 80 : -80)).a(0.5);
      }
   }

   public eeh bE() {
      return new eeh(this.dA(), this.dy());
   }

   public eei bF() {
      return eei.a(this.bE());
   }

   public void f(gu $$0) {
      if (this.as()) {
         this.aq();
      } else {
         if (!this.dI().B && !$$0.equals(this.aw)) {
            this.aw = $$0.i();
         }

         this.au = true;
      }
   }

   protected void bG() {
      if (this.dI() instanceof aif) {
         int $$0 = this.at();
         aif $$1 = (aif)this.dI();
         if (this.au) {
            MinecraftServer $$2 = $$1.n();
            acp<cmm> $$3 = this.dI().ac() == cmm.i ? cmm.h : cmm.i;
            aif $$4 = $$2.a($$3);
            if ($$4 != null && $$2.B() && !this.bM() && this.av++ >= $$0) {
               this.dI().ad().a("portal");
               this.av = $$0;
               this.aq();
               this.b($$4);
               this.dI().ad().c();
            }

            this.au = false;
         } else {
            if (this.av > 0) {
               this.av -= 4;
            }

            if (this.av < 0) {
               this.av = 0;
            }
         }

         this.H();
      }
   }

   public int bH() {
      return 300;
   }

   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
   }

   public void c(ben $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            cte.a(this);
      }
   }

   public void m(float $$0) {
   }

   public Iterable<cfz> bI() {
      return e;
   }

   public Iterable<cfz> bJ() {
      return e;
   }

   public Iterable<cfz> bK() {
      return Iterables.concat(this.bI(), this.bJ());
   }

   public void a(bfo $$0, cfz $$1) {
   }

   public boolean bL() {
      boolean $$0 = this.dI() != null && this.dI().B;
      return !this.aU() && (this.aN > 0 || $$0 && this.i(0));
   }

   public boolean bM() {
      return this.cW() != null;
   }

   public boolean bN() {
      return !this.r.isEmpty();
   }

   public boolean bO() {
      return this.ae().a(amz.m);
   }

   public void f(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean bP() {
      return this.i(1);
   }

   public boolean bQ() {
      return this.bP();
   }

   public boolean bR() {
      return this.bP();
   }

   public boolean bS() {
      return this.bP();
   }

   public boolean bT() {
      return this.bP();
   }

   public boolean bU() {
      return this.c(bgl.f);
   }

   public boolean bV() {
      return this.i(3);
   }

   public void g(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean bW() {
      return this.i(4);
   }

   public boolean bX() {
      return this.c(bgl.d);
   }

   public boolean bY() {
      return this.bX() && !this.aV();
   }

   public void h(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean bZ() {
      return this.bd;
   }

   public final void i(boolean $$0) {
      this.bd = $$0;
      this.b(6, this.ca());
   }

   public boolean ca() {
      return this.dI().r_() ? this.i(6) : this.bd;
   }

   public boolean cb() {
      return this.i(5);
   }

   public boolean d(byo $$0) {
      if ($$0.G_()) {
         return false;
      } else {
         efi $$1 = this.cd();
         return $$1 != null && $$0 != null && $$0.cd() == $$1 && $$1.i() ? false : this.cb();
      }
   }

   public boolean cc() {
      return false;
   }

   public void a(BiConsumer<dgi<?>, aif> $$0) {
   }

   @Nullable
   public efi cd() {
      return this.dI().I().i(this.cv());
   }

   public boolean p(bfj $$0) {
      return this.a($$0.cd());
   }

   public boolean a(efi $$0) {
      return this.cd() != null ? this.cd().a($$0) : false;
   }

   public void j(boolean $$0) {
      this.b(5, $$0);
   }

   protected boolean i(int $$0) {
      return (this.am.b(an) & 1 << $$0) != 0;
   }

   protected void b(int $$0, boolean $$1) {
      byte $$2 = this.am.b(an);
      if ($$1) {
         this.am.b(an, (byte)($$2 | 1 << $$0));
      } else {
         this.am.b(an, (byte)($$2 & ~(1 << $$0)));
      }
   }

   public int ce() {
      return 300;
   }

   public int cf() {
      return this.am.b(aT);
   }

   public void j(int $$0) {
      this.am.b(aT, $$0);
   }

   public int cg() {
      return this.am.b(aY);
   }

   public void k(int $$0) {
      this.am.b(aY, $$0);
   }

   public float ch() {
      int $$0 = this.cj();
      return (float)Math.min(this.cg(), $$0) / (float)$$0;
   }

   public boolean ci() {
      return this.cg() >= this.cj();
   }

   public int cj() {
      return 140;
   }

   public void a(aif $$0, bfy $$1) {
      this.h(this.aN + 1);
      if (this.aN == 0) {
         this.g(8);
      }

      this.a(this.dJ().b(), 5.0F);
   }

   public void k(boolean $$0) {
      eei $$1 = this.dl();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.o($$1.c, $$2, $$1.e);
   }

   public void l(boolean $$0) {
      eei $$1 = this.dl();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.o($$1.c, $$2, $$1.e);
      this.n();
   }

   public boolean a(aif $$0, bfz $$1) {
      return true;
   }

   public void ck() {
      if (this.dl().b() > -0.5 && this.aa > 1.0F) {
         this.aa = 1.0F;
      }
   }

   public void n() {
      this.aa = 0.0F;
   }

   protected void m(double $$0, double $$1, double $$2) {
      gu $$3 = gu.a($$0, $$1, $$2);
      eei $$4 = new eei($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      gu.a $$5 = new gu.a();
      ha $$6 = ha.b;
      double $$7 = Double.MAX_VALUE;

      for (ha $$8 : new ha[]{ha.c, ha.d, ha.e, ha.f, ha.b}) {
         $$5.a($$3, $$8);
         if (!this.dI().a_($$5).r(this.dI(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == ha.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.af.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      eei $$13 = this.dl().a(0.75);
      if ($$6.o() == ha.a.a) {
         this.o((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == ha.a.b) {
         this.o($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == ha.a.c) {
         this.o($$13.c, $$13.d, (double)($$12 * $$11));
      }
   }

   public void a(dcb $$0, eei $$1) {
      this.n();
      this.T = $$1;
   }

   private static sw c(sw $$0) {
      tj $$1 = $$0.d().b($$0.a().a(null));

      for (sw $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public sw Z() {
      sw $$0 = this.ab();
      return $$0 != null ? c($$0) : this.cl();
   }

   protected sw cl() {
      return this.p.h();
   }

   public boolean q(bfj $$0) {
      return this == $$0;
   }

   public float cm() {
      return 0.0F;
   }

   public void n(float $$0) {
   }

   public void o(float $$0) {
   }

   public boolean cn() {
      return true;
   }

   public boolean r(bfj $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.dI() == null ? "~NULL~" : this.dI().toString();
      return this.aK != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.Z().getString(),
            this.q,
            $$0,
            this.dn(),
            this.dp(),
            this.dt(),
            this.aK
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.Z().getString(),
            this.q,
            $$0,
            this.dn(),
            this.dp(),
            this.dt()
         );
   }

   public boolean b(ben $$0) {
      return this.dD() || this.bc && !$$0.a(amy.d) && !$$0.g() || $$0.a(amy.i) && this.aU() || $$0.a(amy.m) && this.ae().a(amz.l);
   }

   public boolean co() {
      return this.bc;
   }

   public void m(boolean $$0) {
      this.bc = $$0;
   }

   public void s(bfj $$0) {
      this.b($$0.dn(), $$0.dp(), $$0.dt(), $$0.dy(), $$0.dA());
   }

   public void t(bfj $$0) {
      qr $$1 = $$0.f(new qr());
      $$1.r("Dimension");
      this.g($$1);
      this.bb = $$0.bb;
      this.aw = $$0.aw;
   }

   @Nullable
   public bfj b(aif $$0) {
      if (this.dI() instanceof aif && !this.dD()) {
         this.dI().ad().a("changeDimension");
         this.ac();
         this.dI().ad().a("reposition");
         dyb $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.dI().ad().b("reloading");
            bfj $$2 = this.ae().a((cmm)$$0);
            if ($$2 != null) {
               $$2.t(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.dA());
               $$2.f($$1.b);
               $$0.d($$2);
               if ($$0.ac() == cmm.j) {
                  aif.a($$0);
               }
            }

            this.cp();
            this.dI().ad().c();
            ((aif)this.dI()).g();
            $$0.g();
            this.dI().ad().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void cp() {
      this.b(bfj.c.e);
   }

   @Nullable
   protected dyb a(aif $$0) {
      boolean $$1 = this.dI().ac() == cmm.j && $$0.ac() == cmm.h;
      boolean $$2 = $$0.ac() == cmm.j;
      if (!$$1 && !$$2) {
         boolean $$5 = $$0.ac() == cmm.i;
         if (this.dI().ac() != cmm.i && !$$5) {
            return null;
         } else {
            dds $$6 = $$0.w_();
            double $$7 = dfk.a(this.dI().x_(), $$0.x_());
            gu $$8 = $$6.b(this.dn() * $$7, this.dp(), this.dt() * $$7);
            return this.a($$0, $$8, $$5, $$6).map($$1x -> {
               dcb $$2x = this.dI().a_(this.aw);
               ha.a $$3;
               eei $$5x;
               if ($$2x.b(dcr.H)) {
                  $$3 = $$2x.c(dcr.H);
                  l.a $$4 = l.a(this.aw, $$3, 21, ha.a.b, 21, $$1xx -> this.dI().a_($$1xx) == $$2x);
                  $$5x = this.a($$3, $$4);
               } else {
                  $$3 = ha.a.a;
                  $$5x = new eei(0.5, 0.0, 0.0);
               }

               return dyc.a($$0, $$1x, $$3, $$5x, this, this.dl(), this.dy(), this.dA());
            }).orElse(null);
         }
      } else {
         gu $$3;
         if ($$2) {
            $$3 = aif.a;
         } else {
            $$3 = $$0.a(dhk.a.f, $$0.R());
         }

         return new dyb(new eei((double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5), this.dl(), this.dy(), this.dA());
      }
   }

   protected eei a(ha.a $$0, l.a $$1) {
      return dyc.a($$1, $$0, this.dg(), this.a(this.al()));
   }

   protected Optional<l.a> a(aif $$0, gu $$1, boolean $$2, dds $$3) {
      return $$0.o().a($$1, $$2, $$3);
   }

   public boolean cq() {
      return !this.bM() && !this.bN();
   }

   public float a(cme $$0, cls $$1, gu $$2, dcb $$3, dxe $$4, float $$5) {
      return $$5;
   }

   public boolean a(cme $$0, cls $$1, gu $$2, dcb $$3, float $$4) {
      return true;
   }

   public int cr() {
      return 3;
   }

   public boolean c_() {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Entity Type", () -> bfn.a(this.ae()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.q);
      $$0.a("Entity Name", () -> this.Z().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dn(), this.dp(), this.dt()));
      $$0.a("Entity's Block location", p.a(this.dI(), apa.a(this.dn()), apa.a(this.dp()), apa.a(this.dt())));
      eei $$1 = this.dl();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", () -> this.cN().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.cW()));
   }

   public boolean cs() {
      return this.bL() && !this.G_();
   }

   public void a_(UUID $$0) {
      this.ax = $$0;
      this.ay = this.ax.toString();
   }

   @Override
   public UUID ct() {
      return this.ax;
   }

   public String cu() {
      return this.ay;
   }

   public String cv() {
      return this.ay;
   }

   public boolean cw() {
      return true;
   }

   public static double cx() {
      return o;
   }

   public static void b(double $$0) {
      o = $$0;
   }

   @Override
   public sw H_() {
      return efe.a(this.cd(), this.Z()).a($$0 -> $$0.a(this.cD()).a(this.cu()));
   }

   public void b(@Nullable sw $$0) {
      this.am.b(aU, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public sw ab() {
      return this.am.b(aU).orElse(null);
   }

   @Override
   public boolean aa() {
      return this.am.b(aU).isPresent();
   }

   public void n(boolean $$0) {
      this.am.b(aV, $$0);
   }

   public boolean cy() {
      return this.am.b(aV);
   }

   public final void n(double $$0, double $$1, double $$2) {
      if (this.dI() instanceof aif) {
         clt $$3 = new clt(gu.a($$0, $$1, $$2));
         ((aif)this.dI()).k().a(aik.g, $$3, 0, this.af());
         this.dI().d($$3.e, $$3.f);
         this.b($$0, $$1, $$2);
      }
   }

   public boolean a(aif $$0, double $$1, double $$2, double $$3, Set<bgn> $$4, float $$5, float $$6) {
      float $$7 = apa.a($$6, -90.0F, 90.0F);
      if ($$0 == this.dI()) {
         this.b($$1, $$2, $$3, $$5, $$7);
         this.s();
         this.n($$5);
      } else {
         this.ac();
         bfj $$8 = this.ae().a((cmm)$$0);
         if ($$8 == null) {
            return false;
         }

         $$8.t(this);
         $$8.b($$1, $$2, $$3, $$5, $$7);
         $$8.n($$5);
         this.b(bfj.c.e);
         $$0.d($$8);
      }

      return true;
   }

   public void a(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (this.dI() instanceof aif) {
         this.b($$0, $$1, $$2, this.dy(), this.dA());
         this.s();
      }
   }

   private void s() {
      this.cP().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.r.iterator();

         while (var1.hasNext()) {
            bfj $$1 = (bfj)var1.next();
            $$0.a($$1, bfj::d);
         }
      });
   }

   public void c(double $$0, double $$1, double $$2) {
      this.b(this.dn() + $$0, this.dp() + $$1, this.dt() + $$2);
   }

   public boolean cz() {
      return this.cy();
   }

   public void a(List<acb.b<?>> $$0) {
   }

   public void a(aby<?> $$0) {
      if (ar.equals($$0)) {
         this.d_();
      }
   }

   @Deprecated
   protected void cA() {
      bgl $$0 = this.al();
      bfk $$1 = this.a($$0);
      this.bh = $$1;
      this.bi = this.a($$0, $$1);
   }

   public void d_() {
      bfk $$0 = this.bh;
      bgl $$1 = this.al();
      bfk $$2 = this.a($$1);
      this.bh = $$2;
      this.bi = this.a($$1, $$2);
      this.an();
      boolean $$3 = (double)$$2.a <= 4.0 && (double)$$2.b <= 4.0;
      if (!this.dI().B && !this.al && !this.ae && $$3 && ($$2.a > $$0.a || $$2.b > $$0.b) && !(this instanceof byo)) {
         eei $$4 = this.dg().b(0.0, (double)$$0.b / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a - $$0.a) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b - $$0.b) + 1.0E-6;
         efb $$7 = eey.a(eed.a($$4, $$5, $$6, $$5));
         this.dI().a(this, $$7, $$4, (double)$$2.a, (double)$$2.b, (double)$$2.a).ifPresent($$1x -> this.a($$1x.b(0.0, (double)(-$$2.b) / 2.0, 0.0)));
      }
   }

   public ha cB() {
      return ha.a((double)this.dy());
   }

   public ha cC() {
      return this.cB();
   }

   protected tb cD() {
      return new tb(tb.a.c, new tb.b(this.ae(), this.ct(), this.Z()));
   }

   public boolean a(aig $$0) {
      return true;
   }

   @Override
   public final eed cE() {
      return this.aI;
   }

   public eed j_() {
      return this.cE();
   }

   protected eed e(bgl $$0) {
      bfk $$1 = this.a($$0);
      float $$2 = $$1.a / 2.0F;
      eei $$3 = new eei(this.dn() - (double)$$2, this.dp(), this.dt() - (double)$$2);
      eei $$4 = new eei(this.dn() + (double)$$2, this.dp() + (double)$$1.b, this.dt() + (double)$$2);
      return new eed($$3, $$4);
   }

   public final void a(eed $$0) {
      this.aI = $$0;
   }

   protected float a(bgl $$0, bfk $$1) {
      return $$1.b * 0.85F;
   }

   public float f(bgl $$0) {
      return this.a($$0, this.a($$0));
   }

   public final float cF() {
      return this.bi;
   }

   public eei p(float $$0) {
      return this.cG();
   }

   protected eei cG() {
      return new eei(0.0, (double)this.cF(), (double)(this.dd() * 0.4F));
   }

   public bgs a_(int $$0) {
      return bgs.b;
   }

   @Override
   public void a(sw $$0) {
   }

   public cmm cH() {
      return this.dI();
   }

   @Nullable
   public MinecraftServer cI() {
      return this.dI().n();
   }

   public bdx a(byo $$0, eei $$1, bdw $$2) {
      return bdx.d;
   }

   public boolean cJ() {
      return false;
   }

   public void a(bfz $$0, bfj $$1) {
      if ($$1 instanceof bfz) {
         cki.a((bfz)$$1, $$0);
      }

      cki.b($$0, $$1);
   }

   public void c(aig $$0) {
   }

   public void d(aig $$0) {
   }

   public float a(cvz $$0) {
      float $$1 = apa.g(this.dy());
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

   public float a(cui $$0) {
      float $$1 = apa.g(this.dy());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public boolean cK() {
      return false;
   }

   @Nullable
   public bfz cL() {
      return null;
   }

   public final boolean cM() {
      return this.cL() != null;
   }

   public final List<bfj> cN() {
      return this.r;
   }

   @Nullable
   public bfj cO() {
      return this.r.isEmpty() ? null : (bfj)this.r.get(0);
   }

   public boolean u(bfj $$0) {
      return this.r.contains($$0);
   }

   public boolean a(Predicate<bfj> $$0) {
      UnmodifiableIterator var2 = this.r.iterator();

      while (var2.hasNext()) {
         bfj $$1 = (bfj)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bfj> t() {
      return this.r.stream().flatMap(bfj::cP);
   }

   @Override
   public Stream<bfj> cP() {
      return Stream.concat(Stream.of(this), this.t());
   }

   @Override
   public Stream<bfj> cQ() {
      return Stream.concat(this.r.stream().flatMap(bfj::cQ), Stream.of(this));
   }

   public Iterable<bfj> cR() {
      return () -> this.t().iterator();
   }

   public boolean cS() {
      return this.t().filter($$0 -> $$0 instanceof byo).count() == 1L;
   }

   public bfj cT() {
      bfj $$0 = this;

      while ($$0.bM()) {
         $$0 = $$0.cW();
      }

      return $$0;
   }

   public boolean v(bfj $$0) {
      return this.cT() == $$0.cT();
   }

   public boolean w(bfj $$0) {
      if (!$$0.bM()) {
         return false;
      } else {
         bfj $$1 = $$0.cW();
         return $$1 == this ? true : this.w($$1);
      }
   }

   public boolean cU() {
      return this.cL() instanceof byo $$0 ? $$0.g() : this.cV();
   }

   public boolean cV() {
      return !this.dI().B;
   }

   protected static eei a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -apa.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = apa.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new eei((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public eei b(bfz $$0) {
      return new eei(this.dn(), this.cE().e, this.dt());
   }

   @Nullable
   public bfj cW() {
      return this.s;
   }

   @Nullable
   public bfj cX() {
      return this.s != null && this.s.cL() == this ? this.s : null;
   }

   public dxj l_() {
      return dxj.a;
   }

   public ami cY() {
      return ami.g;
   }

   protected int cZ() {
      return 1;
   }

   public ds da() {
      return new ds(
         this, this.dg(), this.bE(), this.dI() instanceof aif ? (aif)this.dI() : null, this.B(), this.Z().getString(), this.H_(), this.dI().n(), this
      );
   }

   protected int B() {
      return 0;
   }

   public boolean l(int $$0) {
      return this.B() >= $$0;
   }

   @Override
   public boolean e_() {
      return this.dI().X().b(cmi.o);
   }

   @Override
   public boolean q_() {
      return true;
   }

   @Override
   public boolean N_() {
      return true;
   }

   public void a(eb.a $$0, eei $$1) {
      eei $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.b_(apa.g((float)(-(apa.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.a_(apa.g((float)(apa.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.n(this.dy());
      this.N = this.dA();
      this.M = this.dy();
   }

   public boolean a(anl<dxd> $$0, double $$1) {
      if (this.db()) {
         return false;
      } else {
         eed $$2 = this.cE().h(0.001);
         int $$3 = apa.a($$2.a);
         int $$4 = apa.c($$2.d);
         int $$5 = apa.a($$2.b);
         int $$6 = apa.c($$2.e);
         int $$7 = apa.a($$2.c);
         int $$8 = apa.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cw();
         boolean $$11 = false;
         eei $$12 = eei.b;
         int $$13 = 0;
         gu.a $$14 = new gu.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  dxe $$18 = this.dI().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((cls)this.dI(), $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           eei $$20 = $$18.c(this.dI(), $$14);
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

            if (!(this instanceof byo)) {
               $$12 = $$12.d();
            }

            eei $$21 = this.dl();
            $$12 = $$12.a($$1 * 1.0);
            double $$22 = 0.003;
            if (Math.abs($$21.c) < 0.003 && Math.abs($$21.e) < 0.003 && $$12.f() < 0.0045000000000000005) {
               $$12 = $$12.d().a(0.0045000000000000005);
            }

            this.f(this.dl().e($$12));
         }

         this.ai.put($$0, $$9);
         return $$11;
      }
   }

   public boolean db() {
      eed $$0 = this.cE().g(1.0);
      int $$1 = apa.a($$0.a);
      int $$2 = apa.c($$0.d);
      int $$3 = apa.a($$0.c);
      int $$4 = apa.c($$0.f);
      return !this.dI().b($$1, $$3, $$2, $$4);
   }

   public double b(anl<dxd> $$0) {
      return this.ai.getDouble($$0);
   }

   public double dc() {
      return (double)this.cF() < 0.4 ? 0.0 : 0.4;
   }

   public final float dd() {
      return this.bh.a;
   }

   public final float de() {
      return this.bh.b;
   }

   public float df() {
      return this.de() + 0.5F;
   }

   public uo<ur> S() {
      return new us(this);
   }

   public bfk a(bgl $$0) {
      return this.p.n();
   }

   public eei dg() {
      return this.u;
   }

   public eei dh() {
      return this.dg();
   }

   @Override
   public gu di() {
      return this.aD;
   }

   public dcb dj() {
      if (this.bn == null) {
         this.bn = this.dI().a_(this.di());
      }

      return this.bn;
   }

   public clt dk() {
      return this.aE;
   }

   public eei dl() {
      return this.aF;
   }

   public void f(eei $$0) {
      this.aF = $$0;
   }

   public void g(eei $$0) {
      this.f(this.dl().e($$0));
   }

   public void o(double $$0, double $$1, double $$2) {
      this.f(new eei($$0, $$1, $$2));
   }

   public final int dm() {
      return this.aD.u();
   }

   public final double dn() {
      return this.u.c;
   }

   public double c(double $$0) {
      return this.u.c + (double)this.dd() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.af.j() - 1.0) * $$0);
   }

   public final int do() {
      return this.aD.v();
   }

   public final double dp() {
      return this.u.d;
   }

   public double e(double $$0) {
      return this.u.d + (double)this.de() * $$0;
   }

   public double dq() {
      return this.e(this.af.j());
   }

   public double dr() {
      return this.u.d + (double)this.bi;
   }

   public final int ds() {
      return this.aD.w();
   }

   public final double dt() {
      return this.u.e;
   }

   public double f(double $$0) {
      return this.u.e + (double)this.dd() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.af.j() - 1.0) * $$0);
   }

   public final void p(double $$0, double $$1, double $$2) {
      if (this.u.c != $$0 || this.u.d != $$1 || this.u.e != $$2) {
         this.u = new eei($$0, $$1, $$2);
         int $$3 = apa.a($$0);
         int $$4 = apa.a($$1);
         int $$5 = apa.a($$2);
         if ($$3 != this.aD.u() || $$4 != this.aD.v() || $$5 != this.aD.w()) {
            this.aD = new gu($$3, $$4, $$5);
            this.bn = null;
            if (hx.a($$3) != this.aE.e || hx.a($$5) != this.aE.f) {
               this.aE = new clt(this.aD);
            }
         }

         this.aZ.a();
      }
   }

   public void du() {
   }

   public eei q(float $$0) {
      return this.l($$0).b(0.0, (double)this.bi * 0.7, 0.0);
   }

   public void a(us $$0) {
      int $$1 = $$0.a();
      double $$2 = $$0.e();
      double $$3 = $$0.f();
      double $$4 = $$0.g();
      this.f($$2, $$3, $$4);
      this.d($$2, $$3, $$4);
      this.b_($$0.k());
      this.a_($$0.l());
      this.e($$1);
      this.a_($$0.c());
   }

   @Nullable
   public cfz dv() {
      return null;
   }

   public void o(boolean $$0) {
      this.az = $$0;
   }

   public boolean dw() {
      return !this.ae().a(amz.i);
   }

   public boolean dx() {
      return (this.az || this.aA) && this.dw();
   }

   public float dy() {
      return this.aG;
   }

   public float dz() {
      return this.dy();
   }

   public void a_(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aG = $$0;
      }
   }

   public float dA() {
      return this.aH;
   }

   public void b_(float $$0) {
      if (!Float.isFinite($$0)) {
         ac.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aH = $$0;
      }
   }

   public boolean dB() {
      return false;
   }

   public float dC() {
      return this.aM;
   }

   public void r(float $$0) {
      this.aM = $$0;
   }

   public final boolean dD() {
      return this.aK != null;
   }

   @Nullable
   public bfj.c dE() {
      return this.aK;
   }

   @Override
   public final void b(bfj.c $$0) {
      if (this.aK == null) {
         this.aK = $$0;
      }

      if (this.aK.a()) {
         this.Y();
      }

      this.cN().forEach(bfj::Y);
      this.aZ.a($$0);
   }

   protected void dF() {
      this.aK = null;
   }

   @Override
   public void a(dft $$0) {
      this.aZ = $$0;
   }

   @Override
   public boolean dG() {
      if (this.aK != null && !this.aK.b()) {
         return false;
      } else {
         return this.bM() ? false : !this.bN() || !this.cS();
      }
   }

   @Override
   public boolean dH() {
      return false;
   }

   public boolean a(cmm $$0, gu $$1) {
      return true;
   }

   public cmm dI() {
      return this.t;
   }

   protected void a(cmm $$0) {
      this.t = $$0;
   }

   public beo dJ() {
      return this.dI().ag();
   }

   @FunctionalInterface
   public interface a {
      void accept(bfj var1, double var2, double var4, double var6);
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
