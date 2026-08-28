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
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class bve extends bui implements buc {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final all d = all.b("powder_snow");
   private static final all e = all.b("sprinting");
   private static final bwk k = new bwk(e, 0.3F, bwk.a.c);
   public static final int m = 2;
   public static final int n = 4;
   public static final int o = 98;
   public static final int p = 100;
   public static final int q = 105;
   public static final int r = 6;
   public static final int s = 100;
   private static final int l = 40;
   public static final double t = 0.003;
   public static final double u = 0.08;
   public static final int v = 20;
   private static final int bH = 10;
   private static final int bI = 2;
   public static final float az = 0.42F;
   private static final double bJ = 128.0;
   protected static final int aA = 1;
   protected static final int aB = 2;
   protected static final int aC = 4;
   protected static final ako<Byte> aD = aks.a(bve.class, akq.a);
   private static final ako<Float> bK = aks.a(bve.class, akq.d);
   private static final ako<List<lq>> bL = aks.a(bve.class, akq.m);
   private static final ako<Boolean> bM = aks.a(bve.class, akq.k);
   private static final ako<Integer> bN = aks.a(bve.class, akq.b);
   private static final ako<Integer> bO = aks.a(bve.class, akq.b);
   private static final ako<Optional<jh>> bP = aks.a(bve.class, akq.p);
   private static final int bQ = 15;
   protected static final bul aE = bul.c(0.2F, 0.2F).b(0.2F);
   public static final float aF = 0.5F;
   public static final float aG = 0.5F;
   public static final String aH = "attributes";
   private final bwj bR;
   private final bsv bS = new bsv(this);
   private final Map<jq<btl>, btn> bT = Maps.newHashMap();
   private final jz<cwf> bU = jz.a(2, cwf.k);
   private final jz<cwf> bV = jz.a(4, cwf.k);
   private cwf bW = cwf.k;
   public boolean aI;
   private boolean bX = false;
   public bsg aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public float aQ;
   public float aR;
   protected int aS;
   public final bwf aT = new bwf();
   public final int aU = 20;
   public final float aV;
   public final float aW;
   public float aX;
   public float aY;
   public float aZ;
   public float ba;
   public final buh bb = new buh(this);
   @Nullable
   protected cor bc;
   protected int bd;
   protected boolean be;
   protected int bf;
   protected float bg;
   protected float bh;
   protected float bi;
   protected float bj;
   protected float bk;
   protected int bl;
   protected float bm;
   protected boolean bn;
   public float bo;
   public float bp;
   public float bq;
   protected int br;
   protected double bs;
   protected double bt;
   protected double bu;
   protected double bv;
   protected double bw;
   protected double bx;
   protected int by;
   private boolean bY = true;
   @Nullable
   private bve bZ;
   private int ca;
   @Nullable
   private bve cb;
   private int cc;
   private float cd;
   private int ce;
   private float cf;
   protected cwf bz = cwf.k;
   protected int bA;
   protected int bB;
   private jh cg;
   private Optional<jh> ch = Optional.empty();
   @Nullable
   private bsy ci;
   private long cj;
   protected int bC;
   protected float bD;
   @Nullable
   protected cwf bE;
   private float ck;
   private float cl;
   protected bwg<?> bF;
   private boolean cm;
   private final EnumMap<buq, Reference2ObjectMap<dbw, Set<dco>>> cn = new EnumMap<>(buq.class);
   protected float bG = 1.0F;

   protected bve(bup<? extends bve> $$0, dff $$1) {
      super($$0, $$1);
      this.bR = new bwj(bwn.a($$0));
      this.x(this.eW());
      this.J = true;
      this.aW = (float)((Math.random() + 1.0) * 0.01F);
      this.aA();
      this.aV = (float)Math.random() * 12398.0F;
      this.v((float)(Math.random() * (float) (Math.PI * 2)));
      this.aZ = this.dO();
      vb $$2 = vb.a;
      this.bF = this.a(new Dynamic($$2, (vk)$$2.createMap(ImmutableMap.of($$2.a("memories"), (vk)$$2.emptyMap()))));
   }

   public bwg<?> ee() {
      return this.bF;
   }

   protected bwg.b<?> ef() {
      return bwg.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bwg<?> a(Dynamic<?> $$0) {
      return this.ef().a($$0);
   }

   @Override
   public void au() {
      this.a(this.dZ().y(), Float.MAX_VALUE);
   }

   public boolean a(bup<?> $$0) {
      return true;
   }

   @Override
   protected void a(aks.a $$0) {
      $$0.a(aD, (byte)0);
      $$0.a(bL, List.of());
      $$0.a(bM, false);
      $$0.a(bN, 0);
      $$0.a(bO, 0);
      $$0.a(bK, 1.0F);
      $$0.a(bP, Optional.empty());
   }

   public static bwl.a eg() {
      return bwl.a()
         .a(bwm.s)
         .a(bwm.p)
         .a(bwm.v)
         .a(bwm.a)
         .a(bwm.b)
         .a(bwm.r)
         .a(bwm.B)
         .a(bwm.y)
         .a(bwm.n)
         .a(bwm.x)
         .a(bwm.k)
         .a(bwm.o)
         .a(bwm.w)
         .a(bwm.h)
         .a(bwm.i)
         .a(bwm.F)
         .a(bwm.u)
         .a(bwm.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvo $$2, jh $$3) {
      if (!this.bl()) {
         this.bt();
      }

      if (this.dY() instanceof arq $$4 && $$1 && this.aa > 0.0F) {
         this.b($$4, $$3);
         double $$5 = this.h(bwm.x);
         if ((double)this.aa > $$5 && !$$2.l()) {
            double $$6 = this.dD();
            double $$7 = this.dF();
            double $$8 = this.dJ();
            jh $$9 = this.dy();
            if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
               double $$10 = $$6 - (double)$$3.u() - 0.5;
               double $$11 = $$8 - (double)$$3.w() - 0.5;
               double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
               $$6 = (double)$$3.u() + 0.5 + $$10 / $$12 * 0.5;
               $$8 = (double)$$3.w() + 0.5 + $$11 / $$12 * 0.5;
            }

            float $$13 = (float)azn.c((double)this.aa - $$5);
            double $$14 = Math.min((double)(0.2F + $$13 / 15.0F), 2.5);
            int $$15 = (int)(150.0 * $$14);
            ((arq)this.dY()).a(new lk(ls.b, $$2), $$6, $$7, $$8, $$15, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.ch = Optional.empty();
      }
   }

   public final boolean eh() {
      return this.ar().a(axh.m);
   }

   public float a(float $$0) {
      return azn.h($$0, this.cl, this.ck);
   }

   public boolean ei() {
      return this.dB().b() < 1.0E-5F && this.bp();
   }

   @Override
   public void aB() {
      this.aQ = this.aR;
      if (this.al) {
         this.fS().ifPresent(this::a);
      }

      if (this.dY() instanceof arq $$0) {
         dby.b($$0, this);
      }

      super.aB();
      bor $$1 = boq.a();
      $$1.a("livingEntityBaseTick");
      if (this.bk() || this.dY().C) {
         this.aJ();
      }

      if (this.bN()) {
         boolean $$2 = this instanceof cor;
         if (!this.dY().C) {
            if (this.bO()) {
               this.a(this.dZ().g(), 1.0F);
            } else if ($$2 && !this.dY().C_().a(this.cT())) {
               double $$3 = this.dY().C_().a(this) + this.dY().C_().n();
               if ($$3 < 0.0) {
                  double $$4 = this.dY().C_().o();
                  if ($$4 > 0.0) {
                     this.a(this.dZ().x(), (float)Math.max(1, azn.a(-$$3 * $$4)));
                  }
               }
            }
         }

         if (this.a(axj.a) && !this.dY().a_(jh.a(this.dD(), this.dH(), this.dJ())).a(dil.nd)) {
            boolean $$5 = !this.eh() && !bto.c(this) && (!$$2 || !((cor)this).gm().a);
            if ($$5) {
               this.j(this.m(this.cv()));
               if (this.cv() == -20) {
                  this.j(0);
                  ezr $$6 = this.dB();

                  for (int $$7 = 0; $$7 < 8; $$7++) {
                     double $$8 = this.af.j() - this.af.j();
                     double $$9 = this.af.j() - this.af.j();
                     double $$10 = this.af.j() - this.af.j();
                     this.dY().a(ls.d, this.dD() + $$8, this.dF() + $$9, this.dJ() + $$10, $$6.d, $$6.e, $$6.f);
                  }

                  this.a(this.dZ().i(), 2.0F);
               }
            }

            if (!this.dY().C && this.cb() && this.dm() != null && this.dm().cd()) {
               this.af();
            }
         } else if (this.cv() < this.cu()) {
            this.j(this.n(this.cv()));
         }

         if (this.dY() instanceof arq $$11) {
            jh $$12 = this.dy();
            if (!Objects.equal(this.cg, $$12)) {
               this.cg = $$12;
               this.b($$11, $$12);
            }
         }
      }

      if (this.bN() && (this.bn() || this.aw)) {
         this.aP();
      }

      if (this.aN > 0) {
         this.aN--;
      }

      if (this.ak > 0 && !(this instanceof arr)) {
         this.ak--;
      }

      if (this.eI() && this.dY().h(this)) {
         this.eo();
      }

      if (this.bd > 0) {
         this.bd--;
      } else {
         this.bc = null;
      }

      if (this.cb != null && !this.cb.bN()) {
         this.cb = null;
      }

      if (this.bZ != null) {
         if (!this.bZ.bN()) {
            this.a(null);
         } else if (this.ag - this.ca > 100) {
            this.a(null);
         }
      }

      this.ez();
      this.bj = this.bi;
      this.aY = this.aX;
      this.ba = this.aZ;
      this.O = this.dO();
      this.P = this.dQ();
      $$1.c();
   }

   @Override
   protected float aV() {
      return azn.h((float)this.h(bwm.u), super.aV(), 1.0F);
   }

   protected void ej() {
      bwi $$0 = this.g(bwm.v);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.c(d);
         }
      }
   }

   protected void ek() {
      if (!this.bv().l()) {
         int $$0 = this.cw();
         if ($$0 > 0) {
            bwi $$1 = this.g(bwm.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cx();
            $$1.b(new bwk(d, (double)$$2, bwk.a.a));
         }
      }
   }

   protected void b(arq $$0, jh $$1) {
      dby.a($$0, this);
   }

   public boolean p_() {
      return false;
   }

   public float el() {
      return this.p_() ? 0.5F : 1.0F;
   }

   public final float em() {
      bwj $$0 = this.fb();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bwm.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean en() {
      return true;
   }

   protected void eo() {
      this.aP++;
      if (this.aP >= 20 && !this.dY().y_() && !this.dT()) {
         this.dY().a(this, (byte)60);
         this.a(bui.c.a);
      }
   }

   public boolean ep() {
      return !this.p_();
   }

   protected boolean eq() {
      return !this.p_();
   }

   protected int m(int $$0) {
      bwi $$1 = this.g(bwm.w);
      double $$2;
      if ($$1 != null) {
         $$2 = $$1.g();
      } else {
         $$2 = 0.0;
      }

      return $$2 > 0.0 && this.af.j() >= 1.0 / ($$2 + 1.0) ? $$0 : $$0 - 1;
   }

   protected int n(int $$0) {
      return Math.min($$0 + 4, this.cu());
   }

   public final int a(arq $$0, @Nullable bui $$1) {
      return dby.a($$0, $$1, this, this.er());
   }

   protected int er() {
      return 0;
   }

   protected boolean es() {
      return false;
   }

   @Nullable
   public bve et() {
      return this.bZ;
   }

   @Override
   public bve Z_() {
      return this.et();
   }

   public int eu() {
      return this.ca;
   }

   public void c(@Nullable cor $$0) {
      this.bc = $$0;
      this.bd = this.ag;
   }

   public void a(@Nullable bve $$0) {
      this.bZ = $$0;
      this.ca = this.ag;
   }

   @Nullable
   public bve ev() {
      return this.cb;
   }

   public int ew() {
      return this.cc;
   }

   public void B(bui $$0) {
      if ($$0 instanceof bve) {
         this.cb = (bve)$$0;
      } else {
         this.cb = null;
      }

      this.cc = this.ag;
   }

   public int ex() {
      return this.bf;
   }

   public void o(int $$0) {
      this.bf = $$0;
   }

   public boolean ey() {
      return this.bX;
   }

   public void r(boolean $$0) {
      this.bX = $$0;
   }

   protected boolean b(buq $$0) {
      return true;
   }

   public void a(buq $$0, cwf $$1, cwf $$2) {
      if (!this.dY().y_() && !this.R_()) {
         boolean $$3 = $$2.f() && $$1.f();
         if (!$$3 && !cwf.c($$1, $$2) && !this.al) {
            ddr $$4 = $$2.a(ku.D);
            if (!this.bd() && $$4 != null && $$0 == $$4.a()) {
               this.dY().a(null, this.dD(), this.dF(), this.dJ(), $$4.b(), this.do(), 1.0F, 1.0F, this.af.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? eak.v : eak.S);
            }
         }
      }
   }

   @Override
   public void a(bui.c $$0) {
      if ($$0 == bui.c.a || $$0 == bui.c.b) {
         this.c($$0);
      }

      super.a($$0);
      this.bF.a();
   }

   protected void c(bui.c $$0) {
      for (btn $$1 : this.eE()) {
         $$1.a(this, $$0);
      }

      this.bT.clear();
   }

   @Override
   public void b(un $$0) {
      $$0.a("Health", this.eH());
      $$0.a("HurtTime", (short)this.aN);
      $$0.a("HurtByTimestamp", this.ca);
      $$0.a("DeathTime", (short)this.aP);
      $$0.a("AbsorptionAmount", this.fz());
      $$0.a("attributes", this.fb().d());
      if (!this.bT.isEmpty()) {
         ut $$1 = new ut();

         for (btn $$2 : this.bT.values()) {
            $$1.add($$2.j());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fM());
      this.fS().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<vk> $$3 = this.bF.a(vb.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(un $$0) {
      this.F($$0.j("AbsorptionAmount"));
      if ($$0.b("attributes", 9) && this.dY() != null && !this.dY().C) {
         this.fb().a($$0.c("attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         ut $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            un $$3 = $$1.a($$2);
            btn $$4 = btn.a($$3);
            if ($$4 != null) {
               this.bT.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.x($$0.j("Health"));
      }

      this.aN = $$0.g("HurtTime");
      this.aP = $$0.g("DeathTime");
      this.ca = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         faw $$6 = this.dY().O();
         far $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cJ(), $$7);
         if (!$$8) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         jh $$9 = new jh($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$9);
         this.am.a(ar, bvq.c);
         if (!this.al) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bF = this.a(new Dynamic(vb.a, $$0.c("Brain")));
      }
   }

   protected void ez() {
      Iterator<jq<btl>> $$0 = this.bT.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            jq<btl> $$1 = $$0.next();
            btn $$2 = this.bT.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dY().C) {
                  $$0.remove();
                  this.c(List.of($$2));
               }
            } else if ($$2.d() % 600 == 0) {
               this.a($$2, false, null);
            }
         }
      } catch (ConcurrentModificationException var6) {
      }

      if (this.bY) {
         if (!this.dY().C) {
            this.L();
            this.w();
         }

         this.bY = false;
      }

      List<lq> $$3 = this.am.a(bL);
      if (!$$3.isEmpty()) {
         boolean $$4 = this.am.a(bM);
         int $$5 = this.cr() ? 15 : 4;
         int $$6 = $$4 ? 5 : 1;
         if (this.af.a($$5 * $$6) == 0) {
            this.dY().a(ae.a($$3, this.af), this.d(0.5), this.dG(), this.g(0.5), 1.0, 1.0, 1.0);
         }
      }
   }

   protected void L() {
      if (this.bT.isEmpty()) {
         this.eC();
         this.k(false);
      } else {
         this.k(this.b(btp.n));
         this.q();
      }
   }

   private void q() {
      List<lq> $$0 = this.bT.values().stream().filter(btn::g).map(btn::a).toList();
      this.am.a(bL, $$0);
      this.am.a(bM, d(this.bT.values()));
   }

   private void w() {
      boolean $$0 = this.cq();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable bui $$0) {
      double $$1 = 1.0;
      if (this.ci()) {
         $$1 *= 0.8;
      }

      if (this.cr()) {
         float $$2 = this.fi();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cwf $$3 = this.a(buq.f);
         bup<?> $$4 = $$0.ar();
         if ($$4 == bup.aN && $$3.a(cwj.uD)
            || $$4 == bup.bu && $$3.a(cwj.uG)
            || $$4 == bup.aA && $$3.a(cwj.uJ)
            || $$4 == bup.aB && $$3.a(cwj.uJ)
            || $$4 == bup.x && $$3.a(cwj.uH)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bve $$0) {
      return $$0 instanceof cor && this.dY().ak() == bse.a ? false : $$0.eA();
   }

   public boolean a(bve $$0, cfv $$1) {
      return $$1.a(this, $$0);
   }

   public boolean eA() {
      return !this.cE() && this.eB();
   }

   public boolean eB() {
      return !this.R_() && this.bN();
   }

   public static boolean d(Collection<btn> $$0) {
      for (btn $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void eC() {
      this.am.a(bL, List.of());
   }

   public boolean eD() {
      if (this.dY().C) {
         return false;
      } else if (this.bT.isEmpty()) {
         return false;
      } else {
         Map<jq<btl>, btn> $$0 = Maps.newHashMap(this.bT);
         this.bT.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<btn> eE() {
      return this.bT.values();
   }

   public Map<jq<btl>, btn> eF() {
      return this.bT;
   }

   public boolean b(jq<btl> $$0) {
      return this.bT.containsKey($$0);
   }

   @Nullable
   public btn c(jq<btl> $$0) {
      return this.bT.get($$0);
   }

   public final boolean a(btn $$0) {
      return this.b($$0, null);
   }

   public boolean b(btn $$0, @Nullable bui $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         btn $$2 = this.bT.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bT.put($$0.c(), $$0);
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

   public boolean b(btn $$0) {
      if (this.ar().a(axh.G)) {
         return !$$0.a(btp.M);
      } else if (this.ar().a(axh.F)) {
         return !$$0.a(btp.L);
      } else {
         return !this.ar().a(axh.w) ? true : !$$0.a(btp.j) && !$$0.a(btp.s);
      }
   }

   public void c(btn $$0, @Nullable bui $$1) {
      if (this.b($$0)) {
         btn $$2 = this.bT.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eG() {
      return this.ar().a(axh.x);
   }

   @Nullable
   public btn d(jq<btl> $$0) {
      return this.bT.remove($$0);
   }

   public boolean e(jq<btl> $$0) {
      btn $$1 = this.d($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(btn $$0, @Nullable bui $$1) {
      this.bY = true;
      if (!this.dY().C) {
         $$0.c().a().a(this.fb(), $$0.e());
         this.c($$0);
      }
   }

   public void c(btn $$0) {
      for (bui $$1 : this.db()) {
         if ($$1 instanceof arr $$2) {
            $$2.g.b(new agr(this.as(), $$0, false));
         }
      }
   }

   protected void a(btn $$0, boolean $$1, @Nullable bui $$2) {
      this.bY = true;
      if ($$1 && !this.dY().C) {
         btl $$3 = $$0.c().a();
         $$3.a(this.fb());
         $$3.a(this.fb(), $$0.e());
         this.D();
      }

      if (!this.dY().C) {
         this.c($$0);
      }
   }

   protected void c(Collection<btn> $$0) {
      this.bY = true;
      if (!this.dY().C) {
         for (btn $$1 : $$0) {
            $$1.c().a().a(this.fb());

            for (bui $$2 : this.db()) {
               if ($$2 instanceof arr $$3) {
                  $$3.g.b(new aeu(this.as(), $$1.c()));
               }
            }
         }

         this.D();
      }
   }

   private void D() {
      Set<bwi> $$0 = this.fb().b();

      for (bwi $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(jq<bwh> $$0) {
      if ($$0.a(bwm.s)) {
         float $$1 = this.eW();
         if (this.eH() > $$1) {
            this.x($$1);
         }
      } else if ($$0.a(bwm.r)) {
         float $$2 = this.eX();
         if (this.fz() > $$2) {
            this.E($$2);
         }
      }
   }

   public void c(float $$0) {
      float $$1 = this.eH();
      if ($$1 > 0.0F) {
         this.x($$1 + $$0);
      }
   }

   public float eH() {
      return this.am.a(bK);
   }

   public void x(float $$0) {
      this.am.a(bK, azn.a($$0, 0.0F, this.eW()));
   }

   public boolean eI() {
      return this.eH() <= 0.0F;
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dY().C) {
         return false;
      } else if (this.eI()) {
         return false;
      } else if ($$0.a(axf.i) && this.b(btp.l)) {
         return false;
      } else {
         if (this.fU() && !this.dY().C) {
            this.fV();
         }

         this.bf = 0;
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
            if (!$$0.a(axf.j) && $$0.c() instanceof bve $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(axf.o) && this.ar().a(axh.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(axf.a) && !this.a(buq.f).f()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.aT.a(1.5F);
         if (Float.isNaN($$1) || Float.isInfinite($$1)) {
            $$1 = Float.MAX_VALUE;
         }

         boolean $$7 = true;
         if ((float)this.ak > 10.0F && !$$0.a(axf.e)) {
            if ($$1 <= this.bm) {
               return false;
            }

            this.f($$0, $$1 - this.bm);
            this.bm = $$1;
            $$7 = false;
         } else {
            this.bm = $$1;
            this.ak = 20;
            this.f($$0, $$1);
            this.aO = 10;
            this.aN = this.aO;
         }

         bui $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof bve $$9 && !$$0.a(axf.q) && (!$$0.a(btb.I) || !this.ar().a(axh.E))) {
               this.a($$9);
            }

            if ($$8 instanceof cor $$10) {
               this.bd = 100;
               this.bc = $$10;
            } else if ($$8 instanceof chy $$11 && $$11.q()) {
               this.bd = 100;
               if ($$11.T_() instanceof cor $$12) {
                  this.bc = $$12;
               } else {
                  this.bc = null;
               }
            }
         }

         if ($$7) {
            if ($$3) {
               this.dY().a(this, (byte)29);
            } else {
               this.dY().a(this, $$0);
            }

            if (!$$0.a(axf.r) && (!$$3 || $$1 > 0.0F)) {
               this.bF();
            }

            if (!$$0.a(axf.z)) {
               double $$13 = 0.0;
               double $$14 = 0.0;
               if ($$0.c() instanceof cpk $$15) {
                  DoubleDoubleImmutablePair $$16 = $$15.a_(this, $$0);
                  $$13 = -$$16.leftDouble();
                  $$14 = -$$16.rightDouble();
               } else if ($$0.i() != null) {
                  $$13 = $$0.i().a() - this.dD();
                  $$14 = $$0.i().c() - this.dJ();
               }

               this.p(0.4F, $$13, $$14);
               if (!$$3) {
                  this.a($$13, $$14);
               }
            }
         }

         if (this.eI()) {
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
            this.ci = $$0;
            this.cj = this.dY().aa();

            for (btn $$18 : this.eE()) {
               $$18.a(this, $$0, $$1);
            }
         }

         if (this instanceof arr) {
            ao.i.a((arr)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((arr)this).a(awy.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof arr) {
            ao.h.a((arr)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$17;
      }
   }

   protected void d(bve $$0) {
      $$0.e(this);
   }

   protected void e(bve $$0) {
      $$0.p(0.5, $$0.dD() - this.dD(), $$0.dJ() - this.dJ());
   }

   private boolean g(bsy $$0) {
      if ($$0.a(axf.d)) {
         return false;
      } else {
         cwf $$1 = null;
         cyr $$2 = null;

         for (bsg $$3 : bsg.values()) {
            cwf $$4 = this.b($$3);
            $$2 = $$4.a(ku.H);
            if ($$2 != null) {
               $$1 = $$4.v();
               $$4.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof arr $$5) {
               $$5.b(awy.c.b($$1.h()));
               ao.C.a($$5, $$1);
               this.a(eak.C);
            }

            this.x(1.0F);
            $$2.a($$1, this);
            this.dY().a(this, (byte)35);
         }

         return $$2 != null;
      }
   }

   @Nullable
   public bsy eJ() {
      if (this.dY().aa() - this.cj > 40L) {
         this.ci = null;
      }

      return this.ci;
   }

   protected void e(bsy $$0) {
      this.b(this.d($$0));
   }

   public void b(@Nullable awn $$0) {
      if ($$0 != null) {
         this.a($$0, this.fj(), this.fk());
      }
   }

   public boolean f(bsy $$0) {
      bui $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof coy $$3 && $$3.z() > 0) {
         $$2 = true;
      }

      if (!$$0.a(axf.c) && this.fJ() && !$$2) {
         ezr $$4 = $$0.i();
         if ($$4 != null) {
            ezr $$5 = this.c(0.0F, this.cC());
            ezr $$6 = $$4.a(this.dw());
            $$6 = new ezr($$6.d, 0.0, $$6.f).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void g(cwf $$0) {
      if (!$$0.f()) {
         if (!this.bd()) {
            this.dY().a(this.dD(), this.dF(), this.dJ(), $$0.M(), this.do(), 0.8F, 0.8F + this.dY().A.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(bsy $$0) {
      if (!this.dT() && !this.be) {
         bui $$1 = $$0.d();
         bve $$2 = this.eV();
         if (this.bl >= 0 && $$2 != null) {
            $$2.a(this, this.bl, $$0);
         }

         if (this.fU()) {
            this.fV();
         }

         if (!this.dY().C && this.an()) {
            b.info("Named entity {} died: {}", this, this.eU().a().getString());
         }

         this.be = true;
         this.eU().c();
         if (this.dY() instanceof arq $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(eak.p);
               this.a($$3, $$0);
               this.f($$2);
            }

            this.dY().a(this, (byte)3);
         }

         this.b(bvq.h);
      }
   }

   protected void f(@Nullable bve $$0) {
      if (!this.dY().C) {
         boolean $$1 = false;
         if ($$0 instanceof ckm) {
            if (this.dY().ac().b(dfb.c)) {
               jh $$2 = this.dy();
               dvo $$3 = dil.cd.m();
               if (this.dY().a_($$2).l() && $$3.a((dfi)this.dY(), $$2)) {
                  this.dY().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               ckz $$4 = new ckz(this.dY(), this.dD(), this.dF(), this.dJ(), new cwf(cwj.dw));
               this.dY().b($$4);
            }
         }
      }
   }

   protected void a(arq $$0, bsy $$1) {
      boolean $$2 = this.bd > 0;
      if (this.eq() && $$0.ac().b(dfb.f)) {
         this.a($$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.eK();
      this.D($$1.d());
   }

   protected void eK() {
   }

   protected void D(@Nullable bui $$0) {
      if (this.dY() instanceof arq $$1 && !this.eN() && (this.es() || this.bd > 0 && this.ep() && this.dY().ac().b(dfb.f))) {
         buu.a($$1, this.dw(), this.a($$1, $$0));
      }
   }

   protected void a(arq $$0, bsy $$1, boolean $$2) {
   }

   public long eL() {
      return 0L;
   }

   protected float a(bui $$0, bsy $$1) {
      float $$2 = (float)this.h(bwm.d);
      return this.dY() instanceof arq $$3 ? dby.d($$3, this.ec(), $$0, $$1, $$2) : $$2;
   }

   protected void a(bsy $$0, boolean $$1) {
      Optional<alk<eul>> $$2 = this.ed();
      if (!$$2.isEmpty()) {
         eul $$3 = this.dY().o().bc().b($$2.get());
         euj.a $$4 = new euj.a((arq)this.dY()).a(exc.a, this).a(exc.f, this.dw()).a(exc.c, $$0).b(exc.d, $$0.d()).b(exc.e, $$0.c());
         if ($$1 && this.bc != null) {
            $$4 = $$4.a(exc.b, this.bc).a(this.bc.gI());
         }

         euj $$5 = $$4.a(exb.g);
         $$3.a($$5, this.eL(), this::b);
      }
   }

   public boolean a(alk<eul> $$0, Consumer<cwf> $$1) {
      return this.a($$0, $$0x -> $$0x.a(exc.f, this.dw()).a(exc.a, this).a(exb.j), $$1);
   }

   protected void a(alk<eul> $$0, cwf $$1, Consumer<cwf> $$2) {
      this.a($$0, $$1x -> $$1x.a(exc.f, this.dw()).a(exc.a, this).a(exc.i, $$1).a(exb.s), $$2);
   }

   protected boolean a(alk<eul> $$0, Function<euj.a, euj> $$1, Consumer<cwf> $$2) {
      if (!(this.dY() instanceof arq $$3)) {
         return false;
      } else {
         eul $$4 = $$3.o().bc().b($$0);
         euj $$5 = $$1.apply(new euj.a($$3));
         boolean $$6 = false;

         for (ObjectListIterator var8 = $$4.a($$5).iterator(); var8.hasNext(); $$6 = true) {
            cwf $$7 = (cwf)var8.next();
            $$2.accept($$7);
         }

         return $$6;
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(bwm.p);
      if (!($$0 <= 0.0)) {
         this.as = true;
         ezr $$3 = this.dB();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         ezr $$4 = new ezr($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aL() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected awn d(bsy $$0) {
      return awo.kh;
   }

   @Nullable
   protected awn o_() {
      return awo.kc;
   }

   private awn r(int $$0) {
      return $$0 > 4 ? this.eQ().b() : this.eQ().a();
   }

   public void eM() {
      this.cm = true;
   }

   public boolean eN() {
      return this.cm;
   }

   public float eO() {
      return 0.0F;
   }

   protected ezm eP() {
      ezm $$0 = this.cT();
      bui $$1 = this.dm();
      if ($$1 != null) {
         ezr $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<dbw, Set<dco>> c(buq $$0) {
      return (Map<dbw, Set<dco>>)this.cn.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public bve.a eQ() {
      return new bve.a(awo.ki, awo.ka);
   }

   public Optional<jh> eR() {
      return this.ch;
   }

   public boolean q_() {
      if (this.R_()) {
         return false;
      } else {
         jh $$0 = this.dy();
         dvo $$1 = this.dz();
         if ($$1.a(axd.aR)) {
            this.ch = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dqw && this.c($$0, $$1)) {
            this.ch = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(jh $$0, dvo $$1) {
      if (!$$1.c(dqw.b)) {
         return false;
      } else {
         dvo $$2 = this.dY().a_($$0.e());
         return $$2.a(dil.cO) && $$2.c(dmo.b) == $$1.c(dqw.aF);
      }
   }

   @Override
   public boolean bN() {
      return !this.dT() && this.eH() > 0.0F;
   }

   @Override
   public int cG() {
      return this.y(0.0F);
   }

   protected final int y(float $$0) {
      return azn.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bsy $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.e($$0, $$1);
      if ($$4 > 0) {
         this.a(this.r($$4), 1.0F, 1.0F);
         this.eS();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int e(float $$0, float $$1) {
      if (this.ar().a(axh.o)) {
         return 0;
      } else {
         float $$2 = (float)this.h(bwm.x);
         float $$3 = $$0 - $$2;
         return azn.c((double)($$3 * $$1) * this.h(bwm.k));
      }
   }

   protected void eS() {
      if (!this.bd()) {
         int $$0 = azn.a(this.dD());
         int $$1 = azn.a(this.dF() - 0.2F);
         int $$2 = azn.a(this.dJ());
         dvo $$3 = this.dY().a_(new jh($$0, $$1, $$2));
         if (!$$3.l()) {
            dpw $$4 = $$3.A();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void p(float $$0) {
      this.aO = 10;
      this.aN = this.aO;
   }

   public int eT() {
      return azn.a(this.h(bwm.a));
   }

   protected void b(bsy $$0, float $$1) {
   }

   protected void c(bsy $$0, float $$1) {
   }

   protected void z(float $$0) {
   }

   protected void a(bsy $$0, float $$1, buq... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (buq $$4 : $$2) {
            cwf $$5 = this.a($$4);
            ddr $$6 = $$5.a(ku.D);
            if ($$6 != null && $$6.g() && $$5.m() && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float d(bsy $$0, float $$1) {
      if (!$$0.a(axf.b)) {
         this.b($$0, $$1);
         $$1 = bsu.a(this, $$1, $$0, (float)this.eT(), (float)this.h(bwm.b));
      }

      return $$1;
   }

   protected float e(bsy $$0, float $$1) {
      if ($$0.a(axf.f)) {
         return $$1;
      } else {
         if (this.b(btp.k) && !$$0.a(axf.g)) {
            int $$2 = (this.c(btp.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof arr) {
                  ((arr)this).a(awy.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof arr) {
                  ((arr)$$0.d()).a(awy.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(axf.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dY() instanceof arq $$7) {
               $$8 = dby.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = bsu.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void f(bsy $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fz(), 0.0F);
         this.E(this.fz() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof arr $$4) {
            $$4.a(awy.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eU().a($$0, var9);
            this.x(this.eH() - var9);
            this.E(this.fz() - var9);
            this.a(eak.o);
         }
      }
   }

   public bsv eU() {
      return this.bS;
   }

   @Nullable
   public bve eV() {
      if (this.bc != null) {
         return this.bc;
      } else {
         return this.bZ != null ? this.bZ : null;
      }
   }

   public final float eW() {
      return (float)this.h(bwm.s);
   }

   public final float eX() {
      return (float)this.h(bwm.r);
   }

   public final int eY() {
      return this.am.a(bN);
   }

   public final void p(int $$0) {
      this.am.a(bN, $$0);
   }

   public final int eZ() {
      return this.am.a(bO);
   }

   public final void q(int $$0) {
      this.am.a(bO, $$0);
   }

   private int E() {
      if (bto.a(this)) {
         return 6 - (1 + bto.b(this));
      } else {
         return this.b(btp.d) ? 6 + (1 + this.c(btp.d).e()) * 2 : 6;
      }
   }

   public void a(bsg $$0) {
      this.a($$0, false);
   }

   public void a(bsg $$0, boolean $$1) {
      if (!this.aI || this.aK >= this.E() / 2 || this.aK < 0) {
         this.aK = -1;
         this.aI = true;
         this.aJ = $$0;
         if (this.dY() instanceof arq) {
            ack $$2 = new ack(this, $$0 == bsg.a ? 0 : 3);
            aro $$3 = ((arq)this.dY()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bsy $$0) {
      this.aT.a(1.5F);
      this.ak = 20;
      this.aO = 10;
      this.aN = this.aO;
      awn $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.fj(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
      }

      this.a(this.dZ().p(), 0.0F);
      this.ci = $$0;
      this.cj = this.dY().aa();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            awn $$1 = this.o_();
            if ($$1 != null) {
               this.a($$1, this.fj(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cor)) {
               this.x(0.0F);
               this.a(this.dZ().p());
            }
            break;
         case 29:
            this.a(awo.wC, 1.0F, 0.8F + this.dY().A.i() * 0.4F);
            break;
         case 30:
            this.a(awo.wD, 0.8F, 0.8F + this.dY().A.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.af.i() - 0.5F) * 0.2F;
               float $$6 = (this.af.i() - 0.5F) * 0.2F;
               float $$7 = (this.af.i() - 0.5F) * 0.2F;
               double $$8 = azn.d($$4, this.L, this.dD()) + (this.af.j() - 0.5) * (double)this.dt() * 2.0;
               double $$9 = azn.d($$4, this.M, this.dF()) + this.af.j() * (double)this.du();
               double $$10 = azn.d($$4, this.N, this.dJ()) + (this.af.j() - 0.5) * (double)this.dt() * 2.0;
               this.dY().a(ls.ac, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.g(this.a(buq.a));
            break;
         case 48:
            this.g(this.a(buq.b));
            break;
         case 49:
            this.g(this.a(buq.f));
            break;
         case 50:
            this.g(this.a(buq.e));
            break;
         case 51:
            this.g(this.a(buq.d));
            break;
         case 52:
            this.g(this.a(buq.c));
            break;
         case 54:
            dmc.b(this);
            break;
         case 55:
            this.G();
            break;
         case 60:
            this.F();
            break;
         case 65:
            this.g(this.a(buq.g));
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
         this.dY().a(ls.ab, this.d(1.0), this.dG(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void G() {
      cwf $$0 = this.a(buq.b);
      this.a(buq.b, this.a(buq.a));
      this.a(buq.a, $$0);
   }

   @Override
   protected void aK() {
      this.a(this.dZ().o(), 4.0F);
   }

   protected void fa() {
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
   public bwi g(jq<bwh> $$0) {
      return this.fb().a($$0);
   }

   public double h(jq<bwh> $$0) {
      return this.fb().c($$0);
   }

   public double i(jq<bwh> $$0) {
      return this.fb().d($$0);
   }

   public bwj fb() {
      return this.bR;
   }

   public cwf fc() {
      return this.a(buq.a);
   }

   public cwf fd() {
      return this.a(buq.b);
   }

   public cwf a(buy $$0) {
      return this.fB() == $$0 ? this.fc() : this.fd();
   }

   @Nonnull
   @Override
   public cwf ec() {
      return this.fc();
   }

   public boolean b(cwb $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cwf> $$0) {
      return $$0.test(this.fc()) || $$0.test(this.fd());
   }

   public cwf b(bsg $$0) {
      if ($$0 == bsg.a) {
         return this.a(buq.a);
      } else if ($$0 == bsg.b) {
         return this.a(buq.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bsg $$0, cwf $$1) {
      if ($$0 == bsg.a) {
         this.a(buq.a, $$1);
      } else {
         if ($$0 != bsg.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(buq.b, $$1);
      }
   }

   public boolean d(buq $$0) {
      return !this.a($$0).f();
   }

   public boolean e(buq $$0) {
      return false;
   }

   public abstract Iterable<cwf> fe();

   public abstract cwf a(buq var1);

   public abstract void a(buq var1, cwf var2);

   public Iterable<cwf> ff() {
      return List.of();
   }

   public Iterable<cwf> fg() {
      return this.fe();
   }

   public Iterable<cwf> fh() {
      return Iterables.concat(this.ff(), this.fg());
   }

   protected void c(cwf $$0) {
      $$0.h().l($$0);
   }

   public float fi() {
      Iterable<cwf> $$0 = this.fe();
      int $$1 = 0;
      int $$2 = 0;

      for (cwf $$3 : $$0) {
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
      bwi $$1 = this.g(bwm.v);
      $$1.c(k.b());
      if ($$0) {
         $$1.b(k);
      }
   }

   protected float fj() {
      return 1.0F;
   }

   public float fk() {
      return this.p_() ? (this.af.i() - this.af.i()) * 0.2F + 1.5F : (this.af.i() - this.af.i()) * 0.2F + 1.0F;
   }

   protected boolean fl() {
      return this.eI();
   }

   @Override
   public void h(bui $$0) {
      if (!this.fU()) {
         super.h($$0);
      }
   }

   private void d(bui $$0) {
      ezr $$1;
      if (this.dT()) {
         $$1 = this.dw();
      } else if (!$$0.dT() && !this.dY().a_($$0.dy()).a(axd.aL)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dF(), $$0.dF());
         $$1 = new ezr(this.dD(), $$2, this.dJ());
         boolean $$4 = this.dt() <= 4.0F && this.du() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.du() / 2.0;
            ezr $$6 = $$1.b(0.0, $$5, 0.0);
            fal $$7 = fai.a(ezm.a($$6, (double)this.dt(), (double)this.du(), (double)this.dt()));
            $$1 = this.dY().a(this, $$7, $$6, (double)this.dt(), (double)this.du(), (double)this.dt()).map($$1x -> $$1x.b(0.0, -$$5, 0.0)).orElse($$1);
         }
      }

      this.a($$1.d, $$1.e, $$1.f);
   }

   @Override
   public boolean cO() {
      return this.cN();
   }

   protected float fm() {
      return this.A(1.0F);
   }

   protected float A(float $$0) {
      return (float)this.h(bwm.o) * $$0 * this.aU() + this.fn();
   }

   public float fn() {
      return this.b(btp.h) ? 0.1F * ((float)this.c(btp.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void v() {
      float $$0 = this.fm();
      if (!($$0 <= 1.0E-5F)) {
         ezr $$1 = this.dB();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.cl()) {
            float $$2 = this.dO() * (float) (Math.PI / 180.0);
            this.i(new ezr((double)(-azn.a($$2)) * 0.2, 0.0, (double)azn.b($$2) * 0.2));
         }

         this.as = true;
      }
   }

   protected void fo() {
      this.h(this.dB().b(0.0, -0.04F, 0.0));
   }

   protected void c(axt<ern> $$0) {
      this.h(this.dB().b(0.0, 0.04F, 0.0));
   }

   protected float fp() {
      return 0.8F;
   }

   public boolean a(ero $$0) {
      return false;
   }

   @Override
   protected double bf() {
      return this.h(bwm.n);
   }

   protected double fq() {
      boolean $$0 = this.dB().e <= 0.0;
      return $$0 && this.b(btp.B) ? Math.min(this.bg(), 0.01) : this.bg();
   }

   public void a_(ezr $$0) {
      if (this.dk()) {
         ero $$1 = this.dY().b_(this.dy());
         if ((this.bl() || this.bz()) && this.en() && !this.a($$1)) {
            this.l($$0);
         } else if (this.fM()) {
            this.I();
         } else {
            this.k($$0);
         }
      }
   }

   private void k(ezr $$0) {
      jh $$1 = this.aS();
      float $$2 = this.aL() ? this.dY().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      ezr $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      btn $$6 = this.c(btp.y);
      if ($$6 != null) {
         $$5 += (0.05 * (double)($$6.e() + 1) - $$4.e) * 0.2;
      } else if (!this.dY().C || this.dY().B($$1)) {
         $$5 -= this.fq();
      } else if (this.dF() > (double)this.dY().I_()) {
         $$5 = -0.1;
      } else {
         $$5 = 0.0;
      }

      if (this.ey()) {
         this.n($$4.d, $$5, $$4.f);
      } else {
         float $$7 = this instanceof che ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void l(ezr $$0) {
      boolean $$1 = this.dB().e <= 0.0;
      double $$2 = this.dF();
      double $$3 = this.fq();
      if (this.bl()) {
         float $$4 = this.cl() ? 0.9F : this.fp();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(bwm.F);
         if (!this.aL()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fs() - $$5) * $$6;
         }

         if (this.b(btp.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(bvi.a, this.dB());
         ezr $$7 = this.dB();
         if (this.Q && this.q_()) {
            $$7 = new ezr($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.h(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(bvi.a, this.dB());
         if (this.b(axj.b) <= this.ds()) {
            this.h(this.dB().d(0.5, 0.8F, 0.5));
            ezr $$8 = this.a($$3, $$1, this.dB());
            this.h($$8);
         } else {
            this.h(this.dB().c(0.5));
         }

         if ($$3 != 0.0) {
            this.h(this.dB().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      ezr $$9 = this.dB();
      if (this.Q && this.g($$9.d, $$9.e + 0.6F - this.dF() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void I() {
      ezr $$0 = this.dB();
      double $$1 = $$0.i();
      this.h(this.m($$0));
      this.a(bvi.a, this.dB());
      if (!this.dY().C) {
         double $$2 = this.dB().i();
         this.c($$1, $$2);
      }
   }

   private ezr m(ezr $$0) {
      ezr $$1 = this.bV();
      float $$2 = this.dQ() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fq();
      double $$6 = azn.k(Math.cos((double)$$2));
      $$0 = $$0.b(0.0, $$5 * (-1.0 + $$6 * 0.75), 0.0);
      if ($$0.e < 0.0 && $$3 > 0.0) {
         double $$7 = $$0.e * -0.1 * $$6;
         $$0 = $$0.b($$1.d * $$7 / $$3, $$7, $$1.f * $$7 / $$3);
      }

      if ($$2 < 0.0F && $$3 > 0.0) {
         double $$8 = $$4 * (double)(-azn.a($$2)) * 0.04;
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
            this.a(this.dZ().n(), $$3);
         }
      }
   }

   private void c(cor $$0, ezr $$1) {
      ezr $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.dk()) {
         this.C(this.e($$0));
         this.a_($$2);
      } else {
         this.h(ezr.c);
      }
   }

   protected void a(cor $$0, ezr $$1) {
   }

   protected ezr b(cor $$0, ezr $$1) {
      return $$1;
   }

   protected float e(cor $$0) {
      return this.fs();
   }

   public void s(boolean $$0) {
      float $$1 = (float)azn.g(this.dD() - this.L, $$0 ? this.dF() - this.M : 0.0, this.dJ() - this.N);
      if (!this.cb() && this.bN()) {
         this.B($$1);
      } else {
         this.aT.a();
      }
   }

   protected void B(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aT.a($$1, 0.4F, this.p_() ? 3.0F : 1.0F);
   }

   private ezr a(ezr $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.h(this.n(this.dB()));
      this.a(bvi.a, this.dB());
      ezr $$2 = this.dB();
      if ((this.Q || this.bn) && (this.q_() || this.dz().a(dil.qP) && dod.a(this))) {
         $$2 = new ezr($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public ezr a(double $$0, boolean $$1, ezr $$2) {
      if ($$0 != 0.0 && !this.cl()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new ezr($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private ezr n(ezr $$0) {
      if (this.q_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = azn.a($$0.d, -0.15F, 0.15F);
         double $$3 = azn.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dz().a(dil.nS) && this.fL() && this instanceof cor) {
            $$4 = 0.0;
         }

         $$0 = new ezr($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aL() ? this.fs() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fr();
   }

   protected float fr() {
      return this.cZ() instanceof cor ? this.fs() * 0.1F : 0.02F;
   }

   public float fs() {
      return this.cd;
   }

   public void C(float $$0) {
      this.cd = $$0;
   }

   public boolean E(bui $$0) {
      this.B($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.M();
      this.O();
      if (!this.dY().C) {
         int $$0 = this.eY();
         if ($$0 > 0) {
            if (this.aL <= 0) {
               this.aL = 20 * (30 - $$0);
            }

            this.aL--;
            if (this.aL <= 0) {
               this.p($$0 - 1);
            }
         }

         int $$1 = this.eZ();
         if ($$1 > 0) {
            if (this.aM <= 0) {
               this.aM = 20 * (30 - $$1);
            }

            this.aM--;
            if (this.aM <= 0) {
               this.q($$1 - 1);
            }
         }

         this.J();
         if (this.ag % 20 == 0) {
            this.eU().c();
         }

         if (this.fU() && !this.P()) {
            this.fV();
         }
      }

      if (!this.dT()) {
         this.n_();
      }

      double $$2 = this.dD() - this.L;
      double $$3 = this.dJ() - this.N;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aX;
      float $$6 = 0.0F;
      this.bg = this.bh;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)azn.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = azn.e(azn.h(this.dO()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aR > 0.0F) {
         $$5 = this.dO();
      }

      if (!this.aL()) {
         $$7 = 0.0F;
      }

      this.bh = this.bh + ($$7 - this.bh) * 0.3F;
      bor $$10 = boq.a();
      $$10.a("headTurn");
      $$6 = this.f($$5, $$6);
      $$10.c();
      $$10.a("rangeChecks");

      while (this.dO() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dO() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aX - this.aY < -180.0F) {
         this.aY -= 360.0F;
      }

      while (this.aX - this.aY >= 180.0F) {
         this.aY += 360.0F;
      }

      while (this.dQ() - this.P < -180.0F) {
         this.P -= 360.0F;
      }

      while (this.dQ() - this.P >= 180.0F) {
         this.P += 360.0F;
      }

      while (this.aZ - this.ba < -180.0F) {
         this.ba -= 360.0F;
      }

      while (this.aZ - this.ba >= 180.0F) {
         this.ba += 360.0F;
      }

      $$10.c();
      this.bi += $$6;
      if (this.fM()) {
         this.bB++;
      } else {
         this.bB = 0;
      }

      if (this.fU()) {
         this.w(0.0F);
      }

      this.D();
      float $$11 = this.em();
      if ($$11 != this.bG) {
         this.bG = $$11;
         this.j_();
      }

      this.bb.a();
   }

   private void J() {
      Map<buq, cwf> $$0 = this.K();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<buq, cwf> K() {
      Map<buq, cwf> $$0 = null;

      for (buq $$1 : buq.i) {
         cwf $$2 = switch ($$1.a()) {
            case a -> this.h($$1);
            case b -> this.g($$1);
            case c -> this.bW;
         };
         cwf $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(buq.class);
            }

            $$0.put($$1, $$3);
            bwj $$4 = this.fb();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<buq, cwf> $$5 : $$0.entrySet()) {
            buq $$6 = $$5.getKey();
            cwf $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1) -> {
                  bwi $$2 = this.bR.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1.b());
                     $$2.b($$1);
                  }
               });
               if (this.dY() instanceof arq $$8) {
                  dby.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(cwf $$0, cwf $$1) {
      return !cwf.a($$1, $$0);
   }

   private void a(Map<buq, cwf> $$0) {
      cwf $$1 = $$0.get(buq.a);
      cwf $$2 = $$0.get(buq.b);
      if ($$1 != null && $$2 != null && cwf.a($$1, this.h(buq.b)) && cwf.a($$2, this.h(buq.a))) {
         ((arq)this.dY()).l().b(this, new adl(this, (byte)55));
         $$0.remove(buq.a);
         $$0.remove(buq.b);
         this.c(buq.a, $$1.v());
         this.c(buq.b, $$2.v());
      }
   }

   private void b(Map<buq, cwf> $$0) {
      List<Pair<buq, cwf>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cwf $$3 = $$2.v();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
               break;
            case c:
               this.bW = $$3;
         }
      });
      ((arq)this.dY()).l().b(this, new afq(this.as(), $$1));
   }

   private cwf g(buq $$0) {
      return this.bV.get($$0.b());
   }

   private void b(buq $$0, cwf $$1) {
      this.bV.set($$0.b(), $$1);
   }

   private cwf h(buq $$0) {
      return this.bU.get($$0.b());
   }

   private void c(buq $$0, cwf $$1) {
      this.bU.set($$0.b(), $$1);
   }

   protected float f(float $$0, float $$1) {
      float $$2 = azn.h($$0 - this.aX);
      this.aX += $$2 * 0.3F;
      float $$3 = azn.h(this.dO() - this.aX);
      float $$4 = this.ft();
      if (Math.abs($$3) > $$4) {
         this.aX = this.aX + ($$3 - (float)azn.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float ft() {
      return 50.0F;
   }

   public void n_() {
      if (this.ce > 0) {
         this.ce--;
      }

      if (this.dk()) {
         this.br = 0;
         this.f(this.dD(), this.dF(), this.dJ());
      }

      if (this.br > 0) {
         this.a(this.br, this.bs, this.bt, this.bu, this.bv, this.bw);
         this.br--;
      } else if (!this.dl()) {
         this.h(this.dB().c(0.98));
      }

      if (this.by > 0) {
         this.a(this.by, this.bx);
         this.by--;
      }

      ezr $$0 = this.dB();
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
      bor $$4 = boq.a();
      $$4.a("ai");
      if (this.fl()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      } else if (this.dl()) {
         $$4.a("newAi");
         this.fx();
         $$4.c();
      }

      $$4.c();
      $$4.a("jump");
      if (this.bn && this.en()) {
         double $$5;
         if (this.bz()) {
            $$5 = this.b(axj.b);
         } else {
            $$5 = this.b(axj.a);
         }

         boolean $$7 = this.bl() && $$5 > 0.0;
         double $$8 = this.ds();
         if (!$$7 || this.aL() && !($$5 > $$8)) {
            if (!this.bz() || this.aL() && !($$5 > $$8)) {
               if ((this.aL() || $$7 && $$5 <= $$8) && this.ce == 0) {
                  this.v();
                  this.ce = 10;
               }
            } else {
               this.c(axj.b);
            }
         } else {
            this.c(axj.a);
         }
      } else {
         this.ce = 0;
      }

      $$4.c();
      $$4.a("travel");
      this.bo *= 0.98F;
      this.bq *= 0.98F;
      if (this.fM()) {
         this.fv();
      }

      ezm $$9 = this.cT();
      ezr $$10 = new ezr((double)this.bo, (double)this.bp, (double)this.bq);
      if (this.b(btp.B) || this.b(btp.y)) {
         this.n();
      }

      label115: {
         if (this.cZ() instanceof cor $$11 && this.bN()) {
            this.c($$11, $$10);
            break label115;
         }

         this.a_($$10);
      }

      if (!this.dY().y_() || this.dk()) {
         this.aM();
      }

      this.s(this instanceof che);
      $$4.c();
      $$4.a("freezing");
      if (!this.dY().C && !this.eI()) {
         int $$12 = this.cw();
         if (this.aw && this.dM()) {
            this.k(Math.min(this.cz(), $$12 + 1));
         } else {
            this.k(Math.max(0, $$12 - 2));
         }
      }

      this.ej();
      this.ek();
      if (!this.dY().C && this.ag % 40 == 0 && this.cy() && this.dM()) {
         this.a(this.dZ().v(), 1.0F);
      }

      $$4.c();
      $$4.a("push");
      if (this.bC > 0) {
         this.bC--;
         this.a($$9, this.cT());
      }

      this.r();
      $$4.c();
      if (!this.dY().C && this.fu() && this.bn()) {
         this.a(this.dZ().i(), 1.0F);
      }
   }

   public boolean fu() {
      return false;
   }

   protected void fv() {
      this.cA();
      if (!this.dY().C) {
         if (!this.fw()) {
            this.b(7, false);
            return;
         }

         int $$0 = this.bB + 1;
         if ($$0 % 10 == 0) {
            int $$1 = $$0 / 10;
            if ($$1 % 2 == 0) {
               List<buq> $$2 = buq.i.stream().filter($$0x -> b(this.a($$0x), $$0x)).toList();
               buq $$3 = ae.a($$2, this.af);
               this.a($$3).a(1, this, $$3);
            }

            this.a(eak.n);
         }
      }
   }

   protected boolean fw() {
      if (!this.aL() && !this.cb() && !this.b(btp.y)) {
         for (buq $$0 : buq.i) {
            if (b(this.a($$0), $$0)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   protected void fx() {
   }

   protected void r() {
      if (this.dY().y_()) {
         this.dY().a(dzy.a(cor.class), this.cT(), bun.a(this)).forEach(this::F);
      } else {
         List<bui> $$0 = this.dY().a(this, this.cT(), bun.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dY().ac().c(dfb.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.af.a(4) == 0) {
               int $$2 = 0;

               for (bui $$3 : $$0) {
                  if (!$$3.cb()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dZ().h(), 6.0F);
               }
            }

            for (bui $$4 : $$0) {
               this.F($$4);
            }
         }
      }
   }

   protected void a(ezm $$0, ezm $$1) {
      ezm $$2 = $$0.b($$1);
      List<bui> $$3 = this.dY().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bui $$4 : $$3) {
            if ($$4 instanceof bve) {
               this.g((bve)$$4);
               this.bC = 0;
               this.h(this.dB().c(-0.2));
               break;
            }
         }
      } else if (this.Q) {
         this.bC = 0;
      }

      if (!this.dY().C && this.bC <= 0) {
         this.c(4, false);
         this.bD = 0.0F;
         this.bE = null;
      }
   }

   protected void F(bui $$0) {
      $$0.h(this);
   }

   protected void g(bve $$0) {
   }

   public boolean fy() {
      return (this.am.a(aD) & 4) != 0;
   }

   @Override
   public void af() {
      bui $$0 = this.dm();
      super.af();
      if ($$0 != null && $$0 != this.dm() && !this.dY().C) {
         this.d($$0);
      }
   }

   @Override
   public void u() {
      super.u();
      this.bg = this.bh;
      this.bh = 0.0F;
      this.n();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.bs = $$0;
      this.bt = $$1;
      this.bu = $$2;
      this.bv = (double)$$3;
      this.bw = (double)$$4;
      this.br = $$5;
   }

   @Override
   public double d_() {
      return this.br > 0 ? this.bs : this.dD();
   }

   @Override
   public double e_() {
      return this.br > 0 ? this.bt : this.dF();
   }

   @Override
   public double P_() {
      return this.br > 0 ? this.bu : this.dJ();
   }

   @Override
   public float Q_() {
      return this.br > 0 ? (float)this.bw : this.dQ();
   }

   @Override
   public float f_() {
      return this.br > 0 ? (float)this.bv : this.dO();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bx = (double)$$0;
      this.by = $$1;
   }

   public void t(boolean $$0) {
      this.bn = $$0;
   }

   public void a(ckz $$0) {
      bui $$1 = $$0.s();
      if ($$1 instanceof arr) {
         ao.R.a((arr)$$1, $$0.m(), this);
      }
   }

   public void a(bui $$0, int $$1) {
      if (!$$0.dT() && !this.dY().C && ($$0 instanceof ckz || $$0 instanceof coy || $$0 instanceof buu)) {
         ((arq)this.dY()).l().b($$0, new agl($$0.as(), this.as(), $$1));
      }
   }

   public boolean G(bui $$0) {
      if ($$0.dY() != this.dY()) {
         return false;
      } else {
         ezr $$1 = new ezr(this.dD(), this.dH(), this.dJ());
         ezr $$2 = new ezr($$0.dD(), $$0.dH(), $$0.dJ());
         return $$2.f($$1) > 128.0 ? false : this.dY().a(new den($$1, $$2, den.a.a, den.b.a, this)).d() == ezp.a.a;
      }
   }

   @Override
   public float i(float $$0) {
      return $$0 == 1.0F ? this.aZ : azn.i($$0, this.ba, this.aZ);
   }

   public float D(float $$0) {
      float $$1 = this.aR - this.aQ;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aQ + $$1 * $$0;
   }

   @Override
   public boolean bJ() {
      return !this.dT();
   }

   @Override
   public boolean bK() {
      return this.bN() && !this.R_() && !this.q_();
   }

   @Override
   public float cC() {
      return this.aZ;
   }

   @Override
   public void q(float $$0) {
      this.aZ = $$0;
   }

   @Override
   public void r(float $$0) {
      this.aX = $$0;
   }

   @Override
   public ezr a(jm.a $$0, l.a $$1) {
      return j(super.a($$0, $$1));
   }

   public static ezr j(ezr $$0) {
      return new ezr($$0.d, $$0.e, 0.0);
   }

   public float fz() {
      return this.cf;
   }

   public final void E(float $$0) {
      this.F(azn.a($$0, 0.0F, this.eX()));
   }

   protected void F(float $$0) {
      this.cf = $$0;
   }

   public void g_() {
   }

   public void h_() {
   }

   protected void fA() {
      this.bY = true;
   }

   public abstract buy fB();

   public boolean fC() {
      return (this.am.a(aD) & 1) > 0;
   }

   public bsg fD() {
      return (this.am.a(aD) & 2) > 0 ? bsg.b : bsg.a;
   }

   private void M() {
      if (this.fC()) {
         if (cwf.b(this.b(this.fD()), this.bz)) {
            this.bz = this.b(this.fD());
            this.a(this.bz);
         } else {
            this.fI();
         }
      }
   }

   protected void a(cwf $$0) {
      $$0.b(this.dY(), this, this.fF());
      if (--this.bA == 0 && !this.dY().C && !$$0.x()) {
         this.z();
      }
   }

   private void O() {
      this.cl = this.ck;
      if (this.cn()) {
         this.ck = Math.min(1.0F, this.ck + 0.09F);
      } else {
         this.ck = Math.max(0.0F, this.ck - 0.09F);
      }
   }

   protected void c(int $$0, boolean $$1) {
      int $$2 = this.am.a(aD);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.am.a(aD, (byte)$$2);
   }

   public void c(bsg $$0) {
      cwf $$1 = this.b($$0);
      if (!$$1.f() && !this.fC()) {
         this.bz = $$1;
         this.bA = $$1.a(this);
         if (!this.dY().C) {
            this.c(1, true);
            this.c(2, $$0 == bsg.b);
            this.a(eak.D);
         }
      }
   }

   @Override
   public void a(ako<?> $$0) {
      super.a($$0);
      if (bP.equals($$0)) {
         if (this.dY().C) {
            this.fS().ifPresent(this::a);
         }
      } else if (aD.equals($$0) && this.dY().C) {
         if (this.fC() && this.bz.f()) {
            this.bz = this.b(this.fD());
            if (!this.bz.f()) {
               this.bA = this.bz.a(this);
            }
         } else if (!this.fC() && !this.bz.f()) {
            this.bz = cwf.k;
            this.bA = 0;
         }
      }
   }

   @Override
   public void a(fi.a $$0, ezr $$1) {
      super.a($$0, $$1);
      this.ba = this.aZ;
      this.aX = this.aZ;
      this.aY = this.aX;
   }

   @Override
   public float t(float $$0) {
      return azn.h($$0, this.aY, this.aX);
   }

   public void b(cwf $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ezr $$3 = new ezr(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dQ() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dO() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.af.i()) * 0.6 - 0.3;
         ezr $$5 = new ezr(((double)this.af.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dQ() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dO() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dD(), this.dH(), this.dJ());
         this.dY().a(new lo(ls.S, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void z() {
      if (!this.dY().C || this.fC()) {
         bsg $$0 = this.fD();
         if (!this.bz.equals(this.b($$0))) {
            this.fH();
         } else {
            if (!this.bz.f() && this.fC()) {
               cwf $$1 = this.bz.a(this.dY(), this);
               if ($$1 != this.bz) {
                  this.a($$0, $$1);
               }

               this.fI();
            }
         }
      }
   }

   public cwf fE() {
      return this.bz;
   }

   public int fF() {
      return this.bA;
   }

   public int fG() {
      return this.fC() ? this.bz.a(this) - this.fF() : 0;
   }

   public void fH() {
      if (!this.bz.f()) {
         this.bz.a(this.dY(), this, this.fF());
         if (this.bz.x()) {
            this.M();
         }
      }

      this.fI();
   }

   public void fI() {
      if (!this.dY().C) {
         boolean $$0 = this.fC();
         this.c(1, false);
         if ($$0) {
            this.a(eak.C);
         }
      }

      this.bz = cwf.k;
      this.bA = 0;
   }

   public boolean fJ() {
      return this.fK() != null;
   }

   @Nullable
   public cwf fK() {
      if (this.fC() && !this.bz.f()) {
         cwb $$0 = this.bz.h();
         if ($$0.b(this.bz) != cwh.d) {
            return null;
         } else {
            return $$0.a(this.bz, this) - this.bA < 5 ? null : this.bz;
         }
      } else {
         return null;
      }
   }

   public boolean fL() {
      return this.cf();
   }

   public boolean fM() {
      return this.i(7);
   }

   @Override
   public boolean cn() {
      return super.cn() || !this.fM() && this.c(bvq.b);
   }

   public int fN() {
      return this.bB;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dD();
      double $$5 = this.dF();
      double $$6 = this.dJ();
      double $$7 = $$1;
      boolean $$8 = false;
      jh $$9 = jh.a($$0, $$1, $$2);
      dff $$10 = this.dY();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.I_()) {
            jh $$12 = $$9.e();
            dvo $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.c($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cT())) {
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

         if (this instanceof bvm $$14) {
            $$14.P().o();
         }

         return true;
      }
   }

   public boolean fO() {
      return !this.eI();
   }

   public boolean fP() {
      return true;
   }

   public void a(jh $$0, boolean $$1) {
   }

   public boolean fQ() {
      return false;
   }

   @Override
   public final bul a(bvq $$0) {
      return $$0 == bvq.c ? aE : this.e($$0).a(this.em());
   }

   protected bul e(bvq $$0) {
      return this.ar().n().a(this.el());
   }

   public ImmutableList<bvq> fR() {
      return ImmutableList.of(bvq.a);
   }

   public ezm f(bvq $$0) {
      bul $$1 = this.a($$0);
      return new ezm((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bvq $$0) {
      ezm $$1 = this.a($$0).a(this.dw());
      return this.dY().b(this, $$1);
   }

   @Override
   public boolean o(boolean $$0) {
      return super.o($$0) && !this.fU();
   }

   public Optional<jh> fS() {
      return this.am.a(bP);
   }

   public void g(jh $$0) {
      this.am.a(bP, Optional.of($$0));
   }

   public void fT() {
      this.am.a(bP, Optional.empty());
   }

   public boolean fU() {
      return this.fS().isPresent();
   }

   public void b(jh $$0) {
      if (this.cb()) {
         this.af();
      }

      dvo $$1 = this.dY().a_($$0);
      if ($$1.b() instanceof dic) {
         this.dY().a($$0, $$1.b(dic.c, Boolean.valueOf(true)), 3);
      }

      this.b(bvq.c);
      this.a($$0);
      this.g($$0);
      this.h(ezr.c);
      this.as = true;
   }

   private void a(jh $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean P() {
      return this.fS().map($$0 -> this.dY().a_($$0).b() instanceof dic).orElse(false);
   }

   public void fV() {
      this.fS().filter(this.dY()::B).ifPresent($$0x -> {
         dvo $$1 = this.dY().a_($$0x);
         if ($$1.b() instanceof dic) {
            jm $$2 = $$1.c(dic.aF);
            this.dY().a($$0x, $$1.b(dic.c, Boolean.valueOf(false)), 3);
            ezr $$3 = dic.a(this.ar(), this.dY(), $$0x, $$2, this.dO()).orElseGet(() -> {
               jh $$1x = $$0x.d();
               return new ezr((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            ezr $$4 = ezr.c($$0x).d($$3).d();
            float $$5 = (float)azn.d(azn.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.v($$5);
            this.w(0.0F);
         }
      });
      ezr $$0 = this.dw();
      this.b(bvq.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fT();
   }

   @Nullable
   public jm fW() {
      jh $$0 = this.fS().orElse(null);
      return $$0 != null ? dic.a(this.dY(), $$0) : null;
   }

   @Override
   public boolean bO() {
      return !this.fU() && super.bO();
   }

   public cwf d(cwf $$0) {
      return cwf.k;
   }

   private static byte i(buq $$0) {
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

   public void a(cwb $$0, buq $$1) {
      this.dY().a(this, i($$1));
      this.a(this.a($$1), $$1, this.bR);
   }

   private void a(cwf $$0, buq $$1, bwj $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         bwi $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      dby.a($$0, this, $$1);
   }

   public static buq d(bsg $$0) {
      return $$0 == bsg.a ? buq.a : buq.b;
   }

   public final boolean e(cwf $$0) {
      if (this.bN() && !this.R_()) {
         ddr $$1 = $$0.a(ku.D);
         if ($$1 != null && $$1.e()) {
            buq $$2 = $$1.a();
            return this.e($$2) && $$1.a(this.ar()) ? this.a($$2).f() && this.f($$2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected boolean f(buq $$0) {
      return true;
   }

   public final buq f(cwf $$0) {
      ddr $$1 = $$0.a(ku.D);
      return $$1 != null && this.e($$1.a()) ? $$1.a() : buq.a;
   }

   public final boolean a(cwf $$0, buq $$1) {
      ddr $$2 = $$0.a(ku.D);
      return $$2 == null ? $$1 == buq.a && this.e(buq.a) : $$1 == $$2.a() && this.e($$2.a()) && $$2.a(this.ar());
   }

   private static bvw a(bve $$0, buq $$1) {
      return $$1 != buq.f && $$1 != buq.a && $$1 != buq.b ? bvw.a($$0, $$1, $$2 -> $$2.f() || $$0.f($$2) == $$1) : bvw.a($$0, $$1);
   }

   @Nullable
   private static buq s(int $$0) {
      if ($$0 == 100 + buq.f.b()) {
         return buq.f;
      } else if ($$0 == 100 + buq.e.b()) {
         return buq.e;
      } else if ($$0 == 100 + buq.d.b()) {
         return buq.d;
      } else if ($$0 == 100 + buq.c.b()) {
         return buq.c;
      } else if ($$0 == 98) {
         return buq.a;
      } else if ($$0 == 99) {
         return buq.b;
      } else {
         return $$0 == 105 ? buq.g : null;
      }
   }

   @Override
   public bvw a_(int $$0) {
      buq $$1 = s($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dM() {
      if (this.R_()) {
         return false;
      } else {
         boolean $$0 = !this.a(buq.f).a(axm.br) && !this.a(buq.e).a(axm.br) && !this.a(buq.d).a(axm.br) && !this.a(buq.c).a(axm.br) && !this.a(buq.g).a(axm.br);
         return $$0 && super.dM();
      }
   }

   @Override
   public boolean cq() {
      return !this.dY().y_() && this.b(btp.x) || super.cq();
   }

   @Override
   public float dP() {
      return this.aX;
   }

   @Override
   public void a(aci $$0) {
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      float $$4 = $$0.n();
      float $$5 = $$0.m();
      this.f($$1, $$2, $$3);
      this.aX = $$0.o();
      this.aZ = $$0.o();
      this.aY = this.aX;
      this.ba = this.aZ;
      this.e($$0.b());
      this.a_($$0.e());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.n($$0.j(), $$0.k(), $$0.l());
   }

   public boolean fX() {
      return this.ec().h() instanceof cuh;
   }

   @Override
   public float dS() {
      float $$0 = (float)this.h(bwm.B);
      return this.cZ() instanceof cor ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public ezr m(bui $$0) {
      return this.dw().e(this.a($$0, this.a(this.ay()), this.em() * this.el()));
   }

   protected void a(int $$0, double $$1) {
      this.aZ = (float)azn.e(1.0 / (double)$$0, (double)this.aZ, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(azn.c((double)$$0 * this.h(bwm.h)));
   }

   public boolean fY() {
      return false;
   }

   @Override
   public boolean b(bsy $$0) {
      if (super.b($$0)) {
         return true;
      } else {
         if (this.dY() instanceof arq $$1 && dby.a($$1, this, $$0)) {
            return true;
         }

         return false;
      }
   }

   public static boolean b(cwf $$0, buq $$1) {
      if (!$$0.b(ku.F)) {
         return false;
      } else {
         ddr $$2 = $$0.a(ku.D);
         return $$2 != null && $$1 == $$2.a() && !$$0.r();
      }
   }

   @VisibleForTesting
   public int fZ() {
      return this.bd;
   }

   public static record a(awn a, awn b) {
   }
}
