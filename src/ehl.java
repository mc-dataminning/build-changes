import java.util.List;
import javax.annotation.Nullable;

public record ehl(List<dyk.c> a) implements dyk.c {
   @Nullable
   @Override
   public dsl calculate(dxz.b $$0) {
      for (dyk.c $$1 : this.a) {
         dsl $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
