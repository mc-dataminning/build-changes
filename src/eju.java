import javax.annotation.Nullable;

public record eju(eas.c[] a) implements eas.c {
   @Nullable
   @Override
   public dus calculate(eah.b $$0) {
      for (eas.c $$1 : this.a) {
         dus $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
