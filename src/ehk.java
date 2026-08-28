import java.util.List;
import javax.annotation.Nullable;

public record ehk(List<dyj.c> a) implements dyj.c {
   @Nullable
   @Override
   public dsk calculate(dxy.b $$0) {
      for (dyj.c $$1 : this.a) {
         dsk $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
