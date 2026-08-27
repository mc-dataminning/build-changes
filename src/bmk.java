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

public abstract class bmk extends blu implements bls {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final bno bA = new bno(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, bno.a.c);
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
   protected static final agm<Byte> t = agp.a(bmk.class, ago.a);
   private static final agm<Float> bH = agp.a(bmk.class, ago.d);
   private static final agm<Integer> bI = agp.a(bmk.class, ago.b);
   private static final agm<Boolean> bJ = agp.a(bmk.class, ago.k);
   private static final agm<Integer> bK = agp.a(bmk.class, ago.b);
   private static final agm<Integer> bL = agp.a(bmk.class, ago.b);
   private static final agm<Optional<hx>> bM = agp.a(bmk.class, ago.o);
   protected static final float u = 1.74F;
   protected static final blv v = blv.c(0.2F, 0.2F);
   public static final float aE = 0.5F;
   private final bnn bN;
   private final bkp bO = new bkp(this);
   private final Map<blf, blh> bP = Maps.newHashMap();
   private final iq<cmx> bQ = iq.a(2, cmx.f);
   private final iq<cmx> bR = iq.a(4, cmx.f);
   public boolean aF;
   private boolean bS = false;
   public bjz aG;
   public int aH;
   public int aI;
   public int aJ;
   public int aK;
   public int aL;
   public int aM;
   public float aN;
   public float aO;
   protected int aP;
   public final bnj aQ = new bnj();
   public final int aR = 20;
   public final float aS;
   public final float aT;
   public float aU;
   public float aV;
   public float aW;
   public float aX;
   @Nullable
   protected cfh aY;
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
   private bmk bU;
   private int bV;
   private bmk bW;
   private int bX;
   private float bY;
   private int bZ;
   private float ca;
   protected cmx bv = cmx.f;
   protected int bw;
   protected int bx;
   private hx cb;
   private Optional<hx> cc = Optional.empty();
   @Nullable
   private bks cd;
   private long ce;
   protected int by;
   private float cf;
   private float cg;
   protected bnk<?> bz;
   private boolean ch;

   protected bmk(bly<? extends bmk> $$0, cto $$1) {
      super($$0, $$1);
      this.bN = new bnn(bnr.a($$0));
      this.c(this.eM());
      this.I = true;
      this.aT = (float)((Math.random() + 1.0) * 0.01F);
      this.ar();
      this.aS = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.aW = this.dC();
      this.t(0.6F);
      tb $$2 = tb.a;
      this.bz = this.a(new Dynamic($$2, (tk)$$2.createMap(ImmutableMap.of($$2.a("memories"), (tk)$$2.emptyMap()))));
   }

   public bnk<?> dO() {
      return this.bz;
   }

   protected bnk.b<?> dP() {
      return bnk.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bnk<?> a(Dynamic<?> $$0) {
      return this.dP().a($$0);
   }

   @Override
   public void al() {
      this.a(this.dN().w(), Float.MAX_VALUE);
   }

   public boolean a(bly<?> $$0) {
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

   public static bnp.a dQ() {
      return bnp.a().a(bnq.l).a(bnq.i).a(bnq.m).a(bnq.a).a(bnq.b).a(bnq.k);
   }

   @Override
   protected void a(double $$0, boolean $$1, djg $$2, hx $$3) {
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
         hx $$7 = this.dm();
         if ($$3.u() != $$7.u() || $$3.w() != $$7.w()) {
            double $$8 = $$4 - (double)$$3.u() - 0.5;
            double $$9 = $$6 - (double)$$3.w() - 0.5;
            double $$10 = Math.max(Math.abs($$8), Math.abs($$9));
            $$4 = (double)$$3.u() + 0.5 + $$8 / $$10 * 0.5;
            $$6 = (double)$$3.w() + 0.5 + $$9 / $$10 * 0.5;
         }

         float $$11 = (float)aun.f(this.ab - 3.0F);
         double $$12 = Math.min((double)(0.2F + $$11 / 15.0F), 2.5);
         int $$13 = (int)(150.0 * $$12);
         ((and)this.dM()).a(new jp(jx.c, $$2), $$4, $$5, $$6, $$13, 0.0, 0.0, 0.0, 0.15F);
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cc = Optional.empty();
      }
   }

   public final boolean dR() {
      return this.ai().a(asj.m);
   }

   public float a(float $$0) {
      return aun.i($$0, this.cg, this.cf);
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
      this.dM().af().a("livingEntityBaseTick");
      if (this.aY() || this.dM().B) {
         this.aA();
      }

      if (this.bx()) {
         boolean $$0 = this instanceof cfh;
         if (!this.dM().B) {
            if (this.by()) {
               this.a(this.dN().f(), 1.0F);
            } else if ($$0 && !this.dM().D_().a(this.cH())) {
               double $$1 = this.dM().D_().a(this) + this.dM().D_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dM().D_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dN().v(), (float)Math.max(1, aun.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(asl.a) && !this.dM().a_(hx.a(this.dr(), this.dv(), this.dx())).a(cwr.nd)) {
            boolean $$3 = !this.dR() && !bli.c(this) && (!$$0 || !((cfh)this).fT().a);
            if ($$3) {
               this.j(this.m(this.ci()));
               if (this.ci() == -20) {
                  this.j(0);
                  els $$4 = this.dp();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.ag.j() - this.ag.j();
                     double $$7 = this.ag.j() - this.ag.j();
                     double $$8 = this.ag.j() - this.ag.j();
                     this.dM().a(jx.e, this.dr() + $$6, this.dt() + $$7, this.dx() + $$8, $$4.c, $$4.d, $$4.e);
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
            hx $$9 = this.dm();
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

      if (this.al > 0 && !(this instanceof ane)) {
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
      this.dM().af().c();
   }

   public boolean dS() {
      return this.ah % 5 == 0 && this.dp().c != 0.0 && this.dp().e != 0.0 && !this.P_() && crk.k(this) && this.dU();
   }

   protected void dT() {
      els $$0 = this.dp();
      this.dM()
         .a(
            jx.K,
            this.dr() + (this.ag.j() - 0.5) * (double)this.dg(),
            this.dt() + 0.1,
            this.dx() + (this.ag.j() - 0.5) * (double)this.dg(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.ag.i() * 0.4F + this.ag.i() > 0.9F ? 0.6F : 0.0F;
      this.a(arr.wT, $$1, 0.6F + this.ag.i() * 0.4F);
   }

   protected boolean dU() {
      return this.dM().a_(this.aI()).a(asg.aM);
   }

   @Override
   protected float aL() {
      return this.dU() && crk.a(crm.l, this) > 0 ? 1.0F : super.aL();
   }

   @Override
   protected boolean c(djg $$0) {
      return !$$0.i() || this.fw();
   }

   protected void dV() {
      bnm $$0 = this.a(bnq.m);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void dW() {
      if (!this.bj().i()) {
         int $$0 = crk.a(crm.l, this);
         if ($$0 > 0 && this.dU()) {
            bnm $$1 = this.a(bnq.m);
            if ($$1 == null) {
               return;
            }

            $$1.b(new bno(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), bno.a.a));
            if (this.eg().i() < 0.04F) {
               cmx $$2 = this.c(blz.c);
               $$2.a(1, this, $$0x -> $$0x.d(blz.c));
            }
         }
      }
   }

   protected void dX() {
      bnm $$0 = this.a(bnq.m);
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
            bnm $$1 = this.a(bnq.m);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.ck();
            $$1.b(new bno(e, "Powder snow slow", (double)$$2, bno.a.a));
         }
      }
   }

   protected void c(hx $$0) {
      int $$1 = crk.a(crm.j, this);
      if ($$1 > 0) {
         crp.a(this, this.dM(), $$0, $$1);
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
         this.a(blu.c.a);
      }
   }

   public boolean ec() {
      return !this.o_();
   }

   protected boolean ed() {
      return !this.o_();
   }

   protected int m(int $$0) {
      int $$1 = crk.e(this);
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

   public auu eg() {
      return this.ag;
   }

   @Nullable
   public bmk eh() {
      return this.bU;
   }

   @Override
   public bmk V_() {
      return this.eh();
   }

   public int ei() {
      return this.bV;
   }

   public void c(@Nullable cfh $$0) {
      this.aY = $$0;
      this.aZ = this.ah;
   }

   public void a(@Nullable bmk $$0) {
      this.bU = $$0;
      this.bV = this.ah;
   }

   @Nullable
   public bmk ej() {
      return this.bW;
   }

   public int ek() {
      return this.bX;
   }

   public void A(blu $$0) {
      if ($$0 instanceof bmk) {
         this.bW = (bmk)$$0;
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

   protected boolean a(blz $$0) {
      return true;
   }

   public void a(blz $$0, cmx $$1, cmx $$2) {
      boolean $$3 = $$2.b() && $$1.b();
      if (!$$3 && !cmx.c($$1, $$2) && !this.am) {
         cly $$4 = cly.c_($$2);
         if (!this.dM().y_() && !this.P_()) {
            if (!this.aU() && $$4 != null && $$4.g() == $$0) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), $$4.as_(), this.db(), 1.0F, 1.0F);
            }

            if (this.a($$0)) {
               this.a($$4 != null ? dnq.v : dnq.S);
            }
         }
      }
   }

   @Override
   public void a(blu.c $$0) {
      super.a($$0);
      this.bz.a();
   }

   @Override
   public void b(sn $$0) {
      $$0.a("Health", this.ev());
      $$0.a("HurtTime", (short)this.aK);
      $$0.a("HurtByTimestamp", this.bV);
      $$0.a("DeathTime", (short)this.aM);
      $$0.a("AbsorptionAmount", this.fk());
      $$0.a("Attributes", this.eR().c());
      if (!this.bP.isEmpty()) {
         st $$1 = new st();

         for (blh $$2 : this.bP.values()) {
            $$1.add($$2.a(new sn()));
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fw());
      this.fB().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<tk> $$3 = this.bz.a(tb.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(sn $$0) {
      this.z($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dM() != null && !this.dM().B) {
         this.eR().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         st $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            sn $$3 = $$1.a($$2);
            blh $$4 = blh.b($$3);
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
         emr $$6 = this.dM().K().b($$5);
         boolean $$7 = $$6 != null && this.dM().K().a(this.cx(), $$6);
         if (!$$7) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         hx $$8 = new hx($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$8);
         this.an.b(as, bmw.c);
         if (!this.am) {
            this.a($$8);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bz = this.a(new Dynamic(tb.a, $$0.c("Brain")));
      }
   }

   protected void en() {
      Iterator<blf> $$0 = this.bP.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            blf $$1 = $$0.next();
            blh $$2 = this.bP.get($$1);
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
            this.dM().a($$4 ? jx.a : jx.v, this.d(0.5), this.du(), this.g(0.5), $$7, $$8, $$9);
         }
      }
   }

   protected void J() {
      if (this.bP.isEmpty()) {
         this.eq();
         this.j(false);
      } else {
         Collection<blh> $$0 = this.bP.values();
         this.an.b(bJ, c($$0));
         this.an.b(bI, cox.a($$0));
         this.j(this.a(blj.n));
      }
   }

   private void u() {
      boolean $$0 = this.cd();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable blu $$0) {
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
         cmx $$3 = this.c(blz.f);
         bly<?> $$4 = $$0.ai();
         if ($$4 == bly.aK && $$3.a(cna.ue)
            || $$4 == bly.br && $$3.a(cna.uh)
            || $$4 == bly.ax && $$3.a(cna.uk)
            || $$4 == bly.ay && $$3.a(cna.uk)
            || $$4 == bly.v && $$3.a(cna.ui)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bmk $$0) {
      return $$0 instanceof cfh && this.dM().ak() == bjx.a ? false : $$0.eo();
   }

   public boolean a(bmk $$0, bwy $$1) {
      return $$1.a(this, $$0);
   }

   public boolean eo() {
      return !this.cr() && this.ep();
   }

   public boolean ep() {
      return !this.P_() && this.bx();
   }

   public static boolean c(Collection<blh> $$0) {
      for (blh $$1 : $$0) {
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
         Iterator<blh> $$0 = this.bP.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<blh> es() {
      return this.bP.values();
   }

   public Map<blf, blh> et() {
      return this.bP;
   }

   public boolean a(blf $$0) {
      return this.bP.containsKey($$0);
   }

   @Nullable
   public blh b(blf $$0) {
      return this.bP.get($$0);
   }

   public final boolean b(blh $$0) {
      return this.b($$0, null);
   }

   public boolean b(blh $$0, @Nullable blu $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         blh $$2 = this.bP.get($$0.c());
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

   public boolean c(blh $$0) {
      if (this.eS() == bmp.b) {
         blf $$1 = $$0.c();
         if ($$1 == blj.j || $$1 == blj.s) {
            return false;
         }
      }

      return true;
   }

   public void c(blh $$0, @Nullable blu $$1) {
      if (this.c($$0)) {
         blh $$2 = this.bP.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eu() {
      return this.eS() == bmp.b;
   }

   @Nullable
   public blh c(@Nullable blf $$0) {
      return this.bP.remove($$0);
   }

   public boolean d(blf $$0) {
      blh $$1 = this.c($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(blh $$0, @Nullable blu $$1) {
      this.bT = true;
      if (!this.dM().B) {
         $$0.c().a(this.eR(), $$0.e());
         this.d($$0);
      }
   }

   public void d(blh $$0) {
      for (blu $$1 : this.cP()) {
         if ($$1 instanceof ane $$2) {
            $$2.c.b(new ade(this.aj(), $$0));
         }
      }
   }

   protected void a(blh $$0, boolean $$1, @Nullable blu $$2) {
      this.bT = true;
      if ($$1 && !this.dM().B) {
         blf $$3 = $$0.c();
         $$3.a(this.eR());
         $$3.a(this.eR(), $$0.e());
         this.y();
      }

      if (!this.dM().B) {
         this.d($$0);
      }
   }

   protected void a(blh $$0) {
      this.bT = true;
      if (!this.dM().B) {
         $$0.c().a(this.eR());
         this.y();

         for (blu $$1 : this.cP()) {
            if ($$1 instanceof ane $$2) {
               $$2.c.b(new abj(this.aj(), $$0.c()));
            }
         }
      }
   }

   private void y() {
      for (bnm $$0 : this.eR().a()) {
         this.d($$0.a());
      }
   }

   private void d(bnl $$0) {
      if ($$0 == bnq.l) {
         float $$1 = this.eM();
         if (this.ev() > $$1) {
            this.c($$1);
         }
      } else if ($$0 == bnq.k) {
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
      this.an.b(bH, aun.a($$0, 0.0F, this.eM()));
   }

   public boolean ew() {
      return this.ev() <= 0.0F;
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dM().B) {
         return false;
      } else if (this.ew()) {
         return false;
      } else if ($$0.a(asi.j) && this.a(blj.l)) {
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
            if (!$$0.a(asi.k) && $$0.c() instanceof bmk $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(asi.p) && this.ai().a(asj.l)) {
            $$1 *= 5.0F;
         }

         this.aQ.a(1.5F);
         boolean $$7 = true;
         if ((float)this.al > 10.0F && !$$0.a(asi.f)) {
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

         if ($$0.a(asi.a) && !this.c(blz.f).b()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         blu $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof bmk $$9 && !$$0.a(asi.r)) {
               this.a($$9);
            }

            if ($$8 instanceof cfh $$10) {
               this.aZ = 100;
               this.aY = $$10;
            } else if ($$8 instanceof bza $$11 && $$11.u()) {
               this.aZ = 100;
               if ($$11.R_() instanceof cfh $$12) {
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

            if (!$$0.a(asi.s) && (!$$3 || $$1 > 0.0F)) {
               this.bq();
            }

            if ($$8 != null && !$$0.a(asi.A)) {
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
               arq $$15 = this.n_();
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
            this.ce = this.dM().X();
         }

         if (this instanceof ane) {
            am.i.a((ane)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((ane)this).a(asb.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof ane) {
            am.h.a((ane)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$16;
      }
   }

   protected void d(bmk $$0) {
      $$0.e(this);
   }

   protected void e(bmk $$0) {
      $$0.q(0.5, $$0.dr() - this.dr(), $$0.dx() - this.dx());
   }

   private boolean h(bks $$0) {
      if ($$0.a(asi.e)) {
         return false;
      } else {
         cmx $$1 = null;

         for (bjz $$2 : bjz.values()) {
            cmx $$3 = this.b($$2);
            if ($$3.a(cna.vm)) {
               $$1 = $$3.p();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof ane $$4) {
               $$4.b(asb.c.b(cna.vm));
               am.C.a($$4, $$1);
               this.a(dnq.C);
            }

            this.c(1.0F);
            this.er();
            this.b(new blh(blj.j, 900, 1));
            this.b(new blh(blj.v, 100, 1));
            this.b(new blh(blj.l, 800, 0));
            this.dM().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bks ex() {
      if (this.dM().X() - this.ce > 40L) {
         this.cd = null;
      }

      return this.cd;
   }

   protected void e(bks $$0) {
      arq $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eW(), this.eX());
      }
   }

   public boolean f(bks $$0) {
      blu $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cfn $$3 && $$3.E() > 0) {
         $$2 = true;
      }

      if (!$$0.a(asi.d) && this.fu() && !$$2) {
         els $$4 = $$0.h();
         if ($$4 != null) {
            els $$5 = this.b(0.0F, this.cp());
            els $$6 = $$4.a(this.dk());
            $$6 = new els($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(cmx $$0) {
      if (!$$0.b()) {
         if (!this.aU()) {
            this.dM().a(this.dr(), this.dt(), this.dx(), arr.mN, this.db(), 0.8F, 0.8F + this.dM().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bks $$0) {
      if (!this.dH() && !this.ba) {
         blu $$1 = $$0.d();
         bmk $$2 = this.eL();
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
         if (this.dM() instanceof and $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(dnq.p);
               this.g($$0);
               this.f($$2);
            }

            this.dM().a(this, (byte)3);
         }

         this.b(bmw.h);
      }
   }

   protected void f(@Nullable bmk $$0) {
      if (!this.dM().B) {
         boolean $$1 = false;
         if ($$0 instanceof cbh) {
            if (this.dM().Z().b(ctk.c)) {
               hx $$2 = this.dm();
               djg $$3 = cwr.cd.o();
               if (this.dM().a_($$2).i() && $$3.a((ctr)this.dM(), $$2)) {
                  this.dM().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               cbt $$4 = new cbt(this.dM(), this.dr(), this.dt(), this.dx(), new cmx(cna.dv));
               this.dM().b($$4);
            }
         }
      }
   }

   protected void g(bks $$0) {
      blu $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof cfh) {
         $$2 = crk.h((bmk)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.aZ > 0;
      if (this.ed() && this.dM().Z().b(ctk.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.ey();
      this.ez();
   }

   protected void ey() {
   }

   protected void ez() {
      if (this.dM() instanceof and && !this.eD() && (this.ef() || this.aZ > 0 && this.ec() && this.dM().Z().b(ctk.f))) {
         bma.a((and)this.dM(), this.dk(), this.ee());
      }
   }

   protected void a(bks $$0, int $$1, boolean $$2) {
   }

   public ahg eA() {
      return this.ai().j();
   }

   public long eB() {
      return 0L;
   }

   protected void a(bks $$0, boolean $$1) {
      ahg $$2 = this.eA();
      ehd $$3 = this.dM().o().aJ().getLootTable($$2);
      ehb.a $$4 = new ehb.a((and)this.dM()).a(ejg.a, this).a(ejg.f, this.dk()).a(ejg.c, $$0).b(ejg.d, $$0.d()).b(ejg.e, $$0.c());
      if ($$1 && this.aY != null) {
         $$4 = $$4.a(ejg.b, this.aY).a(this.aY.go());
      }

      ehb $$5 = $$4.a(ejf.g);
      $$3.a($$5, this.eB(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.b(bnq.i);
      if (!($$0 <= 0.0)) {
         this.au = true;
         els $$3 = this.dp();
         els $$4 = new els($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aC() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected arq d(bks $$0) {
      return arr.jC;
   }

   @Nullable
   protected arq n_() {
      return arr.jx;
   }

   private arq d(int $$0) {
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

   protected eln eF() {
      eln $$0 = this.cH();
      blu $$1 = this.cZ();
      if ($$1 != null) {
         els $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public bmk.a eG() {
      return new bmk.a(arr.jD, arr.jv);
   }

   protected arq c(cmx $$0) {
      return $$0.N();
   }

   public arq d(cmx $$0) {
      return $$0.O();
   }

   public Optional<hx> eH() {
      return this.cc;
   }

   public boolean e_() {
      if (this.P_()) {
         return false;
      } else {
         hx $$0 = this.dm();
         djg $$1 = this.dn();
         if ($$1.a(asg.aO)) {
            this.cc = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dfb && this.c($$0, $$1)) {
            this.cc = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(hx $$0, djg $$1) {
      if ($$1.c(dfb.b)) {
         djg $$2 = this.dM().a_($$0.d());
         if ($$2.a(cwr.cO) && $$2.c(dau.b) == $$1.c(dfb.aE)) {
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
   public boolean a(float $$0, float $$1, bks $$2) {
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
      if (this.ai().a(asj.o)) {
         return 0;
      } else {
         blh $$2 = this.b(blj.h);
         float $$3 = $$2 == null ? 0.0F : (float)($$2.e() + 1);
         return aun.f(($$0 - 3.0F - $$3) * $$1);
      }
   }

   protected void eI() {
      if (!this.aU()) {
         int $$0 = aun.a(this.dr());
         int $$1 = aun.a(this.dt() - 0.2F);
         int $$2 = aun.a(this.dx());
         djg $$3 = this.dM().a_(new hx($$0, $$1, $$2));
         if (!$$3.i()) {
            deb $$4 = $$3.w();
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
      return aun.a(this.b(bnq.a));
   }

   protected void b(bks $$0, float $$1) {
   }

   protected void c(bks $$0, float $$1) {
   }

   protected void u(float $$0) {
   }

   protected float d(bks $$0, float $$1) {
      if (!$$0.a(asi.c)) {
         this.b($$0, $$1);
         $$1 = bko.a($$1, (float)this.eJ(), (float)this.b(bnq.b));
      }

      return $$1;
   }

   protected float e(bks $$0, float $$1) {
      if ($$0.a(asi.g)) {
         return $$1;
      } else {
         if (this.a(blj.k) && !$$0.a(asi.h)) {
            int $$2 = (this.b(blj.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof ane) {
                  ((ane)this).a(asb.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof ane) {
                  ((ane)$$0.d()).a(asb.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(asi.i)) {
            return $$1;
         } else {
            int $$7 = crk.a(this.bL(), $$0);
            if ($$7 > 0) {
               $$1 = bko.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bks $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fk(), 0.0F);
         this.y(this.fk() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof ane $$4) {
            $$4.a(asb.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eK().a($$0, var9);
            this.c(this.ev() - var9);
            this.y(this.fk() - var9);
            this.a(dnq.o);
         }
      }
   }

   public bkp eK() {
      return this.bO;
   }

   @Nullable
   public bmk eL() {
      if (this.aY != null) {
         return this.aY;
      } else {
         return this.bU != null ? this.bU : null;
      }
   }

   public final float eM() {
      return (float)this.b(bnq.l);
   }

   public final float eN() {
      return (float)this.b(bnq.k);
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
      if (bli.a(this)) {
         return 6 - (1 + bli.b(this));
      } else {
         return this.a(blj.d) ? 6 + (1 + this.b(blj.d).e()) * 2 : 6;
      }
   }

   public void a(bjz $$0) {
      this.a($$0, false);
   }

   public void a(bjz $$0, boolean $$1) {
      if (!this.aF || this.aH >= this.B() / 2 || this.aH < 0) {
         this.aH = -1;
         this.aF = true;
         this.aG = $$0;
         if (this.dM() instanceof and) {
            zd $$2 = new zd(this, $$0 == bjz.a ? 0 : 3);
            anb $$3 = ((and)this.dM()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bks $$0) {
      this.aQ.a(1.5F);
      this.al = 20;
      this.aL = 10;
      this.aK = this.aL;
      arq $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eW(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
      }

      this.a(this.dN().n(), 0.0F);
      this.cd = $$0;
      this.ce = this.dM().X();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            arq $$1 = this.n_();
            if ($$1 != null) {
               this.a($$1, this.eW(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cfh)) {
               this.c(0.0F);
               this.a(this.dN().n());
            }
            break;
         case 29:
            this.a(arr.vG, 1.0F, 0.8F + this.dM().z.i() * 0.4F);
            break;
         case 30:
            this.a(arr.vH, 0.8F, 0.8F + this.dM().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ag.i() - 0.5F) * 0.2F;
               float $$6 = (this.ag.i() - 0.5F) * 0.2F;
               float $$7 = (this.ag.i() - 0.5F) * 0.2F;
               double $$8 = aun.d($$4, this.K, this.dr()) + (this.ag.j() - 0.5) * (double)this.dg() * 2.0;
               double $$9 = aun.d($$4, this.L, this.dt()) + this.ag.j() * (double)this.dh();
               double $$10 = aun.d($$4, this.M, this.dx()) + (this.ag.j() - 0.5) * (double)this.dg() * 2.0;
               this.dM().a(jx.Z, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.c(blz.a));
            break;
         case 48:
            this.i(this.c(blz.b));
            break;
         case 49:
            this.i(this.c(blz.f));
            break;
         case 50:
            this.i(this.c(blz.e));
            break;
         case 51:
            this.i(this.c(blz.d));
            break;
         case 52:
            this.i(this.c(blz.c));
            break;
         case 54:
            dai.b(this);
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
         this.dM().a(jx.Y, this.d(1.0), this.du(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void D() {
      cmx $$0 = this.c(blz.b);
      this.a(blz.b, this.c(blz.a));
      this.a(blz.a, $$0);
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
   public bnm a(bnl $$0) {
      return this.eR().a($$0);
   }

   public double a(ih<bnl> $$0) {
      return this.b($$0.a());
   }

   public double b(bnl $$0) {
      return this.eR().c($$0);
   }

   public double b(ih<bnl> $$0) {
      return this.c($$0.a());
   }

   public double c(bnl $$0) {
      return this.eR().d($$0);
   }

   public bnn eR() {
      return this.bN;
   }

   public bmp eS() {
      return bmp.a;
   }

   public cmx eT() {
      return this.c(blz.a);
   }

   public cmx eU() {
      return this.c(blz.b);
   }

   public boolean b(cms $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cmx> $$0) {
      return $$0.test(this.eT()) || $$0.test(this.eU());
   }

   public cmx b(bjz $$0) {
      if ($$0 == bjz.a) {
         return this.c(blz.a);
      } else if ($$0 == bjz.b) {
         return this.c(blz.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bjz $$0, cmx $$1) {
      if ($$0 == bjz.a) {
         this.a(blz.a, $$1);
      } else {
         if ($$0 != bjz.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(blz.b, $$1);
      }
   }

   public boolean b(blz $$0) {
      return !this.c($$0).b();
   }

   @Override
   public abstract Iterable<cmx> bL();

   public abstract cmx c(blz var1);

   @Override
   public abstract void a(blz var1, cmx var2);

   protected void e(cmx $$0) {
      sn $$1 = $$0.v();
      if ($$1 != null) {
         $$0.d().b($$1);
      }
   }

   public float eV() {
      Iterable<cmx> $$0 = this.bL();
      int $$1 = 0;
      int $$2 = 0;

      for (cmx $$3 : $$0) {
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
      bnm $$1 = this.a(bnq.m);
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
   public void g(blu $$0) {
      if (!this.fD()) {
         super.g($$0);
      }
   }

   private void a(blu $$0) {
      els $$1;
      if (this.dH()) {
         $$1 = this.dk();
      } else if (!$$0.dH() && !this.dM().a_($$0.dm()).a(asg.aI)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dt(), $$0.dt());
         $$1 = new els(this.dr(), $$2, this.dx());
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
      return this.a(blj.h) ? 0.1F * ((float)this.b(blj.h).e() + 1.0F) : 0.0F;
   }

   protected void fb() {
      els $$0 = this.dp();
      this.o($$0.c, (double)this.eZ(), $$0.e);
      if (this.bY()) {
         float $$1 = this.dC() * (float) (Math.PI / 180.0);
         this.g(this.dp().b((double)(-aun.a($$1) * 0.2F), 0.0, (double)(aun.b($$1) * 0.2F)));
      }

      this.au = true;
   }

   protected void fc() {
      this.g(this.dp().b(0.0, -0.04F, 0.0));
   }

   protected void c(asv<eep> $$0) {
      this.g(this.dp().b(0.0, 0.04F, 0.0));
   }

   protected float fd() {
      return 0.8F;
   }

   public boolean a(eeq $$0) {
      return false;
   }

   public void a(els $$0) {
      if (this.cX()) {
         double $$1 = 0.08;
         boolean $$2 = this.dp().d <= 0.0;
         if ($$2 && this.a(blj.B)) {
            $$1 = 0.01;
         }

         eeq $$3 = this.dM().b_(this.dm());
         if (this.aZ() && this.ea() && !this.a($$3)) {
            double $$4 = this.dt();
            float $$5 = this.bY() ? 0.9F : this.fd();
            float $$6 = 0.02F;
            float $$7 = (float)crk.f(this);
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

            if (this.a(blj.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(bmq.a, this.dp());
            els $$8 = this.dp();
            if (this.P && this.e_()) {
               $$8 = new els($$8.c, 0.2, $$8.e);
            }

            this.g($$8.d((double)$$5, 0.8F, (double)$$5));
            els $$9 = this.a($$1, $$2, this.dp());
            this.g($$9);
            if (this.P && this.g($$9.c, $$9.d + 0.6F - this.dt() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bn() && this.ea() && !this.a($$3)) {
            double $$10 = this.dt();
            this.a(0.02F, $$0);
            this.a(bmq.a, this.dp());
            if (this.b(asl.b) <= this.df()) {
               this.g(this.dp().d(0.5, 0.8F, 0.5));
               els $$11 = this.a($$1, $$2, this.dp());
               this.g($$11);
            } else {
               this.g(this.dp().a(0.5));
            }

            if (!this.aV()) {
               this.g(this.dp().b(0.0, -$$1 / 4.0, 0.0));
            }

            els $$12 = this.dp();
            if (this.P && this.g($$12.c, $$12.d + 0.6F - this.dt() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fw()) {
            this.cn();
            els $$13 = this.dp();
            els $$14 = this.bF();
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
               double $$21 = $$17 * (double)(-aun.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.g($$13.d(0.99F, 0.98F, 0.99F));
            this.a(bmq.a, this.dp());
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
            hx $$25 = this.aI();
            float $$26 = this.dM().a_($$25).b().i();
            float $$27 = this.aC() ? $$26 * 0.91F : 0.91F;
            els $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.a(blj.y)) {
               $$29 += (0.05 * (double)(this.b(blj.y).e() + 1) - $$28.d) * 0.2;
            } else if (this.dM().B && !this.dM().B($$25)) {
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

      this.q(this instanceof byg);
   }

   private void c(cfh $$0, els $$1) {
      els $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.cX()) {
         this.w(this.e($$0));
         this.a($$2);
      } else {
         this.q(false);
         this.g(els.b);
         this.aD();
      }
   }

   protected void a(cfh $$0, els $$1) {
   }

   protected els b(cfh $$0, els $$1) {
      return $$1;
   }

   protected float e(cfh $$0) {
      return this.ff();
   }

   public void q(boolean $$0) {
      float $$1 = (float)aun.g(this.dr() - this.K, $$0 ? this.dt() - this.L : 0.0, this.dx() - this.M);
      this.v($$1);
   }

   protected void v(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aQ.a($$1, 0.4F);
   }

   public els a(els $$0, float $$1) {
      this.a(this.A($$1), $$0);
      this.g(this.j(this.dp()));
      this.a(bmq.a, this.dp());
      els $$2 = this.dp();
      if ((this.P || this.bj) && (this.e_() || this.dn().a(cwr.qP) && dci.a(this))) {
         $$2 = new els($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public els a(double $$0, boolean $$1, els $$2) {
      if (!this.aV() && !this.bY()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new els($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private els j(els $$0) {
      if (this.e_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = aun.a($$0.c, -0.15F, 0.15F);
         double $$3 = aun.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dn().a(cwr.nS) && this.fv() && this instanceof cfh) {
            $$4 = 0.0;
         }

         $$0 = new els($$2, $$4, $$3);
      }

      return $$0;
   }

   private float A(float $$0) {
      return this.aC() ? this.ff() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fe();
   }

   protected float fe() {
      return this.cN() instanceof cfh ? this.ff() * 0.1F : 0.02F;
   }

   public float ff() {
      return this.bY;
   }

   public void w(float $$0) {
      this.bY = $$0;
   }

   public boolean C(blu $$0) {
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
         float $$8 = (float)aun.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = aun.e(aun.g(this.dC()) - $$8);
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
      this.dM().af().a("headTurn");
      $$6 = this.e($$5, $$6);
      this.dM().af().c();
      this.dM().af().a("rangeChecks");

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

      this.dM().af().c();
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
      Map<blz, cmx> $$0 = this.G();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<blz, cmx> G() {
      Map<blz, cmx> $$0 = null;

      for (blz $$1 : blz.values()) {
         cmx $$2;
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

         cmx $$5 = this.c($$1);
         if (this.a($$2, $$5)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(blz.class);
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

   public boolean a(cmx $$0, cmx $$1) {
      return !cmx.a($$1, $$0);
   }

   private void a(Map<blz, cmx> $$0) {
      cmx $$1 = $$0.get(blz.a);
      cmx $$2 = $$0.get(blz.b);
      if ($$1 != null && $$2 != null && cmx.a($$1, this.f(blz.b)) && cmx.a($$2, this.f(blz.a))) {
         ((and)this.dM()).l().b(this, new aac(this, (byte)55));
         $$0.remove(blz.a);
         $$0.remove(blz.b);
         this.c(blz.a, $$1.p());
         this.c(blz.b, $$2.p());
      }
   }

   private void b(Map<blz, cmx> $$0) {
      List<Pair<blz, cmx>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cmx $$3 = $$2.p();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
         }
      });
      ((and)this.dM()).l().b(this, new acf(this.aj(), $$1));
   }

   private cmx e(blz $$0) {
      return this.bR.get($$0.b());
   }

   private void b(blz $$0, cmx $$1) {
      this.bR.set($$0.b(), $$1);
   }

   private cmx f(blz $$0) {
      return this.bQ.get($$0.b());
   }

   private void c(blz $$0, cmx $$1) {
      this.bQ.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = aun.g($$0 - this.aU);
      this.aU += $$2 * 0.3F;
      float $$3 = aun.g(this.dC() - this.aU);
      float $$4 = this.fg();
      if (Math.abs($$3) > $$4) {
         this.aU = this.aU + ($$3 - (float)aun.j((double)$$3) * $$4);
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

      els $$0 = this.dp();
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
      this.dM().af().a("ai");
      if (this.eY()) {
         this.bj = false;
         this.bk = 0.0F;
         this.bm = 0.0F;
      } else if (this.cY()) {
         this.dM().af().a("newAi");
         this.fi();
         this.dM().af().c();
      }

      this.dM().af().c();
      this.dM().af().a("jump");
      if (this.bj && this.ea()) {
         double $$4;
         if (this.bn()) {
            $$4 = this.b(asl.b);
         } else {
            $$4 = this.b(asl.a);
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
               this.c(asl.b);
            }
         } else {
            this.c(asl.a);
         }
      } else {
         this.bZ = 0;
      }

      this.dM().af().c();
      this.dM().af().a("travel");
      this.bk *= 0.98F;
      this.bm *= 0.98F;
      this.H();
      eln $$8 = this.cH();
      els $$9 = new els((double)this.bk, (double)this.bl, (double)this.bm);
      if (this.a(blj.B) || this.a(blj.y)) {
         this.n();
      }

      label104: {
         if (this.cN() instanceof cfh $$10 && this.bx()) {
            this.c($$10, $$9);
            break label104;
         }

         this.a($$9);
      }

      this.dM().af().c();
      this.dM().af().a("freezing");
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

      this.dM().af().c();
      this.dM().af().a("push");
      if (this.by > 0) {
         this.by--;
         this.a($$8, this.cH());
      }

      this.M_();
      this.dM().af().c();
      if (!this.dM().B && this.fh() && this.bb()) {
         this.a(this.dN().h(), 1.0F);
      }
   }

   public boolean fh() {
      return false;
   }

   private void H() {
      boolean $$0 = this.i(7);
      if ($$0 && !this.aC() && !this.bO() && !this.a(blj.y)) {
         cmx $$1 = this.c(blz.e);
         if ($$1.a(cna.nS) && clr.d($$1)) {
            $$0 = true;
            int $$2 = this.bx + 1;
            if (!this.dM().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, $$0x -> $$0x.d(blz.e));
               }

               this.a(dnq.n);
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
         this.dM().a(dne.a(cfh.class), this.cH(), blx.a(this)).forEach(this::D);
      } else {
         List<blu> $$0 = this.dM().a(this, this.cH(), blx.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dM().Z().c(ctk.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ag.a(4) == 0) {
               int $$2 = 0;

               for (blu $$3 : $$0) {
                  if (!$$3.bO()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dN().g(), 6.0F);
               }
            }

            for (blu $$4 : $$0) {
               this.D($$4);
            }
         }
      }
   }

   protected void a(eln $$0, eln $$1) {
      eln $$2 = $$0.b($$1);
      List<blu> $$3 = this.dM().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (blu $$4 : $$3) {
            if ($$4 instanceof bmk) {
               this.g((bmk)$$4);
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

   protected void D(blu $$0) {
      $$0.g(this);
   }

   protected void g(bmk $$0) {
   }

   public boolean fj() {
      return (this.an.b(t) & 4) != 0;
   }

   @Override
   public void ac() {
      blu $$0 = this.cZ();
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

   public void a(cbt $$0) {
      blu $$1 = $$0.w();
      if ($$1 instanceof ane) {
         am.P.a((ane)$$1, $$0.q(), this);
      }
   }

   public void a(blu $$0, int $$1) {
      if (!$$0.dH() && !this.dM().B && ($$0 instanceof cbt || $$0 instanceof cfn || $$0 instanceof bma)) {
         ((and)this.dM()).l().b($$0, new acy($$0.aj(), this.aj(), $$1));
      }
   }

   public boolean E(blu $$0) {
      if ($$0.dM() != this.dM()) {
         return false;
      } else {
         els $$1 = new els(this.dr(), this.dv(), this.dx());
         els $$2 = new els($$0.dr(), $$0.dv(), $$0.dx());
         return $$2.f($$1) > 128.0 ? false : this.dM().a(new csx($$1, $$2, csx.a.a, csx.b.a, this)).c() == elq.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.aW : aun.i($$0, this.aX, this.aW);
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
   protected els a(ic.a $$0, l.a $$1) {
      return i(super.a($$0, $$1));
   }

   public static els i(els $$0) {
      return new els($$0.c, $$0.d, 0.0);
   }

   public float fk() {
      return this.ca;
   }

   public final void y(float $$0) {
      this.z(aun.a($$0, 0.0F, this.eN()));
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

   public abstract bme fm();

   public boolean fn() {
      return (this.an.b(t) & 1) > 0;
   }

   public bjz fo() {
      return (this.an.b(t) & 2) > 0 ? bjz.b : bjz.a;
   }

   private void I() {
      if (this.fn()) {
         if (cmx.b(this.b(this.fo()), this.bv)) {
            this.bv = this.b(this.fo());
            this.a(this.bv);
         } else {
            this.ft();
         }
      }
   }

   protected void a(cmx $$0) {
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
      chx $$1 = this.bv.d().v();
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

   public void c(bjz $$0) {
      cmx $$1 = this.b($$0);
      if (!$$1.b() && !this.fn()) {
         this.bv = $$1;
         this.bw = $$1.r();
         if (!this.dM().B) {
            this.c(1, true);
            this.c(2, $$0 == bjz.b);
            this.a(dnq.D);
         }
      }
   }

   @Override
   public void a(agm<?> $$0) {
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
            this.bv = cmx.f;
            this.bw = 0;
         }
      }
   }

   @Override
   public void a(ee.a $$0, els $$1) {
      super.a($$0, $$1);
      this.aX = this.aW;
      this.aU = this.aW;
      this.aV = this.aU;
   }

   protected void b(cmx $$0, int $$1) {
      if (!$$0.b() && this.fn()) {
         if ($$0.s() == cor.c) {
            this.a(this.c($$0), 0.5F, this.dM().z.i() * 0.1F + 0.9F);
         }

         if ($$0.s() == cor.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(cmx $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         els $$3 = new els(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dE() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dC() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ag.i()) * 0.6 - 0.3;
         els $$5 = new els(((double)this.ag.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dE() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dC() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dr(), this.dv(), this.dx());
         this.dM().a(new jt(jx.Q, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void x() {
      if (!this.dM().B || this.fn()) {
         bjz $$0 = this.fo();
         if (!this.bv.equals(this.b($$0))) {
            this.fs();
         } else {
            if (!this.bv.b() && this.fn()) {
               this.b(this.bv, 16);
               cmx $$1 = this.bv.a(this.dM(), this);
               if ($$1 != this.bv) {
                  this.a($$0, $$1);
               }

               this.ft();
            }
         }
      }
   }

   public cmx fp() {
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
            this.a(dnq.C);
         }
      }

      this.bv = cmx.f;
      this.bw = 0;
   }

   public boolean fu() {
      if (this.fn() && !this.bv.b()) {
         cms $$0 = this.bv.d();
         return $$0.c(this.bv) != cor.d ? false : $$0.b(this.bv) - this.bw >= 5;
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
      return super.ca() || !this.fw() && this.c(bmw.b);
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
      hx $$9 = hx.a($$0, $$1, $$2);
      cto $$10 = this.dM();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.J_()) {
            hx $$12 = $$9.d();
            djg $$13 = $$10.a_($$12);
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

         if (this instanceof bmt $$14) {
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

   public void a(hx $$0, boolean $$1) {
   }

   public boolean f(cmx $$0) {
      return false;
   }

   @Override
   public blv a(bmw $$0) {
      return $$0 == bmw.c ? v : super.a($$0).a(this.dZ());
   }

   public ImmutableList<bmw> fA() {
      return ImmutableList.of(bmw.a);
   }

   public eln e(bmw $$0) {
      blv $$1 = this.a($$0);
      return new eln((double)(-$$1.a / 2.0F), 0.0, (double)(-$$1.a / 2.0F), (double)($$1.a / 2.0F), (double)$$1.b, (double)($$1.a / 2.0F));
   }

   protected boolean f(bmw $$0) {
      eln $$1 = this.a($$0).a(this.dk());
      return this.dM().b(this, $$1);
   }

   @Override
   public boolean ct() {
      return super.ct() && !this.fD();
   }

   public Optional<hx> fB() {
      return this.an.b(bM);
   }

   public void g(hx $$0) {
      this.an.b(bM, Optional.of($$0));
   }

   public void fC() {
      this.an.b(bM, Optional.empty());
   }

   public boolean fD() {
      return this.fB().isPresent();
   }

   public void b(hx $$0) {
      if (this.bO()) {
         this.ac();
      }

      djg $$1 = this.dM().a_($$0);
      if ($$1.b() instanceof cwi) {
         this.dM().a($$0, $$1.a(cwi.c, Boolean.valueOf(true)), 3);
      }

      this.b(bmw.c);
      this.a($$0);
      this.g($$0);
      this.g(els.b);
      this.au = true;
   }

   private void a(hx $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean N() {
      return this.fB().map($$0 -> this.dM().a_($$0).b() instanceof cwi).orElse(false);
   }

   public void fE() {
      this.fB().filter(this.dM()::B).ifPresent($$0x -> {
         djg $$1 = this.dM().a_($$0x);
         if ($$1.b() instanceof cwi) {
            ic $$2 = $$1.c(cwi.aE);
            this.dM().a($$0x, $$1.a(cwi.c, Boolean.valueOf(false)), 3);
            els $$3 = cwi.a(this.ai(), this.dM(), $$0x, $$2, this.dC()).orElseGet(() -> {
               hx $$1x = $$0x.c();
               return new els((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            els $$4 = els.c($$0x).d($$3).d();
            float $$5 = (float)aun.d(aun.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      els $$0 = this.dk();
      this.b(bmw.a);
      this.a_($$0.c, $$0.d, $$0.e);
      this.fC();
   }

   @Nullable
   public ic fF() {
      hx $$0 = this.fB().orElse(null);
      return $$0 != null ? cwi.a(this.dM(), $$0) : null;
   }

   @Override
   public boolean by() {
      return !this.fD() && super.by();
   }

   @Override
   protected final float a(bmw $$0, blv $$1) {
      return $$0 == bmw.c ? 0.2F : this.b($$0, $$1);
   }

   protected float b(bmw $$0, blv $$1) {
      return super.a($$0, $$1);
   }

   public cmx g(cmx $$0) {
      return cmx.f;
   }

   public cmx a(cto $$0, cmx $$1) {
      if ($$1.M()) {
         $$0.a(null, this.dr(), this.dt(), this.dx(), this.d($$1), ars.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$1, $$0, this);
         if (!(this instanceof cfh) || !((cfh)this).fT().d) {
            $$1.h(1);
         }

         this.a(dnq.m);
      }

      return $$1;
   }

   private void a(cmx $$0, cto $$1, bmk $$2) {
      cms $$3 = $$0.d();
      if ($$3.u()) {
         for (Pair<blh, Float> $$5 : $$3.v().f()) {
            if (!$$1.B && $$5.getFirst() != null && $$1.z.i() < (Float)$$5.getSecond()) {
               $$2.b(new blh((blh)$$5.getFirst()));
            }
         }
      }
   }

   private static byte g(blz $$0) {
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

   public void d(blz $$0) {
      this.dM().a(this, g($$0));
   }

   public void d(bjz $$0) {
      this.d($$0 == bjz.a ? blz.a : blz.b);
   }

   @Override
   public eln i_() {
      if (this.c(blz.f).a(cna.uj)) {
         float $$0 = 0.5F;
         return this.cH().c(0.5, 0.5, 0.5);
      } else {
         return super.i_();
      }
   }

   public static blz h(cmx $$0) {
      cly $$1 = cly.c_($$0);
      return $$1 != null ? $$1.g() : blz.a;
   }

   private static bnc a(bmk $$0, blz $$1) {
      return $$1 != blz.f && $$1 != blz.a && $$1 != blz.b ? bnc.a($$0, $$1, $$1x -> $$1x.b() || bmm.h($$1x) == $$1) : bnc.a($$0, $$1);
   }

   @Nullable
   private static blz r(int $$0) {
      if ($$0 == 100 + blz.f.b()) {
         return blz.f;
      } else if ($$0 == 100 + blz.e.b()) {
         return blz.e;
      } else if ($$0 == 100 + blz.d.b()) {
         return blz.d;
      } else if ($$0 == 100 + blz.c.b()) {
         return blz.c;
      } else if ($$0 == 98) {
         return blz.a;
      } else {
         return $$0 == 99 ? blz.b : null;
      }
   }

   @Override
   public bnc a_(int $$0) {
      blz $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dA() {
      if (this.P_()) {
         return false;
      } else {
         boolean $$0 = !this.c(blz.f).a(aso.az) && !this.c(blz.e).a(aso.az) && !this.c(blz.d).a(aso.az) && !this.c(blz.c).a(aso.az);
         return $$0 && super.dA();
      }
   }

   @Override
   public boolean cd() {
      return !this.dM().y_() && this.a(blj.x) || super.cd();
   }

   @Override
   public float dD() {
      return this.aU;
   }

   @Override
   public void a(zb $$0) {
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
      return this.eT().d() instanceof ckm;
   }

   @Override
   public float dG() {
      float $$0 = super.dG();
      return this.cN() instanceof cfh ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public els m(blu $$0) {
      return new els(this.a($$0, this.a(this.ap()), this.dZ()).rotateY(-this.aU * (float) (Math.PI / 180.0))).e(this.dk());
   }

   @Override
   public float k(blu $$0) {
      return this.l($$0) * this.dZ();
   }

   protected void a(int $$0, double $$1) {
      this.aW = (float)aun.e(1.0 / (double)$$0, (double)this.aW, $$1);
   }

   public static record a(arq a, arq b) {
   }
}
