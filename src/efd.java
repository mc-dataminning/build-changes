import java.util.List;
import javax.annotation.Nullable;

public record efd(List<dwd.c> a) implements dwd.c {
   @Nullable
   @Override
   public dqh calculate(dvs.b $$0) {
      for (dwd.c $$1 : this.a) {
         dqh $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
