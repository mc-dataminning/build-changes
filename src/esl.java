import java.util.function.Predicate;

public interface esl extends epg, Predicate<epf> {
   esm b();

   @FunctionalInterface
   public interface a {
      esl build();

      default esl.a invert() {
         return esi.a(this);
      }

      default esa.a or(esl.a $$0) {
         return esa.a(this, $$0);
      }

      default erz.a and(esl.a $$0) {
         return erz.a(this, $$0);
      }
   }
}
