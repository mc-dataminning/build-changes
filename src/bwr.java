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
import org.slf4j.Logger;

public abstract class bwr extends bvs implements bvl {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "active_effects";
   private static final ald c = ald.b("powder_snow");
   private static final ald d = ald.b("sprinting");
   private static final bxv k = new bxv(d, 0.3F, bxv.a.c);
   public static final int l = 98;
   public static final int m = 100;
   public static final int n = 105;
   public static final int o = 106;
   public static final int p = 6;
   public static final int q = 100;
   private static final int bs = 40;
   public static final double r = 0.003;
   public static final double s = 0.08;
   public static final int t = 20;
   private static final int bt = 10;
   private static final int bu = 2;
   public static final float u = 0.42F;
   private static final double bv = 128.0;
   protected static final int ay = 1;
   protected static final int az = 2;
   protected static final int aA = 4;
   protected static final akg<Byte> aB = akk.a(bwr.class, aki.a);
   private static final akg<Float> bw = akk.a(bwr.class, aki.d);
   private static final akg<List<lt>> bx = akk.a(bwr.class, aki.m);
   private static final akg<Boolean> by = akk.a(bwr.class, aki.k);
   private static final akg<Integer> bz = akk.a(bwr.class, aki.b);
   private static final akg<Integer> bA = akk.a(bwr.class, aki.b);
   private static final akg<Optional<jj>> bB = akk.a(bwr.class, aki.p);
   private static final int bC = 15;
   protected static final bvv aC = bvv.c(0.2F, 0.2F).b(0.2F);
   public static final float aD = 0.5F;
   public static final float aE = 0.5F;
   public static final String aF = "attributes";
   public static final Predicate<bwr> aG = $$0 -> {
      if ($$0 instanceof cqi $$1) {
         cxy $$3 = $$1.a(bwc.f);
         return !$$3.a(axi.cr);
      } else {
         return true;
      }
   };
   private final bxu bD;
   private final bue bE = new bue(this);
   private final Map<js<buu>, buw> bF = Maps.newHashMap();
   private final Map<bwc, cxy> bG = af.a(bwc.class, $$0x -> cxy.k);
   public boolean aH;
   private boolean bH = false;
   public btp aI;
   public int aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public float aP;
   public float aQ;
   protected int aR;
   public final bxq aS = new bxq();
   public final int aT = 20;
   public float aU;
   public float aV;
   public float aW;
   public float aX;
   public final bvr aY = new bvr(this);
   @Nullable
   protected bvy<cqi> aZ;
   protected int ba;
   protected boolean bb;
   protected int bc;
   protected float bd;
   protected boolean be;
   public float bf;
   public float bg;
   public float bh;
   protected bwm bi = new bwm(this);
   protected double bj;
   protected int bk;
   private boolean bI = true;
   @Nullable
   private bvy<bwr> bJ;
   private int bK;
   @Nullable
   private bwr bL;
   private int bM;
   private float bN;
   private int bO;
   private float bP;
   protected cxy bl = cxy.k;
   protected int bm;
   protected int bn;
   private jj bQ;
   private Optional<jj> bR = Optional.empty();
   @Nullable
   private buh bS;
   private long bT;
   protected int bo;
   protected float bp;
   @Nullable
   protected cxy bq;
   private float bU;
   private float bV;
   protected bxr<?> br;
   private boolean bW;
   private final EnumMap<bwc, Reference2ObjectMap<deh, Set<dez>>> bX = new EnumMap<>(bwc.class);

   protected bwr(bwb<? extends bwr> $$0, dhp $$1) {
      super($$0, $$1);
      this.bD = new bxu(bxy.a($$0));
      this.d(this.eT());
      this.I = true;
      this.ay();
      this.w((float)(Math.random() * (float) (Math.PI * 2)));
      this.aW = this.dL();
      uk $$2 = uk.a;
      this.br = this.a(new Dynamic($$2, (ut)$$2.createMap(ImmutableMap.of($$2.a("memories"), (ut)$$2.emptyMap()))));
   }

   public bxr<?> eb() {
      return this.br;
   }

   protected bxr.b<?> ec() {
      return bxr.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bxr<?> a(Dynamic<?> $$0) {
      return this.ec().a($$0);
   }

   @Override
   public void c(arn $$0) {
      this.a($$0, this.dW().y(), Float.MAX_VALUE);
   }

   public boolean a(bwb<?> $$0) {
      return true;
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(aB, (byte)0);
      $$0.a(bx, List.of());
      $$0.a(by, false);
      $$0.a(bz, 0);
      $$0.a(bA, 0);
      $$0.a(bw, 1.0F);
      $$0.a(bB, Optional.empty());
   }

   public static bxw.a ed() {
      return bxw.a()
         .a(bxx.s)
         .a(bxx.p)
         .a(bxx.v)
         .a(bxx.a)
         .a(bxx.b)
         .a(bxx.r)
         .a(bxx.B)
         .a(bxx.y)
         .a(bxx.n)
         .a(bxx.x)
         .a(bxx.k)
         .a(bxx.o)
         .a(bxx.w)
         .a(bxx.h)
         .a(bxx.i)
         .a(bxx.F)
         .a(bxx.u)
         .a(bxx.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, dym $$2, jj $$3) {
      if (!this.bj()) {
         this.bq();
      }

      if (this.dV() instanceof arn $$4 && $$1 && this.Z > 0.0) {
         this.b($$4, $$3);
         double $$5 = (double)Math.max(0, azk.a(this.h(this.Z)));
         if ($$5 > 0.0 && !$$2.l()) {
            double $$6 = this.dA();
            double $$7 = this.dC();
            double $$8 = this.dG();
            jj $$9 = this.dv();
            if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
               double $$10 = $$6 - (double)$$3.u() - 0.5;
               double $$11 = $$8 - (double)$$3.w() - 0.5;
               double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
               $$6 = (double)$$3.u() + 0.5 + $$10 / $$12 * 0.5;
               $$8 = (double)$$3.w() + 0.5 + $$11 / $$12 * 0.5;
            }

            double $$13 = Math.min(0.2F + $$5 / 15.0, 2.5);
            int $$14 = (int)(150.0 * $$13);
            $$4.a(new ln(lv.b, $$2), $$6, $$7, $$8, $$14, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.bR = Optional.empty();
      }
   }

   public final boolean ee() {
      return this.aq().a(axd.m);
   }

   public float a(float $$0) {
      return azk.h($$0, this.bV, this.bU);
   }

   public boolean ef() {
      return this.dy().b() < 1.0E-5F && this.bm();
   }

   @Override
   public void az() {
      this.aP = this.aQ;
      if (this.ak) {
         this.fO().ifPresent(this::a);
      }

      if (this.dV() instanceof arn $$0) {
         dej.b($$0, this);
      }

      super.az();
      bqb $$1 = bqa.a();
      $$1.a("livingEntityBaseTick");
      if (this.bi() || this.dV().C) {
         this.aH();
      }

      if (this.bK() && this.dV() instanceof arn $$2) {
         boolean $$3 = this instanceof cqi;
         if (this.bL()) {
            this.a($$2, this.dW().g(), 1.0F);
         } else if ($$3 && !$$2.A_().a(this.cR())) {
            double $$4 = $$2.A_().a(this) + $$2.A_().n();
            if ($$4 < 0.0) {
               double $$5 = $$2.A_().o();
               if ($$5 > 0.0) {
                  this.a($$2, this.dW().x(), (float)Math.max(1, azk.a(-$$4 * $$5)));
               }
            }
         }

         if (this.a(axf.a) && !$$2.a_(jj.a(this.dA(), this.dE(), this.dG())).a(dkw.nF)) {
            boolean $$6 = !this.ee() && !bux.c(this) && (!$$3 || !((cqi)this).gj().a);
            if ($$6) {
               this.j(this.l(this.ct()));
               if (this.ct() == -20) {
                  this.j(0);
                  $$2.a(this, (byte)67);
                  this.a($$2, this.dW().i(), 2.0F);
               }
            } else if (this.ct() < this.cs()) {
               this.j(this.m(this.ct()));
            }

            if (this.bZ() && this.dk() != null && this.dk().cb()) {
               this.bP();
            }
         } else if (this.ct() < this.cs()) {
            this.j(this.m(this.ct()));
         }

         jj $$7 = this.dv();
         if (!Objects.equal(this.bQ, $$7)) {
            this.bQ = $$7;
            this.b($$2, $$7);
         }
      }

      if (this.bK() && this.bk()) {
         this.aN();
      }

      if (this.aM > 0) {
         this.aM--;
      }

      if (this.aj > 0 && !(this instanceof aro)) {
         this.aj--;
      }

      if (this.eG() && this.dV().h(this)) {
         this.em();
      }

      if (this.ba > 0) {
         this.ba--;
      } else {
         this.aZ = null;
      }

      if (this.bL != null && !this.bL.bK()) {
         this.bL = null;
      }

      bwr $$8 = this.eq();
      if ($$8 != null) {
         if (!$$8.bK()) {
            this.a(null);
         } else if (this.af - this.bK > 100) {
            this.a(null);
         }
      }

      this.ex();
      this.aX = this.aW;
      this.aV = this.aU;
      this.N = this.dL();
      this.O = this.dN();
      $$1.c();
   }

   @Override
   protected float aT() {
      return azk.h((float)this.h(bxx.u), super.aT(), 1.0F);
   }

   public float eg() {
      return 0.0F;
   }

   protected void eh() {
      bxt $$0 = this.g(bxx.v);
      if ($$0 != null) {
         if ($$0.a(c) != null) {
            $$0.c(c);
         }
      }
   }

   protected void ei() {
      if (!this.bs().l()) {
         int $$0 = this.cu();
         if ($$0 > 0) {
            bxt $$1 = this.g(bxx.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cv();
            $$1.b(new bxv(c, (double)$$2, bxv.a.a));
         }
      }
   }

   protected void b(arn $$0, jj $$1) {
      dej.a($$0, this);
   }

   public boolean n_() {
      return false;
   }

   public float ej() {
      return this.n_() ? 0.5F : 1.0F;
   }

   public final float ek() {
      bxu $$0 = this.eZ();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bxx.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   public boolean el() {
      return true;
   }

   protected void em() {
      this.aO++;
      if (this.aO >= 20 && !this.dV().w_() && !this.dQ()) {
         this.dV().a(this, (byte)60);
         this.a(bvs.e.a);
      }
   }

   public boolean en() {
      return !this.n_();
   }

   protected boolean eo() {
      return !this.n_();
   }

   protected int l(int $$0) {
      bxt $$1 = this.g(bxx.w);
      double $$2;
      if ($$1 != null) {
         $$2 = $$1.g();
      } else {
         $$2 = 0.0;
      }

      return $$2 > 0.0 && this.ae.j() >= 1.0 / ($$2 + 1.0) ? $$0 : $$0 - 1;
   }

   protected int m(int $$0) {
      return Math.min($$0 + 4, this.cs());
   }

   public final int a(arn $$0, @Nullable bvs $$1) {
      return dej.a($$0, $$1, this, this.e($$0));
   }

   protected int e(arn $$0) {
      return 0;
   }

   protected boolean ep() {
      return false;
   }

   @Nullable
   public bwr eq() {
      return bvy.a(this.bJ, this.dV(), bwr.class);
   }

   @Nullable
   public cqi er() {
      return bvy.a(this.aZ, this.dV(), cqi.class);
   }

   @Override
   public bwr am() {
      return this.eq();
   }

   public int es() {
      return this.bK;
   }

   public void a(cqi $$0, int $$1) {
      this.a(new bvy<>($$0), $$1);
   }

   public void a(UUID $$0, int $$1) {
      this.a(new bvy<>($$0), $$1);
   }

   private void a(bvy<cqi> $$0, int $$1) {
      this.aZ = $$0;
      this.ba = $$1;
   }

   public void a(@Nullable bwr $$0) {
      this.bJ = $$0 != null ? new bvy<>($$0) : null;
      this.bK = this.af;
   }

   @Nullable
   public bwr et() {
      return this.bL;
   }

   public int eu() {
      return this.bM;
   }

   public void B(bvs $$0) {
      if ($$0 instanceof bwr) {
         this.bL = (bwr)$$0;
      } else {
         this.bL = null;
      }

      this.bM = this.af;
   }

   public int ev() {
      return this.bc;
   }

   public void n(int $$0) {
      this.bc = $$0;
   }

   public boolean ew() {
      return this.bH;
   }

   public void q(boolean $$0) {
      this.bH = $$0;
   }

   protected boolean b(bwc $$0) {
      return true;
   }

   public void a(bwc $$0, cxy $$1, cxy $$2) {
      if (!this.dV().w_() && !this.U_()) {
         if (!cxy.c($$1, $$2) && !this.ak) {
            dgc $$3 = $$2.a(kx.E);
            if (!this.bb() && $$3 != null && $$0 == $$3.b()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), this.a($$0, $$2, $$3), this.dm(), 1.0F, 1.0F, this.ae.g());
            }

            if (this.b($$0)) {
               this.a($$3 != null ? edm.v : edm.S);
            }
         }
      }
   }

   protected js<awj> a(bwc $$0, cxy $$1, dgc $$2) {
      return $$2.c();
   }

   @Override
   public void a(bvs.e $$0) {
      if (($$0 == bvs.e.a || $$0 == bvs.e.b) && this.dV() instanceof arn $$1) {
         this.a($$1, $$0);
      }

      super.a($$0);
      this.br.a();
   }

   protected void a(arn $$0, bvs.e $$1) {
      for (buw $$2 : this.eC()) {
         $$2.a($$0, this, $$1);
      }

      this.bF.clear();
   }

   @Override
   public void b(tw $$0) {
      $$0.a("Health", this.eF());
      $$0.a("HurtTime", (short)this.aM);
      $$0.a("HurtByTimestamp", this.bK);
      $$0.a("DeathTime", (short)this.aO);
      $$0.a("AbsorptionAmount", this.fv());
      $$0.a("attributes", this.eZ().d());
      if (!this.bF.isEmpty()) {
         uc $$1 = new uc();

         for (buw $$2 : this.bF.values()) {
            $$1.add($$2.k());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fI());
      this.fO().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<ut> $$3 = this.br.a(uk.a);
      $$3.resultOrPartial(a::error).ifPresent($$1 -> $$0.a("Brain", $$1));
      this.aZ = bvy.b($$0, "last_hurt_by_player");
      this.ba = $$0.h("last_hurt_by_player_memory_time");
      this.bJ = bvy.b($$0, "last_hurt_by_mob");
      this.bK = $$0.h("ticks_since_last_hurt_by_mob") + this.af;
   }

   @Override
   public void a(tw $$0) {
      this.G($$0.j("AbsorptionAmount"));
      if ($$0.b("attributes", 9) && this.dV() != null && !this.dV().C) {
         this.eZ().a($$0.c("attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         uc $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            tw $$3 = $$1.a($$2);
            buw $$4 = buw.a($$3);
            if ($$4 != null) {
               this.bF.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.d($$0.j("Health"));
      }

      this.aM = $$0.g("HurtTime");
      this.aO = $$0.g("DeathTime");
      this.bK = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         fdz $$6 = this.dV().R();
         fdu $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cH(), $$7);
         if (!$$8) {
            a.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         jj $$9 = new jj($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.h($$9);
         this.al.a(aq, bxd.c);
         if (!this.ak) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.br = this.a(new Dynamic(uk.a, $$0.c("Brain")));
      }

      if (this.aZ != null) {
         this.aZ.a($$0, "last_hurt_by_player");
         $$0.a("last_hurt_by_player_memory_time", this.ba);
      }

      if (this.bJ != null) {
         this.bJ.a($$0, "last_hurt_by_mob");
         $$0.a("ticks_since_last_hurt_by_mob", this.af - this.bK);
      }
   }

   protected void ex() {
      if (this.dV() instanceof arn $$0) {
         Iterator<js<buu>> $$1 = this.bF.keySet().iterator();

         try {
            while ($$1.hasNext()) {
               js<buu> $$2 = $$1.next();
               buw $$3 = this.bF.get($$2);
               if (!$$3.a($$0, this, () -> this.a($$3, true, null))) {
                  $$1.remove();
                  this.c(List.of($$3));
               } else if ($$3.d() % 600 == 0) {
                  this.a($$3, false, null);
               }
            }
         } catch (ConcurrentModificationException var6) {
         }

         if (this.bI) {
            this.K();
            this.q();
            this.bI = false;
         }
      } else {
         for (buw $$4 : this.bF.values()) {
            $$4.i();
         }

         List<lt> $$5 = this.al.a(bx);
         if (!$$5.isEmpty()) {
            boolean $$6 = this.al.a(by);
            int $$7 = this.cp() ? 15 : 4;
            int $$8 = $$6 ? 5 : 1;
            if (this.ae.a($$7 * $$8) == 0) {
               this.dV().a(af.a($$5, this.ae), this.d(0.5), this.dD(), this.g(0.5), 1.0, 1.0, 1.0);
            }
         }
      }
   }

   protected void K() {
      if (this.bF.isEmpty()) {
         this.eA();
         this.k(false);
      } else {
         this.k(this.b(buy.n));
         this.j();
      }
   }

   private void j() {
      List<lt> $$0 = this.bF.values().stream().filter(buw::g).map(buw::a).toList();
      this.al.a(bx, $$0);
      this.al.a(by, d(this.bF.values()));
   }

   private void q() {
      boolean $$0 = this.co();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable bvs $$0) {
      double $$1 = 1.0;
      if (this.cg()) {
         $$1 *= 0.8;
      }

      if (this.cp()) {
         float $$2 = this.fc();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cxy $$3 = this.a(bwc.f);
         bwb<?> $$4 = $$0.aq();
         if ($$4 == bwb.be && $$3.a(cyc.vo)
            || $$4 == bwb.bN && $$3.a(cyc.vr)
            || $$4 == bwb.aR && $$3.a(cyc.vu)
            || $$4 == bwb.aS && $$3.a(cyc.vu)
            || $$4 == bwb.E && $$3.a(cyc.vs)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bwr $$0) {
      return $$0 instanceof cqi && this.dV().an() == btn.a ? false : $$0.ey();
   }

   public boolean ey() {
      return !this.cC() && this.ez();
   }

   public boolean ez() {
      return !this.U_() && this.bK();
   }

   public static boolean d(Collection<buw> $$0) {
      for (buw $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void eA() {
      this.al.a(bx, List.of());
   }

   public boolean eB() {
      if (this.dV().C) {
         return false;
      } else if (this.bF.isEmpty()) {
         return false;
      } else {
         Map<js<buu>, buw> $$0 = Maps.newHashMap(this.bF);
         this.bF.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<buw> eC() {
      return this.bF.values();
   }

   public Map<js<buu>, buw> eD() {
      return this.bF;
   }

   public boolean b(js<buu> $$0) {
      return this.bF.containsKey($$0);
   }

   @Nullable
   public buw c(js<buu> $$0) {
      return this.bF.get($$0);
   }

   public float a(js<buu> $$0, float $$1) {
      buw $$2 = this.c($$0);
      return $$2 != null ? $$2.a(this, $$1) : 0.0F;
   }

   public final boolean a(buw $$0) {
      return this.b($$0, null);
   }

   public boolean b(buw $$0, @Nullable bvs $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         buw $$2 = this.bF.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bF.put($$0.c(), $$0);
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

   public boolean b(buw $$0) {
      if (this.aq().a(axd.G)) {
         return !$$0.a(buy.M);
      } else if (this.aq().a(axd.F)) {
         return !$$0.a(buy.L);
      } else {
         return !this.aq().a(axd.w) ? true : !$$0.a(buy.j) && !$$0.a(buy.s);
      }
   }

   public void c(buw $$0, @Nullable bvs $$1) {
      if (this.b($$0)) {
         buw $$2 = this.bF.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eE() {
      return this.aq().a(axd.x);
   }

   @Nullable
   public final buw d(js<buu> $$0) {
      return this.bF.remove($$0);
   }

   public boolean e(js<buu> $$0) {
      buw $$1 = this.d($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(buw $$0, @Nullable bvs $$1) {
      if (!this.dV().C) {
         this.bI = true;
         $$0.c().a().a(this.eZ(), $$0.e());
         this.c($$0);
      }
   }

   public void c(buw $$0) {
      for (bvs $$1 : this.cY()) {
         if ($$1 instanceof aro $$2) {
            $$2.f.b(new agf(this.ar(), $$0, false));
         }
      }
   }

   protected void a(buw $$0, boolean $$1, @Nullable bvs $$2) {
      if (!this.dV().C) {
         this.bI = true;
         if ($$1) {
            buu $$3 = $$0.c().a();
            $$3.a(this.eZ());
            $$3.a(this.eZ(), $$0.e());
            this.u();
         }

         this.c($$0);
      }
   }

   protected void c(Collection<buw> $$0) {
      if (!this.dV().C) {
         this.bI = true;

         for (buw $$1 : $$0) {
            $$1.c().a().a(this.eZ());

            for (bvs $$2 : this.cY()) {
               if ($$2 instanceof aro $$3) {
                  $$3.f.b(new aeh(this.ar(), $$1.c()));
               }
            }
         }

         this.u();
      }
   }

   private void u() {
      Set<bxt> $$0 = this.eZ().b();

      for (bxt $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(js<bxs> $$0) {
      if ($$0.a(bxx.s)) {
         float $$1 = this.eT();
         if (this.eF() > $$1) {
            this.d($$1);
         }
      } else if ($$0.a(bxx.r)) {
         float $$2 = this.eU();
         if (this.fv() > $$2) {
            this.F($$2);
         }
      } else if ($$0.a(bxx.y)) {
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
      return this.al.a(bw);
   }

   public void d(float $$0) {
      this.al.a(bw, azk.a($$0, 0.0F, this.eT()));
   }

   public boolean eG() {
      return this.eF() <= 0.0F;
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.eG()) {
         return false;
      } else if ($$1.a(axb.i) && this.b(buy.l)) {
         return false;
      } else {
         if (this.fQ()) {
            this.fR();
         }

         this.bc = 0;
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
            if (!$$1.a(axb.j) && $$1.c() instanceof bwr $$7) {
               this.d($$7);
            }

            $$4 = true;
         }

         if ($$1.a(axb.o) && this.aq().a(axd.l)) {
            $$2 *= 5.0F;
         }

         if ($$1.a(axb.a) && !this.a(bwc.f).f()) {
            this.d($$1, $$2);
            $$2 *= 0.75F;
         }

         if (Float.isNaN($$2) || Float.isInfinite($$2)) {
            $$2 = Float.MAX_VALUE;
         }

         boolean $$8 = true;
         if ((float)this.aj > 10.0F && !$$1.a(axb.e)) {
            if ($$2 <= this.bd) {
               return false;
            }

            this.b($$0, $$1, $$2 - this.bd);
            this.bd = $$2;
            $$8 = false;
         } else {
            this.bd = $$2;
            this.aj = 20;
            this.b($$0, $$1, $$2);
            this.aN = 10;
            this.aM = this.aN;
         }

         this.f($$1);
         this.g($$1);
         if ($$8) {
            if ($$4) {
               $$0.a(this, (byte)29);
            } else {
               $$0.a(this, $$1);
            }

            if (!$$1.a(axb.r) && (!$$4 || $$2 > 0.0F)) {
               this.bC();
            }

            if (!$$1.a(axb.z)) {
               double $$9 = 0.0;
               double $$10 = 0.0;
               if ($$1.c() instanceof crb $$11) {
                  DoubleDoubleImmutablePair $$12 = $$11.a_(this, $$1);
                  $$9 = -$$12.leftDouble();
                  $$10 = -$$12.rightDouble();
               } else if ($$1.i() != null) {
                  $$9 = $$1.i().a() - this.dA();
                  $$10 = $$1.i().c() - this.dG();
               }

               this.p(0.4F, $$9, $$10);
               if (!$$4) {
                  this.a($$9, $$10);
               }
            }
         }

         if (this.eG()) {
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
            this.bS = $$1;
            this.bT = this.dV().ae();

            for (buw $$14 : this.eC()) {
               $$14.a($$0, this, $$1, $$2);
            }
         }

         if (this instanceof aro $$15) {
            ap.i.a($$15, $$1, $$3, $$2, $$4);
            if ($$5 > 0.0F && $$5 < 3.4028235E37F) {
               $$15.a(awu.K, Math.round($$5 * 10.0F));
            }
         }

         if ($$1.d() instanceof aro $$16) {
            ap.h.a($$16, this, $$1, $$3, $$2, $$4);
         }

         return $$13;
      }
   }

   private void j(buh $$0) {
      if ($$0.a(buk.P)) {
         awl $$1 = this instanceof cqi ? awl.h : awl.f;
         this.dV().a(null, this.dt().d, this.dt().e, this.dt().f, awk.Av, $$1);
      }
   }

   protected void f(buh $$0) {
      if ($$0.d() instanceof bwr $$1 && !$$0.a(axb.q) && (!$$0.a(buk.I) || !this.aq().a(axd.E))) {
         this.a($$1);
      }
   }

   @Nullable
   protected cqi g(buh $$0) {
      bvs $$1 = $$0.d();
      if ($$1 instanceof cqi $$2) {
         this.a($$2, 100);
      } else if ($$1 instanceof cjm $$3 && $$3.q()) {
         if ($$3.d() != null) {
            this.a($$3.d().c(), 100);
         } else {
            this.aZ = null;
            this.ba = 0;
         }
      }

      return bvy.a(this.aZ, this.dV(), cqi.class);
   }

   protected void d(bwr $$0) {
      $$0.e(this);
   }

   protected void e(bwr $$0) {
      $$0.p(0.5, $$0.dA() - this.dA(), $$0.dG() - this.dG());
   }

   private boolean k(buh $$0) {
      if ($$0.a(axb.d)) {
         return false;
      } else {
         cxy $$1 = null;
         dah $$2 = null;

         for (btp $$3 : btp.values()) {
            cxy $$4 = this.b($$3);
            $$2 = $$4.a(kx.I);
            if ($$2 != null) {
               $$1 = $$4.v();
               $$4.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof aro $$5) {
               $$5.b(awu.c.b($$1.h()));
               ap.C.a($$5, $$1);
               this.a(edm.C);
            }

            this.d(1.0F);
            $$2.a($$1, this);
            this.dV().a(this, (byte)35);
         }

         return $$2 != null;
      }
   }

   @Nullable
   public buh eH() {
      if (this.dV().ae() - this.bT > 40L) {
         this.bS = null;
      }

      return this.bS;
   }

   protected void h(buh $$0) {
      this.b(this.e($$0));
   }

   public void b(@Nullable awj $$0) {
      if ($$0 != null) {
         this.a($$0, this.fd(), this.fe());
      }
   }

   public boolean i(buh $$0) {
      bvs $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cqp $$3 && $$3.u() > 0) {
         $$2 = true;
      }

      cxy $$4 = this.fG();
      if (!$$0.a(axb.c) && $$4 != null && $$4.h() instanceof cyy && !$$2) {
         fcu $$5 = $$0.i();
         if ($$5 != null) {
            fcu $$6 = this.d(0.0F, this.cA());
            fcu $$7 = $$5.a(this.dt());
            $$7 = new fcu($$7.d, 0.0, $$7.f).d();
            return $$7.b($$6) < 0.0;
         }
      }

      return false;
   }

   private void h(cxy $$0) {
      if (!$$0.f()) {
         if (!this.bb()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), $$0.N(), this.dm(), 0.8F, 0.8F + this.dV().A.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(buh $$0) {
      if (!this.dQ() && !this.bb) {
         bvs $$1 = $$0.d();
         bwr $$2 = this.eS();
         if ($$2 != null) {
            $$2.a(this, $$0);
         }

         if (this.fQ()) {
            this.fR();
         }

         if (!this.dV().C && this.h_()) {
            a.info("Named entity {} died: {}", this, this.eR().a().getString());
         }

         this.bb = true;
         this.eR().c();
         if (this.dV() instanceof arn $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(edm.p);
               this.b($$3, $$0);
               this.f($$2);
            }

            this.dV().a(this, (byte)3);
         }

         this.b(bxd.h);
      }
   }

   protected void f(@Nullable bwr $$0) {
      if (this.dV() instanceof arn $$1) {
         boolean var6 = false;
         if ($$0 instanceof cma) {
            if ($$1.O().c(dhl.c)) {
               jj $$4 = this.dv();
               dym $$5 = dkw.ck.m();
               if (this.dV().a_($$4).l() && $$5.a((dhs)this.dV(), $$4)) {
                  this.dV().a($$4, $$5, 3);
                  var6 = true;
               }
            }

            if (!var6) {
               cmn $$6 = new cmn(this.dV(), this.dA(), this.dC(), this.dG(), new cxy(cyc.dF));
               this.dV().b($$6);
            }
         }
      }
   }

   protected void b(arn $$0, buh $$1) {
      boolean $$2 = this.ba > 0;
      if (this.eo() && $$0.O().c(dhl.f)) {
         this.b($$0, $$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.f($$0);
      this.b($$0, $$1.d());
   }

   protected void f(arn $$0) {
   }

   protected void b(arn $$0, @Nullable bvs $$1) {
      if (!this.eK() && (this.ep() || this.ba > 0 && this.en() && $$0.O().c(dhl.f))) {
         bwg.a($$0, this.dt(), this.a($$0, $$1));
      }
   }

   protected void a(arn $$0, buh $$1, boolean $$2) {
   }

   public long eI() {
      return 0L;
   }

   protected float b(bvs $$0, buh $$1) {
      float $$2 = (float)this.h(bxx.d);
      return this.dV() instanceof arn $$3 ? dej.d($$3, this.dZ(), $$0, $$1, $$2) : $$2;
   }

   protected void b(arn $$0, buh $$1, boolean $$2) {
      Optional<alc<exq>> $$3 = this.ea();
      if (!$$3.isEmpty()) {
         exq $$4 = $$0.p().bc().b($$3.get());
         exo.a $$5 = new exo.a($$0).a(faf.a, this).a(faf.f, this.dt()).a(faf.c, $$1).b(faf.d, $$1.d()).b(faf.e, $$1.c());
         cqi $$6 = this.er();
         if ($$2 && $$6 != null) {
            $$5 = $$5.a(faf.b, $$6).a($$6.eg());
         }

         exo $$7 = $$5.a(fae.g);
         $$4.a($$7, this.eI(), $$1x -> this.a($$0, $$1x));
      }
   }

   public boolean a(arn $$0, alc<exq> $$1, BiConsumer<arn, cxy> $$2) {
      return this.a($$0, $$1, $$0x -> $$0x.a(faf.f, this.dt()).a(faf.a, this).a(fae.j), $$2);
   }

   protected void a(arn $$0, alc<exq> $$1, cxy $$2, BiConsumer<arn, cxy> $$3) {
      this.a($$0, $$1, $$1x -> $$1x.a(faf.f, this.dt()).a(faf.a, this).a(faf.i, $$2).a(fae.s), $$3);
   }

   protected boolean a(arn $$0, alc<exq> $$1, Function<exo.a, exo> $$2, BiConsumer<arn, cxy> $$3) {
      exq $$4 = $$0.p().bc().b($$1);
      exo $$5 = $$2.apply(new exo.a($$0));
      List<cxy> $$6 = $$4.a($$5);
      if (!$$6.isEmpty()) {
         $$6.forEach($$2x -> $$3.accept($$0, $$2x));
         return true;
      } else {
         return false;
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(bxx.p);
      if (!($$0 <= 0.0)) {
         this.ar = true;
         fcu $$3 = this.dy();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         fcu $$4 = new fcu($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aJ() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected awj e(buh $$0) {
      return awk.kG;
   }

   @Nullable
   protected awj l_() {
      return awk.kB;
   }

   private awj q(int $$0) {
      return $$0 > 4 ? this.eN().b() : this.eN().a();
   }

   public void eJ() {
      this.bW = true;
   }

   public boolean eK() {
      return this.bW;
   }

   public float eL() {
      return 0.0F;
   }

   protected fcp eM() {
      fcp $$0 = this.cR();
      bvs $$1 = this.dk();
      if ($$1 != null) {
         fcu $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<deh, Set<dez>> c(bwc $$0) {
      return (Map<deh, Set<dez>>)this.bX.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public bwr.a eN() {
      return new bwr.a(awk.kH, awk.kz);
   }

   public Optional<jj> eO() {
      return this.bR;
   }

   public boolean d_() {
      if (this.U_()) {
         return false;
      } else {
         jj $$0 = this.dv();
         dym $$1 = this.dw();
         if ($$1.a(awz.aS)) {
            this.bR = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dtp && this.c($$0, $$1)) {
            this.bR = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(jj $$0, dym $$1) {
      if (!$$1.c(dtp.b)) {
         return false;
      } else {
         dym $$2 = this.dV().a_($$0.e());
         return $$2.a(dkw.cX) && $$2.c(dpd.b) == $$1.c(dtp.e);
      }
   }

   @Override
   public boolean bK() {
      return !this.dQ() && this.eF() > 0.0F;
   }

   public boolean a(bwr $$0, double $$1, boolean $$2, boolean $$3, double... $$4) {
      fcu $$5 = $$0.h(1.0F).d();

      for (double $$6 : $$4) {
         fcu $$7 = new fcu(this.dA() - $$0.dA(), $$6 - $$0.dE(), this.dG() - $$0.dG());
         double $$8 = $$7.g();
         $$7 = $$7.d();
         double $$9 = $$5.b($$7);
         if ($$9 > 1.0 - $$1 / ($$2 ? $$8 : 1.0) && $$0.a(this, $$3 ? dgy.a.c : dgy.a.a, dgy.b.a, $$6)) {
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
      return azk.d($$0 + 3.0F);
   }

   @Override
   public boolean a(double $$0, float $$1, buh $$2) {
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
      if (this.aq().a(axd.o)) {
         return 0;
      } else {
         double $$2 = this.h($$0);
         return azk.a($$2 * (double)$$1 * this.h(bxx.k));
      }
   }

   private double h(double $$0) {
      return $$0 + 1.0E-6 - this.h(bxx.x);
   }

   protected void eP() {
      if (!this.bb()) {
         int $$0 = azk.a(this.dA());
         int $$1 = azk.a(this.dC() - 0.2F);
         int $$2 = azk.a(this.dG());
         dym $$3 = this.dV().a_(new jj($$0, $$1, $$2));
         if (!$$3.l()) {
            dsn $$4 = $$3.A();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void q(float $$0) {
      this.aN = 10;
      this.aM = this.aN;
   }

   public int eQ() {
      return azk.a(this.h(bxx.a));
   }

   protected void c(buh $$0, float $$1) {
   }

   protected void d(buh $$0, float $$1) {
   }

   protected void z(float $$0) {
   }

   protected void a(buh $$0, float $$1, bwc... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bwc $$4 : $$2) {
            cxy $$5 = this.a($$4);
            dgc $$6 = $$5.a(kx.E);
            if ($$6 != null && $$6.i() && $$5.m() && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float e(buh $$0, float $$1) {
      if (!$$0.a(axb.b)) {
         this.c($$0, $$1);
         $$1 = bud.a(this, $$1, $$0, (float)this.eQ(), (float)this.h(bxx.b));
      }

      return $$1;
   }

   protected float f(buh $$0, float $$1) {
      if ($$0.a(axb.f)) {
         return $$1;
      } else {
         if (this.b(buy.k) && !$$0.a(axb.g)) {
            int $$2 = (this.c(buy.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof aro) {
                  ((aro)this).a(awu.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof aro) {
                  ((aro)$$0.d()).a(awu.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(axb.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dV() instanceof arn $$7) {
               $$8 = dej.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = bud.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void b(arn $$0, buh $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var10 = Math.max($$2 - this.fv(), 0.0F);
         this.F(this.fv() - ($$2 - var10));
         float $$4 = $$2 - var10;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F && $$1.d() instanceof aro $$5) {
            $$5.a(awu.H, Math.round($$4 * 10.0F));
         }

         if (var10 != 0.0F) {
            this.eR().a($$1, var10);
            this.d(this.eF() - var10);
            this.F(this.fv() - var10);
            this.a(edm.o);
         }
      }
   }

   public bue eR() {
      return this.bE;
   }

   @Nullable
   public bwr eS() {
      if (this.aZ != null) {
         return this.aZ.a(this.dV(), cqi.class);
      } else {
         return this.bJ != null ? this.bJ.a(this.dV(), bwr.class) : null;
      }
   }

   public final float eT() {
      return (float)this.h(bxx.s);
   }

   public final float eU() {
      return (float)this.h(bxx.r);
   }

   public final int eV() {
      return this.al.a(bz);
   }

   public final void o(int $$0) {
      this.al.a(bz, $$0);
   }

   public final int eW() {
      return this.al.a(bA);
   }

   public final void p(int $$0) {
      this.al.a(bA, $$0);
   }

   private int D() {
      if (bux.a(this)) {
         return 6 - (1 + bux.b(this));
      } else {
         return this.b(buy.d) ? 6 + (1 + this.c(buy.d).e()) * 2 : 6;
      }
   }

   public void a(btp $$0) {
      this.a($$0, false);
   }

   public void a(btp $$0, boolean $$1) {
      if (!this.aH || this.aJ >= this.D() / 2 || this.aJ < 0) {
         this.aJ = -1;
         this.aH = true;
         this.aI = $$0;
         if (this.dV() instanceof arn) {
            abt $$2 = new abt(this, $$0 == btp.a ? 0 : 3);
            ark $$3 = ((arn)this.dV()).m();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(buh $$0) {
      this.aS.a(1.5F);
      this.aj = 20;
      this.aN = 10;
      this.aM = this.aN;
      awj $$1 = this.e($$0);
      if ($$1 != null) {
         this.a($$1, this.fd(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }

      this.bS = $$0;
      this.bT = this.dV().ae();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            awj $$1 = this.l_();
            if ($$1 != null) {
               this.a($$1, this.fd(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cqi)) {
               this.d(0.0F);
               this.a(this.dW().p());
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
            this.a(awk.xn, 1.0F, 0.8F + this.dV().A.i() * 0.4F);
            break;
         case 30:
            this.a(awk.xo, 0.8F, 0.8F + this.dV().A.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ae.i() - 0.5F) * 0.2F;
               float $$6 = (this.ae.i() - 0.5F) * 0.2F;
               float $$7 = (this.ae.i() - 0.5F) * 0.2F;
               double $$8 = azk.d($$4, this.K, this.dA()) + (this.ae.j() - 0.5) * (double)this.dq() * 2.0;
               double $$9 = azk.d($$4, this.L, this.dC()) + this.ae.j() * (double)this.dr();
               double $$10 = azk.d($$4, this.M, this.dG()) + (this.ae.j() - 0.5) * (double)this.dq() * 2.0;
               this.dV().a(lv.af, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.h(this.a(bwc.a));
            break;
         case 48:
            this.h(this.a(bwc.b));
            break;
         case 49:
            this.h(this.a(bwc.f));
            break;
         case 50:
            this.h(this.a(bwc.e));
            break;
         case 51:
            this.h(this.a(bwc.d));
            break;
         case 52:
            this.h(this.a(bwc.c));
            break;
         case 54:
            dor.b(this);
            break;
         case 55:
            this.F();
            break;
         case 60:
            this.eX();
            break;
         case 65:
            this.h(this.a(bwc.g));
            break;
         case 67:
            this.E();
            break;
         case 68:
            this.h(this.a(bwc.h));
      }
   }

   public void eX() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.ae.k() * 0.02;
         double $$2 = this.ae.k() * 0.02;
         double $$3 = this.ae.k() * 0.02;
         double $$4 = 10.0;
         this.dV().a(lv.ae, this.d(1.0) - $$1 * 10.0, this.dD() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
      }
   }

   private void E() {
      fcu $$0 = this.dy();

      for (int $$1 = 0; $$1 < 8; $$1++) {
         double $$2 = this.ae.a(0.0, 1.0);
         double $$3 = this.ae.a(0.0, 1.0);
         double $$4 = this.ae.a(0.0, 1.0);
         this.dV().a(lv.d, this.dA() + $$2, this.dC() + $$3, this.dG() + $$4, $$0.d, $$0.e, $$0.f);
      }
   }

   private void F() {
      cxy $$0 = this.a(bwc.b);
      this.a(bwc.b, this.a(bwc.a));
      this.a(bwc.a, $$0);
   }

   @Override
   protected void aI() {
      this.a(this.dW().o(), 4.0F);
   }

   protected void eY() {
      int $$0 = this.D();
      if (this.aH) {
         this.aJ++;
         if (this.aJ >= $$0) {
            this.aJ = 0;
            this.aH = false;
         }
      } else {
         this.aJ = 0;
      }

      this.aQ = (float)this.aJ / (float)$$0;
   }

   @Nullable
   public bxt g(js<bxs> $$0) {
      return this.eZ().a($$0);
   }

   public double h(js<bxs> $$0) {
      return this.eZ().c($$0);
   }

   public double i(js<bxs> $$0) {
      return this.eZ().d($$0);
   }

   public bxu eZ() {
      return this.bD;
   }

   public cxy fa() {
      return this.a(bwc.a);
   }

   public cxy fb() {
      return this.a(bwc.b);
   }

   public cxy a(bwk $$0) {
      return this.fx() == $$0 ? this.fa() : this.fb();
   }

   @Nonnull
   @Override
   public cxy dZ() {
      return this.fa();
   }

   public boolean b(cxu $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cxy> $$0) {
      return $$0.test(this.fa()) || $$0.test(this.fb());
   }

   public cxy b(btp $$0) {
      if ($$0 == btp.a) {
         return this.a(bwc.a);
      } else if ($$0 == btp.b) {
         return this.a(bwc.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(btp $$0, cxy $$1) {
      if ($$0 == btp.a) {
         this.a(bwc.a, $$1);
      } else {
         if ($$0 != btp.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bwc.b, $$1);
      }
   }

   public boolean d(bwc $$0) {
      return !this.a($$0).f();
   }

   public boolean e(bwc $$0) {
      return true;
   }

   public abstract cxy a(bwc var1);

   public abstract void a(bwc var1, cxy var2);

   protected void d(cxy $$0) {
      $$0.h().l($$0);
   }

   public float fc() {
      int $$0 = 0;
      int $$1 = 0;

      for (bwc $$2 : bwd.i) {
         if ($$2.a() == bwc.a.b) {
            cxy $$3 = this.a($$2);
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
      bxt $$1 = this.g(bxx.v);
      $$1.c(k.b());
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
   public void h(bvs $$0) {
      if (!this.fQ()) {
         super.h($$0);
      }
   }

   private void c(bvs $$0) {
      fcu $$1;
      if (this.dQ()) {
         $$1 = this.dt();
      } else if (!$$0.dQ() && !this.dV().a_($$0.dv()).a(awz.aM)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dC(), $$0.dC());
         $$1 = new fcu(this.dA(), $$2, this.dG());
         boolean $$4 = this.dq() <= 4.0F && this.dr() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.dr() / 2.0;
            fcu $$6 = $$1.b(0.0, $$5, 0.0);
            fdo $$7 = fdl.a(fcp.a($$6, (double)this.dq(), (double)this.dr(), (double)this.dq()));
            $$1 = this.dV().a(this, $$7, $$6, (double)this.dq(), (double)this.dr(), (double)this.dq()).map($$1x -> $$1x.b(0.0, -$$5, 0.0)).orElse($$1);
         }
      }

      this.a($$1.d, $$1.e, $$1.f);
   }

   @Override
   public boolean cM() {
      return this.cL();
   }

   protected float fg() {
      return this.A(1.0F);
   }

   protected float A(float $$0) {
      return (float)this.h(bxx.o) * $$0 * this.aS() + this.fh();
   }

   public float fh() {
      return this.b(buy.h) ? 0.1F * ((float)this.c(buy.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void s() {
      float $$0 = this.fg();
      if (!($$0 <= 1.0E-5F)) {
         fcu $$1 = this.dy();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.cj()) {
            float $$2 = this.dL() * (float) (Math.PI / 180.0);
            this.j(new fcu((double)(-azk.a($$2)) * 0.2, 0.0, (double)azk.b($$2) * 0.2));
         }

         this.ar = true;
      }
   }

   protected void fi() {
      this.i(this.dy().b(0.0, -0.04F, 0.0));
   }

   protected void c(axp<eus> $$0) {
      this.i(this.dy().b(0.0, 0.04F, 0.0));
   }

   protected float fj() {
      return 0.8F;
   }

   public boolean a(eut $$0) {
      return false;
   }

   @Override
   protected double bd() {
      return this.h(bxx.n);
   }

   protected double fk() {
      boolean $$0 = this.dy().e <= 0.0;
      return $$0 && this.b(buy.B) ? Math.min(this.be(), 0.01) : this.be();
   }

   public void a_(fcu $$0) {
      eut $$1 = this.dV().b_(this.dv());
      if ((this.bj() || this.bw()) && this.el() && !this.a($$1)) {
         this.m($$0);
      } else if (this.fI()) {
         this.n($$0);
      } else {
         this.l($$0);
      }
   }

   private void l(fcu $$0) {
      jj $$1 = this.aQ();
      float $$2 = this.aJ() ? this.dV().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      fcu $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      buw $$6 = this.c(buy.y);
      if ($$6 != null) {
         $$5 += (0.05 * (double)($$6.e() + 1) - $$4.e) * 0.2;
      } else if (!this.dV().C || this.dV().B($$1)) {
         $$5 -= this.fk();
      } else if (this.dC() > (double)this.dV().G_()) {
         $$5 = -0.1;
      } else {
         $$5 = 0.0;
      }

      if (this.ew()) {
         this.n($$4.d, $$5, $$4.f);
      } else {
         float $$7 = this instanceof cip ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void m(fcu $$0) {
      boolean $$1 = this.dy().e <= 0.0;
      double $$2 = this.dC();
      double $$3 = this.fk();
      if (this.bj()) {
         float $$4 = this.cj() ? 0.9F : this.fj();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(bxx.F);
         if (!this.aJ()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fn() - $$5) * $$6;
         }

         if (this.b(buy.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(bwv.a, this.dy());
         fcu $$7 = this.dy();
         if (this.P && this.d_()) {
            $$7 = new fcu($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.i(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(bwv.a, this.dy());
         if (this.b(axf.b) <= this.dp()) {
            this.i(this.dy().d(0.5, 0.8F, 0.5));
            fcu $$8 = this.a($$3, $$1, this.dy());
            this.i($$8);
         } else {
            this.i(this.dy().c(0.5));
         }

         if ($$3 != 0.0) {
            this.i(this.dy().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      fcu $$9 = this.dy();
      if (this.P && this.g($$9.d, $$9.e + 0.6F - this.dC() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void n(fcu $$0) {
      if (this.d_()) {
         this.l($$0);
         this.fl();
      } else {
         fcu $$1 = this.dy();
         double $$2 = $$1.i();
         this.i(this.o($$1));
         this.a(bwv.a, this.dy());
         if (!this.dV().C) {
            double $$3 = this.dy().i();
            this.c($$2, $$3);
         }
      }
   }

   public void fl() {
      this.b(7, true);
      this.b(7, false);
   }

   private fcu o(fcu $$0) {
      fcu $$1 = this.bT();
      float $$2 = this.dN() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fk();
      double $$6 = azk.k(Math.cos((double)$$2));
      $$0 = $$0.b(0.0, $$5 * (-1.0 + $$6 * 0.75), 0.0);
      if ($$0.e < 0.0 && $$3 > 0.0) {
         double $$7 = $$0.e * -0.1 * $$6;
         $$0 = $$0.b($$1.d * $$7 / $$3, $$7, $$1.f * $$7 / $$3);
      }

      if ($$2 < 0.0F && $$3 > 0.0) {
         double $$8 = $$4 * (double)(-azk.a($$2)) * 0.04;
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

   private void c(cqi $$0, fcu $$1) {
      fcu $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.di()) {
         this.C(this.c($$0));
         this.a_($$2);
      } else {
         this.i(fcu.c);
      }
   }

   protected void a(cqi $$0, fcu $$1) {
   }

   protected fcu b(cqi $$0, fcu $$1) {
      return $$1;
   }

   protected float c(cqi $$0) {
      return this.fn();
   }

   public void r(boolean $$0) {
      float $$1 = (float)azk.g(this.dA() - this.K, $$0 ? this.dC() - this.L : 0.0, this.dG() - this.M);
      if (!this.bZ() && this.bK()) {
         this.B($$1);
      } else {
         this.aS.a();
      }
   }

   protected void B(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aS.a($$1, 0.4F, this.n_() ? 3.0F : 1.0F);
   }

   private fcu a(fcu $$0, float $$1) {
      this.a(this.H($$1), $$0);
      this.i(this.p(this.dy()));
      this.a(bwv.a, this.dy());
      fcu $$2 = this.dy();
      if ((this.P || this.be) && (this.d_() || this.dw().a(dkw.rt) && dqt.a(this))) {
         $$2 = new fcu($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public fcu a(double $$0, boolean $$1, fcu $$2) {
      if ($$0 != 0.0 && !this.cj()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new fcu($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private fcu p(fcu $$0) {
      if (this.d_()) {
         this.k();
         float $$1 = 0.15F;
         double $$2 = azk.a($$0.d, -0.15F, 0.15F);
         double $$3 = azk.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dw().a(dkw.ou) && this.fH() && this instanceof cqi) {
            $$4 = 0.0;
         }

         $$0 = new fcu($$2, $$4, $$3);
      }

      return $$0;
   }

   private float H(float $$0) {
      return this.aJ() ? this.fn() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fm();
   }

   protected float fm() {
      return this.cW() instanceof cqi ? this.fn() * 0.1F : 0.02F;
   }

   public float fn() {
      return this.bN;
   }

   public void C(float $$0) {
      this.bN = $$0;
   }

   public boolean c(arn $$0, bvs $$1) {
      this.B($$1);
      return false;
   }

   @Override
   public void h() {
      super.h();
      this.I();
      this.J();
      if (!this.dV().C) {
         int $$0 = this.eV();
         if ($$0 > 0) {
            if (this.aK <= 0) {
               this.aK = 20 * (30 - $$0);
            }

            this.aK--;
            if (this.aK <= 0) {
               this.o($$0 - 1);
            }
         }

         int $$1 = this.eW();
         if ($$1 > 0) {
            if (this.aL <= 0) {
               this.aL = 20 * (30 - $$1);
            }

            this.aL--;
            if (this.aL <= 0) {
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

      if (!this.dQ()) {
         this.k_();
      }

      double $$2 = this.dA() - this.K;
      double $$3 = this.dG() - this.M;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aU;
      if ($$4 > 0.0025000002F) {
         float $$6 = (float)azk.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$7 = azk.e(azk.h(this.dL()) - $$6);
         if (95.0F < $$7 && $$7 < 265.0F) {
            $$5 = $$6 - 180.0F;
         } else {
            $$5 = $$6;
         }
      }

      if (this.aQ > 0.0F) {
         $$5 = this.dL();
      }

      bqb $$8 = bqa.a();
      $$8.a("headTurn");
      this.D($$5);
      $$8.c();
      $$8.a("rangeChecks");

      while (this.dL() - this.N < -180.0F) {
         this.N -= 360.0F;
      }

      while (this.dL() - this.N >= 180.0F) {
         this.N += 360.0F;
      }

      while (this.aU - this.aV < -180.0F) {
         this.aV -= 360.0F;
      }

      while (this.aU - this.aV >= 180.0F) {
         this.aV += 360.0F;
      }

      while (this.dN() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dN() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aW - this.aX < -180.0F) {
         this.aX -= 360.0F;
      }

      while (this.aW - this.aX >= 180.0F) {
         this.aX += 360.0F;
      }

      $$8.c();
      if (this.fI()) {
         this.bn++;
      } else {
         this.bn = 0;
      }

      if (this.fQ()) {
         this.x(0.0F);
      }

      this.u();
      this.aY.a();
   }

   private void G() {
      Map<bwc, cxy> $$0 = this.H();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bwc, cxy> H() {
      Map<bwc, cxy> $$0 = null;

      for (bwc $$1 : bwc.j) {
         cxy $$2 = this.bG.get($$1);
         cxy $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bwc.class);
            }

            $$0.put($$1, $$3);
            bxu $$4 = this.eZ();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<bwc, cxy> $$5 : $$0.entrySet()) {
            bwc $$6 = $$5.getKey();
            cxy $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1x) -> {
                  bxt $$2 = this.bD.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1x.b());
                     $$2.b($$1x);
                  }
               });
               if (this.dV() instanceof arn $$8) {
                  dej.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(cxy $$0, cxy $$1) {
      return !cxy.a($$1, $$0);
   }

   private void a(Map<bwc, cxy> $$0) {
      cxy $$1 = $$0.get(bwc.a);
      cxy $$2 = $$0.get(bwc.b);
      if ($$1 != null && $$2 != null && cxy.a($$1, this.bG.get(bwc.b)) && cxy.a($$2, this.bG.get(bwc.a))) {
         ((arn)this.dV()).m().b(this, new acu(this, (byte)55));
         $$0.remove(bwc.a);
         $$0.remove(bwc.b);
         this.bG.put(bwc.a, $$1.v());
         this.bG.put(bwc.b, $$2.v());
      }
   }

   private void b(Map<bwc, cxy> $$0) {
      List<Pair<bwc, cxy>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cxy $$3 = $$2.v();
         $$1.add(Pair.of($$1x, $$3));
         this.bG.put($$1x, $$3);
      });
      ((arn)this.dV()).m().b(this, new afd(this.ar(), $$1));
   }

   protected void D(float $$0) {
      float $$1 = azk.h($$0 - this.aU);
      this.aU += $$1 * 0.3F;
      float $$2 = azk.h(this.dL() - this.aU);
      float $$3 = this.fo();
      if (Math.abs($$2) > $$3) {
         this.aU = this.aU + ($$2 - (float)azk.j((double)$$2) * $$3);
      }
   }

   protected float fo() {
      return 50.0F;
   }

   public void k_() {
      if (this.bO > 0) {
         this.bO--;
      }

      if (this.bR()) {
         this.N_().e();
      } else if (!this.di()) {
         this.i(this.dy().c(0.98));
      }

      if (this.bk > 0) {
         this.a(this.bk, this.bj);
         this.bk--;
      }

      fcu $$0 = this.dy();
      double $$1 = $$0.d;
      double $$2 = $$0.e;
      double $$3 = $$0.f;
      if (this.aq().equals(bwb.bR)) {
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
      bqb $$4 = bqa.a();
      $$4.a("ai");
      if (this.ff()) {
         this.be = false;
         this.bf = 0.0F;
         this.bh = 0.0F;
      } else if (this.dj()) {
         this.fp();
         if (!this.dV().C) {
            $$4.a("newAi");
            this.ft();
            $$4.c();
         }
      }

      $$4.c();
      $$4.a("jump");
      if (this.be && this.el()) {
         double $$5;
         if (this.bw()) {
            $$5 = this.b(axf.b);
         } else {
            $$5 = this.b(axf.a);
         }

         boolean $$7 = this.bj() && $$5 > 0.0;
         double $$8 = this.dp();
         if (!$$7 || this.aJ() && !($$5 > $$8)) {
            if (!this.bw() || this.aJ() && !($$5 > $$8)) {
               if ((this.aJ() || $$7 && $$5 <= $$8) && this.bO == 0) {
                  this.s();
                  this.bO = 10;
               }
            } else {
               this.c(axf.b);
            }
         } else {
            this.c(axf.a);
         }
      } else {
         this.bO = 0;
      }

      $$4.c();
      $$4.a("travel");
      this.bf *= 0.98F;
      this.bh *= 0.98F;
      if (this.fI()) {
         this.fr();
      }

      fcp $$9 = this.cR();
      fcu $$10 = new fcu((double)this.bf, (double)this.bg, (double)this.bh);
      if (this.b(buy.B) || this.b(buy.y)) {
         this.k();
      }

      label126: {
         if (this.cW() instanceof cqi $$11 && this.bK()) {
            this.c($$11, $$10);
            break label126;
         }

         if (this.di()) {
            this.a_($$10);
         }
      }

      if (!this.dV().w_() || this.dg()) {
         this.aK();
      }

      if (this.dV().w_()) {
         this.r(this instanceof cip);
      }

      $$4.c();
      if (this.dV() instanceof arn $$12) {
         $$4.a("freezing");
         if (!this.eG()) {
            int $$13 = this.cu();
            if (this.av && this.dJ()) {
               this.k(Math.min(this.cx(), $$13 + 1));
            } else {
               this.k(Math.max(0, $$13 - 2));
            }
         }

         this.eh();
         this.ei();
         if (this.af % 40 == 0 && this.cw() && this.dJ()) {
            this.a($$12, this.dW().v(), 1.0F);
         }

         $$4.c();
      }

      $$4.a("push");
      if (this.bo > 0) {
         this.bo--;
         this.a($$9, this.cR());
      }

      this.o();
      $$4.c();
      if (this.dV() instanceof arn $$14 && this.fq() && this.bl()) {
         this.a($$14, this.dW().i(), 1.0F);
      }
   }

   protected void fp() {
   }

   public boolean fq() {
      return false;
   }

   protected void fr() {
      this.cy();
      if (!this.dV().C) {
         if (!this.fs()) {
            this.b(7, false);
            return;
         }

         int $$0 = this.bn + 1;
         if ($$0 % 10 == 0) {
            int $$1 = $$0 / 10;
            if ($$1 % 2 == 0) {
               List<bwc> $$2 = bwc.j.stream().filter($$0x -> b(this.a($$0x), $$0x)).toList();
               bwc $$3 = af.a($$2, this.ae);
               this.a($$3).a(1, this, $$3);
            }

            this.a(edm.n);
         }
      }
   }

   protected boolean fs() {
      if (!this.aJ() && !this.bZ() && !this.b(buy.y)) {
         for (bwc $$0 : bwc.j) {
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
      List<bvs> $$0 = this.dV().i(this, this.cR());
      if (!$$0.isEmpty()) {
         if (this.dV() instanceof arn $$1) {
            int $$2 = $$1.O().d(dhl.v);
            if ($$2 > 0 && $$0.size() > $$2 - 1 && this.ae.a(4) == 0) {
               int $$3 = 0;

               for (bvs $$4 : $$0) {
                  if (!$$4.bZ()) {
                     $$3++;
                  }
               }

               if ($$3 > $$2 - 1) {
                  this.a($$1, this.dW().h(), 6.0F);
               }
            }
         }

         for (bvs $$5 : $$0) {
            this.D($$5);
         }
      }
   }

   protected void a(fcp $$0, fcp $$1) {
      fcp $$2 = $$0.b($$1);
      List<bvs> $$3 = this.dV().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bvs $$4 : $$3) {
            if ($$4 instanceof bwr) {
               this.g((bwr)$$4);
               this.bo = 0;
               this.i(this.dy().c(-0.2));
               break;
            }
         }
      } else if (this.P) {
         this.bo = 0;
      }

      if (!this.dV().C && this.bo <= 0) {
         this.c(4, false);
         this.bp = 0.0F;
         this.bq = null;
      }
   }

   protected void D(bvs $$0) {
      $$0.h(this);
   }

   protected void g(bwr $$0) {
   }

   public boolean fu() {
      return (this.al.a(aB) & 4) != 0;
   }

   @Override
   public void bP() {
      bvs $$0 = this.dk();
      super.bP();
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
   public bwm N_() {
      return this.bi;
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bj = (double)$$0;
      this.bk = $$1;
   }

   public void s(boolean $$0) {
      this.be = $$0;
   }

   public void a(cmn $$0) {
      bvs $$1 = $$0.q();
      if ($$1 instanceof aro) {
         ap.R.a((aro)$$1, $$0.f(), this);
      }
   }

   public void a(bvs $$0, int $$1) {
      if (!$$0.dQ() && !this.dV().C && ($$0 instanceof cmn || $$0 instanceof cqp || $$0 instanceof bwg)) {
         ((arn)this.dV()).m().b($$0, new afy($$0.ar(), this.ar(), $$1));
      }
   }

   public boolean E(bvs $$0) {
      return this.a($$0, dgy.a.a, dgy.b.a, $$0.dE());
   }

   public boolean a(bvs $$0, dgy.a $$1, dgy.b $$2, double $$3) {
      if ($$0.dV() != this.dV()) {
         return false;
      } else {
         fcu $$4 = new fcu(this.dA(), this.dE(), this.dG());
         fcu $$5 = new fcu($$0.dA(), $$3, $$0.dG());
         return $$5.f($$4) > 128.0 ? false : this.dV().a(new dgy($$4, $$5, $$1, $$2, this)).d() == fcs.a.a;
      }
   }

   @Override
   public float j(float $$0) {
      return $$0 == 1.0F ? this.aW : azk.i($$0, this.aX, this.aW);
   }

   public float E(float $$0) {
      float $$1 = this.aQ - this.aP;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aP + $$1 * $$0;
   }

   @Override
   public boolean bG() {
      return !this.dQ();
   }

   @Override
   public boolean bH() {
      return this.bK() && !this.U_() && !this.d_();
   }

   @Override
   public float cA() {
      return this.aW;
   }

   @Override
   public void r(float $$0) {
      this.aW = $$0;
   }

   @Override
   public void s(float $$0) {
      this.aU = $$0;
   }

   @Override
   public fcu a(jo.a $$0, l.a $$1) {
      return k(super.a($$0, $$1));
   }

   public static fcu k(fcu $$0) {
      return new fcu($$0.d, $$0.e, 0.0);
   }

   public float fv() {
      return this.bP;
   }

   public final void F(float $$0) {
      this.G(azk.a($$0, 0.0F, this.eU()));
   }

   protected void G(float $$0) {
      this.bP = $$0;
   }

   public void e_() {
   }

   public void J_() {
   }

   protected void fw() {
      this.bI = true;
   }

   public abstract bwk fx();

   public boolean fy() {
      return (this.al.a(aB) & 1) > 0;
   }

   public btp fz() {
      return (this.al.a(aB) & 2) > 0 ? btp.b : btp.a;
   }

   private void I() {
      if (this.fy()) {
         if (cxy.b(this.b(this.fz()), this.bl)) {
            this.bl = this.b(this.fz());
            this.a(this.bl);
         } else {
            this.fE();
         }
      }
   }

   protected void a(cxy $$0) {
      $$0.b(this.dV(), this, this.fB());
      if (--this.bm == 0 && !this.dV().C && !$$0.x()) {
         this.K_();
      }
   }

   private void J() {
      this.bV = this.bU;
      if (this.cl()) {
         this.bU = Math.min(1.0F, this.bU + 0.09F);
      } else {
         this.bU = Math.max(0.0F, this.bU - 0.09F);
      }
   }

   protected void c(int $$0, boolean $$1) {
      int $$2 = this.al.a(aB);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.al.a(aB, (byte)$$2);
   }

   public void c(btp $$0) {
      cxy $$1 = this.b($$0);
      if (!$$1.f() && !this.fy()) {
         this.bl = $$1;
         this.bm = $$1.a(this);
         if (!this.dV().C) {
            this.c(1, true);
            this.c(2, $$0 == btp.b);
            this.a(edm.D);
         }
      }
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (bB.equals($$0)) {
         if (this.dV().C) {
            this.fO().ifPresent(this::a);
         }
      } else if (aB.equals($$0) && this.dV().C) {
         if (this.fy() && this.bl.f()) {
            this.bl = this.b(this.fz());
            if (!this.bl.f()) {
               this.bm = this.bl.a(this);
            }
         } else if (!this.fy() && !this.bl.f()) {
            this.bl = cxy.k;
            this.bm = 0;
         }
      }
   }

   @Override
   public void a(fj.a $$0, fcu $$1) {
      super.a($$0, $$1);
      this.aX = this.aW;
      this.aU = this.aW;
      this.aV = this.aU;
   }

   @Override
   public float u(float $$0) {
      return azk.h($$0, this.aV, this.aU);
   }

   public void b(cxy $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         fcu $$3 = new fcu(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dN() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dL() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ae.i()) * 0.6 - 0.3;
         fcu $$5 = new fcu(((double)this.ae.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dN() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dL() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dA(), this.dE(), this.dG());
         this.dV().a(new lr(lv.U, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void K_() {
      if (!this.dV().C || this.fy()) {
         btp $$0 = this.fz();
         if (!this.bl.equals(this.b($$0))) {
            this.fD();
         } else {
            if (!this.bl.f() && this.fy()) {
               cxy $$1 = this.bl.a(this.dV(), this);
               if ($$1 != this.bl) {
                  this.a($$0, $$1);
               }

               this.fE();
            }
         }
      }
   }

   public void b(cxy $$0) {
   }

   public cxy fA() {
      return this.bl;
   }

   public int fB() {
      return this.bm;
   }

   public int fC() {
      return this.fy() ? this.bl.a(this) - this.fB() : 0;
   }

   public void fD() {
      if (!this.bl.f()) {
         this.bl.a(this.dV(), this, this.fB());
         if (this.bl.x()) {
            this.I();
         }
      }

      this.fE();
   }

   public void fE() {
      if (!this.dV().C) {
         boolean $$0 = this.fy();
         this.c(1, false);
         if ($$0) {
            this.a(edm.C);
         }
      }

      this.bl = cxy.k;
      this.bm = 0;
   }

   public boolean fF() {
      return this.fG() != null;
   }

   @Nullable
   public cxy fG() {
      if (this.fy() && !this.bl.f()) {
         cxu $$0 = this.bl.h();
         if ($$0.b(this.bl) != cya.d) {
            return null;
         } else {
            return $$0.a(this.bl, this) - this.bm < 5 ? null : this.bl;
         }
      } else {
         return null;
      }
   }

   public boolean fH() {
      return this.cd();
   }

   public boolean fI() {
      return this.i(7);
   }

   @Override
   public boolean cl() {
      return super.cl() || !this.fI() && this.c(bxd.b);
   }

   public int fJ() {
      return this.bn;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dA();
      double $$5 = this.dC();
      double $$6 = this.dG();
      double $$7 = $$1;
      boolean $$8 = false;
      jj $$9 = jj.a($$0, $$1, $$2);
      dhp $$10 = this.dV();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.G_()) {
            jj $$12 = $$9.e();
            dym $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.c($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cR())) {
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

         if (this instanceof bwz $$14) {
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

   public void a(jj $$0, boolean $$1) {
   }

   public boolean fM() {
      return false;
   }

   @Override
   public final bvv a(bxd $$0) {
      return $$0 == bxd.c ? aC : this.e($$0).a(this.ek());
   }

   protected bvv e(bxd $$0) {
      return this.aq().n().a(this.ej());
   }

   public ImmutableList<bxd> fN() {
      return ImmutableList.of(bxd.a);
   }

   public fcp f(bxd $$0) {
      bvv $$1 = this.a($$0);
      return new fcp((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bxd $$0) {
      fcp $$1 = this.a($$0).a(this.dt());
      return this.dV().b(this, $$1);
   }

   @Override
   public boolean n(boolean $$0) {
      return super.n($$0) && !this.fQ();
   }

   public Optional<jj> fO() {
      return this.al.a(bB);
   }

   public void h(jj $$0) {
      this.al.a(bB, Optional.of($$0));
   }

   public void fP() {
      this.al.a(bB, Optional.empty());
   }

   public boolean fQ() {
      return this.fO().isPresent();
   }

   public void b(jj $$0) {
      if (this.bZ()) {
         this.bP();
      }

      dym $$1 = this.dV().a_($$0);
      if ($$1.b() instanceof dkn) {
         this.dV().a($$0, $$1.b(dkn.c, Boolean.valueOf(true)), 3);
      }

      this.b(bxd.c);
      this.a($$0);
      this.h($$0);
      this.i(fcu.c);
      this.ar = true;
   }

   private void a(jj $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean L() {
      return this.fO().map($$0 -> this.dV().a_($$0).b() instanceof dkn).orElse(false);
   }

   public void fR() {
      this.fO().filter(this.dV()::B).ifPresent($$0x -> {
         dym $$1 = this.dV().a_($$0x);
         if ($$1.b() instanceof dkn) {
            jo $$2 = $$1.c(dkn.e);
            this.dV().a($$0x, $$1.b(dkn.c, Boolean.valueOf(false)), 3);
            fcu $$3 = dkn.a(this.aq(), this.dV(), $$0x, $$2, this.dL()).orElseGet(() -> {
               jj $$1x = $$0x.d();
               return new fcu((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            fcu $$4 = fcu.c($$0x).d($$3).d();
            float $$5 = (float)azk.d(azk.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.w($$5);
            this.x(0.0F);
         }
      });
      fcu $$0 = this.dt();
      this.b(bxd.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fP();
   }

   @Nullable
   public jo fS() {
      jj $$0 = this.fO().orElse(null);
      return $$0 != null ? dkn.a(this.dV(), $$0) : null;
   }

   @Override
   public boolean bL() {
      return !this.fQ() && super.bL();
   }

   public cxy e(cxy $$0) {
      return cxy.k;
   }

   private static byte g(bwc $$0) {
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

   public void a(cxu $$0, bwc $$1) {
      this.dV().a(this, g($$1));
      this.a(this.a($$1), $$1, this.bD);
   }

   private void a(cxy $$0, bwc $$1, bxu $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         bxt $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      dej.a($$0, this, $$1);
   }

   public static bwc d(btp $$0) {
      return $$0 == btp.a ? bwc.a : bwc.b;
   }

   public final boolean f(cxy $$0) {
      if (this.bK() && !this.U_()) {
         dgc $$1 = $$0.a(kx.E);
         if ($$1 != null && $$1.g()) {
            bwc $$2 = $$1.b();
            return this.e($$2) && $$1.a(this.aq()) ? this.a($$2).f() && this.f($$2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected boolean f(bwc $$0) {
      return true;
   }

   public final bwc g(cxy $$0) {
      dgc $$1 = $$0.a(kx.E);
      return $$1 != null && this.e($$1.b()) ? $$1.b() : bwc.a;
   }

   public final boolean a(cxy $$0, bwc $$1) {
      dgc $$2 = $$0.a(kx.E);
      return $$2 == null ? $$1 == bwc.a && this.e(bwc.a) : $$1 == $$2.b() && this.e($$2.b()) && $$2.a(this.aq());
   }

   private static bxi a(bwr $$0, bwc $$1) {
      return $$1 != bwc.f && $$1 != bwc.a && $$1 != bwc.b ? bxi.a($$0, $$1, $$2 -> $$2.f() || $$0.g($$2) == $$1) : bxi.a($$0, $$1);
   }

   @Nullable
   private static bwc r(int $$0) {
      if ($$0 == 100 + bwc.f.b()) {
         return bwc.f;
      } else if ($$0 == 100 + bwc.e.b()) {
         return bwc.e;
      } else if ($$0 == 100 + bwc.d.b()) {
         return bwc.d;
      } else if ($$0 == 100 + bwc.c.b()) {
         return bwc.c;
      } else if ($$0 == 98) {
         return bwc.a;
      } else if ($$0 == 99) {
         return bwc.b;
      } else if ($$0 == 105) {
         return bwc.g;
      } else {
         return $$0 == 106 ? bwc.h : null;
      }
   }

   @Override
   public bxi a_(int $$0) {
      bwc $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dJ() {
      if (this.U_()) {
         return false;
      } else {
         for (bwc $$0 : bwd.i) {
            if (this.a($$0).a(axi.bq)) {
               return false;
            }
         }

         return super.dJ();
      }
   }

   @Override
   public boolean co() {
      return !this.dV().w_() && this.b(buy.x) || super.co();
   }

   @Override
   public float dM() {
      return this.aU;
   }

   @Override
   public void a(abs $$0) {
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

   public boolean fT() {
      dbc $$0 = this.dZ().a(kx.C);
      return $$0 != null && $$0.b();
   }

   @Override
   public float dP() {
      float $$0 = (float)this.h(bxx.B);
      return this.cW() instanceof cqi ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public fcu m(bvs $$0) {
      return this.dt().e(this.a($$0, this.a(this.aw()), this.ek() * this.ej()));
   }

   protected void a(int $$0, double $$1) {
      this.aW = (float)azk.e(1.0 / (double)$$0, (double)this.aW, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(azk.c((double)$$0 * this.h(bxx.h)));
   }

   public boolean fU() {
      return false;
   }

   public boolean a(arn $$0, buh $$1) {
      return this.d($$1) || dej.a($$0, this, $$1);
   }

   public static boolean b(cxy $$0, bwc $$1) {
      if (!$$0.c(kx.G)) {
         return false;
      } else {
         dgc $$2 = $$0.a(kx.E);
         return $$2 != null && $$1 == $$2.b() && !$$0.r();
      }
   }

   @VisibleForTesting
   public int fV() {
      return this.ba;
   }

   public static record a(awj a, awj b) {
   }
}
