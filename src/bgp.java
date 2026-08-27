import javax.annotation.Nullable;

public interface bgp {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bgp) {
         ((bgp)$$0).a();
      }
   }
}
