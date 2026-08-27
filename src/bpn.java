import javax.annotation.Nullable;

public interface bpn {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bpn) {
         ((bpn)$$0).a();
      }
   }
}
