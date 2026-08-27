import javax.annotation.Nullable;

public interface bmu {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bmu) {
         ((bmu)$$0).a();
      }
   }
}
