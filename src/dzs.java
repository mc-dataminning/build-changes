import java.util.List;
import javax.annotation.Nullable;

public record dzs(List<dqs.c> a) implements dqs.c {
   @Nullable
   @Override
   public dlf calculate(dqh.b $$0) {
      for (dqs.c $$1 : this.a) {
         dlf $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
