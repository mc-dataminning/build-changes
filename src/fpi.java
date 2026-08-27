public class fpi extends fpu {
   fpi(flo $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3);
      this.u = 0.04F;
      if ($$5 == 0.0 && ($$4 != 0.0 || $$6 != 0.0)) {
         this.j = $$4;
         this.k = 0.1;
         this.l = $$6;
      }
   }

   public static class a implements foq<jz> {
      private final fpj a;

      public a(fpj $$0) {
         this.a = $$0;
      }

      public fon a(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fpi $$8 = new fpi($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }
}
