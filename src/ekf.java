import javax.annotation.Nullable;

public record ekf(ebd.c[] a) implements ebd.c {
   @Nullable
   @Override
   public dvd calculate(eas.b $$0) {
      for (ebd.c $$1 : this.a) {
         dvd $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
