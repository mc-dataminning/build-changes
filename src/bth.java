import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bth extends btr<bjm> {
   @Override
   public Set<bsn<?>> a() {
      return ImmutableSet.of(bsn.W);
   }

   @Override
   protected void a(akt $$0, bjm $$1) {
      if ($$1.aX()) {
         $$1.dN().a(bsn.W, atc.a);
      } else {
         $$1.dN().b(bsn.W);
      }
   }
}
