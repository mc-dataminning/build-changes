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

public abstract class cqy extends bxc {
   public static final bwv bt = bwv.b;
   public static final int bu = 0;
   public static final int bv = 20;
   public static final int bw = 100;
   public static final int bx = 10;
   public static final int by = 200;
   public static final int bz = 499;
   public static final int bA = 500;
   public static final float bB = 4.5F;
   public static final float bC = 3.0F;
   public static final float bD = 1.5F;
   public static final float bE = 0.6F;
   public static final float bF = 0.6F;
   public static final float bG = 1.62F;
   private static final int a = 40;
   public static final fei bH = new fei(0.0, 0.6, 0.0);
   public static final bwg bI = bwg.b(0.6F, 1.8F).b(1.62F).a(bwf.a().a(bwe.b, bH));
   private static final Map<bxo, bwg> b = ImmutableMap.builder()
      .put(bxo.a, bI)
      .put(bxo.c, aD)
      .put(bxo.b, bwg.b(0.6F, 0.6F).b(0.4F))
      .put(bxo.d, bwg.b(0.6F, 0.6F).b(0.4F))
      .put(bxo.e, bwg.b(0.6F, 0.6F).b(0.4F))
      .put(bxo.f, bwg.b(0.6F, 1.5F).b(1.27F).a(bwf.a().a(bwe.b, bH)))
      .put(bxo.h, bwg.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final akj<Float> c = akn.a(cqy.class, akl.d);
   private static final akj<Integer> d = akn.a(cqy.class, akl.b);
   protected static final akj<Byte> bJ = akn.a(cqy.class, akl.a);
   protected static final akj<Byte> bK = akn.a(cqy.class, akl.a);
   protected static final akj<tz> bL = akn.a(cqy.class, akl.t);
   protected static final akj<tz> bM = akn.a(cqy.class, akl.t);
   public static final int bN = 60;
   private long e;
   final cqx f = new cqx(this);
   protected cwe bO = new cwe();
   public final cvt bP;
   public cuq bQ;
   protected cum bR = new cum();
   protected int bS;
   private boolean g = false;
   protected int bT = 60;
   public float bU;
   public float bV;
   public int bW;
   public double bX;
   public double bY;
   public double bZ;
   public double ca;
   public double cb;
   public double cc;
   private int h;
   protected boolean cd;
   private final cqu i = new cqu();
   public int ce;
   public int cf;
   public float cg;
   protected int ch;
   protected final float ci = 0.02F;
   private int j;
   private final GameProfile k;
   private boolean cp;
   private cyy cq = cyy.k;
   private final cyv cr = this.g();
   private Optional<jd> cs = Optional.empty();
   @Nullable
   public cro cj;
   protected float ck;
   @Nullable
   public fei cl;
   @Nullable
   public bwd cm;
   private boolean ct;
   private int cu;

   public cqy(div $$0, iu $$1, float $$2, GameProfile $$3) {
      super(bwm.bS, $$0);
      this.a_($$3.getId());
      this.k = $$3;
      this.bP = new cvt(this.f, !$$0.C, this);
      this.bQ = this.bP;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
   }

   public boolean a(div $$0, iu $$1, dis $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dis.d) {
         return true;
      } else if (this.gv()) {
         return false;
      } else {
         cyy $$3 = this.fa();
         return $$3.f() || !$$3.b(new ead($$0, $$1, false));
      }
   }

   public static byh.a fW() {
      return bxc.ed().a(byi.c, 1.0).a(byi.v, 0.1F).a(byi.e).a(byi.q).a(byi.g, 4.5).a(byi.j, 3.0).a(byi.f).a(byi.C).a(byi.z).a(byi.t).a(byi.D);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, 0.0F);
      $$0.a(d, 0);
      $$0.a(bJ, (byte)0);
      $$0.a(bK, (byte)bt.b());
      $$0.a(bL, new tz());
      $$0.a(bM, new tz());
   }

   @Override
   public void h() {
      this.ad = this.U_();
      if (this.U_() || this.bZ()) {
         this.d(false);
      }

      if (this.bW > 0) {
         this.bW--;
      }

      if (this.fQ()) {
         this.h++;
         if (this.h > 100) {
            this.h = 100;
         }

         if (!this.dV().C && this.dV().V()) {
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
      if (!this.dV().C && this.bQ != null && !this.bQ.b(this)) {
         this.p();
         this.bQ = this.bP;
      }

      this.n();
      if (this instanceof arr $$0) {
         this.bR.a($$0);
         this.a(awx.k);
         this.a(awx.l);
         if (this.bK()) {
            this.a(awx.m);
         }

         if (this.cg()) {
            this.a(awx.o);
         }

         if (!this.fQ()) {
            this.a(awx.n);
         }
      }

      int $$1 = 29999999;
      double $$2 = azm.a(this.dA(), -2.9999999E7, 2.9999999E7);
      double $$3 = azm.a(this.dG(), -2.9999999E7, 2.9999999E7);
      if ($$2 != this.dA() || $$3 != this.dG()) {
         this.a_($$2, this.dC(), $$3);
      }

      this.aS++;
      cyy $$4 = this.fa();
      if (!cyy.a(this.cq, $$4)) {
         if (!cyy.b(this.cq, $$4)) {
            this.gD();
         }

         this.cq = $$4.v();
      }

      if (!this.a(axh.a) && this.c(czc.oZ)) {
         this.m();
      }

      this.cr.a();
      this.gb();
      if (this.cu > 0) {
         this.cu--;
      }
   }

   @Override
   protected float fo() {
      return this.fF() ? 15.0F : super.fo();
   }

   public boolean fX() {
      return this.cd();
   }

   protected boolean fY() {
      return this.cd();
   }

   protected boolean fZ() {
      return this.cd();
   }

   protected boolean ga() {
      this.cd = this.a(axh.a);
      return this.cd;
   }

   @Override
   public void a(boolean $$0, iu $$1) {
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
      this.a(new bvh(bvj.m, 200, 0, false, false, true));
   }

   private boolean c(cyu $$0) {
      for (bwn $$1 : bwn.j) {
         cyy $$2 = this.a($$1);
         dhh $$3 = $$2.a(kj.D);
         if ($$2.a($$0) && $$3 != null && $$3.b() == $$1) {
            return true;
         }
      }

      return false;
   }

   protected cyv g() {
      return new cyv();
   }

   private void n() {
      this.bX = this.ca;
      this.bY = this.cb;
      this.bZ = this.cc;
      double $$0 = this.dA() - this.ca;
      double $$1 = this.dC() - this.cb;
      double $$2 = this.dG() - this.cc;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.ca = this.dA();
         this.bX = this.ca;
      }

      if ($$2 > 10.0) {
         this.cc = this.dG();
         this.bZ = this.cc;
      }

      if ($$1 > 10.0) {
         this.cb = this.dC();
         this.bY = this.cb;
      }

      if ($$0 < -10.0) {
         this.ca = this.dA();
         this.bX = this.ca;
      }

      if ($$2 < -10.0) {
         this.cc = this.dG();
         this.bZ = this.cc;
      }

      if ($$1 < -10.0) {
         this.cb = this.dC();
         this.bY = this.cb;
      }

      this.ca += $$0 * 0.25;
      this.cc += $$2 * 0.25;
      this.cb += $$1 * 0.25;
   }

   protected void gb() {
      if (this.h(bxo.d)) {
         bxo $$0 = this.t();
         bxo $$1;
         if (this.U_() || this.bZ() || this.h($$0)) {
            $$1 = $$0;
         } else if (this.h(bxo.f)) {
            $$1 = bxo.f;
         } else {
            $$1 = bxo.d;
         }

         this.b($$1);
      }
   }

   private bxo t() {
      if (this.fQ()) {
         return bxo.c;
      } else if (this.ck()) {
         return bxo.d;
      } else if (this.fI()) {
         return bxo.b;
      } else if (this.fu()) {
         return bxo.e;
      } else {
         return this.cd() && !this.i.b ? bxo.f : bxo.a;
      }
   }

   protected boolean h(bxo $$0) {
      return this.dV().a(this, this.a($$0).a(this.dt()).h(1.0E-7));
   }

   @Override
   protected awm aV() {
      return awn.vf;
   }

   @Override
   protected awm aW() {
      return awn.vd;
   }

   @Override
   protected awm aX() {
      return awn.ve;
   }

   @Override
   public int bX() {
      return 10;
   }

   @Override
   public void a(awm $$0, float $$1, float $$2) {
      this.dV().a(this, this.dA(), this.dC(), this.dG(), $$0, this.dm(), $$1, $$2);
   }

   public void a(awm $$0, awo $$1, float $$2, float $$3) {
   }

   @Override
   public awo dm() {
      return awo.h;
   }

   @Override
   protected int dn() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.K_();
      } else if ($$0 == 23) {
         this.cp = false;
      } else if ($$0 == 22) {
         this.cp = true;
      } else {
         super.b($$0);
      }
   }

   protected void p() {
      this.bQ = this.bP;
   }

   @Override
   protected void q() {
   }

   @Override
   public void r() {
      if (!this.dV().C && this.fY() && this.bZ()) {
         this.bP();
         this.g(false);
      } else {
         super.r();
         this.bU = this.bV;
         this.bV = 0.0F;
      }
   }

   @Override
   public void k_() {
      if (this.bS > 0) {
         this.bS--;
      }

      this.j();
      this.f.j();
      this.bU = this.bV;
      if (this.i.b && !this.bZ()) {
         this.k();
      }

      super.k_();
      this.eY();
      this.aX = this.dL();
      this.B((float)this.h(byi.v));
      float $$1;
      if (this.aJ() && !this.eG() && !this.ck()) {
         $$1 = Math.min(0.1F, (float)this.dy().i());
      } else {
         $$1 = 0.0F;
      }

      this.bV = this.bV + ($$1 - this.bV) * 0.4F;
      if (this.eF() > 0.0F && !this.U_()) {
         fed $$2;
         if (this.bZ() && !this.dk().dQ()) {
            $$2 = this.cR().b(this.dk().cR()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cR().c(1.0, 0.5, 1.0);
         }

         List<bwd> $$4 = this.dV().a_(this, $$2);
         List<bwd> $$5 = Lists.newArrayList();

         for (bwd $$6 : $$4) {
            if ($$6.aq() == bwm.V) {
               $$5.add($$6);
            } else if (!$$6.dQ()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(af.a($$5, this.ae));
         }
      }

      this.c(this.gA());
      this.c(this.gB());
      if (!this.dV().C && (this.Z > 0.5 || this.bj()) || this.i.b || this.fQ() || this.av) {
         this.gx();
      }
   }

   @Override
   protected void j() {
   }

   private void c(@Nullable tz $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dV().A.a(200) == 0) {
         String $$1 = $$0.l("id");
         bwm.a($$1).filter($$0x -> $$0x == bwm.aO).ifPresent($$0x -> {
            if (!cjk.a(this.dV(), this)) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), cjk.a(this.dV(), this.dV().A), this.dm(), 1.0F, cjk.a(this.dV().A));
            }
         });
      }
   }

   private void d(bwd $$0) {
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

   public void a(int $$0, float $$1, cyy $$2) {
      this.bp = $$0;
      this.bq = $$1;
      this.br = $$2;
      if (!this.dV().C) {
         this.gx();
         this.c(4, true);
      }
   }

   @Nonnull
   @Override
   public cyy dZ() {
      return this.fu() && this.br != null ? this.br : super.dZ();
   }

   @Override
   public void a(bus $$0) {
      super.a($$0);
      this.ay();
      if (!this.U_() && this.dV() instanceof arq $$1) {
         this.b($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-azm.b((this.eL() + this.dL()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-azm.a((this.eL() + this.dL()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(awx.N);
      this.a(awx.i.b(awx.m));
      this.a(awx.i.b(awx.n));
      this.aH();
      this.c(false);
      this.c(Optional.of(jd.a(this.dV().aj(), this.dv())));
   }

   @Override
   protected void f(arq $$0) {
      super.f($$0);
      if (!$$0.O().c(dir.d)) {
         this.gd();
         this.f.k();
      }
   }

   protected void gd() {
      for (int $$0 = 0; $$0 < this.f.b(); $$0++) {
         cyy $$1 = this.f.a($$0);
         if (!$$1.f() && dfn.a($$1, dfm.D)) {
            this.f.b($$0);
         }
      }
   }

   @Override
   protected awm e(bus $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected awm l_() {
      return awn.uV;
   }

   @Override
   public void h(cyy $$0) {
   }

   @Nullable
   public cnd a(cyy $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cnd a(cyy $$0, boolean $$1, boolean $$2) {
      if (!$$0.f() && this.dV().C) {
         this.a(bua.a);
      }

      return null;
   }

   public float c(dzz $$0) {
      float $$1 = this.f.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(byi.t);
      }

      if (bvi.a(this)) {
         $$1 *= 1.0F + (float)(bvi.b(this) + 1) * 0.2F;
      }

      if (this.b(bvj.d)) {
         float $$2 = switch (this.c(bvj.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.h(byi.f);
      if (this.a(axh.a)) {
         $$1 *= (float)this.g(byi.C).g();
      }

      if (!this.aJ()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dzz $$0) {
      return !$$0.C() || this.f.f().b($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a_(this.k.getId());
      uf $$1 = $$0.c("Inventory", 10);
      this.f.b($$1);
      this.f.j = $$0.h("SelectedItemSlot");
      this.h = $$0.g("SleepTimer");
      this.cg = $$0.j("XpP");
      this.ce = $$0.h("XpLevel");
      this.cf = $$0.h("XpTotal");
      this.ch = $$0.h("XpSeed");
      if (this.ch == 0) {
         this.ch = this.ae.f();
      }

      this.q($$0.h("Score"));
      this.bR.a($$0);
      this.i.b($$0);
      this.g(byi.v).a((double)this.i.b());
      if ($$0.b("EnderItems", 9)) {
         this.bO.a($$0.c("EnderItems", 10), this.dX());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      this.c($$0.a("LastDeathLocation", jd.b));
      this.cl = $$0.<fei>a("current_explosion_impact_pos", fei.a).orElse(null);
      this.ct = $$0.q("ignore_fall_damage_from_current_explosion");
      this.cu = $$0.h("current_impulse_context_reset_grace_time");
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      uo.e($$0);
      $$0.a("Inventory", this.f.a(new uf()));
      $$0.a("SelectedItemSlot", this.f.j);
      $$0.a("SleepTimer", (short)this.h);
      $$0.a("XpP", this.cg);
      $$0.a("XpLevel", this.ce);
      $$0.a("XpTotal", this.cf);
      $$0.a("XpSeed", this.ch);
      $$0.a("Score", this.gc());
      this.bR.b($$0);
      this.i.a($$0);
      $$0.a("EnderItems", this.bO.a(this.dX()));
      if (!this.gA().g()) {
         $$0.a("ShoulderEntityLeft", this.gA());
      }

      if (!this.gB().g()) {
         $$0.a("ShoulderEntityRight", this.gB());
      }

      this.cs.ifPresent($$1 -> $$0.a("LastDeathLocation", jd.b, $$1));
      if (this.cl != null) {
         $$0.a("current_explosion_impact_pos", fei.a, this.cl);
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.ct);
      $$0.a("current_impulse_context_reset_grace_time", this.cu);
   }

   @Override
   public boolean a(arq $$0, bus $$1) {
      if (super.a($$0, $$1)) {
         return true;
      } else if ($$1.a(axd.n)) {
         return !$$0.O().c(dir.H);
      } else if ($$1.a(axd.m)) {
         return !$$0.O().c(dir.I);
      } else if ($$1.a(axd.i)) {
         return !$$0.O().c(dir.J);
      } else {
         return $$1.a(axd.o) ? !$$0.O().c(dir.K) : false;
      }
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
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
               if ($$0.an() == bty.a) {
                  $$2 = 0.0F;
               }

               if ($$0.an() == bty.b) {
                  $$2 = Math.min($$2 / 2.0F + 1.0F, $$2);
               }

               if ($$0.an() == bty.d) {
                  $$2 = $$2 * 3.0F / 2.0F;
               }
            }

            return $$2 == 0.0F ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void b(arq $$0, bxc $$1) {
      super.b($$0, $$1);
      cyy $$2 = this.fG();
      daz $$3 = $$2 != null ? $$2.a(kj.I) : null;
      float $$4 = $$1.fT();
      if ($$4 > 0.0F && $$3 != null) {
         $$3.a($$0, this, $$4, $$2);
      }
   }

   @Override
   public boolean ey() {
      return !this.gj().a && super.ey();
   }

   public boolean a(cqy $$0) {
      ffp $$1 = this.cr();
      ffp $$2 = $$0.cr();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.i();
      }
   }

   @Override
   protected void c(bus $$0, float $$1) {
      this.a($$0, $$1, new bwn[]{bwn.c, bwn.d, bwn.e, bwn.f});
   }

   @Override
   protected void d(bus $$0, float $$1) {
      this.a($$0, $$1, new bwn[]{bwn.f});
   }

   @Override
   protected void c(arq $$0, bus $$1, float $$2) {
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

            this.a(eez.o);
         }
      }
   }

   public boolean aa() {
      return false;
   }

   public void a(dyl $$0, boolean $$1) {
   }

   public void a(dhw $$0) {
   }

   public void a(dxi $$0) {
   }

   public void a(dyq $$0) {
   }

   public void a(dyr $$0) {
   }

   public void a(dys $$0) {
   }

   public void a(dyb $$0) {
   }

   public void a(cld $$0, btu $$1) {
   }

   public OptionalInt a(@Nullable bud $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dhu $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cyy $$0, bua $$1) {
   }

   public bub a(bwd $$0, bua $$1) {
      if (this.U_()) {
         if ($$0 instanceof bud) {
            this.a((bud)$$0);
         }

         return bub.e;
      } else {
         cyy $$2 = this.b($$1);
         cyy $$3 = $$2.v();
         bub $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.fU() && $$2 == this.b($$1) && $$2.M() < $$3.M()) {
               $$2.e($$3.M());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof bxc) {
               if (this.fU()) {
                  $$2 = $$3;
               }

               bub $$5 = $$2.a(this, (bxc)$$0, $$1);
               if ($$5.a()) {
                  this.dV().a(eez.r, $$0.dt(), eez.a.a(this));
                  if ($$2.f() && !this.fU()) {
                     this.a($$1, cyy.k);
                  }

                  return $$5;
               }
            }

            return bub.e;
         }
      }
   }

   @Override
   public void ae() {
      super.ae();
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
   protected fei a(fei $$0, bxg $$1) {
      float $$2 = this.dP();
      if (!this.i.b && !($$0.e > 0.0) && ($$1 == bxg.a || $$1 == bxg.b) && this.fZ() && this.I($$2)) {
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

         return new fei($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean I(float $$0) {
      return this.aJ() || this.Z < (double)$$0 && !this.q(0.0, 0.0, (double)$$0 - this.Z);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      fed $$3 = this.cR();
      return this.dV().a(this, new fed($$3.a + 1.0E-7 + $$0, $$3.b - $$2 - 1.0E-7, $$3.c + 1.0E-7 + $$1, $$3.d - 1.0E-7 + $$0, $$3.b, $$3.f - 1.0E-7 + $$1));
   }

   public void e(bwd $$0) {
      if ($$0.cB()) {
         if (!$$0.v(this)) {
            float $$1 = this.fu() ? this.bq : (float)this.h(byi.c);
            cyy $$2 = this.dZ();
            bus $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.dW().a(this));
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.H(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gD();
            if ($$0.aq().a(axf.H) && $$0 instanceof crs $$6 && $$6.a(crt.c, this, this, true)) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.uO, this.dm());
               return;
            }

            if ($$1 > 0.0F || $$4 > 0.0F) {
               boolean $$7 = $$5 > 0.9F;
               boolean $$8;
               if (this.cj() && $$7) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.uN, this.dm(), 1.0F, 1.0F);
                  $$8 = true;
               } else {
                  $$8 = false;
               }

               $$1 += $$2.h().a($$0, $$1, $$3);
               boolean $$10 = $$7 && this.Z > 0.0 && !this.aJ() && !this.d_() && !this.bj() && !this.b(bvj.o) && !this.bZ() && $$0 instanceof bxc && !this.cj();
               if ($$10) {
                  $$1 *= 1.5F;
               }

               float $$11 = $$1 + $$4;
               boolean $$12 = false;
               if ($$7 && !$$10 && !$$8 && this.aJ()) {
                  double $$13 = this.ah().j();
                  double $$14 = (double)this.fn() * 2.5;
                  if ($$13 < azm.k($$14) && this.b(bua.a).a(axk.bG)) {
                     $$12 = true;
                  }
               }

               float $$15 = 0.0F;
               if ($$0 instanceof bxc $$16) {
                  $$15 = $$16.eF();
               }

               fei $$17 = $$0.dy();
               boolean $$18 = $$0.b($$3, $$11);
               if ($$18) {
                  float $$19 = this.b($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                  if ($$19 > 0.0F) {
                     if ($$0 instanceof bxc $$20) {
                        $$20.p(
                           (double)($$19 * 0.5F), (double)azm.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azm.b(this.dL() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.j(
                           (double)(-azm.a(this.dL() * (float) (Math.PI / 180.0)) * $$19 * 0.5F),
                           0.1,
                           (double)(azm.b(this.dL() * (float) (Math.PI / 180.0)) * $$19 * 0.5F)
                        );
                     }

                     this.i(this.dy().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$12) {
                     float $$21 = 1.0F + (float)this.h(byi.D) * $$1;

                     for (bxc $$23 : this.dV().a(bxc.class, $$0.cR().c(1.0, 0.25, 1.0))) {
                        if ($$23 != this && $$23 != $$0 && !this.s($$23)) {
                           if ($$23 instanceof cms) {
                              cms $$24 = (cms)$$23;
                              if ($$24.t()) {
                                 continue;
                              }
                           }

                           if (this.g($$23) < 9.0) {
                              float $$25 = this.a($$23, $$21, $$3) * $$5;
                              div var22 = this.dV();
                              if (var22 instanceof arq) {
                                 arq $$26 = (arq)var22;
                                 if ($$23.a($$26, $$3, $$25)) {
                                    $$23.p(0.4F, (double)azm.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azm.b(this.dL() * (float) (Math.PI / 180.0))));
                                    dfn.a($$26, (bwd)$$23, $$3);
                                 }
                              }
                           }
                        }
                     }

                     this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.uQ, this.dm(), 1.0F, 1.0F);
                     this.ge();
                  }

                  if ($$0 instanceof arr && $$0.T) {
                     ((arr)$$0).f.b(new aff($$0));
                     $$0.T = false;
                     $$0.i($$17);
                  }

                  if ($$10) {
                     this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.uM, this.dm(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$10 && !$$12) {
                     if ($$7) {
                        this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.uP, this.dm(), 1.0F, 1.0F);
                     } else {
                        this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.uR, this.dm(), 1.0F, 1.0F);
                     }
                  }

                  if ($$4 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  bwd $$27 = $$0;
                  if ($$0 instanceof clt) {
                     $$27 = ((clt)$$0).a;
                  }

                  boolean $$28 = false;
                  if (this.dV() instanceof arq $$29) {
                     if ($$27 instanceof bxc $$30) {
                        $$28 = $$2.a($$30, this);
                     }

                     dfn.a($$29, $$0, $$3);
                  }

                  if (!this.dV().C && !$$2.f() && $$27 instanceof bxc) {
                     if ($$28) {
                        $$2.b((bxc)$$27, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.fa()) {
                           this.a(bua.a, cyy.k);
                        } else {
                           this.a(bua.b, cyy.k);
                        }
                     }
                  }

                  if ($$0 instanceof bxc) {
                     float $$31 = $$15 - ((bxc)$$0).eF();
                     this.a(awx.G, Math.round($$31 * 10.0F));
                     if (this.dV() instanceof arq && $$31 > 2.0F) {
                        int $$32 = (int)((double)$$31 * 0.5);
                        ((arq)this.dV()).a(lx.g, $$0.dA(), $$0.e(0.5), $$0.dG(), $$32, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.G(0.1F);
               } else {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.uO, this.dm(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(bwd $$0, float $$1, bus $$2) {
      return $$1;
   }

   @Override
   protected void f(bxc $$0) {
      this.e($$0);
   }

   public void b(bwd $$0) {
   }

   @Override
   public void c(bwd $$0) {
   }

   public void ge() {
      double $$0 = (double)(-azm.a(this.dL() * (float) (Math.PI / 180.0)));
      double $$1 = (double)azm.b(this.dL() * (float) (Math.PI / 180.0));
      if (this.dV() instanceof arq) {
         ((arq)this.dV()).a(lx.am, this.dA() + $$0, this.e(0.5), this.dG() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void gf() {
   }

   @Override
   public void a(bwd.e $$0) {
      super.a($$0);
      this.bP.a(this);
      if (this.bQ != null && this.gl()) {
         this.q();
      }
   }

   @Override
   public boolean L_() {
      return true;
   }

   @Override
   protected boolean dh() {
      return this.gg();
   }

   public boolean gg() {
      return false;
   }

   @Override
   public boolean di() {
      return !this.dV().C || this.gg();
   }

   @Override
   public boolean dj() {
      return !this.dV().C || this.gg();
   }

   public GameProfile gh() {
      return this.k;
   }

   public cqx gi() {
      return this.f;
   }

   public cqu gj() {
      return this.i;
   }

   @Override
   public boolean fU() {
      return this.i.d;
   }

   public boolean gk() {
      return this.i.d;
   }

   public void a(cyy $$0, cyy $$1, cva $$2) {
   }

   public boolean gl() {
      return this.bQ != this.bP;
   }

   public boolean gm() {
      return true;
   }

   public Either<cqy.a, bau> a(iu $$0) {
      this.b($$0);
      this.h = 0;
      return Either.right(bau.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fR();
      if (this.dV() instanceof arq && $$1) {
         ((arq)this.dV()).f();
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

   public int a(Collection<ddu<?>> $$0) {
      return 0;
   }

   public void a(ddu<?> $$0, List<cyy> $$1) {
   }

   public void b(List<alf<ddp<?>>> $$0) {
   }

   public int b(Collection<ddu<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(fei $$0) {
      if (this.bZ()) {
         super.a_($$0);
      } else {
         if (this.ck()) {
            double $$1 = this.bT().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bf || !this.dV().b_(iu.a(this.dA(), this.dC() + 1.0 - 0.1, this.dG())).c()) {
               fei $$3 = this.dy();
               this.i($$3.b(0.0, ($$1 - $$3.e) * $$2, 0.0));
            }
         }

         if (this.gj().b) {
            double $$4 = this.dy().e;
            super.a_($$0);
            this.i(this.dy().a(ja.a.b, $$4 * 0.6));
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
   public void bo() {
      if (this.i.b) {
         this.i(false);
      } else {
         super.bo();
      }
   }

   protected boolean h(iu $$0) {
      return !this.dV().a_($$0).j(this.dV(), $$0);
   }

   @Override
   public float fn() {
      return (float)this.h(byi.v);
   }

   @Override
   public boolean a(double $$0, float $$1, bus $$2) {
      if (this.i.c) {
         return false;
      } else {
         if ($$0 >= 2.0) {
            this.a(awx.t, (int)Math.round($$0 * 100.0));
         }

         boolean $$3 = this.cl != null && this.ct;
         double $$4;
         if ($$3) {
            $$4 = Math.min($$0, this.cl.e - this.dC());
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
      if (!this.fI() && this.fs() && !this.bj()) {
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
   protected void br() {
      if (!this.U_()) {
         super.br();
      }
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      if (this.bj()) {
         this.aY();
         this.b($$1);
      } else {
         iu $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dzz $$3 = this.dV().a_($$2);
            if ($$3.a(axc.bq)) {
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
   public bxc.a eN() {
      return new bxc.a(awn.vc, awn.uS);
   }

   @Override
   public boolean a(arq $$0, bxc $$1) {
      this.b(awx.g.b($$1.aq()));
      return true;
   }

   @Override
   public void a(dzz $$0, fei $$1) {
      if (!this.i.b) {
         super.a($$0, $$1);
      }

      this.gN();
   }

   public void d(int $$0) {
      this.r($$0);
      this.cg = this.cg + (float)$$0 / (float)this.gs();
      this.cf = azm.a(this.cf + $$0, 0, Integer.MAX_VALUE);

      while (this.cg < 0.0F) {
         float $$1 = this.cg * (float)this.gs();
         if (this.ce > 0) {
            this.c(-1);
            this.cg = 1.0F + $$1 / (float)this.gs();
         } else {
            this.c(-1);
            this.cg = 0.0F;
         }
      }

      while (this.cg >= 1.0F) {
         this.cg = (this.cg - 1.0F) * (float)this.gs();
         this.c(1);
         this.cg = this.cg / (float)this.gs();
      }
   }

   public int gr() {
      return this.ch;
   }

   public void a(cyy $$0, int $$1) {
      this.ce -= $$1;
      if (this.ce < 0) {
         this.ce = 0;
         this.cg = 0.0F;
         this.cf = 0;
      }

      this.ch = this.ae.f();
   }

   public void c(int $$0) {
      this.ce = IntMath.saturatedAdd(this.ce, $$0);
      if (this.ce < 0) {
         this.ce = 0;
         this.cg = 0.0F;
         this.cf = 0;
      }

      if ($$0 > 0 && this.ce % 5 == 0 && (float)this.j < (float)this.af - 100.0F) {
         float $$1 = this.ce > 30 ? 1.0F : (float)this.ce / 30.0F;
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.vb, this.dm(), $$1 * 0.75F, 1.0F);
         this.j = this.af;
      }
   }

   public int gs() {
      if (this.ce >= 30) {
         return 112 + (this.ce - 30) * 9;
      } else {
         return this.ce >= 15 ? 37 + (this.ce - 15) * 5 : 7 + this.ce * 2;
      }
   }

   public void G(float $$0) {
      if (!this.i.a) {
         if (!this.dV().C) {
            this.bR.a($$0);
         }
      }
   }

   public Optional<cqd> ac() {
      return Optional.empty();
   }

   public cum gt() {
      return this.bR;
   }

   public boolean t(boolean $$0) {
      return this.i.a || $$0 || this.bR.b();
   }

   public boolean gu() {
      return this.eF() > 0.0F && this.eF() < this.eT();
   }

   public boolean gv() {
      return this.i.e;
   }

   public boolean a(iu $$0, ja $$1, cyy $$2) {
      if (this.i.e) {
         return true;
      } else {
         iu $$3 = $$0.a($$1.g());
         ead $$4 = new ead(this.dV(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int e(arq $$0) {
      return !$$0.O().c(dir.d) && !this.U_() ? Math.min(this.ce * 7, 100) : 0;
   }

   @Override
   protected boolean ep() {
      return true;
   }

   @Override
   public boolean cM() {
      return true;
   }

   @Override
   protected bwd.d bg() {
      return this.i.b || this.aJ() && this.cg() ? bwd.d.a : bwd.d.d;
   }

   public void x() {
   }

   @Override
   public wy al() {
      return wy.b(this.k.getName());
   }

   public cwe gw() {
      return this.bO;
   }

   @Override
   public cyy a(bwn $$0) {
      if ($$0 == bwn.a) {
         return this.f.f();
      } else if ($$0 == bwn.b) {
         return this.f.i.getFirst();
      } else {
         return $$0.a() == bwn.a.b ? this.f.h.get($$0.b()) : cyy.k;
      }
   }

   @Override
   protected boolean b(bwn $$0) {
      return $$0.a() == bwn.a.b;
   }

   @Override
   public void a(bwn $$0, cyy $$1) {
      this.d($$1);
      if ($$0 == bwn.a) {
         this.a($$0, this.f.g.set(this.f.j, $$1), $$1);
      } else if ($$0 == bwn.b) {
         this.a($$0, this.f.i.set(0, $$1), $$1);
      } else if ($$0.a() == bwn.a.b) {
         this.a($$0, this.f.h.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cyy $$0) {
      return this.f.f($$0);
   }

   public boolean h(tz $$0) {
      if (this.bZ() || !this.aJ() || this.bj() || this.av) {
         return false;
      } else if (this.gA().g()) {
         this.i($$0);
         this.e = this.dV().ae();
         return true;
      } else if (this.gB().g()) {
         this.j($$0);
         this.e = this.dV().ae();
         return true;
      } else {
         return false;
      }
   }

   protected void gx() {
      if (this.e + 20L < this.dV().ae()) {
         this.k(this.gA());
         this.i(new tz());
         this.k(this.gB());
         this.j(new tz());
      }
   }

   private void k(tz $$0) {
      if (!this.dV().C && !$$0.g()) {
         bwm.a($$0, this.dV(), bwl.r).ifPresent($$0x -> {
            if ($$0x instanceof bxy $$1) {
               $$1.i(this);
            }

            $$0x.a_(this.dA(), this.dC() + 0.7F, this.dG());
            ((arq)this.dV()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean U_();

   @Override
   public boolean bF() {
      return !this.U_() && super.bF();
   }

   @Override
   public boolean ck() {
      return !this.i.b && !this.U_() && super.ck();
   }

   public abstract boolean b();

   @Override
   public boolean cJ() {
      return !this.i.b;
   }

   public ffn gy() {
      return this.dV().R();
   }

   @Override
   public wy m_() {
      xm $$0 = ffi.a(this.cr(), this.al());
      return this.a($$0);
   }

   private xm a(xm $$0) {
      String $$1 = this.gh().getName();
      return $$0.a($$1x -> $$1x.a(new ww.g("/tell " + $$1 + " ")).a(this.cQ()).a($$1));
   }

   @Override
   public String cI() {
      return this.gh().getName();
   }

   @Override
   protected void F(float $$0) {
      this.au().a(c, $$0);
   }

   @Override
   public float fv() {
      return this.au().a(c);
   }

   public boolean a(cqz $$0) {
      return (this.au().a(bJ) & $$0.a()) == $$0.a();
   }

   @Override
   public bxt a_(int $$0) {
      if ($$0 == 499) {
         return new bxt() {
            @Override
            public cyy a() {
               return cqy.this.bQ.g();
            }

            @Override
            public boolean a(cyy $$0) {
               cqy.this.bQ.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bxt() {
               @Override
               public cyy a() {
                  return cqy.this.bP.r().a($$1);
               }

               @Override
               public boolean a(cyy $$0) {
                  cqy.this.bP.r().a($$1, $$0);
                  cqy.this.bP.a(cqy.this.f);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.f.g.size()) {
            return bxt.a(this.f, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.bO.b() ? bxt.a(this.bO, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gz() {
      return this.cp;
   }

   public void u(boolean $$0) {
      this.cp = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.i.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bwv fx() {
      return this.al.a(bK) == 0 ? bwv.a : bwv.b;
   }

   public void b(bwv $$0) {
      this.al.a(bK, (byte)($$0 == bwv.a ? 0 : 1));
   }

   public tz gA() {
      return this.al.a(bL);
   }

   protected void i(tz $$0) {
      this.al.a(bL, $$0);
   }

   public tz gB() {
      return this.al.a(bM);
   }

   protected void j(tz $$0) {
      this.al.a(bM, $$0);
   }

   public float gC() {
      return (float)(1.0 / this.h(byi.e) * 20.0);
   }

   public float H(float $$0) {
      return azm.a(((float)this.aS + $$0) / this.gC(), 0.0F, 1.0F);
   }

   public void gD() {
      this.aS = 0;
   }

   public cyv gE() {
      return this.cr;
   }

   @Override
   protected float aT() {
      return !this.i.b && !this.fI() ? super.aT() : 1.0F;
   }

   @Override
   public float eg() {
      return (float)this.h(byi.q);
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
   public bwg e(bxo $$0) {
      return b.getOrDefault($$0, bI);
   }

   @Override
   public ImmutableList<bxo> fN() {
      return ImmutableList.of(bxo.a, bxo.f, bxo.d);
   }

   @Override
   public cyy e(cyy $$0) {
      if (!($$0.h() instanceof czt)) {
         return cyy.k;
      } else {
         Predicate<cyy> $$1 = ((czt)$$0.h()).c();
         cyy $$2 = czt.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((czt)$$0.h()).a();

            for (int $$3 = 0; $$3 < this.f.b(); $$3++) {
               cyy $$4 = this.f.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.fU() ? new cyy(czc.ph) : cyy.k;
         }
      }
   }

   @Override
   public fei v(float $$0) {
      double $$1 = 0.22 * (this.fx() == bwv.b ? -1.0 : 1.0);
      float $$2 = azm.h($$0 * 0.5F, this.dN(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = azm.h($$0, this.aW, this.aV) * (float) (Math.PI / 180.0);
      if (this.fI() || this.fu()) {
         fei $$4 = this.h($$0);
         fei $$5 = this.dy();
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

         return this.p($$0).e(new fei($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cl()) {
         return this.p($$0).e(new fei($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cR().c() - 1.0;
         double $$13 = this.ci() ? -0.2 : 0.07;
         return this.p($$0).e(new fei($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dU() {
      return true;
   }

   public boolean gG() {
      return this.fy() && this.fA().a(czc.sa);
   }

   @Override
   public boolean dT() {
      return false;
   }

   public Optional<jd> gH() {
      return this.cs;
   }

   public void c(Optional<jd> $$0) {
      this.cs = $$0;
   }

   @Override
   public float eL() {
      return this.ck;
   }

   @Override
   public void q(float $$0) {
      super.q($$0);
      this.ck = $$0;
   }

   @Override
   public boolean dO() {
      return true;
   }

   @Override
   protected float fm() {
      if (this.i.b && !this.bZ()) {
         return this.cj() ? this.i.a() * 2.0F : this.i.a();
      } else {
         return this.cj() ? 0.025999999F : 0.02F;
      }
   }

   public boolean gI() {
      return this.g || this.bT <= 0;
   }

   public void gJ() {
      if (!this.g) {
         this.bT--;
      }
   }

   public void v(boolean $$0) {
      this.g = $$0;
      if (!this.g) {
         this.bT = 60;
      }
   }

   public double gK() {
      return this.h(byi.g);
   }

   public double gL() {
      return this.h(byi.j);
   }

   public boolean b(bwd $$0, double $$1) {
      return $$0.dQ() ? false : this.a($$0.cR(), $$1);
   }

   public boolean a(fed $$0, double $$1) {
      double $$2 = this.gL() + $$1;
      return $$0.e(this.bE()) < $$2 * $$2;
   }

   public boolean a(iu $$0, double $$1) {
      double $$2 = this.gK() + $$1;
      return new fed($$0).e(this.bE()) < $$2 * $$2;
   }

   public void w(boolean $$0) {
      this.ct = $$0;
      if ($$0) {
         this.cu = 40;
      } else {
         this.cu = 0;
      }
   }

   public boolean gM() {
      return this.ct;
   }

   public void gN() {
      if (this.cu == 0) {
         this.gO();
      }
   }

   public void gO() {
      this.cu = 0;
      this.cm = null;
      this.cl = null;
      this.ct = false;
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
