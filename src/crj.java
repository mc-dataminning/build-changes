import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.math.IntMath;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class crj extends bxj {
   public static final bxa bu = bxa.b;
   public static final int bv = 0;
   public static final int bw = 20;
   public static final int bx = 100;
   public static final int by = 10;
   public static final int bz = 200;
   public static final int bA = 499;
   public static final int bB = 500;
   public static final float bC = 4.5F;
   public static final float bD = 3.0F;
   public static final float bE = 1.5F;
   public static final float bF = 0.6F;
   public static final float bG = 0.6F;
   public static final float bH = 1.62F;
   private static final int a = 40;
   public static final fex bI = new fex(0.0, 0.6, 0.0);
   public static final bwl bJ = bwl.b(0.6F, 1.8F).b(1.62F).a(bwk.a().a(bwj.b, bI));
   private static final Map<bxv, bwl> b = ImmutableMap.builder()
      .put(bxv.a, bJ)
      .put(bxv.c, aD)
      .put(bxv.b, bwl.b(0.6F, 0.6F).b(0.4F))
      .put(bxv.d, bwl.b(0.6F, 0.6F).b(0.4F))
      .put(bxv.e, bwl.b(0.6F, 0.6F).b(0.4F))
      .put(bxv.f, bwl.b(0.6F, 1.5F).b(1.27F).a(bwk.a().a(bwj.b, bI)))
      .put(bxv.h, bwl.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final akj<Float> c = akn.a(crj.class, akl.d);
   private static final akj<Integer> d = akn.a(crj.class, akl.b);
   protected static final akj<Byte> bK = akn.a(crj.class, akl.a);
   protected static final akj<Byte> bL = akn.a(crj.class, akl.a);
   protected static final akj<tz> bM = akn.a(crj.class, akl.t);
   protected static final akj<tz> bN = akn.a(crj.class, akl.t);
   public static final int bO = 60;
   private long e;
   final cri f;
   protected cwq bP = new cwq();
   public final cwf bQ;
   public cvc bR;
   protected cuy bS = new cuy();
   protected int bT;
   private boolean g = false;
   protected int bU = 60;
   public float bV;
   public float bW;
   public int bX;
   public double bY;
   public double bZ;
   public double ca;
   public double cb;
   public double cc;
   public double cd;
   private int h;
   protected boolean ce;
   private final crf i = new crf();
   public int cf;
   public int cg;
   public float ch;
   protected int ci;
   protected final float cj = 0.02F;
   private int j;
   private final GameProfile k;
   private boolean cq;
   private czk cr = czk.k;
   private final czh cs = this.g();
   private Optional<je> ct = Optional.empty();
   @Nullable
   public csa ck;
   protected float cl;
   @Nullable
   public fex cm;
   @Nullable
   public bwi cn;
   private boolean cu;
   private int cv;

   public crj(djh $$0, iv $$1, float $$2, GameProfile $$3) {
      super(bwr.bS, $$0);
      this.a_($$3.getId());
      this.k = $$3;
      this.f = new cri(this, this.bt);
      this.bQ = new cwf(this.f, !$$0.C, this);
      this.bR = this.bQ;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
   }

   @Override
   protected bwm ea() {
      return new crk(this);
   }

   public boolean a(djh $$0, iv $$1, dje $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dje.d) {
         return true;
      } else if (this.gv()) {
         return false;
      } else {
         czk $$3 = this.fa();
         return $$3.f() || !$$3.b(new eas($$0, $$1, false));
      }
   }

   public static byo.a fW() {
      return bxj.ed().a(byp.c, 1.0).a(byp.v, 0.1F).a(byp.e).a(byp.q).a(byp.g, 4.5).a(byp.j, 3.0).a(byp.f).a(byp.C).a(byp.z).a(byp.t).a(byp.D);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, 0.0F);
      $$0.a(d, 0);
      $$0.a(bK, (byte)0);
      $$0.a(bL, (byte)bu.b());
      $$0.a(bM, new tz());
      $$0.a(bN, new tz());
   }

   @Override
   public void h() {
      this.ad = this.V_();
      if (this.V_() || this.bX()) {
         this.d(false);
      }

      if (this.bX > 0) {
         this.bX--;
      }

      if (this.fQ()) {
         this.h++;
         if (this.h > 100) {
            this.h = 100;
         }

         if (!this.dU().C && this.dU().V()) {
            this.a(false, true);
         }
      } else if (this.h > 0) {
         this.h++;
         if (this.h >= 110) {
            this.h = 0;
         }
      }

      this.ga();
      super.h();
      if (!this.dU().C && this.bR != null && !this.bR.b(this)) {
         this.p();
         this.bR = this.bQ;
      }

      this.n();
      if (this instanceof arr $$0) {
         this.bS.a($$0);
         this.a(awx.k);
         this.a(awx.l);
         if (this.bI()) {
            this.a(awx.m);
         }

         if (this.ce()) {
            this.a(awx.o);
         }

         if (!this.fQ()) {
            this.a(awx.n);
         }
      }

      int $$1 = 29999999;
      double $$2 = azm.a(this.dz(), -2.9999999E7, 2.9999999E7);
      double $$3 = azm.a(this.dF(), -2.9999999E7, 2.9999999E7);
      if ($$2 != this.dz() || $$3 != this.dF()) {
         this.a_($$2, this.dB(), $$3);
      }

      this.aS++;
      czk $$4 = this.fa();
      if (!czk.a(this.cr, $$4)) {
         if (!czk.b(this.cr, $$4)) {
            this.gD();
         }

         this.cr = $$4.v();
      }

      if (!this.a(axh.a) && this.c(czo.pc)) {
         this.m();
      }

      this.cs.a();
      this.gb();
      if (this.cv > 0) {
         this.cv--;
      }
   }

   @Override
   protected float fo() {
      return this.fF() ? 15.0F : super.fo();
   }

   public boolean fX() {
      return this.cb();
   }

   protected boolean fY() {
      return this.cb();
   }

   protected boolean fZ() {
      return this.cb();
   }

   protected boolean ga() {
      this.ce = this.a(axh.a);
      return this.ce;
   }

   @Override
   public void a(boolean $$0, iv $$1) {
      if (!this.gj().b) {
         super.a($$0, $$1);
      }
   }

   @Override
   public void l(boolean $$0) {
      if (!this.gj().b) {
         super.l($$0);
      }
   }

   private void m() {
      this.a(new bvm(bvo.m, 200, 0, false, false, true));
   }

   private boolean c(czg $$0) {
      for (bws $$1 : bws.j) {
         czk $$2 = this.a($$1);
         dht $$3 = $$2.a(kk.D);
         if ($$2.a($$0) && $$3 != null && $$3.b() == $$1) {
            return true;
         }
      }

      return false;
   }

   protected czh g() {
      return new czh();
   }

   private void n() {
      this.bY = this.cb;
      this.bZ = this.cc;
      this.ca = this.cd;
      double $$0 = this.dz() - this.cb;
      double $$1 = this.dB() - this.cc;
      double $$2 = this.dF() - this.cd;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cb = this.dz();
         this.bY = this.cb;
      }

      if ($$2 > 10.0) {
         this.cd = this.dF();
         this.ca = this.cd;
      }

      if ($$1 > 10.0) {
         this.cc = this.dB();
         this.bZ = this.cc;
      }

      if ($$0 < -10.0) {
         this.cb = this.dz();
         this.bY = this.cb;
      }

      if ($$2 < -10.0) {
         this.cd = this.dF();
         this.ca = this.cd;
      }

      if ($$1 < -10.0) {
         this.cc = this.dB();
         this.bZ = this.cc;
      }

      this.cb += $$0 * 0.25;
      this.cd += $$2 * 0.25;
      this.cc += $$1 * 0.25;
   }

   protected void gb() {
      if (this.h(bxv.d)) {
         bxv $$0 = this.t();
         bxv $$1;
         if (this.V_() || this.bX() || this.h($$0)) {
            $$1 = $$0;
         } else if (this.h(bxv.f)) {
            $$1 = bxv.f;
         } else {
            $$1 = bxv.d;
         }

         this.b($$1);
      }
   }

   private bxv t() {
      if (this.fQ()) {
         return bxv.c;
      } else if (this.ci()) {
         return bxv.d;
      } else if (this.fI()) {
         return bxv.b;
      } else if (this.fu()) {
         return bxv.e;
      } else {
         return this.cb() && !this.i.b ? bxv.f : bxv.a;
      }
   }

   protected boolean h(bxv $$0) {
      return this.dU().a(this, this.a($$0).a(this.ds()).h(1.0E-7));
   }

   @Override
   protected awm aT() {
      return awn.vi;
   }

   @Override
   protected awm aU() {
      return awn.vg;
   }

   @Override
   protected awm aV() {
      return awn.vh;
   }

   @Override
   public int bV() {
      return 10;
   }

   @Override
   public void a(awm $$0, float $$1, float $$2) {
      this.dU().a(this, this.dz(), this.dB(), this.dF(), $$0, this.dl(), $$1, $$2);
   }

   public void a(awm $$0, awo $$1, float $$2, float $$3) {
   }

   @Override
   public awo dl() {
      return awo.h;
   }

   @Override
   protected int dm() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.K_();
      } else if ($$0 == 23) {
         this.cq = false;
      } else if ($$0 == 22) {
         this.cq = true;
      } else {
         super.b($$0);
      }
   }

   protected void p() {
      this.bR = this.bQ;
   }

   @Override
   protected void q() {
   }

   @Override
   public void r() {
      if (!this.dU().C && this.fY() && this.bX()) {
         this.bN();
         this.g(false);
      } else {
         super.r();
         this.bV = this.bW;
         this.bW = 0.0F;
      }
   }

   @Override
   public void k_() {
      if (this.bT > 0) {
         this.bT--;
      }

      this.j();
      this.f.l();
      this.bV = this.bW;
      if (this.i.b && !this.bX()) {
         this.k();
      }

      super.k_();
      this.eY();
      this.aX = this.dK();
      this.B((float)this.h(byp.v));
      float $$1;
      if (this.aH() && !this.eG() && !this.ci()) {
         $$1 = Math.min(0.1F, (float)this.dx().i());
      } else {
         $$1 = 0.0F;
      }

      this.bW = this.bW + ($$1 - this.bW) * 0.4F;
      if (this.eF() > 0.0F && !this.V_()) {
         fes $$2;
         if (this.bX() && !this.dj().dP()) {
            $$2 = this.cQ().b(this.dj().cQ()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cQ().c(1.0, 0.5, 1.0);
         }

         List<bwi> $$4 = this.dU().a_(this, $$2);
         List<bwi> $$5 = Lists.newArrayList();

         for (bwi $$6 : $$4) {
            if ($$6.an() == bwr.V) {
               $$5.add($$6);
            } else if (!$$6.dP()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ag.a($$5, this.ae));
         }
      }

      this.c(this.gA());
      this.c(this.gB());
      if (!this.dU().C && (this.Z > 0.5 || this.bh()) || this.i.b || this.fQ() || this.av) {
         this.gx();
      }
   }

   @Override
   protected void j() {
   }

   private void c(@Nullable tz $$0) {
      if ($$0 != null && (!$$0.c("Silent") || !$$0.o("Silent")) && this.dU().A.a(200) == 0) {
         String $$1 = $$0.j("id");
         bwr.a($$1).filter($$0x -> $$0x == bwr.aO).ifPresent($$0x -> {
            if (!cjt.a(this.dU(), this)) {
               this.dU().a(null, this.dz(), this.dB(), this.dF(), cjt.a(this.dU(), this.dU().A), this.dl(), 1.0F, cjt.a(this.dU().A));
            }
         });
      }
   }

   private void d(bwi $$0) {
      $$0.a_(this);
   }

   public int gc() {
      return this.al.a(d);
   }

   public void q(int $$0) {
      this.al.a(d, $$0);
   }

   public void r(int $$0) {
      int $$1 = this.gc();
      this.al.a(d, $$1 + $$0);
   }

   public void a(int $$0, float $$1, czk $$2) {
      this.bp = $$0;
      this.bq = $$1;
      this.br = $$2;
      if (!this.dU().C) {
         this.gx();
         this.c(4, true);
      }
   }

   @Nonnull
   @Override
   public czk dY() {
      return this.fu() && this.br != null ? this.br : super.dY();
   }

   @Override
   public void a(bux $$0) {
      super.a($$0);
      this.av();
      if (!this.V_() && this.dU() instanceof arq $$1) {
         this.b($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-azm.b((this.eL() + this.dK()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-azm.a((this.eL() + this.dK()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(awx.N);
      this.a(awx.i.b(awx.m));
      this.a(awx.i.b(awx.n));
      this.aF();
      this.c(false);
      this.c(Optional.of(je.a(this.dU().aj(), this.du())));
   }

   @Override
   protected void f(arq $$0) {
      super.f($$0);
      if (!$$0.O().c(djd.e)) {
         this.gd();
         this.f.m();
      }
   }

   protected void gd() {
      for (int $$0 = 0; $$0 < this.f.b(); $$0++) {
         czk $$1 = this.f.a($$0);
         if (!$$1.f() && dfz.a($$1, dfy.D)) {
            this.f.b($$0);
         }
      }
   }

   @Override
   protected awm e(bux $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected awm l_() {
      return awn.uY;
   }

   @Override
   public void g(czk $$0) {
   }

   @Nullable
   public cno a(czk $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   public float c(eao $$0) {
      float $$1 = this.f.g().a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(byp.t);
      }

      if (bvn.a(this)) {
         $$1 *= 1.0F + (float)(bvn.b(this) + 1) * 0.2F;
      }

      if (this.b(bvo.d)) {
         float $$2 = switch (this.c(bvo.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.h(byp.f);
      if (this.a(axh.a)) {
         $$1 *= (float)this.g(byp.C).g();
      }

      if (!this.aH()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(eao $$0) {
      return !$$0.C() || this.f.g().b($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a_(this.k.getId());
      uf $$1 = $$0.d("Inventory", 10);
      this.f.b($$1);
      this.f.c($$0.f("SelectedItemSlot"));
      this.h = $$0.e("SleepTimer");
      this.ch = $$0.h("XpP");
      this.cf = $$0.f("XpLevel");
      this.cg = $$0.f("XpTotal");
      this.ci = $$0.f("XpSeed");
      if (this.ci == 0) {
         this.ci = this.ae.f();
      }

      this.q($$0.f("Score"));
      this.bS.a($$0);
      this.i.b($$0);
      this.g(byp.v).a((double)this.i.b());
      if ($$0.b("EnderItems", 9)) {
         this.bP.a($$0.d("EnderItems", 10), this.dW());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.n("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.n("ShoulderEntityRight"));
      }

      this.c($$0.a("LastDeathLocation", je.b));
      this.cm = $$0.<fex>a("current_explosion_impact_pos", fex.a).orElse(null);
      this.cu = $$0.o("ignore_fall_damage_from_current_explosion");
      this.cv = $$0.f("current_impulse_context_reset_grace_time");
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      uo.e($$0);
      $$0.a("Inventory", this.f.a(new uf()));
      $$0.a("SelectedItemSlot", this.f.f());
      $$0.a("SleepTimer", (short)this.h);
      $$0.a("XpP", this.ch);
      $$0.a("XpLevel", this.cf);
      $$0.a("XpTotal", this.cg);
      $$0.a("XpSeed", this.ci);
      $$0.a("Score", this.gc());
      this.bS.b($$0);
      this.i.a($$0);
      $$0.a("EnderItems", this.bP.a(this.dW()));
      if (!this.gA().g()) {
         $$0.a("ShoulderEntityLeft", this.gA());
      }

      if (!this.gB().g()) {
         $$0.a("ShoulderEntityRight", this.gB());
      }

      this.ct.ifPresent($$1 -> $$0.a("LastDeathLocation", je.b, $$1));
      $$0.b("current_explosion_impact_pos", fex.a, this.cm);
      $$0.a("ignore_fall_damage_from_current_explosion", this.cu);
      $$0.a("current_impulse_context_reset_grace_time", this.cv);
   }

   @Override
   public boolean a(arq $$0, bux $$1) {
      if (super.a($$0, $$1)) {
         return true;
      } else if ($$1.a(axd.n)) {
         return !$$0.O().c(djd.I);
      } else if ($$1.a(axd.m)) {
         return !$$0.O().c(djd.J);
      } else if ($$1.a(axd.i)) {
         return !$$0.O().c(djd.K);
      } else {
         return $$1.a(axd.o) ? !$$0.O().c(djd.L) : false;
      }
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.i.a && !$$1.a(axd.d)) {
         return false;
      } else {
         this.bd = 0;
         if (this.eG()) {
            return false;
         } else {
            this.gx();
            if ($$1.g()) {
               if ($$0.an() == bud.a) {
                  $$2 = 0.0F;
               }

               if ($$0.an() == bud.b) {
                  $$2 = Math.min($$2 / 2.0F + 1.0F, $$2);
               }

               if ($$0.an() == bud.d) {
                  $$2 = $$2 * 3.0F / 2.0F;
               }
            }

            return $$2 == 0.0F ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void b(arq $$0, bxj $$1) {
      super.b($$0, $$1);
      czk $$2 = this.fG();
      dbl $$3 = $$2 != null ? $$2.a(kk.I) : null;
      float $$4 = $$1.fT();
      if ($$4 > 0.0F && $$3 != null) {
         $$3.a($$0, this, $$4, $$2);
      }
   }

   @Override
   public boolean ey() {
      return !this.gj().a && super.ey();
   }

   public boolean a(crj $$0) {
      fge $$1 = this.cp();
      fge $$2 = $$0.cp();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.i();
      }
   }

   @Override
   protected void c(bux $$0, float $$1) {
      this.a($$0, $$1, new bws[]{bws.c, bws.d, bws.e, bws.f});
   }

   @Override
   protected void d(bux $$0, float $$1) {
      this.a($$0, $$1, new bws[]{bws.f});
   }

   @Override
   protected void c(arq $$0, bux $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var8 = Math.max($$2 - this.fv(), 0.0F);
         this.E(this.fv() - ($$2 - var8));
         float $$4 = $$2 - var8;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
            this.a(awx.L, Math.round($$4 * 10.0F));
         }

         if (var8 != 0.0F) {
            this.G($$1.a());
            this.eR().a($$1, var8);
            this.d(this.eF() - var8);
            if (var8 < 3.4028235E37F) {
               this.a(awx.J, Math.round(var8 * 10.0F));
            }

            this.a(efo.o);
         }
      }
   }

   public boolean X() {
      return false;
   }

   public void a(dza $$0, boolean $$1) {
   }

   public void a(dii $$0) {
   }

   public void a(dxx $$0) {
   }

   public void a(dzf $$0) {
   }

   public void a(dzg $$0) {
   }

   public void a(dzh $$0) {
   }

   public void a(dyq $$0) {
   }

   public void a(cll $$0, btz $$1) {
   }

   public OptionalInt a(@Nullable bui $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dig $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(czk $$0, buf $$1) {
   }

   public bug a(bwi $$0, buf $$1) {
      if (this.V_()) {
         if ($$0 instanceof bui) {
            this.a((bui)$$0);
         }

         return bug.e;
      } else {
         czk $$2 = this.b($$1);
         czk $$3 = $$2.v();
         bug $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.fU() && $$2 == this.b($$1) && $$2.M() < $$3.M()) {
               $$2.e($$3.M());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof bxj) {
               if (this.fU()) {
                  $$2 = $$3;
               }

               bug $$5 = $$2.a(this, (bxj)$$0, $$1);
               if ($$5.a()) {
                  this.dU().a(efo.r, $$0.ds(), efo.a.a(this));
                  if ($$2.f() && !this.fU()) {
                     this.a($$1, czk.k);
                  }

                  return $$5;
               }
            }

            return bug.e;
         }
      }
   }

   @Override
   public void ab() {
      super.ab();
      this.J = 0;
   }

   @Override
   protected boolean ff() {
      return super.ff() || this.fQ();
   }

   @Override
   public boolean el() {
      return !this.i.b;
   }

   @Override
   protected fex a(fex $$0, bxn $$1) {
      float $$2 = this.dO();
      if (!this.i.b && !($$0.e > 0.0) && ($$1 == bxn.a || $$1 == bxn.b) && this.fZ() && this.I($$2)) {
         double $$3 = $$0.d;
         double $$4 = $$0.f;
         double $$5 = 0.05;
         double $$6 = Math.signum($$3) * 0.05;

         double $$7;
         for ($$7 = Math.signum($$4) * 0.05; $$3 != 0.0 && this.q($$3, 0.0, (double)$$2); $$3 -= $$6) {
            if (Math.abs($$3) <= 0.05) {
               $$3 = 0.0;
               break;
            }
         }

         while ($$4 != 0.0 && this.q(0.0, $$4, (double)$$2)) {
            if (Math.abs($$4) <= 0.05) {
               $$4 = 0.0;
               break;
            }

            $$4 -= $$7;
         }

         while ($$3 != 0.0 && $$4 != 0.0 && this.q($$3, $$4, (double)$$2)) {
            if (Math.abs($$3) <= 0.05) {
               $$3 = 0.0;
            } else {
               $$3 -= $$6;
            }

            if (Math.abs($$4) <= 0.05) {
               $$4 = 0.0;
            } else {
               $$4 -= $$7;
            }
         }

         return new fex($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean I(float $$0) {
      return this.aH() || this.Z < (double)$$0 && !this.q(0.0, 0.0, (double)$$0 - this.Z);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      fes $$3 = this.cQ();
      return this.dU().a(this, new fes($$3.a + 1.0E-7 + $$0, $$3.b - $$2 - 1.0E-7, $$3.c + 1.0E-7 + $$1, $$3.d - 1.0E-7 + $$0, $$3.b, $$3.f - 1.0E-7 + $$1));
   }

   public void e(bwi $$0) {
      if ($$0.cA()) {
         if (!$$0.v(this)) {
            float $$1 = this.fu() ? this.bq : (float)this.h(byp.c);
            czk $$2 = this.dY();
            bux $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.dV().a(this));
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.H(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gD();
            if ($$0.an().a(axf.H) && $$0 instanceof cse $$6 && $$6.a(csf.c, this, this, true)) {
               this.dU().a(null, this.dz(), this.dB(), this.dF(), awn.uR, this.dl());
               return;
            }

            if ($$1 > 0.0F || $$4 > 0.0F) {
               boolean $$7 = $$5 > 0.9F;
               boolean $$8;
               if (this.ch() && $$7) {
                  this.dU().a(null, this.dz(), this.dB(), this.dF(), awn.uQ, this.dl(), 1.0F, 1.0F);
                  $$8 = true;
               } else {
                  $$8 = false;
               }

               $$1 += $$2.h().a($$0, $$1, $$3);
               boolean $$10 = $$7 && this.Z > 0.0 && !this.aH() && !this.d_() && !this.bh() && !this.b(bvo.o) && !this.bX() && $$0 instanceof bxj && !this.ch();
               if ($$10) {
                  $$1 *= 1.5F;
               }

               float $$11 = $$1 + $$4;
               boolean $$12 = false;
               if ($$7 && !$$10 && !$$8 && this.aH()) {
                  double $$13 = this.ae().j();
                  double $$14 = (double)this.fn() * 2.5;
                  if ($$13 < azm.k($$14) && this.b(buf.a).a(axk.bH)) {
                     $$12 = true;
                  }
               }

               float $$15 = 0.0F;
               if ($$0 instanceof bxj $$16) {
                  $$15 = $$16.eF();
               }

               fex $$17 = $$0.dx();
               boolean $$18 = $$0.b($$3, $$11);
               if ($$18) {
                  float $$19 = this.b($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                  if ($$19 > 0.0F) {
                     if ($$0 instanceof bxj $$20) {
                        $$20.p(
                           (double)($$19 * 0.5F), (double)azm.a(this.dK() * (float) (Math.PI / 180.0)), (double)(-azm.b(this.dK() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.i(
                           (double)(-azm.a(this.dK() * (float) (Math.PI / 180.0)) * $$19 * 0.5F),
                           0.1,
                           (double)(azm.b(this.dK() * (float) (Math.PI / 180.0)) * $$19 * 0.5F)
                        );
                     }

                     this.i(this.dx().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$12) {
                     float $$21 = 1.0F + (float)this.h(byp.D) * $$1;

                     for (bxj $$23 : this.dU().a(bxj.class, $$0.cQ().c(1.0, 0.25, 1.0))) {
                        if ($$23 != this && $$23 != $$0 && !this.s($$23)) {
                           if ($$23 instanceof cnd) {
                              cnd $$24 = (cnd)$$23;
                              if ($$24.t()) {
                                 continue;
                              }
                           }

                           if (this.g($$23) < 9.0) {
                              float $$25 = this.a($$23, $$21, $$3) * $$5;
                              djh var22 = this.dU();
                              if (var22 instanceof arq) {
                                 arq $$26 = (arq)var22;
                                 if ($$23.a($$26, $$3, $$25)) {
                                    $$23.p(0.4F, (double)azm.a(this.dK() * (float) (Math.PI / 180.0)), (double)(-azm.b(this.dK() * (float) (Math.PI / 180.0))));
                                    dfz.a($$26, (bwi)$$23, $$3);
                                 }
                              }
                           }
                        }
                     }

                     this.dU().a(null, this.dz(), this.dB(), this.dF(), awn.uT, this.dl(), 1.0F, 1.0F);
                     this.ge();
                  }

                  if ($$0 instanceof arr && $$0.T) {
                     ((arr)$$0).f.b(new aff($$0));
                     $$0.T = false;
                     $$0.i($$17);
                  }

                  if ($$10) {
                     this.dU().a(null, this.dz(), this.dB(), this.dF(), awn.uP, this.dl(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$10 && !$$12) {
                     if ($$7) {
                        this.dU().a(null, this.dz(), this.dB(), this.dF(), awn.uS, this.dl(), 1.0F, 1.0F);
                     } else {
                        this.dU().a(null, this.dz(), this.dB(), this.dF(), awn.uU, this.dl(), 1.0F, 1.0F);
                     }
                  }

                  if ($$4 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  bwi $$27 = $$0;
                  if ($$0 instanceof cme) {
                     $$27 = ((cme)$$0).a;
                  }

                  boolean $$28 = false;
                  if (this.dU() instanceof arq $$29) {
                     if ($$27 instanceof bxj $$30) {
                        $$28 = $$2.a($$30, this);
                     }

                     dfz.a($$29, $$0, $$3);
                  }

                  if (!this.dU().C && !$$2.f() && $$27 instanceof bxj) {
                     if ($$28) {
                        $$2.b((bxj)$$27, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.fa()) {
                           this.a(buf.a, czk.k);
                        } else {
                           this.a(buf.b, czk.k);
                        }
                     }
                  }

                  if ($$0 instanceof bxj) {
                     float $$31 = $$15 - ((bxj)$$0).eF();
                     this.a(awx.G, Math.round($$31 * 10.0F));
                     if (this.dU() instanceof arq && $$31 > 2.0F) {
                        int $$32 = (int)((double)$$31 * 0.5);
                        ((arq)this.dU()).a(ly.g, $$0.dz(), $$0.e(0.5), $$0.dF(), $$32, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.G(0.1F);
               } else {
                  this.dU().a(null, this.dz(), this.dB(), this.dF(), awn.uR, this.dl(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(bwi $$0, float $$1, bux $$2) {
      return $$1;
   }

   @Override
   protected void f(bxj $$0) {
      this.e($$0);
   }

   public void b(bwi $$0) {
   }

   @Override
   public void c(bwi $$0) {
   }

   public void ge() {
      double $$0 = (double)(-azm.a(this.dK() * (float) (Math.PI / 180.0)));
      double $$1 = (double)azm.b(this.dK() * (float) (Math.PI / 180.0));
      if (this.dU() instanceof arq) {
         ((arq)this.dU()).a(ly.am, this.dz() + $$0, this.e(0.5), this.dF() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void gf() {
   }

   @Override
   public void a(bwi.d $$0) {
      super.a($$0);
      this.bQ.a(this);
      if (this.bR != null && this.gl()) {
         this.q();
      }
   }

   @Override
   public boolean L_() {
      return true;
   }

   @Override
   protected boolean dg() {
      return this.gg();
   }

   public boolean gg() {
      return false;
   }

   @Override
   public boolean dh() {
      return !this.dU().C || this.gg();
   }

   @Override
   public boolean di() {
      return !this.dU().C || this.gg();
   }

   public GameProfile gh() {
      return this.k;
   }

   public cri gi() {
      return this.f;
   }

   public crf gj() {
      return this.i;
   }

   @Override
   public boolean fU() {
      return this.i.d;
   }

   public boolean gk() {
      return this.i.d;
   }

   public void a(czk $$0, czk $$1, cvm $$2) {
   }

   public boolean gl() {
      return this.bR != this.bQ;
   }

   public boolean gm() {
      return true;
   }

   public Either<crj.a, bau> a(iv $$0) {
      this.b($$0);
      this.h = 0;
      return Either.right(bau.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fR();
      if (this.dU() instanceof arq && $$1) {
         ((arq)this.dU()).f();
      }

      this.h = $$0 ? 0 : 100;
   }

   @Override
   public void fR() {
      this.a(true, true);
   }

   public boolean gn() {
      return this.fQ() && this.h >= 100;
   }

   public int go() {
      return this.h;
   }

   public void a(wy $$0, boolean $$1) {
   }

   public void a(alg $$0) {
      this.b(awx.i.b($$0));
   }

   public void a(alg $$0, int $$1) {
      this.a(awx.i.b($$0), $$1);
   }

   public void b(awu<?> $$0) {
      this.a($$0, 1);
   }

   public void a(awu<?> $$0, int $$1) {
   }

   public void a(awu<?> $$0) {
   }

   public int a(Collection<deg<?>> $$0) {
      return 0;
   }

   public void a(deg<?> $$0, List<czk> $$1) {
   }

   public void b(List<alf<deb<?>>> $$0) {
   }

   public int b(Collection<deg<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(fex $$0) {
      if (this.bX()) {
         super.a_($$0);
      } else {
         if (this.ci()) {
            double $$1 = this.bR().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bf || !this.dU().b_(iv.a(this.dz(), this.dB() + 1.0 - 0.1, this.dF())).c()) {
               fex $$3 = this.dx();
               this.i($$3.b(0.0, ($$1 - $$3.e) * $$2, 0.0));
            }
         }

         if (this.gj().b) {
            double $$4 = this.dx().e;
            super.a_($$0);
            this.i(this.dx().a(jb.a.b, $$4 * 0.6));
         } else {
            super.a_($$0);
         }
      }
   }

   @Override
   protected boolean fs() {
      return !this.i.b && super.fs();
   }

   @Override
   public void bm() {
      if (this.i.b) {
         this.i(false);
      } else {
         super.bm();
      }
   }

   protected boolean h(iv $$0) {
      return !this.dU().a_($$0).j(this.dU(), $$0);
   }

   @Override
   public float fn() {
      return (float)this.h(byp.v);
   }

   @Override
   public boolean a(double $$0, float $$1, bux $$2) {
      if (this.i.c) {
         return false;
      } else {
         if ($$0 >= 2.0) {
            this.a(awx.t, (int)Math.round($$0 * 100.0));
         }

         boolean $$3 = this.cm != null && this.cu;
         double $$4;
         if ($$3) {
            $$4 = Math.min($$0, this.cm.e - this.dB());
            boolean $$5 = $$4 <= 0.0;
            if ($$5) {
               this.gO();
            } else {
               this.gN();
            }
         } else {
            $$4 = $$0;
         }

         if ($$4 > 0.0 && super.a($$4, $$1, $$2)) {
            this.gO();
            return true;
         } else {
            this.b($$0, $$1, $$2);
            return false;
         }
      }
   }

   public boolean gp() {
      if (!this.fI() && this.fs() && !this.bh()) {
         this.gq();
         return true;
      } else {
         return false;
      }
   }

   public void gq() {
      this.b(7, true);
   }

   @Override
   protected void bp() {
      if (!this.V_()) {
         super.bp();
      }
   }

   @Override
   protected void b(iv $$0, eao $$1) {
      if (this.bh()) {
         this.aW();
         this.b($$1);
      } else {
         iv $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            eao $$3 = this.dU().a_($$2);
            if ($$3.a(axc.br)) {
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
   public bxj.a eN() {
      return new bxj.a(awn.vf, awn.uV);
   }

   @Override
   public boolean a(arq $$0, bxj $$1) {
      this.b(awx.g.b($$1.an()));
      return true;
   }

   @Override
   public void a(eao $$0, fex $$1) {
      if (!this.i.b) {
         super.a($$0, $$1);
      }

      this.gN();
   }

   public void d(int $$0) {
      this.r($$0);
      this.ch = this.ch + (float)$$0 / (float)this.gs();
      this.cg = azm.a(this.cg + $$0, 0, Integer.MAX_VALUE);

      while (this.ch < 0.0F) {
         float $$1 = this.ch * (float)this.gs();
         if (this.cf > 0) {
            this.c(-1);
            this.ch = 1.0F + $$1 / (float)this.gs();
         } else {
            this.c(-1);
            this.ch = 0.0F;
         }
      }

      while (this.ch >= 1.0F) {
         this.ch = (this.ch - 1.0F) * (float)this.gs();
         this.c(1);
         this.ch = this.ch / (float)this.gs();
      }
   }

   public int gr() {
      return this.ci;
   }

   public void a(czk $$0, int $$1) {
      this.cf -= $$1;
      if (this.cf < 0) {
         this.cf = 0;
         this.ch = 0.0F;
         this.cg = 0;
      }

      this.ci = this.ae.f();
   }

   public void c(int $$0) {
      this.cf = IntMath.saturatedAdd(this.cf, $$0);
      if (this.cf < 0) {
         this.cf = 0;
         this.ch = 0.0F;
         this.cg = 0;
      }

      if ($$0 > 0 && this.cf % 5 == 0 && (float)this.j < (float)this.af - 100.0F) {
         float $$1 = this.cf > 30 ? 1.0F : (float)this.cf / 30.0F;
         this.dU().a(null, this.dz(), this.dB(), this.dF(), awn.ve, this.dl(), $$1 * 0.75F, 1.0F);
         this.j = this.af;
      }
   }

   public int gs() {
      if (this.cf >= 30) {
         return 112 + (this.cf - 30) * 9;
      } else {
         return this.cf >= 15 ? 37 + (this.cf - 15) * 5 : 7 + this.cf * 2;
      }
   }

   public void G(float $$0) {
      if (!this.i.a) {
         if (!this.dU().C) {
            this.bS.a($$0);
         }
      }
   }

   public Optional<cqo> Z() {
      return Optional.empty();
   }

   public cuy gt() {
      return this.bS;
   }

   public boolean t(boolean $$0) {
      return this.i.a || $$0 || this.bS.b();
   }

   public boolean gu() {
      return this.eF() > 0.0F && this.eF() < this.eT();
   }

   public boolean gv() {
      return this.i.e;
   }

   public boolean a(iv $$0, jb $$1, czk $$2) {
      if (this.i.e) {
         return true;
      } else {
         iv $$3 = $$0.a($$1.g());
         eas $$4 = new eas(this.dU(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int e(arq $$0) {
      return !$$0.O().c(djd.e) && !this.V_() ? Math.min(this.cf * 7, 100) : 0;
   }

   @Override
   protected boolean ep() {
      return true;
   }

   @Override
   public boolean cL() {
      return true;
   }

   @Override
   protected bwi.c be() {
      return this.i.b || this.aH() && this.ce() ? bwi.c.a : bwi.c.d;
   }

   public void x() {
   }

   @Override
   public wy ai() {
      return wy.b(this.k.getName());
   }

   public cwq gw() {
      return this.bP;
   }

   @Override
   protected boolean b(bws $$0) {
      return $$0.a() == bws.a.b;
   }

   public boolean h(czk $$0) {
      return this.f.g($$0);
   }

   public boolean h(tz $$0) {
      if (this.bX() || !this.aH() || this.bh() || this.av) {
         return false;
      } else if (this.gA().g()) {
         this.i($$0);
         this.e = this.dU().ae();
         return true;
      } else if (this.gB().g()) {
         this.j($$0);
         this.e = this.dU().ae();
         return true;
      } else {
         return false;
      }
   }

   protected void gx() {
      if (this.e + 20L < this.dU().ae()) {
         this.k(this.gA());
         this.i(new tz());
         this.k(this.gB());
         this.j(new tz());
      }
   }

   private void k(tz $$0) {
      if (!this.dU().C && !$$0.g()) {
         bwr.a($$0, this.dU(), bwq.r).ifPresent($$0x -> {
            if ($$0x instanceof byf $$1) {
               $$1.i(this);
            }

            $$0x.a_(this.dz(), this.dB() + 0.7F, this.dF());
            ((arq)this.dU()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean V_();

   @Override
   public boolean bD() {
      return !this.V_() && super.bD();
   }

   @Override
   public boolean ci() {
      return !this.i.b && !this.V_() && super.ci();
   }

   public abstract boolean b();

   @Override
   public boolean cI() {
      return !this.i.b;
   }

   public fgc gy() {
      return this.dU().R();
   }

   @Override
   public wy m_() {
      xm $$0 = ffx.a(this.cp(), this.ai());
      return this.a($$0);
   }

   private xm a(xm $$0) {
      String $$1 = this.gh().getName();
      return $$0.a($$1x -> $$1x.a(new ww.g("/tell " + $$1 + " ")).a(this.cP()).a($$1));
   }

   @Override
   public String cH() {
      return this.gh().getName();
   }

   @Override
   protected void F(float $$0) {
      this.ar().a(c, $$0);
   }

   @Override
   public float fv() {
      return this.ar().a(c);
   }

   public boolean a(crl $$0) {
      return (this.ar().a(bK) & $$0.a()) == $$0.a();
   }

   @Override
   public bya a_(int $$0) {
      if ($$0 == 499) {
         return new bya() {
            @Override
            public czk a() {
               return crj.this.bR.g();
            }

            @Override
            public boolean a(czk $$0) {
               crj.this.bR.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bya() {
               @Override
               public czk a() {
                  return crj.this.bQ.r().a($$1);
               }

               @Override
               public boolean a(czk $$0) {
                  crj.this.bQ.r().a($$1, $$0);
                  crj.this.bQ.a(crj.this.f);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.f.i().size()) {
            return bya.a(this.f, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.bP.b() ? bya.a(this.bP, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gz() {
      return this.cq;
   }

   public void u(boolean $$0) {
      this.cq = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.i.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bxa fx() {
      return this.al.a(bL) == 0 ? bxa.a : bxa.b;
   }

   public void b(bxa $$0) {
      this.al.a(bL, (byte)($$0 == bxa.a ? 0 : 1));
   }

   public tz gA() {
      return this.al.a(bM);
   }

   protected void i(tz $$0) {
      this.al.a(bM, $$0);
   }

   public tz gB() {
      return this.al.a(bN);
   }

   protected void j(tz $$0) {
      this.al.a(bN, $$0);
   }

   public float gC() {
      return (float)(1.0 / this.h(byp.e) * 20.0);
   }

   public float H(float $$0) {
      return azm.a(((float)this.aS + $$0) / this.gC(), 0.0F, 1.0F);
   }

   public void gD() {
      this.aS = 0;
   }

   public czh gE() {
      return this.cs;
   }

   @Override
   protected float aR() {
      return !this.i.b && !this.fI() ? super.aR() : 1.0F;
   }

   @Override
   public float eg() {
      return (float)this.h(byp.q);
   }

   public boolean gF() {
      return this.i.d && this.G() >= 2;
   }

   public int G() {
      return 0;
   }

   public boolean s(int $$0) {
      return this.G() >= $$0;
   }

   @Override
   public bwl e(bxv $$0) {
      return b.getOrDefault($$0, bJ);
   }

   @Override
   public ImmutableList<bxv> fN() {
      return ImmutableList.of(bxv.a, bxv.f, bxv.d);
   }

   @Override
   public czk d(czk $$0) {
      if (!($$0.h() instanceof daf)) {
         return czk.k;
      } else {
         Predicate<czk> $$1 = ((daf)$$0.h()).c();
         czk $$2 = daf.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((daf)$$0.h()).a();

            for (int $$3 = 0; $$3 < this.f.b(); $$3++) {
               czk $$4 = this.f.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.fU() ? new czk(czo.pk) : czk.k;
         }
      }
   }

   @Override
   public fex v(float $$0) {
      double $$1 = 0.22 * (this.fx() == bxa.b ? -1.0 : 1.0);
      float $$2 = azm.h($$0 * 0.5F, this.dM(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = azm.h($$0, this.aW, this.aV) * (float) (Math.PI / 180.0);
      if (this.fI() || this.fu()) {
         fex $$4 = this.h($$0);
         fex $$5 = this.dx();
         double $$6 = $$5.j();
         double $$7 = $$4.j();
         float $$10;
         if ($$6 > 0.0 && $$7 > 0.0) {
            double $$8 = ($$5.d * $$4.d + $$5.f * $$4.f) / Math.sqrt($$6 * $$7);
            double $$9 = $$5.d * $$4.f - $$5.f * $$4.d;
            $$10 = (float)(Math.signum($$9) * Math.acos($$8));
         } else {
            $$10 = 0.0F;
         }

         return this.p($$0).e(new fex($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cj()) {
         return this.p($$0).e(new fex($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cQ().c() - 1.0;
         double $$13 = this.cg() ? -0.2 : 0.07;
         return this.p($$0).e(new fex($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dT() {
      return true;
   }

   public boolean gG() {
      return this.fy() && this.fA().a(czo.sf);
   }

   @Override
   public boolean dS() {
      return false;
   }

   public Optional<je> gH() {
      return this.ct;
   }

   public void c(Optional<je> $$0) {
      this.ct = $$0;
   }

   @Override
   public float eL() {
      return this.cl;
   }

   @Override
   public void q(float $$0) {
      super.q($$0);
      this.cl = $$0;
   }

   @Override
   public boolean dN() {
      return true;
   }

   @Override
   protected float fm() {
      if (this.i.b && !this.bX()) {
         return this.ch() ? this.i.a() * 2.0F : this.i.a();
      } else {
         return this.ch() ? 0.025999999F : 0.02F;
      }
   }

   public boolean gI() {
      return this.g || this.bU <= 0;
   }

   public void gJ() {
      if (!this.g) {
         this.bU--;
      }
   }

   public void v(boolean $$0) {
      this.g = $$0;
      if (!this.g) {
         this.bU = 60;
      }
   }

   public double gK() {
      return this.h(byp.g);
   }

   public double gL() {
      return this.h(byp.j);
   }

   public boolean b(bwi $$0, double $$1) {
      return $$0.dP() ? false : this.a($$0.cQ(), $$1);
   }

   public boolean a(fes $$0, double $$1) {
      double $$2 = this.gL() + $$1;
      return $$0.e(this.bC()) < $$2 * $$2;
   }

   public boolean a(iv $$0, double $$1) {
      double $$2 = this.gK() + $$1;
      return new fes($$0).e(this.bC()) < $$2 * $$2;
   }

   public void w(boolean $$0) {
      this.cu = $$0;
      if ($$0) {
         this.cv = 40;
      } else {
         this.cv = 0;
      }
   }

   public boolean gM() {
      return this.cu;
   }

   public void gN() {
      if (this.cv == 0) {
         this.gO();
      }
   }

   public void gO() {
      this.cv = 0;
      this.cn = null;
      this.cm = null;
      this.cu = false;
   }

   public boolean gP() {
      return false;
   }

   @Override
   public boolean d_() {
      return this.i.b ? false : super.d_();
   }

   public static enum a {
      a,
      b(wy.c("block.minecraft.bed.no_sleep")),
      c(wy.c("block.minecraft.bed.too_far_away")),
      d(wy.c("block.minecraft.bed.obstructed")),
      e,
      f(wy.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final wy g;

      private a() {
         this.g = null;
      }

      private a(final wy $$0) {
         this.g = $$0;
      }

      @Nullable
      public wy a() {
         return this.g;
      }
   }
}
