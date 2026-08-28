import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eqg extends enl {
   public static final MapCodec<eqg> d = a(eqg::new);

   public eqg(enl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enl.b> a(enl.a $$0) {
      return a($$0, ecr.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(eod $$0, enl.a $$1) {
      $$0.a(new eqf($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public enu<?> e() {
      return enu.o;
   }
}
