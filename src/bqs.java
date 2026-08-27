import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bqs extends bqa<cgy> {
   private static final int d = 1200;
   final float c;

   public bqs(float $$0) {
      super(ImmutableMap.of(bxl.d, bxm.a), 1200);
      this.c = $$0;
   }

   protected boolean a(aow $$0, cgy $$1) {
      return $$1.dO().g().map($$0x -> $$0x == ciy.b || $$0x == ciy.c || $$0x == ciy.d).orElse(true);
   }

   protected boolean a(aow $$0, cgy $$1, long $$2) {
      return $$1.dO().a(bxl.d);
   }

   protected void b(aow $$0, cgy $$1, long $$2) {
      bqc.a($$1, $$1.dO().c(bxl.d).get().b(), this.c, 1);
   }

   protected void c(aow $$0, cgy $$1, long $$2) {
      Optional<ii> $$3 = $$1.dO().c(bxl.d);
      $$3.ifPresent($$1x -> {
         hz $$2x = $$1x.b();
         aow $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            bzl $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            aep.c($$0, $$2x);
         }
      });
      $$1.dO().b(bxl.d);
   }
}
