import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvx extends bvf<cmi> {
   private static final int d = 1200;
   final float c;

   public bvx(float $$0) {
      super(ImmutableMap.of(ccq.d, ccr.a), 1200);
      this.c = $$0;
   }

   protected boolean a(aqt $$0, cmi $$1) {
      return $$1.dU().g().map($$0x -> $$0x == cok.b || $$0x == cok.c || $$0x == cok.d).orElse(true);
   }

   protected boolean a(aqt $$0, cmi $$1, long $$2) {
      return $$1.dU().a(ccq.d);
   }

   protected void b(aqt $$0, cmi $$1, long $$2) {
      bvh.a($$1, $$1.dU().c(ccq.d).get().b(), this.c, 1);
   }

   protected void c(aqt $$0, cmi $$1, long $$2) {
      Optional<jl> $$3 = $$1.dU().c(ccq.d);
      $$3.ifPresent($$1x -> {
         jd $$2x = $$1x.b();
         aqt $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            ceq $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            age.c($$0, $$2x);
         }
      });
      $$1.dU().b(ccq.d);
   }
}
