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

public abstract class ckl extends bre {
   private static final Logger b = LogUtils.getLogger();
   public static final bqy bG = bqy.b;
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
   public static final etf bU = new etf(0.0, 0.6, 0.0);
   public static final bqo bV = bqo.b(0.6F, 1.8F).b(1.62F).a(bqn.a().a(bqm.b, bU));
   private static final Map<brp, bqo> c = ImmutableMap.builder()
      .put(brp.a, bV)
      .put(brp.c, aH)
      .put(brp.b, bqo.b(0.6F, 0.6F).b(0.4F))
      .put(brp.d, bqo.b(0.6F, 0.6F).b(0.4F))
      .put(brp.e, bqo.b(0.6F, 0.6F).b(0.4F))
      .put(brp.f, bqo.b(0.6F, 1.5F).b(1.27F).a(bqn.a().a(bqm.b, bU)))
      .put(brp.h, bqo.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final float d = 2.5F;
   private static final float e = 0.6F;
   private static final ajk<Float> f = ajo.a(ckl.class, ajm.d);
   private static final ajk<Integer> g = ajo.a(ckl.class, ajm.b);
   protected static final ajk<Byte> bW = ajo.a(ckl.class, ajm.a);
   protected static final ajk<Byte> bX = ajo.a(ckl.class, ajm.a);
   protected static final ajk<ty> bY = ajo.a(ckl.class, ajm.t);
   protected static final ajk<ty> bZ = ajo.a(ckl.class, ajm.t);
   private long h;
   final ckk cx = new ckk(this);
   protected cou ca = new cou();
   public final coi cb;
   public cnh cc;
   protected cnd cd = new cnd();
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
   private int cy;
   protected boolean co;
   private final cki cA = new cki();
   public int cp;
   public int cq;
   public float cr;
   protected int cs;
   protected final float ct = 0.02F;
   private int cB;
   private final GameProfile cC;
   private boolean cD;
   private csd cE = csd.i;
   private final crz cF = this.k();
   private Optional<iu> cG = Optional.empty();
   @Nullable
   public ckz cu;
   protected float cv;
   @Nullable
   public Double cw;

   public ckl(czu $$0, im $$1, float $$2, GameProfile $$3) {
      super(bqr.bx, $$0);
      this.a_($$3.getId());
      this.cC = $$3;
      this.cb = new coi(this.cx, !$$0.B, this);
      this.cc = this.cb;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bl = 180.0F;
   }

   public boolean a(czu $$0, im $$1, czr $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == czr.d) {
         return true;
      } else if (this.gm()) {
         return false;
      } else {
         csd $$3 = this.eV();
         return $$3.d() || !$$3.b(new dqc($$0, $$1, false));
      }
   }

   public static bsk.a fO() {
      return bre.dS().a(bsl.c, 1.0).a(bsl.r, 0.1F).a(bsl.e).a(bsl.o).a(bsl.g, 4.5).a(bsl.h, 3.0).a(bsl.f);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(f, 0.0F);
      $$0.a(g, 0);
      $$0.a(bW, (byte)0);
      $$0.a(bX, (byte)bG.a());
      $$0.a(bY, new ty());
      $$0.a(bZ, new ty());
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
         this.cy++;
         if (this.cy > 100) {
            this.cy = 100;
         }

         if (!this.dN().B && this.dN().Q()) {
            this.a(false, true);
         }
      } else if (this.cy > 0) {
         this.cy++;
         if (this.cy >= 110) {
            this.cy = 0;
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
         this.a(avj.k);
         this.a(avj.l);
         if (this.bB()) {
            this.a(avj.m);
         }

         if (this.bW()) {
            this.a(avj.o);
         }

         if (!this.fJ()) {
            this.a(avj.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = axw.a(this.ds(), -2.9999999E7, 2.9999999E7);
      double $$2 = axw.a(this.dy(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.ds() || $$2 != this.dy()) {
         this.a_($$1, this.du(), $$2);
      }

      this.aU++;
      csd $$3 = this.eV();
      if (!csd.a(this.cE, $$3)) {
         if (!csd.b(this.cE, $$3)) {
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
      this.co = this.a(avt.a);
      return this.co;
   }

   private void u() {
      csd $$0 = this.d(bqs.f);
      if ($$0.a(csg.oo) && !this.a(avt.a)) {
         this.b(new bpx(bpz.m, 200, 0, false, false, true));
      }
   }

   protected crz k() {
      return new crz();
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
      if (this.h(brp.d)) {
         brp $$0;
         if (this.fC()) {
            $$0 = brp.b;
         } else if (this.fJ()) {
            $$0 = brp.c;
         } else if (this.ca()) {
            $$0 = brp.d;
         } else if (this.fp()) {
            $$0 = brp.e;
         } else if (this.bT() && !this.cA.b) {
            $$0 = brp.f;
         } else {
            $$0 = brp.a;
         }

         brp $$6;
         if (this.N_() || this.bP() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(brp.f)) {
            $$6 = brp.f;
         } else {
            $$6 = brp.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(brp $$0) {
      return this.dN().a(this, this.a($$0).a(this.dl()).h(1.0E-7));
   }

   @Override
   public int ax() {
      return Math.max(1, this.dN().aa().c(this.cA.a ? czq.F : czq.E));
   }

   @Override
   protected auy aN() {
      return auz.uf;
   }

   @Override
   protected auy aO() {
      return auz.ud;
   }

   @Override
   protected auy aP() {
      return auz.ue;
   }

   @Override
   public int bN() {
      return 10;
   }

   @Override
   public void a(auy $$0, float $$1, float $$2) {
      this.dN().a(this, this.ds(), this.du(), this.dy(), $$0, this.dc(), $$1, $$2);
   }

   public void a(auy $$0, ava $$1, float $$2, float $$3) {
   }

   @Override
   public ava dc() {
      return ava.h;
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
         this.a(kw.e);
      } else {
         super.b($$0);
      }
   }

   private void a(ku $$0) {
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

      if (this.dN().ak() == bon.a && this.dN().aa().b(czq.k)) {
         if (this.ey() < this.eP() && this.ai % 20 == 0) {
            this.c(1.0F);
         }

         if (this.cd.c() && this.ai % 10 == 0) {
            this.cd.a(this.cd.a() + 1);
         }
      }

      this.cx.j();
      this.cf = this.cg;
      super.n_();
      this.y((float)this.g(bsl.r));
      float $$1;
      if (this.aC() && !this.ez() && !this.ca()) {
         $$1 = Math.min(0.1F, (float)this.dq().h());
      } else {
         $$1 = 0.0F;
      }

      this.cg = this.cg + ($$1 - this.cg) * 0.4F;
      if (this.ey() > 0.0F && !this.N_()) {
         eta $$2;
         if (this.bP() && !this.da().dI()) {
            $$2 = this.cI().b(this.da().cI()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cI().c(1.0, 0.5, 1.0);
         }

         List<bql> $$4 = this.dN().a_(this, $$2);
         List<bql> $$5 = Lists.newArrayList();

         for (bql $$6 : $$4) {
            if ($$6.ai() == bqr.M) {
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

   private void c(@Nullable ty $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dN().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bqr.a($$1).filter($$0x -> $$0x == bqr.aw).ifPresent($$0x -> {
            if (!cdj.a(this.dN(), this)) {
               this.dN().a(null, this.ds(), this.du(), this.dy(), cdj.a(this.dN(), this.dN().z), this.dc(), 1.0F, cdj.a(this.dN().z));
            }
         });
      }
   }

   private void d(bql $$0) {
      $$0.b_(this);
   }

   public int fU() {
      return this.ao.a(g);
   }

   public void s(int $$0) {
      this.ao.a(g, $$0);
   }

   public void t(int $$0) {
      int $$1 = this.fU();
      this.ao.a(g, $$1 + $$0);
   }

   public void u(int $$0) {
      this.bD = $$0;
      if (!this.dN().B) {
         this.go();
         this.c(4, true);
      }
   }

   @Override
   public void a(bpj $$0) {
      super.a($$0);
      this.ar();
      if (!this.N_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-axw.b((this.eH() + this.dD()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-axw.a((this.eH() + this.dD()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(avj.N);
      this.a(avj.i.b(avj.m));
      this.a(avj.i.b(avj.n));
      this.aA();
      this.c(false);
      this.a(Optional.of(iu.a(this.dN().ae(), this.dn())));
   }

   @Override
   protected void eB() {
      super.eB();
      if (!this.dN().aa().b(czq.d)) {
         this.fV();
         this.cx.k();
      }
   }

   protected void fV() {
      for (int $$0 = 0; $$0 < this.cx.b(); $$0++) {
         csd $$1 = this.cx.a($$0);
         if (!$$1.d() && cxo.g($$1)) {
            this.cx.b($$0);
         }
      }
   }

   @Override
   protected auy d(bpj $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected auy o_() {
      return auz.tV;
   }

   @Nullable
   public cgv a(csd $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cgv a(csd $$0, boolean $$1, boolean $$2) {
      if ($$0.d()) {
         return null;
      } else {
         if (this.dN().B) {
            this.a(bop.a);
         }

         double $$3 = this.dw() - 0.3F;
         cgv $$4 = new cgv(this.dN(), this.ds(), $$3, this.dy(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ah.i() * 0.5F;
            float $$6 = this.ah.i() * (float) (Math.PI * 2);
            $$4.o((double)(-axw.a($$6) * $$5), 0.2F, (double)(axw.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = axw.a(this.dF() * (float) (Math.PI / 180.0));
            float $$9 = axw.b(this.dF() * (float) (Math.PI / 180.0));
            float $$10 = axw.a(this.dD() * (float) (Math.PI / 180.0));
            float $$11 = axw.b(this.dD() * (float) (Math.PI / 180.0));
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

   public float d(dpy $$0) {
      float $$1 = this.cx.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = cxo.g(this);
         csd $$3 = this.eV();
         if ($$2 > 0 && !$$3.d()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bpy.a(this)) {
         $$1 *= 1.0F + (float)(bpy.b(this) + 1) * 0.2F;
      }

      if (this.b(bpz.d)) {
         $$1 *= switch (this.c(bpz.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.g(bsl.f);
      if (this.a(avt.a) && !cxo.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aC()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dpy $$0) {
      return !$$0.y() || this.cx.f().b($$0);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.a_(this.cC.getId());
      ue $$1 = $$0.c("Inventory", 10);
      this.cx.b($$1);
      this.cx.l = $$0.h("SelectedItemSlot");
      this.cy = $$0.g("SleepTimer");
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
      this.f(bsl.r).a((double)this.cA.b());
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
         this.a(iu.b.parse(um.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

      if ($$0.b("ignore_fall_damage_above_y", 6)) {
         this.cw = $$0.k("ignore_fall_damage_above_y");
      }
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      un.e($$0);
      $$0.a("Inventory", this.cx.a(new ue()));
      $$0.a("SelectedItemSlot", this.cx.l);
      $$0.a("SleepTimer", (short)this.cy);
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

      this.gz().flatMap($$0x -> iu.b.encodeStart(um.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cw != null) {
         $$0.a("ignore_fall_damage_above_y", this.cw);
      }
   }

   @Override
   public boolean b(bpj $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(avq.o)) {
         return !this.dN().aa().b(czq.G);
      } else if ($$0.a(avq.n)) {
         return !this.dN().aa().b(czq.H);
      } else if ($$0.a(avq.j)) {
         return !this.dN().aa().b(czq.I);
      } else {
         return $$0.a(avq.p) ? !this.dN().aa().b(czq.J) : false;
      }
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cA.a && !$$0.a(avq.e)) {
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
               if (this.dN().ak() == bon.a) {
                  $$1 = 0.0F;
               }

               if (this.dN().ak() == bon.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dN().ak() == bon.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bre $$0) {
      super.d($$0);
      if ($$0.fM()) {
         this.fW();
      }
   }

   @Override
   public boolean er() {
      return !this.gb().a && super.er();
   }

   public boolean a(ckl $$0) {
      eul $$1 = this.ch();
      eul $$2 = $$0.ch();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bpj $$0, float $$1) {
      this.a($$0, $$1, new bqs[]{bqs.c, bqs.d, bqs.e, bqs.f});
   }

   @Override
   protected void c(bpj $$0, float $$1) {
      this.a($$0, $$1, new bqs[]{bqs.f});
   }

   @Override
   protected void v(float $$0) {
      if (this.bA.a(csg.vs)) {
         if (!this.dN().B) {
            this.b(avj.c.b(this.bA.f()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + axw.d($$0);
            bop $$2 = this.fu();
            this.bA.a($$1, this, d($$2));
            if (this.bA.d()) {
               if ($$2 == bop.a) {
                  this.a(bqs.a, csd.i);
               } else {
                  this.a(bqs.b, csd.i);
               }

               this.bA = csd.i;
               this.a(auz.wp, 0.8F, 0.8F + this.dN().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bpj $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fq(), 0.0F);
         this.A(this.fq() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(avj.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.C($$0.a());
            this.eN().a($$0, var7);
            this.t(this.ey() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(avj.J, Math.round(var7 * 10.0F));
            }

            this.a(dur.o);
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

   public void a(don $$0, boolean $$1) {
   }

   public void a(cyv $$0) {
   }

   public void a(dnn $$0) {
   }

   public void a(dos $$0) {
   }

   public void a(dod $$0) {
   }

   public void a(cex $$0, boj $$1) {
   }

   public OptionalInt a(@Nullable bou $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, cyt $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(csd $$0, bop $$1) {
   }

   public boq a(bql $$0, bop $$1) {
      if (this.N_()) {
         if ($$0 instanceof bou) {
            this.a((bou)$$0);
         }

         return boq.d;
      } else {
         csd $$2 = this.b($$1);
         csd $$3 = $$2.r();
         boq $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cA.d && $$2 == this.b($$1) && $$2.G() < $$3.G()) {
               $$2.e($$3.G());
            }

            return $$4;
         } else {
            if (!$$2.d() && $$0 instanceof bre) {
               if (this.cA.d) {
                  $$2 = $$3;
               }

               boq $$5 = $$2.a(this, (bre)$$0, $$1);
               if ($$5.a()) {
                  this.dN().a(dur.r, $$0.dl(), dur.a.a(this));
                  if ($$2.d() && !this.cA.d) {
                     this.a($$1, csd.i);
                  }

                  return $$5;
               }
            }

            return boq.d;
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
   protected etf a(etf $$0, brj $$1) {
      if (!this.cA.b && $$0.d <= 0.0 && ($$1 == brj.a || $$1 == brj.b) && this.fR() && this.z()) {
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

         $$0 = new etf($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean z() {
      return this.aC() || this.ac < this.dH() && !this.dN().a(this, this.cI().d(0.0, (double)(this.ac - this.dH()), 0.0));
   }

   public void e(bql $$0) {
      if ($$0.cr()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.g(bsl.c);
            float $$2 = cxo.a(this.eV(), $$0.ai());
            float $$3 = this.D(0.5F);
            $$1 *= 0.2F + $$3 * $$3 * 0.8F;
            $$2 *= $$3;
            this.gu();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$4 = $$3 > 0.9F;
               boolean $$5 = false;
               int $$6 = 0;
               $$6 += cxo.c(this);
               if (this.bZ() && $$4) {
                  this.dN().a(null, this.ds(), this.du(), this.dy(), auz.tN, this.dc(), 1.0F, 1.0F);
                  $$6++;
                  $$5 = true;
               }

               boolean $$7 = this.b(bop.a).f() instanceof csk && this.ac > 1.5F;
               if ($$7) {
                  $$1 += $$1 * 0.5F * this.ac;
                  this.dN()
                     .a(
                        bre.class,
                        $$0.cI().g(2.5),
                        $$1x -> $$1x != this
                              && $$1x != $$0
                              && !this.s($$1x)
                              && (!($$1x instanceof cgl) || !((cgl)$$1x).z())
                              && $$0.g($$1x) <= Math.pow(2.5, 2.0)
                     )
                     .forEach($$1x -> {
                        etf $$2x = $$1x.dl().d($$0.dl());
                        double $$3x = (2.5 - $$2x.f()) * 0.6F * (1.0 - $$1x.g(bsl.n));
                        etf $$4x = $$2x.d().a($$3x);
                        if ($$3x > 0.0) {
                           $$1x.j($$4x.c, 0.6F, $$4x.e);
                           if (!this.dN().x_()) {
                              im $$5x = $$1x.aJ();
                              etf $$6x = $$5x.b().b(0.0, 0.5, 0.0);
                              int $$7x = (int)(100.0 * $$3x);
                              ((aqe)this.dN()).a(new kn(kw.b, this.dN().a_($$5x)), $$6x.c, $$6x.d, $$6x.e, $$7x, 0.3F, 0.3F, 0.3F, 0.15F);
                           }
                        }
                     });
               }

               boolean $$8 = $$4
                  && this.ac > 0.0F
                  && !this.aC()
                  && !this.q_()
                  && !this.bc()
                  && !this.b(bpz.o)
                  && !this.bP()
                  && $$0 instanceof bre
                  && !this.bZ();
               if ($$8) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$9 = false;
               double $$10 = (double)(this.Z - this.Y);
               if ($$4 && !$$8 && !$$5 && this.aC() && $$10 < (double)this.fl()) {
                  csd $$11 = this.b(bop.a);
                  if ($$11.f() instanceof cto) {
                     $$9 = true;
                  }
               }

               float $$12 = 0.0F;
               boolean $$13 = false;
               int $$14 = cxo.d(this);
               if ($$0 instanceof bre) {
                  $$12 = ((bre)$$0).ey();
                  if ($$14 > 0 && !$$0.bO()) {
                     $$13 = true;
                     $$0.g(1);
                  }
               }

               etf $$15 = $$0.dq();
               boolean $$16 = $$0.a(this.dO().a(this), $$1);
               if ($$16) {
                  if ($$6 > 0) {
                     if ($$0 instanceof bre) {
                        ((bre)$$0)
                           .q(
                              (double)((float)$$6 * 0.5F),
                              (double)axw.a(this.dD() * (float) (Math.PI / 180.0)),
                              (double)(-axw.b(this.dD() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-axw.a(this.dD() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F),
                           0.1,
                           (double)(axw.b(this.dD() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F)
                        );
                     }

                     this.g(this.dq().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$9) {
                     float $$17 = 1.0F + cxo.a(this) * $$1;

                     for (bre $$19 : this.dN().a(bre.class, $$0.cI().c(1.0, 0.25, 1.0))) {
                        if ($$19 != this && $$19 != $$0 && !this.s($$19) && (!($$19 instanceof cgl) || !((cgl)$$19).z()) && this.g((bql)$$19) < 9.0) {
                           $$19.q(0.4F, (double)axw.a(this.dD() * (float) (Math.PI / 180.0)), (double)(-axw.b(this.dD() * (float) (Math.PI / 180.0))));
                           $$19.a(this.dO().a(this), $$17);
                        }
                     }

                     this.dN().a(null, this.ds(), this.du(), this.dy(), auz.tQ, this.dc(), 1.0F, 1.0F);
                     this.fX();
                  }

                  if ($$0 instanceof aqf && $$0.U) {
                     ((aqf)$$0).d.b(new aeq($$0));
                     $$0.U = false;
                     $$0.g($$15);
                  }

                  if ($$8) {
                     this.dN().a(null, this.ds(), this.du(), this.dy(), auz.tM, this.dc(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$8 && !$$9) {
                     if ($$4) {
                        this.dN().a(null, this.ds(), this.du(), this.dy(), auz.tP, this.dc(), 1.0F, 1.0F);
                     } else {
                        this.dN().a(null, this.ds(), this.du(), this.dy(), auz.tR, this.dc(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.c($$0);
                  }

                  this.A($$0);
                  if ($$0 instanceof bre) {
                     cxo.a((bre)$$0, this);
                  }

                  cxo.b(this, $$0);
                  csd $$20 = this.eV();
                  bql $$21 = $$0;
                  if ($$0 instanceof cfn) {
                     $$21 = ((cfn)$$0).b;
                  }

                  if (!this.dN().B && !$$20.d() && $$21 instanceof bre) {
                     $$20.a((bre)$$21, this);
                     if ($$20.d()) {
                        this.a(bop.a, csd.i);
                     }
                  }

                  if ($$0 instanceof bre) {
                     float $$22 = $$12 - ((bre)$$0).ey();
                     this.a(avj.G, Math.round($$22 * 10.0F));
                     if ($$14 > 0) {
                        $$0.g($$14 * 4);
                     }

                     if (this.dN() instanceof aqe && $$22 > 2.0F) {
                        int $$23 = (int)((double)$$22 * 0.5);
                        ((aqe)this.dN()).a(kw.g, $$0.ds(), $$0.e(0.5), $$0.dy(), $$23, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.C(0.1F);
               } else {
                  this.dN().a(null, this.ds(), this.du(), this.dy(), auz.tO, this.dc(), 1.0F, 1.0F);
                  if ($$13) {
                     $$0.aA();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(bre $$0) {
      this.e($$0);
   }

   public void fW() {
      this.gv().a(csg.vs, 100);
      this.fz();
      this.dN().a(this, (byte)30);
   }

   @Override
   public void b(bql $$0) {
   }

   public void c(bql $$0) {
   }

   public void fX() {
      double $$0 = (double)(-axw.a(this.dD() * (float) (Math.PI / 180.0)));
      double $$1 = (double)axw.b(this.dD() * (float) (Math.PI / 180.0));
      if (this.dN() instanceof aqe) {
         ((aqe)this.dN()).a(kw.ag, this.ds() + $$0, this.e(0.5), this.dy() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fY() {
   }

   @Override
   public void a(bql.c $$0) {
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

   public ckk ga() {
      return this.cx;
   }

   public cki gb() {
      return this.cA;
   }

   @Override
   public boolean fN() {
      return this.cA.d;
   }

   public void a(csd $$0, csd $$1, cnp $$2) {
   }

   public boolean gc() {
      return this.cc != this.cb;
   }

   public Either<ckl.a, ayy> a(im $$0) {
      this.b($$0);
      this.cy = 0;
      return Either.right(ayy.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fK();
      if (this.dN() instanceof aqe && $$1) {
         ((aqe)this.dN()).e();
      }

      this.cy = $$0 ? 0 : 100;
   }

   @Override
   public void fK() {
      this.a(true, true);
   }

   public static Optional<etf> a(aqe $$0, im $$1, float $$2, boolean $$3, boolean $$4) {
      dpy $$5 = $$0.a_($$1);
      dcv $$6 = $$5.b();
      if ($$6 instanceof djd && ($$3 || $$5.c(djd.d) > 0) && djd.a($$0)) {
         Optional<etf> $$7 = djd.a(bqr.bx, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(djd.d, Integer.valueOf($$5.c(djd.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof dco && dco.a($$0)) {
         return dco.a(bqr.bx, $$0, $$1, $$5.c(dco.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dpy $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new etf((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean gd() {
      return this.fJ() && this.cy >= 100;
   }

   public int ge() {
      return this.cy;
   }

   public void a(ws $$0, boolean $$1) {
   }

   public void a(akf $$0) {
      this.b(avj.i.b($$0));
   }

   public void a(akf $$0, int $$1) {
      this.a(avj.i.b($$0), $$1);
   }

   public void b(avg<?> $$0) {
      this.a($$0, 1);
   }

   public void a(avg<?> $$0, int $$1) {
   }

   public void a(avg<?> $$0) {
   }

   public int a(Collection<cwi<?>> $$0) {
      return 0;
   }

   public void a(cwi<?> $$0, List<csd> $$1) {
   }

   public void b(List<akf> $$0) {
   }

   public int b(Collection<cwi<?>> $$0) {
      return 0;
   }

   @Override
   public void fh() {
      super.fh();
      this.a(avj.E);
      if (this.bZ()) {
         this.C(0.2F);
      } else {
         this.C(0.05F);
      }
   }

   @Override
   public void a(etf $$0) {
      if (this.ca() && !this.bP()) {
         double $$1 = this.bJ().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bo || !this.dN().a_(im.a(this.ds(), this.du() + 1.0 - 0.1, this.dy())).u().c()) {
            etf $$3 = this.dq();
            this.g($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cA.b && !this.bP()) {
         double $$4 = this.dq().d;
         super.a($$0);
         etf $$5 = this.dq();
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

   protected boolean h(im $$0) {
      return !this.dN().a_($$0).o(this.dN(), $$0);
   }

   @Override
   public float fl() {
      return (float)this.g(bsl.r);
   }

   @Override
   public boolean a(float $$0, float $$1, bpj $$2) {
      if (this.cA.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(avj.t, (int)Math.round((double)$$0 * 100.0));
         }

         if (this.cw != null) {
            float $$3 = this.cw.floatValue();
            this.cw = null;
            return (double)$$3 < this.du() ? false : super.a($$3 - (float)this.du(), $$1, $$2);
         } else {
            return super.a($$0, $$1, $$2);
         }
      }
   }

   public boolean gf() {
      if (!this.aC() && !this.fC() && !this.bc() && !this.b(bpz.y)) {
         csd $$0 = this.d(bqs.e);
         if ($$0.a(csg.nT) && cqz.j($$0)) {
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
   protected void b(im $$0, dpy $$1) {
      if (this.bc()) {
         this.aR();
         this.b($$1);
      } else {
         im $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dpy $$3 = this.dN().a_($$2);
            if ($$3.a(avo.bo)) {
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
   public bre.a eJ() {
      return new bre.a(auz.uc, auz.tS);
   }

   @Override
   public boolean a(aqe $$0, bre $$1) {
      this.b(avj.g.b($$1.ai()));
      return true;
   }

   @Override
   public void a(dpy $$0, etf $$1) {
      if (!this.cA.b) {
         super.a($$0, $$1);
      }

      this.cw = null;
   }

   public void d(int $$0) {
      this.t($$0);
      this.cr = this.cr + (float)$$0 / (float)this.gj();
      this.cq = axw.a(this.cq + $$0, 0, Integer.MAX_VALUE);

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
   public void a(csd $$0, int $$1) {
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
         this.dN().a(null, this.ds(), this.du(), this.dy(), auz.ub, this.dc(), $$1 * 0.75F, 1.0F);
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

   public Optional<cjr> aa() {
      return Optional.empty();
   }

   public cnd gk() {
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

   public boolean a(im $$0, ir $$1, csd $$2) {
      if (this.cA.e) {
         return true;
      } else {
         im $$3 = $$0.a($$1.g());
         dqc $$4 = new dqc(this.dN(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   public int eh() {
      if (!this.dN().aa().b(czq.d) && !this.N_()) {
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
   protected bql.b aZ() {
      return this.cA.b || this.aC() && this.bW() ? bql.b.a : bql.b.d;
   }

   public void y() {
   }

   @Override
   public ws ad() {
      return ws.b(this.cC.getName());
   }

   public cou gn() {
      return this.ca;
   }

   @Override
   public csd d(bqs $$0) {
      if ($$0 == bqs.a) {
         return this.cx.f();
      } else if ($$0 == bqs.b) {
         return this.cx.k.get(0);
      } else {
         return $$0.a() == bqs.a.b ? this.cx.j.get($$0.b()) : csd.i;
      }
   }

   @Override
   protected boolean a(bqs $$0) {
      return $$0.a() == bqs.a.b;
   }

   @Override
   public void a(bqs $$0, csd $$1) {
      this.e($$1);
      if ($$0 == bqs.a) {
         this.a($$0, this.cx.i.set(this.cx.l, $$1), $$1);
      } else if ($$0 == bqs.b) {
         this.a($$0, this.cx.k.set(0, $$1), $$1);
      } else if ($$0.a() == bqs.a.b) {
         this.a($$0, this.cx.j.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(csd $$0) {
      return this.cx.e($$0);
   }

   @Override
   public Iterable<csd> eY() {
      return Lists.newArrayList(new csd[]{this.eV(), this.eW()});
   }

   @Override
   public Iterable<csd> eX() {
      return this.cx.j;
   }

   @Override
   public boolean c(bqs $$0) {
      return $$0 != bqs.g;
   }

   public boolean h(ty $$0) {
      if (this.bP() || !this.aC() || this.bc() || this.aB) {
         return false;
      } else if (this.gr().g()) {
         this.i($$0);
         this.h = this.dN().Y();
         return true;
      } else if (this.gs().g()) {
         this.j($$0);
         this.h = this.dN().Y();
         return true;
      } else {
         return false;
      }
   }

   protected void go() {
      if (this.h + 20L < this.dN().Y()) {
         this.k(this.gr());
         this.i(new ty());
         this.k(this.gs());
         this.j(new ty());
      }
   }

   private void k(ty $$0) {
      if (!this.dN().B && !$$0.g()) {
         bqr.a($$0, this.dN()).ifPresent($$0x -> {
            if ($$0x instanceof bsa) {
               ((bsa)$$0x).b(this.az);
            }

            $$0x.a_(this.ds(), this.du() + 0.7F, this.dy());
            ((aqe)this.dN()).c($$0x);
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

   public euj gp() {
      return this.dN().L();
   }

   @Override
   public ws O_() {
      xg $$0 = eue.a(this.ch(), this.ad());
      return this.a($$0);
   }

   private xg a(xg $$0) {
      String $$1 = this.fZ().getName();
      return $$0.a($$1x -> $$1x.a(new wq(wq.a.d, "/tell " + $$1 + " ")).a(this.cH()).a($$1));
   }

   @Override
   public String cz() {
      return this.fZ().getName();
   }

   @Override
   protected void B(float $$0) {
      this.an().a(f, $$0);
   }

   @Override
   public float fq() {
      return this.an().a(f);
   }

   public boolean a(ckm $$0) {
      return (this.an().a(bW) & $$0.a()) == $$0.a();
   }

   @Override
   public brv a_(int $$0) {
      if ($$0 == 499) {
         return new brv() {
            @Override
            public csd a() {
               return ckl.this.cc.g();
            }

            @Override
            public boolean a(csd $$0) {
               ckl.this.cc.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new brv() {
               @Override
               public csd a() {
                  return ckl.this.cb.q().a($$1);
               }

               @Override
               public boolean a(csd $$0) {
                  ckl.this.cb.q().a($$1, $$0);
                  ckl.this.cb.a(ckl.this.cx);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.cx.i.size()) {
            return brv.a(this.cx, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.ca.b() ? brv.a(this.ca, $$2) : super.a_($$0);
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
   public bqy fs() {
      return this.ao.a(bX) == 0 ? bqy.a : bqy.b;
   }

   public void a(bqy $$0) {
      this.ao.a(bX, (byte)($$0 == bqy.a ? 0 : 1));
   }

   public ty gr() {
      return this.ao.a(bY);
   }

   protected void i(ty $$0) {
      this.ao.a(bY, $$0);
   }

   public ty gs() {
      return this.ao.a(bZ);
   }

   protected void j(ty $$0) {
      this.ao.a(bZ, $$0);
   }

   public float gt() {
      return (float)(1.0 / this.g(bsl.e) * 20.0);
   }

   public float D(float $$0) {
      return axw.a(((float)this.aU + $$0) / this.gt(), 0.0F, 1.0F);
   }

   public void gu() {
      this.aU = 0;
   }

   public crz gv() {
      return this.cF;
   }

   @Override
   protected float aL() {
      return !this.cA.b && !this.fC() ? super.aL() : 1.0F;
   }

   public float gw() {
      return (float)this.g(bsl.o);
   }

   public boolean gx() {
      return this.cA.d && this.F() >= 2;
   }

   @Override
   public boolean f(csd $$0) {
      bqs $$1 = brg.h($$0);
      return this.d($$1).d();
   }

   @Override
   public bqo e(brp $$0) {
      return c.getOrDefault($$0, bV);
   }

   @Override
   public ImmutableList<brp> fG() {
      return ImmutableList.of(brp.a, brp.f, brp.d);
   }

   @Override
   public csd g(csd $$0) {
      if (!($$0.f() instanceof csu)) {
         return csd.i;
      } else {
         Predicate<csd> $$1 = ((csu)$$0.f()).d();
         csd $$2 = csu.a(this, $$1);
         if (!$$2.d()) {
            return $$2;
         } else {
            $$1 = ((csu)$$0.f()).b();

            for (int $$3 = 0; $$3 < this.cx.b(); $$3++) {
               csd $$4 = this.cx.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cA.d ? new csd(csg.ov) : csd.i;
         }
      }
   }

   @Override
   public csd a(czu $$0, csd $$1) {
      this.gk().a($$1.f(), $$1);
      this.b(avj.c.b($$1.f()));
      $$0.a(null, this.ds(), this.du(), this.dy(), auz.tU, ava.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof aqf) {
         am.A.a((aqf)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dpy $$0) {
      return this.cA.b || super.c($$0);
   }

   @Override
   public etf q(float $$0) {
      double $$1 = 0.22 * (this.fs() == bqy.b ? -1.0 : 1.0);
      float $$2 = axw.i($$0 * 0.5F, this.dF(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = axw.i($$0, this.ba, this.aZ) * (float) (Math.PI / 180.0);
      if (this.fC() || this.fp()) {
         etf $$4 = this.f($$0);
         etf $$5 = this.dq();
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

         return this.l($$0).e(new etf($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cb()) {
         return this.l($$0).e(new etf($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cI().c() - 1.0;
         double $$13 = this.bY() ? -0.2 : 0.07;
         return this.l($$0).e(new etf($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dM() {
      return true;
   }

   public boolean gy() {
      return this.ft() && this.fv().a(csg.qX);
   }

   @Override
   public boolean dL() {
      return false;
   }

   public Optional<iu> gz() {
      return this.cG;
   }

   public void a(Optional<iu> $$0) {
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
      return this.g(bsl.g);
   }

   public double gB() {
      return this.g(bsl.h);
   }

   public boolean b(bql $$0, double $$1) {
      return $$0.dI() ? false : this.a($$0.cI(), $$1);
   }

   public boolean a(eta $$0, double $$1) {
      double $$2 = this.gB() + $$1;
      return $$0.e(this.bv()) < $$2 * $$2;
   }

   public boolean a(im $$0, double $$1) {
      double $$2 = this.gA() + $$1;
      return new eta($$0).e(this.bv()) < $$2 * $$2;
   }

   public static enum a {
      a,
      b(ws.c("block.minecraft.bed.no_sleep")),
      c(ws.c("block.minecraft.bed.too_far_away")),
      d(ws.c("block.minecraft.bed.obstructed")),
      e,
      f(ws.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final ws g;

      private a() {
         this.g = null;
      }

      private a(ws $$0) {
         this.g = $$0;
      }

      @Nullable
      public ws a() {
         return this.g;
      }
   }
}
