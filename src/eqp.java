import javax.annotation.Nullable;

public record eqp(ehh.c[] a) implements ehh.c {
   @Nullable
   @Override
   public ebe calculate(egw.b $$0) {
      for (ehh.c $$1 : this.a) {
         ebe $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
