import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class chq extends cic<bxu> {
   @Override
   public Set<cgw<?>> a() {
      return ImmutableSet.of(cgw.y, cgw.z);
   }

   @Override
   protected void a(ars $$0, bxu $$1) {
      byu<?> $$2 = $$1.ec();
      bvi $$3 = $$1.eI();
      if ($$3 != null) {
         $$2.a(cgw.y, $$1.eI());
         bwt $$4 = $$3.d();
         if ($$4 instanceof bxu) {
            $$2.a(cgw.z, (bxu)$$4);
         }
      } else {
         $$2.b(cgw.y);
      }

      $$2.c(cgw.z).ifPresent($$2x -> {
         if (!$$2x.bJ() || $$2x.dV() != $$0) {
            $$2.b(cgw.z);
         }
      });
   }
}
