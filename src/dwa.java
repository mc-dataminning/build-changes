import java.util.List;
import javax.annotation.Nullable;

public record dwa(List<dna.c> a) implements dna.c {
   @Nullable
   @Override
   public dhn calculate(dmp.b $$0) {
      for (dna.c $$1 : this.a) {
         dhn $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
