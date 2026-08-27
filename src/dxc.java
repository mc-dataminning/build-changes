import java.util.List;
import javax.annotation.Nullable;

public record dxc(List<doc.c> a) implements doc.c {
   @Nullable
   @Override
   public dip calculate(dnr.b $$0) {
      for (doc.c $$1 : this.a) {
         dip $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
