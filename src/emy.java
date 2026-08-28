import javax.annotation.Nullable;

public record emy(edu.c[] a) implements edu.c {
   @Nullable
   @Override
   public dxv calculate(edj.b $$0) {
      for (edu.c $$1 : this.a) {
         dxv $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
