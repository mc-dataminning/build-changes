import java.util.function.Predicate;

public interface efr extends ect, Predicate<ecs> {
   efs b();

   @FunctionalInterface
   public interface a {
      efr build();

      default efr.a invert() {
         return efo.a(this);
      }

      default efg.a or(efr.a $$0) {
         return efg.a(this, $$0);
      }

      default eff.a and(efr.a $$0) {
         return eff.a(this, $$0);
      }
   }
}
