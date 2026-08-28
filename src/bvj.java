import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvj extends bur<clu> {
   private static final int d = 1200;
   final float c;

   public bvj(float $$0) {
      super(ImmutableMap.of(ccc.d, ccd.a), 1200);
      this.c = $$0;
   }

   protected boolean a(aqk $$0, clu $$1) {
      return $$1.dT().g().map($$0x -> $$0x == cnw.b || $$0x == cnw.c || $$0x == cnw.d).orElse(true);
   }

   protected boolean a(aqk $$0, clu $$1, long $$2) {
      return $$1.dT().a(ccc.d);
   }

   protected void b(aqk $$0, clu $$1, long $$2) {
      but.a($$1, $$1.dT().c(ccc.d).get().b(), this.c, 1);
   }

   protected void c(aqk $$0, clu $$1, long $$2) {
      Optional<ji> $$3 = $$1.dT().c(ccc.d);
      $$3.ifPresent($$1x -> {
         ja $$2x = $$1x.b();
         aqk $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            cec $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            afy.c($$0, $$2x);
         }
      });
      $$1.dT().b(ccc.d);
   }
}
