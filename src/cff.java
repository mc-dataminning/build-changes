import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cff extends cfq<bvg> {
   @Override
   public Set<cek<?>> a() {
      return ImmutableSet.of(cek.X);
   }

   @Override
   protected void a(arc $$0, bvg $$1) {
      if ($$1.bj()) {
         $$1.ec().a(cek.X, baf.a);
      } else {
         $$1.ec().b(cek.X);
      }
   }
}
