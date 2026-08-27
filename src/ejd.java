import java.util.function.Predicate;

public interface ejd extends egf, Predicate<ege> {
   eje b();

   @FunctionalInterface
   public interface a {
      ejd build();

      default ejd.a invert() {
         return eja.a(this);
      }

      default eis.a or(ejd.a $$0) {
         return eis.a(this, $$0);
      }

      default eir.a and(ejd.a $$0) {
         return eir.a(this, $$0);
      }
   }
}
