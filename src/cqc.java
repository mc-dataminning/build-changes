public class cqc extends cra {
   private final cmh a;
   private int b;

   public cqc(cmh $$0, bpw $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cua $$0) {
      return false;
   }

   @Override
   public cua a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().H());
      }

      return super.a($$0);
   }

   @Override
   public void a(cmh $$0, cua $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cua $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cua $$0) {
      $$0.a(this.a.dP(), this.a, this.b);
      if (this.a instanceof aql $$1 && this.c instanceof dpb $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
