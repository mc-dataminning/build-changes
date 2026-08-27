import java.util.List;
import javax.annotation.Nullable;

public record eau(List<dru.c> a) implements dru.c {
   @Nullable
   @Override
   public dme calculate(drj.b $$0) {
      for (dru.c $$1 : this.a) {
         dme $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
