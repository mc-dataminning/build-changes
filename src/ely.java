import javax.annotation.Nullable;

public record ely(ecu.c[] a) implements ecu.c {
   @Nullable
   @Override
   public dwv calculate(ecj.b $$0) {
      for (ecu.c $$1 : this.a) {
         dwv $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
