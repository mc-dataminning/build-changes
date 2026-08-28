import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
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
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public abstract class bxu extends bwt implements bwm {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "active_effects";
   private static final ali c = ali.b("powder_snow");
   private static final ali d = ali.b("sprinting");
   private static final byy e = new byy(d, 0.3F, byy.a.c);
   public static final int l = 98;
   public static final int m = 100;
   public static final int n = 105;
   public static final int o = 106;
   public static final int p = 6;
   public static final int q = 100;
   private static final int bu = 40;
   public static final double r = 0.003;
   public static final double s = 0.08;
   public static final int t = 20;
   protected static final float u = 0.98F;
   private static final int bv = 10;
   private static final int bw = 2;
   public static final float ay = 0.42F;
   private static final double bx = 128.0;
   protected static final int az = 1;
   protected static final int aA = 2;
   protected static final int aB = 4;
   protected static final akl<Byte> aC = akp.a(bxu.class, akn.a);
   private static final akl<Float> by = akp.a(bxu.class, akn.d);
   private static final akl<List<lw>> bz = akp.a(bxu.class, akn.m);
   private static final akl<Boolean> bA = akp.a(bxu.class, akn.k);
   private static final akl<Integer> bB = akp.a(bxu.class, akn.b);
   private static final akl<Integer> bC = akp.a(bxu.class, akn.b);
   private static final akl<Optional<iv>> bD = akp.a(bxu.class, akn.p);
   private static final int bE = 15;
   protected static final bww aD = bww.c(0.2F, 0.2F).b(0.2F);
   public static final float aE = 0.5F;
   public static final float aF = 0.5F;
   public static final String aG = "attributes";
   public static final Predicate<bxu> aH = $$0 -> {
      if ($$0 instanceof crx $$1) {
         czy $$3 = $$1.a(bxd.f);
         return !$$3.a(axm.cs);
      } else {
         return true;
      }
   };
   private final byx bF;
   private final bvf bG = new bvf(this);
   private final Map<jf<bvv>, bvx> bH = Maps.newHashMap();
   private final Map<bxd, czy> bI = ag.a(bxd.class, $$0x -> czy.k);
   public boolean aI;
   private boolean bJ = false;
   public buq aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public float aQ;
   public float aR;
   protected int aS;
   public final byt aT = new byt();
   public final int aU = 20;
   public float aV;
   public float aW;
   public float aX;
   public float aY;
   public final bws aZ = new bws(this);
   @Nullable
   protected bwz<crx> ba;
   protected int bb;
   protected boolean bc;
   protected int bd;
   protected float be;
   protected boolean bf;
   public float bg;
   public float bh;
   public float bi;
   protected bxp bj = new bxp(this);
   protected double bk;
   protected int bl;
   private boolean bK = true;
   @Nullable
   private bwz<bxu> bL;
   private int bM;
   @Nullable
   private bxu bN;
   private int bO;
   private float bP;
   private int bQ;
   private float bR;
   protected czy bm = czy.k;
   protected int bn;
   protected int bo;
   private iv bS;
   private Optional<iv> bT = Optional.empty();
   @Nullable
   private bvi bU;
   private long bV;
   protected int bp;
   protected float bq;
   @Nullable
   protected czy br;
   private float bW;
   private float bX;
   protected byu<?> bs;
   private boolean bY;
   private final EnumMap<bxd, Reference2ObjectMap<dgl, Set<dhd>>> bZ = new EnumMap<>(bxd.class);
   protected final bwx bt;

   protected bxu(bxc<? extends bxu> $$0, djx $$1) {
      super($$0, $$1);
      this.bF = new byx(bzb.a($$0));
      this.d(this.eU());
      this.bt = this.eb();
      this.I = true;
      this.av();
      this.w((float)(Math.random() * (float) (Math.PI * 2)));
      this.aX = this.dL();
      un $$2 = un.a;
      this.bs = this.a(new Dynamic($$2, (uy)$$2.createMap(ImmutableMap.of($$2.a("memories"), (uy)$$2.emptyMap()))));
   }

   @Contract(
      pure = true
   )
   protected bwx eb() {
      return new bwx();
   }

   public byu<?> ec() {
      return this.bs;
   }

   protected byu.b<?> ed() {
      return byu.a(ImmutableList.of(), ImmutableList.of());
   }

   protected byu<?> a(Dynamic<?> $$0) {
      return this.ed().a($$0);
   }

   @Override
   public void c(ars $$0) {
      this.a($$0, this.dW().y(), Float.MAX_VALUE);
   }

   public boolean a(bxc<?> $$0) {
      return true;
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(aC, (byte)0);
      $$0.a(bz, List.of());
      $$0.a(bA, false);
      $$0.a(bB, 0);
      $$0.a(bC, 0);
      $$0.a(by, 1.0F);
      $$0.a(bD, Optional.empty());
   }

   public static byz.a ee() {
      return byz.a()
         .a(bza.s)
         .a(bza.p)
         .a(bza.v)
         .a(bza.a)
         .a(bza.b)
         .a(bza.r)
         .a(bza.B)
         .a(bza.y)
         .a(bza.n)
         .a(bza.x)
         .a(bza.k)
         .a(bza.o)
         .a(bza.w)
         .a(bza.h)
         .a(bza.i)
         .a(bza.F)
         .a(bza.u)
         .a(bza.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, ebe $$2, iv $$3) {
      if (!this.bi()) {
         this.bp();
      }

      if (this.dV() instanceof ars $$4 && $$1 && this.Z > 0.0) {
         this.b($$4, $$3);
         double $$5 = (double)Math.max(0, azo.a(this.h(this.Z)));
         if ($$5 > 0.0 && !$$2.l()) {
            double $$6 = this.dA();
            double $$7 = this.dC();
            double $$8 = this.dG();
            iv $$9 = this.dv();
            if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
               double $$10 = $$6 - (double)$$3.u() - 0.5;
               double $$11 = $$8 - (double)$$3.w() - 0.5;
               double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
               $$6 = (double)$$3.u() + 0.5 + $$10 / $$12 * 0.5;
               $$8 = (double)$$3.w() + 0.5 + $$11 / $$12 * 0.5;
            }

            double $$13 = Math.min(0.2F + $$5 / 15.0, 2.5);
            int $$14 = (int)(150.0 * $$13);
            $$4.a(new lq(ly.b, $$2), $$6, $$7, $$8, $$14, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.bT = Optional.empty();
      }
   }

   public final boolean ef() {
      return this.an().a(axh.m);
   }

   public float a(float $$0) {
      return azo.h($$0, this.bX, this.bW);
   }

   public boolean eg() {
      return this.dy().b() < 1.0E-5F && this.bl();
   }

   @Override
   public void aw() {
      this.aQ = this.aR;
      if (this.ak) {
         this.fP().ifPresent(this::a);
      }

      if (this.dV() instanceof ars $$0) {
         dgn.b($$0, this);
      }

      super.aw();
      brb $$1 = bra.a();
      $$1.a("livingEntityBaseTick");
      if (this.bh() || this.dV().C) {
         this.aF();
      }

      if (this.bJ() && this.dV() instanceof ars $$2) {
         boolean $$3 = this instanceof crx;
         if (this.bK()) {
            this.a($$2, this.dW().g(), 1.0F);
         } else if ($$3 && !$$2.E_().a(this.cR())) {
            double $$4 = $$2.E_().a(this) + $$2.E_().n();
            if ($$4 < 0.0) {
               double $$5 = $$2.E_().o();
               if ($$5 > 0.0) {
                  this.a($$2, this.dW().x(), (float)Math.max(1, azo.a(-$$4 * $$5)));
               }
            }
         }

         if (this.a(axj.a) && !$$2.a_(iv.a(this.dA(), this.dE(), this.dG())).a(dne.nJ)) {
            boolean $$6 = !this.ef() && !bvy.c(this) && (!$$3 || !((crx)this).gk().a);
            if ($$6) {
               this.j(this.l(this.cs()));
               if (this.cs() == -20) {
                  this.j(0);
                  $$2.a(this, (byte)67);
                  this.a($$2, this.dW().i(), 2.0F);
               }
            } else if (this.cs() < this.cr()) {
               this.j(this.m(this.cs()));
            }

            if (this.bY() && this.dk() != null && this.dk().ca()) {
               this.bO();
            }
         } else if (this.cs() < this.cr()) {
            this.j(this.m(this.cs()));
         }

         iv $$7 = this.dv();
         if (!Objects.equal(this.bS, $$7)) {
            this.bS = $$7;
            this.b($$2, $$7);
         }
      }

      if (this.bJ() && this.bj()) {
         this.aM();
      }

      if (this.aN > 0) {
         this.aN--;
      }

      if (this.aj > 0 && !(this instanceof art)) {
         this.aj--;
      }

      if (this.eH() && this.dV().h(this)) {
         this.en();
      }

      if (this.bb > 0) {
         this.bb--;
      } else {
         this.ba = null;
      }

      if (this.bN != null && !this.bN.bJ()) {
         this.bN = null;
      }

      bxu $$8 = this.er();
      if ($$8 != null) {
         if (!$$8.bJ()) {
            this.a(null);
         } else if (this.af - this.bM > 100) {
            this.a(null);
         }
      }

      this.ey();
      this.aY = this.aX;
      this.aW = this.aV;
      this.N = this.dL();
      this.O = this.dN();
      $$1.c();
   }

   @Override
   protected float aS() {
      return azo.h((float)this.h(bza.u), super.aS(), 1.0F);
   }

   public float eh() {
      return 0.0F;
   }

   protected void ei() {
      byw $$0 = this.g(bza.v);
      if ($$0 != null) {
         if ($$0.a(c) != null) {
            $$0.c(c);
         }
      }
   }

   protected void ej() {
      if (!this.br().l()) {
         int $$0 = this.cu();
         if ($$0 > 0) {
            byw $$1 = this.g(bza.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cv();
            $$1.b(new byy(c, (double)$$2, byy.a.a));
         }
      }
   }

   protected void b(ars $$0, iv $$1) {
      dgn.a($$0, this);
   }

   public boolean n_() {
      return false;
   }

   public float ek() {
      return this.n_() ? 0.5F : 1.0F;
   }

   public final float el() {
      byx $$0 = this.fa();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bza.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   public boolean em() {
      return true;
   }

   protected void en() {
      this.aP++;
      if (this.aP >= 20 && !this.dV().A_() && !this.dQ()) {
         this.dV().a(this, (byte)60);
         this.a(bwt.d.a);
      }
   }

   public boolean eo() {
      return !this.n_();
   }

   protected boolean ep() {
      return !this.n_();
   }

   protected int l(int $$0) {
      byw $$1 = this.g(bza.w);
      double $$2;
      if ($$1 != null) {
         $$2 = $$1.g();
      } else {
         $$2 = 0.0;
      }

      return $$2 > 0.0 && this.ae.j() >= 1.0 / ($$2 + 1.0) ? $$0 : $$0 - 1;
   }

   protected int m(int $$0) {
      return Math.min($$0 + 4, this.cr());
   }

   public final int a(ars $$0, @Nullable bwt $$1) {
      return dgn.a($$0, $$1, this, this.e($$0));
   }

   protected int e(ars $$0) {
      return 0;
   }

   protected boolean eq() {
      return false;
   }

   @Nullable
   public bxu er() {
      return bwz.a(this.bL, this.dV(), bxu.class);
   }

   @Nullable
   public crx es() {
      return bwz.a(this.ba, this.dV(), crx.class);
   }

   @Override
   public bxu aj() {
      return this.er();
   }

   public int et() {
      return this.bM;
   }

   public void a(crx $$0, int $$1) {
      this.a(new bwz<>($$0), $$1);
   }

   public void a(UUID $$0, int $$1) {
      this.a(new bwz<>($$0), $$1);
   }

   private void a(bwz<crx> $$0, int $$1) {
      this.ba = $$0;
      this.bb = $$1;
   }

   public void a(@Nullable bxu $$0) {
      this.bL = $$0 != null ? new bwz<>($$0) : null;
      this.bM = this.af;
   }

   @Nullable
   public bxu eu() {
      return this.bN;
   }

   public int ev() {
      return this.bO;
   }

   public void B(bwt $$0) {
      if ($$0 instanceof bxu) {
         this.bN = (bxu)$$0;
      } else {
         this.bN = null;
      }

      this.bO = this.af;
   }

   public int ew() {
      return this.bd;
   }

   public void n(int $$0) {
      this.bd = $$0;
   }

   public boolean ex() {
      return this.bJ;
   }

   public void q(boolean $$0) {
      this.bJ = $$0;
   }

   protected boolean b(bxd $$0) {
      return true;
   }

   public void a(bxd $$0, czy $$1, czy $$2) {
      if (!this.dV().A_() && !this.Z_()) {
         if (!czy.c($$1, $$2) && !this.ak) {
            dih $$3 = $$2.a(kk.D);
            if (!this.ba() && $$3 != null && $$0 == $$3.b()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), this.a($$0, $$2, $$3), this.dm(), 1.0F, 1.0F, this.ae.g());
            }

            if (this.b($$0)) {
               this.a($$3 != null ? ege.v : ege.S);
            }
         }
      }
   }

   protected jf<awo> a(bxd $$0, czy $$1, dih $$2) {
      return $$2.c();
   }

   @Override
   public void a(bwt.d $$0) {
      if (($$0 == bwt.d.a || $$0 == bwt.d.b) && this.dV() instanceof ars $$1) {
         this.a($$1, $$0);
      }

      super.a($$0);
      this.bs.a();
   }

   protected void a(ars $$0, bwt.d $$1) {
      for (bvx $$2 : this.eD()) {
         $$2.a($$0, this, $$1);
      }

      this.bH.clear();
   }

   @Override
   public void b(tz $$0) {
      $$0.a("Health", this.eG());
      $$0.a("HurtTime", (short)this.aN);
      $$0.a("HurtByTimestamp", this.bM);
      $$0.a("DeathTime", (short)this.aP);
      $$0.a("AbsorptionAmount", this.fw());
      $$0.a("attributes", this.fa().d());
      alg<uy> $$1 = this.dX().a(un.a);
      if (!this.bH.isEmpty()) {
         $$0.a("active_effects", bvx.d.listOf(), $$1, List.copyOf(this.bH.values()));
      }

      $$0.a("FallFlying", this.fJ());
      this.fP().ifPresent($$1x -> $$0.a("sleeping_pos", iv.a, $$1x));
      DataResult<uy> $$2 = this.bs.a(un.a);
      $$2.resultOrPartial(a::error).ifPresent($$1x -> $$0.a("Brain", $$1x));
      if (this.ba != null) {
         this.ba.a($$0, "last_hurt_by_player");
         $$0.a("last_hurt_by_player_memory_time", this.bb);
      }

      if (this.bL != null) {
         this.bL.a($$0, "last_hurt_by_mob");
         $$0.a("ticks_since_last_hurt_by_mob", this.af - this.bM);
      }

      if (!this.bt.a()) {
         $$0.a("equipment", bwx.a, $$1, this.bt);
      }
   }

   @Nullable
   public coc a(czy $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else if (this.dV().C) {
         this.a(buq.a);
         return null;
      } else {
         coc $$3 = this.b($$0, $$1, $$2);
         if ($$3 != null) {
            this.dV().b($$3);
         }

         return $$3;
      }
   }

   @Override
   public void a(tz $$0) {
      this.F($$0.b("AbsorptionAmount", 0.0F));
      if (this.dV() != null && !this.dV().C) {
         $$0.o("attributes").ifPresent(this.fa()::a);
      }

      alg<uy> $$1 = this.dX().a(un.a);
      List<bvx> $$2 = $$0.<List<bvx>>a("active_effects", bvx.d.listOf(), $$1).orElse(List.of());
      this.bH.clear();

      for (bvx $$3 : $$2) {
         this.bH.put($$3.c(), $$3);
      }

      this.d($$0.b("Health", this.eU()));
      this.aN = $$0.b("HurtTime", (short)0);
      this.aP = $$0.b("DeathTime", (short)0);
      this.bM = $$0.b("HurtByTimestamp", 0);
      $$0.i("Team").ifPresent($$0x -> {
         fgv $$1x = this.dV().R();
         fgq $$2x = $$1x.b($$0x);
         boolean $$3x = $$2x != null && $$1x.a(this.cH(), $$2x);
         if (!$$3x) {
            a.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$0x);
         }
      });
      this.b(7, $$0.b("FallFlying", false));
      $$0.<iv>a("sleeping_pos", iv.a).ifPresentOrElse($$0x -> {
         this.g($$0x);
         this.al.a(aq, byg.c);
         if (!this.ak) {
            this.a($$0x);
         }
      }, this::fQ);
      $$0.m("Brain").ifPresent($$0x -> this.bs = this.a(new Dynamic(un.a, $$0x)));
      this.ba = bwz.b($$0, "last_hurt_by_player");
      this.bb = $$0.b("last_hurt_by_player_memory_time", 0);
      this.bL = bwz.b($$0, "last_hurt_by_mob");
      this.bM = $$0.b("ticks_since_last_hurt_by_mob", 0) + this.af;
      this.bt.a($$0.<bwx>a("equipment", bwx.a, $$1).orElseGet(bwx::new));
   }

   protected void ey() {
      if (this.dV() instanceof ars $$0) {
         Iterator<jf<bvv>> $$1 = this.bH.keySet().iterator();

         try {
            while ($$1.hasNext()) {
               jf<bvv> $$2 = $$1.next();
               bvx $$3 = this.bH.get($$2);
               if (!$$3.a($$0, this, () -> this.a($$3, true, null))) {
                  $$1.remove();
                  this.c(List.of($$3));
               } else if ($$3.d() % 600 == 0) {
                  this.a($$3, false, null);
               }
            }
         } catch (ConcurrentModificationException var6) {
         }

         if (this.bK) {
            this.K();
            this.q();
            this.bK = false;
         }
      } else {
         for (bvx $$4 : this.bH.values()) {
            $$4.i();
         }

         List<lw> $$5 = this.al.a(bz);
         if (!$$5.isEmpty()) {
            boolean $$6 = this.al.a(bA);
            int $$7 = this.co() ? 15 : 4;
            int $$8 = $$6 ? 5 : 1;
            if (this.ae.a($$7 * $$8) == 0) {
               this.dV().a(ag.a($$5, this.ae), this.d(0.5), this.dD(), this.g(0.5), 1.0, 1.0, 1.0);
            }
         }
      }
   }

   protected void K() {
      if (this.bH.isEmpty()) {
         this.eB();
         this.k(false);
      } else {
         this.k(this.b(bvz.n));
         this.j();
      }
   }

   private void j() {
      List<lw> $$0 = this.bH.values().stream().filter(bvx::g).map(bvx::a).toList();
      this.al.a(bz, $$0);
      this.al.a(bA, d(this.bH.values()));
   }

   private void q() {
      boolean $$0 = this.cn();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable bwt $$0) {
      double $$1 = 1.0;
      if (this.cf()) {
         $$1 *= 0.8;
      }

      if (this.co()) {
         float $$2 = this.fd();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         czy $$3 = this.a(bxd.f);
         bxc<?> $$4 = $$0.an();
         if ($$4 == bxc.bg && $$3.a(dac.vv)
            || $$4 == bxc.bP && $$3.a(dac.vy)
            || $$4 == bxc.aS && $$3.a(dac.vB)
            || $$4 == bxc.aT && $$3.a(dac.vB)
            || $$4 == bxc.F && $$3.a(dac.vz)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bxu $$0) {
      return $$0 instanceof crx && this.dV().an() == buo.a ? false : $$0.ez();
   }

   public boolean ez() {
      return !this.cC() && this.eA();
   }

   public boolean eA() {
      return !this.Z_() && this.bJ();
   }

   public static boolean d(Collection<bvx> $$0) {
      for (bvx $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void eB() {
      this.al.a(bz, List.of());
   }

   public boolean eC() {
      if (this.dV().C) {
         return false;
      } else if (this.bH.isEmpty()) {
         return false;
      } else {
         Map<jf<bvv>, bvx> $$0 = Maps.newHashMap(this.bH);
         this.bH.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<bvx> eD() {
      return this.bH.values();
   }

   public Map<jf<bvv>, bvx> eE() {
      return this.bH;
   }

   public boolean b(jf<bvv> $$0) {
      return this.bH.containsKey($$0);
   }

   @Nullable
   public bvx c(jf<bvv> $$0) {
      return this.bH.get($$0);
   }

   public float a(jf<bvv> $$0, float $$1) {
      bvx $$2 = this.c($$0);
      return $$2 != null ? $$2.a(this, $$1) : 0.0F;
   }

   public final boolean a(bvx $$0) {
      return this.b($$0, null);
   }

   public boolean b(bvx $$0, @Nullable bwt $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         bvx $$2 = this.bH.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bH.put($$0.c(), $$0);
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

   public boolean b(bvx $$0) {
      if (this.an().a(axh.G)) {
         return !$$0.a(bvz.M);
      } else if (this.an().a(axh.F)) {
         return !$$0.a(bvz.L);
      } else {
         return !this.an().a(axh.w) ? true : !$$0.a(bvz.j) && !$$0.a(bvz.s);
      }
   }

   public void c(bvx $$0, @Nullable bwt $$1) {
      if (this.b($$0)) {
         bvx $$2 = this.bH.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eF() {
      return this.an().a(axh.x);
   }

   @Nullable
   public final bvx d(jf<bvv> $$0) {
      return this.bH.remove($$0);
   }

   public boolean e(jf<bvv> $$0) {
      bvx $$1 = this.d($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(bvx $$0, @Nullable bwt $$1) {
      if (!this.dV().C) {
         this.bK = true;
         $$0.c().a().a(this.fa(), $$0.e());
         this.c($$0);
      }
   }

   public void c(bvx $$0) {
      for (bwt $$1 : this.cY()) {
         if ($$1 instanceof art $$2) {
            $$2.f.b(new agk(this.ao(), $$0, false));
         }
      }
   }

   protected void a(bvx $$0, boolean $$1, @Nullable bwt $$2) {
      if (!this.dV().C) {
         this.bK = true;
         if ($$1) {
            bvv $$3 = $$0.c().a();
            $$3.a(this.fa());
            $$3.a(this.fa(), $$0.e());
            this.u();
         }

         this.c($$0);
      }
   }

   protected void c(Collection<bvx> $$0) {
      if (!this.dV().C) {
         this.bK = true;

         for (bvx $$1 : $$0) {
            $$1.c().a().a(this.fa());

            for (bwt $$2 : this.cY()) {
               if ($$2 instanceof art $$3) {
                  $$3.f.b(new aem(this.ao(), $$1.c()));
               }
            }
         }

         this.u();
      }
   }

   private void u() {
      Set<byw> $$0 = this.fa().b();

      for (byw $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(jf<byv> $$0) {
      if ($$0.a(bza.s)) {
         float $$1 = this.eU();
         if (this.eG() > $$1) {
            this.d($$1);
         }
      } else if ($$0.a(bza.r)) {
         float $$2 = this.eV();
         if (this.fw() > $$2) {
            this.E($$2);
         }
      } else if ($$0.a(bza.y)) {
         this.i_();
      }
   }

   public void c(float $$0) {
      float $$1 = this.eG();
      if ($$1 > 0.0F) {
         this.d($$1 + $$0);
      }
   }

   public float eG() {
      return this.al.a(by);
   }

   public void d(float $$0) {
      this.al.a(by, azo.a($$0, 0.0F, this.eU()));
   }

   public boolean eH() {
      return this.eG() <= 0.0F;
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.eH()) {
         return false;
      } else if ($$1.a(axf.i) && this.b(bvz.l)) {
         return false;
      } else {
         if (this.fR()) {
            this.fS();
         }

         this.bd = 0;
         if ($$2 < 0.0F) {
            $$2 = 0.0F;
         }

         float $$4 = this.b($$0, $$1, $$2);
         $$2 -= $$4;
         boolean $$5 = $$4 > 0.0F;
         if ($$1.a(axf.o) && this.an().a(axh.l)) {
            $$2 *= 5.0F;
         }

         if ($$1.a(axf.a) && !this.a(bxd.f).f()) {
            this.d($$1, $$2);
            $$2 *= 0.75F;
         }

         if (Float.isNaN($$2) || Float.isInfinite($$2)) {
            $$2 = Float.MAX_VALUE;
         }

         boolean $$6 = true;
         if ((float)this.aj > 10.0F && !$$1.a(axf.e)) {
            if ($$2 <= this.be) {
               return false;
            }

            this.c($$0, $$1, $$2 - this.be);
            this.be = $$2;
            $$6 = false;
         } else {
            this.be = $$2;
            this.aj = 20;
            this.c($$0, $$1, $$2);
            this.aO = 10;
            this.aN = this.aO;
         }

         this.f($$1);
         this.g($$1);
         if ($$6) {
            dbz $$7 = this.fB().a(kk.I);
            if ($$5 && $$7 != null) {
               $$7.a($$0, this);
            } else {
               $$0.a(this, $$1);
            }

            if (!$$1.a(axf.r) && (!$$5 || $$2 > 0.0F)) {
               this.bB();
            }

            if (!$$1.a(axf.z)) {
               double $$8 = 0.0;
               double $$9 = 0.0;
               if ($$1.c() instanceof css $$10) {
                  DoubleDoubleImmutablePair $$11 = $$10.a_(this, $$1);
                  $$8 = -$$11.leftDouble();
                  $$9 = -$$11.rightDouble();
               } else if ($$1.i() != null) {
                  $$8 = $$1.i().a() - this.dA();
                  $$9 = $$1.i().c() - this.dG();
               }

               this.p(0.4F, $$8, $$9);
               if (!$$5) {
                  this.a($$8, $$9);
               }
            }
         }

         if (this.eH()) {
            if (!this.j($$1)) {
               if ($$6) {
                  this.b(this.l_());
                  this.i($$1);
               }

               this.a($$1);
            }
         } else if ($$6) {
            this.h($$1);
            this.i($$1);
         }

         boolean $$12 = !$$5 || $$2 > 0.0F;
         if ($$12) {
            this.bU = $$1;
            this.bV = this.dV().ae();

            for (bvx $$13 : this.eD()) {
               $$13.a($$0, this, $$1, $$2);
            }
         }

         if (this instanceof art $$14) {
            aq.i.a($$14, $$1, $$2, $$2, $$5);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               $$14.a(awz.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$1.d() instanceof art $$15) {
            aq.h.a($$15, this, $$1, $$2, $$2, $$5);
         }

         return $$12;
      }
   }

   public float b(ars $$0, bvi $$1, float $$2) {
      if ($$2 <= 0.0F) {
         return 0.0F;
      } else {
         czy $$3 = this.fH();
         if ($$3 == null) {
            return 0.0F;
         } else {
            dbz $$4 = $$3.a(kk.I);
            if ($$4 != null && !$$4.f().map($$1::a).orElse(false)) {
               if ($$1.c() instanceof csf $$5 && $$5.u() > 0) {
                  return 0.0F;
               }

               ffq $$6 = $$1.i();
               double $$9;
               if ($$6 != null) {
                  ffq $$7 = this.d(0.0F, this.cA());
                  ffq $$8 = $$6.d(this.dt());
                  $$8 = new ffq($$8.d, 0.0, $$8.f).d();
                  $$9 = Math.acos($$8.b($$7));
               } else {
                  $$9 = (float) Math.PI;
               }

               float $$11 = $$4.a($$1, $$2, $$9);
               $$4.a(this.dV(), $$3, this, this.fA(), $$11);
               if (!$$1.a(axf.j) && $$1.c() instanceof bxu $$13) {
                  this.b($$0, $$13);
               }

               return $$11;
            } else {
               return 0.0F;
            }
         }
      }
   }

   private void i(bvi $$0) {
      if ($$0.a(bvl.P)) {
         awq $$1 = this instanceof crx ? awq.h : awq.f;
         this.dV().a(null, this.dt().d, this.dt().e, this.dt().f, awp.AB, $$1);
      }
   }

   protected void f(bvi $$0) {
      if ($$0.d() instanceof bxu $$1 && !$$0.a(axf.q) && (!$$0.a(bvl.I) || !this.an().a(axh.E))) {
         this.a($$1);
      }
   }

   @Nullable
   protected crx g(bvi $$0) {
      bwt $$1 = $$0.d();
      if ($$1 instanceof crx $$2) {
         this.a($$2, 100);
      } else if ($$1 instanceof cmm $$3 && $$3.q()) {
         if ($$3.d() != null) {
            this.a($$3.d().c(), 100);
         } else {
            this.ba = null;
            this.bb = 0;
         }
      }

      return bwz.a(this.ba, this.dV(), crx.class);
   }

   protected void b(ars $$0, bxu $$1) {
      $$1.d(this);
   }

   protected void d(bxu $$0) {
      $$0.p(0.5, $$0.dA() - this.dA(), $$0.dG() - this.dG());
   }

   private boolean j(bvi $$0) {
      if ($$0.a(axf.d)) {
         return false;
      } else {
         czy $$1 = null;
         dcj $$2 = null;

         for (buq $$3 : buq.values()) {
            czy $$4 = this.b($$3);
            $$2 = $$4.a(kk.H);
            if ($$2 != null) {
               $$1 = $$4.v();
               $$4.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof art $$5) {
               $$5.b(awz.c.b($$1.h()));
               aq.C.a($$5, $$1);
               this.a(ege.C);
            }

            this.d(1.0F);
            $$2.a($$1, this);
            this.dV().a(this, (byte)35);
         }

         return $$2 != null;
      }
   }

   @Nullable
   public bvi eI() {
      if (this.dV().ae() - this.bV > 40L) {
         this.bU = null;
      }

      return this.bU;
   }

   protected void h(bvi $$0) {
      this.b(this.e($$0));
   }

   public void b(@Nullable awo $$0) {
      if ($$0 != null) {
         this.a($$0, this.fe(), this.ff());
      }
   }

   private void g(czy $$0) {
      if (!$$0.f()) {
         jf<awo> $$1 = $$0.a(kk.au);
         if ($$1 != null && !this.ba()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), $$1.a(), this.dm(), 0.8F, 0.8F + this.dV().A.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(bvi $$0) {
      if (!this.dQ() && !this.bc) {
         bwt $$1 = $$0.d();
         bxu $$2 = this.eT();
         if ($$2 != null) {
            $$2.a(this, $$0);
         }

         if (this.fR()) {
            this.fS();
         }

         if (!this.dV().C && this.h_()) {
            a.info("Named entity {} died: {}", this, this.eS().a().getString());
         }

         this.bc = true;
         this.eS().c();
         if (this.dV() instanceof ars $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(ege.p);
               this.b($$3, $$0);
               this.e($$2);
            }

            this.dV().a(this, (byte)3);
         }

         this.b(byg.h);
      }
   }

   protected void e(@Nullable bxu $$0) {
      if (this.dV() instanceof ars $$1) {
         boolean var6 = false;
         if ($$0 instanceof cnp) {
            if ($$1.O().c(djt.d)) {
               iv $$4 = this.dv();
               ebe $$5 = dne.cn.m();
               if (this.dV().a_($$4).l() && $$5.a((dka)this.dV(), $$4)) {
                  this.dV().a($$4, $$5, 3);
                  var6 = true;
               }
            }

            if (!var6) {
               coc $$6 = new coc(this.dV(), this.dA(), this.dC(), this.dG(), new czy(dac.dJ));
               this.dV().b($$6);
            }
         }
      }
   }

   protected void b(ars $$0, bvi $$1) {
      boolean $$2 = this.bb > 0;
      if (this.ep() && $$0.O().c(djt.g)) {
         this.b($$0, $$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.f($$0);
      this.b($$0, $$1.d());
   }

   protected void f(ars $$0) {
   }

   protected void b(ars $$0, @Nullable bwt $$1) {
      if (!this.eL() && (this.eq() || this.bb > 0 && this.eo() && $$0.O().c(djt.g))) {
         bxh.a($$0, this.dt(), this.a($$0, $$1));
      }
   }

   protected void a(ars $$0, bvi $$1, boolean $$2) {
   }

   public long eJ() {
      return 0L;
   }

   protected float b(bwt $$0, bvi $$1) {
      float $$2 = (float)this.h(bza.d);
      return this.dV() instanceof ars $$3 ? dgn.d($$3, this.dZ(), $$0, $$1, $$2) : $$2;
   }

   protected void b(ars $$0, bvi $$1, boolean $$2) {
      Optional<alh<fam>> $$3 = this.ea();
      if (!$$3.isEmpty()) {
         fam $$4 = $$0.p().bc().b($$3.get());
         fak.a $$5 = new fak.a($$0).a(fdb.a, this).a(fdb.f, this.dt()).a(fdb.c, $$1).b(fdb.d, $$1.d()).b(fdb.e, $$1.c());
         crx $$6 = this.es();
         if ($$2 && $$6 != null) {
            $$5 = $$5.a(fdb.b, $$6).a($$6.eh());
         }

         fak $$7 = $$5.a(fda.g);
         $$4.a($$7, this.eJ(), $$1x -> this.a($$0, $$1x));
      }
   }

   public boolean a(ars $$0, alh<fam> $$1, BiConsumer<ars, czy> $$2) {
      return this.a($$0, $$1, $$0x -> $$0x.a(fdb.f, this.dt()).a(fdb.a, this).a(fda.j), $$2);
   }

   protected void a(ars $$0, alh<fam> $$1, czy $$2, BiConsumer<ars, czy> $$3) {
      this.a($$0, $$1, $$1x -> $$1x.a(fdb.f, this.dt()).a(fdb.a, this).a(fdb.i, $$2).a(fda.s), $$3);
   }

   protected boolean a(ars $$0, alh<fam> $$1, Function<fak.a, fak> $$2, BiConsumer<ars, czy> $$3) {
      fam $$4 = $$0.p().bc().b($$1);
      fak $$5 = $$2.apply(new fak.a($$0));
      List<czy> $$6 = $$4.a($$5);
      if (!$$6.isEmpty()) {
         $$6.forEach($$2x -> $$3.accept($$0, $$2x));
         return true;
      } else {
         return false;
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(bza.p);
      if (!($$0 <= 0.0)) {
         this.ar = true;
         ffq $$3 = this.dy();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         ffq $$4 = new ffq($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aH() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected awo e(bvi $$0) {
      return awp.kK;
   }

   @Nullable
   protected awo l_() {
      return awp.kF;
   }

   private awo q(int $$0) {
      return $$0 > 4 ? this.eO().b() : this.eO().a();
   }

   public void eK() {
      this.bY = true;
   }

   public boolean eL() {
      return this.bY;
   }

   public float eM() {
      return 0.0F;
   }

   protected ffl eN() {
      ffl $$0 = this.cR();
      bwt $$1 = this.dk();
      if ($$1 != null) {
         ffq $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<dgl, Set<dhd>> c(bxd $$0) {
      return (Map<dgl, Set<dhd>>)this.bZ.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public bxu.a eO() {
      return new bxu.a(awp.kL, awp.kD);
   }

   public Optional<iv> eP() {
      return this.bT;
   }

   public boolean d_() {
      if (this.Z_()) {
         return false;
      } else {
         iv $$0 = this.dv();
         ebe $$1 = this.dw();
         if ($$1.a(axe.aS)) {
            this.bT = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dwe && this.c($$0, $$1)) {
            this.bT = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(iv $$0, ebe $$1) {
      if (!$$1.c(dwe.b)) {
         return false;
      } else {
         ebe $$2 = this.dV().a_($$0.e());
         return $$2.a(dne.da) && $$2.c(drn.b) == $$1.c(dwe.e);
      }
   }

   @Override
   public boolean bJ() {
      return !this.dQ() && this.eG() > 0.0F;
   }

   public boolean a(bxu $$0, double $$1, boolean $$2, boolean $$3, double... $$4) {
      ffq $$5 = $$0.h(1.0F).d();

      for (double $$6 : $$4) {
         ffq $$7 = new ffq(this.dA() - $$0.dA(), $$6 - $$0.dE(), this.dG() - $$0.dG());
         double $$8 = $$7.g();
         $$7 = $$7.d();
         double $$9 = $$5.b($$7);
         if ($$9 > 1.0 - $$1 / ($$2 ? $$8 : 1.0) && $$0.a(this, $$3 ? dje.a.c : dje.a.a, dje.b.a, $$6)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public int cE() {
      return this.y(0.0F);
   }

   protected final int y(float $$0) {
      return azo.d($$0 + 3.0F);
   }

   @Override
   public boolean a(double $$0, float $$1, bvi $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.a($$0, $$1);
      if ($$4 > 0) {
         this.a(this.q($$4), 1.0F, 1.0F);
         this.eQ();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int a(double $$0, float $$1) {
      if (this.an().a(axh.o)) {
         return 0;
      } else {
         double $$2 = this.h($$0);
         return azo.a($$2 * (double)$$1 * this.h(bza.k));
      }
   }

   private double h(double $$0) {
      return $$0 + 1.0E-6 - this.h(bza.x);
   }

   protected void eQ() {
      if (!this.ba()) {
         int $$0 = azo.a(this.dA());
         int $$1 = azo.a(this.dC() - 0.2F);
         int $$2 = azo.a(this.dG());
         ebe $$3 = this.dV().a_(new iv($$0, $$1, $$2));
         if (!$$3.l()) {
            duz $$4 = $$3.A();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void q(float $$0) {
      this.aO = 10;
      this.aN = this.aO;
   }

   public int eR() {
      return azo.a(this.h(bza.a));
   }

   protected void c(bvi $$0, float $$1) {
   }

   protected void d(bvi $$0, float $$1) {
   }

   protected void a(bvi $$0, float $$1, bxd... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bxd $$4 : $$2) {
            czy $$5 = this.a($$4);
            dih $$6 = $$5.a(kk.D);
            if ($$6 != null && $$6.i() && $$5.m() && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float e(bvi $$0, float $$1) {
      if (!$$0.a(axf.b)) {
         this.c($$0, $$1);
         $$1 = bve.a(this, $$1, $$0, (float)this.eR(), (float)this.h(bza.b));
      }

      return $$1;
   }

   protected float f(bvi $$0, float $$1) {
      if ($$0.a(axf.f)) {
         return $$1;
      } else {
         if (this.b(bvz.k) && !$$0.a(axf.g)) {
            int $$2 = (this.c(bvz.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof art) {
                  ((art)this).a(awz.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof art) {
                  ((art)$$0.d()).a(awz.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(axf.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dV() instanceof ars $$7) {
               $$8 = dgn.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = bve.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void c(ars $$0, bvi $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var10 = Math.max($$2 - this.fw(), 0.0F);
         this.E(this.fw() - ($$2 - var10));
         float $$4 = $$2 - var10;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F && $$1.d() instanceof art $$5) {
            $$5.a(awz.H, Math.round($$4 * 10.0F));
         }

         if (var10 != 0.0F) {
            this.eS().a($$1, var10);
            this.d(this.eG() - var10);
            this.E(this.fw() - var10);
            this.a(ege.o);
         }
      }
   }

   public bvf eS() {
      return this.bG;
   }

   @Nullable
   public bxu eT() {
      if (this.ba != null) {
         return this.ba.a(this.dV(), crx.class);
      } else {
         return this.bL != null ? this.bL.a(this.dV(), bxu.class) : null;
      }
   }

   public final float eU() {
      return (float)this.h(bza.s);
   }

   public final float eV() {
      return (float)this.h(bza.r);
   }

   public final int eW() {
      return this.al.a(bB);
   }

   public final void o(int $$0) {
      this.al.a(bB, $$0);
   }

   public final int eX() {
      return this.al.a(bC);
   }

   public final void p(int $$0) {
      this.al.a(bC, $$0);
   }

   private int D() {
      if (bvy.a(this)) {
         return 6 - (1 + bvy.b(this));
      } else {
         return this.b(bvz.d) ? 6 + (1 + this.c(bvz.d).e()) * 2 : 6;
      }
   }

   public void a(buq $$0) {
      this.a($$0, false);
   }

   public void a(buq $$0, boolean $$1) {
      if (!this.aI || this.aK >= this.D() / 2 || this.aK < 0) {
         this.aK = -1;
         this.aI = true;
         this.aJ = $$0;
         if (this.dV() instanceof ars) {
            aby $$2 = new aby(this, $$0 == buq.a ? 0 : 3);
            arp $$3 = ((ars)this.dV()).m();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bvi $$0) {
      this.aT.a(1.5F);
      this.aj = 20;
      this.aO = 10;
      this.aN = this.aO;
      awo $$1 = this.e($$0);
      if ($$1 != null) {
         this.a($$1, this.fe(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }

      this.bU = $$0;
      this.bV = this.dV().ae();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            awo $$1 = this.l_();
            if ($$1 != null) {
               this.a($$1, this.fe(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof crx)) {
               this.d(0.0F);
               this.a(this.dW().p());
            }
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ae.i() - 0.5F) * 0.2F;
               float $$6 = (this.ae.i() - 0.5F) * 0.2F;
               float $$7 = (this.ae.i() - 0.5F) * 0.2F;
               double $$8 = azo.d($$4, this.K, this.dA()) + (this.ae.j() - 0.5) * (double)this.dq() * 2.0;
               double $$9 = azo.d($$4, this.L, this.dC()) + this.ae.j() * (double)this.dr();
               double $$10 = azo.d($$4, this.M, this.dG()) + (this.ae.j() - 0.5) * (double)this.dq() * 2.0;
               this.dV().a(ly.af, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.g(this.a(bxd.a));
            break;
         case 48:
            this.g(this.a(bxd.b));
            break;
         case 49:
            this.g(this.a(bxd.f));
            break;
         case 50:
            this.g(this.a(bxd.e));
            break;
         case 51:
            this.g(this.a(bxd.d));
            break;
         case 52:
            this.g(this.a(bxd.c));
            break;
         case 54:
            drb.b(this);
            break;
         case 55:
            this.F();
            break;
         case 60:
            this.eY();
            break;
         case 65:
            this.g(this.a(bxd.g));
            break;
         case 67:
            this.E();
            break;
         case 68:
            this.g(this.a(bxd.h));
            break;
         default:
            super.b($$0);
      }
   }

   public void eY() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.ae.k() * 0.02;
         double $$2 = this.ae.k() * 0.02;
         double $$3 = this.ae.k() * 0.02;
         double $$4 = 10.0;
         this.dV().a(ly.ae, this.d(1.0) - $$1 * 10.0, this.dD() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
      }
   }

   private void E() {
      ffq $$0 = this.dy();

      for (int $$1 = 0; $$1 < 8; $$1++) {
         double $$2 = this.ae.a(0.0, 1.0);
         double $$3 = this.ae.a(0.0, 1.0);
         double $$4 = this.ae.a(0.0, 1.0);
         this.dV().a(ly.d, this.dA() + $$2, this.dC() + $$3, this.dG() + $$4, $$0.d, $$0.e, $$0.f);
      }
   }

   private void F() {
      czy $$0 = this.a(bxd.b);
      this.a(bxd.b, this.a(bxd.a));
      this.a(bxd.a, $$0);
   }

   @Override
   protected void aG() {
      this.a(this.dW().o(), 4.0F);
   }

   protected void eZ() {
      int $$0 = this.D();
      if (this.aI) {
         this.aK++;
         if (this.aK >= $$0) {
            this.aK = 0;
            this.aI = false;
         }
      } else {
         this.aK = 0;
      }

      this.aR = (float)this.aK / (float)$$0;
   }

   @Nullable
   public byw g(jf<byv> $$0) {
      return this.fa().a($$0);
   }

   public double h(jf<byv> $$0) {
      return this.fa().c($$0);
   }

   public double i(jf<byv> $$0) {
      return this.fa().d($$0);
   }

   public byx fa() {
      return this.bF;
   }

   public czy fb() {
      return this.a(bxd.a);
   }

   public czy fc() {
      return this.a(bxd.b);
   }

   public czy a(bxl $$0) {
      return this.fy() == $$0 ? this.fb() : this.fc();
   }

   @Nonnull
   @Override
   public czy dZ() {
      return this.fb();
   }

   public boolean b(czu $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<czy> $$0) {
      return $$0.test(this.fb()) || $$0.test(this.fc());
   }

   public czy b(buq $$0) {
      if ($$0 == buq.a) {
         return this.a(bxd.a);
      } else if ($$0 == buq.b) {
         return this.a(bxd.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(buq $$0, czy $$1) {
      if ($$0 == buq.a) {
         this.a(bxd.a, $$1);
      } else {
         if ($$0 != buq.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bxd.b, $$1);
      }
   }

   public boolean d(bxd $$0) {
      return !this.a($$0).f();
   }

   public boolean e(bxd $$0) {
      return true;
   }

   public czy a(bxd $$0) {
      return this.bt.a($$0);
   }

   public void a(bxd $$0, czy $$1) {
      this.a($$0, this.bt.a($$0, $$1), $$1);
   }

   public float fd() {
      int $$0 = 0;
      int $$1 = 0;

      for (bxd $$2 : bxe.i) {
         if ($$2.a() == bxd.a.b) {
            czy $$3 = this.a($$2);
            if (!$$3.f()) {
               $$1++;
            }

            $$0++;
         }
      }

      return $$0 > 0 ? (float)$$1 / (float)$$0 : 0.0F;
   }

   @Override
   public void h(boolean $$0) {
      super.h($$0);
      byw $$1 = this.g(bza.v);
      $$1.c(e.a());
      if ($$0) {
         $$1.b(e);
      }
   }

   protected float fe() {
      return 1.0F;
   }

   public float ff() {
      return this.n_() ? (this.ae.i() - this.ae.i()) * 0.2F + 1.5F : (this.ae.i() - this.ae.i()) * 0.2F + 1.0F;
   }

   protected boolean fg() {
      return this.eH();
   }

   @Override
   public void h(bwt $$0) {
      if (!this.fR()) {
         super.h($$0);
      }
   }

   private void c(bwt $$0) {
      ffq $$1;
      if (this.dQ()) {
         $$1 = this.dt();
      } else if (!$$0.dQ() && !this.dV().a_($$0.dv()).a(axe.aM)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dC(), $$0.dC());
         $$1 = new ffq(this.dA(), $$2, this.dG());
         boolean $$4 = this.dq() <= 4.0F && this.dr() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.dr() / 2.0;
            ffq $$6 = $$1.b(0.0, $$5, 0.0);
            fgk $$7 = fgh.a(ffl.a($$6, (double)this.dq(), (double)this.dr(), (double)this.dq()));
            $$1 = this.dV().a(this, $$7, $$6, (double)this.dq(), (double)this.dr(), (double)this.dq()).map($$1x -> $$1x.b(0.0, -$$5, 0.0)).orElse($$1);
         }
      }

      this.m($$1.d, $$1.e, $$1.f);
   }

   @Override
   public boolean cM() {
      return this.cL();
   }

   protected float fh() {
      return this.z(1.0F);
   }

   protected float z(float $$0) {
      return (float)this.h(bza.o) * $$0 * this.aR() + this.fi();
   }

   public float fi() {
      return this.b(bvz.h) ? 0.1F * ((float)this.c(bvz.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void s() {
      float $$0 = this.fh();
      if (!($$0 <= 1.0E-5F)) {
         ffq $$1 = this.dy();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.ci()) {
            float $$2 = this.dL() * (float) (Math.PI / 180.0);
            this.j(new ffq((double)(-azo.a($$2)) * 0.2, 0.0, (double)azo.b($$2) * 0.2));
         }

         this.ar = true;
      }
   }

   protected void fj() {
      this.i(this.dy().b(0.0, -0.04F, 0.0));
   }

   protected void c(axt<exn> $$0) {
      this.i(this.dy().b(0.0, 0.04F, 0.0));
   }

   protected float fk() {
      return 0.8F;
   }

   public boolean a(exo $$0) {
      return false;
   }

   @Override
   protected double bc() {
      return this.h(bza.n);
   }

   protected double fl() {
      boolean $$0 = this.dy().e <= 0.0;
      return $$0 && this.b(bvz.B) ? Math.min(this.bd(), 0.01) : this.bd();
   }

   public void a_(ffq $$0) {
      exo $$1 = this.dV().b_(this.dv());
      if ((this.bi() || this.bv()) && this.em() && !this.a($$1)) {
         this.m($$0);
      } else if (this.fJ()) {
         this.n($$0);
      } else {
         this.l($$0);
      }
   }

   private void l(ffq $$0) {
      iv $$1 = this.aP();
      float $$2 = this.aH() ? this.dV().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      ffq $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      bvx $$6 = this.c(bvz.y);
      if ($$6 != null) {
         $$5 += (0.05 * (double)($$6.e() + 1) - $$4.e) * 0.2;
      } else if (!this.dV().C || this.dV().C($$1)) {
         $$5 -= this.fl();
      } else if (this.dC() > (double)this.dV().K_()) {
         $$5 = -0.1;
      } else {
         $$5 = 0.0;
      }

      if (this.ex()) {
         this.n($$4.d, $$5, $$4.f);
      } else {
         float $$7 = this instanceof cjy ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void m(ffq $$0) {
      boolean $$1 = this.dy().e <= 0.0;
      double $$2 = this.dC();
      double $$3 = this.fl();
      if (this.bi()) {
         float $$4 = this.ci() ? 0.9F : this.fk();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(bza.F);
         if (!this.aH()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fo() - $$5) * $$6;
         }

         if (this.b(bvz.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(bxy.a, this.dy());
         ffq $$7 = this.dy();
         if (this.P && this.d_()) {
            $$7 = new ffq($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.i(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(bxy.a, this.dy());
         if (this.b(axj.b) <= this.dp()) {
            this.i(this.dy().d(0.5, 0.8F, 0.5));
            ffq $$8 = this.a($$3, $$1, this.dy());
            this.i($$8);
         } else {
            this.i(this.dy().c(0.5));
         }

         if ($$3 != 0.0) {
            this.i(this.dy().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      ffq $$9 = this.dy();
      if (this.P && this.f($$9.d, $$9.e + 0.6F - this.dC() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void n(ffq $$0) {
      if (this.d_()) {
         this.l($$0);
         this.fm();
      } else {
         ffq $$1 = this.dy();
         double $$2 = $$1.i();
         this.i(this.o($$1));
         this.a(bxy.a, this.dy());
         if (!this.dV().C) {
            double $$3 = this.dy().i();
            this.c($$2, $$3);
         }
      }
   }

   public void fm() {
      this.b(7, true);
      this.b(7, false);
   }

   private ffq o(ffq $$0) {
      ffq $$1 = this.bS();
      float $$2 = this.dN() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fl();
      double $$6 = azo.k(Math.cos((double)$$2));
      $$0 = $$0.b(0.0, $$5 * (-1.0 + $$6 * 0.75), 0.0);
      if ($$0.e < 0.0 && $$3 > 0.0) {
         double $$7 = $$0.e * -0.1 * $$6;
         $$0 = $$0.b($$1.d * $$7 / $$3, $$7, $$1.f * $$7 / $$3);
      }

      if ($$2 < 0.0F && $$3 > 0.0) {
         double $$8 = $$4 * (double)(-azo.a($$2)) * 0.04;
         $$0 = $$0.b(-$$1.d * $$8 / $$3, $$8 * 3.2, -$$1.f * $$8 / $$3);
      }

      if ($$3 > 0.0) {
         $$0 = $$0.b(($$1.d / $$3 * $$4 - $$0.d) * 0.1, 0.0, ($$1.f / $$3 * $$4 - $$0.f) * 0.1);
      }

      return $$0.d(0.99F, 0.98F, 0.99F);
   }

   private void c(double $$0, double $$1) {
      if (this.P) {
         double $$2 = $$0 - $$1;
         float $$3 = (float)($$2 * 10.0 - 3.0);
         if ($$3 > 0.0F) {
            this.a(this.q((int)$$3), 1.0F, 1.0F);
            this.a(this.dW().n(), $$3);
         }
      }
   }

   private void c(crx $$0, ffq $$1) {
      ffq $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.di()) {
         this.B(this.c($$0));
         this.a_($$2);
      } else {
         this.i(ffq.c);
      }
   }

   protected void a(crx $$0, ffq $$1) {
   }

   protected ffq b(crx $$0, ffq $$1) {
      return $$1;
   }

   protected float c(crx $$0) {
      return this.fo();
   }

   public void r(boolean $$0) {
      float $$1 = (float)azo.g(this.dA() - this.K, $$0 ? this.dC() - this.L : 0.0, this.dG() - this.M);
      if (!this.bY() && this.bJ()) {
         this.A($$1);
      } else {
         this.aT.a();
      }
   }

   protected void A(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aT.a($$1, 0.4F, this.n_() ? 3.0F : 1.0F);
   }

   private ffq a(ffq $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.i(this.p(this.dy()));
      this.a(bxy.a, this.dy());
      ffq $$2 = this.dy();
      if ((this.P || this.bf) && (this.d_() || this.aw && dtd.a(this))) {
         $$2 = new ffq($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public ffq a(double $$0, boolean $$1, ffq $$2) {
      if ($$0 != 0.0 && !this.ci()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new ffq($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private ffq p(ffq $$0) {
      if (this.d_()) {
         this.k();
         float $$1 = 0.15F;
         double $$2 = azo.a($$0.d, -0.15F, 0.15F);
         double $$3 = azo.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dw().a(dne.oy) && this.fI() && this instanceof crx) {
            $$4 = 0.0;
         }

         $$0 = new ffq($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aH() ? this.fo() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fn();
   }

   protected float fn() {
      return this.cW() instanceof crx ? this.fo() * 0.1F : 0.02F;
   }

   public float fo() {
      return this.bP;
   }

   public void B(float $$0) {
      this.bP = $$0;
   }

   public boolean c(ars $$0, bwt $$1) {
      this.B($$1);
      return false;
   }

   @Override
   public void h() {
      super.h();
      this.I();
      this.J();
      if (!this.dV().C) {
         int $$0 = this.eW();
         if ($$0 > 0) {
            if (this.aL <= 0) {
               this.aL = 20 * (30 - $$0);
            }

            this.aL--;
            if (this.aL <= 0) {
               this.o($$0 - 1);
            }
         }

         int $$1 = this.eX();
         if ($$1 > 0) {
            if (this.aM <= 0) {
               this.aM = 20 * (30 - $$1);
            }

            this.aM--;
            if (this.aM <= 0) {
               this.p($$1 - 1);
            }
         }

         this.G();
         if (this.af % 20 == 0) {
            this.eS().c();
         }

         if (this.fR() && !this.L()) {
            this.fS();
         }
      }

      if (!this.dQ()) {
         this.k_();
      }

      double $$2 = this.dA() - this.K;
      double $$3 = this.dG() - this.M;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aV;
      if ($$4 > 0.0025000002F) {
         float $$6 = (float)azo.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$7 = azo.e(azo.h(this.dL()) - $$6);
         if (95.0F < $$7 && $$7 < 265.0F) {
            $$5 = $$6 - 180.0F;
         } else {
            $$5 = $$6;
         }
      }

      if (this.aR > 0.0F) {
         $$5 = this.dL();
      }

      brb $$8 = bra.a();
      $$8.a("headTurn");
      this.C($$5);
      $$8.c();
      $$8.a("rangeChecks");

      while (this.dL() - this.N < -180.0F) {
         this.N -= 360.0F;
      }

      while (this.dL() - this.N >= 180.0F) {
         this.N += 360.0F;
      }

      while (this.aV - this.aW < -180.0F) {
         this.aW -= 360.0F;
      }

      while (this.aV - this.aW >= 180.0F) {
         this.aW += 360.0F;
      }

      while (this.dN() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dN() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aX - this.aY < -180.0F) {
         this.aY -= 360.0F;
      }

      while (this.aX - this.aY >= 180.0F) {
         this.aY += 360.0F;
      }

      $$8.c();
      if (this.fJ()) {
         this.bo++;
      } else {
         this.bo = 0;
      }

      if (this.fR()) {
         this.x(0.0F);
      }

      this.u();
      this.aZ.a();
   }

   private void G() {
      Map<bxd, czy> $$0 = this.H();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bxd, czy> H() {
      Map<bxd, czy> $$0 = null;

      for (bxd $$1 : bxd.j) {
         czy $$2 = this.bI.get($$1);
         czy $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bxd.class);
            }

            $$0.put($$1, $$3);
            byx $$4 = this.fa();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<bxd, czy> $$5 : $$0.entrySet()) {
            bxd $$6 = $$5.getKey();
            czy $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1x) -> {
                  byw $$2 = this.bF.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1x.a());
                     $$2.b($$1x);
                  }
               });
               if (this.dV() instanceof ars $$8) {
                  dgn.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(czy $$0, czy $$1) {
      return !czy.a($$1, $$0);
   }

   private void a(Map<bxd, czy> $$0) {
      czy $$1 = $$0.get(bxd.a);
      czy $$2 = $$0.get(bxd.b);
      if ($$1 != null && $$2 != null && czy.a($$1, this.bI.get(bxd.b)) && czy.a($$2, this.bI.get(bxd.a))) {
         ((ars)this.dV()).m().b(this, new acz(this, (byte)55));
         $$0.remove(bxd.a);
         $$0.remove(bxd.b);
         this.bI.put(bxd.a, $$1.v());
         this.bI.put(bxd.b, $$2.v());
      }
   }

   private void b(Map<bxd, czy> $$0) {
      List<Pair<bxd, czy>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         czy $$3 = $$2.v();
         $$1.add(Pair.of($$1x, $$3));
         this.bI.put($$1x, $$3);
      });
      ((ars)this.dV()).m().b(this, new afi(this.ao(), $$1));
   }

   protected void C(float $$0) {
      float $$1 = azo.h($$0 - this.aV);
      this.aV += $$1 * 0.3F;
      float $$2 = azo.h(this.dL() - this.aV);
      float $$3 = this.fp();
      if (Math.abs($$2) > $$3) {
         this.aV = this.aV + ($$2 - (float)azo.j((double)$$2) * $$3);
      }
   }

   protected float fp() {
      return 50.0F;
   }

   public void k_() {
      if (this.bQ > 0) {
         this.bQ--;
      }

      if (this.bQ()) {
         this.R_().e();
      } else if (!this.di()) {
         this.i(this.dy().c(0.98));
      }

      if (this.bl > 0) {
         this.a(this.bl, this.bk);
         this.bl--;
      }

      this.bt.a((bwt)this);
      ffq $$0 = this.dy();
      double $$1 = $$0.d;
      double $$2 = $$0.e;
      double $$3 = $$0.f;
      if (this.an().equals(bxc.bT)) {
         if ($$0.j() < 9.0E-6) {
            $$1 = 0.0;
            $$3 = 0.0;
         }
      } else {
         if (Math.abs($$0.d) < 0.003) {
            $$1 = 0.0;
         }

         if (Math.abs($$0.f) < 0.003) {
            $$3 = 0.0;
         }
      }

      if (Math.abs($$0.e) < 0.003) {
         $$2 = 0.0;
      }

      this.n($$1, $$2, $$3);
      brb $$4 = bra.a();
      $$4.a("ai");
      this.fq();
      if (this.fg()) {
         this.bf = false;
         this.bg = 0.0F;
         this.bi = 0.0F;
      } else if (this.dj() && !this.dV().C) {
         $$4.a("newAi");
         this.fu();
         $$4.c();
      }

      $$4.c();
      $$4.a("jump");
      if (this.bf && this.em()) {
         double $$5;
         if (this.bv()) {
            $$5 = this.b(axj.b);
         } else {
            $$5 = this.b(axj.a);
         }

         boolean $$7 = this.bi() && $$5 > 0.0;
         double $$8 = this.dp();
         if (!$$7 || this.aH() && !($$5 > $$8)) {
            if (!this.bv() || this.aH() && !($$5 > $$8)) {
               if ((this.aH() || $$7 && $$5 <= $$8) && this.bQ == 0) {
                  this.s();
                  this.bQ = 10;
               }
            } else {
               this.c(axj.b);
            }
         } else {
            this.c(axj.a);
         }
      } else {
         this.bQ = 0;
      }

      $$4.c();
      $$4.a("travel");
      if (this.fJ()) {
         this.fs();
      }

      ffl $$9 = this.cR();
      ffq $$10 = new ffq((double)this.bg, (double)this.bh, (double)this.bi);
      if (this.b(bvz.B) || this.b(bvz.y)) {
         this.k();
      }

      label122: {
         if (this.cW() instanceof crx $$11 && this.bJ()) {
            this.c($$11, $$10);
            break label122;
         }

         if (this.di()) {
            this.a_($$10);
         }
      }

      if (!this.dV().A_() || this.dg()) {
         this.aI();
      }

      if (this.dV().A_()) {
         this.r(this instanceof cjy);
      }

      $$4.c();
      if (this.dV() instanceof ars $$12) {
         $$4.a("freezing");
         if (!this.av || !this.dJ()) {
            this.k(Math.max(0, this.cu() - 2));
         }

         this.ei();
         this.ej();
         if (this.af % 40 == 0 && this.cw() && this.dJ()) {
            this.a($$12, this.dW().v(), 1.0F);
         }

         $$4.c();
      }

      $$4.a("push");
      if (this.bp > 0) {
         this.bp--;
         this.a($$9, this.cR());
      }

      this.o();
      $$4.c();
      if (this.dV() instanceof ars $$13 && this.fr() && this.bk()) {
         this.a($$13, this.dW().i(), 1.0F);
      }
   }

   protected void fq() {
      this.bg *= 0.98F;
      this.bi *= 0.98F;
   }

   public boolean fr() {
      return false;
   }

   protected void fs() {
      this.cy();
      if (!this.dV().C) {
         if (!this.ft()) {
            this.b(7, false);
            return;
         }

         int $$0 = this.bo + 1;
         if ($$0 % 10 == 0) {
            int $$1 = $$0 / 10;
            if ($$1 % 2 == 0) {
               List<bxd> $$2 = bxd.j.stream().filter($$0x -> b(this.a($$0x), $$0x)).toList();
               bxd $$3 = ag.a($$2, this.ae);
               this.a($$3).a(1, this, $$3);
            }

            this.a(ege.n);
         }
      }
   }

   protected boolean ft() {
      if (!this.aH() && !this.bY() && !this.b(bvz.y)) {
         for (bxd $$0 : bxd.j) {
            if (b(this.a($$0), $$0)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   protected void fu() {
   }

   @Override
   protected void o() {
      List<bwt> $$0 = this.dV().i(this, this.cR());
      if (!$$0.isEmpty()) {
         if (this.dV() instanceof ars $$1) {
            int $$2 = $$1.O().d(djt.w);
            if ($$2 > 0 && $$0.size() > $$2 - 1 && this.ae.a(4) == 0) {
               int $$3 = 0;

               for (bwt $$4 : $$0) {
                  if (!$$4.bY()) {
                     $$3++;
                  }
               }

               if ($$3 > $$2 - 1) {
                  this.a($$1, this.dW().h(), 6.0F);
               }
            }
         }

         for (bwt $$5 : $$0) {
            this.D($$5);
         }
      }
   }

   protected void a(ffl $$0, ffl $$1) {
      ffl $$2 = $$0.b($$1);
      List<bwt> $$3 = this.dV().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bwt $$4 : $$3) {
            if ($$4 instanceof bxu) {
               this.f((bxu)$$4);
               this.bp = 0;
               this.i(this.dy().c(-0.2));
               break;
            }
         }
      } else if (this.P) {
         this.bp = 0;
      }

      if (!this.dV().C && this.bp <= 0) {
         this.c(4, false);
         this.bq = 0.0F;
         this.br = null;
      }
   }

   protected void D(bwt $$0) {
      $$0.h(this);
   }

   protected void f(bxu $$0) {
   }

   public boolean fv() {
      return (this.al.a(aC) & 4) != 0;
   }

   @Override
   public void bO() {
      bwt $$0 = this.dk();
      super.bO();
      if ($$0 != null && $$0 != this.dk() && !this.dV().C) {
         this.c($$0);
      }
   }

   @Override
   public void r() {
      super.r();
      this.k();
   }

   @Override
   public bxp R_() {
      return this.bj;
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bk = (double)$$0;
      this.bl = $$1;
   }

   public void s(boolean $$0) {
      this.bf = $$0;
   }

   public void a(coc $$0) {
      bwt $$1 = $$0.q();
      if ($$1 instanceof art) {
         aq.R.a((art)$$1, $$0.f(), this);
      }
   }

   public void a(bwt $$0, int $$1) {
      if (!$$0.dQ() && !this.dV().C && ($$0 instanceof coc || $$0 instanceof csf || $$0 instanceof bxh)) {
         ((ars)this.dV()).m().b($$0, new agd($$0.ao(), this.ao(), $$1));
      }
   }

   public boolean E(bwt $$0) {
      return this.a($$0, dje.a.a, dje.b.a, $$0.dE());
   }

   public boolean a(bwt $$0, dje.a $$1, dje.b $$2, double $$3) {
      if ($$0.dV() != this.dV()) {
         return false;
      } else {
         ffq $$4 = new ffq(this.dA(), this.dE(), this.dG());
         ffq $$5 = new ffq($$0.dA(), $$3, $$0.dG());
         return $$5.f($$4) > 128.0 ? false : this.dV().a(new dje($$4, $$5, $$1, $$2, this)).d() == ffo.a.a;
      }
   }

   @Override
   public float j(float $$0) {
      return $$0 == 1.0F ? this.aX : azo.i($$0, this.aY, this.aX);
   }

   public float D(float $$0) {
      float $$1 = this.aR - this.aQ;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aQ + $$1 * $$0;
   }

   @Override
   public boolean bF() {
      return !this.dQ();
   }

   @Override
   public boolean bG() {
      return this.bJ() && !this.Z_() && !this.d_();
   }

   @Override
   public float cA() {
      return this.aX;
   }

   @Override
   public void r(float $$0) {
      this.aX = $$0;
   }

   @Override
   public void s(float $$0) {
      this.aV = $$0;
   }

   @Override
   public ffq a(jb.a $$0, m.a $$1) {
      return k(super.a($$0, $$1));
   }

   public static ffq k(ffq $$0) {
      return new ffq($$0.d, $$0.e, 0.0);
   }

   public float fw() {
      return this.bR;
   }

   public final void E(float $$0) {
      this.F(azo.a($$0, 0.0F, this.eV()));
   }

   protected void F(float $$0) {
      this.bR = $$0;
   }

   public void e_() {
   }

   public void N_() {
   }

   protected void fx() {
      this.bK = true;
   }

   public abstract bxl fy();

   public boolean fz() {
      return (this.al.a(aC) & 1) > 0;
   }

   public buq fA() {
      return (this.al.a(aC) & 2) > 0 ? buq.b : buq.a;
   }

   private void I() {
      if (this.fz()) {
         if (czy.b(this.b(this.fA()), this.bm)) {
            this.bm = this.b(this.fA());
            this.a(this.bm);
         } else {
            this.fF();
         }
      }
   }

   @Nullable
   private coc b(czy $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dE() - 0.3F;
         coc $$4 = new coc(this.dV(), this.dA(), $$3, this.dG(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ae.i() * 0.5F;
            float $$6 = this.ae.i() * (float) (Math.PI * 2);
            $$4.n((double)(-azo.a($$6) * $$5), 0.2F, (double)(azo.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = azo.a(this.dN() * (float) (Math.PI / 180.0));
            float $$9 = azo.b(this.dN() * (float) (Math.PI / 180.0));
            float $$10 = azo.a(this.dL() * (float) (Math.PI / 180.0));
            float $$11 = azo.b(this.dL() * (float) (Math.PI / 180.0));
            float $$12 = this.ae.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.ae.i();
            $$4.n(
               (double)(-$$10 * $$9 * 0.3F) + Math.cos((double)$$12) * (double)$$13,
               (double)(-$$8 * 0.3F + 0.1F + (this.ae.i() - this.ae.i()) * 0.1F),
               (double)($$11 * $$9 * 0.3F) + Math.sin((double)$$12) * (double)$$13
            );
         }

         return $$4;
      }
   }

   protected void a(czy $$0) {
      $$0.b(this.dV(), this, this.fC());
      if (--this.bn == 0 && !this.dV().C && !$$0.x()) {
         this.O_();
      }
   }

   private void J() {
      this.bX = this.bW;
      if (this.ck()) {
         this.bW = Math.min(1.0F, this.bW + 0.09F);
      } else {
         this.bW = Math.max(0.0F, this.bW - 0.09F);
      }
   }

   protected void c(int $$0, boolean $$1) {
      int $$2 = this.al.a(aC);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.al.a(aC, (byte)$$2);
   }

   public void c(buq $$0) {
      czy $$1 = this.b($$0);
      if (!$$1.f() && !this.fz()) {
         this.bm = $$1;
         this.bn = $$1.a(this);
         if (!this.dV().C) {
            this.c(1, true);
            this.c(2, $$0 == buq.b);
            this.a(ege.D);
         }
      }
   }

   @Override
   public void a(akl<?> $$0) {
      super.a($$0);
      if (bD.equals($$0)) {
         if (this.dV().C) {
            this.fP().ifPresent(this::a);
         }
      } else if (aC.equals($$0) && this.dV().C) {
         if (this.fz() && this.bm.f()) {
            this.bm = this.b(this.fA());
            if (!this.bm.f()) {
               this.bn = this.bm.a(this);
            }
         } else if (!this.fz() && !this.bm.f()) {
            this.bm = czy.k;
            this.bn = 0;
         }
      }
   }

   @Override
   public void a(ev.a $$0, ffq $$1) {
      super.a($$0, $$1);
      this.aY = this.aX;
      this.aV = this.aX;
      this.aW = this.aV;
   }

   @Override
   public float u(float $$0) {
      return azo.h($$0, this.aW, this.aV);
   }

   public void b(czy $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ffq $$3 = new ffq(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dN() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dL() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ae.i()) * 0.6 - 0.3;
         ffq $$5 = new ffq(((double)this.ae.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dN() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dL() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dA(), this.dE(), this.dG());
         this.dV().a(new lu(ly.U, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void O_() {
      if (!this.dV().C || this.fz()) {
         buq $$0 = this.fA();
         if (!this.bm.equals(this.b($$0))) {
            this.fE();
         } else {
            if (!this.bm.f() && this.fz()) {
               czy $$1 = this.bm.a(this.dV(), this);
               if ($$1 != this.bm) {
                  this.a($$0, $$1);
               }

               this.fF();
            }
         }
      }
   }

   public void b(czy $$0) {
   }

   public czy fB() {
      return this.bm;
   }

   public int fC() {
      return this.bn;
   }

   public int fD() {
      return this.fz() ? this.bm.a(this) - this.fC() : 0;
   }

   public void fE() {
      if (!this.bm.f()) {
         this.bm.a(this.dV(), this, this.fC());
         if (this.bm.x()) {
            this.I();
         }
      }

      this.fF();
   }

   public void fF() {
      if (!this.dV().C) {
         boolean $$0 = this.fz();
         this.c(1, false);
         if ($$0) {
            this.a(ege.C);
         }
      }

      this.bm = czy.k;
      this.bn = 0;
   }

   public boolean fG() {
      return this.fH() != null;
   }

   @Nullable
   public czy fH() {
      if (!this.fz()) {
         return null;
      } else {
         dbz $$0 = this.bm.a(kk.I);
         if ($$0 != null) {
            int $$1 = this.bm.h().a(this.bm, this) - this.bn;
            if ($$1 >= $$0.a()) {
               return this.bm;
            }
         }

         return null;
      }
   }

   public boolean fI() {
      return this.cc();
   }

   public boolean fJ() {
      return this.i(7);
   }

   @Override
   public boolean ck() {
      return super.ck() || !this.fJ() && this.c(byg.b);
   }

   public int fK() {
      return this.bo;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dA();
      double $$5 = this.dC();
      double $$6 = this.dG();
      double $$7 = $$1;
      boolean $$8 = false;
      iv $$9 = iv.a($$0, $$1, $$2);
      djx $$10 = this.dV();
      if ($$10.C($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.K_()) {
            iv $$12 = $$9.e();
            ebe $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.b($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cR())) {
               $$8 = true;
            }
         }
      }

      if (!$$8) {
         this.b($$4, $$5, $$6);
         return false;
      } else {
         if ($$3) {
            $$10.a(this, (byte)46);
         }

         if (this instanceof byc $$14) {
            $$14.O().m();
         }

         return true;
      }
   }

   public boolean fL() {
      return !this.eH();
   }

   public boolean fM() {
      return true;
   }

   public void a(iv $$0, boolean $$1) {
   }

   public boolean fN() {
      return false;
   }

   @Override
   public final bww a(byg $$0) {
      return $$0 == byg.c ? aD : this.e($$0).a(this.el());
   }

   protected bww e(byg $$0) {
      return this.an().n().a(this.ek());
   }

   public ImmutableList<byg> fO() {
      return ImmutableList.of(byg.a);
   }

   public ffl f(byg $$0) {
      bww $$1 = this.a($$0);
      return new ffl((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(byg $$0) {
      ffl $$1 = this.a($$0).a(this.dt());
      return this.dV().b(this, $$1);
   }

   @Override
   public boolean n(boolean $$0) {
      return super.n($$0) && !this.fR();
   }

   public Optional<iv> fP() {
      return this.al.a(bD);
   }

   public void g(iv $$0) {
      this.al.a(bD, Optional.of($$0));
   }

   public void fQ() {
      this.al.a(bD, Optional.empty());
   }

   public boolean fR() {
      return this.fP().isPresent();
   }

   public void b(iv $$0) {
      if (this.bY()) {
         this.bO();
      }

      ebe $$1 = this.dV().a_($$0);
      if ($$1.b() instanceof dmv) {
         this.dV().a($$0, $$1.b(dmv.c, Boolean.valueOf(true)), 3);
      }

      this.b(byg.c);
      this.a($$0);
      this.g($$0);
      this.i(ffq.c);
      this.ar = true;
   }

   private void a(iv $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean L() {
      return this.fP().map($$0 -> this.dV().a_($$0).b() instanceof dmv).orElse(false);
   }

   public void fS() {
      this.fP().filter(this.dV()::C).ifPresent($$0x -> {
         ebe $$1 = this.dV().a_($$0x);
         if ($$1.b() instanceof dmv) {
            jb $$2 = $$1.c(dmv.e);
            this.dV().a($$0x, $$1.b(dmv.c, Boolean.valueOf(false)), 3);
            ffq $$3 = dmv.a(this.an(), this.dV(), $$0x, $$2, this.dL()).orElseGet(() -> {
               iv $$1x = $$0x.d();
               return new ffq((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            ffq $$4 = ffq.c($$0x).d($$3).d();
            float $$5 = (float)azo.d(azo.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.w($$5);
            this.x(0.0F);
         }
      });
      ffq $$0 = this.dt();
      this.b(byg.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fQ();
   }

   @Nullable
   public jb fT() {
      iv $$0 = this.fP().orElse(null);
      return $$0 != null ? dmv.a(this.dV(), $$0) : null;
   }

   @Override
   public boolean bK() {
      return !this.fR() && super.bK();
   }

   public czy d(czy $$0) {
      return czy.k;
   }

   private static byte g(bxd $$0) {
      return switch ($$0) {
         case a -> 47;
         case b -> 48;
         case f -> 49;
         case e -> 50;
         case c -> 52;
         case d -> 51;
         case g -> 65;
         case h -> 68;
      };
   }

   public void a(czu $$0, bxd $$1) {
      this.dV().a(this, g($$1));
      this.a(this.a($$1), $$1, this.bF);
   }

   private void a(czy $$0, bxd $$1, byx $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         byw $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      dgn.a($$0, this, $$1);
   }

   public static bxd d(buq $$0) {
      return $$0 == buq.a ? bxd.a : bxd.b;
   }

   public final boolean e(czy $$0) {
      if (this.bJ() && !this.Z_()) {
         dih $$1 = $$0.a(kk.D);
         if ($$1 != null && $$1.g()) {
            bxd $$2 = $$1.b();
            return this.e($$2) && $$1.a(this.an()) ? this.a($$2).f() && this.f($$2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected boolean f(bxd $$0) {
      return true;
   }

   public final bxd f(czy $$0) {
      dih $$1 = $$0.a(kk.D);
      return $$1 != null && this.e($$1.b()) ? $$1.b() : bxd.a;
   }

   public final boolean a(czy $$0, bxd $$1) {
      dih $$2 = $$0.a(kk.D);
      return $$2 == null ? $$1 == bxd.a && this.e(bxd.a) : $$1 == $$2.b() && this.e($$2.b()) && $$2.a(this.an());
   }

   private static byl a(bxu $$0, bxd $$1) {
      return $$1 != bxd.f && $$1 != bxd.a && $$1 != bxd.b ? byl.a($$0, $$1, $$2 -> $$2.f() || $$0.f($$2) == $$1) : byl.a($$0, $$1);
   }

   @Nullable
   private static bxd r(int $$0) {
      if ($$0 == 100 + bxd.f.b()) {
         return bxd.f;
      } else if ($$0 == 100 + bxd.e.b()) {
         return bxd.e;
      } else if ($$0 == 100 + bxd.d.b()) {
         return bxd.d;
      } else if ($$0 == 100 + bxd.c.b()) {
         return bxd.c;
      } else if ($$0 == 98) {
         return bxd.a;
      } else if ($$0 == 99) {
         return bxd.b;
      } else if ($$0 == 105) {
         return bxd.g;
      } else {
         return $$0 == 106 ? bxd.h : null;
      }
   }

   @Override
   public byl a_(int $$0) {
      bxd $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dJ() {
      if (this.Z_()) {
         return false;
      } else {
         for (bxd $$0 : bxe.i) {
            if (this.a($$0).a(axm.br)) {
               return false;
            }
         }

         return super.dJ();
      }
   }

   @Override
   public boolean cn() {
      return !this.dV().A_() && this.b(bvz.x) || super.cn();
   }

   @Override
   public float dM() {
      return this.aV;
   }

   @Override
   public void a(abx $$0) {
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      float $$4 = $$0.n();
      float $$5 = $$0.m();
      this.e($$1, $$2, $$3);
      this.aV = $$0.o();
      this.aX = $$0.o();
      this.aW = this.aV;
      this.aY = this.aX;
      this.e($$0.b());
      this.a_($$0.e());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.n($$0.j(), $$0.k(), $$0.l());
   }

   public float fU() {
      ddg $$0 = this.dZ().a(kk.B);
      return $$0 != null ? $$0.b() : 0.0F;
   }

   @Override
   public float dP() {
      float $$0 = (float)this.h(bza.B);
      return this.cW() instanceof crx ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public ffq m(bwt $$0) {
      return this.dt().e(this.a($$0, this.a(this.at()), this.el() * this.ek()));
   }

   protected void a(int $$0, double $$1) {
      this.aX = (float)azo.e(1.0 / (double)$$0, (double)this.aX, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(azo.c((double)$$0 * this.h(bza.h)));
   }

   public boolean fV() {
      return false;
   }

   public boolean a(ars $$0, bvi $$1) {
      return this.d($$1) || dgn.a($$0, this, $$1);
   }

   public static boolean b(czy $$0, bxd $$1) {
      if (!$$0.c(kk.F)) {
         return false;
      } else {
         dih $$2 = $$0.a(kk.D);
         return $$2 != null && $$1 == $$2.b() && !$$0.r();
      }
   }

   @VisibleForTesting
   public int fW() {
      return this.bb;
   }

   public static record a(awo a, awo b) {
   }
}
