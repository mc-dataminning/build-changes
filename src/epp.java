import javax.annotation.Nullable;

public record epp(egk.c[] a) implements egk.c {
   @Nullable
   @Override
   public eah calculate(efz.b $$0) {
      for (egk.c $$1 : this.a) {
         eah $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
