import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bwa extends bvi<cmk> {
   private static final int d = 1200;
   final float c;

   public bwa(float $$0) {
      super(ImmutableMap.of(cct.d, ccu.a), 1200);
      this.c = $$0;
   }

   protected boolean a(arf $$0, cmk $$1) {
      return $$1.dS().g().map($$0x -> $$0x == com.b || $$0x == com.c || $$0x == com.d).orElse(true);
   }

   protected boolean a(arf $$0, cmk $$1, long $$2) {
      return $$1.dS().a(cct.d);
   }

   protected void b(arf $$0, cmk $$1, long $$2) {
      bvk.a($$1, $$1.dS().c(cct.d).get().b(), this.c, 1);
   }

   protected void c(arf $$0, cmk $$1, long $$2) {
      Optional<jh> $$3 = $$1.dS().c(cct.d);
      $$3.ifPresent($$1x -> {
         iz $$2x = $$1x.b();
         arf $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            cet $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agt.c($$0, $$2x);
         }
      });
      $$1.dS().b(cct.d);
   }
}
