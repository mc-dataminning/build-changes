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

public abstract class box extends bof implements bod {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "active_effects";
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final bqc bC = new bqc(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "Sprinting speed boost", 0.3F, bqc.a.c);
   public static final int h = 2;
   public static final int i = 4;
   public static final int j = 98;
   public static final int k = 100;
   public static final int l = 105;
   public static final int m = 6;
   public static final int n = 100;
   private static final int bD = 40;
   public static final double o = 0.003;
   public static final double p = 0.08;
   public static final int q = 20;
   private static final int bE = 7;
   private static final int bF = 10;
   private static final int bG = 2;
   public static final int r = 4;
   private static final float bH = 0.42F;
   private static final double bI = 128.0;
   protected static final int s = 1;
   protected static final int t = 2;
   protected static final int u = 4;
   protected static final aii<Byte> v = ail.a(box.class, aik.a);
   private static final aii<Float> bJ = ail.a(box.class, aik.d);
   private static final aii<Integer> bK = ail.a(box.class, aik.b);
   private static final aii<Boolean> bL = ail.a(box.class, aik.k);
   private static final aii<Integer> bM = ail.a(box.class, aik.b);
   private static final aii<Integer> bN = ail.a(box.class, aik.b);
   private static final aii<Optional<ib>> bO = ail.a(box.class, aik.o);
   protected static final boi aD = boi.c(0.2F, 0.2F).b(0.2F);
   public static final float aE = 0.5F;
   public static final float aF = 0.5F;
   private final bqb bP;
   private final bnb bQ = new bnb(this);
   private final Map<il<bnq>, bns> bR = Maps.newHashMap();
   private final iu<cpq> bS = iu.a(2, cpq.h);
   private final iu<cpq> bT = iu.a(4, cpq.h);
   private cpq bU = cpq.h;
   public boolean aG;
   private boolean bV = false;
   public bmk aH;
   public int aI;
   public int aJ;
   public int aK;
   public int aL;
   public int aM;
   public int aN;
   public float aO;
   public float aP;
   protected int aQ;
   public final bpx aR = new bpx();
   public final int aS = 20;
   public final float aT;
   public final float aU;
   public float aV;
   public float aW;
   public float aX;
   public float aY;
   @Nullable
   protected cia aZ;
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
   private boolean bW = true;
   @Nullable
   private box bX;
   private int bY;
   private box bZ;
   private int ca;
   private float cb;
   private int cc;
   private float cd;
   protected cpq bw = cpq.h;
   protected int bx;
   protected int by;
   private ib ce;
   private Optional<ib> cf = Optional.empty();
   @Nullable
   private bne cg;
   private long ch;
   protected int bz;
   private float ci;
   private float cj;
   protected bpy<?> bA;
   private boolean ck;
   protected float bB = 1.0F;

   protected box(bol<? extends box> $$0, cwe $$1) {
      super($$0, $$1);
      this.bP = new bqb(bqf.a($$0));
      this.t(this.eL());
      this.H = true;
      this.aU = (float)((Math.random() + 1.0) * 0.01F);
      this.ar();
      this.aT = (float)Math.random() * 12398.0F;
      this.r((float)(Math.random() * (float) (Math.PI * 2)));
      this.aX = this.dz();
      tm $$2 = tm.a;
      this.bA = this.a(new Dynamic($$2, (tv)$$2.createMap(ImmutableMap.of($$2.a("memories"), (tv)$$2.emptyMap()))));
   }

   public bpy<?> dM() {
      return this.bA;
   }

   protected bpy.b<?> dN() {
      return bpy.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bpy<?> a(Dynamic<?> $$0) {
      return this.dN().a($$0);
   }

   @Override
   public void al() {
      this.a(this.dK().w(), Float.MAX_VALUE);
   }

   public boolean a(bol<?> $$0) {
      return true;
   }

   @Override
   protected void c_() {
      this.am.a(v, (byte)0);
      this.am.a(bK, 0);
      this.am.a(bL, false);
      this.am.a(bM, 0);
      this.am.a(bN, 0);
      this.am.a(bJ, 1.0F);
      this.am.a(bO, Optional.empty());
   }

   public static bqd.a dO() {
      return bqd.a().a(bqe.n).a(bqe.k).a(bqe.o).a(bqe.a).a(bqe.b).a(bqe.m).a(bqe.r).a(bqe.p);
   }

   @Override
   protected void a(double $$0, boolean $$1, dme $$2, ib $$3) {
      if (!this.aZ()) {
         this.bh();
      }

      if (!this.dJ().B && $$1 && this.aa > 0.0F) {
         this.dT();
         this.dU();
      }

      if (!this.dJ().B && this.aa > 3.0F && $$1 && !$$2.i()) {
         double $$4 = this.do();
         double $$5 = this.dq();
         double $$6 = this.du();
         ib $$7 = this.dj();
         if ($$3.u() != $$7.u() || $$3.w() != $$7.w()) {
            double $$8 = $$4 - (double)$$3.u() - 0.5;
            double $$9 = $$6 - (double)$$3.w() - 0.5;
            double $$10 = Math.max(Math.abs($$8), Math.abs($$9));
            $$4 = (double)$$3.u() + 0.5 + $$8 / $$10 * 0.5;
            $$6 = (double)$$3.w() + 0.5 + $$9 / $$10 * 0.5;
         }

         float $$11 = (float)awm.f(this.aa - 3.0F);
         double $$12 = Math.min((double)(0.2F + $$11 / 15.0F), 2.5);
         int $$13 = (int)(150.0 * $$12);
         ((apa)this.dJ()).a(new jt(kb.c, $$2), $$4, $$5, $$6, $$13, 0.0, 0.0, 0.0, 0.15F);
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cf = Optional.empty();
      }
   }

   public final boolean dP() {
      return this.ai().a(auh.m);
   }

   public float a(float $$0) {
      return awm.i($$0, this.cj, this.ci);
   }

   @Override
   public void as() {
      this.aO = this.aP;
      if (this.al) {
         this.fD().ifPresent(this::a);
      }

      if (this.dQ()) {
         this.dR();
      }

      super.as();
      this.dJ().ae().a("livingEntityBaseTick");
      if (this.aY() || this.dJ().B) {
         this.aA();
      }

      if (this.bx()) {
         boolean $$0 = this instanceof cia;
         if (!this.dJ().B) {
            if (this.by()) {
               this.a(this.dK().f(), 1.0F);
            } else if ($$0 && !this.dJ().D_().a(this.cE())) {
               double $$1 = this.dJ().D_().a(this) + this.dJ().D_().n();
               if ($$1 < 0.0) {
                  double $$2 = this.dJ().D_().o();
                  if ($$2 > 0.0) {
                     this.a(this.dK().v(), (float)Math.max(1, awm.a(-$$1 * $$2)));
                  }
               }
            }
         }

         if (this.a(auj.a) && !this.dJ().a_(ib.a(this.do(), this.ds(), this.du())).a(czh.nd)) {
            boolean $$3 = !this.dP() && !bnt.c(this) && (!$$0 || !((cia)this).fW().a);
            if ($$3) {
               this.k(this.n(this.cf()));
               if (this.cf() == -20) {
                  this.k(0);
                  eov $$4 = this.dm();

                  for (int $$5 = 0; $$5 < 8; $$5++) {
                     double $$6 = this.af.j() - this.af.j();
                     double $$7 = this.af.j() - this.af.j();
                     double $$8 = this.af.j() - this.af.j();
                     this.dJ().a(kb.e, this.do() + $$6, this.dq() + $$7, this.du() + $$8, $$4.c, $$4.d, $$4.e);
                  }

                  this.a(this.dK().h(), 2.0F);
               }
            }

            if (!this.dJ().B && this.bL() && this.cW() != null && this.cW().bN()) {
               this.ac();
            }
         } else if (this.cf() < this.ce()) {
            this.k(this.o(this.cf()));
         }

         if (!this.dJ().B) {
            ib $$9 = this.dj();
            if (!Objects.equal(this.ce, $$9)) {
               this.ce = $$9;
               this.c($$9);
            }
         }
      }

      if (this.bx() && (this.bb() || this.az)) {
         this.aF();
      }

      if (this.aL > 0) {
         this.aL--;
      }

      if (this.ak > 0 && !(this instanceof apb)) {
         this.ak--;
      }

      if (this.ev() && this.dJ().h(this)) {
         this.ea();
      }

      if (this.ba > 0) {
         this.ba--;
      } else {
         this.aZ = null;
      }

      if (this.bZ != null && !this.bZ.bx()) {
         this.bZ = null;
      }

      if (this.bX != null) {
         if (!this.bX.bx()) {
            this.a(null);
         } else if (this.ag - this.bY > 100) {
            this.a(null);
         }
      }

      this.em();
      this.bg = this.bf;
      this.aW = this.aV;
      this.aY = this.aX;
      this.M = this.dz();
      this.N = this.dB();
      this.dJ().ae().c();
   }

   public boolean dQ() {
      return this.ag % 5 == 0 && this.dm().c != 0.0 && this.dm().e != 0.0 && !this.P_() && cua.k(this) && this.dS();
   }

   protected void dR() {
      eov $$0 = this.dm();
      this.dJ()
         .a(
            kb.K,
            this.do() + (this.af.j() - 0.5) * (double)this.dd(),
            this.dq() + 0.1,
            this.du() + (this.af.j() - 0.5) * (double)this.dd(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.af.i() * 0.4F + this.af.i() > 0.9F ? 0.6F : 0.0F;
      this.a(atp.xj, $$1, 0.6F + this.af.i() * 0.4F);
   }

   protected boolean dS() {
      return this.dJ().a_(this.aI()).a(aue.aM);
   }

   @Override
   protected float aL() {
      return this.dS() && cua.a(cuc.l, this) > 0 ? 1.0F : super.aL();
   }

   @Override
   protected boolean c(dme $$0) {
      return !$$0.i() || this.fy();
   }

   protected void dT() {
      bqa $$0 = this.f(bqe.o);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }
      }
   }

   protected void dU() {
      if (!this.bj().i()) {
         int $$0 = cua.a(cuc.l, this);
         if ($$0 > 0 && this.dS()) {
            bqa $$1 = this.f(bqe.o);
            if ($$1 == null) {
               return;
            }

            $$1.c(new bqc(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), bqc.a.a));
            if (this.ef().i() < 0.04F) {
               cpq $$2 = this.c(bom.c);
               $$2.a(1, this, bom.c);
            }
         }
      }
   }

   protected void dV() {
      bqa $$0 = this.f(bqe.o);
      if ($$0 != null) {
         if ($$0.a(e) != null) {
            $$0.b(e);
         }
      }
   }

   protected void dW() {
      if (!this.bj().i()) {
         int $$0 = this.cg();
         if ($$0 > 0) {
            bqa $$1 = this.f(bqe.o);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.ch();
            $$1.c(new bqc(e, "Powder snow slow", (double)$$2, bqc.a.a));
         }
      }
   }

   protected void c(ib $$0) {
      int $$1 = cua.a(cuc.j, this);
      if ($$1 > 0) {
         cuf.a(this, this.dJ(), $$0, $$1);
      }

      if (this.c(this.bj())) {
         this.dT();
      }

      this.dU();
   }

   public boolean o_() {
      return false;
   }

   public float dX() {
      return this.o_() ? 0.5F : 1.0F;
   }

   public float dY() {
      bqb $$0 = this.eQ();
      return $$0 == null ? 1.0F : this.b((float)$$0.c(bqe.p));
   }

   protected float b(float $$0) {
      return $$0;
   }

   protected boolean dZ() {
      return true;
   }

   protected void ea() {
      this.aN++;
      if (this.aN >= 20 && !this.dJ().y_() && !this.dE()) {
         this.dJ().a(this, (byte)60);
         this.a(bof.c.a);
      }
   }

   public boolean eb() {
      return !this.o_();
   }

   protected boolean ec() {
      return !this.o_();
   }

   protected int n(int $$0) {
      int $$1 = cua.e(this);
      return $$1 > 0 && this.af.a($$1 + 1) > 0 ? $$0 : $$0 - 1;
   }

   protected int o(int $$0) {
      return Math.min($$0 + 4, this.ce());
   }

   public int ed() {
      return 0;
   }

   protected boolean ee() {
      return false;
   }

   public awt ef() {
      return this.af;
   }

   @Nullable
   public box eg() {
      return this.bX;
   }

   @Override
   public box V_() {
      return this.eg();
   }

   public int eh() {
      return this.bY;
   }

   public void c(@Nullable cia $$0) {
      this.aZ = $$0;
      this.ba = this.ag;
   }

   public void a(@Nullable box $$0) {
      this.bX = $$0;
      this.bY = this.ag;
   }

   @Nullable
   public box ei() {
      return this.bZ;
   }

   public int ej() {
      return this.ca;
   }

   public void z(bof $$0) {
      if ($$0 instanceof box) {
         this.bZ = (box)$$0;
      } else {
         this.bZ = null;
      }

      this.ca = this.ag;
   }

   public int ek() {
      return this.bc;
   }

   public void p(int $$0) {
      this.bc = $$0;
   }

   public boolean el() {
      return this.bV;
   }

   public void p(boolean $$0) {
      this.bV = $$0;
   }

   protected boolean a(bom $$0) {
      return true;
   }

   public void a(bom $$0, cpq $$1, cpq $$2) {
      boolean $$3 = $$2.b() && $$1.b();
      if (!$$3 && !cpq.c($$1, $$2) && !this.al) {
         cos $$4 = cos.c_($$2);
         if (!this.dJ().y_() && !this.P_()) {
            if (!this.aU() && $$4 != null && $$4.i() == $$0) {
               this.dJ().a(null, this.do(), this.dq(), this.du(), $$4.at_(), this.cY(), 1.0F, 1.0F, this.af.g());
            }

            if (this.a($$0)) {
               this.b($$4 != null ? dqr.v : dqr.S);
            }
         }
      }
   }

   @Override
   public void a(bof.c $$0) {
      super.a($$0);
      this.bA.a();
   }

   @Override
   public void b(sy $$0) {
      $$0.a("Health", this.eu());
      $$0.a("HurtTime", (short)this.aL);
      $$0.a("HurtByTimestamp", this.bY);
      $$0.a("DeathTime", (short)this.aN);
      $$0.a("AbsorptionAmount", this.fm());
      $$0.a("Attributes", this.eQ().c());
      if (!this.bR.isEmpty()) {
         te $$1 = new te();

         for (bns $$2 : this.bR.values()) {
            $$1.add($$2.i());
         }

         $$0.a("active_effects", $$1);
      }

      $$0.a("FallFlying", this.fy());
      this.fD().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<tv> $$3 = this.bA.a(tm.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(sy $$0) {
      this.z($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.dJ() != null && !this.dJ().B) {
         this.eQ().a($$0.c("Attributes", 10));
      }

      if ($$0.b("active_effects", 9)) {
         te $$1 = $$0.c("active_effects", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            sy $$3 = $$1.a($$2);
            bns $$4 = bns.a($$3);
            if ($$4 != null) {
               this.bR.put($$4.b(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.t($$0.j("Health"));
      }

      this.aL = $$0.g("HurtTime");
      this.aN = $$0.g("DeathTime");
      this.bY = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         epz $$6 = this.dJ().K();
         epu $$7 = $$6.b($$5);
         boolean $$8 = $$7 != null && $$6.a(this.cu(), $$7);
         if (!$$8) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         ib $$9 = new ib($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.g($$9);
         this.am.b(ar, bpi.c);
         if (!this.al) {
            this.a($$9);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bA = this.a(new Dynamic(tm.a, $$0.c("Brain")));
      }
   }

   protected void em() {
      Iterator<il<bnq>> $$0 = this.bR.keySet().iterator();

      try {
         while ($$0.hasNext()) {
            il<bnq> $$1 = $$0.next();
            bns $$2 = this.bR.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.dJ().B) {
                  $$0.remove();
                  this.a($$2);
               }
            } else if ($$2.c() % 600 == 0) {
               this.a($$2, false, null);
            }
         }
      } catch (ConcurrentModificationException var11) {
      }

      if (this.bW) {
         if (!this.dJ().B) {
            this.J();
            this.u();
         }

         this.bW = false;
      }

      int $$3 = this.am.b(bK);
      boolean $$4 = this.am.b(bL);
      if ($$3 > 0) {
         boolean $$5;
         if (this.cb()) {
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
            this.dJ().a($$4 ? kb.a : kb.v, this.d(0.5), this.dr(), this.g(0.5), $$7, $$8, $$9);
         }
      }
   }

   protected void J() {
      if (this.bR.isEmpty()) {
         this.ep();
         this.j(false);
      } else {
         Collection<bns> $$0 = this.bR.values();
         this.am.b(bL, c($$0));
         this.am.b(bK, cro.a($$0));
         this.j(this.a(bnu.n));
      }
   }

   private void u() {
      boolean $$0 = this.ca();
      if (this.j(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double A(@Nullable bof $$0) {
      double $$1 = 1.0;
      if (this.bS()) {
         $$1 *= 0.8;
      }

      if (this.cb()) {
         float $$2 = this.eX();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cpq $$3 = this.c(bom.f);
         bol<?> $$4 = $$0.ai();
         if ($$4 == bol.aL && $$3.a(cpt.uh)
            || $$4 == bol.bs && $$3.a(cpt.uk)
            || $$4 == bol.ay && $$3.a(cpt.un)
            || $$4 == bol.az && $$3.a(cpt.un)
            || $$4 == bol.w && $$3.a(cpt.ul)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(box $$0) {
      return $$0 instanceof cia && this.dJ().aj() == bmi.a ? false : $$0.en();
   }

   public boolean a(box $$0, bzn $$1) {
      return $$1.a(this, $$0);
   }

   public boolean en() {
      return !this.co() && this.eo();
   }

   public boolean eo() {
      return !this.P_() && this.bx();
   }

   public static boolean c(Collection<bns> $$0) {
      for (bns $$1 : $$0) {
         if ($$1.f() && !$$1.e()) {
            return false;
         }
      }

      return true;
   }

   protected void ep() {
      this.am.b(bL, false);
      this.am.b(bK, 0);
   }

   public boolean eq() {
      if (this.dJ().B) {
         return false;
      } else {
         Iterator<bns> $$0 = this.bR.values().iterator();

         boolean $$1;
         for ($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a($$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<bns> er() {
      return this.bR.values();
   }

   public Map<il<bnq>, bns> es() {
      return this.bR;
   }

   public boolean a(il<bnq> $$0) {
      return this.bR.containsKey($$0);
   }

   @Nullable
   public bns c(il<bnq> $$0) {
      return this.bR.get($$0);
   }

   public final boolean b(bns $$0) {
      return this.b($$0, null);
   }

   public boolean b(bns $$0, @Nullable bof $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         bns $$2 = this.bR.get($$0.b());
         boolean $$3 = false;
         if ($$2 == null) {
            this.bR.put($$0.b(), $$0);
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

   public boolean c(bns $$0) {
      return !this.ai().a(auh.w) ? true : !$$0.a(bnu.j) && !$$0.a(bnu.s);
   }

   public void c(bns $$0, @Nullable bof $$1) {
      if (this.c($$0)) {
         bns $$2 = this.bR.put($$0.b(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean et() {
      return this.ai().a(auh.x);
   }

   @Nullable
   public bns d(il<bnq> $$0) {
      return this.bR.remove($$0);
   }

   public boolean e(il<bnq> $$0) {
      bns $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(bns $$0, @Nullable bof $$1) {
      this.bW = true;
      if (!this.dJ().B) {
         $$0.b().a().a(this.eQ(), $$0.d());
         this.d($$0);
      }
   }

   public void d(bns $$0) {
      for (bof $$1 : this.cM()) {
         if ($$1 instanceof apb $$2) {
            $$2.d.b(new aeo(this.aj(), $$0, false));
         }
      }
   }

   protected void a(bns $$0, boolean $$1, @Nullable bof $$2) {
      this.bW = true;
      if ($$1 && !this.dJ().B) {
         bnq $$3 = $$0.b().a();
         $$3.a(this.eQ());
         $$3.a(this.eQ(), $$0.d());
         this.y();
      }

      if (!this.dJ().B) {
         this.d($$0);
      }
   }

   protected void a(bns $$0) {
      this.bW = true;
      if (!this.dJ().B) {
         $$0.b().a().a(this.eQ());
         this.y();

         for (bof $$1 : this.cM()) {
            if ($$1 instanceof apb $$2) {
               $$2.d.b(new act(this.aj(), $$0.b()));
            }
         }
      }
   }

   private void y() {
      for (bqa $$0 : this.eQ().a()) {
         this.i($$0.a());
      }
   }

   private void i(il<bpz> $$0) {
      if ($$0.a(bqe.n)) {
         float $$1 = this.eL();
         if (this.eu() > $$1) {
            this.t($$1);
         }
      } else if ($$0.a(bqe.m)) {
         float $$2 = this.eM();
         if (this.fm() > $$2) {
            this.y($$2);
         }
      }
   }

   public void c(float $$0) {
      float $$1 = this.eu();
      if ($$1 > 0.0F) {
         this.t($$1 + $$0);
      }
   }

   public float eu() {
      return this.am.b(bJ);
   }

   public void t(float $$0) {
      this.am.b(bJ, awm.a($$0, 0.0F, this.eL()));
   }

   public boolean ev() {
      return this.eu() <= 0.0F;
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dJ().B) {
         return false;
      } else if (this.ev()) {
         return false;
      } else if ($$0.a(aug.j) && this.a(bnu.l)) {
         return false;
      } else {
         if (this.fF() && !this.dJ().B) {
            this.fG();
         }

         this.bc = 0;
         float $$2 = $$1;
         boolean $$3 = false;
         float $$4 = 0.0F;
         if ($$1 > 0.0F && this.f($$0)) {
            this.u($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.a(aug.k) && $$0.c() instanceof box $$6) {
               this.d($$6);
            }

            $$3 = true;
         }

         if ($$0.a(aug.p) && this.ai().a(auh.l)) {
            $$1 *= 5.0F;
         }

         if ($$0.a(aug.a) && !this.c(bom.f).b()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.aR.a(1.5F);
         boolean $$7 = true;
         if ((float)this.ak > 10.0F && !$$0.a(aug.f)) {
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
            this.aM = 10;
            this.aL = this.aM;
         }

         bof $$8 = $$0.d();
         if ($$8 != null) {
            if ($$8 instanceof box $$9 && !$$0.a(aug.r) && (!$$0.a(bnh.G) || !this.ai().a(auh.D))) {
               this.a($$9);
            }

            if ($$8 instanceof cia $$10) {
               this.ba = 100;
               this.aZ = $$10;
            } else if ($$8 instanceof cbp $$11 && $$11.u()) {
               this.ba = 100;
               if ($$11.R_() instanceof cia $$12) {
                  this.aZ = $$12;
               } else {
                  this.aZ = null;
               }
            }
         }

         if ($$7) {
            if ($$3) {
               this.dJ().a(this, (byte)29);
            } else {
               this.dJ().a(this, $$0);
            }

            if (!$$0.a(aug.s) && (!$$3 || $$1 > 0.0F)) {
               this.bq();
            }

            if ($$8 != null && !$$0.a(aug.A)) {
               double $$13 = $$8.do() - this.do();

               double $$14;
               for ($$14 = $$8.du() - this.du(); $$13 * $$13 + $$14 * $$14 < 1.0E-4; $$14 = (Math.random() - Math.random()) * 0.01) {
                  $$13 = (Math.random() - Math.random()) * 0.01;
               }

               this.q(0.4F, $$13, $$14);
               if (!$$3) {
                  this.a($$13, $$14);
               }
            }
         }

         if (this.ev()) {
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
            this.cg = $$0;
            this.ch = this.dJ().X();
         }

         if (this instanceof apb) {
            am.i.a((apb)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((apb)this).a(atz.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$8 instanceof apb) {
            am.h.a((apb)$$8, this, $$0, $$2, $$1, $$3);
         }

         return $$15;
      }
   }

   protected void d(box $$0) {
      $$0.e(this);
   }

   protected void e(box $$0) {
      $$0.q(0.5, $$0.do() - this.do(), $$0.du() - this.du());
   }

   private boolean h(bne $$0) {
      if ($$0.a(aug.e)) {
         return false;
      } else {
         cpq $$1 = null;

         for (bmk $$2 : bmk.values()) {
            cpq $$3 = this.b($$2);
            if ($$3.a(cpt.vp)) {
               $$1 = $$3.q();
               $$3.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof apb $$4) {
               $$4.b(atz.c.b(cpt.vp));
               am.C.a($$4, $$1);
               this.b(dqr.C);
            }

            this.t(1.0F);
            this.eq();
            this.b(new bns(bnu.j, 900, 1));
            this.b(new bns(bnu.v, 100, 1));
            this.b(new bns(bnu.l, 800, 0));
            this.dJ().a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public bne ew() {
      if (this.dJ().X() - this.ch > 40L) {
         this.cg = null;
      }

      return this.cg;
   }

   protected void e(bne $$0) {
      this.b(this.d($$0));
   }

   public void b(@Nullable ato $$0) {
      if ($$0 != null) {
         this.a($$0, this.eY(), this.eZ());
      }
   }

   public boolean f(bne $$0) {
      bof $$1 = $$0.c();
      boolean $$2 = false;
      if ($$1 instanceof cig $$3 && $$3.D() > 0) {
         $$2 = true;
      }

      if (!$$0.a(aug.d) && this.fw() && !$$2) {
         eov $$4 = $$0.h();
         if ($$4 != null) {
            eov $$5 = this.b(0.0F, this.cm());
            eov $$6 = $$4.a(this.dh());
            $$6 = new eov($$6.c, 0.0, $$6.e).d();
            return $$6.b($$5) < 0.0;
         }
      }

      return false;
   }

   private void i(cpq $$0) {
      if (!$$0.b()) {
         if (!this.aU()) {
            this.dJ().a(this.do(), this.dq(), this.du(), atp.nd, this.cY(), 0.8F, 0.8F + this.dJ().z.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }
   }

   public void a(bne $$0) {
      if (!this.dE() && !this.bb) {
         bof $$1 = $$0.d();
         box $$2 = this.eK();
         if (this.bi >= 0 && $$2 != null) {
            $$2.a(this, this.bi, $$0);
         }

         if (this.fF()) {
            this.fG();
         }

         if (!this.dJ().B && this.ae()) {
            b.info("Named entity {} died: {}", this, this.eJ().a().getString());
         }

         this.bb = true;
         this.eJ().c();
         if (this.dJ() instanceof apa $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.b(dqr.p);
               this.g($$0);
               this.f($$2);
            }

            this.dJ().a(this, (byte)3);
         }

         this.b(bpi.h);
      }
   }

   protected void f(@Nullable box $$0) {
      if (!this.dJ().B) {
         boolean $$1 = false;
         if ($$0 instanceof cdz) {
            if (this.dJ().Z().b(cwa.c)) {
               ib $$2 = this.dj();
               dme $$3 = czh.cd.o();
               if (this.dJ().a_($$2).i() && $$3.a((cwh)this.dJ(), $$2)) {
                  this.dJ().a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               cel $$4 = new cel(this.dJ(), this.do(), this.dq(), this.du(), new cpq(cpt.dv));
               this.dJ().b($$4);
            }
         }
      }
   }

   protected void g(bne $$0) {
      bof $$1 = $$0.d();
      int $$2;
      if ($$1 instanceof cia) {
         $$2 = cua.h((box)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.ba > 0;
      if (this.ec() && this.dJ().Z().b(cwa.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.ex();
      this.ey();
   }

   protected void ex() {
   }

   protected void ey() {
      if (this.dJ() instanceof apa && !this.eC() && (this.ee() || this.ba > 0 && this.eb() && this.dJ().Z().b(cwa.f))) {
         bon.a((apa)this.dJ(), this.dh(), this.ed());
      }
   }

   protected void a(bne $$0, int $$1, boolean $$2) {
   }

   public ajc ez() {
      return this.ai().j();
   }

   public long eA() {
      return 0L;
   }

   protected void a(bne $$0, boolean $$1) {
      ajc $$2 = this.ez();
      ekg $$3 = this.dJ().o().aM().getLootTable($$2);
      eke.a $$4 = new eke.a((apa)this.dJ()).a(emj.a, this).a(emj.f, this.dh()).a(emj.c, $$0).b(emj.d, $$0.d()).b(emj.e, $$0.c());
      if ($$1 && this.aZ != null) {
         $$4 = $$4.a(emj.b, this.aZ).a(this.aZ.gr());
      }

      eke $$5 = $$4.a(emi.g);
      $$3.a($$5, this.eA(), this::b);
   }

   public void q(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.g(bqe.k);
      if (!($$0 <= 0.0)) {
         this.at = true;
         eov $$3 = this.dm();
         eov $$4 = new eov($$1, 0.0, $$2).d().a($$0);
         this.o($$3.c / 2.0 - $$4.c, this.aC() ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected ato d(bne $$0) {
      return atp.jS;
   }

   @Nullable
   protected ato n_() {
      return atp.jN;
   }

   private ato d(int $$0) {
      return $$0 > 4 ? this.eF().b() : this.eF().a();
   }

   public void eB() {
      this.ck = true;
   }

   public boolean eC() {
      return this.ck;
   }

   public float eD() {
      return 0.0F;
   }

   protected eoq eE() {
      eoq $$0 = this.cE();
      bof $$1 = this.cW();
      if ($$1 != null) {
         eov $$2 = $$1.l(this);
         return $$0.b(Math.max($$2.d, $$0.b));
      } else {
         return $$0;
      }
   }

   public box.a eF() {
      return new box.a(atp.jT, atp.jL);
   }

   protected ato c(cpq $$0) {
      return $$0.O();
   }

   public ato d(cpq $$0) {
      return $$0.P();
   }

   public Optional<ib> eG() {
      return this.cf;
   }

   public boolean e_() {
      if (this.P_()) {
         return false;
      } else {
         ib $$0 = this.dj();
         dme $$1 = this.dk();
         if ($$1.a(aue.aO)) {
            this.cf = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dhr && this.c($$0, $$1)) {
            this.cf = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(ib $$0, dme $$1) {
      if ($$1.c(dhr.b)) {
         dme $$2 = this.dJ().a_($$0.d());
         if ($$2.a(czh.cO) && $$2.c(ddk.b) == $$1.c(dhr.aE)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean bx() {
      return !this.dE() && this.eu() > 0.0F;
   }

   @Override
   public boolean a(float $$0, float $$1, bne $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.d($$0, $$1);
      if ($$4 > 0) {
         this.a(this.d($$4), 1.0F, 1.0F);
         this.eH();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int d(float $$0, float $$1) {
      if (this.ai().a(auh.o)) {
         return 0;
      } else {
         bns $$2 = this.c(bnu.h);
         float $$3 = $$2 == null ? 0.0F : (float)($$2.d() + 1);
         return awm.f(($$0 - 3.0F - $$3) * $$1);
      }
   }

   protected void eH() {
      if (!this.aU()) {
         int $$0 = awm.a(this.do());
         int $$1 = awm.a(this.dq() - 0.2F);
         int $$2 = awm.a(this.du());
         dme $$3 = this.dJ().a_(new ib($$0, $$1, $$2));
         if (!$$3.i()) {
            dgr $$4 = $$3.w();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void m(float $$0) {
      this.aM = 10;
      this.aL = this.aM;
   }

   public int eI() {
      return awm.a(this.g(bqe.a));
   }

   protected void b(bne $$0, float $$1) {
   }

   protected void c(bne $$0, float $$1) {
   }

   protected void u(float $$0) {
   }

   protected float d(bne $$0, float $$1) {
      if (!$$0.a(aug.c)) {
         this.b($$0, $$1);
         $$1 = bna.a($$1, (float)this.eI(), (float)this.g(bqe.b));
      }

      return $$1;
   }

   protected float e(bne $$0, float $$1) {
      if ($$0.a(aug.g)) {
         return $$1;
      } else {
         if (this.a(bnu.k) && !$$0.a(aug.h)) {
            int $$2 = (this.c(bnu.k).d() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof apb) {
                  ((apb)this).a(atz.M, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof apb) {
                  ((apb)$$0.d()).a(atz.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(aug.i)) {
            return $$1;
         } else {
            int $$7 = cua.a(this.eV(), $$0);
            if ($$7 > 0) {
               $$1 = bna.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(bne $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var9 = Math.max($$1 - this.fm(), 0.0F);
         this.y(this.fm() - ($$1 - var9));
         float $$3 = $$1 - var9;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.d() instanceof apb $$4) {
            $$4.a(atz.H, Math.round($$3 * 10.0F));
         }

         if (var9 != 0.0F) {
            this.eJ().a($$0, var9);
            this.t(this.eu() - var9);
            this.y(this.fm() - var9);
            this.b(dqr.o);
         }
      }
   }

   public bnb eJ() {
      return this.bQ;
   }

   @Nullable
   public box eK() {
      if (this.aZ != null) {
         return this.aZ;
      } else {
         return this.bX != null ? this.bX : null;
      }
   }

   public final float eL() {
      return (float)this.g(bqe.n);
   }

   public final float eM() {
      return (float)this.g(bqe.m);
   }

   public final int eN() {
      return this.am.b(bM);
   }

   public final void q(int $$0) {
      this.am.b(bM, $$0);
   }

   public final int eO() {
      return this.am.b(bN);
   }

   public final void r(int $$0) {
      this.am.b(bN, $$0);
   }

   private int B() {
      if (bnt.a(this)) {
         return 6 - (1 + bnt.b(this));
      } else {
         return this.a(bnu.d) ? 6 + (1 + this.c(bnu.d).d()) * 2 : 6;
      }
   }

   public void a(bmk $$0) {
      this.a($$0, false);
   }

   public void a(bmk $$0, boolean $$1) {
      if (!this.aG || this.aI >= this.B() / 2 || this.aI < 0) {
         this.aI = -1;
         this.aG = true;
         this.aH = $$0;
         if (this.dJ() instanceof apa) {
            aal $$2 = new aal(this, $$0 == bmk.a ? 0 : 3);
            aoy $$3 = ((apa)this.dJ()).l();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(bne $$0) {
      this.aR.a(1.5F);
      this.ak = 20;
      this.aM = 10;
      this.aL = this.aM;
      ato $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$1, this.eY(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
      }

      this.a(this.dK().n(), 0.0F);
      this.cg = $$0;
      this.ch = this.dJ().X();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            ato $$1 = this.n_();
            if ($$1 != null) {
               this.a($$1, this.eY(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cia)) {
               this.t(0.0F);
               this.a(this.dK().n());
            }
            break;
         case 29:
            this.a(atp.vW, 1.0F, 0.8F + this.dJ().z.i() * 0.4F);
            break;
         case 30:
            this.a(atp.vX, 0.8F, 0.8F + this.dJ().z.i() * 0.4F);
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = (double)$$3 / 127.0;
               float $$5 = (this.af.i() - 0.5F) * 0.2F;
               float $$6 = (this.af.i() - 0.5F) * 0.2F;
               float $$7 = (this.af.i() - 0.5F) * 0.2F;
               double $$8 = awm.d($$4, this.J, this.do()) + (this.af.j() - 0.5) * (double)this.dd() * 2.0;
               double $$9 = awm.d($$4, this.K, this.dq()) + this.af.j() * (double)this.de();
               double $$10 = awm.d($$4, this.L, this.du()) + (this.af.j() - 0.5) * (double)this.dd() * 2.0;
               this.dJ().a(kb.Z, $$8, $$9, $$10, (double)$$5, (double)$$6, (double)$$7);
            }
            break;
         case 47:
            this.i(this.c(bom.a));
            break;
         case 48:
            this.i(this.c(bom.b));
            break;
         case 49:
            this.i(this.c(bom.f));
            break;
         case 50:
            this.i(this.c(bom.e));
            break;
         case 51:
            this.i(this.c(bom.d));
            break;
         case 52:
            this.i(this.c(bom.c));
            break;
         case 54:
            dcy.b(this);
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
         this.dJ().a(kb.Y, this.d(1.0), this.dr(), this.g(1.0), $$1, $$2, $$3);
      }
   }

   private void D() {
      cpq $$0 = this.c(bom.b);
      this.a(bom.b, this.c(bom.a));
      this.a(bom.a, $$0);
   }

   @Override
   protected void aB() {
      this.a(this.dK().m(), 4.0F);
   }

   protected void eP() {
      int $$0 = this.B();
      if (this.aG) {
         this.aI++;
         if (this.aI >= $$0) {
            this.aI = 0;
            this.aG = false;
         }
      } else {
         this.aI = 0;
      }

      this.aP = (float)this.aI / (float)$$0;
   }

   @Nullable
   public bqa f(il<bpz> $$0) {
      return this.eQ().a($$0);
   }

   public double g(il<bpz> $$0) {
      return this.eQ().c($$0);
   }

   public double h(il<bpz> $$0) {
      return this.eQ().d($$0);
   }

   public bqb eQ() {
      return this.bP;
   }

   public cpq eR() {
      return this.c(bom.a);
   }

   public cpq eS() {
      return this.c(bom.b);
   }

   public boolean b(cpl $$0) {
      return this.b($$1 -> $$1.a($$0));
   }

   public boolean b(Predicate<cpq> $$0) {
      return $$0.test(this.eR()) || $$0.test(this.eS());
   }

   public cpq b(bmk $$0) {
      if ($$0 == bmk.a) {
         return this.c(bom.a);
      } else if ($$0 == bmk.b) {
         return this.c(bom.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bmk $$0, cpq $$1) {
      if ($$0 == bmk.a) {
         this.a(bom.a, $$1);
      } else {
         if ($$0 != bmk.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bom.b, $$1);
      }
   }

   public boolean b(bom $$0) {
      return !this.c($$0).b();
   }

   public abstract Iterable<cpq> eT();

   public abstract cpq c(bom var1);

   public abstract void a(bom var1, cpq var2);

   public Iterable<cpq> eU() {
      return List.of();
   }

   public Iterable<cpq> eV() {
      return this.eT();
   }

   public Iterable<cpq> eW() {
      return Iterables.concat(this.eU(), this.eV());
   }

   protected void e(cpq $$0) {
      sy $$1 = $$0.w();
      if ($$1 != null) {
         $$0.d().b($$1);
      }
   }

   public float eX() {
      Iterable<cpq> $$0 = this.eT();
      int $$1 = 0;
      int $$2 = 0;

      for (cpq $$3 : $$0) {
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
      bqa $$1 = this.f(bqe.o);
      $$1.b(bC.a());
      if ($$0) {
         $$1.c(bC);
      }
   }

   protected float eY() {
      return 1.0F;
   }

   public float eZ() {
      return this.o_() ? (this.af.i() - this.af.i()) * 0.2F + 1.5F : (this.af.i() - this.af.i()) * 0.2F + 1.0F;
   }

   protected boolean fa() {
      return this.ev();
   }

   @Override
   public void g(bof $$0) {
      if (!this.fF()) {
         super.g($$0);
      }
   }

   private void a(bof $$0) {
      eov $$1;
      if (this.dE()) {
         $$1 = this.dh();
      } else if (!$$0.dE() && !this.dJ().a_($$0.dj()).a(aue.aI)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dq(), $$0.dq());
         $$1 = new eov(this.do(), $$2, this.du());
      }

      this.a($$1.c, $$1.d, $$1.e);
   }

   @Override
   public boolean cz() {
      return this.cy();
   }

   protected float fb() {
      return 0.42F * this.aK() + this.fc();
   }

   public float fc() {
      return this.a(bnu.h) ? 0.1F * ((float)this.c(bnu.h).d() + 1.0F) : 0.0F;
   }

   protected void fd() {
      eov $$0 = this.dm();
      this.o($$0.c, (double)this.fb(), $$0.e);
      if (this.bV()) {
         float $$1 = this.dz() * (float) (Math.PI / 180.0);
         this.g(this.dm().b((double)(-awm.a($$1) * 0.2F), 0.0, (double)(awm.b($$1) * 0.2F)));
      }

      this.at = true;
   }

   protected void fe() {
      this.g(this.dm().b(0.0, -0.04F, 0.0));
   }

   protected void c(aut<ehq> $$0) {
      this.g(this.dm().b(0.0, 0.04F, 0.0));
   }

   protected float ff() {
      return 0.8F;
   }

   public boolean a(ehr $$0) {
      return false;
   }

   public void a(eov $$0) {
      if (this.cU()) {
         double $$1 = 0.08;
         boolean $$2 = this.dm().d <= 0.0;
         if ($$2 && this.a(bnu.B)) {
            $$1 = 0.01;
         }

         ehr $$3 = this.dJ().b_(this.dj());
         if (this.aZ() && this.dZ() && !this.a($$3)) {
            double $$4 = this.dq();
            float $$5 = this.bV() ? 0.9F : this.ff();
            float $$6 = 0.02F;
            float $$7 = (float)cua.f(this);
            if ($$7 > 3.0F) {
               $$7 = 3.0F;
            }

            if (!this.aC()) {
               $$7 *= 0.5F;
            }

            if ($$7 > 0.0F) {
               $$5 += (0.54600006F - $$5) * $$7 / 3.0F;
               $$6 += (this.fh() - $$6) * $$7 / 3.0F;
            }

            if (this.a(bnu.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(bpc.a, this.dm());
            eov $$8 = this.dm();
            if (this.O && this.e_()) {
               $$8 = new eov($$8.c, 0.2, $$8.e);
            }

            this.g($$8.d((double)$$5, 0.8F, (double)$$5));
            eov $$9 = this.a($$1, $$2, this.dm());
            this.g($$9);
            if (this.O && this.g($$9.c, $$9.d + 0.6F - this.dq() + $$4, $$9.e)) {
               this.o($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bn() && this.dZ() && !this.a($$3)) {
            double $$10 = this.dq();
            this.a(0.02F, $$0);
            this.a(bpc.a, this.dm());
            if (this.b(auj.b) <= this.dc()) {
               this.g(this.dm().d(0.5, 0.8F, 0.5));
               eov $$11 = this.a($$1, $$2, this.dm());
               this.g($$11);
            } else {
               this.g(this.dm().a(0.5));
            }

            if (!this.aV()) {
               this.g(this.dm().b(0.0, -$$1 / 4.0, 0.0));
            }

            eov $$12 = this.dm();
            if (this.O && this.g($$12.c, $$12.d + 0.6F - this.dq() + $$10, $$12.e)) {
               this.o($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fy()) {
            this.ck();
            eov $$13 = this.dm();
            eov $$14 = this.bF();
            float $$15 = this.dB() * (float) (Math.PI / 180.0);
            double $$16 = Math.sqrt($$14.c * $$14.c + $$14.e * $$14.e);
            double $$17 = $$13.h();
            double $$18 = $$14.f();
            double $$19 = Math.cos((double)$$15);
            $$19 = $$19 * $$19 * Math.min(1.0, $$18 / 0.4);
            $$13 = this.dm().b(0.0, $$1 * (-1.0 + $$19 * 0.75), 0.0);
            if ($$13.d < 0.0 && $$16 > 0.0) {
               double $$20 = $$13.d * -0.1 * $$19;
               $$13 = $$13.b($$14.c * $$20 / $$16, $$20, $$14.e * $$20 / $$16);
            }

            if ($$15 < 0.0F && $$16 > 0.0) {
               double $$21 = $$17 * (double)(-awm.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.g($$13.d(0.99F, 0.98F, 0.99F));
            this.a(bpc.a, this.dm());
            if (this.O && !this.dJ().B) {
               double $$22 = this.dm().h();
               double $$23 = $$17 - $$22;
               float $$24 = (float)($$23 * 10.0 - 3.0);
               if ($$24 > 0.0F) {
                  this.a(this.d((int)$$24), 1.0F, 1.0F);
                  this.a(this.dK().l(), $$24);
               }
            }

            if (this.aC() && !this.dJ().B) {
               this.b(7, false);
            }
         } else {
            ib $$25 = this.aI();
            float $$26 = this.dJ().a_($$25).b().h();
            float $$27 = this.aC() ? $$26 * 0.91F : 0.91F;
            eov $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.a(bnu.y)) {
               $$29 += (0.05 * (double)(this.c(bnu.y).d() + 1) - $$28.d) * 0.2;
            } else if (this.dJ().B && !this.dJ().B($$25)) {
               if (this.dq() > (double)this.dJ().J_()) {
                  $$29 = -0.1;
               } else {
                  $$29 = 0.0;
               }
            } else if (!this.aV()) {
               $$29 -= $$1;
            }

            if (this.el()) {
               this.o($$28.c, $$29, $$28.e);
            } else {
               this.o($$28.c * (double)$$27, $$29 * 0.98F, $$28.e * (double)$$27);
            }
         }
      }

      this.q(this instanceof cav);
   }

   private void c(cia $$0, eov $$1) {
      eov $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.cU()) {
         this.w(this.e($$0));
         this.a($$2);
      } else {
         this.q(false);
         this.g(eov.b);
         this.aD();
      }
   }

   protected void a(cia $$0, eov $$1) {
   }

   protected eov b(cia $$0, eov $$1) {
      return $$1;
   }

   protected float e(cia $$0) {
      return this.fh();
   }

   public void q(boolean $$0) {
      float $$1 = (float)awm.g(this.do() - this.J, $$0 ? this.dq() - this.K : 0.0, this.du() - this.L);
      this.v($$1);
   }

   protected void v(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.aR.a($$1, 0.4F);
   }

   public eov a(eov $$0, float $$1) {
      this.a(this.A($$1), $$0);
      this.g(this.j(this.dm()));
      this.a(bpc.a, this.dm());
      eov $$2 = this.dm();
      if ((this.O || this.bk) && (this.e_() || this.dk().a(czh.qP) && dey.a(this))) {
         $$2 = new eov($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public eov a(double $$0, boolean $$1, eov $$2) {
      if (!this.aV() && !this.bV()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new eov($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private eov j(eov $$0) {
      if (this.e_()) {
         this.n();
         float $$1 = 0.15F;
         double $$2 = awm.a($$0.c, -0.15F, 0.15F);
         double $$3 = awm.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.dk().a(czh.nS) && this.fx() && this instanceof cia) {
            $$4 = 0.0;
         }

         $$0 = new eov($$2, $$4, $$3);
      }

      return $$0;
   }

   private float A(float $$0) {
      return this.aC() ? this.fh() * (0.21600002F / ($$0 * $$0 * $$0)) : this.fg();
   }

   protected float fg() {
      return this.cK() instanceof cia ? this.fh() * 0.1F : 0.02F;
   }

   public float fh() {
      return this.cb;
   }

   public void w(float $$0) {
      this.cb = $$0;
   }

   public boolean B(bof $$0) {
      this.z($$0);
      return false;
   }

   @Override
   public void l() {
      super.l();
      this.I();
      this.M();
      if (!this.dJ().B) {
         int $$0 = this.eN();
         if ($$0 > 0) {
            if (this.aJ <= 0) {
               this.aJ = 20 * (30 - $$0);
            }

            this.aJ--;
            if (this.aJ <= 0) {
               this.q($$0 - 1);
            }
         }

         int $$1 = this.eO();
         if ($$1 > 0) {
            if (this.aK <= 0) {
               this.aK = 20 * (30 - $$1);
            }

            this.aK--;
            if (this.aK <= 0) {
               this.r($$1 - 1);
            }
         }

         this.E();
         if (this.ag % 20 == 0) {
            this.eJ().c();
         }

         if (this.fF() && !this.N()) {
            this.fG();
         }
      }

      if (!this.dE()) {
         this.d_();
      }

      double $$2 = this.do() - this.J;
      double $$3 = this.du() - this.L;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aV;
      float $$6 = 0.0F;
      this.bd = this.be;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)awm.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$9 = awm.e(awm.g(this.dz()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aP > 0.0F) {
         $$5 = this.dz();
      }

      if (!this.aC()) {
         $$7 = 0.0F;
      }

      this.be = this.be + ($$7 - this.be) * 0.3F;
      this.dJ().ae().a("headTurn");
      $$6 = this.e($$5, $$6);
      this.dJ().ae().c();
      this.dJ().ae().a("rangeChecks");

      while (this.dz() - this.M < -180.0F) {
         this.M -= 360.0F;
      }

      while (this.dz() - this.M >= 180.0F) {
         this.M += 360.0F;
      }

      while (this.aV - this.aW < -180.0F) {
         this.aW -= 360.0F;
      }

      while (this.aV - this.aW >= 180.0F) {
         this.aW += 360.0F;
      }

      while (this.dB() - this.N < -180.0F) {
         this.N -= 360.0F;
      }

      while (this.dB() - this.N >= 180.0F) {
         this.N += 360.0F;
      }

      while (this.aX - this.aY < -180.0F) {
         this.aY -= 360.0F;
      }

      while (this.aX - this.aY >= 180.0F) {
         this.aY += 360.0F;
      }

      this.dJ().ae().c();
      this.bf += $$6;
      if (this.fy()) {
         this.by++;
      } else {
         this.by = 0;
      }

      if (this.fF()) {
         this.s(0.0F);
      }

      this.y();
      float $$10 = this.dY();
      if ($$10 != this.bB) {
         this.bB = $$10;
         this.k_();
      }
   }

   private void E() {
      Map<bom, cpq> $$0 = this.G();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bom, cpq> G() {
      Map<bom, cpq> $$0 = null;

      for (bom $$1 : bom.values()) {
         cpq $$2 = switch ($$1.a()) {
            case a -> this.f($$1);
            case b -> this.e($$1);
            case c -> this.bU;
         };
         cpq $$3 = this.c($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bom.class);
            }

            $$0.put($$1, $$3);
            if (!$$2.b()) {
               this.eQ().a($$2.a($$1));
            }

            if (!$$3.b()) {
               this.eQ().b($$3.a($$1));
            }
         }
      }

      return $$0;
   }

   public boolean a(cpq $$0, cpq $$1) {
      return !cpq.a($$1, $$0);
   }

   private void a(Map<bom, cpq> $$0) {
      cpq $$1 = $$0.get(bom.a);
      cpq $$2 = $$0.get(bom.b);
      if ($$1 != null && $$2 != null && cpq.a($$1, this.f(bom.b)) && cpq.a($$2, this.f(bom.a))) {
         ((apa)this.dJ()).l().b(this, new abm(this, (byte)55));
         $$0.remove(bom.a);
         $$0.remove(bom.b);
         this.c(bom.a, $$1.q());
         this.c(bom.b, $$2.q());
      }
   }

   private void b(Map<bom, cpq> $$0) {
      List<Pair<bom, cpq>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cpq $$3 = $$2.q();
         $$1.add(Pair.of($$1x, $$3));
         switch ($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
               break;
            case c:
               this.bU = $$3;
         }
      });
      ((apa)this.dJ()).l().b(this, new adp(this.aj(), $$1));
   }

   private cpq e(bom $$0) {
      return this.bT.get($$0.b());
   }

   private void b(bom $$0, cpq $$1) {
      this.bT.set($$0.b(), $$1);
   }

   private cpq f(bom $$0) {
      return this.bS.get($$0.b());
   }

   private void c(bom $$0, cpq $$1) {
      this.bS.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = awm.g($$0 - this.aV);
      this.aV += $$2 * 0.3F;
      float $$3 = awm.g(this.dz() - this.aV);
      float $$4 = this.fi();
      if (Math.abs($$3) > $$4) {
         this.aV = this.aV + ($$3 - (float)awm.j((double)$$3) * $$4);
      }

      boolean $$5 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$5) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   protected float fi() {
      return 50.0F;
   }

   public void d_() {
      if (this.cc > 0) {
         this.cc--;
      }

      if (this.cU()) {
         this.bo = 0;
         this.f(this.do(), this.dq(), this.du());
      }

      if (this.bo > 0) {
         this.a(this.bo, this.bp, this.bq, this.br, this.bs, this.bt);
         this.bo--;
      } else if (!this.cV()) {
         this.g(this.dm().a(0.98));
      }

      if (this.bv > 0) {
         this.a(this.bv, this.bu);
         this.bv--;
      }

      eov $$0 = this.dm();
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
      this.dJ().ae().a("ai");
      if (this.fa()) {
         this.bk = false;
         this.bl = 0.0F;
         this.bn = 0.0F;
      } else if (this.cV()) {
         this.dJ().ae().a("newAi");
         this.fk();
         this.dJ().ae().c();
      }

      this.dJ().ae().c();
      this.dJ().ae().a("jump");
      if (this.bk && this.dZ()) {
         double $$4;
         if (this.bn()) {
            $$4 = this.b(auj.b);
         } else {
            $$4 = this.b(auj.a);
         }

         boolean $$6 = this.aZ() && $$4 > 0.0;
         double $$7 = this.dc();
         if (!$$6 || this.aC() && !($$4 > $$7)) {
            if (!this.bn() || this.aC() && !($$4 > $$7)) {
               if ((this.aC() || $$6 && $$4 <= $$7) && this.cc == 0) {
                  this.fd();
                  this.cc = 10;
               }
            } else {
               this.c(auj.b);
            }
         } else {
            this.c(auj.a);
         }
      } else {
         this.cc = 0;
      }

      this.dJ().ae().c();
      this.dJ().ae().a("travel");
      this.bl *= 0.98F;
      this.bn *= 0.98F;
      this.H();
      eoq $$8 = this.cE();
      eov $$9 = new eov((double)this.bl, (double)this.bm, (double)this.bn);
      if (this.a(bnu.B) || this.a(bnu.y)) {
         this.n();
      }

      label104: {
         if (this.cK() instanceof cia $$10 && this.bx()) {
            this.c($$10, $$9);
            break label104;
         }

         this.a($$9);
      }

      this.dJ().ae().c();
      this.dJ().ae().a("freezing");
      if (!this.dJ().B && !this.ev()) {
         int $$11 = this.cg();
         if (this.az && this.dx()) {
            this.l(Math.min(this.cj(), $$11 + 1));
         } else {
            this.l(Math.max(0, $$11 - 2));
         }
      }

      this.dV();
      this.dW();
      if (!this.dJ().B && this.ag % 40 == 0 && this.ci() && this.dx()) {
         this.a(this.dK().t(), 1.0F);
      }

      this.dJ().ae().c();
      this.dJ().ae().a("push");
      if (this.bz > 0) {
         this.bz--;
         this.a($$8, this.cE());
      }

      this.M_();
      this.dJ().ae().c();
      if (!this.dJ().B && this.fj() && this.bb()) {
         this.a(this.dK().h(), 1.0F);
      }
   }

   public boolean fj() {
      return false;
   }

   private void H() {
      boolean $$0 = this.j(7);
      if ($$0 && !this.aC() && !this.bL() && !this.a(bnu.y)) {
         cpq $$1 = this.c(bom.e);
         if ($$1.a(cpt.nS) && cok.d($$1)) {
            $$0 = true;
            int $$2 = this.by + 1;
            if (!this.dJ().B && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, bom.e);
               }

               this.b(dqr.n);
            }
         } else {
            $$0 = false;
         }
      } else {
         $$0 = false;
      }

      if (!this.dJ().B) {
         this.b(7, $$0);
      }
   }

   protected void fk() {
   }

   protected void M_() {
      if (this.dJ().y_()) {
         this.dJ().a(dqf.a(cia.class), this.cE(), bok.a(this)).forEach(this::C);
      } else {
         List<bof> $$0 = this.dJ().a(this, this.cE(), bok.a(this));
         if (!$$0.isEmpty()) {
            int $$1 = this.dJ().Z().c(cwa.u);
            if ($$1 > 0 && $$0.size() > $$1 - 1 && this.af.a(4) == 0) {
               int $$2 = 0;

               for (bof $$3 : $$0) {
                  if (!$$3.bL()) {
                     $$2++;
                  }
               }

               if ($$2 > $$1 - 1) {
                  this.a(this.dK().g(), 6.0F);
               }
            }

            for (bof $$4 : $$0) {
               this.C($$4);
            }
         }
      }
   }

   protected void a(eoq $$0, eoq $$1) {
      eoq $$2 = $$0.b($$1);
      List<bof> $$3 = this.dJ().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bof $$4 : $$3) {
            if ($$4 instanceof box) {
               this.g((box)$$4);
               this.bz = 0;
               this.g(this.dm().a(-0.2));
               break;
            }
         }
      } else if (this.O) {
         this.bz = 0;
      }

      if (!this.dJ().B && this.bz <= 0) {
         this.c(4, false);
      }
   }

   protected void C(bof $$0) {
      $$0.g(this);
   }

   protected void g(box $$0) {
   }

   public boolean fl() {
      return (this.am.b(v) & 4) != 0;
   }

   @Override
   public void ac() {
      bof $$0 = this.cW();
      super.ac();
      if ($$0 != null && $$0 != this.cW() && !this.dJ().B) {
         this.a($$0);
      }
   }

   @Override
   public void t() {
      super.t();
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
   public double p_() {
      return this.bo > 0 ? this.bp : this.do();
   }

   @Override
   public double N_() {
      return this.bo > 0 ? this.bq : this.dq();
   }

   @Override
   public double O_() {
      return this.bo > 0 ? this.br : this.du();
   }

   @Override
   public float f_() {
      return this.bo > 0 ? (float)this.bt : this.dB();
   }

   @Override
   public float q_() {
      return this.bo > 0 ? (float)this.bs : this.dz();
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bu = (double)$$0;
      this.bv = $$1;
   }

   public void r(boolean $$0) {
      this.bk = $$0;
   }

   public void a(cel $$0) {
      bof $$1 = $$0.w();
      if ($$1 instanceof apb) {
         am.R.a((apb)$$1, $$0.q(), this);
      }
   }

   public void a(bof $$0, int $$1) {
      if (!$$0.dE() && !this.dJ().B && ($$0 instanceof cel || $$0 instanceof cig || $$0 instanceof bon)) {
         ((apa)this.dJ()).l().b($$0, new aei($$0.aj(), this.aj(), $$1));
      }
   }

   public boolean D(bof $$0) {
      if ($$0.dJ() != this.dJ()) {
         return false;
      } else {
         eov $$1 = new eov(this.do(), this.ds(), this.du());
         eov $$2 = new eov($$0.do(), $$0.ds(), $$0.du());
         return $$2.f($$1) > 128.0 ? false : this.dJ().a(new cvn($$1, $$2, cvn.a.a, cvn.b.a, this)).c() == eot.a.a;
      }
   }

   @Override
   public float h(float $$0) {
      return $$0 == 1.0F ? this.aX : awm.i($$0, this.aY, this.aX);
   }

   public float x(float $$0) {
      float $$1 = this.aP - this.aO;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.aO + $$1 * $$0;
   }

   @Override
   public boolean bt() {
      return !this.dE();
   }

   @Override
   public boolean bu() {
      return this.bx() && !this.P_() && !this.e_();
   }

   @Override
   public float cm() {
      return this.aX;
   }

   @Override
   public void n(float $$0) {
      this.aX = $$0;
   }

   @Override
   public void o(float $$0) {
      this.aV = $$0;
   }

   @Override
   protected eov a(ih.a $$0, l.a $$1) {
      return i(super.a($$0, $$1));
   }

   public static eov i(eov $$0) {
      return new eov($$0.c, $$0.d, 0.0);
   }

   public float fm() {
      return this.cd;
   }

   public final void y(float $$0) {
      this.z(awm.a($$0, 0.0F, this.eM()));
   }

   protected void z(float $$0) {
      this.cd = $$0;
   }

   public void g_() {
   }

   public void h_() {
   }

   protected void fn() {
      this.bW = true;
   }

   public abstract bor fo();

   public boolean fp() {
      return (this.am.b(v) & 1) > 0;
   }

   public bmk fq() {
      return (this.am.b(v) & 2) > 0 ? bmk.b : bmk.a;
   }

   private void I() {
      if (this.fp()) {
         if (cpq.b(this.b(this.fq()), this.bw)) {
            this.bw = this.b(this.fq());
            this.a(this.bw);
         } else {
            this.fv();
         }
      }
   }

   protected void a(cpq $$0) {
      $$0.b(this.dJ(), this, this.fs());
      if (this.K()) {
         this.b($$0, 5);
      }

      if (--this.bx == 0 && !this.dJ().B && !$$0.u()) {
         this.x();
      }
   }

   private boolean K() {
      int $$0 = this.fs();
      ckr $$1 = this.bw.d().w();
      boolean $$2 = $$1 != null && $$1.e();
      $$2 |= $$0 <= this.bw.s() - 7;
      return $$2 && $$0 % 4 == 0;
   }

   private void M() {
      this.cj = this.ci;
      if (this.bX()) {
         this.ci = Math.min(1.0F, this.ci + 0.09F);
      } else {
         this.ci = Math.max(0.0F, this.ci - 0.09F);
      }
   }

   protected void c(int $$0, boolean $$1) {
      int $$2 = this.am.b(v);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.am.b(v, (byte)$$2);
   }

   public void c(bmk $$0) {
      cpq $$1 = this.b($$0);
      if (!$$1.b() && !this.fp()) {
         this.bw = $$1;
         this.bx = $$1.s();
         if (!this.dJ().B) {
            this.c(1, true);
            this.c(2, $$0 == bmk.b);
            this.b(dqr.D);
         }
      }
   }

   @Override
   public void a(aii<?> $$0) {
      super.a($$0);
      if (bO.equals($$0)) {
         if (this.dJ().B) {
            this.fD().ifPresent(this::a);
         }
      } else if (v.equals($$0) && this.dJ().B) {
         if (this.fp() && this.bw.b()) {
            this.bw = this.b(this.fq());
            if (!this.bw.b()) {
               this.bx = this.bw.s();
            }
         } else if (!this.fp() && !this.bw.b()) {
            this.bw = cpq.h;
            this.bx = 0;
         }
      }
   }

   @Override
   public void a(eg.a $$0, eov $$1) {
      super.a($$0, $$1);
      this.aY = this.aX;
      this.aV = this.aX;
      this.aW = this.aV;
   }

   protected void b(cpq $$0, int $$1) {
      if (!$$0.b() && this.fp()) {
         if ($$0.t() == crj.c) {
            this.a(this.c($$0), 0.5F, this.dJ().z.i() * 0.1F + 0.9F);
         }

         if ($$0.t() == crj.b) {
            this.a($$0, $$1);
            this.a(this.d($$0), 0.5F + 0.5F * (float)this.af.a(2), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         }
      }
   }

   private void a(cpq $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         eov $$3 = new eov(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dB() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dz() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.af.i()) * 0.6 - 0.3;
         eov $$5 = new eov(((double)this.af.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dB() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dz() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.do(), this.ds(), this.du());
         this.dJ().a(new jx(kb.Q, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }
   }

   protected void x() {
      if (!this.dJ().B || this.fp()) {
         bmk $$0 = this.fq();
         if (!this.bw.equals(this.b($$0))) {
            this.fu();
         } else {
            if (!this.bw.b() && this.fp()) {
               this.b(this.bw, 16);
               cpq $$1 = this.bw.a(this.dJ(), this);
               if ($$1 != this.bw) {
                  this.a($$0, $$1);
               }

               this.fv();
            }
         }
      }
   }

   public cpq fr() {
      return this.bw;
   }

   public int fs() {
      return this.bx;
   }

   public int ft() {
      return this.fp() ? this.bw.s() - this.fs() : 0;
   }

   public void fu() {
      if (!this.bw.b()) {
         this.bw.a(this.dJ(), this, this.fs());
         if (this.bw.u()) {
            this.I();
         }
      }

      this.fv();
   }

   public void fv() {
      if (!this.dJ().B) {
         boolean $$0 = this.fp();
         this.c(1, false);
         if ($$0) {
            this.b(dqr.C);
         }
      }

      this.bw = cpq.h;
      this.bx = 0;
   }

   public boolean fw() {
      if (this.fp() && !this.bw.b()) {
         cpl $$0 = this.bw.d();
         return $$0.c(this.bw) != crj.d ? false : $$0.b(this.bw) - this.bx >= 5;
      } else {
         return false;
      }
   }

   public boolean fx() {
      return this.bP();
   }

   public boolean fy() {
      return this.j(7);
   }

   @Override
   public boolean bX() {
      return super.bX() || !this.fy() && this.c(bpi.b);
   }

   public int fz() {
      return this.by;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.do();
      double $$5 = this.dq();
      double $$6 = this.du();
      double $$7 = $$1;
      boolean $$8 = false;
      ib $$9 = ib.a($$0, $$1, $$2);
      cwe $$10 = this.dJ();
      if ($$10.B($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.J_()) {
            ib $$12 = $$9.d();
            dme $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.c($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cE())) {
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

         if (this instanceof bpf $$14) {
            $$14.N().n();
         }

         return true;
      }
   }

   public boolean fA() {
      return !this.ev();
   }

   public boolean fB() {
      return true;
   }

   public void a(ib $$0, boolean $$1) {
   }

   public boolean f(cpq $$0) {
      return false;
   }

   @Override
   public final boi a(bpi $$0) {
      return $$0 == bpi.c ? aD : this.e($$0).a(this.dY());
   }

   protected boi e(bpi $$0) {
      return this.ai().n().a(this.dX());
   }

   public ImmutableList<bpi> fC() {
      return ImmutableList.of(bpi.a);
   }

   public eoq f(bpi $$0) {
      boi $$1 = this.a($$0);
      return new eoq((double)(-$$1.a() / 2.0F), 0.0, (double)(-$$1.a() / 2.0F), (double)($$1.a() / 2.0F), (double)$$1.b(), (double)($$1.a() / 2.0F));
   }

   protected boolean g(bpi $$0) {
      eoq $$1 = this.a($$0).a(this.dh());
      return this.dJ().b(this, $$1);
   }

   @Override
   public boolean cq() {
      return super.cq() && !this.fF();
   }

   public Optional<ib> fD() {
      return this.am.b(bO);
   }

   public void g(ib $$0) {
      this.am.b(bO, Optional.of($$0));
   }

   public void fE() {
      this.am.b(bO, Optional.empty());
   }

   public boolean fF() {
      return this.fD().isPresent();
   }

   public void b(ib $$0) {
      if (this.bL()) {
         this.ac();
      }

      dme $$1 = this.dJ().a_($$0);
      if ($$1.b() instanceof cyy) {
         this.dJ().a($$0, $$1.a(cyy.c, Boolean.valueOf(true)), 3);
      }

      this.b(bpi.c);
      this.a($$0);
      this.g($$0);
      this.g(eov.b);
      this.at = true;
   }

   private void a(ib $$0) {
      this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean N() {
      return this.fD().map($$0 -> this.dJ().a_($$0).b() instanceof cyy).orElse(false);
   }

   public void fG() {
      this.fD().filter(this.dJ()::B).ifPresent($$0x -> {
         dme $$1 = this.dJ().a_($$0x);
         if ($$1.b() instanceof cyy) {
            ih $$2 = $$1.c(cyy.aE);
            this.dJ().a($$0x, $$1.a(cyy.c, Boolean.valueOf(false)), 3);
            eov $$3 = cyy.a(this.ai(), this.dJ(), $$0x, $$2, this.dz()).orElseGet(() -> {
               ib $$1x = $$0x.c();
               return new eov((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            eov $$4 = eov.c($$0x).d($$3).d();
            float $$5 = (float)awm.d(awm.d($$4.e, $$4.c) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.c, $$3.d, $$3.e);
            this.r($$5);
            this.s(0.0F);
         }
      });
      eov $$0 = this.dh();
      this.b(bpi.a);
      this.a_($$0.c, $$0.d, $$0.e);
      this.fE();
   }

   @Nullable
   public ih fH() {
      ib $$0 = this.fD().orElse(null);
      return $$0 != null ? cyy.a(this.dJ(), $$0) : null;
   }

   @Override
   public boolean by() {
      return !this.fF() && super.by();
   }

   public cpq g(cpq $$0) {
      return cpq.h;
   }

   public cpq a(cwe $$0, cpq $$1) {
      if ($$1.N()) {
         $$0.a(null, this.do(), this.dq(), this.du(), this.d($$1), atq.g, 1.0F, 1.0F + ($$0.z.i() - $$0.z.i()) * 0.4F);
         this.a($$1, $$0, this);
         if (!(this instanceof cia) || !((cia)this).fW().d) {
            $$1.h(1);
         }

         this.b(dqr.m);
      }

      return $$1;
   }

   private void a(cpq $$0, cwe $$1, box $$2) {
      cpl $$3 = $$0.d();
      if ($$3.v()) {
         for (Pair<bns, Float> $$5 : $$3.w().f()) {
            if (!$$1.B && $$5.getFirst() != null && $$1.z.i() < (Float)$$5.getSecond()) {
               $$2.b(new bns((bns)$$5.getFirst()));
            }
         }
      }
   }

   private static byte g(bom $$0) {
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

   public void d(bom $$0) {
      this.dJ().a(this, g($$0));
   }

   public static bom d(bmk $$0) {
      return $$0 == bmk.a ? bom.a : bom.b;
   }

   @Override
   public eoq i_() {
      if (this.c(bom.f).a(cpt.um)) {
         float $$0 = 0.5F;
         return this.cE().c(0.5, 0.5, 0.5);
      } else {
         return super.i_();
      }
   }

   public static bom h(cpq $$0) {
      cos $$1 = cos.c_($$0);
      return $$1 != null ? $$1.i() : bom.a;
   }

   private static bpo a(box $$0, bom $$1) {
      return $$1 != bom.f && $$1 != bom.a && $$1 != bom.b ? bpo.a($$0, $$1, $$1x -> $$1x.b() || boz.h($$1x) == $$1) : bpo.a($$0, $$1);
   }

   @Nullable
   private static bom s(int $$0) {
      if ($$0 == 100 + bom.f.b()) {
         return bom.f;
      } else if ($$0 == 100 + bom.e.b()) {
         return bom.e;
      } else if ($$0 == 100 + bom.d.b()) {
         return bom.d;
      } else if ($$0 == 100 + bom.c.b()) {
         return bom.c;
      } else if ($$0 == 98) {
         return bom.a;
      } else if ($$0 == 99) {
         return bom.b;
      } else {
         return $$0 == 105 ? bom.g : null;
      }
   }

   @Override
   public bpo a_(int $$0) {
      bom $$1 = s($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dx() {
      if (this.P_()) {
         return false;
      } else {
         boolean $$0 = !this.c(bom.f).a(aum.az) && !this.c(bom.e).a(aum.az) && !this.c(bom.d).a(aum.az) && !this.c(bom.c).a(aum.az);
         return $$0 && super.dx();
      }
   }

   @Override
   public boolean ca() {
      return !this.dJ().y_() && this.a(bnu.x) || super.ca();
   }

   @Override
   public float dA() {
      return this.aV;
   }

   @Override
   public void a(aaj $$0) {
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      float $$4 = $$0.n();
      float $$5 = $$0.m();
      this.f($$1, $$2, $$3);
      this.aV = $$0.o();
      this.aX = $$0.o();
      this.aW = this.aV;
      this.aY = this.aX;
      this.e($$0.b());
      this.a_($$0.e());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.o($$0.j(), $$0.k(), $$0.l());
   }

   public boolean fI() {
      return this.eR().d() instanceof cnh;
   }

   @Override
   public float dD() {
      float $$0 = (float)this.g(bqe.r);
      return this.cK() instanceof cia ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public eov l(bof $$0) {
      return this.dh().e(this.a($$0, this.a(this.ap()), this.dY() * this.dX()));
   }

   protected void a(int $$0, double $$1) {
      this.aX = (float)awm.e(1.0 / (double)$$0, (double)this.aX, $$1);
   }

   @Override
   public void h(int $$0) {
      super.h(cul.a(this, $$0));
   }

   public static record a(ato a, ato b) {
   }
}
