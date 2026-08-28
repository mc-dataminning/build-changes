import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byr extends bxz<cpj> {
   private static final int d = 1200;
   final float c;

   public byr(float $$0) {
      super(ImmutableMap.of(cfk.d, cfl.a), 1200);
      this.c = $$0;
   }

   protected boolean a(ash $$0, cpj $$1) {
      return $$1.ec().g().map($$0x -> $$0x == cro.b || $$0x == cro.c || $$0x == cro.d).orElse(true);
   }

   protected boolean a(ash $$0, cpj $$1, long $$2) {
      return $$1.ec().a(cfk.d);
   }

   protected void b(ash $$0, cpj $$1, long $$2) {
      byb.a($$1, $$1.ec().c(cfk.d).get().b(), this.c, 1);
   }

   protected void c(ash $$0, cpj $$1, long $$2) {
      Optional<jp> $$3 = $$1.ec().c(cfk.d);
      $$3.ifPresent($$1x -> {
         jh $$2x = $$1x.b();
         ash $$3x = $$0.p().a($$1x.a());
         if ($$3x != null) {
            chk $$4 = $$3x.z();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            ahj.c($$0, $$2x);
         }
      });
      $$1.ec().b(cfk.d);
   }
}
