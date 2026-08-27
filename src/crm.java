public class crm<T extends bql & brb> extends cry {
   private final bqr<T> a;
   private final int b;

   public crm(cry.a $$0, bqr<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      csd $$3 = $$1.b($$2);
      if ($$0.B) {
         return bor.c($$3);
      } else {
         bql $$4 = $$1.db();
         if ($$1.bP() && $$4 instanceof brb $$5 && $$4.ai() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, bre.d($$2));
            if ($$3.d()) {
               csd $$6 = $$3.b(csg.qV, 1);
               return bor.a($$6);
            }

            return bor.a($$3);
         }

         $$1.b(avj.c.b(this));
         return bor.c($$3);
      }
   }
}
