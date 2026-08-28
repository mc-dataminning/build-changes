import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class buv extends btz implements btt {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final alh d = alh.b("powder_snow");
   private static final alh e = alh.b("sprinting");
   private static final bwb bE = new bwb(e, 0.3F, bwb.a.c);
   public static final int j = 2;
   public static final int k = 4;
   public static final int l = 98;
   public static final int m = 100;
   public static final int n = 105;
   public static final int o = 6;
   public static final int p = 100;
   private static final int bF = 40;
   public static final double q = 0.003;
   public static final double r = 0.08;
   public static final int s = 20;
   private static final int bG = 10;
   private static final int bH = 2;
   public static final float t = 0.42F;
   private static final double bI = 128.0;
   protected static final int u = 1;
   protected static final int v = 2;
   protected static final int az = 4;
   protected static final akk<Byte> aA = ako.a(buv.class, akm.a);
   private static final akk<Float> bJ = ako.a(buv.class, akm.d);
   private static final akk<List<lo>> bK = ako.a(buv.class, akm.m);
   private static final akk<Boolean> bL = ako.a(buv.class, akm.k);
   private static final akk<Integer> bM = ako.a(buv.class, akm.b);
   private static final akk<Integer> bN = ako.a(buv.class, akm.b);
   private static final akk<Optional<jg>> bO = ako.a(buv.class, akm.p);
   private static final int bP = 15;
   protected static final buc aB = buc.c(0.2F, 0.2F).b(0.2F);
   public static final float aC = 0.5F;
   public static final float aD = 0.5F;
   public static final String aE = "attributes";
   private final bwa bQ;
   private final bsm bR = new bsm(this);
   private final Map<jp<btc>, bte> bS = Maps.newHashMap();
   private final jy<cvx> bT = jy.a(2, cvx.k);
   private final jy<cvx> bU = jy.a(4, cvx.k);
   private cvx bV = cvx.k;
   public boolean aF;
   private boolean bW = false;
   public brx aG;
   public int aH;
   public int aI;
   public int aJ;
   public int aK;
   public int aL;
   public int aM;
   public float aN;
   public float aO;
   protected int aP;
   public final bvw aQ = new bvw();
   public final int aR = 20;
   public final float aS;
   public final float aT;
   public float aU;
   public float aV;
   public float aW;
   public float aX;
   public final bty aY = new bty(this);
   @Nullable
   protected coh aZ;
   protected int ba;
   protected boolean bb;
   protected int bc;
   protected float bd;
   protected float be;
   protected float bf;
   protected float bg;
   protected float bh;
   protected int bi;
   protected float bj;
   protected boolean bk;
   public float bl;
   public float bm;
   public float bn;
   protected int bo;
   protected double bp;
   protected double bq;
   protected double br;
   protected double bs;
   protected double bt;
   protected double bu;
   protected int bv;
   private boolean bX = true;
   @Nullable
   private buv bY;
   private int bZ;
   @Nullable
   private buv ca;
   private int cb;
   private float cc;
   private int cd;
   private float ce;
   protected cvx bw = cvx.k;
   protected int bx;
   protected int by;
   private jg cf;
   private Optional<jg> cg = Optional.empty();
   @Nullable
   private bsp ch;
   private long ci;
   protected int bz;
   protected float bA;
   @Nullable
   protected cvx bB;
   private float cj;
   private float ck;
   protected bvx<?> bC;
   private boolean cl;
   private final EnumMap<buh, Reference2ObjectMap<dbm, Set<dce>>> cm = new EnumMap<>(buh.class);
   protected float bD = 1.0F;

   protected buv(bug<? extends buv> $$0, dev $$1) {
      super($$0, $$1);
      this.bQ = new bwa(bwe.a($$0));
      this.x(this.eV());
      this.J = true;
      this.aT = (float)((Math.random() + 1.0) * 0.01F);
      this.az();
      this.aS = (float)Math.random() * 12398.0F;
      this.v((float)(Math.random() * (float) (Math.PI * 2)));
      this.aW = this.dN();
      ux $$2 = ux.a;
      this.bC = this.a(new Dynamic($$2, (vg)$$2.createMap(ImmutableMap.of($$2.a("memories"), (vg)$$2.emptyMap()))));
   }

   public bvx<?> ed() {
      return this.bC;
   }

   protected bvx.b<?> ee() {
      return bvx.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bvx<?> a(Dynamic<?> $$0) {
      return this.ee().a($$0);
   }

   @Override
   public void at() {
      this.a(this.dY().y(), Float.MAX_VALUE);
   }

   public boolean a(bug<?> $$0) {
      return true;
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(aA, (byte)0);
      $$0.a(bK, List.of());
      $$0.a(bL, false);
      $$0.a(bM, 0);
      $$0.a(bN, 0);
      $$0.a(bJ, 1.0F);
      $$0.a(bO, Optional.empty());
   }

   public static bwc.a ef() {
      return bwc.a()
         .a(bwd.s)
         .a(bwd.p)
         .a(bwd.v)
         .a(bwd.a)
         .a(bwd.b)
         .a(bwd.r)
         .a(bwd.B)
         .a(bwd.y)
         .a(bwd.n)
         .a(bwd.x)
         .a(bwd.k)
         .a(bwd.o)
         .a(bwd.w)
         .a(bwd.h)
         .a(bwd.i)
         .a(bwd.F)
         .a(bwd.u)
         .a(bwd.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvd $$2, jg $$3) {
      if (!this.bk()) {
         this.bs();
      }

      if (this.dX() instanceof arm $$4 && $$1 && this.aa > 0.0F) {
         this.b($$4, $$3);
         double $$5 = this.h(bwd.x);
         if ((double)this.aa > $$5 && !$$2.l()) {
            double $$6 = this.dC();
            double $$7 = this.dE();
            double $$8 = this.dI();
            jg $$9 = this.dx();
            if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
               double $$10 = $$6 - (double)$$3.u() - 0.5;
               double $$11 = $$8 - (double)$$3.w() - 0.5;
               double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
               $$6 = (double)$$3.u() + 0.5 + $$10 / $$12 * 0.5;
               $$8 = (double)$$3.w() + 0.5 + $$11 / $$12 * 0.5;
            }

            float $$13 = (float)azj.c((double)this.aa - $$5);
            double $$14 = Math.min((double)(0.2F + $$13 / 15.0F), 2.5);
            int $$15 = (int)(150.0 * $$14);
            ((arm)this.dX()).a(new li(lq.b, $$2), $$6, $$7, $$8, $$15, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cg = Optional.empty();
      }
   }

   public final boolean eg() {
      return this.aq().a(axd.m);
   }

   public float a(float $$0) {
      return azj.h($$0, this.ck, this.cj);
   }

   public boolean eh() {
      return this.dA().b() < 1.0E-5F && this.bo();
   }

   @Override
   public void aA() {
      this.aN = this.aO;
      if (this.al) {
         this.fR().ifPresent(this::a);
      }

      if (this.dX() instanceof arm $$0) {
         dbo.b($$0, this);
      }

      super.aA();
      this.dX().ah().a("livingEntityBaseTick");
      if (this.bj() || this.dX().C) {
         this.aH();
      }

      if (this.bM()) {
         boolean $$1 = this instanceof coh;
         if (!this.dX().C) {
            if (this.bN()) {
               this.a(this.dY().g(), 1.0F);
            } else if ($$1 && !this.dX().C_().a(this.cS())) {
               double $$2 = this.dX().C_().a(this) + this.dX().C_().n();
               if ($$2 < 0.0) {
                  double $$3 = this.dX().C_().o();
                  if ($$3 > 0.0) {
                     this.a(this.dY().x(), (float)Math.max(1, azj.a(-$$2 * $$3)));
                  }
               }
            }
         }

         if (this.a(axf.a) && !this.dX().a_(jg.a(this.dC(), this.dG(), this.dI())).a(dia.nd)) {
            boolean $$4 = !this.eg() && !btf.c(this) && (!$$1 || !((coh)this).gl().a);
            if ($$4) {
               this.j(this.m(this.cu()));
               if (this.cu() == -20) {
                  this.j(0);
                  ezh $$5 = this.dA();

                  for (int $$6 = 0; $$6 < 8; $$6++) {
                     double $$7 = this.af.j() - this.af.j();
                     double $$8 = this.af.j() - this.af.j();
                     double $$9 = this.af.j() - this.af.j();
                     this.dX().a(lq.d, this.dC() + $$7, this.dE() + $$8, this.dI() + $$9, $$5.d, $$5.e, $$5.f);
                  }

                  this.a(this.dY().i(), 2.0F);
               }
            }

            if (!this.dX().C && this.ca() && this.dl() != null && this.dl().cc()) {
               this.af();
            }
         } else if (this.cu() < this.ct()) {
            this.j(this.n(this.cu()));
         }

         if (this.dX() instanceof arm $$10) {
            jg $$11 = this.dx();
            if (!Objects.equal(this.cf, $$11)) {
               this.cf = $$11;
               this.b($$10, $$11);
            }
         }
      }

      if (this.bM() && (this.bm() || this.aw)) {
         this.aN();
      }

      if (this.aK > 0) {
         this.aK--;
      }

      if (this.ak > 0 && !(this instanceof arn)) {
         this.ak--;
      }

      if (this.eH() && this.dX().h(this)) {
         this.en();
      }

      if (this.ba > 0) {
         this.ba--;
      } else {
         this.aZ = null;
      }

      if (this.ca != null && !this.ca.bM()) {
         this.ca = null;
      }

      if (this.bY != null) {
         if (!this.bY.bM()) {
            this.a(null);
         } else if (this.ag - this.bZ > 100) {
            this.a(null);
         }
      }

      this.ey();
      this.bg = this.bf;
      this.aV = this.aU;
      this.aX = this.aW;
      this.O = this.dN();
      this.P = this.dP();
      this.dX().ah().c();
   }

   @Override
   protected float aT() {
      return azj.h((float)this.h(bwd.u), super.aT(), 1.0F);
   }

   protected void ei() {
      bvz $$0 = this.g(bwd.v);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.c(d);
         }
      }
   }

   protected void ej() {
      if (!this.bu().l()) {
         int $$0 = this.cv();
         if ($$0 > 0) {
            bvz $$1 = this.g(bwd.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cw();
            $$1.b(new bwb(d, (double)$$2, bwb.a.a));
         }
      }
   }

   protected void b(arm $$0, jg $$1) {
      dbo.a($$0, this);
   }

   public boolean p_() {
      return false;
   }

   public float ek() {
      return this.p_() ? 0.5F : 1.0F;
   }

   public final float el() {
      bwa $$0 = this.fa();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bwd.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean em() {
      return true;
   }

   protected void en() {
      this.aM++;
      if (this.aM >= 20 && !this.dX().y_() && !this.dS()) {
         this.dX().a(this, (byte)60);
         this.a(btz.c.a);
      }
   }

   public boolean eo() {
      return !this.p_();
   }

   protected boolean ep() {
      return !this.p_();
   }

   protected int m(int $$0) {
      bvz $$1 = this.g(bwd.w);
      double $$2;
      if ($$1 != null) {
         $$2 = $$1.g();
      } else {
         $$2 = 0.0;
      }

      return $$2 > 0.0 && this.af.j() >= 1.0 / ($$2 + 1.0) ? $$0 : $$0 - 1;
   }

   protected int n(int $$0) {
      return Math.min($$0 + 4, this.ct());
   }

   public final int a(arm $$0, @Nullable btz $$1) {
      return dbo.a($$0, $$1, this, this.eq());
   }

   protected int eq() {
      return 0;
   }

   protected boolean er() {
      return false;
   }

   @Nullable
   public buv es() {
      return this.bY;
   }

   @Override
   public buv Z_() {
      return this.es();
   }

   public int et() {
      return this.bZ;
   }

   public void c(@Nullable coh $$0) {
      this.aZ = $$0;
      this.ba = this.ag;
   }

   public void a(@Nullable buv $$0) {
      this.bY = $$0;
      this.bZ = this.ag;
   }

   @Nullable
   public buv eu() {
      return this.ca;
   }

   public int ev() {
      return this.cb;
   }

   public void B(btz $$0) {
      if ($$0 instanceof buv) {
         this.ca = (buv)$$0;
      } else {
         this.ca = null;
      }

      this.cb = this.ag;
   }

   public int ew() {
      return this.bc;
   }

   public void o(int $$0) {
      this.bc = $$0;
   }

   public boolean ex() {
      return this.bW;
   }

   public void r(boolean $$0) {
      this.bW = $$0;
   }

   protected boolean b(buh $$0) {
      return true;
   }

   public void a(buh $$0, cvx $$1, cvx $$2) {
      if (!this.dX().y_() && !this.R_()) {
         boolean $$3 = $$2.f() && $$1.f();
         if (!$$3 && !cvx.c($$1, $$2) && !this.al) {
            ddh $$4 = $$2.a(kt.D);
            if (!this.bc() && $$4 != null && $$0 == $$4.a()) {
               this.dX().a(null, this.dC(), this.dE(), this.dI(), $$4.b(), this.dn(), 1.0F, 1.0F, this.af.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? eaa.v : eaa.S);
            }
         }
      }
   }

   @Override
   public void a(btz.c $$0) {
      if ($$0 == btz.c.a || $$0 == btz.c.b) {
         this.c($$0);
      }

      super.a($$0);
      this.bC.a();
   }

   protected void c(btz.c $$0) {
      for (bte $$1 : this.eD()) {
         $$1.a(this, $$0);
      }

      this.bS.clear();
   }

   @Override
   public void b(uj $$0) {
      $$0.a("Health", this.eG());
      $$0.a("HurtTime", (short)this.aK);
      $$0.a("HurtByTimestamp", this.bZ);
      $$0.a("DeathTime", (short)this.aM);
      $$0.a("AbsorptionAmount", this.fy());
      $$0.a("attributes", this.fa().d());
      if (!this.bS.isEmpty()) {
         up $$1 = new up();

         for (bte $$2 : this.bS.values()) {
            $$1.add($$2.j());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fL());
      this.fR().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<vg> $$3 = this.bC.a(ux.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(uj $$0) {
      this.F($$0.j("AbsorptionAmount"));
      if ($$0.b("attributes", 9) && this.dX() != null && !this.dX().C) {
         this.fa().a($$0.c("attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         up $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            uj $$3 = $$1.a($$2);
            bte $$4 = bte.a($$3);
            if ($$4 != null) {
               this.bS.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.x($$0.j("Health"));
      }

      this.aK = $$0.g("HurtTime");
      this.aM = $$0.g("DeathTime");
      this.bZ = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         fam $$6 = this.dX().O();
         fah $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cI(), $$7);
         if (!$$8) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         jg $$9 = new jg($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$9);
         this.am.a(ar, bvh.c);
         if (!this.al) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bC = this.a(new Dynamic(ux.a, $$0.c("Brain")));
      }
   }

   protected void ey() {
      Iterator<jp<btc>> $$0 = this.bS.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            jp<btc> $$1 = $$0.next();
            bte $$2 = this.bS.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dX().C) {
                  $$0.remove();
                  this.c(List.of($$2));
               }
            } else if ($$2.d() % 600 == 0) {
               this.a($$2, false, null);
            }
         }
      } catch (ConcurrentModificationException var6) {
      }

      if (this.bX) {
         if (!this.dX().C) {
            this.L();
            this.w();
         }

         this.bX = false;
      }

      List<lo> $$3 = this.am.a(bK);
      if (!$$3.isEmpty()) {
         boolean $$4 = this.am.a(bL);
         int $$5 = this.cq() ? 15 : 4;
         int $$6 = $$4 ? 5 : 1;
         if (this.af.a($$5 * $$6) == 0) {
            this.dX().a(ad.a($$3, this.af), this.d(0.5), this.dF(), this.g(0.5), 1.0, 1.0, 1.0);
         }
      }
   }

   protected void L() {
      if (this.bS.isEmpty()) {
         this.eB();
         this.k(false);
      } else {
         this.k(this.b(btg.n));
         this.q();
      }
   }

   private void q() {
      List<lo> $$0 = this.bS.values().stream().filter(bte::g).map(bte::a).toList();
      this.am.a(bK, $$0);
      this.am.a(bL, d(this.bS.values()));
   }

   private void w() {
      boolean $$0 = this.cp();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable btz $$0) {
      double $$1 = 1.0;
      if (this.ch()) {
         $$1 *= 0.8;
      }

      if (this.cq()) {
         float $$2 = this.fh();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cvx $$3 = this.a(buh.f);
         bug<?> $$4 = $$0.aq();
         if ($$4 == bug.aN && $$3.a(cwb.un)
            || $$4 == bug.bu && $$3.a(cwb.uq)
            || $$4 == bug.aA && $$3.a(cwb.ut)
            || $$4 == bug.aB && $$3.a(cwb.ut)
            || $$4 == bug.x && $$3.a(cwb.ur)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(buv $$0) {
      return $$0 instanceof coh && this.dX().am() == brv.a ? false : $$0.ez();
   }

   public boolean a(buv $$0, cfm $$1) {
      return $$1.a(this, $$0);
   }

   public boolean ez() {
      return !this.cD() && this.eA();
   }

   public boolean eA() {
      return !this.R_() && this.bM();
   }

   public static boolean d(Collection<bte> $$0) {
      for (bte $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void eB() {
      this.am.a(bK, List.of());
   }

   public boolean eC() {
      if (this.dX().C) {
         return false;
      } else if (this.bS.isEmpty()) {
         return false;
      } else {
         Map<jp<btc>, bte> $$0 = Maps.newHashMap(this.bS);
         this.bS.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<bte> eD() {
      return this.bS.values();
   }

   public Map<jp<btc>, bte> eE() {
      return this.bS;
   }

   public boolean b(jp<btc> $$0) {
      return this.bS.containsKey($$0);
   }

   @Nullable
   public bte c(jp<btc> $$0) {
      return this.bS.get($$0);
   }

   public final boolean a(bte $$0) {
      return this.b($$0, null);
   }

   public boolean b(bte $$0, @Nullable btz $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         bte $$2 = this.bS.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bS.put($$0.c(), $$0);
            this.a($$0, $$1);
            $$3 = true;
            $$0.b(this);
         } else if ($$2.b($$0)) {
            this.a($$2, true, $$1);
            $$3 = true;
         }

         $$0.a(this);
         return $$3;
      }
   }

   public boolean b(bte $$0) {
      if (this.aq().a(axd.G)) {
         return !$$0.a(btg.M);
      } else if (this.aq().a(axd.F)) {
         return !$$0.a(btg.L);
      } else {
         return !this.aq().a(axd.w) ? true : !$$0.a(btg.j) && !$$0.a(btg.s);
      }
   }

   public void c(bte $$0, @Nullable btz $$1) {
      if (this.b($$0)) {
         bte $$2 = this.bS.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eF() {
      return this.aq().a(axd.x);
   }

   @Nullable
   public bte d(jp<btc> $$0) {
      return this.bS.remove($$0);
   }

   public boolean e(jp<btc> $$0) {
      bte $$1 = this.d($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(bte $$0, @Nullable btz $$1) {
      this.bX = true;
      if (!this.dX().C) {
         $$0.c().a().a(this.fa(), $$0.e());
         this.c($$0);
      }
   }

   public void c(bte $$0) {
      for (btz $$1 : this.da()) {
         if ($$1 instanceof arn $$2) {
            $$2.d.b(new agn(this.ar(), $$0, false));
         }
      }
   }

   protected void a(bte $$0, boolean $$1, @Nullable btz $$2) {
      this.bX = true;
      if ($$1 && !this.dX().C) {
         btc $$3 = $$0.c().a();
         $$3.a(this.fa());
         $$3.a(this.fa(), $$0.e());
         this.D();
      }

      if (!this.dX().C) {
         this.c($$0);
      }
   }

   protected void c(Collection<bte> $$0) {
      this.bX = true;
      if (!this.dX().C) {
         for (bte $$1 : $$0) {
            $$1.c().a().a(this.fa());

            for (btz $$2 : this.da()) {
               if ($$2 instanceof arn $$3) {
                  $$3.d.b(new aeq(this.ar(), $$1.c()));
               }
            }
         }

         this.D();
      }
   }

   private void D() {
      Set<bvz> $$0 = this.fa().b();

      for (bvz $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(jp<bvy> $$0) {
      if ($$0.a(bwd.s)) {
         float $$1 = this.eV();
         if (this.eG() > $$1) {
            this.x($$1);
         }
      } else if ($$0.a(bwd.r)) {
         float $$2 = this.eW();
         if (this.fy() > $$2) {
            this.E($$2);
         }
      }
   }

   public void c(float $$0) {
      float $$1 = this.eG();
      if ($$1 > 0.0F) {
         this.x($$1 + $$0);
      }
   }

   public float eG() {
      return this.am.a(bJ);
   }

   public void x(float $$0) {
      this.am.a(bJ, azj.a($$0, 0.0F, this.eV()));
   }

   public boolean eH() {
      return this.eG() <= 0.0F;
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dX().C) {
         return false;
      } else if (this.eH()) {
         return false;
      } else if ($$0.a(axb.i) && this.b(btg.l)) {
         return false;
      } else {
         if (this.fT() && !this.dX().C) {
            this.fU();
         }

         this.bc = 0;
         if ($$1 < 0.0F) {
            $$1 = 0.0F;
         }

         float $$2 = $$1;
         boolean $$3 = false;
         float $$4 = 0.0F;
         if ($$1 > 0.0F && this.f($$0)) {
            this.z($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.a(axb.j) && $$0.c() instanceof buv $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(axb.o) && this.aq().a(axd.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(axb.a) && !this.a(buh.f).f()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.aQ.a(1.5F);
         if (Float.isNaN($$1) || Float.isInfinite($$1)) {
            $$1 = Float.MAX_VALUE;
         }

         boolean $$7 = true;
         if ((float)this.ak > 10.0F && !$$0.a(axb.e)) {
            if ($$1 <= this.bj) {
               return false;
            }

            this.f($$0, $$1 - this.bj);
            this.bj = $$1;
            $$7 = false;
         } else {
            this.bj = $$1;
            this.ak = 20;
            this.f($$0, $$1);
            this.aL = 10;
            this.aK = this.aL;
         }

         btz $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof buv $$9 && !$$0.a(axb.q) && (!$$0.a(bss.I) || !this.aq().a(axd.E))) {
               this.a($$9);
            }

            if ($$8 instanceof coh $$10) {
               this.ba = 100;
               this.aZ = $$10;
            } else if ($$8 instanceof chp $$11 && $$11.q()) {
               this.ba = 100;
               if ($$11.T_() instanceof coh $$12) {
                  this.aZ = $$12;
               } else {
                  this.aZ = null;
               }
            }
         }

         if ($$7) {
            if ($$3) {
               this.dX().a(this, (byte)29);
            } else {
               this.dX().a(this, $$0);
            }

            if (!$$0.a(axb.r) && (!$$3 || $$1 > 0.0F)) {
               this.bE();
            }

            if (!$$0.a(axb.z)) {
               double $$13 = 0.0;
               double $$14 = 0.0;
               if ($$0.c() instanceof cpb $$15) {
                  DoubleDoubleImmutablePair $$16 = $$15.a_(this, $$0);
                  $$13 = -$$16.leftDouble();
                  $$14 = -$$16.rightDouble();
               } else if ($$0.i() != null) {
                  $$13 = $$0.i().a() - this.dC();
                  $$14 = $$0.i().c() - this.dI();
               }

               this.p(0.4F, $$13, $$14);
               if (!$$3) {
                  this.a($$13, $$14);
               }
            }
         }

         if (this.eH()) {
            if (!this.g($$0)) {
               if ($$7) {
                  this.b(this.o_());
               }

               this.a($$0);
            }
         } else if ($$7) {
            this.e($$0);
         }

         boolean $$17 = !$$3 || $$1 > 0.0F;
         if ($$17) {
            this.ch = $$0;
            this.ci = this.dX().aa();

            for (bte $$18 : this.eD()) {
               $$18.a(this, $$0, $$1);
            }
         }

         if (this instanceof arn) {
            an.i.a((arn)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((arn)this).a(awu.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof arn) {
            an.h.a((arn)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$17;
      }
   }

   protected void d(buv $$0) {
      $$0.e(this);
   }

   protected void e(buv $$0) {
      $$0.p(0.5, $$0.dC() - this.dC(), $$0.dI() - this.dI());
   }

   private boolean g(bsp $$0) {
      if ($$0.a(axb.d)) {
         return false;
      } else {
         cvx $$1 = null;

         for (brx $$2 : brx.values()) {
            cvx $$3 = this.b($$2);
            if ($$3.a(cwb.vv)) {
               $$1 = $$3.v();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof arn $$4) {
               $$4.b(awu.c.b(cwb.vv));
               an.C.a($$4, $$1);
               this.a(eaa.C);
            }

            this.x(1.0F);
            this.eC();
            this.a(new bte(btg.j, 900, 1));
            this.a(new bte(btg.v, 100, 1));
            this.a(new bte(btg.l, 800, 0));
            this.dX().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bsp eI() {
      if (this.dX().aa() - this.ci > 40L) {
         this.ch = null;
      }

      return this.ch;
   }

   protected void e(bsp $$0) {
      this.b(this.d($$0));
   }

   public void b(@Nullable awj $$0) {
      if ($$0 != null) {
         this.a($$0, this.fi(), this.fj());
      }
   }

   public boolean f(bsp $$0) {
      btz $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cop $$3 && $$3.A() > 0) {
         $$2 = true;
      }

      if (!$$0.a(axb.c) && this.fI() && !$$2) {
         ezh $$4 = $$0.i();
         if ($$4 != null) {
            ezh $$5 = this.c(0.0F, this.cB());
            ezh $$6 = $$4.a(this.dv());
            $$6 = new ezh($$6.d, 0.0, $$6.f).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void g(cvx $$0) {
      if (!$$0.f()) {
         if (!this.bc()) {
            this.dX().a(this.dC(), this.dE(), this.dI(), $$0.M(), this.dn(), 0.8F, 0.8F + this.dX().A.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(bsp $$0) {
      if (!this.dS() && !this.bb) {
         btz $$1 = $$0.d();
         buv $$2 = this.eU();
         if (this.bi >= 0 && $$2 != null) {
            $$2.a(this, this.bi, $$0);
         }

         if (this.fT()) {
            this.fU();
         }

         if (!this.dX().C && this.am()) {
            b.info("Named entity {} died: {}", this, this.eT().a().getString());
         }

         this.bb = true;
         this.eT().c();
         if (this.dX() instanceof arm $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(eaa.p);
               this.a($$3, $$0);
               this.f($$2);
            }

            this.dX().a(this, (byte)3);
         }

         this.b(bvh.h);
      }
   }

   protected void f(@Nullable buv $$0) {
      if (!this.dX().C) {
         boolean $$1 = false;
         if ($$0 instanceof ckd) {
            if (this.dX().ac().b(der.c)) {
               jg $$2 = this.dx();
               dvd $$3 = dia.cd.m();
               if (this.dX().a_($$2).l() && $$3.a((dey)this.dX(), $$2)) {
                  this.dX().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               ckq $$4 = new ckq(this.dX(), this.dC(), this.dE(), this.dI(), new cvx(cwb.dw));
               this.dX().b($$4);
            }
         }
      }
   }

   protected void a(arm $$0, bsp $$1) {
      boolean $$2 = this.ba > 0;
      if (this.ep() && $$0.ac().b(der.f)) {
         this.a($$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.eJ();
      this.D($$1.d());
   }

   protected void eJ() {
   }

   protected void D(@Nullable btz $$0) {
      if (this.dX() instanceof arm $$1 && !this.eM() && (this.er() || this.ba > 0 && this.eo() && this.dX().ac().b(der.f))) {
         bul.a($$1, this.dv(), this.a($$1, $$0));
      }
   }

   protected void a(arm $$0, bsp $$1, boolean $$2) {
   }

   public long eK() {
      return 0L;
   }

   protected float a(btz $$0, bsp $$1) {
      float $$2 = (float)this.h(bwd.d);
      return this.dX() instanceof arm $$3 ? dbo.d($$3, this.eb(), $$0, $$1, $$2) : $$2;
   }

   protected void a(bsp $$0, boolean $$1) {
      Optional<alg<eub>> $$2 = this.ec();
      if (!$$2.isEmpty()) {
         eub $$3 = this.dX().o().bd().b($$2.get());
         etz.a $$4 = new etz.a((arm)this.dX()).a(ews.a, this).a(ews.f, this.dv()).a(ews.c, $$0).b(ews.d, $$0.d()).b(ews.e, $$0.c());
         if ($$1 && this.aZ != null) {
            $$4 = $$4.a(ews.b, this.aZ).a(this.aZ.gG());
         }

         etz $$5 = $$4.a(ewr.g);
         $$3.a($$5, this.eK(), this::b);
      }
   }

   protected void a(alg<eub> $$0, Consumer<cvx> $$1) {
      if (this.dX() instanceof arm $$2) {
         eub $$3 = $$2.o().bd().b($$0);
         etz $$4 = new etz.a($$2).a(ews.f, this.dv()).a(ews.a, this).a(ewr.s);
         ObjectListIterator var6 = $$3.a($$4).iterator();

         while (var6.hasNext()) {
            cvx $$5 = (cvx)var6.next();
            $$1.accept($$5);
         }
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(bwd.p);
      if (!($$0 <= 0.0)) {
         this.as = true;
         ezh $$3 = this.dA();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         ezh $$4 = new ezh($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aJ() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected awj d(bsp $$0) {
      return awk.kh;
   }

   @Nullable
   protected awj o_() {
      return awk.kc;
   }

   private awj r(int $$0) {
      return $$0 > 4 ? this.eP().b() : this.eP().a();
   }

   public void eL() {
      this.cl = true;
   }

   public boolean eM() {
      return this.cl;
   }

   public float eN() {
      return 0.0F;
   }

   protected ezc eO() {
      ezc $$0 = this.cS();
      btz $$1 = this.dl();
      if ($$1 != null) {
         ezh $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<dbm, Set<dce>> c(buh $$0) {
      return (Map<dbm, Set<dce>>)this.cm.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public buv.a eP() {
      return new buv.a(awk.ki, awk.ka);
   }

   public Optional<jg> eQ() {
      return this.cg;
   }

   public boolean q_() {
      if (this.R_()) {
         return false;
      } else {
         jg $$0 = this.dx();
         dvd $$1 = this.dy();
         if ($$1.a(awz.aQ)) {
            this.cg = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dql && this.c($$0, $$1)) {
            this.cg = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(jg $$0, dvd $$1) {
      if (!$$1.c(dql.b)) {
         return false;
      } else {
         dvd $$2 = this.dX().a_($$0.e());
         return $$2.a(dia.cO) && $$2.c(dmd.b) == $$1.c(dql.aF);
      }
   }

   @Override
   public boolean bM() {
      return !this.dS() && this.eG() > 0.0F;
   }

   @Override
   public int cF() {
      return this.y(0.0F);
   }

   protected final int y(float $$0) {
      return azj.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bsp $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.e($$0, $$1);
      if ($$4 > 0) {
         this.a(this.r($$4), 1.0F, 1.0F);
         this.eR();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int e(float $$0, float $$1) {
      if (this.aq().a(axd.o)) {
         return 0;
      } else {
         float $$2 = (float)this.h(bwd.x);
         float $$3 = $$0 - $$2;
         return azj.c((double)($$3 * $$1) * this.h(bwd.k));
      }
   }

   protected void eR() {
      if (!this.bc()) {
         int $$0 = azj.a(this.dC());
         int $$1 = azj.a(this.dE() - 0.2F);
         int $$2 = azj.a(this.dI());
         dvd $$3 = this.dX().a_(new jg($$0, $$1, $$2));
         if (!$$3.l()) {
            dpl $$4 = $$3.A();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void p(float $$0) {
      this.aL = 10;
      this.aK = this.aL;
   }

   public int eS() {
      return azj.a(this.h(bwd.a));
   }

   protected void b(bsp $$0, float $$1) {
   }

   protected void c(bsp $$0, float $$1) {
   }

   protected void z(float $$0) {
   }

   protected void a(bsp $$0, float $$1, buh... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (buh $$4 : $$2) {
            cvx $$5 = this.a($$4);
            if ($$5.m() && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float d(bsp $$0, float $$1) {
      if (!$$0.a(axb.b)) {
         this.b($$0, $$1);
         $$1 = bsl.a(this, $$1, $$0, (float)this.eS(), (float)this.h(bwd.b));
      }

      return $$1;
   }

   protected float e(bsp $$0, float $$1) {
      if ($$0.a(axb.f)) {
         return $$1;
      } else {
         if (this.b(btg.k) && !$$0.a(axb.g)) {
            int $$2 = (this.c(btg.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof arn) {
                  ((arn)this).a(awu.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof arn) {
                  ((arn)$$0.d()).a(awu.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(axb.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dX() instanceof arm $$7) {
               $$8 = dbo.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = bsl.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void f(bsp $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fy(), 0.0F);
         this.E(this.fy() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof arn $$4) {
            $$4.a(awu.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eT().a($$0, var9);
            this.x(this.eG() - var9);
            this.E(this.fy() - var9);
            this.a(eaa.o);
         }
      }
   }

   public bsm eT() {
      return this.bR;
   }

   @Nullable
   public buv eU() {
      if (this.aZ != null) {
         return this.aZ;
      } else {
         return this.bY != null ? this.bY : null;
      }
   }

   public final float eV() {
      return (float)this.h(bwd.s);
   }

   public final float eW() {
      return (float)this.h(bwd.r);
   }

   public final int eX() {
      return this.am.a(bM);
   }

   public final void p(int $$0) {
      this.am.a(bM, $$0);
   }

   public final int eY() {
      return this.am.a(bN);
   }

   public final void q(int $$0) {
      this.am.a(bN, $$0);
   }

   private int E() {
      if (btf.a(this)) {
         return 6 - (1 + btf.b(this));
      } else {
         return this.b(btg.d) ? 6 + (1 + this.c(btg.d).e()) * 2 : 6;
      }
   }

   public void a(brx $$0) {
      this.a($$0, false);
   }

   public void a(brx $$0, boolean $$1) {
      if (!this.aF || this.aH >= this.E() / 2 || this.aH < 0) {
         this.aH = -1;
         this.aF = true;
         this.aG = $$0;
         if (this.dX() instanceof arm) {
            acg $$2 = new acg(this, $$0 == brx.a ? 0 : 3);
            ark $$3 = ((arm)this.dX()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bsp $$0) {
      this.aQ.a(1.5F);
      this.ak = 20;
      this.aL = 10;
      this.aK = this.aL;
      awj $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.fi(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
      }

      this.a(this.dY().p(), 0.0F);
      this.ch = $$0;
      this.ci = this.dX().aa();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            awj $$1 = this.o_();
            if ($$1 != null) {
               this.a($$1, this.fi(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof coh)) {
               this.x(0.0F);
               this.a(this.dY().p());
            }
            break;
         case 29:
            this.a(awk.wC, 1.0F, 0.8F + this.dX().A.i() * 0.4F);
            break;
         case 30:
            this.a(awk.wD, 0.8F, 0.8F + this.dX().A.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.af.i() - 0.5F) * 0.2F;
               float $$6 = (this.af.i() - 0.5F) * 0.2F;
               float $$7 = (this.af.i() - 0.5F) * 0.2F;
               double $$8 = azj.d($$4, this.L, this.dC()) + (this.af.j() - 0.5) * (double)this.ds() * 2.0;
               double $$9 = azj.d($$4, this.M, this.dE()) + this.af.j() * (double)this.dt();
               double $$10 = azj.d($$4, this.N, this.dI()) + (this.af.j() - 0.5) * (double)this.ds() * 2.0;
               this.dX().a(lq.ac, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.g(this.a(buh.a));
            break;
         case 48:
            this.g(this.a(buh.b));
            break;
         case 49:
            this.g(this.a(buh.f));
            break;
         case 50:
            this.g(this.a(buh.e));
            break;
         case 51:
            this.g(this.a(buh.d));
            break;
         case 52:
            this.g(this.a(buh.c));
            break;
         case 54:
            dlr.b(this);
            break;
         case 55:
            this.G();
            break;
         case 60:
            this.F();
            break;
         case 65:
            this.g(this.a(buh.g));
            break;
         default:
            super.b($$0);
      }
   }

   private void F() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.af.k() * 0.02;
         double $$2 = this.af.k() * 0.02;
         double $$3 = this.af.k() * 0.02;
         this.dX().a(lq.ab, this.d(1.0), this.dF(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void G() {
      cvx $$0 = this.a(buh.b);
      this.a(buh.b, this.a(buh.a));
      this.a(buh.a, $$0);
   }

   @Override
   protected void aI() {
      this.a(this.dY().o(), 4.0F);
   }

   protected void eZ() {
      int $$0 = this.E();
      if (this.aF) {
         this.aH++;
         if (this.aH >= $$0) {
            this.aH = 0;
            this.aF = false;
         }
      } else {
         this.aH = 0;
      }

      this.aO = (float)this.aH / (float)$$0;
   }

   @Nullable
   public bvz g(jp<bvy> $$0) {
      return this.fa().a($$0);
   }

   public double h(jp<bvy> $$0) {
      return this.fa().c($$0);
   }

   public double i(jp<bvy> $$0) {
      return this.fa().d($$0);
   }

   public bwa fa() {
      return this.bQ;
   }

   public cvx fb() {
      return this.a(buh.a);
   }

   public cvx fc() {
      return this.a(buh.b);
   }

   public cvx a(bup $$0) {
      return this.fA() == $$0 ? this.fb() : this.fc();
   }

   @Nonnull
   @Override
   public cvx eb() {
      return this.fb();
   }

   public boolean b(cvt $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cvx> $$0) {
      return $$0.test(this.fb()) || $$0.test(this.fc());
   }

   public cvx b(brx $$0) {
      if ($$0 == brx.a) {
         return this.a(buh.a);
      } else if ($$0 == brx.b) {
         return this.a(buh.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(brx $$0, cvx $$1) {
      if ($$0 == brx.a) {
         this.a(buh.a, $$1);
      } else {
         if ($$0 != brx.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(buh.b, $$1);
      }
   }

   public boolean d(buh $$0) {
      return !this.a($$0).f();
   }

   public boolean e(buh $$0) {
      return false;
   }

   public abstract Iterable<cvx> fd();

   public abstract cvx a(buh var1);

   public abstract void a(buh var1, cvx var2);

   public Iterable<cvx> fe() {
      return List.of();
   }

   public Iterable<cvx> ff() {
      return this.fd();
   }

   public Iterable<cvx> fg() {
      return Iterables.concat(this.fe(), this.ff());
   }

   protected void c(cvx $$0) {
      $$0.h().l($$0);
   }

   public float fh() {
      Iterable<cvx> $$0 = this.fd();
      int $$1 = 0;
      int $$2 = 0;

      for (cvx $$3 : $$0) {
         if (!$$3.f()) {
            $$2++;
         }

         $$1++;
      }

      return $$1 > 0 ? (float)$$2 / (float)$$1 : 0.0F;
   }

   @Override
   public void h(boolean $$0) {
      super.h($$0);
      bvz $$1 = this.g(bwd.v);
      $$1.c(bE.b());
      if ($$0) {
         $$1.b(bE);
      }
   }

   protected float fi() {
      return 1.0F;
   }

   public float fj() {
      return this.p_() ? (this.af.i() - this.af.i()) * 0.2F + 1.5F : (this.af.i() - this.af.i()) * 0.2F + 1.0F;
   }

   protected boolean fk() {
      return this.eH();
   }

   @Override
   public void h(btz $$0) {
      if (!this.fT()) {
         super.h($$0);
      }
   }

   private void d(btz $$0) {
      ezh $$1;
      if (this.dS()) {
         $$1 = this.dv();
      } else if (!$$0.dS() && !this.dX().a_($$0.dx()).a(awz.aK)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dE(), $$0.dE());
         $$1 = new ezh(this.dC(), $$2, this.dI());
         boolean $$4 = this.ds() <= 4.0F && this.dt() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.dt() / 2.0;
            ezh $$6 = $$1.b(0.0, $$5, 0.0);
            fab $$7 = ezy.a(ezc.a($$6, (double)this.ds(), (double)this.dt(), (double)this.ds()));
            $$1 = this.dX().a(this, $$7, $$6, (double)this.ds(), (double)this.dt(), (double)this.ds()).map($$1x -> $$1x.b(0.0, -$$5, 0.0)).orElse($$1);
         }
      }

      this.a($$1.d, $$1.e, $$1.f);
   }

   @Override
   public boolean cN() {
      return this.cM();
   }

   protected float fl() {
      return this.A(1.0F);
   }

   protected float A(float $$0) {
      return (float)this.h(bwd.o) * $$0 * this.aS() + this.fm();
   }

   public float fm() {
      return this.b(btg.h) ? 0.1F * ((float)this.c(btg.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void v() {
      float $$0 = this.fl();
      if (!($$0 <= 1.0E-5F)) {
         ezh $$1 = this.dA();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.ck()) {
            float $$2 = this.dN() * (float) (Math.PI / 180.0);
            this.i(new ezh((double)(-azj.a($$2)) * 0.2, 0.0, (double)azj.b($$2) * 0.2));
         }

         this.as = true;
      }
   }

   protected void fn() {
      this.h(this.dA().b(0.0, -0.04F, 0.0));
   }

   protected void c(axp<erd> $$0) {
      this.h(this.dA().b(0.0, 0.04F, 0.0));
   }

   protected float fo() {
      return 0.8F;
   }

   public boolean a(ere $$0) {
      return false;
   }

   @Override
   protected double be() {
      return this.h(bwd.n);
   }

   protected double fp() {
      boolean $$0 = this.dA().e <= 0.0;
      return $$0 && this.b(btg.B) ? Math.min(this.bf(), 0.01) : this.bf();
   }

   public void a_(ezh $$0) {
      if (this.dj()) {
         ere $$1 = this.dX().b_(this.dx());
         if ((this.bk() || this.by()) && this.em() && !this.a($$1)) {
            this.l($$0);
         } else if (this.fL()) {
            this.I();
         } else {
            this.k($$0);
         }
      }
   }

   private void k(ezh $$0) {
      jg $$1 = this.aQ();
      float $$2 = this.aJ() ? this.dX().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      ezh $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      bte $$6 = this.c(btg.y);
      if ($$6 != null) {
         $$5 += (0.05 * (double)($$6.e() + 1) - $$4.e) * 0.2;
      } else if (!this.dX().C || this.dX().B($$1)) {
         $$5 -= this.fp();
      } else if (this.dE() > (double)this.dX().I_()) {
         $$5 = -0.1;
      } else {
         $$5 = 0.0;
      }

      if (this.ex()) {
         this.n($$4.d, $$5, $$4.f);
      } else {
         float $$7 = this instanceof cgv ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void l(ezh $$0) {
      boolean $$1 = this.dA().e <= 0.0;
      double $$2 = this.dE();
      double $$3 = this.fp();
      if (this.bk()) {
         float $$4 = this.ck() ? 0.9F : this.fo();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(bwd.F);
         if (!this.aJ()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fr() - $$5) * $$6;
         }

         if (this.b(btg.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(buz.a, this.dA());
         ezh $$7 = this.dA();
         if (this.Q && this.q_()) {
            $$7 = new ezh($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.h(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(buz.a, this.dA());
         if (this.b(axf.b) <= this.dr()) {
            this.h(this.dA().d(0.5, 0.8F, 0.5));
            ezh $$8 = this.a($$3, $$1, this.dA());
            this.h($$8);
         } else {
            this.h(this.dA().c(0.5));
         }

         if ($$3 != 0.0) {
            this.h(this.dA().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      ezh $$9 = this.dA();
      if (this.Q && this.g($$9.d, $$9.e + 0.6F - this.dE() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void I() {
      ezh $$0 = this.dA();
      double $$1 = $$0.i();
      this.h(this.m($$0));
      this.a(buz.a, this.dA());
      if (!this.dX().C) {
         double $$2 = this.dA().i();
         this.c($$1, $$2);
      }
   }

   private ezh m(ezh $$0) {
      ezh $$1 = this.bU();
      float $$2 = this.dP() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fp();
      double $$6 = azj.k(Math.cos((double)$$2));
      $$0 = $$0.b(0.0, $$5 * (-1.0 + $$6 * 0.75), 0.0);
      if ($$0.e < 0.0 && $$3 > 0.0) {
         double $$7 = $$0.e * -0.1 * $$6;
         $$0 = $$0.b($$1.d * $$7 / $$3, $$7, $$1.f * $$7 / $$3);
      }

      if ($$2 < 0.0F && $$3 > 0.0) {
         double $$8 = $$4 * (double)(-azj.a($$2)) * 0.04;
         $$0 = $$0.b(-$$1.d * $$8 / $$3, $$8 * 3.2, -$$1.f * $$8 / $$3);
      }

      if ($$3 > 0.0) {
         $$0 = $$0.b(($$1.d / $$3 * $$4 - $$0.d) * 0.1, 0.0, ($$1.f / $$3 * $$4 - $$0.f) * 0.1);
      }

      return $$0.d(0.99F, 0.98F, 0.99F);
   }

   private void c(double $$0, double $$1) {
      if (this.Q) {
         double $$2 = $$0 - $$1;
         float $$3 = (float)($$2 * 10.0 - 3.0);
         if ($$3 > 0.0F) {
            this.a(this.r((int)$$3), 1.0F, 1.0F);
            this.a(this.dY().n(), $$3);
         }
      }
   }

   private void c(coh $$0, ezh $$1) {
      ezh $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.dj()) {
         this.C(this.e($$0));
         this.a_($$2);
      } else {
         this.h(ezh.c);
      }
   }

   protected void a(coh $$0, ezh $$1) {
   }

   protected ezh b(coh $$0, ezh $$1) {
      return $$1;
   }

   protected float e(coh $$0) {
      return this.fr();
   }

   public void s(boolean $$0) {
      float $$1 = (float)azj.g(this.dC() - this.L, $$0 ? this.dE() - this.M : 0.0, this.dI() - this.N);
      if (!this.ca() && this.bM()) {
         this.B($$1);
      } else {
         this.aQ.a();
      }
   }

   protected void B(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aQ.a($$1, 0.4F, this.p_() ? 3.0F : 1.0F);
   }

   private ezh a(ezh $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.h(this.n(this.dA()));
      this.a(buz.a, this.dA());
      ezh $$2 = this.dA();
      if ((this.Q || this.bk) && (this.q_() || this.dy().a(dia.qP) && dns.a(this))) {
         $$2 = new ezh($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public ezh a(double $$0, boolean $$1, ezh $$2) {
      if ($$0 != 0.0 && !this.ck()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new ezh($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private ezh n(ezh $$0) {
      if (this.q_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = azj.a($$0.d, -0.15F, 0.15F);
         double $$3 = azj.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dy().a(dia.nS) && this.fK() && this instanceof coh) {
            $$4 = 0.0;
         }

         $$0 = new ezh($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aJ() ? this.fr() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fq();
   }

   protected float fq() {
      return this.cY() instanceof coh ? this.fr() * 0.1F : 0.02F;
   }

   public float fr() {
      return this.cc;
   }

   public void C(float $$0) {
      this.cc = $$0;
   }

   public boolean E(btz $$0) {
      this.B($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.M();
      this.O();
      if (!this.dX().C) {
         int $$0 = this.eX();
         if ($$0 > 0) {
            if (this.aI <= 0) {
               this.aI = 20 * (30 - $$0);
            }

            this.aI--;
            if (this.aI <= 0) {
               this.p($$0 - 1);
            }
         }

         int $$1 = this.eY();
         if ($$1 > 0) {
            if (this.aJ <= 0) {
               this.aJ = 20 * (30 - $$1);
            }

            this.aJ--;
            if (this.aJ <= 0) {
               this.q($$1 - 1);
            }
         }

         this.J();
         if (this.ag % 20 == 0) {
            this.eT().c();
         }

         if (this.fT() && !this.P()) {
            this.fU();
         }
      }

      if (!this.dS()) {
         this.n_();
      }

      double $$2 = this.dC() - this.L;
      double $$3 = this.dI() - this.N;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aU;
      float $$6 = 0.0F;
      this.bd = this.be;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)azj.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = azj.e(azj.h(this.dN()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aO > 0.0F) {
         $$5 = this.dN();
      }

      if (!this.aJ()) {
         $$7 = 0.0F;
      }

      this.be = this.be + ($$7 - this.be) * 0.3F;
      this.dX().ah().a("headTurn");
      $$6 = this.f($$5, $$6);
      this.dX().ah().c();
      this.dX().ah().a("rangeChecks");

      while (this.dN() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dN() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aU - this.aV < -180.0F) {
         this.aV -= 360.0F;
      }

      while (this.aU - this.aV >= 180.0F) {
         this.aV += 360.0F;
      }

      while (this.dP() - this.P < -180.0F) {
         this.P -= 360.0F;
      }

      while (this.dP() - this.P >= 180.0F) {
         this.P += 360.0F;
      }

      while (this.aW - this.aX < -180.0F) {
         this.aX -= 360.0F;
      }

      while (this.aW - this.aX >= 180.0F) {
         this.aX += 360.0F;
      }

      this.dX().ah().c();
      this.bf += $$6;
      if (this.fL()) {
         this.by++;
      } else {
         this.by = 0;
      }

      if (this.fT()) {
         this.w(0.0F);
      }

      this.D();
      float $$10 = this.el();
      if ($$10 != this.bD) {
         this.bD = $$10;
         this.j_();
      }

      this.aY.a();
   }

   private void J() {
      Map<buh, cvx> $$0 = this.K();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<buh, cvx> K() {
      Map<buh, cvx> $$0 = null;

      for (buh $$1 : buh.i) {
         cvx $$2 = switch ($$1.a()) {
            case a -> this.h($$1);
            case b -> this.g($$1);
            case c -> this.bV;
         };
         cvx $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(buh.class);
            }

            $$0.put($$1, $$3);
            bwa $$4 = this.fa();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<buh, cvx> $$5 : $$0.entrySet()) {
            buh $$6 = $$5.getKey();
            cvx $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1) -> {
                  bvz $$2 = this.bQ.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1.b());
                     $$2.b($$1);
                  }
               });
               if (this.dX() instanceof arm $$8) {
                  dbo.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(cvx $$0, cvx $$1) {
      return !cvx.a($$1, $$0);
   }

   private void a(Map<buh, cvx> $$0) {
      cvx $$1 = $$0.get(buh.a);
      cvx $$2 = $$0.get(buh.b);
      if ($$1 != null && $$2 != null && cvx.a($$1, this.h(buh.b)) && cvx.a($$2, this.h(buh.a))) {
         ((arm)this.dX()).l().b(this, new adh(this, (byte)55));
         $$0.remove(buh.a);
         $$0.remove(buh.b);
         this.c(buh.a, $$1.v());
         this.c(buh.b, $$2.v());
      }
   }

   private void b(Map<buh, cvx> $$0) {
      List<Pair<buh, cvx>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cvx $$3 = $$2.v();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
               break;
            case c:
               this.bV = $$3;
         }
      });
      ((arm)this.dX()).l().b(this, new afm(this.ar(), $$1));
   }

   private cvx g(buh $$0) {
      return this.bU.get($$0.b());
   }

   private void b(buh $$0, cvx $$1) {
      this.bU.set($$0.b(), $$1);
   }

   private cvx h(buh $$0) {
      return this.bT.get($$0.b());
   }

   private void c(buh $$0, cvx $$1) {
      this.bT.set($$0.b(), $$1);
   }

   protected float f(float $$0, float $$1) {
      float $$2 = azj.h($$0 - this.aU);
      this.aU += $$2 * 0.3F;
      float $$3 = azj.h(this.dN() - this.aU);
      float $$4 = this.fs();
      if (Math.abs($$3) > $$4) {
         this.aU = this.aU + ($$3 - (float)azj.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float fs() {
      return 50.0F;
   }

   public void n_() {
      if (this.cd > 0) {
         this.cd--;
      }

      if (this.dj()) {
         this.bo = 0;
         this.f(this.dC(), this.dE(), this.dI());
      }

      if (this.bo > 0) {
         this.a(this.bo, this.bp, this.bq, this.br, this.bs, this.bt);
         this.bo--;
      } else if (!this.dk()) {
         this.h(this.dA().c(0.98));
      }

      if (this.bv > 0) {
         this.a(this.bv, this.bu);
         this.bv--;
      }

      ezh $$0 = this.dA();
      double $$1 = $$0.d;
      double $$2 = $$0.e;
      double $$3 = $$0.f;
      if (Math.abs($$0.d) < 0.003) {
         $$1 = 0.0;
      }

      if (Math.abs($$0.e) < 0.003) {
         $$2 = 0.0;
      }

      if (Math.abs($$0.f) < 0.003) {
         $$3 = 0.0;
      }

      this.n($$1, $$2, $$3);
      this.dX().ah().a("ai");
      if (this.fk()) {
         this.bk = false;
         this.bl = 0.0F;
         this.bn = 0.0F;
      } else if (this.dk()) {
         this.dX().ah().a("newAi");
         this.fw();
         this.dX().ah().c();
      }

      this.dX().ah().c();
      this.dX().ah().a("jump");
      if (this.bk && this.em()) {
         double $$4;
         if (this.by()) {
            $$4 = this.b(axf.b);
         } else {
            $$4 = this.b(axf.a);
         }

         boolean $$6 = this.bk() && $$4 > 0.0;
         double $$7 = this.dr();
         if (!$$6 || this.aJ() && !($$4 > $$7)) {
            if (!this.by() || this.aJ() && !($$4 > $$7)) {
               if ((this.aJ() || $$6 && $$4 <= $$7) && this.cd == 0) {
                  this.v();
                  this.cd = 10;
               }
            } else {
               this.c(axf.b);
            }
         } else {
            this.c(axf.a);
         }
      } else {
         this.cd = 0;
      }

      this.dX().ah().c();
      this.dX().ah().a("travel");
      this.bl *= 0.98F;
      this.bn *= 0.98F;
      if (this.fL()) {
         this.fu();
      }

      ezc $$8 = this.cS();
      ezh $$9 = new ezh((double)this.bl, (double)this.bm, (double)this.bn);
      if (this.b(btg.B) || this.b(btg.y)) {
         this.n();
      }

      label115: {
         if (this.cY() instanceof coh $$10 && this.bM()) {
            this.c($$10, $$9);
            break label115;
         }

         this.a_($$9);
      }

      if (!this.dX().y_() || this.dj()) {
         this.aK();
      }

      this.s(this instanceof cgv);
      this.dX().ah().c();
      this.dX().ah().a("freezing");
      if (!this.dX().C && !this.eH()) {
         int $$11 = this.cv();
         if (this.aw && this.dL()) {
            this.k(Math.min(this.cy(), $$11 + 1));
         } else {
            this.k(Math.max(0, $$11 - 2));
         }
      }

      this.ei();
      this.ej();
      if (!this.dX().C && this.ag % 40 == 0 && this.cx() && this.dL()) {
         this.a(this.dY().v(), 1.0F);
      }

      this.dX().ah().c();
      this.dX().ah().a("push");
      if (this.bz > 0) {
         this.bz--;
         this.a($$8, this.cS());
      }

      this.r();
      this.dX().ah().c();
      if (!this.dX().C && this.ft() && this.bm()) {
         this.a(this.dY().i(), 1.0F);
      }
   }

   public boolean ft() {
      return false;
   }

   protected void fu() {
      this.cz();
      if (!this.dX().C) {
         if (!this.fv()) {
            this.b(7, false);
            return;
         }

         int $$0 = this.by + 1;
         if ($$0 % 10 == 0) {
            int $$1 = $$0 / 10;
            if ($$1 % 2 == 0) {
               List<buh> $$2 = buh.i.stream().filter($$0x -> b(this.a($$0x), $$0x)).toList();
               buh $$3 = ad.a($$2, this.af);
               this.a($$3).a(1, this, $$3);
            }

            this.a(eaa.n);
         }
      }
   }

   protected boolean fv() {
      if (!this.aJ() && !this.ca() && !this.b(btg.y)) {
         for (buh $$0 : buh.i) {
            if (b(this.a($$0), $$0)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   protected void fw() {
   }

   protected void r() {
      if (this.dX().y_()) {
         this.dX().a(dzo.a(coh.class), this.cS(), bue.a(this)).forEach(this::F);
      } else {
         List<btz> $$0 = this.dX().a(this, this.cS(), bue.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dX().ac().c(der.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.af.a(4) == 0) {
               int $$2 = 0;

               for (btz $$3 : $$0) {
                  if (!$$3.ca()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dY().h(), 6.0F);
               }
            }

            for (btz $$4 : $$0) {
               this.F($$4);
            }
         }
      }
   }

   protected void a(ezc $$0, ezc $$1) {
      ezc $$2 = $$0.b($$1);
      List<btz> $$3 = this.dX().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (btz $$4 : $$3) {
            if ($$4 instanceof buv) {
               this.g((buv)$$4);
               this.bz = 0;
               this.h(this.dA().c(-0.2));
               break;
            }
         }
      } else if (this.Q) {
         this.bz = 0;
      }

      if (!this.dX().C && this.bz <= 0) {
         this.c(4, false);
         this.bA = 0.0F;
         this.bB = null;
      }
   }

   protected void F(btz $$0) {
      $$0.h(this);
   }

   protected void g(buv $$0) {
   }

   public boolean fx() {
      return (this.am.a(aA) & 4) != 0;
   }

   @Override
   public void af() {
      btz $$0 = this.dl();
      super.af();
      if ($$0 != null && $$0 != this.dl() && !this.dX().C) {
         this.d($$0);
      }
   }

   @Override
   public void u() {
      super.u();
      this.bd = this.be;
      this.be = 0.0F;
      this.n();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.bp = $$0;
      this.bq = $$1;
      this.br = $$2;
      this.bs = (double)$$3;
      this.bt = (double)$$4;
      this.bo = $$5;
   }

   @Override
   public double d_() {
      return this.bo > 0 ? this.bp : this.dC();
   }

   @Override
   public double e_() {
      return this.bo > 0 ? this.bq : this.dE();
   }

   @Override
   public double P_() {
      return this.bo > 0 ? this.br : this.dI();
   }

   @Override
   public float Q_() {
      return this.bo > 0 ? (float)this.bt : this.dP();
   }

   @Override
   public float f_() {
      return this.bo > 0 ? (float)this.bs : this.dN();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bu = (double)$$0;
      this.bv = $$1;
   }

   public void t(boolean $$0) {
      this.bk = $$0;
   }

   public void a(ckq $$0) {
      btz $$1 = $$0.s();
      if ($$1 instanceof arn) {
         an.R.a((arn)$$1, $$0.m(), this);
      }
   }

   public void a(btz $$0, int $$1) {
      if (!$$0.dS() && !this.dX().C && ($$0 instanceof ckq || $$0 instanceof cop || $$0 instanceof bul)) {
         ((arm)this.dX()).l().b($$0, new agh($$0.ar(), this.ar(), $$1));
      }
   }

   public boolean G(btz $$0) {
      if ($$0.dX() != this.dX()) {
         return false;
      } else {
         ezh $$1 = new ezh(this.dC(), this.dG(), this.dI());
         ezh $$2 = new ezh($$0.dC(), $$0.dG(), $$0.dI());
         return $$2.f($$1) > 128.0 ? false : this.dX().a(new ded($$1, $$2, ded.a.a, ded.b.a, this)).d() == ezf.a.a;
      }
   }

   @Override
   public float i(float $$0) {
      return $$0 == 1.0F ? this.aW : azj.h($$0, this.aX, this.aW);
   }

   public float D(float $$0) {
      float $$1 = this.aO - this.aN;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aN + $$1 * $$0;
   }

   @Override
   public boolean bI() {
      return !this.dS();
   }

   @Override
   public boolean bJ() {
      return this.bM() && !this.R_() && !this.q_();
   }

   @Override
   public float cB() {
      return this.aW;
   }

   @Override
   public void q(float $$0) {
      this.aW = $$0;
   }

   @Override
   public void r(float $$0) {
      this.aU = $$0;
   }

   @Override
   public ezh a(jl.a $$0, l.a $$1) {
      return j(super.a($$0, $$1));
   }

   public static ezh j(ezh $$0) {
      return new ezh($$0.d, $$0.e, 0.0);
   }

   public float fy() {
      return this.ce;
   }

   public final void E(float $$0) {
      this.F(azj.a($$0, 0.0F, this.eW()));
   }

   protected void F(float $$0) {
      this.ce = $$0;
   }

   public void g_() {
   }

   public void h_() {
   }

   protected void fz() {
      this.bX = true;
   }

   public abstract bup fA();

   public boolean fB() {
      return (this.am.a(aA) & 1) > 0;
   }

   public brx fC() {
      return (this.am.a(aA) & 2) > 0 ? brx.b : brx.a;
   }

   private void M() {
      if (this.fB()) {
         if (cvx.b(this.b(this.fC()), this.bw)) {
            this.bw = this.b(this.fC());
            this.a(this.bw);
         } else {
            this.fH();
         }
      }
   }

   protected void a(cvx $$0) {
      $$0.b(this.dX(), this, this.fE());
      if (--this.bx == 0 && !this.dX().C && !$$0.x()) {
         this.z();
      }
   }

   private void O() {
      this.ck = this.cj;
      if (this.cm()) {
         this.cj = Math.min(1.0F, this.cj + 0.09F);
      } else {
         this.cj = Math.max(0.0F, this.cj - 0.09F);
      }
   }

   protected void c(int $$0, boolean $$1) {
      int $$2 = this.am.a(aA);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.am.a(aA, (byte)$$2);
   }

   public void c(brx $$0) {
      cvx $$1 = this.b($$0);
      if (!$$1.f() && !this.fB()) {
         this.bw = $$1;
         this.bx = $$1.a(this);
         if (!this.dX().C) {
            this.c(1, true);
            this.c(2, $$0 == brx.b);
            this.a(eaa.D);
         }
      }
   }

   @Override
   public void a(akk<?> $$0) {
      super.a($$0);
      if (bO.equals($$0)) {
         if (this.dX().C) {
            this.fR().ifPresent(this::a);
         }
      } else if (aA.equals($$0) && this.dX().C) {
         if (this.fB() && this.bw.f()) {
            this.bw = this.b(this.fC());
            if (!this.bw.f()) {
               this.bx = this.bw.a(this);
            }
         } else if (!this.fB() && !this.bw.f()) {
            this.bw = cvx.k;
            this.bx = 0;
         }
      }
   }

   @Override
   public void a(fh.a $$0, ezh $$1) {
      super.a($$0, $$1);
      this.aX = this.aW;
      this.aU = this.aW;
      this.aV = this.aU;
   }

   @Override
   public float t(float $$0) {
      return azj.h($$0, this.aV, this.aU);
   }

   public void b(cvx $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ezh $$3 = new ezh(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dP() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dN() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.af.i()) * 0.6 - 0.3;
         ezh $$5 = new ezh(((double)this.af.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dP() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dN() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dC(), this.dG(), this.dI());
         this.dX().a(new lm(lq.S, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void z() {
      if (!this.dX().C || this.fB()) {
         brx $$0 = this.fC();
         if (!this.bw.equals(this.b($$0))) {
            this.fG();
         } else {
            if (!this.bw.f() && this.fB()) {
               cvx $$1 = this.bw.a(this.dX(), this);
               if ($$1 != this.bw) {
                  this.a($$0, $$1);
               }

               this.fH();
            }
         }
      }
   }

   public cvx fD() {
      return this.bw;
   }

   public int fE() {
      return this.bx;
   }

   public int fF() {
      return this.fB() ? this.bw.a(this) - this.fE() : 0;
   }

   public void fG() {
      if (!this.bw.f()) {
         this.bw.a(this.dX(), this, this.fE());
         if (this.bw.x()) {
            this.M();
         }
      }

      this.fH();
   }

   public void fH() {
      if (!this.dX().C) {
         boolean $$0 = this.fB();
         this.c(1, false);
         if ($$0) {
            this.a(eaa.C);
         }
      }

      this.bw = cvx.k;
      this.bx = 0;
   }

   public boolean fI() {
      return this.fJ() != null;
   }

   @Nullable
   public cvx fJ() {
      if (this.fB() && !this.bw.f()) {
         cvt $$0 = this.bw.h();
         if ($$0.a(this.bw) != cvz.d) {
            return null;
         } else {
            return $$0.a(this.bw, this) - this.bx < 5 ? null : this.bw;
         }
      } else {
         return null;
      }
   }

   public boolean fK() {
      return this.ce();
   }

   public boolean fL() {
      return this.i(7);
   }

   @Override
   public boolean cm() {
      return super.cm() || !this.fL() && this.c(bvh.b);
   }

   public int fM() {
      return this.by;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dC();
      double $$5 = this.dE();
      double $$6 = this.dI();
      double $$7 = $$1;
      boolean $$8 = false;
      jg $$9 = jg.a($$0, $$1, $$2);
      dev $$10 = this.dX();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.I_()) {
            jg $$12 = $$9.e();
            dvd $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.c($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cS())) {
               $$8 = true;
            }
         }
      }

      if (!$$8) {
         this.c($$4, $$5, $$6);
         return false;
      } else {
         if ($$3) {
            $$10.a(this, (byte)46);
         }

         if (this instanceof bvd $$14) {
            $$14.P().o();
         }

         return true;
      }
   }

   public boolean fN() {
      return !this.eH();
   }

   public boolean fO() {
      return true;
   }

   public void a(jg $$0, boolean $$1) {
   }

   public boolean fP() {
      return false;
   }

   @Override
   public final buc a(bvh $$0) {
      return $$0 == bvh.c ? aB : this.e($$0).a(this.el());
   }

   protected buc e(bvh $$0) {
      return this.aq().n().a(this.ek());
   }

   public ImmutableList<bvh> fQ() {
      return ImmutableList.of(bvh.a);
   }

   public ezc f(bvh $$0) {
      buc $$1 = this.a($$0);
      return new ezc((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bvh $$0) {
      ezc $$1 = this.a($$0).a(this.dv());
      return this.dX().b(this, $$1);
   }

   @Override
   public boolean o(boolean $$0) {
      return super.o($$0) && !this.fT();
   }

   public Optional<jg> fR() {
      return this.am.a(bO);
   }

   public void g(jg $$0) {
      this.am.a(bO, Optional.of($$0));
   }

   public void fS() {
      this.am.a(bO, Optional.empty());
   }

   public boolean fT() {
      return this.fR().isPresent();
   }

   public void b(jg $$0) {
      if (this.ca()) {
         this.af();
      }

      dvd $$1 = this.dX().a_($$0);
      if ($$1.b() instanceof dhr) {
         this.dX().a($$0, $$1.b(dhr.c, Boolean.valueOf(true)), 3);
      }

      this.b(bvh.c);
      this.a($$0);
      this.g($$0);
      this.h(ezh.c);
      this.as = true;
   }

   private void a(jg $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean P() {
      return this.fR().map($$0 -> this.dX().a_($$0).b() instanceof dhr).orElse(false);
   }

   public void fU() {
      this.fR().filter(this.dX()::B).ifPresent($$0x -> {
         dvd $$1 = this.dX().a_($$0x);
         if ($$1.b() instanceof dhr) {
            jl $$2 = $$1.c(dhr.aF);
            this.dX().a($$0x, $$1.b(dhr.c, Boolean.valueOf(false)), 3);
            ezh $$3 = dhr.a(this.aq(), this.dX(), $$0x, $$2, this.dN()).orElseGet(() -> {
               jg $$1x = $$0x.d();
               return new ezh((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            ezh $$4 = ezh.c($$0x).d($$3).d();
            float $$5 = (float)azj.d(azj.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.v($$5);
            this.w(0.0F);
         }
      });
      ezh $$0 = this.dv();
      this.b(bvh.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fS();
   }

   @Nullable
   public jl fV() {
      jg $$0 = this.fR().orElse(null);
      return $$0 != null ? dhr.a(this.dX(), $$0) : null;
   }

   @Override
   public boolean bN() {
      return !this.fT() && super.bN();
   }

   public cvx d(cvx $$0) {
      return cvx.k;
   }

   private static byte i(buh $$0) {
      return switch ($$0) {
         case a -> 47;
         case b -> 48;
         case f -> 49;
         case e -> 50;
         case c -> 52;
         case d -> 51;
         case g -> 65;
      };
   }

   public void a(cvt $$0, buh $$1) {
      this.dX().a(this, i($$1));
      this.a(this.a($$1), $$1, this.bQ);
   }

   private void a(cvx $$0, buh $$1, bwa $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         bvz $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      dbo.a($$0, this, $$1);
   }

   public static buh d(brx $$0) {
      return $$0 == brx.a ? buh.a : buh.b;
   }

   public final boolean e(cvx $$0) {
      if (this.bM() && !this.R_()) {
         ddh $$1 = $$0.a(kt.D);
         if ($$1 != null && $$1.e()) {
            buh $$2 = $$1.a();
            return this.e($$2) && $$1.a(this.aq()) ? this.a($$2).f() && this.f($$2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected boolean f(buh $$0) {
      return true;
   }

   public final buh f(cvx $$0) {
      ddh $$1 = $$0.a(kt.D);
      return $$1 != null && this.e($$1.a()) ? $$1.a() : buh.a;
   }

   public final boolean a(cvx $$0, buh $$1) {
      ddh $$2 = $$0.a(kt.D);
      return $$2 == null ? $$1 == buh.a && this.e(buh.a) : $$1 == $$2.a() && this.e($$2.a()) && $$2.a(this.aq());
   }

   private static bvn a(buv $$0, buh $$1) {
      return $$1 != buh.f && $$1 != buh.a && $$1 != buh.b ? bvn.a($$0, $$1, $$2 -> $$2.f() || $$0.f($$2) == $$1) : bvn.a($$0, $$1);
   }

   @Nullable
   private static buh s(int $$0) {
      if ($$0 == 100 + buh.f.b()) {
         return buh.f;
      } else if ($$0 == 100 + buh.e.b()) {
         return buh.e;
      } else if ($$0 == 100 + buh.d.b()) {
         return buh.d;
      } else if ($$0 == 100 + buh.c.b()) {
         return buh.c;
      } else if ($$0 == 98) {
         return buh.a;
      } else if ($$0 == 99) {
         return buh.b;
      } else {
         return $$0 == 105 ? buh.g : null;
      }
   }

   @Override
   public bvn a_(int $$0) {
      buh $$1 = s($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dL() {
      if (this.R_()) {
         return false;
      } else {
         boolean $$0 = !this.a(buh.f).a(axi.bn) && !this.a(buh.e).a(axi.bn) && !this.a(buh.d).a(axi.bn) && !this.a(buh.c).a(axi.bn) && !this.a(buh.g).a(axi.bn);
         return $$0 && super.dL();
      }
   }

   @Override
   public boolean cp() {
      return !this.dX().y_() && this.b(btg.x) || super.cp();
   }

   @Override
   public float dO() {
      return this.aU;
   }

   @Override
   public void a(ace $$0) {
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      float $$4 = $$0.n();
      float $$5 = $$0.m();
      this.f($$1, $$2, $$3);
      this.aU = $$0.o();
      this.aW = $$0.o();
      this.aV = this.aU;
      this.aX = this.aW;
      this.e($$0.b());
      this.a_($$0.e());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.n($$0.j(), $$0.k(), $$0.l());
   }

   public boolean fW() {
      return this.eb().h() instanceof cty;
   }

   @Override
   public float dR() {
      float $$0 = (float)this.h(bwd.B);
      return this.cY() instanceof coh ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public ezh m(btz $$0) {
      return this.dv().e(this.a($$0, this.a(this.ax()), this.el() * this.ek()));
   }

   protected void a(int $$0, double $$1) {
      this.aW = (float)azj.e(1.0 / (double)$$0, (double)this.aW, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(azj.c((double)$$0 * this.h(bwd.h)));
   }

   public boolean fX() {
      return false;
   }

   @Override
   public boolean b(bsp $$0) {
      if (super.b($$0)) {
         return true;
      } else {
         if (this.dX() instanceof arm $$1 && dbo.a($$1, this, $$0)) {
            return true;
         }

         return false;
      }
   }

   public static boolean b(cvx $$0, buh $$1) {
      if (!$$0.b(kt.F)) {
         return false;
      } else {
         ddh $$2 = $$0.a(kt.D);
         return $$2 != null && $$1 == $$2.a() && !$$0.r();
      }
   }

   @VisibleForTesting
   public int fY() {
      return this.ba;
   }

   public static record a(awj a, awj b) {
   }
}
