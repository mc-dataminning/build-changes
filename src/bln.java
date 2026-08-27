import javax.annotation.Nullable;

public interface bln {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bln) {
         ((bln)$$0).a();
      }
   }
}
