import java.util.function.Predicate;

public interface etq extends eqh, Predicate<eqg> {
   etr b();

   @FunctionalInterface
   public interface a {
      etq build();

      default etq.a invert() {
         return etn.a(this);
      }

      default etf.a or(etq.a $$0) {
         return etf.a(this, $$0);
      }

      default ete.a and(etq.a $$0) {
         return ete.a(this, $$0);
      }
   }
}
