import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxs extends bxa<cof> {
   private static final int d = 1200;
   final float c;

   public bxs(float $$0) {
      super(ImmutableMap.of(cel.d, cem.a), 1200);
      this.c = $$0;
   }

   protected boolean a(arp $$0, cof $$1) {
      return $$1.eb().g().map($$0x -> $$0x == cql.b || $$0x == cql.c || $$0x == cql.d).orElse(true);
   }

   protected boolean a(arp $$0, cof $$1, long $$2) {
      return $$1.eb().a(cel.d);
   }

   protected void b(arp $$0, cof $$1, long $$2) {
      bxc.a($$1, $$1.eb().c(cel.d).get().b(), this.c, 1);
   }

   protected void c(arp $$0, cof $$1, long $$2) {
      Optional<jp> $$3 = $$1.eb().c(cel.d);
      $$3.ifPresent($$1x -> {
         jh $$2x = $$1x.b();
         arp $$3x = $$0.p().a($$1x.a());
         if ($$3x != null) {
            cgl $$4 = $$3x.z();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agt.c($$0, $$2x);
         }
      });
      $$1.eb().b(cel.d);
   }
}
