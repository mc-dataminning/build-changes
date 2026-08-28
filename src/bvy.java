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
import org.slf4j.Logger;

public abstract class bvy extends bva implements but {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "active_effects";
   private static final aku c = aku.b("powder_snow");
   private static final aku d = aku.b("sprinting");
   private static final bxe k = new bxe(d, 0.3F, bxe.a.c);
   public static final int l = 2;
   public static final int m = 4;
   public static final int n = 98;
   public static final int o = 100;
   public static final int p = 105;
   public static final int q = 6;
   public static final int r = 100;
   private static final int bt = 40;
   public static final double s = 0.003;
   public static final double t = 0.08;
   public static final int u = 20;
   private static final int bu = 10;
   private static final int bv = 2;
   public static final float ay = 0.42F;
   private static final double bw = 128.0;
   protected static final int az = 1;
   protected static final int aA = 2;
   protected static final int aB = 4;
   protected static final ajx<Byte> aC = akb.a(bvy.class, ajz.a);
   private static final ajx<Float> bx = akb.a(bvy.class, ajz.d);
   private static final ajx<List<lr>> by = akb.a(bvy.class, ajz.m);
   private static final ajx<Boolean> bz = akb.a(bvy.class, ajz.k);
   private static final ajx<Integer> bA = akb.a(bvy.class, ajz.b);
   private static final ajx<Integer> bB = akb.a(bvy.class, ajz.b);
   private static final ajx<Optional<ji>> bC = akb.a(bvy.class, ajz.p);
   private static final int bD = 15;
   protected static final bvd aD = bvd.c(0.2F, 0.2F).b(0.2F);
   public static final float aE = 0.5F;
   public static final float aF = 0.5F;
   public static final String aG = "attributes";
   public static final Predicate<bvy> aH = $$0 -> {
      if ($$0 instanceof cpr $$1) {
         cxh $$3 = $$1.a(bvj.f);
         return !$$3.a(awy.cr);
      } else {
         return true;
      }
   };
   private final bxd bE;
   private final btm bF = new btm(this);
   private final Map<jr<buc>, bue> bG = Maps.newHashMap();
   private final ka<cxh> bH = ka.a(2, cxh.k);
   private final ka<cxh> bI = ka.a(4, cxh.k);
   private cxh bJ = cxh.k;
   public boolean aI;
   private boolean bK = false;
   public bsx aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public float aQ;
   public float aR;
   protected int aS;
   public final bwz aT = new bwz();
   public final int aU = 20;
   public float aV;
   public float aW;
   public float aX;
   public float aY;
   public final buz aZ = new buz(this);
   @Nullable
   protected bvf<cpr> ba;
   protected int bb;
   protected boolean bc;
   protected int bd;
   protected float be;
   protected boolean bf;
   public float bg;
   public float bh;
   public float bi;
   protected bvt bj = new bvt(this);
   protected double bk;
   protected int bl;
   private boolean bL = true;
   @Nullable
   private bvf<bvy> bM;
   private int bN;
   @Nullable
   private bvy bO;
   private int bP;
   private float bQ;
   private int bR;
   private float bS;
   protected cxh bm = cxh.k;
   protected int bn;
   protected int bo;
   private ji bT;
   private Optional<ji> bU = Optional.empty();
   @Nullable
   private btp bV;
   private long bW;
   protected int bp;
   protected float bq;
   @Nullable
   protected cxh br;
   private float bX;
   private float bY;
   protected bxa<?> bs;
   private boolean bZ;
   private final EnumMap<bvj, Reference2ObjectMap<ddr, Set<dej>>> ca = new EnumMap<>(bvj.class);

   protected bvy(bvi<? extends bvy> $$0, dgz $$1) {
      super($$0, $$1);
      this.bE = new bxd(bxh.a($$0));
      this.d(this.eS());
      this.I = true;
      this.ay();
      this.w((float)(Math.random() * (float) (Math.PI * 2)));
      this.aX = this.dK();
      ue $$2 = ue.a;
      this.bs = this.a(new Dynamic($$2, (un)$$2.createMap(ImmutableMap.of($$2.a("memories"), (un)$$2.emptyMap()))));
   }

   public bxa<?> ea() {
      return this.bs;
   }

   protected bxa.b<?> eb() {
      return bxa.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bxa<?> a(Dynamic<?> $$0) {
      return this.eb().a($$0);
   }

   @Override
   public void c(ard $$0) {
      this.a($$0, this.dV().y(), Float.MAX_VALUE);
   }

   public boolean a(bvi<?> $$0) {
      return true;
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(aC, (byte)0);
      $$0.a(by, List.of());
      $$0.a(bz, false);
      $$0.a(bA, 0);
      $$0.a(bB, 0);
      $$0.a(bx, 1.0F);
      $$0.a(bC, Optional.empty());
   }

   public static bxf.a ec() {
      return bxf.a()
         .a(bxg.s)
         .a(bxg.p)
         .a(bxg.v)
         .a(bxg.a)
         .a(bxg.b)
         .a(bxg.r)
         .a(bxg.B)
         .a(bxg.y)
         .a(bxg.n)
         .a(bxg.x)
         .a(bxg.k)
         .a(bxg.o)
         .a(bxg.w)
         .a(bxg.h)
         .a(bxg.i)
         .a(bxg.F)
         .a(bxg.u)
         .a(bxg.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxq $$2, ji $$3) {
      if (!this.bj()) {
         this.bp();
      }

      if (this.dU() instanceof ard $$4 && $$1 && this.Z > 0.0F) {
         this.b($$4, $$3);
         double $$5 = this.h(bxg.x);
         if ((double)this.Z > $$5 && !$$2.l()) {
            double $$6 = this.dz();
            double $$7 = this.dB();
            double $$8 = this.dF();
            ji $$9 = this.du();
            if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
               double $$10 = $$6 - (double)$$3.u() - 0.5;
               double $$11 = $$8 - (double)$$3.w() - 0.5;
               double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
               $$6 = (double)$$3.u() + 0.5 + $$10 / $$12 * 0.5;
               $$8 = (double)$$3.w() + 0.5 + $$11 / $$12 * 0.5;
            }

            float $$13 = (float)ayz.c((double)this.Z - $$5);
            double $$14 = Math.min((double)(0.2F + $$13 / 15.0F), 2.5);
            int $$15 = (int)(150.0 * $$14);
            $$4.a(new ll(lt.b, $$2), $$6, $$7, $$8, $$15, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.bU = Optional.empty();
      }
   }

   public final boolean ed() {
      return this.aq().a(awt.m);
   }

   public float a(float $$0) {
      return ayz.h($$0, this.bY, this.bX);
   }

   public boolean ee() {
      return this.dx().b() < 1.0E-5F && this.bl();
   }

   @Override
   public void az() {
      this.aQ = this.aR;
      if (this.ak) {
         this.fR().ifPresent(this::a);
      }

      if (this.dU() instanceof ard $$0) {
         ddt.b($$0, this);
      }

      super.az();
      bpj $$1 = bpi.a();
      $$1.a("livingEntityBaseTick");
      if (this.bi() || this.dU().C) {
         this.aH();
      }

      if (this.bJ() && this.dU() instanceof ard $$2) {
         boolean $$3 = this instanceof cpr;
         if (this.bK()) {
            this.a($$2, this.dV().g(), 1.0F);
         } else if ($$3 && !$$2.A_().a(this.cQ())) {
            double $$4 = $$2.A_().a(this) + $$2.A_().n();
            if ($$4 < 0.0) {
               double $$5 = $$2.A_().o();
               if ($$5 > 0.0) {
                  this.a($$2, this.dV().x(), (float)Math.max(1, ayz.a(-$$4 * $$5)));
               }
            }
         }

         if (this.a(awv.a) && !$$2.a_(ji.a(this.dz(), this.dD(), this.dF())).a(dkg.nF)) {
            boolean $$6 = !this.ed() && !buf.c(this) && (!$$3 || !((cpr)this).gm().a);
            if ($$6) {
               this.j(this.l(this.cs()));
               if (this.cs() == -20) {
                  this.j(0);
                  $$2.a(this, (byte)67);
                  this.a($$2, this.dV().i(), 2.0F);
               }
            } else if (this.cs() < this.cr()) {
               this.j(this.m(this.cs()));
            }

            if (this.bY() && this.dj() != null && this.dj().ca()) {
               this.bO();
            }
         } else if (this.cs() < this.cr()) {
            this.j(this.m(this.cs()));
         }

         ji $$7 = this.du();
         if (!Objects.equal(this.bT, $$7)) {
            this.bT = $$7;
            this.b($$2, $$7);
         }
      }

      if (this.bJ() && (this.bk() || this.av)) {
         this.aN();
      }

      if (this.aN > 0) {
         this.aN--;
      }

      if (this.aj > 0 && !(this instanceof are)) {
         this.aj--;
      }

      if (this.eF() && this.dU().h(this)) {
         this.el();
      }

      if (this.bb > 0) {
         this.bb--;
      } else {
         this.ba = null;
      }

      if (this.bO != null && !this.bO.bJ()) {
         this.bO = null;
      }

      bvy $$8 = this.ep();
      if ($$8 != null) {
         if (!$$8.bJ()) {
            this.a(null);
         } else if (this.af - this.bN > 100) {
            this.a(null);
         }
      }

      this.ew();
      this.aY = this.aX;
      this.aW = this.aV;
      this.N = this.dK();
      this.O = this.dM();
      $$1.c();
   }

   @Override
   protected float aT() {
      return ayz.h((float)this.h(bxg.u), super.aT(), 1.0F);
   }

   public float ef() {
      return 0.0F;
   }

   protected void eg() {
      bxc $$0 = this.g(bxg.v);
      if ($$0 != null) {
         if ($$0.a(c) != null) {
            $$0.c(c);
         }
      }
   }

   protected void eh() {
      if (!this.br().l()) {
         int $$0 = this.ct();
         if ($$0 > 0) {
            bxc $$1 = this.g(bxg.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cu();
            $$1.b(new bxe(c, (double)$$2, bxe.a.a));
         }
      }
   }

   protected void b(ard $$0, ji $$1) {
      ddt.a($$0, this);
   }

   public boolean n_() {
      return false;
   }

   public float ei() {
      return this.n_() ? 0.5F : 1.0F;
   }

   public final float ej() {
      bxd $$0 = this.eY();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bxg.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   public boolean ek() {
      return true;
   }

   protected void el() {
      this.aP++;
      if (this.aP >= 20 && !this.dU().w_() && !this.dP()) {
         this.dU().a(this, (byte)60);
         this.a(bva.d.a);
      }
   }

   public boolean em() {
      return !this.n_();
   }

   protected boolean en() {
      return !this.n_();
   }

   protected int l(int $$0) {
      bxc $$1 = this.g(bxg.w);
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

   public final int a(ard $$0, @Nullable bva $$1) {
      return ddt.a($$0, $$1, this, this.e($$0));
   }

   protected int e(ard $$0) {
      return 0;
   }

   protected boolean eo() {
      return false;
   }

   @Nullable
   public bvy ep() {
      return bvf.a(this.bM, this.dU(), bvy.class);
   }

   @Nullable
   public cpr eq() {
      return bvf.a(this.ba, this.dU(), cpr.class);
   }

   @Override
   public bvy am() {
      return this.ep();
   }

   public int er() {
      return this.bN;
   }

   public void a(cpr $$0, int $$1) {
      this.a(new bvf<>($$0), $$1);
   }

   public void a(UUID $$0, int $$1) {
      this.a(new bvf<>($$0), $$1);
   }

   private void a(bvf<cpr> $$0, int $$1) {
      this.ba = $$0;
      this.bb = $$1;
   }

   public void a(@Nullable bvy $$0) {
      this.bM = $$0 != null ? new bvf<>($$0) : null;
      this.bN = this.af;
   }

   @Nullable
   public bvy es() {
      return this.bO;
   }

   public int et() {
      return this.bP;
   }

   public void B(bva $$0) {
      if ($$0 instanceof bvy) {
         this.bO = (bvy)$$0;
      } else {
         this.bO = null;
      }

      this.bP = this.af;
   }

   public int eu() {
      return this.bd;
   }

   public void n(int $$0) {
      this.bd = $$0;
   }

   public boolean ev() {
      return this.bK;
   }

   public void q(boolean $$0) {
      this.bK = $$0;
   }

   protected boolean b(bvj $$0) {
      return true;
   }

   public void a(bvj $$0, cxh $$1, cxh $$2) {
      if (!this.dU().w_() && !this.U_()) {
         boolean $$3 = $$2.f() && $$1.f();
         if (!$$3 && !cxh.c($$1, $$2) && !this.ak) {
            dfm $$4 = $$2.a(kv.E);
            if (!this.bb() && $$4 != null && $$0 == $$4.a()) {
               this.dU().a(null, this.dz(), this.dB(), this.dF(), $$4.b(), this.dl(), 1.0F, 1.0F, this.ae.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? ecp.v : ecp.S);
            }
         }
      }
   }

   @Override
   public void a(bva.d $$0) {
      if (($$0 == bva.d.a || $$0 == bva.d.b) && this.dU() instanceof ard $$1) {
         this.a($$1, $$0);
      }

      super.a($$0);
      this.bs.a();
   }

   protected void a(ard $$0, bva.d $$1) {
      for (bue $$2 : this.eB()) {
         $$2.a($$0, this, $$1);
      }

      this.bG.clear();
   }

   @Override
   public void b(tq $$0) {
      $$0.a("Health", this.eE());
      $$0.a("HurtTime", (short)this.aN);
      $$0.a("HurtByTimestamp", this.bN);
      $$0.a("DeathTime", (short)this.aP);
      $$0.a("AbsorptionAmount", this.fy());
      $$0.a("attributes", this.eY().d());
      if (!this.bG.isEmpty()) {
         tw $$1 = new tw();

         for (bue $$2 : this.bG.values()) {
            $$1.add($$2.k());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fL());
      this.fR().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<un> $$3 = this.bs.a(ue.a);
      $$3.resultOrPartial(a::error).ifPresent($$1 -> $$0.a("Brain", $$1));
      this.ba = bvf.b($$0, "last_hurt_by_player");
      this.bb = $$0.h("last_hurt_by_player_memory_time");
      this.bM = bvf.b($$0, "last_hurt_by_mob");
      this.bN = $$0.h("ticks_since_last_hurt_by_mob") + this.af;
   }

   @Override
   public void a(tq $$0) {
      this.G($$0.j("AbsorptionAmount"));
      if ($$0.b("attributes", 9) && this.dU() != null && !this.dU().C) {
         this.eY().a($$0.c("attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         tw $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tq $$3 = $$1.a($$2);
            bue $$4 = bue.a($$3);
            if ($$4 != null) {
               this.bG.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.d($$0.j("Health"));
      }

      this.aN = $$0.g("HurtTime");
      this.aP = $$0.g("DeathTime");
      this.bN = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         fdc $$6 = this.dU().R();
         fcx $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cG(), $$7);
         if (!$$8) {
            a.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         ji $$9 = new ji($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.h($$9);
         this.al.a(aq, bwk.c);
         if (!this.ak) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bs = this.a(new Dynamic(ue.a, $$0.c("Brain")));
      }

      if (this.ba != null) {
         this.ba.a($$0, "last_hurt_by_player");
         $$0.a("last_hurt_by_player_memory_time", this.bb);
      }

      if (this.bM != null) {
         this.bM.a($$0, "last_hurt_by_mob");
         $$0.a("ticks_since_last_hurt_by_mob", this.af - this.bN);
      }
   }

   protected void ew() {
      if (this.dU() instanceof ard $$0) {
         Iterator<jr<buc>> $$1 = this.bG.keySet().iterator();

         try {
            while ($$1.hasNext()) {
               jr<buc> $$2 = $$1.next();
               bue $$3 = this.bG.get($$2);
               if (!$$3.a($$0, this, () -> this.a($$3, true, null))) {
                  $$1.remove();
                  this.c(List.of($$3));
               } else if ($$3.d() % 600 == 0) {
                  this.a($$3, false, null);
               }
            }
         } catch (ConcurrentModificationException var6) {
         }

         if (this.bL) {
            this.K();
            this.u();
            this.bL = false;
         }
      } else {
         for (bue $$4 : this.bG.values()) {
            $$4.i();
         }

         List<lr> $$5 = this.al.a(by);
         if (!$$5.isEmpty()) {
            boolean $$6 = this.al.a(bz);
            int $$7 = this.co() ? 15 : 4;
            int $$8 = $$6 ? 5 : 1;
            if (this.ae.a($$7 * $$8) == 0) {
               this.dU().a(af.a($$5, this.ae), this.d(0.5), this.dC(), this.g(0.5), 1.0, 1.0, 1.0);
            }
         }
      }
   }

   protected void K() {
      if (this.bG.isEmpty()) {
         this.ez();
         this.k(false);
      } else {
         this.k(this.b(bug.n));
         this.q();
      }
   }

   private void q() {
      List<lr> $$0 = this.bG.values().stream().filter(bue::g).map(bue::a).toList();
      this.al.a(by, $$0);
      this.al.a(bz, d(this.bG.values()));
   }

   private void u() {
      boolean $$0 = this.cn();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable bva $$0) {
      double $$1 = 1.0;
      if (this.cf()) {
         $$1 *= 0.8;
      }

      if (this.co()) {
         float $$2 = this.ff();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cxh $$3 = this.a(bvj.f);
         bvi<?> $$4 = $$0.aq();
         if ($$4 == bvi.be && $$3.a(cxl.vm)
            || $$4 == bvi.bN && $$3.a(cxl.vp)
            || $$4 == bvi.aR && $$3.a(cxl.vs)
            || $$4 == bvi.aS && $$3.a(cxl.vs)
            || $$4 == bvi.E && $$3.a(cxl.vq)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bvy $$0) {
      return $$0 instanceof cpr && this.dU().an() == bsv.a ? false : $$0.ex();
   }

   public boolean ex() {
      return !this.cB() && this.ey();
   }

   public boolean ey() {
      return !this.U_() && this.bJ();
   }

   public static boolean d(Collection<bue> $$0) {
      for (bue $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void ez() {
      this.al.a(by, List.of());
   }

   public boolean eA() {
      if (this.dU().C) {
         return false;
      } else if (this.bG.isEmpty()) {
         return false;
      } else {
         Map<jr<buc>, bue> $$0 = Maps.newHashMap(this.bG);
         this.bG.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<bue> eB() {
      return this.bG.values();
   }

   public Map<jr<buc>, bue> eC() {
      return this.bG;
   }

   public boolean b(jr<buc> $$0) {
      return this.bG.containsKey($$0);
   }

   @Nullable
   public bue c(jr<buc> $$0) {
      return this.bG.get($$0);
   }

   public float a(jr<buc> $$0, float $$1) {
      bue $$2 = this.c($$0);
      return $$2 != null ? $$2.a(this, $$1) : 0.0F;
   }

   public final boolean a(bue $$0) {
      return this.b($$0, null);
   }

   public boolean b(bue $$0, @Nullable bva $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         bue $$2 = this.bG.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bG.put($$0.c(), $$0);
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

   public boolean b(bue $$0) {
      if (this.aq().a(awt.G)) {
         return !$$0.a(bug.M);
      } else if (this.aq().a(awt.F)) {
         return !$$0.a(bug.L);
      } else {
         return !this.aq().a(awt.w) ? true : !$$0.a(bug.j) && !$$0.a(bug.s);
      }
   }

   public void c(bue $$0, @Nullable bva $$1) {
      if (this.b($$0)) {
         bue $$2 = this.bG.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eD() {
      return this.aq().a(awt.x);
   }

   @Nullable
   public final bue d(jr<buc> $$0) {
      return this.bG.remove($$0);
   }

   public boolean e(jr<buc> $$0) {
      bue $$1 = this.d($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(bue $$0, @Nullable bva $$1) {
      if (!this.dU().C) {
         this.bL = true;
         $$0.c().a().a(this.eY(), $$0.e());
         this.c($$0);
      }
   }

   public void c(bue $$0) {
      for (bva $$1 : this.cX()) {
         if ($$1 instanceof are $$2) {
            $$2.f.b(new afy(this.ar(), $$0, false));
         }
      }
   }

   protected void a(bue $$0, boolean $$1, @Nullable bva $$2) {
      if (!this.dU().C) {
         this.bL = true;
         if ($$1) {
            buc $$3 = $$0.c().a();
            $$3.a(this.eY());
            $$3.a(this.eY(), $$0.e());
            this.D();
         }

         this.c($$0);
      }
   }

   protected void c(Collection<bue> $$0) {
      if (!this.dU().C) {
         this.bL = true;

         for (bue $$1 : $$0) {
            $$1.c().a().a(this.eY());

            for (bva $$2 : this.cX()) {
               if ($$2 instanceof are $$3) {
                  $$3.f.b(new aeb(this.ar(), $$1.c()));
               }
            }
         }

         this.D();
      }
   }

   private void D() {
      Set<bxc> $$0 = this.eY().b();

      for (bxc $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(jr<bxb> $$0) {
      if ($$0.a(bxg.s)) {
         float $$1 = this.eS();
         if (this.eE() > $$1) {
            this.d($$1);
         }
      } else if ($$0.a(bxg.r)) {
         float $$2 = this.eT();
         if (this.fy() > $$2) {
            this.F($$2);
         }
      } else if ($$0.a(bxg.y)) {
         this.i_();
      }
   }

   public void c(float $$0) {
      float $$1 = this.eE();
      if ($$1 > 0.0F) {
         this.d($$1 + $$0);
      }
   }

   public float eE() {
      return this.al.a(bx);
   }

   public void d(float $$0) {
      this.al.a(bx, ayz.a($$0, 0.0F, this.eS()));
   }

   public boolean eF() {
      return this.eE() <= 0.0F;
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.eF()) {
         return false;
      } else if ($$1.a(awr.i) && this.b(bug.l)) {
         return false;
      } else {
         if (this.fT()) {
            this.fU();
         }

         this.bd = 0;
         if ($$2 < 0.0F) {
            $$2 = 0.0F;
         }

         float $$3 = $$2;
         boolean $$4 = false;
         float $$5 = 0.0F;
         if ($$2 > 0.0F && this.i($$1)) {
            this.z($$2);
            $$5 = $$2;
            $$2 = 0.0F;
            if (!$$1.a(awr.j) && $$1.c() instanceof bvy $$7) {
               this.d($$7);
            }

            $$4 = true;
         }

         if ($$1.a(awr.o) && this.aq().a(awt.l)) {
            $$2 *= 5.0F;
         }

         if ($$1.a(awr.a) && !this.a(bvj.f).f()) {
            this.d($$1, $$2);
            $$2 *= 0.75F;
         }

         if (Float.isNaN($$2) || Float.isInfinite($$2)) {
            $$2 = Float.MAX_VALUE;
         }

         boolean $$8 = true;
         if ((float)this.aj > 10.0F && !$$1.a(awr.e)) {
            if ($$2 <= this.be) {
               return false;
            }

            this.b($$0, $$1, $$2 - this.be);
            this.be = $$2;
            $$8 = false;
         } else {
            this.be = $$2;
            this.aj = 20;
            this.b($$0, $$1, $$2);
            this.aO = 10;
            this.aN = this.aO;
         }

         this.f($$1);
         this.g($$1);
         if ($$8) {
            if ($$4) {
               $$0.a(this, (byte)29);
            } else {
               $$0.a(this, $$1);
            }

            if (!$$1.a(awr.r) && (!$$4 || $$2 > 0.0F)) {
               this.bB();
            }

            if (!$$1.a(awr.z)) {
               double $$9 = 0.0;
               double $$10 = 0.0;
               if ($$1.c() instanceof cqk $$11) {
                  DoubleDoubleImmutablePair $$12 = $$11.a_(this, $$1);
                  $$9 = -$$12.leftDouble();
                  $$10 = -$$12.rightDouble();
               } else if ($$1.i() != null) {
                  $$9 = $$1.i().a() - this.dz();
                  $$10 = $$1.i().c() - this.dF();
               }

               this.p(0.4F, $$9, $$10);
               if (!$$4) {
                  this.a($$9, $$10);
               }
            }
         }

         if (this.eF()) {
            if (!this.k($$1)) {
               if ($$8) {
                  this.b(this.l_());
               }

               this.a($$1);
            }
         } else if ($$8) {
            this.h($$1);
            this.j($$1);
         }

         boolean $$13 = !$$4 || $$2 > 0.0F;
         if ($$13) {
            this.bV = $$1;
            this.bW = this.dU().ae();

            for (bue $$14 : this.eB()) {
               $$14.a($$0, this, $$1, $$2);
            }
         }

         if (this instanceof are $$15) {
            ap.i.a($$15, $$1, $$3, $$2, $$4);
            if ($$5 > 0.0F && $$5 < 3.4028235E37F) {
               $$15.a(awk.K, Math.round($$5 * 10.0F));
            }
         }

         if ($$1.d() instanceof are $$16) {
            ap.h.a($$16, this, $$1, $$3, $$2, $$4);
         }

         return $$13;
      }
   }

   private void j(btp $$0) {
      if ($$0.a(bts.P)) {
         awb $$1 = this instanceof cpr ? awb.h : awb.f;
         this.dU().a(null, this.ds().d, this.ds().e, this.ds().f, awa.Av, $$1);
      }
   }

   protected void f(btp $$0) {
      if ($$0.d() instanceof bvy $$1 && !$$0.a(awr.q) && (!$$0.a(bts.I) || !this.aq().a(awt.E))) {
         this.a($$1);
      }
   }

   @Nullable
   protected cpr g(btp $$0) {
      bva $$1 = $$0.d();
      if ($$1 instanceof cpr $$2) {
         this.a($$2, 100);
      } else if ($$1 instanceof civ $$3 && $$3.q()) {
         if ($$3.W_() != null) {
            this.a($$3.W_().c(), 100);
         } else {
            this.ba = null;
            this.bb = 0;
         }
      }

      return bvf.a(this.ba, this.dU(), cpr.class);
   }

   protected void d(bvy $$0) {
      $$0.e(this);
   }

   protected void e(bvy $$0) {
      $$0.p(0.5, $$0.dz() - this.dz(), $$0.dF() - this.dF());
   }

   private boolean k(btp $$0) {
      if ($$0.a(awr.d)) {
         return false;
      } else {
         cxh $$1 = null;
         czr $$2 = null;

         for (bsx $$3 : bsx.values()) {
            cxh $$4 = this.b($$3);
            $$2 = $$4.a(kv.I);
            if ($$2 != null) {
               $$1 = $$4.v();
               $$4.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof are $$5) {
               $$5.b(awk.c.b($$1.h()));
               ap.C.a($$5, $$1);
               this.a(ecp.C);
            }

            this.d(1.0F);
            $$2.a($$1, this);
            this.dU().a(this, (byte)35);
         }

         return $$2 != null;
      }
   }

   @Nullable
   public btp eG() {
      if (this.dU().ae() - this.bW > 40L) {
         this.bV = null;
      }

      return this.bV;
   }

   protected void h(btp $$0) {
      this.b(this.e($$0));
   }

   public void b(@Nullable avz $$0) {
      if ($$0 != null) {
         this.a($$0, this.fg(), this.fh());
      }
   }

   public boolean i(btp $$0) {
      bva $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cpy $$3 && $$3.u() > 0) {
         $$2 = true;
      }

      cxh $$4 = this.fJ();
      if (!$$0.a(awr.c) && $$4 != null && $$4.h() instanceof cyi && !$$2) {
         fbx $$5 = $$0.i();
         if ($$5 != null) {
            fbx $$6 = this.d(0.0F, this.cz());
            fbx $$7 = $$5.a(this.ds());
            $$7 = new fbx($$7.d, 0.0, $$7.f).d();
            return $$7.b($$6) < 0.0;
         }
      }

      return false;
   }

   private void g(cxh $$0) {
      if (!$$0.f()) {
         if (!this.bb()) {
            this.dU().a(this.dz(), this.dB(), this.dF(), $$0.N(), this.dl(), 0.8F, 0.8F + this.dU().A.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(btp $$0) {
      if (!this.dP() && !this.bc) {
         bva $$1 = $$0.d();
         bvy $$2 = this.eR();
         if ($$2 != null) {
            $$2.a(this, $$0);
         }

         if (this.fT()) {
            this.fU();
         }

         if (!this.dU().C && this.h_()) {
            a.info("Named entity {} died: {}", this, this.eQ().a().getString());
         }

         this.bc = true;
         this.eQ().c();
         if (this.dU() instanceof ard $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(ecp.p);
               this.b($$3, $$0);
               this.f($$2);
            }

            this.dU().a(this, (byte)3);
         }

         this.b(bwk.h);
      }
   }

   protected void f(@Nullable bvy $$0) {
      if (this.dU() instanceof ard $$1) {
         boolean var6 = false;
         if ($$0 instanceof clj) {
            if ($$1.O().b(dgv.c)) {
               ji $$4 = this.du();
               dxq $$5 = dkg.ck.m();
               if (this.dU().a_($$4).l() && $$5.a((dhc)this.dU(), $$4)) {
                  this.dU().a($$4, $$5, 3);
                  var6 = true;
               }
            }

            if (!var6) {
               clw $$6 = new clw(this.dU(), this.dz(), this.dB(), this.dF(), new cxh(cxl.dF));
               this.dU().b($$6);
            }
         }
      }
   }

   protected void b(ard $$0, btp $$1) {
      boolean $$2 = this.bb > 0;
      if (this.en() && $$0.O().b(dgv.f)) {
         this.b($$0, $$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.f($$0);
      this.b($$0, $$1.d());
   }

   protected void f(ard $$0) {
   }

   protected void b(ard $$0, @Nullable bva $$1) {
      if (!this.eJ() && (this.eo() || this.bb > 0 && this.em() && $$0.O().b(dgv.f))) {
         bvn.a($$0, this.ds(), this.a($$0, $$1));
      }
   }

   protected void a(ard $$0, btp $$1, boolean $$2) {
   }

   public long eH() {
      return 0L;
   }

   protected float b(bva $$0, btp $$1) {
      float $$2 = (float)this.h(bxg.d);
      return this.dU() instanceof ard $$3 ? ddt.d($$3, this.dY(), $$0, $$1, $$2) : $$2;
   }

   protected void b(ard $$0, btp $$1, boolean $$2) {
      Optional<akt<ewt>> $$3 = this.dZ();
      if (!$$3.isEmpty()) {
         ewt $$4 = $$0.p().bc().b($$3.get());
         ewr.a $$5 = new ewr.a($$0).a(ezi.a, this).a(ezi.f, this.ds()).a(ezi.c, $$1).b(ezi.d, $$1.d()).b(ezi.e, $$1.c());
         cpr $$6 = this.eq();
         if ($$2 && $$6 != null) {
            $$5 = $$5.a(ezi.b, $$6).a($$6.ef());
         }

         ewr $$7 = $$5.a(ezh.g);
         $$4.a($$7, this.eH(), $$1x -> this.a($$0, $$1x));
      }
   }

   public boolean a(ard $$0, akt<ewt> $$1, BiConsumer<ard, cxh> $$2) {
      return this.a($$0, $$1, $$0x -> $$0x.a(ezi.f, this.ds()).a(ezi.a, this).a(ezh.j), $$2);
   }

   protected void a(ard $$0, akt<ewt> $$1, cxh $$2, BiConsumer<ard, cxh> $$3) {
      this.a($$0, $$1, $$1x -> $$1x.a(ezi.f, this.ds()).a(ezi.a, this).a(ezi.i, $$2).a(ezh.s), $$3);
   }

   protected boolean a(ard $$0, akt<ewt> $$1, Function<ewr.a, ewr> $$2, BiConsumer<ard, cxh> $$3) {
      ewt $$4 = $$0.p().bc().b($$1);
      ewr $$5 = $$2.apply(new ewr.a($$0));
      List<cxh> $$6 = $$4.a($$5);
      if (!$$6.isEmpty()) {
         $$6.forEach($$2x -> $$3.accept($$0, $$2x));
         return true;
      } else {
         return false;
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(bxg.p);
      if (!($$0 <= 0.0)) {
         this.ar = true;
         fbx $$3 = this.dx();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         fbx $$4 = new fbx($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aJ() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected avz e(btp $$0) {
      return awa.kG;
   }

   @Nullable
   protected avz l_() {
      return awa.kB;
   }

   private avz q(int $$0) {
      return $$0 > 4 ? this.eM().b() : this.eM().a();
   }

   public void eI() {
      this.bZ = true;
   }

   public boolean eJ() {
      return this.bZ;
   }

   public float eK() {
      return 0.0F;
   }

   protected fbs eL() {
      fbs $$0 = this.cQ();
      bva $$1 = this.dj();
      if ($$1 != null) {
         fbx $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<ddr, Set<dej>> c(bvj $$0) {
      return (Map<ddr, Set<dej>>)this.ca.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public bvy.a eM() {
      return new bvy.a(awa.kH, awa.kz);
   }

   public Optional<ji> eN() {
      return this.bU;
   }

   public boolean d_() {
      if (this.U_()) {
         return false;
      } else {
         ji $$0 = this.du();
         dxq $$1 = this.dv();
         if ($$1.a(awp.aS)) {
            this.bU = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dsx && this.c($$0, $$1)) {
            this.bU = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(ji $$0, dxq $$1) {
      if (!$$1.c(dsx.b)) {
         return false;
      } else {
         dxq $$2 = this.dU().a_($$0.e());
         return $$2.a(dkg.cX) && $$2.c(don.b) == $$1.c(dsx.e);
      }
   }

   @Override
   public boolean bJ() {
      return !this.dP() && this.eE() > 0.0F;
   }

   public boolean a(bvy $$0, double $$1, boolean $$2, boolean $$3, double... $$4) {
      fbx $$5 = $$0.h(1.0F).d();

      for (double $$6 : $$4) {
         fbx $$7 = new fbx(this.dz() - $$0.dz(), $$6 - $$0.dD(), this.dF() - $$0.dF());
         double $$8 = $$7.g();
         $$7 = $$7.d();
         double $$9 = $$5.b($$7);
         if ($$9 > 1.0 - $$1 / ($$2 ? $$8 : 1.0) && $$0.a(this, $$3 ? dgi.a.c : dgi.a.a, dgi.b.a, $$6)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public int cD() {
      return this.y(0.0F);
   }

   protected final int y(float $$0) {
      return ayz.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, btp $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.f($$0, $$1);
      if ($$4 > 0) {
         this.a(this.q($$4), 1.0F, 1.0F);
         this.eO();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int f(float $$0, float $$1) {
      if (this.aq().a(awt.o)) {
         return 0;
      } else {
         float $$2 = (float)this.h(bxg.x);
         float $$3 = $$0 - $$2;
         return ayz.c((double)($$3 * $$1) * this.h(bxg.k));
      }
   }

   protected void eO() {
      if (!this.bb()) {
         int $$0 = ayz.a(this.dz());
         int $$1 = ayz.a(this.dB() - 0.2F);
         int $$2 = ayz.a(this.dF());
         dxq $$3 = this.dU().a_(new ji($$0, $$1, $$2));
         if (!$$3.l()) {
            drx $$4 = $$3.A();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void q(float $$0) {
      this.aO = 10;
      this.aN = this.aO;
   }

   public int eP() {
      return ayz.a(this.h(bxg.a));
   }

   protected void c(btp $$0, float $$1) {
   }

   protected void d(btp $$0, float $$1) {
   }

   protected void z(float $$0) {
   }

   protected void a(btp $$0, float $$1, bvj... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bvj $$4 : $$2) {
            cxh $$5 = this.a($$4);
            dfm $$6 = $$5.a(kv.E);
            if ($$6 != null && $$6.h() && $$5.m() && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float e(btp $$0, float $$1) {
      if (!$$0.a(awr.b)) {
         this.c($$0, $$1);
         $$1 = btl.a(this, $$1, $$0, (float)this.eP(), (float)this.h(bxg.b));
      }

      return $$1;
   }

   protected float f(btp $$0, float $$1) {
      if ($$0.a(awr.f)) {
         return $$1;
      } else {
         if (this.b(bug.k) && !$$0.a(awr.g)) {
            int $$2 = (this.c(bug.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof are) {
                  ((are)this).a(awk.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof are) {
                  ((are)$$0.d()).a(awk.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(awr.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dU() instanceof ard $$7) {
               $$8 = ddt.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = btl.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void b(ard $$0, btp $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var10 = Math.max($$2 - this.fy(), 0.0F);
         this.F(this.fy() - ($$2 - var10));
         float $$4 = $$2 - var10;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F && $$1.d() instanceof are $$5) {
            $$5.a(awk.H, Math.round($$4 * 10.0F));
         }

         if (var10 != 0.0F) {
            this.eQ().a($$1, var10);
            this.d(this.eE() - var10);
            this.F(this.fy() - var10);
            this.a(ecp.o);
         }
      }
   }

   public btm eQ() {
      return this.bF;
   }

   @Nullable
   public bvy eR() {
      if (this.ba != null) {
         return this.ba.a(this.dU(), cpr.class);
      } else {
         return this.bM != null ? this.bM.a(this.dU(), bvy.class) : null;
      }
   }

   public final float eS() {
      return (float)this.h(bxg.s);
   }

   public final float eT() {
      return (float)this.h(bxg.r);
   }

   public final int eU() {
      return this.al.a(bA);
   }

   public final void o(int $$0) {
      this.al.a(bA, $$0);
   }

   public final int eV() {
      return this.al.a(bB);
   }

   public final void p(int $$0) {
      this.al.a(bB, $$0);
   }

   private int E() {
      if (buf.a(this)) {
         return 6 - (1 + buf.b(this));
      } else {
         return this.b(bug.d) ? 6 + (1 + this.c(bug.d).e()) * 2 : 6;
      }
   }

   public void a(bsx $$0) {
      this.a($$0, false);
   }

   public void a(bsx $$0, boolean $$1) {
      if (!this.aI || this.aK >= this.E() / 2 || this.aK < 0) {
         this.aK = -1;
         this.aI = true;
         this.aJ = $$0;
         if (this.dU() instanceof ard) {
            abn $$2 = new abn(this, $$0 == bsx.a ? 0 : 3);
            ara $$3 = ((ard)this.dU()).m();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(btp $$0) {
      this.aT.a(1.5F);
      this.aj = 20;
      this.aO = 10;
      this.aN = this.aO;
      avz $$1 = this.e($$0);
      if ($$1 != null) {
         this.a($$1, this.fg(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }

      this.bV = $$0;
      this.bW = this.dU().ae();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            avz $$1 = this.l_();
            if ($$1 != null) {
               this.a($$1, this.fg(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cpr)) {
               this.d(0.0F);
               this.a(this.dV().p());
            }
            break;
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 53:
         case 56:
         case 57:
         case 58:
         case 59:
         case 61:
         case 62:
         case 63:
         case 64:
         case 66:
         default:
            super.b($$0);
            break;
         case 29:
            this.a(awa.xn, 1.0F, 0.8F + this.dU().A.i() * 0.4F);
            break;
         case 30:
            this.a(awa.xo, 0.8F, 0.8F + this.dU().A.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ae.i() - 0.5F) * 0.2F;
               float $$6 = (this.ae.i() - 0.5F) * 0.2F;
               float $$7 = (this.ae.i() - 0.5F) * 0.2F;
               double $$8 = ayz.d($$4, this.K, this.dz()) + (this.ae.j() - 0.5) * (double)this.dp() * 2.0;
               double $$9 = ayz.d($$4, this.L, this.dB()) + this.ae.j() * (double)this.dq();
               double $$10 = ayz.d($$4, this.M, this.dF()) + (this.ae.j() - 0.5) * (double)this.dp() * 2.0;
               this.dU().a(lt.af, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.g(this.a(bvj.a));
            break;
         case 48:
            this.g(this.a(bvj.b));
            break;
         case 49:
            this.g(this.a(bvj.f));
            break;
         case 50:
            this.g(this.a(bvj.e));
            break;
         case 51:
            this.g(this.a(bvj.d));
            break;
         case 52:
            this.g(this.a(bvj.c));
            break;
         case 54:
            dob.b(this);
            break;
         case 55:
            this.G();
            break;
         case 60:
            this.eW();
            break;
         case 65:
            this.g(this.a(bvj.g));
            break;
         case 67:
            this.F();
      }
   }

   public void eW() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.ae.k() * 0.02;
         double $$2 = this.ae.k() * 0.02;
         double $$3 = this.ae.k() * 0.02;
         double $$4 = 10.0;
         this.dU().a(lt.ae, this.d(1.0) - $$1 * 10.0, this.dC() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
      }
   }

   private void F() {
      fbx $$0 = this.dx();

      for (int $$1 = 0; $$1 < 8; $$1++) {
         double $$2 = this.ae.a(0.0, 1.0);
         double $$3 = this.ae.a(0.0, 1.0);
         double $$4 = this.ae.a(0.0, 1.0);
         this.dU().a(lt.d, this.dz() + $$2, this.dB() + $$3, this.dF() + $$4, $$0.d, $$0.e, $$0.f);
      }
   }

   private void G() {
      cxh $$0 = this.a(bvj.b);
      this.a(bvj.b, this.a(bvj.a));
      this.a(bvj.a, $$0);
   }

   @Override
   protected void aI() {
      this.a(this.dV().o(), 4.0F);
   }

   protected void eX() {
      int $$0 = this.E();
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
   public bxc g(jr<bxb> $$0) {
      return this.eY().a($$0);
   }

   public double h(jr<bxb> $$0) {
      return this.eY().c($$0);
   }

   public double i(jr<bxb> $$0) {
      return this.eY().d($$0);
   }

   public bxd eY() {
      return this.bE;
   }

   public cxh eZ() {
      return this.a(bvj.a);
   }

   public cxh fa() {
      return this.a(bvj.b);
   }

   public cxh a(bvr $$0) {
      return this.fA() == $$0 ? this.eZ() : this.fa();
   }

   @Nonnull
   @Override
   public cxh dY() {
      return this.eZ();
   }

   public boolean b(cxd $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cxh> $$0) {
      return $$0.test(this.eZ()) || $$0.test(this.fa());
   }

   public cxh b(bsx $$0) {
      if ($$0 == bsx.a) {
         return this.a(bvj.a);
      } else if ($$0 == bsx.b) {
         return this.a(bvj.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bsx $$0, cxh $$1) {
      if ($$0 == bsx.a) {
         this.a(bvj.a, $$1);
      } else {
         if ($$0 != bsx.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bvj.b, $$1);
      }
   }

   public boolean d(bvj $$0) {
      return !this.a($$0).f();
   }

   public boolean e(bvj $$0) {
      return false;
   }

   public abstract Iterable<cxh> fb();

   public abstract cxh a(bvj var1);

   public abstract void a(bvj var1, cxh var2);

   public Iterable<cxh> fc() {
      return List.of();
   }

   public Iterable<cxh> fd() {
      return this.fb();
   }

   public Iterable<cxh> fe() {
      return Iterables.concat(this.fc(), this.fd());
   }

   protected void c(cxh $$0) {
      $$0.h().l($$0);
   }

   public float ff() {
      Iterable<cxh> $$0 = this.fb();
      int $$1 = 0;
      int $$2 = 0;

      for (cxh $$3 : $$0) {
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
      bxc $$1 = this.g(bxg.v);
      $$1.c(k.b());
      if ($$0) {
         $$1.b(k);
      }
   }

   protected float fg() {
      return 1.0F;
   }

   public float fh() {
      return this.n_() ? (this.ae.i() - this.ae.i()) * 0.2F + 1.5F : (this.ae.i() - this.ae.i()) * 0.2F + 1.0F;
   }

   protected boolean fi() {
      return this.eF();
   }

   @Override
   public void h(bva $$0) {
      if (!this.fT()) {
         super.h($$0);
      }
   }

   private void c(bva $$0) {
      fbx $$1;
      if (this.dP()) {
         $$1 = this.ds();
      } else if (!$$0.dP() && !this.dU().a_($$0.du()).a(awp.aM)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dB(), $$0.dB());
         $$1 = new fbx(this.dz(), $$2, this.dF());
         boolean $$4 = this.dp() <= 4.0F && this.dq() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.dq() / 2.0;
            fbx $$6 = $$1.b(0.0, $$5, 0.0);
            fcr $$7 = fco.a(fbs.a($$6, (double)this.dp(), (double)this.dq(), (double)this.dp()));
            $$1 = this.dU().a(this, $$7, $$6, (double)this.dp(), (double)this.dq(), (double)this.dp()).map($$1x -> $$1x.b(0.0, -$$5, 0.0)).orElse($$1);
         }
      }

      this.a($$1.d, $$1.e, $$1.f);
   }

   @Override
   public boolean cL() {
      return this.cK();
   }

   protected float fj() {
      return this.A(1.0F);
   }

   protected float A(float $$0) {
      return (float)this.h(bxg.o) * $$0 * this.aS() + this.fk();
   }

   public float fk() {
      return this.b(bug.h) ? 0.1F * ((float)this.c(bug.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void s() {
      float $$0 = this.fj();
      if (!($$0 <= 1.0E-5F)) {
         fbx $$1 = this.dx();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.ci()) {
            float $$2 = this.dK() * (float) (Math.PI / 180.0);
            this.j(new fbx((double)(-ayz.a($$2)) * 0.2, 0.0, (double)ayz.b($$2) * 0.2));
         }

         this.ar = true;
      }
   }

   protected void fl() {
      this.i(this.dx().b(0.0, -0.04F, 0.0));
   }

   protected void c(axf<etv> $$0) {
      this.i(this.dx().b(0.0, 0.04F, 0.0));
   }

   protected float fm() {
      return 0.8F;
   }

   public boolean a(etw $$0) {
      return false;
   }

   @Override
   protected double bd() {
      return this.h(bxg.n);
   }

   protected double fn() {
      boolean $$0 = this.dx().e <= 0.0;
      return $$0 && this.b(bug.B) ? Math.min(this.be(), 0.01) : this.be();
   }

   public void a_(fbx $$0) {
      etw $$1 = this.dU().b_(this.du());
      if ((this.bj() || this.bv()) && this.ek() && !this.a($$1)) {
         this.m($$0);
      } else if (this.fL()) {
         this.n($$0);
      } else {
         this.l($$0);
      }
   }

   private void l(fbx $$0) {
      ji $$1 = this.aQ();
      float $$2 = this.aJ() ? this.dU().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      fbx $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      bue $$6 = this.c(bug.y);
      if ($$6 != null) {
         $$5 += (0.05 * (double)($$6.e() + 1) - $$4.e) * 0.2;
      } else if (!this.dU().C || this.dU().B($$1)) {
         $$5 -= this.fn();
      } else if (this.dB() > (double)this.dU().G_()) {
         $$5 = -0.1;
      } else {
         $$5 = 0.0;
      }

      if (this.ev()) {
         this.n($$4.d, $$5, $$4.f);
      } else {
         float $$7 = this instanceof chy ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void m(fbx $$0) {
      boolean $$1 = this.dx().e <= 0.0;
      double $$2 = this.dB();
      double $$3 = this.fn();
      if (this.bj()) {
         float $$4 = this.ci() ? 0.9F : this.fm();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(bxg.F);
         if (!this.aJ()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fq() - $$5) * $$6;
         }

         if (this.b(bug.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(bwc.a, this.dx());
         fbx $$7 = this.dx();
         if (this.P && this.d_()) {
            $$7 = new fbx($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.i(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(bwc.a, this.dx());
         if (this.b(awv.b) <= this.do()) {
            this.i(this.dx().d(0.5, 0.8F, 0.5));
            fbx $$8 = this.a($$3, $$1, this.dx());
            this.i($$8);
         } else {
            this.i(this.dx().c(0.5));
         }

         if ($$3 != 0.0) {
            this.i(this.dx().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      fbx $$9 = this.dx();
      if (this.P && this.g($$9.d, $$9.e + 0.6F - this.dB() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void n(fbx $$0) {
      if (this.d_()) {
         this.l($$0);
         this.fo();
      } else {
         fbx $$1 = this.dx();
         double $$2 = $$1.i();
         this.i(this.o($$1));
         this.a(bwc.a, this.dx());
         if (!this.dU().C) {
            double $$3 = this.dx().i();
            this.c($$2, $$3);
         }
      }
   }

   public void fo() {
      this.b(7, true);
      this.b(7, false);
   }

   private fbx o(fbx $$0) {
      fbx $$1 = this.bS();
      float $$2 = this.dM() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fn();
      double $$6 = ayz.k(Math.cos((double)$$2));
      $$0 = $$0.b(0.0, $$5 * (-1.0 + $$6 * 0.75), 0.0);
      if ($$0.e < 0.0 && $$3 > 0.0) {
         double $$7 = $$0.e * -0.1 * $$6;
         $$0 = $$0.b($$1.d * $$7 / $$3, $$7, $$1.f * $$7 / $$3);
      }

      if ($$2 < 0.0F && $$3 > 0.0) {
         double $$8 = $$4 * (double)(-ayz.a($$2)) * 0.04;
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
            this.a(this.dV().n(), $$3);
         }
      }
   }

   private void c(cpr $$0, fbx $$1) {
      fbx $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.dh()) {
         this.C(this.c($$0));
         this.a_($$2);
      } else {
         this.i(fbx.c);
      }
   }

   protected void a(cpr $$0, fbx $$1) {
   }

   protected fbx b(cpr $$0, fbx $$1) {
      return $$1;
   }

   protected float c(cpr $$0) {
      return this.fq();
   }

   public void r(boolean $$0) {
      float $$1 = (float)ayz.g(this.dz() - this.K, $$0 ? this.dB() - this.L : 0.0, this.dF() - this.M);
      if (!this.bY() && this.bJ()) {
         this.B($$1);
      } else {
         this.aT.a();
      }
   }

   protected void B(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aT.a($$1, 0.4F, this.n_() ? 3.0F : 1.0F);
   }

   private fbx a(fbx $$0, float $$1) {
      this.a(this.H($$1), $$0);
      this.i(this.p(this.dx()));
      this.a(bwc.a, this.dx());
      fbx $$2 = this.dx();
      if ((this.P || this.bf) && (this.d_() || this.dv().a(dkg.rr) && dqd.a(this))) {
         $$2 = new fbx($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public fbx a(double $$0, boolean $$1, fbx $$2) {
      if ($$0 != 0.0 && !this.ci()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new fbx($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private fbx p(fbx $$0) {
      if (this.d_()) {
         this.k();
         float $$1 = 0.15F;
         double $$2 = ayz.a($$0.d, -0.15F, 0.15F);
         double $$3 = ayz.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dv().a(dkg.ou) && this.fK() && this instanceof cpr) {
            $$4 = 0.0;
         }

         $$0 = new fbx($$2, $$4, $$3);
      }

      return $$0;
   }

   private float H(float $$0) {
      return this.aJ() ? this.fq() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fp();
   }

   protected float fp() {
      return this.cV() instanceof cpr ? this.fq() * 0.1F : 0.02F;
   }

   public float fq() {
      return this.bQ;
   }

   public void C(float $$0) {
      this.bQ = $$0;
   }

   public boolean c(ard $$0, bva $$1) {
      this.B($$1);
      return false;
   }

   @Override
   public void h() {
      super.h();
      this.J();
      this.L();
      if (!this.dU().C) {
         int $$0 = this.eU();
         if ($$0 > 0) {
            if (this.aL <= 0) {
               this.aL = 20 * (30 - $$0);
            }

            this.aL--;
            if (this.aL <= 0) {
               this.o($$0 - 1);
            }
         }

         int $$1 = this.eV();
         if ($$1 > 0) {
            if (this.aM <= 0) {
               this.aM = 20 * (30 - $$1);
            }

            this.aM--;
            if (this.aM <= 0) {
               this.p($$1 - 1);
            }
         }

         this.H();
         if (this.af % 20 == 0) {
            this.eQ().c();
         }

         if (this.fT() && !this.N()) {
            this.fU();
         }
      }

      if (!this.dP()) {
         this.k_();
      }

      double $$2 = this.dz() - this.K;
      double $$3 = this.dF() - this.M;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aV;
      if ($$4 > 0.0025000002F) {
         float $$6 = (float)ayz.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$7 = ayz.e(ayz.h(this.dK()) - $$6);
         if (95.0F < $$7 && $$7 < 265.0F) {
            $$5 = $$6 - 180.0F;
         } else {
            $$5 = $$6;
         }
      }

      if (this.aR > 0.0F) {
         $$5 = this.dK();
      }

      bpj $$8 = bpi.a();
      $$8.a("headTurn");
      this.D($$5);
      $$8.c();
      $$8.a("rangeChecks");

      while (this.dK() - this.N < -180.0F) {
         this.N -= 360.0F;
      }

      while (this.dK() - this.N >= 180.0F) {
         this.N += 360.0F;
      }

      while (this.aV - this.aW < -180.0F) {
         this.aW -= 360.0F;
      }

      while (this.aV - this.aW >= 180.0F) {
         this.aW += 360.0F;
      }

      while (this.dM() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dM() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aX - this.aY < -180.0F) {
         this.aY -= 360.0F;
      }

      while (this.aX - this.aY >= 180.0F) {
         this.aY += 360.0F;
      }

      $$8.c();
      if (this.fL()) {
         this.bo++;
      } else {
         this.bo = 0;
      }

      if (this.fT()) {
         this.x(0.0F);
      }

      this.D();
      this.aZ.a();
   }

   private void H() {
      Map<bvj, cxh> $$0 = this.I();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bvj, cxh> I() {
      Map<bvj, cxh> $$0 = null;

      for (bvj $$1 : bvj.i) {
         cxh $$2 = switch ($$1.a()) {
            case a -> this.h($$1);
            case b -> this.g($$1);
            case c -> this.bJ;
         };
         cxh $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bvj.class);
            }

            $$0.put($$1, $$3);
            bxd $$4 = this.eY();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<bvj, cxh> $$5 : $$0.entrySet()) {
            bvj $$6 = $$5.getKey();
            cxh $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1) -> {
                  bxc $$2 = this.bE.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1.b());
                     $$2.b($$1);
                  }
               });
               if (this.dU() instanceof ard $$8) {
                  ddt.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(cxh $$0, cxh $$1) {
      return !cxh.a($$1, $$0);
   }

   private void a(Map<bvj, cxh> $$0) {
      cxh $$1 = $$0.get(bvj.a);
      cxh $$2 = $$0.get(bvj.b);
      if ($$1 != null && $$2 != null && cxh.a($$1, this.h(bvj.b)) && cxh.a($$2, this.h(bvj.a))) {
         ((ard)this.dU()).m().b(this, new aco(this, (byte)55));
         $$0.remove(bvj.a);
         $$0.remove(bvj.b);
         this.c(bvj.a, $$1.v());
         this.c(bvj.b, $$2.v());
      }
   }

   private void b(Map<bvj, cxh> $$0) {
      List<Pair<bvj, cxh>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cxh $$3 = $$2.v();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
               break;
            case c:
               this.bJ = $$3;
         }
      });
      ((ard)this.dU()).m().b(this, new aex(this.ar(), $$1));
   }

   private cxh g(bvj $$0) {
      return this.bI.get($$0.b());
   }

   private void b(bvj $$0, cxh $$1) {
      this.bI.set($$0.b(), $$1);
   }

   private cxh h(bvj $$0) {
      return this.bH.get($$0.b());
   }

   private void c(bvj $$0, cxh $$1) {
      this.bH.set($$0.b(), $$1);
   }

   protected void D(float $$0) {
      float $$1 = ayz.h($$0 - this.aV);
      this.aV += $$1 * 0.3F;
      float $$2 = ayz.h(this.dK() - this.aV);
      float $$3 = this.fr();
      if (Math.abs($$2) > $$3) {
         this.aV = this.aV + ($$2 - (float)ayz.j((double)$$2) * $$3);
      }
   }

   protected float fr() {
      return 50.0F;
   }

   public void k_() {
      if (this.bR > 0) {
         this.bR--;
      }

      if (this.bQ()) {
         this.N_().e();
      } else if (!this.dh()) {
         this.i(this.dx().c(0.98));
      }

      if (this.bl > 0) {
         this.a(this.bl, this.bk);
         this.bl--;
      }

      fbx $$0 = this.dx();
      double $$1 = $$0.d;
      double $$2 = $$0.e;
      double $$3 = $$0.f;
      if (this.aq().equals(bvi.bR)) {
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
      bpj $$4 = bpi.a();
      $$4.a("ai");
      if (this.fi()) {
         this.bf = false;
         this.bg = 0.0F;
         this.bi = 0.0F;
      } else if (this.di()) {
         this.fs();
         if (!this.dU().C) {
            $$4.a("newAi");
            this.fw();
            $$4.c();
         }
      }

      $$4.c();
      $$4.a("jump");
      if (this.bf && this.ek()) {
         double $$5;
         if (this.bv()) {
            $$5 = this.b(awv.b);
         } else {
            $$5 = this.b(awv.a);
         }

         boolean $$7 = this.bj() && $$5 > 0.0;
         double $$8 = this.do();
         if (!$$7 || this.aJ() && !($$5 > $$8)) {
            if (!this.bv() || this.aJ() && !($$5 > $$8)) {
               if ((this.aJ() || $$7 && $$5 <= $$8) && this.bR == 0) {
                  this.s();
                  this.bR = 10;
               }
            } else {
               this.c(awv.b);
            }
         } else {
            this.c(awv.a);
         }
      } else {
         this.bR = 0;
      }

      $$4.c();
      $$4.a("travel");
      this.bg *= 0.98F;
      this.bi *= 0.98F;
      if (this.fL()) {
         this.fu();
      }

      fbs $$9 = this.cQ();
      fbx $$10 = new fbx((double)this.bg, (double)this.bh, (double)this.bi);
      if (this.b(bug.B) || this.b(bug.y)) {
         this.k();
      }

      label126: {
         if (this.cV() instanceof cpr $$11 && this.bJ()) {
            this.c($$11, $$10);
            break label126;
         }

         if (this.dh()) {
            this.a_($$10);
         }
      }

      if (!this.dU().w_() || this.df()) {
         this.aK();
      }

      if (this.dU().w_()) {
         this.r(this instanceof chy);
      }

      $$4.c();
      if (this.dU() instanceof ard $$12) {
         $$4.a("freezing");
         if (!this.eF()) {
            int $$13 = this.ct();
            if (this.av && this.dI()) {
               this.k(Math.min(this.cw(), $$13 + 1));
            } else {
               this.k(Math.max(0, $$13 - 2));
            }
         }

         this.eg();
         this.eh();
         if (this.af % 40 == 0 && this.cv() && this.dI()) {
            this.a($$12, this.dV().v(), 1.0F);
         }

         $$4.c();
      }

      $$4.a("push");
      if (this.bp > 0) {
         this.bp--;
         this.a($$9, this.cQ());
      }

      this.o();
      $$4.c();
      if (this.dU() instanceof ard $$14 && this.ft() && this.bk()) {
         this.a($$14, this.dV().i(), 1.0F);
      }
   }

   protected void fs() {
   }

   public boolean ft() {
      return false;
   }

   protected void fu() {
      this.cx();
      if (!this.dU().C) {
         if (!this.fv()) {
            this.b(7, false);
            return;
         }

         int $$0 = this.bo + 1;
         if ($$0 % 10 == 0) {
            int $$1 = $$0 / 10;
            if ($$1 % 2 == 0) {
               List<bvj> $$2 = bvj.i.stream().filter($$0x -> b(this.a($$0x), $$0x)).toList();
               bvj $$3 = af.a($$2, this.ae);
               this.a($$3).a(1, this, $$3);
            }

            this.a(ecp.n);
         }
      }
   }

   protected boolean fv() {
      if (!this.aJ() && !this.bY() && !this.b(bug.y)) {
         for (bvj $$0 : bvj.i) {
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

   @Override
   protected void o() {
      List<bva> $$0 = this.dU().i(this, this.cQ());
      if (!$$0.isEmpty()) {
         if (this.dU() instanceof ard $$1) {
            int $$2 = $$1.O().c(dgv.v);
            if ($$2 > 0 && $$0.size() > $$2 - 1 && this.ae.a(4) == 0) {
               int $$3 = 0;

               for (bva $$4 : $$0) {
                  if (!$$4.bY()) {
                     $$3++;
                  }
               }

               if ($$3 > $$2 - 1) {
                  this.a($$1, this.dV().h(), 6.0F);
               }
            }
         }

         for (bva $$5 : $$0) {
            this.D($$5);
         }
      }
   }

   protected void a(fbs $$0, fbs $$1) {
      fbs $$2 = $$0.b($$1);
      List<bva> $$3 = this.dU().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bva $$4 : $$3) {
            if ($$4 instanceof bvy) {
               this.g((bvy)$$4);
               this.bp = 0;
               this.i(this.dx().c(-0.2));
               break;
            }
         }
      } else if (this.P) {
         this.bp = 0;
      }

      if (!this.dU().C && this.bp <= 0) {
         this.c(4, false);
         this.bq = 0.0F;
         this.br = null;
      }
   }

   protected void D(bva $$0) {
      $$0.h(this);
   }

   protected void g(bvy $$0) {
   }

   public boolean fx() {
      return (this.al.a(aC) & 4) != 0;
   }

   @Override
   public void bO() {
      bva $$0 = this.dj();
      super.bO();
      if ($$0 != null && $$0 != this.dj() && !this.dU().C) {
         this.c($$0);
      }
   }

   @Override
   public void r() {
      super.r();
      this.k();
   }

   @Override
   public bvt N_() {
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

   public void a(clw $$0) {
      bva $$1 = $$0.q();
      if ($$1 instanceof are) {
         ap.R.a((are)$$1, $$0.f(), this);
      }
   }

   public void a(bva $$0, int $$1) {
      if (!$$0.dP() && !this.dU().C && ($$0 instanceof clw || $$0 instanceof cpy || $$0 instanceof bvn)) {
         ((ard)this.dU()).m().b($$0, new afs($$0.ar(), this.ar(), $$1));
      }
   }

   public boolean E(bva $$0) {
      return this.a($$0, dgi.a.a, dgi.b.a, $$0.dD());
   }

   public boolean a(bva $$0, dgi.a $$1, dgi.b $$2, double $$3) {
      if ($$0.dU() != this.dU()) {
         return false;
      } else {
         fbx $$4 = new fbx(this.dz(), this.dD(), this.dF());
         fbx $$5 = new fbx($$0.dz(), $$3, $$0.dF());
         return $$5.f($$4) > 128.0 ? false : this.dU().a(new dgi($$4, $$5, $$1, $$2, this)).d() == fbv.a.a;
      }
   }

   @Override
   public float j(float $$0) {
      return $$0 == 1.0F ? this.aX : ayz.i($$0, this.aY, this.aX);
   }

   public float E(float $$0) {
      float $$1 = this.aR - this.aQ;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aQ + $$1 * $$0;
   }

   @Override
   public boolean bF() {
      return !this.dP();
   }

   @Override
   public boolean bG() {
      return this.bJ() && !this.U_() && !this.d_();
   }

   @Override
   public float cz() {
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
   public fbx a(jn.a $$0, l.a $$1) {
      return k(super.a($$0, $$1));
   }

   public static fbx k(fbx $$0) {
      return new fbx($$0.d, $$0.e, 0.0);
   }

   public float fy() {
      return this.bS;
   }

   public final void F(float $$0) {
      this.G(ayz.a($$0, 0.0F, this.eT()));
   }

   protected void G(float $$0) {
      this.bS = $$0;
   }

   public void e_() {
   }

   public void J_() {
   }

   protected void fz() {
      this.bL = true;
   }

   public abstract bvr fA();

   public boolean fB() {
      return (this.al.a(aC) & 1) > 0;
   }

   public bsx fC() {
      return (this.al.a(aC) & 2) > 0 ? bsx.b : bsx.a;
   }

   private void J() {
      if (this.fB()) {
         if (cxh.b(this.b(this.fC()), this.bm)) {
            this.bm = this.b(this.fC());
            this.a(this.bm);
         } else {
            this.fH();
         }
      }
   }

   protected void a(cxh $$0) {
      $$0.b(this.dU(), this, this.fE());
      if (--this.bn == 0 && !this.dU().C && !$$0.x()) {
         this.K_();
      }
   }

   private void L() {
      this.bY = this.bX;
      if (this.ck()) {
         this.bX = Math.min(1.0F, this.bX + 0.09F);
      } else {
         this.bX = Math.max(0.0F, this.bX - 0.09F);
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

   public void c(bsx $$0) {
      cxh $$1 = this.b($$0);
      if (!$$1.f() && !this.fB()) {
         this.bm = $$1;
         this.bn = $$1.a(this);
         if (!this.dU().C) {
            this.c(1, true);
            this.c(2, $$0 == bsx.b);
            this.a(ecp.D);
         }
      }
   }

   @Override
   public void a(ajx<?> $$0) {
      super.a($$0);
      if (bC.equals($$0)) {
         if (this.dU().C) {
            this.fR().ifPresent(this::a);
         }
      } else if (aC.equals($$0) && this.dU().C) {
         if (this.fB() && this.bm.f()) {
            this.bm = this.b(this.fC());
            if (!this.bm.f()) {
               this.bn = this.bm.a(this);
            }
         } else if (!this.fB() && !this.bm.f()) {
            this.bm = cxh.k;
            this.bn = 0;
         }
      }
   }

   @Override
   public void a(fj.a $$0, fbx $$1) {
      super.a($$0, $$1);
      this.aY = this.aX;
      this.aV = this.aX;
      this.aW = this.aV;
   }

   @Override
   public float u(float $$0) {
      return ayz.h($$0, this.aW, this.aV);
   }

   public void b(cxh $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         fbx $$3 = new fbx(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dM() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dK() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ae.i()) * 0.6 - 0.3;
         fbx $$5 = new fbx(((double)this.ae.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dM() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dK() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dz(), this.dD(), this.dF());
         this.dU().a(new lp(lt.U, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void K_() {
      if (!this.dU().C || this.fB()) {
         bsx $$0 = this.fC();
         if (!this.bm.equals(this.b($$0))) {
            this.fG();
         } else {
            if (!this.bm.f() && this.fB()) {
               cxh $$1 = this.bm.a(this.dU(), this);
               if ($$1 != this.bm) {
                  this.a($$0, $$1);
               }

               this.fH();
            }
         }
      }
   }

   public void b(cxh $$0) {
   }

   public cxh fD() {
      return this.bm;
   }

   public int fE() {
      return this.bn;
   }

   public int fF() {
      return this.fB() ? this.bm.a(this) - this.fE() : 0;
   }

   public void fG() {
      if (!this.bm.f()) {
         this.bm.a(this.dU(), this, this.fE());
         if (this.bm.x()) {
            this.J();
         }
      }

      this.fH();
   }

   public void fH() {
      if (!this.dU().C) {
         boolean $$0 = this.fB();
         this.c(1, false);
         if ($$0) {
            this.a(ecp.C);
         }
      }

      this.bm = cxh.k;
      this.bn = 0;
   }

   public boolean fI() {
      return this.fJ() != null;
   }

   @Nullable
   public cxh fJ() {
      if (this.fB() && !this.bm.f()) {
         cxd $$0 = this.bm.h();
         if ($$0.b(this.bm) != cxj.d) {
            return null;
         } else {
            return $$0.a(this.bm, this) - this.bn < 5 ? null : this.bm;
         }
      } else {
         return null;
      }
   }

   public boolean fK() {
      return this.cc();
   }

   public boolean fL() {
      return this.i(7);
   }

   @Override
   public boolean ck() {
      return super.ck() || !this.fL() && this.c(bwk.b);
   }

   public int fM() {
      return this.bo;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dz();
      double $$5 = this.dB();
      double $$6 = this.dF();
      double $$7 = $$1;
      boolean $$8 = false;
      ji $$9 = ji.a($$0, $$1, $$2);
      dgz $$10 = this.dU();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.G_()) {
            ji $$12 = $$9.e();
            dxq $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.c($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cQ())) {
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

         if (this instanceof bwg $$14) {
            $$14.O().m();
         }

         return true;
      }
   }

   public boolean fN() {
      return !this.eF();
   }

   public boolean fO() {
      return true;
   }

   public void a(ji $$0, boolean $$1) {
   }

   public boolean fP() {
      return false;
   }

   @Override
   public final bvd a(bwk $$0) {
      return $$0 == bwk.c ? aD : this.e($$0).a(this.ej());
   }

   protected bvd e(bwk $$0) {
      return this.aq().n().a(this.ei());
   }

   public ImmutableList<bwk> fQ() {
      return ImmutableList.of(bwk.a);
   }

   public fbs f(bwk $$0) {
      bvd $$1 = this.a($$0);
      return new fbs((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bwk $$0) {
      fbs $$1 = this.a($$0).a(this.ds());
      return this.dU().b(this, $$1);
   }

   @Override
   public boolean n(boolean $$0) {
      return super.n($$0) && !this.fT();
   }

   public Optional<ji> fR() {
      return this.al.a(bC);
   }

   public void h(ji $$0) {
      this.al.a(bC, Optional.of($$0));
   }

   public void fS() {
      this.al.a(bC, Optional.empty());
   }

   public boolean fT() {
      return this.fR().isPresent();
   }

   public void b(ji $$0) {
      if (this.bY()) {
         this.bO();
      }

      dxq $$1 = this.dU().a_($$0);
      if ($$1.b() instanceof djx) {
         this.dU().a($$0, $$1.b(djx.c, Boolean.valueOf(true)), 3);
      }

      this.b(bwk.c);
      this.a($$0);
      this.h($$0);
      this.i(fbx.c);
      this.ar = true;
   }

   private void a(ji $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean N() {
      return this.fR().map($$0 -> this.dU().a_($$0).b() instanceof djx).orElse(false);
   }

   public void fU() {
      this.fR().filter(this.dU()::B).ifPresent($$0x -> {
         dxq $$1 = this.dU().a_($$0x);
         if ($$1.b() instanceof djx) {
            jn $$2 = $$1.c(djx.e);
            this.dU().a($$0x, $$1.b(djx.c, Boolean.valueOf(false)), 3);
            fbx $$3 = djx.a(this.aq(), this.dU(), $$0x, $$2, this.dK()).orElseGet(() -> {
               ji $$1x = $$0x.d();
               return new fbx((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            fbx $$4 = fbx.c($$0x).d($$3).d();
            float $$5 = (float)ayz.d(ayz.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.w($$5);
            this.x(0.0F);
         }
      });
      fbx $$0 = this.ds();
      this.b(bwk.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fS();
   }

   @Nullable
   public jn fV() {
      ji $$0 = this.fR().orElse(null);
      return $$0 != null ? djx.a(this.dU(), $$0) : null;
   }

   @Override
   public boolean bK() {
      return !this.fT() && super.bK();
   }

   public cxh d(cxh $$0) {
      return cxh.k;
   }

   private static byte i(bvj $$0) {
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

   public void a(cxd $$0, bvj $$1) {
      this.dU().a(this, i($$1));
      this.a(this.a($$1), $$1, this.bE);
   }

   private void a(cxh $$0, bvj $$1, bxd $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         bxc $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      ddt.a($$0, this, $$1);
   }

   public static bvj d(bsx $$0) {
      return $$0 == bsx.a ? bvj.a : bvj.b;
   }

   public final boolean e(cxh $$0) {
      if (this.bJ() && !this.U_()) {
         dfm $$1 = $$0.a(kv.E);
         if ($$1 != null && $$1.f()) {
            bvj $$2 = $$1.a();
            return this.e($$2) && $$1.a(this.aq()) ? this.a($$2).f() && this.f($$2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected boolean f(bvj $$0) {
      return true;
   }

   public final bvj f(cxh $$0) {
      dfm $$1 = $$0.a(kv.E);
      return $$1 != null && this.e($$1.a()) ? $$1.a() : bvj.a;
   }

   public final boolean a(cxh $$0, bvj $$1) {
      dfm $$2 = $$0.a(kv.E);
      return $$2 == null ? $$1 == bvj.a && this.e(bvj.a) : $$1 == $$2.a() && this.e($$2.a()) && $$2.a(this.aq());
   }

   private static bwq a(bvy $$0, bvj $$1) {
      return $$1 != bvj.f && $$1 != bvj.a && $$1 != bvj.b ? bwq.a($$0, $$1, $$2 -> $$2.f() || $$0.f($$2) == $$1) : bwq.a($$0, $$1);
   }

   @Nullable
   private static bvj r(int $$0) {
      if ($$0 == 100 + bvj.f.b()) {
         return bvj.f;
      } else if ($$0 == 100 + bvj.e.b()) {
         return bvj.e;
      } else if ($$0 == 100 + bvj.d.b()) {
         return bvj.d;
      } else if ($$0 == 100 + bvj.c.b()) {
         return bvj.c;
      } else if ($$0 == 98) {
         return bvj.a;
      } else if ($$0 == 99) {
         return bvj.b;
      } else {
         return $$0 == 105 ? bvj.g : null;
      }
   }

   @Override
   public bwq a_(int $$0) {
      bvj $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dI() {
      if (this.U_()) {
         return false;
      } else {
         boolean $$0 = !this.a(bvj.f).a(awy.bq) && !this.a(bvj.e).a(awy.bq) && !this.a(bvj.d).a(awy.bq) && !this.a(bvj.c).a(awy.bq) && !this.a(bvj.g).a(awy.bq);
         return $$0 && super.dI();
      }
   }

   @Override
   public boolean cn() {
      return !this.dU().w_() && this.b(bug.x) || super.cn();
   }

   @Override
   public float dL() {
      return this.aV;
   }

   @Override
   public void a(abm $$0) {
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      float $$4 = $$0.n();
      float $$5 = $$0.m();
      this.f($$1, $$2, $$3);
      this.aV = $$0.o();
      this.aX = $$0.o();
      this.aW = this.aV;
      this.aY = this.aX;
      this.e($$0.b());
      this.a_($$0.e());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.n($$0.j(), $$0.k(), $$0.l());
   }

   public boolean fW() {
      dam $$0 = this.dY().a(kv.C);
      return $$0 != null && $$0.b();
   }

   @Override
   public float dO() {
      float $$0 = (float)this.h(bxg.B);
      return this.cV() instanceof cpr ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public fbx m(bva $$0) {
      return this.ds().e(this.a($$0, this.a(this.aw()), this.ej() * this.ei()));
   }

   protected void a(int $$0, double $$1) {
      this.aX = (float)ayz.e(1.0 / (double)$$0, (double)this.aX, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(ayz.c((double)$$0 * this.h(bxg.h)));
   }

   public boolean fX() {
      return false;
   }

   public boolean a(ard $$0, btp $$1) {
      return this.d($$1) || ddt.a($$0, this, $$1);
   }

   public static boolean b(cxh $$0, bvj $$1) {
      if (!$$0.b(kv.G)) {
         return false;
      } else {
         dfm $$2 = $$0.a(kv.E);
         return $$2 != null && $$1 == $$2.a() && !$$0.r();
      }
   }

   @VisibleForTesting
   public int fY() {
      return this.bb;
   }

   public static record a(avz a, avz b) {
   }
}
