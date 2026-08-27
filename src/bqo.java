import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bqo extends bpw<cgu> {
   private static final int d = 1200;
   final float c;

   public bqo(float $$0) {
      super(ImmutableMap.of(bxh.d, bxi.a), 1200);
      this.c = $$0;
   }

   protected boolean a(aov $$0, cgu $$1) {
      return $$1.dO().g().map($$0x -> $$0x == ciu.b || $$0x == ciu.c || $$0x == ciu.d).orElse(true);
   }

   protected boolean a(aov $$0, cgu $$1, long $$2) {
      return $$1.dO().a(bxh.d);
   }

   protected void b(aov $$0, cgu $$1, long $$2) {
      bpy.a($$1, $$1.dO().c(bxh.d).get().b(), this.c, 1);
   }

   protected void c(aov $$0, cgu $$1, long $$2) {
      Optional<ii> $$3 = $$1.dO().c(bxh.d);
      $$3.ifPresent($$1x -> {
         hz $$2x = $$1x.b();
         aov $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            bzh $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            aep.c($$0, $$2x);
         }
      });
      $$1.dO().b(bxh.d);
   }
}
