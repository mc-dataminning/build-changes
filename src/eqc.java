import java.util.function.Predicate;

public interface eqc extends enc, Predicate<enb> {
   eqd b();

   @FunctionalInterface
   public interface a {
      eqc build();

      default eqc.a invert() {
         return epz.a(this);
      }

      default epr.a or(eqc.a $$0) {
         return epr.a(this, $$0);
      }

      default epq.a and(eqc.a $$0) {
         return epq.a(this, $$0);
      }
   }
}
