import java.util.function.Predicate;

public interface ehw extends eey, Predicate<eex> {
   ehx b();

   @FunctionalInterface
   public interface a {
      ehw build();

      default ehw.a invert() {
         return eht.a(this);
      }

      default ehl.a or(ehw.a $$0) {
         return ehl.a(this, $$0);
      }

      default ehk.a and(ehw.a $$0) {
         return ehk.a(this, $$0);
      }
   }
}
