import java.util.function.Predicate;

public interface eib extends efd, Predicate<efc> {
   eic b();

   @FunctionalInterface
   public interface a {
      eib build();

      default eib.a invert() {
         return ehy.a(this);
      }

      default ehq.a or(eib.a $$0) {
         return ehq.a(this, $$0);
      }

      default ehp.a and(eib.a $$0) {
         return ehp.a(this, $$0);
      }
   }
}
