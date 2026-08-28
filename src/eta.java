import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eta extends eqt {
   public static final bsm<dkk.c> d = bsm.<dkk.c>b()
      .a(new dkk.c(bwm.o, 2, 3), 10)
      .a(new dkk.c(bwm.bR, 4, 4), 5)
      .a(new dkk.c(bwm.bK, 5, 5), 8)
      .a(new dkk.c(bwm.bf, 5, 5), 2)
      .a(new dkk.c(bwm.az, 4, 4), 3)
      .a();
   public static final MapCodec<eta> e = a(eta::new);

   public eta(eqt.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eqt.b> a(eqt.a $$0) {
      dic $$1 = $$0.h();
      iu $$2 = new iu($$1.d(), 64, $$1.e());
      return Optional.of(new eqt.b($$2, (Consumer<erl>)($$1x -> a($$1x, $$0))));
   }

   private static void a(erl $$0, eqt.a $$1) {
      esz.q $$2 = new esz.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<eqx> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         eqx $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public erc<?> e() {
      return erc.d;
   }
}
