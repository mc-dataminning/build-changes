import javax.annotation.Nullable;

public interface bjr {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bjr) {
         ((bjr)$$0).a();
      }
   }
}
