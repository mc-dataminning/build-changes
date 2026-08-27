import java.util.List;
import javax.annotation.Nullable;

public record ebs(List<dss.c> a) implements dss.c {
   @Nullable
   @Override
   public dnb calculate(dsh.b $$0) {
      for (dss.c $$1 : this.a) {
         dnb $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
