import java.util.List;
import javax.annotation.Nullable;

public record egw(List<dxw.c> a) implements dxw.c {
   @Nullable
   @Override
   public dsa calculate(dxl.b $$0) {
      for (dxw.c $$1 : this.a) {
         dsa $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
