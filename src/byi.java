import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byi extends bxq<cpa> {
   private static final int d = 1200;
   final float c;

   public byi(float $$0) {
      super(ImmutableMap.of(cfb.d, cfc.a), 1200);
      this.c = $$0;
   }

   protected boolean a(arx $$0, cpa $$1) {
      return $$1.ec().g().map($$0x -> $$0x == crf.b || $$0x == crf.c || $$0x == crf.d).orElse(true);
   }

   protected boolean a(arx $$0, cpa $$1, long $$2) {
      return $$1.ec().a(cfb.d);
   }

   protected void b(arx $$0, cpa $$1, long $$2) {
      bxs.a($$1, $$1.ec().c(cfb.d).get().b(), this.c, 1);
   }

   protected void c(arx $$0, cpa $$1, long $$2) {
      Optional<jp> $$3 = $$1.ec().c(cfb.d);
      $$3.ifPresent($$1x -> {
         jh $$2x = $$1x.b();
         arx $$3x = $$0.p().a($$1x.a());
         if ($$3x != null) {
            chb $$4 = $$3x.A();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agy.c($$0, $$2x);
         }
      });
      $$1.ec().b(cfb.d);
   }
}
