import javax.annotation.Nullable;

public interface bql {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bql) {
         ((bql)$$0).a();
      }
   }
}
