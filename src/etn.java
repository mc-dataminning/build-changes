import java.util.function.Predicate;

public interface etn extends eqe, Predicate<eqd> {
   eto b();

   @FunctionalInterface
   public interface a {
      etn build();

      default etn.a invert() {
         return etk.a(this);
      }

      default etc.a or(etn.a $$0) {
         return etc.a(this, $$0);
      }

      default etb.a and(etn.a $$0) {
         return etb.a(this, $$0);
      }
   }
}
