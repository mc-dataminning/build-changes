public class ctz<T extends bsv & btn> extends cul {
   private final btb<T> a;
   private final int b;

   public ctz(cul.a $$0, btb<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      cuq $$3 = $$1.b($$2);
      if ($$0.B) {
         return bqw.c($$3);
      } else {
         bsv $$4 = $$1.dd();
         if ($$1.bR() && $$4 instanceof btn $$5 && $$4.ak() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, btq.d($$2));
            if ($$3.e()) {
               cuq $$6 = $$3.b(cut.qV, 1);
               return bqw.a($$6);
            }

            return bqw.a($$3);
         }

         $$1.b(awk.c.b(this));
         return bqw.c($$3);
      }
   }
}
