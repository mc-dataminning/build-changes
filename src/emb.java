import javax.annotation.Nullable;

public record emb(ecx.c[] a) implements ecx.c {
   @Nullable
   @Override
   public dwy calculate(ecm.b $$0) {
      for (ecx.c $$1 : this.a) {
         dwy $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
