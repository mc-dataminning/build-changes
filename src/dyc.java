import java.util.List;
import javax.annotation.Nullable;

public record dyc(List<dpc.c> a) implements dpc.c {
   @Nullable
   @Override
   public djp calculate(dor.b $$0) {
      for (dpc.c $$1 : this.a) {
         djp $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
