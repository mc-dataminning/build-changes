import javax.annotation.Nullable;

public interface bnr {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bnr) {
         ((bnr)$$0).a();
      }
   }
}
