public class cvc<T extends btr & buk> extends cvn {
   private final bty<T> a;
   private final int b;

   public cvc(cvn.a $$0, bty<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public brs a(dej $$0, cnx $$1, brr $$2) {
      cvs $$3 = $$1.b($$2);
      if ($$0.B) {
         return brs.e;
      } else {
         btr $$4 = $$1.dh();
         if ($$1.bW() && $$4 instanceof buk $$5 && $$4.ao() == this.a && $$5.a()) {
            btz $$6 = bun.d($$2);
            cvs $$7 = $$3.a(this.b, cvw.qW, $$1, $$6);
            return brs.b.a($$7);
         }

         $$1.b(awq.c.b(this));
         return brs.e;
      }
   }
}
