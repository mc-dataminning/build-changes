import java.util.function.Predicate;

public interface efg extends eci, Predicate<ech> {
   efh b();

   @FunctionalInterface
   public interface a {
      efg build();

      default efg.a invert() {
         return efd.a(this);
      }

      default eev.a or(efg.a $$0) {
         return eev.a(this, $$0);
      }

      default eeu.a and(efg.a $$0) {
         return eeu.a(this, $$0);
      }
   }
}
