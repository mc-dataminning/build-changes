import javax.annotation.Nullable;

public record ema(ecw.c[] a) implements ecw.c {
   @Nullable
   @Override
   public dwx calculate(ecl.b $$0) {
      for (ecw.c $$1 : this.a) {
         dwx $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
