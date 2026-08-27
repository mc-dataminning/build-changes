import java.util.List;
import javax.annotation.Nullable;

public record eig(List<dyy.c> a) implements dyy.c {
   @Nullable
   @Override
   public dtc calculate(dyn.b $$0) {
      for (dyy.c $$1 : this.a) {
         dtc $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
