import javax.annotation.Nullable;

public interface brz {
   void a();

   static void a(@Nullable Object $$0) {
      if ($$0 instanceof brz) {
         ((brz)$$0).a();
      }
   }
}
