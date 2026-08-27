import javax.annotation.Nullable;

public interface bmc {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bmc) {
         ((bmc)$$0).a();
      }
   }
}
