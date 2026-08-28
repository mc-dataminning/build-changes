public class cqf extends crd {
   private final cmk a;
   private int b;

   public cqf(cmk $$0, bpz $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cuc $$0) {
      return false;
   }

   @Override
   public cuc a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().H());
      }

      return super.a($$0);
   }

   @Override
   public void a(cmk $$0, cuc $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cuc $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cuc $$0) {
      $$0.a(this.a.dQ(), this.a, this.b);
      if (this.a instanceof aqn $$1 && this.c instanceof dpd $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
