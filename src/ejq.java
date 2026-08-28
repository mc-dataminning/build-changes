import javax.annotation.Nullable;

public record ejq(eao.c[] a) implements eao.c {
   @Nullable
   @Override
   public duo calculate(ead.b $$0) {
      for (eao.c $$1 : this.a) {
         duo $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
