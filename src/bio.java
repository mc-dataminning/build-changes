import javax.annotation.Nullable;

public interface bio {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bio) {
         ((bio)$$0).a();
      }
   }
}
