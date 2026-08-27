import java.util.List;
import javax.annotation.Nullable;

public record dtq(List<dkq.c> a) implements dkq.c {
   @Nullable
   @Override
   public dfd calculate(dkf.b $$0) {
      for (dkq.c $$1 : this.a) {
         dfd $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
