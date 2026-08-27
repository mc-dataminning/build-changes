import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cal extends cax<bqo> {
   @Override
   public Set<bzr<?>> a() {
      return ImmutableSet.of(bzr.x, bzr.y);
   }

   @Override
   protected void a(aps $$0, bqo $$1) {
      brp<?> $$2 = $$1.dP();
      bot $$3 = $$1.ez();
      if ($$3 != null) {
         $$2.a(bzr.x, $$1.ez());
         bpv $$4 = $$3.d();
         if ($$4 instanceof bqo) {
            $$2.a(bzr.y, (bqo)$$4);
         }
      } else {
         $$2.b(bzr.x);
      }

      $$2.c(bzr.y).ifPresent($$2x -> {
         if (!$$2x.bA() || $$2x.dM() != $$0) {
            $$2.b(bzr.y);
         }
      });
   }
}
