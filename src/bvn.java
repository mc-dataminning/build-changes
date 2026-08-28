import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvn extends buv<cly> {
   private static final int d = 1200;
   final float c;

   public bvn(float $$0) {
      super(ImmutableMap.of(ccg.d, cch.a), 1200);
      this.c = $$0;
   }

   protected boolean a(aqm $$0, cly $$1) {
      return $$1.dV().g().map($$0x -> $$0x == coa.b || $$0x == coa.c || $$0x == coa.d).orElse(true);
   }

   protected boolean a(aqm $$0, cly $$1, long $$2) {
      return $$1.dV().a(ccg.d);
   }

   protected void b(aqm $$0, cly $$1, long $$2) {
      bux.a($$1, $$1.dV().c(ccg.d).get().b(), this.c, 1);
   }

   protected void c(aqm $$0, cly $$1, long $$2) {
      Optional<ji> $$3 = $$1.dV().c(ccg.d);
      $$3.ifPresent($$1x -> {
         ja $$2x = $$1x.b();
         aqm $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            ceg $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            afy.c($$0, $$2x);
         }
      });
      $$1.dV().b(ccg.d);
   }
}
