import javax.annotation.Nullable;

public record eqr(ehj.c[] a) implements ehj.c {
   @Nullable
   @Override
   public ebg calculate(egy.b $$0) {
      for (ehj.c $$1 : this.a) {
         ebg $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
