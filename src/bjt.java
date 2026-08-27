import javax.annotation.Nullable;

public interface bjt {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bjt) {
         ((bjt)$$0).a();
      }
   }
}
