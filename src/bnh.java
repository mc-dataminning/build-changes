import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bnh extends bmp<ccz> {
   private static final int d = 1200;
   final float c;

   public bnh(float $$0) {
      super(ImmutableMap.of(btz.d, bua.a), 1200);
      this.c = $$0;
   }

   protected boolean a(ama $$0, ccz $$1) {
      return $$1.dN().g().map($$0x -> $$0x == cex.b || $$0x == cex.c || $$0x == cex.d).orElse(true);
   }

   protected boolean a(ama $$0, ccz $$1, long $$2) {
      return $$1.dN().a(btz.d);
   }

   protected void b(ama $$0, ccz $$1, long $$2) {
      bmr.a($$1, $$1.dN().c(btz.d).get().b(), this.c, 1);
   }

   protected void c(ama $$0, ccz $$1, long $$2) {
      Optional<ia> $$3 = $$1.dN().c(btz.d);
      $$3.ifPresent($$1x -> {
         ht $$2x = $$1x.b();
         ama $$3x = $$0.n().a($$1x.a());
         if ($$3x != null) {
            bvx $$4 = $$3x.w();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            aci.c($$0, $$2x);
         }
      });
      $$1.dN().b(btz.d);
   }
}
