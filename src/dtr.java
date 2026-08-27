import java.util.List;
import javax.annotation.Nullable;

public record dtr(List<dkr.c> a) implements dkr.c {
   @Nullable
   @Override
   public dfe calculate(dkg.b $$0) {
      for (dkr.c $$1 : this.a) {
         dfe $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
