import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxs extends bxa<coi> {
   private static final int d = 1200;
   final float c;

   public bxs(float $$0) {
      super(ImmutableMap.of(cel.d, cem.a), 1200);
      this.c = $$0;
   }

   protected boolean a(ard $$0, coi $$1) {
      return $$1.eb().g().map($$0x -> $$0x == cqo.b || $$0x == cqo.c || $$0x == cqo.d).orElse(true);
   }

   protected boolean a(ard $$0, coi $$1, long $$2) {
      return $$1.eb().a(cel.d);
   }

   protected void b(ard $$0, coi $$1, long $$2) {
      bxc.a($$1, $$1.eb().c(cel.d).get().b(), this.c, 1);
   }

   protected void c(ard $$0, coi $$1, long $$2) {
      Optional<jq> $$3 = $$1.eb().c(cel.d);
      $$3.ifPresent($$1x -> {
         ji $$2x = $$1x.b();
         ard $$3x = $$0.p().a($$1x.a());
         if ($$3x != null) {
            cgl $$4 = $$3x.A();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agd.c($$0, $$2x);
         }
      });
      $$1.eb().b(cel.d);
   }
}
