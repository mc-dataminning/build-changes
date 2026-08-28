import javax.annotation.Nullable;

public interface bpu {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bpu) {
         ((bpu)$$0).a();
      }
   }
}
