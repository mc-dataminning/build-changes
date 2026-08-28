import javax.annotation.Nullable;

public interface bsa {
   void a();

   static void a(@Nullable Object $$0) {
      if ($$0 instanceof bsa) {
         ((bsa)$$0).a();
      }
   }
}
