import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cea extends byc implements cco, cec {
   private static final agn<Boolean> bX = agq.a(cea.class, agp.k);
   private static final float bY = 0.2F;
   private static final int bZ = 40;
   private static final float ca = 0.3F;
   private static final int cb = 1;
   private static final float cc = 0.6F;
   private static final int cd = 6;
   private static final float ce = 0.5F;
   private static final int cf = 300;
   private int cg;
   private int ch;
   private boolean ci;
   protected static final ImmutableList<? extends bwx<? extends bww<? super cea>>> bU = ImmutableList.of(bwx.c, bwx.d, bwx.o, bwx.n);
   protected static final ImmutableList<? extends bvq<?>> bV = ImmutableList.of(
      bvq.r,
      bvq.g,
      bvq.h,
      bvq.k,
      bvq.l,
      bvq.n,
      bvq.m,
      bvq.E,
      bvq.t,
      bvq.o,
      bvq.p,
      bvq.aq,
      new bvq[]{bvq.z, bvq.as, bvq.at, bvq.ap, bvq.K, bvq.aw, bvq.ax, bvq.Z}
   );

   public cea(bmc<? extends cea> $$0, ctx $$1) {
      super($$0, $$1);
      this.bK = 5;
   }

   @Override
   public boolean a(cfq $$0) {
      return !this.fT();
   }

   public static bnt.a u() {
      return ccw.gl().a(bnu.n, 40.0).a(bnu.o, 0.3F).a(bnu.k, 0.6F).a(bnu.d, 1.0).a(bnu.c, 6.0);
   }

   @Override
   public boolean B(blw $$0) {
      if (!($$0 instanceof bmo)) {
         return false;
      } else {
         this.cg = 10;
         this.dL().a(this, (byte)4);
         this.a(art.lR, 1.0F, this.eX());
         ceb.a(this, (bmo)$$0);
         return cec.a(this, (bmo)$$0);
      }
   }

   @Override
   protected void e(bmo $$0) {
      if (this.w()) {
         cec.b(this, $$0);
      }
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bmo) {
            ceb.b(this, (bmo)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bno.b<cea> dO() {
      return bno.a(bV, bU);
   }

   @Override
   protected bno<?> a(Dynamic<?> $$0) {
      return ceb.a(this.dO().a($$0));
   }

   @Override
   public bno<cea> dN() {
      return (bno<cea>)super.dN();
   }

   @Override
   protected void aa() {
      this.dL().af().a("hoglinBrain");
      this.dN().a((ane)this.dL(), this);
      this.dL().af().c();
      ceb.a(this);
      if (this.A()) {
         this.ch++;
         if (this.ch > 300) {
            this.b(art.lS);
            this.c((ane)this.dL());
         }
      } else {
         this.ch = 0;
      }
   }

   @Override
   public void d_() {
      if (this.cg > 0) {
         this.cg--;
      }

      super.d_();
   }

   @Override
   protected void m() {
      if (this.o_()) {
         this.bK = 3;
         this.f(bnu.c).a(0.5);
      } else {
         this.bK = 5;
         this.f(bnu.c).a(6.0);
      }
   }

   public static boolean c(bmc<cea> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      return !$$1.a_($$3.d()).a(cxa.kK);
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      if ($$0.F_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fM();
   }

   @Override
   public float a(hx $$0, cua $$1) {
      if (ceb.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(cxa.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      bkc $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fK();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cg = 10;
         this.a(art.lR, 1.0F, this.eX());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gf() {
      return this.cg;
   }

   @Override
   public boolean ec() {
      return true;
   }

   @Override
   public int ee() {
      return this.bK;
   }

   private void c(ane $$0) {
      cdo $$1 = this.a(bmc.br, true);
      if ($$1 != null) {
         $$1.b(new blj(bll.i, 200, 0));
      }
   }

   @Override
   public boolean m(cng $$0) {
      return $$0.a(cnj.dB);
   }

   public boolean w() {
      return !this.o_();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bX, false);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      if (this.gm()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.ch);
      if (this.ci) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.ch = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.an().b(bX, $$0);
   }

   private boolean gm() {
      return this.an().b(bX);
   }

   public boolean A() {
      return !this.dL().E_().b() && !this.gm() && !this.fV();
   }

   private void x(boolean $$0) {
      this.ci = $$0;
   }

   public boolean gl() {
      return this.w() && !this.ci;
   }

   @Nullable
   @Override
   public blr a(ane $$0, blr $$1) {
      cea $$2 = bmc.Y.a((ctx)$$0);
      if ($$2 != null) {
         $$2.fK();
      }

      return $$2;
   }

   @Override
   public boolean gg() {
      return !ceb.c(this) && super.gg();
   }

   @Override
   public aru db() {
      return aru.f;
   }

   @Override
   protected ars y() {
      return this.dL().B ? null : ceb.b(this).orElse(null);
   }

   @Override
   protected ars d(bkv $$0) {
      return art.lU;
   }

   @Override
   protected ars n_() {
      return art.lT;
   }

   @Override
   protected ars aN() {
      return art.mz;
   }

   @Override
   protected ars aO() {
      return art.my;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.lW, 0.15F, 1.0F);
   }

   protected void b(ars $$0) {
      this.a($$0, this.eW(), this.eX());
   }

   @Override
   protected void Z() {
      super.Z();
      adj.a(this);
   }
}
