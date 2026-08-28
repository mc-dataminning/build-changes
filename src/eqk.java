import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eqk extends eod {
   public static final brm<din.c> d = brm.a(
      new din.c(bvi.o, 10, 2, 3), new din.c(bvi.bR, 5, 4, 4), new din.c(bvi.bK, 8, 5, 5), new din.c(bvi.bf, 2, 5, 5), new din.c(bvi.aA, 3, 4, 4)
   );
   public static final MapCodec<eqk> e = a(eqk::new);

   public eqk(eod.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eod.b> a(eod.a $$0) {
      dgf $$1 = $$0.h();
      jh $$2 = new jh($$1.d(), 64, $$1.e());
      return Optional.of(new eod.b($$2, (Consumer<eov>)($$1x -> a($$1x, $$0))));
   }

   private static void a(eov $$0, eod.a $$1) {
      eqj.q $$2 = new eqj.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<eoh> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         eoh $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public eom<?> e() {
      return eom.d;
   }
}
