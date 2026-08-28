import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.math.IntMath;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cqi extends bwr {
   private static final Logger a = LogUtils.getLogger();
   public static final bwk bs = bwk.b;
   public static final int bt = 0;
   public static final int bu = 20;
   public static final int bv = 100;
   public static final int bw = 10;
   public static final int bx = 200;
   public static final int by = 499;
   public static final int bz = 500;
   public static final float bA = 4.5F;
   public static final float bB = 3.0F;
   public static final float bC = 1.5F;
   public static final float bD = 0.6F;
   public static final float bE = 0.6F;
   public static final float bF = 1.62F;
   private static final int b = 40;
   public static final fcu bG = new fcu(0.0, 0.6, 0.0);
   public static final bvv bH = bvv.b(0.6F, 1.8F).b(1.62F).a(bvu.a().a(bvt.b, bG));
   private static final Map<bxd, bvv> c = ImmutableMap.builder()
      .put(bxd.a, bH)
      .put(bxd.c, aC)
      .put(bxd.b, bvv.b(0.6F, 0.6F).b(0.4F))
      .put(bxd.d, bvv.b(0.6F, 0.6F).b(0.4F))
      .put(bxd.e, bvv.b(0.6F, 0.6F).b(0.4F))
      .put(bxd.f, bvv.b(0.6F, 1.5F).b(1.27F).a(bvu.a().a(bvt.b, bG)))
      .put(bxd.h, bvv.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final akg<Float> d = akk.a(cqi.class, aki.d);
   private static final akg<Integer> e = akk.a(cqi.class, aki.b);
   protected static final akg<Byte> bI = akk.a(cqi.class, aki.a);
   protected static final akg<Byte> bJ = akk.a(cqi.class, aki.a);
   protected static final akg<tw> bK = akk.a(cqi.class, aki.t);
   protected static final akg<tw> bL = akk.a(cqi.class, aki.t);
   public static final int bM = 60;
   private long f;
   final cqh g = new cqh(this);
   protected cvb bN = new cvb();
   public final cuq bO;
   public ctn bP;
   protected ctj bQ = new ctj();
   protected int bR;
   private boolean h = false;
   protected int bS = 60;
   public float bT;
   public float bU;
   public int bV;
   public double bW;
   public double bX;
   public double bY;
   public double bZ;
   public double ca;
   public double cb;
   private int i;
   protected boolean cc;
   private final cqe j = new cqe();
   public int cd;
   public int ce;
   public float cf;
   protected int cg;
   protected final float ch = 0.02F;
   private int k;
   private final GameProfile co;
   private boolean cp;
   private cxy cq = cxy.k;
   private final cxv cr = this.g();
   private Optional<jr> cs = Optional.empty();
   @Nullable
   public cqx ci;
   protected float cj;
   @Nullable
   public fcu ck;
   @Nullable
   public bvs cl;
   private boolean ct;
   private int cu;

   public cqi(dhp $$0, jj $$1, float $$2, GameProfile $$3) {
      super(bwb.bR, $$0);
      this.a_($$3.getId());
      this.co = $$3;
      this.bO = new cuq(this.g, !$$0.C, this);
      this.bP = this.bO;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
   }

   public boolean a(dhp $$0, jj $$1, dhm $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dhm.d) {
         return true;
      } else if (this.gv()) {
         return false;
      } else {
         cxy $$3 = this.fa();
         return $$3.f() || !$$3.b(new dyq($$0, $$1, false));
      }
   }

   public static bxw.a fW() {
      return bwr.ed().a(bxx.c, 1.0).a(bxx.v, 0.1F).a(bxx.e).a(bxx.q).a(bxx.g, 4.5).a(bxx.j, 3.0).a(bxx.f).a(bxx.C).a(bxx.z).a(bxx.t).a(bxx.D);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(bI, (byte)0);
      $$0.a(bJ, (byte)bs.b());
      $$0.a(bK, new tw());
      $$0.a(bL, new tw());
   }

   @Override
   public void h() {
      this.ad = this.U_();
      if (this.U_() || this.bZ()) {
         this.d(false);
      }

      if (this.bV > 0) {
         this.bV--;
      }

      if (this.fQ()) {
         this.i++;
         if (this.i > 100) {
            this.i = 100;
         }

         if (!this.dV().C && this.dV().V()) {
            this.a(false, true);
         }
      } else if (this.i > 0) {
         this.i++;
         if (this.i >= 110) {
            this.i = 0;
         }
      }

      this.ga();
      super.h();
      if (!this.dV().C && this.bP != null && !this.bP.b(this)) {
         this.p();
         this.bP = this.bO;
      }

      this.n();
      if (this instanceof aro $$0) {
         this.bQ.a($$0);
         this.a(awu.k);
         this.a(awu.l);
         if (this.bK()) {
            this.a(awu.m);
         }

         if (this.cg()) {
            this.a(awu.o);
         }

         if (!this.fQ()) {
            this.a(awu.n);
         }
      }

      int $$1 = 29999999;
      double $$2 = azk.a(this.dA(), -2.9999999E7, 2.9999999E7);
      double $$3 = azk.a(this.dG(), -2.9999999E7, 2.9999999E7);
      if ($$2 != this.dA() || $$3 != this.dG()) {
         this.a_($$2, this.dC(), $$3);
      }

      this.aR++;
      cxy $$4 = this.fa();
      if (!cxy.a(this.cq, $$4)) {
         if (!cxy.b(this.cq, $$4)) {
            this.gD();
         }

         this.cq = $$4.v();
      }

      if (!this.a(axf.a) && this.c(cyc.oX)) {
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
      this.cc = this.a(axf.a);
      return this.cc;
   }

   @Override
   public void a(boolean $$0, jj $$1) {
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
      this.a(new buw(buy.m, 200, 0, false, false, true));
   }

   private boolean c(cxu $$0) {
      for (bwc $$1 : bwc.j) {
         cxy $$2 = this.a($$1);
         dgc $$3 = $$2.a(kx.E);
         if ($$2.a($$0) && $$3 != null && $$3.b() == $$1) {
            return true;
         }
      }

      return false;
   }

   protected cxv g() {
      return new cxv();
   }

   private void n() {
      this.bW = this.bZ;
      this.bX = this.ca;
      this.bY = this.cb;
      double $$0 = this.dA() - this.bZ;
      double $$1 = this.dC() - this.ca;
      double $$2 = this.dG() - this.cb;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.bZ = this.dA();
         this.bW = this.bZ;
      }

      if ($$2 > 10.0) {
         this.cb = this.dG();
         this.bY = this.cb;
      }

      if ($$1 > 10.0) {
         this.ca = this.dC();
         this.bX = this.ca;
      }

      if ($$0 < -10.0) {
         this.bZ = this.dA();
         this.bW = this.bZ;
      }

      if ($$2 < -10.0) {
         this.cb = this.dG();
         this.bY = this.cb;
      }

      if ($$1 < -10.0) {
         this.ca = this.dC();
         this.bX = this.ca;
      }

      this.bZ += $$0 * 0.25;
      this.cb += $$2 * 0.25;
      this.ca += $$1 * 0.25;
   }

   protected void gb() {
      if (this.h(bxd.d)) {
         bxd $$0 = this.t();
         bxd $$1;
         if (this.U_() || this.bZ() || this.h($$0)) {
            $$1 = $$0;
         } else if (this.h(bxd.f)) {
            $$1 = bxd.f;
         } else {
            $$1 = bxd.d;
         }

         this.b($$1);
      }
   }

   private bxd t() {
      if (this.fQ()) {
         return bxd.c;
      } else if (this.ck()) {
         return bxd.d;
      } else if (this.fI()) {
         return bxd.b;
      } else if (this.fu()) {
         return bxd.e;
      } else {
         return this.cd() && !this.j.b ? bxd.f : bxd.a;
      }
   }

   protected boolean h(bxd $$0) {
      return this.dV().a(this, this.a($$0).a(this.dt()).h(1.0E-7));
   }

   @Override
   protected awj aV() {
      return awk.ve;
   }

   @Override
   protected awj aW() {
      return awk.vc;
   }

   @Override
   protected awj aX() {
      return awk.vd;
   }

   @Override
   public int bX() {
      return 10;
   }

   @Override
   public void a(awj $$0, float $$1, float $$2) {
      this.dV().a(this, this.dA(), this.dC(), this.dG(), $$0, this.dm(), $$1, $$2);
   }

   public void a(awj $$0, awl $$1, float $$2, float $$3) {
   }

   @Override
   public awl dm() {
      return awl.h;
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
      this.bP = this.bO;
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
         this.bT = this.bU;
         this.bU = 0.0F;
      }
   }

   @Override
   public void k_() {
      if (this.bR > 0) {
         this.bR--;
      }

      this.j();
      this.g.j();
      this.bT = this.bU;
      if (this.j.b && !this.bZ()) {
         this.k();
      }

      super.k_();
      this.eY();
      this.aW = this.dL();
      this.C((float)this.h(bxx.v));
      float $$1;
      if (this.aJ() && !this.eG() && !this.ck()) {
         $$1 = Math.min(0.1F, (float)this.dy().i());
      } else {
         $$1 = 0.0F;
      }

      this.bU = this.bU + ($$1 - this.bU) * 0.4F;
      if (this.eF() > 0.0F && !this.U_()) {
         fcp $$2;
         if (this.bZ() && !this.dk().dQ()) {
            $$2 = this.cR().b(this.dk().cR()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cR().c(1.0, 0.5, 1.0);
         }

         List<bvs> $$4 = this.dV().a_(this, $$2);
         List<bvs> $$5 = Lists.newArrayList();

         for (bvs $$6 : $$4) {
            if ($$6.aq() == bwb.V) {
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
      if (!this.dV().C && (this.Z > 0.5 || this.bj()) || this.j.b || this.fQ() || this.av) {
         this.gx();
      }
   }

   @Override
   protected void j() {
   }

   private void c(@Nullable tw $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dV().A.a(200) == 0) {
         String $$1 = $$0.l("id");
         bwb.a($$1).filter($$0x -> $$0x == bwb.aO).ifPresent($$0x -> {
            if (!ciw.a(this.dV(), this)) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), ciw.a(this.dV(), this.dV().A), this.dm(), 1.0F, ciw.a(this.dV().A));
            }
         });
      }
   }

   private void d(bvs $$0) {
      $$0.a_(this);
   }

   public int gc() {
      return this.al.a(e);
   }

   public void q(int $$0) {
      this.al.a(e, $$0);
   }

   public void r(int $$0) {
      int $$1 = this.gc();
      this.al.a(e, $$1 + $$0);
   }

   public void a(int $$0, float $$1, cxy $$2) {
      this.bo = $$0;
      this.bp = $$1;
      this.bq = $$2;
      if (!this.dV().C) {
         this.gx();
         this.c(4, true);
      }
   }

   @Nonnull
   @Override
   public cxy dZ() {
      return this.fu() && this.bq != null ? this.bq : super.dZ();
   }

   @Override
   public void a(buh $$0) {
      super.a($$0);
      this.ay();
      if (!this.U_() && this.dV() instanceof arn $$1) {
         this.b($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-azk.b((this.eL() + this.dL()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-azk.a((this.eL() + this.dL()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(awu.N);
      this.a(awu.i.b(awu.m));
      this.a(awu.i.b(awu.n));
      this.aH();
      this.c(false);
      this.c(Optional.of(jr.a(this.dV().aj(), this.dv())));
   }

   @Override
   protected void f(arn $$0) {
      super.f($$0);
      if (!$$0.O().c(dhl.d)) {
         this.gd();
         this.g.k();
      }
   }

   protected void gd() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cxy $$1 = this.g.a($$0);
         if (!$$1.f() && dej.a($$1, dei.D)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected awj e(buh $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected awj l_() {
      return awk.uU;
   }

   @Override
   public void h(cxy $$0) {
   }

   @Nullable
   public cmn a(cxy $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cmn a(cxy $$0, boolean $$1, boolean $$2) {
      if (!$$0.f() && this.dV().C) {
         this.a(btp.a);
      }

      return null;
   }

   public float c(dym $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(bxx.t);
      }

      if (bux.a(this)) {
         $$1 *= 1.0F + (float)(bux.b(this) + 1) * 0.2F;
      }

      if (this.b(buy.d)) {
         float $$2 = switch (this.c(buy.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.h(bxx.f);
      if (this.a(axf.a)) {
         $$1 *= (float)this.g(bxx.C).g();
      }

      if (!this.aJ()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dym $$0) {
      return !$$0.C() || this.g.f().b($$0);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.a_(this.co.getId());
      uc $$1 = $$0.c("Inventory", 10);
      this.g.b($$1);
      this.g.j = $$0.h("SelectedItemSlot");
      this.i = $$0.g("SleepTimer");
      this.cf = $$0.j("XpP");
      this.cd = $$0.h("XpLevel");
      this.ce = $$0.h("XpTotal");
      this.cg = $$0.h("XpSeed");
      if (this.cg == 0) {
         this.cg = this.ae.f();
      }

      this.q($$0.h("Score"));
      this.bQ.a($$0);
      this.j.b($$0);
      this.g(bxx.v).a((double)this.j.b());
      if ($$0.b("EnderItems", 9)) {
         this.bN.a($$0.c("EnderItems", 10), this.dX());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.c(jr.b.parse(uk.a, $$0.c("LastDeathLocation")).resultOrPartial(a::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         fcu.a.parse(uk.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(a::error).ifPresent($$0x -> this.ck = $$0x);
      }

      this.ct = $$0.q("ignore_fall_damage_from_current_explosion");
      this.cu = $$0.h("current_impulse_context_reset_grace_time");
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      ul.e($$0);
      $$0.a("Inventory", this.g.a(new uc()));
      $$0.a("SelectedItemSlot", this.g.j);
      $$0.a("SleepTimer", (short)this.i);
      $$0.a("XpP", this.cf);
      $$0.a("XpLevel", this.cd);
      $$0.a("XpTotal", this.ce);
      $$0.a("XpSeed", this.cg);
      $$0.a("Score", this.gc());
      this.bQ.b($$0);
      this.j.a($$0);
      $$0.a("EnderItems", this.bN.a(this.dX()));
      if (!this.gA().g()) {
         $$0.a("ShoulderEntityLeft", this.gA());
      }

      if (!this.gB().g()) {
         $$0.a("ShoulderEntityRight", this.gB());
      }

      this.gH().flatMap($$0x -> jr.b.encodeStart(uk.a, $$0x).resultOrPartial(a::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.ck != null) {
         $$0.a("current_explosion_impact_pos", (ut)fcu.a.encodeStart(uk.a, this.ck).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.ct);
      $$0.a("current_impulse_context_reset_grace_time", this.cu);
   }

   @Override
   public boolean a(arn $$0, buh $$1) {
      if (super.a($$0, $$1)) {
         return true;
      } else if ($$1.a(axb.n)) {
         return !$$0.O().c(dhl.H);
      } else if ($$1.a(axb.m)) {
         return !$$0.O().c(dhl.I);
      } else if ($$1.a(axb.i)) {
         return !$$0.O().c(dhl.J);
      } else {
         return $$1.a(axb.o) ? !$$0.O().c(dhl.K) : false;
      }
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.j.a && !$$1.a(axb.d)) {
         return false;
      } else {
         this.bc = 0;
         if (this.eG()) {
            return false;
         } else {
            this.gx();
            if ($$1.g()) {
               if ($$0.an() == btn.a) {
                  $$2 = 0.0F;
               }

               if ($$0.an() == btn.b) {
                  $$2 = Math.min($$2 / 2.0F + 1.0F, $$2);
               }

               if ($$0.an() == btn.d) {
                  $$2 = $$2 * 3.0F / 2.0F;
               }
            }

            return $$2 == 0.0F ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void d(bwr $$0) {
      super.d($$0);
      cxy $$1 = this.fG();
      if ($$0.fT() && $$1 != null) {
         this.i($$1);
      }
   }

   @Override
   public boolean ey() {
      return !this.gj().a && super.ey();
   }

   public boolean a(cqi $$0) {
      feb $$1 = this.cr();
      feb $$2 = $$0.cr();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void c(buh $$0, float $$1) {
      this.a($$0, $$1, new bwc[]{bwc.c, bwc.d, bwc.e, bwc.f});
   }

   @Override
   protected void d(buh $$0, float $$1) {
      this.a($$0, $$1, new bwc[]{bwc.f});
   }

   @Override
   protected void z(float $$0) {
      if (this.bl.a(cyc.ww)) {
         if (!this.dV().C) {
            this.b(awu.c.b(this.bl.h()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + azk.d($$0);
            btp $$2 = this.fz();
            this.bl.a($$1, this, d($$2));
            if (this.bl.f()) {
               if ($$2 == btp.a) {
                  this.a(bwc.a, cxy.k);
               } else {
                  this.a(bwc.b, cxy.k);
               }

               this.bl = cxy.k;
               this.a(awk.xo, 0.8F, 0.8F + this.dV().A.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void b(arn $$0, buh $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var8 = Math.max($$2 - this.fv(), 0.0F);
         this.F(this.fv() - ($$2 - var8));
         float $$4 = $$2 - var8;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
            this.a(awu.L, Math.round($$4 * 10.0F));
         }

         if (var8 != 0.0F) {
            this.H($$1.a());
            this.eR().a($$1, var8);
            this.d(this.eF() - var8);
            if (var8 < 3.4028235E37F) {
               this.a(awu.J, Math.round(var8 * 10.0F));
            }

            this.a(edm.o);
         }
      }
   }

   public boolean aa() {
      return false;
   }

   public void a(dwz $$0, boolean $$1) {
   }

   public void a(dgq $$0) {
   }

   public void a(dvw $$0) {
   }

   public void a(dxe $$0) {
   }

   public void a(dxf $$0) {
   }

   public void a(dxg $$0) {
   }

   public void a(dwp $$0) {
   }

   public void a(ckn $$0, btj $$1) {
   }

   public OptionalInt a(@Nullable bts $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dgo $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cxy $$0, btp $$1) {
   }

   public btq a(bvs $$0, btp $$1) {
      if (this.U_()) {
         if ($$0 instanceof bts) {
            this.a((bts)$$0);
         }

         return btq.e;
      } else {
         cxy $$2 = this.b($$1);
         cxy $$3 = $$2.v();
         btq $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.fU() && $$2 == this.b($$1) && $$2.M() < $$3.M()) {
               $$2.e($$3.M());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof bwr) {
               if (this.fU()) {
                  $$2 = $$3;
               }

               btq $$5 = $$2.a(this, (bwr)$$0, $$1);
               if ($$5.a()) {
                  this.dV().a(edm.r, $$0.dt(), edm.a.a(this));
                  if ($$2.f() && !this.fU()) {
                     this.a($$1, cxy.k);
                  }

                  return $$5;
               }
            }

            return btq.e;
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
      return !this.j.b;
   }

   @Override
   protected fcu a(fcu $$0, bwv $$1) {
      float $$2 = this.dP();
      if (!this.j.b && !($$0.e > 0.0) && ($$1 == bwv.a || $$1 == bwv.b) && this.fZ() && this.J($$2)) {
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

         return new fcu($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean J(float $$0) {
      return this.aJ() || this.Z < (double)$$0 && !this.q(0.0, 0.0, (double)$$0 - this.Z);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      fcp $$3 = this.cR();
      return this.dV().a(this, new fcp($$3.a + 1.0E-7 + $$0, $$3.b - $$2 - 1.0E-7, $$3.c + 1.0E-7 + $$1, $$3.d - 1.0E-7 + $$0, $$3.b, $$3.f - 1.0E-7 + $$1));
   }

   public void e(bvs $$0) {
      if ($$0.cB()) {
         if (!$$0.v(this)) {
            float $$1 = this.fu() ? this.bp : (float)this.h(bxx.c);
            cxy $$2 = this.dZ();
            buh $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.dW().a(this));
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.I(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gD();
            if ($$0.aq().a(axd.H) && $$0 instanceof crb $$6 && $$6.a(crc.c, this, this, true)) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), awk.uN, this.dm());
               return;
            }

            if ($$1 > 0.0F || $$4 > 0.0F) {
               boolean $$7 = $$5 > 0.9F;
               boolean $$8;
               if (this.cj() && $$7) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awk.uM, this.dm(), 1.0F, 1.0F);
                  $$8 = true;
               } else {
                  $$8 = false;
               }

               $$1 += $$2.h().a($$0, $$1, $$3);
               boolean $$10 = $$7 && this.Z > 0.0 && !this.aJ() && !this.d_() && !this.bj() && !this.b(buy.o) && !this.bZ() && $$0 instanceof bwr && !this.cj();
               if ($$10) {
                  $$1 *= 1.5F;
               }

               float $$11 = $$1 + $$4;
               boolean $$12 = false;
               if ($$7 && !$$10 && !$$8 && this.aJ()) {
                  double $$13 = this.ah().j();
                  double $$14 = (double)this.fn() * 2.5;
                  if ($$13 < azk.k($$14) && this.b(btp.a).a(axi.bG)) {
                     $$12 = true;
                  }
               }

               float $$15 = 0.0F;
               if ($$0 instanceof bwr $$16) {
                  $$15 = $$16.eF();
               }

               fcu $$17 = $$0.dy();
               boolean $$18 = $$0.b($$3, $$11);
               if ($$18) {
                  float $$19 = this.b($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                  if ($$19 > 0.0F) {
                     if ($$0 instanceof bwr $$20) {
                        $$20.p(
                           (double)($$19 * 0.5F), (double)azk.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azk.b(this.dL() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.j(
                           (double)(-azk.a(this.dL() * (float) (Math.PI / 180.0)) * $$19 * 0.5F),
                           0.1,
                           (double)(azk.b(this.dL() * (float) (Math.PI / 180.0)) * $$19 * 0.5F)
                        );
                     }

                     this.i(this.dy().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$12) {
                     float $$21 = 1.0F + (float)this.h(bxx.D) * $$1;

                     for (bwr $$23 : this.dV().a(bwr.class, $$0.cR().c(1.0, 0.25, 1.0))) {
                        if ($$23 != this && $$23 != $$0 && !this.s($$23)) {
                           if ($$23 instanceof cmc) {
                              cmc $$24 = (cmc)$$23;
                              if ($$24.t()) {
                                 continue;
                              }
                           }

                           if (this.g($$23) < 9.0) {
                              float $$25 = this.a($$23, $$21, $$3) * $$5;
                              dhp var22 = this.dV();
                              if (var22 instanceof arn) {
                                 arn $$26 = (arn)var22;
                                 if ($$23.a($$26, $$3, $$25)) {
                                    $$23.p(0.4F, (double)azk.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azk.b(this.dL() * (float) (Math.PI / 180.0))));
                                    dej.a($$26, (bvs)$$23, $$3);
                                 }
                              }
                           }
                        }
                     }

                     this.dV().a(null, this.dA(), this.dC(), this.dG(), awk.uP, this.dm(), 1.0F, 1.0F);
                     this.ge();
                  }

                  if ($$0 instanceof aro && $$0.T) {
                     ((aro)$$0).f.b(new afc($$0));
                     $$0.T = false;
                     $$0.i($$17);
                  }

                  if ($$10) {
                     this.dV().a(null, this.dA(), this.dC(), this.dG(), awk.uL, this.dm(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$10 && !$$12) {
                     if ($$7) {
                        this.dV().a(null, this.dA(), this.dC(), this.dG(), awk.uO, this.dm(), 1.0F, 1.0F);
                     } else {
                        this.dV().a(null, this.dA(), this.dC(), this.dG(), awk.uQ, this.dm(), 1.0F, 1.0F);
                     }
                  }

                  if ($$4 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  bvs $$27 = $$0;
                  if ($$0 instanceof cld) {
                     $$27 = ((cld)$$0).a;
                  }

                  boolean $$28 = false;
                  if (this.dV() instanceof arn $$29) {
                     if ($$27 instanceof bwr $$30) {
                        $$28 = $$2.a($$30, this);
                     }

                     dej.a($$29, $$0, $$3);
                  }

                  if (!this.dV().C && !$$2.f() && $$27 instanceof bwr) {
                     if ($$28) {
                        $$2.b((bwr)$$27, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.fa()) {
                           this.a(btp.a, cxy.k);
                        } else {
                           this.a(btp.b, cxy.k);
                        }
                     }
                  }

                  if ($$0 instanceof bwr) {
                     float $$31 = $$15 - ((bwr)$$0).eF();
                     this.a(awu.G, Math.round($$31 * 10.0F));
                     if (this.dV() instanceof arn && $$31 > 2.0F) {
                        int $$32 = (int)((double)$$31 * 0.5);
                        ((arn)this.dV()).a(lv.g, $$0.dA(), $$0.e(0.5), $$0.dG(), $$32, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.H(0.1F);
               } else {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awk.uN, this.dm(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(bvs $$0, float $$1, buh $$2) {
      return $$1;
   }

   @Override
   protected void g(bwr $$0) {
      this.e($$0);
   }

   public void i(cxy $$0) {
      this.gE().a($$0, 100);
      this.fE();
      this.dV().a(this, (byte)30);
   }

   public void b(bvs $$0) {
   }

   @Override
   public void c(bvs $$0) {
   }

   public void ge() {
      double $$0 = (double)(-azk.a(this.dL() * (float) (Math.PI / 180.0)));
      double $$1 = (double)azk.b(this.dL() * (float) (Math.PI / 180.0));
      if (this.dV() instanceof arn) {
         ((arn)this.dV()).a(lv.am, this.dA() + $$0, this.e(0.5), this.dG() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void gf() {
   }

   @Override
   public void a(bvs.e $$0) {
      super.a($$0);
      this.bO.a(this);
      if (this.bP != null && this.gl()) {
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
      return this.co;
   }

   public cqh gi() {
      return this.g;
   }

   public cqe gj() {
      return this.j;
   }

   @Override
   public boolean fU() {
      return this.j.d;
   }

   public boolean gk() {
      return this.j.d;
   }

   public void a(cxy $$0, cxy $$1, ctx $$2) {
   }

   public boolean gl() {
      return this.bP != this.bO;
   }

   public boolean gm() {
      return true;
   }

   public Either<cqi.a, baq> a(jj $$0) {
      this.b($$0);
      this.i = 0;
      return Either.right(baq.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fR();
      if (this.dV() instanceof arn && $$1) {
         ((arn)this.dV()).f();
      }

      this.i = $$0 ? 0 : 100;
   }

   @Override
   public void fR() {
      this.a(true, true);
   }

   public boolean gn() {
      return this.fQ() && this.i >= 100;
   }

   public int go() {
      return this.i;
   }

   public void a(wv $$0, boolean $$1) {
   }

   public void a(ald $$0) {
      this.b(awu.i.b($$0));
   }

   public void a(ald $$0, int $$1) {
      this.a(awu.i.b($$0), $$1);
   }

   public void b(awr<?> $$0) {
      this.a($$0, 1);
   }

   public void a(awr<?> $$0, int $$1) {
   }

   public void a(awr<?> $$0) {
   }

   public int a(Collection<dcq<?>> $$0) {
      return 0;
   }

   public void a(dcq<?> $$0, List<cxy> $$1) {
   }

   public void b(List<alc<dcl<?>>> $$0) {
   }

   public int b(Collection<dcq<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(fcu $$0) {
      if (this.bZ()) {
         super.a_($$0);
      } else {
         if (this.ck()) {
            double $$1 = this.bT().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.be || !this.dV().b_(jj.a(this.dA(), this.dC() + 1.0 - 0.1, this.dG())).c()) {
               fcu $$3 = this.dy();
               this.i($$3.b(0.0, ($$1 - $$3.e) * $$2, 0.0));
            }
         }

         if (this.gj().b) {
            double $$4 = this.dy().e;
            super.a_($$0);
            this.i(this.dy().a(jo.a.b, $$4 * 0.6));
         } else {
            super.a_($$0);
         }
      }
   }

   @Override
   protected boolean fs() {
      return !this.j.b && super.fs();
   }

   @Override
   public void bo() {
      if (this.j.b) {
         this.i(false);
      } else {
         super.bo();
      }
   }

   protected boolean i(jj $$0) {
      return !this.dV().a_($$0).j(this.dV(), $$0);
   }

   @Override
   public float fn() {
      return (float)this.h(bxx.v);
   }

   @Override
   public boolean a(double $$0, float $$1, buh $$2) {
      if (this.j.c) {
         return false;
      } else {
         if ($$0 >= 2.0) {
            this.a(awu.t, (int)Math.round($$0 * 100.0));
         }

         boolean $$3 = this.ck != null && this.ct;
         double $$4;
         if ($$3) {
            $$4 = Math.min($$0, this.ck.e - this.dC());
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
   protected void b(jj $$0, dym $$1) {
      if (this.bj()) {
         this.aY();
         this.b($$1);
      } else {
         jj $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dym $$3 = this.dV().a_($$2);
            if ($$3.a(awz.bq)) {
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
   public bwr.a eN() {
      return new bwr.a(awk.vb, awk.uR);
   }

   @Override
   public boolean a(arn $$0, bwr $$1) {
      this.b(awu.g.b($$1.aq()));
      return true;
   }

   @Override
   public void a(dym $$0, fcu $$1) {
      if (!this.j.b) {
         super.a($$0, $$1);
      }

      this.gN();
   }

   public void d(int $$0) {
      this.r($$0);
      this.cf = this.cf + (float)$$0 / (float)this.gs();
      this.ce = azk.a(this.ce + $$0, 0, Integer.MAX_VALUE);

      while (this.cf < 0.0F) {
         float $$1 = this.cf * (float)this.gs();
         if (this.cd > 0) {
            this.c(-1);
            this.cf = 1.0F + $$1 / (float)this.gs();
         } else {
            this.c(-1);
            this.cf = 0.0F;
         }
      }

      while (this.cf >= 1.0F) {
         this.cf = (this.cf - 1.0F) * (float)this.gs();
         this.c(1);
         this.cf = this.cf / (float)this.gs();
      }
   }

   public int gr() {
      return this.cg;
   }

   public void a(cxy $$0, int $$1) {
      this.cd -= $$1;
      if (this.cd < 0) {
         this.cd = 0;
         this.cf = 0.0F;
         this.ce = 0;
      }

      this.cg = this.ae.f();
   }

   public void c(int $$0) {
      this.cd = IntMath.saturatedAdd(this.cd, $$0);
      if (this.cd < 0) {
         this.cd = 0;
         this.cf = 0.0F;
         this.ce = 0;
      }

      if ($$0 > 0 && this.cd % 5 == 0 && (float)this.k < (float)this.af - 100.0F) {
         float $$1 = this.cd > 30 ? 1.0F : (float)this.cd / 30.0F;
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awk.va, this.dm(), $$1 * 0.75F, 1.0F);
         this.k = this.af;
      }
   }

   public int gs() {
      if (this.cd >= 30) {
         return 112 + (this.cd - 30) * 9;
      } else {
         return this.cd >= 15 ? 37 + (this.cd - 15) * 5 : 7 + this.cd * 2;
      }
   }

   public void H(float $$0) {
      if (!this.j.a) {
         if (!this.dV().C) {
            this.bQ.a($$0);
         }
      }
   }

   public Optional<cpn> ac() {
      return Optional.empty();
   }

   public ctj gt() {
      return this.bQ;
   }

   public boolean t(boolean $$0) {
      return this.j.a || $$0 || this.bQ.b();
   }

   public boolean gu() {
      return this.eF() > 0.0F && this.eF() < this.eT();
   }

   public boolean gv() {
      return this.j.e;
   }

   public boolean a(jj $$0, jo $$1, cxy $$2) {
      if (this.j.e) {
         return true;
      } else {
         jj $$3 = $$0.a($$1.g());
         dyq $$4 = new dyq(this.dV(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int e(arn $$0) {
      return !$$0.O().c(dhl.d) && !this.U_() ? Math.min(this.cd * 7, 100) : 0;
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
   protected bvs.d bg() {
      return this.j.b || this.aJ() && this.cg() ? bvs.d.a : bvs.d.d;
   }

   public void x() {
   }

   @Override
   public wv al() {
      return wv.b(this.co.getName());
   }

   public cvb gw() {
      return this.bN;
   }

   @Override
   public cxy a(bwc $$0) {
      if ($$0 == bwc.a) {
         return this.g.f();
      } else if ($$0 == bwc.b) {
         return this.g.i.getFirst();
      } else {
         return $$0.a() == bwc.a.b ? this.g.h.get($$0.b()) : cxy.k;
      }
   }

   @Override
   protected boolean b(bwc $$0) {
      return $$0.a() == bwc.a.b;
   }

   @Override
   public void a(bwc $$0, cxy $$1) {
      this.d($$1);
      if ($$0 == bwc.a) {
         this.a($$0, this.g.g.set(this.g.j, $$1), $$1);
      } else if ($$0 == bwc.b) {
         this.a($$0, this.g.i.set(0, $$1), $$1);
      } else if ($$0.a() == bwc.a.b) {
         this.a($$0, this.g.h.set($$0.b(), $$1), $$1);
      }
   }

   public boolean j(cxy $$0) {
      return this.g.f($$0);
   }

   public boolean h(tw $$0) {
      if (this.bZ() || !this.aJ() || this.bj() || this.av) {
         return false;
      } else if (this.gA().g()) {
         this.i($$0);
         this.f = this.dV().ae();
         return true;
      } else if (this.gB().g()) {
         this.j($$0);
         this.f = this.dV().ae();
         return true;
      } else {
         return false;
      }
   }

   protected void gx() {
      if (this.f + 20L < this.dV().ae()) {
         this.k(this.gA());
         this.i(new tw());
         this.k(this.gB());
         this.j(new tw());
      }
   }

   private void k(tw $$0) {
      if (!this.dV().C && !$$0.g()) {
         bwb.a($$0, this.dV(), bwa.r).ifPresent($$0x -> {
            if ($$0x instanceof bxn $$1) {
               $$1.j(this);
            }

            $$0x.a_(this.dA(), this.dC() + 0.7F, this.dG());
            ((arn)this.dV()).c($$0x);
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
      return !this.j.b && !this.U_() && super.ck();
   }

   public abstract boolean b();

   @Override
   public boolean cJ() {
      return !this.j.b;
   }

   public fdz gy() {
      return this.dV().R();
   }

   @Override
   public wv m_() {
      xj $$0 = fdu.a(this.cr(), this.al());
      return this.a($$0);
   }

   private xj a(xj $$0) {
      String $$1 = this.gh().getName();
      return $$0.a($$1x -> $$1x.a(new wt.g("/tell " + $$1 + " ")).a(this.cQ()).a($$1));
   }

   @Override
   public String cI() {
      return this.gh().getName();
   }

   @Override
   protected void G(float $$0) {
      this.au().a(d, $$0);
   }

   @Override
   public float fv() {
      return this.au().a(d);
   }

   public boolean a(cqj $$0) {
      return (this.au().a(bI) & $$0.a()) == $$0.a();
   }

   @Override
   public bxi a_(int $$0) {
      if ($$0 == 499) {
         return new bxi() {
            @Override
            public cxy a() {
               return cqi.this.bP.g();
            }

            @Override
            public boolean a(cxy $$0) {
               cqi.this.bP.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bxi() {
               @Override
               public cxy a() {
                  return cqi.this.bO.r().a($$1);
               }

               @Override
               public boolean a(cxy $$0) {
                  cqi.this.bO.r().a($$1, $$0);
                  cqi.this.bO.a(cqi.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.g.size()) {
            return bxi.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.bN.b() ? bxi.a(this.bN, $$2) : super.a_($$0);
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
      super.h(this.j.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bwk fx() {
      return this.al.a(bJ) == 0 ? bwk.a : bwk.b;
   }

   public void b(bwk $$0) {
      this.al.a(bJ, (byte)($$0 == bwk.a ? 0 : 1));
   }

   public tw gA() {
      return this.al.a(bK);
   }

   protected void i(tw $$0) {
      this.al.a(bK, $$0);
   }

   public tw gB() {
      return this.al.a(bL);
   }

   protected void j(tw $$0) {
      this.al.a(bL, $$0);
   }

   public float gC() {
      return (float)(1.0 / this.h(bxx.e) * 20.0);
   }

   public float I(float $$0) {
      return azk.a(((float)this.aR + $$0) / this.gC(), 0.0F, 1.0F);
   }

   public void gD() {
      this.aR = 0;
   }

   public cxv gE() {
      return this.cr;
   }

   @Override
   protected float aT() {
      return !this.j.b && !this.fI() ? super.aT() : 1.0F;
   }

   @Override
   public float eg() {
      return (float)this.h(bxx.q);
   }

   public boolean gF() {
      return this.j.d && this.G() >= 2;
   }

   public int G() {
      return 0;
   }

   public boolean s(int $$0) {
      return this.G() >= $$0;
   }

   @Override
   public bvv e(bxd $$0) {
      return c.getOrDefault($$0, bH);
   }

   @Override
   public ImmutableList<bxd> fN() {
      return ImmutableList.of(bxd.a, bxd.f, bxd.d);
   }

   @Override
   public cxy e(cxy $$0) {
      if (!($$0.h() instanceof cyt)) {
         return cxy.k;
      } else {
         Predicate<cxy> $$1 = ((cyt)$$0.h()).d();
         cxy $$2 = cyt.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((cyt)$$0.h()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cxy $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.fU() ? new cxy(cyc.pf) : cxy.k;
         }
      }
   }

   @Override
   public fcu v(float $$0) {
      double $$1 = 0.22 * (this.fx() == bwk.b ? -1.0 : 1.0);
      float $$2 = azk.h($$0 * 0.5F, this.dN(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = azk.h($$0, this.aV, this.aU) * (float) (Math.PI / 180.0);
      if (this.fI() || this.fu()) {
         fcu $$4 = this.h($$0);
         fcu $$5 = this.dy();
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

         return this.p($$0).e(new fcu($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cl()) {
         return this.p($$0).e(new fcu($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cR().c() - 1.0;
         double $$13 = this.ci() ? -0.2 : 0.07;
         return this.p($$0).e(new fcu($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dU() {
      return true;
   }

   public boolean gG() {
      return this.fy() && this.fA().a(cyc.rY);
   }

   @Override
   public boolean dT() {
      return false;
   }

   public Optional<jr> gH() {
      return this.cs;
   }

   public void c(Optional<jr> $$0) {
      this.cs = $$0;
   }

   @Override
   public float eL() {
      return this.cj;
   }

   @Override
   public void q(float $$0) {
      super.q($$0);
      this.cj = $$0;
   }

   @Override
   public boolean dO() {
      return true;
   }

   @Override
   protected float fm() {
      if (this.j.b && !this.bZ()) {
         return this.cj() ? this.j.a() * 2.0F : this.j.a();
      } else {
         return this.cj() ? 0.025999999F : 0.02F;
      }
   }

   public boolean gI() {
      return this.h || this.bS <= 0;
   }

   public void gJ() {
      if (!this.h) {
         this.bS--;
      }
   }

   public void v(boolean $$0) {
      this.h = $$0;
      if (!this.h) {
         this.bS = 60;
      }
   }

   public double gK() {
      return this.h(bxx.g);
   }

   public double gL() {
      return this.h(bxx.j);
   }

   public boolean b(bvs $$0, double $$1) {
      return $$0.dQ() ? false : this.a($$0.cR(), $$1);
   }

   public boolean a(fcp $$0, double $$1) {
      double $$2 = this.gL() + $$1;
      return $$0.e(this.bE()) < $$2 * $$2;
   }

   public boolean a(jj $$0, double $$1) {
      double $$2 = this.gK() + $$1;
      return new fcp($$0).e(this.bE()) < $$2 * $$2;
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
      this.cl = null;
      this.ck = null;
      this.ct = false;
   }

   public boolean gP() {
      return false;
   }

   @Override
   public boolean d_() {
      return this.j.b ? false : super.d_();
   }

   public static enum a {
      a,
      b(wv.c("block.minecraft.bed.no_sleep")),
      c(wv.c("block.minecraft.bed.too_far_away")),
      d(wv.c("block.minecraft.bed.obstructed")),
      e,
      f(wv.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final wv g;

      private a() {
         this.g = null;
      }

      private a(final wv $$0) {
         this.g = $$0;
      }

      @Nullable
      public wv a() {
         return this.g;
      }
   }
}
