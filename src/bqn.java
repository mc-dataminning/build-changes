import javax.annotation.Nullable;

public interface bqn {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bqn) {
         ((bqn)$$0).a();
      }
   }
}
