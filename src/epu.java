public class epu extends epf {
   private final acq a;

   public epu(int $$0, int $$1, acq $$2) {
      this(0, 0, $$0, $$1, $$2);
   }

   public epu(int $$0, int $$1, int $$2, int $$3, acq $$4) {
      super($$0, $$1, $$2, $$3, sw.h());
      this.a = $$4;
   }

   @Override
   protected void a(esp $$0) {
   }

   @Override
   public void b(eox $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.k();
      int $$5 = this.h();
      $$0.a(this.a, this.p(), this.r(), 0.0F, 0.0F, $$4, $$5, $$4, $$5);
   }
}
