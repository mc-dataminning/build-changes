import javax.annotation.Nullable;

public interface bdo {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bdo) {
         ((bdo)$$0).a();
      }
   }
}
