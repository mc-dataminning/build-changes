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

public abstract class cfq extends bmo {
   private static final Logger b = LogUtils.getLogger();
   public static final int bB = 16;
   public static final bmi bC = bmi.b;
   public static final int bD = 0;
   public static final int bE = 20;
   public static final int bF = 100;
   public static final int bG = 10;
   public static final int bH = 200;
   public static final float bI = 4.5F;
   public static final float bJ = 3.0F;
   public static final float bK = 1.5F;
   public static final float bL = 0.6F;
   public static final float bM = 0.6F;
   public static final float bN = 1.62F;
   public static final emc bO = new emc(0.0, 0.6, 0.0);
   public static final blz bP = blz.b(0.6F, 1.8F).b(1.62F).a(bly.a().a(blx.b, bO));
   private static final Map<bna, blz> c = ImmutableMap.builder()
      .put(bna.a, bP)
      .put(bna.c, u)
      .put(bna.b, blz.b(0.6F, 0.6F).b(0.4F))
      .put(bna.d, blz.b(0.6F, 0.6F).b(0.4F))
      .put(bna.e, blz.b(0.6F, 0.6F).b(0.4F))
      .put(bna.f, blz.b(0.6F, 1.5F).b(1.27F).a(bly.a().a(blx.b, bO)))
      .put(bna.h, blz.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final agn<Float> d = agq.a(cfq.class, agp.d);
   private static final agn<Integer> e = agq.a(cfq.class, agp.b);
   protected static final agn<Byte> bQ = agq.a(cfq.class, agp.a);
   protected static final agn<Byte> bR = agq.a(cfq.class, agp.a);
   protected static final agn<so> bS = agq.a(cfq.class, agp.s);
   protected static final agn<so> bT = agq.a(cfq.class, agp.s);
   private long f;
   private final cfp cq = new cfp(this);
   protected cjv bU = new cjv();
   public final cjk bV;
   public cij bW;
   protected cif bX = new cif();
   protected int bY;
   public float bZ;
   public float ca;
   public int cb;
   public double cc;
   public double cd;
   public double ce;
   public double cf;
   public double cg;
   public double ch;
   private int cr;
   protected boolean ci;
   private final cfn cs = new cfn();
   public int cj;
   public int ck;
   public float cl;
   protected int cm;
   protected final float cn = 0.02F;
   private int ct;
   private final GameProfile cu;
   private boolean cv;
   private cng cx = cng.f;
   private final cnc cy = this.k();
   private Optional<ig> cz = Optional.empty();
   @Nullable
   public cge co;
   protected float cp;

   public cfq(ctx $$0, hx $$1, float $$2, GameProfile $$3) {
      super(bmc.bw, $$0);
      this.a_($$3.getId());
      this.cu = $$3;
      this.bV = new cjk(this.cq, !$$0.B, this);
      this.bW = this.bV;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bg = 180.0F;
   }

   public boolean a(ctx $$0, hx $$1, ctu $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == ctu.d) {
         return true;
      } else if (this.ge()) {
         return false;
      } else {
         cng $$3 = this.eT();
         return $$3.b() || !$$3.b($$0.I_().d(ke.f), new djt($$0, $$1, false));
      }
   }

   public static bnt.a fH() {
      return bmo.dP().a(bnu.c, 1.0).a(bnu.o, 0.1F).a(bnu.e).a(bnu.l).a(bnu.f, 4.5).a(bnu.g, 3.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, 0.0F);
      this.an.a(e, 0);
      this.an.a(bQ, (byte)0);
      this.an.a(bR, (byte)bC.a());
      this.an.a(bS, new so());
      this.an.a(bT, new so());
   }

   @Override
   public void l() {
      this.af = this.P_();
      if (this.P_()) {
         this.c(false);
      }

      if (this.cb > 0) {
         this.cb--;
      }

      if (this.fD()) {
         this.cr++;
         if (this.cr > 100) {
            this.cr = 100;
         }

         if (!this.dL().B && this.dL().P()) {
            this.a(false, true);
         }
      } else if (this.cr > 0) {
         this.cr++;
         if (this.cr >= 110) {
            this.cr = 0;
         }
      }

      this.fL();
      super.l();
      if (!this.dL().B && this.bW != null && !this.bW.a(this)) {
         this.r();
         this.bW = this.bV;
      }

      this.w();
      if (!this.dL().B) {
         this.bX.a(this);
         this.a(asd.k);
         this.a(asd.l);
         if (this.bx()) {
            this.a(asd.m);
         }

         if (this.bV()) {
            this.a(asd.o);
         }

         if (!this.fD()) {
            this.a(asd.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = aup.a(this.dq(), -2.9999999E7, 2.9999999E7);
      double $$2 = aup.a(this.dw(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dq() || $$2 != this.dw()) {
         this.a_($$1, this.ds(), $$2);
      }

      this.aP++;
      cng $$3 = this.eT();
      if (!cng.a(this.cx, $$3)) {
         if (!cng.b(this.cx, $$3)) {
            this.gm();
         }

         this.cx = $$3.p();
      }

      this.u();
      this.cy.a();
      this.fM();
   }

   @Override
   protected float fg() {
      return this.fu() ? 15.0F : super.fg();
   }

   public boolean fI() {
      return this.bS();
   }

   protected boolean fJ() {
      return this.bS();
   }

   protected boolean fK() {
      return this.bS();
   }

   protected boolean fL() {
      this.ci = this.a(asn.a);
      return this.ci;
   }

   private void u() {
      cng $$0 = this.c(bmd.f);
      if ($$0.a(cnj.on) && !this.a(asn.a)) {
         this.b(new blj(bll.m, 200, 0, false, false, true));
      }
   }

   protected cnc k() {
      return new cnc();
   }

   private void w() {
      this.cc = this.cf;
      this.cd = this.cg;
      this.ce = this.ch;
      double $$0 = this.dq() - this.cf;
      double $$1 = this.ds() - this.cg;
      double $$2 = this.dw() - this.ch;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cf = this.dq();
         this.cc = this.cf;
      }

      if ($$2 > 10.0) {
         this.ch = this.dw();
         this.ce = this.ch;
      }

      if ($$1 > 10.0) {
         this.cg = this.ds();
         this.cd = this.cg;
      }

      if ($$0 < -10.0) {
         this.cf = this.dq();
         this.cc = this.cf;
      }

      if ($$2 < -10.0) {
         this.ch = this.dw();
         this.ce = this.ch;
      }

      if ($$1 < -10.0) {
         this.cg = this.ds();
         this.cd = this.cg;
      }

      this.cf += $$0 * 0.25;
      this.ch += $$2 * 0.25;
      this.cg += $$1 * 0.25;
   }

   protected void fM() {
      if (this.h(bna.d)) {
         bna $$0;
         if (this.fw()) {
            $$0 = bna.b;
         } else if (this.fD()) {
            $$0 = bna.c;
         } else if (this.bZ()) {
            $$0 = bna.d;
         } else if (this.fj()) {
            $$0 = bna.e;
         } else if (this.bS() && !this.cs.b) {
            $$0 = bna.f;
         } else {
            $$0 = bna.a;
         }

         bna $$6;
         if (this.P_() || this.bO() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bna.f)) {
            $$6 = bna.f;
         } else {
            $$6 = bna.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bna $$0) {
      return this.dL().a(this, this.a($$0).a(this.dj()).h(1.0E-7));
   }

   @Override
   public int ax() {
      return Math.max(1, this.dL().Z().c(this.cs.a ? ctt.F : ctt.E));
   }

   @Override
   protected ars aN() {
      return art.tM;
   }

   @Override
   protected ars aO() {
      return art.tK;
   }

   @Override
   protected ars aP() {
      return art.tL;
   }

   @Override
   public int bJ() {
      return 10;
   }

   @Override
   public void a(ars $$0, float $$1, float $$2) {
      this.dL().a(this, this.dq(), this.ds(), this.dw(), $$0, this.db(), $$1, $$2);
   }

   public void a(ars $$0, aru $$1, float $$2, float $$3) {
   }

   @Override
   public aru db() {
      return aru.h;
   }

   @Override
   protected int dc() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.x();
      } else if ($$0 == 23) {
         this.cv = false;
      } else if ($$0 == 22) {
         this.cv = true;
      } else if ($$0 == 43) {
         this.a(jx.f);
      } else {
         super.b($$0);
      }
   }

   private void a(jv $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dL().a($$0, this.d(1.0), this.dt() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   protected void r() {
      this.bW = this.bV;
   }

   @Override
   protected void s() {
   }

   @Override
   public void t() {
      if (!this.dL().B && this.fJ() && this.bO()) {
         this.ac();
         this.f(false);
      } else {
         super.t();
         this.bZ = this.ca;
         this.ca = 0.0F;
      }
   }

   @Override
   protected void fi() {
      super.fi();
      this.eQ();
      this.aW = this.dB();
   }

   @Override
   public void d_() {
      if (this.bY > 0) {
         this.bY--;
      }

      if (this.dL().ak() == bjz.a && this.dL().Z().b(ctt.k)) {
         if (this.ev() < this.eM() && this.ah % 20 == 0) {
            this.b(1.0F);
         }

         if (this.bX.c() && this.ah % 10 == 0) {
            this.bX.a(this.bX.a() + 1);
         }
      }

      this.cq.j();
      this.bZ = this.ca;
      super.d_();
      this.v((float)this.g(bnu.o));
      float $$1;
      if (this.aC() && !this.ew() && !this.bZ()) {
         $$1 = Math.min(0.1F, (float)this.do().h());
      } else {
         $$1 = 0.0F;
      }

      this.ca = this.ca + ($$1 - this.ca) * 0.4F;
      if (this.ev() > 0.0F && !this.P_()) {
         elx $$2;
         if (this.bO() && !this.cZ().dG()) {
            $$2 = this.cH().b(this.cZ().cH()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cH().c(1.0, 0.5, 1.0);
         }

         List<blw> $$4 = this.dL().a_(this, $$2);
         List<blw> $$5 = Lists.newArrayList();

         for (blw $$6 : $$4) {
            if ($$6.ai() == bmc.L) {
               $$5.add($$6);
            } else if (!$$6.dG()) {
               this.c($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.c(ac.a($$5, this.ag));
         }
      }

      this.c(this.gj());
      this.c(this.gk());
      if (!this.dL().B && (this.ab > 0.5F || this.aZ()) || this.cs.b || this.fD() || this.aA) {
         this.gg();
      }
   }

   private void c(@Nullable so $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dL().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bmc.a($$1).filter($$0x -> $$0x == bmc.av).ifPresent($$0x -> {
            if (!bys.a(this.dL(), this)) {
               this.dL().a(null, this.dq(), this.ds(), this.dw(), bys.a(this.dL(), this.dL().z), this.db(), 1.0F, bys.a(this.dL().z));
            }
         });
      }
   }

   private void c(blw $$0) {
      $$0.b_(this);
   }

   public int fN() {
      return this.an.b(e);
   }

   public void r(int $$0) {
      this.an.b(e, $$0);
   }

   public void s(int $$0) {
      int $$1 = this.fN();
      this.an.b(e, $$1 + $$0);
   }

   public void t(int $$0) {
      this.by = $$0;
      if (!this.dL().B) {
         this.gg();
         this.c(4, true);
      }
   }

   @Override
   public void a(bkv $$0) {
      super.a($$0);
      this.ar();
      if (!this.P_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-aup.b((this.eE() + this.dB()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-aup.a((this.eE() + this.dB()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(asd.N);
      this.a(asd.i.b(asd.m));
      this.a(asd.i.b(asd.n));
      this.aA();
      this.a_(false);
      this.a(Optional.of(ig.a(this.dL().ae(), this.dl())));
   }

   @Override
   protected void ey() {
      super.ey();
      if (!this.dL().Z().b(ctt.d)) {
         this.fO();
         this.cq.k();
      }
   }

   protected void fO() {
      for (int $$0 = 0; $$0 < this.cq.b(); $$0++) {
         cng $$1 = this.cq.a($$0);
         if (!$$1.b() && crt.e($$1)) {
            this.cq.b($$0);
         }
      }
   }

   @Override
   protected ars d(bkv $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected ars n_() {
      return art.tC;
   }

   @Nullable
   public ccb a(cng $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public ccb a(cng $$0, boolean $$1, boolean $$2) {
      if ($$0.b()) {
         return null;
      } else {
         if (this.dL().B) {
            this.a(bkb.a);
         }

         double $$3 = this.du() - 0.3F;
         ccb $$4 = new ccb(this.dL(), this.dq(), $$3, this.dw(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.a(this);
         }

         if ($$1) {
            float $$5 = this.ag.i() * 0.5F;
            float $$6 = this.ag.i() * (float) (Math.PI * 2);
            $$4.o((double)(-aup.a($$6) * $$5), 0.2F, (double)(aup.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = aup.a(this.dD() * (float) (Math.PI / 180.0));
            float $$9 = aup.b(this.dD() * (float) (Math.PI / 180.0));
            float $$10 = aup.a(this.dB() * (float) (Math.PI / 180.0));
            float $$11 = aup.b(this.dB() * (float) (Math.PI / 180.0));
            float $$12 = this.ag.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.ag.i();
            $$4.o(
               (double)(-$$10 * $$9 * 0.3F) + Math.cos((double)$$12) * (double)$$13,
               (double)(-$$8 * 0.3F + 0.1F + (this.ag.i() - this.ag.i()) * 0.1F),
               (double)($$11 * $$9 * 0.3F) + Math.sin((double)$$12) * (double)$$13
            );
         }

         return $$4;
      }
   }

   public float d(djp $$0) {
      float $$1 = this.cq.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = crt.g(this);
         cng $$3 = this.eT();
         if ($$2 > 0 && !$$3.b()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (blk.a(this)) {
         $$1 *= 1.0F + (float)(blk.b(this) + 1) * 0.2F;
      }

      if (this.a(bll.d)) {
         $$1 *= switch (this.c(bll.d).d()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      if (this.a(asn.a) && !crt.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aC()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(djp $$0) {
      return !$$0.y() || this.cq.f().b($$0);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.a_(this.cu.getId());
      su $$1 = $$0.c("Inventory", 10);
      this.cq.b($$1);
      this.cq.l = $$0.h("SelectedItemSlot");
      this.cr = $$0.g("SleepTimer");
      this.cl = $$0.j("XpP");
      this.cj = $$0.h("XpLevel");
      this.ck = $$0.h("XpTotal");
      this.cm = $$0.h("XpSeed");
      if (this.cm == 0) {
         this.cm = this.ag.f();
      }

      this.r($$0.h("Score"));
      this.bX.a($$0);
      this.cs.b($$0);
      this.f(bnu.o).a((double)this.cs.b());
      if ($$0.b("EnderItems", 9)) {
         this.bU.a($$0.c("EnderItems", 10));
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(ig.a.parse(tc.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      td.g($$0);
      $$0.a("Inventory", this.cq.a(new su()));
      $$0.a("SelectedItemSlot", this.cq.l);
      $$0.a("SleepTimer", (short)this.cr);
      $$0.a("XpP", this.cl);
      $$0.a("XpLevel", this.cj);
      $$0.a("XpTotal", this.ck);
      $$0.a("XpSeed", this.cm);
      $$0.a("Score", this.fN());
      this.bX.b($$0);
      this.cs.a($$0);
      $$0.a("EnderItems", this.bU.g());
      if (!this.gj().g()) {
         $$0.a("ShoulderEntityLeft", this.gj());
      }

      if (!this.gk().g()) {
         $$0.a("ShoulderEntityRight", this.gk());
      }

      this.gr().flatMap($$0x -> ig.a.encodeStart(tc.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
   }

   @Override
   public boolean b(bkv $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(ask.o)) {
         return !this.dL().Z().b(ctt.G);
      } else if ($$0.a(ask.n)) {
         return !this.dL().Z().b(ctt.H);
      } else if ($$0.a(ask.j)) {
         return !this.dL().Z().b(ctt.I);
      } else {
         return $$0.a(ask.p) ? !this.dL().Z().b(ctt.J) : false;
      }
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cs.a && !$$0.a(ask.e)) {
         return false;
      } else {
         this.bb = 0;
         if (this.ew()) {
            return false;
         } else {
            if (!this.dL().B) {
               this.gg();
            }

            if ($$0.f()) {
               if (this.dL().ak() == bjz.a) {
                  $$1 = 0.0F;
               }

               if (this.dL().ak() == bjz.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dL().ak() == bjz.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bmo $$0) {
      super.d($$0);
      if ($$0.fG()) {
         this.s(true);
      }
   }

   @Override
   public boolean eo() {
      return !this.fT().a && super.eo();
   }

   public boolean a(cfq $$0) {
      eni $$1 = this.cg();
      eni $$2 = $$0.cg();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bkv $$0, float $$1) {
      this.cq.a($$0, $$1, cfp.g);
   }

   @Override
   protected void c(bkv $$0, float $$1) {
      this.cq.a($$0, $$1, cfp.h);
   }

   @Override
   protected void t(float $$0) {
      if (this.bv.a(cnj.vo)) {
         if (!this.dL().B) {
            this.b(asd.c.b(this.bv.d()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + aup.d($$0);
            bkb $$2 = this.fo();
            this.bv.a($$1, this, $$1x -> $$1x.d($$2));
            if (this.bv.b()) {
               if ($$2 == bkb.a) {
                  this.a(bmd.a, cng.f);
               } else {
                  this.a(bmd.b, cng.f);
               }

               this.bv = cng.f;
               this.a(art.vW, 0.8F, 0.8F + this.dL().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bkv $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fk(), 0.0F);
         this.x(this.fk() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(asd.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.z($$0.a());
            this.eK().a($$0, var7);
            this.c(this.ev() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(asd.J, Math.round(var7 * 10.0F));
            }

            this.b(dnz.o);
         }
      }
   }

   @Override
   protected boolean dT() {
      return !this.cs.b && super.dT();
   }

   public boolean Y() {
      return false;
   }

   public void a(dim $$0, boolean $$1) {
   }

   public void a(csy $$0) {
   }

   public void a(dhn $$0) {
   }

   public void a(dir $$0) {
   }

   public void a(did $$0) {
   }

   public void a(cae $$0, bjv $$1) {
   }

   public OptionalInt a(@Nullable bkg $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, csw $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cng $$0, bkb $$1) {
   }

   public bkc a(blw $$0, bkb $$1) {
      if (this.P_()) {
         if ($$0 instanceof bkg) {
            this.a((bkg)$$0);
         }

         return bkc.d;
      } else {
         cng $$2 = this.b($$1);
         cng $$3 = $$2.p();
         bkc $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cs.d && $$2 == this.b($$1) && $$2.L() < $$3.L()) {
               $$2.f($$3.L());
            }

            return $$4;
         } else {
            if (!$$2.b() && $$0 instanceof bmo) {
               if (this.cs.d) {
                  $$2 = $$3;
               }

               bkc $$5 = $$2.a(this, (bmo)$$0, $$1);
               if ($$5.a()) {
                  this.dL().a(dnz.r, $$0.dj(), dnz.a.a(this));
                  if ($$2.b() && !this.cs.d) {
                     this.a($$1, cng.f);
                  }

                  return $$5;
               }
            }

            return bkc.d;
         }
      }
   }

   @Override
   public void bC() {
      super.bC();
      this.J = 0;
   }

   @Override
   protected boolean eY() {
      return super.eY() || this.fD();
   }

   @Override
   public boolean ea() {
      return !this.cs.b;
   }

   @Override
   protected emc a(emc $$0, bmu $$1) {
      if (!this.cs.b && $$0.d <= 0.0 && ($$1 == bmu.a || $$1 == bmu.b) && this.fK() && this.A()) {
         double $$2 = $$0.c;
         double $$3 = $$0.e;
         double $$4 = 0.05;

         while ($$2 != 0.0 && this.dL().a(this, this.cH().d($$2, (double)(-this.dF()), 0.0))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }
         }

         while ($$3 != 0.0 && this.dL().a(this, this.cH().d(0.0, (double)(-this.dF()), $$3))) {
            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         while ($$2 != 0.0 && $$3 != 0.0 && this.dL().a(this, this.cH().d($$2, (double)(-this.dF()), $$3))) {
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

         $$0 = new emc($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean A() {
      return this.aC() || this.ab < this.dF() && !this.dL().a(this, this.cH().d(0.0, (double)(this.ab - this.dF()), 0.0));
   }

   public void d(blw $$0) {
      if ($$0.cq()) {
         if (!$$0.t(this)) {
            float $$1 = (float)this.g(bnu.c);
            float $$2;
            if ($$0 instanceof bmo) {
               $$2 = crt.a(this.eT(), ((bmo)$$0).eS());
            } else {
               $$2 = crt.a(this.eT(), bmt.a);
            }

            float $$4 = this.A(0.5F);
            $$1 *= 0.2F + $$4 * $$4 * 0.8F;
            $$2 *= $$4;
            this.gm();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$5 = $$4 > 0.9F;
               boolean $$6 = false;
               int $$7 = 0;
               $$7 += crt.c(this);
               if (this.bY() && $$5) {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), art.tu, this.db(), 1.0F, 1.0F);
                  $$7++;
                  $$6 = true;
               }

               boolean $$8 = $$5 && this.ab > 0.0F && !this.aC() && !this.e_() && !this.aZ() && !this.a(bll.o) && !this.bO() && $$0 instanceof bmo;
               $$8 = $$8 && !this.bY();
               if ($$8) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$9 = false;
               double $$10 = (double)(this.Y - this.X);
               if ($$5 && !$$8 && !$$6 && this.aC() && $$10 < (double)this.ff()) {
                  cng $$11 = this.b(bkb.a);
                  if ($$11.d() instanceof cos) {
                     $$9 = true;
                  }
               }

               float $$12 = 0.0F;
               boolean $$13 = false;
               int $$14 = crt.d(this);
               if ($$0 instanceof bmo) {
                  $$12 = ((bmo)$$0).ev();
                  if ($$14 > 0 && !$$0.bN()) {
                     $$13 = true;
                     $$0.g(1);
                  }
               }

               emc $$15 = $$0.do();
               boolean $$16 = $$0.a(this.dM().a(this), $$1);
               if ($$16) {
                  if ($$7 > 0) {
                     if ($$0 instanceof bmo) {
                        ((bmo)$$0)
                           .q(
                              (double)((float)$$7 * 0.5F),
                              (double)aup.a(this.dB() * (float) (Math.PI / 180.0)),
                              (double)(-aup.b(this.dB() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-aup.a(this.dB() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F),
                           0.1,
                           (double)(aup.b(this.dB() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F)
                        );
                     }

                     this.g(this.do().d(0.6, 1.0, 0.6));
                     this.g(false);
                  }

                  if ($$9) {
                     float $$17 = 1.0F + crt.a(this) * $$1;

                     for (bmo $$19 : this.dL().a(bmo.class, $$0.cH().c(1.0, 0.25, 1.0))) {
                        if ($$19 != this && $$19 != $$0 && !this.r($$19) && (!($$19 instanceof cbr) || !((cbr)$$19).B()) && this.f($$19) < 9.0) {
                           $$19.q(0.4F, (double)aup.a(this.dB() * (float) (Math.PI / 180.0)), (double)(-aup.b(this.dB() * (float) (Math.PI / 180.0))));
                           $$19.a(this.dM().a(this), $$17);
                        }
                     }

                     this.dL().a(null, this.dq(), this.ds(), this.dw(), art.tx, this.db(), 1.0F, 1.0F);
                     this.fP();
                  }

                  if ($$0 instanceof anf && $$0.T) {
                     ((anf)$$0).c.b(new acf($$0));
                     $$0.T = false;
                     $$0.g($$15);
                  }

                  if ($$8) {
                     this.dL().a(null, this.dq(), this.ds(), this.dw(), art.tt, this.db(), 1.0F, 1.0F);
                     this.a($$0);
                  }

                  if (!$$8 && !$$9) {
                     if ($$5) {
                        this.dL().a(null, this.dq(), this.ds(), this.dw(), art.tw, this.db(), 1.0F, 1.0F);
                     } else {
                        this.dL().a(null, this.dq(), this.ds(), this.dw(), art.ty, this.db(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.b($$0);
                  }

                  this.z($$0);
                  if ($$0 instanceof bmo) {
                     crt.a((bmo)$$0, this);
                  }

                  crt.b(this, $$0);
                  cng $$20 = this.eT();
                  blw $$21 = $$0;
                  if ($$0 instanceof cat) {
                     $$21 = ((cat)$$0).b;
                  }

                  if (!this.dL().B && !$$20.b() && $$21 instanceof bmo) {
                     $$20.a((bmo)$$21, this);
                     if ($$20.b()) {
                        this.a(bkb.a, cng.f);
                     }
                  }

                  if ($$0 instanceof bmo) {
                     float $$22 = $$12 - ((bmo)$$0).ev();
                     this.a(asd.G, Math.round($$22 * 10.0F));
                     if ($$14 > 0) {
                        $$0.g($$14 * 4);
                     }

                     if (this.dL() instanceof ane && $$22 > 2.0F) {
                        int $$23 = (int)((double)$$22 * 0.5);
                        ((ane)this.dL()).a(jx.h, $$0.dq(), $$0.e(0.5), $$0.dw(), $$23, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.z(0.1F);
               } else {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), art.tv, this.db(), 1.0F, 1.0F);
                  if ($$13) {
                     $$0.aA();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(bmo $$0) {
      this.d((blw)$$0);
   }

   public void s(boolean $$0) {
      float $$1 = 0.25F + (float)crt.g(this) * 0.05F;
      if ($$0) {
         $$1 += 0.75F;
      }

      if (this.ag.i() < $$1) {
         this.gn().a(cnj.vo, 100);
         this.ft();
         this.dL().a(this, (byte)30);
      }
   }

   @Override
   public void a(blw $$0) {
   }

   public void b(blw $$0) {
   }

   public void fP() {
      double $$0 = (double)(-aup.a(this.dB() * (float) (Math.PI / 180.0)));
      double $$1 = (double)aup.b(this.dB() * (float) (Math.PI / 180.0));
      if (this.dL() instanceof ane) {
         ((ane)this.dL()).a(jx.ag, this.dq() + $$0, this.e(0.5), this.dw() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fQ() {
   }

   @Override
   public void a(blw.c $$0) {
      super.a($$0);
      this.bV.b(this);
      if (this.bW != null && this.fU()) {
         this.s();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile fR() {
      return this.cu;
   }

   public cfp fS() {
      return this.cq;
   }

   public cfn fT() {
      return this.cs;
   }

   public void a(cng $$0, cng $$1, cir $$2) {
   }

   public boolean fU() {
      return this.bW != this.bV;
   }

   public Either<cfq.a, avt> a(hx $$0) {
      this.b($$0);
      this.cr = 0;
      return Either.right(avt.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fE();
      if (this.dL() instanceof ane && $$1) {
         ((ane)this.dL()).e();
      }

      this.cr = $$0 ? 0 : 100;
   }

   @Override
   public void fE() {
      this.a(true, true);
   }

   public static Optional<emc> a(ane $$0, hx $$1, float $$2, boolean $$3, boolean $$4) {
      djp $$5 = $$0.a_($$1);
      cwy $$6 = $$5.b();
      if ($$6 instanceof ddf && ($$3 || $$5.c(ddf.d) > 0) && ddf.a($$0)) {
         Optional<emc> $$7 = ddf.a(bmc.bw, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(ddf.d, Integer.valueOf($$5.c(ddf.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof cwr && cwr.a($$0)) {
         return cwr.a(bmc.bw, $$0, $$1, $$5.c(cwr.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         djp $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new emc((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean fV() {
      return this.fD() && this.cr >= 100;
   }

   public int fW() {
      return this.cr;
   }

   public void a(vg $$0, boolean $$1) {
   }

   public void a(ahh $$0) {
      this.b(asd.i.b($$0));
   }

   public void a(ahh $$0, int $$1) {
      this.a(asd.i.b($$0), $$1);
   }

   public void b(asa<?> $$0) {
      this.a($$0, 1);
   }

   public void a(asa<?> $$0, int $$1) {
   }

   public void a(asa<?> $$0) {
   }

   public int a(Collection<cqm<?>> $$0) {
      return 0;
   }

   public void a(cqm<?> $$0, List<cng> $$1) {
   }

   public void a(List<ahh> $$0) {
   }

   public int b(Collection<cqm<?>> $$0) {
      return 0;
   }

   @Override
   public void fb() {
      super.fb();
      this.a(asd.E);
      if (this.bY()) {
         this.z(0.2F);
      } else {
         this.z(0.05F);
      }
   }

   @Override
   public void a(emc $$0) {
      if (this.bZ() && !this.bO()) {
         double $$1 = this.bF().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bj || !this.dL().a_(hx.a(this.dq(), this.ds() + 1.0 - 0.1, this.dw())).u().c()) {
            emc $$3 = this.do();
            this.g($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cs.b && !this.bO()) {
         double $$4 = this.do().d;
         super.a($$0);
         emc $$5 = this.do();
         this.o($$5.c, $$4 * 0.6, $$5.e);
         this.n();
         this.b(7, false);
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bf() {
      if (this.cs.b) {
         this.h(false);
      } else {
         super.bf();
      }
   }

   protected boolean i(hx $$0) {
      return !this.dL().a_($$0).o(this.dL(), $$0);
   }

   @Override
   public float ff() {
      return (float)this.g(bnu.o);
   }

   @Override
   public boolean a(float $$0, float $$1, bkv $$2) {
      if (this.cs.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(asd.t, (int)Math.round((double)$$0 * 100.0));
         }

         return super.a($$0, $$1, $$2);
      }
   }

   public boolean fX() {
      if (!this.aC() && !this.fw() && !this.aZ() && !this.a(bll.y)) {
         cng $$0 = this.c(bmd.e);
         if ($$0.a(cnj.nS) && cmb.d($$0)) {
            this.fY();
            return true;
         }
      }

      return false;
   }

   public void fY() {
      this.b(7, true);
   }

   public void fZ() {
      this.b(7, true);
      this.b(7, false);
   }

   @Override
   protected void bi() {
      if (!this.P_()) {
         super.bi();
      }
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      if (this.aZ()) {
         this.aR();
         this.b($$1);
      } else {
         hx $$2 = this.f($$0);
         if (!$$0.equals($$2)) {
            djp $$3 = this.dL().a_($$2);
            if ($$3.a(asi.bn)) {
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
   public bmo.a eG() {
      return new bmo.a(art.tJ, art.tz);
   }

   @Override
   public boolean a(ane $$0, bmo $$1) {
      this.b(asd.g.b($$1.ai()));
      return true;
   }

   @Override
   public void a(djp $$0, emc $$1) {
      if (!this.cs.b) {
         super.a($$0, $$1);
      }
   }

   public void d(int $$0) {
      this.s($$0);
      this.cl = this.cl + (float)$$0 / (float)this.gb();
      this.ck = aup.a(this.ck + $$0, 0, Integer.MAX_VALUE);

      while (this.cl < 0.0F) {
         float $$1 = this.cl * (float)this.gb();
         if (this.cj > 0) {
            this.c(-1);
            this.cl = 1.0F + $$1 / (float)this.gb();
         } else {
            this.c(-1);
            this.cl = 0.0F;
         }
      }

      while (this.cl >= 1.0F) {
         this.cl = (this.cl - 1.0F) * (float)this.gb();
         this.c(1);
         this.cl = this.cl / (float)this.gb();
      }
   }

   public int ga() {
      return this.cm;
   }

   @Override
   public void a(cng $$0, int $$1) {
      this.cj -= $$1;
      if (this.cj < 0) {
         this.cj = 0;
         this.cl = 0.0F;
         this.ck = 0;
      }

      this.cm = this.ag.f();
   }

   public void c(int $$0) {
      this.cj += $$0;
      if (this.cj < 0) {
         this.cj = 0;
         this.cl = 0.0F;
         this.ck = 0;
      }

      if ($$0 > 0 && this.cj % 5 == 0 && (float)this.ct < (float)this.ah - 100.0F) {
         float $$1 = this.cj > 30 ? 1.0F : (float)this.cj / 30.0F;
         this.dL().a(null, this.dq(), this.ds(), this.dw(), art.tI, this.db(), $$1 * 0.75F, 1.0F);
         this.ct = this.ah;
      }
   }

   public int gb() {
      if (this.cj >= 30) {
         return 112 + (this.cj - 30) * 9;
      } else {
         return this.cj >= 15 ? 37 + (this.cj - 15) * 5 : 7 + this.cj * 2;
      }
   }

   public void z(float $$0) {
      if (!this.cs.a) {
         if (!this.dL().B) {
            this.bX.a($$0);
         }
      }
   }

   public Optional<cew> aa() {
      return Optional.empty();
   }

   public cif gc() {
      return this.bX;
   }

   public boolean t(boolean $$0) {
      return this.cs.a || $$0 || this.bX.c();
   }

   public boolean gd() {
      return this.ev() > 0.0F && this.ev() < this.eM();
   }

   public boolean ge() {
      return this.cs.e;
   }

   public boolean a(hx $$0, ic $$1, cng $$2) {
      if (this.cs.e) {
         return true;
      } else {
         hx $$3 = $$0.a($$1.g());
         djt $$4 = new djt(this.dL(), $$3, false);
         return $$2.a(this.dL().I_().d(ke.f), $$4);
      }
   }

   @Override
   public int ee() {
      if (!this.dL().Z().b(ctt.d) && !this.P_()) {
         int $$0 = this.cj * 7;
         return $$0 > 100 ? 100 : $$0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean ef() {
      return true;
   }

   @Override
   public boolean cC() {
      return true;
   }

   @Override
   protected blw.b aW() {
      return this.cs.b || this.aC() && this.bV() ? blw.b.a : blw.b.d;
   }

   @Override
   public void y() {
   }

   @Override
   public vg ad() {
      return vg.b(this.cu.getName());
   }

   public cjv gf() {
      return this.bU;
   }

   @Override
   public cng c(bmd $$0) {
      if ($$0 == bmd.a) {
         return this.cq.f();
      } else if ($$0 == bmd.b) {
         return this.cq.k.get(0);
      } else {
         return $$0.a() == bmd.a.b ? this.cq.j.get($$0.b()) : cng.f;
      }
   }

   @Override
   protected boolean a(bmd $$0) {
      return $$0.a() == bmd.a.b;
   }

   @Override
   public void a(bmd $$0, cng $$1) {
      this.e($$1);
      if ($$0 == bmd.a) {
         this.a($$0, this.cq.i.set(this.cq.l, $$1), $$1);
      } else if ($$0 == bmd.b) {
         this.a($$0, this.cq.k.set(0, $$1), $$1);
      } else if ($$0.a() == bmd.a.b) {
         this.a($$0, this.cq.j.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cng $$0) {
      return this.cq.e($$0);
   }

   @Override
   public Iterable<cng> bK() {
      return Lists.newArrayList(new cng[]{this.eT(), this.eU()});
   }

   @Override
   public Iterable<cng> bL() {
      return this.cq.j;
   }

   public boolean h(so $$0) {
      if (this.bO() || !this.aC() || this.aZ() || this.aA) {
         return false;
      } else if (this.gj().g()) {
         this.i($$0);
         this.f = this.dL().X();
         return true;
      } else if (this.gk().g()) {
         this.j($$0);
         this.f = this.dL().X();
         return true;
      } else {
         return false;
      }
   }

   protected void gg() {
      if (this.f + 20L < this.dL().X()) {
         this.k(this.gj());
         this.i(new so());
         this.k(this.gk());
         this.j(new so());
      }
   }

   private void k(so $$0) {
      if (!this.dL().B && !$$0.g()) {
         bmc.a($$0, this.dL()).ifPresent($$0x -> {
            if ($$0x instanceof bnj) {
               ((bnj)$$0x).b(this.ay);
            }

            $$0x.a_(this.dq(), this.ds() + 0.7F, this.dw());
            ((ane)this.dL()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean P_();

   @Override
   public boolean bs() {
      return !this.P_() && super.bs();
   }

   @Override
   public boolean bZ() {
      return !this.cs.b && !this.P_() && super.bZ();
   }

   public abstract boolean f();

   @Override
   public boolean cz() {
      return !this.cs.b;
   }

   public eng gh() {
      return this.dL().K();
   }

   @Override
   public vg Q_() {
      vu $$0 = enb.a(this.cg(), this.ad());
      return this.a($$0);
   }

   private vu a(vu $$0) {
      String $$1 = this.fR().getName();
      return $$0.a($$1x -> $$1x.a(new ve(ve.a.d, "/tell " + $$1 + " ")).a(this.cG()).a($$1));
   }

   @Override
   public String cy() {
      return this.fR().getName();
   }

   @Override
   protected void y(float $$0) {
      this.an().b(d, $$0);
   }

   @Override
   public float fk() {
      return this.an().b(d);
   }

   public boolean a(cfr $$0) {
      return (this.an().b(bQ) & $$0.a()) == $$0.a();
   }

   @Override
   public bng a_(int $$0) {
      if ($$0 >= 0 && $$0 < this.cq.i.size()) {
         return bng.a(this.cq, $$0);
      } else {
         int $$1 = $$0 - 200;
         return $$1 >= 0 && $$1 < this.bU.b() ? bng.a(this.bU, $$1) : super.a_($$0);
      }
   }

   public boolean gi() {
      return this.cv;
   }

   public void u(boolean $$0) {
      this.cv = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.cs.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bmi fm() {
      return this.an.b(bR) == 0 ? bmi.a : bmi.b;
   }

   public void a(bmi $$0) {
      this.an.b(bR, (byte)($$0 == bmi.a ? 0 : 1));
   }

   public so gj() {
      return this.an.b(bS);
   }

   protected void i(so $$0) {
      this.an.b(bS, $$0);
   }

   public so gk() {
      return this.an.b(bT);
   }

   protected void j(so $$0) {
      this.an.b(bT, $$0);
   }

   public float gl() {
      return (float)(1.0 / this.g(bnu.e) * 20.0);
   }

   public float A(float $$0) {
      return aup.a(((float)this.aP + $$0) / this.gl(), 0.0F, 1.0F);
   }

   public void gm() {
      this.aP = 0;
   }

   public cnc gn() {
      return this.cy;
   }

   @Override
   protected float aL() {
      return !this.cs.b && !this.fw() ? super.aL() : 1.0F;
   }

   public float go() {
      return (float)this.g(bnu.l);
   }

   public boolean gp() {
      return this.cs.d && this.F() >= 2;
   }

   @Override
   public boolean f(cng $$0) {
      bmd $$1 = bmq.h($$0);
      return this.c($$1).b();
   }

   @Override
   public blz e(bna $$0) {
      return c.getOrDefault($$0, bP);
   }

   @Override
   public ImmutableList<bna> fA() {
      return ImmutableList.of(bna.a, bna.f, bna.d);
   }

   @Override
   public cng g(cng $$0) {
      if (!($$0.d() instanceof cnw)) {
         return cng.f;
      } else {
         Predicate<cng> $$1 = ((cnw)$$0.d()).e();
         cng $$2 = cnw.a(this, $$1);
         if (!$$2.b()) {
            return $$2;
         } else {
            $$1 = ((cnw)$$0.d()).b();

            for (int $$3 = 0; $$3 < this.cq.b(); $$3++) {
               cng $$4 = this.cq.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cs.d ? new cng(cnj.ou) : cng.f;
         }
      }
   }

   @Override
   public cng a(ctx $$0, cng $$1) {
      this.gc().a($$1.d(), $$1);
      this.b(asd.c.b($$1.d()));
      $$0.a(null, this.dq(), this.ds(), this.dw(), art.tB, aru.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof anf) {
         am.A.a((anf)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(djp $$0) {
      return this.cs.b || super.c($$0);
   }

   @Override
   public emc q(float $$0) {
      double $$1 = 0.22 * (this.fm() == bmi.b ? -1.0 : 1.0);
      float $$2 = aup.i($$0 * 0.5F, this.dD(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = aup.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      if (this.fw() || this.fj()) {
         emc $$4 = this.f($$0);
         emc $$5 = this.do();
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

         return this.l($$0).e(new emc($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.ca()) {
         return this.l($$0).e(new emc($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cH().c() - 1.0;
         double $$13 = this.bX() ? -0.2 : 0.07;
         return this.l($$0).e(new emc($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dK() {
      return true;
   }

   public boolean gq() {
      return this.fn() && this.fp().a(cnj.qW);
   }

   @Override
   public boolean dJ() {
      return false;
   }

   public Optional<ig> gr() {
      return this.cz;
   }

   public void a(Optional<ig> $$0) {
      this.cz = $$0;
   }

   @Override
   public float eE() {
      return this.cp;
   }

   @Override
   public void m(float $$0) {
      super.m($$0);
      this.cp = $$0;
   }

   @Override
   public boolean dE() {
      return true;
   }

   @Override
   protected float fe() {
      if (this.cs.b && !this.bO()) {
         return this.bY() ? this.cs.a() * 2.0F : this.cs.a();
      } else {
         return this.bY() ? 0.025999999F : 0.02F;
      }
   }

   public static boolean c(String $$0) {
      return $$0.length() > 16 ? false : $$0.chars().filter($$0x -> $$0x <= 32 || $$0x >= 127).findAny().isEmpty();
   }

   public double gs() {
      return this.g(bnu.f);
   }

   public double gt() {
      return this.g(bnu.g);
   }

   public static enum a {
      a,
      b(vg.c("block.minecraft.bed.no_sleep")),
      c(vg.c("block.minecraft.bed.too_far_away")),
      d(vg.c("block.minecraft.bed.obstructed")),
      e,
      f(vg.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final vg g;

      private a() {
         this.g = null;
      }

      private a(vg $$0) {
         this.g = $$0;
      }

      @Nullable
      public vg a() {
         return this.g;
      }
   }
}
