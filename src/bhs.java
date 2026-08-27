import javax.annotation.Nullable;

public interface bhs {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bhs) {
         ((bhs)$$0).a();
      }
   }
}
