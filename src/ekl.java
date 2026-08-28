import javax.annotation.Nullable;

public record ekl(ebj.c[] a) implements ebj.c {
   @Nullable
   @Override
   public dvj calculate(eay.b $$0) {
      for (ebj.c $$1 : this.a) {
         dvj $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
