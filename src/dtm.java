import java.util.List;
import javax.annotation.Nullable;

public record dtm(List<dkm.c> a) implements dkm.c {
   @Nullable
   @Override
   public dez calculate(dkb.b $$0) {
      for (dkm.c $$1 : this.a) {
         dez $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
