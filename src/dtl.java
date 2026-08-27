import java.util.List;
import javax.annotation.Nullable;

public record dtl(List<dkl.c> a) implements dkl.c {
   @Nullable
   @Override
   public dey calculate(dka.b $$0) {
      for (dkl.c $$1 : this.a) {
         dey $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
