import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bwu extends bwc<cnh> {
   private static final int d = 1200;
   final float c;

   public bwu(float $$0) {
      super(ImmutableMap.of(cdn.d, cdo.a), 1200);
      this.c = $$0;
   }

   protected boolean a(arh $$0, cnh $$1) {
      return $$1.dX().g().map($$0x -> $$0x == cpm.b || $$0x == cpm.c || $$0x == cpm.d).orElse(true);
   }

   protected boolean a(arh $$0, cnh $$1, long $$2) {
      return $$1.dX().a(cdn.d);
   }

   protected void b(arh $$0, cnh $$1, long $$2) {
      bwe.a($$1, $$1.dX().c(cdn.d).get().b(), this.c, 1);
   }

   protected void c(arh $$0, cnh $$1, long $$2) {
      Optional<jm> $$3 = $$1.dX().c(cdn.d);
      $$3.ifPresent($$1x -> {
         je $$2x = $$1x.b();
         arh $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            cfn $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agn.c($$0, $$2x);
         }
      });
      $$1.dX().b(cdn.d);
   }
}
