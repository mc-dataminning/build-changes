import java.util.function.Predicate;

public interface eju extends egw, Predicate<egv> {
   ejv b();

   @FunctionalInterface
   public interface a {
      eju build();

      default eju.a invert() {
         return ejr.a(this);
      }

      default ejj.a or(eju.a $$0) {
         return ejj.a(this, $$0);
      }

      default eji.a and(eju.a $$0) {
         return eji.a(this, $$0);
      }
   }
}
