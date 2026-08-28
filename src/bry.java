import javax.annotation.Nullable;

public interface bry {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bry) {
         ((bry)$$0).a();
      }
   }
}
