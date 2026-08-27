public class esn extends Exception {
   public final erc a;

   public esn(erc $$0) {
      this.a = $$0;
   }

   @Override
   public String getMessage() {
      return this.a.c();
   }
}
