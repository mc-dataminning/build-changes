import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzn extends byv<cqo> {
   private static final int d = 1200;
   final float c;

   public bzn(float $$0) {
      super(ImmutableMap.of(cgg.d, cgh.a), 1200);
      this.c = $$0;
   }

   protected boolean a(arq $$0, cqo $$1) {
      return $$1.ec().g().map($$0x -> $$0x == csw.b || $$0x == csw.c || $$0x == csw.d).orElse(true);
   }

   protected boolean a(arq $$0, cqo $$1, long $$2) {
      return $$1.ec().a(cgg.d);
   }

   protected void b(arq $$0, cqo $$1, long $$2) {
      byx.a($$1, $$1.ec().c(cgg.d).get().b(), this.c, 1);
   }

   protected void c(arq $$0, cqo $$1, long $$2) {
      Optional<jd> $$3 = $$1.ec().c(cgg.d);
      $$3.ifPresent($$1x -> {
         iu $$2x = $$1x.b();
         arq $$3x = $$0.p().a($$1x.a());
         if ($$3x != null) {
            cig $$4 = $$3x.A();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agm.c($$0, $$2x);
         }
      });
      $$1.ec().b(cgg.d);
   }
}
