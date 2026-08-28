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

public abstract class buf extends btj implements btf {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final alb d = alb.b("powder_snow");
   private static final alb e = alb.b("sprinting");
   private static final bvk bE = new bvk(e, 0.3F, bvk.a.c);
   public static final int i = 2;
   public static final int j = 4;
   public static final int k = 98;
   public static final int l = 100;
   public static final int m = 105;
   public static final int n = 6;
   public static final int o = 100;
   private static final int bF = 40;
   public static final double p = 0.003;
   public static final double q = 0.08;
   public static final int r = 20;
   private static final int bG = 10;
   private static final int bH = 2;
   public static final int s = 4;
   public static final float t = 0.42F;
   private static final double bI = 128.0;
   protected static final int u = 1;
   protected static final int v = 2;
   protected static final int az = 4;
   protected static final akg<Byte> aA = akk.a(buf.class, aki.a);
   private static final akg<Float> bJ = akk.a(buf.class, aki.d);
   private static final akg<List<ll>> bK = akk.a(buf.class, aki.m);
   private static final akg<Boolean> bL = akk.a(buf.class, aki.k);
   private static final akg<Integer> bM = akk.a(buf.class, aki.b);
   private static final akg<Integer> bN = akk.a(buf.class, aki.b);
   private static final akg<Optional<je>> bO = akk.a(buf.class, aki.p);
   private static final int bP = 15;
   protected static final btm aB = btm.c(0.2F, 0.2F).b(0.2F);
   public static final float aC = 0.5F;
   public static final float aD = 0.5F;
   private static final float bQ = 0.21875F;
   public static final String aE = "attributes";
   private final bvj bR;
   private final bry bS = new bry(this);
   private final Map<jn<bso>, bsq> bT = Maps.newHashMap();
   private final jw<cvl> bU = jw.a(2, cvl.k);
   private final jw<cvl> bV = jw.a(4, cvl.k);
   private cvl bW = cvl.k;
   public boolean aF;
   private boolean bX = false;
   public brj aG;
   public int aH;
   public int aI;
   public int aJ;
   public int aK;
   public int aL;
   public int aM;
   public float aN;
   public float aO;
   protected int aP;
   public final bvf aQ = new bvf();
   public final int aR = 20;
   public final float aS;
   public final float aT;
   public float aU;
   public float aV;
   public float aW;
   public float aX;
   public final bti aY = new bti(this);
   @Nullable
   protected cnp aZ;
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
   private boolean bY = true;
   @Nullable
   private buf bZ;
   private int ca;
   @Nullable
   private buf cb;
   private int cc;
   private float cd;
   private int ce;
   private float cf;
   protected cvl bw = cvl.k;
   protected int bx;
   protected int by;
   private je cg;
   private Optional<je> ch = Optional.empty();
   @Nullable
   private bsb ci;
   private long cj;
   protected int bz;
   protected float bA;
   @Nullable
   protected cvl bB;
   private float ck;
   private float cl;
   protected bvg<?> bC;
   private boolean cm;
   private final EnumMap<btr, Reference2ObjectMap<daw, Set<dbo>>> cn = new EnumMap<>(btr.class);
   protected float bD = 1.0F;

   protected buf(btq<? extends buf> $$0, dds $$1) {
      super($$0, $$1);
      this.bR = new bvj(bvn.a($$0));
      this.x(this.eQ());
      this.J = true;
      this.aT = (float)((Math.random() + 1.0) * 0.01F);
      this.ax();
      this.aS = (float)Math.random() * 12398.0F;
      this.v((float)(Math.random() * (float) (Math.PI * 2)));
      this.aW = this.dI();
      ut $$2 = ut.a;
      this.bC = this.a(new Dynamic($$2, (vc)$$2.createMap(ImmutableMap.of($$2.a("memories"), (vc)$$2.emptyMap()))));
   }

   public bvg<?> dX() {
      return this.bC;
   }

   protected bvg.b<?> dY() {
      return bvg.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bvg<?> a(Dynamic<?> $$0) {
      return this.dY().a($$0);
   }

   @Override
   public void ar() {
      this.a(this.dT().y(), Float.MAX_VALUE);
   }

   public boolean a(btq<?> $$0) {
      return true;
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(aA, (byte)0);
      $$0.a(bK, List.of());
      $$0.a(bL, false);
      $$0.a(bM, 0);
      $$0.a(bN, 0);
      $$0.a(bJ, 1.0F);
      $$0.a(bO, Optional.empty());
   }

   public static bvl.a dZ() {
      return bvl.a()
         .a(bvm.s)
         .a(bvm.p)
         .a(bvm.v)
         .a(bvm.a)
         .a(bvm.b)
         .a(bvm.r)
         .a(bvm.B)
         .a(bvm.y)
         .a(bvm.n)
         .a(bvm.x)
         .a(bvm.k)
         .a(bvm.o)
         .a(bvm.w)
         .a(bvm.h)
         .a(bvm.i)
         .a(bvm.F)
         .a(bvm.u)
         .a(bvm.d);
   }

   @Override
   protected void a(double $$0, boolean $$1, dua $$2, je $$3) {
      if (!this.bi()) {
         this.bq();
      }

      if (this.dS() instanceof arg $$4 && $$1 && this.aa > 0.0F) {
         this.b($$4, $$3);
         double $$5 = this.h(bvm.x);
         if ((double)this.aa > $$5 && !$$2.l()) {
            double $$6 = this.dx();
            double $$7 = this.dz();
            double $$8 = this.dD();
            je $$9 = this.ds();
            if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
               double $$10 = $$6 - (double)$$3.u() - 0.5;
               double $$11 = $$8 - (double)$$3.w() - 0.5;
               double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
               $$6 = (double)$$3.u() + 0.5 + $$10 / $$12 * 0.5;
               $$8 = (double)$$3.w() + 0.5 + $$11 / $$12 * 0.5;
            }

            float $$13 = (float)azc.c((double)this.aa - $$5);
            double $$14 = Math.min((double)(0.2F + $$13 / 15.0F), 2.5);
            int $$15 = (int)(150.0 * $$14);
            ((arg)this.dS()).a(new lf(ln.b, $$2), $$6, $$7, $$8, $$15, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.ch = Optional.empty();
      }
   }

   public final boolean ea() {
      return this.ao().a(aww.m);
   }

   public float a(float $$0) {
      return azc.h($$0, this.cl, this.ck);
   }

   public boolean eb() {
      return this.dv().b() < 1.0E-5F && this.bm();
   }

   @Override
   public void ay() {
      this.aN = this.aO;
      if (this.al) {
         this.fJ().ifPresent(this::a);
      }

      if (this.dS() instanceof arg $$0) {
         day.b($$0, this);
      }

      super.ay();
      this.dS().ah().a("livingEntityBaseTick");
      if (this.bh() || this.dS().B) {
         this.aF();
      }

      if (this.bI()) {
         boolean $$1 = this instanceof cnp;
         if (!this.dS().B) {
            if (this.bJ()) {
               this.a(this.dT().g(), 1.0F);
            } else if ($$1 && !this.dS().A_().a(this.cO())) {
               double $$2 = this.dS().A_().a(this) + this.dS().A_().n();
               if ($$2 < 0.0) {
                  double $$3 = this.dS().A_().o();
                  if ($$3 > 0.0) {
                     this.a(this.dT().x(), (float)Math.max(1, azc.a(-$$2 * $$3)));
                  }
               }
            }
         }

         if (this.a(awy.a) && !this.dS().a_(je.a(this.dx(), this.dB(), this.dD())).a(dgx.nd)) {
            boolean $$4 = !this.ea() && !bsr.c(this) && (!$$1 || !((cnp)this).gd().a);
            if ($$4) {
               this.j(this.m(this.cq()));
               if (this.cq() == -20) {
                  this.j(0);
                  eye $$5 = this.dv();

                  for (int $$6 = 0; $$6 < 8; $$6++) {
                     double $$7 = this.af.j() - this.af.j();
                     double $$8 = this.af.j() - this.af.j();
                     double $$9 = this.af.j() - this.af.j();
                     this.dS().a(ln.d, this.dx() + $$7, this.dz() + $$8, this.dD() + $$9, $$5.d, $$5.e, $$5.f);
                  }

                  this.a(this.dT().i(), 2.0F);
               }
            }

            if (!this.dS().B && this.bW() && this.dg() != null && this.dg().bY()) {
               this.af();
            }
         } else if (this.cq() < this.cp()) {
            this.j(this.n(this.cq()));
         }

         if (this.dS() instanceof arg $$10) {
            je $$11 = this.ds();
            if (!Objects.equal(this.cg, $$11)) {
               this.cg = $$11;
               this.b($$10, $$11);
            }
         }
      }

      if (this.bI() && (this.bk() || this.aw)) {
         this.aL();
      }

      if (this.aK > 0) {
         this.aK--;
      }

      if (this.ak > 0 && !(this instanceof arh)) {
         this.ak--;
      }

      if (this.eB() && this.dS().h(this)) {
         this.eh();
      }

      if (this.ba > 0) {
         this.ba--;
      } else {
         this.aZ = null;
      }

      if (this.cb != null && !this.cb.bI()) {
         this.cb = null;
      }

      if (this.bZ != null) {
         if (!this.bZ.bI()) {
            this.a(null);
         } else if (this.ag - this.ca > 100) {
            this.a(null);
         }
      }

      this.es();
      this.bg = this.bf;
      this.aV = this.aU;
      this.aX = this.aW;
      this.O = this.dI();
      this.P = this.dK();
      this.dS().ah().c();
   }

   @Override
   protected float aR() {
      return azc.h((float)this.h(bvm.u), super.aR(), 1.0F);
   }

   protected void ec() {
      bvi $$0 = this.g(bvm.v);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.c(d);
         }
      }
   }

   protected void ed() {
      if (!this.bs().l()) {
         int $$0 = this.cr();
         if ($$0 > 0) {
            bvi $$1 = this.g(bvm.v);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cs();
            $$1.b(new bvk(d, (double)$$2, bvk.a.a));
         }
      }
   }

   protected void b(arg $$0, je $$1) {
      day.a($$0, this);
   }

   public boolean o_() {
      return false;
   }

   public float ee() {
      return this.o_() ? 0.5F : 1.0F;
   }

   public final float ef() {
      bvj $$0 = this.eV();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bvm.y));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean eg() {
      return true;
   }

   protected void eh() {
      this.aM++;
      if (this.aM >= 20 && !this.dS().w_() && !this.dN()) {
         this.dS().a(this, (byte)60);
         this.a(btj.c.a);
      }
   }

   public boolean ei() {
      return !this.o_();
   }

   protected boolean ej() {
      return !this.o_();
   }

   protected int m(int $$0) {
      bvi $$1 = this.g(bvm.w);
      double $$2;
      if ($$1 != null) {
         $$2 = $$1.g();
      } else {
         $$2 = 0.0;
      }

      return $$2 > 0.0 && this.af.j() >= 1.0 / ($$2 + 1.0) ? $$0 : $$0 - 1;
   }

   protected int n(int $$0) {
      return Math.min($$0 + 4, this.cp());
   }

   public final int a(arg $$0, @Nullable btj $$1) {
      return day.a($$0, $$1, this, this.ek());
   }

   protected int ek() {
      return 0;
   }

   protected boolean el() {
      return false;
   }

   @Nullable
   public buf em() {
      return this.bZ;
   }

   @Override
   public buf X_() {
      return this.em();
   }

   public int en() {
      return this.ca;
   }

   public void c(@Nullable cnp $$0) {
      this.aZ = $$0;
      this.ba = this.ag;
   }

   public void a(@Nullable buf $$0) {
      this.bZ = $$0;
      this.ca = this.ag;
   }

   @Nullable
   public buf eo() {
      return this.cb;
   }

   public int ep() {
      return this.cc;
   }

   public void B(btj $$0) {
      if ($$0 instanceof buf) {
         this.cb = (buf)$$0;
      } else {
         this.cb = null;
      }

      this.cc = this.ag;
   }

   public int eq() {
      return this.bc;
   }

   public void o(int $$0) {
      this.bc = $$0;
   }

   public boolean er() {
      return this.bX;
   }

   public void r(boolean $$0) {
      this.bX = $$0;
   }

   protected boolean b(btr $$0) {
      return true;
   }

   public void a(btr $$0, cvl $$1, cvl $$2) {
      boolean $$3 = $$2.f() && $$1.f();
      if (!$$3 && !cvl.c($$1, $$2) && !this.al) {
         cun $$4 = cun.c_($$2);
         if (!this.dS().w_() && !this.P_()) {
            if (!this.ba() && $$4 != null && $$4.m() == $$0) {
               this.dS().a(null, this.dx(), this.dz(), this.dD(), $$4.n(), this.di(), 1.0F, 1.0F, this.af.g());
            }

            if (this.b($$0)) {
               this.a($$4 != null ? dyx.v : dyx.S);
            }
         }
      }
   }

   @Override
   public void a(btj.c $$0) {
      if ($$0 == btj.c.a || $$0 == btj.c.b) {
         this.c($$0);
      }

      super.a($$0);
      this.bC.a();
   }

   protected void c(btj.c $$0) {
      for (bsq $$1 : this.ex()) {
         $$1.a(this, $$0);
      }

      this.bT.clear();
   }

   @Override
   public void b(uf $$0) {
      $$0.a("Health", this.eA());
      $$0.a("HurtTime", (short)this.aK);
      $$0.a("HurtByTimestamp", this.ca);
      $$0.a("DeathTime", (short)this.aM);
      $$0.a("AbsorptionAmount", this.fs());
      $$0.a("attributes", this.eV().d());
      if (!this.bT.isEmpty()) {
         ul $$1 = new ul();

         for (bsq $$2 : this.bT.values()) {
            $$1.add($$2.j());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fE());
      this.fJ().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<vc> $$3 = this.bC.a(ut.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(uf $$0) {
      this.F($$0.j("AbsorptionAmount"));
      if ($$0.b("attributes", 9) && this.dS() != null && !this.dS().B) {
         this.eV().a($$0.c("attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         ul $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            uf $$3 = $$1.a($$2);
            bsq $$4 = bsq.a($$3);
            if ($$4 != null) {
               this.bT.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.x($$0.j("Health"));
      }

      this.aK = $$0.g("HurtTime");
      this.aM = $$0.g("DeathTime");
      this.ca = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         ezi $$6 = this.dS().O();
         ezd $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cE(), $$7);
         if (!$$8) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         je $$9 = new je($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$9);
         this.am.a(ar, bur.c);
         if (!this.al) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bC = this.a(new Dynamic(ut.a, $$0.c("Brain")));
      }
   }

   protected void es() {
      Iterator<jn<bso>> $$0 = this.bT.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            jn<bso> $$1 = $$0.next();
            bsq $$2 = this.bT.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dS().B) {
                  $$0.remove();
                  this.a($$2);
               }
            } else if ($$2.d() % 600 == 0) {
               this.a($$2, false, null);
            }
         }
      } catch (ConcurrentModificationException var6) {
      }

      if (this.bY) {
         if (!this.dS().B) {
            this.L();
            this.w();
         }

         this.bY = false;
      }

      List<ll> $$3 = this.am.a(bK);
      if (!$$3.isEmpty()) {
         boolean $$4 = this.am.a(bL);
         int $$5 = this.cm() ? 15 : 4;
         int $$6 = $$4 ? 5 : 1;
         if (this.af.a($$5 * $$6) == 0) {
            this.dS().a(ad.a($$3, this.af), this.d(0.5), this.dA(), this.g(0.5), 1.0, 1.0, 1.0);
         }
      }
   }

   protected void L() {
      if (this.bT.isEmpty()) {
         this.ev();
         this.k(false);
      } else {
         this.k(this.b(bss.n));
         this.q();
      }
   }

   private void q() {
      List<ll> $$0 = this.bT.values().stream().filter(bsq::g).map(bsq::a).toList();
      this.am.a(bK, $$0);
      this.am.a(bL, c(this.bT.values()));
   }

   private void w() {
      boolean $$0 = this.cl();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double C(@Nullable btj $$0) {
      double $$1 = 1.0;
      if (this.cd()) {
         $$1 *= 0.8;
      }

      if (this.cm()) {
         float $$2 = this.fc();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cvl $$3 = this.a(btr.f);
         btq<?> $$4 = $$0.ao();
         if ($$4 == btq.aN && $$3.a(cvo.un)
            || $$4 == btq.bu && $$3.a(cvo.uq)
            || $$4 == btq.aA && $$3.a(cvo.ut)
            || $$4 == btq.aB && $$3.a(cvo.ut)
            || $$4 == btq.x && $$3.a(cvo.ur)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(buf $$0) {
      return $$0 instanceof cnp && this.dS().am() == brh.a ? false : $$0.et();
   }

   public boolean a(buf $$0, cev $$1) {
      return $$1.a(this, $$0);
   }

   public boolean et() {
      return !this.cz() && this.eu();
   }

   public boolean eu() {
      return !this.P_() && this.bI();
   }

   public static boolean c(Collection<bsq> $$0) {
      for (bsq $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void ev() {
      this.am.a(bK, List.of());
   }

   public boolean ew() {
      if (this.dS().B) {
         return false;
      } else {
         Iterator<bsq> $$0 = this.bT.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<bsq> ex() {
      return this.bT.values();
   }

   public Map<jn<bso>, bsq> ey() {
      return this.bT;
   }

   public boolean b(jn<bso> $$0) {
      return this.bT.containsKey($$0);
   }

   @Nullable
   public bsq c(jn<bso> $$0) {
      return this.bT.get($$0);
   }

   public final boolean b(bsq $$0) {
      return this.b($$0, null);
   }

   public boolean b(bsq $$0, @Nullable btj $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         bsq $$2 = this.bT.get($$0.c());
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

   public boolean c(bsq $$0) {
      if (this.ao().a(aww.G)) {
         return !$$0.a(bss.M);
      } else if (this.ao().a(aww.F)) {
         return !$$0.a(bss.L);
      } else {
         return !this.ao().a(aww.w) ? true : !$$0.a(bss.j) && !$$0.a(bss.s);
      }
   }

   public void c(bsq $$0, @Nullable btj $$1) {
      if (this.c($$0)) {
         bsq $$2 = this.bT.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean ez() {
      return this.ao().a(aww.x);
   }

   @Nullable
   public bsq d(jn<bso> $$0) {
      return this.bT.remove($$0);
   }

   public boolean e(jn<bso> $$0) {
      bsq $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(bsq $$0, @Nullable btj $$1) {
      this.bY = true;
      if (!this.dS().B) {
         $$0.c().a().a(this.eV(), $$0.e());
         this.d($$0);
      }
   }

   public void d(bsq $$0) {
      for (btj $$1 : this.cW()) {
         if ($$1 instanceof arh $$2) {
            $$2.c.b(new agj(this.ap(), $$0, false));
         }
      }
   }

   protected void a(bsq $$0, boolean $$1, @Nullable btj $$2) {
      this.bY = true;
      if ($$1 && !this.dS().B) {
         bso $$3 = $$0.c().a();
         $$3.a(this.eV());
         $$3.a(this.eV(), $$0.e());
         this.D();
      }

      if (!this.dS().B) {
         this.d($$0);
      }
   }

   protected void a(bsq $$0) {
      this.bY = true;
      if (!this.dS().B) {
         $$0.c().a().a(this.eV());
         this.D();

         for (btj $$1 : this.cW()) {
            if ($$1 instanceof arh $$2) {
               $$2.c.b(new aem(this.ap(), $$0.c()));
            }
         }
      }
   }

   private void D() {
      Set<bvi> $$0 = this.eV().b();

      for (bvi $$1 : $$0) {
         this.f($$1.a());
      }

      $$0.clear();
   }

   protected void f(jn<bvh> $$0) {
      if ($$0.a(bvm.s)) {
         float $$1 = this.eQ();
         if (this.eA() > $$1) {
            this.x($$1);
         }
      } else if ($$0.a(bvm.r)) {
         float $$2 = this.eR();
         if (this.fs() > $$2) {
            this.E($$2);
         }
      }
   }

   public void c(float $$0) {
      float $$1 = this.eA();
      if ($$1 > 0.0F) {
         this.x($$1 + $$0);
      }
   }

   public float eA() {
      return this.am.a(bJ);
   }

   public void x(float $$0) {
      this.am.a(bJ, azc.a($$0, 0.0F, this.eQ()));
   }

   public boolean eB() {
      return this.eA() <= 0.0F;
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dS().B) {
         return false;
      } else if (this.eB()) {
         return false;
      } else if ($$0.a(awu.i) && this.b(bss.l)) {
         return false;
      } else {
         if (this.fL() && !this.dS().B) {
            this.fM();
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
            if (!$$0.a(awu.j) && $$0.c() instanceof buf $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(awu.o) && this.ao().a(aww.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(awu.a) && !this.a(btr.f).f()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.aQ.a(1.5F);
         if (Float.isNaN($$1) || Float.isInfinite($$1)) {
            $$1 = Float.MAX_VALUE;
         }

         boolean $$7 = true;
         if ((float)this.ak > 10.0F && !$$0.a(awu.e)) {
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

         btj $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof buf $$9 && !$$0.a(awu.q) && (!$$0.a(bse.I) || !this.ao().a(aww.E))) {
               this.a($$9);
            }

            if ($$8 instanceof cnp $$10) {
               this.ba = 100;
               this.aZ = $$10;
            } else if ($$8 instanceof cgy $$11 && $$11.q()) {
               this.ba = 100;
               if ($$11.R_() instanceof cnp $$12) {
                  this.aZ = $$12;
               } else {
                  this.aZ = null;
               }
            }
         }

         if ($$7) {
            if ($$3) {
               this.dS().a(this, (byte)29);
            } else {
               this.dS().a(this, $$0);
            }

            if (!$$0.a(awu.r) && (!$$3 || $$1 > 0.0F)) {
               this.bA();
            }

            if (!$$0.a(awu.z)) {
               double $$13 = 0.0;
               double $$14 = 0.0;
               if ($$0.c() instanceof coi $$15) {
                  DoubleDoubleImmutablePair $$16 = $$15.a_(this, $$0);
                  $$13 = -$$16.leftDouble();
                  $$14 = -$$16.rightDouble();
               } else if ($$0.i() != null) {
                  $$13 = $$0.i().a() - this.dx();
                  $$14 = $$0.i().c() - this.dD();
               }

               this.p(0.4F, $$13, $$14);
               if (!$$3) {
                  this.a($$13, $$14);
               }
            }
         }

         if (this.eB()) {
            if (!this.g($$0)) {
               if ($$7) {
                  this.b(this.n_());
               }

               this.a($$0);
            }
         } else if ($$7) {
            this.e($$0);
         }

         boolean $$17 = !$$3 || $$1 > 0.0F;
         if ($$17) {
            this.ci = $$0;
            this.cj = this.dS().aa();

            for (bsq $$18 : this.ex()) {
               $$18.a(this, $$0, $$1);
            }
         }

         if (this instanceof arh) {
            an.i.a((arh)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((arh)this).a(awn.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof arh) {
            an.h.a((arh)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$17;
      }
   }

   protected void d(buf $$0) {
      $$0.e(this);
   }

   protected void e(buf $$0) {
      $$0.p(0.5, $$0.dx() - this.dx(), $$0.dD() - this.dD());
   }

   private boolean g(bsb $$0) {
      if ($$0.a(awu.d)) {
         return false;
      } else {
         cvl $$1 = null;

         for (brj $$2 : brj.values()) {
            cvl $$3 = this.b($$2);
            if ($$3.a(cvo.vv)) {
               $$1 = $$3.u();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof arh $$4) {
               $$4.b(awn.c.b(cvo.vv));
               an.C.a($$4, $$1);
               this.a(dyx.C);
            }

            this.x(1.0F);
            this.ew();
            this.b(new bsq(bss.j, 900, 1));
            this.b(new bsq(bss.v, 100, 1));
            this.b(new bsq(bss.l, 800, 0));
            this.dS().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bsb eC() {
      if (this.dS().aa() - this.cj > 40L) {
         this.ci = null;
      }

      return this.ci;
   }

   protected void e(bsb $$0) {
      this.b(this.d($$0));
   }

   public void b(@Nullable awc $$0) {
      if ($$0 != null) {
         this.a($$0, this.fd(), this.fe());
      }
   }

   public boolean f(bsb $$0) {
      btj $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cnw $$3 && $$3.A() > 0) {
         $$2 = true;
      }

      if (!$$0.a(awu.c) && this.fC() && !$$2) {
         eye $$4 = $$0.i();
         if ($$4 != null) {
            eye $$5 = this.c(0.0F, this.cx());
            eye $$6 = $$4.a(this.dq());
            $$6 = new eye($$6.d, 0.0, $$6.f).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void j(cvl $$0) {
      if (!$$0.f()) {
         if (!this.ba()) {
            this.dS().a(this.dx(), this.dz(), this.dD(), $$0.M(), this.di(), 0.8F, 0.8F + this.dS().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bsb $$0) {
      if (!this.dN() && !this.bb) {
         btj $$1 = $$0.d();
         buf $$2 = this.eP();
         if (this.bi >= 0 && $$2 != null) {
            $$2.a(this, this.bi, $$0);
         }

         if (this.fL()) {
            this.fM();
         }

         if (!this.dS().B && this.ak()) {
            b.info("Named entity {} died: {}", this, this.eO().a().getString());
         }

         this.bb = true;
         this.eO().c();
         if (this.dS() instanceof arg $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(dyx.p);
               this.a($$3, $$0);
               this.f($$2);
            }

            this.dS().a(this, (byte)3);
         }

         this.b(bur.h);
      }
   }

   protected void f(@Nullable buf $$0) {
      if (!this.dS().B) {
         boolean $$1 = false;
         if ($$0 instanceof cjm) {
            if (this.dS().ac().b(ddo.c)) {
               je $$2 = this.ds();
               dua $$3 = dgx.cd.o();
               if (this.dS().a_($$2).l() && $$3.a((ddv)this.dS(), $$2)) {
                  this.dS().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               cjz $$4 = new cjz(this.dS(), this.dx(), this.dz(), this.dD(), new cvl(cvo.dw));
               this.dS().b($$4);
            }
         }
      }
   }

   protected void a(arg $$0, bsb $$1) {
      boolean $$2 = this.ba > 0;
      if (this.ej() && $$0.ac().b(ddo.f)) {
         this.a($$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.eD();
      this.D($$1.d());
   }

   protected void eD() {
   }

   protected void D(@Nullable btj $$0) {
      if (this.dS() instanceof arg $$1 && !this.eH() && (this.el() || this.ba > 0 && this.ei() && this.dS().ac().b(ddo.f))) {
         btv.a($$1, this.dq(), this.a($$1, $$0));
      }
   }

   protected void a(arg $$0, bsb $$1, boolean $$2) {
   }

   public ala<esy> eE() {
      return this.ao().k();
   }

   public long eF() {
      return 0L;
   }

   protected float a(btj $$0, bsb $$1) {
      float $$2 = (float)this.h(bvm.d);
      return this.dS() instanceof arg $$3 ? day.d($$3, this.dW(), $$0, $$1, $$2) : $$2;
   }

   protected void a(bsb $$0, boolean $$1) {
      ala<esy> $$2 = this.eE();
      esy $$3 = this.dS().o().bd().b($$2);
      esw.a $$4 = new esw.a((arg)this.dS()).a(evp.a, this).a(evp.f, this.dq()).a(evp.c, $$0).b(evp.d, $$0.d()).b(evp.e, $$0.c());
      if ($$1 && this.aZ != null) {
         $$4 = $$4.a(evp.b, this.aZ).a(this.aZ.gy());
      }

      esw $$5 = $$4.a(evo.g);
      $$3.a($$5, this.eF(), this::b);
   }

   protected void a(ala<esy> $$0, Consumer<cvl> $$1) {
      if (this.dS() instanceof arg $$2) {
         esy $$3 = $$2.o().bd().b($$0);
         esw $$4 = new esw.a($$2).a(evp.f, this.dq()).a(evp.a, this).a(evo.s);
         ObjectListIterator var6 = $$3.a($$4).iterator();

         while (var6.hasNext()) {
            cvl $$5 = (cvl)var6.next();
            $$1.accept($$5);
         }
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.h(bvm.p);
      if (!($$0 <= 0.0)) {
         this.as = true;
         eye $$3 = this.dv();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         eye $$4 = new eye($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aH() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected awc d(bsb $$0) {
      return awd.kh;
   }

   @Nullable
   protected awc n_() {
      return awd.kc;
   }

   private awc r(int $$0) {
      return $$0 > 4 ? this.eK().b() : this.eK().a();
   }

   public void eG() {
      this.cm = true;
   }

   public boolean eH() {
      return this.cm;
   }

   public float eI() {
      return 0.0F;
   }

   protected exz eJ() {
      exz $$0 = this.cO();
      btj $$1 = this.dg();
      if ($$1 != null) {
         eye $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<daw, Set<dbo>> c(btr $$0) {
      return (Map<daw, Set<dbo>>)this.cn.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public buf.a eK() {
      return new buf.a(awd.ki, awd.ka);
   }

   protected awc c(cvl $$0) {
      return $$0.K();
   }

   public awc d(cvl $$0) {
      return $$0.L();
   }

   public Optional<je> eL() {
      return this.ch;
   }

   public boolean p_() {
      if (this.P_()) {
         return false;
      } else {
         je $$0 = this.ds();
         dua $$1 = this.dt();
         if ($$1.a(aws.aQ)) {
            this.ch = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dpj && this.c($$0, $$1)) {
            this.ch = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(je $$0, dua $$1) {
      if (!$$1.c(dpj.b)) {
         return false;
      } else {
         dua $$2 = this.dS().a_($$0.e());
         return $$2.a(dgx.cO) && $$2.c(dlb.b) == $$1.c(dpj.aE);
      }
   }

   @Override
   public boolean bI() {
      return !this.dN() && this.eA() > 0.0F;
   }

   @Override
   public int cB() {
      return this.y(0.0F);
   }

   protected final int y(float $$0) {
      return azc.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bsb $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.e($$0, $$1);
      if ($$4 > 0) {
         this.a(this.r($$4), 1.0F, 1.0F);
         this.eM();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int e(float $$0, float $$1) {
      if (this.ao().a(aww.o)) {
         return 0;
      } else {
         float $$2 = (float)this.h(bvm.x);
         float $$3 = $$0 - $$2;
         return azc.c((double)($$3 * $$1) * this.h(bvm.k));
      }
   }

   protected void eM() {
      if (!this.ba()) {
         int $$0 = azc.a(this.dx());
         int $$1 = azc.a(this.dz() - 0.2F);
         int $$2 = azc.a(this.dD());
         dua $$3 = this.dS().a_(new je($$0, $$1, $$2));
         if (!$$3.l()) {
            doj $$4 = $$3.A();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void p(float $$0) {
      this.aL = 10;
      this.aK = this.aL;
   }

   public int eN() {
      return azc.a(this.h(bvm.a));
   }

   protected void b(bsb $$0, float $$1) {
   }

   protected void c(bsb $$0, float $$1) {
   }

   protected void z(float $$0) {
   }

   protected void a(bsb $$0, float $$1, btr... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (btr $$4 : $$2) {
            cvl $$5 = this.a($$4);
            if ($$5.h() instanceof ctc && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float d(bsb $$0, float $$1) {
      if (!$$0.a(awu.b)) {
         this.b($$0, $$1);
         $$1 = brx.a(this, $$1, $$0, (float)this.eN(), (float)this.h(bvm.b));
      }

      return $$1;
   }

   protected float e(bsb $$0, float $$1) {
      if ($$0.a(awu.f)) {
         return $$1;
      } else {
         if (this.b(bss.k) && !$$0.a(awu.g)) {
            int $$2 = (this.c(bss.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof arh) {
                  ((arh)this).a(awn.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof arh) {
                  ((arh)$$0.d()).a(awn.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(awu.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.dS() instanceof arg $$7) {
               $$8 = day.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = brx.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void f(bsb $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fs(), 0.0F);
         this.E(this.fs() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof arh $$4) {
            $$4.a(awn.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eO().a($$0, var9);
            this.x(this.eA() - var9);
            this.E(this.fs() - var9);
            this.a(dyx.o);
         }
      }
   }

   public bry eO() {
      return this.bS;
   }

   @Nullable
   public buf eP() {
      if (this.aZ != null) {
         return this.aZ;
      } else {
         return this.bZ != null ? this.bZ : null;
      }
   }

   public final float eQ() {
      return (float)this.h(bvm.s);
   }

   public final float eR() {
      return (float)this.h(bvm.r);
   }

   public final int eS() {
      return this.am.a(bM);
   }

   public final void p(int $$0) {
      this.am.a(bM, $$0);
   }

   public final int eT() {
      return this.am.a(bN);
   }

   public final void q(int $$0) {
      this.am.a(bN, $$0);
   }

   private int E() {
      if (bsr.a(this)) {
         return 6 - (1 + bsr.b(this));
      } else {
         return this.b(bss.d) ? 6 + (1 + this.c(bss.d).e()) * 2 : 6;
      }
   }

   public void a(brj $$0) {
      this.a($$0, false);
   }

   public void a(brj $$0, boolean $$1) {
      if (!this.aF || this.aH >= this.E() / 2 || this.aH < 0) {
         this.aH = -1;
         this.aF = true;
         this.aG = $$0;
         if (this.dS() instanceof arg) {
            acc $$2 = new acc(this, $$0 == brj.a ? 0 : 3);
            are $$3 = ((arg)this.dS()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bsb $$0) {
      this.aQ.a(1.5F);
      this.ak = 20;
      this.aL = 10;
      this.aK = this.aL;
      awc $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.fd(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
      }

      this.a(this.dT().p(), 0.0F);
      this.ci = $$0;
      this.cj = this.dS().aa();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            awc $$1 = this.n_();
            if ($$1 != null) {
               this.a($$1, this.fd(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cnp)) {
               this.x(0.0F);
               this.a(this.dT().p());
            }
            break;
         case 29:
            this.a(awd.wE, 1.0F, 0.8F + this.dS().z.i() * 0.4F);
            break;
         case 30:
            this.a(awd.wF, 0.8F, 0.8F + this.dS().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.af.i() - 0.5F) * 0.2F;
               float $$6 = (this.af.i() - 0.5F) * 0.2F;
               float $$7 = (this.af.i() - 0.5F) * 0.2F;
               double $$8 = azc.d($$4, this.L, this.dx()) + (this.af.j() - 0.5) * (double)this.dn() * 2.0;
               double $$9 = azc.d($$4, this.M, this.dz()) + this.af.j() * (double)this.do();
               double $$10 = azc.d($$4, this.N, this.dD()) + (this.af.j() - 0.5) * (double)this.dn() * 2.0;
               this.dS().a(ln.ac, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.j(this.a(btr.a));
            break;
         case 48:
            this.j(this.a(btr.b));
            break;
         case 49:
            this.j(this.a(btr.f));
            break;
         case 50:
            this.j(this.a(btr.e));
            break;
         case 51:
            this.j(this.a(btr.d));
            break;
         case 52:
            this.j(this.a(btr.c));
            break;
         case 54:
            dkp.b(this);
            break;
         case 55:
            this.G();
            break;
         case 60:
            this.F();
            break;
         case 65:
            this.j(this.a(btr.g));
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
         this.dS().a(ln.ab, this.d(1.0), this.dA(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void G() {
      cvl $$0 = this.a(btr.b);
      this.a(btr.b, this.a(btr.a));
      this.a(btr.a, $$0);
   }

   @Override
   protected void aG() {
      this.a(this.dT().o(), 4.0F);
   }

   protected void eU() {
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
   public bvi g(jn<bvh> $$0) {
      return this.eV().a($$0);
   }

   public double h(jn<bvh> $$0) {
      return this.eV().c($$0);
   }

   public double i(jn<bvh> $$0) {
      return this.eV().d($$0);
   }

   public bvj eV() {
      return this.bR;
   }

   public cvl eW() {
      return this.a(btr.a);
   }

   public cvl eX() {
      return this.a(btr.b);
   }

   public cvl a(btz $$0) {
      return this.fu() == $$0 ? this.eW() : this.eX();
   }

   @Nonnull
   @Override
   public cvl dW() {
      return this.eW();
   }

   public boolean b(cvg $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cvl> $$0) {
      return $$0.test(this.eW()) || $$0.test(this.eX());
   }

   public cvl b(brj $$0) {
      if ($$0 == brj.a) {
         return this.a(btr.a);
      } else if ($$0 == brj.b) {
         return this.a(btr.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(brj $$0, cvl $$1) {
      if ($$0 == brj.a) {
         this.a(btr.a, $$1);
      } else {
         if ($$0 != brj.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(btr.b, $$1);
      }
   }

   public boolean d(btr $$0) {
      return !this.a($$0).f();
   }

   public boolean e(btr $$0) {
      return false;
   }

   public abstract Iterable<cvl> eY();

   public abstract cvl a(btr var1);

   public abstract void a(btr var1, cvl var2);

   public Iterable<cvl> eZ() {
      return List.of();
   }

   public Iterable<cvl> fa() {
      return this.eY();
   }

   public Iterable<cvl> fb() {
      return Iterables.concat(this.eZ(), this.fa());
   }

   protected void e(cvl $$0) {
      $$0.h().m($$0);
   }

   public float fc() {
      Iterable<cvl> $$0 = this.eY();
      int $$1 = 0;
      int $$2 = 0;

      for (cvl $$3 : $$0) {
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
      bvi $$1 = this.g(bvm.v);
      $$1.c(bE.b());
      if ($$0) {
         $$1.b(bE);
      }
   }

   protected float fd() {
      return 1.0F;
   }

   public float fe() {
      return this.o_() ? (this.af.i() - this.af.i()) * 0.2F + 1.5F : (this.af.i() - this.af.i()) * 0.2F + 1.0F;
   }

   protected boolean ff() {
      return this.eB();
   }

   @Override
   public void h(btj $$0) {
      if (!this.fL()) {
         super.h($$0);
      }
   }

   private void d(btj $$0) {
      eye $$1;
      if (this.dN()) {
         $$1 = this.dq();
      } else if (!$$0.dN() && !this.dS().a_($$0.ds()).a(aws.aK)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dz(), $$0.dz());
         $$1 = new eye(this.dx(), $$2, this.dD());
         boolean $$4 = this.dn() <= 4.0F && this.do() <= 4.0F;
         if ($$4) {
            double $$5 = (double)this.do() / 2.0;
            eye $$6 = $$1.b(0.0, $$5, 0.0);
            eyx $$7 = eyu.a(exz.a($$6, (double)this.dn(), (double)this.do(), (double)this.dn()));
            $$1 = this.dS().a(this, $$7, $$6, (double)this.dn(), (double)this.do(), (double)this.dn()).map($$1x -> $$1x.b(0.0, -$$5, 0.0)).orElse($$1);
         }
      }

      this.a($$1.d, $$1.e, $$1.f);
   }

   @Override
   public boolean cJ() {
      return this.cI();
   }

   protected float fg() {
      return this.A(1.0F);
   }

   protected float A(float $$0) {
      return (float)this.h(bvm.o) * $$0 * this.aQ() + this.fh();
   }

   public float fh() {
      return this.b(bss.h) ? 0.1F * ((float)this.c(bss.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void v() {
      float $$0 = this.fg();
      if (!($$0 <= 1.0E-5F)) {
         eye $$1 = this.dv();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.cg()) {
            float $$2 = this.dI() * (float) (Math.PI / 180.0);
            this.i(new eye((double)(-azc.a($$2)) * 0.2, 0.0, (double)azc.b($$2) * 0.2));
         }

         this.as = true;
      }
   }

   protected void fi() {
      this.h(this.dv().b(0.0, -0.04F, 0.0));
   }

   protected void c(axi<eqa> $$0) {
      this.h(this.dv().b(0.0, 0.04F, 0.0));
   }

   protected float fj() {
      return 0.8F;
   }

   public boolean a(eqb $$0) {
      return false;
   }

   @Override
   protected double bc() {
      return this.h(bvm.n);
   }

   protected double fk() {
      boolean $$0 = this.dv().e <= 0.0;
      return $$0 && this.b(bss.B) ? Math.min(this.bd(), 0.01) : this.bd();
   }

   public void a_(eye $$0) {
      if (this.de()) {
         eqb $$1 = this.dS().b_(this.ds());
         if ((this.bi() || this.bw()) && this.eg() && !this.a($$1)) {
            this.l($$0);
         } else if (this.fE()) {
            this.I();
         } else {
            this.k($$0);
         }
      }
   }

   private void k(eye $$0) {
      je $$1 = this.aO();
      float $$2 = this.aH() ? this.dS().a_($$1).b().h() : 1.0F;
      float $$3 = $$2 * 0.91F;
      eye $$4 = this.a($$0, $$2);
      double $$5 = $$4.e;
      bsq $$6 = this.c(bss.y);
      if ($$6 != null) {
         $$5 += (0.05 * (double)($$6.e() + 1) - $$4.e) * 0.2;
      } else if (!this.dS().B || this.dS().B($$1)) {
         $$5 -= this.fk();
      } else if (this.dz() > (double)this.dS().G_()) {
         $$5 = -0.1;
      } else {
         $$5 = 0.0;
      }

      if (this.er()) {
         this.n($$4.d, $$5, $$4.f);
      } else {
         float $$7 = this instanceof cge ? $$3 : 0.98F;
         this.n($$4.d * (double)$$3, $$5 * (double)$$7, $$4.f * (double)$$3);
      }
   }

   private void l(eye $$0) {
      boolean $$1 = this.dv().e <= 0.0;
      double $$2 = this.dz();
      double $$3 = this.fk();
      if (this.bi()) {
         float $$4 = this.cg() ? 0.9F : this.fj();
         float $$5 = 0.02F;
         float $$6 = (float)this.h(bvm.F);
         if (!this.aH()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fm() - $$5) * $$6;
         }

         if (this.b(bss.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(buj.a, this.dv());
         eye $$7 = this.dv();
         if (this.Q && this.p_()) {
            $$7 = new eye($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d((double)$$4, 0.8F, (double)$$4);
         this.h(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(buj.a, this.dv());
         if (this.b(awy.b) <= this.dm()) {
            this.h(this.dv().d(0.5, 0.8F, 0.5));
            eye $$8 = this.a($$3, $$1, this.dv());
            this.h($$8);
         } else {
            this.h(this.dv().c(0.5));
         }

         if ($$3 != 0.0) {
            this.h(this.dv().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      eye $$9 = this.dv();
      if (this.Q && this.g($$9.d, $$9.e + 0.6F - this.dz() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void I() {
      eye $$0 = this.dv();
      double $$1 = $$0.i();
      this.h(this.m($$0));
      this.a(buj.a, this.dv());
      if (!this.dS().B) {
         double $$2 = this.dv().i();
         this.c($$1, $$2);
      }
   }

   private eye m(eye $$0) {
      eye $$1 = this.bQ();
      float $$2 = this.dK() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fk();
      double $$6 = azc.k(Math.cos((double)$$2));
      $$0 = $$0.b(0.0, $$5 * (-1.0 + $$6 * 0.75), 0.0);
      if ($$0.e < 0.0 && $$3 > 0.0) {
         double $$7 = $$0.e * -0.1 * $$6;
         $$0 = $$0.b($$1.d * $$7 / $$3, $$7, $$1.f * $$7 / $$3);
      }

      if ($$2 < 0.0F && $$3 > 0.0) {
         double $$8 = $$4 * (double)(-azc.a($$2)) * 0.04;
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
            this.a(this.dT().n(), $$3);
         }
      }
   }

   private void c(cnp $$0, eye $$1) {
      eye $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.de()) {
         this.C(this.e($$0));
         this.a_($$2);
      } else {
         this.h(eye.c);
      }
   }

   protected void a(cnp $$0, eye $$1) {
   }

   protected eye b(cnp $$0, eye $$1) {
      return $$1;
   }

   protected float e(cnp $$0) {
      return this.fm();
   }

   public void s(boolean $$0) {
      float $$1 = (float)azc.g(this.dx() - this.L, $$0 ? this.dz() - this.M : 0.0, this.dD() - this.N);
      if (!this.bW() && this.bI()) {
         this.B($$1);
      } else {
         this.aQ.a();
      }
   }

   protected void B(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aQ.a($$1, 0.4F, this.o_() ? 3.0F : 1.0F);
   }

   private eye a(eye $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.h(this.n(this.dv()));
      this.a(buj.a, this.dv());
      eye $$2 = this.dv();
      if ((this.Q || this.bk) && (this.p_() || this.dt().a(dgx.qP) && dmq.a(this))) {
         $$2 = new eye($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public eye a(double $$0, boolean $$1, eye $$2) {
      if ($$0 != 0.0 && !this.cg()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new eye($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private eye n(eye $$0) {
      if (this.p_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = azc.a($$0.d, -0.15F, 0.15F);
         double $$3 = azc.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dt().a(dgx.nS) && this.fD() && this instanceof cnp) {
            $$4 = 0.0;
         }

         $$0 = new eye($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aH() ? this.fm() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fl();
   }

   protected float fl() {
      return this.cU() instanceof cnp ? this.fm() * 0.1F : 0.02F;
   }

   public float fm() {
      return this.cd;
   }

   public void C(float $$0) {
      this.cd = $$0;
   }

   public boolean E(btj $$0) {
      this.B($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.M();
      this.P();
      if (!this.dS().B) {
         int $$0 = this.eS();
         if ($$0 > 0) {
            if (this.aI <= 0) {
               this.aI = 20 * (30 - $$0);
            }

            this.aI--;
            if (this.aI <= 0) {
               this.p($$0 - 1);
            }
         }

         int $$1 = this.eT();
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
            this.eO().c();
         }

         if (this.fL() && !this.Q()) {
            this.fM();
         }
      }

      if (!this.dN()) {
         this.m_();
      }

      double $$2 = this.dx() - this.L;
      double $$3 = this.dD() - this.N;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aU;
      float $$6 = 0.0F;
      this.bd = this.be;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)azc.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = azc.e(azc.g(this.dI()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aO > 0.0F) {
         $$5 = this.dI();
      }

      if (!this.aH()) {
         $$7 = 0.0F;
      }

      this.be = this.be + ($$7 - this.be) * 0.3F;
      this.dS().ah().a("headTurn");
      $$6 = this.f($$5, $$6);
      this.dS().ah().c();
      this.dS().ah().a("rangeChecks");

      while (this.dI() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dI() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aU - this.aV < -180.0F) {
         this.aV -= 360.0F;
      }

      while (this.aU - this.aV >= 180.0F) {
         this.aV += 360.0F;
      }

      while (this.dK() - this.P < -180.0F) {
         this.P -= 360.0F;
      }

      while (this.dK() - this.P >= 180.0F) {
         this.P += 360.0F;
      }

      while (this.aW - this.aX < -180.0F) {
         this.aX -= 360.0F;
      }

      while (this.aW - this.aX >= 180.0F) {
         this.aX += 360.0F;
      }

      this.dS().ah().c();
      this.bf += $$6;
      if (this.fE()) {
         this.by++;
      } else {
         this.by = 0;
      }

      if (this.fL()) {
         this.w(0.0F);
      }

      this.D();
      float $$10 = this.ef();
      if ($$10 != this.bD) {
         this.bD = $$10;
         this.i_();
      }

      this.aY.a();
   }

   private void J() {
      Map<btr, cvl> $$0 = this.K();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<btr, cvl> K() {
      Map<btr, cvl> $$0 = null;

      for (btr $$1 : btr.values()) {
         cvl $$2 = switch ($$1.a()) {
            case a -> this.g($$1);
            case b -> this.f($$1);
            case c -> this.bW;
         };
         cvl $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(btr.class);
            }

            $$0.put($$1, $$3);
            bvj $$4 = this.eV();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<btr, cvl> $$5 : $$0.entrySet()) {
            btr $$6 = $$5.getKey();
            cvl $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1) -> {
                  bvi $$2 = this.bR.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1.b());
                     $$2.b($$1);
                  }
               });
               if (this.dS() instanceof arg $$8) {
                  day.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(cvl $$0, cvl $$1) {
      return !cvl.a($$1, $$0);
   }

   private void a(Map<btr, cvl> $$0) {
      cvl $$1 = $$0.get(btr.a);
      cvl $$2 = $$0.get(btr.b);
      if ($$1 != null && $$2 != null && cvl.a($$1, this.g(btr.b)) && cvl.a($$2, this.g(btr.a))) {
         ((arg)this.dS()).l().b(this, new add(this, (byte)55));
         $$0.remove(btr.a);
         $$0.remove(btr.b);
         this.c(btr.a, $$1.u());
         this.c(btr.b, $$2.u());
      }
   }

   private void b(Map<btr, cvl> $$0) {
      List<Pair<btr, cvl>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cvl $$3 = $$2.u();
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
      ((arg)this.dS()).l().b(this, new afi(this.ap(), $$1));
   }

   private cvl f(btr $$0) {
      return this.bV.get($$0.b());
   }

   private void b(btr $$0, cvl $$1) {
      this.bV.set($$0.b(), $$1);
   }

   private cvl g(btr $$0) {
      return this.bU.get($$0.b());
   }

   private void c(btr $$0, cvl $$1) {
      this.bU.set($$0.b(), $$1);
   }

   protected float f(float $$0, float $$1) {
      float $$2 = azc.g($$0 - this.aU);
      this.aU += $$2 * 0.3F;
      float $$3 = azc.g(this.dI() - this.aU);
      float $$4 = this.fn();
      if (Math.abs($$3) > $$4) {
         this.aU = this.aU + ($$3 - (float)azc.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float fn() {
      return 50.0F;
   }

   public void m_() {
      if (this.ce > 0) {
         this.ce--;
      }

      if (this.de()) {
         this.bo = 0;
         this.f(this.dx(), this.dz(), this.dD());
      }

      if (this.bo > 0) {
         this.a(this.bo, this.bp, this.bq, this.br, this.bs, this.bt);
         this.bo--;
      } else if (!this.df()) {
         this.h(this.dv().c(0.98));
      }

      if (this.bv > 0) {
         this.a(this.bv, this.bu);
         this.bv--;
      }

      eye $$0 = this.dv();
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
      this.dS().ah().a("ai");
      if (this.ff()) {
         this.bk = false;
         this.bl = 0.0F;
         this.bn = 0.0F;
      } else if (this.df()) {
         this.dS().ah().a("newAi");
         this.fq();
         this.dS().ah().c();
      }

      this.dS().ah().c();
      this.dS().ah().a("jump");
      if (this.bk && this.eg()) {
         double $$4;
         if (this.bw()) {
            $$4 = this.b(awy.b);
         } else {
            $$4 = this.b(awy.a);
         }

         boolean $$6 = this.bi() && $$4 > 0.0;
         double $$7 = this.dm();
         if (!$$6 || this.aH() && !($$4 > $$7)) {
            if (!this.bw() || this.aH() && !($$4 > $$7)) {
               if ((this.aH() || $$6 && $$4 <= $$7) && this.ce == 0) {
                  this.v();
                  this.ce = 10;
               }
            } else {
               this.c(awy.b);
            }
         } else {
            this.c(awy.a);
         }
      } else {
         this.ce = 0;
      }

      this.dS().ah().c();
      this.dS().ah().a("travel");
      this.bl *= 0.98F;
      this.bn *= 0.98F;
      if (this.fE()) {
         this.fp();
      }

      exz $$8 = this.cO();
      eye $$9 = new eye((double)this.bl, (double)this.bm, (double)this.bn);
      if (this.b(bss.B) || this.b(bss.y)) {
         this.n();
      }

      label115: {
         if (this.cU() instanceof cnp $$10 && this.bI()) {
            this.c($$10, $$9);
            break label115;
         }

         this.a_($$9);
      }

      if (!this.dS().w_() || this.de()) {
         this.aI();
      }

      this.s(this instanceof cge);
      this.dS().ah().c();
      this.dS().ah().a("freezing");
      if (!this.dS().B && !this.eB()) {
         int $$11 = this.cr();
         if (this.aw && this.dG()) {
            this.k(Math.min(this.cu(), $$11 + 1));
         } else {
            this.k(Math.max(0, $$11 - 2));
         }
      }

      this.ec();
      this.ed();
      if (!this.dS().B && this.ag % 40 == 0 && this.ct() && this.dG()) {
         this.a(this.dT().v(), 1.0F);
      }

      this.dS().ah().c();
      this.dS().ah().a("push");
      if (this.bz > 0) {
         this.bz--;
         this.a($$8, this.cO());
      }

      this.r();
      this.dS().ah().c();
      if (!this.dS().B && this.fo() && this.bk()) {
         this.a(this.dT().i(), 1.0F);
      }
   }

   public boolean fo() {
      return false;
   }

   protected void fp() {
      this.cv();
      if (!this.dS().B) {
         cvl $$0 = this.a(btr.e);
         if (!this.f($$0)) {
            this.b(7, false);
            return;
         }

         int $$1 = this.by + 1;
         if ($$1 % 10 == 0) {
            int $$2 = $$1 / 10;
            if ($$2 % 2 == 0) {
               $$0.a(1, this, btr.e);
            }

            this.a(dyx.n);
         }
      }
   }

   protected boolean f(cvl $$0) {
      return !this.aH() && !this.bW() && !this.b(bss.y) ? $$0.a(cvo.nU) && cui.h($$0) : false;
   }

   protected void fq() {
   }

   protected void r() {
      if (this.dS().w_()) {
         this.dS().a(dyl.a(cnp.class), this.cO(), bto.a(this)).forEach(this::F);
      } else {
         List<btj> $$0 = this.dS().a(this, this.cO(), bto.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dS().ac().c(ddo.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.af.a(4) == 0) {
               int $$2 = 0;

               for (btj $$3 : $$0) {
                  if (!$$3.bW()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dT().h(), 6.0F);
               }
            }

            for (btj $$4 : $$0) {
               this.F($$4);
            }
         }
      }
   }

   protected void a(exz $$0, exz $$1) {
      exz $$2 = $$0.b($$1);
      List<btj> $$3 = this.dS().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (btj $$4 : $$3) {
            if ($$4 instanceof buf) {
               this.g((buf)$$4);
               this.bz = 0;
               this.h(this.dv().c(-0.2));
               break;
            }
         }
      } else if (this.Q) {
         this.bz = 0;
      }

      if (!this.dS().B && this.bz <= 0) {
         this.c(4, false);
         this.bA = 0.0F;
         this.bB = null;
      }
   }

   protected void F(btj $$0) {
      $$0.h(this);
   }

   protected void g(buf $$0) {
   }

   public boolean fr() {
      return (this.am.a(aA) & 4) != 0;
   }

   @Override
   public void af() {
      btj $$0 = this.dg();
      super.af();
      if ($$0 != null && $$0 != this.dg() && !this.dS().B) {
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
   public double c_() {
      return this.bo > 0 ? this.bp : this.dx();
   }

   @Override
   public double d_() {
      return this.bo > 0 ? this.bq : this.dz();
   }

   @Override
   public double N_() {
      return this.bo > 0 ? this.br : this.dD();
   }

   @Override
   public float O_() {
      return this.bo > 0 ? (float)this.bt : this.dK();
   }

   @Override
   public float e_() {
      return this.bo > 0 ? (float)this.bs : this.dI();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bu = (double)$$0;
      this.bv = $$1;
   }

   public void t(boolean $$0) {
      this.bk = $$0;
   }

   public void a(cjz $$0) {
      btj $$1 = $$0.s();
      if ($$1 instanceof arh) {
         an.R.a((arh)$$1, $$0.m(), this);
      }
   }

   public void a(btj $$0, int $$1) {
      if (!$$0.dN() && !this.dS().B && ($$0 instanceof cjz || $$0 instanceof cnw || $$0 instanceof btv)) {
         ((arg)this.dS()).l().b($$0, new agd($$0.ap(), this.ap(), $$1));
      }
   }

   public boolean G(btj $$0) {
      if ($$0.dS() != this.dS()) {
         return false;
      } else {
         eye $$1 = new eye(this.dx(), this.dB(), this.dD());
         eye $$2 = new eye($$0.dx(), $$0.dB(), $$0.dD());
         return $$2.f($$1) > 128.0 ? false : this.dS().a(new dda($$1, $$2, dda.a.a, dda.b.a, this)).c() == eyc.a.a;
      }
   }

   @Override
   public float i(float $$0) {
      return $$0 == 1.0F ? this.aW : azc.h($$0, this.aX, this.aW);
   }

   public float D(float $$0) {
      float $$1 = this.aO - this.aN;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aN + $$1 * $$0;
   }

   @Override
   public boolean bE() {
      return !this.dN();
   }

   @Override
   public boolean bF() {
      return this.bI() && !this.P_() && !this.p_();
   }

   @Override
   public float cx() {
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
   public eye a(jj.a $$0, l.a $$1) {
      return j(super.a($$0, $$1));
   }

   public static eye j(eye $$0) {
      return new eye($$0.d, $$0.e, 0.0);
   }

   public float fs() {
      return this.cf;
   }

   public final void E(float $$0) {
      this.F(azc.a($$0, 0.0F, this.eR()));
   }

   protected void F(float $$0) {
      this.cf = $$0;
   }

   public void f_() {
   }

   public void g_() {
   }

   protected void ft() {
      this.bY = true;
   }

   public abstract btz fu();

   public boolean fv() {
      return (this.am.a(aA) & 1) > 0;
   }

   public brj fw() {
      return (this.am.a(aA) & 2) > 0 ? brj.b : brj.a;
   }

   private void M() {
      if (this.fv()) {
         if (cvl.b(this.b(this.fw()), this.bw)) {
            this.bw = this.b(this.fw());
            this.a(this.bw);
         } else {
            this.fB();
         }
      }
   }

   protected void a(cvl $$0) {
      $$0.b(this.dS(), this, this.fy());
      if (this.O()) {
         this.b($$0, 5);
      }

      if (--this.bx == 0 && !this.dS().B && !$$0.x()) {
         this.z();
      }
   }

   private boolean O() {
      int $$0 = this.bw.a(this) - this.fy();
      int $$1 = (int)((float)this.bw.a(this) * 0.21875F);
      boolean $$2 = $$0 > $$1;
      return $$2 && this.fy() % 4 == 0;
   }

   private void P() {
      this.cl = this.ck;
      if (this.ci()) {
         this.ck = Math.min(1.0F, this.ck + 0.09F);
      } else {
         this.ck = Math.max(0.0F, this.ck - 0.09F);
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

   public void c(brj $$0) {
      cvl $$1 = this.b($$0);
      if (!$$1.f() && !this.fv()) {
         this.bw = $$1;
         this.bx = $$1.a(this);
         if (!this.dS().B) {
            this.c(1, true);
            this.c(2, $$0 == brj.b);
            this.a(dyx.D);
         }
      }
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (bO.equals($$0)) {
         if (this.dS().B) {
            this.fJ().ifPresent(this::a);
         }
      } else if (aA.equals($$0) && this.dS().B) {
         if (this.fv() && this.bw.f()) {
            this.bw = this.b(this.fw());
            if (!this.bw.f()) {
               this.bx = this.bw.a(this);
            }
         } else if (!this.fv() && !this.bw.f()) {
            this.bw = cvl.k;
            this.bx = 0;
         }
      }
   }

   @Override
   public void a(ff.a $$0, eye $$1) {
      super.a($$0, $$1);
      this.aX = this.aW;
      this.aU = this.aW;
      this.aV = this.aU;
   }

   @Override
   public float t(float $$0) {
      return azc.h($$0, this.aV, this.aU);
   }

   protected void b(cvl $$0, int $$1) {
      if (!$$0.f() && this.fv()) {
         if ($$0.w() == cxh.c) {
            this.a(this.c($$0), 0.5F, this.dS().z.i() * 0.1F + 0.9F);
         }

         if ($$0.w() == cxh.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.af.a(2), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(cvl $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         eye $$3 = new eye(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dK() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dI() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.af.i()) * 0.6 - 0.3;
         eye $$5 = new eye(((double)this.af.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dK() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dI() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dx(), this.dB(), this.dD());
         this.dS().a(new lj(ln.S, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void z() {
      if (!this.dS().B || this.fv()) {
         brj $$0 = this.fw();
         if (!this.bw.equals(this.b($$0))) {
            this.fA();
         } else {
            if (!this.bw.f() && this.fv()) {
               this.b(this.bw, 16);
               cvl $$1 = this.bw.a(this.dS(), this);
               if ($$1 != this.bw) {
                  this.a($$0, $$1);
               }

               this.fB();
            }
         }
      }
   }

   public cvl fx() {
      return this.bw;
   }

   public int fy() {
      return this.bx;
   }

   public int fz() {
      return this.fv() ? this.bw.a(this) - this.fy() : 0;
   }

   public void fA() {
      if (!this.bw.f()) {
         this.bw.a(this.dS(), this, this.fy());
         if (this.bw.x()) {
            this.M();
         }
      }

      this.fB();
   }

   public void fB() {
      if (!this.dS().B) {
         boolean $$0 = this.fv();
         this.c(1, false);
         if ($$0) {
            this.a(dyx.C);
         }
      }

      this.bw = cvl.k;
      this.bx = 0;
   }

   public boolean fC() {
      if (this.fv() && !this.bw.f()) {
         cvg $$0 = this.bw.h();
         return $$0.b(this.bw) != cxh.d ? false : $$0.a(this.bw, this) - this.bx >= 5;
      } else {
         return false;
      }
   }

   public boolean fD() {
      return this.ca();
   }

   public boolean fE() {
      return this.i(7);
   }

   @Override
   public boolean ci() {
      return super.ci() || !this.fE() && this.c(bur.b);
   }

   public int fF() {
      return this.by;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dx();
      double $$5 = this.dz();
      double $$6 = this.dD();
      double $$7 = $$1;
      boolean $$8 = false;
      je $$9 = je.a($$0, $$1, $$2);
      dds $$10 = this.dS();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.G_()) {
            je $$12 = $$9.e();
            dua $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.c($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cO())) {
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

         if (this instanceof bun $$14) {
            $$14.P().o();
         }

         return true;
      }
   }

   public boolean fG() {
      return !this.eB();
   }

   public boolean fH() {
      return true;
   }

   public void a(je $$0, boolean $$1) {
   }

   public boolean g(cvl $$0) {
      return false;
   }

   @Override
   public final btm a(bur $$0) {
      return $$0 == bur.c ? aB : this.e($$0).a(this.ef());
   }

   protected btm e(bur $$0) {
      return this.ao().n().a(this.ee());
   }

   public ImmutableList<bur> fI() {
      return ImmutableList.of(bur.a);
   }

   public exz f(bur $$0) {
      btm $$1 = this.a($$0);
      return new exz((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bur $$0) {
      exz $$1 = this.a($$0).a(this.dq());
      return this.dS().b(this, $$1);
   }

   @Override
   public boolean o(boolean $$0) {
      return super.o($$0) && !this.fL();
   }

   public Optional<je> fJ() {
      return this.am.a(bO);
   }

   public void g(je $$0) {
      this.am.a(bO, Optional.of($$0));
   }

   public void fK() {
      this.am.a(bO, Optional.empty());
   }

   public boolean fL() {
      return this.fJ().isPresent();
   }

   public void b(je $$0) {
      if (this.bW()) {
         this.af();
      }

      dua $$1 = this.dS().a_($$0);
      if ($$1.b() instanceof dgo) {
         this.dS().a($$0, $$1.b(dgo.c, Boolean.valueOf(true)), 3);
      }

      this.b(bur.c);
      this.a($$0);
      this.g($$0);
      this.h(eye.c);
      this.as = true;
   }

   private void a(je $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean Q() {
      return this.fJ().map($$0 -> this.dS().a_($$0).b() instanceof dgo).orElse(false);
   }

   public void fM() {
      this.fJ().filter(this.dS()::B).ifPresent($$0x -> {
         dua $$1 = this.dS().a_($$0x);
         if ($$1.b() instanceof dgo) {
            jj $$2 = $$1.c(dgo.aE);
            this.dS().a($$0x, $$1.b(dgo.c, Boolean.valueOf(false)), 3);
            eye $$3 = dgo.a(this.ao(), this.dS(), $$0x, $$2, this.dI()).orElseGet(() -> {
               je $$1x = $$0x.d();
               return new eye((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            eye $$4 = eye.c($$0x).d($$3).d();
            float $$5 = (float)azc.d(azc.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.v($$5);
            this.w(0.0F);
         }
      });
      eye $$0 = this.dq();
      this.b(bur.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fK();
   }

   @Nullable
   public jj fN() {
      je $$0 = this.fJ().orElse(null);
      return $$0 != null ? dgo.a(this.dS(), $$0) : null;
   }

   @Override
   public boolean bJ() {
      return !this.fL() && super.bJ();
   }

   public cvl h(cvl $$0) {
      return cvl.k;
   }

   public final cvl a(dds $$0, cvl $$1) {
      cqn $$2 = $$1.a(kr.v);
      return $$2 != null ? this.a($$0, $$1, $$2) : $$1;
   }

   public cvl a(dds $$0, cvl $$1, cqn $$2) {
      $$0.a(null, this.dx(), this.dz(), this.dD(), this.d($$1), awe.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
      this.a($$2);
      $$1.a(1, this);
      this.a(dyx.m);
      return $$1;
   }

   private void a(cqn $$0) {
      if (!this.dS().w_()) {
         for (cqn.b $$2 : $$0.g()) {
            if (this.af.i() < $$2.b()) {
               this.b($$2.a());
            }
         }
      }
   }

   private static byte h(btr $$0) {
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

   public void a(cvg $$0, btr $$1) {
      this.dS().a(this, h($$1));
      this.a(this.a($$1), $$1, this.bR);
   }

   private void a(cvl $$0, btr $$1, bvj $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         bvi $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      day.a($$0, this, $$1);
   }

   public static btr d(brj $$0) {
      return $$0 == brj.a ? btr.a : btr.b;
   }

   public btr i(cvl $$0) {
      cun $$1 = cun.c_($$0);
      if ($$1 != null) {
         btr $$2 = $$1.m();
         if (this.e($$2)) {
            return $$2;
         }
      }

      return btr.a;
   }

   private static buw a(buf $$0, btr $$1) {
      return $$1 != btr.f && $$1 != btr.a && $$1 != btr.b ? buw.a($$0, $$1, $$2 -> $$2.f() || $$0.i($$2) == $$1) : buw.a($$0, $$1);
   }

   @Nullable
   private static btr s(int $$0) {
      if ($$0 == 100 + btr.f.b()) {
         return btr.f;
      } else if ($$0 == 100 + btr.e.b()) {
         return btr.e;
      } else if ($$0 == 100 + btr.d.b()) {
         return btr.d;
      } else if ($$0 == 100 + btr.c.b()) {
         return btr.c;
      } else if ($$0 == 98) {
         return btr.a;
      } else if ($$0 == 99) {
         return btr.b;
      } else {
         return $$0 == 105 ? btr.g : null;
      }
   }

   @Override
   public buw a_(int $$0) {
      btr $$1 = s($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dG() {
      if (this.P_()) {
         return false;
      } else {
         boolean $$0 = !this.a(btr.f).a(axb.be) && !this.a(btr.e).a(axb.be) && !this.a(btr.d).a(axb.be) && !this.a(btr.c).a(axb.be) && !this.a(btr.g).a(axb.be);
         return $$0 && super.dG();
      }
   }

   @Override
   public boolean cl() {
      return !this.dS().w_() && this.b(bss.x) || super.cl();
   }

   @Override
   public float dJ() {
      return this.aU;
   }

   @Override
   public void a(aca $$0) {
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

   public boolean fO() {
      return this.dW().h() instanceof cth;
   }

   @Override
   public float dM() {
      float $$0 = (float)this.h(bvm.B);
      return this.cU() instanceof cnp ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public eye m(btj $$0) {
      return this.dq().e(this.a($$0, this.a(this.av()), this.ef() * this.ee()));
   }

   protected void a(int $$0, double $$1) {
      this.aW = (float)azc.e(1.0 / (double)$$0, (double)this.aW, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(azc.c((double)$$0 * this.h(bvm.h)));
   }

   public boolean fP() {
      return false;
   }

   @Override
   public boolean b(bsb $$0) {
      if (super.b($$0)) {
         return true;
      } else {
         if (this.dS() instanceof arg $$1 && day.a($$1, this, $$0)) {
            return true;
         }

         return false;
      }
   }

   public static record a(awc a, awc b) {
   }
}
