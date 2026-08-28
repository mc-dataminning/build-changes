import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzs extends bza<cqv> {
   private static final int d = 1200;
   final float c;

   public bzs(float $$0) {
      super(ImmutableMap.of(cgl.d, cgm.a), 1200);
      this.c = $$0;
   }

   protected boolean a(arq $$0, cqv $$1) {
      return $$1.eb().g().map($$0x -> $$0x == ctd.b || $$0x == ctd.c || $$0x == ctd.d).orElse(true);
   }

   protected boolean a(arq $$0, cqv $$1, long $$2) {
      return $$1.eb().a(cgl.d);
   }

   protected void b(arq $$0, cqv $$1, long $$2) {
      bzc.a($$1, $$1.eb().c(cgl.d).get().b(), this.c, 1);
   }

   protected void c(arq $$0, cqv $$1, long $$2) {
      Optional<je> $$3 = $$1.eb().c(cgl.d);
      $$3.ifPresent($$1x -> {
         iv $$2x = $$1x.b();
         arq $$3x = $$0.p().a($$1x.a());
         if ($$3x != null) {
            cil $$4 = $$3x.A();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agm.c($$0, $$2x);
         }
      });
      $$1.eb().b(cgl.d);
   }
}
