import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvy extends bvg<cmi> {
   private static final int d = 1200;
   final float c;

   public bvy(float $$0) {
      super(ImmutableMap.of(ccr.d, ccs.a), 1200);
      this.c = $$0;
   }

   protected boolean a(are $$0, cmi $$1) {
      return $$1.dS().g().map($$0x -> $$0x == cok.b || $$0x == cok.c || $$0x == cok.d).orElse(true);
   }

   protected boolean a(are $$0, cmi $$1, long $$2) {
      return $$1.dS().a(ccr.d);
   }

   protected void b(are $$0, cmi $$1, long $$2) {
      bvi.a($$1, $$1.dS().c(ccr.d).get().b(), this.c, 1);
   }

   protected void c(are $$0, cmi $$1, long $$2) {
      Optional<jh> $$3 = $$1.dS().c(ccr.d);
      $$3.ifPresent($$1x -> {
         iz $$2x = $$1x.b();
         are $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            cer $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            ags.c($$0, $$2x);
         }
      });
      $$1.dS().b(ccr.d);
   }
}
