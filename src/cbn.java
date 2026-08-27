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

public abstract class cbn extends biy {
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
   public static final bij bJ = bij.b(0.6F, 1.8F);
   private static final Map<bjk, bij> c = ImmutableMap.builder()
      .put(bjk.a, bJ)
      .put(bjk.c, v)
      .put(bjk.b, bij.b(0.6F, 0.6F))
      .put(bjk.d, bij.b(0.6F, 0.6F))
      .put(bjk.e, bij.b(0.6F, 0.6F))
      .put(bjk.f, bij.b(0.6F, 1.5F))
      .put(bjk.h, bij.c(0.2F, 0.2F))
      .build();
   private static final int d = 25;
   private static final adz<Float> e = aec.a(cbn.class, aeb.d);
   private static final adz<Integer> f = aec.a(cbn.class, aeb.b);
   protected static final adz<Byte> bK = aec.a(cbn.class, aeb.a);
   protected static final adz<Byte> bL = aec.a(cbn.class, aeb.a);
   protected static final adz<qr> bM = aec.a(cbn.class, aeb.s);
   protected static final adz<qr> bN = aec.a(cbn.class, aeb.s);
   private long ck;
   private final cbm cl = new cbm(this);
   protected cfn bO = new cfn();
   public final cfd bP;
   public cee bQ;
   protected cea bR = new cea();
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
   private final cbk cn = new cbk();
   public int cd;
   public int ce;
   public float cf;
   protected int cg;
   protected final float ch = 0.02F;
   private int co;
   private final GameProfile cp;
   private boolean cq;
   private ciy cr = ciy.b;
   private final ciu cs = this.k();
   private Optional<hd> ct = Optional.empty();
   @Nullable
   public ccb ci;
   protected float cj;

   public cbn(cpm $$0, gu $$1, float $$2, GameProfile $$3) {
      super(bim.bt, $$0);
      this.a_($$3.getId());
      this.cp = $$3;
      this.bP = new cfd(this.cl, !$$0.B, this);
      this.bQ = this.bP;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bg = 180.0F;
   }

   public boolean a(cpm $$0, gu $$1, cpj $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == cpj.d) {
         return true;
      } else if (this.gc()) {
         return false;
      } else {
         ciy $$3 = this.eR();
         return $$3.b() || !$$3.b($$0.B_().d(jc.e), new dfe($$0, $$1, false));
      }
   }

   public static bke.a fF() {
      return biy.dO().a(bkf.f, 1.0).a(bkf.d, 0.1F).a(bkf.h).a(bkf.k);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(e, 0.0F);
      this.an.a(f, 0);
      this.an.a(bK, (byte)0);
      this.an.a(bL, (byte)1);
      this.an.a(bM, new qr());
      this.an.a(bN, new qr());
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
         this.a(apg.k);
         this.a(apg.l);
         if (this.bv()) {
            this.a(apg.m);
         }

         if (this.bU()) {
            this.a(apg.o);
         }

         if (!this.fB()) {
            this.a(apg.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = arp.a(this.dp(), -2.9999999E7, 2.9999999E7);
      double $$2 = arp.a(this.dv(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dp() || $$2 != this.dv()) {
         this.e($$1, this.dr(), $$2);
      }

      this.aP++;
      ciy $$3 = this.eR();
      if (!ciy.a(this.cr, $$3)) {
         if (!ciy.b(this.cr, $$3)) {
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
      this.cc = this.a(apq.a);
      return this.cc;
   }

   private void p() {
      ciy $$0 = this.c(bin.f);
      if ($$0.a(cjb.nC) && !this.a(apq.a)) {
         this.b(new bhv(bhx.m, 200, 0, false, false, true));
      }
   }

   protected ciu k() {
      return new ciu();
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
      if (this.g(bjk.d)) {
         bjk $$0;
         if (this.fu()) {
            $$0 = bjk.b;
         } else if (this.fB()) {
            $$0 = bjk.c;
         } else if (this.bY()) {
            $$0 = bjk.d;
         } else if (this.fh()) {
            $$0 = bjk.e;
         } else if (this.bR() && !this.cn.b) {
            $$0 = bjk.f;
         } else {
            $$0 = bjk.a;
         }

         bjk $$6;
         if (this.G_() || this.bN() || this.g($$0)) {
            $$6 = $$0;
         } else if (this.g(bjk.f)) {
            $$6 = bjk.f;
         } else {
            $$6 = bjk.d;
         }

         this.b($$6);
      }
   }

   protected boolean g(bjk $$0) {
      return this.dK().a(this, this.a($$0).a(this.di()).h(1.0E-7));
   }

   @Override
   public int av() {
      return this.cn.a ? 1 : 80;
   }

   @Override
   protected aov aL() {
      return aow.sI;
   }

   @Override
   protected aov aM() {
      return aow.sG;
   }

   @Override
   protected aov aN() {
      return aow.sH;
   }

   @Override
   public int bI() {
      return 10;
   }

   @Override
   public void a(aov $$0, float $$1, float $$2) {
      this.dK().a(this, this.dp(), this.dr(), this.dv(), $$0, this.da(), $$1, $$2);
   }

   public void a(aov $$0, aox $$1, float $$2, float $$3) {
   }

   @Override
   public aox da() {
      return aox.h;
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

      if (this.dK().ai() == bgn.a && this.dK().X().b(cpi.j)) {
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
      this.w((float)this.b(bkf.d));
      float $$1;
      if (this.aA() && !this.eu() && !this.bY()) {
         $$1 = Math.min(0.1F, (float)this.dn().h());
      } else {
         $$1 = 0.0F;
      }

      this.bU = this.bU + ($$1 - this.bU) * 0.4F;
      if (this.et() > 0.0F && !this.G_()) {
         egz $$2;
         if (this.bN() && !this.cY().dF()) {
            $$2 = this.cG().b(this.cY().cG()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cG().c(1.0, 0.5, 1.0);
         }

         List<bii> $$4 = this.dK().a_(this, $$2);
         List<bii> $$5 = Lists.newArrayList();

         for (bii $$6 : $$4) {
            if ($$6.ag() == bim.J) {
               $$5.add($$6);
            } else if (!$$6.dF()) {
               this.c($$6);
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

   private void c(@Nullable qr $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dK().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bim.a($$1).filter($$0x -> $$0x == bim.at).ifPresent($$0x -> {
            if (!bva.a(this.dK(), this)) {
               this.dK().a(null, this.dp(), this.dr(), this.dv(), bva.a(this.dK(), this.dK().z), this.da(), 1.0F, bva.a(this.dK().z));
            }
         });
      }
   }

   private void c(bii $$0) {
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
   public void a(bhg $$0) {
      super.a($$0);
      this.ap();
      if (!this.G_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-arp.b((this.eD() + this.dA()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-arp.a((this.eD() + this.dA()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(apg.N);
      this.a(apg.i.b(apg.m));
      this.a(apg.i.b(apg.n));
      this.ay();
      this.a_(false);
      this.a(Optional.of(hd.a(this.dK().ac(), this.dk())));
   }

   @Override
   protected void ew() {
      super.ew();
      if (!this.dK().X().b(cpi.d)) {
         this.fM();
         this.cl.k();
      }
   }

   protected void fM() {
      for (int $$0 = 0; $$0 < this.cl.b(); $$0++) {
         ciy $$1 = this.cl.a($$0);
         if (!$$1.b() && cnh.e($$1)) {
            this.cl.b($$0);
         }
      }
   }

   @Override
   protected aov d(bhg $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected aov h_() {
      return aow.sy;
   }

   @Nullable
   public byg a(ciy $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public byg a(ciy $$0, boolean $$1, boolean $$2) {
      if ($$0.b()) {
         return null;
      } else {
         if (this.dK().B) {
            this.a(bgp.a);
         }

         double $$3 = this.dt() - 0.3F;
         byg $$4 = new byg(this.dK(), this.dp(), $$3, this.dv(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.c(this.cv());
         }

         if ($$1) {
            float $$5 = this.ag.i() * 0.5F;
            float $$6 = this.ag.i() * (float) (Math.PI * 2);
            $$4.o((double)(-arp.a($$6) * $$5), 0.2F, (double)(arp.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = arp.a(this.dC() * (float) (Math.PI / 180.0));
            float $$9 = arp.b(this.dC() * (float) (Math.PI / 180.0));
            float $$10 = arp.a(this.dA() * (float) (Math.PI / 180.0));
            float $$11 = arp.b(this.dA() * (float) (Math.PI / 180.0));
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

   public float d(dfa $$0) {
      float $$1 = this.cl.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = cnh.g(this);
         ciy $$3 = this.eR();
         if ($$2 > 0 && !$$3.b()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bhw.a(this)) {
         $$1 *= 1.0F + (float)(bhw.b(this) + 1) * 0.2F;
      }

      if (this.a(bhx.d)) {
         $$1 *= switch (this.b(bhx.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      if (this.a(apq.a) && !cnh.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aA()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dfa $$0) {
      return !$$0.y() || this.cl.f().b($$0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a_(this.cp.getId());
      qx $$1 = $$0.c("Inventory", 10);
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
      this.a(bkf.d).a((double)this.cn.b());
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
         this.a(hd.a.parse(rc.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      rd.g($$0);
      $$0.a("Inventory", this.cl.a(new qx()));
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

      this.gp().flatMap($$0x -> hd.a.encodeStart(rc.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
   }

   @Override
   public boolean b(bhg $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(apn.n)) {
         return !this.dK().X().b(cpi.C);
      } else if ($$0.a(apn.m)) {
         return !this.dK().X().b(cpi.D);
      } else if ($$0.a(apn.i)) {
         return !this.dK().X().b(cpi.E);
      } else {
         return $$0.a(apn.o) ? !this.dK().X().b(cpi.F) : false;
      }
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cn.a && !$$0.a(apn.d)) {
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
               if (this.dK().ai() == bgn.a) {
                  $$1 = 0.0F;
               }

               if (this.dK().ai() == bgn.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dK().ai() == bgn.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(biy $$0) {
      super.d($$0);
      if ($$0.fE()) {
         this.s(true);
      }
   }

   @Override
   public boolean em() {
      return !this.fR().a && super.em();
   }

   public boolean a(cbn $$0) {
      eif $$1 = this.cf();
      eif $$2 = $$0.cf();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bhg $$0, float $$1) {
      this.cl.a($$0, $$1, cbm.g);
   }

   @Override
   protected void c(bhg $$0, float $$1) {
      this.cl.a($$0, $$1, cbm.h);
   }

   @Override
   protected void u(float $$0) {
      if (this.bv.a(cjb.uy)) {
         if (!this.dK().B) {
            this.b(apg.c.b(this.bv.d()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + arp.d($$0);
            bgp $$2 = this.fm();
            this.bv.a($$1, this, $$1x -> $$1x.d($$2));
            if (this.bv.b()) {
               if ($$2 == bgp.a) {
                  this.a(bin.a, ciy.b);
               } else {
                  this.a(bin.b, ciy.b);
               }

               this.bv = ciy.b;
               this.a(aow.uR, 0.8F, 0.8F + this.dK().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bhg $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fi(), 0.0F);
         this.y(this.fi() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(apg.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.A($$0.a());
            this.eI().a($$0, var7);
            this.c(this.et() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(apg.J, Math.round(var7 * 10.0F));
            }

            this.a(djk.o);
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

   public void a(ddu $$0, boolean $$1) {
   }

   public void a(com $$0) {
   }

   public void a(dcw $$0) {
   }

   public void a(ddz $$0) {
   }

   public void a(ddl $$0) {
   }

   public void a(bwj $$0, bgj $$1) {
   }

   public OptionalInt a(@Nullable bgt $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, cok $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(ciy $$0, bgp $$1) {
   }

   public bgq a(bii $$0, bgp $$1) {
      if (this.G_()) {
         if ($$0 instanceof bgt) {
            this.a((bgt)$$0);
         }

         return bgq.d;
      } else {
         ciy $$2 = this.b($$1);
         ciy $$3 = $$2.p();
         bgq $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cn.d && $$2 == this.b($$1) && $$2.L() < $$3.L()) {
               $$2.f($$3.L());
            }

            return $$4;
         } else {
            if (!$$2.b() && $$0 instanceof biy) {
               if (this.cn.d) {
                  $$2 = $$3;
               }

               bgq $$5 = $$2.a(this, (biy)$$0, $$1);
               if ($$5.a()) {
                  this.dK().a(djk.r, $$0.di(), djk.a.a(this));
                  if ($$2.b() && !this.cn.d) {
                     this.a($$1, ciy.b);
                  }

                  return $$5;
               }
            }

            return bgq.d;
         }
      }
   }

   @Override
   protected float l(bii $$0) {
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
   protected ehe a(ehe $$0, bje $$1) {
      if (!this.cn.b && $$0.d <= 0.0 && ($$1 == bje.a || $$1 == bje.b) && this.fI() && this.x()) {
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

         $$0 = new ehe($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean x() {
      return this.aA() || this.ab < this.dE() && !this.dK().a(this, this.cG().d(0.0, (double)(this.ab - this.dE()), 0.0));
   }

   public void d(bii $$0) {
      if ($$0.cp()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.b(bkf.f);
            float $$2;
            if ($$0 instanceof biy) {
               $$2 = cnh.a(this.eR(), ((biy)$$0).eQ());
            } else {
               $$2 = cnh.a(this.eR(), bjd.a);
            }

            float $$4 = this.B(0.5F);
            $$1 *= 0.2F + $$4 * $$4 * 0.8F;
            $$2 *= $$4;
            this.gk();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$5 = $$4 > 0.9F;
               boolean $$6 = false;
               int $$7 = 0;
               $$7 += cnh.c(this);
               if (this.bX() && $$5) {
                  this.dK().a(null, this.dp(), this.dr(), this.dv(), aow.sq, this.da(), 1.0F, 1.0F);
                  $$7++;
                  $$6 = true;
               }

               boolean $$8 = $$5 && this.ab > 0.0F && !this.aA() && !this.j_() && !this.aX() && !this.a(bhx.o) && !this.bN() && $$0 instanceof biy;
               $$8 = $$8 && !this.bX();
               if ($$8) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$9 = false;
               double $$10 = (double)(this.Y - this.X);
               if ($$5 && !$$8 && !$$6 && this.aA() && $$10 < (double)this.fd()) {
                  ciy $$11 = this.b(bgp.a);
                  if ($$11.d() instanceof ckj) {
                     $$9 = true;
                  }
               }

               float $$12 = 0.0F;
               boolean $$13 = false;
               int $$14 = cnh.d(this);
               if ($$0 instanceof biy) {
                  $$12 = ((biy)$$0).et();
                  if ($$14 > 0 && !$$0.bM()) {
                     $$13 = true;
                     $$0.g(1);
                  }
               }

               ehe $$15 = $$0.dn();
               boolean $$16 = $$0.a(this.dL().a(this), $$1);
               if ($$16) {
                  if ($$7 > 0) {
                     if ($$0 instanceof biy) {
                        ((biy)$$0)
                           .q(
                              (double)((float)$$7 * 0.5F),
                              (double)arp.a(this.dA() * (float) (Math.PI / 180.0)),
                              (double)(-arp.b(this.dA() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-arp.a(this.dA() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F),
                           0.1,
                           (double)(arp.b(this.dA() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F)
                        );
                     }

                     this.f(this.dn().d(0.6, 1.0, 0.6));
                     this.g(false);
                  }

                  if ($$9) {
                     float $$17 = 1.0F + cnh.a(this) * $$1;

                     for (biy $$19 : this.dK().a(biy.class, $$0.cG().c(1.0, 0.25, 1.0))) {
                        if ($$19 != this && $$19 != $$0 && !this.s($$19) && (!($$19 instanceof bxw) || !((bxw)$$19).t()) && this.f($$19) < 9.0) {
                           $$19.q(0.4F, (double)arp.a(this.dA() * (float) (Math.PI / 180.0)), (double)(-arp.b(this.dA() * (float) (Math.PI / 180.0))));
                           $$19.a(this.dL().a(this), $$17);
                        }
                     }

                     this.dK().a(null, this.dp(), this.dr(), this.dv(), aow.st, this.da(), 1.0F, 1.0F);
                     this.fN();
                  }

                  if ($$0 instanceof akl && $$0.T) {
                     ((akl)$$0).c.b(new zt($$0));
                     $$0.T = false;
                     $$0.f($$15);
                  }

                  if ($$8) {
                     this.dK().a(null, this.dp(), this.dr(), this.dv(), aow.sp, this.da(), 1.0F, 1.0F);
                     this.a($$0);
                  }

                  if (!$$8 && !$$9) {
                     if ($$5) {
                        this.dK().a(null, this.dp(), this.dr(), this.dv(), aow.ss, this.da(), 1.0F, 1.0F);
                     } else {
                        this.dK().a(null, this.dp(), this.dr(), this.dv(), aow.su, this.da(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.b($$0);
                  }

                  this.A($$0);
                  if ($$0 instanceof biy) {
                     cnh.a((biy)$$0, this);
                  }

                  cnh.b(this, $$0);
                  ciy $$20 = this.eR();
                  bii $$21 = $$0;
                  if ($$0 instanceof bwy) {
                     $$21 = ((bwy)$$0).b;
                  }

                  if (!this.dK().B && !$$20.b() && $$21 instanceof biy) {
                     $$20.a((biy)$$21, this);
                     if ($$20.b()) {
                        this.a(bgp.a, ciy.b);
                     }
                  }

                  if ($$0 instanceof biy) {
                     float $$22 = $$12 - ((biy)$$0).et();
                     this.a(apg.G, Math.round($$22 * 10.0F));
                     if ($$14 > 0) {
                        $$0.g($$14 * 4);
                     }

                     if (this.dK() instanceof akk && $$22 > 2.0F) {
                        int $$23 = (int)((double)$$22 * 0.5);
                        ((akk)this.dK()).a(iv.h, $$0.dp(), $$0.e(0.5), $$0.dv(), $$23, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.A(0.1F);
               } else {
                  this.dK().a(null, this.dp(), this.dr(), this.dv(), aow.sr, this.da(), 1.0F, 1.0F);
                  if ($$13) {
                     $$0.ay();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(biy $$0) {
      this.d((bii)$$0);
   }

   public void s(boolean $$0) {
      float $$1 = 0.25F + (float)cnh.g(this) * 0.05F;
      if ($$0) {
         $$1 += 0.75F;
      }

      if (this.ag.i() < $$1) {
         this.gl().a(cjb.uy, 100);
         this.fr();
         this.dK().a(this, (byte)30);
      }
   }

   @Override
   public void a(bii $$0) {
   }

   public void b(bii $$0) {
   }

   public void fN() {
      double $$0 = (double)(-arp.a(this.dA() * (float) (Math.PI / 180.0)));
      double $$1 = (double)arp.b(this.dA() * (float) (Math.PI / 180.0));
      if (this.dK() instanceof akk) {
         ((akk)this.dK()).a(iv.ad, this.dp() + $$0, this.e(0.5), this.dv() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fO() {
   }

   @Override
   public void a(bii.c $$0) {
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

   public cbm fQ() {
      return this.cl;
   }

   public cbk fR() {
      return this.cn;
   }

   public void a(ciy $$0, ciy $$1, cem $$2) {
   }

   public boolean fS() {
      return this.bQ != this.bP;
   }

   public Either<cbn.a, asp> a(gu $$0) {
      this.b($$0);
      this.cm = 0;
      return Either.right(asp.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fC();
      if (this.dK() instanceof akk && $$1) {
         ((akk)this.dK()).e();
      }

      this.cm = $$0 ? 0 : 100;
   }

   @Override
   public void fC() {
      this.a(true, true);
   }

   public static Optional<ehe> a(akk $$0, gu $$1, float $$2, boolean $$3, boolean $$4) {
      dfa $$5 = $$0.a_($$1);
      csm $$6 = $$5.b();
      if ($$6 instanceof cyt && ($$3 || $$5.c(cyt.c) > 0) && cyt.a($$0)) {
         Optional<ehe> $$7 = cyt.a(bim.bt, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(cyt.c, Integer.valueOf($$5.c(cyt.c) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof csf && csf.a($$0)) {
         return csf.a(bim.bt, $$0, $$1, $$5.c(csf.aC), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dfa $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new ehe((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean fT() {
      return this.fB() && this.cm >= 100;
   }

   public int fU() {
      return this.cm;
   }

   public void a(tf $$0, boolean $$1) {
   }

   public void a(aer $$0) {
      this.b(apg.i.b($$0));
   }

   public void a(aer $$0, int $$1) {
      this.a(apg.i.b($$0), $$1);
   }

   public void b(apd<?> $$0) {
      this.a($$0, 1);
   }

   public void a(apd<?> $$0, int $$1) {
   }

   public void a(apd<?> $$0) {
   }

   public int a(Collection<cmb<?>> $$0) {
      return 0;
   }

   public void a(cmb<?> $$0, List<ciy> $$1) {
   }

   public void a(aer[] $$0) {
   }

   public int b(Collection<cmb<?>> $$0) {
      return 0;
   }

   @Override
   public void eZ() {
      super.eZ();
      this.a(apg.E);
      if (this.bX()) {
         this.A(0.2F);
      } else {
         this.A(0.05F);
      }
   }

   @Override
   public void h(ehe $$0) {
      double $$1 = this.dp();
      double $$2 = this.dr();
      double $$3 = this.dv();
      if (this.bY() && !this.bN()) {
         double $$4 = this.bE().d;
         double $$5 = $$4 < -0.2 ? 0.085 : 0.06;
         if ($$4 <= 0.0 || this.bj || !this.dK().a_(gu.a(this.dp(), this.dr() + 1.0 - 0.1, this.dv())).u().c()) {
            ehe $$6 = this.dn();
            this.f($$6.b(0.0, ($$4 - $$6.d) * $$5, 0.0));
         }
      }

      if (this.cn.b && !this.bN()) {
         double $$7 = this.dn().d;
         super.h($$0);
         ehe $$8 = this.dn();
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

   protected boolean h(gu $$0) {
      return !this.dK().a_($$0).o(this.dK(), $$0);
   }

   @Override
   public float fd() {
      return (float)this.b(bkf.d);
   }

   public void r(double $$0, double $$1, double $$2) {
      if (!this.bN()) {
         if (this.bY()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(apg.C, $$3);
               this.A(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(apq.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(apg.w, $$4);
               this.A(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.aX()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(apg.s, $$5);
               this.A(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.j_()) {
            if ($$1 > 0.0) {
               this.a(apg.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aA()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bX()) {
                  this.a(apg.r, $$6);
                  this.A(0.1F * (float)$$6 * 0.01F);
               } else if (this.bW()) {
                  this.a(apg.q, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(apg.p, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fu()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(apg.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(apg.v, $$8);
            }
         }
      }
   }

   private void s(double $$0, double $$1, double $$2) {
      if (this.bN()) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         if ($$3 > 0) {
            bii $$4 = this.cY();
            if ($$4 instanceof cde) {
               this.a(apg.x, $$3);
            } else if ($$4 instanceof cdg) {
               this.a(apg.y, $$3);
            } else if ($$4 instanceof bvb) {
               this.a(apg.z, $$3);
            } else if ($$4 instanceof bwj) {
               this.a(apg.A, $$3);
            } else if ($$4 instanceof bzo) {
               this.a(apg.D, $$3);
            }
         }
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bhg $$2) {
      if (this.cn.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(apg.t, (int)Math.round((double)$$0 * 100.0));
         }

         return super.a($$0, $$1, $$2);
      }
   }

   public boolean fV() {
      if (!this.aA() && !this.fu() && !this.aX() && !this.a(bhx.y)) {
         ciy $$0 = this.c(bin.e);
         if ($$0.a(cjb.nh) && chs.d($$0)) {
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
   protected void b(gu $$0, dfa $$1) {
      if (this.aX()) {
         this.aP();
         this.b($$1);
      } else {
         gu $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dfa $$3 = this.dK().a_($$2);
            if ($$3.a(apl.bn)) {
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
   public biy.a eE() {
      return new biy.a(aow.sF, aow.sv);
   }

   @Override
   public boolean a(akk $$0, biy $$1) {
      this.b(apg.g.b($$1.ag()));
      return true;
   }

   @Override
   public void a(dfa $$0, ehe $$1) {
      if (!this.cn.b) {
         super.a($$0, $$1);
      }
   }

   public void d(int $$0) {
      this.s($$0);
      this.cf = this.cf + (float)$$0 / (float)this.fZ();
      this.ce = arp.a(this.ce + $$0, 0, Integer.MAX_VALUE);

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
   public void a(ciy $$0, int $$1) {
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
         this.dK().a(null, this.dp(), this.dr(), this.dv(), aow.sE, this.da(), $$1 * 0.75F, 1.0F);
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

   public Optional<cat> Y() {
      return Optional.empty();
   }

   public cea ga() {
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

   public boolean a(gu $$0, ha $$1, ciy $$2) {
      if (this.cn.e) {
         return true;
      } else {
         gu $$3 = $$0.a($$1.g());
         dfe $$4 = new dfe(this.dK(), $$3, false);
         return $$2.a(this.dK().B_().d(jc.e), $$4);
      }
   }

   @Override
   public int ec() {
      if (!this.dK().X().b(cpi.d) && !this.G_()) {
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
   protected bii.b aU() {
      return this.cn.b || this.aA() && this.bU() ? bii.b.a : bii.b.d;
   }

   public void w() {
   }

   @Override
   public tf ab() {
      return tf.b(this.cp.getName());
   }

   public cfn gd() {
      return this.bO;
   }

   @Override
   public ciy c(bin $$0) {
      if ($$0 == bin.a) {
         return this.cl.f();
      } else if ($$0 == bin.b) {
         return this.cl.k.get(0);
      } else {
         return $$0.a() == bin.a.b ? this.cl.j.get($$0.b()) : ciy.b;
      }
   }

   @Override
   protected boolean a(bin $$0) {
      return $$0.a() == bin.a.b;
   }

   @Override
   public void a(bin $$0, ciy $$1) {
      this.e($$1);
      if ($$0 == bin.a) {
         this.a($$0, this.cl.i.set(this.cl.l, $$1), $$1);
      } else if ($$0 == bin.b) {
         this.a($$0, this.cl.k.set(0, $$1), $$1);
      } else if ($$0.a() == bin.a.b) {
         this.a($$0, this.cl.j.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(ciy $$0) {
      return this.cl.e($$0);
   }

   @Override
   public Iterable<ciy> bJ() {
      return Lists.newArrayList(new ciy[]{this.eR(), this.eS()});
   }

   @Override
   public Iterable<ciy> bK() {
      return this.cl.j;
   }

   public boolean h(qr $$0) {
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
         this.i(new qr());
         this.k(this.gi());
         this.j(new qr());
      }
   }

   private void k(qr $$0) {
      if (!this.dK().B && !$$0.g()) {
         bim.a($$0, this.dK()).ifPresent($$0x -> {
            if ($$0x instanceof bju) {
               ((bju)$$0x).b(this.ay);
            }

            $$0x.e(this.dp(), this.dr() + 0.7F, this.dv());
            ((akk)this.dK()).c($$0x);
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

   public eid gf() {
      return this.dK().I();
   }

   @Override
   public tf H_() {
      ts $$0 = eib.a(this.cf(), this.ab());
      return this.a($$0);
   }

   private ts a(ts $$0) {
      String $$1 = this.fP().getName();
      return $$0.a($$1x -> $$1x.a(new td(td.a.d, "/tell " + $$1 + " ")).a(this.cF()).a($$1));
   }

   @Override
   public String cx() {
      return this.fP().getName();
   }

   @Override
   public float b(bjk $$0, bij $$1) {
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

   public boolean a(cbo $$0) {
      return (this.al().b(bK) & $$0.a()) == $$0.a();
   }

   @Override
   public bjr a_(int $$0) {
      if ($$0 >= 0 && $$0 < this.cl.i.size()) {
         return bjr.a(this.cl, $$0);
      } else {
         int $$1 = $$0 - 200;
         return $$1 >= 0 && $$1 < this.bO.b() ? bjr.a(this.bO, $$1) : super.a_($$0);
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
   public bis fk() {
      return this.an.b(bL) == 0 ? bis.a : bis.b;
   }

   public void a(bis $$0) {
      this.an.b(bL, (byte)($$0 == bis.a ? 0 : 1));
   }

   public qr gh() {
      return this.an.b(bM);
   }

   protected void i(qr $$0) {
      this.an.b(bM, $$0);
   }

   public qr gi() {
      return this.an.b(bN);
   }

   protected void j(qr $$0) {
      this.an.b(bN, $$0);
   }

   public float gj() {
      return (float)(1.0 / this.b(bkf.h) * 20.0);
   }

   public float B(float $$0) {
      return arp.a(((float)this.aP + $$0) / this.gj(), 0.0F, 1.0F);
   }

   public void gk() {
      this.aP = 0;
   }

   public ciu gl() {
      return this.cs;
   }

   @Override
   protected float aJ() {
      return !this.cn.b && !this.fu() ? super.aJ() : 1.0F;
   }

   public float gm() {
      return (float)this.b(bkf.k);
   }

   public boolean gn() {
      return this.cn.d && this.C() >= 2;
   }

   @Override
   public boolean f(ciy $$0) {
      bin $$1 = bja.h($$0);
      return this.c($$1).b();
   }

   @Override
   public bij a(bjk $$0) {
      return c.getOrDefault($$0, bJ);
   }

   @Override
   public ImmutableList<bjk> fy() {
      return ImmutableList.of(bjk.a, bjk.f, bjk.d);
   }

   @Override
   public ciy g(ciy $$0) {
      if (!($$0.d() instanceof cjo)) {
         return ciy.b;
      } else {
         Predicate<ciy> $$1 = ((cjo)$$0.d()).e();
         ciy $$2 = cjo.a(this, $$1);
         if (!$$2.b()) {
            return $$2;
         } else {
            $$1 = ((cjo)$$0.d()).b();

            for (int $$3 = 0; $$3 < this.cl.b(); $$3++) {
               ciy $$4 = this.cl.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cn.d ? new ciy(cjb.nH) : ciy.b;
         }
      }
   }

   @Override
   public ciy a(cpm $$0, ciy $$1) {
      this.ga().a($$1.d(), $$1);
      this.b(apg.c.b($$1.d()));
      $$0.a(null, this.dp(), this.dr(), this.dv(), aow.sx, aox.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof akl) {
         ai.z.a((akl)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dfa $$0) {
      return this.cn.b || super.c($$0);
   }

   @Override
   public ehe q(float $$0) {
      double $$1 = 0.22 * (this.fk() == bis.b ? -1.0 : 1.0);
      float $$2 = arp.i($$0 * 0.5F, this.dC(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = arp.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      if (this.fu() || this.fh()) {
         ehe $$4 = this.f($$0);
         ehe $$5 = this.dn();
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

         return this.l($$0).e(new ehe($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.bZ()) {
         return this.l($$0).e(new ehe($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cG().c() - 1.0;
         double $$13 = this.bW() ? -0.2 : 0.07;
         return this.l($$0).e(new ehe($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dJ() {
      return true;
   }

   public boolean go() {
      return this.fl() && this.fn().a(cjb.qj);
   }

   @Override
   public boolean dI() {
      return false;
   }

   public Optional<hd> gp() {
      return this.ct;
   }

   public void a(Optional<hd> $$0) {
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
      b(tf.c("block.minecraft.bed.no_sleep")),
      c(tf.c("block.minecraft.bed.too_far_away")),
      d(tf.c("block.minecraft.bed.obstructed")),
      e,
      f(tf.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final tf g;

      private a() {
         this.g = null;
      }

      private a(tf $$0) {
         this.g = $$0;
      }

      @Nullable
      public tf a() {
         return this.g;
      }
   }
}
