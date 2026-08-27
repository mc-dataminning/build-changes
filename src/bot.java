import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bot extends bob<ceu> {
   private static final int d = 1200;
   final float c;

   public bot(float $$0) {
      super(ImmutableMap.of(bvm.d, bvn.a), 1200);
      this.c = $$0;
   }

   protected boolean a(and $$0, ceu $$1) {
      return $$1.dO().g().map($$0x -> $$0x == cgt.b || $$0x == cgt.c || $$0x == cgt.d).orElse(true);
   }

   protected boolean a(and $$0, ceu $$1, long $$2) {
      return $$1.dO().a(bvm.d);
   }

   protected void b(and $$0, ceu $$1, long $$2) {
      bod.a($$1, $$1.dO().c(bvm.d).get().b(), this.c, 1);
   }

   protected void c(and $$0, ceu $$1, long $$2) {
      Optional<ig> $$3 = $$1.dO().c(bvm.d);
      $$3.ifPresent($$1x -> {
         hx $$2x = $$1x.b();
         and $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            bxl $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            adi.c($$0, $$2x);
         }
      });
      $$1.dO().b(bvm.d);
   }
}
