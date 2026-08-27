import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bsy extends bsg<cjg> {
   private static final int d = 1200;
   final float c;

   public bsy(float $$0) {
      super(ImmutableMap.of(bzr.d, bzs.a), 1200);
      this.c = $$0;
   }

   protected boolean a(aps $$0, cjg $$1) {
      return $$1.dP().g().map($$0x -> $$0x == cli.b || $$0x == cli.c || $$0x == cli.d).orElse(true);
   }

   protected boolean a(aps $$0, cjg $$1, long $$2) {
      return $$1.dP().a(bzr.d);
   }

   protected void b(aps $$0, cjg $$1, long $$2) {
      bsi.a($$1, $$1.dP().c(bzr.d).get().b(), this.c, 1);
   }

   protected void c(aps $$0, cjg $$1, long $$2) {
      Optional<ik> $$3 = $$1.dP().c(bzr.d);
      $$3.ifPresent($$1x -> {
         ib $$2x = $$1x.b();
         aps $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            cbr $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            afi.c($$0, $$2x);
         }
      });
      $$1.dP().b(bzr.d);
   }
}
