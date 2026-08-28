import javax.annotation.Nullable;

public interface bta {
   void a();

   static void a(@Nullable Object $$0) {
      if ($$0 instanceof bta) {
         ((bta)$$0).a();
      }
   }
}
