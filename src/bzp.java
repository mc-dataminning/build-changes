import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bzp extends bxu {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bU;
   protected static final ImmutableList<bws<? extends bwr<? super bzp>>> e = ImmutableList.of(bws.c, bws.d, bws.f, bws.r);
   protected static final ImmutableList<bvm<?>> bT = ImmutableList.of(bvm.n, bvm.h, bvm.m, bvm.E, bvm.t, bvm.J, bvm.O, bvm.Q, bvm.N, bvm.r, bvm.Y);

   public bzp(bly<? extends bxu> $$0, cto $$1) {
      super($$0, $$1);
      this.bL = new bsl(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new bsk(this, 10);
   }

   @Override
   protected bvu b(cto $$0) {
      return new bvw(this, $$0);
   }

   @Override
   protected bnk.b<bzp> dP() {
      return bnk.a(bT, e);
   }

   @Override
   protected bnk<?> a(Dynamic<?> $$0) {
      return bzq.a(this.dP().a($$0));
   }

   @Override
   public bnk<bzp> dO() {
      return (bnk<bzp>)super.dO();
   }

   @Override
   protected arq gf() {
      return arr.yx;
   }

   @Override
   protected void Z() {
      this.dM().af().a("tadpoleBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("tadpoleActivityUpdate");
      bzq.a(this);
      this.dM().af().c();
      super.Z();
   }

   public static bnp.a gg() {
      return bmm.C().a(bnq.m, 1.0).a(bnq.l, 6.0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dM().B) {
         this.s(this.bU + 1);
      }
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("Age", this.bU);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.s($$0.h("Age"));
   }

   @Nullable
   @Override
   protected arq y() {
      return null;
   }

   @Nullable
   @Override
   protected arq d(bks $$0) {
      return arr.yz;
   }

   @Nullable
   @Override
   protected arq n_() {
      return arr.yw;
   }

   @Override
   public bka b(cfh $$0, bjz $$1) {
      cmx $$2 = $$0.b($$1);
      if (this.m($$2)) {
         this.a($$0, $$2);
         return bka.a(this.dM().B);
      } else {
         return bxz.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a(this);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void l(cmx $$0) {
      bxz.a(this, $$0);
      sn $$1 = $$0.w();
      $$1.a("Age", this.gh());
   }

   @Override
   public void c(sn $$0) {
      bxz.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public cmx b() {
      return new cmx(cna.qH);
   }

   @Override
   public arq A() {
      return arr.cP;
   }

   private boolean m(cmx $$0) {
      return bzm.bT.a($$0);
   }

   private void a(cfh $$0, cmx $$1) {
      this.b($$0, $$1);
      this.c(blp.d_(this.gj()));
      this.dM().a(jx.M, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cfh $$0, cmx $$1) {
      if (!$$0.fT().d) {
         $$1.h(1);
      }
   }

   private int gh() {
      return this.bU;
   }

   private void c(int $$0) {
      this.s(this.bU + $$0 * 20);
   }

   private void s(int $$0) {
      this.bU = $$0;
      if (this.bU >= b) {
         this.gi();
      }
   }

   private void gi() {
      if (this.dM() instanceof and $$0) {
         bzm $$1 = bly.P.a(this.dM());
         if ($$1 != null) {
            $$1.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$1.a($$0, this.dM().d_($$1.dm()), bmo.i, null, null);
            $$1.t(this.fU());
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            $$1.fJ();
            this.a(arr.yy, 0.15F, 1.0F);
            $$0.a_($$1);
            this.am();
         }
      }
   }

   private int gj() {
      return Math.max(0, b - this.bU);
   }

   @Override
   public boolean ec() {
      return false;
   }
}
