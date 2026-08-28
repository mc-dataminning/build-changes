import javax.annotation.Nullable;

public record ekp(ebn.c[] a) implements ebn.c {
   @Nullable
   @Override
   public dvo calculate(ebc.b $$0) {
      for (ebn.c $$1 : this.a) {
         dvo $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
