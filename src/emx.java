import java.util.function.Predicate;

public interface emx extends ejz, Predicate<ejy> {
   emy b();

   @FunctionalInterface
   public interface a {
      emx build();

      default emx.a invert() {
         return emu.a(this);
      }

      default emm.a or(emx.a $$0) {
         return emm.a(this, $$0);
      }

      default eml.a and(emx.a $$0) {
         return eml.a(this, $$0);
      }
   }
}
