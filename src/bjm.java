import javax.annotation.Nullable;

public interface bjm {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bjm) {
         ((bjm)$$0).a();
      }
   }
}
