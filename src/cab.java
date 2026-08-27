import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cab extends caa implements bym, caw {
   private static final adx<Boolean> bV = aea.a(cab.class, adz.k);
   private static final adx<Boolean> bW = aea.a(cab.class, adz.k);
   private static final adx<Boolean> bX = aea.a(cab.class, adz.k);
   private static final UUID bY = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bkb bZ = new bkb(bY, "Baby speed boost", 0.2F, bkb.a.b);
   private static final int ca = 16;
   private static final float cb = 0.35F;
   private static final int cc = 5;
   private static final float cd = 1.6F;
   private static final float ce = 0.1F;
   private static final int cf = 3;
   private static final float cg = 0.2F;
   private static final float ch = 0.82F;
   private static final double ci = 0.5;
   private final bgv cj = new bgv(8);
   private boolean ck;
   protected static final ImmutableList<btd<? extends btc<? super cab>>> bT = ImmutableList.of(btd.c, btd.d, btd.b, btd.f, btd.k);
   protected static final ImmutableList<bry<?>> bU = ImmutableList.of(
      bry.n,
      bry.v,
      bry.g,
      bry.h,
      bry.k,
      bry.l,
      bry.an,
      bry.am,
      bry.K,
      bry.aO,
      bry.x,
      bry.y,
      new bry[]{
         bry.m,
         bry.E,
         bry.o,
         bry.p,
         bry.q,
         bry.t,
         bry.aa,
         bry.ab,
         bry.z,
         bry.ac,
         bry.ad,
         bry.af,
         bry.ae,
         bry.ah,
         bry.ai,
         bry.ag,
         bry.ak,
         bry.L,
         bry.aq,
         bry.s,
         bry.ar,
         bry.as,
         bry.aj,
         bry.al,
         bry.at,
         bry.au,
         bry.av
      }
   );

   public cab(bik<? extends caa> $$0, cpk $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      if (this.i_()) {
         $$0.a("IsBaby", true);
      }

      if (this.ck) {
         $$0.a("CannotHunt", true);
      }

      this.a_($$0);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @aso
   @Override
   public bgv t() {
      return this.cj;
   }

   @Override
   protected void a(bhe $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof byl $$4 && $$4.ga()) {
         ciw $$5 = new ciw(ciz.tx);
         $$4.gb();
         this.b($$5);
      }

      this.cj.f().forEach(this::b);
   }

   protected ciw l(ciw $$0) {
      return this.cj.a($$0);
   }

   protected boolean m(ciw $$0) {
      return this.cj.b($$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bV, false);
      this.an.a(bW, false);
      this.an.a(bX, false);
   }

   @Override
   public void a(adx<?> $$0) {
      super.a($$0);
      if (bV.equals($$0)) {
         this.e_();
      }
   }

   public static bkc.a gg() {
      return byz.gf().a(bkd.a, 16.0).a(bkd.d, 0.35F).a(bkd.f, 5.0);
   }

   public static boolean b(bik<cab> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      return !$$1.a_($$3.d()).a(csl.kK);
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      art $$5 = $$0.y_();
      if ($$2 != bja.d) {
         if ($$5.i() < 0.2F) {
            this.a(true);
         } else if (this.ga()) {
            this.a(bil.a, this.gi());
         }
      }

      cac.a(this, $$0.y_());
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean S() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fH();
   }

   @Override
   protected void a(art $$0, bgm $$1) {
      if (this.ga()) {
         this.a(bil.f, new ciw(ciz.pa), $$0);
         this.a(bil.e, new ciw(ciz.pb), $$0);
         this.a(bil.d, new ciw(ciz.pc), $$0);
         this.a(bil.c, new ciw(ciz.pd), $$0);
      }
   }

   private void a(bil $$0, ciw $$1, art $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bjx.b<cab> dN() {
      return bjx.a(bU, bT);
   }

   @Override
   protected bjx<?> a(Dynamic<?> $$0) {
      return cac.a(this, this.dN().a($$0));
   }

   @Override
   public bjx<cab> dM() {
      return (bjx<cab>)super.dM();
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      bgo $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dK().B) {
         return cac.a(this, $$0, $$1);
      } else {
         boolean $$3 = cac.b(this, $$0.b($$1)) && this.gb() != cad.d;
         return $$3 ? bgo.a : bgo.d;
      }
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      float $$2 = super.b($$0, $$1);
      return this.i_() ? $$2 - 0.82F : $$2;
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(bV, $$0);
      if (!this.dK().B) {
         bjz $$1 = this.a(bkd.d);
         $$1.b(bZ.a());
         if ($$0) {
            $$1.b(bZ);
         }
      }
   }

   @Override
   public boolean i_() {
      return this.al().b(bV);
   }

   private void y(boolean $$0) {
      this.ck = $$0;
   }

   @Override
   protected boolean p() {
      return !this.ck;
   }

   @Override
   protected void V() {
      this.dK().ad().a("piglinBrain");
      this.dM().a((aki)this.dK(), this);
      this.dK().ad().c();
      cac.a(this);
      super.V();
   }

   @Override
   public int ec() {
      return this.bJ;
   }

   @Override
   protected void c(aki $$0) {
      cac.b(this);
      this.cj.f().forEach(this::b);
      super.c($$0);
   }

   private ciw gi() {
      return (double)this.ag.i() < 0.5 ? new ciw(ciz.uZ) : new ciw(ciz.oh);
   }

   private boolean gj() {
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
   public cad gb() {
      if (this.gh()) {
         return cad.e;
      } else if (cac.a(this.eS())) {
         return cad.d;
      } else if (this.fS() && this.gc()) {
         return cad.a;
      } else if (this.gj()) {
         return cad.c;
      } else {
         return this.fS() && this.b(ciz.uZ) ? cad.b : cad.f;
      }
   }

   public boolean gh() {
      return this.an.b(bX);
   }

   public void x(boolean $$0) {
      this.an.b(bX, $$0);
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dK().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof biw) {
            cac.a(this, (biw)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(biw $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(biw $$0, ciw $$1, ccd $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(cjm $$0) {
      return $$0 == ciz.uZ;
   }

   protected void n(ciw $$0) {
      this.b(bil.a, $$0);
   }

   protected void o(ciw $$0) {
      if ($$0.a(cac.c)) {
         this.a(bil.b, $$0);
         this.e(bil.b);
      } else {
         this.b(bil.b, $$0);
      }
   }

   @Override
   public boolean k(ciw $$0) {
      return this.dK().X().b(cpg.c) && this.fG() && cac.a(this, $$0);
   }

   protected boolean p(ciw $$0) {
      bil $$1 = biy.h($$0);
      ciw $$2 = this.c($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(ciw $$0, ciw $$1) {
      if (cnf.d($$1)) {
         return false;
      } else {
         boolean $$2 = cac.a($$0) || $$0.a(ciz.uZ);
         boolean $$3 = cac.a($$1) || $$1.a(ciz.uZ);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.ga() && !$$0.a(ciz.uZ) && $$1.a(ciz.uZ) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(bye $$0) {
      this.a($$0);
      cac.a(this, $$0);
   }

   @Override
   public boolean a(big $$0, boolean $$1) {
      if (this.i_() && $$0.ag() == bik.W) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private big b(big $$0, int $$1) {
      List<big> $$2 = $$0.cP();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected aot r() {
      return this.dK().B ? null : cac.c(this).orElse(null);
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.rZ;
   }

   @Override
   protected aot h_() {
      return aou.rX;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.sb, 0.15F, 1.0F);
   }

   protected void b(aot $$0) {
      this.a($$0, this.eU(), this.eV());
   }

   @Override
   protected void gd() {
      this.b(aou.sc);
   }
}
