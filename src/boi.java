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

public abstract class boi extends bnq implements bno {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final bpn bB = new bpn(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, bpn.a.c);
   public static final int h = 2;
   public static final int i = 4;
   public static final int j = 98;
   public static final int k = 100;
   public static final int l = 6;
   public static final int m = 100;
   private static final int bC = 40;
   public static final double n = 0.003;
   public static final double o = 0.08;
   public static final int p = 20;
   private static final int bD = 7;
   private static final int bE = 10;
   private static final int bF = 2;
   public static final int q = 4;
   private static final float bG = 0.42F;
   private static final double bH = 128.0;
   protected static final int r = 1;
   protected static final int s = 2;
   protected static final int t = 4;
   protected static final aie<Byte> u = aih.a(boi.class, aig.a);
   private static final aie<Float> bI = aih.a(boi.class, aig.d);
   private static final aie<Integer> bJ = aih.a(boi.class, aig.b);
   private static final aie<Boolean> bK = aih.a(boi.class, aig.k);
   private static final aie<Integer> bL = aih.a(boi.class, aig.b);
   private static final aie<Integer> bM = aih.a(boi.class, aig.b);
   private static final aie<Optional<hz>> bN = aih.a(boi.class, aig.o);
   protected static final bnt v = bnt.c(0.2F, 0.2F).b(0.2F);
   public static final float aD = 0.5F;
   public static final float aE = 0.5F;
   private final bpm bO;
   private final bmm bP = new bmm(this);
   private final Map<ij<bnb>, bnd> bQ = Maps.newHashMap();
   private final is<cpd> bR = is.a(2, cpd.h);
   private final is<cpd> bS = is.a(4, cpd.h);
   public boolean aF;
   private boolean bT = false;
   public blv aG;
   public int aH;
   public int aI;
   public int aJ;
   public int aK;
   public int aL;
   public int aM;
   public float aN;
   public float aO;
   protected int aP;
   public final bpi aQ = new bpi();
   public final int aR = 20;
   public final float aS;
   public final float aT;
   public float aU;
   public float aV;
   public float aW;
   public float aX;
   @Nullable
   protected chl aY;
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
   private boolean bU = true;
   @Nullable
   private boi bV;
   private int bW;
   private boi bX;
   private int bY;
   private float bZ;
   private int ca;
   private float cb;
   protected cpd bv = cpd.h;
   protected int bw;
   protected int bx;
   private hz cc;
   private Optional<hz> cd = Optional.empty();
   @Nullable
   private bmp ce;
   private long cf;
   protected int by;
   private float cg;
   private float ch;
   protected bpj<?> bz;
   private boolean ci;
   protected float bA = 1.0F;

   protected boi(bnw<? extends boi> $$0, cvr $$1) {
      super($$0, $$1);
      this.bO = new bpm(bpq.a($$0));
      this.t(this.eN());
      this.H = true;
      this.aT = (float)((Math.random() + 1.0) * 0.01F);
      this.ar();
      this.aS = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.aW = this.dC();
      tk $$2 = tk.a;
      this.bz = this.a(new Dynamic($$2, (tt)$$2.createMap(ImmutableMap.of($$2.a("memories"), (tt)$$2.emptyMap()))));
   }

   public bpj<?> dO() {
      return this.bz;
   }

   protected bpj.b<?> dP() {
      return bpj.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bpj<?> a(Dynamic<?> $$0) {
      return this.dP().a($$0);
   }

   @Override
   public void al() {
      this.a(this.dN().w(), Float.MAX_VALUE);
   }

   public boolean a(bnw<?> $$0) {
      return true;
   }

   @Override
   protected void c_() {
      this.am.a(u, (byte)0);
      this.am.a(bJ, 0);
      this.am.a(bK, false);
      this.am.a(bL, 0);
      this.am.a(bM, 0);
      this.am.a(bI, 1.0F);
      this.am.a(bN, Optional.empty());
   }

   public static bpo.a dQ() {
      return bpo.a().a(bpp.n).a(bpp.k).a(bpp.o).a(bpp.a).a(bpp.b).a(bpp.m).a(bpp.r).a(bpp.p);
   }

   @Override
   protected void a(double $$0, boolean $$1, dlj $$2, hz $$3) {
      if (!this.aZ()) {
         this.bh();
      }

      if (!this.dM().B && $$1 && this.aa > 0.0F) {
         this.dV();
         this.dW();
      }

      if (!this.dM().B && this.aa > 3.0F && $$1 && !$$2.i()) {
         double $$4 = this.dr();
         double $$5 = this.dt();
         double $$6 = this.dx();
         hz $$7 = this.dm();
         if ($$3.u() != $$7.u() || $$3.w() != $$7.w()) {
            double $$8 = $$4 - (double)$$3.u() - 0.5;
            double $$9 = $$6 - (double)$$3.w() - 0.5;
            double $$10 = Math.max(Math.abs($$8), Math.abs($$9));
            $$4 = (double)$$3.u() + 0.5 + $$8 / $$10 * 0.5;
            $$6 = (double)$$3.w() + 0.5 + $$9 / $$10 * 0.5;
         }

         float $$11 = (float)awi.f(this.aa - 3.0F);
         double $$12 = Math.min((double)(0.2F + $$11 / 15.0F), 2.5);
         int $$13 = (int)(150.0 * $$12);
         ((aow)this.dM()).a(new jr(jz.c, $$2), $$4, $$5, $$6, $$13, 0.0, 0.0, 0.0, 0.15F);
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cd = Optional.empty();
      }
   }

   public final boolean dR() {
      return this.ai().a(aud.m);
   }

   public float a(float $$0) {
      return awi.i($$0, this.ch, this.cg);
   }

   @Override
   public void as() {
      this.aN = this.aO;
      if (this.al) {
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
         boolean $$0 = this instanceof chl;
         if (!this.dM().B) {
            if (this.by()) {
               this.a(this.dN().f(), 1.0F);
            } else if ($$0 && !this.dM().D_().a(this.cH())) {
               double $$1 = this.dM().D_().a(this) + this.dM().D_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dM().D_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dN().v(), (float)Math.max(1, awi.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(auf.a) && !this.dM().a_(hz.a(this.dr(), this.dv(), this.dx())).a(cyu.nd)) {
            boolean $$3 = !this.dR() && !bne.c(this) && (!$$0 || !((chl)this).fU().a);
            if ($$3) {
               this.k(this.n(this.ci()));
               if (this.ci() == -20) {
                  this.k(0);
                  enz $$4 = this.dp();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.af.j() - this.af.j();
                     double $$7 = this.af.j() - this.af.j();
                     double $$8 = this.af.j() - this.af.j();
                     this.dM().a(jz.e, this.dr() + $$6, this.dt() + $$7, this.dx() + $$8, $$4.c, $$4.d, $$4.e);
                  }

                  this.a(this.dN().h(), 2.0F);
               }
            }

            if (!this.dM().B && this.bO() && this.cZ() != null && this.cZ().bQ()) {
               this.ac();
            }
         } else if (this.ci() < this.ch()) {
            this.k(this.o(this.ci()));
         }

         if (!this.dM().B) {
            hz $$9 = this.dm();
            if (!Objects.equal(this.cc, $$9)) {
               this.cc = $$9;
               this.c($$9);
            }
         }
      }

      if (this.bx() && (this.bb() || this.az)) {
         this.aF();
      }

      if (this.aK > 0) {
         this.aK--;
      }

      if (this.ak > 0 && !(this instanceof aox)) {
         this.ak--;
      }

      if (this.ex() && this.dM().h(this)) {
         this.ec();
      }

      if (this.aZ > 0) {
         this.aZ--;
      } else {
         this.aY = null;
      }

      if (this.bX != null && !this.bX.bx()) {
         this.bX = null;
      }

      if (this.bV != null) {
         if (!this.bV.bx()) {
            this.a(null);
         } else if (this.ag - this.bW > 100) {
            this.a(null);
         }
      }

      this.eo();
      this.bf = this.be;
      this.aV = this.aU;
      this.aX = this.aW;
      this.M = this.dC();
      this.N = this.dE();
      this.dM().ae().c();
   }

   public boolean dS() {
      return this.ag % 5 == 0 && this.dp().c != 0.0 && this.dp().e != 0.0 && !this.P_() && ctn.k(this) && this.dU();
   }

   protected void dT() {
      enz $$0 = this.dp();
      this.dM()
         .a(
            jz.K,
            this.dr() + (this.af.j() - 0.5) * (double)this.dg(),
            this.dt() + 0.1,
            this.dx() + (this.af.j() - 0.5) * (double)this.dg(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.af.i() * 0.4F + this.af.i() > 0.9F ? 0.6F : 0.0F;
      this.a(atl.xj, $$1, 0.6F + this.af.i() * 0.4F);
   }

   protected boolean dU() {
      return this.dM().a_(this.aI()).a(aua.aM);
   }

   @Override
   protected float aL() {
      return this.dU() && ctn.a(ctp.l, this) > 0 ? 1.0F : super.aL();
   }

   @Override
   protected boolean c(dlj $$0) {
      return !$$0.i() || this.fw();
   }

   protected void dV() {
      bpl $$0 = this.f(bpp.o);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void dW() {
      if (!this.bj().i()) {
         int $$0 = ctn.a(ctp.l, this);
         if ($$0 > 0 && this.dU()) {
            bpl $$1 = this.f(bpp.o);
            if ($$1 == null) {
               return;
            }

            $$1.c(new bpn(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), bpn.a.a));
            if (this.eh().i() < 0.04F) {
               cpd $$2 = this.c(bnx.c);
               $$2.a(1, this, bnx.c);
            }
         }
      }
   }

   protected void dX() {
      bpl $$0 = this.f(bpp.o);
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
            bpl $$1 = this.f(bpp.o);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.ck();
            $$1.c(new bpn(e, "Powder snow slow", (double)$$2, bpn.a.a));
         }
      }
   }

   protected void c(hz $$0) {
      int $$1 = ctn.a(ctp.j, this);
      if ($$1 > 0) {
         cts.a(this, this.dM(), $$0, $$1);
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

   public float ea() {
      bpm $$0 = this.eS();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bpp.p));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean eb() {
      return true;
   }

   protected void ec() {
      this.aM++;
      if (this.aM >= 20 && !this.dM().y_() && !this.dH()) {
         this.dM().a(this, (byte)60);
         this.a(bnq.c.a);
      }
   }

   public boolean ed() {
      return !this.o_();
   }

   protected boolean ee() {
      return !this.o_();
   }

   protected int n(int $$0) {
      int $$1 = ctn.e(this);
      return $$1 > 0 && this.af.a($$1 + 1) > 0 ? $$0 : $$0 - 1;
   }

   protected int o(int $$0) {
      return Math.min($$0 + 4, this.ch());
   }

   public int ef() {
      return 0;
   }

   protected boolean eg() {
      return false;
   }

   public awp eh() {
      return this.af;
   }

   @Nullable
   public boi ei() {
      return this.bV;
   }

   @Override
   public boi V_() {
      return this.ei();
   }

   public int ej() {
      return this.bW;
   }

   public void c(@Nullable chl $$0) {
      this.aY = $$0;
      this.aZ = this.ag;
   }

   public void a(@Nullable boi $$0) {
      this.bV = $$0;
      this.bW = this.ag;
   }

   @Nullable
   public boi ek() {
      return this.bX;
   }

   public int el() {
      return this.bY;
   }

   public void z(bnq $$0) {
      if ($$0 instanceof boi) {
         this.bX = (boi)$$0;
      } else {
         this.bX = null;
      }

      this.bY = this.ag;
   }

   public int em() {
      return this.bb;
   }

   public void p(int $$0) {
      this.bb = $$0;
   }

   public boolean en() {
      return this.bT;
   }

   public void p(boolean $$0) {
      this.bT = $$0;
   }

   protected boolean a(bnx $$0) {
      return true;
   }

   public void a(bnx $$0, cpd $$1, cpd $$2) {
      boolean $$3 = $$2.b() && $$1.b();
      if (!$$3 && !cpd.c($$1, $$2) && !this.al) {
         coe $$4 = coe.c_($$2);
         if (!this.dM().y_() && !this.P_()) {
            if (!this.aU() && $$4 != null && $$4.g() == $$0) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), $$4.au_(), this.db(), 1.0F, 1.0F);
            }

            if (this.a($$0)) {
               this.b($$4 != null ? dpw.v : dpw.S);
            }
         }
      }
   }

   @Override
   public void a(bnq.c $$0) {
      super.a($$0);
      this.bz.a();
   }

   @Override
   public void b(sw $$0) {
      $$0.a("Health", this.ew());
      $$0.a("HurtTime", (short)this.aK);
      $$0.a("HurtByTimestamp", this.bW);
      $$0.a("DeathTime", (short)this.aM);
      $$0.a("AbsorptionAmount", this.fk());
      $$0.a("Attributes", this.eS().c());
      if (!this.bQ.isEmpty()) {
         tc $$1 = new tc();

         for (bnd $$2 : this.bQ.values()) {
            $$1.add($$2.a(new sw()));
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fw());
      this.fB().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<tt> $$3 = this.bz.a(tk.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(sw $$0) {
      this.z($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dM() != null && !this.dM().B) {
         this.eS().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         tc $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            sw $$3 = $$1.a($$2);
            bnd $$4 = bnd.b($$3);
            if ($$4 != null) {
               this.bQ.put($$4.b(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.t($$0.j("Health"));
      }

      this.aK = $$0.g("HurtTime");
      this.aM = $$0.g("DeathTime");
      this.bW = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         epd $$6 = this.dM().K();
         eoy $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cx(), $$7);
         if (!$$8) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         hz $$9 = new hz($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$9);
         this.am.b(ar, bot.c);
         if (!this.al) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bz = this.a(new Dynamic(tk.a, $$0.c("Brain")));
      }
   }

   protected void eo() {
      Iterator<ij<bnb>> $$0 = this.bQ.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            ij<bnb> $$1 = $$0.next();
            bnd $$2 = this.bQ.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dM().B) {
                  $$0.remove();
                  this.a($$2);
               }
            } else if ($$2.c() % 600 == 0) {
               this.a($$2, false, null);
            }
         }
      } catch (ConcurrentModificationException var11) {
      }

      if (this.bU) {
         if (!this.dM().B) {
            this.J();
            this.u();
         }

         this.bU = false;
      }

      int $$3 = this.am.b(bJ);
      boolean $$4 = this.am.b(bK);
      if ($$3 > 0) {
         boolean $$5;
         if (this.ce()) {
            $$5 = this.af.a(15) == 0;
         } else {
            $$5 = this.af.h();
         }

         if ($$4) {
            $$5 &= this.af.a(5) == 0;
         }

         if ($$5 && $$3 > 0) {
            double $$7 = (double)($$3 >> 16 & 0xFF) / 255.0;
            double $$8 = (double)($$3 >> 8 & 0xFF) / 255.0;
            double $$9 = (double)($$3 >> 0 & 0xFF) / 255.0;
            this.dM().a($$4 ? jz.a : jz.v, this.d(0.5), this.du(), this.g(0.5), $$7, $$8, $$9);
         }
      }
   }

   protected void J() {
      if (this.bQ.isEmpty()) {
         this.er();
         this.j(false);
      } else {
         Collection<bnd> $$0 = this.bQ.values();
         this.am.b(bK, c($$0));
         this.am.b(bJ, crb.a($$0));
         this.j(this.a(bnf.n));
      }
   }

   private void u() {
      boolean $$0 = this.cd();
      if (this.j(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double A(@Nullable bnq $$0) {
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
         cpd $$3 = this.c(bnx.f);
         bnw<?> $$4 = $$0.ai();
         if ($$4 == bnw.aL && $$3.a(cpg.uh)
            || $$4 == bnw.bs && $$3.a(cpg.uk)
            || $$4 == bnw.ay && $$3.a(cpg.un)
            || $$4 == bnw.az && $$3.a(cpg.un)
            || $$4 == bnw.w && $$3.a(cpg.ul)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(boi $$0) {
      return $$0 instanceof chl && this.dM().aj() == blt.a ? false : $$0.ep();
   }

   public boolean a(boi $$0, byy $$1) {
      return $$1.a(this, $$0);
   }

   public boolean ep() {
      return !this.cr() && this.eq();
   }

   public boolean eq() {
      return !this.P_() && this.bx();
   }

   public static boolean c(Collection<bnd> $$0) {
      for (bnd $$1 : $$0) {
         if ($$1.f() && !$$1.e()) {
            return false;
         }
      }

      return true;
   }

   protected void er() {
      this.am.b(bK, false);
      this.am.b(bJ, 0);
   }

   public boolean es() {
      if (this.dM().B) {
         return false;
      } else {
         Iterator<bnd> $$0 = this.bQ.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<bnd> et() {
      return this.bQ.values();
   }

   public Map<ij<bnb>, bnd> eu() {
      return this.bQ;
   }

   public boolean a(ij<bnb> $$0) {
      return this.bQ.containsKey($$0);
   }

   @Nullable
   public bnd c(ij<bnb> $$0) {
      return this.bQ.get($$0);
   }

   public final boolean b(bnd $$0) {
      return this.b($$0, null);
   }

   public boolean b(bnd $$0, @Nullable bnq $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         bnd $$2 = this.bQ.get($$0.b());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bQ.put($$0.b(), $$0);
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

   public boolean c(bnd $$0) {
      return !this.ai().a(aud.w) ? true : !$$0.a(bnf.j) && !$$0.a(bnf.s);
   }

   public void c(bnd $$0, @Nullable bnq $$1) {
      if (this.c($$0)) {
         bnd $$2 = this.bQ.put($$0.b(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean ev() {
      return this.ai().a(aud.x);
   }

   @Nullable
   public bnd d(ij<bnb> $$0) {
      return this.bQ.remove($$0);
   }

   public boolean e(ij<bnb> $$0) {
      bnd $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(bnd $$0, @Nullable bnq $$1) {
      this.bU = true;
      if (!this.dM().B) {
         $$0.b().a().a(this.eS(), $$0.d());
         this.d($$0);
      }
   }

   public void d(bnd $$0) {
      for (bnq $$1 : this.cP()) {
         if ($$1 instanceof aox $$2) {
            $$2.d.b(new ael(this.aj(), $$0, false));
         }
      }
   }

   protected void a(bnd $$0, boolean $$1, @Nullable bnq $$2) {
      this.bU = true;
      if ($$1 && !this.dM().B) {
         bnb $$3 = $$0.b().a();
         $$3.a(this.eS());
         $$3.a(this.eS(), $$0.d());
         this.y();
      }

      if (!this.dM().B) {
         this.d($$0);
      }
   }

   protected void a(bnd $$0) {
      this.bU = true;
      if (!this.dM().B) {
         $$0.b().a().a(this.eS());
         this.y();

         for (bnq $$1 : this.cP()) {
            if ($$1 instanceof aox $$2) {
               $$2.d.b(new acq(this.aj(), $$0.b()));
            }
         }
      }
   }

   private void y() {
      for (bpl $$0 : this.eS().a()) {
         this.i($$0.a());
      }
   }

   private void i(ij<bpk> $$0) {
      if ($$0.a(bpp.n)) {
         float $$1 = this.eN();
         if (this.ew() > $$1) {
            this.t($$1);
         }
      } else if ($$0.a(bpp.m)) {
         float $$2 = this.eO();
         if (this.fk() > $$2) {
            this.y($$2);
         }
      }
   }

   public void c(float $$0) {
      float $$1 = this.ew();
      if ($$1 > 0.0F) {
         this.t($$1 + $$0);
      }
   }

   public float ew() {
      return this.am.b(bI);
   }

   public void t(float $$0) {
      this.am.b(bI, awi.a($$0, 0.0F, this.eN()));
   }

   public boolean ex() {
      return this.ew() <= 0.0F;
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dM().B) {
         return false;
      } else if (this.ex()) {
         return false;
      } else if ($$0.a(auc.j) && this.a(bnf.l)) {
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
            if (!$$0.a(auc.k) && $$0.c() instanceof boi $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(auc.p) && this.ai().a(aud.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(auc.a) && !this.c(bnx.f).b()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.aQ.a(1.5F);
         boolean $$7 = true;
         if ((float)this.ak > 10.0F && !$$0.a(auc.f)) {
            if ($$1 <= this.bi) {
               return false;
            }

            this.f($$0, $$1 - this.bi);
            this.bi = $$1;
            $$7 = false;
         } else {
            this.bi = $$1;
            this.ak = 20;
            this.f($$0, $$1);
            this.aL = 10;
            this.aK = this.aL;
         }

         bnq $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof boi $$9 && !$$0.a(auc.r) && (!$$0.a(bms.G) || !this.ai().a(aud.D))) {
               this.a($$9);
            }

            if ($$8 instanceof chl $$10) {
               this.aZ = 100;
               this.aY = $$10;
            } else if ($$8 instanceof cba $$11 && $$11.u()) {
               this.aZ = 100;
               if ($$11.R_() instanceof chl $$12) {
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

            if (!$$0.a(auc.s) && (!$$3 || $$1 > 0.0F)) {
               this.bq();
            }

            if ($$8 != null && !$$0.a(auc.A)) {
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

         if (this.ex()) {
            if (!this.h($$0)) {
               if ($$7) {
                  this.b(this.n_());
               }

               this.a($$0);
            }
         } else if ($$7) {
            this.e($$0);
         }

         boolean $$15 = !$$3 || $$1 > 0.0F;
         if ($$15) {
            this.ce = $$0;
            this.cf = this.dM().X();
         }

         if (this instanceof aox) {
            am.i.a((aox)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((aox)this).a(atv.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof aox) {
            am.h.a((aox)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$15;
      }
   }

   protected void d(boi $$0) {
      $$0.e(this);
   }

   protected void e(boi $$0) {
      $$0.q(0.5, $$0.dr() - this.dr(), $$0.dx() - this.dx());
   }

   private boolean h(bmp $$0) {
      if ($$0.a(auc.e)) {
         return false;
      } else {
         cpd $$1 = null;

         for (blv $$2 : blv.values()) {
            cpd $$3 = this.b($$2);
            if ($$3.a(cpg.vp)) {
               $$1 = $$3.q();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof aox $$4) {
               $$4.b(atv.c.b(cpg.vp));
               am.C.a($$4, $$1);
               this.b(dpw.C);
            }

            this.t(1.0F);
            this.es();
            this.b(new bnd(bnf.j, 900, 1));
            this.b(new bnd(bnf.v, 100, 1));
            this.b(new bnd(bnf.l, 800, 0));
            this.dM().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bmp ey() {
      if (this.dM().X() - this.cf > 40L) {
         this.ce = null;
      }

      return this.ce;
   }

   protected void e(bmp $$0) {
      this.b(this.d($$0));
   }

   public void b(@Nullable atk $$0) {
      if ($$0 != null) {
         this.a($$0, this.eW(), this.eX());
      }
   }

   public boolean f(bmp $$0) {
      bnq $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof chr $$3 && $$3.D() > 0) {
         $$2 = true;
      }

      if (!$$0.a(auc.d) && this.fu() && !$$2) {
         enz $$4 = $$0.h();
         if ($$4 != null) {
            enz $$5 = this.b(0.0F, this.cp());
            enz $$6 = $$4.a(this.dk());
            $$6 = new enz($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(cpd $$0) {
      if (!$$0.b()) {
         if (!this.aU()) {
            this.dM().a(this.dr(), this.dt(), this.dx(), atl.nd, this.db(), 0.8F, 0.8F + this.dM().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bmp $$0) {
      if (!this.dH() && !this.ba) {
         bnq $$1 = $$0.d();
         boi $$2 = this.eM();
         if (this.bh >= 0 && $$2 != null) {
            $$2.a(this, this.bh, $$0);
         }

         if (this.fD()) {
            this.fE();
         }

         if (!this.dM().B && this.ae()) {
            b.info("Named entity {} died: {}", this, this.eL().a().getString());
         }

         this.ba = true;
         this.eL().c();
         if (this.dM() instanceof aow $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.b(dpw.p);
               this.g($$0);
               this.f($$2);
            }

            this.dM().a(this, (byte)3);
         }

         this.b(bot.h);
      }
   }

   protected void f(@Nullable boi $$0) {
      if (!this.dM().B) {
         boolean $$1 = false;
         if ($$0 instanceof cdk) {
            if (this.dM().Z().b(cvn.c)) {
               hz $$2 = this.dm();
               dlj $$3 = cyu.cd.o();
               if (this.dM().a_($$2).i() && $$3.a((cvu)this.dM(), $$2)) {
                  this.dM().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               cdw $$4 = new cdw(this.dM(), this.dr(), this.dt(), this.dx(), new cpd(cpg.dv));
               this.dM().b($$4);
            }
         }
      }
   }

   protected void g(bmp $$0) {
      bnq $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof chl) {
         $$2 = ctn.h((boi)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.aZ > 0;
      if (this.ee() && this.dM().Z().b(cvn.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.ez();
      this.eA();
   }

   protected void ez() {
   }

   protected void eA() {
      if (this.dM() instanceof aow && !this.eE() && (this.eg() || this.aZ > 0 && this.ed() && this.dM().Z().b(cvn.f))) {
         bny.a((aow)this.dM(), this.dk(), this.ef());
      }
   }

   protected void a(bmp $$0, int $$1, boolean $$2) {
   }

   public aiy eB() {
      return this.ai().j();
   }

   public long eC() {
      return 0L;
   }

   protected void a(bmp $$0, boolean $$1) {
      aiy $$2 = this.eB();
      ejk $$3 = this.dM().o().aL().getLootTable($$2);
      eji.a $$4 = new eji.a((aow)this.dM()).a(eln.a, this).a(eln.f, this.dk()).a(eln.c, $$0).b(eln.d, $$0.d()).b(eln.e, $$0.c());
      if ($$1 && this.aY != null) {
         $$4 = $$4.a(eln.b, this.aY).a(this.aY.gp());
      }

      eji $$5 = $$4.a(elm.g);
      $$3.a($$5, this.eC(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.g(bpp.k);
      if (!($$0 <= 0.0)) {
         this.at = true;
         enz $$3 = this.dp();
         enz $$4 = new enz($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aC() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected atk d(bmp $$0) {
      return atl.jS;
   }

   @Nullable
   protected atk n_() {
      return atl.jN;
   }

   private atk d(int $$0) {
      return $$0 > 4 ? this.eH().b() : this.eH().a();
   }

   public void eD() {
      this.ci = true;
   }

   public boolean eE() {
      return this.ci;
   }

   public float eF() {
      return 0.0F;
   }

   protected enu eG() {
      enu $$0 = this.cH();
      bnq $$1 = this.cZ();
      if ($$1 != null) {
         enz $$2 = $$1.l(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public boi.a eH() {
      return new boi.a(atl.jT, atl.jL);
   }

   protected atk c(cpd $$0) {
      return $$0.O();
   }

   public atk d(cpd $$0) {
      return $$0.P();
   }

   public Optional<hz> eI() {
      return this.cd;
   }

   public boolean e_() {
      if (this.P_()) {
         return false;
      } else {
         hz $$0 = this.dm();
         dlj $$1 = this.dn();
         if ($$1.a(aua.aO)) {
            this.cd = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dhe && this.c($$0, $$1)) {
            this.cd = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(hz $$0, dlj $$1) {
      if ($$1.c(dhe.b)) {
         dlj $$2 = this.dM().a_($$0.d());
         if ($$2.a(cyu.cO) && $$2.c(dcx.b) == $$1.c(dhe.aE)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean bx() {
      return !this.dH() && this.ew() > 0.0F;
   }

   @Override
   public boolean a(float $$0, float $$1, bmp $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.d($$0, $$1);
      if ($$4 > 0) {
         this.a(this.d($$4), 1.0F, 1.0F);
         this.eJ();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int d(float $$0, float $$1) {
      if (this.ai().a(aud.o)) {
         return 0;
      } else {
         bnd $$2 = this.c(bnf.h);
         float $$3 = $$2 == null ? 0.0F : (float)($$2.d() + 1);
         return awi.f(($$0 - 3.0F - $$3) * $$1);
      }
   }

   protected void eJ() {
      if (!this.aU()) {
         int $$0 = awi.a(this.dr());
         int $$1 = awi.a(this.dt() - 0.2F);
         int $$2 = awi.a(this.dx());
         dlj $$3 = this.dM().a_(new hz($$0, $$1, $$2));
         if (!$$3.i()) {
            dge $$4 = $$3.w();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void m(float $$0) {
      this.aL = 10;
      this.aK = this.aL;
   }

   public int eK() {
      return awi.a(this.g(bpp.a));
   }

   protected void b(bmp $$0, float $$1) {
   }

   protected void c(bmp $$0, float $$1) {
   }

   protected void u(float $$0) {
   }

   protected float d(bmp $$0, float $$1) {
      if (!$$0.a(auc.c)) {
         this.b($$0, $$1);
         $$1 = bml.a($$1, (float)this.eK(), (float)this.g(bpp.b));
      }

      return $$1;
   }

   protected float e(bmp $$0, float $$1) {
      if ($$0.a(auc.g)) {
         return $$1;
      } else {
         if (this.a(bnf.k) && !$$0.a(auc.h)) {
            int $$2 = (this.c(bnf.k).d() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof aox) {
                  ((aox)this).a(atv.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof aox) {
                  ((aox)$$0.d()).a(atv.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(auc.i)) {
            return $$1;
         } else {
            int $$7 = ctn.a(this.bL(), $$0);
            if ($$7 > 0) {
               $$1 = bml.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bmp $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fk(), 0.0F);
         this.y(this.fk() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof aox $$4) {
            $$4.a(atv.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eL().a($$0, var9);
            this.t(this.ew() - var9);
            this.y(this.fk() - var9);
            this.b(dpw.o);
         }
      }
   }

   public bmm eL() {
      return this.bP;
   }

   @Nullable
   public boi eM() {
      if (this.aY != null) {
         return this.aY;
      } else {
         return this.bV != null ? this.bV : null;
      }
   }

   public final float eN() {
      return (float)this.g(bpp.n);
   }

   public final float eO() {
      return (float)this.g(bpp.m);
   }

   public final int eP() {
      return this.am.b(bL);
   }

   public final void q(int $$0) {
      this.am.b(bL, $$0);
   }

   public final int eQ() {
      return this.am.b(bM);
   }

   public final void r(int $$0) {
      this.am.b(bM, $$0);
   }

   private int B() {
      if (bne.a(this)) {
         return 6 - (1 + bne.b(this));
      } else {
         return this.a(bnf.d) ? 6 + (1 + this.c(bnf.d).d()) * 2 : 6;
      }
   }

   public void a(blv $$0) {
      this.a($$0, false);
   }

   public void a(blv $$0, boolean $$1) {
      if (!this.aF || this.aH >= this.B() / 2 || this.aH < 0) {
         this.aH = -1;
         this.aF = true;
         this.aG = $$0;
         if (this.dM() instanceof aow) {
            aaj $$2 = new aaj(this, $$0 == blv.a ? 0 : 3);
            aou $$3 = ((aow)this.dM()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bmp $$0) {
      this.aQ.a(1.5F);
      this.ak = 20;
      this.aL = 10;
      this.aK = this.aL;
      atk $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eW(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
      }

      this.a(this.dN().n(), 0.0F);
      this.ce = $$0;
      this.cf = this.dM().X();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            atk $$1 = this.n_();
            if ($$1 != null) {
               this.a($$1, this.eW(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof chl)) {
               this.t(0.0F);
               this.a(this.dN().n());
            }
            break;
         case 29:
            this.a(atl.vW, 1.0F, 0.8F + this.dM().z.i() * 0.4F);
            break;
         case 30:
            this.a(atl.vX, 0.8F, 0.8F + this.dM().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.af.i() - 0.5F) * 0.2F;
               float $$6 = (this.af.i() - 0.5F) * 0.2F;
               float $$7 = (this.af.i() - 0.5F) * 0.2F;
               double $$8 = awi.d($$4, this.J, this.dr()) + (this.af.j() - 0.5) * (double)this.dg() * 2.0;
               double $$9 = awi.d($$4, this.K, this.dt()) + this.af.j() * (double)this.dh();
               double $$10 = awi.d($$4, this.L, this.dx()) + (this.af.j() - 0.5) * (double)this.dg() * 2.0;
               this.dM().a(jz.Z, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.c(bnx.a));
            break;
         case 48:
            this.i(this.c(bnx.b));
            break;
         case 49:
            this.i(this.c(bnx.f));
            break;
         case 50:
            this.i(this.c(bnx.e));
            break;
         case 51:
            this.i(this.c(bnx.d));
            break;
         case 52:
            this.i(this.c(bnx.c));
            break;
         case 54:
            dcl.b(this);
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
         double $$1 = this.af.k() * 0.02;
         double $$2 = this.af.k() * 0.02;
         double $$3 = this.af.k() * 0.02;
         this.dM().a(jz.Y, this.d(1.0), this.du(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void D() {
      cpd $$0 = this.c(bnx.b);
      this.a(bnx.b, this.c(bnx.a));
      this.a(bnx.a, $$0);
   }

   @Override
   protected void aB() {
      this.a(this.dN().m(), 4.0F);
   }

   protected void eR() {
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
   public bpl f(ij<bpk> $$0) {
      return this.eS().a($$0);
   }

   public double g(ij<bpk> $$0) {
      return this.eS().c($$0);
   }

   public double h(ij<bpk> $$0) {
      return this.eS().d($$0);
   }

   public bpm eS() {
      return this.bO;
   }

   public cpd eT() {
      return this.c(bnx.a);
   }

   public cpd eU() {
      return this.c(bnx.b);
   }

   public boolean b(coy $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cpd> $$0) {
      return $$0.test(this.eT()) || $$0.test(this.eU());
   }

   public cpd b(blv $$0) {
      if ($$0 == blv.a) {
         return this.c(bnx.a);
      } else if ($$0 == blv.b) {
         return this.c(bnx.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(blv $$0, cpd $$1) {
      if ($$0 == blv.a) {
         this.a(bnx.a, $$1);
      } else {
         if ($$0 != blv.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bnx.b, $$1);
      }
   }

   public boolean b(bnx $$0) {
      return !this.c($$0).b();
   }

   @Override
   public abstract Iterable<cpd> bL();

   public abstract cpd c(bnx var1);

   @Override
   public abstract void a(bnx var1, cpd var2);

   protected void e(cpd $$0) {
      sw $$1 = $$0.w();
      if ($$1 != null) {
         $$0.d().b($$1);
      }
   }

   public float eV() {
      Iterable<cpd> $$0 = this.bL();
      int $$1 = 0;
      int $$2 = 0;

      for (cpd $$3 : $$0) {
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
      bpl $$1 = this.f(bpp.o);
      $$1.b(bB.a());
      if ($$0) {
         $$1.c(bB);
      }
   }

   protected float eW() {
      return 1.0F;
   }

   public float eX() {
      return this.o_() ? (this.af.i() - this.af.i()) * 0.2F + 1.5F : (this.af.i() - this.af.i()) * 0.2F + 1.0F;
   }

   protected boolean eY() {
      return this.ex();
   }

   @Override
   public void g(bnq $$0) {
      if (!this.fD()) {
         super.g($$0);
      }
   }

   private void a(bnq $$0) {
      enz $$1;
      if (this.dH()) {
         $$1 = this.dk();
      } else if (!$$0.dH() && !this.dM().a_($$0.dm()).a(aua.aI)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dt(), $$0.dt());
         $$1 = new enz(this.dr(), $$2, this.dx());
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
      return this.a(bnf.h) ? 0.1F * ((float)this.c(bnf.h).d() + 1.0F) : 0.0F;
   }

   protected void fb() {
      enz $$0 = this.dp();
      this.o($$0.c, (double)this.eZ(), $$0.e);
      if (this.bY()) {
         float $$1 = this.dC() * (float) (Math.PI / 180.0);
         this.g(this.dp().b((double)(-awi.a($$1) * 0.2F), 0.0, (double)(awi.b($$1) * 0.2F)));
      }

      this.at = true;
   }

   protected void fc() {
      this.g(this.dp().b(0.0, -0.04F, 0.0));
   }

   protected void c(aup<egv> $$0) {
      this.g(this.dp().b(0.0, 0.04F, 0.0));
   }

   protected float fd() {
      return 0.8F;
   }

   public boolean a(egw $$0) {
      return false;
   }

   public void a(enz $$0) {
      if (this.cX()) {
         double $$1 = 0.08;
         boolean $$2 = this.dp().d <= 0.0;
         if ($$2 && this.a(bnf.B)) {
            $$1 = 0.01;
         }

         egw $$3 = this.dM().b_(this.dm());
         if (this.aZ() && this.eb() && !this.a($$3)) {
            double $$4 = this.dt();
            float $$5 = this.bY() ? 0.9F : this.fd();
            float $$6 = 0.02F;
            float $$7 = (float)ctn.f(this);
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

            if (this.a(bnf.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(bon.a, this.dp());
            enz $$8 = this.dp();
            if (this.O && this.e_()) {
               $$8 = new enz($$8.c, 0.2, $$8.e);
            }

            this.g($$8.d((double)$$5, 0.8F, (double)$$5));
            enz $$9 = this.a($$1, $$2, this.dp());
            this.g($$9);
            if (this.O && this.g($$9.c, $$9.d + 0.6F - this.dt() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bn() && this.eb() && !this.a($$3)) {
            double $$10 = this.dt();
            this.a(0.02F, $$0);
            this.a(bon.a, this.dp());
            if (this.b(auf.b) <= this.df()) {
               this.g(this.dp().d(0.5, 0.8F, 0.5));
               enz $$11 = this.a($$1, $$2, this.dp());
               this.g($$11);
            } else {
               this.g(this.dp().a(0.5));
            }

            if (!this.aV()) {
               this.g(this.dp().b(0.0, -$$1 / 4.0, 0.0));
            }

            enz $$12 = this.dp();
            if (this.O && this.g($$12.c, $$12.d + 0.6F - this.dt() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fw()) {
            this.cn();
            enz $$13 = this.dp();
            enz $$14 = this.bF();
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
               double $$21 = $$17 * (double)(-awi.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.g($$13.d(0.99F, 0.98F, 0.99F));
            this.a(bon.a, this.dp());
            if (this.O && !this.dM().B) {
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
            hz $$25 = this.aI();
            float $$26 = this.dM().a_($$25).b().i();
            float $$27 = this.aC() ? $$26 * 0.91F : 0.91F;
            enz $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.a(bnf.y)) {
               $$29 += (0.05 * (double)(this.c(bnf.y).d() + 1) - $$28.d) * 0.2;
            } else if (this.dM().B && !this.dM().B($$25)) {
               if (this.dt() > (double)this.dM().J_()) {
                  $$29 = -0.1;
               } else {
                  $$29 = 0.0;
               }
            } else if (!this.aV()) {
               $$29 -= $$1;
            }

            if (this.en()) {
               this.o($$28.c, $$29, $$28.e);
            } else {
               this.o($$28.c * (double)$$27, $$29 * 0.98F, $$28.e * (double)$$27);
            }
         }
      }

      this.q(this instanceof cag);
   }

   private void c(chl $$0, enz $$1) {
      enz $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.cX()) {
         this.w(this.e($$0));
         this.a($$2);
      } else {
         this.q(false);
         this.g(enz.b);
         this.aD();
      }
   }

   protected void a(chl $$0, enz $$1) {
   }

   protected enz b(chl $$0, enz $$1) {
      return $$1;
   }

   protected float e(chl $$0) {
      return this.ff();
   }

   public void q(boolean $$0) {
      float $$1 = (float)awi.g(this.dr() - this.J, $$0 ? this.dt() - this.K : 0.0, this.dx() - this.L);
      this.v($$1);
   }

   protected void v(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aQ.a($$1, 0.4F);
   }

   public enz a(enz $$0, float $$1) {
      this.a(this.A($$1), $$0);
      this.g(this.j(this.dp()));
      this.a(bon.a, this.dp());
      enz $$2 = this.dp();
      if ((this.O || this.bj) && (this.e_() || this.dn().a(cyu.qP) && del.a(this))) {
         $$2 = new enz($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public enz a(double $$0, boolean $$1, enz $$2) {
      if (!this.aV() && !this.bY()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new enz($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private enz j(enz $$0) {
      if (this.e_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = awi.a($$0.c, -0.15F, 0.15F);
         double $$3 = awi.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dn().a(cyu.nS) && this.fv() && this instanceof chl) {
            $$4 = 0.0;
         }

         $$0 = new enz($$2, $$4, $$3);
      }

      return $$0;
   }

   private float A(float $$0) {
      return this.aC() ? this.ff() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fe();
   }

   protected float fe() {
      return this.cN() instanceof chl ? this.ff() * 0.1F : 0.02F;
   }

   public float ff() {
      return this.bZ;
   }

   public void w(float $$0) {
      this.bZ = $$0;
   }

   public boolean B(bnq $$0) {
      this.z($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.I();
      this.M();
      if (!this.dM().B) {
         int $$0 = this.eP();
         if ($$0 > 0) {
            if (this.aI <= 0) {
               this.aI = 20 * (30 - $$0);
            }

            this.aI--;
            if (this.aI <= 0) {
               this.q($$0 - 1);
            }
         }

         int $$1 = this.eQ();
         if ($$1 > 0) {
            if (this.aJ <= 0) {
               this.aJ = 20 * (30 - $$1);
            }

            this.aJ--;
            if (this.aJ <= 0) {
               this.r($$1 - 1);
            }
         }

         this.E();
         if (this.ag % 20 == 0) {
            this.eL().c();
         }

         if (this.fD() && !this.N()) {
            this.fE();
         }
      }

      if (!this.dH()) {
         this.d_();
      }

      double $$2 = this.dr() - this.J;
      double $$3 = this.dx() - this.L;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aU;
      float $$6 = 0.0F;
      this.bc = this.bd;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)awi.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = awi.e(awi.g(this.dC()) - $$8);
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

      while (this.dC() - this.M < -180.0F) {
         this.M -= 360.0F;
      }

      while (this.dC() - this.M >= 180.0F) {
         this.M += 360.0F;
      }

      while (this.aU - this.aV < -180.0F) {
         this.aV -= 360.0F;
      }

      while (this.aU - this.aV >= 180.0F) {
         this.aV += 360.0F;
      }

      while (this.dE() - this.N < -180.0F) {
         this.N -= 360.0F;
      }

      while (this.dE() - this.N >= 180.0F) {
         this.N += 360.0F;
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
      float $$10 = this.ea();
      if ($$10 != this.bA) {
         this.bA = $$10;
         this.k_();
      }
   }

   private void E() {
      Map<bnx, cpd> $$0 = this.G();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bnx, cpd> G() {
      Map<bnx, cpd> $$0 = null;

      for (bnx $$1 : bnx.values()) {
         cpd $$2;
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

         cpd $$5 = this.c($$1);
         if (this.a($$2, $$5)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bnx.class);
            }

            $$0.put($$1, $$5);
            if (!$$2.b()) {
               this.eS().a($$2.a($$1));
            }

            if (!$$5.b()) {
               this.eS().b($$5.a($$1));
            }
         }
      }

      return $$0;
   }

   public boolean a(cpd $$0, cpd $$1) {
      return !cpd.a($$1, $$0);
   }

   private void a(Map<bnx, cpd> $$0) {
      cpd $$1 = $$0.get(bnx.a);
      cpd $$2 = $$0.get(bnx.b);
      if ($$1 != null && $$2 != null && cpd.a($$1, this.f(bnx.b)) && cpd.a($$2, this.f(bnx.a))) {
         ((aow)this.dM()).l().b(this, new abj(this, (byte)55));
         $$0.remove(bnx.a);
         $$0.remove(bnx.b);
         this.c(bnx.a, $$1.q());
         this.c(bnx.b, $$2.q());
      }
   }

   private void b(Map<bnx, cpd> $$0) {
      List<Pair<bnx, cpd>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cpd $$3 = $$2.q();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
         }
      });
      ((aow)this.dM()).l().b(this, new adm(this.aj(), $$1));
   }

   private cpd e(bnx $$0) {
      return this.bS.get($$0.b());
   }

   private void b(bnx $$0, cpd $$1) {
      this.bS.set($$0.b(), $$1);
   }

   private cpd f(bnx $$0) {
      return this.bR.get($$0.b());
   }

   private void c(bnx $$0, cpd $$1) {
      this.bR.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = awi.g($$0 - this.aU);
      this.aU += $$2 * 0.3F;
      float $$3 = awi.g(this.dC() - this.aU);
      float $$4 = this.fg();
      if (Math.abs($$3) > $$4) {
         this.aU = this.aU + ($$3 - (float)awi.j((double)$$3) * $$4);
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
      if (this.ca > 0) {
         this.ca--;
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

      enz $$0 = this.dp();
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
      if (this.bj && this.eb()) {
         double $$4;
         if (this.bn()) {
            $$4 = this.b(auf.b);
         } else {
            $$4 = this.b(auf.a);
         }

         boolean $$6 = this.aZ() && $$4 > 0.0;
         double $$7 = this.df();
         if (!$$6 || this.aC() && !($$4 > $$7)) {
            if (!this.bn() || this.aC() && !($$4 > $$7)) {
               if ((this.aC() || $$6 && $$4 <= $$7) && this.ca == 0) {
                  this.fb();
                  this.ca = 10;
               }
            } else {
               this.c(auf.b);
            }
         } else {
            this.c(auf.a);
         }
      } else {
         this.ca = 0;
      }

      this.dM().ae().c();
      this.dM().ae().a("travel");
      this.bk *= 0.98F;
      this.bm *= 0.98F;
      this.H();
      enu $$8 = this.cH();
      enz $$9 = new enz((double)this.bk, (double)this.bl, (double)this.bm);
      if (this.a(bnf.B) || this.a(bnf.y)) {
         this.n();
      }

      label104: {
         if (this.cN() instanceof chl $$10 && this.bx()) {
            this.c($$10, $$9);
            break label104;
         }

         this.a($$9);
      }

      this.dM().ae().c();
      this.dM().ae().a("freezing");
      if (!this.dM().B && !this.ex()) {
         int $$11 = this.cj();
         if (this.az && this.dA()) {
            this.l(Math.min(this.cm(), $$11 + 1));
         } else {
            this.l(Math.max(0, $$11 - 2));
         }
      }

      this.dX();
      this.dY();
      if (!this.dM().B && this.ag % 40 == 0 && this.cl() && this.dA()) {
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
      boolean $$0 = this.j(7);
      if ($$0 && !this.aC() && !this.bO() && !this.a(bnf.y)) {
         cpd $$1 = this.c(bnx.e);
         if ($$1.a(cpg.nS) && cnx.d($$1)) {
            $$0 = true;
            int $$2 = this.bx + 1;
            if (!this.dM().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, bnx.e);
               }

               this.b(dpw.n);
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
         this.dM().a(dpk.a(chl.class), this.cH(), bnv.a(this)).forEach(this::C);
      } else {
         List<bnq> $$0 = this.dM().a(this, this.cH(), bnv.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dM().Z().c(cvn.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.af.a(4) == 0) {
               int $$2 = 0;

               for (bnq $$3 : $$0) {
                  if (!$$3.bO()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dN().g(), 6.0F);
               }
            }

            for (bnq $$4 : $$0) {
               this.C($$4);
            }
         }
      }
   }

   protected void a(enu $$0, enu $$1) {
      enu $$2 = $$0.b($$1);
      List<bnq> $$3 = this.dM().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bnq $$4 : $$3) {
            if ($$4 instanceof boi) {
               this.g((boi)$$4);
               this.by = 0;
               this.g(this.dp().a(-0.2));
               break;
            }
         }
      } else if (this.O) {
         this.by = 0;
      }

      if (!this.dM().B && this.by <= 0) {
         this.c(4, false);
      }
   }

   protected void C(bnq $$0) {
      $$0.g(this);
   }

   protected void g(boi $$0) {
   }

   public boolean fj() {
      return (this.am.b(u) & 4) != 0;
   }

   @Override
   public void ac() {
      bnq $$0 = this.cZ();
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

   public void a(cdw $$0) {
      bnq $$1 = $$0.w();
      if ($$1 instanceof aox) {
         am.R.a((aox)$$1, $$0.q(), this);
      }
   }

   public void a(bnq $$0, int $$1) {
      if (!$$0.dH() && !this.dM().B && ($$0 instanceof cdw || $$0 instanceof chr || $$0 instanceof bny)) {
         ((aow)this.dM()).l().b($$0, new aef($$0.aj(), this.aj(), $$1));
      }
   }

   public boolean D(bnq $$0) {
      if ($$0.dM() != this.dM()) {
         return false;
      } else {
         enz $$1 = new enz(this.dr(), this.dv(), this.dx());
         enz $$2 = new enz($$0.dr(), $$0.dv(), $$0.dx());
         return $$2.f($$1) > 128.0 ? false : this.dM().a(new cva($$1, $$2, cva.a.a, cva.b.a, this)).c() == enx.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.aW : awi.i($$0, this.aX, this.aW);
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
   protected enz a(ie.a $$0, l.a $$1) {
      return i(super.a($$0, $$1));
   }

   public static enz i(enz $$0) {
      return new enz($$0.c, $$0.d, 0.0);
   }

   public float fk() {
      return this.cb;
   }

   public final void y(float $$0) {
      this.z(awi.a($$0, 0.0F, this.eO()));
   }

   protected void z(float $$0) {
      this.cb = $$0;
   }

   public void g_() {
   }

   public void h_() {
   }

   protected void fl() {
      this.bU = true;
   }

   public abstract boc fm();

   public boolean fn() {
      return (this.am.b(u) & 1) > 0;
   }

   public blv fo() {
      return (this.am.b(u) & 2) > 0 ? blv.b : blv.a;
   }

   private void I() {
      if (this.fn()) {
         if (cpd.b(this.b(this.fo()), this.bv)) {
            this.bv = this.b(this.fo());
            this.a(this.bv);
         } else {
            this.ft();
         }
      }
   }

   protected void a(cpd $$0) {
      $$0.b(this.dM(), this, this.fq());
      if (this.K()) {
         this.b($$0, 5);
      }

      if (--this.bw == 0 && !this.dM().B && !$$0.u()) {
         this.x();
      }
   }

   private boolean K() {
      int $$0 = this.fq();
      ckc $$1 = this.bv.d().u();
      boolean $$2 = $$1 != null && $$1.e();
      $$2 |= $$0 <= this.bv.s() - 7;
      return $$2 && $$0 % 4 == 0;
   }

   private void M() {
      this.ch = this.cg;
      if (this.ca()) {
         this.cg = Math.min(1.0F, this.cg + 0.09F);
      } else {
         this.cg = Math.max(0.0F, this.cg - 0.09F);
      }
   }

   protected void c(int $$0, boolean $$1) {
      int $$2 = this.am.b(u);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.am.b(u, (byte)$$2);
   }

   public void c(blv $$0) {
      cpd $$1 = this.b($$0);
      if (!$$1.b() && !this.fn()) {
         this.bv = $$1;
         this.bw = $$1.s();
         if (!this.dM().B) {
            this.c(1, true);
            this.c(2, $$0 == blv.b);
            this.b(dpw.D);
         }
      }
   }

   @Override
   public void a(aie<?> $$0) {
      super.a($$0);
      if (bN.equals($$0)) {
         if (this.dM().B) {
            this.fB().ifPresent(this::a);
         }
      } else if (u.equals($$0) && this.dM().B) {
         if (this.fn() && this.bv.b()) {
            this.bv = this.b(this.fo());
            if (!this.bv.b()) {
               this.bw = this.bv.s();
            }
         } else if (!this.fn() && !this.bv.b()) {
            this.bv = cpd.h;
            this.bw = 0;
         }
      }
   }

   @Override
   public void a(eg.a $$0, enz $$1) {
      super.a($$0, $$1);
      this.aX = this.aW;
      this.aU = this.aW;
      this.aV = this.aU;
   }

   protected void b(cpd $$0, int $$1) {
      if (!$$0.b() && this.fn()) {
         if ($$0.t() == cqw.c) {
            this.a(this.c($$0), 0.5F, this.dM().z.i() * 0.1F + 0.9F);
         }

         if ($$0.t() == cqw.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.af.a(2), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(cpd $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         enz $$3 = new enz(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dE() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dC() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.af.i()) * 0.6 - 0.3;
         enz $$5 = new enz(((double)this.af.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dE() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dC() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dr(), this.dv(), this.dx());
         this.dM().a(new jv(jz.Q, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void x() {
      if (!this.dM().B || this.fn()) {
         blv $$0 = this.fo();
         if (!this.bv.equals(this.b($$0))) {
            this.fs();
         } else {
            if (!this.bv.b() && this.fn()) {
               this.b(this.bv, 16);
               cpd $$1 = this.bv.a(this.dM(), this);
               if ($$1 != this.bv) {
                  this.a($$0, $$1);
               }

               this.ft();
            }
         }
      }
   }

   public cpd fp() {
      return this.bv;
   }

   public int fq() {
      return this.bw;
   }

   public int fr() {
      return this.fn() ? this.bv.s() - this.fq() : 0;
   }

   public void fs() {
      if (!this.bv.b()) {
         this.bv.a(this.dM(), this, this.fq());
         if (this.bv.u()) {
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
            this.b(dpw.C);
         }
      }

      this.bv = cpd.h;
      this.bw = 0;
   }

   public boolean fu() {
      if (this.fn() && !this.bv.b()) {
         coy $$0 = this.bv.d();
         return $$0.c(this.bv) != cqw.d ? false : $$0.b(this.bv) - this.bw >= 5;
      } else {
         return false;
      }
   }

   public boolean fv() {
      return this.bS();
   }

   public boolean fw() {
      return this.j(7);
   }

   @Override
   public boolean ca() {
      return super.ca() || !this.fw() && this.c(bot.b);
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
      hz $$9 = hz.a($$0, $$1, $$2);
      cvr $$10 = this.dM();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.J_()) {
            hz $$12 = $$9.d();
            dlj $$13 = $$10.a_($$12);
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

         if (this instanceof boq $$14) {
            $$14.N().n();
         }

         return true;
      }
   }

   public boolean fy() {
      return !this.ex();
   }

   public boolean fz() {
      return true;
   }

   public void a(hz $$0, boolean $$1) {
   }

   public boolean f(cpd $$0) {
      return false;
   }

   @Override
   public final bnt a(bot $$0) {
      return $$0 == bot.c ? v : this.e($$0).a(this.ea());
   }

   protected bnt e(bot $$0) {
      return this.ai().n().a(this.dZ());
   }

   public ImmutableList<bot> fA() {
      return ImmutableList.of(bot.a);
   }

   public enu f(bot $$0) {
      bnt $$1 = this.a($$0);
      return new enu((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bot $$0) {
      enu $$1 = this.a($$0).a(this.dk());
      return this.dM().b(this, $$1);
   }

   @Override
   public boolean ct() {
      return super.ct() && !this.fD();
   }

   public Optional<hz> fB() {
      return this.am.b(bN);
   }

   public void g(hz $$0) {
      this.am.b(bN, Optional.of($$0));
   }

   public void fC() {
      this.am.b(bN, Optional.empty());
   }

   public boolean fD() {
      return this.fB().isPresent();
   }

   public void b(hz $$0) {
      if (this.bO()) {
         this.ac();
      }

      dlj $$1 = this.dM().a_($$0);
      if ($$1.b() instanceof cyl) {
         this.dM().a($$0, $$1.a(cyl.c, Boolean.valueOf(true)), 3);
      }

      this.b(bot.c);
      this.a($$0);
      this.g($$0);
      this.g(enz.b);
      this.at = true;
   }

   private void a(hz $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean N() {
      return this.fB().map($$0 -> this.dM().a_($$0).b() instanceof cyl).orElse(false);
   }

   public void fE() {
      this.fB().filter(this.dM()::B).ifPresent($$0x -> {
         dlj $$1 = this.dM().a_($$0x);
         if ($$1.b() instanceof cyl) {
            ie $$2 = $$1.c(cyl.aE);
            this.dM().a($$0x, $$1.a(cyl.c, Boolean.valueOf(false)), 3);
            enz $$3 = cyl.a(this.ai(), this.dM(), $$0x, $$2, this.dC()).orElseGet(() -> {
               hz $$1x = $$0x.c();
               return new enz((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            enz $$4 = enz.c($$0x).d($$3).d();
            float $$5 = (float)awi.d(awi.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      enz $$0 = this.dk();
      this.b(bot.a);
      this.a_($$0.c, $$0.d, $$0.e);
      this.fC();
   }

   @Nullable
   public ie fF() {
      hz $$0 = this.fB().orElse(null);
      return $$0 != null ? cyl.a(this.dM(), $$0) : null;
   }

   @Override
   public boolean by() {
      return !this.fD() && super.by();
   }

   public cpd g(cpd $$0) {
      return cpd.h;
   }

   public cpd a(cvr $$0, cpd $$1) {
      if ($$1.N()) {
         $$0.a(null, this.dr(), this.dt(), this.dx(), this.d($$1), atm.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$1, $$0, this);
         if (!(this instanceof chl) || !((chl)this).fU().d) {
            $$1.h(1);
         }

         this.b(dpw.m);
      }

      return $$1;
   }

   private void a(cpd $$0, cvr $$1, boi $$2) {
      coy $$3 = $$0.d();
      if ($$3.t()) {
         for (Pair<bnd, Float> $$5 : $$3.u().f()) {
            if (!$$1.B && $$5.getFirst() != null && $$1.z.i() < (Float)$$5.getSecond()) {
               $$2.b(new bnd((bnd)$$5.getFirst()));
            }
         }
      }
   }

   private static byte g(bnx $$0) {
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

   public void d(bnx $$0) {
      this.dM().a(this, g($$0));
   }

   public static bnx d(blv $$0) {
      return $$0 == blv.a ? bnx.a : bnx.b;
   }

   @Override
   public enu i_() {
      if (this.c(bnx.f).a(cpg.um)) {
         float $$0 = 0.5F;
         return this.cH().c(0.5, 0.5, 0.5);
      } else {
         return super.i_();
      }
   }

   public static bnx h(cpd $$0) {
      coe $$1 = coe.c_($$0);
      return $$1 != null ? $$1.g() : bnx.a;
   }

   private static boz a(boi $$0, bnx $$1) {
      return $$1 != bnx.f && $$1 != bnx.a && $$1 != bnx.b ? boz.a($$0, $$1, $$1x -> $$1x.b() || bok.h($$1x) == $$1) : boz.a($$0, $$1);
   }

   @Nullable
   private static bnx s(int $$0) {
      if ($$0 == 100 + bnx.f.b()) {
         return bnx.f;
      } else if ($$0 == 100 + bnx.e.b()) {
         return bnx.e;
      } else if ($$0 == 100 + bnx.d.b()) {
         return bnx.d;
      } else if ($$0 == 100 + bnx.c.b()) {
         return bnx.c;
      } else if ($$0 == 98) {
         return bnx.a;
      } else {
         return $$0 == 99 ? bnx.b : null;
      }
   }

   @Override
   public boz a_(int $$0) {
      bnx $$1 = s($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dA() {
      if (this.P_()) {
         return false;
      } else {
         boolean $$0 = !this.c(bnx.f).a(aui.az) && !this.c(bnx.e).a(aui.az) && !this.c(bnx.d).a(aui.az) && !this.c(bnx.c).a(aui.az);
         return $$0 && super.dA();
      }
   }

   @Override
   public boolean cd() {
      return !this.dM().y_() && this.a(bnf.x) || super.cd();
   }

   @Override
   public float dD() {
      return this.aU;
   }

   @Override
   public void a(aah $$0) {
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
      this.o($$0.j(), $$0.k(), $$0.l());
   }

   public boolean fG() {
      return this.eT().d() instanceof cms;
   }

   @Override
   public float dG() {
      float $$0 = (float)this.g(bpp.r);
      return this.cN() instanceof chl ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public enz l(bnq $$0) {
      return this.dk().e(this.a($$0, this.a(this.ap()), this.ea() * this.dZ()));
   }

   protected void a(int $$0, double $$1) {
      this.aW = (float)awi.e(1.0 / (double)$$0, (double)this.aW, $$1);
   }

   @Override
   public void h(int $$0) {
      super.h(cty.a(this, $$0));
   }

   public static record a(atk a, atk b) {
   }
}
