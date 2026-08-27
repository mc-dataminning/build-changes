import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cly extends bsq {
   private static final Logger b = LogUtils.getLogger();
   public static final bsk bF = bsk.b;
   public static final int bG = 0;
   public static final int bH = 20;
   public static final int bI = 100;
   public static final int bJ = 10;
   public static final int bK = 200;
   public static final int bL = 499;
   public static final int bM = 500;
   public static final float bN = 4.5F;
   public static final float bO = 3.0F;
   public static final float bP = 1.5F;
   public static final float bQ = 0.6F;
   public static final float bR = 0.6F;
   public static final float bS = 1.62F;
   public static final eum bT = new eum(0.0, 0.6, 0.0);
   public static final brz bU = brz.b(0.6F, 1.8F).b(1.62F).a(bry.a().a(brx.b, bT));
   private static final Map<btc, brz> c = ImmutableMap.builder()
      .put(btc.a, bU)
      .put(btc.c, aG)
      .put(btc.b, brz.b(0.6F, 0.6F).b(0.4F))
      .put(btc.d, brz.b(0.6F, 0.6F).b(0.4F))
      .put(btc.e, brz.b(0.6F, 0.6F).b(0.4F))
      .put(btc.f, brz.b(0.6F, 1.5F).b(1.27F).a(bry.a().a(brx.b, bT)))
      .put(btc.h, brz.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final ajs<Float> d = ajw.a(cly.class, aju.d);
   private static final ajs<Integer> e = ajw.a(cly.class, aju.b);
   protected static final ajs<Byte> bV = ajw.a(cly.class, aju.a);
   protected static final ajs<Byte> bW = ajw.a(cly.class, aju.a);
   protected static final ajs<ud> bX = ajw.a(cly.class, aju.t);
   protected static final ajs<ud> bY = ajw.a(cly.class, aju.t);
   private long f;
   final clx g = new clx(this);
   protected cqh bZ = new cqh();
   public final cpw ca;
   public cov cb;
   protected cor cc = new cor();
   protected int cd;
   public float ce;
   public float cf;
   public int cg;
   public double ch;
   public double ci;
   public double cj;
   public double ck;
   public double cl;
   public double cm;
   private int cz;
   protected boolean cn;
   private final clv cA = new clv();
   public int co;
   public int cp;
   public float cq;
   protected int cr;
   protected final float cs = 0.02F;
   private int cB;
   private final GameProfile cC;
   private boolean cD;
   private ctq cE = ctq.i;
   private final ctm cF = this.k();
   private Optional<iw> cG = Optional.empty();
   @Nullable
   public cmm ct;
   protected float cu;
   @Nullable
   public eum cv;
   @Nullable
   public brw cw;
   public boolean cx;

   public cly(daz $$0, io $$1, float $$2, GameProfile $$3) {
      super(bsc.by, $$0);
      this.a_($$3.getId());
      this.cC = $$3;
      this.ca = new cpw(this.g, !$$0.B, this);
      this.cb = this.ca;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bk = 180.0F;
   }

   public boolean a(daz $$0, io $$1, daw $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == daw.d) {
         return true;
      } else if (this.go()) {
         return false;
      } else {
         ctq $$3 = this.eX();
         return $$3.e() || !$$3.b(new drh($$0, $$1, false));
      }
   }

   public static btx.a fQ() {
      return bsq.dU().a(bty.c, 1.0).a(bty.r, 0.1F).a(bty.e).a(bty.o).a(bty.g, 4.5).a(bty.h, 3.0).a(bty.f);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(bV, (byte)0);
      $$0.a(bW, (byte)bF.a());
      $$0.a(bX, new ud());
      $$0.a(bY, new ud());
   }

   @Override
   public void l() {
      this.ag = this.N_();
      if (this.N_()) {
         this.d(false);
      }

      if (this.cg > 0) {
         this.cg--;
      }

      if (this.fL()) {
         this.cz++;
         if (this.cz > 100) {
            this.cz = 100;
         }

         if (!this.dP().B && this.dP().Q()) {
            this.a(false, true);
         }
      } else if (this.cz > 0) {
         this.cz++;
         if (this.cz >= 110) {
            this.cz = 0;
         }
      }

      this.fU();
      super.l();
      if (!this.dP().B && this.cb != null && !this.cb.a(this)) {
         this.r();
         this.cb = this.ca;
      }

      this.v();
      if (!this.dP().B) {
         this.cc.a(this);
         this.a(avs.k);
         this.a(avs.l);
         if (this.bD()) {
            this.a(avs.m);
         }

         if (this.bY()) {
            this.a(avs.o);
         }

         if (!this.fL()) {
            this.a(avs.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = ayf.a(this.du(), -2.9999999E7, 2.9999999E7);
      double $$2 = ayf.a(this.dA(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.du() || $$2 != this.dA()) {
         this.a_($$1, this.dw(), $$2);
      }

      this.aT++;
      ctq $$3 = this.eX();
      if (!ctq.a(this.cE, $$3)) {
         if (!ctq.b(this.cE, $$3)) {
            this.gw();
         }

         this.cE = $$3.s();
      }

      this.u();
      this.cF.a();
      this.fV();
   }

   @Override
   protected float fo() {
      return this.fC() ? 15.0F : super.fo();
   }

   public boolean fR() {
      return this.bV();
   }

   protected boolean fS() {
      return this.bV();
   }

   protected boolean fT() {
      return this.bV();
   }

   protected boolean fU() {
      this.cn = this.a(awc.a);
      return this.cn;
   }

   private void u() {
      ctq $$0 = this.a(bsd.f);
      if ($$0.a(ctt.oo) && !this.a(awc.a)) {
         this.b(new bre(brg.m, 200, 0, false, false, true));
      }
   }

   protected ctm k() {
      return new ctm();
   }

   private void v() {
      this.ch = this.ck;
      this.ci = this.cl;
      this.cj = this.cm;
      double $$0 = this.du() - this.ck;
      double $$1 = this.dw() - this.cl;
      double $$2 = this.dA() - this.cm;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.ck = this.du();
         this.ch = this.ck;
      }

      if ($$2 > 10.0) {
         this.cm = this.dA();
         this.cj = this.cm;
      }

      if ($$1 > 10.0) {
         this.cl = this.dw();
         this.ci = this.cl;
      }

      if ($$0 < -10.0) {
         this.ck = this.du();
         this.ch = this.ck;
      }

      if ($$2 < -10.0) {
         this.cm = this.dA();
         this.cj = this.cm;
      }

      if ($$1 < -10.0) {
         this.cl = this.dw();
         this.ci = this.cl;
      }

      this.ck += $$0 * 0.25;
      this.cm += $$2 * 0.25;
      this.cl += $$1 * 0.25;
   }

   protected void fV() {
      if (this.h(btc.d)) {
         btc $$0;
         if (this.fE()) {
            $$0 = btc.b;
         } else if (this.fL()) {
            $$0 = btc.c;
         } else if (this.cc()) {
            $$0 = btc.d;
         } else if (this.fr()) {
            $$0 = btc.e;
         } else if (this.bV() && !this.cA.b) {
            $$0 = btc.f;
         } else {
            $$0 = btc.a;
         }

         btc $$6;
         if (this.N_() || this.bR() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(btc.f)) {
            $$6 = btc.f;
         } else {
            $$6 = btc.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(btc $$0) {
      return this.dP().a(this, this.a($$0).a(this.dn()).h(1.0E-7));
   }

   @Override
   public int az() {
      return Math.max(1, this.dP().aa().c(this.cA.a ? dav.F : dav.E));
   }

   @Override
   protected avh aP() {
      return avi.ur;
   }

   @Override
   protected avh aQ() {
      return avi.up;
   }

   @Override
   protected avh aR() {
      return avi.uq;
   }

   @Override
   public int bP() {
      return 10;
   }

   @Override
   public void a(avh $$0, float $$1, float $$2) {
      this.dP().a(this, this.du(), this.dw(), this.dA(), $$0, this.de(), $$1, $$2);
   }

   public void a(avh $$0, avj $$1, float $$2, float $$3) {
   }

   @Override
   public avj de() {
      return avj.h;
   }

   @Override
   protected int df() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.x();
      } else if ($$0 == 23) {
         this.cD = false;
      } else if ($$0 == 22) {
         this.cD = true;
      } else {
         super.b($$0);
      }
   }

   protected void r() {
      this.cb = this.ca;
   }

   @Override
   protected void s() {
   }

   @Override
   public void t() {
      if (!this.dP().B && this.fS() && this.bR()) {
         this.ac();
         this.g(false);
      } else {
         super.t();
         this.ce = this.cf;
         this.cf = 0.0F;
      }
   }

   @Override
   protected void fq() {
      super.fq();
      this.eV();
      this.ba = this.dF();
   }

   @Override
   public void n_() {
      if (this.cd > 0) {
         this.cd--;
      }

      if (this.dP().ak() == bpt.a && this.dP().aa().b(dav.k)) {
         if (this.eA() < this.eR() && this.ai % 20 == 0) {
            this.c(1.0F);
         }

         if (this.cc.c() && this.ai % 10 == 0) {
            this.cc.a(this.cc.a() + 1);
         }
      }

      this.g.j();
      this.ce = this.cf;
      super.n_();
      this.y((float)this.g(bty.r));
      float $$1;
      if (this.aE() && !this.eB() && !this.cc()) {
         $$1 = Math.min(0.1F, (float)this.ds().h());
      } else {
         $$1 = 0.0F;
      }

      this.cf = this.cf + ($$1 - this.cf) * 0.4F;
      if (this.eA() > 0.0F && !this.N_()) {
         euh $$2;
         if (this.bR() && !this.dc().dK()) {
            $$2 = this.cK().b(this.dc().cK()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cK().c(1.0, 0.5, 1.0);
         }

         List<brw> $$4 = this.dP().a_(this, $$2);
         List<brw> $$5 = Lists.newArrayList();

         for (brw $$6 : $$4) {
            if ($$6.ak() == bsc.M) {
               $$5.add($$6);
            } else if (!$$6.dK()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ac.a($$5, this.ah));
         }
      }

      this.c(this.gt());
      this.c(this.gu());
      if (!this.dP().B && (this.ac > 0.5F || this.be()) || this.cA.b || this.fL() || this.aB) {
         this.gq();
      }
   }

   private void c(@Nullable ud $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dP().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bsc.a($$1).filter($$0x -> $$0x == bsc.ax).ifPresent($$0x -> {
            if (!cew.a(this.dP(), this)) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), cew.a(this.dP(), this.dP().z), this.de(), 1.0F, cew.a(this.dP().z));
            }
         });
      }
   }

   private void d(brw $$0) {
      $$0.b_(this);
   }

   public int fW() {
      return this.ao.a(e);
   }

   public void s(int $$0) {
      this.ao.a(e, $$0);
   }

   public void t(int $$0) {
      int $$1 = this.fW();
      this.ao.a(e, $$1 + $$0);
   }

   public void u(int $$0) {
      this.bC = $$0;
      if (!this.dP().B) {
         this.gq();
         this.c(4, true);
      }
   }

   @Override
   public void a(bqp $$0) {
      super.a($$0);
      this.at();
      if (!this.N_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-ayf.b((this.eJ() + this.dF()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-ayf.a((this.eJ() + this.dF()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(avs.N);
      this.a(avs.i.b(avs.m));
      this.a(avs.i.b(avs.n));
      this.aC();
      this.c(false);
      this.a(Optional.of(iw.a(this.dP().ae(), this.dp())));
   }

   @Override
   protected void eD() {
      super.eD();
      if (!this.dP().aa().b(dav.d)) {
         this.fX();
         this.g.k();
      }
   }

   protected void fX() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         ctq $$1 = this.g.a($$0);
         if (!$$1.e() && czc.g($$1)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected avh d(bqp $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected avh o_() {
      return avi.uh;
   }

   @Nullable
   public cii a(ctq $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cii a(ctq $$0, boolean $$1, boolean $$2) {
      if ($$0.e()) {
         return null;
      } else {
         if (this.dP().B) {
            this.a(bpv.a);
         }

         double $$3 = this.dy() - 0.3F;
         cii $$4 = new cii(this.dP(), this.du(), $$3, this.dA(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ah.i() * 0.5F;
            float $$6 = this.ah.i() * (float) (Math.PI * 2);
            $$4.o((double)(-ayf.a($$6) * $$5), 0.2F, (double)(ayf.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = ayf.a(this.dH() * (float) (Math.PI / 180.0));
            float $$9 = ayf.b(this.dH() * (float) (Math.PI / 180.0));
            float $$10 = ayf.a(this.dF() * (float) (Math.PI / 180.0));
            float $$11 = ayf.b(this.dF() * (float) (Math.PI / 180.0));
            float $$12 = this.ah.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.ah.i();
            $$4.o(
               (double)(-$$10 * $$9 * 0.3F) + Math.cos((double)$$12) * (double)$$13,
               (double)(-$$8 * 0.3F + 0.1F + (this.ah.i() - this.ah.i()) * 0.1F),
               (double)($$11 * $$9 * 0.3F) + Math.sin((double)$$12) * (double)$$13
            );
         }

         return $$4;
      }
   }

   public float d(drd $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = czc.g(this);
         ctq $$3 = this.eX();
         if ($$2 > 0 && !$$3.e()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (brf.a(this)) {
         $$1 *= 1.0F + (float)(brf.b(this) + 1) * 0.2F;
      }

      if (this.b(brg.d)) {
         $$1 *= switch (this.c(brg.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.g(bty.f);
      if (this.a(awc.a) && !czc.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aE()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(drd $$0) {
      return !$$0.y() || this.g.f().b($$0);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a_(this.cC.getId());
      uj $$1 = $$0.c("Inventory", 10);
      this.g.b($$1);
      this.g.k = $$0.h("SelectedItemSlot");
      this.cz = $$0.g("SleepTimer");
      this.cq = $$0.j("XpP");
      this.co = $$0.h("XpLevel");
      this.cp = $$0.h("XpTotal");
      this.cr = $$0.h("XpSeed");
      if (this.cr == 0) {
         this.cr = this.ah.f();
      }

      this.s($$0.h("Score"));
      this.cc.a($$0);
      this.cA.b($$0);
      this.f(bty.r).a((double)this.cA.b());
      if ($$0.b("EnderItems", 9)) {
         this.bZ.a($$0.c("EnderItems", 10), this.dR());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(iw.b.parse(ur.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         eum.a.parse(ur.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.cv = $$0x);
      }

      this.cx = $$0.q("ignore_fall_damage_from_current_explosion");
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      us.e($$0);
      $$0.a("Inventory", this.g.a(new uj()));
      $$0.a("SelectedItemSlot", this.g.k);
      $$0.a("SleepTimer", (short)this.cz);
      $$0.a("XpP", this.cq);
      $$0.a("XpLevel", this.co);
      $$0.a("XpTotal", this.cp);
      $$0.a("XpSeed", this.cr);
      $$0.a("Score", this.fW());
      this.cc.b($$0);
      this.cA.a($$0);
      $$0.a("EnderItems", this.bZ.a(this.dR()));
      if (!this.gt().g()) {
         $$0.a("ShoulderEntityLeft", this.gt());
      }

      if (!this.gu().g()) {
         $$0.a("ShoulderEntityRight", this.gu());
      }

      this.gB().flatMap($$0x -> iw.b.encodeStart(ur.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cv != null) {
         $$0.a("current_explosion_impact_pos", (va)eum.a.encodeStart(ur.a, this.cv).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cx);
   }

   @Override
   public boolean b(bqp $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(avz.o)) {
         return !this.dP().aa().b(dav.G);
      } else if ($$0.a(avz.n)) {
         return !this.dP().aa().b(dav.H);
      } else if ($$0.a(avz.j)) {
         return !this.dP().aa().b(dav.I);
      } else {
         return $$0.a(avz.p) ? !this.dP().aa().b(dav.J) : false;
      }
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cA.a && !$$0.a(avz.e)) {
         return false;
      } else {
         this.bf = 0;
         if (this.eB()) {
            return false;
         } else {
            if (!this.dP().B) {
               this.gq();
            }

            if ($$0.f()) {
               if (this.dP().ak() == bpt.a) {
                  $$1 = 0.0F;
               }

               if (this.dP().ak() == bpt.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dP().ak() == bpt.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bsq $$0) {
      super.d($$0);
      if ($$0.fO()) {
         this.fY();
      }
   }

   @Override
   public boolean et() {
      return !this.gd().a && super.et();
   }

   public boolean a(cly $$0) {
      evs $$1 = this.cj();
      evs $$2 = $$0.cj();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bqp $$0, float $$1) {
      this.a($$0, $$1, new bsd[]{bsd.c, bsd.d, bsd.e, bsd.f});
   }

   @Override
   protected void c(bqp $$0, float $$1) {
      this.a($$0, $$1, new bsd[]{bsd.f});
   }

   @Override
   protected void v(float $$0) {
      if (this.bz.a(ctt.vs)) {
         if (!this.dP().B) {
            this.b(avs.c.b(this.bz.g()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + ayf.d($$0);
            bpv $$2 = this.fw();
            this.bz.a($$1, this, d($$2));
            if (this.bz.e()) {
               if ($$2 == bpv.a) {
                  this.a(bsd.a, ctq.i);
               } else {
                  this.a(bsd.b, ctq.i);
               }

               this.bz = ctq.i;
               this.a(avi.wB, 0.8F, 0.8F + this.dP().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bqp $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fs(), 0.0F);
         this.A(this.fs() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(avs.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.C($$0.a());
            this.eP().a($$0, var7);
            this.t(this.eA() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(avs.J, Math.round(var7 * 10.0F));
            }

            this.a(dvw.o);
         }
      }
   }

   @Override
   protected boolean dY() {
      return !this.cA.b && super.dY();
   }

   public boolean Y() {
      return false;
   }

   public void a(dps $$0, boolean $$1) {
   }

   public void a(daa $$0) {
   }

   public void a(dos $$0) {
   }

   public void a(dpx $$0) {
   }

   public void a(dpi $$0) {
   }

   public void a(cgk $$0, bpp $$1) {
   }

   public OptionalInt a(@Nullable bqa $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, czy $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(ctq $$0, bpv $$1) {
   }

   public bpw a(brw $$0, bpv $$1) {
      if (this.N_()) {
         if ($$0 instanceof bqa) {
            this.a((bqa)$$0);
         }

         return bpw.d;
      } else {
         ctq $$2 = this.b($$1);
         ctq $$3 = $$2.s();
         bpw $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cA.d && $$2 == this.b($$1) && $$2.I() < $$3.I()) {
               $$2.e($$3.I());
            }

            return $$4;
         } else {
            if (!$$2.e() && $$0 instanceof bsq) {
               if (this.cA.d) {
                  $$2 = $$3;
               }

               bpw $$5 = $$2.a(this, (bsq)$$0, $$1);
               if ($$5.a()) {
                  this.dP().a(dvw.r, $$0.dn(), dvw.a.a(this));
                  if ($$2.e() && !this.cA.d) {
                     this.a($$1, ctq.i);
                  }

                  return $$5;
               }
            }

            return bpw.d;
         }
      }
   }

   @Override
   public void bI() {
      super.bI();
      this.K = 0;
   }

   @Override
   protected boolean fg() {
      return super.fg() || this.fL();
   }

   @Override
   public boolean ef() {
      return !this.cA.b;
   }

   @Override
   protected eum a(eum $$0, bsv $$1) {
      if (!this.cA.b && $$0.d <= 0.0 && ($$1 == bsv.a || $$1 == bsv.b) && this.fT() && this.z()) {
         double $$2 = $$0.c;
         double $$3 = $$0.e;
         double $$4 = 0.05;

         while ($$2 != 0.0 && this.dP().a(this, this.cK().d($$2, (double)(-this.dJ()), 0.0))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }
         }

         while ($$3 != 0.0 && this.dP().a(this, this.cK().d(0.0, (double)(-this.dJ()), $$3))) {
            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         while ($$2 != 0.0 && $$3 != 0.0 && this.dP().a(this, this.cK().d($$2, (double)(-this.dJ()), $$3))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }

            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         $$0 = new eum($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean z() {
      return this.aE() || this.ac < this.dJ() && !this.dP().a(this, this.cK().d(0.0, (double)(this.ac - this.dJ()), 0.0));
   }

   public void e(brw $$0) {
      if ($$0.ct()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.g(bty.c);
            float $$2 = czc.a(this.eX(), $$0.ak());
            float $$3 = this.D(0.5F);
            $$1 *= 0.2F + $$3 * $$3 * 0.8F;
            $$2 *= $$3;
            this.gw();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$4 = $$3 > 0.9F;
               boolean $$5 = false;
               int $$6 = 0;
               $$6 += czc.c(this);
               if (this.cb() && $$4) {
                  this.dP().a(null, this.du(), this.dw(), this.dA(), avi.tZ, this.de(), 1.0F, 1.0F);
                  $$6++;
                  $$5 = true;
               }

               $$1 += this.b(bpv.a).g().a(this, $$1);
               boolean $$7 = $$4
                  && this.ac > 0.0F
                  && !this.aE()
                  && !this.q_()
                  && !this.be()
                  && !this.b(brg.o)
                  && !this.bR()
                  && $$0 instanceof bsq
                  && !this.cb();
               if ($$7) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$8 = false;
               double $$9 = (double)(this.Z - this.Y);
               if ($$4 && !$$7 && !$$5 && this.aE() && $$9 < (double)this.fn()) {
                  ctq $$10 = this.b(bpv.a);
                  if ($$10.g() instanceof cvd) {
                     $$8 = true;
                  }
               }

               float $$11 = 0.0F;
               boolean $$12 = false;
               int $$13 = czc.d(this);
               if ($$0 instanceof bsq) {
                  $$11 = ((bsq)$$0).eA();
                  if ($$13 > 0 && !$$0.bQ()) {
                     $$12 = true;
                     $$0.g(1);
                  }
               }

               eum $$14 = $$0.ds();
               boolean $$15 = $$0.a(this.dQ().a(this), $$1);
               if ($$15) {
                  if ($$6 > 0) {
                     if ($$0 instanceof bsq) {
                        ((bsq)$$0)
                           .q(
                              (double)((float)$$6 * 0.5F),
                              (double)ayf.a(this.dF() * (float) (Math.PI / 180.0)),
                              (double)(-ayf.b(this.dF() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-ayf.a(this.dF() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F),
                           0.1,
                           (double)(ayf.b(this.dF() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F)
                        );
                     }

                     this.g(this.ds().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$8) {
                     float $$16 = 1.0F + czc.a(this) * $$1;

                     for (bsq $$18 : this.dP().a(bsq.class, $$0.cK().c(1.0, 0.25, 1.0))) {
                        if ($$18 != this && $$18 != $$0 && !this.s($$18) && (!($$18 instanceof chy) || !((chy)$$18).z()) && this.g((brw)$$18) < 9.0) {
                           $$18.q(0.4F, (double)ayf.a(this.dF() * (float) (Math.PI / 180.0)), (double)(-ayf.b(this.dF() * (float) (Math.PI / 180.0))));
                           $$18.a(this.dQ().a(this), $$16);
                        }
                     }

                     this.dP().a(null, this.du(), this.dw(), this.dA(), avi.uc, this.de(), 1.0F, 1.0F);
                     this.fZ();
                  }

                  if ($$0 instanceof aqo && $$0.U) {
                     ((aqo)$$0).c.b(new aex($$0));
                     $$0.U = false;
                     $$0.g($$14);
                  }

                  if ($$7) {
                     this.dP().a(null, this.du(), this.dw(), this.dA(), avi.tY, this.de(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$7 && !$$8) {
                     if ($$4) {
                        this.dP().a(null, this.du(), this.dw(), this.dA(), avi.ub, this.de(), 1.0F, 1.0F);
                     } else {
                        this.dP().a(null, this.du(), this.dw(), this.dA(), avi.ud, this.de(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.c($$0);
                  }

                  this.A($$0);
                  if ($$0 instanceof bsq) {
                     czc.a((bsq)$$0, this);
                  }

                  czc.b(this, $$0);
                  ctq $$19 = this.eX();
                  czg $$20 = $$19.C();
                  brw $$21 = $$0;
                  if ($$0 instanceof cha) {
                     $$21 = ((cha)$$0).b;
                  }

                  if (!this.dP().B && !$$19.e() && $$21 instanceof bsq) {
                     $$19.a((bsq)$$21, this);
                     if ($$19.e()) {
                        this.a(bpv.a, ctq.i);
                     }
                  }

                  czc.a(this, $$0, $$20);
                  if ($$0 instanceof bsq) {
                     float $$22 = $$11 - ((bsq)$$0).eA();
                     this.a(avs.G, Math.round($$22 * 10.0F));
                     if ($$13 > 0) {
                        $$0.g($$13 * 4);
                     }

                     if (this.dP() instanceof aqn && $$22 > 2.0F) {
                        int $$23 = (int)((double)$$22 * 0.5);
                        ((aqn)this.dP()).a(ky.g, $$0.du(), $$0.e(0.5), $$0.dA(), $$23, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.C(0.1F);
               } else {
                  this.dP().a(null, this.du(), this.dw(), this.dA(), avi.ua, this.de(), 1.0F, 1.0F);
                  if ($$12) {
                     $$0.aC();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(bsq $$0) {
      this.e($$0);
   }

   public void fY() {
      this.gx().a(ctt.vs, 100);
      this.fB();
      this.dP().a(this, (byte)30);
   }

   @Override
   public void b(brw $$0) {
   }

   public void c(brw $$0) {
   }

   public void fZ() {
      double $$0 = (double)(-ayf.a(this.dF() * (float) (Math.PI / 180.0)));
      double $$1 = (double)ayf.b(this.dF() * (float) (Math.PI / 180.0));
      if (this.dP() instanceof aqn) {
         ((aqn)this.dP()).a(ky.aj, this.du() + $$0, this.e(0.5), this.dA() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void ga() {
   }

   @Override
   public void a(brw.c $$0) {
      super.a($$0);
      this.ca.b(this);
      if (this.cb != null && this.ge()) {
         this.s();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile gb() {
      return this.cC;
   }

   public clx gc() {
      return this.g;
   }

   public clv gd() {
      return this.cA;
   }

   @Override
   public boolean fP() {
      return this.cA.d;
   }

   public void a(ctq $$0, ctq $$1, cpd $$2) {
   }

   public boolean ge() {
      return this.cb != this.ca;
   }

   public Either<cly.a, azh> a(io $$0) {
      this.b($$0);
      this.cz = 0;
      return Either.right(azh.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fM();
      if (this.dP() instanceof aqn && $$1) {
         ((aqn)this.dP()).e();
      }

      this.cz = $$0 ? 0 : 100;
   }

   @Override
   public void fM() {
      this.a(true, true);
   }

   public static Optional<eum> a(aqn $$0, io $$1, float $$2, boolean $$3, boolean $$4) {
      drd $$5 = $$0.a_($$1);
      dea $$6 = $$5.b();
      if ($$6 instanceof dki && ($$3 || $$5.c(dki.d) > 0) && dki.a($$0)) {
         Optional<eum> $$7 = dki.a(bsc.by, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dki.d, Integer.valueOf($$5.c(dki.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof ddt && ddt.a($$0)) {
         return ddt.a(bsc.by, $$0, $$1, $$5.c(ddt.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         drd $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new eum((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean gf() {
      return this.fL() && this.cz >= 100;
   }

   public int gg() {
      return this.cz;
   }

   public void a(wx $$0, boolean $$1) {
   }

   public void a(akn $$0) {
      this.b(avs.i.b($$0));
   }

   public void a(akn $$0, int $$1) {
      this.a(avs.i.b($$0), $$1);
   }

   public void b(avp<?> $$0) {
      this.a($$0, 1);
   }

   public void a(avp<?> $$0, int $$1) {
   }

   public void a(avp<?> $$0) {
   }

   public int a(Collection<cxy<?>> $$0) {
      return 0;
   }

   public void a(cxy<?> $$0, List<ctq> $$1) {
   }

   public void b(List<akn> $$0) {
   }

   public int b(Collection<cxy<?>> $$0) {
      return 0;
   }

   @Override
   public void fj() {
      super.fj();
      this.a(avs.E);
      if (this.cb()) {
         this.C(0.2F);
      } else {
         this.C(0.05F);
      }
   }

   @Override
   public void a(eum $$0) {
      if (this.cc() && !this.bR()) {
         double $$1 = this.bL().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bn || !this.dP().a_(io.a(this.du(), this.dw() + 1.0 - 0.1, this.dA())).u().c()) {
            eum $$3 = this.ds();
            this.g($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cA.b && !this.bR()) {
         double $$4 = this.ds().d;
         super.a($$0);
         eum $$5 = this.ds();
         this.o($$5.c, $$4 * 0.6, $$5.e);
         this.n();
         this.b(7, false);
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bk() {
      if (this.cA.b) {
         this.i(false);
      } else {
         super.bk();
      }
   }

   protected boolean i(io $$0) {
      return !this.dP().a_($$0).o(this.dP(), $$0);
   }

   @Override
   public float fn() {
      return (float)this.g(bty.r);
   }

   @Override
   public boolean a(float $$0, float $$1, bqp $$2) {
      if (this.cA.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(avs.t, (int)Math.round((double)$$0 * 100.0));
         }

         if (this.cx && this.cv != null) {
            double $$3 = this.cv.d;
            this.gE();
            return $$3 < this.dw() ? false : super.a((float)($$3 - this.dw()), $$1, $$2);
         } else {
            return super.a($$0, $$1, $$2);
         }
      }
   }

   public boolean gh() {
      if (!this.aE() && !this.fE() && !this.be() && !this.b(brg.y)) {
         ctq $$0 = this.a(bsd.e);
         if ($$0.a(ctt.nT) && csm.j($$0)) {
            this.gi();
            return true;
         }
      }

      return false;
   }

   public void gi() {
      this.b(7, true);
   }

   public void gj() {
      this.b(7, true);
      this.b(7, false);
   }

   @Override
   protected void bn() {
      if (!this.N_()) {
         super.bn();
      }
   }

   @Override
   protected void b(io $$0, drd $$1) {
      if (this.be()) {
         this.aT();
         this.b($$1);
      } else {
         io $$2 = this.f($$0);
         if (!$$0.equals($$2)) {
            drd $$3 = this.dP().a_($$2);
            if ($$3.a(avx.bo)) {
               this.a($$3, $$1);
            } else {
               super.b($$2, $$3);
            }
         } else {
            super.b($$0, $$1);
         }
      }
   }

   @Override
   public bsq.a eL() {
      return new bsq.a(avi.uo, avi.ue);
   }

   @Override
   public boolean a(aqn $$0, bsq $$1) {
      this.b(avs.g.b($$1.ak()));
      return true;
   }

   @Override
   public void a(drd $$0, eum $$1) {
      if (!this.cA.b) {
         super.a($$0, $$1);
      }

      this.gE();
   }

   public void d(int $$0) {
      this.t($$0);
      this.cq = this.cq + (float)$$0 / (float)this.gl();
      this.cp = ayf.a(this.cp + $$0, 0, Integer.MAX_VALUE);

      while (this.cq < 0.0F) {
         float $$1 = this.cq * (float)this.gl();
         if (this.co > 0) {
            this.c(-1);
            this.cq = 1.0F + $$1 / (float)this.gl();
         } else {
            this.c(-1);
            this.cq = 0.0F;
         }
      }

      while (this.cq >= 1.0F) {
         this.cq = (this.cq - 1.0F) * (float)this.gl();
         this.c(1);
         this.cq = this.cq / (float)this.gl();
      }
   }

   public int gk() {
      return this.cr;
   }

   @Override
   public void a(ctq $$0, int $$1) {
      this.co -= $$1;
      if (this.co < 0) {
         this.co = 0;
         this.cq = 0.0F;
         this.cp = 0;
      }

      this.cr = this.ah.f();
   }

   public void c(int $$0) {
      this.co += $$0;
      if (this.co < 0) {
         this.co = 0;
         this.cq = 0.0F;
         this.cp = 0;
      }

      if ($$0 > 0 && this.co % 5 == 0 && (float)this.cB < (float)this.ai - 100.0F) {
         float $$1 = this.co > 30 ? 1.0F : (float)this.co / 30.0F;
         this.dP().a(null, this.du(), this.dw(), this.dA(), avi.un, this.de(), $$1 * 0.75F, 1.0F);
         this.cB = this.ai;
      }
   }

   public int gl() {
      if (this.co >= 30) {
         return 112 + (this.co - 30) * 9;
      } else {
         return this.co >= 15 ? 37 + (this.co - 15) * 5 : 7 + this.co * 2;
      }
   }

   public void C(float $$0) {
      if (!this.cA.a) {
         if (!this.dP().B) {
            this.cc.a($$0);
         }
      }
   }

   public Optional<cle> aa() {
      return Optional.empty();
   }

   public cor gm() {
      return this.cc;
   }

   public boolean t(boolean $$0) {
      return this.cA.a || $$0 || this.cc.c();
   }

   public boolean gn() {
      return this.eA() > 0.0F && this.eA() < this.eR();
   }

   public boolean go() {
      return this.cA.e;
   }

   public boolean a(io $$0, it $$1, ctq $$2) {
      if (this.cA.e) {
         return true;
      } else {
         io $$3 = $$0.a($$1.g());
         drh $$4 = new drh(this.dP(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   public int ej() {
      if (!this.dP().aa().b(dav.d) && !this.N_()) {
         int $$0 = this.co * 7;
         return $$0 > 100 ? 100 : $$0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean ek() {
      return true;
   }

   @Override
   public boolean cF() {
      return true;
   }

   @Override
   protected brw.b bb() {
      return this.cA.b || this.aE() && this.bY() ? brw.b.a : brw.b.d;
   }

   public void y() {
   }

   @Override
   public wx af() {
      return wx.b(this.cC.getName());
   }

   public cqh gp() {
      return this.bZ;
   }

   @Override
   public ctq a(bsd $$0) {
      if ($$0 == bsd.a) {
         return this.g.f();
      } else if ($$0 == bsd.b) {
         return this.g.j.get(0);
      } else {
         return $$0.a() == bsd.a.b ? this.g.i.get($$0.b()) : ctq.i;
      }
   }

   @Override
   protected boolean b(bsd $$0) {
      return $$0.a() == bsd.a.b;
   }

   @Override
   public void a(bsd $$0, ctq $$1) {
      this.e($$1);
      if ($$0 == bsd.a) {
         this.a($$0, this.g.h.set(this.g.k, $$1), $$1);
      } else if ($$0 == bsd.b) {
         this.a($$0, this.g.j.set(0, $$1), $$1);
      } else if ($$0.a() == bsd.a.b) {
         this.a($$0, this.g.i.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(ctq $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<ctq> fa() {
      return Lists.newArrayList(new ctq[]{this.eX(), this.eY()});
   }

   @Override
   public Iterable<ctq> eZ() {
      return this.g.i;
   }

   @Override
   public boolean d(bsd $$0) {
      return $$0 != bsd.g;
   }

   public boolean h(ud $$0) {
      if (this.bR() || !this.aE() || this.be() || this.aB) {
         return false;
      } else if (this.gt().g()) {
         this.i($$0);
         this.f = this.dP().Y();
         return true;
      } else if (this.gu().g()) {
         this.j($$0);
         this.f = this.dP().Y();
         return true;
      } else {
         return false;
      }
   }

   protected void gq() {
      if (this.f + 20L < this.dP().Y()) {
         this.k(this.gt());
         this.i(new ud());
         this.k(this.gu());
         this.j(new ud());
      }
   }

   private void k(ud $$0) {
      if (!this.dP().B && !$$0.g()) {
         bsc.a($$0, this.dP()).ifPresent($$0x -> {
            if ($$0x instanceof btn) {
               ((btn)$$0x).b(this.az);
            }

            $$0x.a_(this.du(), this.dw() + 0.7F, this.dA());
            ((aqn)this.dP()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean N_();

   @Override
   public boolean by() {
      return !this.N_() && super.by();
   }

   @Override
   public boolean cc() {
      return !this.cA.b && !this.N_() && super.cc();
   }

   public abstract boolean f();

   @Override
   public boolean cC() {
      return !this.cA.b;
   }

   public evq gr() {
      return this.dP().L();
   }

   @Override
   public wx O_() {
      xl $$0 = evl.a(this.cj(), this.af());
      return this.a($$0);
   }

   private xl a(xl $$0) {
      String $$1 = this.gb().getName();
      return $$0.a($$1x -> $$1x.a(new wv(wv.a.d, "/tell " + $$1 + " ")).a(this.cJ()).a($$1));
   }

   @Override
   public String cB() {
      return this.gb().getName();
   }

   @Override
   protected void B(float $$0) {
      this.ap().a(d, $$0);
   }

   @Override
   public float fs() {
      return this.ap().a(d);
   }

   public boolean a(clz $$0) {
      return (this.ap().a(bV) & $$0.a()) == $$0.a();
   }

   @Override
   public bti a_(int $$0) {
      if ($$0 == 499) {
         return new bti() {
            @Override
            public ctq a() {
               return cly.this.cb.g();
            }

            @Override
            public boolean a(ctq $$0) {
               cly.this.cb.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bti() {
               @Override
               public ctq a() {
                  return cly.this.ca.q().a($$1);
               }

               @Override
               public boolean a(ctq $$0) {
                  cly.this.ca.q().a($$1, $$0);
                  cly.this.ca.a(cly.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.h.size()) {
            return bti.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.bZ.b() ? bti.a(this.bZ, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gs() {
      return this.cD;
   }

   public void u(boolean $$0) {
      this.cD = $$0;
   }

   @Override
   public void i(int $$0) {
      super.i(this.cA.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bsk fu() {
      return this.ao.a(bW) == 0 ? bsk.a : bsk.b;
   }

   public void a(bsk $$0) {
      this.ao.a(bW, (byte)($$0 == bsk.a ? 0 : 1));
   }

   public ud gt() {
      return this.ao.a(bX);
   }

   protected void i(ud $$0) {
      this.ao.a(bX, $$0);
   }

   public ud gu() {
      return this.ao.a(bY);
   }

   protected void j(ud $$0) {
      this.ao.a(bY, $$0);
   }

   public float gv() {
      return (float)(1.0 / this.g(bty.e) * 20.0);
   }

   public float D(float $$0) {
      return ayf.a(((float)this.aT + $$0) / this.gv(), 0.0F, 1.0F);
   }

   public void gw() {
      this.aT = 0;
   }

   public ctm gx() {
      return this.cF;
   }

   @Override
   protected float aN() {
      return !this.cA.b && !this.fE() ? super.aN() : 1.0F;
   }

   public float gy() {
      return (float)this.g(bty.o);
   }

   public boolean gz() {
      return this.cA.d && this.F() >= 2;
   }

   @Override
   public boolean f(ctq $$0) {
      bsd $$1 = bss.h($$0);
      return this.a($$1).e();
   }

   @Override
   public brz e(btc $$0) {
      return c.getOrDefault($$0, bU);
   }

   @Override
   public ImmutableList<btc> fI() {
      return ImmutableList.of(btc.a, btc.f, btc.d);
   }

   @Override
   public ctq g(ctq $$0) {
      if (!($$0.g() instanceof cuj)) {
         return ctq.i;
      } else {
         Predicate<ctq> $$1 = ((cuj)$$0.g()).d();
         ctq $$2 = cuj.a(this, $$1);
         if (!$$2.e()) {
            return $$2;
         } else {
            $$1 = ((cuj)$$0.g()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               ctq $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cA.d ? new ctq(ctt.ov) : ctq.i;
         }
      }
   }

   @Override
   public ctq a(daz $$0, ctq $$1) {
      this.gm().a($$1);
      this.b(avs.c.b($$1.g()));
      $$0.a(null, this.du(), this.dw(), this.dA(), avi.ug, avj.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof aqo) {
         am.A.a((aqo)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(drd $$0) {
      return this.cA.b || super.c($$0);
   }

   @Override
   public eum q(float $$0) {
      double $$1 = 0.22 * (this.fu() == bsk.b ? -1.0 : 1.0);
      float $$2 = ayf.i($$0 * 0.5F, this.dH(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = ayf.i($$0, this.aZ, this.aY) * (float) (Math.PI / 180.0);
      if (this.fE() || this.fr()) {
         eum $$4 = this.f($$0);
         eum $$5 = this.ds();
         double $$6 = $$5.i();
         double $$7 = $$4.i();
         float $$10;
         if ($$6 > 0.0 && $$7 > 0.0) {
            double $$8 = ($$5.c * $$4.c + $$5.e * $$4.e) / Math.sqrt($$6 * $$7);
            double $$9 = $$5.c * $$4.e - $$5.e * $$4.c;
            $$10 = (float)(Math.signum($$9) * Math.acos($$8));
         } else {
            $$10 = 0.0F;
         }

         return this.l($$0).e(new eum($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cd()) {
         return this.l($$0).e(new eum($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cK().c() - 1.0;
         double $$13 = this.ca() ? -0.2 : 0.07;
         return this.l($$0).e(new eum($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dO() {
      return true;
   }

   public boolean gA() {
      return this.fv() && this.fx().a(ctt.qX);
   }

   @Override
   public boolean dN() {
      return false;
   }

   public Optional<iw> gB() {
      return this.cG;
   }

   public void a(Optional<iw> $$0) {
      this.cG = $$0;
   }

   @Override
   public float eJ() {
      return this.cu;
   }

   @Override
   public void m(float $$0) {
      super.m($$0);
      this.cu = $$0;
   }

   @Override
   public boolean dI() {
      return true;
   }

   @Override
   protected float fm() {
      if (this.cA.b && !this.bR()) {
         return this.cb() ? this.cA.a() * 2.0F : this.cA.a();
      } else {
         return this.cb() ? 0.025999999F : 0.02F;
      }
   }

   public double gC() {
      return this.g(bty.g);
   }

   public double gD() {
      return this.g(bty.h);
   }

   public boolean b(brw $$0, double $$1) {
      return $$0.dK() ? false : this.a($$0.cK(), $$1);
   }

   public boolean a(euh $$0, double $$1) {
      double $$2 = this.gD() + $$1;
      return $$0.e(this.bx()) < $$2 * $$2;
   }

   public boolean a(io $$0, double $$1) {
      double $$2 = this.gC() + $$1;
      return new euh($$0).e(this.bx()) < $$2 * $$2;
   }

   public void gE() {
      this.cw = null;
      this.cv = null;
      this.cx = false;
   }

   public static enum a {
      a,
      b(wx.c("block.minecraft.bed.no_sleep")),
      c(wx.c("block.minecraft.bed.too_far_away")),
      d(wx.c("block.minecraft.bed.obstructed")),
      e,
      f(wx.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final wx g;

      private a() {
         this.g = null;
      }

      private a(wx $$0) {
         this.g = $$0;
      }

      @Nullable
      public wx a() {
         return this.g;
      }
   }
}
