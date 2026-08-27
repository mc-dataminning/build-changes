public class ckr<T extends bkq & bld> extends cle {
   private final bku<T> a;
   private final int b;

   public ckr(cle.a $$0, bku<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      clj $$3 = $$1.b($$2);
      if ($$0.B) {
         return biy.c($$3);
      } else {
         bkq $$4 = $$1.db();
         if ($$1.bO() && $$4 instanceof bld $$5 && $$4.ai() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, $$1x -> $$1x.d($$2));
            if ($$3.b()) {
               clj $$6 = new clj(clm.qS);
               $$6.c($$3.v());
               return biy.a($$6);
            }

            return biy.a($$3);
         }

         $$1.b(arb.c.b(this));
         return biy.c($$3);
      }
   }
}
