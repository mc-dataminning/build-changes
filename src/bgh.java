import javax.annotation.Nullable;

public interface bgh {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bgh) {
         ((bgh)$$0).a();
      }
   }
}
