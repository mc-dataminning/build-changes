import javax.annotation.Nullable;

public interface bmt {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bmt) {
         ((bmt)$$0).a();
      }
   }
}
