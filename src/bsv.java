import javax.annotation.Nullable;

public interface bsv {
   void a();

   static void a(@Nullable Object $$0) {
      if ($$0 instanceof bsv) {
         ((bsv)$$0).a();
      }
   }
}
