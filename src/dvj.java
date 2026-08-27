import java.util.List;
import javax.annotation.Nullable;

public record dvj(List<dmj.c> a) implements dmj.c {
   @Nullable
   @Override
   public dgw calculate(dly.b $$0) {
      for (dmj.c $$1 : this.a) {
         dgw $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
