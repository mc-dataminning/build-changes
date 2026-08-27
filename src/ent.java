import java.util.function.Predicate;

public interface ent extends ekv, Predicate<eku> {
   enu b();

   @FunctionalInterface
   public interface a {
      ent build();

      default ent.a invert() {
         return enq.a(this);
      }

      default eni.a or(ent.a $$0) {
         return eni.a(this, $$0);
      }

      default enh.a and(ent.a $$0) {
         return enh.a(this, $$0);
      }
   }
}
