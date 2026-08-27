public class cpt<T extends bow & bpl> extends cqf {
   private final bpc<T> a;
   private final int b;

   public cpt(cqf.a $$0, bpc<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      cqk $$3 = $$1.b($$2);
      if ($$0.B) {
         return bnd.c($$3);
      } else {
         bow $$4 = $$1.da();
         if ($$1.bO() && $$4 instanceof bpl $$5 && $$4.ai() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, bpo.d($$2));
            if ($$3.b()) {
               cqk $$6 = $$3.b(cqn.qU, 1);
               return bnd.a($$6);
            }

            return bnd.a($$3);
         }

         $$1.b(aui.c.b(this));
         return bnd.c($$3);
      }
   }
}
