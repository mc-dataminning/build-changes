public class cwo extends cwz {
   private final cwm a;
   private final crj b;
   private int g;
   private final die h;

   public cwo(crj $$0, die $$1, cwm $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(czk $$0) {
      return false;
   }

   @Override
   public czk a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(czk $$0, int $$1) {
      this.g += $$1;
      this.c_($$0);
   }

   @Override
   protected void c_(czk $$0) {
      $$0.a(this.b.dU(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(crj $$0, czk $$1) {
      this.c_($$1);
      dif $$2 = this.a.g();
      if ($$2 != null) {
         czk $$3 = this.a.a(0);
         czk $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(awx.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.s(this.h.t() + $$2.q());
      }
   }
}
