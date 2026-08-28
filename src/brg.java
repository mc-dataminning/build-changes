import javax.annotation.Nullable;

public interface brg {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof brg) {
         ((brg)$$0).a();
      }
   }
}
