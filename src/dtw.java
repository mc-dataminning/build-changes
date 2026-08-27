import java.util.List;
import javax.annotation.Nullable;

public record dtw(List<dkw.c> a) implements dkw.c {
   @Nullable
   @Override
   public dfj calculate(dkl.b $$0) {
      for (dkw.c $$1 : this.a) {
         dfj $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
