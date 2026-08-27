import java.util.List;
import javax.annotation.Nullable;

public record eee(List<dve.c> a) implements dve.c {
   @Nullable
   @Override
   public dpi calculate(dut.b $$0) {
      for (dve.c $$1 : this.a) {
         dpi $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
