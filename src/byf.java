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

public abstract class byf extends bxe implements bwx {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "active_effects";
   private static final alr c = alr.b("powder_snow");
   private static final alr d = alr.b("sprinting");
   private static final bzj e = new bzj(d, 0.3F, bzj.a.c);
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
   protected static final aku<Byte> aC = aky.a(byf.class, akw.a);
   private static final aku<Float> by = aky.a(byf.class, akw.d);
   private static final aku<List<lx>> bz = aky.a(byf.class, akw.m);
   private static final aku<Boolean> bA = aky.a(byf.class, akw.k);
   private static final aku<Integer> bB = aky.a(byf.class, akw.b);
   private static final aku<Integer> bC = aky.a(byf.class, akw.b);
   private static final aku<Optional<iw>> bD = aky.a(byf.class, akw.p);
   private static final int bE = 15;
   protected static final bxh aD = bxh.c(0.2F, 0.2F).b(0.2F);
   public static final float aE = 0.5F;
   public static final float aF = 0.5F;
   public static final String aG = "attributes";
   public static final Predicate<byf> aH = $$0 -> {
      if ($$0 instanceof csi $$1) {
         dak $$3 = $$1.a(bxo.f);
         return !$$3.a(axv.ct);
      } else {
         return true;
      }
   };
   private final bzi bF;
   private final bvq bG = new bvq(this);
   private final Map<jg<bwg>, bwi> bH = Maps.newHashMap();
   private final Map<bxo, dak> bI = ag.a(bxo.class, $$0x -> dak.l);
   public boolean aI;
   private boolean bJ = false;
   public bvb aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public float aQ;
   public float aR;
   protected int aS;
   public final bze aT = new bze();
   public final int aU = 20;
   public float aV;
   public float aW;
   public float aX;
   public float aY;
   public final bxd aZ = new bxd(this);
   @Nullable
   protected bxk<csi> ba;
   protected int bb;
   protected boolean bc;
   protected int bd;
   protected float be;
   protected boolean bf;
   public float bg;
   public float bh;
   public float bi;
   protected bya bj = new bya(this);
   protected double bk;
   protected int bl;
   private boolean bK = true;
   @Nullable
   private bxk<byf> bL;
   private int bM;
   @Nullable
   private byf bN;
   private int bO;
   private float bP;
   private int bQ;
   private float bR;
   protected dak bm = dak.l;
   protected int bn;
   protected int bo;
   private iw bS;
   private Optional<iw> bT = Optional.empty();
   @Nullable
   private bvt bU;
   private long bV;
   protected int bp;
   protected float bq;
   @Nullable
   protected dak br;
   private float bW;
   private float bX;
   protected bzf<?> bs;
   private boolean bY;
   private final EnumMap<bxo, Reference2ObjectMap<dgx, Set<dhp>>> bZ = new EnumMap<>(bxo.class);
   protected final bxi bt;

   protected byf(bxn<? extends byf> $$0, dkj $$1) {
      super($$0, $$1);
      this.bF = new bzi(bzm.a($$0));
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
   protected bxi eb() {
      return new bxi();
   }

   public bzf<?> ec() {
      return this.bs;
   }

   protected bzf.b<?> ed() {
      return bzf.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bzf<?> a(Dynamic<?> $$0) {
      return this.ed().a($$0);
   }

   @Override
   public void c(asb $$0) {
      this.a($$0, this.dW().y(), Float.MAX_VALUE);
   }

   public boolean a(bxn<?> $$0) {
      return true;
   }

   @Override
   protected void a(aky.a $$0) {
      $$0.a(aC, (byte)0);
      $$0.a(bz, List.of());
      $$0.a(bA, false);
      $$0.a(bB, 0);
      $$0.a(bC, 0);
      $$0.a(by, 1.0F);
      $$0.a(bD, Optional.empty());
   }

   public static bzk.a ee() {
      return bzk.a()
         .a(bzl.s)
         .a(bzl.p)
         .a(bzl.v)
         .a(bzl.a)
         .a(bzl.b)
         .a(bzl.r)
         .a(bzl.B)
         .a(bzl.y)
         .a(bzl.n)
         .a(bzl.x)
         .a(bzl.k)
         .a(bzl.o)
         .a(bzl.w)
         .a(bzl.h)
         .a(bzl.i)
         .a(bzl.F)
         .a(bzl.u)
         .a(bzl.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, ebq $$2, iw $$3) {
      if (!this.bi()) {
         this.bp();
      }

      if (this.dV() instanceof asb $$4 && $$1 && this.Z > 0.0) {
         this.b($$4, $$3);
         double $$5 = (double)Math.max(0, azz.a(this.h(this.Z)));
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
      return this.an().a(axq.m);
   }

   public float a(float $$0) {
      return azz.h($$0, this.bX, this.bW);
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

      if (this.dV() instanceof asb $$0) {
         dgz.b($$0, this);
      }

      super.aw();
      brm $$1 = brl.a();
      $$1.a("livingEntityBaseTick");
      if (this.bh() || this.dV().C) {
         this.aF();
      }

      if (this.bJ() && this.dV() instanceof asb $$2) {
         boolean $$3 = this instanceof csi;
         if (this.bK()) {
            this.a($$2, this.dW().g(), 1.0F);
         } else if ($$3 && !$$2.E_().a(this.cR())) {
            double $$4 = $$2.E_().a(this) + $$2.E_().n();
            if ($$4 < 0.0) {
               double $$5 = $$2.E_().o();
               if ($$5 > 0.0) {
                  this.a($$2, this.dW().x(), (float)Math.max(1, azz.a(-$$4 * $$5)));
               }
            }
         }

         if (this.a(axs.a) && !$$2.a_(iw.a(this.dA(), this.dE(), this.dG())).a(dnq.nJ)) {
            boolean $$6 = !this.ef() && !bwj.c(this) && (!$$3 || !((csi)this).gk().a);
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

      if (this.aN > 0) {
         this.aN--;
      }

      if (this.aj > 0 && !(this instanceof asc)) {
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

      byf $$8 = this.er();
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
      return azz.h((float)this.h(bzl.u), super.aS(), 1.0F);
   }

   public float eh() {
      return 0.0F;
   }

   protected void ei() {
      bzh $$0 = this.g(bzl.v);
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
            bzh $$1 = this.g(bzl.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cv();
            $$1.b(new bzj(c, (double)$$2, bzj.a.a));
         }
      }
   }

   protected void b(asb $$0, iw $$1) {
      dgz.a($$0, this);
   }

   public boolean n_() {
      return false;
   }

   public float ek() {
      return this.n_() ? 0.5F : 1.0F;
   }

   public final float el() {
      bzi $$0 = this.fa();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bzl.y));
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
         this.a(bxe.d.a);
      }
   }

   public boolean eo() {
      return !this.n_();
   }

   protected boolean ep() {
      return !this.n_();
   }

   protected int l(int $$0) {
      bzh $$1 = this.g(bzl.w);
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

   public final int a(asb $$0, @Nullable bxe $$1) {
      return dgz.a($$0, $$1, this, this.e($$0));
   }

   protected int e(asb $$0) {
      return 0;
   }

   protected boolean eq() {
      return false;
   }

   @Nullable
   public byf er() {
      return bxk.a(this.bL, this.dV(), byf.class);
   }

   @Nullable
   public csi es() {
      return bxk.a(this.ba, this.dV(), csi.class);
   }

   @Override
   public byf aj() {
      return this.er();
   }

   public int et() {
      return this.bM;
   }

   public void a(csi $$0, int $$1) {
      this.a(new bxk<>($$0), $$1);
   }

   public void a(UUID $$0, int $$1) {
      this.a(new bxk<>($$0), $$1);
   }

   private void a(bxk<csi> $$0, int $$1) {
      this.ba = $$0;
      this.bb = $$1;
   }

   public void a(@Nullable byf $$0) {
      this.bL = $$0 != null ? new bxk<>($$0) : null;
      this.bM = this.af;
   }

   @Nullable
   public byf eu() {
      return this.bN;
   }

   public int ev() {
      return this.bO;
   }

   public void B(bxe $$0) {
      if ($$0 instanceof byf) {
         this.bN = (byf)$$0;
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

   protected boolean b(bxo $$0) {
      return true;
   }

   public void a(bxo $$0, dak $$1, dak $$2) {
      if (!this.dV().A_() && !this.aa_()) {
         if (!dak.c($$1, $$2) && !this.ak) {
            dit $$3 = $$2.a(kl.D);
            if (!this.ba() && $$3 != null && $$0 == $$3.b()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), this.a($$0, $$2, $$3), this.dm(), 1.0F, 1.0F, this.ae.g());
            }

            if (this.b($$0)) {
               this.a($$3 != null ? egq.v : egq.S);
            }
         }
      }
   }

   protected jg<awx> a(bxo $$0, dak $$1, dit $$2) {
      return $$2.c();
   }

   @Override
   public void a(bxe.d $$0) {
      if (($$0 == bxe.d.a || $$0 == bxe.d.b) && this.dV() instanceof asb $$1) {
         this.a($$1, $$0);
      }

      super.a($$0);
      this.bs.a();
   }

   protected void a(asb $$0, bxe.d $$1) {
      for (bwi $$2 : this.eD()) {
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
      alp<va> $$1 = this.dX().a(uo.a);
      if (!this.bH.isEmpty()) {
         $$0.a("active_effects", bwi.d.listOf(), $$1, List.copyOf(this.bH.values()));
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
         $$0.a("equipment", bxi.a, $$1, this.bt);
      }
   }

   @Nullable
   public coo a(dak $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else if (this.dV().C) {
         this.a(bvb.a);
         return null;
      } else {
         coo $$3 = this.b($$0, $$1, $$2);
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

      alp<va> $$1 = this.dX().a(uo.a);
      List<bwi> $$2 = $$0.<List<bwi>>a("active_effects", bwi.d.listOf(), $$1).orElse(List.of());
      this.bH.clear();

      for (bwi $$3 : $$2) {
         this.bH.put($$3.c(), $$3);
      }

      this.d($$0.b("Health", this.eU()));
      this.aN = $$0.b("HurtTime", (short)0);
      this.aP = $$0.b("DeathTime", (short)0);
      this.bM = $$0.b("HurtByTimestamp", 0);
      $$0.i("Team").ifPresent($$0x -> {
         fhh $$1x = this.dV().R();
         fhc $$2x = $$1x.b($$0x);
         boolean $$3x = $$2x != null && $$1x.a(this.cH(), $$2x);
         if (!$$3x) {
            a.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$0x);
         }
      });
      this.b(7, $$0.b("FallFlying", false));
      $$0.<iw>a("sleeping_pos", iw.a).ifPresentOrElse($$0x -> {
         this.g($$0x);
         this.al.a(aq, byr.c);
         if (!this.ak) {
            this.a($$0x);
         }
      }, this::fQ);
      $$0.m("Brain").ifPresent($$0x -> this.bs = this.a(new Dynamic(uo.a, $$0x)));
      this.ba = bxk.b($$0, "last_hurt_by_player");
      this.bb = $$0.b("last_hurt_by_player_memory_time", 0);
      this.bL = bxk.b($$0, "last_hurt_by_mob");
      this.bM = $$0.b("ticks_since_last_hurt_by_mob", 0) + this.af;
      this.bt.a($$0.<bxi>a("equipment", bxi.a, $$1).orElseGet(bxi::new));
   }

   protected void ey() {
      if (this.dV() instanceof asb $$0) {
         Iterator<jg<bwg>> $$1 = this.bH.keySet().iterator();

         try {
            while ($$1.hasNext()) {
               jg<bwg> $$2 = $$1.next();
               bwi $$3 = this.bH.get($$2);
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
         for (bwi $$4 : this.bH.values()) {
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
         this.k(this.b(bwk.n));
         this.j();
      }
   }

   private void j() {
      List<lx> $$0 = this.bH.values().stream().filter(bwi::g).map(bwi::a).toList();
      this.al.a(bz, $$0);
      this.al.a(bA, d(this.bH.values()));
   }

   private void q() {
      boolean $$0 = this.cn();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable bxe $$0) {
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
         dak $$3 = this.a(bxo.f);
         bxn<?> $$4 = $$0.an();
         if ($$4 == bxn.bg && $$3.a(dao.vv)
            || $$4 == bxn.bP && $$3.a(dao.vy)
            || $$4 == bxn.aS && $$3.a(dao.vB)
            || $$4 == bxn.aT && $$3.a(dao.vB)
            || $$4 == bxn.F && $$3.a(dao.vz)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(byf $$0) {
      return $$0 instanceof csi && this.dV().an() == buz.a ? false : $$0.ez();
   }

   public boolean ez() {
      return !this.cC() && this.eA();
   }

   public boolean eA() {
      return !this.aa_() && this.bJ();
   }

   public static boolean d(Collection<bwi> $$0) {
      for (bwi $$1 : $$0) {
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
         Map<jg<bwg>, bwi> $$0 = Maps.newHashMap(this.bH);
         this.bH.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<bwi> eD() {
      return this.bH.values();
   }

   public Map<jg<bwg>, bwi> eE() {
      return this.bH;
   }

   public boolean b(jg<bwg> $$0) {
      return this.bH.containsKey($$0);
   }

   @Nullable
   public bwi c(jg<bwg> $$0) {
      return this.bH.get($$0);
   }

   public float a(jg<bwg> $$0, float $$1) {
      bwi $$2 = this.c($$0);
      return $$2 != null ? $$2.a(this, $$1) : 0.0F;
   }

   public final boolean a(bwi $$0) {
      return this.b($$0, null);
   }

   public boolean b(bwi $$0, @Nullable bxe $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         bwi $$2 = this.bH.get($$0.c());
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

   public boolean b(bwi $$0) {
      if (this.an().a(axq.G)) {
         return !$$0.a(bwk.M);
      } else if (this.an().a(axq.F)) {
         return !$$0.a(bwk.L);
      } else {
         return !this.an().a(axq.w) ? true : !$$0.a(bwk.j) && !$$0.a(bwk.s);
      }
   }

   public void c(bwi $$0, @Nullable bxe $$1) {
      if (this.b($$0)) {
         bwi $$2 = this.bH.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eF() {
      return this.an().a(axq.x);
   }

   @Nullable
   public final bwi d(jg<bwg> $$0) {
      return this.bH.remove($$0);
   }

   public boolean e(jg<bwg> $$0) {
      bwi $$1 = this.d($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(bwi $$0, @Nullable bxe $$1) {
      if (!this.dV().C) {
         this.bK = true;
         $$0.c().a().a(this.fa(), $$0.e());
         this.c($$0);
      }
   }

   public void c(bwi $$0) {
      for (bxe $$1 : this.cY()) {
         if ($$1 instanceof asc $$2) {
            $$2.f.b(new agt(this.ao(), $$0, false));
         }
      }
   }

   protected void a(bwi $$0, boolean $$1, @Nullable bxe $$2) {
      if (!this.dV().C) {
         this.bK = true;
         if ($$1) {
            bwg $$3 = $$0.c().a();
            $$3.a(this.fa());
            $$3.a(this.fa(), $$0.e());
            this.u();
         }

         this.c($$0);
      }
   }

   protected void c(Collection<bwi> $$0) {
      if (!this.dV().C) {
         this.bK = true;

         for (bwi $$1 : $$0) {
            $$1.c().a().a(this.fa());

            for (bxe $$2 : this.cY()) {
               if ($$2 instanceof asc $$3) {
                  $$3.f.b(new aev(this.ao(), $$1.c()));
               }
            }
         }

         this.u();
      }
   }

   private void u() {
      Set<bzh> $$0 = this.fa().b();

      for (bzh $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(jg<bzg> $$0) {
      if ($$0.a(bzl.s)) {
         float $$1 = this.eU();
         if (this.eG() > $$1) {
            this.d($$1);
         }
      } else if ($$0.a(bzl.r)) {
         float $$2 = this.eV();
         if (this.fw() > $$2) {
            this.E($$2);
         }
      } else if ($$0.a(bzl.y)) {
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
      this.al.a(by, azz.a($$0, 0.0F, this.eU()));
   }

   public boolean eH() {
      return this.eG() <= 0.0F;
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.eH()) {
         return false;
      } else if ($$1.a(axo.i) && this.b(bwk.l)) {
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
         if ($$1.a(axo.o) && this.an().a(axq.l)) {
            $$2 *= 5.0F;
         }

         if ($$1.a(axo.a) && !this.a(bxo.f).f()) {
            this.d($$1, $$2);
            $$2 *= 0.75F;
         }

         if (Float.isNaN($$2) || Float.isInfinite($$2)) {
            $$2 = Float.MAX_VALUE;
         }

         boolean $$6 = true;
         if ((float)this.aj > 10.0F && !$$1.a(axo.e)) {
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
            dcl $$7 = this.fB().a(kl.I);
            if ($$5 && $$7 != null) {
               $$7.a($$0, this);
            } else {
               $$0.a(this, $$1);
            }

            if (!$$1.a(axo.r) && (!$$5 || $$2 > 0.0F)) {
               this.bB();
            }

            if (!$$1.a(axo.z)) {
               double $$8 = 0.0;
               double $$9 = 0.0;
               if ($$1.c() instanceof ctd $$10) {
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

            for (bwi $$13 : this.eD()) {
               $$13.a($$0, this, $$1, $$2);
            }
         }

         if (this instanceof asc $$14) {
            aq.i.a($$14, $$1, $$2, $$2, $$5);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               $$14.a(axi.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$1.d() instanceof asc $$15) {
            aq.h.a($$15, this, $$1, $$2, $$2, $$5);
         }

         return $$12;
      }
   }

   public float b(asb $$0, bvt $$1, float $$2) {
      if ($$2 <= 0.0F) {
         return 0.0F;
      } else {
         dak $$3 = this.fH();
         if ($$3 == null) {
            return 0.0F;
         } else {
            dcl $$4 = $$3.a(kl.I);
            if ($$4 != null && !$$4.f().map($$1::a).orElse(false)) {
               if ($$1.c() instanceof csq $$5 && $$5.u() > 0) {
                  return 0.0F;
               }

               fgc $$6 = $$1.i();
               double $$9;
               if ($$6 != null) {
                  fgc $$7 = this.d(0.0F, this.cA());
                  fgc $$8 = $$6.d(this.dt());
                  $$8 = new fgc($$8.d, 0.0, $$8.f).d();
                  $$9 = Math.acos($$8.b($$7));
               } else {
                  $$9 = (float) Math.PI;
               }

               float $$11 = $$4.a($$1, $$2, $$9);
               $$4.a(this.dV(), $$3, this, this.fA(), $$11);
               if (!$$1.a(axo.j) && $$1.c() instanceof byf $$13) {
                  this.b($$0, $$13);
               }

               return $$11;
            } else {
               return 0.0F;
            }
         }
      }
   }

   private void i(bvt $$0) {
      if ($$0.a(bvw.P)) {
         awz $$1 = this instanceof csi ? awz.h : awz.f;
         this.dV().a(null, this.dt().d, this.dt().e, this.dt().f, awy.AB, $$1);
      }
   }

   protected void f(bvt $$0) {
      if ($$0.d() instanceof byf $$1 && !$$0.a(axo.q) && (!$$0.a(bvw.I) || !this.an().a(axq.E))) {
         this.a($$1);
      }
   }

   @Nullable
   protected csi g(bvt $$0) {
      bxe $$1 = $$0.d();
      if ($$1 instanceof csi $$2) {
         this.a($$2, 100);
      } else if ($$1 instanceof cmx $$3 && $$3.q()) {
         if ($$3.d() != null) {
            this.a($$3.d().c(), 100);
         } else {
            this.ba = null;
            this.bb = 0;
         }
      }

      return bxk.a(this.ba, this.dV(), csi.class);
   }

   protected void b(asb $$0, byf $$1) {
      $$1.d(this);
   }

   protected void d(byf $$0) {
      $$0.p(0.5, $$0.dA() - this.dA(), $$0.dG() - this.dG());
   }

   private boolean j(bvt $$0) {
      if ($$0.a(axo.d)) {
         return false;
      } else {
         dak $$1 = null;
         dcv $$2 = null;

         for (bvb $$3 : bvb.values()) {
            dak $$4 = this.b($$3);
            $$2 = $$4.a(kl.H);
            if ($$2 != null) {
               $$1 = $$4.v();
               $$4.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof asc $$5) {
               $$5.b(axi.c.b($$1.h()));
               aq.C.a($$5, $$1);
               this.a(egq.C);
            }

            this.d(1.0F);
            $$2.a($$1, this);
            this.dV().a(this, (byte)35);
         }

         return $$2 != null;
      }
   }

   @Nullable
   public bvt eI() {
      if (this.dV().ae() - this.bV > 40L) {
         this.bU = null;
      }

      return this.bU;
   }

   protected void h(bvt $$0) {
      this.b(this.e($$0));
   }

   public void b(@Nullable awx $$0) {
      if ($$0 != null) {
         this.a($$0, this.fe(), this.ff());
      }
   }

   private void g(dak $$0) {
      if (!$$0.f()) {
         jg<awx> $$1 = $$0.a(kl.au);
         if ($$1 != null && !this.ba()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), $$1.a(), this.dm(), 0.8F, 0.8F + this.dV().A.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(bvt $$0) {
      if (!this.dQ() && !this.bc) {
         bxe $$1 = $$0.d();
         byf $$2 = this.eT();
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
         if (this.dV() instanceof asb $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(egq.p);
               this.b($$3, $$0);
               this.e($$2);
            }

            this.dV().a(this, (byte)3);
         }

         this.b(byr.h);
      }
   }

   protected void e(@Nullable byf $$0) {
      if (this.dV() instanceof asb $$1) {
         boolean var6 = false;
         if ($$0 instanceof coa) {
            if ($$1.O().c(dkf.d)) {
               iw $$4 = this.dv();
               ebq $$5 = dnq.cn.m();
               if (this.dV().a_($$4).l() && $$5.a((dkm)this.dV(), $$4)) {
                  this.dV().a($$4, $$5, 3);
                  var6 = true;
               }
            }

            if (!var6) {
               coo $$6 = new coo(this.dV(), this.dA(), this.dC(), this.dG(), new dak(dao.dJ));
               this.dV().b($$6);
            }
         }
      }
   }

   protected void b(asb $$0, bvt $$1) {
      boolean $$2 = this.bb > 0;
      if (this.ep() && $$0.O().c(dkf.g)) {
         this.b($$0, $$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.f($$0);
      this.b($$0, $$1.d());
   }

   protected void f(asb $$0) {
   }

   protected void b(asb $$0, @Nullable bxe $$1) {
      if (!this.eL() && (this.eq() || this.bb > 0 && this.eo() && $$0.O().c(dkf.g))) {
         bxs.a($$0, this.dt(), this.a($$0, $$1));
      }
   }

   protected void a(asb $$0, bvt $$1, boolean $$2) {
   }

   public long eJ() {
      return 0L;
   }

   protected float b(bxe $$0, bvt $$1) {
      float $$2 = (float)this.h(bzl.d);
      return this.dV() instanceof asb $$3 ? dgz.d($$3, this.dZ(), $$0, $$1, $$2) : $$2;
   }

   protected void b(asb $$0, bvt $$1, boolean $$2) {
      Optional<alq<fay>> $$3 = this.ea();
      if (!$$3.isEmpty()) {
         fay $$4 = $$0.p().bc().b($$3.get());
         faw.a $$5 = new faw.a($$0).a(fdn.a, this).a(fdn.f, this.dt()).a(fdn.c, $$1).b(fdn.d, $$1.d()).b(fdn.e, $$1.c());
         csi $$6 = this.es();
         if ($$2 && $$6 != null) {
            $$5 = $$5.a(fdn.b, $$6).a($$6.eh());
         }

         faw $$7 = $$5.a(fdm.g);
         $$4.a($$7, this.eJ(), $$1x -> this.a($$0, $$1x));
      }
   }

   public boolean a(asb $$0, alq<fay> $$1, BiConsumer<asb, dak> $$2) {
      return this.a($$0, $$1, $$0x -> $$0x.a(fdn.f, this.dt()).a(fdn.a, this).a(fdm.j), $$2);
   }

   protected void a(asb $$0, alq<fay> $$1, dak $$2, BiConsumer<asb, dak> $$3) {
      this.a($$0, $$1, $$1x -> $$1x.a(fdn.f, this.dt()).a(fdn.a, this).a(fdn.i, $$2).a(fdm.s), $$3);
   }

   protected boolean a(asb $$0, alq<fay> $$1, Function<faw.a, faw> $$2, BiConsumer<asb, dak> $$3) {
      fay $$4 = $$0.p().bc().b($$1);
      faw $$5 = $$2.apply(new faw.a($$0));
      List<dak> $$6 = $$4.a($$5);
      if (!$$6.isEmpty()) {
         $$6.forEach($$2x -> $$3.accept($$0, $$2x));
         return true;
      } else {
         return false;
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(bzl.p);
      if (!($$0 <= 0.0)) {
         this.ar = true;
         fgc $$3 = this.dy();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         fgc $$4 = new fgc($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aH() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected awx e(bvt $$0) {
      return awy.kK;
   }

   @Nullable
   protected awx l_() {
      return awy.kF;
   }

   private awx q(int $$0) {
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

   protected ffx eN() {
      ffx $$0 = this.cR();
      bxe $$1 = this.dk();
      if ($$1 != null) {
         fgc $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<dgx, Set<dhp>> c(bxo $$0) {
      return (Map<dgx, Set<dhp>>)this.bZ.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public byf.a eO() {
      return new byf.a(awy.kL, awy.kD);
   }

   public Optional<iw> eP() {
      return this.bT;
   }

   public boolean d_() {
      if (this.aa_()) {
         return false;
      } else {
         iw $$0 = this.dv();
         ebq $$1 = this.dw();
         if ($$1.a(axn.aS)) {
            this.bT = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dwq && this.c($$0, $$1)) {
            this.bT = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(iw $$0, ebq $$1) {
      if (!$$1.c(dwq.b)) {
         return false;
      } else {
         ebq $$2 = this.dV().a_($$0.e());
         return $$2.a(dnq.da) && $$2.c(drz.b) == $$1.c(dwq.e);
      }
   }

   @Override
   public boolean bJ() {
      return !this.dQ() && this.eG() > 0.0F;
   }

   public boolean a(byf $$0, double $$1, boolean $$2, boolean $$3, double... $$4) {
      fgc $$5 = $$0.h(1.0F).d();

      for (double $$6 : $$4) {
         fgc $$7 = new fgc(this.dA() - $$0.dA(), $$6 - $$0.dE(), this.dG() - $$0.dG());
         double $$8 = $$7.g();
         $$7 = $$7.d();
         double $$9 = $$5.b($$7);
         if ($$9 > 1.0 - $$1 / ($$2 ? $$8 : 1.0) && $$0.a(this, $$3 ? djq.a.c : djq.a.a, djq.b.a, $$6)) {
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
      return azz.d($$0 + 3.0F);
   }

   @Override
   public boolean a(double $$0, float $$1, bvt $$2) {
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
      if (this.an().a(axq.o)) {
         return 0;
      } else {
         double $$2 = this.h($$0);
         return azz.a($$2 * (double)$$1 * this.h(bzl.k));
      }
   }

   private double h(double $$0) {
      return $$0 + 1.0E-6 - this.h(bzl.x);
   }

   protected void eQ() {
      if (!this.ba()) {
         int $$0 = azz.a(this.dA());
         int $$1 = azz.a(this.dC() - 0.2F);
         int $$2 = azz.a(this.dG());
         ebq $$3 = this.dV().a_(new iw($$0, $$1, $$2));
         if (!$$3.l()) {
            dvl $$4 = $$3.A();
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
      return azz.a(this.h(bzl.a));
   }

   protected void c(bvt $$0, float $$1) {
   }

   protected void d(bvt $$0, float $$1) {
   }

   protected void a(bvt $$0, float $$1, bxo... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bxo $$4 : $$2) {
            dak $$5 = this.a($$4);
            dit $$6 = $$5.a(kl.D);
            if ($$6 != null && $$6.i() && $$5.m() && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float e(bvt $$0, float $$1) {
      if (!$$0.a(axo.b)) {
         this.c($$0, $$1);
         $$1 = bvp.a(this, $$1, $$0, (float)this.eR(), (float)this.h(bzl.b));
      }

      return $$1;
   }

   protected float f(bvt $$0, float $$1) {
      if ($$0.a(axo.f)) {
         return $$1;
      } else {
         if (this.b(bwk.k) && !$$0.a(axo.g)) {
            int $$2 = (this.c(bwk.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof asc) {
                  ((asc)this).a(axi.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof asc) {
                  ((asc)$$0.d()).a(axi.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(axo.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dV() instanceof asb $$7) {
               $$8 = dgz.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = bvp.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void c(asb $$0, bvt $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var10 = Math.max($$2 - this.fw(), 0.0F);
         this.E(this.fw() - ($$2 - var10));
         float $$4 = $$2 - var10;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F && $$1.d() instanceof asc $$5) {
            $$5.a(axi.H, Math.round($$4 * 10.0F));
         }

         if (var10 != 0.0F) {
            this.eS().a($$1, var10);
            this.d(this.eG() - var10);
            this.E(this.fw() - var10);
            this.a(egq.o);
         }
      }
   }

   public bvq eS() {
      return this.bG;
   }

   @Nullable
   public byf eT() {
      if (this.ba != null) {
         return this.ba.a(this.dV(), csi.class);
      } else {
         return this.bL != null ? this.bL.a(this.dV(), byf.class) : null;
      }
   }

   public final float eU() {
      return (float)this.h(bzl.s);
   }

   public final float eV() {
      return (float)this.h(bzl.r);
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
      if (bwj.a(this)) {
         return 6 - (1 + bwj.b(this));
      } else {
         return this.b(bwk.d) ? 6 + (1 + this.c(bwk.d).e()) * 2 : 6;
      }
   }

   public void a(bvb $$0) {
      this.a($$0, false);
   }

   public void a(bvb $$0, boolean $$1) {
      if (!this.aI || this.aK >= this.D() / 2 || this.aK < 0) {
         this.aK = -1;
         this.aI = true;
         this.aJ = $$0;
         if (this.dV() instanceof asb) {
            ach $$2 = new ach(this, $$0 == bvb.a ? 0 : 3);
            ary $$3 = ((asb)this.dV()).m();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bvt $$0) {
      this.aT.a(1.5F);
      this.aj = 20;
      this.aO = 10;
      this.aN = this.aO;
      awx $$1 = this.e($$0);
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
            awx $$1 = this.l_();
            if ($$1 != null) {
               this.a($$1, this.fe(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof csi)) {
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
               double $$8 = azz.d($$4, this.K, this.dA()) + (this.ae.j() - 0.5) * (double)this.dq() * 2.0;
               double $$9 = azz.d($$4, this.L, this.dC()) + this.ae.j() * (double)this.dr();
               double $$10 = azz.d($$4, this.M, this.dG()) + (this.ae.j() - 0.5) * (double)this.dq() * 2.0;
               this.dV().a(lz.af, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.g(this.a(bxo.a));
            break;
         case 48:
            this.g(this.a(bxo.b));
            break;
         case 49:
            this.g(this.a(bxo.f));
            break;
         case 50:
            this.g(this.a(bxo.e));
            break;
         case 51:
            this.g(this.a(bxo.d));
            break;
         case 52:
            this.g(this.a(bxo.c));
            break;
         case 54:
            drn.b(this);
            break;
         case 55:
            this.F();
            break;
         case 60:
            this.eY();
            break;
         case 65:
            this.g(this.a(bxo.g));
            break;
         case 67:
            this.E();
            break;
         case 68:
            this.g(this.a(bxo.h));
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
      fgc $$0 = this.dy();

      for (int $$1 = 0; $$1 < 8; $$1++) {
         double $$2 = this.ae.a(0.0, 1.0);
         double $$3 = this.ae.a(0.0, 1.0);
         double $$4 = this.ae.a(0.0, 1.0);
         this.dV().a(lz.d, this.dA() + $$2, this.dC() + $$3, this.dG() + $$4, $$0.d, $$0.e, $$0.f);
      }
   }

   private void F() {
      dak $$0 = this.a(bxo.b);
      this.a(bxo.b, this.a(bxo.a));
      this.a(bxo.a, $$0);
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
   public bzh g(jg<bzg> $$0) {
      return this.fa().a($$0);
   }

   public double h(jg<bzg> $$0) {
      return this.fa().c($$0);
   }

   public double i(jg<bzg> $$0) {
      return this.fa().d($$0);
   }

   public bzi fa() {
      return this.bF;
   }

   public dak fb() {
      return this.a(bxo.a);
   }

   public dak fc() {
      return this.a(bxo.b);
   }

   public dak a(bxw $$0) {
      return this.fy() == $$0 ? this.fb() : this.fc();
   }

   @Nonnull
   @Override
   public dak dZ() {
      return this.fb();
   }

   public boolean b(dag $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<dak> $$0) {
      return $$0.test(this.fb()) || $$0.test(this.fc());
   }

   public dak b(bvb $$0) {
      if ($$0 == bvb.a) {
         return this.a(bxo.a);
      } else if ($$0 == bvb.b) {
         return this.a(bxo.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bvb $$0, dak $$1) {
      if ($$0 == bvb.a) {
         this.a(bxo.a, $$1);
      } else {
         if ($$0 != bvb.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bxo.b, $$1);
      }
   }

   public boolean d(bxo $$0) {
      return !this.a($$0).f();
   }

   public boolean e(bxo $$0) {
      return true;
   }

   public dak a(bxo $$0) {
      return this.bt.a($$0);
   }

   public void a(bxo $$0, dak $$1) {
      this.a($$0, this.bt.a($$0, $$1), $$1);
   }

   public float fd() {
      int $$0 = 0;
      int $$1 = 0;

      for (bxo $$2 : bxp.i) {
         if ($$2.a() == bxo.a.b) {
            dak $$3 = this.a($$2);
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
      bzh $$1 = this.g(bzl.v);
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
   public void h(bxe $$0) {
      if (!this.fR()) {
         super.h($$0);
      }
   }

   private void c(bxe $$0) {
      fgc $$1;
      if (this.dQ()) {
         $$1 = this.dt();
      } else if (!$$0.dQ() && !this.dV().a_($$0.dv()).a(axn.aM)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dC(), $$0.dC());
         $$1 = new fgc(this.dA(), $$2, this.dG());
         boolean $$4 = this.dq() <= 4.0F && this.dr() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.dr() / 2.0;
            fgc $$6 = $$1.b(0.0, $$5, 0.0);
            fgw $$7 = fgt.a(ffx.a($$6, (double)this.dq(), (double)this.dr(), (double)this.dq()));
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
      return (float)this.h(bzl.o) * $$0 * this.aR() + this.fi();
   }

   public float fi() {
      return this.b(bwk.h) ? 0.1F * ((float)this.c(bwk.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void s() {
      float $$0 = this.fh();
      if (!($$0 <= 1.0E-5F)) {
         fgc $$1 = this.dy();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.ci()) {
            float $$2 = this.dL() * (float) (Math.PI / 180.0);
            this.j(new fgc((double)(-azz.a($$2)) * 0.2, 0.0, (double)azz.b($$2) * 0.2));
         }

         this.ar = true;
      }
   }

   protected void fj() {
      this.i(this.dy().b(0.0, -0.04F, 0.0));
   }

   protected void c(ayc<exz> $$0) {
      this.i(this.dy().b(0.0, 0.04F, 0.0));
   }

   protected float fk() {
      return 0.8F;
   }

   public boolean a(eya $$0) {
      return false;
   }

   @Override
   protected double bc() {
      return this.h(bzl.n);
   }

   protected double fl() {
      boolean $$0 = this.dy().e <= 0.0;
      return $$0 && this.b(bwk.B) ? Math.min(this.bd(), 0.01) : this.bd();
   }

   public void a_(fgc $$0) {
      eya $$1 = this.dV().b_(this.dv());
      if ((this.bi() || this.bv()) && this.em() && !this.a($$1)) {
         this.m($$0);
      } else if (this.fJ()) {
         this.n($$0);
      } else {
         this.l($$0);
      }
   }

   private void l(fgc $$0) {
      iw $$1 = this.aP();
      float $$2 = this.aH() ? this.dV().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      fgc $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      bwi $$6 = this.c(bwk.y);
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
         float $$7 = this instanceof ckj ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void m(fgc $$0) {
      boolean $$1 = this.dy().e <= 0.0;
      double $$2 = this.dC();
      double $$3 = this.fl();
      if (this.bi()) {
         float $$4 = this.ci() ? 0.9F : this.fk();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(bzl.F);
         if (!this.aH()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fo() - $$5) * $$6;
         }

         if (this.b(bwk.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(byj.a, this.dy());
         fgc $$7 = this.dy();
         if (this.P && this.d_()) {
            $$7 = new fgc($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.i(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(byj.a, this.dy());
         if (this.b(axs.b) <= this.dp()) {
            this.i(this.dy().d(0.5, 0.8F, 0.5));
            fgc $$8 = this.a($$3, $$1, this.dy());
            this.i($$8);
         } else {
            this.i(this.dy().c(0.5));
         }

         if ($$3 != 0.0) {
            this.i(this.dy().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      fgc $$9 = this.dy();
      if (this.P && this.f($$9.d, $$9.e + 0.6F - this.dC() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void n(fgc $$0) {
      if (this.d_()) {
         this.l($$0);
         this.fm();
      } else {
         fgc $$1 = this.dy();
         double $$2 = $$1.i();
         this.i(this.o($$1));
         this.a(byj.a, this.dy());
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

   private fgc o(fgc $$0) {
      fgc $$1 = this.bS();
      float $$2 = this.dN() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fl();
      double $$6 = azz.k(Math.cos((double)$$2));
      $$0 = $$0.b(0.0, $$5 * (-1.0 + $$6 * 0.75), 0.0);
      if ($$0.e < 0.0 && $$3 > 0.0) {
         double $$7 = $$0.e * -0.1 * $$6;
         $$0 = $$0.b($$1.d * $$7 / $$3, $$7, $$1.f * $$7 / $$3);
      }

      if ($$2 < 0.0F && $$3 > 0.0) {
         double $$8 = $$4 * (double)(-azz.a($$2)) * 0.04;
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

   private void c(csi $$0, fgc $$1) {
      fgc $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.di()) {
         this.B(this.c($$0));
         this.a_($$2);
      } else {
         this.i(fgc.c);
      }
   }

   protected void a(csi $$0, fgc $$1) {
   }

   protected fgc b(csi $$0, fgc $$1) {
      return $$1;
   }

   protected float c(csi $$0) {
      return this.fo();
   }

   public void r(boolean $$0) {
      float $$1 = (float)azz.g(this.dA() - this.K, $$0 ? this.dC() - this.L : 0.0, this.dG() - this.M);
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

   private fgc a(fgc $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.i(this.p(this.dy()));
      this.a(byj.a, this.dy());
      fgc $$2 = this.dy();
      if ((this.P || this.bf) && (this.d_() || this.aw && dtp.a(this))) {
         $$2 = new fgc($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public fgc a(double $$0, boolean $$1, fgc $$2) {
      if ($$0 != 0.0 && !this.ci()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new fgc($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private fgc p(fgc $$0) {
      if (this.d_()) {
         this.k();
         float $$1 = 0.15F;
         double $$2 = azz.a($$0.d, -0.15F, 0.15F);
         double $$3 = azz.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dw().a(dnq.oy) && this.fI() && this instanceof csi) {
            $$4 = 0.0;
         }

         $$0 = new fgc($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aH() ? this.fo() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fn();
   }

   protected float fn() {
      return this.cW() instanceof csi ? this.fo() * 0.1F : 0.02F;
   }

   public float fo() {
      return this.bP;
   }

   public void B(float $$0) {
      this.bP = $$0;
   }

   public boolean c(asb $$0, bxe $$1) {
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
         float $$6 = (float)azz.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$7 = azz.e(azz.h(this.dL()) - $$6);
         if (95.0F < $$7 && $$7 < 265.0F) {
            $$5 = $$6 - 180.0F;
         } else {
            $$5 = $$6;
         }
      }

      if (this.aR > 0.0F) {
         $$5 = this.dL();
      }

      brm $$8 = brl.a();
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
      Map<bxo, dak> $$0 = this.H();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bxo, dak> H() {
      Map<bxo, dak> $$0 = null;

      for (bxo $$1 : bxo.j) {
         dak $$2 = this.bI.get($$1);
         dak $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bxo.class);
            }

            $$0.put($$1, $$3);
            bzi $$4 = this.fa();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<bxo, dak> $$5 : $$0.entrySet()) {
            bxo $$6 = $$5.getKey();
            dak $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1x) -> {
                  bzh $$2 = this.bF.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1x.a());
                     $$2.b($$1x);
                  }
               });
               if (this.dV() instanceof asb $$8) {
                  dgz.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(dak $$0, dak $$1) {
      return !dak.a($$1, $$0);
   }

   private void a(Map<bxo, dak> $$0) {
      dak $$1 = $$0.get(bxo.a);
      dak $$2 = $$0.get(bxo.b);
      if ($$1 != null && $$2 != null && dak.a($$1, this.bI.get(bxo.b)) && dak.a($$2, this.bI.get(bxo.a))) {
         ((asb)this.dV()).m().b(this, new adi(this, (byte)55));
         $$0.remove(bxo.a);
         $$0.remove(bxo.b);
         this.bI.put(bxo.a, $$1.v());
         this.bI.put(bxo.b, $$2.v());
      }
   }

   private void b(Map<bxo, dak> $$0) {
      List<Pair<bxo, dak>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         dak $$3 = $$2.v();
         $$1.add(Pair.of($$1x, $$3));
         this.bI.put($$1x, $$3);
      });
      ((asb)this.dV()).m().b(this, new afr(this.ao(), $$1));
   }

   protected void C(float $$0) {
      float $$1 = azz.h($$0 - this.aV);
      this.aV += $$1 * 0.3F;
      float $$2 = azz.h(this.dL() - this.aV);
      float $$3 = this.fp();
      if (Math.abs($$2) > $$3) {
         this.aV = this.aV + ($$2 - (float)azz.j((double)$$2) * $$3);
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
         this.S_().e();
      } else if (!this.di()) {
         this.i(this.dy().c(0.98));
      }

      if (this.bl > 0) {
         this.a(this.bl, this.bk);
         this.bl--;
      }

      this.bt.a((bxe)this);
      fgc $$0 = this.dy();
      double $$1 = $$0.d;
      double $$2 = $$0.e;
      double $$3 = $$0.f;
      if (this.an().equals(bxn.bT)) {
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
      brm $$4 = brl.a();
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
            $$5 = this.b(axs.b);
         } else {
            $$5 = this.b(axs.a);
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
               this.c(axs.b);
            }
         } else {
            this.c(axs.a);
         }
      } else {
         this.bQ = 0;
      }

      $$4.c();
      $$4.a("travel");
      if (this.fJ()) {
         this.fs();
      }

      ffx $$9 = this.cR();
      fgc $$10 = new fgc((double)this.bg, (double)this.bh, (double)this.bi);
      if (this.b(bwk.B) || this.b(bwk.y)) {
         this.k();
      }

      label122: {
         if (this.cW() instanceof csi $$11 && this.bJ()) {
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
         this.r(this instanceof ckj);
      }

      $$4.c();
      if (this.dV() instanceof asb $$12) {
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
      if (this.dV() instanceof asb $$13 && this.fr() && this.bk()) {
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
               List<bxo> $$2 = bxo.j.stream().filter($$0x -> b(this.a($$0x), $$0x)).toList();
               bxo $$3 = ag.a($$2, this.ae);
               this.a($$3).a(1, this, $$3);
            }

            this.a(egq.n);
         }
      }
   }

   protected boolean ft() {
      if (!this.aH() && !this.bY() && !this.b(bwk.y)) {
         for (bxo $$0 : bxo.j) {
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
      List<bxe> $$0 = this.dV().i(this, this.cR());
      if (!$$0.isEmpty()) {
         if (this.dV() instanceof asb $$1) {
            int $$2 = $$1.O().d(dkf.w);
            if ($$2 > 0 && $$0.size() > $$2 - 1 && this.ae.a(4) == 0) {
               int $$3 = 0;

               for (bxe $$4 : $$0) {
                  if (!$$4.bY()) {
                     $$3++;
                  }
               }

               if ($$3 > $$2 - 1) {
                  this.a($$1, this.dW().h(), 6.0F);
               }
            }
         }

         for (bxe $$5 : $$0) {
            this.D($$5);
         }
      }
   }

   protected void a(ffx $$0, ffx $$1) {
      ffx $$2 = $$0.b($$1);
      List<bxe> $$3 = this.dV().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bxe $$4 : $$3) {
            if ($$4 instanceof byf) {
               this.f((byf)$$4);
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

   protected void D(bxe $$0) {
      $$0.h(this);
   }

   protected void f(byf $$0) {
   }

   public boolean fv() {
      return (this.al.a(aC) & 4) != 0;
   }

   @Override
   public void bO() {
      bxe $$0 = this.dk();
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
   public bya S_() {
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

   public void a(coo $$0) {
      bxe $$1 = $$0.q();
      if ($$1 instanceof asc) {
         aq.R.a((asc)$$1, $$0.f(), this);
      }
   }

   public void a(bxe $$0, int $$1) {
      if (!$$0.dQ() && !this.dV().C && ($$0 instanceof coo || $$0 instanceof csq || $$0 instanceof bxs)) {
         ((asb)this.dV()).m().b($$0, new agm($$0.ao(), this.ao(), $$1));
      }
   }

   public boolean E(bxe $$0) {
      return this.a($$0, djq.a.a, djq.b.a, $$0.dE());
   }

   public boolean a(bxe $$0, djq.a $$1, djq.b $$2, double $$3) {
      if ($$0.dV() != this.dV()) {
         return false;
      } else {
         fgc $$4 = new fgc(this.dA(), this.dE(), this.dG());
         fgc $$5 = new fgc($$0.dA(), $$3, $$0.dG());
         return $$5.f($$4) > 128.0 ? false : this.dV().a(new djq($$4, $$5, $$1, $$2, this)).d() == fga.a.a;
      }
   }

   @Override
   public float j(float $$0) {
      return $$0 == 1.0F ? this.aX : azz.i($$0, this.aY, this.aX);
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
      return this.bJ() && !this.aa_() && !this.d_();
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
   public fgc a(jc.a $$0, m.a $$1) {
      return k(super.a($$0, $$1));
   }

   public static fgc k(fgc $$0) {
      return new fgc($$0.d, $$0.e, 0.0);
   }

   public float fw() {
      return this.bR;
   }

   public final void E(float $$0) {
      this.F(azz.a($$0, 0.0F, this.eV()));
   }

   protected void F(float $$0) {
      this.bR = $$0;
   }

   public void e_() {
   }

   public void O_() {
   }

   protected void fx() {
      this.bK = true;
   }

   public abstract bxw fy();

   public boolean fz() {
      return (this.al.a(aC) & 1) > 0;
   }

   public bvb fA() {
      return (this.al.a(aC) & 2) > 0 ? bvb.b : bvb.a;
   }

   private void I() {
      if (this.fz()) {
         if (dak.b(this.b(this.fA()), this.bm)) {
            this.bm = this.b(this.fA());
            this.a(this.bm);
         } else {
            this.fF();
         }
      }
   }

   @Nullable
   private coo b(dak $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dE() - 0.3F;
         coo $$4 = new coo(this.dV(), this.dA(), $$3, this.dG(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ae.i() * 0.5F;
            float $$6 = this.ae.i() * (float) (Math.PI * 2);
            $$4.n((double)(-azz.a($$6) * $$5), 0.2F, (double)(azz.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = azz.a(this.dN() * (float) (Math.PI / 180.0));
            float $$9 = azz.b(this.dN() * (float) (Math.PI / 180.0));
            float $$10 = azz.a(this.dL() * (float) (Math.PI / 180.0));
            float $$11 = azz.b(this.dL() * (float) (Math.PI / 180.0));
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

   protected void a(dak $$0) {
      $$0.b(this.dV(), this, this.fC());
      if (--this.bn == 0 && !this.dV().C && !$$0.x()) {
         this.P_();
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

   public void c(bvb $$0) {
      dak $$1 = this.b($$0);
      if (!$$1.f() && !this.fz()) {
         this.bm = $$1;
         this.bn = $$1.a(this);
         if (!this.dV().C) {
            this.c(1, true);
            this.c(2, $$0 == bvb.b);
            this.a(egq.D);
         }
      }
   }

   @Override
   public void a(aku<?> $$0) {
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
            this.bm = dak.l;
            this.bn = 0;
         }
      }
   }

   @Override
   public void a(ew.a $$0, fgc $$1) {
      super.a($$0, $$1);
      this.aY = this.aX;
      this.aV = this.aX;
      this.aW = this.aV;
   }

   @Override
   public float u(float $$0) {
      return azz.h($$0, this.aW, this.aV);
   }

   public void b(dak $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         fgc $$3 = new fgc(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dN() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dL() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ae.i()) * 0.6 - 0.3;
         fgc $$5 = new fgc(((double)this.ae.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dN() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dL() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dA(), this.dE(), this.dG());
         this.dV().a(new lv(lz.U, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void P_() {
      if (!this.dV().C || this.fz()) {
         bvb $$0 = this.fA();
         if (!this.bm.equals(this.b($$0))) {
            this.fE();
         } else {
            if (!this.bm.f() && this.fz()) {
               dak $$1 = this.bm.a(this.dV(), this);
               if ($$1 != this.bm) {
                  this.a($$0, $$1);
               }

               this.fF();
            }
         }
      }
   }

   public void b(dak $$0) {
   }

   public dak fB() {
      return this.bm;
   }

   public int fC() {
      return this.bn;
   }

   public int fD() {
      return this.fz() ? this.bm.a(this) - this.fC() : 0;
   }

   public void fE() {
      dak $$0 = this.b(this.fA());
      if (!this.bm.f() && dak.b($$0, this.bm)) {
         this.bm = $$0;
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
            this.a(egq.C);
         }
      }

      this.bm = dak.l;
      this.bn = 0;
   }

   public boolean fG() {
      return this.fH() != null;
   }

   @Nullable
   public dak fH() {
      if (!this.fz()) {
         return null;
      } else {
         dcl $$0 = this.bm.a(kl.I);
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
      return super.ck() || !this.fJ() && this.c(byr.b);
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
      dkj $$10 = this.dV();
      if ($$10.C($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.K_()) {
            iw $$12 = $$9.e();
            ebq $$13 = $$10.a_($$12);
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

         if (this instanceof byn $$14) {
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
   public final bxh a(byr $$0) {
      return $$0 == byr.c ? aD : this.e($$0).a(this.el());
   }

   protected bxh e(byr $$0) {
      return this.an().n().a(this.ek());
   }

   public ImmutableList<byr> fO() {
      return ImmutableList.of(byr.a);
   }

   public ffx f(byr $$0) {
      bxh $$1 = this.a($$0);
      return new ffx((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(byr $$0) {
      ffx $$1 = this.a($$0).a(this.dt());
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

      ebq $$1 = this.dV().a_($$0);
      if ($$1.b() instanceof dnh) {
         this.dV().a($$0, $$1.b(dnh.c, Boolean.valueOf(true)), 3);
      }

      this.b(byr.c);
      this.a($$0);
      this.g($$0);
      this.i(fgc.c);
      this.ar = true;
   }

   private void a(iw $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean L() {
      return this.fP().map($$0 -> this.dV().a_($$0).b() instanceof dnh).orElse(false);
   }

   public void fS() {
      this.fP().filter(this.dV()::C).ifPresent($$0x -> {
         ebq $$1 = this.dV().a_($$0x);
         if ($$1.b() instanceof dnh) {
            jc $$2 = $$1.c(dnh.e);
            this.dV().a($$0x, $$1.b(dnh.c, Boolean.valueOf(false)), 3);
            fgc $$3 = dnh.a(this.an(), this.dV(), $$0x, $$2, this.dL()).orElseGet(() -> {
               iw $$1x = $$0x.d();
               return new fgc((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            fgc $$4 = fgc.c($$0x).d($$3).d();
            float $$5 = (float)azz.d(azz.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.w($$5);
            this.x(0.0F);
         }
      });
      fgc $$0 = this.dt();
      this.b(byr.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fQ();
   }

   @Nullable
   public jc fT() {
      iw $$0 = this.fP().orElse(null);
      return $$0 != null ? dnh.a(this.dV(), $$0) : null;
   }

   @Override
   public boolean bK() {
      return !this.fR() && super.bK();
   }

   public dak d(dak $$0) {
      return dak.l;
   }

   private static byte g(bxo $$0) {
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

   public void a(dag $$0, bxo $$1) {
      this.dV().a(this, g($$1));
      this.a(this.a($$1), $$1, this.bF);
   }

   private void a(dak $$0, bxo $$1, bzi $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         bzh $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      dgz.a($$0, this, $$1);
   }

   public static bxo d(bvb $$0) {
      return $$0 == bvb.a ? bxo.a : bxo.b;
   }

   public final boolean e(dak $$0) {
      if (this.bJ() && !this.aa_()) {
         dit $$1 = $$0.a(kl.D);
         if ($$1 != null && $$1.g()) {
            bxo $$2 = $$1.b();
            return this.e($$2) && $$1.a(this.an()) ? this.a($$2).f() && this.f($$2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected boolean f(bxo $$0) {
      return true;
   }

   public final bxo f(dak $$0) {
      dit $$1 = $$0.a(kl.D);
      return $$1 != null && this.e($$1.b()) ? $$1.b() : bxo.a;
   }

   public final boolean a(dak $$0, bxo $$1) {
      dit $$2 = $$0.a(kl.D);
      return $$2 == null ? $$1 == bxo.a && this.e(bxo.a) : $$1 == $$2.b() && this.e($$2.b()) && $$2.a(this.an());
   }

   private static byw a(byf $$0, bxo $$1) {
      return $$1 != bxo.f && $$1 != bxo.a && $$1 != bxo.b ? byw.a($$0, $$1, $$2 -> $$2.f() || $$0.f($$2) == $$1) : byw.a($$0, $$1);
   }

   @Nullable
   private static bxo r(int $$0) {
      if ($$0 == 100 + bxo.f.b()) {
         return bxo.f;
      } else if ($$0 == 100 + bxo.e.b()) {
         return bxo.e;
      } else if ($$0 == 100 + bxo.d.b()) {
         return bxo.d;
      } else if ($$0 == 100 + bxo.c.b()) {
         return bxo.c;
      } else if ($$0 == 98) {
         return bxo.a;
      } else if ($$0 == 99) {
         return bxo.b;
      } else if ($$0 == 105) {
         return bxo.g;
      } else {
         return $$0 == 106 ? bxo.h : null;
      }
   }

   @Override
   public byw a_(int $$0) {
      bxo $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dJ() {
      if (this.aa_()) {
         return false;
      } else {
         for (bxo $$0 : bxp.i) {
            if (this.a($$0).a(axv.bs)) {
               return false;
            }
         }

         return super.dJ();
      }
   }

   @Override
   public boolean cn() {
      return !this.dV().A_() && this.b(bwk.x) || super.cn();
   }

   @Override
   public float dM() {
      return this.aV;
   }

   @Override
   public void a(acg $$0) {
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
      dds $$0 = this.dZ().a(kl.B);
      return $$0 != null ? $$0.b() : 0.0F;
   }

   @Override
   public float dP() {
      float $$0 = (float)this.h(bzl.B);
      return this.cW() instanceof csi ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public fgc m(bxe $$0) {
      return this.dt().e(this.a($$0, this.a(this.at()), this.el() * this.ek()));
   }

   protected void a(int $$0, double $$1) {
      this.aX = (float)azz.e(1.0 / (double)$$0, (double)this.aX, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(azz.c((double)$$0 * this.h(bzl.h)));
   }

   public boolean fV() {
      return false;
   }

   public boolean a(asb $$0, bvt $$1) {
      return this.d($$1) || dgz.a($$0, this, $$1);
   }

   public static boolean b(dak $$0, bxo $$1) {
      if (!$$0.c(kl.F)) {
         return false;
      } else {
         dit $$2 = $$0.a(kl.D);
         return $$2 != null && $$1 == $$2.b() && !$$0.r();
      }
   }

   @VisibleForTesting
   public int fW() {
      return this.bb;
   }

   public static record a(awx a, awx b) {
   }
}
