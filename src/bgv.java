import javax.annotation.Nullable;

public interface bgv {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bgv) {
         ((bgv)$$0).a();
      }
   }
}
