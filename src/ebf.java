import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ebf extends dyz {
   public static final bij<cut.c> d = bij.a(
      new cut.c(blt.i, 10, 2, 3), new cut.c(blt.bu, 5, 4, 4), new cut.c(blt.bn, 8, 5, 5), new cut.c(blt.aK, 2, 5, 5), new cut.c(blt.am, 3, 4, 4)
   );
   public static final Codec<ebf> e = a(ebf::new);

   public ebf(dyz.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dyz.b> a(dyz.a $$0) {
      csp $$1 = $$0.h();
      hx $$2 = new hx($$1.d(), 64, $$1.e());
      return Optional.of(new dyz.b($$2, (Consumer<dzr>)($$1x -> a($$1x, $$0))));
   }

   private static void a(dzr $$0, dyz.a $$1) {
      ebe.q $$2 = new ebe.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<dzd> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         dzd $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public dzi<?> e() {
      return dzi.d;
   }
}
