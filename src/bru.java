import javax.annotation.Nullable;

public interface bru {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bru) {
         ((bru)$$0).a();
      }
   }
}
