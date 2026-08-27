import javax.annotation.Nullable;

public interface bjc {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bjc) {
         ((bjc)$$0).a();
      }
   }
}
