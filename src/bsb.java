import javax.annotation.Nullable;

public interface bsb {
   void a();

   static void a(@Nullable Object $$0) {
      if ($$0 instanceof bsb) {
         ((bsb)$$0).a();
      }
   }
}
