import javax.annotation.Nullable;

public record ejc(eaa.c[] a) implements eaa.c {
   @Nullable
   @Override
   public dua calculate(dzp.b $$0) {
      for (eaa.c $$1 : this.a) {
         dua $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
