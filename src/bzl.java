import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzl extends byt<cqk> {
   private static final int d = 1200;
   final float c;

   public bzl(float $$0) {
      super(ImmutableMap.of(cge.d, cgf.a), 1200);
      this.c = $$0;
   }

   protected boolean a(arq $$0, cqk $$1) {
      return $$1.eb().g().map($$0x -> $$0x == csr.b || $$0x == csr.c || $$0x == csr.d).orElse(true);
   }

   protected boolean a(arq $$0, cqk $$1, long $$2) {
      return $$1.eb().a(cge.d);
   }

   protected void b(arq $$0, cqk $$1, long $$2) {
      byv.a($$1, $$1.eb().c(cge.d).get().b(), this.c, 1);
   }

   protected void c(arq $$0, cqk $$1, long $$2) {
      Optional<jd> $$3 = $$1.eb().c(cge.d);
      $$3.ifPresent($$1x -> {
         iu $$2x = $$1x.b();
         arq $$3x = $$0.p().a($$1x.a());
         if ($$3x != null) {
            cie $$4 = $$3x.A();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agm.c($$0, $$2x);
         }
      });
      $$1.eb().b(cge.d);
   }
}
