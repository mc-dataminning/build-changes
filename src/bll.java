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

public abstract class bll extends bkv implements bkt {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final bmp bA = new bmp(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, bmp.a.c);
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
   protected static final afs<Byte> t = afv.a(bll.class, afu.a);
   private static final afs<Float> bH = afv.a(bll.class, afu.d);
   private static final afs<Integer> bI = afv.a(bll.class, afu.b);
   private static final afs<Boolean> bJ = afv.a(bll.class, afu.k);
   private static final afs<Integer> bK = afv.a(bll.class, afu.b);
   private static final afs<Integer> bL = afv.a(bll.class, afu.b);
   private static final afs<Optional<hx>> bM = afv.a(bll.class, afu.o);
   protected static final float u = 1.74F;
   protected static final bkw v = bkw.c(0.2F, 0.2F);
   public static final float aE = 0.5F;
   private final bmo bN;
   private final bjq bO = new bjq(this);
   private final Map<bkg, bki> bP = Maps.newHashMap();
   private final ip<clo> bQ = ip.a(2, clo.b);
   private final ip<clo> bR = ip.a(4, clo.b);
   public boolean aF;
   private boolean bS = false;
   public bja aG;
   public int aH;
   public int aI;
   public int aJ;
   public int aK;
   public int aL;
   public int aM;
   public float aN;
   public float aO;
   protected int aP;
   public final bmk aQ = new bmk();
   public final int aR = 20;
   public final float aS;
   public final float aT;
   public float aU;
   public float aV;
   public float aW;
   public float aX;
   @Nullable
   protected cdz aY;
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
   private bll bU;
   private int bV;
   private bll bW;
   private int bX;
   private float bY;
   private int bZ;
   private float ca;
   protected clo bv = clo.b;
   protected int bw;
   protected int bx;
   private hx cb;
   private Optional<hx> cc = Optional.empty();
   @Nullable
   private bjt cd;
   private long ce;
   protected int by;
   private float cf;
   private float cg;
   protected bml<?> bz;
   private boolean ch;

   protected bll(bkz<? extends bll> $$0, csf $$1) {
      super($$0, $$1);
      this.bN = new bmo(bms.a($$0));
      this.c(this.eN());
      this.I = true;
      this.aT = (float)((Math.random() + 1.0) * 0.01F);
      this.ar();
      this.aS = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.aW = this.dD();
      this.t(0.6F);
      sr $$2 = sr.a;
      this.bz = this.a(new Dynamic($$2, (ta)$$2.createMap(ImmutableMap.of($$2.a("memories"), (ta)$$2.emptyMap()))));
   }

   public bml<?> dP() {
      return this.bz;
   }

   protected bml.b<?> dQ() {
      return bml.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bml<?> a(Dynamic<?> $$0) {
      return this.dQ().a($$0);
   }

   @Override
   public void al() {
      this.a(this.dO().w(), Float.MAX_VALUE);
   }

   public boolean a(bkz<?> $$0) {
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

   public static bmq.a dR() {
      return bmq.a().a(bmr.l).a(bmr.i).a(bmr.m).a(bmr.a).a(bmr.b).a(bmr.k);
   }

   @Override
   protected void a(double $$0, boolean $$1, dhn $$2, hx $$3) {
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
         hx $$7 = this.dn();
         if ($$3.u() != $$7.u() || $$3.w() != $$7.w()) {
            double $$8 = $$4 - (double)$$3.u() - 0.5;
            double $$9 = $$6 - (double)$$3.w() - 0.5;
            double $$10 = Math.max(Math.abs($$8), Math.abs($$9));
            $$4 = (double)$$3.u() + 0.5 + $$8 / $$10 * 0.5;
            $$6 = (double)$$3.w() + 0.5 + $$9 / $$10 * 0.5;
         }

         float $$11 = (float)atq.f(this.ab - 3.0F);
         double $$12 = Math.min((double)(0.2F + $$11 / 15.0F), 2.5);
         int $$13 = (int)(150.0 * $$12);
         ((ami)this.dN()).a(new jo(jw.c, $$2), $$4, $$5, $$6, $$13, 0.0, 0.0, 0.0, 0.15F);
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cc = Optional.empty();
      }
   }

   public final boolean dS() {
      return this.ai().a(arn.m);
   }

   public float a(float $$0) {
      return atq.i($$0, this.cg, this.cf);
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
         boolean $$0 = this instanceof cdz;
         if (!this.dN().B) {
            if (this.by()) {
               this.a(this.dO().f(), 1.0F);
            } else if ($$0 && !this.dN().D_().a(this.cH())) {
               double $$1 = this.dN().D_().a(this) + this.dN().D_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dN().D_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dO().v(), (float)Math.max(1, atq.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(arp.a) && !this.dN().a_(hx.a(this.ds(), this.dw(), this.dy())).a(cvh.nd)) {
            boolean $$3 = !this.dS() && !bkj.c(this) && (!$$0 || !((cdz)this).fU().a);
            if ($$3) {
               this.j(this.m(this.ci()));
               if (this.ci() == -20) {
                  this.j(0);
                  ejz $$4 = this.dq();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.ag.j() - this.ag.j();
                     double $$7 = this.ag.j() - this.ag.j();
                     double $$8 = this.ag.j() - this.ag.j();
                     this.dN().a(jw.e, this.ds() + $$6, this.du() + $$7, this.dy() + $$8, $$4.c, $$4.d, $$4.e);
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
            hx $$9 = this.dn();
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

      if (this.al > 0 && !(this instanceof amj)) {
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
      return this.ah % 5 == 0 && this.dq().c != 0.0 && this.dq().e != 0.0 && !this.P_() && cqb.k(this) && this.dV();
   }

   protected void dU() {
      ejz $$0 = this.dq();
      this.dN()
         .a(
            jw.I,
            this.ds() + (this.ag.j() - 0.5) * (double)this.dh(),
            this.du() + 0.1,
            this.dy() + (this.ag.j() - 0.5) * (double)this.dh(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.ag.i() * 0.4F + this.ag.i() > 0.9F ? 0.6F : 0.0F;
      this.a(aqv.wy, $$1, 0.6F + this.ag.i() * 0.4F);
   }

   protected boolean dV() {
      return this.dN().a_(this.aI()).a(ark.aM);
   }

   @Override
   protected float aL() {
      return this.dV() && cqb.a(cqd.l, this) > 0 ? 1.0F : super.aL();
   }

   @Override
   protected boolean c(dhn $$0) {
      return !$$0.i() || this.fx();
   }

   protected void dW() {
      bmn $$0 = this.a(bmr.m);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void dX() {
      if (!this.bj().i()) {
         int $$0 = cqb.a(cqd.l, this);
         if ($$0 > 0 && this.dV()) {
            bmn $$1 = this.a(bmr.m);
            if ($$1 == null) {
               return;
            }

            $$1.b(new bmp(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), bmp.a.a));
            if (this.eh().i() < 0.04F) {
               clo $$2 = this.c(bla.c);
               $$2.a(1, this, $$0x -> $$0x.d(bla.c));
            }
         }
      }
   }

   protected void dY() {
      bmn $$0 = this.a(bmr.m);
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
            bmn $$1 = this.a(bmr.m);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.ck();
            $$1.b(new bmp(e, "Powder snow slow", (double)$$2, bmp.a.a));
         }
      }
   }

   protected void c(hx $$0) {
      int $$1 = cqb.a(cqd.j, this);
      if ($$1 > 0) {
         cqg.a(this, this.dN(), $$0, $$1);
      }

      if (this.c(this.bj())) {
         this.dW();
      }

      this.dX();
   }

   public boolean o_() {
      return false;
   }

   public float ea() {
      return this.o_() ? 0.5F : 1.0F;
   }

   protected boolean eb() {
      return true;
   }

   protected void ec() {
      this.aM++;
      if (this.aM >= 20 && !this.dN().y_() && !this.dI()) {
         this.dN().a(this, (byte)60);
         this.a(bkv.c.a);
      }
   }

   public boolean ed() {
      return !this.o_();
   }

   protected boolean ee() {
      return !this.o_();
   }

   protected int m(int $$0) {
      int $$1 = cqb.e(this);
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

   public atw eh() {
      return this.ag;
   }

   @Nullable
   public bll ei() {
      return this.bU;
   }

   @Override
   public bll V_() {
      return this.ei();
   }

   public int ej() {
      return this.bV;
   }

   public void c(@Nullable cdz $$0) {
      this.aY = $$0;
      this.aZ = this.ah;
   }

   public void a(@Nullable bll $$0) {
      this.bU = $$0;
      this.bV = this.ah;
   }

   @Nullable
   public bll ek() {
      return this.bW;
   }

   public int el() {
      return this.bX;
   }

   public void A(bkv $$0) {
      if ($$0 instanceof bll) {
         this.bW = (bll)$$0;
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

   protected boolean a(bla $$0) {
      return true;
   }

   public void a(bla $$0, clo $$1, clo $$2) {
      boolean $$3 = $$2.b() && $$1.b();
      if (!$$3 && !clo.c($$1, $$2) && !this.am) {
         ckp $$4 = ckp.c_($$2);
         if (!this.dN().y_() && !this.P_()) {
            if (!this.aU() && $$4 != null && $$4.g() == $$0) {
               this.dN().a(null, this.ds(), this.du(), this.dy(), $$4.at_(), this.dc(), 1.0F, 1.0F);
            }

            if (this.a($$0)) {
               this.a($$4 != null ? dlx.v : dlx.S);
            }
         }
      }
   }

   @Override
   public void a(bkv.c $$0) {
      super.a($$0);
      this.bz.a();
   }

   @Override
   public void b(sd $$0) {
      $$0.a("Health", this.ew());
      $$0.a("HurtTime", (short)this.aK);
      $$0.a("HurtByTimestamp", this.bV);
      $$0.a("DeathTime", (short)this.aM);
      $$0.a("AbsorptionAmount", this.fl());
      $$0.a("Attributes", this.eS().c());
      if (!this.bP.isEmpty()) {
         sj $$1 = new sj();

         for (bki $$2 : this.bP.values()) {
            $$1.add($$2.a(new sd()));
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fx());
      this.fC().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<ta> $$3 = this.bz.a(sr.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(sd $$0) {
      this.z($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dN() != null && !this.dN().B) {
         this.eS().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         sj $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            sd $$3 = $$1.a($$2);
            bki $$4 = bki.b($$3);
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
         ekw $$6 = this.dN().J().d($$5);
         boolean $$7 = $$6 != null && this.dN().J().a(this.cx(), $$6);
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
         this.an.b(as, blx.c);
         if (!this.am) {
            this.a($$8);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bz = this.a(new Dynamic(sr.a, $$0.c("Brain")));
      }
   }

   protected void eo() {
      Iterator<bkg> $$0 = this.bP.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            bkg $$1 = $$0.next();
            bki $$2 = this.bP.get($$1);
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
            this.dN().a($$4 ? jw.a : jw.v, this.d(0.5), this.dv(), this.g(0.5), $$7, $$8, $$9);
         }
      }
   }

   protected void J() {
      if (this.bP.isEmpty()) {
         this.er();
         this.j(false);
      } else {
         Collection<bki> $$0 = this.bP.values();
         this.an.b(bJ, c($$0));
         this.an.b(bI, cnn.a($$0));
         this.j(this.a(bkk.n));
      }
   }

   private void u() {
      boolean $$0 = this.cd();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double B(@Nullable bkv $$0) {
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
         clo $$3 = this.c(bla.f);
         bkz<?> $$4 = $$0.ai();
         if ($$4 == bkz.aJ && $$3.a(clr.ud)
            || $$4 == bkz.bp && $$3.a(clr.ug)
            || $$4 == bkz.aw && $$3.a(clr.uj)
            || $$4 == bkz.ax && $$3.a(clr.uj)
            || $$4 == bkz.u && $$3.a(clr.uh)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bll $$0) {
      return $$0 instanceof cdz && this.dN().aj() == biy.a ? false : $$0.ep();
   }

   public boolean a(bll $$0, bvx $$1) {
      return $$1.a(this, $$0);
   }

   public boolean ep() {
      return !this.cr() && this.eq();
   }

   public boolean eq() {
      return !this.P_() && this.bx();
   }

   public static boolean c(Collection<bki> $$0) {
      for (bki $$1 : $$0) {
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
         Iterator<bki> $$0 = this.bP.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<bki> et() {
      return this.bP.values();
   }

   public Map<bkg, bki> eu() {
      return this.bP;
   }

   public boolean a(bkg $$0) {
      return this.bP.containsKey($$0);
   }

   @Nullable
   public bki b(bkg $$0) {
      return this.bP.get($$0);
   }

   public final boolean b(bki $$0) {
      return this.b($$0, null);
   }

   public boolean b(bki $$0, @Nullable bkv $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         bki $$2 = this.bP.get($$0.c());
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

   public boolean c(bki $$0) {
      if (this.eT() == blq.b) {
         bkg $$1 = $$0.c();
         if ($$1 == bkk.j || $$1 == bkk.s) {
            return false;
         }
      }

      return true;
   }

   public void c(bki $$0, @Nullable bkv $$1) {
      if (this.c($$0)) {
         bki $$2 = this.bP.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean ev() {
      return this.eT() == blq.b;
   }

   @Nullable
   public bki c(@Nullable bkg $$0) {
      return this.bP.remove($$0);
   }

   public boolean d(bkg $$0) {
      bki $$1 = this.c($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(bki $$0, @Nullable bkv $$1) {
      this.bT = true;
      if (!this.dN().B) {
         $$0.c().a(this.eS(), $$0.e());
         this.d($$0);
      }
   }

   public void d(bki $$0) {
      for (bkv $$1 : this.cQ()) {
         if ($$1 instanceof amj $$2) {
            $$2.c.b(new ack(this.aj(), $$0));
         }
      }
   }

   protected void a(bki $$0, boolean $$1, @Nullable bkv $$2) {
      this.bT = true;
      if ($$1 && !this.dN().B) {
         bkg $$3 = $$0.c();
         $$3.a(this.eS());
         $$3.a(this.eS(), $$0.e());
         this.y();
      }

      if (!this.dN().B) {
         this.d($$0);
      }
   }

   protected void a(bki $$0) {
      this.bT = true;
      if (!this.dN().B) {
         $$0.c().a(this.eS());
         this.y();

         for (bkv $$1 : this.cQ()) {
            if ($$1 instanceof amj $$2) {
               $$2.c.b(new aaq(this.aj(), $$0.c()));
            }
         }
      }
   }

   private void y() {
      for (bmn $$0 : this.eS().a()) {
         this.d($$0.a());
      }
   }

   private void d(bmm $$0) {
      if ($$0 == bmr.l) {
         float $$1 = this.eN();
         if (this.ew() > $$1) {
            this.c($$1);
         }
      } else if ($$0 == bmr.k) {
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
      this.an.b(bH, atq.a($$0, 0.0F, this.eN()));
   }

   public boolean ex() {
      return this.ew() <= 0.0F;
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dN().B) {
         return false;
      } else if (this.ex()) {
         return false;
      } else if ($$0.a(arm.i) && this.a(bkk.l)) {
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
            if (!$$0.a(arm.j) && $$0.c() instanceof bll $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(arm.o) && this.ai().a(arn.l)) {
            $$1 *= 5.0F;
         }

         this.aQ.a(1.5F);
         boolean $$7 = true;
         if ((float)this.al > 10.0F && !$$0.a(arm.e)) {
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

         if ($$0.a(arm.a) && !this.c(bla.f).b()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         bkv $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof bll $$9 && !$$0.a(arm.q)) {
               this.a($$9);
            }

            if ($$8 instanceof cdz $$10) {
               this.aZ = 100;
               this.aY = $$10;
            } else if ($$8 instanceof bxz $$11 && $$11.u()) {
               this.aZ = 100;
               if ($$11.R_() instanceof cdz $$12) {
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

            if (!$$0.a(arm.r) && (!$$3 || $$1 > 0.0F)) {
               this.bq();
            }

            if ($$8 != null && !$$0.a(arm.z)) {
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
               aqu $$15 = this.n_();
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

         if (this instanceof amj) {
            al.h.a((amj)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((amj)this).a(arf.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof amj) {
            al.g.a((amj)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$16;
      }
   }

   protected void d(bll $$0) {
      $$0.e(this);
   }

   protected void e(bll $$0) {
      $$0.q(0.5, $$0.ds() - this.ds(), $$0.dy() - this.dy());
   }

   private boolean h(bjt $$0) {
      if ($$0.a(arm.d)) {
         return false;
      } else {
         clo $$1 = null;

         for (bja $$2 : bja.values()) {
            clo $$3 = this.b($$2);
            if ($$3.a(clr.vl)) {
               $$1 = $$3.p();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof amj $$4) {
               $$4.b(arf.c.b(clr.vl));
               al.B.a($$4, $$1);
               this.a(dlx.C);
            }

            this.c(1.0F);
            this.es();
            this.b(new bki(bkk.j, 900, 1));
            this.b(new bki(bkk.v, 100, 1));
            this.b(new bki(bkk.l, 800, 0));
            this.dN().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bjt ey() {
      if (this.dN().W() - this.ce > 40L) {
         this.cd = null;
      }

      return this.cd;
   }

   protected void e(bjt $$0) {
      aqu $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eX(), this.eY());
      }
   }

   public boolean f(bjt $$0) {
      bkv $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cef $$3 && $$3.D() > 0) {
         $$2 = true;
      }

      if (!$$0.a(arm.c) && this.fv() && !$$2) {
         ejz $$4 = $$0.h();
         if ($$4 != null) {
            ejz $$5 = this.b(0.0F, this.cp());
            ejz $$6 = $$4.a(this.dl());
            $$6 = new ejz($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(clo $$0) {
      if (!$$0.b()) {
         if (!this.aU()) {
            this.dN().a(this.ds(), this.du(), this.dy(), aqv.mt, this.dc(), 0.8F, 0.8F + this.dN().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bjt $$0) {
      if (!this.dI() && !this.ba) {
         bkv $$1 = $$0.d();
         bll $$2 = this.eM();
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
         if (this.dN() instanceof ami $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.a(dlx.p);
               this.g($$0);
               this.f($$2);
            }

            this.dN().a(this, (byte)3);
         }

         this.b(blx.h);
      }
   }

   protected void f(@Nullable bll $$0) {
      if (!this.dN().B) {
         boolean $$1 = false;
         if ($$0 instanceof cag) {
            if (this.dN().Y().b(csb.c)) {
               hx $$2 = this.dn();
               dhn $$3 = cvh.cd.o();
               if (this.dN().a_($$2).i() && $$3.a((csi)this.dN(), $$2)) {
                  this.dN().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               cas $$4 = new cas(this.dN(), this.ds(), this.du(), this.dy(), new clo(clr.dv));
               this.dN().b($$4);
            }
         }
      }
   }

   protected void g(bjt $$0) {
      bkv $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof cdz) {
         $$2 = cqb.h((bll)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.aZ > 0;
      if (this.ee() && this.dN().Y().b(csb.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.ez();
      this.eA();
   }

   protected void ez() {
   }

   protected void eA() {
      if (this.dN() instanceof ami && !this.eE() && (this.eg() || this.aZ > 0 && this.ed() && this.dN().Y().b(csb.f))) {
         blb.a((ami)this.dN(), this.dl(), this.ef());
      }
   }

   protected void a(bjt $$0, int $$1, boolean $$2) {
   }

   public agm eB() {
      return this.ai().j();
   }

   public long eC() {
      return 0L;
   }

   protected void a(bjt $$0, boolean $$1) {
      agm $$2 = this.eB();
      efk $$3 = this.dN().n().aJ().getLootTable($$2);
      efi.a $$4 = new efi.a((ami)this.dN()).a(ehn.a, this).a(ehn.f, this.dl()).a(ehn.c, $$0).b(ehn.d, $$0.d()).b(ehn.e, $$0.c());
      if ($$1 && this.aY != null) {
         $$4 = $$4.a(ehn.b, this.aY).a(this.aY.gp());
      }

      efi $$5 = $$4.a(ehm.g);
      $$3.a($$5, this.eC(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.b(bmr.i);
      if (!($$0 <= 0.0)) {
         this.au = true;
         ejz $$3 = this.dq();
         ejz $$4 = new ejz($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aC() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected aqu d(bjt $$0) {
      return aqv.jt;
   }

   @Nullable
   protected aqu n_() {
      return aqv.jo;
   }

   private aqu d(int $$0) {
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

   protected eju eG() {
      eju $$0 = this.cH();
      bkv $$1 = this.da();
      if ($$1 != null) {
         ejz $$2 = $$1.m(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public bll.a eH() {
      return new bll.a(aqv.ju, aqv.jm);
   }

   protected aqu c(clo $$0) {
      return $$0.N();
   }

   public aqu d(clo $$0) {
      return $$0.O();
   }

   public Optional<hx> eI() {
      return this.cc;
   }

   public boolean e_() {
      if (this.P_()) {
         return false;
      } else {
         hx $$0 = this.dn();
         dhn $$1 = this.do();
         if ($$1.a(ark.aO)) {
            this.cc = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof ddr && this.c($$0, $$1)) {
            this.cc = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(hx $$0, dhn $$1) {
      if ($$1.c(ddr.b)) {
         dhn $$2 = this.dN().a_($$0.d());
         if ($$2.a(cvh.cO) && $$2.c(czk.b) == $$1.c(ddr.aE)) {
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
   public boolean a(float $$0, float $$1, bjt $$2) {
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
      if (this.ai().a(arn.o)) {
         return 0;
      } else {
         bki $$2 = this.b(bkk.h);
         float $$3 = $$2 == null ? 0.0F : (float)($$2.e() + 1);
         return atq.f(($$0 - 3.0F - $$3) * $$1);
      }
   }

   protected void eJ() {
      if (!this.aU()) {
         int $$0 = atq.a(this.ds());
         int $$1 = atq.a(this.du() - 0.2F);
         int $$2 = atq.a(this.dy());
         dhn $$3 = this.dN().a_(new hx($$0, $$1, $$2));
         if (!$$3.i()) {
            dcr $$4 = $$3.w();
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
      return atq.a(this.b(bmr.a));
   }

   protected void b(bjt $$0, float $$1) {
   }

   protected void c(bjt $$0, float $$1) {
   }

   protected void u(float $$0) {
   }

   protected float d(bjt $$0, float $$1) {
      if (!$$0.a(arm.b)) {
         this.b($$0, $$1);
         $$1 = bjp.a($$1, (float)this.eK(), (float)this.b(bmr.b));
      }

      return $$1;
   }

   protected float e(bjt $$0, float $$1) {
      if ($$0.a(arm.f)) {
         return $$1;
      } else {
         if (this.a(bkk.k) && !$$0.a(arm.g)) {
            int $$2 = (this.b(bkk.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof amj) {
                  ((amj)this).a(arf.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof amj) {
                  ((amj)$$0.d()).a(arf.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(arm.h)) {
            return $$1;
         } else {
            int $$7 = cqb.a(this.bL(), $$0);
            if ($$7 > 0) {
               $$1 = bjp.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bjt $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fl(), 0.0F);
         this.y(this.fl() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof amj $$4) {
            $$4.a(arf.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eL().a($$0, var9);
            this.c(this.ew() - var9);
            this.y(this.fl() - var9);
            this.a(dlx.o);
         }
      }
   }

   public bjq eL() {
      return this.bO;
   }

   @Nullable
   public bll eM() {
      if (this.aY != null) {
         return this.aY;
      } else {
         return this.bU != null ? this.bU : null;
      }
   }

   public final float eN() {
      return (float)this.b(bmr.l);
   }

   public final float eO() {
      return (float)this.b(bmr.k);
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
      if (bkj.a(this)) {
         return 6 - (1 + bkj.b(this));
      } else {
         return this.a(bkk.d) ? 6 + (1 + this.b(bkk.d).e()) * 2 : 6;
      }
   }

   public void a(bja $$0) {
      this.a($$0, false);
   }

   public void a(bja $$0, boolean $$1) {
      if (!this.aF || this.aH >= this.B() / 2 || this.aH < 0) {
         this.aH = -1;
         this.aF = true;
         this.aG = $$0;
         if (this.dN() instanceof ami) {
            yk $$2 = new yk(this, $$0 == bja.a ? 0 : 3);
            amg $$3 = ((ami)this.dN()).k();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bjt $$0) {
      this.aQ.a(1.5F);
      this.al = 20;
      this.aL = 10;
      this.aK = this.aL;
      aqu $$1 = this.d($$0);
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
            aqu $$1 = this.n_();
            if ($$1 != null) {
               this.a($$1, this.eX(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cdz)) {
               this.c(0.0F);
               this.a(this.dO().n());
            }
            break;
         case 29:
            this.a(aqv.vl, 1.0F, 0.8F + this.dN().z.i() * 0.4F);
            break;
         case 30:
            this.a(aqv.vm, 0.8F, 0.8F + this.dN().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.ag.i() - 0.5F) * 0.2F;
               float $$6 = (this.ag.i() - 0.5F) * 0.2F;
               float $$7 = (this.ag.i() - 0.5F) * 0.2F;
               double $$8 = atq.d($$4, this.K, this.ds()) + (this.ag.j() - 0.5) * (double)this.dh() * 2.0;
               double $$9 = atq.d($$4, this.L, this.du()) + this.ag.j() * (double)this.di();
               double $$10 = atq.d($$4, this.M, this.dy()) + (this.ag.j() - 0.5) * (double)this.dh() * 2.0;
               this.dN().a(jw.X, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.c(bla.a));
            break;
         case 48:
            this.i(this.c(bla.b));
            break;
         case 49:
            this.i(this.c(bla.f));
            break;
         case 50:
            this.i(this.c(bla.e));
            break;
         case 51:
            this.i(this.c(bla.d));
            break;
         case 52:
            this.i(this.c(bla.c));
            break;
         case 54:
            cyy.b(this);
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
         this.dN().a(jw.W, this.d(1.0), this.dv(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void D() {
      clo $$0 = this.c(bla.b);
      this.a(bla.b, this.c(bla.a));
      this.a(bla.a, $$0);
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
   public bmn a(bmm $$0) {
      return this.eS().a($$0);
   }

   public double a(ig<bmm> $$0) {
      return this.b($$0.a());
   }

   public double b(bmm $$0) {
      return this.eS().c($$0);
   }

   public double b(ig<bmm> $$0) {
      return this.c($$0.a());
   }

   public double c(bmm $$0) {
      return this.eS().d($$0);
   }

   public bmo eS() {
      return this.bN;
   }

   public blq eT() {
      return blq.a;
   }

   public clo eU() {
      return this.c(bla.a);
   }

   public clo eV() {
      return this.c(bla.b);
   }

   public boolean b(clj $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<clo> $$0) {
      return $$0.test(this.eU()) || $$0.test(this.eV());
   }

   public clo b(bja $$0) {
      if ($$0 == bja.a) {
         return this.c(bla.a);
      } else if ($$0 == bja.b) {
         return this.c(bla.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bja $$0, clo $$1) {
      if ($$0 == bja.a) {
         this.a(bla.a, $$1);
      } else {
         if ($$0 != bja.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bla.b, $$1);
      }
   }

   public boolean b(bla $$0) {
      return !this.c($$0).b();
   }

   @Override
   public abstract Iterable<clo> bL();

   public abstract clo c(bla var1);

   @Override
   public abstract void a(bla var1, clo var2);

   protected void e(clo $$0) {
      sd $$1 = $$0.v();
      if ($$1 != null) {
         $$0.d().b($$1);
      }
   }

   public float eW() {
      Iterable<clo> $$0 = this.bL();
      int $$1 = 0;
      int $$2 = 0;

      for (clo $$3 : $$0) {
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
      bmn $$1 = this.a(bmr.m);
      $$1.b(bA.a());
      if ($$0) {
         $$1.b(bA);
      }
   }

   protected float eX() {
      return 1.0F;
   }

   public float eY() {
      return this.o_() ? (this.ag.i() - this.ag.i()) * 0.2F + 1.5F : (this.ag.i() - this.ag.i()) * 0.2F + 1.0F;
   }

   protected boolean eZ() {
      return this.ex();
   }

   @Override
   public void g(bkv $$0) {
      if (!this.fE()) {
         super.g($$0);
      }
   }

   private void a(bkv $$0) {
      ejz $$1;
      if (this.dI()) {
         $$1 = this.dl();
      } else if (!$$0.dI() && !this.dN().a_($$0.dn()).a(ark.aI)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.du(), $$0.du());
         $$1 = new ejz(this.ds(), $$2, this.dy());
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
      return this.a(bkk.h) ? 0.1F * ((float)this.b(bkk.h).e() + 1.0F) : 0.0F;
   }

   protected void fc() {
      ejz $$0 = this.dq();
      this.o($$0.c, (double)this.fa(), $$0.e);
      if (this.bY()) {
         float $$1 = this.dD() * (float) (Math.PI / 180.0);
         this.g(this.dq().b((double)(-atq.a($$1) * 0.2F), 0.0, (double)(atq.b($$1) * 0.2F)));
      }

      this.au = true;
   }

   protected void fd() {
      this.g(this.dq().b(0.0, -0.04F, 0.0));
   }

   protected void c(arz<ecw> $$0) {
      this.g(this.dq().b(0.0, 0.04F, 0.0));
   }

   protected float fe() {
      return 0.8F;
   }

   public boolean a(ecx $$0) {
      return false;
   }

   public void a(ejz $$0) {
      if (this.cY()) {
         double $$1 = 0.08;
         boolean $$2 = this.dq().d <= 0.0;
         if ($$2 && this.a(bkk.B)) {
            $$1 = 0.01;
         }

         ecx $$3 = this.dN().b_(this.dn());
         if (this.aZ() && this.eb() && !this.a($$3)) {
            double $$4 = this.du();
            float $$5 = this.bY() ? 0.9F : this.fe();
            float $$6 = 0.02F;
            float $$7 = (float)cqb.f(this);
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

            if (this.a(bkk.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(blr.a, this.dq());
            ejz $$8 = this.dq();
            if (this.P && this.e_()) {
               $$8 = new ejz($$8.c, 0.2, $$8.e);
            }

            this.g($$8.d((double)$$5, 0.8F, (double)$$5));
            ejz $$9 = this.a($$1, $$2, this.dq());
            this.g($$9);
            if (this.P && this.g($$9.c, $$9.d + 0.6F - this.du() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bn() && this.eb() && !this.a($$3)) {
            double $$10 = this.du();
            this.a(0.02F, $$0);
            this.a(blr.a, this.dq());
            if (this.b(arp.b) <= this.dg()) {
               this.g(this.dq().d(0.5, 0.8F, 0.5));
               ejz $$11 = this.a($$1, $$2, this.dq());
               this.g($$11);
            } else {
               this.g(this.dq().a(0.5));
            }

            if (!this.aV()) {
               this.g(this.dq().b(0.0, -$$1 / 4.0, 0.0));
            }

            ejz $$12 = this.dq();
            if (this.P && this.g($$12.c, $$12.d + 0.6F - this.du() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fx()) {
            this.cn();
            ejz $$13 = this.dq();
            ejz $$14 = this.bF();
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
               double $$21 = $$17 * (double)(-atq.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.g($$13.d(0.99F, 0.98F, 0.99F));
            this.a(blr.a, this.dq());
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
            hx $$25 = this.aI();
            float $$26 = this.dN().a_($$25).b().i();
            float $$27 = this.aC() ? $$26 * 0.91F : 0.91F;
            ejz $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.a(bkk.y)) {
               $$29 += (0.05 * (double)(this.b(bkk.y).e() + 1) - $$28.d) * 0.2;
            } else if (this.dN().B && !this.dN().A($$25)) {
               if (this.du() > (double)this.dN().J_()) {
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

      this.q(this instanceof bxf);
   }

   private void c(cdz $$0, ejz $$1) {
      ejz $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.cY()) {
         this.w(this.e($$0));
         this.a($$2);
      } else {
         this.q(false);
         this.g(ejz.b);
         this.aD();
      }
   }

   protected void a(cdz $$0, ejz $$1) {
   }

   protected ejz b(cdz $$0, ejz $$1) {
      return $$1;
   }

   protected float e(cdz $$0) {
      return this.fg();
   }

   public void q(boolean $$0) {
      float $$1 = (float)atq.g(this.ds() - this.K, $$0 ? this.du() - this.L : 0.0, this.dy() - this.M);
      this.v($$1);
   }

   protected void v(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aQ.a($$1, 0.4F);
   }

   public ejz a(ejz $$0, float $$1) {
      this.a(this.A($$1), $$0);
      this.g(this.j(this.dq()));
      this.a(blr.a, this.dq());
      ejz $$2 = this.dq();
      if ((this.P || this.bj) && (this.e_() || this.do().a(cvh.qP) && day.a(this))) {
         $$2 = new ejz($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public ejz a(double $$0, boolean $$1, ejz $$2) {
      if (!this.aV() && !this.bY()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new ejz($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private ejz j(ejz $$0) {
      if (this.e_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = atq.a($$0.c, -0.15F, 0.15F);
         double $$3 = atq.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.do().a(cvh.nS) && this.fw() && this instanceof cdz) {
            $$4 = 0.0;
         }

         $$0 = new ejz($$2, $$4, $$3);
      }

      return $$0;
   }

   private float A(float $$0) {
      return this.aC() ? this.fg() * (0.21600002F / ($$0 * $$0 * $$0)) : this.ff();
   }

   protected float ff() {
      return this.cO() instanceof cdz ? this.fg() * 0.1F : 0.02F;
   }

   public float fg() {
      return this.bY;
   }

   public void w(float $$0) {
      this.bY = $$0;
   }

   public boolean C(bkv $$0) {
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
         this.d_();
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
         float $$8 = (float)atq.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = atq.e(atq.g(this.dD()) - $$8);
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
      Map<bla, clo> $$0 = this.G();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bla, clo> G() {
      Map<bla, clo> $$0 = null;

      for (bla $$1 : bla.values()) {
         clo $$2;
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

         clo $$5 = this.c($$1);
         if (this.a($$2, $$5)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bla.class);
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

   public boolean a(clo $$0, clo $$1) {
      return !clo.a($$1, $$0);
   }

   private void a(Map<bla, clo> $$0) {
      clo $$1 = $$0.get(bla.a);
      clo $$2 = $$0.get(bla.b);
      if ($$1 != null && $$2 != null && clo.a($$1, this.f(bla.b)) && clo.a($$2, this.f(bla.a))) {
         ((ami)this.dN()).k().b(this, new zj(this, (byte)55));
         $$0.remove(bla.a);
         $$0.remove(bla.b);
         this.c(bla.a, $$1.p());
         this.c(bla.b, $$2.p());
      }
   }

   private void b(Map<bla, clo> $$0) {
      List<Pair<bla, clo>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         clo $$3 = $$2.p();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
         }
      });
      ((ami)this.dN()).k().b(this, new abl(this.aj(), $$1));
   }

   private clo e(bla $$0) {
      return this.bR.get($$0.b());
   }

   private void b(bla $$0, clo $$1) {
      this.bR.set($$0.b(), $$1);
   }

   private clo f(bla $$0) {
      return this.bQ.get($$0.b());
   }

   private void c(bla $$0, clo $$1) {
      this.bQ.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = atq.g($$0 - this.aU);
      this.aU += $$2 * 0.3F;
      float $$3 = atq.g(this.dD() - this.aU);
      float $$4 = this.fh();
      if (Math.abs($$3) > $$4) {
         this.aU = this.aU + ($$3 - (float)atq.j((double)$$3) * $$4);
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

   public void d_() {
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

      ejz $$0 = this.dq();
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
            $$4 = this.b(arp.b);
         } else {
            $$4 = this.b(arp.a);
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
               this.c(arp.b);
            }
         } else {
            this.c(arp.a);
         }
      } else {
         this.bZ = 0;
      }

      this.dN().ae().c();
      this.dN().ae().a("travel");
      this.bk *= 0.98F;
      this.bm *= 0.98F;
      this.H();
      eju $$8 = this.cH();
      ejz $$9 = new ejz((double)this.bk, (double)this.bl, (double)this.bm);
      if (this.a(bkk.B) || this.a(bkk.y)) {
         this.n();
      }

      label104: {
         if (this.cO() instanceof cdz $$10 && this.bx()) {
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

      this.M_();
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
      if ($$0 && !this.aC() && !this.bO() && !this.a(bkk.y)) {
         clo $$1 = this.c(bla.e);
         if ($$1.a(clr.nS) && cki.d($$1)) {
            $$0 = true;
            int $$2 = this.bx + 1;
            if (!this.dN().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, $$0x -> $$0x.d(bla.e));
               }

               this.a(dlx.n);
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

   protected void M_() {
      if (this.dN().y_()) {
         this.dN().a(dll.a(cdz.class), this.cH(), bky.a(this)).forEach(this::D);
      } else {
         List<bkv> $$0 = this.dN().a(this, this.cH(), bky.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dN().Y().c(csb.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.ag.a(4) == 0) {
               int $$2 = 0;

               for (bkv $$3 : $$0) {
                  if (!$$3.bO()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dO().g(), 6.0F);
               }
            }

            for (bkv $$4 : $$0) {
               this.D($$4);
            }
         }
      }
   }

   protected void a(eju $$0, eju $$1) {
      eju $$2 = $$0.b($$1);
      List<bkv> $$3 = this.dN().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bkv $$4 : $$3) {
            if ($$4 instanceof bll) {
               this.g((bll)$$4);
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

   protected void D(bkv $$0) {
      $$0.g(this);
   }

   protected void g(bll $$0) {
   }

   public boolean fk() {
      return (this.an.b(t) & 4) != 0;
   }

   @Override
   public void ac() {
      bkv $$0 = this.da();
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
   public double p_() {
      return this.bn > 0 ? this.bo : this.ds();
   }

   @Override
   public double N_() {
      return this.bn > 0 ? this.bp : this.du();
   }

   @Override
   public double O_() {
      return this.bn > 0 ? this.bq : this.dy();
   }

   @Override
   public float f_() {
      return this.bn > 0 ? (float)this.bs : this.dF();
   }

   @Override
   public float q_() {
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

   public void a(cas $$0) {
      bkv $$1 = $$0.w();
      if ($$1 instanceof amj) {
         al.O.a((amj)$$1, $$0.q(), this);
      }
   }

   public void a(bkv $$0, int $$1) {
      if (!$$0.dI() && !this.dN().B && ($$0 instanceof cas || $$0 instanceof cef || $$0 instanceof blb)) {
         ((ami)this.dN()).k().b($$0, new ace($$0.aj(), this.aj(), $$1));
      }
   }

   public boolean E(bkv $$0) {
      if ($$0.dN() != this.dN()) {
         return false;
      } else {
         ejz $$1 = new ejz(this.ds(), this.dw(), this.dy());
         ejz $$2 = new ejz($$0.ds(), $$0.dw(), $$0.dy());
         return $$2.f($$1) > 128.0 ? false : this.dN().a(new cro($$1, $$2, cro.a.a, cro.b.a, this)).c() == ejx.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.aW : atq.i($$0, this.aX, this.aW);
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
   protected ejz a(ib.a $$0, l.a $$1) {
      return i(super.a($$0, $$1));
   }

   public static ejz i(ejz $$0) {
      return new ejz($$0.c, $$0.d, 0.0);
   }

   public float fl() {
      return this.ca;
   }

   public final void y(float $$0) {
      this.z(atq.a($$0, 0.0F, this.eO()));
   }

   protected void z(float $$0) {
      this.ca = $$0;
   }

   public void g_() {
   }

   public void h_() {
   }

   protected void fm() {
      this.bT = true;
   }

   public abstract blf fn();

   public boolean fo() {
      return (this.an.b(t) & 1) > 0;
   }

   public bja fp() {
      return (this.an.b(t) & 2) > 0 ? bja.b : bja.a;
   }

   private void I() {
      if (this.fo()) {
         if (clo.b(this.b(this.fp()), this.bv)) {
            this.bv = this.b(this.fp());
            this.a(this.bv);
         } else {
            this.fu();
         }
      }
   }

   protected void a(clo $$0) {
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
      cgo $$1 = this.bv.d().v();
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

   public void c(bja $$0) {
      clo $$1 = this.b($$0);
      if (!$$1.b() && !this.fo()) {
         this.bv = $$1;
         this.bw = $$1.r();
         if (!this.dN().B) {
            this.c(1, true);
            this.c(2, $$0 == bja.b);
            this.a(dlx.D);
         }
      }
   }

   @Override
   public void a(afs<?> $$0) {
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
            this.bv = clo.b;
            this.bw = 0;
         }
      }
   }

   @Override
   public void a(ef.a $$0, ejz $$1) {
      super.a($$0, $$1);
      this.aX = this.aW;
      this.aU = this.aW;
      this.aV = this.aU;
   }

   protected void b(clo $$0, int $$1) {
      if (!$$0.b() && this.fo()) {
         if ($$0.s() == cnh.c) {
            this.a(this.c($$0), 0.5F, this.dN().z.i() * 0.1F + 0.9F);
         }

         if ($$0.s() == cnh.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(clo $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ejz $$3 = new ejz(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dF() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dD() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.ag.i()) * 0.6 - 0.3;
         ejz $$5 = new ejz(((double)this.ag.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dF() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dD() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.ds(), this.dw(), this.dy());
         this.dN().a(new js(jw.O, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void x() {
      if (!this.dN().B || this.fo()) {
         bja $$0 = this.fp();
         if (!this.bv.equals(this.b($$0))) {
            this.ft();
         } else {
            if (!this.bv.b() && this.fo()) {
               this.b(this.bv, 16);
               clo $$1 = this.bv.a(this.dN(), this);
               if ($$1 != this.bv) {
                  this.a($$0, $$1);
               }

               this.fu();
            }
         }
      }
   }

   public clo fq() {
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
            this.a(dlx.C);
         }
      }

      this.bv = clo.b;
      this.bw = 0;
   }

   public boolean fv() {
      if (this.fo() && !this.bv.b()) {
         clj $$0 = this.bv.d();
         return $$0.c(this.bv) != cnh.d ? false : $$0.b(this.bv) - this.bw >= 5;
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
      return super.ca() || !this.fx() && this.c(blx.b);
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
      hx $$9 = hx.a($$0, $$1, $$2);
      csf $$10 = this.dN();
      if ($$10.A($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.J_()) {
            hx $$12 = $$9.d();
            dhn $$13 = $$10.a_($$12);
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

         if (this instanceof blu $$14) {
            $$14.N().n();
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

   public void a(hx $$0, boolean $$1) {
   }

   public boolean f(clo $$0) {
      return false;
   }

   @Override
   public bkw a(blx $$0) {
      return $$0 == blx.c ? v : super.a($$0).a(this.ea());
   }

   public ImmutableList<blx> fB() {
      return ImmutableList.of(blx.a);
   }

   public eju e(blx $$0) {
      bkw $$1 = this.a($$0);
      return new eju((double)(-$$1.a / 2.0F), 0.0, (double)(-$$1.a / 2.0F), (double)($$1.a / 2.0F), (double)$$1.b, (double)($$1.a / 2.0F));
   }

   protected boolean f(blx $$0) {
      eju $$1 = this.a($$0).a(this.dl());
      return this.dN().b(this, $$1);
   }

   @Override
   public boolean ct() {
      return super.ct() && !this.fE();
   }

   public Optional<hx> fC() {
      return this.an.b(bM);
   }

   public void g(hx $$0) {
      this.an.b(bM, Optional.of($$0));
   }

   public void fD() {
      this.an.b(bM, Optional.empty());
   }

   public boolean fE() {
      return this.fC().isPresent();
   }

   public void b(hx $$0) {
      if (this.bO()) {
         this.ac();
      }

      dhn $$1 = this.dN().a_($$0);
      if ($$1.b() instanceof cuy) {
         this.dN().a($$0, $$1.a(cuy.c, Boolean.valueOf(true)), 3);
      }

      this.b(blx.c);
      this.a($$0);
      this.g($$0);
      this.g(ejz.b);
      this.au = true;
   }

   private void a(hx $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean N() {
      return this.fC().map($$0 -> this.dN().a_($$0).b() instanceof cuy).orElse(false);
   }

   public void fF() {
      this.fC().filter(this.dN()::A).ifPresent($$0x -> {
         dhn $$1 = this.dN().a_($$0x);
         if ($$1.b() instanceof cuy) {
            ib $$2 = $$1.c(cuy.aE);
            this.dN().a($$0x, $$1.a(cuy.c, Boolean.valueOf(false)), 3);
            ejz $$3 = cuy.a(this.ai(), this.dN(), $$0x, $$2, this.dD()).orElseGet(() -> {
               hx $$1x = $$0x.c();
               return new ejz((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            ejz $$4 = ejz.c($$0x).d($$3).d();
            float $$5 = (float)atq.d(atq.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      ejz $$0 = this.dl();
      this.b(blx.a);
      this.a_($$0.c, $$0.d, $$0.e);
      this.fD();
   }

   @Nullable
   public ib fG() {
      hx $$0 = this.fC().orElse(null);
      return $$0 != null ? cuy.a(this.dN(), $$0) : null;
   }

   @Override
   public boolean by() {
      return !this.fE() && super.by();
   }

   @Override
   protected final float a(blx $$0, bkw $$1) {
      return $$0 == blx.c ? 0.2F : this.b($$0, $$1);
   }

   protected float b(blx $$0, bkw $$1) {
      return super.a($$0, $$1);
   }

   public clo g(clo $$0) {
      return clo.b;
   }

   public clo a(csf $$0, clo $$1) {
      if ($$1.M()) {
         $$0.a(null, this.ds(), this.du(), this.dy(), this.d($$1), aqw.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$1, $$0, this);
         if (!(this instanceof cdz) || !((cdz)this).fU().d) {
            $$1.h(1);
         }

         this.a(dlx.m);
      }

      return $$1;
   }

   private void a(clo $$0, csf $$1, bll $$2) {
      clj $$3 = $$0.d();
      if ($$3.u()) {
         for (Pair<bki, Float> $$5 : $$3.v().f()) {
            if (!$$1.B && $$5.getFirst() != null && $$1.z.i() < (Float)$$5.getSecond()) {
               $$2.b(new bki((bki)$$5.getFirst()));
            }
         }
      }
   }

   private static byte g(bla $$0) {
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

   public void d(bla $$0) {
      this.dN().a(this, g($$0));
   }

   public void d(bja $$0) {
      this.d($$0 == bja.a ? bla.a : bla.b);
   }

   @Override
   public eju i_() {
      if (this.c(bla.f).a(clr.ui)) {
         float $$0 = 0.5F;
         return this.cH().c(0.5, 0.5, 0.5);
      } else {
         return super.i_();
      }
   }

   public static bla h(clo $$0) {
      ckp $$1 = ckp.c_($$0);
      return $$1 != null ? $$1.g() : bla.a;
   }

   private static bmd a(bll $$0, bla $$1) {
      return $$1 != bla.f && $$1 != bla.a && $$1 != bla.b ? bmd.a($$0, $$1, $$1x -> $$1x.b() || bln.h($$1x) == $$1) : bmd.a($$0, $$1);
   }

   @Nullable
   private static bla r(int $$0) {
      if ($$0 == 100 + bla.f.b()) {
         return bla.f;
      } else if ($$0 == 100 + bla.e.b()) {
         return bla.e;
      } else if ($$0 == 100 + bla.d.b()) {
         return bla.d;
      } else if ($$0 == 100 + bla.c.b()) {
         return bla.c;
      } else if ($$0 == 98) {
         return bla.a;
      } else {
         return $$0 == 99 ? bla.b : null;
      }
   }

   @Override
   public bmd a_(int $$0) {
      bla $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dB() {
      if (this.P_()) {
         return false;
      } else {
         boolean $$0 = !this.c(bla.f).a(ars.az) && !this.c(bla.e).a(ars.az) && !this.c(bla.d).a(ars.az) && !this.c(bla.c).a(ars.az);
         return $$0 && super.dB();
      }
   }

   @Override
   public boolean cd() {
      return !this.dN().y_() && this.a(bkk.x) || super.cd();
   }

   @Override
   public float dE() {
      return this.aU;
   }

   @Override
   public void a(yi $$0) {
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
      return this.eU().d() instanceof cjd;
   }

   @Override
   public float dH() {
      float $$0 = super.dH();
      return this.cO() instanceof cdz ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public ejz m(bkv $$0) {
      return new ejz(this.a($$0, this.a(this.ap()), this.ea()).rotateY(-this.aU * (float) (Math.PI / 180.0))).e(this.dl());
   }

   @Override
   public float k(bkv $$0) {
      return this.l($$0) * this.ea();
   }

   protected void a(int $$0, double $$1) {
      this.aW = (float)atq.e(1.0 / (double)$$0, (double)this.aW, $$1);
   }

   public static record a(aqu a, aqu b) {
   }
}
