import javax.annotation.Nullable;

public interface bgf {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bgf) {
         ((bgf)$$0).a();
      }
   }
}
