import java.util.function.Predicate;

public interface eql extends enl, Predicate<enk> {
   eqm b();

   @FunctionalInterface
   public interface a {
      eql build();

      default eql.a invert() {
         return eqi.a(this);
      }

      default eqa.a or(eql.a $$0) {
         return eqa.a(this, $$0);
      }

      default epz.a and(eql.a $$0) {
         return epz.a(this, $$0);
      }
   }
}
