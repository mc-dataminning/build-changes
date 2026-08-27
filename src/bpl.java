import javax.annotation.Nullable;

public interface bpl {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bpl) {
         ((bpl)$$0).a();
      }
   }
}
