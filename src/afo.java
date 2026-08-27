public interface afo extends acq, acr {
   @Override
   default tx b() {
      return tx.c;
   }

   void a(afq var1);
}
