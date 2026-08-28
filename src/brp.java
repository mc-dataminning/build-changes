import javax.annotation.Nullable;

public interface brp {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof brp) {
         ((brp)$$0).a();
      }
   }
}
