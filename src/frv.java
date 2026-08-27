public class frv extends fpz {
   protected frv(foe $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, fsc $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, 0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.3F, 8, -0.1F, true);
   }

   public static class a implements frk<ka> {
      private final fsc a;

      public a(fsc $$0) {
         this.a = $$0;
      }

      public frh a(ka $$0, foe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new frv($$1, $$2, $$3, $$4, $$5, $$6, $$7, 1.0F, this.a);
      }
   }
}
