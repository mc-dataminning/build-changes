import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cht extends cie<bxw> {
   @Override
   public Set<cgy<?>> a() {
      return ImmutableSet.of(cgy.Y);
   }

   @Override
   protected void a(aru $$0, bxw $$1) {
      if ($$1.bi()) {
         $$1.ec().a(cgy.Y, bay.a);
      } else {
         $$1.ec().b(cgy.Y);
      }
   }
}
