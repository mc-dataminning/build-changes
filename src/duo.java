import java.util.List;
import javax.annotation.Nullable;

public record duo(List<dlo.c> a) implements dlo.c {
   @Nullable
   @Override
   public dgb calculate(dld.b $$0) {
      for (dlo.c $$1 : this.a) {
         dgb $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
