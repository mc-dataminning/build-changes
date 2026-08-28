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

public abstract class cqs extends bwz {
   private static final Logger a = LogUtils.getLogger();
   public static final bws bt = bws.b;
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
   public static final fdw bH = new fdw(0.0, 0.6, 0.0);
   public static final bwd bI = bwd.b(0.6F, 1.8F).b(1.62F).a(bwc.a().a(bwb.b, bH));
   private static final Map<bxl, bwd> c = ImmutableMap.builder()
      .put(bxl.a, bI)
      .put(bxl.c, aD)
      .put(bxl.b, bwd.b(0.6F, 0.6F).b(0.4F))
      .put(bxl.d, bwd.b(0.6F, 0.6F).b(0.4F))
      .put(bxl.e, bwd.b(0.6F, 0.6F).b(0.4F))
      .put(bxl.f, bwd.b(0.6F, 1.5F).b(1.27F).a(bwc.a().a(bwb.b, bH)))
      .put(bxl.h, bwd.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final akh<Float> d = akl.a(cqs.class, akj.d);
   private static final akh<Integer> e = akl.a(cqs.class, akj.b);
   protected static final akh<Byte> bJ = akl.a(cqs.class, akj.a);
   protected static final akh<Byte> bK = akl.a(cqs.class, akj.a);
   protected static final akh<tx> bL = akl.a(cqs.class, akj.t);
   protected static final akh<tx> bM = akl.a(cqs.class, akj.t);
   public static final int bN = 60;
   private long f;
   final cqr g = new cqr(this);
   protected cvy bO = new cvy();
   public final cvn bP;
   public cuk bQ;
   protected cug bR = new cug();
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
   private final cqo j = new cqo();
   public int ce;
   public int cf;
   public float cg;
   protected int ch;
   protected final float ci = 0.02F;
   private int k;
   private final GameProfile cp;
   private boolean cq;
   private cys cr = cys.k;
   private final cyp cs = this.g();
   private Optional<jd> ct = Optional.empty();
   @Nullable
   public cri cj;
   protected float ck;
   @Nullable
   public fdw cl;
   @Nullable
   public bwa cm;
   private boolean cu;
   private int cv;

   public cqs(dip $$0, iu $$1, float $$2, GameProfile $$3) {
      super(bwj.bS, $$0);
      this.a_($$3.getId());
      this.cp = $$3;
      this.bP = new cvn(this.g, !$$0.C, this);
      this.bQ = this.bP;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
   }

   public boolean a(dip $$0, iu $$1, dim $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dim.d) {
         return true;
      } else if (this.gv()) {
         return false;
      } else {
         cys $$3 = this.fa();
         return $$3.f() || !$$3.b(new dzs($$0, $$1, false));
      }
   }

   public static bye.a fW() {
      return bwz.ed().a(byf.c, 1.0).a(byf.v, 0.1F).a(byf.e).a(byf.q).a(byf.g, 4.5).a(byf.j, 3.0).a(byf.f).a(byf.C).a(byf.z).a(byf.t).a(byf.D);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(bJ, (byte)0);
      $$0.a(bK, (byte)bt.b());
      $$0.a(bL, new tx());
      $$0.a(bM, new tx());
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
      if (!this.dV().C && this.bQ != null && !this.bQ.b(this)) {
         this.p();
         this.bQ = this.bP;
      }

      this.n();
      if (this instanceof arp $$0) {
         this.bR.a($$0);
         this.a(awv.k);
         this.a(awv.l);
         if (this.bK()) {
            this.a(awv.m);
         }

         if (this.cg()) {
            this.a(awv.o);
         }

         if (!this.fQ()) {
            this.a(awv.n);
         }
      }

      int $$1 = 29999999;
      double $$2 = azk.a(this.dA(), -2.9999999E7, 2.9999999E7);
      double $$3 = azk.a(this.dG(), -2.9999999E7, 2.9999999E7);
      if ($$2 != this.dA() || $$3 != this.dG()) {
         this.a_($$2, this.dC(), $$3);
      }

      this.aS++;
      cys $$4 = this.fa();
      if (!cys.a(this.cr, $$4)) {
         if (!cys.b(this.cr, $$4)) {
            this.gD();
         }

         this.cr = $$4.v();
      }

      if (!this.a(axf.a) && this.c(cyw.oX)) {
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
      return this.cd();
   }

   protected boolean fY() {
      return this.cd();
   }

   protected boolean fZ() {
      return this.cd();
   }

   protected boolean ga() {
      this.cd = this.a(axf.a);
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
      this.a(new bve(bvg.m, 200, 0, false, false, true));
   }

   private boolean c(cyo $$0) {
      for (bwk $$1 : bwk.j) {
         cys $$2 = this.a($$1);
         dhb $$3 = $$2.a(kj.D);
         if ($$2.a($$0) && $$3 != null && $$3.b() == $$1) {
            return true;
         }
      }

      return false;
   }

   protected cyp g() {
      return new cyp();
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
      if (this.h(bxl.d)) {
         bxl $$0 = this.t();
         bxl $$1;
         if (this.U_() || this.bZ() || this.h($$0)) {
            $$1 = $$0;
         } else if (this.h(bxl.f)) {
            $$1 = bxl.f;
         } else {
            $$1 = bxl.d;
         }

         this.b($$1);
      }
   }

   private bxl t() {
      if (this.fQ()) {
         return bxl.c;
      } else if (this.ck()) {
         return bxl.d;
      } else if (this.fI()) {
         return bxl.b;
      } else if (this.fu()) {
         return bxl.e;
      } else {
         return this.cd() && !this.j.b ? bxl.f : bxl.a;
      }
   }

   protected boolean h(bxl $$0) {
      return this.dV().a(this, this.a($$0).a(this.dt()).h(1.0E-7));
   }

   @Override
   protected awk aV() {
      return awl.ve;
   }

   @Override
   protected awk aW() {
      return awl.vc;
   }

   @Override
   protected awk aX() {
      return awl.vd;
   }

   @Override
   public int bX() {
      return 10;
   }

   @Override
   public void a(awk $$0, float $$1, float $$2) {
      this.dV().a(this, this.dA(), this.dC(), this.dG(), $$0, this.dm(), $$1, $$2);
   }

   public void a(awk $$0, awm $$1, float $$2, float $$3) {
   }

   @Override
   public awm dm() {
      return awm.h;
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
      this.g.j();
      this.bU = this.bV;
      if (this.j.b && !this.bZ()) {
         this.k();
      }

      super.k_();
      this.eY();
      this.aX = this.dL();
      this.B((float)this.h(byf.v));
      float $$1;
      if (this.aJ() && !this.eG() && !this.ck()) {
         $$1 = Math.min(0.1F, (float)this.dy().i());
      } else {
         $$1 = 0.0F;
      }

      this.bV = this.bV + ($$1 - this.bV) * 0.4F;
      if (this.eF() > 0.0F && !this.U_()) {
         fdr $$2;
         if (this.bZ() && !this.dk().dQ()) {
            $$2 = this.cR().b(this.dk().cR()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cR().c(1.0, 0.5, 1.0);
         }

         List<bwa> $$4 = this.dV().a_(this, $$2);
         List<bwa> $$5 = Lists.newArrayList();

         for (bwa $$6 : $$4) {
            if ($$6.aq() == bwj.V) {
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

   private void c(@Nullable tx $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dV().A.a(200) == 0) {
         String $$1 = $$0.l("id");
         bwj.a($$1).filter($$0x -> $$0x == bwj.aO).ifPresent($$0x -> {
            if (!cje.a(this.dV(), this)) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), cje.a(this.dV(), this.dV().A), this.dm(), 1.0F, cje.a(this.dV().A));
            }
         });
      }
   }

   private void d(bwa $$0) {
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

   public void a(int $$0, float $$1, cys $$2) {
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
   public cys dZ() {
      return this.fu() && this.br != null ? this.br : super.dZ();
   }

   @Override
   public void a(bup $$0) {
      super.a($$0);
      this.ay();
      if (!this.U_() && this.dV() instanceof aro $$1) {
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

      this.a(awv.N);
      this.a(awv.i.b(awv.m));
      this.a(awv.i.b(awv.n));
      this.aH();
      this.c(false);
      this.c(Optional.of(jd.a(this.dV().aj(), this.dv())));
   }

   @Override
   protected void f(aro $$0) {
      super.f($$0);
      if (!$$0.O().c(dil.d)) {
         this.gd();
         this.g.k();
      }
   }

   protected void gd() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cys $$1 = this.g.a($$0);
         if (!$$1.f() && dfh.a($$1, dfg.D)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected awk e(bup $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected awk l_() {
      return awl.uU;
   }

   @Override
   public void h(cys $$0) {
   }

   @Nullable
   public cmx a(cys $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cmx a(cys $$0, boolean $$1, boolean $$2) {
      if (!$$0.f() && this.dV().C) {
         this.a(btx.a);
      }

      return null;
   }

   public float c(dzo $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.h(byf.t);
      }

      if (bvf.a(this)) {
         $$1 *= 1.0F + (float)(bvf.b(this) + 1) * 0.2F;
      }

      if (this.b(bvg.d)) {
         float $$2 = switch (this.c(bvg.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.h(byf.f);
      if (this.a(axf.a)) {
         $$1 *= (float)this.g(byf.C).g();
      }

      if (!this.aJ()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dzo $$0) {
      return !$$0.C() || this.g.f().b($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a_(this.cp.getId());
      ud $$1 = $$0.c("Inventory", 10);
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
      this.g(byf.v).a((double)this.j.b());
      if ($$0.b("EnderItems", 9)) {
         this.bO.a($$0.c("EnderItems", 10), this.dX());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.c(jd.b.parse(ul.a, $$0.c("LastDeathLocation")).resultOrPartial(a::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         fdw.a.parse(ul.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(a::error).ifPresent($$0x -> this.cl = $$0x);
      }

      this.cu = $$0.q("ignore_fall_damage_from_current_explosion");
      this.cv = $$0.h("current_impulse_context_reset_grace_time");
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      um.e($$0);
      $$0.a("Inventory", this.g.a(new ud()));
      $$0.a("SelectedItemSlot", this.g.j);
      $$0.a("SleepTimer", (short)this.i);
      $$0.a("XpP", this.cg);
      $$0.a("XpLevel", this.ce);
      $$0.a("XpTotal", this.cf);
      $$0.a("XpSeed", this.ch);
      $$0.a("Score", this.gc());
      this.bR.b($$0);
      this.j.a($$0);
      $$0.a("EnderItems", this.bO.a(this.dX()));
      if (!this.gA().g()) {
         $$0.a("ShoulderEntityLeft", this.gA());
      }

      if (!this.gB().g()) {
         $$0.a("ShoulderEntityRight", this.gB());
      }

      this.gH().flatMap($$0x -> jd.b.encodeStart(ul.a, $$0x).resultOrPartial(a::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cl != null) {
         $$0.a("current_explosion_impact_pos", (uu)fdw.a.encodeStart(ul.a, this.cl).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cu);
      $$0.a("current_impulse_context_reset_grace_time", this.cv);
   }

   @Override
   public boolean a(aro $$0, bup $$1) {
      if (super.a($$0, $$1)) {
         return true;
      } else if ($$1.a(axb.n)) {
         return !$$0.O().c(dil.H);
      } else if ($$1.a(axb.m)) {
         return !$$0.O().c(dil.I);
      } else if ($$1.a(axb.i)) {
         return !$$0.O().c(dil.J);
      } else {
         return $$1.a(axb.o) ? !$$0.O().c(dil.K) : false;
      }
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.j.a && !$$1.a(axb.d)) {
         return false;
      } else {
         this.bd = 0;
         if (this.eG()) {
            return false;
         } else {
            this.gx();
            if ($$1.g()) {
               if ($$0.an() == btv.a) {
                  $$2 = 0.0F;
               }

               if ($$0.an() == btv.b) {
                  $$2 = Math.min($$2 / 2.0F + 1.0F, $$2);
               }

               if ($$0.an() == btv.d) {
                  $$2 = $$2 * 3.0F / 2.0F;
               }
            }

            return $$2 == 0.0F ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void b(aro $$0, bwz $$1) {
      super.b($$0, $$1);
      cys $$2 = this.fG();
      dat $$3 = $$2 != null ? $$2.a(kj.I) : null;
      float $$4 = $$1.fT();
      if ($$4 > 0.0F && $$3 != null) {
         $$3.a($$0, this, $$4, $$2);
      }
   }

   @Override
   public boolean ey() {
      return !this.gj().a && super.ey();
   }

   public boolean a(cqs $$0) {
      ffd $$1 = this.cr();
      ffd $$2 = $$0.cr();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void c(bup $$0, float $$1) {
      this.a($$0, $$1, new bwk[]{bwk.c, bwk.d, bwk.e, bwk.f});
   }

   @Override
   protected void d(bup $$0, float $$1) {
      this.a($$0, $$1, new bwk[]{bwk.f});
   }

   @Override
   protected void b(aro $$0, bup $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var8 = Math.max($$2 - this.fv(), 0.0F);
         this.E(this.fv() - ($$2 - var8));
         float $$4 = $$2 - var8;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
            this.a(awv.L, Math.round($$4 * 10.0F));
         }

         if (var8 != 0.0F) {
            this.G($$1.a());
            this.eR().a($$1, var8);
            this.d(this.eF() - var8);
            if (var8 < 3.4028235E37F) {
               this.a(awv.J, Math.round(var8 * 10.0F));
            }

            this.a(eeo.o);
         }
      }
   }

   public boolean aa() {
      return false;
   }

   public void a(dyb $$0, boolean $$1) {
   }

   public void a(dhq $$0) {
   }

   public void a(dwy $$0) {
   }

   public void a(dyg $$0) {
   }

   public void a(dyh $$0) {
   }

   public void a(dyi $$0) {
   }

   public void a(dxr $$0) {
   }

   public void a(ckx $$0, btr $$1) {
   }

   public OptionalInt a(@Nullable bua $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dho $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cys $$0, btx $$1) {
   }

   public bty a(bwa $$0, btx $$1) {
      if (this.U_()) {
         if ($$0 instanceof bua) {
            this.a((bua)$$0);
         }

         return bty.e;
      } else {
         cys $$2 = this.b($$1);
         cys $$3 = $$2.v();
         bty $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.fU() && $$2 == this.b($$1) && $$2.M() < $$3.M()) {
               $$2.e($$3.M());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof bwz) {
               if (this.fU()) {
                  $$2 = $$3;
               }

               bty $$5 = $$2.a(this, (bwz)$$0, $$1);
               if ($$5.a()) {
                  this.dV().a(eeo.r, $$0.dt(), eeo.a.a(this));
                  if ($$2.f() && !this.fU()) {
                     this.a($$1, cys.k);
                  }

                  return $$5;
               }
            }

            return bty.e;
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
   protected fdw a(fdw $$0, bxd $$1) {
      float $$2 = this.dP();
      if (!this.j.b && !($$0.e > 0.0) && ($$1 == bxd.a || $$1 == bxd.b) && this.fZ() && this.I($$2)) {
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

         return new fdw($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean I(float $$0) {
      return this.aJ() || this.Z < (double)$$0 && !this.q(0.0, 0.0, (double)$$0 - this.Z);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      fdr $$3 = this.cR();
      return this.dV().a(this, new fdr($$3.a + 1.0E-7 + $$0, $$3.b - $$2 - 1.0E-7, $$3.c + 1.0E-7 + $$1, $$3.d - 1.0E-7 + $$0, $$3.b, $$3.f - 1.0E-7 + $$1));
   }

   public void e(bwa $$0) {
      if ($$0.cB()) {
         if (!$$0.v(this)) {
            float $$1 = this.fu() ? this.bq : (float)this.h(byf.c);
            cys $$2 = this.dZ();
            bup $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.dW().a(this));
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.H(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gD();
            if ($$0.aq().a(axd.H) && $$0 instanceof crm $$6 && $$6.a(crn.c, this, this, true)) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), awl.uN, this.dm());
               return;
            }

            if ($$1 > 0.0F || $$4 > 0.0F) {
               boolean $$7 = $$5 > 0.9F;
               boolean $$8;
               if (this.cj() && $$7) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awl.uM, this.dm(), 1.0F, 1.0F);
                  $$8 = true;
               } else {
                  $$8 = false;
               }

               $$1 += $$2.h().a($$0, $$1, $$3);
               boolean $$10 = $$7 && this.Z > 0.0 && !this.aJ() && !this.d_() && !this.bj() && !this.b(bvg.o) && !this.bZ() && $$0 instanceof bwz && !this.cj();
               if ($$10) {
                  $$1 *= 1.5F;
               }

               float $$11 = $$1 + $$4;
               boolean $$12 = false;
               if ($$7 && !$$10 && !$$8 && this.aJ()) {
                  double $$13 = this.ah().j();
                  double $$14 = (double)this.fn() * 2.5;
                  if ($$13 < azk.k($$14) && this.b(btx.a).a(axi.bG)) {
                     $$12 = true;
                  }
               }

               float $$15 = 0.0F;
               if ($$0 instanceof bwz $$16) {
                  $$15 = $$16.eF();
               }

               fdw $$17 = $$0.dy();
               boolean $$18 = $$0.b($$3, $$11);
               if ($$18) {
                  float $$19 = this.b($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                  if ($$19 > 0.0F) {
                     if ($$0 instanceof bwz $$20) {
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
                     float $$21 = 1.0F + (float)this.h(byf.D) * $$1;

                     for (bwz $$23 : this.dV().a(bwz.class, $$0.cR().c(1.0, 0.25, 1.0))) {
                        if ($$23 != this && $$23 != $$0 && !this.s($$23)) {
                           if ($$23 instanceof cmm) {
                              cmm $$24 = (cmm)$$23;
                              if ($$24.t()) {
                                 continue;
                              }
                           }

                           if (this.g($$23) < 9.0) {
                              float $$25 = this.a($$23, $$21, $$3) * $$5;
                              dip var22 = this.dV();
                              if (var22 instanceof aro) {
                                 aro $$26 = (aro)var22;
                                 if ($$23.a($$26, $$3, $$25)) {
                                    $$23.p(0.4F, (double)azk.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azk.b(this.dL() * (float) (Math.PI / 180.0))));
                                    dfh.a($$26, (bwa)$$23, $$3);
                                 }
                              }
                           }
                        }
                     }

                     this.dV().a(null, this.dA(), this.dC(), this.dG(), awl.uP, this.dm(), 1.0F, 1.0F);
                     this.ge();
                  }

                  if ($$0 instanceof arp && $$0.T) {
                     ((arp)$$0).f.b(new afd($$0));
                     $$0.T = false;
                     $$0.i($$17);
                  }

                  if ($$10) {
                     this.dV().a(null, this.dA(), this.dC(), this.dG(), awl.uL, this.dm(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$10 && !$$12) {
                     if ($$7) {
                        this.dV().a(null, this.dA(), this.dC(), this.dG(), awl.uO, this.dm(), 1.0F, 1.0F);
                     } else {
                        this.dV().a(null, this.dA(), this.dC(), this.dG(), awl.uQ, this.dm(), 1.0F, 1.0F);
                     }
                  }

                  if ($$4 > 0.0F) {
                     this.c($$0);
                  }

                  this.B($$0);
                  bwa $$27 = $$0;
                  if ($$0 instanceof cln) {
                     $$27 = ((cln)$$0).a;
                  }

                  boolean $$28 = false;
                  if (this.dV() instanceof aro $$29) {
                     if ($$27 instanceof bwz $$30) {
                        $$28 = $$2.a($$30, this);
                     }

                     dfh.a($$29, $$0, $$3);
                  }

                  if (!this.dV().C && !$$2.f() && $$27 instanceof bwz) {
                     if ($$28) {
                        $$2.b((bwz)$$27, this);
                     }

                     if ($$2.f()) {
                        if ($$2 == this.fa()) {
                           this.a(btx.a, cys.k);
                        } else {
                           this.a(btx.b, cys.k);
                        }
                     }
                  }

                  if ($$0 instanceof bwz) {
                     float $$31 = $$15 - ((bwz)$$0).eF();
                     this.a(awv.G, Math.round($$31 * 10.0F));
                     if (this.dV() instanceof aro && $$31 > 2.0F) {
                        int $$32 = (int)((double)$$31 * 0.5);
                        ((aro)this.dV()).a(lx.g, $$0.dA(), $$0.e(0.5), $$0.dG(), $$32, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.G(0.1F);
               } else {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awl.uN, this.dm(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(bwa $$0, float $$1, bup $$2) {
      return $$1;
   }

   @Override
   protected void f(bwz $$0) {
      this.e($$0);
   }

   public void b(bwa $$0) {
   }

   @Override
   public void c(bwa $$0) {
   }

   public void ge() {
      double $$0 = (double)(-azk.a(this.dL() * (float) (Math.PI / 180.0)));
      double $$1 = (double)azk.b(this.dL() * (float) (Math.PI / 180.0));
      if (this.dV() instanceof aro) {
         ((aro)this.dV()).a(lx.am, this.dA() + $$0, this.e(0.5), this.dG() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void gf() {
   }

   @Override
   public void a(bwa.e $$0) {
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
      return this.cp;
   }

   public cqr gi() {
      return this.g;
   }

   public cqo gj() {
      return this.j;
   }

   @Override
   public boolean fU() {
      return this.j.d;
   }

   public boolean gk() {
      return this.j.d;
   }

   public void a(cys $$0, cys $$1, cuu $$2) {
   }

   public boolean gl() {
      return this.bQ != this.bP;
   }

   public boolean gm() {
      return true;
   }

   public Either<cqs.a, bas> a(iu $$0) {
      this.b($$0);
      this.i = 0;
      return Either.right(bas.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fR();
      if (this.dV() instanceof aro && $$1) {
         ((aro)this.dV()).f();
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

   public void a(ww $$0, boolean $$1) {
   }

   public void a(ale $$0) {
      this.b(awv.i.b($$0));
   }

   public void a(ale $$0, int $$1) {
      this.a(awv.i.b($$0), $$1);
   }

   public void b(aws<?> $$0) {
      this.a($$0, 1);
   }

   public void a(aws<?> $$0, int $$1) {
   }

   public void a(aws<?> $$0) {
   }

   public int a(Collection<ddo<?>> $$0) {
      return 0;
   }

   public void a(ddo<?> $$0, List<cys> $$1) {
   }

   public void b(List<ald<ddj<?>>> $$0) {
   }

   public int b(Collection<ddo<?>> $$0) {
      return 0;
   }

   @Override
   public void a_(fdw $$0) {
      if (this.bZ()) {
         super.a_($$0);
      } else {
         if (this.ck()) {
            double $$1 = this.bT().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bf || !this.dV().b_(iu.a(this.dA(), this.dC() + 1.0 - 0.1, this.dG())).c()) {
               fdw $$3 = this.dy();
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

   protected boolean h(iu $$0) {
      return !this.dV().a_($$0).j(this.dV(), $$0);
   }

   @Override
   public float fn() {
      return (float)this.h(byf.v);
   }

   @Override
   public boolean a(double $$0, float $$1, bup $$2) {
      if (this.j.c) {
         return false;
      } else {
         if ($$0 >= 2.0) {
            this.a(awv.t, (int)Math.round($$0 * 100.0));
         }

         boolean $$3 = this.cl != null && this.cu;
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
   protected void b(iu $$0, dzo $$1) {
      if (this.bj()) {
         this.aY();
         this.b($$1);
      } else {
         iu $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dzo $$3 = this.dV().a_($$2);
            if ($$3.a(axa.bq)) {
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
   public bwz.a eN() {
      return new bwz.a(awl.vb, awl.uR);
   }

   @Override
   public boolean a(aro $$0, bwz $$1) {
      this.b(awv.g.b($$1.aq()));
      return true;
   }

   @Override
   public void a(dzo $$0, fdw $$1) {
      if (!this.j.b) {
         super.a($$0, $$1);
      }

      this.gN();
   }

   public void d(int $$0) {
      this.r($$0);
      this.cg = this.cg + (float)$$0 / (float)this.gs();
      this.cf = azk.a(this.cf + $$0, 0, Integer.MAX_VALUE);

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

   public void a(cys $$0, int $$1) {
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
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awl.va, this.dm(), $$1 * 0.75F, 1.0F);
         this.k = this.af;
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
      if (!this.j.a) {
         if (!this.dV().C) {
            this.bR.a($$0);
         }
      }
   }

   public Optional<cpx> ac() {
      return Optional.empty();
   }

   public cug gt() {
      return this.bR;
   }

   public boolean t(boolean $$0) {
      return this.j.a || $$0 || this.bR.b();
   }

   public boolean gu() {
      return this.eF() > 0.0F && this.eF() < this.eT();
   }

   public boolean gv() {
      return this.j.e;
   }

   public boolean a(iu $$0, ja $$1, cys $$2) {
      if (this.j.e) {
         return true;
      } else {
         iu $$3 = $$0.a($$1.g());
         dzs $$4 = new dzs(this.dV(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int e(aro $$0) {
      return !$$0.O().c(dil.d) && !this.U_() ? Math.min(this.ce * 7, 100) : 0;
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
   protected bwa.d bg() {
      return this.j.b || this.aJ() && this.cg() ? bwa.d.a : bwa.d.d;
   }

   public void x() {
   }

   @Override
   public ww al() {
      return ww.b(this.cp.getName());
   }

   public cvy gw() {
      return this.bO;
   }

   @Override
   public cys a(bwk $$0) {
      if ($$0 == bwk.a) {
         return this.g.f();
      } else if ($$0 == bwk.b) {
         return this.g.i.getFirst();
      } else {
         return $$0.a() == bwk.a.b ? this.g.h.get($$0.b()) : cys.k;
      }
   }

   @Override
   protected boolean b(bwk $$0) {
      return $$0.a() == bwk.a.b;
   }

   @Override
   public void a(bwk $$0, cys $$1) {
      this.d($$1);
      if ($$0 == bwk.a) {
         this.a($$0, this.g.g.set(this.g.j, $$1), $$1);
      } else if ($$0 == bwk.b) {
         this.a($$0, this.g.i.set(0, $$1), $$1);
      } else if ($$0.a() == bwk.a.b) {
         this.a($$0, this.g.h.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cys $$0) {
      return this.g.f($$0);
   }

   public boolean h(tx $$0) {
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
         this.i(new tx());
         this.k(this.gB());
         this.j(new tx());
      }
   }

   private void k(tx $$0) {
      if (!this.dV().C && !$$0.g()) {
         bwj.a($$0, this.dV(), bwi.r).ifPresent($$0x -> {
            if ($$0x instanceof bxv $$1) {
               $$1.i(this);
            }

            $$0x.a_(this.dA(), this.dC() + 0.7F, this.dG());
            ((aro)this.dV()).c($$0x);
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

   public ffb gy() {
      return this.dV().R();
   }

   @Override
   public ww m_() {
      xk $$0 = few.a(this.cr(), this.al());
      return this.a($$0);
   }

   private xk a(xk $$0) {
      String $$1 = this.gh().getName();
      return $$0.a($$1x -> $$1x.a(new wu.g("/tell " + $$1 + " ")).a(this.cQ()).a($$1));
   }

   @Override
   public String cI() {
      return this.gh().getName();
   }

   @Override
   protected void F(float $$0) {
      this.au().a(d, $$0);
   }

   @Override
   public float fv() {
      return this.au().a(d);
   }

   public boolean a(cqt $$0) {
      return (this.au().a(bJ) & $$0.a()) == $$0.a();
   }

   @Override
   public bxq a_(int $$0) {
      if ($$0 == 499) {
         return new bxq() {
            @Override
            public cys a() {
               return cqs.this.bQ.g();
            }

            @Override
            public boolean a(cys $$0) {
               cqs.this.bQ.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bxq() {
               @Override
               public cys a() {
                  return cqs.this.bP.r().a($$1);
               }

               @Override
               public boolean a(cys $$0) {
                  cqs.this.bP.r().a($$1, $$0);
                  cqs.this.bP.a(cqs.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.g.size()) {
            return bxq.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.bO.b() ? bxq.a(this.bO, $$2) : super.a_($$0);
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
      super.h(this.j.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bws fx() {
      return this.al.a(bK) == 0 ? bws.a : bws.b;
   }

   public void b(bws $$0) {
      this.al.a(bK, (byte)($$0 == bws.a ? 0 : 1));
   }

   public tx gA() {
      return this.al.a(bL);
   }

   protected void i(tx $$0) {
      this.al.a(bL, $$0);
   }

   public tx gB() {
      return this.al.a(bM);
   }

   protected void j(tx $$0) {
      this.al.a(bM, $$0);
   }

   public float gC() {
      return (float)(1.0 / this.h(byf.e) * 20.0);
   }

   public float H(float $$0) {
      return azk.a(((float)this.aS + $$0) / this.gC(), 0.0F, 1.0F);
   }

   public void gD() {
      this.aS = 0;
   }

   public cyp gE() {
      return this.cs;
   }

   @Override
   protected float aT() {
      return !this.j.b && !this.fI() ? super.aT() : 1.0F;
   }

   @Override
   public float eg() {
      return (float)this.h(byf.q);
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
   public bwd e(bxl $$0) {
      return c.getOrDefault($$0, bI);
   }

   @Override
   public ImmutableList<bxl> fN() {
      return ImmutableList.of(bxl.a, bxl.f, bxl.d);
   }

   @Override
   public cys e(cys $$0) {
      if (!($$0.h() instanceof czn)) {
         return cys.k;
      } else {
         Predicate<cys> $$1 = ((czn)$$0.h()).c();
         cys $$2 = czn.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((czn)$$0.h()).a();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cys $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.fU() ? new cys(cyw.pf) : cys.k;
         }
      }
   }

   @Override
   public fdw v(float $$0) {
      double $$1 = 0.22 * (this.fx() == bws.b ? -1.0 : 1.0);
      float $$2 = azk.h($$0 * 0.5F, this.dN(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = azk.h($$0, this.aW, this.aV) * (float) (Math.PI / 180.0);
      if (this.fI() || this.fu()) {
         fdw $$4 = this.h($$0);
         fdw $$5 = this.dy();
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

         return this.p($$0).e(new fdw($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cl()) {
         return this.p($$0).e(new fdw($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cR().c() - 1.0;
         double $$13 = this.ci() ? -0.2 : 0.07;
         return this.p($$0).e(new fdw($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dU() {
      return true;
   }

   public boolean gG() {
      return this.fy() && this.fA().a(cyw.rY);
   }

   @Override
   public boolean dT() {
      return false;
   }

   public Optional<jd> gH() {
      return this.ct;
   }

   public void c(Optional<jd> $$0) {
      this.ct = $$0;
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
      if (this.j.b && !this.bZ()) {
         return this.cj() ? this.j.a() * 2.0F : this.j.a();
      } else {
         return this.cj() ? 0.025999999F : 0.02F;
      }
   }

   public boolean gI() {
      return this.h || this.bT <= 0;
   }

   public void gJ() {
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

   public double gK() {
      return this.h(byf.g);
   }

   public double gL() {
      return this.h(byf.j);
   }

   public boolean b(bwa $$0, double $$1) {
      return $$0.dQ() ? false : this.a($$0.cR(), $$1);
   }

   public boolean a(fdr $$0, double $$1) {
      double $$2 = this.gL() + $$1;
      return $$0.e(this.bE()) < $$2 * $$2;
   }

   public boolean a(iu $$0, double $$1) {
      double $$2 = this.gK() + $$1;
      return new fdr($$0).e(this.bE()) < $$2 * $$2;
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
      this.cm = null;
      this.cl = null;
      this.cu = false;
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
      b(ww.c("block.minecraft.bed.no_sleep")),
      c(ww.c("block.minecraft.bed.too_far_away")),
      d(ww.c("block.minecraft.bed.obstructed")),
      e,
      f(ww.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final ww g;

      private a() {
         this.g = null;
      }

      private a(final ww $$0) {
         this.g = $$0;
      }

      @Nullable
      public ww a() {
         return this.g;
      }
   }
}
