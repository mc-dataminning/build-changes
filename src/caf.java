import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class caf extends bzn<crl> {
   private static final int d = 1200;
   final float c;

   public caf(float $$0) {
      super(ImmutableMap.of(cgy.d, cgz.a), 1200);
      this.c = $$0;
   }

   protected boolean a(aru $$0, crl $$1) {
      return $$1.ec().g().map($$0x -> $$0x == ctt.b || $$0x == ctt.c || $$0x == ctt.d).orElse(true);
   }

   protected boolean a(aru $$0, crl $$1, long $$2) {
      return $$1.ec().a(cgy.d);
   }

   protected void b(aru $$0, crl $$1, long $$2) {
      bzp.a($$1, $$1.ec().c(cgy.d).get().b(), this.c, 1);
   }

   protected void c(aru $$0, crl $$1, long $$2) {
      Optional<jf> $$3 = $$1.ec().c(cgy.d);
      $$3.ifPresent($$1x -> {
         iw $$2x = $$1x.b();
         aru $$3x = $$0.p().a($$1x.a());
         if ($$3x != null) {
            ciy $$4 = $$3x.A();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agq.c($$0, $$2x);
         }
      });
      $$1.ec().b(cgy.d);
   }
}
