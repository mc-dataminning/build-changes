import java.util.function.Predicate;

public interface esn extends epi, Predicate<eph> {
   eso b();

   @FunctionalInterface
   public interface a {
      esn build();

      default esn.a invert() {
         return esk.a(this);
      }

      default esc.a or(esn.a $$0) {
         return esc.a(this, $$0);
      }

      default esb.a and(esn.a $$0) {
         return esb.a(this, $$0);
      }
   }
}
