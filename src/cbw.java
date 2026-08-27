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

public abstract class cbw extends bji {
   private static final Logger b = LogUtils.getLogger();
   public static final int bA = 16;
   public static final bjc bB = bjc.b;
   public static final int bC = 0;
   public static final int bD = 20;
   public static final int bE = 100;
   public static final int bF = 10;
   public static final int bG = 200;
   public static final float bH = 1.5F;
   public static final float bI = 0.6F;
   public static final float bJ = 0.6F;
   public static final float bK = 1.62F;
   public static final bit bL = bit.b(0.6F, 1.8F);
   private static final Map<bju, bit> c = ImmutableMap.builder()
      .put(bju.a, bL)
      .put(bju.c, v)
      .put(bju.b, bit.b(0.6F, 0.6F))
      .put(bju.d, bit.b(0.6F, 0.6F))
      .put(bju.e, bit.b(0.6F, 0.6F))
      .put(bju.f, bit.b(0.6F, 1.5F))
      .put(bju.h, bit.c(0.2F, 0.2F))
      .build();
   private static final int d = 25;
   private static final aeg<Float> e = aej.a(cbw.class, aei.d);
   private static final aeg<Integer> f = aej.a(cbw.class, aei.b);
   protected static final aeg<Byte> bM = aej.a(cbw.class, aei.a);
   protected static final aeg<Byte> bN = aej.a(cbw.class, aei.a);
   protected static final aeg<qy> bO = aej.a(cbw.class, aei.s);
   protected static final aeg<qy> bP = aej.a(cbw.class, aei.s);
   private long cm;
   private final cbv cn = new cbv(this);
   protected cfw bQ = new cfw();
   public final cfm bR;
   public cen bS;
   protected cej bT = new cej();
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
   private final cbt cp = new cbt();
   public int cf;
   public int cg;
   public float ch;
   protected int ci;
   protected final float cj = 0.02F;
   private int cq;
   private final GameProfile cr;
   private boolean cs;
   private cjh ct = cjh.b;
   private final cjd cu = this.k();
   private Optional<hf> cv = Optional.empty();
   @Nullable
   public cck ck;
   protected float cl;

   public cbw(cpx $$0, gw $$1, float $$2, GameProfile $$3) {
      super(biw.bt, $$0);
      this.a_($$3.getId());
      this.cr = $$3;
      this.bR = new cfm(this.cn, !$$0.B, this);
      this.bS = this.bR;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bg = 180.0F;
   }

   public boolean a(cpx $$0, gw $$1, cpu $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == cpu.d) {
         return true;
      } else if (this.gd()) {
         return false;
      } else {
         cjh $$3 = this.eS();
         return $$3.b() || !$$3.b($$0.G_().d(je.e), new dfp($$0, $$1, false));
      }
   }

   public static bkn.a fG() {
      return bji.dP().a(bko.f, 1.0).a(bko.d, 0.1F).a(bko.h).a(bko.k);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(e, 0.0F);
      this.an.a(f, 0);
      this.an.a(bM, (byte)0);
      this.an.a(bN, (byte)bB.a());
      this.an.a(bO, new qy());
      this.an.a(bP, new qy());
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
         this.a(app.k);
         this.a(app.l);
         if (this.bv()) {
            this.a(app.m);
         }

         if (this.bU()) {
            this.a(app.o);
         }

         if (!this.fC()) {
            this.a(app.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = ary.a(this.dq(), -2.9999999E7, 2.9999999E7);
      double $$2 = ary.a(this.dw(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dq() || $$2 != this.dw()) {
         this.e($$1, this.ds(), $$2);
      }

      this.aP++;
      cjh $$3 = this.eS();
      if (!cjh.a(this.ct, $$3)) {
         if (!cjh.b(this.ct, $$3)) {
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
      this.ce = this.a(apz.a);
      return this.ce;
   }

   private void s() {
      cjh $$0 = this.c(bix.f);
      if ($$0.a(cjk.nC) && !this.a(apz.a)) {
         this.b(new bif(bih.m, 200, 0, false, false, true));
      }
   }

   protected cjd k() {
      return new cjd();
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
      if (this.g(bju.d)) {
         bju $$0;
         if (this.fv()) {
            $$0 = bju.b;
         } else if (this.fC()) {
            $$0 = bju.c;
         } else if (this.bY()) {
            $$0 = bju.d;
         } else if (this.fi()) {
            $$0 = bju.e;
         } else if (this.bR() && !this.cp.b) {
            $$0 = bju.f;
         } else {
            $$0 = bju.a;
         }

         bju $$6;
         if (this.M_() || this.bN() || this.g($$0)) {
            $$6 = $$0;
         } else if (this.g(bju.f)) {
            $$6 = bju.f;
         } else {
            $$6 = bju.d;
         }

         this.b($$6);
      }
   }

   protected boolean g(bju $$0) {
      return this.dL().a(this, this.a($$0).a(this.dj()).h(1.0E-7));
   }

   @Override
   public int av() {
      return this.cp.a ? 1 : 80;
   }

   @Override
   protected ape aL() {
      return apf.sI;
   }

   @Override
   protected ape aM() {
      return apf.sG;
   }

   @Override
   protected ape aN() {
      return apf.sH;
   }

   @Override
   public int bI() {
      return 10;
   }

   @Override
   public void a(ape $$0, float $$1, float $$2) {
      this.dL().a(this, this.dq(), this.ds(), this.dw(), $$0, this.da(), $$1, $$2);
   }

   public void a(ape $$0, apg $$1, float $$2, float $$3) {
   }

   @Override
   public apg da() {
      return apg.h;
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
         this.a(ix.f);
      } else {
         super.b($$0);
      }
   }

   private void a(iv $$0) {
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

      if (this.dL().ai() == bgx.a && this.dL().X().b(cpt.j)) {
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
      this.w((float)this.b(bko.d));
      float $$1;
      if (this.aA() && !this.ev() && !this.bY()) {
         $$1 = Math.min(0.1F, (float)this.do().h());
      } else {
         $$1 = 0.0F;
      }

      this.bW = this.bW + ($$1 - this.bW) * 0.4F;
      if (this.eu() > 0.0F && !this.M_()) {
         ehk $$2;
         if (this.bN() && !this.cY().dG()) {
            $$2 = this.cG().b(this.cY().cG()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cG().c(1.0, 0.5, 1.0);
         }

         List<bis> $$4 = this.dL().a_(this, $$2);
         List<bis> $$5 = Lists.newArrayList();

         for (bis $$6 : $$4) {
            if ($$6.ag() == biw.J) {
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

   private void c(@Nullable qy $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dL().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         biw.a($$1).filter($$0x -> $$0x == biw.at).ifPresent($$0x -> {
            if (!bvj.a(this.dL(), this)) {
               this.dL().a(null, this.dq(), this.ds(), this.dw(), bvj.a(this.dL(), this.dL().z), this.da(), 1.0F, bvj.a(this.dL().z));
            }
         });
      }
   }

   private void c(bis $$0) {
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
   public void a(bhq $$0) {
      super.a($$0);
      this.ap();
      if (!this.M_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-ary.b((this.eD() + this.dB()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-ary.a((this.eD() + this.dB()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(app.N);
      this.a(app.i.b(app.m));
      this.a(app.i.b(app.n));
      this.ay();
      this.a_(false);
      this.a(Optional.of(hf.a(this.dL().ac(), this.dl())));
   }

   @Override
   protected void ex() {
      super.ex();
      if (!this.dL().X().b(cpt.d)) {
         this.fN();
         this.cn.k();
      }
   }

   protected void fN() {
      for (int $$0 = 0; $$0 < this.cn.b(); $$0++) {
         cjh $$1 = this.cn.a($$0);
         if (!$$1.b() && cns.e($$1)) {
            this.cn.b($$0);
         }
      }
   }

   @Override
   protected ape d(bhq $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected ape l_() {
      return apf.sy;
   }

   @Nullable
   public byp a(cjh $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public byp a(cjh $$0, boolean $$1, boolean $$2) {
      if ($$0.b()) {
         return null;
      } else {
         if (this.dL().B) {
            this.a(bgz.a);
         }

         double $$3 = this.du() - 0.3F;
         byp $$4 = new byp(this.dL(), this.dq(), $$3, this.dw(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.c(this.cv());
         }

         if ($$1) {
            float $$5 = this.ag.i() * 0.5F;
            float $$6 = this.ag.i() * (float) (Math.PI * 2);
            $$4.o((double)(-ary.a($$6) * $$5), 0.2F, (double)(ary.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = ary.a(this.dD() * (float) (Math.PI / 180.0));
            float $$9 = ary.b(this.dD() * (float) (Math.PI / 180.0));
            float $$10 = ary.a(this.dB() * (float) (Math.PI / 180.0));
            float $$11 = ary.b(this.dB() * (float) (Math.PI / 180.0));
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

   public float d(dfl $$0) {
      float $$1 = this.cn.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = cns.g(this);
         cjh $$3 = this.eS();
         if ($$2 > 0 && !$$3.b()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (big.a(this)) {
         $$1 *= 1.0F + (float)(big.b(this) + 1) * 0.2F;
      }

      if (this.a(bih.d)) {
         $$1 *= switch (this.b(bih.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      if (this.a(apz.a) && !cns.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aA()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dfl $$0) {
      return !$$0.y() || this.cn.f().b($$0);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.a_(this.cr.getId());
      re $$1 = $$0.c("Inventory", 10);
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
      this.a(bko.d).a((double)this.cp.b());
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
         this.a(hf.a.parse(rk.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      rl.g($$0);
      $$0.a("Inventory", this.cn.a(new re()));
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

      this.gq().flatMap($$0x -> hf.a.encodeStart(rk.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
   }

   @Override
   public boolean b(bhq $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(apw.n)) {
         return !this.dL().X().b(cpt.C);
      } else if ($$0.a(apw.m)) {
         return !this.dL().X().b(cpt.D);
      } else if ($$0.a(apw.i)) {
         return !this.dL().X().b(cpt.E);
      } else {
         return $$0.a(apw.o) ? !this.dL().X().b(cpt.F) : false;
      }
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cp.a && !$$0.a(apw.d)) {
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
               if (this.dL().ai() == bgx.a) {
                  $$1 = 0.0F;
               }

               if (this.dL().ai() == bgx.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dL().ai() == bgx.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bji $$0) {
      super.d($$0);
      if ($$0.fF()) {
         this.s(true);
      }
   }

   @Override
   public boolean en() {
      return !this.fS().a && super.en();
   }

   public boolean a(cbw $$0) {
      eiq $$1 = this.cf();
      eiq $$2 = $$0.cf();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bhq $$0, float $$1) {
      this.cn.a($$0, $$1, cbv.g);
   }

   @Override
   protected void c(bhq $$0, float $$1) {
      this.cn.a($$0, $$1, cbv.h);
   }

   @Override
   protected void u(float $$0) {
      if (this.bv.a(cjk.uy)) {
         if (!this.dL().B) {
            this.b(app.c.b(this.bv.d()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + ary.d($$0);
            bgz $$2 = this.fn();
            this.bv.a($$1, this, $$1x -> $$1x.d($$2));
            if (this.bv.b()) {
               if ($$2 == bgz.a) {
                  this.a(bix.a, cjh.b);
               } else {
                  this.a(bix.b, cjh.b);
               }

               this.bv = cjh.b;
               this.a(apf.uR, 0.8F, 0.8F + this.dL().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bhq $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fj(), 0.0F);
         this.y(this.fj() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(app.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.A($$0.a());
            this.eJ().a($$0, var7);
            this.c(this.eu() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(app.J, Math.round(var7 * 10.0F));
            }

            this.a(djv.o);
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

   public void a(def $$0, boolean $$1) {
   }

   public void a(coy $$0) {
   }

   public void a(ddh $$0) {
   }

   public void a(dek $$0) {
   }

   public void a(ddw $$0) {
   }

   public void a(bws $$0, bgt $$1) {
   }

   public OptionalInt a(@Nullable bhd $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, cow $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cjh $$0, bgz $$1) {
   }

   public bha a(bis $$0, bgz $$1) {
      if (this.M_()) {
         if ($$0 instanceof bhd) {
            this.a((bhd)$$0);
         }

         return bha.d;
      } else {
         cjh $$2 = this.b($$1);
         cjh $$3 = $$2.p();
         bha $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cp.d && $$2 == this.b($$1) && $$2.L() < $$3.L()) {
               $$2.f($$3.L());
            }

            return $$4;
         } else {
            if (!$$2.b() && $$0 instanceof bji) {
               if (this.cp.d) {
                  $$2 = $$3;
               }

               bha $$5 = $$2.a(this, (bji)$$0, $$1);
               if ($$5.a()) {
                  this.dL().a(djv.r, $$0.dj(), djv.a.a(this));
                  if ($$2.b() && !this.cp.d) {
                     this.a($$1, cjh.b);
                  }

                  return $$5;
               }
            }

            return bha.d;
         }
      }
   }

   @Override
   protected float l(bis $$0) {
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
   protected ehp a(ehp $$0, bjo $$1) {
      if (!this.cp.b && $$0.d <= 0.0 && ($$1 == bjo.a || $$1 == bjo.b) && this.fJ() && this.y()) {
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

         $$0 = new ehp($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean y() {
      return this.aA() || this.ab < this.dF() && !this.dL().a(this, this.cG().d(0.0, (double)(this.ab - this.dF()), 0.0));
   }

   public void d(bis $$0) {
      if ($$0.cp()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.b(bko.f);
            float $$2;
            if ($$0 instanceof bji) {
               $$2 = cns.a(this.eS(), ((bji)$$0).eR());
            } else {
               $$2 = cns.a(this.eS(), bjn.a);
            }

            float $$4 = this.B(0.5F);
            $$1 *= 0.2F + $$4 * $$4 * 0.8F;
            $$2 *= $$4;
            this.gl();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$5 = $$4 > 0.9F;
               boolean $$6 = false;
               int $$7 = 0;
               $$7 += cns.c(this);
               if (this.bX() && $$5) {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), apf.sq, this.da(), 1.0F, 1.0F);
                  $$7++;
                  $$6 = true;
               }

               boolean $$8 = $$5 && this.ab > 0.0F && !this.aA() && !this.c_() && !this.aX() && !this.a(bih.o) && !this.bN() && $$0 instanceof bji;
               $$8 = $$8 && !this.bX();
               if ($$8) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$9 = false;
               double $$10 = (double)(this.Y - this.X);
               if ($$5 && !$$8 && !$$6 && this.aA() && $$10 < (double)this.fe()) {
                  cjh $$11 = this.b(bgz.a);
                  if ($$11.d() instanceof cks) {
                     $$9 = true;
                  }
               }

               float $$12 = 0.0F;
               boolean $$13 = false;
               int $$14 = cns.d(this);
               if ($$0 instanceof bji) {
                  $$12 = ((bji)$$0).eu();
                  if ($$14 > 0 && !$$0.bM()) {
                     $$13 = true;
                     $$0.g(1);
                  }
               }

               ehp $$15 = $$0.do();
               boolean $$16 = $$0.a(this.dM().a(this), $$1);
               if ($$16) {
                  if ($$7 > 0) {
                     if ($$0 instanceof bji) {
                        ((bji)$$0)
                           .q(
                              (double)((float)$$7 * 0.5F),
                              (double)ary.a(this.dB() * (float) (Math.PI / 180.0)),
                              (double)(-ary.b(this.dB() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-ary.a(this.dB() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F),
                           0.1,
                           (double)(ary.b(this.dB() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F)
                        );
                     }

                     this.f(this.do().d(0.6, 1.0, 0.6));
                     this.g(false);
                  }

                  if ($$9) {
                     float $$17 = 1.0F + cns.a(this) * $$1;

                     for (bji $$19 : this.dL().a(bji.class, $$0.cG().c(1.0, 0.25, 1.0))) {
                        if ($$19 != this && $$19 != $$0 && !this.s($$19) && (!($$19 instanceof byf) || !((byf)$$19).y()) && this.f($$19) < 9.0) {
                           $$19.q(0.4F, (double)ary.a(this.dB() * (float) (Math.PI / 180.0)), (double)(-ary.b(this.dB() * (float) (Math.PI / 180.0))));
                           $$19.a(this.dM().a(this), $$17);
                        }
                     }

                     this.dL().a(null, this.dq(), this.ds(), this.dw(), apf.st, this.da(), 1.0F, 1.0F);
                     this.fO();
                  }

                  if ($$0 instanceof akt && $$0.T) {
                     ((akt)$$0).c.b(new aab($$0));
                     $$0.T = false;
                     $$0.f($$15);
                  }

                  if ($$8) {
                     this.dL().a(null, this.dq(), this.ds(), this.dw(), apf.sp, this.da(), 1.0F, 1.0F);
                     this.a($$0);
                  }

                  if (!$$8 && !$$9) {
                     if ($$5) {
                        this.dL().a(null, this.dq(), this.ds(), this.dw(), apf.ss, this.da(), 1.0F, 1.0F);
                     } else {
                        this.dL().a(null, this.dq(), this.ds(), this.dw(), apf.su, this.da(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.b($$0);
                  }

                  this.A($$0);
                  if ($$0 instanceof bji) {
                     cns.a((bji)$$0, this);
                  }

                  cns.b(this, $$0);
                  cjh $$20 = this.eS();
                  bis $$21 = $$0;
                  if ($$0 instanceof bxh) {
                     $$21 = ((bxh)$$0).b;
                  }

                  if (!this.dL().B && !$$20.b() && $$21 instanceof bji) {
                     $$20.a((bji)$$21, this);
                     if ($$20.b()) {
                        this.a(bgz.a, cjh.b);
                     }
                  }

                  if ($$0 instanceof bji) {
                     float $$22 = $$12 - ((bji)$$0).eu();
                     this.a(app.G, Math.round($$22 * 10.0F));
                     if ($$14 > 0) {
                        $$0.g($$14 * 4);
                     }

                     if (this.dL() instanceof aks && $$22 > 2.0F) {
                        int $$23 = (int)((double)$$22 * 0.5);
                        ((aks)this.dL()).a(ix.h, $$0.dq(), $$0.e(0.5), $$0.dw(), $$23, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.A(0.1F);
               } else {
                  this.dL().a(null, this.dq(), this.ds(), this.dw(), apf.sr, this.da(), 1.0F, 1.0F);
                  if ($$13) {
                     $$0.ay();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(bji $$0) {
      this.d((bis)$$0);
   }

   public void s(boolean $$0) {
      float $$1 = 0.25F + (float)cns.g(this) * 0.05F;
      if ($$0) {
         $$1 += 0.75F;
      }

      if (this.ag.i() < $$1) {
         this.gm().a(cjk.uy, 100);
         this.fs();
         this.dL().a(this, (byte)30);
      }
   }

   @Override
   public void a(bis $$0) {
   }

   public void b(bis $$0) {
   }

   public void fO() {
      double $$0 = (double)(-ary.a(this.dB() * (float) (Math.PI / 180.0)));
      double $$1 = (double)ary.b(this.dB() * (float) (Math.PI / 180.0));
      if (this.dL() instanceof aks) {
         ((aks)this.dL()).a(ix.ad, this.dq() + $$0, this.e(0.5), this.dw() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fP() {
   }

   @Override
   public void a(bis.c $$0) {
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

   public cbv fR() {
      return this.cn;
   }

   public cbt fS() {
      return this.cp;
   }

   public void a(cjh $$0, cjh $$1, cev $$2) {
   }

   public boolean fT() {
      return this.bS != this.bR;
   }

   public Either<cbw.a, asz> a(gw $$0) {
      this.b($$0);
      this.co = 0;
      return Either.right(asz.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fD();
      if (this.dL() instanceof aks && $$1) {
         ((aks)this.dL()).e();
      }

      this.co = $$0 ? 0 : 100;
   }

   @Override
   public void fD() {
      this.a(true, true);
   }

   public static Optional<ehp> a(aks $$0, gw $$1, float $$2, boolean $$3, boolean $$4) {
      dfl $$5 = $$0.a_($$1);
      csx $$6 = $$5.b();
      if ($$6 instanceof cze && ($$3 || $$5.c(cze.c) > 0) && cze.a($$0)) {
         Optional<ehp> $$7 = cze.a(biw.bt, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(cze.c, Integer.valueOf($$5.c(cze.c) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof csq && csq.a($$0)) {
         return csq.a(biw.bt, $$0, $$1, $$5.c(csq.aC), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dfl $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new ehp((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean fU() {
      return this.fC() && this.co >= 100;
   }

   public int fV() {
      return this.co;
   }

   public void a(tn $$0, boolean $$1) {
   }

   public void a(aey $$0) {
      this.b(app.i.b($$0));
   }

   public void a(aey $$0, int $$1) {
      this.a(app.i.b($$0), $$1);
   }

   public void b(apm<?> $$0) {
      this.a($$0, 1);
   }

   public void a(apm<?> $$0, int $$1) {
   }

   public void a(apm<?> $$0) {
   }

   public int a(Collection<cmm<?>> $$0) {
      return 0;
   }

   public void a(cmm<?> $$0, List<cjh> $$1) {
   }

   public void a(aey[] $$0) {
   }

   public int b(Collection<cmm<?>> $$0) {
      return 0;
   }

   @Override
   public void fa() {
      super.fa();
      this.a(app.E);
      if (this.bX()) {
         this.A(0.2F);
      } else {
         this.A(0.05F);
      }
   }

   @Override
   public void h(ehp $$0) {
      double $$1 = this.dq();
      double $$2 = this.ds();
      double $$3 = this.dw();
      if (this.bY() && !this.bN()) {
         double $$4 = this.bE().d;
         double $$5 = $$4 < -0.2 ? 0.085 : 0.06;
         if ($$4 <= 0.0 || this.bj || !this.dL().a_(gw.a(this.dq(), this.ds() + 1.0 - 0.1, this.dw())).u().c()) {
            ehp $$6 = this.do();
            this.f($$6.b(0.0, ($$4 - $$6.d) * $$5, 0.0));
         }
      }

      if (this.cp.b && !this.bN()) {
         double $$7 = this.do().d;
         super.h($$0);
         ehp $$8 = this.do();
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
      return (float)this.b(bko.d);
   }

   public void r(double $$0, double $$1, double $$2) {
      if (!this.bN()) {
         if (this.bY()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(app.C, $$3);
               this.A(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(apz.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(app.w, $$4);
               this.A(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.aX()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(app.s, $$5);
               this.A(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.c_()) {
            if ($$1 > 0.0) {
               this.a(app.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aA()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bX()) {
                  this.a(app.r, $$6);
                  this.A(0.1F * (float)$$6 * 0.01F);
               } else if (this.bW()) {
                  this.a(app.q, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(app.p, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fv()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(app.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(app.v, $$8);
            }
         }
      }
   }

   private void s(double $$0, double $$1, double $$2) {
      if (this.bN()) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         if ($$3 > 0) {
            bis $$4 = this.cY();
            if ($$4 instanceof cdn) {
               this.a(app.x, $$3);
            } else if ($$4 instanceof cdp) {
               this.a(app.y, $$3);
            } else if ($$4 instanceof bvk) {
               this.a(app.z, $$3);
            } else if ($$4 instanceof bws) {
               this.a(app.A, $$3);
            } else if ($$4 instanceof bzx) {
               this.a(app.D, $$3);
            }
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bhq $$2) {
      if (this.cp.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(app.t, (int)Math.round((double)$$0 * 100.0));
         }

         return super.a($$0, $$1, $$2);
      }
   }

   public boolean fW() {
      if (!this.aA() && !this.fv() && !this.aX() && !this.a(bih.y)) {
         cjh $$0 = this.c(bix.e);
         if ($$0.a(cjk.nh) && cib.d($$0)) {
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
   protected void b(gw $$0, dfl $$1) {
      if (this.aX()) {
         this.aP();
         this.b($$1);
      } else {
         gw $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dfl $$3 = this.dL().a_($$2);
            if ($$3.a(apu.bn)) {
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
   public bji.a eF() {
      return new bji.a(apf.sF, apf.sv);
   }

   @Override
   public boolean a(aks $$0, bji $$1) {
      this.b(app.g.b($$1.ag()));
      return true;
   }

   @Override
   public void a(dfl $$0, ehp $$1) {
      if (!this.cp.b) {
         super.a($$0, $$1);
      }
   }

   public void d(int $$0) {
      this.s($$0);
      this.ch = this.ch + (float)$$0 / (float)this.ga();
      this.cg = ary.a(this.cg + $$0, 0, Integer.MAX_VALUE);

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
   public void a(cjh $$0, int $$1) {
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
         this.dL().a(null, this.dq(), this.ds(), this.dw(), apf.sE, this.da(), $$1 * 0.75F, 1.0F);
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

   public Optional<cbc> Y() {
      return Optional.empty();
   }

   public cej gb() {
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

   public boolean a(gw $$0, hc $$1, cjh $$2) {
      if (this.cp.e) {
         return true;
      } else {
         gw $$3 = $$0.a($$1.g());
         dfp $$4 = new dfp(this.dL(), $$3, false);
         return $$2.a(this.dL().G_().d(je.e), $$4);
      }
   }

   @Override
   public int ed() {
      if (!this.dL().X().b(cpt.d) && !this.M_()) {
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
   protected bis.b aU() {
      return this.cp.b || this.aA() && this.bU() ? bis.b.a : bis.b.d;
   }

   @Override
   public void w() {
   }

   @Override
   public tn ab() {
      return tn.b(this.cr.getName());
   }

   public cfw ge() {
      return this.bQ;
   }

   @Override
   public cjh c(bix $$0) {
      if ($$0 == bix.a) {
         return this.cn.f();
      } else if ($$0 == bix.b) {
         return this.cn.k.get(0);
      } else {
         return $$0.a() == bix.a.b ? this.cn.j.get($$0.b()) : cjh.b;
      }
   }

   @Override
   protected boolean a(bix $$0) {
      return $$0.a() == bix.a.b;
   }

   @Override
   public void a(bix $$0, cjh $$1) {
      this.e($$1);
      if ($$0 == bix.a) {
         this.a($$0, this.cn.i.set(this.cn.l, $$1), $$1);
      } else if ($$0 == bix.b) {
         this.a($$0, this.cn.k.set(0, $$1), $$1);
      } else if ($$0.a() == bix.a.b) {
         this.a($$0, this.cn.j.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cjh $$0) {
      return this.cn.e($$0);
   }

   @Override
   public Iterable<cjh> bJ() {
      return Lists.newArrayList(new cjh[]{this.eS(), this.eT()});
   }

   @Override
   public Iterable<cjh> bK() {
      return this.cn.j;
   }

   public boolean h(qy $$0) {
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
         this.i(new qy());
         this.k(this.gj());
         this.j(new qy());
      }
   }

   private void k(qy $$0) {
      if (!this.dL().B && !$$0.g()) {
         biw.a($$0, this.dL()).ifPresent($$0x -> {
            if ($$0x instanceof bkd) {
               ((bkd)$$0x).b(this.ay);
            }

            $$0x.e(this.dq(), this.ds() + 0.7F, this.dw());
            ((aks)this.dL()).c($$0x);
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

   public eio gg() {
      return this.dL().I();
   }

   @Override
   public tn N_() {
      ua $$0 = eim.a(this.cf(), this.ab());
      return this.a($$0);
   }

   private ua a(ua $$0) {
      String $$1 = this.fQ().getName();
      return $$0.a($$1x -> $$1x.a(new tl(tl.a.d, "/tell " + $$1 + " ")).a(this.cF()).a($$1));
   }

   @Override
   public String cx() {
      return this.fQ().getName();
   }

   @Override
   public float b(bju $$0, bit $$1) {
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

   public boolean a(cbx $$0) {
      return (this.al().b(bM) & $$0.a()) == $$0.a();
   }

   @Override
   public bka a_(int $$0) {
      if ($$0 >= 0 && $$0 < this.cn.i.size()) {
         return bka.a(this.cn, $$0);
      } else {
         int $$1 = $$0 - 200;
         return $$1 >= 0 && $$1 < this.bQ.b() ? bka.a(this.bQ, $$1) : super.a_($$0);
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
   public bjc fl() {
      return this.an.b(bN) == 0 ? bjc.a : bjc.b;
   }

   public void a(bjc $$0) {
      this.an.b(bN, (byte)($$0 == bjc.a ? 0 : 1));
   }

   public qy gi() {
      return this.an.b(bO);
   }

   protected void i(qy $$0) {
      this.an.b(bO, $$0);
   }

   public qy gj() {
      return this.an.b(bP);
   }

   protected void j(qy $$0) {
      this.an.b(bP, $$0);
   }

   public float gk() {
      return (float)(1.0 / this.b(bko.h) * 20.0);
   }

   public float B(float $$0) {
      return ary.a(((float)this.aP + $$0) / this.gk(), 0.0F, 1.0F);
   }

   public void gl() {
      this.aP = 0;
   }

   public cjd gm() {
      return this.cu;
   }

   @Override
   protected float aJ() {
      return !this.cp.b && !this.fv() ? super.aJ() : 1.0F;
   }

   public float gn() {
      return (float)this.b(bko.k);
   }

   public boolean go() {
      return this.cp.d && this.D() >= 2;
   }

   @Override
   public boolean f(cjh $$0) {
      bix $$1 = bjk.h($$0);
      return this.c($$1).b();
   }

   @Override
   public bit a(bju $$0) {
      return c.getOrDefault($$0, bL);
   }

   @Override
   public ImmutableList<bju> fz() {
      return ImmutableList.of(bju.a, bju.f, bju.d);
   }

   @Override
   public cjh g(cjh $$0) {
      if (!($$0.d() instanceof cjx)) {
         return cjh.b;
      } else {
         Predicate<cjh> $$1 = ((cjx)$$0.d()).e();
         cjh $$2 = cjx.a(this, $$1);
         if (!$$2.b()) {
            return $$2;
         } else {
            $$1 = ((cjx)$$0.d()).b();

            for (int $$3 = 0; $$3 < this.cn.b(); $$3++) {
               cjh $$4 = this.cn.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cp.d ? new cjh(cjk.nH) : cjh.b;
         }
      }
   }

   @Override
   public cjh a(cpx $$0, cjh $$1) {
      this.gb().a($$1.d(), $$1);
      this.b(app.c.b($$1.d()));
      $$0.a(null, this.dq(), this.ds(), this.dw(), apf.sx, apg.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof akt) {
         al.z.a((akt)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dfl $$0) {
      return this.cp.b || super.c($$0);
   }

   @Override
   public ehp q(float $$0) {
      double $$1 = 0.22 * (this.fl() == bjc.b ? -1.0 : 1.0);
      float $$2 = ary.i($$0 * 0.5F, this.dD(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = ary.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      if (this.fv() || this.fi()) {
         ehp $$4 = this.f($$0);
         ehp $$5 = this.do();
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

         return this.l($$0).e(new ehp($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.bZ()) {
         return this.l($$0).e(new ehp($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cG().c() - 1.0;
         double $$13 = this.bW() ? -0.2 : 0.07;
         return this.l($$0).e(new ehp($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dK() {
      return true;
   }

   public boolean gp() {
      return this.fm() && this.fo().a(cjk.qj);
   }

   @Override
   public boolean dJ() {
      return false;
   }

   public Optional<hf> gq() {
      return this.cv;
   }

   public void a(Optional<hf> $$0) {
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
      b(tn.c("block.minecraft.bed.no_sleep")),
      c(tn.c("block.minecraft.bed.too_far_away")),
      d(tn.c("block.minecraft.bed.obstructed")),
      e,
      f(tn.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final tn g;

      private a() {
         this.g = null;
      }

      private a(tn $$0) {
         this.g = $$0;
      }

      @Nullable
      public tn a() {
         return this.g;
      }
   }
}
