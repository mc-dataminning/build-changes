public class cvm<T extends bue & bux> extends cvx {
   private final bul<T> a;
   private final int b;

   public cvm(bul<T> $$0, int $$1, cvx.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bsd a(dfb $$0, com $$1, bsc $$2) {
      cwb $$3 = $$1.b($$2);
      if ($$0.C) {
         return bsd.e;
      } else {
         bue $$4 = $$1.dm();
         if ($$1.ca() && $$4 instanceof bux $$5 && $$4.ar() == this.a && $$5.a()) {
            bum $$6 = bva.d($$2);
            cwb $$7 = $$3.a(this.b, cwf.qW, $$1, $$6);
            return bsd.b.a($$7);
         }

         $$1.b(awv.c.b(this));
         return bsd.e;
      }
   }
}
