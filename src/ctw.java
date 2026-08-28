public class ctw<T extends bss & btk> extends cui {
   private final bsy<T> a;
   private final int b;

   public ctw(cui.a $$0, bsy<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      cun $$3 = $$1.b($$2);
      if ($$0.B) {
         return bqt.c($$3);
      } else {
         bss $$4 = $$1.dd();
         if ($$1.bR() && $$4 instanceof btk $$5 && $$4.ak() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, btn.d($$2));
            if ($$3.e()) {
               cun $$6 = $$3.b(cuq.qV, 1);
               return bqt.a($$6);
            }

            return bqt.a($$3);
         }

         $$1.b(awj.c.b(this));
         return bqt.c($$3);
      }
   }
}
