import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class boo extends bnw<ceo> {
   private static final int d = 1200;
   final float c;

   public boo(float $$0) {
      super(ImmutableMap.of(bvh.d, bvi.a), 1200);
      this.c = $$0;
   }

   protected boolean a(amz $$0, ceo $$1) {
      return $$1.dO().g().map($$0x -> $$0x == cgn.b || $$0x == cgn.c || $$0x == cgn.d).orElse(true);
   }

   protected boolean a(amz $$0, ceo $$1, long $$2) {
      return $$1.dO().a(bvh.d);
   }

   protected void b(amz $$0, ceo $$1, long $$2) {
      bny.a($$1, $$1.dO().c(bvh.d).get().b(), this.c, 1);
   }

   protected void c(amz $$0, ceo $$1, long $$2) {
      Optional<ig> $$3 = $$1.dO().c(bvh.d);
      $$3.ifPresent($$1x -> {
         hx $$2x = $$1x.b();
         amz $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            bxg $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            adf.c($$0, $$2x);
         }
      });
      $$1.dO().b(bvh.d);
   }
}
