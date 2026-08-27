public class epn extends Exception {
   public final eoc a;

   public epn(eoc $$0) {
      this.a = $$0;
   }

   @Override
   public String getMessage() {
      return this.a.c();
   }
}
