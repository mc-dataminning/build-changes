import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class enj extends elc {
   public static final bqd<dft.c> d = bqd.a(
      new dft.c(btv.i, 10, 2, 3), new dft.c(btv.bx, 5, 4, 4), new dft.c(btv.bq, 8, 5, 5), new dft.c(btv.aN, 2, 5, 5), new dft.c(btv.ap, 3, 4, 4)
   );
   public static final MapCodec<enj> e = a(enj::new);

   public enj(elc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elc.b> a(elc.a $$0) {
      ddm $$1 = $$0.h();
      je $$2 = new je($$1.d(), 64, $$1.e());
      return Optional.of(new elc.b($$2, (Consumer<elu>)($$1x -> a($$1x, $$0))));
   }

   private static void a(elu $$0, elc.a $$1) {
      eni.q $$2 = new eni.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<elg> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         elg $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public ell<?> e() {
      return ell.d;
   }
}
