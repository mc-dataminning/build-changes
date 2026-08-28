import javax.annotation.Nullable;

public record eqb(egw.c[] a) implements egw.c {
   @Nullable
   @Override
   public eat calculate(egl.b $$0) {
      for (egw.c $$1 : this.a) {
         eat $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
