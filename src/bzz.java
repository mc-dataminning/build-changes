import javax.annotation.Nullable;

public class bzz extends byr {
   public bzz(biu<? extends bzz> $$0, cpv $$1) {
      super($$0, $$1);
      this.a(eax.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bP.a(3, new bru<>(this, caj.class, true));
      super.z();
   }

   @Override
   protected apc w() {
      return apd.Ao;
   }

   @Override
   protected apc d(bho $$0) {
      return apd.Aq;
   }

   @Override
   protected apc l_() {
      return apd.Ap;
   }

   @Override
   apc t() {
      return apd.Ar;
   }

   @Override
   protected void a(bho $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof byu $$4 && $$4.ge()) {
         $$4.gf();
         this.a((cpu)cji.ts);
      }
   }

   @Override
   protected void a(asc $$0, bgw $$1) {
      this.a(biv.a, new cjf(cji.oc));
   }

   @Override
   protected void b(asc $$0, bgw $$1) {
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qw $$4) {
      bjz $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.a(bkm.f).a(4.0);
      this.y();
      return $$5;
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return 2.1F;
   }

   @Override
   protected float l(biq $$0) {
      return -0.875F;
   }

   @Override
   public boolean C(biq $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bjg) {
            ((bjg)$$0).b(new bid(bif.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cca b(cjf $$0, float $$1) {
      cca $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bid $$0) {
      return $$0.c() == bif.t ? false : super.c($$0);
   }
}
