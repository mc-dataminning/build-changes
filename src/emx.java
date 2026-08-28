import javax.annotation.Nullable;

public record emx(edt.c[] a) implements edt.c {
   @Nullable
   @Override
   public dxu calculate(edi.b $$0) {
      for (edt.c $$1 : this.a) {
         dxu $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
