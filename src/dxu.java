import java.util.List;
import javax.annotation.Nullable;

public record dxu(List<dou.c> a) implements dou.c {
   @Nullable
   @Override
   public djh calculate(doj.b $$0) {
      for (dou.c $$1 : this.a) {
         djh $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
