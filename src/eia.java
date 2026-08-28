import java.util.List;
import javax.annotation.Nullable;

public record eia(List<dyz.c> a) implements dyz.c {
   @Nullable
   @Override
   public dta calculate(dyo.b $$0) {
      for (dyz.c $$1 : this.a) {
         dta $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
