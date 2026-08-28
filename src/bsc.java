import javax.annotation.Nullable;

public interface bsc {
   void a();

   static void a(@Nullable Object $$0) {
      if ($$0 instanceof bsc) {
         ((bsc)$$0).a();
      }
   }
}
