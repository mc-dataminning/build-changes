import javax.annotation.Nullable;

public class bzq extends byi {
   public bzq(bik<? extends bzq> $$0, cpk $$1) {
      super($$0, $$1);
      this.a(eam.i, 8.0F);
   }

   @Override
   protected void w() {
      this.bP.a(3, new brl<>(this, caa.class, true));
      super.w();
   }

   @Override
   protected aot r() {
      return aou.Ae;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.Ag;
   }

   @Override
   protected aot h_() {
      return aou.Af;
   }

   @Override
   aot q() {
      return aou.Ah;
   }

   @Override
   protected void a(bhe $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof byl $$4 && $$4.ga()) {
         $$4.gb();
         this.a((cpj)ciz.ts);
      }
   }

   @Override
   protected void a(art $$0, bgm $$1) {
      this.a(bil.a, new ciw(ciz.oc));
   }

   @Override
   protected void b(art $$0, bgm $$1) {
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      bjq $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.a(bkd.f).a(4.0);
      this.t();
      return $$5;
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return 2.1F;
   }

   @Override
   protected float l(big $$0) {
      return -0.875F;
   }

   @Override
   public boolean C(big $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof biw) {
            ((biw)$$0).b(new bht(bhv.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cbr b(ciw $$0, float $$1) {
      cbr $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bht $$0) {
      return $$0.c() == bhv.t ? false : super.c($$0);
   }
}
