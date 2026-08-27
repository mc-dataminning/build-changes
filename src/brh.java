import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class brh extends bqp<chn> {
   private static final int d = 1200;
   final float c;

   public brh(float $$0) {
      super(ImmutableMap.of(bya.d, byb.a), 1200);
      this.c = $$0;
   }

   protected boolean a(apa $$0, chn $$1) {
      return $$1.dM().g().map($$0x -> $$0x == cjn.b || $$0x == cjn.c || $$0x == cjn.d).orElse(true);
   }

   protected boolean a(apa $$0, chn $$1, long $$2) {
      return $$1.dM().a(bya.d);
   }

   protected void b(apa $$0, chn $$1, long $$2) {
      bqr.a($$1, $$1.dM().c(bya.d).get().b(), this.c, 1);
   }

   protected void c(apa $$0, chn $$1, long $$2) {
      Optional<ik> $$3 = $$1.dM().c(bya.d);
      $$3.ifPresent($$1x -> {
         ib $$2x = $$1x.b();
         apa $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            caa $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            aes.c($$0, $$2x);
         }
      });
      $$1.dM().b(bya.d);
   }
}
