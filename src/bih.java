import javax.annotation.Nullable;

public interface bih {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bih) {
         ((bih)$$0).a();
      }
   }
}
