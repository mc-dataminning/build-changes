import java.util.List;
import javax.annotation.Nullable;

public record dty(List<dky.c> a) implements dky.c {
   @Nullable
   @Override
   public dfl calculate(dkn.b $$0) {
      for (dky.c $$1 : this.a) {
         dfl $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
