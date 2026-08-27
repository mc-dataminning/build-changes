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

public abstract class cdz extends bll {
   private static final Logger b = LogUtils.getLogger();
   public static final int bA = 16;
   public static final blf bB = blf.b;
   public static final int bC = 0;
   public static final int bD = 20;
   public static final int bE = 100;
   public static final int bF = 10;
   public static final int bG = 200;
   public static final float bH = 1.5F;
   public static final float bI = 0.6F;
   public static final float bJ = 0.6F;
   public static final float bK = 1.62F;
   public static final bkw bL = bkw.b(0.6F, 1.8F);
   private static final Map<blx, bkw> c = ImmutableMap.builder()
      .put(blx.a, bL)
      .put(blx.c, v)
      .put(blx.b, bkw.b(0.6F, 0.6F))
      .put(blx.d, bkw.b(0.6F, 0.6F))
      .put(blx.e, bkw.b(0.6F, 0.6F))
      .put(blx.f, bkw.b(0.6F, 1.5F))
      .put(blx.h, bkw.c(0.2F, 0.2F))
      .build();
   private static final afs<Float> d = afv.a(cdz.class, afu.d);
   private static final afs<Integer> e = afv.a(cdz.class, afu.b);
   protected static final afs<Byte> bM = afv.a(cdz.class, afu.a);
   protected static final afs<Byte> bN = afv.a(cdz.class, afu.a);
   protected static final afs<sd> bO = afv.a(cdz.class, afu.s);
   protected static final afs<sd> bP = afv.a(cdz.class, afu.s);
   private long f;
   private final cdy cm = new cdy(this);
   protected cid bQ = new cid();
   public final chs bR;
   public cgr bS;
   protected cgn bT = new cgn();
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
   private final cdw co = new cdw();
   public int cf;
   public int cg;
   public float ch;
   protected int ci;
   protected final float cj = 0.02F;
   private int cp;
   private final GameProfile cq;
   private boolean cr;
   private clo cs = clo.b;
   private final clk ct = this.k();
   private Optional<ie> cu = Optional.empty();
   @Nullable
   public cen ck;
   protected float cl;

   public cdz(csf $$0, hx $$1, float $$2, GameProfile $$3) {
      super(bkz.bt, $$0);
      this.a_($$3.getId());
      this.cq = $$3;
      this.bR = new chs(this.cm, !$$0.B, this);
      this.bS = this.bR;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bg = 180.0F;
   }

   public boolean a(csf $$0, hx $$1, csc $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == csc.d) {
         return true;
      } else if (this.gf()) {
         return false;
      } else {
         clo $$3 = this.eU();
         return $$3.b() || !$$3.b($$0.I_().d(kd.e), new dhr($$0, $$1, false));
      }
   }

   public static bmq.a fI() {
      return bll.dR().a(bmr.c, 1.0).a(bmr.m, 0.1F).a(bmr.e).a(bmr.j);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, 0.0F);
      this.an.a(e, 0);
      this.an.a(bM, (byte)0);
      this.an.a(bN, (byte)bB.a());
      this.an.a(bO, new sd());
      this.an.a(bP, new sd());
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
         this.a(arf.k);
         this.a(arf.l);
         if (this.bx()) {
            this.a(arf.m);
         }

         if (this.bV()) {
            this.a(arf.o);
         }

         if (!this.fE()) {
            this.a(arf.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = atq.a(this.ds(), -2.9999999E7, 2.9999999E7);
      double $$2 = atq.a(this.dy(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.ds() || $$2 != this.dy()) {
         this.a_($$1, this.du(), $$2);
      }

      this.aP++;
      clo $$3 = this.eU();
      if (!clo.a(this.cs, $$3)) {
         if (!clo.b(this.cs, $$3)) {
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
      this.ce = this.a(arp.a);
      return this.ce;
   }

   private void u() {
      clo $$0 = this.c(bla.f);
      if ($$0.a(clr.on) && !this.a(arp.a)) {
         this.b(new bki(bkk.m, 200, 0, false, false, true));
      }
   }

   protected clk k() {
      return new clk();
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
      if (this.g(blx.d)) {
         blx $$0;
         if (this.fx()) {
            $$0 = blx.b;
         } else if (this.fE()) {
            $$0 = blx.c;
         } else if (this.bZ()) {
            $$0 = blx.d;
         } else if (this.fk()) {
            $$0 = blx.e;
         } else if (this.bS() && !this.co.b) {
            $$0 = blx.f;
         } else {
            $$0 = blx.a;
         }

         blx $$6;
         if (this.P_() || this.bO() || this.g($$0)) {
            $$6 = $$0;
         } else if (this.g(blx.f)) {
            $$6 = blx.f;
         } else {
            $$6 = blx.d;
         }

         this.b($$6);
      }
   }

   protected boolean g(blx $$0) {
      return this.dN().a(this, this.a($$0).a(this.dl()).h(1.0E-7));
   }

   @Override
   public int ax() {
      return Math.max(1, this.dN().Y().c(this.co.a ? csb.F : csb.E));
   }

   @Override
   protected aqu aN() {
      return aqv.tc;
   }

   @Override
   protected aqu aO() {
      return aqv.ta;
   }

   @Override
   protected aqu aP() {
      return aqv.tb;
   }

   @Override
   public int bJ() {
      return 10;
   }

   @Override
   public void a(aqu $$0, float $$1, float $$2) {
      this.dN().a(this, this.ds(), this.du(), this.dy(), $$0, this.dc(), $$1, $$2);
   }

   public void a(aqu $$0, aqw $$1, float $$2, float $$3) {
   }

   @Override
   public aqw dc() {
      return aqw.h;
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
         this.a(jw.f);
      } else {
         super.b($$0);
      }
   }

   private void a(ju $$0) {
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
   public void d_() {
      if (this.bU > 0) {
         this.bU--;
      }

      if (this.dN().aj() == biy.a && this.dN().Y().b(csb.k)) {
         if (this.ew() < this.eN() && this.ah % 20 == 0) {
            this.b(1.0F);
         }

         if (this.bT.c() && this.ah % 10 == 0) {
            this.bT.a(this.bT.a() + 1);
         }
      }

      this.cm.j();
      this.bV = this.bW;
      super.d_();
      this.w((float)this.b(bmr.m));
      float $$1;
      if (this.aC() && !this.ex() && !this.bZ()) {
         $$1 = Math.min(0.1F, (float)this.dq().h());
      } else {
         $$1 = 0.0F;
      }

      this.bW = this.bW + ($$1 - this.bW) * 0.4F;
      if (this.ew() > 0.0F && !this.P_()) {
         eju $$2;
         if (this.bO() && !this.da().dI()) {
            $$2 = this.cH().b(this.da().cH()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cH().c(1.0, 0.5, 1.0);
         }

         List<bkv> $$4 = this.dN().a_(this, $$2);
         List<bkv> $$5 = Lists.newArrayList();

         for (bkv $$6 : $$4) {
            if ($$6.ai() == bkz.J) {
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

   private void c(@Nullable sd $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dN().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bkz.a($$1).filter($$0x -> $$0x == bkz.at).ifPresent($$0x -> {
            if (!bxm.a(this.dN(), this)) {
               this.dN().a(null, this.ds(), this.du(), this.dy(), bxm.a(this.dN(), this.dN().z), this.dc(), 1.0F, bxm.a(this.dN().z));
            }
         });
      }
   }

   private void c(bkv $$0) {
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
   public void a(bjt $$0) {
      super.a($$0);
      this.ar();
      if (!this.P_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-atq.b((this.eF() + this.dD()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-atq.a((this.eF() + this.dD()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(arf.N);
      this.a(arf.i.b(arf.m));
      this.a(arf.i.b(arf.n));
      this.aA();
      this.a_(false);
      this.a(Optional.of(ie.a(this.dN().ad(), this.dn())));
   }

   @Override
   protected void ez() {
      super.ez();
      if (!this.dN().Y().b(csb.d)) {
         this.fP();
         this.cm.k();
      }
   }

   protected void fP() {
      for (int $$0 = 0; $$0 < this.cm.b(); $$0++) {
         clo $$1 = this.cm.a($$0);
         if (!$$1.b() && cqb.e($$1)) {
            this.cm.b($$0);
         }
      }
   }

   @Override
   protected aqu d(bjt $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected aqu n_() {
      return aqv.sS;
   }

   @Nullable
   public cas a(clo $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cas a(clo $$0, boolean $$1, boolean $$2) {
      if ($$0.b()) {
         return null;
      } else {
         if (this.dN().B) {
            this.a(bja.a);
         }

         double $$3 = this.dw() - 0.3F;
         cas $$4 = new cas(this.dN(), this.ds(), $$3, this.dy(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.a(this);
         }

         if ($$1) {
            float $$5 = this.ag.i() * 0.5F;
            float $$6 = this.ag.i() * (float) (Math.PI * 2);
            $$4.o((double)(-atq.a($$6) * $$5), 0.2F, (double)(atq.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = atq.a(this.dF() * (float) (Math.PI / 180.0));
            float $$9 = atq.b(this.dF() * (float) (Math.PI / 180.0));
            float $$10 = atq.a(this.dD() * (float) (Math.PI / 180.0));
            float $$11 = atq.b(this.dD() * (float) (Math.PI / 180.0));
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

   public float d(dhn $$0) {
      float $$1 = this.cm.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = cqb.g(this);
         clo $$3 = this.eU();
         if ($$2 > 0 && !$$3.b()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bkj.a(this)) {
         $$1 *= 1.0F + (float)(bkj.b(this) + 1) * 0.2F;
      }

      if (this.a(bkk.d)) {
         $$1 *= switch (this.b(bkk.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      if (this.a(arp.a) && !cqb.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aC()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dhn $$0) {
      return !$$0.y() || this.cm.f().b($$0);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.a_(this.cq.getId());
      sj $$1 = $$0.c("Inventory", 10);
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
      this.a(bmr.m).a((double)this.co.b());
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
         this.a(ie.a.parse(sr.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      ss.g($$0);
      $$0.a("Inventory", this.cm.a(new sj()));
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

      this.gs().flatMap($$0x -> ie.a.encodeStart(sr.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
   }

   @Override
   public boolean b(bjt $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(arm.n)) {
         return !this.dN().Y().b(csb.G);
      } else if ($$0.a(arm.m)) {
         return !this.dN().Y().b(csb.H);
      } else if ($$0.a(arm.i)) {
         return !this.dN().Y().b(csb.I);
      } else {
         return $$0.a(arm.o) ? !this.dN().Y().b(csb.J) : false;
      }
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.co.a && !$$0.a(arm.d)) {
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
               if (this.dN().aj() == biy.a) {
                  $$1 = 0.0F;
               }

               if (this.dN().aj() == biy.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dN().aj() == biy.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bll $$0) {
      super.d($$0);
      if ($$0.fH()) {
         this.s(true);
      }
   }

   @Override
   public boolean ep() {
      return !this.fU().a && super.ep();
   }

   public boolean a(cdz $$0) {
      ela $$1 = this.cg();
      ela $$2 = $$0.cg();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bjt $$0, float $$1) {
      this.cm.a($$0, $$1, cdy.g);
   }

   @Override
   protected void c(bjt $$0, float $$1) {
      this.cm.a($$0, $$1, cdy.h);
   }

   @Override
   protected void u(float $$0) {
      if (this.bv.a(clr.vk)) {
         if (!this.dN().B) {
            this.b(arf.c.b(this.bv.d()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + atq.d($$0);
            bja $$2 = this.fp();
            this.bv.a($$1, this, $$1x -> $$1x.d($$2));
            if (this.bv.b()) {
               if ($$2 == bja.a) {
                  this.a(bla.a, clo.b);
               } else {
                  this.a(bla.b, clo.b);
               }

               this.bv = clo.b;
               this.a(aqv.vm, 0.8F, 0.8F + this.dN().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bjt $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fl(), 0.0F);
         this.y(this.fl() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(arf.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.A($$0.a());
            this.eL().a($$0, var7);
            this.c(this.ew() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(arf.J, Math.round(var7 * 10.0F));
            }

            this.a(dlx.o);
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

   public void a(dgr $$0, boolean $$1) {
   }

   public void a(crg $$0) {
   }

   public void a(dfs $$0) {
   }

   public void a(dgw $$0) {
   }

   public void a(dgi $$0) {
   }

   public void a(byv $$0, biu $$1) {
   }

   public OptionalInt a(@Nullable bje $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, cre $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(clo $$0, bja $$1) {
   }

   public bjb a(bkv $$0, bja $$1) {
      if (this.P_()) {
         if ($$0 instanceof bje) {
            this.a((bje)$$0);
         }

         return bjb.d;
      } else {
         clo $$2 = this.b($$1);
         clo $$3 = $$2.p();
         bjb $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.co.d && $$2 == this.b($$1) && $$2.L() < $$3.L()) {
               $$2.f($$3.L());
            }

            return $$4;
         } else {
            if (!$$2.b() && $$0 instanceof bll) {
               if (this.co.d) {
                  $$2 = $$3;
               }

               bjb $$5 = $$2.a(this, (bll)$$0, $$1);
               if ($$5.a()) {
                  this.dN().a(dlx.r, $$0.dl(), dlx.a.a(this));
                  if ($$2.b() && !this.co.d) {
                     this.a($$1, clo.b);
                  }

                  return $$5;
               }
            }

            return bjb.d;
         }
      }
   }

   @Override
   protected float l(bkv $$0) {
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
   protected ejz a(ejz $$0, blr $$1) {
      if (!this.co.b && $$0.d <= 0.0 && ($$1 == blr.a || $$1 == blr.b) && this.fL() && this.A()) {
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

         $$0 = new ejz($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean A() {
      return this.aC() || this.ab < this.dH() && !this.dN().a(this, this.cH().d(0.0, (double)(this.ab - this.dH()), 0.0));
   }

   public void d(bkv $$0) {
      if ($$0.cq()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.b(bmr.c);
            float $$2;
            if ($$0 instanceof bll) {
               $$2 = cqb.a(this.eU(), ((bll)$$0).eT());
            } else {
               $$2 = cqb.a(this.eU(), blq.a);
            }

            float $$4 = this.B(0.5F);
            $$1 *= 0.2F + $$4 * $$4 * 0.8F;
            $$2 *= $$4;
            this.gn();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$5 = $$4 > 0.9F;
               boolean $$6 = false;
               int $$7 = 0;
               $$7 += cqb.c(this);
               if (this.bY() && $$5) {
                  this.dN().a(null, this.ds(), this.du(), this.dy(), aqv.sK, this.dc(), 1.0F, 1.0F);
                  $$7++;
                  $$6 = true;
               }

               boolean $$8 = $$5 && this.ab > 0.0F && !this.aC() && !this.e_() && !this.aZ() && !this.a(bkk.o) && !this.bO() && $$0 instanceof bll;
               $$8 = $$8 && !this.bY();
               if ($$8) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$9 = false;
               double $$10 = (double)(this.Y - this.X);
               if ($$5 && !$$8 && !$$6 && this.aC() && $$10 < (double)this.fg()) {
                  clo $$11 = this.b(bja.a);
                  if ($$11.d() instanceof cmz) {
                     $$9 = true;
                  }
               }

               float $$12 = 0.0F;
               boolean $$13 = false;
               int $$14 = cqb.d(this);
               if ($$0 instanceof bll) {
                  $$12 = ((bll)$$0).ew();
                  if ($$14 > 0 && !$$0.bN()) {
                     $$13 = true;
                     $$0.g(1);
                  }
               }

               ejz $$15 = $$0.dq();
               boolean $$16 = $$0.a(this.dO().a(this), $$1);
               if ($$16) {
                  if ($$7 > 0) {
                     if ($$0 instanceof bll) {
                        ((bll)$$0)
                           .q(
                              (double)((float)$$7 * 0.5F),
                              (double)atq.a(this.dD() * (float) (Math.PI / 180.0)),
                              (double)(-atq.b(this.dD() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-atq.a(this.dD() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F),
                           0.1,
                           (double)(atq.b(this.dD() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F)
                        );
                     }

                     this.g(this.dq().d(0.6, 1.0, 0.6));
                     this.g(false);
                  }

                  if ($$9) {
                     float $$17 = 1.0F + cqb.a(this) * $$1;

                     for (bll $$19 : this.dN().a(bll.class, $$0.cH().c(1.0, 0.25, 1.0))) {
                        if ($$19 != this && $$19 != $$0 && !this.s($$19) && (!($$19 instanceof cai) || !((cai)$$19).A()) && this.f($$19) < 9.0) {
                           $$19.q(0.4F, (double)atq.a(this.dD() * (float) (Math.PI / 180.0)), (double)(-atq.b(this.dD() * (float) (Math.PI / 180.0))));
                           $$19.a(this.dO().a(this), $$17);
                        }
                     }

                     this.dN().a(null, this.ds(), this.du(), this.dy(), aqv.sN, this.dc(), 1.0F, 1.0F);
                     this.fQ();
                  }

                  if ($$0 instanceof amj && $$0.T) {
                     ((amj)$$0).c.b(new abk($$0));
                     $$0.T = false;
                     $$0.g($$15);
                  }

                  if ($$8) {
                     this.dN().a(null, this.ds(), this.du(), this.dy(), aqv.sJ, this.dc(), 1.0F, 1.0F);
                     this.a($$0);
                  }

                  if (!$$8 && !$$9) {
                     if ($$5) {
                        this.dN().a(null, this.ds(), this.du(), this.dy(), aqv.sM, this.dc(), 1.0F, 1.0F);
                     } else {
                        this.dN().a(null, this.ds(), this.du(), this.dy(), aqv.sO, this.dc(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.b($$0);
                  }

                  this.A($$0);
                  if ($$0 instanceof bll) {
                     cqb.a((bll)$$0, this);
                  }

                  cqb.b(this, $$0);
                  clo $$20 = this.eU();
                  bkv $$21 = $$0;
                  if ($$0 instanceof bzk) {
                     $$21 = ((bzk)$$0).b;
                  }

                  if (!this.dN().B && !$$20.b() && $$21 instanceof bll) {
                     $$20.a((bll)$$21, this);
                     if ($$20.b()) {
                        this.a(bja.a, clo.b);
                     }
                  }

                  if ($$0 instanceof bll) {
                     float $$22 = $$12 - ((bll)$$0).ew();
                     this.a(arf.G, Math.round($$22 * 10.0F));
                     if ($$14 > 0) {
                        $$0.g($$14 * 4);
                     }

                     if (this.dN() instanceof ami && $$22 > 2.0F) {
                        int $$23 = (int)((double)$$22 * 0.5);
                        ((ami)this.dN()).a(jw.h, $$0.ds(), $$0.e(0.5), $$0.dy(), $$23, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.A(0.1F);
               } else {
                  this.dN().a(null, this.ds(), this.du(), this.dy(), aqv.sL, this.dc(), 1.0F, 1.0F);
                  if ($$13) {
                     $$0.aA();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(bll $$0) {
      this.d((bkv)$$0);
   }

   public void s(boolean $$0) {
      float $$1 = 0.25F + (float)cqb.g(this) * 0.05F;
      if ($$0) {
         $$1 += 0.75F;
      }

      if (this.ag.i() < $$1) {
         this.go().a(clr.vk, 100);
         this.fu();
         this.dN().a(this, (byte)30);
      }
   }

   @Override
   public void a(bkv $$0) {
   }

   public void b(bkv $$0) {
   }

   public void fQ() {
      double $$0 = (double)(-atq.a(this.dD() * (float) (Math.PI / 180.0)));
      double $$1 = (double)atq.b(this.dD() * (float) (Math.PI / 180.0));
      if (this.dN() instanceof ami) {
         ((ami)this.dN()).a(jw.ae, this.ds() + $$0, this.e(0.5), this.dy() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fR() {
   }

   @Override
   public void a(bkv.c $$0) {
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

   public cdy fT() {
      return this.cm;
   }

   public cdw fU() {
      return this.co;
   }

   public void a(clo $$0, clo $$1, cgz $$2) {
   }

   public boolean fV() {
      return this.bS != this.bR;
   }

   public Either<cdz.a, aus> a(hx $$0) {
      this.b($$0);
      this.cn = 0;
      return Either.right(aus.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fF();
      if (this.dN() instanceof ami && $$1) {
         ((ami)this.dN()).e();
      }

      this.cn = $$0 ? 0 : 100;
   }

   @Override
   public void fF() {
      this.a(true, true);
   }

   public static Optional<ejz> a(ami $$0, hx $$1, float $$2, boolean $$3, boolean $$4) {
      dhn $$5 = $$0.a_($$1);
      cvf $$6 = $$5.b();
      if ($$6 instanceof dbm && ($$3 || $$5.c(dbm.d) > 0) && dbm.a($$0)) {
         Optional<ejz> $$7 = dbm.a(bkz.bt, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dbm.d, Integer.valueOf($$5.c(dbm.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof cuy && cuy.a($$0)) {
         return cuy.a(bkz.bt, $$0, $$1, $$5.c(cuy.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dhn $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new ejz((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean fW() {
      return this.fE() && this.cn >= 100;
   }

   public int fX() {
      return this.cn;
   }

   public void a(uv $$0, boolean $$1) {
   }

   public void a(agm $$0) {
      this.b(arf.i.b($$0));
   }

   public void a(agm $$0, int $$1) {
      this.a(arf.i.b($$0), $$1);
   }

   public void b(arc<?> $$0) {
      this.a($$0, 1);
   }

   public void a(arc<?> $$0, int $$1) {
   }

   public void a(arc<?> $$0) {
   }

   public int a(Collection<cov<?>> $$0) {
      return 0;
   }

   public void a(cov<?> $$0, List<clo> $$1) {
   }

   public void a(agm[] $$0) {
   }

   public int b(Collection<cov<?>> $$0) {
      return 0;
   }

   @Override
   public void fc() {
      super.fc();
      this.a(arf.E);
      if (this.bY()) {
         this.A(0.2F);
      } else {
         this.A(0.05F);
      }
   }

   @Override
   public void a(ejz $$0) {
      if (this.bZ() && !this.bO()) {
         double $$1 = this.bF().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bj || !this.dN().a_(hx.a(this.ds(), this.du() + 1.0 - 0.1, this.dy())).u().c()) {
            ejz $$3 = this.dq();
            this.g($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.co.b && !this.bO()) {
         double $$4 = this.dq().d;
         super.a($$0);
         ejz $$5 = this.dq();
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
      return !this.dN().a_($$0).o(this.dN(), $$0);
   }

   @Override
   public float fg() {
      return (float)this.b(bmr.m);
   }

   @Override
   public boolean a(float $$0, float $$1, bjt $$2) {
      if (this.co.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(arf.t, (int)Math.round((double)$$0 * 100.0));
         }

         return super.a($$0, $$1, $$2);
      }
   }

   public boolean fY() {
      if (!this.aC() && !this.fx() && !this.aZ() && !this.a(bkk.y)) {
         clo $$0 = this.c(bla.e);
         if ($$0.a(clr.nS) && cki.d($$0)) {
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
      if (!this.P_()) {
         super.bi();
      }
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      if (this.aZ()) {
         this.aR();
         this.b($$1);
      } else {
         hx $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dhn $$3 = this.dN().a_($$2);
            if ($$3.a(ark.bn)) {
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
   public bll.a eH() {
      return new bll.a(aqv.sZ, aqv.sP);
   }

   @Override
   public boolean a(ami $$0, bll $$1) {
      this.b(arf.g.b($$1.ai()));
      return true;
   }

   @Override
   public void a(dhn $$0, ejz $$1) {
      if (!this.co.b) {
         super.a($$0, $$1);
      }
   }

   public void d(int $$0) {
      this.s($$0);
      this.ch = this.ch + (float)$$0 / (float)this.gc();
      this.cg = atq.a(this.cg + $$0, 0, Integer.MAX_VALUE);

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
   public void a(clo $$0, int $$1) {
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
         this.dN().a(null, this.ds(), this.du(), this.dy(), aqv.sY, this.dc(), $$1 * 0.75F, 1.0F);
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

   public Optional<cdf> aa() {
      return Optional.empty();
   }

   public cgn gd() {
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

   public boolean a(hx $$0, ib $$1, clo $$2) {
      if (this.co.e) {
         return true;
      } else {
         hx $$3 = $$0.a($$1.g());
         dhr $$4 = new dhr(this.dN(), $$3, false);
         return $$2.a(this.dN().I_().d(kd.e), $$4);
      }
   }

   @Override
   public int ef() {
      if (!this.dN().Y().b(csb.d) && !this.P_()) {
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
   protected bkv.b aW() {
      return this.co.b || this.aC() && this.bV() ? bkv.b.a : bkv.b.d;
   }

   @Override
   public void y() {
   }

   @Override
   public uv ad() {
      return uv.b(this.cq.getName());
   }

   public cid gg() {
      return this.bQ;
   }

   @Override
   public clo c(bla $$0) {
      if ($$0 == bla.a) {
         return this.cm.f();
      } else if ($$0 == bla.b) {
         return this.cm.k.get(0);
      } else {
         return $$0.a() == bla.a.b ? this.cm.j.get($$0.b()) : clo.b;
      }
   }

   @Override
   protected boolean a(bla $$0) {
      return $$0.a() == bla.a.b;
   }

   @Override
   public void a(bla $$0, clo $$1) {
      this.e($$1);
      if ($$0 == bla.a) {
         this.a($$0, this.cm.i.set(this.cm.l, $$1), $$1);
      } else if ($$0 == bla.b) {
         this.a($$0, this.cm.k.set(0, $$1), $$1);
      } else if ($$0.a() == bla.a.b) {
         this.a($$0, this.cm.j.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(clo $$0) {
      return this.cm.e($$0);
   }

   @Override
   public Iterable<clo> bK() {
      return Lists.newArrayList(new clo[]{this.eU(), this.eV()});
   }

   @Override
   public Iterable<clo> bL() {
      return this.cm.j;
   }

   public boolean h(sd $$0) {
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
         this.i(new sd());
         this.k(this.gl());
         this.j(new sd());
      }
   }

   private void k(sd $$0) {
      if (!this.dN().B && !$$0.g()) {
         bkz.a($$0, this.dN()).ifPresent($$0x -> {
            if ($$0x instanceof bmg) {
               ((bmg)$$0x).b(this.ay);
            }

            $$0x.a_(this.ds(), this.du() + 0.7F, this.dy());
            ((ami)this.dN()).c($$0x);
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

   public eky gi() {
      return this.dN().J();
   }

   @Override
   public uv Q_() {
      vj $$0 = ekw.a(this.cg(), this.ad());
      return this.a($$0);
   }

   private vj a(vj $$0) {
      String $$1 = this.fS().getName();
      return $$0.a($$1x -> $$1x.a(new ut(ut.a.d, "/tell " + $$1 + " ")).a(this.cG()).a($$1));
   }

   @Override
   public String cy() {
      return this.fS().getName();
   }

   @Override
   public float b(blx $$0, bkw $$1) {
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

   public boolean a(cea $$0) {
      return (this.an().b(bM) & $$0.a()) == $$0.a();
   }

   @Override
   public bmd a_(int $$0) {
      if ($$0 >= 0 && $$0 < this.cm.i.size()) {
         return bmd.a(this.cm, $$0);
      } else {
         int $$1 = $$0 - 200;
         return $$1 >= 0 && $$1 < this.bQ.b() ? bmd.a(this.bQ, $$1) : super.a_($$0);
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
   public blf fn() {
      return this.an.b(bN) == 0 ? blf.a : blf.b;
   }

   public void a(blf $$0) {
      this.an.b(bN, (byte)($$0 == blf.a ? 0 : 1));
   }

   public sd gk() {
      return this.an.b(bO);
   }

   protected void i(sd $$0) {
      this.an.b(bO, $$0);
   }

   public sd gl() {
      return this.an.b(bP);
   }

   protected void j(sd $$0) {
      this.an.b(bP, $$0);
   }

   public float gm() {
      return (float)(1.0 / this.b(bmr.e) * 20.0);
   }

   public float B(float $$0) {
      return atq.a(((float)this.aP + $$0) / this.gm(), 0.0F, 1.0F);
   }

   public void gn() {
      this.aP = 0;
   }

   public clk go() {
      return this.ct;
   }

   @Override
   protected float aL() {
      return !this.co.b && !this.fx() ? super.aL() : 1.0F;
   }

   public float gp() {
      return (float)this.b(bmr.j);
   }

   public boolean gq() {
      return this.co.d && this.F() >= 2;
   }

   @Override
   public boolean f(clo $$0) {
      bla $$1 = bln.h($$0);
      return this.c($$1).b();
   }

   @Override
   public bkw a(blx $$0) {
      return c.getOrDefault($$0, bL);
   }

   @Override
   public ImmutableList<blx> fB() {
      return ImmutableList.of(blx.a, blx.f, blx.d);
   }

   @Override
   public clo g(clo $$0) {
      if (!($$0.d() instanceof cme)) {
         return clo.b;
      } else {
         Predicate<clo> $$1 = ((cme)$$0.d()).e();
         clo $$2 = cme.a(this, $$1);
         if (!$$2.b()) {
            return $$2;
         } else {
            $$1 = ((cme)$$0.d()).b();

            for (int $$3 = 0; $$3 < this.cm.b(); $$3++) {
               clo $$4 = this.cm.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.co.d ? new clo(clr.os) : clo.b;
         }
      }
   }

   @Override
   public clo a(csf $$0, clo $$1) {
      this.gd().a($$1.d(), $$1);
      this.b(arf.c.b($$1.d()));
      $$0.a(null, this.ds(), this.du(), this.dy(), aqv.sR, aqw.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof amj) {
         al.z.a((amj)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dhn $$0) {
      return this.co.b || super.c($$0);
   }

   @Override
   public ejz q(float $$0) {
      double $$1 = 0.22 * (this.fn() == blf.b ? -1.0 : 1.0);
      float $$2 = atq.i($$0 * 0.5F, this.dF(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = atq.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      if (this.fx() || this.fk()) {
         ejz $$4 = this.f($$0);
         ejz $$5 = this.dq();
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

         return this.l($$0).e(new ejz($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.ca()) {
         return this.l($$0).e(new ejz($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cH().c() - 1.0;
         double $$13 = this.bX() ? -0.2 : 0.07;
         return this.l($$0).e(new ejz($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dM() {
      return true;
   }

   public boolean gr() {
      return this.fo() && this.fq().a(clr.qU);
   }

   @Override
   public boolean dL() {
      return false;
   }

   public Optional<ie> gs() {
      return this.cu;
   }

   public void a(Optional<ie> $$0) {
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
      b(uv.c("block.minecraft.bed.no_sleep")),
      c(uv.c("block.minecraft.bed.too_far_away")),
      d(uv.c("block.minecraft.bed.obstructed")),
      e,
      f(uv.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final uv g;

      private a() {
         this.g = null;
      }

      private a(uv $$0) {
         this.g = $$0;
      }

      @Nullable
      public uv a() {
         return this.g;
      }
   }
}
