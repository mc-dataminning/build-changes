import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bza extends byi<cpu> {
   private static final int d = 1200;
   final float c;

   public bza(float $$0) {
      super(ImmutableMap.of(cft.d, cfu.a), 1200);
      this.c = $$0;
   }

   protected boolean a(arn $$0, cpu $$1) {
      return $$1.eb().g().map($$0x -> $$0x == crz.b || $$0x == crz.c || $$0x == crz.d).orElse(true);
   }

   protected boolean a(arn $$0, cpu $$1, long $$2) {
      return $$1.eb().a(cft.d);
   }

   protected void b(arn $$0, cpu $$1, long $$2) {
      byk.a($$1, $$1.eb().c(cft.d).get().b(), this.c, 1);
   }

   protected void c(arn $$0, cpu $$1, long $$2) {
      Optional<jr> $$3 = $$1.eb().c(cft.d);
      $$3.ifPresent($$1x -> {
         jj $$2x = $$1x.b();
         arn $$3x = $$0.p().a($$1x.a());
         if ($$3x != null) {
            cht $$4 = $$3x.A();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agj.c($$0, $$2x);
         }
      });
      $$1.eb().b(cft.d);
   }
}
