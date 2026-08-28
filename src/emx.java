import javax.annotation.Nullable;

public record emx(eds.c[] a) implements eds.c {
   @Nullable
   @Override
   public dxq calculate(edh.b $$0) {
      for (eds.c $$1 : this.a) {
         dxq $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
