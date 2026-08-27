public class ekn extends ekm {
   public static final int d = 5;
   public final int e;

   public ekn(int $$0, int $$1) {
      super($$1, "Retry operation");
      if ($$0 >= 0 && $$0 <= 120) {
         this.e = $$0;
      } else {
         this.e = 5;
      }
   }
}
