import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class etu extends ern {
   public static final bsq<dlb.c> d = bsq.<dlb.c>b()
      .a(new dlb.c(bwr.o, 2, 3), 10)
      .a(new dlb.c(bwr.bR, 4, 4), 5)
      .a(new dlb.c(bwr.bK, 5, 5), 8)
      .a(new dlb.c(bwr.bf, 5, 5), 2)
      .a(new dlb.c(bwr.az, 4, 4), 3)
      .a();
   public static final MapCodec<etu> e = a(etu::new);

   public etu(ern.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ern.b> a(ern.a $$0) {
      dir $$1 = $$0.h();
      iv $$2 = new iv($$1.d(), 64, $$1.e());
      return Optional.of(new ern.b($$2, (Consumer<esf>)($$1x -> a($$1x, $$0))));
   }

   private static void a(esf $$0, ern.a $$1) {
      ett.q $$2 = new ett.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<err> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         err $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public erw<?> e() {
      return erw.d;
   }
}
