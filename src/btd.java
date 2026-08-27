import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class btd extends btn<bji> {
   @Override
   public Set<bsj<?>> a() {
      return ImmutableSet.of(bsj.W);
   }

   @Override
   protected void a(aks $$0, bji $$1) {
      if ($$1.aX()) {
         $$1.dN().a(bsj.W, asz.a);
      } else {
         $$1.dN().b(bsj.W);
      }
   }
}
