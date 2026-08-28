import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cad extends bzl<crj> {
   private static final int d = 1200;
   final float c;

   public cad(float $$0) {
      super(ImmutableMap.of(cgw.d, cgx.a), 1200);
      this.c = $$0;
   }

   protected boolean a(ars $$0, crj $$1) {
      return $$1.ec().g().map($$0x -> $$0x == ctr.b || $$0x == ctr.c || $$0x == ctr.d).orElse(true);
   }

   protected boolean a(ars $$0, crj $$1, long $$2) {
      return $$1.ec().a(cgw.d);
   }

   protected void b(ars $$0, crj $$1, long $$2) {
      bzn.a($$1, $$1.ec().c(cgw.d).get().b(), this.c, 1);
   }

   protected void c(ars $$0, crj $$1, long $$2) {
      Optional<je> $$3 = $$1.ec().c(cgw.d);
      $$3.ifPresent($$1x -> {
         iv $$2x = $$1x.b();
         ars $$3x = $$0.p().a($$1x.a());
         if ($$3x != null) {
            ciw $$4 = $$3x.A();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            ago.c($$0, $$2x);
         }
      });
      $$1.ec().b(cgw.d);
   }
}
