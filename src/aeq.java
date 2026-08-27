public interface aeq extends acq {
   @Override
   default tx b() {
      return tx.a;
   }

   void a(aep var1);
}
