import javax.annotation.Nullable;

public record erb(eht.c[] a) implements eht.c {
   @Nullable
   @Override
   public ebq calculate(ehi.b $$0) {
      for (eht.c $$1 : this.a) {
         ebq $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
