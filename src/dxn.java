import java.util.List;
import javax.annotation.Nullable;

public record dxn(List<don.c> a) implements don.c {
   @Nullable
   @Override
   public dja calculate(doc.b $$0) {
      for (don.c $$1 : this.a) {
         dja $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
