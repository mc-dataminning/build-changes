import javax.annotation.Nullable;

public record ekw(ebu.c[] a) implements ebu.c {
   @Nullable
   @Override
   public dvv calculate(ebj.b $$0) {
      for (ebu.c $$1 : this.a) {
         dvv $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
