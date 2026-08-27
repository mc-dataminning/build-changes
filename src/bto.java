import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bto extends bsw<cjy> {
   private static final int d = 1200;
   final float c;

   public bto(float $$0) {
      super(ImmutableMap.of(cah.d, cai.a), 1200);
      this.c = $$0;
   }

   protected boolean a(aqe $$0, cjy $$1) {
      return $$1.dQ().g().map($$0x -> $$0x == cma.b || $$0x == cma.c || $$0x == cma.d).orElse(true);
   }

   protected boolean a(aqe $$0, cjy $$1, long $$2) {
      return $$1.dQ().a(cah.d);
   }

   protected void b(aqe $$0, cjy $$1, long $$2) {
      bsy.a($$1, $$1.dQ().c(cah.d).get().b(), this.c, 1);
   }

   protected void c(aqe $$0, cjy $$1, long $$2) {
      Optional<iu> $$3 = $$1.dQ().c(cah.d);
      $$3.ifPresent($$1x -> {
         im $$2x = $$1x.b();
         aqe $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            cch $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            afu.c($$0, $$2x);
         }
      });
      $$1.dQ().b(cah.d);
   }
}
