import javax.annotation.Nullable;

public interface brj {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof brj) {
         ((brj)$$0).a();
      }
   }
}
