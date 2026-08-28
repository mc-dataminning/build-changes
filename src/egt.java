import java.util.List;
import javax.annotation.Nullable;

public record egt(List<dxt.c> a) implements dxt.c {
   @Nullable
   @Override
   public drx calculate(dxi.b $$0) {
      for (dxt.c $$1 : this.a) {
         drx $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
