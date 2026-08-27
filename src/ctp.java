public class ctp<T extends brv & bsl> extends cuc {
   private final bsb<T> a;
   private final int b;

   public ctp(cuc.a $$0, bsb<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      cuh $$3 = $$1.b($$2);
      if ($$0.C) {
         return bqb.c($$3);
      } else {
         brv $$4 = $$1.di();
         if ($$1.bW() && $$4 instanceof bsl $$5 && $$4.ak() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, bso.d($$2));
            if ($$3.d()) {
               cuh $$6 = $$3.b(cuk.ss, 1);
               return bqb.a($$6);
            }

            return bqb.a($$3);
         }

         $$1.b(avz.c.b(this));
         return bqb.c($$3);
      }
   }
}
