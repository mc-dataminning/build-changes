import javax.annotation.Nullable;

public interface bpx {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bpx) {
         ((bpx)$$0).a();
      }
   }
}
