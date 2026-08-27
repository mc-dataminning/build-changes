import javax.annotation.Nullable;

public interface boh {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof boh) {
         ((boh)$$0).a();
      }
   }
}
