import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvb extends buj<cll> {
   private static final int d = 1200;
   final float c;

   public bvb(float $$0) {
      super(ImmutableMap.of(cbu.d, cbv.a), 1200);
      this.c = $$0;
   }

   protected boolean a(aqn $$0, cll $$1) {
      return $$1.dS().g().map($$0x -> $$0x == cnn.b || $$0x == cnn.c || $$0x == cnn.d).orElse(true);
   }

   protected boolean a(aqn $$0, cll $$1, long $$2) {
      return $$1.dS().a(cbu.d);
   }

   protected void b(aqn $$0, cll $$1, long $$2) {
      bul.a($$1, $$1.dS().c(cbu.d).get().b(), this.c, 1);
   }

   protected void c(aqn $$0, cll $$1, long $$2) {
      Optional<iw> $$3 = $$1.dS().c(cbu.d);
      $$3.ifPresent($$1x -> {
         io $$2x = $$1x.b();
         aqn $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            cdu $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agb.c($$0, $$2x);
         }
      });
      $$1.dS().b(cbu.d);
   }
}
