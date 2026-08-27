public class fsm extends fsn<jt> {
   protected fsm(fqe $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, jt $$7, fuc $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public static class a implements ftk<jt> {
      private final fuc a;

      public a(fuc $$0) {
         this.a = $$0;
      }

      public fth a(jt $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fsm($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0, this.a);
      }
   }
}
