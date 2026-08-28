import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvz extends bvh<cmk> {
   private static final int d = 1200;
   final float c;

   public bvz(float $$0) {
      super(ImmutableMap.of(ccs.d, cct.a), 1200);
      this.c = $$0;
   }

   protected boolean a(aqu $$0, cmk $$1) {
      return $$1.dU().g().map($$0x -> $$0x == com.b || $$0x == com.c || $$0x == com.d).orElse(true);
   }

   protected boolean a(aqu $$0, cmk $$1, long $$2) {
      return $$1.dU().a(ccs.d);
   }

   protected void b(aqu $$0, cmk $$1, long $$2) {
      bvj.a($$1, $$1.dU().c(ccs.d).get().b(), this.c, 1);
   }

   protected void c(aqu $$0, cmk $$1, long $$2) {
      Optional<jl> $$3 = $$1.dU().c(ccs.d);
      $$3.ifPresent($$1x -> {
         jd $$2x = $$1x.b();
         aqu $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            ces $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agf.c($$0, $$2x);
         }
      });
      $$1.dU().b(ccs.d);
   }
}
