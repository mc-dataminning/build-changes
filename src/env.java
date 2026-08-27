import java.util.function.Predicate;

public interface env extends ekx, Predicate<ekw> {
   enw b();

   @FunctionalInterface
   public interface a {
      env build();

      default env.a invert() {
         return ens.a(this);
      }

      default enk.a or(env.a $$0) {
         return enk.a(this, $$0);
      }

      default enj.a and(env.a $$0) {
         return enj.a(this, $$0);
      }
   }
}
