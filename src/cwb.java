public class cwb extends cwz {
   private final crj a;
   private int b;

   public cwb(crj $$0, btz $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(czk $$0) {
      return false;
   }

   @Override
   public czk a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   public void a(crj $$0, czk $$1) {
      this.c_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(czk $$0, int $$1) {
      this.b += $$1;
      this.c_($$0);
   }

   @Override
   protected void c_(czk $$0) {
      $$0.a(this.a.dU(), this.a, this.b);
      if (this.a instanceof arr $$1 && this.c instanceof dwz $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
