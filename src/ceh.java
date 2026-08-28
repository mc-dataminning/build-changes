import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class ceh extends cet<buk> {
   @Override
   public Set<cdn<?>> a() {
      return ImmutableSet.of(cdn.x, cdn.y);
   }

   @Override
   protected void a(arh $$0, buk $$1) {
      bvl<?> $$2 = $$1.dX();
      bsg $$3 = $$1.eC();
      if ($$3 != null) {
         $$2.a(cdn.x, $$1.eC());
         bto $$4 = $$3.d();
         if ($$4 instanceof buk) {
            $$2.a(cdn.y, (buk)$$4);
         }
      } else {
         $$2.b(cdn.x);
      }

      $$2.c(cdn.y).ifPresent($$2x -> {
         if (!$$2x.bI() || $$2x.dS() != $$0) {
            $$2.b(cdn.y);
         }
      });
   }
}
