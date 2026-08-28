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

public abstract class bxw extends bwv implements bwo {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "active_effects";
   private static final alk c = alk.b("powder_snow");
   private static final alk d = alk.b("sprinting");
   private static final bza e = new bza(d, 0.3F, bza.a.c);
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
   protected static final akn<Byte> aC = akr.a(bxw.class, akp.a);
   private static final akn<Float> by = akr.a(bxw.class, akp.d);
   private static final akn<List<lx>> bz = akr.a(bxw.class, akp.m);
   private static final akn<Boolean> bA = akr.a(bxw.class, akp.k);
   private static final akn<Integer> bB = akr.a(bxw.class, akp.b);
   private static final akn<Integer> bC = akr.a(bxw.class, akp.b);
   private static final akn<Optional<iw>> bD = akr.a(bxw.class, akp.p);
   private static final int bE = 15;
   protected static final bwy aD = bwy.c(0.2F, 0.2F).b(0.2F);
   public static final float aE = 0.5F;
   public static final float aF = 0.5F;
   public static final String aG = "attributes";
   public static final Predicate<bxw> aH = $$0 -> {
      if ($$0 instanceof crz $$1) {
         daa $$3 = $$1.a(bxf.f);
         return !$$3.a(axo.ct);
      } else {
         return true;
      }
   };
   private final byz bF;
   private final bvh bG = new bvh(this);
   private final Map<jg<bvx>, bvz> bH = Maps.newHashMap();
   private final Map<bxf, daa> bI = ag.a(bxf.class, $$0x -> daa.k);
   public boolean aI;
   private boolean bJ = false;
   public bus aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public float aQ;
   public float aR;
   protected int aS;
   public final byv aT = new byv();
   public final int aU = 20;
   public float aV;
   public float aW;
   public float aX;
   public float aY;
   public final bwu aZ = new bwu(this);
   @Nullable
   protected bxb<crz> ba;
   protected int bb;
   protected boolean bc;
   protected int bd;
   protected float be;
   protected boolean bf;
   public float bg;
   public float bh;
   public float bi;
   protected bxr bj = new bxr(this);
   protected double bk;
   protected int bl;
   private boolean bK = true;
   @Nullable
   private bxb<bxw> bL;
   private int bM;
   @Nullable
   private bxw bN;
   private int bO;
   private float bP;
   private int bQ;
   private float bR;
   protected daa bm = daa.k;
   protected int bn;
   protected int bo;
   private iw bS;
   private Optional<iw> bT = Optional.empty();
   @Nullable
   private bvk bU;
   private long bV;
   protected int bp;
   protected float bq;
   @Nullable
   protected daa br;
   private float bW;
   private float bX;
   protected byw<?> bs;
   private boolean bY;
   private final EnumMap<bxf, Reference2ObjectMap<dgn, Set<dhf>>> bZ = new EnumMap<>(bxf.class);
   protected final bwz bt;

   protected bxw(bxe<? extends bxw> $$0, djz $$1) {
      super($$0, $$1);
      this.bF = new byz(bzd.a($$0));
      this.d(this.eU());
      this.bt = this.eb();
      this.I = true;
      this.av();
      this.w((float)(Math.random() * (float) (Math.PI * 2)));
      this.aX = this.dL();
      uo $$2 = uo.a;
      this.bs = this.a(new Dynamic($$2, (va)$$2.createMap(ImmutableMap.of($$2.a("memories"), (va)$$2.emptyMap()))));
   }

   @Contract(
      pure = true
   )
   protected bwz eb() {
      return new bwz();
   }

   public byw<?> ec() {
      return this.bs;
   }

   protected byw.b<?> ed() {
      return byw.a(ImmutableList.of(), ImmutableList.of());
   }

   protected byw<?> a(Dynamic<?> $$0) {
      return this.ed().a($$0);
   }

   @Override
   public void c(aru $$0) {
      this.a($$0, this.dW().y(), Float.MAX_VALUE);
   }

   public boolean a(bxe<?> $$0) {
      return true;
   }

   @Override
   protected void a(akr.a $$0) {
      $$0.a(aC, (byte)0);
      $$0.a(bz, List.of());
      $$0.a(bA, false);
      $$0.a(bB, 0);
      $$0.a(bC, 0);
      $$0.a(by, 1.0F);
      $$0.a(bD, Optional.empty());
   }

   public static bzb.a ee() {
      return bzb.a()
         .a(bzc.s)
         .a(bzc.p)
         .a(bzc.v)
         .a(bzc.a)
         .a(bzc.b)
         .a(bzc.r)
         .a(bzc.B)
         .a(bzc.y)
         .a(bzc.n)
         .a(bzc.x)
         .a(bzc.k)
         .a(bzc.o)
         .a(bzc.w)
         .a(bzc.h)
         .a(bzc.i)
         .a(bzc.F)
         .a(bzc.u)
         .a(bzc.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, ebg $$2, iw $$3) {
      if (!this.bi()) {
         this.bp();
      }

      if (this.dV() instanceof aru $$4 && $$1 && this.Z > 0.0) {
         this.b($$4, $$3);
         double $$5 = (double)Math.max(0, azq.a(this.h(this.Z)));
         if ($$5 > 0.0 && !$$2.l()) {
            double $$6 = this.dA();
            double $$7 = this.dC();
            double $$8 = this.dG();
            iw $$9 = this.dv();
            if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
               double $$10 = $$6 - (double)$$3.u() - 0.5;
               double $$11 = $$8 - (double)$$3.w() - 0.5;
               double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
               $$6 = (double)$$3.u() + 0.5 + $$10 / $$12 * 0.5;
               $$8 = (double)$$3.w() + 0.5 + $$11 / $$12 * 0.5;
            }

            double $$13 = Math.min(0.2F + $$5 / 15.0, 2.5);
            int $$14 = (int)(150.0 * $$13);
            $$4.a(new lr(lz.b, $$2), $$6, $$7, $$8, $$14, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.bT = Optional.empty();
      }
   }

   public final boolean ef() {
      return this.an().a(axj.m);
   }

   public float a(float $$0) {
      return azq.h($$0, this.bX, this.bW);
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

      if (this.dV() instanceof aru $$0) {
         dgp.b($$0, this);
      }

      super.aw();
      brd $$1 = brc.a();
      $$1.a("livingEntityBaseTick");
      if (this.bh() || this.dV().C) {
         this.aF();
      }

      if (this.bJ() && this.dV() instanceof aru $$2) {
         boolean $$3 = this instanceof crz;
         if (this.bK()) {
            this.a($$2, this.dW().g(), 1.0F);
         } else if ($$3 && !$$2.E_().a(this.cR())) {
            double $$4 = $$2.E_().a(this) + $$2.E_().n();
            if ($$4 < 0.0) {
               double $$5 = $$2.E_().o();
               if ($$5 > 0.0) {
                  this.a($$2, this.dW().x(), (float)Math.max(1, azq.a(-$$4 * $$5)));
               }
            }
         }

         if (this.a(axl.a) && !$$2.a_(iw.a(this.dA(), this.dE(), this.dG())).a(dng.nJ)) {
            boolean $$6 = !this.ef() && !bwa.c(this) && (!$$3 || !((crz)this).gk().a);
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

         iw $$7 = this.dv();
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

      if (this.aj > 0 && !(this instanceof arv)) {
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

      bxw $$8 = this.er();
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
      return azq.h((float)this.h(bzc.u), super.aS(), 1.0F);
   }

   public float eh() {
      return 0.0F;
   }

   protected void ei() {
      byy $$0 = this.g(bzc.v);
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
            byy $$1 = this.g(bzc.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cv();
            $$1.b(new bza(c, (double)$$2, bza.a.a));
         }
      }
   }

   protected void b(aru $$0, iw $$1) {
      dgp.a($$0, this);
   }

   public boolean n_() {
      return false;
   }

   public float ek() {
      return this.n_() ? 0.5F : 1.0F;
   }

   public final float el() {
      byz $$0 = this.fa();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bzc.y));
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
         this.a(bwv.d.a);
      }
   }

   public boolean eo() {
      return !this.n_();
   }

   protected boolean ep() {
      return !this.n_();
   }

   protected int l(int $$0) {
      byy $$1 = this.g(bzc.w);
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

   public final int a(aru $$0, @Nullable bwv $$1) {
      return dgp.a($$0, $$1, this, this.e($$0));
   }

   protected int e(aru $$0) {
      return 0;
   }

   protected boolean eq() {
      return false;
   }

   @Nullable
   public bxw er() {
      return bxb.a(this.bL, this.dV(), bxw.class);
   }

   @Nullable
   public crz es() {
      return bxb.a(this.ba, this.dV(), crz.class);
   }

   @Override
   public bxw aj() {
      return this.er();
   }

   public int et() {
      return this.bM;
   }

   public void a(crz $$0, int $$1) {
      this.a(new bxb<>($$0), $$1);
   }

   public void a(UUID $$0, int $$1) {
      this.a(new bxb<>($$0), $$1);
   }

   private void a(bxb<crz> $$0, int $$1) {
      this.ba = $$0;
      this.bb = $$1;
   }

   public void a(@Nullable bxw $$0) {
      this.bL = $$0 != null ? new bxb<>($$0) : null;
      this.bM = this.af;
   }

   @Nullable
   public bxw eu() {
      return this.bN;
   }

   public int ev() {
      return this.bO;
   }

   public void B(bwv $$0) {
      if ($$0 instanceof bxw) {
         this.bN = (bxw)$$0;
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

   protected boolean b(bxf $$0) {
      return true;
   }

   public void a(bxf $$0, daa $$1, daa $$2) {
      if (!this.dV().A_() && !this.Z_()) {
         if (!daa.c($$1, $$2) && !this.ak) {
            dij $$3 = $$2.a(kl.D);
            if (!this.ba() && $$3 != null && $$0 == $$3.b()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), this.a($$0, $$2, $$3), this.dm(), 1.0F, 1.0F, this.ae.g());
            }

            if (this.b($$0)) {
               this.a($$3 != null ? egg.v : egg.S);
            }
         }
      }
   }

   protected jg<awq> a(bxf $$0, daa $$1, dij $$2) {
      return $$2.c();
   }

   @Override
   public void a(bwv.d $$0) {
      if (($$0 == bwv.d.a || $$0 == bwv.d.b) && this.dV() instanceof aru $$1) {
         this.a($$1, $$0);
      }

      super.a($$0);
      this.bs.a();
   }

   protected void a(aru $$0, bwv.d $$1) {
      for (bvz $$2 : this.eD()) {
         $$2.a($$0, this, $$1);
      }

      this.bH.clear();
   }

   @Override
   public void b(ua $$0) {
      $$0.a("Health", this.eG());
      $$0.a("HurtTime", (short)this.aN);
      $$0.a("HurtByTimestamp", this.bM);
      $$0.a("DeathTime", (short)this.aP);
      $$0.a("AbsorptionAmount", this.fw());
      $$0.a("attributes", this.fa().d());
      ali<va> $$1 = this.dX().a(uo.a);
      if (!this.bH.isEmpty()) {
         $$0.a("active_effects", bvz.d.listOf(), $$1, List.copyOf(this.bH.values()));
      }

      $$0.a("FallFlying", this.fJ());
      this.fP().ifPresent($$1x -> $$0.a("sleeping_pos", iw.a, $$1x));
      DataResult<va> $$2 = this.bs.a(uo.a);
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
         $$0.a("equipment", bwz.a, $$1, this.bt);
      }
   }

   @Nullable
   public coe a(daa $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else if (this.dV().C) {
         this.a(bus.a);
         return null;
      } else {
         coe $$3 = this.b($$0, $$1, $$2);
         if ($$3 != null) {
            this.dV().b($$3);
         }

         return $$3;
      }
   }

   @Override
   public void a(ua $$0) {
      this.F($$0.b("AbsorptionAmount", 0.0F));
      if (this.dV() != null && !this.dV().C) {
         $$0.o("attributes").ifPresent(this.fa()::a);
      }

      ali<va> $$1 = this.dX().a(uo.a);
      List<bvz> $$2 = $$0.<List<bvz>>a("active_effects", bvz.d.listOf(), $$1).orElse(List.of());
      this.bH.clear();

      for (bvz $$3 : $$2) {
         this.bH.put($$3.c(), $$3);
      }

      this.d($$0.b("Health", this.eU()));
      this.aN = $$0.b("HurtTime", (short)0);
      this.aP = $$0.b("DeathTime", (short)0);
      this.bM = $$0.b("HurtByTimestamp", 0);
      $$0.i("Team").ifPresent($$0x -> {
         fgx $$1x = this.dV().R();
         fgs $$2x = $$1x.b($$0x);
         boolean $$3x = $$2x != null && $$1x.a(this.cH(), $$2x);
         if (!$$3x) {
            a.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$0x);
         }
      });
      this.b(7, $$0.b("FallFlying", false));
      $$0.<iw>a("sleeping_pos", iw.a).ifPresentOrElse($$0x -> {
         this.g($$0x);
         this.al.a(aq, byi.c);
         if (!this.ak) {
            this.a($$0x);
         }
      }, this::fQ);
      $$0.m("Brain").ifPresent($$0x -> this.bs = this.a(new Dynamic(uo.a, $$0x)));
      this.ba = bxb.b($$0, "last_hurt_by_player");
      this.bb = $$0.b("last_hurt_by_player_memory_time", 0);
      this.bL = bxb.b($$0, "last_hurt_by_mob");
      this.bM = $$0.b("ticks_since_last_hurt_by_mob", 0) + this.af;
      this.bt.a($$0.<bwz>a("equipment", bwz.a, $$1).orElseGet(bwz::new));
   }

   protected void ey() {
      if (this.dV() instanceof aru $$0) {
         Iterator<jg<bvx>> $$1 = this.bH.keySet().iterator();

         try {
            while ($$1.hasNext()) {
               jg<bvx> $$2 = $$1.next();
               bvz $$3 = this.bH.get($$2);
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
         for (bvz $$4 : this.bH.values()) {
            $$4.i();
         }

         List<lx> $$5 = this.al.a(bz);
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
         this.k(this.b(bwb.n));
         this.j();
      }
   }

   private void j() {
      List<lx> $$0 = this.bH.values().stream().filter(bvz::g).map(bvz::a).toList();
      this.al.a(bz, $$0);
      this.al.a(bA, d(this.bH.values()));
   }

   private void q() {
      boolean $$0 = this.cn();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable bwv $$0) {
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
         daa $$3 = this.a(bxf.f);
         bxe<?> $$4 = $$0.an();
         if ($$4 == bxe.bg && $$3.a(dae.vv)
            || $$4 == bxe.bP && $$3.a(dae.vy)
            || $$4 == bxe.aS && $$3.a(dae.vB)
            || $$4 == bxe.aT && $$3.a(dae.vB)
            || $$4 == bxe.F && $$3.a(dae.vz)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bxw $$0) {
      return $$0 instanceof crz && this.dV().an() == buq.a ? false : $$0.ez();
   }

   public boolean ez() {
      return !this.cC() && this.eA();
   }

   public boolean eA() {
      return !this.Z_() && this.bJ();
   }

   public static boolean d(Collection<bvz> $$0) {
      for (bvz $$1 : $$0) {
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
         Map<jg<bvx>, bvz> $$0 = Maps.newHashMap(this.bH);
         this.bH.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<bvz> eD() {
      return this.bH.values();
   }

   public Map<jg<bvx>, bvz> eE() {
      return this.bH;
   }

   public boolean b(jg<bvx> $$0) {
      return this.bH.containsKey($$0);
   }

   @Nullable
   public bvz c(jg<bvx> $$0) {
      return this.bH.get($$0);
   }

   public float a(jg<bvx> $$0, float $$1) {
      bvz $$2 = this.c($$0);
      return $$2 != null ? $$2.a(this, $$1) : 0.0F;
   }

   public final boolean a(bvz $$0) {
      return this.b($$0, null);
   }

   public boolean b(bvz $$0, @Nullable bwv $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         bvz $$2 = this.bH.get($$0.c());
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

   public boolean b(bvz $$0) {
      if (this.an().a(axj.G)) {
         return !$$0.a(bwb.M);
      } else if (this.an().a(axj.F)) {
         return !$$0.a(bwb.L);
      } else {
         return !this.an().a(axj.w) ? true : !$$0.a(bwb.j) && !$$0.a(bwb.s);
      }
   }

   public void c(bvz $$0, @Nullable bwv $$1) {
      if (this.b($$0)) {
         bvz $$2 = this.bH.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eF() {
      return this.an().a(axj.x);
   }

   @Nullable
   public final bvz d(jg<bvx> $$0) {
      return this.bH.remove($$0);
   }

   public boolean e(jg<bvx> $$0) {
      bvz $$1 = this.d($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(bvz $$0, @Nullable bwv $$1) {
      if (!this.dV().C) {
         this.bK = true;
         $$0.c().a().a(this.fa(), $$0.e());
         this.c($$0);
      }
   }

   public void c(bvz $$0) {
      for (bwv $$1 : this.cY()) {
         if ($$1 instanceof arv $$2) {
            $$2.f.b(new agm(this.ao(), $$0, false));
         }
      }
   }

   protected void a(bvz $$0, boolean $$1, @Nullable bwv $$2) {
      if (!this.dV().C) {
         this.bK = true;
         if ($$1) {
            bvx $$3 = $$0.c().a();
            $$3.a(this.fa());
            $$3.a(this.fa(), $$0.e());
            this.u();
         }

         this.c($$0);
      }
   }

   protected void c(Collection<bvz> $$0) {
      if (!this.dV().C) {
         this.bK = true;

         for (bvz $$1 : $$0) {
            $$1.c().a().a(this.fa());

            for (bwv $$2 : this.cY()) {
               if ($$2 instanceof arv $$3) {
                  $$3.f.b(new aeo(this.ao(), $$1.c()));
               }
            }
         }

         this.u();
      }
   }

   private void u() {
      Set<byy> $$0 = this.fa().b();

      for (byy $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(jg<byx> $$0) {
      if ($$0.a(bzc.s)) {
         float $$1 = this.eU();
         if (this.eG() > $$1) {
            this.d($$1);
         }
      } else if ($$0.a(bzc.r)) {
         float $$2 = this.eV();
         if (this.fw() > $$2) {
            this.E($$2);
         }
      } else if ($$0.a(bzc.y)) {
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
      this.al.a(by, azq.a($$0, 0.0F, this.eU()));
   }

   public boolean eH() {
      return this.eG() <= 0.0F;
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.eH()) {
         return false;
      } else if ($$1.a(axh.i) && this.b(bwb.l)) {
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
         if ($$1.a(axh.o) && this.an().a(axj.l)) {
            $$2 *= 5.0F;
         }

         if ($$1.a(axh.a) && !this.a(bxf.f).f()) {
            this.d($$1, $$2);
            $$2 *= 0.75F;
         }

         if (Float.isNaN($$2) || Float.isInfinite($$2)) {
            $$2 = Float.MAX_VALUE;
         }

         boolean $$6 = true;
         if ((float)this.aj > 10.0F && !$$1.a(axh.e)) {
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
            dcb $$7 = this.fB().a(kl.I);
            if ($$5 && $$7 != null) {
               $$7.a($$0, this);
            } else {
               $$0.a(this, $$1);
            }

            if (!$$1.a(axh.r) && (!$$5 || $$2 > 0.0F)) {
               this.bB();
            }

            if (!$$1.a(axh.z)) {
               double $$8 = 0.0;
               double $$9 = 0.0;
               if ($$1.c() instanceof csu $$10) {
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

            for (bvz $$13 : this.eD()) {
               $$13.a($$0, this, $$1, $$2);
            }
         }

         if (this instanceof arv $$14) {
            aq.i.a($$14, $$1, $$2, $$2, $$5);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               $$14.a(axb.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$1.d() instanceof arv $$15) {
            aq.h.a($$15, this, $$1, $$2, $$2, $$5);
         }

         return $$12;
      }
   }

   public float b(aru $$0, bvk $$1, float $$2) {
      if ($$2 <= 0.0F) {
         return 0.0F;
      } else {
         daa $$3 = this.fH();
         if ($$3 == null) {
            return 0.0F;
         } else {
            dcb $$4 = $$3.a(kl.I);
            if ($$4 != null && !$$4.f().map($$1::a).orElse(false)) {
               if ($$1.c() instanceof csh $$5 && $$5.u() > 0) {
                  return 0.0F;
               }

               ffs $$6 = $$1.i();
               double $$9;
               if ($$6 != null) {
                  ffs $$7 = this.d(0.0F, this.cA());
                  ffs $$8 = $$6.d(this.dt());
                  $$8 = new ffs($$8.d, 0.0, $$8.f).d();
                  $$9 = Math.acos($$8.b($$7));
               } else {
                  $$9 = (float) Math.PI;
               }

               float $$11 = $$4.a($$1, $$2, $$9);
               $$4.a(this.dV(), $$3, this, this.fA(), $$11);
               if (!$$1.a(axh.j) && $$1.c() instanceof bxw $$13) {
                  this.b($$0, $$13);
               }

               return $$11;
            } else {
               return 0.0F;
            }
         }
      }
   }

   private void i(bvk $$0) {
      if ($$0.a(bvn.P)) {
         aws $$1 = this instanceof crz ? aws.h : aws.f;
         this.dV().a(null, this.dt().d, this.dt().e, this.dt().f, awr.AB, $$1);
      }
   }

   protected void f(bvk $$0) {
      if ($$0.d() instanceof bxw $$1 && !$$0.a(axh.q) && (!$$0.a(bvn.I) || !this.an().a(axj.E))) {
         this.a($$1);
      }
   }

   @Nullable
   protected crz g(bvk $$0) {
      bwv $$1 = $$0.d();
      if ($$1 instanceof crz $$2) {
         this.a($$2, 100);
      } else if ($$1 instanceof cmo $$3 && $$3.q()) {
         if ($$3.d() != null) {
            this.a($$3.d().c(), 100);
         } else {
            this.ba = null;
            this.bb = 0;
         }
      }

      return bxb.a(this.ba, this.dV(), crz.class);
   }

   protected void b(aru $$0, bxw $$1) {
      $$1.d(this);
   }

   protected void d(bxw $$0) {
      $$0.p(0.5, $$0.dA() - this.dA(), $$0.dG() - this.dG());
   }

   private boolean j(bvk $$0) {
      if ($$0.a(axh.d)) {
         return false;
      } else {
         daa $$1 = null;
         dcl $$2 = null;

         for (bus $$3 : bus.values()) {
            daa $$4 = this.b($$3);
            $$2 = $$4.a(kl.H);
            if ($$2 != null) {
               $$1 = $$4.v();
               $$4.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof arv $$5) {
               $$5.b(axb.c.b($$1.h()));
               aq.C.a($$5, $$1);
               this.a(egg.C);
            }

            this.d(1.0F);
            $$2.a($$1, this);
            this.dV().a(this, (byte)35);
         }

         return $$2 != null;
      }
   }

   @Nullable
   public bvk eI() {
      if (this.dV().ae() - this.bV > 40L) {
         this.bU = null;
      }

      return this.bU;
   }

   protected void h(bvk $$0) {
      this.b(this.e($$0));
   }

   public void b(@Nullable awq $$0) {
      if ($$0 != null) {
         this.a($$0, this.fe(), this.ff());
      }
   }

   private void g(daa $$0) {
      if (!$$0.f()) {
         jg<awq> $$1 = $$0.a(kl.au);
         if ($$1 != null && !this.ba()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), $$1.a(), this.dm(), 0.8F, 0.8F + this.dV().A.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(bvk $$0) {
      if (!this.dQ() && !this.bc) {
         bwv $$1 = $$0.d();
         bxw $$2 = this.eT();
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
         if (this.dV() instanceof aru $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(egg.p);
               this.b($$3, $$0);
               this.e($$2);
            }

            this.dV().a(this, (byte)3);
         }

         this.b(byi.h);
      }
   }

   protected void e(@Nullable bxw $$0) {
      if (this.dV() instanceof aru $$1) {
         boolean var6 = false;
         if ($$0 instanceof cnr) {
            if ($$1.O().c(djv.d)) {
               iw $$4 = this.dv();
               ebg $$5 = dng.cn.m();
               if (this.dV().a_($$4).l() && $$5.a((dkc)this.dV(), $$4)) {
                  this.dV().a($$4, $$5, 3);
                  var6 = true;
               }
            }

            if (!var6) {
               coe $$6 = new coe(this.dV(), this.dA(), this.dC(), this.dG(), new daa(dae.dJ));
               this.dV().b($$6);
            }
         }
      }
   }

   protected void b(aru $$0, bvk $$1) {
      boolean $$2 = this.bb > 0;
      if (this.ep() && $$0.O().c(djv.g)) {
         this.b($$0, $$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.f($$0);
      this.b($$0, $$1.d());
   }

   protected void f(aru $$0) {
   }

   protected void b(aru $$0, @Nullable bwv $$1) {
      if (!this.eL() && (this.eq() || this.bb > 0 && this.eo() && $$0.O().c(djv.g))) {
         bxj.a($$0, this.dt(), this.a($$0, $$1));
      }
   }

   protected void a(aru $$0, bvk $$1, boolean $$2) {
   }

   public long eJ() {
      return 0L;
   }

   protected float b(bwv $$0, bvk $$1) {
      float $$2 = (float)this.h(bzc.d);
      return this.dV() instanceof aru $$3 ? dgp.d($$3, this.dZ(), $$0, $$1, $$2) : $$2;
   }

   protected void b(aru $$0, bvk $$1, boolean $$2) {
      Optional<alj<fao>> $$3 = this.ea();
      if (!$$3.isEmpty()) {
         fao $$4 = $$0.p().bc().b($$3.get());
         fam.a $$5 = new fam.a($$0).a(fdd.a, this).a(fdd.f, this.dt()).a(fdd.c, $$1).b(fdd.d, $$1.d()).b(fdd.e, $$1.c());
         crz $$6 = this.es();
         if ($$2 && $$6 != null) {
            $$5 = $$5.a(fdd.b, $$6).a($$6.eh());
         }

         fam $$7 = $$5.a(fdc.g);
         $$4.a($$7, this.eJ(), $$1x -> this.a($$0, $$1x));
      }
   }

   public boolean a(aru $$0, alj<fao> $$1, BiConsumer<aru, daa> $$2) {
      return this.a($$0, $$1, $$0x -> $$0x.a(fdd.f, this.dt()).a(fdd.a, this).a(fdc.j), $$2);
   }

   protected void a(aru $$0, alj<fao> $$1, daa $$2, BiConsumer<aru, daa> $$3) {
      this.a($$0, $$1, $$1x -> $$1x.a(fdd.f, this.dt()).a(fdd.a, this).a(fdd.i, $$2).a(fdc.s), $$3);
   }

   protected boolean a(aru $$0, alj<fao> $$1, Function<fam.a, fam> $$2, BiConsumer<aru, daa> $$3) {
      fao $$4 = $$0.p().bc().b($$1);
      fam $$5 = $$2.apply(new fam.a($$0));
      List<daa> $$6 = $$4.a($$5);
      if (!$$6.isEmpty()) {
         $$6.forEach($$2x -> $$3.accept($$0, $$2x));
         return true;
      } else {
         return false;
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(bzc.p);
      if (!($$0 <= 0.0)) {
         this.ar = true;
         ffs $$3 = this.dy();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         ffs $$4 = new ffs($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aH() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected awq e(bvk $$0) {
      return awr.kK;
   }

   @Nullable
   protected awq l_() {
      return awr.kF;
   }

   private awq q(int $$0) {
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

   protected ffn eN() {
      ffn $$0 = this.cR();
      bwv $$1 = this.dk();
      if ($$1 != null) {
         ffs $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<dgn, Set<dhf>> c(bxf $$0) {
      return (Map<dgn, Set<dhf>>)this.bZ.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public bxw.a eO() {
      return new bxw.a(awr.kL, awr.kD);
   }

   public Optional<iw> eP() {
      return this.bT;
   }

   public boolean d_() {
      if (this.Z_()) {
         return false;
      } else {
         iw $$0 = this.dv();
         ebg $$1 = this.dw();
         if ($$1.a(axg.aS)) {
            this.bT = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dwg && this.c($$0, $$1)) {
            this.bT = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(iw $$0, ebg $$1) {
      if (!$$1.c(dwg.b)) {
         return false;
      } else {
         ebg $$2 = this.dV().a_($$0.e());
         return $$2.a(dng.da) && $$2.c(drp.b) == $$1.c(dwg.e);
      }
   }

   @Override
   public boolean bJ() {
      return !this.dQ() && this.eG() > 0.0F;
   }

   public boolean a(bxw $$0, double $$1, boolean $$2, boolean $$3, double... $$4) {
      ffs $$5 = $$0.h(1.0F).d();

      for (double $$6 : $$4) {
         ffs $$7 = new ffs(this.dA() - $$0.dA(), $$6 - $$0.dE(), this.dG() - $$0.dG());
         double $$8 = $$7.g();
         $$7 = $$7.d();
         double $$9 = $$5.b($$7);
         if ($$9 > 1.0 - $$1 / ($$2 ? $$8 : 1.0) && $$0.a(this, $$3 ? djg.a.c : djg.a.a, djg.b.a, $$6)) {
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
      return azq.d($$0 + 3.0F);
   }

   @Override
   public boolean a(double $$0, float $$1, bvk $$2) {
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
      if (this.an().a(axj.o)) {
         return 0;
      } else {
         double $$2 = this.h($$0);
         return azq.a($$2 * (double)$$1 * this.h(bzc.k));
      }
   }

   private double h(double $$0) {
      return $$0 + 1.0E-6 - this.h(bzc.x);
   }

   protected void eQ() {
      if (!this.ba()) {
         int $$0 = azq.a(this.dA());
         int $$1 = azq.a(this.dC() - 0.2F);
         int $$2 = azq.a(this.dG());
         ebg $$3 = this.dV().a_(new iw($$0, $$1, $$2));
         if (!$$3.l()) {
            dvb $$4 = $$3.A();
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
      return azq.a(this.h(bzc.a));
   }

   protected void c(bvk $$0, float $$1) {
   }

   protected void d(bvk $$0, float $$1) {
   }

   protected void a(bvk $$0, float $$1, bxf... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bxf $$4 : $$2) {
            daa $$5 = this.a($$4);
            dij $$6 = $$5.a(kl.D);
            if ($$6 != null && $$6.i() && $$5.m() && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float e(bvk $$0, float $$1) {
      if (!$$0.a(axh.b)) {
         this.c($$0, $$1);
         $$1 = bvg.a(this, $$1, $$0, (float)this.eR(), (float)this.h(bzc.b));
      }

      return $$1;
   }

   protected float f(bvk $$0, float $$1) {
      if ($$0.a(axh.f)) {
         return $$1;
      } else {
         if (this.b(bwb.k) && !$$0.a(axh.g)) {
            int $$2 = (this.c(bwb.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof arv) {
                  ((arv)this).a(axb.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof arv) {
                  ((arv)$$0.d()).a(axb.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(axh.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dV() instanceof aru $$7) {
               $$8 = dgp.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = bvg.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void c(aru $$0, bvk $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var10 = Math.max($$2 - this.fw(), 0.0F);
         this.E(this.fw() - ($$2 - var10));
         float $$4 = $$2 - var10;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F && $$1.d() instanceof arv $$5) {
            $$5.a(axb.H, Math.round($$4 * 10.0F));
         }

         if (var10 != 0.0F) {
            this.eS().a($$1, var10);
            this.d(this.eG() - var10);
            this.E(this.fw() - var10);
            this.a(egg.o);
         }
      }
   }

   public bvh eS() {
      return this.bG;
   }

   @Nullable
   public bxw eT() {
      if (this.ba != null) {
         return this.ba.a(this.dV(), crz.class);
      } else {
         return this.bL != null ? this.bL.a(this.dV(), bxw.class) : null;
      }
   }

   public final float eU() {
      return (float)this.h(bzc.s);
   }

   public final float eV() {
      return (float)this.h(bzc.r);
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
      if (bwa.a(this)) {
         return 6 - (1 + bwa.b(this));
      } else {
         return this.b(bwb.d) ? 6 + (1 + this.c(bwb.d).e()) * 2 : 6;
      }
   }

   public void a(bus $$0) {
      this.a($$0, false);
   }

   public void a(bus $$0, boolean $$1) {
      if (!this.aI || this.aK >= this.D() / 2 || this.aK < 0) {
         this.aK = -1;
         this.aI = true;
         this.aJ = $$0;
         if (this.dV() instanceof aru) {
            aca $$2 = new aca(this, $$0 == bus.a ? 0 : 3);
            arr $$3 = ((aru)this.dV()).m();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bvk $$0) {
      this.aT.a(1.5F);
      this.aj = 20;
      this.aO = 10;
      this.aN = this.aO;
      awq $$1 = this.e($$0);
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
            awq $$1 = this.l_();
            if ($$1 != null) {
               this.a($$1, this.fe(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof crz)) {
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
               double $$8 = azq.d($$4, this.K, this.dA()) + (this.ae.j() - 0.5) * (double)this.dq() * 2.0;
               double $$9 = azq.d($$4, this.L, this.dC()) + this.ae.j() * (double)this.dr();
               double $$10 = azq.d($$4, this.M, this.dG()) + (this.ae.j() - 0.5) * (double)this.dq() * 2.0;
               this.dV().a(lz.af, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.g(this.a(bxf.a));
            break;
         case 48:
            this.g(this.a(bxf.b));
            break;
         case 49:
            this.g(this.a(bxf.f));
            break;
         case 50:
            this.g(this.a(bxf.e));
            break;
         case 51:
            this.g(this.a(bxf.d));
            break;
         case 52:
            this.g(this.a(bxf.c));
            break;
         case 54:
            drd.b(this);
            break;
         case 55:
            this.F();
            break;
         case 60:
            this.eY();
            break;
         case 65:
            this.g(this.a(bxf.g));
            break;
         case 67:
            this.E();
            break;
         case 68:
            this.g(this.a(bxf.h));
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
         this.dV().a(lz.ae, this.d(1.0) - $$1 * 10.0, this.dD() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
      }
   }

   private void E() {
      ffs $$0 = this.dy();

      for (int $$1 = 0; $$1 < 8; $$1++) {
         double $$2 = this.ae.a(0.0, 1.0);
         double $$3 = this.ae.a(0.0, 1.0);
         double $$4 = this.ae.a(0.0, 1.0);
         this.dV().a(lz.d, this.dA() + $$2, this.dC() + $$3, this.dG() + $$4, $$0.d, $$0.e, $$0.f);
      }
   }

   private void F() {
      daa $$0 = this.a(bxf.b);
      this.a(bxf.b, this.a(bxf.a));
      this.a(bxf.a, $$0);
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
   public byy g(jg<byx> $$0) {
      return this.fa().a($$0);
   }

   public double h(jg<byx> $$0) {
      return this.fa().c($$0);
   }

   public double i(jg<byx> $$0) {
      return this.fa().d($$0);
   }

   public byz fa() {
      return this.bF;
   }

   public daa fb() {
      return this.a(bxf.a);
   }

   public daa fc() {
      return this.a(bxf.b);
   }

   public daa a(bxn $$0) {
      return this.fy() == $$0 ? this.fb() : this.fc();
   }

   @Nonnull
   @Override
   public daa dZ() {
      return this.fb();
   }

   public boolean b(czw $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<daa> $$0) {
      return $$0.test(this.fb()) || $$0.test(this.fc());
   }

   public daa b(bus $$0) {
      if ($$0 == bus.a) {
         return this.a(bxf.a);
      } else if ($$0 == bus.b) {
         return this.a(bxf.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bus $$0, daa $$1) {
      if ($$0 == bus.a) {
         this.a(bxf.a, $$1);
      } else {
         if ($$0 != bus.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bxf.b, $$1);
      }
   }

   public boolean d(bxf $$0) {
      return !this.a($$0).f();
   }

   public boolean e(bxf $$0) {
      return true;
   }

   public daa a(bxf $$0) {
      return this.bt.a($$0);
   }

   public void a(bxf $$0, daa $$1) {
      this.a($$0, this.bt.a($$0, $$1), $$1);
   }

   public float fd() {
      int $$0 = 0;
      int $$1 = 0;

      for (bxf $$2 : bxg.i) {
         if ($$2.a() == bxf.a.b) {
            daa $$3 = this.a($$2);
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
      byy $$1 = this.g(bzc.v);
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
   public void h(bwv $$0) {
      if (!this.fR()) {
         super.h($$0);
      }
   }

   private void c(bwv $$0) {
      ffs $$1;
      if (this.dQ()) {
         $$1 = this.dt();
      } else if (!$$0.dQ() && !this.dV().a_($$0.dv()).a(axg.aM)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dC(), $$0.dC());
         $$1 = new ffs(this.dA(), $$2, this.dG());
         boolean $$4 = this.dq() <= 4.0F && this.dr() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.dr() / 2.0;
            ffs $$6 = $$1.b(0.0, $$5, 0.0);
            fgm $$7 = fgj.a(ffn.a($$6, (double)this.dq(), (double)this.dr(), (double)this.dq()));
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
      return (float)this.h(bzc.o) * $$0 * this.aR() + this.fi();
   }

   public float fi() {
      return this.b(bwb.h) ? 0.1F * ((float)this.c(bwb.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void s() {
      float $$0 = this.fh();
      if (!($$0 <= 1.0E-5F)) {
         ffs $$1 = this.dy();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.ci()) {
            float $$2 = this.dL() * (float) (Math.PI / 180.0);
            this.j(new ffs((double)(-azq.a($$2)) * 0.2, 0.0, (double)azq.b($$2) * 0.2));
         }

         this.ar = true;
      }
   }

   protected void fj() {
      this.i(this.dy().b(0.0, -0.04F, 0.0));
   }

   protected void c(axv<exp> $$0) {
      this.i(this.dy().b(0.0, 0.04F, 0.0));
   }

   protected float fk() {
      return 0.8F;
   }

   public boolean a(exq $$0) {
      return false;
   }

   @Override
   protected double bc() {
      return this.h(bzc.n);
   }

   protected double fl() {
      boolean $$0 = this.dy().e <= 0.0;
      return $$0 && this.b(bwb.B) ? Math.min(this.bd(), 0.01) : this.bd();
   }

   public void a_(ffs $$0) {
      exq $$1 = this.dV().b_(this.dv());
      if ((this.bi() || this.bv()) && this.em() && !this.a($$1)) {
         this.m($$0);
      } else if (this.fJ()) {
         this.n($$0);
      } else {
         this.l($$0);
      }
   }

   private void l(ffs $$0) {
      iw $$1 = this.aP();
      float $$2 = this.aH() ? this.dV().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      ffs $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      bvz $$6 = this.c(bwb.y);
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
         float $$7 = this instanceof cka ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void m(ffs $$0) {
      boolean $$1 = this.dy().e <= 0.0;
      double $$2 = this.dC();
      double $$3 = this.fl();
      if (this.bi()) {
         float $$4 = this.ci() ? 0.9F : this.fk();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(bzc.F);
         if (!this.aH()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fo() - $$5) * $$6;
         }

         if (this.b(bwb.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(bya.a, this.dy());
         ffs $$7 = this.dy();
         if (this.P && this.d_()) {
            $$7 = new ffs($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.i(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(bya.a, this.dy());
         if (this.b(axl.b) <= this.dp()) {
            this.i(this.dy().d(0.5, 0.8F, 0.5));
            ffs $$8 = this.a($$3, $$1, this.dy());
            this.i($$8);
         } else {
            this.i(this.dy().c(0.5));
         }

         if ($$3 != 0.0) {
            this.i(this.dy().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      ffs $$9 = this.dy();
      if (this.P && this.f($$9.d, $$9.e + 0.6F - this.dC() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void n(ffs $$0) {
      if (this.d_()) {
         this.l($$0);
         this.fm();
      } else {
         ffs $$1 = this.dy();
         double $$2 = $$1.i();
         this.i(this.o($$1));
         this.a(bya.a, this.dy());
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

   private ffs o(ffs $$0) {
      ffs $$1 = this.bS();
      float $$2 = this.dN() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fl();
      double $$6 = azq.k(Math.cos((double)$$2));
      $$0 = $$0.b(0.0, $$5 * (-1.0 + $$6 * 0.75), 0.0);
      if ($$0.e < 0.0 && $$3 > 0.0) {
         double $$7 = $$0.e * -0.1 * $$6;
         $$0 = $$0.b($$1.d * $$7 / $$3, $$7, $$1.f * $$7 / $$3);
      }

      if ($$2 < 0.0F && $$3 > 0.0) {
         double $$8 = $$4 * (double)(-azq.a($$2)) * 0.04;
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

   private void c(crz $$0, ffs $$1) {
      ffs $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.di()) {
         this.B(this.c($$0));
         this.a_($$2);
      } else {
         this.i(ffs.c);
      }
   }

   protected void a(crz $$0, ffs $$1) {
   }

   protected ffs b(crz $$0, ffs $$1) {
      return $$1;
   }

   protected float c(crz $$0) {
      return this.fo();
   }

   public void r(boolean $$0) {
      float $$1 = (float)azq.g(this.dA() - this.K, $$0 ? this.dC() - this.L : 0.0, this.dG() - this.M);
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

   private ffs a(ffs $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.i(this.p(this.dy()));
      this.a(bya.a, this.dy());
      ffs $$2 = this.dy();
      if ((this.P || this.bf) && (this.d_() || this.aw && dtf.a(this))) {
         $$2 = new ffs($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public ffs a(double $$0, boolean $$1, ffs $$2) {
      if ($$0 != 0.0 && !this.ci()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new ffs($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private ffs p(ffs $$0) {
      if (this.d_()) {
         this.k();
         float $$1 = 0.15F;
         double $$2 = azq.a($$0.d, -0.15F, 0.15F);
         double $$3 = azq.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dw().a(dng.oy) && this.fI() && this instanceof crz) {
            $$4 = 0.0;
         }

         $$0 = new ffs($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aH() ? this.fo() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fn();
   }

   protected float fn() {
      return this.cW() instanceof crz ? this.fo() * 0.1F : 0.02F;
   }

   public float fo() {
      return this.bP;
   }

   public void B(float $$0) {
      this.bP = $$0;
   }

   public boolean c(aru $$0, bwv $$1) {
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
         float $$6 = (float)azq.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$7 = azq.e(azq.h(this.dL()) - $$6);
         if (95.0F < $$7 && $$7 < 265.0F) {
            $$5 = $$6 - 180.0F;
         } else {
            $$5 = $$6;
         }
      }

      if (this.aR > 0.0F) {
         $$5 = this.dL();
      }

      brd $$8 = brc.a();
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
      Map<bxf, daa> $$0 = this.H();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bxf, daa> H() {
      Map<bxf, daa> $$0 = null;

      for (bxf $$1 : bxf.j) {
         daa $$2 = this.bI.get($$1);
         daa $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bxf.class);
            }

            $$0.put($$1, $$3);
            byz $$4 = this.fa();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<bxf, daa> $$5 : $$0.entrySet()) {
            bxf $$6 = $$5.getKey();
            daa $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1x) -> {
                  byy $$2 = this.bF.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1x.a());
                     $$2.b($$1x);
                  }
               });
               if (this.dV() instanceof aru $$8) {
                  dgp.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(daa $$0, daa $$1) {
      return !daa.a($$1, $$0);
   }

   private void a(Map<bxf, daa> $$0) {
      daa $$1 = $$0.get(bxf.a);
      daa $$2 = $$0.get(bxf.b);
      if ($$1 != null && $$2 != null && daa.a($$1, this.bI.get(bxf.b)) && daa.a($$2, this.bI.get(bxf.a))) {
         ((aru)this.dV()).m().b(this, new adb(this, (byte)55));
         $$0.remove(bxf.a);
         $$0.remove(bxf.b);
         this.bI.put(bxf.a, $$1.v());
         this.bI.put(bxf.b, $$2.v());
      }
   }

   private void b(Map<bxf, daa> $$0) {
      List<Pair<bxf, daa>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         daa $$3 = $$2.v();
         $$1.add(Pair.of($$1x, $$3));
         this.bI.put($$1x, $$3);
      });
      ((aru)this.dV()).m().b(this, new afk(this.ao(), $$1));
   }

   protected void C(float $$0) {
      float $$1 = azq.h($$0 - this.aV);
      this.aV += $$1 * 0.3F;
      float $$2 = azq.h(this.dL() - this.aV);
      float $$3 = this.fp();
      if (Math.abs($$2) > $$3) {
         this.aV = this.aV + ($$2 - (float)azq.j((double)$$2) * $$3);
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

      this.bt.a((bwv)this);
      ffs $$0 = this.dy();
      double $$1 = $$0.d;
      double $$2 = $$0.e;
      double $$3 = $$0.f;
      if (this.an().equals(bxe.bT)) {
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
      brd $$4 = brc.a();
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
            $$5 = this.b(axl.b);
         } else {
            $$5 = this.b(axl.a);
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
               this.c(axl.b);
            }
         } else {
            this.c(axl.a);
         }
      } else {
         this.bQ = 0;
      }

      $$4.c();
      $$4.a("travel");
      if (this.fJ()) {
         this.fs();
      }

      ffn $$9 = this.cR();
      ffs $$10 = new ffs((double)this.bg, (double)this.bh, (double)this.bi);
      if (this.b(bwb.B) || this.b(bwb.y)) {
         this.k();
      }

      label122: {
         if (this.cW() instanceof crz $$11 && this.bJ()) {
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
         this.r(this instanceof cka);
      }

      $$4.c();
      if (this.dV() instanceof aru $$12) {
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
      if (this.dV() instanceof aru $$13 && this.fr() && this.bk()) {
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
               List<bxf> $$2 = bxf.j.stream().filter($$0x -> b(this.a($$0x), $$0x)).toList();
               bxf $$3 = ag.a($$2, this.ae);
               this.a($$3).a(1, this, $$3);
            }

            this.a(egg.n);
         }
      }
   }

   protected boolean ft() {
      if (!this.aH() && !this.bY() && !this.b(bwb.y)) {
         for (bxf $$0 : bxf.j) {
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
      List<bwv> $$0 = this.dV().i(this, this.cR());
      if (!$$0.isEmpty()) {
         if (this.dV() instanceof aru $$1) {
            int $$2 = $$1.O().d(djv.w);
            if ($$2 > 0 && $$0.size() > $$2 - 1 && this.ae.a(4) == 0) {
               int $$3 = 0;

               for (bwv $$4 : $$0) {
                  if (!$$4.bY()) {
                     $$3++;
                  }
               }

               if ($$3 > $$2 - 1) {
                  this.a($$1, this.dW().h(), 6.0F);
               }
            }
         }

         for (bwv $$5 : $$0) {
            this.D($$5);
         }
      }
   }

   protected void a(ffn $$0, ffn $$1) {
      ffn $$2 = $$0.b($$1);
      List<bwv> $$3 = this.dV().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bwv $$4 : $$3) {
            if ($$4 instanceof bxw) {
               this.f((bxw)$$4);
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

   protected void D(bwv $$0) {
      $$0.h(this);
   }

   protected void f(bxw $$0) {
   }

   public boolean fv() {
      return (this.al.a(aC) & 4) != 0;
   }

   @Override
   public void bO() {
      bwv $$0 = this.dk();
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
   public bxr R_() {
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

   public void a(coe $$0) {
      bwv $$1 = $$0.q();
      if ($$1 instanceof arv) {
         aq.R.a((arv)$$1, $$0.f(), this);
      }
   }

   public void a(bwv $$0, int $$1) {
      if (!$$0.dQ() && !this.dV().C && ($$0 instanceof coe || $$0 instanceof csh || $$0 instanceof bxj)) {
         ((aru)this.dV()).m().b($$0, new agf($$0.ao(), this.ao(), $$1));
      }
   }

   public boolean E(bwv $$0) {
      return this.a($$0, djg.a.a, djg.b.a, $$0.dE());
   }

   public boolean a(bwv $$0, djg.a $$1, djg.b $$2, double $$3) {
      if ($$0.dV() != this.dV()) {
         return false;
      } else {
         ffs $$4 = new ffs(this.dA(), this.dE(), this.dG());
         ffs $$5 = new ffs($$0.dA(), $$3, $$0.dG());
         return $$5.f($$4) > 128.0 ? false : this.dV().a(new djg($$4, $$5, $$1, $$2, this)).d() == ffq.a.a;
      }
   }

   @Override
   public float j(float $$0) {
      return $$0 == 1.0F ? this.aX : azq.i($$0, this.aY, this.aX);
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
   public ffs a(jc.a $$0, m.a $$1) {
      return k(super.a($$0, $$1));
   }

   public static ffs k(ffs $$0) {
      return new ffs($$0.d, $$0.e, 0.0);
   }

   public float fw() {
      return this.bR;
   }

   public final void E(float $$0) {
      this.F(azq.a($$0, 0.0F, this.eV()));
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

   public abstract bxn fy();

   public boolean fz() {
      return (this.al.a(aC) & 1) > 0;
   }

   public bus fA() {
      return (this.al.a(aC) & 2) > 0 ? bus.b : bus.a;
   }

   private void I() {
      if (this.fz()) {
         if (daa.b(this.b(this.fA()), this.bm)) {
            this.bm = this.b(this.fA());
            this.a(this.bm);
         } else {
            this.fF();
         }
      }
   }

   @Nullable
   private coe b(daa $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dE() - 0.3F;
         coe $$4 = new coe(this.dV(), this.dA(), $$3, this.dG(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ae.i() * 0.5F;
            float $$6 = this.ae.i() * (float) (Math.PI * 2);
            $$4.n((double)(-azq.a($$6) * $$5), 0.2F, (double)(azq.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = azq.a(this.dN() * (float) (Math.PI / 180.0));
            float $$9 = azq.b(this.dN() * (float) (Math.PI / 180.0));
            float $$10 = azq.a(this.dL() * (float) (Math.PI / 180.0));
            float $$11 = azq.b(this.dL() * (float) (Math.PI / 180.0));
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

   protected void a(daa $$0) {
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

   public void c(bus $$0) {
      daa $$1 = this.b($$0);
      if (!$$1.f() && !this.fz()) {
         this.bm = $$1;
         this.bn = $$1.a(this);
         if (!this.dV().C) {
            this.c(1, true);
            this.c(2, $$0 == bus.b);
            this.a(egg.D);
         }
      }
   }

   @Override
   public void a(akn<?> $$0) {
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
            this.bm = daa.k;
            this.bn = 0;
         }
      }
   }

   @Override
   public void a(ew.a $$0, ffs $$1) {
      super.a($$0, $$1);
      this.aY = this.aX;
      this.aV = this.aX;
      this.aW = this.aV;
   }

   @Override
   public float u(float $$0) {
      return azq.h($$0, this.aW, this.aV);
   }

   public void b(daa $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ffs $$3 = new ffs(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dN() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dL() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ae.i()) * 0.6 - 0.3;
         ffs $$5 = new ffs(((double)this.ae.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dN() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dL() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dA(), this.dE(), this.dG());
         this.dV().a(new lv(lz.U, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void O_() {
      if (!this.dV().C || this.fz()) {
         bus $$0 = this.fA();
         if (!this.bm.equals(this.b($$0))) {
            this.fE();
         } else {
            if (!this.bm.f() && this.fz()) {
               daa $$1 = this.bm.a(this.dV(), this);
               if ($$1 != this.bm) {
                  this.a($$0, $$1);
               }

               this.fF();
            }
         }
      }
   }

   public void b(daa $$0) {
   }

   public daa fB() {
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
            this.a(egg.C);
         }
      }

      this.bm = daa.k;
      this.bn = 0;
   }

   public boolean fG() {
      return this.fH() != null;
   }

   @Nullable
   public daa fH() {
      if (!this.fz()) {
         return null;
      } else {
         dcb $$0 = this.bm.a(kl.I);
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
      return super.ck() || !this.fJ() && this.c(byi.b);
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
      iw $$9 = iw.a($$0, $$1, $$2);
      djz $$10 = this.dV();
      if ($$10.C($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.K_()) {
            iw $$12 = $$9.e();
            ebg $$13 = $$10.a_($$12);
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

         if (this instanceof bye $$14) {
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

   public void a(iw $$0, boolean $$1) {
   }

   public boolean fN() {
      return false;
   }

   @Override
   public final bwy a(byi $$0) {
      return $$0 == byi.c ? aD : this.e($$0).a(this.el());
   }

   protected bwy e(byi $$0) {
      return this.an().n().a(this.ek());
   }

   public ImmutableList<byi> fO() {
      return ImmutableList.of(byi.a);
   }

   public ffn f(byi $$0) {
      bwy $$1 = this.a($$0);
      return new ffn((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(byi $$0) {
      ffn $$1 = this.a($$0).a(this.dt());
      return this.dV().b(this, $$1);
   }

   @Override
   public boolean n(boolean $$0) {
      return super.n($$0) && !this.fR();
   }

   public Optional<iw> fP() {
      return this.al.a(bD);
   }

   public void g(iw $$0) {
      this.al.a(bD, Optional.of($$0));
   }

   public void fQ() {
      this.al.a(bD, Optional.empty());
   }

   public boolean fR() {
      return this.fP().isPresent();
   }

   public void b(iw $$0) {
      if (this.bY()) {
         this.bO();
      }

      ebg $$1 = this.dV().a_($$0);
      if ($$1.b() instanceof dmx) {
         this.dV().a($$0, $$1.b(dmx.c, Boolean.valueOf(true)), 3);
      }

      this.b(byi.c);
      this.a($$0);
      this.g($$0);
      this.i(ffs.c);
      this.ar = true;
   }

   private void a(iw $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean L() {
      return this.fP().map($$0 -> this.dV().a_($$0).b() instanceof dmx).orElse(false);
   }

   public void fS() {
      this.fP().filter(this.dV()::C).ifPresent($$0x -> {
         ebg $$1 = this.dV().a_($$0x);
         if ($$1.b() instanceof dmx) {
            jc $$2 = $$1.c(dmx.e);
            this.dV().a($$0x, $$1.b(dmx.c, Boolean.valueOf(false)), 3);
            ffs $$3 = dmx.a(this.an(), this.dV(), $$0x, $$2, this.dL()).orElseGet(() -> {
               iw $$1x = $$0x.d();
               return new ffs((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            ffs $$4 = ffs.c($$0x).d($$3).d();
            float $$5 = (float)azq.d(azq.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.w($$5);
            this.x(0.0F);
         }
      });
      ffs $$0 = this.dt();
      this.b(byi.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fQ();
   }

   @Nullable
   public jc fT() {
      iw $$0 = this.fP().orElse(null);
      return $$0 != null ? dmx.a(this.dV(), $$0) : null;
   }

   @Override
   public boolean bK() {
      return !this.fR() && super.bK();
   }

   public daa d(daa $$0) {
      return daa.k;
   }

   private static byte g(bxf $$0) {
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

   public void a(czw $$0, bxf $$1) {
      this.dV().a(this, g($$1));
      this.a(this.a($$1), $$1, this.bF);
   }

   private void a(daa $$0, bxf $$1, byz $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         byy $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      dgp.a($$0, this, $$1);
   }

   public static bxf d(bus $$0) {
      return $$0 == bus.a ? bxf.a : bxf.b;
   }

   public final boolean e(daa $$0) {
      if (this.bJ() && !this.Z_()) {
         dij $$1 = $$0.a(kl.D);
         if ($$1 != null && $$1.g()) {
            bxf $$2 = $$1.b();
            return this.e($$2) && $$1.a(this.an()) ? this.a($$2).f() && this.f($$2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected boolean f(bxf $$0) {
      return true;
   }

   public final bxf f(daa $$0) {
      dij $$1 = $$0.a(kl.D);
      return $$1 != null && this.e($$1.b()) ? $$1.b() : bxf.a;
   }

   public final boolean a(daa $$0, bxf $$1) {
      dij $$2 = $$0.a(kl.D);
      return $$2 == null ? $$1 == bxf.a && this.e(bxf.a) : $$1 == $$2.b() && this.e($$2.b()) && $$2.a(this.an());
   }

   private static byn a(bxw $$0, bxf $$1) {
      return $$1 != bxf.f && $$1 != bxf.a && $$1 != bxf.b ? byn.a($$0, $$1, $$2 -> $$2.f() || $$0.f($$2) == $$1) : byn.a($$0, $$1);
   }

   @Nullable
   private static bxf r(int $$0) {
      if ($$0 == 100 + bxf.f.b()) {
         return bxf.f;
      } else if ($$0 == 100 + bxf.e.b()) {
         return bxf.e;
      } else if ($$0 == 100 + bxf.d.b()) {
         return bxf.d;
      } else if ($$0 == 100 + bxf.c.b()) {
         return bxf.c;
      } else if ($$0 == 98) {
         return bxf.a;
      } else if ($$0 == 99) {
         return bxf.b;
      } else if ($$0 == 105) {
         return bxf.g;
      } else {
         return $$0 == 106 ? bxf.h : null;
      }
   }

   @Override
   public byn a_(int $$0) {
      bxf $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dJ() {
      if (this.Z_()) {
         return false;
      } else {
         for (bxf $$0 : bxg.i) {
            if (this.a($$0).a(axo.bs)) {
               return false;
            }
         }

         return super.dJ();
      }
   }

   @Override
   public boolean cn() {
      return !this.dV().A_() && this.b(bwb.x) || super.cn();
   }

   @Override
   public float dM() {
      return this.aV;
   }

   @Override
   public void a(abz $$0) {
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
      ddi $$0 = this.dZ().a(kl.B);
      return $$0 != null ? $$0.b() : 0.0F;
   }

   @Override
   public float dP() {
      float $$0 = (float)this.h(bzc.B);
      return this.cW() instanceof crz ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public ffs m(bwv $$0) {
      return this.dt().e(this.a($$0, this.a(this.at()), this.el() * this.ek()));
   }

   protected void a(int $$0, double $$1) {
      this.aX = (float)azq.e(1.0 / (double)$$0, (double)this.aX, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(azq.c((double)$$0 * this.h(bzc.h)));
   }

   public boolean fV() {
      return false;
   }

   public boolean a(aru $$0, bvk $$1) {
      return this.d($$1) || dgp.a($$0, this, $$1);
   }

   public static boolean b(daa $$0, bxf $$1) {
      if (!$$0.c(kl.F)) {
         return false;
      } else {
         dij $$2 = $$0.a(kl.D);
         return $$2 != null && $$1 == $$2.b() && !$$0.r();
      }
   }

   @VisibleForTesting
   public int fW() {
      return this.bb;
   }

   public static record a(awq a, awq b) {
   }
}
