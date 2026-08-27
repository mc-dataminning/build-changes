import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bwg extends bwr<bmk> {
   @Override
   public Set<bvm<?>> a() {
      return ImmutableSet.of(bvm.x, bvm.y);
   }

   @Override
   protected void a(and $$0, bmk $$1) {
      bnk<?> $$2 = $$1.dO();
      bks $$3 = $$1.ex();
      if ($$3 != null) {
         $$2.a(bvm.x, $$1.ex());
         blu $$4 = $$3.d();
         if ($$4 instanceof bmk) {
            $$2.a(bvm.y, (bmk)$$4);
         }
      } else {
         $$2.b(bvm.x);
      }

      $$2.c(bvm.y).ifPresent($$2x -> {
         if (!$$2x.bx() || $$2x.dM() != $$0) {
            $$2.b(bvm.y);
         }
      });
   }
}
