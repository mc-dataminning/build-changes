import java.util.function.Predicate;

public interface etu extends eql, Predicate<eqk> {
   etv b();

   @FunctionalInterface
   public interface a {
      etu build();

      default etu.a invert() {
         return etr.a(this);
      }

      default etj.a or(etu.a $$0) {
         return etj.a(this, $$0);
      }

      default eti.a and(etu.a $$0) {
         return eti.a(this, $$0);
      }
   }
}
