import java.util.List;
import javax.annotation.Nullable;

public record egy(List<dxy.c> a) implements dxy.c {
   @Nullable
   @Override
   public dsc calculate(dxn.b $$0) {
      for (dxy.c $$1 : this.a) {
         dsc $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
