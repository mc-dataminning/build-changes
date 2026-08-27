import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bij extends bhr<byb> {
   private static final int d = 1200;
   final float c;

   public bij(float $$0) {
      super(ImmutableMap.of(bpb.d, bpc.a), 1200);
      this.c = $$0;
   }

   protected boolean a(aif $$0, byb $$1) {
      return $$1.dK().g().map($$0x -> $$0x == bzz.b || $$0x == bzz.c || $$0x == bzz.d).orElse(true);
   }

   protected boolean a(aif $$0, byb $$1, long $$2) {
      return $$1.dK().a(bpb.d);
   }

   protected void b(aif $$0, byb $$1, long $$2) {
      bht.a($$1, $$1.dK().c(bpb.d).get().b(), this.c, 1);
   }

   protected void c(aif $$0, byb $$1, long $$2) {
      Optional<hd> $$3 = $$1.dK().c(bpb.d);
      $$3.ifPresent($$1x -> {
         gu $$2x = $$1x.b();
         aif $$3x = $$0.n().a($$1x.a());
         if ($$3x != null) {
            bqz $$4 = $$3x.w();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            za.c($$0, $$2x);
         }
      });
      $$1.dK().b(bpb.d);
   }
}
