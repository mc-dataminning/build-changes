import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bwx extends bwf<cnk> {
   private static final int d = 1200;
   final float c;

   public bwx(float $$0) {
      super(ImmutableMap.of(cdq.d, cdr.a), 1200);
      this.c = $$0;
   }

   protected boolean a(arj $$0, cnk $$1) {
      return $$1.dY().g().map($$0x -> $$0x == cpp.b || $$0x == cpp.c || $$0x == cpp.d).orElse(true);
   }

   protected boolean a(arj $$0, cnk $$1, long $$2) {
      return $$1.dY().a(cdq.d);
   }

   protected void b(arj $$0, cnk $$1, long $$2) {
      bwh.a($$1, $$1.dY().c(cdq.d).get().b(), this.c, 1);
   }

   protected void c(arj $$0, cnk $$1, long $$2) {
      Optional<jn> $$3 = $$1.dY().c(cdq.d);
      $$3.ifPresent($$1x -> {
         jf $$2x = $$1x.b();
         arj $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            cfq $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            ago.c($$0, $$2x);
         }
      });
      $$1.dY().b(cdq.d);
   }
}
