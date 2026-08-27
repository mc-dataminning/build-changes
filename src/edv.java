import java.util.List;
import javax.annotation.Nullable;

public record edv(List<duv.c> a) implements duv.c {
   @Nullable
   @Override
   public doz calculate(duk.b $$0) {
      for (duv.c $$1 : this.a) {
         doz $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
