public class fro extends fsb {
   fro(fnr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3);
      this.u = 0.04F;
      if ($$5 == 0.0 && ($$4 != 0.0 || $$6 != 0.0)) {
         this.j = $$4;
         this.k = 0.1;
         this.l = $$6;
      }
   }

   public static class a implements fqx<ka> {
      private final frp a;

      public a(frp $$0) {
         this.a = $$0;
      }

      public fqu a(ka $$0, fnr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fro $$8 = new fro($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }
}
