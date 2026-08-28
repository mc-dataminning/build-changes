import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvm extends buu<clx> {
   private static final int d = 1200;
   final float c;

   public bvm(float $$0) {
      super(ImmutableMap.of(ccf.d, ccg.a), 1200);
      this.c = $$0;
   }

   protected boolean a(aqm $$0, clx $$1) {
      return $$1.dU().g().map($$0x -> $$0x == cnz.b || $$0x == cnz.c || $$0x == cnz.d).orElse(true);
   }

   protected boolean a(aqm $$0, clx $$1, long $$2) {
      return $$1.dU().a(ccf.d);
   }

   protected void b(aqm $$0, clx $$1, long $$2) {
      buw.a($$1, $$1.dU().c(ccf.d).get().b(), this.c, 1);
   }

   protected void c(aqm $$0, clx $$1, long $$2) {
      Optional<ji> $$3 = $$1.dU().c(ccf.d);
      $$3.ifPresent($$1x -> {
         ja $$2x = $$1x.b();
         aqm $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            cef $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            afy.c($$0, $$2x);
         }
      });
      $$1.dU().b(ccf.d);
   }
}
