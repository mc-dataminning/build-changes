import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bnu extends bnc<cdm> {
   private static final int d = 1200;
   final float c;

   public bnu(float $$0) {
      super(ImmutableMap.of(bum.d, bun.a), 1200);
      this.c = $$0;
   }

   protected boolean a(ami $$0, cdm $$1) {
      return $$1.dP().g().map($$0x -> $$0x == cfk.b || $$0x == cfk.c || $$0x == cfk.d).orElse(true);
   }

   protected boolean a(ami $$0, cdm $$1, long $$2) {
      return $$1.dP().a(bum.d);
   }

   protected void b(ami $$0, cdm $$1, long $$2) {
      bne.a($$1, $$1.dP().c(bum.d).get().b(), this.c, 1);
   }

   protected void c(ami $$0, cdm $$1, long $$2) {
      Optional<ie> $$3 = $$1.dP().c(bum.d);
      $$3.ifPresent($$1x -> {
         hx $$2x = $$1x.b();
         ami $$3x = $$0.n().a($$1x.a());
         if ($$3x != null) {
            bwk $$4 = $$3x.x();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            aco.c($$0, $$2x);
         }
      });
      $$1.dP().b(bum.d);
   }
}
