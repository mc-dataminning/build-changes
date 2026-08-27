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

public abstract class cfb extends bmf {
   private static final Logger b = LogUtils.getLogger();
   public static final int bA = 16;
   public static final blz bB = blz.b;
   public static final int bC = 0;
   public static final int bD = 20;
   public static final int bE = 100;
   public static final int bF = 10;
   public static final int bG = 200;
   public static final float bH = 1.5F;
   public static final float bI = 0.6F;
   public static final float bJ = 0.6F;
   public static final float bK = 1.62F;
   public static final blq bL = blq.b(0.6F, 1.8F);
   private static final Map<bmr, blq> c = ImmutableMap.builder()
      .put(bmr.a, bL)
      .put(bmr.c, v)
      .put(bmr.b, blq.b(0.6F, 0.6F))
      .put(bmr.d, blq.b(0.6F, 0.6F))
      .put(bmr.e, blq.b(0.6F, 0.6F))
      .put(bmr.f, blq.b(0.6F, 1.5F))
      .put(bmr.h, blq.c(0.2F, 0.2F))
      .build();
   private static final agj<Float> d = agm.a(cfb.class, agl.d);
   private static final agj<Integer> e = agm.a(cfb.class, agl.b);
   protected static final agj<Byte> bM = agm.a(cfb.class, agl.a);
   protected static final agj<Byte> bN = agm.a(cfb.class, agl.a);
   protected static final agj<sl> bO = agm.a(cfb.class, agl.s);
   protected static final agj<sl> bP = agm.a(cfb.class, agl.s);
   private long f;
   private final cfa cm = new cfa(this);
   protected cjg bQ = new cjg();
   public final civ bR;
   public chu bS;
   protected chq bT = new chq();
   protected int bU;
   public float bV;
   public float bW;
   public int bX;
   public double bY;
   public double bZ;
   public double ca;
   public double cb;
   public double cc;
   public double cd;
   private int cn;
   protected boolean ce;
   private final cey co = new cey();
   public int cf;
   public int cg;
   public float ch;
   protected int ci;
   protected final float cj = 0.02F;
   private int cp;
   private final GameProfile cq;
   private boolean cr;
   private cmr cs = cmr.f;
   private final cmn ct = this.k();
   private Optional<ig> cu = Optional.empty();
   @Nullable
   public cfp ck;
   protected float cl;

   public cfb(cti $$0, hx $$1, float $$2, GameProfile $$3) {
      super(blt.bv, $$0);
      this.a_($$3.getId());
      this.cq = $$3;
      this.bR = new civ(this.cm, !$$0.B, this);
      this.bS = this.bR;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bg = 180.0F;
   }

   public boolean a(cti $$0, hx $$1, ctf $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == ctf.d) {
         return true;
      } else if (this.ge()) {
         return false;
      } else {
         cmr $$3 = this.eT();
         return $$3.b() || !$$3.b($$0.I_().d(ke.f), new dje($$0, $$1, false));
      }
   }

   public static bnk.a fH() {
      return bmf.dQ().a(bnl.c, 1.0).a(bnl.m, 0.1F).a(bnl.e).a(bnl.j);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, 0.0F);
      this.an.a(e, 0);
      this.an.a(bM, (byte)0);
      this.an.a(bN, (byte)bB.a());
      this.an.a(bO, new sl());
      this.an.a(bP, new sl());
   }

   @Override
   public void l() {
      this.af = this.P_();
      if (this.P_()) {
         this.c(false);
      }

      if (this.bX > 0) {
         this.bX--;
      }

      if (this.fD()) {
         this.cn++;
         if (this.cn > 100) {
            this.cn = 100;
         }

         if (!this.dM().B && this.dM().P()) {
            this.a(false, true);
         }
      } else if (this.cn > 0) {
         this.cn++;
         if (this.cn >= 110) {
            this.cn = 0;
         }
      }

      this.fL();
      super.l();
      if (!this.dM().B && this.bS != null && !this.bS.a(this)) {
         this.r();
         this.bS = this.bR;
      }

      this.w();
      if (!this.dM().B) {
         this.bT.a(this);
         this.a(arw.k);
         this.a(arw.l);
         if (this.bx()) {
            this.a(arw.m);
         }

         if (this.bV()) {
            this.a(arw.o);
         }

         if (!this.fD()) {
            this.a(arw.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = aui.a(this.dr(), -2.9999999E7, 2.9999999E7);
      double $$2 = aui.a(this.dx(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dr() || $$2 != this.dx()) {
         this.a_($$1, this.dt(), $$2);
      }

      this.aP++;
      cmr $$3 = this.eT();
      if (!cmr.a(this.cs, $$3)) {
         if (!cmr.b(this.cs, $$3)) {
            this.gm();
         }

         this.cs = $$3.p();
      }

      this.u();
      this.ct.a();
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
      this.ce = this.a(asg.a);
      return this.ce;
   }

   private void u() {
      cmr $$0 = this.c(blu.f);
      if ($$0.a(cmu.on) && !this.a(asg.a)) {
         this.b(new blc(ble.m, 200, 0, false, false, true));
      }
   }

   protected cmn k() {
      return new cmn();
   }

   private void w() {
      this.bY = this.cb;
      this.bZ = this.cc;
      this.ca = this.cd;
      double $$0 = this.dr() - this.cb;
      double $$1 = this.dt() - this.cc;
      double $$2 = this.dx() - this.cd;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cb = this.dr();
         this.bY = this.cb;
      }

      if ($$2 > 10.0) {
         this.cd = this.dx();
         this.ca = this.cd;
      }

      if ($$1 > 10.0) {
         this.cc = this.dt();
         this.bZ = this.cc;
      }

      if ($$0 < -10.0) {
         this.cb = this.dr();
         this.bY = this.cb;
      }

      if ($$2 < -10.0) {
         this.cd = this.dx();
         this.ca = this.cd;
      }

      if ($$1 < -10.0) {
         this.cc = this.dt();
         this.bZ = this.cc;
      }

      this.cb += $$0 * 0.25;
      this.cd += $$2 * 0.25;
      this.cc += $$1 * 0.25;
   }

   protected void fM() {
      if (this.g(bmr.d)) {
         bmr $$0;
         if (this.fw()) {
            $$0 = bmr.b;
         } else if (this.fD()) {
            $$0 = bmr.c;
         } else if (this.bZ()) {
            $$0 = bmr.d;
         } else if (this.fj()) {
            $$0 = bmr.e;
         } else if (this.bS() && !this.co.b) {
            $$0 = bmr.f;
         } else {
            $$0 = bmr.a;
         }

         bmr $$6;
         if (this.P_() || this.bO() || this.g($$0)) {
            $$6 = $$0;
         } else if (this.g(bmr.f)) {
            $$6 = bmr.f;
         } else {
            $$6 = bmr.d;
         }

         this.b($$6);
      }
   }

   protected boolean g(bmr $$0) {
      return this.dM().a(this, this.a($$0).a(this.dk()).h(1.0E-7));
   }

   @Override
   public int ax() {
      return Math.max(1, this.dM().Z().c(this.co.a ? cte.F : cte.E));
   }

   @Override
   protected arl aN() {
      return arm.tx;
   }

   @Override
   protected arl aO() {
      return arm.tv;
   }

   @Override
   protected arl aP() {
      return arm.tw;
   }

   @Override
   public int bJ() {
      return 10;
   }

   @Override
   public void a(arl $$0, float $$1, float $$2) {
      this.dM().a(this, this.dr(), this.dt(), this.dx(), $$0, this.db(), $$1, $$2);
   }

   public void a(arl $$0, arn $$1, float $$2, float $$3) {
   }

   @Override
   public arn db() {
      return arn.h;
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
         this.cr = false;
      } else if ($$0 == 22) {
         this.cr = true;
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
         this.dM().a($$0, this.d(1.0), this.du() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   protected void r() {
      this.bS = this.bR;
   }

   @Override
   protected void s() {
   }

   @Override
   public void t() {
      if (!this.dM().B && this.fJ() && this.bO()) {
         this.ac();
         this.f(false);
      } else {
         super.t();
         this.bV = this.bW;
         this.bW = 0.0F;
      }
   }

   @Override
   protected void fi() {
      super.fi();
      this.eQ();
      this.aW = this.dC();
   }

   @Override
   public void d_() {
      if (this.bU > 0) {
         this.bU--;
      }

      if (this.dM().ak() == bjs.a && this.dM().Z().b(cte.k)) {
         if (this.ev() < this.eM() && this.ah % 20 == 0) {
            this.b(1.0F);
         }

         if (this.bT.c() && this.ah % 10 == 0) {
            this.bT.a(this.bT.a() + 1);
         }
      }

      this.cm.j();
      this.bV = this.bW;
      super.d_();
      this.w((float)this.b(bnl.m));
      float $$1;
      if (this.aC() && !this.ew() && !this.bZ()) {
         $$1 = Math.min(0.1F, (float)this.dp().h());
      } else {
         $$1 = 0.0F;
      }

      this.bW = this.bW + ($$1 - this.bW) * 0.4F;
      if (this.ev() > 0.0F && !this.P_()) {
         elh $$2;
         if (this.bO() && !this.cZ().dH()) {
            $$2 = this.cH().b(this.cZ().cH()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cH().c(1.0, 0.5, 1.0);
         }

         List<blp> $$4 = this.dM().a_(this, $$2);
         List<blp> $$5 = Lists.newArrayList();

         for (blp $$6 : $$4) {
            if ($$6.ai() == blt.K) {
               $$5.add($$6);
            } else if (!$$6.dH()) {
               this.c($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.c(ac.a($$5, this.ag));
         }
      }

      this.c(this.gj());
      this.c(this.gk());
      if (!this.dM().B && (this.ab > 0.5F || this.aZ()) || this.co.b || this.fD() || this.aA) {
         this.gg();
      }
   }

   private void c(@Nullable sl $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dM().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         blt.a($$1).filter($$0x -> $$0x == blt.au).ifPresent($$0x -> {
            if (!byi.a(this.dM(), this)) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), byi.a(this.dM(), this.dM().z), this.db(), 1.0F, byi.a(this.dM().z));
            }
         });
      }
   }

   private void c(blp $$0) {
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
      if (!this.dM().B) {
         this.gg();
         this.c(4, true);
      }
   }

   @Override
   public void a(bkn $$0) {
      super.a($$0);
      this.ar();
      if (!this.P_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-aui.b((this.eE() + this.dC()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-aui.a((this.eE() + this.dC()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(arw.N);
      this.a(arw.i.b(arw.m));
      this.a(arw.i.b(arw.n));
      this.aA();
      this.a_(false);
      this.a(Optional.of(ig.a(this.dM().ae(), this.dm())));
   }

   @Override
   protected void ey() {
      super.ey();
      if (!this.dM().Z().b(cte.d)) {
         this.fO();
         this.cm.k();
      }
   }

   protected void fO() {
      for (int $$0 = 0; $$0 < this.cm.b(); $$0++) {
         cmr $$1 = this.cm.a($$0);
         if (!$$1.b() && cre.e($$1)) {
            this.cm.b($$0);
         }
      }
   }

   @Override
   protected arl d(bkn $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected arl n_() {
      return arm.tn;
   }

   @Nullable
   public cbo a(cmr $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cbo a(cmr $$0, boolean $$1, boolean $$2) {
      if ($$0.b()) {
         return null;
      } else {
         if (this.dM().B) {
            this.a(bju.a);
         }

         double $$3 = this.dv() - 0.3F;
         cbo $$4 = new cbo(this.dM(), this.dr(), $$3, this.dx(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.a(this);
         }

         if ($$1) {
            float $$5 = this.ag.i() * 0.5F;
            float $$6 = this.ag.i() * (float) (Math.PI * 2);
            $$4.o((double)(-aui.a($$6) * $$5), 0.2F, (double)(aui.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = aui.a(this.dE() * (float) (Math.PI / 180.0));
            float $$9 = aui.b(this.dE() * (float) (Math.PI / 180.0));
            float $$10 = aui.a(this.dC() * (float) (Math.PI / 180.0));
            float $$11 = aui.b(this.dC() * (float) (Math.PI / 180.0));
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

   public float d(dja $$0) {
      float $$1 = this.cm.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = cre.g(this);
         cmr $$3 = this.eT();
         if ($$2 > 0 && !$$3.b()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bld.a(this)) {
         $$1 *= 1.0F + (float)(bld.b(this) + 1) * 0.2F;
      }

      if (this.a(ble.d)) {
         $$1 *= switch (this.b(ble.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      if (this.a(asg.a) && !cre.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aC()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dja $$0) {
      return !$$0.y() || this.cm.f().b($$0);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.a_(this.cq.getId());
      sr $$1 = $$0.c("Inventory", 10);
      this.cm.b($$1);
      this.cm.l = $$0.h("SelectedItemSlot");
      this.cn = $$0.g("SleepTimer");
      this.ch = $$0.j("XpP");
      this.cf = $$0.h("XpLevel");
      this.cg = $$0.h("XpTotal");
      this.ci = $$0.h("XpSeed");
      if (this.ci == 0) {
         this.ci = this.ag.f();
      }

      this.r($$0.h("Score"));
      this.bT.a($$0);
      this.co.b($$0);
      this.a(bnl.m).a((double)this.co.b());
      if ($$0.b("EnderItems", 9)) {
         this.bQ.a($$0.c("EnderItems", 10));
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(ig.a.parse(sz.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      ta.g($$0);
      $$0.a("Inventory", this.cm.a(new sr()));
      $$0.a("SelectedItemSlot", this.cm.l);
      $$0.a("SleepTimer", (short)this.cn);
      $$0.a("XpP", this.ch);
      $$0.a("XpLevel", this.cf);
      $$0.a("XpTotal", this.cg);
      $$0.a("XpSeed", this.ci);
      $$0.a("Score", this.fN());
      this.bT.b($$0);
      this.co.a($$0);
      $$0.a("EnderItems", this.bQ.g());
      if (!this.gj().g()) {
         $$0.a("ShoulderEntityLeft", this.gj());
      }

      if (!this.gk().g()) {
         $$0.a("ShoulderEntityRight", this.gk());
      }

      this.gr().flatMap($$0x -> ig.a.encodeStart(sz.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
   }

   @Override
   public boolean b(bkn $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(asd.o)) {
         return !this.dM().Z().b(cte.G);
      } else if ($$0.a(asd.n)) {
         return !this.dM().Z().b(cte.H);
      } else if ($$0.a(asd.j)) {
         return !this.dM().Z().b(cte.I);
      } else {
         return $$0.a(asd.p) ? !this.dM().Z().b(cte.J) : false;
      }
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.co.a && !$$0.a(asd.e)) {
         return false;
      } else {
         this.bb = 0;
         if (this.ew()) {
            return false;
         } else {
            if (!this.dM().B) {
               this.gg();
            }

            if ($$0.f()) {
               if (this.dM().ak() == bjs.a) {
                  $$1 = 0.0F;
               }

               if (this.dM().ak() == bjs.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dM().ak() == bjs.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bmf $$0) {
      super.d($$0);
      if ($$0.fG()) {
         this.s(true);
      }
   }

   @Override
   public boolean eo() {
      return !this.fT().a && super.eo();
   }

   public boolean a(cfb $$0) {
      ems $$1 = this.cg();
      ems $$2 = $$0.cg();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bkn $$0, float $$1) {
      this.cm.a($$0, $$1, cfa.g);
   }

   @Override
   protected void c(bkn $$0, float $$1) {
      this.cm.a($$0, $$1, cfa.h);
   }

   @Override
   protected void u(float $$0) {
      if (this.bv.a(cmu.vl)) {
         if (!this.dM().B) {
            this.b(arw.c.b(this.bv.d()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + aui.d($$0);
            bju $$2 = this.fo();
            this.bv.a($$1, this, $$1x -> $$1x.d($$2));
            if (this.bv.b()) {
               if ($$2 == bju.a) {
                  this.a(blu.a, cmr.f);
               } else {
                  this.a(blu.b, cmr.f);
               }

               this.bv = cmr.f;
               this.a(arm.vH, 0.8F, 0.8F + this.dM().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bkn $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fk(), 0.0F);
         this.y(this.fk() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(arw.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.A($$0.a());
            this.eK().a($$0, var7);
            this.c(this.ev() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(arw.J, Math.round(var7 * 10.0F));
            }

            this.a(dnk.o);
         }
      }
   }

   @Override
   protected boolean dU() {
      return !this.co.b && super.dU();
   }

   public boolean Y() {
      return false;
   }

   public void a(dhx $$0, boolean $$1) {
   }

   public void a(csj $$0) {
   }

   public void a(dgy $$0) {
   }

   public void a(dic $$0) {
   }

   public void a(dho $$0) {
   }

   public void a(bzr $$0, bjo $$1) {
   }

   public OptionalInt a(@Nullable bjy $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, csh $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cmr $$0, bju $$1) {
   }

   public bjv a(blp $$0, bju $$1) {
      if (this.P_()) {
         if ($$0 instanceof bjy) {
            this.a((bjy)$$0);
         }

         return bjv.d;
      } else {
         cmr $$2 = this.b($$1);
         cmr $$3 = $$2.p();
         bjv $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.co.d && $$2 == this.b($$1) && $$2.L() < $$3.L()) {
               $$2.f($$3.L());
            }

            return $$4;
         } else {
            if (!$$2.b() && $$0 instanceof bmf) {
               if (this.co.d) {
                  $$2 = $$3;
               }

               bjv $$5 = $$2.a(this, (bmf)$$0, $$1);
               if ($$5.a()) {
                  this.dM().a(dnk.r, $$0.dk(), dnk.a.a(this));
                  if ($$2.b() && !this.co.d) {
                     this.a($$1, cmr.f);
                  }

                  return $$5;
               }
            }

            return bjv.d;
         }
      }
   }

   @Override
   protected float l(blp $$0) {
      return -0.6F;
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
      return !this.co.b;
   }

   @Override
   protected elm a(elm $$0, bml $$1) {
      if (!this.co.b && $$0.d <= 0.0 && ($$1 == bml.a || $$1 == bml.b) && this.fK() && this.A()) {
         double $$2 = $$0.c;
         double $$3 = $$0.e;
         double $$4 = 0.05;

         while ($$2 != 0.0 && this.dM().a(this, this.cH().d($$2, (double)(-this.dG()), 0.0))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }
         }

         while ($$3 != 0.0 && this.dM().a(this, this.cH().d(0.0, (double)(-this.dG()), $$3))) {
            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         while ($$2 != 0.0 && $$3 != 0.0 && this.dM().a(this, this.cH().d($$2, (double)(-this.dG()), $$3))) {
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

         $$0 = new elm($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean A() {
      return this.aC() || this.ab < this.dG() && !this.dM().a(this, this.cH().d(0.0, (double)(this.ab - this.dG()), 0.0));
   }

   public void d(blp $$0) {
      if ($$0.cq()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.b(bnl.c);
            float $$2;
            if ($$0 instanceof bmf) {
               $$2 = cre.a(this.eT(), ((bmf)$$0).eS());
            } else {
               $$2 = cre.a(this.eT(), bmk.a);
            }

            float $$4 = this.B(0.5F);
            $$1 *= 0.2F + $$4 * $$4 * 0.8F;
            $$2 *= $$4;
            this.gm();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$5 = $$4 > 0.9F;
               boolean $$6 = false;
               int $$7 = 0;
               $$7 += cre.c(this);
               if (this.bY() && $$5) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), arm.tf, this.db(), 1.0F, 1.0F);
                  $$7++;
                  $$6 = true;
               }

               boolean $$8 = $$5 && this.ab > 0.0F && !this.aC() && !this.e_() && !this.aZ() && !this.a(ble.o) && !this.bO() && $$0 instanceof bmf;
               $$8 = $$8 && !this.bY();
               if ($$8) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$9 = false;
               double $$10 = (double)(this.Y - this.X);
               if ($$5 && !$$8 && !$$6 && this.aC() && $$10 < (double)this.ff()) {
                  cmr $$11 = this.b(bju.a);
                  if ($$11.d() instanceof coc) {
                     $$9 = true;
                  }
               }

               float $$12 = 0.0F;
               boolean $$13 = false;
               int $$14 = cre.d(this);
               if ($$0 instanceof bmf) {
                  $$12 = ((bmf)$$0).ev();
                  if ($$14 > 0 && !$$0.bN()) {
                     $$13 = true;
                     $$0.g(1);
                  }
               }

               elm $$15 = $$0.dp();
               boolean $$16 = $$0.a(this.dN().a(this), $$1);
               if ($$16) {
                  if ($$7 > 0) {
                     if ($$0 instanceof bmf) {
                        ((bmf)$$0)
                           .q(
                              (double)((float)$$7 * 0.5F),
                              (double)aui.a(this.dC() * (float) (Math.PI / 180.0)),
                              (double)(-aui.b(this.dC() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-aui.a(this.dC() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F),
                           0.1,
                           (double)(aui.b(this.dC() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F)
                        );
                     }

                     this.g(this.dp().d(0.6, 1.0, 0.6));
                     this.g(false);
                  }

                  if ($$9) {
                     float $$17 = 1.0F + cre.a(this) * $$1;

                     for (bmf $$19 : this.dM().a(bmf.class, $$0.cH().c(1.0, 0.25, 1.0))) {
                        if ($$19 != this && $$19 != $$0 && !this.s($$19) && (!($$19 instanceof cbe) || !((cbe)$$19).A()) && this.f($$19) < 9.0) {
                           $$19.q(0.4F, (double)aui.a(this.dC() * (float) (Math.PI / 180.0)), (double)(-aui.b(this.dC() * (float) (Math.PI / 180.0))));
                           $$19.a(this.dN().a(this), $$17);
                        }
                     }

                     this.dM().a(null, this.dr(), this.dt(), this.dx(), arm.ti, this.db(), 1.0F, 1.0F);
                     this.fP();
                  }

                  if ($$0 instanceof ana && $$0.T) {
                     ((ana)$$0).c.b(new acb($$0));
                     $$0.T = false;
                     $$0.g($$15);
                  }

                  if ($$8) {
                     this.dM().a(null, this.dr(), this.dt(), this.dx(), arm.te, this.db(), 1.0F, 1.0F);
                     this.a($$0);
                  }

                  if (!$$8 && !$$9) {
                     if ($$5) {
                        this.dM().a(null, this.dr(), this.dt(), this.dx(), arm.th, this.db(), 1.0F, 1.0F);
                     } else {
                        this.dM().a(null, this.dr(), this.dt(), this.dx(), arm.tj, this.db(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.b($$0);
                  }

                  this.A($$0);
                  if ($$0 instanceof bmf) {
                     cre.a((bmf)$$0, this);
                  }

                  cre.b(this, $$0);
                  cmr $$20 = this.eT();
                  blp $$21 = $$0;
                  if ($$0 instanceof cag) {
                     $$21 = ((cag)$$0).b;
                  }

                  if (!this.dM().B && !$$20.b() && $$21 instanceof bmf) {
                     $$20.a((bmf)$$21, this);
                     if ($$20.b()) {
                        this.a(bju.a, cmr.f);
                     }
                  }

                  if ($$0 instanceof bmf) {
                     float $$22 = $$12 - ((bmf)$$0).ev();
                     this.a(arw.G, Math.round($$22 * 10.0F));
                     if ($$14 > 0) {
                        $$0.g($$14 * 4);
                     }

                     if (this.dM() instanceof amz && $$22 > 2.0F) {
                        int $$23 = (int)((double)$$22 * 0.5);
                        ((amz)this.dM()).a(jx.h, $$0.dr(), $$0.e(0.5), $$0.dx(), $$23, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.A(0.1F);
               } else {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), arm.tg, this.db(), 1.0F, 1.0F);
                  if ($$13) {
                     $$0.aA();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(bmf $$0) {
      this.d((blp)$$0);
   }

   public void s(boolean $$0) {
      float $$1 = 0.25F + (float)cre.g(this) * 0.05F;
      if ($$0) {
         $$1 += 0.75F;
      }

      if (this.ag.i() < $$1) {
         this.gn().a(cmu.vl, 100);
         this.ft();
         this.dM().a(this, (byte)30);
      }
   }

   @Override
   public void a(blp $$0) {
   }

   public void b(blp $$0) {
   }

   public void fP() {
      double $$0 = (double)(-aui.a(this.dC() * (float) (Math.PI / 180.0)));
      double $$1 = (double)aui.b(this.dC() * (float) (Math.PI / 180.0));
      if (this.dM() instanceof amz) {
         ((amz)this.dM()).a(jx.ag, this.dr() + $$0, this.e(0.5), this.dx() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fQ() {
   }

   @Override
   public void a(blp.c $$0) {
      super.a($$0);
      this.bR.b(this);
      if (this.bS != null && this.fU()) {
         this.s();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile fR() {
      return this.cq;
   }

   public cfa fS() {
      return this.cm;
   }

   public cey fT() {
      return this.co;
   }

   public void a(cmr $$0, cmr $$1, cic $$2) {
   }

   public boolean fU() {
      return this.bS != this.bR;
   }

   public Either<cfb.a, avm> a(hx $$0) {
      this.b($$0);
      this.cn = 0;
      return Either.right(avm.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fE();
      if (this.dM() instanceof amz && $$1) {
         ((amz)this.dM()).e();
      }

      this.cn = $$0 ? 0 : 100;
   }

   @Override
   public void fE() {
      this.a(true, true);
   }

   public static Optional<elm> a(amz $$0, hx $$1, float $$2, boolean $$3, boolean $$4) {
      dja $$5 = $$0.a_($$1);
      cwj $$6 = $$5.b();
      if ($$6 instanceof dcq && ($$3 || $$5.c(dcq.d) > 0) && dcq.a($$0)) {
         Optional<elm> $$7 = dcq.a(blt.bv, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dcq.d, Integer.valueOf($$5.c(dcq.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof cwc && cwc.a($$0)) {
         return cwc.a(blt.bv, $$0, $$1, $$5.c(cwc.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dja $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new elm((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean fV() {
      return this.fD() && this.cn >= 100;
   }

   public int fW() {
      return this.cn;
   }

   public void a(vd $$0, boolean $$1) {
   }

   public void a(ahd $$0) {
      this.b(arw.i.b($$0));
   }

   public void a(ahd $$0, int $$1) {
      this.a(arw.i.b($$0), $$1);
   }

   public void b(art<?> $$0) {
      this.a($$0, 1);
   }

   public void a(art<?> $$0, int $$1) {
   }

   public void a(art<?> $$0) {
   }

   public int a(Collection<cpx<?>> $$0) {
      return 0;
   }

   public void a(cpx<?> $$0, List<cmr> $$1) {
   }

   public void a(List<ahd> $$0) {
   }

   public int b(Collection<cpx<?>> $$0) {
      return 0;
   }

   @Override
   public void fb() {
      super.fb();
      this.a(arw.E);
      if (this.bY()) {
         this.A(0.2F);
      } else {
         this.A(0.05F);
      }
   }

   @Override
   public void a(elm $$0) {
      if (this.bZ() && !this.bO()) {
         double $$1 = this.bF().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bj || !this.dM().a_(hx.a(this.dr(), this.dt() + 1.0 - 0.1, this.dx())).u().c()) {
            elm $$3 = this.dp();
            this.g($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.co.b && !this.bO()) {
         double $$4 = this.dp().d;
         super.a($$0);
         elm $$5 = this.dp();
         this.o($$5.c, $$4 * 0.6, $$5.e);
         this.n();
         this.b(7, false);
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bf() {
      if (this.co.b) {
         this.h(false);
      } else {
         super.bf();
      }
   }

   protected boolean h(hx $$0) {
      return !this.dM().a_($$0).o(this.dM(), $$0);
   }

   @Override
   public float ff() {
      return (float)this.b(bnl.m);
   }

   @Override
   public boolean a(float $$0, float $$1, bkn $$2) {
      if (this.co.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(arw.t, (int)Math.round((double)$$0 * 100.0));
         }

         return super.a($$0, $$1, $$2);
      }
   }

   public boolean fX() {
      if (!this.aC() && !this.fw() && !this.aZ() && !this.a(ble.y)) {
         cmr $$0 = this.c(blu.e);
         if ($$0.a(cmu.nS) && cll.d($$0)) {
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
   protected void b(hx $$0, dja $$1) {
      if (this.aZ()) {
         this.aR();
         this.b($$1);
      } else {
         hx $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dja $$3 = this.dM().a_($$2);
            if ($$3.a(asb.bn)) {
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
   public bmf.a eG() {
      return new bmf.a(arm.tu, arm.tk);
   }

   @Override
   public boolean a(amz $$0, bmf $$1) {
      this.b(arw.g.b($$1.ai()));
      return true;
   }

   @Override
   public void a(dja $$0, elm $$1) {
      if (!this.co.b) {
         super.a($$0, $$1);
      }
   }

   public void d(int $$0) {
      this.s($$0);
      this.ch = this.ch + (float)$$0 / (float)this.gb();
      this.cg = aui.a(this.cg + $$0, 0, Integer.MAX_VALUE);

      while (this.ch < 0.0F) {
         float $$1 = this.ch * (float)this.gb();
         if (this.cf > 0) {
            this.c(-1);
            this.ch = 1.0F + $$1 / (float)this.gb();
         } else {
            this.c(-1);
            this.ch = 0.0F;
         }
      }

      while (this.ch >= 1.0F) {
         this.ch = (this.ch - 1.0F) * (float)this.gb();
         this.c(1);
         this.ch = this.ch / (float)this.gb();
      }
   }

   public int ga() {
      return this.ci;
   }

   @Override
   public void a(cmr $$0, int $$1) {
      this.cf -= $$1;
      if (this.cf < 0) {
         this.cf = 0;
         this.ch = 0.0F;
         this.cg = 0;
      }

      this.ci = this.ag.f();
   }

   public void c(int $$0) {
      this.cf += $$0;
      if (this.cf < 0) {
         this.cf = 0;
         this.ch = 0.0F;
         this.cg = 0;
      }

      if ($$0 > 0 && this.cf % 5 == 0 && (float)this.cp < (float)this.ah - 100.0F) {
         float $$1 = this.cf > 30 ? 1.0F : (float)this.cf / 30.0F;
         this.dM().a(null, this.dr(), this.dt(), this.dx(), arm.tt, this.db(), $$1 * 0.75F, 1.0F);
         this.cp = this.ah;
      }
   }

   public int gb() {
      if (this.cf >= 30) {
         return 112 + (this.cf - 30) * 9;
      } else {
         return this.cf >= 15 ? 37 + (this.cf - 15) * 5 : 7 + this.cf * 2;
      }
   }

   public void A(float $$0) {
      if (!this.co.a) {
         if (!this.dM().B) {
            this.bT.a($$0);
         }
      }
   }

   public Optional<ceh> aa() {
      return Optional.empty();
   }

   public chq gc() {
      return this.bT;
   }

   public boolean t(boolean $$0) {
      return this.co.a || $$0 || this.bT.c();
   }

   public boolean gd() {
      return this.ev() > 0.0F && this.ev() < this.eM();
   }

   public boolean ge() {
      return this.co.e;
   }

   public boolean a(hx $$0, ic $$1, cmr $$2) {
      if (this.co.e) {
         return true;
      } else {
         hx $$3 = $$0.a($$1.g());
         dje $$4 = new dje(this.dM(), $$3, false);
         return $$2.a(this.dM().I_().d(ke.f), $$4);
      }
   }

   @Override
   public int ee() {
      if (!this.dM().Z().b(cte.d) && !this.P_()) {
         int $$0 = this.cf * 7;
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
   protected blp.b aW() {
      return this.co.b || this.aC() && this.bV() ? blp.b.a : blp.b.d;
   }

   @Override
   public void y() {
   }

   @Override
   public vd ad() {
      return vd.b(this.cq.getName());
   }

   public cjg gf() {
      return this.bQ;
   }

   @Override
   public cmr c(blu $$0) {
      if ($$0 == blu.a) {
         return this.cm.f();
      } else if ($$0 == blu.b) {
         return this.cm.k.get(0);
      } else {
         return $$0.a() == blu.a.b ? this.cm.j.get($$0.b()) : cmr.f;
      }
   }

   @Override
   protected boolean a(blu $$0) {
      return $$0.a() == blu.a.b;
   }

   @Override
   public void a(blu $$0, cmr $$1) {
      this.e($$1);
      if ($$0 == blu.a) {
         this.a($$0, this.cm.i.set(this.cm.l, $$1), $$1);
      } else if ($$0 == blu.b) {
         this.a($$0, this.cm.k.set(0, $$1), $$1);
      } else if ($$0.a() == blu.a.b) {
         this.a($$0, this.cm.j.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cmr $$0) {
      return this.cm.e($$0);
   }

   @Override
   public Iterable<cmr> bK() {
      return Lists.newArrayList(new cmr[]{this.eT(), this.eU()});
   }

   @Override
   public Iterable<cmr> bL() {
      return this.cm.j;
   }

   public boolean h(sl $$0) {
      if (this.bO() || !this.aC() || this.aZ() || this.aA) {
         return false;
      } else if (this.gj().g()) {
         this.i($$0);
         this.f = this.dM().X();
         return true;
      } else if (this.gk().g()) {
         this.j($$0);
         this.f = this.dM().X();
         return true;
      } else {
         return false;
      }
   }

   protected void gg() {
      if (this.f + 20L < this.dM().X()) {
         this.k(this.gj());
         this.i(new sl());
         this.k(this.gk());
         this.j(new sl());
      }
   }

   private void k(sl $$0) {
      if (!this.dM().B && !$$0.g()) {
         blt.a($$0, this.dM()).ifPresent($$0x -> {
            if ($$0x instanceof bna) {
               ((bna)$$0x).b(this.ay);
            }

            $$0x.a_(this.dr(), this.dt() + 0.7F, this.dx());
            ((amz)this.dM()).c($$0x);
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
      return !this.co.b && !this.P_() && super.bZ();
   }

   public abstract boolean f();

   @Override
   public boolean cz() {
      return !this.co.b;
   }

   public emq gh() {
      return this.dM().K();
   }

   @Override
   public vd Q_() {
      vr $$0 = eml.a(this.cg(), this.ad());
      return this.a($$0);
   }

   private vr a(vr $$0) {
      String $$1 = this.fR().getName();
      return $$0.a($$1x -> $$1x.a(new vb(vb.a.d, "/tell " + $$1 + " ")).a(this.cG()).a($$1));
   }

   @Override
   public String cy() {
      return this.fR().getName();
   }

   @Override
   public float b(bmr $$0, blq $$1) {
      switch ($$0) {
         case d:
         case b:
         case e:
            return 0.4F;
         case f:
            return 1.27F;
         default:
            return 1.62F;
      }
   }

   @Override
   protected void z(float $$0) {
      this.an().b(d, $$0);
   }

   @Override
   public float fk() {
      return this.an().b(d);
   }

   public boolean a(cfc $$0) {
      return (this.an().b(bM) & $$0.a()) == $$0.a();
   }

   @Override
   public bmx a_(int $$0) {
      if ($$0 >= 0 && $$0 < this.cm.i.size()) {
         return bmx.a(this.cm, $$0);
      } else {
         int $$1 = $$0 - 200;
         return $$1 >= 0 && $$1 < this.bQ.b() ? bmx.a(this.bQ, $$1) : super.a_($$0);
      }
   }

   public boolean gi() {
      return this.cr;
   }

   public void u(boolean $$0) {
      this.cr = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.co.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public blz fm() {
      return this.an.b(bN) == 0 ? blz.a : blz.b;
   }

   public void a(blz $$0) {
      this.an.b(bN, (byte)($$0 == blz.a ? 0 : 1));
   }

   public sl gj() {
      return this.an.b(bO);
   }

   protected void i(sl $$0) {
      this.an.b(bO, $$0);
   }

   public sl gk() {
      return this.an.b(bP);
   }

   protected void j(sl $$0) {
      this.an.b(bP, $$0);
   }

   public float gl() {
      return (float)(1.0 / this.b(bnl.e) * 20.0);
   }

   public float B(float $$0) {
      return aui.a(((float)this.aP + $$0) / this.gl(), 0.0F, 1.0F);
   }

   public void gm() {
      this.aP = 0;
   }

   public cmn gn() {
      return this.ct;
   }

   @Override
   protected float aL() {
      return !this.co.b && !this.fw() ? super.aL() : 1.0F;
   }

   public float go() {
      return (float)this.b(bnl.j);
   }

   public boolean gp() {
      return this.co.d && this.F() >= 2;
   }

   @Override
   public boolean f(cmr $$0) {
      blu $$1 = bmh.h($$0);
      return this.c($$1).b();
   }

   @Override
   public blq a(bmr $$0) {
      return c.getOrDefault($$0, bL);
   }

   @Override
   public ImmutableList<bmr> fA() {
      return ImmutableList.of(bmr.a, bmr.f, bmr.d);
   }

   @Override
   public cmr g(cmr $$0) {
      if (!($$0.d() instanceof cnh)) {
         return cmr.f;
      } else {
         Predicate<cmr> $$1 = ((cnh)$$0.d()).e();
         cmr $$2 = cnh.a(this, $$1);
         if (!$$2.b()) {
            return $$2;
         } else {
            $$1 = ((cnh)$$0.d()).b();

            for (int $$3 = 0; $$3 < this.cm.b(); $$3++) {
               cmr $$4 = this.cm.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.co.d ? new cmr(cmu.os) : cmr.f;
         }
      }
   }

   @Override
   public cmr a(cti $$0, cmr $$1) {
      this.gc().a($$1.d(), $$1);
      this.b(arw.c.b($$1.d()));
      $$0.a(null, this.dr(), this.dt(), this.dx(), arm.tm, arn.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof ana) {
         am.A.a((ana)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dja $$0) {
      return this.co.b || super.c($$0);
   }

   @Override
   public elm q(float $$0) {
      double $$1 = 0.22 * (this.fm() == blz.b ? -1.0 : 1.0);
      float $$2 = aui.i($$0 * 0.5F, this.dE(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = aui.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      if (this.fw() || this.fj()) {
         elm $$4 = this.f($$0);
         elm $$5 = this.dp();
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

         return this.l($$0).e(new elm($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.ca()) {
         return this.l($$0).e(new elm($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cH().c() - 1.0;
         double $$13 = this.bX() ? -0.2 : 0.07;
         return this.l($$0).e(new elm($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dL() {
      return true;
   }

   public boolean gq() {
      return this.fn() && this.fp().a(cmu.qU);
   }

   @Override
   public boolean dK() {
      return false;
   }

   public Optional<ig> gr() {
      return this.cu;
   }

   public void a(Optional<ig> $$0) {
      this.cu = $$0;
   }

   @Override
   public float eE() {
      return this.cl;
   }

   @Override
   public void m(float $$0) {
      super.m($$0);
      this.cl = $$0;
   }

   @Override
   public boolean dF() {
      return true;
   }

   @Override
   protected float fe() {
      if (this.co.b && !this.bO()) {
         return this.bY() ? this.co.a() * 2.0F : this.co.a();
      } else {
         return this.bY() ? 0.025999999F : 0.02F;
      }
   }

   public static boolean c(String $$0) {
      return $$0.length() > 16 ? false : $$0.chars().filter($$0x -> $$0x <= 32 || $$0x >= 127).findAny().isEmpty();
   }

   public static float v(boolean $$0) {
      return $$0 ? 5.0F : 4.5F;
   }

   public static enum a {
      a,
      b(vd.c("block.minecraft.bed.no_sleep")),
      c(vd.c("block.minecraft.bed.too_far_away")),
      d(vd.c("block.minecraft.bed.obstructed")),
      e,
      f(vd.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final vd g;

      private a() {
         this.g = null;
      }

      private a(vd $$0) {
         this.g = $$0;
      }

      @Nullable
      public vd a() {
         return this.g;
      }
   }
}
