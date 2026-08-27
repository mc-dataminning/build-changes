import java.util.List;
import javax.annotation.Nullable;

public record efx(List<dwx.c> a) implements dwx.c {
   @Nullable
   @Override
   public drb calculate(dwm.b $$0) {
      for (dwx.c $$1 : this.a) {
         drb $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
