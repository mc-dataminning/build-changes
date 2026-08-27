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

public abstract class blg extends bkq implements bko {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final bmk bA = new bmk(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, bmk.a.c);
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
   protected static final afo<Byte> t = afr.a(blg.class, afq.a);
   private static final afo<Float> bH = afr.a(blg.class, afq.d);
   private static final afo<Integer> bI = afr.a(blg.class, afq.b);
   private static final afo<Boolean> bJ = afr.a(blg.class, afq.k);
   private static final afo<Integer> bK = afr.a(blg.class, afq.b);
   private static final afo<Integer> bL = afr.a(blg.class, afq.b);
   private static final afo<Optional<ht>> bM = afr.a(blg.class, afq.o);
   protected static final float u = 1.74F;
   protected static final bkr v = bkr.c(0.2F, 0.2F);
   public static final float aE = 0.5F;
   private final bmj bN;
   private final bjl bO = new bjl(this);
   private final Map<bkb, bkd> bP = Maps.newHashMap();
   private final il<clj> bQ = il.a(2, clj.b);
   private final il<clj> bR = il.a(4, clj.b);
   public boolean aF;
   private boolean bS = false;
   public biw aG;
   public int aH;
   public int aI;
   public int aJ;
   public int aK;
   public int aL;
   public int aM;
   public float aN;
   public float aO;
   protected int aP;
   public final bmf aQ = new bmf();
   public final int aR = 20;
   public final float aS;
   public final float aT;
   public float aU;
   public float aV;
   public float aW;
   public float aX;
   @Nullable
   protected cdu aY;
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
   private blg bU;
   private int bV;
   private blg bW;
   private int bX;
   private float bY;
   private int bZ;
   private float ca;
   protected clj bv = clj.b;
   protected int bw;
   protected int bx;
   private ht cb;
   private Optional<ht> cc = Optional.empty();
   @Nullable
   private bjo cd;
   private long ce;
   protected int by;
   private float cf;
   private float cg;
   protected bmg<?> bz;
   private boolean ch;

   protected blg(bku<? extends blg> $$0, csa $$1) {
      super($$0, $$1);
      this.bN = new bmj(bmn.a($$0));
      this.c(this.eN());
      this.I = true;
      this.aT = (float)((Math.random() + 1.0) * 0.01F);
      this.ar();
      this.aS = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.aW = this.dD();
      this.t(0.6F);
      sn $$2 = sn.a;
      this.bz = this.a(new Dynamic($$2, (sw)$$2.createMap(ImmutableMap.of($$2.a("memories"), (sw)$$2.emptyMap()))));
   }

   public bmg<?> dP() {
      return this.bz;
   }

   protected bmg.b<?> dQ() {
      return bmg.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bmg<?> a(Dynamic<?> $$0) {
      return this.dQ().a($$0);
   }

   @Override
   public void al() {
      this.a(this.dO().w(), Float.MAX_VALUE);
   }

   public boolean a(bku<?> $$0) {
      return true;
   }

   @Override
   protected void b_() {
      this.an.a(t, (byte)0);
      this.an.a(bI, 0);
      this.an.a(bJ, false);
      this.an.a(bK, 0);
      this.an.a(bL, 0);
      this.an.a(bH, 1.0F);
      this.an.a(bM, Optional.empty());
   }

   public static bml.a dR() {
      return bml.a().a(bmm.l).a(bmm.i).a(bmm.m).a(bmm.a).a(bmm.b).a(bmm.k);
   }

   @Override
   protected void a(double $$0, boolean $$1, dhi $$2, ht $$3) {
      if (!this.aZ()) {
         this.bh();
      }

      if (!this.dN().B && $$1 && this.ab > 0.0F) {
         this.dW();
         this.dX();
      }

      if (!this.dN().B && this.ab > 3.0F && $$1 && !$$2.i()) {
         double $$4 = this.ds();
         double $$5 = this.du();
         double $$6 = this.dy();
         ht $$7 = this.dn();
         if ($$3.u() != $$7.u() || $$3.w() != $$7.w()) {
            double $$8 = $$4 - (double)$$3.u() - 0.5;
            double $$9 = $$6 - (double)$$3.w() - 0.5;
            double $$10 = Math.max(Math.abs($$8), Math.abs($$9));
            $$4 = (double)$$3.u() + 0.5 + $$8 / $$10 * 0.5;
            $$6 = (double)$$3.w() + 0.5 + $$9 / $$10 * 0.5;
         }

         float $$11 = (float)atm.f(this.ab - 3.0F);
         double $$12 = Math.min((double)(0.2F + $$11 / 15.0F), 2.5);
         int $$13 = (int)(150.0 * $$12);
         ((ame)this.dN()).a(new jk(js.c, $$2), $$4, $$5, $$6, $$13, 0.0, 0.0, 0.0, 0.15F);
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cc = Optional.empty();
      }
   }

   public final boolean dS() {
      return this.ai().a(arj.m);
   }

   public float a(float $$0) {
      return atm.i($$0, this.cg, this.cf);
   }

   @Override
   public void as() {
      this.aN = this.aO;
      if (this.am) {
         this.fC().ifPresent(this::a);
      }

      if (this.dT()) {
         this.dU();
      }

      super.as();
      this.dN().ae().a("livingEntityBaseTick");
      if (this.aY() || this.dN().B) {
         this.aA();
      }

      if (this.bx()) {
         boolean $$0 = this instanceof cdu;
         if (!this.dN().B) {
            if (this.by()) {
               this.a(this.dO().f(), 1.0F);
            } else if ($$0 && !this.dN().C_().a(this.cH())) {
               double $$1 = this.dN().C_().a(this) + this.dN().C_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dN().C_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dO().v(), (float)Math.max(1, atm.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(arl.a) && !this.dN().a_(ht.a(this.ds(), this.dw(), this.dy())).a(cvc.nd)) {
            boolean $$3 = !this.dS() && !bke.c(this) && (!$$0 || !((cdu)this).fU().a);
            if ($$3) {
               this.j(this.m(this.ci()));
               if (this.ci() == -20) {
                  this.j(0);
                  eju $$4 = this.dq();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.ag.j() - this.ag.j();
                     double $$7 = this.ag.j() - this.ag.j();
                     double $$8 = this.ag.j() - this.ag.j();
                     this.dN().a(js.e, this.ds() + $$6, this.du() + $$7, this.dy() + $$8, $$4.c, $$4.d, $$4.e);
                  }

                  this.a(this.dO().h(), 2.0F);
               }
            }

            if (!this.dN().B && this.bO() && this.da() != null && this.da().bQ()) {
               this.ac();
            }
         } else if (this.ci() < this.ch()) {
            this.j(this.n(this.ci()));
         }

         if (!this.dN().B) {
            ht $$9 = this.dn();
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

      if (this.al > 0 && !(this instanceof amf)) {
         this.al--;
      }

      if (this.ex() && this.dN().h(this)) {
         this.ec();
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

      this.eo();
      this.bf = this.be;
      this.aV = this.aU;
      this.aX = this.aW;
      this.N = this.dD();
      this.O = this.dF();
      this.dN().ae().c();
   }

   public boolean dT() {
      return this.ah % 5 == 0 && this.dq().c != 0.0 && this.dq().e != 0.0 && !this.O_() && cpw.k(this) && this.dV();
   }

   protected void dU() {
      eju $$0 = this.dq();
      this.dN()
         .a(
            js.I,
            this.ds() + (this.ag.j() - 0.5) * (double)this.dh(),
            this.du() + 0.1,
            this.dy() + (this.ag.j() - 0.5) * (double)this.dh(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.ag.i() * 0.4F + this.ag.i() > 0.9F ? 0.6F : 0.0F;
      this.a(aqr.wy, $$1, 0.6F + this.ag.i() * 0.4F);
   }

   protected boolean dV() {
      return this.dN().a_(this.aI()).a(arg.aM);
   }

   @Override
   protected float aL() {
      return this.dV() && cpw.a(cpy.l, this) > 0 ? 1.0F : super.aL();
   }

   @Override
   protected boolean c(dhi $$0) {
      return !$$0.i() || this.fx();
   }

   protected void dW() {
      bmi $$0 = this.a(bmm.m);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void dX() {
      if (!this.bj().i()) {
         int $$0 = cpw.a(cpy.l, this);
         if ($$0 > 0 && this.dV()) {
            bmi $$1 = this.a(bmm.m);
            if ($$1 == null) {
               return;
            }

            $$1.b(new bmk(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), bmk.a.a));
            if (this.eh().i() < 0.04F) {
               clj $$2 = this.c(bkv.c);
               $$2.a(1, this, $$0x -> $$0x.d(bkv.c));
            }
         }
      }
   }

   protected void dY() {
      bmi $$0 = this.a(bmm.m);
      if ($$0 != null) {
         if ($$0.a(e) != null) {
            $$0.b(e);
         }
      }
   }

   protected void dZ() {
      if (!this.bj().i()) {
         int $$0 = this.cj();
         if ($$0 > 0) {
            bmi $$1 = this.a(bmm.m);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.ck();
            $$1.b(new bmk(e, "Powder snow slow", (double)$$2, bmk.a.a));
         }
      }
   }

   protected void c(ht $$0) {
      int $$1 = cpw.a(cpy.j, this);
      if ($$1 > 0) {
         cqb.a(this, this.dN(), $$0, $$1);
      }

      if (this.c(this.bj())) {
         this.dW();
      }

      this.dX();
   }

   public boolean n_() {
      return false;
   }

   public float ea() {
      return this.n_() ? 0.5F : 1.0F;
   }

   protected boolean eb() {
      return true;
   }

   protected void ec() {
      this.aM++;
      if (this.aM >= 20 && !this.dN().x_() && !this.dI()) {
         this.dN().a(this, (byte)60);
         this.a(bkq.c.a);
      }
   }

   public boolean ed() {
      return !this.n_();
   }

   protected boolean ee() {
      return !this.n_();
   }

   protected int m(int $$0) {
      int $$1 = cpw.e(this);
      return $$1 > 0 && this.ag.a($$1 + 1) > 0 ? $$0 : $$0 - 1;
   }

   protected int n(int $$0) {
      return Math.min($$0 + 4, this.ch());
   }

   public int ef() {
      return 0;
   }

   protected boolean eg() {
      return false;
   }

   public ats eh() {
      return this.ag;
   }

   @Nullable
   public blg ei() {
      return this.bU;
   }

   @Override
   public blg U_() {
      return this.ei();
   }

   public int ej() {
      return this.bV;
   }

   public void c(@Nullable cdu $$0) {
      this.aY = $$0;
      this.aZ = this.ah;
   }

   public void a(@Nullable blg $$0) {
      this.bU = $$0;
      this.bV = this.ah;
   }

   @Nullable
   public blg ek() {
      return this.bW;
   }

   public int el() {
      return this.bX;
   }

   public void A(bkq $$0) {
      if ($$0 instanceof blg) {
         this.bW = (blg)$$0;
      } else {
         this.bW = null;
      }

      this.bX = this.ah;
   }

   public int em() {
      return this.bb;
   }

   public void o(int $$0) {
      this.bb = $$0;
   }

   public boolean en() {
      return this.bS;
   }

   public void p(boolean $$0) {
      this.bS = $$0;
   }

   protected boolean a(bkv $$0) {
      return true;
   }

   public void a(bkv $$0, clj $$1, clj $$2) {
      boolean $$3 = $$2.b() && $$1.b();
      if (!$$3 && !clj.c($$1, $$2) && !this.am) {
         ckk $$4 = ckk.c_($$2);
         if (!this.dN().x_() && !this.O_()) {
            if (!this.aU() && $$4 != null && $$4.g() == $$0) {
               this.dN().a(null, this.ds(), this.du(), this.dy(), $$4.ar_(), this.dc(), 1.0F, 1.0F);
            }

            if (this.a($$0)) {
               this.a($$4 != null ? dls.v : dls.S);
            }
         }
      }
   }

   @Override
   public void a(bkq.c $$0) {
      super.a($$0);
      this.bz.a();
   }

   @Override
   public void b(rz $$0) {
      $$0.a("Health", this.ew());
      $$0.a("HurtTime", (short)this.aK);
      $$0.a("HurtByTimestamp", this.bV);
      $$0.a("DeathTime", (short)this.aM);
      $$0.a("AbsorptionAmount", this.fl());
      $$0.a("Attributes", this.eS().c());
      if (!this.bP.isEmpty()) {
         sf $$1 = new sf();

         for (bkd $$2 : this.bP.values()) {
            $$1.add($$2.a(new rz()));
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fx());
      this.fC().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<sw> $$3 = this.bz.a(sn.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(rz $$0) {
      this.z($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dN() != null && !this.dN().B) {
         this.eS().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         sf $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            rz $$3 = $$1.a($$2);
            bkd $$4 = bkd.b($$3);
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
         ekr $$6 = this.dN().J().d($$5);
         boolean $$7 = $$6 != null && this.dN().J().a(this.cx(), $$6);
         if (!$$7) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         ht $$8 = new ht($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$8);
         this.an.b(as, bls.c);
         if (!this.am) {
            this.a($$8);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bz = this.a(new Dynamic(sn.a, $$0.c("Brain")));
      }
   }

   protected void eo() {
      Iterator<bkb> $$0 = this.bP.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            bkb $$1 = $$0.next();
            bkd $$2 = this.bP.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dN().B) {
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
         if (!this.dN().B) {
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
            this.dN().a($$4 ? js.a : js.v, this.d(0.5), this.dv(), this.g(0.5), $$7, $$8, $$9);
         }
      }
   }

   protected void J() {
      if (this.bP.isEmpty()) {
         this.er();
         this.j(false);
      } else {
         Collection<bkd> $$0 = this.bP.values();
         this.an.b(bJ, c($$0));
         this.an.b(bI, cni.a($$0));
         this.j(this.a(bkf.n));
      }
   }

   private void u() {
      boolean $$0 = this.cd();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable bkq $$0) {
      double $$1 = 1.0;
      if (this.bV()) {
         $$1 *= 0.8;
      }

      if (this.ce()) {
         float $$2 = this.eW();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         clj $$3 = this.c(bkv.f);
         bku<?> $$4 = $$0.ai();
         if ($$4 == bku.aJ && $$3.a(clm.ud)
            || $$4 == bku.bp && $$3.a(clm.ug)
            || $$4 == bku.aw && $$3.a(clm.uj)
            || $$4 == bku.ax && $$3.a(clm.uj)
            || $$4 == bku.u && $$3.a(clm.uh)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(blg $$0) {
      return $$0 instanceof cdu && this.dN().aj() == biu.a ? false : $$0.ep();
   }

   public boolean a(blg $$0, bvs $$1) {
      return $$1.a(this, $$0);
   }

   public boolean ep() {
      return !this.cr() && this.eq();
   }

   public boolean eq() {
      return !this.O_() && this.bx();
   }

   public static boolean c(Collection<bkd> $$0) {
      for (bkd $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void er() {
      this.an.b(bJ, false);
      this.an.b(bI, 0);
   }

   public boolean es() {
      if (this.dN().B) {
         return false;
      } else {
         Iterator<bkd> $$0 = this.bP.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<bkd> et() {
      return this.bP.values();
   }

   public Map<bkb, bkd> eu() {
      return this.bP;
   }

   public boolean a(bkb $$0) {
      return this.bP.containsKey($$0);
   }

   @Nullable
   public bkd b(bkb $$0) {
      return this.bP.get($$0);
   }

   public final boolean b(bkd $$0) {
      return this.b($$0, null);
   }

   public boolean b(bkd $$0, @Nullable bkq $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         bkd $$2 = this.bP.get($$0.c());
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

   public boolean c(bkd $$0) {
      if (this.eT() == bll.b) {
         bkb $$1 = $$0.c();
         if ($$1 == bkf.j || $$1 == bkf.s) {
            return false;
         }
      }

      return true;
   }

   public void c(bkd $$0, @Nullable bkq $$1) {
      if (this.c($$0)) {
         bkd $$2 = this.bP.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean ev() {
      return this.eT() == bll.b;
   }

   @Nullable
   public bkd c(@Nullable bkb $$0) {
      return this.bP.remove($$0);
   }

   public boolean d(bkb $$0) {
      bkd $$1 = this.c($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(bkd $$0, @Nullable bkq $$1) {
      this.bT = true;
      if (!this.dN().B) {
         $$0.c().a(this.eS(), $$0.e());
         this.d($$0);
      }
   }

   public void d(bkd $$0) {
      for (bkq $$1 : this.cQ()) {
         if ($$1 instanceof amf $$2) {
            $$2.c.b(new acg(this.aj(), $$0));
         }
      }
   }

   protected void a(bkd $$0, boolean $$1, @Nullable bkq $$2) {
      this.bT = true;
      if ($$1 && !this.dN().B) {
         bkb $$3 = $$0.c();
         $$3.a(this.eS());
         $$3.a(this.eS(), $$0.e());
         this.y();
      }

      if (!this.dN().B) {
         this.d($$0);
      }
   }

   protected void a(bkd $$0) {
      this.bT = true;
      if (!this.dN().B) {
         $$0.c().a(this.eS());
         this.y();

         for (bkq $$1 : this.cQ()) {
            if ($$1 instanceof amf $$2) {
               $$2.c.b(new aam(this.aj(), $$0.c()));
            }
         }
      }
   }

   private void y() {
      for (bmi $$0 : this.eS().a()) {
         this.d($$0.a());
      }
   }

   private void d(bmh $$0) {
      if ($$0 == bmm.l) {
         float $$1 = this.eN();
         if (this.ew() > $$1) {
            this.c($$1);
         }
      } else if ($$0 == bmm.k) {
         float $$2 = this.eO();
         if (this.fl() > $$2) {
            this.y($$2);
         }
      }
   }

   public void b(float $$0) {
      float $$1 = this.ew();
      if ($$1 > 0.0F) {
         this.c($$1 + $$0);
      }
   }

   public float ew() {
      return this.an.b(bH);
   }

   public void c(float $$0) {
      this.an.b(bH, atm.a($$0, 0.0F, this.eN()));
   }

   public boolean ex() {
      return this.ew() <= 0.0F;
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dN().B) {
         return false;
      } else if (this.ex()) {
         return false;
      } else if ($$0.a(ari.i) && this.a(bkf.l)) {
         return false;
      } else {
         if (this.fE() && !this.dN().B) {
            this.fF();
         }

         this.bb = 0;
         float $$2 = $$1;
         boolean $$3 = false;
         float $$4 = 0.0F;
         if ($$1 > 0.0F && this.f($$0)) {
            this.u($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.a(ari.j) && $$0.c() instanceof blg $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(ari.o) && this.ai().a(arj.l)) {
            $$1 *= 5.0F;
         }

         this.aQ.a(1.5F);
         boolean $$7 = true;
         if ((float)this.al > 10.0F && !$$0.a(ari.e)) {
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

         if ($$0.a(ari.a) && !this.c(bkv.f).b()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         bkq $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof blg $$9 && !$$0.a(ari.q)) {
               this.a($$9);
            }

            if ($$8 instanceof cdu $$10) {
               this.aZ = 100;
               this.aY = $$10;
            } else if ($$8 instanceof bxu $$11 && $$11.u()) {
               this.aZ = 100;
               if ($$11.Q_() instanceof cdu $$12) {
                  this.aY = $$12;
               } else {
                  this.aY = null;
               }
            }
         }

         if ($$7) {
            if ($$3) {
               this.dN().a(this, (byte)29);
            } else {
               this.dN().a(this, $$0);
            }

            if (!$$0.a(ari.r) && (!$$3 || $$1 > 0.0F)) {
               this.bq();
            }

            if ($$8 != null && !$$0.a(ari.z)) {
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

         if (this.ex()) {
            if (!this.h($$0)) {
               aqq $$15 = this.m_();
               if ($$7 && $$15 != null) {
                  this.a($$15, this.eX(), this.eY());
               }

               this.a($$0);
            }
         } else if ($$7) {
            this.e($$0);
         }

         boolean $$16 = !$$3 || $$1 > 0.0F;
         if ($$16) {
            this.cd = $$0;
            this.ce = this.dN().W();
         }

         if (this instanceof amf) {
            al.h.a((amf)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((amf)this).a(arb.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof amf) {
            al.g.a((amf)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$16;
      }
   }

   protected void d(blg $$0) {
      $$0.e(this);
   }

   protected void e(blg $$0) {
      $$0.q(0.5, $$0.ds() - this.ds(), $$0.dy() - this.dy());
   }

   private boolean h(bjo $$0) {
      if ($$0.a(ari.d)) {
         return false;
      } else {
         clj $$1 = null;

         for (biw $$2 : biw.values()) {
            clj $$3 = this.b($$2);
            if ($$3.a(clm.vl)) {
               $$1 = $$3.p();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof amf $$4) {
               $$4.b(arb.c.b(clm.vl));
               al.B.a($$4, $$1);
               this.a(dls.C);
            }

            this.c(1.0F);
            this.es();
            this.b(new bkd(bkf.j, 900, 1));
            this.b(new bkd(bkf.v, 100, 1));
            this.b(new bkd(bkf.l, 800, 0));
            this.dN().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bjo ey() {
      if (this.dN().W() - this.ce > 40L) {
         this.cd = null;
      }

      return this.cd;
   }

   protected void e(bjo $$0) {
      aqq $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eX(), this.eY());
      }
   }

   public boolean f(bjo $$0) {
      bkq $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cea $$3 && $$3.D() > 0) {
         $$2 = true;
      }

      if (!$$0.a(ari.c) && this.fv() && !$$2) {
         eju $$4 = $$0.h();
         if ($$4 != null) {
            eju $$5 = this.b(0.0F, this.cp());
            eju $$6 = $$4.a(this.dl());
            $$6 = new eju($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(clj $$0) {
      if (!$$0.b()) {
         if (!this.aU()) {
            this.dN().a(this.ds(), this.du(), this.dy(), aqr.mt, this.dc(), 0.8F, 0.8F + this.dN().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bjo $$0) {
      if (!this.dI() && !this.ba) {
         bkq $$1 = $$0.d();
         blg $$2 = this.eM();
         if (this.bh >= 0 && $$2 != null) {
            $$2.a(this, this.bh, $$0);
         }

         if (this.fE()) {
            this.fF();
         }

         if (!this.dN().B && this.ae()) {
            b.info("Named entity {} died: {}", this, this.eL().a().getString());
         }

         this.ba = true;
         this.eL().c();
         if (this.dN() instanceof ame $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(dls.p);
               this.g($$0);
               this.f($$2);
            }

            this.dN().a(this, (byte)3);
         }

         this.b(bls.h);
      }
   }

   protected void f(@Nullable blg $$0) {
      if (!this.dN().B) {
         boolean $$1 = false;
         if ($$0 instanceof cab) {
            if (this.dN().Y().b(crw.c)) {
               ht $$2 = this.dn();
               dhi $$3 = cvc.cd.o();
               if (this.dN().a_($$2).i() && $$3.a((csd)this.dN(), $$2)) {
                  this.dN().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               can $$4 = new can(this.dN(), this.ds(), this.du(), this.dy(), new clj(clm.dv));
               this.dN().b($$4);
            }
         }
      }
   }

   protected void g(bjo $$0) {
      bkq $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof cdu) {
         $$2 = cpw.h((blg)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.aZ > 0;
      if (this.ee() && this.dN().Y().b(crw.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.ez();
      this.eA();
   }

   protected void ez() {
   }

   protected void eA() {
      if (this.dN() instanceof ame && !this.eE() && (this.eg() || this.aZ > 0 && this.ed() && this.dN().Y().b(crw.f))) {
         bkw.a((ame)this.dN(), this.dl(), this.ef());
      }
   }

   protected void a(bjo $$0, int $$1, boolean $$2) {
   }

   public agi eB() {
      return this.ai().j();
   }

   public long eC() {
      return 0L;
   }

   protected void a(bjo $$0, boolean $$1) {
      agi $$2 = this.eB();
      eff $$3 = this.dN().n().aJ().getLootTable($$2);
      efd.a $$4 = new efd.a((ame)this.dN()).a(ehi.a, this).a(ehi.f, this.dl()).a(ehi.c, $$0).b(ehi.d, $$0.d()).b(ehi.e, $$0.c());
      if ($$1 && this.aY != null) {
         $$4 = $$4.a(ehi.b, this.aY).a(this.aY.gp());
      }

      efd $$5 = $$4.a(ehh.g);
      $$3.a($$5, this.eC(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.b(bmm.i);
      if (!($$0 <= 0.0)) {
         this.au = true;
         eju $$3 = this.dq();
         eju $$4 = new eju($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aC() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected aqq d(bjo $$0) {
      return aqr.jt;
   }

   @Nullable
   protected aqq m_() {
      return aqr.jo;
   }

   private aqq d(int $$0) {
      return $$0 > 4 ? this.eH().b() : this.eH().a();
   }

   public void eD() {
      this.ch = true;
   }

   public boolean eE() {
      return this.ch;
   }

   public float eF() {
      return 0.0F;
   }

   protected ejp eG() {
      ejp $$0 = this.cH();
      bkq $$1 = this.da();
      if ($$1 != null) {
         eju $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public blg.a eH() {
      return new blg.a(aqr.ju, aqr.jm);
   }

   protected aqq c(clj $$0) {
      return $$0.N();
   }

   public aqq d(clj $$0) {
      return $$0.O();
   }

   public Optional<ht> eI() {
      return this.cc;
   }

   public boolean d_() {
      if (this.O_()) {
         return false;
      } else {
         ht $$0 = this.dn();
         dhi $$1 = this.do();
         if ($$1.a(arg.aO)) {
            this.cc = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof ddm && this.c($$0, $$1)) {
            this.cc = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(ht $$0, dhi $$1) {
      if ($$1.c(ddm.b)) {
         dhi $$2 = this.dN().a_($$0.d());
         if ($$2.a(cvc.cO) && $$2.c(czf.b) == $$1.c(ddm.aE)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean bx() {
      return !this.dI() && this.ew() > 0.0F;
   }

   @Override
   public boolean a(float $$0, float $$1, bjo $$2) {
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
      if (this.ai().a(arj.o)) {
         return 0;
      } else {
         bkd $$2 = this.b(bkf.h);
         float $$3 = $$2 == null ? 0.0F : (float)($$2.e() + 1);
         return atm.f(($$0 - 3.0F - $$3) * $$1);
      }
   }

   protected void eJ() {
      if (!this.aU()) {
         int $$0 = atm.a(this.ds());
         int $$1 = atm.a(this.du() - 0.2F);
         int $$2 = atm.a(this.dy());
         dhi $$3 = this.dN().a_(new ht($$0, $$1, $$2));
         if (!$$3.i()) {
            dcm $$4 = $$3.w();
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
      return atm.a(this.b(bmm.a));
   }

   protected void b(bjo $$0, float $$1) {
   }

   protected void c(bjo $$0, float $$1) {
   }

   protected void u(float $$0) {
   }

   protected float d(bjo $$0, float $$1) {
      if (!$$0.a(ari.b)) {
         this.b($$0, $$1);
         $$1 = bjk.a($$1, (float)this.eK(), (float)this.b(bmm.b));
      }

      return $$1;
   }

   protected float e(bjo $$0, float $$1) {
      if ($$0.a(ari.f)) {
         return $$1;
      } else {
         if (this.a(bkf.k) && !$$0.a(ari.g)) {
            int $$2 = (this.b(bkf.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof amf) {
                  ((amf)this).a(arb.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof amf) {
                  ((amf)$$0.d()).a(arb.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(ari.h)) {
            return $$1;
         } else {
            int $$7 = cpw.a(this.bL(), $$0);
            if ($$7 > 0) {
               $$1 = bjk.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bjo $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fl(), 0.0F);
         this.y(this.fl() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof amf $$4) {
            $$4.a(arb.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eL().a($$0, var9);
            this.c(this.ew() - var9);
            this.y(this.fl() - var9);
            this.a(dls.o);
         }
      }
   }

   public bjl eL() {
      return this.bO;
   }

   @Nullable
   public blg eM() {
      if (this.aY != null) {
         return this.aY;
      } else {
         return this.bU != null ? this.bU : null;
      }
   }

   public final float eN() {
      return (float)this.b(bmm.l);
   }

   public final float eO() {
      return (float)this.b(bmm.k);
   }

   public final int eP() {
      return this.an.b(bK);
   }

   public final void p(int $$0) {
      this.an.b(bK, $$0);
   }

   public final int eQ() {
      return this.an.b(bL);
   }

   public final void q(int $$0) {
      this.an.b(bL, $$0);
   }

   private int B() {
      if (bke.a(this)) {
         return 6 - (1 + bke.b(this));
      } else {
         return this.a(bkf.d) ? 6 + (1 + this.b(bkf.d).e()) * 2 : 6;
      }
   }

   public void a(biw $$0) {
      this.a($$0, false);
   }

   public void a(biw $$0, boolean $$1) {
      if (!this.aF || this.aH >= this.B() / 2 || this.aH < 0) {
         this.aH = -1;
         this.aF = true;
         this.aG = $$0;
         if (this.dN() instanceof ame) {
            yg $$2 = new yg(this, $$0 == biw.a ? 0 : 3);
            amc $$3 = ((ame)this.dN()).k();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bjo $$0) {
      this.aQ.a(1.5F);
      this.al = 20;
      this.aL = 10;
      this.aK = this.aL;
      aqq $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eX(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
      }

      this.a(this.dO().n(), 0.0F);
      this.cd = $$0;
      this.ce = this.dN().W();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            aqq $$1 = this.m_();
            if ($$1 != null) {
               this.a($$1, this.eX(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cdu)) {
               this.c(0.0F);
               this.a(this.dO().n());
            }
            break;
         case 29:
            this.a(aqr.vl, 1.0F, 0.8F + this.dN().z.i() * 0.4F);
            break;
         case 30:
            this.a(aqr.vm, 0.8F, 0.8F + this.dN().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ag.i() - 0.5F) * 0.2F;
               float $$6 = (this.ag.i() - 0.5F) * 0.2F;
               float $$7 = (this.ag.i() - 0.5F) * 0.2F;
               double $$8 = atm.d($$4, this.K, this.ds()) + (this.ag.j() - 0.5) * (double)this.dh() * 2.0;
               double $$9 = atm.d($$4, this.L, this.du()) + this.ag.j() * (double)this.di();
               double $$10 = atm.d($$4, this.M, this.dy()) + (this.ag.j() - 0.5) * (double)this.dh() * 2.0;
               this.dN().a(js.X, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.c(bkv.a));
            break;
         case 48:
            this.i(this.c(bkv.b));
            break;
         case 49:
            this.i(this.c(bkv.f));
            break;
         case 50:
            this.i(this.c(bkv.e));
            break;
         case 51:
            this.i(this.c(bkv.d));
            break;
         case 52:
            this.i(this.c(bkv.c));
            break;
         case 54:
            cyt.b(this);
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
         this.dN().a(js.W, this.d(1.0), this.dv(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void D() {
      clj $$0 = this.c(bkv.b);
      this.a(bkv.b, this.c(bkv.a));
      this.a(bkv.a, $$0);
   }

   @Override
   protected void aB() {
      this.a(this.dO().m(), 4.0F);
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
   public bmi a(bmh $$0) {
      return this.eS().a($$0);
   }

   public double a(ib<bmh> $$0) {
      return this.b($$0.a());
   }

   public double b(bmh $$0) {
      return this.eS().c($$0);
   }

   public double b(ib<bmh> $$0) {
      return this.c($$0.a());
   }

   public double c(bmh $$0) {
      return this.eS().d($$0);
   }

   public bmj eS() {
      return this.bN;
   }

   public bll eT() {
      return bll.a;
   }

   public clj eU() {
      return this.c(bkv.a);
   }

   public clj eV() {
      return this.c(bkv.b);
   }

   public boolean b(cle $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<clj> $$0) {
      return $$0.test(this.eU()) || $$0.test(this.eV());
   }

   public clj b(biw $$0) {
      if ($$0 == biw.a) {
         return this.c(bkv.a);
      } else if ($$0 == biw.b) {
         return this.c(bkv.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(biw $$0, clj $$1) {
      if ($$0 == biw.a) {
         this.a(bkv.a, $$1);
      } else {
         if ($$0 != biw.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bkv.b, $$1);
      }
   }

   public boolean b(bkv $$0) {
      return !this.c($$0).b();
   }

   @Override
   public abstract Iterable<clj> bL();

   public abstract clj c(bkv var1);

   @Override
   public abstract void a(bkv var1, clj var2);

   protected void e(clj $$0) {
      rz $$1 = $$0.v();
      if ($$1 != null) {
         $$0.d().b($$1);
      }
   }

   public float eW() {
      Iterable<clj> $$0 = this.bL();
      int $$1 = 0;
      int $$2 = 0;

      for (clj $$3 : $$0) {
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
      bmi $$1 = this.a(bmm.m);
      $$1.b(bA.a());
      if ($$0) {
         $$1.b(bA);
      }
   }

   protected float eX() {
      return 1.0F;
   }

   public float eY() {
      return this.n_() ? (this.ag.i() - this.ag.i()) * 0.2F + 1.5F : (this.ag.i() - this.ag.i()) * 0.2F + 1.0F;
   }

   protected boolean eZ() {
      return this.ex();
   }

   @Override
   public void g(bkq $$0) {
      if (!this.fE()) {
         super.g($$0);
      }
   }

   private void a(bkq $$0) {
      eju $$1;
      if (this.dI()) {
         $$1 = this.dl();
      } else if (!$$0.dI() && !this.dN().a_($$0.dn()).a(arg.aI)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.du(), $$0.du());
         $$1 = new eju(this.ds(), $$2, this.dy());
      }

      this.a($$1.c, $$1.d, $$1.e);
   }

   @Override
   public boolean cC() {
      return this.cB();
   }

   protected float fa() {
      return 0.42F * this.aK() + this.fb();
   }

   public float fb() {
      return this.a(bkf.h) ? 0.1F * ((float)this.b(bkf.h).e() + 1.0F) : 0.0F;
   }

   protected void fc() {
      eju $$0 = this.dq();
      this.o($$0.c, (double)this.fa(), $$0.e);
      if (this.bY()) {
         float $$1 = this.dD() * (float) (Math.PI / 180.0);
         this.g(this.dq().b((double)(-atm.a($$1) * 0.2F), 0.0, (double)(atm.b($$1) * 0.2F)));
      }

      this.au = true;
   }

   protected void fd() {
      this.g(this.dq().b(0.0, -0.04F, 0.0));
   }

   protected void c(arv<ecr> $$0) {
      this.g(this.dq().b(0.0, 0.04F, 0.0));
   }

   protected float fe() {
      return 0.8F;
   }

   public boolean a(ecs $$0) {
      return false;
   }

   public void a(eju $$0) {
      if (this.cY()) {
         double $$1 = 0.08;
         boolean $$2 = this.dq().d <= 0.0;
         if ($$2 && this.a(bkf.B)) {
            $$1 = 0.01;
         }

         ecs $$3 = this.dN().b_(this.dn());
         if (this.aZ() && this.eb() && !this.a($$3)) {
            double $$4 = this.du();
            float $$5 = this.bY() ? 0.9F : this.fe();
            float $$6 = 0.02F;
            float $$7 = (float)cpw.f(this);
            if ($$7 > 3.0F) {
               $$7 = 3.0F;
            }

            if (!this.aC()) {
               $$7 *= 0.5F;
            }

            if ($$7 > 0.0F) {
               $$5 += (0.54600006F - $$5) * $$7 / 3.0F;
               $$6 += (this.fg() - $$6) * $$7 / 3.0F;
            }

            if (this.a(bkf.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(blm.a, this.dq());
            eju $$8 = this.dq();
            if (this.P && this.d_()) {
               $$8 = new eju($$8.c, 0.2, $$8.e);
            }

            this.g($$8.d((double)$$5, 0.8F, (double)$$5));
            eju $$9 = this.a($$1, $$2, this.dq());
            this.g($$9);
            if (this.P && this.g($$9.c, $$9.d + 0.6F - this.du() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bn() && this.eb() && !this.a($$3)) {
            double $$10 = this.du();
            this.a(0.02F, $$0);
            this.a(blm.a, this.dq());
            if (this.b(arl.b) <= this.dg()) {
               this.g(this.dq().d(0.5, 0.8F, 0.5));
               eju $$11 = this.a($$1, $$2, this.dq());
               this.g($$11);
            } else {
               this.g(this.dq().a(0.5));
            }

            if (!this.aV()) {
               this.g(this.dq().b(0.0, -$$1 / 4.0, 0.0));
            }

            eju $$12 = this.dq();
            if (this.P && this.g($$12.c, $$12.d + 0.6F - this.du() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fx()) {
            this.cn();
            eju $$13 = this.dq();
            eju $$14 = this.bF();
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
               double $$21 = $$17 * (double)(-atm.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.g($$13.d(0.99F, 0.98F, 0.99F));
            this.a(blm.a, this.dq());
            if (this.P && !this.dN().B) {
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
            ht $$25 = this.aI();
            float $$26 = this.dN().a_($$25).b().i();
            float $$27 = this.aC() ? $$26 * 0.91F : 0.91F;
            eju $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.a(bkf.y)) {
               $$29 += (0.05 * (double)(this.b(bkf.y).e() + 1) - $$28.d) * 0.2;
            } else if (this.dN().B && !this.dN().A($$25)) {
               if (this.du() > (double)this.dN().I_()) {
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

      this.q(this instanceof bxa);
   }

   private void c(cdu $$0, eju $$1) {
      eju $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.cY()) {
         this.w(this.e($$0));
         this.a($$2);
      } else {
         this.q(false);
         this.g(eju.b);
         this.aD();
      }
   }

   protected void a(cdu $$0, eju $$1) {
   }

   protected eju b(cdu $$0, eju $$1) {
      return $$1;
   }

   protected float e(cdu $$0) {
      return this.fg();
   }

   public void q(boolean $$0) {
      float $$1 = (float)atm.g(this.ds() - this.K, $$0 ? this.du() - this.L : 0.0, this.dy() - this.M);
      this.v($$1);
   }

   protected void v(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aQ.a($$1, 0.4F);
   }

   public eju a(eju $$0, float $$1) {
      this.a(this.A($$1), $$0);
      this.g(this.j(this.dq()));
      this.a(blm.a, this.dq());
      eju $$2 = this.dq();
      if ((this.P || this.bj) && (this.d_() || this.do().a(cvc.qP) && dat.a(this))) {
         $$2 = new eju($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public eju a(double $$0, boolean $$1, eju $$2) {
      if (!this.aV() && !this.bY()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new eju($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private eju j(eju $$0) {
      if (this.d_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = atm.a($$0.c, -0.15F, 0.15F);
         double $$3 = atm.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.do().a(cvc.nS) && this.fw() && this instanceof cdu) {
            $$4 = 0.0;
         }

         $$0 = new eju($$2, $$4, $$3);
      }

      return $$0;
   }

   private float A(float $$0) {
      return this.aC() ? this.fg() * (0.21600002F / ($$0 * $$0 * $$0)) : this.ff();
   }

   protected float ff() {
      return this.cO() instanceof cdu ? this.fg() * 0.1F : 0.02F;
   }

   public float fg() {
      return this.bY;
   }

   public void w(float $$0) {
      this.bY = $$0;
   }

   public boolean C(bkq $$0) {
      this.A($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.I();
      this.M();
      if (!this.dN().B) {
         int $$0 = this.eP();
         if ($$0 > 0) {
            if (this.aI <= 0) {
               this.aI = 20 * (30 - $$0);
            }

            this.aI--;
            if (this.aI <= 0) {
               this.p($$0 - 1);
            }
         }

         int $$1 = this.eQ();
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
            this.eL().c();
         }

         if (this.fE() && !this.N()) {
            this.fF();
         }
      }

      if (!this.dI()) {
         this.c_();
      }

      double $$2 = this.ds() - this.K;
      double $$3 = this.dy() - this.M;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aU;
      float $$6 = 0.0F;
      this.bc = this.bd;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)atm.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = atm.e(atm.g(this.dD()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aO > 0.0F) {
         $$5 = this.dD();
      }

      if (!this.aC()) {
         $$7 = 0.0F;
      }

      this.bd = this.bd + ($$7 - this.bd) * 0.3F;
      this.dN().ae().a("headTurn");
      $$6 = this.e($$5, $$6);
      this.dN().ae().c();
      this.dN().ae().a("rangeChecks");

      while (this.dD() - this.N < -180.0F) {
         this.N -= 360.0F;
      }

      while (this.dD() - this.N >= 180.0F) {
         this.N += 360.0F;
      }

      while (this.aU - this.aV < -180.0F) {
         this.aV -= 360.0F;
      }

      while (this.aU - this.aV >= 180.0F) {
         this.aV += 360.0F;
      }

      while (this.dF() - this.O < -180.0F) {
         this.O -= 360.0F;
      }

      while (this.dF() - this.O >= 180.0F) {
         this.O += 360.0F;
      }

      while (this.aW - this.aX < -180.0F) {
         this.aX -= 360.0F;
      }

      while (this.aW - this.aX >= 180.0F) {
         this.aX += 360.0F;
      }

      this.dN().ae().c();
      this.be += $$6;
      if (this.fx()) {
         this.bx++;
      } else {
         this.bx = 0;
      }

      if (this.fE()) {
         this.s(0.0F);
      }

      this.y();
   }

   private void E() {
      Map<bkv, clj> $$0 = this.G();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bkv, clj> G() {
      Map<bkv, clj> $$0 = null;

      for (bkv $$1 : bkv.values()) {
         clj $$2;
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

         clj $$5 = this.c($$1);
         if (this.a($$2, $$5)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bkv.class);
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

   public boolean a(clj $$0, clj $$1) {
      return !clj.a($$1, $$0);
   }

   private void a(Map<bkv, clj> $$0) {
      clj $$1 = $$0.get(bkv.a);
      clj $$2 = $$0.get(bkv.b);
      if ($$1 != null && $$2 != null && clj.a($$1, this.f(bkv.b)) && clj.a($$2, this.f(bkv.a))) {
         ((ame)this.dN()).k().b(this, new zf(this, (byte)55));
         $$0.remove(bkv.a);
         $$0.remove(bkv.b);
         this.c(bkv.a, $$1.p());
         this.c(bkv.b, $$2.p());
      }
   }

   private void b(Map<bkv, clj> $$0) {
      List<Pair<bkv, clj>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         clj $$3 = $$2.p();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
         }
      });
      ((ame)this.dN()).k().b(this, new abh(this.aj(), $$1));
   }

   private clj e(bkv $$0) {
      return this.bR.get($$0.b());
   }

   private void b(bkv $$0, clj $$1) {
      this.bR.set($$0.b(), $$1);
   }

   private clj f(bkv $$0) {
      return this.bQ.get($$0.b());
   }

   private void c(bkv $$0, clj $$1) {
      this.bQ.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = atm.g($$0 - this.aU);
      this.aU += $$2 * 0.3F;
      float $$3 = atm.g(this.dD() - this.aU);
      float $$4 = this.fh();
      if (Math.abs($$3) > $$4) {
         this.aU = this.aU + ($$3 - (float)atm.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float fh() {
      return 50.0F;
   }

   public void c_() {
      if (this.bZ > 0) {
         this.bZ--;
      }

      if (this.cY()) {
         this.bn = 0;
         this.f(this.ds(), this.du(), this.dy());
      }

      if (this.bn > 0) {
         this.a(this.bn, this.bo, this.bp, this.bq, this.br, this.bs);
         this.bn--;
      } else if (!this.cZ()) {
         this.g(this.dq().a(0.98));
      }

      if (this.bu > 0) {
         this.a(this.bu, this.bt);
         this.bu--;
      }

      eju $$0 = this.dq();
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
      this.dN().ae().a("ai");
      if (this.eZ()) {
         this.bj = false;
         this.bk = 0.0F;
         this.bm = 0.0F;
      } else if (this.cZ()) {
         this.dN().ae().a("newAi");
         this.fj();
         this.dN().ae().c();
      }

      this.dN().ae().c();
      this.dN().ae().a("jump");
      if (this.bj && this.eb()) {
         double $$4;
         if (this.bn()) {
            $$4 = this.b(arl.b);
         } else {
            $$4 = this.b(arl.a);
         }

         boolean $$6 = this.aZ() && $$4 > 0.0;
         double $$7 = this.dg();
         if (!$$6 || this.aC() && !($$4 > $$7)) {
            if (!this.bn() || this.aC() && !($$4 > $$7)) {
               if ((this.aC() || $$6 && $$4 <= $$7) && this.bZ == 0) {
                  this.fc();
                  this.bZ = 10;
               }
            } else {
               this.c(arl.b);
            }
         } else {
            this.c(arl.a);
         }
      } else {
         this.bZ = 0;
      }

      this.dN().ae().c();
      this.dN().ae().a("travel");
      this.bk *= 0.98F;
      this.bm *= 0.98F;
      this.H();
      ejp $$8 = this.cH();
      eju $$9 = new eju((double)this.bk, (double)this.bl, (double)this.bm);
      if (this.a(bkf.B) || this.a(bkf.y)) {
         this.n();
      }

      label104: {
         if (this.cO() instanceof cdu $$10 && this.bx()) {
            this.c($$10, $$9);
            break label104;
         }

         this.a($$9);
      }

      this.dN().ae().c();
      this.dN().ae().a("freezing");
      if (!this.dN().B && !this.ex()) {
         int $$11 = this.cj();
         if (this.aA && this.dB()) {
            this.k(Math.min(this.cm(), $$11 + 1));
         } else {
            this.k(Math.max(0, $$11 - 2));
         }
      }

      this.dY();
      this.dZ();
      if (!this.dN().B && this.ah % 40 == 0 && this.cl() && this.dB()) {
         this.a(this.dO().t(), 1.0F);
      }

      this.dN().ae().c();
      this.dN().ae().a("push");
      if (this.by > 0) {
         this.by--;
         this.a($$8, this.cH());
      }

      this.L_();
      this.dN().ae().c();
      if (!this.dN().B && this.fi() && this.bb()) {
         this.a(this.dO().h(), 1.0F);
      }
   }

   public boolean fi() {
      return false;
   }

   private void H() {
      boolean $$0 = this.i(7);
      if ($$0 && !this.aC() && !this.bO() && !this.a(bkf.y)) {
         clj $$1 = this.c(bkv.e);
         if ($$1.a(clm.nS) && ckd.d($$1)) {
            $$0 = true;
            int $$2 = this.bx + 1;
            if (!this.dN().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, $$0x -> $$0x.d(bkv.e));
               }

               this.a(dls.n);
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

   protected void fj() {
   }

   protected void L_() {
      if (this.dN().x_()) {
         this.dN().a(dlg.a(cdu.class), this.cH(), bkt.a(this)).forEach(this::D);
      } else {
         List<bkq> $$0 = this.dN().a(this, this.cH(), bkt.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dN().Y().c(crw.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ag.a(4) == 0) {
               int $$2 = 0;

               for (bkq $$3 : $$0) {
                  if (!$$3.bO()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dO().g(), 6.0F);
               }
            }

            for (bkq $$4 : $$0) {
               this.D($$4);
            }
         }
      }
   }

   protected void a(ejp $$0, ejp $$1) {
      ejp $$2 = $$0.b($$1);
      List<bkq> $$3 = this.dN().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bkq $$4 : $$3) {
            if ($$4 instanceof blg) {
               this.g((blg)$$4);
               this.by = 0;
               this.g(this.dq().a(-0.2));
               break;
            }
         }
      } else if (this.P) {
         this.by = 0;
      }

      if (!this.dN().B && this.by <= 0) {
         this.c(4, false);
      }
   }

   protected void D(bkq $$0) {
      $$0.g(this);
   }

   protected void g(blg $$0) {
   }

   public boolean fk() {
      return (this.an.b(t) & 4) != 0;
   }

   @Override
   public void ac() {
      bkq $$0 = this.da();
      super.ac();
      if ($$0 != null && $$0 != this.da() && !this.dN().B) {
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
   public double o_() {
      return this.bn > 0 ? this.bo : this.ds();
   }

   @Override
   public double M_() {
      return this.bn > 0 ? this.bp : this.du();
   }

   @Override
   public double N_() {
      return this.bn > 0 ? this.bq : this.dy();
   }

   @Override
   public float e_() {
      return this.bn > 0 ? (float)this.bs : this.dF();
   }

   @Override
   public float p_() {
      return this.bn > 0 ? (float)this.br : this.dD();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bt = (double)$$0;
      this.bu = $$1;
   }

   public void r(boolean $$0) {
      this.bj = $$0;
   }

   public void a(can $$0) {
      bkq $$1 = $$0.w();
      if ($$1 instanceof amf) {
         al.O.a((amf)$$1, $$0.q(), this);
      }
   }

   public void a(bkq $$0, int $$1) {
      if (!$$0.dI() && !this.dN().B && ($$0 instanceof can || $$0 instanceof cea || $$0 instanceof bkw)) {
         ((ame)this.dN()).k().b($$0, new aca($$0.aj(), this.aj(), $$1));
      }
   }

   public boolean E(bkq $$0) {
      if ($$0.dN() != this.dN()) {
         return false;
      } else {
         eju $$1 = new eju(this.ds(), this.dw(), this.dy());
         eju $$2 = new eju($$0.ds(), $$0.dw(), $$0.dy());
         return $$2.f($$1) > 128.0 ? false : this.dN().a(new crj($$1, $$2, crj.a.a, crj.b.a, this)).c() == ejs.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.aW : atm.i($$0, this.aX, this.aW);
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
      return !this.dI();
   }

   @Override
   public boolean bu() {
      return this.bx() && !this.O_() && !this.d_();
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
   protected eju a(hx.a $$0, l.a $$1) {
      return i(super.a($$0, $$1));
   }

   public static eju i(eju $$0) {
      return new eju($$0.c, $$0.d, 0.0);
   }

   public float fl() {
      return this.ca;
   }

   public final void y(float $$0) {
      this.z(atm.a($$0, 0.0F, this.eO()));
   }

   protected void z(float $$0) {
      this.ca = $$0;
   }

   public void f_() {
   }

   public void g_() {
   }

   protected void fm() {
      this.bT = true;
   }

   public abstract bla fn();

   public boolean fo() {
      return (this.an.b(t) & 1) > 0;
   }

   public biw fp() {
      return (this.an.b(t) & 2) > 0 ? biw.b : biw.a;
   }

   private void I() {
      if (this.fo()) {
         if (clj.b(this.b(this.fp()), this.bv)) {
            this.bv = this.b(this.fp());
            this.a(this.bv);
         } else {
            this.fu();
         }
      }
   }

   protected void a(clj $$0) {
      $$0.b(this.dN(), this, this.fr());
      if (this.K()) {
         this.b($$0, 5);
      }

      if (--this.bw == 0 && !this.dN().B && !$$0.t()) {
         this.x();
      }
   }

   private boolean K() {
      int $$0 = this.fr();
      cgj $$1 = this.bv.d().v();
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

   public void c(biw $$0) {
      clj $$1 = this.b($$0);
      if (!$$1.b() && !this.fo()) {
         this.bv = $$1;
         this.bw = $$1.r();
         if (!this.dN().B) {
            this.c(1, true);
            this.c(2, $$0 == biw.b);
            this.a(dls.D);
         }
      }
   }

   @Override
   public void a(afo<?> $$0) {
      super.a($$0);
      if (bM.equals($$0)) {
         if (this.dN().B) {
            this.fC().ifPresent(this::a);
         }
      } else if (t.equals($$0) && this.dN().B) {
         if (this.fo() && this.bv.b()) {
            this.bv = this.b(this.fp());
            if (!this.bv.b()) {
               this.bw = this.bv.r();
            }
         } else if (!this.fo() && !this.bv.b()) {
            this.bv = clj.b;
            this.bw = 0;
         }
      }
   }

   @Override
   public void a(ef.a $$0, eju $$1) {
      super.a($$0, $$1);
      this.aX = this.aW;
      this.aU = this.aW;
      this.aV = this.aU;
   }

   protected void b(clj $$0, int $$1) {
      if (!$$0.b() && this.fo()) {
         if ($$0.s() == cnc.c) {
            this.a(this.c($$0), 0.5F, this.dN().z.i() * 0.1F + 0.9F);
         }

         if ($$0.s() == cnc.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(clj $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         eju $$3 = new eju(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dF() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dD() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ag.i()) * 0.6 - 0.3;
         eju $$5 = new eju(((double)this.ag.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dF() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dD() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.ds(), this.dw(), this.dy());
         this.dN().a(new jo(js.O, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void x() {
      if (!this.dN().B || this.fo()) {
         biw $$0 = this.fp();
         if (!this.bv.equals(this.b($$0))) {
            this.ft();
         } else {
            if (!this.bv.b() && this.fo()) {
               this.b(this.bv, 16);
               clj $$1 = this.bv.a(this.dN(), this);
               if ($$1 != this.bv) {
                  this.a($$0, $$1);
               }

               this.fu();
            }
         }
      }
   }

   public clj fq() {
      return this.bv;
   }

   public int fr() {
      return this.bw;
   }

   public int fs() {
      return this.fo() ? this.bv.r() - this.fr() : 0;
   }

   public void ft() {
      if (!this.bv.b()) {
         this.bv.a(this.dN(), this, this.fr());
         if (this.bv.t()) {
            this.I();
         }
      }

      this.fu();
   }

   public void fu() {
      if (!this.dN().B) {
         boolean $$0 = this.fo();
         this.c(1, false);
         if ($$0) {
            this.a(dls.C);
         }
      }

      this.bv = clj.b;
      this.bw = 0;
   }

   public boolean fv() {
      if (this.fo() && !this.bv.b()) {
         cle $$0 = this.bv.d();
         return $$0.c(this.bv) != cnc.d ? false : $$0.b(this.bv) - this.bw >= 5;
      } else {
         return false;
      }
   }

   public boolean fw() {
      return this.bS();
   }

   public boolean fx() {
      return this.i(7);
   }

   @Override
   public boolean ca() {
      return super.ca() || !this.fx() && this.c(bls.b);
   }

   public int fy() {
      return this.bx;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.ds();
      double $$5 = this.du();
      double $$6 = this.dy();
      double $$7 = $$1;
      boolean $$8 = false;
      ht $$9 = ht.a($$0, $$1, $$2);
      csa $$10 = this.dN();
      if ($$10.A($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.I_()) {
            ht $$12 = $$9.d();
            dhi $$13 = $$10.a_($$12);
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

         if (this instanceof blp) {
            ((blp)this).N().n();
         }

         return true;
      }
   }

   public boolean fz() {
      return !this.ex();
   }

   public boolean fA() {
      return true;
   }

   public void a(ht $$0, boolean $$1) {
   }

   public boolean f(clj $$0) {
      return false;
   }

   @Override
   public bkr a(bls $$0) {
      return $$0 == bls.c ? v : super.a($$0).a(this.ea());
   }

   public ImmutableList<bls> fB() {
      return ImmutableList.of(bls.a);
   }

   public ejp e(bls $$0) {
      bkr $$1 = this.a($$0);
      return new ejp((double)(-$$1.a / 2.0F), 0.0, (double)(-$$1.a / 2.0F), (double)($$1.a / 2.0F), (double)$$1.b, (double)($$1.a / 2.0F));
   }

   protected boolean f(bls $$0) {
      ejp $$1 = this.a($$0).a(this.dl());
      return this.dN().b(this, $$1);
   }

   @Override
   public boolean ct() {
      return super.ct() && !this.fE();
   }

   public Optional<ht> fC() {
      return this.an.b(bM);
   }

   public void g(ht $$0) {
      this.an.b(bM, Optional.of($$0));
   }

   public void fD() {
      this.an.b(bM, Optional.empty());
   }

   public boolean fE() {
      return this.fC().isPresent();
   }

   public void b(ht $$0) {
      if (this.bO()) {
         this.ac();
      }

      dhi $$1 = this.dN().a_($$0);
      if ($$1.b() instanceof cut) {
         this.dN().a($$0, $$1.a(cut.c, Boolean.valueOf(true)), 3);
      }

      this.b(bls.c);
      this.a($$0);
      this.g($$0);
      this.g(eju.b);
      this.au = true;
   }

   private void a(ht $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean N() {
      return this.fC().map($$0 -> this.dN().a_($$0).b() instanceof cut).orElse(false);
   }

   public void fF() {
      this.fC().filter(this.dN()::A).ifPresent($$0x -> {
         dhi $$1 = this.dN().a_($$0x);
         if ($$1.b() instanceof cut) {
            hx $$2 = $$1.c(cut.aE);
            this.dN().a($$0x, $$1.a(cut.c, Boolean.valueOf(false)), 3);
            eju $$3 = cut.a(this.ai(), this.dN(), $$0x, $$2, this.dD()).orElseGet(() -> {
               ht $$1x = $$0x.c();
               return new eju((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            eju $$4 = eju.c($$0x).d($$3).d();
            float $$5 = (float)atm.d(atm.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      eju $$0 = this.dl();
      this.b(bls.a);
      this.a_($$0.c, $$0.d, $$0.e);
      this.fD();
   }

   @Nullable
   public hx fG() {
      ht $$0 = this.fC().orElse(null);
      return $$0 != null ? cut.a(this.dN(), $$0) : null;
   }

   @Override
   public boolean by() {
      return !this.fE() && super.by();
   }

   @Override
   protected final float a(bls $$0, bkr $$1) {
      return $$0 == bls.c ? 0.2F : this.b($$0, $$1);
   }

   protected float b(bls $$0, bkr $$1) {
      return super.a($$0, $$1);
   }

   public clj g(clj $$0) {
      return clj.b;
   }

   public clj a(csa $$0, clj $$1) {
      if ($$1.M()) {
         $$0.a(null, this.ds(), this.du(), this.dy(), this.d($$1), aqs.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$1, $$0, this);
         if (!(this instanceof cdu) || !((cdu)this).fU().d) {
            $$1.h(1);
         }

         this.a(dls.m);
      }

      return $$1;
   }

   private void a(clj $$0, csa $$1, blg $$2) {
      cle $$3 = $$0.d();
      if ($$3.u()) {
         for (Pair<bkd, Float> $$5 : $$3.v().f()) {
            if (!$$1.B && $$5.getFirst() != null && $$1.z.i() < (Float)$$5.getSecond()) {
               $$2.b(new bkd((bkd)$$5.getFirst()));
            }
         }
      }
   }

   private static byte g(bkv $$0) {
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

   public void d(bkv $$0) {
      this.dN().a(this, g($$0));
   }

   public void d(biw $$0) {
      this.d($$0 == biw.a ? bkv.a : bkv.b);
   }

   @Override
   public ejp h_() {
      if (this.c(bkv.f).a(clm.ui)) {
         float $$0 = 0.5F;
         return this.cH().c(0.5, 0.5, 0.5);
      } else {
         return super.h_();
      }
   }

   public static bkv h(clj $$0) {
      ckk $$1 = ckk.c_($$0);
      return $$1 != null ? $$1.g() : bkv.a;
   }

   private static bly a(blg $$0, bkv $$1) {
      return $$1 != bkv.f && $$1 != bkv.a && $$1 != bkv.b ? bly.a($$0, $$1, $$1x -> $$1x.b() || bli.h($$1x) == $$1) : bly.a($$0, $$1);
   }

   @Nullable
   private static bkv r(int $$0) {
      if ($$0 == 100 + bkv.f.b()) {
         return bkv.f;
      } else if ($$0 == 100 + bkv.e.b()) {
         return bkv.e;
      } else if ($$0 == 100 + bkv.d.b()) {
         return bkv.d;
      } else if ($$0 == 100 + bkv.c.b()) {
         return bkv.c;
      } else if ($$0 == 98) {
         return bkv.a;
      } else {
         return $$0 == 99 ? bkv.b : null;
      }
   }

   @Override
   public bly a_(int $$0) {
      bkv $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dB() {
      if (this.O_()) {
         return false;
      } else {
         boolean $$0 = !this.c(bkv.f).a(aro.az) && !this.c(bkv.e).a(aro.az) && !this.c(bkv.d).a(aro.az) && !this.c(bkv.c).a(aro.az);
         return $$0 && super.dB();
      }
   }

   @Override
   public boolean cd() {
      return !this.dN().x_() && this.a(bkf.x) || super.cd();
   }

   @Override
   public float dE() {
      return this.aU;
   }

   @Override
   public void a(ye $$0) {
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

   public boolean fH() {
      return this.eU().d() instanceof ciy;
   }

   @Override
   public float dH() {
      float $$0 = super.dH();
      return this.cO() instanceof cdu ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public eju m(bkq $$0) {
      return new eju(this.a($$0, this.a(this.ap()), this.ea()).rotateY(-this.aU * (float) (Math.PI / 180.0))).e(this.dl());
   }

   @Override
   public float k(bkq $$0) {
      return this.l($$0) * this.ea();
   }

   protected void a(int $$0, double $$1) {
      this.aW = (float)atm.e(1.0 / (double)$$0, (double)this.aW, $$1);
   }

   public static record a(aqq a, aqq b) {
   }
}
