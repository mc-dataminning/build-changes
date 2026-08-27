import java.util.List;
import javax.annotation.Nullable;

public record ebq(List<dsq.c> a) implements dsq.c {
   @Nullable
   @Override
   public dmz calculate(dsf.b $$0) {
      for (dsq.c $$1 : this.a) {
         dmz $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
