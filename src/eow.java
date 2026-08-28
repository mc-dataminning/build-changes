import javax.annotation.Nullable;

public record eow(efr.c[] a) implements efr.c {
   @Nullable
   @Override
   public dzo calculate(efg.b $$0) {
      for (efr.c $$1 : this.a) {
         dzo $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
