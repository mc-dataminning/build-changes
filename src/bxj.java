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

public abstract class bxj extends bwi implements bwb {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "active_effects";
   private static final alg c = alg.b("powder_snow");
   private static final alg d = alg.b("sprinting");
   private static final byn k = new byn(d, 0.3F, byn.a.c);
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
   protected static final akj<Byte> aC = akn.a(bxj.class, akl.a);
   private static final akj<Float> by = akn.a(bxj.class, akl.d);
   private static final akj<List<lw>> bz = akn.a(bxj.class, akl.m);
   private static final akj<Boolean> bA = akn.a(bxj.class, akl.k);
   private static final akj<Integer> bB = akn.a(bxj.class, akl.b);
   private static final akj<Integer> bC = akn.a(bxj.class, akl.b);
   private static final akj<Optional<iv>> bD = akn.a(bxj.class, akl.p);
   private static final int bE = 15;
   protected static final bwl aD = bwl.c(0.2F, 0.2F).b(0.2F);
   public static final float aE = 0.5F;
   public static final float aF = 0.5F;
   public static final String aG = "attributes";
   public static final Predicate<bxj> aH = $$0 -> {
      if ($$0 instanceof crm $$1) {
         czn $$3 = $$1.a(bws.f);
         return !$$3.a(axk.cs);
      } else {
         return true;
      }
   };
   private final bym bF;
   private final buu bG = new buu(this);
   private final Map<jf<bvk>, bvm> bH = Maps.newHashMap();
   private final Map<bws, czn> bI = ag.a(bws.class, $$0x -> czn.k);
   public boolean aI;
   private boolean bJ = false;
   public buf aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public float aQ;
   public float aR;
   protected int aS;
   public final byi aT = new byi();
   public final int aU = 20;
   public float aV;
   public float aW;
   public float aX;
   public float aY;
   public final bwh aZ = new bwh(this);
   @Nullable
   protected bwo<crm> ba;
   protected int bb;
   protected boolean bc;
   protected int bd;
   protected float be;
   protected boolean bf;
   public float bg;
   public float bh;
   public float bi;
   protected bxe bj = new bxe(this);
   protected double bk;
   protected int bl;
   private boolean bK = true;
   @Nullable
   private bwo<bxj> bL;
   private int bM;
   @Nullable
   private bxj bN;
   private int bO;
   private float bP;
   private int bQ;
   private float bR;
   protected czn bm = czn.k;
   protected int bn;
   protected int bo;
   private iv bS;
   private Optional<iv> bT = Optional.empty();
   @Nullable
   private bux bU;
   private long bV;
   protected int bp;
   protected float bq;
   @Nullable
   protected czn br;
   private float bW;
   private float bX;
   protected byj<?> bs;
   private boolean bY;
   private final EnumMap<bws, Reference2ObjectMap<dga, Set<dgs>>> bZ = new EnumMap<>(bws.class);
   protected final bwm bt;

   protected bxj(bwr<? extends bxj> $$0, djm $$1) {
      super($$0, $$1);
      this.bF = new bym(byq.a($$0));
      this.d(this.eT());
      this.bt = this.ea();
      this.I = true;
      this.av();
      this.w((float)(Math.random() * (float) (Math.PI * 2)));
      this.aX = this.dK();
      un $$2 = un.a;
      this.bs = this.a(new Dynamic($$2, (uw)$$2.createMap(ImmutableMap.of($$2.a("memories"), (uw)$$2.emptyMap()))));
   }

   @Contract(
      pure = true
   )
   protected bwm ea() {
      return new bwm();
   }

   public byj<?> eb() {
      return this.bs;
   }

   protected byj.b<?> ec() {
      return byj.a(ImmutableList.of(), ImmutableList.of());
   }

   protected byj<?> a(Dynamic<?> $$0) {
      return this.ec().a($$0);
   }

   @Override
   public void c(arq $$0) {
      this.a($$0, this.dV().y(), Float.MAX_VALUE);
   }

   public boolean a(bwr<?> $$0) {
      return true;
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(aC, (byte)0);
      $$0.a(bz, List.of());
      $$0.a(bA, false);
      $$0.a(bB, 0);
      $$0.a(bC, 0);
      $$0.a(by, 1.0F);
      $$0.a(bD, Optional.empty());
   }

   public static byo.a ed() {
      return byo.a()
         .a(byp.s)
         .a(byp.p)
         .a(byp.v)
         .a(byp.a)
         .a(byp.b)
         .a(byp.r)
         .a(byp.B)
         .a(byp.y)
         .a(byp.n)
         .a(byp.x)
         .a(byp.k)
         .a(byp.o)
         .a(byp.w)
         .a(byp.h)
         .a(byp.i)
         .a(byp.F)
         .a(byp.u)
         .a(byp.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, eat $$2, iv $$3) {
      if (!this.bh()) {
         this.bo();
      }

      if (this.dU() instanceof arq $$4 && $$1 && this.Z > 0.0) {
         this.b($$4, $$3);
         double $$5 = (double)Math.max(0, azm.a(this.h(this.Z)));
         if ($$5 > 0.0 && !$$2.l()) {
            double $$6 = this.dz();
            double $$7 = this.dB();
            double $$8 = this.dF();
            iv $$9 = this.du();
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

   public final boolean ee() {
      return this.an().a(axf.m);
   }

   public float a(float $$0) {
      return azm.h($$0, this.bX, this.bW);
   }

   public boolean ef() {
      return this.dx().b() < 1.0E-5F && this.bk();
   }

   @Override
   public void aw() {
      this.aQ = this.aR;
      if (this.ak) {
         this.fO().ifPresent(this::a);
      }

      if (this.dU() instanceof arq $$0) {
         dgc.b($$0, this);
      }

      super.aw();
      bqq $$1 = bqp.a();
      $$1.a("livingEntityBaseTick");
      if (this.bg() || this.dU().C) {
         this.aF();
      }

      if (this.bI() && this.dU() instanceof arq $$2) {
         boolean $$3 = this instanceof crm;
         if (this.bJ()) {
            this.a($$2, this.dV().g(), 1.0F);
         } else if ($$3 && !$$2.A_().a(this.cQ())) {
            double $$4 = $$2.A_().a(this) + $$2.A_().n();
            if ($$4 < 0.0) {
               double $$5 = $$2.A_().o();
               if ($$5 > 0.0) {
                  this.a($$2, this.dV().x(), (float)Math.max(1, azm.a(-$$4 * $$5)));
               }
            }
         }

         if (this.a(axh.a) && !$$2.a_(iv.a(this.dz(), this.dD(), this.dF())).a(dmt.nJ)) {
            boolean $$6 = !this.ee() && !bvn.c(this) && (!$$3 || !((crm)this).gj().a);
            if ($$6) {
               this.j(this.l(this.cr()));
               if (this.cr() == -20) {
                  this.j(0);
                  $$2.a(this, (byte)67);
                  this.a($$2, this.dV().i(), 2.0F);
               }
            } else if (this.cr() < this.cq()) {
               this.j(this.m(this.cr()));
            }

            if (this.bX() && this.dj() != null && this.dj().bZ()) {
               this.bN();
            }
         } else if (this.cr() < this.cq()) {
            this.j(this.m(this.cr()));
         }

         iv $$7 = this.du();
         if (!Objects.equal(this.bS, $$7)) {
            this.bS = $$7;
            this.b($$2, $$7);
         }
      }

      if (this.bI() && this.bi()) {
         this.aL();
      }

      if (this.aN > 0) {
         this.aN--;
      }

      if (this.aj > 0 && !(this instanceof arr)) {
         this.aj--;
      }

      if (this.eG() && this.dU().h(this)) {
         this.em();
      }

      if (this.bb > 0) {
         this.bb--;
      } else {
         this.ba = null;
      }

      if (this.bN != null && !this.bN.bI()) {
         this.bN = null;
      }

      bxj $$8 = this.eq();
      if ($$8 != null) {
         if (!$$8.bI()) {
            this.a(null);
         } else if (this.af - this.bM > 100) {
            this.a(null);
         }
      }

      this.ex();
      this.aY = this.aX;
      this.aW = this.aV;
      this.N = this.dK();
      this.O = this.dM();
      $$1.c();
   }

   @Override
   protected float aR() {
      return azm.h((float)this.h(byp.u), super.aR(), 1.0F);
   }

   public float eg() {
      return 0.0F;
   }

   protected void eh() {
      byl $$0 = this.g(byp.v);
      if ($$0 != null) {
         if ($$0.a(c) != null) {
            $$0.c(c);
         }
      }
   }

   protected void ei() {
      if (!this.bq().l()) {
         int $$0 = this.ct();
         if ($$0 > 0) {
            byl $$1 = this.g(byp.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cu();
            $$1.b(new byn(c, (double)$$2, byn.a.a));
         }
      }
   }

   protected void b(arq $$0, iv $$1) {
      dgc.a($$0, this);
   }

   public boolean n_() {
      return false;
   }

   public float ej() {
      return this.n_() ? 0.5F : 1.0F;
   }

   public final float ek() {
      bym $$0 = this.eZ();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(byp.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   public boolean el() {
      return true;
   }

   protected void em() {
      this.aP++;
      if (this.aP >= 20 && !this.dU().w_() && !this.dP()) {
         this.dU().a(this, (byte)60);
         this.a(bwi.d.a);
      }
   }

   public boolean en() {
      return !this.n_();
   }

   protected boolean eo() {
      return !this.n_();
   }

   protected int l(int $$0) {
      byl $$1 = this.g(byp.w);
      double $$2;
      if ($$1 != null) {
         $$2 = $$1.g();
      } else {
         $$2 = 0.0;
      }

      return $$2 > 0.0 && this.ae.j() >= 1.0 / ($$2 + 1.0) ? $$0 : $$0 - 1;
   }

   protected int m(int $$0) {
      return Math.min($$0 + 4, this.cq());
   }

   public final int a(arq $$0, @Nullable bwi $$1) {
      return dgc.a($$0, $$1, this, this.e($$0));
   }

   protected int e(arq $$0) {
      return 0;
   }

   protected boolean ep() {
      return false;
   }

   @Nullable
   public bxj eq() {
      return bwo.a(this.bL, this.dU(), bxj.class);
   }

   @Nullable
   public crm er() {
      return bwo.a(this.ba, this.dU(), crm.class);
   }

   @Override
   public bxj aj() {
      return this.eq();
   }

   public int es() {
      return this.bM;
   }

   public void a(crm $$0, int $$1) {
      this.a(new bwo<>($$0), $$1);
   }

   public void a(UUID $$0, int $$1) {
      this.a(new bwo<>($$0), $$1);
   }

   private void a(bwo<crm> $$0, int $$1) {
      this.ba = $$0;
      this.bb = $$1;
   }

   public void a(@Nullable bxj $$0) {
      this.bL = $$0 != null ? new bwo<>($$0) : null;
      this.bM = this.af;
   }

   @Nullable
   public bxj et() {
      return this.bN;
   }

   public int eu() {
      return this.bO;
   }

   public void B(bwi $$0) {
      if ($$0 instanceof bxj) {
         this.bN = (bxj)$$0;
      } else {
         this.bN = null;
      }

      this.bO = this.af;
   }

   public int ev() {
      return this.bd;
   }

   public void n(int $$0) {
      this.bd = $$0;
   }

   public boolean ew() {
      return this.bJ;
   }

   public void q(boolean $$0) {
      this.bJ = $$0;
   }

   protected boolean b(bws $$0) {
      return true;
   }

   public void a(bws $$0, czn $$1, czn $$2) {
      if (!this.dU().w_() && !this.V_()) {
         if (!czn.c($$1, $$2) && !this.ak) {
            dhw $$3 = $$2.a(kk.D);
            if (!this.aZ() && $$3 != null && $$0 == $$3.b()) {
               this.dU().a(null, this.dz(), this.dB(), this.dF(), this.a($$0, $$2, $$3), this.dl(), 1.0F, 1.0F, this.ae.g());
            }

            if (this.b($$0)) {
               this.a($$3 != null ? eft.v : eft.S);
            }
         }
      }
   }

   protected jf<awm> a(bws $$0, czn $$1, dhw $$2) {
      return $$2.c();
   }

   @Override
   public void a(bwi.d $$0) {
      if (($$0 == bwi.d.a || $$0 == bwi.d.b) && this.dU() instanceof arq $$1) {
         this.a($$1, $$0);
      }

      super.a($$0);
      this.bs.a();
   }

   protected void a(arq $$0, bwi.d $$1) {
      for (bvm $$2 : this.eC()) {
         $$2.a($$0, this, $$1);
      }

      this.bH.clear();
   }

   @Override
   public void b(tz $$0) {
      $$0.a("Health", this.eF());
      $$0.a("HurtTime", (short)this.aN);
      $$0.a("HurtByTimestamp", this.bM);
      $$0.a("DeathTime", (short)this.aP);
      $$0.a("AbsorptionAmount", this.fv());
      $$0.a("attributes", this.eZ().d());
      ale<uw> $$1 = this.dW().a(un.a);
      if (!this.bH.isEmpty()) {
         $$0.a("active_effects", bvm.d.listOf(), $$1, List.copyOf(this.bH.values()));
      }

      $$0.a("FallFlying", this.fI());
      this.fO().ifPresent($$1x -> $$0.a("sleeping_pos", iv.a, $$1x));
      DataResult<uw> $$2 = this.bs.a(un.a);
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
         $$0.a("equipment", bwm.a, $$1, this.bt);
      }
   }

   @Nullable
   public cnr a(czn $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else if (this.dU().C) {
         this.a(buf.a);
         return null;
      } else {
         cnr $$3 = this.b($$0, $$1, $$2);
         if ($$3 != null) {
            this.dU().b($$3);
         }

         return $$3;
      }
   }

   @Override
   public void a(tz $$0) {
      this.F($$0.h("AbsorptionAmount"));
      if ($$0.b("attributes", 9) && this.dU() != null && !this.dU().C) {
         this.eZ().a($$0.d("attributes", 10));
      }

      ale<uw> $$1 = this.dW().a(un.a);
      List<bvm> $$2 = $$0.<List<bvm>>a("active_effects", bvm.d.listOf(), $$1).orElse(List.of());
      this.bH.clear();

      for (bvm $$3 : $$2) {
         this.bH.put($$3.c(), $$3);
      }

      if ($$0.b("Health", 99)) {
         this.d($$0.h("Health"));
      }

      this.aN = $$0.e("HurtTime");
      this.aP = $$0.e("DeathTime");
      this.bM = $$0.f("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$4 = $$0.j("Team");
         fgh $$5 = this.dU().R();
         fgc $$6 = $$5.b($$4);
         boolean $$7 = $$6 != null && $$5.a(this.cG(), $$6);
         if (!$$7) {
            a.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$4);
         }
      }

      if ($$0.o("FallFlying")) {
         this.b(7, true);
      }

      $$0.<iv>a("sleeping_pos", iv.a).ifPresentOrElse($$0x -> {
         this.g($$0x);
         this.al.a(aq, bxv.c);
         if (!this.ak) {
            this.a($$0x);
         }
      }, this::fP);
      if ($$0.b("Brain", 10)) {
         this.bs = this.a(new Dynamic(un.a, $$0.a("Brain")));
      }

      this.ba = bwo.b($$0, "last_hurt_by_player");
      this.bb = $$0.f("last_hurt_by_player_memory_time");
      this.bL = bwo.b($$0, "last_hurt_by_mob");
      this.bM = $$0.f("ticks_since_last_hurt_by_mob") + this.af;
      this.bt.a($$0.<bwm>a("equipment", bwm.a, $$1).orElseGet(bwm::new));
   }

   protected void ex() {
      if (this.dU() instanceof arq $$0) {
         Iterator<jf<bvk>> $$1 = this.bH.keySet().iterator();

         try {
            while ($$1.hasNext()) {
               jf<bvk> $$2 = $$1.next();
               bvm $$3 = this.bH.get($$2);
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
         for (bvm $$4 : this.bH.values()) {
            $$4.i();
         }

         List<lw> $$5 = this.al.a(bz);
         if (!$$5.isEmpty()) {
            boolean $$6 = this.al.a(bA);
            int $$7 = this.cn() ? 15 : 4;
            int $$8 = $$6 ? 5 : 1;
            if (this.ae.a($$7 * $$8) == 0) {
               this.dU().a(ag.a($$5, this.ae), this.d(0.5), this.dC(), this.g(0.5), 1.0, 1.0, 1.0);
            }
         }
      }
   }

   protected void K() {
      if (this.bH.isEmpty()) {
         this.eA();
         this.k(false);
      } else {
         this.k(this.b(bvo.n));
         this.j();
      }
   }

   private void j() {
      List<lw> $$0 = this.bH.values().stream().filter(bvm::g).map(bvm::a).toList();
      this.al.a(bz, $$0);
      this.al.a(bA, d(this.bH.values()));
   }

   private void q() {
      boolean $$0 = this.cm();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable bwi $$0) {
      double $$1 = 1.0;
      if (this.ce()) {
         $$1 *= 0.8;
      }

      if (this.cn()) {
         float $$2 = this.fc();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         czn $$3 = this.a(bws.f);
         bwr<?> $$4 = $$0.an();
         if ($$4 == bwr.bf && $$3.a(czr.vv)
            || $$4 == bwr.bO && $$3.a(czr.vy)
            || $$4 == bwr.aR && $$3.a(czr.vB)
            || $$4 == bwr.aS && $$3.a(czr.vB)
            || $$4 == bwr.E && $$3.a(czr.vz)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bxj $$0) {
      return $$0 instanceof crm && this.dU().an() == bud.a ? false : $$0.ey();
   }

   public boolean ey() {
      return !this.cB() && this.ez();
   }

   public boolean ez() {
      return !this.V_() && this.bI();
   }

   public static boolean d(Collection<bvm> $$0) {
      for (bvm $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void eA() {
      this.al.a(bz, List.of());
   }

   public boolean eB() {
      if (this.dU().C) {
         return false;
      } else if (this.bH.isEmpty()) {
         return false;
      } else {
         Map<jf<bvk>, bvm> $$0 = Maps.newHashMap(this.bH);
         this.bH.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<bvm> eC() {
      return this.bH.values();
   }

   public Map<jf<bvk>, bvm> eD() {
      return this.bH;
   }

   public boolean b(jf<bvk> $$0) {
      return this.bH.containsKey($$0);
   }

   @Nullable
   public bvm c(jf<bvk> $$0) {
      return this.bH.get($$0);
   }

   public float a(jf<bvk> $$0, float $$1) {
      bvm $$2 = this.c($$0);
      return $$2 != null ? $$2.a(this, $$1) : 0.0F;
   }

   public final boolean a(bvm $$0) {
      return this.b($$0, null);
   }

   public boolean b(bvm $$0, @Nullable bwi $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         bvm $$2 = this.bH.get($$0.c());
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

   public boolean b(bvm $$0) {
      if (this.an().a(axf.G)) {
         return !$$0.a(bvo.M);
      } else if (this.an().a(axf.F)) {
         return !$$0.a(bvo.L);
      } else {
         return !this.an().a(axf.w) ? true : !$$0.a(bvo.j) && !$$0.a(bvo.s);
      }
   }

   public void c(bvm $$0, @Nullable bwi $$1) {
      if (this.b($$0)) {
         bvm $$2 = this.bH.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eE() {
      return this.an().a(axf.x);
   }

   @Nullable
   public final bvm d(jf<bvk> $$0) {
      return this.bH.remove($$0);
   }

   public boolean e(jf<bvk> $$0) {
      bvm $$1 = this.d($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(bvm $$0, @Nullable bwi $$1) {
      if (!this.dU().C) {
         this.bK = true;
         $$0.c().a().a(this.eZ(), $$0.e());
         this.c($$0);
      }
   }

   public void c(bvm $$0) {
      for (bwi $$1 : this.cX()) {
         if ($$1 instanceof arr $$2) {
            $$2.f.b(new agi(this.ao(), $$0, false));
         }
      }
   }

   protected void a(bvm $$0, boolean $$1, @Nullable bwi $$2) {
      if (!this.dU().C) {
         this.bK = true;
         if ($$1) {
            bvk $$3 = $$0.c().a();
            $$3.a(this.eZ());
            $$3.a(this.eZ(), $$0.e());
            this.u();
         }

         this.c($$0);
      }
   }

   protected void c(Collection<bvm> $$0) {
      if (!this.dU().C) {
         this.bK = true;

         for (bvm $$1 : $$0) {
            $$1.c().a().a(this.eZ());

            for (bwi $$2 : this.cX()) {
               if ($$2 instanceof arr $$3) {
                  $$3.f.b(new aek(this.ao(), $$1.c()));
               }
            }
         }

         this.u();
      }
   }

   private void u() {
      Set<byl> $$0 = this.eZ().b();

      for (byl $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(jf<byk> $$0) {
      if ($$0.a(byp.s)) {
         float $$1 = this.eT();
         if (this.eF() > $$1) {
            this.d($$1);
         }
      } else if ($$0.a(byp.r)) {
         float $$2 = this.eU();
         if (this.fv() > $$2) {
            this.E($$2);
         }
      } else if ($$0.a(byp.y)) {
         this.i_();
      }
   }

   public void c(float $$0) {
      float $$1 = this.eF();
      if ($$1 > 0.0F) {
         this.d($$1 + $$0);
      }
   }

   public float eF() {
      return this.al.a(by);
   }

   public void d(float $$0) {
      this.al.a(by, azm.a($$0, 0.0F, this.eT()));
   }

   public boolean eG() {
      return this.eF() <= 0.0F;
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.eG()) {
         return false;
      } else if ($$1.a(axd.i) && this.b(bvo.l)) {
         return false;
      } else {
         if (this.fQ()) {
            this.fR();
         }

         this.bd = 0;
         if ($$2 < 0.0F) {
            $$2 = 0.0F;
         }

         float $$4 = this.b($$0, $$1, $$2);
         $$2 -= $$4;
         boolean $$5 = $$4 > 0.0F;
         if ($$1.a(axd.o) && this.an().a(axf.l)) {
            $$2 *= 5.0F;
         }

         if ($$1.a(axd.a) && !this.a(bws.f).f()) {
            this.d($$1, $$2);
            $$2 *= 0.75F;
         }

         if (Float.isNaN($$2) || Float.isInfinite($$2)) {
            $$2 = Float.MAX_VALUE;
         }

         boolean $$6 = true;
         if ((float)this.aj > 10.0F && !$$1.a(axd.e)) {
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
            dbo $$7 = this.fA().a(kk.I);
            if ($$5 && $$7 != null) {
               $$7.a($$0, this);
            } else {
               $$0.a(this, $$1);
            }

            if (!$$1.a(axd.r) && (!$$5 || $$2 > 0.0F)) {
               this.bA();
            }

            if (!$$1.a(axd.z)) {
               double $$8 = 0.0;
               double $$9 = 0.0;
               if ($$1.c() instanceof csh $$10) {
                  DoubleDoubleImmutablePair $$11 = $$10.a_(this, $$1);
                  $$8 = -$$11.leftDouble();
                  $$9 = -$$11.rightDouble();
               } else if ($$1.i() != null) {
                  $$8 = $$1.i().a() - this.dz();
                  $$9 = $$1.i().c() - this.dF();
               }

               this.p(0.4F, $$8, $$9);
               if (!$$5) {
                  this.a($$8, $$9);
               }
            }
         }

         if (this.eG()) {
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
            this.bV = this.dU().ae();

            for (bvm $$13 : this.eC()) {
               $$13.a($$0, this, $$1, $$2);
            }
         }

         if (this instanceof arr $$14) {
            aq.i.a($$14, $$1, $$2, $$2, $$5);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               $$14.a(awx.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$1.d() instanceof arr $$15) {
            aq.h.a($$15, this, $$1, $$2, $$2, $$5);
         }

         return $$12;
      }
   }

   public float b(arq $$0, bux $$1, float $$2) {
      if ($$2 <= 0.0F) {
         return 0.0F;
      } else {
         czn $$3 = this.fG();
         if ($$3 == null) {
            return 0.0F;
         } else {
            dbo $$4 = $$3.a(kk.I);
            if ($$4 != null && !$$4.f().map($$1::a).orElse(false)) {
               if ($$1.c() instanceof cru $$5 && $$5.u() > 0) {
                  return 0.0F;
               }

               ffc $$6 = $$1.i();
               double $$9;
               if ($$6 != null) {
                  ffc $$7 = this.d(0.0F, this.cz());
                  ffc $$8 = $$6.d(this.ds());
                  $$8 = new ffc($$8.d, 0.0, $$8.f).d();
                  $$9 = Math.acos($$8.b($$7));
               } else {
                  $$9 = (float) Math.PI;
               }

               float $$11 = $$4.a($$1, $$2, $$9);
               $$4.a(this.dU(), $$3, this, this.fz(), $$11);
               if (!$$1.a(axd.j) && $$1.c() instanceof bxj $$13) {
                  this.b($$0, $$13);
               }

               return $$11;
            } else {
               return 0.0F;
            }
         }
      }
   }

   private void i(bux $$0) {
      if ($$0.a(bva.P)) {
         awo $$1 = this instanceof crm ? awo.h : awo.f;
         this.dU().a(null, this.ds().d, this.ds().e, this.ds().f, awn.AB, $$1);
      }
   }

   protected void f(bux $$0) {
      if ($$0.d() instanceof bxj $$1 && !$$0.a(axd.q) && (!$$0.a(bva.I) || !this.an().a(axf.E))) {
         this.a($$1);
      }
   }

   @Nullable
   protected crm g(bux $$0) {
      bwi $$1 = $$0.d();
      if ($$1 instanceof crm $$2) {
         this.a($$2, 100);
      } else if ($$1 instanceof cmb $$3 && $$3.q()) {
         if ($$3.d() != null) {
            this.a($$3.d().c(), 100);
         } else {
            this.ba = null;
            this.bb = 0;
         }
      }

      return bwo.a(this.ba, this.dU(), crm.class);
   }

   protected void b(arq $$0, bxj $$1) {
      $$1.d(this);
   }

   protected void d(bxj $$0) {
      $$0.p(0.5, $$0.dz() - this.dz(), $$0.dF() - this.dF());
   }

   private boolean j(bux $$0) {
      if ($$0.a(axd.d)) {
         return false;
      } else {
         czn $$1 = null;
         dby $$2 = null;

         for (buf $$3 : buf.values()) {
            czn $$4 = this.b($$3);
            $$2 = $$4.a(kk.H);
            if ($$2 != null) {
               $$1 = $$4.v();
               $$4.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof arr $$5) {
               $$5.b(awx.c.b($$1.h()));
               aq.C.a($$5, $$1);
               this.a(eft.C);
            }

            this.d(1.0F);
            $$2.a($$1, this);
            this.dU().a(this, (byte)35);
         }

         return $$2 != null;
      }
   }

   @Nullable
   public bux eH() {
      if (this.dU().ae() - this.bV > 40L) {
         this.bU = null;
      }

      return this.bU;
   }

   protected void h(bux $$0) {
      this.b(this.e($$0));
   }

   public void b(@Nullable awm $$0) {
      if ($$0 != null) {
         this.a($$0, this.fd(), this.fe());
      }
   }

   private void g(czn $$0) {
      if (!$$0.f()) {
         jf<awm> $$1 = $$0.a(kk.au);
         if ($$1 != null && !this.aZ()) {
            this.dU().a(this.dz(), this.dB(), this.dF(), $$1.a(), this.dl(), 0.8F, 0.8F + this.dU().A.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(bux $$0) {
      if (!this.dP() && !this.bc) {
         bwi $$1 = $$0.d();
         bxj $$2 = this.eS();
         if ($$2 != null) {
            $$2.a(this, $$0);
         }

         if (this.fQ()) {
            this.fR();
         }

         if (!this.dU().C && this.h_()) {
            a.info("Named entity {} died: {}", this, this.eR().a().getString());
         }

         this.bc = true;
         this.eR().c();
         if (this.dU() instanceof arq $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(eft.p);
               this.b($$3, $$0);
               this.e($$2);
            }

            this.dU().a(this, (byte)3);
         }

         this.b(bxv.h);
      }
   }

   protected void e(@Nullable bxj $$0) {
      if (this.dU() instanceof arq $$1) {
         boolean var6 = false;
         if ($$0 instanceof cne) {
            if ($$1.O().c(dji.d)) {
               iv $$4 = this.du();
               eat $$5 = dmt.cn.m();
               if (this.dU().a_($$4).l() && $$5.a((djp)this.dU(), $$4)) {
                  this.dU().a($$4, $$5, 3);
                  var6 = true;
               }
            }

            if (!var6) {
               cnr $$6 = new cnr(this.dU(), this.dz(), this.dB(), this.dF(), new czn(czr.dJ));
               this.dU().b($$6);
            }
         }
      }
   }

   protected void b(arq $$0, bux $$1) {
      boolean $$2 = this.bb > 0;
      if (this.eo() && $$0.O().c(dji.g)) {
         this.b($$0, $$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.f($$0);
      this.b($$0, $$1.d());
   }

   protected void f(arq $$0) {
   }

   protected void b(arq $$0, @Nullable bwi $$1) {
      if (!this.eK() && (this.ep() || this.bb > 0 && this.en() && $$0.O().c(dji.g))) {
         bww.a($$0, this.ds(), this.a($$0, $$1));
      }
   }

   protected void a(arq $$0, bux $$1, boolean $$2) {
   }

   public long eI() {
      return 0L;
   }

   protected float b(bwi $$0, bux $$1) {
      float $$2 = (float)this.h(byp.d);
      return this.dU() instanceof arq $$3 ? dgc.d($$3, this.dY(), $$0, $$1, $$2) : $$2;
   }

   protected void b(arq $$0, bux $$1, boolean $$2) {
      Optional<alf<ezy>> $$3 = this.dZ();
      if (!$$3.isEmpty()) {
         ezy $$4 = $$0.p().bc().b($$3.get());
         ezw.a $$5 = new ezw.a($$0).a(fcn.a, this).a(fcn.f, this.ds()).a(fcn.c, $$1).b(fcn.d, $$1.d()).b(fcn.e, $$1.c());
         crm $$6 = this.er();
         if ($$2 && $$6 != null) {
            $$5 = $$5.a(fcn.b, $$6).a($$6.eg());
         }

         ezw $$7 = $$5.a(fcm.g);
         $$4.a($$7, this.eI(), $$1x -> this.a($$0, $$1x));
      }
   }

   public boolean a(arq $$0, alf<ezy> $$1, BiConsumer<arq, czn> $$2) {
      return this.a($$0, $$1, $$0x -> $$0x.a(fcn.f, this.ds()).a(fcn.a, this).a(fcm.j), $$2);
   }

   protected void a(arq $$0, alf<ezy> $$1, czn $$2, BiConsumer<arq, czn> $$3) {
      this.a($$0, $$1, $$1x -> $$1x.a(fcn.f, this.ds()).a(fcn.a, this).a(fcn.i, $$2).a(fcm.s), $$3);
   }

   protected boolean a(arq $$0, alf<ezy> $$1, Function<ezw.a, ezw> $$2, BiConsumer<arq, czn> $$3) {
      ezy $$4 = $$0.p().bc().b($$1);
      ezw $$5 = $$2.apply(new ezw.a($$0));
      List<czn> $$6 = $$4.a($$5);
      if (!$$6.isEmpty()) {
         $$6.forEach($$2x -> $$3.accept($$0, $$2x));
         return true;
      } else {
         return false;
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(byp.p);
      if (!($$0 <= 0.0)) {
         this.ar = true;
         ffc $$3 = this.dx();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         ffc $$4 = new ffc($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aH() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected awm e(bux $$0) {
      return awn.kK;
   }

   @Nullable
   protected awm l_() {
      return awn.kF;
   }

   private awm q(int $$0) {
      return $$0 > 4 ? this.eN().b() : this.eN().a();
   }

   public void eJ() {
      this.bY = true;
   }

   public boolean eK() {
      return this.bY;
   }

   public float eL() {
      return 0.0F;
   }

   protected fex eM() {
      fex $$0 = this.cQ();
      bwi $$1 = this.dj();
      if ($$1 != null) {
         ffc $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<dga, Set<dgs>> c(bws $$0) {
      return (Map<dga, Set<dgs>>)this.bZ.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public bxj.a eN() {
      return new bxj.a(awn.kL, awn.kD);
   }

   public Optional<iv> eO() {
      return this.bT;
   }

   public boolean d_() {
      if (this.V_()) {
         return false;
      } else {
         iv $$0 = this.du();
         eat $$1 = this.dv();
         if ($$1.a(axc.aS)) {
            this.bT = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dvt && this.c($$0, $$1)) {
            this.bT = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(iv $$0, eat $$1) {
      if (!$$1.c(dvt.b)) {
         return false;
      } else {
         eat $$2 = this.dU().a_($$0.e());
         return $$2.a(dmt.da) && $$2.c(drc.b) == $$1.c(dvt.e);
      }
   }

   @Override
   public boolean bI() {
      return !this.dP() && this.eF() > 0.0F;
   }

   public boolean a(bxj $$0, double $$1, boolean $$2, boolean $$3, double... $$4) {
      ffc $$5 = $$0.h(1.0F).d();

      for (double $$6 : $$4) {
         ffc $$7 = new ffc(this.dz() - $$0.dz(), $$6 - $$0.dD(), this.dF() - $$0.dF());
         double $$8 = $$7.g();
         $$7 = $$7.d();
         double $$9 = $$5.b($$7);
         if ($$9 > 1.0 - $$1 / ($$2 ? $$8 : 1.0) && $$0.a(this, $$3 ? dit.a.c : dit.a.a, dit.b.a, $$6)) {
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
      return azm.d($$0 + 3.0F);
   }

   @Override
   public boolean a(double $$0, float $$1, bux $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.a($$0, $$1);
      if ($$4 > 0) {
         this.a(this.q($$4), 1.0F, 1.0F);
         this.eP();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int a(double $$0, float $$1) {
      if (this.an().a(axf.o)) {
         return 0;
      } else {
         double $$2 = this.h($$0);
         return azm.a($$2 * (double)$$1 * this.h(byp.k));
      }
   }

   private double h(double $$0) {
      return $$0 + 1.0E-6 - this.h(byp.x);
   }

   protected void eP() {
      if (!this.aZ()) {
         int $$0 = azm.a(this.dz());
         int $$1 = azm.a(this.dB() - 0.2F);
         int $$2 = azm.a(this.dF());
         eat $$3 = this.dU().a_(new iv($$0, $$1, $$2));
         if (!$$3.l()) {
            duo $$4 = $$3.A();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void q(float $$0) {
      this.aO = 10;
      this.aN = this.aO;
   }

   public int eQ() {
      return azm.a(this.h(byp.a));
   }

   protected void c(bux $$0, float $$1) {
   }

   protected void d(bux $$0, float $$1) {
   }

   protected void a(bux $$0, float $$1, bws... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bws $$4 : $$2) {
            czn $$5 = this.a($$4);
            dhw $$6 = $$5.a(kk.D);
            if ($$6 != null && $$6.i() && $$5.m() && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float e(bux $$0, float $$1) {
      if (!$$0.a(axd.b)) {
         this.c($$0, $$1);
         $$1 = but.a(this, $$1, $$0, (float)this.eQ(), (float)this.h(byp.b));
      }

      return $$1;
   }

   protected float f(bux $$0, float $$1) {
      if ($$0.a(axd.f)) {
         return $$1;
      } else {
         if (this.b(bvo.k) && !$$0.a(axd.g)) {
            int $$2 = (this.c(bvo.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof arr) {
                  ((arr)this).a(awx.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof arr) {
                  ((arr)$$0.d()).a(awx.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(axd.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dU() instanceof arq $$7) {
               $$8 = dgc.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = but.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void c(arq $$0, bux $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var10 = Math.max($$2 - this.fv(), 0.0F);
         this.E(this.fv() - ($$2 - var10));
         float $$4 = $$2 - var10;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F && $$1.d() instanceof arr $$5) {
            $$5.a(awx.H, Math.round($$4 * 10.0F));
         }

         if (var10 != 0.0F) {
            this.eR().a($$1, var10);
            this.d(this.eF() - var10);
            this.E(this.fv() - var10);
            this.a(eft.o);
         }
      }
   }

   public buu eR() {
      return this.bG;
   }

   @Nullable
   public bxj eS() {
      if (this.ba != null) {
         return this.ba.a(this.dU(), crm.class);
      } else {
         return this.bL != null ? this.bL.a(this.dU(), bxj.class) : null;
      }
   }

   public final float eT() {
      return (float)this.h(byp.s);
   }

   public final float eU() {
      return (float)this.h(byp.r);
   }

   public final int eV() {
      return this.al.a(bB);
   }

   public final void o(int $$0) {
      this.al.a(bB, $$0);
   }

   public final int eW() {
      return this.al.a(bC);
   }

   public final void p(int $$0) {
      this.al.a(bC, $$0);
   }

   private int D() {
      if (bvn.a(this)) {
         return 6 - (1 + bvn.b(this));
      } else {
         return this.b(bvo.d) ? 6 + (1 + this.c(bvo.d).e()) * 2 : 6;
      }
   }

   public void a(buf $$0) {
      this.a($$0, false);
   }

   public void a(buf $$0, boolean $$1) {
      if (!this.aI || this.aK >= this.D() / 2 || this.aK < 0) {
         this.aK = -1;
         this.aI = true;
         this.aJ = $$0;
         if (this.dU() instanceof arq) {
            abw $$2 = new abw(this, $$0 == buf.a ? 0 : 3);
            arn $$3 = ((arq)this.dU()).m();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bux $$0) {
      this.aT.a(1.5F);
      this.aj = 20;
      this.aO = 10;
      this.aN = this.aO;
      awm $$1 = this.e($$0);
      if ($$1 != null) {
         this.a($$1, this.fd(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }

      this.bU = $$0;
      this.bV = this.dU().ae();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            awm $$1 = this.l_();
            if ($$1 != null) {
               this.a($$1, this.fd(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof crm)) {
               this.d(0.0F);
               this.a(this.dV().p());
            }
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ae.i() - 0.5F) * 0.2F;
               float $$6 = (this.ae.i() - 0.5F) * 0.2F;
               float $$7 = (this.ae.i() - 0.5F) * 0.2F;
               double $$8 = azm.d($$4, this.K, this.dz()) + (this.ae.j() - 0.5) * (double)this.dp() * 2.0;
               double $$9 = azm.d($$4, this.L, this.dB()) + this.ae.j() * (double)this.dq();
               double $$10 = azm.d($$4, this.M, this.dF()) + (this.ae.j() - 0.5) * (double)this.dp() * 2.0;
               this.dU().a(ly.af, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.g(this.a(bws.a));
            break;
         case 48:
            this.g(this.a(bws.b));
            break;
         case 49:
            this.g(this.a(bws.f));
            break;
         case 50:
            this.g(this.a(bws.e));
            break;
         case 51:
            this.g(this.a(bws.d));
            break;
         case 52:
            this.g(this.a(bws.c));
            break;
         case 54:
            dqq.b(this);
            break;
         case 55:
            this.F();
            break;
         case 60:
            this.eX();
            break;
         case 65:
            this.g(this.a(bws.g));
            break;
         case 67:
            this.E();
            break;
         case 68:
            this.g(this.a(bws.h));
            break;
         default:
            super.b($$0);
      }
   }

   public void eX() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.ae.k() * 0.02;
         double $$2 = this.ae.k() * 0.02;
         double $$3 = this.ae.k() * 0.02;
         double $$4 = 10.0;
         this.dU().a(ly.ae, this.d(1.0) - $$1 * 10.0, this.dC() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
      }
   }

   private void E() {
      ffc $$0 = this.dx();

      for (int $$1 = 0; $$1 < 8; $$1++) {
         double $$2 = this.ae.a(0.0, 1.0);
         double $$3 = this.ae.a(0.0, 1.0);
         double $$4 = this.ae.a(0.0, 1.0);
         this.dU().a(ly.d, this.dz() + $$2, this.dB() + $$3, this.dF() + $$4, $$0.d, $$0.e, $$0.f);
      }
   }

   private void F() {
      czn $$0 = this.a(bws.b);
      this.a(bws.b, this.a(bws.a));
      this.a(bws.a, $$0);
   }

   @Override
   protected void aG() {
      this.a(this.dV().o(), 4.0F);
   }

   protected void eY() {
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
   public byl g(jf<byk> $$0) {
      return this.eZ().a($$0);
   }

   public double h(jf<byk> $$0) {
      return this.eZ().c($$0);
   }

   public double i(jf<byk> $$0) {
      return this.eZ().d($$0);
   }

   public bym eZ() {
      return this.bF;
   }

   public czn fa() {
      return this.a(bws.a);
   }

   public czn fb() {
      return this.a(bws.b);
   }

   public czn a(bxa $$0) {
      return this.fx() == $$0 ? this.fa() : this.fb();
   }

   @Nonnull
   @Override
   public czn dY() {
      return this.fa();
   }

   public boolean b(czj $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<czn> $$0) {
      return $$0.test(this.fa()) || $$0.test(this.fb());
   }

   public czn b(buf $$0) {
      if ($$0 == buf.a) {
         return this.a(bws.a);
      } else if ($$0 == buf.b) {
         return this.a(bws.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(buf $$0, czn $$1) {
      if ($$0 == buf.a) {
         this.a(bws.a, $$1);
      } else {
         if ($$0 != buf.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bws.b, $$1);
      }
   }

   public boolean d(bws $$0) {
      return !this.a($$0).f();
   }

   public boolean e(bws $$0) {
      return true;
   }

   public czn a(bws $$0) {
      return this.bt.a($$0);
   }

   public void a(bws $$0, czn $$1) {
      this.a($$0, this.bt.a($$0, $$1), $$1);
   }

   public float fc() {
      int $$0 = 0;
      int $$1 = 0;

      for (bws $$2 : bwt.i) {
         if ($$2.a() == bws.a.b) {
            czn $$3 = this.a($$2);
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
      byl $$1 = this.g(byp.v);
      $$1.c(k.a());
      if ($$0) {
         $$1.b(k);
      }
   }

   protected float fd() {
      return 1.0F;
   }

   public float fe() {
      return this.n_() ? (this.ae.i() - this.ae.i()) * 0.2F + 1.5F : (this.ae.i() - this.ae.i()) * 0.2F + 1.0F;
   }

   protected boolean ff() {
      return this.eG();
   }

   @Override
   public void h(bwi $$0) {
      if (!this.fQ()) {
         super.h($$0);
      }
   }

   private void c(bwi $$0) {
      ffc $$1;
      if (this.dP()) {
         $$1 = this.ds();
      } else if (!$$0.dP() && !this.dU().a_($$0.du()).a(axc.aM)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dB(), $$0.dB());
         $$1 = new ffc(this.dz(), $$2, this.dF());
         boolean $$4 = this.dp() <= 4.0F && this.dq() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.dq() / 2.0;
            ffc $$6 = $$1.b(0.0, $$5, 0.0);
            ffw $$7 = fft.a(fex.a($$6, (double)this.dp(), (double)this.dq(), (double)this.dp()));
            $$1 = this.dU().a(this, $$7, $$6, (double)this.dp(), (double)this.dq(), (double)this.dp()).map($$1x -> $$1x.b(0.0, -$$5, 0.0)).orElse($$1);
         }
      }

      this.m($$1.d, $$1.e, $$1.f);
   }

   @Override
   public boolean cL() {
      return this.cK();
   }

   protected float fg() {
      return this.z(1.0F);
   }

   protected float z(float $$0) {
      return (float)this.h(byp.o) * $$0 * this.aQ() + this.fh();
   }

   public float fh() {
      return this.b(bvo.h) ? 0.1F * ((float)this.c(bvo.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void s() {
      float $$0 = this.fg();
      if (!($$0 <= 1.0E-5F)) {
         ffc $$1 = this.dx();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.ch()) {
            float $$2 = this.dK() * (float) (Math.PI / 180.0);
            this.j(new ffc((double)(-azm.a($$2)) * 0.2, 0.0, (double)azm.b($$2) * 0.2));
         }

         this.ar = true;
      }
   }

   protected void fi() {
      this.i(this.dx().b(0.0, -0.04F, 0.0));
   }

   protected void c(axr<ewz> $$0) {
      this.i(this.dx().b(0.0, 0.04F, 0.0));
   }

   protected float fj() {
      return 0.8F;
   }

   public boolean a(exa $$0) {
      return false;
   }

   @Override
   protected double bb() {
      return this.h(byp.n);
   }

   protected double fk() {
      boolean $$0 = this.dx().e <= 0.0;
      return $$0 && this.b(bvo.B) ? Math.min(this.bc(), 0.01) : this.bc();
   }

   public void a_(ffc $$0) {
      exa $$1 = this.dU().b_(this.du());
      if ((this.bh() || this.bu()) && this.el() && !this.a($$1)) {
         this.m($$0);
      } else if (this.fI()) {
         this.n($$0);
      } else {
         this.l($$0);
      }
   }

   private void l(ffc $$0) {
      iv $$1 = this.aO();
      float $$2 = this.aH() ? this.dU().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      ffc $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      bvm $$6 = this.c(bvo.y);
      if ($$6 != null) {
         $$5 += (0.05 * (double)($$6.e() + 1) - $$4.e) * 0.2;
      } else if (!this.dU().C || this.dU().C($$1)) {
         $$5 -= this.fk();
      } else if (this.dB() > (double)this.dU().G_()) {
         $$5 = -0.1;
      } else {
         $$5 = 0.0;
      }

      if (this.ew()) {
         this.n($$4.d, $$5, $$4.f);
      } else {
         float $$7 = this instanceof cjn ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void m(ffc $$0) {
      boolean $$1 = this.dx().e <= 0.0;
      double $$2 = this.dB();
      double $$3 = this.fk();
      if (this.bh()) {
         float $$4 = this.ch() ? 0.9F : this.fj();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(byp.F);
         if (!this.aH()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fn() - $$5) * $$6;
         }

         if (this.b(bvo.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(bxn.a, this.dx());
         ffc $$7 = this.dx();
         if (this.P && this.d_()) {
            $$7 = new ffc($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.i(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(bxn.a, this.dx());
         if (this.b(axh.b) <= this.do()) {
            this.i(this.dx().d(0.5, 0.8F, 0.5));
            ffc $$8 = this.a($$3, $$1, this.dx());
            this.i($$8);
         } else {
            this.i(this.dx().c(0.5));
         }

         if ($$3 != 0.0) {
            this.i(this.dx().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      ffc $$9 = this.dx();
      if (this.P && this.f($$9.d, $$9.e + 0.6F - this.dB() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void n(ffc $$0) {
      if (this.d_()) {
         this.l($$0);
         this.fl();
      } else {
         ffc $$1 = this.dx();
         double $$2 = $$1.i();
         this.i(this.o($$1));
         this.a(bxn.a, this.dx());
         if (!this.dU().C) {
            double $$3 = this.dx().i();
            this.c($$2, $$3);
         }
      }
   }

   public void fl() {
      this.b(7, true);
      this.b(7, false);
   }

   private ffc o(ffc $$0) {
      ffc $$1 = this.bR();
      float $$2 = this.dM() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fk();
      double $$6 = azm.k(Math.cos((double)$$2));
      $$0 = $$0.b(0.0, $$5 * (-1.0 + $$6 * 0.75), 0.0);
      if ($$0.e < 0.0 && $$3 > 0.0) {
         double $$7 = $$0.e * -0.1 * $$6;
         $$0 = $$0.b($$1.d * $$7 / $$3, $$7, $$1.f * $$7 / $$3);
      }

      if ($$2 < 0.0F && $$3 > 0.0) {
         double $$8 = $$4 * (double)(-azm.a($$2)) * 0.04;
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

   private void c(crm $$0, ffc $$1) {
      ffc $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.dh()) {
         this.B(this.c($$0));
         this.a_($$2);
      } else {
         this.i(ffc.c);
      }
   }

   protected void a(crm $$0, ffc $$1) {
   }

   protected ffc b(crm $$0, ffc $$1) {
      return $$1;
   }

   protected float c(crm $$0) {
      return this.fn();
   }

   public void r(boolean $$0) {
      float $$1 = (float)azm.g(this.dz() - this.K, $$0 ? this.dB() - this.L : 0.0, this.dF() - this.M);
      if (!this.bX() && this.bI()) {
         this.A($$1);
      } else {
         this.aT.a();
      }
   }

   protected void A(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aT.a($$1, 0.4F, this.n_() ? 3.0F : 1.0F);
   }

   private ffc a(ffc $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.i(this.p(this.dx()));
      this.a(bxn.a, this.dx());
      ffc $$2 = this.dx();
      if ((this.P || this.bf) && (this.d_() || this.aw && dss.a(this))) {
         $$2 = new ffc($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public ffc a(double $$0, boolean $$1, ffc $$2) {
      if ($$0 != 0.0 && !this.ch()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new ffc($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private ffc p(ffc $$0) {
      if (this.d_()) {
         this.k();
         float $$1 = 0.15F;
         double $$2 = azm.a($$0.d, -0.15F, 0.15F);
         double $$3 = azm.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dv().a(dmt.oy) && this.fH() && this instanceof crm) {
            $$4 = 0.0;
         }

         $$0 = new ffc($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aH() ? this.fn() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fm();
   }

   protected float fm() {
      return this.cV() instanceof crm ? this.fn() * 0.1F : 0.02F;
   }

   public float fn() {
      return this.bP;
   }

   public void B(float $$0) {
      this.bP = $$0;
   }

   public boolean c(arq $$0, bwi $$1) {
      this.B($$1);
      return false;
   }

   @Override
   public void h() {
      super.h();
      this.I();
      this.J();
      if (!this.dU().C) {
         int $$0 = this.eV();
         if ($$0 > 0) {
            if (this.aL <= 0) {
               this.aL = 20 * (30 - $$0);
            }

            this.aL--;
            if (this.aL <= 0) {
               this.o($$0 - 1);
            }
         }

         int $$1 = this.eW();
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
            this.eR().c();
         }

         if (this.fQ() && !this.L()) {
            this.fR();
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
         float $$6 = (float)azm.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$7 = azm.e(azm.h(this.dK()) - $$6);
         if (95.0F < $$7 && $$7 < 265.0F) {
            $$5 = $$6 - 180.0F;
         } else {
            $$5 = $$6;
         }
      }

      if (this.aR > 0.0F) {
         $$5 = this.dK();
      }

      bqq $$8 = bqp.a();
      $$8.a("headTurn");
      this.C($$5);
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
      if (this.fI()) {
         this.bo++;
      } else {
         this.bo = 0;
      }

      if (this.fQ()) {
         this.x(0.0F);
      }

      this.u();
      this.aZ.a();
   }

   private void G() {
      Map<bws, czn> $$0 = this.H();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bws, czn> H() {
      Map<bws, czn> $$0 = null;

      for (bws $$1 : bws.j) {
         czn $$2 = this.bI.get($$1);
         czn $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bws.class);
            }

            $$0.put($$1, $$3);
            bym $$4 = this.eZ();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<bws, czn> $$5 : $$0.entrySet()) {
            bws $$6 = $$5.getKey();
            czn $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1x) -> {
                  byl $$2 = this.bF.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1x.a());
                     $$2.b($$1x);
                  }
               });
               if (this.dU() instanceof arq $$8) {
                  dgc.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(czn $$0, czn $$1) {
      return !czn.a($$1, $$0);
   }

   private void a(Map<bws, czn> $$0) {
      czn $$1 = $$0.get(bws.a);
      czn $$2 = $$0.get(bws.b);
      if ($$1 != null && $$2 != null && czn.a($$1, this.bI.get(bws.b)) && czn.a($$2, this.bI.get(bws.a))) {
         ((arq)this.dU()).m().b(this, new acx(this, (byte)55));
         $$0.remove(bws.a);
         $$0.remove(bws.b);
         this.bI.put(bws.a, $$1.v());
         this.bI.put(bws.b, $$2.v());
      }
   }

   private void b(Map<bws, czn> $$0) {
      List<Pair<bws, czn>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         czn $$3 = $$2.v();
         $$1.add(Pair.of($$1x, $$3));
         this.bI.put($$1x, $$3);
      });
      ((arq)this.dU()).m().b(this, new afg(this.ao(), $$1));
   }

   protected void C(float $$0) {
      float $$1 = azm.h($$0 - this.aV);
      this.aV += $$1 * 0.3F;
      float $$2 = azm.h(this.dK() - this.aV);
      float $$3 = this.fo();
      if (Math.abs($$2) > $$3) {
         this.aV = this.aV + ($$2 - (float)azm.j((double)$$2) * $$3);
      }
   }

   protected float fo() {
      return 50.0F;
   }

   public void k_() {
      if (this.bQ > 0) {
         this.bQ--;
      }

      if (this.bP()) {
         this.N_().e();
      } else if (!this.dh()) {
         this.i(this.dx().c(0.98));
      }

      if (this.bl > 0) {
         this.a(this.bl, this.bk);
         this.bl--;
      }

      this.bt.a((bwi)this);
      ffc $$0 = this.dx();
      double $$1 = $$0.d;
      double $$2 = $$0.e;
      double $$3 = $$0.f;
      if (this.an().equals(bwr.bS)) {
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
      bqq $$4 = bqp.a();
      $$4.a("ai");
      this.fp();
      if (this.ff()) {
         this.bf = false;
         this.bg = 0.0F;
         this.bi = 0.0F;
      } else if (this.di() && !this.dU().C) {
         $$4.a("newAi");
         this.ft();
         $$4.c();
      }

      $$4.c();
      $$4.a("jump");
      if (this.bf && this.el()) {
         double $$5;
         if (this.bu()) {
            $$5 = this.b(axh.b);
         } else {
            $$5 = this.b(axh.a);
         }

         boolean $$7 = this.bh() && $$5 > 0.0;
         double $$8 = this.do();
         if (!$$7 || this.aH() && !($$5 > $$8)) {
            if (!this.bu() || this.aH() && !($$5 > $$8)) {
               if ((this.aH() || $$7 && $$5 <= $$8) && this.bQ == 0) {
                  this.s();
                  this.bQ = 10;
               }
            } else {
               this.c(axh.b);
            }
         } else {
            this.c(axh.a);
         }
      } else {
         this.bQ = 0;
      }

      $$4.c();
      $$4.a("travel");
      if (this.fI()) {
         this.fr();
      }

      fex $$9 = this.cQ();
      ffc $$10 = new ffc((double)this.bg, (double)this.bh, (double)this.bi);
      if (this.b(bvo.B) || this.b(bvo.y)) {
         this.k();
      }

      label122: {
         if (this.cV() instanceof crm $$11 && this.bI()) {
            this.c($$11, $$10);
            break label122;
         }

         if (this.dh()) {
            this.a_($$10);
         }
      }

      if (!this.dU().w_() || this.df()) {
         this.aI();
      }

      if (this.dU().w_()) {
         this.r(this instanceof cjn);
      }

      $$4.c();
      if (this.dU() instanceof arq $$12) {
         $$4.a("freezing");
         if (!this.av || !this.dI()) {
            this.k(Math.max(0, this.ct() - 2));
         }

         this.eh();
         this.ei();
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
      if (this.dU() instanceof arq $$13 && this.fq() && this.bj()) {
         this.a($$13, this.dV().i(), 1.0F);
      }
   }

   protected void fp() {
      this.bg *= 0.98F;
      this.bi *= 0.98F;
   }

   public boolean fq() {
      return false;
   }

   protected void fr() {
      this.cx();
      if (!this.dU().C) {
         if (!this.fs()) {
            this.b(7, false);
            return;
         }

         int $$0 = this.bo + 1;
         if ($$0 % 10 == 0) {
            int $$1 = $$0 / 10;
            if ($$1 % 2 == 0) {
               List<bws> $$2 = bws.j.stream().filter($$0x -> b(this.a($$0x), $$0x)).toList();
               bws $$3 = ag.a($$2, this.ae);
               this.a($$3).a(1, this, $$3);
            }

            this.a(eft.n);
         }
      }
   }

   protected boolean fs() {
      if (!this.aH() && !this.bX() && !this.b(bvo.y)) {
         for (bws $$0 : bws.j) {
            if (b(this.a($$0), $$0)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   protected void ft() {
   }

   @Override
   protected void o() {
      List<bwi> $$0 = this.dU().i(this, this.cQ());
      if (!$$0.isEmpty()) {
         if (this.dU() instanceof arq $$1) {
            int $$2 = $$1.O().d(dji.w);
            if ($$2 > 0 && $$0.size() > $$2 - 1 && this.ae.a(4) == 0) {
               int $$3 = 0;

               for (bwi $$4 : $$0) {
                  if (!$$4.bX()) {
                     $$3++;
                  }
               }

               if ($$3 > $$2 - 1) {
                  this.a($$1, this.dV().h(), 6.0F);
               }
            }
         }

         for (bwi $$5 : $$0) {
            this.D($$5);
         }
      }
   }

   protected void a(fex $$0, fex $$1) {
      fex $$2 = $$0.b($$1);
      List<bwi> $$3 = this.dU().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bwi $$4 : $$3) {
            if ($$4 instanceof bxj) {
               this.f((bxj)$$4);
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

   protected void D(bwi $$0) {
      $$0.h(this);
   }

   protected void f(bxj $$0) {
   }

   public boolean fu() {
      return (this.al.a(aC) & 4) != 0;
   }

   @Override
   public void bN() {
      bwi $$0 = this.dj();
      super.bN();
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
   public bxe N_() {
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

   public void a(cnr $$0) {
      bwi $$1 = $$0.q();
      if ($$1 instanceof arr) {
         aq.R.a((arr)$$1, $$0.f(), this);
      }
   }

   public void a(bwi $$0, int $$1) {
      if (!$$0.dP() && !this.dU().C && ($$0 instanceof cnr || $$0 instanceof cru || $$0 instanceof bww)) {
         ((arq)this.dU()).m().b($$0, new agb($$0.ao(), this.ao(), $$1));
      }
   }

   public boolean E(bwi $$0) {
      return this.a($$0, dit.a.a, dit.b.a, $$0.dD());
   }

   public boolean a(bwi $$0, dit.a $$1, dit.b $$2, double $$3) {
      if ($$0.dU() != this.dU()) {
         return false;
      } else {
         ffc $$4 = new ffc(this.dz(), this.dD(), this.dF());
         ffc $$5 = new ffc($$0.dz(), $$3, $$0.dF());
         return $$5.f($$4) > 128.0 ? false : this.dU().a(new dit($$4, $$5, $$1, $$2, this)).d() == ffa.a.a;
      }
   }

   @Override
   public float j(float $$0) {
      return $$0 == 1.0F ? this.aX : azm.i($$0, this.aY, this.aX);
   }

   public float D(float $$0) {
      float $$1 = this.aR - this.aQ;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aQ + $$1 * $$0;
   }

   @Override
   public boolean bE() {
      return !this.dP();
   }

   @Override
   public boolean bF() {
      return this.bI() && !this.V_() && !this.d_();
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
   public ffc a(jb.a $$0, m.a $$1) {
      return k(super.a($$0, $$1));
   }

   public static ffc k(ffc $$0) {
      return new ffc($$0.d, $$0.e, 0.0);
   }

   public float fv() {
      return this.bR;
   }

   public final void E(float $$0) {
      this.F(azm.a($$0, 0.0F, this.eU()));
   }

   protected void F(float $$0) {
      this.bR = $$0;
   }

   public void e_() {
   }

   public void J_() {
   }

   protected void fw() {
      this.bK = true;
   }

   public abstract bxa fx();

   public boolean fy() {
      return (this.al.a(aC) & 1) > 0;
   }

   public buf fz() {
      return (this.al.a(aC) & 2) > 0 ? buf.b : buf.a;
   }

   private void I() {
      if (this.fy()) {
         if (czn.b(this.b(this.fz()), this.bm)) {
            this.bm = this.b(this.fz());
            this.a(this.bm);
         } else {
            this.fE();
         }
      }
   }

   @Nullable
   private cnr b(czn $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dD() - 0.3F;
         cnr $$4 = new cnr(this.dU(), this.dz(), $$3, this.dF(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ae.i() * 0.5F;
            float $$6 = this.ae.i() * (float) (Math.PI * 2);
            $$4.n((double)(-azm.a($$6) * $$5), 0.2F, (double)(azm.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = azm.a(this.dM() * (float) (Math.PI / 180.0));
            float $$9 = azm.b(this.dM() * (float) (Math.PI / 180.0));
            float $$10 = azm.a(this.dK() * (float) (Math.PI / 180.0));
            float $$11 = azm.b(this.dK() * (float) (Math.PI / 180.0));
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

   protected void a(czn $$0) {
      $$0.b(this.dU(), this, this.fB());
      if (--this.bn == 0 && !this.dU().C && !$$0.x()) {
         this.K_();
      }
   }

   private void J() {
      this.bX = this.bW;
      if (this.cj()) {
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

   public void c(buf $$0) {
      czn $$1 = this.b($$0);
      if (!$$1.f() && !this.fy()) {
         this.bm = $$1;
         this.bn = $$1.a(this);
         if (!this.dU().C) {
            this.c(1, true);
            this.c(2, $$0 == buf.b);
            this.a(eft.D);
         }
      }
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (bD.equals($$0)) {
         if (this.dU().C) {
            this.fO().ifPresent(this::a);
         }
      } else if (aC.equals($$0) && this.dU().C) {
         if (this.fy() && this.bm.f()) {
            this.bm = this.b(this.fz());
            if (!this.bm.f()) {
               this.bn = this.bm.a(this);
            }
         } else if (!this.fy() && !this.bm.f()) {
            this.bm = czn.k;
            this.bn = 0;
         }
      }
   }

   @Override
   public void a(ev.a $$0, ffc $$1) {
      super.a($$0, $$1);
      this.aY = this.aX;
      this.aV = this.aX;
      this.aW = this.aV;
   }

   @Override
   public float u(float $$0) {
      return azm.h($$0, this.aW, this.aV);
   }

   public void b(czn $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ffc $$3 = new ffc(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dM() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dK() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ae.i()) * 0.6 - 0.3;
         ffc $$5 = new ffc(((double)this.ae.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dM() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dK() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dz(), this.dD(), this.dF());
         this.dU().a(new lu(ly.U, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void K_() {
      if (!this.dU().C || this.fy()) {
         buf $$0 = this.fz();
         if (!this.bm.equals(this.b($$0))) {
            this.fD();
         } else {
            if (!this.bm.f() && this.fy()) {
               czn $$1 = this.bm.a(this.dU(), this);
               if ($$1 != this.bm) {
                  this.a($$0, $$1);
               }

               this.fE();
            }
         }
      }
   }

   public void b(czn $$0) {
   }

   public czn fA() {
      return this.bm;
   }

   public int fB() {
      return this.bn;
   }

   public int fC() {
      return this.fy() ? this.bm.a(this) - this.fB() : 0;
   }

   public void fD() {
      if (!this.bm.f()) {
         this.bm.a(this.dU(), this, this.fB());
         if (this.bm.x()) {
            this.I();
         }
      }

      this.fE();
   }

   public void fE() {
      if (!this.dU().C) {
         boolean $$0 = this.fy();
         this.c(1, false);
         if ($$0) {
            this.a(eft.C);
         }
      }

      this.bm = czn.k;
      this.bn = 0;
   }

   public boolean fF() {
      return this.fG() != null;
   }

   @Nullable
   public czn fG() {
      if (!this.fy()) {
         return null;
      } else {
         dbo $$0 = this.bm.a(kk.I);
         if ($$0 != null) {
            int $$1 = this.bm.h().a(this.bm, this) - this.bn;
            if ($$1 >= $$0.a()) {
               return this.bm;
            }
         }

         return null;
      }
   }

   public boolean fH() {
      return this.cb();
   }

   public boolean fI() {
      return this.i(7);
   }

   @Override
   public boolean cj() {
      return super.cj() || !this.fI() && this.c(bxv.b);
   }

   public int fJ() {
      return this.bo;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dz();
      double $$5 = this.dB();
      double $$6 = this.dF();
      double $$7 = $$1;
      boolean $$8 = false;
      iv $$9 = iv.a($$0, $$1, $$2);
      djm $$10 = this.dU();
      if ($$10.C($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.G_()) {
            iv $$12 = $$9.e();
            eat $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.b($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cQ())) {
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

         if (this instanceof bxr $$14) {
            $$14.O().m();
         }

         return true;
      }
   }

   public boolean fK() {
      return !this.eG();
   }

   public boolean fL() {
      return true;
   }

   public void a(iv $$0, boolean $$1) {
   }

   public boolean fM() {
      return false;
   }

   @Override
   public final bwl a(bxv $$0) {
      return $$0 == bxv.c ? aD : this.e($$0).a(this.ek());
   }

   protected bwl e(bxv $$0) {
      return this.an().n().a(this.ej());
   }

   public ImmutableList<bxv> fN() {
      return ImmutableList.of(bxv.a);
   }

   public fex f(bxv $$0) {
      bwl $$1 = this.a($$0);
      return new fex((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bxv $$0) {
      fex $$1 = this.a($$0).a(this.ds());
      return this.dU().b(this, $$1);
   }

   @Override
   public boolean n(boolean $$0) {
      return super.n($$0) && !this.fQ();
   }

   public Optional<iv> fO() {
      return this.al.a(bD);
   }

   public void g(iv $$0) {
      this.al.a(bD, Optional.of($$0));
   }

   public void fP() {
      this.al.a(bD, Optional.empty());
   }

   public boolean fQ() {
      return this.fO().isPresent();
   }

   public void b(iv $$0) {
      if (this.bX()) {
         this.bN();
      }

      eat $$1 = this.dU().a_($$0);
      if ($$1.b() instanceof dmk) {
         this.dU().a($$0, $$1.b(dmk.c, Boolean.valueOf(true)), 3);
      }

      this.b(bxv.c);
      this.a($$0);
      this.g($$0);
      this.i(ffc.c);
      this.ar = true;
   }

   private void a(iv $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean L() {
      return this.fO().map($$0 -> this.dU().a_($$0).b() instanceof dmk).orElse(false);
   }

   public void fR() {
      this.fO().filter(this.dU()::C).ifPresent($$0x -> {
         eat $$1 = this.dU().a_($$0x);
         if ($$1.b() instanceof dmk) {
            jb $$2 = $$1.c(dmk.e);
            this.dU().a($$0x, $$1.b(dmk.c, Boolean.valueOf(false)), 3);
            ffc $$3 = dmk.a(this.an(), this.dU(), $$0x, $$2, this.dK()).orElseGet(() -> {
               iv $$1x = $$0x.d();
               return new ffc((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            ffc $$4 = ffc.c($$0x).d($$3).d();
            float $$5 = (float)azm.d(azm.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.w($$5);
            this.x(0.0F);
         }
      });
      ffc $$0 = this.ds();
      this.b(bxv.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fP();
   }

   @Nullable
   public jb fS() {
      iv $$0 = this.fO().orElse(null);
      return $$0 != null ? dmk.a(this.dU(), $$0) : null;
   }

   @Override
   public boolean bJ() {
      return !this.fQ() && super.bJ();
   }

   public czn d(czn $$0) {
      return czn.k;
   }

   private static byte g(bws $$0) {
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

   public void a(czj $$0, bws $$1) {
      this.dU().a(this, g($$1));
      this.a(this.a($$1), $$1, this.bF);
   }

   private void a(czn $$0, bws $$1, bym $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         byl $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      dgc.a($$0, this, $$1);
   }

   public static bws d(buf $$0) {
      return $$0 == buf.a ? bws.a : bws.b;
   }

   public final boolean e(czn $$0) {
      if (this.bI() && !this.V_()) {
         dhw $$1 = $$0.a(kk.D);
         if ($$1 != null && $$1.g()) {
            bws $$2 = $$1.b();
            return this.e($$2) && $$1.a(this.an()) ? this.a($$2).f() && this.f($$2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected boolean f(bws $$0) {
      return true;
   }

   public final bws f(czn $$0) {
      dhw $$1 = $$0.a(kk.D);
      return $$1 != null && this.e($$1.b()) ? $$1.b() : bws.a;
   }

   public final boolean a(czn $$0, bws $$1) {
      dhw $$2 = $$0.a(kk.D);
      return $$2 == null ? $$1 == bws.a && this.e(bws.a) : $$1 == $$2.b() && this.e($$2.b()) && $$2.a(this.an());
   }

   private static bya a(bxj $$0, bws $$1) {
      return $$1 != bws.f && $$1 != bws.a && $$1 != bws.b ? bya.a($$0, $$1, $$2 -> $$2.f() || $$0.f($$2) == $$1) : bya.a($$0, $$1);
   }

   @Nullable
   private static bws r(int $$0) {
      if ($$0 == 100 + bws.f.b()) {
         return bws.f;
      } else if ($$0 == 100 + bws.e.b()) {
         return bws.e;
      } else if ($$0 == 100 + bws.d.b()) {
         return bws.d;
      } else if ($$0 == 100 + bws.c.b()) {
         return bws.c;
      } else if ($$0 == 98) {
         return bws.a;
      } else if ($$0 == 99) {
         return bws.b;
      } else if ($$0 == 105) {
         return bws.g;
      } else {
         return $$0 == 106 ? bws.h : null;
      }
   }

   @Override
   public bya a_(int $$0) {
      bws $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dI() {
      if (this.V_()) {
         return false;
      } else {
         for (bws $$0 : bwt.i) {
            if (this.a($$0).a(axk.br)) {
               return false;
            }
         }

         return super.dI();
      }
   }

   @Override
   public boolean cm() {
      return !this.dU().w_() && this.b(bvo.x) || super.cm();
   }

   @Override
   public float dL() {
      return this.aV;
   }

   @Override
   public void a(abv $$0) {
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

   public float fT() {
      dcv $$0 = this.dY().a(kk.B);
      return $$0 != null ? $$0.b() : 0.0F;
   }

   @Override
   public float dO() {
      float $$0 = (float)this.h(byp.B);
      return this.cV() instanceof crm ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public ffc m(bwi $$0) {
      return this.ds().e(this.a($$0, this.a(this.at()), this.ek() * this.ej()));
   }

   protected void a(int $$0, double $$1) {
      this.aX = (float)azm.e(1.0 / (double)$$0, (double)this.aX, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(azm.c((double)$$0 * this.h(byp.h)));
   }

   public boolean fU() {
      return false;
   }

   public boolean a(arq $$0, bux $$1) {
      return this.d($$1) || dgc.a($$0, this, $$1);
   }

   public static boolean b(czn $$0, bws $$1) {
      if (!$$0.c(kk.F)) {
         return false;
      } else {
         dhw $$2 = $$0.a(kk.D);
         return $$2 != null && $$1 == $$2.b() && !$$0.r();
      }
   }

   @VisibleForTesting
   public int fV() {
      return this.bb;
   }

   public static record a(awm a, awm b) {
   }
}
