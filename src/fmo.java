public class fmo extends fna {
   fmo(fix $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3);
      this.u = 0.04F;
      if ($$5 == 0.0 && ($$4 != 0.0 || $$6 != 0.0)) {
         this.j = $$4;
         this.k = 0.1;
         this.l = $$6;
      }
   }

   public static class a implements flx<ja> {
      private final fmp a;

      public a(fmp $$0) {
         this.a = $$0;
      }

      public flu a(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fmo $$8 = new fmo($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }
}
