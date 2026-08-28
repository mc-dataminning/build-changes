import javax.annotation.Nullable;

public interface bsz {
   void a();

   static void a(@Nullable Object $$0) {
      if ($$0 instanceof bsz) {
         ((bsz)$$0).a();
      }
   }
}
