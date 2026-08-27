import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bou extends boc<cev> {
   private static final int d = 1200;
   final float c;

   public bou(float $$0) {
      super(ImmutableMap.of(bvn.d, bvo.a), 1200);
      this.c = $$0;
   }

   protected boolean a(and $$0, cev $$1) {
      return $$1.dO().g().map($$0x -> $$0x == cgu.b || $$0x == cgu.c || $$0x == cgu.d).orElse(true);
   }

   protected boolean a(and $$0, cev $$1, long $$2) {
      return $$1.dO().a(bvn.d);
   }

   protected void b(and $$0, cev $$1, long $$2) {
      boe.a($$1, $$1.dO().c(bvn.d).get().b(), this.c, 1);
   }

   protected void c(and $$0, cev $$1, long $$2) {
      Optional<ig> $$3 = $$1.dO().c(bvn.d);
      $$3.ifPresent($$1x -> {
         hx $$2x = $$1x.b();
         and $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            bxm $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            adi.c($$0, $$2x);
         }
      });
      $$1.dO().b(bvn.d);
   }
}
