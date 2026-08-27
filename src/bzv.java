import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzv extends bui implements byr, bzx {
   private static final adx<Boolean> bW = aea.a(bzv.class, adz.k);
   private static final float bX = 0.2F;
   private static final int bY = 40;
   private static final float bZ = 0.3F;
   private static final int ca = 1;
   private static final float cb = 0.6F;
   private static final int cc = 6;
   private static final float cd = 0.5F;
   private static final int ce = 300;
   private int cf;
   private int cg;
   private boolean ch;
   protected static final ImmutableList<? extends btd<? extends btc<? super bzv>>> bT = ImmutableList.of(btd.c, btd.d, btd.n, btd.m);
   protected static final ImmutableList<? extends bry<?>> bU = ImmutableList.of(
      bry.r, bry.g, bry.h, bry.k, bry.l, bry.n, bry.m, bry.E, bry.t, bry.o, bry.p, bry.ap, new bry[]{bry.z, bry.ar, bry.as, bry.ao, bry.J, bry.av, bry.aw}
   );

   public bzv(bik<? extends bzv> $$0, cpk $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public boolean a(cbl $$0) {
      return !this.fO();
   }

   public static bkc.a p() {
      return byz.gf().a(bkd.a, 40.0).a(bkd.d, 0.3F).a(bkd.c, 0.6F).a(bkd.g, 1.0).a(bkd.f, 6.0);
   }

   @Override
   public boolean C(big $$0) {
      if (!($$0 instanceof biw)) {
         return false;
      } else {
         this.cf = 10;
         this.dK().a(this, (byte)4);
         this.a(aou.kO, 1.0F, this.eV());
         bzw.a(this, (biw)$$0);
         return bzx.a(this, (biw)$$0);
      }
   }

   @Override
   protected void e(biw $$0) {
      if (this.q()) {
         bzx.b(this, $$0);
      }
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dK().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof biw) {
            bzw.b(this, (biw)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bjx.b<bzv> dN() {
      return bjx.a(bU, bT);
   }

   @Override
   protected bjx<?> a(Dynamic<?> $$0) {
      return bzw.a(this.dN().a($$0));
   }

   @Override
   public bjx<bzv> dM() {
      return (bjx<bzv>)super.dM();
   }

   @Override
   protected void V() {
      this.dK().ad().a("hoglinBrain");
      this.dM().a((aki)this.dK(), this);
      this.dK().ad().c();
      bzw.a(this);
      if (this.t()) {
         this.cg++;
         if (this.cg > 300) {
            this.b(aou.kP);
            this.c((aki)this.dK());
         }
      } else {
         this.cg = 0;
      }
   }

   @Override
   public void b_() {
      if (this.cf > 0) {
         this.cf--;
      }

      super.b_();
   }

   @Override
   protected void m() {
      if (this.i_()) {
         this.bJ = 3;
         this.a(bkd.f).a(0.5);
      } else {
         this.bJ = 5;
         this.a(bkd.f).a(6.0);
      }
   }

   public static boolean c(bik<bzv> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      return !$$1.a_($$3.d()).a(csl.kK);
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      if ($$0.y_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fH();
   }

   @Override
   public float a(gv $$0, cpn $$1) {
      if (bzw.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(csl.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      bgo $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fF();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(aou.kO, 1.0F, this.eV());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int fZ() {
      return this.cf;
   }

   @Override
   public boolean ea() {
      return true;
   }

   @Override
   public int ec() {
      return this.bJ;
   }

   private void c(aki $$0) {
      bzr $$1 = this.a(bik.bo, true);
      if ($$1 != null) {
         $$1.b(new bht(bhv.i, 200, 0));
      }
   }

   @Override
   public boolean m(ciw $$0) {
      return $$0.a(ciz.dg);
   }

   public boolean q() {
      return !this.i_();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bW, false);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      if (this.gg()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cg);
      if (this.ch) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cg = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.al().b(bW, $$0);
   }

   private boolean gg() {
      return this.al().b(bW);
   }

   public boolean t() {
      return !this.dK().x_().b() && !this.gg() && !this.fQ();
   }

   private void x(boolean $$0) {
      this.ch = $$0;
   }

   public boolean gf() {
      return this.q() && !this.ch;
   }

   @Nullable
   @Override
   public bib a(aki $$0, bib $$1) {
      bzv $$2 = bik.W.a((cpk)$$0);
      if ($$2 != null) {
         $$2.fF();
      }

      return $$2;
   }

   @Override
   public boolean ga() {
      return !bzw.c(this) && super.ga();
   }

   @Override
   public aov da() {
      return aov.f;
   }

   @Override
   protected aot r() {
      return this.dK().B ? null : bzw.b(this).orElse(null);
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.kR;
   }

   @Override
   protected aot h_() {
      return aou.kQ;
   }

   @Override
   protected aot aL() {
      return aou.lw;
   }

   @Override
   protected aot aM() {
      return aou.lv;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.kT, 0.15F, 1.0F);
   }

   protected void b(aot $$0) {
      this.a($$0, this.eU(), this.eV());
   }

   @Override
   protected void T() {
      super.T();
      aau.a(this);
   }
}
