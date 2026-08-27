public class frn extends fsa {
   frn(fnq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3);
      this.u = 0.04F;
      if ($$5 == 0.0 && ($$4 != 0.0 || $$6 != 0.0)) {
         this.j = $$4;
         this.k = 0.1;
         this.l = $$6;
      }
   }

   public static class a implements fqw<ka> {
      private final fro a;

      public a(fro $$0) {
         this.a = $$0;
      }

      public fqt a(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         frn $$8 = new frn($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }
}
