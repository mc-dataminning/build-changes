import java.util.function.Predicate;

public interface ejv extends egx, Predicate<egw> {
   ejw b();

   @FunctionalInterface
   public interface a {
      ejv build();

      default ejv.a invert() {
         return ejs.a(this);
      }

      default ejk.a or(ejv.a $$0) {
         return ejk.a(this, $$0);
      }

      default ejj.a and(ejv.a $$0) {
         return ejj.a(this, $$0);
      }
   }
}
