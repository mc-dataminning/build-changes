public class cqg extends cre {
   private final cml a;
   private int b;

   public cqg(cml $$0, bqa $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cud $$0) {
      return false;
   }

   @Override
   public cud a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().H());
      }

      return super.a($$0);
   }

   @Override
   public void a(cml $$0, cud $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cud $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cud $$0) {
      $$0.a(this.a.dR(), this.a, this.b);
      if (this.a instanceof aqn $$1 && this.c instanceof dpe $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
