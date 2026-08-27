import javax.annotation.Nullable;

public interface bgk {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bgk) {
         ((bgk)$$0).a();
      }
   }
}
