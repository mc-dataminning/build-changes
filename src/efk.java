import java.util.function.Predicate;

public interface efk extends ecm, Predicate<ecl> {
   efl b();

   @FunctionalInterface
   public interface a {
      efk build();

      default efk.a invert() {
         return efh.a(this);
      }

      default eez.a or(efk.a $$0) {
         return eez.a(this, $$0);
      }

      default eey.a and(efk.a $$0) {
         return eey.a(this, $$0);
      }
   }
}
