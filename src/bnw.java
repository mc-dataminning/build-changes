import javax.annotation.Nullable;

public interface bnw {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bnw) {
         ((bnw)$$0).a();
      }
   }
}
