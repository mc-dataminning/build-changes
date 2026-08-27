import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class buk extends bts<cku> {
   private static final int d = 1200;
   final float c;

   public buk(float $$0) {
      super(ImmutableMap.of(cbd.d, cbe.a), 1200);
      this.c = $$0;
   }

   protected boolean a(aqh $$0, cku $$1) {
      return $$1.dQ().g().map($$0x -> $$0x == cmw.b || $$0x == cmw.c || $$0x == cmw.d).orElse(true);
   }

   protected boolean a(aqh $$0, cku $$1, long $$2) {
      return $$1.dQ().a(cbd.d);
   }

   protected void b(aqh $$0, cku $$1, long $$2) {
      btu.a($$1, $$1.dQ().c(cbd.d).get().b(), this.c, 1);
   }

   protected void c(aqh $$0, cku $$1, long $$2) {
      Optional<iv> $$3 = $$1.dQ().c(cbd.d);
      $$3.ifPresent($$1x -> {
         in $$2x = $$1x.b();
         aqh $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            cdd $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            afw.c($$0, $$2x);
         }
      });
      $$1.dQ().b(cbd.d);
   }
}
