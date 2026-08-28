import javax.annotation.Nullable;

public record elz(ecv.c[] a) implements ecv.c {
   @Nullable
   @Override
   public dww calculate(eck.b $$0) {
      for (ecv.c $$1 : this.a) {
         dww $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
