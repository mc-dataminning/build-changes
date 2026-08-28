import javax.annotation.Nullable;

public record epw(egr.c[] a) implements egr.c {
   @Nullable
   @Override
   public eao calculate(egg.b $$0) {
      for (egr.c $$1 : this.a) {
         eao $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
