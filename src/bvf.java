import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bvf extends bvq<bll> {
   @Override
   public Set<bum<?>> a() {
      return ImmutableSet.of(bum.x, bum.y);
   }

   @Override
   protected void a(ami $$0, bll $$1) {
      bml<?> $$2 = $$1.dP();
      bjt $$3 = $$1.ey();
      if ($$3 != null) {
         $$2.a(bum.x, $$1.ey());
         bkv $$4 = $$3.d();
         if ($$4 instanceof bll) {
            $$2.a(bum.y, (bll)$$4);
         }
      } else {
         $$2.b(bum.x);
      }

      $$2.c(bum.y).ifPresent($$2x -> {
         if (!$$2x.bx() || $$2x.dN() != $$0) {
            $$2.b(bum.y);
         }
      });
   }
}
