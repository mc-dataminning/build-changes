public class ftq extends fss {
   protected ftq(fpx $$0, double $$1, double $$2, double $$3, double $$4, ftv $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements ftd<kc> {
      private final ftv a;

      public a(ftv $$0) {
         this.a = $$0;
      }

      public fta a(kc $$0, fpx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ftq($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
