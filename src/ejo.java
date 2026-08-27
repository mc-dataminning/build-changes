import java.util.function.Predicate;

public interface ejo extends egq, Predicate<egp> {
   ejp b();

   @FunctionalInterface
   public interface a {
      ejo build();

      default ejo.a invert() {
         return ejl.a(this);
      }

      default ejd.a or(ejo.a $$0) {
         return ejd.a(this, $$0);
      }

      default ejc.a and(ejo.a $$0) {
         return ejc.a(this, $$0);
      }
   }
}
