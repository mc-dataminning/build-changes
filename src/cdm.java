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

public abstract class cdm extends bky {
   private static final Logger b = LogUtils.getLogger();
   public static final int bA = 16;
   public static final bks bB = bks.b;
   public static final int bC = 0;
   public static final int bD = 20;
   public static final int bE = 100;
   public static final int bF = 10;
   public static final int bG = 200;
   public static final float bH = 1.5F;
   public static final float bI = 0.6F;
   public static final float bJ = 0.6F;
   public static final float bK = 1.62F;
   public static final bkj bL = bkj.b(0.6F, 1.8F);
   private static final Map<blk, bkj> c = ImmutableMap.builder()
      .put(blk.a, bL)
      .put(blk.c, v)
      .put(blk.b, bkj.b(0.6F, 0.6F))
      .put(blk.d, bkj.b(0.6F, 0.6F))
      .put(blk.e, bkj.b(0.6F, 0.6F))
      .put(blk.f, bkj.b(0.6F, 1.5F))
      .put(blk.h, bkj.c(0.2F, 0.2F))
      .build();
   private static final int d = 25;
   private static final afm<Float> e = afp.a(cdm.class, afo.d);
   private static final afm<Integer> f = afp.a(cdm.class, afo.b);
   protected static final afm<Byte> bM = afp.a(cdm.class, afo.a);
   protected static final afm<Byte> bN = afp.a(cdm.class, afo.a);
   protected static final afm<rz> bO = afp.a(cdm.class, afo.s);
   protected static final afm<rz> bP = afp.a(cdm.class, afo.s);
   private long cm;
   private final cdl cn = new cdl(this);
   protected chq bQ = new chq();
   public final chf bR;
   public cge bS;
   protected cga bT = new cga();
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
   private final cdj cp = new cdj();
   public int cf;
   public int cg;
   public float ch;
   protected int ci;
   protected final float cj = 0.02F;
   private int cq;
   private final GameProfile cr;
   private boolean cs;
   private clb ct = clb.b;
   private final ckx cu = this.k();
   private Optional<ia> cv = Optional.empty();
   @Nullable
   public cea ck;
   protected float cl;

   public cdm(crs $$0, ht $$1, float $$2, GameProfile $$3) {
      super(bkm.bt, $$0);
      this.a_($$3.getId());
      this.cr = $$3;
      this.bR = new chf(this.cn, !$$0.B, this);
      this.bS = this.bR;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bg = 180.0F;
   }

   public boolean a(crs $$0, ht $$1, crp $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == crp.d) {
         return true;
      } else if (this.ge()) {
         return false;
      } else {
         clb $$3 = this.eS();
         return $$3.b() || !$$3.b($$0.H_().d(jz.e), new dha($$0, $$1, false));
      }
   }

   public static bmd.a fH() {
      return bky.dP().a(bme.c, 1.0).a(bme.m, 0.1F).a(bme.e).a(bme.j);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(e, 0.0F);
      this.an.a(f, 0);
      this.an.a(bM, (byte)0);
      this.an.a(bN, (byte)bB.a());
      this.an.a(bO, new rz());
      this.an.a(bP, new rz());
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
         this.a(aqx.k);
         this.a(aqx.l);
         if (this.bv()) {
            this.a(aqx.m);
         }

         if (this.bU()) {
            this.a(aqx.o);
         }

         if (!this.fD()) {
            this.a(aqx.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = ati.a(this.dq(), -2.9999999E7, 2.9999999E7);
      double $$2 = ati.a(this.dw(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dq() || $$2 != this.dw()) {
         this.e($$1, this.ds(), $$2);
      }

      this.aP++;
      clb $$3 = this.eS();
      if (!clb.a(this.ct, $$3)) {
         if (!clb.b(this.ct, $$3)) {
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
      this.ce = this.a(arh.a);
      return this.ce;
   }

   private void s() {
      clb $$0 = this.c(bkn.f);
      if ($$0.a(cle.nC) && !this.a(arh.a)) {
         this.b(new bjv(bjx.m, 200, 0, false, false, true));
      }
   }

   protected ckx k() {
      return new ckx();
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
      if (this.g(blk.d)) {
         blk $$0;
         if (this.fw()) {
            $$0 = blk.b;
         } else if (this.fD()) {
            $$0 = blk.c;
         } else if (this.bY()) {
            $$0 = blk.d;
         } else if (this.fj()) {
            $$0 = blk.e;
         } else if (this.bR() && !this.cp.b) {
            $$0 = blk.f;
         } else {
            $$0 = blk.a;
         }

         blk $$6;
         if (this.N_() || this.bN() || this.g($$0)) {
            $$6 = $$0;
         } else if (this.g(blk.f)) {
            $$6 = blk.f;
         } else {
            $$6 = blk.d;
         }

         this.b($$6);
      }
   }

   protected boolean g(blk $$0) {
      return this.dL().a(this, this.a($$0).a(this.dj()).h(1.0E-7));
   }

   @Override
   public int av() {
      return Math.max(1, this.dL().X().c(this.cp.a ? cro.F : cro.E));
   }

   @Override
   protected aqm aL() {
      return aqn.sM;
   }

   @Override
   protected aqm aM() {
      return aqn.sK;
   }

   @Override
   protected aqm aN() {
      return aqn.sL;
   }

   @Override
   public int bI() {
      return 10;
   }

   @Override
   public void a(aqm $$0, float $$1, float $$2) {
      this.dL().a(this, this.dq(), this.ds(), this.dw(), $$0, this.da(), $$1, $$2);
   }

   public void a(aqm $$0, aqo $$1, float $$2, float $$3) {
   }

   @Override
   public aqo da() {
      return aqo.h;
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

      if (this.dL().ai() == bin.a && this.dL().X().b(cro.k)) {
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
      this.w((float)this.b(bme.m));
      float $$1;
      if (this.aA() && !this.ev() && !this.bY()) {
         $$1 = Math.min(0.1F, (float)this.do().h());
      } else {
         $$1 = 0.0F;
      }

      this.bW = this.bW + ($$1 - this.bW) * 0.4F;
      if (this.eu() > 0.0F && !this.N_()) {
         ejd $$2;
         if (this.bN() && !this.cY().dG()) {
            $$2 = this.cG().b(this.cY().cG()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cG().c(1.0, 0.5, 1.0);
         }

         List<bki> $$4 = this.dL().a_(this, $$2);
         List<bki> $$5 = Lists.newArrayList();

         for (bki $$6 : $$4) {
            if ($$6.ag() == bkm.J) {
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

   private void c(@Nullable rz $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dL().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bkm.a($$1).filter($$0x -> $$0x == bkm.at).ifPresent($$0x -> {
            if (!bwz.a(this.dL(), this)) {
               this.dL().a(null, this.dq(), this.ds(), this.dw(), bwz.a(this.dL(), this.dL().z), this.da(), 1.0F, bwz.a(this.dL().z));
            }
         });
      }
   }

   private void c(bki $$0) {
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
   public void a(bjg $$0) {
      super.a($$0);
      this.ap();
      if (!this.N_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-ati.b((this.eD() + this.dB()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-ati.a((this.eD() + this.dB()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(aqx.N);
      this.a(aqx.i.b(aqx.m));
      this.a(aqx.i.b(aqx.n));
      this.ay();
      this.a_(false);
      this.a(Optional.of(ia.a(this.dL().ac(), this.dl())));
   }

   @Override
   protected void ex() {
      super.ex();
      if (!this.dL().X().b(cro.d)) {
         this.fO();
         this.cn.k();
      }
   }

   protected void fO() {
      for (int $$0 = 0; $$0 < this.cn.b(); $$0++) {
         clb $$1 = this.cn.a($$0);
         if (!$$1.b() && cpo.e($$1)) {
            this.cn.b($$0);
         }
      }
   }

   @Override
   protected aqm d(bjg $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected aqm m_() {
      return aqn.sC;
   }

   @Nullable
   public caf a(clb $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public caf a(clb $$0, boolean $$1, boolean $$2) {
      if ($$0.b()) {
         return null;
      } else {
         if (this.dL().B) {
            this.a(bip.a);
         }

         double $$3 = this.du() - 0.3F;
         caf $$4 = new caf(this.dL(), this.dq(), $$3, this.dw(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.a(this);
         }

         if ($$1) {
            float $$5 = this.ag.i() * 0.5F;
            float $$6 = this.ag.i() * (float) (Math.PI * 2);
            $$4.o((double)(-ati.a($$6) * $$5), 0.2F, (double)(ati.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = ati.a(this.dD() * (float) (Math.PI / 180.0));
            float $$9 = ati.b(this.dD() * (float) (Math.PI / 180.0));
            float $$10 = ati.a(this.dB() * (float) (Math.PI / 180.0));
            float $$11 = ati.b(this.dB() * (float) (Math.PI / 180.0));
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

   public float d(dgw $$0) {
      float $$1 = this.cn.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = cpo.g(this);
         clb $$3 = this.eS();
         if ($$2 > 0 && !$$3.b()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bjw.a(this)) {
         $$1 *= 1.0F + (float)(bjw.b(this) + 1) * 0.2F;
      }

      if (this.a(bjx.d)) {
         $$1 *= switch (this.b(bjx.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      if (this.a(arh.a) && !cpo.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aA()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dgw $$0) {
      return !$$0.y() || this.cn.f().b($$0);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a_(this.cr.getId());
      sf $$1 = $$0.c("Inventory", 10);
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
      this.a(bme.m).a((double)this.cp.b());
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
         this.a(ia.a.parse(sn.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      so.g($$0);
      $$0.a("Inventory", this.cn.a(new sf()));
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

      this.gr().flatMap($$0x -> ia.a.encodeStart(sn.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
   }

   @Override
   public boolean b(bjg $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(are.n)) {
         return !this.dL().X().b(cro.G);
      } else if ($$0.a(are.m)) {
         return !this.dL().X().b(cro.H);
      } else if ($$0.a(are.i)) {
         return !this.dL().X().b(cro.I);
      } else {
         return $$0.a(are.o) ? !this.dL().X().b(cro.J) : false;
      }
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cp.a && !$$0.a(are.d)) {
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
               if (this.dL().ai() == bin.a) {
                  $$1 = 0.0F;
               }

               if (this.dL().ai() == bin.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dL().ai() == bin.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bky $$0) {
      super.d($$0);
      if ($$0.fG()) {
         this.s(true);
      }
   }

   @Override
   public boolean en() {
      return !this.fT().a && super.en();
   }

   public boolean a(cdm $$0) {
      ekj $$1 = this.cf();
      ekj $$2 = $$0.cf();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bjg $$0, float $$1) {
      this.cn.a($$0, $$1, cdl.g);
   }

   @Override
   protected void c(bjg $$0, float $$1) {
      this.cn.a($$0, $$1, cdl.h);
   }

   @Override
   protected void u(float $$0) {
      if (this.bv.a(cle.uz)) {
         if (!this.dL().B) {
            this.b(aqx.c.b(this.bv.d()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + ati.d($$0);
            bip $$2 = this.fo();
            this.bv.a($$1, this, $$1x -> $$1x.d($$2));
            if (this.bv.b()) {
               if ($$2 == bip.a) {
                  this.a(bkn.a, clb.b);
               } else {
                  this.a(bkn.b, clb.b);
               }

               this.bv = clb.b;
               this.a(aqn.uV, 0.8F, 0.8F + this.dL().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bjg $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fk(), 0.0F);
         this.y(this.fk() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(aqx.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.A($$0.a());
            this.eJ().a($$0, var7);
            this.c(this.eu() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(aqx.J, Math.round(var7 * 10.0F));
            }

            this.a(dlg.o);
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

   public void a(dga $$0, boolean $$1) {
   }

   public void a(cqt $$0) {
   }

   public void a(dfb $$0) {
   }

   public void a(dgf $$0) {
   }

   public void a(dfr $$0) {
   }

   public void a(byi $$0, bij $$1) {
   }

   public OptionalInt a(@Nullable bit $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, cqr $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(clb $$0, bip $$1) {
   }

   public biq a(bki $$0, bip $$1) {
      if (this.N_()) {
         if ($$0 instanceof bit) {
            this.a((bit)$$0);
         }

         return biq.d;
      } else {
         clb $$2 = this.b($$1);
         clb $$3 = $$2.p();
         biq $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cp.d && $$2 == this.b($$1) && $$2.L() < $$3.L()) {
               $$2.f($$3.L());
            }

            return $$4;
         } else {
            if (!$$2.b() && $$0 instanceof bky) {
               if (this.cp.d) {
                  $$2 = $$3;
               }

               biq $$5 = $$2.a(this, (bky)$$0, $$1);
               if ($$5.a()) {
                  this.dL().a(dlg.r, $$0.dj(), dlg.a.a(this));
                  if ($$2.b() && !this.cp.d) {
                     this.a($$1, clb.b);
                  }

                  return $$5;
               }
            }

            return biq.d;
         }
      }
   }

   @Override
   protected float l(bki $$0) {
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
   protected eji a(eji $$0, ble $$1) {
      if (!this.cp.b && $$0.d <= 0.0 && ($$1 == ble.a || $$1 == ble.b) && this.fK() && this.y()) {
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

         $$0 = new eji($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean y() {
      return this.aA() || this.ab < this.dF() && !this.dL().a(this, this.cG().d(0.0, (double)(this.ab - this.dF()), 0.0));
   }

   public void d(bki $$0) {
      if ($$0.cp()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.b(bme.c);
            float $$2;
            if ($$0 instanceof bky) {
               $$2 = cpo.a(this.eS(), ((bky)$$0).eR());
            } else {
               $$2 = cpo.a(this.eS(), bld.a);
            }

            float $$4 = this.B(0.5F);
            $$1 *= 0.2F + $$4 * $$4 * 0.8F;
            $$2 *= $$4;
            this.gm();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$5 = $$4 > 0.9F;
               boolean $$6 = false;
               int $$7 = 0;
               $$7 += cpo.c(this);
               if (this.bX() && $$5) {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), aqn.su, this.da(), 1.0F, 1.0F);
                  $$7++;
                  $$6 = true;
               }

               boolean $$8 = $$5 && this.ab > 0.0F && !this.aA() && !this.d_() && !this.aX() && !this.a(bjx.o) && !this.bN() && $$0 instanceof bky;
               $$8 = $$8 && !this.bX();
               if ($$8) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$9 = false;
               double $$10 = (double)(this.Y - this.X);
               if ($$5 && !$$8 && !$$6 && this.aA() && $$10 < (double)this.fe()) {
                  clb $$11 = this.b(bip.a);
                  if ($$11.d() instanceof cmm) {
                     $$9 = true;
                  }
               }

               float $$12 = 0.0F;
               boolean $$13 = false;
               int $$14 = cpo.d(this);
               if ($$0 instanceof bky) {
                  $$12 = ((bky)$$0).eu();
                  if ($$14 > 0 && !$$0.bM()) {
                     $$13 = true;
                     $$0.g(1);
                  }
               }

               eji $$15 = $$0.do();
               boolean $$16 = $$0.a(this.dM().a(this), $$1);
               if ($$16) {
                  if ($$7 > 0) {
                     if ($$0 instanceof bky) {
                        ((bky)$$0)
                           .q(
                              (double)((float)$$7 * 0.5F),
                              (double)ati.a(this.dB() * (float) (Math.PI / 180.0)),
                              (double)(-ati.b(this.dB() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-ati.a(this.dB() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F),
                           0.1,
                           (double)(ati.b(this.dB() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F)
                        );
                     }

                     this.f(this.do().d(0.6, 1.0, 0.6));
                     this.g(false);
                  }

                  if ($$9) {
                     float $$17 = 1.0F + cpo.a(this) * $$1;

                     for (bky $$19 : this.dL().a(bky.class, $$0.cG().c(1.0, 0.25, 1.0))) {
                        if ($$19 != this && $$19 != $$0 && !this.s($$19) && (!($$19 instanceof bzv) || !((bzv)$$19).y()) && this.f($$19) < 9.0) {
                           $$19.q(0.4F, (double)ati.a(this.dB() * (float) (Math.PI / 180.0)), (double)(-ati.b(this.dB() * (float) (Math.PI / 180.0))));
                           $$19.a(this.dM().a(this), $$17);
                        }
                     }

                     this.dL().a(null, this.dq(), this.ds(), this.dw(), aqn.sx, this.da(), 1.0F, 1.0F);
                     this.fP();
                  }

                  if ($$0 instanceof amb && $$0.T) {
                     ((amb)$$0).c.b(new abg($$0));
                     $$0.T = false;
                     $$0.f($$15);
                  }

                  if ($$8) {
                     this.dL().a(null, this.dq(), this.ds(), this.dw(), aqn.st, this.da(), 1.0F, 1.0F);
                     this.a($$0);
                  }

                  if (!$$8 && !$$9) {
                     if ($$5) {
                        this.dL().a(null, this.dq(), this.ds(), this.dw(), aqn.sw, this.da(), 1.0F, 1.0F);
                     } else {
                        this.dL().a(null, this.dq(), this.ds(), this.dw(), aqn.sy, this.da(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.b($$0);
                  }

                  this.A($$0);
                  if ($$0 instanceof bky) {
                     cpo.a((bky)$$0, this);
                  }

                  cpo.b(this, $$0);
                  clb $$20 = this.eS();
                  bki $$21 = $$0;
                  if ($$0 instanceof byx) {
                     $$21 = ((byx)$$0).b;
                  }

                  if (!this.dL().B && !$$20.b() && $$21 instanceof bky) {
                     $$20.a((bky)$$21, this);
                     if ($$20.b()) {
                        this.a(bip.a, clb.b);
                     }
                  }

                  if ($$0 instanceof bky) {
                     float $$22 = $$12 - ((bky)$$0).eu();
                     this.a(aqx.G, Math.round($$22 * 10.0F));
                     if ($$14 > 0) {
                        $$0.g($$14 * 4);
                     }

                     if (this.dL() instanceof ama && $$22 > 2.0F) {
                        int $$23 = (int)((double)$$22 * 0.5);
                        ((ama)this.dL()).a(js.h, $$0.dq(), $$0.e(0.5), $$0.dw(), $$23, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.A(0.1F);
               } else {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), aqn.sv, this.da(), 1.0F, 1.0F);
                  if ($$13) {
                     $$0.ay();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(bky $$0) {
      this.d((bki)$$0);
   }

   public void s(boolean $$0) {
      float $$1 = 0.25F + (float)cpo.g(this) * 0.05F;
      if ($$0) {
         $$1 += 0.75F;
      }

      if (this.ag.i() < $$1) {
         this.gn().a(cle.uz, 100);
         this.ft();
         this.dL().a(this, (byte)30);
      }
   }

   @Override
   public void a(bki $$0) {
   }

   public void b(bki $$0) {
   }

   public void fP() {
      double $$0 = (double)(-ati.a(this.dB() * (float) (Math.PI / 180.0)));
      double $$1 = (double)ati.b(this.dB() * (float) (Math.PI / 180.0));
      if (this.dL() instanceof ama) {
         ((ama)this.dL()).a(js.ae, this.dq() + $$0, this.e(0.5), this.dw() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fQ() {
   }

   @Override
   public void a(bki.c $$0) {
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

   public cdl fS() {
      return this.cn;
   }

   public cdj fT() {
      return this.cp;
   }

   public void a(clb $$0, clb $$1, cgm $$2) {
   }

   public boolean fU() {
      return this.bS != this.bR;
   }

   public Either<cdm.a, auj> a(ht $$0) {
      this.b($$0);
      this.co = 0;
      return Either.right(auj.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fE();
      if (this.dL() instanceof ama && $$1) {
         ((ama)this.dL()).e();
      }

      this.co = $$0 ? 0 : 100;
   }

   @Override
   public void fE() {
      this.a(true, true);
   }

   public static Optional<eji> a(ama $$0, ht $$1, float $$2, boolean $$3, boolean $$4) {
      dgw $$5 = $$0.a_($$1);
      cut $$6 = $$5.b();
      if ($$6 instanceof dba && ($$3 || $$5.c(dba.d) > 0) && dba.a($$0)) {
         Optional<eji> $$7 = dba.a(bkm.bt, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dba.d, Integer.valueOf($$5.c(dba.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof cum && cum.a($$0)) {
         return cum.a(bkm.bt, $$0, $$1, $$5.c(cum.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dgw $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new eji((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean fV() {
      return this.fD() && this.co >= 100;
   }

   public int fW() {
      return this.co;
   }

   public void a(ur $$0, boolean $$1) {
   }

   public void a(agg $$0) {
      this.b(aqx.i.b($$0));
   }

   public void a(agg $$0, int $$1) {
      this.a(aqx.i.b($$0), $$1);
   }

   public void b(aqu<?> $$0) {
      this.a($$0, 1);
   }

   public void a(aqu<?> $$0, int $$1) {
   }

   public void a(aqu<?> $$0) {
   }

   public int a(Collection<coh<?>> $$0) {
      return 0;
   }

   public void a(coh<?> $$0, List<clb> $$1) {
   }

   public void a(agg[] $$0) {
   }

   public int b(Collection<coh<?>> $$0) {
      return 0;
   }

   @Override
   public void fa() {
      super.fa();
      this.a(aqx.E);
      if (this.bX()) {
         this.A(0.2F);
      } else {
         this.A(0.05F);
      }
   }

   @Override
   public void h(eji $$0) {
      double $$1 = this.dq();
      double $$2 = this.ds();
      double $$3 = this.dw();
      if (this.bY() && !this.bN()) {
         double $$4 = this.bE().d;
         double $$5 = $$4 < -0.2 ? 0.085 : 0.06;
         if ($$4 <= 0.0 || this.bj || !this.dL().a_(ht.a(this.dq(), this.ds() + 1.0 - 0.1, this.dw())).u().c()) {
            eji $$6 = this.do();
            this.f($$6.b(0.0, ($$4 - $$6.d) * $$5, 0.0));
         }
      }

      if (this.cp.b && !this.bN()) {
         double $$7 = this.do().d;
         super.h($$0);
         eji $$8 = this.do();
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
      return (float)this.b(bme.m);
   }

   public void r(double $$0, double $$1, double $$2) {
      if (!this.bN()) {
         if (this.bY()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(aqx.C, $$3);
               this.A(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(arh.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(aqx.w, $$4);
               this.A(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.aX()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(aqx.s, $$5);
               this.A(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.d_()) {
            if ($$1 > 0.0) {
               this.a(aqx.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aA()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bX()) {
                  this.a(aqx.r, $$6);
                  this.A(0.1F * (float)$$6 * 0.01F);
               } else if (this.bW()) {
                  this.a(aqx.q, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(aqx.p, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fw()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(aqx.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(aqx.v, $$8);
            }
         }
      }
   }

   private void s(double $$0, double $$1, double $$2) {
      if (this.bN()) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         if ($$3 > 0) {
            bki $$4 = this.cY();
            if ($$4 instanceof cfd) {
               this.a(aqx.x, $$3);
            } else if ($$4 instanceof cff) {
               this.a(aqx.y, $$3);
            } else if ($$4 instanceof bxa) {
               this.a(aqx.z, $$3);
            } else if ($$4 instanceof byi) {
               this.a(aqx.A, $$3);
            } else if ($$4 instanceof cbn) {
               this.a(aqx.D, $$3);
            }
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bjg $$2) {
      if (this.cp.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(aqx.t, (int)Math.round((double)$$0 * 100.0));
         }

         return super.a($$0, $$1, $$2);
      }
   }

   public boolean fX() {
      if (!this.aA() && !this.fw() && !this.aX() && !this.a(bjx.y)) {
         clb $$0 = this.c(bkn.e);
         if ($$0.a(cle.nh) && cjv.d($$0)) {
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
   protected void b(ht $$0, dgw $$1) {
      if (this.aX()) {
         this.aP();
         this.b($$1);
      } else {
         ht $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dgw $$3 = this.dL().a_($$2);
            if ($$3.a(arc.bn)) {
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
   public bky.a eF() {
      return new bky.a(aqn.sJ, aqn.sz);
   }

   @Override
   public boolean a(ama $$0, bky $$1) {
      this.b(aqx.g.b($$1.ag()));
      return true;
   }

   @Override
   public void a(dgw $$0, eji $$1) {
      if (!this.cp.b) {
         super.a($$0, $$1);
      }
   }

   public void d(int $$0) {
      this.s($$0);
      this.ch = this.ch + (float)$$0 / (float)this.gb();
      this.cg = ati.a(this.cg + $$0, 0, Integer.MAX_VALUE);

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
   public void a(clb $$0, int $$1) {
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
         this.dL().a(null, this.dq(), this.ds(), this.dw(), aqn.sI, this.da(), $$1 * 0.75F, 1.0F);
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

   public Optional<ccs> Y() {
      return Optional.empty();
   }

   public cga gc() {
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

   public boolean a(ht $$0, hx $$1, clb $$2) {
      if (this.cp.e) {
         return true;
      } else {
         ht $$3 = $$0.a($$1.g());
         dha $$4 = new dha(this.dL(), $$3, false);
         return $$2.a(this.dL().H_().d(jz.e), $$4);
      }
   }

   @Override
   public int ed() {
      if (!this.dL().X().b(cro.d) && !this.N_()) {
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
   protected bki.b aU() {
      return this.cp.b || this.aA() && this.bU() ? bki.b.a : bki.b.d;
   }

   @Override
   public void w() {
   }

   @Override
   public ur ab() {
      return ur.b(this.cr.getName());
   }

   public chq gf() {
      return this.bQ;
   }

   @Override
   public clb c(bkn $$0) {
      if ($$0 == bkn.a) {
         return this.cn.f();
      } else if ($$0 == bkn.b) {
         return this.cn.k.get(0);
      } else {
         return $$0.a() == bkn.a.b ? this.cn.j.get($$0.b()) : clb.b;
      }
   }

   @Override
   protected boolean a(bkn $$0) {
      return $$0.a() == bkn.a.b;
   }

   @Override
   public void a(bkn $$0, clb $$1) {
      this.e($$1);
      if ($$0 == bkn.a) {
         this.a($$0, this.cn.i.set(this.cn.l, $$1), $$1);
      } else if ($$0 == bkn.b) {
         this.a($$0, this.cn.k.set(0, $$1), $$1);
      } else if ($$0.a() == bkn.a.b) {
         this.a($$0, this.cn.j.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(clb $$0) {
      return this.cn.e($$0);
   }

   @Override
   public Iterable<clb> bJ() {
      return Lists.newArrayList(new clb[]{this.eS(), this.eT()});
   }

   @Override
   public Iterable<clb> bK() {
      return this.cn.j;
   }

   public boolean h(rz $$0) {
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
         this.i(new rz());
         this.k(this.gk());
         this.j(new rz());
      }
   }

   private void k(rz $$0) {
      if (!this.dL().B && !$$0.g()) {
         bkm.a($$0, this.dL()).ifPresent($$0x -> {
            if ($$0x instanceof blt) {
               ((blt)$$0x).b(this.ay);
            }

            $$0x.e(this.dq(), this.ds() + 0.7F, this.dw());
            ((ama)this.dL()).c($$0x);
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

   public ekh gh() {
      return this.dL().I();
   }

   @Override
   public ur O_() {
      vf $$0 = ekf.a(this.cf(), this.ab());
      return this.a($$0);
   }

   private vf a(vf $$0) {
      String $$1 = this.fR().getName();
      return $$0.a($$1x -> $$1x.a(new up(up.a.d, "/tell " + $$1 + " ")).a(this.cF()).a($$1));
   }

   @Override
   public String cx() {
      return this.fR().getName();
   }

   @Override
   public float b(blk $$0, bkj $$1) {
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

   public boolean a(cdn $$0) {
      return (this.al().b(bM) & $$0.a()) == $$0.a();
   }

   @Override
   public blq a_(int $$0) {
      if ($$0 >= 0 && $$0 < this.cn.i.size()) {
         return blq.a(this.cn, $$0);
      } else {
         int $$1 = $$0 - 200;
         return $$1 >= 0 && $$1 < this.bQ.b() ? blq.a(this.bQ, $$1) : super.a_($$0);
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
   public bks fm() {
      return this.an.b(bN) == 0 ? bks.a : bks.b;
   }

   public void a(bks $$0) {
      this.an.b(bN, (byte)($$0 == bks.a ? 0 : 1));
   }

   public rz gj() {
      return this.an.b(bO);
   }

   protected void i(rz $$0) {
      this.an.b(bO, $$0);
   }

   public rz gk() {
      return this.an.b(bP);
   }

   protected void j(rz $$0) {
      this.an.b(bP, $$0);
   }

   public float gl() {
      return (float)(1.0 / this.b(bme.e) * 20.0);
   }

   public float B(float $$0) {
      return ati.a(((float)this.aP + $$0) / this.gl(), 0.0F, 1.0F);
   }

   public void gm() {
      this.aP = 0;
   }

   public ckx gn() {
      return this.cu;
   }

   @Override
   protected float aJ() {
      return !this.cp.b && !this.fw() ? super.aJ() : 1.0F;
   }

   public float go() {
      return (float)this.b(bme.j);
   }

   public boolean gp() {
      return this.cp.d && this.D() >= 2;
   }

   @Override
   public boolean f(clb $$0) {
      bkn $$1 = bla.h($$0);
      return this.c($$1).b();
   }

   @Override
   public bkj a(blk $$0) {
      return c.getOrDefault($$0, bL);
   }

   @Override
   public ImmutableList<blk> fA() {
      return ImmutableList.of(blk.a, blk.f, blk.d);
   }

   @Override
   public clb g(clb $$0) {
      if (!($$0.d() instanceof clr)) {
         return clb.b;
      } else {
         Predicate<clb> $$1 = ((clr)$$0.d()).e();
         clb $$2 = clr.a(this, $$1);
         if (!$$2.b()) {
            return $$2;
         } else {
            $$1 = ((clr)$$0.d()).b();

            for (int $$3 = 0; $$3 < this.cn.b(); $$3++) {
               clb $$4 = this.cn.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cp.d ? new clb(cle.nH) : clb.b;
         }
      }
   }

   @Override
   public clb a(crs $$0, clb $$1) {
      this.gc().a($$1.d(), $$1);
      this.b(aqx.c.b($$1.d()));
      $$0.a(null, this.dq(), this.ds(), this.dw(), aqn.sB, aqo.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof amb) {
         al.z.a((amb)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dgw $$0) {
      return this.cp.b || super.c($$0);
   }

   @Override
   public eji q(float $$0) {
      double $$1 = 0.22 * (this.fm() == bks.b ? -1.0 : 1.0);
      float $$2 = ati.i($$0 * 0.5F, this.dD(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = ati.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      if (this.fw() || this.fj()) {
         eji $$4 = this.f($$0);
         eji $$5 = this.do();
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

         return this.l($$0).e(new eji($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.bZ()) {
         return this.l($$0).e(new eji($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cG().c() - 1.0;
         double $$13 = this.bW() ? -0.2 : 0.07;
         return this.l($$0).e(new eji($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dK() {
      return true;
   }

   public boolean gq() {
      return this.fn() && this.fp().a(cle.qj);
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
      b(ur.c("block.minecraft.bed.no_sleep")),
      c(ur.c("block.minecraft.bed.too_far_away")),
      d(ur.c("block.minecraft.bed.obstructed")),
      e,
      f(ur.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final ur g;

      private a() {
         this.g = null;
      }

      private a(ur $$0) {
         this.g = $$0;
      }

      @Nullable
      public ur a() {
         return this.g;
      }
   }
}
