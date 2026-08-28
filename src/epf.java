import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class epf extends enl {
   public static final MapCodec<epf> d = a(epf::new);

   public epf(enl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enl.b> a(enl.a $$0) {
      return a($$0, ecr.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(eod $$0, enl.a $$1) {
      ji $$2 = new ji($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new epe.a($$2));
   }

   @Override
   public enu<?> e() {
      return enu.a;
   }
}
