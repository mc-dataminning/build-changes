public class cpb extends cpz {
   private final clh a;
   private int b;

   public cpb(clh $$0, bpf $$1, int $$2, int $$3, int $$4) {
      super($$1, $$2, $$3, $$4);
      this.a = $$0;
   }

   @Override
   public boolean a(csz $$0) {
      return false;
   }

   @Override
   public csz a(int $$0) {
      if (this.h()) {
         this.b = this.b + Math.min($$0, this.g().G());
      }

      return super.a($$0);
   }

   @Override
   public void a(clh $$0, csz $$1) {
      this.b_($$1);
      super.a($$0, $$1);
   }

   @Override
   protected void a(csz $$0, int $$1) {
      this.b += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(csz $$0) {
      $$0.a(this.a.dN(), this.a, this.b);
      if (this.a instanceof aqi $$1 && this.d instanceof dna $$2) {
         $$2.a($$1);
      }

      this.b = 0;
   }
}
