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

public abstract class cbu extends bjg {
   private static final Logger b = LogUtils.getLogger();
   public static final int bA = 16;
   public static final bja bB = bja.b;
   public static final int bC = 0;
   public static final int bD = 20;
   public static final int bE = 100;
   public static final int bF = 10;
   public static final int bG = 200;
   public static final float bH = 1.5F;
   public static final float bI = 0.6F;
   public static final float bJ = 0.6F;
   public static final float bK = 1.62F;
   public static final bir bL = bir.b(0.6F, 1.8F);
   private static final Map<bjs, bir> c = ImmutableMap.builder()
      .put(bjs.a, bL)
      .put(bjs.c, v)
      .put(bjs.b, bir.b(0.6F, 0.6F))
      .put(bjs.d, bir.b(0.6F, 0.6F))
      .put(bjs.e, bir.b(0.6F, 0.6F))
      .put(bjs.f, bir.b(0.6F, 1.5F))
      .put(bjs.h, bir.c(0.2F, 0.2F))
      .build();
   private static final int d = 25;
   private static final aee<Float> e = aeh.a(cbu.class, aeg.d);
   private static final aee<Integer> f = aeh.a(cbu.class, aeg.b);
   protected static final aee<Byte> bM = aeh.a(cbu.class, aeg.a);
   protected static final aee<Byte> bN = aeh.a(cbu.class, aeg.a);
   protected static final aee<qw> bO = aeh.a(cbu.class, aeg.s);
   protected static final aee<qw> bP = aeh.a(cbu.class, aeg.s);
   private long cm;
   private final cbt cn = new cbt(this);
   protected cfu bQ = new cfu();
   public final cfk bR;
   public cel bS;
   protected ceh bT = new ceh();
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
   private final cbr cp = new cbr();
   public int cf;
   public int cg;
   public float ch;
   protected int ci;
   protected final float cj = 0.02F;
   private int cq;
   private final GameProfile cr;
   private boolean cs;
   private cjf ct = cjf.b;
   private final cjb cu = this.k();
   private Optional<hd> cv = Optional.empty();
   @Nullable
   public cci ck;
   protected float cl;

   public cbu(cpv $$0, gw $$1, float $$2, GameProfile $$3) {
      super(biu.bt, $$0);
      this.a_($$3.getId());
      this.cr = $$3;
      this.bR = new cfk(this.cn, !$$0.B, this);
      this.bS = this.bR;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bg = 180.0F;
   }

   public boolean a(cpv $$0, gw $$1, cps $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == cps.d) {
         return true;
      } else if (this.gd()) {
         return false;
      } else {
         cjf $$3 = this.eS();
         return $$3.b() || !$$3.b($$0.G_().d(jc.e), new dfn($$0, $$1, false));
      }
   }

   public static bkl.a fG() {
      return bjg.dP().a(bkm.f, 1.0).a(bkm.d, 0.1F).a(bkm.h).a(bkm.k);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(e, 0.0F);
      this.an.a(f, 0);
      this.an.a(bM, (byte)0);
      this.an.a(bN, (byte)bB.a());
      this.an.a(bO, new qw());
      this.an.a(bP, new qw());
   }

   @Override
   public void l() {
      this.af = this.M_();
      if (this.M_()) {
         this.c(false);
      }

      if (this.bX > 0) {
         this.bX--;
      }

      if (this.fC()) {
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

      this.fK();
      super.l();
      if (!this.dL().B && this.bS != null && !this.bS.a(this)) {
         this.q();
         this.bS = this.bR;
      }

      this.t();
      if (!this.dL().B) {
         this.bT.a(this);
         this.a(apn.k);
         this.a(apn.l);
         if (this.bv()) {
            this.a(apn.m);
         }

         if (this.bU()) {
            this.a(apn.o);
         }

         if (!this.fC()) {
            this.a(apn.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = arw.a(this.dq(), -2.9999999E7, 2.9999999E7);
      double $$2 = arw.a(this.dw(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dq() || $$2 != this.dw()) {
         this.e($$1, this.ds(), $$2);
      }

      this.aP++;
      cjf $$3 = this.eS();
      if (!cjf.a(this.ct, $$3)) {
         if (!cjf.b(this.ct, $$3)) {
            this.gl();
         }

         this.ct = $$3.p();
      }

      this.s();
      this.cu.a();
      this.fL();
   }

   public boolean fH() {
      return this.bR();
   }

   protected boolean fI() {
      return this.bR();
   }

   protected boolean fJ() {
      return this.bR();
   }

   protected boolean fK() {
      this.ce = this.a(apx.a);
      return this.ce;
   }

   private void s() {
      cjf $$0 = this.c(biv.f);
      if ($$0.a(cji.nC) && !this.a(apx.a)) {
         this.b(new bid(bif.m, 200, 0, false, false, true));
      }
   }

   protected cjb k() {
      return new cjb();
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

   protected void fL() {
      if (this.g(bjs.d)) {
         bjs $$0;
         if (this.fv()) {
            $$0 = bjs.b;
         } else if (this.fC()) {
            $$0 = bjs.c;
         } else if (this.bY()) {
            $$0 = bjs.d;
         } else if (this.fi()) {
            $$0 = bjs.e;
         } else if (this.bR() && !this.cp.b) {
            $$0 = bjs.f;
         } else {
            $$0 = bjs.a;
         }

         bjs $$6;
         if (this.M_() || this.bN() || this.g($$0)) {
            $$6 = $$0;
         } else if (this.g(bjs.f)) {
            $$6 = bjs.f;
         } else {
            $$6 = bjs.d;
         }

         this.b($$6);
      }
   }

   protected boolean g(bjs $$0) {
      return this.dL().a(this, this.a($$0).a(this.dj()).h(1.0E-7));
   }

   @Override
   public int av() {
      return this.cp.a ? 1 : 80;
   }

   @Override
   protected apc aL() {
      return apd.sI;
   }

   @Override
   protected apc aM() {
      return apd.sG;
   }

   @Override
   protected apc aN() {
      return apd.sH;
   }

   @Override
   public int bI() {
      return 10;
   }

   @Override
   public void a(apc $$0, float $$1, float $$2) {
      this.dL().a(this, this.dq(), this.ds(), this.dw(), $$0, this.da(), $$1, $$2);
   }

   public void a(apc $$0, ape $$1, float $$2, float $$3) {
   }

   @Override
   public ape da() {
      return ape.h;
   }

   @Override
   protected int db() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.ad_();
      } else if ($$0 == 23) {
         this.cs = false;
      } else if ($$0 == 22) {
         this.cs = true;
      } else if ($$0 == 43) {
         this.a(iv.f);
      } else {
         super.b($$0);
      }
   }

   private void a(it $$0) {
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
      if (!this.dL().B && this.fI() && this.bN()) {
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
   protected void fg() {
      super.fg();
      this.eP();
      this.aW = this.dB();
   }

   @Override
   public void b_() {
      if (this.bU > 0) {
         this.bU--;
      }

      if (this.dL().ai() == bgv.a && this.dL().X().b(cpr.j)) {
         if (this.eu() < this.eL() && this.ah % 20 == 0) {
            this.b(1.0F);
         }

         if (this.bT.c() && this.ah % 10 == 0) {
            this.bT.a(this.bT.a() + 1);
         }
      }

      this.cn.j();
      this.bV = this.bW;
      super.b_();
      this.w((float)this.b(bkm.d));
      float $$1;
      if (this.aA() && !this.ev() && !this.bY()) {
         $$1 = Math.min(0.1F, (float)this.do().h());
      } else {
         $$1 = 0.0F;
      }

      this.bW = this.bW + ($$1 - this.bW) * 0.4F;
      if (this.eu() > 0.0F && !this.M_()) {
         ehi $$2;
         if (this.bN() && !this.cY().dG()) {
            $$2 = this.cG().b(this.cY().cG()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cG().c(1.0, 0.5, 1.0);
         }

         List<biq> $$4 = this.dL().a_(this, $$2);
         List<biq> $$5 = Lists.newArrayList();

         for (biq $$6 : $$4) {
            if ($$6.ag() == biu.J) {
               $$5.add($$6);
            } else if (!$$6.dG()) {
               this.c($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.c(ac.a($$5, this.ag));
         }
      }

      this.c(this.gi());
      this.c(this.gj());
      if (!this.dL().B && (this.ab > 0.5F || this.aX()) || this.cp.b || this.fC() || this.aA) {
         this.gf();
      }
   }

   private void c(@Nullable qw $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dL().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         biu.a($$1).filter($$0x -> $$0x == biu.at).ifPresent($$0x -> {
            if (!bvh.a(this.dL(), this)) {
               this.dL().a(null, this.dq(), this.ds(), this.dw(), bvh.a(this.dL(), this.dL().z), this.da(), 1.0F, bvh.a(this.dL().z));
            }
         });
      }
   }

   private void c(biq $$0) {
      $$0.b_(this);
   }

   public int fM() {
      return this.an.b(f);
   }

   public void r(int $$0) {
      this.an.b(f, $$0);
   }

   public void s(int $$0) {
      int $$1 = this.fM();
      this.an.b(f, $$1 + $$0);
   }

   public void t(int $$0) {
      this.by = $$0;
      if (!this.dL().B) {
         this.gf();
         this.c(4, true);
      }
   }

   @Override
   public void a(bho $$0) {
      super.a($$0);
      this.ap();
      if (!this.M_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-arw.b((this.eD() + this.dB()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-arw.a((this.eD() + this.dB()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(apn.N);
      this.a(apn.i.b(apn.m));
      this.a(apn.i.b(apn.n));
      this.ay();
      this.a_(false);
      this.a(Optional.of(hd.a(this.dL().ac(), this.dl())));
   }

   @Override
   protected void ex() {
      super.ex();
      if (!this.dL().X().b(cpr.d)) {
         this.fN();
         this.cn.k();
      }
   }

   protected void fN() {
      for (int $$0 = 0; $$0 < this.cn.b(); $$0++) {
         cjf $$1 = this.cn.a($$0);
         if (!$$1.b() && cnq.e($$1)) {
            this.cn.b($$0);
         }
      }
   }

   @Override
   protected apc d(bho $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected apc l_() {
      return apd.sy;
   }

   @Nullable
   public byn a(cjf $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public byn a(cjf $$0, boolean $$1, boolean $$2) {
      if ($$0.b()) {
         return null;
      } else {
         if (this.dL().B) {
            this.a(bgx.a);
         }

         double $$3 = this.du() - 0.3F;
         byn $$4 = new byn(this.dL(), this.dq(), $$3, this.dw(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.c(this.cv());
         }

         if ($$1) {
            float $$5 = this.ag.i() * 0.5F;
            float $$6 = this.ag.i() * (float) (Math.PI * 2);
            $$4.o((double)(-arw.a($$6) * $$5), 0.2F, (double)(arw.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = arw.a(this.dD() * (float) (Math.PI / 180.0));
            float $$9 = arw.b(this.dD() * (float) (Math.PI / 180.0));
            float $$10 = arw.a(this.dB() * (float) (Math.PI / 180.0));
            float $$11 = arw.b(this.dB() * (float) (Math.PI / 180.0));
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

   public float d(dfj $$0) {
      float $$1 = this.cn.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = cnq.g(this);
         cjf $$3 = this.eS();
         if ($$2 > 0 && !$$3.b()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bie.a(this)) {
         $$1 *= 1.0F + (float)(bie.b(this) + 1) * 0.2F;
      }

      if (this.a(bif.d)) {
         $$1 *= switch (this.b(bif.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      if (this.a(apx.a) && !cnq.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aA()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dfj $$0) {
      return !$$0.y() || this.cn.f().b($$0);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.a_(this.cr.getId());
      rc $$1 = $$0.c("Inventory", 10);
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
      this.a(bkm.d).a((double)this.cp.b());
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
         this.a(hd.a.parse(ri.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      rj.g($$0);
      $$0.a("Inventory", this.cn.a(new rc()));
      $$0.a("SelectedItemSlot", this.cn.l);
      $$0.a("SleepTimer", (short)this.co);
      $$0.a("XpP", this.ch);
      $$0.a("XpLevel", this.cf);
      $$0.a("XpTotal", this.cg);
      $$0.a("XpSeed", this.ci);
      $$0.a("Score", this.fM());
      this.bT.b($$0);
      this.cp.a($$0);
      $$0.a("EnderItems", this.bQ.g());
      if (!this.gi().g()) {
         $$0.a("ShoulderEntityLeft", this.gi());
      }

      if (!this.gj().g()) {
         $$0.a("ShoulderEntityRight", this.gj());
      }

      this.gq().flatMap($$0x -> hd.a.encodeStart(ri.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
   }

   @Override
   public boolean b(bho $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(apu.n)) {
         return !this.dL().X().b(cpr.C);
      } else if ($$0.a(apu.m)) {
         return !this.dL().X().b(cpr.D);
      } else if ($$0.a(apu.i)) {
         return !this.dL().X().b(cpr.E);
      } else {
         return $$0.a(apu.o) ? !this.dL().X().b(cpr.F) : false;
      }
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cp.a && !$$0.a(apu.d)) {
         return false;
      } else {
         this.bb = 0;
         if (this.ev()) {
            return false;
         } else {
            if (!this.dL().B) {
               this.gf();
            }

            if ($$0.f()) {
               if (this.dL().ai() == bgv.a) {
                  $$1 = 0.0F;
               }

               if (this.dL().ai() == bgv.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dL().ai() == bgv.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bjg $$0) {
      super.d($$0);
      if ($$0.fF()) {
         this.s(true);
      }
   }

   @Override
   public boolean en() {
      return !this.fS().a && super.en();
   }

   public boolean a(cbu $$0) {
      eio $$1 = this.cf();
      eio $$2 = $$0.cf();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bho $$0, float $$1) {
      this.cn.a($$0, $$1, cbt.g);
   }

   @Override
   protected void c(bho $$0, float $$1) {
      this.cn.a($$0, $$1, cbt.h);
   }

   @Override
   protected void u(float $$0) {
      if (this.bv.a(cji.uy)) {
         if (!this.dL().B) {
            this.b(apn.c.b(this.bv.d()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + arw.d($$0);
            bgx $$2 = this.fn();
            this.bv.a($$1, this, $$1x -> $$1x.d($$2));
            if (this.bv.b()) {
               if ($$2 == bgx.a) {
                  this.a(biv.a, cjf.b);
               } else {
                  this.a(biv.b, cjf.b);
               }

               this.bv = cjf.b;
               this.a(apd.uR, 0.8F, 0.8F + this.dL().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bho $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fj(), 0.0F);
         this.y(this.fj() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(apn.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.A($$0.a());
            this.eJ().a($$0, var7);
            this.c(this.eu() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(apn.J, Math.round(var7 * 10.0F));
            }

            this.a(djt.o);
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

   public void a(ded $$0, boolean $$1) {
   }

   public void a(cow $$0) {
   }

   public void a(ddf $$0) {
   }

   public void a(dei $$0) {
   }

   public void a(ddu $$0) {
   }

   public void a(bwq $$0, bgr $$1) {
   }

   public OptionalInt a(@Nullable bhb $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, cou $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cjf $$0, bgx $$1) {
   }

   public bgy a(biq $$0, bgx $$1) {
      if (this.M_()) {
         if ($$0 instanceof bhb) {
            this.a((bhb)$$0);
         }

         return bgy.d;
      } else {
         cjf $$2 = this.b($$1);
         cjf $$3 = $$2.p();
         bgy $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cp.d && $$2 == this.b($$1) && $$2.L() < $$3.L()) {
               $$2.f($$3.L());
            }

            return $$4;
         } else {
            if (!$$2.b() && $$0 instanceof bjg) {
               if (this.cp.d) {
                  $$2 = $$3;
               }

               bgy $$5 = $$2.a(this, (bjg)$$0, $$1);
               if ($$5.a()) {
                  this.dL().a(djt.r, $$0.dj(), djt.a.a(this));
                  if ($$2.b() && !this.cp.d) {
                     this.a($$1, cjf.b);
                  }

                  return $$5;
               }
            }

            return bgy.d;
         }
      }
   }

   @Override
   protected float l(biq $$0) {
      return -0.6F;
   }

   @Override
   public void bB() {
      super.bB();
      this.J = 0;
   }

   @Override
   protected boolean eX() {
      return super.eX() || this.fC();
   }

   @Override
   public boolean dZ() {
      return !this.cp.b;
   }

   @Override
   protected ehn a(ehn $$0, bjm $$1) {
      if (!this.cp.b && $$0.d <= 0.0 && ($$1 == bjm.a || $$1 == bjm.b) && this.fJ() && this.y()) {
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

         $$0 = new ehn($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean y() {
      return this.aA() || this.ab < this.dF() && !this.dL().a(this, this.cG().d(0.0, (double)(this.ab - this.dF()), 0.0));
   }

   public void d(biq $$0) {
      if ($$0.cp()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.b(bkm.f);
            float $$2;
            if ($$0 instanceof bjg) {
               $$2 = cnq.a(this.eS(), ((bjg)$$0).eR());
            } else {
               $$2 = cnq.a(this.eS(), bjl.a);
            }

            float $$4 = this.B(0.5F);
            $$1 *= 0.2F + $$4 * $$4 * 0.8F;
            $$2 *= $$4;
            this.gl();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$5 = $$4 > 0.9F;
               boolean $$6 = false;
               int $$7 = 0;
               $$7 += cnq.c(this);
               if (this.bX() && $$5) {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), apd.sq, this.da(), 1.0F, 1.0F);
                  $$7++;
                  $$6 = true;
               }

               boolean $$8 = $$5 && this.ab > 0.0F && !this.aA() && !this.c_() && !this.aX() && !this.a(bif.o) && !this.bN() && $$0 instanceof bjg;
               $$8 = $$8 && !this.bX();
               if ($$8) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$9 = false;
               double $$10 = (double)(this.Y - this.X);
               if ($$5 && !$$8 && !$$6 && this.aA() && $$10 < (double)this.fe()) {
                  cjf $$11 = this.b(bgx.a);
                  if ($$11.d() instanceof ckq) {
                     $$9 = true;
                  }
               }

               float $$12 = 0.0F;
               boolean $$13 = false;
               int $$14 = cnq.d(this);
               if ($$0 instanceof bjg) {
                  $$12 = ((bjg)$$0).eu();
                  if ($$14 > 0 && !$$0.bM()) {
                     $$13 = true;
                     $$0.g(1);
                  }
               }

               ehn $$15 = $$0.do();
               boolean $$16 = $$0.a(this.dM().a(this), $$1);
               if ($$16) {
                  if ($$7 > 0) {
                     if ($$0 instanceof bjg) {
                        ((bjg)$$0)
                           .q(
                              (double)((float)$$7 * 0.5F),
                              (double)arw.a(this.dB() * (float) (Math.PI / 180.0)),
                              (double)(-arw.b(this.dB() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-arw.a(this.dB() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F),
                           0.1,
                           (double)(arw.b(this.dB() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F)
                        );
                     }

                     this.f(this.do().d(0.6, 1.0, 0.6));
                     this.g(false);
                  }

                  if ($$9) {
                     float $$17 = 1.0F + cnq.a(this) * $$1;

                     for (bjg $$19 : this.dL().a(bjg.class, $$0.cG().c(1.0, 0.25, 1.0))) {
                        if ($$19 != this && $$19 != $$0 && !this.s($$19) && (!($$19 instanceof byd) || !((byd)$$19).y()) && this.f($$19) < 9.0) {
                           $$19.q(0.4F, (double)arw.a(this.dB() * (float) (Math.PI / 180.0)), (double)(-arw.b(this.dB() * (float) (Math.PI / 180.0))));
                           $$19.a(this.dM().a(this), $$17);
                        }
                     }

                     this.dL().a(null, this.dq(), this.ds(), this.dw(), apd.st, this.da(), 1.0F, 1.0F);
                     this.fO();
                  }

                  if ($$0 instanceof akr && $$0.T) {
                     ((akr)$$0).c.b(new zz($$0));
                     $$0.T = false;
                     $$0.f($$15);
                  }

                  if ($$8) {
                     this.dL().a(null, this.dq(), this.ds(), this.dw(), apd.sp, this.da(), 1.0F, 1.0F);
                     this.a($$0);
                  }

                  if (!$$8 && !$$9) {
                     if ($$5) {
                        this.dL().a(null, this.dq(), this.ds(), this.dw(), apd.ss, this.da(), 1.0F, 1.0F);
                     } else {
                        this.dL().a(null, this.dq(), this.ds(), this.dw(), apd.su, this.da(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.b($$0);
                  }

                  this.A($$0);
                  if ($$0 instanceof bjg) {
                     cnq.a((bjg)$$0, this);
                  }

                  cnq.b(this, $$0);
                  cjf $$20 = this.eS();
                  biq $$21 = $$0;
                  if ($$0 instanceof bxf) {
                     $$21 = ((bxf)$$0).b;
                  }

                  if (!this.dL().B && !$$20.b() && $$21 instanceof bjg) {
                     $$20.a((bjg)$$21, this);
                     if ($$20.b()) {
                        this.a(bgx.a, cjf.b);
                     }
                  }

                  if ($$0 instanceof bjg) {
                     float $$22 = $$12 - ((bjg)$$0).eu();
                     this.a(apn.G, Math.round($$22 * 10.0F));
                     if ($$14 > 0) {
                        $$0.g($$14 * 4);
                     }

                     if (this.dL() instanceof akq && $$22 > 2.0F) {
                        int $$23 = (int)((double)$$22 * 0.5);
                        ((akq)this.dL()).a(iv.h, $$0.dq(), $$0.e(0.5), $$0.dw(), $$23, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.A(0.1F);
               } else {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), apd.sr, this.da(), 1.0F, 1.0F);
                  if ($$13) {
                     $$0.ay();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(bjg $$0) {
      this.d((biq)$$0);
   }

   public void s(boolean $$0) {
      float $$1 = 0.25F + (float)cnq.g(this) * 0.05F;
      if ($$0) {
         $$1 += 0.75F;
      }

      if (this.ag.i() < $$1) {
         this.gm().a(cji.uy, 100);
         this.fs();
         this.dL().a(this, (byte)30);
      }
   }

   @Override
   public void a(biq $$0) {
   }

   public void b(biq $$0) {
   }

   public void fO() {
      double $$0 = (double)(-arw.a(this.dB() * (float) (Math.PI / 180.0)));
      double $$1 = (double)arw.b(this.dB() * (float) (Math.PI / 180.0));
      if (this.dL() instanceof akq) {
         ((akq)this.dL()).a(iv.ad, this.dq() + $$0, this.e(0.5), this.dw() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fP() {
   }

   @Override
   public void a(biq.c $$0) {
      super.a($$0);
      this.bR.b(this);
      if (this.bS != null && this.fT()) {
         this.r();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile fQ() {
      return this.cr;
   }

   public cbt fR() {
      return this.cn;
   }

   public cbr fS() {
      return this.cp;
   }

   public void a(cjf $$0, cjf $$1, cet $$2) {
   }

   public boolean fT() {
      return this.bS != this.bR;
   }

   public Either<cbu.a, asx> a(gw $$0) {
      this.b($$0);
      this.co = 0;
      return Either.right(asx.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fD();
      if (this.dL() instanceof akq && $$1) {
         ((akq)this.dL()).e();
      }

      this.co = $$0 ? 0 : 100;
   }

   @Override
   public void fD() {
      this.a(true, true);
   }

   public static Optional<ehn> a(akq $$0, gw $$1, float $$2, boolean $$3, boolean $$4) {
      dfj $$5 = $$0.a_($$1);
      csv $$6 = $$5.b();
      if ($$6 instanceof czc && ($$3 || $$5.c(czc.c) > 0) && czc.a($$0)) {
         Optional<ehn> $$7 = czc.a(biu.bt, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(czc.c, Integer.valueOf($$5.c(czc.c) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof cso && cso.a($$0)) {
         return cso.a(biu.bt, $$0, $$1, $$5.c(cso.aC), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dfj $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new ehn((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean fU() {
      return this.fC() && this.co >= 100;
   }

   public int fV() {
      return this.co;
   }

   public void a(tl $$0, boolean $$1) {
   }

   public void a(aew $$0) {
      this.b(apn.i.b($$0));
   }

   public void a(aew $$0, int $$1) {
      this.a(apn.i.b($$0), $$1);
   }

   public void b(apk<?> $$0) {
      this.a($$0, 1);
   }

   public void a(apk<?> $$0, int $$1) {
   }

   public void a(apk<?> $$0) {
   }

   public int a(Collection<cmk<?>> $$0) {
      return 0;
   }

   public void a(cmk<?> $$0, List<cjf> $$1) {
   }

   public void a(aew[] $$0) {
   }

   public int b(Collection<cmk<?>> $$0) {
      return 0;
   }

   @Override
   public void fa() {
      super.fa();
      this.a(apn.E);
      if (this.bX()) {
         this.A(0.2F);
      } else {
         this.A(0.05F);
      }
   }

   @Override
   public void h(ehn $$0) {
      double $$1 = this.dq();
      double $$2 = this.ds();
      double $$3 = this.dw();
      if (this.bY() && !this.bN()) {
         double $$4 = this.bE().d;
         double $$5 = $$4 < -0.2 ? 0.085 : 0.06;
         if ($$4 <= 0.0 || this.bj || !this.dL().a_(gw.a(this.dq(), this.ds() + 1.0 - 0.1, this.dw())).u().c()) {
            ehn $$6 = this.do();
            this.f($$6.b(0.0, ($$4 - $$6.d) * $$5, 0.0));
         }
      }

      if (this.cp.b && !this.bN()) {
         double $$7 = this.do().d;
         super.h($$0);
         ehn $$8 = this.do();
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

   protected boolean h(gw $$0) {
      return !this.dL().a_($$0).o(this.dL(), $$0);
   }

   @Override
   public float fe() {
      return (float)this.b(bkm.d);
   }

   public void r(double $$0, double $$1, double $$2) {
      if (!this.bN()) {
         if (this.bY()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(apn.C, $$3);
               this.A(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(apx.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(apn.w, $$4);
               this.A(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.aX()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(apn.s, $$5);
               this.A(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.c_()) {
            if ($$1 > 0.0) {
               this.a(apn.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aA()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bX()) {
                  this.a(apn.r, $$6);
                  this.A(0.1F * (float)$$6 * 0.01F);
               } else if (this.bW()) {
                  this.a(apn.q, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(apn.p, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fv()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(apn.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(apn.v, $$8);
            }
         }
      }
   }

   private void s(double $$0, double $$1, double $$2) {
      if (this.bN()) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         if ($$3 > 0) {
            biq $$4 = this.cY();
            if ($$4 instanceof cdl) {
               this.a(apn.x, $$3);
            } else if ($$4 instanceof cdn) {
               this.a(apn.y, $$3);
            } else if ($$4 instanceof bvi) {
               this.a(apn.z, $$3);
            } else if ($$4 instanceof bwq) {
               this.a(apn.A, $$3);
            } else if ($$4 instanceof bzv) {
               this.a(apn.D, $$3);
            }
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bho $$2) {
      if (this.cp.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(apn.t, (int)Math.round((double)$$0 * 100.0));
         }

         return super.a($$0, $$1, $$2);
      }
   }

   public boolean fW() {
      if (!this.aA() && !this.fv() && !this.aX() && !this.a(bif.y)) {
         cjf $$0 = this.c(biv.e);
         if ($$0.a(cji.nh) && chz.d($$0)) {
            this.fX();
            return true;
         }
      }

      return false;
   }

   public void fX() {
      this.b(7, true);
   }

   public void fY() {
      this.b(7, true);
      this.b(7, false);
   }

   @Override
   protected void bg() {
      if (!this.M_()) {
         super.bg();
      }
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      if (this.aX()) {
         this.aP();
         this.b($$1);
      } else {
         gw $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dfj $$3 = this.dL().a_($$2);
            if ($$3.a(aps.bn)) {
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
   public bjg.a eF() {
      return new bjg.a(apd.sF, apd.sv);
   }

   @Override
   public boolean a(akq $$0, bjg $$1) {
      this.b(apn.g.b($$1.ag()));
      return true;
   }

   @Override
   public void a(dfj $$0, ehn $$1) {
      if (!this.cp.b) {
         super.a($$0, $$1);
      }
   }

   public void d(int $$0) {
      this.s($$0);
      this.ch = this.ch + (float)$$0 / (float)this.ga();
      this.cg = arw.a(this.cg + $$0, 0, Integer.MAX_VALUE);

      while (this.ch < 0.0F) {
         float $$1 = this.ch * (float)this.ga();
         if (this.cf > 0) {
            this.c(-1);
            this.ch = 1.0F + $$1 / (float)this.ga();
         } else {
            this.c(-1);
            this.ch = 0.0F;
         }
      }

      while (this.ch >= 1.0F) {
         this.ch = (this.ch - 1.0F) * (float)this.ga();
         this.c(1);
         this.ch = this.ch / (float)this.ga();
      }
   }

   public int fZ() {
      return this.ci;
   }

   @Override
   public void a(cjf $$0, int $$1) {
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
         this.dL().a(null, this.dq(), this.ds(), this.dw(), apd.sE, this.da(), $$1 * 0.75F, 1.0F);
         this.cq = this.ah;
      }
   }

   public int ga() {
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

   public Optional<cba> Y() {
      return Optional.empty();
   }

   public ceh gb() {
      return this.bT;
   }

   public boolean t(boolean $$0) {
      return this.cp.a || $$0 || this.bT.c();
   }

   public boolean gc() {
      return this.eu() > 0.0F && this.eu() < this.eL();
   }

   public boolean gd() {
      return this.cp.e;
   }

   public boolean a(gw $$0, ha $$1, cjf $$2) {
      if (this.cp.e) {
         return true;
      } else {
         gw $$3 = $$0.a($$1.g());
         dfn $$4 = new dfn(this.dL(), $$3, false);
         return $$2.a(this.dL().G_().d(jc.e), $$4);
      }
   }

   @Override
   public int ed() {
      if (!this.dL().X().b(cpr.d) && !this.M_()) {
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
   protected biq.b aU() {
      return this.cp.b || this.aA() && this.bU() ? biq.b.a : biq.b.d;
   }

   @Override
   public void w() {
   }

   @Override
   public tl ab() {
      return tl.b(this.cr.getName());
   }

   public cfu ge() {
      return this.bQ;
   }

   @Override
   public cjf c(biv $$0) {
      if ($$0 == biv.a) {
         return this.cn.f();
      } else if ($$0 == biv.b) {
         return this.cn.k.get(0);
      } else {
         return $$0.a() == biv.a.b ? this.cn.j.get($$0.b()) : cjf.b;
      }
   }

   @Override
   protected boolean a(biv $$0) {
      return $$0.a() == biv.a.b;
   }

   @Override
   public void a(biv $$0, cjf $$1) {
      this.e($$1);
      if ($$0 == biv.a) {
         this.a($$0, this.cn.i.set(this.cn.l, $$1), $$1);
      } else if ($$0 == biv.b) {
         this.a($$0, this.cn.k.set(0, $$1), $$1);
      } else if ($$0.a() == biv.a.b) {
         this.a($$0, this.cn.j.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cjf $$0) {
      return this.cn.e($$0);
   }

   @Override
   public Iterable<cjf> bJ() {
      return Lists.newArrayList(new cjf[]{this.eS(), this.eT()});
   }

   @Override
   public Iterable<cjf> bK() {
      return this.cn.j;
   }

   public boolean h(qw $$0) {
      if (this.bN() || !this.aA() || this.aX() || this.aA) {
         return false;
      } else if (this.gi().g()) {
         this.i($$0);
         this.cm = this.dL().V();
         return true;
      } else if (this.gj().g()) {
         this.j($$0);
         this.cm = this.dL().V();
         return true;
      } else {
         return false;
      }
   }

   protected void gf() {
      if (this.cm + 20L < this.dL().V()) {
         this.k(this.gi());
         this.i(new qw());
         this.k(this.gj());
         this.j(new qw());
      }
   }

   private void k(qw $$0) {
      if (!this.dL().B && !$$0.g()) {
         biu.a($$0, this.dL()).ifPresent($$0x -> {
            if ($$0x instanceof bkb) {
               ((bkb)$$0x).b(this.ay);
            }

            $$0x.e(this.dq(), this.ds() + 0.7F, this.dw());
            ((akq)this.dL()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean M_();

   @Override
   public boolean bq() {
      return !this.M_() && super.bq();
   }

   @Override
   public boolean bY() {
      return !this.cp.b && !this.M_() && super.bY();
   }

   public abstract boolean f();

   @Override
   public boolean cy() {
      return !this.cp.b;
   }

   public eim gg() {
      return this.dL().I();
   }

   @Override
   public tl N_() {
      ty $$0 = eik.a(this.cf(), this.ab());
      return this.a($$0);
   }

   private ty a(ty $$0) {
      String $$1 = this.fQ().getName();
      return $$0.a($$1x -> $$1x.a(new tj(tj.a.d, "/tell " + $$1 + " ")).a(this.cF()).a($$1));
   }

   @Override
   public String cx() {
      return this.fQ().getName();
   }

   @Override
   public float b(bjs $$0, bir $$1) {
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
   public float fj() {
      return this.al().b(e);
   }

   public boolean a(cbv $$0) {
      return (this.al().b(bM) & $$0.a()) == $$0.a();
   }

   @Override
   public bjy a_(int $$0) {
      if ($$0 >= 0 && $$0 < this.cn.i.size()) {
         return bjy.a(this.cn, $$0);
      } else {
         int $$1 = $$0 - 200;
         return $$1 >= 0 && $$1 < this.bQ.b() ? bjy.a(this.bQ, $$1) : super.a_($$0);
      }
   }

   public boolean gh() {
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
   public bja fl() {
      return this.an.b(bN) == 0 ? bja.a : bja.b;
   }

   public void a(bja $$0) {
      this.an.b(bN, (byte)($$0 == bja.a ? 0 : 1));
   }

   public qw gi() {
      return this.an.b(bO);
   }

   protected void i(qw $$0) {
      this.an.b(bO, $$0);
   }

   public qw gj() {
      return this.an.b(bP);
   }

   protected void j(qw $$0) {
      this.an.b(bP, $$0);
   }

   public float gk() {
      return (float)(1.0 / this.b(bkm.h) * 20.0);
   }

   public float B(float $$0) {
      return arw.a(((float)this.aP + $$0) / this.gk(), 0.0F, 1.0F);
   }

   public void gl() {
      this.aP = 0;
   }

   public cjb gm() {
      return this.cu;
   }

   @Override
   protected float aJ() {
      return !this.cp.b && !this.fv() ? super.aJ() : 1.0F;
   }

   public float gn() {
      return (float)this.b(bkm.k);
   }

   public boolean go() {
      return this.cp.d && this.D() >= 2;
   }

   @Override
   public boolean f(cjf $$0) {
      biv $$1 = bji.h($$0);
      return this.c($$1).b();
   }

   @Override
   public bir a(bjs $$0) {
      return c.getOrDefault($$0, bL);
   }

   @Override
   public ImmutableList<bjs> fz() {
      return ImmutableList.of(bjs.a, bjs.f, bjs.d);
   }

   @Override
   public cjf g(cjf $$0) {
      if (!($$0.d() instanceof cjv)) {
         return cjf.b;
      } else {
         Predicate<cjf> $$1 = ((cjv)$$0.d()).e();
         cjf $$2 = cjv.a(this, $$1);
         if (!$$2.b()) {
            return $$2;
         } else {
            $$1 = ((cjv)$$0.d()).b();

            for (int $$3 = 0; $$3 < this.cn.b(); $$3++) {
               cjf $$4 = this.cn.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cp.d ? new cjf(cji.nH) : cjf.b;
         }
      }
   }

   @Override
   public cjf a(cpv $$0, cjf $$1) {
      this.gb().a($$1.d(), $$1);
      this.b(apn.c.b($$1.d()));
      $$0.a(null, this.dq(), this.ds(), this.dw(), apd.sx, ape.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof akr) {
         al.z.a((akr)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dfj $$0) {
      return this.cp.b || super.c($$0);
   }

   @Override
   public ehn q(float $$0) {
      double $$1 = 0.22 * (this.fl() == bja.b ? -1.0 : 1.0);
      float $$2 = arw.i($$0 * 0.5F, this.dD(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = arw.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      if (this.fv() || this.fi()) {
         ehn $$4 = this.f($$0);
         ehn $$5 = this.do();
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

         return this.l($$0).e(new ehn($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.bZ()) {
         return this.l($$0).e(new ehn($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cG().c() - 1.0;
         double $$13 = this.bW() ? -0.2 : 0.07;
         return this.l($$0).e(new ehn($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dK() {
      return true;
   }

   public boolean gp() {
      return this.fm() && this.fo().a(cji.qj);
   }

   @Override
   public boolean dJ() {
      return false;
   }

   public Optional<hd> gq() {
      return this.cv;
   }

   public void a(Optional<hd> $$0) {
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

   public static enum a {
      a,
      b(tl.c("block.minecraft.bed.no_sleep")),
      c(tl.c("block.minecraft.bed.too_far_away")),
      d(tl.c("block.minecraft.bed.obstructed")),
      e,
      f(tl.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final tl g;

      private a() {
         this.g = null;
      }

      private a(tl $$0) {
         this.g = $$0;
      }

      @Nullable
      public tl a() {
         return this.g;
      }
   }
}
