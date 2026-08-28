public class ctx<T extends bst & btl> extends cuj {
   private final bsz<T> a;
   private final int b;

   public ctx(cuj.a $$0, bsz<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      cuo $$3 = $$1.b($$2);
      if ($$0.B) {
         return bqu.c($$3);
      } else {
         bst $$4 = $$1.dd();
         if ($$1.bR() && $$4 instanceof btl $$5 && $$4.ak() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, bto.d($$2));
            if ($$3.e()) {
               cuo $$6 = $$3.b(cur.qV, 1);
               return bqu.a($$6);
            }

            return bqu.a($$3);
         }

         $$1.b(awj.c.b(this));
         return bqu.c($$3);
      }
   }
}
