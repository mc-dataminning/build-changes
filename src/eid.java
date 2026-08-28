import java.util.List;
import javax.annotation.Nullable;

public record eid(List<dzc.c> a) implements dzc.c {
   @Nullable
   @Override
   public dtc calculate(dyr.b $$0) {
      for (dzc.c $$1 : this.a) {
         dtc $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
