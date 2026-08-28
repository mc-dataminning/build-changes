import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cfe extends cfq<bvg> {
   @Override
   public Set<cek<?>> a() {
      return ImmutableSet.of(cek.x, cek.y);
   }

   @Override
   protected void a(ard $$0, bvg $$1) {
      bwi<?> $$2 = $$1.eb();
      bta $$3 = $$1.eF();
      if ($$3 != null) {
         $$2.a(cek.x, $$1.eF());
         buk $$4 = $$3.d();
         if ($$4 instanceof bvg) {
            $$2.a(cek.y, (bvg)$$4);
         }
      } else {
         $$2.b(cek.x);
      }

      $$2.c(cek.y).ifPresent($$2x -> {
         if (!$$2x.bL() || $$2x.dV() != $$0) {
            $$2.b(cek.y);
         }
      });
   }
}
