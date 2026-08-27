import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bta extends btl<bjg> {
   @Override
   public Set<bsh<?>> a() {
      return ImmutableSet.of(bsh.x, bsh.y);
   }

   @Override
   protected void a(akr $$0, bjg $$1) {
      bkg<?> $$2 = $$1.dN();
      bho $$3 = $$1.ew();
      if ($$3 != null) {
         $$2.a(bsh.x, $$1.ew());
         biq $$4 = $$3.d();
         if ($$4 instanceof bjg) {
            $$2.a(bsh.y, (bjg)$$4);
         }
      } else {
         $$2.b(bsh.x);
      }

      $$2.c(bsh.y).ifPresent($$2x -> {
         if (!$$2x.bv() || $$2x.dL() != $$0) {
            $$2.b(bsh.y);
         }
      });
   }
}
