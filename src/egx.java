import java.util.List;
import javax.annotation.Nullable;

public record egx(List<dxx.c> a) implements dxx.c {
   @Nullable
   @Override
   public dsb calculate(dxm.b $$0) {
      for (dxx.c $$1 : this.a) {
         dsb $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
