import java.util.List;
import javax.annotation.Nullable;

public record ehe(List<dyd.c> a) implements dyd.c {
   @Nullable
   @Override
   public dsh calculate(dxs.b $$0) {
      for (dyd.c $$1 : this.a) {
         dsh $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
