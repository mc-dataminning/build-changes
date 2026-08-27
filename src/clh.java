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

public abstract class clh extends bsa {
   private static final Logger b = LogUtils.getLogger();
   public static final bru bG = bru.b;
   public static final int bH = 0;
   public static final int bI = 20;
   public static final int bJ = 100;
   public static final int bK = 10;
   public static final int bL = 200;
   public static final int bM = 499;
   public static final int bN = 500;
   public static final float bO = 4.5F;
   public static final float bP = 3.0F;
   public static final float bQ = 1.5F;
   public static final float bR = 0.6F;
   public static final float bS = 0.6F;
   public static final float bT = 1.62F;
   public static final etp bU = new etp(0.0, 0.6, 0.0);
   public static final brk bV = brk.b(0.6F, 1.8F).b(1.62F).a(brj.a().a(bri.b, bU));
   private static final Map<bsl, brk> c = ImmutableMap.builder()
      .put(bsl.a, bV)
      .put(bsl.c, aH)
      .put(bsl.b, brk.b(0.6F, 0.6F).b(0.4F))
      .put(bsl.d, brk.b(0.6F, 0.6F).b(0.4F))
      .put(bsl.e, brk.b(0.6F, 0.6F).b(0.4F))
      .put(bsl.f, brk.b(0.6F, 1.5F).b(1.27F).a(brj.a().a(bri.b, bU)))
      .put(bsl.h, brk.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final ajm<Float> d = ajq.a(clh.class, ajo.d);
   private static final ajm<Integer> e = ajq.a(clh.class, ajo.b);
   protected static final ajm<Byte> bW = ajq.a(clh.class, ajo.a);
   protected static final ajm<Byte> bX = ajq.a(clh.class, ajo.a);
   protected static final ajm<ua> bY = ajq.a(clh.class, ajo.t);
   protected static final ajm<ua> bZ = ajq.a(clh.class, ajo.t);
   private long f;
   final clg g = new clg(this);
   protected cpq ca = new cpq();
   public final cpf cb;
   public cod cc;
   protected cnz cd = new cnz();
   protected int ce;
   public float cf;
   public float cg;
   public int ch;
   public double ci;
   public double cj;
   public double ck;
   public double cl;
   public double cm;
   public double cn;
   private int h;
   protected boolean co;
   private final cle cA = new cle();
   public int cp;
   public int cq;
   public float cr;
   protected int cs;
   protected final float ct = 0.02F;
   private int cB;
   private final GameProfile cC;
   private boolean cD;
   private csz cE = csz.i;
   private final csv cF = this.k();
   private Optional<iv> cG = Optional.empty();
   @Nullable
   public clv cu;
   protected float cv;
   @Nullable
   public etp cw;
   @Nullable
   public brh cx;
   public boolean cy;

   public clh(dad $$0, in $$1, float $$2, GameProfile $$3) {
      super(brn.bx, $$0);
      this.a_($$3.getId());
      this.cC = $$3;
      this.cb = new cpf(this.g, !$$0.B, this);
      this.cc = this.cb;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bl = 180.0F;
   }

   public boolean a(dad $$0, in $$1, daa $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == daa.d) {
         return true;
      } else if (this.gm()) {
         return false;
      } else {
         csz $$3 = this.eV();
         return $$3.d() || !$$3.b(new dql($$0, $$1, false));
      }
   }

   public static btg.a fO() {
      return bsa.dS().a(bth.c, 1.0).a(bth.r, 0.1F).a(bth.e).a(bth.o).a(bth.g, 4.5).a(bth.h, 3.0).a(bth.f);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(bW, (byte)0);
      $$0.a(bX, (byte)bG.a());
      $$0.a(bY, new ua());
      $$0.a(bZ, new ua());
   }

   @Override
   public void l() {
      this.ag = this.N_();
      if (this.N_()) {
         this.d(false);
      }

      if (this.ch > 0) {
         this.ch--;
      }

      if (this.fJ()) {
         this.h++;
         if (this.h > 100) {
            this.h = 100;
         }

         if (!this.dN().B && this.dN().Q()) {
            this.a(false, true);
         }
      } else if (this.h > 0) {
         this.h++;
         if (this.h >= 110) {
            this.h = 0;
         }
      }

      this.fS();
      super.l();
      if (!this.dN().B && this.cc != null && !this.cc.a(this)) {
         this.r();
         this.cc = this.cb;
      }

      this.v();
      if (!this.dN().B) {
         this.cd.a(this);
         this.a(avm.k);
         this.a(avm.l);
         if (this.bB()) {
            this.a(avm.m);
         }

         if (this.bW()) {
            this.a(avm.o);
         }

         if (!this.fJ()) {
            this.a(avm.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = axz.a(this.ds(), -2.9999999E7, 2.9999999E7);
      double $$2 = axz.a(this.dy(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.ds() || $$2 != this.dy()) {
         this.a_($$1, this.du(), $$2);
      }

      this.aU++;
      csz $$3 = this.eV();
      if (!csz.a(this.cE, $$3)) {
         if (!csz.b(this.cE, $$3)) {
            this.gu();
         }

         this.cE = $$3.r();
      }

      this.u();
      this.cF.a();
      this.fT();
   }

   @Override
   protected float fm() {
      return this.fA() ? 15.0F : super.fm();
   }

   public boolean fP() {
      return this.bT();
   }

   protected boolean fQ() {
      return this.bT();
   }

   protected boolean fR() {
      return this.bT();
   }

   protected boolean fS() {
      this.co = this.a(avw.a);
      return this.co;
   }

   private void u() {
      csz $$0 = this.d(bro.f);
      if ($$0.a(ctc.oo) && !this.a(avw.a)) {
         this.b(new bqt(bqv.m, 200, 0, false, false, true));
      }
   }

   protected csv k() {
      return new csv();
   }

   private void v() {
      this.ci = this.cl;
      this.cj = this.cm;
      this.ck = this.cn;
      double $$0 = this.ds() - this.cl;
      double $$1 = this.du() - this.cm;
      double $$2 = this.dy() - this.cn;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cl = this.ds();
         this.ci = this.cl;
      }

      if ($$2 > 10.0) {
         this.cn = this.dy();
         this.ck = this.cn;
      }

      if ($$1 > 10.0) {
         this.cm = this.du();
         this.cj = this.cm;
      }

      if ($$0 < -10.0) {
         this.cl = this.ds();
         this.ci = this.cl;
      }

      if ($$2 < -10.0) {
         this.cn = this.dy();
         this.ck = this.cn;
      }

      if ($$1 < -10.0) {
         this.cm = this.du();
         this.cj = this.cm;
      }

      this.cl += $$0 * 0.25;
      this.cn += $$2 * 0.25;
      this.cm += $$1 * 0.25;
   }

   protected void fT() {
      if (this.h(bsl.d)) {
         bsl $$0;
         if (this.fC()) {
            $$0 = bsl.b;
         } else if (this.fJ()) {
            $$0 = bsl.c;
         } else if (this.ca()) {
            $$0 = bsl.d;
         } else if (this.fp()) {
            $$0 = bsl.e;
         } else if (this.bT() && !this.cA.b) {
            $$0 = bsl.f;
         } else {
            $$0 = bsl.a;
         }

         bsl $$6;
         if (this.N_() || this.bP() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bsl.f)) {
            $$6 = bsl.f;
         } else {
            $$6 = bsl.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bsl $$0) {
      return this.dN().a(this, this.a($$0).a(this.dl()).h(1.0E-7));
   }

   @Override
   public int ax() {
      return Math.max(1, this.dN().aa().c(this.cA.a ? czz.F : czz.E));
   }

   @Override
   protected avb aN() {
      return avc.ug;
   }

   @Override
   protected avb aO() {
      return avc.ue;
   }

   @Override
   protected avb aP() {
      return avc.uf;
   }

   @Override
   public int bN() {
      return 10;
   }

   @Override
   public void a(avb $$0, float $$1, float $$2) {
      this.dN().a(this, this.ds(), this.du(), this.dy(), $$0, this.dc(), $$1, $$2);
   }

   public void a(avb $$0, avd $$1, float $$2, float $$3) {
   }

   @Override
   public avd dc() {
      return avd.h;
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
         this.cD = false;
      } else if ($$0 == 22) {
         this.cD = true;
      } else if ($$0 == 43) {
         this.a(kx.e);
      } else {
         super.b($$0);
      }
   }

   private void a(kv $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ah.k() * 0.02;
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         this.dN().a($$0, this.d(1.0), this.dv() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected void r() {
      this.cc = this.cb;
   }

   protected void s() {
   }

   @Override
   public void t() {
      if (!this.dN().B && this.fQ() && this.bP()) {
         this.ac();
         this.g(false);
      } else {
         super.t();
         this.cf = this.cg;
         this.cg = 0.0F;
      }
   }

   @Override
   protected void fo() {
      super.fo();
      this.eT();
      this.bb = this.dD();
   }

   @Override
   public void n_() {
      if (this.ce > 0) {
         this.ce--;
      }

      if (this.dN().ak() == bpj.a && this.dN().aa().b(czz.k)) {
         if (this.ey() < this.eP() && this.ai % 20 == 0) {
            this.c(1.0F);
         }

         if (this.cd.c() && this.ai % 10 == 0) {
            this.cd.a(this.cd.a() + 1);
         }
      }

      this.g.j();
      this.cf = this.cg;
      super.n_();
      this.y((float)this.g(bth.r));
      float $$1;
      if (this.aC() && !this.ez() && !this.ca()) {
         $$1 = Math.min(0.1F, (float)this.dq().h());
      } else {
         $$1 = 0.0F;
      }

      this.cg = this.cg + ($$1 - this.cg) * 0.4F;
      if (this.ey() > 0.0F && !this.N_()) {
         etk $$2;
         if (this.bP() && !this.da().dI()) {
            $$2 = this.cI().b(this.da().cI()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cI().c(1.0, 0.5, 1.0);
         }

         List<brh> $$4 = this.dN().a_(this, $$2);
         List<brh> $$5 = Lists.newArrayList();

         for (brh $$6 : $$4) {
            if ($$6.ai() == brn.M) {
               $$5.add($$6);
            } else if (!$$6.dI()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ac.a($$5, this.ah));
         }
      }

      this.c(this.gr());
      this.c(this.gs());
      if (!this.dN().B && (this.ac > 0.5F || this.bc()) || this.cA.b || this.fJ() || this.aB) {
         this.go();
      }
   }

   private void c(@Nullable ua $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dN().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         brn.a($$1).filter($$0x -> $$0x == brn.aw).ifPresent($$0x -> {
            if (!cef.a(this.dN(), this)) {
               this.dN().a(null, this.ds(), this.du(), this.dy(), cef.a(this.dN(), this.dN().z), this.dc(), 1.0F, cef.a(this.dN().z));
            }
         });
      }
   }

   private void d(brh $$0) {
      $$0.b_(this);
   }

   public int fU() {
      return this.ao.a(e);
   }

   public void s(int $$0) {
      this.ao.a(e, $$0);
   }

   public void t(int $$0) {
      int $$1 = this.fU();
      this.ao.a(e, $$1 + $$0);
   }

   public void u(int $$0) {
      this.bD = $$0;
      if (!this.dN().B) {
         this.go();
         this.c(4, true);
      }
   }

   @Override
   public void a(bqf $$0) {
      super.a($$0);
      this.ar();
      if (!this.N_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-axz.b((this.eH() + this.dD()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-axz.a((this.eH() + this.dD()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(avm.N);
      this.a(avm.i.b(avm.m));
      this.a(avm.i.b(avm.n));
      this.aA();
      this.c(false);
      this.a(Optional.of(iv.a(this.dN().ae(), this.dn())));
   }

   @Override
   protected void eB() {
      super.eB();
      if (!this.dN().aa().b(czz.d)) {
         this.fV();
         this.g.k();
      }
   }

   protected void fV() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         csz $$1 = this.g.a($$0);
         if (!$$1.d() && cyh.g($$1)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected avb d(bqf $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected avb o_() {
      return avc.tW;
   }

   @Nullable
   public chr a(csz $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public chr a(csz $$0, boolean $$1, boolean $$2) {
      if ($$0.d()) {
         return null;
      } else {
         if (this.dN().B) {
            this.a(bpl.a);
         }

         double $$3 = this.dw() - 0.3F;
         chr $$4 = new chr(this.dN(), this.ds(), $$3, this.dy(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ah.i() * 0.5F;
            float $$6 = this.ah.i() * (float) (Math.PI * 2);
            $$4.o((double)(-axz.a($$6) * $$5), 0.2F, (double)(axz.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = axz.a(this.dF() * (float) (Math.PI / 180.0));
            float $$9 = axz.b(this.dF() * (float) (Math.PI / 180.0));
            float $$10 = axz.a(this.dD() * (float) (Math.PI / 180.0));
            float $$11 = axz.b(this.dD() * (float) (Math.PI / 180.0));
            float $$12 = this.ah.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.ah.i();
            $$4.o(
               (double)(-$$10 * $$9 * 0.3F) + Math.cos((double)$$12) * (double)$$13,
               (double)(-$$8 * 0.3F + 0.1F + (this.ah.i() - this.ah.i()) * 0.1F),
               (double)($$11 * $$9 * 0.3F) + Math.sin((double)$$12) * (double)$$13
            );
         }

         return $$4;
      }
   }

   public float d(dqh $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = cyh.g(this);
         csz $$3 = this.eV();
         if ($$2 > 0 && !$$3.d()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bqu.a(this)) {
         $$1 *= 1.0F + (float)(bqu.b(this) + 1) * 0.2F;
      }

      if (this.b(bqv.d)) {
         $$1 *= switch (this.c(bqv.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.g(bth.f);
      if (this.a(avw.a) && !cyh.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aC()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dqh $$0) {
      return !$$0.y() || this.g.f().b($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a_(this.cC.getId());
      ug $$1 = $$0.c("Inventory", 10);
      this.g.b($$1);
      this.g.k = $$0.h("SelectedItemSlot");
      this.h = $$0.g("SleepTimer");
      this.cr = $$0.j("XpP");
      this.cp = $$0.h("XpLevel");
      this.cq = $$0.h("XpTotal");
      this.cs = $$0.h("XpSeed");
      if (this.cs == 0) {
         this.cs = this.ah.f();
      }

      this.s($$0.h("Score"));
      this.cd.a($$0);
      this.cA.b($$0);
      this.f(bth.r).a((double)this.cA.b());
      if ($$0.b("EnderItems", 9)) {
         this.ca.a($$0.c("EnderItems", 10), this.dP());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(iv.b.parse(uo.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         etp.a.parse(uo.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.cw = $$0x);
      }

      this.cy = $$0.q("ignore_fall_damage_from_current_explosion");
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      up.e($$0);
      $$0.a("Inventory", this.g.a(new ug()));
      $$0.a("SelectedItemSlot", this.g.k);
      $$0.a("SleepTimer", (short)this.h);
      $$0.a("XpP", this.cr);
      $$0.a("XpLevel", this.cp);
      $$0.a("XpTotal", this.cq);
      $$0.a("XpSeed", this.cs);
      $$0.a("Score", this.fU());
      this.cd.b($$0);
      this.cA.a($$0);
      $$0.a("EnderItems", this.ca.a(this.dP()));
      if (!this.gr().g()) {
         $$0.a("ShoulderEntityLeft", this.gr());
      }

      if (!this.gs().g()) {
         $$0.a("ShoulderEntityRight", this.gs());
      }

      this.gz().flatMap($$0x -> iv.b.encodeStart(uo.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cw != null) {
         $$0.a("current_explosion_impact_pos", ac.a(etp.a.encodeStart(uo.a, this.cw), IllegalStateException::new));
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cy);
   }

   @Override
   public boolean b(bqf $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(avt.o)) {
         return !this.dN().aa().b(czz.G);
      } else if ($$0.a(avt.n)) {
         return !this.dN().aa().b(czz.H);
      } else if ($$0.a(avt.j)) {
         return !this.dN().aa().b(czz.I);
      } else {
         return $$0.a(avt.p) ? !this.dN().aa().b(czz.J) : false;
      }
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cA.a && !$$0.a(avt.e)) {
         return false;
      } else {
         this.bg = 0;
         if (this.ez()) {
            return false;
         } else {
            if (!this.dN().B) {
               this.go();
            }

            if ($$0.f()) {
               if (this.dN().ak() == bpj.a) {
                  $$1 = 0.0F;
               }

               if (this.dN().ak() == bpj.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dN().ak() == bpj.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bsa $$0) {
      super.d($$0);
      if ($$0.fM()) {
         this.fW();
      }
   }

   @Override
   public boolean er() {
      return !this.gb().a && super.er();
   }

   public boolean a(clh $$0) {
      euv $$1 = this.ch();
      euv $$2 = $$0.ch();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bqf $$0, float $$1) {
      this.a($$0, $$1, new bro[]{bro.c, bro.d, bro.e, bro.f});
   }

   @Override
   protected void c(bqf $$0, float $$1) {
      this.a($$0, $$1, new bro[]{bro.f});
   }

   @Override
   protected void v(float $$0) {
      if (this.bA.a(ctc.vs)) {
         if (!this.dN().B) {
            this.b(avm.c.b(this.bA.f()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + axz.d($$0);
            bpl $$2 = this.fu();
            this.bA.a($$1, this, d($$2));
            if (this.bA.d()) {
               if ($$2 == bpl.a) {
                  this.a(bro.a, csz.i);
               } else {
                  this.a(bro.b, csz.i);
               }

               this.bA = csz.i;
               this.a(avc.wq, 0.8F, 0.8F + this.dN().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bqf $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fq(), 0.0F);
         this.A(this.fq() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(avm.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.C($$0.a());
            this.eN().a($$0, var7);
            this.t(this.ey() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(avm.J, Math.round(var7 * 10.0F));
            }

            this.a(dva.o);
         }
      }
   }

   @Override
   protected boolean dW() {
      return !this.cA.b && super.dW();
   }

   public boolean Y() {
      return false;
   }

   public void a(dow $$0, boolean $$1) {
   }

   public void a(cze $$0) {
   }

   public void a(dnw $$0) {
   }

   public void a(dpb $$0) {
   }

   public void a(dom $$0) {
   }

   public void a(cft $$0, bpf $$1) {
   }

   public OptionalInt a(@Nullable bpq $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, czc $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(csz $$0, bpl $$1) {
   }

   public bpm a(brh $$0, bpl $$1) {
      if (this.N_()) {
         if ($$0 instanceof bpq) {
            this.a((bpq)$$0);
         }

         return bpm.d;
      } else {
         csz $$2 = this.b($$1);
         csz $$3 = $$2.r();
         bpm $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cA.d && $$2 == this.b($$1) && $$2.G() < $$3.G()) {
               $$2.e($$3.G());
            }

            return $$4;
         } else {
            if (!$$2.d() && $$0 instanceof bsa) {
               if (this.cA.d) {
                  $$2 = $$3;
               }

               bpm $$5 = $$2.a(this, (bsa)$$0, $$1);
               if ($$5.a()) {
                  this.dN().a(dva.r, $$0.dl(), dva.a.a(this));
                  if ($$2.d() && !this.cA.d) {
                     this.a($$1, csz.i);
                  }

                  return $$5;
               }
            }

            return bpm.d;
         }
      }
   }

   @Override
   public void bG() {
      super.bG();
      this.K = 0;
   }

   @Override
   protected boolean fe() {
      return super.fe() || this.fJ();
   }

   @Override
   public boolean ed() {
      return !this.cA.b;
   }

   @Override
   protected etp a(etp $$0, bsf $$1) {
      if (!this.cA.b && $$0.d <= 0.0 && ($$1 == bsf.a || $$1 == bsf.b) && this.fR() && this.z()) {
         double $$2 = $$0.c;
         double $$3 = $$0.e;
         double $$4 = 0.05;

         while ($$2 != 0.0 && this.dN().a(this, this.cI().d($$2, (double)(-this.dH()), 0.0))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }
         }

         while ($$3 != 0.0 && this.dN().a(this, this.cI().d(0.0, (double)(-this.dH()), $$3))) {
            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         while ($$2 != 0.0 && $$3 != 0.0 && this.dN().a(this, this.cI().d($$2, (double)(-this.dH()), $$3))) {
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

         $$0 = new etp($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean z() {
      return this.aC() || this.ac < this.dH() && !this.dN().a(this, this.cI().d(0.0, (double)(this.ac - this.dH()), 0.0));
   }

   public void e(brh $$0) {
      if ($$0.cr()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.g(bth.c);
            float $$2 = cyh.a(this.eV(), $$0.ai());
            float $$3 = this.D(0.5F);
            $$1 *= 0.2F + $$3 * $$3 * 0.8F;
            $$2 *= $$3;
            this.gu();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$4 = $$3 > 0.9F;
               boolean $$5 = false;
               int $$6 = 0;
               $$6 += cyh.c(this);
               if (this.bZ() && $$4) {
                  this.dN().a(null, this.ds(), this.du(), this.dy(), avc.tO, this.dc(), 1.0F, 1.0F);
                  $$6++;
                  $$5 = true;
               }

               $$1 += this.b(bpl.a).f().a(this, $$1);
               boolean $$7 = $$4
                  && this.ac > 0.0F
                  && !this.aC()
                  && !this.q_()
                  && !this.bc()
                  && !this.b(bqv.o)
                  && !this.bP()
                  && $$0 instanceof bsa
                  && !this.bZ();
               if ($$7) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$8 = false;
               double $$9 = (double)(this.Z - this.Y);
               if ($$4 && !$$7 && !$$5 && this.aC() && $$9 < (double)this.fl()) {
                  csz $$10 = this.b(bpl.a);
                  if ($$10.f() instanceof cuk) {
                     $$8 = true;
                  }
               }

               float $$11 = 0.0F;
               boolean $$12 = false;
               int $$13 = cyh.d(this);
               if ($$0 instanceof bsa) {
                  $$11 = ((bsa)$$0).ey();
                  if ($$13 > 0 && !$$0.bO()) {
                     $$12 = true;
                     $$0.g(1);
                  }
               }

               etp $$14 = $$0.dq();
               boolean $$15 = $$0.a(this.dO().a(this), $$1);
               if ($$15) {
                  if ($$6 > 0) {
                     if ($$0 instanceof bsa) {
                        ((bsa)$$0)
                           .q(
                              (double)((float)$$6 * 0.5F),
                              (double)axz.a(this.dD() * (float) (Math.PI / 180.0)),
                              (double)(-axz.b(this.dD() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-axz.a(this.dD() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F),
                           0.1,
                           (double)(axz.b(this.dD() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F)
                        );
                     }

                     this.g(this.dq().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$8) {
                     float $$16 = 1.0F + cyh.a(this) * $$1;

                     for (bsa $$18 : this.dN().a(bsa.class, $$0.cI().c(1.0, 0.25, 1.0))) {
                        if ($$18 != this && $$18 != $$0 && !this.s($$18) && (!($$18 instanceof chh) || !((chh)$$18).z()) && this.g((brh)$$18) < 9.0) {
                           $$18.q(0.4F, (double)axz.a(this.dD() * (float) (Math.PI / 180.0)), (double)(-axz.b(this.dD() * (float) (Math.PI / 180.0))));
                           $$18.a(this.dO().a(this), $$16);
                        }
                     }

                     this.dN().a(null, this.ds(), this.du(), this.dy(), avc.tR, this.dc(), 1.0F, 1.0F);
                     this.fX();
                  }

                  if ($$0 instanceof aqi && $$0.U) {
                     ((aqi)$$0).d.b(new aes($$0));
                     $$0.U = false;
                     $$0.g($$14);
                  }

                  if ($$7) {
                     this.dN().a(null, this.ds(), this.du(), this.dy(), avc.tN, this.dc(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$7 && !$$8) {
                     if ($$4) {
                        this.dN().a(null, this.ds(), this.du(), this.dy(), avc.tQ, this.dc(), 1.0F, 1.0F);
                     } else {
                        this.dN().a(null, this.ds(), this.du(), this.dy(), avc.tS, this.dc(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.c($$0);
                  }

                  this.A($$0);
                  if ($$0 instanceof bsa) {
                     cyh.a((bsa)$$0, this);
                  }

                  cyh.b(this, $$0);
                  csz $$19 = this.eV();
                  brh $$20 = $$0;
                  if ($$0 instanceof cgj) {
                     $$20 = ((cgj)$$0).b;
                  }

                  if (!this.dN().B && !$$19.d() && $$20 instanceof bsa) {
                     $$19.a((bsa)$$20, this);
                     if ($$19.d()) {
                        this.a(bpl.a, csz.i);
                     }
                  }

                  if ($$0 instanceof bsa) {
                     float $$21 = $$11 - ((bsa)$$0).ey();
                     this.a(avm.G, Math.round($$21 * 10.0F));
                     if ($$13 > 0) {
                        $$0.g($$13 * 4);
                     }

                     if (this.dN() instanceof aqh && $$21 > 2.0F) {
                        int $$22 = (int)((double)$$21 * 0.5);
                        ((aqh)this.dN()).a(kx.g, $$0.ds(), $$0.e(0.5), $$0.dy(), $$22, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.C(0.1F);
               } else {
                  this.dN().a(null, this.ds(), this.du(), this.dy(), avc.tP, this.dc(), 1.0F, 1.0F);
                  if ($$12) {
                     $$0.aA();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(bsa $$0) {
      this.e($$0);
   }

   public void fW() {
      this.gv().a(ctc.vs, 100);
      this.fz();
      this.dN().a(this, (byte)30);
   }

   @Override
   public void b(brh $$0) {
   }

   public void c(brh $$0) {
   }

   public void fX() {
      double $$0 = (double)(-axz.a(this.dD() * (float) (Math.PI / 180.0)));
      double $$1 = (double)axz.b(this.dD() * (float) (Math.PI / 180.0));
      if (this.dN() instanceof aqh) {
         ((aqh)this.dN()).a(kx.ag, this.ds() + $$0, this.e(0.5), this.dy() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fY() {
   }

   @Override
   public void a(brh.c $$0) {
      super.a($$0);
      this.cb.b(this);
      if (this.cc != null && this.gc()) {
         this.s();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile fZ() {
      return this.cC;
   }

   public clg ga() {
      return this.g;
   }

   public cle gb() {
      return this.cA;
   }

   @Override
   public boolean fN() {
      return this.cA.d;
   }

   public void a(csz $$0, csz $$1, col $$2) {
   }

   public boolean gc() {
      return this.cc != this.cb;
   }

   public Either<clh.a, azb> a(in $$0) {
      this.b($$0);
      this.h = 0;
      return Either.right(azb.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fK();
      if (this.dN() instanceof aqh && $$1) {
         ((aqh)this.dN()).e();
      }

      this.h = $$0 ? 0 : 100;
   }

   @Override
   public void fK() {
      this.a(true, true);
   }

   public static Optional<etp> a(aqh $$0, in $$1, float $$2, boolean $$3, boolean $$4) {
      dqh $$5 = $$0.a_($$1);
      dde $$6 = $$5.b();
      if ($$6 instanceof djm && ($$3 || $$5.c(djm.d) > 0) && djm.a($$0)) {
         Optional<etp> $$7 = djm.a(brn.bx, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(djm.d, Integer.valueOf($$5.c(djm.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof dcx && dcx.a($$0)) {
         return dcx.a(brn.bx, $$0, $$1, $$5.c(dcx.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dqh $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new etp((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean gd() {
      return this.fJ() && this.h >= 100;
   }

   public int ge() {
      return this.h;
   }

   public void a(wu $$0, boolean $$1) {
   }

   public void a(akh $$0) {
      this.b(avm.i.b($$0));
   }

   public void a(akh $$0, int $$1) {
      this.a(avm.i.b($$0), $$1);
   }

   public void b(avj<?> $$0) {
      this.a($$0, 1);
   }

   public void a(avj<?> $$0, int $$1) {
   }

   public void a(avj<?> $$0) {
   }

   public int a(Collection<cxf<?>> $$0) {
      return 0;
   }

   public void a(cxf<?> $$0, List<csz> $$1) {
   }

   public void b(List<akh> $$0) {
   }

   public int b(Collection<cxf<?>> $$0) {
      return 0;
   }

   @Override
   public void fh() {
      super.fh();
      this.a(avm.E);
      if (this.bZ()) {
         this.C(0.2F);
      } else {
         this.C(0.05F);
      }
   }

   @Override
   public void a(etp $$0) {
      if (this.ca() && !this.bP()) {
         double $$1 = this.bJ().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bo || !this.dN().a_(in.a(this.ds(), this.du() + 1.0 - 0.1, this.dy())).u().c()) {
            etp $$3 = this.dq();
            this.g($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cA.b && !this.bP()) {
         double $$4 = this.dq().d;
         super.a($$0);
         etp $$5 = this.dq();
         this.o($$5.c, $$4 * 0.6, $$5.e);
         this.n();
         this.b(7, false);
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bi() {
      if (this.cA.b) {
         this.i(false);
      } else {
         super.bi();
      }
   }

   protected boolean h(in $$0) {
      return !this.dN().a_($$0).o(this.dN(), $$0);
   }

   @Override
   public float fl() {
      return (float)this.g(bth.r);
   }

   @Override
   public boolean a(float $$0, float $$1, bqf $$2) {
      if (this.cA.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(avm.t, (int)Math.round((double)$$0 * 100.0));
         }

         if (this.cy && this.cw != null) {
            double $$3 = this.cw.d;
            this.gC();
            return $$3 < this.du() ? false : super.a((float)($$3 - this.du()), $$1, $$2);
         } else {
            return super.a($$0, $$1, $$2);
         }
      }
   }

   public boolean gf() {
      if (!this.aC() && !this.fC() && !this.bc() && !this.b(bqv.y)) {
         csz $$0 = this.d(bro.e);
         if ($$0.a(ctc.nT) && crv.j($$0)) {
            this.gg();
            return true;
         }
      }

      return false;
   }

   public void gg() {
      this.b(7, true);
   }

   public void gh() {
      this.b(7, true);
      this.b(7, false);
   }

   @Override
   protected void bl() {
      if (!this.N_()) {
         super.bl();
      }
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      if (this.bc()) {
         this.aR();
         this.b($$1);
      } else {
         in $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dqh $$3 = this.dN().a_($$2);
            if ($$3.a(avr.bo)) {
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
   public bsa.a eJ() {
      return new bsa.a(avc.ud, avc.tT);
   }

   @Override
   public boolean a(aqh $$0, bsa $$1) {
      this.b(avm.g.b($$1.ai()));
      return true;
   }

   @Override
   public void a(dqh $$0, etp $$1) {
      if (!this.cA.b) {
         super.a($$0, $$1);
      }

      this.gC();
   }

   public void d(int $$0) {
      this.t($$0);
      this.cr = this.cr + (float)$$0 / (float)this.gj();
      this.cq = axz.a(this.cq + $$0, 0, Integer.MAX_VALUE);

      while (this.cr < 0.0F) {
         float $$1 = this.cr * (float)this.gj();
         if (this.cp > 0) {
            this.c(-1);
            this.cr = 1.0F + $$1 / (float)this.gj();
         } else {
            this.c(-1);
            this.cr = 0.0F;
         }
      }

      while (this.cr >= 1.0F) {
         this.cr = (this.cr - 1.0F) * (float)this.gj();
         this.c(1);
         this.cr = this.cr / (float)this.gj();
      }
   }

   public int gi() {
      return this.cs;
   }

   @Override
   public void a(csz $$0, int $$1) {
      this.cp -= $$1;
      if (this.cp < 0) {
         this.cp = 0;
         this.cr = 0.0F;
         this.cq = 0;
      }

      this.cs = this.ah.f();
   }

   public void c(int $$0) {
      this.cp += $$0;
      if (this.cp < 0) {
         this.cp = 0;
         this.cr = 0.0F;
         this.cq = 0;
      }

      if ($$0 > 0 && this.cp % 5 == 0 && (float)this.cB < (float)this.ai - 100.0F) {
         float $$1 = this.cp > 30 ? 1.0F : (float)this.cp / 30.0F;
         this.dN().a(null, this.ds(), this.du(), this.dy(), avc.uc, this.dc(), $$1 * 0.75F, 1.0F);
         this.cB = this.ai;
      }
   }

   public int gj() {
      if (this.cp >= 30) {
         return 112 + (this.cp - 30) * 9;
      } else {
         return this.cp >= 15 ? 37 + (this.cp - 15) * 5 : 7 + this.cp * 2;
      }
   }

   public void C(float $$0) {
      if (!this.cA.a) {
         if (!this.dN().B) {
            this.cd.a($$0);
         }
      }
   }

   public Optional<ckn> aa() {
      return Optional.empty();
   }

   public cnz gk() {
      return this.cd;
   }

   public boolean t(boolean $$0) {
      return this.cA.a || $$0 || this.cd.c();
   }

   public boolean gl() {
      return this.ey() > 0.0F && this.ey() < this.eP();
   }

   public boolean gm() {
      return this.cA.e;
   }

   public boolean a(in $$0, is $$1, csz $$2) {
      if (this.cA.e) {
         return true;
      } else {
         in $$3 = $$0.a($$1.g());
         dql $$4 = new dql(this.dN(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   public int eh() {
      if (!this.dN().aa().b(czz.d) && !this.N_()) {
         int $$0 = this.cp * 7;
         return $$0 > 100 ? 100 : $$0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean ei() {
      return true;
   }

   @Override
   public boolean cD() {
      return true;
   }

   @Override
   protected brh.b aZ() {
      return this.cA.b || this.aC() && this.bW() ? brh.b.a : brh.b.d;
   }

   public void y() {
   }

   @Override
   public wu ad() {
      return wu.b(this.cC.getName());
   }

   public cpq gn() {
      return this.ca;
   }

   @Override
   public csz d(bro $$0) {
      if ($$0 == bro.a) {
         return this.g.f();
      } else if ($$0 == bro.b) {
         return this.g.j.get(0);
      } else {
         return $$0.a() == bro.a.b ? this.g.i.get($$0.b()) : csz.i;
      }
   }

   @Override
   protected boolean a(bro $$0) {
      return $$0.a() == bro.a.b;
   }

   @Override
   public void a(bro $$0, csz $$1) {
      this.e($$1);
      if ($$0 == bro.a) {
         this.a($$0, this.g.h.set(this.g.k, $$1), $$1);
      } else if ($$0 == bro.b) {
         this.a($$0, this.g.j.set(0, $$1), $$1);
      } else if ($$0.a() == bro.a.b) {
         this.a($$0, this.g.i.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(csz $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<csz> eY() {
      return Lists.newArrayList(new csz[]{this.eV(), this.eW()});
   }

   @Override
   public Iterable<csz> eX() {
      return this.g.i;
   }

   @Override
   public boolean c(bro $$0) {
      return $$0 != bro.g;
   }

   public boolean h(ua $$0) {
      if (this.bP() || !this.aC() || this.bc() || this.aB) {
         return false;
      } else if (this.gr().g()) {
         this.i($$0);
         this.f = this.dN().Y();
         return true;
      } else if (this.gs().g()) {
         this.j($$0);
         this.f = this.dN().Y();
         return true;
      } else {
         return false;
      }
   }

   protected void go() {
      if (this.f + 20L < this.dN().Y()) {
         this.k(this.gr());
         this.i(new ua());
         this.k(this.gs());
         this.j(new ua());
      }
   }

   private void k(ua $$0) {
      if (!this.dN().B && !$$0.g()) {
         brn.a($$0, this.dN()).ifPresent($$0x -> {
            if ($$0x instanceof bsw) {
               ((bsw)$$0x).b(this.az);
            }

            $$0x.a_(this.ds(), this.du() + 0.7F, this.dy());
            ((aqh)this.dN()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean N_();

   @Override
   public boolean bw() {
      return !this.N_() && super.bw();
   }

   @Override
   public boolean ca() {
      return !this.cA.b && !this.N_() && super.ca();
   }

   public abstract boolean f();

   @Override
   public boolean cA() {
      return !this.cA.b;
   }

   public eut gp() {
      return this.dN().L();
   }

   @Override
   public wu O_() {
      xi $$0 = euo.a(this.ch(), this.ad());
      return this.a($$0);
   }

   private xi a(xi $$0) {
      String $$1 = this.fZ().getName();
      return $$0.a($$1x -> $$1x.a(new ws(ws.a.d, "/tell " + $$1 + " ")).a(this.cH()).a($$1));
   }

   @Override
   public String cz() {
      return this.fZ().getName();
   }

   @Override
   protected void B(float $$0) {
      this.an().a(d, $$0);
   }

   @Override
   public float fq() {
      return this.an().a(d);
   }

   public boolean a(cli $$0) {
      return (this.an().a(bW) & $$0.a()) == $$0.a();
   }

   @Override
   public bsr a_(int $$0) {
      if ($$0 == 499) {
         return new bsr() {
            @Override
            public csz a() {
               return clh.this.cc.g();
            }

            @Override
            public boolean a(csz $$0) {
               clh.this.cc.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bsr() {
               @Override
               public csz a() {
                  return clh.this.cb.q().a($$1);
               }

               @Override
               public boolean a(csz $$0) {
                  clh.this.cb.q().a($$1, $$0);
                  clh.this.cb.a(clh.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.h.size()) {
            return bsr.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.ca.b() ? bsr.a(this.ca, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gq() {
      return this.cD;
   }

   public void u(boolean $$0) {
      this.cD = $$0;
   }

   @Override
   public void i(int $$0) {
      super.i(this.cA.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bru fs() {
      return this.ao.a(bX) == 0 ? bru.a : bru.b;
   }

   public void a(bru $$0) {
      this.ao.a(bX, (byte)($$0 == bru.a ? 0 : 1));
   }

   public ua gr() {
      return this.ao.a(bY);
   }

   protected void i(ua $$0) {
      this.ao.a(bY, $$0);
   }

   public ua gs() {
      return this.ao.a(bZ);
   }

   protected void j(ua $$0) {
      this.ao.a(bZ, $$0);
   }

   public float gt() {
      return (float)(1.0 / this.g(bth.e) * 20.0);
   }

   public float D(float $$0) {
      return axz.a(((float)this.aU + $$0) / this.gt(), 0.0F, 1.0F);
   }

   public void gu() {
      this.aU = 0;
   }

   public csv gv() {
      return this.cF;
   }

   @Override
   protected float aL() {
      return !this.cA.b && !this.fC() ? super.aL() : 1.0F;
   }

   public float gw() {
      return (float)this.g(bth.o);
   }

   public boolean gx() {
      return this.cA.d && this.F() >= 2;
   }

   @Override
   public boolean f(csz $$0) {
      bro $$1 = bsc.h($$0);
      return this.d($$1).d();
   }

   @Override
   public brk e(bsl $$0) {
      return c.getOrDefault($$0, bV);
   }

   @Override
   public ImmutableList<bsl> fG() {
      return ImmutableList.of(bsl.a, bsl.f, bsl.d);
   }

   @Override
   public csz g(csz $$0) {
      if (!($$0.f() instanceof ctq)) {
         return csz.i;
      } else {
         Predicate<csz> $$1 = ((ctq)$$0.f()).d();
         csz $$2 = ctq.a(this, $$1);
         if (!$$2.d()) {
            return $$2;
         } else {
            $$1 = ((ctq)$$0.f()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               csz $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cA.d ? new csz(ctc.ov) : csz.i;
         }
      }
   }

   @Override
   public csz a(dad $$0, csz $$1) {
      this.gk().a($$1);
      this.b(avm.c.b($$1.f()));
      $$0.a(null, this.ds(), this.du(), this.dy(), avc.tV, avd.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof aqi) {
         am.A.a((aqi)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dqh $$0) {
      return this.cA.b || super.c($$0);
   }

   @Override
   public etp q(float $$0) {
      double $$1 = 0.22 * (this.fs() == bru.b ? -1.0 : 1.0);
      float $$2 = axz.i($$0 * 0.5F, this.dF(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = axz.i($$0, this.ba, this.aZ) * (float) (Math.PI / 180.0);
      if (this.fC() || this.fp()) {
         etp $$4 = this.f($$0);
         etp $$5 = this.dq();
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

         return this.l($$0).e(new etp($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cb()) {
         return this.l($$0).e(new etp($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cI().c() - 1.0;
         double $$13 = this.bY() ? -0.2 : 0.07;
         return this.l($$0).e(new etp($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dM() {
      return true;
   }

   public boolean gy() {
      return this.ft() && this.fv().a(ctc.qX);
   }

   @Override
   public boolean dL() {
      return false;
   }

   public Optional<iv> gz() {
      return this.cG;
   }

   public void a(Optional<iv> $$0) {
      this.cG = $$0;
   }

   @Override
   public float eH() {
      return this.cv;
   }

   @Override
   public void m(float $$0) {
      super.m($$0);
      this.cv = $$0;
   }

   @Override
   public boolean dG() {
      return true;
   }

   @Override
   protected float fk() {
      if (this.cA.b && !this.bP()) {
         return this.bZ() ? this.cA.a() * 2.0F : this.cA.a();
      } else {
         return this.bZ() ? 0.025999999F : 0.02F;
      }
   }

   public double gA() {
      return this.g(bth.g);
   }

   public double gB() {
      return this.g(bth.h);
   }

   public boolean b(brh $$0, double $$1) {
      return $$0.dI() ? false : this.a($$0.cI(), $$1);
   }

   public boolean a(etk $$0, double $$1) {
      double $$2 = this.gB() + $$1;
      return $$0.e(this.bv()) < $$2 * $$2;
   }

   public boolean a(in $$0, double $$1) {
      double $$2 = this.gA() + $$1;
      return new etk($$0).e(this.bv()) < $$2 * $$2;
   }

   public void gC() {
      this.cx = null;
      this.cw = null;
      this.cy = false;
   }

   public static enum a {
      a,
      b(wu.c("block.minecraft.bed.no_sleep")),
      c(wu.c("block.minecraft.bed.too_far_away")),
      d(wu.c("block.minecraft.bed.obstructed")),
      e,
      f(wu.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final wu g;

      private a() {
         this.g = null;
      }

      private a(wu $$0) {
         this.g = $$0;
      }

      @Nullable
      public wu a() {
         return this.g;
      }
   }
}
