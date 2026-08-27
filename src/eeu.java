import java.util.List;
import javax.annotation.Nullable;

public record eeu(List<dvu.c> a) implements dvu.c {
   @Nullable
   @Override
   public dpy calculate(dvj.b $$0) {
      for (dvu.c $$1 : this.a) {
         dpy $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
