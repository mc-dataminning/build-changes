public class cwe extends cxc {
   private final crm a;
   private int b;

   public cwe(crm $$0, btz $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(czn $$0) {
      return false;
   }

   @Override
   public czn a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   public void a(crm $$0, czn $$1) {
      this.c_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(czn $$0, int $$1) {
      this.b += $$1;
      this.c_($$0);
   }

   @Override
   protected void c_(czn $$0) {
      $$0.a(this.a.dU(), this.a, this.b);
      if (this.a instanceof arr $$1 && this.c instanceof dxe $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
