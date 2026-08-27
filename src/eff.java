import java.util.function.Predicate;

public interface eff extends ech, Predicate<ecg> {
   efg b();

   @FunctionalInterface
   public interface a {
      eff build();

      default eff.a invert() {
         return efc.a(this);
      }

      default eeu.a or(eff.a $$0) {
         return eeu.a(this, $$0);
      }

      default eet.a and(eff.a $$0) {
         return eet.a(this, $$0);
      }
   }
}
