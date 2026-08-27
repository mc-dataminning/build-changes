import java.util.List;
import javax.annotation.Nullable;

public record dtn(List<dkn.c> a) implements dkn.c {
   @Nullable
   @Override
   public dfa calculate(dkc.b $$0) {
      for (dkn.c $$1 : this.a) {
         dfa $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
