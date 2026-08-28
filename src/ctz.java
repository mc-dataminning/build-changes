public class ctz<T extends bsr & btj> extends cul {
   private final bsx<T> a;
   private final int b;

   public ctz(cul.a $$0, bsx<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      cuq $$3 = $$1.b($$2);
      if ($$0.B) {
         return bqs.c($$3);
      } else {
         bsr $$4 = $$1.dd();
         if ($$1.bS() && $$4 instanceof btj $$5 && $$4.am() == this.a && $$5.a()) {
            bsy $$6 = btn.d($$2);
            cuq $$7 = $$3.a(this.b, cut.qV, $$1, $$6);
            return bqs.a($$7);
         }

         $$1.b(avz.c.b(this));
         return bqs.c($$3);
      }
   }
}
