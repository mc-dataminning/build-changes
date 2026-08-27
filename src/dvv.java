import java.util.List;
import javax.annotation.Nullable;

public record dvv(List<dmv.c> a) implements dmv.c {
   @Nullable
   @Override
   public dhi calculate(dmk.b $$0) {
      for (dmv.c $$1 : this.a) {
         dhi $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
