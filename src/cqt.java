public class cqt extends crr {
   private final cmz a;
   private int b;

   public cqt(cmz $$0, bqp $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cur $$0) {
      return false;
   }

   @Override
   public cur a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().I());
      }

      return super.a($$0);
   }

   @Override
   public void a(cmz $$0, cur $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cur $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cur $$0) {
      $$0.a(this.a.dP(), this.a, this.b);
      if (this.a instanceof arg $$1 && this.c instanceof dox $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
