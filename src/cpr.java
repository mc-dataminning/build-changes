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

public abstract class cpr extends bvy {
   private static final Logger a = LogUtils.getLogger();
   public static final bvr bt = bvr.b;
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
   private static final int b = 40;
   public static final fbx bH = new fbx(0.0, 0.6, 0.0);
   public static final bvd bI = bvd.b(0.6F, 1.8F).b(1.62F).a(bvc.a().a(bvb.b, bH));
   private static final Map<bwk, bvd> c = ImmutableMap.builder()
      .put(bwk.a, bI)
      .put(bwk.c, aD)
      .put(bwk.b, bvd.b(0.6F, 0.6F).b(0.4F))
      .put(bwk.d, bvd.b(0.6F, 0.6F).b(0.4F))
      .put(bwk.e, bvd.b(0.6F, 0.6F).b(0.4F))
      .put(bwk.f, bvd.b(0.6F, 1.5F).b(1.27F).a(bvc.a().a(bvb.b, bH)))
      .put(bwk.h, bvd.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final ajx<Float> d = akb.a(cpr.class, ajz.d);
   private static final ajx<Integer> e = akb.a(cpr.class, ajz.b);
   protected static final ajx<Byte> bJ = akb.a(cpr.class, ajz.a);
   protected static final ajx<Byte> bK = akb.a(cpr.class, ajz.a);
   protected static final ajx<tq> bL = akb.a(cpr.class, ajz.t);
   protected static final ajx<tq> bM = akb.a(cpr.class, ajz.t);
   public static final int bN = 60;
   private long f;
   final cpq g = new cpq(this);
   protected cuk bO = new cuk();
   public final ctz bP;
   public csw bQ;
   protected css bR = new css();
   protected int bS;
   private boolean h = false;
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
   private int i;
   protected boolean cd;
   private final cpn j = new cpn();
   public int ce;
   public int cf;
   public float cg;
   protected int ch;
   protected final float ci = 0.02F;
   private int k;
   private final GameProfile cp;
   private boolean cq;
   private cxh cr = cxh.k;
   private final cxe cs = this.g();
   private Optional<jq> ct = Optional.empty();
   @Nullable
   public cqg cj;
   protected float ck;
   @Nullable
   public fbx cl;
   @Nullable
   public bva cm;
   private boolean cu;
   private int cv;

   public cpr(dgz $$0, ji $$1, float $$2, GameProfile $$3) {
      super(bvi.bR, $$0);
      this.a_($$3.getId());
      this.cp = $$3;
      this.bP = new ctz(this.g, !$$0.C, this);
      this.bQ = this.bP;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
   }

   public boolean a(dgz $$0, ji $$1, dgw $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dgw.d) {
         return true;
      } else if (this.gy()) {
         return false;
      } else {
         cxh $$3 = this.eZ();
         return $$3.f() || !$$3.b(new dxu($$0, $$1, false));
      }
   }

   public static bxf.a fZ() {
      return bvy.ec().a(bxg.c, 1.0).a(bxg.v, 0.1F).a(bxg.e).a(bxg.q).a(bxg.g, 4.5).a(bxg.j, 3.0).a(bxg.f).a(bxg.C).a(bxg.z).a(bxg.t).a(bxg.D);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(bJ, (byte)0);
      $$0.a(bK, (byte)bt.b());
      $$0.a(bL, new tq());
      $$0.a(bM, new tq());
   }

   @Override
   public void h() {
      this.ad = this.U_();
      if (this.U_() || this.bY()) {
         this.d(false);
      }

      if (this.bW > 0) {
         this.bW--;
      }

      if (this.fT()) {
         this.i++;
         if (this.i > 100) {
            this.i = 100;
         }

         if (!this.dU().C && this.dU().V()) {
            this.a(false, true);
         }
      } else if (this.i > 0) {
         this.i++;
         if (this.i >= 110) {
            this.i = 0;
         }
      }

      this.gd();
      super.h();
      if (!this.dU().C && this.bQ != null && !this.bQ.b(this)) {
         this.p();
         this.bQ = this.bP;
      }

      this.n();
      if (this instanceof are $$0) {
         this.bR.a($$0);
         this.a(awk.k);
         this.a(awk.l);
         if (this.bJ()) {
            this.a(awk.m);
         }

         if (this.cf()) {
            this.a(awk.o);
         }

         if (!this.fT()) {
            this.a(awk.n);
         }
      }

      int $$1 = 29999999;
      double $$2 = ayz.a(this.dz(), -2.9999999E7, 2.9999999E7);
      double $$3 = ayz.a(this.dF(), -2.9999999E7, 2.9999999E7);
      if ($$2 != this.dz() || $$3 != this.dF()) {
         this.a_($$2, this.dB(), $$3);
      }

      this.aS++;
      cxh $$4 = this.eZ();
      if (!cxh.a(this.cr, $$4)) {
         if (!cxh.b(this.cr, $$4)) {
            this.gG();
         }

         this.cr = $$4.v();
      }

      if (!this.a(awv.a) && this.c(cxl.oV)) {
         this.m();
      }

      this.cs.a();
      this.ge();
      if (this.cv > 0) {
         this.cv--;
      }
   }

   @Override
   protected float fr() {
      return this.fI() ? 15.0F : super.fr();
   }

   public boolean ga() {
      return this.cc();
   }

   protected boolean gb() {
      return this.cc();
   }

   protected boolean gc() {
      return this.cc();
   }

   protected boolean gd() {
      this.cd = this.a(awv.a);
      return this.cd;
   }

   @Override
   public void a(boolean $$0, ji $$1) {
      if (!this.gm().b) {
         super.a($$0, $$1);
      }
   }

   @Override
   public void l(boolean $$0) {
      if (!this.gm().b) {
         super.l($$0);
      }
   }

   private void m() {
      this.a(new bue(bug.m, 200, 0, false, false, true));
   }

   private boolean c(cxd $$0) {
      for (bvj $$1 : bvj.i) {
         cxh $$2 = this.a($$1);
         dfm $$3 = $$2.a(kv.E);
         if ($$2.a($$0) && $$3 != null && $$3.a() == $$1) {
            return true;
         }
      }

      return false;
   }

   protected cxe g() {
      return new cxe();
   }

   private void n() {
      this.bX = this.ca;
      this.bY = this.cb;
      this.bZ = this.cc;
      double $$0 = this.dz() - this.ca;
      double $$1 = this.dB() - this.cb;
      double $$2 = this.dF() - this.cc;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.ca = this.dz();
         this.bX = this.ca;
      }

      if ($$2 > 10.0) {
         this.cc = this.dF();
         this.bZ = this.cc;
      }

      if ($$1 > 10.0) {
         this.cb = this.dB();
         this.bY = this.cb;
      }

      if ($$0 < -10.0) {
         this.ca = this.dz();
         this.bX = this.ca;
      }

      if ($$2 < -10.0) {
         this.cc = this.dF();
         this.bZ = this.cc;
      }

      if ($$1 < -10.0) {
         this.cb = this.dB();
         this.bY = this.cb;
      }

      this.ca += $$0 * 0.25;
      this.cc += $$2 * 0.25;
      this.cb += $$1 * 0.25;
   }

   protected void ge() {
      if (this.h(bwk.d)) {
         bwk $$0 = this.t();
         bwk $$1;
         if (this.U_() || this.bY() || this.h($$0)) {
            $$1 = $$0;
         } else if (this.h(bwk.f)) {
            $$1 = bwk.f;
         } else {
            $$1 = bwk.d;
         }

         this.b($$1);
      }
   }

   private bwk t() {
      if (this.fT()) {
         return bwk.c;
      } else if (this.cj()) {
         return bwk.d;
      } else if (this.fL()) {
         return bwk.b;
      } else if (this.fx()) {
         return bwk.e;
      } else {
         return this.cc() && !this.j.b ? bwk.f : bwk.a;
      }
   }

   protected boolean h(bwk $$0) {
      return this.dU().a(this, this.a($$0).a(this.ds()).h(1.0E-7));
   }

   @Override
   protected avz aV() {
      return awa.ve;
   }

   @Override
   protected avz aW() {
      return awa.vc;
   }

   @Override
   protected avz aX() {
      return awa.vd;
   }

   @Override
   public int bW() {
      return 10;
   }

   @Override
   public void a(avz $$0, float $$1, float $$2) {
      this.dU().a(this, this.dz(), this.dB(), this.dF(), $$0, this.dl(), $$1, $$2);
   }

   public void a(avz $$0, awb $$1, float $$2, float $$3) {
   }

   @Override
   public awb dl() {
      return awb.h;
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
      this.bQ = this.bP;
   }

   @Override
   protected void q() {
   }

   @Override
   public void r() {
      if (!this.dU().C && this.gb() && this.bY()) {
         this.bO();
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
      this.g.j();
      this.bU = this.bV;
      if (this.j.b && !this.bY()) {
         this.k();
      }

      super.k_();
      this.eX();
      this.aX = this.dK();
      this.C((float)this.h(bxg.v));
      float $$1;
      if (this.aJ() && !this.eF() && !this.cj()) {
         $$1 = Math.min(0.1F, (float)this.dx().i());
      } else {
         $$1 = 0.0F;
      }

      this.bV = this.bV + ($$1 - this.bV) * 0.4F;
      if (this.eE() > 0.0F && !this.U_()) {
         fbs $$2;
         if (this.bY() && !this.dj().dP()) {
            $$2 = this.cQ().b(this.dj().cQ()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cQ().c(1.0, 0.5, 1.0);
         }

         List<bva> $$4 = this.dU().a_(this, $$2);
         List<bva> $$5 = Lists.newArrayList();

         for (bva $$6 : $$4) {
            if ($$6.aq() == bvi.V) {
               $$5.add($$6);
            } else if (!$$6.dP()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(af.a($$5, this.ae));
         }
      }

      this.c(this.gD());
      this.c(this.gE());
      if (!this.dU().C && (this.Z > 0.5F || this.bj()) || this.j.b || this.fT() || this.av) {
         this.gA();
      }
   }

   protected void j() {
   }

   private void c(@Nullable tq $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dU().A.a(200) == 0) {
         String $$1 = $$0.l("id");
         bvi.a($$1).filter($$0x -> $$0x == bvi.aO).ifPresent($$0x -> {
            if (!cif.a(this.dU(), this)) {
               this.dU().a(null, this.dz(), this.dB(), this.dF(), cif.a(this.dU(), this.dU().A), this.dl(), 1.0F, cif.a(this.dU().A));
            }
         });
      }
   }

   private void d(bva $$0) {
      $$0.a_(this);
   }

   public int gf() {
      return this.al.a(e);
   }

   public void q(int $$0) {
      this.al.a(e, $$0);
   }

   public void r(int $$0) {
      int $$1 = this.gf();
      this.al.a(e, $$1 + $$0);
   }

   public void a(int $$0, float $$1, cxh $$2) {
      this.bp = $$0;
      this.bq = $$1;
      this.br = $$2;
      if (!this.dU().C) {
         this.gA();
         this.c(4, true);
      }
   }

   @Nonnull
   @Override
   public cxh dY() {
      return this.fx() && this.br != null ? this.br : super.dY();
   }

   @Override
   public void a(btp $$0) {
      super.a($$0);
      this.ay();
      if (!this.U_() && this.dU() instanceof ard $$1) {
         this.b($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-ayz.b((this.eK() + this.dK()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-ayz.a((this.eK() + this.dK()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(awk.N);
      this.a(awk.i.b(awk.m));
      this.a(awk.i.b(awk.n));
      this.aH();
      this.c(false);
      this.c(Optional.of(jq.a(this.dU().aj(), this.du())));
   }

   @Override
   protected void f(ard $$0) {
      super.f($$0);
      if (!$$0.O().b(dgv.d)) {
         this.gg();
         this.g.k();
      }
   }

   protected void gg() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cxh $$1 = this.g.a($$0);
         if (!$$1.f() && ddt.a($$1, dds.D)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected avz e(btp $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected avz l_() {
      return awa.uU;
   }

   @Override
   public void g(cxh $$0) {
   }

   @Nullable
   public clw a(cxh $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public clw a(cxh $$0, boolean $$1, boolean $$2) {
      if (!$$0.f() && this.dU().C) {
         this.a(bsx.a);
      }

      return null;
   }

   public float c(dxq $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(bxg.t);
      }

      if (buf.a(this)) {
         $$1 *= 1.0F + (float)(buf.b(this) + 1) * 0.2F;
      }

      if (this.b(bug.d)) {
         float $$2 = switch (this.c(bug.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.h(bxg.f);
      if (this.a(awv.a)) {
         $$1 *= (float)this.g(bxg.C).g();
      }

      if (!this.aJ()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dxq $$0) {
      return !$$0.C() || this.g.f().b($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a_(this.cp.getId());
      tw $$1 = $$0.c("Inventory", 10);
      this.g.b($$1);
      this.g.j = $$0.h("SelectedItemSlot");
      this.i = $$0.g("SleepTimer");
      this.cg = $$0.j("XpP");
      this.ce = $$0.h("XpLevel");
      this.cf = $$0.h("XpTotal");
      this.ch = $$0.h("XpSeed");
      if (this.ch == 0) {
         this.ch = this.ae.f();
      }

      this.q($$0.h("Score"));
      this.bR.a($$0);
      this.j.b($$0);
      this.g(bxg.v).a((double)this.j.b());
      if ($$0.b("EnderItems", 9)) {
         this.bO.a($$0.c("EnderItems", 10), this.dW());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.c(jq.b.parse(ue.a, $$0.c("LastDeathLocation")).resultOrPartial(a::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         fbx.a.parse(ue.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(a::error).ifPresent($$0x -> this.cl = $$0x);
      }

      this.cu = $$0.q("ignore_fall_damage_from_current_explosion");
      this.cv = $$0.h("current_impulse_context_reset_grace_time");
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      uf.e($$0);
      $$0.a("Inventory", this.g.a(new tw()));
      $$0.a("SelectedItemSlot", this.g.j);
      $$0.a("SleepTimer", (short)this.i);
      $$0.a("XpP", this.cg);
      $$0.a("XpLevel", this.ce);
      $$0.a("XpTotal", this.cf);
      $$0.a("XpSeed", this.ch);
      $$0.a("Score", this.gf());
      this.bR.b($$0);
      this.j.a($$0);
      $$0.a("EnderItems", this.bO.a(this.dW()));
      if (!this.gD().g()) {
         $$0.a("ShoulderEntityLeft", this.gD());
      }

      if (!this.gE().g()) {
         $$0.a("ShoulderEntityRight", this.gE());
      }

      this.gK().flatMap($$0x -> jq.b.encodeStart(ue.a, $$0x).resultOrPartial(a::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cl != null) {
         $$0.a("current_explosion_impact_pos", (un)fbx.a.encodeStart(ue.a, this.cl).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cu);
      $$0.a("current_impulse_context_reset_grace_time", this.cv);
   }

   @Override
   public boolean a(ard $$0, btp $$1) {
      if (super.a($$0, $$1)) {
         return true;
      } else if ($$1.a(awr.n)) {
         return !$$0.O().b(dgv.H);
      } else if ($$1.a(awr.m)) {
         return !$$0.O().b(dgv.I);
      } else if ($$1.a(awr.i)) {
         return !$$0.O().b(dgv.J);
      } else {
         return $$1.a(awr.o) ? !$$0.O().b(dgv.K) : false;
      }
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.j.a && !$$1.a(awr.d)) {
         return false;
      } else {
         this.bd = 0;
         if (this.eF()) {
            return false;
         } else {
            this.gA();
            if ($$1.g()) {
               if ($$0.an() == bsv.a) {
                  $$2 = 0.0F;
               }

               if ($$0.an() == bsv.b) {
                  $$2 = Math.min($$2 / 2.0F + 1.0F, $$2);
               }

               if ($$0.an() == bsv.d) {
                  $$2 = $$2 * 3.0F / 2.0F;
               }
            }

            return $$2 == 0.0F ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void d(bvy $$0) {
      super.d($$0);
      cxh $$1 = this.fJ();
      if ($$0.fW() && $$1 != null) {
         this.h($$1);
      }
   }

   @Override
   public boolean ex() {
      return !this.gm().a && super.ex();
   }

   public boolean a(cpr $$0) {
      fde $$1 = this.cq();
      fde $$2 = $$0.cq();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void c(btp $$0, float $$1) {
      this.a($$0, $$1, new bvj[]{bvj.c, bvj.d, bvj.e, bvj.f});
   }

   @Override
   protected void d(btp $$0, float $$1) {
      this.a($$0, $$1, new bvj[]{bvj.f});
   }

   @Override
   protected void z(float $$0) {
      if (this.bm.a(cxl.wu)) {
         if (!this.dU().C) {
            this.b(awk.c.b(this.bm.h()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + ayz.d($$0);
            bsx $$2 = this.fC();
            this.bm.a($$1, this, d($$2));
            if (this.bm.f()) {
               if ($$2 == bsx.a) {
                  this.a(bvj.a, cxh.k);
               } else {
                  this.a(bvj.b, cxh.k);
               }

               this.bm = cxh.k;
               this.a(awa.xo, 0.8F, 0.8F + this.dU().A.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void b(ard $$0, btp $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var8 = Math.max($$2 - this.fy(), 0.0F);
         this.F(this.fy() - ($$2 - var8));
         float $$4 = $$2 - var8;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
            this.a(awk.L, Math.round($$4 * 10.0F));
         }

         if (var8 != 0.0F) {
            this.H($$1.a());
            this.eQ().a($$1, var8);
            this.d(this.eE() - var8);
            if (var8 < 3.4028235E37F) {
               this.a(awk.J, Math.round(var8 * 10.0F));
            }

            this.a(ecp.o);
         }
      }
   }

   public boolean aa() {
      return false;
   }

   public void a(dwf $$0, boolean $$1) {
   }

   public void a(dga $$0) {
   }

   public void a(dvc $$0) {
   }

   public void a(dwk $$0) {
   }

   public void a(dvv $$0) {
   }

   public void a(cjw $$0, bsr $$1) {
   }

   public OptionalInt a(@Nullable bta $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dfy $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cxh $$0, bsx $$1) {
   }

   public bsy a(bva $$0, bsx $$1) {
      if (this.U_()) {
         if ($$0 instanceof bta) {
            this.a((bta)$$0);
         }

         return bsy.e;
      } else {
         cxh $$2 = this.b($$1);
         cxh $$3 = $$2.v();
         bsy $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.fX() && $$2 == this.b($$1) && $$2.M() < $$3.M()) {
               $$2.e($$3.M());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof bvy) {
               if (this.fX()) {
                  $$2 = $$3;
               }

               bsy $$5 = $$2.a(this, (bvy)$$0, $$1);
               if ($$5.a()) {
                  this.dU().a(ecp.r, $$0.ds(), ecp.a.a(this));
                  if ($$2.f() && !this.fX()) {
                     this.a($$1, cxh.k);
                  }

                  return $$5;
               }
            }

            return bsy.e;
         }
      }
   }

   @Override
   public void ae() {
      super.ae();
      this.J = 0;
   }

   @Override
   protected boolean fi() {
      return super.fi() || this.fT();
   }

   @Override
   public boolean ek() {
      return !this.j.b;
   }

   @Override
   protected fbx a(fbx $$0, bwc $$1) {
      float $$2 = this.dO();
      if (!this.j.b && !($$0.e > 0.0) && ($$1 == bwc.a || $$1 == bwc.b) && this.gc() && this.J($$2)) {
         double $$3 = $$0.d;
         double $$4 = $$0.f;
         double $$5 = 0.05;
         double $$6 = Math.signum($$3) * 0.05;

         double $$7;
         for ($$7 = Math.signum($$4) * 0.05; $$3 != 0.0 && this.b($$3, 0.0, $$2); $$3 -= $$6) {
            if (Math.abs($$3) <= 0.05) {
               $$3 = 0.0;
               break;
            }
         }

         while ($$4 != 0.0 && this.b(0.0, $$4, $$2)) {
            if (Math.abs($$4) <= 0.05) {
               $$4 = 0.0;
               break;
            }

            $$4 -= $$7;
         }

         while ($$3 != 0.0 && $$4 != 0.0 && this.b($$3, $$4, $$2)) {
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

         return new fbx($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean J(float $$0) {
      return this.aJ() || this.Z < $$0 && !this.b(0.0, 0.0, $$0 - this.Z);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      fbs $$3 = this.cQ();
      return this.dU().a(this, new fbs($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(bva $$0) {
      if ($$0.cA()) {
         if (!$$0.v(this)) {
            float $$1 = this.fx() ? this.bq : (float)this.h(bxg.c);
            cxh $$2 = this.dY();
            btp $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.dV().a(this));
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.I(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gG();
            if ($$0.aq().a(awt.H) && $$0 instanceof cqk $$6 && $$6.a(cql.c, this, this, true)) {
               this.dU().a(null, this.dz(), this.dB(), this.dF(), awa.uN, this.dl());
               return;
            }

            if ($$1 > 0.0F || $$4 > 0.0F) {
               boolean $$7 = $$5 > 0.9F;
               boolean $$8;
               if (this.ci() && $$7) {
                  this.dU().a(null, this.dz(), this.dB(), this.dF(), awa.uM, this.dl(), 1.0F, 1.0F);
                  $$8 = true;
               } else {
                  $$8 = false;
               }

               $$1 += $$2.h().a($$0, $$1, $$3);
               boolean $$10 = $$7
                  && this.Z > 0.0F
                  && !this.aJ()
                  && !this.d_()
                  && !this.bj()
                  && !this.b(bug.o)
                  && !this.bY()
                  && $$0 instanceof bvy
                  && !this.ci();
               if ($$10) {
                  $$1 *= 1.5F;
               }

               float $$11 = $$1 + $$4;
               boolean $$12 = false;
               if ($$7 && !$$10 && !$$8 && this.aJ()) {
                  double $$13 = this.ah().j();
                  double $$14 = (double)this.fq() * 2.5;
                  if ($$13 < ayz.k($$14) && this.b(bsx.a).a(awy.bG)) {
                     $$12 = true;
                  }
               }

               float $$15 = 0.0F;
               if ($$0 instanceof bvy $$16) {
                  $$15 = $$16.eE();
               }

               fbx $$17 = $$0.dx();
               boolean $$18 = $$0.b($$3, $$11);
               if ($$18) {
                  float $$19 = this.b($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                  if ($$19 > 0.0F) {
                     if ($$0 instanceof bvy $$20) {
                        $$20.p(
                           (double)($$19 * 0.5F), (double)ayz.a(this.dK() * (float) (Math.PI / 180.0)), (double)(-ayz.b(this.dK() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.j(
                           (double)(-ayz.a(this.dK() * (float) (Math.PI / 180.0)) * $$19 * 0.5F),
                           0.1,
                           (double)(ayz.b(this.dK() * (float) (Math.PI / 180.0)) * $$19 * 0.5F)
                        );
                     }

                     this.i(this.dx().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$12) {
                     float $$21 = 1.0F + (float)this.h(bxg.D) * $$1;

                     for (bvy $$23 : this.dU().a(bvy.class, $$0.cQ().c(1.0, 0.25, 1.0))) {
                        if ($$23 != this && $$23 != $$0 && !this.s($$23)) {
                           if ($$23 instanceof cll) {
                              cll $$24 = (cll)$$23;
                              if ($$24.t()) {
                                 continue;
                              }
                           }

                           if (this.g((bva)$$23) < 9.0) {
                              float $$25 = this.a($$23, $$21, $$3) * $$5;
                              dgz var22 = this.dU();
                              if (var22 instanceof ard) {
                                 ard $$26 = (ard)var22;
                                 if ($$23.a($$26, $$3, $$25)) {
                                    $$23.p(0.4F, (double)ayz.a(this.dK() * (float) (Math.PI / 180.0)), (double)(-ayz.b(this.dK() * (float) (Math.PI / 180.0))));
                                    ddt.a($$26, (bva)$$23, $$3);
                                 }
                              }
                           }
                        }
                     }

                     this.dU().a(null, this.dz(), this.dB(), this.dF(), awa.uP, this.dl(), 1.0F, 1.0F);
                     this.gh();
                  }

                  if ($$0 instanceof are && $$0.T) {
                     ((are)$$0).f.b(new aew($$0));
                     $$0.T = false;
                     $$0.i($$17);
                  }

                  if ($$10) {
                     this.dU().a(null, this.dz(), this.dB(), this.dF(), awa.uL, this.dl(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$10 && !$$12) {
                     if ($$7) {
                        this.dU().a(null, this.dz(), this.dB(), this.dF(), awa.uO, this.dl(), 1.0F, 1.0F);
                     } else {
                        this.dU().a(null, this.dz(), this.dB(), this.dF(), awa.uQ, this.dl(), 1.0F, 1.0F);
                     }
                  }

                  if ($$4 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  bva $$27 = $$0;
                  if ($$0 instanceof ckm) {
                     $$27 = ((ckm)$$0).a;
                  }

                  boolean $$28 = false;
                  if (this.dU() instanceof ard $$29) {
                     if ($$27 instanceof bvy $$30) {
                        $$28 = $$2.a($$30, this);
                     }

                     ddt.a($$29, $$0, $$3);
                  }

                  if (!this.dU().C && !$$2.f() && $$27 instanceof bvy) {
                     if ($$28) {
                        $$2.b((bvy)$$27, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.eZ()) {
                           this.a(bsx.a, cxh.k);
                        } else {
                           this.a(bsx.b, cxh.k);
                        }
                     }
                  }

                  if ($$0 instanceof bvy) {
                     float $$31 = $$15 - ((bvy)$$0).eE();
                     this.a(awk.G, Math.round($$31 * 10.0F));
                     if (this.dU() instanceof ard && $$31 > 2.0F) {
                        int $$32 = (int)((double)$$31 * 0.5);
                        ((ard)this.dU()).a(lt.g, $$0.dz(), $$0.e(0.5), $$0.dF(), $$32, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.H(0.1F);
               } else {
                  this.dU().a(null, this.dz(), this.dB(), this.dF(), awa.uN, this.dl(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(bva $$0, float $$1, btp $$2) {
      return $$1;
   }

   @Override
   protected void g(bvy $$0) {
      this.e($$0);
   }

   public void h(cxh $$0) {
      this.gH().a($$0, 100);
      this.fH();
      this.dU().a(this, (byte)30);
   }

   public void b(bva $$0) {
   }

   @Override
   public void c(bva $$0) {
   }

   public void gh() {
      double $$0 = (double)(-ayz.a(this.dK() * (float) (Math.PI / 180.0)));
      double $$1 = (double)ayz.b(this.dK() * (float) (Math.PI / 180.0));
      if (this.dU() instanceof ard) {
         ((ard)this.dU()).a(lt.am, this.dz() + $$0, this.e(0.5), this.dF() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void gi() {
   }

   @Override
   public void a(bva.d $$0) {
      super.a($$0);
      this.bP.a(this);
      if (this.bQ != null && this.go()) {
         this.q();
      }
   }

   @Override
   public boolean L_() {
      return true;
   }

   @Override
   protected boolean dg() {
      return this.gj();
   }

   public boolean gj() {
      return false;
   }

   @Override
   public boolean dh() {
      return !this.dU().C || this.gj();
   }

   @Override
   public boolean di() {
      return !this.dU().C || this.gj();
   }

   public GameProfile gk() {
      return this.cp;
   }

   public cpq gl() {
      return this.g;
   }

   public cpn gm() {
      return this.j;
   }

   @Override
   public boolean fX() {
      return this.j.d;
   }

   public boolean gn() {
      return this.j.d;
   }

   public void a(cxh $$0, cxh $$1, ctg $$2) {
   }

   public boolean go() {
      return this.bQ != this.bP;
   }

   public boolean gp() {
      return true;
   }

   public Either<cpr.a, baf> a(ji $$0) {
      this.b($$0);
      this.i = 0;
      return Either.right(baf.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fU();
      if (this.dU() instanceof ard && $$1) {
         ((ard)this.dU()).f();
      }

      this.i = $$0 ? 0 : 100;
   }

   @Override
   public void fU() {
      this.a(true, true);
   }

   public boolean gq() {
      return this.fT() && this.i >= 100;
   }

   public int gr() {
      return this.i;
   }

   public void a(wp $$0, boolean $$1) {
   }

   public void a(aku $$0) {
      this.b(awk.i.b($$0));
   }

   public void a(aku $$0, int $$1) {
      this.a(awk.i.b($$0), $$1);
   }

   public void b(awh<?> $$0) {
      this.a($$0, 1);
   }

   public void a(awh<?> $$0, int $$1) {
   }

   public void a(awh<?> $$0) {
   }

   public int a(Collection<dca<?>> $$0) {
      return 0;
   }

   public void a(dca<?> $$0, List<cxh> $$1) {
   }

   public void b(List<akt<dbv<?>>> $$0) {
   }

   public int b(Collection<dca<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(fbx $$0) {
      if (this.bY()) {
         super.a_($$0);
      } else {
         if (this.cj()) {
            double $$1 = this.bS().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bf || !this.dU().b_(ji.a(this.dz(), this.dB() + 1.0 - 0.1, this.dF())).c()) {
               fbx $$3 = this.dx();
               this.i($$3.b(0.0, ($$1 - $$3.e) * $$2, 0.0));
            }
         }

         if (this.gm().b) {
            double $$4 = this.dx().e;
            super.a_($$0);
            this.i(this.dx().a(jn.a.b, $$4 * 0.6));
         } else {
            super.a_($$0);
         }
      }
   }

   @Override
   protected boolean fv() {
      return !this.j.b && super.fv();
   }

   @Override
   public void bn() {
      if (this.j.b) {
         this.i(false);
      } else {
         super.bn();
      }
   }

   protected boolean i(ji $$0) {
      return !this.dU().a_($$0).j(this.dU(), $$0);
   }

   @Override
   public float fq() {
      return (float)this.h(bxg.v);
   }

   @Override
   public boolean a(float $$0, float $$1, btp $$2) {
      if (this.j.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(awk.t, (int)Math.round((double)$$0 * 100.0));
         }

         boolean $$3 = this.cl != null && this.cu;
         float $$4;
         if ($$3) {
            $$4 = Math.min($$0, (float)(this.cl.e - this.dB()));
            boolean $$5 = $$4 <= 0.0F;
            if ($$5) {
               this.gR();
            } else {
               this.gQ();
            }
         } else {
            $$4 = $$0;
         }

         if ($$4 > 0.0F && super.a($$4, $$1, $$2)) {
            this.gR();
            return true;
         } else {
            return false;
         }
      }
   }

   public boolean gs() {
      if (!this.fL() && this.fv() && !this.bj()) {
         this.gt();
         return true;
      } else {
         return false;
      }
   }

   public void gt() {
      this.b(7, true);
   }

   @Override
   protected void bq() {
      if (!this.U_()) {
         super.bq();
      }
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      if (this.bj()) {
         this.aY();
         this.b($$1);
      } else {
         ji $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dxq $$3 = this.dU().a_($$2);
            if ($$3.a(awp.bq)) {
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
   public bvy.a eM() {
      return new bvy.a(awa.vb, awa.uR);
   }

   @Override
   public boolean a(ard $$0, bvy $$1) {
      this.b(awk.g.b($$1.aq()));
      return true;
   }

   @Override
   public void a(dxq $$0, fbx $$1) {
      if (!this.j.b) {
         super.a($$0, $$1);
      }

      this.gQ();
   }

   public void d(int $$0) {
      this.r($$0);
      this.cg = this.cg + (float)$$0 / (float)this.gv();
      this.cf = ayz.a(this.cf + $$0, 0, Integer.MAX_VALUE);

      while (this.cg < 0.0F) {
         float $$1 = this.cg * (float)this.gv();
         if (this.ce > 0) {
            this.c(-1);
            this.cg = 1.0F + $$1 / (float)this.gv();
         } else {
            this.c(-1);
            this.cg = 0.0F;
         }
      }

      while (this.cg >= 1.0F) {
         this.cg = (this.cg - 1.0F) * (float)this.gv();
         this.c(1);
         this.cg = this.cg / (float)this.gv();
      }
   }

   public int gu() {
      return this.ch;
   }

   public void a(cxh $$0, int $$1) {
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

      if ($$0 > 0 && this.ce % 5 == 0 && (float)this.k < (float)this.af - 100.0F) {
         float $$1 = this.ce > 30 ? 1.0F : (float)this.ce / 30.0F;
         this.dU().a(null, this.dz(), this.dB(), this.dF(), awa.va, this.dl(), $$1 * 0.75F, 1.0F);
         this.k = this.af;
      }
   }

   public int gv() {
      if (this.ce >= 30) {
         return 112 + (this.ce - 30) * 9;
      } else {
         return this.ce >= 15 ? 37 + (this.ce - 15) * 5 : 7 + this.ce * 2;
      }
   }

   public void H(float $$0) {
      if (!this.j.a) {
         if (!this.dU().C) {
            this.bR.a($$0);
         }
      }
   }

   public Optional<cow> ac() {
      return Optional.empty();
   }

   public css gw() {
      return this.bR;
   }

   public boolean t(boolean $$0) {
      return this.j.a || $$0 || this.bR.b();
   }

   public boolean gx() {
      return this.eE() > 0.0F && this.eE() < this.eS();
   }

   public boolean gy() {
      return this.j.e;
   }

   public boolean a(ji $$0, jn $$1, cxh $$2) {
      if (this.j.e) {
         return true;
      } else {
         ji $$3 = $$0.a($$1.g());
         dxu $$4 = new dxu(this.dU(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int e(ard $$0) {
      return !$$0.O().b(dgv.d) && !this.U_() ? Math.min(this.ce * 7, 100) : 0;
   }

   @Override
   protected boolean eo() {
      return true;
   }

   @Override
   public boolean cL() {
      return true;
   }

   @Override
   protected bva.c bg() {
      return this.j.b || this.aJ() && this.cf() ? bva.c.a : bva.c.d;
   }

   public void x() {
   }

   @Override
   public wp al() {
      return wp.b(this.cp.getName());
   }

   public cuk gz() {
      return this.bO;
   }

   @Override
   public cxh a(bvj $$0) {
      if ($$0 == bvj.a) {
         return this.g.f();
      } else if ($$0 == bvj.b) {
         return this.g.i.getFirst();
      } else {
         return $$0.a() == bvj.a.b ? this.g.h.get($$0.b()) : cxh.k;
      }
   }

   @Override
   protected boolean b(bvj $$0) {
      return $$0.a() == bvj.a.b;
   }

   @Override
   public void a(bvj $$0, cxh $$1) {
      this.c($$1);
      if ($$0 == bvj.a) {
         this.a($$0, this.g.g.set(this.g.j, $$1), $$1);
      } else if ($$0 == bvj.b) {
         this.a($$0, this.g.i.set(0, $$1), $$1);
      } else if ($$0.a() == bvj.a.b) {
         this.a($$0, this.g.h.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cxh $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<cxh> fc() {
      return Lists.newArrayList(new cxh[]{this.eZ(), this.fa()});
   }

   @Override
   public Iterable<cxh> fb() {
      return this.g.h;
   }

   @Override
   public boolean e(bvj $$0) {
      return $$0 != bvj.g;
   }

   public boolean h(tq $$0) {
      if (this.bY() || !this.aJ() || this.bj() || this.av) {
         return false;
      } else if (this.gD().g()) {
         this.i($$0);
         this.f = this.dU().ae();
         return true;
      } else if (this.gE().g()) {
         this.j($$0);
         this.f = this.dU().ae();
         return true;
      } else {
         return false;
      }
   }

   protected void gA() {
      if (this.f + 20L < this.dU().ae()) {
         this.k(this.gD());
         this.i(new tq());
         this.k(this.gE());
         this.j(new tq());
      }
   }

   private void k(tq $$0) {
      if (!this.dU().C && !$$0.g()) {
         bvi.a($$0, this.dU(), bvh.r).ifPresent($$0x -> {
            if ($$0x instanceof bwv $$1) {
               $$1.j(this);
            }

            $$0x.a_(this.dz(), this.dB() + 0.7F, this.dF());
            ((ard)this.dU()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean U_();

   @Override
   public boolean bE() {
      return !this.U_() && super.bE();
   }

   @Override
   public boolean cj() {
      return !this.j.b && !this.U_() && super.cj();
   }

   public abstract boolean b();

   @Override
   public boolean cI() {
      return !this.j.b;
   }

   public fdc gB() {
      return this.dU().R();
   }

   @Override
   public wp m_() {
      xd $$0 = fcx.a(this.cq(), this.al());
      return this.a($$0);
   }

   private xd a(xd $$0) {
      String $$1 = this.gk().getName();
      return $$0.a($$1x -> $$1x.a(new wn.g("/tell " + $$1 + " ")).a(this.cP()).a($$1));
   }

   @Override
   public String cH() {
      return this.gk().getName();
   }

   @Override
   protected void G(float $$0) {
      this.au().a(d, $$0);
   }

   @Override
   public float fy() {
      return this.au().a(d);
   }

   public boolean a(cps $$0) {
      return (this.au().a(bJ) & $$0.a()) == $$0.a();
   }

   @Override
   public bwq a_(int $$0) {
      if ($$0 == 499) {
         return new bwq() {
            @Override
            public cxh a() {
               return cpr.this.bQ.g();
            }

            @Override
            public boolean a(cxh $$0) {
               cpr.this.bQ.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bwq() {
               @Override
               public cxh a() {
                  return cpr.this.bP.r().a($$1);
               }

               @Override
               public boolean a(cxh $$0) {
                  cpr.this.bP.r().a($$1, $$0);
                  cpr.this.bP.a(cpr.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.g.size()) {
            return bwq.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.bO.b() ? bwq.a(this.bO, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gC() {
      return this.cq;
   }

   public void u(boolean $$0) {
      this.cq = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.j.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bvr fA() {
      return this.al.a(bK) == 0 ? bvr.a : bvr.b;
   }

   public void b(bvr $$0) {
      this.al.a(bK, (byte)($$0 == bvr.a ? 0 : 1));
   }

   public tq gD() {
      return this.al.a(bL);
   }

   protected void i(tq $$0) {
      this.al.a(bL, $$0);
   }

   public tq gE() {
      return this.al.a(bM);
   }

   protected void j(tq $$0) {
      this.al.a(bM, $$0);
   }

   public float gF() {
      return (float)(1.0 / this.h(bxg.e) * 20.0);
   }

   public float I(float $$0) {
      return ayz.a(((float)this.aS + $$0) / this.gF(), 0.0F, 1.0F);
   }

   public void gG() {
      this.aS = 0;
   }

   public cxe gH() {
      return this.cs;
   }

   @Override
   protected float aT() {
      return !this.j.b && !this.fL() ? super.aT() : 1.0F;
   }

   @Override
   public float ef() {
      return (float)this.h(bxg.q);
   }

   public boolean gI() {
      return this.j.d && this.G() >= 2;
   }

   public int G() {
      return 0;
   }

   public boolean s(int $$0) {
      return this.G() >= $$0;
   }

   @Override
   public bvd e(bwk $$0) {
      return c.getOrDefault($$0, bI);
   }

   @Override
   public ImmutableList<bwk> fQ() {
      return ImmutableList.of(bwk.a, bwk.f, bwk.d);
   }

   @Override
   public cxh d(cxh $$0) {
      if (!($$0.h() instanceof cyc)) {
         return cxh.k;
      } else {
         Predicate<cxh> $$1 = ((cyc)$$0.h()).d();
         cxh $$2 = cyc.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((cyc)$$0.h()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cxh $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.fX() ? new cxh(cxl.pd) : cxh.k;
         }
      }
   }

   @Override
   public fbx v(float $$0) {
      double $$1 = 0.22 * (this.fA() == bvr.b ? -1.0 : 1.0);
      float $$2 = ayz.h($$0 * 0.5F, this.dM(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = ayz.h($$0, this.aW, this.aV) * (float) (Math.PI / 180.0);
      if (this.fL() || this.fx()) {
         fbx $$4 = this.h($$0);
         fbx $$5 = this.dx();
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

         return this.p($$0).e(new fbx($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.ck()) {
         return this.p($$0).e(new fbx($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cQ().c() - 1.0;
         double $$13 = this.ch() ? -0.2 : 0.07;
         return this.p($$0).e(new fbx($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dT() {
      return true;
   }

   public boolean gJ() {
      return this.fB() && this.fD().a(cxl.rW);
   }

   @Override
   public boolean dS() {
      return false;
   }

   public Optional<jq> gK() {
      return this.ct;
   }

   public void c(Optional<jq> $$0) {
      this.ct = $$0;
   }

   @Override
   public float eK() {
      return this.ck;
   }

   @Override
   public void q(float $$0) {
      super.q($$0);
      this.ck = $$0;
   }

   @Override
   public boolean dN() {
      return true;
   }

   @Override
   protected float fp() {
      if (this.j.b && !this.bY()) {
         return this.ci() ? this.j.a() * 2.0F : this.j.a();
      } else {
         return this.ci() ? 0.025999999F : 0.02F;
      }
   }

   public boolean gL() {
      return this.h || this.bT <= 0;
   }

   public void gM() {
      if (!this.h) {
         this.bT--;
      }
   }

   public void v(boolean $$0) {
      this.h = $$0;
      if (!this.h) {
         this.bT = 60;
      }
   }

   public double gN() {
      return this.h(bxg.g);
   }

   public double gO() {
      return this.h(bxg.j);
   }

   public boolean b(bva $$0, double $$1) {
      return $$0.dP() ? false : this.a($$0.cQ(), $$1);
   }

   public boolean a(fbs $$0, double $$1) {
      double $$2 = this.gO() + $$1;
      return $$0.e(this.bD()) < $$2 * $$2;
   }

   public boolean a(ji $$0, double $$1) {
      double $$2 = this.gN() + $$1;
      return new fbs($$0).e(this.bD()) < $$2 * $$2;
   }

   public void w(boolean $$0) {
      this.cu = $$0;
      if ($$0) {
         this.cv = 40;
      } else {
         this.cv = 0;
      }
   }

   public boolean gP() {
      return this.cu;
   }

   public void gQ() {
      if (this.cv == 0) {
         this.gR();
      }
   }

   public void gR() {
      this.cv = 0;
      this.cm = null;
      this.cl = null;
      this.cu = false;
   }

   public boolean gS() {
      return false;
   }

   @Override
   public boolean d_() {
      return this.j.b ? false : super.d_();
   }

   public static enum a {
      a,
      b(wp.c("block.minecraft.bed.no_sleep")),
      c(wp.c("block.minecraft.bed.too_far_away")),
      d(wp.c("block.minecraft.bed.obstructed")),
      e,
      f(wp.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final wp g;

      private a() {
         this.g = null;
      }

      private a(final wp $$0) {
         this.g = $$0;
      }

      @Nullable
      public wp a() {
         return this.g;
      }
   }
}
