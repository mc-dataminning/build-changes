import javax.annotation.Nullable;

public interface bpd {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bpd) {
         ((bpd)$$0).a();
      }
   }
}
