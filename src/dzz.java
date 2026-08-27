import java.util.List;
import javax.annotation.Nullable;

public record dzz(List<dqz.c> a) implements dqz.c {
   @Nullable
   @Override
   public dlj calculate(dqo.b $$0) {
      for (dqz.c $$1 : this.a) {
         dlj $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
