import javax.annotation.Nullable;

public record enu(eep.c[] a) implements eep.c {
   @Nullable
   @Override
   public dym calculate(eee.b $$0) {
      for (eep.c $$1 : this.a) {
         dym $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
