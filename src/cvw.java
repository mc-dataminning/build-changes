public class cvw extends cwh {
   private final cvu a;
   private final cqs b;
   private int g;
   private final dhm h;

   public cvw(cqs $$0, dhm $$1, cvu $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cys $$0) {
      return false;
   }

   @Override
   public cys a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cys $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cys $$0) {
      $$0.a(this.b.dV(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cqs $$0, cys $$1) {
      this.b_($$1);
      dhn $$2 = this.a.g();
      if ($$2 != null) {
         cys $$3 = this.a.a(0);
         cys $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(awv.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.s(this.h.t() + $$2.q());
      }
   }
}
