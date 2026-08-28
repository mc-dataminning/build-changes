import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cao extends bzw<cru> {
   private static final int d = 1200;
   final float c;

   public cao(float $$0) {
      super(ImmutableMap.of(chh.d, chi.a), 1200);
      this.c = $$0;
   }

   protected boolean a(asb $$0, cru $$1) {
      return $$1.ec().g().map($$0x -> $$0x == cuc.b || $$0x == cuc.c || $$0x == cuc.d).orElse(true);
   }

   protected boolean a(asb $$0, cru $$1, long $$2) {
      return $$1.ec().a(chh.d);
   }

   protected void b(asb $$0, cru $$1, long $$2) {
      bzy.a($$1, $$1.ec().c(chh.d).get().b(), this.c, 1);
   }

   protected void c(asb $$0, cru $$1, long $$2) {
      Optional<jf> $$3 = $$1.ec().c(chh.d);
      $$3.ifPresent($$1x -> {
         iw $$2x = $$1x.b();
         asb $$3x = $$0.p().a($$1x.a());
         if ($$3x != null) {
            cjh $$4 = $$3x.A();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agx.c($$0, $$2x);
         }
      });
      $$1.ec().b(chh.d);
   }
}
