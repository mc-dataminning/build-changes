import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class blv extends blf implements bld {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final bmz bA = new bmz(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, bmz.a.c);
   public static final int g = 2;
   public static final int h = 4;
   public static final int i = 98;
   public static final int j = 100;
   public static final int k = 6;
   public static final int l = 100;
   private static final int bB = 40;
   public static final double m = 0.003;
   public static final double n = 0.08;
   public static final int o = 20;
   private static final int bC = 7;
   private static final int bD = 10;
   private static final int bE = 2;
   public static final int p = 4;
   private static final float bF = 0.42F;
   private static final double bG = 128.0;
   protected static final int q = 1;
   protected static final int r = 2;
   protected static final int s = 4;
   protected static final afz<Byte> t = agc.a(blv.class, agb.a);
   private static final afz<Float> bH = agc.a(blv.class, agb.d);
   private static final afz<Integer> bI = agc.a(blv.class, agb.b);
   private static final afz<Boolean> bJ = agc.a(blv.class, agb.k);
   private static final afz<Integer> bK = agc.a(blv.class, agb.b);
   private static final afz<Integer> bL = agc.a(blv.class, agb.b);
   private static final afz<Optional<hv>> bM = agc.a(blv.class, agb.o);
   protected static final float u = 1.74F;
   protected static final blg v = blg.c(0.2F, 0.2F);
   public static final float aE = 0.5F;
   private final bmy bN;
   private final bka bO = new bka(this);
   private final Map<bkq, bks> bP = Maps.newHashMap();
   private final io<cmh> bQ = io.a(2, cmh.f);
   private final io<cmh> bR = io.a(4, cmh.f);
   public boolean aF;
   private boolean bS = false;
   public bjk aG;
   public int aH;
   public int aI;
   public int aJ;
   public int aK;
   public int aL;
   public int aM;
   public float aN;
   public float aO;
   protected int aP;
   public final bmu aQ = new bmu();
   public final int aR = 20;
   public final float aS;
   public final float aT;
   public float aU;
   public float aV;
   public float aW;
   public float aX;
   @Nullable
   protected cer aY;
   protected int aZ;
   protected boolean ba;
   protected int bb;
   protected float bc;
   protected float bd;
   protected float be;
   protected float bf;
   protected float bg;
   protected int bh;
   protected float bi;
   protected boolean bj;
   public float bk;
   public float bl;
   public float bm;
   protected int bn;
   protected double bo;
   protected double bp;
   protected double bq;
   protected double br;
   protected double bs;
   protected double bt;
   protected int bu;
   private boolean bT = true;
   @Nullable
   private blv bU;
   private int bV;
   private blv bW;
   private int bX;
   private float bY;
   private int bZ;
   private float ca;
   protected cmh bv = cmh.f;
   protected int bw;
   protected int bx;
   private hv cb;
   private Optional<hv> cc = Optional.empty();
   @Nullable
   private bkd cd;
   private long ce;
   protected int by;
   private float cf;
   private float cg;
   protected bmv<?> bz;
   private boolean ch;

   protected blv(blj<? extends blv> $$0, csy $$1) {
      super($$0, $$1);
      this.bN = new bmy(bnc.a($$0));
      this.c(this.eM());
      this.I = true;
      this.aT = (float)((Math.random() + 1.0) * 0.01F);
      this.ar();
      this.aS = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.aW = this.dC();
      this.t(0.6F);
      sx $$2 = sx.a;
      this.bz = this.a(new Dynamic($$2, (tg)$$2.createMap(ImmutableMap.of($$2.a("memories"), (tg)$$2.emptyMap()))));
   }

   public bmv<?> dO() {
      return this.bz;
   }

   protected bmv.b<?> dP() {
      return bmv.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bmv<?> a(Dynamic<?> $$0) {
      return this.dP().a($$0);
   }

   @Override
   public void al() {
      this.a(this.dN().w(), Float.MAX_VALUE);
   }

   public boolean a(blj<?> $$0) {
      return true;
   }

   @Override
   protected void c_() {
      this.an.a(t, (byte)0);
      this.an.a(bI, 0);
      this.an.a(bJ, false);
      this.an.a(bK, 0);
      this.an.a(bL, 0);
      this.an.a(bH, 1.0F);
      this.an.a(bM, Optional.empty());
   }

   public static bna.a dQ() {
      return bna.a().a(bnb.l).a(bnb.i).a(bnb.m).a(bnb.a).a(bnb.b).a(bnb.k);
   }

   @Override
   protected void a(double $$0, boolean $$1, dip $$2, hv $$3) {
      if (!this.aZ()) {
         this.bh();
      }

      if (!this.dM().B && $$1 && this.ab > 0.0F) {
         this.dV();
         this.dW();
      }

      if (!this.dM().B && this.ab > 3.0F && $$1 && !$$2.i()) {
         double $$4 = this.dr();
         double $$5 = this.dt();
         double $$6 = this.dx();
         hv $$7 = this.dm();
         if ($$3.u() != $$7.u() || $$3.w() != $$7.w()) {
            double $$8 = $$4 - (double)$$3.u() - 0.5;
            double $$9 = $$6 - (double)$$3.w() - 0.5;
            double $$10 = Math.max(Math.abs($$8), Math.abs($$9));
            $$4 = (double)$$3.u() + 0.5 + $$8 / $$10 * 0.5;
            $$6 = (double)$$3.w() + 0.5 + $$9 / $$10 * 0.5;
         }

         float $$11 = (float)aty.f(this.ab - 3.0F);
         double $$12 = Math.min((double)(0.2F + $$11 / 15.0F), 2.5);
         int $$13 = (int)(150.0 * $$12);
         ((amp)this.dM()).a(new jn(jv.c, $$2), $$4, $$5, $$6, $$13, 0.0, 0.0, 0.0, 0.15F);
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cc = Optional.empty();
      }
   }

   public final boolean dR() {
      return this.ai().a(aru.m);
   }

   public float a(float $$0) {
      return aty.i($$0, this.cg, this.cf);
   }

   @Override
   public void as() {
      this.aN = this.aO;
      if (this.am) {
         this.fB().ifPresent(this::a);
      }

      if (this.dS()) {
         this.dT();
      }

      super.as();
      this.dM().ae().a("livingEntityBaseTick");
      if (this.aY() || this.dM().B) {
         this.aA();
      }

      if (this.bx()) {
         boolean $$0 = this instanceof cer;
         if (!this.dM().B) {
            if (this.by()) {
               this.a(this.dN().f(), 1.0F);
            } else if ($$0 && !this.dM().D_().a(this.cH())) {
               double $$1 = this.dM().D_().a(this) + this.dM().D_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dM().D_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dN().v(), (float)Math.max(1, aty.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(arw.a) && !this.dM().a_(hv.a(this.dr(), this.dv(), this.dx())).a(cwb.nd)) {
            boolean $$3 = !this.dR() && !bkt.c(this) && (!$$0 || !((cer)this).fT().a);
            if ($$3) {
               this.j(this.m(this.ci()));
               if (this.ci() == -20) {
                  this.j(0);
                  elb $$4 = this.dp();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.ag.j() - this.ag.j();
                     double $$7 = this.ag.j() - this.ag.j();
                     double $$8 = this.ag.j() - this.ag.j();
                     this.dM().a(jv.e, this.dr() + $$6, this.dt() + $$7, this.dx() + $$8, $$4.c, $$4.d, $$4.e);
                  }

                  this.a(this.dN().h(), 2.0F);
               }
            }

            if (!this.dM().B && this.bO() && this.cZ() != null && this.cZ().bQ()) {
               this.ac();
            }
         } else if (this.ci() < this.ch()) {
            this.j(this.n(this.ci()));
         }

         if (!this.dM().B) {
            hv $$9 = this.dm();
            if (!Objects.equal(this.cb, $$9)) {
               this.cb = $$9;
               this.c($$9);
            }
         }
      }

      if (this.bx() && (this.bb() || this.aA)) {
         this.aF();
      }

      if (this.aK > 0) {
         this.aK--;
      }

      if (this.al > 0 && !(this instanceof amq)) {
         this.al--;
      }

      if (this.ew() && this.dM().h(this)) {
         this.eb();
      }

      if (this.aZ > 0) {
         this.aZ--;
      } else {
         this.aY = null;
      }

      if (this.bW != null && !this.bW.bx()) {
         this.bW = null;
      }

      if (this.bU != null) {
         if (!this.bU.bx()) {
            this.a(null);
         } else if (this.ah - this.bV > 100) {
            this.a(null);
         }
      }

      this.en();
      this.bf = this.be;
      this.aV = this.aU;
      this.aX = this.aW;
      this.N = this.dC();
      this.O = this.dE();
      this.dM().ae().c();
   }

   public boolean dS() {
      return this.ah % 5 == 0 && this.dp().c != 0.0 && this.dp().e != 0.0 && !this.P_() && cqu.k(this) && this.dU();
   }

   protected void dT() {
      elb $$0 = this.dp();
      this.dM()
         .a(
            jv.K,
            this.dr() + (this.ag.j() - 0.5) * (double)this.dg(),
            this.dt() + 0.1,
            this.dx() + (this.ag.j() - 0.5) * (double)this.dg(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.ag.i() * 0.4F + this.ag.i() > 0.9F ? 0.6F : 0.0F;
      this.a(arc.wT, $$1, 0.6F + this.ag.i() * 0.4F);
   }

   protected boolean dU() {
      return this.dM().a_(this.aI()).a(arr.aM);
   }

   @Override
   protected float aL() {
      return this.dU() && cqu.a(cqw.l, this) > 0 ? 1.0F : super.aL();
   }

   @Override
   protected boolean c(dip $$0) {
      return !$$0.i() || this.fw();
   }

   protected void dV() {
      bmx $$0 = this.a(bnb.m);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void dW() {
      if (!this.bj().i()) {
         int $$0 = cqu.a(cqw.l, this);
         if ($$0 > 0 && this.dU()) {
            bmx $$1 = this.a(bnb.m);
            if ($$1 == null) {
               return;
            }

            $$1.b(new bmz(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), bmz.a.a));
            if (this.eg().i() < 0.04F) {
               cmh $$2 = this.c(blk.c);
               $$2.a(1, this, $$0x -> $$0x.d(blk.c));
            }
         }
      }
   }

   protected void dX() {
      bmx $$0 = this.a(bnb.m);
      if ($$0 != null) {
         if ($$0.a(e) != null) {
            $$0.b(e);
         }
      }
   }

   protected void dY() {
      if (!this.bj().i()) {
         int $$0 = this.cj();
         if ($$0 > 0) {
            bmx $$1 = this.a(bnb.m);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.ck();
            $$1.b(new bmz(e, "Powder snow slow", (double)$$2, bmz.a.a));
         }
      }
   }

   protected void c(hv $$0) {
      int $$1 = cqu.a(cqw.j, this);
      if ($$1 > 0) {
         cqz.a(this, this.dM(), $$0, $$1);
      }

      if (this.c(this.bj())) {
         this.dV();
      }

      this.dW();
   }

   public boolean o_() {
      return false;
   }

   public float dZ() {
      return this.o_() ? 0.5F : 1.0F;
   }

   protected boolean ea() {
      return true;
   }

   protected void eb() {
      this.aM++;
      if (this.aM >= 20 && !this.dM().y_() && !this.dH()) {
         this.dM().a(this, (byte)60);
         this.a(blf.c.a);
      }
   }

   public boolean ec() {
      return !this.o_();
   }

   protected boolean ed() {
      return !this.o_();
   }

   protected int m(int $$0) {
      int $$1 = cqu.e(this);
      return $$1 > 0 && this.ag.a($$1 + 1) > 0 ? $$0 : $$0 - 1;
   }

   protected int n(int $$0) {
      return Math.min($$0 + 4, this.ch());
   }

   public int ee() {
      return 0;
   }

   protected boolean ef() {
      return false;
   }

   public auf eg() {
      return this.ag;
   }

   @Nullable
   public blv eh() {
      return this.bU;
   }

   @Override
   public blv V_() {
      return this.eh();
   }

   public int ei() {
      return this.bV;
   }

   public void c(@Nullable cer $$0) {
      this.aY = $$0;
      this.aZ = this.ah;
   }

   public void a(@Nullable blv $$0) {
      this.bU = $$0;
      this.bV = this.ah;
   }

   @Nullable
   public blv ej() {
      return this.bW;
   }

   public int ek() {
      return this.bX;
   }

   public void A(blf $$0) {
      if ($$0 instanceof blv) {
         this.bW = (blv)$$0;
      } else {
         this.bW = null;
      }

      this.bX = this.ah;
   }

   public int el() {
      return this.bb;
   }

   public void o(int $$0) {
      this.bb = $$0;
   }

   public boolean em() {
      return this.bS;
   }

   public void p(boolean $$0) {
      this.bS = $$0;
   }

   protected boolean a(blk $$0) {
      return true;
   }

   public void a(blk $$0, cmh $$1, cmh $$2) {
      boolean $$3 = $$2.b() && $$1.b();
      if (!$$3 && !cmh.c($$1, $$2) && !this.am) {
         cli $$4 = cli.c_($$2);
         if (!this.dM().y_() && !this.P_()) {
            if (!this.aU() && $$4 != null && $$4.g() == $$0) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), $$4.as_(), this.db(), 1.0F, 1.0F);
            }

            if (this.a($$0)) {
               this.a($$4 != null ? dmz.v : dmz.S);
            }
         }
      }
   }

   @Override
   public void a(blf.c $$0) {
      super.a($$0);
      this.bz.a();
   }

   @Override
   public void b(sj $$0) {
      $$0.a("Health", this.ev());
      $$0.a("HurtTime", (short)this.aK);
      $$0.a("HurtByTimestamp", this.bV);
      $$0.a("DeathTime", (short)this.aM);
      $$0.a("AbsorptionAmount", this.fk());
      $$0.a("Attributes", this.eR().c());
      if (!this.bP.isEmpty()) {
         sp $$1 = new sp();

         for (bks $$2 : this.bP.values()) {
            $$1.add($$2.a(new sj()));
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fw());
      this.fB().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<tg> $$3 = this.bz.a(sx.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(sj $$0) {
      this.z($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dM() != null && !this.dM().B) {
         this.eR().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         sp $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            sj $$3 = $$1.a($$2);
            bks $$4 = bks.b($$3);
            if ($$4 != null) {
               this.bP.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.c($$0.j("Health"));
      }

      this.aK = $$0.g("HurtTime");
      this.aM = $$0.g("DeathTime");
      this.bV = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         ely $$6 = this.dM().J().d($$5);
         boolean $$7 = $$6 != null && this.dM().J().a(this.cx(), $$6);
         if (!$$7) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         hv $$8 = new hv($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$8);
         this.an.b(as, bmh.c);
         if (!this.am) {
            this.a($$8);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bz = this.a(new Dynamic(sx.a, $$0.c("Brain")));
      }
   }

   protected void en() {
      Iterator<bkq> $$0 = this.bP.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            bkq $$1 = $$0.next();
            bks $$2 = this.bP.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dM().B) {
                  $$0.remove();
                  this.a($$2);
               }
            } else if ($$2.d() % 600 == 0) {
               this.a($$2, false, null);
            }
         }
      } catch (ConcurrentModificationException var11) {
      }

      if (this.bT) {
         if (!this.dM().B) {
            this.J();
            this.u();
         }

         this.bT = false;
      }

      int $$3 = this.an.b(bI);
      boolean $$4 = this.an.b(bJ);
      if ($$3 > 0) {
         boolean $$5;
         if (this.ce()) {
            $$5 = this.ag.a(15) == 0;
         } else {
            $$5 = this.ag.h();
         }

         if ($$4) {
            $$5 &= this.ag.a(5) == 0;
         }

         if ($$5 && $$3 > 0) {
            double $$7 = (double)($$3 >> 16 & 0xFF) / 255.0;
            double $$8 = (double)($$3 >> 8 & 0xFF) / 255.0;
            double $$9 = (double)($$3 >> 0 & 0xFF) / 255.0;
            this.dM().a($$4 ? jv.a : jv.v, this.d(0.5), this.du(), this.g(0.5), $$7, $$8, $$9);
         }
      }
   }

   protected void J() {
      if (this.bP.isEmpty()) {
         this.eq();
         this.j(false);
      } else {
         Collection<bks> $$0 = this.bP.values();
         this.an.b(bJ, c($$0));
         this.an.b(bI, cog.a($$0));
         this.j(this.a(bku.n));
      }
   }

   private void u() {
      boolean $$0 = this.cd();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable blf $$0) {
      double $$1 = 1.0;
      if (this.bV()) {
         $$1 *= 0.8;
      }

      if (this.ce()) {
         float $$2 = this.eV();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cmh $$3 = this.c(blk.f);
         blj<?> $$4 = $$0.ai();
         if ($$4 == blj.aK && $$3.a(cmk.ue)
            || $$4 == blj.br && $$3.a(cmk.uh)
            || $$4 == blj.ax && $$3.a(cmk.uk)
            || $$4 == blj.ay && $$3.a(cmk.uk)
            || $$4 == blj.v && $$3.a(cmk.ui)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(blv $$0) {
      return $$0 instanceof cer && this.dM().aj() == bji.a ? false : $$0.eo();
   }

   public boolean a(blv $$0, bwj $$1) {
      return $$1.a(this, $$0);
   }

   public boolean eo() {
      return !this.cr() && this.ep();
   }

   public boolean ep() {
      return !this.P_() && this.bx();
   }

   public static boolean c(Collection<bks> $$0) {
      for (bks $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void eq() {
      this.an.b(bJ, false);
      this.an.b(bI, 0);
   }

   public boolean er() {
      if (this.dM().B) {
         return false;
      } else {
         Iterator<bks> $$0 = this.bP.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<bks> es() {
      return this.bP.values();
   }

   public Map<bkq, bks> et() {
      return this.bP;
   }

   public boolean a(bkq $$0) {
      return this.bP.containsKey($$0);
   }

   @Nullable
   public bks b(bkq $$0) {
      return this.bP.get($$0);
   }

   public final boolean b(bks $$0) {
      return this.b($$0, null);
   }

   public boolean b(bks $$0, @Nullable blf $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         bks $$2 = this.bP.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bP.put($$0.c(), $$0);
            this.a($$0, $$1);
            $$3 = true;
         } else if ($$2.b($$0)) {
            this.a($$2, true, $$1);
            $$3 = true;
         }

         $$0.a(this);
         return $$3;
      }
   }

   public boolean c(bks $$0) {
      if (this.eS() == bma.b) {
         bkq $$1 = $$0.c();
         if ($$1 == bku.j || $$1 == bku.s) {
            return false;
         }
      }

      return true;
   }

   public void c(bks $$0, @Nullable blf $$1) {
      if (this.c($$0)) {
         bks $$2 = this.bP.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eu() {
      return this.eS() == bma.b;
   }

   @Nullable
   public bks c(@Nullable bkq $$0) {
      return this.bP.remove($$0);
   }

   public boolean d(bkq $$0) {
      bks $$1 = this.c($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(bks $$0, @Nullable blf $$1) {
      this.bT = true;
      if (!this.dM().B) {
         $$0.c().a(this.eR(), $$0.e());
         this.d($$0);
      }
   }

   public void d(bks $$0) {
      for (blf $$1 : this.cP()) {
         if ($$1 instanceof amq $$2) {
            $$2.c.b(new acr(this.aj(), $$0));
         }
      }
   }

   protected void a(bks $$0, boolean $$1, @Nullable blf $$2) {
      this.bT = true;
      if ($$1 && !this.dM().B) {
         bkq $$3 = $$0.c();
         $$3.a(this.eR());
         $$3.a(this.eR(), $$0.e());
         this.y();
      }

      if (!this.dM().B) {
         this.d($$0);
      }
   }

   protected void a(bks $$0) {
      this.bT = true;
      if (!this.dM().B) {
         $$0.c().a(this.eR());
         this.y();

         for (blf $$1 : this.cP()) {
            if ($$1 instanceof amq $$2) {
               $$2.c.b(new aax(this.aj(), $$0.c()));
            }
         }
      }
   }

   private void y() {
      for (bmx $$0 : this.eR().a()) {
         this.d($$0.a());
      }
   }

   private void d(bmw $$0) {
      if ($$0 == bnb.l) {
         float $$1 = this.eM();
         if (this.ev() > $$1) {
            this.c($$1);
         }
      } else if ($$0 == bnb.k) {
         float $$2 = this.eN();
         if (this.fk() > $$2) {
            this.y($$2);
         }
      }
   }

   public void b(float $$0) {
      float $$1 = this.ev();
      if ($$1 > 0.0F) {
         this.c($$1 + $$0);
      }
   }

   public float ev() {
      return this.an.b(bH);
   }

   public void c(float $$0) {
      this.an.b(bH, aty.a($$0, 0.0F, this.eM()));
   }

   public boolean ew() {
      return this.ev() <= 0.0F;
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dM().B) {
         return false;
      } else if (this.ew()) {
         return false;
      } else if ($$0.a(art.j) && this.a(bku.l)) {
         return false;
      } else {
         if (this.fD() && !this.dM().B) {
            this.fE();
         }

         this.bb = 0;
         float $$2 = $$1;
         boolean $$3 = false;
         float $$4 = 0.0F;
         if ($$1 > 0.0F && this.f($$0)) {
            this.u($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.a(art.k) && $$0.c() instanceof blv $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(art.p) && this.ai().a(aru.l)) {
            $$1 *= 5.0F;
         }

         this.aQ.a(1.5F);
         boolean $$7 = true;
         if ((float)this.al > 10.0F && !$$0.a(art.f)) {
            if ($$1 <= this.bi) {
               return false;
            }

            this.f($$0, $$1 - this.bi);
            this.bi = $$1;
            $$7 = false;
         } else {
            this.bi = $$1;
            this.al = 20;
            this.f($$0, $$1);
            this.aL = 10;
            this.aK = this.aL;
         }

         if ($$0.a(art.a) && !this.c(blk.f).b()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         blf $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof blv $$9 && !$$0.a(art.r)) {
               this.a($$9);
            }

            if ($$8 instanceof cer $$10) {
               this.aZ = 100;
               this.aY = $$10;
            } else if ($$8 instanceof byl $$11 && $$11.u()) {
               this.aZ = 100;
               if ($$11.R_() instanceof cer $$12) {
                  this.aY = $$12;
               } else {
                  this.aY = null;
               }
            }
         }

         if ($$7) {
            if ($$3) {
               this.dM().a(this, (byte)29);
            } else {
               this.dM().a(this, $$0);
            }

            if (!$$0.a(art.s) && (!$$3 || $$1 > 0.0F)) {
               this.bq();
            }

            if ($$8 != null && !$$0.a(art.A)) {
               double $$13 = $$8.dr() - this.dr();

               double $$14;
               for ($$14 = $$8.dx() - this.dx(); $$13 * $$13 + $$14 * $$14 < 1.0E-4; $$14 = (Math.random() - Math.random()) * 0.01) {
                  $$13 = (Math.random() - Math.random()) * 0.01;
               }

               this.q(0.4F, $$13, $$14);
               if (!$$3) {
                  this.a($$13, $$14);
               }
            }
         }

         if (this.ew()) {
            if (!this.h($$0)) {
               arb $$15 = this.n_();
               if ($$7 && $$15 != null) {
                  this.a($$15, this.eW(), this.eX());
               }

               this.a($$0);
            }
         } else if ($$7) {
            this.e($$0);
         }

         boolean $$16 = !$$3 || $$1 > 0.0F;
         if ($$16) {
            this.cd = $$0;
            this.ce = this.dM().W();
         }

         if (this instanceof amq) {
            am.i.a((amq)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((amq)this).a(arm.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof amq) {
            am.h.a((amq)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$16;
      }
   }

   protected void d(blv $$0) {
      $$0.e(this);
   }

   protected void e(blv $$0) {
      $$0.q(0.5, $$0.dr() - this.dr(), $$0.dx() - this.dx());
   }

   private boolean h(bkd $$0) {
      if ($$0.a(art.e)) {
         return false;
      } else {
         cmh $$1 = null;

         for (bjk $$2 : bjk.values()) {
            cmh $$3 = this.b($$2);
            if ($$3.a(cmk.vm)) {
               $$1 = $$3.p();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof amq $$4) {
               $$4.b(arm.c.b(cmk.vm));
               am.C.a($$4, $$1);
               this.a(dmz.C);
            }

            this.c(1.0F);
            this.er();
            this.b(new bks(bku.j, 900, 1));
            this.b(new bks(bku.v, 100, 1));
            this.b(new bks(bku.l, 800, 0));
            this.dM().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bkd ex() {
      if (this.dM().W() - this.ce > 40L) {
         this.cd = null;
      }

      return this.cd;
   }

   protected void e(bkd $$0) {
      arb $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eW(), this.eX());
      }
   }

   public boolean f(bkd $$0) {
      blf $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cex $$3 && $$3.E() > 0) {
         $$2 = true;
      }

      if (!$$0.a(art.d) && this.fu() && !$$2) {
         elb $$4 = $$0.h();
         if ($$4 != null) {
            elb $$5 = this.b(0.0F, this.cp());
            elb $$6 = $$4.a(this.dk());
            $$6 = new elb($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(cmh $$0) {
      if (!$$0.b()) {
         if (!this.aU()) {
            this.dM().a(this.dr(), this.dt(), this.dx(), arc.mN, this.db(), 0.8F, 0.8F + this.dM().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bkd $$0) {
      if (!this.dH() && !this.ba) {
         blf $$1 = $$0.d();
         blv $$2 = this.eL();
         if (this.bh >= 0 && $$2 != null) {
            $$2.a(this, this.bh, $$0);
         }

         if (this.fD()) {
            this.fE();
         }

         if (!this.dM().B && this.ae()) {
            b.info("Named entity {} died: {}", this, this.eK().a().getString());
         }

         this.ba = true;
         this.eK().c();
         if (this.dM() instanceof amp $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(dmz.p);
               this.g($$0);
               this.f($$2);
            }

            this.dM().a(this, (byte)3);
         }

         this.b(bmh.h);
      }
   }

   protected void f(@Nullable blv $$0) {
      if (!this.dM().B) {
         boolean $$1 = false;
         if ($$0 instanceof cas) {
            if (this.dM().Y().b(csu.c)) {
               hv $$2 = this.dm();
               dip $$3 = cwb.cd.o();
               if (this.dM().a_($$2).i() && $$3.a((ctb)this.dM(), $$2)) {
                  this.dM().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               cbe $$4 = new cbe(this.dM(), this.dr(), this.dt(), this.dx(), new cmh(cmk.dv));
               this.dM().b($$4);
            }
         }
      }
   }

   protected void g(bkd $$0) {
      blf $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof cer) {
         $$2 = cqu.h((blv)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.aZ > 0;
      if (this.ed() && this.dM().Y().b(csu.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.ey();
      this.ez();
   }

   protected void ey() {
   }

   protected void ez() {
      if (this.dM() instanceof amp && !this.eD() && (this.ef() || this.aZ > 0 && this.ec() && this.dM().Y().b(csu.f))) {
         bll.a((amp)this.dM(), this.dk(), this.ee());
      }
   }

   protected void a(bkd $$0, int $$1, boolean $$2) {
   }

   public agt eA() {
      return this.ai().j();
   }

   public long eB() {
      return 0L;
   }

   protected void a(bkd $$0, boolean $$1) {
      agt $$2 = this.eA();
      egm $$3 = this.dM().n().aJ().getLootTable($$2);
      egk.a $$4 = new egk.a((amp)this.dM()).a(eip.a, this).a(eip.f, this.dk()).a(eip.c, $$0).b(eip.d, $$0.d()).b(eip.e, $$0.c());
      if ($$1 && this.aY != null) {
         $$4 = $$4.a(eip.b, this.aY).a(this.aY.go());
      }

      egk $$5 = $$4.a(eio.g);
      $$3.a($$5, this.eB(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.b(bnb.i);
      if (!($$0 <= 0.0)) {
         this.au = true;
         elb $$3 = this.dp();
         elb $$4 = new elb($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aC() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected arb d(bkd $$0) {
      return arc.jC;
   }

   @Nullable
   protected arb n_() {
      return arc.jx;
   }

   private arb d(int $$0) {
      return $$0 > 4 ? this.eG().b() : this.eG().a();
   }

   public void eC() {
      this.ch = true;
   }

   public boolean eD() {
      return this.ch;
   }

   public float eE() {
      return 0.0F;
   }

   protected ekw eF() {
      ekw $$0 = this.cH();
      blf $$1 = this.cZ();
      if ($$1 != null) {
         elb $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public blv.a eG() {
      return new blv.a(arc.jD, arc.jv);
   }

   protected arb c(cmh $$0) {
      return $$0.N();
   }

   public arb d(cmh $$0) {
      return $$0.O();
   }

   public Optional<hv> eH() {
      return this.cc;
   }

   public boolean e_() {
      if (this.P_()) {
         return false;
      } else {
         hv $$0 = this.dm();
         dip $$1 = this.dn();
         if ($$1.a(arr.aO)) {
            this.cc = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof del && this.c($$0, $$1)) {
            this.cc = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(hv $$0, dip $$1) {
      if ($$1.c(del.b)) {
         dip $$2 = this.dM().a_($$0.d());
         if ($$2.a(cwb.cO) && $$2.c(dae.b) == $$1.c(del.aE)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean bx() {
      return !this.dH() && this.ev() > 0.0F;
   }

   @Override
   public boolean a(float $$0, float $$1, bkd $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.d($$0, $$1);
      if ($$4 > 0) {
         this.a(this.d($$4), 1.0F, 1.0F);
         this.eI();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int d(float $$0, float $$1) {
      if (this.ai().a(aru.o)) {
         return 0;
      } else {
         bks $$2 = this.b(bku.h);
         float $$3 = $$2 == null ? 0.0F : (float)($$2.e() + 1);
         return aty.f(($$0 - 3.0F - $$3) * $$1);
      }
   }

   protected void eI() {
      if (!this.aU()) {
         int $$0 = aty.a(this.dr());
         int $$1 = aty.a(this.dt() - 0.2F);
         int $$2 = aty.a(this.dx());
         dip $$3 = this.dM().a_(new hv($$0, $$1, $$2));
         if (!$$3.i()) {
            ddl $$4 = $$3.w();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void m(float $$0) {
      this.aL = 10;
      this.aK = this.aL;
   }

   public int eJ() {
      return aty.a(this.b(bnb.a));
   }

   protected void b(bkd $$0, float $$1) {
   }

   protected void c(bkd $$0, float $$1) {
   }

   protected void u(float $$0) {
   }

   protected float d(bkd $$0, float $$1) {
      if (!$$0.a(art.c)) {
         this.b($$0, $$1);
         $$1 = bjz.a($$1, (float)this.eJ(), (float)this.b(bnb.b));
      }

      return $$1;
   }

   protected float e(bkd $$0, float $$1) {
      if ($$0.a(art.g)) {
         return $$1;
      } else {
         if (this.a(bku.k) && !$$0.a(art.h)) {
            int $$2 = (this.b(bku.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof amq) {
                  ((amq)this).a(arm.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof amq) {
                  ((amq)$$0.d()).a(arm.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(art.i)) {
            return $$1;
         } else {
            int $$7 = cqu.a(this.bL(), $$0);
            if ($$7 > 0) {
               $$1 = bjz.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bkd $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fk(), 0.0F);
         this.y(this.fk() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof amq $$4) {
            $$4.a(arm.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eK().a($$0, var9);
            this.c(this.ev() - var9);
            this.y(this.fk() - var9);
            this.a(dmz.o);
         }
      }
   }

   public bka eK() {
      return this.bO;
   }

   @Nullable
   public blv eL() {
      if (this.aY != null) {
         return this.aY;
      } else {
         return this.bU != null ? this.bU : null;
      }
   }

   public final float eM() {
      return (float)this.b(bnb.l);
   }

   public final float eN() {
      return (float)this.b(bnb.k);
   }

   public final int eO() {
      return this.an.b(bK);
   }

   public final void p(int $$0) {
      this.an.b(bK, $$0);
   }

   public final int eP() {
      return this.an.b(bL);
   }

   public final void q(int $$0) {
      this.an.b(bL, $$0);
   }

   private int B() {
      if (bkt.a(this)) {
         return 6 - (1 + bkt.b(this));
      } else {
         return this.a(bku.d) ? 6 + (1 + this.b(bku.d).e()) * 2 : 6;
      }
   }

   public void a(bjk $$0) {
      this.a($$0, false);
   }

   public void a(bjk $$0, boolean $$1) {
      if (!this.aF || this.aH >= this.B() / 2 || this.aH < 0) {
         this.aH = -1;
         this.aF = true;
         this.aG = $$0;
         if (this.dM() instanceof amp) {
            yr $$2 = new yr(this, $$0 == bjk.a ? 0 : 3);
            amn $$3 = ((amp)this.dM()).k();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bkd $$0) {
      this.aQ.a(1.5F);
      this.al = 20;
      this.aL = 10;
      this.aK = this.aL;
      arb $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eW(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
      }

      this.a(this.dN().n(), 0.0F);
      this.cd = $$0;
      this.ce = this.dM().W();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            arb $$1 = this.n_();
            if ($$1 != null) {
               this.a($$1, this.eW(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cer)) {
               this.c(0.0F);
               this.a(this.dN().n());
            }
            break;
         case 29:
            this.a(arc.vG, 1.0F, 0.8F + this.dM().z.i() * 0.4F);
            break;
         case 30:
            this.a(arc.vH, 0.8F, 0.8F + this.dM().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ag.i() - 0.5F) * 0.2F;
               float $$6 = (this.ag.i() - 0.5F) * 0.2F;
               float $$7 = (this.ag.i() - 0.5F) * 0.2F;
               double $$8 = aty.d($$4, this.K, this.dr()) + (this.ag.j() - 0.5) * (double)this.dg() * 2.0;
               double $$9 = aty.d($$4, this.L, this.dt()) + this.ag.j() * (double)this.dh();
               double $$10 = aty.d($$4, this.M, this.dx()) + (this.ag.j() - 0.5) * (double)this.dg() * 2.0;
               this.dM().a(jv.Z, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.c(blk.a));
            break;
         case 48:
            this.i(this.c(blk.b));
            break;
         case 49:
            this.i(this.c(blk.f));
            break;
         case 50:
            this.i(this.c(blk.e));
            break;
         case 51:
            this.i(this.c(blk.d));
            break;
         case 52:
            this.i(this.c(blk.c));
            break;
         case 54:
            czs.b(this);
            break;
         case 55:
            this.D();
            break;
         case 60:
            this.C();
            break;
         default:
            super.b($$0);
      }
   }

   private void C() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.ag.k() * 0.02;
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         this.dM().a(jv.Y, this.d(1.0), this.du(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void D() {
      cmh $$0 = this.c(blk.b);
      this.a(blk.b, this.c(blk.a));
      this.a(blk.a, $$0);
   }

   @Override
   protected void aB() {
      this.a(this.dN().m(), 4.0F);
   }

   protected void eQ() {
      int $$0 = this.B();
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
   public bmx a(bmw $$0) {
      return this.eR().a($$0);
   }

   public double a(ie<bmw> $$0) {
      return this.b($$0.a());
   }

   public double b(bmw $$0) {
      return this.eR().c($$0);
   }

   public double b(ie<bmw> $$0) {
      return this.c($$0.a());
   }

   public double c(bmw $$0) {
      return this.eR().d($$0);
   }

   public bmy eR() {
      return this.bN;
   }

   public bma eS() {
      return bma.a;
   }

   public cmh eT() {
      return this.c(blk.a);
   }

   public cmh eU() {
      return this.c(blk.b);
   }

   public boolean b(cmc $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cmh> $$0) {
      return $$0.test(this.eT()) || $$0.test(this.eU());
   }

   public cmh b(bjk $$0) {
      if ($$0 == bjk.a) {
         return this.c(blk.a);
      } else if ($$0 == bjk.b) {
         return this.c(blk.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bjk $$0, cmh $$1) {
      if ($$0 == bjk.a) {
         this.a(blk.a, $$1);
      } else {
         if ($$0 != bjk.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(blk.b, $$1);
      }
   }

   public boolean b(blk $$0) {
      return !this.c($$0).b();
   }

   @Override
   public abstract Iterable<cmh> bL();

   public abstract cmh c(blk var1);

   @Override
   public abstract void a(blk var1, cmh var2);

   protected void e(cmh $$0) {
      sj $$1 = $$0.v();
      if ($$1 != null) {
         $$0.d().b($$1);
      }
   }

   public float eV() {
      Iterable<cmh> $$0 = this.bL();
      int $$1 = 0;
      int $$2 = 0;

      for (cmh $$3 : $$0) {
         if (!$$3.b()) {
            $$2++;
         }

         $$1++;
      }

      return $$1 > 0 ? (float)$$2 / (float)$$1 : 0.0F;
   }

   @Override
   public void g(boolean $$0) {
      super.g($$0);
      bmx $$1 = this.a(bnb.m);
      $$1.b(bA.a());
      if ($$0) {
         $$1.b(bA);
      }
   }

   protected float eW() {
      return 1.0F;
   }

   public float eX() {
      return this.o_() ? (this.ag.i() - this.ag.i()) * 0.2F + 1.5F : (this.ag.i() - this.ag.i()) * 0.2F + 1.0F;
   }

   protected boolean eY() {
      return this.ew();
   }

   @Override
   public void g(blf $$0) {
      if (!this.fD()) {
         super.g($$0);
      }
   }

   private void a(blf $$0) {
      elb $$1;
      if (this.dH()) {
         $$1 = this.dk();
      } else if (!$$0.dH() && !this.dM().a_($$0.dm()).a(arr.aI)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dt(), $$0.dt());
         $$1 = new elb(this.dr(), $$2, this.dx());
      }

      this.a($$1.c, $$1.d, $$1.e);
   }

   @Override
   public boolean cC() {
      return this.cB();
   }

   protected float eZ() {
      return 0.42F * this.aK() + this.fa();
   }

   public float fa() {
      return this.a(bku.h) ? 0.1F * ((float)this.b(bku.h).e() + 1.0F) : 0.0F;
   }

   protected void fb() {
      elb $$0 = this.dp();
      this.o($$0.c, (double)this.eZ(), $$0.e);
      if (this.bY()) {
         float $$1 = this.dC() * (float) (Math.PI / 180.0);
         this.g(this.dp().b((double)(-aty.a($$1) * 0.2F), 0.0, (double)(aty.b($$1) * 0.2F)));
      }

      this.au = true;
   }

   protected void fc() {
      this.g(this.dp().b(0.0, -0.04F, 0.0));
   }

   protected void c(asg<edy> $$0) {
      this.g(this.dp().b(0.0, 0.04F, 0.0));
   }

   protected float fd() {
      return 0.8F;
   }

   public boolean a(edz $$0) {
      return false;
   }

   public void a(elb $$0) {
      if (this.cX()) {
         double $$1 = 0.08;
         boolean $$2 = this.dp().d <= 0.0;
         if ($$2 && this.a(bku.B)) {
            $$1 = 0.01;
         }

         edz $$3 = this.dM().b_(this.dm());
         if (this.aZ() && this.ea() && !this.a($$3)) {
            double $$4 = this.dt();
            float $$5 = this.bY() ? 0.9F : this.fd();
            float $$6 = 0.02F;
            float $$7 = (float)cqu.f(this);
            if ($$7 > 3.0F) {
               $$7 = 3.0F;
            }

            if (!this.aC()) {
               $$7 *= 0.5F;
            }

            if ($$7 > 0.0F) {
               $$5 += (0.54600006F - $$5) * $$7 / 3.0F;
               $$6 += (this.ff() - $$6) * $$7 / 3.0F;
            }

            if (this.a(bku.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(bmb.a, this.dp());
            elb $$8 = this.dp();
            if (this.P && this.e_()) {
               $$8 = new elb($$8.c, 0.2, $$8.e);
            }

            this.g($$8.d((double)$$5, 0.8F, (double)$$5));
            elb $$9 = this.a($$1, $$2, this.dp());
            this.g($$9);
            if (this.P && this.g($$9.c, $$9.d + 0.6F - this.dt() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bn() && this.ea() && !this.a($$3)) {
            double $$10 = this.dt();
            this.a(0.02F, $$0);
            this.a(bmb.a, this.dp());
            if (this.b(arw.b) <= this.df()) {
               this.g(this.dp().d(0.5, 0.8F, 0.5));
               elb $$11 = this.a($$1, $$2, this.dp());
               this.g($$11);
            } else {
               this.g(this.dp().a(0.5));
            }

            if (!this.aV()) {
               this.g(this.dp().b(0.0, -$$1 / 4.0, 0.0));
            }

            elb $$12 = this.dp();
            if (this.P && this.g($$12.c, $$12.d + 0.6F - this.dt() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fw()) {
            this.cn();
            elb $$13 = this.dp();
            elb $$14 = this.bF();
            float $$15 = this.dE() * (float) (Math.PI / 180.0);
            double $$16 = Math.sqrt($$14.c * $$14.c + $$14.e * $$14.e);
            double $$17 = $$13.h();
            double $$18 = $$14.f();
            double $$19 = Math.cos((double)$$15);
            $$19 = $$19 * $$19 * Math.min(1.0, $$18 / 0.4);
            $$13 = this.dp().b(0.0, $$1 * (-1.0 + $$19 * 0.75), 0.0);
            if ($$13.d < 0.0 && $$16 > 0.0) {
               double $$20 = $$13.d * -0.1 * $$19;
               $$13 = $$13.b($$14.c * $$20 / $$16, $$20, $$14.e * $$20 / $$16);
            }

            if ($$15 < 0.0F && $$16 > 0.0) {
               double $$21 = $$17 * (double)(-aty.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.g($$13.d(0.99F, 0.98F, 0.99F));
            this.a(bmb.a, this.dp());
            if (this.P && !this.dM().B) {
               double $$22 = this.dp().h();
               double $$23 = $$17 - $$22;
               float $$24 = (float)($$23 * 10.0 - 3.0);
               if ($$24 > 0.0F) {
                  this.a(this.d((int)$$24), 1.0F, 1.0F);
                  this.a(this.dN().l(), $$24);
               }
            }

            if (this.aC() && !this.dM().B) {
               this.b(7, false);
            }
         } else {
            hv $$25 = this.aI();
            float $$26 = this.dM().a_($$25).b().i();
            float $$27 = this.aC() ? $$26 * 0.91F : 0.91F;
            elb $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.a(bku.y)) {
               $$29 += (0.05 * (double)(this.b(bku.y).e() + 1) - $$28.d) * 0.2;
            } else if (this.dM().B && !this.dM().A($$25)) {
               if (this.dt() > (double)this.dM().J_()) {
                  $$29 = -0.1;
               } else {
                  $$29 = 0.0;
               }
            } else if (!this.aV()) {
               $$29 -= $$1;
            }

            if (this.em()) {
               this.o($$28.c, $$29, $$28.e);
            } else {
               this.o($$28.c * (double)$$27, $$29 * 0.98F, $$28.e * (double)$$27);
            }
         }
      }

      this.q(this instanceof bxr);
   }

   private void c(cer $$0, elb $$1) {
      elb $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.cX()) {
         this.w(this.e($$0));
         this.a($$2);
      } else {
         this.q(false);
         this.g(elb.b);
         this.aD();
      }
   }

   protected void a(cer $$0, elb $$1) {
   }

   protected elb b(cer $$0, elb $$1) {
      return $$1;
   }

   protected float e(cer $$0) {
      return this.ff();
   }

   public void q(boolean $$0) {
      float $$1 = (float)aty.g(this.dr() - this.K, $$0 ? this.dt() - this.L : 0.0, this.dx() - this.M);
      this.v($$1);
   }

   protected void v(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aQ.a($$1, 0.4F);
   }

   public elb a(elb $$0, float $$1) {
      this.a(this.A($$1), $$0);
      this.g(this.j(this.dp()));
      this.a(bmb.a, this.dp());
      elb $$2 = this.dp();
      if ((this.P || this.bj) && (this.e_() || this.dn().a(cwb.qP) && dbs.a(this))) {
         $$2 = new elb($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public elb a(double $$0, boolean $$1, elb $$2) {
      if (!this.aV() && !this.bY()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new elb($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private elb j(elb $$0) {
      if (this.e_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = aty.a($$0.c, -0.15F, 0.15F);
         double $$3 = aty.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dn().a(cwb.nS) && this.fv() && this instanceof cer) {
            $$4 = 0.0;
         }

         $$0 = new elb($$2, $$4, $$3);
      }

      return $$0;
   }

   private float A(float $$0) {
      return this.aC() ? this.ff() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fe();
   }

   protected float fe() {
      return this.cN() instanceof cer ? this.ff() * 0.1F : 0.02F;
   }

   public float ff() {
      return this.bY;
   }

   public void w(float $$0) {
      this.bY = $$0;
   }

   public boolean C(blf $$0) {
      this.A($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.I();
      this.M();
      if (!this.dM().B) {
         int $$0 = this.eO();
         if ($$0 > 0) {
            if (this.aI <= 0) {
               this.aI = 20 * (30 - $$0);
            }

            this.aI--;
            if (this.aI <= 0) {
               this.p($$0 - 1);
            }
         }

         int $$1 = this.eP();
         if ($$1 > 0) {
            if (this.aJ <= 0) {
               this.aJ = 20 * (30 - $$1);
            }

            this.aJ--;
            if (this.aJ <= 0) {
               this.q($$1 - 1);
            }
         }

         this.E();
         if (this.ah % 20 == 0) {
            this.eK().c();
         }

         if (this.fD() && !this.N()) {
            this.fE();
         }
      }

      if (!this.dH()) {
         this.d_();
      }

      double $$2 = this.dr() - this.K;
      double $$3 = this.dx() - this.M;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aU;
      float $$6 = 0.0F;
      this.bc = this.bd;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)aty.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = aty.e(aty.g(this.dC()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aO > 0.0F) {
         $$5 = this.dC();
      }

      if (!this.aC()) {
         $$7 = 0.0F;
      }

      this.bd = this.bd + ($$7 - this.bd) * 0.3F;
      this.dM().ae().a("headTurn");
      $$6 = this.e($$5, $$6);
      this.dM().ae().c();
      this.dM().ae().a("rangeChecks");

      while (this.dC() - this.N < -180.0F) {
         this.N -= 360.0F;
      }

      while (this.dC() - this.N >= 180.0F) {
         this.N += 360.0F;
      }

      while (this.aU - this.aV < -180.0F) {
         this.aV -= 360.0F;
      }

      while (this.aU - this.aV >= 180.0F) {
         this.aV += 360.0F;
      }

      while (this.dE() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dE() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aW - this.aX < -180.0F) {
         this.aX -= 360.0F;
      }

      while (this.aW - this.aX >= 180.0F) {
         this.aX += 360.0F;
      }

      this.dM().ae().c();
      this.be += $$6;
      if (this.fw()) {
         this.bx++;
      } else {
         this.bx = 0;
      }

      if (this.fD()) {
         this.s(0.0F);
      }

      this.y();
   }

   private void E() {
      Map<blk, cmh> $$0 = this.G();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<blk, cmh> G() {
      Map<blk, cmh> $$0 = null;

      for (blk $$1 : blk.values()) {
         cmh $$2;
         switch ($$1.a()) {
            case a:
               $$2 = this.f($$1);
               break;
            case b:
               $$2 = this.e($$1);
               break;
            default:
               continue;
         }

         cmh $$5 = this.c($$1);
         if (this.a($$2, $$5)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(blk.class);
            }

            $$0.put($$1, $$5);
            if (!$$2.b()) {
               this.eR().a($$2.a($$1));
            }

            if (!$$5.b()) {
               this.eR().b($$5.a($$1));
            }
         }
      }

      return $$0;
   }

   public boolean a(cmh $$0, cmh $$1) {
      return !cmh.a($$1, $$0);
   }

   private void a(Map<blk, cmh> $$0) {
      cmh $$1 = $$0.get(blk.a);
      cmh $$2 = $$0.get(blk.b);
      if ($$1 != null && $$2 != null && cmh.a($$1, this.f(blk.b)) && cmh.a($$2, this.f(blk.a))) {
         ((amp)this.dM()).k().b(this, new zq(this, (byte)55));
         $$0.remove(blk.a);
         $$0.remove(blk.b);
         this.c(blk.a, $$1.p());
         this.c(blk.b, $$2.p());
      }
   }

   private void b(Map<blk, cmh> $$0) {
      List<Pair<blk, cmh>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cmh $$3 = $$2.p();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
         }
      });
      ((amp)this.dM()).k().b(this, new abs(this.aj(), $$1));
   }

   private cmh e(blk $$0) {
      return this.bR.get($$0.b());
   }

   private void b(blk $$0, cmh $$1) {
      this.bR.set($$0.b(), $$1);
   }

   private cmh f(blk $$0) {
      return this.bQ.get($$0.b());
   }

   private void c(blk $$0, cmh $$1) {
      this.bQ.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = aty.g($$0 - this.aU);
      this.aU += $$2 * 0.3F;
      float $$3 = aty.g(this.dC() - this.aU);
      float $$4 = this.fg();
      if (Math.abs($$3) > $$4) {
         this.aU = this.aU + ($$3 - (float)aty.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float fg() {
      return 50.0F;
   }

   public void d_() {
      if (this.bZ > 0) {
         this.bZ--;
      }

      if (this.cX()) {
         this.bn = 0;
         this.f(this.dr(), this.dt(), this.dx());
      }

      if (this.bn > 0) {
         this.a(this.bn, this.bo, this.bp, this.bq, this.br, this.bs);
         this.bn--;
      } else if (!this.cY()) {
         this.g(this.dp().a(0.98));
      }

      if (this.bu > 0) {
         this.a(this.bu, this.bt);
         this.bu--;
      }

      elb $$0 = this.dp();
      double $$1 = $$0.c;
      double $$2 = $$0.d;
      double $$3 = $$0.e;
      if (Math.abs($$0.c) < 0.003) {
         $$1 = 0.0;
      }

      if (Math.abs($$0.d) < 0.003) {
         $$2 = 0.0;
      }

      if (Math.abs($$0.e) < 0.003) {
         $$3 = 0.0;
      }

      this.o($$1, $$2, $$3);
      this.dM().ae().a("ai");
      if (this.eY()) {
         this.bj = false;
         this.bk = 0.0F;
         this.bm = 0.0F;
      } else if (this.cY()) {
         this.dM().ae().a("newAi");
         this.fi();
         this.dM().ae().c();
      }

      this.dM().ae().c();
      this.dM().ae().a("jump");
      if (this.bj && this.ea()) {
         double $$4;
         if (this.bn()) {
            $$4 = this.b(arw.b);
         } else {
            $$4 = this.b(arw.a);
         }

         boolean $$6 = this.aZ() && $$4 > 0.0;
         double $$7 = this.df();
         if (!$$6 || this.aC() && !($$4 > $$7)) {
            if (!this.bn() || this.aC() && !($$4 > $$7)) {
               if ((this.aC() || $$6 && $$4 <= $$7) && this.bZ == 0) {
                  this.fb();
                  this.bZ = 10;
               }
            } else {
               this.c(arw.b);
            }
         } else {
            this.c(arw.a);
         }
      } else {
         this.bZ = 0;
      }

      this.dM().ae().c();
      this.dM().ae().a("travel");
      this.bk *= 0.98F;
      this.bm *= 0.98F;
      this.H();
      ekw $$8 = this.cH();
      elb $$9 = new elb((double)this.bk, (double)this.bl, (double)this.bm);
      if (this.a(bku.B) || this.a(bku.y)) {
         this.n();
      }

      label104: {
         if (this.cN() instanceof cer $$10 && this.bx()) {
            this.c($$10, $$9);
            break label104;
         }

         this.a($$9);
      }

      this.dM().ae().c();
      this.dM().ae().a("freezing");
      if (!this.dM().B && !this.ew()) {
         int $$11 = this.cj();
         if (this.aA && this.dA()) {
            this.k(Math.min(this.cm(), $$11 + 1));
         } else {
            this.k(Math.max(0, $$11 - 2));
         }
      }

      this.dX();
      this.dY();
      if (!this.dM().B && this.ah % 40 == 0 && this.cl() && this.dA()) {
         this.a(this.dN().t(), 1.0F);
      }

      this.dM().ae().c();
      this.dM().ae().a("push");
      if (this.by > 0) {
         this.by--;
         this.a($$8, this.cH());
      }

      this.M_();
      this.dM().ae().c();
      if (!this.dM().B && this.fh() && this.bb()) {
         this.a(this.dN().h(), 1.0F);
      }
   }

   public boolean fh() {
      return false;
   }

   private void H() {
      boolean $$0 = this.i(7);
      if ($$0 && !this.aC() && !this.bO() && !this.a(bku.y)) {
         cmh $$1 = this.c(blk.e);
         if ($$1.a(cmk.nS) && clb.d($$1)) {
            $$0 = true;
            int $$2 = this.bx + 1;
            if (!this.dM().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, $$0x -> $$0x.d(blk.e));
               }

               this.a(dmz.n);
            }
         } else {
            $$0 = false;
         }
      } else {
         $$0 = false;
      }

      if (!this.dM().B) {
         this.b(7, $$0);
      }
   }

   protected void fi() {
   }

   protected void M_() {
      if (this.dM().y_()) {
         this.dM().a(dmn.a(cer.class), this.cH(), bli.a(this)).forEach(this::D);
      } else {
         List<blf> $$0 = this.dM().a(this, this.cH(), bli.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dM().Y().c(csu.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ag.a(4) == 0) {
               int $$2 = 0;

               for (blf $$3 : $$0) {
                  if (!$$3.bO()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dN().g(), 6.0F);
               }
            }

            for (blf $$4 : $$0) {
               this.D($$4);
            }
         }
      }
   }

   protected void a(ekw $$0, ekw $$1) {
      ekw $$2 = $$0.b($$1);
      List<blf> $$3 = this.dM().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (blf $$4 : $$3) {
            if ($$4 instanceof blv) {
               this.g((blv)$$4);
               this.by = 0;
               this.g(this.dp().a(-0.2));
               break;
            }
         }
      } else if (this.P) {
         this.by = 0;
      }

      if (!this.dM().B && this.by <= 0) {
         this.c(4, false);
      }
   }

   protected void D(blf $$0) {
      $$0.g(this);
   }

   protected void g(blv $$0) {
   }

   public boolean fj() {
      return (this.an.b(t) & 4) != 0;
   }

   @Override
   public void ac() {
      blf $$0 = this.cZ();
      super.ac();
      if ($$0 != null && $$0 != this.cZ() && !this.dM().B) {
         this.a($$0);
      }
   }

   @Override
   public void t() {
      super.t();
      this.bc = this.bd;
      this.bd = 0.0F;
      this.n();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.bo = $$0;
      this.bp = $$1;
      this.bq = $$2;
      this.br = (double)$$3;
      this.bs = (double)$$4;
      this.bn = $$5;
   }

   @Override
   public double p_() {
      return this.bn > 0 ? this.bo : this.dr();
   }

   @Override
   public double N_() {
      return this.bn > 0 ? this.bp : this.dt();
   }

   @Override
   public double O_() {
      return this.bn > 0 ? this.bq : this.dx();
   }

   @Override
   public float f_() {
      return this.bn > 0 ? (float)this.bs : this.dE();
   }

   @Override
   public float q_() {
      return this.bn > 0 ? (float)this.br : this.dC();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bt = (double)$$0;
      this.bu = $$1;
   }

   public void r(boolean $$0) {
      this.bj = $$0;
   }

   public void a(cbe $$0) {
      blf $$1 = $$0.w();
      if ($$1 instanceof amq) {
         am.P.a((amq)$$1, $$0.q(), this);
      }
   }

   public void a(blf $$0, int $$1) {
      if (!$$0.dH() && !this.dM().B && ($$0 instanceof cbe || $$0 instanceof cex || $$0 instanceof bll)) {
         ((amp)this.dM()).k().b($$0, new acl($$0.aj(), this.aj(), $$1));
      }
   }

   public boolean E(blf $$0) {
      if ($$0.dM() != this.dM()) {
         return false;
      } else {
         elb $$1 = new elb(this.dr(), this.dv(), this.dx());
         elb $$2 = new elb($$0.dr(), $$0.dv(), $$0.dx());
         return $$2.f($$1) > 128.0 ? false : this.dM().a(new csh($$1, $$2, csh.a.a, csh.b.a, this)).c() == ekz.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.aW : aty.i($$0, this.aX, this.aW);
   }

   public float x(float $$0) {
      float $$1 = this.aO - this.aN;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aN + $$1 * $$0;
   }

   @Override
   public boolean bt() {
      return !this.dH();
   }

   @Override
   public boolean bu() {
      return this.bx() && !this.P_() && !this.e_();
   }

   @Override
   public float cp() {
      return this.aW;
   }

   @Override
   public void n(float $$0) {
      this.aW = $$0;
   }

   @Override
   public void o(float $$0) {
      this.aU = $$0;
   }

   @Override
   protected elb a(ia.a $$0, l.a $$1) {
      return i(super.a($$0, $$1));
   }

   public static elb i(elb $$0) {
      return new elb($$0.c, $$0.d, 0.0);
   }

   public float fk() {
      return this.ca;
   }

   public final void y(float $$0) {
      this.z(aty.a($$0, 0.0F, this.eN()));
   }

   protected void z(float $$0) {
      this.ca = $$0;
   }

   public void g_() {
   }

   public void h_() {
   }

   protected void fl() {
      this.bT = true;
   }

   public abstract blp fm();

   public boolean fn() {
      return (this.an.b(t) & 1) > 0;
   }

   public bjk fo() {
      return (this.an.b(t) & 2) > 0 ? bjk.b : bjk.a;
   }

   private void I() {
      if (this.fn()) {
         if (cmh.b(this.b(this.fo()), this.bv)) {
            this.bv = this.b(this.fo());
            this.a(this.bv);
         } else {
            this.ft();
         }
      }
   }

   protected void a(cmh $$0) {
      $$0.b(this.dM(), this, this.fq());
      if (this.K()) {
         this.b($$0, 5);
      }

      if (--this.bw == 0 && !this.dM().B && !$$0.t()) {
         this.x();
      }
   }

   private boolean K() {
      int $$0 = this.fq();
      chh $$1 = this.bv.d().v();
      boolean $$2 = $$1 != null && $$1.e();
      $$2 |= $$0 <= this.bv.r() - 7;
      return $$2 && $$0 % 4 == 0;
   }

   private void M() {
      this.cg = this.cf;
      if (this.ca()) {
         this.cf = Math.min(1.0F, this.cf + 0.09F);
      } else {
         this.cf = Math.max(0.0F, this.cf - 0.09F);
      }
   }

   protected void c(int $$0, boolean $$1) {
      int $$2 = this.an.b(t);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.an.b(t, (byte)$$2);
   }

   public void c(bjk $$0) {
      cmh $$1 = this.b($$0);
      if (!$$1.b() && !this.fn()) {
         this.bv = $$1;
         this.bw = $$1.r();
         if (!this.dM().B) {
            this.c(1, true);
            this.c(2, $$0 == bjk.b);
            this.a(dmz.D);
         }
      }
   }

   @Override
   public void a(afz<?> $$0) {
      super.a($$0);
      if (bM.equals($$0)) {
         if (this.dM().B) {
            this.fB().ifPresent(this::a);
         }
      } else if (t.equals($$0) && this.dM().B) {
         if (this.fn() && this.bv.b()) {
            this.bv = this.b(this.fo());
            if (!this.bv.b()) {
               this.bw = this.bv.r();
            }
         } else if (!this.fn() && !this.bv.b()) {
            this.bv = cmh.f;
            this.bw = 0;
         }
      }
   }

   @Override
   public void a(ed.a $$0, elb $$1) {
      super.a($$0, $$1);
      this.aX = this.aW;
      this.aU = this.aW;
      this.aV = this.aU;
   }

   protected void b(cmh $$0, int $$1) {
      if (!$$0.b() && this.fn()) {
         if ($$0.s() == coa.c) {
            this.a(this.c($$0), 0.5F, this.dM().z.i() * 0.1F + 0.9F);
         }

         if ($$0.s() == coa.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(cmh $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         elb $$3 = new elb(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dE() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dC() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ag.i()) * 0.6 - 0.3;
         elb $$5 = new elb(((double)this.ag.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dE() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dC() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dr(), this.dv(), this.dx());
         this.dM().a(new jr(jv.Q, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void x() {
      if (!this.dM().B || this.fn()) {
         bjk $$0 = this.fo();
         if (!this.bv.equals(this.b($$0))) {
            this.fs();
         } else {
            if (!this.bv.b() && this.fn()) {
               this.b(this.bv, 16);
               cmh $$1 = this.bv.a(this.dM(), this);
               if ($$1 != this.bv) {
                  this.a($$0, $$1);
               }

               this.ft();
            }
         }
      }
   }

   public cmh fp() {
      return this.bv;
   }

   public int fq() {
      return this.bw;
   }

   public int fr() {
      return this.fn() ? this.bv.r() - this.fq() : 0;
   }

   public void fs() {
      if (!this.bv.b()) {
         this.bv.a(this.dM(), this, this.fq());
         if (this.bv.t()) {
            this.I();
         }
      }

      this.ft();
   }

   public void ft() {
      if (!this.dM().B) {
         boolean $$0 = this.fn();
         this.c(1, false);
         if ($$0) {
            this.a(dmz.C);
         }
      }

      this.bv = cmh.f;
      this.bw = 0;
   }

   public boolean fu() {
      if (this.fn() && !this.bv.b()) {
         cmc $$0 = this.bv.d();
         return $$0.c(this.bv) != coa.d ? false : $$0.b(this.bv) - this.bw >= 5;
      } else {
         return false;
      }
   }

   public boolean fv() {
      return this.bS();
   }

   public boolean fw() {
      return this.i(7);
   }

   @Override
   public boolean ca() {
      return super.ca() || !this.fw() && this.c(bmh.b);
   }

   public int fx() {
      return this.bx;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dr();
      double $$5 = this.dt();
      double $$6 = this.dx();
      double $$7 = $$1;
      boolean $$8 = false;
      hv $$9 = hv.a($$0, $$1, $$2);
      csy $$10 = this.dM();
      if ($$10.A($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.J_()) {
            hv $$12 = $$9.d();
            dip $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.c($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cH())) {
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

         if (this instanceof bme $$14) {
            $$14.N().n();
         }

         return true;
      }
   }

   public boolean fy() {
      return !this.ew();
   }

   public boolean fz() {
      return true;
   }

   public void a(hv $$0, boolean $$1) {
   }

   public boolean f(cmh $$0) {
      return false;
   }

   @Override
   public blg a(bmh $$0) {
      return $$0 == bmh.c ? v : super.a($$0).a(this.dZ());
   }

   public ImmutableList<bmh> fA() {
      return ImmutableList.of(bmh.a);
   }

   public ekw e(bmh $$0) {
      blg $$1 = this.a($$0);
      return new ekw((double)(-$$1.a / 2.0F), 0.0, (double)(-$$1.a / 2.0F), (double)($$1.a / 2.0F), (double)$$1.b, (double)($$1.a / 2.0F));
   }

   protected boolean f(bmh $$0) {
      ekw $$1 = this.a($$0).a(this.dk());
      return this.dM().b(this, $$1);
   }

   @Override
   public boolean ct() {
      return super.ct() && !this.fD();
   }

   public Optional<hv> fB() {
      return this.an.b(bM);
   }

   public void g(hv $$0) {
      this.an.b(bM, Optional.of($$0));
   }

   public void fC() {
      this.an.b(bM, Optional.empty());
   }

   public boolean fD() {
      return this.fB().isPresent();
   }

   public void b(hv $$0) {
      if (this.bO()) {
         this.ac();
      }

      dip $$1 = this.dM().a_($$0);
      if ($$1.b() instanceof cvs) {
         this.dM().a($$0, $$1.a(cvs.c, Boolean.valueOf(true)), 3);
      }

      this.b(bmh.c);
      this.a($$0);
      this.g($$0);
      this.g(elb.b);
      this.au = true;
   }

   private void a(hv $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean N() {
      return this.fB().map($$0 -> this.dM().a_($$0).b() instanceof cvs).orElse(false);
   }

   public void fE() {
      this.fB().filter(this.dM()::A).ifPresent($$0x -> {
         dip $$1 = this.dM().a_($$0x);
         if ($$1.b() instanceof cvs) {
            ia $$2 = $$1.c(cvs.aE);
            this.dM().a($$0x, $$1.a(cvs.c, Boolean.valueOf(false)), 3);
            elb $$3 = cvs.a(this.ai(), this.dM(), $$0x, $$2, this.dC()).orElseGet(() -> {
               hv $$1x = $$0x.c();
               return new elb((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            elb $$4 = elb.c($$0x).d($$3).d();
            float $$5 = (float)aty.d(aty.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      elb $$0 = this.dk();
      this.b(bmh.a);
      this.a_($$0.c, $$0.d, $$0.e);
      this.fC();
   }

   @Nullable
   public ia fF() {
      hv $$0 = this.fB().orElse(null);
      return $$0 != null ? cvs.a(this.dM(), $$0) : null;
   }

   @Override
   public boolean by() {
      return !this.fD() && super.by();
   }

   @Override
   protected final float a(bmh $$0, blg $$1) {
      return $$0 == bmh.c ? 0.2F : this.b($$0, $$1);
   }

   protected float b(bmh $$0, blg $$1) {
      return super.a($$0, $$1);
   }

   public cmh g(cmh $$0) {
      return cmh.f;
   }

   public cmh a(csy $$0, cmh $$1) {
      if ($$1.M()) {
         $$0.a(null, this.dr(), this.dt(), this.dx(), this.d($$1), ard.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$1, $$0, this);
         if (!(this instanceof cer) || !((cer)this).fT().d) {
            $$1.h(1);
         }

         this.a(dmz.m);
      }

      return $$1;
   }

   private void a(cmh $$0, csy $$1, blv $$2) {
      cmc $$3 = $$0.d();
      if ($$3.u()) {
         for (Pair<bks, Float> $$5 : $$3.v().f()) {
            if (!$$1.B && $$5.getFirst() != null && $$1.z.i() < (Float)$$5.getSecond()) {
               $$2.b(new bks((bks)$$5.getFirst()));
            }
         }
      }
   }

   private static byte g(blk $$0) {
      switch ($$0) {
         case a:
            return 47;
         case b:
            return 48;
         case f:
            return 49;
         case e:
            return 50;
         case c:
            return 52;
         case d:
            return 51;
         default:
            return 47;
      }
   }

   public void d(blk $$0) {
      this.dM().a(this, g($$0));
   }

   public void d(bjk $$0) {
      this.d($$0 == bjk.a ? blk.a : blk.b);
   }

   @Override
   public ekw i_() {
      if (this.c(blk.f).a(cmk.uj)) {
         float $$0 = 0.5F;
         return this.cH().c(0.5, 0.5, 0.5);
      } else {
         return super.i_();
      }
   }

   public static blk h(cmh $$0) {
      cli $$1 = cli.c_($$0);
      return $$1 != null ? $$1.g() : blk.a;
   }

   private static bmn a(blv $$0, blk $$1) {
      return $$1 != blk.f && $$1 != blk.a && $$1 != blk.b ? bmn.a($$0, $$1, $$1x -> $$1x.b() || blx.h($$1x) == $$1) : bmn.a($$0, $$1);
   }

   @Nullable
   private static blk r(int $$0) {
      if ($$0 == 100 + blk.f.b()) {
         return blk.f;
      } else if ($$0 == 100 + blk.e.b()) {
         return blk.e;
      } else if ($$0 == 100 + blk.d.b()) {
         return blk.d;
      } else if ($$0 == 100 + blk.c.b()) {
         return blk.c;
      } else if ($$0 == 98) {
         return blk.a;
      } else {
         return $$0 == 99 ? blk.b : null;
      }
   }

   @Override
   public bmn a_(int $$0) {
      blk $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dA() {
      if (this.P_()) {
         return false;
      } else {
         boolean $$0 = !this.c(blk.f).a(arz.az) && !this.c(blk.e).a(arz.az) && !this.c(blk.d).a(arz.az) && !this.c(blk.c).a(arz.az);
         return $$0 && super.dA();
      }
   }

   @Override
   public boolean cd() {
      return !this.dM().y_() && this.a(bku.x) || super.cd();
   }

   @Override
   public float dD() {
      return this.aU;
   }

   @Override
   public void a(yp $$0) {
      double $$1 = $$0.f();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      float $$4 = $$0.m();
      float $$5 = $$0.l();
      this.f($$1, $$2, $$3);
      this.aU = $$0.n();
      this.aW = $$0.n();
      this.aV = this.aU;
      this.aX = this.aW;
      this.e($$0.a());
      this.a_($$0.d());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.o($$0.i(), $$0.j(), $$0.k());
   }

   public boolean fG() {
      return this.eT().d() instanceof cjw;
   }

   @Override
   public float dG() {
      float $$0 = super.dG();
      return this.cN() instanceof cer ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public elb m(blf $$0) {
      return new elb(this.a($$0, this.a(this.ap()), this.dZ()).rotateY(-this.aU * (float) (Math.PI / 180.0))).e(this.dk());
   }

   @Override
   public float k(blf $$0) {
      return this.l($$0) * this.dZ();
   }

   protected void a(int $$0, double $$1) {
      this.aW = (float)aty.e(1.0 / (double)$$0, (double)this.aW, $$1);
   }

   public static record a(arb a, arb b) {
   }
}
