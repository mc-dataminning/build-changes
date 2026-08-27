import java.util.function.Predicate;

public interface efp extends ecr, Predicate<ecq> {
   efq b();

   @FunctionalInterface
   public interface a {
      efp build();

      default efp.a invert() {
         return efm.a(this);
      }

      default efe.a or(efp.a $$0) {
         return efe.a(this, $$0);
      }

      default efd.a and(efp.a $$0) {
         return efd.a(this, $$0);
      }
   }
}
