import javax.annotation.Nullable;

public record emq(edm.c[] a) implements edm.c {
   @Nullable
   @Override
   public dxn calculate(edb.b $$0) {
      for (edm.c $$1 : this.a) {
         dxn $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
