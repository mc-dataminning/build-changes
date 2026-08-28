import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byq extends bxy<cpi> {
   private static final int d = 1200;
   final float c;

   public byq(float $$0) {
      super(ImmutableMap.of(cfj.d, cfk.a), 1200);
      this.c = $$0;
   }

   protected boolean a(ash $$0, cpi $$1) {
      return $$1.ec().g().map($$0x -> $$0x == crn.b || $$0x == crn.c || $$0x == crn.d).orElse(true);
   }

   protected boolean a(ash $$0, cpi $$1, long $$2) {
      return $$1.ec().a(cfj.d);
   }

   protected void b(ash $$0, cpi $$1, long $$2) {
      bya.a($$1, $$1.ec().c(cfj.d).get().b(), this.c, 1);
   }

   protected void c(ash $$0, cpi $$1, long $$2) {
      Optional<jp> $$3 = $$1.ec().c(cfj.d);
      $$3.ifPresent($$1x -> {
         jh $$2x = $$1x.b();
         ash $$3x = $$0.p().a($$1x.a());
         if ($$3x != null) {
            chj $$4 = $$3x.z();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            ahj.c($$0, $$2x);
         }
      });
      $$1.ec().b(cfj.d);
   }
}
