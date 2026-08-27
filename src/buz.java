import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class buz extends buh<clj> {
   private static final int d = 1200;
   final float c;

   public buz(float $$0) {
      super(ImmutableMap.of(cbs.d, cbt.a), 1200);
      this.c = $$0;
   }

   protected boolean a(aqm $$0, clj $$1) {
      return $$1.dS().g().map($$0x -> $$0x == cnl.b || $$0x == cnl.c || $$0x == cnl.d).orElse(true);
   }

   protected boolean a(aqm $$0, clj $$1, long $$2) {
      return $$1.dS().a(cbs.d);
   }

   protected void b(aqm $$0, clj $$1, long $$2) {
      buj.a($$1, $$1.dS().c(cbs.d).get().b(), this.c, 1);
   }

   protected void c(aqm $$0, clj $$1, long $$2) {
      Optional<iw> $$3 = $$1.dS().c(cbs.d);
      $$3.ifPresent($$1x -> {
         io $$2x = $$1x.b();
         aqm $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            cds $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            aga.c($$0, $$2x);
         }
      });
      $$1.dS().b(cbs.d);
   }
}
