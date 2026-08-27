public class cpq extends cqo {
   private final clw a;
   private int b;

   public cpq(clw $$0, bpn $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cto $$0) {
      return false;
   }

   @Override
   public cto a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().I());
      }

      return super.a($$0);
   }

   @Override
   public void a(clw $$0, cto $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cto $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cto $$0) {
      $$0.a(this.a.dP(), this.a, this.b);
      if (this.a instanceof aqn $$1 && this.d instanceof dnu $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
