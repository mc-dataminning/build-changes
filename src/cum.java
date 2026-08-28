public class cum extends cvk {
   private final cqi a;
   private int b;

   public cum(cqi $$0, btj $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cxy $$0) {
      return false;
   }

   @Override
   public cxy a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   public void a(cqi $$0, cxy $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cxy $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cxy $$0) {
      $$0.a(this.a.dV(), this.a, this.b);
      if (this.a instanceof aro $$1 && this.c instanceof duy $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
