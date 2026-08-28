import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class etp extends eri {
   public static final bsq<dkw.c> d = bsq.<dkw.c>b()
      .a(new dkw.c(bwr.o, 2, 3), 10)
      .a(new dkw.c(bwr.bR, 4, 4), 5)
      .a(new dkw.c(bwr.bK, 5, 5), 8)
      .a(new dkw.c(bwr.bf, 5, 5), 2)
      .a(new dkw.c(bwr.az, 4, 4), 3)
      .a();
   public static final MapCodec<etp> e = a(etp::new);

   public etp(eri.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eri.b> a(eri.a $$0) {
      dio $$1 = $$0.h();
      iv $$2 = new iv($$1.d(), 64, $$1.e());
      return Optional.of(new eri.b($$2, (Consumer<esa>)($$1x -> a($$1x, $$0))));
   }

   private static void a(esa $$0, eri.a $$1) {
      eto.q $$2 = new eto.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<erm> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         erm $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public err<?> e() {
      return err.d;
   }
}
