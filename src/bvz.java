import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvz extends bvh<cmj> {
   private static final int d = 1200;
   final float c;

   public bvz(float $$0) {
      super(ImmutableMap.of(ccs.d, cct.a), 1200);
      this.c = $$0;
   }

   protected boolean a(are $$0, cmj $$1) {
      return $$1.dS().g().map($$0x -> $$0x == col.b || $$0x == col.c || $$0x == col.d).orElse(true);
   }

   protected boolean a(are $$0, cmj $$1, long $$2) {
      return $$1.dS().a(ccs.d);
   }

   protected void b(are $$0, cmj $$1, long $$2) {
      bvj.a($$1, $$1.dS().c(ccs.d).get().b(), this.c, 1);
   }

   protected void c(are $$0, cmj $$1, long $$2) {
      Optional<jh> $$3 = $$1.dS().c(ccs.d);
      $$3.ifPresent($$1x -> {
         iz $$2x = $$1x.b();
         are $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            ces $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            ags.c($$0, $$2x);
         }
      });
      $$1.dS().b(ccs.d);
   }
}
