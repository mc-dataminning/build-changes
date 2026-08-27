import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ebl extends dzf {
   public static final bio<cuz.c> d = bio.a(
      new cuz.c(bly.i, 10, 2, 3), new cuz.c(bly.bu, 5, 4, 4), new cuz.c(bly.bn, 8, 5, 5), new cuz.c(bly.aK, 2, 5, 5), new cuz.c(bly.am, 3, 4, 4)
   );
   public static final Codec<ebl> e = a(ebl::new);

   public ebl(dzf.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzf.b> a(dzf.a $$0) {
      csv $$1 = $$0.h();
      hx $$2 = new hx($$1.d(), 64, $$1.e());
      return Optional.of(new dzf.b($$2, (Consumer<dzx>)($$1x -> a($$1x, $$0))));
   }

   private static void a(dzx $$0, dzf.a $$1) {
      ebk.q $$2 = new ebk.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<dzj> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         dzj $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public dzo<?> e() {
      return dzo.d;
   }
}
