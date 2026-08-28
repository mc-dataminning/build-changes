public class cqq extends cro {
   private final cmv a;
   private int b;

   public cqq(cmv $$0, bqj $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cuo $$0) {
      return false;
   }

   @Override
   public cuo a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().H());
      }

      return super.a($$0);
   }

   @Override
   public void a(cmv $$0, cuo $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cuo $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cuo $$0) {
      $$0.a(this.a.dQ(), this.a, this.b);
      if (this.a instanceof aqu $$1 && this.c instanceof dpt $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
