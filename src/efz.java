import java.util.List;
import javax.annotation.Nullable;

public record efz(List<dwz.c> a) implements dwz.c {
   @Nullable
   @Override
   public drd calculate(dwo.b $$0) {
      for (dwz.c $$1 : this.a) {
         drd $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
