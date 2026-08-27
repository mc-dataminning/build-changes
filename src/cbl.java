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

public abstract class cbl extends biw {
   private static final Logger b = LogUtils.getLogger();
   public static final int bA = 16;
   public static final int bB = 20;
   public static final int bC = 100;
   public static final int bD = 10;
   public static final int bE = 200;
   public static final float bF = 1.5F;
   public static final float bG = 0.6F;
   public static final float bH = 0.6F;
   public static final float bI = 1.62F;
   public static final bih bJ = bih.b(0.6F, 1.8F);
   private static final Map<bji, bih> c = ImmutableMap.builder()
      .put(bji.a, bJ)
      .put(bji.c, v)
      .put(bji.b, bih.b(0.6F, 0.6F))
      .put(bji.d, bih.b(0.6F, 0.6F))
      .put(bji.e, bih.b(0.6F, 0.6F))
      .put(bji.f, bih.b(0.6F, 1.5F))
      .put(bji.h, bih.c(0.2F, 0.2F))
      .build();
   private static final int d = 25;
   private static final adx<Float> e = aea.a(cbl.class, adz.d);
   private static final adx<Integer> f = aea.a(cbl.class, adz.b);
   protected static final adx<Byte> bK = aea.a(cbl.class, adz.a);
   protected static final adx<Byte> bL = aea.a(cbl.class, adz.a);
   protected static final adx<qs> bM = aea.a(cbl.class, adz.s);
   protected static final adx<qs> bN = aea.a(cbl.class, adz.s);
   private long ck;
   private final cbk cl = new cbk(this);
   protected cfl bO = new cfl();
   public final cfb bP;
   public cec bQ;
   protected cdy bR = new cdy();
   protected int bS;
   public float bT;
   public float bU;
   public int bV;
   public double bW;
   public double bX;
   public double bY;
   public double bZ;
   public double ca;
   public double cb;
   private int cm;
   protected boolean cc;
   private final cbi cn = new cbi();
   public int cd;
   public int ce;
   public float cf;
   protected int cg;
   protected final float ch = 0.02F;
   private int co;
   private final GameProfile cp;
   private boolean cq;
   private ciw cr = ciw.b;
   private final cis cs = this.k();
   private Optional<he> ct = Optional.empty();
   @Nullable
   public cbz ci;
   protected float cj;

   public cbl(cpk $$0, gv $$1, float $$2, GameProfile $$3) {
      super(bik.bt, $$0);
      this.a_($$3.getId());
      this.cp = $$3;
      this.bP = new cfb(this.cl, !$$0.B, this);
      this.bQ = this.bP;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bg = 180.0F;
   }

   public boolean a(cpk $$0, gv $$1, cph $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == cph.d) {
         return true;
      } else if (this.gc()) {
         return false;
      } else {
         ciw $$3 = this.eR();
         return $$3.b() || !$$3.b($$0.B_().d(jd.e), new dfc($$0, $$1, false));
      }
   }

   public static bkc.a fF() {
      return biw.dO().a(bkd.f, 1.0).a(bkd.d, 0.1F).a(bkd.h).a(bkd.k);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(e, 0.0F);
      this.an.a(f, 0);
      this.an.a(bK, (byte)0);
      this.an.a(bL, (byte)1);
      this.an.a(bM, new qs());
      this.an.a(bN, new qs());
   }

   @Override
   public void l() {
      this.af = this.G_();
      if (this.G_()) {
         this.c(false);
      }

      if (this.bV > 0) {
         this.bV--;
      }

      if (this.fB()) {
         this.cm++;
         if (this.cm > 100) {
            this.cm = 100;
         }

         if (!this.dK().B && this.dK().N()) {
            this.a(false, true);
         }
      } else if (this.cm > 0) {
         this.cm++;
         if (this.cm >= 110) {
            this.cm = 0;
         }
      }

      this.fJ();
      super.l();
      if (!this.dK().B && this.bQ != null && !this.bQ.a(this)) {
         this.q();
         this.bQ = this.bP;
      }

      this.t();
      if (!this.dK().B) {
         this.bR.a(this);
         this.a(ape.k);
         this.a(ape.l);
         if (this.bv()) {
            this.a(ape.m);
         }

         if (this.bU()) {
            this.a(ape.o);
         }

         if (!this.fB()) {
            this.a(ape.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = aro.a(this.dp(), -2.9999999E7, 2.9999999E7);
      double $$2 = aro.a(this.dv(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dp() || $$2 != this.dv()) {
         this.e($$1, this.dr(), $$2);
      }

      this.aP++;
      ciw $$3 = this.eR();
      if (!ciw.a(this.cr, $$3)) {
         if (!ciw.b(this.cr, $$3)) {
            this.gk();
         }

         this.cr = $$3.p();
      }

      this.p();
      this.cs.a();
      this.fK();
   }

   public boolean fG() {
      return this.bR();
   }

   protected boolean fH() {
      return this.bR();
   }

   protected boolean fI() {
      return this.bR();
   }

   protected boolean fJ() {
      this.cc = this.a(apo.a);
      return this.cc;
   }

   private void p() {
      ciw $$0 = this.c(bil.f);
      if ($$0.a(ciz.nC) && !this.a(apo.a)) {
         this.b(new bht(bhv.m, 200, 0, false, false, true));
      }
   }

   protected cis k() {
      return new cis();
   }

   private void t() {
      this.bW = this.bZ;
      this.bX = this.ca;
      this.bY = this.cb;
      double $$0 = this.dp() - this.bZ;
      double $$1 = this.dr() - this.ca;
      double $$2 = this.dv() - this.cb;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.bZ = this.dp();
         this.bW = this.bZ;
      }

      if ($$2 > 10.0) {
         this.cb = this.dv();
         this.bY = this.cb;
      }

      if ($$1 > 10.0) {
         this.ca = this.dr();
         this.bX = this.ca;
      }

      if ($$0 < -10.0) {
         this.bZ = this.dp();
         this.bW = this.bZ;
      }

      if ($$2 < -10.0) {
         this.cb = this.dv();
         this.bY = this.cb;
      }

      if ($$1 < -10.0) {
         this.ca = this.dr();
         this.bX = this.ca;
      }

      this.bZ += $$0 * 0.25;
      this.cb += $$2 * 0.25;
      this.ca += $$1 * 0.25;
   }

   protected void fK() {
      if (this.g(bji.d)) {
         bji $$0;
         if (this.fu()) {
            $$0 = bji.b;
         } else if (this.fB()) {
            $$0 = bji.c;
         } else if (this.bY()) {
            $$0 = bji.d;
         } else if (this.fh()) {
            $$0 = bji.e;
         } else if (this.bR() && !this.cn.b) {
            $$0 = bji.f;
         } else {
            $$0 = bji.a;
         }

         bji $$6;
         if (this.G_() || this.bN() || this.g($$0)) {
            $$6 = $$0;
         } else if (this.g(bji.f)) {
            $$6 = bji.f;
         } else {
            $$6 = bji.d;
         }

         this.b($$6);
      }
   }

   protected boolean g(bji $$0) {
      return this.dK().a(this, this.a($$0).a(this.di()).h(1.0E-7));
   }

   @Override
   public int av() {
      return this.cn.a ? 1 : 80;
   }

   @Override
   protected aot aL() {
      return aou.sI;
   }

   @Override
   protected aot aM() {
      return aou.sG;
   }

   @Override
   protected aot aN() {
      return aou.sH;
   }

   @Override
   public int bI() {
      return 10;
   }

   @Override
   public void a(aot $$0, float $$1, float $$2) {
      this.dK().a(this, this.dp(), this.dr(), this.dv(), $$0, this.da(), $$1, $$2);
   }

   public void a(aot $$0, aov $$1, float $$2, float $$3) {
   }

   @Override
   public aov da() {
      return aov.h;
   }

   @Override
   protected int db() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.Z_();
      } else if ($$0 == 23) {
         this.cq = false;
      } else if ($$0 == 22) {
         this.cq = true;
      } else if ($$0 == 43) {
         this.a(iw.f);
      } else {
         super.b($$0);
      }
   }

   private void a(iu $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dK().a($$0, this.d(1.0), this.ds() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   protected void q() {
      this.bQ = this.bP;
   }

   @Override
   protected void r() {
   }

   @Override
   public void by() {
      if (!this.dK().B && this.fH() && this.bN()) {
         this.aa();
         this.f(false);
      } else {
         double $$0 = this.dp();
         double $$1 = this.dr();
         double $$2 = this.dv();
         super.by();
         this.bT = this.bU;
         this.bU = 0.0F;
         this.s(this.dp() - $$0, this.dr() - $$1, this.dv() - $$2);
      }
   }

   @Override
   protected void ff() {
      super.ff();
      this.eO();
      this.aW = this.dA();
   }

   @Override
   public void b_() {
      if (this.bS > 0) {
         this.bS--;
      }

      if (this.dK().ai() == bgl.a && this.dK().X().b(cpg.j)) {
         if (this.et() < this.eK() && this.ah % 20 == 0) {
            this.b(1.0F);
         }

         if (this.bR.c() && this.ah % 10 == 0) {
            this.bR.a(this.bR.a() + 1);
         }
      }

      this.cl.j();
      this.bT = this.bU;
      super.b_();
      this.w((float)this.b(bkd.d));
      float $$1;
      if (this.aA() && !this.eu() && !this.bY()) {
         $$1 = Math.min(0.1F, (float)this.dn().h());
      } else {
         $$1 = 0.0F;
      }

      this.bU = this.bU + ($$1 - this.bU) * 0.4F;
      if (this.et() > 0.0F && !this.G_()) {
         eha $$2;
         if (this.bN() && !this.cY().dF()) {
            $$2 = this.cG().b(this.cY().cG()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cG().c(1.0, 0.5, 1.0);
         }

         List<big> $$4 = this.dK().a_(this, $$2);
         List<big> $$5 = Lists.newArrayList();

         for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
            big $$7 = $$4.get($$6);
            if ($$7.ag() == bik.J) {
               $$5.add($$7);
            } else if (!$$7.dF()) {
               this.c($$7);
            }
         }

         if (!$$5.isEmpty()) {
            this.c(ac.a($$5, this.ag));
         }
      }

      this.c(this.gh());
      this.c(this.gi());
      if (!this.dK().B && (this.ab > 0.5F || this.aX()) || this.cn.b || this.fB() || this.aA) {
         this.ge();
      }
   }

   private void c(@Nullable qs $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dK().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bik.a($$1).filter($$0x -> $$0x == bik.at).ifPresent($$0x -> {
            if (!buy.a(this.dK(), this)) {
               this.dK().a(null, this.dp(), this.dr(), this.dv(), buy.a(this.dK(), this.dK().z), this.da(), 1.0F, buy.a(this.dK().z));
            }
         });
      }
   }

   private void c(big $$0) {
      $$0.b_(this);
   }

   public int fL() {
      return this.an.b(f);
   }

   public void r(int $$0) {
      this.an.b(f, $$0);
   }

   public void s(int $$0) {
      int $$1 = this.fL();
      this.an.b(f, $$1 + $$0);
   }

   public void t(int $$0) {
      this.by = $$0;
      if (!this.dK().B) {
         this.ge();
         this.c(4, true);
      }
   }

   @Override
   public void a(bhe $$0) {
      super.a($$0);
      this.ap();
      if (!this.G_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-aro.b((this.eD() + this.dA()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-aro.a((this.eD() + this.dA()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(ape.N);
      this.a(ape.i.b(ape.m));
      this.a(ape.i.b(ape.n));
      this.ay();
      this.a_(false);
      this.a(Optional.of(he.a(this.dK().ac(), this.dk())));
   }

   @Override
   protected void ew() {
      super.ew();
      if (!this.dK().X().b(cpg.d)) {
         this.fM();
         this.cl.k();
      }
   }

   protected void fM() {
      for (int $$0 = 0; $$0 < this.cl.b(); $$0++) {
         ciw $$1 = this.cl.a($$0);
         if (!$$1.b() && cnf.e($$1)) {
            this.cl.b($$0);
         }
      }
   }

   @Override
   protected aot d(bhe $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected aot h_() {
      return aou.sy;
   }

   @Nullable
   public bye a(ciw $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public bye a(ciw $$0, boolean $$1, boolean $$2) {
      if ($$0.b()) {
         return null;
      } else {
         if (this.dK().B) {
            this.a(bgn.a);
         }

         double $$3 = this.dt() - 0.3F;
         bye $$4 = new bye(this.dK(), this.dp(), $$3, this.dv(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.c(this.cv());
         }

         if ($$1) {
            float $$5 = this.ag.i() * 0.5F;
            float $$6 = this.ag.i() * (float) (Math.PI * 2);
            $$4.o((double)(-aro.a($$6) * $$5), 0.2F, (double)(aro.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = aro.a(this.dC() * (float) (Math.PI / 180.0));
            float $$9 = aro.b(this.dC() * (float) (Math.PI / 180.0));
            float $$10 = aro.a(this.dA() * (float) (Math.PI / 180.0));
            float $$11 = aro.b(this.dA() * (float) (Math.PI / 180.0));
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

   public float d(dey $$0) {
      float $$1 = this.cl.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = cnf.g(this);
         ciw $$3 = this.eR();
         if ($$2 > 0 && !$$3.b()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bhu.a(this)) {
         $$1 *= 1.0F + (float)(bhu.b(this) + 1) * 0.2F;
      }

      if (this.a(bhv.d)) {
         $$1 *= switch (this.b(bhv.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      if (this.a(apo.a) && !cnf.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aA()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dey $$0) {
      return !$$0.y() || this.cl.f().b($$0);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.a_(this.cp.getId());
      qy $$1 = $$0.c("Inventory", 10);
      this.cl.b($$1);
      this.cl.l = $$0.h("SelectedItemSlot");
      this.cm = $$0.g("SleepTimer");
      this.cf = $$0.j("XpP");
      this.cd = $$0.h("XpLevel");
      this.ce = $$0.h("XpTotal");
      this.cg = $$0.h("XpSeed");
      if (this.cg == 0) {
         this.cg = this.ag.f();
      }

      this.r($$0.h("Score"));
      this.bR.a($$0);
      this.cn.b($$0);
      this.a(bkd.d).a((double)this.cn.b());
      if ($$0.b("EnderItems", 9)) {
         this.bO.a($$0.c("EnderItems", 10));
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(he.a.parse(rd.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      re.g($$0);
      $$0.a("Inventory", this.cl.a(new qy()));
      $$0.a("SelectedItemSlot", this.cl.l);
      $$0.a("SleepTimer", (short)this.cm);
      $$0.a("XpP", this.cf);
      $$0.a("XpLevel", this.cd);
      $$0.a("XpTotal", this.ce);
      $$0.a("XpSeed", this.cg);
      $$0.a("Score", this.fL());
      this.bR.b($$0);
      this.cn.a($$0);
      $$0.a("EnderItems", this.bO.g());
      if (!this.gh().g()) {
         $$0.a("ShoulderEntityLeft", this.gh());
      }

      if (!this.gi().g()) {
         $$0.a("ShoulderEntityRight", this.gi());
      }

      this.gp().flatMap($$0x -> he.a.encodeStart(rd.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
   }

   @Override
   public boolean b(bhe $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(apl.n)) {
         return !this.dK().X().b(cpg.C);
      } else if ($$0.a(apl.m)) {
         return !this.dK().X().b(cpg.D);
      } else if ($$0.a(apl.i)) {
         return !this.dK().X().b(cpg.E);
      } else {
         return $$0.a(apl.o) ? !this.dK().X().b(cpg.F) : false;
      }
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cn.a && !$$0.a(apl.d)) {
         return false;
      } else {
         this.bb = 0;
         if (this.eu()) {
            return false;
         } else {
            if (!this.dK().B) {
               this.ge();
            }

            if ($$0.f()) {
               if (this.dK().ai() == bgl.a) {
                  $$1 = 0.0F;
               }

               if (this.dK().ai() == bgl.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dK().ai() == bgl.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(biw $$0) {
      super.d($$0);
      if ($$0.fE()) {
         this.s(true);
      }
   }

   @Override
   public boolean em() {
      return !this.fR().a && super.em();
   }

   public boolean a(cbl $$0) {
      eig $$1 = this.cf();
      eig $$2 = $$0.cf();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bhe $$0, float $$1) {
      this.cl.a($$0, $$1, cbk.g);
   }

   @Override
   protected void c(bhe $$0, float $$1) {
      this.cl.a($$0, $$1, cbk.h);
   }

   @Override
   protected void u(float $$0) {
      if (this.bv.a(ciz.uy)) {
         if (!this.dK().B) {
            this.b(ape.c.b(this.bv.d()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + aro.d($$0);
            bgn $$2 = this.fm();
            this.bv.a($$1, this, $$1x -> $$1x.d($$2));
            if (this.bv.b()) {
               if ($$2 == bgn.a) {
                  this.a(bil.a, ciw.b);
               } else {
                  this.a(bil.b, ciw.b);
               }

               this.bv = ciw.b;
               this.a(aou.uR, 0.8F, 0.8F + this.dK().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bhe $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fi(), 0.0F);
         this.y(this.fi() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(ape.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.A($$0.a());
            this.eI().a($$0, var7);
            this.c(this.et() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(ape.J, Math.round(var7 * 10.0F));
            }

            this.a(dji.o);
         }
      }
   }

   @Override
   protected boolean dS() {
      return !this.cn.b && super.dS();
   }

   public boolean W() {
      return false;
   }

   public void a(dds $$0, boolean $$1) {
   }

   public void a(cok $$0) {
   }

   public void a(dcu $$0) {
   }

   public void a(ddx $$0) {
   }

   public void a(ddj $$0) {
   }

   public void a(bwh $$0, bgh $$1) {
   }

   public OptionalInt a(@Nullable bgr $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, coi $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(ciw $$0, bgn $$1) {
   }

   public bgo a(big $$0, bgn $$1) {
      if (this.G_()) {
         if ($$0 instanceof bgr) {
            this.a((bgr)$$0);
         }

         return bgo.d;
      } else {
         ciw $$2 = this.b($$1);
         ciw $$3 = $$2.p();
         bgo $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cn.d && $$2 == this.b($$1) && $$2.L() < $$3.L()) {
               $$2.f($$3.L());
            }

            return $$4;
         } else {
            if (!$$2.b() && $$0 instanceof biw) {
               if (this.cn.d) {
                  $$2 = $$3;
               }

               bgo $$5 = $$2.a(this, (biw)$$0, $$1);
               if ($$5.a()) {
                  this.dK().a(dji.r, $$0.di(), dji.a.a(this));
                  if ($$2.b() && !this.cn.d) {
                     this.a($$1, ciw.b);
                  }

                  return $$5;
               }
            }

            return bgo.d;
         }
      }
   }

   @Override
   protected float l(big $$0) {
      return -0.6F;
   }

   @Override
   public void bB() {
      super.bB();
      this.J = 0;
   }

   @Override
   protected boolean eW() {
      return super.eW() || this.fB();
   }

   @Override
   public boolean dY() {
      return !this.cn.b;
   }

   @Override
   protected ehf a(ehf $$0, bjc $$1) {
      if (!this.cn.b && $$0.d <= 0.0 && ($$1 == bjc.a || $$1 == bjc.b) && this.fI() && this.x()) {
         double $$2 = $$0.c;
         double $$3 = $$0.e;
         double $$4 = 0.05;

         while ($$2 != 0.0 && this.dK().a(this, this.cG().d($$2, (double)(-this.dE()), 0.0))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }
         }

         while ($$3 != 0.0 && this.dK().a(this, this.cG().d(0.0, (double)(-this.dE()), $$3))) {
            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         while ($$2 != 0.0 && $$3 != 0.0 && this.dK().a(this, this.cG().d($$2, (double)(-this.dE()), $$3))) {
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

         $$0 = new ehf($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean x() {
      return this.aA() || this.ab < this.dE() && !this.dK().a(this, this.cG().d(0.0, (double)(this.ab - this.dE()), 0.0));
   }

   public void d(big $$0) {
      if ($$0.cp()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.b(bkd.f);
            float $$2;
            if ($$0 instanceof biw) {
               $$2 = cnf.a(this.eR(), ((biw)$$0).eQ());
            } else {
               $$2 = cnf.a(this.eR(), bjb.a);
            }

            float $$4 = this.B(0.5F);
            $$1 *= 0.2F + $$4 * $$4 * 0.8F;
            $$2 *= $$4;
            this.gk();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$5 = $$4 > 0.9F;
               boolean $$6 = false;
               int $$7 = 0;
               $$7 += cnf.c(this);
               if (this.bX() && $$5) {
                  this.dK().a(null, this.dp(), this.dr(), this.dv(), aou.sq, this.da(), 1.0F, 1.0F);
                  $$7++;
                  $$6 = true;
               }

               boolean $$8 = $$5 && this.ab > 0.0F && !this.aA() && !this.j_() && !this.aX() && !this.a(bhv.o) && !this.bN() && $$0 instanceof biw;
               $$8 = $$8 && !this.bX();
               if ($$8) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$9 = false;
               double $$10 = (double)(this.Y - this.X);
               if ($$5 && !$$8 && !$$6 && this.aA() && $$10 < (double)this.fd()) {
                  ciw $$11 = this.b(bgn.a);
                  if ($$11.d() instanceof ckh) {
                     $$9 = true;
                  }
               }

               float $$12 = 0.0F;
               boolean $$13 = false;
               int $$14 = cnf.d(this);
               if ($$0 instanceof biw) {
                  $$12 = ((biw)$$0).et();
                  if ($$14 > 0 && !$$0.bM()) {
                     $$13 = true;
                     $$0.g(1);
                  }
               }

               ehf $$15 = $$0.dn();
               boolean $$16 = $$0.a(this.dL().a(this), $$1);
               if ($$16) {
                  if ($$7 > 0) {
                     if ($$0 instanceof biw) {
                        ((biw)$$0)
                           .q(
                              (double)((float)$$7 * 0.5F),
                              (double)aro.a(this.dA() * (float) (Math.PI / 180.0)),
                              (double)(-aro.b(this.dA() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-aro.a(this.dA() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F),
                           0.1,
                           (double)(aro.b(this.dA() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F)
                        );
                     }

                     this.f(this.dn().d(0.6, 1.0, 0.6));
                     this.g(false);
                  }

                  if ($$9) {
                     float $$17 = 1.0F + cnf.a(this) * $$1;

                     for (biw $$19 : this.dK().a(biw.class, $$0.cG().c(1.0, 0.25, 1.0))) {
                        if ($$19 != this && $$19 != $$0 && !this.s($$19) && (!($$19 instanceof bxu) || !((bxu)$$19).t()) && this.f($$19) < 9.0) {
                           $$19.q(0.4F, (double)aro.a(this.dA() * (float) (Math.PI / 180.0)), (double)(-aro.b(this.dA() * (float) (Math.PI / 180.0))));
                           $$19.a(this.dL().a(this), $$17);
                        }
                     }

                     this.dK().a(null, this.dp(), this.dr(), this.dv(), aou.st, this.da(), 1.0F, 1.0F);
                     this.fN();
                  }

                  if ($$0 instanceof akj && $$0.T) {
                     ((akj)$$0).c.b(new zs($$0));
                     $$0.T = false;
                     $$0.f($$15);
                  }

                  if ($$8) {
                     this.dK().a(null, this.dp(), this.dr(), this.dv(), aou.sp, this.da(), 1.0F, 1.0F);
                     this.a($$0);
                  }

                  if (!$$8 && !$$9) {
                     if ($$5) {
                        this.dK().a(null, this.dp(), this.dr(), this.dv(), aou.ss, this.da(), 1.0F, 1.0F);
                     } else {
                        this.dK().a(null, this.dp(), this.dr(), this.dv(), aou.su, this.da(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.b($$0);
                  }

                  this.A($$0);
                  if ($$0 instanceof biw) {
                     cnf.a((biw)$$0, this);
                  }

                  cnf.b(this, $$0);
                  ciw $$20 = this.eR();
                  big $$21 = $$0;
                  if ($$0 instanceof bww) {
                     $$21 = ((bww)$$0).b;
                  }

                  if (!this.dK().B && !$$20.b() && $$21 instanceof biw) {
                     $$20.a((biw)$$21, this);
                     if ($$20.b()) {
                        this.a(bgn.a, ciw.b);
                     }
                  }

                  if ($$0 instanceof biw) {
                     float $$22 = $$12 - ((biw)$$0).et();
                     this.a(ape.G, Math.round($$22 * 10.0F));
                     if ($$14 > 0) {
                        $$0.g($$14 * 4);
                     }

                     if (this.dK() instanceof aki && $$22 > 2.0F) {
                        int $$23 = (int)((double)$$22 * 0.5);
                        ((aki)this.dK()).a(iw.h, $$0.dp(), $$0.e(0.5), $$0.dv(), $$23, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.A(0.1F);
               } else {
                  this.dK().a(null, this.dp(), this.dr(), this.dv(), aou.sr, this.da(), 1.0F, 1.0F);
                  if ($$13) {
                     $$0.ay();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(biw $$0) {
      this.d((big)$$0);
   }

   public void s(boolean $$0) {
      float $$1 = 0.25F + (float)cnf.g(this) * 0.05F;
      if ($$0) {
         $$1 += 0.75F;
      }

      if (this.ag.i() < $$1) {
         this.gl().a(ciz.uy, 100);
         this.fr();
         this.dK().a(this, (byte)30);
      }
   }

   @Override
   public void a(big $$0) {
   }

   public void b(big $$0) {
   }

   public void fN() {
      double $$0 = (double)(-aro.a(this.dA() * (float) (Math.PI / 180.0)));
      double $$1 = (double)aro.b(this.dA() * (float) (Math.PI / 180.0));
      if (this.dK() instanceof aki) {
         ((aki)this.dK()).a(iw.ad, this.dp() + $$0, this.e(0.5), this.dv() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fO() {
   }

   @Override
   public void a(big.c $$0) {
      super.a($$0);
      this.bP.b(this);
      if (this.bQ != null && this.fS()) {
         this.r();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile fP() {
      return this.cp;
   }

   public cbk fQ() {
      return this.cl;
   }

   public cbi fR() {
      return this.cn;
   }

   public void a(ciw $$0, ciw $$1, cek $$2) {
   }

   public boolean fS() {
      return this.bQ != this.bP;
   }

   public Either<cbl.a, asn> a(gv $$0) {
      this.b($$0);
      this.cm = 0;
      return Either.right(asn.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fC();
      if (this.dK() instanceof aki && $$1) {
         ((aki)this.dK()).e();
      }

      this.cm = $$0 ? 0 : 100;
   }

   @Override
   public void fC() {
      this.a(true, true);
   }

   public static Optional<ehf> a(aki $$0, gv $$1, float $$2, boolean $$3, boolean $$4) {
      dey $$5 = $$0.a_($$1);
      csk $$6 = $$5.b();
      if ($$6 instanceof cyr && ($$3 || $$5.c(cyr.c) > 0) && cyr.a($$0)) {
         Optional<ehf> $$7 = cyr.a(bik.bt, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(cyr.c, Integer.valueOf($$5.c(cyr.c) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof csd && csd.a($$0)) {
         return csd.a(bik.bt, $$0, $$1, $$5.c(csd.aC), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dey $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new ehf((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean fT() {
      return this.fB() && this.cm >= 100;
   }

   public int fU() {
      return this.cm;
   }

   public void a(te $$0, boolean $$1) {
   }

   public void a(aep $$0) {
      this.b(ape.i.b($$0));
   }

   public void a(aep $$0, int $$1) {
      this.a(ape.i.b($$0), $$1);
   }

   public void b(apb<?> $$0) {
      this.a($$0, 1);
   }

   public void a(apb<?> $$0, int $$1) {
   }

   public void a(apb<?> $$0) {
   }

   public int a(Collection<clz<?>> $$0) {
      return 0;
   }

   public void a(clz<?> $$0, List<ciw> $$1) {
   }

   public void a(aep[] $$0) {
   }

   public int b(Collection<clz<?>> $$0) {
      return 0;
   }

   @Override
   public void eZ() {
      super.eZ();
      this.a(ape.E);
      if (this.bX()) {
         this.A(0.2F);
      } else {
         this.A(0.05F);
      }
   }

   @Override
   public void h(ehf $$0) {
      double $$1 = this.dp();
      double $$2 = this.dr();
      double $$3 = this.dv();
      if (this.bY() && !this.bN()) {
         double $$4 = this.bE().d;
         double $$5 = $$4 < -0.2 ? 0.085 : 0.06;
         if ($$4 <= 0.0 || this.bj || !this.dK().a_(gv.a(this.dp(), this.dr() + 1.0 - 0.1, this.dv())).u().c()) {
            ehf $$6 = this.dn();
            this.f($$6.b(0.0, ($$4 - $$6.d) * $$5, 0.0));
         }
      }

      if (this.cn.b && !this.bN()) {
         double $$7 = this.dn().d;
         super.h($$0);
         ehf $$8 = this.dn();
         this.o($$8.c, $$7 * 0.6, $$8.e);
         this.n();
         this.b(7, false);
      } else {
         super.h($$0);
      }

      this.r(this.dp() - $$1, this.dr() - $$2, this.dv() - $$3);
   }

   @Override
   public void bd() {
      if (this.cn.b) {
         this.h(false);
      } else {
         super.bd();
      }
   }

   protected boolean h(gv $$0) {
      return !this.dK().a_($$0).o(this.dK(), $$0);
   }

   @Override
   public float fd() {
      return (float)this.b(bkd.d);
   }

   public void r(double $$0, double $$1, double $$2) {
      if (!this.bN()) {
         if (this.bY()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(ape.C, $$3);
               this.A(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(apo.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(ape.w, $$4);
               this.A(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.aX()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(ape.s, $$5);
               this.A(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.j_()) {
            if ($$1 > 0.0) {
               this.a(ape.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aA()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bX()) {
                  this.a(ape.r, $$6);
                  this.A(0.1F * (float)$$6 * 0.01F);
               } else if (this.bW()) {
                  this.a(ape.q, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(ape.p, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fu()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(ape.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(ape.v, $$8);
            }
         }
      }
   }

   private void s(double $$0, double $$1, double $$2) {
      if (this.bN()) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         if ($$3 > 0) {
            big $$4 = this.cY();
            if ($$4 instanceof cdc) {
               this.a(ape.x, $$3);
            } else if ($$4 instanceof cde) {
               this.a(ape.y, $$3);
            } else if ($$4 instanceof buz) {
               this.a(ape.z, $$3);
            } else if ($$4 instanceof bwh) {
               this.a(ape.A, $$3);
            } else if ($$4 instanceof bzm) {
               this.a(ape.D, $$3);
            }
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bhe $$2) {
      if (this.cn.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(ape.t, (int)Math.round((double)$$0 * 100.0));
         }

         return super.a($$0, $$1, $$2);
      }
   }

   public boolean fV() {
      if (!this.aA() && !this.fu() && !this.aX() && !this.a(bhv.y)) {
         ciw $$0 = this.c(bil.e);
         if ($$0.a(ciz.nh) && chq.d($$0)) {
            this.fW();
            return true;
         }
      }

      return false;
   }

   public void fW() {
      this.b(7, true);
   }

   public void fX() {
      this.b(7, true);
      this.b(7, false);
   }

   @Override
   protected void bg() {
      if (!this.G_()) {
         super.bg();
      }
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      if (this.aX()) {
         this.aP();
         this.b($$1);
      } else {
         gv $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dey $$3 = this.dK().a_($$2);
            if ($$3.a(apj.bn)) {
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
   public biw.a eE() {
      return new biw.a(aou.sF, aou.sv);
   }

   @Override
   public boolean a(aki $$0, biw $$1) {
      this.b(ape.g.b($$1.ag()));
      return true;
   }

   @Override
   public void a(dey $$0, ehf $$1) {
      if (!this.cn.b) {
         super.a($$0, $$1);
      }
   }

   public void d(int $$0) {
      this.s($$0);
      this.cf = this.cf + (float)$$0 / (float)this.fZ();
      this.ce = aro.a(this.ce + $$0, 0, Integer.MAX_VALUE);

      while (this.cf < 0.0F) {
         float $$1 = this.cf * (float)this.fZ();
         if (this.cd > 0) {
            this.c(-1);
            this.cf = 1.0F + $$1 / (float)this.fZ();
         } else {
            this.c(-1);
            this.cf = 0.0F;
         }
      }

      while (this.cf >= 1.0F) {
         this.cf = (this.cf - 1.0F) * (float)this.fZ();
         this.c(1);
         this.cf = this.cf / (float)this.fZ();
      }
   }

   public int fY() {
      return this.cg;
   }

   @Override
   public void a(ciw $$0, int $$1) {
      this.cd -= $$1;
      if (this.cd < 0) {
         this.cd = 0;
         this.cf = 0.0F;
         this.ce = 0;
      }

      this.cg = this.ag.f();
   }

   public void c(int $$0) {
      this.cd += $$0;
      if (this.cd < 0) {
         this.cd = 0;
         this.cf = 0.0F;
         this.ce = 0;
      }

      if ($$0 > 0 && this.cd % 5 == 0 && (float)this.co < (float)this.ah - 100.0F) {
         float $$1 = this.cd > 30 ? 1.0F : (float)this.cd / 30.0F;
         this.dK().a(null, this.dp(), this.dr(), this.dv(), aou.sE, this.da(), $$1 * 0.75F, 1.0F);
         this.co = this.ah;
      }
   }

   public int fZ() {
      if (this.cd >= 30) {
         return 112 + (this.cd - 30) * 9;
      } else {
         return this.cd >= 15 ? 37 + (this.cd - 15) * 5 : 7 + this.cd * 2;
      }
   }

   public void A(float $$0) {
      if (!this.cn.a) {
         if (!this.dK().B) {
            this.bR.a($$0);
         }
      }
   }

   public Optional<car> Y() {
      return Optional.empty();
   }

   public cdy ga() {
      return this.bR;
   }

   public boolean t(boolean $$0) {
      return this.cn.a || $$0 || this.bR.c();
   }

   public boolean gb() {
      return this.et() > 0.0F && this.et() < this.eK();
   }

   public boolean gc() {
      return this.cn.e;
   }

   public boolean a(gv $$0, hb $$1, ciw $$2) {
      if (this.cn.e) {
         return true;
      } else {
         gv $$3 = $$0.a($$1.g());
         dfc $$4 = new dfc(this.dK(), $$3, false);
         return $$2.a(this.dK().B_().d(jd.e), $$4);
      }
   }

   @Override
   public int ec() {
      if (!this.dK().X().b(cpg.d) && !this.G_()) {
         int $$0 = this.cd * 7;
         return $$0 > 100 ? 100 : $$0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean ed() {
      return true;
   }

   @Override
   public boolean cB() {
      return true;
   }

   @Override
   protected big.b aU() {
      return this.cn.b || this.aA() && this.bU() ? big.b.a : big.b.d;
   }

   public void w() {
   }

   @Override
   public te ab() {
      return te.b(this.cp.getName());
   }

   public cfl gd() {
      return this.bO;
   }

   @Override
   public ciw c(bil $$0) {
      if ($$0 == bil.a) {
         return this.cl.f();
      } else if ($$0 == bil.b) {
         return this.cl.k.get(0);
      } else {
         return $$0.a() == bil.a.b ? this.cl.j.get($$0.b()) : ciw.b;
      }
   }

   @Override
   protected boolean a(bil $$0) {
      return $$0.a() == bil.a.b;
   }

   @Override
   public void a(bil $$0, ciw $$1) {
      this.e($$1);
      if ($$0 == bil.a) {
         this.a($$0, this.cl.i.set(this.cl.l, $$1), $$1);
      } else if ($$0 == bil.b) {
         this.a($$0, this.cl.k.set(0, $$1), $$1);
      } else if ($$0.a() == bil.a.b) {
         this.a($$0, this.cl.j.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(ciw $$0) {
      return this.cl.e($$0);
   }

   @Override
   public Iterable<ciw> bJ() {
      return Lists.newArrayList(new ciw[]{this.eR(), this.eS()});
   }

   @Override
   public Iterable<ciw> bK() {
      return this.cl.j;
   }

   public boolean h(qs $$0) {
      if (this.bN() || !this.aA() || this.aX() || this.aA) {
         return false;
      } else if (this.gh().g()) {
         this.i($$0);
         this.ck = this.dK().V();
         return true;
      } else if (this.gi().g()) {
         this.j($$0);
         this.ck = this.dK().V();
         return true;
      } else {
         return false;
      }
   }

   protected void ge() {
      if (this.ck + 20L < this.dK().V()) {
         this.k(this.gh());
         this.i(new qs());
         this.k(this.gi());
         this.j(new qs());
      }
   }

   private void k(qs $$0) {
      if (!this.dK().B && !$$0.g()) {
         bik.a($$0, this.dK()).ifPresent($$0x -> {
            if ($$0x instanceof bjs) {
               ((bjs)$$0x).b(this.ay);
            }

            $$0x.e(this.dp(), this.dr() + 0.7F, this.dv());
            ((aki)this.dK()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean G_();

   @Override
   public boolean bq() {
      return !this.G_() && super.bq();
   }

   @Override
   public boolean bY() {
      return !this.cn.b && !this.G_() && super.bY();
   }

   public abstract boolean f();

   @Override
   public boolean cy() {
      return !this.cn.b;
   }

   public eie gf() {
      return this.dK().I();
   }

   @Override
   public te H_() {
      tr $$0 = eic.a(this.cf(), this.ab());
      return this.a($$0);
   }

   private tr a(tr $$0) {
      String $$1 = this.fP().getName();
      return $$0.a($$1x -> $$1x.a(new tc(tc.a.d, "/tell " + $$1 + " ")).a(this.cF()).a($$1));
   }

   @Override
   public String cx() {
      return this.fP().getName();
   }

   @Override
   public float b(bji $$0, bih $$1) {
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
   public float fi() {
      return this.al().b(e);
   }

   public boolean a(cbm $$0) {
      return (this.al().b(bK) & $$0.a()) == $$0.a();
   }

   @Override
   public bjp a_(int $$0) {
      if ($$0 >= 0 && $$0 < this.cl.i.size()) {
         return bjp.a(this.cl, $$0);
      } else {
         int $$1 = $$0 - 200;
         return $$1 >= 0 && $$1 < this.bO.b() ? bjp.a(this.bO, $$1) : super.a_($$0);
      }
   }

   public boolean gg() {
      return this.cq;
   }

   public void u(boolean $$0) {
      this.cq = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.cn.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public biq fk() {
      return this.an.b(bL) == 0 ? biq.a : biq.b;
   }

   public void a(biq $$0) {
      this.an.b(bL, (byte)($$0 == biq.a ? 0 : 1));
   }

   public qs gh() {
      return this.an.b(bM);
   }

   protected void i(qs $$0) {
      this.an.b(bM, $$0);
   }

   public qs gi() {
      return this.an.b(bN);
   }

   protected void j(qs $$0) {
      this.an.b(bN, $$0);
   }

   public float gj() {
      return (float)(1.0 / this.b(bkd.h) * 20.0);
   }

   public float B(float $$0) {
      return aro.a(((float)this.aP + $$0) / this.gj(), 0.0F, 1.0F);
   }

   public void gk() {
      this.aP = 0;
   }

   public cis gl() {
      return this.cs;
   }

   @Override
   protected float aJ() {
      return !this.cn.b && !this.fu() ? super.aJ() : 1.0F;
   }

   public float gm() {
      return (float)this.b(bkd.k);
   }

   public boolean gn() {
      return this.cn.d && this.C() >= 2;
   }

   @Override
   public boolean f(ciw $$0) {
      bil $$1 = biy.h($$0);
      return this.c($$1).b();
   }

   @Override
   public bih a(bji $$0) {
      return c.getOrDefault($$0, bJ);
   }

   @Override
   public ImmutableList<bji> fy() {
      return ImmutableList.of(bji.a, bji.f, bji.d);
   }

   @Override
   public ciw g(ciw $$0) {
      if (!($$0.d() instanceof cjm)) {
         return ciw.b;
      } else {
         Predicate<ciw> $$1 = ((cjm)$$0.d()).e();
         ciw $$2 = cjm.a(this, $$1);
         if (!$$2.b()) {
            return $$2;
         } else {
            $$1 = ((cjm)$$0.d()).b();

            for (int $$3 = 0; $$3 < this.cl.b(); $$3++) {
               ciw $$4 = this.cl.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cn.d ? new ciw(ciz.nH) : ciw.b;
         }
      }
   }

   @Override
   public ciw a(cpk $$0, ciw $$1) {
      this.ga().a($$1.d(), $$1);
      this.b(ape.c.b($$1.d()));
      $$0.a(null, this.dp(), this.dr(), this.dv(), aou.sx, aov.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof akj) {
         ai.z.a((akj)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dey $$0) {
      return this.cn.b || super.c($$0);
   }

   @Override
   public ehf q(float $$0) {
      double $$1 = 0.22 * (this.fk() == biq.b ? -1.0 : 1.0);
      float $$2 = aro.i($$0 * 0.5F, this.dC(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = aro.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      if (this.fu() || this.fh()) {
         ehf $$4 = this.f($$0);
         ehf $$5 = this.dn();
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

         return this.l($$0).e(new ehf($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.bZ()) {
         return this.l($$0).e(new ehf($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cG().c() - 1.0;
         double $$13 = this.bW() ? -0.2 : 0.07;
         return this.l($$0).e(new ehf($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dJ() {
      return true;
   }

   public boolean go() {
      return this.fl() && this.fn().a(ciz.qj);
   }

   @Override
   public boolean dI() {
      return false;
   }

   public Optional<he> gp() {
      return this.ct;
   }

   public void a(Optional<he> $$0) {
      this.ct = $$0;
   }

   @Override
   public float eD() {
      return this.cj;
   }

   @Override
   public void m(float $$0) {
      super.m($$0);
      this.cj = $$0;
   }

   @Override
   public boolean dD() {
      return true;
   }

   @Override
   protected float fc() {
      if (this.cn.b && !this.bN()) {
         return this.bX() ? this.cn.a() * 2.0F : this.cn.a();
      } else {
         return this.bX() ? 0.025999999F : 0.02F;
      }
   }

   public static enum a {
      a,
      b(te.c("block.minecraft.bed.no_sleep")),
      c(te.c("block.minecraft.bed.too_far_away")),
      d(te.c("block.minecraft.bed.obstructed")),
      e,
      f(te.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final te g;

      private a() {
         this.g = null;
      }

      private a(te $$0) {
         this.g = $$0;
      }

      @Nullable
      public te a() {
         return this.g;
      }
   }
}
