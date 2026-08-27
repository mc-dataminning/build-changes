public class frc extends frv {
   protected frc(foe $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fsc $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, 2.5F, $$7);
   }

   public static class a implements frk<ka> {
      private final fsc a;

      public a(fsc $$0) {
         this.a = $$0;
      }

      public frh a(ka $$0, foe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new frc($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
