import java.util.function.Predicate;

public interface etr extends eqi, Predicate<eqh> {
   ets b();

   @FunctionalInterface
   public interface a {
      etr build();

      default etr.a invert() {
         return eto.a(this);
      }

      default etg.a or(etr.a $$0) {
         return etg.a(this, $$0);
      }

      default etf.a and(etr.a $$0) {
         return etf.a(this, $$0);
      }
   }
}
