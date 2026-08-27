import javax.annotation.Nullable;

public interface bll {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bll) {
         ((bll)$$0).a();
      }
   }
}
