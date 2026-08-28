import javax.annotation.Nullable;

public record emr(edn.c[] a) implements edn.c {
   @Nullable
   @Override
   public dxo calculate(edc.b $$0) {
      for (edn.c $$1 : this.a) {
         dxo $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
