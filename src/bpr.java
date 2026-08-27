import javax.annotation.Nullable;

public interface bpr {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bpr) {
         ((bpr)$$0).a();
      }
   }
}
