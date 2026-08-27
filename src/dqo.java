import java.util.List;
import javax.annotation.Nullable;

public record dqo(List<dho.c> a) implements dho.c {
   @Nullable
   @Override
   public dcb calculate(dhd.b $$0) {
      for (dho.c $$1 : this.a) {
         dcb $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
