import org.jetbrains.annotations.Nullable;

public class bvp extends cin {
   private static final aks<Integer> ch = akw.a(bvp.class, aku.b);

   public bvp(bvi<? extends bvp> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected lq p() {
      return ls.aR;
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(ch, 0);
   }

   @Nullable
   @Override
   public bus a(arx $$0, bus $$1) {
      return bvi.ah.a($$0, bvh.e);
   }

   @Override
   protected awu t() {
      return awv.lj;
   }

   @Override
   protected awu u() {
      return awv.lg;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.li;
   }

   @Override
   protected awu o_() {
      return awv.lh;
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.x());
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.s($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void d_() {
      super.d_();
      int $$0 = this.x();
      if ($$0 > 0) {
         this.s($$0 - 1);
      }

      this.dW().a(ls.aS, this.d(0.6), this.dE(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3) {
         this.s(100);
      }

      return $$3;
   }

   private void s(int $$0) {
      this.al.a(ch, $$0);
   }

   public int x() {
      return this.al.a(ch);
   }

   public static boolean a(bvi<? extends bvx> $$0, dhq $$1, bvh $$2, jh $$3, bac $$4) {
      return $$3.v() <= $$1.P() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dkf.J);
   }
}
