import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class blp extends bkx<cbh> {
   private static final int d = 1200;
   final float c;

   public blp(float $$0) {
      super(ImmutableMap.of(bsh.d, bsi.a), 1200);
      this.c = $$0;
   }

   protected boolean a(akq $$0, cbh $$1) {
      return $$1.dN().g().map($$0x -> $$0x == cdf.b || $$0x == cdf.c || $$0x == cdf.d).orElse(true);
   }

   protected boolean a(akq $$0, cbh $$1, long $$2) {
      return $$1.dN().a(bsh.d);
   }

   protected void b(akq $$0, cbh $$1, long $$2) {
      bkz.a($$1, $$1.dN().c(bsh.d).get().b(), this.c, 1);
   }

   protected void c(akq $$0, cbh $$1, long $$2) {
      Optional<hd> $$3 = $$1.dN().c(bsh.d);
      $$3.ifPresent($$1x -> {
         gw $$2x = $$1x.b();
         akq $$3x = $$0.n().a($$1x.a());
         if ($$3x != null) {
            buf $$4 = $$3x.w();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            abb.c($$0, $$2x);
         }
      });
      $$1.dN().b(bsh.d);
   }
}
