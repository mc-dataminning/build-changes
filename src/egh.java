import java.util.function.Predicate;

public interface egh extends edj, Predicate<edi> {
   egi b();

   @FunctionalInterface
   public interface a {
      egh build();

      default egh.a invert() {
         return ege.a(this);
      }

      default efw.a or(egh.a $$0) {
         return efw.a(this, $$0);
      }

      default efv.a and(egh.a $$0) {
         return efv.a(this, $$0);
      }
   }
}
