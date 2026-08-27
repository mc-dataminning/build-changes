import java.util.function.Predicate;

public interface elu extends eiw, Predicate<eiv> {
   elv b();

   @FunctionalInterface
   public interface a {
      elu build();

      default elu.a invert() {
         return elr.a(this);
      }

      default elj.a or(elu.a $$0) {
         return elj.a(this, $$0);
      }

      default eli.a and(elu.a $$0) {
         return eli.a(this, $$0);
      }
   }
}
