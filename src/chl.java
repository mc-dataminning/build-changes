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

public abstract class chl extends boi {
   private static final Logger b = LogUtils.getLogger();
   public static final int bB = 16;
   public static final boc bC = boc.b;
   public static final int bD = 0;
   public static final int bE = 20;
   public static final int bF = 100;
   public static final int bG = 10;
   public static final int bH = 200;
   public static final float bI = 4.5F;
   public static final float bJ = 3.0F;
   public static final float bK = 1.5F;
   public static final float bL = 0.6F;
   public static final float bM = 0.6F;
   public static final float bN = 1.62F;
   public static final enz bO = new enz(0.0, 0.6, 0.0);
   public static final bnt bP = bnt.b(0.6F, 1.8F).b(1.62F).a(bns.a().a(bnr.b, bO));
   private static final Map<bot, bnt> c = ImmutableMap.builder()
      .put(bot.a, bP)
      .put(bot.c, v)
      .put(bot.b, bnt.b(0.6F, 0.6F).b(0.4F))
      .put(bot.d, bnt.b(0.6F, 0.6F).b(0.4F))
      .put(bot.e, bnt.b(0.6F, 0.6F).b(0.4F))
      .put(bot.f, bnt.b(0.6F, 1.5F).b(1.27F).a(bns.a().a(bnr.b, bO)))
      .put(bot.h, bnt.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final aie<Float> d = aih.a(chl.class, aig.d);
   private static final aie<Integer> e = aih.a(chl.class, aig.b);
   protected static final aie<Byte> bQ = aih.a(chl.class, aig.a);
   protected static final aie<Byte> bR = aih.a(chl.class, aig.a);
   protected static final aie<sw> bS = aih.a(chl.class, aig.s);
   protected static final aie<sw> bT = aih.a(chl.class, aig.s);
   private long f;
   private final chk g = new chk(this);
   protected clr bU = new clr();
   public final clg bV;
   public ckf bW;
   protected ckb bX = new ckb();
   protected int bY;
   public float bZ;
   public float ca;
   public int cb;
   public double cc;
   public double cd;
   public double ce;
   public double cf;
   public double cg;
   public double ch;
   private int cq;
   protected boolean ci;
   private final chi cr = new chi();
   public int cj;
   public int ck;
   public float cl;
   protected int cm;
   protected final float cn = 0.02F;
   private int cs;
   private final GameProfile ct;
   private boolean cu;
   private cpd cw = cpd.h;
   private final coz cx = this.k();
   private Optional<ii> cy = Optional.empty();
   @Nullable
   public chz co;
   protected float cp;

   public chl(cvr $$0, hz $$1, float $$2, GameProfile $$3) {
      super(bnw.bw, $$0);
      this.a_($$3.getId());
      this.ct = $$3;
      this.bV = new clg(this.g, !$$0.B, this);
      this.bW = this.bV;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bg = 180.0F;
   }

   public boolean a(cvr $$0, hz $$1, cvo $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == cvo.d) {
         return true;
      } else if (this.gf()) {
         return false;
      } else {
         cpd $$3 = this.eT();
         return $$3.b() || !$$3.b($$0.I_().d(kg.f), new dln($$0, $$1, false));
      }
   }

   public static bpo.a fH() {
      return boi.dQ().a(bpp.c, 1.0).a(bpp.o, 0.1F).a(bpp.e).a(bpp.l).a(bpp.f, 4.5).a(bpp.g, 3.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(d, 0.0F);
      this.am.a(e, 0);
      this.am.a(bQ, (byte)0);
      this.am.a(bR, (byte)bC.a());
      this.am.a(bS, new sw());
      this.am.a(bT, new sw());
   }

   @Override
   public void l() {
      this.ae = this.P_();
      if (this.P_()) {
         this.c(false);
      }

      if (this.cb > 0) {
         this.cb--;
      }

      if (this.fD()) {
         this.cq++;
         if (this.cq > 100) {
            this.cq = 100;
         }

         if (!this.dM().B && this.dM().P()) {
            this.a(false, true);
         }
      } else if (this.cq > 0) {
         this.cq++;
         if (this.cq >= 110) {
            this.cq = 0;
         }
      }

      this.fL();
      super.l();
      if (!this.dM().B && this.bW != null && !this.bW.a(this)) {
         this.r();
         this.bW = this.bV;
      }

      this.w();
      if (!this.dM().B) {
         this.bX.a(this);
         this.a(atv.k);
         this.a(atv.l);
         if (this.bx()) {
            this.a(atv.m);
         }

         if (this.bV()) {
            this.a(atv.o);
         }

         if (!this.fD()) {
            this.a(atv.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = awi.a(this.dr(), -2.9999999E7, 2.9999999E7);
      double $$2 = awi.a(this.dx(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dr() || $$2 != this.dx()) {
         this.a_($$1, this.dt(), $$2);
      }

      this.aP++;
      cpd $$3 = this.eT();
      if (!cpd.a(this.cw, $$3)) {
         if (!cpd.b(this.cw, $$3)) {
            this.gn();
         }

         this.cw = $$3.q();
      }

      this.u();
      this.cx.a();
      this.fM();
   }

   @Override
   protected float fg() {
      return this.fu() ? 15.0F : super.fg();
   }

   public boolean fI() {
      return this.bS();
   }

   protected boolean fJ() {
      return this.bS();
   }

   protected boolean fK() {
      return this.bS();
   }

   protected boolean fL() {
      this.ci = this.a(auf.a);
      return this.ci;
   }

   private void u() {
      cpd $$0 = this.c(bnx.f);
      if ($$0.a(cpg.on) && !this.a(auf.a)) {
         this.b(new bnd(bnf.m, 200, 0, false, false, true));
      }
   }

   protected coz k() {
      return new coz();
   }

   private void w() {
      this.cc = this.cf;
      this.cd = this.cg;
      this.ce = this.ch;
      double $$0 = this.dr() - this.cf;
      double $$1 = this.dt() - this.cg;
      double $$2 = this.dx() - this.ch;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cf = this.dr();
         this.cc = this.cf;
      }

      if ($$2 > 10.0) {
         this.ch = this.dx();
         this.ce = this.ch;
      }

      if ($$1 > 10.0) {
         this.cg = this.dt();
         this.cd = this.cg;
      }

      if ($$0 < -10.0) {
         this.cf = this.dr();
         this.cc = this.cf;
      }

      if ($$2 < -10.0) {
         this.ch = this.dx();
         this.ce = this.ch;
      }

      if ($$1 < -10.0) {
         this.cg = this.dt();
         this.cd = this.cg;
      }

      this.cf += $$0 * 0.25;
      this.ch += $$2 * 0.25;
      this.cg += $$1 * 0.25;
   }

   protected void fM() {
      if (this.h(bot.d)) {
         bot $$0;
         if (this.fw()) {
            $$0 = bot.b;
         } else if (this.fD()) {
            $$0 = bot.c;
         } else if (this.bZ()) {
            $$0 = bot.d;
         } else if (this.fj()) {
            $$0 = bot.e;
         } else if (this.bS() && !this.cr.b) {
            $$0 = bot.f;
         } else {
            $$0 = bot.a;
         }

         bot $$6;
         if (this.P_() || this.bO() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bot.f)) {
            $$6 = bot.f;
         } else {
            $$6 = bot.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bot $$0) {
      return this.dM().a(this, this.a($$0).a(this.dk()).h(1.0E-7));
   }

   @Override
   public int ax() {
      return Math.max(1, this.dM().Z().c(this.cr.a ? cvn.F : cvn.E));
   }

   @Override
   protected atk aN() {
      return atl.tN;
   }

   @Override
   protected atk aO() {
      return atl.tL;
   }

   @Override
   protected atk aP() {
      return atl.tM;
   }

   @Override
   public int bJ() {
      return 10;
   }

   @Override
   public void a(atk $$0, float $$1, float $$2) {
      this.dM().a(this, this.dr(), this.dt(), this.dx(), $$0, this.db(), $$1, $$2);
   }

   public void a(atk $$0, atm $$1, float $$2, float $$3) {
   }

   @Override
   public atm db() {
      return atm.h;
   }

   @Override
   protected int dc() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.x();
      } else if ($$0 == 23) {
         this.cu = false;
      } else if ($$0 == 22) {
         this.cu = true;
      } else if ($$0 == 43) {
         this.a(jz.f);
      } else {
         super.b($$0);
      }
   }

   private void a(jx $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.af.k() * 0.02;
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         this.dM().a($$0, this.d(1.0), this.du() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   protected void r() {
      this.bW = this.bV;
   }

   @Override
   protected void s() {
   }

   @Override
   public void t() {
      if (!this.dM().B && this.fJ() && this.bO()) {
         this.ac();
         this.f(false);
      } else {
         super.t();
         this.bZ = this.ca;
         this.ca = 0.0F;
      }
   }

   @Override
   protected void fi() {
      super.fi();
      this.eR();
      this.aW = this.dC();
   }

   @Override
   public void d_() {
      if (this.bY > 0) {
         this.bY--;
      }

      if (this.dM().aj() == blt.a && this.dM().Z().b(cvn.k)) {
         if (this.ew() < this.eN() && this.ag % 20 == 0) {
            this.c(1.0F);
         }

         if (this.bX.c() && this.ag % 10 == 0) {
            this.bX.a(this.bX.a() + 1);
         }
      }

      this.g.j();
      this.bZ = this.ca;
      super.d_();
      this.w((float)this.g(bpp.o));
      float $$1;
      if (this.aC() && !this.ex() && !this.bZ()) {
         $$1 = Math.min(0.1F, (float)this.dp().h());
      } else {
         $$1 = 0.0F;
      }

      this.ca = this.ca + ($$1 - this.ca) * 0.4F;
      if (this.ew() > 0.0F && !this.P_()) {
         enu $$2;
         if (this.bO() && !this.cZ().dH()) {
            $$2 = this.cH().b(this.cZ().cH()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cH().c(1.0, 0.5, 1.0);
         }

         List<bnq> $$4 = this.dM().a_(this, $$2);
         List<bnq> $$5 = Lists.newArrayList();

         for (bnq $$6 : $$4) {
            if ($$6.ai() == bnw.L) {
               $$5.add($$6);
            } else if (!$$6.dH()) {
               this.c($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.c(ac.a($$5, this.af));
         }
      }

      this.c(this.gk());
      this.c(this.gl());
      if (!this.dM().B && (this.aa > 0.5F || this.aZ()) || this.cr.b || this.fD() || this.az) {
         this.gh();
      }
   }

   private void c(@Nullable sw $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dM().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bnw.a($$1).filter($$0x -> $$0x == bnw.av).ifPresent($$0x -> {
            if (!can.a(this.dM(), this)) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), can.a(this.dM(), this.dM().z), this.db(), 1.0F, can.a(this.dM().z));
            }
         });
      }
   }

   private void c(bnq $$0) {
      $$0.b_(this);
   }

   public int fN() {
      return this.am.b(e);
   }

   public void s(int $$0) {
      this.am.b(e, $$0);
   }

   public void t(int $$0) {
      int $$1 = this.fN();
      this.am.b(e, $$1 + $$0);
   }

   public void u(int $$0) {
      this.by = $$0;
      if (!this.dM().B) {
         this.gh();
         this.c(4, true);
      }
   }

   @Override
   public void a(bmp $$0) {
      super.a($$0);
      this.ar();
      if (!this.P_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-awi.b((this.eF() + this.dC()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-awi.a((this.eF() + this.dC()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(atv.N);
      this.a(atv.i.b(atv.m));
      this.a(atv.i.b(atv.n));
      this.aA();
      this.a_(false);
      this.a(Optional.of(ii.a(this.dM().ad(), this.dm())));
   }

   @Override
   protected void ez() {
      super.ez();
      if (!this.dM().Z().b(cvn.d)) {
         this.fO();
         this.g.k();
      }
   }

   protected void fO() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cpd $$1 = this.g.a($$0);
         if (!$$1.b() && ctn.e($$1)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected atk d(bmp $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected atk n_() {
      return atl.tD;
   }

   @Nullable
   public cdw a(cpd $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cdw a(cpd $$0, boolean $$1, boolean $$2) {
      if ($$0.b()) {
         return null;
      } else {
         if (this.dM().B) {
            this.a(blv.a);
         }

         double $$3 = this.dv() - 0.3F;
         cdw $$4 = new cdw(this.dM(), this.dr(), $$3, this.dx(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.a(this);
         }

         if ($$1) {
            float $$5 = this.af.i() * 0.5F;
            float $$6 = this.af.i() * (float) (Math.PI * 2);
            $$4.o((double)(-awi.a($$6) * $$5), 0.2F, (double)(awi.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = awi.a(this.dE() * (float) (Math.PI / 180.0));
            float $$9 = awi.b(this.dE() * (float) (Math.PI / 180.0));
            float $$10 = awi.a(this.dC() * (float) (Math.PI / 180.0));
            float $$11 = awi.b(this.dC() * (float) (Math.PI / 180.0));
            float $$12 = this.af.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.af.i();
            $$4.o(
               (double)(-$$10 * $$9 * 0.3F) + Math.cos((double)$$12) * (double)$$13,
               (double)(-$$8 * 0.3F + 0.1F + (this.af.i() - this.af.i()) * 0.1F),
               (double)($$11 * $$9 * 0.3F) + Math.sin((double)$$12) * (double)$$13
            );
         }

         return $$4;
      }
   }

   public float d(dlj $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = ctn.g(this);
         cpd $$3 = this.eT();
         if ($$2 > 0 && !$$3.b()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bne.a(this)) {
         $$1 *= 1.0F + (float)(bne.b(this) + 1) * 0.2F;
      }

      if (this.a(bnf.d)) {
         $$1 *= switch (this.c(bnf.d).d()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      if (this.a(auf.a) && !ctn.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aC()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dlj $$0) {
      return !$$0.y() || this.g.f().b($$0);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.a_(this.ct.getId());
      tc $$1 = $$0.c("Inventory", 10);
      this.g.b($$1);
      this.g.l = $$0.h("SelectedItemSlot");
      this.cq = $$0.g("SleepTimer");
      this.cl = $$0.j("XpP");
      this.cj = $$0.h("XpLevel");
      this.ck = $$0.h("XpTotal");
      this.cm = $$0.h("XpSeed");
      if (this.cm == 0) {
         this.cm = this.af.f();
      }

      this.s($$0.h("Score"));
      this.bX.a($$0);
      this.cr.b($$0);
      this.f(bpp.o).a((double)this.cr.b());
      if ($$0.b("EnderItems", 9)) {
         this.bU.a($$0.c("EnderItems", 10));
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(ii.a.parse(tk.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      tl.g($$0);
      $$0.a("Inventory", this.g.a(new tc()));
      $$0.a("SelectedItemSlot", this.g.l);
      $$0.a("SleepTimer", (short)this.cq);
      $$0.a("XpP", this.cl);
      $$0.a("XpLevel", this.cj);
      $$0.a("XpTotal", this.ck);
      $$0.a("XpSeed", this.cm);
      $$0.a("Score", this.fN());
      this.bX.b($$0);
      this.cr.a($$0);
      $$0.a("EnderItems", this.bU.g());
      if (!this.gk().g()) {
         $$0.a("ShoulderEntityLeft", this.gk());
      }

      if (!this.gl().g()) {
         $$0.a("ShoulderEntityRight", this.gl());
      }

      this.gs().flatMap($$0x -> ii.a.encodeStart(tk.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
   }

   @Override
   public boolean b(bmp $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(auc.o)) {
         return !this.dM().Z().b(cvn.G);
      } else if ($$0.a(auc.n)) {
         return !this.dM().Z().b(cvn.H);
      } else if ($$0.a(auc.j)) {
         return !this.dM().Z().b(cvn.I);
      } else {
         return $$0.a(auc.p) ? !this.dM().Z().b(cvn.J) : false;
      }
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cr.a && !$$0.a(auc.e)) {
         return false;
      } else {
         this.bb = 0;
         if (this.ex()) {
            return false;
         } else {
            if (!this.dM().B) {
               this.gh();
            }

            if ($$0.f()) {
               if (this.dM().aj() == blt.a) {
                  $$1 = 0.0F;
               }

               if (this.dM().aj() == blt.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dM().aj() == blt.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(boi $$0) {
      super.d($$0);
      if ($$0.fG()) {
         this.fP();
      }
   }

   @Override
   public boolean ep() {
      return !this.fU().a && super.ep();
   }

   public boolean a(chl $$0) {
      epf $$1 = this.cg();
      epf $$2 = $$0.cg();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bmp $$0, float $$1) {
      this.g.a($$0, $$1, chk.g);
   }

   @Override
   protected void c(bmp $$0, float $$1) {
      this.g.a($$0, $$1, chk.h);
   }

   @Override
   protected void u(float $$0) {
      if (this.bv.a(cpg.vo)) {
         if (!this.dM().B) {
            this.b(atv.c.b(this.bv.d()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + awi.d($$0);
            blv $$2 = this.fo();
            this.bv.a($$1, this, d($$2));
            if (this.bv.b()) {
               if ($$2 == blv.a) {
                  this.a(bnx.a, cpd.h);
               } else {
                  this.a(bnx.b, cpd.h);
               }

               this.bv = cpd.h;
               this.a(atl.vX, 0.8F, 0.8F + this.dM().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bmp $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fk(), 0.0F);
         this.y(this.fk() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(atv.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.A($$0.a());
            this.eL().a($$0, var7);
            this.t(this.ew() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(atv.J, Math.round(var7 * 10.0F));
            }

            this.b(dpw.o);
         }
      }
   }

   @Override
   protected boolean dU() {
      return !this.cr.b && super.dU();
   }

   public boolean Y() {
      return false;
   }

   public void a(dkg $$0, boolean $$1) {
   }

   public void a(cus $$0) {
   }

   public void a(djh $$0) {
   }

   public void a(dkl $$0) {
   }

   public void a(djx $$0) {
   }

   public void a(cbz $$0, blp $$1) {
   }

   public OptionalInt a(@Nullable bma $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, cuq $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cpd $$0, blv $$1) {
   }

   public blw a(bnq $$0, blv $$1) {
      if (this.P_()) {
         if ($$0 instanceof bma) {
            this.a((bma)$$0);
         }

         return blw.d;
      } else {
         cpd $$2 = this.b($$1);
         cpd $$3 = $$2.q();
         blw $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cr.d && $$2 == this.b($$1) && $$2.M() < $$3.M()) {
               $$2.f($$3.M());
            }

            return $$4;
         } else {
            if (!$$2.b() && $$0 instanceof boi) {
               if (this.cr.d) {
                  $$2 = $$3;
               }

               blw $$5 = $$2.a(this, (boi)$$0, $$1);
               if ($$5.a()) {
                  this.dM().a(dpw.r, $$0.dk(), dpw.a.a(this));
                  if ($$2.b() && !this.cr.d) {
                     this.a($$1, cpd.h);
                  }

                  return $$5;
               }
            }

            return blw.d;
         }
      }
   }

   @Override
   public void bC() {
      super.bC();
      this.I = 0;
   }

   @Override
   protected boolean eY() {
      return super.eY() || this.fD();
   }

   @Override
   public boolean eb() {
      return !this.cr.b;
   }

   @Override
   protected enz a(enz $$0, bon $$1) {
      if (!this.cr.b && $$0.d <= 0.0 && ($$1 == bon.a || $$1 == bon.b) && this.fK() && this.A()) {
         double $$2 = $$0.c;
         double $$3 = $$0.e;
         double $$4 = 0.05;

         while ($$2 != 0.0 && this.dM().a(this, this.cH().d($$2, (double)(-this.dG()), 0.0))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }
         }

         while ($$3 != 0.0 && this.dM().a(this, this.cH().d(0.0, (double)(-this.dG()), $$3))) {
            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         while ($$2 != 0.0 && $$3 != 0.0 && this.dM().a(this, this.cH().d($$2, (double)(-this.dG()), $$3))) {
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

         $$0 = new enz($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean A() {
      return this.aC() || this.aa < this.dG() && !this.dM().a(this, this.cH().d(0.0, (double)(this.aa - this.dG()), 0.0));
   }

   public void d(bnq $$0) {
      if ($$0.cq()) {
         if (!$$0.t(this)) {
            float $$1 = (float)this.g(bpp.c);
            float $$2 = ctn.a(this.eT(), $$0.ai());
            float $$3 = this.B(0.5F);
            $$1 *= 0.2F + $$3 * $$3 * 0.8F;
            $$2 *= $$3;
            this.gn();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$4 = $$3 > 0.9F;
               boolean $$5 = false;
               int $$6 = 0;
               $$6 += ctn.c(this);
               if (this.bY() && $$4) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), atl.tv, this.db(), 1.0F, 1.0F);
                  $$6++;
                  $$5 = true;
               }

               boolean $$7 = $$4 && this.aa > 0.0F && !this.aC() && !this.e_() && !this.aZ() && !this.a(bnf.o) && !this.bO() && $$0 instanceof boi;
               $$7 = $$7 && !this.bY();
               if ($$7) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$8 = false;
               double $$9 = (double)(this.X - this.W);
               if ($$4 && !$$7 && !$$5 && this.aC() && $$9 < (double)this.ff()) {
                  cpd $$10 = this.b(blv.a);
                  if ($$10.d() instanceof cqo) {
                     $$8 = true;
                  }
               }

               float $$11 = 0.0F;
               boolean $$12 = false;
               int $$13 = ctn.d(this);
               if ($$0 instanceof boi) {
                  $$11 = ((boi)$$0).ew();
                  if ($$13 > 0 && !$$0.bN()) {
                     $$12 = true;
                     $$0.g(1);
                  }
               }

               enz $$14 = $$0.dp();
               boolean $$15 = $$0.a(this.dN().a(this), $$1);
               if ($$15) {
                  if ($$6 > 0) {
                     if ($$0 instanceof boi) {
                        ((boi)$$0)
                           .q(
                              (double)((float)$$6 * 0.5F),
                              (double)awi.a(this.dC() * (float) (Math.PI / 180.0)),
                              (double)(-awi.b(this.dC() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-awi.a(this.dC() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F),
                           0.1,
                           (double)(awi.b(this.dC() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F)
                        );
                     }

                     this.g(this.dp().d(0.6, 1.0, 0.6));
                     this.g(false);
                  }

                  if ($$8) {
                     float $$16 = 1.0F + ctn.a(this) * $$1;

                     for (boi $$18 : this.dM().a(boi.class, $$0.cH().c(1.0, 0.25, 1.0))) {
                        if ($$18 != this && $$18 != $$0 && !this.r($$18) && (!($$18 instanceof cdm) || !((cdm)$$18).B()) && this.f($$18) < 9.0) {
                           $$18.q(0.4F, (double)awi.a(this.dC() * (float) (Math.PI / 180.0)), (double)(-awi.b(this.dC() * (float) (Math.PI / 180.0))));
                           $$18.a(this.dN().a(this), $$16);
                        }
                     }

                     this.dM().a(null, this.dr(), this.dt(), this.dx(), atl.ty, this.db(), 1.0F, 1.0F);
                     this.fQ();
                  }

                  if ($$0 instanceof aox && $$0.S) {
                     ((aox)$$0).d.b(new adl($$0));
                     $$0.S = false;
                     $$0.g($$14);
                  }

                  if ($$7) {
                     this.dM().a(null, this.dr(), this.dt(), this.dx(), atl.tu, this.db(), 1.0F, 1.0F);
                     this.a($$0);
                  }

                  if (!$$7 && !$$8) {
                     if ($$4) {
                        this.dM().a(null, this.dr(), this.dt(), this.dx(), atl.tx, this.db(), 1.0F, 1.0F);
                     } else {
                        this.dM().a(null, this.dr(), this.dt(), this.dx(), atl.tz, this.db(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.b($$0);
                  }

                  this.z($$0);
                  if ($$0 instanceof boi) {
                     ctn.a((boi)$$0, this);
                  }

                  ctn.b(this, $$0);
                  cpd $$19 = this.eT();
                  bnq $$20 = $$0;
                  if ($$0 instanceof cco) {
                     $$20 = ((cco)$$0).b;
                  }

                  if (!this.dM().B && !$$19.b() && $$20 instanceof boi) {
                     $$19.a((boi)$$20, this);
                     if ($$19.b()) {
                        this.a(blv.a, cpd.h);
                     }
                  }

                  if ($$0 instanceof boi) {
                     float $$21 = $$11 - ((boi)$$0).ew();
                     this.a(atv.G, Math.round($$21 * 10.0F));
                     if ($$13 > 0) {
                        $$0.g($$13 * 4);
                     }

                     if (this.dM() instanceof aow && $$21 > 2.0F) {
                        int $$22 = (int)((double)$$21 * 0.5);
                        ((aow)this.dM()).a(jz.h, $$0.dr(), $$0.e(0.5), $$0.dx(), $$22, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.A(0.1F);
               } else {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), atl.tw, this.db(), 1.0F, 1.0F);
                  if ($$12) {
                     $$0.aA();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(boi $$0) {
      this.d((bnq)$$0);
   }

   public void fP() {
      this.go().a(cpg.vo, 100);
      this.ft();
      this.dM().a(this, (byte)30);
   }

   @Override
   public void a(bnq $$0) {
   }

   public void b(bnq $$0) {
   }

   public void fQ() {
      double $$0 = (double)(-awi.a(this.dC() * (float) (Math.PI / 180.0)));
      double $$1 = (double)awi.b(this.dC() * (float) (Math.PI / 180.0));
      if (this.dM() instanceof aow) {
         ((aow)this.dM()).a(jz.ag, this.dr() + $$0, this.e(0.5), this.dx() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fR() {
   }

   @Override
   public void a(bnq.c $$0) {
      super.a($$0);
      this.bV.b(this);
      if (this.bW != null && this.fV()) {
         this.s();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile fS() {
      return this.ct;
   }

   public chk fT() {
      return this.g;
   }

   public chi fU() {
      return this.cr;
   }

   public void a(cpd $$0, cpd $$1, ckn $$2) {
   }

   public boolean fV() {
      return this.bW != this.bV;
   }

   public Either<chl.a, axk> a(hz $$0) {
      this.b($$0);
      this.cq = 0;
      return Either.right(axk.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fE();
      if (this.dM() instanceof aow && $$1) {
         ((aow)this.dM()).e();
      }

      this.cq = $$0 ? 0 : 100;
   }

   @Override
   public void fE() {
      this.a(true, true);
   }

   public static Optional<enz> a(aow $$0, hz $$1, float $$2, boolean $$3, boolean $$4) {
      dlj $$5 = $$0.a_($$1);
      cys $$6 = $$5.b();
      if ($$6 instanceof dez && ($$3 || $$5.c(dez.d) > 0) && dez.a($$0)) {
         Optional<enz> $$7 = dez.a(bnw.bw, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dez.d, Integer.valueOf($$5.c(dez.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof cyl && cyl.a($$0)) {
         return cyl.a(bnw.bw, $$0, $$1, $$5.c(cyl.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dlj $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new enz((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean fW() {
      return this.fD() && this.cq >= 100;
   }

   public int fX() {
      return this.cq;
   }

   public void a(vq $$0, boolean $$1) {
   }

   public void a(aiy $$0) {
      this.b(atv.i.b($$0));
   }

   public void a(aiy $$0, int $$1) {
      this.a(atv.i.b($$0), $$1);
   }

   public void b(ats<?> $$0) {
      this.a($$0, 1);
   }

   public void a(ats<?> $$0, int $$1) {
   }

   public void a(ats<?> $$0) {
   }

   public int a(Collection<csh<?>> $$0) {
      return 0;
   }

   public void a(csh<?> $$0, List<cpd> $$1) {
   }

   public void a(List<aiy> $$0) {
   }

   public int b(Collection<csh<?>> $$0) {
      return 0;
   }

   @Override
   public void fb() {
      super.fb();
      this.a(atv.E);
      if (this.bY()) {
         this.A(0.2F);
      } else {
         this.A(0.05F);
      }
   }

   @Override
   public void a(enz $$0) {
      if (this.bZ() && !this.bO()) {
         double $$1 = this.bF().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bj || !this.dM().a_(hz.a(this.dr(), this.dt() + 1.0 - 0.1, this.dx())).u().c()) {
            enz $$3 = this.dp();
            this.g($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cr.b && !this.bO()) {
         double $$4 = this.dp().d;
         super.a($$0);
         enz $$5 = this.dp();
         this.o($$5.c, $$4 * 0.6, $$5.e);
         this.n();
         this.b(7, false);
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bf() {
      if (this.cr.b) {
         this.h(false);
      } else {
         super.bf();
      }
   }

   protected boolean h(hz $$0) {
      return !this.dM().a_($$0).o(this.dM(), $$0);
   }

   @Override
   public float ff() {
      return (float)this.g(bpp.o);
   }

   @Override
   public boolean a(float $$0, float $$1, bmp $$2) {
      if (this.cr.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(atv.t, (int)Math.round((double)$$0 * 100.0));
         }

         return super.a($$0, $$1, $$2);
      }
   }

   public boolean fY() {
      if (!this.aC() && !this.fw() && !this.aZ() && !this.a(bnf.y)) {
         cpd $$0 = this.c(bnx.e);
         if ($$0.a(cpg.nS) && cnx.d($$0)) {
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
   protected void b(hz $$0, dlj $$1) {
      if (this.aZ()) {
         this.aR();
         this.b($$1);
      } else {
         hz $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dlj $$3 = this.dM().a_($$2);
            if ($$3.a(aua.bn)) {
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
   public boi.a eH() {
      return new boi.a(atl.tK, atl.tA);
   }

   @Override
   public boolean a(aow $$0, boi $$1) {
      this.b(atv.g.b($$1.ai()));
      return true;
   }

   @Override
   public void a(dlj $$0, enz $$1) {
      if (!this.cr.b) {
         super.a($$0, $$1);
      }
   }

   public void d(int $$0) {
      this.t($$0);
      this.cl = this.cl + (float)$$0 / (float)this.gc();
      this.ck = awi.a(this.ck + $$0, 0, Integer.MAX_VALUE);

      while (this.cl < 0.0F) {
         float $$1 = this.cl * (float)this.gc();
         if (this.cj > 0) {
            this.c(-1);
            this.cl = 1.0F + $$1 / (float)this.gc();
         } else {
            this.c(-1);
            this.cl = 0.0F;
         }
      }

      while (this.cl >= 1.0F) {
         this.cl = (this.cl - 1.0F) * (float)this.gc();
         this.c(1);
         this.cl = this.cl / (float)this.gc();
      }
   }

   public int gb() {
      return this.cm;
   }

   @Override
   public void a(cpd $$0, int $$1) {
      this.cj -= $$1;
      if (this.cj < 0) {
         this.cj = 0;
         this.cl = 0.0F;
         this.ck = 0;
      }

      this.cm = this.af.f();
   }

   public void c(int $$0) {
      this.cj += $$0;
      if (this.cj < 0) {
         this.cj = 0;
         this.cl = 0.0F;
         this.ck = 0;
      }

      if ($$0 > 0 && this.cj % 5 == 0 && (float)this.cs < (float)this.ag - 100.0F) {
         float $$1 = this.cj > 30 ? 1.0F : (float)this.cj / 30.0F;
         this.dM().a(null, this.dr(), this.dt(), this.dx(), atl.tJ, this.db(), $$1 * 0.75F, 1.0F);
         this.cs = this.ag;
      }
   }

   public int gc() {
      if (this.cj >= 30) {
         return 112 + (this.cj - 30) * 9;
      } else {
         return this.cj >= 15 ? 37 + (this.cj - 15) * 5 : 7 + this.cj * 2;
      }
   }

   public void A(float $$0) {
      if (!this.cr.a) {
         if (!this.dM().B) {
            this.bX.a($$0);
         }
      }
   }

   public Optional<cgr> aa() {
      return Optional.empty();
   }

   public ckb gd() {
      return this.bX;
   }

   public boolean s(boolean $$0) {
      return this.cr.a || $$0 || this.bX.c();
   }

   public boolean ge() {
      return this.ew() > 0.0F && this.ew() < this.eN();
   }

   public boolean gf() {
      return this.cr.e;
   }

   public boolean a(hz $$0, ie $$1, cpd $$2) {
      if (this.cr.e) {
         return true;
      } else {
         hz $$3 = $$0.a($$1.g());
         dln $$4 = new dln(this.dM(), $$3, false);
         return $$2.a(this.dM().I_().d(kg.f), $$4);
      }
   }

   @Override
   public int ef() {
      if (!this.dM().Z().b(cvn.d) && !this.P_()) {
         int $$0 = this.cj * 7;
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
   protected bnq.b aW() {
      return this.cr.b || this.aC() && this.bV() ? bnq.b.a : bnq.b.d;
   }

   @Override
   public void y() {
   }

   @Override
   public vq ad() {
      return vq.b(this.ct.getName());
   }

   public clr gg() {
      return this.bU;
   }

   @Override
   public cpd c(bnx $$0) {
      if ($$0 == bnx.a) {
         return this.g.f();
      } else if ($$0 == bnx.b) {
         return this.g.k.get(0);
      } else {
         return $$0.a() == bnx.a.b ? this.g.j.get($$0.b()) : cpd.h;
      }
   }

   @Override
   protected boolean a(bnx $$0) {
      return $$0.a() == bnx.a.b;
   }

   @Override
   public void a(bnx $$0, cpd $$1) {
      this.e($$1);
      if ($$0 == bnx.a) {
         this.a($$0, this.g.i.set(this.g.l, $$1), $$1);
      } else if ($$0 == bnx.b) {
         this.a($$0, this.g.k.set(0, $$1), $$1);
      } else if ($$0.a() == bnx.a.b) {
         this.a($$0, this.g.j.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cpd $$0) {
      return this.g.e($$0);
   }

   @Override
   public Iterable<cpd> bK() {
      return Lists.newArrayList(new cpd[]{this.eT(), this.eU()});
   }

   @Override
   public Iterable<cpd> bL() {
      return this.g.j;
   }

   public boolean h(sw $$0) {
      if (this.bO() || !this.aC() || this.aZ() || this.az) {
         return false;
      } else if (this.gk().g()) {
         this.i($$0);
         this.f = this.dM().X();
         return true;
      } else if (this.gl().g()) {
         this.j($$0);
         this.f = this.dM().X();
         return true;
      } else {
         return false;
      }
   }

   protected void gh() {
      if (this.f + 20L < this.dM().X()) {
         this.k(this.gk());
         this.i(new sw());
         this.k(this.gl());
         this.j(new sw());
      }
   }

   private void k(sw $$0) {
      if (!this.dM().B && !$$0.g()) {
         bnw.a($$0, this.dM()).ifPresent($$0x -> {
            if ($$0x instanceof bpe) {
               ((bpe)$$0x).b(this.ax);
            }

            $$0x.a_(this.dr(), this.dt() + 0.7F, this.dx());
            ((aow)this.dM()).c($$0x);
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
      return !this.cr.b && !this.P_() && super.bZ();
   }

   public abstract boolean f();

   @Override
   public boolean cz() {
      return !this.cr.b;
   }

   public epd gi() {
      return this.dM().K();
   }

   @Override
   public vq Q_() {
      we $$0 = eoy.a(this.cg(), this.ad());
      return this.a($$0);
   }

   private we a(we $$0) {
      String $$1 = this.fS().getName();
      return $$0.a($$1x -> $$1x.a(new vo(vo.a.d, "/tell " + $$1 + " ")).a(this.cG()).a($$1));
   }

   @Override
   public String cy() {
      return this.fS().getName();
   }

   @Override
   protected void z(float $$0) {
      this.an().b(d, $$0);
   }

   @Override
   public float fk() {
      return this.an().b(d);
   }

   public boolean a(chm $$0) {
      return (this.an().b(bQ) & $$0.a()) == $$0.a();
   }

   @Override
   public boz a_(int $$0) {
      if ($$0 >= 0 && $$0 < this.g.i.size()) {
         return boz.a(this.g, $$0);
      } else {
         int $$1 = $$0 - 200;
         return $$1 >= 0 && $$1 < this.bU.b() ? boz.a(this.bU, $$1) : super.a_($$0);
      }
   }

   public boolean gj() {
      return this.cu;
   }

   public void t(boolean $$0) {
      this.cu = $$0;
   }

   @Override
   public void i(int $$0) {
      super.i(this.cr.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public boc fm() {
      return this.am.b(bR) == 0 ? boc.a : boc.b;
   }

   public void a(boc $$0) {
      this.am.b(bR, (byte)($$0 == boc.a ? 0 : 1));
   }

   public sw gk() {
      return this.am.b(bS);
   }

   protected void i(sw $$0) {
      this.am.b(bS, $$0);
   }

   public sw gl() {
      return this.am.b(bT);
   }

   protected void j(sw $$0) {
      this.am.b(bT, $$0);
   }

   public float gm() {
      return (float)(1.0 / this.g(bpp.e) * 20.0);
   }

   public float B(float $$0) {
      return awi.a(((float)this.aP + $$0) / this.gm(), 0.0F, 1.0F);
   }

   public void gn() {
      this.aP = 0;
   }

   public coz go() {
      return this.cx;
   }

   @Override
   protected float aL() {
      return !this.cr.b && !this.fw() ? super.aL() : 1.0F;
   }

   public float gp() {
      return (float)this.g(bpp.l);
   }

   public boolean gq() {
      return this.cr.d && this.F() >= 2;
   }

   @Override
   public boolean f(cpd $$0) {
      bnx $$1 = bok.h($$0);
      return this.c($$1).b();
   }

   @Override
   public bnt e(bot $$0) {
      return c.getOrDefault($$0, bP);
   }

   @Override
   public ImmutableList<bot> fA() {
      return ImmutableList.of(bot.a, bot.f, bot.d);
   }

   @Override
   public cpd g(cpd $$0) {
      if (!($$0.d() instanceof cpt)) {
         return cpd.h;
      } else {
         Predicate<cpd> $$1 = ((cpt)$$0.d()).e();
         cpd $$2 = cpt.a(this, $$1);
         if (!$$2.b()) {
            return $$2;
         } else {
            $$1 = ((cpt)$$0.d()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cpd $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cr.d ? new cpd(cpg.ou) : cpd.h;
         }
      }
   }

   @Override
   public cpd a(cvr $$0, cpd $$1) {
      this.gd().a($$1.d(), $$1);
      this.b(atv.c.b($$1.d()));
      $$0.a(null, this.dr(), this.dt(), this.dx(), atl.tC, atm.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof aox) {
         am.A.a((aox)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dlj $$0) {
      return this.cr.b || super.c($$0);
   }

   @Override
   public enz q(float $$0) {
      double $$1 = 0.22 * (this.fm() == boc.b ? -1.0 : 1.0);
      float $$2 = awi.i($$0 * 0.5F, this.dE(), this.N) * (float) (Math.PI / 180.0);
      float $$3 = awi.i($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      if (this.fw() || this.fj()) {
         enz $$4 = this.f($$0);
         enz $$5 = this.dp();
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

         return this.l($$0).e(new enz($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.ca()) {
         return this.l($$0).e(new enz($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cH().c() - 1.0;
         double $$13 = this.bX() ? -0.2 : 0.07;
         return this.l($$0).e(new enz($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dL() {
      return true;
   }

   public boolean gr() {
      return this.fn() && this.fp().a(cpg.qW);
   }

   @Override
   public boolean dK() {
      return false;
   }

   public Optional<ii> gs() {
      return this.cy;
   }

   public void a(Optional<ii> $$0) {
      this.cy = $$0;
   }

   @Override
   public float eF() {
      return this.cp;
   }

   @Override
   public void m(float $$0) {
      super.m($$0);
      this.cp = $$0;
   }

   @Override
   public boolean dF() {
      return true;
   }

   @Override
   protected float fe() {
      if (this.cr.b && !this.bO()) {
         return this.bY() ? this.cr.a() * 2.0F : this.cr.a();
      } else {
         return this.bY() ? 0.025999999F : 0.02F;
      }
   }

   public static boolean c(String $$0) {
      return $$0.length() > 16 ? false : $$0.chars().filter($$0x -> $$0x <= 32 || $$0x >= 127).findAny().isEmpty();
   }

   public double gt() {
      return this.g(bpp.f);
   }

   public double gu() {
      return this.g(bpp.g);
   }

   public boolean b(bnq $$0, double $$1) {
      return $$0.dH() ? false : this.a($$0.cH(), $$1);
   }

   public boolean a(enu $$0, double $$1) {
      double $$2 = this.gu() + $$1;
      return $$0.e(this.br()) < $$2 * $$2;
   }

   public boolean a(hz $$0, double $$1) {
      double $$2 = this.gt() + $$1;
      return new enu($$0).e(this.br()) < $$2 * $$2;
   }

   public static enum a {
      a,
      b(vq.c("block.minecraft.bed.no_sleep")),
      c(vq.c("block.minecraft.bed.too_far_away")),
      d(vq.c("block.minecraft.bed.obstructed")),
      e,
      f(vq.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final vq g;

      private a() {
         this.g = null;
      }

      private a(vq $$0) {
         this.g = $$0;
      }

      @Nullable
      public vq a() {
         return this.g;
      }
   }
}
