import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bym extends bxu<cpe> {
   private static final int d = 1200;
   final float c;

   public bym(float $$0) {
      super(ImmutableMap.of(cff.d, cfg.a), 1200);
      this.c = $$0;
   }

   protected boolean a(ash $$0, cpe $$1) {
      return $$1.eb().g().map($$0x -> $$0x == crj.b || $$0x == crj.c || $$0x == crj.d).orElse(true);
   }

   protected boolean a(ash $$0, cpe $$1, long $$2) {
      return $$1.eb().a(cff.d);
   }

   protected void b(ash $$0, cpe $$1, long $$2) {
      bxw.a($$1, $$1.eb().c(cff.d).get().b(), this.c, 1);
   }

   protected void c(ash $$0, cpe $$1, long $$2) {
      Optional<jp> $$3 = $$1.eb().c(cff.d);
      $$3.ifPresent($$1x -> {
         jh $$2x = $$1x.b();
         ash $$3x = $$0.p().a($$1x.a());
         if ($$3x != null) {
            chf $$4 = $$3x.z();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            ahj.c($$0, $$2x);
         }
      });
      $$1.eb().b(cff.d);
   }
}
