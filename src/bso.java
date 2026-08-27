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
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class bso extends brv implements brs {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final btt bQ = new btt(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, btt.a.c);
   public static final int j = 2;
   public static final int k = 4;
   public static final int l = 98;
   public static final int m = 100;
   public static final int n = 105;
   public static final int o = 6;
   public static final int p = 100;
   private static final int bR = 40;
   public static final double q = 0.003;
   public static final double r = 0.08;
   public static final int s = 20;
   private static final int bS = 10;
   private static final int bT = 2;
   public static final int t = 4;
   public static final float u = 0.42F;
   private static final double bU = 128.0;
   protected static final int v = 1;
   protected static final int aN = 2;
   protected static final int aO = 4;
   protected static final ajy<Byte> aP = akc.a(bso.class, aka.a);
   private static final ajy<Float> bV = akc.a(bso.class, aka.d);
   private static final ajy<List<kz>> bW = akc.a(bso.class, aka.m);
   private static final ajy<Boolean> bX = akc.a(bso.class, aka.k);
   private static final ajy<Integer> bY = akc.a(bso.class, aka.b);
   private static final ajy<Integer> bZ = akc.a(bso.class, aka.b);
   private static final ajy<Integer> ca = akc.a(bso.class, aka.b);
   private static final ajy<Optional<ir>> cb = akc.a(bso.class, aka.p);
   private static final int cc = 15;
   protected static final bry aQ = bry.c(0.2F, 0.2F).b(0.2F);
   public static final float aR = 0.5F;
   public static final float aS = 0.5F;
   private static final float cd = 0.21875F;
   private final bts ce;
   private final bqq cf = new bqq(this);
   private final Map<ja<brf>, brh> cg = Maps.newHashMap();
   private final jj<cuh> ch = jj.a(2, cuh.i);
   private final jj<cuh> ci = jj.a(4, cuh.i);
   private cuh cj = cuh.i;
   public boolean aT;
   private boolean ck = false;
   public bpz aU;
   public int aV;
   public int aW;
   public int aX;
   public int aY;
   public int aZ;
   public int ba;
   public int bb;
   public float bc;
   public float bd;
   protected int be;
   public final bto bf = new bto();
   public final int bg = 20;
   public final float bh;
   public final float bi;
   public float bj;
   public float bk;
   public float bl;
   public float bm;
   @Nullable
   protected cly bn;
   protected int bo;
   protected boolean bp;
   protected int bq;
   protected float br;
   protected float bs;
   protected float bt;
   protected float bu;
   protected float bv;
   protected int bw;
   protected float bx;
   protected boolean by;
   public float bz;
   public float bA;
   public float bB;
   protected int bC;
   protected double bD;
   protected double bE;
   protected double bF;
   protected double bG;
   protected double bH;
   protected double bI;
   protected int bJ;
   private boolean cl = true;
   @Nullable
   private bso cm;
   private int cn;
   private bso co;
   private int cp;
   private float cq;
   private int cr;
   private float cs;
   protected cuh bK = cuh.i;
   protected int bL;
   protected int bM;
   private ir ct;
   private Optional<ir> cu = Optional.empty();
   @Nullable
   private bqt cv;
   private long cw;
   protected int bN;
   private float cx;
   private float cy;
   protected btp<?> bO;
   private boolean cz;
   protected float bP = 1.0F;

   protected bso(bsb<? extends bso> $$0, dca $$1) {
      super($$0, $$1);
      this.ce = new bts(btw.a($$0));
      this.t(this.eZ());
      this.K = true;
      this.bi = (float)((Math.random() + 1.0) * 0.01F);
      this.at();
      this.bh = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.bl = this.dK();
      uy $$2 = uy.a;
      this.bO = this.a(new Dynamic($$2, (vh)$$2.createMap(ImmutableMap.of($$2.a("memories"), (vh)$$2.emptyMap()))));
   }

   public btp<?> dZ() {
      return this.bO;
   }

   protected btp.b<?> ea() {
      return btp.a(ImmutableList.of(), ImmutableList.of());
   }

   protected btp<?> a(Dynamic<?> $$0) {
      return this.ea().a($$0);
   }

   @Override
   public void an() {
      this.a(this.dX().y(), Float.MAX_VALUE);
   }

   public boolean a(bsb<?> $$0) {
      return true;
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(aP, (byte)0);
      $$0.a(bW, List.of());
      $$0.a(bX, false);
      $$0.a(bY, 0);
      $$0.a(bZ, 0);
      $$0.a(ca, 0);
      $$0.a(bV, 1.0F);
      $$0.a(cb, Optional.empty());
   }

   public static btu.a eb() {
      return btu.a().a(btv.q).a(btv.n).a(btv.r).a(btv.a).a(btv.b).a(btv.p).a(btv.v).a(btv.t).a(btv.l).a(btv.s).a(btv.i).a(btv.m);
   }

   @Override
   protected void a(double $$0, boolean $$1, dtc $$2, ir $$3) {
      if (!this.bi()) {
         this.bq();
      }

      float $$4 = (float)this.g(btv.s);
      if (!this.dU().C && $$1 && this.ad > 0.0F) {
         this.eh();
         this.ei();
         if (this.ad > $$4 && !$$2.i()) {
            double $$5 = this.dz();
            double $$6 = this.dB();
            double $$7 = this.dF();
            ir $$8 = this.du();
            if ($$3.u() != $$8.u() || $$3.w() != $$8.w()) {
               double $$9 = $$5 - (double)$$3.u() - 0.5;
               double $$10 = $$7 - (double)$$3.w() - 0.5;
               double $$11 = Math.max(Math.abs($$9), Math.abs($$10));
               $$5 = (double)$$3.u() + 0.5 + $$9 / $$11 * 0.5;
               $$7 = (double)$$3.w() + 0.5 + $$10 / $$11 * 0.5;
            }

            float $$12 = (float)aym.f(this.ad - $$4);
            double $$13 = Math.min((double)(0.2F + $$12 / 15.0F), 2.5);
            int $$14 = (int)(150.0 * $$13);
            ((aqt)this.dU()).a(new ks(lb.b, $$2), $$5, $$6, $$7, $$14, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      cuh $$15 = this.d(bsc.c);
      if ($$1 && this.ad > $$4 && $$15.a(cuk.rp)) {
         this.b($$15, this.ad - $$4);
         this.ad = 0.0F;
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cu = Optional.empty();
      }
   }

   private void b(cuh $$0, float $$1) {
      float $$2 = aym.a(aym.g($$1, 0.0F, 50.0F), 0.0F, 1.0F);
      dca $$3 = this.dU();
      if (!$$3.x_()) {
         if (!this.fY()) {
            this.e(bsc.c);
            $$0.h(1);
         }

         if (this instanceof cly $$4) {
            $$4.b(avz.d.b($$0.f()));
         }

         ir $$5 = this.du();
         this.a($$3, $$5, 1);
         int $$6 = (int)aym.i($$2, 1.0F, 5.0F);
         int $$7 = (int)aym.i($$2, 1.0F, 80.0F);

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            this.a($$3, $$5.b(this.al.a($$6 * 2 + 1) - $$6, this.al.a(2) - this.al.a(2), this.al.a($$6 * 2 + 1) - $$6), 1);
         }

         ((aqt)this.dU()).a(new ks(lb.b, dfe.K.n()), this.dz(), this.dB(), this.dF(), 200, 1.0, 0.0, 1.0, 0.3F);
      }

      this.a(avo.xO, 1.0F, 1.0F);
      this.a(avo.xQ, 1.0F, 1.0F);
      this.ai = aym.i($$2, 0.05F, 0.8F);
   }

   private void a(dca $$0, ir $$1, int $$2) {
      if (this instanceof cly $$3 && !$$0.a($$3, $$1)) {
         return;
      }

      dtc $$4 = $$0.a_($$1);
      if ($$4.r()) {
         if ($$4.a(dfe.K)) {
            $$2 += $$4.c(dkd.c);
         }

         if ($$2 <= 8) {
            dtc $$5 = dfe.K.n().a(dkd.c, Integer.valueOf($$2));
            if ($$5.a((dcd)$$0, $$1)) {
               if (!$$4.a(dfe.K)) {
                  $$0.a($$1, true, this);
               }

               $$0.b($$1, $$5);
            }
         }
      }
   }

   public final boolean ec() {
      return this.ak().a(awh.m);
   }

   public float a(float $$0) {
      return aym.i($$0, this.cy, this.cx);
   }

   @Override
   public void au() {
      this.bc = this.bd;
      if (this.ar) {
         this.fS().ifPresent(this::a);
      }

      if (this.ee()) {
         this.ef();
      }

      super.au();
      this.dU().ag().a("livingEntityBaseTick");
      if (this.bh() || this.dU().C) {
         this.aC();
      }

      if (this.bI()) {
         boolean $$0 = this instanceof cly;
         if (!this.dU().C) {
            if (this.bJ()) {
               this.a(this.dX().g(), 1.0F);
            } else if ($$0 && !this.dU().D_().a(this.cP())) {
               double $$1 = this.dU().D_().a(this) + this.dU().D_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dU().D_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dX().x(), (float)Math.max(1, aym.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(awj.a) && !this.dU().a_(ir.a(this.dz(), this.dD(), this.dF())).a(dfe.ob)) {
            boolean $$3 = !this.ec() && !bri.c(this) && (!$$0 || !((cly)this).gm().a);
            if ($$3) {
               this.k(this.n(this.cq()));
               if (this.cq() == -20) {
                  this.k(0);
                  ewu $$4 = this.dx();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.al.j() - this.al.j();
                     double $$7 = this.al.j() - this.al.j();
                     double $$8 = this.al.j() - this.al.j();
                     this.dU().a(lb.d, this.dz() + $$6, this.dB() + $$7, this.dF() + $$8, $$4.c, $$4.d, $$4.e);
                  }

                  this.a(this.dX().i(), 2.0F);
               }
            }

            if (!this.dU().C && this.bW() && this.dh() != null && this.dh().bY()) {
               this.ae();
            }
         } else if (this.cq() < this.cp()) {
            this.k(this.o(this.cq()));
         }

         if (!this.dU().C) {
            ir $$9 = this.du();
            if (!Objects.equal(this.ct, $$9)) {
               this.ct = $$9;
               this.c($$9);
            }
         }
      }

      if (this.bI() && (this.bk() || this.aF)) {
         this.aK();
      }

      if (this.aZ > 0) {
         this.aZ--;
      }

      if (this.aq > 0 && !(this instanceof aqu)) {
         this.aq--;
      }

      if (this.eJ() && this.dU().h(this)) {
         this.eo();
      }

      if (this.bo > 0) {
         this.bo--;
      } else {
         this.bn = null;
      }

      if (this.co != null && !this.co.bI()) {
         this.co = null;
      }

      if (this.cm != null) {
         if (!this.cm.bI()) {
            this.a(null);
         } else if (this.am - this.cn > 100) {
            this.a(null);
         }
      }

      if (this.dU().z_() && this.bj() && this.dU().t(this.du()).a(ddg.g) && this.c(brj.s) == null) {
         this.ed();
      }

      this.eA();
      this.bu = this.bt;
      this.bk = this.bj;
      this.bm = this.bl;
      this.P = this.dK();
      this.Q = this.dM();
      this.dU().ag().c();
   }

   protected void ed() {
      this.b(new brh(brj.s, 40));
   }

   public boolean ee() {
      return this.am % 5 == 0 && this.dx().c != 0.0 && this.dx().e != 0.0 && !this.O_() && dae.k(this) && this.eg();
   }

   protected void ef() {
      ewu $$0 = this.dx();
      this.dU()
         .a(
            lb.K,
            this.dz() + (this.al.j() - 0.5) * (double)this.do(),
            this.dB() + 0.1,
            this.dF() + (this.al.j() - 0.5) * (double)this.do(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.al.i() * 0.4F + this.al.i() > 0.9F ? 0.6F : 0.0F;
      this.a(avo.yl, $$1, 0.6F + this.al.i() * 0.4F);
   }

   protected boolean eg() {
      return this.dU().a_(this.aN()).a(awe.aP);
   }

   @Override
   protected float aQ() {
      return this.eg() && dae.a(dag.l, this) > 0 ? 1.0F : super.aQ();
   }

   @Override
   protected boolean c(dtc $$0) {
      return !$$0.i() || this.fN();
   }

   protected void eh() {
      btr $$0 = this.f(btv.r);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void ei() {
      if (!this.bs().i()) {
         int $$0 = dae.a(dag.l, this);
         if ($$0 > 0 && this.eg()) {
            btr $$1 = this.f(btv.r);
            if ($$1 == null) {
               return;
            }

            $$1.c(new btt(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), btt.a.a));
            if (this.et().i() < 0.04F) {
               cuh $$2 = this.d(bsc.c);
               $$2.a(1, this, bsc.c);
            }
         }
      }
   }

   protected void ej() {
      btr $$0 = this.f(btv.r);
      if ($$0 != null) {
         if ($$0.a(e) != null) {
            $$0.b(e);
         }
      }
   }

   protected void ek() {
      if (!this.bs().i()) {
         int $$0 = this.cr();
         if ($$0 > 0) {
            btr $$1 = this.f(btv.r);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cs();
            $$1.c(new btt(e, "Powder snow slow", (double)$$2, btt.a.a));
         }
      }
   }

   protected void c(ir $$0) {
      int $$1 = dae.a(dag.j, this);
      if ($$1 > 0) {
         dah.a(this, this.dU(), $$0, $$1);
      }

      if (this.c(this.bs())) {
         this.eh();
      }

      this.ei();
   }

   public boolean o_() {
      return false;
   }

   public float el() {
      return this.o_() ? 0.5F : 1.0F;
   }

   public float em() {
      bts $$0 = this.ff();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(btv.t));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean en() {
      return true;
   }

   protected void eo() {
      this.bb++;
      if (this.bb >= 20 && !this.dU().x_() && !this.dP()) {
         this.dU().a(this, (byte)60);
         this.a(brv.d.a);
      }
   }

   public boolean ep() {
      return !this.o_();
   }

   protected boolean eq() {
      return !this.o_();
   }

   protected int n(int $$0) {
      int $$1 = dae.e(this);
      return $$1 > 0 && this.al.a($$1 + 1) > 0 ? $$0 : $$0 - 1;
   }

   protected int o(int $$0) {
      return Math.min($$0 + 4, this.cp());
   }

   public int er() {
      return 0;
   }

   protected boolean es() {
      return false;
   }

   public ayt et() {
      return this.al;
   }

   @Nullable
   public bso eu() {
      return this.cm;
   }

   @Override
   public bso U_() {
      return this.eu();
   }

   public int ev() {
      return this.cn;
   }

   public void c(@Nullable cly $$0) {
      this.bn = $$0;
      this.bo = this.am;
   }

   public void a(@Nullable bso $$0) {
      this.cm = $$0;
      this.cn = this.am;
   }

   @Nullable
   public bso ew() {
      return this.co;
   }

   public int ex() {
      return this.cp;
   }

   public void A(brv $$0) {
      if ($$0 instanceof bso) {
         this.co = (bso)$$0;
      } else {
         this.co = null;
      }

      this.cp = this.am;
   }

   public int ey() {
      return this.bq;
   }

   public void p(int $$0) {
      this.bq = $$0;
   }

   public boolean ez() {
      return this.ck;
   }

   public void q(boolean $$0) {
      this.ck = $$0;
   }

   protected boolean a(bsc $$0) {
      return true;
   }

   public void a(bsc $$0, cuh $$1, cuh $$2) {
      boolean $$3 = $$2.d() && $$1.d();
      if (!$$3 && !cuh.c($$1, $$2) && !this.ar) {
         cth $$4 = cth.c_($$2);
         if (!this.dU().x_() && !this.O_()) {
            if ($$2.a(cuk.AH) && !$$2.f().equals($$1.f()) && this instanceof aqu $$5) {
               Pair<String, Integer> $$6 = $$5.gr();
               if (((String)$$6.getFirst()).equals("intro") && (Integer)$$6.getSecond() == 0) {
                  $$5.a(avz.i.b(avz.aJ));
               }
            }

            if (!this.ba() && $$4 != null && $$4.k() == $$0) {
               this.dU().a(null, this.dz(), this.dB(), this.dF(), $$4.ap_(), this.dj(), 1.0F, 1.0F, this.al.g());
            }

            if (this.a($$0)) {
               this.a($$4 != null ? dxv.v : dxv.S);
            }
         }
      }
   }

   @Override
   public void a(brv.d $$0) {
      super.a($$0);
      this.bO.a();
   }

   @Override
   public void b(uk $$0) {
      $$0.a("Health", this.eI());
      $$0.a("HurtTime", (short)this.aZ);
      $$0.a("HurtByTimestamp", this.cn);
      $$0.a("DeathTime", (short)this.bb);
      $$0.a("AbsorptionAmount", this.fB());
      $$0.a("Attributes", this.ff().c());
      if (!this.cg.isEmpty()) {
         uq $$1 = new uq();

         for (brh $$2 : this.cg.values()) {
            $$1.add($$2.j());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fN());
      this.fS().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<vh> $$3 = this.bO.a(uy.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(uk $$0) {
      this.B($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dU() != null && !this.dU().C) {
         this.ff().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         uq $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            uk $$3 = $$1.a($$2);
            brh $$4 = brh.a($$3);
            if ($$4 != null) {
               this.cg.put($$4.c(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.t($$0.j("Health"));
      }

      this.aZ = $$0.g("HurtTime");
      this.bb = $$0.g("DeathTime");
      this.cn = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         exy $$6 = this.dU().M();
         ext $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cF(), $$7);
         if (!$$8) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         ir $$9 = new ir($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.i($$9);
         this.as.a(ax, bsz.c);
         if (!this.ar) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bO = this.a(new Dynamic(uy.a, $$0.c("Brain")));
      }
   }

   protected void eA() {
      Iterator<ja<brf>> $$0 = this.cg.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            ja<brf> $$1 = $$0.next();
            brh $$2 = this.cg.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dU().C) {
                  $$0.remove();
                  this.a($$2);
               }
            } else if ($$2.d() % 600 == 0) {
               this.a($$2, false, null);
            }
         }
      } catch (ConcurrentModificationException var6) {
      }

      if (this.cl) {
         if (!this.dU().C) {
            this.L();
            this.u();
         }

         this.cl = false;
      }

      List<kz> $$3 = this.as.a(bW);
      if (!$$3.isEmpty()) {
         boolean $$4 = this.as.a(bX);
         int $$5 = this.cm() ? 15 : 4;
         int $$6 = $$4 ? 5 : 1;
         if (this.al.a($$5 * $$6) == 0) {
            this.dU().a(ad.a($$3, this.al), this.d(0.5), this.dC(), this.g(0.5), 1.0, 1.0, 1.0);
         }
      }
   }

   protected void L() {
      if (this.cg.isEmpty()) {
         this.eD();
         this.k(false);
      } else {
         this.k(this.b(brj.n));
         this.r();
      }
   }

   private void r() {
      List<kz> $$0 = this.cg.values().stream().filter(brh::g).map(brh::a).toList();
      this.as.a(bW, $$0);
      this.as.a(bX, c(this.cg.values()));
   }

   private void u() {
      boolean $$0 = this.cl();
      if (this.j(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable brv $$0) {
      double $$1 = 1.0;
      if (this.cd()) {
         $$1 *= 0.8;
      }

      if (this.cm()) {
         float $$2 = this.fm();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cuh $$3 = this.d(bsc.f);
         bsb<?> $$4 = $$0.ak();
         if ($$4 == bsb.aP && $$3.a(cuk.vW)
            || $$4 == bsb.by && $$3.a(cuk.vZ)
            || $$4 == bsb.aB && $$3.a(cuk.wc)
            || $$4 == bsb.aC && $$3.a(cuk.wc)
            || $$4 == bsb.z && $$3.a(cuk.wa)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bso $$0) {
      return $$0 instanceof cly && this.dU().al() == bpx.a ? false : $$0.eB();
   }

   public boolean a(bso $$0, cde $$1) {
      return $$1.a(this, $$0);
   }

   public boolean eB() {
      return !this.cz() && this.eC();
   }

   public boolean eC() {
      return !this.O_() && this.bI();
   }

   public static boolean c(Collection<brh> $$0) {
      for (brh $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void eD() {
      this.as.a(bW, List.of());
   }

   public boolean eE() {
      if (this.dU().C) {
         return false;
      } else {
         Iterator<brh> $$0 = this.cg.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<brh> eF() {
      return this.cg.values();
   }

   public Map<ja<brf>, brh> eG() {
      return this.cg;
   }

   public boolean b(ja<brf> $$0) {
      return this.cg.containsKey($$0);
   }

   @Nullable
   public brh c(ja<brf> $$0) {
      return this.cg.get($$0);
   }

   public final boolean b(brh $$0) {
      return this.b($$0, null);
   }

   public boolean b(brh $$0, @Nullable brv $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         brh $$2 = this.cg.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.cg.put($$0.c(), $$0);
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

   public boolean c(brh $$0) {
      return !this.ak().a(awh.w) ? true : !$$0.a(brj.j) && !$$0.a(brj.s);
   }

   public void c(brh $$0, @Nullable brv $$1) {
      if (this.c($$0)) {
         brh $$2 = this.cg.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eH() {
      return this.ak().a(awh.x);
   }

   @Nullable
   public brh d(ja<brf> $$0) {
      return this.cg.remove($$0);
   }

   public boolean e(ja<brf> $$0) {
      brh $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(brh $$0, @Nullable brv $$1) {
      this.cl = true;
      if (!this.dU().C) {
         $$0.c().a().a(this.ff(), $$0.e());
         this.d($$0);
      }
   }

   public void d(brh $$0) {
      for (brv $$1 : this.cX()) {
         if ($$1 instanceof aqu $$2) {
            $$2.d.b(new age(this.al(), $$0, false));
         }
      }
   }

   protected void a(brh $$0, boolean $$1, @Nullable brv $$2) {
      this.cl = true;
      if ($$1 && !this.dU().C) {
         brf $$3 = $$0.c().a();
         $$3.a(this.ff());
         $$3.a(this.ff(), $$0.e());
         this.y();
      }

      if (!this.dU().C) {
         this.d($$0);
      }
   }

   protected void a(brh $$0) {
      this.cl = true;
      if (!this.dU().C) {
         $$0.c().a().a(this.ff());
         this.y();

         for (brv $$1 : this.cX()) {
            if ($$1 instanceof aqu $$2) {
               $$2.d.b(new aei(this.al(), $$0.c()));
            }
         }
      }
   }

   private void y() {
      for (btr $$0 : this.ff().a()) {
         this.i($$0.a());
      }
   }

   private void i(ja<btq> $$0) {
      if ($$0.a(btv.q)) {
         float $$1 = this.eZ();
         if (this.eI() > $$1) {
            this.t($$1);
         }
      } else if ($$0.a(btv.p)) {
         float $$2 = this.fa();
         if (this.fB() > $$2) {
            this.A($$2);
         }
      }
   }

   public void c(float $$0) {
      float $$1 = this.eI();
      if ($$1 > 0.0F) {
         this.t($$1 + $$0);
      }
   }

   public float eI() {
      return this.as.a(bV);
   }

   public void t(float $$0) {
      this.as.a(bV, aym.a($$0, 0.0F, this.eZ()));
   }

   public boolean eJ() {
      return this.eI() <= 0.0F;
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dU().C) {
         return false;
      } else if (this.eJ()) {
         return false;
      } else if ($$0.a(awg.j) && this.b(brj.l)) {
         return false;
      } else {
         if (this.fU() && !this.dU().C) {
            this.fV();
         }

         this.bq = 0;
         float $$2 = $$1;
         boolean $$3 = false;
         float $$4 = 0.0F;
         if ($$1 > 0.0F && this.f($$0)) {
            this.v($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.a(awg.k) && $$0.c() instanceof bso $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(awg.p) && this.ak().a(awh.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(awg.a) && !this.d(bsc.f).d()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.bf.a(1.5F);
         boolean $$7 = true;
         if ((float)this.aq > 10.0F && !$$0.a(awg.f)) {
            if ($$1 <= this.bx) {
               return false;
            }

            this.f($$0, $$1 - this.bx);
            this.bx = $$1;
            $$7 = false;
         } else {
            this.bx = $$1;
            this.aq = 20;
            this.f($$0, $$1);
            this.ba = 10;
            this.aZ = this.ba;
         }

         brv $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof bso $$9 && !$$0.a(awg.r) && (!$$0.a(bqw.H) || !this.ak().a(awh.E))) {
               this.a($$9);
            }

            if ($$8 instanceof cly $$10) {
               this.bo = 100;
               this.bn = $$10;
            } else if ($$8 instanceof cfh $$11 && $$11.r()) {
               this.bo = 100;
               if ($$11.Q_() instanceof cly $$12) {
                  this.bn = $$12;
               } else {
                  this.bn = null;
               }
            }
         }

         if ($$7) {
            if ($$3) {
               this.dU().a(this, (byte)29);
            } else {
               this.dU().a(this, $$0);
            }

            if (!$$0.a(awg.s) && (!$$3 || $$1 > 0.0F)) {
               this.bA();
            }

            if ($$8 != null && !$$0.a(awg.A)) {
               double $$13 = $$8.dz() - this.dz();

               double $$14;
               for ($$14 = $$8.dF() - this.dF(); $$13 * $$13 + $$14 * $$14 < 1.0E-4; $$14 = (Math.random() - Math.random()) * 0.01) {
                  $$13 = (Math.random() - Math.random()) * 0.01;
               }

               this.q(0.4F, $$13, $$14);
               if (!$$3) {
                  this.a($$13, $$14);
               }
            }
         }

         if (this.eJ()) {
            if (!this.i($$0)) {
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
            this.cv = $$0;
            this.cw = this.dU().Z();
         }

         if (this instanceof aqu) {
            an.i.a((aqu)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((aqu)this).a(avz.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof aqu) {
            an.h.a((aqu)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$15;
      }
   }

   protected void d(bso $$0) {
      $$0.e(this);
   }

   protected void e(bso $$0) {
      $$0.q(0.5, $$0.dz() - this.dz(), $$0.dF() - this.dF());
   }

   private boolean i(bqt $$0) {
      if ($$0.a(awg.e)) {
         return false;
      } else {
         cuh $$1 = null;

         for (bpz $$2 : bpz.values()) {
            cuh $$3 = this.b($$2);
            if ($$3.a(cuk.xe)) {
               $$1 = $$3.r();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof aqu $$4) {
               $$4.b(avz.c.b(cuk.xe));
               an.C.a($$4, $$1);
               this.a(dxv.C);
            }

            this.t(1.0F);
            this.eE();
            this.b(new brh(brj.j, 900, 1));
            this.b(new brh(brj.v, 100, 1));
            this.b(new brh(brj.l, 800, 0));
            this.dU().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bqt eK() {
      if (this.dU().Z() - this.cw > 40L) {
         this.cv = null;
      }

      return this.cv;
   }

   protected void e(bqt $$0) {
      this.b(this.d($$0));
   }

   public void b(@Nullable avn $$0) {
      if ($$0 != null) {
         this.a($$0, this.fn(), this.fo());
      }
   }

   public boolean f(bqt $$0) {
      brv $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cme $$3 && $$3.D() > 0) {
         $$2 = true;
      }

      if (!$$0.a(awg.d) && this.fL() && !$$2) {
         ewu $$4 = $$0.h();
         if ($$4 != null) {
            ewu $$5 = this.b(0.0F, this.cx());
            ewu $$6 = $$4.a(this.ds());
            $$6 = new ewu($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(cuh $$0) {
      if (!$$0.d()) {
         if (!this.ba()) {
            this.dU().a(this.dz(), this.dB(), this.dF(), $$0.J(), this.dj(), 0.8F, 0.8F + this.dU().A.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bqt $$0) {
      if (!this.dP() && !this.bp) {
         brv $$1 = $$0.d();
         bso $$2 = this.eY();
         if (this.bw >= 0 && $$2 != null) {
            $$2.a(this, this.bw, $$0);
         }

         if (this.fU()) {
            this.fV();
         }

         if (!this.dU().C && this.ag()) {
            b.info("Named entity {} died: {}", this, this.eX().a().getString());
         }

         this.bp = true;
         this.eX().c();
         if (this.dU() instanceof aqt $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(dxv.p);
               this.g($$0);
               this.f($$2);
            }

            this.dU().a(this, (byte)3);
         }

         this.b(bsz.h);
      }
   }

   protected void f(@Nullable bso $$0) {
      if (!this.dU().C) {
         boolean $$1 = false;
         if ($$0 instanceof chu) {
            if (this.dU().ab().b(dbw.c)) {
               ir $$2 = this.du();
               dtc $$3 = dfe.cN.n();
               if (this.dU().a_($$2).i() && $$3.a((dcd)this.dU(), $$2)) {
                  this.dU().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               cig $$4 = new cig(this.dU(), this.dz(), this.dB(), this.dF(), new cuh(cuk.eE));
               this.dU().b($$4);
            }
         }
      }
   }

   protected void g(bqt $$0) {
      brv $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof cly) {
         $$2 = dae.h((bso)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.bo > 0;
      if (this.eq() && this.dU().ab().b(dbw.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.eL();
      this.h($$0);
   }

   protected void eL() {
   }

   protected void h(bqt $$0) {
      if (this.dU() instanceof aqt && !this.eP() && (this.es() || (this.bo > 0 || $$0.a(bqw.V)) && this.ep() && this.dU().ab().b(dbw.f))) {
         bse.a((aqt)this.dU(), this.ds(), this.er());
      }
   }

   protected void a(bqt $$0, int $$1, boolean $$2) {
   }

   public aks<eru> eM() {
      return this.ak().j();
   }

   public long eN() {
      return 0L;
   }

   protected void a(bqt $$0, boolean $$1) {
      aks<eru> $$2 = this.eM();
      eru $$3 = this.dU().o().be().b($$2);
      ers.a $$4 = new ers.a((aqt)this.dU()).a(eug.a, this).a(eug.f, this.ds()).a(eug.c, $$0).b(eug.d, $$0.d()).b(eug.e, $$0.c());
      if ($$1 && this.bn != null) {
         $$4 = $$4.a(eug.b, this.bn).a(this.bn.gJ());
      }

      ers $$5 = $$4.a(euf.g);
      $$3.a($$5, this.eN(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.g(btv.n);
      if (!($$0 <= 0.0)) {
         this.az = true;
         ewu $$3 = this.dx();
         ewu $$4 = new ewu($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aE() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected avn d(bqt $$0) {
      return avo.kt;
   }

   @Nullable
   protected avn n_() {
      return avo.ko;
   }

   private avn d(int $$0) {
      return $$0 > 4 ? this.eT().b() : this.eT().a();
   }

   public void eO() {
      this.cz = true;
   }

   public boolean eP() {
      return this.cz;
   }

   public float eQ() {
      return 0.0F;
   }

   protected ewp eR() {
      ewp $$0 = this.cP();
      brv $$1 = this.dh();
      if ($$1 != null) {
         ewu $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public boolean eS() {
      if (this.dU().ab().b(dbw.ab)) {
         return false;
      } else {
         cuh $$0 = this.d(bsc.e);
         if ($$0.a(cuk.rq)) {
            $$0.a(40, this, bsc.e);
            this.dU().a(this.dz(), this.dB(), this.dF(), $$1x -> {
               for (int $$2 = 0; $$2 < 3; $$2++) {
                  $$1x.waitThenPlay($$2 == 0 ? 0 : 4, this.d($$0), this.dj(), 0.5F + 0.5F * (float)this.al.a(2), (this.al.i() - this.al.i()) * 0.2F + 1.0F);
               }
            });
            if (this instanceof aqu $$1) {
               an.ag.a($$1);
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public bso.a eT() {
      return new bso.a(avo.ku, avo.km);
   }

   protected avn c(cuh $$0) {
      return $$0.H();
   }

   public avn d(cuh $$0) {
      return $$0.I();
   }

   public Optional<ir> eU() {
      return this.cu;
   }

   public boolean p_() {
      if (this.O_()) {
         return false;
      } else {
         ir $$0 = this.du();
         dtc $$1 = this.dv();
         if ($$1.a(awe.aR)) {
            this.cu = Optional.of($$0);
            return true;
         } else {
            if (this.b(brj.I)) {
               for (iw $$2 : iw.c.a) {
                  ir $$3 = $$0.a($$2);
                  dtc $$4 = this.dU().a_($$3);
                  if (!$$4.k(this.dU(), $$3).c()) {
                     this.cu = Optional.of($$0);
                     return true;
                  }
               }
            }

            if ($$1.b() instanceof doe && this.c($$0, $$1)) {
               this.cu = Optional.of($$0);
               return true;
            } else {
               return false;
            }
         }
      }
   }

   private boolean c(ir $$0, dtc $$1) {
      if ($$1.c(doe.b)) {
         dtc $$2 = this.dU().a_($$0.d());
         if ($$2.a(dfe.dA) && $$2.c(djm.b) == $$1.c(doe.aE)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean bI() {
      return !this.dP() && this.eI() > 0.0F;
   }

   @Override
   public int cC() {
      return this.u(0.0F);
   }

   protected final int u(float $$0) {
      return aym.d($$0 + 3.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bqt $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.d($$0, $$1);
      if ($$4 > 0) {
         this.a(this.d($$4), 1.0F, 1.0F);
         this.eV();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int d(float $$0, float $$1) {
      if (this.ak().a(awh.o)) {
         return 0;
      } else {
         float $$2 = (float)this.g(btv.s);
         float $$3 = $$0 - $$2;
         return aym.c((double)($$3 * $$1) * this.g(btv.i));
      }
   }

   protected void eV() {
      if (!this.ba()) {
         int $$0 = aym.a(this.dz());
         int $$1 = aym.a(this.dB() - 0.2F);
         int $$2 = aym.a(this.dF());
         dtc $$3 = this.dU().a_(new ir($$0, $$1, $$2));
         if (!$$3.i()) {
            dnd $$4 = $$3.w();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void m(float $$0) {
      this.ba = 10;
      this.aZ = this.ba;
   }

   public int eW() {
      return aym.a(this.g(btv.a));
   }

   protected void b(bqt $$0, float $$1) {
   }

   protected void c(bqt $$0, float $$1) {
   }

   protected void v(float $$0) {
   }

   protected void a(bqt $$0, float $$1, bsc... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bsc $$4 : $$2) {
            cuh $$5 = this.d($$4);
            if ($$5.f() instanceof crt && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float d(bqt $$0, float $$1) {
      if (!$$0.a(awg.c)) {
         this.b($$0, $$1);
         $$1 = bqp.a($$1, (float)this.eW(), (float)this.g(btv.b));
      }

      return $$1;
   }

   protected float e(bqt $$0, float $$1) {
      if ($$0.a(awg.g)) {
         return $$1;
      } else {
         if (this.b(brj.k) && !$$0.a(awg.h)) {
            int $$2 = (this.c(brj.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof aqu) {
                  ((aqu)this).a(avz.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof aqu) {
                  ((aqu)$$0.d()).a(avz.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(awg.i)) {
            return $$1;
         } else {
            int $$7 = dae.a(this.fk(), $$0);
            if ($$7 > 0) {
               $$1 = bqp.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bqt $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fB(), 0.0F);
         this.A(this.fB() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof aqu $$4) {
            $$4.a(avz.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eX().a($$0, var9);
            this.t(this.eI() - var9);
            this.A(this.fB() - var9);
            this.a(dxv.o);
         }
      }
   }

   public bqq eX() {
      return this.cf;
   }

   @Nullable
   public bso eY() {
      if (this.bn != null) {
         return this.bn;
      } else {
         return this.cm != null ? this.cm : null;
      }
   }

   public final float eZ() {
      return (float)this.g(btv.q);
   }

   public final float fa() {
      return (float)this.g(btv.p);
   }

   public final int fb() {
      return this.as.a(bY);
   }

   public final void q(int $$0) {
      this.as.a(bY, $$0);
   }

   public final int fc() {
      return this.as.a(bZ);
   }

   public final int fd() {
      return this.as.a(ca);
   }

   public final void r(int $$0) {
      this.as.a(bZ, $$0);
   }

   public final void s(int $$0) {
      this.as.a(ca, $$0);
   }

   private int A() {
      if (bri.a(this)) {
         return 6 - (1 + bri.b(this));
      } else {
         return this.b(brj.d) ? 6 + (1 + this.c(brj.d).e()) * 2 : 6;
      }
   }

   public void a(bpz $$0) {
      this.a($$0, false);
   }

   public void a(bpz $$0, boolean $$1) {
      if (!this.aT || this.aV >= this.A() / 2 || this.aV < 0) {
         this.aV = -1;
         this.aT = true;
         this.aU = $$0;
         if (this.dU() instanceof aqt) {
            aca $$2 = new aca(this, $$0 == bpz.a ? 0 : 3);
            aqr $$3 = ((aqt)this.dU()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bqt $$0) {
      this.bf.a(1.5F);
      this.aq = 20;
      this.ba = 10;
      this.aZ = this.ba;
      avn $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.fn(), (this.al.i() - this.al.i()) * 0.2F + 1.0F);
      }

      this.a(this.dX().o(), 0.0F);
      this.cv = $$0;
      this.cw = this.dU().Z();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            avn $$1 = this.n_();
            if ($$1 != null) {
               this.a($$1, this.fn(), (this.al.i() - this.al.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cly)) {
               this.t(0.0F);
               this.a(this.dX().o());
            }
            break;
         case 29:
            this.a(avo.wY, 1.0F, 0.8F + this.dU().A.i() * 0.4F);
            break;
         case 30:
            this.a(avo.wZ, 0.8F, 0.8F + this.dU().A.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.al.i() - 0.5F) * 0.2F;
               float $$6 = (this.al.i() - 0.5F) * 0.2F;
               float $$7 = (this.al.i() - 0.5F) * 0.2F;
               double $$8 = aym.d($$4, this.M, this.dz()) + (this.al.j() - 0.5) * (double)this.do() * 2.0;
               double $$9 = aym.d($$4, this.N, this.dB()) + this.al.j() * (double)this.dp();
               double $$10 = aym.d($$4, this.O, this.dF()) + (this.al.j() - 0.5) * (double)this.do() * 2.0;
               this.dU().a(lb.aa, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.d(bsc.a));
            break;
         case 48:
            this.i(this.d(bsc.b));
            break;
         case 49:
            this.i(this.d(bsc.f));
            break;
         case 50:
            this.i(this.d(bsc.e));
            break;
         case 51:
            this.i(this.d(bsc.d));
            break;
         case 52:
            this.i(this.d(bsc.c));
            break;
         case 54:
            dja.b(this);
            break;
         case 55:
            this.C();
            break;
         case 60:
            this.B();
            break;
         case 65:
            this.i(this.d(bsc.g));
            break;
         default:
            super.b($$0);
      }
   }

   private void B() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.al.k() * 0.02;
         double $$2 = this.al.k() * 0.02;
         double $$3 = this.al.k() * 0.02;
         this.dU().a(lb.Z, this.d(1.0), this.dC(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void C() {
      cuh $$0 = this.d(bsc.b);
      this.a(bsc.b, this.d(bsc.a));
      this.a(bsc.a, $$0);
   }

   @Override
   protected void aD() {
      if (this.dU().z_() && !this.dP()) {
         MinecraftServer $$0 = this.cT();
         if ($$0 != null) {
            aqt $$1 = $$0.a(dca.h);
            if ($$1 != null && this instanceof aqu $$2) {
               $$2.r();
            }
         }
      } else {
         this.a(this.dX().n(), 4.0F);
      }
   }

   protected void fe() {
      int $$0 = this.A();
      if (this.aT) {
         this.aV++;
         if (this.aV >= $$0) {
            this.aV = 0;
            this.aT = false;
         }
      } else {
         this.aV = 0;
      }

      this.bd = (float)this.aV / (float)$$0;
   }

   @Nullable
   public btr f(ja<btq> $$0) {
      return this.ff().a($$0);
   }

   public double g(ja<btq> $$0) {
      return this.ff().c($$0);
   }

   public double h(ja<btq> $$0) {
      return this.ff().d($$0);
   }

   public bts ff() {
      return this.ce;
   }

   public cuh fg() {
      return this.d(bsc.a);
   }

   public cuh fh() {
      return this.d(bsc.b);
   }

   public boolean b(cuc $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cuh> $$0) {
      return $$0.test(this.fg()) || $$0.test(this.fh());
   }

   public cuh b(bpz $$0) {
      if ($$0 == bpz.a) {
         return this.d(bsc.a);
      } else if ($$0 == bpz.b) {
         return this.d(bsc.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bpz $$0, cuh $$1) {
      if ($$0 == bpz.a) {
         this.a(bsc.a, $$1);
      } else {
         if ($$0 != bpz.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bsc.b, $$1);
      }
   }

   public boolean b(bsc $$0) {
      return !this.d($$0).d();
   }

   public boolean c(bsc $$0) {
      return false;
   }

   public abstract Iterable<cuh> fi();

   public abstract cuh d(bsc var1);

   public abstract void a(bsc var1, cuh var2);

   public Iterable<cuh> fj() {
      return List.of();
   }

   public Iterable<cuh> fk() {
      return this.fi();
   }

   public Iterable<cuh> fl() {
      return Iterables.concat(this.fj(), this.fk());
   }

   protected void e(cuh $$0) {
      $$0.f().n($$0);
   }

   public float fm() {
      Iterable<cuh> $$0 = this.fi();
      int $$1 = 0;
      int $$2 = 0;

      for (cuh $$3 : $$0) {
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
      btr $$1 = this.f(btv.r);
      $$1.b(bQ.b());
      if ($$0) {
         $$1.c(bQ);
      }
   }

   protected float fn() {
      return 1.0F;
   }

   public float fo() {
      return this.o_() ? (this.al.i() - this.al.i()) * 0.2F + 1.5F : (this.al.i() - this.al.i()) * 0.2F + 1.0F;
   }

   protected boolean fp() {
      return this.eJ();
   }

   @Override
   public void h(brv $$0) {
      if (!this.fU()) {
         super.h($$0);
      }
   }

   private void b(brv $$0) {
      ewu $$1;
      if (this.dP()) {
         $$1 = this.ds();
      } else if (!$$0.dP() && !this.dU().a_($$0.du()).a(awe.aL)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dB(), $$0.dB());
         $$1 = new ewu(this.dz(), $$2, this.dF());
      }

      this.a($$1.c, $$1.d, $$1.e);
   }

   @Override
   public boolean cK() {
      return this.cJ();
   }

   protected float fq() {
      return this.w(1.0F);
   }

   protected float w(float $$0) {
      return (float)this.g(btv.m) * $$0 * this.aP() + this.fr();
   }

   public float fr() {
      return this.b(brj.h) ? 0.1F * ((float)this.c(brj.h).e() + 1.0F) : 0.0F;
   }

   protected void fs() {
      ewu $$0 = this.dx();
      this.o($$0.c, (double)this.fq(), $$0.e);
      if (this.cg()) {
         float $$1 = this.dK() * (float) (Math.PI / 180.0);
         this.g(this.dx().b((double)(-aym.a($$1) * 0.2F), 0.0, (double)(aym.b($$1) * 0.2F)));
      }

      this.az = true;
   }

   protected void ft() {
      this.g(this.dx().b(0.0, -0.04F, 0.0));
   }

   protected void c(awt<epd> $$0) {
      this.g(this.dx().b(0.0, 0.04F, 0.0));
   }

   protected float fu() {
      return 0.8F;
   }

   public boolean a(epe $$0) {
      return false;
   }

   @Override
   protected double bc() {
      return this.g(btv.l);
   }

   public void a(ewu $$0) {
      if (this.df()) {
         double $$1 = this.bd();
         boolean $$2 = this.dx().d <= 0.0;
         if ($$2 && this.b(brj.B)) {
            $$1 = Math.min($$1, 0.01);
         }

         epe $$3 = this.dU().b_(this.du());
         if (this.bi() && this.en() && !this.a($$3)) {
            double $$4 = this.dB();
            float $$5 = this.cg() ? 0.9F : this.fu();
            float $$6 = 0.02F;
            float $$7 = (float)dae.f(this);
            if ($$7 > 3.0F) {
               $$7 = 3.0F;
            }

            if (!this.aE()) {
               $$7 *= 0.5F;
            }

            if ($$7 > 0.0F) {
               $$5 += (0.54600006F - $$5) * $$7 / 3.0F;
               $$6 += (this.fw() - $$6) * $$7 / 3.0F;
            }

            if (this.b(brj.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(bst.a, this.dx());
            ewu $$8 = this.dx();
            if (this.R && this.p_()) {
               $$8 = new ewu($$8.c, 0.2, $$8.e);
            }

            this.g($$8.d((double)$$5, 0.8F, (double)$$5));
            ewu $$9 = this.a($$1, $$2, this.dx());
            this.g($$9);
            if (this.R && this.g($$9.c, $$9.d + 0.6F - this.dB() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bx() && this.en() && !this.a($$3)) {
            double $$10 = this.dB();
            this.a(0.02F, $$0);
            this.a(bst.a, this.dx());
            if (this.b(awj.b) <= this.dn()) {
               this.g(this.dx().d(0.5, 0.8F, 0.5));
               ewu $$11 = this.a($$1, $$2, this.dx());
               this.g($$11);
            } else {
               this.g(this.dx().a(0.5));
            }

            if ($$1 != 0.0) {
               this.g(this.dx().b(0.0, -$$1 / 4.0, 0.0));
            }

            ewu $$12 = this.dx();
            if (this.R && this.g($$12.c, $$12.d + 0.6F - this.dB() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fN()) {
            this.cv();
            ewu $$13 = this.dx();
            ewu $$14 = this.bQ();
            float $$15 = this.dM() * (float) (Math.PI / 180.0);
            double $$16 = Math.sqrt($$14.c * $$14.c + $$14.e * $$14.e);
            double $$17 = $$13.h();
            double $$18 = $$14.f();
            double $$19 = Math.cos((double)$$15);
            $$19 = $$19 * $$19 * Math.min(1.0, $$18 / 0.4);
            $$13 = this.dx().b(0.0, $$1 * (-1.0 + $$19 * 0.75), 0.0);
            if ($$13.d < 0.0 && $$16 > 0.0) {
               double $$20 = $$13.d * -0.1 * $$19;
               $$13 = $$13.b($$14.c * $$20 / $$16, $$20, $$14.e * $$20 / $$16);
            }

            if ($$15 < 0.0F && $$16 > 0.0) {
               double $$21 = $$17 * (double)(-aym.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.g($$13.d(0.99F, 0.98F, 0.99F));
            this.a(bst.a, this.dx());
            if (this.R && !this.dU().C) {
               double $$22 = this.dx().h();
               double $$23 = $$17 - $$22;
               float $$24 = (float)($$23 * 10.0 - 3.0);
               if ($$24 > 0.0F) {
                  this.a(this.d((int)$$24), 1.0F, 1.0F);
                  this.a(this.dX().m(), $$24);
               }
            }

            if (this.aE() && !this.dU().C) {
               this.b(7, false);
            }
         } else {
            ir $$25 = this.aN();
            float $$26 = this.dU().a_($$25).b().h();
            if (this.aE()) {
               dri $$27 = this.d(bsc.c).a(ke.am);
               if ($$27 != null) {
                  $$26 = $$27.a($$26);
               }
            }

            float $$29 = this.aE() ? $$26 * 0.91F : 0.91F;
            ewu $$30 = this.a($$0, $$26);
            double $$31 = $$30.d;
            if (this.b(brj.y)) {
               $$31 += (0.05 * (double)(this.c(brj.y).e() + 1) - $$30.d) * 0.2;
            } else if (!this.dU().C || this.dU().B($$25)) {
               $$31 -= $$1;
            } else if (this.dB() > (double)this.dU().J_()) {
               $$31 = -0.1;
            } else {
               $$31 = 0.0;
            }

            this.a($$30, $$31, $$29);
         }
      }

      this.r(this instanceof cen);
   }

   protected void a(ewu $$0, double $$1, float $$2) {
      if (this.ez()) {
         this.o($$0.c, $$1, $$0.e);
      } else {
         this.o($$0.c * (double)$$2, this instanceof cen ? $$1 * (double)$$2 : $$1 * 0.98F, $$0.e * (double)$$2);
      }
   }

   private void c(cly $$0, ewu $$1) {
      ewu $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.df()) {
         this.y(this.e($$0));
         this.a($$2);
      } else {
         this.r(false);
         this.g(ewu.b);
         this.aI();
      }
   }

   protected void a(cly $$0, ewu $$1) {
   }

   protected ewu b(cly $$0, ewu $$1) {
      return $$1;
   }

   protected float e(cly $$0) {
      return this.fw();
   }

   public void r(boolean $$0) {
      float $$1 = (float)aym.g(this.dz() - this.M, $$0 ? this.dB() - this.N : 0.0, this.dF() - this.O);
      this.x($$1);
   }

   protected void x(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.bf.a($$1, 0.4F);
   }

   public ewu a(ewu $$0, float $$1) {
      this.a(this.C($$1), $$0);
      this.g(this.j(this.dx()));
      this.a(bst.a, this.dx());
      ewu $$2 = this.dx();
      if ((this.R || this.by) && (this.p_() || this.dv().a(dfe.sa) && dlj.a(this))) {
         $$2 = new ewu($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public ewu a(double $$0, boolean $$1, ewu $$2) {
      if ($$0 != 0.0 && !this.cg()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new ewu($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private ewu j(ewu $$0) {
      if (this.p_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = aym.a($$0.c, -0.15F, 0.15F);
         double $$3 = aym.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dv().a(dfe.oQ) && this.fM() && this instanceof cly) {
            $$4 = 0.0;
         }

         $$0 = new ewu($$2, $$4, $$3);
      }

      return $$0;
   }

   private float C(float $$0) {
      return this.aE() ? this.fw() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fv();
   }

   protected float fv() {
      return this.cV() instanceof cly ? this.fw() * 0.1F : 0.02F;
   }

   public float fw() {
      return this.cq;
   }

   public void y(float $$0) {
      this.cq = $$0;
   }

   public boolean C(brv $$0) {
      this.A($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.G();
      this.J();
      if (!this.dU().C) {
         int $$0 = this.fb();
         if ($$0 > 0) {
            if (this.aW <= 0) {
               this.aW = 20 * (30 - $$0);
            }

            this.aW--;
            if (this.aW <= 0) {
               this.q($$0 - 1);
            }
         }

         int $$1 = this.fc();
         if ($$1 > 0) {
            if (this.aX <= 0) {
               this.aX = 20 * (30 - $$1);
            }

            this.aX--;
            if (this.aX <= 0) {
               this.r($$1 - 1);
            }
         }

         int $$2 = this.fd();
         if ($$2 > 0) {
            if (this.aY <= 0) {
               this.aY = 20 * (30 - $$2);
            }

            this.aY--;
            if (this.aY <= 0) {
               this.s($$2 - 1);
            }
         }

         this.D();
         if (this.am % 20 == 0) {
            this.eX().c();
         }

         if (this.fU() && !this.K()) {
            this.fV();
         }
      }

      if (!this.dP()) {
         this.m_();
      }

      double $$3 = this.dz() - this.M;
      double $$4 = this.dF() - this.O;
      float $$5 = (float)($$3 * $$3 + $$4 * $$4);
      float $$6 = this.bj;
      float $$7 = 0.0F;
      this.br = this.bs;
      float $$8 = 0.0F;
      if ($$5 > 0.0025000002F) {
         $$8 = 1.0F;
         $$7 = (float)Math.sqrt((double)$$5) * 3.0F;
         float $$9 = (float)aym.d($$4, $$3) * (180.0F / (float)Math.PI) - 90.0F;
         float $$10 = aym.e(aym.g(this.dK()) - $$9);
         if (95.0F < $$10 && $$10 < 265.0F) {
            $$6 = $$9 - 180.0F;
         } else {
            $$6 = $$9;
         }
      }

      if (this.bd > 0.0F) {
         $$6 = this.dK();
      }

      if (!this.aE()) {
         $$8 = 0.0F;
      }

      this.bs = this.bs + ($$8 - this.bs) * 0.3F;
      this.dU().ag().a("headTurn");
      $$7 = this.e($$6, $$7);
      this.dU().ag().c();
      this.dU().ag().a("rangeChecks");

      while (this.dK() - this.P < -180.0F) {
         this.P -= 360.0F;
      }

      while (this.dK() - this.P >= 180.0F) {
         this.P += 360.0F;
      }

      while (this.bj - this.bk < -180.0F) {
         this.bk -= 360.0F;
      }

      while (this.bj - this.bk >= 180.0F) {
         this.bk += 360.0F;
      }

      while (this.dM() - this.Q < -180.0F) {
         this.Q -= 360.0F;
      }

      while (this.dM() - this.Q >= 180.0F) {
         this.Q += 360.0F;
      }

      while (this.bl - this.bm < -180.0F) {
         this.bm -= 360.0F;
      }

      while (this.bl - this.bm >= 180.0F) {
         this.bm += 360.0F;
      }

      this.dU().ag().c();
      this.bt += $$7;
      if (this.fN()) {
         this.bM++;
      } else {
         this.bM = 0;
      }

      if (this.fU()) {
         this.s(0.0F);
      }

      this.y();
      float $$11 = this.em();
      if ($$11 != this.bP) {
         this.bP = $$11;
         this.i_();
      }
   }

   private void D() {
      Map<bsc, cuh> $$0 = this.E();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bsc, cuh> E() {
      Map<bsc, cuh> $$0 = null;

      for (bsc $$1 : bsc.values()) {
         cuh $$2 = switch ($$1.a()) {
            case a -> this.g($$1);
            case b -> this.f($$1);
            case c -> this.cj;
         };
         cuh $$3 = this.d($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bsc.class);
            }

            $$0.put($$1, $$3);
            bts $$4 = this.ff();
            if (!$$2.d()) {
               $$2.a($$1, ($$1x, $$2x) -> {
                  btr $$3x = $$4.a($$1x);
                  if ($$3x != null) {
                     $$3x.e($$2x);
                  }
               });
            }

            if (!$$3.d()) {
               $$3.a($$1, ($$1x, $$2x) -> {
                  btr $$3x = $$4.a($$1x);
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

   public boolean a(cuh $$0, cuh $$1) {
      return !cuh.a($$1, $$0);
   }

   private void a(Map<bsc, cuh> $$0) {
      cuh $$1 = $$0.get(bsc.a);
      cuh $$2 = $$0.get(bsc.b);
      if ($$1 != null && $$2 != null && cuh.a($$1, this.g(bsc.b)) && cuh.a($$2, this.g(bsc.a))) {
         ((aqt)this.dU()).l().b(this, new adb(this, (byte)55));
         $$0.remove(bsc.a);
         $$0.remove(bsc.b);
         this.c(bsc.a, $$1.r());
         this.c(bsc.b, $$2.r());
      }
   }

   private void b(Map<bsc, cuh> $$0) {
      List<Pair<bsc, cuh>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cuh $$3 = $$2.r();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
               break;
            case c:
               this.cj = $$3;
         }
      });
      ((aqt)this.dU()).l().b(this, new afe(this.al(), $$1));
   }

   private cuh f(bsc $$0) {
      return this.ci.get($$0.b());
   }

   private void b(bsc $$0, cuh $$1) {
      this.ci.set($$0.b(), $$1);
   }

   private cuh g(bsc $$0) {
      return this.ch.get($$0.b());
   }

   private void c(bsc $$0, cuh $$1) {
      this.ch.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = aym.g($$0 - this.bj);
      this.bj += $$2 * 0.3F;
      float $$3 = aym.g(this.dK() - this.bj);
      float $$4 = this.fx();
      if (Math.abs($$3) > $$4) {
         this.bj = this.bj + ($$3 - (float)aym.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float fx() {
      return 50.0F;
   }

   public void m_() {
      if (this.cr > 0) {
         this.cr--;
      }

      if (this.df()) {
         this.bC = 0;
         this.f(this.dz(), this.dB(), this.dF());
      }

      if (this.bC > 0) {
         this.a(this.bC, this.bD, this.bE, this.bF, this.bG, this.bH);
         this.bC--;
      } else if (!this.dg()) {
         this.g(this.dx().a(0.98));
      }

      if (this.bJ > 0) {
         this.a(this.bJ, this.bI);
         this.bJ--;
      }

      ewu $$0 = this.dx();
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
      this.dU().ag().a("ai");
      if (this.fp()) {
         this.by = false;
         this.bz = 0.0F;
         this.bB = 0.0F;
      } else if (this.dg()) {
         this.dU().ag().a("newAi");
         this.fz();
         this.dU().ag().c();
      }

      this.dU().ag().c();
      this.dU().ag().a("jump");
      if (this.by && this.en()) {
         double $$4;
         if (this.bx()) {
            $$4 = this.b(awj.b);
         } else {
            $$4 = this.b(awj.a);
         }

         boolean $$6 = this.bi() && $$4 > 0.0;
         double $$7 = this.dn();
         if (!$$6 || this.aE() && !($$4 > $$7)) {
            if (!this.bx() || this.aE() && !($$4 > $$7)) {
               if ((this.aE() || $$6 && $$4 <= $$7) && this.cr == 0) {
                  this.fs();
                  this.cr = 10;
               }
            } else {
               this.c(awj.b);
            }
         } else {
            this.c(awj.a);
         }
      } else {
         this.cr = 0;
      }

      this.dU().ag().c();
      this.dU().ag().a("travel");
      this.bz *= 0.98F;
      this.bB *= 0.98F;
      this.F();
      ewp $$8 = this.cP();
      ewu $$9 = new ewu((double)this.bz, (double)this.bA, (double)this.bB);
      if (this.b(brj.B) || this.b(brj.y)) {
         this.n();
      }

      label104: {
         if (this.cV() instanceof cly $$10 && this.bI()) {
            this.c($$10, $$9);
            break label104;
         }

         this.a($$9);
      }

      this.dU().ag().c();
      this.dU().ag().a("freezing");
      if (!this.dU().C && !this.eJ()) {
         int $$11 = this.cr();
         if (this.aF && this.dI()) {
            this.l(Math.min(this.cu(), $$11 + 1));
         } else {
            this.l(Math.max(0, $$11 - 2));
         }
      }

      this.ej();
      this.ek();
      if (!this.dU().C && this.am % 40 == 0 && this.ct() && this.dI()) {
         this.a(this.dX().v(), 1.0F);
      }

      this.dU().ag().c();
      this.dU().ag().a("push");
      if (this.bN > 0) {
         this.bN--;
         this.a($$8, this.cP());
      }

      this.s();
      this.dU().ag().c();
      if (!this.dU().C && this.fy() && this.bk()) {
         this.a(this.dX().i(), 1.0F);
      }
   }

   public boolean fy() {
      return false;
   }

   private void F() {
      boolean $$0 = this.j(7);
      if ($$0 && !this.aE() && !this.bW() && !this.b(brj.y)) {
         cuh $$1 = this.d(bsc.e);
         if (($$1.a(cuk.pj) || $$1.a(cuk.At)) && ctb.j($$1)) {
            $$0 = true;
            int $$2 = this.bM + 1;
            if (!this.dU().C && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, bsc.e);
               }

               this.a(dxv.n);
            }
         } else {
            $$0 = false;
         }
      } else {
         $$0 = false;
      }

      if (!this.dU().C) {
         this.b(7, $$0);
      }
   }

   protected void fz() {
   }

   protected void s() {
      if (this.dU().x_()) {
         this.dU().a(dxj.a(cly.class), this.cP(), bsa.a(this)).forEach(this::D);
      } else {
         List<brv> $$0 = this.dU().a(this, this.cP(), bsa.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dU().ab().c(dbw.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.al.a(4) == 0) {
               int $$2 = 0;

               for (brv $$3 : $$0) {
                  if (!$$3.bW()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dX().h(), 6.0F);
               }
            }

            for (brv $$4 : $$0) {
               this.D($$4);
            }
         }
      }
   }

   protected void a(ewp $$0, ewp $$1) {
      ewp $$2 = $$0.b($$1);
      List<brv> $$3 = this.dU().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (brv $$4 : $$3) {
            if ($$4 instanceof bso) {
               this.g((bso)$$4);
               this.bN = 0;
               this.g(this.dx().a(-0.2));
               break;
            }
         }
      } else if (this.R) {
         this.bN = 0;
      }

      if (!this.dU().C && this.bN <= 0) {
         this.c(4, false);
      }
   }

   protected void D(brv $$0) {
      $$0.h(this);
   }

   protected void g(bso $$0) {
   }

   public boolean fA() {
      return (this.as.a(aP) & 4) != 0;
   }

   @Override
   public void ae() {
      brv $$0 = this.dh();
      super.ae();
      if ($$0 != null && $$0 != this.dh() && !this.dU().C) {
         this.b($$0);
      }
   }

   @Override
   public void v() {
      super.v();
      this.br = this.bs;
      this.bs = 0.0F;
      this.n();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.bD = $$0;
      this.bE = $$1;
      this.bF = $$2;
      this.bG = (double)$$3;
      this.bH = (double)$$4;
      this.bC = $$5;
   }

   @Override
   public double c_() {
      return this.bC > 0 ? this.bD : this.dz();
   }

   @Override
   public double d_() {
      return this.bC > 0 ? this.bE : this.dB();
   }

   @Override
   public double M_() {
      return this.bC > 0 ? this.bF : this.dF();
   }

   @Override
   public float N_() {
      return this.bC > 0 ? (float)this.bH : this.dM();
   }

   @Override
   public float e_() {
      return this.bC > 0 ? (float)this.bG : this.dK();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bI = (double)$$0;
      this.bJ = $$1;
   }

   public void s(boolean $$0) {
      this.by = $$0;
   }

   public void a(cig $$0) {
      brv $$1 = $$0.t();
      if ($$1 instanceof aqu) {
         an.R.a((aqu)$$1, $$0.p(), this);
      }
   }

   public void a(brv $$0, int $$1) {
      if (!$$0.dP() && !this.dU().C && ($$0 instanceof cig || $$0 instanceof cme || $$0 instanceof bse)) {
         ((aqt)this.dU()).l().b($$0, new afy($$0.al(), this.al(), $$1));
      }
   }

   public boolean E(brv $$0) {
      if ($$0.dU() != this.dU()) {
         return false;
      } else {
         ewu $$1 = new ewu(this.dz(), this.dD(), this.dF());
         ewu $$2 = new ewu($$0.dz(), $$0.dD(), $$0.dF());
         return $$2.f($$1) > 128.0 ? false : this.dU().a(new dbj($$1, $$2, dbj.a.a, dbj.b.a, this)).c() == ews.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.bl : aym.i($$0, this.bm, this.bl);
   }

   public float z(float $$0) {
      float $$1 = this.bd - this.bc;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.bc + $$1 * $$0;
   }

   @Override
   public boolean bE() {
      return !this.dP();
   }

   @Override
   public boolean bF() {
      return this.bI() && !this.O_() && !this.p_();
   }

   @Override
   public float cx() {
      return this.bl;
   }

   @Override
   public void n(float $$0) {
      this.bl = $$0;
   }

   @Override
   public void o(float $$0) {
      this.bj = $$0;
   }

   @Override
   protected ewu a(iw.a $$0, l.a $$1) {
      return i(super.a($$0, $$1));
   }

   public static ewu i(ewu $$0) {
      return new ewu($$0.c, $$0.d, 0.0);
   }

   public float fB() {
      return this.cs;
   }

   public final void A(float $$0) {
      this.B(aym.a($$0, 0.0F, this.fa()));
   }

   protected void B(float $$0) {
      this.cs = $$0;
   }

   public void f_() {
   }

   public void g_() {
   }

   protected void fC() {
      this.cl = true;
   }

   public abstract bsi fD();

   public boolean fE() {
      return (this.as.a(aP) & 1) > 0;
   }

   public bpz fF() {
      return (this.as.a(aP) & 2) > 0 ? bpz.b : bpz.a;
   }

   private void G() {
      if (this.fE()) {
         if (cuh.b(this.b(this.fF()), this.bK)) {
            this.bK = this.b(this.fF());
            this.a(this.bK);
         } else {
            this.fK();
         }
      }
   }

   protected void a(cuh $$0) {
      $$0.b(this.dU(), this, this.fH());
      if (this.I()) {
         this.b($$0, 5);
      }

      if (--this.bL == 0 && !this.dU().C && !$$0.v()) {
         this.z();
      }
   }

   private boolean I() {
      int $$0 = this.bK.t() - this.fH();
      int $$1 = (int)((float)this.bK.t() * 0.21875F);
      boolean $$2 = $$0 > $$1;
      return $$2 && this.fH() % 4 == 0;
   }

   private void J() {
      this.cy = this.cx;
      if (this.ci()) {
         this.cx = Math.min(1.0F, this.cx + 0.09F);
      } else {
         this.cx = Math.max(0.0F, this.cx - 0.09F);
      }
   }

   protected void c(int $$0, boolean $$1) {
      int $$2 = this.as.a(aP);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.as.a(aP, (byte)$$2);
   }

   public void c(bpz $$0) {
      cuh $$1 = this.b($$0);
      if (!$$1.d() && !this.fE()) {
         this.bK = $$1;
         this.bL = $$1.t();
         if (!this.dU().C) {
            this.c(1, true);
            this.c(2, $$0 == bpz.b);
            this.a(dxv.D);
         }
      }
   }

   @Override
   public void a(ajy<?> $$0) {
      super.a($$0);
      if (cb.equals($$0)) {
         if (this.dU().C) {
            this.fS().ifPresent(this::a);
         }
      } else if (aP.equals($$0) && this.dU().C) {
         if (this.fE() && this.bK.d()) {
            this.bK = this.b(this.fF());
            if (!this.bK.d()) {
               this.bL = this.bK.t();
            }
         } else if (!this.fE() && !this.bK.d()) {
            this.bK = cuh.i;
            this.bL = 0;
         }
      }
   }

   @Override
   public void a(et.a $$0, ewu $$1) {
      super.a($$0, $$1);
      this.bm = this.bl;
      this.bj = this.bl;
      this.bk = this.bj;
   }

   protected void b(cuh $$0, int $$1) {
      if (!$$0.d() && this.fE()) {
         if ($$0.u() == cwk.c) {
            this.a(this.c($$0), 0.5F, this.dU().A.i() * 0.1F + 0.9F);
         }

         if ($$0.u() == cwk.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.al.a(2), (this.al.i() - this.al.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(cuh $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ewu $$3 = new ewu(((double)this.al.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dM() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dK() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.al.i()) * 0.6 - 0.3;
         ewu $$5 = new ewu(((double)this.al.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dM() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dK() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dz(), this.dD(), this.dF());
         this.dU().a(new kx(lb.Q, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   @Override
   protected void z() {
      if (!this.dU().C || this.fE()) {
         bpz $$0 = this.fF();
         if (!this.bK.equals(this.b($$0))) {
            this.fJ();
         } else {
            if (!this.bK.d() && this.fE()) {
               this.b(this.bK, 16);
               cuh $$1 = this.bK.a(this.dU(), this);
               if ($$1 != this.bK) {
                  this.a($$0, $$1);
               }

               this.fK();
            }
         }
      }
   }

   public cuh fG() {
      return this.bK;
   }

   public int fH() {
      return this.bL;
   }

   public int fI() {
      return this.fE() ? this.bK.t() - this.fH() : 0;
   }

   public void fJ() {
      if (!this.bK.d()) {
         this.bK.a(this.dU(), this, this.fH());
         if (this.bK.v()) {
            this.G();
         }
      }

      this.fK();
   }

   public void fK() {
      if (!this.dU().C) {
         boolean $$0 = this.fE();
         this.c(1, false);
         if ($$0) {
            this.a(dxv.C);
         }
      }

      this.bK = cuh.i;
      this.bL = 0;
   }

   public boolean fL() {
      if (this.fE() && !this.bK.d()) {
         cuc $$0 = this.bK.f();
         return $$0.c(this.bK) != cwk.d ? false : $$0.b(this.bK) - this.bL >= 5;
      } else {
         return false;
      }
   }

   public boolean fM() {
      return this.ca();
   }

   public boolean fN() {
      return this.j(7);
   }

   @Override
   public boolean ci() {
      return super.ci() || !this.fN() && this.c(bsz.b);
   }

   public int fO() {
      return this.bM;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dz();
      double $$5 = this.dB();
      double $$6 = this.dF();
      double $$7 = $$1;
      boolean $$8 = false;
      ir $$9 = ir.a($$0, $$1, $$2);
      dca $$10 = this.dU();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.J_()) {
            ir $$12 = $$9.d();
            dtc $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.c($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cP())) {
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

         if (this instanceof bsw $$14) {
            $$14.J().n();
         }

         return true;
      }
   }

   public boolean fP() {
      return !this.eJ();
   }

   public boolean fQ() {
      return true;
   }

   public void a(ir $$0, boolean $$1) {
   }

   public boolean f(cuh $$0) {
      return false;
   }

   @Override
   public final bry a(bsz $$0) {
      return $$0 == bsz.c ? aQ : this.e($$0).a(this.em());
   }

   protected bry e(bsz $$0) {
      return this.ak().n().a(this.el());
   }

   public ImmutableList<bsz> fR() {
      return ImmutableList.of(bsz.a);
   }

   public ewp f(bsz $$0) {
      bry $$1 = this.a($$0);
      return new ewp((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bsz $$0) {
      ewp $$1 = this.a($$0).a(this.ds());
      return this.dU().c(this, $$1);
   }

   @Override
   public boolean cB() {
      return super.cB() && !this.fU();
   }

   public Optional<ir> fS() {
      return this.as.a(cb);
   }

   public void i(ir $$0) {
      this.as.a(cb, Optional.of($$0));
   }

   public void fT() {
      this.as.a(cb, Optional.empty());
   }

   public boolean fU() {
      return this.fS().isPresent();
   }

   public void b(ir $$0) {
      if (this.bW()) {
         this.ae();
      }

      dtc $$1 = this.dU().a_($$0);
      if ($$1.b() instanceof deu) {
         this.dU().a($$0, $$1.a(deu.c, Boolean.valueOf(true)), 3);
      }

      this.b(bsz.c);
      this.a($$0);
      this.i($$0);
      this.g(ewu.b);
      this.az = true;
   }

   private void a(ir $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean K() {
      return this.fS().map($$0 -> this.dU().a_($$0).b() instanceof deu).orElse(false);
   }

   public void fV() {
      this.fS().filter(this.dU()::B).ifPresent($$0x -> {
         dtc $$1 = this.dU().a_($$0x);
         if ($$1.b() instanceof deu) {
            iw $$2 = $$1.c(deu.aE);
            this.dU().a($$0x, $$1.a(deu.c, Boolean.valueOf(false)), 3);
            ewu $$3 = deu.a(this.ak(), this.dU(), $$0x, $$2, this.dK()).orElseGet(() -> {
               ir $$1x = $$0x.c();
               return new ewu((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            ewu $$4 = ewu.c($$0x).d($$3).d();
            float $$5 = (float)aym.d(aym.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      ewu $$0 = this.ds();
      this.b(bsz.a);
      this.a_($$0.c, $$0.d, $$0.e);
      this.fT();
   }

   @Nullable
   public iw fW() {
      ir $$0 = this.fS().orElse(null);
      return $$0 != null ? deu.a(this.dU(), $$0) : null;
   }

   @Override
   public boolean bJ() {
      return !this.fU() && super.bJ();
   }

   public cuh g(cuh $$0) {
      return cuh.i;
   }

   public cuh a(dca $$0, cuh $$1) {
      cov $$2 = $$1.a(ke.t);
      if ($$2 != null) {
         $$0.a(null, this.dz(), this.dB(), this.dF(), this.d($$1), avq.g, 1.0F, 1.0F + ($$0.A.i() - $$0.A.i()) * 0.4F);
         this.a($$2);
         $$1.a(1, this);
         this.a(dxv.m);
      }

      return $$1;
   }

   private void a(cov $$0) {
      if (!this.dU().x_()) {
         for (cov.b $$2 : $$0.g()) {
            if (this.al.i() < $$2.b()) {
               this.b($$2.a());
            }
         }
      }
   }

   private static byte h(bsc $$0) {
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

   public void e(bsc $$0) {
      this.dU().a(this, h($$0));
   }

   public static bsc d(bpz $$0) {
      return $$0 == bpz.a ? bsc.a : bsc.b;
   }

   @Override
   public ewp h_() {
      if (this.d(bsc.f).a(cuk.wb)) {
         float $$0 = 0.5F;
         return this.cP().c(0.5, 0.5, 0.5);
      } else {
         return super.h_();
      }
   }

   public static bsc h(cuh $$0) {
      cth $$1 = cth.c_($$0);
      return $$1 != null ? $$1.k() : bsc.a;
   }

   private static btf a(bso $$0, bsc $$1) {
      return $$1 != bsc.f && $$1 != bsc.a && $$1 != bsc.b ? btf.a($$0, $$1, $$1x -> $$1x.d() || bsq.h($$1x) == $$1) : btf.a($$0, $$1);
   }

   @Nullable
   private static bsc t(int $$0) {
      if ($$0 == 100 + bsc.f.b()) {
         return bsc.f;
      } else if ($$0 == 100 + bsc.e.b()) {
         return bsc.e;
      } else if ($$0 == 100 + bsc.d.b()) {
         return bsc.d;
      } else if ($$0 == 100 + bsc.c.b()) {
         return bsc.c;
      } else if ($$0 == 98) {
         return bsc.a;
      } else if ($$0 == 99) {
         return bsc.b;
      } else {
         return $$0 == 105 ? bsc.g : null;
      }
   }

   @Override
   public btf a_(int $$0) {
      bsc $$1 = t($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dI() {
      if (this.O_()) {
         return false;
      } else {
         boolean $$0 = !this.d(bsc.f).a(awm.bb) && !this.d(bsc.e).a(awm.bb) && !this.d(bsc.d).a(awm.bb) && !this.d(bsc.c).a(awm.bb);
         return $$0 && super.dI();
      }
   }

   @Override
   public boolean cl() {
      return !this.dU().x_() && this.b(brj.x) || super.cl();
   }

   @Override
   public float dL() {
      return this.bj;
   }

   @Override
   public void a(abx $$0) {
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      float $$4 = $$0.n();
      float $$5 = $$0.m();
      this.f($$1, $$2, $$3);
      this.bj = $$0.o();
      this.bl = $$0.o();
      this.bk = this.bj;
      this.bm = this.bl;
      this.e($$0.b());
      this.a_($$0.e());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.o($$0.j(), $$0.k(), $$0.l());
   }

   public boolean fX() {
      return this.fg().f() instanceof cry;
   }

   @Override
   public float dO() {
      float $$0 = (float)this.g(btv.v);
      return this.cV() instanceof cly ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public ewu m(brv $$0) {
      return this.ds().e(this.a($$0, this.a(this.ar()), this.em() * this.el()));
   }

   protected void a(int $$0, double $$1) {
      this.bl = (float)aym.e(1.0 / (double)$$0, (double)this.bl, $$1);
   }

   @Override
   public void h(int $$0) {
      super.h(dam.a(this, $$0));
   }

   public boolean fY() {
      return false;
   }

   @Nullable
   public cig a(cuh $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cig a(cuh $$0, boolean $$1, boolean $$2) {
      if ($$0.d()) {
         return null;
      } else {
         if (this.dU().C) {
            this.a(bpz.a);
         }

         double $$3 = this.dD() - 0.3F;
         cig $$4 = new cig(this.dU(), this.dz(), $$3, this.dF(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.al.i() * 0.5F;
            float $$6 = this.al.i() * (float) (Math.PI * 2);
            $$4.o((double)(-aym.a($$6) * $$5), 0.2F, (double)(aym.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = aym.a(this.dM() * (float) (Math.PI / 180.0));
            float $$9 = aym.b(this.dM() * (float) (Math.PI / 180.0));
            float $$10 = aym.a(this.dK() * (float) (Math.PI / 180.0));
            float $$11 = aym.b(this.dK() * (float) (Math.PI / 180.0));
            float $$12 = this.al.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.al.i();
            $$4.o(
               (double)(-$$10 * $$9 * 0.3F) + Math.cos((double)$$12) * (double)$$13,
               (double)(-$$8 * 0.3F + 0.1F + (this.al.i() - this.al.i()) * 0.1F),
               (double)($$11 * $$9 * 0.3F) + Math.sin((double)$$12) * (double)$$13
            );
         }

         if (!(this instanceof cly) && !this.dU().C) {
            this.dU().b($$4);
         }

         return $$4;
      }
   }

   @Override
   public bqa a(cly $$0, bpz $$1) {
      if ($$0.b($$1).a(cuk.AA)) {
         cuh $$2 = this.d(bsc.e);
         if ($$2.a(cuk.rq)) {
            cvf.a($$0.dU(), this);
            if (this.dU().C) {
               return bqa.b;
            }

            if (this instanceof cly $$3) {
               $$3.a(avz.aI);
               if ($$3 instanceof aqu $$4) {
                  an.af.a($$4);
               }
            }

            if ($$0 instanceof aqu $$5) {
               an.ap.a($$5);
            }

            $$2.a($$2.n(), this, bsc.e);
            cuc $$6 = cva.j($$2);

            for (int $$7 = 0; $$7 < 8; $$7++) {
               this.a(new cuh($$6, 1), true, false);
            }

            this.a(dxv.r, $$0);
            return bqa.a;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   public boolean aG() {
      return this.b(brj.I) && !this.bi() && !this.O_() && !this.bx() && this.bI();
   }

   public static record a(avn a, avn b) {
   }
}
