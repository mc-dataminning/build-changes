import javax.annotation.Nullable;

public interface bsr {
   void a();

   static void a(@Nullable Object $$0) {
      if ($$0 instanceof bsr) {
         ((bsr)$$0).a();
      }
   }
}
