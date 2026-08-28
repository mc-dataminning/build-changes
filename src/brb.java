import javax.annotation.Nullable;

public interface brb {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof brb) {
         ((brb)$$0).a();
      }
   }
}
