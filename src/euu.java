import java.util.function.Predicate;

public interface euu extends erq, Predicate<erp> {
   euv b();

   @FunctionalInterface
   public interface a {
      euu build();

      default euu.a invert() {
         return eur.a(this);
      }

      default euj.a or(euu.a $$0) {
         return euj.a(this, $$0);
      }

      default eui.a and(euu.a $$0) {
         return eui.a(this, $$0);
      }
   }
}
