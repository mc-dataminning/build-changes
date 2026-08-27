import javax.annotation.Nullable;

public interface bjs {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bjs) {
         ((bjs)$$0).a();
      }
   }
}
