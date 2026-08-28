import javax.annotation.Nullable;

public interface bqg {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bqg) {
         ((bqg)$$0).a();
      }
   }
}
