import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class buy extends bug<cll> {
   private static final int d = 1200;
   final float c;

   public buy(float $$0) {
      super(ImmutableMap.of(cbr.d, cbs.a), 1200);
      this.c = $$0;
   }

   protected boolean a(aqt $$0, cll $$1) {
      return $$1.dZ().g().map($$0x -> $$0x == cnq.b || $$0x == cnq.c || $$0x == cnq.d).orElse(true);
   }

   protected boolean a(aqt $$0, cll $$1, long $$2) {
      return $$1.dZ().a(cbr.d);
   }

   protected void b(aqt $$0, cll $$1, long $$2) {
      bui.a($$1, $$1.dZ().c(cbr.d).get().b(), this.c, 1);
   }

   protected void c(aqt $$0, cll $$1, long $$2) {
      Optional<iz> $$3 = $$1.dZ().c(cbr.d);
      $$3.ifPresent($$1x -> {
         ir $$2x = $$1x.b();
         aqt $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            cdr $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agi.c($$0, $$2x);
         }
      });
      $$1.dZ().b(cbr.d);
   }
}
