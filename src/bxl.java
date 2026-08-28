import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxl extends bwt<cny> {
   private static final int d = 1200;
   final float c;

   public bxl(float $$0) {
      super(ImmutableMap.of(cee.d, cef.a), 1200);
      this.c = $$0;
   }

   protected boolean a(arn $$0, cny $$1) {
      return $$1.ed().g().map($$0x -> $$0x == cqe.b || $$0x == cqe.c || $$0x == cqe.d).orElse(true);
   }

   protected boolean a(arn $$0, cny $$1, long $$2) {
      return $$1.ed().a(cee.d);
   }

   protected void b(arn $$0, cny $$1, long $$2) {
      bwv.a($$1, $$1.ed().c(cee.d).get().b(), this.c, 1);
   }

   protected void c(arn $$0, cny $$1, long $$2) {
      Optional<jp> $$3 = $$1.ed().c(cee.d);
      $$3.ifPresent($$1x -> {
         jh $$2x = $$1x.b();
         arn $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            cge $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            ags.c($$0, $$2x);
         }
      });
      $$1.ed().b(cee.d);
   }
}
