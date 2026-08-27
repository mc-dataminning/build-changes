public class cfm extends cgj {
   private final cca a;
   private int b;

   public cfm(cca $$0, bgx $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(cjl $$0) {
      return false;
   }

   @Override
   public cjl a(int $$0) {
      if (this.f()) {
         this.b = this.b + Math.min($$0, this.e().L());
      }

      return super.a($$0);
   }

   @Override
   public void a(cca $$0, cjl $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(cjl $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cjl $$0) {
      $$0.a(this.a.dL(), this.a, this.b);
      if (this.a instanceof aku $$1 && this.d instanceof dco $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
