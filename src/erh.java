import java.util.function.Predicate;

public interface erh extends eob, Predicate<eoa> {
   eri b();

   @FunctionalInterface
   public interface a {
      erh build();

      default erh.a invert() {
         return ere.a(this);
      }

      default eqw.a or(erh.a $$0) {
         return eqw.a(this, $$0);
      }

      default eqv.a and(erh.a $$0) {
         return eqv.a(this, $$0);
      }
   }
}
