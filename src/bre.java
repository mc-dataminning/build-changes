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

public abstract class bre extends bql implements bqi {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final bsj bG = new bsj(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, bsj.a.c);
   public static final int i = 2;
   public static final int j = 4;
   public static final int k = 98;
   public static final int l = 100;
   public static final int m = 105;
   public static final int n = 6;
   public static final int o = 100;
   private static final int bH = 40;
   public static final double p = 0.003;
   public static final double q = 0.08;
   public static final int r = 20;
   private static final int bI = 7;
   private static final int bJ = 10;
   private static final int bK = 2;
   public static final int s = 4;
   public static final float t = 0.42F;
   private static final double bL = 128.0;
   protected static final int u = 1;
   protected static final int v = 2;
   protected static final int aF = 4;
   protected static final ajk<Byte> aG = ajo.a(bre.class, ajm.a);
   private static final ajk<Float> bM = ajo.a(bre.class, ajm.d);
   private static final ajk<List<ku>> bN = ajo.a(bre.class, ajm.m);
   private static final ajk<Boolean> bO = ajo.a(bre.class, ajm.k);
   private static final ajk<Integer> bP = ajo.a(bre.class, ajm.b);
   private static final ajk<Integer> bQ = ajo.a(bre.class, ajm.b);
   private static final ajk<Optional<im>> bR = ajo.a(bre.class, ajm.p);
   private static final int bS = 15;
   protected static final bqo aH = bqo.c(0.2F, 0.2F).b(0.2F);
   public static final float aI = 0.5F;
   public static final float aJ = 0.5F;
   private final bsi bT;
   private final bpg bU = new bpg(this);
   private final Map<iv<bpv>, bpx> bV = Maps.newHashMap();
   private final je<csd> bW = je.a(2, csd.i);
   private final je<csd> bX = je.a(4, csd.i);
   private csd bY = csd.i;
   public boolean aK;
   private boolean bZ = false;
   public bop aL;
   public int aM;
   public int aN;
   public int aO;
   public int aP;
   public int aQ;
   public int aR;
   public float aS;
   public float aT;
   protected int aU;
   public final bse aV = new bse();
   public final int aW = 20;
   public final float aX;
   public final float aY;
   public float aZ;
   public float ba;
   public float bb;
   public float bc;
   @Nullable
   protected ckl bd;
   protected int be;
   protected boolean bf;
   protected int bg;
   protected float bh;
   protected float bi;
   protected float bj;
   protected float bk;
   protected float bl;
   protected int bm;
   protected float bn;
   protected boolean bo;
   public float bp;
   public float bq;
   public float br;
   protected int bs;
   protected double bt;
   protected double bu;
   protected double bv;
   protected double bw;
   protected double bx;
   protected double by;
   protected int bz;
   private boolean ca = true;
   @Nullable
   private bre cb;
   private int cc;
   private bre cd;
   private int ce;
   private float cf;
   private int cg;
   private float ch;
   protected csd bA = csd.i;
   protected int bB;
   protected int bC;
   private im ci;
   private Optional<im> cj = Optional.empty();
   @Nullable
   private bpj ck;
   private long cl;
   protected int bD;
   private float cm;
   private float cn;
   protected bsf<?> bE;
   private boolean co;
   protected float bF = 1.0F;

   protected bre(bqr<? extends bre> $$0, czu $$1) {
      super($$0, $$1);
      this.bT = new bsi(bsm.a($$0));
      this.t(this.eP());
      this.J = true;
      this.aY = (float)((Math.random() + 1.0) * 0.01F);
      this.ar();
      this.aX = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.bb = this.dD();
      um $$2 = um.a;
      this.bE = this.a(new Dynamic($$2, (uv)$$2.createMap(ImmutableMap.of($$2.a("memories"), (uv)$$2.emptyMap()))));
   }

   public bsf<?> dQ() {
      return this.bE;
   }

   protected bsf.b<?> dR() {
      return bsf.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bsf<?> a(Dynamic<?> $$0) {
      return this.dR().a($$0);
   }

   @Override
   public void al() {
      this.a(this.dO().w(), Float.MAX_VALUE);
   }

   public boolean a(bqr<?> $$0) {
      return true;
   }

   @Override
   protected void a(ajo.a $$0) {
      $$0.a(aG, (byte)0);
      $$0.a(bN, List.of());
      $$0.a(bO, false);
      $$0.a(bP, 0);
      $$0.a(bQ, 0);
      $$0.a(bM, 1.0F);
      $$0.a(bR, Optional.empty());
   }

   public static bsk.a dS() {
      return bsk.a().a(bsl.q).a(bsl.n).a(bsl.r).a(bsl.a).a(bsl.b).a(bsl.p).a(bsl.v).a(bsl.t).a(bsl.l).a(bsl.s).a(bsl.i).a(bsl.m);
   }

   @Override
   protected void a(double $$0, boolean $$1, dpy $$2, im $$3) {
      if (!this.bc()) {
         this.bk();
      }

      if (!this.dN().B && $$1 && this.ac > 0.0F) {
         this.dX();
         this.dY();
         double $$4 = this.g(bsl.s);
         if ((double)this.ac > $$4 && !$$2.i()) {
            double $$5 = this.ds();
            double $$6 = this.du();
            double $$7 = this.dy();
            im $$8 = this.dn();
            if ($$3.u() != $$8.u() || $$3.w() != $$8.w()) {
               double $$9 = $$5 - (double)$$3.u() - 0.5;
               double $$10 = $$7 - (double)$$3.w() - 0.5;
               double $$11 = Math.max(Math.abs($$9), Math.abs($$10));
               $$5 = (double)$$3.u() + 0.5 + $$9 / $$11 * 0.5;
               $$7 = (double)$$3.w() + 0.5 + $$10 / $$11 * 0.5;
            }

            float $$12 = (float)axw.c((double)this.ac - $$4);
            double $$13 = Math.min((double)(0.2F + $$12 / 15.0F), 2.5);
            int $$14 = (int)(150.0 * $$13);
            ((aqe)this.dN()).a(new kn(kw.b, $$2), $$5, $$6, $$7, $$14, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cj = Optional.empty();
      }
   }

   public final boolean dT() {
      return this.ai().a(avr.m);
   }

   public float a(float $$0) {
      return axw.i($$0, this.cn, this.cm);
   }

   @Override
   public void as() {
      this.aS = this.aT;
      if (this.an) {
         this.fH().ifPresent(this::a);
      }

      if (this.dU()) {
         this.dV();
      }

      super.as();
      this.dN().af().a("livingEntityBaseTick");
      if (this.bb() || this.dN().B) {
         this.aA();
      }

      if (this.bB()) {
         boolean $$0 = this instanceof ckl;
         if (!this.dN().B) {
            if (this.bC()) {
               this.a(this.dO().f(), 1.0F);
            } else if ($$0 && !this.dN().C_().a(this.cI())) {
               double $$1 = this.dN().C_().a(this) + this.dN().C_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dN().C_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dO().v(), (float)Math.max(1, axw.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(avt.a) && !this.dN().a_(im.a(this.ds(), this.dw(), this.dy())).a(dcx.nd)) {
            boolean $$3 = !this.dT() && !bpy.c(this) && (!$$0 || !((ckl)this).gb().a);
            if ($$3) {
               this.k(this.n(this.cj()));
               if (this.cj() == -20) {
                  this.k(0);
                  etf $$4 = this.dq();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.ah.j() - this.ah.j();
                     double $$7 = this.ah.j() - this.ah.j();
                     double $$8 = this.ah.j() - this.ah.j();
                     this.dN().a(kw.d, this.ds() + $$6, this.du() + $$7, this.dy() + $$8, $$4.c, $$4.d, $$4.e);
                  }

                  this.a(this.dO().h(), 2.0F);
               }
            }

            if (!this.dN().B && this.bP() && this.da() != null && this.da().bR()) {
               this.ac();
            }
         } else if (this.cj() < this.ci()) {
            this.k(this.o(this.cj()));
         }

         if (!this.dN().B) {
            im $$9 = this.dn();
            if (!Objects.equal(this.ci, $$9)) {
               this.ci = $$9;
               this.c($$9);
            }
         }
      }

      if (this.bB() && (this.be() || this.aB)) {
         this.aF();
      }

      if (this.aP > 0) {
         this.aP--;
      }

      if (this.am > 0 && !(this instanceof aqf)) {
         this.am--;
      }

      if (this.ez() && this.dN().h(this)) {
         this.ee();
      }

      if (this.be > 0) {
         this.be--;
      } else {
         this.bd = null;
      }

      if (this.cd != null && !this.cd.bB()) {
         this.cd = null;
      }

      if (this.cb != null) {
         if (!this.cb.bB()) {
            this.a(null);
         } else if (this.ai - this.cc > 100) {
            this.a(null);
         }
      }

      this.eq();
      this.bk = this.bj;
      this.ba = this.aZ;
      this.bc = this.bb;
      this.O = this.dD();
      this.P = this.dF();
      this.dN().af().c();
   }

   public boolean dU() {
      return this.ai % 5 == 0 && this.dq().c != 0.0 && this.dq().e != 0.0 && !this.N_() && cxo.k(this) && this.dW();
   }

   protected void dV() {
      etf $$0 = this.dq();
      this.dN()
         .a(
            kw.K,
            this.ds() + (this.ah.j() - 0.5) * (double)this.dh(),
            this.du() + 0.1,
            this.dy() + (this.ah.j() - 0.5) * (double)this.dh(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.ah.i() * 0.4F + this.ah.i() > 0.9F ? 0.6F : 0.0F;
      this.a(auz.xB, $$1, 0.6F + this.ah.i() * 0.4F);
   }

   protected boolean dW() {
      return this.dN().a_(this.aI()).a(avo.aN);
   }

   @Override
   protected float aL() {
      return this.dW() && cxo.a(cxq.l, this) > 0 ? 1.0F : super.aL();
   }

   @Override
   protected boolean c(dpy $$0) {
      return !$$0.i() || this.fC();
   }

   protected void dX() {
      bsh $$0 = this.f(bsl.r);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void dY() {
      if (!this.bm().i()) {
         int $$0 = cxo.a(cxq.l, this);
         if ($$0 > 0 && this.dW()) {
            bsh $$1 = this.f(bsl.r);
            if ($$1 == null) {
               return;
            }

            $$1.c(new bsj(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), bsj.a.a));
            if (this.ej().i() < 0.04F) {
               csd $$2 = this.d(bqs.c);
               $$2.a(1, this, bqs.c);
            }
         }
      }
   }

   protected void dZ() {
      bsh $$0 = this.f(bsl.r);
      if ($$0 != null) {
         if ($$0.a(e) != null) {
            $$0.b(e);
         }
      }
   }

   protected void ea() {
      if (!this.bm().i()) {
         int $$0 = this.ck();
         if ($$0 > 0) {
            bsh $$1 = this.f(bsl.r);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cl();
            $$1.c(new bsj(e, "Powder snow slow", (double)$$2, bsj.a.a));
         }
      }
   }

   protected void c(im $$0) {
      int $$1 = cxo.a(cxq.j, this);
      if ($$1 > 0) {
         cxt.a(this, this.dN(), $$0, $$1);
      }

      if (this.c(this.bm())) {
         this.dX();
      }

      this.dY();
   }

   public boolean p_() {
      return false;
   }

   public float eb() {
      return this.p_() ? 0.5F : 1.0F;
   }

   public float ec() {
      bsi $$0 = this.eU();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bsl.t));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean ed() {
      return true;
   }

   protected void ee() {
      this.aR++;
      if (this.aR >= 20 && !this.dN().x_() && !this.dI()) {
         this.dN().a(this, (byte)60);
         this.a(bql.c.a);
      }
   }

   public boolean ef() {
      return !this.p_();
   }

   protected boolean eg() {
      return !this.p_();
   }

   protected int n(int $$0) {
      int $$1 = cxo.e(this);
      return $$1 > 0 && this.ah.a($$1 + 1) > 0 ? $$0 : $$0 - 1;
   }

   protected int o(int $$0) {
      return Math.min($$0 + 4, this.ci());
   }

   public int eh() {
      return 0;
   }

   protected boolean ei() {
      return false;
   }

   public ayd ej() {
      return this.ah;
   }

   @Nullable
   public bre ek() {
      return this.cb;
   }

   @Override
   public bre T_() {
      return this.ek();
   }

   public int el() {
      return this.cc;
   }

   public void c(@Nullable ckl $$0) {
      this.bd = $$0;
      this.be = this.ai;
   }

   public void a(@Nullable bre $$0) {
      this.cb = $$0;
      this.cc = this.ai;
   }

   @Nullable
   public bre em() {
      return this.cd;
   }

   public int en() {
      return this.ce;
   }

   public void A(bql $$0) {
      if ($$0 instanceof bre) {
         this.cd = (bre)$$0;
      } else {
         this.cd = null;
      }

      this.ce = this.ai;
   }

   public int eo() {
      return this.bg;
   }

   public void p(int $$0) {
      this.bg = $$0;
   }

   public boolean ep() {
      return this.bZ;
   }

   public void q(boolean $$0) {
      this.bZ = $$0;
   }

   protected boolean a(bqs $$0) {
      return true;
   }

   public void a(bqs $$0, csd $$1, csd $$2) {
      boolean $$3 = $$2.d() && $$1.d();
      if (!$$3 && !csd.c($$1, $$2) && !this.an) {
         crf $$4 = crf.c_($$2);
         if (!this.dN().x_() && !this.N_()) {
            if (!this.aU() && $$4 != null && $$4.k() == $$0) {
               this.dN().a(null, this.ds(), this.du(), this.dy(), $$4.ap_(), this.dc(), 1.0F, 1.0F, this.ah.g());
            }

            if (this.a($$0)) {
               this.a($$4 != null ? dur.v : dur.S);
            }
         }
      }
   }

   @Override
   public void a(bql.c $$0) {
      super.a($$0);
      this.bE.a();
   }

   @Override
   public void b(ty $$0) {
      $$0.a("Health", this.ey());
      $$0.a("HurtTime", (short)this.aP);
      $$0.a("HurtByTimestamp", this.cc);
      $$0.a("DeathTime", (short)this.aR);
      $$0.a("AbsorptionAmount", this.fq());
      $$0.a("Attributes", this.eU().c());
      if (!this.bV.isEmpty()) {
         ue $$1 = new ue();

         for (bpx $$2 : this.bV.values()) {
            $$1.add($$2.j());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fC());
      this.fH().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<uv> $$3 = this.bE.a(um.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(ty $$0) {
      this.B($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dN() != null && !this.dN().B) {
         this.eU().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         ue $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            ty $$3 = $$1.a($$2);
            bpx $$4 = bpx.a($$3);
            if ($$4 != null) {
               this.bV.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.t($$0.j("Health"));
      }

      this.aP = $$0.g("HurtTime");
      this.aR = $$0.g("DeathTime");
      this.cc = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         euj $$6 = this.dN().L();
         eue $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cy(), $$7);
         if (!$$8) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         im $$9 = new im($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$9);
         this.ao.a(at, brp.c);
         if (!this.an) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bE = this.a(new Dynamic(um.a, $$0.c("Brain")));
      }
   }

   protected void eq() {
      Iterator<iv<bpv>> $$0 = this.bV.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            iv<bpv> $$1 = $$0.next();
            bpx $$2 = this.bV.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dN().B) {
                  $$0.remove();
                  this.a($$2);
               }
            } else if ($$2.d() % 600 == 0) {
               this.a($$2, false, null);
            }
         }
      } catch (ConcurrentModificationException var6) {
      }

      if (this.ca) {
         if (!this.dN().B) {
            this.J();
            this.v();
         }

         this.ca = false;
      }

      List<ku> $$3 = this.ao.a(bN);
      if (!$$3.isEmpty()) {
         boolean $$4 = this.ao.a(bO);
         int $$5 = this.cf() ? 15 : 4;
         int $$6 = $$4 ? 5 : 1;
         if (this.ah.a($$5 * $$6) == 0) {
            this.dN().a(ac.a($$3, this.ah), this.d(0.5), this.dv(), this.g(0.5), 1.0, 1.0, 1.0);
         }
      }
   }

   protected void J() {
      if (this.bV.isEmpty()) {
         this.et();
         this.k(false);
      } else {
         this.k(this.b(bpz.n));
         this.r();
      }
   }

   private void r() {
      List<ku> $$0 = this.bV.values().stream().filter(bpx::g).map(bpx::a).toList();
      this.ao.a(bN, $$0);
      this.ao.a(bO, c(this.bV.values()));
   }

   private void v() {
      boolean $$0 = this.ce();
      if (this.j(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable bql $$0) {
      double $$1 = 1.0;
      if (this.bW()) {
         $$1 *= 0.8;
      }

      if (this.cf()) {
         float $$2 = this.fb();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         csd $$3 = this.d(bqs.f);
         bqr<?> $$4 = $$0.ai();
         if ($$4 == bqr.aM && $$3.a(csg.ul)
            || $$4 == bqr.bt && $$3.a(csg.uo)
            || $$4 == bqr.az && $$3.a(csg.ur)
            || $$4 == bqr.aA && $$3.a(csg.ur)
            || $$4 == bqr.x && $$3.a(csg.up)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bre $$0) {
      return $$0 instanceof ckl && this.dN().ak() == bon.a ? false : $$0.er();
   }

   public boolean a(bre $$0, cbu $$1) {
      return $$1.a(this, $$0);
   }

   public boolean er() {
      return !this.cs() && this.es();
   }

   public boolean es() {
      return !this.N_() && this.bB();
   }

   public static boolean c(Collection<bpx> $$0) {
      for (bpx $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void et() {
      this.ao.a(bN, List.of());
   }

   public boolean eu() {
      if (this.dN().B) {
         return false;
      } else {
         Iterator<bpx> $$0 = this.bV.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<bpx> ev() {
      return this.bV.values();
   }

   public Map<iv<bpv>, bpx> ew() {
      return this.bV;
   }

   public boolean b(iv<bpv> $$0) {
      return this.bV.containsKey($$0);
   }

   @Nullable
   public bpx c(iv<bpv> $$0) {
      return this.bV.get($$0);
   }

   public final boolean b(bpx $$0) {
      return this.b($$0, null);
   }

   public boolean b(bpx $$0, @Nullable bql $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         bpx $$2 = this.bV.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bV.put($$0.c(), $$0);
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

   public boolean c(bpx $$0) {
      return !this.ai().a(avr.w) ? true : !$$0.a(bpz.j) && !$$0.a(bpz.s);
   }

   public void c(bpx $$0, @Nullable bql $$1) {
      if (this.c($$0)) {
         bpx $$2 = this.bV.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean ex() {
      return this.ai().a(avr.x);
   }

   @Nullable
   public bpx d(iv<bpv> $$0) {
      return this.bV.remove($$0);
   }

   public boolean e(iv<bpv> $$0) {
      bpx $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(bpx $$0, @Nullable bql $$1) {
      this.ca = true;
      if (!this.dN().B) {
         $$0.c().a().a(this.eU(), $$0.e());
         this.d($$0);
      }
   }

   public void d(bpx $$0) {
      for (bql $$1 : this.cQ()) {
         if ($$1 instanceof aqf $$2) {
            $$2.d.b(new afq(this.aj(), $$0, false));
         }
      }
   }

   protected void a(bpx $$0, boolean $$1, @Nullable bql $$2) {
      this.ca = true;
      if ($$1 && !this.dN().B) {
         bpv $$3 = $$0.c().a();
         $$3.a(this.eU());
         $$3.a(this.eU(), $$0.e());
         this.z();
      }

      if (!this.dN().B) {
         this.d($$0);
      }
   }

   protected void a(bpx $$0) {
      this.ca = true;
      if (!this.dN().B) {
         $$0.c().a().a(this.eU());
         this.z();

         for (bql $$1 : this.cQ()) {
            if ($$1 instanceof aqf $$2) {
               $$2.d.b(new adv(this.aj(), $$0.c()));
            }
         }
      }
   }

   private void z() {
      for (bsh $$0 : this.eU().a()) {
         this.i($$0.a());
      }
   }

   private void i(iv<bsg> $$0) {
      if ($$0.a(bsl.q)) {
         float $$1 = this.eP();
         if (this.ey() > $$1) {
            this.t($$1);
         }
      } else if ($$0.a(bsl.p)) {
         float $$2 = this.eQ();
         if (this.fq() > $$2) {
            this.A($$2);
         }
      }
   }

   public void c(float $$0) {
      float $$1 = this.ey();
      if ($$1 > 0.0F) {
         this.t($$1 + $$0);
      }
   }

   public float ey() {
      return this.ao.a(bM);
   }

   public void t(float $$0) {
      this.ao.a(bM, axw.a($$0, 0.0F, this.eP()));
   }

   public boolean ez() {
      return this.ey() <= 0.0F;
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dN().B) {
         return false;
      } else if (this.ez()) {
         return false;
      } else if ($$0.a(avq.j) && this.b(bpz.l)) {
         return false;
      } else {
         if (this.fJ() && !this.dN().B) {
            this.fK();
         }

         this.bg = 0;
         float $$2 = $$1;
         boolean $$3 = false;
         float $$4 = 0.0F;
         if ($$1 > 0.0F && this.f($$0)) {
            this.v($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.a(avq.k) && $$0.c() instanceof bre $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(avq.p) && this.ai().a(avr.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(avq.a) && !this.d(bqs.f).d()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.aV.a(1.5F);
         boolean $$7 = true;
         if ((float)this.am > 10.0F && !$$0.a(avq.f)) {
            if ($$1 <= this.bn) {
               return false;
            }

            this.f($$0, $$1 - this.bn);
            this.bn = $$1;
            $$7 = false;
         } else {
            this.bn = $$1;
            this.am = 20;
            this.f($$0, $$1);
            this.aQ = 10;
            this.aP = this.aQ;
         }

         bql $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof bre $$9 && !$$0.a(avq.r) && (!$$0.a(bpm.G) || !this.ai().a(avr.D))) {
               this.a($$9);
            }

            if ($$8 instanceof ckl $$10) {
               this.be = 100;
               this.bd = $$10;
            } else if ($$8 instanceof cdw $$11 && $$11.r()) {
               this.be = 100;
               if ($$11.P_() instanceof ckl $$12) {
                  this.bd = $$12;
               } else {
                  this.bd = null;
               }
            }
         }

         if ($$7) {
            if ($$3) {
               this.dN().a(this, (byte)29);
            } else {
               this.dN().a(this, $$0);
            }

            if (!$$0.a(avq.s) && (!$$3 || $$1 > 0.0F)) {
               this.bt();
            }

            if ($$8 != null && !$$0.a(avq.A)) {
               double $$13 = $$8.ds() - this.ds();

               double $$14;
               for ($$14 = $$8.dy() - this.dy(); $$13 * $$13 + $$14 * $$14 < 1.0E-4; $$14 = (Math.random() - Math.random()) * 0.01) {
                  $$13 = (Math.random() - Math.random()) * 0.01;
               }

               this.q(0.4F, $$13, $$14);
               if (!$$3) {
                  this.a($$13, $$14);
               }
            }
         }

         if (this.ez()) {
            if (!this.h($$0)) {
               if ($$7) {
                  this.b(this.o_());
               }

               this.a($$0);
            }
         } else if ($$7) {
            this.e($$0);
         }

         boolean $$15 = !$$3 || $$1 > 0.0F;
         if ($$15) {
            this.ck = $$0;
            this.cl = this.dN().Y();
         }

         if (this instanceof aqf) {
            am.i.a((aqf)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((aqf)this).a(avj.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof aqf) {
            am.h.a((aqf)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$15;
      }
   }

   protected void d(bre $$0) {
      $$0.e(this);
   }

   protected void e(bre $$0) {
      $$0.q(0.5, $$0.ds() - this.ds(), $$0.dy() - this.dy());
   }

   private boolean h(bpj $$0) {
      if ($$0.a(avq.e)) {
         return false;
      } else {
         csd $$1 = null;

         for (bop $$2 : bop.values()) {
            csd $$3 = this.b($$2);
            if ($$3.a(csg.vt)) {
               $$1 = $$3.r();
               $$3.g(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof aqf $$4) {
               $$4.b(avj.c.b(csg.vt));
               am.C.a($$4, $$1);
               this.a(dur.C);
            }

            this.t(1.0F);
            this.eu();
            this.b(new bpx(bpz.j, 900, 1));
            this.b(new bpx(bpz.v, 100, 1));
            this.b(new bpx(bpz.l, 800, 0));
            this.dN().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bpj eA() {
      if (this.dN().Y() - this.cl > 40L) {
         this.ck = null;
      }

      return this.ck;
   }

   protected void e(bpj $$0) {
      this.b(this.d($$0));
   }

   public void b(@Nullable auy $$0) {
      if ($$0 != null) {
         this.a($$0, this.fc(), this.fd());
      }
   }

   public boolean f(bpj $$0) {
      bql $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof ckr $$3 && $$3.D() > 0) {
         $$2 = true;
      }

      if (!$$0.a(avq.d) && this.fA() && !$$2) {
         etf $$4 = $$0.h();
         if ($$4 != null) {
            etf $$5 = this.b(0.0F, this.cq());
            etf $$6 = $$4.a(this.dl());
            $$6 = new etf($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(csd $$0) {
      if (!$$0.d()) {
         if (!this.aU()) {
            this.dN().a(this.ds(), this.du(), this.dy(), $$0.K(), this.dc(), 0.8F, 0.8F + this.dN().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bpj $$0) {
      if (!this.dI() && !this.bf) {
         bql $$1 = $$0.d();
         bre $$2 = this.eO();
         if (this.bm >= 0 && $$2 != null) {
            $$2.a(this, this.bm, $$0);
         }

         if (this.fJ()) {
            this.fK();
         }

         if (!this.dN().B && this.ae()) {
            b.info("Named entity {} died: {}", this, this.eN().a().getString());
         }

         this.bf = true;
         this.eN().c();
         if (this.dN() instanceof aqe $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(dur.p);
               this.g($$0);
               this.f($$2);
            }

            this.dN().a(this, (byte)3);
         }

         this.b(brp.h);
      }
   }

   protected void f(@Nullable bre $$0) {
      if (!this.dN().B) {
         boolean $$1 = false;
         if ($$0 instanceof cgj) {
            if (this.dN().aa().b(czq.c)) {
               im $$2 = this.dn();
               dpy $$3 = dcx.cd.n();
               if (this.dN().a_($$2).i() && $$3.a((czx)this.dN(), $$2)) {
                  this.dN().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               cgv $$4 = new cgv(this.dN(), this.ds(), this.du(), this.dy(), new csd(csg.dw));
               this.dN().b($$4);
            }
         }
      }
   }

   protected void g(bpj $$0) {
      bql $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof ckl) {
         $$2 = cxo.h((bre)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.be > 0;
      if (this.eg() && this.dN().aa().b(czq.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.eB();
      this.eC();
   }

   protected void eB() {
   }

   protected void eC() {
      if (this.dN() instanceof aqe && !this.eG() && (this.ei() || this.be > 0 && this.ef() && this.dN().aa().b(czq.f))) {
         bqu.a((aqe)this.dN(), this.dl(), this.eh());
      }
   }

   protected void a(bpj $$0, int $$1, boolean $$2) {
   }

   public akf eD() {
      return this.ai().j();
   }

   public long eE() {
      return 0L;
   }

   protected void a(bpj $$0, boolean $$1) {
      akf $$2 = this.eD();
      eoi $$3 = this.dN().o().aM().getLootTable($$2);
      eog.a $$4 = new eog.a((aqe)this.dN()).a(eqt.a, this).a(eqt.f, this.dl()).a(eqt.c, $$0).b(eqt.d, $$0.d()).b(eqt.e, $$0.c());
      if ($$1 && this.bd != null) {
         $$4 = $$4.a(eqt.b, this.bd).a(this.bd.gw());
      }

      eog $$5 = $$4.a(eqs.g);
      $$3.a($$5, this.eE(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.g(bsl.n);
      if (!($$0 <= 0.0)) {
         this.av = true;
         etf $$3 = this.dq();
         etf $$4 = new etf($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aC() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected auy d(bpj $$0) {
      return auz.kb;
   }

   @Nullable
   protected auy o_() {
      return auz.jW;
   }

   private auy d(int $$0) {
      return $$0 > 4 ? this.eJ().b() : this.eJ().a();
   }

   public void eF() {
      this.co = true;
   }

   public boolean eG() {
      return this.co;
   }

   public float eH() {
      return 0.0F;
   }

   protected eta eI() {
      eta $$0 = this.cI();
      bql $$1 = this.da();
      if ($$1 != null) {
         etf $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public bre.a eJ() {
      return new bre.a(auz.kc, auz.jU);
   }

   protected auy c(csd $$0) {
      return $$0.I();
   }

   public auy d(csd $$0) {
      return $$0.J();
   }

   public Optional<im> eK() {
      return this.cj;
   }

   public boolean q_() {
      if (this.N_()) {
         return false;
      } else {
         im $$0 = this.dn();
         dpy $$1 = this.do();
         if ($$1.a(avo.aP)) {
            this.cj = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dli && this.c($$0, $$1)) {
            this.cj = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(im $$0, dpy $$1) {
      if ($$1.c(dli.b)) {
         dpy $$2 = this.dN().a_($$0.d());
         if ($$2.a(dcx.cO) && $$2.c(dhb.b) == $$1.c(dli.aE)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean bB() {
      return !this.dI() && this.ey() > 0.0F;
   }

   @Override
   public int cv() {
      return this.u(0.0F);
   }

   protected final int u(float $$0) {
      return axw.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bpj $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.d($$0, $$1);
      if ($$4 > 0) {
         this.a(this.d($$4), 1.0F, 1.0F);
         this.eL();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int d(float $$0, float $$1) {
      if (this.ai().a(avr.o)) {
         return 0;
      } else {
         float $$2 = (float)this.g(bsl.s);
         float $$3 = $$0 - $$2;
         return axw.c((double)($$3 * $$1) * this.g(bsl.i));
      }
   }

   protected void eL() {
      if (!this.aU()) {
         int $$0 = axw.a(this.ds());
         int $$1 = axw.a(this.du() - 0.2F);
         int $$2 = axw.a(this.dy());
         dpy $$3 = this.dN().a_(new im($$0, $$1, $$2));
         if (!$$3.i()) {
            dki $$4 = $$3.w();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void m(float $$0) {
      this.aQ = 10;
      this.aP = this.aQ;
   }

   public int eM() {
      return axw.a(this.g(bsl.a));
   }

   protected void b(bpj $$0, float $$1) {
   }

   protected void c(bpj $$0, float $$1) {
   }

   protected void v(float $$0) {
   }

   protected void a(bpj $$0, float $$1, bqs... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bqs $$4 : $$2) {
            csd $$5 = this.d($$4);
            if ((!$$0.a(avq.j) || !$$5.f().A()) && $$5.f() instanceof cps) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float d(bpj $$0, float $$1) {
      if (!$$0.a(avq.c)) {
         this.b($$0, $$1);
         $$1 = bpf.a($$1, (float)this.eM(), (float)this.g(bsl.b));
      }

      return $$1;
   }

   protected float e(bpj $$0, float $$1) {
      if ($$0.a(avq.g)) {
         return $$1;
      } else {
         if (this.b(bpz.k) && !$$0.a(avq.h)) {
            int $$2 = (this.c(bpz.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof aqf) {
                  ((aqf)this).a(avj.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof aqf) {
                  ((aqf)$$0.d()).a(avj.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(avq.i)) {
            return $$1;
         } else {
            int $$7 = cxo.a(this.eZ(), $$0);
            if ($$7 > 0) {
               $$1 = bpf.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bpj $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fq(), 0.0F);
         this.A(this.fq() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof aqf $$4) {
            $$4.a(avj.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eN().a($$0, var9);
            this.t(this.ey() - var9);
            this.A(this.fq() - var9);
            this.a(dur.o);
         }
      }
   }

   public bpg eN() {
      return this.bU;
   }

   @Nullable
   public bre eO() {
      if (this.bd != null) {
         return this.bd;
      } else {
         return this.cb != null ? this.cb : null;
      }
   }

   public final float eP() {
      return (float)this.g(bsl.q);
   }

   public final float eQ() {
      return (float)this.g(bsl.p);
   }

   public final int eR() {
      return this.ao.a(bP);
   }

   public final void q(int $$0) {
      this.ao.a(bP, $$0);
   }

   public final int eS() {
      return this.ao.a(bQ);
   }

   public final void r(int $$0) {
      this.ao.a(bQ, $$0);
   }

   private int A() {
      if (bpy.a(this)) {
         return 6 - (1 + bpy.b(this));
      } else {
         return this.b(bpz.d) ? 6 + (1 + this.c(bpz.d).e()) * 2 : 6;
      }
   }

   public void a(bop $$0) {
      this.a($$0, false);
   }

   public void a(bop $$0, boolean $$1) {
      if (!this.aK || this.aM >= this.A() / 2 || this.aM < 0) {
         this.aM = -1;
         this.aK = true;
         this.aL = $$0;
         if (this.dN() instanceof aqe) {
            abn $$2 = new abn(this, $$0 == bop.a ? 0 : 3);
            aqc $$3 = ((aqe)this.dN()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bpj $$0) {
      this.aV.a(1.5F);
      this.am = 20;
      this.aQ = 10;
      this.aP = this.aQ;
      auy $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.fc(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
      }

      this.a(this.dO().n(), 0.0F);
      this.ck = $$0;
      this.cl = this.dN().Y();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            auy $$1 = this.o_();
            if ($$1 != null) {
               this.a($$1, this.fc(), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof ckl)) {
               this.t(0.0F);
               this.a(this.dO().n());
            }
            break;
         case 29:
            this.a(auz.wo, 1.0F, 0.8F + this.dN().z.i() * 0.4F);
            break;
         case 30:
            this.a(auz.wp, 0.8F, 0.8F + this.dN().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ah.i() - 0.5F) * 0.2F;
               float $$6 = (this.ah.i() - 0.5F) * 0.2F;
               float $$7 = (this.ah.i() - 0.5F) * 0.2F;
               double $$8 = axw.d($$4, this.L, this.ds()) + (this.ah.j() - 0.5) * (double)this.dh() * 2.0;
               double $$9 = axw.d($$4, this.M, this.du()) + this.ah.j() * (double)this.di();
               double $$10 = axw.d($$4, this.N, this.dy()) + (this.ah.j() - 0.5) * (double)this.dh() * 2.0;
               this.dN().a(kw.Z, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.d(bqs.a));
            break;
         case 48:
            this.i(this.d(bqs.b));
            break;
         case 49:
            this.i(this.d(bqs.f));
            break;
         case 50:
            this.i(this.d(bqs.e));
            break;
         case 51:
            this.i(this.d(bqs.d));
            break;
         case 52:
            this.i(this.d(bqs.c));
            break;
         case 54:
            dgp.b(this);
            break;
         case 55:
            this.C();
            break;
         case 60:
            this.B();
            break;
         case 65:
            this.i(this.d(bqs.g));
            break;
         default:
            super.b($$0);
      }
   }

   private void B() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.ah.k() * 0.02;
         double $$2 = this.ah.k() * 0.02;
         double $$3 = this.ah.k() * 0.02;
         this.dN().a(kw.Y, this.d(1.0), this.dv(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void C() {
      csd $$0 = this.d(bqs.b);
      this.a(bqs.b, this.d(bqs.a));
      this.a(bqs.a, $$0);
   }

   @Override
   protected void aB() {
      this.a(this.dO().m(), 4.0F);
   }

   protected void eT() {
      int $$0 = this.A();
      if (this.aK) {
         this.aM++;
         if (this.aM >= $$0) {
            this.aM = 0;
            this.aK = false;
         }
      } else {
         this.aM = 0;
      }

      this.aT = (float)this.aM / (float)$$0;
   }

   @Nullable
   public bsh f(iv<bsg> $$0) {
      return this.eU().a($$0);
   }

   public double g(iv<bsg> $$0) {
      return this.eU().c($$0);
   }

   public double h(iv<bsg> $$0) {
      return this.eU().d($$0);
   }

   public bsi eU() {
      return this.bT;
   }

   public csd eV() {
      return this.d(bqs.a);
   }

   public csd eW() {
      return this.d(bqs.b);
   }

   public boolean b(cry $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<csd> $$0) {
      return $$0.test(this.eV()) || $$0.test(this.eW());
   }

   public csd b(bop $$0) {
      if ($$0 == bop.a) {
         return this.d(bqs.a);
      } else if ($$0 == bop.b) {
         return this.d(bqs.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bop $$0, csd $$1) {
      if ($$0 == bop.a) {
         this.a(bqs.a, $$1);
      } else {
         if ($$0 != bop.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bqs.b, $$1);
      }
   }

   public boolean b(bqs $$0) {
      return !this.d($$0).d();
   }

   public boolean c(bqs $$0) {
      return false;
   }

   public abstract Iterable<csd> eX();

   public abstract csd d(bqs var1);

   public abstract void a(bqs var1, csd var2);

   public Iterable<csd> eY() {
      return List.of();
   }

   public Iterable<csd> eZ() {
      return this.eX();
   }

   public Iterable<csd> fa() {
      return Iterables.concat(this.eY(), this.eZ());
   }

   protected void e(csd $$0) {
      $$0.f().n($$0);
   }

   public float fb() {
      Iterable<csd> $$0 = this.eX();
      int $$1 = 0;
      int $$2 = 0;

      for (csd $$3 : $$0) {
         if (!$$3.d()) {
            $$2++;
         }

         $$1++;
      }

      return $$1 > 0 ? (float)$$2 / (float)$$1 : 0.0F;
   }

   @Override
   public void h(boolean $$0) {
      super.h($$0);
      bsh $$1 = this.f(bsl.r);
      $$1.b(bG.b());
      if ($$0) {
         $$1.c(bG);
      }
   }

   protected float fc() {
      return 1.0F;
   }

   public float fd() {
      return this.p_() ? (this.ah.i() - this.ah.i()) * 0.2F + 1.5F : (this.ah.i() - this.ah.i()) * 0.2F + 1.0F;
   }

   protected boolean fe() {
      return this.ez();
   }

   @Override
   public void h(bql $$0) {
      if (!this.fJ()) {
         super.h($$0);
      }
   }

   private void b(bql $$0) {
      etf $$1;
      if (this.dI()) {
         $$1 = this.dl();
      } else if (!$$0.dI() && !this.dN().a_($$0.dn()).a(avo.aJ)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.du(), $$0.du());
         $$1 = new etf(this.ds(), $$2, this.dy());
      }

      this.a($$1.c, $$1.d, $$1.e);
   }

   @Override
   public boolean cD() {
      return this.cC();
   }

   protected float ff() {
      return this.w(1.0F);
   }

   protected float w(float $$0) {
      return (float)this.g(bsl.m) * $$0 * this.aK() + this.fg();
   }

   public float fg() {
      return this.b(bpz.h) ? 0.1F * ((float)this.c(bpz.h).e() + 1.0F) : 0.0F;
   }

   protected void fh() {
      etf $$0 = this.dq();
      this.o($$0.c, (double)this.ff(), $$0.e);
      if (this.bZ()) {
         float $$1 = this.dD() * (float) (Math.PI / 180.0);
         this.g(this.dq().b((double)(-axw.a($$1) * 0.2F), 0.0, (double)(axw.b($$1) * 0.2F)));
      }

      this.av = true;
   }

   protected void fi() {
      this.g(this.dq().b(0.0, -0.04F, 0.0));
   }

   protected void c(awd<elq> $$0) {
      this.g(this.dq().b(0.0, 0.04F, 0.0));
   }

   protected float fj() {
      return 0.8F;
   }

   public boolean a(elr $$0) {
      return false;
   }

   @Override
   protected double aW() {
      return this.g(bsl.l);
   }

   public void a(etf $$0) {
      if (this.cY()) {
         double $$1 = this.aX();
         boolean $$2 = this.dq().d <= 0.0;
         if ($$2 && this.b(bpz.B)) {
            $$1 = Math.min($$1, 0.01);
         }

         elr $$3 = this.dN().b_(this.dn());
         if (this.bc() && this.ed() && !this.a($$3)) {
            double $$4 = this.du();
            float $$5 = this.bZ() ? 0.9F : this.fj();
            float $$6 = 0.02F;
            float $$7 = (float)cxo.f(this);
            if ($$7 > 3.0F) {
               $$7 = 3.0F;
            }

            if (!this.aC()) {
               $$7 *= 0.5F;
            }

            if ($$7 > 0.0F) {
               $$5 += (0.54600006F - $$5) * $$7 / 3.0F;
               $$6 += (this.fl() - $$6) * $$7 / 3.0F;
            }

            if (this.b(bpz.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(brj.a, this.dq());
            etf $$8 = this.dq();
            if (this.Q && this.q_()) {
               $$8 = new etf($$8.c, 0.2, $$8.e);
            }

            this.g($$8.d((double)$$5, 0.8F, (double)$$5));
            etf $$9 = this.a($$1, $$2, this.dq());
            this.g($$9);
            if (this.Q && this.g($$9.c, $$9.d + 0.6F - this.du() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bq() && this.ed() && !this.a($$3)) {
            double $$10 = this.du();
            this.a(0.02F, $$0);
            this.a(brj.a, this.dq());
            if (this.b(avt.b) <= this.dg()) {
               this.g(this.dq().d(0.5, 0.8F, 0.5));
               etf $$11 = this.a($$1, $$2, this.dq());
               this.g($$11);
            } else {
               this.g(this.dq().a(0.5));
            }

            if ($$1 != 0.0) {
               this.g(this.dq().b(0.0, -$$1 / 4.0, 0.0));
            }

            etf $$12 = this.dq();
            if (this.Q && this.g($$12.c, $$12.d + 0.6F - this.du() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fC()) {
            this.co();
            etf $$13 = this.dq();
            etf $$14 = this.bJ();
            float $$15 = this.dF() * (float) (Math.PI / 180.0);
            double $$16 = Math.sqrt($$14.c * $$14.c + $$14.e * $$14.e);
            double $$17 = $$13.h();
            double $$18 = $$14.f();
            double $$19 = Math.cos((double)$$15);
            $$19 = $$19 * $$19 * Math.min(1.0, $$18 / 0.4);
            $$13 = this.dq().b(0.0, $$1 * (-1.0 + $$19 * 0.75), 0.0);
            if ($$13.d < 0.0 && $$16 > 0.0) {
               double $$20 = $$13.d * -0.1 * $$19;
               $$13 = $$13.b($$14.c * $$20 / $$16, $$20, $$14.e * $$20 / $$16);
            }

            if ($$15 < 0.0F && $$16 > 0.0) {
               double $$21 = $$17 * (double)(-axw.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.g($$13.d(0.99F, 0.98F, 0.99F));
            this.a(brj.a, this.dq());
            if (this.Q && !this.dN().B) {
               double $$22 = this.dq().h();
               double $$23 = $$17 - $$22;
               float $$24 = (float)($$23 * 10.0 - 3.0);
               if ($$24 > 0.0F) {
                  this.a(this.d((int)$$24), 1.0F, 1.0F);
                  this.a(this.dO().l(), $$24);
               }
            }

            if (this.aC() && !this.dN().B) {
               this.b(7, false);
            }
         } else {
            im $$25 = this.aI();
            float $$26 = this.dN().a_($$25).b().h();
            float $$27 = this.aC() ? $$26 * 0.91F : 0.91F;
            etf $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.b(bpz.y)) {
               $$29 += (0.05 * (double)(this.c(bpz.y).e() + 1) - $$28.d) * 0.2;
            } else if (!this.dN().B || this.dN().B($$25)) {
               $$29 -= $$1;
            } else if (this.du() > (double)this.dN().I_()) {
               $$29 = -0.1;
            } else {
               $$29 = 0.0;
            }

            if (this.ep()) {
               this.o($$28.c, $$29, $$28.e);
            } else {
               this.o($$28.c * (double)$$27, this instanceof cdc ? $$29 * (double)$$27 : $$29 * 0.98F, $$28.e * (double)$$27);
            }
         }
      }

      this.r(this instanceof cdc);
   }

   private void c(ckl $$0, etf $$1) {
      etf $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.cY()) {
         this.y(this.e($$0));
         this.a($$2);
      } else {
         this.r(false);
         this.g(etf.b);
         this.aD();
      }
   }

   protected void a(ckl $$0, etf $$1) {
   }

   protected etf b(ckl $$0, etf $$1) {
      return $$1;
   }

   protected float e(ckl $$0) {
      return this.fl();
   }

   public void r(boolean $$0) {
      float $$1 = (float)axw.g(this.ds() - this.L, $$0 ? this.du() - this.M : 0.0, this.dy() - this.N);
      this.x($$1);
   }

   protected void x(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aV.a($$1, 0.4F);
   }

   public etf a(etf $$0, float $$1) {
      this.a(this.C($$1), $$0);
      this.g(this.j(this.dq()));
      this.a(brj.a, this.dq());
      etf $$2 = this.dq();
      if ((this.Q || this.bo) && (this.q_() || this.do().a(dcx.qP) && dip.a(this))) {
         $$2 = new etf($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public etf a(double $$0, boolean $$1, etf $$2) {
      if ($$0 != 0.0 && !this.bZ()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new etf($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private etf j(etf $$0) {
      if (this.q_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = axw.a($$0.c, -0.15F, 0.15F);
         double $$3 = axw.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.do().a(dcx.nS) && this.fB() && this instanceof ckl) {
            $$4 = 0.0;
         }

         $$0 = new etf($$2, $$4, $$3);
      }

      return $$0;
   }

   private float C(float $$0) {
      return this.aC() ? this.fl() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fk();
   }

   protected float fk() {
      return this.cO() instanceof ckl ? this.fl() * 0.1F : 0.02F;
   }

   public float fl() {
      return this.cf;
   }

   public void y(float $$0) {
      this.cf = $$0;
   }

   public boolean C(bql $$0) {
      this.A($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.H();
      this.K();
      if (!this.dN().B) {
         int $$0 = this.eR();
         if ($$0 > 0) {
            if (this.aN <= 0) {
               this.aN = 20 * (30 - $$0);
            }

            this.aN--;
            if (this.aN <= 0) {
               this.q($$0 - 1);
            }
         }

         int $$1 = this.eS();
         if ($$1 > 0) {
            if (this.aO <= 0) {
               this.aO = 20 * (30 - $$1);
            }

            this.aO--;
            if (this.aO <= 0) {
               this.r($$1 - 1);
            }
         }

         this.D();
         if (this.ai % 20 == 0) {
            this.eN().c();
         }

         if (this.fJ() && !this.M()) {
            this.fK();
         }
      }

      if (!this.dI()) {
         this.n_();
      }

      double $$2 = this.ds() - this.L;
      double $$3 = this.dy() - this.N;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aZ;
      float $$6 = 0.0F;
      this.bh = this.bi;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)axw.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = axw.e(axw.g(this.dD()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aT > 0.0F) {
         $$5 = this.dD();
      }

      if (!this.aC()) {
         $$7 = 0.0F;
      }

      this.bi = this.bi + ($$7 - this.bi) * 0.3F;
      this.dN().af().a("headTurn");
      $$6 = this.e($$5, $$6);
      this.dN().af().c();
      this.dN().af().a("rangeChecks");

      while (this.dD() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dD() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aZ - this.ba < -180.0F) {
         this.ba -= 360.0F;
      }

      while (this.aZ - this.ba >= 180.0F) {
         this.ba += 360.0F;
      }

      while (this.dF() - this.P < -180.0F) {
         this.P -= 360.0F;
      }

      while (this.dF() - this.P >= 180.0F) {
         this.P += 360.0F;
      }

      while (this.bb - this.bc < -180.0F) {
         this.bc -= 360.0F;
      }

      while (this.bb - this.bc >= 180.0F) {
         this.bc += 360.0F;
      }

      this.dN().af().c();
      this.bj += $$6;
      if (this.fC()) {
         this.bC++;
      } else {
         this.bC = 0;
      }

      if (this.fJ()) {
         this.s(0.0F);
      }

      this.z();
      float $$10 = this.ec();
      if ($$10 != this.bF) {
         this.bF = $$10;
         this.j_();
      }
   }

   private void D() {
      Map<bqs, csd> $$0 = this.E();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bqs, csd> E() {
      Map<bqs, csd> $$0 = null;

      for (bqs $$1 : bqs.values()) {
         csd $$2 = switch ($$1.a()) {
            case a -> this.g($$1);
            case b -> this.f($$1);
            case c -> this.bY;
         };
         csd $$3 = this.d($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bqs.class);
            }

            $$0.put($$1, $$3);
            bsi $$4 = this.eU();
            if (!$$2.d()) {
               $$2.a($$1, ($$1x, $$2x) -> {
                  bsh $$3x = $$4.a($$1x);
                  if ($$3x != null) {
                     $$3x.e($$2x);
                  }
               });
            }

            if (!$$3.d()) {
               $$3.a($$1, ($$1x, $$2x) -> {
                  bsh $$3x = $$4.a($$1x);
                  if ($$3x != null) {
                     $$3x.b($$2x.b());
                     $$3x.c($$2x);
                  }
               });
            }
         }
      }

      return $$0;
   }

   public boolean a(csd $$0, csd $$1) {
      return !csd.a($$1, $$0);
   }

   private void a(Map<bqs, csd> $$0) {
      csd $$1 = $$0.get(bqs.a);
      csd $$2 = $$0.get(bqs.b);
      if ($$1 != null && $$2 != null && csd.a($$1, this.g(bqs.b)) && csd.a($$2, this.g(bqs.a))) {
         ((aqe)this.dN()).l().b(this, new aco(this, (byte)55));
         $$0.remove(bqs.a);
         $$0.remove(bqs.b);
         this.c(bqs.a, $$1.r());
         this.c(bqs.b, $$2.r());
      }
   }

   private void b(Map<bqs, csd> $$0) {
      List<Pair<bqs, csd>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         csd $$3 = $$2.r();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
               break;
            case c:
               this.bY = $$3;
         }
      });
      ((aqe)this.dN()).l().b(this, new aer(this.aj(), $$1));
   }

   private csd f(bqs $$0) {
      return this.bX.get($$0.b());
   }

   private void b(bqs $$0, csd $$1) {
      this.bX.set($$0.b(), $$1);
   }

   private csd g(bqs $$0) {
      return this.bW.get($$0.b());
   }

   private void c(bqs $$0, csd $$1) {
      this.bW.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = axw.g($$0 - this.aZ);
      this.aZ += $$2 * 0.3F;
      float $$3 = axw.g(this.dD() - this.aZ);
      float $$4 = this.fm();
      if (Math.abs($$3) > $$4) {
         this.aZ = this.aZ + ($$3 - (float)axw.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float fm() {
      return 50.0F;
   }

   public void n_() {
      if (this.cg > 0) {
         this.cg--;
      }

      if (this.cY()) {
         this.bs = 0;
         this.f(this.ds(), this.du(), this.dy());
      }

      if (this.bs > 0) {
         this.a(this.bs, this.bt, this.bu, this.bv, this.bw, this.bx);
         this.bs--;
      } else if (!this.cZ()) {
         this.g(this.dq().a(0.98));
      }

      if (this.bz > 0) {
         this.a(this.bz, this.by);
         this.bz--;
      }

      etf $$0 = this.dq();
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
      this.dN().af().a("ai");
      if (this.fe()) {
         this.bo = false;
         this.bp = 0.0F;
         this.br = 0.0F;
      } else if (this.cZ()) {
         this.dN().af().a("newAi");
         this.fo();
         this.dN().af().c();
      }

      this.dN().af().c();
      this.dN().af().a("jump");
      if (this.bo && this.ed()) {
         double $$4;
         if (this.bq()) {
            $$4 = this.b(avt.b);
         } else {
            $$4 = this.b(avt.a);
         }

         boolean $$6 = this.bc() && $$4 > 0.0;
         double $$7 = this.dg();
         if (!$$6 || this.aC() && !($$4 > $$7)) {
            if (!this.bq() || this.aC() && !($$4 > $$7)) {
               if ((this.aC() || $$6 && $$4 <= $$7) && this.cg == 0) {
                  this.fh();
                  this.cg = 10;
               }
            } else {
               this.c(avt.b);
            }
         } else {
            this.c(avt.a);
         }
      } else {
         this.cg = 0;
      }

      this.dN().af().c();
      this.dN().af().a("travel");
      this.bp *= 0.98F;
      this.br *= 0.98F;
      this.G();
      eta $$8 = this.cI();
      etf $$9 = new etf((double)this.bp, (double)this.bq, (double)this.br);
      if (this.b(bpz.B) || this.b(bpz.y)) {
         this.n();
      }

      label104: {
         if (this.cO() instanceof ckl $$10 && this.bB()) {
            this.c($$10, $$9);
            break label104;
         }

         this.a($$9);
      }

      this.dN().af().c();
      this.dN().af().a("freezing");
      if (!this.dN().B && !this.ez()) {
         int $$11 = this.ck();
         if (this.aB && this.dB()) {
            this.l(Math.min(this.cn(), $$11 + 1));
         } else {
            this.l(Math.max(0, $$11 - 2));
         }
      }

      this.dZ();
      this.ea();
      if (!this.dN().B && this.ai % 40 == 0 && this.cm() && this.dB()) {
         this.a(this.dO().t(), 1.0F);
      }

      this.dN().af().c();
      this.dN().af().a("push");
      if (this.bD > 0) {
         this.bD--;
         this.a($$8, this.cI());
      }

      this.q();
      this.dN().af().c();
      if (!this.dN().B && this.fn() && this.be()) {
         this.a(this.dO().h(), 1.0F);
      }
   }

   public boolean fn() {
      return false;
   }

   private void G() {
      boolean $$0 = this.j(7);
      if ($$0 && !this.aC() && !this.bP() && !this.b(bpz.y)) {
         csd $$1 = this.d(bqs.e);
         if ($$1.a(csg.nT) && cqz.j($$1)) {
            $$0 = true;
            int $$2 = this.bC + 1;
            if (!this.dN().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, bqs.e);
               }

               this.a(dur.n);
            }
         } else {
            $$0 = false;
         }
      } else {
         $$0 = false;
      }

      if (!this.dN().B) {
         this.b(7, $$0);
      }
   }

   protected void fo() {
   }

   protected void q() {
      if (this.dN().x_()) {
         this.dN().a(duf.a(ckl.class), this.cI(), bqq.a(this)).forEach(this::D);
      } else {
         List<bql> $$0 = this.dN().a(this, this.cI(), bqq.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dN().aa().c(czq.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ah.a(4) == 0) {
               int $$2 = 0;

               for (bql $$3 : $$0) {
                  if (!$$3.bP()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dO().g(), 6.0F);
               }
            }

            for (bql $$4 : $$0) {
               this.D($$4);
            }
         }
      }
   }

   protected void a(eta $$0, eta $$1) {
      eta $$2 = $$0.b($$1);
      List<bql> $$3 = this.dN().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bql $$4 : $$3) {
            if ($$4 instanceof bre) {
               this.g((bre)$$4);
               this.bD = 0;
               this.g(this.dq().a(-0.2));
               break;
            }
         }
      } else if (this.Q) {
         this.bD = 0;
      }

      if (!this.dN().B && this.bD <= 0) {
         this.c(4, false);
      }
   }

   protected void D(bql $$0) {
      $$0.h(this);
   }

   protected void g(bre $$0) {
   }

   public boolean fp() {
      return (this.ao.a(aG) & 4) != 0;
   }

   @Override
   public void ac() {
      bql $$0 = this.da();
      super.ac();
      if ($$0 != null && $$0 != this.da() && !this.dN().B) {
         this.b($$0);
      }
   }

   @Override
   public void t() {
      super.t();
      this.bh = this.bi;
      this.bi = 0.0F;
      this.n();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.bt = $$0;
      this.bu = $$1;
      this.bv = $$2;
      this.bw = (double)$$3;
      this.bx = (double)$$4;
      this.bs = $$5;
   }

   @Override
   public double c_() {
      return this.bs > 0 ? this.bt : this.ds();
   }

   @Override
   public double d_() {
      return this.bs > 0 ? this.bu : this.du();
   }

   @Override
   public double L_() {
      return this.bs > 0 ? this.bv : this.dy();
   }

   @Override
   public float M_() {
      return this.bs > 0 ? (float)this.bx : this.dF();
   }

   @Override
   public float e_() {
      return this.bs > 0 ? (float)this.bw : this.dD();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.by = (double)$$0;
      this.bz = $$1;
   }

   public void s(boolean $$0) {
      this.bo = $$0;
   }

   public void a(cgv $$0) {
      bql $$1 = $$0.u();
      if ($$1 instanceof aqf) {
         am.R.a((aqf)$$1, $$0.p(), this);
      }
   }

   public void a(bql $$0, int $$1) {
      if (!$$0.dI() && !this.dN().B && ($$0 instanceof cgv || $$0 instanceof ckr || $$0 instanceof bqu)) {
         ((aqe)this.dN()).l().b($$0, new afk($$0.aj(), this.aj(), $$1));
      }
   }

   public boolean E(bql $$0) {
      if ($$0.dN() != this.dN()) {
         return false;
      } else {
         etf $$1 = new etf(this.ds(), this.dw(), this.dy());
         etf $$2 = new etf($$0.ds(), $$0.dw(), $$0.dy());
         return $$2.f($$1) > 128.0 ? false : this.dN().a(new czd($$1, $$2, czd.a.a, czd.b.a, this)).c() == etd.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.bb : axw.i($$0, this.bc, this.bb);
   }

   public float z(float $$0) {
      float $$1 = this.aT - this.aS;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aS + $$1 * $$0;
   }

   @Override
   public boolean bx() {
      return !this.dI();
   }

   @Override
   public boolean by() {
      return this.bB() && !this.N_() && !this.q_();
   }

   @Override
   public float cq() {
      return this.bb;
   }

   @Override
   public void n(float $$0) {
      this.bb = $$0;
   }

   @Override
   public void o(float $$0) {
      this.aZ = $$0;
   }

   @Override
   protected etf a(ir.a $$0, l.a $$1) {
      return i(super.a($$0, $$1));
   }

   public static etf i(etf $$0) {
      return new etf($$0.c, $$0.d, 0.0);
   }

   public float fq() {
      return this.ch;
   }

   public final void A(float $$0) {
      this.B(axw.a($$0, 0.0F, this.eQ()));
   }

   protected void B(float $$0) {
      this.ch = $$0;
   }

   public void f_() {
   }

   public void g_() {
   }

   protected void fr() {
      this.ca = true;
   }

   public abstract bqy fs();

   public boolean ft() {
      return (this.ao.a(aG) & 1) > 0;
   }

   public bop fu() {
      return (this.ao.a(aG) & 2) > 0 ? bop.b : bop.a;
   }

   private void H() {
      if (this.ft()) {
         if (csd.b(this.b(this.fu()), this.bA)) {
            this.bA = this.b(this.fu());
            this.a(this.bA);
         } else {
            this.fz();
         }
      }
   }

   protected void a(csd $$0) {
      $$0.b(this.dN(), this, this.fw());
      if (this.I()) {
         this.b($$0, 5);
      }

      if (--this.bB == 0 && !this.dN().B && !$$0.v()) {
         this.x();
      }
   }

   private boolean I() {
      int $$0 = this.fw();
      cne $$1 = this.bA.f().z();
      boolean $$2 = $$1 != null && $$1.e();
      $$2 |= $$0 <= this.bA.t() - 7;
      return $$2 && $$0 % 4 == 0;
   }

   private void K() {
      this.cn = this.cm;
      if (this.cb()) {
         this.cm = Math.min(1.0F, this.cm + 0.09F);
      } else {
         this.cm = Math.max(0.0F, this.cm - 0.09F);
      }
   }

   protected void c(int $$0, boolean $$1) {
      int $$2 = this.ao.a(aG);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.ao.a(aG, (byte)$$2);
   }

   public void c(bop $$0) {
      csd $$1 = this.b($$0);
      if (!$$1.d() && !this.ft()) {
         this.bA = $$1;
         this.bB = $$1.t();
         if (!this.dN().B) {
            this.c(1, true);
            this.c(2, $$0 == bop.b);
            this.a(dur.D);
         }
      }
   }

   @Override
   public void a(ajk<?> $$0) {
      super.a($$0);
      if (bR.equals($$0)) {
         if (this.dN().B) {
            this.fH().ifPresent(this::a);
         }
      } else if (aG.equals($$0) && this.dN().B) {
         if (this.ft() && this.bA.d()) {
            this.bA = this.b(this.fu());
            if (!this.bA.d()) {
               this.bB = this.bA.t();
            }
         } else if (!this.ft() && !this.bA.d()) {
            this.bA = csd.i;
            this.bB = 0;
         }
      }
   }

   @Override
   public void a(eo.a $$0, etf $$1) {
      super.a($$0, $$1);
      this.bc = this.bb;
      this.aZ = this.bb;
      this.ba = this.aZ;
   }

   protected void b(csd $$0, int $$1) {
      if (!$$0.d() && this.ft()) {
         if ($$0.u() == ctw.c) {
            this.a(this.c($$0), 0.5F, this.dN().z.i() * 0.1F + 0.9F);
         }

         if ($$0.u() == ctw.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ah.a(2), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(csd $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         etf $$3 = new etf(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dF() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dD() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ah.i()) * 0.6 - 0.3;
         etf $$5 = new etf(((double)this.ah.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dF() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dD() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.ds(), this.dw(), this.dy());
         this.dN().a(new ks(kw.Q, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   @Override
   protected void x() {
      if (!this.dN().B || this.ft()) {
         bop $$0 = this.fu();
         if (!this.bA.equals(this.b($$0))) {
            this.fy();
         } else {
            if (!this.bA.d() && this.ft()) {
               this.b(this.bA, 16);
               csd $$1 = this.bA.a(this.dN(), this);
               if ($$1 != this.bA) {
                  this.a($$0, $$1);
               }

               this.fz();
            }
         }
      }
   }

   public csd fv() {
      return this.bA;
   }

   public int fw() {
      return this.bB;
   }

   public int fx() {
      return this.ft() ? this.bA.t() - this.fw() : 0;
   }

   public void fy() {
      if (!this.bA.d()) {
         this.bA.a(this.dN(), this, this.fw());
         if (this.bA.v()) {
            this.H();
         }
      }

      this.fz();
   }

   public void fz() {
      if (!this.dN().B) {
         boolean $$0 = this.ft();
         this.c(1, false);
         if ($$0) {
            this.a(dur.C);
         }
      }

      this.bA = csd.i;
      this.bB = 0;
   }

   public boolean fA() {
      if (this.ft() && !this.bA.d()) {
         cry $$0 = this.bA.f();
         return $$0.c(this.bA) != ctw.d ? false : $$0.b(this.bA) - this.bB >= 5;
      } else {
         return false;
      }
   }

   public boolean fB() {
      return this.bT();
   }

   public boolean fC() {
      return this.j(7);
   }

   @Override
   public boolean cb() {
      return super.cb() || !this.fC() && this.c(brp.b);
   }

   public int fD() {
      return this.bC;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.ds();
      double $$5 = this.du();
      double $$6 = this.dy();
      double $$7 = $$1;
      boolean $$8 = false;
      im $$9 = im.a($$0, $$1, $$2);
      czu $$10 = this.dN();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.I_()) {
            im $$12 = $$9.d();
            dpy $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.c($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cI())) {
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

         if (this instanceof brm $$14) {
            $$14.K().n();
         }

         return true;
      }
   }

   public boolean fE() {
      return !this.ez();
   }

   public boolean fF() {
      return true;
   }

   public void a(im $$0, boolean $$1) {
   }

   public boolean f(csd $$0) {
      return false;
   }

   @Override
   public final bqo a(brp $$0) {
      return $$0 == brp.c ? aH : this.e($$0).a(this.ec());
   }

   protected bqo e(brp $$0) {
      return this.ai().n().a(this.eb());
   }

   public ImmutableList<brp> fG() {
      return ImmutableList.of(brp.a);
   }

   public eta f(brp $$0) {
      bqo $$1 = this.a($$0);
      return new eta((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(brp $$0) {
      eta $$1 = this.a($$0).a(this.dl());
      return this.dN().b(this, $$1);
   }

   @Override
   public boolean cu() {
      return super.cu() && !this.fJ();
   }

   public Optional<im> fH() {
      return this.ao.a(bR);
   }

   public void g(im $$0) {
      this.ao.a(bR, Optional.of($$0));
   }

   public void fI() {
      this.ao.a(bR, Optional.empty());
   }

   public boolean fJ() {
      return this.fH().isPresent();
   }

   public void b(im $$0) {
      if (this.bP()) {
         this.ac();
      }

      dpy $$1 = this.dN().a_($$0);
      if ($$1.b() instanceof dco) {
         this.dN().a($$0, $$1.a(dco.c, Boolean.valueOf(true)), 3);
      }

      this.b(brp.c);
      this.a($$0);
      this.g($$0);
      this.g(etf.b);
      this.av = true;
   }

   private void a(im $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean M() {
      return this.fH().map($$0 -> this.dN().a_($$0).b() instanceof dco).orElse(false);
   }

   public void fK() {
      this.fH().filter(this.dN()::B).ifPresent($$0x -> {
         dpy $$1 = this.dN().a_($$0x);
         if ($$1.b() instanceof dco) {
            ir $$2 = $$1.c(dco.aE);
            this.dN().a($$0x, $$1.a(dco.c, Boolean.valueOf(false)), 3);
            etf $$3 = dco.a(this.ai(), this.dN(), $$0x, $$2, this.dD()).orElseGet(() -> {
               im $$1x = $$0x.c();
               return new etf((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            etf $$4 = etf.c($$0x).d($$3).d();
            float $$5 = (float)axw.d(axw.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      etf $$0 = this.dl();
      this.b(brp.a);
      this.a_($$0.c, $$0.d, $$0.e);
      this.fI();
   }

   @Nullable
   public ir fL() {
      im $$0 = this.fH().orElse(null);
      return $$0 != null ? dco.a(this.dN(), $$0) : null;
   }

   @Override
   public boolean bC() {
      return !this.fJ() && super.bC();
   }

   public csd g(csd $$0) {
      return csd.i;
   }

   public csd a(czu $$0, csd $$1) {
      if ($$1.H()) {
         $$0.a(null, this.ds(), this.du(), this.dy(), this.d($$1), ava.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$1, $$0, this);
         $$1.a(1, this);
         this.a(dur.m);
      }

      return $$1;
   }

   private void a(csd $$0, czu $$1, bre $$2) {
      cry $$3 = $$0.f();
      if ($$3.y()) {
         for (Pair<bpx, Float> $$5 : $$3.z().f()) {
            if (!$$1.B && $$5.getFirst() != null && $$1.z.i() < (Float)$$5.getSecond()) {
               $$2.b(new bpx((bpx)$$5.getFirst()));
            }
         }
      }
   }

   private static byte h(bqs $$0) {
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

   public void e(bqs $$0) {
      this.dN().a(this, h($$0));
   }

   public static bqs d(bop $$0) {
      return $$0 == bop.a ? bqs.a : bqs.b;
   }

   @Override
   public eta h_() {
      if (this.d(bqs.f).a(csg.uq)) {
         float $$0 = 0.5F;
         return this.cI().c(0.5, 0.5, 0.5);
      } else {
         return super.h_();
      }
   }

   public static bqs h(csd $$0) {
      crf $$1 = crf.c_($$0);
      return $$1 != null ? $$1.k() : bqs.a;
   }

   private static brv a(bre $$0, bqs $$1) {
      return $$1 != bqs.f && $$1 != bqs.a && $$1 != bqs.b ? brv.a($$0, $$1, $$1x -> $$1x.d() || brg.h($$1x) == $$1) : brv.a($$0, $$1);
   }

   @Nullable
   private static bqs s(int $$0) {
      if ($$0 == 100 + bqs.f.b()) {
         return bqs.f;
      } else if ($$0 == 100 + bqs.e.b()) {
         return bqs.e;
      } else if ($$0 == 100 + bqs.d.b()) {
         return bqs.d;
      } else if ($$0 == 100 + bqs.c.b()) {
         return bqs.c;
      } else if ($$0 == 98) {
         return bqs.a;
      } else if ($$0 == 99) {
         return bqs.b;
      } else {
         return $$0 == 105 ? bqs.g : null;
      }
   }

   @Override
   public brv a_(int $$0) {
      bqs $$1 = s($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dB() {
      if (this.N_()) {
         return false;
      } else {
         boolean $$0 = !this.d(bqs.f).a(avw.az) && !this.d(bqs.e).a(avw.az) && !this.d(bqs.d).a(avw.az) && !this.d(bqs.c).a(avw.az);
         return $$0 && super.dB();
      }
   }

   @Override
   public boolean ce() {
      return !this.dN().x_() && this.b(bpz.x) || super.ce();
   }

   @Override
   public float dE() {
      return this.aZ;
   }

   @Override
   public void a(abl $$0) {
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      float $$4 = $$0.n();
      float $$5 = $$0.m();
      this.f($$1, $$2, $$3);
      this.aZ = $$0.o();
      this.bb = $$0.o();
      this.ba = this.aZ;
      this.bc = this.bb;
      this.e($$0.b());
      this.a_($$0.e());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.o($$0.j(), $$0.k(), $$0.l());
   }

   public boolean fM() {
      return this.eV().f() instanceof cpx;
   }

   @Override
   public float dH() {
      float $$0 = (float)this.g(bsl.v);
      return this.cO() instanceof ckl ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public etf m(bql $$0) {
      return this.dl().e(this.a($$0, this.a(this.ap()), this.ec() * this.eb()));
   }

   protected void a(int $$0, double $$1) {
      this.bb = (float)axw.e(1.0 / (double)$$0, (double)this.bb, $$1);
   }

   @Override
   public void h(int $$0) {
      super.h(cya.a(this, $$0));
   }

   public boolean fN() {
      return false;
   }

   public static record a(auy a, auy b) {
   }
}
