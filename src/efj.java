import java.util.function.Predicate;

public interface efj extends ecl, Predicate<eck> {
   efk b();

   @FunctionalInterface
   public interface a {
      efj build();

      default efj.a invert() {
         return efg.a(this);
      }

      default eey.a or(efj.a $$0) {
         return eey.a(this, $$0);
      }

      default eex.a and(efj.a $$0) {
         return eex.a(this, $$0);
      }
   }
}
