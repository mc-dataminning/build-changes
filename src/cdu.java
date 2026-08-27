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

public abstract class cdu extends blg {
   private static final Logger b = LogUtils.getLogger();
   public static final int bA = 16;
   public static final bla bB = bla.b;
   public static final int bC = 0;
   public static final int bD = 20;
   public static final int bE = 100;
   public static final int bF = 10;
   public static final int bG = 200;
   public static final float bH = 1.5F;
   public static final float bI = 0.6F;
   public static final float bJ = 0.6F;
   public static final float bK = 1.62F;
   public static final bkr bL = bkr.b(0.6F, 1.8F);
   private static final Map<bls, bkr> c = ImmutableMap.builder()
      .put(bls.a, bL)
      .put(bls.c, v)
      .put(bls.b, bkr.b(0.6F, 0.6F))
      .put(bls.d, bkr.b(0.6F, 0.6F))
      .put(bls.e, bkr.b(0.6F, 0.6F))
      .put(bls.f, bkr.b(0.6F, 1.5F))
      .put(bls.h, bkr.c(0.2F, 0.2F))
      .build();
   private static final afo<Float> d = afr.a(cdu.class, afq.d);
   private static final afo<Integer> e = afr.a(cdu.class, afq.b);
   protected static final afo<Byte> bM = afr.a(cdu.class, afq.a);
   protected static final afo<Byte> bN = afr.a(cdu.class, afq.a);
   protected static final afo<rz> bO = afr.a(cdu.class, afq.s);
   protected static final afo<rz> bP = afr.a(cdu.class, afq.s);
   private long f;
   private final cdt cm = new cdt(this);
   protected chy bQ = new chy();
   public final chn bR;
   public cgm bS;
   protected cgi bT = new cgi();
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
   private final cdr co = new cdr();
   public int cf;
   public int cg;
   public float ch;
   protected int ci;
   protected final float cj = 0.02F;
   private int cp;
   private final GameProfile cq;
   private boolean cr;
   private clj cs = clj.b;
   private final clf ct = this.k();
   private Optional<ia> cu = Optional.empty();
   @Nullable
   public cei ck;
   protected float cl;

   public cdu(csa $$0, ht $$1, float $$2, GameProfile $$3) {
      super(bku.bt, $$0);
      this.a_($$3.getId());
      this.cq = $$3;
      this.bR = new chn(this.cm, !$$0.B, this);
      this.bS = this.bR;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bg = 180.0F;
   }

   public boolean a(csa $$0, ht $$1, crx $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == crx.d) {
         return true;
      } else if (this.gf()) {
         return false;
      } else {
         clj $$3 = this.eU();
         return $$3.b() || !$$3.b($$0.H_().d(jz.e), new dhm($$0, $$1, false));
      }
   }

   public static bml.a fI() {
      return blg.dR().a(bmm.c, 1.0).a(bmm.m, 0.1F).a(bmm.e).a(bmm.j);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(d, 0.0F);
      this.an.a(e, 0);
      this.an.a(bM, (byte)0);
      this.an.a(bN, (byte)bB.a());
      this.an.a(bO, new rz());
      this.an.a(bP, new rz());
   }

   @Override
   public void l() {
      this.af = this.O_();
      if (this.O_()) {
         this.c(false);
      }

      if (this.bX > 0) {
         this.bX--;
      }

      if (this.fE()) {
         this.cn++;
         if (this.cn > 100) {
            this.cn = 100;
         }

         if (!this.dN().B && this.dN().O()) {
            this.a(false, true);
         }
      } else if (this.cn > 0) {
         this.cn++;
         if (this.cn >= 110) {
            this.cn = 0;
         }
      }

      this.fM();
      super.l();
      if (!this.dN().B && this.bS != null && !this.bS.a(this)) {
         this.r();
         this.bS = this.bR;
      }

      this.w();
      if (!this.dN().B) {
         this.bT.a(this);
         this.a(arb.k);
         this.a(arb.l);
         if (this.bx()) {
            this.a(arb.m);
         }

         if (this.bV()) {
            this.a(arb.o);
         }

         if (!this.fE()) {
            this.a(arb.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = atm.a(this.ds(), -2.9999999E7, 2.9999999E7);
      double $$2 = atm.a(this.dy(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.ds() || $$2 != this.dy()) {
         this.a_($$1, this.du(), $$2);
      }

      this.aP++;
      clj $$3 = this.eU();
      if (!clj.a(this.cs, $$3)) {
         if (!clj.b(this.cs, $$3)) {
            this.gn();
         }

         this.cs = $$3.p();
      }

      this.u();
      this.ct.a();
      this.fN();
   }

   @Override
   protected float fh() {
      return this.fv() ? 15.0F : super.fh();
   }

   public boolean fJ() {
      return this.bS();
   }

   protected boolean fK() {
      return this.bS();
   }

   protected boolean fL() {
      return this.bS();
   }

   protected boolean fM() {
      this.ce = this.a(arl.a);
      return this.ce;
   }

   private void u() {
      clj $$0 = this.c(bkv.f);
      if ($$0.a(clm.on) && !this.a(arl.a)) {
         this.b(new bkd(bkf.m, 200, 0, false, false, true));
      }
   }

   protected clf k() {
      return new clf();
   }

   private void w() {
      this.bY = this.cb;
      this.bZ = this.cc;
      this.ca = this.cd;
      double $$0 = this.ds() - this.cb;
      double $$1 = this.du() - this.cc;
      double $$2 = this.dy() - this.cd;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cb = this.ds();
         this.bY = this.cb;
      }

      if ($$2 > 10.0) {
         this.cd = this.dy();
         this.ca = this.cd;
      }

      if ($$1 > 10.0) {
         this.cc = this.du();
         this.bZ = this.cc;
      }

      if ($$0 < -10.0) {
         this.cb = this.ds();
         this.bY = this.cb;
      }

      if ($$2 < -10.0) {
         this.cd = this.dy();
         this.ca = this.cd;
      }

      if ($$1 < -10.0) {
         this.cc = this.du();
         this.bZ = this.cc;
      }

      this.cb += $$0 * 0.25;
      this.cd += $$2 * 0.25;
      this.cc += $$1 * 0.25;
   }

   protected void fN() {
      if (this.g(bls.d)) {
         bls $$0;
         if (this.fx()) {
            $$0 = bls.b;
         } else if (this.fE()) {
            $$0 = bls.c;
         } else if (this.bZ()) {
            $$0 = bls.d;
         } else if (this.fk()) {
            $$0 = bls.e;
         } else if (this.bS() && !this.co.b) {
            $$0 = bls.f;
         } else {
            $$0 = bls.a;
         }

         bls $$6;
         if (this.O_() || this.bO() || this.g($$0)) {
            $$6 = $$0;
         } else if (this.g(bls.f)) {
            $$6 = bls.f;
         } else {
            $$6 = bls.d;
         }

         this.b($$6);
      }
   }

   protected boolean g(bls $$0) {
      return this.dN().a(this, this.a($$0).a(this.dl()).h(1.0E-7));
   }

   @Override
   public int ax() {
      return Math.max(1, this.dN().Y().c(this.co.a ? crw.F : crw.E));
   }

   @Override
   protected aqq aN() {
      return aqr.tc;
   }

   @Override
   protected aqq aO() {
      return aqr.ta;
   }

   @Override
   protected aqq aP() {
      return aqr.tb;
   }

   @Override
   public int bJ() {
      return 10;
   }

   @Override
   public void a(aqq $$0, float $$1, float $$2) {
      this.dN().a(this, this.ds(), this.du(), this.dy(), $$0, this.dc(), $$1, $$2);
   }

   public void a(aqq $$0, aqs $$1, float $$2, float $$3) {
   }

   @Override
   public aqs dc() {
      return aqs.h;
   }

   @Override
   protected int dd() {
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
         this.dN().a($$0, this.d(1.0), this.dv() + 1.0, this.g(1.0), $$2, $$3, $$4);
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
      if (!this.dN().B && this.fK() && this.bO()) {
         this.ac();
         this.f(false);
      } else {
         super.t();
         this.bV = this.bW;
         this.bW = 0.0F;
      }
   }

   @Override
   protected void fj() {
      super.fj();
      this.eR();
      this.aW = this.dD();
   }

   @Override
   public void c_() {
      if (this.bU > 0) {
         this.bU--;
      }

      if (this.dN().aj() == biu.a && this.dN().Y().b(crw.k)) {
         if (this.ew() < this.eN() && this.ah % 20 == 0) {
            this.b(1.0F);
         }

         if (this.bT.c() && this.ah % 10 == 0) {
            this.bT.a(this.bT.a() + 1);
         }
      }

      this.cm.j();
      this.bV = this.bW;
      super.c_();
      this.w((float)this.b(bmm.m));
      float $$1;
      if (this.aC() && !this.ex() && !this.bZ()) {
         $$1 = Math.min(0.1F, (float)this.dq().h());
      } else {
         $$1 = 0.0F;
      }

      this.bW = this.bW + ($$1 - this.bW) * 0.4F;
      if (this.ew() > 0.0F && !this.O_()) {
         ejp $$2;
         if (this.bO() && !this.da().dI()) {
            $$2 = this.cH().b(this.da().cH()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cH().c(1.0, 0.5, 1.0);
         }

         List<bkq> $$4 = this.dN().a_(this, $$2);
         List<bkq> $$5 = Lists.newArrayList();

         for (bkq $$6 : $$4) {
            if ($$6.ai() == bku.J) {
               $$5.add($$6);
            } else if (!$$6.dI()) {
               this.c($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.c(ac.a($$5, this.ag));
         }
      }

      this.c(this.gk());
      this.c(this.gl());
      if (!this.dN().B && (this.ab > 0.5F || this.aZ()) || this.co.b || this.fE() || this.aA) {
         this.gh();
      }
   }

   private void c(@Nullable rz $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dN().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bku.a($$1).filter($$0x -> $$0x == bku.at).ifPresent($$0x -> {
            if (!bxh.a(this.dN(), this)) {
               this.dN().a(null, this.ds(), this.du(), this.dy(), bxh.a(this.dN(), this.dN().z), this.dc(), 1.0F, bxh.a(this.dN().z));
            }
         });
      }
   }

   private void c(bkq $$0) {
      $$0.b_(this);
   }

   public int fO() {
      return this.an.b(e);
   }

   public void r(int $$0) {
      this.an.b(e, $$0);
   }

   public void s(int $$0) {
      int $$1 = this.fO();
      this.an.b(e, $$1 + $$0);
   }

   public void t(int $$0) {
      this.by = $$0;
      if (!this.dN().B) {
         this.gh();
         this.c(4, true);
      }
   }

   @Override
   public void a(bjo $$0) {
      super.a($$0);
      this.ar();
      if (!this.O_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-atm.b((this.eF() + this.dD()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-atm.a((this.eF() + this.dD()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(arb.N);
      this.a(arb.i.b(arb.m));
      this.a(arb.i.b(arb.n));
      this.aA();
      this.a_(false);
      this.a(Optional.of(ia.a(this.dN().ad(), this.dn())));
   }

   @Override
   protected void ez() {
      super.ez();
      if (!this.dN().Y().b(crw.d)) {
         this.fP();
         this.cm.k();
      }
   }

   protected void fP() {
      for (int $$0 = 0; $$0 < this.cm.b(); $$0++) {
         clj $$1 = this.cm.a($$0);
         if (!$$1.b() && cpw.e($$1)) {
            this.cm.b($$0);
         }
      }
   }

   @Override
   protected aqq d(bjo $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected aqq m_() {
      return aqr.sS;
   }

   @Nullable
   public can a(clj $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public can a(clj $$0, boolean $$1, boolean $$2) {
      if ($$0.b()) {
         return null;
      } else {
         if (this.dN().B) {
            this.a(biw.a);
         }

         double $$3 = this.dw() - 0.3F;
         can $$4 = new can(this.dN(), this.ds(), $$3, this.dy(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.a(this);
         }

         if ($$1) {
            float $$5 = this.ag.i() * 0.5F;
            float $$6 = this.ag.i() * (float) (Math.PI * 2);
            $$4.o((double)(-atm.a($$6) * $$5), 0.2F, (double)(atm.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = atm.a(this.dF() * (float) (Math.PI / 180.0));
            float $$9 = atm.b(this.dF() * (float) (Math.PI / 180.0));
            float $$10 = atm.a(this.dD() * (float) (Math.PI / 180.0));
            float $$11 = atm.b(this.dD() * (float) (Math.PI / 180.0));
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

   public float d(dhi $$0) {
      float $$1 = this.cm.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = cpw.g(this);
         clj $$3 = this.eU();
         if ($$2 > 0 && !$$3.b()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bke.a(this)) {
         $$1 *= 1.0F + (float)(bke.b(this) + 1) * 0.2F;
      }

      if (this.a(bkf.d)) {
         $$1 *= switch (this.b(bkf.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      if (this.a(arl.a) && !cpw.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aC()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dhi $$0) {
      return !$$0.y() || this.cm.f().b($$0);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a_(this.cq.getId());
      sf $$1 = $$0.c("Inventory", 10);
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
      this.a(bmm.m).a((double)this.co.b());
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
      $$0.a("Inventory", this.cm.a(new sf()));
      $$0.a("SelectedItemSlot", this.cm.l);
      $$0.a("SleepTimer", (short)this.cn);
      $$0.a("XpP", this.ch);
      $$0.a("XpLevel", this.cf);
      $$0.a("XpTotal", this.cg);
      $$0.a("XpSeed", this.ci);
      $$0.a("Score", this.fO());
      this.bT.b($$0);
      this.co.a($$0);
      $$0.a("EnderItems", this.bQ.g());
      if (!this.gk().g()) {
         $$0.a("ShoulderEntityLeft", this.gk());
      }

      if (!this.gl().g()) {
         $$0.a("ShoulderEntityRight", this.gl());
      }

      this.gs().flatMap($$0x -> ia.a.encodeStart(sn.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
   }

   @Override
   public boolean b(bjo $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(ari.n)) {
         return !this.dN().Y().b(crw.G);
      } else if ($$0.a(ari.m)) {
         return !this.dN().Y().b(crw.H);
      } else if ($$0.a(ari.i)) {
         return !this.dN().Y().b(crw.I);
      } else {
         return $$0.a(ari.o) ? !this.dN().Y().b(crw.J) : false;
      }
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.co.a && !$$0.a(ari.d)) {
         return false;
      } else {
         this.bb = 0;
         if (this.ex()) {
            return false;
         } else {
            if (!this.dN().B) {
               this.gh();
            }

            if ($$0.f()) {
               if (this.dN().aj() == biu.a) {
                  $$1 = 0.0F;
               }

               if (this.dN().aj() == biu.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dN().aj() == biu.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(blg $$0) {
      super.d($$0);
      if ($$0.fH()) {
         this.s(true);
      }
   }

   @Override
   public boolean ep() {
      return !this.fU().a && super.ep();
   }

   public boolean a(cdu $$0) {
      ekv $$1 = this.cg();
      ekv $$2 = $$0.cg();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bjo $$0, float $$1) {
      this.cm.a($$0, $$1, cdt.g);
   }

   @Override
   protected void c(bjo $$0, float $$1) {
      this.cm.a($$0, $$1, cdt.h);
   }

   @Override
   protected void u(float $$0) {
      if (this.bv.a(clm.vk)) {
         if (!this.dN().B) {
            this.b(arb.c.b(this.bv.d()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + atm.d($$0);
            biw $$2 = this.fp();
            this.bv.a($$1, this, $$1x -> $$1x.d($$2));
            if (this.bv.b()) {
               if ($$2 == biw.a) {
                  this.a(bkv.a, clj.b);
               } else {
                  this.a(bkv.b, clj.b);
               }

               this.bv = clj.b;
               this.a(aqr.vm, 0.8F, 0.8F + this.dN().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bjo $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fl(), 0.0F);
         this.y(this.fl() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(arb.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.A($$0.a());
            this.eL().a($$0, var7);
            this.c(this.ew() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(arb.J, Math.round(var7 * 10.0F));
            }

            this.a(dls.o);
         }
      }
   }

   @Override
   protected boolean dV() {
      return !this.co.b && super.dV();
   }

   public boolean Y() {
      return false;
   }

   public void a(dgm $$0, boolean $$1) {
   }

   public void a(crb $$0) {
   }

   public void a(dfn $$0) {
   }

   public void a(dgr $$0) {
   }

   public void a(dgd $$0) {
   }

   public void a(byq $$0, biq $$1) {
   }

   public OptionalInt a(@Nullable bja $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, cqz $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(clj $$0, biw $$1) {
   }

   public bix a(bkq $$0, biw $$1) {
      if (this.O_()) {
         if ($$0 instanceof bja) {
            this.a((bja)$$0);
         }

         return bix.d;
      } else {
         clj $$2 = this.b($$1);
         clj $$3 = $$2.p();
         bix $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.co.d && $$2 == this.b($$1) && $$2.L() < $$3.L()) {
               $$2.f($$3.L());
            }

            return $$4;
         } else {
            if (!$$2.b() && $$0 instanceof blg) {
               if (this.co.d) {
                  $$2 = $$3;
               }

               bix $$5 = $$2.a(this, (blg)$$0, $$1);
               if ($$5.a()) {
                  this.dN().a(dls.r, $$0.dl(), dls.a.a(this));
                  if ($$2.b() && !this.co.d) {
                     this.a($$1, clj.b);
                  }

                  return $$5;
               }
            }

            return bix.d;
         }
      }
   }

   @Override
   protected float l(bkq $$0) {
      return -0.6F;
   }

   @Override
   public void bC() {
      super.bC();
      this.J = 0;
   }

   @Override
   protected boolean eZ() {
      return super.eZ() || this.fE();
   }

   @Override
   public boolean eb() {
      return !this.co.b;
   }

   @Override
   protected eju a(eju $$0, blm $$1) {
      if (!this.co.b && $$0.d <= 0.0 && ($$1 == blm.a || $$1 == blm.b) && this.fL() && this.A()) {
         double $$2 = $$0.c;
         double $$3 = $$0.e;
         double $$4 = 0.05;

         while ($$2 != 0.0 && this.dN().a(this, this.cH().d($$2, (double)(-this.dH()), 0.0))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }
         }

         while ($$3 != 0.0 && this.dN().a(this, this.cH().d(0.0, (double)(-this.dH()), $$3))) {
            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         while ($$2 != 0.0 && $$3 != 0.0 && this.dN().a(this, this.cH().d($$2, (double)(-this.dH()), $$3))) {
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

         $$0 = new eju($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean A() {
      return this.aC() || this.ab < this.dH() && !this.dN().a(this, this.cH().d(0.0, (double)(this.ab - this.dH()), 0.0));
   }

   public void d(bkq $$0) {
      if ($$0.cq()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.b(bmm.c);
            float $$2;
            if ($$0 instanceof blg) {
               $$2 = cpw.a(this.eU(), ((blg)$$0).eT());
            } else {
               $$2 = cpw.a(this.eU(), bll.a);
            }

            float $$4 = this.B(0.5F);
            $$1 *= 0.2F + $$4 * $$4 * 0.8F;
            $$2 *= $$4;
            this.gn();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$5 = $$4 > 0.9F;
               boolean $$6 = false;
               int $$7 = 0;
               $$7 += cpw.c(this);
               if (this.bY() && $$5) {
                  this.dN().a(null, this.ds(), this.du(), this.dy(), aqr.sK, this.dc(), 1.0F, 1.0F);
                  $$7++;
                  $$6 = true;
               }

               boolean $$8 = $$5 && this.ab > 0.0F && !this.aC() && !this.d_() && !this.aZ() && !this.a(bkf.o) && !this.bO() && $$0 instanceof blg;
               $$8 = $$8 && !this.bY();
               if ($$8) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$9 = false;
               double $$10 = (double)(this.Y - this.X);
               if ($$5 && !$$8 && !$$6 && this.aC() && $$10 < (double)this.fg()) {
                  clj $$11 = this.b(biw.a);
                  if ($$11.d() instanceof cmu) {
                     $$9 = true;
                  }
               }

               float $$12 = 0.0F;
               boolean $$13 = false;
               int $$14 = cpw.d(this);
               if ($$0 instanceof blg) {
                  $$12 = ((blg)$$0).ew();
                  if ($$14 > 0 && !$$0.bN()) {
                     $$13 = true;
                     $$0.g(1);
                  }
               }

               eju $$15 = $$0.dq();
               boolean $$16 = $$0.a(this.dO().a(this), $$1);
               if ($$16) {
                  if ($$7 > 0) {
                     if ($$0 instanceof blg) {
                        ((blg)$$0)
                           .q(
                              (double)((float)$$7 * 0.5F),
                              (double)atm.a(this.dD() * (float) (Math.PI / 180.0)),
                              (double)(-atm.b(this.dD() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-atm.a(this.dD() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F),
                           0.1,
                           (double)(atm.b(this.dD() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F)
                        );
                     }

                     this.g(this.dq().d(0.6, 1.0, 0.6));
                     this.g(false);
                  }

                  if ($$9) {
                     float $$17 = 1.0F + cpw.a(this) * $$1;

                     for (blg $$19 : this.dN().a(blg.class, $$0.cH().c(1.0, 0.25, 1.0))) {
                        if ($$19 != this && $$19 != $$0 && !this.s($$19) && (!($$19 instanceof cad) || !((cad)$$19).A()) && this.f($$19) < 9.0) {
                           $$19.q(0.4F, (double)atm.a(this.dD() * (float) (Math.PI / 180.0)), (double)(-atm.b(this.dD() * (float) (Math.PI / 180.0))));
                           $$19.a(this.dO().a(this), $$17);
                        }
                     }

                     this.dN().a(null, this.ds(), this.du(), this.dy(), aqr.sN, this.dc(), 1.0F, 1.0F);
                     this.fQ();
                  }

                  if ($$0 instanceof amf && $$0.T) {
                     ((amf)$$0).c.b(new abg($$0));
                     $$0.T = false;
                     $$0.g($$15);
                  }

                  if ($$8) {
                     this.dN().a(null, this.ds(), this.du(), this.dy(), aqr.sJ, this.dc(), 1.0F, 1.0F);
                     this.a($$0);
                  }

                  if (!$$8 && !$$9) {
                     if ($$5) {
                        this.dN().a(null, this.ds(), this.du(), this.dy(), aqr.sM, this.dc(), 1.0F, 1.0F);
                     } else {
                        this.dN().a(null, this.ds(), this.du(), this.dy(), aqr.sO, this.dc(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.b($$0);
                  }

                  this.A($$0);
                  if ($$0 instanceof blg) {
                     cpw.a((blg)$$0, this);
                  }

                  cpw.b(this, $$0);
                  clj $$20 = this.eU();
                  bkq $$21 = $$0;
                  if ($$0 instanceof bzf) {
                     $$21 = ((bzf)$$0).b;
                  }

                  if (!this.dN().B && !$$20.b() && $$21 instanceof blg) {
                     $$20.a((blg)$$21, this);
                     if ($$20.b()) {
                        this.a(biw.a, clj.b);
                     }
                  }

                  if ($$0 instanceof blg) {
                     float $$22 = $$12 - ((blg)$$0).ew();
                     this.a(arb.G, Math.round($$22 * 10.0F));
                     if ($$14 > 0) {
                        $$0.g($$14 * 4);
                     }

                     if (this.dN() instanceof ame && $$22 > 2.0F) {
                        int $$23 = (int)((double)$$22 * 0.5);
                        ((ame)this.dN()).a(js.h, $$0.ds(), $$0.e(0.5), $$0.dy(), $$23, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.A(0.1F);
               } else {
                  this.dN().a(null, this.ds(), this.du(), this.dy(), aqr.sL, this.dc(), 1.0F, 1.0F);
                  if ($$13) {
                     $$0.aA();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(blg $$0) {
      this.d((bkq)$$0);
   }

   public void s(boolean $$0) {
      float $$1 = 0.25F + (float)cpw.g(this) * 0.05F;
      if ($$0) {
         $$1 += 0.75F;
      }

      if (this.ag.i() < $$1) {
         this.go().a(clm.vk, 100);
         this.fu();
         this.dN().a(this, (byte)30);
      }
   }

   @Override
   public void a(bkq $$0) {
   }

   public void b(bkq $$0) {
   }

   public void fQ() {
      double $$0 = (double)(-atm.a(this.dD() * (float) (Math.PI / 180.0)));
      double $$1 = (double)atm.b(this.dD() * (float) (Math.PI / 180.0));
      if (this.dN() instanceof ame) {
         ((ame)this.dN()).a(js.ae, this.ds() + $$0, this.e(0.5), this.dy() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fR() {
   }

   @Override
   public void a(bkq.c $$0) {
      super.a($$0);
      this.bR.b(this);
      if (this.bS != null && this.fV()) {
         this.s();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile fS() {
      return this.cq;
   }

   public cdt fT() {
      return this.cm;
   }

   public cdr fU() {
      return this.co;
   }

   public void a(clj $$0, clj $$1, cgu $$2) {
   }

   public boolean fV() {
      return this.bS != this.bR;
   }

   public Either<cdu.a, auo> a(ht $$0) {
      this.b($$0);
      this.cn = 0;
      return Either.right(auo.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fF();
      if (this.dN() instanceof ame && $$1) {
         ((ame)this.dN()).e();
      }

      this.cn = $$0 ? 0 : 100;
   }

   @Override
   public void fF() {
      this.a(true, true);
   }

   public static Optional<eju> a(ame $$0, ht $$1, float $$2, boolean $$3, boolean $$4) {
      dhi $$5 = $$0.a_($$1);
      cva $$6 = $$5.b();
      if ($$6 instanceof dbh && ($$3 || $$5.c(dbh.d) > 0) && dbh.a($$0)) {
         Optional<eju> $$7 = dbh.a(bku.bt, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dbh.d, Integer.valueOf($$5.c(dbh.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof cut && cut.a($$0)) {
         return cut.a(bku.bt, $$0, $$1, $$5.c(cut.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dhi $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new eju((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean fW() {
      return this.fE() && this.cn >= 100;
   }

   public int fX() {
      return this.cn;
   }

   public void a(ur $$0, boolean $$1) {
   }

   public void a(agi $$0) {
      this.b(arb.i.b($$0));
   }

   public void a(agi $$0, int $$1) {
      this.a(arb.i.b($$0), $$1);
   }

   public void b(aqy<?> $$0) {
      this.a($$0, 1);
   }

   public void a(aqy<?> $$0, int $$1) {
   }

   public void a(aqy<?> $$0) {
   }

   public int a(Collection<coq<?>> $$0) {
      return 0;
   }

   public void a(coq<?> $$0, List<clj> $$1) {
   }

   public void a(agi[] $$0) {
   }

   public int b(Collection<coq<?>> $$0) {
      return 0;
   }

   @Override
   public void fc() {
      super.fc();
      this.a(arb.E);
      if (this.bY()) {
         this.A(0.2F);
      } else {
         this.A(0.05F);
      }
   }

   @Override
   public void a(eju $$0) {
      if (this.bZ() && !this.bO()) {
         double $$1 = this.bF().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bj || !this.dN().a_(ht.a(this.ds(), this.du() + 1.0 - 0.1, this.dy())).u().c()) {
            eju $$3 = this.dq();
            this.g($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.co.b && !this.bO()) {
         double $$4 = this.dq().d;
         super.a($$0);
         eju $$5 = this.dq();
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

   protected boolean h(ht $$0) {
      return !this.dN().a_($$0).o(this.dN(), $$0);
   }

   @Override
   public float fg() {
      return (float)this.b(bmm.m);
   }

   @Override
   public boolean a(float $$0, float $$1, bjo $$2) {
      if (this.co.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(arb.t, (int)Math.round((double)$$0 * 100.0));
         }

         return super.a($$0, $$1, $$2);
      }
   }

   public boolean fY() {
      if (!this.aC() && !this.fx() && !this.aZ() && !this.a(bkf.y)) {
         clj $$0 = this.c(bkv.e);
         if ($$0.a(clm.nS) && ckd.d($$0)) {
            this.fZ();
            return true;
         }
      }

      return false;
   }

   public void fZ() {
      this.b(7, true);
   }

   public void ga() {
      this.b(7, true);
      this.b(7, false);
   }

   @Override
   protected void bi() {
      if (!this.O_()) {
         super.bi();
      }
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      if (this.aZ()) {
         this.aR();
         this.b($$1);
      } else {
         ht $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dhi $$3 = this.dN().a_($$2);
            if ($$3.a(arg.bn)) {
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
   public blg.a eH() {
      return new blg.a(aqr.sZ, aqr.sP);
   }

   @Override
   public boolean a(ame $$0, blg $$1) {
      this.b(arb.g.b($$1.ai()));
      return true;
   }

   @Override
   public void a(dhi $$0, eju $$1) {
      if (!this.co.b) {
         super.a($$0, $$1);
      }
   }

   public void d(int $$0) {
      this.s($$0);
      this.ch = this.ch + (float)$$0 / (float)this.gc();
      this.cg = atm.a(this.cg + $$0, 0, Integer.MAX_VALUE);

      while (this.ch < 0.0F) {
         float $$1 = this.ch * (float)this.gc();
         if (this.cf > 0) {
            this.c(-1);
            this.ch = 1.0F + $$1 / (float)this.gc();
         } else {
            this.c(-1);
            this.ch = 0.0F;
         }
      }

      while (this.ch >= 1.0F) {
         this.ch = (this.ch - 1.0F) * (float)this.gc();
         this.c(1);
         this.ch = this.ch / (float)this.gc();
      }
   }

   public int gb() {
      return this.ci;
   }

   @Override
   public void a(clj $$0, int $$1) {
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
         this.dN().a(null, this.ds(), this.du(), this.dy(), aqr.sY, this.dc(), $$1 * 0.75F, 1.0F);
         this.cp = this.ah;
      }
   }

   public int gc() {
      if (this.cf >= 30) {
         return 112 + (this.cf - 30) * 9;
      } else {
         return this.cf >= 15 ? 37 + (this.cf - 15) * 5 : 7 + this.cf * 2;
      }
   }

   public void A(float $$0) {
      if (!this.co.a) {
         if (!this.dN().B) {
            this.bT.a($$0);
         }
      }
   }

   public Optional<cda> aa() {
      return Optional.empty();
   }

   public cgi gd() {
      return this.bT;
   }

   public boolean t(boolean $$0) {
      return this.co.a || $$0 || this.bT.c();
   }

   public boolean ge() {
      return this.ew() > 0.0F && this.ew() < this.eN();
   }

   public boolean gf() {
      return this.co.e;
   }

   public boolean a(ht $$0, hx $$1, clj $$2) {
      if (this.co.e) {
         return true;
      } else {
         ht $$3 = $$0.a($$1.g());
         dhm $$4 = new dhm(this.dN(), $$3, false);
         return $$2.a(this.dN().H_().d(jz.e), $$4);
      }
   }

   @Override
   public int ef() {
      if (!this.dN().Y().b(crw.d) && !this.O_()) {
         int $$0 = this.cf * 7;
         return $$0 > 100 ? 100 : $$0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean eg() {
      return true;
   }

   @Override
   public boolean cC() {
      return true;
   }

   @Override
   protected bkq.b aW() {
      return this.co.b || this.aC() && this.bV() ? bkq.b.a : bkq.b.d;
   }

   @Override
   public void y() {
   }

   @Override
   public ur ad() {
      return ur.b(this.cq.getName());
   }

   public chy gg() {
      return this.bQ;
   }

   @Override
   public clj c(bkv $$0) {
      if ($$0 == bkv.a) {
         return this.cm.f();
      } else if ($$0 == bkv.b) {
         return this.cm.k.get(0);
      } else {
         return $$0.a() == bkv.a.b ? this.cm.j.get($$0.b()) : clj.b;
      }
   }

   @Override
   protected boolean a(bkv $$0) {
      return $$0.a() == bkv.a.b;
   }

   @Override
   public void a(bkv $$0, clj $$1) {
      this.e($$1);
      if ($$0 == bkv.a) {
         this.a($$0, this.cm.i.set(this.cm.l, $$1), $$1);
      } else if ($$0 == bkv.b) {
         this.a($$0, this.cm.k.set(0, $$1), $$1);
      } else if ($$0.a() == bkv.a.b) {
         this.a($$0, this.cm.j.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(clj $$0) {
      return this.cm.e($$0);
   }

   @Override
   public Iterable<clj> bK() {
      return Lists.newArrayList(new clj[]{this.eU(), this.eV()});
   }

   @Override
   public Iterable<clj> bL() {
      return this.cm.j;
   }

   public boolean h(rz $$0) {
      if (this.bO() || !this.aC() || this.aZ() || this.aA) {
         return false;
      } else if (this.gk().g()) {
         this.i($$0);
         this.f = this.dN().W();
         return true;
      } else if (this.gl().g()) {
         this.j($$0);
         this.f = this.dN().W();
         return true;
      } else {
         return false;
      }
   }

   protected void gh() {
      if (this.f + 20L < this.dN().W()) {
         this.k(this.gk());
         this.i(new rz());
         this.k(this.gl());
         this.j(new rz());
      }
   }

   private void k(rz $$0) {
      if (!this.dN().B && !$$0.g()) {
         bku.a($$0, this.dN()).ifPresent($$0x -> {
            if ($$0x instanceof bmb) {
               ((bmb)$$0x).b(this.ay);
            }

            $$0x.a_(this.ds(), this.du() + 0.7F, this.dy());
            ((ame)this.dN()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean O_();

   @Override
   public boolean bs() {
      return !this.O_() && super.bs();
   }

   @Override
   public boolean bZ() {
      return !this.co.b && !this.O_() && super.bZ();
   }

   public abstract boolean f();

   @Override
   public boolean cz() {
      return !this.co.b;
   }

   public ekt gi() {
      return this.dN().J();
   }

   @Override
   public ur P_() {
      vf $$0 = ekr.a(this.cg(), this.ad());
      return this.a($$0);
   }

   private vf a(vf $$0) {
      String $$1 = this.fS().getName();
      return $$0.a($$1x -> $$1x.a(new up(up.a.d, "/tell " + $$1 + " ")).a(this.cG()).a($$1));
   }

   @Override
   public String cy() {
      return this.fS().getName();
   }

   @Override
   public float b(bls $$0, bkr $$1) {
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
   public float fl() {
      return this.an().b(d);
   }

   public boolean a(cdv $$0) {
      return (this.an().b(bM) & $$0.a()) == $$0.a();
   }

   @Override
   public bly a_(int $$0) {
      if ($$0 >= 0 && $$0 < this.cm.i.size()) {
         return bly.a(this.cm, $$0);
      } else {
         int $$1 = $$0 - 200;
         return $$1 >= 0 && $$1 < this.bQ.b() ? bly.a(this.bQ, $$1) : super.a_($$0);
      }
   }

   public boolean gj() {
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
   public bla fn() {
      return this.an.b(bN) == 0 ? bla.a : bla.b;
   }

   public void a(bla $$0) {
      this.an.b(bN, (byte)($$0 == bla.a ? 0 : 1));
   }

   public rz gk() {
      return this.an.b(bO);
   }

   protected void i(rz $$0) {
      this.an.b(bO, $$0);
   }

   public rz gl() {
      return this.an.b(bP);
   }

   protected void j(rz $$0) {
      this.an.b(bP, $$0);
   }

   public float gm() {
      return (float)(1.0 / this.b(bmm.e) * 20.0);
   }

   public float B(float $$0) {
      return atm.a(((float)this.aP + $$0) / this.gm(), 0.0F, 1.0F);
   }

   public void gn() {
      this.aP = 0;
   }

   public clf go() {
      return this.ct;
   }

   @Override
   protected float aL() {
      return !this.co.b && !this.fx() ? super.aL() : 1.0F;
   }

   public float gp() {
      return (float)this.b(bmm.j);
   }

   public boolean gq() {
      return this.co.d && this.F() >= 2;
   }

   @Override
   public boolean f(clj $$0) {
      bkv $$1 = bli.h($$0);
      return this.c($$1).b();
   }

   @Override
   public bkr a(bls $$0) {
      return c.getOrDefault($$0, bL);
   }

   @Override
   public ImmutableList<bls> fB() {
      return ImmutableList.of(bls.a, bls.f, bls.d);
   }

   @Override
   public clj g(clj $$0) {
      if (!($$0.d() instanceof clz)) {
         return clj.b;
      } else {
         Predicate<clj> $$1 = ((clz)$$0.d()).e();
         clj $$2 = clz.a(this, $$1);
         if (!$$2.b()) {
            return $$2;
         } else {
            $$1 = ((clz)$$0.d()).b();

            for (int $$3 = 0; $$3 < this.cm.b(); $$3++) {
               clj $$4 = this.cm.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.co.d ? new clj(clm.os) : clj.b;
         }
      }
   }

   @Override
   public clj a(csa $$0, clj $$1) {
      this.gd().a($$1.d(), $$1);
      this.b(arb.c.b($$1.d()));
      $$0.a(null, this.ds(), this.du(), this.dy(), aqr.sR, aqs.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof amf) {
         al.z.a((amf)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dhi $$0) {
      return this.co.b || super.c($$0);
   }

   @Override
   public eju q(float $$0) {
      double $$1 = 0.22 * (this.fn() == bla.b ? -1.0 : 1.0);
      float $$2 = atm.i($$0 * 0.5F, this.dF(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = atm.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      if (this.fx() || this.fk()) {
         eju $$4 = this.f($$0);
         eju $$5 = this.dq();
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

         return this.l($$0).e(new eju($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.ca()) {
         return this.l($$0).e(new eju($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cH().c() - 1.0;
         double $$13 = this.bX() ? -0.2 : 0.07;
         return this.l($$0).e(new eju($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dM() {
      return true;
   }

   public boolean gr() {
      return this.fo() && this.fq().a(clm.qU);
   }

   @Override
   public boolean dL() {
      return false;
   }

   public Optional<ia> gs() {
      return this.cu;
   }

   public void a(Optional<ia> $$0) {
      this.cu = $$0;
   }

   @Override
   public float eF() {
      return this.cl;
   }

   @Override
   public void m(float $$0) {
      super.m($$0);
      this.cl = $$0;
   }

   @Override
   public boolean dG() {
      return true;
   }

   @Override
   protected float ff() {
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
