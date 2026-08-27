import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class ceg extends cef implements ccj, cfb {
   private static final agn<Boolean> bV = agq.a(ceg.class, agp.k);
   private static final agn<Boolean> bW = agq.a(ceg.class, agp.k);
   private static final agn<Boolean> bX = agq.a(ceg.class, agp.k);
   private static final UUID bY = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bns bZ = new bns(bY, "Baby speed boost", 0.2F, bns.a.b);
   private static final int ca = 16;
   private static final float cb = 0.35F;
   private static final int cc = 5;
   private static final float cd = 1.6F;
   private static final float ce = 0.1F;
   private static final int cf = 3;
   private static final float cg = 0.2F;
   private static final blz ch = bmc.ay.n().a(0.5F).b(0.97F);
   private static final double ci = 0.5;
   private final bkl cj = new bkl(8);
   private boolean ck;
   protected static final ImmutableList<bwx<? extends bww<? super ceg>>> e = ImmutableList.of(bwx.c, bwx.d, bwx.b, bwx.f, bwx.l);
   protected static final ImmutableList<bvq<?>> bU = ImmutableList.of(
      bvq.n,
      bvq.v,
      bvq.g,
      bvq.h,
      bvq.k,
      bvq.l,
      bvq.ao,
      bvq.an,
      bvq.L,
      bvq.aP,
      bvq.x,
      bvq.y,
      new bvq[]{
         bvq.m,
         bvq.E,
         bvq.o,
         bvq.p,
         bvq.q,
         bvq.t,
         bvq.ab,
         bvq.ac,
         bvq.z,
         bvq.ad,
         bvq.ae,
         bvq.ag,
         bvq.af,
         bvq.ai,
         bvq.aj,
         bvq.ah,
         bvq.al,
         bvq.M,
         bvq.ar,
         bvq.s,
         bvq.as,
         bvq.at,
         bvq.ak,
         bvq.am,
         bvq.au,
         bvq.av,
         bvq.aw
      }
   );

   public ceg(bmc<? extends cef> $$0, ctx $$1) {
      super($$0, $$1);
      this.bK = 5;
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }

      if (this.ck) {
         $$0.a("CannotHunt", true);
      }

      this.a_($$0);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @avu
   @Override
   public bkl A() {
      return this.cj;
   }

   @Override
   protected void a(bkv $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cci $$4 && $$4.gg()) {
         cng $$5 = new cng(cnj.un);
         $$4.gh();
         this.b($$5);
      }

      this.cj.f().forEach(this::b);
   }

   protected cng l(cng $$0) {
      return this.cj.a($$0);
   }

   protected boolean m(cng $$0) {
      return this.cj.b($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bV, false);
      this.an.a(bW, false);
      this.an.a(bX, false);
   }

   @Override
   public void a(agn<?> $$0) {
      super.a($$0);
      if (bV.equals($$0)) {
         this.k_();
      }
   }

   public static bnt.a gm() {
      return ccw.gl().a(bnu.n, 16.0).a(bnu.o, 0.35F).a(bnu.c, 5.0);
   }

   public static boolean b(bmc<ceg> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      return !$$1.a_($$3.d()).a(cxa.kK);
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      auw $$5 = $$0.F_();
      if ($$2 != bms.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.gg()) {
            this.a(bmd.a, this.go());
         }
      }

      ceh.a(this, $$0.F_());
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean Y() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fM();
   }

   @Override
   protected void a(auw $$0, bka $$1) {
      if (this.gg()) {
         this.a(bmd.f, new cng(cnj.pN), $$0);
         this.a(bmd.e, new cng(cnj.pO), $$0);
         this.a(bmd.d, new cng(cnj.pP), $$0);
         this.a(bmd.c, new cng(cnj.pQ), $$0);
      }
   }

   private void a(bmd $$0, cng $$1, auw $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bno.b<ceg> dO() {
      return bno.a(bU, e);
   }

   @Override
   protected bno<?> a(Dynamic<?> $$0) {
      return ceh.a(this, this.dO().a($$0));
   }

   @Override
   public bno<ceg> dN() {
      return (bno<ceg>)super.dN();
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      bkc $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dL().B) {
         return ceh.a(this, $$0, $$1);
      } else {
         boolean $$3 = ceh.b(this, $$0.b($$1)) && this.gh() != cei.d;
         return $$3 ? bkc.a : bkc.d;
      }
   }

   @Override
   public blz e(bna $$0) {
      return this.o_() ? ch : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(bV, $$0);
      if (!this.dL().B) {
         bnq $$1 = this.f(bnu.o);
         $$1.b(bZ.a());
         if ($$0) {
            $$1.c(bZ);
         }
      }
   }

   @Override
   public boolean o_() {
      return this.an().b(bV);
   }

   private void y(boolean $$0) {
      this.ck = $$0;
   }

   @Override
   protected boolean u() {
      return !this.ck;
   }

   @Override
   protected void aa() {
      this.dL().af().a("piglinBrain");
      this.dN().a((ane)this.dL(), this);
      this.dL().af().c();
      ceh.a(this);
      super.aa();
   }

   @Override
   public int ee() {
      return this.bK;
   }

   @Override
   protected void c(ane $$0) {
      ceh.b(this);
      this.cj.f().forEach(this::b);
      super.c($$0);
   }

   private cng go() {
      return (double)this.ag.i() < 0.5 ? new cng(cnj.vP) : new cng(cnj.oU);
   }

   private boolean gp() {
      return this.an.b(bW);
   }

   @Override
   public void b(boolean $$0) {
      this.an.b(bW, $$0);
   }

   @Override
   public void a() {
      this.bb = 0;
   }

   @Override
   public cei gh() {
      if (this.gn()) {
         return cei.e;
      } else if (ceh.a(this.eU())) {
         return cei.d;
      } else if (this.fX() && this.gi()) {
         return cei.a;
      } else if (this.gp()) {
         return cei.c;
      } else {
         return this.fX() && this.b(cnj.vP) ? cei.b : cei.f;
      }
   }

   public boolean gn() {
      return this.an.b(bX);
   }

   public void x(boolean $$0) {
      this.an.b(bX, $$0);
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bmo) {
            ceh.a(this, (bmo)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bmo $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bmo $$0, cng $$1, cgi $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(cnw $$0) {
      return $$0 == cnj.vP;
   }

   protected void n(cng $$0) {
      this.b(bmd.a, $$0);
   }

   protected void o(cng $$0) {
      if ($$0.a(ceh.c)) {
         this.a(bmd.b, $$0);
         this.e(bmd.b);
      } else {
         this.b(bmd.b, $$0);
      }
   }

   @Override
   public boolean k(cng $$0) {
      return this.dL().Z().b(ctt.c) && this.fL() && ceh.a(this, $$0);
   }

   protected boolean p(cng $$0) {
      bmd $$1 = bmq.h($$0);
      cng $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cng $$0, cng $$1) {
      if (crt.d($$1)) {
         return false;
      } else {
         boolean $$2 = ceh.a($$0) || $$0.a(cnj.vP);
         boolean $$3 = ceh.a($$1) || $$1.a(cnj.vP);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gg() && !$$0.a(cnj.vP) && $$1.a(cnj.vP) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(ccb $$0) {
      this.a($$0);
      ceh.a(this, $$0);
   }

   @Override
   public boolean a(blw $$0, boolean $$1) {
      if (this.o_() && $$0.ai() == bmc.Y) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private blw b(blw $$0, int $$1) {
      List<blw> $$2 = $$0.cP();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected ars y() {
      return this.dL().B ? null : ceh.c(this).orElse(null);
   }

   @Override
   protected ars d(bkv $$0) {
      return art.td;
   }

   @Override
   protected ars n_() {
      return art.tb;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.tf, 0.15F, 1.0F);
   }

   protected void b(ars $$0) {
      this.a($$0, this.eW(), this.eX());
   }

   @Override
   protected void gj() {
      this.b(art.tg);
   }
}
