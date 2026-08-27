import java.util.List;
import javax.annotation.Nullable;

public record dxt(List<dot.c> a) implements dot.c {
   @Nullable
   @Override
   public djg calculate(doi.b $$0) {
      for (dot.c $$1 : this.a) {
         djg $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
