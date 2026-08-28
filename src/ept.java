import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ept extends enm {
   public static final bqv<dhw.c> d = bqv.a(
      new dhw.c(bur.o, 10, 2, 3), new dhw.c(bur.bR, 5, 4, 4), new dhw.c(bur.bK, 8, 5, 5), new dhw.c(bur.bf, 2, 5, 5), new dhw.c(bur.aA, 3, 4, 4)
   );
   public static final MapCodec<ept> e = a(ept::new);

   public ept(enm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enm.b> a(enm.a $$0) {
      dfo $$1 = $$0.h();
      ji $$2 = new ji($$1.d(), 64, $$1.e());
      return Optional.of(new enm.b($$2, (Consumer<eoe>)($$1x -> a($$1x, $$0))));
   }

   private static void a(eoe $$0, enm.a $$1) {
      eps.q $$2 = new eps.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<enq> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         enq $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public env<?> e() {
      return env.d;
   }
}
