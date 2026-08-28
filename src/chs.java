import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class chs extends cie<bxw> {
   @Override
   public Set<cgy<?>> a() {
      return ImmutableSet.of(cgy.y, cgy.z);
   }

   @Override
   protected void a(aru $$0, bxw $$1) {
      byw<?> $$2 = $$1.ec();
      bvk $$3 = $$1.eI();
      if ($$3 != null) {
         $$2.a(cgy.y, $$1.eI());
         bwv $$4 = $$3.d();
         if ($$4 instanceof bxw) {
            $$2.a(cgy.z, (bxw)$$4);
         }
      } else {
         $$2.b(cgy.y);
      }

      $$2.c(cgy.z).ifPresent($$2x -> {
         if (!$$2x.bJ() || $$2x.dV() != $$0) {
            $$2.b(cgy.z);
         }
      });
   }
}
