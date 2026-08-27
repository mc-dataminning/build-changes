import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bnp extends bmx<cdh> {
   private static final int d = 1200;
   final float c;

   public bnp(float $$0) {
      super(ImmutableMap.of(buh.d, bui.a), 1200);
      this.c = $$0;
   }

   protected boolean a(ame $$0, cdh $$1) {
      return $$1.dP().g().map($$0x -> $$0x == cff.b || $$0x == cff.c || $$0x == cff.d).orElse(true);
   }

   protected boolean a(ame $$0, cdh $$1, long $$2) {
      return $$1.dP().a(buh.d);
   }

   protected void b(ame $$0, cdh $$1, long $$2) {
      bmz.a($$1, $$1.dP().c(buh.d).get().b(), this.c, 1);
   }

   protected void c(ame $$0, cdh $$1, long $$2) {
      Optional<ia> $$3 = $$1.dP().c(buh.d);
      $$3.ifPresent($$1x -> {
         ht $$2x = $$1x.b();
         ame $$3x = $$0.n().a($$1x.a());
         if ($$3x != null) {
            bwf $$4 = $$3x.x();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            ack.c($$0, $$2x);
         }
      });
      $$1.dP().b(buh.d);
   }
}
