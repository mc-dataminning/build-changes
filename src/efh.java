import java.util.function.Predicate;

public interface efh extends eci, Predicate<ech> {
   efi b();

   @FunctionalInterface
   public interface a {
      efh build();

      default efh.a invert() {
         return efe.a(this);
      }

      default eew.a or(efh.a $$0) {
         return eew.a(this, $$0);
      }

      default eev.a and(efh.a $$0) {
         return eev.a(this, $$0);
      }
   }
}
