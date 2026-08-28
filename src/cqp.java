public class cqp extends crn {
   private final cmv a;
   private int b;

   public cqp(cmv $$0, bql $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cun $$0) {
      return false;
   }

   @Override
   public cun a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().I());
      }

      return super.a($$0);
   }

   @Override
   public void a(cmv $$0, cun $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cun $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cun $$0) {
      $$0.a(this.a.dP(), this.a, this.b);
      if (this.a instanceof arf $$1 && this.c instanceof dot $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
