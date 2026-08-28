import java.util.List;
import javax.annotation.Nullable;

public record egz(List<dxz.c> a) implements dxz.c {
   @Nullable
   @Override
   public dsd calculate(dxo.b $$0) {
      for (dxz.c $$1 : this.a) {
         dsd $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
