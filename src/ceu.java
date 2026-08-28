import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class ceu extends cff<buv> {
   @Override
   public Set<cdz<?>> a() {
      return ImmutableSet.of(cdz.X);
   }

   @Override
   protected void a(arm $$0, buv $$1) {
      if ($$1.bk()) {
         $$1.ed().a(cdz.X, bao.a);
      } else {
         $$1.ed().b(cdz.X);
      }
   }
}
