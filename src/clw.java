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

public abstract class clw extends bso {
   private static final Logger b = LogUtils.getLogger();
   public static final bsi bG = bsi.b;
   public static final int bH = 0;
   public static final int bI = 20;
   public static final int bJ = 100;
   public static final int bK = 10;
   public static final int bL = 200;
   public static final int bM = 499;
   public static final int bN = 500;
   public static final float bO = 4.5F;
   public static final float bP = 3.0F;
   public static final float bQ = 1.5F;
   public static final float bR = 0.6F;
   public static final float bS = 0.6F;
   public static final float bT = 1.62F;
   public static final euk bU = new euk(0.0, 0.6, 0.0);
   public static final brx bV = brx.b(0.6F, 1.8F).b(1.62F).a(brw.a().a(brv.b, bU));
   private static final Map<bta, brx> c = ImmutableMap.builder()
      .put(bta.a, bV)
      .put(bta.c, aH)
      .put(bta.b, brx.b(0.6F, 0.6F).b(0.4F))
      .put(bta.d, brx.b(0.6F, 0.6F).b(0.4F))
      .put(bta.e, brx.b(0.6F, 0.6F).b(0.4F))
      .put(bta.f, brx.b(0.6F, 1.5F).b(1.27F).a(brw.a().a(brv.b, bU)))
      .put(bta.h, brx.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final ajr<Float> d = ajv.a(clw.class, ajt.d);
   private static final ajr<Integer> e = ajv.a(clw.class, ajt.b);
   protected static final ajr<Byte> bW = ajv.a(clw.class, ajt.a);
   protected static final ajr<Byte> bX = ajv.a(clw.class, ajt.a);
   protected static final ajr<ud> bY = ajv.a(clw.class, ajt.t);
   protected static final ajr<ud> bZ = ajv.a(clw.class, ajt.t);
   private long f;
   final clv g = new clv(this);
   protected cqf ca = new cqf();
   public final cpu cb;
   public cot cc;
   protected cop cd = new cop();
   protected int ce;
   public float cf;
   public float cg;
   public int ch;
   public double ci;
   public double cj;
   public double ck;
   public double cl;
   public double cm;
   public double cn;
   private int h;
   protected boolean co;
   private final clt cA = new clt();
   public int cp;
   public int cq;
   public float cr;
   protected int cs;
   protected final float ct = 0.02F;
   private int cB;
   private final GameProfile cC;
   private boolean cD;
   private cto cE = cto.i;
   private final ctk cF = this.k();
   private Optional<iw> cG = Optional.empty();
   @Nullable
   public cmk cu;
   protected float cv;
   @Nullable
   public euk cw;
   @Nullable
   public bru cx;
   public boolean cy;

   public clw(dax $$0, io $$1, float $$2, GameProfile $$3) {
      super(bsa.by, $$0);
      this.a_($$3.getId());
      this.cC = $$3;
      this.cb = new cpu(this.g, !$$0.B, this);
      this.cc = this.cb;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bl = 180.0F;
   }

   public boolean a(dax $$0, io $$1, dau $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dau.d) {
         return true;
      } else if (this.go()) {
         return false;
      } else {
         cto $$3 = this.eX();
         return $$3.e() || !$$3.b(new drf($$0, $$1, false));
      }
   }

   public static btv.a fQ() {
      return bso.dU().a(btw.c, 1.0).a(btw.r, 0.1F).a(btw.e).a(btw.o).a(btw.g, 4.5).a(btw.h, 3.0).a(btw.f);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(bW, (byte)0);
      $$0.a(bX, (byte)bG.a());
      $$0.a(bY, new ud());
      $$0.a(bZ, new ud());
   }

   @Override
   public void l() {
      this.ag = this.N_();
      if (this.N_()) {
         this.d(false);
      }

      if (this.ch > 0) {
         this.ch--;
      }

      if (this.fL()) {
         this.h++;
         if (this.h > 100) {
            this.h = 100;
         }

         if (!this.dP().B && this.dP().Q()) {
            this.a(false, true);
         }
      } else if (this.h > 0) {
         this.h++;
         if (this.h >= 110) {
            this.h = 0;
         }
      }

      this.fU();
      super.l();
      if (!this.dP().B && this.cc != null && !this.cc.a(this)) {
         this.r();
         this.cc = this.cb;
      }

      this.v();
      if (!this.dP().B) {
         this.cd.a(this);
         this.a(avr.k);
         this.a(avr.l);
         if (this.bD()) {
            this.a(avr.m);
         }

         if (this.bY()) {
            this.a(avr.o);
         }

         if (!this.fL()) {
            this.a(avr.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = ayd.a(this.du(), -2.9999999E7, 2.9999999E7);
      double $$2 = ayd.a(this.dA(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.du() || $$2 != this.dA()) {
         this.a_($$1, this.dw(), $$2);
      }

      this.aU++;
      cto $$3 = this.eX();
      if (!cto.a(this.cE, $$3)) {
         if (!cto.b(this.cE, $$3)) {
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
      this.co = this.a(awb.a);
      return this.co;
   }

   private void u() {
      cto $$0 = this.a(bsb.f);
      if ($$0.a(ctr.oo) && !this.a(awb.a)) {
         this.b(new brc(bre.m, 200, 0, false, false, true));
      }
   }

   protected ctk k() {
      return new ctk();
   }

   private void v() {
      this.ci = this.cl;
      this.cj = this.cm;
      this.ck = this.cn;
      double $$0 = this.du() - this.cl;
      double $$1 = this.dw() - this.cm;
      double $$2 = this.dA() - this.cn;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cl = this.du();
         this.ci = this.cl;
      }

      if ($$2 > 10.0) {
         this.cn = this.dA();
         this.ck = this.cn;
      }

      if ($$1 > 10.0) {
         this.cm = this.dw();
         this.cj = this.cm;
      }

      if ($$0 < -10.0) {
         this.cl = this.du();
         this.ci = this.cl;
      }

      if ($$2 < -10.0) {
         this.cn = this.dA();
         this.ck = this.cn;
      }

      if ($$1 < -10.0) {
         this.cm = this.dw();
         this.cj = this.cm;
      }

      this.cl += $$0 * 0.25;
      this.cn += $$2 * 0.25;
      this.cm += $$1 * 0.25;
   }

   protected void fV() {
      if (this.h(bta.d)) {
         bta $$0;
         if (this.fE()) {
            $$0 = bta.b;
         } else if (this.fL()) {
            $$0 = bta.c;
         } else if (this.cc()) {
            $$0 = bta.d;
         } else if (this.fr()) {
            $$0 = bta.e;
         } else if (this.bV() && !this.cA.b) {
            $$0 = bta.f;
         } else {
            $$0 = bta.a;
         }

         bta $$6;
         if (this.N_() || this.bR() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bta.f)) {
            $$6 = bta.f;
         } else {
            $$6 = bta.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bta $$0) {
      return this.dP().a(this, this.a($$0).a(this.dn()).h(1.0E-7));
   }

   @Override
   public int az() {
      return Math.max(1, this.dP().aa().c(this.cA.a ? dat.F : dat.E));
   }

   @Override
   protected avg aP() {
      return avh.ur;
   }

   @Override
   protected avg aQ() {
      return avh.up;
   }

   @Override
   protected avg aR() {
      return avh.uq;
   }

   @Override
   public int bP() {
      return 10;
   }

   @Override
   public void a(avg $$0, float $$1, float $$2) {
      this.dP().a(this, this.du(), this.dw(), this.dA(), $$0, this.de(), $$1, $$2);
   }

   public void a(avg $$0, avi $$1, float $$2, float $$3) {
   }

   @Override
   public avi de() {
      return avi.h;
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
      this.cc = this.cb;
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
         this.cf = this.cg;
         this.cg = 0.0F;
      }
   }

   @Override
   protected void fq() {
      super.fq();
      this.eV();
      this.bb = this.dF();
   }

   @Override
   public void n_() {
      if (this.ce > 0) {
         this.ce--;
      }

      if (this.dP().ak() == bpr.a && this.dP().aa().b(dat.k)) {
         if (this.eA() < this.eR() && this.ai % 20 == 0) {
            this.c(1.0F);
         }

         if (this.cd.c() && this.ai % 10 == 0) {
            this.cd.a(this.cd.a() + 1);
         }
      }

      this.g.j();
      this.cf = this.cg;
      super.n_();
      this.y((float)this.g(btw.r));
      float $$1;
      if (this.aE() && !this.eB() && !this.cc()) {
         $$1 = Math.min(0.1F, (float)this.ds().h());
      } else {
         $$1 = 0.0F;
      }

      this.cg = this.cg + ($$1 - this.cg) * 0.4F;
      if (this.eA() > 0.0F && !this.N_()) {
         euf $$2;
         if (this.bR() && !this.dc().dK()) {
            $$2 = this.cK().b(this.dc().cK()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cK().c(1.0, 0.5, 1.0);
         }

         List<bru> $$4 = this.dP().a_(this, $$2);
         List<bru> $$5 = Lists.newArrayList();

         for (bru $$6 : $$4) {
            if ($$6.ak() == bsa.M) {
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
         bsa.a($$1).filter($$0x -> $$0x == bsa.ax).ifPresent($$0x -> {
            if (!ceu.a(this.dP(), this)) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), ceu.a(this.dP(), this.dP().z), this.de(), 1.0F, ceu.a(this.dP().z));
            }
         });
      }
   }

   private void d(bru $$0) {
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
      this.bD = $$0;
      if (!this.dP().B) {
         this.gq();
         this.c(4, true);
      }
   }

   @Override
   public void a(bqn $$0) {
      super.a($$0);
      this.at();
      if (!this.N_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-ayd.b((this.eJ() + this.dF()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-ayd.a((this.eJ() + this.dF()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(avr.N);
      this.a(avr.i.b(avr.m));
      this.a(avr.i.b(avr.n));
      this.aC();
      this.c(false);
      this.a(Optional.of(iw.a(this.dP().ae(), this.dp())));
   }

   @Override
   protected void eD() {
      super.eD();
      if (!this.dP().aa().b(dat.d)) {
         this.fX();
         this.g.k();
      }
   }

   protected void fX() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cto $$1 = this.g.a($$0);
         if (!$$1.e() && cza.g($$1)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected avg d(bqn $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected avg o_() {
      return avh.uh;
   }

   @Nullable
   public cig a(cto $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cig a(cto $$0, boolean $$1, boolean $$2) {
      if ($$0.e()) {
         return null;
      } else {
         if (this.dP().B) {
            this.a(bpt.a);
         }

         double $$3 = this.dy() - 0.3F;
         cig $$4 = new cig(this.dP(), this.du(), $$3, this.dA(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ah.i() * 0.5F;
            float $$6 = this.ah.i() * (float) (Math.PI * 2);
            $$4.o((double)(-ayd.a($$6) * $$5), 0.2F, (double)(ayd.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = ayd.a(this.dH() * (float) (Math.PI / 180.0));
            float $$9 = ayd.b(this.dH() * (float) (Math.PI / 180.0));
            float $$10 = ayd.a(this.dF() * (float) (Math.PI / 180.0));
            float $$11 = ayd.b(this.dF() * (float) (Math.PI / 180.0));
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

   public float d(drb $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = cza.g(this);
         cto $$3 = this.eX();
         if ($$2 > 0 && !$$3.e()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (brd.a(this)) {
         $$1 *= 1.0F + (float)(brd.b(this) + 1) * 0.2F;
      }

      if (this.b(bre.d)) {
         $$1 *= switch (this.c(bre.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.g(btw.f);
      if (this.a(awb.a) && !cza.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aE()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(drb $$0) {
      return !$$0.y() || this.g.f().b($$0);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a_(this.cC.getId());
      uj $$1 = $$0.c("Inventory", 10);
      this.g.b($$1);
      this.g.k = $$0.h("SelectedItemSlot");
      this.h = $$0.g("SleepTimer");
      this.cr = $$0.j("XpP");
      this.cp = $$0.h("XpLevel");
      this.cq = $$0.h("XpTotal");
      this.cs = $$0.h("XpSeed");
      if (this.cs == 0) {
         this.cs = this.ah.f();
      }

      this.s($$0.h("Score"));
      this.cd.a($$0);
      this.cA.b($$0);
      this.f(btw.r).a((double)this.cA.b());
      if ($$0.b("EnderItems", 9)) {
         this.ca.a($$0.c("EnderItems", 10), this.dR());
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
         euk.a.parse(ur.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.cw = $$0x);
      }

      this.cy = $$0.q("ignore_fall_damage_from_current_explosion");
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      us.e($$0);
      $$0.a("Inventory", this.g.a(new uj()));
      $$0.a("SelectedItemSlot", this.g.k);
      $$0.a("SleepTimer", (short)this.h);
      $$0.a("XpP", this.cr);
      $$0.a("XpLevel", this.cp);
      $$0.a("XpTotal", this.cq);
      $$0.a("XpSeed", this.cs);
      $$0.a("Score", this.fW());
      this.cd.b($$0);
      this.cA.a($$0);
      $$0.a("EnderItems", this.ca.a(this.dR()));
      if (!this.gt().g()) {
         $$0.a("ShoulderEntityLeft", this.gt());
      }

      if (!this.gu().g()) {
         $$0.a("ShoulderEntityRight", this.gu());
      }

      this.gB().flatMap($$0x -> iw.b.encodeStart(ur.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cw != null) {
         $$0.a("current_explosion_impact_pos", (va)euk.a.encodeStart(ur.a, this.cw).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cy);
   }

   @Override
   public boolean b(bqn $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(avy.o)) {
         return !this.dP().aa().b(dat.G);
      } else if ($$0.a(avy.n)) {
         return !this.dP().aa().b(dat.H);
      } else if ($$0.a(avy.j)) {
         return !this.dP().aa().b(dat.I);
      } else {
         return $$0.a(avy.p) ? !this.dP().aa().b(dat.J) : false;
      }
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cA.a && !$$0.a(avy.e)) {
         return false;
      } else {
         this.bg = 0;
         if (this.eB()) {
            return false;
         } else {
            if (!this.dP().B) {
               this.gq();
            }

            if ($$0.f()) {
               if (this.dP().ak() == bpr.a) {
                  $$1 = 0.0F;
               }

               if (this.dP().ak() == bpr.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dP().ak() == bpr.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bso $$0) {
      super.d($$0);
      if ($$0.fO()) {
         this.fY();
      }
   }

   @Override
   public boolean et() {
      return !this.gd().a && super.et();
   }

   public boolean a(clw $$0) {
      evq $$1 = this.cj();
      evq $$2 = $$0.cj();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bqn $$0, float $$1) {
      this.a($$0, $$1, new bsb[]{bsb.c, bsb.d, bsb.e, bsb.f});
   }

   @Override
   protected void c(bqn $$0, float $$1) {
      this.a($$0, $$1, new bsb[]{bsb.f});
   }

   @Override
   protected void v(float $$0) {
      if (this.bA.a(ctr.vs)) {
         if (!this.dP().B) {
            this.b(avr.c.b(this.bA.g()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + ayd.d($$0);
            bpt $$2 = this.fw();
            this.bA.a($$1, this, d($$2));
            if (this.bA.e()) {
               if ($$2 == bpt.a) {
                  this.a(bsb.a, cto.i);
               } else {
                  this.a(bsb.b, cto.i);
               }

               this.bA = cto.i;
               this.a(avh.wB, 0.8F, 0.8F + this.dP().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bqn $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fs(), 0.0F);
         this.A(this.fs() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(avr.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.C($$0.a());
            this.eP().a($$0, var7);
            this.t(this.eA() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(avr.J, Math.round(var7 * 10.0F));
            }

            this.a(dvu.o);
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

   public void a(dpq $$0, boolean $$1) {
   }

   public void a(czy $$0) {
   }

   public void a(doq $$0) {
   }

   public void a(dpv $$0) {
   }

   public void a(dpg $$0) {
   }

   public void a(cgi $$0, bpn $$1) {
   }

   public OptionalInt a(@Nullable bpy $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, czw $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cto $$0, bpt $$1) {
   }

   public bpu a(bru $$0, bpt $$1) {
      if (this.N_()) {
         if ($$0 instanceof bpy) {
            this.a((bpy)$$0);
         }

         return bpu.d;
      } else {
         cto $$2 = this.b($$1);
         cto $$3 = $$2.s();
         bpu $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cA.d && $$2 == this.b($$1) && $$2.I() < $$3.I()) {
               $$2.e($$3.I());
            }

            return $$4;
         } else {
            if (!$$2.e() && $$0 instanceof bso) {
               if (this.cA.d) {
                  $$2 = $$3;
               }

               bpu $$5 = $$2.a(this, (bso)$$0, $$1);
               if ($$5.a()) {
                  this.dP().a(dvu.r, $$0.dn(), dvu.a.a(this));
                  if ($$2.e() && !this.cA.d) {
                     this.a($$1, cto.i);
                  }

                  return $$5;
               }
            }

            return bpu.d;
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
   protected euk a(euk $$0, bst $$1) {
      if (!this.cA.b && $$0.d <= 0.0 && ($$1 == bst.a || $$1 == bst.b) && this.fT() && this.z()) {
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

         $$0 = new euk($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean z() {
      return this.aE() || this.ac < this.dJ() && !this.dP().a(this, this.cK().d(0.0, (double)(this.ac - this.dJ()), 0.0));
   }

   public void e(bru $$0) {
      if ($$0.ct()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.g(btw.c);
            float $$2 = cza.a(this.eX(), $$0.ak());
            float $$3 = this.D(0.5F);
            $$1 *= 0.2F + $$3 * $$3 * 0.8F;
            $$2 *= $$3;
            this.gw();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$4 = $$3 > 0.9F;
               boolean $$5 = false;
               int $$6 = 0;
               $$6 += cza.c(this);
               if (this.cb() && $$4) {
                  this.dP().a(null, this.du(), this.dw(), this.dA(), avh.tZ, this.de(), 1.0F, 1.0F);
                  $$6++;
                  $$5 = true;
               }

               $$1 += this.b(bpt.a).g().a(this, $$1);
               boolean $$7 = $$4
                  && this.ac > 0.0F
                  && !this.aE()
                  && !this.q_()
                  && !this.be()
                  && !this.b(bre.o)
                  && !this.bR()
                  && $$0 instanceof bso
                  && !this.cb();
               if ($$7) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$8 = false;
               double $$9 = (double)(this.Z - this.Y);
               if ($$4 && !$$7 && !$$5 && this.aE() && $$9 < (double)this.fn()) {
                  cto $$10 = this.b(bpt.a);
                  if ($$10.g() instanceof cvb) {
                     $$8 = true;
                  }
               }

               float $$11 = 0.0F;
               boolean $$12 = false;
               int $$13 = cza.d(this);
               if ($$0 instanceof bso) {
                  $$11 = ((bso)$$0).eA();
                  if ($$13 > 0 && !$$0.bQ()) {
                     $$12 = true;
                     $$0.g(1);
                  }
               }

               euk $$14 = $$0.ds();
               boolean $$15 = $$0.a(this.dQ().a(this), $$1);
               if ($$15) {
                  if ($$6 > 0) {
                     if ($$0 instanceof bso) {
                        ((bso)$$0)
                           .q(
                              (double)((float)$$6 * 0.5F),
                              (double)ayd.a(this.dF() * (float) (Math.PI / 180.0)),
                              (double)(-ayd.b(this.dF() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-ayd.a(this.dF() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F),
                           0.1,
                           (double)(ayd.b(this.dF() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F)
                        );
                     }

                     this.g(this.ds().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$8) {
                     float $$16 = 1.0F + cza.a(this) * $$1;

                     for (bso $$18 : this.dP().a(bso.class, $$0.cK().c(1.0, 0.25, 1.0))) {
                        if ($$18 != this && $$18 != $$0 && !this.s($$18) && (!($$18 instanceof chw) || !((chw)$$18).z()) && this.g((bru)$$18) < 9.0) {
                           $$18.q(0.4F, (double)ayd.a(this.dF() * (float) (Math.PI / 180.0)), (double)(-ayd.b(this.dF() * (float) (Math.PI / 180.0))));
                           $$18.a(this.dQ().a(this), $$16);
                        }
                     }

                     this.dP().a(null, this.du(), this.dw(), this.dA(), avh.uc, this.de(), 1.0F, 1.0F);
                     this.fZ();
                  }

                  if ($$0 instanceof aqn && $$0.U) {
                     ((aqn)$$0).d.b(new aew($$0));
                     $$0.U = false;
                     $$0.g($$14);
                  }

                  if ($$7) {
                     this.dP().a(null, this.du(), this.dw(), this.dA(), avh.tY, this.de(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$7 && !$$8) {
                     if ($$4) {
                        this.dP().a(null, this.du(), this.dw(), this.dA(), avh.ub, this.de(), 1.0F, 1.0F);
                     } else {
                        this.dP().a(null, this.du(), this.dw(), this.dA(), avh.ud, this.de(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.c($$0);
                  }

                  this.A($$0);
                  if ($$0 instanceof bso) {
                     cza.a((bso)$$0, this);
                  }

                  cza.b(this, $$0);
                  cto $$19 = this.eX();
                  cze $$20 = $$19.C();
                  bru $$21 = $$0;
                  if ($$0 instanceof cgy) {
                     $$21 = ((cgy)$$0).b;
                  }

                  if (!this.dP().B && !$$19.e() && $$21 instanceof bso) {
                     $$19.a((bso)$$21, this);
                     if ($$19.e()) {
                        this.a(bpt.a, cto.i);
                     }
                  }

                  cza.a(this, $$0, $$20);
                  if ($$0 instanceof bso) {
                     float $$22 = $$11 - ((bso)$$0).eA();
                     this.a(avr.G, Math.round($$22 * 10.0F));
                     if ($$13 > 0) {
                        $$0.g($$13 * 4);
                     }

                     if (this.dP() instanceof aqm && $$22 > 2.0F) {
                        int $$23 = (int)((double)$$22 * 0.5);
                        ((aqm)this.dP()).a(ky.g, $$0.du(), $$0.e(0.5), $$0.dA(), $$23, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.C(0.1F);
               } else {
                  this.dP().a(null, this.du(), this.dw(), this.dA(), avh.ua, this.de(), 1.0F, 1.0F);
                  if ($$12) {
                     $$0.aC();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(bso $$0) {
      this.e($$0);
   }

   public void fY() {
      this.gx().a(ctr.vs, 100);
      this.fB();
      this.dP().a(this, (byte)30);
   }

   @Override
   public void b(bru $$0) {
   }

   public void c(bru $$0) {
   }

   public void fZ() {
      double $$0 = (double)(-ayd.a(this.dF() * (float) (Math.PI / 180.0)));
      double $$1 = (double)ayd.b(this.dF() * (float) (Math.PI / 180.0));
      if (this.dP() instanceof aqm) {
         ((aqm)this.dP()).a(ky.aj, this.du() + $$0, this.e(0.5), this.dA() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void ga() {
   }

   @Override
   public void a(bru.c $$0) {
      super.a($$0);
      this.cb.b(this);
      if (this.cc != null && this.ge()) {
         this.s();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile gb() {
      return this.cC;
   }

   public clv gc() {
      return this.g;
   }

   public clt gd() {
      return this.cA;
   }

   @Override
   public boolean fP() {
      return this.cA.d;
   }

   public void a(cto $$0, cto $$1, cpb $$2) {
   }

   public boolean ge() {
      return this.cc != this.cb;
   }

   public Either<clw.a, azf> a(io $$0) {
      this.b($$0);
      this.h = 0;
      return Either.right(azf.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fM();
      if (this.dP() instanceof aqm && $$1) {
         ((aqm)this.dP()).e();
      }

      this.h = $$0 ? 0 : 100;
   }

   @Override
   public void fM() {
      this.a(true, true);
   }

   public static Optional<euk> a(aqm $$0, io $$1, float $$2, boolean $$3, boolean $$4) {
      drb $$5 = $$0.a_($$1);
      ddy $$6 = $$5.b();
      if ($$6 instanceof dkg && ($$3 || $$5.c(dkg.d) > 0) && dkg.a($$0)) {
         Optional<euk> $$7 = dkg.a(bsa.by, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dkg.d, Integer.valueOf($$5.c(dkg.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof ddr && ddr.a($$0)) {
         return ddr.a(bsa.by, $$0, $$1, $$5.c(ddr.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         drb $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new euk((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean gf() {
      return this.fL() && this.h >= 100;
   }

   public int gg() {
      return this.h;
   }

   public void a(wx $$0, boolean $$1) {
   }

   public void a(akm $$0) {
      this.b(avr.i.b($$0));
   }

   public void a(akm $$0, int $$1) {
      this.a(avr.i.b($$0), $$1);
   }

   public void b(avo<?> $$0) {
      this.a($$0, 1);
   }

   public void a(avo<?> $$0, int $$1) {
   }

   public void a(avo<?> $$0) {
   }

   public int a(Collection<cxw<?>> $$0) {
      return 0;
   }

   public void a(cxw<?> $$0, List<cto> $$1) {
   }

   public void b(List<akm> $$0) {
   }

   public int b(Collection<cxw<?>> $$0) {
      return 0;
   }

   @Override
   public void fj() {
      super.fj();
      this.a(avr.E);
      if (this.cb()) {
         this.C(0.2F);
      } else {
         this.C(0.05F);
      }
   }

   @Override
   public void a(euk $$0) {
      if (this.cc() && !this.bR()) {
         double $$1 = this.bL().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bo || !this.dP().a_(io.a(this.du(), this.dw() + 1.0 - 0.1, this.dA())).u().c()) {
            euk $$3 = this.ds();
            this.g($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cA.b && !this.bR()) {
         double $$4 = this.ds().d;
         super.a($$0);
         euk $$5 = this.ds();
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
      return (float)this.g(btw.r);
   }

   @Override
   public boolean a(float $$0, float $$1, bqn $$2) {
      if (this.cA.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(avr.t, (int)Math.round((double)$$0 * 100.0));
         }

         if (this.cy && this.cw != null) {
            double $$3 = this.cw.d;
            this.gE();
            return $$3 < this.dw() ? false : super.a((float)($$3 - this.dw()), $$1, $$2);
         } else {
            return super.a($$0, $$1, $$2);
         }
      }
   }

   public boolean gh() {
      if (!this.aE() && !this.fE() && !this.be() && !this.b(bre.y)) {
         cto $$0 = this.a(bsb.e);
         if ($$0.a(ctr.nT) && csk.j($$0)) {
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
   protected void b(io $$0, drb $$1) {
      if (this.be()) {
         this.aT();
         this.b($$1);
      } else {
         io $$2 = this.f($$0);
         if (!$$0.equals($$2)) {
            drb $$3 = this.dP().a_($$2);
            if ($$3.a(avw.bo)) {
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
   public bso.a eL() {
      return new bso.a(avh.uo, avh.ue);
   }

   @Override
   public boolean a(aqm $$0, bso $$1) {
      this.b(avr.g.b($$1.ak()));
      return true;
   }

   @Override
   public void a(drb $$0, euk $$1) {
      if (!this.cA.b) {
         super.a($$0, $$1);
      }

      this.gE();
   }

   public void d(int $$0) {
      this.t($$0);
      this.cr = this.cr + (float)$$0 / (float)this.gl();
      this.cq = ayd.a(this.cq + $$0, 0, Integer.MAX_VALUE);

      while (this.cr < 0.0F) {
         float $$1 = this.cr * (float)this.gl();
         if (this.cp > 0) {
            this.c(-1);
            this.cr = 1.0F + $$1 / (float)this.gl();
         } else {
            this.c(-1);
            this.cr = 0.0F;
         }
      }

      while (this.cr >= 1.0F) {
         this.cr = (this.cr - 1.0F) * (float)this.gl();
         this.c(1);
         this.cr = this.cr / (float)this.gl();
      }
   }

   public int gk() {
      return this.cs;
   }

   @Override
   public void a(cto $$0, int $$1) {
      this.cp -= $$1;
      if (this.cp < 0) {
         this.cp = 0;
         this.cr = 0.0F;
         this.cq = 0;
      }

      this.cs = this.ah.f();
   }

   public void c(int $$0) {
      this.cp += $$0;
      if (this.cp < 0) {
         this.cp = 0;
         this.cr = 0.0F;
         this.cq = 0;
      }

      if ($$0 > 0 && this.cp % 5 == 0 && (float)this.cB < (float)this.ai - 100.0F) {
         float $$1 = this.cp > 30 ? 1.0F : (float)this.cp / 30.0F;
         this.dP().a(null, this.du(), this.dw(), this.dA(), avh.un, this.de(), $$1 * 0.75F, 1.0F);
         this.cB = this.ai;
      }
   }

   public int gl() {
      if (this.cp >= 30) {
         return 112 + (this.cp - 30) * 9;
      } else {
         return this.cp >= 15 ? 37 + (this.cp - 15) * 5 : 7 + this.cp * 2;
      }
   }

   public void C(float $$0) {
      if (!this.cA.a) {
         if (!this.dP().B) {
            this.cd.a($$0);
         }
      }
   }

   public Optional<clc> aa() {
      return Optional.empty();
   }

   public cop gm() {
      return this.cd;
   }

   public boolean t(boolean $$0) {
      return this.cA.a || $$0 || this.cd.c();
   }

   public boolean gn() {
      return this.eA() > 0.0F && this.eA() < this.eR();
   }

   public boolean go() {
      return this.cA.e;
   }

   public boolean a(io $$0, it $$1, cto $$2) {
      if (this.cA.e) {
         return true;
      } else {
         io $$3 = $$0.a($$1.g());
         drf $$4 = new drf(this.dP(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   public int ej() {
      if (!this.dP().aa().b(dat.d) && !this.N_()) {
         int $$0 = this.cp * 7;
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
   protected bru.b bb() {
      return this.cA.b || this.aE() && this.bY() ? bru.b.a : bru.b.d;
   }

   public void y() {
   }

   @Override
   public wx af() {
      return wx.b(this.cC.getName());
   }

   public cqf gp() {
      return this.ca;
   }

   @Override
   public cto a(bsb $$0) {
      if ($$0 == bsb.a) {
         return this.g.f();
      } else if ($$0 == bsb.b) {
         return this.g.j.get(0);
      } else {
         return $$0.a() == bsb.a.b ? this.g.i.get($$0.b()) : cto.i;
      }
   }

   @Override
   protected boolean b(bsb $$0) {
      return $$0.a() == bsb.a.b;
   }

   @Override
   public void a(bsb $$0, cto $$1) {
      this.e($$1);
      if ($$0 == bsb.a) {
         this.a($$0, this.g.h.set(this.g.k, $$1), $$1);
      } else if ($$0 == bsb.b) {
         this.a($$0, this.g.j.set(0, $$1), $$1);
      } else if ($$0.a() == bsb.a.b) {
         this.a($$0, this.g.i.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cto $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<cto> fa() {
      return Lists.newArrayList(new cto[]{this.eX(), this.eY()});
   }

   @Override
   public Iterable<cto> eZ() {
      return this.g.i;
   }

   @Override
   public boolean d(bsb $$0) {
      return $$0 != bsb.g;
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
         bsa.a($$0, this.dP()).ifPresent($$0x -> {
            if ($$0x instanceof btl) {
               ((btl)$$0x).b(this.az);
            }

            $$0x.a_(this.du(), this.dw() + 0.7F, this.dA());
            ((aqm)this.dP()).c($$0x);
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

   public evo gr() {
      return this.dP().L();
   }

   @Override
   public wx O_() {
      xl $$0 = evj.a(this.cj(), this.af());
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

   public boolean a(clx $$0) {
      return (this.ap().a(bW) & $$0.a()) == $$0.a();
   }

   @Override
   public btg a_(int $$0) {
      if ($$0 == 499) {
         return new btg() {
            @Override
            public cto a() {
               return clw.this.cc.g();
            }

            @Override
            public boolean a(cto $$0) {
               clw.this.cc.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new btg() {
               @Override
               public cto a() {
                  return clw.this.cb.q().a($$1);
               }

               @Override
               public boolean a(cto $$0) {
                  clw.this.cb.q().a($$1, $$0);
                  clw.this.cb.a(clw.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.h.size()) {
            return btg.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.ca.b() ? btg.a(this.ca, $$2) : super.a_($$0);
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
   public bsi fu() {
      return this.ao.a(bX) == 0 ? bsi.a : bsi.b;
   }

   public void a(bsi $$0) {
      this.ao.a(bX, (byte)($$0 == bsi.a ? 0 : 1));
   }

   public ud gt() {
      return this.ao.a(bY);
   }

   protected void i(ud $$0) {
      this.ao.a(bY, $$0);
   }

   public ud gu() {
      return this.ao.a(bZ);
   }

   protected void j(ud $$0) {
      this.ao.a(bZ, $$0);
   }

   public float gv() {
      return (float)(1.0 / this.g(btw.e) * 20.0);
   }

   public float D(float $$0) {
      return ayd.a(((float)this.aU + $$0) / this.gv(), 0.0F, 1.0F);
   }

   public void gw() {
      this.aU = 0;
   }

   public ctk gx() {
      return this.cF;
   }

   @Override
   protected float aN() {
      return !this.cA.b && !this.fE() ? super.aN() : 1.0F;
   }

   public float gy() {
      return (float)this.g(btw.o);
   }

   public boolean gz() {
      return this.cA.d && this.F() >= 2;
   }

   @Override
   public boolean f(cto $$0) {
      bsb $$1 = bsq.h($$0);
      return this.a($$1).e();
   }

   @Override
   public brx e(bta $$0) {
      return c.getOrDefault($$0, bV);
   }

   @Override
   public ImmutableList<bta> fI() {
      return ImmutableList.of(bta.a, bta.f, bta.d);
   }

   @Override
   public cto g(cto $$0) {
      if (!($$0.g() instanceof cuh)) {
         return cto.i;
      } else {
         Predicate<cto> $$1 = ((cuh)$$0.g()).d();
         cto $$2 = cuh.a(this, $$1);
         if (!$$2.e()) {
            return $$2;
         } else {
            $$1 = ((cuh)$$0.g()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cto $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cA.d ? new cto(ctr.ov) : cto.i;
         }
      }
   }

   @Override
   public cto a(dax $$0, cto $$1) {
      this.gm().a($$1);
      this.b(avr.c.b($$1.g()));
      $$0.a(null, this.du(), this.dw(), this.dA(), avh.ug, avi.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof aqn) {
         am.A.a((aqn)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(drb $$0) {
      return this.cA.b || super.c($$0);
   }

   @Override
   public euk q(float $$0) {
      double $$1 = 0.22 * (this.fu() == bsi.b ? -1.0 : 1.0);
      float $$2 = ayd.i($$0 * 0.5F, this.dH(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = ayd.i($$0, this.ba, this.aZ) * (float) (Math.PI / 180.0);
      if (this.fE() || this.fr()) {
         euk $$4 = this.f($$0);
         euk $$5 = this.ds();
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

         return this.l($$0).e(new euk($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cd()) {
         return this.l($$0).e(new euk($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cK().c() - 1.0;
         double $$13 = this.ca() ? -0.2 : 0.07;
         return this.l($$0).e(new euk($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dO() {
      return true;
   }

   public boolean gA() {
      return this.fv() && this.fx().a(ctr.qX);
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
      return this.cv;
   }

   @Override
   public void m(float $$0) {
      super.m($$0);
      this.cv = $$0;
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
      return this.g(btw.g);
   }

   public double gD() {
      return this.g(btw.h);
   }

   public boolean b(bru $$0, double $$1) {
      return $$0.dK() ? false : this.a($$0.cK(), $$1);
   }

   public boolean a(euf $$0, double $$1) {
      double $$2 = this.gD() + $$1;
      return $$0.e(this.bx()) < $$2 * $$2;
   }

   public boolean a(io $$0, double $$1) {
      double $$2 = this.gC() + $$1;
      return new euf($$0).e(this.bx()) < $$2 * $$2;
   }

   public void gE() {
      this.cx = null;
      this.cw = null;
      this.cy = false;
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
