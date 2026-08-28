import javax.annotation.Nullable;

public interface bqi {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bqi) {
         ((bqi)$$0).a();
      }
   }
}
