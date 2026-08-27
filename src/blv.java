import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class blv extends bld<cbn> {
   private static final int d = 1200;
   final float c;

   public blv(float $$0) {
      super(ImmutableMap.of(bsn.d, bso.a), 1200);
      this.c = $$0;
   }

   protected boolean a(akt $$0, cbn $$1) {
      return $$1.dN().g().map($$0x -> $$0x == cdl.b || $$0x == cdl.c || $$0x == cdl.d).orElse(true);
   }

   protected boolean a(akt $$0, cbn $$1, long $$2) {
      return $$1.dN().a(bsn.d);
   }

   protected void b(akt $$0, cbn $$1, long $$2) {
      blf.a($$1, $$1.dN().c(bsn.d).get().b(), this.c, 1);
   }

   protected void c(akt $$0, cbn $$1, long $$2) {
      Optional<hd> $$3 = $$1.dN().c(bsn.d);
      $$3.ifPresent($$1x -> {
         gw $$2x = $$1x.b();
         akt $$3x = $$0.n().a($$1x.a());
         if ($$3x != null) {
            bul $$4 = $$3x.w();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            abc.c($$0, $$2x);
         }
      });
      $$1.dN().b(bsn.d);
   }
}
