import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eps extends enl {
   public static final bqv<dhv.c> d = bqv.a(
      new dhv.c(bur.o, 10, 2, 3), new dhv.c(bur.bQ, 5, 4, 4), new dhv.c(bur.bJ, 8, 5, 5), new dhv.c(bur.be, 2, 5, 5), new dhv.c(bur.az, 3, 4, 4)
   );
   public static final MapCodec<eps> e = a(eps::new);

   public eps(enl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enl.b> a(enl.a $$0) {
      dfn $$1 = $$0.h();
      ji $$2 = new ji($$1.d(), 64, $$1.e());
      return Optional.of(new enl.b($$2, (Consumer<eod>)($$1x -> a($$1x, $$0))));
   }

   private static void a(eod $$0, enl.a $$1) {
      epr.q $$2 = new epr.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<enp> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         enp $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public enu<?> e() {
      return enu.d;
   }
}
