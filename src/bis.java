import javax.annotation.Nullable;

public interface bis {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bis) {
         ((bis)$$0).a();
      }
   }
}
