import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwd extends bui {
   public static final bih bT = bih.b(0.9F, 1.3F).a(0.7F);
   private static final int ca = 2;
   private static final int cb = 1;
   protected static final ImmutableList<btd<? extends btc<? super bwd>>> bU = ImmutableList.of(btd.c, btd.d, btd.b, btd.n, btd.f, btd.q);
   protected static final ImmutableList<bry<?>> bW = ImmutableList.of(
      bry.n, bry.h, bry.m, bry.E, bry.t, bry.au, bry.r, bry.R, bry.S, bry.N, bry.J, bry.O, new bry[]{bry.Q, bry.U, bry.V, bry.Y}
   );
   public static final int bX = 10;
   public static final double bY = 0.02;
   public static final double bZ = 0.1F;
   private static final adx<Boolean> cc = aea.a(bwd.class, adz.k);
   private static final adx<Boolean> cd = aea.a(bwd.class, adz.k);
   private static final adx<Boolean> ce = aea.a(bwd.class, adz.k);
   private boolean cf;
   private int cg;

   public bwd(bik<? extends bwd> $$0, cpk $$1) {
      super($$0, $$1);
      this.H().a(true);
      this.a(eam.f, -1.0F);
      this.a(eam.g, -1.0F);
   }

   public ciw p() {
      art $$0 = art.a((long)this.cv().hashCode());
      apy<cio> $$1 = this.gj() ? apq.b : apq.a;
      hj<cio> $$2 = jc.am.a($$1);
      return cip.a(ciz.vi, $$2.a($$0).get());
   }

   @Override
   protected bjx.b<bwd> dN() {
      return bjx.a(bW, bU);
   }

   @Override
   protected bjx<?> a(Dynamic<?> $$0) {
      return bwe.a(this.dN().a($$0));
   }

   public static bkc.a q() {
      return biy.x().a(bkd.a, 10.0).a(bkd.d, 0.2F).a(bkd.f, 2.0);
   }

   @Override
   protected void m() {
      if (this.i_()) {
         this.a(bkd.f).a(1.0);
         this.gi();
      } else {
         this.a(bkd.f).a(2.0);
         this.gh();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected aot r() {
      return this.gj() ? aou.jN : aou.jD;
   }

   @Override
   protected aot d(bhe $$0) {
      return this.gj() ? aou.jQ : aou.jG;
   }

   @Override
   protected aot h_() {
      return this.gj() ? aou.jO : aou.jE;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.jW, 0.15F, 1.0F);
   }

   protected aot t() {
      return this.gj() ? aou.jS : aou.jI;
   }

   @Nullable
   public bwd b(aki $$0, bib $$1) {
      bwd $$2 = bik.U.a((cpk)$$0);
      if ($$2 != null) {
         bwe.a($$2, $$0.y_());
         bib $$3 = (bib)($$0.y_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof bwd $$4 && $$4.gj() || $$0.y_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bjx<bwd> dM() {
      return (bjx<bwd>)super.dM();
   }

   @Override
   protected void V() {
      this.dK().ad().a("goatBrain");
      this.dM().a((aki)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("goatActivityUpdate");
      bwe.a(this);
      this.dK().ad().c();
      super.V();
   }

   @Override
   public int X() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.X();
      float $$2 = aro.c(this.aU, $$0);
      float $$3 = aro.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aU + $$3);
   }

   @Override
   public aot d(ciw $$0) {
      return this.gj() ? aou.jP : aou.jF;
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      if ($$2.a(ciz.pK) && !this.i_()) {
         $$0.a(this.t(), 1.0F, 1.0F);
         ciw $$3 = ciy.a($$2, $$0, ciz.pQ.ae_());
         $$0.a($$1, $$3);
         return bgo.a(this.dK().B);
      } else {
         bgo $$4 = super.b($$0, $$1);
         if ($$4.a() && this.m($$2)) {
            this.dK().a(null, this, this.d($$2), aov.g, 1.0F, aro.b(this.dK().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      art $$5 = $$0.y_();
      bwe.a(this, $$5);
      this.w($$5.j() < 0.02);
      this.m();
      if (!this.i_() && (double)$$5.i() < 0.1F) {
         adx<Boolean> $$6 = $$5.h() ? cd : ce;
         this.an.b($$6, false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void T() {
      super.T();
      aau.a(this);
   }

   @Override
   public bih a(bji $$0) {
      return $$0 == bji.g ? bT.a(this.dX()) : super.a($$0);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gj());
      $$0.a("HasLeftHorn", this.fZ());
      $$0.a("HasRightHorn", this.gf());
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.an.b(cd, $$0.q("HasLeftHorn"));
      this.an.b(ce, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.cf = true;
      } else if ($$0 == 59) {
         this.cf = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void b_() {
      if (this.cf) {
         this.cg++;
      } else {
         this.cg -= 2;
      }

      this.cg = aro.a(this.cg, 0, 20);
      super.b_();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cc, false);
      this.an.a(cd, true);
      this.an.a(ce, true);
   }

   public boolean fZ() {
      return this.an.b(cd);
   }

   public boolean gf() {
      return this.an.b(ce);
   }

   public boolean gg() {
      boolean $$0 = this.fZ();
      boolean $$1 = this.gf();
      if (!$$0 && !$$1) {
         return false;
      } else {
         adx<Boolean> $$2;
         if (!$$0) {
            $$2 = ce;
         } else if (!$$1) {
            $$2 = cd;
         } else {
            $$2 = this.ag.h() ? cd : ce;
         }

         this.an.b($$2, false);
         ehf $$5 = this.di();
         ciw $$6 = this.p();
         double $$7 = (double)aro.b(this.ag, -0.2F, 0.2F);
         double $$8 = (double)aro.b(this.ag, 0.3F, 0.7F);
         double $$9 = (double)aro.b(this.ag, -0.2F, 0.2F);
         bye $$10 = new bye(this.dK(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dK().b($$10);
         return true;
      }
   }

   public void gh() {
      this.an.b(cd, true);
      this.an.b(ce, true);
   }

   public void gi() {
      this.an.b(cd, false);
      this.an.b(ce, false);
   }

   public boolean gj() {
      return this.an.b(cc);
   }

   public void w(boolean $$0) {
      this.an.b(cc, $$0);
   }

   public float gk() {
      return (float)this.cg / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bik<? extends bui> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      return $$1.a_($$3.d()).a(apj.bR) && a($$1, $$3);
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }
}
