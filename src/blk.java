import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class blk extends bks<cbc> {
   private static final int d = 1200;
   final float c;

   public blk(float $$0) {
      super(ImmutableMap.of(bsc.d, bsd.a), 1200);
      this.c = $$0;
   }

   protected boolean a(akn $$0, cbc $$1) {
      return $$1.dM().g().map($$0x -> $$0x == cda.b || $$0x == cda.c || $$0x == cda.d).orElse(true);
   }

   protected boolean a(akn $$0, cbc $$1, long $$2) {
      return $$1.dM().a(bsc.d);
   }

   protected void b(akn $$0, cbc $$1, long $$2) {
      bku.a($$1, $$1.dM().c(bsc.d).get().b(), this.c, 1);
   }

   protected void c(akn $$0, cbc $$1, long $$2) {
      Optional<hf> $$3 = $$1.dM().c(bsc.d);
      $$3.ifPresent($$1x -> {
         gw $$2x = $$1x.b();
         akn $$3x = $$0.n().a($$1x.a());
         if ($$3x != null) {
            bua $$4 = $$3x.w();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            aay.c($$0, $$2x);
         }
      });
      $$1.dM().b(bsc.d);
   }
}
