import javax.annotation.Nullable;

public class bux extends chv {
   private static final ajx<Integer> cg = akb.a(bux.class, ajz.b);

   public bux(buq<? extends bux> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected lr p() {
      return lt.aR;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cg, 0);
   }

   @Nullable
   @Override
   public bua a(arc $$0, bua $$1) {
      return buq.ag.a($$0, bup.e);
   }

   @Override
   protected avy t() {
      return avz.lj;
   }

   @Override
   protected avy u() {
      return avz.lg;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.li;
   }

   @Override
   protected avy o_() {
      return avz.lh;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.x());
   }

   @Override
   public void a(tq $$0) {
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

      this.dW().a(lt.aS, this.d(0.6), this.dE(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3) {
         this.s(100);
      }

      return $$3;
   }

   private void s(int $$0) {
      this.al.a(cg, $$0);
   }

   public int x() {
      return this.al.a(cg);
   }

   public static boolean a(buq<? extends bvf> $$0, dgx $$1, bup $$2, ji $$3, azg $$4) {
      return $$3.v() <= $$1.P() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(djm.J);
   }
}
