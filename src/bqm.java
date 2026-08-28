import javax.annotation.Nullable;

public interface bqm {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bqm) {
         ((bqm)$$0).a();
      }
   }
}
