import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bms extends bma<cck> {
   private static final int d = 1200;
   final float c;

   public bms(float $$0) {
      super(ImmutableMap.of(btk.d, btl.a), 1200);
      this.c = $$0;
   }

   protected boolean a(alq $$0, cck $$1) {
      return $$1.dN().g().map($$0x -> $$0x == cei.b || $$0x == cei.c || $$0x == cei.d).orElse(true);
   }

   protected boolean a(alq $$0, cck $$1, long $$2) {
      return $$1.dN().a(btk.d);
   }

   protected void b(alq $$0, cck $$1, long $$2) {
      bmc.a($$1, $$1.dN().c(btk.d).get().b(), this.c, 1);
   }

   protected void c(alq $$0, cck $$1, long $$2) {
      Optional<ia> $$3 = $$1.dN().c(btk.d);
      $$3.ifPresent($$1x -> {
         ht $$2x = $$1x.b();
         alq $$3x = $$0.n().a($$1x.a());
         if ($$3x != null) {
            bvi $$4 = $$3x.w();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            abz.c($$0, $$2x);
         }
      });
      $$1.dN().b(btk.d);
   }
}
