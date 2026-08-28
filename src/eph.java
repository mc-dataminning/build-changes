import javax.annotation.Nullable;

public record eph(egc.c[] a) implements egc.c {
   @Nullable
   @Override
   public dzz calculate(efr.b $$0) {
      for (egc.c $$1 : this.a) {
         dzz $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
