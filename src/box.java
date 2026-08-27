import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class box extends bof<cfd> {
   private static final int d = 1200;
   final float c;

   public box(float $$0) {
      super(ImmutableMap.of(bvq.d, bvr.a), 1200);
      this.c = $$0;
   }

   protected boolean a(ane $$0, cfd $$1) {
      return $$1.dN().g().map($$0x -> $$0x == chc.b || $$0x == chc.c || $$0x == chc.d).orElse(true);
   }

   protected boolean a(ane $$0, cfd $$1, long $$2) {
      return $$1.dN().a(bvq.d);
   }

   protected void b(ane $$0, cfd $$1, long $$2) {
      boh.a($$1, $$1.dN().c(bvq.d).get().b(), this.c, 1);
   }

   protected void c(ane $$0, cfd $$1, long $$2) {
      Optional<ig> $$3 = $$1.dN().c(bvq.d);
      $$3.ifPresent($$1x -> {
         hx $$2x = $$1x.b();
         ane $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            bxq $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            adj.c($$0, $$2x);
         }
      });
      $$1.dN().b(bvq.d);
   }
}
