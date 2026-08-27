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

public abstract class ccx extends bkj {
   private static final Logger b = LogUtils.getLogger();
   public static final int bA = 16;
   public static final bkd bB = bkd.b;
   public static final int bC = 0;
   public static final int bD = 20;
   public static final int bE = 100;
   public static final int bF = 10;
   public static final int bG = 200;
   public static final float bH = 1.5F;
   public static final float bI = 0.6F;
   public static final float bJ = 0.6F;
   public static final float bK = 1.62F;
   public static final bju bL = bju.b(0.6F, 1.8F);
   private static final Map<bkv, bju> c = ImmutableMap.builder()
      .put(bkv.a, bL)
      .put(bkv.c, v)
      .put(bkv.b, bju.b(0.6F, 0.6F))
      .put(bkv.d, bju.b(0.6F, 0.6F))
      .put(bkv.e, bju.b(0.6F, 0.6F))
      .put(bkv.f, bju.b(0.6F, 1.5F))
      .put(bkv.h, bju.c(0.2F, 0.2F))
      .build();
   private static final int d = 25;
   private static final afc<Float> e = aff.a(ccx.class, afe.d);
   private static final afc<Integer> f = aff.a(ccx.class, afe.b);
   protected static final afc<Byte> bM = aff.a(ccx.class, afe.a);
   protected static final afc<Byte> bN = aff.a(ccx.class, afe.a);
   protected static final afc<rt> bO = aff.a(ccx.class, afe.s);
   protected static final afc<rt> bP = aff.a(ccx.class, afe.s);
   private long cm;
   private final ccw cn = new ccw(this);
   protected cgy bQ = new cgy();
   public final cgo bR;
   public cfp bS;
   protected cfl bT = new cfl();
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
   private int co;
   protected boolean ce;
   private final ccu cp = new ccu();
   public int cf;
   public int cg;
   public float ch;
   protected int ci;
   protected final float cj = 0.02F;
   private int cq;
   private final GameProfile cr;
   private boolean cs;
   private ckj ct = ckj.b;
   private final ckf cu = this.k();
   private Optional<ia> cv = Optional.empty();
   @Nullable
   public cdl ck;
   protected float cl;

   public ccx(cqz $$0, ht $$1, float $$2, GameProfile $$3) {
      super(bjx.bt, $$0);
      this.a_($$3.getId());
      this.cr = $$3;
      this.bR = new cgo(this.cn, !$$0.B, this);
      this.bS = this.bR;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bg = 180.0F;
   }

   public boolean a(cqz $$0, ht $$1, cqw $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == cqw.d) {
         return true;
      } else if (this.ge()) {
         return false;
      } else {
         ckj $$3 = this.eS();
         return $$3.b() || !$$3.b($$0.H_().d(jz.e), new dgf($$0, $$1, false));
      }
   }

   public static blo.a fH() {
      return bkj.dP().a(blp.c, 1.0).a(blp.m, 0.1F).a(blp.e).a(blp.j);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(e, 0.0F);
      this.an.a(f, 0);
      this.an.a(bM, (byte)0);
      this.an.a(bN, (byte)bB.a());
      this.an.a(bO, new rt());
      this.an.a(bP, new rt());
   }

   @Override
   public void l() {
      this.af = this.N_();
      if (this.N_()) {
         this.c(false);
      }

      if (this.bX > 0) {
         this.bX--;
      }

      if (this.fD()) {
         this.co++;
         if (this.co > 100) {
            this.co = 100;
         }

         if (!this.dL().B && this.dL().N()) {
            this.a(false, true);
         }
      } else if (this.co > 0) {
         this.co++;
         if (this.co >= 110) {
            this.co = 0;
         }
      }

      this.fL();
      super.l();
      if (!this.dL().B && this.bS != null && !this.bS.a(this)) {
         this.q();
         this.bS = this.bR;
      }

      this.t();
      if (!this.dL().B) {
         this.bT.a(this);
         this.a(aqn.k);
         this.a(aqn.l);
         if (this.bv()) {
            this.a(aqn.m);
         }

         if (this.bU()) {
            this.a(aqn.o);
         }

         if (!this.fD()) {
            this.a(aqn.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = asy.a(this.dq(), -2.9999999E7, 2.9999999E7);
      double $$2 = asy.a(this.dw(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dq() || $$2 != this.dw()) {
         this.e($$1, this.ds(), $$2);
      }

      this.aP++;
      ckj $$3 = this.eS();
      if (!ckj.a(this.ct, $$3)) {
         if (!ckj.b(this.ct, $$3)) {
            this.gm();
         }

         this.ct = $$3.p();
      }

      this.s();
      this.cu.a();
      this.fM();
   }

   @Override
   protected float ff() {
      return this.fu() ? 15.0F : super.ff();
   }

   public boolean fI() {
      return this.bR();
   }

   protected boolean fJ() {
      return this.bR();
   }

   protected boolean fK() {
      return this.bR();
   }

   protected boolean fL() {
      this.ce = this.a(aqx.a);
      return this.ce;
   }

   private void s() {
      ckj $$0 = this.c(bjy.f);
      if ($$0.a(ckm.nC) && !this.a(aqx.a)) {
         this.b(new bjg(bji.m, 200, 0, false, false, true));
      }
   }

   protected ckf k() {
      return new ckf();
   }

   private void t() {
      this.bY = this.cb;
      this.bZ = this.cc;
      this.ca = this.cd;
      double $$0 = this.dq() - this.cb;
      double $$1 = this.ds() - this.cc;
      double $$2 = this.dw() - this.cd;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cb = this.dq();
         this.bY = this.cb;
      }

      if ($$2 > 10.0) {
         this.cd = this.dw();
         this.ca = this.cd;
      }

      if ($$1 > 10.0) {
         this.cc = this.ds();
         this.bZ = this.cc;
      }

      if ($$0 < -10.0) {
         this.cb = this.dq();
         this.bY = this.cb;
      }

      if ($$2 < -10.0) {
         this.cd = this.dw();
         this.ca = this.cd;
      }

      if ($$1 < -10.0) {
         this.cc = this.ds();
         this.bZ = this.cc;
      }

      this.cb += $$0 * 0.25;
      this.cd += $$2 * 0.25;
      this.cc += $$1 * 0.25;
   }

   protected void fM() {
      if (this.g(bkv.d)) {
         bkv $$0;
         if (this.fw()) {
            $$0 = bkv.b;
         } else if (this.fD()) {
            $$0 = bkv.c;
         } else if (this.bY()) {
            $$0 = bkv.d;
         } else if (this.fj()) {
            $$0 = bkv.e;
         } else if (this.bR() && !this.cp.b) {
            $$0 = bkv.f;
         } else {
            $$0 = bkv.a;
         }

         bkv $$6;
         if (this.N_() || this.bN() || this.g($$0)) {
            $$6 = $$0;
         } else if (this.g(bkv.f)) {
            $$6 = bkv.f;
         } else {
            $$6 = bkv.d;
         }

         this.b($$6);
      }
   }

   protected boolean g(bkv $$0) {
      return this.dL().a(this, this.a($$0).a(this.dj()).h(1.0E-7));
   }

   @Override
   public int av() {
      return this.cp.a ? 1 : 80;
   }

   @Override
   protected aqc aL() {
      return aqd.sK;
   }

   @Override
   protected aqc aM() {
      return aqd.sI;
   }

   @Override
   protected aqc aN() {
      return aqd.sJ;
   }

   @Override
   public int bI() {
      return 10;
   }

   @Override
   public void a(aqc $$0, float $$1, float $$2) {
      this.dL().a(this, this.dq(), this.ds(), this.dw(), $$0, this.da(), $$1, $$2);
   }

   public void a(aqc $$0, aqe $$1, float $$2, float $$3) {
   }

   @Override
   public aqe da() {
      return aqe.h;
   }

   @Override
   protected int db() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.ae_();
      } else if ($$0 == 23) {
         this.cs = false;
      } else if ($$0 == 22) {
         this.cs = true;
      } else if ($$0 == 43) {
         this.a(js.f);
      } else {
         super.b($$0);
      }
   }

   private void a(jq $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dL().a($$0, this.d(1.0), this.dt() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   protected void q() {
      this.bS = this.bR;
   }

   protected void r() {
   }

   @Override
   public void by() {
      if (!this.dL().B && this.fJ() && this.bN()) {
         this.aa();
         this.f(false);
      } else {
         double $$0 = this.dq();
         double $$1 = this.ds();
         double $$2 = this.dw();
         super.by();
         this.bV = this.bW;
         this.bW = 0.0F;
         this.s(this.dq() - $$0, this.ds() - $$1, this.dw() - $$2);
      }
   }

   @Override
   protected void fh() {
      super.fh();
      this.eP();
      this.aW = this.dB();
   }

   @Override
   public void c_() {
      if (this.bU > 0) {
         this.bU--;
      }

      if (this.dL().ai() == bhy.a && this.dL().X().b(cqv.j)) {
         if (this.eu() < this.eL() && this.ah % 20 == 0) {
            this.b(1.0F);
         }

         if (this.bT.c() && this.ah % 10 == 0) {
            this.bT.a(this.bT.a() + 1);
         }
      }

      this.cn.j();
      this.bV = this.bW;
      super.c_();
      this.w((float)this.b(blp.m));
      float $$1;
      if (this.aA() && !this.ev() && !this.bY()) {
         $$1 = Math.min(0.1F, (float)this.do().h());
      } else {
         $$1 = 0.0F;
      }

      this.bW = this.bW + ($$1 - this.bW) * 0.4F;
      if (this.eu() > 0.0F && !this.N_()) {
         eia $$2;
         if (this.bN() && !this.cY().dG()) {
            $$2 = this.cG().b(this.cY().cG()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cG().c(1.0, 0.5, 1.0);
         }

         List<bjt> $$4 = this.dL().a_(this, $$2);
         List<bjt> $$5 = Lists.newArrayList();

         for (bjt $$6 : $$4) {
            if ($$6.ag() == bjx.J) {
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
      if (!this.dL().B && (this.ab > 0.5F || this.aX()) || this.cp.b || this.fD() || this.aA) {
         this.gg();
      }
   }

   private void c(@Nullable rt $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dL().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bjx.a($$1).filter($$0x -> $$0x == bjx.at).ifPresent($$0x -> {
            if (!bwk.a(this.dL(), this)) {
               this.dL().a(null, this.dq(), this.ds(), this.dw(), bwk.a(this.dL(), this.dL().z), this.da(), 1.0F, bwk.a(this.dL().z));
            }
         });
      }
   }

   private void c(bjt $$0) {
      $$0.b_(this);
   }

   public int fN() {
      return this.an.b(f);
   }

   public void r(int $$0) {
      this.an.b(f, $$0);
   }

   public void s(int $$0) {
      int $$1 = this.fN();
      this.an.b(f, $$1 + $$0);
   }

   public void t(int $$0) {
      this.by = $$0;
      if (!this.dL().B) {
         this.gg();
         this.c(4, true);
      }
   }

   @Override
   public void a(bir $$0) {
      super.a($$0);
      this.ap();
      if (!this.N_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-asy.b((this.eD() + this.dB()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-asy.a((this.eD() + this.dB()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(aqn.N);
      this.a(aqn.i.b(aqn.m));
      this.a(aqn.i.b(aqn.n));
      this.ay();
      this.a_(false);
      this.a(Optional.of(ia.a(this.dL().ac(), this.dl())));
   }

   @Override
   protected void ex() {
      super.ex();
      if (!this.dL().X().b(cqv.d)) {
         this.fO();
         this.cn.k();
      }
   }

   protected void fO() {
      for (int $$0 = 0; $$0 < this.cn.b(); $$0++) {
         ckj $$1 = this.cn.a($$0);
         if (!$$1.b() && cov.e($$1)) {
            this.cn.b($$0);
         }
      }
   }

   @Override
   protected aqc d(bir $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected aqc m_() {
      return aqd.sA;
   }

   @Nullable
   public bzq a(ckj $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public bzq a(ckj $$0, boolean $$1, boolean $$2) {
      if ($$0.b()) {
         return null;
      } else {
         if (this.dL().B) {
            this.a(bia.a);
         }

         double $$3 = this.du() - 0.3F;
         bzq $$4 = new bzq(this.dL(), this.dq(), $$3, this.dw(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.a(this);
         }

         if ($$1) {
            float $$5 = this.ag.i() * 0.5F;
            float $$6 = this.ag.i() * (float) (Math.PI * 2);
            $$4.o((double)(-asy.a($$6) * $$5), 0.2F, (double)(asy.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = asy.a(this.dD() * (float) (Math.PI / 180.0));
            float $$9 = asy.b(this.dD() * (float) (Math.PI / 180.0));
            float $$10 = asy.a(this.dB() * (float) (Math.PI / 180.0));
            float $$11 = asy.b(this.dB() * (float) (Math.PI / 180.0));
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

   public float d(dgb $$0) {
      float $$1 = this.cn.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = cov.g(this);
         ckj $$3 = this.eS();
         if ($$2 > 0 && !$$3.b()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bjh.a(this)) {
         $$1 *= 1.0F + (float)(bjh.b(this) + 1) * 0.2F;
      }

      if (this.a(bji.d)) {
         $$1 *= switch (this.b(bji.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      if (this.a(aqx.a) && !cov.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aA()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dgb $$0) {
      return !$$0.y() || this.cn.f().b($$0);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.a_(this.cr.getId());
      rz $$1 = $$0.c("Inventory", 10);
      this.cn.b($$1);
      this.cn.l = $$0.h("SelectedItemSlot");
      this.co = $$0.g("SleepTimer");
      this.ch = $$0.j("XpP");
      this.cf = $$0.h("XpLevel");
      this.cg = $$0.h("XpTotal");
      this.ci = $$0.h("XpSeed");
      if (this.ci == 0) {
         this.ci = this.ag.f();
      }

      this.r($$0.h("Score"));
      this.bT.a($$0);
      this.cp.b($$0);
      this.a(blp.m).a((double)this.cp.b());
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
         this.a(ia.a.parse(sf.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      sg.g($$0);
      $$0.a("Inventory", this.cn.a(new rz()));
      $$0.a("SelectedItemSlot", this.cn.l);
      $$0.a("SleepTimer", (short)this.co);
      $$0.a("XpP", this.ch);
      $$0.a("XpLevel", this.cf);
      $$0.a("XpTotal", this.cg);
      $$0.a("XpSeed", this.ci);
      $$0.a("Score", this.fN());
      this.bT.b($$0);
      this.cp.a($$0);
      $$0.a("EnderItems", this.bQ.g());
      if (!this.gj().g()) {
         $$0.a("ShoulderEntityLeft", this.gj());
      }

      if (!this.gk().g()) {
         $$0.a("ShoulderEntityRight", this.gk());
      }

      this.gr().flatMap($$0x -> ia.a.encodeStart(sf.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
   }

   @Override
   public boolean b(bir $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(aqu.n)) {
         return !this.dL().X().b(cqv.D);
      } else if ($$0.a(aqu.m)) {
         return !this.dL().X().b(cqv.E);
      } else if ($$0.a(aqu.i)) {
         return !this.dL().X().b(cqv.F);
      } else {
         return $$0.a(aqu.o) ? !this.dL().X().b(cqv.G) : false;
      }
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cp.a && !$$0.a(aqu.d)) {
         return false;
      } else {
         this.bb = 0;
         if (this.ev()) {
            return false;
         } else {
            if (!this.dL().B) {
               this.gg();
            }

            if ($$0.f()) {
               if (this.dL().ai() == bhy.a) {
                  $$1 = 0.0F;
               }

               if (this.dL().ai() == bhy.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dL().ai() == bhy.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bkj $$0) {
      super.d($$0);
      if ($$0.fG()) {
         this.s(true);
      }
   }

   @Override
   public boolean en() {
      return !this.fT().a && super.en();
   }

   public boolean a(ccx $$0) {
      ejg $$1 = this.cf();
      ejg $$2 = $$0.cf();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bir $$0, float $$1) {
      this.cn.a($$0, $$1, ccw.g);
   }

   @Override
   protected void c(bir $$0, float $$1) {
      this.cn.a($$0, $$1, ccw.h);
   }

   @Override
   protected void u(float $$0) {
      if (this.bv.a(ckm.uy)) {
         if (!this.dL().B) {
            this.b(aqn.c.b(this.bv.d()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + asy.d($$0);
            bia $$2 = this.fo();
            this.bv.a($$1, this, $$1x -> $$1x.d($$2));
            if (this.bv.b()) {
               if ($$2 == bia.a) {
                  this.a(bjy.a, ckj.b);
               } else {
                  this.a(bjy.b, ckj.b);
               }

               this.bv = ckj.b;
               this.a(aqd.uT, 0.8F, 0.8F + this.dL().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bir $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fk(), 0.0F);
         this.y(this.fk() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(aqn.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.A($$0.a());
            this.eJ().a($$0, var7);
            this.c(this.eu() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(aqn.J, Math.round(var7 * 10.0F));
            }

            this.a(dkl.o);
         }
      }
   }

   @Override
   protected boolean dT() {
      return !this.cp.b && super.dT();
   }

   public boolean W() {
      return false;
   }

   public void a(dff $$0, boolean $$1) {
   }

   public void a(cqa $$0) {
   }

   public void a(deh $$0) {
   }

   public void a(dfk $$0) {
   }

   public void a(dew $$0) {
   }

   public void a(bxt $$0, bhu $$1) {
   }

   public OptionalInt a(@Nullable bie $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, cpy $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(ckj $$0, bia $$1) {
   }

   public bib a(bjt $$0, bia $$1) {
      if (this.N_()) {
         if ($$0 instanceof bie) {
            this.a((bie)$$0);
         }

         return bib.d;
      } else {
         ckj $$2 = this.b($$1);
         ckj $$3 = $$2.p();
         bib $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cp.d && $$2 == this.b($$1) && $$2.L() < $$3.L()) {
               $$2.f($$3.L());
            }

            return $$4;
         } else {
            if (!$$2.b() && $$0 instanceof bkj) {
               if (this.cp.d) {
                  $$2 = $$3;
               }

               bib $$5 = $$2.a(this, (bkj)$$0, $$1);
               if ($$5.a()) {
                  this.dL().a(dkl.r, $$0.dj(), dkl.a.a(this));
                  if ($$2.b() && !this.cp.d) {
                     this.a($$1, ckj.b);
                  }

                  return $$5;
               }
            }

            return bib.d;
         }
      }
   }

   @Override
   protected float l(bjt $$0) {
      return -0.6F;
   }

   @Override
   public void bB() {
      super.bB();
      this.J = 0;
   }

   @Override
   protected boolean eX() {
      return super.eX() || this.fD();
   }

   @Override
   public boolean dZ() {
      return !this.cp.b;
   }

   @Override
   protected eif a(eif $$0, bkp $$1) {
      if (!this.cp.b && $$0.d <= 0.0 && ($$1 == bkp.a || $$1 == bkp.b) && this.fK() && this.y()) {
         double $$2 = $$0.c;
         double $$3 = $$0.e;
         double $$4 = 0.05;

         while ($$2 != 0.0 && this.dL().a(this, this.cG().d($$2, (double)(-this.dF()), 0.0))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }
         }

         while ($$3 != 0.0 && this.dL().a(this, this.cG().d(0.0, (double)(-this.dF()), $$3))) {
            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         while ($$2 != 0.0 && $$3 != 0.0 && this.dL().a(this, this.cG().d($$2, (double)(-this.dF()), $$3))) {
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

         $$0 = new eif($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean y() {
      return this.aA() || this.ab < this.dF() && !this.dL().a(this, this.cG().d(0.0, (double)(this.ab - this.dF()), 0.0));
   }

   public void d(bjt $$0) {
      if ($$0.cp()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.b(blp.c);
            float $$2;
            if ($$0 instanceof bkj) {
               $$2 = cov.a(this.eS(), ((bkj)$$0).eR());
            } else {
               $$2 = cov.a(this.eS(), bko.a);
            }

            float $$4 = this.B(0.5F);
            $$1 *= 0.2F + $$4 * $$4 * 0.8F;
            $$2 *= $$4;
            this.gm();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$5 = $$4 > 0.9F;
               boolean $$6 = false;
               int $$7 = 0;
               $$7 += cov.c(this);
               if (this.bX() && $$5) {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), aqd.ss, this.da(), 1.0F, 1.0F);
                  $$7++;
                  $$6 = true;
               }

               boolean $$8 = $$5 && this.ab > 0.0F && !this.aA() && !this.d_() && !this.aX() && !this.a(bji.o) && !this.bN() && $$0 instanceof bkj;
               $$8 = $$8 && !this.bX();
               if ($$8) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$9 = false;
               double $$10 = (double)(this.Y - this.X);
               if ($$5 && !$$8 && !$$6 && this.aA() && $$10 < (double)this.fe()) {
                  ckj $$11 = this.b(bia.a);
                  if ($$11.d() instanceof clu) {
                     $$9 = true;
                  }
               }

               float $$12 = 0.0F;
               boolean $$13 = false;
               int $$14 = cov.d(this);
               if ($$0 instanceof bkj) {
                  $$12 = ((bkj)$$0).eu();
                  if ($$14 > 0 && !$$0.bM()) {
                     $$13 = true;
                     $$0.g(1);
                  }
               }

               eif $$15 = $$0.do();
               boolean $$16 = $$0.a(this.dM().a(this), $$1);
               if ($$16) {
                  if ($$7 > 0) {
                     if ($$0 instanceof bkj) {
                        ((bkj)$$0)
                           .q(
                              (double)((float)$$7 * 0.5F),
                              (double)asy.a(this.dB() * (float) (Math.PI / 180.0)),
                              (double)(-asy.b(this.dB() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-asy.a(this.dB() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F),
                           0.1,
                           (double)(asy.b(this.dB() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F)
                        );
                     }

                     this.f(this.do().d(0.6, 1.0, 0.6));
                     this.g(false);
                  }

                  if ($$9) {
                     float $$17 = 1.0F + cov.a(this) * $$1;

                     for (bkj $$19 : this.dL().a(bkj.class, $$0.cG().c(1.0, 0.25, 1.0))) {
                        if ($$19 != this && $$19 != $$0 && !this.s($$19) && (!($$19 instanceof bzg) || !((bzg)$$19).y()) && this.f($$19) < 9.0) {
                           $$19.q(0.4F, (double)asy.a(this.dB() * (float) (Math.PI / 180.0)), (double)(-asy.b(this.dB() * (float) (Math.PI / 180.0))));
                           $$19.a(this.dM().a(this), $$17);
                        }
                     }

                     this.dL().a(null, this.dq(), this.ds(), this.dw(), aqd.sv, this.da(), 1.0F, 1.0F);
                     this.fP();
                  }

                  if ($$0 instanceof alr && $$0.T) {
                     ((alr)$$0).c.b(new aax($$0));
                     $$0.T = false;
                     $$0.f($$15);
                  }

                  if ($$8) {
                     this.dL().a(null, this.dq(), this.ds(), this.dw(), aqd.sr, this.da(), 1.0F, 1.0F);
                     this.a($$0);
                  }

                  if (!$$8 && !$$9) {
                     if ($$5) {
                        this.dL().a(null, this.dq(), this.ds(), this.dw(), aqd.su, this.da(), 1.0F, 1.0F);
                     } else {
                        this.dL().a(null, this.dq(), this.ds(), this.dw(), aqd.sw, this.da(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.b($$0);
                  }

                  this.A($$0);
                  if ($$0 instanceof bkj) {
                     cov.a((bkj)$$0, this);
                  }

                  cov.b(this, $$0);
                  ckj $$20 = this.eS();
                  bjt $$21 = $$0;
                  if ($$0 instanceof byi) {
                     $$21 = ((byi)$$0).b;
                  }

                  if (!this.dL().B && !$$20.b() && $$21 instanceof bkj) {
                     $$20.a((bkj)$$21, this);
                     if ($$20.b()) {
                        this.a(bia.a, ckj.b);
                     }
                  }

                  if ($$0 instanceof bkj) {
                     float $$22 = $$12 - ((bkj)$$0).eu();
                     this.a(aqn.G, Math.round($$22 * 10.0F));
                     if ($$14 > 0) {
                        $$0.g($$14 * 4);
                     }

                     if (this.dL() instanceof alq && $$22 > 2.0F) {
                        int $$23 = (int)((double)$$22 * 0.5);
                        ((alq)this.dL()).a(js.h, $$0.dq(), $$0.e(0.5), $$0.dw(), $$23, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.A(0.1F);
               } else {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), aqd.st, this.da(), 1.0F, 1.0F);
                  if ($$13) {
                     $$0.ay();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(bkj $$0) {
      this.d((bjt)$$0);
   }

   public void s(boolean $$0) {
      float $$1 = 0.25F + (float)cov.g(this) * 0.05F;
      if ($$0) {
         $$1 += 0.75F;
      }

      if (this.ag.i() < $$1) {
         this.gn().a(ckm.uy, 100);
         this.ft();
         this.dL().a(this, (byte)30);
      }
   }

   @Override
   public void a(bjt $$0) {
   }

   public void b(bjt $$0) {
   }

   public void fP() {
      double $$0 = (double)(-asy.a(this.dB() * (float) (Math.PI / 180.0)));
      double $$1 = (double)asy.b(this.dB() * (float) (Math.PI / 180.0));
      if (this.dL() instanceof alq) {
         ((alq)this.dL()).a(js.ad, this.dq() + $$0, this.e(0.5), this.dw() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fQ() {
   }

   @Override
   public void a(bjt.c $$0) {
      super.a($$0);
      this.bR.b(this);
      if (this.bS != null && this.fU()) {
         this.r();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile fR() {
      return this.cr;
   }

   public ccw fS() {
      return this.cn;
   }

   public ccu fT() {
      return this.cp;
   }

   public void a(ckj $$0, ckj $$1, cfx $$2) {
   }

   public boolean fU() {
      return this.bS != this.bR;
   }

   public Either<ccx.a, atz> a(ht $$0) {
      this.b($$0);
      this.co = 0;
      return Either.right(atz.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fE();
      if (this.dL() instanceof alq && $$1) {
         ((alq)this.dL()).e();
      }

      this.co = $$0 ? 0 : 100;
   }

   @Override
   public void fE() {
      this.a(true, true);
   }

   public static Optional<eif> a(alq $$0, ht $$1, float $$2, boolean $$3, boolean $$4) {
      dgb $$5 = $$0.a_($$1);
      cua $$6 = $$5.b();
      if ($$6 instanceof dag && ($$3 || $$5.c(dag.d) > 0) && dag.a($$0)) {
         Optional<eif> $$7 = dag.a(bjx.bt, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dag.d, Integer.valueOf($$5.c(dag.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof ctt && ctt.a($$0)) {
         return ctt.a(bjx.bt, $$0, $$1, $$5.c(ctt.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dgb $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new eif((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean fV() {
      return this.fD() && this.co >= 100;
   }

   public int fW() {
      return this.co;
   }

   public void a(ui $$0, boolean $$1) {
   }

   public void a(afw $$0) {
      this.b(aqn.i.b($$0));
   }

   public void a(afw $$0, int $$1) {
      this.a(aqn.i.b($$0), $$1);
   }

   public void b(aqk<?> $$0) {
      this.a($$0, 1);
   }

   public void a(aqk<?> $$0, int $$1) {
   }

   public void a(aqk<?> $$0) {
   }

   public int a(Collection<cno<?>> $$0) {
      return 0;
   }

   public void a(cno<?> $$0, List<ckj> $$1) {
   }

   public void a(afw[] $$0) {
   }

   public int b(Collection<cno<?>> $$0) {
      return 0;
   }

   @Override
   public void fa() {
      super.fa();
      this.a(aqn.E);
      if (this.bX()) {
         this.A(0.2F);
      } else {
         this.A(0.05F);
      }
   }

   @Override
   public void h(eif $$0) {
      double $$1 = this.dq();
      double $$2 = this.ds();
      double $$3 = this.dw();
      if (this.bY() && !this.bN()) {
         double $$4 = this.bE().d;
         double $$5 = $$4 < -0.2 ? 0.085 : 0.06;
         if ($$4 <= 0.0 || this.bj || !this.dL().a_(ht.a(this.dq(), this.ds() + 1.0 - 0.1, this.dw())).u().c()) {
            eif $$6 = this.do();
            this.f($$6.b(0.0, ($$4 - $$6.d) * $$5, 0.0));
         }
      }

      if (this.cp.b && !this.bN()) {
         double $$7 = this.do().d;
         super.h($$0);
         eif $$8 = this.do();
         this.o($$8.c, $$7 * 0.6, $$8.e);
         this.n();
         this.b(7, false);
      } else {
         super.h($$0);
      }

      this.r(this.dq() - $$1, this.ds() - $$2, this.dw() - $$3);
   }

   @Override
   public void bd() {
      if (this.cp.b) {
         this.h(false);
      } else {
         super.bd();
      }
   }

   protected boolean h(ht $$0) {
      return !this.dL().a_($$0).o(this.dL(), $$0);
   }

   @Override
   public float fe() {
      return (float)this.b(blp.m);
   }

   public void r(double $$0, double $$1, double $$2) {
      if (!this.bN()) {
         if (this.bY()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(aqn.C, $$3);
               this.A(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(aqx.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(aqn.w, $$4);
               this.A(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.aX()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(aqn.s, $$5);
               this.A(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.d_()) {
            if ($$1 > 0.0) {
               this.a(aqn.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aA()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bX()) {
                  this.a(aqn.r, $$6);
                  this.A(0.1F * (float)$$6 * 0.01F);
               } else if (this.bW()) {
                  this.a(aqn.q, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(aqn.p, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fw()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(aqn.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(aqn.v, $$8);
            }
         }
      }
   }

   private void s(double $$0, double $$1, double $$2) {
      if (this.bN()) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         if ($$3 > 0) {
            bjt $$4 = this.cY();
            if ($$4 instanceof ceo) {
               this.a(aqn.x, $$3);
            } else if ($$4 instanceof ceq) {
               this.a(aqn.y, $$3);
            } else if ($$4 instanceof bwl) {
               this.a(aqn.z, $$3);
            } else if ($$4 instanceof bxt) {
               this.a(aqn.A, $$3);
            } else if ($$4 instanceof cay) {
               this.a(aqn.D, $$3);
            }
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bir $$2) {
      if (this.cp.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(aqn.t, (int)Math.round((double)$$0 * 100.0));
         }

         return super.a($$0, $$1, $$2);
      }
   }

   public boolean fX() {
      if (!this.aA() && !this.fw() && !this.aX() && !this.a(bji.y)) {
         ckj $$0 = this.c(bjy.e);
         if ($$0.a(ckm.nh) && cjd.d($$0)) {
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
   protected void bg() {
      if (!this.N_()) {
         super.bg();
      }
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      if (this.aX()) {
         this.aP();
         this.b($$1);
      } else {
         ht $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dgb $$3 = this.dL().a_($$2);
            if ($$3.a(aqs.bn)) {
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
   public bkj.a eF() {
      return new bkj.a(aqd.sH, aqd.sx);
   }

   @Override
   public boolean a(alq $$0, bkj $$1) {
      this.b(aqn.g.b($$1.ag()));
      return true;
   }

   @Override
   public void a(dgb $$0, eif $$1) {
      if (!this.cp.b) {
         super.a($$0, $$1);
      }
   }

   public void d(int $$0) {
      this.s($$0);
      this.ch = this.ch + (float)$$0 / (float)this.gb();
      this.cg = asy.a(this.cg + $$0, 0, Integer.MAX_VALUE);

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
   public void a(ckj $$0, int $$1) {
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

      if ($$0 > 0 && this.cf % 5 == 0 && (float)this.cq < (float)this.ah - 100.0F) {
         float $$1 = this.cf > 30 ? 1.0F : (float)this.cf / 30.0F;
         this.dL().a(null, this.dq(), this.ds(), this.dw(), aqd.sG, this.da(), $$1 * 0.75F, 1.0F);
         this.cq = this.ah;
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
      if (!this.cp.a) {
         if (!this.dL().B) {
            this.bT.a($$0);
         }
      }
   }

   public Optional<ccd> Y() {
      return Optional.empty();
   }

   public cfl gc() {
      return this.bT;
   }

   public boolean t(boolean $$0) {
      return this.cp.a || $$0 || this.bT.c();
   }

   public boolean gd() {
      return this.eu() > 0.0F && this.eu() < this.eL();
   }

   public boolean ge() {
      return this.cp.e;
   }

   public boolean a(ht $$0, hx $$1, ckj $$2) {
      if (this.cp.e) {
         return true;
      } else {
         ht $$3 = $$0.a($$1.g());
         dgf $$4 = new dgf(this.dL(), $$3, false);
         return $$2.a(this.dL().H_().d(jz.e), $$4);
      }
   }

   @Override
   public int ed() {
      if (!this.dL().X().b(cqv.d) && !this.N_()) {
         int $$0 = this.cf * 7;
         return $$0 > 100 ? 100 : $$0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean ee() {
      return true;
   }

   @Override
   public boolean cB() {
      return true;
   }

   @Override
   protected bjt.b aU() {
      return this.cp.b || this.aA() && this.bU() ? bjt.b.a : bjt.b.d;
   }

   @Override
   public void w() {
   }

   @Override
   public ui ab() {
      return ui.b(this.cr.getName());
   }

   public cgy gf() {
      return this.bQ;
   }

   @Override
   public ckj c(bjy $$0) {
      if ($$0 == bjy.a) {
         return this.cn.f();
      } else if ($$0 == bjy.b) {
         return this.cn.k.get(0);
      } else {
         return $$0.a() == bjy.a.b ? this.cn.j.get($$0.b()) : ckj.b;
      }
   }

   @Override
   protected boolean a(bjy $$0) {
      return $$0.a() == bjy.a.b;
   }

   @Override
   public void a(bjy $$0, ckj $$1) {
      this.e($$1);
      if ($$0 == bjy.a) {
         this.a($$0, this.cn.i.set(this.cn.l, $$1), $$1);
      } else if ($$0 == bjy.b) {
         this.a($$0, this.cn.k.set(0, $$1), $$1);
      } else if ($$0.a() == bjy.a.b) {
         this.a($$0, this.cn.j.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(ckj $$0) {
      return this.cn.e($$0);
   }

   @Override
   public Iterable<ckj> bJ() {
      return Lists.newArrayList(new ckj[]{this.eS(), this.eT()});
   }

   @Override
   public Iterable<ckj> bK() {
      return this.cn.j;
   }

   public boolean h(rt $$0) {
      if (this.bN() || !this.aA() || this.aX() || this.aA) {
         return false;
      } else if (this.gj().g()) {
         this.i($$0);
         this.cm = this.dL().V();
         return true;
      } else if (this.gk().g()) {
         this.j($$0);
         this.cm = this.dL().V();
         return true;
      } else {
         return false;
      }
   }

   protected void gg() {
      if (this.cm + 20L < this.dL().V()) {
         this.k(this.gj());
         this.i(new rt());
         this.k(this.gk());
         this.j(new rt());
      }
   }

   private void k(rt $$0) {
      if (!this.dL().B && !$$0.g()) {
         bjx.a($$0, this.dL()).ifPresent($$0x -> {
            if ($$0x instanceof ble) {
               ((ble)$$0x).b(this.ay);
            }

            $$0x.e(this.dq(), this.ds() + 0.7F, this.dw());
            ((alq)this.dL()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean N_();

   @Override
   public boolean bq() {
      return !this.N_() && super.bq();
   }

   @Override
   public boolean bY() {
      return !this.cp.b && !this.N_() && super.bY();
   }

   public abstract boolean f();

   @Override
   public boolean cy() {
      return !this.cp.b;
   }

   public eje gh() {
      return this.dL().I();
   }

   @Override
   public ui O_() {
      uw $$0 = ejc.a(this.cf(), this.ab());
      return this.a($$0);
   }

   private uw a(uw $$0) {
      String $$1 = this.fR().getName();
      return $$0.a($$1x -> $$1x.a(new ug(ug.a.d, "/tell " + $$1 + " ")).a(this.cF()).a($$1));
   }

   @Override
   public String cx() {
      return this.fR().getName();
   }

   @Override
   public float b(bkv $$0, bju $$1) {
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
      this.al().b(e, $$0);
   }

   @Override
   public float fk() {
      return this.al().b(e);
   }

   public boolean a(ccy $$0) {
      return (this.al().b(bM) & $$0.a()) == $$0.a();
   }

   @Override
   public blb a_(int $$0) {
      if ($$0 >= 0 && $$0 < this.cn.i.size()) {
         return blb.a(this.cn, $$0);
      } else {
         int $$1 = $$0 - 200;
         return $$1 >= 0 && $$1 < this.bQ.b() ? blb.a(this.bQ, $$1) : super.a_($$0);
      }
   }

   public boolean gi() {
      return this.cs;
   }

   public void u(boolean $$0) {
      this.cs = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.cp.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bkd fm() {
      return this.an.b(bN) == 0 ? bkd.a : bkd.b;
   }

   public void a(bkd $$0) {
      this.an.b(bN, (byte)($$0 == bkd.a ? 0 : 1));
   }

   public rt gj() {
      return this.an.b(bO);
   }

   protected void i(rt $$0) {
      this.an.b(bO, $$0);
   }

   public rt gk() {
      return this.an.b(bP);
   }

   protected void j(rt $$0) {
      this.an.b(bP, $$0);
   }

   public float gl() {
      return (float)(1.0 / this.b(blp.e) * 20.0);
   }

   public float B(float $$0) {
      return asy.a(((float)this.aP + $$0) / this.gl(), 0.0F, 1.0F);
   }

   public void gm() {
      this.aP = 0;
   }

   public ckf gn() {
      return this.cu;
   }

   @Override
   protected float aJ() {
      return !this.cp.b && !this.fw() ? super.aJ() : 1.0F;
   }

   public float go() {
      return (float)this.b(blp.j);
   }

   public boolean gp() {
      return this.cp.d && this.D() >= 2;
   }

   @Override
   public boolean f(ckj $$0) {
      bjy $$1 = bkl.h($$0);
      return this.c($$1).b();
   }

   @Override
   public bju a(bkv $$0) {
      return c.getOrDefault($$0, bL);
   }

   @Override
   public ImmutableList<bkv> fA() {
      return ImmutableList.of(bkv.a, bkv.f, bkv.d);
   }

   @Override
   public ckj g(ckj $$0) {
      if (!($$0.d() instanceof ckz)) {
         return ckj.b;
      } else {
         Predicate<ckj> $$1 = ((ckz)$$0.d()).e();
         ckj $$2 = ckz.a(this, $$1);
         if (!$$2.b()) {
            return $$2;
         } else {
            $$1 = ((ckz)$$0.d()).b();

            for (int $$3 = 0; $$3 < this.cn.b(); $$3++) {
               ckj $$4 = this.cn.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cp.d ? new ckj(ckm.nH) : ckj.b;
         }
      }
   }

   @Override
   public ckj a(cqz $$0, ckj $$1) {
      this.gc().a($$1.d(), $$1);
      this.b(aqn.c.b($$1.d()));
      $$0.a(null, this.dq(), this.ds(), this.dw(), aqd.sz, aqe.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof alr) {
         al.z.a((alr)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dgb $$0) {
      return this.cp.b || super.c($$0);
   }

   @Override
   public eif q(float $$0) {
      double $$1 = 0.22 * (this.fm() == bkd.b ? -1.0 : 1.0);
      float $$2 = asy.i($$0 * 0.5F, this.dD(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = asy.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      if (this.fw() || this.fj()) {
         eif $$4 = this.f($$0);
         eif $$5 = this.do();
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

         return this.l($$0).e(new eif($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.bZ()) {
         return this.l($$0).e(new eif($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cG().c() - 1.0;
         double $$13 = this.bW() ? -0.2 : 0.07;
         return this.l($$0).e(new eif($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dK() {
      return true;
   }

   public boolean gq() {
      return this.fn() && this.fp().a(ckm.qj);
   }

   @Override
   public boolean dJ() {
      return false;
   }

   public Optional<ia> gr() {
      return this.cv;
   }

   public void a(Optional<ia> $$0) {
      this.cv = $$0;
   }

   @Override
   public float eD() {
      return this.cl;
   }

   @Override
   public void m(float $$0) {
      super.m($$0);
      this.cl = $$0;
   }

   @Override
   public boolean dE() {
      return true;
   }

   @Override
   protected float fd() {
      if (this.cp.b && !this.bN()) {
         return this.bX() ? this.cp.a() * 2.0F : this.cp.a();
      } else {
         return this.bX() ? 0.025999999F : 0.02F;
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
      b(ui.c("block.minecraft.bed.no_sleep")),
      c(ui.c("block.minecraft.bed.too_far_away")),
      d(ui.c("block.minecraft.bed.obstructed")),
      e,
      f(ui.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final ui g;

      private a() {
         this.g = null;
      }

      private a(ui $$0) {
         this.g = $$0;
      }

      @Nullable
      public ui a() {
         return this.g;
      }
   }
}
