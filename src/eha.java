import java.util.List;
import javax.annotation.Nullable;

public record eha(List<dya.c> a) implements dya.c {
   @Nullable
   @Override
   public dse calculate(dxp.b $$0) {
      for (dya.c $$1 : this.a) {
         dse $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
